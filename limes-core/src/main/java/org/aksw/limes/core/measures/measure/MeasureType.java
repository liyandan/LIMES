package org.aksw.limes.core.measures.measure;
/**
 * Implements the measure type class. It includes all measure included in LIMES.
 *
 * @author Mohamed Sherif (sherif@informatik.uni-leipzig.de)
 * @author Kleanthi Georgala (georgala@informatik.uni-leipzig.de)
 * @version 1.0
 */
public enum MeasureType {
    GEO_ORTHODROMIC, GEO_GREAT_ELLIPTIC, GEO_HAUSDORFF, GEO_NAIVE_HAUSDORFF, GEO_INDEXED_HAUSDORFF, GEO_FAST_HAUSDORFF, GEO_SYMMETRIC_HAUSDORFF,
    GEO_CENTROID_INDEXED_HAUSDORFF, GEO_SCAN_INDEXED_HAUSDORFF, GEO_SCAN__INDEXED_HAUSDORFF, GEO_MIN, GEO_MAX,
    GEO_AVG, GEO_SUM_OF_MIN, GEO_LINK, GEO_QUINLAN, GEO_FRECHET,
    GEO_NAIVE_SURJECTION, GEO_FAIR_SURJECTION, GEO_MEAN,
    TMP_EQUALS, TMP_IS_OVERLAPPED_BY, TMP_OVERLAPS, TMP_DURING,
    TMP_DURING_REVERSE, TMP_IS_STARTED_BY, TMP_STARTS, TMP_IS_FINISHED_BY,
    TMP_FINISHES, TMP_IS_MET_BY, TMP_MEETS, TMP_AFTER,
    TMP_BEFORE, TMP_CONCURRENT, TMP_PREDECESSOR, TMP_SUCCESSOR,
    COSINE, EXACTMATCH, JACCARD, JARO, LEVENSHTEIN, OVERLAP,
    TRIGRAM, QGRAMS, SOUNDEX, EUCLIDEAN, MANHATTAN, JAROWINKLER, MONGEELKAN, RATCLIFF,
    TOP_EQUALS, TOP_DISJOINT, TOP_INTERSECTS, TOP_OVERLAPS, TOP_CROSSES, TOP_CONTAINS, TOP_WITHIN, TOP_TOUCHES, TOP_COVERS, TOP_COVERED_BY,
    SET_JACCARD
}