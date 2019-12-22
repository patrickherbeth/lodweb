package cenario;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.sun.jersey.server.impl.model.parameter.multivalued.StringReaderProviders.TypeValueOf;

import database.CategoriesQuery;
import database.CategoriesTagQuery;
import database.DBFunctions;
import database.TagsQuery;
import model.Document;
import model.Ratings;
import model.Tag;
import movietagging.Category;
import movietagging.CategoryTag;
import movietagging.Evaluation;
import node.SparqlWalk;
import tagging.PreProcessingText;
import tagging.RecommenderContext;
import tagging.TaggingFactory;
import util.StringUtilsNode;

public class CreateCenario {

	public static void main(String[] args) {

	/*
		
		TagsQuery tagsQuery = new TagsQuery();
		CategoriesQuery categoriesQuery = new CategoriesQuery();

		ArrayList<Tag> tags = tagsQuery.getAll();

		Set<String> newCategories = new HashSet<>();
		
		
		for (Tag tag : tags) {
			List<String> categoriesString = SparqlWalk.getLiteralByUri("http://dbpedia.org/resource/"
					+ StringUtilsNode.configureNameTagWithOutCharacterWithUnderLine(tag.getName()));

			for (String testTag : categoriesString) {
				newCategories.add(testTag);
			}
			
			System.out.println(tag.getId());
		}
		
		
		String newCategoriesValues = "";
		
		for(String category : newCategories) {
			newCategoriesValues += "(\"" + category + "\"),";
		}
		
		String newStr = newCategoriesValues.substring(0, newCategoriesValues.length() - 1) + ";";

		categoriesQuery.addNewCategories(newStr);
		
*/				
		//fim
		
		
		//ArrayList<Integer> listUsers2 = new ArrayList<>();
		
		//listUsers2.add(11);
		//listUsers2.add(96);
		
		/*Integer[] listUsers2 = { 1827,1828,
				1829
				,1830
				,1831
				,1832
				,1833
				,1834
				,1835
				,1836
				,1837
				,1838
				,1839
				,1840
				,1841
				,1842
				,1843
				,1844
				,1845
				,1846
				,1847
				,1848
				,1849
				,1850
				,1851
				,1852
				,1853
				,1854
				,1855
				,1856
				,1857
				,1858
				,1859
				,1860
				,1861
				,1862
				,1863
				,1864
				,1865
				,1866
				,1867
				,1868
				,1869
				,1870
				,1871
				,1872
				,1873
				,1874
				,1875
				,1876
				,1877
				,1878
				,1879
				,1880
				,1881
				,1882
				,1883
				,1884
				,1885
				,1886
				,1887
				,1888
				,1889
				,1890
				,1891
				,1892
				,1893
				,1894
				,1895
				,1896
				,1897
				,1898
				,1899
				,1900
				,1901
				,1902
				,1903
				,1904
				,1905
				,1906
				,1907
				,1908
				,1909
				,1910
				,1911
				,1912
				,1913
				,1914
				,1915
				,1916
				,1917
				,1918
				,1919
				,1920
				,1921
				,1922
				,1923
				,1924
				,1925
				,1926
				,1927
				,1928
				,1929
				,1930
				,1931
				,1932
				,1933
				,1934
				,1935
				,1936
				,1937
				,1938
				,1939
				,1940
				,1941
				,1942
				,1943
				,1944
				,1945
				,1946
				,1947
				,1948
				,1949
				,1950
				,1951
				,1952
				,1953
				,1954
				,1955
				,1956
				,1957
				,1958
				,1959
				,1960
				,1961
				,1962
				,1963
				,1964
				,1965
				,1966
				,1967
				,1968
				,1969
				,1970
				,1971
				,1972
				,1973
				,1974
				,1975
				,1976
				,1977
				,1978
				,1979
				,1980
				,1981
				,1982
				,1983
				,1984
				,1985
				,1986
				,1987
				,1988
				,1989
				,1990
				,1991
				,1992
				,1993
				,1994 
				1995
				,1996
				,1997
				,1998
				,1999
				,2000
				,2001
				,2002
				,2003
				,2004
				,2005
				,2006
				,2007
				,2008
				,2009
				,2010
				,2011
				,2012
				,2013
				,2014
				,2015
				,2016
				,2017
				,2018
				,2019
				,2020
				,2021
				,2022
				,2023
				,2024
				,2025
				,2026
				,2027
				,2028
				,2029
				,2030
				,2031
				,2032
				,2033
				,2034
				,2035
				,2036
				,2037 
				,2038
				,2039
				,2040
				,2041
				,2042
				,2043
				,2044
				,2045
				,2046
				,2047
				,2048
				,2049
				,2050
				,2051
				,2052
				,2053
				,2054
				,2055
				,2056
				,2057
				,2058
				,2059
				,2060
				,2061
				,2062
				,2063 
				2064
				,2065
				,2066
				,2067
				,2068
				,2069
				,2070
				,2071
				,2072
				,2073
				,2074
				,2075
				,2076
				,2077
				,2078
				,2079
				,2080
				,2081
				,2082
				,2083
				,2084
				,2085
				,2086
				,2087
				,2088
				,2089
				,2090
				,2091
				,2092
				,2093
				,2094
				,2095
				,2096
				,2097
				,2098
				,2099
				,2100
				,2101
				,2102
				,2103
				,2104
				,2105
				,2106
				,2107
				,2108
				,2109
				,2110
				,2111
				,2112
				,2113
				,2114
				,2115
				,2116
				,2117
				,2118
				,2119
				,2120
				,2121
				,2122
				,2123
				,2124
				,2125
				,2126
				,2127
				,2128
				,2129
				,2130
				,2131
				,2132
				,2133
				,2134
				,2135
				,2136
				,2137
				,2138
				,2139
				,2140
				,2141
				,2142
				,2143
				,2144
				,2145
				,2146
				,2147
				,2148
				,2149
				,2150
				,2151
				,2152
				,2153
				,2154
				,2155
				,2156
				,2157
				,2158
				,2159
				,2160
				,2161 
				2162
				,2163
				,2164
				,2165
				,2166
				,2167
				,2168
				,2169
				,2170
				,2171
				,2172
				,2173
				,2174
				,2175
				,2176
				,2177
				,2178
				,2179
				,2180
				,2181
				,2182
				,2183
				,2184
				,2185
				,2186
				,2187
				,2188
				,2189 
				2190
				,2191
				,2192
				,2193
				,2194
				,2195
				,2196
				,2197
				,2198
				,2199
				,2200
				,2201
				,2202
				,2203
				,2204
				,2205
				,2206
				,2207
				,2208
				,2209
				,2210
				,2211
				,2212
				,2213
				,2214
				,2215
				,2216
				,2217
				,2218
				,2219
				,2220
				,2221
				,2222
				,2223
				,2224
				,2225
				,2226
				,2227
				,2228
				,2229
				,2230
				,2231
				,2232
				,2233
				,2234
				,2235
				,2236
				,2237
				,2238
				,2239
				,2240
				,2241
				,2242
				,2243
				,2244
				,2245
				,2246
				,2247
				,2248
				,2249
				,2250
				,2251
				,2252
				,2253
				,2254
				,2255
				,2256
				,2257
				,2258
				,2259
				,2260
				,2261
				,2262
				,2263
				,2264
				,2265
				,2266
				,2267
				,2268
				,2269
				,2270
				,2271
				,2272
				,2273
				,2274
				,2275
				,2276
				,2277
				,2278
				,2279
				,2280
				,2281
				,2282
				,2283
				,2284
				,2285
				,2286
				,2287
				,2288
				,2289
				,2290
				,2291
				,2292
				,2293
				,2294
				,2295
				,2296
				,2297
				,2298
				,2299
				,2300
				,2301
				,2302
				,2303
				,2304
				,2305
				,2306
				,2307
				,2308
				,2309
				,2310
				,2311
				,2312
				,2313
				,2314
				,2315
				,2316
				,2317
				,2318
				,2319
				,2320
				,2321
				,2322
				,2323
				,2324
				,2325
				,2326
				,2327
				,2328
				,2329
				,2330
				,2331
				,2332
				,2333
				,2334
				,2335
				,2336
				,2337
				,2338
				,2339
				,2340
				,2341
				,2342
				,2343
				,2344
				,2345
				,2346
				,2347
				,2348
				,2349
				,2350
				,2351
				,2352
				,2353
				,2354
				,2355
				,2356
				,2357
				,2358
				,2359
				,2360
				,2361
				,2362
				,2363
				,2364
				,2365
				,2366
				,2367
				,2368
				,2369
				,2370
				,2371
				,2372
				,2373
				,2374
				,2375
				,2376
				,2377
				,2378
				,2379
				,2380
				,2381
				,2382
				,2383
				,2384
				,2385
				,2386
				,2387
				,2388
				,2389
				,2390
				,2391
				,2392
				,2393
				,2394
				,2395
				,2396
				,2397
				,2398
				,2399
				,2400
				,2401
				,2402
				,2403
				,2404
				,2405
				,2406
				,2407
				,2408
				,2409
				,2410
				,2411
				,2412
				,2413
				,2414
				,2415
				,2416
				,2417
				,2418
				,2419
				,2420
				,2421
				,2422
				,2423
				,2424
				,2425
				,2426
				,2427
				,2428
				,2429
				,2430
				,2431
				,2432
				,2433
				,2434
				,2435
				,2436
				,2437
				,2438
				,2439
				,2440
				,2441
				,2442
				,2443
				,2444
				,2445
				,2446
				,2447
				,2448
				,2449
				,2450
				,2451
				,2452
				,2453
				,2454
				,2455
				,2456
				,2457
				,2458
				,2459
				,2460
				,2461
				,2462
				,2463
				,2464
				,2465
				,2466
				,2467
				,2468
				,2469
				,2470
				,2471
				,2472
				,2473
				,2474
				,2475
				,2476
				,2477
				,2478
				,2479
				,2480
				,2481
				,2482
				,2483
				,2484
				,2485
				,2486
				,2487
				,2488
				,2489
				,2490
				,2491
				,2492
				,2493
				,2494
				,2495
				,2496
				,2497
				,2498
				,2499
				,2500
				,2501
				,2502
				,2503
				,2504
				,2505
				,2506
				,2507
				,2508
				,2509
				,2510
				,2511
				,2512
				,2513
				,2514
				,2515
				,2516
				,2517
				,2518
				,2519
				,2520
				,2521
				,2522
				,2523
				,2524
				,2525
				,2526
				,2527
				,2528
				,2529
				,2530
				,2531
				,2532
				,2533
				,2534
				,2535
				,2536
				,2537
				,2538
				,2539
				,2540
				,2541
				,2542
				,2543
				,2544
				,2545
				,2546
				,2547
				,2548
				,2549
				,2550
				,2551
				,2552
				,2553
				,2554
				,2555
				,2556
				,2557
				,2558
				,2559
				,2560
				,2561
				,2562
				,2563
				,2564
				,2565
				,2566
				,2567
				,2568
				,2569
				,2570
				,2571
				,2572
				,2573
				,2574
				,2575
				,2576
				,2577
				,2578
				,2579
				,2580
				,2581
				,2582
				,2583
				,2584
				,2585
				,2586
				,2587
				,2588
				,2589
				,2590
				,2591
				,2592
				,2593
				,2594
				,2595
				,2596
				,2597
				,2598
				,2599
				,2600
				,2601
				,2602
				,2603
				,2604
				,2605
				,2606
				,2607
				,2608
				,2609
				,2610
				,2611
				,2612
				,2613
				,2614
				,2615
				,2616
				,2617
				,2618
				,2619
				,2620
				,2621
				,2622
				,2623
				,2624
				,2625
				,2626
				,2627
				,2628
				,2629
				,2630
				,2631
				,2632
				,2633
				,2634
				,2635
				,2636
				,2637
				,2638
				,2639
				,2640
				,2641
				,2642
				,2643
				,2644
				,2645
				,2646
				,2647
				,2648
				,2649
				,2650
				,2651
				,2652
				,2653
				,2654
				,2655
				,2656
				,2657
				,2658
				,2659
				,2660
				,2661
				,2662
				,2663
				,2664
				,2665
				,2666
				,2667
				,2668
				,2669
				,2670
				,2671
				,2672
				,2673
				,2674
				,2675
				,2676
				,2677
				,2678
				,2679
				,2680
				,2681
				,2682
				,2683
				,2684
				,2685
				,2686
				,2687
				,2688
				,2689
				,2690
				,2691
				,2692
				,2693
				,2694
				,2695
				,2696
				,2697
				,2698
				,2699
				,2700
				,2701
				,2702
				,2703
				,2704
				,2705
				,2706
				,2707
				,2708
				,2709
				,2710
				,2711
				,2712
				,2713
				,2714
				,2715
				,2716
				,2717
				,2718
				,2719
				,2720
				,2721
				,2722
				,2723 ,2724, 2725, 2726}; */
				
		
		Integer[] listUsers2 = { /*11, 96, 121, 129, 133, 190, 205, 208, 271, 279, 316,
				 318, 320,342, 348, 359, 370, 395, 409, 451, 460, 469, 471, 482, 489, 500,
				 505, 534, 540, 558 , 570, 586, 619, 631, 662, 693, 694, 700, 707, 729, 739,
				 741, 768, 770, 786, 787, 819, 829, 858, 887, 888, 910, 964, 969, 971, 975,
				 1015, 1166, 1244, 1268, 1271, 1277, 1288, 1339, 1376, 1387, 1408, 1418, 1447,
				 1453, 1469, 1483, 1486, 1507, 1515, 1516, 1518, 1523, 1584, 1587, 1588, 1593,
				 1602, 1616, 1619, 1623, 1629, 1644, 1662, 1678, 1686, 1705, 1719, 1738, 1741,
				 1755, 1763, 1775, 1816, 1826, */ 1827,1828, 1829,1830, 1831, 1832, 1833, 1834, 
				 1835, 1836, 1837, 1838, 1839, 1840, 1841, 1842, 1843, 1844, 1845};
		
		
		
		
		
		
		for (int idUser : listUsers2) {
			
			
			
			// FORMULA 1
			PreProcessingText preProcessingText = new PreProcessingText(idUser).startF1();
			preProcessingText.getFormula1();
			PreProcessingText preProcessingText_1 = new PreProcessingText(idUser).startF1();
			preProcessingText_1.getFormula1();
			PreProcessingText preProcessingText_3 = new PreProcessingText(idUser).startF1();
			preProcessingText_3.getFormula1();
			TaggingFactory.createRecomedationSystem(preProcessingText.getUserMovie().getMoviesViewed(), preProcessingText.getUserMovie().getRecommendedMovies(), idUser, "FORMULA1");
			
			// FORMULA 2
			
			PreProcessingText preProcessingText2 = new PreProcessingText(idUser).startF2();
			preProcessingText2.getFormula2();
			PreProcessingText preProcessingText2_2 = new PreProcessingText(idUser).startF2();
			preProcessingText2_2.getFormula2();
			PreProcessingText preProcessingText2_3 = new PreProcessingText(idUser).startF2();
			preProcessingText2_3.getFormula2();
			TaggingFactory.createRecomedationSystem(preProcessingText2.getUserMovie().getMoviesViewed(), preProcessingText2.getUserMovie().getRecommendedMovies(), idUser, "FORMULA2");
			
			
			// WUP
			PreProcessingText preProcessingText3 = new PreProcessingText(idUser).startF2();
			preProcessingText2.getWUP();
			TaggingFactory.createRecomedationSystem(preProcessingText3.getUserMovie().getMoviesViewed(), preProcessingText3.getUserMovie().getRecommendedMovies(), idUser, "WUP");
			

		}
		
	
		
		/*

		DBFunctions dbFunctions = new DBFunctions();

		 Integer[] listUsers1 = { 11, 96, 121, 129, 133, 190, 205, 208, 271, 279, 316,
		 318, 320, 342, 348, 359, 370, 395, 409, 451, 460, 469, 471, 482, 489, 500,
		 505, 534, 540, 558 , 570, 586, 619, 631, 662, 693, 694, 700, 707, 729, 739,
		 741, 768, 770, 786, 787, 819, 829, 858, 887, 888, 910, 964, 969, 971, 975,
		 1015, 1166, 1244, 1268, 1271, 1277, 1288, 1339, 1376, 1387, 1408, 1418, 1447,
		 1453, 1469, 1483, 1486, 1507, 1515, 1516, 1518, 1523, 1584, 1587, 1588, 1593,
		 1602, 1616, 1619, 1623, 1629, 1644, 1662, 1678, 1686, 1705, 1719, 1738, 1741,
		 1755, 1763, 1775, 1816, 1826};

		

		String textouserModel = "";
		String textoTestModel = "";
		int limitMin = 10;
		int limitMax = 0;
		int limitTAg = 5;

		for (int i = 0; i < listUsers1.length; i++) {

			textouserModel = "";
			textoTestModel = "";
			List<Integer> userModel = dbFunctions.createUserModel(listUsers1[i], 5);

			ArrayList<Tag> listaTags = dbFunctions.getNameOfTagsOfFilms(userModel, limitTAg);
			for (Tag tag : listaTags) {
				if (tag.getName() != null) {

					textouserModel = textouserModel + tag.getName() + ",";
				}
				// for(String tags: Sinonyms.getSinonymous(tag.getName())) {
				// textouserModel = textouserModel + tags + ",";
				// }
			}

			System.out.println(textouserModel);

			List<Ratings> testSet = new ArrayList<Ratings>();
			// preenche duas lista de filmes no total de 50 uma lista com 30 filmes >=4
			// rating e outra com 20 <=3
			testSet = DBFunctions.createTestSet(listUsers1[i], limitMin, limitMax, 4);
			List<Integer> testSetList = TaggingFactory.createTestSetList(testSet);

			for (int j = 0; j < testSetList.size(); j++) {

				List<Integer> tagsTestSet = dbFunctions.findTagOfDocumentWithLimitTag(testSetList.get(j), 5);
				textoTestModel = "";
				for (int valor : tagsTestSet) {
					if (DBFunctions.findTagById(valor) != null) {
						textoTestModel = textoTestModel + DBFunctions.findTagById(valor) + ",";
					}
				}
				dbFunctions.insertOrUpdateCenario(listUsers1[i], textouserModel, textoTestModel, testSetList.get(j));
			}
		}
	*/
	}

}