// http://starwars.wikia.com/wiki/Dathomir
// Region : Outer Rim
// Sector : Quelii Sector
// Grid location : O6
// X : 4716.6, Y : 5436.59, Z : 111.46904432322435
Planet	"Arro"
{
	ParentBody     "Domir"
	Class	       "Desert"

	Mass            0.850475
	Radius          6706.16
	InertiaMoment   0.326627

	Obliquity       1.60778
	EqAscendNode    -143.996
	TidalLocked     true

	AlbedoBond      0.345808
	AlbedoGeom      0.41497
	Brightness      2
	Color          (0.955 0.880 0.813)

	Surface
	{
		SurfStyle       0.0334296
		OceanStyle      0.610113
		Randomize      (-0.718, 0.841, 0.226)
		colorDistMagn   0.0451067
		colorDistFreq   1034.68
		detailScale     17248.6
		colorConversion true
		drivenDarkening -1
		seaLevel        0.0636919
		snowLevel       1
		tropicLatitude  0.0173419
		icecapLatitude  1
		icecapHeight    0.174436
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        0.785289
		venusFreq       2
		venusMagn       0
		mareFreq        1.22191
		mareDensity     0.120066
		terraceProb     0.327453
		erosion         0
		montesMagn      0.242484
		montesFreq      349.657
		montesSpiky     0.854941
		montesFraction  0.95118
		dunesMagn       0.0614755
		dunesFreq       71.9904
		dunesFraction   0.882997
		hillsMagn       0.106029
		hillsFreq       767.257
		hillsFraction   0
		hills2Fraction  0
		riversMagn      59.7989
		riversFreq      3.042
		riversSin       5.01979
		riversOctaves   0
		canyonsMagn     0.0286857
		canyonsFreq     100
		canyonFraction  0
		cracksMagn      0.106997
		cracksFreq      0.704617
		cracksOctaves   0
		craterMagn      0.589962
		craterFreq      12.2307
		craterDensity   0
		craterOctaves   0
		craterRayedFactor 0
		volcanoMagn     0.716992
		volcanoFreq     0.734665
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.835827
		volcanoRadius   0.480721
		volcanoTemp     1248.41
		lavaCoverTidal  0
		lavaCoverSun    0.730159
		lavaCoverYoung  0
		stripeZones     1
		stripeFluct     0
		stripeTwist     3.5
		cycloneMagn     0.999887
		cycloneFreq     0
		cycloneDensity  0.390324
		cycloneOctaves  0
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
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Clouds
	{
		Height          72.146
		Velocity        50.3607
		BumpHeight      6.92279
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.00359
		mainOctaves     10
		Coverage        0.291616
		stripeZones     1
		stripeFluct     0
		stripeTwist     3.5
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Venus"
		Height          270.953
		Density         188.823
		Pressure        278.268
		Greenhouse      480.792
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0
		Saturation      1

		Composition
		{
			CO2   	91.8163
			H2O   	7.14186
			SO2   	1.03297
			N2    	0.00845973
			CO    	0.000377696
		}
	}

	Aurora
	{
		Height      131.849
		NorthLat    75.4284
		NorthLon    49.4983
		NorthRadius 2283.28
		NorthWidth  625.764
		NorthRings  4
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -77.4705
		SouthLon    219.409
		SouthRadius 2128.49
		SouthWidth  601.791
		SouthRings  4
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
		SemiMajorAxis   0.139493
		Period          0.048996
		Eccentricity    0.043885
		Inclination     1.60778
		AscendingNode   -143.996
		ArgOfPericenter 97.4539
		MeanAnomaly     78.5056
	}
}




Planet	"Euton"
{
	ParentBody     "Domir"
	Class	       "Selena"

	Mass            0.148363
	Radius          3438.42
	InertiaMoment   0.332378

	RotationPeriod  188.183
	Obliquity       -0.775715
	EqAscendNode    -93.4977

	AlbedoBond      0.2134
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.985 0.966 0.950)

	Surface
	{
		SurfStyle       0.0494663
		OceanStyle      0.140797
		Randomize      (0.575, -0.785, 0.974)
		colorDistMagn   0.0573567
		colorDistFreq   519.6
		detailScale     8843.81
		colorConversion true
		drivenDarkening 0
		seaLevel        0.202568
		snowLevel       2
		tropicLatitude  0.0185507
		icecapLatitude  10
		icecapHeight    0.152683
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.85325
		venusFreq       2
		venusMagn       0
		mareFreq        1.45441
		mareDensity     0.0512016
		terraceProb     0.327453
		erosion         0
		montesMagn      0.206728
		montesFreq      134.198
		montesSpiky     0.934447
		montesFraction  0.920423
		dunesMagn       0.0502076
		dunesFreq       4551.35
		dunesFraction   0.612868
		hillsMagn       0.109658
		hillsFreq       442.462
		hillsFraction   0.0334296
		hills2Fraction  0
		riversMagn      58.7011
		riversFreq      3.59583
		riversSin       5.96153
		riversOctaves   0
		canyonsMagn     0.611021
		canyonsFreq     0.954515
		canyonFraction  0.98691
		cracksMagn      0.0504867
		cracksFreq      1.22108
		cracksOctaves   0
		craterMagn      0.528673
		craterFreq      10.1461
		craterDensity   0.954508
		craterOctaves   12
		craterRayedFactor 0.121942
		volcanoMagn     0.480753
		volcanoFreq     0.71808
		volcanoDensity  0.259897
		volcanoOctaves  3
		volcanoActivity 0.236451
		volcanoFlows    0.284088
		volcanoRadius   0.45081
		volcanoTemp     1326.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.320, 0.320, 0.000)
		colorShelf     (0.370, 0.370, 0.370, 0.000)
		colorBeach     (0.500, 0.487, 0.470, 0.000)
		colorDesert    (0.620, 0.585, 0.535, 0.200)
		colorLowland   (0.670, 0.624, 0.601, 0.500)
		colorUpland    (0.700, 0.653, 0.620, 0.800)
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
		SemiMajorAxis   0.461139
		Period          0.294497
		Eccentricity    0.0547657
		Inclination     -0.775715
		AscendingNode   -93.4977
		ArgOfPericenter 57.2581
		MeanAnomaly     256.698
	}
}




Planet	"Laseel"
{
	ParentBody     "Domir"
	Class	       "Terra"

	Mass            3.65532
	Radius          8980.18
	InertiaMoment   0.328867

	Oblateness      0.00312324

	RotationPeriod  21.57
	Obliquity       38.3511
	EqAscendNode    -73.4902

	AlbedoBond      0.42133
	AlbedoGeom      0.442364
	Brightness      2
	Color          (0.457 0.518 0.564)

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine/Terrestrial"
		Panspermia "false"
	}

	Surface
	{
		SurfStyle       0.415079
		OceanStyle      0.793651
		Randomize      (-0.718, 0.841, 0.226)
		colorDistMagn   0.0963856
		colorDistFreq   1121.43
		detailScale     23097.5
		colorConversion true
		drivenDarkening -1
		seaLevel        0.394579
		snowLevel       0.768962
		tropicLatitude  0.621316
		icecapLatitude  1
		icecapHeight    0.211051
		climatePole     0.809524
		climateTropic   0.690476
		climateEquator  0.492063
		heightTempGrad  0.595238
		tropicWidth     0.5
		mainFreq        1.3115
		venusFreq       0.768962
		venusMagn       0.1843
		mareFreq        0.215443
		mareDensity     0.0613091
		terraceProb     0.327453
		erosion         0.12029
		montesMagn      0.165926
		montesFreq      500
		montesSpiky     0.983196
		montesFraction  0.882997
		dunesMagn       0.0360777
		dunesFreq       79.6283
		dunesFraction   0.551064
		hillsMagn       0.114799
		hillsFreq       731.27
		hillsFraction   0.728687
		hills2Fraction  0.177889
		riversMagn      55.076
		riversFreq      3.48111
		riversSin       5.61545
		riversOctaves   2
		canyonsMagn     0.0440713
		canyonsFreq     100
		canyonFraction  0.98691
		cracksMagn      0.0948502
		cracksFreq      0.493829
		cracksOctaves   0
		craterMagn      0.826363
		craterFreq      26.7381
		craterDensity   0
		craterOctaves   0
		craterRayedFactor 0
		volcanoMagn     0.687082
		volcanoFreq     0.785683
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 1.07722
		volcanoFlows    0.695974
		volcanoRadius   0.5447
		volcanoTemp     1157.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.15493
		stripeFluct     0
		stripeTwist     0.23481
		cycloneMagn     2.93144
		cycloneFreq     0.811138
		cycloneDensity  0.323254
		cycloneOctaves  2
		colorSea       (0.040, 0.200, 0.200, 1.000)
		colorShelf     (0.150, 0.370, 0.370, 1.000)
		colorBeach     (0.400, 0.330, 0.280, 0.000)
		colorDesert    (0.260, 0.240, 0.220, 0.000)
		colorLowland   (0.500, 0.420, 0.350, 0.000)
		colorUpland    (0.240, 0.210, 0.210, 0.000)
		colorRock      (0.220, 0.210, 0.210, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.308)
		colorLowPlants (0.229, 0.200, 0.020, 0.000)
		colorUpPlants  (0.498, 0.468, 0.050, 0.000)
		BumpHeight      14.7285
		BumpOffset      5.81156
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
		Height          6.12109
		Velocity        50.3607
		BumpHeight      6.12137
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.12963
		mainOctaves     10
		Coverage        0.37408
		stripeZones     2.15493
		stripeFluct     0
		stripeTwist     0.23481
	}

	Clouds
	{
		Height          12.2432
		Velocity        129.204
		BumpHeight      5.48036
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.12963
		mainOctaves     10
		Coverage        0.37408
		stripeZones     2.15493
		stripeFluct     0
		stripeTwist     0.23481
	}

	Ocean
	{
		Height          5.81156
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
	}

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          59.4301
		Density         5.64107
		Pressure        4.9354
		Greenhouse      37.0273
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.238161		Saturation      0.71319

		Composition
		{
			N2    	88.3221
			O2    	11.1118
			H2O   	0.556526
			CH4   	0.00910523
			CO    	0.000406516
			He    	2.16403e-005
		}
	}

	Aurora
	{
		Height      160.783
		NorthLat    76.0946
		NorthLon    -144.37
		NorthRadius 2246.68
		NorthWidth  686.49
		NorthRings  4
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -55.8508
		SouthLon    49.4074
		SouthRadius 2322.58
		SouthWidth  537.478
		SouthRings  4
		SouthBright 0.3
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	Rings
	{
		InnerRadius     12828.5
		OuterRadius     28554.6
		RotationPeriod  4.3133
		RotationOffset  0
		FrontBright     0.524441
		BackBright      0.522936
		Density         0.642738
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.733891
		Eccentricity    0.00538491
		Inclination     0.173747
		AscendingNode   -69.4862
		ArgOfPericenter 194.863
		MeanAnomaly     66.8474
	}
}



DwarfMoon	"Laseel.D1"
{
	ParentBody     "Laseel"
	Class	       "Asteroid"

	Mass            1.30313e-008
	Radius          17.5395
	InertiaMoment   0.398368

	RotationPeriod  145.265
	Obliquity       -37.7755
	EqAscendNode    5.36993

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.772 0.771 0.770)

	Surface
	{
		SurfStyle       0.0997812
		OceanStyle      0.4974
		Randomize      (-0.388, 0.079, -0.906)
		colorDistMagn   0.871342
		colorDistFreq   0.210748
		detailScale     478.946
		colorConversion true
		snowLevel       2
		tropicLatitude  0.967944
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.557293
		terraceProb     0.39955
		erosion         0
		montesMagn      0.493322
		montesFreq      2.62328
		montesSpiky     0.983328
		montesFraction  0.460577
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.688108
		hillsFraction   0.803139
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.216504
		craterFreq      0.185482
		craterDensity   1.00175
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.513433
		volcanoTemp     1371.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.309, 0.308, 0.308, 0.000)
		colorShelf     (0.328, 0.328, 0.327, 0.000)
		colorBeach     (0.347, 0.347, 0.346, 0.000)
		colorDesert    (0.367, 0.366, 0.366, 0.000)
		colorLowland   (0.386, 0.385, 0.385, 0.000)
		colorUpland    (0.405, 0.405, 0.404, 0.000)
		colorRock      (0.425, 0.424, 0.423, 0.000)
		colorSnow      (0.444, 0.443, 0.442, 1.000)
		BumpHeight      15.7856
		BumpOffset      3.15711
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.00055889
		Eccentricity    0.200782
		Inclination     -37.7755
		AscendingNode   5.36993
		ArgOfPericenter 170.219
		MeanAnomaly     28.5037
	}
}



DwarfMoon	"Laseel.D2"
{
	ParentBody     "Laseel"
	Class	       "Asteroid"

	Mass            1.77264e-008
	Radius          18.1415
	InertiaMoment   0.399401

	Obliquity       -16.2074
	EqAscendNode    4.25586
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.476 0.468 0.463)

	Surface
	{
		SurfStyle       0.945414
		OceanStyle      0.0828053
		Randomize      (-0.103, 0.295, -0.915)
		colorDistMagn   0.255847
		colorDistFreq   0.178664
		detailScale     495.385
		colorConversion true
		snowLevel       2
		tropicLatitude  0.535708
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.725052
		terraceProb     0.209184
		erosion         0
		montesMagn      0.64629
		montesFreq      2.74737
		montesSpiky     0.983067
		montesFraction  0.462083
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.842366
		hillsFraction   0.57008
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.279028
		craterFreq      0.246781
		craterDensity   0.817086
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.417403
		volcanoTemp     1404.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.162, 0.164, 0.185, 0.050)
		colorShelf     (0.190, 0.192, 0.213, 0.040)
		colorBeach     (0.219, 0.220, 0.241, 0.030)
		colorDesert    (0.247, 0.248, 0.273, 0.020)
		colorLowland   (0.276, 0.276, 0.301, 0.030)
		colorUpland    (0.304, 0.304, 0.329, 0.050)
		colorRock      (0.333, 0.333, 0.366, 0.020)
		colorSnow      (0.333, 0.333, 0.366, 1.000)
		BumpHeight      16.3274
		BumpOffset      3.26548
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.00104669
		Eccentricity    0.352918
		Inclination     -16.2074
		AscendingNode   4.25586
		ArgOfPericenter 31.6745
		MeanAnomaly     -14.7478
	}
}


Planet	"Dathomir"
{
	ParentBody     "Domir"
	Class	       "Terra"

	Mass            0.614846
	Radius          5230
	InertiaMoment   0.326627

	Oblateness      0.00294337

	RotationPeriod  23.9808
	Obliquity       50.7337
	EqAscendNode    -41.7234

	AlbedoBond      0.36612
	AlbedoGeom      0.359
	Brightness      1.5
	Color          (0.723 0.424 0.404)

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine/Terrestrial"
		Panspermia "false"
	}

	Surface
	{
		SurfStyle       0.0334296
		OceanStyle      0.610113
		Randomize      (-0.718, 0.762, -0.444)
		colorDistMagn   0.0963856
		colorDistFreq   653.113
		detailScale     13451.9
		colorConversion true
		drivenDarkening -1
		seaLevel        0.49191
		snowLevel       0.777778
		tropicLatitude  0.786797
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.920635
		climateTropic   0.68254
		climateEquator  0.357143
		heightTempGrad  0.375
		tropicWidth     0.201355
		mainFreq        0.9503
		venusFreq       0.85
		venusMagn       0.2573
		mareFreq        0.001
		mareDensity     0
		terraceProb     0.327453
		erosion         0.12029
		montesMagn      0.165926
		montesFreq      404.762
		montesSpiky     0.983196
		montesFraction  0.882997
		dunesMagn       0.0360777
		dunesFreq       46.375
		dunesFraction   0.551064
		hillsMagn       0.114799
		hillsFreq       425.887
		hillsFraction   0.728687
		hills2Fraction  0.177889
		riversMagn      100
		riversFreq      0
		riversSin       3.25397
		riversOctaves   0
		canyonsMagn     0.0440713
		canyonsFreq     100
		canyonFraction  0.98691
		cracksMagn      0
		cracksFreq      0.287603
		cracksOctaves   0
		craterMagn      0.608554
		craterFreq      15.5721
		craterDensity   0
		craterOctaves   0
		craterRayedFactor 0
		volcanoMagn     0.563492
		volcanoFreq     0.460317
		volcanoDensity  0.308869
		volcanoOctaves  2
		volcanoActivity 0.553331
		volcanoFlows    0.695974
		volcanoRadius   0.452381
		volcanoTemp     1157.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.15493
		stripeFluct     0
		stripeTwist     0.4933
		cycloneMagn     14.127
		cycloneFreq     0.84127
		cycloneDensity  0.571429
		cycloneOctaves  2
		colorSea       (0.651, 0.267, 0.290, 1.000)
		colorShelf     (0.150, 0.370, 0.370, 1.000)
		colorBeach     (0.820, 0.730, 0.570, 0.000)
		colorDesert    (0.420, 0.360, 0.220, 0.000)
		colorLowland   (0.220, 0.230, 0.220, 0.000)
		colorUpland    (0.570, 0.540, 0.420, 0.000)
		colorRock      (0.100, 0.100, 0.100, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.308)
		colorLowPlants (0.204, 0.176, 0.123, 0.000)
		colorUpPlants  (0.217, 0.206, 0.174, 0.000)
		BumpHeight      20
		BumpOffset      9.8382
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
		Height          7.9458
		Velocity        50.3607
		BumpHeight      6.22945
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.8143
		mainOctaves     10
		Coverage        0.2513
		stripeZones     2.15493
		stripeFluct     0
		stripeTwist     0.4933
	}

	Clouds
	{
		Height          15.8921
		Velocity        129.204
		BumpHeight      5.48036
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.8143
		mainOctaves     10
		Coverage        0.2513
		stripeZones     2.15493
		stripeFluct     0
		stripeTwist     0.4933
	}

	Ocean
	{
		Height          9.8382
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
	}

	NoLava          true

	Atmosphere
	{
		Model          "Chlorine"
		Height          63.4531
		Density         2.36199
		Pressure        1.88951
		Greenhouse      42.6144
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.208526
		Saturation      1.30159

		Composition
		{
			N2    	77.4322
			O2    	18.48
			Ar    	2.71241
			H2O   	0.968611
			CO2   	0.40674
		}
	}

	Aurora
	{
		Height      56.8538
		NorthLat    66.0289
		NorthLon    -144.37
		NorthRadius 1611.5
		NorthWidth  455.622
		NorthRings  4
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -76.06
		SouthLon    56.0681
		SouthRadius 1315.85
		SouthWidth  402.067
		SouthRings  3
		SouthBright 0.3
		SouthParticles 50000
		TopColor    (0.000 1.000 0.000)
		BottomColor (0.000 1.000 0.000)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.26854
		Period          1.34366
		Eccentricity    0.0547657
		Inclination     1.48613
		AscendingNode   -39.4683
		ArgOfPericenter 158.839
		MeanAnomaly     207.684
	}
}



Moon	"Dathomir.1"
{
	ParentBody     "Dathomir"
	Class	       "Selena"

	Mass            0.015487
	Radius          1841
	InertiaMoment   0.357155

	Oblateness      0.008627

	Obliquity       0.246912
	EqAscendNode    47.0644
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.947 0.928 0.919)

	Surface
	{
		SurfStyle       0.416032
		OceanStyle      0.333844
		Randomize      (-0.852, -0.559, 0.658)
		colorDistMagn   0.0510118
		colorDistFreq   227.025
		detailScale     4735.16
		colorConversion true
		drivenDarkening 0
		seaLevel        0.206187
		snowLevel       2
		tropicLatitude  0.00790346
		icecapLatitude  10
		icecapHeight    0.0838449
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.58434
		venusFreq       2
		venusMagn       0
		mareFreq        0.993595
		mareDensity     0.0114745
		terraceProb     0.132203
		erosion         0
		montesMagn      0.112036
		montesFreq      106.833
		montesSpiky     0.826037
		montesFraction  0.081403
		dunesMagn       0.0402681
		dunesFreq       2404.45
		dunesFraction   0.610453
		hillsMagn       0.104302
		hillsFreq       216.882
		hillsFraction   0.696204
		hills2Fraction  0
		riversMagn      58.0654
		riversFreq      3.09749
		riversSin       6.89081
		riversOctaves   0
		canyonsMagn     0.597841
		canyonsFreq     0.625571
		canyonFraction  0.952702
		cracksMagn      0.021093
		cracksFreq      0.857569
		cracksOctaves   0
		craterMagn      0.616192
		craterFreq      5.48653
		craterDensity   0.861089
		craterOctaves   11
		craterRayedFactor 0.199446
		volcanoMagn     0.274595
		volcanoFreq     0.706187
		volcanoDensity  0.282974
		volcanoOctaves  3
		volcanoActivity 0.659841
		volcanoFlows    0.318072
		volcanoRadius   0.247367
		volcanoTemp     1265.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.420, 0.420, 0.430, 0.000)
		colorShelf     (0.470, 0.480, 0.480, 0.000)
		colorBeach     (0.431, 0.445, 0.468, 0.000)
		colorDesert    (0.376, 0.359, 0.358, 0.000)
		colorLowland   (0.478, 0.476, 0.436, 0.000)
		colorUpland    (0.509, 0.507, 0.475, 0.000)
		colorRock      (0.340, 0.340, 0.340, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.99998
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
		Height          89.1564
		Density         2.03018e-006
		Pressure        4.7796e-007
		Greenhouse      0.00298932
		Bright          1.15214
		Opacity         0
		SkyLight        0.384048
		Hue             0
		Saturation      1

		Composition
		{
			Kr    	90.2231
			Xe    	9.77694
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000210466
		Period          0.00222417
		Eccentricity    0.0008622
		Inclination     0.246912
		AscendingNode   47.0644
		ArgOfPericenter 309.482
		MeanAnomaly     3.48401
	}
}



