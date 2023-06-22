// http://starwars.wikia.com/wiki/Eadu
// Region : Outer Rim
// Sector : Bheriz Sector
// Grid location : U10
// X : 13640.654999999999, Y : 1466.7150000000001, Z : 3873.179480541051
Planet	"Eadu/Eadu System 4"
{
	ParentBody     "Eadu system"
	Class          "Terra"
	Mass            1.021
	Radius          7060.5
	InertiaMoment   0.32883
	Oblateness      0.013797
	RotationPeriod  16.755
	RotationEpoch   0
	Obliquity       -41.069
	EqAscendNode    68.648

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Terrestrial"
	}

	Surface
	{
		Preset         "terra_wet_rocky_blue.cfg"
		SurfStyle       0.14444
		Randomize      (0.445, 0.668, -0.997)
		colorDistMagn   0.060492
		colorDistFreq   1056.5
		detailScale     27821
		drivenDarkening 0.46032
		seaLevel        0.13368
		snowLevel       0.93651
		tropicLatitude  0.5009
		icecapLatitude  0.88527
		icecapHeight    0.039683
		climatePole     0.61111
		climateTropic   0.60317
		climateEquator  0.62698
		climateSteppeMin 0
		climateSteppeMax 0.3125
		climateForestMin 0.25
		climateForestMax 0.5625
		climateGrassMin  0.5
		climateGrassMax  0.8125
		humidity        0
		heightTempGrad  0.625
		beachWidth      0.0013622
		tropicWidth     0.27778
		mainFreq        2.0611
		venusFreq       0.9825
		venusMagn       0.57252
		mareFreq        0.36719
		mareDensity     0.21374
		terraceProb     0.39695
		erosion         1
		montesMagn      1.8321
		montesFreq      465.65
		montesSpiky     0.58015
		montesFraction  0.26513
		dunesMagn       0.051651
		dunesFreq       100
		dunesFraction   0.3671
		hillsMagn       0.76777
		hillsFreq       3000
		hillsFraction   0.05
		hills2Fraction  0.38487
		riversMagn      14.504
		riversFreq      1.374
		riversSin       1.374
		riftsMagn       49.42
		riftsFreq       3.11
		riftsSin        3.8111
		canyonsMagn     1.8321
		canyonsFreq     534.35
		canyonsFraction 0.30534
		cracksMagn      2.4427
		cracksFreq      8.3588
		cracksOctaves   0
		craterMagn      0.63881
		craterFreq      36.52
		craterDensity   0
		craterOctaves   1
		craterRayedFactor 0
		volcanoMagn     0.67229
		volcanoFreq     0.27481
		volcanoDensity  0.4
		volcanoOctaves  2
		volcanoActivity 0.22901
		volcanoFlows    0.22901
		volcanoRadius   0.51275
		volcanoTemp     320.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     0
		stripeFluct     1.542
		stripeTwist     9.0476
		cycloneMagn     10.076
		cycloneFreq     2
		cycloneDensity  0.45038
		cycloneOctaves  10
		cycloneMagn2     10.534
		cycloneFreq2     2
		cycloneLatitude2 1
		cycloneOctaves2  10
		BumpHeight      16.667
		BumpOffset      11.111
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		RoughnessWater  0.50737
		RoughnessIce    0.50737
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	Clouds
	{
		Height          14.736
		Velocity        229.01
		BumpHeight      22.222
		BumpOffset      13.492
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		ModulateBright  1
		mainFreq        1.2366
		mainOctaves     10
		Coverage        1
		stripeZones     0
		stripeFluct     1.542
		stripeTwist     9.0476
	}

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          258.35
		Density         0.28339
		Pressure        0.86379
		Greenhouse      13.19
		Bright          5
		Opacity         0
		SkyLight        5
		Hue             0
		Saturation      1

		Composition
		{
			N2        	77.773
			O2        	20.862
			Xe        	0.8303
			H2O       	0.5
			CO2       	0.0398
		}
	}

	Aurora
	{
		Height         179.51
		NorthLat       58.161
		NorthLon       79.342
		NorthRadius    2557.7
		NorthWidth     809.02
		NorthRings     3
		NorthBright    0.3
		NorthFlashFreq 71.211
		NorthMoveSpeed 0.92621
		NorthParticles 0
		SouthLat       -31.631
		SouthLon       240.78
		SouthRadius    3074.5
		SouthWidth     877.74
		SouthRings     2
		SouthBright    0.3
		SouthFlashFreq 57.451
		SouthMoveSpeed 0.99185
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
		SemiMajorAxis   13.8471
		Eccentricity    0.0336662
		Inclination     2.00605
		AscendingNode   62.6105
		ArgOfPericenter 302.916
		MeanAnomaly     30.2103
	}
}

DwarfMoon	"Eadu 1"
{
	ParentBody     "Eadu"
	Class	       "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00062206
		Eccentricity    0.31746
		Inclination     11.4286
		AscendingNode   154.286
		ArgOfPericenter -17.1429
		MeanAnomaly     -114.286
	}
}

///////////////
// GENERATED //
///////////////

DwarfPlanet	"Eadu System 1"
{
	ParentBody     "Eadu System"
	Class	       "Selena"

	Mass            0.00425108
	Radius          1233.67
	InertiaMoment   0.393781

	Oblateness      0.0016848

	RotationPeriod  49.4608
	Obliquity       -10.8908
	EqAscendNode    60.362
	//Precession      0

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.541 0.537 0.533)

	Surface
	{
		SurfStyle       0.19552
		OceanStyle      0.694351
		Randomize      (0.022, 0.241, 0.805)
		colorDistMagn   0.0874428
		colorDistFreq   190.473
		detailScale     3173.08
		colorConversion true
		drivenDarkening 0
		seaLevel        0.209908
		snowLevel       2
		tropicLatitude  0.175942
		icecapLatitude  10
		icecapHeight    0.133138
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.6343
		venusFreq       1.17189
		venusMagn       0
		mareFreq        0.54239
		mareDensity     0.00229816
		terraceProb     0.431393
		erosion         0
		montesMagn      0.059944
		montesFreq      49.4023
		montesSpiky     0.920905
		montesFraction  0.108866
		dunesMagn       0.0256723
		dunesFreq       1597.52
		dunesFraction   0.722572
		hillsMagn       0.114269
		hillsFreq       147.497
		hillsFraction   0.833965
		hills2Fraction  0
		riversMagn      65.7826
		riversFreq      2.21685
		riversSin       5.44731
		riversOctaves   0
		canyonsMagn     0.50544
		canyonsFreq     0.279693
		canyonFraction  0.00170066
		cracksMagn      0.0624506
		cracksFreq      0.572006
		cracksOctaves   0
		craterMagn      0.636102
		craterFreq      4.33357
		craterDensity   0.963321
		craterOctaves   10
		craterRayedFactor 0.0979731
		volcanoMagn     0.173383
		volcanoFreq     0.641464
		volcanoDensity  0.196505
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.236502
		volcanoRadius   0.169026
		volcanoTemp     1552.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.320, 0.320, 0.000)
		colorShelf     (0.370, 0.370, 0.370, 0.000)
		colorBeach     (0.270, 0.268, 0.266, 0.000)
		colorDesert    (0.335, 0.322, 0.304, 0.200)
		colorLowland   (0.362, 0.344, 0.341, 0.500)
		colorUpland    (0.378, 0.360, 0.352, 0.800)
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
		SemiMajorAxis   2.18669
		Period          1.48019
		Eccentricity    0.0443559
		Inclination     3.53847
		AscendingNode   61.4915
		ArgOfPericenter 194.96
		MeanAnomaly     29.4437
	}
}

DwarfMoon	"Eadu System 1.D1"
{
	ParentBody     "Eadu System 1"
	Class	       "Asteroid"

	Mass            7.24092e-009
	Radius          12.9969
	InertiaMoment   0.399762

	Oblateness      0.153452

	Obliquity       0.0140511
	EqAscendNode    -21.2319
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.467 0.464 0.460)

	Surface
	{
		SurfStyle       0.449393
		OceanStyle      0.344541
		Randomize      (-0.186, 0.073, -0.610)
		colorDistMagn   0.170365
		colorDistFreq   0.0641079
		detailScale     354.902
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000488281
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.638936
		terraceProb     0.129555
		erosion         0
		montesMagn      0.425702
		montesFreq      2.90047
		montesSpiky     0.959463
		montesFraction  0.634267
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.523703
		hillsFraction   0.81938
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221379
		craterFreq      0.263448
		craterDensity   0.845729
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.454579
		volcanoTemp     1430.24
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.187, 0.186, 0.184, 0.000)
		colorShelf     (0.199, 0.197, 0.195, 0.000)
		colorBeach     (0.210, 0.209, 0.207, 0.000)
		colorDesert    (0.222, 0.220, 0.218, 0.000)
		colorLowland   (0.234, 0.232, 0.230, 0.000)
		colorUpland    (0.245, 0.244, 0.241, 0.000)
		colorRock      (0.257, 0.255, 0.253, 0.000)
		colorSnow      (0.269, 0.267, 0.264, 1.000)
		BumpHeight      11.6972
		BumpOffset      2.33944
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   1.46108e-005
		Period          0.00049538
		Eccentricity    5.3199e-005
		Inclination     0.0140511
		AscendingNode   -21.2319
		ArgOfPericenter 88.9832
		MeanAnomaly     -41.4585
	}
}

DwarfMoon	"Eadu System 1.D2"
{
	ParentBody     "Eadu System 1"
	Class	       "Asteroid"

	Mass            9.90532e-009
	Radius          32.2184
	InertiaMoment   0.397725

	Oblateness      0.249

	Obliquity       0.000299217
	EqAscendNode    40.953
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.521 0.513 0.507)

	Surface
	{
		SurfStyle       0.174532
		OceanStyle      0.590017
		Randomize      (-0.070, -0.200, 0.587)
		colorDistMagn   0.0806865
		colorDistFreq   0.774443
		detailScale     879.778
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.536962
		terraceProb     0.151491
		erosion         0
		montesMagn      0.538163
		montesFreq      2.33343
		montesSpiky     0.884342
		montesFraction  0.397695
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.10799
		hillsFraction   0.640779
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218881
		craterFreq      0.265259
		craterDensity   0.832811
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.469817
		volcanoTemp     1428.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.208, 0.205, 0.203, 0.000)
		colorShelf     (0.221, 0.218, 0.216, 0.000)
		colorBeach     (0.234, 0.231, 0.228, 0.000)
		colorDesert    (0.247, 0.244, 0.241, 0.000)
		colorLowland   (0.260, 0.257, 0.254, 0.000)
		colorUpland    (0.273, 0.269, 0.266, 0.000)
		colorRock      (0.286, 0.282, 0.279, 0.000)
		colorSnow      (0.299, 0.295, 0.292, 1.000)
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
		SemiMajorAxis   2.6067e-005
		Period          0.0011805
		Eccentricity    5.49207e-005
		Inclination     0.000299217
		AscendingNode   40.953
		ArgOfPericenter -114.276
		MeanAnomaly     -113.38
	}
}

DwarfMoon	"Eadu System 1.D3"
{
	ParentBody     "Eadu System 1"
	Class	       "Asteroid"

	Mass            1.7047e-005
	Radius          154.756
	InertiaMoment   0.398317

	Oblateness      0.00365818

	Obliquity       -0.557871
	EqAscendNode    -172.891
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.730 0.728 0.726)

	Surface
	{
		SurfStyle       0.693789
		OceanStyle      0.372717
		Randomize      (-0.718, -0.502, 0.173)
		colorDistMagn   0.1583
		colorDistFreq   11.5364
		detailScale     4225.88
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00119604
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.686788
		terraceProb     0.17202
		erosion         0
		montesMagn      0.646288
		montesFreq      3.56931
		montesSpiky     0.956772
		montesFraction  0.598665
		dunesFraction   0
		hillsMagn       0
		hillsFreq       61.2355
		hillsFraction   0.718224
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240458
		craterFreq      0.771193
		craterDensity   0.827489
		craterOctaves   16
		volcanoActivity 0.291517
		volcanoFlows    0
		volcanoRadius   0.64507
		volcanoTemp     1377.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.285, 0.247, 0.203, 0.000)
		colorShelf     (0.292, 0.255, 0.232, 0.000)
		colorBeach     (0.343, 0.298, 0.276, 0.000)
		colorDesert    (0.372, 0.320, 0.269, 0.000)
		colorLowland   (0.409, 0.342, 0.305, 0.000)
		colorUpland    (0.452, 0.415, 0.370, 0.000)
		colorRock      (0.489, 0.451, 0.399, 0.000)
		colorSnow      (0.533, 0.480, 0.421, 1.000)
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
		SemiMajorAxis   4.54179e-005
		Period          0.00270957
		Eccentricity    0.026533
		Inclination     -0.557871
		AscendingNode   -172.891
		ArgOfPericenter 132.262
		MeanAnomaly     25.6912
	}
}

DwarfMoon	"Eadu System 1.D4"
{
	ParentBody     "Eadu System 1"
	Class	       "Asteroid"

	Mass            1.83652e-008
	Radius          19.4894
	InertiaMoment   0.399888

	Oblateness      0.00171278

	Obliquity       1.47984
	EqAscendNode    24.688
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.556 0.551 0.545)

	Surface
	{
		SurfStyle       0.875867
		OceanStyle      0.073336
		Randomize      (0.338, 0.810, 0.069)
		colorDistMagn   0.288032
		colorDistFreq   0.219535
		detailScale     532.191
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0504402
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.426532
		terraceProb     0.184094
		erosion         0
		montesMagn      0.436247
		montesFreq      3.44959
		montesSpiky     0.807726
		montesFraction  0.532528
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.12077
		hillsFraction   0.788769
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264088
		craterFreq      0.22804
		craterDensity   0.805656
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.407521
		volcanoTemp     1330.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.189, 0.193, 0.218, 0.050)
		colorShelf     (0.222, 0.226, 0.251, 0.040)
		colorBeach     (0.256, 0.259, 0.284, 0.030)
		colorDesert    (0.289, 0.292, 0.322, 0.020)
		colorLowland   (0.323, 0.325, 0.354, 0.030)
		colorUpland    (0.356, 0.358, 0.387, 0.050)
		colorRock      (0.389, 0.391, 0.431, 0.020)
		colorSnow      (0.389, 0.391, 0.431, 1.000)
		BumpHeight      17.5405
		BumpOffset      3.5081
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   7.18991e-005
		Period          0.00540772
		Eccentricity    0.00884992
		Inclination     1.47984
		AscendingNode   24.688
		ArgOfPericenter -76.862
		MeanAnomaly     -68.2107
	}
}

DwarfMoon	"Eadu System 1.D5"
{
	ParentBody     "Eadu System 1"
	Class	       "Asteroid"

	Mass            2.49378e-008
	Radius          37.8214
	InertiaMoment   0.397949

	RotationPeriod  1043.24
	Obliquity       1.38868
	EqAscendNode    147.54
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.559 0.498 0.416)

	Surface
	{
		SurfStyle       0.920092
		OceanStyle      0.817933
		Randomize      (-0.032, -0.985, -0.619)
		colorDistMagn   0.394038
		colorDistFreq   0.688289
		detailScale     1032.78
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0135445
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.502805
		terraceProb     0.297165
		erosion         0
		montesMagn      0.438713
		montesFreq      3.54924
		montesSpiky     0.848844
		montesFraction  0.204359
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.16279
		hillsFraction   0.724474
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231595
		craterFreq      0.146906
		craterDensity   0.958089
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.443391
		volcanoTemp     1766.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.190, 0.174, 0.166, 0.050)
		colorShelf     (0.224, 0.204, 0.191, 0.040)
		colorBeach     (0.257, 0.234, 0.216, 0.030)
		colorDesert    (0.291, 0.264, 0.245, 0.020)
		colorLowland   (0.324, 0.294, 0.270, 0.030)
		colorUpland    (0.358, 0.323, 0.295, 0.050)
		colorRock      (0.392, 0.353, 0.328, 0.020)
		colorSnow      (0.392, 0.353, 0.328, 1.000)
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
		SemiMajorAxis   0.000401677
		Period          0.0714074
		Eccentricity    0.178525
		Inclination     1.38868
		AscendingNode   147.54
		ArgOfPericenter 167.401
		MeanAnomaly     -85.2104
	}
}

DwarfMoon	"Eadu System 1.D6"
{
	ParentBody     "Eadu System 1"
	Class	       "Asteroid"

	Mass            3.384e-008
	Radius          27.6862
	InertiaMoment   0.399107

	RotationPeriod  543.897
	Obliquity       -64.3821
	EqAscendNode    -19.8317
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.518 0.512 0.507)

	Surface
	{
		SurfStyle       0.659065
		OceanStyle      0.574577
		Randomize      (0.598, -0.964, -0.729)
		colorDistMagn   0.252087
		colorDistFreq   0.389445
		detailScale     756.017
		colorConversion true
		snowLevel       2
		tropicLatitude  0.811408
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.493353
		terraceProb     0.3084
		erosion         0
		montesMagn      0.3881
		montesFreq      3.60754
		montesSpiky     0.887279
		montesFraction  0.475869
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.38987
		hillsFraction   0.648498
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.272206
		craterFreq      0.193028
		craterDensity   1.03492
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.596175
		volcanoTemp     1827.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.202, 0.174, 0.142, 0.000)
		colorShelf     (0.207, 0.179, 0.162, 0.000)
		colorBeach     (0.243, 0.210, 0.193, 0.000)
		colorDesert    (0.264, 0.225, 0.187, 0.000)
		colorLowland   (0.290, 0.241, 0.213, 0.000)
		colorUpland    (0.321, 0.292, 0.258, 0.000)
		colorRock      (0.347, 0.318, 0.279, 0.000)
		colorSnow      (0.378, 0.338, 0.294, 1.000)
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
		SemiMajorAxis   0.000942272
		Period          0.256562
		Eccentricity    0.243916
		Inclination     -64.7693
		AscendingNode   -19.5223
		ArgOfPericenter -168.486
		MeanAnomaly     -164.84
	}
}

Barycenter	"Eadu System 2-2.1"
{
	ParentBody     "Eadu System"
	Mass            0.045991
	Radius          7723.74
	RotationPeriod  24
	Obliquity       0
	EqAscendNode    0
	//Precession      0


	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.01685
		Period          3.68523
		Eccentricity    0.0324871
		Inclination     -15.9132
		AscendingNode   68.3436
		ArgOfPericenter 160.315
		MeanAnomaly     93.3335
	}
}

DwarfPlanet	"Eadu System 2"
{
	ParentBody     "Eadu System 2-2.1"
	Class	       "Selena"

	Mass            0.0240343
	Radius          1702.11
	InertiaMoment   0.359764

	Oblateness      0.0022862

	RotationPeriod  27.1583
	Obliquity       -277.712
	EqAscendNode    60.7654
	//Precession      0

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.483 0.476 0.470)

	Surface
	{
		SurfStyle       0.712675
		OceanStyle      0.0104022
		Randomize      (-0.703, -0.513, -0.916)
		colorDistMagn   0.0732448
		colorDistFreq   189.867
		detailScale     4377.91
		colorConversion true
		drivenDarkening 0
		seaLevel        0.238505
		snowLevel       2
		tropicLatitude  0.976493
		icecapLatitude  10
		icecapHeight    0.134948
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.79093
		venusFreq       1.69958
		venusMagn       0
		mareFreq        0.751013
		mareDensity     0.0211384
		terraceProb     0.108188
		erosion         0
		montesMagn      0.0954788
		montesFreq      74.8251
		montesSpiky     0.969848
		montesFraction  0.0352209
		dunesMagn       0.0450511
		dunesFreq       2221.13
		dunesFraction   0.331523
		hillsMagn       0.114237
		hillsFreq       161.573
		hillsFraction   0.193006
		hills2Fraction  0
		riversMagn      57.1356
		riversFreq      2.96685
		riversSin       5.45721
		riversOctaves   0
		canyonsMagn     0.460269
		canyonsFreq     0.541742
		canyonFraction  0.248666
		cracksMagn      0.0679737
		cracksFreq      1.04887
		cracksOctaves   0
		craterMagn      0.551779
		craterFreq      5.08695
		craterDensity   0.81356
		craterOctaves   11
		craterRayedFactor 0.15408
		volcanoMagn     0.221799
		volcanoFreq     0.620882
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.268331
		volcanoRadius   0.222664
		volcanoTemp     1769.82
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.470, 0.400, 0.340, 0.000)
		colorShelf     (0.640, 0.600, 0.470, 0.000)
		colorBeach     (0.304, 0.290, 0.226, 0.000)
		colorDesert    (0.323, 0.295, 0.230, 0.000)
		colorLowland   (0.265, 0.219, 0.183, 0.000)
		colorUpland    (0.376, 0.338, 0.244, 0.000)
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
		SemiMajorAxis   0.000947623
		Period          0.238482
		Eccentricity    0.0045216
		Inclination     -56.3238
		AscendingNode   -80.1451
		ArgOfPericenter 299.685
		MeanAnomaly     26.7696
	}
}

Moon	"Eadu System 2.1"
{
	ParentBody     "Eadu System 2-2.1"
	Class	       "Selena"

	Mass            0.0219567
	Radius          1856.45
	InertiaMoment   0.356565

	Oblateness      0.00252935

	RotationPeriod  30.5881
	Obliquity       -20.2188
	EqAscendNode    -77.0714
	//Precession      0

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.747 0.659 0.605)

	Surface
	{
		SurfStyle       0.0074374
		OceanStyle      0.97168
		Randomize      (0.244, -0.329, 0.936)
		colorDistMagn   0.0612381
		colorDistFreq   194.493
		detailScale     4774.88
		colorConversion true
		drivenDarkening 0
		seaLevel        0.175664
		snowLevel       2
		tropicLatitude  0.882077
		icecapLatitude  10
		icecapHeight    0.197945
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.80892
		venusFreq       1.06339
		venusMagn       0
		mareFreq        0.843615
		mareDensity     0.00925117
		terraceProb     0.355837
		erosion         0
		montesMagn      0.0971291
		montesFreq      64.1438
		montesSpiky     0.883534
		montesFraction  0.388717
		dunesMagn       0.0348987
		dunesFreq       2487.13
		dunesFraction   0.406152
		hillsMagn       0.143941
		hillsFreq       163.67
		hillsFraction   0.621397
		hills2Fraction  0
		riversMagn      61.7257
		riversFreq      2.94903
		riversSin       5.23471
		riversOctaves   0
		canyonsMagn     0.466791
		canyonsFreq     0.686348
		canyonFraction  0.312529
		cracksMagn      0.0618891
		cracksFreq      0.669137
		cracksOctaves   0
		craterMagn      0.649294
		craterFreq      4.75377
		craterDensity   0.979548
		craterOctaves   11
		craterRayedFactor 0
		volcanoMagn     0.272319
		volcanoFreq     0.582146
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.193168
		volcanoRadius   0.206675
		volcanoTemp     1267.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.320, 0.320, 0.000)
		colorShelf     (0.370, 0.370, 0.370, 0.000)
		colorBeach     (0.373, 0.330, 0.302, 0.000)
		colorDesert    (0.463, 0.396, 0.345, 0.200)
		colorLowland   (0.500, 0.422, 0.387, 0.500)
		colorUpland    (0.523, 0.442, 0.399, 0.800)
		colorRock      (0.650, 0.610, 0.620, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.999999
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
		Height          92.8223
		Density         1.12156e-007
		Pressure        3.51741e-008
		Bright          0.645601
		Opacity         0
		SkyLight        0.2152
		Hue             0.0277477
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
		SemiMajorAxis   0.00103729
		Period          0.238482
		Eccentricity    0.0045216
		Inclination     -56.3238
		AscendingNode   -80.1451
		ArgOfPericenter 119.685
		MeanAnomaly     26.7696
	}
}

Planet	"Eadu System 3"
{
	ParentBody     "Eadu System"
	Class	       "Desert"

	Mass            0.12145
	Radius          3221.3
	InertiaMoment   0.332351

	Oblateness      0.00412004

	RotationPeriod  22.2765
	Obliquity       -72.5657
	EqAscendNode    -70.7462
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.484 0.479 0.475)

	Surface
	{
		SurfStyle       0.93064
		OceanStyle      0.440886
		Randomize      (0.730, 0.691, 0.941)
		colorDistMagn   0.0780792
		colorDistFreq   336.663
		detailScale     8285.36
		colorConversion true
		seaLevel        0.156756
		snowLevel       2
		tropicLatitude  0.953202
		icecapLatitude  10
		icecapHeight    0.151804
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.01949
		venusFreq       0.962985
		venusMagn       0
		mareFreq        1.32933
		mareDensity     0.0466216
		terraceProb     0.247837
		erosion         0
		montesMagn      0.231113
		montesFreq      166.495
		montesSpiky     0.937071
		montesFraction  0.21467
		dunesMagn       0.0468481
		dunesFreq       28.0615
		dunesFraction   0.22237
		hillsMagn       0.129829
		hillsFreq       388.329
		hillsFraction   0
		hills2Fraction  0
		riversMagn      60.839
		riversFreq      3.16771
		riversSin       4.07675
		riversOctaves   0
		canyonsMagn     0.0379473
		canyonsFreq     76.9751
		canyonFraction  0
		cracksMagn      0.0837313
		cracksFreq      0.367169
		cracksOctaves   0
		craterMagn      0.575738
		craterFreq      7.29697
		craterDensity   0.482143
		craterOctaves   6.83061
		volcanoMagn     0.577945
		volcanoFreq     0.69421
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.567042
		volcanoRadius   0.509473
		volcanoTemp     1690.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.640, 0.500, 0.420, 0.000)
		colorShelf     (0.680, 0.500, 0.470, 0.000)
		colorBeach     (0.480, 0.380, 0.280, 0.000)
		colorDesert    (0.410, 0.280, 0.180, 0.000)
		colorLowland   (0.310, 0.230, 0.170, 0.000)
		colorUpland    (0.510, 0.330, 0.190, 0.000)
		colorRock      (0.220, 0.210, 0.210, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 0.769)
		colorLowPlants (0.310, 0.230, 0.170, 0.000)
		colorUpPlants  (0.510, 0.330, 0.190, 0.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		SpecularPower   30
		Hapke           0.711173
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          77.511
		Density         0.0288827
		Pressure        0.0196041
		Greenhouse      0.874915
		Bright          7.80059
		Opacity         1
		SkyLight        2.6002
		Hue             0.0342543
		Saturation      1

		Composition
		{
			CO2   	98.5097
			H2S   	0.753772
			C3H8  	0.404065
			SO2   	0.332393
			Ar    	4.64715e-005
			Cl2   	4.07959e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   7.86412
		Period          10.0951
		Eccentricity    0.0560413
		Inclination     0.481418
		AscendingNode   -70.0675
		ArgOfPericenter 125.251
		MeanAnomaly     181.929
	}
}

DwarfMoon	"Eadu System 3.D1"
{
	ParentBody     "Eadu System 3"
	Class	       "Asteroid"

	Mass            2.00556e-010
	Radius          8.1288
	InertiaMoment   0.398897

	Oblateness      0.249

	Obliquity       -0.0119864
	EqAscendNode    -90.0665
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.744 0.740 0.738)

	Surface
	{
		SurfStyle       0.75129
		OceanStyle      0.577226
		Randomize      (0.917, -0.682, -0.460)
		colorDistMagn   0.50814
		colorDistFreq   0.0549726
		detailScale     221.97
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.57316
		terraceProb     0.368523
		erosion         0
		montesMagn      0.504313
		montesFreq      2.79568
		montesSpiky     0.865132
		montesFraction  0.383701
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.187007
		hillsFraction   0.678277
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249043
		craterFreq      0.155843
		craterDensity   0.932015
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.489365
		volcanoTemp     1382.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.290, 0.252, 0.207, 0.000)
		colorShelf     (0.298, 0.259, 0.236, 0.000)
		colorBeach     (0.350, 0.304, 0.280, 0.000)
		colorDesert    (0.379, 0.326, 0.273, 0.000)
		colorLowland   (0.417, 0.348, 0.310, 0.000)
		colorUpland    (0.461, 0.422, 0.376, 0.000)
		colorRock      (0.498, 0.459, 0.406, 0.000)
		colorSnow      (0.543, 0.489, 0.428, 1.000)
		BumpHeight      7.31592
		BumpOffset      1.46318
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   6.05629e-005
		Period          0.000782152
		Eccentricity    1.84031e-005
		Inclination     -0.0119864
		AscendingNode   -90.0665
		ArgOfPericenter -24.7899
		MeanAnomaly     -177.337
	}
}

DwarfMoon	"Eadu System 3.D2"
{
	ParentBody     "Eadu System 3"
	Class	       "Asteroid"

	Mass            3.09793e-010
	Radius          4.77075
	InertiaMoment   0.399827

	Oblateness      0.035251

	Obliquity       -0.0116347
	EqAscendNode    13.6128
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.731 0.682 0.617)

	Surface
	{
		SurfStyle       0.981105
		OceanStyle      0.620372
		Randomize      (-0.855, 0.512, 0.303)
		colorDistMagn   0.0875121
		colorDistFreq   0.0119132
		detailScale     130.273
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.72492
		terraceProb     0.501802
		erosion         0
		montesMagn      0.447419
		montesFreq      2.88954
		montesSpiky     0.9102
		montesFraction  0.511711
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0469236
		hillsFraction   0.683909
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243931
		craterFreq      0.214888
		craterDensity   0.727281
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.492303
		volcanoTemp     1528.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.248, 0.239, 0.247, 0.050)
		colorShelf     (0.292, 0.280, 0.284, 0.040)
		colorBeach     (0.336, 0.321, 0.321, 0.030)
		colorDesert    (0.380, 0.362, 0.364, 0.020)
		colorLowland   (0.424, 0.403, 0.401, 0.030)
		colorUpland    (0.468, 0.444, 0.438, 0.050)
		colorRock      (0.512, 0.485, 0.488, 0.020)
		colorSnow      (0.512, 0.485, 0.488, 1.000)
		BumpHeight      4.29368
		BumpOffset      0.858735
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   7.65471e-005
		Period          0.00111141
		Eccentricity    6.51383e-005
		Inclination     -0.0116347
		AscendingNode   13.6128
		ArgOfPericenter 164.267
		MeanAnomaly     124.861
	}
}

DwarfMoon	"Eadu System 3.D3"
{
	ParentBody     "Eadu System 3"
	Class	       "Asteroid"

	Mass            8.9043e-005
	Radius          268.223
	InertiaMoment   0.396682

	Oblateness      0.00411569

	Obliquity       0.1496
	EqAscendNode    -7.16306
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.698 0.696 0.695)

	Surface
	{
		SurfStyle       0.38731
		OceanStyle      0.960996
		Randomize      (-0.974, -0.743, -0.148)
		colorDistMagn   0.609174
		colorDistFreq   36.0695
		detailScale     7324.27
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0052134
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.357772
		terraceProb     0.269334
		erosion         0
		montesMagn      0.501037
		montesFreq      3.161
		montesSpiky     0.99769
		montesFraction  0.46513
		dunesFraction   0
		hillsMagn       0
		hillsFreq       197.242
		hillsFraction   0.584254
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220573
		craterFreq      3.06432
		craterDensity   0.800362
		craterOctaves   17
		volcanoActivity 0.271773
		volcanoFlows    0
		volcanoRadius   0.528513
		volcanoTemp     1567.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.279, 0.278, 0.278, 0.000)
		colorShelf     (0.297, 0.296, 0.295, 0.000)
		colorBeach     (0.314, 0.313, 0.313, 0.000)
		colorDesert    (0.332, 0.331, 0.330, 0.000)
		colorLowland   (0.349, 0.348, 0.347, 0.000)
		colorUpland    (0.366, 0.365, 0.365, 0.000)
		colorRock      (0.384, 0.383, 0.382, 0.000)
		colorSnow      (0.401, 0.400, 0.400, 1.000)
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
		SemiMajorAxis   0.000132934
		Period          0.00254259
		Eccentricity    0.00498882
		Inclination     0.1496
		AscendingNode   -7.16306
		ArgOfPericenter -82.1238
		MeanAnomaly     -166.827
	}
}

Moon	"Eadu System 3.1"
{
	ParentBody     "Eadu System 3"
	Class	       "Selena"

	Mass            0.000110093
	Radius          367.89
	InertiaMoment   0.399786

	Oblateness      0.00199496

	Obliquity       -0.751128
	EqAscendNode    30.9458
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.755 0.637 0.577)

	Surface
	{
		SurfStyle       0.859497
		OceanStyle      0.798945
		Randomize      (0.920, -0.500, 0.864)
		colorDistMagn   0.0761916
		colorDistFreq   39.5622
		detailScale     946.234
		colorConversion true
		drivenDarkening 0
		seaLevel        0.260361
		snowLevel       2
		tropicLatitude  0.0252662
		icecapLatitude  10
		icecapHeight    0.197554
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.9146
		venusFreq       0.756296
		venusMagn       0
		mareFreq        0
		mareDensity     0.000208779
		terraceProb     0.268971
		erosion         0
		montesMagn      0.0479111
		montesFreq      22.9306
		montesSpiky     0.96612
		montesFraction  0.665233
		dunesMagn       0.0468979
		dunesFreq       490.824
		dunesFraction   0.930107
		hillsMagn       0.118154
		hillsFreq       42.584
		hillsFraction   0.799219
		hills2Fraction  0
		riversMagn      49.6106
		riversFreq      2.43447
		riversSin       7.28241
		riversOctaves   0
		canyonsMagn     0.640397
		canyonsFreq     0.114911
		canyonFraction  0.796225
		cracksMagn      0.0535469
		cracksFreq      0.169917
		cracksOctaves   0
		craterMagn      0.693373
		craterFreq      0.999615
		craterDensity   0.746463
		craterOctaves   8
		craterRayedFactor 0
		volcanoMagn     0.20626
		volcanoFreq     0.747601
		volcanoDensity  0.318258
		volcanoOctaves  3
		volcanoActivity 0.653329
		volcanoFlows    0.143882
		volcanoRadius   0.171801
		volcanoTemp     1442.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.400, 0.350, 0.320, 0.000)
		colorShelf     (0.470, 0.410, 0.380, 0.000)
		colorBeach     (0.423, 0.299, 0.242, 0.000)
		colorDesert    (0.385, 0.280, 0.214, 0.000)
		colorLowland   (0.294, 0.216, 0.162, 0.000)
		colorUpland    (0.498, 0.382, 0.300, 0.000)
		colorRock      (0.670, 0.620, 0.550, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      18.3945
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
		SemiMajorAxis   0.000217113
		Period          0.00530656
		Eccentricity    0.0392245
		Inclination     -0.751128
		AscendingNode   30.9458
		ArgOfPericenter 52.4949
		MeanAnomaly     -124.038
	}
}

