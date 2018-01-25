// http://starwars.wikia.com/wiki/Rakata_Prime
// Region : Unknown Regions
// Sector : 
// Grid location : G11
// X : -6901.12, Y : -2785.07, Z : 148.16788570193444

// TODO : keep Lehon aspect from space but change island/sea colors and add some large craters : https://vignette.wikia.nocookie.net/starwars/images/e/e9/Unkwld_space.jpg/revision/latest?cb=20070111044756


// http://starwars.wikia.com/wiki/Iwar
DwarfPlanet	"Iwar"
{
	ParentBody     "Abo"
	Class	       "Selena"

	Mass            0.00707223
	Radius          1458.44
	InertiaMoment   0.385676

	Oblateness      0.00228507

	RotationPeriod  41.6862
	Obliquity       -2.30817
	EqAscendNode    113.848

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.945 0.815 0.563)

	Surface
	{
		SurfStyle       0.731345
		OceanStyle      0.483373
		Randomize      (0.643, 0.462, 0.812)
		colorDistMagn   0.052336
		colorDistFreq   148.392
		detailScale     3751.18
		colorConversion true
		drivenDarkening 0
		seaLevel        0.188179
		snowLevel       2
		tropicLatitude  0.0439483
		icecapLatitude  10
		icecapHeight    0.123952
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.67273
		venusFreq       0.521742
		venusMagn       0
		mareFreq        0.611568
		mareDensity     0.00293199
		terraceProb     0.433802
		erosion         0
		montesMagn      0.0777685
		montesFreq      89.6063
		montesSpiky     0.856853
		montesFraction  0.606898
		dunesMagn       0.0237401
		dunesFreq       1867.8
		dunesFraction   0.443547
		hillsMagn       0.12673
		hillsFreq       191.817
		hillsFraction   0.557284
		hills2Fraction  0
		riversMagn      67.8613
		riversFreq      2.7667
		riversSin       7.12515
		riversOctaves   0
		canyonsMagn     0.337011
		canyonsFreq     0.459495
		canyonFraction  0.976572
		cracksMagn      0.040694
		cracksFreq      0.698919
		cracksOctaves   0
		craterMagn      0.624541
		craterFreq      3.99358
		craterDensity   0.861551
		craterOctaves   9.49282
		craterRayedFactor 0.152358
		volcanoMagn     0.156067
		volcanoFreq     0.750095
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.224848
		volcanoRadius   0.161209
		volcanoTemp     1213.46
		lavaCoverTidal  0.150784
		lavaCoverSun    0.0014565
		lavaCoverYoung  0
		colorSea       (0.470, 0.400, 0.340, 0.000)
		colorShelf     (0.640, 0.600, 0.470, 0.000)
		colorBeach     (0.446, 0.430, 0.338, 0.000)
		colorDesert    (0.475, 0.437, 0.345, 0.000)
		colorLowland   (0.390, 0.325, 0.274, 0.000)
		colorUpland    (0.553, 0.501, 0.366, 0.000)
		colorRock      (0.300, 0.260, 0.220, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      10
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
		SemiMajorAxis   0.0310833
		Period          0.00713333
		Eccentricity    0.0761985
		Inclination     -1.38366
		AscendingNode   113.373
		ArgOfPericenter 350.803
		MeanAnomaly     337.634
	}
}

// http://starwars.wikia.com/wiki/Meldina
DwarfPlanet	"Meldina"
{
	ParentBody     "Abo"
	Class	       "Selena"

	Mass            0.038441
	Radius          1982.28
	InertiaMoment   0.346122

	Obliquity       2.05239
	EqAscendNode    120.388
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.763 0.704 0.620)

	Surface
	{
		SurfStyle       0.446632
		OceanStyle      0.563773
		Randomize      (-0.222, 0.771, 0.780)
		colorDistMagn   0.0760991
		colorDistFreq   294.33
		detailScale     5098.54
		colorConversion true
		drivenDarkening 0
		seaLevel        0.18226
		snowLevel       2
		tropicLatitude  0.0355971
		icecapLatitude  10
		icecapHeight    0.13557
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.84996
		venusFreq       0.975966
		venusMagn       0
		mareFreq        0.802948
		mareDensity     0.0290111
		terraceProb     0.336791
		erosion         0
		montesMagn      0.0827706
		montesFreq      89.6503
		montesSpiky     0.827468
		montesFraction  0.0802702
		dunesMagn       0.0508605
		dunesFreq       2630.27
		dunesFraction   0.940402
		hillsMagn       0.112428
		hillsFreq       231.976
		hillsFraction   0.635575
		hills2Fraction  0
		riversMagn      57.481
		riversFreq      2.61451
		riversSin       3.88287
		riversOctaves   0
		canyonsMagn     0.566885
		canyonsFreq     0.652767
		canyonFraction  0.936615
		cracksMagn      0.0694771
		cracksFreq      0.74257
		cracksOctaves   0
		craterMagn      0.66431
		craterFreq      6.2457
		craterDensity   0.896928
		craterOctaves   11
		craterRayedFactor 0.1843
		volcanoMagn     0.361705
		volcanoFreq     0.757166
		volcanoDensity  0.391921
		volcanoOctaves  3
		volcanoActivity 1.05542
		volcanoFlows    0.235117
		volcanoRadius   0.320297
		volcanoTemp     1693.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.420, 0.420, 0.430, 0.000)
		colorShelf     (0.470, 0.480, 0.480, 0.000)
		colorBeach     (0.419, 0.402, 0.372, 0.000)
		colorDesert    (0.366, 0.324, 0.285, 0.000)
		colorLowland   (0.465, 0.430, 0.347, 0.000)
		colorUpland    (0.496, 0.458, 0.378, 0.000)
		colorRock      (0.340, 0.340, 0.340, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.995466
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Sun"
		Height          99.1141
		Density         0.000453393
		Pressure        0.000328784
		Greenhouse      0.0910065
		Bright          3.39856
		Opacity         0
		SkyLight        1.13285
		Hue             -0.0168533
		Saturation      1

		Composition
		{
			SO2   	99.993
			Kr    	0.00676674
			Xe    	0.000108267
			Cl2   	7.78386e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0670394
		Period          0.0225942
		Eccentricity    0.0438241
		Inclination     1.60849
		AscendingNode   119.679
		ArgOfPericenter 101.056
		MeanAnomaly     245.698
	}
}

// http://starwars.wikia.com/wiki/Taxiode
Planet	"Taxiode"
{
	ParentBody     "Abo"
	Class	       "Desert"

	Mass            0.190352
	Radius          3713.81
	InertiaMoment   0.328736

	Obliquity       -0.220975
	EqAscendNode    -113.144
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.699 0.587 0.487)

	Surface
	{
		SurfStyle       0.294124
		OceanStyle      0.920909
		Randomize      (-0.340, -0.623, -0.495)
		colorDistMagn   0.0628855
		colorDistFreq   329.026
		detailScale     9552.14
		colorConversion true
		seaLevel        0.113478
		snowLevel       2
		tropicLatitude  0.0042427
		icecapLatitude  10
		icecapHeight    0.165355
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        1.24514
		venusFreq       1.08457
		venusMagn       0
		mareFreq        1.13809
		mareDensity     0.0644097
		terraceProb     0.191104
		erosion         0
		montesMagn      0.229236
		montesFreq      190.915
		montesSpiky     0.90071
		montesFraction  0.188836
		dunesMagn       0.0296025
		dunesFreq       25.0882
		dunesFraction   0.179271
		hillsMagn       0.114371
		hillsFreq       452.918
		hillsFraction   0
		hills2Fraction  0
		riversMagn      53.7239
		riversFreq      4.78264
		riversSin       6.93918
		riversOctaves   0
		canyonsMagn     0.00846923
		canyonsFreq     90.1899
		canyonFraction  0
		cracksMagn      0.0613315
		cracksFreq      0.267952
		cracksOctaves   0
		craterMagn      0.565213
		craterFreq      13.5728
		craterDensity   0.510749
		craterOctaves   6.2274
		volcanoMagn     0.683425
		volcanoFreq     0.756484
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 1.54082
		volcanoFlows    0.625708
		volcanoRadius   0.487635
		volcanoTemp     1587.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.640, 0.620, 0.420, 0.000)
		colorShelf     (0.680, 0.620, 0.470, 0.000)
		colorBeach     (0.740, 0.730, 0.610, 0.000)
		colorDesert    (0.450, 0.420, 0.380, 0.000)
		colorLowland   (0.530, 0.480, 0.400, 0.000)
		colorUpland    (0.600, 0.540, 0.420, 0.000)
		colorRock      (0.170, 0.160, 0.160, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 0.769)
		colorLowPlants (0.530, 0.480, 0.400, 0.000)
		colorUpPlants  (0.600, 0.540, 0.420, 0.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		SpecularPower   30
		Hapke           0.531158
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Mars"
		Height          59.3304
		Density         0.0468842
		Pressure        0.0277428
		Greenhouse      0.391502
		Bright          8.5942
		Opacity         1
		SkyLight        2.86473
		Hue             -0.0447598
		Saturation      1

		Composition
		{
			SO2   	71.0426
			CO2   	23.3673
			C2H2  	3.39244
			N2    	1.32657
			H2S   	0.289522
			C2H6  	0.2709
			C2H4  	0.187472
			C3H8  	0.121531
			CO    	0.000968937
			Ar    	0.00065773
			Cl2   	1.52333e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.132275
		Period          0.0626206
		Eccentricity    0.089957
		Inclination     -0.220975
		AscendingNode   -113.144
		ArgOfPericenter 185.401
		MeanAnomaly     165.268
	}
}

// http://starwars.wikia.com/wiki/Lehon
Planet	"Lehon/Rakata/Rakata Prime/Unknown World (KotOR)"
{
	ParentBody     "Abo"
	Class	       "Terra" // according to wookieepedia

	Mass            0.52 // In order to have standard gravity
	Radius          4560
	InertiaMoment   0.224821

	RotationPeriod  18 // according to wookieepedia
	Obliquity       15.37269
	EqAscendNode    58.2415
	TidalLocked     false

	AlbedoBond      0.458396
	AlbedoGeom      0.550076
	Brightness      2
	Color          (0.566 0.387 0.387)
	
	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine/Terrestrial"
	}

	Surface
	{
		SurfStyle       0.336508
		OceanStyle      0.888889
		Randomize      (0.164, 0.925, 0.363)
		colorDistMagn   0.052336
		colorDistFreq   0.557226
		detailScale     190644
		colorConversion true
		drivenDarkening -0.809524
		seaLevel        0.428571
		snowLevel       0
		tropicLatitude  0.246386
		icecapLatitude  0.972285
		icecapHeight    0.0555556
		climatePole     0.126984
		climateTropic   0.5625
		climateEquator  0.253968
		heightTempGrad  0.375
		tropicWidth     0.07
		mainFreq        5
		venusFreq       0.52381
		venusMagn       1.42857
		mareFreq        1000
		mareDensity     0.785714
		terraceProb     0.136814
		erosion         0.920635
		montesMagn      1.26984
		montesFreq      70.26
		montesSpiky     0.883802
		montesFraction  0.896825
		dunesMagn       1.11111
		dunesFreq       28.4127
		dunesFraction   0.880952
		hillsMagn       0.145689
		hillsFreq       69.139
		hillsFraction   0.483373
		hills2Fraction  0.606898
		riversMagn      67.8613
		riversFreq      2.7667
		riversSin       7.12515
		riversOctaves   2
		canyonsMagn     7.77778
		canyonsFreq     100
		canyonFraction  0.730783
		cracksMagn      0.10655
		cracksFreq      0.442677
		cracksOctaves   0
		craterMagn      0.971951
		craterFreq      17.4064
		craterDensity   0
		craterOctaves   0
		craterRayedFactor 0
		volcanoMagn     0.620224
		volcanoFreq     0.750095
		volcanoDensity  0.238365
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.637063
		volcanoRadius   0.537365
		volcanoTemp     1213.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     0
		stripeFluct     0
		stripeTwist     0
		cycloneMagn     11.0567
		cycloneFreq     0.980338
		cycloneDensity  0.285034
		cycloneOctaves  5
		colorSea       (0.040, 0.200, 0.100, 1.000)
		colorShelf     (0.150, 0.460, 0.280, 1.000)
		colorBeach     (0.740, 0.730, 0.610, 0.000)
		colorDesert    (0.450, 0.420, 0.380, 0.000)
		colorLowland   (0.480, 0.380, 0.280, 0.000)
		colorUpland    (0.600, 0.540, 0.420, 0.000)
		colorRock      (0.170, 0.160, 0.160, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.308)
		colorLowPlants (0.056, 0.049, 0.012, 0.000)
		colorUpPlants  (0.119, 0.121, 0.074, 0.000)
		BumpHeight      22.2222
		BumpOffset      3.1746
		DiffMapAlpha   "Water"
		SpecBrightWater 0.65
		SpecBrightIce   0.85
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor	(0.1, 0.35, 0.5, 1.0)
	}

	Clouds
	{
		Height          25.7656
		Velocity        2194.12
		BumpHeight      17.6048
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.833333
		mainOctaves     2
		Coverage        0.2396825
		stripeZones     0
		stripeFluct     0
		stripeTwist     0
	}

	Ocean
	{
		Height          1.50359
	}
	
	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          166.81
		Density         0.000896151
		Pressure        4.90316e-006
		Greenhouse      23.8095
		Bright          10
		Opacity         0.373016
		SkyLight        10
		Hue             0.0555556
		Saturation      2

		Composition
		{
			N2    	77.7729
			O2    	20.8625
			Ar    	0.9303
			H2O   	0.4
			CO2   	0.0398
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.230388
		Period          0.761138794278838  // according to wookieepedia
		Eccentricity    0.0317576
		Inclination     -2.37269
		AscendingNode   58.2415
		ArgOfPericenter 117.888
		MeanAnomaly     233.038
	}
}

Moon	"Lehon Moon 1"
{
	ParentBody     "Lehon"
	Class	       "Selena"

	Mass            3.44313e-009
	Radius          602.4158
	InertiaMoment   0.39889

	Oblateness      0.001731

	Obliquity       61.1779
	EqAscendNode    -140.091
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.746 0.744 0.740)

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
		SemiMajorAxis   7.265e-5
		Period          0.00812343
		Eccentricity    0.275518
		Inclination     -39.3727
		AscendingNode   101.779
		ArgOfPericenter -143.203
		MeanAnomaly     -57.0289
	}
}

Moon	"Lehon Moon 2"
{
	ParentBody     "Lehon"
	Class	       "Selena"

	Mass            4.76684e-009
	Radius          429.5841
	InertiaMoment   0.399821

	Obliquity       -39.3727
	EqAscendNode    164.779
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.634 0.627 0.623)

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
		SemiMajorAxis   8.95e-5
		Period          0.00892343
		Eccentricity    0.275518
		Inclination     -12.3727
		AscendingNode   101.779
		ArgOfPericenter -143.203
		MeanAnomaly     -57.0289
	}
}