Moon	"Dathomir.2"
{
	ParentBody     "Dathomir"
	Class	       "Selena"

	Mass            0.00218693
	Radius          1002.45
	InertiaMoment   0.399984

	Oblateness      0.00283197

	Obliquity       -0.683113
	EqAscendNode    -94.684
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.906 0.871 0.839)

	Surface
	{
		SurfStyle       0.610453
		OceanStyle      0.696204
		Randomize      (-0.168, -0.332, -0.837)
		colorDistMagn   0.0639294
		colorDistFreq   141.06
		detailScale     2578.36
		colorConversion true
		drivenDarkening 0
		seaLevel        0.158831
		snowLevel       2
		tropicLatitude  0.0161571
		icecapLatitude  10
		icecapHeight    0.177358
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.08213
		venusFreq       1.04722
		venusMagn       0
		mareFreq        0.255912
		mareDensity     0.00140819
		terraceProb     0.35076
		erosion         0
		montesMagn      0.0728919
		montesFreq      34.9704
		montesSpiky     0.934304
		montesFraction  0.605304
		dunesMagn       0.0347135
		dunesFreq       1291.35
		dunesFraction   0.188982
		hillsMagn       0.129497
		hillsFreq       126.961
		hillsFraction   0.088606
		hills2Fraction  0
		riversMagn      60.6899
		riversFreq      3.62228
		riversSin       3.82639
		riversOctaves   0
		canyonsMagn     0.478952
		canyonsFreq     0.225851
		canyonFraction  0.0745705
		cracksMagn      0.0531031
		cracksFreq      0.491205
		cracksOctaves   0
		craterMagn      0.616452
		craterFreq      2.68391
		craterDensity   0.947014
		craterOctaves   10
		craterRayedFactor 0.135451
		volcanoMagn     0.180904
		volcanoFreq     0.602068
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 1.57139
		volcanoFlows    0.211939
		volcanoRadius   0.133041
		volcanoTemp     1377.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.430, 0.400, 0.370, 0.000)
		colorShelf     (0.620, 0.600, 0.530, 0.000)
		colorBeach     (0.304, 0.298, 0.262, 0.000)
		colorDesert    (0.319, 0.303, 0.267, 0.000)
		colorLowland   (0.250, 0.225, 0.204, 0.000)
		colorUpland    (0.368, 0.347, 0.301, 0.000)
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
		SemiMajorAxis   0.000334118
		Period          0.00449651
		Eccentricity    0.00943088
		Inclination     -0.683113
		AscendingNode   -94.684
		ArgOfPericenter 143.685
		MeanAnomaly     67.6413
	}
}



Moon	"Dathomir.3"
{
	ParentBody     "Dathomir"
	Class	       "Desert"

	Mass            0.0186591
	Radius          1622.39
	InertiaMoment   0.356302

	Obliquity       -1.78645
	EqAscendNode    37.8417
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.791 0.744 0.749)

	Surface
	{
		SurfStyle       0.188982
		OceanStyle      0.088606
		Randomize      (0.221, 0.392, 0.211)
		colorDistMagn   0.0710871
		colorDistFreq   171.28
		detailScale     4172.88
		colorConversion true
		drivenDarkening -1
		seaLevel        0.0489621
		snowLevel       1
		tropicLatitude  0.0589544
		icecapLatitude  0.943712
		icecapHeight    0.0507814
		climatePole     0.880952
		climateTropic   0.52381
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.931004
		venusFreq       1
		venusMagn       0.402902
		mareFreq        0.963708
		mareDensity     0.0393085
		terraceProb     0.298202
		erosion         0
		montesMagn      0.072429
		montesFreq      67.386
		montesSpiky     0.809427
		montesFraction  0.663574
		dunesMagn       0.0528658
		dunesFreq       17.0465
		dunesFraction   0.00634345
		hillsMagn       0.12883
		hillsFreq       124.419
		hillsFraction   0
		hills2Fraction  0
		riversMagn      64.4494
		riversFreq      1.49243
		riversSin       6.77281
		riversOctaves   0
		canyonsMagn     0.0421477
		canyonsFreq     44.0771
		canyonFraction  0
		cracksMagn      0.108414
		cracksFreq      0.135927
		cracksOctaves   0
		craterMagn      0.640345
		craterFreq      4.52264
		craterDensity   0.657127
		craterOctaves   8
		craterRayedFactor 0
		volcanoMagn     0.232414
		volcanoFreq     0.769182
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.710663
		volcanoRadius   0.189815
		volcanoTemp     1378.51
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
		Hapke           0.814811
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
		Height          35.4645
		Density         0.017935
		Pressure        0.00602522
		Greenhouse      0.134965
		Bright          7.13712
		Opacity         1
		SkyLight        2.37904
		Hue             0
		Saturation      1

		Composition
		{
			SO2   	99.985
			Kr    	0.0117026
			Xe    	0.00327662
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000530246
		Period          0.00887198
		Eccentricity    0.016484
		Inclination     -1.78645
		AscendingNode   37.8417
		ArgOfPericenter 99.8705
		MeanAnomaly     133.894
	}
}



Moon	"Koratas"
{
	ParentBody     "Dathomir"
	Class	       "Desert"

	Mass            0.0367166
	Radius          2203.7
	InertiaMoment   0.353255

	Obliquity       3.84615
	EqAscendNode    36.8965
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.793 0.627 0.477)

	Surface
	{
		SurfStyle       0.903968
		OceanStyle      0.00634345
		Randomize      (-0.622, -0.823, -0.851)
		colorDistMagn   0.0482779
		colorDistFreq   311.945
		detailScale     5668.04
		colorConversion true
		drivenDarkening -1
		seaLevel        0.0785528
		snowLevel       1
		tropicLatitude  0.127003
		icecapLatitude  0.916601
		icecapHeight    0.084645
		climatePole     0.269841
		climateTropic   0.103175
		climateEquator  0.253968
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.656256
		venusFreq       1
		venusMagn       0.502076
		mareFreq        0.658703
		mareDensity     0.0191908
		terraceProb     0.175053
		erosion         0
		montesMagn      0.113384
		montesFreq      74.7711
		montesSpiky     0.94939
		montesFraction  0.832026
		dunesMagn       0.0597842
		dunesFreq       18.6425
		dunesFraction   0.868644
		hillsMagn       0.100642
		hillsFreq       260.72
		hillsFraction   0
		hills2Fraction  0
		riversMagn      48.9476
		riversFreq      3.53992
		riversSin       4.87399
		riversOctaves   0
		canyonsMagn     0.0450193
		canyonsFreq     59.9002
		canyonFraction  0
		cracksMagn      0.0936861
		cracksFreq      0.226871
		cracksOctaves   0
		craterMagn      0.598159
		craterFreq      6.25253
		craterDensity   0.798829
		craterOctaves   11
		craterRayedFactor 0
		volcanoMagn     0.461577
		volcanoFreq     0.661672
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 1.41465
		volcanoFlows    0.841958
		volcanoRadius   0.277236
		volcanoTemp     1395.25
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.59015
		stripeFluct     0
		stripeTwist     0.799946
		cycloneMagn     2.1058
		cycloneFreq     0.806599
		cycloneDensity  0.462261
		cycloneOctaves  4
		colorSea       (0.640, 0.500, 0.420, 0.000)
		colorShelf     (0.680, 0.500, 0.470, 0.000)
		colorBeach     (0.480, 0.380, 0.280, 0.000)
		colorDesert    (0.600, 0.078, 0.019, 0.000)

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
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Clouds
	{
		Height          15.71069
		Velocity        50.3607
		BumpHeight      3.00861
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.926513
		mainOctaves     10
		Coverage        0.141616
		stripeZones     1.59015
		stripeFluct     0
		stripeTwist     0.799946
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Titan"
		Height          38.4515
		Density         0.14758
		Pressure        0.0732951
		Greenhouse      1.07129
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0
		Saturation      1

		Composition
		{
			CO2   	78.8125
			SO2   	7.50667
			H2S   	5.89262
			C2H2  	4.28653
			CH4   	1.83525
			NH3   	0.670095
			C2H6  	0.40033
			C3H8  	0.249567
			N2    	0.126805
			C2H4  	0.123349
			H2O   	0.0956202
			CO    	0.000587167
			Ne    	5.35664e-005
			Ar    	2.85522e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000885139
		Period          0.0188677
		Eccentricity    0.0223483
		Inclination     3.84615
		AscendingNode   36.8965
		ArgOfPericenter -13.0684
		MeanAnomaly     64.8845
	}
}





Planet	"Babygnon"
{
	ParentBody     "Domir"
	Class	       "IceGiant"

	Mass            20.5684
	Radius          22296.2
	InertiaMoment   0.247788

	Oblateness      0.0283789

	RotationPeriod  10.2285
	Obliquity       -39.4995
	EqAscendNode    -127.577

	AlbedoBond      0.510395
	AlbedoGeom      0.612474
	Brightness      2

	Surface
	{
		SurfStyle       0.57865
		Randomize      (-0.640, 0.613, 0.472)
		detailScale     57347.2
		colorConversion true
		tropicLatitude  0.618839
		icecapLatitude  1
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     4.56564
		stripeFluct     0.372324
		stripeTwist     11.4508
		cycloneMagn     12.417
		cycloneFreq     0.581797
		cycloneDensity  0.507139
		cycloneOctaves  1
		colorLayer0    (0.570, 0.550, 0.480, 1.000)
		colorLayer1    (0.850, 0.860, 0.870, 1.000)
		colorLayer2    (0.450, 0.390, 0.260, 1.000)
		colorLayer3    (0.430, 0.330, 0.170, 1.000)
		colorLayer4    (0.830, 0.830, 0.830, 1.000)
		colorLayer5    (0.510, 0.400, 0.140, 1.000)
		colorLayer6    (0.370, 0.350, 0.280, 1.000)
		colorLayer7    (0.420, 0.390, 0.310, 1.000)
		colorLowPlants (0.830, 0.830, 0.830, 1.000)
		colorUpPlants  (0.510, 0.400, 0.140, 1.000)
		BumpHeight      15.4158
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          98.4336
		Velocity        1649.47
		BumpHeight      58.5318
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.621302
		mainOctaves     12
		Coverage        0.551977
		stripeZones     4.56564
		stripeFluct     0.372324
		stripeTwist     11.4508
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Jupiter"
		Height          222.962
		Density         1429.69
		Pressure        262001
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0208013
		Saturation      0.997238

		Composition
		{
			H2    	91.3478
			He    	8.28969
			CH4   	0.27868
			N2    	0.0405502
			NH3   	0.0275485
			O2    	0.00784134
			C2H2  	0.00353683
			Ne    	0.00127114
			C2H4  	0.00119416
			Ar    	0.000967231
			C2H6  	0.000583298
			C3H8  	0.000316022
		}
	}

	Aurora
	{
		Height      190.446
		NorthLat    58.4503
		NorthLon    155.165
		NorthRadius 4449.27
		NorthWidth  1259.67
		NorthRings  4
		NorthBright 1
		NorthParticles 10000
		SouthLat    -58.5085
		SouthLon    328.725
		SouthRadius 5038.94
		SouthWidth  1677.74
		SouthRings  3
		SouthBright 1
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	Rings
	{
		InnerRadius     32486.8
		OuterRadius     55033.4
		RotationPeriod  5.59243
		RotationOffset  0
		FrontBright     0.26482
		BackBright      0.51059
		Density         0.0694625
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.32573        SemiMajorAxis   2.32573
		Period          3.31592

		Eccentricity    0.09407
		Inclination     -2.49765
		AscendingNode   -121.834
		ArgOfPericenter 268.363
		MeanAnomaly     23.6944
	}
}



Moon	"Babygnon.1"
{
	ParentBody     "Babygnon"
	Class	       "Selena"

	Mass            0.0003677
	Radius          549.096
	InertiaMoment   0.399685

	Oblateness      0.0080288

	Obliquity       -0.61234
	EqAscendNode    161.099
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.455 0.449 0.442)

	Surface
	{
		SurfStyle       0.492789
		OceanStyle      0.077843
		Randomize      (0.341, 0.365, 0.097)
		colorDistMagn   0.0702036
		colorDistFreq   66.4501
		detailScale     1412.31
		colorConversion true
		drivenDarkening 0
		seaLevel        0.211242
		snowLevel       2
		tropicLatitude  0.00350407
		icecapLatitude  4.54411
		icecapHeight    0.205027
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.84335
		venusFreq       1.23119
		venusMagn       0
		mareFreq        0
		mareDensity     0.000316672
		terraceProb     0.307034
		erosion         0
		montesMagn      0.0601893
		montesFreq      25.2413
		montesSpiky     0.962247
		montesFraction  0.785797
		dunesMagn       0.0300324
		dunesFreq       728.608
		dunesFraction   0.47802
		hillsMagn       0.127792
		hillsFreq       54.6654
		hillsFraction   0.562669
		hills2Fraction  0
		riversMagn      66.8914
		riversFreq      3.61018
		riversSin       5.22823
		riversOctaves   0
		canyonsMagn     0.31515
		canyonsFreq     0.173853
		canyonFraction  0.813967
		cracksMagn      0.0375293
		cracksFreq      0.2413
		cracksOctaves   0
		craterMagn      0.553464
		craterFreq      1.7886
		craterDensity   0.855403
		craterOctaves   8.74805
		craterRayedFactor 0.205791
		volcanoMagn     0.196374
		volcanoFreq     0.83308
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.341361
		volcanoRadius   0.127097
		volcanoTemp     1449.12
		lavaCoverTidal  0.0311047
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.420, 0.420, 0.430, 0.000)
		colorShelf     (0.470, 0.480, 0.480, 0.000)
		colorBeach     (0.250, 0.256, 0.265, 0.000)
		colorDesert    (0.218, 0.207, 0.203, 0.000)
		colorLowland   (0.278, 0.274, 0.248, 0.000)
		colorUpland    (0.296, 0.292, 0.270, 0.000)
		colorRock      (0.340, 0.340, 0.340, 0.000)
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
		SemiMajorAxis   0.000753731
		Period          0.00263876
		Eccentricity    0.0240144
		Inclination     -0.61234
		AscendingNode   161.099
		ArgOfPericenter -80.8383
		MeanAnomaly     -4.21557
	}
}



Moon	"Babygnon.2"
{
	ParentBody     "Babygnon"
	Class	       "Selena"

	Mass            0.000434137
	Radius          627.629
	InertiaMoment   0.399209

	Oblateness      0.00225854

	Obliquity       -0.961992
	EqAscendNode    153.036
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.507 0.498 0.494)

	Surface
	{
		SurfStyle       0.773594
		OceanStyle      0.0910609
		Randomize      (-0.159, -0.236, 0.622)
		colorDistMagn   0.0695855
		colorDistFreq   96.8062
		detailScale     1614.3
		colorConversion true
		drivenDarkening 0
		seaLevel        0.124673
		snowLevel       2
		tropicLatitude  0.00782768
		icecapLatitude  4.01813
		icecapHeight    0.135376
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.74544
		venusFreq       0.783315
		venusMagn       0
		mareFreq        0.0185943
		mareDensity     0.000264979
		terraceProb     0.103895
		erosion         0
		montesMagn      0.0598416
		montesFreq      31.7518
		montesSpiky     0.793753
		montesFraction  0.362641
		dunesMagn       0.0538484
		dunesFreq       812.006
		dunesFraction   0.0159261
		hillsMagn       0.102715
		hillsFreq       84.0547
		hillsFraction   0.683613
		hills2Fraction  0
		riversMagn      58.4256
		riversFreq      3.40034
		riversSin       6.45673
		riversOctaves   0
		canyonsMagn     0.565203
		canyonsFreq     0.216601
		canyonFraction  0.4502
		cracksMagn      0.0546668
		cracksFreq      0.142915
		cracksOctaves   0
		craterMagn      0.526425
		craterFreq      2.15051
		craterDensity   0.919123
		craterOctaves   9
		craterRayedFactor 0.157901
		volcanoMagn     0.208358
		volcanoFreq     0.689472
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 1.37663
		volcanoFlows    0.189742
		volcanoRadius   0.146817
		volcanoTemp     1477.24
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.470, 0.400, 0.340, 0.000)
		colorShelf     (0.640, 0.600, 0.470, 0.000)
		colorBeach     (0.319, 0.304, 0.237, 0.000)
		colorDesert    (0.339, 0.309, 0.242, 0.000)
		colorLowland   (0.279, 0.229, 0.193, 0.000)
		colorUpland    (0.395, 0.354, 0.257, 0.000)
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
		SemiMajorAxis   0.0012433
		Period          0.00559034
		Eccentricity    0.04318
		Inclination     -0.961992
		AscendingNode   153.036
		ArgOfPericenter -109.46
		MeanAnomaly     123.476
	}
}



Moon	"Babygnon.3"
{
	ParentBody     "Babygnon"
	Class	       "Selena"

	Mass            0.00050977
	Radius          611.936
	InertiaMoment   0.398683

	Obliquity       0.123812
	EqAscendNode    173.393
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.443 0.436 0.430)

	Surface
	{
		SurfStyle       0.775669
		OceanStyle      0.486253
		Randomize      (0.668, 0.014, -0.503)
		colorDistMagn   0.0550295
		colorDistFreq   83.5994
		detailScale     1573.93
		colorConversion true
		drivenDarkening 0
		seaLevel        0.327817
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  3.80397
		icecapHeight    0.245712
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.77156
		venusFreq       1.00278
		venusMagn       0
		mareFreq        0.00872883
		mareDensity     0.000430343
		terraceProb     0.160751
		erosion         0
		montesMagn      0.0628357
		montesFreq      31.5118
		montesSpiky     0.922527
		montesFraction  0.840589
		dunesMagn       0.0359482
		dunesFreq       803.139
		dunesFraction   0.164343
		hillsMagn       0.104112
		hillsFreq       78.5532
		hillsFraction   0.450668
		hills2Fraction  0
		riversMagn      53.5809
		riversFreq      3.76392
		riversSin       4.55315
		riversOctaves   0
		canyonsMagn     0.507552
		canyonsFreq     0.244373
		canyonFraction  0.983524
		cracksMagn      0.0532003
		cracksFreq      0.41239
		cracksOctaves   0
		craterMagn      0.647745
		craterFreq      1.59577
		craterDensity   0.945016
		craterOctaves   9
		craterRayedFactor 0.176782
		volcanoMagn     0.163776
		volcanoFreq     0.808386
		volcanoDensity  0.225658
		volcanoOctaves  3
		volcanoActivity 0.326966
		volcanoFlows    0.453619
		volcanoRadius   0.137999
		volcanoTemp     1179.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.470, 0.400, 0.340, 0.000)
		colorShelf     (0.640, 0.600, 0.470, 0.000)
		colorBeach     (0.279, 0.266, 0.207, 0.000)
		colorDesert    (0.297, 0.270, 0.211, 0.000)
		colorLowland   (0.244, 0.200, 0.168, 0.000)
		colorUpland    (0.346, 0.309, 0.224, 0.000)
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
		SemiMajorAxis   0.00205086
		Period          0.0118434
		Eccentricity    0.0353945
		Inclination     0.123812
		AscendingNode   173.393
		ArgOfPericenter -149.671
		MeanAnomaly     -73.2946
	}
}