Moon	"Eadu System 3.2"
{
	ParentBody     "Eadu System 3"
	Class	       "Selena"

	Mass            0.0001341
	Radius          307.327
	InertiaMoment   0.399315

	Obliquity       1.47979
	EqAscendNode    -56.0338
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.587 0.583 0.581)

	Surface
	{
		SurfStyle       0.824212
		OceanStyle      0.199935
		Randomize      (0.295, -0.126, 0.210)
		colorDistMagn   0.0719652
		colorDistFreq   39.7747
		detailScale     790.462
		colorConversion true
		drivenDarkening 0
		seaLevel        0.1596
		snowLevel       2
		tropicLatitude  0.0455843
		icecapLatitude  10
		icecapHeight    0.234332
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.05244
		venusFreq       1.50188
		venusMagn       0
		mareFreq        0
		mareDensity     0.000405653
		terraceProb     0.267825
		erosion         0
		montesMagn      0.0569029
		montesFreq      16.2458
		montesSpiky     0.940249
		montesFraction  0.342672
		dunesMagn       0.0455578
		dunesFreq       414.069
		dunesFraction   0.588602
		hillsMagn       0.109686
		hillsFreq       36.1298
		hillsFraction   0.806355
		hills2Fraction  0
		riversMagn      62.9201
		riversFreq      3.77676
		riversSin       7.14292
		riversOctaves   0
		canyonsMagn     0.555821
		canyonsFreq     0.106436
		canyonFraction  0.113019
		cracksMagn      0.0235133
		cracksFreq      0.124689
		cracksOctaves   0
		craterMagn      0.730158
		craterFreq      1.01518
		craterDensity   0.8573
		craterOctaves   8
		craterRayedFactor 0.117469
		volcanoMagn     0.19418
		volcanoFreq     0.480131
		volcanoDensity  0.219021
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.24408
		volcanoRadius   0.170701
		volcanoTemp     1404.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.400, 0.350, 0.320, 0.000)
		colorShelf     (0.470, 0.410, 0.380, 0.000)
		colorBeach     (0.329, 0.274, 0.244, 0.000)
		colorDesert    (0.300, 0.257, 0.215, 0.000)
		colorLowland   (0.229, 0.198, 0.163, 0.000)
		colorUpland    (0.388, 0.350, 0.302, 0.000)
		colorRock      (0.670, 0.620, 0.550, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      15.3663
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
		SemiMajorAxis   0.000354597
		Period          0.011075
		Eccentricity    0.0016475
		Inclination     1.47979
		AscendingNode   -56.0338
		ArgOfPericenter 72.1138
		MeanAnomaly     -75.8379
	}
}

DwarfMoon	"Eadu System 3.D4"
{
	ParentBody     "Eadu System 3"
	Class	       "Asteroid"

	Mass            1.43213e-009
	Radius          15.0669
	InertiaMoment   0.398055

	Obliquity       -1.46711
	EqAscendNode    -136.434
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.541 0.537 0.535)

	Surface
	{
		SurfStyle       0.678449
		OceanStyle      0.0345957
		Randomize      (-0.870, -0.131, 0.463)
		colorDistMagn   0.501932
		colorDistFreq   0.174173
		detailScale     411.426
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0190014
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.334196
		terraceProb     0.208918
		erosion         0
		montesMagn      0.272624
		montesFreq      2.32282
		montesSpiky     0.975386
		montesFraction  0.723217
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.536988
		hillsFraction   0.491736
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252884
		craterFreq      0.187804
		craterDensity   0.710198
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.590856
		volcanoTemp     1344.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.211, 0.183, 0.150, 0.000)
		colorShelf     (0.217, 0.188, 0.171, 0.000)
		colorBeach     (0.255, 0.220, 0.203, 0.000)
		colorDesert    (0.276, 0.236, 0.198, 0.000)
		colorLowland   (0.303, 0.252, 0.225, 0.000)
		colorUpland    (0.336, 0.306, 0.273, 0.000)
		colorRock      (0.363, 0.333, 0.294, 0.000)
		colorSnow      (0.395, 0.355, 0.311, 1.000)
		BumpHeight      13.5602
		BumpOffset      2.71203
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.000579141
		Period          0.0231291
		Eccentricity    0.00145038
		Inclination     -1.46711
		AscendingNode   -136.434
		ArgOfPericenter -87.1932
		MeanAnomaly     68.5773
	}
}

Moon	"Eadu System 3.3"
{
	ParentBody     "Eadu System 3"
	Class	       "Selena"

	Mass            0.000192563
	Radius          389.294
	InertiaMoment   0.398197

	Obliquity       -1.20869
	EqAscendNode    -59.4702
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.590 0.586 0.583)

	Surface
	{
		SurfStyle       0.270951
		OceanStyle      0.895156
		Randomize      (0.656, -0.043, -0.522)
		colorDistMagn   0.0472483
		colorDistFreq   50.3928
		detailScale     1001.29
		colorConversion true
		drivenDarkening 0
		seaLevel        0.210675
		snowLevel       2
		tropicLatitude  0.0366263
		icecapLatitude  10
		icecapHeight    0.132628
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.62154
		venusFreq       0.496841
		venusMagn       0
		mareFreq        0
		mareDensity     0.000519022
		terraceProb     0.198229
		erosion         0
		montesMagn      0.0681363
		montesFreq      16.5261
		montesSpiky     0.965272
		montesFraction  0.735958
		dunesMagn       0.0329845
		dunesFreq       500.199
		dunesFraction   0.52944
		hillsMagn       0.136717
		hillsFreq       47.3327
		hillsFraction   0.223325
		hills2Fraction  0
		riversMagn      57.8752
		riversFreq      3.05204
		riversSin       4.46684
		riversOctaves   0
		canyonsMagn     0.562412
		canyonsFreq     0.173057
		canyonFraction  0.762499
		cracksMagn      0.050411
		cracksFreq      0.219734
		cracksOctaves   0
		craterMagn      0.551802
		craterFreq      0.771398
		craterDensity   0.941493
		craterOctaves   9
		craterRayedFactor 0.0593857
		volcanoMagn     0.181394
		volcanoFreq     0.849134
		volcanoDensity  0.193602
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.140815
		volcanoRadius   0.15724
		volcanoTemp     1906.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.420, 0.420, 0.430, 0.000)
		colorShelf     (0.470, 0.480, 0.480, 0.000)
		colorBeach     (0.325, 0.334, 0.350, 0.000)
		colorDesert    (0.283, 0.270, 0.268, 0.000)
		colorLowland   (0.360, 0.358, 0.326, 0.000)
		colorUpland    (0.384, 0.381, 0.355, 0.000)
		colorRock      (0.340, 0.340, 0.340, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      19.4647
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
		SemiMajorAxis   0.000945875
		Period          0.0482378
		Eccentricity    0.0265867
		Inclination     -1.20869
		AscendingNode   -59.4702
		ArgOfPericenter 124.987
		MeanAnomaly     -44.2974
	}
}

DwarfMoon	"Eadu System 3.D5"
{
	ParentBody     "Eadu System 3"
	Class	       "Asteroid"

	Mass            2.8399e-009
	Radius          20.7605
	InertiaMoment   0.395679

	RotationPeriod  755.696
	Obliquity       -90.1516
	EqAscendNode    102.519
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.756 0.752 0.751)

	Surface
	{
		SurfStyle       0.581919
		OceanStyle      0.248027
		Randomize      (0.489, 0.047, 0.926)
		colorDistMagn   0.0133343
		colorDistFreq   0.235513
		detailScale     566.9
		colorConversion true
		snowLevel       2
		tropicLatitude  0.986938
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.399868
		terraceProb     0.373039
		erosion         0
		montesMagn      0.521674
		montesFreq      3.54359
		montesSpiky     0.920658
		montesFraction  0.401288
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.962733
		hillsFraction   0.532132
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23328
		craterFreq      0.169204
		craterDensity   0.881387
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.40125
		volcanoTemp     1623.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.295, 0.256, 0.210, 0.000)
		colorShelf     (0.302, 0.263, 0.240, 0.000)
		colorBeach     (0.355, 0.308, 0.285, 0.000)
		colorDesert    (0.385, 0.331, 0.278, 0.000)
		colorLowland   (0.423, 0.354, 0.315, 0.000)
		colorUpland    (0.468, 0.429, 0.383, 0.000)
		colorRock      (0.506, 0.466, 0.413, 0.000)
		colorSnow      (0.552, 0.497, 0.435, 1.000)
		BumpHeight      18.6844
		BumpOffset      3.73689
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0043621
		Period          0.478106
		Eccentricity    0.312267
		Inclination     -59.3286
		AscendingNode   100.887
		ArgOfPericenter -93.4648
		MeanAnomaly     -48.9804
	}
}

DwarfMoon	"Eadu System 3.D6"
{
	ParentBody     "Eadu System 3"
	Class	       "Asteroid"

	Mass            3.94764e-009
	Radius          12.0851
	InertiaMoment   0.398247

	RotationPeriod  433.233
	Obliquity       57.1352
	EqAscendNode    -124.225
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.462 0.458 0.451)

	Surface
	{
		SurfStyle       0.545228
		OceanStyle      0.601419
		Randomize      (0.229, -0.037, -0.428)
		colorDistMagn   0.778967
		colorDistFreq   0.116339
		detailScale     330.004
		colorConversion true
		snowLevel       2
		tropicLatitude  0.737212
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.607951
		terraceProb     0.216536
		erosion         0
		montesMagn      0.391784
		montesFreq      3.26254
		montesSpiky     0.944167
		montesFraction  0.692628
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.32095
		hillsFraction   0.761876
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25112
		craterFreq      0.243925
		craterDensity   0.990649
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.579846
		volcanoTemp     1917.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.180, 0.156, 0.126, 0.000)
		colorShelf     (0.185, 0.160, 0.144, 0.000)
		colorBeach     (0.217, 0.188, 0.171, 0.000)
		colorDesert    (0.235, 0.201, 0.167, 0.000)
		colorLowland   (0.258, 0.215, 0.189, 0.000)
		colorUpland    (0.286, 0.261, 0.230, 0.000)
		colorRock      (0.309, 0.284, 0.248, 0.000)
		colorSnow      (0.337, 0.302, 0.261, 1.000)
		BumpHeight      10.8766
		BumpOffset      2.17532
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.00485745
		Period          0.561815
		Eccentricity    0.081819
		Inclination     49.1008
		AscendingNode   -120.305
		ArgOfPericenter 18.429
		MeanAnomaly     105.197
	}
}

DwarfMoon	"Eadu System 3.D7"
{
	ParentBody     "Eadu System 3"
	Class	       "Asteroid"

	Mass            5.45095e-009
	Radius          12.6679
	InertiaMoment   0.399311

	RotationPeriod  397.716
	Obliquity       98.5939
	EqAscendNode    20.4439
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.715 0.713 0.708)

	Surface
	{
		SurfStyle       0.794983
		OceanStyle      0.721236
		Randomize      (-0.733, -0.145, -0.689)
		colorDistMagn   0.615784
		colorDistFreq   0.0887499
		detailScale     345.918
		colorConversion true
		snowLevel       2
		tropicLatitude  0.694265
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.414003
		terraceProb     0.257097
		erosion         0
		montesMagn      0.398224
		montesFreq      3.07097
		montesSpiky     0.990606
		montesFraction  0.21444
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.383676
		hillsFraction   0.609473
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258375
		craterFreq      0.259914
		craterDensity   0.90331
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.521023
		volcanoTemp     1577.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.279, 0.242, 0.198, 0.000)
		colorShelf     (0.286, 0.249, 0.227, 0.000)
		colorBeach     (0.336, 0.292, 0.269, 0.000)
		colorDesert    (0.365, 0.314, 0.262, 0.000)
		colorLowland   (0.400, 0.335, 0.298, 0.000)
		colorUpland    (0.443, 0.406, 0.361, 0.000)
		colorRock      (0.479, 0.442, 0.390, 0.000)
		colorSnow      (0.522, 0.470, 0.411, 1.000)
		BumpHeight      11.4011
		BumpOffset      2.28022
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.00543103
		Period          0.664209
		Eccentricity    0.477839
		Inclination     38.5419
		AscendingNode   11.9038
		ArgOfPericenter 137.509
		MeanAnomaly     -99.3247
	}
}

DwarfMoon	"Eadu System 3.D8"
{
	ParentBody     "Eadu System 3"
	Class	       "Asteroid"

	Mass            7.48593e-009
	Radius          31.9306
	InertiaMoment   0.396505

	RotationPeriod  765.62
	Obliquity       -140.893
	EqAscendNode    133.238
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.721 0.671 0.642)

	Surface
	{
		SurfStyle       0.179084
		OceanStyle      0.917911
		Randomize      (-0.563, 0.593, 0.591)
		colorDistMagn   0.0692316
		colorDistFreq   0.876983
		detailScale     871.917
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999327
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.466339
		terraceProb     0.281158
		erosion         0
		montesMagn      0.29636
		montesFreq      2.52824
		montesSpiky     0.923796
		montesFraction  0.609178
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.63979
		hillsFraction   0.784273
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238411
		craterFreq      0.231417
		craterDensity   0.998612
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.452732
		volcanoTemp     1712.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.288, 0.269, 0.257, 0.000)
		colorShelf     (0.306, 0.285, 0.273, 0.000)
		colorBeach     (0.324, 0.302, 0.289, 0.000)
		colorDesert    (0.342, 0.319, 0.305, 0.000)
		colorLowland   (0.360, 0.336, 0.321, 0.000)
		colorUpland    (0.378, 0.352, 0.337, 0.000)
		colorRock      (0.396, 0.369, 0.353, 0.000)
		colorSnow      (0.415, 0.386, 0.369, 1.000)
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
		SemiMajorAxis   0.00599332
		Period          0.769984
		Eccentricity    0.0726892
		Inclination     -62.076
		AscendingNode   135.875
		ArgOfPericenter -95.4855
		MeanAnomaly     -57.0172
	}
}

DwarfMoon	"Eadu System 3.D9"
{
	ParentBody     "Eadu System 3"
	Class	       "Asteroid"

	Mass            1.02363e-008
	Radius          17.9029
	InertiaMoment   0.398423

	RotationPeriod  415.794
	Obliquity       -15.4662
	EqAscendNode    67.9034
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.519 0.426 0.290)

	Surface
	{
		SurfStyle       0.809787
		OceanStyle      0.681914
		Randomize      (-0.511, -0.924, 0.332)
		colorDistMagn   0.457111
		colorDistFreq   0.163352
		detailScale     488.868
		colorConversion true
		snowLevel       2
		tropicLatitude  0.584801
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.537553
		terraceProb     0.21214
		erosion         0
		montesMagn      0.466744
		montesFreq      3.1669
		montesSpiky     0.785858
		montesFraction  0.934083
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.556737
		hillsFraction   0.363299
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243226
		craterFreq      0.250996
		craterDensity   1.05826
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.492609
		volcanoTemp     1488.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.203, 0.145, 0.081, 0.000)
		colorShelf     (0.208, 0.149, 0.093, 0.000)
		colorBeach     (0.244, 0.175, 0.110, 0.000)
		colorDesert    (0.265, 0.187, 0.107, 0.000)
		colorLowland   (0.291, 0.200, 0.122, 0.000)
		colorUpland    (0.322, 0.243, 0.148, 0.000)
		colorRock      (0.348, 0.264, 0.160, 0.000)
		colorSnow      (0.379, 0.281, 0.168, 1.000)
		BumpHeight      16.1126
		BumpOffset      3.22252
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.00623796
		Period          0.817608
		Eccentricity    0.0668132
		Inclination     -26.1209
		AscendingNode   62.5195
		ArgOfPericenter -71.1501
		MeanAnomaly     99.5647
	}
}

Barycenter	"Eadu System 5-5.1"
{
	ParentBody     "Eadu System"
	Mass            0.602278
	Radius          16669.2
	RotationPeriod  24
	Obliquity       0
	EqAscendNode    0
	//Precession      0

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   26.6746
		Eccentricity    0.0669204
		Inclination     -0.139622
		AscendingNode   132.989
		ArgOfPericenter 187.671
		MeanAnomaly     275.453
	}
}

Planet	"Eadu System 5"
{
	ParentBody     "Eadu System 5-5.1"
	Class	       "Desert"

	Mass            0.582247
	Radius          5254.58
	InertiaMoment   0.327342

	Oblateness      0.00700194

	RotationPeriod  16.1111
	Obliquity       36.5954
	EqAscendNode    64.219
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.779 0.695 0.664)

	Surface
	{
		SurfStyle       0.335228
		OceanStyle      0.309741
		Randomize      (0.025, -0.572, -0.773)
		colorDistMagn   0.0540238
		colorDistFreq   701.401
		detailScale     13515.1
		colorConversion true
		seaLevel        0.156449
		snowLevel       2
		tropicLatitude  0.595583
		icecapLatitude  0.947011
		icecapHeight    0.16006
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.538385
		venusFreq       1.50419
		venusMagn       0.445436
		mareFreq        2.07654
		mareDensity     0.148513
		terraceProb     0.149219
		erosion         0
		montesMagn      0.235549
		montesFreq      275.876
		montesSpiky     0.831209
		montesFraction  0.49051
		dunesMagn       0.0521237
		dunesFreq       54.3219
		dunesFraction   0.275087
		hillsMagn       0.13196
		hillsFreq       646.647
		hillsFraction   0
		hills2Fraction  0
		riversMagn      57.8203
		riversFreq      3.41003
		riversSin       6.42349
		riversOctaves   0
		canyonsMagn     0.0404094
		canyonsFreq     115.023
		canyonFraction  0
		cracksMagn      0.0795263
		cracksFreq      0.479321
		cracksOctaves   0
		craterMagn      0.685248
		craterFreq      14.5814
		craterDensity   0.650571
		craterOctaves   10.7248
		volcanoMagn     0.715287
		volcanoFreq     0.723241
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.406952
		volcanoRadius   0.53873
		volcanoTemp     1489.19
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
		Hapke           0.969488
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
		Height          58.3164
		Density         0.0030512
		Pressure        0.00334993
		Greenhouse      1.78707
		Bright          4.97616
		Opacity         1
		SkyLight        1.65872
		Hue             0
		Saturation      1

		Composition
		{
			H2O   	65.7957
			NH3   	10.6971
			C2H2  	8.73833
			CH4   	6.59473
			CO2   	5.06636
			C2H4  	1.14659
			C3H8  	0.61021
			C2H6  	0.55247
			H2S   	0.418025
			SO2   	0.288101
			N2    	0.0909963
			CO    	0.00122688
			Ar    	7.6146e-005
			Ne    	2.30937e-005
			O2    	1.57654e-005
		}
	}

	Aurora
	{
		Height      87.3764
		NorthLat    82.5065
		NorthLon    166.172
		NorthRadius 1615.23
		NorthWidth  368.31
		NorthRings  4
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -90
		SouthLon    331.185
		SouthRadius 1342.78
		SouthWidth  316.108
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
		SemiMajorAxis   7.73268e-005
		Period          0.0835472
		Eccentricity    0.00854105
		Inclination     0.111424
		AscendingNode   -111.752
		ArgOfPericenter 220.62
		MeanAnomaly     153.86
	}
}

Moon	"Eadu System 5.1"
{
	ParentBody     "Eadu System 5-5.1"
	Class	       "Selena"

	Mass            0.0200306
	Radius          2050.28
	InertiaMoment   0.362277

	RotationPeriod  583.4
	Obliquity       0.111424
	EqAscendNode    -111.752
	//Precession      0

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.721 0.719 0.713)

	Surface
	{
		SurfStyle       0.566332
		OceanStyle      0.86161
		Randomize      (-0.802, -0.298, -0.747)
		colorDistMagn   0.0638554
		colorDistFreq   283.022
		detailScale     5273.42
		colorConversion true
		drivenDarkening 0
		seaLevel        0.181582
		snowLevel       2
		tropicLatitude  0.00218366
		icecapLatitude  10
		icecapHeight    0.142296
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.81553
		venusFreq       0.825137
		venusMagn       0
		mareFreq        1.31439
		mareDensity     0.00448075
		terraceProb     0.335745
		erosion         0
		montesMagn      0.103352
		montesFreq      102.65
		montesSpiky     0.886268
		montesFraction  0.103082
		dunesMagn       0.0387637
		dunesFreq       2708.97
		dunesFraction   0.556872
		hillsMagn       0.120127
		hillsFreq       227.464
		hillsFraction   0.211465
		hills2Fraction  0
		riversMagn      52.6661
		riversFreq      3.39752
		riversSin       5.96389
		riversOctaves   0
		canyonsMagn     0.616078
		canyonsFreq     0.681134
		canyonFraction  0.713079
		cracksMagn      0.0327178
		cracksFreq      0.578596
		cracksOctaves   0
		craterMagn      0.5392
		craterFreq      4.82316
		craterDensity   0.946211
		craterOctaves   11
		craterRayedFactor 0.181789
		volcanoMagn     0.373397
		volcanoFreq     0.632722
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.181636
		volcanoRadius   0.30865
		volcanoTemp     1085.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.430, 0.400, 0.370, 0.000)
		colorShelf     (0.620, 0.600, 0.530, 0.000)
		colorBeach     (0.447, 0.438, 0.385, 0.000)
		colorDesert    (0.469, 0.446, 0.392, 0.000)
		colorLowland   (0.368, 0.331, 0.300, 0.000)
		colorUpland    (0.541, 0.510, 0.442, 0.000)
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
		SemiMajorAxis   0.00224773
		Period          0.0835472
		Eccentricity    0.00854105
		Inclination     0.111424
		AscendingNode   -111.752
		ArgOfPericenter 40.62
		MeanAnomaly     153.86
	}
}

Planet	"Eadu System 6"
{
	ParentBody     "Eadu System"
	Class	       "GasGiant"

	Mass            2307.37
	Radius          74632.8
	InertiaMoment   0.228151

	Oblateness      0.0132916

	RotationPeriod  8.36114
	Obliquity       54.924
	EqAscendNode    -144.693
	//Precession      0

	AlbedoBond      0.493074
	AlbedoGeom      0.591689
	Brightness      2

	Surface
	{
		SurfStyle       0.237717
		Randomize      (0.773, -0.074, 0.122)
		detailScale     191960
		colorConversion true
		tropicLatitude  0.826401
		icecapLatitude  1
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0.882694
		stripeZones     4.14871
		stripeFluct     0.384901
		stripeTwist     9.84472
		cycloneMagn     12.78
		cycloneFreq     0.717514
		cycloneDensity  0.389227
		cycloneOctaves  5
		colorLayer0    (0.810, 0.810, 0.810, 1.100)
		colorLayer1    (0.630, 0.650, 0.650, 0.800)
		colorLayer2    (0.580, 0.560, 0.580, 0.200)
		colorLayer3    (0.610, 0.610, 0.630, 0.050)
		colorLayer4    (0.720, 0.720, 0.720, 0.000)
		colorLayer5    (0.780, 0.780, 0.780, 0.000)
		colorLayer6    (0.540, 0.540, 0.560, 0.000)
		colorLayer7    (0.690, 0.660, 0.620, 1.000)
		colorLowPlants (0.720, 0.720, 0.720, 0.000)
		colorUpPlants  (0.780, 0.780, 0.780, 0.000)
		BumpHeight      4.872
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          23.8984
		Velocity        -317.182
		BumpHeight      19.0256
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.536438
		mainOctaves     12
		Coverage        0.430738
		stripeZones     4.14871
		stripeFluct     0.384901
		stripeTwist     9.84472
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          100
		Density         5400.39
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0446738
		Saturation      0.596802

		Composition
		{
			H2    	92.2614
			He    	7.41255
			CH4   	0.249883
			N2    	0.0366901
			NH3   	0.0246356
			O2    	0.00783295
			C2H2  	0.00321573
			C2H4  	0.00121293
			Ne    	0.00105876
			Ar    	0.000765685
			C2H6  	0.000509165
			C3H8  	0.000258485
		}
	}

	Aurora
	{
		Height      3706.53
		NorthLat    82.3541
		NorthLon    -146.291
		NorthRadius 18177.2
		NorthWidth  11580.8
		NorthRings  5
		NorthBright 1
		NorthParticles 10000
		SouthLat    -82.236
		SouthLon    26.1333
		SouthRadius 22307.2
		SouthWidth  11240.6
		SouthRings  4
		SouthBright 1
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	Rings
	{
		InnerRadius     92981.2
		OuterRadius     187438
		RotationPeriod  3.02824
		RotationOffset  0
		FrontBright     0.508461
		BackBright      0.809472
		Density         0.946116
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   43.3577
		Period          130.593
		Eccentricity    0.0643326
		Inclination     -1.03618
		AscendingNode   -140.907
		ArgOfPericenter 53.082
		MeanAnomaly     49.628
	}
}

DwarfMoon	"Eadu System 6.D1"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            2.537e-009
	Radius          21.736
	InertiaMoment   0.398634

	Oblateness      0.249

	Obliquity       -0.00796697
	EqAscendNode    48.291
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.671 0.667 0.663)

	Surface
	{
		SurfStyle       0.151135
		OceanStyle      0.659108
		Randomize      (0.888, -0.404, -0.085)
		colorDistMagn   0.798244
		colorDistFreq   0.244714
		detailScale     593.537
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.646119
		terraceProb     0.498895
		erosion         0
		montesMagn      0.39088
		montesFreq      2.60987
		montesSpiky     0.924093
		montesFraction  0.702667
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.35059
		hillsFraction   0.544731
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.283886
		craterFreq      0.251201
		craterDensity   0.858978
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.533842
		volcanoTemp     1557
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.268, 0.267, 0.265, 0.000)
		colorShelf     (0.285, 0.283, 0.282, 0.000)
		colorBeach     (0.302, 0.300, 0.298, 0.000)
		colorDesert    (0.319, 0.317, 0.315, 0.000)
		colorLowland   (0.335, 0.333, 0.331, 0.000)
		colorUpland    (0.352, 0.350, 0.348, 0.000)
		colorRock      (0.369, 0.367, 0.365, 0.000)
		colorSnow      (0.386, 0.383, 0.381, 1.000)
		BumpHeight      19.5624
		BumpOffset      3.91248
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.00190622
		Period          0.00100203
		Eccentricity    8.78606e-005
		Inclination     -0.00796697
		AscendingNode   48.291
		ArgOfPericenter -109.539
		MeanAnomaly     121.618
	}
}

DwarfMoon	"Eadu System 6.D2"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            3.53564e-009
	Radius          22.3661
	InertiaMoment   0.399608

	Oblateness      0.249

	Obliquity       -0.011639
	EqAscendNode    -94.7215
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.840 0.808 0.753)

	Surface
	{
		SurfStyle       0.227711
		OceanStyle      0.520579
		Randomize      (0.518, -0.984, 0.667)
		colorDistMagn   0.851804
		colorDistFreq   0.400654
		detailScale     610.743
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.742442
		terraceProb     0.333481
		erosion         0
		montesMagn      0.304097
		montesFreq      3.31265
		montesSpiky     0.881956
		montesFraction  0.779977
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.32302
		hillsFraction   0.589707
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242105
		craterFreq      0.15459
		craterDensity   0.852785
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.452643
		volcanoTemp     1453.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.336, 0.323, 0.301, 0.000)
		colorShelf     (0.357, 0.343, 0.320, 0.000)
		colorBeach     (0.378, 0.364, 0.339, 0.000)
		colorDesert    (0.399, 0.384, 0.358, 0.000)
		colorLowland   (0.420, 0.404, 0.377, 0.000)
		colorUpland    (0.441, 0.424, 0.395, 0.000)
		colorRock      (0.462, 0.444, 0.414, 0.000)
		colorSnow      (0.483, 0.465, 0.433, 1.000)
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
		SemiMajorAxis   0.00207184
		Period          0.00113542
		Eccentricity    4.22835e-005
		Inclination     -0.011639
		AscendingNode   -94.7215
		ArgOfPericenter 88.5216
		MeanAnomaly     155.744
	}
}

DwarfMoon	"Eadu System 6.D3"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            4.89233e-009
	Radius          23.869
	InertiaMoment   0.397405

	Oblateness      0.235492

	Obliquity       0.00140398
	EqAscendNode    128.1
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.647 0.643 0.642)

	Surface
	{
		SurfStyle       0.681087
		OceanStyle      0.807766
		Randomize      (0.384, 0.428, 0.065)
		colorDistMagn   0.0623321
		colorDistFreq   0.426482
		detailScale     651.783
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.512585
		terraceProb     0.375917
		erosion         0
		montesMagn      0.528034
		montesFreq      3.36803
		montesSpiky     0.903643
		montesFraction  0.434161
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.994528
		hillsFraction   0.634586
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.291864
		craterFreq      0.221302
		craterDensity   0.829047
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.499056
		volcanoTemp     1513.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.252, 0.219, 0.180, 0.000)
		colorShelf     (0.259, 0.225, 0.205, 0.000)
		colorBeach     (0.304, 0.264, 0.244, 0.000)
		colorDesert    (0.330, 0.283, 0.237, 0.000)
		colorLowland   (0.362, 0.302, 0.269, 0.000)
		colorUpland    (0.401, 0.367, 0.327, 0.000)
		colorRock      (0.433, 0.399, 0.353, 0.000)
		colorSnow      (0.472, 0.425, 0.372, 1.000)
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
		SemiMajorAxis   0.00215618
		Period          0.00120545
		Eccentricity    2.70763e-005
		Inclination     0.00140398
		AscendingNode   128.1
		ArgOfPericenter -142.15
		MeanAnomaly     -118.531
	}
}

Moon	"Eadu System 6.1"
{
	ParentBody     "Eadu System 6"
	Class	       "Desert"

	Mass            0.0693578
	Radius          3528.36
	InertiaMoment   0.335939

	Oblateness      0.00897655

	Obliquity       0.798509
	EqAscendNode    -100.688
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.768 0.672 0.592)

	Surface
	{
		SurfStyle       0.316451
		OceanStyle      0.532697
		Randomize      (-0.096, -0.087, -0.373)
		colorDistMagn   0.0844844
		colorDistFreq   406.254
		detailScale     9075.15
		colorConversion true
		seaLevel        0.0583861
		snowLevel       2
		tropicLatitude  0.0177864
		icecapLatitude  10
		icecapHeight    0.108899
		climatePole     0.48132
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        0.57827
		venusFreq       0.604107
		venusMagn       0
		mareFreq        1.89592
		mareDensity     0.010904
		terraceProb     0.527491
		erosion         0
		montesMagn      0.252103
		montesFreq      210.576
		montesSpiky     0.789644
		montesFraction  0.398015
		dunesMagn       0.0438547
		dunesFreq       31.0417
		dunesFraction   0.0344538
		hillsMagn       0.12195
		hillsFreq       402.891
		hillsFraction   0
		hills2Fraction  0
		riversMagn      61.7387
		riversFreq      2.66955
		riversSin       6.55414
		riversOctaves   0
		canyonsMagn     0.0448241
		canyonsFreq     88.2938
		canyonFraction  0
		cracksMagn      0.109632
		cracksFreq      0.369805
		cracksOctaves   0
		craterMagn      0.625443
		craterFreq      8.55167
		craterDensity   0.351325
		craterOctaves   4.36107
		volcanoMagn     0.654954
		volcanoFreq     0.725588
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.786898
		volcanoRadius   0.4964
		volcanoTemp     1346.38
		lavaCoverTidal  0.567338
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
		Hapke           0.920419
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          158.283
		Density         0.00795813
		Pressure        0.0059186
		Greenhouse      0.228805
		Bright          6.02785
		Opacity         1
		SkyLight        2.00928
		Hue             0.00563646
		Saturation      1

		Composition
		{
			CO2   	72.9035
			SO2   	27.0793
			C3H8  	0.0170271
			Cl2   	0.000209909
			Kr    	1.76504e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00362607
		Period          0.00262887
		Eccentricity    0.0312112
		Inclination     0.798509
		AscendingNode   -100.688
		ArgOfPericenter -22.272
		MeanAnomaly     151.272
	}
}