//http://starwars.wikia.com/wiki/Desten
Planet	"Desten"
{
	ParentBody     "Abo"
	Class	       "Selena"

	Mass            4.35571
	Radius          4523.2
	InertiaMoment   0.330977

	Oblateness      0.00110111

	RotationPeriod  49.3326
	Obliquity       1.74751
	EqAscendNode    -138.327

	AlbedoBond      0.7
	AlbedoGeom      0.84
	Brightness      2
	Color          (0.759 0.699 0.588)

	Surface
	{
		SurfStyle       0.287182
		OceanStyle      0.230659
		Randomize      (0.682, 0.923, 0.349)
		colorDistMagn   0.060824
		colorDistFreq   1455.07
		detailScale     29952
		colorConversion true
		seaLevel        0.0942575
		snowLevel       2
		tropicLatitude  0.026074
		icecapLatitude  10
		icecapHeight    0.231904
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        0.658055
		venusFreq       1.16335
		venusMagn       0.282791
		mareFreq        1.90606
		mareDensity     0.209
		terraceProb     0.106954
		erosion         0
		montesMagn      0.15632
		montesFreq      389.594
		montesSpiky     0.873294
		montesFraction  0.56263
		dunesMagn       0.0532275
		dunesFreq       93.7399
		dunesFraction   0.391629
		hillsMagn       0.160022
		hillsFreq       1159.6
		hillsFraction   0
		hills2Fraction  0
		riversMagn      65.662
		riversFreq      3.55483
		riversSin       5.81651
		riversOctaves   0
		canyonsMagn     0.0407864
		canyonsFreq     320.443
		canyonFraction  0
		cracksMagn      0.1063
		cracksFreq      0.826937
		cracksOctaves   0
		craterMagn      0.70891
		craterFreq      36.8799
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.677464
		volcanoFreq     0.649805
		volcanoDensity  0.345171
		volcanoOctaves  3
		volcanoActivity 0.671845
		volcanoFlows    0.634632
		volcanoRadius   0.547175
		volcanoTemp     1640.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.17776
		stripeTwist     0.223248
		cycloneMagn     2.64857
		cycloneFreq     0.922994
		cycloneDensity  0.281736
		cycloneOctaves  4
		colorSea       (0.640, 0.620, 0.420, 0.000)
		colorShelf     (0.680, 0.620, 0.470, 0.000)
		colorBeach     (0.740, 0.730, 0.610, 0.000)
		colorDesert    (0.450, 0.420, 0.380, 0.000)
		colorLowland   (0.530, 0.480, 0.400, 0.000)
		colorUpland    (0.600, 0.540, 0.420, 0.000)
		colorRock      (0.170, 0.160, 0.160, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 0.769)
		colorLowPlants (0.530, 0.480, 0.400, 0.000)
		colorUpPlants  (0.600, 0.540, 0.420, 0.000)
		BumpHeight      17.4965
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		SpecularPower   30
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds		true

	NoOcean         true

	NoLava          true

	NoAtmosphere	true

	NoAurora		true

	NoRings			true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.443304
		Period          0.384192
		Eccentricity    0.00527844
		Inclination     2.25136
		AscendingNode   -138.46
		ArgOfPericenter 131.022
		MeanAnomaly     57.366
	}
}

DwarfMoon	"Desten Moon 1"
{
	ParentBody     "Desten"
	Class	       "Asteroid"

	Mass            4.69819e-011
	Radius          4.82506
	InertiaMoment   0.398997

	Oblateness      0.249

	Obliquity       -0.00995685
	EqAscendNode    -168.231
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.728 0.661 0.591)

	Surface
	{
		SurfStyle       0.0446067
		OceanStyle      0.240714
		Randomize      (0.019, 0.812, -0.718)
		colorDistMagn   0.376556
		colorDistFreq   0.0080333
		detailScale     131.756
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.451184
		terraceProb     0.130797
		erosion         0
		montesMagn      0.446779
		montesFreq      3.40581
		montesSpiky     0.986163
		montesFraction  0.725889
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0314497
		hillsFraction   0.739904
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245119
		craterFreq      0.179709
		craterDensity   0.808895
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.502975
		volcanoTemp     1690.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.291, 0.264, 0.237, 0.000)
		colorShelf     (0.309, 0.281, 0.251, 0.000)
		colorBeach     (0.328, 0.297, 0.266, 0.000)
		colorDesert    (0.346, 0.314, 0.281, 0.000)
		colorLowland   (0.364, 0.330, 0.296, 0.000)
		colorUpland    (0.382, 0.347, 0.311, 0.000)
		colorRock      (0.400, 0.363, 0.325, 0.000)
		colorSnow      (0.418, 0.380, 0.340, 1.000)
		BumpHeight      4.34255
		BumpOffset      0.86851
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
		SemiMajorAxis   0.000208876
		Period          0.000836535
		Eccentricity    4.28108e-005
		Inclination     -0.00995685
		AscendingNode   -168.231
		ArgOfPericenter 161.709
		MeanAnomaly     -63.8456
	}
}

DwarfMoon	"Desten Moon 2"
{
	ParentBody     "Desten"
	Class	       "Asteroid"

	Mass            8.13412e-011
	Radius          6.8803
	InertiaMoment   0.399915

	Oblateness      0.249

	Obliquity       0.00266134
	EqAscendNode    160.94
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.582 0.578 0.570)

	Surface
	{
		SurfStyle       0.236125
		OceanStyle      0.55368
		Randomize      (0.868, 0.170, 0.916)
		colorDistMagn   0.297149
		colorDistFreq   0.00678493
		detailScale     187.878
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.518506
		terraceProb     0.300637
		erosion         0
		montesMagn      0.430765
		montesFreq      3.29235
		montesSpiky     0.949334
		montesFraction  0.400857
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0801339
		hillsFraction   0.548585
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228724
		craterFreq      0.216077
		craterDensity   0.873259
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.504186
		volcanoTemp     1648.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.233, 0.231, 0.228, 0.000)
		colorShelf     (0.247, 0.245, 0.242, 0.000)
		colorBeach     (0.262, 0.260, 0.256, 0.000)
		colorDesert    (0.276, 0.274, 0.271, 0.000)
		colorLowland   (0.291, 0.289, 0.285, 0.000)
		colorUpland    (0.305, 0.303, 0.299, 0.000)
		colorRock      (0.320, 0.318, 0.313, 0.000)
		colorSnow      (0.335, 0.332, 0.327, 1.000)
		BumpHeight      6.19227
		BumpOffset      1.23845
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
		SemiMajorAxis   0.000232868
		Period          0.000984725
		Eccentricity    8.1919e-005
		Inclination     0.00266134
		AscendingNode   160.94
		ArgOfPericenter -164.21
		MeanAnomaly     86.8192
	}
}

DwarfMoon	"Desten Moon 3"
{
	ParentBody     "Desten"
	Class	       "Asteroid"

	Mass            1.34032e-010
	Radius          7.50512
	InertiaMoment   0.397994

	Oblateness      0.209735

	Obliquity       0.000349683
	EqAscendNode    169.469
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.572 0.564 0.559)

	Surface
	{
		SurfStyle       0.0927662
		OceanStyle      0.819483
		Randomize      (-0.824, 0.844, 0.439)
		colorDistMagn   0.916012
		colorDistFreq   0.0390969
		detailScale     204.94
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.589641
		terraceProb     0.202197
		erosion         0
		montesMagn      0.52168
		montesFreq      3.17033
		montesSpiky     0.883635
		montesFraction  0.556314
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.103309
		hillsFraction   0.85968
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250505
		craterFreq      0.210468
		craterDensity   0.751745
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.507659
		volcanoTemp     1621.95
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.229, 0.225, 0.224, 0.000)
		colorShelf     (0.243, 0.239, 0.238, 0.000)
		colorBeach     (0.257, 0.254, 0.252, 0.000)
		colorDesert    (0.272, 0.268, 0.265, 0.000)
		colorLowland   (0.286, 0.282, 0.279, 0.000)
		colorUpland    (0.300, 0.296, 0.293, 0.000)
		colorRock      (0.314, 0.310, 0.307, 0.000)
		colorSnow      (0.329, 0.324, 0.321, 1.000)
		BumpHeight      6.75461
		BumpOffset      1.35092
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
		SemiMajorAxis   0.000289099
		Period          0.00136214
		Eccentricity    6.03092e-005
		Inclination     0.000349683
		AscendingNode   169.469
		ArgOfPericenter 24.4862
		MeanAnomaly     -92.0765
	}
}

DwarfMoon	"Desten Moon 4"
{
	ParentBody     "Desten"
	Class	       "Asteroid"

	Mass            2.12603e-010
	Radius          8.38445
	InertiaMoment   0.399136

	Obliquity       58.3474
	EqAscendNode    -59.0725
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.603 0.600 0.595)

	Surface
	{
		SurfStyle       0.19821
		OceanStyle      0.99038
		Randomize      (0.778, 0.251, -0.126)
		colorDistMagn   0.80818
		colorDistFreq   0.0418484
		detailScale     228.951
		colorConversion true
		snowLevel       2
		tropicLatitude  0.995281
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.284545
		terraceProb     0.209298
		erosion         0
		montesMagn      0.606317
		montesFreq      2.67243
		montesSpiky     0.72731
		montesFraction  0.458065
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.106891
		hillsFraction   0.844424
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25174
		craterFreq      0.225729
		craterDensity   0.784461
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.445428
		volcanoTemp     1377.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.241, 0.240, 0.238, 0.000)
		colorShelf     (0.256, 0.255, 0.253, 0.000)
		colorBeach     (0.271, 0.270, 0.268, 0.000)
		colorDesert    (0.286, 0.285, 0.283, 0.000)
		colorLowland   (0.302, 0.300, 0.298, 0.000)
		colorUpland    (0.317, 0.315, 0.313, 0.000)
		colorRock      (0.332, 0.330, 0.327, 0.000)
		colorSnow      (0.347, 0.345, 0.342, 1.000)
		BumpHeight      7.546
		BumpOffset      1.5092
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
		SemiMajorAxis   0.00171512
		Period          0.0196829
		Eccentricity    0.30543
		Inclination     58.3474
		AscendingNode   -59.0725
		ArgOfPericenter -25.8581
		MeanAnomaly     -89.9829
	}
}

DwarfMoon	"Desten Moon 5"
{
	ParentBody     "Desten"
	Class	       "Asteroid"

	Mass            3.27237e-010
	Radius          9.2819
	InertiaMoment   0.395175

	RotationPeriod  377.758
	Obliquity       -44.8238
	EqAscendNode    88.2874

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.453 0.448 0.440)

	Surface
	{
		SurfStyle       0.962141
		OceanStyle      0.680585
		Randomize      (0.824, -0.827, 0.875)
		colorDistMagn   0.0540935
		colorDistFreq   0.0444606
		detailScale     253.458
		colorConversion true
		snowLevel       2
		tropicLatitude  0.872719
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.615403
		terraceProb     0.358529
		erosion         0
		montesMagn      0.381413
		montesFreq      2.48522
		montesSpiky     0.959781
		montesFraction  0.17926
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.244956
		hillsFraction   0.61614
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217761
		craterFreq      0.168299
		craterDensity   0.942176
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.465286
		volcanoTemp     1400.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.154, 0.157, 0.176, 0.050)
		colorShelf     (0.181, 0.184, 0.202, 0.040)
		colorBeach     (0.208, 0.211, 0.229, 0.030)
		colorDesert    (0.236, 0.238, 0.259, 0.020)
		colorLowland   (0.263, 0.264, 0.286, 0.030)
		colorUpland    (0.290, 0.291, 0.312, 0.050)
		colorRock      (0.317, 0.318, 0.347, 0.020)
		colorSnow      (0.317, 0.318, 0.347, 1.000)
		BumpHeight      8.35371
		BumpOffset      1.67074
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
		SemiMajorAxis   0.00205722
		Period          0.0258567
		Eccentricity    0.375717
		Inclination     -44.8238
		AscendingNode   88.2874
		ArgOfPericenter -137.638
		MeanAnomaly     -93.9818
	}
}

// http://starwars.wikia.com/wiki/Geraps_Sule
Planet	"Geraps Sule"
{
	ParentBody     "Abo"
	Class	       "GasGiant"

	Mass            3226.57
	Radius          71966.9
	InertiaMoment   0.2701

	Oblateness      0.0088388

	RotationPeriod  8.81735
	Obliquity       -73.4163
	EqAscendNode    -34.5385

	AlbedoBond      0.500338
	AlbedoGeom      0.600406
	Brightness      2

	Surface
	{
		SurfStyle       0.686243
		Randomize      (-0.824, 0.495, -0.946)
		detailScale     185103
		colorConversion true
		tropicLatitude  0.961001
		icecapLatitude  1
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     5.1766
		stripeFluct     0.392616
		stripeTwist     13.7949
		cycloneMagn     11.1446
		cycloneFreq     0.857161
		cycloneDensity  0.32961
		cycloneOctaves  5
		colorLayer0    (0.620, 0.550, 0.430, 1.000)
		colorLayer1    (0.710, 0.630, 0.480, 0.400)
		colorLayer2    (0.490, 0.400, 0.310, 0.000)
		colorLayer3    (0.720, 0.710, 0.500, 0.000)
		colorLayer4    (0.640, 0.520, 0.350, 0.000)
		colorLayer5    (0.490, 0.400, 0.310, 0.000)
		colorLayer6    (0.560, 0.460, 0.340, 0.000)
		colorLayer7    (0.560, 0.460, 0.340, 1.000)
		colorLowPlants (0.640, 0.520, 0.350, 0.000)
		colorUpPlants  (0.490, 0.400, 0.310, 0.000)
		BumpHeight      3.97281
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          23.1797
		Velocity        -82.1307
		BumpHeight      19.2054
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.2931
		mainOctaves     12
		Coverage        0.503384
		stripeZones     5.1766
		stripeFluct     0.392616
		stripeTwist     13.7949
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          100
		Density         5449.37
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0194821
		Saturation      0.862731

		Composition
		{
			H2    	91.856
			He    	7.72652
			CH4   	0.355279
			N2    	0.0451974
			O2    	0.00932571
			C2H2  	0.00338271
			C2H4  	0.0013529
			Ne    	0.00126506
			Ar    	0.000967267
			C2H6  	0.000621686
			NH3   	2.61995e-005
		}
	}

	Aurora
	{
		Height      2828.78
		NorthLat    85.6743
		NorthLon    106.847
		NorthRadius 10333.2
		NorthWidth  5860.62
		NorthRings  3
		NorthBright 1
		NorthParticles 10000
		SouthLat    -85.0815
		SouthLon    283.222
		SouthRadius 20449.3
		SouthWidth  10398.1
		SouthRings  2
		SouthBright 1
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.92073
		Period          1.14072
		Eccentricity    0.0441616
		Inclination     -0.730227
		AscendingNode   -43.5788
		ArgOfPericenter 341.91
		MeanAnomaly     317.195
	}
}