DwarfMoon	"Babygnon.D1"
{
	ParentBody     "Babygnon"
	Class	       "Asteroid"

	Mass            6.23936e-009
	Radius          24.6118
	InertiaMoment   0.39916

	Obliquity       -34.2329
	EqAscendNode    36.542
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.701 0.698 0.696)

	Surface
	{
		SurfStyle       0.114782
		OceanStyle      0.751528
		Randomize      (-0.651, -0.074, 0.565)
		colorDistMagn   0.575658
		colorDistFreq   0.0472542
		detailScale     672.066
		colorConversion true
		snowLevel       2
		tropicLatitude  0.903177
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.439211
		terraceProb     0.15983
		erosion         0
		montesMagn      0.572326
		montesFreq      2.44488
		montesSpiky     0.874121
		montesFraction  0.422692
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.5831
		hillsFraction   0.641205
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.215535
		craterFreq      0.249996
		craterDensity   0.752792
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.464933
		volcanoTemp     1476.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.280, 0.279, 0.278, 0.000)
		colorShelf     (0.298, 0.297, 0.296, 0.000)
		colorBeach     (0.315, 0.314, 0.313, 0.000)
		colorDesert    (0.333, 0.332, 0.331, 0.000)
		colorLowland   (0.350, 0.349, 0.348, 0.000)
		colorUpland    (0.368, 0.366, 0.365, 0.000)
		colorRock      (0.385, 0.384, 0.383, 0.000)
		colorSnow      (0.403, 0.401, 0.400, 1.000)
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
		SemiMajorAxis   0.00916603
		Period          0.111905
		Eccentricity    0.208424
		Inclination     -34.2329
		AscendingNode   36.542
		ArgOfPericenter 114.423
		MeanAnomaly     -35.2347
	}
}



DwarfMoon	"Babygnon.D2"
{
	ParentBody     "Babygnon"
	Class	       "Asteroid"

	Mass            8.55189e-009
	Radius          32.4521
	InertiaMoment   0.395499

	RotationPeriod  1419.07
	Obliquity       89.9165
	EqAscendNode    -169.644

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.452 0.446 0.439)

	Surface
	{
		SurfStyle       0.15374
		OceanStyle      0.531717
		Randomize      (-0.925, 0.747, -0.275)
		colorDistMagn   0.0668067
		colorDistFreq   0.673234
		detailScale     886.159
		colorConversion true
		snowLevel       2
		tropicLatitude  0.179758
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.589774
		terraceProb     0.352104
		erosion         0
		montesMagn      0.337676
		montesFreq      3.8074
		montesSpiky     0.917066
		montesFraction  0.567523
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.43714
		hillsFraction   0.697141
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.294105
		craterFreq      0.217801
		craterDensity   0.963283
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.569891
		volcanoTemp     1249.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.181, 0.178, 0.176, 0.000)
		colorShelf     (0.192, 0.190, 0.186, 0.000)
		colorBeach     (0.203, 0.201, 0.197, 0.000)
		colorDesert    (0.215, 0.212, 0.208, 0.000)
		colorLowland   (0.226, 0.223, 0.219, 0.000)
		colorUpland    (0.237, 0.234, 0.230, 0.000)
		colorRock      (0.248, 0.245, 0.241, 0.000)
		colorSnow      (0.260, 0.257, 0.252, 1.000)
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
		SemiMajorAxis   0.00967823
		Period          0.121415
		Eccentricity    0.170461
		Inclination     89.9165
		AscendingNode   -169.644
		ArgOfPericenter 15.1519
		MeanAnomaly     2.01221
	}
}

DwarfMoon	"Babygnon.D3"
{
	ParentBody     "Babygnon"
	Class	       "Asteroid"

	Mass            1.16762e-008
	Radius          33.2634
	InertiaMoment   0.398223

	Obliquity       -43.9462
	EqAscendNode    33.6184
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.797 0.794 0.792)

	Surface
	{
		SurfStyle       0.202367
		OceanStyle      0.787411
		Randomize      (0.135, -0.592, -0.990)
		colorDistMagn   0.771771
		colorDistFreq   0.676096
		detailScale     908.312
		colorConversion true
		snowLevel       2
		tropicLatitude  0.993093
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.403687
		terraceProb     0.211668
		erosion         0
		montesMagn      0.46366
		montesFreq      3.13767
		montesSpiky     0.946437
		montesFraction  0.350581
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.76702
		hillsFraction   0.927458
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.203895
		craterFreq      0.179563
		craterDensity   0.9624
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.527777
		volcanoTemp     1547.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.319, 0.318, 0.317, 0.000)
		colorShelf     (0.339, 0.338, 0.336, 0.000)
		colorBeach     (0.359, 0.358, 0.356, 0.000)
		colorDesert    (0.379, 0.377, 0.376, 0.000)
		colorLowland   (0.398, 0.397, 0.396, 0.000)
		colorUpland    (0.418, 0.417, 0.416, 0.000)
		colorRock      (0.438, 0.437, 0.435, 0.000)
		colorSnow      (0.458, 0.457, 0.455, 1.000)
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
		SemiMajorAxis   0.0103265
		Period          0.133816
		Eccentricity    0.00622288
		Inclination     -43.9462
		AscendingNode   33.6184
		ArgOfPericenter -83.9208
		MeanAnomaly     53.7941
	}
}



DwarfMoon	"Babygnon.D4"
{
	ParentBody     "Babygnon"
	Class	       "Asteroid"

	Mass            1.58958e-008
	Radius          35.3163
	InertiaMoment   0.399295

	Obliquity       59.9229
	EqAscendNode    -102.332
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.838 0.801 0.727)

	Surface
	{
		SurfStyle       0.258667
		OceanStyle      0.713975
		Randomize      (0.816, -0.645, 0.179)
		colorDistMagn   0.316293
		colorDistFreq   0.62528
		detailScale     964.371
		colorConversion true
		snowLevel       2
		tropicLatitude  0.91159
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.562873
		terraceProb     0.269802
		erosion         0
		montesMagn      0.451957
		montesFreq      2.82785
		montesSpiky     0.912998
		montesFraction  0.486153
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.76015
		hillsFraction   0.467056
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245341
		craterFreq      0.221026
		craterDensity   0.804198
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.496496
		volcanoTemp     1323.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.335, 0.320, 0.291, 0.000)
		colorShelf     (0.356, 0.340, 0.309, 0.000)
		colorBeach     (0.377, 0.360, 0.327, 0.000)
		colorDesert    (0.398, 0.380, 0.345, 0.000)
		colorLowland   (0.419, 0.400, 0.364, 0.000)
		colorUpland    (0.440, 0.420, 0.382, 0.000)
		colorRock      (0.461, 0.440, 0.400, 0.000)
		colorSnow      (0.482, 0.460, 0.418, 1.000)
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
		SemiMajorAxis   0.0107624
		Period          0.142378
		Eccentricity    0.253446
		Inclination     59.9229
		AscendingNode   -102.332
		ArgOfPericenter -68.2257
		MeanAnomaly     138.023
	}
}



DwarfMoon	"Babygnon.D5"
{
	ParentBody     "Babygnon"
	Class	       "Asteroid"

	Mass            2.1598e-008
	Radius          37.503
	InertiaMoment   0.39643

	Obliquity       -33.1655
	EqAscendNode    66.1365
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.747 0.746 0.744)

	Surface
	{
		SurfStyle       0.852415
		OceanStyle      0.0513298
		Randomize      (0.156, 0.580, 0.708)
		colorDistMagn   0.517112
		colorDistFreq   0.884584
		detailScale     1024.08
		colorConversion true
		snowLevel       2
		tropicLatitude  0.814864
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.559277
		terraceProb     0.186931
		erosion         0
		montesMagn      0.538124
		montesFreq      3.77608
		montesSpiky     0.771714
		montesFraction  0.315456
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.26819
		hillsFraction   0.775398
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.272816
		craterFreq      0.229835
		craterDensity   1.03226
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.471028
		volcanoTemp     1557.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.254, 0.261, 0.298, 0.050)
		colorShelf     (0.299, 0.306, 0.342, 0.040)
		colorBeach     (0.344, 0.351, 0.387, 0.030)
		colorDesert    (0.389, 0.395, 0.439, 0.020)
		colorLowland   (0.433, 0.440, 0.484, 0.030)
		colorUpland    (0.478, 0.485, 0.529, 0.050)
		colorRock      (0.523, 0.530, 0.588, 0.020)
		colorSnow      (0.523, 0.530, 0.588, 1.000)
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
		SemiMajorAxis   0.0110277
		Period          0.147674
		Eccentricity    0.174825
		Inclination     -33.1655
		AscendingNode   66.1365
		ArgOfPericenter -149.731
		MeanAnomaly     40.9285
	}
}





Planet	"Barmasel"
{
	ParentBody     "Domir"
	Class	       "IceGiant"

	Mass            20.6375
	Radius          22510
	InertiaMoment   0.228379

	Oblateness      0.0291111

	RotationPeriod  9.89891
	Obliquity       -128.723
	EqAscendNode    162.334

	AlbedoBond      0.487238
	AlbedoGeom      0.584686
	Brightness      2

	Surface
	{
		SurfStyle       0.427283
		Randomize      (0.167, -0.162, -0.084)
		detailScale     57896.9
		colorConversion true
		tropicLatitude  0.787537
		icecapLatitude  1
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     7.87906
		stripeFluct     0.355301
		stripeTwist     10.1594
		cycloneMagn     6.42218
		cycloneFreq     0.678175
		cycloneDensity  0.321928
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
		BumpHeight      15.5375
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          99.3633
		Velocity        1417.83
		BumpHeight      60.9873
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.31453
		mainOctaves     12
		Coverage        0.436191
		stripeZones     7.87906
		stripeFluct     0.355301
		stripeTwist     10.1594
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          225.1
		Density         1459.42
		Pressure        268739
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.0117394
		Saturation      0.938728

		Composition
		{
			H2    	92.1475
			He    	7.45116
			CH4   	0.314783
			N2    	0.0431338
			NH3   	0.026471
			O2    	0.00820134
			C2H2  	0.00386144
			C2H4  	0.00150573
			Ne    	0.00120871
			Ar    	0.00104597
			C2H6  	0.000784055
			C3H8  	0.00034333
		}
	}

	Aurora
	{
		Height      314.149
		NorthLat    80.693
		NorthLon    -17.2905
		NorthRadius 5895.6
		NorthWidth  1476.17
		NorthRings  5
		NorthBright 1
		NorthParticles 10000
		SouthLat    -89.4536
		SouthLon    159.501
		SouthRadius 6693.32
		SouthWidth  2046.69
		SouthRings  4
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
		SemiMajorAxis   4.54637
			Eccentricity    0.00490274
		Inclination     -0.701244
		AscendingNode   165.369
		ArgOfPericenter 206.955
		MeanAnomaly     231.841
	}
}



Moon	"Barmasel.1"
{
	ParentBody     "Barmasel"
	Class	       "Selena"

	Mass            0.00155464
	Radius          885.215
	InertiaMoment   0.399746

	Oblateness      0.0104699

	Obliquity       1.38462
	EqAscendNode    -162.294
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.689 0.685 0.681)

	Surface
	{
		SurfStyle       0.858951
		OceanStyle      0.0188469
		Randomize      (-0.544, 0.246, 0.364)
		colorDistMagn   0.0629724
		colorDistFreq   94.9744
		detailScale     2276.82
		colorConversion true
		drivenDarkening 0
		seaLevel        0.174366
		snowLevel       2
		tropicLatitude  0.00743723
		icecapLatitude  10
		icecapHeight    0.208162
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.69111
		venusFreq       0.603188
		venusMagn       0
		mareFreq        0.224867
		mareDensity     0.000939044
		terraceProb     0.30336
		erosion         0
		montesMagn      0.0712228
		montesFreq      34.005
		montesSpiky     0.879104
		montesFraction  0.395105
		dunesMagn       0.0267073
		dunesFreq       1155.86
		dunesFraction   0.891373
		hillsMagn       0.139647
		hillsFreq       89.4711
		hillsFraction   0.806212
		hills2Fraction  0
		riversMagn      59.4266
		riversFreq      3.06825
		riversSin       6.77598
		riversOctaves   0
		canyonsMagn     0.467962
		canyonsFreq     0.271023
		canyonFraction  0.923183
		cracksMagn      0.0387538
		cracksFreq      0.231898
		cracksOctaves   0
		craterMagn      0.583487
		craterFreq      2.04203
		craterDensity   0.648661
		craterOctaves   7.69517
		craterRayedFactor 0.155012
		volcanoMagn     0.176277
		volcanoFreq     0.833567
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.195981
		volcanoRadius   0.134112
		volcanoTemp     1437.63
		lavaCoverTidal  0.256092
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.400, 0.350, 0.320, 0.000)
		colorShelf     (0.470, 0.410, 0.380, 0.000)
		colorBeach     (0.386, 0.322, 0.286, 0.000)
		colorDesert    (0.351, 0.302, 0.252, 0.000)
		colorLowland   (0.269, 0.233, 0.191, 0.000)
		colorUpland    (0.454, 0.411, 0.354, 0.000)
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
		SemiMajorAxis   0.000688654
		Period          0.00230057
		Eccentricity    0.0375241
		Inclination     1.38462
		AscendingNode   -162.294
		ArgOfPericenter 134.746
		MeanAnomaly     142.95
	}
}



Moon	"Barmasel.2"
{
	ParentBody     "Barmasel"
	Class	       "Selena"

	Mass            0.0180043
	Radius          1740.2
	InertiaMoment   0.365893

	Oblateness      0.00198697

	Obliquity       0.178674
	EqAscendNode    -93.9651
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.727 0.685 0.606)

	Surface
	{
		SurfStyle       0.0514265
		OceanStyle      0.863295
		Randomize      (0.561, -0.002, 0.791)
		colorDistMagn   0.0534529
		colorDistFreq   201.769
		detailScale     4475.88
		colorConversion true
		drivenDarkening 0
		seaLevel        0.192615
		snowLevel       2
		tropicLatitude  0.00425673
		icecapLatitude  10
		icecapHeight    0.14949
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.99852
		venusFreq       0.590543
		venusMagn       0
		mareFreq        0.668991
		mareDensity     0.00676365
		terraceProb     0.174296
		erosion         0
		montesMagn      0.100175
		montesFreq      97.8788
		montesSpiky     0.830902
		montesFraction  0.871541
		dunesMagn       0.025121
		dunesFreq       2306.64
		dunesFraction   0.768959
		hillsMagn       0.111979
		hillsFreq       162.353
		hillsFraction   0.0445886
		hills2Fraction  0
		riversMagn      64.1569
		riversFreq      2.85401
		riversSin       7.01519
		riversOctaves   0
		canyonsMagn     0.551811
		canyonsFreq     0.542977
		canyonFraction  0.0763455
		cracksMagn      0.0390727
		cracksFreq      0.916278
		cracksOctaves   0
		craterMagn      0.50694
		craterFreq      4.28181
		craterDensity   0.986804
		craterOctaves   11
		craterRayedFactor 0.0940646
		volcanoMagn     0.233672
		volcanoFreq     0.794739
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.426013
		volcanoRadius   0.187011
		volcanoTemp     1441.82
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.320, 0.320, 0.000)
		colorShelf     (0.370, 0.370, 0.370, 0.000)
		colorBeach     (0.364, 0.342, 0.303, 0.000)
		colorDesert    (0.451, 0.411, 0.346, 0.200)
		colorLowland   (0.487, 0.438, 0.388, 0.500)
		colorUpland    (0.509, 0.459, 0.400, 0.800)
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
		SemiMajorAxis   0.00099847
		Period          0.0040148
		Eccentricity    0.000935222
		Inclination     0.178674
		AscendingNode   -93.9651
		ArgOfPericenter -101.162
		MeanAnomaly     -84.8717
	}
}



DwarfMoon	"Barmasel.D9"
{
	ParentBody     "Barmasel"
	Class	       "Asteroid"

	Mass            8.44548e-008
	Radius          32.9896
	InertiaMoment   0.399843

	RotationPeriod  1037.34
	Obliquity       39.6171
	EqAscendNode    70.4584

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.707 0.703 0.702)

	Surface
	{
		SurfStyle       0.165082
		OceanStyle      0.423366
		Randomize      (0.359, -0.951, -0.178)
		colorDistMagn   0.869021
		colorDistFreq   0.302793
		detailScale     900.837
		colorConversion true
		snowLevel       2
		tropicLatitude  0.889265
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.561497
		terraceProb     0.633328
		erosion         0
		montesMagn      0.461059
		montesFreq      3.7938
		montesSpiky     0.98638
		montesFraction  0.62504
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.91
		hillsFraction   0.65657
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251332
		craterFreq      0.259458
		craterDensity   0.884505
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50298
		volcanoTemp     1265.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.283, 0.281, 0.281, 0.000)
		colorShelf     (0.300, 0.299, 0.298, 0.000)
		colorBeach     (0.318, 0.316, 0.316, 0.000)
		colorDesert    (0.336, 0.334, 0.333, 0.000)
		colorLowland   (0.353, 0.352, 0.351, 0.000)
		colorUpland    (0.371, 0.369, 0.369, 0.000)
		colorRock      (0.389, 0.387, 0.386, 0.000)
		colorSnow      (0.406, 0.404, 0.404, 1.000)
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
		SemiMajorAxis   0.0060002
		Period          0.0591698
		Eccentricity    0.464002
		Inclination     39.6171
		AscendingNode   70.4584
		ArgOfPericenter -31.4435
		MeanAnomaly     52.7698
	}
}



DwarfMoon	"Barmasel.D10"
{
	ParentBody     "Barmasel"
	Class	       "Asteroid"

	Mass            1.15291e-007
	Radius          64.5096
	InertiaMoment   0.397872

	Obliquity       -54.2187
	EqAscendNode    60.1235
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.616 0.614 0.610)

	Surface
	{
		SurfStyle       0.114449
		OceanStyle      0.93911
		Randomize      (-0.335, -0.464, -0.986)
		colorDistMagn   0.465898
		colorDistFreq   3.10235
		detailScale     1761.54
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999902
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.477714
		terraceProb     0.320942
		erosion         0
		montesMagn      0.233185
		montesFreq      2.58477
		montesSpiky     0.902625
		montesFraction  0.514002
		dunesFraction   0
		hillsMagn       0
		hillsFreq       12.4198
		hillsFraction   0.511565
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23294
		craterFreq      0.205701
		craterDensity   0.946681
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.496858
		volcanoTemp     1449.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.247, 0.246, 0.244, 0.000)
		colorShelf     (0.262, 0.261, 0.259, 0.000)
		colorBeach     (0.277, 0.276, 0.274, 0.000)
		colorDesert    (0.293, 0.292, 0.290, 0.000)
		colorLowland   (0.308, 0.307, 0.305, 0.000)
		colorUpland    (0.324, 0.322, 0.320, 0.000)
		colorRock      (0.339, 0.338, 0.335, 0.000)
		colorSnow      (0.354, 0.353, 0.351, 1.000)
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
		SemiMajorAxis   0.00643662
		Period          0.0657412
		Eccentricity    0.404382
		Inclination     -54.2187
		AscendingNode   60.1235
		ArgOfPericenter -80.3494
		MeanAnomaly     -36.5037
	}
}



DwarfMoon	"Barmasel.D11"
{
	ParentBody     "Barmasel"
	Class	       "Asteroid"

	Mass            1.57991e-007
	Radius          48.0013
	InertiaMoment   0.399057

	Obliquity       -35.0298
	EqAscendNode    90.6794
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.695 0.689 0.686)

	Surface
	{
		SurfStyle       0.228089
		OceanStyle      0.634434
		Randomize      (-0.583, 0.909, 0.560)
		colorDistMagn   0.677373
		colorDistFreq   1.28182
		detailScale     1310.76
		colorConversion true
		snowLevel       2
		tropicLatitude  0.73834
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.301665
		terraceProb     0.102632
		erosion         0
		montesMagn      0.485864
		montesFreq      2.85231
		montesSpiky     0.989314
		montesFraction  0.478178
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.29476
		hillsFraction   0.669694
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.269089
		craterFreq      0.248653
		craterDensity   0.912832
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.424179
		volcanoTemp     1392.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.278, 0.276, 0.275, 0.000)
		colorShelf     (0.295, 0.293, 0.292, 0.000)
		colorBeach     (0.313, 0.310, 0.309, 0.000)
		colorDesert    (0.330, 0.327, 0.326, 0.000)
		colorLowland   (0.347, 0.344, 0.343, 0.000)
		colorUpland    (0.365, 0.362, 0.360, 0.000)
		colorRock      (0.382, 0.379, 0.378, 0.000)
		colorSnow      (0.399, 0.396, 0.395, 1.000)
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
		SemiMajorAxis   0.00673044
		Period          0.0702937
		Eccentricity    0.300206
		Inclination     -35.0298
		AscendingNode   90.6794
		ArgOfPericenter 61.7282
		MeanAnomaly     -75.9004
	}
}