Moon	"Eadu System 6.2"
{
	ParentBody     "Eadu System 6"
	Class	       "Desert"

	Mass            0.0807439
	Radius          3483.57
	InertiaMoment   0.330999

	Oblateness      0.00200732

	Obliquity       1.13193
	EqAscendNode    1.29209
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.603 0.599 0.597)

	Surface
	{
		SurfStyle       0.55844
		OceanStyle      0.71551
		Randomize      (0.366, -0.078, -0.874)
		colorDistMagn   0.0694924
		colorDistFreq   487.876
		detailScale     8959.94
		colorConversion true
		seaLevel        0.0840956
		snowLevel       2
		tropicLatitude  0.0394993
		icecapLatitude  0.850226
		icecapHeight    0.0921447
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.945209
		venusFreq       1.50216
		venusMagn       0
		mareFreq        2.27724
		mareDensity     0.0147164
		terraceProb     0.31902
		erosion         0
		montesMagn      0.207353
		montesFreq      167.704
		montesSpiky     0.896299
		montesFraction  0.698508
		dunesMagn       0.054302
		dunesFreq       28.1986
		dunesFraction   0.0845583
		hillsMagn       0.130302
		hillsFreq       370.644
		hillsFraction   0
		hills2Fraction  0
		riversMagn      62.1157
		riversFreq      3.28863
		riversSin       5.46365
		riversOctaves   0
		canyonsMagn     0.059192
		canyonsFreq     96.7754
		canyonFraction  0
		cracksMagn      0.107509
		cracksFreq      0.253527
		cracksOctaves   0
		craterMagn      0.589368
		craterFreq      8.38762
		craterDensity   0.451808
		craterOctaves   5.87468
		volcanoMagn     0.699904
		volcanoFreq     0.80571
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.736755
		volcanoRadius   0.478639
		volcanoTemp     1250.27
		lavaCoverTidal  0.274749
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
		Hapke           0.640134
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
		Height          59.0616
		Density         0.0359866
		Pressure        0.0111909
		Greenhouse      0.320536
		Bright          8.15132
		Opacity         1
		SkyLight        2.71711
		Hue             0.0133879
		Saturation      1

		Composition
		{
			CO2   	99.9541
			C3H8  	0.0449339
			SO2   	0.000778566
			Ar    	0.000193247
			Kr    	1.82014e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00557311
		Period          0.0050091
		Eccentricity    0.0118821
		Inclination     1.13193
		AscendingNode   1.29209
		ArgOfPericenter 44.1538
		MeanAnomaly     168.884
	}
}

Moon	"Eadu System 6.3"
{
	ParentBody     "Eadu System 6"
	Class	       "Desert"

	Mass            0.0937639
	Radius          3375.41
	InertiaMoment   0.333513

	Obliquity       -0.950655
	EqAscendNode    70.9324
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.746 0.619 0.547)

	Surface
	{
		SurfStyle       0.38228
		OceanStyle      0.179922
		Randomize      (-0.604, -0.607, 0.371)
		colorDistMagn   0.058065
		colorDistFreq   416.261
		detailScale     8681.74
		colorConversion true
		seaLevel        0.106424
		snowLevel       2
		tropicLatitude  0.0270234
		icecapLatitude  0.807803
		icecapHeight    0.113071
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.98862
		venusFreq       1.61778
		venusMagn       0.204664
		mareFreq        0.877346
		mareDensity     0.022908
		terraceProb     0.515225
		erosion         0
		montesMagn      0.154905
		montesFreq      204.366
		montesSpiky     0.89604
		montesFraction  0.771907
		dunesMagn       0.0674765
		dunesFreq       33.7057
		dunesFraction   0.85827
		hillsMagn       0.169848
		hillsFreq       258.133
		hillsFraction   0
		hills2Fraction  0
		riversMagn      62.5499
		riversFreq      3.50726
		riversSin       6.66283
		riversOctaves   0
		canyonsMagn     0.030959
		canyonsFreq     77.566
		canyonFraction  0
		cracksMagn      0.0690531
		cracksFreq      0.345784
		cracksOctaves   0
		craterMagn      0.636893
		craterFreq      12.3979
		craterDensity   0.334046
		craterOctaves   4.50352
		volcanoMagn     0.68495
		volcanoFreq     0.692371
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.542222
		volcanoRadius   0.490185
		volcanoTemp     1420.2
		lavaCoverTidal  0.261291
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
		Hapke           0
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
		Height          53.1952
		Density         0.108704
		Pressure        0.0337249
		Greenhouse      0.493169
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.0211392
		Saturation      1

		Composition
		{
			CO2   	99.6316
			H2S   	0.359187
			C2H6  	0.00604794
			C3H8  	0.0020187
			Ar    	0.000786987
			O2    	0.000336625
			Kr    	1.96422e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00856563
		Period          0.00954446
		Eccentricity    0.0487048
		Inclination     -0.950655
		AscendingNode   70.9324
		ArgOfPericenter -65.9638
		MeanAnomaly     82.9116
	}
}

Moon	"Eadu System 6.4"
{
	ParentBody     "Eadu System 6"
	Class	       "Desert"

	Mass            0.108686
	Radius          4075.28
	InertiaMoment   0.330951

	Obliquity       0.739225
	EqAscendNode    -156.514
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.786 0.784 0.782)

	Surface
	{
		SurfStyle       0.626329
		OceanStyle      0.118004
		Randomize      (-0.974, 0.292, 0.215)
		colorDistMagn   0.0476353
		colorDistFreq   502.709
		detailScale     10481.8
		colorConversion true
		seaLevel        0.12325
		snowLevel       2
		tropicLatitude  0.00524759
		icecapLatitude  0.772048
		icecapHeight    0.140046
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.16557
		venusFreq       0.870401
		venusMagn       0.584318
		mareFreq        1.98266
		mareDensity     0.0147358
		terraceProb     0.437297
		erosion         0
		montesMagn      0.190665
		montesFreq      217.285
		montesSpiky     0.989262
		montesFraction  0.38562
		dunesMagn       0.045493
		dunesFreq       33.2418
		dunesFraction   0.751143
		hillsMagn       0.128321
		hillsFreq       552.445
		hillsFraction   0
		hills2Fraction  0
		riversMagn      58.18
		riversFreq      3.01701
		riversSin       7.15785
		riversOctaves   0
		canyonsMagn     0.0475091
		canyonsFreq     107.359
		canyonFraction  0
		cracksMagn      0.117166
		cracksFreq      0.340594
		cracksOctaves   0
		craterMagn      0.526706
		craterFreq      11.6924
		craterDensity   0.607315
		craterOctaves   8.02967
		volcanoMagn     0.70166
		volcanoFreq     0.603357
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.289763
		volcanoRadius   0.52667
		volcanoTemp     1361.71
		lavaCoverTidal  0.0275944
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
		Hapke           0.701482
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
		Height          55.1476
		Density         0.0298518
		Pressure        0.00873892
		Greenhouse      0.271098
		Bright          7.85225
		Opacity         1
		SkyLight        2.61742
		Hue             0.0288906
		Saturation      1

		Composition
		{
			CO2   	97.5478
			H2S   	2.43113
			C3H8  	0.0110028
			Ar    	0.0096754
			SO2   	0.000217118
			Kr    	8.77826e-005
			O2    	8.51317e-005
			Xe    	3.72305e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.013165
		Period          0.0181862
		Eccentricity    0.0191992
		Inclination     0.739225
		AscendingNode   -156.514
		ArgOfPericenter -156.864
		MeanAnomaly     -5.37941
	}
}

Moon	"Eadu System 6.5"
{
	ParentBody     "Eadu System 6"
	Class	       "Desert"

	Mass            1.25835
	Radius          7535.86
	InertiaMoment   0.330001

	Obliquity       -1.43303
	EqAscendNode    -69.9402
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.351711
	AlbedoGeom      0.422054
	Brightness      2
	Color          (0.818 0.744 0.701)

	Surface
	{
		SurfStyle       0.402504
		OceanStyle      0.950184
		Randomize      (-0.426, -0.271, -0.974)
		colorDistMagn   0.0462786
		colorDistFreq   843.806
		detailScale     19382.7
		colorConversion true
		seaLevel        0.0534998
		snowLevel       2
		tropicLatitude  0.0409779
		icecapLatitude  10
		icecapHeight    0.175653
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        1.07692
		venusFreq       1.0935
		venusMagn       0.286318
		mareFreq        2.43346
		mareDensity     0.162703
		terraceProb     0.276336
		erosion         0
		montesMagn      0.198397
		montesFreq      390.801
		montesSpiky     0.973016
		montesFraction  0.149096
		dunesMagn       0.0486879
		dunesFreq       69.4164
		dunesFraction   0.375623
		hillsMagn       0.1222
		hillsFreq       895.969
		hillsFraction   0
		hills2Fraction  0
		riversMagn      67.8994
		riversFreq      3.73673
		riversSin       7.84098
		riversOctaves   0
		canyonsMagn     0.0589673
		canyonsFreq     183.63
		canyonFraction  0
		cracksMagn      0.0827215
		cracksFreq      0.593224
		cracksOctaves   0
		craterMagn      0.55788
		craterFreq      26.9645
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.652987
		volcanoFreq     0.726339
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.744575
		volcanoRadius   0.383659
		volcanoTemp     1556.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.14224
		stripeTwist     0.548259
		cycloneMagn     2.14207
		cycloneFreq     0.988048
		cycloneDensity  0.313383
		cycloneOctaves  3
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
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Clouds
	{
		Height          54.3516
		Velocity        59.7498
		BumpHeight      6.57561
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.955404
		mainOctaves     10
		Coverage        0.303423
		stripeZones     2.14224
		stripeTwist     0.548259
	}

	Clouds
	{
		Height          98.7026
		Velocity        102.033
		BumpHeight      5.15356
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.955404
		mainOctaves     10
		Coverage        0.303423
		stripeZones     2.14224
		stripeTwist     0.548259
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Thick"
		Height          350.234
		Density         230.598
		Pressure        486.709
		Greenhouse      489.166
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.587964
		Saturation      0.5

		Composition
		{
			H2O   	71.795
			CO2   	27.3563
			SO2   	0.754431
			H2S   	0.0333853
			CH4   	0.0234764
			NH3   	0.0224535
			C2H6  	0.00587334
			C2H2  	0.00553553
			N2    	0.00200545
			C3H8  	0.000691241
			C2H4  	0.000686049
			CO    	7.29418e-005
			Ar    	4.40918e-005
			Ne    	3.77735e-005
		}
	}

	Aurora
	{
		Height      180.764
		NorthLat    85.1631
		NorthLon    -179.627
		NorthRadius 1188.63
		NorthWidth  325.771
		NorthRings  5
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -83.9323
		SouthLon    -8.67397
		SouthRadius 2378.47
		SouthWidth  897.781
		SouthRings  4
		SouthBright 0.3
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	Rings
	{
		InnerRadius     11542
		OuterRadius     23750.4
		RotationPeriod  5.78973
		RotationOffset  0
		FrontBright     0.845473
		BackBright      0.772909
		Density         0.899645
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.020234
		Period          0.0346439
		Eccentricity    0.0115738
		Inclination     -1.43303
		AscendingNode   -69.9402
		ArgOfPericenter -102.416
		MeanAnomaly     103.477
	}
}

Moon	"Eadu System 6.6"
{
	ParentBody     "Eadu System 6"
	Class	       "IceWorld"

	Mass            0.145608
	Radius          4473.58
	InertiaMoment   0.329052

	Obliquity       -0.211763
	EqAscendNode    -26.8447
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.671 0.666 0.661)

	Surface
	{
		SurfStyle       0.531638
		OceanStyle      0.734515
		Randomize      (-0.332, -0.314, -0.751)
		colorDistMagn   0.0690719
		colorDistFreq   616.379
		detailScale     11506.3
		colorConversion true
		drivenDarkening 0
		seaLevel        0.0882916
		snowLevel       0.879996
		tropicLatitude  0.00719279
		icecapLatitude  0.500267
		icecapHeight    0.107853
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.86959
		venusFreq       1.00257
		venusMagn       0
		mareFreq        1.89826
		mareDensity     0.0127263
		terraceProb     0.266686
		erosion         0
		montesMagn      0.23595
		montesFreq      196.801
		montesSpiky     0.994889
		montesFraction  0.945376
		dunesMagn       0.0443224
		dunesFreq       5754.69
		dunesFraction   0.871957
		hillsMagn       0.105971
		hillsFreq       541.927
		hillsFraction   0.678049
		hills2Fraction  0.05458
		riversMagn      57.9657
		riversFreq      2.3257
		riversSin       7.04817
		riversOctaves   0
		canyonsMagn     0.485613
		canyonsFreq     1.45416
		canyonFraction  0
		cracksMagn      0.0573349
		cracksFreq      2.40523
		cracksOctaves   4
		craterMagn      0.504289
		craterFreq      13.7612
		craterDensity   0
		craterOctaves   0.813417
		craterRayedFactor 0
		volcanoMagn     0.589326
		volcanoFreq     0.628687
		volcanoDensity  0.218322
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.408181
		volcanoRadius   0.497808
		volcanoTemp     1397.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.49478
		stripeTwist     0.447833
		cycloneMagn     2.27715
		cycloneFreq     0.759556
		cycloneDensity  0.526895
		cycloneOctaves  4
		colorSea       (0.201, 0.167, 0.145, 0.000)
		colorShelf     (0.248, 0.207, 0.185, 0.000)
		colorBeach     (0.376, 0.313, 0.278, 0.200)
		colorDesert    (0.342, 0.293, 0.245, 0.500)
		colorLowland   (0.262, 0.227, 0.185, 0.800)
		colorUpland    (0.443, 0.400, 0.344, 1.000)
		colorRock      (0.670, 0.620, 0.550, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.262, 0.227, 0.185, 0.800)
		colorUpPlants  (0.443, 0.400, 0.344, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	Clouds
	{
		Height          15.7134
		Velocity        16.9648
		BumpHeight      5.66474
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.13158
		mainOctaves     10
		Coverage        0.180202
		stripeZones     2.49478
		stripeTwist     0.447833
	}

	Clouds
	{
		Height          21.4272
		Velocity        81.7867
		BumpHeight      5.41986
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.13158
		mainOctaves     10
		Coverage        0.180202
		stripeZones     2.49478
		stripeTwist     0.447833
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          115.985
		Density         1.4588
		Pressure        0.649065
		Greenhouse      8.43808
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.0443934
		Saturation      1

		Composition
		{
			C2H4  	75.8901
			N2    	16.6291
			CO2   	5.29544
			C2H6  	1.11602
			H2S   	0.683526
			C2H2  	0.367295
			Ar    	0.0120553
			CO    	0.00568455
			C3H8  	0.00076404
			Xe    	6.17247e-005
			Kr    	1.43594e-005
		}
	}

	Aurora
	{
		Height      55.8147
		NorthLat    76.9417
		NorthLon    -51.1708
		NorthRadius 1262.7
		NorthWidth  507.673
		NorthRings  3
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -81.9345
		SouthLon    148.574
		SouthRadius 1526.33
		SouthWidth  480.828
		SouthRings  2
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
		SemiMajorAxis   0.0310988
		Period          0.0660273
		Eccentricity    0.0461504
		Inclination     -0.211763
		AscendingNode   -26.8447
		ArgOfPericenter -108.839
		MeanAnomaly     -75.041
	}
}

DwarfMoon	"Eadu System 6.D4"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            4.27899e-008
	Radius          52.154
	InertiaMoment   0.399076

	RotationPeriod  649.832
	Obliquity       58.1814
	EqAscendNode    -85.2016
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.527 0.427 0.297)

	Surface
	{
		SurfStyle       0.0607125
		OceanStyle      0.795021
		Randomize      (0.168, -0.347, 0.621)
		colorDistMagn   0.580353
		colorDistFreq   1.26164
		detailScale     1424.15
		colorConversion true
		snowLevel       2
		tropicLatitude  0.981409
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.663916
		terraceProb     0.581771
		erosion         0
		montesMagn      0.526702
		montesFreq      2.86234
		montesSpiky     0.85858
		montesFraction  0.434749
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.37384
		hillsFraction   0.614257
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.272628
		craterFreq      0.27129
		craterDensity   0.885441
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.517079
		volcanoTemp     1254.53
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.211, 0.171, 0.119, 0.000)
		colorShelf     (0.224, 0.182, 0.126, 0.000)
		colorBeach     (0.237, 0.192, 0.134, 0.000)
		colorDesert    (0.250, 0.203, 0.141, 0.000)
		colorLowland   (0.263, 0.214, 0.149, 0.000)
		colorUpland    (0.277, 0.224, 0.156, 0.000)
		colorRock      (0.290, 0.235, 0.164, 0.000)
		colorSnow      (0.303, 0.246, 0.171, 1.000)
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
		SemiMajorAxis   0.636092
		Period          6.10803
		Eccentricity    0.194717
		Inclination     55.7466
		AscendingNode   -81.4166
		ArgOfPericenter 108.532
		MeanAnomaly     30.1913
	}
}

DwarfMoon	"Eadu System 6.D5"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            5.81184e-008
	Radius          55.085
	InertiaMoment   0.399985

	RotationPeriod  590.94
	Obliquity       -9.91533
	EqAscendNode    -162.028
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.721 0.718 0.714)

	Surface
	{
		SurfStyle       0.436017
		OceanStyle      0.04862
		Randomize      (0.376, -0.454, -0.301)
		colorDistMagn   0.090317
		colorDistFreq   0.904426
		detailScale     1504.19
		colorConversion true
		snowLevel       2
		tropicLatitude  0.891862
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.617656
		terraceProb     0.341657
		erosion         0
		montesMagn      0.539739
		montesFreq      3.52432
		montesSpiky     0.912478
		montesFraction  0.592852
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.55471
		hillsFraction   0.922857
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247082
		craterFreq      0.205748
		craterDensity   0.992755
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.478969
		volcanoTemp     1349.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.288, 0.287, 0.286, 0.000)
		colorShelf     (0.306, 0.305, 0.303, 0.000)
		colorBeach     (0.324, 0.323, 0.321, 0.000)
		colorDesert    (0.342, 0.341, 0.339, 0.000)
		colorLowland   (0.361, 0.359, 0.357, 0.000)
		colorUpland    (0.379, 0.377, 0.375, 0.000)
		colorRock      (0.397, 0.395, 0.393, 0.000)
		colorSnow      (0.415, 0.413, 0.411, 1.000)
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
		SemiMajorAxis   0.636582
		Period          6.1151
		Eccentricity    0.473673
		Inclination     53.6513
		AscendingNode   -161.52
		ArgOfPericenter 146.324
		MeanAnomaly     -69.6765
	}
}

DwarfMoon	"Eadu System 6.D6"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            7.90749e-008
	Radius          58.6256
	InertiaMoment   0.398107

	RotationPeriod  538.997
	Obliquity       14.2883
	EqAscendNode    -16.8783
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.708 0.591 0.503)

	Surface
	{
		SurfStyle       0.550388
		OceanStyle      0.244545
		Randomize      (-0.180, -0.545, -0.456)
		colorDistMagn   0.476513
		colorDistFreq   2.0998
		detailScale     1600.87
		colorConversion true
		snowLevel       2
		tropicLatitude  0.610192
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.650963
		terraceProb     0.204388
		erosion         0
		montesMagn      0.376649
		montesFreq      1.97283
		montesSpiky     0.880701
		montesFraction  0.460408
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.81246
		hillsFraction   0.721578
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217279
		craterFreq      0.195505
		craterDensity   0.964095
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.483624
		volcanoTemp     1553.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.276, 0.201, 0.141, 0.000)
		colorShelf     (0.283, 0.207, 0.161, 0.000)
		colorBeach     (0.333, 0.242, 0.191, 0.000)
		colorDesert    (0.361, 0.260, 0.186, 0.000)
		colorLowland   (0.397, 0.278, 0.211, 0.000)
		colorUpland    (0.439, 0.337, 0.256, 0.000)
		colorRock      (0.475, 0.366, 0.276, 0.000)
		colorSnow      (0.517, 0.390, 0.291, 1.000)
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
		SemiMajorAxis   0.637244
		Period          6.12464
		Eccentricity    0.351899
		Inclination     23.8574
		AscendingNode   -19.6471
		ArgOfPericenter -76.2212
		MeanAnomaly     61.0575
	}
}

DwarfMoon	"Eadu System 6.D7"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            1.07873e-007
	Radius          60.8636
	InertiaMoment   0.399213

	RotationPeriod  480.823
	Obliquity       65.1192
	EqAscendNode    98.0435
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.573 0.567 0.565)

	Surface
	{
		SurfStyle       0.975667
		OceanStyle      0.689324
		Randomize      (0.210, -0.179, 0.302)
		colorDistMagn   0.409006
		colorDistFreq   0.840946
		detailScale     1661.98
		colorConversion true
		snowLevel       2
		tropicLatitude  0.901565
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.398904
		terraceProb     0.255837
		erosion         0
		montesMagn      0.619423
		montesFreq      3.845
		montesSpiky     0.85769
		montesFraction  0.892795
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.05344
		hillsFraction   0.593047
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254221
		craterFreq      0.219018
		craterDensity   0.963127
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.542028
		volcanoTemp     1571.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.195, 0.198, 0.226, 0.050)
		colorShelf     (0.229, 0.232, 0.260, 0.040)
		colorBeach     (0.263, 0.266, 0.294, 0.030)
		colorDesert    (0.298, 0.301, 0.333, 0.020)
		colorLowland   (0.332, 0.335, 0.367, 0.030)
		colorUpland    (0.366, 0.369, 0.401, 0.050)
		colorRock      (0.401, 0.403, 0.446, 0.020)
		colorSnow      (0.401, 0.403, 0.446, 1.000)
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
		SemiMajorAxis   0.637457
		Period          6.1277
		Eccentricity    0.0313935
		Inclination     20.6907
		AscendingNode   96.9976
		ArgOfPericenter -119.086
		MeanAnomaly     85.5588
	}
}

DwarfMoon	"Eadu System 6.D8"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            1.47692e-007
	Radius          79.5274
	InertiaMoment   0.395968

	RotationPeriod  533.693
	Obliquity       53.7579
	EqAscendNode    179.958
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.799 0.797 0.796)

	Surface
	{
		SurfStyle       0.961838
		OceanStyle      0.914749
		Randomize      (-0.966, 0.712, -0.286)
		colorDistMagn   0.615084
		colorDistFreq   2.29616
		detailScale     2171.63
		colorConversion true
		snowLevel       2
		tropicLatitude  0.320124
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.455574
		terraceProb     0.261313
		erosion         0
		montesMagn      0.324065
		montesFreq      3.31567
		montesSpiky     0.831092
		montesFraction  0.64033
		dunesFraction   0
		hillsMagn       0
		hillsFreq       13.5063
		hillsFraction   0.413375
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.271168
		craterFreq      0.197942
		craterDensity   1.06059
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.535233
		volcanoTemp     1101.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.272, 0.279, 0.318, 0.050)
		colorShelf     (0.320, 0.327, 0.366, 0.040)
		colorBeach     (0.368, 0.375, 0.414, 0.030)
		colorDesert    (0.416, 0.422, 0.470, 0.020)
		colorLowland   (0.464, 0.470, 0.517, 0.030)
		colorUpland    (0.512, 0.518, 0.565, 0.050)
		colorRock      (0.559, 0.566, 0.629, 0.020)
		colorSnow      (0.559, 0.566, 0.629, 1.000)
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
		SemiMajorAxis   0.638075
		Period          6.13662
		Eccentricity    0.490679
		Inclination     35.3312
		AscendingNode   175.635
		ArgOfPericenter 3.28679
		MeanAnomaly     93.2841
	}
}

DwarfMoon	"Eadu System 6.D9"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            2.03155e-007
	Radius          84.0891
	InertiaMoment   0.398294

	RotationPeriod  483.492
	Obliquity       1.14873
	EqAscendNode    17.1519
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.545 0.387 0.317)

	Surface
	{
		SurfStyle       0.392738
		OceanStyle      0.323015
		Randomize      (0.979, -0.306, -0.840)
		colorDistMagn   0.309983
		colorDistFreq   3.59807
		detailScale     2296.19
		colorConversion true
		snowLevel       2
		tropicLatitude  0.170446
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.474201
		terraceProb     0.278214
		erosion         0
		montesMagn      0.434851
		montesFreq      2.43431
		montesSpiky     0.9287
		montesFraction  0.258228
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.79254
		hillsFraction   0.653794
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245854
		craterFreq      0.202843
		craterDensity   0.988832
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.509322
		volcanoTemp     1642.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.218, 0.155, 0.127, 0.000)
		colorShelf     (0.232, 0.164, 0.135, 0.000)
		colorBeach     (0.245, 0.174, 0.143, 0.000)
		colorDesert    (0.259, 0.184, 0.151, 0.000)
		colorLowland   (0.273, 0.193, 0.159, 0.000)
		colorUpland    (0.286, 0.203, 0.167, 0.000)
		colorRock      (0.300, 0.213, 0.174, 0.000)
		colorSnow      (0.313, 0.222, 0.182, 1.000)
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
		SemiMajorAxis   0.638699
		Period          6.14562
		Eccentricity    0.333427
		Inclination     8.72378
		AscendingNode   19.552
		ArgOfPericenter 39.2577
		MeanAnomaly     -158.69
	}
}

DwarfMoon	"Eadu System 6.D10"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            2.81075e-007
	Radius          90.0082
	InertiaMoment   0.399346

	RotationPeriod  441.273
	Obliquity       57.2841
	EqAscendNode    -156.879
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.411 0.404 0.402)

	Surface
	{
		SurfStyle       0.259299
		OceanStyle      0.8103
		Randomize      (-0.640, -0.788, -0.938)
		colorDistMagn   0.824073
		colorDistFreq   3.20788
		detailScale     2457.82
		colorConversion true
		snowLevel       2
		tropicLatitude  0.32662
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.637276
		terraceProb     0.20845
		erosion         0
		montesMagn      0.516574
		montesFreq      2.95396
		montesSpiky     0.995323
		montesFraction  0.541739
		dunesFraction   0
		hillsMagn       0
		hillsFreq       15.0085
		hillsFraction   0.816924
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235281
		craterFreq      0.274493
		craterDensity   0.890505
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.426908
		volcanoTemp     1462.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.164, 0.162, 0.161, 0.000)
		colorShelf     (0.175, 0.172, 0.171, 0.000)
		colorBeach     (0.185, 0.182, 0.181, 0.000)
		colorDesert    (0.195, 0.192, 0.191, 0.000)
		colorLowland   (0.205, 0.202, 0.201, 0.000)
		colorUpland    (0.216, 0.212, 0.211, 0.000)
		colorRock      (0.226, 0.222, 0.221, 0.000)
		colorSnow      (0.236, 0.233, 0.231, 1.000)
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
		SemiMajorAxis   0.639181
		Period          6.15258
		Eccentricity    0.293346
		Inclination     50.8612
		AscendingNode   -157.755
		ArgOfPericenter -170.241
		MeanAnomaly     -1.83938
	}
}

DwarfMoon	"Eadu System 6.D11"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            3.91656e-007
	Radius          95.1295
	InertiaMoment   0.396647

	RotationPeriod  394.459
	Obliquity       -7.58306
	EqAscendNode    78.2099
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.808 0.764 0.738)

	Surface
	{
		SurfStyle       0.999401
		OceanStyle      0.625739
		Randomize      (-0.554, 0.285, 0.245)
		colorDistMagn   0.806041
		colorDistFreq   4.64569
		detailScale     2597.67
		colorConversion true
		snowLevel       2
		tropicLatitude  0.513359
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.497727
		terraceProb     0.206882
		erosion         0
		montesMagn      0.643648
		montesFreq      2.61417
		montesSpiky     0.98554
		montesFraction  0.567135
		dunesFraction   0
		hillsMagn       0
		hillsFreq       14.5701
		hillsFraction   0.451082
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251795
		craterFreq      0.3386
		craterDensity   0.919874
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.5368
		volcanoTemp     1579.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.275, 0.267, 0.295, 0.050)
		colorShelf     (0.323, 0.313, 0.340, 0.040)
		colorBeach     (0.372, 0.359, 0.384, 0.030)
		colorDesert    (0.420, 0.405, 0.436, 0.020)
		colorLowland   (0.469, 0.451, 0.480, 0.030)
		colorUpland    (0.517, 0.497, 0.524, 0.050)
		colorRock      (0.566, 0.542, 0.583, 0.020)
		colorSnow      (0.566, 0.542, 0.583, 1.000)
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
		SemiMajorAxis   0.639787
		Period          6.16133
		Eccentricity    0.395314
		Inclination     -28.0039
		AscendingNode   74.0561
		ArgOfPericenter 110.561
		MeanAnomaly     -9.86377
	}
}

DwarfMoon	"Eadu System 6.D12"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            5.50445e-007
	Radius          124.561
	InertiaMoment   0.398468

	RotationPeriod  435.999
	Obliquity       -56.9265
	EqAscendNode    23.7492
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.696 0.693 0.688)

	Surface
	{
		SurfStyle       0.621399
		OceanStyle      0.691097
		Randomize      (0.295, 0.976, 0.633)
		colorDistMagn   0.541539
		colorDistFreq   12.5432
		detailScale     3401.35
		colorConversion true
		snowLevel       2
		tropicLatitude  0.96321
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.424737
		terraceProb     0.126046
		erosion         0
		montesMagn      0.606771
		montesFreq      2.49918
		montesSpiky     0.826699
		montesFraction  0.905244
		dunesFraction   0
		hillsMagn       0
		hillsFreq       41.9905
		hillsFraction   0.591392
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233147
		craterFreq      0.548973
		craterDensity   0.886924
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.542335
		volcanoTemp     1217.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.271, 0.236, 0.193, 0.000)
		colorShelf     (0.278, 0.243, 0.220, 0.000)
		colorBeach     (0.327, 0.284, 0.262, 0.000)
		colorDesert    (0.355, 0.305, 0.255, 0.000)
		colorLowland   (0.390, 0.326, 0.289, 0.000)
		colorUpland    (0.431, 0.395, 0.351, 0.000)
		colorRock      (0.466, 0.430, 0.379, 0.000)
		colorSnow      (0.508, 0.458, 0.399, 1.000)
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
		SemiMajorAxis   0.640049
		Period          6.16512
		Eccentricity    0.272757
		Inclination     -51.3455
		AscendingNode   21.3185
		ArgOfPericenter -172.967
		MeanAnomaly     10.1409
	}
}

DwarfMoon	"Eadu System 6.D13"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            7.8162e-007
	Radius          132.558
	InertiaMoment   0.399477

	RotationPeriod  390.539
	Obliquity       -55.1324
	EqAscendNode    68.7011
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.720 0.719 0.716)

	Surface
	{
		SurfStyle       0.733703
		OceanStyle      0.80437
		Randomize      (-0.097, 0.630, 0.711)
		colorDistMagn   0.225368
		colorDistFreq   5.76814
		detailScale     3619.71
		colorConversion true
		snowLevel       2
		tropicLatitude  0.93663
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.296271
		terraceProb     0.105697
		erosion         0
		montesMagn      0.485532
		montesFreq      3.30337
		montesSpiky     0.974773
		montesFraction  0.661579
		dunesFraction   0
		hillsMagn       0
		hillsFreq       33.9699
		hillsFraction   0.59103
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247341
		craterFreq      0.547115
		craterDensity   0.671812
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.510425
		volcanoTemp     1356.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.281, 0.244, 0.201, 0.000)
		colorShelf     (0.288, 0.252, 0.229, 0.000)
		colorBeach     (0.339, 0.295, 0.272, 0.000)
		colorDesert    (0.367, 0.316, 0.265, 0.000)
		colorLowland   (0.403, 0.338, 0.301, 0.000)
		colorUpland    (0.447, 0.410, 0.365, 0.000)
		colorRock      (0.483, 0.446, 0.394, 0.000)
		colorSnow      (0.526, 0.475, 0.416, 1.000)
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
		SemiMajorAxis   0.640536
		Period          6.17215
		Eccentricity    0.141288
		Inclination     -23.5496
		AscendingNode   57.9934
		ArgOfPericenter 41.4139
		MeanAnomaly     -10.9891
	}
}

DwarfMoon	"Eadu System 6.D14"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            1.12366e-006
	Radius          143.684
	InertiaMoment   0.397074

	RotationPeriod  352.504
	Obliquity       72.402
	EqAscendNode    153.797
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.836 0.787 0.722)

	Surface
	{
		SurfStyle       0.384803
		OceanStyle      0.385541
		Randomize      (0.771, -0.967, -0.815)
		colorDistMagn   0.81872
		colorDistFreq   7.80371
		detailScale     3923.52
		colorConversion true
		snowLevel       2
		tropicLatitude  0.564491
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.577785
		terraceProb     0.310401
		erosion         0
		montesMagn      0.374989
		montesFreq      3.56827
		montesSpiky     0.974328
		montesFraction  0.477624
		dunesFraction   0
		hillsMagn       0
		hillsFreq       53.3169
		hillsFraction   0.793229
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229018
		craterFreq      0.734309
		craterDensity   0.878878
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48872
		volcanoTemp     1429.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.334, 0.315, 0.289, 0.000)
		colorShelf     (0.355, 0.334, 0.307, 0.000)
		colorBeach     (0.376, 0.354, 0.325, 0.000)
		colorDesert    (0.397, 0.374, 0.343, 0.000)
		colorLowland   (0.418, 0.393, 0.361, 0.000)
		colorUpland    (0.439, 0.413, 0.379, 0.000)
		colorRock      (0.460, 0.433, 0.397, 0.000)
		colorSnow      (0.481, 0.452, 0.415, 1.000)
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
		SemiMajorAxis   0.641032
		Period          6.17932
		Eccentricity    0.428583
		Inclination     49.9871
		AscendingNode   149.812
		ArgOfPericenter 32.5759
		MeanAnomaly     -150.657
	}
}

DwarfMoon	"Eadu System 6.D15"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            1.63944e-006
	Radius          155.096
	InertiaMoment   0.39863

	RotationPeriod  316.064
	Obliquity       -57.2607
	EqAscendNode    123.179
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.786 0.742 0.707)

	Surface
	{
		SurfStyle       0.622311
		OceanStyle      0.802665
		Randomize      (0.941, -0.255, 0.420)
		colorDistMagn   0.36791
		colorDistFreq   14.7913
		detailScale     4235.16
		colorConversion true
		snowLevel       2
		tropicLatitude  0.802628
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.476795
		terraceProb     0.152291
		erosion         0
		montesMagn      0.373175
		montesFreq      2.49665
		montesSpiky     0.939801
		montesFraction  0.389793
		dunesFraction   0
		hillsMagn       0
		hillsFreq       64.0134
		hillsFraction   0.530701
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254086
		craterFreq      0.790397
		craterDensity   0.919851
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.513089
		volcanoTemp     1476.24
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.307, 0.252, 0.198, 0.000)
		colorShelf     (0.314, 0.260, 0.226, 0.000)
		colorBeach     (0.370, 0.304, 0.269, 0.000)
		colorDesert    (0.401, 0.327, 0.262, 0.000)
		colorLowland   (0.440, 0.349, 0.297, 0.000)
		colorUpland    (0.487, 0.423, 0.360, 0.000)
		colorRock      (0.527, 0.460, 0.389, 0.000)
		colorSnow      (0.574, 0.490, 0.410, 1.000)
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
		SemiMajorAxis   0.641699
		Period          6.18897
		Eccentricity    0.0605215
		Inclination     -13.6739
		AscendingNode   110.918
		ArgOfPericenter -11.7104
		MeanAnomaly     -38.1787
	}
}