DwarfMoon	"Geraps Sule Moon 1"
{
	ParentBody     "Geraps Sule"
	Class	       "Asteroid"

	Mass            1.72372e-008
	Radius          37.3924
	InertiaMoment   0.398663

	Oblateness      0.249

	Obliquity       -0.00686058
	EqAscendNode    116.566
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.623 0.572 0.529)

	Surface
	{
		SurfStyle       0.184321
		OceanStyle      0.801359
		Randomize      (0.569, 0.662, -0.218)
		colorDistMagn   0.119172
		colorDistFreq   0.822742
		detailScale     1021.06
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.748447
		terraceProb     0.274808
		erosion         0
		montesMagn      0.576216
		montesFreq      3.12212
		montesSpiky     0.91822
		montesFraction  0.666634
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.75041
		hillsFraction   0.748643
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228244
		craterFreq      0.247756
		craterDensity   0.95099
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.567596
		volcanoTemp     1656.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.249, 0.229, 0.212, 0.000)
		colorShelf     (0.265, 0.243, 0.225, 0.000)
		colorBeach     (0.280, 0.258, 0.238, 0.000)
		colorDesert    (0.296, 0.272, 0.251, 0.000)
		colorLowland   (0.312, 0.286, 0.264, 0.000)
		colorUpland    (0.327, 0.300, 0.278, 0.000)
		colorRock      (0.343, 0.315, 0.291, 0.000)
		colorSnow      (0.358, 0.329, 0.304, 1.000)
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
		SemiMajorAxis   0.00195928
		Period          0.000882989
		Eccentricity    9.19642e-005
		Inclination     -0.00686058
		AscendingNode   116.566
		ArgOfPericenter 88.6095
		MeanAnomaly     8.85983
	}
}

DwarfMoon	"Geraps Sule Moon 2"
{
	ParentBody     "Geraps Sule"
	Class	       "Asteroid"

	Mass            2.34118e-008
	Radius          39.7505
	InertiaMoment   0.399631

	Oblateness      0.249

	Obliquity       0.0126329
	EqAscendNode    165.085
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.522 0.519 0.515)

	Surface
	{
		SurfStyle       0.810688
		OceanStyle      0.241621
		Randomize      (0.493, -0.373, -0.312)
		colorDistMagn   0.016713
		colorDistFreq   0.868651
		detailScale     1085.45
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.292219
		terraceProb     0.587324
		erosion         0
		montesMagn      0.524727
		montesFreq      2.74615
		montesSpiky     0.889023
		montesFraction  0.883292
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.72472
		hillsFraction   0.717872
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230307
		craterFreq      0.192543
		craterDensity   0.920102
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.419385
		volcanoTemp     1666.25
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.204, 0.176, 0.144, 0.000)
		colorShelf     (0.209, 0.182, 0.165, 0.000)
		colorBeach     (0.245, 0.213, 0.196, 0.000)
		colorDesert    (0.266, 0.228, 0.191, 0.000)
		colorLowland   (0.292, 0.244, 0.216, 0.000)
		colorUpland    (0.324, 0.296, 0.263, 0.000)
		colorRock      (0.350, 0.322, 0.283, 0.000)
		colorSnow      (0.381, 0.342, 0.299, 1.000)
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
		SemiMajorAxis   0.00208587
		Period          0.000969931
		Eccentricity    1.54985e-005
		Inclination     0.0126329
		AscendingNode   165.085
		ArgOfPericenter -72.6497
		MeanAnomaly     -169.636
	}
}

DwarfMoon	"Geraps Sule Moon 3"
{
	ParentBody     "Geraps Sule"
	Class	       "Asteroid"

	Mass            3.17713e-008
	Radius          42.0283
	InertiaMoment   0.397458

	Oblateness      0.193519

	Obliquity       0.00744895
	EqAscendNode    12.308
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.615 0.611 0.605)

	Surface
	{
		SurfStyle       0.870674
		OceanStyle      0.22542
		Randomize      (-0.696, -0.497, -0.805)
		colorDistMagn   0.531299
		colorDistFreq   0.987262
		detailScale     1147.65
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.588777
		terraceProb     0.358088
		erosion         0
		montesMagn      0.465265
		montesFreq      2.78276
		montesSpiky     0.913834
		montesFraction  0.774537
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.13674
		hillsFraction   0.516903
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23399
		craterFreq      0.225174
		craterDensity   0.858049
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.452176
		volcanoTemp     1564.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.209, 0.214, 0.242, 0.050)
		colorShelf     (0.246, 0.250, 0.278, 0.040)
		colorBeach     (0.283, 0.287, 0.315, 0.030)
		colorDesert    (0.320, 0.324, 0.357, 0.020)
		colorLowland   (0.356, 0.360, 0.393, 0.030)
		colorUpland    (0.393, 0.397, 0.430, 0.050)
		colorRock      (0.430, 0.434, 0.478, 0.020)
		colorSnow      (0.430, 0.434, 0.478, 1.000)
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
		SemiMajorAxis   0.00242963
		Period          0.00121932
		Eccentricity    7.67658e-005
		Inclination     0.00744895
		AscendingNode   12.308
		ArgOfPericenter -162.71
		MeanAnomaly     -99.9292
	}
}

Moon	"Geraps Sule Moon 4"
{
	ParentBody     "Geraps Sule"
	Class	       "Oceania"

	Mass            2.36472
	Radius          9819.32
	InertiaMoment   0.33006

	Oblateness      0.00615713

	Obliquity       0.353774
	EqAscendNode    -74.0776
	TidalLocked     true

	AlbedoBond      0.382898
	AlbedoGeom      0.459477
	Brightness      2
	Color          (0.628 0.488 0.394)

	Surface
	{
		SurfStyle       0.327185
		OceanStyle      0.382067
		Randomize      (-0.512, 0.758, 0.224)
		colorDistMagn   0.059119
		colorDistFreq   1170.99
		detailScale     25255.9
		colorConversion true
		seaLevel        0.97487
		snowLevel       2
		tropicLatitude  0.00985663
		icecapLatitude  10
		icecapHeight    1.0448
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        1.08444
		venusFreq       1.038
		venusMagn       0
		mareFreq        0
		mareDensity     0
		terraceProb     0.246689
		erosion         0
		montesMagn      0.195593
		montesFreq      343.416
		montesSpiky     0.982035
		montesFraction  0.578763
		dunesMagn       0.0501428
		dunesFreq       85.4006
		dunesFraction   0.924108
		hillsMagn       0.10315
		hillsFreq       1395.65
		hillsFraction   0.498532
		hills2Fraction  0.384275
		riversMagn      67.5581
		riversFreq      3.11097
		riversSin       5.99471
		riversOctaves   0
		canyonsMagn     0.0329257
		canyonsFreq     245.134
		canyonFraction  0.451128
		cracksMagn      0.108549
		cracksFreq      0.841103
		cracksOctaves   2
		craterMagn      0.0220662
		craterFreq      80.7002
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.641236
		volcanoFreq     0.7826
		volcanoDensity  0
		volcanoOctaves  0
		volcanoActivity 2
		volcanoFlows    0
		volcanoRadius   0.518756
		volcanoTemp     1618.16
		lavaCoverTidal  0.632346
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.2029
		stripeTwist     0
		cycloneMagn     2.2416
		cycloneFreq     0.772705
		cycloneDensity  0.269343
		cycloneOctaves  3
		colorSea       (0.040, 0.100, 0.200, 1.000)
		colorShelf     (0.150, 0.480, 0.460, 1.000)
		colorBeach     (0.950, 0.950, 0.950, 1.308)
		colorDesert    (0.770, 0.770, 0.470, 1.308)
		colorLowland   (0.880, 0.880, 0.880, 1.308)
		colorUpland    (1.000, 1.000, 1.000, 1.308)
		colorRock      (1.000, 1.000, 1.000, 1.308)
		colorSnow      (1.000, 1.000, 1.000, 1.308)
		BumpHeight      98.2351
		BumpOffset      95.7664
		DiffMapAlpha   "Water"
		SpecBrightWater 0.65
		SpecBrightIce   0.85
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Clouds
	{
		Height          14.8398
		Velocity        101.68
		BumpHeight      6.97614
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.925735
		mainOctaves     10
		Coverage        0.304829
		stripeZones     1.2029
		stripeTwist     0
	}

	Ocean
	{
		Height          95.7664
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
	}

	NoLava          true

	Atmosphere
	{
		Model          "Venus"
		Height          72.3423
		Density         15.7016
		Pressure        11.0616
		Greenhouse      21.2884
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.00299468
		Saturation      0.722511

		Composition
		{
			CO2   	95.0834
			SO2   	4.58486
			H2O   	0.306949
			N2    	0.0248176
			CO    	1.40845e-005
			Ar    	1.27347e-005
		}
	}

	Aurora
	{
		Height      84.2946
		NorthLat    77.867
		NorthLon    35.9569
		NorthRadius 2236.64
		NorthWidth  378.734
		NorthRings  2
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -90
		SouthLon    228.555
		SouthRadius 2723.22
		SouthWidth  792.514
		SouthRings  5
		SouthBright 0.3
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00391883
		Period          0.00249681
		Eccentricity    0.00387543
		Inclination     0.353774
		AscendingNode   -74.0776
		ArgOfPericenter -160.845
		MeanAnomaly     94.4904
	}
}

Moon	"Geraps Sule Moon 5"
{
	ParentBody     "Geraps Sule"
	Class	       "Desert"

	Mass            0.273808
	Radius          4736.62
	InertiaMoment   0.329117

	Oblateness      0.00160716

	Obliquity       1.06091
	EqAscendNode    -71.1345
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.776 0.755 0.722)

	Surface
	{
		SurfStyle       0.732211
		OceanStyle      0.291682
		Randomize      (0.491, -0.339, 0.951)
		colorDistMagn   0.0550292
		colorDistFreq   483.671
		detailScale     12182.8
		colorConversion true
		seaLevel        0.0611238
		snowLevel       2
		tropicLatitude  0.030118
		icecapLatitude  0.889992
		icecapHeight    0.0673121
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.18613
		venusFreq       0.401171
		venusMagn       0.486411
		mareFreq        0.852741
		mareDensity     0.0502592
		terraceProb     0.289847
		erosion         0
		montesMagn      0.235516
		montesFreq      176.115
		montesSpiky     0.975086
		montesFraction  0.604124
		dunesMagn       0.0456517
		dunesFreq       52.2135
		dunesFraction   0.745024
		hillsMagn       0.167457
		hillsFreq       676.677
		hillsFraction   0
		hills2Fraction  0
		riversMagn      64.5882
		riversFreq      3.4826
		riversSin       6.46592
		riversOctaves   0
		canyonsMagn     0.0489432
		canyonsFreq     139.027
		canyonFraction  0
		cracksMagn      0.0739856
		cracksFreq      0.424786
		cracksOctaves   0
		craterMagn      0.616339
		craterFreq      14.5867
		craterDensity   0.403515
		craterOctaves   5.54103
		volcanoMagn     0.697446
		volcanoFreq     0.682427
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.811499
		volcanoRadius   0.55139
		volcanoTemp     1419.23
		lavaCoverTidal  0.281242
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.640, 0.620, 0.420, 0.000)
		colorShelf     (0.680, 0.620, 0.470, 0.000)
		colorBeach     (0.400, 0.380, 0.270, 0.000)
		colorDesert    (0.800, 0.680, 0.500, 0.000)
		colorLowland   (0.670, 0.600, 0.490, 0.000)
		colorUpland    (0.580, 0.490, 0.350, 0.000)
		colorRock      (0.220, 0.210, 0.210, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 0.769)
		colorLowPlants (0.670, 0.600, 0.490, 0.000)
		colorUpPlants  (0.580, 0.490, 0.350, 0.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		SpecularPower   30
		Hapke           0.392053
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Titan"
		Height          34.9241
		Density         0.0607947
		Pressure        0.0194067
		Greenhouse      0.384429
		Bright          9.0526
		Opacity         1
		SkyLight        3.01753
		Hue             0
		Saturation      1

		Composition
		{
			CO2   	87.2259
			CH4   	4.98846
			C2H4  	2.21686
			C2H2  	2.05423
			N2    	1.73947
			C2H6  	0.893674
			H2S   	0.876558
			Ar    	0.00184586
			Ne    	0.00133976
			CO    	0.000929711
			NH3   	0.000567438
			C3H8  	0.000132623
			SO2   	7.87272e-005
		}
	}

	Aurora
	{
		Height      78.9429
		NorthLat    74.1652
		NorthLon    42.1201
		NorthRadius 1520.03
		NorthWidth  444.237
		NorthRings  4
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -50.6481
		SouthLon    219.664
		SouthRadius 1416.48
		SouthWidth  361.063
		SouthRings  3
		SouthBright 0.3
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00606042
		Period          0.00480336
		Eccentricity    0.00528818
		Inclination     1.06091
		AscendingNode   -71.1345
		ArgOfPericenter -42.6206
		MeanAnomaly     63.83
	}
}

DwarfMoon	"Geraps Sule Moon 6"
{
	ParentBody     "Geraps Sule"
	Class	       "Asteroid"

	Mass            7.9685e-008
	Radius          60.1314
	InertiaMoment   0.397716

	RotationPeriod  324.31
	Obliquity       -85.8477
	EqAscendNode    116.705

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.674 0.606 0.538)

	Surface
	{
		SurfStyle       0.636077
		OceanStyle      0.244136
		Randomize      (-0.872, 0.354, -0.386)
		colorDistMagn   0.1757
		colorDistFreq   1.88909
		detailScale     1641.99
		colorConversion true
		snowLevel       2
		tropicLatitude  0.891877
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.742035
		terraceProb     0.502575
		erosion         0
		montesMagn      0.598226
		montesFreq      3.35455
		montesSpiky     0.834381
		montesFraction  0.462541
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.64908
		hillsFraction   0.375908
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.26495
		craterFreq      0.20218
		craterDensity   0.985492
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.555233
		volcanoTemp     1125.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.263, 0.206, 0.151, 0.000)
		colorShelf     (0.270, 0.212, 0.172, 0.000)
		colorBeach     (0.317, 0.249, 0.204, 0.000)
		colorDesert    (0.344, 0.267, 0.199, 0.000)
		colorLowland   (0.378, 0.285, 0.226, 0.000)
		colorUpland    (0.418, 0.346, 0.274, 0.000)
		colorRock      (0.452, 0.376, 0.296, 0.000)
		colorSnow      (0.492, 0.400, 0.312, 1.000)
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
		SemiMajorAxis   0.0309719
		Period          0.0554958
		Eccentricity    0.396541
		Inclination     -85.8477
		AscendingNode   116.705
		ArgOfPericenter -134.914
		MeanAnomaly     21.3086
	}
}

DwarfMoon	"Geraps Sule Moon 7"
{
	ParentBody     "Geraps Sule"
	Class	       "Asteroid"

	Mass            1.08714e-007
	Radius          63.845
	InertiaMoment   0.398961

	RotationPeriod  1969.9
	Obliquity       -26.9978
	EqAscendNode    -53.3974

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.610 0.455 0.345)

	Surface
	{
		SurfStyle       0.321903
		OceanStyle      0.604773
		Randomize      (-0.905, -0.613, 0.808)
		colorDistMagn   0.675672
		colorDistFreq   1.86475
		detailScale     1743.39
		colorConversion true
		snowLevel       2
		tropicLatitude  0.741413
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.477289
		terraceProb     0.500158
		erosion         0
		montesMagn      0.551525
		montesFreq      2.81964
		montesSpiky     0.872652
		montesFraction  0.70762
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.30302
		hillsFraction   0.601948
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231674
		craterFreq      0.227561
		craterDensity   0.870301
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.460669
		volcanoTemp     1514.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.244, 0.182, 0.138, 0.000)
		colorShelf     (0.259, 0.193, 0.147, 0.000)
		colorBeach     (0.274, 0.205, 0.155, 0.000)
		colorDesert    (0.290, 0.216, 0.164, 0.000)
		colorLowland   (0.305, 0.228, 0.172, 0.000)
		colorUpland    (0.320, 0.239, 0.181, 0.000)
		colorRock      (0.335, 0.250, 0.190, 0.000)
		colorSnow      (0.351, 0.262, 0.198, 1.000)
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
		SemiMajorAxis   0.0312264
		Period          0.0561813
		Eccentricity    0.29658
		Inclination     -26.9978
		AscendingNode   -53.3974
		ArgOfPericenter -55.9721
		MeanAnomaly     -83.9226
	}
}

