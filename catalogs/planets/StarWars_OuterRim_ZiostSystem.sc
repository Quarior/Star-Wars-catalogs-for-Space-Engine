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
		craterDensity   0.67		craterOctaves   2		craterRayedFactor 0
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
		SemiMajorAxis   0.000358167		Eccentricity    0.0144652
		Inclination     -1.2539
		AscendingNode   110.07
		ArgOfPericenter 352.107
		MeanAnomaly     314.818
	}
}




Asteroid	"S1"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            5.70417e-010
	Radius          4.99266
	InertiaMoment   0.399551

	Obliquity       -1.0684
	EqAscendNode    176.049
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.582 0.527 0.477)

	Surface
	{
		SurfStyle       0.46482
		OceanStyle      0.335831
		Randomize      (-0.611, -0.835, 0.550)
		colorDistMagn   0.593519
		colorDistFreq   0.00307793
		detailScale     136.333
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00129187
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.687536
		terraceProb     0.214823
		erosion         0
		montesMagn      0.524488
		montesFreq      2.70346
		montesSpiky     0.876406
		montesFraction  0.794587
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0684526
		hillsFraction   0.562665
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25844
		craterFreq      0.261702
		craterDensity   0.852011
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.410623
		volcanoTemp     1309
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.233, 0.211, 0.191, 0.000)
		colorShelf     (0.247, 0.224, 0.203, 0.000)
		colorBeach     (0.262, 0.237, 0.215, 0.000)
		colorDesert    (0.276, 0.250, 0.227, 0.000)
		colorLowland   (0.291, 0.263, 0.239, 0.000)
		colorUpland    (0.305, 0.276, 0.251, 0.000)
		colorRock      (0.320, 0.290, 0.262, 0.000)
		colorSnow      (0.335, 0.303, 0.274, 1.000)
		BumpHeight      4.49339
		BumpOffset      0.898678
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.113215
		Period          0.0405729
		Eccentricity    0.0590083
		Inclination     -1.0684
		AscendingNode   176.049
		ArgOfPericenter 81.459
		MeanAnomaly     82.6621
	}
}

Asteroid	"S2"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            3.34171e-018
	Radius          0.00900047
	InertiaMoment   0.397312

	RotationPeriod  884.196
	Obliquity       -6.59639
	EqAscendNode    31.9612

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.595 0.592 0.590)

	Surface
	{
		SurfStyle       0.685566
		OceanStyle      0.303517
		Randomize      (0.783, 0.074, -0.301)
		colorDistMagn   0.349717
		colorDistFreq   4.84406e-008
		detailScale     0.245773
		colorConversion true
		snowLevel       2
		tropicLatitude  0.21952
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.479102
		terraceProb     0.553735
		erosion         0
		montesMagn      0.531254
		montesFreq      3.14028
		montesSpiky     0.917062
		montesFraction  0.62635
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.29455e-007
		hillsFraction   0.660029
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.265461
		craterFreq      0.22771
		craterDensity   0.808149
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.541125
		volcanoTemp     1765.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.232, 0.201, 0.165, 0.000)
		colorShelf     (0.238, 0.207, 0.189, 0.000)
		colorBeach     (0.280, 0.243, 0.224, 0.000)
		colorDesert    (0.303, 0.260, 0.218, 0.000)
		colorLowland   (0.333, 0.278, 0.248, 0.000)
		colorUpland    (0.369, 0.337, 0.301, 0.000)
		colorRock      (0.399, 0.367, 0.324, 0.000)
		colorSnow      (0.434, 0.391, 0.342, 1.000)
		BumpHeight      0.00810042
		BumpOffset      0.00162008
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.130887
		Period          0.0504344
		Eccentricity    0.179311
		Inclination     -6.59639
		AscendingNode   31.9612
		ArgOfPericenter -61.1939
		MeanAnomaly     64.5913
	}
}

Asteroid	"S3"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            4.9175e-015
	Radius          0.114991
	InertiaMoment   0.398761

	Obliquity       -1.18972
	EqAscendNode    27.8832
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.533 0.528 0.522)

	Surface
	{
		SurfStyle       0.216963
		OceanStyle      0.161116
		Randomize      (0.849, -0.698, 0.599)
		colorDistMagn   0.815514
		colorDistFreq   9.07976e-006
		detailScale     3.14001
		colorConversion true
		snowLevel       2
		tropicLatitude  0.040295
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.629728
		terraceProb     0.243981
		erosion         0
		montesMagn      0.387962
		montesFreq      3.3623
		montesSpiky     0.842713
		montesFraction  0.55679
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.58693e-005
		hillsFraction   0.860597
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25923
		craterFreq      0.273469
		craterDensity   0.964407
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.409146
		volcanoTemp     1519.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.213, 0.211, 0.209, 0.000)
		colorShelf     (0.226, 0.224, 0.222, 0.000)
		colorBeach     (0.240, 0.238, 0.235, 0.000)
		colorDesert    (0.253, 0.251, 0.248, 0.000)
		colorLowland   (0.266, 0.264, 0.261, 0.000)
		colorUpland    (0.280, 0.277, 0.274, 0.000)
		colorRock      (0.293, 0.290, 0.287, 0.000)
		colorSnow      (0.306, 0.304, 0.300, 1.000)
		BumpHeight      0.103492
		BumpOffset      0.0206983
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.110588
		Period          0.0391689
		Eccentricity    0.0366535
		Inclination     -1.18972
		AscendingNode   27.8832
		ArgOfPericenter -0.146671
		MeanAnomaly     -122.502
	}
}

Asteroid	"S4"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            7.23636e-012
	Radius          1.48834
	InertiaMoment   0.39973

	Obliquity       3.22308
	EqAscendNode    -151.207
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.578 0.573 0.568)

	Surface
	{
		SurfStyle       0.997143
		OceanStyle      0.0903684
		Randomize      (0.232, -0.059, -0.876)
		colorDistMagn   0.694038
		colorDistFreq   0.000821262
		detailScale     40.6417
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0279554
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.383485
		terraceProb     0.377836
		erosion         0
		montesMagn      0.414678
		montesFreq      3.77828
		montesSpiky     0.790627
		montesFraction  0.453566
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00701761
		hillsFraction   0.910161
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.210943
		craterFreq      0.184667
		craterDensity   1.03052
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.601627
		volcanoTemp     1648.82
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.196, 0.201, 0.227, 0.050)
		colorShelf     (0.231, 0.235, 0.261, 0.040)
		colorBeach     (0.266, 0.269, 0.295, 0.030)
		colorDesert    (0.300, 0.304, 0.335, 0.020)
		colorLowland   (0.335, 0.338, 0.369, 0.030)
		colorUpland    (0.370, 0.372, 0.403, 0.050)
		colorRock      (0.404, 0.407, 0.449, 0.020)
		colorSnow      (0.404, 0.407, 0.449, 1.000)
		BumpHeight      1.33951
		BumpOffset      0.267902
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.112174
		Period          0.0400147
		Eccentricity    0.0502772
		Inclination     3.22308
		AscendingNode   -151.207
		ArgOfPericenter 17.7048
		MeanAnomaly     106.235
	}
}

Asteroid	"S5"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.06487e-008
	Radius          13.2438
	InertiaMoment   0.397696

	RotationPeriod  2503.77
	Obliquity       -2.56977
	EqAscendNode    69.4058

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.424 0.422 0.419)

	Surface
	{
		SurfStyle       0.0897074
		OceanStyle      0.502555
		Randomize      (-0.069, -0.820, 0.257)
		colorDistMagn   0.580722
		colorDistFreq   0.132187
		detailScale     361.645
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0736707
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.41055
		terraceProb     0.162654
		erosion         0
		montesMagn      0.506524
		montesFreq      2.78891
		montesSpiky     0.887437
		montesFraction  0.501118
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.387544
		hillsFraction   0.660661
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238076
		craterFreq      0.264153
		craterDensity   0.846722
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.455185
		volcanoTemp     1702.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.170, 0.169, 0.167, 0.000)
		colorShelf     (0.180, 0.179, 0.178, 0.000)
		colorBeach     (0.191, 0.190, 0.188, 0.000)
		colorDesert    (0.201, 0.200, 0.199, 0.000)
		colorLowland   (0.212, 0.211, 0.209, 0.000)
		colorUpland    (0.223, 0.221, 0.220, 0.000)
		colorRock      (0.233, 0.232, 0.230, 0.000)
		colorSnow      (0.244, 0.242, 0.241, 1.000)
		BumpHeight      11.9195
		BumpOffset      2.38389
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.125945
		Period          0.0476049
		Eccentricity    0.154119
		Inclination     -2.56977
		AscendingNode   69.4058
		ArgOfPericenter -86.0269
		MeanAnomaly     145.052
	}
}

Asteroid	"S6"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            6.2384e-017
	Radius          0.0268188
	InertiaMoment   0.398968

	RotationPeriod  843.445
	Obliquity       -3.57736
	EqAscendNode    120.73

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.650 0.646 0.640)

	Surface
	{
		SurfStyle       0.0754407
		OceanStyle      0.0985273
		Randomize      (0.437, 0.747, 0.564)
		colorDistMagn   0.700563
		colorDistFreq   4.06012e-007
		detailScale     0.732333
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0616779
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.725241
		terraceProb     0.245966
		erosion         0
		montesMagn      0.552942
		montesFreq      2.27277
		montesSpiky     0.991477
		montesFraction  0.239105
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.88734e-006
		hillsFraction   0.516167
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23958
		craterFreq      0.271429
		craterDensity   0.9203
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.447959
		volcanoTemp     1562.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.260, 0.258, 0.256, 0.000)
		colorShelf     (0.276, 0.275, 0.272, 0.000)
		colorBeach     (0.293, 0.291, 0.288, 0.000)
		colorDesert    (0.309, 0.307, 0.304, 0.000)
		colorLowland   (0.325, 0.323, 0.320, 0.000)
		colorUpland    (0.341, 0.339, 0.336, 0.000)
		colorRock      (0.358, 0.355, 0.352, 0.000)
		colorSnow      (0.374, 0.372, 0.368, 1.000)
		BumpHeight      0.0241369
		BumpOffset      0.00482739
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.126834
		Period          0.04811
		Eccentricity    0.16005
		Inclination     -3.57736
		AscendingNode   120.73
		ArgOfPericenter 119.366
		MeanAnomaly     136.748
	}
}

Asteroid	"S7"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            9.18013e-014
	Radius          0.347121
	InertiaMoment   0.399907

	RotationPeriod  1182.9
	Obliquity       4.69619
	EqAscendNode    -8.31684

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.591 0.585 0.581)

	Surface
	{
		SurfStyle       0.873264
		OceanStyle      0.525927
		Randomize      (-0.300, -0.629, 0.939)
		colorDistMagn   0.648096
		colorDistFreq   4.78402e-005
		detailScale     9.47871
		colorConversion true
		snowLevel       2
		tropicLatitude  0.162768
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.416001
		terraceProb     0.42986
		erosion         0
		montesMagn      0.496607
		montesFreq      3.85024
		montesSpiky     0.8697
		montesFraction  0.474875
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000267795
		hillsFraction   0.762277
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255148
		craterFreq      0.252293
		craterDensity   0.909126
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.554668
		volcanoTemp     1491.53
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.201, 0.205, 0.233, 0.050)
		colorShelf     (0.236, 0.240, 0.267, 0.040)
		colorBeach     (0.272, 0.275, 0.302, 0.030)
		colorDesert    (0.307, 0.310, 0.343, 0.020)
		colorLowland   (0.342, 0.345, 0.378, 0.030)
		colorUpland    (0.378, 0.380, 0.413, 0.050)
		colorRock      (0.413, 0.416, 0.459, 0.020)
		colorSnow      (0.413, 0.416, 0.459, 1.000)
		BumpHeight      0.312409
		BumpOffset      0.0624817
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.121274
		Period          0.0449815
		Eccentricity    0.121542
		Inclination     4.69619
		AscendingNode   -8.31684
		ArgOfPericenter 58.4352
		MeanAnomaly     -10.4514
	}
}

Asteroid	"S8"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.3509e-010
	Radius          3.08896
	InertiaMoment   0.398009

	RotationPeriod  1625.92
	Obliquity       2.06664
	EqAscendNode    -76.8287

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.803 0.709 0.657)

	Surface
	{
		SurfStyle       0.721281
		OceanStyle      0.459176
		Randomize      (-0.931, -0.781, 0.223)
		colorDistMagn   0.950917
		colorDistFreq   0.00477493
		detailScale     84.3493
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0564895
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.581872
		terraceProb     0.254009
		erosion         0
		montesMagn      0.519509
		montesFreq      3.35203
		montesSpiky     0.969885
		montesFraction  0.367534
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0297285
		hillsFraction   0.582106
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258772
		craterFreq      0.217277
		craterDensity   0.828026
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.458061
		volcanoTemp     1616.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.313, 0.241, 0.184, 0.000)
		colorShelf     (0.321, 0.248, 0.210, 0.000)
		colorBeach     (0.378, 0.290, 0.249, 0.000)
		colorDesert    (0.410, 0.312, 0.243, 0.000)
		colorLowland   (0.450, 0.333, 0.276, 0.000)
		colorUpland    (0.498, 0.404, 0.335, 0.000)
		colorRock      (0.538, 0.439, 0.361, 0.000)
		colorSnow      (0.587, 0.468, 0.381, 1.000)
		BumpHeight      2.78007
		BumpOffset      0.556013
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.123759
		Period          0.0463711
		Eccentricity    0.139181
		Inclination     2.06664
		AscendingNode   -76.8287
		ArgOfPericenter -155.977
		MeanAnomaly     -65.4705
	}
}

Asteroid	"S9"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.98793e-007
	Radius          39.4573
	InertiaMoment   0.399165

	Obliquity       5.19762
	EqAscendNode    -72.2584
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.567 0.563 0.556)

	Surface
	{
		SurfStyle       0.500158
		OceanStyle      0.520915
		Randomize      (0.252, 0.304, -0.716)
		colorDistMagn   0.0110952
		colorDistFreq   0.779533
		detailScale     1077.45
		colorConversion true
		snowLevel       2
		tropicLatitude  0.145947
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.661398
		terraceProb     0.341103
		erosion         0
		montesMagn      0.507318
		montesFreq      3.07854
		montesSpiky     0.894305
		montesFraction  0.790345
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.62502
		hillsFraction   0.629505
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250896
		craterFreq      0.161864
		craterDensity   0.754704
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50404
		volcanoTemp     1340.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.221, 0.191, 0.156, 0.000)
		colorShelf     (0.227, 0.197, 0.178, 0.000)
		colorBeach     (0.267, 0.231, 0.211, 0.000)
		colorDesert    (0.289, 0.248, 0.206, 0.000)
		colorLowland   (0.318, 0.264, 0.234, 0.000)
		colorUpland    (0.352, 0.321, 0.284, 0.000)
		colorRock      (0.380, 0.349, 0.306, 0.000)
		colorSnow      (0.414, 0.371, 0.323, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.113949
		Period          0.0409684
		Eccentricity    0.065074
		Inclination     5.19762
		AscendingNode   -72.2584
		ArgOfPericenter 16.7428
		MeanAnomaly     -68.627
	}
}

Asteroid	"S10"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.1646e-015
	Radius          0.0809575
	InertiaMoment   0.395736

	Obliquity       -3.79352
	EqAscendNode    -179.662
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.442 0.439 0.436)

	Surface
	{
		SurfStyle       0.402331
		OceanStyle      0.996793
		Randomize      (-0.421, -0.635, -0.519)
		colorDistMagn   0.588866
		colorDistFreq   2.3381e-006
		detailScale     2.21068
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.600206
		terraceProb     0.236913
		erosion         0
		montesMagn      0.464554
		montesFreq      2.80217
		montesSpiky     0.880643
		montesFraction  0.519166
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.31428e-005
		hillsFraction   0.447489
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.211428
		craterFreq      0.228677
		craterDensity   0.869615
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.506842
		volcanoTemp     1661.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.177, 0.176, 0.174, 0.000)
		colorShelf     (0.188, 0.187, 0.185, 0.000)
		colorBeach     (0.199, 0.198, 0.196, 0.000)
		colorDesert    (0.210, 0.209, 0.207, 0.000)
		colorLowland   (0.221, 0.220, 0.218, 0.000)
		colorUpland    (0.232, 0.231, 0.229, 0.000)
		colorRock      (0.243, 0.242, 0.240, 0.000)
		colorSnow      (0.254, 0.253, 0.251, 1.000)
		BumpHeight      0.0728617
		BumpOffset      0.0145723
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.126986
		Period          0.0481964
		Eccentricity    0.161055
		Inclination     -3.79352
		AscendingNode   -179.662
		ArgOfPericenter -12.5726
		MeanAnomaly     139.674
	}
}

Asteroid	"S11"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.71377e-012
	Radius          0.720432
	InertiaMoment   0.39828

	Obliquity       3.27696
	EqAscendNode    -140.383
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.754 0.751 0.748)

	Surface
	{
		SurfStyle       0.79733
		OceanStyle      0.138359
		Randomize      (-0.074, -0.067, 0.100)
		colorDistMagn   0.503979
		colorDistFreq   0.000415023
		detailScale     19.6726
		colorConversion true
		snowLevel       2
		tropicLatitude  0.038735
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.476242
		terraceProb     0.460762
		erosion         0
		montesMagn      0.445851
		montesFreq      2.99098
		montesSpiky     0.905964
		montesFraction  0.410453
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00117183
		hillsFraction   0.755489
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230278
		craterFreq      0.217749
		craterDensity   0.888474
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.504727
		volcanoTemp     1554.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.294, 0.255, 0.209, 0.000)
		colorShelf     (0.302, 0.263, 0.239, 0.000)
		colorBeach     (0.355, 0.308, 0.284, 0.000)
		colorDesert    (0.385, 0.330, 0.277, 0.000)
		colorLowland   (0.422, 0.353, 0.314, 0.000)
		colorUpland    (0.468, 0.428, 0.381, 0.000)
		colorRock      (0.505, 0.465, 0.411, 0.000)
		colorSnow      (0.551, 0.495, 0.434, 1.000)
		BumpHeight      0.648389
		BumpOffset      0.129678
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.125964
		Period          0.047616
		Eccentricity    0.0391841
		Inclination     3.27696
		AscendingNode   -140.383
		ArgOfPericenter -171.445
		MeanAnomaly     -99.3042
	}
}

Asteroid	"S12"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            2.5219e-009
	Radius          9.20398
	InertiaMoment   0.399354

	RotationPeriod  713.554
	Obliquity       1.63916
	EqAscendNode    40.6306

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.699 0.596 0.541)

	Surface
	{
		SurfStyle       0.207713
		OceanStyle      0.462287
		Randomize      (-0.480, -0.101, -0.222)
		colorDistMagn   0.666975
		colorDistFreq   0.0124385
		detailScale     251.33
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0536317
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.408791
		terraceProb     0.248329
		erosion         0
		montesMagn      0.461042
		montesFreq      2.65273
		montesSpiky     0.912125
		montesFraction  0.432246
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.197377
		hillsFraction   0.606343
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237707
		craterFreq      0.232049
		craterDensity   0.995585
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.570052
		volcanoTemp     1916.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.280, 0.238, 0.216, 0.000)
		colorShelf     (0.297, 0.253, 0.230, 0.000)
		colorBeach     (0.315, 0.268, 0.243, 0.000)
		colorDesert    (0.332, 0.283, 0.257, 0.000)
		colorLowland   (0.350, 0.298, 0.270, 0.000)
		colorUpland    (0.367, 0.313, 0.284, 0.000)
		colorRock      (0.385, 0.328, 0.297, 0.000)
		colorSnow      (0.402, 0.343, 0.311, 1.000)
		BumpHeight      8.28358
		BumpOffset      1.65672
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.113453
		Period          0.040701
		Eccentricity    0.0609839
		Inclination     1.63916
		AscendingNode   40.6306
		ArgOfPericenter -129.384
		MeanAnomaly     48.6445
	}
}

Asteroid	"S13"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.47742e-017
	Radius          0.0188813
	InertiaMoment   0.396742

	RotationPeriod  1449.06
	Obliquity       1.04135
	EqAscendNode    -37.1451

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.499 0.494 0.486)

	Surface
	{
		SurfStyle       0.804534
		OceanStyle      0.200355
		Randomize      (0.453, 0.310, -0.383)
		colorDistMagn   0.558583
		colorDistFreq   1.03121e-007
		detailScale     0.515587
		colorConversion true
		snowLevel       2
		tropicLatitude  0.034449
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.427618
		terraceProb     0.12327
		erosion         0
		montesMagn      0.495554
		montesFreq      3.1259
		montesSpiky     0.86286
		montesFraction  0.453672
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.03628e-007
		hillsFraction   0.529132
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.215831
		craterFreq      0.228915
		craterDensity   1.01959
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.464195
		volcanoTemp     1348.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.195, 0.168, 0.136, 0.000)
		colorShelf     (0.200, 0.173, 0.156, 0.000)
		colorBeach     (0.235, 0.202, 0.185, 0.000)
		colorDesert    (0.255, 0.217, 0.180, 0.000)
		colorLowland   (0.280, 0.232, 0.204, 0.000)
		colorUpland    (0.310, 0.281, 0.248, 0.000)
		colorRock      (0.335, 0.306, 0.267, 0.000)
		colorSnow      (0.365, 0.326, 0.282, 1.000)
		BumpHeight      0.0169932
		BumpOffset      0.00339864
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.138844
		Period          0.0551026
		Eccentricity    0.113933
		Inclination     1.04135
		AscendingNode   -37.1451
		ArgOfPericenter 137.747
		MeanAnomaly     45.3122
	}
}

Asteroid	"S14"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            2.17411e-014
	Radius          0.168023
	InertiaMoment   0.398522

	RotationPeriod  1478.67
	Obliquity       3.13376
	EqAscendNode    -164.359

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.426 0.417 0.413)

	Surface
	{
		SurfStyle       0.706005
		OceanStyle      0.00247302
		Randomize      (0.732, -0.127, 0.883)
		colorDistMagn   0.488659
		colorDistFreq   2.34346e-005
		detailScale     4.58816
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0148782
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.488913
		terraceProb     0.14093
		erosion         0
		montesMagn      0.532324
		montesFreq      2.48954
		montesSpiky     0.98932
		montesFraction  0.598424
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.26694e-005
		hillsFraction   0.466005
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2294
		craterFreq      0.242521
		craterDensity   0.740771
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.548489
		volcanoTemp     1371.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.166, 0.142, 0.116, 0.000)
		colorShelf     (0.170, 0.146, 0.132, 0.000)
		colorBeach     (0.200, 0.171, 0.157, 0.000)
		colorDesert    (0.217, 0.184, 0.153, 0.000)
		colorLowland   (0.239, 0.196, 0.174, 0.000)
		colorUpland    (0.264, 0.238, 0.211, 0.000)
		colorRock      (0.285, 0.259, 0.227, 0.000)
		colorSnow      (0.311, 0.276, 0.240, 1.000)
		BumpHeight      0.151221
		BumpOffset      0.0302442
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.116169
		Period          0.0421715
		Eccentricity    0.0829407
		Inclination     3.13376
		AscendingNode   -164.359
		ArgOfPericenter 47.5864
		MeanAnomaly     89.1811
	}
}

Asteroid	"S15"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            3.19931e-011
	Radius          2.14667
	InertiaMoment   0.399537

	RotationPeriod  2028.78
	Obliquity       -3.93892
	EqAscendNode    -139.758

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.742 0.639 0.531)

	Surface
	{
		SurfStyle       0.892071
		OceanStyle      0.0500901
		Randomize      (-0.863, -0.440, 0.364)
		colorDistMagn   0.693836
		colorDistFreq   0.00187361
		detailScale     58.6183
		colorConversion true
		snowLevel       2
		tropicLatitude  0.047248
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.279512
		terraceProb     0.169875
		erosion         0
		montesMagn      0.322494
		montesFreq      2.90187
		montesSpiky     0.853043
		montesFraction  0.671656
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00952799
		hillsFraction   0.613035
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264478
		craterFreq      0.218896
		craterDensity   0.921322
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.43452
		volcanoTemp     1695.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.252, 0.224, 0.212, 0.050)
		colorShelf     (0.297, 0.262, 0.244, 0.040)
		colorBeach     (0.341, 0.301, 0.276, 0.030)
		colorDesert    (0.386, 0.339, 0.313, 0.020)
		colorLowland   (0.430, 0.377, 0.345, 0.030)
		colorUpland    (0.475, 0.416, 0.377, 0.050)
		colorRock      (0.519, 0.454, 0.419, 0.020)
		colorSnow      (0.519, 0.454, 0.419, 1.000)
		BumpHeight      1.932
		BumpOffset      0.3864
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.123612
		Period          0.0462886
		Eccentricity    0.138159
		Inclination     -3.93892
		AscendingNode   -139.758
		ArgOfPericenter 74.2803
		MeanAnomaly     48.1268
	}
}

Asteroid	"S16"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            4.70796e-008
	Radius          27.7817
	InertiaMoment   0.397278

	RotationPeriod  2660.44
	Obliquity       0.621503
	EqAscendNode    87.3184

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.429 0.422 0.417)

	Surface
	{
		SurfStyle       0.614969
		OceanStyle      0.861622
		Randomize      (-0.267, -0.092, -0.088)
		colorDistMagn   0.508501
		colorDistFreq   0.576403
		detailScale     758.625
		colorConversion true
		snowLevel       2
		tropicLatitude  0.015693
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.336891
		terraceProb     0.106426
		erosion         0
		montesMagn      0.495209
		montesFreq      2.91481
		montesSpiky     0.987725
		montesFraction  0.517672
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.45876
		hillsFraction   0.605238
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240765
		craterFreq      0.229845
		craterDensity   1.03718
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.525316
		volcanoTemp     1440.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.167, 0.144, 0.117, 0.000)
		colorShelf     (0.172, 0.148, 0.134, 0.000)
		colorBeach     (0.202, 0.173, 0.159, 0.000)
		colorDesert    (0.219, 0.186, 0.154, 0.000)
		colorLowland   (0.240, 0.199, 0.175, 0.000)
		colorUpland    (0.266, 0.241, 0.213, 0.000)
		colorRock      (0.288, 0.262, 0.229, 0.000)
		colorSnow      (0.313, 0.279, 0.242, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.131145
		Period          0.0505838
		Eccentricity    0.187664
		Inclination     0.621503
		AscendingNode   87.3184
		ArgOfPericenter -51.2812
		MeanAnomaly     1.26276
	}
}

Asteroid	"S17"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            2.7581e-016
	Radius          0.0391874
	InertiaMoment   0.398745

	Obliquity       -1.5363
	EqAscendNode    173.807
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.792 0.788 0.786)

	Surface
	{
		SurfStyle       0.536858
		OceanStyle      0.0460477
		Randomize      (-0.249, 0.800, -0.376)
		colorDistMagn   0.650862
		colorDistFreq   1.09416e-006
		detailScale     1.07008
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00288871
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.643974
		terraceProb     0.357115
		erosion         0
		montesMagn      0.474171
		montesFreq      3.28628
		montesSpiky     0.943285
		montesFraction  0.314932
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.54168e-006
		hillsFraction   0.572378
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237153
		craterFreq      0.162123
		craterDensity   0.810404
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.551281
		volcanoTemp     969.138
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.309, 0.268, 0.220, 0.000)
		colorShelf     (0.317, 0.276, 0.251, 0.000)
		colorBeach     (0.372, 0.323, 0.299, 0.000)
		colorDesert    (0.404, 0.347, 0.291, 0.000)
		colorLowland   (0.443, 0.370, 0.330, 0.000)
		colorUpland    (0.491, 0.449, 0.401, 0.000)
		colorRock      (0.530, 0.489, 0.432, 0.000)
		colorSnow      (0.578, 0.520, 0.456, 1.000)
		BumpHeight      0.0352686
		BumpOffset      0.00705372
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.11784
		Period          0.0430847
		Eccentricity    0.0959457
		Inclination     -1.5363
		AscendingNode   173.807
		ArgOfPericenter -3.46018
		MeanAnomaly     -124.628
	}
}

Asteroid	"S18"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            4.05869e-013
	Radius          0.50066
	InertiaMoment   0.399716

	Obliquity       4.51296
	EqAscendNode    -65.4379
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.627 0.623 0.616)

	Surface
	{
		SurfStyle       0.235264
		OceanStyle      0.382092
		Randomize      (-0.724, -0.642, -0.202)
		colorDistMagn   0.77257
		colorDistFreq   0.000120177
		detailScale     13.6714
		colorConversion true
		snowLevel       2
		tropicLatitude  0.132109
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.527728
		terraceProb     0.344117
		erosion         0
		montesMagn      0.525664
		montesFreq      3.06106
		montesSpiky     0.893592
		montesFraction  0.577338
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000836787
		hillsFraction   0.627094
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249739
		craterFreq      0.203152
		craterDensity   0.975328
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.469782
		volcanoTemp     1342.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.251, 0.249, 0.247, 0.000)
		colorShelf     (0.267, 0.265, 0.262, 0.000)
		colorBeach     (0.282, 0.280, 0.277, 0.000)
		colorDesert    (0.298, 0.296, 0.293, 0.000)
		colorLowland   (0.314, 0.311, 0.308, 0.000)
		colorUpland    (0.329, 0.327, 0.324, 0.000)
		colorRock      (0.345, 0.343, 0.339, 0.000)
		colorSnow      (0.361, 0.358, 0.354, 1.000)
		BumpHeight      0.450594
		BumpOffset      0.0901189
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.116568
		Period          0.0423889
		Eccentricity    0.0860789
		Inclination     4.51296
		AscendingNode   -65.4379
		ArgOfPericenter -150.921
		MeanAnomaly     -6.15346
	}
}

Asteroid	"S19"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            5.97256e-010
	Radius          6.48001
	InertiaMoment   0.397669

	RotationPeriod  1527.82
	Obliquity       3.44054
	EqAscendNode    170.997

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.658 0.651 0.648)

	Surface
	{
		SurfStyle       0.96839
		OceanStyle      0.888197
		Randomize      (-0.865, 0.919, 0.308)
		colorDistMagn   0.978104
		colorDistFreq   0.0262798
		detailScale     176.947
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00941752
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.378662
		terraceProb     0.271497
		erosion         0
		montesMagn      0.527171
		montesFreq      3.45219
		montesSpiky     0.881559
		montesFraction  0.94408
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0816019
		hillsFraction   0.635945
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239112
		craterFreq      0.14791
		craterDensity   0.764312
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.544688
		volcanoTemp     1876.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.224, 0.228, 0.259, 0.050)
		colorShelf     (0.263, 0.267, 0.298, 0.040)
		colorBeach     (0.303, 0.306, 0.337, 0.030)
		colorDesert    (0.342, 0.345, 0.382, 0.020)
		colorLowland   (0.382, 0.384, 0.421, 0.030)
		colorUpland    (0.421, 0.423, 0.460, 0.050)
		colorRock      (0.461, 0.462, 0.512, 0.020)
		colorSnow      (0.461, 0.462, 0.512, 1.000)
		BumpHeight      5.83201
		BumpOffset      1.1664
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.11873
		Period          0.0435733
		Eccentricity    0.102716
		Inclination     3.44054
		AscendingNode   170.997
		ArgOfPericenter -177.134
		MeanAnomaly     84.4966
	}
}

Asteroid	"S20"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            3.49894e-018
	Radius          0.00913949
	InertiaMoment   0.398953

	RotationPeriod  2268.12
	Obliquity       -5.55737
	EqAscendNode    160.69

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.723 0.720 0.719)

	Surface
	{
		SurfStyle       0.339692
		OceanStyle      0.481423
		Randomize      (-0.540, -0.553, -0.824)
		colorDistMagn   0.903473
		colorDistFreq   3.81132e-008
		detailScale     0.249569
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0324802
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.761978
		terraceProb     0.213076
		erosion         0
		montesMagn      0.460348
		montesFreq      3.55047
		montesSpiky     0.979173
		montesFraction  0.56058
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.12729e-007
		hillsFraction   0.711271
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251236
		craterFreq      0.186489
		craterDensity   0.905048
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.514104
		volcanoTemp     1487.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.289, 0.288, 0.288, 0.000)
		colorShelf     (0.307, 0.306, 0.306, 0.000)
		colorBeach     (0.325, 0.324, 0.324, 0.000)
		colorDesert    (0.344, 0.342, 0.342, 0.000)
		colorLowland   (0.362, 0.360, 0.359, 0.000)
		colorUpland    (0.380, 0.378, 0.377, 0.000)
		colorRock      (0.398, 0.396, 0.395, 0.000)
		colorSnow      (0.416, 0.414, 0.413, 1.000)
		BumpHeight      0.00822554
		BumpOffset      0.00164511
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.133152
		Period          0.0517494
		Eccentricity    0.199908
		Inclination     -5.55737
		AscendingNode   160.69
		ArgOfPericenter -160.782
		MeanAnomaly     -62.982
	}
}

Asteroid	"S21"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            5.14887e-015
	Radius          0.116767
	InertiaMoment   0.399893

	RotationPeriod  2635.7
	Obliquity       -1.41476
	EqAscendNode    -39.9086

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.459 0.454 0.450)

	Surface
	{
		SurfStyle       0.537736
		OceanStyle      0.304608
		Randomize      (0.972, -0.016, -0.109)
		colorDistMagn   0.627164
		colorDistFreq   2.7629e-006
		detailScale     3.18851
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0464025
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.263993
		terraceProb     0.669361
		erosion         0
		montesMagn      0.542374
		montesFreq      1.80022
		montesSpiky     0.935827
		montesFraction  0.466913
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.34042e-005
		hillsFraction   0.726425
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226734
		craterFreq      0.222265
		craterDensity   0.87343
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.607719
		volcanoTemp     1602.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.179, 0.155, 0.126, 0.000)
		colorShelf     (0.184, 0.159, 0.144, 0.000)
		colorBeach     (0.216, 0.186, 0.171, 0.000)
		colorDesert    (0.234, 0.200, 0.167, 0.000)
		colorLowland   (0.257, 0.214, 0.189, 0.000)
		colorUpland    (0.285, 0.259, 0.230, 0.000)
		colorRock      (0.307, 0.282, 0.248, 0.000)
		colorSnow      (0.335, 0.300, 0.261, 1.000)
		BumpHeight      0.10509
		BumpOffset      0.021018
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.130331
		Period          0.0501133
		Eccentricity    0.0823248
		Inclination     -1.41476
		AscendingNode   -39.9086
		ArgOfPericenter 164.011
		MeanAnomaly     133.215
	}
}

Asteroid	"S22"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            7.57684e-012
	Radius          1.51133
	InertiaMoment   0.397987

	Obliquity       -2.90318
	EqAscendNode    69.3845
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.613 0.610 0.606)

	Surface
	{
		SurfStyle       0.956549
		OceanStyle      0.995164
		Randomize      (-0.796, 0.528, -0.014)
		colorDistMagn   0.645773
		colorDistFreq   4.59287e-005
		detailScale     41.2694
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0832158
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.323263
		terraceProb     0.28211
		erosion         0
		montesMagn      0.364768
		montesFreq      2.96939
		montesSpiky     0.764172
		montesFraction  0.505606
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00525654
		hillsFraction   0.613567
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225029
		craterFreq      0.248291
		craterDensity   1.01535
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.567836
		volcanoTemp     1301.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.208, 0.213, 0.243, 0.050)
		colorShelf     (0.245, 0.250, 0.279, 0.040)
		colorBeach     (0.282, 0.287, 0.315, 0.030)
		colorDesert    (0.319, 0.323, 0.358, 0.020)
		colorLowland   (0.355, 0.360, 0.394, 0.030)
		colorUpland    (0.392, 0.396, 0.431, 0.050)
		colorRock      (0.429, 0.433, 0.479, 0.020)
		colorSnow      (0.429, 0.433, 0.479, 1.000)
		BumpHeight      1.3602
		BumpOffset      0.27204
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.108113
		Period          0.0378616
		Eccentricity    0.0146044
		Inclination     -2.90318
		AscendingNode   69.3845
		ArgOfPericenter -135.754
		MeanAnomaly     -122.506
	}
}

Asteroid	"S23"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.11498e-008
	Radius          13.4484
	InertiaMoment   0.39915

	RotationPeriod  273.041
	Obliquity       1.72973
	EqAscendNode    83.6567

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.681 0.677 0.675)

	Surface
	{
		SurfStyle       0.65589
		OceanStyle      0.0380756
		Randomize      (-0.343, -0.588, 0.372)
		colorDistMagn   0.314961
		colorDistFreq   0.0847791
		detailScale     367.23
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0449728
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.272663
		terraceProb     0.260533
		erosion         0
		montesMagn      0.578487
		montesFreq      2.35508
		montesSpiky     0.901602
		montesFraction  0.168141
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.375561
		hillsFraction   0.561455
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.216302
		craterFreq      0.178635
		craterDensity   0.751367
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.444228
		volcanoTemp     1465.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.266, 0.230, 0.189, 0.000)
		colorShelf     (0.272, 0.237, 0.216, 0.000)
		colorBeach     (0.320, 0.278, 0.257, 0.000)
		colorDesert    (0.347, 0.298, 0.250, 0.000)
		colorLowland   (0.381, 0.318, 0.284, 0.000)
		colorUpland    (0.422, 0.386, 0.344, 0.000)
		colorRock      (0.456, 0.420, 0.371, 0.000)
		colorSnow      (0.497, 0.447, 0.392, 1.000)
		BumpHeight      12.1035
		BumpOffset      2.42071
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.124384
		Period          0.0467226
		Eccentricity    0.143504
		Inclination     1.72973
		AscendingNode   83.6567
		ArgOfPericenter 124.697
		MeanAnomaly     10.9041
	}
}

Asteroid	"S24"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            6.53192e-017
	Radius          0.027233
	InertiaMoment   0.395594

	Obliquity       -0.895454
	EqAscendNode    -128.719
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.714 0.708 0.706)

	Surface
	{
		SurfStyle       0.0530854
		OceanStyle      0.150698
		Randomize      (-0.674, 0.739, 0.654)
		colorDistMagn   0.25357
		colorDistFreq   6.22734e-007
		detailScale     0.743642
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0135269
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.659925
		terraceProb     0.222648
		erosion         0
		montesMagn      0.472752
		montesFreq      3.20466
		montesSpiky     0.984757
		montesFraction  0.679528
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.78412e-006
		hillsFraction   0.435147
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24741
		craterFreq      0.259319
		craterDensity   1.05412
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.510347
		volcanoTemp     1543.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.286, 0.283, 0.282, 0.000)
		colorShelf     (0.304, 0.301, 0.300, 0.000)
		colorBeach     (0.321, 0.319, 0.318, 0.000)
		colorDesert    (0.339, 0.336, 0.335, 0.000)
		colorLowland   (0.357, 0.354, 0.353, 0.000)
		colorUpland    (0.375, 0.372, 0.371, 0.000)
		colorRock      (0.393, 0.389, 0.388, 0.000)
		colorSnow      (0.411, 0.407, 0.406, 1.000)
		BumpHeight      0.0245097
		BumpOffset      0.00490194
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.118687
		Period          0.0435501
		Eccentricity    0.0767027
		Inclination     -0.895454
		AscendingNode   -128.719
		ArgOfPericenter 127.303
		MeanAnomaly     104.679
	}
}

Asteroid	"S25"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            9.61207e-014
	Radius          0.352482
	InertiaMoment   0.39826

	RotationPeriod  569.118
	Obliquity       -2.2168
	EqAscendNode    -130.153

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.562 0.558 0.553)

	Surface
	{
		SurfStyle       0.0550068
		OceanStyle      0.366257
		Randomize      (0.093, 0.199, -0.377)
		colorDistMagn   0.234447
		colorDistFreq   7.28451e-005
		detailScale     9.6251
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0325974
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.269755
		terraceProb     0.153257
		erosion         0
		montesMagn      0.407375
		montesFreq      2.28583
		montesSpiky     0.901316
		montesFraction  0.488702
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000295045
		hillsFraction   0.65294
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225876
		craterFreq      0.219406
		craterDensity   0.80782
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.423781
		volcanoTemp     1384.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.225, 0.223, 0.221, 0.000)
		colorShelf     (0.239, 0.237, 0.235, 0.000)
		colorBeach     (0.253, 0.251, 0.249, 0.000)
		colorDesert    (0.267, 0.265, 0.263, 0.000)
		colorLowland   (0.281, 0.279, 0.277, 0.000)
		colorUpland    (0.295, 0.293, 0.290, 0.000)
		colorRock      (0.309, 0.307, 0.304, 0.000)
		colorSnow      (0.323, 0.321, 0.318, 1.000)
		BumpHeight      0.317233
		BumpOffset      0.0634467
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.127858
		Period          0.0486936
		Eccentricity    0.166776
		Inclination     -2.2168
		AscendingNode   -130.153
		ArgOfPericenter -175.152
		MeanAnomaly     42.9909
	}
}

Asteroid	"S26"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.41447e-010
	Radius          3.13667
	InertiaMoment   0.399339

	RotationPeriod  654.496
	Obliquity       -2.98529
	EqAscendNode    118.854

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.463 0.455 0.450)

	Surface
	{
		SurfStyle       0.825243
		OceanStyle      0.0398616
		Randomize      (-0.827, -0.929, 0.586)
		colorDistMagn   0.315726
		colorDistFreq   0.00662831
		detailScale     85.652
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0529605
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.511808
		terraceProb     0.36261
		erosion         0
		montesMagn      0.520994
		montesFreq      2.50416
		montesSpiky     0.989166
		montesFraction  0.521071
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0264853
		hillsFraction   0.713017
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.201608
		craterFreq      0.23811
		craterDensity   0.806156
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.405622
		volcanoTemp     1463.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.181, 0.155, 0.126, 0.000)
		colorShelf     (0.185, 0.159, 0.144, 0.000)
		colorBeach     (0.218, 0.186, 0.171, 0.000)
		colorDesert    (0.236, 0.200, 0.167, 0.000)
		colorLowland   (0.259, 0.214, 0.189, 0.000)
		colorUpland    (0.287, 0.259, 0.230, 0.000)
		colorRock      (0.310, 0.282, 0.248, 0.000)
		colorSnow      (0.338, 0.300, 0.261, 1.000)
		BumpHeight      2.823
		BumpOffset      0.564601
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.120945
		Period          0.0447988
		Eccentricity    0.119156
		Inclination     -2.98529
		AscendingNode   118.854
		ArgOfPericenter -131.399
		MeanAnomaly     17.1767
	}
}

Asteroid	"S27"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            2.08146e-007
	Radius          40.0665
	InertiaMoment   0.396689

	RotationPeriod  854.667
	Obliquity       1.26275
	EqAscendNode    -67.9785

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.581 0.490 0.330)

	Surface
	{
		SurfStyle       0.00986716
		OceanStyle      0.378123
		Randomize      (-0.678, 0.393, 0.769)
		colorDistMagn   0.413644
		colorDistFreq   1.2237
		detailScale     1094.08
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0365384
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.269732
		terraceProb     0.507538
		erosion         0
		montesMagn      0.345905
		montesFreq      3.5373
		montesSpiky     0.915825
		montesFraction  0.263896
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.44331
		hillsFraction   0.572658
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232385
		craterFreq      0.160418
		craterDensity   0.862559
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.519988
		volcanoTemp     1341.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.232, 0.196, 0.132, 0.000)
		colorShelf     (0.247, 0.208, 0.140, 0.000)
		colorBeach     (0.262, 0.220, 0.149, 0.000)
		colorDesert    (0.276, 0.233, 0.157, 0.000)
		colorLowland   (0.291, 0.245, 0.165, 0.000)
		colorUpland    (0.305, 0.257, 0.173, 0.000)
		colorRock      (0.320, 0.269, 0.182, 0.000)
		colorSnow      (0.334, 0.282, 0.190, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.127957
		Period          0.0487501
		Eccentricity    0.0849065
		Inclination     1.26275
		AscendingNode   -67.9785
		ArgOfPericenter 91.8579
		MeanAnomaly     120.532
	}
}

Asteroid	"S28"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.2194e-015
	Radius          0.0822077
	InertiaMoment   0.398504

	RotationPeriod  258.962
	Obliquity       1.89396
	EqAscendNode    76.2429

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.774 0.705 0.629)

	Surface
	{
		SurfStyle       0.94535
		OceanStyle      0.849762
		Randomize      (0.734, 0.918, 0.029)
		colorDistMagn   0.694105
		colorDistFreq   5.78191e-007
		detailScale     2.24482
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0519838
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.392943
		terraceProb     0.261365
		erosion         0
		montesMagn      0.494474
		montesFreq      2.51059
		montesSpiky     0.869567
		montesFraction  0.812662
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.7097e-005
		hillsFraction   0.414844
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249229
		craterFreq      0.274664
		craterDensity   0.853642
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.460921
		volcanoTemp     1428.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.263, 0.247, 0.252, 0.050)
		colorShelf     (0.310, 0.289, 0.289, 0.040)
		colorBeach     (0.356, 0.331, 0.327, 0.030)
		colorDesert    (0.403, 0.374, 0.371, 0.020)
		colorLowland   (0.449, 0.416, 0.409, 0.030)
		colorUpland    (0.495, 0.458, 0.447, 0.050)
		colorRock      (0.542, 0.501, 0.497, 0.020)
		colorSnow      (0.542, 0.501, 0.497, 1.000)
		BumpHeight      0.073987
		BumpOffset      0.0147974
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.12007
		Period          0.0443135
		Eccentricity    0.112736
		Inclination     1.89396
		AscendingNode   76.2429
		ArgOfPericenter 153.417
		MeanAnomaly     98.2802
	}
}

Asteroid	"S29"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.79441e-012
	Radius          0.731558
	InertiaMoment   0.399523

	Obliquity       1.4823
	EqAscendNode    99.9814
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.629 0.625 0.620)

	Surface
	{
		SurfStyle       0.579736
		OceanStyle      0.226549
		Randomize      (-0.249, -0.057, 0.780)
		colorDistMagn   0.490152
		colorDistFreq   0.000364576
		detailScale     19.9764
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0332577
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.361687
		terraceProb     0.296175
		erosion         0
		montesMagn      0.492859
		montesFreq      2.2016
		montesSpiky     0.816626
		montesFraction  0.642972
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00139208
		hillsFraction   0.618249
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229014
		craterFreq      0.200499
		craterDensity   0.952945
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.530837
		volcanoTemp     1406.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.245, 0.213, 0.174, 0.000)
		colorShelf     (0.252, 0.219, 0.198, 0.000)
		colorBeach     (0.296, 0.256, 0.236, 0.000)
		colorDesert    (0.321, 0.275, 0.229, 0.000)
		colorLowland   (0.352, 0.294, 0.261, 0.000)
		colorUpland    (0.390, 0.356, 0.316, 0.000)
		colorRock      (0.422, 0.388, 0.341, 0.000)
		colorSnow      (0.459, 0.413, 0.360, 1.000)
		BumpHeight      0.658402
		BumpOffset      0.13168
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.125205
		Period          0.0471861
		Eccentricity    0.149122
		Inclination     1.4823
		AscendingNode   99.9814
		ArgOfPericenter 147.061
		MeanAnomaly     43.5102
	}
}

Asteroid	"S30"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            2.64057e-009
	Radius          9.34612
	InertiaMoment   0.397243

	Obliquity       -1.1895
	EqAscendNode    45.4852
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.682 0.677 0.674)

	Surface
	{
		SurfStyle       0.0227901
		OceanStyle      0.854344
		Randomize      (-0.367, 0.059, -0.711)
		colorDistMagn   0.637756
		colorDistFreq   0.0461481
		detailScale     255.211
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0382834
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.410944
		terraceProb     0.208099
		erosion         0
		montesMagn      0.494649
		montesFreq      3.58172
		montesSpiky     0.880597
		montesFraction  0.602038
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.115163
		hillsFraction   0.634331
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.276266
		craterFreq      0.219516
		craterDensity   0.790853
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.488237
		volcanoTemp     1247.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.273, 0.271, 0.269, 0.000)
		colorShelf     (0.290, 0.288, 0.286, 0.000)
		colorBeach     (0.307, 0.304, 0.303, 0.000)
		colorDesert    (0.324, 0.321, 0.320, 0.000)
		colorLowland   (0.341, 0.338, 0.337, 0.000)
		colorUpland    (0.358, 0.355, 0.354, 0.000)
		colorRock      (0.375, 0.372, 0.371, 0.000)
		colorSnow      (0.392, 0.389, 0.387, 1.000)
		BumpHeight      8.41151
		BumpOffset      1.6823
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.108621
		Period          0.0381287
		Eccentricity    0.0192111
		Inclination     -1.1895
		AscendingNode   45.4852
		ArgOfPericenter -85.6292
		MeanAnomaly     176.048
	}
}

Asteroid	"S31"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.54694e-017
	Radius          0.0168489
	InertiaMoment   0.398728

	Obliquity       2.48699
	EqAscendNode    -96.3044
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.726 0.723 0.719)

	Surface
	{
		SurfStyle       0.95522
		OceanStyle      0.394297
		Randomize      (0.928, -0.033, -0.870)
		colorDistMagn   0.971624
		colorDistFreq   2.30556e-007
		detailScale     0.460088
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0578746
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.659436
		terraceProb     0.244337
		erosion         0
		montesMagn      0.609403
		montesFreq      2.53103
		montesSpiky     0.961029
		montesFraction  0.755649
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.13234e-007
		hillsFraction   0.457033
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226236
		craterFreq      0.204838
		craterDensity   0.900449
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.507578
		volcanoTemp     1250.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.247, 0.253, 0.288, 0.050)
		colorShelf     (0.291, 0.296, 0.331, 0.040)
		colorBeach     (0.334, 0.340, 0.374, 0.030)
		colorDesert    (0.378, 0.383, 0.424, 0.020)
		colorLowland   (0.421, 0.427, 0.467, 0.030)
		colorUpland    (0.465, 0.470, 0.511, 0.050)
		colorRock      (0.508, 0.513, 0.568, 0.020)
		colorSnow      (0.508, 0.513, 0.568, 1.000)
		BumpHeight      0.015164
		BumpOffset      0.00303281
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.110172
		Period          0.0389483
		Eccentricity    0.0330191
		Inclination     2.48699
		AscendingNode   -96.3043
		ArgOfPericenter 104.711
		MeanAnomaly     39.8265
	}
}

Asteroid	"S32"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            2.2764e-014
	Radius          0.218079
	InertiaMoment   0.399702

	RotationPeriod  648.047
	Obliquity       -1.83181
	EqAscendNode    -115.992

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.726 0.654 0.599)

	Surface
	{
		SurfStyle       0.506268
		OceanStyle      0.326513
		Randomize      (0.420, 0.487, 0.873)
		colorDistMagn   0.963231
		colorDistFreq   3.11935e-005
		detailScale     5.95501
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0338771
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.493921
		terraceProb     0.149781
		erosion         0
		montesMagn      0.510248
		montesFreq      2.80973
		montesSpiky     0.883634
		montesFraction  0.726788
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000124563
		hillsFraction   0.614848
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.271881
		craterFreq      0.231885
		craterDensity   0.953203
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.400017
		volcanoTemp     1351.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.283, 0.222, 0.168, 0.000)
		colorShelf     (0.291, 0.229, 0.192, 0.000)
		colorBeach     (0.341, 0.268, 0.228, 0.000)
		colorDesert    (0.370, 0.288, 0.222, 0.000)
		colorLowland   (0.407, 0.307, 0.252, 0.000)
		colorUpland    (0.450, 0.373, 0.305, 0.000)
		colorRock      (0.487, 0.406, 0.329, 0.000)
		colorSnow      (0.530, 0.432, 0.347, 1.000)
		BumpHeight      0.196271
		BumpOffset      0.0392542
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.12015
		Period          0.0443574
		Eccentricity    0.113322
		Inclination     -1.83181
		AscendingNode   -115.992
		ArgOfPericenter -2.63914
		MeanAnomaly     -108.428
	}
}

Asteroid	"S33"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            3.34985e-011
	Radius          1.94065
	InertiaMoment   0.397642

	RotationPeriod  705.663
	Obliquity       4.53536
	EqAscendNode    175.083

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.438 0.434 0.433)

	Surface
	{
		SurfStyle       0.183194
		OceanStyle      0.9608
		Randomize      (0.118, 0.708, -0.407)
		colorDistMagn   0.59413
		colorDistFreq   0.00166605
		detailScale     52.9928
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00678338
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.501918
		terraceProb     0.469148
		erosion         0
		montesMagn      0.570706
		montesFreq      2.30439
		montesSpiky     0.877351
		montesFraction  0.73464
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0101147
		hillsFraction   0.746813
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235178
		craterFreq      0.203683
		craterDensity   0.885507
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.574465
		volcanoTemp     1859.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.175, 0.174, 0.173, 0.000)
		colorShelf     (0.186, 0.185, 0.184, 0.000)
		colorBeach     (0.197, 0.195, 0.195, 0.000)
		colorDesert    (0.208, 0.206, 0.206, 0.000)
		colorLowland   (0.219, 0.217, 0.216, 0.000)
		colorUpland    (0.230, 0.228, 0.227, 0.000)
		colorRock      (0.241, 0.239, 0.238, 0.000)
		colorSnow      (0.252, 0.250, 0.249, 1.000)
		BumpHeight      1.74659
		BumpOffset      0.349318
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.112615
		Period          0.0402509
		Eccentricity    0.0536122
		Inclination     4.53536
		AscendingNode   175.083
		ArgOfPericenter 112.961
		MeanAnomaly     75.1451
	}
}

Asteroid	"S34"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            4.92948e-008
	Radius          24.7912
	InertiaMoment   0.398937

	RotationPeriod  249.739
	Obliquity       -0.726702
	EqAscendNode    -167.571

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.721 0.716 0.714)

	Surface
	{
		SurfStyle       0.612767
		OceanStyle      0.664378
		Randomize      (0.326, 0.050, 0.581)
		colorDistMagn   0.483507
		colorDistFreq   0.360747
		detailScale     676.965
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00274047
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.523474
		terraceProb     0.114872
		erosion         0
		montesMagn      0.357441
		montesFreq      3.60668
		montesSpiky     0.876183
		montesFraction  0.695812
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.2476
		hillsFraction   0.751361
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235224
		craterFreq      0.245206
		craterDensity   0.885514
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.468014
		volcanoTemp     1751.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.281, 0.243, 0.200, 0.000)
		colorShelf     (0.289, 0.251, 0.228, 0.000)
		colorBeach     (0.339, 0.293, 0.271, 0.000)
		colorDesert    (0.368, 0.315, 0.264, 0.000)
		colorLowland   (0.404, 0.336, 0.300, 0.000)
		colorUpland    (0.447, 0.408, 0.364, 0.000)
		colorRock      (0.483, 0.444, 0.393, 0.000)
		colorSnow      (0.527, 0.472, 0.414, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.117202
		Period          0.0427352
		Eccentricity    0.091023
		Inclination     -0.726702
		AscendingNode   -167.571
		ArgOfPericenter -0.608541
		MeanAnomaly     -59.5119
	}
}

Asteroid	"S35"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            2.88787e-016
	Radius          0.0508616
	InertiaMoment   0.399879

	Obliquity       -4.00979
	EqAscendNode    27.8517
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.614 0.489 0.439)

	Surface
	{
		SurfStyle       0.957898
		OceanStyle      0.752692
		Randomize      (0.757, 0.921, -0.193)
		colorDistMagn   0.350089
		colorDistFreq   2.27114e-006
		detailScale     1.38886
		colorConversion true
		snowLevel       2
		tropicLatitude  0.13543
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.437324
		terraceProb     0.211634
		erosion         0
		montesMagn      0.515785
		montesFreq      3.18177
		montesSpiky     0.992133
		montesFraction  0.659472
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.2997e-006
		hillsFraction   0.591799
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247184
		craterFreq      0.226875
		craterDensity   0.895978
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.575804
		volcanoTemp     1001.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.209, 0.171, 0.176, 0.050)
		colorShelf     (0.246, 0.201, 0.202, 0.040)
		colorBeach     (0.283, 0.230, 0.228, 0.030)
		colorDesert    (0.320, 0.259, 0.259, 0.020)
		colorLowland   (0.356, 0.289, 0.285, 0.030)
		colorUpland    (0.393, 0.318, 0.312, 0.050)
		colorRock      (0.430, 0.347, 0.347, 0.020)
		colorSnow      (0.430, 0.347, 0.347, 1.000)
		BumpHeight      0.0457754
		BumpOffset      0.00915509
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.122462
		Period          0.0456439
		Eccentricity    0.130062
		Inclination     -4.00979
		AscendingNode   27.8517
		ArgOfPericenter 165.864
		MeanAnomaly     124.09
	}
}

Asteroid	"S36"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            4.24965e-013
	Radius          0.452612
	InertiaMoment   0.397964

	Obliquity       -5.59723
	EqAscendNode    -140.541
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.657 0.650 0.648)

	Surface
	{
		SurfStyle       0.420036
		OceanStyle      0.698056
		Randomize      (0.205, 0.223, 0.972)
		colorDistMagn   0.795863
		colorDistFreq   0.000151567
		detailScale     12.3593
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0658162
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.395565
		terraceProb     0.445478
		erosion         0
		montesMagn      0.584656
		montesFreq      2.84394
		montesSpiky     0.942168
		montesFraction  0.4404
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00037792
		hillsFraction   0.829028
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24953
		craterFreq      0.264186
		craterDensity   0.88472
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.562991
		volcanoTemp     1609.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.263, 0.260, 0.259, 0.000)
		colorShelf     (0.279, 0.276, 0.275, 0.000)
		colorBeach     (0.296, 0.293, 0.292, 0.000)
		colorDesert    (0.312, 0.309, 0.308, 0.000)
		colorLowland   (0.329, 0.325, 0.324, 0.000)
		colorUpland    (0.345, 0.341, 0.340, 0.000)
		colorRock      (0.362, 0.358, 0.356, 0.000)
		colorSnow      (0.378, 0.374, 0.373, 1.000)
		BumpHeight      0.407351
		BumpOffset      0.0814702
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.153304
		Period          0.0639313
		Eccentricity    0.0571826
		Inclination     -5.59723
		AscendingNode   -140.541
		ArgOfPericenter -37.5583
		MeanAnomaly     140.169
	}
}

Asteroid	"S37"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            6.25358e-010
	Radius          5.7825
	InertiaMoment   0.399135

	Obliquity       0.631221
	EqAscendNode    1.99913
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.741 0.738 0.737)

	Surface
	{
		SurfStyle       0.370431
		OceanStyle      0.414336
		Randomize      (-0.944, -0.609, -0.374)
		colorDistMagn   0.568747
		colorDistFreq   0.0158172
		detailScale     157.901
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0220282
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.517742
		terraceProb     0.427144
		erosion         0
		montesMagn      0.441989
		montesFreq      3.1054
		montesSpiky     0.803373
		montesFraction  0.599402
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0808502
		hillsFraction   0.66392
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264794
		craterFreq      0.218142
		craterDensity   0.959968
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.539044
		volcanoTemp     976.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.296, 0.295, 0.295, 0.000)
		colorShelf     (0.315, 0.314, 0.313, 0.000)
		colorBeach     (0.333, 0.332, 0.332, 0.000)
		colorDesert    (0.352, 0.351, 0.350, 0.000)
		colorLowland   (0.371, 0.369, 0.369, 0.000)
		colorUpland    (0.389, 0.388, 0.387, 0.000)
		colorRock      (0.408, 0.406, 0.406, 0.000)
		colorSnow      (0.426, 0.425, 0.424, 1.000)
		BumpHeight      5.20425
		BumpOffset      1.04085
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.120611
		Period          0.044613
		Eccentricity    0.116712
		Inclination     0.631221
		AscendingNode   1.99913
		ArgOfPericenter -164.048
		MeanAnomaly     173.334
	}
}

Asteroid	"S38"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            3.66358e-018
	Radius          0.0118622
	InertiaMoment   0.395424

	Obliquity       3.74882
	EqAscendNode    94.2953
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.505 0.502 0.497)

	Surface
	{
		SurfStyle       0.319014
		OceanStyle      0.417873
		Randomize      (-0.085, 0.037, 0.077)
		colorDistMagn   0.551657
		colorDistFreq   4.86624e-008
		detailScale     0.323918
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0888469
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.555563
		terraceProb     0.213087
		erosion         0
		montesMagn      0.337063
		montesFreq      3.12259
		montesSpiky     0.967958
		montesFraction  0.465007
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.13808e-007
		hillsFraction   0.418693
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231886
		craterFreq      0.220973
		craterDensity   1.0733
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.573578
		volcanoTemp     1413.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.202, 0.201, 0.199, 0.000)
		colorShelf     (0.215, 0.213, 0.211, 0.000)
		colorBeach     (0.227, 0.226, 0.224, 0.000)
		colorDesert    (0.240, 0.238, 0.236, 0.000)
		colorLowland   (0.252, 0.251, 0.248, 0.000)
		colorUpland    (0.265, 0.263, 0.261, 0.000)
		colorRock      (0.278, 0.276, 0.273, 0.000)
		colorSnow      (0.290, 0.289, 0.286, 1.000)
		BumpHeight      0.010676
		BumpOffset      0.0021352
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.124077
		Period          0.0465497
		Eccentricity    0.141384
		Inclination     3.74882
		AscendingNode   94.2953
		ArgOfPericenter 23.2265
		MeanAnomaly     -159.14
	}
}

Asteroid	"S39"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            5.39116e-015
	Radius          0.105561
	InertiaMoment   0.39824

	RotationPeriod  274.352
	Obliquity       1.39871
	EqAscendNode    -39.1578

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.729 0.728 0.726)

	Surface
	{
		SurfStyle       0.564509
		OceanStyle      0.658238
		Randomize      (0.050, -0.179, -0.769)
		colorDistMagn   0.956266
		colorDistFreq   6.08507e-006
		detailScale     2.88252
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0459849
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.702976
		terraceProb     0.293134
		erosion         0
		montesMagn      0.360142
		montesFreq      3.1587
		montesSpiky     0.964604
		montesFraction  0.772279
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.61516e-005
		hillsFraction   0.606576
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255331
		craterFreq      0.257602
		craterDensity   0.791442
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.553101
		volcanoTemp     1492.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.284, 0.247, 0.203, 0.000)
		colorShelf     (0.292, 0.255, 0.232, 0.000)
		colorBeach     (0.343, 0.298, 0.276, 0.000)
		colorDesert    (0.372, 0.320, 0.269, 0.000)
		colorLowland   (0.408, 0.342, 0.305, 0.000)
		colorUpland    (0.452, 0.415, 0.370, 0.000)
		colorRock      (0.489, 0.451, 0.399, 0.000)
		colorSnow      (0.532, 0.480, 0.421, 1.000)
		BumpHeight      0.095005
		BumpOffset      0.019001
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.124781
		Period          0.0469469
		Eccentricity    0.146235
		Inclination     1.39871
		AscendingNode   -39.1578
		ArgOfPericenter -169.117
		MeanAnomaly     -85.638
	}
}

Asteroid	"S40"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            7.93338e-012
	Radius          1.34865
	InertiaMoment   0.399325

	Obliquity       1.68826
	EqAscendNode    128.992
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.777 0.703 0.654)

	Surface
	{
		SurfStyle       0.402488
		OceanStyle      0.803299
		Randomize      (0.960, -0.034, -0.068)
		colorDistMagn   0.464193
		colorDistFreq   0.00127619
		detailScale     36.8272
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0253698
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.546825
		terraceProb     0.320864
		erosion         0
		montesMagn      0.607825
		montesFreq      3.97088
		montesSpiky     0.989437
		montesFraction  0.598379
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00521915
		hillsFraction   0.543788
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235429
		craterFreq      0.200318
		craterDensity   0.913444
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.450134
		volcanoTemp     1669.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.311, 0.281, 0.262, 0.000)
		colorShelf     (0.330, 0.299, 0.278, 0.000)
		colorBeach     (0.350, 0.316, 0.294, 0.000)
		colorDesert    (0.369, 0.334, 0.311, 0.000)
		colorLowland   (0.389, 0.352, 0.327, 0.000)
		colorUpland    (0.408, 0.369, 0.344, 0.000)
		colorRock      (0.427, 0.387, 0.360, 0.000)
		colorSnow      (0.447, 0.404, 0.376, 1.000)
		BumpHeight      1.21379
		BumpOffset      0.242757
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.106725
		Period          0.0371349
		Eccentricity    0.00178966
		Inclination     1.68826
		AscendingNode   128.992
		ArgOfPericenter 96.5372
		MeanAnomaly     35.7616
	}
}

Asteroid	"S41"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.16744e-008
	Radius          17.4547
	InertiaMoment   0.396634

	Obliquity       -0.832421
	EqAscendNode    66.9562
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.652 0.506 0.418)

	Surface
	{
		SurfStyle       0.716083
		OceanStyle      0.561681
		Randomize      (-0.055, -0.429, -0.970)
		colorDistMagn   0.343392
		colorDistFreq   0.0715242
		detailScale     476.631
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0242334
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.44821
		terraceProb     0.333015
		erosion         0
		montesMagn      0.410543
		montesFreq      3.98442
		montesSpiky     0.978635
		montesFraction  0.174874
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.560581
		hillsFraction   0.694695
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242714
		craterFreq      0.233048
		craterDensity   1.05706
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.522756
		volcanoTemp     1690.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.254, 0.172, 0.117, 0.000)
		colorShelf     (0.261, 0.177, 0.134, 0.000)
		colorBeach     (0.306, 0.208, 0.159, 0.000)
		colorDesert    (0.332, 0.223, 0.155, 0.000)
		colorLowland   (0.365, 0.238, 0.175, 0.000)
		colorUpland    (0.404, 0.289, 0.213, 0.000)
		colorRock      (0.437, 0.314, 0.230, 0.000)
		colorSnow      (0.476, 0.334, 0.242, 1.000)
		BumpHeight      15.7093
		BumpOffset      3.14185
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.11188
		Period          0.0398574
		Eccentricity    0.0477803
		Inclination     -0.832421
		AscendingNode   66.9562
		ArgOfPericenter -162.48
		MeanAnomaly     100.563
	}
}

Asteroid	"S42"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            6.83926e-017
	Radius          0.0246195
	InertiaMoment   0.398486

	Obliquity       -1.38143
	EqAscendNode    26.2889
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.458 0.454 0.450)

	Surface
	{
		SurfStyle       0.378974
		OceanStyle      0.0969518
		Randomize      (0.051, 0.919, 0.483)
		colorDistMagn   0.615038
		colorDistFreq   1.98953e-007
		detailScale     0.672276
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0469408
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.496869
		terraceProb     0.10129
		erosion         0
		montesMagn      0.541363
		montesFreq      2.63665
		montesSpiky     0.9024
		montesFraction  0.910045
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.48405e-006
		hillsFraction   0.674097
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245091
		craterFreq      0.23473
		craterDensity   0.871002
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.523517
		volcanoTemp     1700.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.183, 0.181, 0.180, 0.000)
		colorShelf     (0.195, 0.193, 0.191, 0.000)
		colorBeach     (0.206, 0.204, 0.202, 0.000)
		colorDesert    (0.217, 0.216, 0.214, 0.000)
		colorLowland   (0.229, 0.227, 0.225, 0.000)
		colorUpland    (0.240, 0.238, 0.236, 0.000)
		colorRock      (0.252, 0.250, 0.247, 0.000)
		colorSnow      (0.263, 0.261, 0.259, 1.000)
		BumpHeight      0.0221575
		BumpOffset      0.00443151
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.110671
		Period          0.0392131
		Eccentricity    0.0373772
		Inclination     -1.38143
		AscendingNode   26.2889
		ArgOfPericenter -87.6092
		MeanAnomaly     145.28
	}
}

Asteroid	"S43"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.00643e-013
	Radius          0.31454
	InertiaMoment   0.399509

	RotationPeriod  976.647
	Obliquity       2.08416
	EqAscendNode    161.54

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.564 0.561 0.556)

	Surface
	{
		SurfStyle       0.700727
		OceanStyle      0.577665
		Randomize      (-0.695, -0.219, 0.228)
		colorDistMagn   0.761269
		colorDistFreq   6.37769e-005
		detailScale     8.58904
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0116676
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.387672
		terraceProb     0.148777
		erosion         0
		montesMagn      0.480625
		montesFreq      2.92042
		montesSpiky     0.870116
		montesFraction  0.606429
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000121543
		hillsFraction   0.666012
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243189
		craterFreq      0.205817
		craterDensity   0.799099
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.465154
		volcanoTemp     1552.92
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.220, 0.191, 0.156, 0.000)
		colorShelf     (0.226, 0.196, 0.178, 0.000)
		colorBeach     (0.265, 0.230, 0.211, 0.000)
		colorDesert    (0.288, 0.247, 0.206, 0.000)
		colorLowland   (0.316, 0.264, 0.234, 0.000)
		colorUpland    (0.350, 0.320, 0.284, 0.000)
		colorRock      (0.378, 0.348, 0.306, 0.000)
		colorSnow      (0.412, 0.370, 0.323, 1.000)
		BumpHeight      0.283086
		BumpOffset      0.0566172
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.120527
		Period          0.0445663
		Eccentricity    0.116094
		Inclination     2.08416
		AscendingNode   161.54
		ArgOfPericenter 115.152
		MeanAnomaly     -27.53
	}
}

Asteroid	"S44"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.48102e-010
	Radius          4.07111
	InertiaMoment   0.397208

	Obliquity       4.86381
	EqAscendNode    174.824
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.683 0.681 0.679)

	Surface
	{
		SurfStyle       0.0588192
		OceanStyle      0.32216
		Randomize      (0.331, -0.823, 0.880)
		colorDistMagn   0.451467
		colorDistFreq   0.00283229
		detailScale     111.169
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00765834
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.264092
		terraceProb     0.279573
		erosion         0
		montesMagn      0.429029
		montesFreq      3.13549
		montesSpiky     0.965809
		montesFraction  0.445846
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0492458
		hillsFraction   0.665107
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24831
		craterFreq      0.262288
		craterDensity   0.883113
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.514169
		volcanoTemp     1567.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.273, 0.272, 0.272, 0.000)
		colorShelf     (0.290, 0.289, 0.289, 0.000)
		colorBeach     (0.308, 0.306, 0.306, 0.000)
		colorDesert    (0.325, 0.323, 0.323, 0.000)
		colorLowland   (0.342, 0.340, 0.340, 0.000)
		colorUpland    (0.359, 0.357, 0.356, 0.000)
		colorRock      (0.376, 0.374, 0.373, 0.000)
		colorSnow      (0.393, 0.391, 0.390, 1.000)
		BumpHeight      3.664
		BumpOffset      0.7328
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.133714
		Period          0.0520772
		Eccentricity    0.0432895
		Inclination     4.86381
		AscendingNode   174.824
		ArgOfPericenter -143.055
		MeanAnomaly     86.7822
	}
}

Asteroid	"S45"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            2.1794e-007
	Radius          36.2213
	InertiaMoment   0.398712

	Obliquity       -1.97388
	EqAscendNode    72.0859
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.641 0.633 0.631)

	Surface
	{
		SurfStyle       0.798023
		OceanStyle      0.237822
		Randomize      (0.111, -0.573, -0.846)
		colorDistMagn   0.640782
		colorDistFreq   0.548179
		detailScale     989.082
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0556789
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.539286
		terraceProb     0.118677
		erosion         0
		montesMagn      0.470354
		montesFreq      3.1856
		montesSpiky     0.837067
		montesFraction  0.549825
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.3192
		hillsFraction   0.651581
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25184
		craterFreq      0.184015
		craterDensity   0.832872
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.470587
		volcanoTemp     1460.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.250, 0.215, 0.177, 0.000)
		colorShelf     (0.256, 0.222, 0.202, 0.000)
		colorBeach     (0.301, 0.260, 0.240, 0.000)
		colorDesert    (0.327, 0.279, 0.233, 0.000)
		colorLowland   (0.359, 0.298, 0.265, 0.000)
		colorUpland    (0.397, 0.361, 0.322, 0.000)
		colorRock      (0.429, 0.393, 0.347, 0.000)
		colorSnow      (0.468, 0.418, 0.366, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.12888
		Period          0.0492789
		Eccentricity    0.173386
		Inclination     -1.97388
		AscendingNode   72.0859
		ArgOfPericenter -31.2048
		MeanAnomaly     -121.307
	}
}

Asteroid	"S46"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.27677e-015
	Radius          0.073359
	InertiaMoment   0.399688

	RotationPeriod  595.901
	Obliquity       -0.365415
	EqAscendNode    -113.957

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.702 0.700 0.698)

	Surface
	{
		SurfStyle       0.67534
		OceanStyle      0.148187
		Randomize      (0.632, -0.378, -0.780)
		colorDistMagn   0.65049
		colorDistFreq   7.05854e-007
		detailScale     2.00319
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00694832
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.575466
		terraceProb     0.370972
		erosion         0
		montesMagn      0.493921
		montesFreq      3.1091
		montesSpiky     0.969748
		montesFraction  0.778131
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.79808e-005
		hillsFraction   0.840277
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.269584
		craterFreq      0.236974
		craterDensity   0.777101
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.467598
		volcanoTemp     1451.53
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.274, 0.238, 0.196, 0.000)
		colorShelf     (0.281, 0.245, 0.223, 0.000)
		colorBeach     (0.330, 0.287, 0.265, 0.000)
		colorDesert    (0.358, 0.308, 0.258, 0.000)
		colorLowland   (0.393, 0.329, 0.293, 0.000)
		colorUpland    (0.435, 0.399, 0.356, 0.000)
		colorRock      (0.470, 0.434, 0.384, 0.000)
		colorSnow      (0.512, 0.462, 0.405, 1.000)
		BumpHeight      0.0660231
		BumpOffset      0.0132046
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.121882
		Period          0.0453202
		Eccentricity    0.125924
		Inclination     -0.365416
		AscendingNode   -113.957
		ArgOfPericenter -113.452
		MeanAnomaly     65.7678
	}
}

Asteroid	"S47"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.87884e-012
	Radius          0.949498
	InertiaMoment   0.397614

	RotationPeriod  816.812
	Obliquity       4.61644
	EqAscendNode    18.2772

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.641 0.638 0.634)

	Surface
	{
		SurfStyle       0.869103
		OceanStyle      0.154845
		Randomize      (0.545, -0.025, 0.712)
		colorDistMagn   0.22283
		colorDistFreq   9.98968e-005
		detailScale     25.9276
		colorConversion true
		snowLevel       2
		tropicLatitude  0.158424
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.592081
		terraceProb     0.261203
		erosion         0
		montesMagn      0.568405
		montesFreq      2.94893
		montesSpiky     0.897365
		montesFraction  0.742284
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0018182
		hillsFraction   0.51456
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.193651
		craterFreq      0.223268
		craterDensity   0.840773
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.542011
		volcanoTemp     1591.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.218, 0.223, 0.253, 0.050)
		colorShelf     (0.256, 0.262, 0.291, 0.040)
		colorBeach     (0.295, 0.300, 0.329, 0.030)
		colorDesert    (0.333, 0.338, 0.374, 0.020)
		colorLowland   (0.372, 0.377, 0.412, 0.030)
		colorUpland    (0.410, 0.415, 0.450, 0.050)
		colorRock      (0.449, 0.453, 0.501, 0.020)
		colorSnow      (0.449, 0.453, 0.501, 1.000)
		BumpHeight      0.854548
		BumpOffset      0.17091
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.12415
		Period          0.0465909
		Eccentricity    0.108724
		Inclination     4.61644
		AscendingNode   18.2772
		ArgOfPericenter -53.7695
		MeanAnomaly     -178.89
	}
}

Asteroid	"S48"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            2.76481e-009
	Radius          8.44919
	InertiaMoment   0.398921

	RotationPeriod  1360.32
	Obliquity       6.4749
	EqAscendNode    -2.05754

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.434 0.430 0.427)

	Surface
	{
		SurfStyle       0.0899468
		OceanStyle      0.92699
		Randomize      (0.239, -0.325, -0.486)
		colorDistMagn   0.695763
		colorDistFreq   0.0393651
		detailScale     230.719
		colorConversion true
		snowLevel       2
		tropicLatitude  0.224062
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.656896
		terraceProb     0.190163
		erosion         0
		montesMagn      0.429252
		montesFreq      3.0749
		montesSpiky     0.975299
		montesFraction  0.574345
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.234742
		hillsFraction   0.59943
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229021
		craterFreq      0.217316
		craterDensity   0.787819
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.479078
		volcanoTemp     1769.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.174, 0.172, 0.171, 0.000)
		colorShelf     (0.185, 0.183, 0.181, 0.000)
		colorBeach     (0.195, 0.194, 0.192, 0.000)
		colorDesert    (0.206, 0.204, 0.203, 0.000)
		colorLowland   (0.217, 0.215, 0.213, 0.000)
		colorUpland    (0.228, 0.226, 0.224, 0.000)
		colorRock      (0.239, 0.237, 0.235, 0.000)
		colorSnow      (0.250, 0.247, 0.245, 1.000)
		BumpHeight      7.60427
		BumpOffset      1.52085
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.150321
		Period          0.0620741
		Eccentricity    0.125975
		Inclination     6.4749
		AscendingNode   -2.05754
		ArgOfPericenter -84.1019
		MeanAnomaly     9.88531
	}
}

Asteroid	"S49"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.61973e-017
	Radius          0.0171092
	InertiaMoment   0.399866

	RotationPeriod  991.441
	Obliquity       -4.31247
	EqAscendNode    78.247

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.563 0.558 0.555)

	Surface
	{
		SurfStyle       0.194494
		OceanStyle      0.194666
		Randomize      (-0.763, 0.575, 0.165)
		colorDistMagn   0.166511
		colorDistFreq   1.50506e-007
		detailScale     0.467195
		colorConversion true
		snowLevel       2
		tropicLatitude  0.116473
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.385353
		terraceProb     0.173096
		erosion         0
		montesMagn      0.540014
		montesFreq      2.76089
		montesSpiky     0.922647
		montesFraction  0.577824
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.07674e-007
		hillsFraction   0.704963
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234058
		craterFreq      0.229029
		craterDensity   1.00105
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.481591
		volcanoTemp     1380.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.225, 0.223, 0.222, 0.000)
		colorShelf     (0.239, 0.237, 0.236, 0.000)
		colorBeach     (0.253, 0.251, 0.250, 0.000)
		colorDesert    (0.268, 0.265, 0.264, 0.000)
		colorLowland   (0.282, 0.279, 0.278, 0.000)
		colorUpland    (0.296, 0.293, 0.292, 0.000)
		colorRock      (0.310, 0.307, 0.305, 0.000)
		colorSnow      (0.324, 0.321, 0.319, 1.000)
		BumpHeight      0.0153983
		BumpOffset      0.00307965
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.121741
		Period          0.0452413
		Eccentricity    0.124909
		Inclination     -4.31247
		AscendingNode   78.247
		ArgOfPericenter -48.945
		MeanAnomaly     -66.4772
	}
}

Asteroid	"S50"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            2.38351e-014
	Radius          0.221447
	InertiaMoment   0.397941

	Obliquity       -2.20287
	EqAscendNode    172.524
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.641 0.636 0.632)

	Surface
	{
		SurfStyle       0.599155
		OceanStyle      0.92163
		Randomize      (-0.444, 0.558, 0.234)
		colorDistMagn   0.63643
		colorDistFreq   2.2309e-005
		detailScale     6.04698
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00501528
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.699221
		terraceProb     0.26031
		erosion         0
		montesMagn      0.492823
		montesFreq      3.13021
		montesSpiky     0.886464
		montesFraction  0.549776
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000103415
		hillsFraction   0.749325
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.216589
		craterFreq      0.272501
		craterDensity   0.767564
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.385829
		volcanoTemp     1334.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.250, 0.216, 0.177, 0.000)
		colorShelf     (0.256, 0.223, 0.202, 0.000)
		colorBeach     (0.301, 0.261, 0.240, 0.000)
		colorDesert    (0.327, 0.280, 0.234, 0.000)
		colorLowland   (0.359, 0.299, 0.265, 0.000)
		colorUpland    (0.398, 0.362, 0.322, 0.000)
		colorRock      (0.430, 0.394, 0.347, 0.000)
		colorSnow      (0.468, 0.420, 0.366, 1.000)
		BumpHeight      0.199302
		BumpOffset      0.0398604
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.135203
		Period          0.0529495
		Eccentricity    0.072308
		Inclination     -2.20288
		AscendingNode   172.524
		ArgOfPericenter -152.436
		MeanAnomaly     -153.849
	}
}

Asteroid	"S51"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            3.50747e-011
	Radius          1.97063
	InertiaMoment   0.39912

	Obliquity       1.90013
	EqAscendNode    99.2657
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.684 0.681 0.675)

	Surface
	{
		SurfStyle       0.636918
		OceanStyle      0.396646
		Randomize      (-0.768, -0.622, 0.650)
		colorDistMagn   0.33293
		colorDistFreq   0.00227801
		detailScale     53.8113
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0429408
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.452283
		terraceProb     0.376036
		erosion         0
		montesMagn      0.381768
		montesFreq      2.891
		montesSpiky     0.904237
		montesFraction  0.479969
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00998083
		hillsFraction   0.492583
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24928
		craterFreq      0.275479
		craterDensity   1.0196
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.509448
		volcanoTemp     1633.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.267, 0.231, 0.189, 0.000)
		colorShelf     (0.274, 0.238, 0.216, 0.000)
		colorBeach     (0.322, 0.279, 0.257, 0.000)
		colorDesert    (0.349, 0.300, 0.250, 0.000)
		colorLowland   (0.383, 0.320, 0.284, 0.000)
		colorUpland    (0.424, 0.388, 0.344, 0.000)
		colorRock      (0.459, 0.422, 0.371, 0.000)
		colorSnow      (0.500, 0.449, 0.392, 1.000)
		BumpHeight      1.77357
		BumpOffset      0.354713
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.141899
		Period          0.0569312
		Eccentricity    0.174631
		Inclination     1.90013
		AscendingNode   99.2657
		ArgOfPericenter -18.9033
		MeanAnomaly     -74.1516
	}
}

Asteroid	"S52"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            5.16142e-008
	Radius          25.174
	InertiaMoment   0.395214

	Obliquity       1.74285
	EqAscendNode    -100.939
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.491 0.487 0.482)

	Surface
	{
		SurfStyle       0.425628
		OceanStyle      0.981857
		Randomize      (0.700, -0.536, 0.307)
		colorDistMagn   0.672283
		colorDistFreq   0.361834
		detailScale     687.419
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0387089
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.377074
		terraceProb     0.284341
		erosion         0
		montesMagn      0.468042
		montesFreq      2.83557
		montesSpiky     0.943107
		montesFraction  0.621673
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.21576
		hillsFraction   0.58979
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242289
		craterFreq      0.168424
		craterDensity   1.00458
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.467171
		volcanoTemp     1423.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.196, 0.195, 0.193, 0.000)
		colorShelf     (0.209, 0.207, 0.205, 0.000)
		colorBeach     (0.221, 0.219, 0.217, 0.000)
		colorDesert    (0.233, 0.231, 0.229, 0.000)
		colorLowland   (0.245, 0.243, 0.241, 0.000)
		colorUpland    (0.258, 0.256, 0.253, 0.000)
		colorRock      (0.270, 0.268, 0.265, 0.000)
		colorSnow      (0.282, 0.280, 0.277, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.128609
		Period          0.0491233
		Eccentricity    0.171642
		Inclination     1.74285
		AscendingNode   -100.939
		ArgOfPericenter -86.3806
		MeanAnomaly     6.62449
	}
}

Asteroid	"S53"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            3.02375e-016
	Radius          0.0516472
	InertiaMoment   0.39822

	RotationPeriod  820.507
	Obliquity       0.123792
	EqAscendNode    31.0097

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.667 0.665 0.663)

	Surface
	{
		SurfStyle       0.560343
		OceanStyle      0.685817
		Randomize      (-0.319, 0.619, -0.166)
		colorDistMagn   0.860819
		colorDistFreq   1.46684e-006
		detailScale     1.41031
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00415756
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.301308
		terraceProb     0.345226
		erosion         0
		montesMagn      0.675367
		montesFreq      2.52045
		montesSpiky     0.928124
		montesFraction  0.643224
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.65094e-006
		hillsFraction   0.57738
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253321
		craterFreq      0.278363
		craterDensity   0.965258
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.511322
		volcanoTemp     1648.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.260, 0.226, 0.186, 0.000)
		colorShelf     (0.267, 0.233, 0.212, 0.000)
		colorBeach     (0.314, 0.273, 0.252, 0.000)
		colorDesert    (0.340, 0.293, 0.245, 0.000)
		colorLowland   (0.374, 0.313, 0.278, 0.000)
		colorUpland    (0.414, 0.379, 0.338, 0.000)
		colorRock      (0.447, 0.412, 0.365, 0.000)
		colorSnow      (0.487, 0.439, 0.385, 1.000)
		BumpHeight      0.0464825
		BumpOffset      0.00929649
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.124524
		Period          0.0468016
		Eccentricity    0.0676321
		Inclination     0.123792
		AscendingNode   31.0097
		ArgOfPericenter -0.447944
		MeanAnomaly     13.4455
	}
}

Asteroid	"S54"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            4.44961e-013
	Radius          0.459603
	InertiaMoment   0.39931

	RotationPeriod  1248.57
	Obliquity       -0.537188
	EqAscendNode    -163.621

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.604 0.600 0.595)

	Surface
	{
		SurfStyle       0.347483
		OceanStyle      0.259247
		Randomize      (0.740, -0.450, -0.974)
		colorDistMagn   0.00591075
		colorDistFreq   0.000185212
		detailScale     12.5502
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00267442
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.512085
		terraceProb     0.405956
		erosion         0
		montesMagn      0.315647
		montesFreq      3.63166
		montesSpiky     0.979533
		montesFraction  0.637581
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000500546
		hillsFraction   0.810611
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238701
		craterFreq      0.219067
		craterDensity   0.968135
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.530283
		volcanoTemp     1631.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.242, 0.240, 0.238, 0.000)
		colorShelf     (0.257, 0.255, 0.253, 0.000)
		colorBeach     (0.272, 0.270, 0.268, 0.000)
		colorDesert    (0.287, 0.285, 0.283, 0.000)
		colorLowland   (0.302, 0.300, 0.298, 0.000)
		colorUpland    (0.317, 0.315, 0.312, 0.000)
		colorRock      (0.332, 0.330, 0.327, 0.000)
		colorSnow      (0.348, 0.345, 0.342, 1.000)
		BumpHeight      0.413643
		BumpOffset      0.0827286
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.141971
		Period          0.0569746
		Eccentricity    0.179508
		Inclination     -0.537188
		AscendingNode   -163.621
		ArgOfPericenter -156.722
		MeanAnomaly     11.1085
	}
}

Asteroid	"S55"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            6.54783e-010
	Radius          5.87181
	InertiaMoment   0.396577

	Obliquity       2.93209
	EqAscendNode    -51.6366
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.808 0.750 0.690)

	Surface
	{
		SurfStyle       0.054704
		OceanStyle      0.457415
		Randomize      (-0.035, 0.808, -0.298)
		colorDistMagn   0.356892
		colorDistFreq   0.0148716
		detailScale     160.34
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0919948
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.534883
		terraceProb     0.151773
		erosion         0
		montesMagn      0.451894
		montesFreq      2.71245
		montesSpiky     0.933481
		montesFraction  0.888104
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0483679
		hillsFraction   0.611676
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219089
		craterFreq      0.268545
		craterDensity   0.834585
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.582027
		volcanoTemp     1736.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.323, 0.300, 0.276, 0.000)
		colorShelf     (0.343, 0.319, 0.293, 0.000)
		colorBeach     (0.364, 0.337, 0.311, 0.000)
		colorDesert    (0.384, 0.356, 0.328, 0.000)
		colorLowland   (0.404, 0.375, 0.345, 0.000)
		colorUpland    (0.424, 0.394, 0.362, 0.000)
		colorRock      (0.444, 0.412, 0.380, 0.000)
		colorSnow      (0.465, 0.431, 0.397, 1.000)
		BumpHeight      5.28463
		BumpOffset      1.05693
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.129127
		Period          0.0494204
		Eccentricity    0.0340132
		Inclination     2.93209
		AscendingNode   -51.6366
		ArgOfPericenter 57.651
		MeanAnomaly     -94.0896
	}
}

Asteroid	"S56"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            3.83596e-018
	Radius          0.0120454
	InertiaMoment   0.398468

	Obliquity       -4.2665
	EqAscendNode    176.954
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.489 0.479 0.475)

	Surface
	{
		SurfStyle       0.112461
		OceanStyle      0.5553
		Randomize      (0.990, -0.938, 0.125)
		colorDistMagn   0.3413
		colorDistFreq   7.28676e-008
		detailScale     0.328921
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00395175
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.419403
		terraceProb     0.353057
		erosion         0
		montesMagn      0.494003
		montesFreq      2.73508
		montesSpiky     0.934544
		montesFraction  0.423958
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.05968e-007
		hillsFraction   0.524017
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235708
		craterFreq      0.254666
		craterDensity   0.995404
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.517485
		volcanoTemp     1540.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.196, 0.192, 0.190, 0.000)
		colorShelf     (0.208, 0.204, 0.202, 0.000)
		colorBeach     (0.220, 0.216, 0.214, 0.000)
		colorDesert    (0.232, 0.227, 0.225, 0.000)
		colorLowland   (0.244, 0.239, 0.237, 0.000)
		colorUpland    (0.257, 0.251, 0.249, 0.000)
		colorRock      (0.269, 0.263, 0.261, 0.000)
		colorSnow      (0.281, 0.275, 0.273, 1.000)
		BumpHeight      0.0108409
		BumpOffset      0.00216818
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.163585
		Period          0.070469
		Eccentricity    0.117535
		Inclination     -4.2665
		AscendingNode   176.954
		ArgOfPericenter 95.7893
		MeanAnomaly     109.7
	}
}

Asteroid	"S57"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            5.64482e-015
	Radius          0.107191
	InertiaMoment   0.399495

	RotationPeriod  588.942
	Obliquity       0.905393
	EqAscendNode    116.677

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.781 0.777 0.775)

	Surface
	{
		SurfStyle       0.0479781
		OceanStyle      0.0328003
		Randomize      (-0.901, 0.678, 0.141)
		colorDistMagn   0.540504
		colorDistFreq   5.3683e-006
		detailScale     2.92704
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0165866
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.513016
		terraceProb     0.384395
		erosion         0
		montesMagn      0.230653
		montesFreq      2.74689
		montesSpiky     0.860499
		montesFraction  0.504149
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.72684e-005
		hillsFraction   0.539379
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.174371
		craterFreq      0.256057
		craterDensity   0.724189
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.542388
		volcanoTemp     1075.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.312, 0.311, 0.310, 0.000)
		colorShelf     (0.332, 0.330, 0.329, 0.000)
		colorBeach     (0.351, 0.350, 0.349, 0.000)
		colorDesert    (0.371, 0.369, 0.368, 0.000)
		colorLowland   (0.390, 0.389, 0.387, 0.000)
		colorUpland    (0.410, 0.408, 0.407, 0.000)
		colorRock      (0.429, 0.428, 0.426, 0.000)
		colorSnow      (0.449, 0.447, 0.446, 1.000)
		BumpHeight      0.0964722
		BumpOffset      0.0192944
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.120931
		Period          0.0447909
		Eccentricity    0.119053
		Inclination     0.905393
		AscendingNode   116.677
		ArgOfPericenter 85.0338
		MeanAnomaly     94.0863
	}
}

Asteroid	"S58"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            8.30666e-012
	Radius          1.36948
	InertiaMoment   0.397171

	Obliquity       0.370762
	EqAscendNode    -93.8923
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.631 0.624 0.620)

	Surface
	{
		SurfStyle       0.608769
		OceanStyle      0.623401
		Randomize      (0.690, -0.099, 0.435)
		colorDistMagn   0.803494
		colorDistFreq   0.000791751
		detailScale     37.3959
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00883632
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.52615
		terraceProb     0.123171
		erosion         0
		montesMagn      0.698776
		montesFreq      2.94882
		montesSpiky     0.887869
		montesFraction  0.824887
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00426356
		hillsFraction   0.859773
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228361
		craterFreq      0.243008
		craterDensity   0.75921
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.503539
		volcanoTemp     1605.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.246, 0.212, 0.174, 0.000)
		colorShelf     (0.252, 0.218, 0.198, 0.000)
		colorBeach     (0.297, 0.256, 0.236, 0.000)
		colorDesert    (0.322, 0.274, 0.229, 0.000)
		colorLowland   (0.353, 0.293, 0.261, 0.000)
		colorUpland    (0.391, 0.356, 0.316, 0.000)
		colorRock      (0.423, 0.387, 0.341, 0.000)
		colorSnow      (0.461, 0.412, 0.360, 1.000)
		BumpHeight      1.23253
		BumpOffset      0.246506
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.122975
		Period          0.045931
		Eccentricity    0.133692
		Inclination     0.370762
		AscendingNode   -93.8923
		ArgOfPericenter 47.8866
		MeanAnomaly     65.718
	}
}

Asteroid	"S59"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.22237e-008
	Radius          15.5759
	InertiaMoment   0.398695

	Obliquity       4.11761
	EqAscendNode    -141.929
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.472 0.466 0.464)

	Surface
	{
		SurfStyle       0.896049
		OceanStyle      0.600222
		Randomize      (0.628, -0.225, 0.463)
		colorDistMagn   0.632148
		colorDistFreq   0.187273
		detailScale     425.326
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0468265
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.4424
		terraceProb     0.402682
		erosion         0
		montesMagn      0.578174
		montesFreq      3.13976
		montesSpiky     0.96807
		montesFraction  0.212959
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.810697
		hillsFraction   0.905641
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256939
		craterFreq      0.241787
		craterDensity   0.649926
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.433455
		volcanoTemp     1574.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.161, 0.163, 0.185, 0.050)
		colorShelf     (0.189, 0.191, 0.213, 0.040)
		colorBeach     (0.217, 0.219, 0.241, 0.030)
		colorDesert    (0.246, 0.247, 0.274, 0.020)
		colorLowland   (0.274, 0.275, 0.301, 0.030)
		colorUpland    (0.302, 0.303, 0.329, 0.050)
		colorRock      (0.330, 0.331, 0.366, 0.020)
		colorSnow      (0.330, 0.331, 0.366, 1.000)
		BumpHeight      14.0183
		BumpOffset      2.80366
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.136342
		Period          0.0536197
		Eccentricity    0.0929813
		Inclination     4.11761
		AscendingNode   -141.929
		ArgOfPericenter 39.8489
		MeanAnomaly     10.6324
	}
}

Asteroid	"S60"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            7.16109e-017
	Radius          0.0319539
	InertiaMoment   0.399675

	RotationPeriod  881.721
	Obliquity       -3.08735
	EqAscendNode    -26.4447

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.820 0.734 0.701)

	Surface
	{
		SurfStyle       0.034892
		OceanStyle      0.762186
		Randomize      (-0.314, 0.213, 0.057)
		colorDistMagn   0.503126
		colorDistFreq   7.98528e-007
		detailScale     0.872554
		colorConversion true
		snowLevel       2
		tropicLatitude  0.104717
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.560807
		terraceProb     0.159846
		erosion         0
		montesMagn      0.442455
		montesFreq      3.29593
		montesSpiky     0.932913
		montesFraction  0.57721
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.77535e-006
		hillsFraction   0.437241
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.285112
		craterFreq      0.18263
		craterDensity   0.804487
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.431377
		volcanoTemp     1252.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.328, 0.293, 0.280, 0.000)
		colorShelf     (0.349, 0.312, 0.298, 0.000)
		colorBeach     (0.369, 0.330, 0.315, 0.000)
		colorDesert    (0.390, 0.348, 0.333, 0.000)
		colorLowland   (0.410, 0.367, 0.350, 0.000)
		colorUpland    (0.431, 0.385, 0.368, 0.000)
		colorRock      (0.451, 0.403, 0.385, 0.000)
		colorSnow      (0.472, 0.422, 0.403, 1.000)
		BumpHeight      0.0287585
		BumpOffset      0.0057517
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.112584
		Period          0.0402346
		Eccentricity    0.0537403
		Inclination     -3.08735
		AscendingNode   -26.4447
		ArgOfPericenter 102.304
		MeanAnomaly     -66.8461
	}
}

Asteroid	"S61"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.05379e-013
	Radius          0.284355
	InertiaMoment   0.397586

	RotationPeriod  3009.73
	Obliquity       -3.03916
	EqAscendNode    165.225

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.670 0.628 0.581)

	Surface
	{
		SurfStyle       0.588682
		OceanStyle      0.875854
		Randomize      (0.279, -0.310, 0.867)
		colorDistMagn   0.942097
		colorDistFreq   1.20918e-005
		detailScale     7.76478
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0136323
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.57396
		terraceProb     0.29785
		erosion         0
		montesMagn      0.40336
		montesFreq      2.93196
		montesSpiky     0.9385
		montesFraction  0.607298
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000148007
		hillsFraction   0.892155
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214113
		craterFreq      0.203497
		craterDensity   0.830015
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.47067
		volcanoTemp     1538.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.261, 0.213, 0.163, 0.000)
		colorShelf     (0.268, 0.220, 0.186, 0.000)
		colorBeach     (0.315, 0.257, 0.221, 0.000)
		colorDesert    (0.342, 0.276, 0.215, 0.000)
		colorLowland   (0.375, 0.295, 0.244, 0.000)
		colorUpland    (0.415, 0.358, 0.296, 0.000)
		colorRock      (0.449, 0.389, 0.320, 0.000)
		colorSnow      (0.489, 0.414, 0.337, 1.000)
		BumpHeight      0.255919
		BumpOffset      0.0511838
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.142386
		Period          0.0572248
		Eccentricity    0.0706351
		Inclination     -3.03916
		AscendingNode   165.225
		ArgOfPericenter 77.3341
		MeanAnomaly     90.7896
	}
}

Asteroid	"S62"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.55071e-010
	Radius          3.6329
	InertiaMoment   0.398906

	RotationPeriod  898.186
	Obliquity       6.27417
	EqAscendNode    -75.5764

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.610 0.607 0.606)

	Surface
	{
		SurfStyle       0.839024
		OceanStyle      0.405992
		Randomize      (0.391, 0.748, -0.791)
		colorDistMagn   0.216627
		colorDistFreq   0.00139328
		detailScale     99.2024
		colorConversion true
		snowLevel       2
		tropicLatitude  0.172088
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.737335
		terraceProb     0.183499
		erosion         0
		montesMagn      0.577678
		montesFreq      2.41052
		montesSpiky     0.979411
		montesFraction  0.916215
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.026173
		hillsFraction   0.557773
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.215853
		craterFreq      0.170679
		craterDensity   0.884516
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.490755
		volcanoTemp     1477.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.238, 0.206, 0.170, 0.000)
		colorShelf     (0.244, 0.213, 0.194, 0.000)
		colorBeach     (0.287, 0.249, 0.230, 0.000)
		colorDesert    (0.311, 0.267, 0.224, 0.000)
		colorLowland   (0.342, 0.285, 0.255, 0.000)
		colorUpland    (0.378, 0.346, 0.309, 0.000)
		colorRock      (0.409, 0.377, 0.333, 0.000)
		colorSnow      (0.446, 0.401, 0.352, 1.000)
		BumpHeight      3.26961
		BumpOffset      0.653922
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.132264
		Period          0.0512324
		Eccentricity    0.194535
		Inclination     6.27417
		AscendingNode   -75.5764
		ArgOfPericenter -129.204
		MeanAnomaly     104.887
	}
}

Asteroid	"S63"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            2.28195e-007
	Radius          47.0118
	InertiaMoment   0.399852

	RotationPeriod  1207.27
	Obliquity       -0.917335
	EqAscendNode    21.6304

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.469 0.379 0.343)

	Surface
	{
		SurfStyle       0.85932
		OceanStyle      0.162987
		Randomize      (0.138, -0.827, 0.686)
		colorDistMagn   0.959435
		colorDistFreq   1.20333
		detailScale     1283.73
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0314476
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.362737
		terraceProb     0.121491
		erosion         0
		montesMagn      0.370562
		montesFreq      2.51513
		montesSpiky     0.83663
		montesFraction  0.432564
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.10747
		hillsFraction   0.615658
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240629
		craterFreq      0.274913
		craterDensity   0.954971
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.454033
		volcanoTemp     1774.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.159, 0.133, 0.137, 0.050)
		colorShelf     (0.188, 0.155, 0.158, 0.040)
		colorBeach     (0.216, 0.178, 0.179, 0.030)
		colorDesert    (0.244, 0.201, 0.203, 0.020)
		colorLowland   (0.272, 0.223, 0.223, 0.030)
		colorUpland    (0.300, 0.246, 0.244, 0.050)
		colorRock      (0.328, 0.269, 0.271, 0.020)
		colorSnow      (0.328, 0.269, 0.271, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.122934
		Period          0.0459083
		Eccentricity    0.133405
		Inclination     -0.917335
		AscendingNode   21.6304
		ArgOfPericenter -134.157
		MeanAnomaly     28.4536
	}
}

Asteroid	"S64"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.33685e-015
	Radius          0.0663188
	InertiaMoment   0.397918

	RotationPeriod  1724.81
	Obliquity       2.27568
	EqAscendNode    -14.8179

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.599 0.442 0.346)

	Surface
	{
		SurfStyle       0.797357
		OceanStyle      0.7003
		Randomize      (-0.385, -0.574, 0.724)
		colorDistMagn   0.871186
		colorDistFreq   3.13651e-006
		detailScale     1.81095
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0786916
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.629359
		terraceProb     0.298654
		erosion         0
		montesMagn      0.439784
		montesFreq      3.2352
		montesSpiky     0.828003
		montesFraction  0.459273
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.24149e-005
		hillsFraction   0.448652
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256753
		craterFreq      0.207706
		craterDensity   0.932042
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.527454
		volcanoTemp     1273.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.233, 0.150, 0.097, 0.000)
		colorShelf     (0.239, 0.155, 0.111, 0.000)
		colorBeach     (0.281, 0.181, 0.132, 0.000)
		colorDesert    (0.305, 0.194, 0.128, 0.000)
		colorLowland   (0.335, 0.208, 0.145, 0.000)
		colorUpland    (0.371, 0.252, 0.177, 0.000)
		colorRock      (0.401, 0.274, 0.190, 0.000)
		colorSnow      (0.437, 0.292, 0.201, 1.000)
		BumpHeight      0.0596869
		BumpOffset      0.0119374
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.128728
		Period          0.0491914
		Eccentricity    0.146545
		Inclination     2.27568
		AscendingNode   -14.8179
		ArgOfPericenter 144.196
		MeanAnomaly     170.878
	}
}

Asteroid	"S65"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.96724e-012
	Radius          0.847293
	InertiaMoment   0.399105

	Obliquity       -4.57399
	EqAscendNode    7.02285
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.723 0.721 0.719)

	Surface
	{
		SurfStyle       0.799899
		OceanStyle      0.0624204
		Randomize      (-0.403, -0.239, -0.190)
		colorDistMagn   0.550822
		colorDistFreq   0.00025129
		detailScale     23.1367
		colorConversion true
		snowLevel       2
		tropicLatitude  0.158688
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.310604
		terraceProb     0.303238
		erosion         0
		montesMagn      0.579877
		montesFreq      3.73616
		montesSpiky     0.914112
		montesFraction  0.623364
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00190937
		hillsFraction   0.808198
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258449
		craterFreq      0.186136
		craterDensity   0.926142
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.434419
		volcanoTemp     1450.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.282, 0.245, 0.201, 0.000)
		colorShelf     (0.289, 0.252, 0.230, 0.000)
		colorBeach     (0.340, 0.296, 0.273, 0.000)
		colorDesert    (0.369, 0.317, 0.266, 0.000)
		colorLowland   (0.405, 0.339, 0.302, 0.000)
		colorUpland    (0.449, 0.411, 0.367, 0.000)
		colorRock      (0.485, 0.447, 0.395, 0.000)
		colorSnow      (0.528, 0.476, 0.417, 1.000)
		BumpHeight      0.762564
		BumpOffset      0.152513
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.168106
		Period          0.0734101
		Eccentricity    0.0763753
		Inclination     -4.57399
		AscendingNode   7.02285
		ArgOfPericenter -134.59
		MeanAnomaly     -29.1665
	}
}

Asteroid	"S66"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            2.8949e-009
	Radius          10.9663
	InertiaMoment   0.394932

	Obliquity       -3.13511
	EqAscendNode    -120.807
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.741 0.660 0.593)

	Surface
	{
		SurfStyle       0.581957
		OceanStyle      0.308893
		Randomize      (-0.174, 0.364, -0.121)
		colorDistMagn   0.798176
		colorDistFreq   0.0996299
		detailScale     299.452
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0540022
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.516151
		terraceProb     0.181835
		erosion         0
		montesMagn      0.470029
		montesFreq      3.06731
		montesSpiky     0.978993
		montesFraction  0.802403
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.421411
		hillsFraction   0.650351
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213287
		craterFreq      0.154675
		craterDensity   0.789021
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48988
		volcanoTemp     1453.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.289, 0.224, 0.166, 0.000)
		colorShelf     (0.297, 0.231, 0.190, 0.000)
		colorBeach     (0.348, 0.271, 0.225, 0.000)
		colorDesert    (0.378, 0.290, 0.219, 0.000)
		colorLowland   (0.415, 0.310, 0.249, 0.000)
		colorUpland    (0.460, 0.376, 0.302, 0.000)
		colorRock      (0.497, 0.409, 0.326, 0.000)
		colorSnow      (0.541, 0.436, 0.344, 1.000)
		BumpHeight      9.86965
		BumpOffset      1.97393
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.123409
		Period          0.0461744
		Eccentricity    0.110262
		Inclination     -3.13511
		AscendingNode   -120.807
		ArgOfPericenter -144.171
		MeanAnomaly     -117.959
	}
}

Asteroid	"S67"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.69594e-017
	Radius          0.0154672
	InertiaMoment   0.3982

	RotationPeriod  880.794
	Obliquity       0.919764
	EqAscendNode    -83.905

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.761 0.729 0.677)

	Surface
	{
		SurfStyle       0.121921
		OceanStyle      0.607609
		Randomize      (-0.540, -0.643, 0.412)
		colorDistMagn   0.887122
		colorDistFreq   6.81387e-008
		detailScale     0.422359
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0238742
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.519704
		terraceProb     0.284098
		erosion         0
		montesMagn      0.454912
		montesFreq      2.59603
		montesSpiky     0.877244
		montesFraction  0.740708
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.13211e-007
		hillsFraction   0.471213
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.280179
		craterFreq      0.188568
		craterDensity   0.965936
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.57576
		volcanoTemp     1394.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.304, 0.292, 0.271, 0.000)
		colorShelf     (0.324, 0.310, 0.288, 0.000)
		colorBeach     (0.343, 0.328, 0.305, 0.000)
		colorDesert    (0.362, 0.346, 0.321, 0.000)
		colorLowland   (0.381, 0.365, 0.338, 0.000)
		colorUpland    (0.400, 0.383, 0.355, 0.000)
		colorRock      (0.419, 0.401, 0.372, 0.000)
		colorSnow      (0.438, 0.419, 0.389, 1.000)
		BumpHeight      0.0139205
		BumpOffset      0.0027841
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.130551
		Period          0.0502404
		Eccentricity    0.130728
		Inclination     0.919764
		AscendingNode   -83.905
		ArgOfPericenter 98.5102
		MeanAnomaly     -34.678
	}
}

Asteroid	"S68"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            2.49567e-014
	Radius          0.197611
	InertiaMoment   0.399296

	RotationPeriod  963.076
	Obliquity       4.23891
	EqAscendNode    169.274

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.417 0.415 0.410)

	Surface
	{
		SurfStyle       0.345681
		OceanStyle      0.497272
		Randomize      (0.241, -0.793, 0.869)
		colorDistMagn   0.438496
		colorDistFreq   1.02278e-005
		detailScale     5.39609
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0138147
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.354733
		terraceProb     0.145401
		erosion         0
		montesMagn      0.648648
		montesFreq      3.72368
		montesSpiky     0.808642
		montesFraction  0.594417
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.35585e-005
		hillsFraction   0.711533
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234449
		craterFreq      0.247611
		craterDensity   0.950332
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.495948
		volcanoTemp     1499.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.167, 0.166, 0.164, 0.000)
		colorShelf     (0.177, 0.176, 0.174, 0.000)
		colorBeach     (0.188, 0.187, 0.185, 0.000)
		colorDesert    (0.198, 0.197, 0.195, 0.000)
		colorLowland   (0.209, 0.207, 0.205, 0.000)
		colorUpland    (0.219, 0.218, 0.215, 0.000)
		colorRock      (0.230, 0.228, 0.226, 0.000)
		colorSnow      (0.240, 0.239, 0.236, 1.000)
		BumpHeight      0.17785
		BumpOffset      0.0355699
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.13856
		Period          0.0549337
		Eccentricity    0.131166
		Inclination     4.23891
		AscendingNode   169.274
		ArgOfPericenter 175.594
		MeanAnomaly     77.8292
	}
}

Asteroid	"S69"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            3.6725e-011
	Radius          2.55769
	InertiaMoment   0.396516

	RotationPeriod  1394.82
	Obliquity       -3.9791
	EqAscendNode    -99.7697

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.426 0.423 0.421)

	Surface
	{
		SurfStyle       0.534121
		OceanStyle      0.376453
		Randomize      (-0.003, -0.660, -0.198)
		colorDistMagn   0.806737
		colorDistFreq   0.00321036
		detailScale     69.8421
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0893334
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.649514
		terraceProb     0.364274
		erosion         0
		montesMagn      0.363419
		montesFreq      2.90182
		montesSpiky     0.956627
		montesFraction  0.677437
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0179957
		hillsFraction   0.924713
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23987
		craterFreq      0.256844
		craterDensity   1.0288
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.515217
		volcanoTemp     1743.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.166, 0.144, 0.118, 0.000)
		colorShelf     (0.170, 0.148, 0.135, 0.000)
		colorBeach     (0.200, 0.174, 0.160, 0.000)
		colorDesert    (0.217, 0.186, 0.156, 0.000)
		colorLowland   (0.238, 0.199, 0.177, 0.000)
		colorUpland    (0.264, 0.241, 0.215, 0.000)
		colorRock      (0.285, 0.263, 0.232, 0.000)
		colorSnow      (0.311, 0.279, 0.244, 1.000)
		BumpHeight      2.30192
		BumpOffset      0.460385
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.135357
		Period          0.0530402
		Eccentricity    0.119075
		Inclination     -3.9791
		AscendingNode   -99.7697
		ArgOfPericenter 78.1984
		MeanAnomaly     147.246
	}
}

Asteroid	"S70"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            5.40428e-008
	Radius          22.7581
	InertiaMoment   0.39845

	RotationPeriod  1734.66
	Obliquity       -3.32157
	EqAscendNode    -116.688

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.628 0.625 0.623)

	Surface
	{
		SurfStyle       0.536172
		OceanStyle      0.936294
		Randomize      (0.869, -0.430, 0.991)
		colorDistMagn   0.50758
		colorDistFreq   0.307073
		detailScale     621.448
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0607879
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.324829
		terraceProb     0.146015
		erosion         0
		montesMagn      0.478311
		montesFreq      3.61639
		montesSpiky     0.917264
		montesFraction  0.564159
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.28391
		hillsFraction   0.731538
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236711
		craterFreq      0.260814
		craterDensity   0.849029
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.460557
		volcanoTemp     1444.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.245, 0.212, 0.174, 0.000)
		colorShelf     (0.251, 0.219, 0.199, 0.000)
		colorBeach     (0.295, 0.256, 0.237, 0.000)
		colorDesert    (0.320, 0.275, 0.231, 0.000)
		colorLowland   (0.352, 0.294, 0.262, 0.000)
		colorUpland    (0.389, 0.356, 0.318, 0.000)
		colorRock      (0.421, 0.387, 0.343, 0.000)
		colorSnow      (0.458, 0.412, 0.361, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.129217
		Period          0.0494723
		Eccentricity    0.175541
		Inclination     -3.32157
		AscendingNode   -116.688
		ArgOfPericenter 42.6585
		MeanAnomaly     56.4472
	}
}

Asteroid	"S71"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            3.16603e-016
	Radius          0.0460879
	InertiaMoment   0.39948

	RotationPeriod  2252.5
	Obliquity       -3.1951
	EqAscendNode    138.258

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.615 0.612 0.609)

	Surface
	{
		SurfStyle       0.88772
		OceanStyle      0.980236
		Randomize      (0.027, -0.380, 0.404)
		colorDistMagn   0.371109
		colorDistFreq   1.58941e-006
		detailScale     1.25851
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0397054
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.466321
		terraceProb     0.10329
		erosion         0
		montesMagn      0.26311
		montesFreq      3.48619
		montesSpiky     0.99209
		montesFraction  0.909948
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.36723e-006
		hillsFraction   0.475875
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256252
		craterFreq      0.178952
		craterDensity   0.871593
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.470196
		volcanoTemp     1933.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.209, 0.214, 0.244, 0.050)
		colorShelf     (0.246, 0.251, 0.280, 0.040)
		colorBeach     (0.283, 0.288, 0.317, 0.030)
		colorDesert    (0.320, 0.324, 0.359, 0.020)
		colorLowland   (0.356, 0.361, 0.396, 0.030)
		colorUpland    (0.393, 0.398, 0.433, 0.050)
		colorRock      (0.430, 0.434, 0.481, 0.020)
		colorSnow      (0.430, 0.434, 0.481, 1.000)
		BumpHeight      0.0414791
		BumpOffset      0.00829583
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.13254
		Period          0.0513929
		Eccentricity    0.196212
		Inclination     -3.1951
		AscendingNode   138.258
		ArgOfPericenter 47.7298
		MeanAnomaly     79.3891
	}
}

Asteroid	"S72"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            4.65898e-013
	Radius          0.596523
	InertiaMoment   0.397134

	Obliquity       -1.51981
	EqAscendNode    -133.989
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.575 0.572 0.567)

	Surface
	{
		SurfStyle       0.155859
		OceanStyle      0.233498
		Randomize      (0.528, 0.430, -0.524)
		colorDistMagn   0.0997913
		colorDistFreq   0.000222475
		detailScale     16.2891
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0207293
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.473522
		terraceProb     0.2904
		erosion         0
		montesMagn      0.57705
		montesFreq      2.59729
		montesSpiky     0.978815
		montesFraction  0.584802
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000919058
		hillsFraction   0.785544
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244685
		craterFreq      0.211552
		craterDensity   0.987515
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.575321
		volcanoTemp     1705.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.230, 0.229, 0.227, 0.000)
		colorShelf     (0.244, 0.243, 0.241, 0.000)
		colorBeach     (0.259, 0.257, 0.255, 0.000)
		colorDesert    (0.273, 0.272, 0.270, 0.000)
		colorLowland   (0.287, 0.286, 0.284, 0.000)
		colorUpland    (0.302, 0.300, 0.298, 0.000)
		colorRock      (0.316, 0.315, 0.312, 0.000)
		colorSnow      (0.331, 0.329, 0.326, 1.000)
		BumpHeight      0.536871
		BumpOffset      0.107374
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.12113
		Period          0.0449016
		Eccentricity    0.1205
		Inclination     -1.51981
		AscendingNode   -133.989
		ArgOfPericenter -42.3995
		MeanAnomaly     18.3018
	}
}

Asteroid	"S73"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            6.85593e-010
	Radius          5.3083
	InertiaMoment   0.398678

	Obliquity       -3.60889
	EqAscendNode    -124.278
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.407 0.404 0.402)

	Surface
	{
		SurfStyle       0.335009
		OceanStyle      0.561673
		Randomize      (0.902, -0.488, -0.836)
		colorDistMagn   0.0601979
		colorDistFreq   0.0155826
		detailScale     144.952
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0588069
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.531797
		terraceProb     0.142356
		erosion         0
		montesMagn      0.630291
		montesFreq      3.64726
		montesSpiky     0.936882
		montesFraction  0.753233
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0844344
		hillsFraction   0.566334
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.204383
		craterFreq      0.214438
		craterDensity   0.868165
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.516262
		volcanoTemp     1446.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.163, 0.161, 0.161, 0.000)
		colorShelf     (0.173, 0.172, 0.171, 0.000)
		colorBeach     (0.183, 0.182, 0.181, 0.000)
		colorDesert    (0.193, 0.192, 0.191, 0.000)
		colorLowland   (0.203, 0.202, 0.201, 0.000)
		colorUpland    (0.214, 0.212, 0.211, 0.000)
		colorRock      (0.224, 0.222, 0.221, 0.000)
		colorSnow      (0.234, 0.232, 0.231, 1.000)
		BumpHeight      4.77747
		BumpOffset      0.955494
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.12508
		Period          0.0471156
		Eccentricity    0.118996
		Inclination     -3.60889
		AscendingNode   -124.278
		ArgOfPericenter 160.669
		MeanAnomaly     -33.9032
	}
}

Asteroid	"S74"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            4.01645e-018
	Radius          0.0107489
	InertiaMoment   0.399661

	RotationPeriod  1162.78
	Obliquity       -3.33301
	EqAscendNode    27.9096

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.416 0.410 0.405)

	Surface
	{
		SurfStyle       0.322563
		OceanStyle      0.989585
		Randomize      (0.865, 0.895, -0.792)
		colorDistMagn   0.496096
		colorDistFreq   3.59164e-008
		detailScale     0.293515
		colorConversion true
		snowLevel       2
		tropicLatitude  0.112667
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.477251
		terraceProb     0.260806
		erosion         0
		montesMagn      0.320595
		montesFreq      2.59471
		montesSpiky     0.872013
		montesFraction  0.772139
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.04787e-007
		hillsFraction   0.389833
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.274599
		craterFreq      0.15556
		craterDensity   0.977022
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.584808
		volcanoTemp     1706.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.166, 0.164, 0.162, 0.000)
		colorShelf     (0.177, 0.174, 0.172, 0.000)
		colorBeach     (0.187, 0.185, 0.182, 0.000)
		colorDesert    (0.198, 0.195, 0.192, 0.000)
		colorLowland   (0.208, 0.205, 0.203, 0.000)
		colorUpland    (0.218, 0.215, 0.213, 0.000)
		colorRock      (0.229, 0.226, 0.223, 0.000)
		colorSnow      (0.239, 0.236, 0.233, 1.000)
		BumpHeight      0.00967397
		BumpOffset      0.00193479
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.119895
		Period          0.0442165
		Eccentricity    0.111439
		Inclination     -3.33301
		AscendingNode   27.9096
		ArgOfPericenter 72.341
		MeanAnomaly     -11.4571
	}
}

Asteroid	"S75"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            5.91042e-015
	Radius          0.139124
	InertiaMoment   0.397558

	RotationPeriod  1523.34
	Obliquity       0.923095
	EqAscendNode    5.30497

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.785 0.732 0.653)

	Surface
	{
		SurfStyle       0.81826
		OceanStyle      0.360787
		Randomize      (0.244, -0.384, 0.799)
		colorDistMagn   0.0927519
		colorDistFreq   6.82874e-006
		detailScale     3.79903
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0321817
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.572511
		terraceProb     0.40167
		erosion         0
		montesMagn      0.597569
		montesFreq      2.44594
		montesSpiky     0.995806
		montesFraction  0.712101
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.9553e-005
		hillsFraction   0.648341
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241124
		craterFreq      0.255767
		craterDensity   0.821069
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.438868
		volcanoTemp     1652.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.306, 0.249, 0.183, 0.000)
		colorShelf     (0.314, 0.256, 0.209, 0.000)
		colorBeach     (0.369, 0.300, 0.248, 0.000)
		colorDesert    (0.400, 0.322, 0.242, 0.000)
		colorLowland   (0.440, 0.344, 0.274, 0.000)
		colorUpland    (0.487, 0.417, 0.333, 0.000)
		colorRock      (0.526, 0.454, 0.359, 0.000)
		colorSnow      (0.573, 0.483, 0.379, 1.000)
		BumpHeight      0.125212
		BumpOffset      0.0250424
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.118498
		Period          0.0434457
		Eccentricity    0.10096
		Inclination     0.923095
		AscendingNode   5.30497
		ArgOfPericenter -16.1965
		MeanAnomaly     108.869
	}
}

Asteroid	"S76"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            8.6975e-012
	Radius          1.23805
	InertiaMoment   0.39889

	RotationPeriod  1923.4
	Obliquity       1.91617
	EqAscendNode    -75.8104

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.432 0.424 0.420)

	Surface
	{
		SurfStyle       0.0683465
		OceanStyle      0.756649
		Randomize      (-0.201, -0.285, 0.239)
		colorDistMagn   0.469945
		colorDistFreq   0.000706796
		detailScale     33.8071
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0527476
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.589013
		terraceProb     0.370181
		erosion         0
		montesMagn      0.531625
		montesFreq      3.2553
		montesSpiky     0.924448
		montesFraction  0.691818
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00275897
		hillsFraction   0.796059
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225977
		craterFreq      0.274441
		craterDensity   1.09612
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.579954
		volcanoTemp     1645.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.173, 0.170, 0.168, 0.000)
		colorShelf     (0.184, 0.180, 0.178, 0.000)
		colorBeach     (0.195, 0.191, 0.189, 0.000)
		colorDesert    (0.205, 0.202, 0.199, 0.000)
		colorLowland   (0.216, 0.212, 0.210, 0.000)
		colorUpland    (0.227, 0.223, 0.220, 0.000)
		colorRock      (0.238, 0.233, 0.231, 0.000)
		colorSnow      (0.249, 0.244, 0.241, 1.000)
		BumpHeight      1.11425
		BumpOffset      0.22285
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.119294
		Period          0.0438843
		Eccentricity    0.10696
		Inclination     1.91617
		AscendingNode   -75.8104
		ArgOfPericenter 120.951
		MeanAnomaly     -104.344
	}
}

Asteroid	"S77"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.27988e-008
	Radius          15.8164
	InertiaMoment   0.399838

	Obliquity       2.85181
	EqAscendNode    176.431
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.465 0.459 0.452)

	Surface
	{
		SurfStyle       0.316354
		OceanStyle      0.341892
		Randomize      (-0.036, -0.820, 0.772)
		colorDistMagn   0.321165
		colorDistFreq   0.101633
		detailScale     431.894
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0031074
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.525368
		terraceProb     0.157292
		erosion         0
		montesMagn      0.339244
		montesFreq      3.43274
		montesSpiky     0.905976
		montesFraction  0.805264
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.501587
		hillsFraction   0.541919
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226996
		craterFreq      0.216437
		craterDensity   0.994057
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.523663
		volcanoTemp     1552.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.186, 0.184, 0.181, 0.000)
		colorShelf     (0.198, 0.195, 0.192, 0.000)
		colorBeach     (0.209, 0.207, 0.203, 0.000)
		colorDesert    (0.221, 0.218, 0.215, 0.000)
		colorLowland   (0.232, 0.230, 0.226, 0.000)
		colorUpland    (0.244, 0.241, 0.237, 0.000)
		colorRock      (0.256, 0.253, 0.248, 0.000)
		colorSnow      (0.267, 0.264, 0.260, 1.000)
		BumpHeight      14.2348
		BumpOffset      2.84696
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.114952
		Period          0.0415104
		Eccentricity    0.0516142
		Inclination     2.85181
		AscendingNode   176.431
		ArgOfPericenter 9.4447
		MeanAnomaly     109.142
	}
}

Asteroid	"S78"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            7.49803e-017
	Radius          0.0324474
	InertiaMoment   0.397894

	RotationPeriod  2677.4
	Obliquity       1.12789
	EqAscendNode    43.2429

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.480 0.474 0.470)

	Surface
	{
		SurfStyle       0.155032
		OceanStyle      0.705409
		Randomize      (-0.343, -0.336, -0.678)
		colorDistMagn   0.0616419
		colorDistFreq   3.46351e-007
		detailScale     0.886031
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0365922
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.633541
		terraceProb     0.216054
		erosion         0
		montesMagn      0.313435
		montesFreq      2.95622
		montesSpiky     0.79449
		montesFraction  0.777511
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.80055e-006
		hillsFraction   0.675476
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231044
		craterFreq      0.237254
		craterDensity   0.841969
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.506094
		volcanoTemp     1448.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.192, 0.190, 0.188, 0.000)
		colorShelf     (0.204, 0.201, 0.200, 0.000)
		colorBeach     (0.216, 0.213, 0.212, 0.000)
		colorDesert    (0.228, 0.225, 0.223, 0.000)
		colorLowland   (0.240, 0.237, 0.235, 0.000)
		colorUpland    (0.252, 0.249, 0.247, 0.000)
		colorRock      (0.264, 0.261, 0.259, 0.000)
		colorSnow      (0.276, 0.272, 0.270, 1.000)
		BumpHeight      0.0292027
		BumpOffset      0.00584054
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.131702
		Period          0.0509061
		Eccentricity    0.121176
		Inclination     1.12789
		AscendingNode   43.2429
		ArgOfPericenter -71.1706
		MeanAnomaly     -137.353
	}
}

Asteroid	"S79"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.10337e-013
	Radius          0.288747
	InertiaMoment   0.39909

	Obliquity       5.64
	EqAscendNode    162.063
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.579 0.574 0.567)

	Surface
	{
		SurfStyle       0.488387
		OceanStyle      0.129859
		Randomize      (-0.785, -0.254, -0.631)
		colorDistMagn   0.483506
		colorDistFreq   6.47493e-005
		detailScale     7.88471
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0306378
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.718842
		terraceProb     0.4566
		erosion         0
		montesMagn      0.52518
		montesFreq      2.51121
		montesSpiky     0.830717
		montesFraction  0.0797539
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000224722
		hillsFraction   0.694581
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232759
		craterFreq      0.235654
		craterDensity   0.840182
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.513174
		volcanoTemp     1201.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.232, 0.230, 0.227, 0.000)
		colorShelf     (0.246, 0.244, 0.241, 0.000)
		colorBeach     (0.261, 0.259, 0.255, 0.000)
		colorDesert    (0.275, 0.273, 0.269, 0.000)
		colorLowland   (0.290, 0.287, 0.283, 0.000)
		colorUpland    (0.304, 0.302, 0.297, 0.000)
		colorRock      (0.319, 0.316, 0.312, 0.000)
		colorSnow      (0.333, 0.330, 0.326, 1.000)
		BumpHeight      0.259872
		BumpOffset      0.0519744
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.118174
		Period          0.0432678
		Eccentricity    0.0984983
		Inclination     5.64
		AscendingNode   162.063
		ArgOfPericenter 11.3769
		MeanAnomaly     139.935
	}
}

Asteroid	"S80"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.62368e-010
	Radius          3.68901
	InertiaMoment   0.394486

	Obliquity       3.00384
	EqAscendNode    30.7307
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.679 0.530 0.472)

	Surface
	{
		SurfStyle       0.0959814
		OceanStyle      0.653416
		Randomize      (0.632, 0.251, -0.370)
		colorDistMagn   0.515399
		colorDistFreq   0.00471294
		detailScale     100.734
		colorConversion true
		snowLevel       2
		tropicLatitude  0.10093
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.378402
		terraceProb     0.218601
		erosion         0
		montesMagn      0.415773
		montesFreq      3.22058
		montesSpiky     0.873664
		montesFraction  0.603275
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0366609
		hillsFraction   0.731639
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23074
		craterFreq      0.268995
		craterDensity   0.816818
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.561106
		volcanoTemp     1316.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.272, 0.212, 0.189, 0.000)
		colorShelf     (0.289, 0.225, 0.201, 0.000)
		colorBeach     (0.305, 0.238, 0.212, 0.000)
		colorDesert    (0.322, 0.252, 0.224, 0.000)
		colorLowland   (0.339, 0.265, 0.236, 0.000)
		colorUpland    (0.356, 0.278, 0.248, 0.000)
		colorRock      (0.373, 0.291, 0.260, 0.000)
		colorSnow      (0.390, 0.304, 0.271, 1.000)
		BumpHeight      3.32011
		BumpOffset      0.664021
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.125994
		Period          0.0476327
		Eccentricity    0.154449
		Inclination     3.00384
		AscendingNode   30.7307
		ArgOfPericenter 104.345
		MeanAnomaly     -152.138
	}
}

Asteroid	"S81"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            2.38932e-007
	Radius          47.7376
	InertiaMoment   0.398179

	Obliquity       3.97145
	EqAscendNode    17.984
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.560 0.484 0.394)

	Surface
	{
		SurfStyle       0.229527
		OceanStyle      0.391531
		Randomize      (0.058, -0.576, -0.619)
		colorDistMagn   0.648316
		colorDistFreq   1.26141
		detailScale     1303.56
		colorConversion true
		snowLevel       2
		tropicLatitude  0.136496
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.346912
		terraceProb     0.223532
		erosion         0
		montesMagn      0.602823
		montesFreq      2.92115
		montesSpiky     0.812669
		montesFraction  0.206311
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.22498
		hillsFraction   0.761226
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246105
		craterFreq      0.254338
		craterDensity   0.801275
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.528485
		volcanoTemp     1453.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.224, 0.193, 0.158, 0.000)
		colorShelf     (0.238, 0.206, 0.167, 0.000)
		colorBeach     (0.252, 0.218, 0.177, 0.000)
		colorDesert    (0.266, 0.230, 0.187, 0.000)
		colorLowland   (0.280, 0.242, 0.197, 0.000)
		colorUpland    (0.294, 0.254, 0.207, 0.000)
		colorRock      (0.308, 0.266, 0.217, 0.000)
		colorSnow      (0.322, 0.278, 0.227, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.110672
		Period          0.039214
		Eccentricity    0.0373923
		Inclination     3.97145
		AscendingNode   17.984
		ArgOfPericenter -57.6266
		MeanAnomaly     63.6953
	}
}

Asteroid	"S82"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.39975e-015
	Radius          0.067343
	InertiaMoment   0.399281

	RotationPeriod  598.952
	Obliquity       -2.32497
	EqAscendNode    -68.3374

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.733 0.666 0.576)

	Surface
	{
		SurfStyle       0.867645
		OceanStyle      0.427501
		Randomize      (-0.641, -0.352, 0.703)
		colorDistMagn   0.806506
		colorDistFreq   3.23517e-007
		detailScale     1.83891
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0670915
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.452063
		terraceProb     0.229109
		erosion         0
		montesMagn      0.475135
		montesFreq      3.2207
		montesSpiky     0.919406
		montesFraction  0.602631
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.35831e-006
		hillsFraction   0.515553
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223452
		craterFreq      0.242857
		craterDensity   0.908374
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.495857
		volcanoTemp     1639.24
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.249, 0.233, 0.230, 0.050)
		colorShelf     (0.293, 0.273, 0.265, 0.040)
		colorBeach     (0.337, 0.313, 0.300, 0.030)
		colorDesert    (0.381, 0.353, 0.340, 0.020)
		colorLowland   (0.425, 0.393, 0.375, 0.030)
		colorUpland    (0.469, 0.433, 0.409, 0.050)
		colorRock      (0.513, 0.473, 0.455, 0.020)
		colorSnow      (0.513, 0.473, 0.455, 1.000)
		BumpHeight      0.0606087
		BumpOffset      0.0121217
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.114002
		Period          0.0409969
		Eccentricity    0.0655076
		Inclination     -2.32497
		AscendingNode   -68.3374
		ArgOfPericenter -61.6653
		MeanAnomaly     -113.567
	}
}

Asteroid	"S83"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            2.0598e-012
	Radius          0.860378
	InertiaMoment   0.396452

	RotationPeriod  903.68
	Obliquity       -3.14285
	EqAscendNode    86.7349

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.653 0.647 0.645)

	Surface
	{
		SurfStyle       0.256917
		OceanStyle      0.131143
		Randomize      (-0.649, 0.056, -0.680)
		colorDistMagn   0.482156
		colorDistFreq   0.000204076
		detailScale     23.4941
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0796492
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.642166
		terraceProb     0.45348
		erosion         0
		montesMagn      0.634701
		montesFreq      3.80936
		montesSpiky     0.926201
		montesFraction  0.550951
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0014452
		hillsFraction   0.543269
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.216141
		craterFreq      0.193901
		craterDensity   0.8567
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.491134
		volcanoTemp     1541.82
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.261, 0.259, 0.258, 0.000)
		colorShelf     (0.278, 0.275, 0.274, 0.000)
		colorBeach     (0.294, 0.291, 0.290, 0.000)
		colorDesert    (0.310, 0.308, 0.306, 0.000)
		colorLowland   (0.327, 0.324, 0.323, 0.000)
		colorUpland    (0.343, 0.340, 0.339, 0.000)
		colorRock      (0.359, 0.356, 0.355, 0.000)
		colorSnow      (0.376, 0.372, 0.371, 1.000)
		BumpHeight      0.77434
		BumpOffset      0.154868
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.132803
		Period          0.0515458
		Eccentricity    0.109818
		Inclination     -3.14285
		AscendingNode   86.7349
		ArgOfPericenter 143.245
		MeanAnomaly     -108.464
	}
}

Asteroid	"S84"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            3.03112e-009
	Radius          11.1356
	InertiaMoment   0.398431

	RotationPeriod  256.102
	Obliquity       0.553756
	EqAscendNode    13.1993

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.725 0.723 0.721)

	Surface
	{
		SurfStyle       0.783664
		OceanStyle      0.894096
		Randomize      (0.316, 0.949, 0.361)
		colorDistMagn   0.142605
		colorDistFreq   0.0711808
		detailScale     304.077
		colorConversion true
		snowLevel       2
		tropicLatitude  0.019201
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.593026
		terraceProb     0.183962
		erosion         0
		montesMagn      0.273349
		montesFreq      4.54885
		montesSpiky     0.888181
		montesFraction  0.139224
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.288396
		hillsFraction   0.665518
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255059
		craterFreq      0.23547
		craterDensity   0.792745
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.513186
		volcanoTemp     1523.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.283, 0.246, 0.202, 0.000)
		colorShelf     (0.290, 0.253, 0.231, 0.000)
		colorBeach     (0.341, 0.296, 0.274, 0.000)
		colorDesert    (0.370, 0.318, 0.267, 0.000)
		colorLowland   (0.406, 0.340, 0.303, 0.000)
		colorUpland    (0.449, 0.412, 0.368, 0.000)
		colorRock      (0.486, 0.448, 0.397, 0.000)
		colorSnow      (0.529, 0.477, 0.418, 1.000)
		BumpHeight      10.0221
		BumpOffset      2.00442
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.119185
		Period          0.0438241
		Eccentricity    0.106143
		Inclination     0.553756
		AscendingNode   13.1993
		ArgOfPericenter 95.3113
		MeanAnomaly     -36.7644
	}
}

Asteroid	"S85"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.77574e-017
	Radius          0.0157061
	InertiaMoment   0.399466

	Obliquity       -0.567177
	EqAscendNode    -92.505
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.538 0.533 0.527)

	Surface
	{
		SurfStyle       0.735019
		OceanStyle      0.459464
		Randomize      (-0.572, -0.193, -0.640)
		colorDistMagn   0.564679
		colorDistFreq   2.66926e-008
		detailScale     0.428882
		colorConversion true
		snowLevel       2
		tropicLatitude  0.013689
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.378907
		terraceProb     0.179859
		erosion         0
		montesMagn      0.578578
		montesFreq      4.18639
		montesSpiky     0.959407
		montesFraction  0.448295
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.7941e-007
		hillsFraction   0.771134
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25854
		craterFreq      0.20817
		craterDensity   0.903866
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.601003
		volcanoTemp     1241.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.210, 0.181, 0.148, 0.000)
		colorShelf     (0.215, 0.187, 0.169, 0.000)
		colorBeach     (0.253, 0.219, 0.200, 0.000)
		colorDesert    (0.275, 0.235, 0.195, 0.000)
		colorLowland   (0.301, 0.251, 0.221, 0.000)
		colorUpland    (0.334, 0.304, 0.269, 0.000)
		colorRock      (0.361, 0.331, 0.290, 0.000)
		colorSnow      (0.393, 0.352, 0.306, 1.000)
		BumpHeight      0.0141355
		BumpOffset      0.0028271
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.143478
		Period          0.0578841
		Eccentricity    0.0805693
		Inclination     -0.567177
		AscendingNode   -92.505
		ArgOfPericenter -13.5878
		MeanAnomaly     -98.4022
	}
}

Asteroid	"S86"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            2.61309e-014
	Radius          0.200663
	InertiaMoment   0.397095

	Obliquity       -4.05921
	EqAscendNode    -52.9744
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.811 0.750 0.710)

	Surface
	{
		SurfStyle       0.00136869
		OceanStyle      0.452934
		Randomize      (0.633, 0.455, -0.773)
		colorDistMagn   0.72049
		colorDistFreq   1.78617e-005
		detailScale     5.47943
		colorConversion true
		snowLevel       2
		tropicLatitude  0.126459
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.287174
		terraceProb     0.28403
		erosion         0
		montesMagn      0.502234
		montesFreq      2.79243
		montesSpiky     0.958219
		montesFraction  0.6216
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.77991e-005
		hillsFraction   0.579958
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247726
		craterFreq      0.207082
		craterDensity   0.995004
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.440532
		volcanoTemp     1449.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.324, 0.300, 0.284, 0.000)
		colorShelf     (0.344, 0.319, 0.302, 0.000)
		colorBeach     (0.365, 0.338, 0.320, 0.000)
		colorDesert    (0.385, 0.356, 0.337, 0.000)
		colorLowland   (0.405, 0.375, 0.355, 0.000)
		colorUpland    (0.426, 0.394, 0.373, 0.000)
		colorRock      (0.446, 0.413, 0.391, 0.000)
		colorSnow      (0.466, 0.431, 0.408, 1.000)
		BumpHeight      0.180597
		BumpOffset      0.0361193
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.124608
		Period          0.046849
		Eccentricity    0.145046
		Inclination     -4.05921
		AscendingNode   -52.9744
		ArgOfPericenter 178.416
		MeanAnomaly     -153.471
	}
}

Asteroid	"S87"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            3.8453e-011
	Radius          2.5972
	InertiaMoment   0.398661

	Obliquity       1.48827
	EqAscendNode    -83.0208
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.570 0.563 0.560)

	Surface
	{
		SurfStyle       0.192968
		OceanStyle      0.057468
		Randomize      (0.027, -0.338, -0.988)
		colorDistMagn   0.791624
		colorDistFreq   0.00444573
		detailScale     70.9208
		colorConversion true
		snowLevel       2
		tropicLatitude  0.03889
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.466148
		terraceProb     0.10958
		erosion         0
		montesMagn      0.582751
		montesFreq      4.2153
		montesSpiky     0.982821
		montesFraction  0.526808
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0224247
		hillsFraction   0.727344
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247678
		craterFreq      0.221019
		craterDensity   0.843392
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.547683
		volcanoTemp     1542.14
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.228, 0.225, 0.224, 0.000)
		colorShelf     (0.242, 0.239, 0.238, 0.000)
		colorBeach     (0.256, 0.253, 0.252, 0.000)
		colorDesert    (0.271, 0.267, 0.266, 0.000)
		colorLowland   (0.285, 0.281, 0.280, 0.000)
		colorUpland    (0.299, 0.295, 0.294, 0.000)
		colorRock      (0.313, 0.309, 0.308, 0.000)
		colorSnow      (0.328, 0.323, 0.322, 1.000)
		BumpHeight      2.33748
		BumpOffset      0.467496
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.122494
		Period          0.0456621
		Eccentricity    0.130293
		Inclination     1.48827
		AscendingNode   -83.0208
		ArgOfPericenter 83.4187
		MeanAnomaly     123.989
	}
}

Asteroid	"S88"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            5.65857e-008
	Radius          29.5379
	InertiaMoment   0.399647

	RotationPeriod  629.57
	Obliquity       -3.75753
	EqAscendNode    -65.297

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.463 0.381 0.339)

	Surface
	{
		SurfStyle       0.947919
		OceanStyle      0.915667
		Randomize      (-0.089, -0.656, 0.525)
		colorDistMagn   0.453552
		colorDistFreq   0.374239
		detailScale     806.582
		colorConversion true
		snowLevel       2
		tropicLatitude  0.110191
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.340923
		terraceProb     0.429932
		erosion         0
		montesMagn      0.639004
		montesFreq      3.88831
		montesSpiky     0.968001
		montesFraction  0.616018
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.99995
		hillsFraction   0.669441
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237483
		craterFreq      0.259338
		craterDensity   0.849474
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.442324
		volcanoTemp     1464.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.157, 0.133, 0.136, 0.050)
		colorShelf     (0.185, 0.156, 0.156, 0.040)
		colorBeach     (0.213, 0.179, 0.176, 0.030)
		colorDesert    (0.241, 0.202, 0.200, 0.020)
		colorLowland   (0.268, 0.225, 0.220, 0.030)
		colorUpland    (0.296, 0.248, 0.241, 0.050)
		colorRock      (0.324, 0.271, 0.268, 0.020)
		colorSnow      (0.324, 0.271, 0.268, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.117855
		Period          0.0430927
		Eccentricity    0.0960577
		Inclination     -3.75753
		AscendingNode   -65.297
		ArgOfPericenter 150.488
		MeanAnomaly     -179.246
	}
}

Asteroid	"S89"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            3.315e-016
	Radius          0.0416649
	InertiaMoment   0.397529

	RotationPeriod  1033.76
	Obliquity       -0.390962
	EqAscendNode    -112.599

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.495 0.489 0.487)

	Surface
	{
		SurfStyle       0.143718
		OceanStyle      0.0993041
		Randomize      (-0.618, -0.072, -0.495)
		colorDistMagn   0.767128
		colorDistFreq   1.29933e-006
		detailScale     1.13773
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00757224
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.308742
		terraceProb     0.22797
		erosion         0
		montesMagn      0.450179
		montesFreq      3.458
		montesSpiky     0.990854
		montesFraction  0.283166
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.82513e-006
		hillsFraction   0.510204
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.268385
		craterFreq      0.226016
		craterDensity   0.785775
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.538003
		volcanoTemp     1350.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.198, 0.196, 0.195, 0.000)
		colorShelf     (0.211, 0.208, 0.207, 0.000)
		colorBeach     (0.223, 0.220, 0.219, 0.000)
		colorDesert    (0.235, 0.232, 0.231, 0.000)
		colorLowland   (0.248, 0.245, 0.243, 0.000)
		colorUpland    (0.260, 0.257, 0.255, 0.000)
		colorRock      (0.272, 0.269, 0.268, 0.000)
		colorSnow      (0.285, 0.281, 0.280, 1.000)
		BumpHeight      0.0374984
		BumpOffset      0.00749969
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.145259
		Period          0.0589655
		Eccentricity    0.122716
		Inclination     -0.390962
		AscendingNode   -112.599
		ArgOfPericenter -81.7867
		MeanAnomaly     -140.831
	}
}

Asteroid	"S90"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            4.8782e-013
	Radius          0.532314
	InertiaMoment   0.398874

	RotationPeriod  296.595
	Obliquity       -1.30409
	EqAscendNode    -175.073

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.720 0.716 0.713)

	Surface
	{
		SurfStyle       0.903492
		OceanStyle      0.54342
		Randomize      (-0.225, 0.288, 0.193)
		colorDistMagn   0.418258
		colorDistFreq   0.000142334
		detailScale     14.5357
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00195312
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.489149
		terraceProb     0.190711
		erosion         0
		montesMagn      0.435877
		montesFreq      3.0237
		montesSpiky     0.773595
		montesFraction  0.579498
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000655716
		hillsFraction   0.52871
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233867
		craterFreq      0.184642
		craterDensity   0.943654
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.447556
		volcanoTemp     1375.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.245, 0.251, 0.285, 0.050)
		colorShelf     (0.288, 0.294, 0.328, 0.040)
		colorBeach     (0.331, 0.337, 0.371, 0.030)
		colorDesert    (0.375, 0.380, 0.421, 0.020)
		colorLowland   (0.418, 0.423, 0.463, 0.030)
		colorUpland    (0.461, 0.465, 0.506, 0.050)
		colorRock      (0.504, 0.508, 0.563, 0.020)
		colorSnow      (0.504, 0.508, 0.563, 1.000)
		BumpHeight      0.479083
		BumpOffset      0.0958165
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.131438
		Period          0.0507532
		Eccentricity    0.119551
		Inclination     -1.30409
		AscendingNode   -175.073
		ArgOfPericenter -101.329
		MeanAnomaly     -130.372
	}
}

Asteroid	"S91"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            7.17852e-010
	Radius          6.88969
	InertiaMoment   0.399825

	Obliquity       -0.00579891
	EqAscendNode    -91.7822
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.717 0.714 0.713)

	Surface
	{
		SurfStyle       0.948576
		OceanStyle      0.638611
		Randomize      (0.929, -0.764, 0.521)
		colorDistMagn   0.673486
		colorDistFreq   0.00516101
		detailScale     188.135
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.312619
		terraceProb     0.16252
		erosion         0
		montesMagn      0.436113
		montesFreq      2.27318
		montesSpiky     0.813848
		montesFraction  0.819304
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.119354
		hillsFraction   0.770158
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.277591
		craterFreq      0.185344
		craterDensity   0.922686
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.501917
		volcanoTemp     1242.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.244, 0.250, 0.285, 0.050)
		colorShelf     (0.287, 0.293, 0.328, 0.040)
		colorBeach     (0.330, 0.336, 0.371, 0.030)
		colorDesert    (0.373, 0.379, 0.421, 0.020)
		colorLowland   (0.416, 0.421, 0.464, 0.030)
		colorUpland    (0.459, 0.464, 0.506, 0.050)
		colorRock      (0.502, 0.507, 0.563, 0.020)
		colorSnow      (0.502, 0.507, 0.563, 1.000)
		BumpHeight      6.20072
		BumpOffset      1.24014
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.113848
		Period          0.0409136
		Eccentricity    0.0642396
		Inclination     -0.00579891
		AscendingNode   -91.7822
		ArgOfPericenter -161.183
		MeanAnomaly     -111.745
	}
}

Asteroid	"S92"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            4.20545e-018
	Radius          0.00971732
	InertiaMoment   0.39787

	RotationPeriod  669.694
	Obliquity       -4.98826
	EqAscendNode    10.5495

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.480 0.476 0.470)

	Surface
	{
		SurfStyle       0.874469
		OceanStyle      0.158957
		Randomize      (0.425, 0.146, -0.812)
		colorDistMagn   0.474612
		colorDistFreq   4.32689e-008
		detailScale     0.265348
		colorConversion true
		snowLevel       2
		tropicLatitude  0.172516
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.709822
		terraceProb     0.210179
		erosion         0
		montesMagn      0.368704
		montesFreq      2.90628
		montesSpiky     0.858573
		montesFraction  0.75732
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.19583e-007
		hillsFraction   0.692004
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.270228
		craterFreq      0.190952
		craterDensity   0.884777
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.535713
		volcanoTemp     1491.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.163, 0.167, 0.188, 0.050)
		colorShelf     (0.192, 0.195, 0.216, 0.040)
		colorBeach     (0.221, 0.224, 0.245, 0.030)
		colorDesert    (0.249, 0.252, 0.277, 0.020)
		colorLowland   (0.278, 0.281, 0.306, 0.030)
		colorUpland    (0.307, 0.309, 0.334, 0.050)
		colorRock      (0.336, 0.338, 0.372, 0.020)
		colorSnow      (0.336, 0.338, 0.372, 1.000)
		BumpHeight      0.00874559
		BumpOffset      0.00174912
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.142509
		Period          0.0572989
		Eccentricity    0.134312
		Inclination     -4.98826
		AscendingNode   10.5495
		ArgOfPericenter -157.805
		MeanAnomaly     -170.692
	}
}

Asteroid	"S93"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            6.18854e-015
	Radius          0.124149
	InertiaMoment   0.399075

	RotationPeriod  737.03
	Obliquity       1.29176
	EqAscendNode    -158.786

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.491 0.488 0.485)

	Surface
	{
		SurfStyle       0.143528
		OceanStyle      0.709254
		Randomize      (0.462, -0.014, 0.080)
		colorDistMagn   0.514744
		colorDistFreq   5.84063e-006
		detailScale     3.3901
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00830071
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.524687
		terraceProb     0.120756
		erosion         0
		montesMagn      0.565136
		montesFreq      3.3914
		montesSpiky     0.85836
		montesFraction  0.883126
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.21933e-005
		hillsFraction   0.485692
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264855
		craterFreq      0.241179
		craterDensity   0.884317
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.522318
		volcanoTemp     1838.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.196, 0.195, 0.194, 0.000)
		colorShelf     (0.209, 0.208, 0.206, 0.000)
		colorBeach     (0.221, 0.220, 0.218, 0.000)
		colorDesert    (0.233, 0.232, 0.230, 0.000)
		colorLowland   (0.245, 0.244, 0.242, 0.000)
		colorUpland    (0.258, 0.256, 0.255, 0.000)
		colorRock      (0.270, 0.269, 0.267, 0.000)
		colorSnow      (0.282, 0.281, 0.279, 1.000)
		BumpHeight      0.111734
		BumpOffset      0.0223469
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.130911
		Period          0.0504481
		Eccentricity    0.186208
		Inclination     1.29176
		AscendingNode   -158.786
		ArgOfPericenter 141.777
		MeanAnomaly     -59.9922
	}
}

Asteroid	"S94"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            9.10675e-012
	Radius          1.60688
	InertiaMoment   0.39291

	Obliquity       -2.92519
	EqAscendNode    138.125
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.554 0.549 0.543)

	Surface
	{
		SurfStyle       0.0428738
		OceanStyle      0.742256
		Randomize      (-0.620, 0.263, 0.283)
		colorDistMagn   0.515964
		colorDistFreq   0.00212574
		detailScale     43.8786
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0364666
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.323668
		terraceProb     0.404644
		erosion         0
		montesMagn      0.396889
		montesFreq      3.82219
		montesSpiky     0.986582
		montesFraction  0.531597
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.005447
		hillsFraction   0.748604
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25166
		craterFreq      0.190815
		craterDensity   0.893895
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.473362
		volcanoTemp     1473.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.221, 0.220, 0.217, 0.000)
		colorShelf     (0.235, 0.233, 0.231, 0.000)
		colorBeach     (0.249, 0.247, 0.244, 0.000)
		colorDesert    (0.263, 0.261, 0.258, 0.000)
		colorLowland   (0.277, 0.274, 0.271, 0.000)
		colorUpland    (0.291, 0.288, 0.285, 0.000)
		colorRock      (0.305, 0.302, 0.299, 0.000)
		colorSnow      (0.318, 0.316, 0.312, 1.000)
		BumpHeight      1.44619
		BumpOffset      0.289239
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.118621
		Period          0.0435134
		Eccentricity    0.101893
		Inclination     -2.92519
		AscendingNode   138.125
		ArgOfPericenter 164.903
		MeanAnomaly     88.488
	}
}

Asteroid	"S95"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.3401e-008
	Radius          14.2985
	InertiaMoment   0.398158

	RotationPeriod  770.421
	Obliquity       -4.08613
	EqAscendNode    -73.9537

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.726 0.724 0.722)

	Surface
	{
		SurfStyle       0.718232
		OceanStyle      0.45898
		Randomize      (0.260, -0.402, 0.450)
		colorDistMagn   0.571297
		colorDistFreq   0.0733419
		detailScale     390.446
		colorConversion true
		snowLevel       2
		tropicLatitude  0.113665
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.608397
		terraceProb     0.440564
		erosion         0
		montesMagn      0.364643
		montesFreq      2.65032
		montesSpiky     0.943481
		montesFraction  0.449544
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.525255
		hillsFraction   0.702641
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245753
		craterFreq      0.168941
		craterDensity   0.853833
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.527339
		volcanoTemp     1774.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.283, 0.246, 0.202, 0.000)
		colorShelf     (0.290, 0.253, 0.231, 0.000)
		colorBeach     (0.341, 0.297, 0.274, 0.000)
		colorDesert    (0.370, 0.319, 0.267, 0.000)
		colorLowland   (0.406, 0.340, 0.303, 0.000)
		colorUpland    (0.450, 0.413, 0.368, 0.000)
		colorRock      (0.486, 0.449, 0.397, 0.000)
		colorSnow      (0.530, 0.478, 0.419, 1.000)
		BumpHeight      12.8687
		BumpOffset      2.57374
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.119403
		Period          0.0439447
		Eccentricity    0.107779
		Inclination     -4.08613
		AscendingNode   -73.9537
		ArgOfPericenter -151.022
		MeanAnomaly     -17.265
	}
}

Asteroid	"S96"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            7.85082e-017
	Radius          0.0289548
	InertiaMoment   0.399267

	RotationPeriod  321.226
	Obliquity       -4.45812
	EqAscendNode    26.0379

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.850 0.801 0.735)

	Surface
	{
		SurfStyle       0.301937
		OceanStyle      0.325537
		Randomize      (0.157, -0.158, -0.282)
		colorDistMagn   0.404353
		colorDistFreq   4.83179e-007
		detailScale     0.790658
		colorConversion true
		snowLevel       2
		tropicLatitude  0.15103
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.601489
		terraceProb     0.162846
		erosion         0
		montesMagn      0.5899
		montesFreq      2.99872
		montesSpiky     0.832492
		montesFraction  0.603245
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.60141e-006
		hillsFraction   0.819933
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226769
		craterFreq      0.208779
		craterDensity   1.00743
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.467229
		volcanoTemp     1780.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.340, 0.320, 0.294, 0.000)
		colorShelf     (0.361, 0.340, 0.313, 0.000)
		colorBeach     (0.382, 0.360, 0.331, 0.000)
		colorDesert    (0.404, 0.380, 0.349, 0.000)
		colorLowland   (0.425, 0.400, 0.368, 0.000)
		colorUpland    (0.446, 0.420, 0.386, 0.000)
		colorRock      (0.467, 0.440, 0.404, 0.000)
		colorSnow      (0.488, 0.460, 0.423, 1.000)
		BumpHeight      0.0260593
		BumpOffset      0.00521186
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.138618
		Period          0.0549681
		Eccentricity    0.0781095
		Inclination     -4.45812
		AscendingNode   26.0379
		ArgOfPericenter 68.1649
		MeanAnomaly     -49.7221
	}
}

Asteroid	"S97"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.15529e-013
	Radius          0.374767
	InertiaMoment   0.396385

	Obliquity       -0.990681
	EqAscendNode    168.056
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.510 0.505 0.497)

	Surface
	{
		SurfStyle       0.276972
		OceanStyle      0.834661
		Randomize      (0.475, 0.645, -0.258)
		colorDistMagn   0.692687
		colorDistFreq   1.99042e-005
		detailScale     10.2336
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00360469
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.523607
		terraceProb     0.231718
		erosion         0
		montesMagn      0.544841
		montesFreq      3.41616
		montesSpiky     0.872177
		montesFraction  0.774115
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000278838
		hillsFraction   0.723181
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257957
		craterFreq      0.233777
		craterDensity   0.71082
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.425938
		volcanoTemp     1389.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.204, 0.202, 0.199, 0.000)
		colorShelf     (0.217, 0.215, 0.211, 0.000)
		colorBeach     (0.229, 0.227, 0.224, 0.000)
		colorDesert    (0.242, 0.240, 0.236, 0.000)
		colorLowland   (0.255, 0.253, 0.249, 0.000)
		colorUpland    (0.268, 0.265, 0.261, 0.000)
		colorRock      (0.280, 0.278, 0.273, 0.000)
		colorSnow      (0.293, 0.291, 0.286, 1.000)
		BumpHeight      0.33729
		BumpOffset      0.067458
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.10969
		Period          0.0386932
		Eccentricity    0.0287737
		Inclination     -0.990681
		AscendingNode   168.056
		ArgOfPericenter -22.45
		MeanAnomaly     52.5152
	}
}

Asteroid	"S98"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.70007e-010
	Radius          3.33498
	InertiaMoment   0.398413

	Obliquity       3.59392
	EqAscendNode    101.544
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.717 0.595 0.536)

	Surface
	{
		SurfStyle       0.994138
		OceanStyle      0.387576
		Randomize      (-0.137, 0.911, -0.915)
		colorDistMagn   0.897529
		colorDistFreq   0.00349737
		detailScale     91.0671
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0792221
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.550838
		terraceProb     0.171259
		erosion         0
		montesMagn      0.38672
		montesFreq      2.4668
		montesSpiky     0.878412
		montesFraction  0.265483
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0210813
		hillsFraction   0.504865
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235771
		craterFreq      0.192129
		craterDensity   1.01836
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.519698
		volcanoTemp     1742.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.244, 0.208, 0.214, 0.050)
		colorShelf     (0.287, 0.244, 0.246, 0.040)
		colorBeach     (0.330, 0.280, 0.279, 0.030)
		colorDesert    (0.373, 0.316, 0.316, 0.020)
		colorLowland   (0.416, 0.351, 0.348, 0.030)
		colorUpland    (0.459, 0.387, 0.380, 0.050)
		colorRock      (0.502, 0.423, 0.423, 0.020)
		colorSnow      (0.502, 0.423, 0.423, 1.000)
		BumpHeight      3.00148
		BumpOffset      0.600296
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.151511
		Period          0.0628131
		Eccentricity    0.0573187
		Inclination     3.59392
		AscendingNode   101.544
		ArgOfPericenter 68.6419
		MeanAnomaly     -117.826
	}
}

Asteroid	"S99"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            2.50175e-007
	Radius          42.599
	InertiaMoment   0.399452

	Obliquity       0.328929
	EqAscendNode    24.62
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.603 0.599 0.596)

	Surface
	{
		SurfStyle       0.675953
		OceanStyle      0.483314
		Randomize      (-0.548, -0.076, 0.878)
		colorDistMagn   0.276676
		colorDistFreq   0.626666
		detailScale     1163.24
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0112197
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.569488
		terraceProb     0.39347
		erosion         0
		montesMagn      0.659415
		montesFreq      2.77032
		montesSpiky     0.928764
		montesFraction  0.453877
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.40198
		hillsFraction   0.472064
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.20768
		craterFreq      0.230128
		craterDensity   0.733673
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.556681
		volcanoTemp     1317.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.235, 0.204, 0.167, 0.000)
		colorShelf     (0.241, 0.210, 0.191, 0.000)
		colorBeach     (0.284, 0.245, 0.226, 0.000)
		colorDesert    (0.308, 0.263, 0.220, 0.000)
		colorLowland   (0.338, 0.281, 0.250, 0.000)
		colorUpland    (0.374, 0.341, 0.304, 0.000)
		colorRock      (0.404, 0.371, 0.328, 0.000)
		colorSnow      (0.440, 0.395, 0.346, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.117132
		Period          0.0426969
		Eccentricity    0.0904796
		Inclination     0.328929
		AscendingNode   24.62
		ArgOfPericenter 133.139
		MeanAnomaly     34.491
	}
}

Asteroid	"S100"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.46561e-015
	Radius          0.0874052
	InertiaMoment   0.397055

	Obliquity       -5.01313
	EqAscendNode    -175.244
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.628 0.625 0.621)

	Surface
	{
		SurfStyle       0.769804
		OceanStyle      0.869975
		Randomize      (-0.275, 0.275, 0.631)
		colorDistMagn   0.90319
		colorDistFreq   4.3268e-006
		detailScale     2.38675
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00725056
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.438398
		terraceProb     0.231813
		erosion         0
		montesMagn      0.324637
		montesFreq      2.38667
		montesSpiky     0.956284
		montesFraction  0.59709
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.0172e-006
		hillsFraction   0.827057
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248114
		craterFreq      0.175443
		craterDensity   0.815963
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.592553
		volcanoTemp     1642.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.245, 0.213, 0.174, 0.000)
		colorShelf     (0.251, 0.219, 0.199, 0.000)
		colorBeach     (0.295, 0.256, 0.236, 0.000)
		colorDesert    (0.320, 0.275, 0.230, 0.000)
		colorLowland   (0.352, 0.294, 0.261, 0.000)
		colorUpland    (0.390, 0.357, 0.317, 0.000)
		colorRock      (0.421, 0.388, 0.342, 0.000)
		colorSnow      (0.459, 0.413, 0.360, 1.000)
		BumpHeight      0.0786647
		BumpOffset      0.0157329
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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
		SemiMajorAxis   0.112499
		Period          0.0401889
		Eccentricity    0.0530233
		Inclination     -5.01313
		AscendingNode   -175.244
		ArgOfPericenter 111.317
		MeanAnomaly     117.804
	}
}

Comet	"C1"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.03285e-015
	Radius          0.141617
	InertiaMoment   0.395904

	Oblateness      0.00325527

	RotationPeriod  89.1398
	Obliquity       266.529
	EqAscendNode    110.368

	AbsMagn         9.0219
	SlopeParam      10.0275
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.612 0.543 0.514)

	Surface
	{
		SurfStyle       0.185391
		OceanStyle      0.936392
		Randomize      (0.298, 0.976, 0.502)
		colorDistMagn   0.674639
		colorDistFreq   1.55264e-005
		detailScale     3.86708
		colorConversion true
		snowLevel       2
		tropicLatitude  0.657689
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.607902
		terraceProb     0.293342
		erosion         0
		montesMagn      0.473185
		montesFreq      3.82246
		montesSpiky     0.963383
		montesFraction  0.809672
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.32075e-005
		hillsFraction   0.722206
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213916
		craterFreq      0.199321
		craterDensity   0.902793
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.480829
		volcanoTemp     1328
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.245, 0.217, 0.206, 0.000)
		colorShelf     (0.260, 0.231, 0.219, 0.000)
		colorBeach     (0.276, 0.244, 0.232, 0.000)
		colorDesert    (0.291, 0.258, 0.244, 0.000)
		colorLowland   (0.306, 0.272, 0.257, 0.000)
		colorUpland    (0.321, 0.285, 0.270, 0.000)
		colorRock      (0.337, 0.299, 0.283, 0.000)
		colorSnow      (0.352, 0.312, 0.296, 1.000)
		BumpHeight      0.127455
		BumpOffset      0.025491
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.011737
		GasToDust   0.25
		Particles   1003
		GasBright   0.23034
		DustBright  0.259019
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   21.5456
		Period          106.517
		Eccentricity    0.94275
		Inclination     127.17
		AscendingNode   173.251
		ArgOfPericenter 77.178
		MeanAnomaly     159.191
	}
}

Comet	"C2"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            7.98834e-012
	Radius          3.17117
	InertiaMoment   0.39902

	Oblateness      0.00515633

	RotationPeriod  85.8383
	Obliquity       219.734
	EqAscendNode    94.9459

	AbsMagn         5.46439
	SlopeParam      2.771
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.733 0.648 0.616)

	Surface
	{
		SurfStyle       0.793931
		OceanStyle      0.462505
		Randomize      (-0.369, 0.040, -0.790)
		colorDistMagn   0.701643
		colorDistFreq   0.00754892
		detailScale     86.5941
		colorConversion true
		snowLevel       2
		tropicLatitude  0.159764
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.423534
		terraceProb     0.394965
		erosion         0
		montesMagn      0.487486
		montesFreq      2.91169
		montesSpiky     0.953379
		montesFraction  0.762846
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0305301
		hillsFraction   0.636281
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245085
		craterFreq      0.24241
		craterDensity   1.00399
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.489135
		volcanoTemp     1499.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.286, 0.220, 0.172, 0.000)
		colorShelf     (0.293, 0.227, 0.197, 0.000)
		colorBeach     (0.345, 0.266, 0.234, 0.000)
		colorDesert    (0.374, 0.285, 0.228, 0.000)
		colorLowland   (0.411, 0.305, 0.259, 0.000)
		colorUpland    (0.455, 0.369, 0.314, 0.000)
		colorRock      (0.491, 0.402, 0.339, 0.000)
		colorSnow      (0.535, 0.428, 0.357, 1.000)
		BumpHeight      2.85405
		BumpOffset      0.570811
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.492929
		GasToDust   0.25
		Particles   1975
		GasBright   0.028965
		DustBright  0.944881
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   19.9014
		Period          94.5597
		Eccentricity    0.920551
		Inclination     -131.44
		AscendingNode   176.289
		ArgOfPericenter -118.405
		MeanAnomaly     39.9204
	}
}

Comet	"C3"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            6.17841e-008
	Radius          55.3483
	InertiaMoment   0.397479

	Oblateness      0.0037851

	RotationPeriod  82.8276
	Obliquity       172.94
	EqAscendNode    79.5233

	AbsMagn         13.5607
	SlopeParam      3.39701
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.568 0.561 0.558)

	Surface
	{
		SurfStyle       0.53052
		OceanStyle      0.618508
		Randomize      (0.549, -0.380, 0.882)
		colorDistMagn   0.109976
		colorDistFreq   1.35996
		detailScale     1511.38
		colorConversion true
		snowLevel       2
		tropicLatitude  0.450569
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.630355
		terraceProb     0.333775
		erosion         0
		montesMagn      0.443468
		montesFreq      2.81544
		montesSpiky     0.857284
		montesFraction  0.908251
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.9879
		hillsFraction   0.519462
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224055
		craterFreq      0.254699
		craterDensity   0.973457
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.573728
		volcanoTemp     1292.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.222, 0.191, 0.156, 0.000)
		colorShelf     (0.227, 0.196, 0.179, 0.000)
		colorBeach     (0.267, 0.230, 0.212, 0.000)
		colorDesert    (0.290, 0.247, 0.206, 0.000)
		colorLowland   (0.318, 0.264, 0.234, 0.000)
		colorUpland    (0.352, 0.320, 0.285, 0.000)
		colorRock      (0.381, 0.348, 0.307, 0.000)
		colorSnow      (0.415, 0.370, 0.324, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.974121
		GasToDust   0.25
		Particles   2947
		GasBright   0.0584521
		DustBright  0.59988
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   13.5486
		Period          53.1157
		Eccentricity    0.89442
		Inclination     -154.485
		AscendingNode   -93.1246
		ArgOfPericenter -24.3877
		MeanAnomaly     165.18
	}
}

Comet	"C4"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.90238e-015
	Radius          0.196057
	InertiaMoment   0.39947

	Oblateness      0.00589435

	RotationPeriod  80.0428
	Obliquity       126.146
	EqAscendNode    64.1007

	AbsMagn         8.80771
	SlopeParam      3.96789
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.764 0.681 0.568)

	Surface
	{
		SurfStyle       0.158761
		OceanStyle      0.493059
		Randomize      (-0.183, 0.572, 0.238)
		colorDistMagn   0.721788
		colorDistFreq   1.89877e-005
		detailScale     5.35365
		colorConversion true
		snowLevel       2
		tropicLatitude  0.732695
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.5334
		terraceProb     0.136081
		erosion         0
		montesMagn      0.309386
		montesFreq      2.51493
		montesSpiky     0.791545
		montesFraction  0.663445
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.13139e-005
		hillsFraction   0.671665
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.190437
		craterFreq      0.200014
		craterDensity   0.890273
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.483614
		volcanoTemp     1414.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.305, 0.272, 0.227, 0.000)
		colorShelf     (0.325, 0.289, 0.241, 0.000)
		colorBeach     (0.344, 0.306, 0.255, 0.000)
		colorDesert    (0.363, 0.324, 0.270, 0.000)
		colorLowland   (0.382, 0.341, 0.284, 0.000)
		colorUpland    (0.401, 0.358, 0.298, 0.000)
		colorRock      (0.420, 0.375, 0.312, 0.000)
		colorSnow      (0.439, 0.392, 0.326, 1.000)
		BumpHeight      0.176451
		BumpOffset      0.0352902
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.044563
		GasToDust   0.25
		Particles   1069
		GasBright   0.0506801
		DustBright  0.292139
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   14.2334
		Period          57.1932
		Eccentricity    0.884237
		Inclination     157.943
		AscendingNode   116.2
		ArgOfPericenter -31.6517
		MeanAnomaly     -26.323
	}
}

Comet	"C5"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.47135e-011
	Radius          3.42843
	InertiaMoment   0.398224

	Oblateness      0.00433378

	RotationPeriod  77.4377
	Obliquity       79.3515
	EqAscendNode    48.6781

	AbsMagn         5.20384
	SlopeParam      4.53611
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.798 0.796 0.795)

	Surface
	{
		SurfStyle       0.885377
		OceanStyle      0.0781421
		Randomize      (-0.126, -0.233, -0.609)
		colorDistMagn   0.38769
		colorDistFreq   0.00682823
		detailScale     93.6189
		colorConversion true
		snowLevel       2
		tropicLatitude  0.660204
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.448051
		terraceProb     0.692555
		erosion         0
		montesMagn      0.570609
		montesFreq      3.38282
		montesSpiky     0.832351
		montesFraction  0.781125
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0389268
		hillsFraction   0.714115
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234953
		craterFreq      0.188674
		craterDensity   0.869301
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.643623
		volcanoTemp     1729.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.271, 0.279, 0.318, 0.050)
		colorShelf     (0.319, 0.326, 0.366, 0.040)
		colorBeach     (0.367, 0.374, 0.413, 0.030)
		colorDesert    (0.415, 0.422, 0.469, 0.020)
		colorLowland   (0.463, 0.470, 0.517, 0.030)
		colorUpland    (0.510, 0.517, 0.564, 0.050)
		colorRock      (0.558, 0.565, 0.628, 0.020)
		colorSnow      (0.558, 0.565, 0.628, 1.000)
		BumpHeight      3.08558
		BumpOffset      0.617117
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.525755
		GasToDust   0.25
		Particles   2041
		GasBright   0.171152
		DustBright  0.656154
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   11.9862
		Period          44.198
		Eccentricity    0.913585
		Inclination     93.764
		AscendingNode   41.103
		ArgOfPericenter 121.686
		MeanAnomaly     0.924285
	}
}

Comet	"C6"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.13798e-007
	Radius          76.4878
	InertiaMoment   0.399895

	Oblateness      0.00667875

	RotationPeriod  74.9783
	Obliquity       32.5572
	EqAscendNode    33.2555

	AbsMagn         13.0575
	SlopeParam      5.15233
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.602 0.553 0.490)

	Surface
	{
		SurfStyle       0.622381
		OceanStyle      0.672861
		Randomize      (0.169, -0.398, 0.533)
		colorDistMagn   0.998818
		colorDistFreq   0.696919
		detailScale     2088.63
		colorConversion true
		snowLevel       2
		tropicLatitude  0.960632
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.556376
		terraceProb     0.378056
		erosion         0
		montesMagn      0.381507
		montesFreq      2.7066
		montesSpiky     0.960032
		montesFraction  0.443987
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.2704
		hillsFraction   0.555077
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243541
		craterFreq      0.27977
		craterDensity   0.9036
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.503645
		volcanoTemp     1378.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.235, 0.188, 0.137, 0.000)
		colorShelf     (0.241, 0.193, 0.157, 0.000)
		colorBeach     (0.283, 0.227, 0.186, 0.000)
		colorDesert    (0.307, 0.243, 0.181, 0.000)
		colorLowland   (0.337, 0.260, 0.206, 0.000)
		colorUpland    (0.373, 0.315, 0.250, 0.000)
		colorRock      (0.403, 0.343, 0.270, 0.000)
		colorSnow      (0.439, 0.365, 0.284, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   1
		GasToDust   0.25
		Particles   3000
		GasBright   0.136098
		DustBright  0.375694
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   16.7054
		Period          72.7223
		Eccentricity    0.956064
		Inclination     -59.4667
		AscendingNode   108.931
		ArgOfPericenter -127.848
		MeanAnomaly     -112.604
	}
}

Comet	"C7"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            3.50393e-015
	Radius          0.212366
	InertiaMoment   0.398779

	Oblateness      0.0049257

	RotationPeriod  72.6388
	Obliquity       345.763
	EqAscendNode    17.8329

	AbsMagn         8.59581
	SlopeParam      5.90695
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.447 0.442 0.440)

	Surface
	{
		SurfStyle       0.0895028
		OceanStyle      0.889702
		Randomize      (0.903, 0.383, -0.494)
		colorDistMagn   0.89413
		colorDistFreq   1.82656e-005
		detailScale     5.799
		colorConversion true
		snowLevel       2
		tropicLatitude  0.910397
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.590711
		terraceProb     0.301916
		erosion         0
		montesMagn      0.467894
		montesFreq      3.3206
		montesSpiky     0.743301
		montesFraction  0.326444
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000119583
		hillsFraction   0.526199
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233336
		craterFreq      0.207023
		craterDensity   0.963717
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.389432
		volcanoTemp     1362.33
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.179, 0.177, 0.176, 0.000)
		colorShelf     (0.190, 0.188, 0.187, 0.000)
		colorBeach     (0.201, 0.199, 0.198, 0.000)
		colorDesert    (0.212, 0.210, 0.209, 0.000)
		colorLowland   (0.223, 0.221, 0.220, 0.000)
		colorUpland    (0.235, 0.232, 0.231, 0.000)
		colorRock      (0.246, 0.243, 0.242, 0.000)
		colorSnow      (0.257, 0.254, 0.253, 1.000)
		BumpHeight      0.191129
		BumpOffset      0.0382258
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.0773888
		GasToDust   0.25
		Particles   1136
		GasBright   0.32376
		DustBright  0.672519
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   23.5108
		Period          121.418
		Eccentricity    0.93706
		Inclination     -79.7684
		AscendingNode   -176.472
		ArgOfPericenter 127.517
		MeanAnomaly     -81.8702
	}
}

Comet	"C8"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            2.71004e-011
	Radius          4.72987
	InertiaMoment   0.396933

	Oblateness      0.00743939

	RotationPeriod  70.3991
	Obliquity       298.969
	EqAscendNode    2.41033

	AbsMagn         4.93085
	SlopeParam      7.14188
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.641 0.639 0.635)

	Surface
	{
		SurfStyle       0.501554
		OceanStyle      0.651619
		Randomize      (-0.808, -0.631, -0.131)
		colorDistMagn   0.849995
		colorDistFreq   0.0145493
		detailScale     129.157
		colorConversion true
		snowLevel       2
		tropicLatitude  0.929216
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.537216
		terraceProb     0.1522
		erosion         0
		montesMagn      0.544215
		montesFreq      2.62072
		montesSpiky     0.779681
		montesFraction  0.575158
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0557839
		hillsFraction   0.706577
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237924
		craterFreq      0.229701
		craterDensity   0.943585
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.474874
		volcanoTemp     1277.32
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.250, 0.217, 0.178, 0.000)
		colorShelf     (0.256, 0.224, 0.203, 0.000)
		colorBeach     (0.301, 0.262, 0.241, 0.000)
		colorDesert    (0.327, 0.281, 0.235, 0.000)
		colorLowland   (0.359, 0.300, 0.267, 0.000)
		colorUpland    (0.397, 0.364, 0.324, 0.000)
		colorRock      (0.429, 0.396, 0.349, 0.000)
		colorSnow      (0.468, 0.422, 0.368, 1.000)
		BumpHeight      4.25688
		BumpOffset      0.851376
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.558581
		GasToDust   0.25
		Particles   2108
		GasBright   0.261424
		DustBright  0.419342
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   16.761
		Period          73.0858
		Eccentricity    0.926418
		Inclination     -147.16
		AscendingNode   -94.5205
		ArgOfPericenter -151.244
		MeanAnomaly     91.9001
	}
}

Comet	"C9"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            2.09602e-007
	Radius          82.9993
	InertiaMoment   0.399253

	Oblateness      0.00557945

	RotationPeriod  68.2429
	Obliquity       252.174
	EqAscendNode    346.988

	AbsMagn         12.6237
	SlopeParam      2.40537
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.686 0.681 0.679)

	Surface
	{
		SurfStyle       0.593048
		OceanStyle      0.235829
		Randomize      (-0.717, -0.035, -0.022)
		colorDistMagn   0.336017
		colorDistFreq   4.00054
		detailScale     2266.43
		colorConversion true
		snowLevel       2
		tropicLatitude  0.929964
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.469518
		terraceProb     0.259545
		erosion         0
		montesMagn      0.539108
		montesFreq      3.0972
		montesSpiky     0.867707
		montesFraction  0.682118
		dunesFraction   0
		hillsMagn       0
		hillsFreq       18.4807
		hillsFraction   0.596519
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225065
		craterFreq      0.256011
		craterDensity   0.898169
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.481674
		volcanoTemp     1915.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.267, 0.232, 0.190, 0.000)
		colorShelf     (0.274, 0.238, 0.217, 0.000)
		colorBeach     (0.322, 0.279, 0.258, 0.000)
		colorDesert    (0.350, 0.300, 0.251, 0.000)
		colorLowland   (0.384, 0.320, 0.285, 0.000)
		colorUpland    (0.425, 0.388, 0.346, 0.000)
		colorRock      (0.459, 0.422, 0.374, 0.000)
		colorSnow      (0.501, 0.450, 0.394, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   1
		GasToDust   0.25
		Particles   3000
		GasBright   0.161828
		DustBright  0.203423
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   20.0891
		Period          95.9011
		Eccentricity    0.955559
		Inclination     4.32974
		AscendingNode   -150.256
		ArgOfPericenter -162.022
		MeanAnomaly     168.085
	}
}

Comet	"C10"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            6.45382e-015
	Radius          0.292514
	InertiaMoment   0.397893

	Oblateness      0.00839723

	RotationPeriod  66.157
	Obliquity       205.38
	EqAscendNode    331.565

	AbsMagn         8.38558
	SlopeParam      3.09087
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.681 0.676 0.672)

	Surface
	{
		SurfStyle       0.0128797
		OceanStyle      0.893011
		Randomize      (0.837, -0.269, 0.600)
		colorDistMagn   0.977404
		colorDistFreq   5.93774e-005
		detailScale     7.98758
		colorConversion true
		snowLevel       2
		tropicLatitude  0.679334
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.756273
		terraceProb     0.229638
		erosion         0
		montesMagn      0.485607
		montesFreq      2.9042
		montesSpiky     0.939478
		montesFraction  0.796757
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000175012
		hillsFraction   0.618372
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224028
		craterFreq      0.279045
		craterDensity   0.945027
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.545602
		volcanoTemp     1388.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.272, 0.271, 0.269, 0.000)
		colorShelf     (0.289, 0.288, 0.285, 0.000)
		colorBeach     (0.306, 0.304, 0.302, 0.000)
		colorDesert    (0.324, 0.321, 0.319, 0.000)
		colorLowland   (0.341, 0.338, 0.336, 0.000)
		colorUpland    (0.358, 0.355, 0.353, 0.000)
		colorRock      (0.375, 0.372, 0.369, 0.000)
		colorSnow      (0.392, 0.389, 0.386, 1.000)
		BumpHeight      0.263263
		BumpOffset      0.0526525
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.110215
		GasToDust   0.25
		Particles   1202
		GasBright   0.00178868
		DustBright  0.84795
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   21.2076
		Period          104.021
		Eccentricity    0.951036
		Inclination     64.6953
		AscendingNode   153.79
		ArgOfPericenter 102.959
		MeanAnomaly     -90.6468
	}
}

Comet	"C11"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            4.99157e-011
	Radius          5.1412
	InertiaMoment   0.399687

	Oblateness      0.00631561

	RotationPeriod  64.1304
	Obliquity       158.586
	EqAscendNode    316.143

	AbsMagn         4.64275
	SlopeParam      3.68176
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.416 0.413 0.410)

	Surface
	{
		SurfStyle       0.9727
		OceanStyle      0.0587508
		Randomize      (0.359, -0.519, -0.391)
		colorDistMagn   0.44396
		colorDistFreq   0.014504
		detailScale     140.389
		colorConversion true
		snowLevel       2
		tropicLatitude  0.482238
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.623021
		terraceProb     0.395555
		erosion         0
		montesMagn      0.301278
		montesFreq      2.15388
		montesSpiky     0.945925
		montesFraction  0.325192
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0748722
		hillsFraction   0.545622
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.288228
		craterFreq      0.236289
		craterDensity   0.896621
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.411708
		volcanoTemp     1842.09
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.141, 0.145, 0.164, 0.050)
		colorShelf     (0.166, 0.169, 0.189, 0.040)
		colorBeach     (0.191, 0.194, 0.213, 0.030)
		colorDesert    (0.216, 0.219, 0.242, 0.020)
		colorLowland   (0.241, 0.244, 0.267, 0.030)
		colorUpland    (0.266, 0.268, 0.291, 0.050)
		colorRock      (0.291, 0.293, 0.324, 0.020)
		colorSnow      (0.291, 0.293, 0.324, 1.000)
		BumpHeight      4.62708
		BumpOffset      0.925416
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.591407
		GasToDust   0.25
		Particles   2174
		GasBright   0.032668
		DustBright  0.501557
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   15.8509
		Period          67.2142
		Eccentricity    0.939983
		Inclination     131.645
		AscendingNode   -160.637
		ArgOfPericenter -61.0973
		MeanAnomaly     -91.6997
	}
}

Comet	"C12"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            3.86061e-007
	Radius          114.151
	InertiaMoment   0.398519

	Oblateness      0.00947413

	RotationPeriod  62.1537
	Obliquity       111.791
	EqAscendNode    300.72

	AbsMagn         12.2384
	SlopeParam      4.24558
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.734 0.657 0.601)

	Surface
	{
		SurfStyle       0.392472
		OceanStyle      0.350591
		Randomize      (0.966, -0.300, 0.963)
		colorDistMagn   0.357481
		colorDistFreq   9.52202
		detailScale     3117.1
		colorConversion true
		snowLevel       2
		tropicLatitude  0.606634
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.471131
		terraceProb     0.148127
		erosion         0
		montesMagn      0.547202
		montesFreq      3.50057
		montesSpiky     0.956962
		montesFraction  0.363745
		dunesFraction   0
		hillsMagn       0
		hillsFreq       37.9641
		hillsFraction   0.756457
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238693
		craterFreq      0.47244
		craterDensity   0.854615
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.532966
		volcanoTemp     1322.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.293, 0.263, 0.240, 0.000)
		colorShelf     (0.312, 0.279, 0.255, 0.000)
		colorBeach     (0.330, 0.296, 0.270, 0.000)
		colorDesert    (0.348, 0.312, 0.285, 0.000)
		colorLowland   (0.367, 0.329, 0.300, 0.000)
		colorUpland    (0.385, 0.345, 0.315, 0.000)
		colorRock      (0.404, 0.361, 0.330, 0.000)
		colorSnow      (0.422, 0.378, 0.345, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   1
		GasToDust   0.25
		Particles   3000
		GasBright   0.0262881
		DustBright  0.192423
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   13.6065
		Period          53.4569
		Eccentricity    0.911049
		Inclination     105.584
		AscendingNode   141.017
		ArgOfPericenter -121.945
		MeanAnomaly     -123.85
	}
}

Comet	"C13"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.18871e-014
	Radius          0.31846
	InertiaMoment   0.395946

	Oblateness      0.00704879

	RotationPeriod  60.2189
	Obliquity       64.9972
	EqAscendNode    285.297

	AbsMagn         8.1764
	SlopeParam      4.83006
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.526 0.524 0.521)

	Surface
	{
		SurfStyle       0.861805
		OceanStyle      0.182172
		Randomize      (0.318, 0.556, -0.608)
		colorDistMagn   0.577247
		colorDistFreq   5.72751e-005
		detailScale     8.69607
		colorConversion true
		snowLevel       2
		tropicLatitude  0.946448
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.627301
		terraceProb     0.433921
		erosion         0
		montesMagn      0.481924
		montesFreq      3.51248
		montesSpiky     0.88763
		montesFraction  0.45654
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000195785
		hillsFraction   0.561073
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228234
		craterFreq      0.271328
		craterDensity   0.925226
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.599068
		volcanoTemp     1625.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.179, 0.183, 0.209, 0.050)
		colorShelf     (0.210, 0.215, 0.240, 0.040)
		colorBeach     (0.242, 0.246, 0.271, 0.030)
		colorDesert    (0.274, 0.278, 0.308, 0.020)
		colorLowland   (0.305, 0.309, 0.339, 0.030)
		colorUpland    (0.337, 0.341, 0.370, 0.050)
		colorRock      (0.368, 0.372, 0.412, 0.020)
		colorSnow      (0.368, 0.372, 0.412, 1.000)
		BumpHeight      0.286614
		BumpOffset      0.0573227
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.143041
		GasToDust   0.25
		Particles   1268
		GasBright   0.126042
		DustBright  0.577156
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   15.1087
		Period          62.5493
		Eccentricity    0.955195
		Inclination     111.514
		AscendingNode   124.525
		ArgOfPericenter 67.7871
		MeanAnomaly     1.65186
	}
}

Comet	"C14"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            9.19383e-011
	Radius          7.06076
	InertiaMoment   0.399026

	Oblateness      0.010714

	RotationPeriod  58.3187
	Obliquity       18.2029
	EqAscendNode    269.875

	AbsMagn         4.33608
	SlopeParam      5.49764
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.621 0.617 0.610)

	Surface
	{
		SurfStyle       0.043298
		OceanStyle      0.870529
		Randomize      (0.657, 0.602, -0.284)
		colorDistMagn   0.110786
		colorDistFreq   0.023167
		detailScale     192.806
		colorConversion true
		snowLevel       2
		tropicLatitude  0.248516
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.531872
		terraceProb     0.136155
		erosion         0
		montesMagn      0.342737
		montesFreq      3.13563
		montesSpiky     0.984336
		montesFraction  0.249663
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.128803
		hillsFraction   0.602047
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222371
		craterFreq      0.241831
		craterDensity   0.887514
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.492063
		volcanoTemp     1482.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.248, 0.247, 0.244, 0.000)
		colorShelf     (0.264, 0.262, 0.259, 0.000)
		colorBeach     (0.279, 0.277, 0.274, 0.000)
		colorDesert    (0.295, 0.293, 0.290, 0.000)
		colorLowland   (0.311, 0.308, 0.305, 0.000)
		colorUpland    (0.326, 0.324, 0.320, 0.000)
		colorRock      (0.342, 0.339, 0.335, 0.000)
		colorSnow      (0.357, 0.355, 0.351, 1.000)
		BumpHeight      6.35468
		BumpOffset      1.27094
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.624233
		GasToDust   0.25
		Particles   2240
		GasBright   0.0923798
		DustBright  0.295305
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   21.0674
		Period          102.991
		Eccentricity    0.988335
		Inclination     -26.5317
		AscendingNode   -31.7059
		ArgOfPericenter 167.791
		MeanAnomaly     -81.6948
	}
}

Comet	"C15"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            7.11077e-007
	Radius          124.464
	InertiaMoment   0.397491

	Oblateness      0.00805279

	RotationPeriod  56.4468
	Obliquity       331.409
	EqAscendNode    254.452

	AbsMagn         11.8889
	SlopeParam      6.40169
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.551 0.548 0.544)

	Surface
	{
		SurfStyle       0.865618
		OceanStyle      0.763197
		Randomize      (0.568, -0.215, 0.489)
		colorDistMagn   0.828148
		colorDistFreq   6.36408
		detailScale     3398.7
		colorConversion true
		snowLevel       2
		tropicLatitude  0.521531
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.5385
		terraceProb     0.286822
		erosion         0
		montesMagn      0.49745
		montesFreq      3.33519
		montesSpiky     0.955411
		montesFraction  0.214462
		dunesFraction   0
		hillsMagn       0
		hillsFreq       31.1347
		hillsFraction   0.74966
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230663
		craterFreq      0.582543
		craterDensity   0.963058
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52075
		volcanoTemp     1700.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.187, 0.192, 0.218, 0.050)
		colorShelf     (0.220, 0.225, 0.250, 0.040)
		colorBeach     (0.254, 0.257, 0.283, 0.030)
		colorDesert    (0.287, 0.290, 0.321, 0.020)
		colorLowland   (0.320, 0.323, 0.354, 0.030)
		colorUpland    (0.353, 0.356, 0.386, 0.050)
		colorRock      (0.386, 0.389, 0.430, 0.020)
		colorSnow      (0.386, 0.389, 0.430, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   1
		GasToDust   0.25
		Particles   3000
		GasBright   0.259324
		DustBright  0.612847
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   12.3566
		Period          46.2628
		Eccentricity    0.938195
		Inclination     177.108
		AscendingNode   10.9206
		ArgOfPericenter -173.007
		MeanAnomaly     -11.9812
	}
}

Comet	"C16"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            2.18946e-014
	Radius          0.43677
	InertiaMoment   0.399476

	Oblateness      0.0121708

	RotationPeriod  54.5975
	Obliquity       284.614
	EqAscendNode    239.03

	AbsMagn         7.96771
	SlopeParam      9.53384
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.680 0.678 0.675)

	Surface
	{
		SurfStyle       0.573589
		OceanStyle      0.73291
		Randomize      (-0.290, -0.517, -0.206)
		colorDistMagn   0.539365
		colorDistFreq   4.97177e-005
		detailScale     11.9267
		colorConversion true
		snowLevel       2
		tropicLatitude  0.944848
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.554542
		terraceProb     0.176965
		erosion         0
		montesMagn      0.658755
		montesFreq      2.05913
		montesSpiky     0.850689
		montesFraction  0.733303
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000441839
		hillsFraction   0.806131
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23179
		craterFreq      0.216951
		craterDensity   0.849594
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.407246
		volcanoTemp     1618.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.265, 0.231, 0.189, 0.000)
		colorShelf     (0.272, 0.237, 0.216, 0.000)
		colorBeach     (0.320, 0.278, 0.256, 0.000)
		colorDesert    (0.347, 0.298, 0.250, 0.000)
		colorLowland   (0.381, 0.319, 0.283, 0.000)
		colorUpland    (0.422, 0.387, 0.344, 0.000)
		colorRock      (0.456, 0.421, 0.371, 0.000)
		colorSnow      (0.497, 0.448, 0.391, 1.000)
		BumpHeight      0.393093
		BumpOffset      0.0786186
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.175867
		GasToDust   0.25
		Particles   1335
		GasBright   0.19838
		DustBright  0.358278
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   12.0692
		Period          44.6581
		Eccentricity    0.939504
		Inclination     6.11821
		AscendingNode   -42.0036
		ArgOfPericenter -29.1801
		MeanAnomaly     -20.6517
	}
}

Comet	"C17"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.69339e-010
	Radius          7.70962
	InertiaMoment   0.398232

	Oblateness      0.00922273

	RotationPeriod  52.7655
	Obliquity       237.82
	EqAscendNode    223.607

	AbsMagn         4.00619
	SlopeParam      2.76166
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.703 0.648 0.622)

	Surface
	{
		SurfStyle       0.049193
		OceanStyle      0.149597
		Randomize      (0.459, 0.637, -0.985)
		colorDistMagn   0.786577
		colorDistFreq   0.0504253
		detailScale     210.524
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997651
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.566587
		terraceProb     0.59044
		erosion         0
		montesMagn      0.478029
		montesFreq      2.64222
		montesSpiky     0.999174
		montesFraction  0.785872
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0669399
		hillsFraction   0.669043
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.208875
		craterFreq      0.243844
		craterDensity   0.850024
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52453
		volcanoTemp     1339.95
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.281, 0.259, 0.249, 0.000)
		colorShelf     (0.299, 0.275, 0.264, 0.000)
		colorBeach     (0.317, 0.291, 0.280, 0.000)
		colorDesert    (0.334, 0.308, 0.296, 0.000)
		colorLowland   (0.352, 0.324, 0.311, 0.000)
		colorUpland    (0.369, 0.340, 0.327, 0.000)
		colorRock      (0.387, 0.356, 0.342, 0.000)
		colorSnow      (0.404, 0.372, 0.358, 1.000)
		BumpHeight      6.93866
		BumpOffset      1.38773
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.657059
		GasToDust   0.25
		Particles   2307
		GasBright   0.100177
		DustBright  0.140968
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   17.6747
		Period          79.1427
		Eccentricity    0.93429
		Inclination     148.004
		AscendingNode   -148.698
		ArgOfPericenter 179.449
		MeanAnomaly     28.4257
	}
}

Comet	"C18"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            5.21407e-018
	Radius          0.0270199
	InertiaMoment   0.3999

	Oblateness      0.0139185

	RotationPeriod  50.9457
	Obliquity       191.026
	EqAscendNode    208.184

	AbsMagn         11.5668
	SlopeParam      3.38893
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.675 0.551 0.426)

	Surface
	{
		SurfStyle       0.211785
		OceanStyle      0.330255
		Randomize      (0.855, -0.735, -0.240)
		colorDistMagn   0.425477
		colorDistFreq   4.30003e-007
		detailScale     0.737823
		colorConversion true
		snowLevel       2
		tropicLatitude  0.694609
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.719099
		terraceProb     0.104992
		erosion         0
		montesMagn      0.398475
		montesFreq      3.95252
		montesSpiky     0.970993
		montesFraction  0.590253
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.32712e-006
		hillsFraction   0.666725
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226664
		craterFreq      0.236814
		craterDensity   0.809708
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.538309
		volcanoTemp     1857.32
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.270, 0.221, 0.170, 0.000)
		colorShelf     (0.287, 0.234, 0.181, 0.000)
		colorBeach     (0.304, 0.248, 0.192, 0.000)
		colorDesert    (0.321, 0.262, 0.202, 0.000)
		colorLowland   (0.337, 0.276, 0.213, 0.000)
		colorUpland    (0.354, 0.290, 0.224, 0.000)
		colorRock      (0.371, 0.303, 0.234, 0.000)
		colorSnow      (0.388, 0.317, 0.245, 1.000)
		BumpHeight      0.0243179
		BumpOffset      0.00486358
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.344288
		DustBright  0.381343
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   11.0779
		Period          39.2704
		Eccentricity    0.95265
		Inclination     -125.061
		AscendingNode   173.507
		ArgOfPericenter 127.651
		MeanAnomaly     -139.29
	}
}

Comet	"C19"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            4.03271e-014
	Radius          0.477554
	InertiaMoment   0.398786

	Oblateness      0.0106373

	RotationPeriod  49.1335
	Obliquity       144.231
	EqAscendNode    192.762

	AbsMagn         7.75893
	SlopeParam      3.96017
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.831 0.783 0.749)

	Surface
	{
		SurfStyle       0.953616
		OceanStyle      0.503886
		Randomize      (0.592, 0.590, -0.322)
		colorDistMagn   0.984623
		colorDistFreq   5.90107e-005
		detailScale     13.0404
		colorConversion true
		snowLevel       2
		tropicLatitude  0.34831
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.617789
		terraceProb     0.206246
		erosion         0
		montesMagn      0.510421
		montesFreq      2.80749
		montesSpiky     0.849534
		montesFraction  0.483044
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000541889
		hillsFraction   0.644307
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251371
		craterFreq      0.168756
		craterDensity   0.783181
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.487534
		volcanoTemp     1539.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.283, 0.274, 0.300, 0.050)
		colorShelf     (0.332, 0.321, 0.345, 0.040)
		colorBeach     (0.382, 0.368, 0.390, 0.030)
		colorDesert    (0.432, 0.415, 0.442, 0.020)
		colorLowland   (0.482, 0.462, 0.487, 0.030)
		colorUpland    (0.532, 0.509, 0.532, 0.050)
		colorRock      (0.582, 0.556, 0.592, 0.020)
		colorSnow      (0.582, 0.556, 0.592, 1.000)
		BumpHeight      0.429798
		BumpOffset      0.0859597
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.208693
		GasToDust   0.25
		Particles   1401
		GasBright   0.013744
		DustBright  0.396374
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   19.492
		Period          91.6571
		Eccentricity    0.922554
		Inclination     -124.734
		AscendingNode   -8.49901
		ArgOfPericenter -173.14
		MeanAnomaly     -98.3172
	}
}

Comet	"C20"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            3.11901e-010
	Radius          10.5473
	InertiaMoment   0.39695

	Oblateness      0.0158625

	RotationPeriod  47.3241
	Obliquity       97.4371
	EqAscendNode    177.339

	AbsMagn         3.64663
	SlopeParam      4.52812
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.570 0.564 0.560)

	Surface
	{
		SurfStyle       0.525889
		OceanStyle      0.232899
		Randomize      (0.400, -0.999, 0.127)
		colorDistMagn   0.289041
		colorDistFreq   0.0166837
		detailScale     288.012
		colorConversion true
		snowLevel       2
		tropicLatitude  0.887719
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.461324
		terraceProb     0.62854
		erosion         0
		montesMagn      0.523498
		montesFreq      2.9769
		montesSpiky     0.941363
		montesFraction  0.410264
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.191435
		hillsFraction   0.77619
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252286
		craterFreq      0.163025
		craterDensity   0.868504
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.555833
		volcanoTemp     1808.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.222, 0.192, 0.157, 0.000)
		colorShelf     (0.228, 0.197, 0.179, 0.000)
		colorBeach     (0.268, 0.231, 0.213, 0.000)
		colorDesert    (0.291, 0.248, 0.207, 0.000)
		colorLowland   (0.319, 0.265, 0.235, 0.000)
		colorUpland    (0.353, 0.321, 0.285, 0.000)
		colorRock      (0.382, 0.350, 0.308, 0.000)
		colorSnow      (0.416, 0.372, 0.325, 1.000)
		BumpHeight      9.49258
		BumpOffset      1.89852
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.689885
		GasToDust   0.25
		Particles   2373
		GasBright   0.0828023
		DustBright  0.811802
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   20.6587
		Period          100.009
		Eccentricity    0.932491
		Inclination     -58.7013
		AscendingNode   51.4842
		ArgOfPericenter -19.8956
		MeanAnomaly     74.6147
	}
}

Comet	"C21"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            9.60368e-018
	Radius          0.0295809
	InertiaMoment   0.399258

	Oblateness      0.0123941

	RotationPeriod  45.513
	Obliquity       50.6428
	EqAscendNode    161.917

	AbsMagn         11.2663
	SlopeParam      5.14323
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.491 0.487 0.484)

	Surface
	{
		SurfStyle       0.378482
		OceanStyle      0.724582
		Randomize      (-0.355, 0.980, -0.501)
		colorDistMagn   0.833938
		colorDistFreq   5.44256e-007
		detailScale     0.807756
		colorConversion true
		snowLevel       2
		tropicLatitude  0.340616
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.548318
		terraceProb     0.231161
		erosion         0
		montesMagn      0.457867
		montesFreq      3.11707
		montesSpiky     0.920982
		montesFraction  0.76858
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.91012e-006
		hillsFraction   0.831894
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234184
		craterFreq      0.169248
		craterDensity   0.742134
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.552963
		volcanoTemp     1462.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.196, 0.195, 0.193, 0.000)
		colorShelf     (0.209, 0.207, 0.206, 0.000)
		colorBeach     (0.221, 0.219, 0.218, 0.000)
		colorDesert    (0.233, 0.231, 0.230, 0.000)
		colorLowland   (0.246, 0.243, 0.242, 0.000)
		colorUpland    (0.258, 0.256, 0.254, 0.000)
		colorRock      (0.270, 0.268, 0.266, 0.000)
		colorSnow      (0.282, 0.280, 0.278, 1.000)
		BumpHeight      0.0266228
		BumpOffset      0.00532456
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.0877917
		DustBright  0.491299
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   21.5079
		Period          106.238
		Eccentricity    0.965563
		Inclination     -110.976
		AscendingNode   -171.058
		ArgOfPericenter -109.598
		MeanAnomaly     93.5265
	}
}

Comet	"C22"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            7.42774e-014
	Radius          0.652567
	InertiaMoment   0.397902

	Oblateness      0.0185705

	RotationPeriod  43.6956
	Obliquity       3.84849
	EqAscendNode    146.494

	AbsMagn         7.54949
	SlopeParam      5.89483
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.542 0.457 0.299)

	Surface
	{
		SurfStyle       0.950256
		OceanStyle      0.868401
		Randomize      (0.468, -0.883, 0.250)
		colorDistMagn   0.737477
		colorDistFreq   0.00017407
		detailScale     17.8194
		colorConversion true
		snowLevel       2
		tropicLatitude  0.886105
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.504631
		terraceProb     0.113012
		erosion         0
		montesMagn      0.625413
		montesFreq      2.89545
		montesSpiky     0.990328
		montesFraction  0.50528
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00121542
		hillsFraction   0.653149
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228589
		craterFreq      0.197365
		craterDensity   0.982598
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.458363
		volcanoTemp     1626.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.184, 0.160, 0.119, 0.050)
		colorShelf     (0.217, 0.187, 0.137, 0.040)
		colorBeach     (0.249, 0.215, 0.155, 0.030)
		colorDesert    (0.282, 0.242, 0.176, 0.020)
		colorLowland   (0.314, 0.270, 0.194, 0.030)
		colorUpland    (0.347, 0.297, 0.212, 0.050)
		colorRock      (0.379, 0.325, 0.236, 0.020)
		colorSnow      (0.379, 0.325, 0.236, 1.000)
		BumpHeight      0.58731
		BumpOffset      0.117462
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.241518
		GasToDust   0.25
		Particles   1467
		GasBright   0.055522
		DustBright  0.208055
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   15.557
		Period          65.3539
		Eccentricity    0.970596
		Inclination     -64.6423
		AscendingNode   -53.3756
		ArgOfPericenter 173.266
		MeanAnomaly     109.471
	}
}

Comet	"C23"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            5.74482e-010
	Radius          11.5611
	InertiaMoment   0.399692

	Oblateness      0.014641

	RotationPeriod  41.8671
	Obliquity       317.054
	EqAscendNode    131.071

	AbsMagn         3.24794
	SlopeParam      7.11565
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.607 0.603 0.600)

	Surface
	{
		SurfStyle       0.427335
		OceanStyle      0.0593283
		Randomize      (-0.537, -0.258, 0.839)
		colorDistMagn   0.634591
		colorDistFreq   0.108656
		detailScale     315.695
		colorConversion true
		snowLevel       2
		tropicLatitude  0.880409
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.580172
		terraceProb     0.289312
		erosion         0
		montesMagn      0.620666
		montesFreq      3.16491
		montesSpiky     0.996752
		montesFraction  0.157527
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.379134
		hillsFraction   0.560611
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.215187
		craterFreq      0.240289
		craterDensity   0.867653
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.62603
		volcanoTemp     1937.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.243, 0.241, 0.240, 0.000)
		colorShelf     (0.258, 0.256, 0.255, 0.000)
		colorBeach     (0.273, 0.272, 0.270, 0.000)
		colorDesert    (0.288, 0.287, 0.285, 0.000)
		colorLowland   (0.303, 0.302, 0.300, 0.000)
		colorUpland    (0.319, 0.317, 0.315, 0.000)
		colorRock      (0.334, 0.332, 0.330, 0.000)
		colorSnow      (0.349, 0.347, 0.345, 1.000)
		BumpHeight      10.405
		BumpOffset      2.081
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.72271
		GasToDust   0.25
		Particles   2439
		GasBright   0.201748
		DustBright  0.546316
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   20.4253
		Period          98.3181
		Eccentricity    0.963876
		Inclination     88.5508
		AscendingNode   -136.34
		ArgOfPericenter -26.0691
		MeanAnomaly     -61.7398
	}
}

Comet	"C24"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.76887e-017
	Radius          0.0403768
	InertiaMoment   0.398526

	Oblateness      0.022069

	RotationPeriod  40.0227
	Obliquity       270.26
	EqAscendNode    115.649

	AbsMagn         10.9832
	SlopeParam      2.39474
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.412 0.407 0.400)

	Surface
	{
		SurfStyle       0.143403
		OceanStyle      0.308749
		Randomize      (0.734, -0.725, 0.577)
		colorDistMagn   0.158909
		colorDistFreq   4.18838e-007
		detailScale     1.10256
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999986
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.632199
		terraceProb     0.345836
		erosion         0
		montesMagn      0.369081
		montesFreq      2.99337
		montesSpiky     0.928218
		montesFraction  0.444882
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.84086e-006
		hillsFraction   0.772502
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.193205
		craterFreq      0.256077
		craterDensity   0.721579
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.498614
		volcanoTemp     1577.25
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.165, 0.163, 0.160, 0.000)
		colorShelf     (0.175, 0.173, 0.170, 0.000)
		colorBeach     (0.185, 0.183, 0.180, 0.000)
		colorDesert    (0.196, 0.193, 0.190, 0.000)
		colorLowland   (0.206, 0.203, 0.200, 0.000)
		colorUpland    (0.216, 0.214, 0.210, 0.000)
		colorRock      (0.227, 0.224, 0.220, 0.000)
		colorSnow      (0.237, 0.234, 0.230, 1.000)
		BumpHeight      0.0363391
		BumpOffset      0.00726782
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.142196
		DustBright  0.290354
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   13.9256
		Period          55.348
		Eccentricity    0.904642
		Inclination     -2.60452
		AscendingNode   -91.0701
		ArgOfPericenter 79.9368
		MeanAnomaly     -132.238
	}
}

Comet	"C25"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.3681e-013
	Radius          0.716123
	InertiaMoment   0.395986

	Oblateness      0.0173482

	RotationPeriod  38.1571
	Obliquity       223.466
	EqAscendNode    100.226

	AbsMagn         7.33881
	SlopeParam      3.0823
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.553 0.549 0.547)

	Surface
	{
		SurfStyle       0.110607
		OceanStyle      0.676577
		Randomize      (0.773, 0.866, -0.743)
		colorDistMagn   0.554389
		colorDistFreq   0.000158947
		detailScale     19.5549
		colorConversion true
		snowLevel       2
		tropicLatitude  0.958729
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.483415
		terraceProb     0.272026
		erosion         0
		montesMagn      0.266613
		montesFreq      3.96379
		montesSpiky     0.866425
		montesFraction  0.462011
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00086481
		hillsFraction   0.898356
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250472
		craterFreq      0.199703
		craterDensity   0.854239
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.494161
		volcanoTemp     1830.09
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.221, 0.220, 0.219, 0.000)
		colorShelf     (0.235, 0.233, 0.233, 0.000)
		colorBeach     (0.249, 0.247, 0.246, 0.000)
		colorDesert    (0.263, 0.261, 0.260, 0.000)
		colorLowland   (0.276, 0.274, 0.274, 0.000)
		colorUpland    (0.290, 0.288, 0.287, 0.000)
		colorRock      (0.304, 0.302, 0.301, 0.000)
		colorSnow      (0.318, 0.316, 0.315, 1.000)
		BumpHeight      0.644511
		BumpOffset      0.128902
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.274344
		GasToDust   0.25
		Particles   1534
		GasBright   0.355612
		DustBright  0.561425
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   20.598
		Period          99.568
		Eccentricity    0.968961
		Inclination     74.8392
		AscendingNode   -98.1829
		ArgOfPericenter 9.68358
		MeanAnomaly     12.8947
	}
}

Comet	"C26"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.05812e-009
	Radius          15.7638
	InertiaMoment   0.399032

	Oblateness      0.0267915

	RotationPeriod  36.2646
	Obliquity       176.671
	EqAscendNode    84.8037

	AbsMagn         2.79544
	SlopeParam      3.67394
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.641 0.514 0.425)

	Surface
	{
		SurfStyle       0.9787
		OceanStyle      0.27732
		Randomize      (-0.234, 0.167, -0.311)
		colorDistMagn   0.0568759
		colorDistFreq   0.171823
		detailScale     430.456
		colorConversion true
		snowLevel       2
		tropicLatitude  0.879654
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.657921
		terraceProb     0.284216
		erosion         0
		montesMagn      0.48682
		montesFreq      2.9365
		montesSpiky     0.925565
		montesFraction  0.348761
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.598614
		hillsFraction   0.443059
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.269126
		craterFreq      0.221417
		craterDensity   0.868435
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.452782
		volcanoTemp     1915.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.218, 0.180, 0.170, 0.050)
		colorShelf     (0.256, 0.211, 0.196, 0.040)
		colorBeach     (0.295, 0.242, 0.221, 0.030)
		colorDesert    (0.333, 0.272, 0.251, 0.020)
		colorLowland   (0.372, 0.303, 0.276, 0.030)
		colorUpland    (0.410, 0.334, 0.302, 0.050)
		colorRock      (0.448, 0.365, 0.336, 0.020)
		colorSnow      (0.448, 0.365, 0.336, 1.000)
		BumpHeight      14.1874
		BumpOffset      2.83748
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.755536
		GasToDust   0.25
		Particles   2506
		GasBright   0.268778
		DustBright  0.332745
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   19.4589
		Period          91.4237
		Eccentricity    0.935158
		Inclination     121.639
		AscendingNode   13.4738
		ArgOfPericenter -72.4095
		MeanAnomaly     -43.5629
	}
}

Comet	"C27"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            3.25804e-017
	Radius          0.0443584
	InertiaMoment   0.397502

	Oblateness      0.0214991

	RotationPeriod  34.3392
	Obliquity       129.877
	EqAscendNode    69.3811

	AbsMagn         10.7143
	SlopeParam      4.23781
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.490 0.487 0.483)

	Surface
	{
		SurfStyle       0.200047
		OceanStyle      0.154956
		Randomize      (0.830, 0.115, -0.851)
		colorDistMagn   0.00251395
		colorDistFreq   1.48083e-006
		detailScale     1.21128
		colorConversion true
		snowLevel       2
		tropicLatitude  0.961261
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.527088
		terraceProb     0.333423
		erosion         0
		montesMagn      0.450878
		montesFreq      1.88091
		montesSpiky     0.908351
		montesFraction  0.383811
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.15073e-006
		hillsFraction   0.790511
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.207026
		craterFreq      0.193385
		craterDensity   1.06703
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.465894
		volcanoTemp     1550.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.196, 0.195, 0.193, 0.000)
		colorShelf     (0.208, 0.207, 0.205, 0.000)
		colorBeach     (0.221, 0.219, 0.217, 0.000)
		colorDesert    (0.233, 0.231, 0.229, 0.000)
		colorLowland   (0.245, 0.243, 0.242, 0.000)
		colorUpland    (0.257, 0.256, 0.254, 0.000)
		colorRock      (0.270, 0.268, 0.266, 0.000)
		colorSnow      (0.282, 0.280, 0.278, 1.000)
		BumpHeight      0.0399225
		BumpOffset      0.00798451
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.00168011
		DustBright  0.28433
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   16.7578
		Period          73.0646
		Eccentricity    0.943138
		Inclination     45.6828
		AscendingNode   -108.286
		ArgOfPericenter -33.5183
		MeanAnomaly     143.789
	}
}

Comet	"C28"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            2.51986e-013
	Radius          0.975461
	InertiaMoment   0.399481

	Oblateness      0.0335056

	RotationPeriod  32.3738
	Obliquity       83.0827
	EqAscendNode    53.9585

	AbsMagn         7.12627
	SlopeParam      4.82166
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.544 0.461 0.375)

	Surface
	{
		SurfStyle       0.818469
		OceanStyle      0.01973
		Randomize      (0.866, -0.246, -0.051)
		colorDistMagn   0.620433
		colorDistFreq   0.000723779
		detailScale     26.6366
		colorConversion true
		snowLevel       2
		tropicLatitude  0.988252
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.654578
		terraceProb     0.532451
		erosion         0
		montesMagn      0.487853
		montesFreq      3.36142
		montesSpiky     0.776246
		montesFraction  0.662687
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00233154
		hillsFraction   0.563901
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228258
		craterFreq      0.227133
		craterDensity   0.883868
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.540207
		volcanoTemp     1722.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.212, 0.157, 0.105, 0.000)
		colorShelf     (0.218, 0.161, 0.120, 0.000)
		colorBeach     (0.256, 0.189, 0.143, 0.000)
		colorDesert    (0.277, 0.203, 0.139, 0.000)
		colorLowland   (0.305, 0.216, 0.158, 0.000)
		colorUpland    (0.337, 0.263, 0.191, 0.000)
		colorRock      (0.365, 0.286, 0.206, 0.000)
		colorSnow      (0.397, 0.304, 0.218, 1.000)
		BumpHeight      0.877915
		BumpOffset      0.175583
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.30717
		GasToDust   0.25
		Particles   1600
		GasBright   0.0500203
		DustBright  0.720476
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   24.2498
		Period          127.188
		Eccentricity    0.963669
		Inclination     162.593
		AscendingNode   82.6655
		ArgOfPericenter 67.8228
		MeanAnomaly     109.8
	}
}

Comet	"C29"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.94893e-009
	Radius          17.3366
	InertiaMoment   0.39824

	Oblateness      0.0275233

	RotationPeriod  30.3606
	Obliquity       36.2884
	EqAscendNode    38.5359

	AbsMagn         2.2643
	SlopeParam      5.48745
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.435 0.430 0.427)

	Surface
	{
		SurfStyle       0.592074
		OceanStyle      0.674618
		Randomize      (-0.693, 0.461, 0.088)
		colorDistMagn   0.22971
		colorDistFreq   0.26638
		detailScale     473.404
		colorConversion true
		snowLevel       2
		tropicLatitude  0.878635
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.675589
		terraceProb     0.179422
		erosion         0
		montesMagn      0.580985
		montesFreq      3.32495
		montesSpiky     0.902375
		montesFraction  0.279728
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.626551
		hillsFraction   0.738012
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234491
		craterFreq      0.206385
		craterDensity   0.679014
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.568318
		volcanoTemp     1244.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.170, 0.146, 0.120, 0.000)
		colorShelf     (0.174, 0.150, 0.137, 0.000)
		colorBeach     (0.204, 0.176, 0.162, 0.000)
		colorDesert    (0.222, 0.189, 0.158, 0.000)
		colorLowland   (0.244, 0.202, 0.179, 0.000)
		colorUpland    (0.270, 0.245, 0.218, 0.000)
		colorRock      (0.292, 0.267, 0.235, 0.000)
		colorSnow      (0.318, 0.284, 0.248, 1.000)
		BumpHeight      15.6029
		BumpOffset      3.12058
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.788362
		GasToDust   0.25
		Particles   2572
		GasBright   0.0564019
		DustBright  0.398581
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   26.2342
		Period          143.114
		Eccentricity    0.970872
		Inclination     93.2519
		AscendingNode   152.309
		ArgOfPericenter -59.5657
		MeanAnomaly     -134.209
	}
}

Comet	"C30"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            6.00092e-017
	Radius          0.0603641
	InertiaMoment   0.399905

	Oblateness      0.0437293

	RotationPeriod  28.2907
	Obliquity       349.494
	EqAscendNode    23.1133

	AbsMagn         10.4572
	SlopeParam      6.38589
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.493 0.486 0.482)

	Surface
	{
		SurfStyle       0.953435
		OceanStyle      0.191562
		Randomize      (0.796, 0.741, 0.727)
		colorDistMagn   0.213184
		colorDistFreq   1.71177e-006
		detailScale     1.64834
		colorConversion true
		snowLevel       2
		tropicLatitude  0.761902
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.511787
		terraceProb     0.157441
		erosion         0
		montesMagn      0.511224
		montesFreq      2.78197
		montesSpiky     0.842728
		montesFraction  0.289253
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.00373e-005
		hillsFraction   0.621915
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.268574
		craterFreq      0.187547
		craterDensity   0.818897
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.522296
		volcanoTemp     1600.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.167, 0.170, 0.193, 0.050)
		colorShelf     (0.197, 0.199, 0.222, 0.040)
		colorBeach     (0.227, 0.228, 0.251, 0.030)
		colorDesert    (0.256, 0.258, 0.284, 0.020)
		colorLowland   (0.286, 0.287, 0.313, 0.030)
		colorUpland    (0.315, 0.316, 0.342, 0.050)
		colorRock      (0.345, 0.345, 0.381, 0.020)
		colorSnow      (0.345, 0.345, 0.381, 1.000)
		BumpHeight      0.0543277
		BumpOffset      0.0108655
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.171932
		DustBright  0.767537
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   9.77253
		Period          32.5381
		Eccentricity    0.900465
		Inclination     43.8628
		AscendingNode   -118.983
		ArgOfPericenter -91.6934
		MeanAnomaly     64.9022
	}
}

Comet	"C31"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            4.64127e-013
	Radius          1.07387
	InertiaMoment   0.398792

	Oblateness      0.0370922

	RotationPeriod  26.1535
	Obliquity       302.7
	EqAscendNode    7.69076

	AbsMagn         6.91124
	SlopeParam      9.24434
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.448 0.445 0.442)

	Surface
	{
		SurfStyle       0.227537
		OceanStyle      0.465377
		Randomize      (-0.613, -0.032, 0.080)
		colorDistMagn   0.89501
		colorDistFreq   0.000825702
		detailScale     29.3237
		colorConversion true
		snowLevel       2
		tropicLatitude  0.956641
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.713743
		terraceProb     0.14769
		erosion         0
		montesMagn      0.446743
		montesFreq      2.72287
		montesSpiky     0.974518
		montesFraction  0.518078
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00244695
		hillsFraction   0.87525
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223879
		craterFreq      0.206626
		craterDensity   0.758003
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.595787
		volcanoTemp     1753.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.179, 0.178, 0.177, 0.000)
		colorShelf     (0.190, 0.189, 0.188, 0.000)
		colorBeach     (0.201, 0.200, 0.199, 0.000)
		colorDesert    (0.213, 0.211, 0.210, 0.000)
		colorLowland   (0.224, 0.222, 0.221, 0.000)
		colorUpland    (0.235, 0.234, 0.232, 0.000)
		colorRock      (0.246, 0.245, 0.243, 0.000)
		colorSnow      (0.257, 0.256, 0.254, 1.000)
		BumpHeight      0.966479
		BumpOffset      0.193296
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.339996
		GasToDust   0.25
		Particles   1666
		GasBright   0.151032
		DustBright  0.472924
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   17.6028
		Period          78.6599
		Eccentricity    0.947525
		Inclination     64.1728
		AscendingNode   -85.7671
		ArgOfPericenter -91.8587
		MeanAnomaly     -106.122
	}
}

Comet	"C32"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            3.58969e-009
	Radius          23.5703
	InertiaMoment   0.396966

	Oblateness      0.0601287

	RotationPeriod  23.9363
	Obliquity       255.906
	EqAscendNode    352.268

	AbsMagn         1.60681
	SlopeParam      2.7523
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.528 0.361 0.294)

	Surface
	{
		SurfStyle       0.516259
		OceanStyle      0.963749
		Randomize      (-0.925, 0.211, 0.357)
		colorDistMagn   0.763931
		colorDistFreq   0.33849
		detailScale     643.627
		colorConversion true
		snowLevel       2
		tropicLatitude  0.995064
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.715211
		terraceProb     0.400202
		erosion         0
		montesMagn      0.520992
		montesFreq      2.9604
		montesSpiky     0.862929
		montesFraction  0.771393
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.85071
		hillsFraction   0.629099
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235037
		craterFreq      0.181281
		craterDensity   1.0005
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48397
		volcanoTemp     1374.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.206, 0.123, 0.082, 0.000)
		colorShelf     (0.211, 0.126, 0.094, 0.000)
		colorBeach     (0.248, 0.148, 0.112, 0.000)
		colorDesert    (0.269, 0.159, 0.109, 0.000)
		colorLowland   (0.295, 0.169, 0.124, 0.000)
		colorUpland    (0.327, 0.205, 0.150, 0.000)
		colorRock      (0.354, 0.224, 0.162, 0.000)
		colorSnow      (0.385, 0.238, 0.171, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.821188
		GasToDust   0.25
		Particles   2638
		GasBright   0.0928724
		DustBright  0.215571
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   16.6398
		Period          72.2941
		Eccentricity    0.948421
		Inclination     169.489
		AscendingNode   142.406
		ArgOfPericenter 107.244
		MeanAnomaly     9.43203
	}
}

Comet	"C33"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.10529e-016
	Radius          0.0665175
	InertiaMoment   0.399264

	Oblateness      0.0542459

	RotationPeriod  21.6237
	Obliquity       209.111
	EqAscendNode    336.846

	AbsMagn         10.2098
	SlopeParam      3.38084
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.682 0.679 0.678)

	Surface
	{
		SurfStyle       0.194481
		OceanStyle      0.0947621
		Randomize      (-0.090, -0.469, 0.101)
		colorDistMagn   0.839628
		colorDistFreq   1.52872e-006
		detailScale     1.81637
		colorConversion true
		snowLevel       2
		tropicLatitude  0.45488
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.587489
		terraceProb     0.375241
		erosion         0
		montesMagn      0.591606
		montesFreq      2.33792
		montesSpiky     0.969445
		montesFraction  0.865808
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.19461e-005
		hillsFraction   0.757959
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241187
		craterFreq      0.188959
		craterDensity   0.91806
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.563018
		volcanoTemp     1519.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.273, 0.272, 0.271, 0.000)
		colorShelf     (0.290, 0.289, 0.288, 0.000)
		colorBeach     (0.307, 0.306, 0.305, 0.000)
		colorDesert    (0.324, 0.323, 0.322, 0.000)
		colorLowland   (0.341, 0.340, 0.339, 0.000)
		colorUpland    (0.358, 0.357, 0.356, 0.000)
		colorRock      (0.375, 0.374, 0.373, 0.000)
		colorSnow      (0.392, 0.391, 0.390, 1.000)
		BumpHeight      0.0598658
		BumpOffset      0.0119732
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.28557
		DustBright  0.507359
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   22.4926
		Period          113.617
		Eccentricity    0.959762
		Inclination     -17.8949
		AscendingNode   -66.6946
		ArgOfPericenter -137.604
		MeanAnomaly     -72.7026
	}
}

Comet	"C34"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            8.54863e-013
	Radius          1.45871
	InertiaMoment   0.397911

	Oblateness      0.093378

	RotationPeriod  19.1968
	Obliquity       162.317
	EqAscendNode    321.423

	AbsMagn         6.69301
	SlopeParam      3.95245
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.514 0.507 0.504)

	Surface
	{
		SurfStyle       0.112431
		OceanStyle      0.195847
		Randomize      (0.815, -0.202, 0.170)
		colorDistMagn   0.969915
		colorDistFreq   0.000946779
		detailScale     39.8325
		colorConversion true
		snowLevel       2
		tropicLatitude  0.907117
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.435012
		terraceProb     0.251639
		erosion         0
		montesMagn      0.428979
		montesFreq      3.09792
		montesSpiky     0.960684
		montesFraction  0.348812
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00528746
		hillsFraction   0.633516
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239999
		craterFreq      0.213233
		craterDensity   1.07837
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.387701
		volcanoTemp     1539.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.206, 0.203, 0.201, 0.000)
		colorShelf     (0.218, 0.215, 0.214, 0.000)
		colorBeach     (0.231, 0.228, 0.227, 0.000)
		colorDesert    (0.244, 0.241, 0.239, 0.000)
		colorLowland   (0.257, 0.253, 0.252, 0.000)
		colorUpland    (0.270, 0.266, 0.264, 0.000)
		colorRock      (0.283, 0.279, 0.277, 0.000)
		colorSnow      (0.296, 0.291, 0.290, 1.000)
		BumpHeight      1.31284
		BumpOffset      0.262568
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.372822
		GasToDust   0.25
		Particles   1732
		GasBright   0.200129
		DustBright  0.277288
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   27.6682
		Period          155.007
		Eccentricity    0.980736
		Inclination     -122.229
		AscendingNode   109.846
		ArgOfPericenter 110.322
		MeanAnomaly     -117.894
	}
}

Comet	"C35"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            6.61175e-009
	Radius          25.9969
	InertiaMoment   0.399698

	Oblateness      0.0916634

	RotationPeriod  16.6314
	Obliquity       115.523
	EqAscendNode    306

	AbsMagn         0.709504
	SlopeParam      4.52013
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.710 0.545 0.463)

	Surface
	{
		SurfStyle       0.0711561
		OceanStyle      0.277765
		Randomize      (-0.804, -0.799, -0.006)
		colorDistMagn   0.818259
		colorDistFreq   0.367162
		detailScale     709.889
		colorConversion true
		snowLevel       2
		tropicLatitude  0.301165
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.310602
		terraceProb     0.493331
		erosion         0
		montesMagn      0.657909
		montesFreq      2.50761
		montesSpiky     0.769942
		montesFraction  0.743888
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.54646
		hillsFraction   0.576903
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230964
		craterFreq      0.246621
		craterDensity   0.835924
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.536512
		volcanoTemp     1609.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.284, 0.218, 0.185, 0.000)
		colorShelf     (0.302, 0.232, 0.197, 0.000)
		colorBeach     (0.320, 0.245, 0.208, 0.000)
		colorDesert    (0.337, 0.259, 0.220, 0.000)
		colorLowland   (0.355, 0.273, 0.231, 0.000)
		colorUpland    (0.373, 0.286, 0.243, 0.000)
		colorRock      (0.391, 0.300, 0.255, 0.000)
		colorSnow      (0.408, 0.313, 0.266, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.854014
		GasToDust   0.25
		Particles   2705
		GasBright   0.460017
		DustBright  0.501886
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   13.6318
		Period          53.6058
		Eccentricity    0.925872
		Inclination     -47.1797
		AscendingNode   176.548
		ArgOfPericenter -29.6105
		MeanAnomaly     -13.7936
	}
}

Comet	"C36"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            2.03581e-016
	Radius          0.0902794
	InertiaMoment   0.398533

	Oblateness      0.177816

	RotationPeriod  13.8958
	Obliquity       68.7283
	EqAscendNode    290.578

	AbsMagn         9.97061
	SlopeParam      5.13416
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.630 0.626 0.620)

	Surface
	{
		SurfStyle       0.666689
		OceanStyle      0.340892
		Randomize      (0.405, 0.261, 0.382)
		colorDistMagn   0.520079
		colorDistFreq   2.44543e-006
		detailScale     2.46523
		colorConversion true
		snowLevel       2
		tropicLatitude  0.690409
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.32817
		terraceProb     0.221758
		erosion         0
		montesMagn      0.360267
		montesFreq      2.74396
		montesSpiky     0.923781
		montesFraction  0.61604
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.0928e-005
		hillsFraction   0.712512
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239098
		craterFreq      0.172928
		craterDensity   0.92568
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.537197
		volcanoTemp     1496.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.246, 0.213, 0.174, 0.000)
		colorShelf     (0.252, 0.219, 0.198, 0.000)
		colorBeach     (0.296, 0.257, 0.236, 0.000)
		colorDesert    (0.321, 0.275, 0.229, 0.000)
		colorLowland   (0.353, 0.294, 0.260, 0.000)
		colorUpland    (0.391, 0.357, 0.316, 0.000)
		colorRock      (0.422, 0.388, 0.341, 0.000)
		colorSnow      (0.460, 0.413, 0.360, 1.000)
		BumpHeight      0.0812515
		BumpOffset      0.0162503
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.0240984
		DustBright  0.622291
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   21.7435
		Period          107.988
		Eccentricity    0.927072
		Inclination     57.596
		AscendingNode   -132.251
		ArgOfPericenter 30.1601
		MeanAnomaly     45.558
	}
}

Comet	"C37"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.57455e-012
	Radius          1.6103
	InertiaMoment   0.396024

	Oblateness      0.208237

	RotationPeriod  10.9475
	Obliquity       21.934
	EqAscendNode    275.155

	AbsMagn         6.47082
	SlopeParam      5.88277
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.529 0.435 0.401)

	Surface
	{
		SurfStyle       0.411257
		OceanStyle      0.371464
		Randomize      (0.518, -0.243, 0.576)
		colorDistMagn   0.364859
		colorDistFreq   0.0010667
		detailScale     43.972
		colorConversion true
		snowLevel       2
		tropicLatitude  0.965576
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.369871
		terraceProb     0.326996
		erosion         0
		montesMagn      0.538903
		montesFreq      3.14808
		montesSpiky     0.992836
		montesFraction  0.306708
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00388721
		hillsFraction   0.550376
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247933
		craterFreq      0.231512
		craterDensity   0.931919
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.488917
		volcanoTemp     1524.14
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.212, 0.174, 0.161, 0.000)
		colorShelf     (0.225, 0.185, 0.171, 0.000)
		colorBeach     (0.238, 0.196, 0.181, 0.000)
		colorDesert    (0.251, 0.207, 0.191, 0.000)
		colorLowland   (0.265, 0.218, 0.201, 0.000)
		colorUpland    (0.278, 0.229, 0.211, 0.000)
		colorRock      (0.291, 0.240, 0.221, 0.000)
		colorSnow      (0.304, 0.250, 0.231, 1.000)
		BumpHeight      1.44927
		BumpOffset      0.289854
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.405648
		GasToDust   0.25
		Particles   1799
		GasBright   0.0318722
		DustBright  0.299004
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   13.4302
		Period          52.4213
		Eccentricity    0.956924
		Inclination     -88.2199
		AscendingNode   140.704
		ArgOfPericenter 34.4123
		MeanAnomaly     -119.185
	}
}

Comet	"C38"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.2178e-008
	Radius          35.2553
	InertiaMoment   0.399038

	Oblateness      0.249

	RotationPeriod  7.72707
	Obliquity       335.14
	EqAscendNode    259.733

	AbsMagn         -0.860954
	SlopeParam      7.08994
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.609 0.604 0.600)

	Surface
	{
		SurfStyle       0.870836
		OceanStyle      0.785573
		Randomize      (0.893, -0.498, -0.633)
		colorDistMagn   0.680764
		colorDistFreq   0.798725
		detailScale     962.704
		colorConversion true
		snowLevel       2
		tropicLatitude  0.606119
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.32045
		terraceProb     0.466869
		erosion         0
		montesMagn      0.577329
		montesFreq      2.33312
		montesSpiky     0.987844
		montesFraction  0.654596
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.66682
		hillsFraction   0.504663
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236641
		craterFreq      0.204536
		craterDensity   0.980133
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.485147
		volcanoTemp     1525.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.207, 0.211, 0.240, 0.050)
		colorShelf     (0.243, 0.248, 0.276, 0.040)
		colorBeach     (0.280, 0.284, 0.312, 0.030)
		colorDesert    (0.317, 0.320, 0.354, 0.020)
		colorLowland   (0.353, 0.356, 0.390, 0.030)
		colorUpland    (0.390, 0.393, 0.426, 0.050)
		colorRock      (0.426, 0.429, 0.474, 0.020)
		colorSnow      (0.426, 0.429, 0.474, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.88684
		GasToDust   0.25
		Particles   2771
		GasBright   0.126685
		DustBright  0.688678
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   9.72381
		Period          32.2951
		Eccentricity    0.904238
		Inclination     -152.73
		AscendingNode   -93.3097
		ArgOfPericenter 28.2703
		MeanAnomaly     91.7325
	}
}

Comet	"C39"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            3.74971e-016
	Radius          0.0997452
	InertiaMoment   0.397514

	Oblateness      0.249

	RotationPeriod  4.14728
	Obliquity       288.345
	EqAscendNode    244.31

	AbsMagn         9.73828
	SlopeParam      2.38407
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.763 0.739 0.697)

	Surface
	{
		SurfStyle       0.594656
		OceanStyle      0.394513
		Randomize      (0.598, 0.063, -0.552)
		colorDistMagn   0.523153
		colorDistFreq   7.70964e-006
		detailScale     2.72371
		colorConversion true
		snowLevel       2
		tropicLatitude  0.677864
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.618634
		terraceProb     0.13177
		erosion         0
		montesMagn      0.520602
		montesFreq      2.82252
		montesSpiky     0.967982
		montesFraction  0.44703
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.3645e-005
		hillsFraction   0.567579
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.268537
		craterFreq      0.230185
		craterDensity   0.924614
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.528298
		volcanoTemp     1555.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.298, 0.251, 0.195, 0.000)
		colorShelf     (0.305, 0.259, 0.223, 0.000)
		colorBeach     (0.359, 0.303, 0.265, 0.000)
		colorDesert    (0.389, 0.325, 0.258, 0.000)
		colorLowland   (0.427, 0.347, 0.293, 0.000)
		colorUpland    (0.473, 0.421, 0.356, 0.000)
		colorRock      (0.511, 0.458, 0.383, 0.000)
		colorSnow      (0.557, 0.488, 0.404, 1.000)
		BumpHeight      0.0897707
		BumpOffset      0.0179541
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.107176
		DustBright  0.392673
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   15.7569
		Period          66.6175
		Eccentricity    0.954334
		Inclination     -65.7862
		AscendingNode   3.24826
		ArgOfPericenter 55.0583
		MeanAnomaly     53.0227
	}
}

Comet	"C40"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            2.90012e-012
	Radius          2.18209
	InertiaMoment   0.399486

	Oblateness      0.00201079

	RotationPeriod  130.331
	Obliquity       241.551
	EqAscendNode    228.887

	AbsMagn         6.2438
	SlopeParam      3.07372
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.658 0.656 0.653)

	Surface
	{
		SurfStyle       0.951826
		OceanStyle      0.15856
		Randomize      (-0.191, 0.403, -0.938)
		colorDistMagn   0.244747
		colorDistFreq   0.00144716
		detailScale     59.5856
		colorConversion true
		snowLevel       2
		tropicLatitude  0.907802
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.390165
		terraceProb     0.389579
		erosion         0
		montesMagn      0.377467
		montesFreq      2.90444
		montesSpiky     0.836217
		montesFraction  0.392751
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0126864
		hillsFraction   0.497729
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241556
		craterFreq      0.265328
		craterDensity   0.920281
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.472311
		volcanoTemp     1403.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.224, 0.229, 0.261, 0.050)
		colorShelf     (0.263, 0.269, 0.300, 0.040)
		colorBeach     (0.303, 0.308, 0.340, 0.030)
		colorDesert    (0.342, 0.347, 0.385, 0.020)
		colorLowland   (0.382, 0.387, 0.424, 0.030)
		colorUpland    (0.421, 0.426, 0.464, 0.050)
		colorRock      (0.460, 0.465, 0.516, 0.020)
		colorSnow      (0.460, 0.465, 0.516, 1.000)
		BumpHeight      1.96388
		BumpOffset      0.392776
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.438474
		GasToDust   0.25
		Particles   1865
		GasBright   0.269179
		DustBright  0.715157
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   16.9885
		Period          74.5784
		Eccentricity    0.937497
		Inclination     15.8406
		AscendingNode   80.6758
		ArgOfPericenter 79.5053
		MeanAnomaly     99.7726
	}
}

Comet	"C41"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            2.24304e-008
	Radius          38.9831
	InertiaMoment   0.398247

	Oblateness      0.00189147

	RotationPeriod  115.111
	Obliquity       194.757
	EqAscendNode    213.465

	AbsMagn         16.6808
	SlopeParam      3.66612
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.706 0.668 0.619)

	Surface
	{
		SurfStyle       0.62725
		OceanStyle      0.596027
		Randomize      (0.744, 0.457, -0.064)
		colorDistMagn   0.593307
		colorDistFreq   0.996213
		detailScale     1064.5
		colorConversion true
		snowLevel       2
		tropicLatitude  0.530376
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.606388
		terraceProb     0.171045
		erosion         0
		montesMagn      0.342652
		montesFreq      3.37983
		montesSpiky     0.907837
		montesFraction  0.550163
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.81269
		hillsFraction   0.701433
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248262
		craterFreq      0.246492
		craterDensity   1.02986
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.600074
		volcanoTemp     1106.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.275, 0.227, 0.173, 0.000)
		colorShelf     (0.282, 0.234, 0.198, 0.000)
		colorBeach     (0.332, 0.274, 0.235, 0.000)
		colorDesert    (0.360, 0.294, 0.229, 0.000)
		colorLowland   (0.395, 0.314, 0.260, 0.000)
		colorUpland    (0.438, 0.381, 0.316, 0.000)
		colorRock      (0.473, 0.414, 0.341, 0.000)
		colorSnow      (0.515, 0.441, 0.359, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.919666
		GasToDust   0.25
		Particles   2837
		GasBright   0.222389
		DustBright  0.446433
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   14.2617
		Period          57.3642
		Eccentricity    0.921699
		Inclination     27.6974
		AscendingNode   85.9086
		ArgOfPericenter 96.9278
		MeanAnomaly     -169.436
	}
}

Comet	"C42"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            6.90648e-016
	Radius          0.135063
	InertiaMoment   0.399911

	Oblateness      0.00298641

	RotationPeriod  106.801
	Obliquity       147.963
	EqAscendNode    198.042

	AbsMagn         9.51167
	SlopeParam      4.23004
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.679 0.633 0.605)

	Surface
	{
		SurfStyle       0.569806
		OceanStyle      0.82049
		Randomize      (0.480, 0.214, 0.999)
		colorDistMagn   0.837802
		colorDistFreq   1.59196e-005
		detailScale     3.68812
		colorConversion true
		snowLevel       2
		tropicLatitude  0.993787
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.329089
		terraceProb     0.111825
		erosion         0
		montesMagn      0.609662
		montesFreq      2.98482
		montesSpiky     0.83078
		montesFraction  0.463393
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.59694e-005
		hillsFraction   0.611465
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247184
		craterFreq      0.181381
		craterDensity   1.06405
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.535897
		volcanoTemp     1806.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.265, 0.215, 0.169, 0.000)
		colorShelf     (0.272, 0.222, 0.194, 0.000)
		colorBeach     (0.319, 0.260, 0.230, 0.000)
		colorDesert    (0.346, 0.279, 0.224, 0.000)
		colorLowland   (0.380, 0.298, 0.254, 0.000)
		colorUpland    (0.421, 0.361, 0.309, 0.000)
		colorRock      (0.455, 0.392, 0.333, 0.000)
		colorSnow      (0.496, 0.418, 0.351, 1.000)
		BumpHeight      0.121557
		BumpOffset      0.0243113
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.138339
		DustBright  0.21497
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   13.9317
		Period          55.3843
		Eccentricity    0.974739
		Inclination     66.9309
		AscendingNode   116.908
		ArgOfPericenter 119.013
		MeanAnomaly     26.4123
	}
}

Comet	"C43"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            5.34167e-012
	Radius          2.41468
	InertiaMoment   0.398798

	Oblateness      0.00246686

	RotationPeriod  100.797
	Obliquity       101.168
	EqAscendNode    182.62

	AbsMagn         6.01098
	SlopeParam      4.81327
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.413 0.409 0.405)

	Surface
	{
		SurfStyle       0.935445
		OceanStyle      0.103263
		Randomize      (0.843, -0.681, 0.613)
		colorDistMagn   0.499369
		colorDistFreq   0.00305074
		detailScale     65.9368
		colorConversion true
		snowLevel       2
		tropicLatitude  0.989972
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.508335
		terraceProb     0.140222
		erosion         0
		montesMagn      0.665104
		montesFreq      2.75856
		montesSpiky     0.963772
		montesFraction  0.438214
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0115766
		hillsFraction   0.464613
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232788
		craterFreq      0.212747
		craterDensity   0.985811
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.470146
		volcanoTemp     1794.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.140, 0.143, 0.162, 0.050)
		colorShelf     (0.165, 0.168, 0.186, 0.040)
		colorBeach     (0.190, 0.192, 0.210, 0.030)
		colorDesert    (0.215, 0.217, 0.239, 0.020)
		colorLowland   (0.239, 0.241, 0.263, 0.030)
		colorUpland    (0.264, 0.266, 0.287, 0.050)
		colorRock      (0.289, 0.290, 0.320, 0.020)
		colorSnow      (0.289, 0.290, 0.320, 1.000)
		BumpHeight      2.17321
		BumpOffset      0.434642
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.4713
		GasToDust   0.25
		Particles   1931
		GasBright   0.377509
		DustBright  0.460286
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   15.8083
		Period          66.944
		Eccentricity    0.926252
		Inclination     127.231
		AscendingNode   70.6782
		ArgOfPericenter 176.831
		MeanAnomaly     -66.3535
	}
}

Comet	"C44"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            4.1314e-008
	Radius          52.7487
	InertiaMoment   0.396983

	Oblateness      0.00364201

	RotationPeriod  95.982
	Obliquity       54.374
	EqAscendNode    167.197

	AbsMagn         15.2064
	SlopeParam      5.47729
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.813 0.755 0.728)

	Surface
	{
		SurfStyle       0.316942
		OceanStyle      0.843834
		Randomize      (-0.176, 0.992, -0.003)
		colorDistMagn   0.695493
		colorDistFreq   1.57868
		detailScale     1440.39
		colorConversion true
		snowLevel       2
		tropicLatitude  0.698176
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.659706
		terraceProb     0.156015
		erosion         0
		montesMagn      0.467694
		montesFreq      2.89296
		montesSpiky     0.952789
		montesFraction  0.410208
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.62928
		hillsFraction   0.578363
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23065
		craterFreq      0.194893
		craterDensity   0.998412
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.467247
		volcanoTemp     1439.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.325, 0.302, 0.291, 0.000)
		colorShelf     (0.345, 0.321, 0.310, 0.000)
		colorBeach     (0.366, 0.340, 0.328, 0.000)
		colorDesert    (0.386, 0.359, 0.346, 0.000)
		colorLowland   (0.406, 0.378, 0.364, 0.000)
		colorUpland    (0.427, 0.397, 0.382, 0.000)
		colorRock      (0.447, 0.415, 0.401, 0.000)
		colorSnow      (0.467, 0.434, 0.419, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.952492
		GasToDust   0.25
		Particles   2904
		GasBright   0.0050367
		DustBright  0.517245
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   25.1461
		Period          134.304
		Eccentricity    0.966892
		Inclination     -134.937
		AscendingNode   -121.951
		ArgOfPericenter -148.308
		MeanAnomaly     108.866
	}
}

Comet	"C45"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.27209e-015
	Radius          0.149569
	InertiaMoment   0.399269

	Oblateness      0.00296681

	RotationPeriod  91.8992
	Obliquity       7.57965
	EqAscendNode    151.774

	AbsMagn         9.28982
	SlopeParam      6.37025
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.619 0.614 0.610)

	Surface
	{
		SurfStyle       0.326802
		OceanStyle      0.315249
		Randomize      (0.026, -0.035, 0.474)
		colorDistMagn   0.180386
		colorDistFreq   1.66466e-005
		detailScale     4.08423
		colorConversion true
		snowLevel       2
		tropicLatitude  0.951066
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.514187
		terraceProb     0.206464
		erosion         0
		montesMagn      0.417802
		montesFreq      2.8626
		montesSpiky     0.817336
		montesFraction  0.400137
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.076e-005
		hillsFraction   0.792178
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253182
		craterFreq      0.22678
		craterDensity   0.99009
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.526963
		volcanoTemp     1595.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.247, 0.246, 0.244, 0.000)
		colorShelf     (0.263, 0.261, 0.259, 0.000)
		colorBeach     (0.278, 0.276, 0.274, 0.000)
		colorDesert    (0.294, 0.292, 0.290, 0.000)
		colorLowland   (0.309, 0.307, 0.305, 0.000)
		colorUpland    (0.325, 0.322, 0.320, 0.000)
		colorRock      (0.340, 0.338, 0.335, 0.000)
		colorSnow      (0.356, 0.353, 0.351, 1.000)
		BumpHeight      0.134612
		BumpOffset      0.0269224
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.022934
		GasToDust   0.25
		Particles   1026
		GasBright   0.0142027
		DustBright  0.192566
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   20.0763
		Period          95.8091
		Eccentricity    0.939631
		Inclination     -67.1833
		AscendingNode   128.332
		ArgOfPericenter 174.489
		MeanAnomaly     -125.911
	}
}

Comet	"C46"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            9.83869e-012
	Radius          3.26513
	InertiaMoment   0.39792

	Oblateness      0.00429942

	RotationPeriod  88.3143
	Obliquity       320.785
	EqAscendNode    136.352

	AbsMagn         5.77121
	SlopeParam      9.03521
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.667 0.543 0.460)

	Surface
	{
		SurfStyle       0.831802
		OceanStyle      0.362165
		Randomize      (-0.802, 0.546, 0.813)
		colorDistMagn   0.992286
		colorDistFreq   0.00324676
		detailScale     89.1597
		colorConversion true
		snowLevel       2
		tropicLatitude  0.739473
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.595013
		terraceProb     0.46752
		erosion         0
		montesMagn      0.572935
		montesFreq      2.88275
		montesSpiky     0.929957
		montesFraction  0.743797
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0228939
		hillsFraction   0.713838
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235216
		craterFreq      0.156344
		craterDensity   1.04804
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.41572
		volcanoTemp     1604.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.260, 0.185, 0.129, 0.000)
		colorShelf     (0.267, 0.190, 0.147, 0.000)
		colorBeach     (0.314, 0.223, 0.175, 0.000)
		colorDesert    (0.340, 0.239, 0.170, 0.000)
		colorLowland   (0.374, 0.255, 0.193, 0.000)
		colorUpland    (0.414, 0.310, 0.235, 0.000)
		colorRock      (0.447, 0.337, 0.253, 0.000)
		colorSnow      (0.487, 0.358, 0.267, 1.000)
		BumpHeight      2.93861
		BumpOffset      0.587723
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.504126
		GasToDust   0.25
		Particles   1998
		GasBright   0.0882969
		DustBright  0.602958
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   16.5893
		Period          71.9654
		Eccentricity    0.96436
		Inclination     24.4894
		AscendingNode   96.9904
		ArgOfPericenter 24.1384
		MeanAnomaly     120.221
	}
}

Comet	"C47"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            7.60951e-008
	Radius          58.4552
	InertiaMoment   0.399703

	Oblateness      0.00345913

	RotationPeriod  85.0901
	Obliquity       273.991
	EqAscendNode    120.929

	AbsMagn         14.3354
	SlopeParam      2.74291
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.745 0.741 0.740)

	Surface
	{
		SurfStyle       0.140877
		OceanStyle      0.292443
		Randomize      (0.110, -0.574, 0.730)
		colorDistMagn   0.102777
		colorDistFreq   2.42815
		detailScale     1596.22
		colorConversion true
		snowLevel       2
		tropicLatitude  0.83362
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.554814
		terraceProb     0.373943
		erosion         0
		montesMagn      0.505804
		montesFreq      3.12936
		montesSpiky     0.940892
		montesFraction  0.529504
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.3931
		hillsFraction   0.671799
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.274565
		craterFreq      0.178286
		craterDensity   0.957595
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.578616
		volcanoTemp     1174.33
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.298, 0.297, 0.296, 0.000)
		colorShelf     (0.317, 0.315, 0.315, 0.000)
		colorBeach     (0.335, 0.334, 0.333, 0.000)
		colorDesert    (0.354, 0.352, 0.352, 0.000)
		colorLowland   (0.372, 0.371, 0.370, 0.000)
		colorUpland    (0.391, 0.389, 0.389, 0.000)
		colorRock      (0.410, 0.408, 0.407, 0.000)
		colorSnow      (0.428, 0.426, 0.426, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.985318
		GasToDust   0.25
		Particles   2970
		GasBright   0.0701808
		DustBright  0.305561
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   17.3188
		Period          76.7644
		Eccentricity    0.953053
		Inclination     29.5381
		AscendingNode   -0.558189
		ArgOfPericenter 125.742
		MeanAnomaly     -33.0324
	}
}

Comet	"C48"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            2.34303e-015
	Radius          0.202116
	InertiaMoment   0.39854

	Oblateness      0.00496184

	RotationPeriod  82.1389
	Obliquity       227.197
	EqAscendNode    105.507

	AbsMagn         9.07187
	SlopeParam      3.37274
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.793 0.743 0.713)

	Surface
	{
		SurfStyle       0.783318
		OceanStyle      0.778695
		Randomize      (-0.686, 0.058, -0.655)
		colorDistMagn   0.717111
		colorDistFreq   3.08448e-005
		detailScale     5.51911
		colorConversion true
		snowLevel       2
		tropicLatitude  0.482443
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.610294
		terraceProb     0.313296
		erosion         0
		montesMagn      0.339648
		montesFreq      3.35476
		montesSpiky     0.798535
		montesFraction  0.571118
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.00645e-005
		hillsFraction   0.468845
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246981
		craterFreq      0.26485
		craterDensity   0.966569
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.515014
		volcanoTemp     1149.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.309, 0.253, 0.200, 0.000)
		colorShelf     (0.317, 0.260, 0.228, 0.000)
		colorBeach     (0.373, 0.305, 0.271, 0.000)
		colorDesert    (0.404, 0.327, 0.264, 0.000)
		colorLowland   (0.444, 0.349, 0.300, 0.000)
		colorUpland    (0.492, 0.424, 0.364, 0.000)
		colorRock      (0.531, 0.461, 0.392, 0.000)
		colorSnow      (0.579, 0.491, 0.414, 1.000)
		BumpHeight      0.181904
		BumpOffset      0.0363808
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.05576
		GasToDust   0.25
		Particles   1092
		GasBright   0.211465
		DustBright  0.648763
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   19.5659
		Period          92.1788
		Eccentricity    0.962203
		Inclination     -19.4817
		AscendingNode   -15.8849
		ArgOfPericenter 119.107
		MeanAnomaly     -2.67586
	}
}

Comet	"C49"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.81216e-011
	Radius          3.62079
	InertiaMoment   0.396062

	Oblateness      0.00391062

	RotationPeriod  79.401
	Obliquity       180.402
	EqAscendNode    90.0841

	AbsMagn         5.52315
	SlopeParam      3.94473
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.497 0.490 0.487)

	Surface
	{
		SurfStyle       0.755915
		OceanStyle      0.733389
		Randomize      (-0.572, -0.519, 0.003)
		colorDistMagn   0.593049
		colorDistFreq   0.00550783
		detailScale     98.8718
		colorConversion true
		snowLevel       2
		tropicLatitude  0.491966
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.540153
		terraceProb     0.500012
		erosion         0
		montesMagn      0.43638
		montesFreq      2.99532
		montesSpiky     0.867775
		montesFraction  0.842735
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0215684
		hillsFraction   0.754683
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.207031
		craterFreq      0.209988
		craterDensity   0.76754
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.502776
		volcanoTemp     1563.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.194, 0.167, 0.136, 0.000)
		colorShelf     (0.199, 0.172, 0.156, 0.000)
		colorBeach     (0.234, 0.201, 0.185, 0.000)
		colorDesert    (0.253, 0.216, 0.180, 0.000)
		colorLowland   (0.278, 0.230, 0.204, 0.000)
		colorUpland    (0.308, 0.279, 0.248, 0.000)
		colorRock      (0.333, 0.304, 0.268, 0.000)
		colorSnow      (0.363, 0.324, 0.282, 1.000)
		BumpHeight      3.25872
		BumpOffset      0.651743
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.536952
		GasToDust   0.25
		Particles   2064
		GasBright   0.166067
		DustBright  0.378648
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   19.3433
		Period          90.6102
		Eccentricity    0.96857
		Inclination     -29.8633
		AscendingNode   -12.1065
		ArgOfPericenter 178.245
		MeanAnomaly     34.7514
	}
}

Comet	"C50"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.40157e-007
	Radius          78.9424
	InertiaMoment   0.399043

	Oblateness      0.00565914

	RotationPeriod  76.8336
	Obliquity       133.608
	EqAscendNode    74.6615

	AbsMagn         13.6905
	SlopeParam      4.51215
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.437 0.432 0.431)

	Surface
	{
		SurfStyle       0.225437
		OceanStyle      0.035861
		Randomize      (-0.339, -0.341, -0.673)
		colorDistMagn   0.422428
		colorDistFreq   3.53791
		detailScale     2155.65
		colorConversion true
		snowLevel       2
		tropicLatitude  0.166907
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.589752
		terraceProb     0.458853
		erosion         0
		montesMagn      0.223925
		montesFreq      3.52804
		montesSpiky     0.984793
		montesFraction  0.464941
		dunesFraction   0
		hillsMagn       0
		hillsFreq       16.2394
		hillsFraction   0.750745
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245208
		craterFreq      0.215408
		craterDensity   1.0126
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.498267
		volcanoTemp     1671.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.175, 0.173, 0.172, 0.000)
		colorShelf     (0.186, 0.184, 0.183, 0.000)
		colorBeach     (0.196, 0.194, 0.194, 0.000)
		colorDesert    (0.207, 0.205, 0.204, 0.000)
		colorLowland   (0.218, 0.216, 0.215, 0.000)
		colorUpland    (0.229, 0.227, 0.226, 0.000)
		colorRock      (0.240, 0.238, 0.237, 0.000)
		colorSnow      (0.251, 0.248, 0.248, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   1
		GasToDust   0.25
		Particles   3000
		GasBright   0.0834098
		DustBright  0.145791
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   17.5944
		Period          78.6041
		Eccentricity    0.959082
		Inclination     -136.656
		AscendingNode   -12.9358
		ArgOfPericenter 32.4594
		MeanAnomaly     41.1781
	}
}

Comet	"C51"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            4.31556e-015
	Radius          0.224277
	InertiaMoment   0.397525

	Oblateness      0.00446863

	RotationPeriod  74.4052
	Obliquity       86.8139
	EqAscendNode    59.239

	AbsMagn         8.85705
	SlopeParam      5.12511
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.668 0.586 0.475)

	Surface
	{
		SurfStyle       0.110207
		OceanStyle      0.0404416
		Randomize      (-0.933, 0.739, -0.018)
		colorDistMagn   0.202201
		colorDistFreq   2.4995e-005
		detailScale     6.12425
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999426
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.614363
		terraceProb     0.179306
		erosion         0
		montesMagn      0.587795
		montesFreq      3.23463
		montesSpiky     0.911235
		montesFraction  0.416055
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000104049
		hillsFraction   0.591988
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231027
		craterFreq      0.219245
		craterDensity   0.816629
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.491628
		volcanoTemp     1350.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.267, 0.234, 0.190, 0.000)
		colorShelf     (0.284, 0.249, 0.202, 0.000)
		colorBeach     (0.301, 0.264, 0.214, 0.000)
		colorDesert    (0.317, 0.278, 0.226, 0.000)
		colorLowland   (0.334, 0.293, 0.237, 0.000)
		colorUpland    (0.351, 0.308, 0.249, 0.000)
		colorRock      (0.367, 0.322, 0.261, 0.000)
		colorSnow      (0.384, 0.337, 0.273, 1.000)
		BumpHeight      0.201849
		BumpOffset      0.0403698
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.0885858
		GasToDust   0.25
		Particles   1158
		GasBright   0.301862
		DustBright  0.411826
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   21.1749
		Period          103.78
		Eccentricity    0.953863
		Inclination     160.091
		AscendingNode   -93.0993
		ArgOfPericenter -150.323
		MeanAnomaly     -156.054
	}
}

Comet	"C52"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            3.33777e-011
	Radius          4.88688
	InertiaMoment   0.399492

	Oblateness      0.00641416

	RotationPeriod  72.0914
	Obliquity       40.0196
	EqAscendNode    43.8164

	AbsMagn         5.26517
	SlopeParam      5.87079
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.731 0.727 0.724)

	Surface
	{
		SurfStyle       0.890928
		OceanStyle      0.523719
		Randomize      (0.299, -0.646, -0.013)
		colorDistMagn   0.953382
		colorDistFreq   0.015908
		detailScale     133.444
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998553
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.554352
		terraceProb     0.282001
		erosion         0
		montesMagn      0.400926
		montesFreq      2.94006
		montesSpiky     0.89623
		montesFraction  0.487236
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0557096
		hillsFraction   0.662574
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237098
		craterFreq      0.170841
		craterDensity   0.967168
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.446827
		volcanoTemp     1480.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.249, 0.254, 0.290, 0.050)
		colorShelf     (0.292, 0.298, 0.333, 0.040)
		colorBeach     (0.336, 0.342, 0.377, 0.030)
		colorDesert    (0.380, 0.385, 0.427, 0.020)
		colorLowland   (0.424, 0.429, 0.471, 0.030)
		colorUpland    (0.468, 0.472, 0.514, 0.050)
		colorRock      (0.512, 0.516, 0.572, 0.020)
		colorSnow      (0.512, 0.516, 0.572, 1.000)
		BumpHeight      4.39819
		BumpOffset      0.879639
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.569778
		GasToDust   0.25
		Particles   2130
		GasBright   0.191922
		DustBright  0.206252
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   15.4844
		Period          64.8967
		Eccentricity    0.936828
		Inclination     54.3744
		AscendingNode   -16.9969
		ArgOfPericenter -27.3828
		MeanAnomaly     -30.1728
	}
}

Comet	"C53"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            2.58152e-007
	Radius          87.6522
	InertiaMoment   0.398255

	Oblateness      0.00507045

	RotationPeriod  69.8732
	Obliquity       353.225
	EqAscendNode    28.3938

	AbsMagn         13.1668
	SlopeParam      7.06474
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.548 0.474 0.430)

	Surface
	{
		SurfStyle       0.30415
		OceanStyle      0.770572
		Randomize      (-0.501, 0.648, -0.934)
		colorDistMagn   0.875512
		colorDistFreq   5.25615
		detailScale     2393.49
		colorConversion true
		snowLevel       2
		tropicLatitude  0.323811
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.57005
		terraceProb     0.318784
		erosion         0
		montesMagn      0.41518
		montesFreq      2.5349
		montesSpiky     0.867863
		montesFraction  0.703724
		dunesFraction   0
		hillsMagn       0
		hillsFreq       16.6753
		hillsFraction   0.900521
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241561
		craterFreq      0.305714
		craterDensity   0.728766
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.570763
		volcanoTemp     1727.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.219, 0.190, 0.172, 0.000)
		colorShelf     (0.233, 0.202, 0.183, 0.000)
		colorBeach     (0.247, 0.213, 0.193, 0.000)
		colorDesert    (0.260, 0.225, 0.204, 0.000)
		colorLowland   (0.274, 0.237, 0.215, 0.000)
		colorUpland    (0.288, 0.249, 0.225, 0.000)
		colorRock      (0.301, 0.261, 0.236, 0.000)
		colorSnow      (0.315, 0.273, 0.247, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   1
		GasToDust   0.25
		Particles   3000
		GasBright   0.0362341
		DustBright  0.846427
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   18.6258
		Period          85.6158
		Eccentricity    0.954108
		Inclination     -14.805
		AscendingNode   -62.4785
		ArgOfPericenter -171.557
		MeanAnomaly     -165.766
	}
}

Comet	"C54"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            7.94873e-015
	Radius          0.302527
	InertiaMoment   0.399916

	Oblateness      0.0072498

	RotationPeriod  67.735
	Obliquity       306.431
	EqAscendNode    12.9712

	AbsMagn         8.64469
	SlopeParam      2.37335
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.604 0.551 0.461)

	Surface
	{
		SurfStyle       0.193033
		OceanStyle      0.307449
		Randomize      (-0.411, -0.568, -0.967)
		colorDistMagn   0.240502
		colorDistFreq   2.04193e-005
		detailScale     8.26099
		colorConversion true
		snowLevel       2
		tropicLatitude  0.957738
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.679763
		terraceProb     0.170739
		erosion         0
		montesMagn      0.540757
		montesFreq      3.56841
		montesSpiky     0.993841
		montesFraction  0.766829
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000142286
		hillsFraction   0.444898
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241522
		craterFreq      0.253308
		craterDensity   0.920532
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.549468
		volcanoTemp     1325.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.242, 0.221, 0.184, 0.000)
		colorShelf     (0.257, 0.234, 0.196, 0.000)
		colorBeach     (0.272, 0.248, 0.207, 0.000)
		colorDesert    (0.287, 0.262, 0.219, 0.000)
		colorLowland   (0.302, 0.276, 0.231, 0.000)
		colorUpland    (0.317, 0.289, 0.242, 0.000)
		colorRock      (0.332, 0.303, 0.254, 0.000)
		colorSnow      (0.348, 0.317, 0.265, 1.000)
		BumpHeight      0.272274
		BumpOffset      0.0544548
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.121412
		GasToDust   0.25
		Particles   1225
		GasBright   0.0567693
		DustBright  0.510378
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   16.4393
		Period          70.9919
		Eccentricity    0.958007
		Inclination     -134.942
		AscendingNode   103.387
		ArgOfPericenter 22.5171
		MeanAnomaly     63.7505
	}
}

Comet	"C55"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            6.14777e-011
	Radius          5.42927
	InertiaMoment   0.398804

	Oblateness      0.00574113

	RotationPeriod  65.6643
	Obliquity       259.637
	EqAscendNode    357.549

	AbsMagn         4.99527
	SlopeParam      3.06512
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.528 0.519 0.514)

	Surface
	{
		SurfStyle       0.732839
		OceanStyle      0.25654
		Randomize      (0.623, -0.714, 0.719)
		colorDistMagn   0.32714
		colorDistFreq   0.0137144
		detailScale     148.255
		colorConversion true
		snowLevel       2
		tropicLatitude  0.497958
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.327459
		terraceProb     0.140356
		erosion         0
		montesMagn      0.636218
		montesFreq      3.14435
		montesSpiky     0.87085
		montesFraction  0.873311
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0762675
		hillsFraction   0.752722
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214518
		craterFreq      0.271161
		craterDensity   0.846727
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.498317
		volcanoTemp     1413.09
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.206, 0.177, 0.144, 0.000)
		colorShelf     (0.211, 0.182, 0.164, 0.000)
		colorBeach     (0.248, 0.213, 0.195, 0.000)
		colorDesert    (0.269, 0.228, 0.190, 0.000)
		colorLowland   (0.295, 0.244, 0.216, 0.000)
		colorUpland    (0.327, 0.296, 0.262, 0.000)
		colorRock      (0.354, 0.322, 0.283, 0.000)
		colorSnow      (0.385, 0.343, 0.298, 1.000)
		BumpHeight      4.88634
		BumpOffset      0.977269
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.602604
		GasToDust   0.25
		Particles   2197
		GasBright   0.0400454
		DustBright  0.211589
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   23.8734
		Period          124.238
		Eccentricity    0.943834
		Inclination     101.635
		AscendingNode   159.674
		ArgOfPericenter -163.124
		MeanAnomaly     -19.8874
	}
}

Comet	"C56"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            4.75485e-007
	Radius          118.169
	InertiaMoment   0.396999

	Oblateness      0.0080906

	RotationPeriod  63.6506
	Obliquity       212.842
	EqAscendNode    342.126

	AbsMagn         12.7192
	SlopeParam      3.65829
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.474 0.471 0.468)

	Surface
	{
		SurfStyle       0.84914
		OceanStyle      0.745866
		Randomize      (0.428, 0.567, 0.655)
		colorDistMagn   0.452708
		colorDistFreq   4.76423
		detailScale     3226.81
		colorConversion true
		snowLevel       2
		tropicLatitude  0.427044
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.395663
		terraceProb     0.498278
		erosion         0
		montesMagn      0.338958
		montesFreq      3.21836
		montesSpiky     0.988124
		montesFraction  0.184829
		dunesFraction   0
		hillsMagn       0
		hillsFreq       22.7056
		hillsFraction   0.606119
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247914
		craterFreq      0.394922
		craterDensity   0.95966
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.527174
		volcanoTemp     1956.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.185, 0.160, 0.131, 0.000)
		colorShelf     (0.190, 0.165, 0.150, 0.000)
		colorBeach     (0.223, 0.193, 0.178, 0.000)
		colorDesert    (0.242, 0.207, 0.173, 0.000)
		colorLowland   (0.265, 0.221, 0.197, 0.000)
		colorUpland    (0.294, 0.268, 0.239, 0.000)
		colorRock      (0.318, 0.292, 0.258, 0.000)
		colorSnow      (0.346, 0.311, 0.272, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   1
		GasToDust   0.25
		Particles   3000
		GasBright   0.160612
		DustBright  0.575509
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   19.3976
		Period          90.992
		Eccentricity    0.941383
		Inclination     18.2141
		AscendingNode   -128.775
		ArgOfPericenter 84.0629
		MeanAnomaly     83.7516
	}
}

Comet	"C57"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.46405e-014
	Radius          0.336293
	InertiaMoment   0.399275

	Oblateness      0.00650369

	RotationPeriod  61.6846
	Obliquity       166.048
	EqAscendNode    326.703

	AbsMagn         8.43412
	SlopeParam      4.22227
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.584 0.581 0.579)

	Surface
	{
		SurfStyle       0.121875
		OceanStyle      0.680778
		Randomize      (-0.907, 0.647, 0.887)
		colorDistMagn   0.794964
		colorDistFreq   6.28832e-005
		detailScale     9.18305
		colorConversion true
		snowLevel       2
		tropicLatitude  0.990363
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.467206
		terraceProb     0.260467
		erosion         0
		montesMagn      0.450015
		montesFreq      2.6626
		montesSpiky     0.902025
		montesFraction  0.575326
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000329181
		hillsFraction   0.592943
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.207607
		craterFreq      0.227317
		craterDensity   0.967965
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.57351
		volcanoTemp     1498.82
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.234, 0.232, 0.231, 0.000)
		colorShelf     (0.248, 0.247, 0.246, 0.000)
		colorBeach     (0.263, 0.261, 0.260, 0.000)
		colorDesert    (0.278, 0.276, 0.275, 0.000)
		colorLowland   (0.292, 0.291, 0.289, 0.000)
		colorUpland    (0.307, 0.305, 0.304, 0.000)
		colorRock      (0.321, 0.320, 0.318, 0.000)
		colorSnow      (0.336, 0.334, 0.333, 1.000)
		BumpHeight      0.302664
		BumpOffset      0.0605328
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.154238
		GasToDust   0.25
		Particles   1291
		GasBright   0.116606
		DustBright  0.304001
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   20.2321
		Period          96.9264
		Eccentricity    0.940046
		Inclination     -111.432
		AscendingNode   -164.348
		ArgOfPericenter 116.937
		MeanAnomaly     25.0391
	}
}

Comet	"C58"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.13234e-010
	Radius          7.31567
	InertiaMoment   0.397929

	Oblateness      0.00917716

	RotationPeriod  59.7587
	Obliquity       119.254
	EqAscendNode    311.281

	AbsMagn         4.71094
	SlopeParam      4.8049
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.609 0.604 0.598)

	Surface
	{
		SurfStyle       0.443989
		OceanStyle      0.315993
		Randomize      (-0.001, 0.678, -0.863)
		colorDistMagn   0.701008
		colorDistFreq   0.0410228
		detailScale     199.767
		colorConversion true
		snowLevel       2
		tropicLatitude  0.850962
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.392809
		terraceProb     0.395463
		erosion         0
		montesMagn      0.514116
		montesFreq      2.32282
		montesSpiky     0.947241
		montesFraction  0.393243
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.121868
		hillsFraction   0.665257
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223512
		craterFreq      0.259335
		craterDensity   0.984649
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53948
		volcanoTemp     1596.92
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.243, 0.242, 0.239, 0.000)
		colorShelf     (0.259, 0.257, 0.254, 0.000)
		colorBeach     (0.274, 0.272, 0.269, 0.000)
		colorDesert    (0.289, 0.287, 0.284, 0.000)
		colorLowland   (0.304, 0.302, 0.299, 0.000)
		colorUpland    (0.319, 0.317, 0.314, 0.000)
		colorRock      (0.335, 0.332, 0.329, 0.000)
		colorSnow      (0.350, 0.347, 0.344, 1.000)
		BumpHeight      6.58411
		BumpOffset      1.31682
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.63543
		GasToDust   0.25
		Particles   2263
		GasBright   0.304362
		DustBright  0.600731
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   16.0653
		Period          68.5826
		Eccentricity    0.913738
		Inclination     -68.1412
		AscendingNode   -29.1514
		ArgOfPericenter -154.921
		MeanAnomaly     -78.6507
	}
}

Comet	"C59"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            3.48656e-018
	Radius          0.0208302
	InertiaMoment   0.399708

	Oblateness      0.00738689

	RotationPeriod  57.8659
	Obliquity       72.4595
	EqAscendNode    295.858

	AbsMagn         12.324
	SlopeParam      5.46717
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.789 0.786 0.783)

	Surface
	{
		SurfStyle       0.36348
		OceanStyle      0.201721
		Randomize      (-0.955, -0.871, -0.583)
		colorDistMagn   0.457009
		colorDistFreq   1.26944e-007
		detailScale     0.568804
		colorConversion true
		snowLevel       2
		tropicLatitude  0.770799
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.5992
		terraceProb     0.535657
		erosion         0
		montesMagn      0.5675
		montesFreq      3.40447
		montesSpiky     0.939717
		montesFraction  0.467107
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.95143e-007
		hillsFraction   0.880775
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251138
		craterFreq      0.173046
		craterDensity   0.843594
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.505023
		volcanoTemp     1364.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.315, 0.314, 0.313, 0.000)
		colorShelf     (0.335, 0.334, 0.333, 0.000)
		colorBeach     (0.355, 0.354, 0.352, 0.000)
		colorDesert    (0.375, 0.373, 0.372, 0.000)
		colorLowland   (0.394, 0.393, 0.391, 0.000)
		colorUpland    (0.414, 0.413, 0.411, 0.000)
		colorRock      (0.434, 0.432, 0.430, 0.000)
		colorSnow      (0.453, 0.452, 0.450, 1.000)
		BumpHeight      0.0187472
		BumpOffset      0.00374944
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.233074
		DustBright  0.356506
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   18.4483
		Period          84.3949
		Eccentricity    0.967474
		Inclination     143.203
		AscendingNode   46.1388
		ArgOfPericenter 58.4261
		MeanAnomaly     8.06748
	}
}

Comet	"C60"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            2.6966e-014
	Radius          0.452912
	InertiaMoment   0.398547

	Oblateness      0.0104371

	RotationPeriod  56
	Obliquity       25.6652
	EqAscendNode    280.436

	AbsMagn         8.22476
	SlopeParam      6.35474
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.656 0.569 0.477)

	Surface
	{
		SurfStyle       0.72354
		OceanStyle      0.116008
		Randomize      (-0.909, 0.084, -0.709)
		colorDistMagn   0.878423
		colorDistFreq   0.00013002
		detailScale     12.3675
		colorConversion true
		snowLevel       2
		tropicLatitude  0.647896
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.624243
		terraceProb     0.245754
		erosion         0
		montesMagn      0.556464
		montesFreq      3.26852
		montesSpiky     0.936482
		montesFraction  0.344823
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000492116
		hillsFraction   0.789529
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24228
		craterFreq      0.143732
		craterDensity   0.903571
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.485425
		volcanoTemp     1557.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.256, 0.194, 0.134, 0.000)
		colorShelf     (0.262, 0.199, 0.153, 0.000)
		colorBeach     (0.308, 0.233, 0.181, 0.000)
		colorDesert    (0.335, 0.250, 0.177, 0.000)
		colorLowland   (0.367, 0.268, 0.200, 0.000)
		colorUpland    (0.407, 0.324, 0.243, 0.000)
		colorRock      (0.440, 0.353, 0.262, 0.000)
		colorSnow      (0.479, 0.376, 0.277, 1.000)
		BumpHeight      0.40762
		BumpOffset      0.0815241
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.187064
		GasToDust   0.25
		Particles   1357
		GasBright   0.124527
		DustBright  0.14954
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   14.7156
		Period          60.1239
		Eccentricity    0.955411
		Inclination     -114.466
		AscendingNode   170.175
		ArgOfPericenter -151.238
		MeanAnomaly     -178.331
	}
}

Comet	"C61"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            2.08563e-010
	Radius          8.14084
	InertiaMoment   0.396097

	Oblateness      0.00830289

	RotationPeriod  54.1553
	Obliquity       338.871
	EqAscendNode    265.013

	AbsMagn         4.40893
	SlopeParam      8.8699
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.686 0.683 0.680)

	Surface
	{
		SurfStyle       0.738491
		OceanStyle      0.18251
		Randomize      (0.555, -0.907, -0.297)
		colorDistMagn   0.916747
		colorDistFreq   0.00886088
		detailScale     222.299
		colorConversion true
		snowLevel       2
		tropicLatitude  0.437
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.410797
		terraceProb     0.713076
		erosion         0
		montesMagn      0.641686
		montesFreq      3.63619
		montesSpiky     0.955106
		montesFraction  0.711522
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.171958
		hillsFraction   0.757411
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258336
		craterFreq      0.212435
		craterDensity   0.596308
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.458619
		volcanoTemp     1446.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.268, 0.232, 0.191, 0.000)
		colorShelf     (0.274, 0.239, 0.218, 0.000)
		colorBeach     (0.323, 0.280, 0.259, 0.000)
		colorDesert    (0.350, 0.301, 0.252, 0.000)
		colorLowland   (0.384, 0.321, 0.286, 0.000)
		colorUpland    (0.425, 0.390, 0.347, 0.000)
		colorRock      (0.460, 0.424, 0.374, 0.000)
		colorSnow      (0.501, 0.451, 0.395, 1.000)
		BumpHeight      7.32676
		BumpOffset      1.46535
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.668256
		GasToDust   0.25
		Particles   2329
		GasBright   0.0101745
		DustBright  0.748379
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   19.2685
		Period          90.0854
		Eccentricity    0.943269
		Inclination     -141.627
		AscendingNode   -41.273
		ArgOfPericenter 89.6783
		MeanAnomaly     2.99095
	}
}

Comet	"C62"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            6.42181e-018
	Radius          0.0280402
	InertiaMoment   0.399049

	Oblateness      0.011934

	RotationPeriod  52.3267
	Obliquity       292.077
	EqAscendNode    249.59

	AbsMagn         11.9671
	SlopeParam      2.7335
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.650 0.648 0.646)

	Surface
	{
		SurfStyle       0.267099
		OceanStyle      0.152616
		Randomize      (0.765, 0.059, 0.360)
		colorDistMagn   0.803662
		colorDistFreq   3.23988e-007
		detailScale     0.765684
		colorConversion true
		snowLevel       2
		tropicLatitude  0.805894
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.456565
		terraceProb     0.437376
		erosion         0
		montesMagn      0.52979
		montesFreq      3.75375
		montesSpiky     0.706893
		montesFraction  0.616474
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.33785e-006
		hillsFraction   0.68373
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225437
		craterFreq      0.248156
		craterDensity   0.854288
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.501965
		volcanoTemp     1322.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.260, 0.259, 0.258, 0.000)
		colorShelf     (0.276, 0.275, 0.275, 0.000)
		colorBeach     (0.292, 0.292, 0.291, 0.000)
		colorDesert    (0.309, 0.308, 0.307, 0.000)
		colorLowland   (0.325, 0.324, 0.323, 0.000)
		colorUpland    (0.341, 0.340, 0.339, 0.000)
		colorRock      (0.357, 0.356, 0.355, 0.000)
		colorSnow      (0.374, 0.373, 0.371, 1.000)
		BumpHeight      0.0252362
		BumpOffset      0.00504724
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.0321019
		DustBright  0.410938
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   14.7588
		Period          60.3892
		Eccentricity    0.948938
		Inclination     149.137
		AscendingNode   -124.526
		ArgOfPericenter 65.638
		MeanAnomaly     178.831
	}
}

Comet	"C63"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            4.96681e-014
	Radius          0.504247
	InertiaMoment   0.397536

	Oblateness      0.00957625

	RotationPeriod  50.5092
	Obliquity       245.282
	EqAscendNode    234.168

	AbsMagn         8.016
	SlopeParam      3.36463
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.516 0.513 0.511)

	Surface
	{
		SurfStyle       0.0248418
		OceanStyle      0.967494
		Randomize      (0.071, 0.865, -0.706)
		colorDistMagn   0.910306
		colorDistFreq   8.57087e-005
		detailScale     13.7693
		colorConversion true
		snowLevel       2
		tropicLatitude  0.995344
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.567251
		terraceProb     0.109655
		erosion         0
		montesMagn      0.481249
		montesFreq      3.56387
		montesSpiky     0.982016
		montesFraction  0.508163
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00054536
		hillsFraction   0.445874
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.270646
		craterFreq      0.257367
		craterDensity   0.981956
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.553129
		volcanoTemp     1246.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.207, 0.205, 0.204, 0.000)
		colorShelf     (0.219, 0.218, 0.217, 0.000)
		colorBeach     (0.232, 0.231, 0.230, 0.000)
		colorDesert    (0.245, 0.243, 0.243, 0.000)
		colorLowland   (0.258, 0.256, 0.256, 0.000)
		colorUpland    (0.271, 0.269, 0.268, 0.000)
		colorRock      (0.284, 0.282, 0.281, 0.000)
		colorSnow      (0.297, 0.295, 0.294, 1.000)
		BumpHeight      0.453822
		BumpOffset      0.0907644
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.21989
		GasToDust   0.25
		Particles   1424
		GasBright   0.121973
		DustBright  0.805554
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   24.4002
		Period          128.373
		Eccentricity    0.97144
		Inclination     42.6184
		AscendingNode   48.93
		ArgOfPericenter -9.23005
		MeanAnomaly     149.982
	}
}

Comet	"C64"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            3.84146e-010
	Radius          10.9536
	InertiaMoment   0.399497

	Oblateness      0.0137539

	RotationPeriod  48.698
	Obliquity       198.488
	EqAscendNode    218.745

	AbsMagn         4.08491
	SlopeParam      3.93702
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.511 0.453 0.396)

	Surface
	{
		SurfStyle       0.237023
		OceanStyle      0.691802
		Randomize      (-0.264, -0.790, 0.425)
		colorDistMagn   0.915259
		colorDistFreq   0.0808511
		detailScale     299.106
		colorConversion true
		snowLevel       2
		tropicLatitude  0.839423
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.288008
		terraceProb     0.505777
		erosion         0
		montesMagn      0.421118
		montesFreq      3.07117
		montesSpiky     0.742956
		montesFraction  0.395417
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.316998
		hillsFraction   0.624182
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.288446
		craterFreq      0.143497
		craterDensity   0.704943
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.483036
		volcanoTemp     1444.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.204, 0.181, 0.158, 0.000)
		colorShelf     (0.217, 0.193, 0.168, 0.000)
		colorBeach     (0.230, 0.204, 0.178, 0.000)
		colorDesert    (0.243, 0.215, 0.188, 0.000)
		colorLowland   (0.256, 0.227, 0.198, 0.000)
		colorUpland    (0.268, 0.238, 0.208, 0.000)
		colorRock      (0.281, 0.249, 0.218, 0.000)
		colorSnow      (0.294, 0.261, 0.228, 1.000)
		BumpHeight      9.85823
		BumpOffset      1.97165
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.701081
		GasToDust   0.25
		Particles   2396
		GasBright   0.116618
		DustBright  0.495395
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   20.7846
		Period          100.924
		Eccentricity    0.935803
		Inclination     -45.7544
		AscendingNode   -121.369
		ArgOfPericenter -71.99
		MeanAnomaly     -176.155
	}
}

Comet	"C65"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.18281e-017
	Radius          0.0312331
	InertiaMoment   0.398263

	Oblateness      0.0111189

	RotationPeriod  46.8887
	Obliquity       151.694
	EqAscendNode    203.323

	AbsMagn         11.6392
	SlopeParam      4.50418
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.728 0.725 0.723)

	Surface
	{
		SurfStyle       0.697255
		OceanStyle      0.305299
		Randomize      (-0.811, -0.484, -0.371)
		colorDistMagn   0.808363
		colorDistFreq   4.43014e-007
		detailScale     0.852872
		colorConversion true
		snowLevel       2
		tropicLatitude  0.439137
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.274439
		terraceProb     0.234638
		erosion         0
		montesMagn      0.391692
		montesFreq      3.13188
		montesSpiky     0.899754
		montesFraction  0.540317
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.73455e-006
		hillsFraction   0.581655
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246829
		craterFreq      0.193343
		craterDensity   0.898855
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49272
		volcanoTemp     1569.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.284, 0.247, 0.203, 0.000)
		colorShelf     (0.291, 0.254, 0.232, 0.000)
		colorBeach     (0.342, 0.297, 0.275, 0.000)
		colorDesert    (0.371, 0.319, 0.268, 0.000)
		colorLowland   (0.408, 0.341, 0.304, 0.000)
		colorUpland    (0.451, 0.413, 0.369, 0.000)
		colorRock      (0.488, 0.450, 0.398, 0.000)
		colorSnow      (0.532, 0.479, 0.420, 1.000)
		BumpHeight      0.0281098
		BumpOffset      0.00562196
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.0740046
		DustBright  0.222495
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   16.9952
		Period          74.6227
		Eccentricity    0.942953
		Inclination     -177.237
		AscendingNode   33.6994
		ArgOfPericenter 109.221
		MeanAnomaly     -100.267
	}
}

Comet	"C66"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            9.14822e-014
	Radius          0.678171
	InertiaMoment   0.399921

	Oblateness      0.0160232

	RotationPeriod  45.0765
	Obliquity       104.899
	EqAscendNode    187.9

	AbsMagn         7.80729
	SlopeParam      5.11608
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.689 0.586 0.503)

	Surface
	{
		SurfStyle       0.464941
		OceanStyle      0.726287
		Randomize      (-0.685, 0.850, 0.839)
		colorDistMagn   0.825477
		colorDistFreq   0.000343607
		detailScale     18.5186
		colorConversion true
		snowLevel       2
		tropicLatitude  0.977832
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.505579
		terraceProb     0.306456
		erosion         0
		montesMagn      0.447866
		montesFreq      3.11329
		montesSpiky     0.902495
		montesFraction  0.680225
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000851232
		hillsFraction   0.513497
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246167
		craterFreq      0.178316
		craterDensity   0.713843
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.509389
		volcanoTemp     1234.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.276, 0.234, 0.201, 0.000)
		colorShelf     (0.293, 0.249, 0.214, 0.000)
		colorBeach     (0.310, 0.264, 0.226, 0.000)
		colorDesert    (0.327, 0.278, 0.239, 0.000)
		colorLowland   (0.345, 0.293, 0.252, 0.000)
		colorUpland    (0.362, 0.308, 0.264, 0.000)
		colorRock      (0.379, 0.322, 0.277, 0.000)
		colorSnow      (0.396, 0.337, 0.289, 1.000)
		BumpHeight      0.610354
		BumpOffset      0.122071
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.252715
		GasToDust   0.25
		Particles   1490
		GasBright   0.241043
		DustBright  0.539943
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   12.9247
		Period          49.4894
		Eccentricity    0.938003
		Inclination     -92.0515
		AscendingNode   -103.082
		ArgOfPericenter -173.085
		MeanAnomaly     4.99724
	}
}

Comet	"C67"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            7.07549e-010
	Radius          12.2064
	InertiaMoment   0.398811

	Oblateness      0.0130633

	RotationPeriod  43.2568
	Obliquity       58.1051
	EqAscendNode    172.478

	AbsMagn         3.73292
	SlopeParam      5.85887
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.773 0.769 0.767)

	Surface
	{
		SurfStyle       0.9785
		OceanStyle      0.240845
		Randomize      (0.201, 0.275, -0.025)
		colorDistMagn   0.913452
		colorDistFreq   0.0560734
		detailScale     333.315
		colorConversion true
		snowLevel       2
		tropicLatitude  0.960892
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.680003
		terraceProb     0.224816
		erosion         0
		montesMagn      0.355315
		montesFreq      2.91211
		montesSpiky     0.935208
		montesFraction  0.378463
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.362553
		hillsFraction   0.691086
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230036
		craterFreq      0.199173
		craterDensity   0.839564
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.558101
		volcanoTemp     1685.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.263, 0.269, 0.307, 0.050)
		colorShelf     (0.309, 0.315, 0.353, 0.040)
		colorBeach     (0.355, 0.362, 0.399, 0.030)
		colorDesert    (0.402, 0.408, 0.452, 0.020)
		colorLowland   (0.448, 0.454, 0.498, 0.030)
		colorUpland    (0.494, 0.500, 0.544, 0.050)
		colorRock      (0.541, 0.546, 0.606, 0.020)
		colorSnow      (0.541, 0.546, 0.606, 1.000)
		BumpHeight      10.9857
		BumpOffset      2.19715
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.733907
		GasToDust   0.25
		Particles   2462
		GasBright   0.171147
		DustBright  0.294326
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   13.6429
		Period          53.6711
		Eccentricity    0.942336
		Inclination     -51.0069
		AscendingNode   157.44
		ArgOfPericenter 78.1996
		MeanAnomaly     70.0973
	}
}

Comet	"C68"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            2.1786e-017
	Radius          0.0419885
	InertiaMoment   0.397015

	Oblateness      0.0187036

	RotationPeriod  41.425
	Obliquity       11.3108
	EqAscendNode    157.055

	AbsMagn         11.3341
	SlopeParam      7.04001
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.535 0.533 0.528)

	Surface
	{
		SurfStyle       0.0132592
		OceanStyle      0.551535
		Randomize      (-0.603, -0.728, 0.853)
		colorDistMagn   0.0522231
		colorDistFreq   1.01094e-006
		detailScale     1.14657
		colorConversion true
		snowLevel       2
		tropicLatitude  0.990492
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.553255
		terraceProb     0.25591
		erosion         0
		montesMagn      0.445727
		montesFreq      3.52705
		montesSpiky     0.909368
		montesFraction  0.745167
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.98841e-006
		hillsFraction   0.664155
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.208482
		craterFreq      0.230257
		craterDensity   0.73177
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.560486
		volcanoTemp     1863.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.214, 0.213, 0.211, 0.000)
		colorShelf     (0.228, 0.226, 0.225, 0.000)
		colorBeach     (0.241, 0.240, 0.238, 0.000)
		colorDesert    (0.254, 0.253, 0.251, 0.000)
		colorLowland   (0.268, 0.266, 0.264, 0.000)
		colorUpland    (0.281, 0.280, 0.277, 0.000)
		colorRock      (0.294, 0.293, 0.291, 0.000)
		colorSnow      (0.308, 0.306, 0.304, 1.000)
		BumpHeight      0.0377896
		BumpOffset      0.00755793
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.405376
		DustBright  0.544584
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   20.8394
		Period          101.323
		Eccentricity    0.941786
		Inclination     -70.8271
		AscendingNode   -174.746
		ArgOfPericenter 111.577
		MeanAnomaly     20.7427
	}
}

Comet	"C69"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.68499e-013
	Radius          0.75606
	InertiaMoment   0.399281

	Oblateness      0.0156003

	RotationPeriod  39.576
	Obliquity       324.517
	EqAscendNode    141.632

	AbsMagn         7.59806
	SlopeParam      2.36259
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.784 0.698 0.615)

	Surface
	{
		SurfStyle       0.472339
		OceanStyle      0.405139
		Randomize      (-0.601, 0.688, 0.736)
		colorDistMagn   0.610329
		colorDistFreq   2.70101e-005
		detailScale     20.6455
		colorConversion true
		snowLevel       2
		tropicLatitude  0.562933
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.362753
		terraceProb     0.424209
		erosion         0
		montesMagn      0.472728
		montesFreq      1.81977
		montesSpiky     0.870029
		montesFraction  0.107108
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00172202
		hillsFraction   0.80432
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24378
		craterFreq      0.204815
		craterDensity   0.87496
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.501431
		volcanoTemp     1477.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.314, 0.279, 0.246, 0.000)
		colorShelf     (0.333, 0.297, 0.261, 0.000)
		colorBeach     (0.353, 0.314, 0.277, 0.000)
		colorDesert    (0.372, 0.332, 0.292, 0.000)
		colorLowland   (0.392, 0.349, 0.307, 0.000)
		colorUpland    (0.412, 0.367, 0.323, 0.000)
		colorRock      (0.431, 0.384, 0.338, 0.000)
		colorSnow      (0.451, 0.401, 0.354, 1.000)
		BumpHeight      0.680454
		BumpOffset      0.136091
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.285541
		GasToDust   0.25
		Particles   1556
		GasBright   0.308198
		DustBright  0.326248
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   16.0512
		Period          68.4926
		Eccentricity    0.958895
		Inclination     22.4334
		AscendingNode   70.5276
		ArgOfPericenter 77.2221
		MeanAnomaly     155.229
	}
}

Comet	"C70"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.30322e-009
	Radius          16.4032
	InertiaMoment   0.397938

	Oblateness      0.0225799

	RotationPeriod  37.7044
	Obliquity       277.722
	EqAscendNode    126.21

	AbsMagn         3.34435
	SlopeParam      3.05651
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.638 0.634 0.631)

	Surface
	{
		SurfStyle       0.863458
		OceanStyle      0.607141
		Randomize      (0.749, -0.783, 0.650)
		colorDistMagn   0.976817
		colorDistFreq   0.0917774
		detailScale     447.916
		colorConversion true
		snowLevel       2
		tropicLatitude  0.36692
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.611444
		terraceProb     0.500549
		erosion         0
		montesMagn      0.394088
		montesFreq      3.75562
		montesSpiky     0.876164
		montesFraction  0.828135
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.566307
		hillsFraction   0.615154
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.216888
		craterFreq      0.205689
		craterDensity   0.7998
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.477452
		volcanoTemp     1471.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.217, 0.222, 0.252, 0.050)
		colorShelf     (0.255, 0.260, 0.290, 0.040)
		colorBeach     (0.294, 0.298, 0.328, 0.030)
		colorDesert    (0.332, 0.336, 0.372, 0.020)
		colorLowland   (0.370, 0.374, 0.410, 0.030)
		colorUpland    (0.409, 0.412, 0.448, 0.050)
		colorRock      (0.447, 0.450, 0.498, 0.020)
		colorSnow      (0.447, 0.450, 0.498, 1.000)
		BumpHeight      14.7629
		BumpOffset      2.95257
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.766733
		GasToDust   0.25
		Particles   2528
		GasBright   0.0142946
		DustBright  0.304638
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   17.0267
		Period          74.8304
		Eccentricity    0.902789
		Inclination     -92.4876
		AscendingNode   20.9712
		ArgOfPericenter 111.358
		MeanAnomaly     -14.9045
	}
}

Comet	"C71"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            4.01271e-017
	Radius          0.0468301
	InertiaMoment   0.399714

	Oblateness      0.0190498

	RotationPeriod  35.8046
	Obliquity       230.928
	EqAscendNode    110.787

	AbsMagn         11.0473
	SlopeParam      3.65046
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.760 0.758 0.756)

	Surface
	{
		SurfStyle       0.554545
		OceanStyle      0.933448
		Randomize      (-0.200, -0.335, -0.870)
		colorDistMagn   0.667932
		colorDistFreq   5.41781e-007
		detailScale     1.27877
		colorConversion true
		snowLevel       2
		tropicLatitude  0.916672
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.634295
		terraceProb     0.402295
		erosion         0
		montesMagn      0.591464
		montesFreq      2.22798
		montesSpiky     0.959314
		montesFraction  0.520892
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.7827e-006
		hillsFraction   0.729421
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247486
		craterFreq      0.232178
		craterDensity   0.863922
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.555573
		volcanoTemp     1467.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.296, 0.258, 0.212, 0.000)
		colorShelf     (0.304, 0.265, 0.242, 0.000)
		colorBeach     (0.357, 0.311, 0.287, 0.000)
		colorDesert    (0.387, 0.333, 0.280, 0.000)
		colorLowland   (0.425, 0.356, 0.318, 0.000)
		colorUpland    (0.471, 0.432, 0.386, 0.000)
		colorRock      (0.509, 0.470, 0.416, 0.000)
		colorSnow      (0.555, 0.500, 0.439, 1.000)
		BumpHeight      0.0421471
		BumpOffset      0.00842941
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.0834476
		DustBright  0.719972
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   18.9923
		Period          88.1553
		Eccentricity    0.951569
		Inclination     -114.772
		AscendingNode   -19.6796
		ArgOfPericenter -44.6407
		MeanAnomaly     -112.775
	}
}

Comet	"C72"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            3.10354e-013
	Radius          1.01562
	InertiaMoment   0.398554

	Oblateness      0.0279542

	RotationPeriod  33.8702
	Obliquity       184.134
	EqAscendNode    95.3646

	AbsMagn         7.38771
	SlopeParam      4.21451
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.802 0.778 0.746)

	Surface
	{
		SurfStyle       0.34067
		OceanStyle      0.694584
		Randomize      (0.979, -0.515, 0.392)
		colorDistMagn   0.0739479
		colorDistFreq   0.000431578
		detailScale     27.7333
		colorConversion true
		snowLevel       2
		tropicLatitude  0.41055
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.519781
		terraceProb     0.247927
		erosion         0
		montesMagn      0.420585
		montesFreq      2.1369
		montesSpiky     0.924174
		montesFraction  0.12627
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00262447
		hillsFraction   0.455254
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246593
		craterFreq      0.217159
		craterDensity   0.959491
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.524167
		volcanoTemp     1575.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.321, 0.311, 0.298, 0.000)
		colorShelf     (0.341, 0.331, 0.317, 0.000)
		colorBeach     (0.361, 0.350, 0.336, 0.000)
		colorDesert    (0.381, 0.370, 0.354, 0.000)
		colorLowland   (0.401, 0.389, 0.373, 0.000)
		colorUpland    (0.421, 0.409, 0.391, 0.000)
		colorRock      (0.441, 0.428, 0.410, 0.000)
		colorSnow      (0.461, 0.447, 0.429, 1.000)
		BumpHeight      0.914062
		BumpOffset      0.182812
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.318367
		GasToDust   0.25
		Particles   1622
		GasBright   0.0794851
		DustBright  0.408421
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   18.0807
		Period          81.8848
		Eccentricity    0.966378
		Inclination     -155.445
		AscendingNode   -98.9149
		ArgOfPericenter 60.2112
		MeanAnomaly     -74.4807
	}
}

Comet	"C73"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            2.40036e-009
	Radius          18.3017
	InertiaMoment   0.396132

	Oblateness      0.0236361

	RotationPeriod  31.894
	Obliquity       137.339
	EqAscendNode    79.942

	AbsMagn         2.90602
	SlopeParam      4.79654
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.785 0.783 0.782)

	Surface
	{
		SurfStyle       0.183731
		OceanStyle      0.0520006
		Randomize      (0.432, -0.387, -0.536)
		colorDistMagn   0.0919846
		colorDistFreq   0.115113
		detailScale     499.759
		colorConversion true
		snowLevel       2
		tropicLatitude  0.705051
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.539457
		terraceProb     0.468747
		erosion         0
		montesMagn      0.546671
		montesFreq      3.06609
		montesSpiky     0.803996
		montesFraction  0.787531
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.629321
		hillsFraction   0.630229
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214477
		craterFreq      0.204496
		craterDensity   0.936312
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.605856
		volcanoTemp     1340.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.314, 0.313, 0.313, 0.000)
		colorShelf     (0.333, 0.333, 0.332, 0.000)
		colorBeach     (0.353, 0.353, 0.352, 0.000)
		colorDesert    (0.373, 0.372, 0.371, 0.000)
		colorLowland   (0.392, 0.392, 0.391, 0.000)
		colorUpland    (0.412, 0.411, 0.410, 0.000)
		colorRock      (0.432, 0.431, 0.430, 0.000)
		colorSnow      (0.451, 0.450, 0.449, 1.000)
		BumpHeight      16.4715
		BumpOffset      3.29431
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.799559
		GasToDust   0.25
		Particles   2595
		GasBright   0.215828
		DustBright  0.756564
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   15.0258
		Period          62.035
		Eccentricity    0.930227
		Inclination     133.116
		AscendingNode   114.679
		ArgOfPericenter 176.938
		MeanAnomaly     10.264
	}
}

Comet	"C74"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            7.39089e-017
	Radius          0.0628845
	InertiaMoment   0.399055

	Oblateness      0.0358985

	RotationPeriod  29.8681
	Obliquity       90.545
	EqAscendNode    64.5194

	AbsMagn         10.7754
	SlopeParam      5.45709
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.521 0.516 0.511)

	Surface
	{
		SurfStyle       0.599859
		OceanStyle      0.487967
		Randomize      (0.175, 0.158, 0.993)
		colorDistMagn   0.159588
		colorDistFreq   2.82293e-006
		detailScale     1.71717
		colorConversion true
		snowLevel       2
		tropicLatitude  0.996409
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.57421
		terraceProb     0.205142
		erosion         0
		montesMagn      0.474768
		montesFreq      2.26993
		montesSpiky     0.93335
		montesFraction  0.609083
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.96113e-006
		hillsFraction   0.527771
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.291131
		craterFreq      0.26646
		craterDensity   0.855123
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51971
		volcanoTemp     1553.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.203, 0.175, 0.143, 0.000)
		colorShelf     (0.208, 0.180, 0.164, 0.000)
		colorBeach     (0.245, 0.211, 0.194, 0.000)
		colorDesert    (0.266, 0.227, 0.189, 0.000)
		colorLowland   (0.292, 0.242, 0.215, 0.000)
		colorUpland    (0.323, 0.294, 0.261, 0.000)
		colorRock      (0.349, 0.320, 0.281, 0.000)
		colorSnow      (0.380, 0.340, 0.297, 1.000)
		BumpHeight      0.0565961
		BumpOffset      0.0113192
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.184584
		DustBright  0.472295
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   18.5543
		Period          85.1231
		Eccentricity    0.928508
		Inclination     -162.288
		AscendingNode   -107.945
		ArgOfPericenter 163.638
		MeanAnomaly     -106.682
	}
}

Comet	"C75"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            5.71632e-013
	Radius          1.13359
	InertiaMoment   0.397548

	Oblateness      0.0312462

	RotationPeriod  27.783
	Obliquity       43.7507
	EqAscendNode    49.0968

	AbsMagn         7.17566
	SlopeParam      6.33938
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.772 0.667 0.612)

	Surface
	{
		SurfStyle       0.380652
		OceanStyle      0.503264
		Randomize      (-0.811, 0.930, -0.531)
		colorDistMagn   0.518133
		colorDistFreq   0.000404274
		detailScale     30.9546
		colorConversion true
		snowLevel       2
		tropicLatitude  0.698203
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.571323
		terraceProb     0.243754
		erosion         0
		montesMagn      0.647678
		montesFreq      3.60518
		montesSpiky     0.87784
		montesFraction  0.645008
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00284651
		hillsFraction   0.614632
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229216
		craterFreq      0.257345
		craterDensity   0.787037
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.442577
		volcanoTemp     1701.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.309, 0.267, 0.245, 0.000)
		colorShelf     (0.328, 0.284, 0.260, 0.000)
		colorBeach     (0.347, 0.300, 0.275, 0.000)
		colorDesert    (0.367, 0.317, 0.291, 0.000)
		colorLowland   (0.386, 0.334, 0.306, 0.000)
		colorUpland    (0.405, 0.350, 0.321, 0.000)
		colorRock      (0.425, 0.367, 0.336, 0.000)
		colorSnow      (0.444, 0.384, 0.352, 1.000)
		BumpHeight      1.02023
		BumpOffset      0.204047
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.351193
		GasToDust   0.25
		Particles   1689
		GasBright   0.11608
		DustBright  0.225285
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   11.9263
		Period          43.8672
		Eccentricity    0.94504
		Inclination     -49.4869
		AscendingNode   -62.0217
		ArgOfPericenter -90.2554
		MeanAnomaly     107.248
	}
}

Comet	"C76"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            4.42117e-009
	Radius          24.5675
	InertiaMoment   0.399503

	Oblateness      0.0486868

	RotationPeriod  25.6278
	Obliquity       356.956
	EqAscendNode    33.6742

	AbsMagn         2.39616
	SlopeParam      8.73238
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.410 0.407 0.403)

	Surface
	{
		SurfStyle       0.785043
		OceanStyle      0.474086
		Randomize      (0.324, 0.004, 0.999)
		colorDistMagn   0.188361
		colorDistFreq   0.425723
		detailScale     670.858
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999038
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.751248
		terraceProb     0.296414
		erosion         0
		montesMagn      0.427978
		montesFreq      4.55247
		montesSpiky     0.925689
		montesFraction  0.435561
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.30076
		hillsFraction   0.6471
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217843
		craterFreq      0.239157
		craterDensity   0.845722
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.530022
		volcanoTemp     1535.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.160, 0.138, 0.113, 0.000)
		colorShelf     (0.164, 0.142, 0.129, 0.000)
		colorBeach     (0.193, 0.167, 0.153, 0.000)
		colorDesert    (0.209, 0.179, 0.149, 0.000)
		colorLowland   (0.230, 0.191, 0.169, 0.000)
		colorUpland    (0.254, 0.232, 0.205, 0.000)
		colorRock      (0.275, 0.252, 0.221, 0.000)
		colorSnow      (0.299, 0.269, 0.234, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.832385
		GasToDust   0.25
		Particles   2661
		GasBright   0.329591
		DustBright  0.496261
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   18.0929
		Period          81.9678
		Eccentricity    0.959462
		Inclination     -93.4549
		AscendingNode   -107.948
		ArgOfPericenter 48.1367
		MeanAnomaly     6.52733
	}
}

Comet	"C77"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.36131e-016
	Radius          0.0702135
	InertiaMoment   0.39827

	Oblateness      0.0441118

	RotationPeriod  23.3892
	Obliquity       310.162
	EqAscendNode    18.2516

	AbsMagn         10.5157
	SlopeParam      2.72406
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.699 0.556 0.488)

	Surface
	{
		SurfStyle       0.875616
		OceanStyle      0.742543
		Randomize      (-0.904, 0.423, -0.939)
		colorDistMagn   0.58067
		colorDistFreq   2.54864e-006
		detailScale     1.9173
		colorConversion true
		snowLevel       2
		tropicLatitude  0.665928
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.612748
		terraceProb     0.230579
		erosion         0
		montesMagn      0.473283
		montesFreq      4.26429
		montesSpiky     0.963108
		montesFraction  0.580116
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.16777e-005
		hillsFraction   0.812407
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249196
		craterFreq      0.244191
		craterDensity   0.913701
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.608096
		volcanoTemp     1527.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.238, 0.195, 0.195, 0.050)
		colorShelf     (0.279, 0.228, 0.225, 0.040)
		colorBeach     (0.321, 0.261, 0.254, 0.030)
		colorDesert    (0.363, 0.295, 0.288, 0.020)
		colorLowland   (0.405, 0.328, 0.317, 0.030)
		colorUpland    (0.447, 0.362, 0.347, 0.050)
		colorRock      (0.489, 0.395, 0.386, 0.020)
		colorSnow      (0.489, 0.395, 0.386, 1.000)
		BumpHeight      0.0631922
		BumpOffset      0.0126384
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.233805
		DustBright  0.276534
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   15.7724
		Period          66.7161
		Eccentricity    0.926394
		Inclination     -171.915
		AscendingNode   -0.372809
		ArgOfPericenter 175.728
		MeanAnomaly     -41.0582
	}
}

Comet	"C78"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.05288e-012
	Radius          1.5212
	InertiaMoment   0.399926

	Oblateness      0.0720456

	RotationPeriod  21.051
	Obliquity       263.368
	EqAscendNode    2.82902

	AbsMagn         6.96127
	SlopeParam      3.35651
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.652 0.651 0.649)

	Surface
	{
		SurfStyle       0.64197
		OceanStyle      0.154484
		Randomize      (0.514, -0.234, 0.567)
		colorDistMagn   0.0970109
		colorDistFreq   0.001288
		detailScale     41.5388
		colorConversion true
		snowLevel       2
		tropicLatitude  0.966578
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.492456
		terraceProb     0.247062
		erosion         0
		montesMagn      0.535699
		montesFreq      2.59303
		montesSpiky     0.983888
		montesFraction  0.71824
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00690761
		hillsFraction   0.755022
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22727
		craterFreq      0.248116
		craterDensity   1.03311
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.533245
		volcanoTemp     1653.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.254, 0.221, 0.182, 0.000)
		colorShelf     (0.261, 0.228, 0.208, 0.000)
		colorBeach     (0.307, 0.267, 0.246, 0.000)
		colorDesert    (0.333, 0.286, 0.240, 0.000)
		colorLowland   (0.365, 0.306, 0.272, 0.000)
		colorUpland    (0.404, 0.371, 0.331, 0.000)
		colorRock      (0.437, 0.403, 0.357, 0.000)
		colorSnow      (0.476, 0.429, 0.376, 1.000)
		BumpHeight      1.36908
		BumpOffset      0.273815
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.384019
		GasToDust   0.25
		Particles   1755
		GasBright   0.0170934
		DustBright  0.977732
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   18.9385
		Period          87.7807
		Eccentricity    0.949506
		Inclination     21.5951
		AscendingNode   5.72398
		ArgOfPericenter 33.1571
		MeanAnomaly     65.3032
	}
}

Comet	"C79"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            8.14324e-009
	Radius          27.4399
	InertiaMoment   0.398817

	Oblateness      0.0697927

	RotationPeriod  18.5933
	Obliquity       216.574
	EqAscendNode    347.406

	AbsMagn         1.77434
	SlopeParam      3.92929
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.828 0.760 0.737)

	Surface
	{
		SurfStyle       0.401176
		OceanStyle      0.0466379
		Randomize      (-0.635, -0.130, -0.974)
		colorDistMagn   0.910937
		colorDistFreq   0.638351
		detailScale     749.293
		colorConversion true
		snowLevel       2
		tropicLatitude  0.53969
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.728628
		terraceProb     0.404797
		erosion         0
		montesMagn      0.269673
		montesFreq      3.32877
		montesSpiky     0.909552
		montesFraction  0.368204
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.70975
		hillsFraction   0.387086
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259826
		craterFreq      0.163943
		craterDensity   0.776158
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.478953
		volcanoTemp     1387.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.331, 0.304, 0.295, 0.000)
		colorShelf     (0.352, 0.323, 0.313, 0.000)
		colorBeach     (0.373, 0.342, 0.332, 0.000)
		colorDesert    (0.393, 0.361, 0.350, 0.000)
		colorLowland   (0.414, 0.380, 0.368, 0.000)
		colorUpland    (0.435, 0.399, 0.387, 0.000)
		colorRock      (0.455, 0.418, 0.405, 0.000)
		colorSnow      (0.476, 0.437, 0.424, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.865211
		GasToDust   0.25
		Particles   2727
		GasBright   0.0517823
		DustBright  0.62753
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   17.9291
		Period          80.8576
		Eccentricity    0.94058
		Inclination     162.828
		AscendingNode   -64.9196
		ArgOfPericenter -175.797
		MeanAnomaly     115.617
	}
}

Comet	"C80"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            2.50737e-016
	Radius          0.0941922
	InertiaMoment   0.397031

	Oblateness      0.123136

	RotationPeriod  15.9901
	Obliquity       169.779
	EqAscendNode    331.984

	AbsMagn         10.2663
	SlopeParam      4.49622
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.637 0.472 0.382)

	Surface
	{
		SurfStyle       0.228892
		OceanStyle      0.0774726
		Randomize      (0.590, -0.932, 0.033)
		colorDistMagn   0.515932
		colorDistFreq   4.43947e-006
		detailScale     2.57207
		colorConversion true
		snowLevel       2
		tropicLatitude  0.528905
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.632796
		terraceProb     0.481561
		erosion         0
		montesMagn      0.399997
		montesFreq      3.00647
		montesSpiky     0.930725
		montesFraction  0.69632
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.37107e-005
		hillsFraction   0.50114
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240484
		craterFreq      0.204459
		craterDensity   0.846388
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.44706
		volcanoTemp     1772.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.255, 0.189, 0.153, 0.000)
		colorShelf     (0.271, 0.201, 0.162, 0.000)
		colorBeach     (0.287, 0.212, 0.172, 0.000)
		colorDesert    (0.303, 0.224, 0.181, 0.000)
		colorLowland   (0.319, 0.236, 0.191, 0.000)
		colorUpland    (0.335, 0.248, 0.200, 0.000)
		colorRock      (0.351, 0.260, 0.210, 0.000)
		colorSnow      (0.367, 0.272, 0.220, 1.000)
		BumpHeight      0.084773
		BumpOffset      0.0169546
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.049212
		DustBright  0.314586
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   19.7487
		Period          93.4735
		Eccentricity    0.942683
		Inclination     -24.29
		AscendingNode   -48.5376
		ArgOfPericenter -94.4457
		MeanAnomaly     179.815
	}
}

Comet	"C81"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.93926e-012
	Radius          1.69958
	InertiaMoment   0.399286

	Oblateness      0.138252

	RotationPeriod  13.2077
	Obliquity       122.985
	EqAscendNode    316.561

	AbsMagn         6.74385
	SlopeParam      5.10708
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.691 0.687 0.684)

	Surface
	{
		SurfStyle       0.373862
		OceanStyle      0.641137
		Randomize      (-0.606, -0.008, 0.181)
		colorDistMagn   0.303532
		colorDistFreq   0.00162515
		detailScale     46.41
		colorConversion true
		snowLevel       2
		tropicLatitude  0.885712
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.261853
		terraceProb     0.389275
		erosion         0
		montesMagn      0.619511
		montesFreq      2.55453
		montesSpiky     0.711581
		montesFraction  0.646586
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00552941
		hillsFraction   0.803597
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235074
		craterFreq      0.250432
		craterDensity   0.811751
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50616
		volcanoTemp     1593.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.277, 0.275, 0.273, 0.000)
		colorShelf     (0.294, 0.292, 0.291, 0.000)
		colorBeach     (0.311, 0.309, 0.308, 0.000)
		colorDesert    (0.328, 0.326, 0.325, 0.000)
		colorLowland   (0.346, 0.343, 0.342, 0.000)
		colorUpland    (0.363, 0.360, 0.359, 0.000)
		colorRock      (0.380, 0.378, 0.376, 0.000)
		colorSnow      (0.397, 0.395, 0.393, 1.000)
		BumpHeight      1.52963
		BumpOffset      0.305925
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.416845
		GasToDust   0.25
		Particles   1821
		GasBright   0.164837
		DustBright  0.683448
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   18.3025
		Period          83.3963
		Eccentricity    0.935349
		Inclination     60.6487
		AscendingNode   179.356
		ArgOfPericenter 167.553
		MeanAnomaly     -118.812
	}
}

Comet	"C82"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.49988e-008
	Radius          36.8002
	InertiaMoment   0.397947

	Oblateness      0.249

	RotationPeriod  10.2002
	Obliquity       76.1907
	EqAscendNode    301.139

	AbsMagn         0.950185
	SlopeParam      5.84702
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.685 0.680 0.678)

	Surface
	{
		SurfStyle       0.242153
		OceanStyle      0.105032
		Randomize      (-0.414, 0.973, 0.159)
		colorDistMagn   0.718459
		colorDistFreq   0.636515
		detailScale     1004.89
		colorConversion true
		snowLevel       2
		tropicLatitude  0.962258
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.734919
		terraceProb     0.488356
		erosion         0
		montesMagn      0.512793
		montesFreq      3.77038
		montesSpiky     0.889255
		montesFraction  0.453171
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.68395
		hillsFraction   0.548838
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261119
		craterFreq      0.217877
		craterDensity   0.773727
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.434289
		volcanoTemp     1018.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.274, 0.272, 0.271, 0.000)
		colorShelf     (0.291, 0.289, 0.288, 0.000)
		colorBeach     (0.308, 0.306, 0.305, 0.000)
		colorDesert    (0.325, 0.323, 0.322, 0.000)
		colorLowland   (0.342, 0.340, 0.339, 0.000)
		colorUpland    (0.359, 0.357, 0.356, 0.000)
		colorRock      (0.377, 0.374, 0.373, 0.000)
		colorSnow      (0.394, 0.391, 0.390, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.898037
		GasToDust   0.25
		Particles   2794
		GasBright   0.134985
		DustBright  0.397787
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   20.3229
		Period          97.5798
		Eccentricity    0.943638
		Inclination     177.873
		AscendingNode   21.1661
		ArgOfPericenter -123.459
		MeanAnomaly     -109.366
	}
}

Comet	"C83"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            4.61824e-016
	Radius          0.105269
	InertiaMoment   0.399719

	Oblateness      0.249

	RotationPeriod  6.90265
	Obliquity       29.3964
	EqAscendNode    285.716

	AbsMagn         10.0253
	SlopeParam      7.01574
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.738 0.736 0.734)

	Surface
	{
		SurfStyle       0.326927
		OceanStyle      0.489035
		Randomize      (-0.488, -0.213, -0.886)
		colorDistMagn   0.431601
		colorDistFreq   1.72087e-006
		detailScale     2.87455
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998919
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.375354
		terraceProb     0.151171
		erosion         0
		montesMagn      0.642815
		montesFreq      3.0151
		montesSpiky     0.997625
		montesFraction  0.430804
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.99803e-005
		hillsFraction   0.604955
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232602
		craterFreq      0.178618
		craterDensity   0.890709
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.548763
		volcanoTemp     958.632
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.295, 0.294, 0.293, 0.000)
		colorShelf     (0.314, 0.313, 0.312, 0.000)
		colorBeach     (0.332, 0.331, 0.330, 0.000)
		colorDesert    (0.351, 0.349, 0.349, 0.000)
		colorLowland   (0.369, 0.368, 0.367, 0.000)
		colorUpland    (0.388, 0.386, 0.385, 0.000)
		colorRock      (0.406, 0.405, 0.404, 0.000)
		colorSnow      (0.425, 0.423, 0.422, 1.000)
		BumpHeight      0.0947423
		BumpOffset      0.0189485
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.0678733
		DustBright  0.149385
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   18.9894
		Period          88.135
		Eccentricity    0.980344
		Inclination     -58.56
		AscendingNode   -166.95
		ArgOfPericenter -80.5667
		MeanAnomaly     -90.1448
	}
}

Comet	"C84"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            3.57188e-012
	Radius          2.27872
	InertiaMoment   0.398561

	Oblateness      0.249

	RotationPeriod  3.21859
	Obliquity       342.602
	EqAscendNode    270.293

	AbsMagn         6.52264
	SlopeParam      2.35178
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.704 0.701 0.696)

	Surface
	{
		SurfStyle       0.165716
		OceanStyle      0.820475
		Randomize      (0.982, -0.370, -0.060)
		colorDistMagn   0.440972
		colorDistFreq   0.00206111
		detailScale     62.2241
		colorConversion true
		snowLevel       2
		tropicLatitude  0.92551
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.750144
		terraceProb     0.501854
		erosion         0
		montesMagn      0.379155
		montesFreq      2.64049
		montesSpiky     0.964912
		montesFraction  0.455631
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0120811
		hillsFraction   0.582418
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.277932
		craterFreq      0.203583
		craterDensity   0.989336
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.523554
		volcanoTemp     1398.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.281, 0.280, 0.279, 0.000)
		colorShelf     (0.299, 0.298, 0.296, 0.000)
		colorBeach     (0.317, 0.315, 0.313, 0.000)
		colorDesert    (0.334, 0.333, 0.331, 0.000)
		colorLowland   (0.352, 0.350, 0.348, 0.000)
		colorUpland    (0.369, 0.368, 0.366, 0.000)
		colorRock      (0.387, 0.386, 0.383, 0.000)
		colorSnow      (0.405, 0.403, 0.400, 1.000)
		BumpHeight      2.05084
		BumpOffset      0.410169
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.449671
		GasToDust   0.25
		Particles   1888
		GasBright   0.260666
		DustBright  0.441079
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   21.1944
		Period          103.923
		Eccentricity    0.9417
		Inclination     129.531
		AscendingNode   -7.49163
		ArgOfPericenter 121.141
		MeanAnomaly     101.625
	}
}

Comet	"C85"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            2.76259e-008
	Radius          41.1394
	InertiaMoment   0.396166

	Oblateness      0.00151226

	RotationPeriod  125.268
	Obliquity       295.808
	EqAscendNode    254.871

	AbsMagn         -0.370798
	SlopeParam      3.04787
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.787 0.756 0.709)

	Surface
	{
		SurfStyle       0.988226
		OceanStyle      0.802338
		Randomize      (-0.538, -0.475, 0.300)
		colorDistMagn   0.467022
		colorDistFreq   0.762275
		detailScale     1123.38
		colorConversion true
		snowLevel       2
		tropicLatitude  0.719404
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.478901
		terraceProb     0.223123
		erosion         0
		montesMagn      0.614747
		montesFreq      3.26447
		montesSpiky     0.91894
		montesFraction  0.46576
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.30588
		hillsFraction   0.649152
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227662
		craterFreq      0.189513
		craterDensity   1.0244
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.557258
		volcanoTemp     1521.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.268, 0.265, 0.284, 0.050)
		colorShelf     (0.315, 0.310, 0.326, 0.040)
		colorBeach     (0.362, 0.355, 0.369, 0.030)
		colorDesert    (0.409, 0.401, 0.418, 0.020)
		colorLowland   (0.456, 0.446, 0.461, 0.030)
		colorUpland    (0.504, 0.491, 0.503, 0.050)
		colorRock      (0.551, 0.537, 0.560, 0.020)
		colorSnow      (0.551, 0.537, 0.560, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.930863
		GasToDust   0.25
		Particles   2860
		GasBright   0.166272
		DustBright  0.219959
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   21.4346
		Period          105.696
		Eccentricity    0.953061
		Inclination     26.6593
		AscendingNode   40.855
		ArgOfPericenter -124.525
		MeanAnomaly     55.2466
	}
}

Comet	"C86"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            8.50624e-016
	Radius          0.141103
	InertiaMoment   0.399061

	Oblateness      0.00247152

	RotationPeriod  112.781
	Obliquity       249.013
	EqAscendNode    239.448

	AbsMagn         9.79151
	SlopeParam      3.64262
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.562 0.557 0.552)

	Surface
	{
		SurfStyle       0.278916
		OceanStyle      0.210298
		Randomize      (0.740, 0.430, 0.996)
		colorDistMagn   0.420513
		colorDistFreq   5.21236e-006
		detailScale     3.85305
		colorConversion true
		snowLevel       2
		tropicLatitude  0.849667
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.649811
		terraceProb     0.288756
		erosion         0
		montesMagn      0.488518
		montesFreq      2.65126
		montesSpiky     0.909152
		montesFraction  0.637924
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.93622e-005
		hillsFraction   0.694173
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225512
		craterFreq      0.182083
		craterDensity   0.884256
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.404833
		volcanoTemp     1352.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.225, 0.223, 0.221, 0.000)
		colorShelf     (0.239, 0.237, 0.235, 0.000)
		colorBeach     (0.253, 0.251, 0.248, 0.000)
		colorDesert    (0.267, 0.265, 0.262, 0.000)
		colorLowland   (0.281, 0.279, 0.276, 0.000)
		colorUpland    (0.295, 0.292, 0.290, 0.000)
		colorRock      (0.309, 0.306, 0.304, 0.000)
		colorSnow      (0.323, 0.320, 0.317, 1.000)
		BumpHeight      0.126993
		BumpOffset      0.0253985
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.426255
		DustBright  0.444463
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   26.2942
		Period          143.605
		Eccentricity    0.957898
		Inclination     -16.5786
		AscendingNode   -46.2982
		ArgOfPericenter -19.8568
		MeanAnomaly     -94.6622
	}
}

Comet	"C87"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            6.57896e-012
	Radius          2.54808
	InertiaMoment   0.397559

	Oblateness      0.00215036

	RotationPeriod  105.207
	Obliquity       202.219
	EqAscendNode    224.026

	AbsMagn         6.29683
	SlopeParam      4.20675
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.641 0.637 0.632)

	Surface
	{
		SurfStyle       0.406226
		OceanStyle      0.452536
		Randomize      (-0.039, 0.893, 0.869)
		colorDistMagn   0.174908
		colorDistFreq   0.00278814
		detailScale     69.5796
		colorConversion true
		snowLevel       2
		tropicLatitude  0.922821
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.618656
		terraceProb     0.100965
		erosion         0
		montesMagn      0.453921
		montesFreq      2.75782
		montesSpiky     0.935801
		montesFraction  0.732068
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0133587
		hillsFraction   0.568592
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239149
		craterFreq      0.259193
		craterDensity   0.748867
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.550039
		volcanoTemp     1585.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.256, 0.255, 0.253, 0.000)
		colorShelf     (0.272, 0.271, 0.268, 0.000)
		colorBeach     (0.289, 0.287, 0.284, 0.000)
		colorDesert    (0.305, 0.303, 0.300, 0.000)
		colorLowland   (0.321, 0.319, 0.316, 0.000)
		colorUpland    (0.337, 0.335, 0.332, 0.000)
		colorRock      (0.353, 0.350, 0.347, 0.000)
		colorSnow      (0.369, 0.366, 0.363, 1.000)
		BumpHeight      2.29327
		BumpOffset      0.458654
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.482497
		GasToDust   0.25
		Particles   1954
		GasBright   0.0269772
		DustBright  0.528227
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   13.0625
		Period          50.2831
		Eccentricity    0.938595
		Inclination     109.407
		AscendingNode   -77.4297
		ArgOfPericenter 56.4859
		MeanAnomaly     32.0559
	}
}

Comet	"C88"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            5.08835e-008
	Radius          55.1299
	InertiaMoment   0.399508

	Oblateness      0.00316791

	RotationPeriod  99.5528
	Obliquity       155.425
	EqAscendNode    208.603

	AbsMagn         17.2786
	SlopeParam      4.78819
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.747 0.742 0.740)

	Surface
	{
		SurfStyle       0.327251
		OceanStyle      0.270233
		Randomize      (-0.647, -0.605, -0.862)
		colorDistMagn   0.351713
		colorDistFreq   1.04946
		detailScale     1505.41
		colorConversion true
		snowLevel       2
		tropicLatitude  0.243767
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.519958
		terraceProb     0.311302
		erosion         0
		montesMagn      0.448505
		montesFreq      2.58337
		montesSpiky     0.8058
		montesFraction  0.801804
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.14113
		hillsFraction   0.748779
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227628
		craterFreq      0.227971
		craterDensity   0.841216
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.422627
		volcanoTemp     1486.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.299, 0.297, 0.296, 0.000)
		colorShelf     (0.318, 0.315, 0.315, 0.000)
		colorBeach     (0.336, 0.334, 0.333, 0.000)
		colorDesert    (0.355, 0.353, 0.352, 0.000)
		colorLowland   (0.374, 0.371, 0.370, 0.000)
		colorUpland    (0.392, 0.390, 0.389, 0.000)
		colorRock      (0.411, 0.408, 0.407, 0.000)
		colorSnow      (0.430, 0.427, 0.426, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.963689
		GasToDust   0.25
		Particles   2926
		GasBright   0.0257991
		DustBright  0.213892
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   12.2243
		Period          45.5217
		Eccentricity    0.947154
		Inclination     144.903
		AscendingNode   160.764
		ArgOfPericenter 64.5519
		MeanAnomaly     -179.104
	}
}

Comet	"C89"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.56674e-015
	Radius          0.157821
	InertiaMoment   0.398278

	Oblateness      0.00264154

	RotationPeriod  94.9439
	Obliquity       108.631
	EqAscendNode    193.181

	AbsMagn         9.56367
	SlopeParam      5.44705
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.662 0.584 0.504)

	Surface
	{
		SurfStyle       0.574917
		OceanStyle      0.577935
		Randomize      (0.708, -0.074, -0.881)
		colorDistMagn   0.137163
		colorDistFreq   8.16412e-006
		detailScale     4.30958
		colorConversion true
		snowLevel       2
		tropicLatitude  0.665955
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.658942
		terraceProb     0.408131
		erosion         0
		montesMagn      0.552607
		montesFreq      2.53469
		montesSpiky     0.969488
		montesFraction  0.692607
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.57801e-005
		hillsFraction   0.654857
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.180916
		craterFreq      0.249009
		craterDensity   0.895422
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.45273
		volcanoTemp     1493.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.258, 0.199, 0.141, 0.000)
		colorShelf     (0.265, 0.205, 0.161, 0.000)
		colorBeach     (0.311, 0.240, 0.191, 0.000)
		colorDesert    (0.338, 0.257, 0.186, 0.000)
		colorLowland   (0.371, 0.275, 0.212, 0.000)
		colorUpland    (0.410, 0.333, 0.257, 0.000)
		colorRock      (0.443, 0.362, 0.277, 0.000)
		colorSnow      (0.483, 0.386, 0.292, 1.000)
		BumpHeight      0.142039
		BumpOffset      0.0284078
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.034131
		GasToDust   0.25
		Particles   1048
		GasBright   0.120706
		DustBright  0.603472
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   15.756
		Period          66.6115
		Eccentricity    0.923196
		Inclination     -112.995
		AscendingNode   176.623
		ArgOfPericenter 114.157
		MeanAnomaly     10.1845
	}
}

Comet	"C90"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.21176e-011
	Radius          3.41384
	InertiaMoment   0.399932

	Oblateness      0.0037865

	RotationPeriod  90.9975
	Obliquity       61.8363
	EqAscendNode    177.758

	AbsMagn         6.06544
	SlopeParam      6.32416
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.410 0.405 0.402)

	Surface
	{
		SurfStyle       0.689349
		OceanStyle      0.0537109
		Randomize      (-0.189, 0.669, 0.867)
		colorDistMagn   0.237904
		colorDistFreq   0.00562656
		detailScale     93.2206
		colorConversion true
		snowLevel       2
		tropicLatitude  0.871729
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.649792
		terraceProb     0.328556
		erosion         0
		montesMagn      0.445495
		montesFreq      3.29988
		montesSpiky     0.916356
		montesFraction  0.791257
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0295047
		hillsFraction   0.666907
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232127
		craterFreq      0.219025
		craterDensity   0.684435
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.493143
		volcanoTemp     1423.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.160, 0.138, 0.113, 0.000)
		colorShelf     (0.164, 0.142, 0.129, 0.000)
		colorBeach     (0.193, 0.166, 0.153, 0.000)
		colorDesert    (0.209, 0.178, 0.149, 0.000)
		colorLowland   (0.230, 0.190, 0.169, 0.000)
		colorUpland    (0.254, 0.231, 0.205, 0.000)
		colorRock      (0.275, 0.251, 0.221, 0.000)
		colorSnow      (0.299, 0.267, 0.233, 1.000)
		BumpHeight      3.07246
		BumpOffset      0.614491
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.515323
		GasToDust   0.25
		Particles   2020
		GasBright   0.0922459
		DustBright  0.316418
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   25.6531
		Period          138.386
		Eccentricity    0.950271
		Inclination     -4.22011
		AscendingNode   -72.7159
		ArgOfPericenter 62.5432
		MeanAnomaly     -75.6105
	}
}

Comet	"C91"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            9.37209e-008
	Radius          61.6759
	InertiaMoment   0.398823

	Oblateness      0.00310871

	RotationPeriod  87.5095
	Obliquity       15.042
	EqAscendNode    162.335

	AbsMagn         15.4659
	SlopeParam      8.61415
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.649 0.587 0.539)

	Surface
	{
		SurfStyle       0.657873
		OceanStyle      0.628206
		Randomize      (-0.245, 0.575, -0.204)
		colorDistMagn   0.910091
		colorDistFreq   2.46792
		detailScale     1684.16
		colorConversion true
		snowLevel       2
		tropicLatitude  0.741936
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.602453
		terraceProb     0.405183
		erosion         0
		montesMagn      0.635386
		montesFreq      3.11772
		montesSpiky     0.798223
		montesFraction  0.419455
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.07762
		hillsFraction   0.789762
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.26379
		craterFreq      0.211805
		craterDensity   1.01786
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.592092
		volcanoTemp     1640.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.253, 0.199, 0.151, 0.000)
		colorShelf     (0.259, 0.205, 0.173, 0.000)
		colorBeach     (0.305, 0.240, 0.205, 0.000)
		colorDesert    (0.331, 0.258, 0.200, 0.000)
		colorLowland   (0.363, 0.276, 0.227, 0.000)
		colorUpland    (0.402, 0.334, 0.275, 0.000)
		colorRock      (0.435, 0.364, 0.297, 0.000)
		colorSnow      (0.473, 0.387, 0.313, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.996515
		GasToDust   0.25
		Particles   2992
		GasBright   0.254343
		DustBright  0.638808
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   17.9413
		Period          80.9402
		Eccentricity    0.964778
		Inclination     -143.925
		AscendingNode   -43.9204
		ArgOfPericenter 119.263
		MeanAnomaly     61.382
	}
}

Comet	"C92"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            2.88574e-015
	Radius          0.211399
	InertiaMoment   0.397047

	Oblateness      0.00434601

	RotationPeriod  84.3577
	Obliquity       328.248
	EqAscendNode    146.913

	AbsMagn         9.34079
	SlopeParam      2.71458
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.554 0.466 0.373)

	Surface
	{
		SurfStyle       0.971863
		OceanStyle      0.463126
		Randomize      (0.713, 0.660, -0.598)
		colorDistMagn   0.601169
		colorDistFreq   1.67227e-005
		detailScale     5.77261
		colorConversion true
		snowLevel       2
		tropicLatitude  0.994747
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.420069
		terraceProb     0.431163
		erosion         0
		montesMagn      0.506794
		montesFreq      3.43411
		montesSpiky     0.848824
		montesFraction  0.722802
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.60581e-005
		hillsFraction   0.435098
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236536
		craterFreq      0.259552
		craterDensity   0.890935
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.427735
		volcanoTemp     1758.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.188, 0.163, 0.149, 0.050)
		colorShelf     (0.221, 0.191, 0.171, 0.040)
		colorBeach     (0.255, 0.219, 0.194, 0.030)
		colorDesert    (0.288, 0.247, 0.220, 0.020)
		colorLowland   (0.321, 0.275, 0.242, 0.030)
		colorUpland    (0.354, 0.303, 0.265, 0.050)
		colorRock      (0.387, 0.331, 0.294, 0.020)
		colorSnow      (0.387, 0.331, 0.294, 1.000)
		BumpHeight      0.190259
		BumpOffset      0.0380519
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.0669568
		GasToDust   0.25
		Particles   1115
		GasBright   0.198601
		DustBright  0.379036
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   18.2037
		Period          82.7224
		Eccentricity    0.93543
		Inclination     60.6347
		AscendingNode   -133.313
		ArgOfPericenter 168.916
		MeanAnomaly     71.7628
	}
}

Comet	"C93"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            2.23191e-011
	Radius          3.82001
	InertiaMoment   0.399292

	Oblateness      0.00358544

	RotationPeriod  81.4625
	Obliquity       281.453
	EqAscendNode    131.49

	AbsMagn         5.82739
	SlopeParam      3.34838
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.573 0.571 0.568)

	Surface
	{
		SurfStyle       0.725134
		OceanStyle      0.161683
		Randomize      (0.589, -0.795, -0.403)
		colorDistMagn   0.741472
		colorDistFreq   0.0110973
		detailScale     104.312
		colorConversion true
		snowLevel       2
		tropicLatitude  0.398979
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.70629
		terraceProb     0.28987
		erosion         0
		montesMagn      0.432817
		montesFreq      2.97362
		montesSpiky     0.886807
		montesFraction  0.612959
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0414278
		hillsFraction   0.354394
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247248
		craterFreq      0.208407
		craterDensity   0.905381
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.405194
		volcanoTemp     1088.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.224, 0.194, 0.159, 0.000)
		colorShelf     (0.229, 0.200, 0.182, 0.000)
		colorBeach     (0.270, 0.234, 0.216, 0.000)
		colorDesert    (0.292, 0.251, 0.210, 0.000)
		colorLowland   (0.321, 0.268, 0.239, 0.000)
		colorUpland    (0.356, 0.326, 0.290, 0.000)
		colorRock      (0.384, 0.354, 0.313, 0.000)
		colorSnow      (0.419, 0.377, 0.330, 1.000)
		BumpHeight      3.438
		BumpOffset      0.687601
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.548149
		GasToDust   0.25
		Particles   2087
		GasBright   0.1056
		DustBright  0.156524
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   18.3834
		Period          83.9501
		Eccentricity    0.932182
		Inclination     -109.884
		AscendingNode   -22.8349
		ArgOfPericenter -67.6348
		MeanAnomaly     -101.613
	}
}

Comet	"C94"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.72622e-007
	Radius          82.5978
	InertiaMoment   0.397956

	Oblateness      0.0049873

	RotationPeriod  78.769
	Obliquity       234.659
	EqAscendNode    116.068

	AbsMagn         14.5107
	SlopeParam      3.92157
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.416 0.412 0.410)

	Surface
	{
		SurfStyle       0.445506
		OceanStyle      0.843125
		Randomize      (-0.306, 0.228, 0.573)
		colorDistMagn   0.99713
		colorDistFreq   2.04436
		detailScale     2255.47
		colorConversion true
		snowLevel       2
		tropicLatitude  0.991584
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.624334
		terraceProb     0.26366
		erosion         0
		montesMagn      0.292344
		montesFreq      3.66387
		montesSpiky     0.85496
		montesFraction  0.394923
		dunesFraction   0
		hillsMagn       0
		hillsFreq       15.3129
		hillsFraction   0.575643
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.205113
		craterFreq      0.276716
		craterDensity   0.849355
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.506379
		volcanoTemp     1715.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.166, 0.165, 0.164, 0.000)
		colorShelf     (0.177, 0.175, 0.174, 0.000)
		colorBeach     (0.187, 0.185, 0.184, 0.000)
		colorDesert    (0.198, 0.196, 0.195, 0.000)
		colorLowland   (0.208, 0.206, 0.205, 0.000)
		colorUpland    (0.218, 0.216, 0.215, 0.000)
		colorRock      (0.229, 0.227, 0.225, 0.000)
		colorSnow      (0.239, 0.237, 0.236, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   1
		GasToDust   0.25
		Particles   3000
		GasBright   0.344864
		DustBright  0.401746
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   21.3388
		Period          104.987
		Eccentricity    0.955567
		Inclination     55.6523
		AscendingNode   -73.0008
		ArgOfPericenter 17.0472
		MeanAnomaly     54.208
	}
}

Comet	"C95"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            5.31518e-015
	Radius          0.236597
	InertiaMoment   0.399724

	Oblateness      0.00409091

	RotationPeriod  76.2376
	Obliquity       187.865
	EqAscendNode    100.645

	AbsMagn         9.12201
	SlopeParam      4.48827
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.650 0.645 0.640)

	Surface
	{
		SurfStyle       0.956661
		OceanStyle      0.731488
		Randomize      (0.469, 0.026, 0.207)
		colorDistMagn   0.453456
		colorDistFreq   2.19528e-005
		detailScale     6.46069
		colorConversion true
		snowLevel       2
		tropicLatitude  0.130024
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.293456
		terraceProb     0.167911
		erosion         0
		montesMagn      0.553365
		montesFreq      2.70642
		montesSpiky     0.987359
		montesFraction  0.470562
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000113244
		hillsFraction   0.599099
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262034
		craterFreq      0.205633
		craterDensity   0.882404
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.503993
		volcanoTemp     1702.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.221, 0.226, 0.256, 0.050)
		colorShelf     (0.260, 0.265, 0.294, 0.040)
		colorBeach     (0.299, 0.303, 0.333, 0.030)
		colorDesert    (0.338, 0.342, 0.378, 0.020)
		colorLowland   (0.377, 0.381, 0.416, 0.030)
		colorUpland    (0.416, 0.419, 0.454, 0.050)
		colorRock      (0.455, 0.458, 0.506, 0.020)
		colorSnow      (0.455, 0.458, 0.506, 1.000)
		BumpHeight      0.212938
		BumpOffset      0.0425875
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.0997828
		GasToDust   0.25
		Particles   1181
		GasBright   0.00903219
		DustBright  0.422065
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   16.9076
		Period          74.0463
		Eccentricity    0.948064
		Inclination     179.58
		AscendingNode   -19.7244
		ArgOfPericenter 37.0174
		MeanAnomaly     -13.4328
	}
}

Comet	"C96"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            4.11091e-011
	Radius          5.11491
	InertiaMoment   0.398567

	Oblateness      0.00567246

	RotationPeriod  73.8388
	Obliquity       141.071
	EqAscendNode    85.2224

	AbsMagn         5.58138
	SlopeParam      5.09809
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.698 0.576 0.483)

	Surface
	{
		SurfStyle       0.412199
		OceanStyle      0.732965
		Randomize      (0.188, 0.869, -0.503)
		colorDistMagn   0.363658
		colorDistFreq   0.00970228
		detailScale     139.671
		colorConversion true
		snowLevel       2
		tropicLatitude  0.535584
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.491431
		terraceProb     0.389499
		erosion         0
		montesMagn      0.517394
		montesFreq      3.79956
		montesSpiky     0.885153
		montesFraction  0.589784
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.052597
		hillsFraction   0.570799
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226786
		craterFreq      0.239133
		craterDensity   0.888437
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.478065
		volcanoTemp     1412.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.279, 0.230, 0.193, 0.000)
		colorShelf     (0.297, 0.245, 0.205, 0.000)
		colorBeach     (0.314, 0.259, 0.217, 0.000)
		colorDesert    (0.331, 0.273, 0.229, 0.000)
		colorLowland   (0.349, 0.288, 0.241, 0.000)
		colorUpland    (0.366, 0.302, 0.253, 0.000)
		colorRock      (0.384, 0.317, 0.266, 0.000)
		colorSnow      (0.401, 0.331, 0.278, 1.000)
		BumpHeight      4.60342
		BumpOffset      0.920684
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.580975
		GasToDust   0.25
		Particles   2153
		GasBright   0.0732438
		DustBright  0.84234
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   21.0381
		Period          102.776
		Eccentricity    0.956492
		Inclination     19.9503
		AscendingNode   58.1163
		ArgOfPericenter 153.342
		MeanAnomaly     46.0539
	}
}

Comet	"C97"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            3.17949e-007
	Radius          92.4598
	InertiaMoment   0.396198

	Oblateness      0.00457292

	RotationPeriod  71.5496
	Obliquity       94.2762
	EqAscendNode    69.7998

	AbsMagn         13.8266
	SlopeParam      5.83523
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.687 0.685 0.681)

	Surface
	{
		SurfStyle       0.0952015
		OceanStyle      0.474864
		Randomize      (0.898, 0.723, 0.774)
		colorDistMagn   0.561326
		colorDistFreq   6.37191
		detailScale     2524.77
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999997
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.718099
		terraceProb     0.209856
		erosion         0
		montesMagn      0.413148
		montesFreq      2.24638
		montesSpiky     0.981142
		montesFraction  0.760677
		dunesFraction   0
		hillsMagn       0
		hillsFreq       22.6262
		hillsFraction   0.604665
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229148
		craterFreq      0.257619
		craterDensity   0.731895
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.492433
		volcanoTemp     1392.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.275, 0.274, 0.272, 0.000)
		colorShelf     (0.292, 0.291, 0.289, 0.000)
		colorBeach     (0.309, 0.308, 0.306, 0.000)
		colorDesert    (0.326, 0.325, 0.323, 0.000)
		colorLowland   (0.343, 0.342, 0.341, 0.000)
		colorUpland    (0.361, 0.359, 0.358, 0.000)
		colorRock      (0.378, 0.377, 0.375, 0.000)
		colorSnow      (0.395, 0.394, 0.392, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   1
		GasToDust   0.25
		Particles   3000
		GasBright   0.0834351
		DustBright  0.516635
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   16.6642
		Period          72.4531
		Eccentricity    0.943374
		Inclination     -145.543
		AscendingNode   -96.5042
		ArgOfPericenter -124.534
		MeanAnomaly     68.0604
	}
}

Comet	"C98"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            9.7899e-015
	Radius          0.316747
	InertiaMoment   0.399067

	Oblateness      0.0064242

	RotationPeriod  69.3519
	Obliquity       47.4819
	EqAscendNode    54.3772

	AbsMagn         8.90653
	SlopeParam      6.9919
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.480 0.414 0.342)

	Surface
	{
		SurfStyle       0.777852
		OceanStyle      0.034415
		Randomize      (0.307, 0.861, -0.287)
		colorDistMagn   0.334685
		colorDistFreq   4.82441e-005
		detailScale     8.6493
		colorConversion true
		snowLevel       2
		tropicLatitude  0.815428
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.448011
		terraceProb     0.524415
		erosion         0
		montesMagn      0.531742
		montesFreq      3.14194
		montesSpiky     0.977858
		montesFraction  0.6165
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000257689
		hillsFraction   0.464002
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228396
		craterFreq      0.246857
		craterDensity   0.880902
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.532609
		volcanoTemp     1169.14
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.187, 0.141, 0.096, 0.000)
		colorShelf     (0.192, 0.145, 0.109, 0.000)
		colorBeach     (0.225, 0.170, 0.130, 0.000)
		colorDesert    (0.245, 0.182, 0.126, 0.000)
		colorLowland   (0.269, 0.195, 0.143, 0.000)
		colorUpland    (0.297, 0.236, 0.174, 0.000)
		colorRock      (0.321, 0.257, 0.188, 0.000)
		colorSnow      (0.350, 0.273, 0.198, 1.000)
		BumpHeight      0.285072
		BumpOffset      0.0570144
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.132609
		GasToDust   0.25
		Particles   1247
		GasBright   0.0563671
		DustBright  0.22819
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   26.8752
		Period          148.392
		Eccentricity    0.96564
		Inclination     -150.594
		AscendingNode   -88.434
		ArgOfPericenter -65.8117
		MeanAnomaly     -94.8426
	}
}

Comet	"C99"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            7.57177e-011
	Radius          5.72656
	InertiaMoment   0.39757

	Oblateness      0.00519379

	RotationPeriod  67.231
	Obliquity       0.687608
	EqAscendNode    38.9546

	AbsMagn         5.32586
	SlopeParam      2.34091
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.585 0.496 0.376)

	Surface
	{
		SurfStyle       0.612048
		OceanStyle      0.368709
		Randomize      (0.453, -0.714, -0.032)
		colorDistMagn   0.801671
		colorDistFreq   0.0233978
		detailScale     156.373
		colorConversion true
		snowLevel       2
		tropicLatitude  0.773184
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.590659
		terraceProb     0.328844
		erosion         0
		montesMagn      0.543539
		montesFreq      3.04946
		montesSpiky     0.993098
		montesFraction  0.422359
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0802808
		hillsFraction   0.750934
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225269
		craterFreq      0.204385
		craterDensity   0.961797
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.498715
		volcanoTemp     1486.53
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.228, 0.169, 0.105, 0.000)
		colorShelf     (0.234, 0.174, 0.120, 0.000)
		colorBeach     (0.275, 0.204, 0.143, 0.000)
		colorDesert    (0.298, 0.218, 0.139, 0.000)
		colorLowland   (0.327, 0.233, 0.158, 0.000)
		colorUpland    (0.363, 0.283, 0.192, 0.000)
		colorRock      (0.392, 0.308, 0.207, 0.000)
		colorSnow      (0.427, 0.328, 0.218, 1.000)
		BumpHeight      5.15391
		BumpOffset      1.03078
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.613801
		GasToDust   0.25
		Particles   2219
		GasBright   0.197746
		DustBright  0.571297
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   13.0857
		Period          50.4172
		Eccentricity    0.92172
		Inclination     129.346
		AscendingNode   88.6137
		ArgOfPericenter 166.855
		MeanAnomaly     138.415
	}
}

Comet	"C100"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            5.85621e-007
	Radius          123.763
	InertiaMoment   0.399514

	Oblateness      0.007266

	RotationPeriod  65.175
	Obliquity       313.893
	EqAscendNode    23.532

	AbsMagn         13.2801
	SlopeParam      3.03922
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.531 0.526 0.517)

	Surface
	{
		SurfStyle       0.610216
		OceanStyle      0.915149
		Randomize      (-0.566, -0.715, -0.621)
		colorDistMagn   0.725657
		colorDistFreq   4.77655
		detailScale     3379.55
		colorConversion true
		snowLevel       2
		tropicLatitude  0.953029
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.431422
		terraceProb     0.36359
		erosion         0
		montesMagn      0.595266
		montesFreq      3.43873
		montesSpiky     0.931004
		montesFraction  0.747825
		dunesFraction   0
		hillsMagn       0
		hillsFreq       46.5375
		hillsFraction   0.650945
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.277389
		craterFreq      0.460773
		craterDensity   0.824056
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.571375
		volcanoTemp     1440.82
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.207, 0.179, 0.145, 0.000)
		colorShelf     (0.212, 0.184, 0.165, 0.000)
		colorBeach     (0.250, 0.216, 0.196, 0.000)
		colorDesert    (0.271, 0.231, 0.191, 0.000)
		colorLowland   (0.297, 0.247, 0.217, 0.000)
		colorUpland    (0.329, 0.300, 0.264, 0.000)
		colorRock      (0.356, 0.326, 0.284, 0.000)
		colorSnow      (0.388, 0.347, 0.300, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   1
		GasToDust   0.25
		Particles   3000
		GasBright   0.143396
		DustBright  0.310134
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   18.2992
		Period          83.3742
		Eccentricity    0.949634
		Inclination     112.987
		AscendingNode   92.7755
		ArgOfPericenter 125.412
		MeanAnomaly     -154.206
	}
}

Comet	"C101"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.80317e-014
	Radius          0.354676
	InertiaMoment   0.398286

	Oblateness      0.00588429

	RotationPeriod  63.1735
	Obliquity       267.099
	EqAscendNode    8.10945

	AbsMagn         8.69366
	SlopeParam      3.63478
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.523 0.515 0.511)

	Surface
	{
		SurfStyle       0.143942
		OceanStyle      0.845793
		Randomize      (-0.013, -0.457, -0.954)
		colorDistMagn   0.0389287
		colorDistFreq   4.98874e-005
		detailScale     9.68503
		colorConversion true
		snowLevel       2
		tropicLatitude  0.354031
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.302175
		terraceProb     0.431667
		erosion         0
		montesMagn      0.54319
		montesFreq      2.4269
		montesSpiky     0.957008
		montesFraction  0.60061
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000315734
		hillsFraction   0.679918
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250678
		craterFreq      0.272736
		craterDensity   0.917284
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.583216
		volcanoTemp     1498.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.209, 0.206, 0.205, 0.000)
		colorShelf     (0.222, 0.219, 0.217, 0.000)
		colorBeach     (0.236, 0.232, 0.230, 0.000)
		colorDesert    (0.249, 0.244, 0.243, 0.000)
		colorLowland   (0.262, 0.257, 0.256, 0.000)
		colorUpland    (0.275, 0.270, 0.268, 0.000)
		colorRock      (0.288, 0.283, 0.281, 0.000)
		colorSnow      (0.301, 0.296, 0.294, 1.000)
		BumpHeight      0.319209
		BumpOffset      0.0638417
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.165435
		GasToDust   0.25
		Particles   1314
		GasBright   0.351966
		DustBright  0.586051
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   23.4801
		Period          121.18
		Eccentricity    0.955768
		Inclination     91.0366
		AscendingNode   159.637
		ArgOfPericenter -152.072
		MeanAnomaly     -84.269
	}
}

Comet	"C102"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.39462e-010
	Radius          7.66429
	InertiaMoment   0.399937

	Oblateness      0.00822614

	RotationPeriod  61.2178
	Obliquity       220.305
	EqAscendNode    352.687

	AbsMagn         5.05892
	SlopeParam      4.199
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.599 0.595 0.587)

	Surface
	{
		SurfStyle       0.598906
		OceanStyle      0.0576085
		Randomize      (0.229, -0.476, -0.649)
		colorDistMagn   0.207931
		colorDistFreq   0.0357558
		detailScale     209.286
		colorConversion true
		snowLevel       2
		tropicLatitude  0.702491
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.52443
		terraceProb     0.488172
		erosion         0
		montesMagn      0.483548
		montesFreq      3.31905
		montesSpiky     0.888635
		montesFraction  0.31342
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.120001
		hillsFraction   0.71242
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256459
		craterFreq      0.255762
		craterDensity   0.874999
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.625702
		volcanoTemp     1252.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.234, 0.202, 0.164, 0.000)
		colorShelf     (0.240, 0.208, 0.188, 0.000)
		colorBeach     (0.281, 0.244, 0.223, 0.000)
		colorDesert    (0.305, 0.262, 0.217, 0.000)
		colorLowland   (0.335, 0.279, 0.246, 0.000)
		colorUpland    (0.371, 0.339, 0.299, 0.000)
		colorRock      (0.401, 0.369, 0.323, 0.000)
		colorSnow      (0.437, 0.392, 0.340, 1.000)
		BumpHeight      6.89786
		BumpOffset      1.37957
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.646627
		GasToDust   0.25
		Particles   2286
		GasBright   0.270333
		DustBright  0.35217
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   12.1346
		Period          45.0213
		Eccentricity    0.939509
		Inclination     -168.426
		AscendingNode   -74.1638
		ArgOfPericenter 124.226
		MeanAnomaly     -35.9524
	}
}

Comet	"C103"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            4.29416e-018
	Radius          0.0219668
	InertiaMoment   0.398829

	Oblateness      0.00667573

	RotationPeriod  59.3005
	Obliquity       173.51
	EqAscendNode    337.264

	AbsMagn         12.8175
	SlopeParam      4.77986
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.773 0.715 0.600)

	Surface
	{
		SurfStyle       0.330621
		OceanStyle      0.392859
		Randomize      (0.137, -0.770, 0.463)
		colorDistMagn   0.0376636
		colorDistFreq   1.59781e-007
		detailScale     0.599841
		colorConversion true
		snowLevel       2
		tropicLatitude  0.966104
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.419126
		terraceProb     0.48138
		erosion         0
		montesMagn      0.42338
		montesFreq      3.5263
		montesSpiky     0.915128
		montesFraction  0.245681
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.19047e-006
		hillsFraction   0.726641
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247014
		craterFreq      0.249885
		craterDensity   0.856195
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.392024
		volcanoTemp     1494.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.309, 0.286, 0.240, 0.000)
		colorShelf     (0.328, 0.304, 0.255, 0.000)
		colorBeach     (0.348, 0.322, 0.270, 0.000)
		colorDesert    (0.367, 0.340, 0.285, 0.000)
		colorLowland   (0.386, 0.357, 0.300, 0.000)
		colorUpland    (0.406, 0.375, 0.315, 0.000)
		colorRock      (0.425, 0.393, 0.330, 0.000)
		colorSnow      (0.444, 0.411, 0.345, 1.000)
		BumpHeight      0.0197702
		BumpOffset      0.00395403
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.151442
		DustBright  0.155547
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   18.6859
		Period          86.0304
		Eccentricity    0.973789
		Inclination     -111.414
		AscendingNode   173.807
		ArgOfPericenter -123.768
		MeanAnomaly     42.2999
	}
}

Comet	"C104"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            3.32122e-014
	Radius          0.474633
	InertiaMoment   0.397062

	Oblateness      0.0092266

	RotationPeriod  57.4147
	Obliquity       126.716
	EqAscendNode    321.842

	AbsMagn         8.48273
	SlopeParam      5.43704
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.648 0.644 0.643)

	Surface
	{
		SurfStyle       0.917722
		OceanStyle      0.942432
		Randomize      (0.065, -0.309, -0.285)
		colorDistMagn   0.525645
		colorDistFreq   7.68991e-005
		detailScale     12.9606
		colorConversion true
		snowLevel       2
		tropicLatitude  0.275145
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.617065
		terraceProb     0.478402
		erosion         0
		montesMagn      0.610035
		montesFreq      2.79366
		montesSpiky     0.998178
		montesFraction  0.800899
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000487719
		hillsFraction   0.525339
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263189
		craterFreq      0.183185
		craterDensity   0.744112
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.498965
		volcanoTemp     1556.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.220, 0.225, 0.257, 0.050)
		colorShelf     (0.259, 0.264, 0.296, 0.040)
		colorBeach     (0.298, 0.303, 0.334, 0.030)
		colorDesert    (0.337, 0.341, 0.379, 0.020)
		colorLowland   (0.376, 0.380, 0.418, 0.030)
		colorUpland    (0.414, 0.419, 0.456, 0.050)
		colorRock      (0.453, 0.457, 0.508, 0.020)
		colorSnow      (0.453, 0.457, 0.508, 1.000)
		BumpHeight      0.42717
		BumpOffset      0.0854339
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.198261
		GasToDust   0.25
		Particles   1380
		GasBright   0.0414408
		DustBright  0.750035
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   16.7151
		Period          72.7857
		Eccentricity    0.945383
		Inclination     -140.704
		AscendingNode   10.7699
		ArgOfPericenter -116.314
		MeanAnomaly     55.7026
	}
}

Comet	"C105"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            2.56872e-010
	Radius          8.5842
	InertiaMoment   0.399297

	Oblateness      0.00760149

	RotationPeriod  55.5544
	Obliquity       79.9218
	EqAscendNode    306.419

	AbsMagn         4.77819
	SlopeParam      6.30906
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.467 0.461 0.454)

	Surface
	{
		SurfStyle       0.792886
		OceanStyle      0.186393
		Randomize      (-0.165, 0.672, -0.962)
		colorDistMagn   0.891542
		colorDistFreq   0.0433792
		detailScale     234.406
		colorConversion true
		snowLevel       2
		tropicLatitude  0.981757
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.424099
		terraceProb     0.156913
		erosion         0
		montesMagn      0.544544
		montesFreq      2.85042
		montesSpiky     0.988582
		montesFraction  0.840966
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.171459
		hillsFraction   0.664873
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245375
		craterFreq      0.24117
		craterDensity   0.777575
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.509975
		volcanoTemp     1297.82
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.182, 0.157, 0.127, 0.000)
		colorShelf     (0.187, 0.161, 0.145, 0.000)
		colorBeach     (0.219, 0.189, 0.173, 0.000)
		colorDesert    (0.238, 0.203, 0.168, 0.000)
		colorLowland   (0.261, 0.217, 0.191, 0.000)
		colorUpland    (0.290, 0.263, 0.232, 0.000)
		colorRock      (0.313, 0.286, 0.250, 0.000)
		colorSnow      (0.341, 0.305, 0.264, 1.000)
		BumpHeight      7.72578
		BumpOffset      1.54516
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.679452
		GasToDust   0.25
		Particles   2352
		GasBright   0.0530242
		DustBright  0.422939
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   17.0341
		Period          74.8792
		Eccentricity    0.948082
		Inclination     165.899
		AscendingNode   85.1167
		ArgOfPericenter -144.179
		MeanAnomaly     -21.2541
	}
}

Comet	"C106"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            7.90931e-018
	Radius          0.0293932
	InertiaMoment   0.397965

	Oblateness      0.010549

	RotationPeriod  53.714
	Obliquity       33.1275
	EqAscendNode    290.996

	AbsMagn         12.4117
	SlopeParam      8.51014
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.452 0.449 0.446)

	Surface
	{
		SurfStyle       0.330211
		OceanStyle      0.78619
		Randomize      (0.794, -0.733, -0.411)
		colorDistMagn   0.553679
		colorDistFreq   2.07638e-007
		detailScale     0.802632
		colorConversion true
		snowLevel       2
		tropicLatitude  0.696966
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.727188
		terraceProb     0.47222
		erosion         0
		montesMagn      0.349475
		montesFreq      4.05658
		montesSpiky     0.952192
		montesFraction  0.459529
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.10209e-006
		hillsFraction   0.423777
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.284397
		craterFreq      0.209004
		craterDensity   0.90323
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.479057
		volcanoTemp     1590.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.181, 0.180, 0.178, 0.000)
		colorShelf     (0.192, 0.191, 0.189, 0.000)
		colorBeach     (0.204, 0.202, 0.201, 0.000)
		colorDesert    (0.215, 0.213, 0.212, 0.000)
		colorLowland   (0.226, 0.225, 0.223, 0.000)
		colorUpland    (0.238, 0.236, 0.234, 0.000)
		colorRock      (0.249, 0.247, 0.245, 0.000)
		colorSnow      (0.260, 0.258, 0.256, 1.000)
		BumpHeight      0.0264539
		BumpOffset      0.00529078
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.163708
		DustBright  0.796741
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   9.97355
		Period          33.5472
		Eccentricity    0.918652
		Inclination     -12.6487
		AscendingNode   -146.706
		ArgOfPericenter 59.6453
		MeanAnomaly     86.6335
	}
}

Comet	"C107"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            6.11727e-014
	Radius          0.531655
	InertiaMoment   0.399729

	Oblateness      0.00870652

	RotationPeriod  51.8885
	Obliquity       346.333
	EqAscendNode    275.574

	AbsMagn         8.27314
	SlopeParam      2.70508
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.481 0.474 0.471)

	Surface
	{
		SurfStyle       0.702973
		OceanStyle      0.576747
		Randomize      (-0.424, -0.484, -0.831)
		colorDistMagn   0.75573
		colorDistFreq   0.000220374
		detailScale     14.5177
		colorConversion true
		snowLevel       2
		tropicLatitude  0.917733
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.327803
		terraceProb     0.383134
		erosion         0
		montesMagn      0.65719
		montesFreq      2.84779
		montesSpiky     0.958333
		montesFraction  0.64354
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000709226
		hillsFraction   0.606511
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.201789
		craterFreq      0.151141
		craterDensity   0.840934
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.413432
		volcanoTemp     1567.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.188, 0.161, 0.132, 0.000)
		colorShelf     (0.192, 0.166, 0.151, 0.000)
		colorBeach     (0.226, 0.194, 0.179, 0.000)
		colorDesert    (0.245, 0.209, 0.174, 0.000)
		colorLowland   (0.269, 0.223, 0.198, 0.000)
		colorUpland    (0.298, 0.270, 0.240, 0.000)
		colorRock      (0.322, 0.294, 0.259, 0.000)
		colorSnow      (0.351, 0.313, 0.273, 1.000)
		BumpHeight      0.478489
		BumpOffset      0.0956978
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.231086
		GasToDust   0.25
		Particles   1446
		GasBright   0.148009
		DustBright  0.496927
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   12.8678
		Period          49.1633
		Eccentricity    0.967881
		Inclination     -103.196
		AscendingNode   40.3255
		ArgOfPericenter 85.4571
		MeanAnomaly     150.666
	}
}

Comet	"C108"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            4.73127e-010
	Radius          11.4853
	InertiaMoment   0.398574

	Oblateness      0.0121342

	RotationPeriod  50.073
	Obliquity       299.539
	EqAscendNode    260.151

	AbsMagn         4.48061
	SlopeParam      3.34023
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.643 0.515 0.461)

	Surface
	{
		SurfStyle       0.290547
		OceanStyle      0.0979153
		Randomize      (0.110, -0.483, 0.015)
		colorDistMagn   0.296146
		colorDistFreq   0.0297682
		detailScale     313.624
		colorConversion true
		snowLevel       2
		tropicLatitude  0.832099
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.439583
		terraceProb     0.137036
		erosion         0
		montesMagn      0.51853
		montesFreq      2.95799
		montesSpiky     0.908548
		montesFraction  0.394922
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.26872
		hillsFraction   0.555959
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264715
		craterFreq      0.277094
		craterDensity   0.860513
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.488747
		volcanoTemp     1487.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.257, 0.206, 0.184, 0.000)
		colorShelf     (0.273, 0.219, 0.196, 0.000)
		colorBeach     (0.289, 0.232, 0.207, 0.000)
		colorDesert    (0.306, 0.245, 0.219, 0.000)
		colorLowland   (0.322, 0.258, 0.231, 0.000)
		colorUpland    (0.338, 0.271, 0.242, 0.000)
		colorRock      (0.354, 0.283, 0.254, 0.000)
		colorSnow      (0.370, 0.296, 0.265, 1.000)
		BumpHeight      10.3367
		BumpOffset      2.06735
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.712278
		GasToDust   0.25
		Particles   2418
		GasBright   0.0950515
		DustBright  0.234371
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   18.1698
		Period          82.4915
		Eccentricity    0.934302
		Inclination     -149.658
		AscendingNode   -72.9121
		ArgOfPericenter 20.2026
		MeanAnomaly     -124.305
	}
}

Comet	"C109"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.45679e-017
	Radius          0.0329273
	InertiaMoment   0.39623

	Oblateness      0.00990841

	RotationPeriod  48.2627
	Obliquity       252.745
	EqAscendNode    244.729

	AbsMagn         12.0468
	SlopeParam      3.91385
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.680 0.640 0.595)

	Surface
	{
		SurfStyle       0.774972
		OceanStyle      0.618961
		Randomize      (-0.650, -0.513, -0.258)
		colorDistMagn   0.673792
		colorDistFreq   4.44716e-007
		detailScale     0.899134
		colorConversion true
		snowLevel       2
		tropicLatitude  0.960137
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.349969
		terraceProb     0.31613
		erosion         0
		montesMagn      0.529434
		montesFreq      3.20191
		montesSpiky     0.95167
		montesFraction  0.373818
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.41653e-006
		hillsFraction   0.799354
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.289635
		craterFreq      0.150017
		craterDensity   0.936257
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.488997
		volcanoTemp     1045.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.265, 0.218, 0.167, 0.000)
		colorShelf     (0.272, 0.224, 0.191, 0.000)
		colorBeach     (0.319, 0.262, 0.226, 0.000)
		colorDesert    (0.347, 0.282, 0.220, 0.000)
		colorLowland   (0.381, 0.301, 0.250, 0.000)
		colorUpland    (0.421, 0.365, 0.304, 0.000)
		colorRock      (0.455, 0.397, 0.327, 0.000)
		colorSnow      (0.496, 0.422, 0.345, 1.000)
		BumpHeight      0.0296346
		BumpOffset      0.00592691
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.282903
		DustBright  0.531006
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   20.4594
		Period          98.5651
		Eccentricity    0.946706
		Inclination     -177.37
		AscendingNode   67.4735
		ArgOfPericenter 29.3162
		MeanAnomaly     67.7719
	}
}

Comet	"C110"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.12672e-013
	Radius          0.711274
	InertiaMoment   0.399073

	Oblateness      0.0140881

	RotationPeriod  46.453
	Obliquity       205.95
	EqAscendNode    229.306

	AbsMagn         8.06429
	SlopeParam      4.48032
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.790 0.730 0.677)

	Surface
	{
		SurfStyle       0.585742
		OceanStyle      0.640186
		Randomize      (-0.082, -0.298, 0.582)
		colorDistMagn   0.661679
		colorDistFreq   0.000225069
		detailScale     19.4225
		colorConversion true
		snowLevel       2
		tropicLatitude  0.561234
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.659063
		terraceProb     0.60528
		erosion         0
		montesMagn      0.480564
		montesFreq      2.71632
		montesSpiky     0.921677
		montesFraction  0.603775
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000885451
		hillsFraction   0.710222
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226182
		craterFreq      0.173524
		craterDensity   0.769888
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.476775
		volcanoTemp     1595.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.308, 0.248, 0.190, 0.000)
		colorShelf     (0.316, 0.255, 0.217, 0.000)
		colorBeach     (0.371, 0.299, 0.257, 0.000)
		colorDesert    (0.403, 0.321, 0.250, 0.000)
		colorLowland   (0.442, 0.343, 0.284, 0.000)
		colorUpland    (0.490, 0.416, 0.345, 0.000)
		colorRock      (0.529, 0.452, 0.372, 0.000)
		colorSnow      (0.577, 0.482, 0.393, 1.000)
		BumpHeight      0.640147
		BumpOffset      0.128029
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.263912
		GasToDust   0.25
		Particles   1512
		GasBright   0.202663
		DustBright  0.295733
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   11.4202
		Period          41.1046
		Eccentricity    0.874433
		Inclination     35.0979
		AscendingNode   -111.443
		ArgOfPericenter -162.34
		MeanAnomaly     150.115
	}
}

Comet	"C111"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            8.7144e-010
	Radius          12.8671
	InertiaMoment   0.397581

	Oblateness      0.0116123

	RotationPeriod  44.6395
	Obliquity       159.156
	EqAscendNode    213.884

	AbsMagn         4.16214
	SlopeParam      5.08913
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.603 0.597 0.592)

	Surface
	{
		SurfStyle       0.605621
		OceanStyle      0.681667
		Randomize      (-0.126, 0.044, 0.765)
		colorDistMagn   0.424697
		colorDistFreq   0.111087
		detailScale     351.356
		colorConversion true
		snowLevel       2
		tropicLatitude  0.397204
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.564563
		terraceProb     0.221423
		erosion         0
		montesMagn      0.40178
		montesFreq      3.55507
		montesSpiky     0.984458
		montesFraction  0.531637
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.315215
		hillsFraction   0.529518
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.266966
		craterFreq      0.262164
		craterDensity   1.04011
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.473761
		volcanoTemp     1529.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.235, 0.203, 0.166, 0.000)
		colorShelf     (0.241, 0.209, 0.189, 0.000)
		colorBeach     (0.283, 0.245, 0.225, 0.000)
		colorDesert    (0.308, 0.263, 0.219, 0.000)
		colorLowland   (0.338, 0.281, 0.248, 0.000)
		colorUpland    (0.374, 0.340, 0.302, 0.000)
		colorRock      (0.404, 0.370, 0.325, 0.000)
		colorSnow      (0.440, 0.394, 0.343, 1.000)
		BumpHeight      11.5803
		BumpOffset      2.31607
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.745104
		GasToDust   0.25
		Particles   2485
		GasBright   0.457704
		DustBright  0.525178
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   17.9124
		Period          80.7448
		Eccentricity    0.949381
		Inclination     -27.7101
		AscendingNode   -123.101
		ArgOfPericenter 50.1896
		MeanAnomaly     -24.4714
	}
}

Comet	"C112"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            2.68323e-017
	Radius          0.0440491
	InertiaMoment   0.399519

	Oblateness      0.0165664

	RotationPeriod  42.8174
	Obliquity       112.362
	EqAscendNode    198.461

	AbsMagn         11.7129
	SlopeParam      5.82351
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.700 0.668 0.625)

	Surface
	{
		SurfStyle       0.554476
		OceanStyle      0.440887
		Randomize      (0.033, 0.315, -0.839)
		colorDistMagn   0.280985
		colorDistFreq   9.86018e-007
		detailScale     1.20284
		colorConversion true
		snowLevel       2
		tropicLatitude  0.726119
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.420511
		terraceProb     0.107603
		erosion         0
		montesMagn      0.430741
		montesFreq      3.11489
		montesSpiky     0.948851
		montesFraction  0.480564
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.51881e-006
		hillsFraction   0.588734
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227105
		craterFreq      0.267315
		craterDensity   0.79805
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.435192
		volcanoTemp     1955.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.273, 0.227, 0.175, 0.000)
		colorShelf     (0.280, 0.234, 0.200, 0.000)
		colorBeach     (0.329, 0.274, 0.237, 0.000)
		colorDesert    (0.357, 0.294, 0.231, 0.000)
		colorLowland   (0.392, 0.314, 0.262, 0.000)
		colorUpland    (0.434, 0.381, 0.319, 0.000)
		colorRock      (0.469, 0.414, 0.344, 0.000)
		colorSnow      (0.511, 0.441, 0.362, 1.000)
		BumpHeight      0.0396442
		BumpOffset      0.00792884
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.016498
		DustBright  0.650871
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   19.6366
		Period          92.6787
		Eccentricity    0.968359
		Inclination     152.006
		AscendingNode   144.101
		ArgOfPericenter 142.974
		MeanAnomaly     -66.6174
	}
}

Comet	"C113"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            2.07529e-013
	Radius          0.796891
	InertiaMoment   0.398293

	Oblateness      0.0137801

	RotationPeriod  40.9818
	Obliquity       65.5674
	EqAscendNode    183.038

	AbsMagn         7.85562
	SlopeParam      6.96848
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.752 0.749 0.746)

	Surface
	{
		SurfStyle       0.687337
		OceanStyle      0.756264
		Randomize      (-0.175, -0.897, 0.065)
		colorDistMagn   0.850448
		colorDistFreq   0.000401249
		detailScale     21.7604
		colorConversion true
		snowLevel       2
		tropicLatitude  0.623101
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.664063
		terraceProb     0.52125
		erosion         0
		montesMagn      0.324601
		montesFreq      3.06751
		montesSpiky     0.852841
		montesFraction  0.352677
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00162434
		hillsFraction   0.571899
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253175
		craterFreq      0.236974
		craterDensity   0.845289
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.436817
		volcanoTemp     1177.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.293, 0.255, 0.209, 0.000)
		colorShelf     (0.301, 0.262, 0.239, 0.000)
		colorBeach     (0.353, 0.307, 0.284, 0.000)
		colorDesert    (0.383, 0.330, 0.276, 0.000)
		colorLowland   (0.421, 0.352, 0.313, 0.000)
		colorUpland    (0.466, 0.427, 0.381, 0.000)
		colorRock      (0.504, 0.464, 0.410, 0.000)
		colorSnow      (0.549, 0.494, 0.433, 1.000)
		BumpHeight      0.717202
		BumpOffset      0.14344
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.296738
		GasToDust   0.25
		Particles   1579
		GasBright   0.0294736
		DustBright  0.322382
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   14.2558
		Period          57.3286
		Eccentricity    0.920045
		Inclination     -95.1473
		AscendingNode   -145.248
		ArgOfPericenter -74.8128
		MeanAnomaly     -80.7033
	}
}

Comet	"C114"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.60508e-009
	Radius          17.2124
	InertiaMoment   0.399942

	Oblateness      0.0198177

	RotationPeriod  39.1279
	Obliquity       18.7731
	EqAscendNode    167.616

	AbsMagn         3.81728
	SlopeParam      2.33001
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.675 0.540 0.465)

	Surface
	{
		SurfStyle       0.414887
		OceanStyle      0.46367
		Randomize      (-0.552, 0.198, 0.021)
		colorDistMagn   0.0456762
		colorDistFreq   0.169605
		detailScale     470.012
		colorConversion true
		snowLevel       2
		tropicLatitude  0.312034
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.556043
		terraceProb     0.180529
		erosion         0
		montesMagn      0.579864
		montesFreq      2.23969
		montesSpiky     0.964713
		montesFraction  0.557135
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.806457
		hillsFraction   0.549089
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.285272
		craterFreq      0.201566
		craterDensity   0.711802
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.504309
		volcanoTemp     1739.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.270, 0.216, 0.186, 0.000)
		colorShelf     (0.287, 0.230, 0.198, 0.000)
		colorBeach     (0.304, 0.243, 0.209, 0.000)
		colorDesert    (0.321, 0.257, 0.221, 0.000)
		colorLowland   (0.337, 0.270, 0.232, 0.000)
		colorUpland    (0.354, 0.284, 0.244, 0.000)
		colorRock      (0.371, 0.297, 0.256, 0.000)
		colorSnow      (0.388, 0.311, 0.267, 1.000)
		BumpHeight      15.4911
		BumpOffset      3.09823
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.77793
		GasToDust   0.25
		Particles   2551
		GasBright   0.119439
		DustBright  0.716903
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   20.7051
		Period          100.346
		Eccentricity    0.979396
		Inclination     -11.162
		AscendingNode   -70.1244
		ArgOfPericenter -157.292
		MeanAnomaly     -14.361
	}
}

Comet	"C115"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            4.94216e-017
	Radius          0.0493531
	InertiaMoment   0.398836

	Oblateness      0.0166714

	RotationPeriod  37.2501
	Obliquity       331.979
	EqAscendNode    152.193

	AbsMagn         11.403
	SlopeParam      3.03055
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.596 0.593 0.591)

	Surface
	{
		SurfStyle       0.158585
		OceanStyle      0.249692
		Randomize      (0.645, -0.058, -0.833)
		colorDistMagn   0.760551
		colorDistFreq   1.46427e-006
		detailScale     1.34767
		colorConversion true
		snowLevel       2
		tropicLatitude  0.457146
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.548794
		terraceProb     0.271538
		erosion         0
		montesMagn      0.422317
		montesFreq      3.09568
		montesSpiky     0.957388
		montesFraction  0.425042
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.82326e-006
		hillsFraction   0.535363
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243285
		craterFreq      0.279209
		craterDensity   0.857257
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.520225
		volcanoTemp     1309.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.238, 0.237, 0.236, 0.000)
		colorShelf     (0.253, 0.252, 0.251, 0.000)
		colorBeach     (0.268, 0.267, 0.266, 0.000)
		colorDesert    (0.283, 0.281, 0.280, 0.000)
		colorLowland   (0.298, 0.296, 0.295, 0.000)
		colorUpland    (0.313, 0.311, 0.310, 0.000)
		colorRock      (0.328, 0.326, 0.325, 0.000)
		colorSnow      (0.342, 0.341, 0.340, 1.000)
		BumpHeight      0.0444178
		BumpOffset      0.00888356
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.105133
		DustBright  0.415696
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   15.6242
		Period          65.7776
		Eccentricity    0.935796
		Inclination     -125.375
		AscendingNode   9.01284
		ArgOfPericenter -96.0589
		MeanAnomaly     -179.028
	}
}

Comet	"C116"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            3.82241e-013
	Radius          1.06598
	InertiaMoment   0.397078

	Oblateness      0.0239688

	RotationPeriod  35.3425
	Obliquity       285.185
	EqAscendNode    136.771

	AbsMagn         7.64656
	SlopeParam      3.62693
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.807 0.767 0.689)

	Surface
	{
		SurfStyle       0.551059
		OceanStyle      0.171142
		Randomize      (-0.647, 0.964, 0.604)
		colorDistMagn   0.661785
		colorDistFreq   0.000417217
		detailScale     29.1082
		colorConversion true
		snowLevel       2
		tropicLatitude  0.669243
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.392492
		terraceProb     0.422234
		erosion         0
		montesMagn      0.575339
		montesFreq      3.87629
		montesSpiky     0.997291
		montesFraction  0.432715
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00377962
		hillsFraction   0.720558
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.266735
		craterFreq      0.245748
		craterDensity   0.929896
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.520997
		volcanoTemp     1694.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.315, 0.261, 0.193, 0.000)
		colorShelf     (0.323, 0.268, 0.220, 0.000)
		colorBeach     (0.379, 0.314, 0.262, 0.000)
		colorDesert    (0.412, 0.337, 0.255, 0.000)
		colorLowland   (0.452, 0.360, 0.289, 0.000)
		colorUpland    (0.501, 0.437, 0.351, 0.000)
		colorRock      (0.541, 0.475, 0.379, 0.000)
		colorSnow      (0.589, 0.506, 0.399, 1.000)
		BumpHeight      0.959378
		BumpOffset      0.191876
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.329564
		GasToDust   0.25
		Particles   1645
		GasBright   0.0535671
		DustBright  0.151748
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   11.8781
		Period          43.6016
		Eccentricity    0.925357
		Inclination     147.08
		AscendingNode   -175.937
		ArgOfPericenter -21.5106
		MeanAnomaly     56.5701
	}
}

Comet	"C117"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            2.95636e-009
	Radius          19.2853
	InertiaMoment   0.399303

	Oblateness      0.0207216

	RotationPeriod  33.3988
	Obliquity       238.39
	EqAscendNode    121.348

	AbsMagn         3.43813
	SlopeParam      4.19124
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.455 0.448 0.444)

	Surface
	{
		SurfStyle       0.0138411
		OceanStyle      0.088069
		Randomize      (0.956, -0.014, 0.456)
		colorDistMagn   0.251469
		colorDistFreq   0.307788
		detailScale     526.618
		colorConversion true
		snowLevel       2
		tropicLatitude  0.819154
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.595947
		terraceProb     0.219344
		erosion         0
		montesMagn      0.451002
		montesFreq      3.58205
		montesSpiky     0.800281
		montesFraction  0.567228
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.739193
		hillsFraction   0.683956
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227835
		craterFreq      0.221193
		craterDensity   0.772568
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.516191
		volcanoTemp     1486.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.182, 0.179, 0.177, 0.000)
		colorShelf     (0.193, 0.190, 0.189, 0.000)
		colorBeach     (0.205, 0.202, 0.200, 0.000)
		colorDesert    (0.216, 0.213, 0.211, 0.000)
		colorLowland   (0.227, 0.224, 0.222, 0.000)
		colorUpland    (0.239, 0.235, 0.233, 0.000)
		colorRock      (0.250, 0.246, 0.244, 0.000)
		colorSnow      (0.262, 0.258, 0.255, 1.000)
		BumpHeight      17.3568
		BumpOffset      3.47136
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.810756
		GasToDust   0.25
		Particles   2617
		GasBright   0.2207
		DustBright  0.469101
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   22.1325
		Period          110.899
		Eccentricity    0.965124
		Inclination     38.7295
		AscendingNode   108.005
		ArgOfPericenter -10.6916
		MeanAnomaly     -151.872
	}
}

Comet	"C118"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            9.10285e-017
	Radius          0.0660172
	InertiaMoment   0.397974

	Oblateness      0.0303678

	RotationPeriod  31.4114
	Obliquity       191.596
	EqAscendNode    105.925

	AbsMagn         11.1123
	SlopeParam      4.77154
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.785 0.686 0.620)

	Surface
	{
		SurfStyle       0.0581243
		OceanStyle      0.567302
		Randomize      (0.305, -0.534, 0.625)
		colorDistMagn   0.327261
		colorDistFreq   3.03391e-006
		detailScale     1.80271
		colorConversion true
		snowLevel       2
		tropicLatitude  0.209312
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.492245
		terraceProb     0.446468
		erosion         0
		montesMagn      0.477247
		montesFreq      3.03535
		montesSpiky     0.959162
		montesFraction  0.768499
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.20591e-005
		hillsFraction   0.525917
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213022
		craterFreq      0.166363
		craterDensity   0.764832
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50911
		volcanoTemp     1099.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.314, 0.274, 0.248, 0.000)
		colorShelf     (0.334, 0.291, 0.264, 0.000)
		colorBeach     (0.353, 0.309, 0.279, 0.000)
		colorDesert    (0.373, 0.326, 0.295, 0.000)
		colorLowland   (0.392, 0.343, 0.310, 0.000)
		colorUpland    (0.412, 0.360, 0.326, 0.000)
		colorRock      (0.432, 0.377, 0.341, 0.000)
		colorSnow      (0.451, 0.394, 0.357, 1.000)
		BumpHeight      0.0594155
		BumpOffset      0.0118831
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.141852
		DustBright  0.232436
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   19.0809
		Period          88.7732
		Eccentricity    0.944987
		Inclination     0.759764
		AscendingNode   51.6322
		ArgOfPericenter 48.9564
		MeanAnomaly     30.7952
	}
}

Comet	"C119"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            7.0404e-013
	Radius          1.19436
	InertiaMoment   0.399735

	Oblateness      0.026767

	RotationPeriod  29.3722
	Obliquity       144.802
	EqAscendNode    90.5028

	AbsMagn         7.43653
	SlopeParam      5.42707
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.570 0.476 0.431)

	Surface
	{
		SurfStyle       0.129258
		OceanStyle      0.69773
		Randomize      (0.181, 0.621, -0.597)
		colorDistMagn   0.495484
		colorDistFreq   0.00102885
		detailScale     32.614
		colorConversion true
		snowLevel       2
		tropicLatitude  0.70443
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.580736
		terraceProb     0.148299
		erosion         0
		montesMagn      0.589956
		montesFreq      3.95317
		montesSpiky     0.976751
		montesFraction  0.260068
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00365089
		hillsFraction   0.694599
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236212
		craterFreq      0.24555
		craterDensity   0.771473
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.541845
		volcanoTemp     1733.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.228, 0.191, 0.172, 0.000)
		colorShelf     (0.242, 0.202, 0.183, 0.000)
		colorBeach     (0.257, 0.214, 0.194, 0.000)
		colorDesert    (0.271, 0.226, 0.205, 0.000)
		colorLowland   (0.285, 0.238, 0.215, 0.000)
		colorUpland    (0.299, 0.250, 0.226, 0.000)
		colorRock      (0.314, 0.262, 0.237, 0.000)
		colorSnow      (0.328, 0.274, 0.248, 1.000)
		BumpHeight      1.07492
		BumpOffset      0.214985
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.36239
		GasToDust   0.25
		Particles   1711
		GasBright   0.376176
		DustBright  0.482599
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   14.0512
		Period          56.0988
		Eccentricity    0.931209
		Inclination     -132.82
		AscendingNode   -68.5879
		ArgOfPericenter -39.4256
		MeanAnomaly     -4.34735
	}
}

Comet	"C120"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            5.44525e-009
	Radius          25.797
	InertiaMoment   0.398581

	Oblateness      0.0402777

	RotationPeriod  27.2713
	Obliquity       98.0074
	EqAscendNode    75.0802

	AbsMagn         3.01285
	SlopeParam      6.2941
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.656 0.654 0.651)

	Surface
	{
		SurfStyle       0.241432
		OceanStyle      0.947403
		Randomize      (-0.614, -0.463, -0.976)
		colorDistMagn   0.198729
		colorDistFreq   0.189168
		detailScale     704.431
		colorConversion true
		snowLevel       2
		tropicLatitude  0.994714
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.461733
		terraceProb     0.157358
		erosion         0
		montesMagn      0.572537
		montesFreq      3.55169
		montesSpiky     0.954699
		montesFraction  0.563672
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.69394
		hillsFraction   0.601675
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223242
		craterFreq      0.15189
		craterDensity   0.84968
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.487361
		volcanoTemp     1639.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.262, 0.262, 0.260, 0.000)
		colorShelf     (0.279, 0.278, 0.277, 0.000)
		colorBeach     (0.295, 0.294, 0.293, 0.000)
		colorDesert    (0.312, 0.311, 0.309, 0.000)
		colorLowland   (0.328, 0.327, 0.325, 0.000)
		colorUpland    (0.344, 0.343, 0.342, 0.000)
		colorRock      (0.361, 0.360, 0.358, 0.000)
		colorSnow      (0.377, 0.376, 0.374, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.843582
		GasToDust   0.25
		Particles   2684
		GasBright   0.270046
		DustBright  0.273215
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   12.472
		Period          46.9121
		Eccentricity    0.87694
		Inclination     177.773
		AscendingNode   -18.3899
		ArgOfPericenter 114.216
		MeanAnomaly     -74.2412
	}
}

Comet	"C121"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.67663e-016
	Radius          0.0739673
	InertiaMoment   0.39626

	Oblateness      0.0360937

	RotationPeriod  25.0973
	Obliquity       51.2131
	EqAscendNode    59.6577

	AbsMagn         10.8372
	SlopeParam      8.41706
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.843 0.776 0.729)

	Surface
	{
		SurfStyle       0.632941
		OceanStyle      0.177254
		Randomize      (0.311, -0.418, -0.243)
		colorDistMagn   0.347373
		colorDistFreq   4.26193e-006
		detailScale     2.0198
		colorConversion true
		snowLevel       2
		tropicLatitude  0.556235
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.568198
		terraceProb     0.285358
		erosion         0
		montesMagn      0.613872
		montesFreq      3.18181
		montesSpiky     0.835907
		montesFraction  0.4846
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.33895e-005
		hillsFraction   0.628723
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.21587
		craterFreq      0.259077
		craterDensity   0.766494
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.397971
		volcanoTemp     1524.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.329, 0.264, 0.204, 0.000)
		colorShelf     (0.337, 0.272, 0.233, 0.000)
		colorBeach     (0.396, 0.318, 0.277, 0.000)
		colorDesert    (0.430, 0.342, 0.270, 0.000)
		colorLowland   (0.472, 0.365, 0.306, 0.000)
		colorUpland    (0.523, 0.443, 0.372, 0.000)
		colorRock      (0.565, 0.481, 0.401, 0.000)
		colorSnow      (0.615, 0.512, 0.423, 1.000)
		BumpHeight      0.0665705
		BumpOffset      0.0133141
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.0127831
		DustBright  0.214965
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   12.3927
		Period          46.4655
		Eccentricity    0.985824
		Inclination     -84.5375
		AscendingNode   -6.20671
		ArgOfPericenter 139.156
		MeanAnomaly     -40.1065
	}
}

Comet	"C122"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.29675e-012
	Radius          1.59766
	InertiaMoment   0.399079

	Oblateness      0.0574038

	RotationPeriod  22.8364
	Obliquity       4.41877
	EqAscendNode    44.2351

	AbsMagn         7.22493
	SlopeParam      2.69555
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.834 0.794 0.758)

	Surface
	{
		SurfStyle       0.418517
		OceanStyle      0.576532
		Randomize      (0.213, -0.328, -0.350)
		colorDistMagn   0.5951
		colorDistFreq   0.00121397
		detailScale     43.6269
		colorConversion true
		snowLevel       2
		tropicLatitude  0.392183
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.314215
		terraceProb     0.579217
		erosion         0
		montesMagn      0.475665
		montesFreq      3.14544
		montesSpiky     0.996737
		montesFraction  0.57219
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00432299
		hillsFraction   0.817673
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238977
		craterFreq      0.246824
		craterDensity   0.960145
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.413622
		volcanoTemp     1614.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.334, 0.318, 0.303, 0.000)
		colorShelf     (0.354, 0.337, 0.322, 0.000)
		colorBeach     (0.375, 0.357, 0.341, 0.000)
		colorDesert    (0.396, 0.377, 0.360, 0.000)
		colorLowland   (0.417, 0.397, 0.379, 0.000)
		colorUpland    (0.438, 0.417, 0.398, 0.000)
		colorRock      (0.459, 0.437, 0.417, 0.000)
		colorSnow      (0.479, 0.457, 0.436, 1.000)
		BumpHeight      1.4379
		BumpOffset      0.287579
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.395216
		GasToDust   0.25
		Particles   1778
		GasBright   0.0820305
		DustBright  0.630204
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   19.9371
		Period          94.8144
		Eccentricity    0.95687
		Inclination     -156.285
		AscendingNode   -103.157
		ArgOfPericenter 42.7963
		MeanAnomaly     -177.88
	}
}

Comet	"C123"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.00295e-008
	Radius          28.9028
	InertiaMoment   0.397592

	Oblateness      0.0543773

	RotationPeriod  20.4715
	Obliquity       317.624
	EqAscendNode    28.8125

	AbsMagn         2.5222
	SlopeParam      3.33208
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.806 0.779 0.725)

	Surface
	{
		SurfStyle       0.923191
		OceanStyle      0.541467
		Randomize      (-0.534, -0.079, 0.730)
		colorDistMagn   0.500902
		colorDistFreq   0.133509
		detailScale     789.238
		colorConversion true
		snowLevel       2
		tropicLatitude  0.851649
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.421423
		terraceProb     0.421815
		erosion         0
		montesMagn      0.587522
		montesFreq      2.45805
		montesSpiky     0.945906
		montesFraction  0.602814
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.82533
		hillsFraction   0.634415
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225766
		craterFreq      0.275125
		craterDensity   0.872463
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.506555
		volcanoTemp     1364.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.274, 0.273, 0.290, 0.050)
		colorShelf     (0.322, 0.319, 0.334, 0.040)
		colorBeach     (0.371, 0.366, 0.377, 0.030)
		colorDesert    (0.419, 0.413, 0.428, 0.020)
		colorLowland   (0.468, 0.459, 0.471, 0.030)
		colorUpland    (0.516, 0.506, 0.515, 0.050)
		colorRock      (0.564, 0.553, 0.573, 0.020)
		colorSnow      (0.564, 0.553, 0.573, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.876408
		GasToDust   0.25
		Particles   2750
		GasBright   0.0691163
		DustBright  0.327605
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   22.5919
		Period          114.37
		Eccentricity    0.957696
		Inclination     -160.388
		AscendingNode   -139.401
		ArgOfPericenter 16.8041
		MeanAnomaly     25.2954
	}
}

Comet	"C124"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            3.08814e-016
	Radius          0.0989472
	InertiaMoment   0.399524

	Oblateness      0.0925112

	RotationPeriod  17.9813
	Obliquity       270.83
	EqAscendNode    13.3899

	AbsMagn         10.5749
	SlopeParam      3.90613
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.560 0.554 0.549)

	Surface
	{
		SurfStyle       0.0962738
		OceanStyle      0.425465
		Randomize      (0.146, 0.220, -0.282)
		colorDistMagn   0.853088
		colorDistFreq   8.69866e-006
		detailScale     2.70192
		colorConversion true
		snowLevel       2
		tropicLatitude  0.631871
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.346895
		terraceProb     0.111018
		erosion         0
		montesMagn      0.3786
		montesFreq      3.47766
		montesSpiky     0.889285
		montesFraction  0.337106
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.70812e-005
		hillsFraction   0.665312
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.196634
		craterFreq      0.223187
		craterDensity   0.984267
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.54955
		volcanoTemp     1609.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.224, 0.222, 0.220, 0.000)
		colorShelf     (0.238, 0.235, 0.233, 0.000)
		colorBeach     (0.252, 0.249, 0.247, 0.000)
		colorDesert    (0.266, 0.263, 0.261, 0.000)
		colorLowland   (0.280, 0.277, 0.274, 0.000)
		colorUpland    (0.294, 0.291, 0.288, 0.000)
		colorRock      (0.308, 0.305, 0.302, 0.000)
		colorSnow      (0.322, 0.318, 0.316, 1.000)
		BumpHeight      0.0890525
		BumpOffset      0.0178105
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.205554
		DustBright  0.675654
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   19.0832
		Period          88.7892
		Eccentricity    0.966624
		Inclination     -51.7936
		AscendingNode   -3.73698
		ArgOfPericenter -138.903
		MeanAnomaly     86.6453
	}
}

Comet	"C125"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            2.38845e-012
	Radius          1.78992
	InertiaMoment   0.398301

	Oblateness      0.0968618

	RotationPeriod  15.3385
	Obliquity       224.036
	EqAscendNode    357.967

	AbsMagn         7.01113
	SlopeParam      4.47239
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.543 0.533 0.529)

	Surface
	{
		SurfStyle       0.576539
		OceanStyle      0.618605
		Randomize      (-0.317, 0.242, 0.938)
		colorDistMagn   0.181707
		colorDistFreq   0.00281163
		detailScale     48.8769
		colorConversion true
		snowLevel       2
		tropicLatitude  0.181373
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.449209
		terraceProb     0.323148
		erosion         0
		montesMagn      0.446648
		montesFreq      3.37721
		montesSpiky     0.920655
		montesFraction  0.355012
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00863498
		hillsFraction   0.741158
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248074
		craterFreq      0.193112
		craterDensity   0.834453
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.628783
		volcanoTemp     1128.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.212, 0.181, 0.148, 0.000)
		colorShelf     (0.217, 0.187, 0.169, 0.000)
		colorBeach     (0.255, 0.219, 0.201, 0.000)
		colorDesert    (0.277, 0.235, 0.196, 0.000)
		colorLowland   (0.304, 0.251, 0.222, 0.000)
		colorUpland    (0.336, 0.304, 0.270, 0.000)
		colorRock      (0.364, 0.331, 0.291, 0.000)
		colorSnow      (0.396, 0.352, 0.307, 1.000)
		BumpHeight      1.61093
		BumpOffset      0.322186
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.428042
		GasToDust   0.25
		Particles   1844
		GasBright   0.165358
		DustBright  0.400337
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   18.9897
		Period          88.1372
		Eccentricity    0.907782
		Inclination     -146.207
		AscendingNode   176.685
		ArgOfPericenter 146.308
		MeanAnomaly     83.542
	}
}

Comet	"C126"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            1.8473e-008
	Radius          38.6656
	InertiaMoment   0.399947

	Oblateness      0.191058

	RotationPeriod  12.5067
	Obliquity       177.242
	EqAscendNode    342.545

	AbsMagn         1.9316
	SlopeParam      5.08019
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.795 0.792 0.790)

	Surface
	{
		SurfStyle       0.702158
		OceanStyle      0.976102
		Randomize      (-0.715, -0.233, 0.986)
		colorDistMagn   0.864477
		colorDistFreq   1.05324
		detailScale     1055.83
		colorConversion true
		snowLevel       2
		tropicLatitude  0.269689
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.644186
		terraceProb     0.412706
		erosion         0
		montesMagn      0.362903
		montesFreq      2.80676
		montesSpiky     0.943526
		montesFraction  0.341418
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.96705
		hillsFraction   0.617809
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.216589
		craterFreq      0.20766
		craterDensity   0.680373
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.496566
		volcanoTemp     1699.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.310, 0.269, 0.221, 0.000)
		colorShelf     (0.318, 0.277, 0.253, 0.000)
		colorBeach     (0.374, 0.325, 0.300, 0.000)
		colorDesert    (0.405, 0.349, 0.292, 0.000)
		colorLowland   (0.445, 0.372, 0.332, 0.000)
		colorUpland    (0.493, 0.452, 0.403, 0.000)
		colorRock      (0.533, 0.491, 0.434, 0.000)
		colorSnow      (0.580, 0.523, 0.458, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.909234
		GasToDust   0.25
		Particles   2816
		GasBright   0.0879022
		DustBright  0.162279
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   17.2665
		Period          76.4169
		Eccentricity    0.93884
		Inclination     -166.279
		AscendingNode   -130.344
		ArgOfPericenter 125.347
		MeanAnomaly     87.5959
	}
}

Comet	"C127"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            5.68797e-016
	Radius          0.110847
	InertiaMoment   0.398842

	Oblateness      0.249

	RotationPeriod  9.43622
	Obliquity       130.447
	EqAscendNode    327.122

	AbsMagn         10.3232
	SlopeParam      5.81185
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.661 0.659 0.657)

	Surface
	{
		SurfStyle       0.552414
		OceanStyle      0.827304
		Randomize      (-0.298, 0.889, 0.908)
		colorDistMagn   0.637652
		colorDistFreq   7.00705e-006
		detailScale     3.02687
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998297
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.481563
		terraceProb     0.348799
		erosion         0
		montesMagn      0.571399
		montesFreq      2.54481
		montesSpiky     0.968308
		montesFraction  0.384742
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.02776e-005
		hillsFraction   0.68592
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254143
		craterFreq      0.258853
		craterDensity   0.869937
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.487266
		volcanoTemp     1391.82
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.258, 0.224, 0.184, 0.000)
		colorShelf     (0.264, 0.231, 0.210, 0.000)
		colorBeach     (0.311, 0.270, 0.250, 0.000)
		colorDesert    (0.337, 0.290, 0.243, 0.000)
		colorLowland   (0.370, 0.310, 0.276, 0.000)
		colorUpland    (0.410, 0.376, 0.335, 0.000)
		colorRock      (0.443, 0.409, 0.362, 0.000)
		colorSnow      (0.482, 0.435, 0.381, 1.000)
		BumpHeight      0.0997626
		BumpOffset      0.0199525
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.301507
		DustBright  0.43316
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   16.447
		Period          71.0418
		Eccentricity    0.916542
		Inclination     -129.629
		AscendingNode   127.332
		ArgOfPericenter 94.6962
		MeanAnomaly     25.1964
	}
}

Comet	"C128"
{
	ParentBody     "Ziost System"
	Class	       "Asteroid"

	Mass            4.39924e-012
	Radius          2.39469
	InertiaMoment   0.397093

	Oblateness      0.249

	RotationPeriod  6.05609
	Obliquity       83.653
	EqAscendNode    311.7

	AbsMagn         6.79448
	SlopeParam      6.94547
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.617 0.615 0.612)

	Surface
	{
		SurfStyle       0.350014
		OceanStyle      0.531698
		Randomize      (-0.058, 0.195, 0.513)
		colorDistMagn   0.483175
		colorDistFreq   0.00283915
		detailScale     65.391
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999924
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.660276
		terraceProb     0.344729
		erosion         0
		montesMagn      0.481561
		montesFreq      2.61444
		montesSpiky     0.94794
		montesFraction  0.366943
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0154974
		hillsFraction   0.692338
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238069
		craterFreq      0.177924
		craterDensity   0.863791
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.480838
		volcanoTemp     1453.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.247, 0.246, 0.245, 0.000)
		colorShelf     (0.262, 0.262, 0.260, 0.000)
		colorBeach     (0.278, 0.277, 0.275, 0.000)
		colorDesert    (0.293, 0.292, 0.291, 0.000)
		colorLowland   (0.309, 0.308, 0.306, 0.000)
		colorUpland    (0.324, 0.323, 0.321, 0.000)
		colorRock      (0.339, 0.338, 0.337, 0.000)
		colorSnow      (0.355, 0.354, 0.352, 1.000)
		BumpHeight      2.15522
		BumpOffset      0.431044
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
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

	CometTail
	{
		MaxLength   0.460868
		GasToDust   0.25
		Particles   1910
		GasBright   0.19677
		DustBright  0.222384
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   15.3319
		Period          63.9406
		Eccentricity    0.957734
		Inclination     166.915
		AscendingNode   -115.076
		ArgOfPericenter 156.052
		MeanAnomaly     82.6213
	}
}