DwarfMoon	"Eadu System 6.D16"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            2.43501e-006
	Radius          206.93
	InertiaMoment   0.399605

	RotationPeriod  346.054
	Obliquity       65.9254
	EqAscendNode    153.541
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.782 0.780 0.779)

	Surface
	{
		SurfStyle       0.468826
		OceanStyle      0.504874
		Randomize      (-0.663, -0.823, -0.018)
		colorDistMagn   0.858638
		colorDistFreq   2.87276
		detailScale     5650.56
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999419
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.354806
		terraceProb     0.474631
		erosion         0
		montesMagn      0.451274
		montesFreq      3.33984
		montesSpiky     0.882764
		montesFraction  0.725481
		dunesFraction   0
		hillsMagn       0
		hillsFreq       116.695
		hillsFraction   0.573975
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217115
		craterFreq      1.38781
		craterDensity   0.774541
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.559921
		volcanoTemp     1421.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.313, 0.312, 0.312, 0.000)
		colorShelf     (0.332, 0.332, 0.331, 0.000)
		colorBeach     (0.352, 0.351, 0.351, 0.000)
		colorDesert    (0.371, 0.371, 0.370, 0.000)
		colorLowland   (0.391, 0.390, 0.389, 0.000)
		colorUpland    (0.410, 0.410, 0.409, 0.000)
		colorRock      (0.430, 0.429, 0.428, 0.000)
		colorSnow      (0.449, 0.449, 0.448, 1.000)
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
		SemiMajorAxis   0.642104
		Period          6.19483
		Eccentricity    0.403563
		Inclination     -24.4851
		AscendingNode   153.003
		ArgOfPericenter -150.01
		MeanAnomaly     4.04793
	}
}

Moon	"Eadu System 6.7"
{
	ParentBody     "Eadu System 6"
	Class	       "IceWorld"

	Mass            3.69588e-006
	Radius          223.883
	InertiaMoment   0.397398

	RotationPeriod  303.544
	Obliquity       102.261
	EqAscendNode    -69.2312
	//Precession      0

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.412 0.408 0.402)

	Surface
	{
		SurfStyle       0.478799
		OceanStyle      0.249144
		Randomize      (0.640, 0.966, -0.775)
		colorDistMagn   0.067827
		colorDistFreq   29.3899
		detailScale     575.839
		colorConversion true
		drivenDarkening 0.0108732
		seaLevel        0.243805
		snowLevel       2
		tropicLatitude  0.946315
		icecapLatitude  1
		icecapHeight    0.243805
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.68644
		venusFreq       1.08403
		venusMagn       0
		mareFreq        0
		mareDensity     1.57383e-006
		terraceProb     0.389264
		erosion         0
		montesMagn      0.0734283
		montesFreq      10.7305
		montesSpiky     0.965693
		montesFraction  0.319611
		dunesMagn       0.049291
		dunesFreq       292.188
		dunesFraction   0.943902
		hillsMagn       0.102084
		hillsFreq       25.4853
		hillsFraction   0.915452
		hills2Fraction  0.131759
		riversMagn      61.1087
		riversFreq      3.18738
		riversSin       6.30339
		riversOctaves   0
		canyonsMagn     0.39956
		canyonsFreq     0.104994
		canyonFraction  0
		cracksMagn      0.0372833
		cracksFreq      0.0398864
		cracksOctaves   0
		craterMagn      0.926394
		craterFreq      0.532653
		craterDensity   0.948047
		craterOctaves   8
		craterRayedFactor 0.127488
		volcanoMagn     0.188326
		volcanoFreq     0.586059
		volcanoDensity  0.15799
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.322865
		volcanoRadius   0.152029
		volcanoTemp     1449.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.124, 0.102, 0.089, 0.000)
		colorShelf     (0.152, 0.127, 0.113, 0.000)
		colorBeach     (0.231, 0.192, 0.169, 0.200)
		colorDesert    (0.210, 0.180, 0.149, 0.500)
		colorLowland   (0.161, 0.139, 0.113, 0.800)
		colorUpland    (0.272, 0.245, 0.209, 1.000)
		colorRock      (0.670, 0.620, 0.550, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.161, 0.139, 0.113, 0.800)
		colorUpPlants  (0.272, 0.245, 0.209, 1.000)
		BumpHeight      11.1941
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
		SemiMajorAxis   0.642353
		Period          6.19843
		Eccentricity    0.363381
		Inclination     77.8517
		AscendingNode   -73.0469
		ArgOfPericenter 70.0435
		MeanAnomaly     -178.131
	}
}

Moon	"Eadu System 6.8"
{
	ParentBody     "Eadu System 6"
	Class	       "IceWorld"

	Mass            5.76119e-006
	Radius          249.175
	InertiaMoment   0.398784

	RotationPeriod  271.386
	Obliquity       -26.4575
	EqAscendNode    14.0792
	//Precession      0

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.776 0.770 0.767)

	Surface
	{
		SurfStyle       0.164847
		OceanStyle      0.477918
		Randomize      (0.764, 0.463, -0.842)
		colorDistMagn   0.0407341
		colorDistFreq   25.7423
		detailScale     640.892
		colorConversion true
		drivenDarkening 0.0108688
		seaLevel        0.251038
		snowLevel       2
		tropicLatitude  0.774058
		icecapLatitude  1
		icecapHeight    0.251038
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.97479
		venusFreq       1.22018
		venusMagn       0.241558
		mareFreq        0
		mareDensity     2.2452e-006
		terraceProb     0.538236
		erosion         0
		montesMagn      0.0569051
		montesFreq      13.2585
		montesSpiky     0.937005
		montesFraction  0.479456
		dunesMagn       0.0487792
		dunesFreq       324.414
		dunesFraction   0.0884681
		hillsMagn       0.114083
		hillsFreq       24.0541
		hillsFraction   0.567573
		hills2Fraction  0.0769979
		riversMagn      63.295
		riversFreq      2.98242
		riversSin       6.5579
		riversOctaves   0
		canyonsMagn     0.561847
		canyonsFreq     0.0867535
		canyonFraction  0
		cracksMagn      0.0643526
		cracksFreq      0.112516
		cracksOctaves   0
		craterMagn      0.998194
		craterFreq      0.663955
		craterDensity   0.855248
		craterOctaves   8
		craterRayedFactor 0.156327
		volcanoMagn     0.164354
		volcanoFreq     0.802921
		volcanoDensity  0.214056
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.309761
		volcanoRadius   0.127126
		volcanoTemp     1568.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.776, 0.770, 0.767, 0.500)
		colorShelf     (0.737, 0.731, 0.728, 0.500)
		colorBeach     (0.543, 0.539, 0.537, 0.750)
		colorDesert    (0.659, 0.654, 0.652, 1.000)
		colorLowland   (0.683, 0.677, 0.675, 1.000)
		colorUpland    (0.722, 0.716, 0.713, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.683, 0.677, 0.675, 1.000)
		colorUpPlants  (0.722, 0.716, 0.713, 1.000)
		BumpHeight      12.4588
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
		SemiMajorAxis   0.642616
		Period          6.20225
		Eccentricity    0.13975
		Inclination     -24.8645
		AscendingNode   16.9865
		ArgOfPericenter -38.4895
		MeanAnomaly     133.202
	}
}

DwarfMoon	"Eadu System 6.D17"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            1.83572e-011
	Radius          3.50217
	InertiaMoment   0.399732

	RotationPeriod  2001.95
	Obliquity       40.9046
	EqAscendNode    132.664
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.516 0.402 0.346)

	Surface
	{
		SurfStyle       0.0666481
		OceanStyle      0.702762
		Randomize      (-0.863, 0.488, 0.058)
		colorDistMagn   0.127237
		colorDistFreq   0.005427
		detailScale     95.6326
		colorConversion true
		snowLevel       2
		tropicLatitude  0.521055
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.59928
		terraceProb     0.326158
		erosion         0
		montesMagn      0.52251
		montesFreq      2.9395
		montesSpiky     0.919048
		montesFraction  0.592303
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0279103
		hillsFraction   0.472406
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236611
		craterFreq      0.267838
		craterDensity   0.848591
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.521729
		volcanoTemp     1606.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.206, 0.161, 0.139, 0.000)
		colorShelf     (0.219, 0.171, 0.147, 0.000)
		colorBeach     (0.232, 0.181, 0.156, 0.000)
		colorDesert    (0.245, 0.191, 0.165, 0.000)
		colorLowland   (0.258, 0.201, 0.173, 0.000)
		colorUpland    (0.271, 0.211, 0.182, 0.000)
		colorRock      (0.284, 0.221, 0.191, 0.000)
		colorSnow      (0.297, 0.231, 0.199, 1.000)
		BumpHeight      3.15195
		BumpOffset      0.630391
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.642952
		Period          6.20711
		Eccentricity    0.137673
		Inclination     28.4999
		AscendingNode   127.294
		ArgOfPericenter 120.414
		MeanAnomaly     -165.631
	}
}

DwarfMoon	"Eadu System 6.D18"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            3.53794e-011
	Radius          5.12411
	InertiaMoment   0.397666

	RotationPeriod  2096.74
	Obliquity       -26.0791
	EqAscendNode    79.8274
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.496 0.493 0.488)

	Surface
	{
		SurfStyle       0.590396
		OceanStyle      0.492699
		Randomize      (0.747, 0.674, 0.019)
		colorDistMagn   0.918194
		colorDistFreq   0.0165195
		detailScale     139.923
		colorConversion true
		snowLevel       2
		tropicLatitude  0.561135
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.479212
		terraceProb     0.165671
		erosion         0
		montesMagn      0.520678
		montesFreq      3.22428
		montesSpiky     0.960832
		montesFraction  0.796032
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.032802
		hillsFraction   0.475573
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254006
		craterFreq      0.231731
		craterDensity   1.05999
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.5566
		volcanoTemp     1507.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.193, 0.168, 0.137, 0.000)
		colorShelf     (0.198, 0.173, 0.156, 0.000)
		colorBeach     (0.233, 0.202, 0.185, 0.000)
		colorDesert    (0.253, 0.217, 0.181, 0.000)
		colorLowland   (0.278, 0.232, 0.205, 0.000)
		colorUpland    (0.308, 0.281, 0.249, 0.000)
		colorRock      (0.332, 0.306, 0.268, 0.000)
		colorSnow      (0.362, 0.325, 0.283, 1.000)
		BumpHeight      4.6117
		BumpOffset      0.922341
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.643445
		Period          6.21424
		Eccentricity    0.034767
		Inclination     27.5162
		AscendingNode   81.1807
		ArgOfPericenter -79.4963
		MeanAnomaly     -11.0837
	}
}

DwarfMoon	"Eadu System 6.D19"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            6.30632e-011
	Radius          5.80154
	InertiaMoment   0.398931

	RotationPeriod  1801.9
	Obliquity       -28.3473
	EqAscendNode    34.6292
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.416 0.415 0.412)

	Surface
	{
		SurfStyle       0.415182
		OceanStyle      0.557819
		Randomize      (-0.374, -0.341, 0.861)
		colorDistMagn   0.880639
		colorDistFreq   0.0163451
		detailScale     158.421
		colorConversion true
		snowLevel       2
		tropicLatitude  0.338065
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.30083
		terraceProb     0.59303
		erosion         0
		montesMagn      0.473057
		montesFreq      2.86252
		montesSpiky     0.96076
		montesFraction  0.497954
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.100166
		hillsFraction   0.735222
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228653
		craterFreq      0.192303
		craterDensity   1.00356
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.494133
		volcanoTemp     1757.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.167, 0.166, 0.165, 0.000)
		colorShelf     (0.177, 0.176, 0.175, 0.000)
		colorBeach     (0.187, 0.187, 0.185, 0.000)
		colorDesert    (0.198, 0.197, 0.196, 0.000)
		colorLowland   (0.208, 0.207, 0.206, 0.000)
		colorUpland    (0.219, 0.218, 0.216, 0.000)
		colorRock      (0.229, 0.228, 0.227, 0.000)
		colorSnow      (0.239, 0.238, 0.237, 1.000)
		BumpHeight      5.22139
		BumpOffset      1.04428
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.643767
		Period          6.21891
		Eccentricity    0.00489537
		Inclination     11.2505
		AscendingNode   32.7056
		ArgOfPericenter 160.522
		MeanAnomaly     98.9509
	}
}

DwarfMoon	"Eadu System 6.D20"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            1.06212e-010
	Radius          6.61964
	InertiaMoment   0.399857

	RotationPeriod  1598.81
	Obliquity       -4.25815
	EqAscendNode    -108.977
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.841 0.755 0.707)

	Surface
	{
		SurfStyle       0.21172
		OceanStyle      0.925252
		Randomize      (-0.975, 0.460, -0.749)
		colorDistMagn   0.817409
		colorDistFreq   0.0190975
		detailScale     180.76
		colorConversion true
		snowLevel       2
		tropicLatitude  0.841941
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.684653
		terraceProb     0.231818
		erosion         0
		montesMagn      0.52334
		montesFreq      3.17953
		montesSpiky     0.808426
		montesFraction  0.777847
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.140487
		hillsFraction   0.760012
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225453
		craterFreq      0.190985
		craterDensity   0.968269
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.530539
		volcanoTemp     1338.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.337, 0.302, 0.283, 0.000)
		colorShelf     (0.358, 0.321, 0.300, 0.000)
		colorBeach     (0.379, 0.340, 0.318, 0.000)
		colorDesert    (0.400, 0.359, 0.336, 0.000)
		colorLowland   (0.421, 0.378, 0.353, 0.000)
		colorUpland    (0.442, 0.397, 0.371, 0.000)
		colorRock      (0.463, 0.415, 0.389, 0.000)
		colorSnow      (0.484, 0.434, 0.406, 1.000)
		BumpHeight      5.95768
		BumpOffset      1.19154
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.644053
		Period          6.22306
		Eccentricity    0.0980508
		Inclination     -58.656
		AscendingNode   -109.177
		ArgOfPericenter 63.9702
		MeanAnomaly     -21.0365
	}
}

DwarfMoon	"Eadu System 6.D21"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            1.71359e-010
	Radius          7.43331
	InertiaMoment   0.397897

	RotationPeriod  1419.84
	Obliquity       -2.041
	EqAscendNode    124.5
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.820 0.771 0.675)

	Surface
	{
		SurfStyle       0.682642
		OceanStyle      0.183615
		Randomize      (-0.289, -0.181, 0.562)
		colorDistMagn   0.324174
		colorDistFreq   0.0262682
		detailScale     202.979
		colorConversion true
		snowLevel       2
		tropicLatitude  0.493844
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.415073
		terraceProb     0.351858
		erosion         0
		montesMagn      0.566488
		montesFreq      3.68281
		montesSpiky     0.96703
		montesFraction  0.306971
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.11091
		hillsFraction   0.529596
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214467
		craterFreq      0.154762
		craterDensity   0.847421
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.484218
		volcanoTemp     1721.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.262, 0.189, 0.000)
		colorShelf     (0.328, 0.270, 0.216, 0.000)
		colorBeach     (0.385, 0.316, 0.257, 0.000)
		colorDesert    (0.418, 0.339, 0.250, 0.000)
		colorLowland   (0.459, 0.362, 0.284, 0.000)
		colorUpland    (0.508, 0.439, 0.344, 0.000)
		colorRock      (0.549, 0.478, 0.371, 0.000)
		colorSnow      (0.598, 0.509, 0.392, 1.000)
		BumpHeight      6.68998
		BumpOffset      1.338
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.644315
		Period          6.22685
		Eccentricity    0.276488
		Inclination     -30.4376
		AscendingNode   116.022
		ArgOfPericenter 151.372
		MeanAnomaly     32.1586
	}
}

DwarfMoon	"Eadu System 6.D22"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            2.67339e-010
	Radius          10.255
	InertiaMoment   0.399073

	RotationPeriod  1562.04
	Obliquity       38.9693
	EqAscendNode    -63.775
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.722 0.687 0.652)

	Surface
	{
		SurfStyle       0.740343
		OceanStyle      0.152652
		Randomize      (0.692, -0.515, 0.454)
		colorDistMagn   0.408944
		colorDistFreq   0.0272393
		detailScale     280.031
		colorConversion true
		snowLevel       2
		tropicLatitude  0.614884
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.316687
		terraceProb     0.168196
		erosion         0
		montesMagn      0.581332
		montesFreq      2.41484
		montesSpiky     0.917912
		montesFraction  0.341415
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.23326
		hillsFraction   0.576534
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250947
		craterFreq      0.191256
		craterDensity   0.928464
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.474518
		volcanoTemp     1805.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.281, 0.234, 0.183, 0.000)
		colorShelf     (0.289, 0.241, 0.209, 0.000)
		colorBeach     (0.339, 0.282, 0.248, 0.000)
		colorDesert    (0.368, 0.302, 0.241, 0.000)
		colorLowland   (0.404, 0.323, 0.274, 0.000)
		colorUpland    (0.447, 0.392, 0.333, 0.000)
		colorRock      (0.483, 0.426, 0.359, 0.000)
		colorSnow      (0.527, 0.454, 0.378, 1.000)
		BumpHeight      9.22953
		BumpOffset      1.84591
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.64476
		Period          6.23331
		Eccentricity    0.107105
		Inclination     -3.42493
		AscendingNode   -70.5294
		ArgOfPericenter -174.957
		MeanAnomaly     -70.7178
	}
}

DwarfMoon	"Eadu System 6.D23"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            4.06042e-010
	Radius          10.8679
	InertiaMoment   0.399982

	RotationPeriod  1355.59
	Obliquity       5.89225
	EqAscendNode    129.682
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.654 0.583 0.485)

	Surface
	{
		SurfStyle       0.429301
		OceanStyle      0.757153
		Randomize      (0.959, 0.704, -0.644)
		colorDistMagn   0.861085
		colorDistFreq   0.0660951
		detailScale     296.765
		colorConversion true
		snowLevel       2
		tropicLatitude  0.433208
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.690325
		terraceProb     0.403563
		erosion         0
		montesMagn      0.528434
		montesFreq      2.48664
		montesSpiky     0.901431
		montesFraction  0.444867
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.225873
		hillsFraction   0.768797
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22398
		craterFreq      0.160859
		craterDensity   0.815949
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.532585
		volcanoTemp     1465.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.262, 0.233, 0.194, 0.000)
		colorShelf     (0.278, 0.248, 0.206, 0.000)
		colorBeach     (0.294, 0.262, 0.218, 0.000)
		colorDesert    (0.311, 0.277, 0.231, 0.000)
		colorLowland   (0.327, 0.291, 0.243, 0.000)
		colorUpland    (0.344, 0.306, 0.255, 0.000)
		colorRock      (0.360, 0.321, 0.267, 0.000)
		colorSnow      (0.376, 0.335, 0.279, 1.000)
		BumpHeight      9.78108
		BumpOffset      1.95622
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.645186
		Period          6.23948
		Eccentricity    0.110081
		Inclination     29.4986
		AscendingNode   134.65
		ArgOfPericenter 106.351
		MeanAnomaly     9.94966
	}
}

DwarfMoon	"Eadu System 6.D24"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            6.03413e-010
	Radius          11.8782
	InertiaMoment   0.398103

	RotationPeriod  1218.98
	Obliquity       -43.9232
	EqAscendNode    104.811
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.519 0.514 0.512)

	Surface
	{
		SurfStyle       0.355225
		OceanStyle      0.561422
		Randomize      (0.747, 0.562, -0.264)
		colorDistMagn   0.579977
		colorDistFreq   0.107241
		detailScale     324.355
		colorConversion true
		snowLevel       2
		tropicLatitude  0.67453
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.666139
		terraceProb     0.293849
		erosion         0
		montesMagn      0.532164
		montesFreq      2.91725
		montesSpiky     0.86301
		montesFraction  0.428108
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.277489
		hillsFraction   0.573627
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245401
		craterFreq      0.249116
		craterDensity   0.943617
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48103
		volcanoTemp     1585.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.208, 0.206, 0.205, 0.000)
		colorShelf     (0.221, 0.219, 0.218, 0.000)
		colorBeach     (0.234, 0.232, 0.230, 0.000)
		colorDesert    (0.246, 0.244, 0.243, 0.000)
		colorLowland   (0.259, 0.257, 0.256, 0.000)
		colorUpland    (0.272, 0.270, 0.269, 0.000)
		colorRock      (0.285, 0.283, 0.282, 0.000)
		colorSnow      (0.298, 0.296, 0.294, 1.000)
		BumpHeight      10.6904
		BumpOffset      2.13808
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.645791
		Period          6.24826
		Eccentricity    0.263751
		Inclination     -34.3146
		AscendingNode   111.502
		ArgOfPericenter 5.48755
		MeanAnomaly     6.47445
	}
}

DwarfMoon	"Eadu System 6.D25"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            8.80793e-010
	Radius          12.921
	InertiaMoment   0.39921

	RotationPeriod  1103.92
	Obliquity       4.12606
	EqAscendNode    144.65
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.454 0.451 0.445)

	Surface
	{
		SurfStyle       0.365503
		OceanStyle      0.373087
		Randomize      (-0.860, -0.909, -0.645)
		colorDistMagn   0.972276
		colorDistFreq   0.0440045
		detailScale     352.83
		colorConversion true
		snowLevel       2
		tropicLatitude  0.689858
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.279573
		terraceProb     0.316437
		erosion         0
		montesMagn      0.642225
		montesFreq      2.68916
		montesSpiky     0.824559
		montesFraction  0.329821
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.407577
		hillsFraction   0.5972
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253141
		craterFreq      0.237619
		craterDensity   0.656156
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.509634
		volcanoTemp     1525.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.182, 0.180, 0.178, 0.000)
		colorShelf     (0.193, 0.192, 0.189, 0.000)
		colorBeach     (0.204, 0.203, 0.200, 0.000)
		colorDesert    (0.216, 0.214, 0.212, 0.000)
		colorLowland   (0.227, 0.225, 0.223, 0.000)
		colorUpland    (0.239, 0.237, 0.234, 0.000)
		colorRock      (0.250, 0.248, 0.245, 0.000)
		colorSnow      (0.261, 0.259, 0.256, 1.000)
		BumpHeight      11.6289
		BumpOffset      2.32579
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.64619
		Period          6.25406
		Eccentricity    0.165747
		Inclination     -40.2625
		AscendingNode   143.065
		ArgOfPericenter -156.272
		MeanAnomaly     130.196
	}
}

DwarfMoon	"Eadu System 6.D26"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            1.2667e-009
	Radius          17.7745
	InertiaMoment   0.395947

	RotationPeriod  1254.01
	Obliquity       -86.6919
	EqAscendNode    79.478
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.750 0.632 0.587)

	Surface
	{
		SurfStyle       0.908479
		OceanStyle      0.805067
		Randomize      (0.249, -0.683, -0.986)
		colorDistMagn   0.337778
		colorDistFreq   0.266832
		detailScale     485.362
		colorConversion true
		snowLevel       2
		tropicLatitude  0.97642
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.430593
		terraceProb     0.353889
		erosion         0
		montesMagn      0.582088
		montesFreq      2.67093
		montesSpiky     0.984104
		montesFraction  0.398776
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.832725
		hillsFraction   0.669055
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238872
		craterFreq      0.187105
		craterDensity   0.859381
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.538328
		volcanoTemp     1824.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.255, 0.221, 0.235, 0.050)
		colorShelf     (0.300, 0.259, 0.270, 0.040)
		colorBeach     (0.345, 0.297, 0.305, 0.030)
		colorDesert    (0.390, 0.335, 0.346, 0.020)
		colorLowland   (0.435, 0.373, 0.382, 0.030)
		colorUpland    (0.480, 0.411, 0.417, 0.050)
		colorRock      (0.525, 0.449, 0.464, 0.020)
		colorSnow      (0.525, 0.449, 0.464, 1.000)
		BumpHeight      15.997
		BumpOffset      3.19941
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.64685
		Period          6.26365
		Eccentricity    0.350375
		Inclination     -65.0795
		AscendingNode   74.6155
		ArgOfPericenter 8.20264
		MeanAnomaly     -159.693
	}
}

DwarfMoon	"Eadu System 6.D27"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            1.79926e-009
	Radius          17.9833
	InertiaMoment   0.39829

	RotationPeriod  1075.04
	Obliquity       24.4325
	EqAscendNode    68.4511
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.569 0.498 0.410)

	Surface
	{
		SurfStyle       0.590138
		OceanStyle      0.0998389
		Randomize      (-0.523, 0.435, 0.882)
		colorDistMagn   0.748367
		colorDistFreq   0.0613543
		detailScale     491.063
		colorConversion true
		snowLevel       2
		tropicLatitude  0.733177
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.560939
		terraceProb     0.243141
		erosion         0
		montesMagn      0.493563
		montesFreq      2.64302
		montesSpiky     0.964728
		montesFraction  0.761228
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.60334
		hillsFraction   0.778175
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.277745
		craterFreq      0.203989
		craterDensity   0.749505
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.559
		volcanoTemp     1107.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.222, 0.169, 0.115, 0.000)
		colorShelf     (0.228, 0.174, 0.131, 0.000)
		colorBeach     (0.267, 0.204, 0.156, 0.000)
		colorDesert    (0.290, 0.219, 0.152, 0.000)
		colorLowland   (0.319, 0.234, 0.172, 0.000)
		colorUpland    (0.353, 0.284, 0.209, 0.000)
		colorRock      (0.381, 0.309, 0.225, 0.000)
		colorSnow      (0.415, 0.329, 0.238, 1.000)
		BumpHeight      16.1849
		BumpOffset      3.23699
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.647367
		Period          6.27115
		Eccentricity    0.262251
		Inclination     32.0471
		AscendingNode   65.3116
		ArgOfPericenter 179.156
		MeanAnomaly     55.1825
	}
}

DwarfMoon	"Eadu System 6.D28"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            2.5294e-009
	Radius          19.2606
	InertiaMoment   0.399343

	RotationPeriod  976.048
	Obliquity       91.9278
	EqAscendNode    -166.254
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.740 0.737 0.735)

	Surface
	{
		SurfStyle       0.402203
		OceanStyle      0.650344
		Randomize      (0.478, -0.935, 0.008)
		colorDistMagn   0.0629228
		colorDistFreq   0.210336
		detailScale     525.942
		colorConversion true
		snowLevel       2
		tropicLatitude  0.739293
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.729686
		terraceProb     0.319982
		erosion         0
		montesMagn      0.343038
		montesFreq      3.00082
		montesSpiky     0.923284
		montesFraction  0.557107
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.08342
		hillsFraction   0.614664
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262017
		craterFreq      0.213845
		craterDensity   0.98898
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.615247
		volcanoTemp     1708.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.296, 0.295, 0.294, 0.000)
		colorShelf     (0.314, 0.313, 0.312, 0.000)
		colorBeach     (0.333, 0.332, 0.331, 0.000)
		colorDesert    (0.351, 0.350, 0.349, 0.000)
		colorLowland   (0.370, 0.369, 0.367, 0.000)
		colorUpland    (0.388, 0.387, 0.386, 0.000)
		colorRock      (0.407, 0.406, 0.404, 0.000)
		colorSnow      (0.425, 0.424, 0.423, 1.000)
		BumpHeight      17.3345
		BumpOffset      3.4669
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.6477
		Period          6.27598
		Eccentricity    0.38618
		Inclination     45.5451
		AscendingNode   -167.67
		ArgOfPericenter 109.72
		MeanAnomaly     166.209
	}
}

DwarfMoon	"Eadu System 6.D29"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            3.52529e-009
	Radius          20.6518
	InertiaMoment   0.396636

	RotationPeriod  886.492
	Obliquity       -85.3047
	EqAscendNode    -7.79909
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.598 0.590 0.585)

	Surface
	{
		SurfStyle       0.64253
		OceanStyle      0.915005
		Randomize      (0.747, 0.747, -0.814)
		colorDistMagn   0.912688
		colorDistFreq   0.0640335
		detailScale     563.933
		colorConversion true
		snowLevel       2
		tropicLatitude  0.937495
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.329772
		terraceProb     0.250713
		erosion         0
		montesMagn      0.531384
		montesFreq      3.23431
		montesSpiky     0.842548
		montesFraction  0.25356
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.824868
		hillsFraction   0.778186
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257662
		craterFreq      0.204874
		craterDensity   1.01732
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.493708
		volcanoTemp     1679.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.233, 0.201, 0.164, 0.000)
		colorShelf     (0.239, 0.207, 0.187, 0.000)
		colorBeach     (0.281, 0.242, 0.222, 0.000)
		colorDesert    (0.305, 0.260, 0.217, 0.000)
		colorLowland   (0.335, 0.277, 0.246, 0.000)
		colorUpland    (0.371, 0.336, 0.299, 0.000)
		colorRock      (0.400, 0.366, 0.322, 0.000)
		colorSnow      (0.436, 0.390, 0.340, 1.000)
		BumpHeight      18.5867
		BumpOffset      3.71733
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.648179
		Period          6.28295
		Eccentricity    0.0332959
		Inclination     -25.6866
		AscendingNode   -12.4925
		ArgOfPericenter 158.171
		MeanAnomaly     -65.8901
	}
}

DwarfMoon	"Eadu System 6.D30"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            4.8783e-009
	Radius          31.3302
	InertiaMoment   0.398464

	RotationPeriod  1135.26
	Obliquity       49.4732
	EqAscendNode    69.4541
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.638 0.550 0.457)

	Surface
	{
		SurfStyle       0.481806
		OceanStyle      0.748903
		Randomize      (-0.784, -0.146, -0.091)
		colorDistMagn   0.508763
		colorDistFreq   0.781108
		detailScale     855.523
		colorConversion true
		snowLevel       2
		tropicLatitude  0.992392
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.454531
		terraceProb     0.517771
		erosion         0
		montesMagn      0.563202
		montesFreq      2.28893
		montesSpiky     0.978878
		montesFraction  0.0910729
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.25663
		hillsFraction   0.608164
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.216505
		craterFreq      0.21988
		craterDensity   0.707101
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.435082
		volcanoTemp     1384.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.255, 0.220, 0.183, 0.000)
		colorShelf     (0.271, 0.234, 0.194, 0.000)
		colorBeach     (0.287, 0.248, 0.206, 0.000)
		colorDesert    (0.303, 0.261, 0.217, 0.000)
		colorLowland   (0.319, 0.275, 0.229, 0.000)
		colorUpland    (0.335, 0.289, 0.240, 0.000)
		colorRock      (0.351, 0.303, 0.252, 0.000)
		colorSnow      (0.367, 0.316, 0.263, 1.000)
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
		SemiMajorAxis   0.648782
		Period          6.29172
		Eccentricity    0.283436
		Inclination     55.0939
		AscendingNode   66.4837
		ArgOfPericenter 132.703
		MeanAnomaly     147.776
	}
}

DwarfMoon	"Eadu System 6.D31"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            6.71123e-009
	Radius          28.1148
	InertiaMoment   0.399474

	RotationPeriod  878.136
	Obliquity       -53.6404
	EqAscendNode    91.5864
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.662 0.658 0.655)

	Surface
	{
		SurfStyle       0.0915284
		OceanStyle      0.616359
		Randomize      (0.815, 0.123, 0.261)
		colorDistMagn   0.376948
		colorDistFreq   0.384983
		detailScale     767.72
		colorConversion true
		snowLevel       2
		tropicLatitude  0.834243
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.570983
		terraceProb     0.456193
		erosion         0
		montesMagn      0.567536
		montesFreq      3.2559
		montesSpiky     0.72489
		montesFraction  0.465103
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.39508
		hillsFraction   0.598608
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234162
		craterFreq      0.241583
		craterDensity   0.934396
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.553943
		volcanoTemp     1471.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.265, 0.263, 0.262, 0.000)
		colorShelf     (0.281, 0.280, 0.278, 0.000)
		colorBeach     (0.298, 0.296, 0.295, 0.000)
		colorDesert    (0.314, 0.313, 0.311, 0.000)
		colorLowland   (0.331, 0.329, 0.327, 0.000)
		colorUpland    (0.347, 0.346, 0.344, 0.000)
		colorRock      (0.364, 0.362, 0.360, 0.000)
		colorSnow      (0.381, 0.378, 0.376, 1.000)
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
		SemiMajorAxis   0.64911
		Period          6.29649
		Eccentricity    0.0837799
		Inclination     -22.0181
		AscendingNode   90.339
		ArgOfPericenter 48.6889
		MeanAnomaly     -114.408
	}
}