DwarfMoon	"Barmasel.D12"
{
	ParentBody     "Barmasel"
	Class	       "Asteroid"

	Mass            2.17569e-007
	Radius          87.5528
	InertiaMoment   0.399968

	RotationPeriod  1413.27
	Obliquity       70.6608
	EqAscendNode    -122.55

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.514 0.511 0.508)

	Surface
	{
		SurfStyle       0.957161
		OceanStyle      0.947345
		Randomize      (0.485, -0.743, 0.271)
		colorDistMagn   0.668401
		colorDistFreq   1.73684
		detailScale     2390.77
		colorConversion true
		snowLevel       2
		tropicLatitude  0.808356
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.373415
		terraceProb     0.471094
		erosion         0
		montesMagn      0.405948
		montesFreq      2.50936
		montesSpiky     0.892391
		montesFraction  0.439626
		dunesFraction   0
		hillsMagn       0
		hillsFreq       17.9517
		hillsFraction   0.757237
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231641
		craterFreq      0.302895
		craterDensity   0.880209
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.485898
		volcanoTemp     1427.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.175, 0.179, 0.203, 0.050)
		colorShelf     (0.206, 0.210, 0.233, 0.040)
		colorBeach     (0.236, 0.240, 0.264, 0.030)
		colorDesert    (0.267, 0.271, 0.299, 0.020)
		colorLowland   (0.298, 0.302, 0.330, 0.030)
		colorUpland    (0.329, 0.332, 0.360, 0.050)
		colorRock      (0.360, 0.363, 0.401, 0.020)
		colorSnow      (0.360, 0.363, 0.401, 1.000)
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
		SemiMajorAxis   0.00737395
		Period          0.0806124
		Eccentricity    0.350978
		Inclination     70.6608
		AscendingNode   -122.55
		ArgOfPericenter -67.7614
		MeanAnomaly     -161.634
	}
}



DwarfMoon	"Barmasel.D13"
{
	ParentBody     "Barmasel"
	Class	       "Asteroid"

	Mass            3.01439e-007
	Radius          50.8345
	InertiaMoment   0.39808

	Obliquity       -75.2313
	EqAscendNode    154.426
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.623 0.618 0.615)

	Surface
	{
		SurfStyle       0.982191
		OceanStyle      0.285306
		Randomize      (-0.698, 0.668, 0.092)
		colorDistMagn   0.331244
		colorDistFreq   2.19377
		detailScale     1388.12
		colorConversion true
		snowLevel       2
		tropicLatitude  0.418108
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.561718
		terraceProb     0.126699
		erosion         0
		montesMagn      0.383057
		montesFreq      2.75992
		montesSpiky     0.858364
		montesFraction  0.471237
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.08344
		hillsFraction   0.346592
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24216
		craterFreq      0.163931
		craterDensity   0.939167
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.471655
		volcanoTemp     1388.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.212, 0.216, 0.246, 0.050)
		colorShelf     (0.249, 0.254, 0.283, 0.040)
		colorBeach     (0.287, 0.291, 0.320, 0.030)
		colorDesert    (0.324, 0.328, 0.363, 0.020)
		colorLowland   (0.361, 0.365, 0.400, 0.030)
		colorUpland    (0.399, 0.402, 0.437, 0.050)
		colorRock      (0.436, 0.439, 0.486, 0.020)
		colorSnow      (0.436, 0.439, 0.486, 1.000)
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
		SemiMajorAxis   0.0078724
		Period          0.0889226
		Eccentricity    0.245162
		Inclination     -75.2313
		AscendingNode   154.426
		ArgOfPericenter -142.808
		MeanAnomaly     134.546
	}
}



DwarfMoon	"Barmasel.D14"
{
	ParentBody     "Barmasel"
	Class	       "Asteroid"

	Mass            4.20743e-007
	Radius          100.137
	InertiaMoment   0.399194

	Obliquity       76.1431
	EqAscendNode    72.2303
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.556 0.472 0.313)

	Surface
	{
		SurfStyle       0.46501
		OceanStyle      0.818507
		Randomize      (-0.741, 0.950, -0.124)
		colorDistMagn   0.921547
		colorDistFreq   4.30937
		detailScale     2734.41
		colorConversion true
		snowLevel       2
		tropicLatitude  0.973113
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.648525
		terraceProb     0.304981
		erosion         0
		montesMagn      0.585032
		montesFreq      2.97783
		montesSpiky     0.95484
		montesFraction  0.717428
		dunesFraction   0
		hillsMagn       0
		hillsFreq       19.3656
		hillsFraction   0.639677
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.275
		craterFreq      0.285583
		craterDensity   0.817133
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.480036
		volcanoTemp     1408.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.222, 0.189, 0.125, 0.000)
		colorShelf     (0.236, 0.200, 0.133, 0.000)
		colorBeach     (0.250, 0.212, 0.141, 0.000)
		colorDesert    (0.264, 0.224, 0.149, 0.000)
		colorLowland   (0.278, 0.236, 0.156, 0.000)
		colorUpland    (0.292, 0.248, 0.164, 0.000)
		colorRock      (0.306, 0.259, 0.172, 0.000)
		colorSnow      (0.320, 0.271, 0.180, 1.000)
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
		SemiMajorAxis   0.00821276
		Period          0.0947511
		Eccentricity    0.23568
		Inclination     76.1431
		AscendingNode   72.2303
		ArgOfPericenter -94.6639
		MeanAnomaly     -30.1886
	}
}



DwarfMoon	"Barmasel.D15"
{
	ParentBody     "Barmasel"
	Class	       "Asteroid"

	Mass            5.92532e-007
	Radius          76.2723
	InertiaMoment   0.39583

	Obliquity       -87.8596
	EqAscendNode    169.149
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.704 0.700 0.695)

	Surface
	{
		SurfStyle       0.1291
		OceanStyle      0.834871
		Randomize      (0.584, 0.134, -0.470)
		colorDistMagn   0.254144
		colorDistFreq   4.73473
		detailScale     2082.74
		colorConversion true
		snowLevel       2
		tropicLatitude  0.188125
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.569116
		terraceProb     0.250179
		erosion         0
		montesMagn      0.56552
		montesFreq      3.4059
		montesSpiky     0.856244
		montesFraction  0.740303
		dunesFraction   0
		hillsMagn       0
		hillsFreq       14.849
		hillsFraction   0.571145
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22769
		craterFreq      0.180872
		craterDensity   0.997338
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.485372
		volcanoTemp     1330.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.281, 0.280, 0.278, 0.000)
		colorShelf     (0.299, 0.298, 0.295, 0.000)
		colorBeach     (0.317, 0.315, 0.313, 0.000)
		colorDesert    (0.334, 0.333, 0.330, 0.000)
		colorLowland   (0.352, 0.350, 0.347, 0.000)
		colorUpland    (0.369, 0.368, 0.365, 0.000)
		colorRock      (0.387, 0.385, 0.382, 0.000)
		colorSnow      (0.405, 0.403, 0.400, 1.000)
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
		SemiMajorAxis   0.0088681
		Period          0.106315
		Eccentricity    0.116701
		Inclination     -87.8596
		AscendingNode   169.149
		ArgOfPericenter -128.78
		MeanAnomaly     124.284
	}
}



DwarfMoon	"Barmasel.D16"
{
	ParentBody     "Barmasel"
	Class	       "Asteroid"

	Mass            8.43439e-007
	Radius          138.481
	InertiaMoment   0.39827

	Obliquity       -0.442135
	EqAscendNode    -138.54
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.708 0.706 0.704)

	Surface
	{
		SurfStyle       0.0801811
		OceanStyle      0.702374
		Randomize      (0.658, -0.266, -0.121)
		colorDistMagn   0.633877
		colorDistFreq   8.82396
		detailScale     3781.45
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00545913
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.662084
		terraceProb     0.306471
		erosion         0
		montesMagn      0.560269
		montesFreq      2.59136
		montesSpiky     0.971113
		montesFraction  0.395702
		dunesFraction   0
		hillsMagn       0
		hillsFreq       56.0737
		hillsFraction   0.618669
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258984
		craterFreq      0.739588
		craterDensity   0.889289
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.568051
		volcanoTemp     1521.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.283, 0.283, 0.281, 0.000)
		colorShelf     (0.301, 0.300, 0.299, 0.000)
		colorBeach     (0.319, 0.318, 0.317, 0.000)
		colorDesert    (0.336, 0.336, 0.334, 0.000)
		colorLowland   (0.354, 0.353, 0.352, 0.000)
		colorUpland    (0.372, 0.371, 0.369, 0.000)
		colorRock      (0.390, 0.389, 0.387, 0.000)
		colorSnow      (0.407, 0.406, 0.405, 1.000)
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
		SemiMajorAxis   0.00916096
		Period          0.111625
		Eccentricity    0.0762623
		Inclination     -0.442135
		AscendingNode   -138.54
		ArgOfPericenter -6.33799
		MeanAnomaly     14.2237
	}
}



DwarfMoon	"Barmasel.D17"
{
	ParentBody     "Barmasel"
	Class	       "Asteroid"

	Mass            1.21608e-006
	Radius          81.5976
	InertiaMoment   0.399328

	RotationPeriod  2050.11
	Obliquity       -15.1669
	EqAscendNode    75.5108

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.466 0.462 0.458)

	Surface
	{
		SurfStyle       0.808827
		OceanStyle      0.254755
		Randomize      (0.777, 0.360, -0.220)
		colorDistMagn   0.359377
		colorDistFreq   3.88923
		detailScale     2228.16
		colorConversion true
		snowLevel       2
		tropicLatitude  0.404761
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.49916
		terraceProb     0.17255
		erosion         0
		montesMagn      0.358319
		montesFreq      2.79586
		montesSpiky     0.874862
		montesFraction  0.653039
		dunesFraction   0
		hillsMagn       0
		hillsFreq       18.3859
		hillsFraction   0.6355
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.276642
		craterFreq      0.286391
		craterDensity   0.702346
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.465233
		volcanoTemp     1424.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.182, 0.157, 0.128, 0.000)
		colorShelf     (0.186, 0.162, 0.146, 0.000)
		colorBeach     (0.219, 0.189, 0.174, 0.000)
		colorDesert    (0.238, 0.203, 0.169, 0.000)
		colorLowland   (0.261, 0.217, 0.192, 0.000)
		colorUpland    (0.289, 0.263, 0.233, 0.000)
		colorRock      (0.312, 0.286, 0.252, 0.000)
		colorSnow      (0.340, 0.305, 0.265, 1.000)
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
		SemiMajorAxis   0.00944937
		Period          0.116938
		Eccentricity    0.470411
		Inclination     -15.1669
		AscendingNode   75.5108
		ArgOfPericenter -134.608
		MeanAnomaly     90.1313
	}
}



DwarfMoon	"Barmasel.D18"
{
	ParentBody     "Barmasel"
	Class	       "Asteroid"

	Mass            1.78053e-006
	Radius          163.162
	InertiaMoment   0.396576

	RotationPeriod  5447.57
	Obliquity       64.8846
	EqAscendNode    -108.273

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.623 0.563 0.538)

	Surface
	{
		SurfStyle       0.493286
		OceanStyle      0.0983305
		Randomize      (0.381, 0.376, 0.540)
		colorDistMagn   0.897958
		colorDistFreq   10.2415
		detailScale     4455.42
		colorConversion true
		snowLevel       2
		tropicLatitude  0.899357
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.551828
		terraceProb     0.207456
		erosion         0
		montesMagn      0.625091
		montesFreq      2.40488
		montesSpiky     0.96287
		montesFraction  0.56722
		dunesFraction   0
		hillsMagn       0
		hillsFreq       62.1478
		hillsFraction   0.583766
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232541
		craterFreq      0.610753
		craterDensity   0.853926
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.480014
		volcanoTemp     1266.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.249, 0.225, 0.215, 0.000)
		colorShelf     (0.265, 0.239, 0.229, 0.000)
		colorBeach     (0.280, 0.253, 0.242, 0.000)
		colorDesert    (0.296, 0.267, 0.255, 0.000)
		colorLowland   (0.312, 0.281, 0.269, 0.000)
		colorUpland    (0.327, 0.295, 0.282, 0.000)
		colorRock      (0.343, 0.309, 0.296, 0.000)
		colorSnow      (0.358, 0.324, 0.309, 1.000)
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
		SemiMajorAxis   0.00984147
		Period          0.124291
		Eccentricity    0.26806
		Inclination     64.8846
		AscendingNode   -108.273
		ArgOfPericenter 150.306
		MeanAnomaly     36.4137
	}
}



DwarfMoon	"Barmasel.D19"
{
	ParentBody     "Barmasel"
	Class	       "Asteroid"

	Mass            2.65585e-006
	Radius          129.379
	InertiaMoment   0.398445

	Obliquity       -69.2912
	EqAscendNode    120.894
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.678 0.594 0.470)

	Surface
	{
		SurfStyle       0.463937
		OceanStyle      0.240185
		Randomize      (-0.804, -0.420, -0.199)
		colorDistMagn   0.545837
		colorDistFreq   5.49199
		detailScale     3532.91
		colorConversion true
		snowLevel       2
		tropicLatitude  0.818651
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.437631
		terraceProb     0.468182
		erosion         0
		montesMagn      0.379553
		montesFreq      2.29675
		montesSpiky     0.960726
		montesFraction  0.508778
		dunesFraction   0
		hillsMagn       0
		hillsFreq       45.8738
		hillsFraction   0.5923
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.193081
		craterFreq      0.507302
		craterDensity   0.743896
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.533145
		volcanoTemp     1490.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.271, 0.237, 0.188, 0.000)
		colorShelf     (0.288, 0.252, 0.200, 0.000)
		colorBeach     (0.305, 0.267, 0.212, 0.000)
		colorDesert    (0.322, 0.282, 0.223, 0.000)
		colorLowland   (0.339, 0.297, 0.235, 0.000)
		colorUpland    (0.356, 0.312, 0.247, 0.000)
		colorRock      (0.373, 0.327, 0.259, 0.000)
		colorSnow      (0.390, 0.341, 0.270, 1.000)
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
		SemiMajorAxis   0.0104606
		Period          0.136202
		Eccentricity    0.230173
		Inclination     -69.2912
		AscendingNode   120.894
		ArgOfPericenter -51.8807
		MeanAnomaly     3.91844
	}
}



Planet	"Stindaron"
{
	ParentBody     "Domir"
	Class	       "GasGiant"

	Mass            141.071
	Radius          63525.3
	InertiaMoment   0.197234

	Oblateness      0.0858641

	RotationPeriod  9.93174
	Obliquity       -61.1767
	EqAscendNode    36.3018

	AlbedoBond      0.462312
	AlbedoGeom      0.554775
	Brightness      2

	Surface
	{
		SurfStyle       0.801338
		Randomize      (-0.464, 0.464, 0.767)
		detailScale     163391
		colorConversion true
		tropicLatitude  0.876802
		icecapLatitude  1
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.03243
		stripeFluct     0.462606
		stripeTwist     10.6881
		cycloneMagn     17.0747
		cycloneFreq     0.861902
		cycloneDensity  0.450406
		cycloneOctaves  5
		colorLayer0    (0.190, 0.430, 0.850, 1.100)
		colorLayer1    (0.170, 0.450, 0.800, 0.600)
		colorLayer2    (0.180, 0.450, 0.830, 0.100)
		colorLayer3    (0.160, 0.460, 0.890, 0.000)
		colorLayer4    (0.180, 0.480, 0.860, 0.000)
		colorLayer5    (0.100, 0.450, 0.830, 0.000)
		colorLayer6    (0.190, 0.440, 0.860, 0.000)
		colorLayer7    (0.180, 0.430, 0.850, 1.000)
		colorLowPlants (0.180, 0.480, 0.860, 0.000)
		colorUpPlants  (0.100, 0.450, 0.830, 0.000)
		BumpHeight      16.7712
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          78.6211
		Velocity        785.552
		BumpHeight      53.6208
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.902771
		mainOctaves     12
		Coverage        0.123122
		stripeZones     2.03243
		stripeFluct     0.462606
		stripeTwist     10.6881
	}

	Clouds
	{
		Height          140.469
		Velocity        772.493
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		ModulateColor  (1.000 1.000 1.000 0.338)
		mainFreq        0.902771
		mainOctaves     12
		Coverage        0.123122
		stripeZones     2.03243
		stripeFluct     0.462606
		stripeTwist     10.6881
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          635.253
		Density         5805.28
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.0141175
		Saturation      0.614258

		Composition
		{
			H2    	91.6305
			He    	7.91924
			CH4   	0.389939
			N2    	0.0483785
			O2    	0.00967631
			Ne    	0.00143497
			Ar    	0.00084424
		}
	}

	Aurora
	{
		Height      2794.57
		NorthLat    83.0098
		NorthLon    -94.1827
		NorthRadius 15225.5
		NorthWidth  10443.1
		NorthRings  4
		NorthBright 1
		NorthParticles 10000
		SouthLat    -81.4589
		SouthLon    81.0641
		SouthRadius 14019.7
		SouthWidth  5652.68
		SouthRings  3
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
		SemiMajorAxis   8.54373
		Period          23.4814
		Eccentricity    0.0598929
		Inclination     -0.103637
		AscendingNode   37.4501
		ArgOfPericenter 204.596
		MeanAnomaly     97.579
	}
}

DwarfMoon	"Stindaron.D1"
{
	ParentBody     "Stindaron"
	Class	       "Asteroid"

	Mass            4.68674e-009
	Radius          23.1246
	InertiaMoment   0.39865

	Oblateness      0.249

	Obliquity       -0.00992906
	EqAscendNode    -77.7134
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.757 0.755 0.753)

	Surface
	{
		SurfStyle       0.198539
		OceanStyle      0.64304
		Randomize      (0.470, -0.355, 0.951)
		colorDistMagn   0.975952
		colorDistFreq   0.242128
		detailScale     631.455
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.563649
		terraceProb     0.220987
		erosion         0
		montesMagn      0.364347
		montesFreq      4.41055
		montesSpiky     0.932075
		montesFraction  0.745831
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.40631
		hillsFraction   0.552159
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226329
		craterFreq      0.24701
		craterDensity   1.00726
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.462375
		volcanoTemp     1560.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.303, 0.302, 0.301, 0.000)
		colorShelf     (0.322, 0.321, 0.320, 0.000)
		colorBeach     (0.341, 0.340, 0.339, 0.000)
		colorDesert    (0.360, 0.359, 0.358, 0.000)
		colorLowland   (0.379, 0.378, 0.377, 0.000)
		colorUpland    (0.398, 0.397, 0.395, 0.000)
		colorRock      (0.417, 0.415, 0.414, 0.000)
		colorSnow      (0.435, 0.434, 0.433, 1.000)
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
		SemiMajorAxis   0.000797904
		Period          0.00109746
		Eccentricity    1.9925e-005
		Inclination     -0.00992906
		AscendingNode   -77.7134
		ArgOfPericenter -56.172
		MeanAnomaly     105.098
	}
}



DwarfMoon	"Stindaron.D2"
{
	ParentBody     "Stindaron"
	Class	       "Asteroid"

	Mass            6.45197e-009
	Radius          24.4789
	InertiaMoment   0.399621

	Oblateness      0.215433

	Obliquity       -0.00298089
	EqAscendNode    78.2647
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.470 0.467 0.462)

	Surface
	{
		SurfStyle       0.369461
		OceanStyle      0.491511
		Randomize      (0.249, -0.794, -0.631)
		colorDistMagn   0.74945
		colorDistFreq   0.161286
		detailScale     668.437
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.39637
		terraceProb     0.345701
		erosion         0
		montesMagn      0.331862
		montesFreq      3.03565
		montesSpiky     0.948926
		montesFraction  0.55265
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.26505
		hillsFraction   0.752273
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.267453
		craterFreq      0.213899
		craterDensity   1.08341
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.478383
		volcanoTemp     1712.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.188, 0.187, 0.185, 0.000)
		colorShelf     (0.200, 0.199, 0.196, 0.000)
		colorBeach     (0.211, 0.210, 0.208, 0.000)
		colorDesert    (0.223, 0.222, 0.219, 0.000)
		colorLowland   (0.235, 0.234, 0.231, 0.000)
		colorUpland    (0.247, 0.245, 0.243, 0.000)
		colorRock      (0.258, 0.257, 0.254, 0.000)
		colorSnow      (0.270, 0.269, 0.266, 1.000)
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
		SemiMajorAxis   0.000820567
		Period          0.00114454
		Eccentricity    5.47962e-005
		Inclination     -0.00298089
		AscendingNode   78.2647
		ArgOfPericenter -102.608
		MeanAnomaly     119.471
	}
}