DwarfMoon	"Geraps Sule Moon 8"
{
	ParentBody     "Geraps Sule"
	Class	       "Asteroid"

	Mass            1.48859e-007
	Radius          84.2586
	InertiaMoment   0.399883

	RotationPeriod  2539.93
	Obliquity       59.1101
	EqAscendNode    58.4907

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.630 0.626 0.624)

	Surface
	{
		SurfStyle       0.753169
		OceanStyle      0.253205
		Randomize      (0.773, -0.491, 0.307)
		colorDistMagn   0.327484
		colorDistFreq   5.5361
		detailScale     2300.82
		colorConversion true
		snowLevel       2
		tropicLatitude  0.992614
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.404733
		terraceProb     0.27503
		erosion         0
		montesMagn      0.281587
		montesFreq      2.50745
		montesSpiky     0.92034
		montesFraction  0.234851
		dunesFraction   0
		hillsMagn       0
		hillsFreq       14.6407
		hillsFraction   0.725232
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255415
		craterFreq      0.265399
		craterDensity   0.927063
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.485537
		volcanoTemp     1592.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.246, 0.213, 0.175, 0.000)
		colorShelf     (0.252, 0.219, 0.200, 0.000)
		colorBeach     (0.296, 0.257, 0.237, 0.000)
		colorDesert    (0.321, 0.275, 0.231, 0.000)
		colorLowland   (0.353, 0.294, 0.262, 0.000)
		colorUpland    (0.391, 0.357, 0.318, 0.000)
		colorRock      (0.422, 0.388, 0.343, 0.000)
		colorSnow      (0.460, 0.413, 0.362, 1.000)
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
		SemiMajorAxis   0.0318787
		Period          0.0579508
		Eccentricity    0.19709
		Inclination     59.1101
		AscendingNode   58.4907
		ArgOfPericenter 59.9231
		MeanAnomaly     -167.66
	}
}

DwarfMoon	"Geraps Sule Moon 9"
{
	ParentBody     "Geraps Sule"
	Class	       "Asteroid"

	Mass            2.04786e-007
	Radius          86.4735
	InertiaMoment   0.397941

	RotationPeriod  696.024
	Obliquity       27.3183
	EqAscendNode    137.162

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.791 0.789 0.788)

	Surface
	{
		SurfStyle       0.983762
		OceanStyle      0.92132
		Randomize      (0.029, 0.698, -0.232)
		colorDistMagn   0.517101
		colorDistFreq   2.31327
		detailScale     2361.3
		colorConversion true
		snowLevel       2
		tropicLatitude  0.33045
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.684792
		terraceProb     0.235007
		erosion         0
		montesMagn      0.437378
		montesFreq      2.38047
		montesSpiky     0.955839
		montesFraction  0.240389
		dunesFraction   0
		hillsMagn       0
		hillsFreq       21.3795
		hillsFraction   0.785564
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254281
		craterFreq      0.262042
		craterDensity   0.807647
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.531883
		volcanoTemp     1338.53
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.269, 0.276, 0.315, 0.050)
		colorShelf     (0.316, 0.323, 0.363, 0.040)
		colorBeach     (0.364, 0.371, 0.410, 0.030)
		colorDesert    (0.411, 0.418, 0.465, 0.020)
		colorLowland   (0.459, 0.465, 0.512, 0.030)
		colorUpland    (0.506, 0.513, 0.560, 0.050)
		colorRock      (0.553, 0.560, 0.623, 0.020)
		colorSnow      (0.553, 0.560, 0.623, 1.000)
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
		SemiMajorAxis   0.0324631
		Period          0.0595516
		Eccentricity    0.415553
		Inclination     27.3183
		AscendingNode   137.162
		ArgOfPericenter -40.2148
		MeanAnomaly     25.657
	}
}

DwarfMoon	"Geraps Sule Moon 10"
{
	ParentBody     "Geraps Sule"
	Class	       "Asteroid"

	Mass            2.83378e-007
	Radius          92.2998
	InertiaMoment   0.399102

	Obliquity       -26.2484
	EqAscendNode    -51.5892
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.587 0.488 0.448)

	Surface
	{
		SurfStyle       0.917628
		OceanStyle      0.0909362
		Randomize      (0.328, -0.201, -0.080)
		colorDistMagn   0.986535
		colorDistFreq   2.96558
		detailScale     2520.4
		colorConversion true
		snowLevel       2
		tropicLatitude  0.730531
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.470662
		terraceProb     0.417933
		erosion         0
		montesMagn      0.478501
		montesFreq      3.58039
		montesSpiky     0.958825
		montesFraction  0.243382
		dunesFraction   0
		hillsMagn       0
		hillsFreq       26.0237
		hillsFraction   0.63181
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.200586
		craterFreq      0.21985
		craterDensity   1.02012
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.42389
		volcanoTemp     1486.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.200, 0.171, 0.179, 0.050)
		colorShelf     (0.235, 0.200, 0.206, 0.040)
		colorBeach     (0.270, 0.229, 0.233, 0.030)
		colorDesert    (0.305, 0.259, 0.264, 0.020)
		colorLowland   (0.341, 0.288, 0.291, 0.030)
		colorUpland    (0.376, 0.317, 0.318, 0.050)
		colorRock      (0.411, 0.347, 0.354, 0.020)
		colorSnow      (0.411, 0.347, 0.354, 1.000)
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
		SemiMajorAxis   0.0329251
		Period          0.0608276
		Eccentricity    0.134451
		Inclination     -26.2484
		AscendingNode   -51.5892
		ArgOfPericenter 147.657
		MeanAnomaly     55.59
	}
}

DwarfMoon	"Geraps Sule Moon 11"
{
	ParentBody     "Geraps Sule"
	Class	       "Asteroid"

	Mass            3.94941e-007
	Radius          98.8593
	InertiaMoment   0.394106

	Obliquity       -6.82569
	EqAscendNode    -135.671
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.515 0.512 0.508)

	Surface
	{
		SurfStyle       0.562989
		OceanStyle      0.676851
		Randomize      (0.453, -0.378, 0.037)
		colorDistMagn   0.596236
		colorDistFreq   5.66998
		detailScale     2699.52
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0895849
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.366932
		terraceProb     0.212201
		erosion         0
		montesMagn      0.588878
		montesFreq      2.75051
		montesSpiky     0.967612
		montesFraction  0.61254
		dunesFraction   0
		hillsMagn       0
		hillsFreq       15.3464
		hillsFraction   0.929521
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256229
		craterFreq      0.358144
		craterDensity   0.997122
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.483457
		volcanoTemp     1189.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.201, 0.174, 0.142, 0.000)
		colorShelf     (0.206, 0.179, 0.163, 0.000)
		colorBeach     (0.242, 0.210, 0.193, 0.000)
		colorDesert    (0.263, 0.225, 0.188, 0.000)
		colorLowland   (0.289, 0.241, 0.213, 0.000)
		colorUpland    (0.319, 0.292, 0.259, 0.000)
		colorRock      (0.345, 0.318, 0.279, 0.000)
		colorSnow      (0.376, 0.338, 0.295, 1.000)
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
		SemiMajorAxis   0.0331582
		Period          0.0614744
		Eccentricity    0.0744411
		Inclination     -6.82569
		AscendingNode   -135.671
		ArgOfPericenter 152.895
		MeanAnomaly     -5.91192
	}
}

// http://starwars.wikia.com/wiki/Verla_Klest
Planet	"Verla Klest"
{
	ParentBody     "Abo"
	Class	       "GasGiant"

	Mass            0.00836156
	Radius          19715.9
	InertiaMoment   0.377852

	Oblateness      0.00236111

	RotationPeriod  49.7724
	Obliquity       -5.54256
	EqAscendNode    -78.6136

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.456 0.443 0.439)

	Surface
	{
		SurfStyle       0.685353
		OceanStyle      0.574068
		Randomize      (-0.906, -0.395, 0.704)
		colorDistMagn   0.0586199
		colorDistFreq   241.739
		detailScale     4557.42
		colorConversion true
		drivenDarkening 0
		seaLevel        -0.0634921
		snowLevel       1
		tropicLatitude  0.134678
		icecapLatitude  0.846907
		icecapHeight    0.237123
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.88964
		venusFreq       2
		venusMagn       0.198144
		mareFreq        1.1175
		mareDensity     0.00205786
		terraceProb     0
		erosion         0
		montesMagn      0.0735278
		montesFreq      110.049
		montesSpiky     0.996314
		montesFraction  0.389401
		dunesMagn       0.0429865
		dunesFreq       100
		dunesFraction   0.978987
		hillsMagn       0.144451
		hillsFreq       234.893
		hillsFraction   0.1314
		hills2Fraction  0.280189
		riversMagn      54.1617
		riversFreq      3.26745
		riversSin       5.98348
		riversOctaves   0
		canyonsMagn     0.44009
		canyonsFreq     0.825637
		canyonFraction  0
		cracksMagn      0.0263405
		cracksFreq      0.553682
		cracksOctaves   2
		craterMagn      0.655314
		craterFreq      5.71197
		craterDensity   0.822061
		craterOctaves   11
		craterRayedFactor 0.147157
		volcanoMagn     0.285585
		volcanoFreq     0.763766
		volcanoDensity  0.217828
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.163156
		volcanoRadius   0.228118
		volcanoTemp     1330.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     0
		stripeFluct     0
		stripeTwist     0
		cycloneMagn     0
		cycloneFreq     0
		cycloneDensity  0
		cycloneOctaves  0
		colorLayer0    (0.620, 0.550, 0.430, 1.000)
		colorLayer1    (0.710, 0.630, 0.480, 0.400)
		colorLayer2    (0.490, 0.400, 0.310, 0.000)
		colorLayer3    (0.720, 0.710, 0.500, 0.000)
		colorLayer4    (0.640, 0.520, 0.350, 0.000)
		colorLayer5    (0.490, 0.400, 0.310, 0.000)
		colorLayer6    (0.560, 0.460, 0.340, 0.000)
		colorLayer7    (0.560, 0.460, 0.340, 1.000)
		colorLowPlants (0.640, 0.520, 0.350, 0.000)
		colorUpPlants  (0.490, 0.400, 0.310, 0.000)
		BumpHeight      35.7143
		BumpOffset      30.9524
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}
	
	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Jupiter"
		Height          287.108
		Density         6517.24
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.0154367
		Saturation      0.979751

	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.52436
		Period          2.4498
		Eccentricity    0.0313831
		Inclination     7.62815
		AscendingNode   -70.0581
		ArgOfPericenter 339.322
		MeanAnomaly     294.472
	}
}

DwarfMoon	"Verla Klest Moon 1"
{
	ParentBody     "Verla Klest"
	Class	       "Asteroid"

	Mass            1.11735e-007
	Radius          64.9034
	InertiaMoment   0.397816

	Oblateness      0.249

	Obliquity       0.00680663
	EqAscendNode    -97.9307
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.695 0.692 0.689)

	Surface
	{
		SurfStyle       0.538513
		OceanStyle      0.800479
		Randomize      (-0.551, -0.274, -0.534)
		colorDistMagn   0.040135
		colorDistFreq   1.92686
		detailScale     1772.3
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.304585
		terraceProb     0.269511
		erosion         0
		montesMagn      0.590819
		montesFreq      4.0116
		montesSpiky     0.886714
		montesFraction  0.704596
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.71591
		hillsFraction   0.596944
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24082
		craterFreq      0.190185
		craterDensity   0.853606
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.509993
		volcanoTemp     1133.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.271, 0.235, 0.193, 0.000)
		colorShelf     (0.278, 0.242, 0.220, 0.000)
		colorBeach     (0.327, 0.284, 0.262, 0.000)
		colorDesert    (0.354, 0.304, 0.255, 0.000)
		colorLowland   (0.389, 0.325, 0.289, 0.000)
		colorUpland    (0.431, 0.394, 0.351, 0.000)
		colorRock      (0.466, 0.429, 0.379, 0.000)
		colorSnow      (0.507, 0.457, 0.399, 1.000)
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
		SemiMajorAxis   0.000485923
		Period          0.000829586
		Eccentricity    9.98722e-006
		Inclination     0.00680663
		AscendingNode   -97.9307
		ArgOfPericenter 52.494
		MeanAnomaly     44.2558
	}
}

DwarfMoon	"Verla Klest Moon 2"
{
	ParentBody     "Verla Klest"
	Class	       "Asteroid"

	Mass            1.53052e-007
	Radius          87.7034
	InertiaMoment   0.399022

	Oblateness      0.249

	Obliquity       -0.0128578
	EqAscendNode    -29.2411
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.770 0.768 0.765)

	Surface
	{
		SurfStyle       0.118223
		OceanStyle      0.985019
		Randomize      (-0.413, 0.499, 0.552)
		colorDistMagn   0.509662
		colorDistFreq   3.51355
		detailScale     2394.89
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000488281
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.512309
		terraceProb     0.163731
		erosion         0
		montesMagn      0.582299
		montesFreq      2.65054
		montesSpiky     0.834473
		montesFraction  0.858204
		dunesFraction   0
		hillsMagn       0
		hillsFreq       12.1979
		hillsFraction   0.695833
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255234
		craterFreq      0.282772
		craterDensity   0.907308
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.504947
		volcanoTemp     1424.09
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.308, 0.307, 0.306, 0.000)
		colorShelf     (0.327, 0.326, 0.325, 0.000)
		colorBeach     (0.346, 0.345, 0.344, 0.000)
		colorDesert    (0.366, 0.365, 0.364, 0.000)
		colorLowland   (0.385, 0.384, 0.383, 0.000)
		colorUpland    (0.404, 0.403, 0.402, 0.000)
		colorRock      (0.423, 0.422, 0.421, 0.000)
		colorSnow      (0.443, 0.441, 0.440, 1.000)
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
		SemiMajorAxis   0.000542603
		Period          0.00097889
		Eccentricity    8.13718e-006
		Inclination     -0.0128578
		AscendingNode   -29.2411
		ArgOfPericenter -140.476
		MeanAnomaly     -66.4853
	}
}