DwarfMoon	"Eadu System 6.D32"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            9.18961e-009
	Radius          29.779
	InertiaMoment   0.397066

	RotationPeriod  794.951
	Obliquity       -39.0037
	EqAscendNode    -95.739
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.820 0.773 0.732)

	Surface
	{
		SurfStyle       0.124171
		OceanStyle      0.590271
		Randomize      (-0.463, -0.579, 0.516)
		colorDistMagn   0.476242
		colorDistFreq   0.478855
		detailScale     813.164
		colorConversion true
		snowLevel       2
		tropicLatitude  0.644613
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.566116
		terraceProb     0.332292
		erosion         0
		montesMagn      0.41612
		montesFreq      3.88773
		montesSpiky     0.943537
		montesFraction  0.564169
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.09243
		hillsFraction   0.652403
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243793
		craterFreq      0.225487
		craterDensity   0.92394
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.535844
		volcanoTemp     1416.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.328, 0.309, 0.293, 0.000)
		colorShelf     (0.349, 0.328, 0.311, 0.000)
		colorBeach     (0.369, 0.348, 0.329, 0.000)
		colorDesert    (0.390, 0.367, 0.348, 0.000)
		colorLowland   (0.410, 0.386, 0.366, 0.000)
		colorUpland    (0.431, 0.406, 0.384, 0.000)
		colorRock      (0.451, 0.425, 0.403, 0.000)
		colorSnow      (0.472, 0.444, 0.421, 1.000)
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
		SemiMajorAxis   0.649571
		Period          6.3032
		Eccentricity    0.00372879
		Inclination     -21.3793
		AscendingNode   -100.263
		ArgOfPericenter -81.5514
		MeanAnomaly     99.2656
	}
}

DwarfMoon	"Eadu System 6.D33"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            1.25375e-008
	Radius          31.7214
	InertiaMoment   0.398627

	RotationPeriod  728.232
	Obliquity       -67.8857
	EqAscendNode    -145.636
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.618 0.472 0.381)

	Surface
	{
		SurfStyle       0.109157
		OceanStyle      0.711995
		Randomize      (-0.293, 0.273, -0.494)
		colorDistMagn   0.893904
		colorDistFreq   0.558648
		detailScale     866.205
		colorConversion true
		snowLevel       2
		tropicLatitude  0.615812
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.498001
		terraceProb     0.272052
		erosion         0
		montesMagn      0.36325
		montesFreq      2.6614
		montesSpiky     0.959047
		montesFraction  0.243793
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.81755
		hillsFraction   0.68341
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23568
		craterFreq      0.248422
		craterDensity   0.910422
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.4849
		volcanoTemp     1570.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.247, 0.189, 0.152, 0.000)
		colorShelf     (0.263, 0.201, 0.162, 0.000)
		colorBeach     (0.278, 0.213, 0.171, 0.000)
		colorDesert    (0.294, 0.224, 0.181, 0.000)
		colorLowland   (0.309, 0.236, 0.190, 0.000)
		colorUpland    (0.325, 0.248, 0.200, 0.000)
		colorRock      (0.340, 0.260, 0.210, 0.000)
		colorSnow      (0.355, 0.272, 0.219, 1.000)
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
		SemiMajorAxis   0.650041
		Period          6.31004
		Eccentricity    0.14604
		Inclination     -64.259
		AscendingNode   -138.437
		ArgOfPericenter 13.5122
		MeanAnomaly     -159.844
	}
}

DwarfMoon	"Eadu System 6.D34"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            1.70593e-008
	Radius          32.8785
	InertiaMoment   0.399602

	RotationPeriod  649.76
	Obliquity       0.421978
	EqAscendNode    69.1466
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.565 0.563 0.558)

	Surface
	{
		SurfStyle       0.637488
		OceanStyle      0.592375
		Randomize      (0.295, 0.523, 0.343)
		colorDistMagn   0.276762
		colorDistFreq   0.833464
		detailScale     897.802
		colorConversion true
		snowLevel       2
		tropicLatitude  0.1702
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.761569
		terraceProb     0.217796
		erosion         0
		montesMagn      0.621309
		montesFreq      3.19607
		montesSpiky     0.882188
		montesFraction  0.194299
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.98809
		hillsFraction   0.664694
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247554
		craterFreq      0.161171
		craterDensity   0.815565
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.41128
		volcanoTemp     1325.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.221, 0.191, 0.156, 0.000)
		colorShelf     (0.226, 0.197, 0.179, 0.000)
		colorBeach     (0.266, 0.231, 0.212, 0.000)
		colorDesert    (0.288, 0.248, 0.206, 0.000)
		colorLowland   (0.317, 0.265, 0.234, 0.000)
		colorUpland    (0.351, 0.321, 0.285, 0.000)
		colorRock      (0.379, 0.349, 0.307, 0.000)
		colorSnow      (0.413, 0.372, 0.324, 1.000)
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
		SemiMajorAxis   0.650257
		Period          6.31319
		Eccentricity    0.214211
		Inclination     -9.94929
		AscendingNode   68.0682
		ArgOfPericenter 159.387
		MeanAnomaly     -111.899
	}
}

DwarfMoon	"Eadu System 6.D35"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            2.31712e-008
	Radius          42.8733
	InertiaMoment   0.397392

	RotationPeriod  723.033
	Obliquity       40.6018
	EqAscendNode    -177.138
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.770 0.769 0.767)

	Surface
	{
		SurfStyle       0.58268
		OceanStyle      0.17695
		Randomize      (0.583, 0.436, 0.969)
		colorDistMagn   0.76603
		colorDistFreq   1.1765
		detailScale     1170.73
		colorConversion true
		snowLevel       2
		tropicLatitude  0.289865
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.328111
		terraceProb     0.235591
		erosion         0
		montesMagn      0.396388
		montesFreq      3.75568
		montesSpiky     0.885389
		montesFraction  0.734423
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.32355
		hillsFraction   0.588348
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.20219
		craterFreq      0.200236
		craterDensity   0.900279
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.466997
		volcanoTemp     1129.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.300, 0.261, 0.215, 0.000)
		colorShelf     (0.308, 0.269, 0.246, 0.000)
		colorBeach     (0.362, 0.315, 0.292, 0.000)
		colorDesert    (0.393, 0.338, 0.284, 0.000)
		colorLowland   (0.431, 0.361, 0.322, 0.000)
		colorUpland    (0.477, 0.438, 0.391, 0.000)
		colorRock      (0.516, 0.477, 0.422, 0.000)
		colorSnow      (0.562, 0.508, 0.445, 1.000)
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
		SemiMajorAxis   0.650559
		Period          6.31759
		Eccentricity    0.236107
		Inclination     56.2323
		AscendingNode   -171.493
		ArgOfPericenter -137.176
		MeanAnomaly     102.745
	}
}

DwarfMoon	"Eadu System 6.D36"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            3.14453e-008
	Radius          45.1365
	InertiaMoment   0.398781

	RotationPeriod  656.211
	Obliquity       81.29
	EqAscendNode    -24.0894
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.487 0.410 0.367)

	Surface
	{
		SurfStyle       0.254595
		OceanStyle      0.931268
		Randomize      (-0.172, -0.942, 0.265)
		colorDistMagn   0.718237
		colorDistFreq   1.28804
		detailScale     1232.53
		colorConversion true
		snowLevel       2
		tropicLatitude  0.514459
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.525196
		terraceProb     0.313961
		erosion         0
		montesMagn      0.392916
		montesFreq      2.88579
		montesSpiky     0.921663
		montesFraction  0.542049
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.82473
		hillsFraction   0.491725
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233191
		craterFreq      0.208566
		craterDensity   0.860806
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.479231
		volcanoTemp     1697.14
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.195, 0.164, 0.147, 0.000)
		colorShelf     (0.207, 0.174, 0.156, 0.000)
		colorBeach     (0.219, 0.184, 0.165, 0.000)
		colorDesert    (0.231, 0.195, 0.174, 0.000)
		colorLowland   (0.244, 0.205, 0.183, 0.000)
		colorUpland    (0.256, 0.215, 0.192, 0.000)
		colorRock      (0.268, 0.225, 0.202, 0.000)
		colorSnow      (0.280, 0.236, 0.211, 1.000)
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
		SemiMajorAxis   0.651144
		Period          6.32611
		Eccentricity    0.443851
		Inclination     82.9226
		AscendingNode   -26.7217
		ArgOfPericenter -8.41827
		MeanAnomaly     -142.632
	}
}

DwarfMoon	"Eadu System 6.D37"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            4.26733e-008
	Radius          48.0035
	InertiaMoment   0.399729

	RotationPeriod  601.035
	Obliquity       33.4816
	EqAscendNode    56.4773
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.508 0.505 0.503)

	Surface
	{
		SurfStyle       0.620662
		OceanStyle      0.386468
		Randomize      (-0.991, -0.044, -0.245)
		colorDistMagn   0.861408
		colorDistFreq   0.278012
		detailScale     1310.81
		colorConversion true
		snowLevel       2
		tropicLatitude  0.758373
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.649286
		terraceProb     0.472373
		erosion         0
		montesMagn      0.499078
		montesFreq      2.94324
		montesSpiky     0.800787
		montesFraction  0.794184
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.62334
		hillsFraction   0.694514
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.279943
		craterFreq      0.25081
		craterDensity   0.810039
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.450697
		volcanoTemp     1464.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.198, 0.172, 0.141, 0.000)
		colorShelf     (0.203, 0.177, 0.161, 0.000)
		colorBeach     (0.239, 0.207, 0.191, 0.000)
		colorDesert    (0.259, 0.222, 0.186, 0.000)
		colorLowland   (0.285, 0.237, 0.211, 0.000)
		colorUpland    (0.315, 0.288, 0.257, 0.000)
		colorRock      (0.341, 0.313, 0.277, 0.000)
		colorSnow      (0.371, 0.333, 0.292, 1.000)
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
		SemiMajorAxis   0.651727
		Period          6.33461
		Eccentricity    0.30995
		Inclination     21.1163
		AscendingNode   50.568
		ArgOfPericenter -113.308
		MeanAnomaly     115.214
	}
}

DwarfMoon	"Eadu System 6.D38"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            5.79594e-008
	Radius          50.2858
	InertiaMoment   0.39766

	RotationPeriod  540.063
	Obliquity       -120.983
	EqAscendNode    129.674
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.618 0.615 0.611)

	Surface
	{
		SurfStyle       0.55581
		OceanStyle      0.615074
		Randomize      (-0.916, 0.875, -0.830)
		colorDistMagn   0.478824
		colorDistFreq   1.20617
		detailScale     1373.14
		colorConversion true
		snowLevel       2
		tropicLatitude  0.984317
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.618912
		terraceProb     0.508441
		erosion         0
		montesMagn      0.545487
		montesFreq      2.93468
		montesSpiky     0.921894
		montesFraction  0.914775
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.3812
		hillsFraction   0.6506
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.283566
		craterFreq      0.279061
		craterDensity   0.926282
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.413267
		volcanoTemp     1420.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.241, 0.209, 0.171, 0.000)
		colorShelf     (0.247, 0.215, 0.196, 0.000)
		colorBeach     (0.291, 0.252, 0.232, 0.000)
		colorDesert    (0.315, 0.270, 0.226, 0.000)
		colorLowland   (0.346, 0.289, 0.257, 0.000)
		colorUpland    (0.383, 0.350, 0.312, 0.000)
		colorRock      (0.414, 0.381, 0.336, 0.000)
		colorSnow      (0.451, 0.406, 0.355, 1.000)
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
		SemiMajorAxis   0.652113
		Period          6.34024
		Eccentricity    0.239684
		Inclination     -27.3467
		AscendingNode   135.487
		ArgOfPericenter -12.7731
		MeanAnomaly     -51.682
	}
}

DwarfMoon	"Eadu System 6.D39"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            7.8857e-008
	Radius          65.1431
	InertiaMoment   0.398928

	RotationPeriod  599.469
	Obliquity       40.1662
	EqAscendNode    49.1778
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.519 0.517 0.512)

	Surface
	{
		SurfStyle       0.118185
		OceanStyle      0.560514
		Randomize      (0.970, 0.982, -0.815)
		colorDistMagn   0.408566
		colorDistFreq   2.15302
		detailScale     1778.84
		colorConversion true
		snowLevel       2
		tropicLatitude  0.643397
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.452023
		terraceProb     0.253342
		erosion         0
		montesMagn      0.531903
		montesFreq      3.13442
		montesSpiky     0.95884
		montesFraction  0.575881
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.945
		hillsFraction   0.677541
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22002
		craterFreq      0.232673
		craterDensity   0.865689
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.483826
		volcanoTemp     1937.32
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.208, 0.207, 0.205, 0.000)
		colorShelf     (0.221, 0.220, 0.218, 0.000)
		colorBeach     (0.234, 0.233, 0.230, 0.000)
		colorDesert    (0.247, 0.245, 0.243, 0.000)
		colorLowland   (0.260, 0.258, 0.256, 0.000)
		colorUpland    (0.273, 0.271, 0.269, 0.000)
		colorRock      (0.286, 0.284, 0.282, 0.000)
		colorSnow      (0.299, 0.297, 0.294, 1.000)
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
		SemiMajorAxis   0.652766
		Period          6.34976
		Eccentricity    0.419732
		Inclination     -0.194963
		AscendingNode   51.7144
		ArgOfPericenter -112.436
		MeanAnomaly     98.8341
	}
}

DwarfMoon	"Eadu System 6.D40"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            1.07573e-007
	Radius          68.4198
	InertiaMoment   0.399854

	RotationPeriod  540.869
	Obliquity       -8.8675
	EqAscendNode    -48.6241
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.716 0.579 0.515)

	Surface
	{
		SurfStyle       0.762875
		OceanStyle      0.280792
		Randomize      (0.907, -0.803, -0.487)
		colorDistMagn   0.572167
		colorDistFreq   3.22174
		detailScale     1868.32
		colorConversion true
		snowLevel       2
		tropicLatitude  0.943464
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.488258
		terraceProb     0.311755
		erosion         0
		montesMagn      0.492526
		montesFreq      2.88461
		montesSpiky     0.988583
		montesFraction  0.384884
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.93276
		hillsFraction   0.622278
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233214
		craterFreq      0.193455
		craterDensity   0.886611
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.541721
		volcanoTemp     1593.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.279, 0.197, 0.144, 0.000)
		colorShelf     (0.286, 0.203, 0.165, 0.000)
		colorBeach     (0.336, 0.238, 0.196, 0.000)
		colorDesert    (0.365, 0.255, 0.190, 0.000)
		colorLowland   (0.401, 0.272, 0.216, 0.000)
		colorUpland    (0.444, 0.330, 0.262, 0.000)
		colorRock      (0.479, 0.359, 0.283, 0.000)
		colorSnow      (0.522, 0.382, 0.298, 1.000)
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
		SemiMajorAxis   0.653073
		Period          6.35425
		Eccentricity    0.323062
		Inclination     -63.2266
		AscendingNode   -34.3645
		ArgOfPericenter 107.151
		MeanAnomaly     -97.1349
	}
}

DwarfMoon	"Eadu System 6.D41"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            1.47276e-007
	Radius          72.9663
	InertiaMoment   0.397892

	RotationPeriod  492.631
	Obliquity       36.7499
	EqAscendNode    -172.998
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.439 0.430 0.426)

	Surface
	{
		SurfStyle       0.176266
		OceanStyle      0.242605
		Randomize      (-0.856, 0.009, -0.556)
		colorDistMagn   0.756234
		colorDistFreq   2.83984
		detailScale     1992.47
		colorConversion true
		snowLevel       2
		tropicLatitude  0.250999
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.354296
		terraceProb     0.364309
		erosion         0
		montesMagn      0.290026
		montesFreq      2.70553
		montesSpiky     0.948343
		montesFraction  0.818966
		dunesFraction   0
		hillsMagn       0
		hillsFreq       14.207
		hillsFraction   0.743913
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247392
		craterFreq      0.193484
		craterDensity   0.606771
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.592704
		volcanoTemp     1752.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.175, 0.172, 0.170, 0.000)
		colorShelf     (0.186, 0.183, 0.181, 0.000)
		colorBeach     (0.197, 0.194, 0.192, 0.000)
		colorDesert    (0.208, 0.204, 0.202, 0.000)
		colorLowland   (0.219, 0.215, 0.213, 0.000)
		colorUpland    (0.230, 0.226, 0.224, 0.000)
		colorRock      (0.241, 0.237, 0.234, 0.000)
		colorSnow      (0.252, 0.247, 0.245, 1.000)
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
		SemiMajorAxis   0.653408
		Period          6.35914
		Eccentricity    0.370057
		Inclination     48.3924
		AscendingNode   -167.016
		ArgOfPericenter 12.7731
		MeanAnomaly     176.789
	}
}

DwarfMoon	"Eadu System 6.D42"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            2.02573e-007
	Radius          77.2122
	InertiaMoment   0.39907

	RotationPeriod  445.916
	Obliquity       -80.9598
	EqAscendNode    -149.722
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.675 0.673 0.671)

	Surface
	{
		SurfStyle       0.165349
		OceanStyle      0.549032
		Randomize      (-0.744, -0.673, -0.754)
		colorDistMagn   0.675055
		colorDistFreq   2.98313
		detailScale     2108.41
		colorConversion true
		snowLevel       2
		tropicLatitude  0.61131
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.270416
		terraceProb     0.662466
		erosion         0
		montesMagn      0.508836
		montesFreq      3.14298
		montesSpiky     0.994209
		montesFraction  0.728848
		dunesFraction   0
		hillsMagn       0
		hillsFreq       14.4963
		hillsFraction   0.561315
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223374
		craterFreq      0.172773
		craterDensity   0.947423
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.385465
		volcanoTemp     1660.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.270, 0.269, 0.269, 0.000)
		colorShelf     (0.287, 0.286, 0.285, 0.000)
		colorBeach     (0.304, 0.303, 0.302, 0.000)
		colorDesert    (0.321, 0.319, 0.319, 0.000)
		colorLowland   (0.338, 0.336, 0.336, 0.000)
		colorUpland    (0.354, 0.353, 0.352, 0.000)
		colorRock      (0.371, 0.370, 0.369, 0.000)
		colorSnow      (0.388, 0.387, 0.386, 1.000)
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
		SemiMajorAxis   0.654009
		Period          6.36792
		Eccentricity    0.245902
		Inclination     -83.3153
		AscendingNode   -142.016
		ArgOfPericenter 173.316
		MeanAnomaly     -173.912
	}
}

DwarfMoon	"Eadu System 6.D43"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            2.80253e-007
	Radius          100.594
	InertiaMoment   0.399979

	RotationPeriod  493.63
	Obliquity       7.25439
	EqAscendNode    160.558
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.762 0.760 0.759)

	Surface
	{
		SurfStyle       0.933224
		OceanStyle      0.751067
		Randomize      (-0.730, -0.125, 0.976)
		colorDistMagn   0.420176
		colorDistFreq   8.17225
		detailScale     2746.89
		colorConversion true
		snowLevel       2
		tropicLatitude  0.279228
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.476842
		terraceProb     0.319732
		erosion         0
		montesMagn      0.478985
		montesFreq      3.39895
		montesSpiky     0.975947
		montesFraction  0.434341
		dunesFraction   0
		hillsMagn       0
		hillsFreq       22.115
		hillsFraction   0.776373
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250485
		craterFreq      0.294185
		craterDensity   0.798211
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.481485
		volcanoTemp     1437.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.259, 0.266, 0.304, 0.050)
		colorShelf     (0.305, 0.312, 0.349, 0.040)
		colorBeach     (0.351, 0.357, 0.395, 0.030)
		colorDesert    (0.396, 0.403, 0.448, 0.020)
		colorLowland   (0.442, 0.449, 0.493, 0.030)
		colorUpland    (0.488, 0.494, 0.539, 0.050)
		colorRock      (0.534, 0.540, 0.600, 0.020)
		colorSnow      (0.534, 0.540, 0.600, 1.000)
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
		SemiMajorAxis   0.654442
		Period          6.37424
		Eccentricity    0.374218
		Inclination     -9.09903
		AscendingNode   164.986
		ArgOfPericenter 147.034
		MeanAnomaly     -143.323
	}
}

DwarfMoon	"Eadu System 6.D44"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            3.90483e-007
	Radius          105.808
	InertiaMoment   0.398099

	RotationPeriod  439.704
	Obliquity       29.1598
	EqAscendNode    41.4621
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.630 0.624 0.619)

	Surface
	{
		SurfStyle       0.637122
		OceanStyle      0.32353
		Randomize      (-0.627, -0.158, 0.939)
		colorDistMagn   0.62073
		colorDistFreq   5.5119
		detailScale     2889.26
		colorConversion true
		snowLevel       2
		tropicLatitude  0.473987
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.492228
		terraceProb     0.153645
		erosion         0
		montesMagn      0.609539
		montesFreq      3.44048
		montesSpiky     0.98508
		montesFraction  0.529212
		dunesFraction   0
		hillsMagn       0
		hillsFreq       35.8647
		hillsFraction   0.799269
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243406
		craterFreq      0.383879
		craterDensity   0.980514
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51817
		volcanoTemp     1347.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.246, 0.212, 0.173, 0.000)
		colorShelf     (0.252, 0.218, 0.198, 0.000)
		colorBeach     (0.296, 0.256, 0.235, 0.000)
		colorDesert    (0.321, 0.275, 0.229, 0.000)
		colorLowland   (0.353, 0.293, 0.260, 0.000)
		colorUpland    (0.391, 0.356, 0.316, 0.000)
		colorRock      (0.422, 0.387, 0.341, 0.000)
		colorSnow      (0.460, 0.412, 0.359, 1.000)
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
		SemiMajorAxis   0.655084
		Period          6.38361
		Eccentricity    0.0469405
		Inclination     -1.19154
		AscendingNode   42.6139
		ArgOfPericenter -18.6855
		MeanAnomaly     28.7301
	}
}

DwarfMoon	"Eadu System 6.D45"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            5.48751e-007
	Radius          113.765
	InertiaMoment   0.399207

	RotationPeriod  399.946
	Obliquity       -56.4198
	EqAscendNode    2.52444
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.733 0.664 0.639)

	Surface
	{
		SurfStyle       0.573729
		OceanStyle      0.744931
		Randomize      (-0.952, 0.971, -0.179)
		colorDistMagn   0.7863
		colorDistFreq   6.6727
		detailScale     3106.55
		colorConversion true
		snowLevel       2
		tropicLatitude  0.975106
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.61426
		terraceProb     0.368464
		erosion         0
		montesMagn      0.583246
		montesFreq      2.27765
		montesSpiky     0.929372
		montesFraction  0.415894
		dunesFraction   0
		hillsMagn       0
		hillsFreq       26.7211
		hillsFraction   0.767384
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245516
		craterFreq      0.463849
		craterDensity   0.821155
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.408955
		volcanoTemp     1355.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.286, 0.226, 0.179, 0.000)
		colorShelf     (0.293, 0.232, 0.204, 0.000)
		colorBeach     (0.345, 0.272, 0.243, 0.000)
		colorDesert    (0.374, 0.292, 0.236, 0.000)
		colorLowland   (0.411, 0.312, 0.268, 0.000)
		colorUpland    (0.455, 0.379, 0.326, 0.000)
		colorRock      (0.491, 0.412, 0.351, 0.000)
		colorSnow      (0.535, 0.438, 0.370, 1.000)
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
		SemiMajorAxis   0.655504
		Period          6.38975
		Eccentricity    0.210454
		Inclination     -20.7695
		AscendingNode   0.399218
		ArgOfPericenter 24.9442
		MeanAnomaly     33.0105
	}
}

DwarfMoon	"Eadu System 6.D46"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            7.79137e-007
	Radius          122.114
	InertiaMoment   0.395926

	RotationPeriod  359.326
	Obliquity       -5.81724
	EqAscendNode    158.329
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.553 0.551 0.548)

	Surface
	{
		SurfStyle       0.936008
		OceanStyle      0.481859
		Randomize      (-0.178, 0.048, 0.629)
		colorDistMagn   0.800129
		colorDistFreq   4.49221
		detailScale     3334.52
		colorConversion true
		snowLevel       2
		tropicLatitude  0.323805
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.639407
		terraceProb     0.16629
		erosion         0
		montesMagn      0.55167
		montesFreq      4.14302
		montesSpiky     0.946187
		montesFraction  0.111423
		dunesFraction   0
		hillsMagn       0
		hillsFreq       28.304
		hillsFraction   0.725938
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217003
		craterFreq      0.558318
		craterDensity   0.907842
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.429552
		volcanoTemp     1534
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.188, 0.193, 0.219, 0.050)
		colorShelf     (0.221, 0.226, 0.252, 0.040)
		colorBeach     (0.255, 0.259, 0.285, 0.030)
		colorDesert    (0.288, 0.292, 0.323, 0.020)
		colorLowland   (0.321, 0.325, 0.356, 0.030)
		colorUpland    (0.354, 0.358, 0.389, 0.050)
		colorRock      (0.387, 0.391, 0.433, 0.020)
		colorSnow      (0.387, 0.391, 0.433, 1.000)
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
		SemiMajorAxis   0.655862
		Period          6.39499
		Eccentricity    0.407977
		Inclination     -24.1647
		AscendingNode   157.927
		ArgOfPericenter 132.874
		MeanAnomaly     149.698
	}
}

DwarfMoon	"Eadu System 6.D47"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            1.11995e-006
	Radius          161.968
	InertiaMoment   0.398286

	RotationPeriod  398.15
	Obliquity       4.52077
	EqAscendNode    15.1512
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.644 0.572 0.497)

	Surface
	{
		SurfStyle       0.247102
		OceanStyle      0.102348
		Randomize      (-0.879, -0.550, 0.638)
		colorDistMagn   0.0405291
		colorDistFreq   9.09826
		detailScale     4422.81
		colorConversion true
		snowLevel       2
		tropicLatitude  0.286939
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.40768
		terraceProb     0.22106
		erosion         0
		montesMagn      0.473336
		montesFreq      3.26846
		montesSpiky     0.878365
		montesFraction  0.494971
		dunesFraction   0
		hillsMagn       0
		hillsFreq       75.6321
		hillsFraction   0.932535
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214314
		craterFreq      0.847789
		craterDensity   0.934809
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.538118
		volcanoTemp     1351.33
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.258, 0.229, 0.199, 0.000)
		colorShelf     (0.274, 0.243, 0.211, 0.000)
		colorBeach     (0.290, 0.257, 0.224, 0.000)
		colorDesert    (0.306, 0.272, 0.236, 0.000)
		colorLowland   (0.322, 0.286, 0.249, 0.000)
		colorUpland    (0.338, 0.300, 0.261, 0.000)
		colorRock      (0.354, 0.314, 0.273, 0.000)
		colorSnow      (0.370, 0.329, 0.286, 1.000)
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
		SemiMajorAxis   0.656202
		Period          6.39996
		Eccentricity    0.378191
		Inclination     12.1752
		AscendingNode   6.47204
		ArgOfPericenter 63.4847
		MeanAnomaly     -50.2842
	}
}

DwarfMoon	"Eadu System 6.D48"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            1.6338e-006
	Radius          171.612
	InertiaMoment   0.39934

	RotationPeriod  350.341
	Obliquity       -45.6808
	EqAscendNode    -99.8998
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.480 0.473 0.469)

	Surface
	{
		SurfStyle       0.316351
		OceanStyle      0.783615
		Randomize      (-0.268, -0.998, 0.673)
		colorDistMagn   0.379647
		colorDistFreq   14.2584
		detailScale     4686.14
		colorConversion true
		snowLevel       2
		tropicLatitude  0.713045
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.549392
		terraceProb     0.119153
		erosion         0
		montesMagn      0.484352
		montesFreq      2.72735
		montesSpiky     0.958264
		montesFraction  0.731298
		dunesFraction   0
		hillsMagn       0
		hillsFreq       66.7269
		hillsFraction   0.886324
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232163
		craterFreq      1.26555
		craterDensity   0.738413
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.566832
		volcanoTemp     1430.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.192, 0.189, 0.188, 0.000)
		colorShelf     (0.204, 0.201, 0.199, 0.000)
		colorBeach     (0.216, 0.213, 0.211, 0.000)
		colorDesert    (0.228, 0.225, 0.223, 0.000)
		colorLowland   (0.240, 0.237, 0.235, 0.000)
		colorUpland    (0.252, 0.249, 0.246, 0.000)
		colorRock      (0.264, 0.260, 0.258, 0.000)
		colorSnow      (0.276, 0.272, 0.270, 1.000)
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
		SemiMajorAxis   0.65647
		Period          6.40389
		Eccentricity    0.310128
		Inclination     -12.0245
		AscendingNode   -96.856
		ArgOfPericenter -11.6464
		MeanAnomaly     78.5618
	}
}

DwarfMoon	"Eadu System 6.D49"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            2.42621e-006
	Radius          187.775
	InertiaMoment   0.396625

	RotationPeriod  313.914
	Obliquity       137.015
	EqAscendNode    -22.2425
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.611 0.507 0.428)

	Surface
	{
		SurfStyle       0.162588
		OceanStyle      0.779115
		Randomize      (0.319, -0.203, 0.390)
		colorDistMagn   0.922787
		colorDistFreq   23.3726
		detailScale     5127.51
		colorConversion true
		snowLevel       2
		tropicLatitude  0.269472
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.448919
		terraceProb     0.235727
		erosion         0
		montesMagn      0.476143
		montesFreq      3.09149
		montesSpiky     0.966253
		montesFraction  0.375807
		dunesFraction   0
		hillsMagn       0
		hillsFreq       92.1298
		hillsFraction   0.547135
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257203
		craterFreq      1.38016
		craterDensity   0.913624
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.457185
		volcanoTemp     1800.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.244, 0.203, 0.171, 0.000)
		colorShelf     (0.259, 0.215, 0.182, 0.000)
		colorBeach     (0.275, 0.228, 0.193, 0.000)
		colorDesert    (0.290, 0.241, 0.204, 0.000)
		colorLowland   (0.305, 0.253, 0.214, 0.000)
		colorUpland    (0.321, 0.266, 0.225, 0.000)
		colorRock      (0.336, 0.279, 0.236, 0.000)
		colorSnow      (0.351, 0.291, 0.246, 1.000)
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
		SemiMajorAxis   0.656838
		Period          6.40928
		Eccentricity    0.254299
		Inclination     36.6738
		AscendingNode   -22.4757
		ArgOfPericenter 34.5188
		MeanAnomaly     -77.3665
	}
}

Moon	"Eadu System 6.9"
{
	ParentBody     "Eadu System 6"
	Class	       "IceWorld"

	Mass            3.68173e-006
	Radius          206.574
	InertiaMoment   0.39846

	RotationPeriod  281.322
	Obliquity       38.5486
	EqAscendNode    44.3184
	//Precession      0

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.521 0.515 0.510)

	Surface
	{
		SurfStyle       0.485518
		OceanStyle      0.835079
		Randomize      (-0.107, 0.270, 0.294)
		colorDistMagn   0.082456
		colorDistFreq   20.5504
		detailScale     531.32
		colorConversion true
		drivenDarkening 0.0106243
		seaLevel        0.200882
		snowLevel       2
		tropicLatitude  0.949795
		icecapLatitude  1
		icecapHeight    0.200882
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.68289
		venusFreq       0.718452
		venusMagn       0
		mareFreq        0
		mareDensity     1.9928e-006
		terraceProb     0.506851
		erosion         0
		montesMagn      0.0528435
		montesFreq      9.82779
		montesSpiky     0.962292
		montesFraction  0.147656
		dunesMagn       0.0503733
		dunesFreq       270.47
		dunesFraction   0.347584
		hillsMagn       0.132807
		hillsFreq       23.2082
		hillsFraction   0.539549
		hills2Fraction  0.107834
		riversMagn      67.8401
		riversFreq      1.66192
		riversSin       6.39934
		riversOctaves   0
		canyonsMagn     0.705974
		canyonsFreq     0.0784076
		canyonFraction  0
		cracksMagn      0.0255948
		cracksFreq      0.109604
		cracksOctaves   0
		craterMagn      1.07766
		craterFreq      0.722945
		craterDensity   0.848344
		craterOctaves   8
		craterRayedFactor 0.148058
		volcanoMagn     0.192753
		volcanoFreq     0.72415
		volcanoDensity  0.22759
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.262727
		volcanoRadius   0.15753
		volcanoTemp     1559.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.156, 0.129, 0.112, 0.000)
		colorShelf     (0.193, 0.160, 0.143, 0.000)
		colorBeach     (0.292, 0.242, 0.214, 0.200)
		colorDesert    (0.266, 0.227, 0.189, 0.500)
		colorLowland   (0.203, 0.175, 0.143, 0.800)
		colorUpland    (0.344, 0.309, 0.265, 1.000)
		colorRock      (0.670, 0.620, 0.550, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.203, 0.175, 0.143, 0.800)
		colorUpPlants  (0.344, 0.309, 0.265, 1.000)
		BumpHeight      10.3287
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
		SemiMajorAxis   0.657404
		Period          6.41756
		Eccentricity    0.190079
		Inclination     84.2088
		AscendingNode   50.8083
		ArgOfPericenter -60.7542
		MeanAnomaly     158.058
	}
}

Moon	"Eadu System 6.10"
{
	ParentBody     "Eadu System 6"
	Class	       "IceWorld"

	Mass            5.73762e-006
	Radius          284.673
	InertiaMoment   0.399471

	RotationPeriod  310.622
	Obliquity       57.3973
	EqAscendNode    -145.767
	//Precession      0

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.717 0.715 0.712)

	Surface
	{
		SurfStyle       0.331349
		OceanStyle      0.0529292
		Randomize      (0.558, -0.320, 0.405)
		colorDistMagn   0.0762761
		colorDistFreq   43.9089
		detailScale     732.195
		colorConversion true
		drivenDarkening 0.0106182
		seaLevel        0.170843
		snowLevel       2
		tropicLatitude  0.397028
		icecapLatitude  0.875334
		icecapHeight    0.184626
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.87398
		venusFreq       0.835699
		venusMagn       0.194068
		mareFreq        0
		mareDensity     1.01057e-006
		terraceProb     0.293995
		erosion         0
		montesMagn      0.0652194
		montesFreq      14.1673
		montesSpiky     0.900181
		montesFraction  0.407355
		dunesMagn       0.045776
		dunesFreq       374.826
		dunesFraction   0.636509
		hillsMagn       0.113857
		hillsFreq       35.5125
		hillsFraction   0.112693
		hills2Fraction  0.0856022
		riversMagn      56.7846
		riversFreq      4.298
		riversSin       6.17193
		riversOctaves   0
		canyonsMagn     0.531097
		canyonsFreq     0.100275
		canyonFraction  0
		cracksMagn      0.0492421
		cracksFreq      0.123093
		cracksOctaves   0
		craterMagn      0.867688
		craterFreq      0.763605
		craterDensity   0.827574
		craterOctaves   8
		craterRayedFactor 0.166921
		volcanoMagn     0.185494
		volcanoFreq     0.924341
		volcanoDensity  0.185996
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.300709
		volcanoRadius   0.139884
		volcanoTemp     1701.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.717, 0.715, 0.712, 0.500)
		colorShelf     (0.681, 0.679, 0.677, 0.500)
		colorBeach     (0.502, 0.500, 0.499, 0.750)
		colorDesert    (0.610, 0.607, 0.605, 1.000)
		colorLowland   (0.631, 0.629, 0.627, 1.000)
		colorUpland    (0.667, 0.665, 0.662, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.631, 0.629, 0.627, 1.000)
		colorUpPlants  (0.667, 0.665, 0.662, 1.000)
		BumpHeight      14.2337
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
		SemiMajorAxis   0.65778
		Period          6.42306
		Eccentricity    0.249339
		Inclination     49.0597
		AscendingNode   -152.554
		ArgOfPericenter -102.707
		MeanAnomaly     102.018
	}
}