DwarfMoon	"Stindaron.D3"
{
	ParentBody     "Stindaron"
	Class	       "Asteroid"

	Mass            8.83924e-009
	Radius          31.7893
	InertiaMoment   0.397435

	Oblateness      0.249

	Obliquity       -0.0122853
	EqAscendNode    -142.779
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.735 0.732 0.731)

	Surface
	{
		SurfStyle       0.0410895
		OceanStyle      0.75167
		Randomize      (0.953, -0.486, -0.228)
		colorDistMagn   0.805084
		colorDistFreq   0.449565
		detailScale     868.059
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.482955
		terraceProb     0.503052
		erosion         0
		montesMagn      0.522908
		montesFreq      3.19795
		montesSpiky     0.944319
		montesFraction  0.424724
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.42288
		hillsFraction   0.630664
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.274375
		craterFreq      0.146536
		craterDensity   0.899607
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.526612
		volcanoTemp     1673.95
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.294, 0.293, 0.292, 0.000)
		colorShelf     (0.312, 0.311, 0.311, 0.000)
		colorBeach     (0.331, 0.330, 0.329, 0.000)
		colorDesert    (0.349, 0.348, 0.347, 0.000)
		colorLowland   (0.368, 0.366, 0.365, 0.000)
		colorUpland    (0.386, 0.384, 0.384, 0.000)
		colorRock      (0.404, 0.403, 0.402, 0.000)
		colorSnow      (0.423, 0.421, 0.420, 1.000)
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
		SemiMajorAxis   0.000843914
		Period          0.00119374
		Eccentricity    3.77625e-005
		Inclination     -0.0122853
		AscendingNode   -142.779
		ArgOfPericenter 49.4391
		MeanAnomaly     -41.8169
	}
}



DwarfMoon	"Stindaron.D4"
{
	ParentBody     "Stindaron"
	Class	       "Asteroid"

	Mass            1.20643e-008
	Radius          33.2042
	InertiaMoment   0.398803

	Oblateness      0.249

	Obliquity       -0.00629087
	EqAscendNode    41.7261
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.624 0.622 0.620)

	Surface
	{
		SurfStyle       0.185483
		OceanStyle      0.513845
		Randomize      (-0.906, -0.202, 0.458)
		colorDistMagn   0.602625
		colorDistFreq   0.0572399
		detailScale     906.697
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.565856
		terraceProb     0.291868
		erosion         0
		montesMagn      0.509385
		montesFreq      3.15428
		montesSpiky     0.987577
		montesFraction  0.315529
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.4706
		hillsFraction   0.572968
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240585
		craterFreq      0.152522
		craterDensity   0.90737
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.534212
		volcanoTemp     1484.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.250, 0.249, 0.248, 0.000)
		colorShelf     (0.265, 0.264, 0.263, 0.000)
		colorBeach     (0.281, 0.280, 0.279, 0.000)
		colorDesert    (0.297, 0.295, 0.294, 0.000)
		colorLowland   (0.312, 0.311, 0.310, 0.000)
		colorUpland    (0.328, 0.326, 0.325, 0.000)
		colorRock      (0.343, 0.342, 0.341, 0.000)
		colorSnow      (0.359, 0.357, 0.356, 1.000)
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
		SemiMajorAxis   0.000856773
		Period          0.00122113
		Eccentricity    4.38934e-006
		Inclination     -0.00629087
		AscendingNode   41.7261
		ArgOfPericenter -48.317
		MeanAnomaly     -141.061
	}
}



DwarfMoon	"Stindaron.D5"
{
	ParentBody     "Stindaron"
	Class	       "Asteroid"

	Mass            1.642e-008
	Radius          35.3221
	InertiaMoment   0.399747

	Oblateness      0.193042

	Obliquity       0.00080319
	EqAscendNode    -158.439
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.741 0.738 0.735)

	Surface
	{
		SurfStyle       0.398381
		OceanStyle      0.647173
		Randomize      (-0.309, 0.289, 0.891)
		colorDistMagn   0.213651
		colorDistFreq   0.555485
		detailScale     964.53
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.73452
		terraceProb     0.137131
		erosion         0
		montesMagn      0.551902
		montesFreq      3.47464
		montesSpiky     0.891783
		montesFraction  0.47724
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.16336
		hillsFraction   0.645175
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213616
		craterFreq      0.208785
		craterDensity   0.99716
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.564153
		volcanoTemp     1265.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.296, 0.295, 0.294, 0.000)
		colorShelf     (0.315, 0.314, 0.312, 0.000)
		colorBeach     (0.333, 0.332, 0.331, 0.000)
		colorDesert    (0.352, 0.351, 0.349, 0.000)
		colorLowland   (0.370, 0.369, 0.367, 0.000)
		colorUpland    (0.389, 0.387, 0.386, 0.000)
		colorRock      (0.407, 0.406, 0.404, 0.000)
		colorSnow      (0.426, 0.424, 0.422, 1.000)
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
		SemiMajorAxis   0.0008997
		Period          0.00131404
		Eccentricity    8.54348e-006
		Inclination     0.00080319
		AscendingNode   -158.439
		ArgOfPericenter 67.9604
		MeanAnomaly     -170.638
	}
}



Moon	"Stindaron.1"
{
	ParentBody     "Stindaron"
	Class	       "Selena"

	Mass            0.101027
	Radius          3981.12
	InertiaMoment   0.327492

	Oblateness      0.0054825

	Obliquity       0.959354
	EqAscendNode    -66.8065
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.666 0.661 0.657)

	Surface
	{
		SurfStyle       0.571227
		OceanStyle      0.975442
		Randomize      (0.440, -0.880, -0.311)
		colorDistMagn   0.085297
		colorDistFreq   507.314
		detailScale     10239.7
		colorConversion true
		drivenDarkening 0
		seaLevel        0.178321
		snowLevel       2
		tropicLatitude  0.0279511
		icecapLatitude  10
		icecapHeight    0.143554
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.61564
		venusFreq       0.955642
		venusMagn       0
		mareFreq        1.46064
		mareDensity     0.0104654
		terraceProb     0.323543
		erosion         0
		montesMagn      0.193278
		montesFreq      213.642
		montesSpiky     0.96812
		montesFraction  0.586129
		dunesMagn       0.0463281
		dunesFreq       5323.32
		dunesFraction   0.125261
		hillsMagn       0.145103
		hillsFreq       462.933
		hillsFraction   0.499292
		hills2Fraction  0
		riversMagn      56.2181
		riversFreq      2.18838
		riversSin       6.75246
		riversOctaves   0
		canyonsMagn     0.490489
		canyonsFreq     1.47036
		canyonFraction  0.206964
		cracksMagn      0.0312341
		cracksFreq      2.49852
		cracksOctaves   0
		craterMagn      0.580209
		craterFreq      13.6322
		craterDensity   0.474475
		craterOctaves   6.31434
		craterRayedFactor 0.127584
		volcanoMagn     0.592897
		volcanoFreq     0.628726
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.0617682
		volcanoRadius   0.474154
		volcanoTemp     1429.81
		lavaCoverTidal  0.52645
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.430, 0.400, 0.370, 0.000)
		colorShelf     (0.620, 0.600, 0.530, 0.000)
		colorBeach     (0.413, 0.403, 0.355, 0.000)
		colorDesert    (0.433, 0.410, 0.361, 0.000)
		colorLowland   (0.340, 0.304, 0.276, 0.000)
		colorUpland    (0.500, 0.470, 0.407, 0.000)
		colorRock      (0.300, 0.260, 0.220, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.995391
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
		Height          242.964
		Density         0.00046093
		Pressure        0.000303599
		Greenhouse      0.158559
		Bright          3.40978
		Opacity         0
		SkyLight        1.13659
		Hue             -0.0201603
		Saturation      1

		Composition
		{
			CO2   	84.3756
			H2S   	8.57273
			SO2   	3.68989
			C2H6  	3.24061
			C3H8  	0.0877349
			C2H4  	0.0221448
			N2    	0.00732834
			Ar    	0.00374549
			CO    	0.000112409
			O2    	5.31077e-005
			Cl2   	3.27845e-005
			Kr    	3.00784e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00165908
		Period          0.00328933
		Eccentricity    0.0310332
		Inclination     0.959354
		AscendingNode   -66.8065
		ArgOfPericenter -40.9843
		MeanAnomaly     99.4886
	}
}



Moon	"Stindaron.2"
{
	ParentBody     "Stindaron"
	Class	       "Selena"

	Mass            0.0116961
	Radius          1861.1
	InertiaMoment   0.376334

	Oblateness      0.00118152

	Obliquity       1.14112
	EqAscendNode    43.4805
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.663 0.661 0.659)

	Surface
	{
		SurfStyle       0.855544
		OceanStyle      0.471487
		Randomize      (-0.887, -0.747, 0.376)
		colorDistMagn   0.0671992
		colorDistFreq   210.334
		detailScale     4786.87
		colorConversion true
		drivenDarkening 0
		seaLevel        0.27564
		snowLevel       2
		tropicLatitude  0.0369904
		icecapLatitude  0.963892
		icecapHeight    0.278903
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.09566
		venusFreq       0.259964
		venusMagn       0
		mareFreq        1.07194
		mareDensity     0.00332458
		terraceProb     0.28139
		erosion         0
		montesMagn      0.10092
		montesFreq      76.6059
		montesSpiky     0.908546
		montesFraction  0.930701
		dunesMagn       0.0509752
		dunesFreq       2451.28
		dunesFraction   0.0253535
		hillsMagn       0.140223
		hillsFreq       240.01
		hillsFraction   0.778275
		hills2Fraction  0
		riversMagn      62.4053
		riversFreq      3.65225
		riversSin       6.65358
		riversOctaves   0
		canyonsMagn     0.638301
		canyonsFreq     0.664571
		canyonFraction  0.577599
		cracksMagn      0.0623808
		cracksFreq      0.382951
		cracksOctaves   0
		craterMagn      0.57944
		craterFreq      4.4259
		craterDensity   0.699863
		craterOctaves   10.2021
		craterRayedFactor 0.194919
		volcanoMagn     0.293574
		volcanoFreq     0.70812
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.301822
		volcanoRadius   0.227886
		volcanoTemp     1575.05
		lavaCoverTidal  0.0805999
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.400, 0.350, 0.320, 0.000)
		colorShelf     (0.470, 0.410, 0.380, 0.000)
		colorBeach     (0.371, 0.311, 0.277, 0.000)
		colorDesert    (0.338, 0.291, 0.244, 0.000)
		colorLowland   (0.258, 0.225, 0.184, 0.000)
		colorUpland    (0.437, 0.397, 0.342, 0.000)
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
		SemiMajorAxis   0.0028183
		Period          0.00728491
		Eccentricity    0.0211154
		Inclination     1.14112
		AscendingNode   43.4805
		ArgOfPericenter 49.8395
		MeanAnomaly     143.512
	}
}



Moon	"Stindaron.3"
{
	ParentBody     "Stindaron"
	Class	       "IceWorld"

	Mass            0.0135563
	Radius          2076.06
	InertiaMoment   0.371786

	Obliquity       -1.4569
	EqAscendNode    177.477
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.415 0.410 0.407)

	Surface
	{
		SurfStyle       0.708587
		OceanStyle      0.44267
		Randomize      (-0.410, -0.124, -0.771)
		colorDistMagn   0.0695401
		colorDistFreq   210.931
		detailScale     5339.75
		colorConversion true
		drivenDarkening 0.7
		seaLevel        0.224381
		snowLevel       2
		tropicLatitude  0.00114512
		icecapLatitude  0.828701
		icecapHeight    0.238986
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.0606
		venusFreq       1.379
		venusMagn       0
		mareFreq        1.01089
		mareDensity     0.00250349
		terraceProb     0.357365
		erosion         0
		montesMagn      0.0879042
		montesFreq      102.981
		montesSpiky     0.998747
		montesFraction  0.659486
		dunesMagn       0.0425588
		dunesFreq       2722.28
		dunesFraction   0.782873
		hillsMagn       0.128876
		hillsFreq       242.912
		hillsFraction   0.137443
		hills2Fraction  0.190078
		riversMagn      64.7872
		riversFreq      3.78976
		riversSin       7.06984
		riversOctaves   0
		canyonsMagn     0.459372
		canyonsFreq     0.401976
		canyonFraction  0
		cracksMagn      0.0562855
		cracksFreq      0.816215
		cracksOctaves   2
		craterMagn      0.571882
		craterFreq      4.7177
		craterDensity   0.853918
		craterOctaves   11
		craterRayedFactor 0.0522957
		volcanoMagn     0.362192
		volcanoFreq     0.620978
		volcanoDensity  0.18915
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.218676
		volcanoRadius   0.26781
		volcanoTemp     1184.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.266, 0.262, 0.273, 0.250)
		colorShelf     (0.291, 0.299, 0.309, 0.250)
		colorBeach     (0.237, 0.221, 0.236, 0.200)
		colorDesert    (0.220, 0.201, 0.207, 0.200)
		colorLowland   (0.162, 0.156, 0.171, 0.200)
		colorUpland    (0.307, 0.303, 0.309, 0.250)
		colorRock      (0.640, 0.630, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.162, 0.156, 0.171, 0.200)
		colorUpPlants  (0.307, 0.303, 0.309, 0.250)
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
		SemiMajorAxis   0.00478747
		Period          0.0161287
		Eccentricity    0.0189316
		Inclination     -1.4569
		AscendingNode   177.477
		ArgOfPericenter -117.88
		MeanAnomaly     -57.4128
	}
}



Moon	"Stindaron.4"
{
	ParentBody     "Stindaron"
	Class	       "IceWorld"

	Mass            0.0157402
	Radius          2050.93
	InertiaMoment   0.367762

	Obliquity       -0.407275
	EqAscendNode    75.4123
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.604 0.598 0.596)

	Surface
	{
		SurfStyle       0.652054
		OceanStyle      0.668751
		Randomize      (-0.988, -0.612, -0.779)
		colorDistMagn   0.0510679
		colorDistFreq   288.57
		detailScale     5275.11
		colorConversion true
		drivenDarkening 0.7
		seaLevel        0.172986
		snowLevel       2
		tropicLatitude  0.0112462
		icecapLatitude  0.587367
		icecapHeight    0.190567
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.81221
		venusFreq       1.7882
		venusMagn       0
		mareFreq        1.00327
		mareDensity     0.00309347
		terraceProb     0.296046
		erosion         0
		montesMagn      0.100479
		montesFreq      98.4329
		montesSpiky     0.876168
		montesFraction  0.0672012
		dunesMagn       0.0437578
		dunesFreq       2667.07
		dunesFraction   0.339366
		hillsMagn       0.105188
		hillsFreq       185.504
		hillsFraction   0.992512
		hills2Fraction  0.026531
		riversMagn      54.0536
		riversFreq      3.63201
		riversSin       5.76812
		riversOctaves   0
		canyonsMagn     0.511583
		canyonsFreq     0.624516
		canyonFraction  0
		cracksMagn      0.0576411
		cracksFreq      1.16452
		cracksOctaves   1
		craterMagn      0.621376
		craterFreq      5.44306
		craterDensity   0.948483
		craterOctaves   11
		craterRayedFactor 0.218728
		volcanoMagn     0.326405
		volcanoFreq     0.847927
		volcanoDensity  0.23695
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.493366
		volcanoRadius   0.258179
		volcanoTemp     1353.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.386, 0.383, 0.399, 0.250)
		colorShelf     (0.423, 0.436, 0.453, 0.250)
		colorBeach     (0.344, 0.323, 0.346, 0.200)
		colorDesert    (0.320, 0.293, 0.304, 0.200)
		colorLowland   (0.235, 0.227, 0.250, 0.200)
		colorUpland    (0.447, 0.442, 0.453, 0.250)
		colorRock      (0.640, 0.630, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.235, 0.227, 0.250, 0.200)
		colorUpPlants  (0.447, 0.442, 0.453, 0.250)
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
		SemiMajorAxis   0.00813253
		Period          0.0357088
		Eccentricity    0.0483917
		Inclination     -0.407275
		AscendingNode   75.4123
		ArgOfPericenter 78.5014
		MeanAnomaly     150.125
	}
}



DwarfMoon	"Stindaron.D8"
{
	ParentBody     "Stindaron"
	Class	       "Asteroid"

	Mass            1.41599e-007
	Radius          76.4791
	InertiaMoment   0.398127

	Obliquity       -1.08194
	EqAscendNode    61.9509
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.735 0.619 0.555)

	Surface
	{
		SurfStyle       0.558689
		OceanStyle      0.746955
		Randomize      (-0.498, 0.875, 0.216)
		colorDistMagn   0.932602
		colorDistFreq   4.66878
		detailScale     2088.39
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0323755
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.423677
		terraceProb     0.303181
		erosion         0
		montesMagn      0.516761
		montesFreq      3.20144
		montesSpiky     0.943768
		montesFraction  0.322473
		dunesFraction   0
		hillsMagn       0
		hillsFreq       14.702
		hillsFraction   0.766865
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.269669
		craterFreq      0.197386
		craterDensity   0.96066
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.503679
		volcanoTemp     1288.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.287, 0.210, 0.155, 0.000)
		colorShelf     (0.294, 0.217, 0.178, 0.000)
		colorBeach     (0.346, 0.254, 0.211, 0.000)
		colorDesert    (0.375, 0.272, 0.205, 0.000)
		colorLowland   (0.412, 0.291, 0.233, 0.000)
		colorUpland    (0.456, 0.353, 0.283, 0.000)
		colorRock      (0.493, 0.384, 0.305, 0.000)
		colorSnow      (0.537, 0.409, 0.322, 1.000)
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
		SemiMajorAxis   0.0138148
		Period          0.0790639
		Eccentricity    0.0266879
		Inclination     -1.08194
		AscendingNode   61.9509
		ArgOfPericenter -26.3072
		MeanAnomaly     96.5423
	}
}



DwarfMoon	"Stindaron.D9"
{
	ParentBody     "Stindaron"
	Class	       "Asteroid"

	Mass            1.94641e-007
	Radius          81.4481
	InertiaMoment   0.399227

	RotationPeriod  479.742
	Obliquity       -34.6849
	EqAscendNode    60.1289

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.428 0.424 0.419)

	Surface
	{
		SurfStyle       0.279969
		OceanStyle      0.0196258
		Randomize      (0.668, -0.623, -0.026)
		colorDistMagn   0.155436
		colorDistFreq   4.23242
		detailScale     2224.07
		colorConversion true
		snowLevel       2
		tropicLatitude  0.971651
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.766429
		terraceProb     0.411719
		erosion         0
		montesMagn      0.427625
		montesFreq      2.72744
		montesSpiky     0.84236
		montesFraction  0.412369
		dunesFraction   0
		hillsMagn       0
		hillsFreq       15.5479
		hillsFraction   0.655577
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213266
		craterFreq      0.21701
		craterDensity   0.939709
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.568051
		volcanoTemp     2064.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.171, 0.170, 0.168, 0.000)
		colorShelf     (0.182, 0.180, 0.178, 0.000)
		colorBeach     (0.193, 0.191, 0.189, 0.000)
		colorDesert    (0.203, 0.201, 0.199, 0.000)
		colorLowland   (0.214, 0.212, 0.210, 0.000)
		colorUpland    (0.225, 0.223, 0.220, 0.000)
		colorRock      (0.235, 0.233, 0.231, 0.000)
		colorSnow      (0.246, 0.244, 0.241, 1.000)
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
		SemiMajorAxis   0.0801793
		Period          1.10549
		Eccentricity    0.191278
		Inclination     -53.8679
		AscendingNode   57.2781
		ArgOfPericenter 115.917
		MeanAnomaly     -54.0915
	}
}



DwarfMoon	"Stindaron.D10"
{
	ParentBody     "Stindaron"
	Class	       "Asteroid"

	Mass            2.69067e-007
	Radius          87.0023
	InertiaMoment   0.396063

	RotationPeriod  434.05
	Obliquity       -74.3754
	EqAscendNode    135.489

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.798 0.796 0.793)

	Surface
	{
		SurfStyle       0.424038
		OceanStyle      0.603361
		Randomize      (0.031, -0.976, -0.366)
		colorDistMagn   0.581628
		colorDistFreq   6.11903
		detailScale     2375.74
		colorConversion true
		snowLevel       2
		tropicLatitude  0.765114
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.574475
		terraceProb     0.572854
		erosion         0
		montesMagn      0.430714
		montesFreq      2.58602
		montesSpiky     0.941374
		montesFraction  0.646303
		dunesFraction   0
		hillsMagn       0
		hillsFreq       13.847
		hillsFraction   0.636805
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237233
		craterFreq      0.251693
		craterDensity   0.85838
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.465701
		volcanoTemp     1692.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.319, 0.318, 0.317, 0.000)
		colorShelf     (0.339, 0.338, 0.337, 0.000)
		colorBeach     (0.359, 0.358, 0.357, 0.000)
		colorDesert    (0.379, 0.378, 0.377, 0.000)
		colorLowland   (0.399, 0.398, 0.397, 0.000)
		colorUpland    (0.419, 0.418, 0.416, 0.000)
		colorRock      (0.439, 0.438, 0.436, 0.000)
		colorSnow      (0.459, 0.458, 0.456, 1.000)
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
		SemiMajorAxis   0.080635
		Period          1.11493
		Eccentricity    0.412468
		Inclination     -41.4151
		AscendingNode   133.921
		ArgOfPericenter 37.0635
		MeanAnomaly     113.474
	}
}



