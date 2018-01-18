// http://starwars.wikia.com/wiki/Ziost
// Region : Outer Rim
// Sector : Sith Worlds Sector
// Grid location : R4
// X : 9269.96, Y : 7777.53, Z : -73.49077961557947
Planet	"Ziost/Gateway to the Empire"
{
	ParentBody     "Ziost System"
	Class	       "Desert"

	Mass            2.70294
	Radius          9564.18
	InertiaMoment   0.333674

	RotationPeriod  24.7402
	Obliquity       -89.0435
	EqAscendNode    -159.749

	AlbedoBond      0.354372
	AlbedoGeom      0.425246
	Brightness      2
	Color          (0.495 0.466 0.312)

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Terrestrial"
	}

	Surface
	{
		SurfStyle       0.380159
		OceanStyle      0.775928
		Randomize      (-0.463, -0.763, -0.722)
		colorDistMagn   0.0581073
		colorDistFreq   1304.42
		detailScale     24599.6
		colorConversion true
		drivenDarkening -1
		seaLevel        0.0897953
		snowLevel       0.65
		tropicLatitude  0.999983
		icecapLatitude  1
		icecapHeight    0.108443
		climatePole     0.9375
		climateTropic   0.579365
		climateEquator  0.68254
		heightTempGrad  0.576406
		tropicWidth     0.0862462
		mainFreq        3.4234
		venusFreq       0.85
		venusMagn       0.402894
		mareFreq        0.001
		mareDensity     0
		terraceProb     0.52381
		erosion         0
		montesMagn      0.215531
		montesFreq      222.222
		montesSpiky     0.993251
		montesFraction  0.285714
		dunesMagn       0.0420444
		dunesFreq       81.14
		dunesFraction   0.30945
		hillsMagn       0.103617
		hillsFreq       937.758
		hillsFraction   0
		hills2Fraction  0
		riversMagn      62.3751
		riversFreq      3.56298
		riversSin       6.71868
		riversOctaves   0
		canyonsMagn     0.00822553
		canyonsFreq     100
		canyonFraction  0
		cracksMagn      0.109501
		cracksFreq      1.14596
		cracksOctaves   0
		craterMagn      0.64301
		craterFreq      37.6255
		craterDensity   0.67
		craterOctaves   2
		craterRayedFactor 0
		volcanoMagn     0.682876
		volcanoFreq     0.365079
		volcanoDensity  0.261905
		volcanoOctaves  3
		volcanoActivity 0.333333
		volcanoFlows    0.664751
		volcanoRadius   0.463196
		volcanoTemp     1261.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.43382
		stripeFluct     0
		stripeTwist     0
		cycloneMagn     3.45058
		cycloneFreq     0.911141
		cycloneDensity  0.383114
		cycloneOctaves  2
		colorSea       (0.640, 0.620, 0.420, 0.000)
		colorShelf     (0.680, 0.620, 0.470, 0.000)
		colorBeach     (0.740, 0.730, 0.610, 0.000)
		colorDesert    (0.450, 0.420, 0.380, 0.000)
		colorLowland   (0.530, 0.480, 0.400, 0.000)
		colorUpland    (0.600, 0.540, 0.420, 0.000)
		colorRock      (0.192, 0.143, 0.088, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 0.769)
		colorLowPlants (0.100, 0.160, 0.070, 0.000)
		colorUpPlants  (0.215, 0.215, 0.082, 0.000)
		BumpHeight      18.2417
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		SpecularPower   30
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Clouds
	{
		Height          14.8008
		Velocity        60.2958
		BumpHeight      5.34219
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.09816
		mainOctaves     10
		Coverage        0.208744
		stripeZones     1.43382
		stripeFluct     0
		stripeTwist     0
	}

	Clouds
	{
		Height          20.4795
		Velocity        114.37
		BumpHeight      5.67947
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.09816
		mainOctaves     10
		Coverage        0.208744
		stripeZones     1.43382
		stripeFluct     0
		stripeTwist     0
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Mars"
		Height          68.2062
		Density         1.61123
		Pressure        1.2508
		Greenhouse      19.2596
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.134921
		Saturation      0.539683

		Composition
		{
			N2    	79.5906
			O2    	18.0349
			Ar    	1.31171
			Ne    	0.94868
			CO2   	0.098177
			H2O   	0.015936
		}
	}

	Aurora
	{
		Height      165.227
		NorthLat    61.1844
		NorthLon    -26.323
		NorthRadius 2380.82
		NorthWidth  593.082
		NorthRings  3
		NorthBright 0.3
		NorthParticles 0
		SouthLat    -61.0131
		SouthLon    150.898
		SouthRadius 3362.2
		SouthWidth  1378.84
		SouthRings  2
		SouthBright 0.3
		SouthParticles 0
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.803686
		Period          0.767379
		Eccentricity    0.068146
		Inclination     0.642659
		AscendingNode   -166.448
		ArgOfPericenter 32.8521
		MeanAnomaly     103.522
	}
}