DwarfMoon	"Eadu System 6.D50"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            1.82418e-011
	Radius          3.86216
	InertiaMoment   0.397058

	RotationPeriod  2196.78
	Obliquity       -21.1975
	EqAscendNode    -140.654
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.612 0.523 0.407)

	Surface
	{
		SurfStyle       0.0468546
		OceanStyle      0.918716
		Randomize      (-0.089, 0.376, 0.241)
		colorDistMagn   0.464345
		colorDistFreq   0.00886311
		detailScale     105.463
		colorConversion true
		snowLevel       2
		tropicLatitude  0.812141
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.328707
		terraceProb     0.379492
		erosion         0
		montesMagn      0.471172
		montesFreq      3.0174
		montesSpiky     0.991267
		montesFraction  0.658751
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0441624
		hillsFraction   0.661901
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.192794
		craterFreq      0.191596
		craterDensity   0.745945
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.501427
		volcanoTemp     1429.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.245, 0.209, 0.163, 0.000)
		colorShelf     (0.260, 0.222, 0.173, 0.000)
		colorBeach     (0.275, 0.236, 0.183, 0.000)
		colorDesert    (0.291, 0.249, 0.194, 0.000)
		colorLowland   (0.306, 0.262, 0.204, 0.000)
		colorUpland    (0.321, 0.275, 0.214, 0.000)
		colorRock      (0.337, 0.288, 0.224, 0.000)
		colorSnow      (0.352, 0.301, 0.234, 1.000)
		BumpHeight      3.47594
		BumpOffset      0.695189
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.657997
		Period          6.42624
		Eccentricity    0.0963291
		Inclination     36.4653
		AscendingNode   -140.718
		ArgOfPericenter 80.6758
		MeanAnomaly     -53.4161
	}
}

DwarfMoon	"Eadu System 6.D51"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            3.51863e-011
	Radius          4.60493
	InertiaMoment   0.398623

	RotationPeriod  1910.61
	Obliquity       92.6426
	EqAscendNode    -9.46253
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.411 0.407 0.401)

	Surface
	{
		SurfStyle       0.185659
		OceanStyle      0.905099
		Randomize      (0.873, 0.331, -0.519)
		colorDistMagn   0.470458
		colorDistFreq   0.0141791
		detailScale     125.745
		colorConversion true
		snowLevel       2
		tropicLatitude  0.950291
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.470884
		terraceProb     0.348441
		erosion         0
		montesMagn      0.530302
		montesFreq      2.74026
		montesSpiky     0.937752
		montesFraction  0.629377
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0742754
		hillsFraction   0.388415
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240443
		craterFreq      0.198824
		craterDensity   0.739471
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.402956
		volcanoTemp     1479.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.164, 0.163, 0.160, 0.000)
		colorShelf     (0.175, 0.173, 0.170, 0.000)
		colorBeach     (0.185, 0.183, 0.180, 0.000)
		colorDesert    (0.195, 0.193, 0.190, 0.000)
		colorLowland   (0.206, 0.204, 0.200, 0.000)
		colorUpland    (0.216, 0.214, 0.210, 0.000)
		colorRock      (0.226, 0.224, 0.221, 0.000)
		colorSnow      (0.236, 0.234, 0.231, 1.000)
		BumpHeight      4.14444
		BumpOffset      0.828887
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.658418
		Period          6.43241
		Eccentricity    0.463812
		Inclination     16.3107
		AscendingNode   -17.8034
		ArgOfPericenter -89.0647
		MeanAnomaly     -44.9621
	}
}

DwarfMoon	"Eadu System 6.D52"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            6.2756e-011
	Radius          5.35488
	InertiaMoment   0.399599

	RotationPeriod  1680.32
	Obliquity       -53.4457
	EqAscendNode    -118.135
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.431 0.426 0.420)

	Surface
	{
		SurfStyle       0.583077
		OceanStyle      0.00782237
		Randomize      (-0.409, -0.761, -0.912)
		colorDistMagn   0.141505
		colorDistFreq   0.0164538
		detailScale     146.224
		colorConversion true
		snowLevel       2
		tropicLatitude  0.732619
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.537146
		terraceProb     0.235314
		erosion         0
		montesMagn      0.434835
		montesFreq      3.7442
		montesSpiky     0.998843
		montesFraction  0.351371
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0398535
		hillsFraction   0.635194
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230363
		craterFreq      0.264112
		craterDensity   0.857179
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.531099
		volcanoTemp     1742.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.168, 0.145, 0.117, 0.000)
		colorShelf     (0.173, 0.149, 0.134, 0.000)
		colorBeach     (0.203, 0.175, 0.159, 0.000)
		colorDesert    (0.220, 0.187, 0.155, 0.000)
		colorLowland   (0.242, 0.200, 0.176, 0.000)
		colorUpland    (0.267, 0.243, 0.214, 0.000)
		colorRock      (0.289, 0.264, 0.231, 0.000)
		colorSnow      (0.315, 0.281, 0.243, 1.000)
		BumpHeight      4.81939
		BumpOffset      0.963877
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.658683
		Period          6.4363
		Eccentricity    0.345445
		Inclination     -23.778
		AscendingNode   -114.753
		ArgOfPericenter -36.0987
		MeanAnomaly     -139.296
	}
}

DwarfMoon	"Eadu System 6.D53"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            1.0574e-010
	Radius          7.75253
	InertiaMoment   0.397386

	RotationPeriod  1856.59
	Obliquity       -78.3698
	EqAscendNode    32.2021
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.712 0.655 0.579)

	Surface
	{
		SurfStyle       0.783428
		OceanStyle      0.380997
		Randomize      (-0.440, -0.984, -0.794)
		colorDistMagn   0.603483
		colorDistFreq   0.0315582
		detailScale     211.696
		colorConversion true
		snowLevel       2
		tropicLatitude  0.991049
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.550123
		terraceProb     0.153226
		erosion         0
		montesMagn      0.558581
		montesFreq      2.77976
		montesSpiky     0.852072
		montesFraction  0.373437
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.119164
		hillsFraction   0.858806
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244163
		craterFreq      0.239376
		craterDensity   0.998125
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.465633
		volcanoTemp     1689.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.278, 0.223, 0.162, 0.000)
		colorShelf     (0.285, 0.229, 0.185, 0.000)
		colorBeach     (0.335, 0.269, 0.220, 0.000)
		colorDesert    (0.363, 0.288, 0.214, 0.000)
		colorLowland   (0.399, 0.308, 0.243, 0.000)
		colorUpland    (0.442, 0.373, 0.295, 0.000)
		colorRock      (0.477, 0.406, 0.319, 0.000)
		colorSnow      (0.520, 0.432, 0.336, 1.000)
		BumpHeight      6.97728
		BumpOffset      1.39546
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.659
		Period          6.44095
		Eccentricity    0.344412
		Inclination     -22.7008
		AscendingNode   32.3071
		ArgOfPericenter 26.9587
		MeanAnomaly     -91.7242
	}
}

DwarfMoon	"Eadu System 6.D54"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            1.70656e-010
	Radius          8.19823
	InertiaMoment   0.398778

	RotationPeriod  1565.36
	Obliquity       3.38596
	EqAscendNode    109.38
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.466 0.464 0.459)

	Surface
	{
		SurfStyle       0.0478962
		OceanStyle      0.625197
		Randomize      (0.295, -0.806, -0.080)
		colorDistMagn   0.577444
		colorDistFreq   0.0373051
		detailScale     223.866
		colorConversion true
		snowLevel       2
		tropicLatitude  0.595477
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.293601
		terraceProb     0.291231
		erosion         0
		montesMagn      0.592754
		montesFreq      3.60415
		montesSpiky     0.806425
		montesFraction  0.304053
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.19981
		hillsFraction   0.595695
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241389
		craterFreq      0.212626
		craterDensity   0.862329
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.624658
		volcanoTemp     1226.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.186, 0.185, 0.184, 0.000)
		colorShelf     (0.198, 0.197, 0.195, 0.000)
		colorBeach     (0.210, 0.209, 0.207, 0.000)
		colorDesert    (0.221, 0.220, 0.218, 0.000)
		colorLowland   (0.233, 0.232, 0.230, 0.000)
		colorUpland    (0.244, 0.243, 0.241, 0.000)
		colorRock      (0.256, 0.255, 0.253, 0.000)
		colorSnow      (0.268, 0.267, 0.264, 1.000)
		BumpHeight      7.37841
		BumpOffset      1.47568
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.659587
		Period          6.44955
		Eccentricity    0.178308
		Inclination     -34.941
		AscendingNode   116.208
		ArgOfPericenter 148.813
		MeanAnomaly     -62.355
	}
}

DwarfMoon	"Eadu System 6.D55"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            2.66314e-010
	Radius          9.09239
	InertiaMoment   0.399726

	RotationPeriod  1400.1
	Obliquity       -31.7153
	EqAscendNode    -53.173
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.739 0.734 0.732)

	Surface
	{
		SurfStyle       0.12583
		OceanStyle      0.362229
		Randomize      (0.111, -0.031, 0.055)
		colorDistMagn   0.843469
		colorDistFreq   0.059979
		detailScale     248.283
		colorConversion true
		snowLevel       2
		tropicLatitude  0.497797
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.431767
		terraceProb     0.41022
		erosion         0
		montesMagn      0.319729
		montesFreq      3.57456
		montesSpiky     0.879824
		montesFraction  0.837844
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.24788
		hillsFraction   0.596517
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25643
		craterFreq      0.154545
		craterDensity   0.801528
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.534006
		volcanoTemp     1615.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.296, 0.294, 0.293, 0.000)
		colorShelf     (0.314, 0.312, 0.311, 0.000)
		colorBeach     (0.333, 0.330, 0.330, 0.000)
		colorDesert    (0.351, 0.349, 0.348, 0.000)
		colorLowland   (0.370, 0.367, 0.366, 0.000)
		colorUpland    (0.388, 0.385, 0.385, 0.000)
		colorRock      (0.407, 0.404, 0.403, 0.000)
		colorSnow      (0.425, 0.422, 0.421, 1.000)
		BumpHeight      8.18315
		BumpOffset      1.63663
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.660179
		Period          6.45823
		Eccentricity    0.340273
		Inclination     35.9578
		AscendingNode   -54.6221
		ArgOfPericenter 1.75727
		MeanAnomaly     110.229
	}
}

DwarfMoon	"Eadu System 6.D56"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            4.04571e-010
	Radius          10.0329
	InertiaMoment   0.397655

	RotationPeriod  1256.91
	Obliquity       -60.2803
	EqAscendNode    -92.2877
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.655 0.536 0.438)

	Surface
	{
		SurfStyle       0.811992
		OceanStyle      0.317681
		Randomize      (-0.568, 0.838, 0.474)
		colorDistMagn   0.481368
		colorDistFreq   0.0548263
		detailScale     273.965
		colorConversion true
		snowLevel       2
		tropicLatitude  0.990815
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.640609
		terraceProb     0.70404
		erosion         0
		montesMagn      0.538056
		montesFreq      2.91206
		montesSpiky     0.899682
		montesFraction  0.577952
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.186992
		hillsFraction   0.508995
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230389
		craterFreq      0.226178
		craterDensity   0.779382
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.430308
		volcanoTemp     1572.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.256, 0.182, 0.123, 0.000)
		colorShelf     (0.262, 0.188, 0.140, 0.000)
		colorBeach     (0.308, 0.220, 0.166, 0.000)
		colorDesert    (0.334, 0.236, 0.162, 0.000)
		colorLowland   (0.367, 0.252, 0.184, 0.000)
		colorUpland    (0.406, 0.305, 0.223, 0.000)
		colorRock      (0.439, 0.332, 0.241, 0.000)
		colorSnow      (0.478, 0.354, 0.254, 1.000)
		BumpHeight      9.02961
		BumpOffset      1.80592
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.66056
		Period          6.46382
		Eccentricity    0.41637
		Inclination     -86.6036
		AscendingNode   -97.0136
		ArgOfPericenter 156.435
		MeanAnomaly     37.7981
	}
}

DwarfMoon	"Eadu System 6.D57"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            6.01333e-010
	Radius          15.2808
	InertiaMoment   0.398925

	RotationPeriod  1555.52
	Obliquity       -116.727
	EqAscendNode    -103.417
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.810 0.744 0.718)

	Surface
	{
		SurfStyle       0.713655
		OceanStyle      0.777806
		Randomize      (0.272, 0.792, -0.207)
		colorDistMagn   0.437577
		colorDistFreq   0.203041
		detailScale     417.267
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997437
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.522389
		terraceProb     0.205215
		erosion         0
		montesMagn      0.562995
		montesFreq      2.83247
		montesSpiky     0.991179
		montesFraction  0.24519
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.388274
		hillsFraction   0.585529
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220327
		craterFreq      0.158929
		craterDensity   1.04019
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.43653
		volcanoTemp     1770.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.316, 0.253, 0.201, 0.000)
		colorShelf     (0.324, 0.260, 0.230, 0.000)
		colorBeach     (0.381, 0.305, 0.273, 0.000)
		colorDesert    (0.413, 0.327, 0.266, 0.000)
		colorLowland   (0.454, 0.349, 0.301, 0.000)
		colorUpland    (0.502, 0.424, 0.366, 0.000)
		colorRock      (0.543, 0.461, 0.395, 0.000)
		colorSnow      (0.591, 0.491, 0.416, 1.000)
		BumpHeight      13.7527
		BumpOffset      2.75054
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.661209
		Period          6.47335
		Eccentricity    0.0592225
		Inclination     -77.0491
		AscendingNode   -101.42
		ArgOfPericenter -130.891
		MeanAnomaly     -86.1932
	}
}

DwarfMoon	"Eadu System 6.D58"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            8.77885e-010
	Radius          14.2662
	InertiaMoment   0.399852

	RotationPeriod  1218.5
	Obliquity       41.8856
	EqAscendNode    58.5071
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.601 0.595 0.593)

	Surface
	{
		SurfStyle       0.761299
		OceanStyle      0.815172
		Randomize      (0.281, -0.638, -0.162)
		colorDistMagn   0.819004
		colorDistFreq   0.176594
		detailScale     389.561
		colorConversion true
		snowLevel       2
		tropicLatitude  0.579364
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.411512
		terraceProb     0.104972
		erosion         0
		montesMagn      0.428393
		montesFreq      3.73384
		montesSpiky     0.855478
		montesFraction  0.675954
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.455055
		hillsFraction   0.540648
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.192348
		craterFreq      0.272944
		craterDensity   0.821682
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.454386
		volcanoTemp     1357.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.234, 0.202, 0.166, 0.000)
		colorShelf     (0.240, 0.208, 0.190, 0.000)
		colorBeach     (0.282, 0.244, 0.225, 0.000)
		colorDesert    (0.306, 0.262, 0.219, 0.000)
		colorLowland   (0.336, 0.280, 0.249, 0.000)
		colorUpland    (0.372, 0.339, 0.302, 0.000)
		colorRock      (0.402, 0.369, 0.326, 0.000)
		colorSnow      (0.438, 0.393, 0.344, 1.000)
		BumpHeight      12.8395
		BumpOffset      2.56791
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.661757
		Period          6.4814
		Eccentricity    0.117895
		Inclination     -12.4334
		AscendingNode   52.2272
		ArgOfPericenter 21.4233
		MeanAnomaly     47.2186
	}
}

DwarfMoon	"Eadu System 6.D59"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            1.26268e-009
	Radius          15.3623
	InertiaMoment   0.397887

	RotationPeriod  1096.36
	Obliquity       -15.6005
	EqAscendNode    -134.288
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.617 0.611 0.606)

	Surface
	{
		SurfStyle       0.666764
		OceanStyle      0.121147
		Randomize      (-0.118, 0.526, -0.026)
		colorDistMagn   0.413861
		colorDistFreq   0.136021
		detailScale     419.493
		colorConversion true
		snowLevel       2
		tropicLatitude  0.233173
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.53623
		terraceProb     0.436729
		erosion         0
		montesMagn      0.464934
		montesFreq      2.8998
		montesSpiky     0.977745
		montesFraction  0.488427
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.525809
		hillsFraction   0.608115
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249704
		craterFreq      0.212386
		craterDensity   0.785995
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.592005
		volcanoTemp     1426.25
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.241, 0.208, 0.170, 0.000)
		colorShelf     (0.247, 0.214, 0.194, 0.000)
		colorBeach     (0.290, 0.251, 0.230, 0.000)
		colorDesert    (0.315, 0.269, 0.224, 0.000)
		colorLowland   (0.346, 0.287, 0.254, 0.000)
		colorUpland    (0.383, 0.348, 0.309, 0.000)
		colorRock      (0.413, 0.379, 0.333, 0.000)
		colorSnow      (0.450, 0.404, 0.351, 1.000)
		BumpHeight      13.8261
		BumpOffset      2.76521
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.662425
		Period          6.49122
		Eccentricity    0.424027
		Inclination     -3.91851
		AscendingNode   -128.845
		ArgOfPericenter 52.6731
		MeanAnomaly     -121.165
	}
}

DwarfMoon	"Eadu System 6.D60"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            1.79372e-009
	Radius          16.586
	InertiaMoment   0.399067

	RotationPeriod  998.204
	Obliquity       71.9204
	EqAscendNode    -113.272
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.535 0.531 0.523)

	Surface
	{
		SurfStyle       0.422763
		OceanStyle      0.0629317
		Randomize      (-0.546, -0.256, 0.114)
		colorDistMagn   0.866608
		colorDistFreq   0.0337501
		detailScale     452.908
		colorConversion true
		snowLevel       2
		tropicLatitude  0.822699
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.68865
		terraceProb     0.596517
		erosion         0
		montesMagn      0.358209
		montesFreq      2.72506
		montesSpiky     0.970169
		montesFraction  0.424698
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.610355
		hillsFraction   0.650939
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236681
		craterFreq      0.203781
		craterDensity   0.808624
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.516953
		volcanoTemp     1424.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.214, 0.212, 0.209, 0.000)
		colorShelf     (0.227, 0.226, 0.222, 0.000)
		colorBeach     (0.241, 0.239, 0.236, 0.000)
		colorDesert    (0.254, 0.252, 0.249, 0.000)
		colorLowland   (0.267, 0.265, 0.262, 0.000)
		colorUpland    (0.281, 0.279, 0.275, 0.000)
		colorRock      (0.294, 0.292, 0.288, 0.000)
		colorSnow      (0.307, 0.305, 0.301, 1.000)
		BumpHeight      14.9274
		BumpOffset      2.98548
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.662862
		Period          6.49764
		Eccentricity    0.234216
		Inclination     69.6046
		AscendingNode   -121.106
		ArgOfPericenter 44.5669
		MeanAnomaly     80.126
	}
}

DwarfMoon	"Eadu System 6.D61"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            2.52183e-009
	Radius          17.3653
	InertiaMoment   0.399977

	RotationPeriod  886.037
	Obliquity       18.6989
	EqAscendNode    -66.9742
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.696 0.610 0.523)

	Surface
	{
		SurfStyle       0.915146
		OceanStyle      0.944562
		Randomize      (-0.425, 0.861, -0.509)
		colorDistMagn   0.940888
		colorDistFreq   0.193364
		detailScale     474.19
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999832
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.429306
		terraceProb     0.651738
		erosion         0
		montesMagn      0.420642
		montesFreq      2.97444
		montesSpiky     0.84368
		montesFraction  0.475948
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.762948
		hillsFraction   0.650714
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228321
		craterFreq      0.174725
		craterDensity   0.974321
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.476896
		volcanoTemp     1520.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.236, 0.213, 0.209, 0.050)
		colorShelf     (0.278, 0.250, 0.241, 0.040)
		colorBeach     (0.320, 0.287, 0.272, 0.030)
		colorDesert    (0.362, 0.323, 0.309, 0.020)
		colorLowland   (0.403, 0.360, 0.340, 0.030)
		colorUpland    (0.445, 0.396, 0.371, 0.050)
		colorRock      (0.487, 0.433, 0.413, 0.020)
		colorSnow      (0.487, 0.433, 0.413, 1.000)
		BumpHeight      15.6288
		BumpOffset      3.12576
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.663089
		Period          6.50098
		Eccentricity    0.328647
		Inclination     82.3844
		AscendingNode   -63.0852
		ArgOfPericenter 38.4936
		MeanAnomaly     174.553
	}
}

DwarfMoon	"Eadu System 6.D62"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            3.51498e-009
	Radius          22.8552
	InertiaMoment   0.398094

	RotationPeriod  982.019
	Obliquity       -3.83303
	EqAscendNode    23.1592
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.778 0.735 0.683)

	Surface
	{
		SurfStyle       0.907376
		OceanStyle      0.589418
		Randomize      (-0.840, -0.849, -0.721)
		colorDistMagn   0.867503
		colorDistFreq   0.274346
		detailScale     624.099
		colorConversion true
		snowLevel       2
		tropicLatitude  0.97733
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.384454
		terraceProb     0.297471
		erosion         0
		montesMagn      0.401332
		montesFreq      2.88609
		montesSpiky     0.88002
		montesFraction  0.644208
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.10477
		hillsFraction   0.435936
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262816
		craterFreq      0.237889
		craterDensity   0.996441
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.450771
		volcanoTemp     1706.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.265, 0.257, 0.273, 0.050)
		colorShelf     (0.311, 0.301, 0.314, 0.040)
		colorBeach     (0.358, 0.345, 0.355, 0.030)
		colorDesert    (0.405, 0.389, 0.403, 0.020)
		colorLowland   (0.451, 0.434, 0.444, 0.030)
		colorUpland    (0.498, 0.478, 0.485, 0.050)
		colorRock      (0.545, 0.522, 0.539, 0.020)
		colorSnow      (0.545, 0.522, 0.539, 1.000)
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
		SemiMajorAxis   0.663305
		Period          6.50416
		Eccentricity    0.26598
		Inclination     -74.1441
		AscendingNode   18.7713
		ArgOfPericenter -174.712
		MeanAnomaly     -38.5965
	}
}

DwarfMoon	"Eadu System 6.D63"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            4.86431e-009
	Radius          24.223
	InertiaMoment   0.399204

	RotationPeriod  888.979
	Obliquity       -96.7352
	EqAscendNode    -170.594
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.630 0.543 0.507)

	Surface
	{
		SurfStyle       0.462317
		OceanStyle      0.286371
		Randomize      (-0.791, 0.759, 0.062)
		colorDistMagn   0.591468
		colorDistFreq   0.359594
		detailScale     661.451
		colorConversion true
		snowLevel       2
		tropicLatitude  0.63152
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.29072
		terraceProb     0.115919
		erosion         0
		montesMagn      0.394621
		montesFreq      2.5852
		montesSpiky     0.8342
		montesFraction  0.383257
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.26138
		hillsFraction   0.726615
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232316
		craterFreq      0.274322
		craterDensity   0.839289
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.457195
		volcanoTemp     1550.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.252, 0.217, 0.203, 0.000)
		colorShelf     (0.268, 0.231, 0.216, 0.000)
		colorBeach     (0.284, 0.245, 0.228, 0.000)
		colorDesert    (0.299, 0.258, 0.241, 0.000)
		colorLowland   (0.315, 0.272, 0.254, 0.000)
		colorUpland    (0.331, 0.285, 0.266, 0.000)
		colorRock      (0.347, 0.299, 0.279, 0.000)
		colorSnow      (0.362, 0.312, 0.292, 1.000)
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
		SemiMajorAxis   0.663514
		Period          6.50724
		Eccentricity    0.294481
		Inclination     -61.0454
		AscendingNode   -163.259
		ArgOfPericenter -72.5038
		MeanAnomaly     62.1134
	}
}

DwarfMoon	"Eadu System 6.D64"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            6.69229e-009
	Radius          25.8796
	InertiaMoment   0.395904

	RotationPeriod  808.747
	Obliquity       101.259
	EqAscendNode    -158.095
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.736 0.734 0.733)

	Surface
	{
		SurfStyle       0.630081
		OceanStyle      0.621868
		Randomize      (-0.003, -0.636, 0.818)
		colorDistMagn   0.806447
		colorDistFreq   0.249883
		detailScale     706.686
		colorConversion true
		snowLevel       2
		tropicLatitude  0.465675
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.465728
		terraceProb     0.169584
		erosion         0
		montesMagn      0.366671
		montesFreq      2.88931
		montesSpiky     0.954607
		montesFraction  0.477004
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.74961
		hillsFraction   0.516839
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.206598
		craterFreq      0.197836
		craterDensity   0.971273
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.431758
		volcanoTemp     1562.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.287, 0.250, 0.205, 0.000)
		colorShelf     (0.294, 0.257, 0.235, 0.000)
		colorBeach     (0.346, 0.301, 0.279, 0.000)
		colorDesert    (0.375, 0.323, 0.271, 0.000)
		colorLowland   (0.412, 0.345, 0.308, 0.000)
		colorUpland    (0.456, 0.419, 0.374, 0.000)
		colorRock      (0.493, 0.455, 0.403, 0.000)
		colorSnow      (0.537, 0.485, 0.425, 1.000)
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
		SemiMajorAxis   0.663949
		Period          6.51363
		Eccentricity    0.419404
		Inclination     82.9511
		AscendingNode   -159.036
		ArgOfPericenter 174.141
		MeanAnomaly     149.099
	}
}

DwarfMoon	"Eadu System 6.D65"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            9.16401e-009
	Radius          27.1739
	InertiaMoment   0.398283

	RotationPeriod  729.956
	Obliquity       -45.412
	EqAscendNode    -9.69599
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.686 0.683 0.678)

	Surface
	{
		SurfStyle       0.324703
		OceanStyle      0.0654433
		Randomize      (-0.820, 0.637, -1.000)
		colorDistMagn   0.322307
		colorDistFreq   0.339474
		detailScale     742.029
		colorConversion true
		snowLevel       2
		tropicLatitude  0.684026
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.576792
		terraceProb     0.207543
		erosion         0
		montesMagn      0.472325
		montesFreq      2.64275
		montesSpiky     0.995707
		montesFraction  0.906232
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.1805
		hillsFraction   0.586738
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258341
		craterFreq      0.226406
		craterDensity   0.929562
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.543961
		volcanoTemp     1498.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.274, 0.273, 0.271, 0.000)
		colorShelf     (0.291, 0.290, 0.288, 0.000)
		colorBeach     (0.309, 0.307, 0.305, 0.000)
		colorDesert    (0.326, 0.324, 0.322, 0.000)
		colorLowland   (0.343, 0.342, 0.339, 0.000)
		colorUpland    (0.360, 0.359, 0.356, 0.000)
		colorRock      (0.377, 0.376, 0.373, 0.000)
		colorSnow      (0.394, 0.393, 0.390, 1.000)
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
		SemiMajorAxis   0.664436
		Period          6.5208
		Eccentricity    0.126623
		Inclination     2.28168
		AscendingNode   -8.91487
		ArgOfPericenter -172.01
		MeanAnomaly     -102.917
	}
}

DwarfMoon	"Eadu System 6.D66"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            1.25029e-008
	Radius          35.2401
	InertiaMoment   0.399337

	RotationPeriod  809.234
	Obliquity       12.1409
	EqAscendNode    -92.1086
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.600 0.593 0.590)

	Surface
	{
		SurfStyle       0.954616
		OceanStyle      0.312072
		Randomize      (-0.747, -0.773, -0.023)
		colorDistMagn   0.938183
		colorDistFreq   0.597015
		detailScale     962.29
		colorConversion true
		snowLevel       2
		tropicLatitude  0.707917
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.322516
		terraceProb     0.17832
		erosion         0
		montesMagn      0.62673
		montesFreq      2.78299
		montesSpiky     0.986845
		montesFraction  0.72515
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.18377
		hillsFraction   0.876258
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.27376
		craterFreq      0.162633
		craterDensity   1.0478
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.476537
		volcanoTemp     1569.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.204, 0.208, 0.236, 0.050)
		colorShelf     (0.240, 0.243, 0.272, 0.040)
		colorBeach     (0.276, 0.279, 0.307, 0.030)
		colorDesert    (0.312, 0.315, 0.348, 0.020)
		colorLowland   (0.348, 0.350, 0.384, 0.030)
		colorUpland    (0.384, 0.386, 0.419, 0.050)
		colorRock      (0.420, 0.421, 0.466, 0.020)
		colorSnow      (0.420, 0.421, 0.466, 1.000)
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
		SemiMajorAxis   0.665084
		Period          6.53034
		Eccentricity    0.262518
		Inclination     45.8366
		AscendingNode   -99.6044
		ArgOfPericenter -14.6852
		MeanAnomaly     136.923
	}
}

DwarfMoon	"Eadu System 6.D67"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            1.70126e-008
	Radius          36.9896
	InertiaMoment   0.396613

	RotationPeriod  727.83
	Obliquity       109.801
	EqAscendNode    -11.7563
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.621 0.616 0.612)

	Surface
	{
		SurfStyle       0.107072
		OceanStyle      0.611743
		Randomize      (0.552, 0.836, -0.981)
		colorDistMagn   0.536158
		colorDistFreq   1.04861
		detailScale     1010.06
		colorConversion true
		snowLevel       2
		tropicLatitude  0.369371
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.650653
		terraceProb     0.229083
		erosion         0
		montesMagn      0.61533
		montesFreq      1.94913
		montesSpiky     0.858271
		montesFraction  0.4709
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.77298
		hillsFraction   0.712476
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.279773
		craterFreq      0.176624
		craterDensity   0.766873
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.472032
		volcanoTemp     1695.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.248, 0.246, 0.245, 0.000)
		colorShelf     (0.264, 0.262, 0.260, 0.000)
		colorBeach     (0.279, 0.277, 0.275, 0.000)
		colorDesert    (0.295, 0.292, 0.291, 0.000)
		colorLowland   (0.310, 0.308, 0.306, 0.000)
		colorUpland    (0.326, 0.323, 0.321, 0.000)
		colorRock      (0.341, 0.339, 0.337, 0.000)
		colorSnow      (0.357, 0.354, 0.352, 1.000)
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
		SemiMajorAxis   0.665506
		Period          6.53656
		Eccentricity    0.0701044
		Inclination     49.4998
		AscendingNode   -7.52918
		ArgOfPericenter -31.8348
		MeanAnomaly     -108.058
	}
}

DwarfMoon	"Eadu System 6.D68"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            2.31081e-008
	Radius          39.3443
	InertiaMoment   0.398457

	RotationPeriod  667.256
	Obliquity       14.2375
	EqAscendNode    69.3627
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.438 0.434 0.429)

	Surface
	{
		SurfStyle       0.326411
		OceanStyle      0.330261
		Randomize      (0.565, -0.374, -0.014)
		colorDistMagn   0.365878
		colorDistFreq   0.484045
		detailScale     1074.36
		colorConversion true
		snowLevel       2
		tropicLatitude  0.469489
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.606023
		terraceProb     0.548299
		erosion         0
		montesMagn      0.248709
		montesFreq      3.05866
		montesSpiky     0.97344
		montesFraction  0.616932
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.70382
		hillsFraction   0.706157
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235747
		craterFreq      0.226452
		craterDensity   0.795881
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.47262
		volcanoTemp     1464.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.175, 0.174, 0.172, 0.000)
		colorShelf     (0.186, 0.185, 0.182, 0.000)
		colorBeach     (0.197, 0.195, 0.193, 0.000)
		colorDesert    (0.208, 0.206, 0.204, 0.000)
		colorLowland   (0.219, 0.217, 0.215, 0.000)
		colorUpland    (0.230, 0.228, 0.225, 0.000)
		colorRock      (0.241, 0.239, 0.236, 0.000)
		colorSnow      (0.252, 0.250, 0.247, 1.000)
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
		SemiMajorAxis   0.665888
		Period          6.5422
		Eccentricity    0.381419
		Inclination     19.9375
		AscendingNode   70.3128
		ArgOfPericenter -50.8715
		MeanAnomaly     96.7527
	}
}

DwarfMoon	"Eadu System 6.D69"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            3.13598e-008
	Radius          41.4385
	InertiaMoment   0.399468

	RotationPeriod  605.377
	Obliquity       -12.0643
	EqAscendNode    -24.6826
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.788 0.674 0.620)

	Surface
	{
		SurfStyle       0.725889
		OceanStyle      0.174301
		Randomize      (0.466, -0.571, 0.255)
		colorDistMagn   0.112166
		colorDistFreq   0.719573
		detailScale     1131.55
		colorConversion true
		snowLevel       2
		tropicLatitude  0.165807
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.502039
		terraceProb     0.209099
		erosion         0
		montesMagn      0.600543
		montesFreq      2.71343
		montesSpiky     0.943159
		montesFraction  0.294441
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.50125
		hillsFraction   0.620025
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.268846
		craterFreq      0.236681
		craterDensity   0.920382
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50625
		volcanoTemp     1361.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.307, 0.229, 0.174, 0.000)
		colorShelf     (0.315, 0.236, 0.198, 0.000)
		colorBeach     (0.371, 0.276, 0.236, 0.000)
		colorDesert    (0.402, 0.296, 0.229, 0.000)
		colorLowland   (0.442, 0.317, 0.260, 0.000)
		colorUpland    (0.489, 0.384, 0.316, 0.000)
		colorRock      (0.528, 0.418, 0.341, 0.000)
		colorSnow      (0.576, 0.445, 0.360, 1.000)
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
		SemiMajorAxis   0.666186
		Period          6.54659
		Eccentricity    0.466151
		Inclination     19.6375
		AscendingNode   -22.0094
		ArgOfPericenter 88.5975
		MeanAnomaly     -41.4127
	}
}

