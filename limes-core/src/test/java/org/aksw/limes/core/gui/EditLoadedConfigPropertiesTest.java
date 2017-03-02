package org.aksw.limes.core.gui;

import java.io.File;
import java.util.Locale;

import org.aksw.limes.core.gui.controller.MainController;
import org.aksw.limes.core.gui.util.CustomGuiTest;
import org.aksw.limes.core.gui.view.MainView;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testfx.framework.junit.ApplicationTest;

import javafx.stage.Stage;

public class EditLoadedConfigPropertiesTest extends ApplicationTest{

	private static final Logger logger = LoggerFactory.getLogger(EditLoadedConfigPropertiesTest.class);
	MainView mainView;
	MainController mainController;

	@Override
	public void start(Stage stage) throws Exception {
		Locale.setDefault(new Locale("en", "US"));
		mainView = new MainView(stage);
		mainController = new MainController(mainView);
		mainView.setController(mainController);
	}
	
	@Before
	public void loadConfig(){
		mainController.loadConfig(new File(Thread.currentThread().getContextClassLoader().getResource("gui/testConfig.xml").getFile()));
	}
	
	@BeforeClass
	public static void setup(){
        System.setProperty("testfx.robot", "glass");
        System.setProperty("testfx.headless", "true");
        System.setProperty("prism.order", "sw");
        System.setProperty("prism.text", "t2k");
        System.setProperty("java.awt.headless", "true");
	}
	
	@Test
	public void testEditProperties(){
		logger.debug("Clicking on Configuration");
		clickOn("Configuration");
		logger.debug("Clicking on Edit");
		clickOn("Edit");
		//Necessary because otherwise the sub-menu vanishes
		logger.debug("Moving to Edit Classes");
		moveTo("Edit Classes");
		logger.debug("Clicking on Edit Properties");
		clickOn("Edit Properties");

		logger.debug("Waiting for #sourcePropList");
		CustomGuiTest.waitUntilNodeIsVisible("#sourcePropList", 15);
		clickOn("#sourcePropList");
		clickOn("#targetPropList");
		clickOn("Finish");
	}
	
}