Moon	"Verla Klest Moon 3"
{
	ParentBody     "Verla Klest"
	Class	       "Selena"

	Mass            0.00879043
	Radius          1801.24
	InertiaMoment   0.380318

	Oblateness      0.0104443

	Obliquity       1.22614
	EqAscendNode    93.0785
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.614 0.550 0.518)

	Surface
	{
		SurfStyle       0.0293187
		OceanStyle      0.956556
		Randomize      (0.655, -0.934, -0.293)
		colorDistMagn   0.0493
		colorDistFreq   264.158
		detailScale     4632.88
		colorConversion true
		drivenDarkening 0
		seaLevel        0.244742
		snowLevel       2
		tropicLatitude  0.0294358
		icecapLatitude  10
		icecapHeight    0.192677
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.66717
		venusFreq       1.22946
		venusMagn       0
		mareFreq        1.09801
		mareDensity     0.00145684
		terraceProb     0.311956
		erosion         0
		montesMagn      0.093434
		montesFreq      85.2426
		montesSpiky     0.969848
		montesFraction  0.249687
		dunesMagn       0.0576417
		dunesFreq       2394.72
		dunesFraction   0.225341
		hillsMagn       0.106741
		hillsFreq       226.212
		hillsFraction   0.329496
		hills2Fraction  0
		riversMagn      59.5248
		riversFreq      3.18315
		riversSin       6.77095
		riversOctaves   0
		canyonsMagn     0.438384
		canyonsFreq     0.628835
		canyonFraction  0.650279
		cracksMagn      0.0359829
		cracksFreq      0.843432
		cracksOctaves   0
		craterMagn      0.509153
		craterFreq      4.60458
		craterDensity   0.642309
		craterOctaves   7.46107
		craterRayedFactor 0.0856062
		volcanoMagn     0.252109
		volcanoFreq     0.730587
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.239527
		volcanoRadius   0.22252
		volcanoTemp     1503.52
		lavaCoverTidal  0.357467
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.320, 0.320, 0.000)
		colorShelf     (0.370, 0.370, 0.370, 0.000)
		colorBeach     (0.307, 0.275, 0.259, 0.000)
		colorDesert    (0.380, 0.330, 0.295, 0.200)
		colorLowland   (0.411, 0.352, 0.331, 0.500)
		colorUpland    (0.430, 0.368, 0.342, 0.800)
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
		SemiMajorAxis   0.00107017
		Period          0.00271115
		Eccentricity    0.0298953
		Inclination     1.22614
		AscendingNode   93.0786
		ArgOfPericenter -118.029
		MeanAnomaly     -103.131
	}
}

Moon	"Verla Klest Moon 4"
{
	ParentBody     "Verla Klest"
	Class	       "Selena"

	Mass            0.0103191
	Radius          1786.29
	InertiaMoment   0.376109

	Oblateness      0.0020963

	Obliquity       0.871602
	EqAscendNode    102.793
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.710 0.708 0.704)

	Surface
	{
		SurfStyle       0.82556
		OceanStyle      0.660985
		Randomize      (-0.315, -0.588, 0.747)
		colorDistMagn   0.0857169
		colorDistFreq   210.849
		detailScale     4594.43
		colorConversion true
		drivenDarkening 0
		seaLevel        0.22488
		snowLevel       2
		tropicLatitude  0.0189826
		icecapLatitude  0.440725
		icecapHeight    0.241457
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.06702
		venusFreq       1.64507
		venusMagn       0
		mareFreq        0.736192
		mareDensity     0.00260628
		terraceProb     0.204881
		erosion         0
		montesMagn      0.10177
		montesFreq      96.5211
		montesSpiky     0.981577
		montesFraction  0.76994
		dunesMagn       0.0365796
		dunesFreq       2347.93
		dunesFraction   0.274615
		hillsMagn       0.100765
		hillsFreq       205.899
		hillsFraction   0.42546
		hills2Fraction  0
		riversMagn      58.2811
		riversFreq      3.33621
		riversSin       5.80765
		riversOctaves   0
		canyonsMagn     0.565705
		canyonsFreq     0.61822
		canyonFraction  0.470133
		cracksMagn      0.0264669
		cracksFreq      0.817764
		cracksOctaves   0
		craterMagn      0.637482
		craterFreq      6.32493
		craterDensity   0.821302
		craterOctaves   9.07823
		craterRayedFactor 0.0886374
		volcanoMagn     0.267138
		volcanoFreq     0.639546
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.322756
		volcanoRadius   0.247194
		volcanoTemp     1102.72
		lavaCoverTidal  0.194119
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.400, 0.350, 0.320, 0.000)
		colorShelf     (0.470, 0.410, 0.380, 0.000)
		colorBeach     (0.398, 0.333, 0.296, 0.000)
		colorDesert    (0.362, 0.311, 0.261, 0.000)
		colorLowland   (0.277, 0.241, 0.197, 0.000)
		colorUpland    (0.469, 0.425, 0.366, 0.000)
		colorRock      (0.670, 0.620, 0.550, 0.000)
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
		SemiMajorAxis   0.00170932
		Period          0.00547274
		Eccentricity    0.032776
		Inclination     0.871602
		AscendingNode   102.793
		ArgOfPericenter 78.6414
		MeanAnomaly     67.0202
	}
}

Moon	"Verla Klest Moon 5"
{
	ParentBody     "Verla Klest"
	Class	       "Selena"

	Mass            0.0121795
	Radius          2004.52
	InertiaMoment   0.371809

	Obliquity       0.150657
	EqAscendNode    -116.474
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.827 0.785 0.728)

	Surface
	{
		SurfStyle       0.510954
		OceanStyle      0.229412
		Randomize      (0.976, 0.659, 0.011)
		colorDistMagn   0.0929077
		colorDistFreq   238.858
		detailScale     5155.74
		colorConversion true
		drivenDarkening 0
		seaLevel        0.241696
		snowLevel       2
		tropicLatitude  0.00276213
		icecapLatitude  0.810244
		icecapHeight    0.254799
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.6578
		venusFreq       0.79631
		venusMagn       0
		mareFreq        0.864948
		mareDensity     0.00242923
		terraceProb     0.563569
		erosion         0
		montesMagn      0.0810215
		montesFreq      80.1378
		montesSpiky     0.982267
		montesFraction  0.378953
		dunesMagn       0.0418657
		dunesFreq       2623.92
		dunesFraction   0.706712
		hillsMagn       0.123791
		hillsFreq       244.87
		hillsFraction   0.155105
		hills2Fraction  0
		riversMagn      63.9983
		riversFreq      2.32543
		riversSin       5.91643
		riversOctaves   0
		canyonsMagn     0.486093
		canyonsFreq     0.609062
		canyonFraction  0.417412
		cracksMagn      0.0498924
		cracksFreq      0.576376
		cracksOctaves   0
		craterMagn      0.608092
		craterFreq      6.32353
		craterDensity   0.861455
		craterOctaves   10.4585
		craterRayedFactor 0.17542
		volcanoMagn     0.322669
		volcanoFreq     0.801151
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.193917
		volcanoRadius   0.259269
		volcanoTemp     1685.42
		lavaCoverTidal  0.0546966
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.430, 0.400, 0.370, 0.000)
		colorShelf     (0.620, 0.600, 0.530, 0.000)
		colorBeach     (0.513, 0.479, 0.393, 0.000)
		colorDesert    (0.537, 0.486, 0.400, 0.000)
		colorLowland   (0.422, 0.361, 0.306, 0.000)
		colorUpland    (0.620, 0.557, 0.451, 0.000)
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

	Atmosphere
	{
		Model          "Pluto"
		Height          101.714
		Density         4.17547e-008
		Pressure        2.29209e-009
		Bright          0.529835
		Opacity         0
		SkyLight        0.176612
		Hue             0.0428019
		Saturation      1

		Composition
		{
			Xe    	100
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0027302
		Period          0.0110473
		Eccentricity    0.0424879
		Inclination     0.150657
		AscendingNode   -116.474
		ArgOfPericenter -1.14272
		MeanAnomaly     179.075
	}
}

Moon	"Verla Klest Moon 6"
{
	ParentBody     "Verla Klest"
	Class	       "IceWorld"

	Mass            0.0144725
	Radius          1995.42
	InertiaMoment   0.367109

	Obliquity       -1.42897
	EqAscendNode    -145.125
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.588 0.583 0.578)

	Surface
	{
		SurfStyle       0.0016039
		OceanStyle      0.96731
		Randomize      (0.692, 0.541, -0.996)
		colorDistMagn   0.0589785
		colorDistFreq   204.102
		detailScale     5132.33
		colorConversion true
		drivenDarkening 0
		seaLevel        0.231682
		snowLevel       2
		tropicLatitude  0.0149461
		icecapLatitude  0.894601
		icecapHeight    0.234848
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.64092
		venusFreq       1.17638
		venusMagn       0.149531
		mareFreq        1.15976
		mareDensity     0.00276159
		terraceProb     0.590509
		erosion         0
		montesMagn      0.0835819
		montesFreq      73.6337
		montesSpiky     0.930346
		montesFraction  0.641076
		dunesMagn       0.0430303
		dunesFreq       2605.32
		dunesFraction   0.196662
		hillsMagn       0.139436
		hillsFreq       217.252
		hillsFraction   0.494563
		hills2Fraction  0.0686319
		riversMagn      66.2752
		riversFreq      2.54811
		riversSin       5.79185
		riversOctaves   0
		canyonsMagn     0.492683
		canyonsFreq     0.774335
		canyonFraction  0
		cracksMagn      0.0777131
		cracksFreq      1.29357
		cracksOctaves   2
		craterMagn      0.59994
		craterFreq      6.03501
		craterDensity   0.870895
		craterOctaves   11
		craterRayedFactor 0.144487
		volcanoMagn     0.29625
		volcanoFreq     0.650109
		volcanoDensity  0.195699
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.15605
		volcanoRadius   0.275913
		volcanoTemp     1658.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.588, 0.583, 0.578, 0.500)
		colorShelf     (0.559, 0.554, 0.549, 0.500)
		colorBeach     (0.412, 0.408, 0.404, 0.750)
		colorDesert    (0.500, 0.496, 0.491, 1.000)
		colorLowland   (0.518, 0.513, 0.508, 1.000)
		colorUpland    (0.547, 0.543, 0.537, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.518, 0.513, 0.508, 1.000)
		colorUpPlants  (0.547, 0.543, 0.537, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.999998
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Pluto"
		Height          113.866
		Density         1.85747e-007
		Pressure        1.5323e-008
		Greenhouse      0.000250731
		Bright          0.714142
		Opacity         0
		SkyLight        0.238047
		Hue             -0.0494467
		Saturation      1

		Composition
		{
			Kr    	99.9542
			Xe    	0.0457781
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00436079
		Period          0.0222999
		Eccentricity    0.0490645
		Inclination     -1.42897
		AscendingNode   -145.125
		ArgOfPericenter 55.6572
		MeanAnomaly     -159.105
	}
}

DwarfMoon	"Verla Klest Moon 7"
{
	ParentBody     "Verla Klest"
	Class	       "Asteroid"

	Mass            8.13693e-007
	Radius          139.098
	InertiaMoment   0.398224

	RotationPeriod  7331.15
	Obliquity       53.3832
	EqAscendNode    -79.6815

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.652 0.558 0.395)

	Surface
	{
		SurfStyle       0.287795
		OceanStyle      0.670424
		Randomize      (0.384, -0.826, -0.363)
		colorDistMagn   0.281846
		colorDistFreq   9.89738
		detailScale     3798.32
		colorConversion true
		snowLevel       2
		tropicLatitude  0.970682
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.552033
		terraceProb     0.305382
		erosion         0
		montesMagn      0.495499
		montesFreq      2.41256
		montesSpiky     0.991217
		montesFraction  0.349654
		dunesFraction   0
		hillsMagn       0
		hillsFreq       52.6412
		hillsFraction   0.702057
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.270153
		craterFreq      0.579878
		craterDensity   1.00349
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.484579
		volcanoTemp     1498.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.261, 0.223, 0.158, 0.000)
		colorShelf     (0.277, 0.237, 0.168, 0.000)
		colorBeach     (0.293, 0.251, 0.178, 0.000)
		colorDesert    (0.310, 0.265, 0.188, 0.000)
		colorLowland   (0.326, 0.279, 0.198, 0.000)
		colorUpland    (0.342, 0.293, 0.208, 0.000)
		colorRock      (0.359, 0.307, 0.217, 0.000)
		colorSnow      (0.375, 0.321, 0.227, 1.000)
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
		SemiMajorAxis   0.0265228
		Period          0.334534
		Eccentricity    0.435617
		Inclination     53.3832
		AscendingNode   -79.6815
		ArgOfPericenter -80.8038
		MeanAnomaly     157.854
	}
}

DwarfMoon	"Verla Klest Moon 8"
{
	ParentBody     "Verla Klest"
	Class	       "Asteroid"

	Mass            1.17156e-006
	Radius          149.837
	InertiaMoment   0.399295

	Obliquity       -59.7727
	EqAscendNode    24.5422
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.559 0.554 0.549)

	Surface
	{
		SurfStyle       0.341968
		OceanStyle      0.973936
		Randomize      (0.728, -0.330, 0.386)
		colorDistMagn   0.882512
		colorDistFreq   10.5456
		detailScale     4091.55
		colorConversion true
		snowLevel       2
		tropicLatitude  0.90488
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.653285
		terraceProb     0.215326
		erosion         0
		montesMagn      0.608081
		montesFreq      3.64663
		montesSpiky     0.878881
		montesFraction  0.314953
		dunesFraction   0
		hillsMagn       0
		hillsFreq       47.2732
		hillsFraction   0.505302
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.283592
		craterFreq      0.811197
		craterDensity   0.726095
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.548928
		volcanoTemp     1504.24
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.223, 0.222, 0.220, 0.000)
		colorShelf     (0.237, 0.235, 0.233, 0.000)
		colorBeach     (0.251, 0.249, 0.247, 0.000)
		colorDesert    (0.265, 0.263, 0.261, 0.000)
		colorLowland   (0.279, 0.277, 0.275, 0.000)
		colorUpland    (0.293, 0.291, 0.288, 0.000)
		colorRock      (0.307, 0.305, 0.302, 0.000)
		colorSnow      (0.321, 0.319, 0.316, 1.000)
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
		SemiMajorAxis   0.0267833
		Period          0.339475
		Eccentricity    0.00195622
		Inclination     -59.7727
		AscendingNode   24.5422
		ArgOfPericenter 119.732
		MeanAnomaly     164.484
	}
}

DwarfMoon	"Verla Klest Moon 9"
{
	ParentBody     "Verla Klest"
	Class	       "Asteroid"

	Mass            1.71249e-006
	Radius          163.32
	InertiaMoment   0.396432

	Obliquity       70.6102
	EqAscendNode    -21.8039
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.643 0.640 0.639)

	Surface
	{
		SurfStyle       0.246766
		OceanStyle      0.929692
		Randomize      (0.257, 0.230, 0.501)
		colorDistMagn   0.623153
		colorDistFreq   13.9808
		detailScale     4459.71
		colorConversion true
		snowLevel       2
		tropicLatitude  0.698196
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.40517
		terraceProb     0.781346
		erosion         0
		montesMagn      0.452125
		montesFreq      3.14018
		montesSpiky     0.996327
		montesFraction  0.412861
		dunesFraction   0
		hillsMagn       0
		hillsFreq       54.9945
		hillsFraction   0.745558
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258349
		craterFreq      1.01106
		craterDensity   0.762433
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.42847
		volcanoTemp     1290.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.257, 0.256, 0.255, 0.000)
		colorShelf     (0.273, 0.272, 0.271, 0.000)
		colorBeach     (0.289, 0.288, 0.287, 0.000)
		colorDesert    (0.305, 0.304, 0.303, 0.000)
		colorLowland   (0.321, 0.320, 0.319, 0.000)
		colorUpland    (0.337, 0.336, 0.335, 0.000)
		colorRock      (0.354, 0.352, 0.351, 0.000)
		colorSnow      (0.370, 0.368, 0.367, 1.000)
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
		SemiMajorAxis   0.0272625
		Period          0.348624
		Eccentricity    0.260786
		Inclination     70.6102
		AscendingNode   -21.8039
		ArgOfPericenter 89.2351
		MeanAnomaly     54.8198
	}
}