DwarfMoon	"Eadu System 6.D70"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            4.2557e-008
	Radius          53.635
	InertiaMoment   0.39705

	RotationPeriod  669.081
	Obliquity       -4.50583
	EqAscendNode    -164.615
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.763 0.732 0.694)

	Surface
	{
		SurfStyle       0.660754
		OceanStyle      0.23837
		Randomize      (-0.063, -0.565, 0.055)
		colorDistMagn   0.626812
		colorDistFreq   1.45206
		detailScale     1464.59
		colorConversion true
		snowLevel       2
		tropicLatitude  0.382235
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.283423
		terraceProb     0.171125
		erosion         0
		montesMagn      0.57291
		montesFreq      2.30564
		montesSpiky     0.894761
		montesFraction  0.412265
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.88023
		hillsFraction   0.861539
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231983
		craterFreq      0.176362
		craterDensity   0.976661
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.461686
		volcanoTemp     1397.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.298, 0.249, 0.194, 0.000)
		colorShelf     (0.305, 0.256, 0.222, 0.000)
		colorBeach     (0.359, 0.300, 0.264, 0.000)
		colorDesert    (0.389, 0.322, 0.257, 0.000)
		colorLowland   (0.427, 0.344, 0.292, 0.000)
		colorUpland    (0.473, 0.417, 0.354, 0.000)
		colorRock      (0.511, 0.454, 0.382, 0.000)
		colorSnow      (0.557, 0.483, 0.403, 1.000)
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
		SemiMajorAxis   0.666755
		Period          6.55497
		Eccentricity    0.0365231
		Inclination     -26.8017
		AscendingNode   -165.219
		ArgOfPericenter 144.536
		MeanAnomaly     1.12663
	}
}

DwarfMoon	"Eadu System 6.D71"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            5.78007e-008
	Radius          55.9541
	InertiaMoment   0.39862

	RotationPeriod  601.576
	Obliquity       -148.837
	EqAscendNode    -159.311
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.462 0.460 0.457)

	Surface
	{
		SurfStyle       0.851969
		OceanStyle      0.522468
		Randomize      (-0.178, 0.170, -0.863)
		colorDistMagn   0.836638
		colorDistFreq   2.14101
		detailScale     1527.92
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997105
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.539559
		terraceProb     0.55075
		erosion         0
		montesMagn      0.469191
		montesFreq      3.43646
		montesSpiky     0.999341
		montesFraction  0.295006
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.87506
		hillsFraction   0.580467
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256935
		craterFreq      0.250273
		craterDensity   0.944873
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.551666
		volcanoTemp     1369.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.157, 0.161, 0.183, 0.050)
		colorShelf     (0.185, 0.188, 0.210, 0.040)
		colorBeach     (0.212, 0.216, 0.238, 0.030)
		colorDesert    (0.240, 0.244, 0.270, 0.020)
		colorLowland   (0.268, 0.271, 0.297, 0.030)
		colorUpland    (0.296, 0.299, 0.325, 0.050)
		colorRock      (0.323, 0.326, 0.361, 0.020)
		colorSnow      (0.323, 0.326, 0.361, 1.000)
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
		SemiMajorAxis   0.667168
		Period          6.56107
		Eccentricity    0.408428
		Inclination     -65.132
		AscendingNode   -158.192
		ArgOfPericenter -85.2565
		MeanAnomaly     -89.173
	}
}

DwarfMoon	"Eadu System 6.D72"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            7.86396e-008
	Radius          59.5181
	InertiaMoment   0.399597

	RotationPeriod  550.277
	Obliquity       -32.3749
	EqAscendNode    23.3429
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.487 0.483 0.480)

	Surface
	{
		SurfStyle       0.809093
		OceanStyle      0.277562
		Randomize      (0.178, -0.559, 0.836)
		colorDistMagn   0.666901
		colorDistFreq   2.43237
		detailScale     1625.24
		colorConversion true
		snowLevel       2
		tropicLatitude  0.921919
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.62562
		terraceProb     0.427199
		erosion         0
		montesMagn      0.574885
		montesFreq      2.97051
		montesSpiky     0.785744
		montesFraction  0.162591
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.75297
		hillsFraction   0.889125
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254731
		craterFreq      0.162156
		craterDensity   0.776397
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.450735
		volcanoTemp     1287.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.190, 0.164, 0.134, 0.000)
		colorShelf     (0.195, 0.169, 0.154, 0.000)
		colorBeach     (0.229, 0.198, 0.182, 0.000)
		colorDesert    (0.248, 0.213, 0.177, 0.000)
		colorLowland   (0.273, 0.227, 0.201, 0.000)
		colorUpland    (0.302, 0.276, 0.245, 0.000)
		colorRock      (0.326, 0.300, 0.264, 0.000)
		colorSnow      (0.356, 0.319, 0.278, 1.000)
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
		SemiMajorAxis   0.667464
		Period          6.56543
		Eccentricity    0.318809
		Inclination     -82.6666
		AscendingNode   21.1851
		ArgOfPericenter 151.623
		MeanAnomaly     -174.251
	}
}

DwarfMoon	"Eadu System 6.D73"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            1.07273e-007
	Radius          63.0299
	InertiaMoment   0.397379

	RotationPeriod  498.485
	Obliquity       66.0487
	EqAscendNode    -121.91
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.790 0.787 0.786)

	Surface
	{
		SurfStyle       0.0237473
		OceanStyle      0.194762
		Randomize      (-0.172, -0.898, 0.411)
		colorDistMagn   0.401482
		colorDistFreq   2.19119
		detailScale     1721.14
		colorConversion true
		snowLevel       2
		tropicLatitude  0.909166
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.419961
		terraceProb     0.738506
		erosion         0
		montesMagn      0.623699
		montesFreq      2.99118
		montesSpiky     0.969058
		montesFraction  0.598536
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.0178
		hillsFraction   0.657654
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.21323
		craterFreq      0.251498
		craterDensity   0.758971
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.492156
		volcanoTemp     1870.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.316, 0.315, 0.314, 0.000)
		colorShelf     (0.336, 0.335, 0.334, 0.000)
		colorBeach     (0.356, 0.354, 0.353, 0.000)
		colorDesert    (0.375, 0.374, 0.373, 0.000)
		colorLowland   (0.395, 0.394, 0.393, 0.000)
		colorUpland    (0.415, 0.413, 0.412, 0.000)
		colorRock      (0.435, 0.433, 0.432, 0.000)
		colorSnow      (0.454, 0.453, 0.452, 1.000)
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
		SemiMajorAxis   0.668107
		Period          6.57491
		Eccentricity    0.399294
		Inclination     1.759
		AscendingNode   -112.344
		ArgOfPericenter -10.5567
		MeanAnomaly     26.8846
	}
}

DwarfMoon	"Eadu System 6.D74"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            1.4686e-007
	Radius          82.2236
	InertiaMoment   0.398774

	RotationPeriod  555.637
	Obliquity       -10.7882
	EqAscendNode    -148.556
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.730 0.728 0.727)

	Surface
	{
		SurfStyle       0.39608
		OceanStyle      0.811343
		Randomize      (-0.650, 0.448, 0.150)
		colorDistMagn   0.426087
		colorDistFreq   4.33001
		detailScale     2245.25
		colorConversion true
		snowLevel       2
		tropicLatitude  0.101212
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.597231
		terraceProb     0.331415
		erosion         0
		montesMagn      0.62637
		montesFreq      3.16063
		montesSpiky     0.935315
		montesFraction  0.643726
		dunesFraction   0
		hillsMagn       0
		hillsFreq       17.0206
		hillsFraction   0.699562
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231606
		craterFreq      0.156767
		craterDensity   0.929083
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.558315
		volcanoTemp     1536.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.292, 0.291, 0.291, 0.000)
		colorShelf     (0.310, 0.310, 0.309, 0.000)
		colorBeach     (0.329, 0.328, 0.327, 0.000)
		colorDesert    (0.347, 0.346, 0.345, 0.000)
		colorLowland   (0.365, 0.364, 0.364, 0.000)
		colorUpland    (0.383, 0.382, 0.382, 0.000)
		colorRock      (0.402, 0.401, 0.400, 0.000)
		colorSnow      (0.420, 0.419, 0.418, 1.000)
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
		SemiMajorAxis   0.66869
		Period          6.58352
		Eccentricity    0.306075
		Inclination     -9.07631
		AscendingNode   -147.268
		ArgOfPericenter -115.892
		MeanAnomaly     111.987
	}
}

DwarfMoon	"Eadu System 6.D75"
{
	ParentBody     "Eadu System 6"
	Class	       "Asteroid"

	Mass            2.01992e-007
	Radius          85.465
	InertiaMoment   0.399723

	RotationPeriod  494.123
	Obliquity       4.80867
	EqAscendNode    43.327
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.603 0.596 0.592)

	Surface
	{
		SurfStyle       0.395144
		OceanStyle      0.614681
		Randomize      (0.808, -0.244, -0.364)
		colorDistMagn   0.147141
		colorDistFreq   1.65393
		detailScale     2333.76
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0871269
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.546836
		terraceProb     0.324108
		erosion         0
		montesMagn      0.435585
		montesFreq      3.74746
		montesSpiky     0.930061
		montesFraction  0.527084
		dunesFraction   0
		hillsMagn       0
		hillsFreq       13.4292
		hillsFraction   0.525974
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255919
		craterFreq      0.230927
		craterDensity   0.82466
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.489943
		volcanoTemp     1535.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.241, 0.238, 0.237, 0.000)
		colorShelf     (0.256, 0.253, 0.252, 0.000)
		colorBeach     (0.272, 0.268, 0.267, 0.000)
		colorDesert    (0.287, 0.283, 0.281, 0.000)
		colorLowland   (0.302, 0.298, 0.296, 0.000)
		colorUpland    (0.317, 0.313, 0.311, 0.000)
		colorRock      (0.332, 0.328, 0.326, 0.000)
		colorSnow      (0.347, 0.343, 0.341, 1.000)
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
		SemiMajorAxis   0.669156
		Period          6.59041
		Eccentricity    0.006047
		Inclination     -7.47735
		AscendingNode   41.3383
		ArgOfPericenter -14.5804
		MeanAnomaly     171.897
	}
}

DwarfPlanet	"Eadu System 7"
{
	ParentBody     "Eadu System"
	Class	       "IceWorld"

	Mass            0.00505041
	Radius          1412.65
	InertiaMoment   0.391722

	Oblateness      0.00191001

	RotationPeriod  52.0211
	Obliquity       44.0872
	EqAscendNode    138.579
	//Precession      0

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.663 0.604 0.560)

	Surface
	{
		SurfStyle       0.358329
		OceanStyle      0.530134
		Randomize      (-0.746, 0.670, 0.323)
		colorDistMagn   0.0523075
		colorDistFreq   125.868
		detailScale     3633.42
		colorConversion true
		drivenDarkening 0
		seaLevel        0.135598
		snowLevel       2
		tropicLatitude  0.683248
		icecapLatitude  1
		icecapHeight    0.135598
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.69008
		venusFreq       1.31803
		venusMagn       0
		mareFreq        0.696738
		mareDensity     0.00140646
		terraceProb     0.385901
		erosion         0
		montesMagn      0.0612172
		montesFreq      45.4627
		montesSpiky     0.924613
		montesFraction  0.774895
		dunesMagn       0.0541095
		dunesFreq       1872.49
		dunesFraction   0.753014
		hillsMagn       0.111796
		hillsFreq       185.694
		hillsFraction   0.446857
		hills2Fraction  0.11774
		riversMagn      55.5935
		riversFreq      2.62542
		riversSin       6.12142
		riversOctaves   0
		canyonsMagn     0.467976
		canyonsFreq     0.520723
		canyonFraction  0
		cracksMagn      0.0529529
		cracksFreq      0.564568
		cracksOctaves   1
		craterMagn      0.597449
		craterFreq      5.01869
		craterDensity   0.856431
		craterOctaves   11
		craterRayedFactor 0.108964
		volcanoMagn     0.143212
		volcanoFreq     0.569918
		volcanoDensity  0.216251
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.255094
		volcanoRadius   0.12032
		volcanoTemp     1267.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.663, 0.604, 0.560, 0.500)
		colorShelf     (0.630, 0.574, 0.532, 0.500)
		colorBeach     (0.464, 0.423, 0.392, 0.750)
		colorDesert    (0.564, 0.513, 0.476, 1.000)
		colorLowland   (0.584, 0.531, 0.492, 1.000)
		colorUpland    (0.617, 0.562, 0.520, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.584, 0.531, 0.492, 1.000)
		colorUpPlants  (0.617, 0.562, 0.520, 1.000)
		BumpHeight      20
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
		SemiMajorAxis   81.8977
		Period          339.268
		Eccentricity    0.0258983
		Inclination     -1.84363
		AscendingNode   142.731
		ArgOfPericenter 218.836
		MeanAnomaly     215.911
	}
}

DwarfMoon	"Eadu System 7.D1"
{
	ParentBody     "Eadu System 7"
	Class	       "Asteroid"

	Mass            1.28993e-007
	Radius          38.8728
	InertiaMoment   0.398112

	Oblateness      0.0328829

	Obliquity       -1.13984
	EqAscendNode    -49.2749
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.665 0.664 0.662)

	Surface
	{
		SurfStyle       0.266253
		OceanStyle      0.467365
		Randomize      (0.537, 0.862, 0.600)
		colorDistMagn   0.189787
		colorDistFreq   0.731025
		detailScale     1061.49
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0361582
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.637155
		terraceProb     0.176185
		erosion         0
		montesMagn      0.586258
		montesFreq      3.34551
		montesSpiky     0.953492
		montesFraction  0.716975
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.50546
		hillsFraction   0.455766
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219518
		craterFreq      0.20398
		craterDensity   0.649313
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.498726
		volcanoTemp     1459.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.266, 0.266, 0.265, 0.000)
		colorShelf     (0.283, 0.282, 0.281, 0.000)
		colorBeach     (0.299, 0.299, 0.298, 0.000)
		colorDesert    (0.316, 0.315, 0.314, 0.000)
		colorLowland   (0.333, 0.332, 0.331, 0.000)
		colorUpland    (0.349, 0.348, 0.347, 0.000)
		colorRock      (0.366, 0.365, 0.364, 0.000)
		colorSnow      (0.383, 0.382, 0.380, 1.000)
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
		SemiMajorAxis   2.95533e-005
		Period          0.00130743
		Eccentricity    0.0210116
		Inclination     -1.13984
		AscendingNode   -49.2749
		ArgOfPericenter -95.4982
		MeanAnomaly     -6.23324
	}
}

DwarfMoon	"Eadu System 7.D2"
{
	ParentBody     "Eadu System 7"
	Class	       "Asteroid"

	Mass            4.54629e-007
	Radius          67.9615
	InertiaMoment   0.397209

	Oblateness      0.0187455

	Obliquity       1.38379
	EqAscendNode    167.795
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.513 0.509 0.505)

	Surface
	{
		SurfStyle       0.540025
		OceanStyle      0.746928
		Randomize      (-0.234, 0.504, -0.085)
		colorDistMagn   0.948127
		colorDistFreq   1.17632
		detailScale     1855.8
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00513275
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.444725
		terraceProb     0.184554
		erosion         0
		montesMagn      0.394891
		montesFreq      2.06174
		montesSpiky     0.904629
		montesFraction  0.615995
		dunesFraction   0
		hillsMagn       0
		hillsFreq       12.1314
		hillsFraction   0.620062
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238
		craterFreq      0.277263
		craterDensity   0.927214
		craterOctaves   14
		volcanoActivity 0.062576
		volcanoFlows    0
		volcanoRadius   0.53687
		volcanoTemp     1307.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.200, 0.173, 0.141, 0.000)
		colorShelf     (0.205, 0.178, 0.162, 0.000)
		colorBeach     (0.241, 0.209, 0.192, 0.000)
		colorDesert    (0.262, 0.224, 0.187, 0.000)
		colorLowland   (0.287, 0.239, 0.212, 0.000)
		colorUpland    (0.318, 0.290, 0.258, 0.000)
		colorRock      (0.344, 0.316, 0.278, 0.000)
		colorSnow      (0.374, 0.336, 0.293, 1.000)
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
		SemiMajorAxis   4.09012e-005
		Period          0.00212863
		Eccentricity    0.0355276
		Inclination     1.38379
		AscendingNode   167.795
		ArgOfPericenter 128.064
		MeanAnomaly     -66.032
	}
}

Planet	"Eadu System 8"
{
	ParentBody     "Eadu System"
	Class	       "IceGiant"

	Mass            42.4429
	Radius          26773.9
	InertiaMoment   0.27832

	Oblateness      0.0336801

	RotationPeriod  9.06582
	Obliquity       33.2505
	EqAscendNode    122.656
	//Precession      0

	AlbedoBond      0.419351
	AlbedoGeom      0.503221
	Brightness      2

	Surface
	{
		SurfStyle       0.773043
		Randomize      (0.434, -0.119, 0.224)
		detailScale     68863.9
		colorConversion true
		tropicLatitude  0.557401
		icecapLatitude  1
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     5.86769
		stripeFluct     0.378625
		stripeTwist     12.1684
		cycloneMagn     10.5557
		cycloneFreq     1.15946
		cycloneDensity  0.160575
		cycloneOctaves  0
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
		BumpHeight      12.8868
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          38.3711
		Velocity        594.009
		BumpHeight      25.4852
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.06508
		mainOctaves     12
		Coverage        0.0967529
		stripeZones     5.86769
		stripeFluct     0.378625
		stripeTwist     12.1684
	}

	Clouds
	{
		Height          63.8574
		Velocity        640.689
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		ModulateColor  (1.000 1.000 1.000 0.605)
		mainFreq        1.06508
		mainOctaves     12
		Coverage        0.0967529
		stripeZones     5.86769
		stripeFluct     0.378625
		stripeTwist     12.1684
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          267.739
		Density         6765.58
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.00975503
		Saturation      0.713822

		Composition
		{
			H2    	92.8249
			He    	7.10257
			N2    	0.0331983
			CH4   	0.0298952
			O2    	0.00733081
			Ne    	0.00119882
			Ar    	0.000886511
		}
	}

	Aurora
	{
		Height      270.675
		NorthLat    50.2205
		NorthLon    101.679
		NorthRadius 7344.2
		NorthWidth  1950.34
		NorthRings  3
		NorthBright 1
		NorthParticles 10000
		SouthLat    -17.9282
		SouthLon    300.836
		SouthRadius 7931.17
		SouthWidth  2668.48
		SouthRings  2
		SouthBright 1
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	Rings
	{
		InnerRadius     40374.6
		OuterRadius     48828.1
		RotationPeriod  4.00593
		RotationOffset  0
		FrontBright     0.668911
		BackBright      0.642008
		Density         0.935549
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   160.074
		Period          927.065
		Eccentricity    0.0611609
		Inclination     -1.16192
		AscendingNode   121.847
		ArgOfPericenter 98.7361
		MeanAnomaly     133.31
	}
}

DwarfMoon	"Eadu System 8.D1"
{
	ParentBody     "Eadu System 8"
	Class	       "Asteroid"

	Mass            1.86027e-009
	Radius          16.5845
	InertiaMoment   0.399535

	Oblateness      0.249

	Obliquity       0.00617853
	EqAscendNode    173.934
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.599 0.593 0.589)

	Surface
	{
		SurfStyle       0.764591
		OceanStyle      0.330577
		Randomize      (0.691, 0.063, 0.906)
		colorDistMagn   0.0847174
		colorDistFreq   0.10497
		detailScale     452.868
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.354326
		terraceProb     0.263364
		erosion         0
		montesMagn      0.412742
		montesFreq      3.13179
		montesSpiky     0.957284
		montesFraction  0.401213
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.705139
		hillsFraction   0.362509
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234204
		craterFreq      0.177946
		craterDensity   0.914089
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.386553
		volcanoTemp     1460.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.234, 0.202, 0.165, 0.000)
		colorShelf     (0.240, 0.207, 0.189, 0.000)
		colorBeach     (0.282, 0.243, 0.224, 0.000)
		colorDesert    (0.306, 0.261, 0.218, 0.000)
		colorLowland   (0.336, 0.279, 0.247, 0.000)
		colorUpland    (0.372, 0.338, 0.301, 0.000)
		colorRock      (0.402, 0.368, 0.324, 0.000)
		colorSnow      (0.437, 0.391, 0.342, 1.000)
		BumpHeight      14.9261
		BumpOffset      2.98521
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.00045936
		Period          0.000873991
		Eccentricity    5.03556e-005
		Inclination     0.00617853
		AscendingNode   173.934
		ArgOfPericenter 133.25
		MeanAnomaly     90.3821
	}
}

DwarfMoon	"Eadu System 8.D2"
{
	ParentBody     "Eadu System 8"
	Class	       "Asteroid"

	Mass            2.61281e-009
	Radius          22.6841
	InertiaMoment   0.397229

	Oblateness      0.249

	Obliquity       0.00598986
	EqAscendNode    140.575
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.642 0.589 0.547)

	Surface
	{
		SurfStyle       0.951076
		OceanStyle      0.273189
		Randomize      (0.825, -0.828, -0.338)
		colorDistMagn   0.199514
		colorDistFreq   0.171764
		detailScale     619.427
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.287735
		terraceProb     0.501019
		erosion         0
		montesMagn      0.576355
		montesFreq      3.13643
		montesSpiky     0.877178
		montesFraction  0.588011
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.32791
		hillsFraction   0.628945
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259958
		craterFreq      0.221278
		craterDensity   0.75862
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.382952
		volcanoTemp     1227.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.218, 0.206, 0.219, 0.050)
		colorShelf     (0.257, 0.241, 0.251, 0.040)
		colorBeach     (0.296, 0.277, 0.284, 0.030)
		colorDesert    (0.334, 0.312, 0.322, 0.020)
		colorLowland   (0.373, 0.347, 0.355, 0.030)
		colorUpland    (0.411, 0.383, 0.388, 0.050)
		colorRock      (0.450, 0.418, 0.432, 0.020)
		colorSnow      (0.450, 0.418, 0.432, 1.000)
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
		SemiMajorAxis   0.000492776
		Period          0.000971071
		Eccentricity    2.83091e-005
		Inclination     0.00598986
		AscendingNode   140.575
		ArgOfPericenter 109.158
		MeanAnomaly     69.7321
	}
}

DwarfMoon	"Eadu System 8.D3"
{
	ParentBody     "Eadu System 8"
	Class	       "Asteroid"

	Mass            3.6388e-009
	Radius          22.7518
	InertiaMoment   0.398701

	Oblateness      0.249

	Obliquity       -0.0111175
	EqAscendNode    -44.4655
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.660 0.655 0.651)

	Surface
	{
		SurfStyle       0.162109
		OceanStyle      0.170254
		Randomize      (-0.822, -0.044, -0.909)
		colorDistMagn   0.549775
		colorDistFreq   0.310998
		detailScale     621.276
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.578436
		terraceProb     0.626484
		erosion         0
		montesMagn      0.447009
		montesFreq      1.44577
		montesSpiky     0.994461
		montesFraction  0.6654
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.60257
		hillsFraction   0.455099
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244182
		craterFreq      0.205411
		craterDensity   0.959455
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.595403
		volcanoTemp     1165.92
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.264, 0.262, 0.260, 0.000)
		colorShelf     (0.281, 0.278, 0.277, 0.000)
		colorBeach     (0.297, 0.295, 0.293, 0.000)
		colorDesert    (0.314, 0.311, 0.309, 0.000)
		colorLowland   (0.330, 0.328, 0.326, 0.000)
		colorUpland    (0.347, 0.344, 0.342, 0.000)
		colorRock      (0.363, 0.360, 0.358, 0.000)
		colorSnow      (0.380, 0.377, 0.374, 1.000)
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
		SemiMajorAxis   0.000572585
		Period          0.00121629
		Eccentricity    2.67758e-005
		Inclination     -0.0111175
		AscendingNode   -44.4655
		ArgOfPericenter 50.8194
		MeanAnomaly     21.1902
	}
}

Moon	"Eadu System 8.1"
{
	ParentBody     "Eadu System 8"
	Class	       "IceWorld"

	Mass            0.00110746
	Radius          856.003
	InertiaMoment   0.398686

	Oblateness      0.01147

	Obliquity       0.0925281
	EqAscendNode    -175.868
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.619 0.372 0.283)

	Surface
	{
		SurfStyle       0.657035
		OceanStyle      0.986305
		Randomize      (-0.229, 0.086, -0.061)
		colorDistMagn   0.0944608
		colorDistFreq   103.517
		detailScale     2201.69
		colorConversion true
		drivenDarkening 0.7
		seaLevel        0.271909
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  0.538133
		icecapHeight    0.3009
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.52028
		venusFreq       1.35174
		venusMagn       0.252913
		mareFreq        0.21398
		mareDensity     0.000507465
		terraceProb     0.186077
		erosion         0
		montesMagn      0.0660839
		montesFreq      36.0915
		montesSpiky     0.844691
		montesFraction  0.819885
		dunesMagn       0.0298327
		dunesFreq       1124.29
		dunesFraction   0.470528
		hillsMagn       0.107121
		hillsFreq       93.5088
		hillsFraction   0.100373
		hills2Fraction  0.226581
		riversMagn      60.6347
		riversFreq      2.90307
		riversSin       7.32281
		riversOctaves   0
		canyonsMagn     0.60739
		canyonsFreq     0.27508
		canyonFraction  0
		cracksMagn      0.0370824
		cracksFreq      0.225513
		cracksOctaves   0
		craterMagn      0.610509
		craterFreq      2.78854
		craterDensity   0.784267
		craterOctaves   10
		craterRayedFactor 0.170242
		volcanoMagn     0.186557
		volcanoFreq     0.716528
		volcanoDensity  0.199521
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.160785
		volcanoRadius   0.147878
		volcanoTemp     849.947
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.396, 0.238, 0.190, 0.250)
		colorShelf     (0.433, 0.272, 0.215, 0.250)
		colorBeach     (0.353, 0.201, 0.164, 0.200)
		colorDesert    (0.328, 0.182, 0.144, 0.200)
		colorLowland   (0.241, 0.141, 0.119, 0.200)
		colorUpland    (0.458, 0.275, 0.215, 0.250)
		colorRock      (0.640, 0.630, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.241, 0.141, 0.119, 0.200)
		colorUpPlants  (0.458, 0.275, 0.215, 0.250)
		BumpHeight      20
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
		SemiMajorAxis   0.000918589
		Period          0.00247146
		Eccentricity    0.00259311
		Inclination     0.0925281
		AscendingNode   -175.868
		ArgOfPericenter -49.2446
		MeanAnomaly     -30.8063
	}
}

Moon	"Eadu System 8.2"
{
	ParentBody     "Eadu System 8"
	Class	       "IceWorld"

	Mass            0.00129309
	Radius          957.356
	InertiaMoment   0.398047

	Oblateness      0.00342434

	Obliquity       -1.22443
	EqAscendNode    -35.0413
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.787 0.612 0.521)

	Surface
	{
		SurfStyle       0.955558
		OceanStyle      0.234864
		Randomize      (-0.355, 0.109, 0.835)
		colorDistMagn   0.0622636
		colorDistFreq   131.195
		detailScale     2462.37
		colorConversion true
		drivenDarkening 0.7
		seaLevel        0.314006
		snowLevel       2
		tropicLatitude  0.0407462
		icecapLatitude  0.817311
		icecapHeight    0.331291
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.64601
		venusFreq       0.629814
		venusMagn       0.251724
		mareFreq        0.238994
		mareDensity     0.000497527
		terraceProb     0.156185
		erosion         0
		montesMagn      0.0495104
		montesFreq      43.5591
		montesSpiky     0.935127
		montesFraction  0.297992
		dunesMagn       0.0423934
		dunesFreq       1270.19
		dunesFraction   0.837462
		hillsMagn       0.118915
		hillsFreq       107.058
		hillsFraction   0.247774
		hills2Fraction  0.110928
		riversMagn      64.0387
		riversFreq      2.41452
		riversSin       4.71686
		riversOctaves   0
		canyonsMagn     0.619941
		canyonsFreq     0.210673
		canyonFraction  0
		cracksMagn      0.0464424
		cracksFreq      0.482737
		cracksOctaves   0
		craterMagn      0.635192
		craterFreq      3.15476
		craterDensity   0.832358
		craterOctaves   10
		craterRayedFactor 0.208445
		volcanoMagn     0.183582
		volcanoFreq     0.46213
		volcanoDensity  0.203637
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.376148
		volcanoRadius   0.172406
		volcanoTemp     1664.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.598, 0.435, 0.302, 1.000)
		colorShelf     (0.598, 0.435, 0.302, 1.000)
		colorBeach     (0.551, 0.380, 0.260, 1.000)
		colorDesert    (0.551, 0.380, 0.260, 1.000)
		colorLowland   (0.669, 0.496, 0.396, 1.000)
		colorUpland    (0.700, 0.545, 0.448, 1.000)
		colorRock      (0.930, 0.910, 0.860, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.669, 0.496, 0.396, 1.000)
		colorUpPlants  (0.700, 0.545, 0.448, 1.000)
		BumpHeight      20
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
		SemiMajorAxis   0.0014586
		Period          0.00494508
		Eccentricity    0.0067863
		Inclination     -1.22443
		AscendingNode   -35.0413
		ArgOfPericenter -159.117
		MeanAnomaly     -136.428
	}
}

Moon	"Eadu System 8.3"
{
	ParentBody     "Eadu System 8"
	Class	       "IceWorld"

	Mass            0.00150499
	Radius          947.429
	InertiaMoment   0.397095

	Obliquity       -1.43733
	EqAscendNode    103.783
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.807 0.759 0.722)

	Surface
	{
		SurfStyle       0.0920257
		OceanStyle      0.255495
		Randomize      (-0.044, 0.988, -0.657)
		colorDistMagn   0.0829772
		colorDistFreq   118.039
		detailScale     2436.84
		colorConversion true
		drivenDarkening 0.7
		seaLevel        0.28493
		snowLevel       2
		tropicLatitude  0.0309569
		icecapLatitude  0.959145
		icecapHeight    0.288581
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.87152
		venusFreq       0.829691
		venusMagn       0
		mareFreq        0.292369
		mareDensity     0.000785128
		terraceProb     0.654662
		erosion         0
		montesMagn      0.0617081
		montesFreq      33.2264
		montesSpiky     0.919974
		montesFraction  0.972833
		dunesMagn       0.0440252
		dunesFreq       1254.33
		dunesFraction   0.388277
		hillsMagn       0.136153
		hillsFreq       104.724
		hillsFraction   0.990585
		hills2Fraction  0.060452
		riversMagn      60.3748
		riversFreq      3.9912
		riversSin       5.22093
		riversOctaves   0
		canyonsMagn     0.541046
		canyonsFreq     0.371425
		canyonFraction  0
		cracksMagn      0.0546357
		cracksFreq      0.588466
		cracksOctaves   0
		craterMagn      0.602067
		craterFreq      2.61081
		craterDensity   0.738226
		craterOctaves   10
		craterRayedFactor 0.0725397
		volcanoMagn     0.172605
		volcanoFreq     0.764156
		volcanoDensity  0.204163
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.316012
		volcanoRadius   0.165954
		volcanoTemp     1243.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.807, 0.759, 0.722, 0.500)
		colorShelf     (0.767, 0.721, 0.686, 0.500)
		colorBeach     (0.565, 0.531, 0.506, 0.750)
		colorDesert    (0.686, 0.645, 0.614, 1.000)
		colorLowland   (0.711, 0.668, 0.636, 1.000)
		colorUpland    (0.751, 0.706, 0.672, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.711, 0.668, 0.636, 1.000)
		colorUpPlants  (0.751, 0.706, 0.672, 1.000)
		BumpHeight      20
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
		SemiMajorAxis   0.00231606
		Period          0.00989449
		Eccentricity    0.0131676
		Inclination     -1.43733
		AscendingNode   103.783
		ArgOfPericenter 93.5495
		MeanAnomaly     -46.6801
	}
}