DwarfMoon	"Stindaron.D11"
{
	ParentBody     "Stindaron"
	Class	       "Asteroid"

	Mass            3.74539e-007
	Radius          118.253
	InertiaMoment   0.398313

	RotationPeriod  498.787
	Obliquity       12.2435
	EqAscendNode    -166.613

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.656 0.651 0.647)

	Surface
	{
		SurfStyle       0.794723
		OceanStyle      0.0945237
		Randomize      (0.095, -0.407, 0.773)
		colorDistMagn   0.749809
		colorDistFreq   9.47443
		detailScale     3229.08
		colorConversion true
		snowLevel       2
		tropicLatitude  0.382414
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.51006
		terraceProb     0.178174
		erosion         0
		montesMagn      0.482109
		montesFreq      2.75555
		montesSpiky     0.907801
		montesFraction  0.812455
		dunesFraction   0
		hillsMagn       0
		hillsFreq       31.9263
		hillsFraction   0.906454
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237628
		craterFreq      0.606759
		craterDensity   0.781701
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.35157
		volcanoTemp     1402.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.256, 0.221, 0.181, 0.000)
		colorShelf     (0.262, 0.228, 0.207, 0.000)
		colorBeach     (0.308, 0.267, 0.246, 0.000)
		colorDesert    (0.335, 0.286, 0.239, 0.000)
		colorLowland   (0.367, 0.306, 0.272, 0.000)
		colorUpland    (0.407, 0.371, 0.330, 0.000)
		colorRock      (0.440, 0.404, 0.356, 0.000)
		colorSnow      (0.479, 0.430, 0.375, 1.000)
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
		SemiMajorAxis   0.0813034
		Period          1.12882
		Eccentricity    0.0572569
		Inclination     33.5284
		AscendingNode   -158.979
		ArgOfPericenter 150.948
		MeanAnomaly     -106.966
	}
}



DwarfMoon	"Stindaron.D12"
{
	ParentBody     "Stindaron"
	Class	       "Asteroid"

	Mass            5.25737e-007
	Radius          119.304
	InertiaMoment   0.39936

	RotationPeriod  426.105
	Obliquity       -33.6873
	EqAscendNode    8.10049

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.466 0.458 0.453)

	Surface
	{
		SurfStyle       0.932077
		OceanStyle      0.877319
		Randomize      (0.678, -0.996, 0.327)
		colorDistMagn   0.279483
		colorDistFreq   5.38683
		detailScale     3257.79
		colorConversion true
		snowLevel       2
		tropicLatitude  0.83409
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.288356
		terraceProb     0.306488
		erosion         0
		montesMagn      0.601118
		montesFreq      2.95942
		montesSpiky     0.964751
		montesFraction  0.545629
		dunesFraction   0
		hillsMagn       0
		hillsFreq       31.9304
		hillsFraction   0.651965
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237396
		craterFreq      0.41452
		craterDensity   0.801605
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.46449
		volcanoTemp     1412.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.158, 0.160, 0.181, 0.050)
		colorShelf     (0.186, 0.188, 0.208, 0.040)
		colorBeach     (0.214, 0.215, 0.236, 0.030)
		colorDesert    (0.242, 0.243, 0.267, 0.020)
		colorLowland   (0.270, 0.270, 0.295, 0.030)
		colorUpland    (0.298, 0.297, 0.322, 0.050)
		colorRock      (0.326, 0.325, 0.358, 0.020)
		colorSnow      (0.326, 0.325, 0.358, 1.000)
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
		SemiMajorAxis   0.0817022
		Period          1.13714
		Eccentricity    0.237451
		Inclination     -22.8957
		AscendingNode   5.23158
		ArgOfPericenter -61.5533
		MeanAnomaly     144.79
	}
}



DwarfMoon	"Stindaron.D13"
{
	ParentBody     "Stindaron"
	Class	       "Asteroid"

	Mass            7.45429e-007
	Radius          128.15
	InertiaMoment   0.396699

	RotationPeriod  383.499
	Obliquity       -31.6467
	EqAscendNode    44.2355

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.774 0.771 0.769)

	Surface
	{
		SurfStyle       0.626001
		OceanStyle      0.632264
		Randomize      (-0.938, 0.218, 0.706)
		colorDistMagn   0.927419
		colorDistFreq   14.3
		detailScale     3499.36
		colorConversion true
		snowLevel       2
		tropicLatitude  0.839366
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.280372
		terraceProb     0.250424
		erosion         0
		montesMagn      0.544409
		montesFreq      3.74802
		montesSpiky     0.945847
		montesFraction  0.40722
		dunesFraction   0
		hillsMagn       0
		hillsFreq       25.9823
		hillsFraction   0.661252
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226152
		craterFreq      0.520495
		craterDensity   0.779373
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.562294
		volcanoTemp     1535.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.302, 0.262, 0.215, 0.000)
		colorShelf     (0.310, 0.270, 0.246, 0.000)
		colorBeach     (0.364, 0.316, 0.292, 0.000)
		colorDesert    (0.395, 0.339, 0.284, 0.000)
		colorLowland   (0.433, 0.362, 0.323, 0.000)
		colorUpland    (0.480, 0.440, 0.392, 0.000)
		colorRock      (0.519, 0.478, 0.423, 0.000)
		colorSnow      (0.565, 0.509, 0.446, 1.000)
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
		SemiMajorAxis   0.0820434
		Period          1.14427
		Eccentricity    0.455144
		Inclination     -32.2982
		AscendingNode   51.108
		ArgOfPericenter 133.517
		MeanAnomaly     140.431
	}
}



DwarfMoon	"Stindaron.D14"
{
	ParentBody     "Stindaron"
	Class	       "Asteroid"

	Mass            1.06973e-006
	Radius          138.749
	InertiaMoment   0.398485

	RotationPeriod  347.543
	Obliquity       -37.6716
	EqAscendNode    -61.6565

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.572 0.436 0.355)

	Surface
	{
		SurfStyle       0.61359
		OceanStyle      0.453705
		Randomize      (0.863, 0.102, -0.624)
		colorDistMagn   0.999863
		colorDistFreq   13.4
		detailScale     3788.77
		colorConversion true
		snowLevel       2
		tropicLatitude  0.721996
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.300126
		terraceProb     0.231433
		erosion         0
		montesMagn      0.412577
		montesFreq      3.35466
		montesSpiky     0.966223
		montesFraction  0.455518
		dunesFraction   0
		hillsMagn       0
		hillsFreq       31.4772
		hillsFraction   0.543134
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232408
		craterFreq      0.794389
		craterDensity   1.04201
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.527889
		volcanoTemp     1349.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.223, 0.148, 0.099, 0.000)
		colorShelf     (0.229, 0.152, 0.113, 0.000)
		colorBeach     (0.269, 0.179, 0.135, 0.000)
		colorDesert    (0.292, 0.192, 0.131, 0.000)
		colorLowland   (0.320, 0.205, 0.149, 0.000)
		colorUpland    (0.355, 0.248, 0.181, 0.000)
		colorRock      (0.383, 0.270, 0.195, 0.000)
		colorSnow      (0.418, 0.287, 0.206, 1.000)
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
		SemiMajorAxis   0.0825861
		Period          1.15564
		Eccentricity    0.0919806
		Inclination     -16.0564
		AscendingNode   -65.9998
		ArgOfPericenter -18.2922
		MeanAnomaly     10.7133
	}
}



DwarfMoon	"Stindaron.D15"
{
	ParentBody     "Stindaron"
	Class	       "Asteroid"

	Mass            2.30725e-006
	Radius          196.901
	InertiaMoment   0.397112

	RotationPeriod  335.071
	Obliquity       124.43
	EqAscendNode    -147.553

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.730 0.728 0.726)

	Surface
	{
		SurfStyle       0.979749
		OceanStyle      0.810739
		Randomize      (0.971, 0.663, -0.525)
		colorDistMagn   0.228997
		colorDistFreq   23.2214
		detailScale     5376.72
		colorConversion true
		snowLevel       2
		tropicLatitude  0.733258
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.272131
		terraceProb     0.172007
		erosion         0
		montesMagn      0.41898
		montesFreq      3.35764
		montesSpiky     0.99479
		montesFraction  0.584839
		dunesFraction   0
		hillsMagn       0
		hillsFreq       95.5025
		hillsFraction   0.605097
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230092
		craterFreq      1.13082
		craterDensity   0.911969
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.500298
		volcanoTemp     1597.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.248, 0.255, 0.291, 0.050)
		colorShelf     (0.292, 0.298, 0.334, 0.040)
		colorBeach     (0.336, 0.342, 0.378, 0.030)
		colorDesert    (0.380, 0.386, 0.429, 0.020)
		colorLowland   (0.424, 0.430, 0.472, 0.030)
		colorUpland    (0.468, 0.473, 0.516, 0.050)
		colorRock      (0.511, 0.517, 0.574, 0.020)
		colorSnow      (0.511, 0.517, 0.574, 1.000)
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
		SemiMajorAxis   0.0831159
		Period          1.16678
		Eccentricity    0.0766819
		Inclination     87.3637
		AscendingNode   -148.959
		ArgOfPericenter -123.78
		MeanAnomaly     136.51
	}
}



DwarfMoon	"Stindaron.D16"
{
	ParentBody     "Stindaron"
	Class	       "Asteroid"

	Mass            1.66927e-011
	Radius          3.26171
	InertiaMoment   0.397429

	RotationPeriod  1850.24
	Obliquity       -3.81417
	EqAscendNode    146.33

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.485 0.478 0.475)

	Surface
	{
		SurfStyle       0.921487
		OceanStyle      0.865931
		Randomize      (-0.834, -0.682, -0.859)
		colorDistMagn   0.638274
		colorDistFreq   0.00667513
		detailScale     89.0664
		colorConversion true
		snowLevel       2
		tropicLatitude  0.350104
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.395275
		terraceProb     0.651913
		erosion         0
		montesMagn      0.557964
		montesFreq      2.87932
		montesSpiky     0.989924
		montesFraction  0.656169
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0187955
		hillsFraction   0.743557
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226204
		craterFreq      0.205764
		craterDensity   1.04812
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.567494
		volcanoTemp     1759.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.165, 0.167, 0.190, 0.050)
		colorShelf     (0.194, 0.196, 0.219, 0.040)
		colorBeach     (0.223, 0.225, 0.247, 0.030)
		colorDesert    (0.252, 0.254, 0.280, 0.020)
		colorLowland   (0.281, 0.282, 0.309, 0.030)
		colorUpland    (0.310, 0.311, 0.337, 0.050)
		colorRock      (0.339, 0.340, 0.375, 0.020)
		colorSnow      (0.339, 0.340, 0.375, 1.000)
		BumpHeight      2.93554
		BumpOffset      0.587108
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0845308
		Period          1.1967
		Eccentricity    0.448062
		Inclination     -23.5375
		AscendingNode   145.69
		ArgOfPericenter -96.6921
		MeanAnomaly     -167.475
	}
}



DwarfMoon	"Stindaron.D17"
{
	ParentBody     "Stindaron"
	Class	       "Asteroid"

	Mass            3.25823e-011
	Radius          4.80176
	InertiaMoment   0.3988

	RotationPeriod  1927.14
	Obliquity       -69.4197
	EqAscendNode    -148.45

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.820 0.785 0.750)

	Surface
	{
		SurfStyle       0.0146545
		OceanStyle      0.0854094
		Randomize      (-0.095, 0.850, 0.957)
		colorDistMagn   0.598378
		colorDistFreq   0.0174891
		detailScale     131.12
		colorConversion true
		snowLevel       2
		tropicLatitude  0.500099
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.281318
		terraceProb     0.401136
		erosion         0
		montesMagn      0.343325
		montesFreq      2.39762
		montesSpiky     0.945321
		montesFraction  0.501007
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0544284
		hillsFraction   0.7606
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242491
		craterFreq      0.24376
		craterDensity   0.900069
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.514085
		volcanoTemp     1677.33
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.328, 0.314, 0.300, 0.000)
		colorShelf     (0.348, 0.334, 0.319, 0.000)
		colorBeach     (0.369, 0.353, 0.338, 0.000)
		colorDesert    (0.389, 0.373, 0.356, 0.000)
		colorLowland   (0.410, 0.393, 0.375, 0.000)
		colorUpland    (0.430, 0.412, 0.394, 0.000)
		colorRock      (0.451, 0.432, 0.413, 0.000)
		colorSnow      (0.471, 0.452, 0.432, 1.000)
		BumpHeight      4.32158
		BumpOffset      0.864317
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0851773
		Period          1.21045
		Eccentricity    0.390365
		Inclination     -60.1041
		AscendingNode   -148.332
		ArgOfPericenter 79.0289
		MeanAnomaly     -91.0266
	}
}



DwarfMoon	"Stindaron.D18"
{
	ParentBody     "Stindaron"
	Class	       "Asteroid"

	Mass            5.85997e-011
	Radius          5.55341
	InertiaMoment   0.399745

	RotationPeriod  1685.59
	Obliquity       -89.5581
	EqAscendNode    136.218

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.547 0.540 0.535)

	Surface
	{
		SurfStyle       0.24175
		OceanStyle      0.173495
		Randomize      (0.153, -0.306, -0.518)
		colorDistMagn   0.508938
		colorDistFreq   0.0197597
		detailScale     151.645
		colorConversion true
		snowLevel       2
		tropicLatitude  0.78959
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.606372
		terraceProb     0.378835
		erosion         0
		montesMagn      0.415019
		montesFreq      2.88115
		montesSpiky     0.952007
		montesFraction  0.393023
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0836492
		hillsFraction   0.714888
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217189
		craterFreq      0.274492
		craterDensity   0.846222
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.549576
		volcanoTemp     1520.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.219, 0.216, 0.214, 0.000)
		colorShelf     (0.232, 0.229, 0.227, 0.000)
		colorBeach     (0.246, 0.243, 0.241, 0.000)
		colorDesert    (0.260, 0.256, 0.254, 0.000)
		colorLowland   (0.273, 0.270, 0.267, 0.000)
		colorUpland    (0.287, 0.283, 0.281, 0.000)
		colorRock      (0.301, 0.297, 0.294, 0.000)
		colorSnow      (0.314, 0.310, 0.308, 1.000)
		BumpHeight      4.99807
		BumpOffset      0.999614
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0858147
		Period          1.22406
		Eccentricity    0.460782
		Inclination     -65.4893
		AscendingNode   132.138
		ArgOfPericenter 91.6744
		MeanAnomaly     70.7244
	}
}




Planet	"Arodoni"
{
	ParentBody     "Domir"
	Class	       "GasGiant"

	Mass            989.324
	Radius          78301
	InertiaMoment   0.210851

	RotationPeriod  17.54809
    Oblateness      0.00767629

	Obliquity       -16.9931
	EqAscendNode    -71.3967

	AlbedoBond      0.46215
	AlbedoGeom      0.55458
	Brightness      2

	Surface
	{
		SurfStyle       0.374542
		Randomize      (0.334, -0.084, -0.023)
		detailScale     201395
		colorConversion true
		tropicLatitude  0.289819
		icecapLatitude  1
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     4.85235
		stripeFluct     0.394971
		stripeTwist     10.5345
		cycloneMagn     10.5477
		cycloneFreq     0.8422
		cycloneDensity  0.346324
		cycloneOctaves  5
		colorLayer0    (0.120, 0.200, 0.480, 1.100)
		colorLayer1    (0.330, 0.400, 0.720, 0.600)
		colorLayer2    (0.330, 0.400, 0.720, 0.200)
		colorLayer3    (0.600, 0.600, 0.600, 0.000)
		colorLayer4    (0.350, 0.430, 0.770, 0.000)
		colorLayer5    (0.470, 0.540, 0.850, 0.000)
		colorLayer6    (0.600, 0.650, 0.910, 0.000)
		colorLayer7    (0.990, 0.990, 1.000, 1.000)
		colorLowPlants (0.350, 0.430, 0.770, 0.000)
		colorUpPlants  (0.470, 0.540, 0.850, 0.000)
		BumpHeight      7.8061
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          37.8438
		Velocity        146.404
		BumpHeight      30.0355
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.18163
		mainOctaves     12
		Coverage        0.121502
		stripeZones     4.85235
		stripeFluct     0.394971
		stripeTwist     10.5345
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Jupiter"
		Height          157.983
		Density         5370.43
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.04428
		Saturation      0.880218

		Composition
		{
			H2    	92.9595
			He    	6.69783
			CH4   	0.268872
			N2    	0.0346953
			NH3   	0.0254371
			O2    	0.00648647
			C2H2  	0.00318796
			Ne    	0.00114942
			C2H4  	0.00108559
			Ar    	0.000855335
			C2H6  	0.00060261
			C3H8  	0.000282057
		}
	}

	Aurora
	{
		Height      3641.89
		NorthLat    84.2404
		NorthLon    -31.1662
		NorthRadius 25201.4
		NorthWidth  8688.07
		NorthRings  5
		NorthBright 1
		NorthParticles 10000
		SouthLat    -85.8178
		SouthLon    148.794
		SouthRadius 17942.9
		SouthWidth  8963.48
		SouthRings  4
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
		SemiMajorAxis   17.66995
	Period          69.3535
 	Eccentricity    0.0966971
		Inclination     0.642798
		AscendingNode   -75.8466
		ArgOfPericenter 95.8196
		MeanAnomaly     63.8723
	}
}



DwarfMoon	"Arodoni.D1"
{
	ParentBody     "Arodoni"
	Class	       "Asteroid"

	Mass            3.51127e-007
	Radius          124.483
	InertiaMoment   0.398812

	Oblateness      0.249

	Obliquity       0.0116702
	EqAscendNode    -140.903
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.767 0.702 0.619)

	Surface
	{
		SurfStyle       0.496146
		OceanStyle      0.822574
		Randomize      (0.477, -0.198, -0.997)
		colorDistMagn   0.667443
		colorDistFreq   11.5258
		detailScale     3399.22
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.396168
		terraceProb     0.144601
		erosion         0
		montesMagn      0.619041
		montesFreq      3.56052
		montesSpiky     0.810359
		montesFraction  0.585166
		dunesFraction   0
		hillsMagn       0
		hillsFreq       39.313
		hillsFraction   0.614797
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256637
		craterFreq      0.612265
		craterDensity   0.730332
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.444689
		volcanoTemp     1363.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.307, 0.281, 0.247, 0.000)
		colorShelf     (0.326, 0.298, 0.263, 0.000)
		colorBeach     (0.345, 0.316, 0.278, 0.000)
		colorDesert    (0.364, 0.333, 0.294, 0.000)
		colorLowland   (0.383, 0.351, 0.309, 0.000)
		colorUpland    (0.402, 0.368, 0.325, 0.000)
		colorRock      (0.422, 0.386, 0.340, 0.000)
		colorSnow      (0.441, 0.404, 0.356, 1.000)
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
		SemiMajorAxis   0.00152733
		Period          0.00109751
		Eccentricity    8.77862e-005
		Inclination     0.0116702
		AscendingNode   -140.903
		ArgOfPericenter 96.5039
		MeanAnomaly     139.598
	}
}



DwarfMoon	"Arodoni.D2"
{
	ParentBody     "Arodoni"
	Class	       "Asteroid"

	Mass            4.92017e-007
	Radius          65.8753
	InertiaMoment   0.399755

	Oblateness      0.0536649

	Obliquity       0.0103377
	EqAscendNode    -55.7422
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.549 0.546 0.540)

	Surface
	{
		SurfStyle       0.842594
		OceanStyle      0.015931
		Randomize      (0.421, 0.631, 0.686)
		colorDistMagn   0.529905
		colorDistFreq   1.87659
		detailScale     1798.83
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.295462
		terraceProb     0.275941
		erosion         0
		montesMagn      0.463028
		montesFreq      2.81235
		montesSpiky     0.934506
		montesFraction  0.379969
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.4537
		hillsFraction   0.767082
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.198454
		craterFreq      0.170523
		craterDensity   0.79457
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.513603
		volcanoTemp     1893.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.214, 0.186, 0.151, 0.000)
		colorShelf     (0.220, 0.191, 0.173, 0.000)
		colorBeach     (0.258, 0.224, 0.205, 0.000)
		colorDesert    (0.280, 0.240, 0.200, 0.000)
		colorLowland   (0.308, 0.257, 0.227, 0.000)
		colorUpland    (0.341, 0.311, 0.275, 0.000)
		colorRock      (0.368, 0.338, 0.297, 0.000)
		colorSnow      (0.401, 0.360, 0.313, 1.000)
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
		SemiMajorAxis   0.00158439
		Period          0.00115959
		Eccentricity    1.23621e-006
		Inclination     0.0103377
		AscendingNode   -55.7422
		ArgOfPericenter -104.274
		MeanAnomaly     16.6511
	}
}