// http://starwars.wikia.com/wiki/Ding_Briar
Planet	"Ding Briar"
{
	ParentBody     "Abo"
	Class	       "GasGiant"

	Mass            55.7621
	Radius          28710.8
	InertiaMoment   0.212237

	Oblateness      0.0378694

	RotationPeriod  7.40563
	Obliquity       -73.821
	EqAscendNode    168.758

	AlbedoBond      0.422165
	AlbedoGeom      0.506598
	Brightness      2

	Surface
	{
		SurfStyle       0.782128
		Randomize      (0.389, -0.694, -0.253)
		detailScale     73845.8
		colorConversion true
		tropicLatitude  0.970631
		icecapLatitude  1
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     7.82091
		stripeFluct     0.350696
		stripeTwist     10.4204
		cycloneMagn     9.15039
		cycloneFreq     0.585203
		cycloneDensity  0.527067
		cycloneOctaves  1
		colorLayer0    (0.120, 0.200, 0.480, 1.000)
		colorLayer1    (0.330, 0.400, 0.720, 1.000)
		colorLayer2    (0.330, 0.400, 0.720, 1.000)
		colorLayer3    (0.600, 0.600, 0.600, 1.000)
		colorLayer4    (0.350, 0.430, 0.770, 1.000)
		colorLayer5    (0.470, 0.540, 0.850, 1.000)
		colorLayer6    (0.600, 0.650, 0.910, 1.000)
		colorLayer7    (0.990, 0.990, 1.000, 1.000)
		colorLowPlants (0.350, 0.430, 0.770, 1.000)
		colorUpPlants  (0.470, 0.540, 0.850, 1.000)
		BumpHeight      12.0562
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          39.5605
		Velocity        638.647
		BumpHeight      27.5052
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.15783
		mainOctaves     12
		Coverage        0.110827
		stripeZones     7.82091
		stripeFluct     0.350696
		stripeTwist     10.4204
	}

	Clouds
	{
		Height          67.0664
		Velocity        -36.1873
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		ModulateColor  (1.000 1.000 1.000 0.555)
		mainFreq        1.15783
		mainOctaves     12
		Coverage        0.110827
		stripeZones     7.82091
		stripeFluct     0.350696
		stripeTwist     10.4204
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          287.108
		Density         6517.24
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.0154367
		Saturation      0.979751

		Composition
		{
			H2    	92.5117
			He    	7.41099
			CH4   	0.037847
			N2    	0.0309549
			O2    	0.00660628
			Ne    	0.00108421
			Ar    	0.000847674
		}
	}

	Aurora
	{
		Height      767.302
		NorthLat    65.5477
		NorthLon    32.9683
		NorthRadius 6430.66
		NorthWidth  1526.14
		NorthRings  3
		NorthBright 1
		NorthParticles 10000
		SouthLat    -80.0397
		SouthLon    190.97
		SouthRadius 8100.69
		SouthWidth  2759.79
		SouthRings  2
		SouthBright 1
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	Rings
	{
		InnerRadius     36191
		OuterRadius     45097
		RotationPeriod  3.04024
		RotationOffset  0
		FrontBright     0.870019
		BackBright      0.585704
		Density         0.774314
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.09595
		Period          7.08973
		Eccentricity    0.0584503
		Inclination     2.33789
		AscendingNode   164.959
		ArgOfPericenter 121.901
		MeanAnomaly     332.842
	}
}

DwarfMoon	"Ding Briar Moon 1"
{
	ParentBody     "Ding Briar"
	Class	       "Asteroid"

	Mass            4.21516e-007
	Radius          100.387
	InertiaMoment   0.399621

	Oblateness      0.249

	Obliquity       0.00520825
	EqAscendNode    -56.5813
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.607 0.479 0.415)

	Surface
	{
		SurfStyle       0.381717
		OceanStyle      0.705213
		Randomize      (0.971, -0.178, 0.533)
		colorDistMagn   0.0238188
		colorDistFreq   7.0616
		detailScale     2741.25
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.628575
		terraceProb     0.100113
		erosion         0
		montesMagn      0.477287
		montesFreq      2.84151
		montesSpiky     0.989928
		montesFraction  0.609083
		dunesFraction   0
		hillsMagn       0
		hillsFreq       21.0499
		hillsFraction   0.757279
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24521
		craterFreq      0.251681
		craterDensity   0.840919
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.57648
		volcanoTemp     1398.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.243, 0.192, 0.166, 0.000)
		colorShelf     (0.258, 0.204, 0.176, 0.000)
		colorBeach     (0.273, 0.216, 0.187, 0.000)
		colorDesert    (0.288, 0.228, 0.197, 0.000)
		colorLowland   (0.304, 0.240, 0.207, 0.000)
		colorUpland    (0.319, 0.252, 0.218, 0.000)
		colorRock      (0.334, 0.264, 0.228, 0.000)
		colorSnow      (0.349, 0.276, 0.238, 1.000)
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
		SemiMajorAxis   0.000918744
		Period          0.00080598
		Eccentricity    1.83547e-005
		Inclination     0.00520825
		AscendingNode   -56.5813
		ArgOfPericenter 138.068
		MeanAnomaly     171.755
	}
}

DwarfMoon	"Ding Briar Moon 2"
{
	ParentBody     "Ding Briar"
	Class	       "Asteroid"

	Mass            5.93652e-007
	Radius          133.982
	InertiaMoment   0.397435

	Oblateness      0.249

	Obliquity       -0.0149483
	EqAscendNode    -60.9292
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.521 0.472 0.421)

	Surface
	{
		SurfStyle       0.88446
		OceanStyle      0.507194
		Randomize      (-0.010, -0.390, -0.131)
		colorDistMagn   0.70545
		colorDistFreq   7.59798
		detailScale     3658.6
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000488281
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.344511
		terraceProb     0.148947
		erosion         0
		montesMagn      0.51382
		montesFreq      3.15906
		montesSpiky     0.999035
		montesFraction  0.887821
		dunesFraction   0
		hillsMagn       0
		hillsFreq       54.6935
		hillsFraction   0.837936
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.202746
		craterFreq      0.715109
		craterDensity   0.869242
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.47599
		volcanoTemp     1405.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.177, 0.165, 0.169, 0.050)
		colorShelf     (0.208, 0.193, 0.194, 0.040)
		colorBeach     (0.240, 0.222, 0.219, 0.030)
		colorDesert    (0.271, 0.250, 0.249, 0.020)
		colorLowland   (0.302, 0.278, 0.274, 0.030)
		colorUpland    (0.333, 0.307, 0.299, 0.050)
		colorRock      (0.365, 0.335, 0.333, 0.020)
		colorSnow      (0.365, 0.335, 0.333, 1.000)
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
		SemiMajorAxis   0.00125408
		Period          0.00128535
		Eccentricity    3.21451e-005
		Inclination     -0.0149483
		AscendingNode   -60.9292
		ArgOfPericenter 19.8865
		MeanAnomaly     57.0223
	}
}

Moon	"Ding Briar Moon 3"
{
	ParentBody     "Ding Briar"
	Class	       "Desert"

	Mass            0.126644
	Radius          4279.17
	InertiaMoment   0.331993

	Oblateness      0.006944

	Obliquity       -1.20426
	EqAscendNode    -85.3162
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.768 0.656 0.604)

	Surface
	{
		SurfStyle       0.168282
		OceanStyle      0.769526
		Randomize      (0.481, -0.449, 0.339)
		colorDistMagn   0.0562987
		colorDistFreq   478.424
		detailScale     11006.3
		colorConversion true
		seaLevel        0.0784043
		snowLevel       2
		tropicLatitude  0.0309088
		icecapLatitude  10
		icecapHeight    0.132404
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        1.20826
		venusFreq       1.35767
		venusMagn       0
		mareFreq        1.90242
		mareDensity     0.0161936
		terraceProb     0.605673
		erosion         0
		montesMagn      0.178424
		montesFreq      173.556
		montesSpiky     0.868058
		montesFraction  0.749035
		dunesMagn       0.0522729
		dunesFreq       23.7752
		dunesFraction   0.808363
		hillsMagn       0.164173
		hillsFreq       494.353
		hillsFraction   0
		hills2Fraction  0
		riversMagn      63.5084
		riversFreq      2.90162
		riversSin       5.21431
		riversOctaves   0
		canyonsMagn     0.0442112
		canyonsFreq     115.602
		canyonFraction  0
		cracksMagn      0.133578
		cracksFreq      0.372263
		cracksOctaves   0
		craterMagn      0.634376
		craterFreq      10.9828
		craterDensity   0.284516
		craterOctaves   4.16808
		volcanoMagn     0.753388
		volcanoFreq     0.739906
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.786339
		volcanoRadius   0.492517
		volcanoTemp     1544.82
		lavaCoverTidal  0.6336
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.240, 0.230, 0.230, 0.000)
		colorShelf     (0.380, 0.360, 0.350, 0.000)
		colorBeach     (0.550, 0.520, 0.480, 0.000)
		colorDesert    (0.520, 0.490, 0.470, 0.000)
		colorLowland   (0.460, 0.440, 0.410, 0.000)
		colorUpland    (0.390, 0.360, 0.330, 0.000)
		colorRock      (0.170, 0.160, 0.160, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 0.769)
		colorLowPlants (0.460, 0.440, 0.410, 0.000)
		colorUpPlants  (0.390, 0.360, 0.330, 0.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		SpecularPower   30
		Hapke           0.959945
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          213.958
		Density         0.0040055
		Pressure        0.00577905
		Greenhouse      0.812757
		Bright          5.2545
		Opacity         1
		SkyLight        1.7515
		Hue             0
		Saturation      0.992477

		Composition
		{
			CO2   	49.0087
			H2O   	37.445
			CH4   	8.12395
			C2H2  	3.22563
			H2S   	0.891392
			SO2   	0.503189
			C2H4  	0.263224
			N2    	0.166744
			NH3   	0.15378
			C3H8  	0.145542
			C2H6  	0.072713
			CO    	8.30986e-005
			Ar    	2.7631e-005
			Cl2   	1.70951e-005
			Ne    	1.43691e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00217388
		Period          0.00293303
		Eccentricity    0.0467082
		Inclination     -1.20426
		AscendingNode   -85.3162
		ArgOfPericenter 11.1927
		MeanAnomaly     109.051
	}
}

Moon	"Ding Briar Moon 4"
{
	ParentBody     "Ding Briar"
	Class	       "Oceania"

	Mass            1.53539
	Radius          8666.04
	InertiaMoment   0.330814

	Oblateness      0.00106359

	Obliquity       0.519457
	EqAscendNode    9.23703
	TidalLocked     true

	AlbedoBond      0.436869
	AlbedoGeom      0.524243
	Brightness      2
	Color          (0.421 0.416 0.415)

	Surface
	{
		SurfStyle       0.990852
		OceanStyle      0.617564
		Randomize      (-0.635, -0.542, -0.726)
		colorDistMagn   0.0529184
		colorDistFreq   1228.1
		detailScale     22289.6
		colorConversion true
		seaLevel        0.959186
		snowLevel       0.97025
		tropicLatitude  0.0180723
		icecapLatitude  0.597137
		icecapHeight    0.996974
		climatePole     0.9375
		climateTropic   0.451804
		climateEquator  0.6875
		heightTempGrad  0.485696
		tropicWidth     0.203511
		mainFreq        1.2673
		venusFreq       0.55372
		venusMagn       0.426817
		mareFreq        0
		mareDensity     0
		terraceProb     0.509396
		erosion         0
		montesMagn      0.203476
		montesFreq      312.906
		montesSpiky     0.978504
		montesFraction  0.469904
		dunesMagn       0.0426321
		dunesFreq       80.8591
		dunesFraction   0.692012
		hillsMagn       0.0514885
		hillsFreq       1235.28
		hillsFraction   0.996188
		hills2Fraction  0.677679
		riversMagn      55.8865
		riversFreq      3.20299
		riversSin       7.13614
		riversOctaves   0
		canyonsMagn     0.0473658
		canyonsFreq     245.326
		canyonFraction  0.542386
		cracksMagn      0.106513
		cracksFreq      0.566943
		cracksOctaves   2
		craterMagn      0.0187331
		craterFreq      74.2342
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.656235
		volcanoFreq     0.692719
		volcanoDensity  0
		volcanoOctaves  0
		volcanoActivity 2
		volcanoFlows    0
		volcanoRadius   0.593119
		volcanoTemp     1719.15
		lavaCoverTidal  0.553203
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.80211
		stripeTwist     0.149293
		cycloneMagn     2.19229
		cycloneFreq     0.860448
		cycloneDensity  0.352637
		cycloneOctaves  3
		colorSea       (0.040, 0.200, 0.200, 1.000)
		colorShelf     (0.150, 0.370, 0.370, 1.000)
		colorBeach     (0.950, 0.950, 0.950, 1.308)
		colorDesert    (0.770, 0.770, 0.470, 1.308)
		colorLowland   (0.880, 0.880, 0.880, 1.308)
		colorUpland    (1.000, 1.000, 1.000, 1.308)
		colorRock      (1.000, 1.000, 1.000, 1.308)
		colorSnow      (1.000, 1.000, 1.000, 1.308)
		BumpHeight      105.224
		BumpOffset      100.929
		DiffMapAlpha   "Water"
		SpecBrightWater 0.65
		SpecBrightIce   0.85
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Clouds
	{
		Height          4.15234
		Velocity        115.782
		BumpHeight      4.15206
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.12195
		mainOctaves     10
		Coverage        0.394782
		stripeZones     2.80211
		stripeTwist     0.149293
	}

	Clouds
	{
		Height          8.30371
		Velocity        18.6329
		BumpHeight      4.15206
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.12195
		mainOctaves     10
		Coverage        0.394782
		stripeZones     2.80211
		stripeTwist     0.149293
	}

	Clouds
	{
		Height          12.4561
		Velocity        158.814
		BumpHeight      4.15206
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.12195
		mainOctaves     10
		Coverage        0.394782
		stripeZones     2.80211
		stripeTwist     0.149293
	}

	Ocean
	{
		Height          100.929
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
	}

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          51.5085
		Density         3.80861
		Pressure        1.89936
		Greenhouse      4.00663
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0213613
		Saturation      0.926485

		Composition
		{
			CO2   	97.111
			SO2   	2.84786
			N2    	0.0292971
			H2O   	0.00913939
			NH3   	0.00108912
			H2S   	0.00100956
			CH4   	0.000329811
			C2H2  	9.85175e-005
			C2H4  	6.43622e-005
			Ne    	3.85049e-005
			CO    	1.37505e-005
			Ar    	1.00398e-005
		}
	}

	Aurora
	{
		Height      181.269
		NorthLat    75.2845
		NorthLon    -123.98
		NorthRadius 2908.53
		NorthWidth  697.396
		NorthRings  4
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -51.1189
		SouthLon    80.6591
		SouthRadius 3111.18
		SouthWidth  736.007
		SouthRings  3
		SouthBright 0.3
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00358082
		Period          0.00618975
		Eccentricity    0.0270367
		Inclination     0.519457
		AscendingNode   9.23703
		ArgOfPericenter -44.3036
		MeanAnomaly     105.865
	}
}