Moon	"Eadu System 8.4"
{
	ParentBody     "Eadu System 8"
	Class	       "IceWorld"

	Mass            0.00174735
	Radius          1057.61
	InertiaMoment   0.399909

	Obliquity       0.786634
	EqAscendNode    -51.9455
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.864 0.793 0.694)

	Surface
	{
		SurfStyle       0.157091
		OceanStyle      0.343867
		Randomize      (-0.655, -0.638, -0.385)
		colorDistMagn   0.0731086
		colorDistFreq   140.158
		detailScale     2720.24
		colorConversion true
		drivenDarkening 0.681318
		seaLevel        0.134035
		snowLevel       2
		tropicLatitude  0.0246817
		icecapLatitude  1
		icecapHeight    0.134035
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.79773
		venusFreq       0.655079
		venusMagn       0.246523
		mareFreq        0.378319
		mareDensity     0.00053298
		terraceProb     0.445656
		erosion         0
		montesMagn      0.0694686
		montesFreq      54.2346
		montesSpiky     0.951779
		montesFraction  0.421938
		dunesMagn       0.0281894
		dunesFreq       1419.04
		dunesFraction   0.0917996
		hillsMagn       0.113582
		hillsFreq       124.538
		hillsFraction   0.915734
		hills2Fraction  0.233707
		riversMagn      54.8637
		riversFreq      2.57279
		riversSin       4.92541
		riversOctaves   0
		canyonsMagn     0.693929
		canyonsFreq     0.409873
		canyonFraction  0
		cracksMagn      0.0567874
		cracksFreq      0.187352
		cracksOctaves   0
		craterMagn      0.580388
		craterFreq      2.97999
		craterDensity   0.96567
		craterOctaves   10
		craterRayedFactor 0.193774
		volcanoMagn     0.169312
		volcanoFreq     0.540214
		volcanoDensity  0.228274
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.294131
		volcanoRadius   0.151787
		volcanoTemp     1339.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.864, 0.793, 0.694, 0.500)
		colorShelf     (0.821, 0.753, 0.659, 0.500)
		colorBeach     (0.605, 0.555, 0.486, 0.750)
		colorDesert    (0.735, 0.674, 0.590, 1.000)
		colorLowland   (0.761, 0.698, 0.611, 1.000)
		colorUpland    (0.804, 0.737, 0.646, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.761, 0.698, 0.611, 1.000)
		colorUpPlants  (0.804, 0.737, 0.646, 1.000)
		BumpHeight      20
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
		SemiMajorAxis   0.00367759
		Period          0.0197976
		Eccentricity    0.0025589
		Inclination     0.786634
		AscendingNode   -51.9455
		ArgOfPericenter -102.886
		MeanAnomaly     -2.22561
	}
}

Moon	"Eadu System 8.5"
{
	ParentBody     "Eadu System 8"
	Class	       "IceWorld"

	Mass            0.0202517
	Radius          2226.74
	InertiaMoment   0.363919

	Obliquity       -0.778912
	EqAscendNode    103.098
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.757 0.732 0.683)

	Surface
	{
		SurfStyle       0.87129
		OceanStyle      0.484127
		Randomize      (0.550, 0.113, -0.020)
		colorDistMagn   0.0791764
		colorDistFreq   287.145
		detailScale     5727.31
		colorConversion true
		drivenDarkening 0.429078
		seaLevel        0.19261
		snowLevel       2
		tropicLatitude  0.0169069
		icecapLatitude  0.839266
		icecapHeight    0.199113
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.68755
		venusFreq       0.705894
		venusMagn       0
		mareFreq        1.32359
		mareDensity     0.00387695
		terraceProb     0.470825
		erosion         0
		montesMagn      0.101532
		montesFreq      103.236
		montesSpiky     0.983245
		montesFraction  0.575375
		dunesMagn       0.0260226
		dunesFreq       2868.76
		dunesFraction   0.999864
		hillsMagn       0.128281
		hillsFreq       258.372
		hillsFraction   0.189254
		hills2Fraction  0.197746
		riversMagn      60.2929
		riversFreq      1.88675
		riversSin       4.74064
		riversOctaves   0
		canyonsMagn     0.651618
		canyonsFreq     0.894224
		canyonFraction  0
		cracksMagn      0.0308814
		cracksFreq      1.53897
		cracksOctaves   2
		craterMagn      0.616265
		craterFreq      5.74288
		craterDensity   0.73665
		craterOctaves   11
		craterRayedFactor 0.104681
		volcanoMagn     0.345583
		volcanoFreq     0.828233
		volcanoDensity  0.168804
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.263565
		volcanoRadius   0.322697
		volcanoTemp     1447.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.757, 0.549, 0.392, 0.000)
		colorShelf     (0.719, 0.521, 0.372, 0.000)
		colorBeach     (0.378, 0.275, 0.196, 0.000)
		colorDesert    (0.643, 0.467, 0.333, 0.000)
		colorLowland   (0.613, 0.483, 0.372, 0.000)
		colorUpland    (0.704, 0.510, 0.365, 0.000)
		colorRock      (1.000, 1.000, 1.000, 0.500)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.613, 0.483, 0.372, 0.000)
		colorUpPlants  (0.704, 0.510, 0.365, 0.000)
		BumpHeight      20
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
		SemiMajorAxis   0.00583953
		Period          0.0396041
		Eccentricity    0.0296669
		Inclination     -0.778912
		AscendingNode   103.098
		ArgOfPericenter -28.7947
		MeanAnomaly     164.777
	}
}

Moon	"Eadu System 8.6"
{
	ParentBody     "Eadu System 8"
	Class	       "IceWorld"

	Mass            0.00234455
	Radius          1165.53
	InertiaMoment   0.398948

	Obliquity       0.342336
	EqAscendNode    -90.1618
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.609 0.444 0.319)

	Surface
	{
		SurfStyle       0.897539
		OceanStyle      0.411397
		Randomize      (0.529, -0.007, 0.066)
		colorDistMagn   0.0581178
		colorDistFreq   150.797
		detailScale     2997.81
		colorConversion true
		drivenDarkening 0.270223
		seaLevel        0.148556
		snowLevel       2
		tropicLatitude  0.00843604
		icecapLatitude  0.96572
		icecapHeight    0.150319
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.92683
		venusFreq       1.58075
		venusMagn       0
		mareFreq        0.399002
		mareDensity     0.000651748
		terraceProb     0.363569
		erosion         0
		montesMagn      0.0697319
		montesFreq      57.8632
		montesSpiky     0.913989
		montesFraction  0.278253
		dunesMagn       0.0325978
		dunesFreq       1484.39
		dunesFraction   0.559811
		hillsMagn       0.122301
		hillsFreq       147.849
		hillsFraction   0.618775
		hills2Fraction  0.0718661
		riversMagn      53.2697
		riversFreq      3.06828
		riversSin       7.22221
		riversOctaves   0
		canyonsMagn     0.577229
		canyonsFreq     0.411189
		canyonFraction  0
		cracksMagn      0.047962
		cracksFreq      0.626395
		cracksOctaves   0
		craterMagn      0.581062
		craterFreq      3.37429
		craterDensity   0.842728
		craterOctaves   10
		craterRayedFactor 0.147222
		volcanoMagn     0.167635
		volcanoFreq     0.533536
		volcanoDensity  0.177392
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.132205
		volcanoRadius   0.143796
		volcanoTemp     1493.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.609, 0.333, 0.183, 0.000)
		colorShelf     (0.578, 0.316, 0.174, 0.000)
		colorBeach     (0.304, 0.166, 0.092, 0.000)
		colorDesert    (0.518, 0.283, 0.156, 0.000)
		colorLowland   (0.493, 0.293, 0.174, 0.000)
		colorUpland    (0.566, 0.309, 0.171, 0.000)
		colorRock      (1.000, 1.000, 1.000, 0.500)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.493, 0.293, 0.174, 0.000)
		colorUpPlants  (0.566, 0.309, 0.171, 0.000)
		BumpHeight      20
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
		SemiMajorAxis   0.00927239
		Period          0.0792597
		Eccentricity    0.0206309
		Inclination     0.342336
		AscendingNode   -90.1618
		ArgOfPericenter -138.049
		MeanAnomaly     -21.2763
	}
}

Moon	"Eadu System 8.7"
{
	ParentBody     "Eadu System 8"
	Class	       "IceWorld"

	Mass            0.00271289
	Radius          1151.03
	InertiaMoment   0.398375

	RotationPeriod  127.243
	Obliquity       -0.578499
	EqAscendNode    -36.9078
	//Precession      0

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.818 0.767 0.717)

	Surface
	{
		SurfStyle       0.15364
		OceanStyle      0.674278
		Randomize      (0.585, -0.752, -0.076)
		colorDistMagn   0.0509442
		colorDistFreq   149.046
		detailScale     2960.51
		colorConversion true
		drivenDarkening 0.17018
		seaLevel        0.217344
		snowLevel       2
		tropicLatitude  0.00767389
		icecapLatitude  0.972827
		icecapHeight    0.219768
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.943
		venusFreq       1.03681
		venusMagn       0.164107
		mareFreq        0.405731
		mareDensity     0.00114159
		terraceProb     0.117283
		erosion         0
		montesMagn      0.0654831
		montesFreq      61.0588
		montesSpiky     0.954049
		montesFraction  0.853218
		dunesMagn       0.032392
		dunesFreq       1492.87
		dunesFraction   0.926991
		hillsMagn       0.140037
		hillsFreq       142.964
		hillsFraction   0.716033
		hills2Fraction  0.171361
		riversMagn      64.8852
		riversFreq      3.56581
		riversSin       6.64711
		riversOctaves   0
		canyonsMagn     0.391645
		canyonsFreq     0.385709
		canyonFraction  0
		cracksMagn      0.0271748
		cracksFreq      0.584481
		cracksOctaves   0
		craterMagn      0.586185
		craterFreq      3.7476
		craterDensity   0.835945
		craterOctaves   10
		craterRayedFactor 0.228899
		volcanoMagn     0.16966
		volcanoFreq     0.758426
		volcanoDensity  0.185616
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.276469
		volcanoRadius   0.161922
		volcanoTemp     1500.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.818, 0.767, 0.717, 0.500)
		colorShelf     (0.777, 0.729, 0.681, 0.500)
		colorBeach     (0.573, 0.537, 0.502, 0.750)
		colorDesert    (0.695, 0.652, 0.609, 1.000)
		colorLowland   (0.720, 0.675, 0.631, 1.000)
		colorUpland    (0.761, 0.713, 0.666, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.720, 0.675, 0.631, 1.000)
		colorUpPlants  (0.761, 0.713, 0.666, 1.000)
		BumpHeight      20
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
		SemiMajorAxis   0.0147233
		Period          0.158588
		Eccentricity    0.0402898
		Inclination     0.728243
		AscendingNode   -37.1386
		ArgOfPericenter 179.637
		MeanAnomaly     35.4828
	}
}

DwarfMoon	"Eadu System 8.D4"
{
	ParentBody     "Eadu System 8"
	Class	       "Asteroid"

	Mass            4.39529e-008
	Radius          53.1009
	InertiaMoment   0.397992

	RotationPeriod  646.613
	Obliquity       1.88024
	EqAscendNode    72.5834
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.691 0.688 0.686)

	Surface
	{
		SurfStyle       0.124778
		OceanStyle      0.697343
		Randomize      (0.492, -0.759, -0.847)
		colorDistMagn   0.342606
		colorDistFreq   1.65631
		detailScale     1450.01
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0399357
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.345259
		terraceProb     0.259683
		erosion         0
		montesMagn      0.649059
		montesFreq      3.11477
		montesSpiky     0.988145
		montesFraction  0.499825
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.72378
		hillsFraction   0.819424
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242103
		craterFreq      0.203947
		craterDensity   0.866475
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.552647
		volcanoTemp     1704.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.276, 0.275, 0.274, 0.000)
		colorShelf     (0.294, 0.292, 0.291, 0.000)
		colorBeach     (0.311, 0.310, 0.309, 0.000)
		colorDesert    (0.328, 0.327, 0.326, 0.000)
		colorLowland   (0.345, 0.344, 0.343, 0.000)
		colorUpland    (0.363, 0.361, 0.360, 0.000)
		colorRock      (0.380, 0.378, 0.377, 0.000)
		colorSnow      (0.397, 0.396, 0.394, 1.000)
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
		SemiMajorAxis   0.0233787
		Period          0.317327
		Eccentricity    0.0396806
		Inclination     0.84676
		AscendingNode   71.9575
		ArgOfPericenter -173.885
		MeanAnomaly     -135.619
	}
}

Moon	"Eadu System 8.8"
{
	ParentBody     "Eadu System 8"
	Class	       "IceWorld"

	Mass            0.0036352
	Radius          1267.66
	InertiaMoment   0.393834

	Oblateness      0.00177902

	RotationPeriod  54.2225
	Obliquity       -58.0266
	EqAscendNode    134.919
	//Precession      0

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.518 0.509 0.504)

	Surface
	{
		SurfStyle       0.0299687
		OceanStyle      0.812257
		Randomize      (-0.658, 0.412, 0.509)
		colorDistMagn   0.0661233
		colorDistFreq   162.849
		detailScale     3260.5
		colorConversion true
		drivenDarkening 0.0674963
		seaLevel        0.247612
		snowLevel       2
		tropicLatitude  0.843273
		icecapLatitude  1
		icecapHeight    0.247612
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.06478
		venusFreq       1.36178
		venusMagn       0
		mareFreq        0.548381
		mareDensity     0.0012397
		terraceProb     0.143793
		erosion         0
		montesMagn      0.0542841
		montesFreq      46.0664
		montesSpiky     0.949857
		montesFraction  0.845243
		dunesMagn       0.0394483
		dunesFreq       1661.45
		dunesFraction   0.811065
		hillsMagn       0.118965
		hillsFreq       141.823
		hillsFraction   0.540568
		hills2Fraction  0.154129
		riversMagn      63.4782
		riversFreq      2.93369
		riversSin       7.29612
		riversOctaves   0
		canyonsMagn     0.584791
		canyonsFreq     0.410842
		canyonFraction  0
		cracksMagn      0.0265231
		cracksFreq      0.605259
		cracksOctaves   0
		craterMagn      0.620273
		craterFreq      4.26398
		craterDensity   0.765701
		craterOctaves   11
		craterRayedFactor 0.139101
		volcanoMagn     0.17635
		volcanoFreq     0.634801
		volcanoDensity  0.215788
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.0890888
		volcanoRadius   0.163336
		volcanoTemp     1525.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.518, 0.509, 0.504, 0.500)
		colorShelf     (0.492, 0.484, 0.478, 0.500)
		colorBeach     (0.363, 0.356, 0.353, 0.750)
		colorDesert    (0.440, 0.433, 0.428, 1.000)
		colorLowland   (0.456, 0.448, 0.443, 1.000)
		colorUpland    (0.482, 0.473, 0.468, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.456, 0.448, 0.443, 1.000)
		colorUpPlants  (0.482, 0.473, 0.468, 1.000)
		BumpHeight      20
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
		SemiMajorAxis   0.0371222
		Period          0.634905
		Eccentricity    0.0121443
		Inclination     -0.73582
		AscendingNode   137.282
		ArgOfPericenter -88.8243
		MeanAnomaly     162.859
	}
}

DwarfMoon	"Eadu System 8.D5"
{
	ParentBody     "Eadu System 8"
	Class	       "Asteroid"

	Mass            8.12494e-008
	Radius          59.5169
	InertiaMoment   0.39515

	RotationPeriod  547.257
	Obliquity       -51.7716
	EqAscendNode    -114.206
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.453 0.446 0.443)

	Surface
	{
		SurfStyle       0.317212
		OceanStyle      0.483437
		Randomize      (0.668, -0.333, -0.173)
		colorDistMagn   0.595406
		colorDistFreq   1.9177
		detailScale     1625.21
		colorConversion true
		snowLevel       2
		tropicLatitude  0.771494
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.405086
		terraceProb     0.132255
		erosion         0
		montesMagn      0.509756
		montesFreq      3.28443
		montesSpiky     0.807573
		montesFraction  0.435464
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.0143
		hillsFraction   0.587577
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.271223
		craterFreq      0.155163
		craterDensity   0.848452
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.6106
		volcanoTemp     1614.09
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.181, 0.178, 0.177, 0.000)
		colorShelf     (0.193, 0.189, 0.188, 0.000)
		colorBeach     (0.204, 0.201, 0.199, 0.000)
		colorDesert    (0.215, 0.212, 0.210, 0.000)
		colorLowland   (0.227, 0.223, 0.221, 0.000)
		colorUpland    (0.238, 0.234, 0.232, 0.000)
		colorRock      (0.249, 0.245, 0.243, 0.000)
		colorSnow      (0.261, 0.256, 0.254, 1.000)
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
		SemiMajorAxis   0.622023
		Period          43.5499
		Eccentricity    0.226083
		Inclination     -4.41805
		AscendingNode   -108.577
		ArgOfPericenter 84.7011
		MeanAnomaly     165.045
	}
}

DwarfMoon	"Eadu System 8.D6"
{
	ParentBody     "Eadu System 8"
	Class	       "Asteroid"

	Mass            1.1087e-007
	Radius          62.4709
	InertiaMoment   0.398189

	RotationPeriod  493.762
	Obliquity       42.586
	EqAscendNode    19.0307
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.618 0.611 0.608)

	Surface
	{
		SurfStyle       0.665692
		OceanStyle      0.0126975
		Randomize      (0.620, 0.730, -0.046)
		colorDistMagn   0.903534
		colorDistFreq   2.53969
		detailScale     1705.87
		colorConversion true
		snowLevel       2
		tropicLatitude  0.365459
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.482678
		terraceProb     0.567532
		erosion         0
		montesMagn      0.485433
		montesFreq      3.01417
		montesSpiky     0.865469
		montesFraction  0.649306
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.77768
		hillsFraction   0.588655
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259797
		craterFreq      0.186999
		craterDensity   0.833732
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.537129
		volcanoTemp     1287.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.241, 0.208, 0.170, 0.000)
		colorShelf     (0.247, 0.214, 0.195, 0.000)
		colorBeach     (0.290, 0.251, 0.231, 0.000)
		colorDesert    (0.315, 0.269, 0.225, 0.000)
		colorLowland   (0.346, 0.287, 0.256, 0.000)
		colorUpland    (0.383, 0.349, 0.310, 0.000)
		colorRock      (0.414, 0.379, 0.335, 0.000)
		colorSnow      (0.451, 0.404, 0.353, 1.000)
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
		SemiMajorAxis   0.622332
		Period          43.5823
		Eccentricity    0.364381
		Inclination     -44.0584
		AscendingNode   31.3831
		ArgOfPericenter 177.997
		MeanAnomaly     -42.0889
	}
}

DwarfMoon	"Eadu System 8.D7"
{
	ParentBody     "Eadu System 8"
	Class	       "Asteroid"

	Mass            1.51851e-007
	Radius          81.096
	InertiaMoment   0.39927

	RotationPeriod  548.282
	Obliquity       -46.9263
	EqAscendNode    170.727
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.621 0.579 0.536)

	Surface
	{
		SurfStyle       0.0620604
		OceanStyle      0.314318
		Randomize      (-0.371, -0.350, 0.490)
		colorDistMagn   0.770039
		colorDistFreq   2.37687
		detailScale     2214.46
		colorConversion true
		snowLevel       2
		tropicLatitude  0.346289
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.609185
		terraceProb     0.204214
		erosion         0
		montesMagn      0.545185
		montesFreq      2.30169
		montesSpiky     0.943194
		montesFraction  0.425241
		dunesFraction   0
		hillsMagn       0
		hillsFreq       16.9303
		hillsFraction   0.562358
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.266444
		craterFreq      0.237413
		craterDensity   0.866375
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.550725
		volcanoTemp     1337.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.248, 0.231, 0.214, 0.000)
		colorShelf     (0.264, 0.246, 0.228, 0.000)
		colorBeach     (0.279, 0.260, 0.241, 0.000)
		colorDesert    (0.295, 0.275, 0.254, 0.000)
		colorLowland   (0.310, 0.289, 0.268, 0.000)
		colorUpland    (0.326, 0.304, 0.281, 0.000)
		colorRock      (0.342, 0.318, 0.295, 0.000)
		colorSnow      (0.357, 0.333, 0.308, 1.000)
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
		SemiMajorAxis   0.622984
		Period          43.6508
		Eccentricity    0.48051
		Inclination     -27.5687
		AscendingNode   169.802
		ArgOfPericenter -113.607
		MeanAnomaly     106.51
	}
}

DwarfMoon	"Eadu System 8.D8"
{
	ParentBody     "Eadu System 8"
	Class	       "Asteroid"

	Mass            2.08973e-007
	Radius          85.4011
	InertiaMoment   0.396311

	RotationPeriod  490.512
	Obliquity       23.7441
	EqAscendNode    162.977
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.677 0.606 0.494)

	Surface
	{
		SurfStyle       0.855312
		OceanStyle      0.160663
		Randomize      (-0.949, 0.030, 0.082)
		colorDistMagn   0.0500458
		colorDistFreq   6.27629
		detailScale     2332.02
		colorConversion true
		snowLevel       2
		tropicLatitude  0.962621
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.339147
		terraceProb     0.668
		erosion         0
		montesMagn      0.374096
		montesFreq      3.5064
		montesSpiky     0.958467
		montesFraction  0.228668
		dunesFraction   0
		hillsMagn       0
		hillsFreq       17.5874
		hillsFraction   0.564892
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255837
		craterFreq      0.242483
		craterDensity   0.783939
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.466961
		volcanoTemp     1190.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.230, 0.212, 0.197, 0.050)
		colorShelf     (0.271, 0.249, 0.227, 0.040)
		colorBeach     (0.311, 0.285, 0.257, 0.030)
		colorDesert    (0.352, 0.321, 0.291, 0.020)
		colorLowland   (0.393, 0.358, 0.321, 0.030)
		colorUpland    (0.433, 0.394, 0.350, 0.050)
		colorRock      (0.474, 0.431, 0.390, 0.020)
		colorSnow      (0.474, 0.431, 0.390, 1.000)
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
		SemiMajorAxis   0.623327
		Period          43.6868
		Eccentricity    0.0389032
		Inclination     -50.8963
		AscendingNode   168.775
		ArgOfPericenter 0.70531
		MeanAnomaly     42.5663
	}
}

DwarfMoon	"Eadu System 8.D9"
{
	ParentBody     "Eadu System 8"
	Class	       "Asteroid"

	Mass            2.89289e-007
	Radius          91.4111
	InertiaMoment   0.39837

	RotationPeriod  447.495
	Obliquity       40.8337
	EqAscendNode    -155.091
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.654 0.614 0.558)

	Surface
	{
		SurfStyle       0.302739
		OceanStyle      0.531623
		Randomize      (0.541, -0.242, -0.139)
		colorDistMagn   0.886249
		colorDistFreq   3.24132
		detailScale     2496.13
		colorConversion true
		snowLevel       2
		tropicLatitude  0.590826
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.579981
		terraceProb     0.144514
		erosion         0
		montesMagn      0.45278
		montesFreq      2.79013
		montesSpiky     0.931518
		montesFraction  0.705781
		dunesFraction   0
		hillsMagn       0
		hillsFreq       15.904
		hillsFraction   0.576723
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244934
		craterFreq      0.323565
		craterDensity   0.759905
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.517272
		volcanoTemp     1201.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.261, 0.246, 0.223, 0.000)
		colorShelf     (0.278, 0.261, 0.237, 0.000)
		colorBeach     (0.294, 0.276, 0.251, 0.000)
		colorDesert    (0.311, 0.292, 0.265, 0.000)
		colorLowland   (0.327, 0.307, 0.279, 0.000)
		colorUpland    (0.343, 0.322, 0.293, 0.000)
		colorRock      (0.360, 0.338, 0.307, 0.000)
		colorSnow      (0.376, 0.353, 0.321, 1.000)
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
		SemiMajorAxis   0.623983
		Period          43.7558
		Eccentricity    0.42834
		Inclination     72.1952
		AscendingNode   -157.569
		ArgOfPericenter 22.9477
		MeanAnomaly     -42.0077
	}
}

DwarfMoon	"Eadu System 8.D10"
{
	ParentBody     "Eadu System 8"
	Class	       "Asteroid"

	Mass            4.0338e-007
	Radius          97.1967
	InertiaMoment   0.399402

	RotationPeriod  403.565
	Obliquity       2.64548
	EqAscendNode    -62.2356
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.420 0.418 0.414)

	Surface
	{
		SurfStyle       0.389924
		OceanStyle      0.935748
		Randomize      (-0.191, -0.512, -0.418)
		colorDistMagn   0.978941
		colorDistFreq   4.16575
		detailScale     2654.12
		colorConversion true
		snowLevel       2
		tropicLatitude  0.853686
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.43723
		terraceProb     0.239151
		erosion         0
		montesMagn      0.394061
		montesFreq      3.26283
		montesSpiky     0.864513
		montesFraction  0.57995
		dunesFraction   0
		hillsMagn       0
		hillsFreq       13.4948
		hillsFraction   0.784038
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240868
		craterFreq      0.262015
		craterDensity   0.697194
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.507248
		volcanoTemp     1751.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.168, 0.167, 0.166, 0.000)
		colorShelf     (0.178, 0.178, 0.176, 0.000)
		colorBeach     (0.189, 0.188, 0.186, 0.000)
		colorDesert    (0.199, 0.198, 0.197, 0.000)
		colorLowland   (0.210, 0.209, 0.207, 0.000)
		colorUpland    (0.220, 0.219, 0.217, 0.000)
		colorRock      (0.231, 0.230, 0.228, 0.000)
		colorSnow      (0.241, 0.240, 0.238, 1.000)
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
		SemiMajorAxis   0.624577
		Period          43.8184
		Eccentricity    0.0410489
		Inclination     -59.991
		AscendingNode   -57.9911
		ArgOfPericenter 124.529
		MeanAnomaly     -69.0956
	}
}

DwarfMoon	"Eadu System 8.D11"
{
	ParentBody     "Eadu System 8"
	Class	       "Asteroid"

	Mass            5.67393e-007
	Radius          127.353
	InertiaMoment   0.396848

	RotationPeriod  444.324
	Obliquity       45.6821
	EqAscendNode    102.472
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.569 0.484 0.453)

	Surface
	{
		SurfStyle       0.517901
		OceanStyle      0.779225
		Randomize      (0.345, 0.614, -0.860)
		colorDistMagn   0.909258
		colorDistFreq   9.72228
		detailScale     3477.58
		colorConversion true
		snowLevel       2
		tropicLatitude  0.984052
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.33046
		terraceProb     0.24801
		erosion         0
		montesMagn      0.486598
		montesFreq      2.90922
		montesSpiky     0.983376
		montesFraction  0.473186
		dunesFraction   0
		hillsMagn       0
		hillsFreq       43.1879
		hillsFraction   0.421412
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.273299
		craterFreq      0.496805
		craterDensity   0.798249
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.469341
		volcanoTemp     1378.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.222, 0.165, 0.127, 0.000)
		colorShelf     (0.227, 0.170, 0.145, 0.000)
		colorBeach     (0.267, 0.199, 0.172, 0.000)
		colorDesert    (0.290, 0.213, 0.168, 0.000)
		colorLowland   (0.318, 0.228, 0.190, 0.000)
		colorUpland    (0.353, 0.276, 0.231, 0.000)
		colorRock      (0.381, 0.300, 0.249, 0.000)
		colorSnow      (0.415, 0.320, 0.263, 1.000)
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
		SemiMajorAxis   0.625222
		Period          43.8863
		Eccentricity    0.383058
		Inclination     89.0476
		AscendingNode   103.44
		ArgOfPericenter -113.041
		MeanAnomaly     -115.862
	}
}

DwarfMoon	"Eadu System 8.D12"
{
	ParentBody     "Eadu System 8"
	Class	       "Asteroid"

	Mass            8.06488e-007
	Radius          134.796
	InertiaMoment   0.398539

	RotationPeriod  395.408
	Obliquity       -52.9716
	EqAscendNode    -125.269
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.647 0.641 0.637)

	Surface
	{
		SurfStyle       0.222452
		OceanStyle      0.595918
		Randomize      (-0.108, -0.479, -0.151)
		colorDistMagn   0.818161
		colorDistFreq   13.8184
		detailScale     3680.82
		colorConversion true
		snowLevel       2
		tropicLatitude  0.689852
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.744885
		terraceProb     0.104093
		erosion         0
		montesMagn      0.448321
		montesFreq      2.8901
		montesSpiky     0.923195
		montesFraction  0.644477
		dunesFraction   0
		hillsMagn       0
		hillsFreq       59.2276
		hillsFraction   0.662209
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.281494
		craterFreq      0.723047
		craterDensity   0.778199
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.486637
		volcanoTemp     1504.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.259, 0.256, 0.255, 0.000)
		colorShelf     (0.275, 0.272, 0.271, 0.000)
		colorBeach     (0.291, 0.288, 0.287, 0.000)
		colorDesert    (0.307, 0.304, 0.302, 0.000)
		colorLowland   (0.324, 0.320, 0.318, 0.000)
		colorUpland    (0.340, 0.336, 0.334, 0.000)
		colorRock      (0.356, 0.352, 0.350, 0.000)
		colorSnow      (0.372, 0.368, 0.366, 1.000)
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
		SemiMajorAxis   0.625608
		Period          43.9269
		Eccentricity    0.215796
		Inclination     -23.6042
		AscendingNode   -122.578
		ArgOfPericenter -54.9491
		MeanAnomaly     16.2636
	}
}

DwarfMoon	"Eadu System 8.D13"
{
	ParentBody     "Eadu System 8"
	Class	       "Asteroid"

	Mass            1.16079e-006
	Radius          146.086
	InertiaMoment   0.399532

	RotationPeriod  357.707
	Obliquity       -37.0158
	EqAscendNode    -47.4139
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.793 0.760 0.739)

	Surface
	{
		SurfStyle       0.698924
		OceanStyle      0.710505
		Randomize      (-0.355, -0.424, -0.244)
		colorDistMagn   0.658863
		colorDistFreq   11.1124
		detailScale     3989.13
		colorConversion true
		snowLevel       2
		tropicLatitude  0.823605
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.442035
		terraceProb     0.182586
		erosion         0
		montesMagn      0.472751
		montesFreq      3.8555
		montesSpiky     0.873883
		montesFraction  0.914827
		dunesFraction   0
		hillsMagn       0
		hillsFreq       60.2597
		hillsFraction   0.452776
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250653
		craterFreq      0.85944
		craterDensity   0.995528
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.481935
		volcanoTemp     1589.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.309, 0.258, 0.207, 0.000)
		colorShelf     (0.317, 0.266, 0.236, 0.000)
		colorBeach     (0.373, 0.312, 0.281, 0.000)
		colorDesert    (0.404, 0.334, 0.273, 0.000)
		colorLowland   (0.444, 0.357, 0.310, 0.000)
		colorUpland    (0.492, 0.433, 0.377, 0.000)
		colorRock      (0.531, 0.471, 0.406, 0.000)
		colorSnow      (0.579, 0.502, 0.429, 1.000)
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
		SemiMajorAxis   0.625814
		Period          43.9486
		Eccentricity    0.228948
		Inclination     -21.6463
		AscendingNode   -38.0004
		ArgOfPericenter 52.6228
		MeanAnomaly     -94.8982
	}
}

DwarfMoon	"Eadu System 8.D14"
{
	ParentBody     "Eadu System 8"
	Class	       "Asteroid"

	Mass            1.69605e-006
	Radius          158.338
	InertiaMoment   0.397222

	RotationPeriod  319.882
	Obliquity       23.9476
	EqAscendNode    41.5054
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.728 0.726 0.724)

	Surface
	{
		SurfStyle       0.197632
		OceanStyle      0.180982
		Randomize      (-0.768, 0.923, -0.106)
		colorDistMagn   0.909924
		colorDistFreq   13.9609
		detailScale     4323.69
		colorConversion true
		snowLevel       2
		tropicLatitude  0.725071
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.606914
		terraceProb     0.243961
		erosion         0
		montesMagn      0.311141
		montesFreq      2.80669
		montesSpiky     0.989053
		montesFraction  0.654554
		dunesFraction   0
		hillsMagn       0
		hillsFreq       71.7345
		hillsFraction   0.440208
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25124
		craterFreq      0.846533
		craterDensity   0.882367
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.531221
		volcanoTemp     1607.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.291, 0.290, 0.290, 0.000)
		colorShelf     (0.309, 0.309, 0.308, 0.000)
		colorBeach     (0.328, 0.327, 0.326, 0.000)
		colorDesert    (0.346, 0.345, 0.344, 0.000)
		colorLowland   (0.364, 0.363, 0.362, 0.000)
		colorUpland    (0.382, 0.381, 0.380, 0.000)
		colorRock      (0.400, 0.399, 0.398, 0.000)
		colorSnow      (0.419, 0.418, 0.416, 1.000)
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
		SemiMajorAxis   0.626415
		Period          44.0119
		Eccentricity    0.24455
		Inclination     25.319
		AscendingNode   37.642
		ArgOfPericenter 50.7036
		MeanAnomaly     -116.26
	}
}

DwarfMoon	"Eadu System 8.D15"
{
	ParentBody     "Eadu System 8"
	Class	       "Asteroid"

	Mass            2.52346e-006
	Radius          212.54
	InertiaMoment   0.398697

	RotationPeriod  352.612
	Obliquity       -34.4532
	EqAscendNode    41.9605
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.702 0.655 0.609)

	Surface
	{
		SurfStyle       0.653641
		OceanStyle      0.709373
		Randomize      (-0.551, 0.277, 0.152)
		colorDistMagn   0.560939
		colorDistFreq   1.99514
		detailScale     5803.76
		colorConversion true
		snowLevel       2
		tropicLatitude  0.933431
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.704511
		terraceProb     0.557452
		erosion         0
		montesMagn      0.447796
		montesFreq      3.53271
		montesSpiky     0.981489
		montesFraction  0.507406
		dunesFraction   0
		hillsMagn       0
		hillsFreq       112.766
		hillsFraction   0.593599
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249138
		craterFreq      1.04373
		craterDensity   0.758515
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.423251
		volcanoTemp     1475.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.274, 0.223, 0.171, 0.000)
		colorShelf     (0.281, 0.229, 0.195, 0.000)
		colorBeach     (0.330, 0.269, 0.231, 0.000)
		colorDesert    (0.358, 0.288, 0.225, 0.000)
		colorLowland   (0.393, 0.308, 0.256, 0.000)
		colorUpland    (0.435, 0.373, 0.311, 0.000)
		colorRock      (0.470, 0.406, 0.335, 0.000)
		colorSnow      (0.512, 0.432, 0.353, 1.000)
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
		SemiMajorAxis   0.62686
		Period          44.0588
		Eccentricity    0.452346
		Inclination     -87.0797
		AscendingNode   44.8201
		ArgOfPericenter 138.234
		MeanAnomaly     9.04564
	}
}