DwarfMoon	"Arodoni.D3"
{
	ParentBody     "Arodoni"
	Class	       "Asteroid"

	Mass            6.96164e-007
	Radius          68.9305
	InertiaMoment   0.39771

	Oblateness      0.0337129

	Obliquity       -0.0142392
	EqAscendNode    129.577
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.729 0.654 0.556)

	Surface
	{
		SurfStyle       0.539568
		OceanStyle      0.726389
		Randomize      (-0.084, 0.222, -0.800)
		colorDistMagn   0.280625
		colorDistFreq   3.20199
		detailScale     1882.26
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.749617
		terraceProb     0.219908
		erosion         0
		montesMagn      0.674889
		montesFreq      3.54555
		montesSpiky     0.923831
		montesFraction  0.348676
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.839
		hillsFraction   0.682661
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245693
		craterFreq      0.257339
		craterDensity   0.638675
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.422061
		volcanoTemp     1074.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.284, 0.222, 0.156, 0.000)
		colorShelf     (0.292, 0.229, 0.178, 0.000)
		colorBeach     (0.343, 0.268, 0.211, 0.000)
		colorDesert    (0.372, 0.288, 0.206, 0.000)
		colorLowland   (0.408, 0.308, 0.233, 0.000)
		colorUpland    (0.452, 0.373, 0.283, 0.000)
		colorRock      (0.489, 0.406, 0.306, 0.000)
		colorSnow      (0.532, 0.432, 0.322, 1.000)
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
		SemiMajorAxis   0.00171987
		Period          0.00131146
		Eccentricity    3.20361e-005
		Inclination     -0.0142392
		AscendingNode   129.577
		ArgOfPericenter -157.841
		MeanAnomaly     77.2861
	}
}


Moon	"Arodoni.1"
{
	ParentBody     "Arodoni"
	Class	       "Desert"

	Mass            0.342021
	Radius          3971.51
	InertiaMoment   0.329004

	Oblateness      0.00221248

	Obliquity       0.575772
	EqAscendNode    134.043
	TidalLocked     true

	AlbedoBond      0.26128
	AlbedoGeom      0.313537
	Brightness      2
	Color          (0.722 0.740 0.942)

	Surface
	{
		SurfStyle       0.121333
		OceanStyle      0.537401
		Randomize      (-0.114, -0.221, -0.593)
		colorDistMagn   0.0517189
		colorDistFreq   510.718
		detailScale     10214.9
		colorConversion true
		seaLevel        0.155146
		snowLevel       0.85
		tropicLatitude  0.0078429
		icecapLatitude  10
		icecapHeight    0.139476
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        0.924469
		venusFreq       0.960783
		venusMagn       0
		mareFreq        1.70049
		mareDensity     0.156973
		terraceProb     0.450094
		erosion         0
		montesMagn      0.186497
		montesFreq      249.952
		montesSpiky     0.98323
		montesFraction  0.79164
		dunesMagn       0.0691665
		dunesFreq       30.2258
		dunesFraction   0.386379
		hillsMagn       0.174234
		hillsFreq       335.404
		hillsFraction   0
		hills2Fraction  0
		riversMagn      58.2577
		riversFreq      3.63216
		riversSin       6.65977
		riversOctaves   0
		canyonsMagn     0.0490429
		canyonsFreq     120.827
		canyonFraction  0
		cracksMagn      0.139316
		cracksFreq      0.329517
		cracksOctaves   0
		craterMagn      0.684642
		craterFreq      13.806
		craterDensity   0.0837338
		craterOctaves   1.38391
		volcanoMagn     0.618693
		volcanoFreq     0.734786
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.647342
		volcanoRadius   0.495893
		volcanoTemp     1604.8
		lavaCoverTidal  0.534646
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.91932
		stripeTwist     0.0125552
		cycloneMagn     2.87238
		cycloneFreq     0.808348
		cycloneDensity  0.379875
		cycloneOctaves  4
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
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Clouds
	{
		Height          15.0552
		Velocity        50.3607
		BumpHeight      5.05512
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.979882
		mainOctaves     10
		Coverage        0.122561
		stripeZones     1.91932
		stripeTwist     0.0125552
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          96.0151
		Density         0.175684
		Pressure        0.21535
		Greenhouse      12.6457
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0
		Saturation      1

		Composition
		{
			H2O   	61.3016
			CO2   	24.449
			CH4   	7.92882
			NH3   	2.27055
			C2H6  	1.68018
			SO2   	0.930216
			H2S   	0.629268
			C3H8  	0.476975
			C2H2  	0.231262
			C2H4  	0.0813293
			N2    	0.020439
			CO    	0.000269445
			Ne    	5.26475e-005
			Ar    	3.18629e-005
		}
	}

	Aurora
	{
		Height      56.1002
		NorthLat    55.9074
		NorthLon    73.2618
		NorthRadius 913.325
		NorthWidth  243.827
		NorthRings  4
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -78.1025
		SouthLon    237.928
		SouthRadius 840.833
		SouthWidth  233.277
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
		SemiMajorAxis   0.00285995
		Period          0.00281173
		Eccentricity    0.0192706
		Inclination     0.575772
		AscendingNode   134.043
		ArgOfPericenter -126.857
		MeanAnomaly     8.09948
	}
}




DwarfMoon	"Arodoni.D4"
{
	ParentBody     "Arodoni"
	Class	       "Asteroid"

	Mass            1.44652e-006
	Radius          76.1785
	InertiaMoment   0.39988

	Obliquity       30.2503
	EqAscendNode    11.8242
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.672 0.579 0.402)

	Surface
	{
		SurfStyle       0.329007
		OceanStyle      0.38984
		Randomize      (-0.282, -0.222, -0.672)
		colorDistMagn   0.300486
		colorDistFreq   3.7553
		detailScale     2080.18
		colorConversion true
		snowLevel       2
		tropicLatitude  0.867293
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.611758
		terraceProb     0.189009
		erosion         0
		montesMagn      0.485335
		montesFreq      2.77005
		montesSpiky     0.828999
		montesFraction  0.454519
		dunesFraction   0
		hillsMagn       0
		hillsFreq       13.3794
		hillsFraction   0.630561
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251179
		craterFreq      0.232467
		craterDensity   1.04933
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.483481
		volcanoTemp     1554.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.269, 0.232, 0.161, 0.000)
		colorShelf     (0.285, 0.246, 0.171, 0.000)
		colorBeach     (0.302, 0.261, 0.181, 0.000)
		colorDesert    (0.319, 0.275, 0.191, 0.000)
		colorLowland   (0.336, 0.289, 0.201, 0.000)
		colorUpland    (0.353, 0.304, 0.211, 0.000)
		colorRock      (0.369, 0.318, 0.221, 0.000)
		colorSnow      (0.386, 0.333, 0.231, 1.000)
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
		SemiMajorAxis   0.0115633
		Period          0.0228629
		Eccentricity    0.295738
		Inclination     30.2503
		AscendingNode   11.8242
		ArgOfPericenter 111.108
		MeanAnomaly     -133.793
	}
}



DwarfMoon	"Arodoni.D5"
{
	ParentBody     "Arodoni"
	Class	       "Asteroid"

	Mass            2.13519e-006
	Radius          193.384
	InertiaMoment   0.397936

	RotationPeriod  284.996
	Obliquity       7.39119
	EqAscendNode    23.6927

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.798 0.751 0.734)

	Surface
	{
		SurfStyle       0.590716
		OceanStyle      0.644812
		Randomize      (0.074, -0.373, 0.200)
		colorDistMagn   0.927766
		colorDistFreq   23.2833
		detailScale     5280.67
		colorConversion true
		snowLevel       2
		tropicLatitude  0.249803
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.719904
		terraceProb     0.146002
		erosion         0
		montesMagn      0.44209
		montesFreq      2.79487
		montesSpiky     0.820001
		montesFraction  0.654015
		dunesFraction   0
		hillsMagn       0
		hillsFreq       91.8856
		hillsFraction   0.528828
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222595
		craterFreq      1.23729
		craterDensity   0.767431
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.536894
		volcanoTemp     1730.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.311, 0.255, 0.206, 0.000)
		colorShelf     (0.319, 0.263, 0.235, 0.000)
		colorBeach     (0.375, 0.308, 0.279, 0.000)
		colorDesert    (0.407, 0.331, 0.272, 0.000)
		colorLowland   (0.447, 0.353, 0.308, 0.000)
		colorUpland    (0.495, 0.428, 0.375, 0.000)
		colorRock      (0.534, 0.466, 0.404, 0.000)
		colorSnow      (0.582, 0.496, 0.426, 1.000)
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
		SemiMajorAxis   0.0120707
		Period          0.0243842
		Eccentricity    0.371381
		Inclination     7.39119
		AscendingNode   23.6927
		ArgOfPericenter -14.8737
		MeanAnomaly     -86.5631
	}
}



DwarfMoon	"Arodoni.D6"
{
	ParentBody     "Arodoni"
	Class	       "Asteroid"

	Mass            3.21639e-006
	Radius          115.81
	InertiaMoment   0.399098

	Obliquity       -4.03874
	EqAscendNode    -109.264
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.727 0.591 0.535)

	Surface
	{
		SurfStyle       0.252026
		OceanStyle      0.658797
		Randomize      (0.164, 0.178, 0.447)
		colorDistMagn   0.0166683
		colorDistFreq   6.3987
		detailScale     3162.39
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0814664
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.388868
		terraceProb     0.338889
		erosion         0
		montesMagn      0.574838
		montesFreq      3.22995
		montesSpiky     0.917219
		montesFraction  0.623468
		dunesFraction   0
		hillsMagn       0
		hillsFreq       22.481
		hillsFraction   0.780536
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234821
		craterFreq      0.562565
		craterDensity   0.883447
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.402614
		volcanoTemp     1315.09
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.291, 0.236, 0.214, 0.000)
		colorShelf     (0.309, 0.251, 0.227, 0.000)
		colorBeach     (0.327, 0.266, 0.241, 0.000)
		colorDesert    (0.345, 0.281, 0.254, 0.000)
		colorLowland   (0.364, 0.296, 0.267, 0.000)
		colorUpland    (0.382, 0.310, 0.281, 0.000)
		colorRock      (0.400, 0.325, 0.294, 0.000)
		colorSnow      (0.418, 0.340, 0.308, 1.000)
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
		SemiMajorAxis   0.0126855
		Period          0.0262707
		Eccentricity    0.0347155
		Inclination     -4.03874
		AscendingNode   -109.264
		ArgOfPericenter 142.655
		MeanAnomaly     53.3705
	}
}



DwarfMoon	"Arodoni.D7"
{
	ParentBody     "Arodoni"
	Class	       "Asteroid"

	Mass            4.96711e-006
	Radius          126.161
	InertiaMoment   0.393823

	RotationPeriod  496.959
	Obliquity       21.7947
	EqAscendNode    -97.5152

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.750 0.747 0.745)

	Surface
	{
		SurfStyle       0.911514
		OceanStyle      0.893665
		Randomize      (0.319, 0.486, 0.411)
		colorDistMagn   0.80754
		colorDistFreq   9.06735
		detailScale     3445.04
		colorConversion true
		snowLevel       2
		tropicLatitude  0.474642
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.515087
		terraceProb     0.93607
		erosion         0
		montesMagn      0.39364
		montesFreq      2.99586
		montesSpiky     0.910046
		montesFraction  0.566373
		dunesFraction   0
		hillsMagn       0
		hillsFreq       38.9724
		hillsFraction   0.59436
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247072
		craterFreq      0.56678
		craterDensity   0.895872
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.595454
		volcanoTemp     1385.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.255, 0.262, 0.298, 0.050)
		colorShelf     (0.300, 0.306, 0.343, 0.040)
		colorBeach     (0.345, 0.351, 0.388, 0.030)
		colorDesert    (0.390, 0.396, 0.440, 0.020)
		colorLowland   (0.435, 0.441, 0.484, 0.030)
		colorUpland    (0.480, 0.486, 0.529, 0.050)
		colorRock      (0.525, 0.531, 0.589, 0.020)
		colorSnow      (0.525, 0.531, 0.589, 1.000)
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
		SemiMajorAxis   0.0133452
		Period          0.0283464
		Eccentricity    0.104165
		Inclination     21.7947
		AscendingNode   -97.5152
		ArgOfPericenter -105.31
		MeanAnomaly     80.8478
	}
}



DwarfMoon	"Arodoni.D8"
{
	ParentBody     "Arodoni"
	Class	       "Asteroid"

	Mass            1.44885e-011
	Radius          3.16124
	InertiaMoment   0.398138

	Obliquity       -14.5728
	EqAscendNode    120.309
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.712 0.709 0.707)

	Surface
	{
		SurfStyle       0.573343
		OceanStyle      0.780613
		Randomize      (-0.454, -0.211, -0.995)
		colorDistMagn   0.861434
		colorDistFreq   0.00706215
		detailScale     86.323
		colorConversion true
		snowLevel       2
		tropicLatitude  0.248463
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.35579
		terraceProb     0.317154
		erosion         0
		montesMagn      0.59645
		montesFreq      2.76422
		montesSpiky     0.942038
		montesFraction  0.548132
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0245698
		hillsFraction   0.648641
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22508
		craterFreq      0.238189
		craterDensity   0.690137
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.505446
		volcanoTemp     1405.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.278, 0.241, 0.198, 0.000)
		colorShelf     (0.285, 0.248, 0.226, 0.000)
		colorBeach     (0.335, 0.291, 0.269, 0.000)
		colorDesert    (0.363, 0.312, 0.262, 0.000)
		colorLowland   (0.399, 0.333, 0.297, 0.000)
		colorUpland    (0.441, 0.404, 0.360, 0.000)
		colorRock      (0.477, 0.440, 0.389, 0.000)
		colorSnow      (0.520, 0.468, 0.410, 1.000)
		BumpHeight      2.84512
		BumpOffset      0.569024
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0137937
		Period          0.0297872
		Eccentricity    0.0743632
		Inclination     -14.5728
		AscendingNode   120.309
		ArgOfPericenter 177.357
		MeanAnomaly     -167.154
	}
}



DwarfMoon	"Arodoni.D9"
{
	ParentBody     "Arodoni"
	Class	       "Asteroid"

	Mass            2.88399e-011
	Radius          2.62946
	InertiaMoment   0.399235

	RotationPeriod  838.302
	Obliquity       58.5167
	EqAscendNode    147.325

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.633 0.556 0.424)

	Surface
	{
		SurfStyle       0.68354
		OceanStyle      0.465131
		Randomize      (0.527, 0.567, 0.823)
		colorDistMagn   0.6219
		colorDistFreq   0.00493053
		detailScale     71.8019
		colorConversion true
		snowLevel       2
		tropicLatitude  0.465757
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.633186
		terraceProb     0.136413
		erosion         0
		montesMagn      0.52881
		montesFreq      2.17283
		montesSpiky     0.974103
		montesFraction  0.661444
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0135651
		hillsFraction   0.700504
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.27378
		craterFreq      0.207595
		craterDensity   0.835205
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.522547
		volcanoTemp     1554.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.247, 0.189, 0.119, 0.000)
		colorShelf     (0.253, 0.194, 0.136, 0.000)
		colorBeach     (0.298, 0.228, 0.161, 0.000)
		colorDesert    (0.323, 0.244, 0.157, 0.000)
		colorLowland   (0.354, 0.261, 0.178, 0.000)
		colorUpland    (0.392, 0.317, 0.216, 0.000)
		colorRock      (0.424, 0.344, 0.233, 0.000)
		colorSnow      (0.462, 0.367, 0.246, 1.000)
		BumpHeight      2.36652
		BumpOffset      0.473304
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0144317
		Period          0.0318777
		Eccentricity    0.290639
		Inclination     58.5167
		AscendingNode   147.325
		ArgOfPericenter -122.543
		MeanAnomaly     20.1656
	}
}



DwarfMoon	"Arodoni.D10"
{
	ParentBody     "Arodoni"
	Class	       "Asteroid"

	Mass            5.2584e-011
	Radius          5.38491
	InertiaMoment   0.396111

	RotationPeriod  199.358
	Obliquity       70.7632
	EqAscendNode    -139.104

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.795 0.699 0.657)

	Surface
	{
		SurfStyle       0.569431
		OceanStyle      0.894411
		Randomize      (0.011, -0.876, -0.403)
		colorDistMagn   0.871579
		colorDistFreq   0.00949259
		detailScale     147.044
		colorConversion true
		snowLevel       2
		tropicLatitude  0.622783
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.326043
		terraceProb     0.17365
		erosion         0
		montesMagn      0.551806
		montesFreq      3.16686
		montesSpiky     0.97701
		montesFraction  0.581578
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0717768
		hillsFraction   0.621671
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.268656
		craterFreq      0.218605
		craterDensity   1.09672
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.449196
		volcanoTemp     1358.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.310, 0.238, 0.184, 0.000)
		colorShelf     (0.318, 0.245, 0.210, 0.000)
		colorBeach     (0.373, 0.287, 0.250, 0.000)
		colorDesert    (0.405, 0.308, 0.243, 0.000)
		colorLowland   (0.445, 0.329, 0.276, 0.000)
		colorUpland    (0.493, 0.399, 0.335, 0.000)
		colorRock      (0.532, 0.434, 0.361, 0.000)
		colorSnow      (0.580, 0.461, 0.381, 1.000)
		BumpHeight      4.84642
		BumpOffset      0.969284
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.015099
		Period          0.034114
		Eccentricity    0.435781
		Inclination     70.7632
		AscendingNode   -139.104
		ArgOfPericenter -113.94
		MeanAnomaly     -95.4215
	}
}



DwarfMoon	"Arodoni.D11"
{
	ParentBody     "Arodoni"
	Class	       "Asteroid"

	Mass            9.0057e-011
	Radius          3.34234
	InertiaMoment   0.398323

	Obliquity       -15.2352
	EqAscendNode    -86.8647
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.744 0.742 0.741)

	Surface
	{
		SurfStyle       0.320148
		OceanStyle      0.969219
		Randomize      (0.457, 0.213, -0.345)
		colorDistMagn   0.316301
		colorDistFreq   0.00776139
		detailScale     91.2682
		colorConversion true
		snowLevel       2
		tropicLatitude  0.374645
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.266361
		terraceProb     0.394614
		erosion         0
		montesMagn      0.613524
		montesFreq      3.53102
		montesSpiky     0.816814
		montesFraction  0.631395
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0285933
		hillsFraction   0.80684
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259351
		craterFreq      0.269111
		craterDensity   0.799083
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.490932
		volcanoTemp     1595.24
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.297, 0.297, 0.296, 0.000)
		colorShelf     (0.316, 0.315, 0.315, 0.000)
		colorBeach     (0.335, 0.334, 0.333, 0.000)
		colorDesert    (0.353, 0.352, 0.352, 0.000)
		colorLowland   (0.372, 0.371, 0.370, 0.000)
		colorUpland    (0.390, 0.390, 0.389, 0.000)
		colorRock      (0.409, 0.408, 0.407, 0.000)
		colorSnow      (0.428, 0.427, 0.426, 1.000)
		BumpHeight      3.00811
		BumpOffset      0.601621
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0156005
		Period          0.0358277
		Eccentricity    0.183669
		Inclination     -15.2352
		AscendingNode   -86.8647
		ArgOfPericenter 27.8265
		MeanAnomaly     -88.1623
	}
}