Moon	"Ding Briar Moon 5"
{
	ParentBody     "Ding Briar"
	Class	       "Desert"

	Mass            0.188696
	Radius          4856.95
	InertiaMoment   0.329877

	Obliquity       -0.773687
	EqAscendNode    147.374
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.564 0.560 0.555)

	Surface
	{
		SurfStyle       0.257492
		OceanStyle      0.961268
		Randomize      (-0.993, 0.924, 0.086)
		colorDistMagn   0.0918723
		colorDistFreq   537.899
		detailScale     12492.4
		colorConversion true
		seaLevel        0.126681
		snowLevel       2
		tropicLatitude  0.00758797
		icecapLatitude  0.766296
		icecapHeight    0.145252
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.410247
		venusFreq       1.47853
		venusMagn       0.411833
		mareFreq        1.05844
		mareDensity     0.0213041
		terraceProb     0.123993
		erosion         0
		montesMagn      0.198716
		montesFreq      217.876
		montesSpiky     0.925149
		montesFraction  0.827496
		dunesMagn       0.0609187
		dunesFreq       52.2906
		dunesFraction   0.698229
		hillsMagn       0.101088
		hillsFreq       452.531
		hillsFraction   0
		hills2Fraction  0
		riversMagn      64.8934
		riversFreq      3.34152
		riversSin       5.09189
		riversOctaves   0
		canyonsMagn     0.0242729
		canyonsFreq     127.753
		canyonFraction  0
		cracksMagn      0.131552
		cracksFreq      0.444706
		cracksOctaves   0
		craterMagn      0.637105
		craterFreq      10.4454
		craterDensity   0.704504
		craterOctaves   9.59065
		volcanoMagn     0.665405
		volcanoFreq     0.485318
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.361985
		volcanoRadius   0.469476
		volcanoTemp     964.905
		lavaCoverTidal  0.214474
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.640, 0.620, 0.420, 0.000)
		colorShelf     (0.680, 0.620, 0.470, 0.000)
		colorBeach     (0.740, 0.730, 0.610, 0.000)
		colorDesert    (0.450, 0.420, 0.380, 0.000)
		colorLowland   (0.530, 0.480, 0.400, 0.000)
		colorUpland    (0.600, 0.540, 0.420, 0.000)
		colorRock      (0.170, 0.160, 0.160, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 0.769)
		colorLowPlants (0.530, 0.480, 0.400, 0.000)
		colorUpPlants  (0.600, 0.540, 0.420, 0.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		SpecularPower   30
		Hapke           0.954294
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          52.1026
		Density         0.00457057
		Pressure        0.00180873
		Greenhouse      0.778934
		Bright          5.39503
		Opacity         1
		SkyLight        1.79834
		Hue             0
		Saturation      1

		Composition
		{
			CH4   	96.5929
			N2    	3.38332
			Ar    	0.0215579
			CO    	0.0014955
			Ne    	0.000678169
			Kr    	4.66781e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00589836
		Period          0.0131077
		Eccentricity    0.0282209
		Inclination     -0.773687
		AscendingNode   147.374
		ArgOfPericenter -85.5184
		MeanAnomaly     57.8897
	}
}

Moon	"Ding Briar Moon 6"
{
	ParentBody     "Ding Briar"
	Class	       "Selena"

	Mass            0.236023
	Radius          4897.43
	InertiaMoment   0.328911

	Obliquity       0.143542
	EqAscendNode    -50.0913
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.615 0.535 0.432)

	Surface
	{
		SurfStyle       0.926033
		OceanStyle      0.820367
		Randomize      (0.534, -0.473, 0.813)
		colorDistMagn   0.0768103
		colorDistFreq   723.908
		detailScale     12596.5
		colorConversion true
		drivenDarkening 0
		seaLevel        0.228073
		snowLevel       2
		tropicLatitude  0.00454127
		icecapLatitude  0.713735
		icecapHeight    0.246016
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.92163
		venusFreq       1.04966
		venusMagn       0
		mareFreq        1.42485
		mareDensity     0.0312562
		terraceProb     0.382371
		erosion         0
		montesMagn      0.254613
		montesFreq      288.056
		montesSpiky     0.968257
		montesFraction  0.094317
		dunesMagn       0.0422213
		dunesFreq       6467.27
		dunesFraction   0.232952
		hillsMagn       0.105826
		hillsFreq       624.126
		hillsFraction   0.380244
		hills2Fraction  0
		riversMagn      61.3478
		riversFreq      2.8836
		riversSin       6.46282
		riversOctaves   0
		canyonsMagn     0.67117
		canyonsFreq     1.57718
		canyonFraction  0.860209
		cracksMagn      0.029829
		cracksFreq      2.43634
		cracksOctaves   0
		craterMagn      0.607481
		craterFreq      12.1931
		craterDensity   0.830326
		craterOctaves   12.3289
		craterRayedFactor 0.215189
		volcanoMagn     0.534313
		volcanoFreq     0.640285
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.259334
		volcanoRadius   0.551135
		volcanoTemp     1338.08
		lavaCoverTidal  0.0573592
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.440, 0.450, 0.370, 0.000)
		colorShelf     (0.580, 0.550, 0.430, 0.000)
		colorBeach     (0.437, 0.353, 0.251, 0.000)
		colorDesert    (0.510, 0.412, 0.277, 0.000)
		colorLowland   (0.406, 0.311, 0.207, 0.000)
		colorUpland    (0.363, 0.278, 0.194, 0.000)
		colorRock      (0.330, 0.250, 0.230, 0.000)
		colorSnow      (0.940, 0.910, 0.870, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.995967
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Pluto"
		Height          95.6799
		Density         0.000403319
		Pressure        6.36013e-005
		Greenhouse      0.0728312
		Bright          3.31994
		Opacity         0
		SkyLight        1.10665
		Hue             -0.0058585
		Saturation      1

		Composition
		{
			N2    	97.0695
			CO    	2.58225
			Ar    	0.28556
			CH4   	0.0607082
			Ne    	0.00189629
			O2    	6.75656e-005
		}
	}

	Aurora
	{
		Height      86.8016
		NorthLat    67.9201
		NorthLon    7.81544
		NorthRadius 1042.42
		NorthWidth  260.916
		NorthRings  4
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -63.3275
		SouthLon    176.267
		SouthRadius 1109.22
		SouthWidth  342.675
		SouthRings  3
		SouthBright 0.3
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00971581
		Period          0.0277091
		Eccentricity    0.0457921
		Inclination     0.143542
		AscendingNode   -50.0913
		ArgOfPericenter -20.3364
		MeanAnomaly     -24.8424
	}
}

Moon	"Ding Briar Moon 7"
{
	ParentBody     "Ding Briar"
	Class	       "IceWorld"

	Mass            0.302236
	Radius          5633.03
	InertiaMoment   0.327553

	Obliquity       0.774026
	EqAscendNode    22.6421
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.812 0.743 0.653)

	Surface
	{
		SurfStyle       0.417031
		OceanStyle      0.194077
		Randomize      (0.109, 0.096, 0.430)
		colorDistMagn   0.0414812
		colorDistFreq   824.383
		detailScale     14488.5
		colorConversion true
		drivenDarkening 0
		seaLevel        0.147111
		snowLevel       2
		tropicLatitude  0.0264889
		icecapLatitude  0.792525
		icecapHeight    0.165542
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.81582
		venusFreq       0.472265
		venusMagn       0
		mareFreq        1.95255
		mareDensity     0.0232323
		terraceProb     0.148808
		erosion         0
		montesMagn      0.16739
		montesFreq      188.537
		montesSpiky     0.926958
		montesFraction  0.770092
		dunesMagn       0.0330652
		dunesFreq       7404.38
		dunesFraction   0.283179
		hillsMagn       0.109998
		hillsFreq       763.433
		hillsFraction   0.199398
		hills2Fraction  0.109357
		riversMagn      65.6941
		riversFreq      2.67669
		riversSin       6.63312
		riversOctaves   0
		canyonsMagn     0.726003
		canyonsFreq     2.19512
		canyonFraction  0
		cracksMagn      0.0495566
		cracksFreq      1.05709
		cracksOctaves   5
		craterMagn      0.648322
		craterFreq      18.1302
		craterDensity   0.978972
		craterOctaves   13
		craterRayedFactor 0.111167
		volcanoMagn     0.597378
		volcanoFreq     0.776269
		volcanoDensity  0.208456
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.240947
		volcanoRadius   0.55342
		volcanoTemp     1504.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.812, 0.743, 0.653, 0.500)
		colorShelf     (0.771, 0.706, 0.620, 0.500)
		colorBeach     (0.568, 0.520, 0.457, 0.750)
		colorDesert    (0.690, 0.631, 0.555, 1.000)
		colorLowland   (0.715, 0.654, 0.575, 1.000)
		colorUpland    (0.755, 0.691, 0.607, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.715, 0.654, 0.575, 1.000)
		colorUpPlants  (0.755, 0.691, 0.607, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.983235
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Pluto"
		Height          94.697
		Density         0.00167647
		Pressure        0.000250663
		Greenhouse      0.11912
		Bright          4.41448
		Opacity         0
		SkyLight        1.47149
		Hue             0.00189289
		Saturation      1

		Composition
		{
			N2    	99.7779
			CO    	0.116384
			Ne    	0.087167
			Ar    	0.0185384
			CH4   	3.0016e-005
		}
	}

	Aurora
	{
		Height      174.411
		NorthLat    59.7351
		NorthLon    3.03427
		NorthRadius 1697.24
		NorthWidth  569.312
		NorthRings  2
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -61.3478
		SouthLon    198.804
		SouthRadius 1380.26
		SouthWidth  376.961
		SouthRings  5
		SouthBright 0.3
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0160039
		Period          0.0585745
		Eccentricity    0.0167135
		Inclination     0.774026
		AscendingNode   22.6421
		ArgOfPericenter -31.9673
		MeanAnomaly     -22.3496
	}
}

Moon	"Ding Briar Moon 8"
{
	ParentBody     "Ding Briar"
	Class	       "IceWorld"

	Mass            1.72089e-005
	Radius          214.631
	InertiaMoment   0.399819

	Obliquity       0.969231
	EqAscendNode    22.9642
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.774 0.688 0.520)

	Surface
	{
		SurfStyle       0.389301
		OceanStyle      0.140266
		Randomize      (-0.337, -0.206, -0.533)
		colorDistMagn   0.0498652
		colorDistFreq   30.4975
		detailScale     552.043
		colorConversion true
		drivenDarkening 0.262079
		seaLevel        0.187659
		snowLevel       2
		tropicLatitude  0.0331501
		icecapLatitude  0.79989
		icecapHeight    0.21113
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.62602
		venusFreq       1.29221
		venusMagn       0
		mareFreq        0
		mareDensity     2.74136e-005
		terraceProb     0.34229
		erosion         0
		montesMagn      0.0680165
		montesFreq      13.3822
		montesSpiky     0.888729
		montesFraction  0.363022
		dunesMagn       0.0477999
		dunesFreq       287.766
		dunesFraction   0.153896
		hillsMagn       0.13281
		hillsFreq       28.7554
		hillsFraction   0.00492769
		hills2Fraction  0.148222
		riversMagn      50.6731
		riversFreq      2.81574
		riversSin       6.45683
		riversOctaves   0
		canyonsMagn     0.356977
		canyonsFreq     0.0621512
		canyonFraction  0
		cracksMagn      0.0453059
		cracksFreq      0.0930478
		cracksOctaves   0
		craterMagn      1.12951
		craterFreq      0.528076
		craterDensity   0.86574
		craterOctaves   8
		craterRayedFactor 0.112523
		volcanoMagn     0.165343
		volcanoFreq     0.631962
		volcanoDensity  0.197608
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.375655
		volcanoRadius   0.191215
		volcanoTemp     1625.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.774, 0.688, 0.520, 0.500)
		colorShelf     (0.735, 0.654, 0.494, 0.500)
		colorBeach     (0.542, 0.482, 0.364, 0.750)
		colorDesert    (0.658, 0.585, 0.442, 1.000)
		colorLowland   (0.681, 0.606, 0.457, 1.000)
		colorUpland    (0.720, 0.640, 0.483, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.681, 0.606, 0.457, 1.000)
		colorUpPlants  (0.720, 0.640, 0.483, 1.000)
		BumpHeight      10.7316
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
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
		SemiMajorAxis   0.0263618
		Period          0.123878
		Eccentricity    0.0212491
		Inclination     0.969231
		AscendingNode   22.9642
		ArgOfPericenter -107.551
		MeanAnomaly     -154.073
	}
}

DwarfMoon	"Ding Briar Moon 9"
{
	ParentBody     "Ding Briar"
	Class	       "Asteroid"

	Mass            2.13563e-011
	Radius          3.76619
	InertiaMoment   0.399091

	RotationPeriod  4436.07
	Obliquity       37.0544
	EqAscendNode    -13.4672

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.537 0.532 0.528)

	Surface
	{
		SurfStyle       0.664623
		OceanStyle      0.440549
		Randomize      (0.252, 0.610, -0.818)
		colorDistMagn   0.0598876
		colorDistFreq   0.0116683
		detailScale     102.842
		colorConversion true
		snowLevel       2
		tropicLatitude  0.952293
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.679368
		terraceProb     0.275452
		erosion         0
		montesMagn      0.570272
		montesFreq      3.60116
		montesSpiky     0.844156
		montesFraction  0.719732
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.035544
		hillsFraction   0.683229
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.265916
		craterFreq      0.266231
		craterDensity   0.972327
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.547825
		volcanoTemp     1528.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.210, 0.181, 0.148, 0.000)
		colorShelf     (0.215, 0.186, 0.169, 0.000)
		colorBeach     (0.253, 0.218, 0.201, 0.000)
		colorDesert    (0.274, 0.234, 0.195, 0.000)
		colorLowland   (0.301, 0.250, 0.222, 0.000)
		colorUpland    (0.333, 0.303, 0.269, 0.000)
		colorRock      (0.360, 0.330, 0.290, 0.000)
		colorSnow      (0.392, 0.351, 0.306, 1.000)
		BumpHeight      3.38957
		BumpOffset      0.677914
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
		SemiMajorAxis   0.143753
		Period          1.57746
		Eccentricity    0.220835
		Inclination     35.7521
		AscendingNode   -13.4016
		ArgOfPericenter 58.4179
		MeanAnomaly     -167.972
	}
}

DwarfMoon	"Ding Briar Moon 10"
{
	ParentBody     "Ding Briar"
	Class	       "Asteroid"

	Mass            4.03668e-011
	Radius          4.08631
	InertiaMoment   0.399998

	RotationPeriod  2826.29
	Obliquity       -77.6783
	EqAscendNode    125.132

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.807 0.760 0.669)

	Surface
	{
		SurfStyle       0.211995
		OceanStyle      0.000321878
		Randomize      (-0.285, 0.132, 0.007)
		colorDistMagn   0.515227
		colorDistFreq   0.00517807
		detailScale     111.583
		colorConversion true
		snowLevel       2
		tropicLatitude  0.804506
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.484598
		terraceProb     0.696594
		erosion         0
		montesMagn      0.511904
		montesFreq      3.15779
		montesSpiky     0.899146
		montesFraction  0.333678
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.046262
		hillsFraction   0.510607
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236625
		craterFreq      0.271359
		craterDensity   0.915026
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.544192
		volcanoTemp     1130.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.323, 0.304, 0.268, 0.000)
		colorShelf     (0.343, 0.323, 0.285, 0.000)
		colorBeach     (0.363, 0.342, 0.301, 0.000)
		colorDesert    (0.383, 0.361, 0.318, 0.000)
		colorLowland   (0.403, 0.380, 0.335, 0.000)
		colorUpland    (0.424, 0.399, 0.351, 0.000)
		colorRock      (0.444, 0.418, 0.368, 0.000)
		colorSnow      (0.464, 0.437, 0.385, 1.000)
		BumpHeight      3.67768
		BumpOffset      0.735535
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
		SemiMajorAxis   0.144099
		Period          1.58316
		Eccentricity    0.42617
		Inclination     -80.8659
		AscendingNode   125.495
		ArgOfPericenter 116.263
		MeanAnomaly     -162.518
	}
}