Moon	"Ziost.1"
{
	ParentBody     "Ziost"
	Class	       "Selena"

	Mass            0.00019335
	Radius          366.323
	InertiaMoment   0.398595

	Oblateness      0.00702843

	Obliquity       -0.780576
	EqAscendNode    27.1631
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.567 0.559 0.555)

	Surface
	{
		SurfStyle       0.754948
		OceanStyle      0.428136
		Randomize      (-0.715, 0.446, 0.502)
		colorDistMagn   0.0445965
		colorDistFreq   103.233
		detailScale     2228.23
		colorConversion true
		drivenDarkening 0
		seaLevel        0.200802
		snowLevel       2
		tropicLatitude  0.0264822
		icecapLatitude  10
		icecapHeight    0.165134
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.07537
		venusFreq       1.52608
		venusMagn       0
		mareFreq        0.210056
		mareDensity     0.00212477
		terraceProb     0.244766
		erosion         0
		montesMagn      0.0613956
		montesFreq      40.2009
		montesSpiky     0.785686
		montesFraction  0.0788434
		dunesMagn       0.0447403
		dunesFreq       1130.16
		dunesFraction   0.0543957
		hillsMagn       0.113588
		hillsFreq       79.184
		hillsFraction   0.216697
		hills2Fraction  0
		riversMagn      67.7854
		riversFreq      2.06079
		riversSin       7.02731
		riversOctaves   0
		canyonsMagn     0.602602
		canyonsFreq     0.25788
		canyonFraction  0.95217
		cracksMagn      0.0482597
		cracksFreq      0.560483
		cracksOctaves   0
		craterMagn      0.596579
		craterFreq      2.8278
		craterDensity   0.623149
		craterOctaves   7.73776
		craterRayedFactor 0.173727
		volcanoMagn     0.194564
		volcanoFreq     0.669902
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.238699
		volcanoRadius   0.143673
		volcanoTemp     1481.19
		lavaCoverTidal  0.25136
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.470, 0.400, 0.340, 0.000)
		colorShelf     (0.640, 0.600, 0.470, 0.000)
		colorBeach     (0.357, 0.341, 0.267, 0.000)
		colorDesert    (0.380, 0.346, 0.272, 0.000)
		colorLowland   (0.312, 0.257, 0.217, 0.000)
		colorUpland    (0.442, 0.397, 0.289, 0.000)
		colorRock      (0.300, 0.260, 0.220, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000223731
		Eccentricity    0.0389348
		Inclination     -0.780576
		AscendingNode   27.1631
		ArgOfPericenter -75.048
		MeanAnomaly     -102.266
	}
}



Moon	"Ziost.2"
{
	ParentBody     "Ziost"
	Class	       "Selena"

	Mass            0.0193727
	Radius          1840.63
	InertiaMoment   0.353542

	Obliquity       -1.2539
	EqAscendNode    110.07
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.530 0.523 0.517)

	Surface
	{
		SurfStyle       0.0497094
		OceanStyle      0.834281
		Randomize      (-0.916, -0.014, 0.230)
		colorDistMagn   0.0562699
		colorDistFreq   253.418
		detailScale     5248.62
		colorConversion true
		drivenDarkening 0
		seaLevel        0.210838
		snowLevel       2
		tropicLatitude  0.0250792
		icecapLatitude  10
		icecapHeight    0.095335
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.91104
		venusFreq       1.5891
		venusMagn       0
		mareFreq        1.11001
		mareDensity     0.0105819
		terraceProb     0.25311
		erosion         0
		montesMagn      0.0871948
		montesFreq      103.28
		montesSpiky     0.917347
		montesFraction  0.422416
		dunesMagn       0.0421451
		dunesFreq       2681.63
		dunesFraction   0.847385
		hillsMagn       0.143542
		hillsFreq       225.493
		hillsFraction   0.596187
		hills2Fraction  0
		riversMagn      66.2153
		riversFreq      2.69768
		riversSin       5.09125
		riversOctaves   0
		canyonsMagn     0.474234
		canyonsFreq     0.782645
		canyonFraction  0.00399549
		cracksMagn      0.05056
		cracksFreq      0.74259
		cracksOctaves   0
		craterMagn      0.594579
		craterFreq      5.77366
		craterDensity   0.955608
		craterOctaves   11
		craterRayedFactor 0.107958
		volcanoMagn     0.353528
		volcanoFreq     0.602824
		volcanoDensity  0.243652
		volcanoOctaves  3
		volcanoActivity 0.0703951
		volcanoFlows    0.352682
		volcanoRadius   0.279121
		volcanoTemp     1410.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.320, 0.320, 0.000)
		colorShelf     (0.370, 0.370, 0.370, 0.000)
		colorBeach     (0.265, 0.262, 0.259, 0.000)
		colorDesert    (0.329, 0.314, 0.295, 0.200)
		colorLowland   (0.355, 0.335, 0.331, 0.500)
		colorUpland    (0.371, 0.351, 0.341, 0.800)
		colorRock      (0.650, 0.610, 0.620, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000358167
		Eccentricity    0.0144652
		Inclination     -1.2539
		AscendingNode   110.07
		ArgOfPericenter 352.107
		MeanAnomaly     314.818
	}
}