DwarfMoon	"Arodoni.D12"
{
	ParentBody     "Arodoni"
	Class	       "Asteroid"

	Mass            1.47172e-010
	Radius          3.67598
	InertiaMoment   0.399367

	RotationPeriod  824.38
	Obliquity       41.7899
	EqAscendNode    66.5301

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.543 0.539 0.532)

	Surface
	{
		SurfStyle       0.122572
		OceanStyle      0.939497
		Randomize      (-0.811, 0.539, -0.224)
		colorDistMagn   0.0415396
		colorDistFreq   0.00584686
		detailScale     100.379
		colorConversion true
		snowLevel       2
		tropicLatitude  0.925379
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.563494
		terraceProb     0.346299
		erosion         0
		montesMagn      0.463279
		montesFreq      3.14675
		montesSpiky     0.998813
		montesFraction  0.574313
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.037613
		hillsFraction   0.582924
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244923
		craterFreq      0.191191
		craterDensity   0.746042
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.636801
		volcanoTemp     1657.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.217, 0.215, 0.213, 0.000)
		colorShelf     (0.231, 0.229, 0.226, 0.000)
		colorBeach     (0.244, 0.242, 0.239, 0.000)
		colorDesert    (0.258, 0.256, 0.253, 0.000)
		colorLowland   (0.271, 0.269, 0.266, 0.000)
		colorUpland    (0.285, 0.283, 0.279, 0.000)
		colorRock      (0.299, 0.296, 0.292, 0.000)
		colorSnow      (0.312, 0.310, 0.306, 1.000)
		BumpHeight      3.30839
		BumpOffset      0.661677
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.016116
		Period          0.037618
		Eccentricity    0.327427
		Inclination     41.7899
		AscendingNode   66.5301
		ArgOfPericenter -56.7449
		MeanAnomaly     135.965
	}
}



DwarfMoon	"Arodoni.D13"
{
	ParentBody     "Arodoni"
	Class	       "Asteroid"

	Mass            2.3194e-010
	Radius          9.42688
	InertiaMoment   0.396727

	Obliquity       10.7337
	EqAscendNode    4.09252
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.607 0.605 0.602)

	Surface
	{
		SurfStyle       0.406274
		OceanStyle      0.247915
		Randomize      (0.037, -0.505, 0.766)
		colorDistMagn   0.100968
		colorDistFreq   0.0434847
		detailScale     257.417
		colorConversion true
		snowLevel       2
		tropicLatitude  0.365745
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.562635
		terraceProb     0.152685
		erosion         0
		montesMagn      0.48405
		montesFreq      3.08127
		montesSpiky     0.931659
		montesFraction  0.920909
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.159198
		hillsFraction   0.730721
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217439
		craterFreq      0.234649
		craterDensity   0.930867
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.525783
		volcanoTemp     1878.53
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.243, 0.242, 0.241, 0.000)
		colorShelf     (0.258, 0.257, 0.256, 0.000)
		colorBeach     (0.273, 0.272, 0.271, 0.000)
		colorDesert    (0.288, 0.287, 0.286, 0.000)
		colorLowland   (0.303, 0.302, 0.301, 0.000)
		colorUpland    (0.318, 0.317, 0.316, 0.000)
		colorRock      (0.334, 0.333, 0.331, 0.000)
		colorSnow      (0.349, 0.348, 0.346, 1.000)
		BumpHeight      8.48419
		BumpOffset      1.69684
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0166224
		Period          0.0394051
		Eccentricity    0.391844
		Inclination     10.7337
		AscendingNode   4.09252
		ArgOfPericenter 106.466
		MeanAnomaly     -94.2005
	}
}



DwarfMoon	"Arodoni.D14"
{
	ParentBody     "Arodoni"
	Class	       "Asteroid"

	Mass            3.55155e-010
	Radius          5.65863
	InertiaMoment   0.398495

	Obliquity       -30.9896
	EqAscendNode    46.3203
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.755 0.753 0.752)

	Surface
	{
		SurfStyle       0.223405
		OceanStyle      0.902374
		Randomize      (0.894, -0.852, 0.948)
		colorDistMagn   0.269563
		colorDistFreq   0.0218161
		detailScale     154.518
		colorConversion true
		snowLevel       2
		tropicLatitude  0.83397
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.496459
		terraceProb     0.208598
		erosion         0
		montesMagn      0.607014
		montesFreq      3.24995
		montesSpiky     0.986402
		montesFraction  0.540177
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0753186
		hillsFraction   0.833522
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230699
		craterFreq      0.176489
		craterDensity   0.905304
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.469828
		volcanoTemp     1405.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.302, 0.301, 0.301, 0.000)
		colorShelf     (0.321, 0.320, 0.319, 0.000)
		colorBeach     (0.340, 0.339, 0.338, 0.000)
		colorDesert    (0.359, 0.358, 0.357, 0.000)
		colorLowland   (0.377, 0.377, 0.376, 0.000)
		colorUpland    (0.396, 0.395, 0.395, 0.000)
		colorRock      (0.415, 0.414, 0.413, 0.000)
		colorSnow      (0.434, 0.433, 0.432, 1.000)
		BumpHeight      5.09276
		BumpOffset      1.01855
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0168736
		Period          0.0403016
		Eccentricity    0.0656747
		Inclination     -30.9896
		AscendingNode   46.3203
		ArgOfPericenter 116.347
		MeanAnomaly     -168.388
	}
}



DwarfMoon	"Arodoni.D15"
{
	ParentBody     "Arodoni"
	Class	       "Asteroid"

	Mass            5.31309e-010
	Radius          11.2454
	InertiaMoment   0.399497

	Obliquity       -18.3743
	EqAscendNode    66.7821
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.695 0.629 0.570)

	Surface
	{
		SurfStyle       0.475068
		OceanStyle      0.220279
		Randomize      (-0.026, -0.738, -0.926)
		colorDistMagn   0.307881
		colorDistFreq   0.0972932
		detailScale     307.073
		colorConversion true
		snowLevel       2
		tropicLatitude  0.507823
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.384606
		terraceProb     0.110128
		erosion         0
		montesMagn      0.503192
		montesFreq      2.70709
		montesSpiky     0.930436
		montesFraction  0.401869
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.286774
		hillsFraction   0.716907
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.265004
		craterFreq      0.227591
		craterDensity   0.961979
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.45007
		volcanoTemp     1366.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.278, 0.251, 0.228, 0.000)
		colorShelf     (0.295, 0.267, 0.242, 0.000)
		colorBeach     (0.313, 0.283, 0.256, 0.000)
		colorDesert    (0.330, 0.299, 0.271, 0.000)
		colorLowland   (0.347, 0.314, 0.285, 0.000)
		colorUpland    (0.365, 0.330, 0.299, 0.000)
		colorRock      (0.382, 0.346, 0.313, 0.000)
		colorSnow      (0.399, 0.362, 0.328, 1.000)
		BumpHeight      10.1208
		BumpOffset      2.02416
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0173457
		Period          0.0420049
		Eccentricity    0.0124757
		Inclination     -18.3743
		AscendingNode   66.7821
		ArgOfPericenter -50.7074
		MeanAnomaly     99.7032
	}
}



DwarfMoon	"Arodoni.D16"
{
	ParentBody     "Arodoni"
	Class	       "Asteroid"

	Mass            7.7981e-010
	Radius          6.487
	InertiaMoment   0.397132

	RotationPeriod  765.509
	Obliquity       -0.778703
	EqAscendNode    -39.6467

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.533 0.528 0.524)

	Surface
	{
		SurfStyle       0.984049
		OceanStyle      0.818419
		Randomize      (-0.804, -0.116, 0.883)
		colorDistMagn   0.369327
		colorDistFreq   0.0222841
		detailScale     177.138
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0255687
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.460736
		terraceProb     0.420619
		erosion         0
		montesMagn      0.557226
		montesFreq      2.63387
		montesSpiky     0.919929
		montesFraction  0.474401
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0707683
		hillsFraction   0.502322
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234622
		craterFreq      0.242173
		craterDensity   1.06998
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.426353
		volcanoTemp     1772.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.181, 0.185, 0.209, 0.050)
		colorShelf     (0.213, 0.216, 0.241, 0.040)
		colorBeach     (0.245, 0.248, 0.272, 0.030)
		colorDesert    (0.277, 0.280, 0.309, 0.020)
		colorLowland   (0.309, 0.311, 0.340, 0.030)
		colorUpland    (0.341, 0.343, 0.372, 0.050)
		colorRock      (0.373, 0.375, 0.414, 0.020)
		colorSnow      (0.373, 0.375, 0.414, 1.000)
		BumpHeight      5.8383
		BumpOffset      1.16766
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0177997
		Period          0.0436644
		Eccentricity    0.396115
		Inclination     -0.778703
		AscendingNode   -39.6467
		ArgOfPericenter 154.218
		MeanAnomaly     -143.647
	}
}



DwarfMoon	"Arodoni.D17"
{
	ParentBody     "Arodoni"
	Class	       "Asteroid"

	Mass            1.1266e-009
	Radius          9.23821
	InertiaMoment   0.398656

	Obliquity       -2.15552
	EqAscendNode    -80.6932
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.792 0.690 0.622)

	Surface
	{
		SurfStyle       0.688085
		OceanStyle      0.747508
		Randomize      (0.795, -0.879, -0.329)
		colorDistMagn   0.630391
		colorDistFreq   0.0689218
		detailScale     252.265
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0573084
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.425643
		terraceProb     0.27438
		erosion         0
		montesMagn      0.321741
		montesFreq      3.18273
		montesSpiky     0.96944
		montesFraction  0.549616
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.264833
		hillsFraction   0.512969
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.202762
		craterFreq      0.240745
		craterDensity   0.907964
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.464533
		volcanoTemp     1458.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.309, 0.235, 0.174, 0.000)
		colorShelf     (0.317, 0.241, 0.199, 0.000)
		colorBeach     (0.372, 0.283, 0.236, 0.000)
		colorDesert    (0.404, 0.303, 0.230, 0.000)
		colorLowland   (0.443, 0.324, 0.261, 0.000)
		colorUpland    (0.491, 0.393, 0.317, 0.000)
		colorRock      (0.531, 0.428, 0.342, 0.000)
		colorSnow      (0.578, 0.455, 0.361, 1.000)
		BumpHeight      8.31439
		BumpOffset      1.66288
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.018184
		Period          0.0450863
		Eccentricity    0.41751
		Inclination     -2.15552
		AscendingNode   -80.6932
		ArgOfPericenter -10.0484
		MeanAnomaly     -57.0518
	}
}




Planet	"Chirgay"
{
	ParentBody     "Domir"
	Class	       "IceWorld"

	Mass            0.0419917
	Radius          3000.5
	InertiaMoment   0.35073

	Oblateness      0.00389329

	RotationPeriod  36.239
	Obliquity       -50.3396
	EqAscendNode    -88.0681

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.466 0.463 0.460)

	Surface
	{
		SurfStyle       0.939301
		OceanStyle      0.631458
		Randomize      (-0.043, 0.020, 0.029)
		colorDistMagn   0.0967304
		colorDistFreq   427.215
		detailScale     7717.44
		colorConversion true
		drivenDarkening 0
		seaLevel        0.239598
		snowLevel       2
		tropicLatitude  0.771885
		icecapLatitude  1
		icecapHeight    0.239598
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.53109
		venusFreq       0.835952
		venusMagn       0
		mareFreq        1.8689
		mareDensity     0.00440067
		terraceProb     0.450095
		erosion         0
		montesMagn      0.182131
		montesFreq      124.767
		montesSpiky     0.842711
		montesFraction  0.464838
		dunesMagn       0.0491757
		dunesFreq       3958.4
		dunesFraction   0.984367
		hillsMagn       0.116731
		hillsFreq       368.317
		hillsFraction   0.488761
		hills2Fraction  0.216827
		riversMagn      57.1534
		riversFreq      2.77805
		riversSin       5.72716
		riversOctaves   0
		canyonsMagn     0.517528
		canyonsFreq     0.821173
		canyonFraction  0
		cracksMagn      0.0506085
		cracksFreq      0.908057
		cracksOctaves   2
		craterMagn      0.569727
		craterFreq      8.01319
		craterDensity   0.755877
		craterOctaves   12
		craterRayedFactor 0.191989
		volcanoMagn     0.65987
		volcanoFreq     0.877503
		volcanoDensity  0.224317
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.346107
		volcanoRadius   0.485193
		volcanoTemp     1499.32
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.354, 0.329, 0.267, 1.000)
		colorShelf     (0.354, 0.329, 0.267, 1.000)
		colorBeach     (0.326, 0.287, 0.230, 1.000)
		colorDesert    (0.326, 0.287, 0.230, 1.000)
		colorLowland   (0.396, 0.375, 0.350, 1.000)
		colorUpland    (0.415, 0.412, 0.396, 1.000)
		colorRock      (0.930, 0.910, 0.860, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.396, 0.375, 0.350, 1.000)
		colorUpPlants  (0.415, 0.412, 0.396, 1.000)
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
		SemiMajorAxis   33.88629
		Eccentricity    0.0348486
		Inclination     -1.73265
		AscendingNode   -84.6221
		ArgOfPericenter 81.1775
		MeanAnomaly     200.282
	}
}



DwarfMoon	"Chirgay.D1"
{
	ParentBody     "Chirgay"
	Class	       "Asteroid"

	Mass            4.84171e-007
	Radius          65.3358
	InertiaMoment   0.397527

	Oblateness      0.0382335

	Obliquity       0.80372
	EqAscendNode    -73.5991
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.508 0.504 0.497)

	Surface
	{
		SurfStyle       0.577003
		OceanStyle      0.216382
		Randomize      (0.613, -0.387, 0.765)
		colorDistMagn   0.302078
		colorDistFreq   3.01921
		detailScale     1784.1
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0224622
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.427369
		terraceProb     0.290426
		erosion         0
		montesMagn      0.521315
		montesFreq      2.47015
		montesSpiky     0.961493
		montesFraction  0.60525
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.49514
		hillsFraction   0.520264
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255905
		craterFreq      0.248867
		craterDensity   0.947254
		craterOctaves   14
		volcanoActivity 0.300763
		volcanoFlows    0
		volcanoRadius   0.531509
		volcanoTemp     1306.92
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.198, 0.171, 0.139, 0.000)
		colorShelf     (0.203, 0.176, 0.159, 0.000)
		colorBeach     (0.239, 0.206, 0.189, 0.000)
		colorDesert    (0.259, 0.222, 0.184, 0.000)
		colorLowland   (0.285, 0.237, 0.209, 0.000)
		colorUpland    (0.315, 0.287, 0.253, 0.000)
		colorRock      (0.341, 0.312, 0.273, 0.000)
		colorSnow      (0.371, 0.332, 0.288, 1.000)
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
		SemiMajorAxis   6.15321e-005
		Period          0.00136222
		Eccentricity    0.0393797
		Inclination     0.80372
		AscendingNode   -73.5991
		ArgOfPericenter 42.1447
		MeanAnomaly     -100.303
	}
}






Planet	"Chav"
{
	ParentBody     "Domir"
	Class	       "IceWorld"

	Mass            0.986786
	Radius          7602.21
	InertiaMoment   0.329314

	Oblateness      0.0097005

	RotationPeriod  18.363
	Obliquity       -32.0134
	EqAscendNode    -50.586

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.397 0.331 0.298)

	Surface
	{
		SurfStyle       0.450562
		OceanStyle      0.134825
		Randomize      (-0.264, -0.194, -0.858)
		colorDistMagn   0.0731249
		colorDistFreq   941.521
		detailScale     19553.3
		colorConversion true
		drivenDarkening 0
		seaLevel        0.196014
		snowLevel       2
		tropicLatitude  0.513285
		icecapLatitude  1
		icecapHeight    0.196014
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.72698
		venusFreq       2
		venusMagn       0.148472
		mareFreq        1.50445
		mareDensity     0.0766996
		terraceProb     0.602189
		erosion         0
		montesMagn      0.157811
		montesFreq      283.562
		montesSpiky     0.978652
		montesFraction  0.963797
		dunesMagn       0.0368428
		dunesFreq       10198.4
		dunesFraction   0.908878
		hillsMagn       0.116336
		hillsFreq       872.55
		hillsFraction   0.530066
		hills2Fraction  0.189252
		riversMagn      64.9274
		riversFreq      3.68806
		riversSin       5.30946
		riversOctaves   0
		canyonsMagn     0.487756
		canyonsFreq     1.89996
		canyonFraction  0
		cracksMagn      0.0499777
		cracksFreq      2.51245
		cracksOctaves   5
		craterMagn      0.637055
		craterFreq      17.2757
		craterDensity   0.530461
		craterOctaves   8.01396
		craterRayedFactor 0.138231
		volcanoMagn     0.685482
		volcanoFreq     0.647231
		volcanoDensity  0.21026
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.31853
		volcanoRadius   0.583708
		volcanoTemp     1575.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.179, 0.124, 0.100, 0.000)
		colorShelf     (0.220, 0.154, 0.128, 0.000)
		colorBeach     (0.333, 0.233, 0.192, 0.200)
		colorDesert    (0.304, 0.218, 0.169, 0.500)
		colorLowland   (0.232, 0.168, 0.128, 0.800)
		colorUpland    (0.393, 0.297, 0.237, 1.000)
		colorRock      (0.670, 0.620, 0.550, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.232, 0.168, 0.128, 0.800)
		colorUpPlants  (0.393, 0.297, 0.237, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.338593
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	Rings
	{
		InnerRadius     9375.61
		OuterRadius     20623.2
		RotationPeriod  5.12369
		RotationOffset  0
		FrontBright     0.119851
		BackBright      0.457172
		Density         0.212477
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   55.135
		Period          382.751
		Eccentricity    0.0228256
		Inclination     2.1461
		AscendingNode   -56.7353
		ArgOfPericenter 237.674
		MeanAnomaly     88.5146
	}
}




DwarfMoon	"Chav.D1"
{
	ParentBody     "Chav"
	Class	       "Asteroid"

	Mass            1.33832e-011
	Radius          1.67127
	InertiaMoment   0.397298

	Oblateness      0.249

	Obliquity       0.00180678
	EqAscendNode    -70.2284
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.704 0.703 0.701)

	Surface
	{
		SurfStyle       0.532786
		OceanStyle      0.23726
		Randomize      (0.377, 0.584, -0.350)
		colorDistMagn   0.198362
		colorDistFreq   0.00182261
		detailScale     45.6368
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.563993
		terraceProb     0.156158
		erosion         0
		montesMagn      0.646349
		montesFreq      2.59634
		montesSpiky     0.980084
		montesFraction  0.575494
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00742893
		hillsFraction   0.497249
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255065
		craterFreq      0.186633
		craterDensity   1.02179
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.461608
		volcanoTemp     1167.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.275, 0.239, 0.196, 0.000)
		colorShelf     (0.282, 0.246, 0.224, 0.000)
		colorBeach     (0.331, 0.288, 0.266, 0.000)
		colorDesert    (0.359, 0.309, 0.259, 0.000)
		colorLowland   (0.394, 0.330, 0.294, 0.000)
		colorUpland    (0.437, 0.401, 0.357, 0.000)
		colorRock      (0.472, 0.436, 0.385, 0.000)
		colorSnow      (0.514, 0.464, 0.406, 1.000)
		BumpHeight      1.50414
		BumpOffset      0.300829
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   1.74221e-004
		Eccentricity    6.11189e-005
		Inclination     0.00180678
		AscendingNode   -70.2285
		ArgOfPericenter 39.0444
		MeanAnomaly     112.915
	}
}



DwarfMoon	"Chav.D2"
{
	ParentBody     "Chav"
	Class	       "Asteroid"

	Mass            2.69444e-011
	Radius          4.65715
	InertiaMoment   0.398734

	Oblateness      0.249

	Obliquity       -0.00915934
	EqAscendNode    -52.0311
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.793 0.790 0.788)

	Surface
	{
		SurfStyle       0.404642
		OceanStyle      0.0852944
		Randomize      (0.124, -0.874, -0.571)
		colorDistMagn   0.100706
		colorDistFreq   0.0112587
		detailScale     127.171
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.752912
		terraceProb     0.127615
		erosion         0
		montesMagn      0.443364
		montesFreq      2.17922
		montesSpiky     0.938774
		montesFraction  0.716806
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0458923
		hillsFraction   0.860499
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243295
		craterFreq      0.225133
		craterDensity   0.992113
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.522675
		volcanoTemp     1395.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.317, 0.316, 0.315, 0.000)
		colorShelf     (0.337, 0.336, 0.335, 0.000)
		colorBeach     (0.357, 0.355, 0.355, 0.000)
		colorDesert    (0.377, 0.375, 0.374, 0.000)
		colorLowland   (0.396, 0.395, 0.394, 0.000)
		colorUpland    (0.416, 0.415, 0.414, 0.000)
		colorRock      (0.436, 0.434, 0.434, 0.000)
		colorSnow      (0.456, 0.454, 0.453, 1.000)
		BumpHeight      4.19144
		BumpOffset      0.838288
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   2.79943e-004
		Eccentricity    4.4118e-005
		Inclination     -0.00915934
		AscendingNode   -52.0311
		ArgOfPericenter -125.232
		MeanAnomaly     -33.305
	}
}