DwarfMoon	"Ding Briar Moon 11"
{
	ParentBody     "Ding Briar"
	Class	       "Asteroid"

	Mass            7.0963e-011
	Radius          6.17395
	InertiaMoment   0.398128

	RotationPeriod  3495.09
	Obliquity       57.1117
	EqAscendNode    -64.99

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.688 0.595 0.563)

	Surface
	{
		SurfStyle       0.715126
		OceanStyle      0.304974
		Randomize      (-0.345, 0.488, 0.013)
		colorDistMagn   0.873691
		colorDistFreq   0.0278524
		detailScale     168.59
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999923
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.312389
		terraceProb     0.16406
		erosion         0
		montesMagn      0.45776
		montesFreq      3.11461
		montesSpiky     0.887696
		montesFraction  0.852846
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0884896
		hillsFraction   0.657689
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249865
		craterFreq      0.159277
		craterDensity   0.865275
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.579631
		volcanoTemp     1653.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.268, 0.202, 0.158, 0.000)
		colorShelf     (0.275, 0.208, 0.180, 0.000)
		colorBeach     (0.323, 0.244, 0.214, 0.000)
		colorDesert    (0.351, 0.262, 0.208, 0.000)
		colorLowland   (0.385, 0.280, 0.236, 0.000)
		colorUpland    (0.426, 0.339, 0.287, 0.000)
		colorRock      (0.461, 0.369, 0.310, 0.000)
		colorSnow      (0.502, 0.393, 0.327, 1.000)
		BumpHeight      5.55656
		BumpOffset      1.11131
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
		SemiMajorAxis   0.144317
		Period          1.58674
		Eccentricity    0.2743
		Inclination     57.833
		AscendingNode   -64.9051
		ArgOfPericenter -45.7004
		MeanAnomaly     -147.033
	}
}

DwarfMoon	"Ding Briar Moon 12"
{
	ParentBody     "Ding Briar"
	Class	       "Asteroid"

	Mass            1.18284e-010
	Radius          6.98129
	InertiaMoment   0.399227

	RotationPeriod  2755.11
	Obliquity       -54.3362
	EqAscendNode    -90.0056

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.580 0.452 0.313)

	Surface
	{
		SurfStyle       0.820583
		OceanStyle      0.0887809
		Randomize      (0.641, 0.646, -0.760)
		colorDistMagn   0.351413
		colorDistFreq   0.0300102
		detailScale     190.636
		colorConversion true
		snowLevel       2
		tropicLatitude  0.930053
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.470663
		terraceProb     0.307964
		erosion         0
		montesMagn      0.604559
		montesFreq      3.13059
		montesSpiky     0.917136
		montesFraction  0.539892
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.128238
		hillsFraction   0.766021
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225099
		craterFreq      0.236649
		craterDensity   1.02578
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.497292
		volcanoTemp     1410.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.226, 0.154, 0.088, 0.000)
		colorShelf     (0.232, 0.158, 0.100, 0.000)
		colorBeach     (0.272, 0.185, 0.119, 0.000)
		colorDesert    (0.296, 0.199, 0.116, 0.000)
		colorLowland   (0.325, 0.212, 0.131, 0.000)
		colorUpland    (0.359, 0.258, 0.159, 0.000)
		colorRock      (0.388, 0.280, 0.172, 0.000)
		colorSnow      (0.423, 0.298, 0.181, 1.000)
		BumpHeight      6.28316
		BumpOffset      1.25663
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
		SemiMajorAxis   0.144628
		Period          1.59188
		Eccentricity    0.141313
		Inclination     -51.0583
		AscendingNode   -90.0885
		ArgOfPericenter 71.9712
		MeanAnomaly     -24.1174
	}
}

DwarfMoon	"Ding Briar Moon 13"
{
	ParentBody     "Ding Briar"
	Class	       "Asteroid"

	Mass            1.89313e-010
	Radius          7.84333
	InertiaMoment   0.396065

	RotationPeriod  2254.14
	Obliquity       57.4811
	EqAscendNode    33.8559

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.728 0.593 0.523)

	Surface
	{
		SurfStyle       0.0951188
		OceanStyle      0.783687
		Randomize      (-0.446, -0.135, -0.372)
		colorDistMagn   0.939085
		colorDistFreq   0.0262349
		detailScale     214.175
		colorConversion true
		snowLevel       2
		tropicLatitude  0.936397
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.259475
		terraceProb     0.377674
		erosion         0
		montesMagn      0.536547
		montesFreq      3.12977
		montesSpiky     0.891487
		montesFraction  0.381218
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.173117
		hillsFraction   0.628323
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.271918
		craterFreq      0.217993
		craterDensity   0.942211
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.490888
		volcanoTemp     1693.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.291, 0.237, 0.209, 0.000)
		colorShelf     (0.309, 0.252, 0.222, 0.000)
		colorBeach     (0.328, 0.267, 0.235, 0.000)
		colorDesert    (0.346, 0.282, 0.248, 0.000)
		colorLowland   (0.364, 0.297, 0.262, 0.000)
		colorUpland    (0.382, 0.311, 0.275, 0.000)
		colorRock      (0.401, 0.326, 0.288, 0.000)
		colorSnow      (0.419, 0.341, 0.301, 1.000)
		BumpHeight      7.059
		BumpOffset      1.4118
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
		SemiMajorAxis   0.144896
		Period          1.5963
		Eccentricity    0.250618
		Inclination     60.973
		AscendingNode   33.9252
		ArgOfPericenter -104.14
		MeanAnomaly     -134.571
	}
}

DwarfMoon	"Ding Briar Moon 14"
{
	ParentBody     "Ding Briar"
	Class	       "Asteroid"

	Mass            2.93478e-010
	Radius          8.49891
	InertiaMoment   0.398313

	RotationPeriod  1829.42
	Obliquity       36.7482
	EqAscendNode    3.07441

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.742 0.655 0.621)

	Surface
	{
		SurfStyle       0.430391
		OceanStyle      0.503833
		Randomize      (0.891, -0.261, 0.736)
		colorDistMagn   0.378459
		colorDistFreq   0.0570381
		detailScale     232.077
		colorConversion true
		snowLevel       2
		tropicLatitude  0.936171
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.430346
		terraceProb     0.713276
		erosion         0
		montesMagn      0.578774
		montesFreq      3.04566
		montesSpiky     0.961978
		montesFraction  0.543196
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.168805
		hillsFraction   0.381352
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257923
		craterFreq      0.190914
		craterDensity   0.923661
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.503854
		volcanoTemp     1873.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.297, 0.262, 0.249, 0.000)
		colorShelf     (0.315, 0.278, 0.264, 0.000)
		colorBeach     (0.334, 0.295, 0.280, 0.000)
		colorDesert    (0.352, 0.311, 0.295, 0.000)
		colorLowland   (0.371, 0.327, 0.311, 0.000)
		colorUpland    (0.389, 0.344, 0.326, 0.000)
		colorRock      (0.408, 0.360, 0.342, 0.000)
		colorSnow      (0.427, 0.376, 0.357, 1.000)
		BumpHeight      7.64902
		BumpOffset      1.5298
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
		SemiMajorAxis   0.145325
		Period          1.6034
		Eccentricity    0.287203
		Inclination     32.7063
		AscendingNode   3.47176
		ArgOfPericenter 168.206
		MeanAnomaly     -159.818
	}
}

DwarfMoon	"Ding Briar Moon 15"
{
	ParentBody     "Ding Briar"
	Class	       "Asteroid"

	Mass            4.43458e-010
	Radius          11.4745
	InertiaMoment   0.39936

	RotationPeriod  2070.85
	Obliquity       29.6649
	EqAscendNode    102.769

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.419 0.412 0.408)

	Surface
	{
		SurfStyle       0.184559
		OceanStyle      0.175255
		Randomize      (0.821, 0.935, -0.514)
		colorDistMagn   0.450468
		colorDistFreq   0.0444757
		detailScale     313.329
		colorConversion true
		snowLevel       2
		tropicLatitude  0.591025
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.506485
		terraceProb     0.228253
		erosion         0
		montesMagn      0.512761
		montesFreq      1.92132
		montesSpiky     0.97524
		montesFraction  0.446885
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.21741
		hillsFraction   0.355491
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240689
		craterFreq      0.142313
		craterDensity   0.816848
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.520926
		volcanoTemp     1510.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.167, 0.165, 0.163, 0.000)
		colorShelf     (0.178, 0.175, 0.173, 0.000)
		colorBeach     (0.188, 0.185, 0.184, 0.000)
		colorDesert    (0.199, 0.196, 0.194, 0.000)
		colorLowland   (0.209, 0.206, 0.204, 0.000)
		colorUpland    (0.220, 0.216, 0.214, 0.000)
		colorRock      (0.230, 0.227, 0.224, 0.000)
		colorSnow      (0.241, 0.237, 0.235, 1.000)
		BumpHeight      10.327
		BumpOffset      2.0654
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
		SemiMajorAxis   0.145745
		Period          1.61037
		Eccentricity    0.16814
		Inclination     29.9985
		AscendingNode   102.634
		ArgOfPericenter 47.922
		MeanAnomaly     18.1745
	}
}

DwarfMoon	"Ding Briar Moon 16"
{
	ParentBody     "Ding Briar"
	Class	       "Asteroid"

	Mass            6.5625e-010
	Radius          12.4314
	InertiaMoment   0.3967

	RotationPeriod  1729.59
	Obliquity       -8.07069
	EqAscendNode    -150.006

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.623 0.532 0.360)

	Surface
	{
		SurfStyle       0.31797
		OceanStyle      0.37778
		Randomize      (-0.983, 0.221, 0.559)
		colorDistMagn   0.901516
		colorDistFreq   0.0595121
		detailScale     339.459
		colorConversion true
		snowLevel       2
		tropicLatitude  0.33583
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.570392
		terraceProb     0.228577
		erosion         0
		montesMagn      0.44478
		montesFreq      2.79544
		montesSpiky     0.868888
		montesFraction  0.695168
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.316851
		hillsFraction   0.663283
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24816
		craterFreq      0.238712
		craterDensity   0.853229
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.520413
		volcanoTemp     1506.14
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.249, 0.213, 0.144, 0.000)
		colorShelf     (0.265, 0.226, 0.153, 0.000)
		colorBeach     (0.280, 0.239, 0.162, 0.000)
		colorDesert    (0.296, 0.253, 0.171, 0.000)
		colorLowland   (0.312, 0.266, 0.180, 0.000)
		colorUpland    (0.327, 0.279, 0.189, 0.000)
		colorRock      (0.343, 0.293, 0.198, 0.000)
		colorSnow      (0.358, 0.306, 0.207, 1.000)
		BumpHeight      11.1882
		BumpOffset      2.23765
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
		SemiMajorAxis   0.146315
		Period          1.61982
		Eccentricity    0.469347
		Inclination     -26.1142
		AscendingNode   -148.87
		ArgOfPericenter 84.107
		MeanAnomaly     19.4724
	}
}

DwarfMoon	"Ding Briar Moon 17"
{
	ParentBody     "Ding Briar"
	Class	       "Asteroid"

	Mass            9.54587e-010
	Radius          13.5304
	InertiaMoment   0.398486

	RotationPeriod  1497.65
	Obliquity       50.7985
	EqAscendNode    -173.434

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.436 0.430 0.426)

	Surface
	{
		SurfStyle       0.171716
		OceanStyle      0.812053
		Randomize      (-0.993, 0.470, -0.188)
		colorDistMagn   0.847737
		colorDistFreq   0.083978
		detailScale     369.471
		colorConversion true
		snowLevel       2
		tropicLatitude  0.24216
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.761032
		terraceProb     0.191029
		erosion         0
		montesMagn      0.489205
		montesFreq      2.91711
		montesSpiky     0.976817
		montesFraction  0.464854
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.423123
		hillsFraction   0.701349
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241892
		craterFreq      0.202554
		craterDensity   0.899192
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.512674
		volcanoTemp     1690.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.174, 0.172, 0.171, 0.000)
		colorShelf     (0.185, 0.183, 0.181, 0.000)
		colorBeach     (0.196, 0.193, 0.192, 0.000)
		colorDesert    (0.207, 0.204, 0.203, 0.000)
		colorLowland   (0.218, 0.215, 0.213, 0.000)
		colorUpland    (0.229, 0.226, 0.224, 0.000)
		colorRock      (0.240, 0.236, 0.235, 0.000)
		colorSnow      (0.251, 0.247, 0.245, 1.000)
		BumpHeight      12.1774
		BumpOffset      2.43548
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
		SemiMajorAxis   0.146865
		Period          1.62897
		Eccentricity    0.00859199
		Inclination     64.2438
		AscendingNode   -175.291
		ArgOfPericenter -97.9348
		MeanAnomaly     -48.7466
	}
}

DwarfMoon	"Ding Briar Moon 18"
{
	ParentBody     "Ding Briar"
	Class	       "Asteroid"

	Mass            1.36886e-009
	Radius          14.439
	InertiaMoment   0.39949

	RotationPeriod  1287.15
	Obliquity       29.109
	EqAscendNode    169.784

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.493 0.491 0.486)

	Surface
	{
		SurfStyle       0.203689
		OceanStyle      0.724773
		Randomize      (0.821, 0.614, -0.594)
		colorDistMagn   0.102421
		colorDistFreq   0.11653
		detailScale     394.282
		colorConversion true
		snowLevel       2
		tropicLatitude  0.101447
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.435753
		terraceProb     0.120267
		erosion         0
		montesMagn      0.499144
		montesFreq      3.05195
		montesSpiky     0.748796
		montesFraction  0.407965
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.466293
		hillsFraction   0.569531
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229032
		craterFreq      0.172833
		craterDensity   0.977374
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.558869
		volcanoTemp     1658.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.197, 0.196, 0.195, 0.000)
		colorShelf     (0.210, 0.209, 0.207, 0.000)
		colorBeach     (0.222, 0.221, 0.219, 0.000)
		colorDesert    (0.234, 0.233, 0.231, 0.000)
		colorLowland   (0.247, 0.245, 0.243, 0.000)
		colorUpland    (0.259, 0.258, 0.255, 0.000)
		colorRock      (0.271, 0.270, 0.267, 0.000)
		colorSnow      (0.284, 0.282, 0.280, 1.000)
		BumpHeight      12.9951
		BumpOffset      2.59903
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
		SemiMajorAxis   0.147255
		Period          1.63545
		Eccentricity    0.0847547
		Inclination     29.2156
		AscendingNode   168.037
		ArgOfPericenter -38.1804
		MeanAnomaly     155.385
	}
}