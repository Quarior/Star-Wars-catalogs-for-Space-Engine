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




Asteroid	"Domir S1"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            3.29934e-009
	Radius          10.0664
	InertiaMoment   0.398312

	RotationPeriod  3859.27
	Obliquity       1.12528
	EqAscendNode    117.819

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.541 0.475 0.403)

	Surface
	{
		SurfStyle       0.886814
		OceanStyle      0.320411
		Randomize      (0.876, 0.507, -0.824)
		colorDistMagn   0.305184
		colorDistFreq   0.0377825
		detailScale     274.879
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0202817
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.714421
		terraceProb     0.208584
		erosion         0
		montesMagn      0.594439
		montesFreq      3.06599
		montesSpiky     0.793547
		montesFraction  0.705327
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.141504
		hillsFraction   0.735065
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.211982
		craterFreq      0.232485
		craterDensity   0.869186
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.469782
		volcanoTemp     1608.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.184, 0.166, 0.161, 0.050)
		colorShelf     (0.216, 0.195, 0.186, 0.040)
		colorBeach     (0.249, 0.223, 0.210, 0.030)
		colorDesert    (0.281, 0.252, 0.238, 0.020)
		colorLowland   (0.314, 0.280, 0.262, 0.030)
		colorUpland    (0.346, 0.309, 0.286, 0.050)
		colorRock      (0.379, 0.337, 0.319, 0.020)
		colorSnow      (0.379, 0.337, 0.319, 1.000)
		BumpHeight      9.05974
		BumpOffset      1.81195
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.37981
		Period          0.220132
		Eccentricity    0.117135
		Inclination     1.12528
		AscendingNode   117.819
		ArgOfPericenter 162.656
		MeanAnomaly     -149.398
	}
}

Asteroid	"Domir S2"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            1.93287e-017
	Radius          0.0206506
	InertiaMoment   0.399377

	Obliquity       -0.439869
	EqAscendNode    166.122
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.690 0.585 0.530)

	Surface
	{
		SurfStyle       0.480365
		OceanStyle      0.369741
		Randomize      (-0.749, -0.006, -0.868)
		colorDistMagn   0.312294
		colorDistFreq   1.91253e-007
		detailScale     0.563899
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00185932
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.441866
		terraceProb     0.161078
		erosion         0
		montesMagn      0.394254
		montesFreq      3.23082
		montesSpiky     0.935964
		montesFraction  0.412322
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.7439e-007
		hillsFraction   0.77947
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254346
		craterFreq      0.224946
		craterDensity   0.779616
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.40692
		volcanoTemp     1595.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.276, 0.234, 0.212, 0.000)
		colorShelf     (0.293, 0.249, 0.225, 0.000)
		colorBeach     (0.311, 0.263, 0.239, 0.000)
		colorDesert    (0.328, 0.278, 0.252, 0.000)
		colorLowland   (0.345, 0.293, 0.265, 0.000)
		colorUpland    (0.362, 0.307, 0.278, 0.000)
		colorRock      (0.380, 0.322, 0.292, 0.000)
		colorSnow      (0.397, 0.336, 0.305, 1.000)
		BumpHeight      0.0185855
		BumpOffset      0.00371711
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.200544
		Period          0.0844592
		Eccentricity    0.0928615
		Inclination     -0.439869
		AscendingNode   166.122
		ArgOfPericenter 122.342
		MeanAnomaly     -159.507
	}
}

Asteroid	"Domir S3"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            2.84433e-014
	Radius          0.183768
	InertiaMoment   0.396822

	Obliquity       2.8863
	EqAscendNode    -14.9487
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.538 0.534 0.526)

	Surface
	{
		SurfStyle       0.729407
		OceanStyle      0.222582
		Randomize      (-0.271, 0.788, -0.902)
		colorDistMagn   0.486864
		colorDistFreq   1.49887e-005
		detailScale     5.01809
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0997281
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.500893
		terraceProb     0.172127
		erosion         0
		montesMagn      0.561027
		montesFreq      3.33839
		montesSpiky     0.984548
		montesFraction  0.386949
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.59852e-005
		hillsFraction   0.596018
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257913
		craterFreq      0.229419
		craterDensity   0.778132
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.484866
		volcanoTemp     1305.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.210, 0.181, 0.147, 0.000)
		colorShelf     (0.215, 0.187, 0.168, 0.000)
		colorBeach     (0.253, 0.219, 0.200, 0.000)
		colorDesert    (0.275, 0.235, 0.195, 0.000)
		colorLowland   (0.301, 0.251, 0.221, 0.000)
		colorUpland    (0.334, 0.304, 0.268, 0.000)
		colorRock      (0.361, 0.331, 0.289, 0.000)
		colorSnow      (0.393, 0.352, 0.305, 1.000)
		BumpHeight      0.165391
		BumpOffset      0.0330782
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.396848
		Period          0.235109
		Eccentricity    0.0373117
		Inclination     2.8863
		AscendingNode   -14.9487
		ArgOfPericenter -16.0466
		MeanAnomaly     122.754
	}
}

Asteroid	"Domir S4"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            4.18558e-011
	Radius          2.34782
	InertiaMoment   0.398551

	RotationPeriod  1558.6
	Obliquity       2.75692
	EqAscendNode    18.5985

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.450 0.447 0.446)

	Surface
	{
		SurfStyle       0.787334
		OceanStyle      0.176382
		Randomize      (-0.395, -0.220, 0.530)
		colorDistMagn   0.296728
		colorDistFreq   0.00371812
		detailScale     64.111
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0948263
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.531502
		terraceProb     0.428833
		erosion         0
		montesMagn      0.43334
		montesFreq      2.3242
		montesSpiky     0.841351
		montesFraction  0.508282
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00934206
		hillsFraction   0.629611
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.212878
		craterFreq      0.210991
		craterDensity   0.851218
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.561005
		volcanoTemp     1762.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.176, 0.152, 0.125, 0.000)
		colorShelf     (0.180, 0.157, 0.143, 0.000)
		colorBeach     (0.212, 0.183, 0.169, 0.000)
		colorDesert    (0.230, 0.197, 0.165, 0.000)
		colorLowland   (0.252, 0.210, 0.187, 0.000)
		colorUpland    (0.279, 0.255, 0.227, 0.000)
		colorRock      (0.302, 0.277, 0.245, 0.000)
		colorSnow      (0.329, 0.295, 0.258, 1.000)
		BumpHeight      2.11303
		BumpOffset      0.422607
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.234337
		Period          0.106683
		Eccentricity    0.109516
		Inclination     2.75692
		AscendingNode   18.5985
		ArgOfPericenter -98.3092
		MeanAnomaly     15.2166
	}
}

Asteroid	"Domir S5"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            6.15931e-008
	Radius          30.3845
	InertiaMoment   0.399559

	Obliquity       1.0607
	EqAscendNode    -106.632
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.536 0.533 0.527)

	Surface
	{
		SurfStyle       0.480404
		OceanStyle      0.551796
		Randomize      (0.258, -0.124, 0.688)
		colorDistMagn   0.567405
		colorDistFreq   0.465389
		detailScale     829.701
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0221173
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.622234
		terraceProb     0.380614
		erosion         0
		montesMagn      0.698543
		montesFreq      1.88455
		montesSpiky     0.941241
		montesFraction  0.289284
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.72046
		hillsFraction   0.680399
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246507
		craterFreq      0.224507
		craterDensity   0.887485
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.55149
		volcanoTemp     1554.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.215, 0.213, 0.211, 0.000)
		colorShelf     (0.228, 0.226, 0.224, 0.000)
		colorBeach     (0.241, 0.240, 0.237, 0.000)
		colorDesert    (0.255, 0.253, 0.250, 0.000)
		colorLowland   (0.268, 0.266, 0.263, 0.000)
		colorUpland    (0.282, 0.280, 0.277, 0.000)
		colorRock      (0.295, 0.293, 0.290, 0.000)
		colorSnow      (0.308, 0.306, 0.303, 1.000)
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
		SemiMajorAxis   0.265514
		Period          0.128666
		Eccentricity    0.0024803
		Inclination     1.0607
		AscendingNode   -106.632
		ArgOfPericenter 20.3709
		MeanAnomaly     -10.0578
	}
}

Asteroid	"Domir S6"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            3.60835e-016
	Radius          0.0428593
	InertiaMoment   0.397333

	Obliquity       1.5392
	EqAscendNode    9.57086
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.489 0.412 0.372)

	Surface
	{
		SurfStyle       0.0189809
		OceanStyle      0.427264
		Randomize      (-0.784, 0.163, 0.799)
		colorDistMagn   0.0610807
		colorDistFreq   3.54522e-007
		detailScale     1.17035
		colorConversion true
		snowLevel       2
		tropicLatitude  0.053515
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.539631
		terraceProb     0.144297
		erosion         0
		montesMagn      0.476859
		montesFreq      2.59478
		montesSpiky     0.822892
		montesFraction  0.757419
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.96735e-006
		hillsFraction   0.737333
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230711
		craterFreq      0.209674
		craterDensity   0.758972
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.465309
		volcanoTemp     1486.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.196, 0.165, 0.149, 0.000)
		colorShelf     (0.208, 0.175, 0.158, 0.000)
		colorBeach     (0.220, 0.185, 0.167, 0.000)
		colorDesert    (0.232, 0.196, 0.177, 0.000)
		colorLowland   (0.245, 0.206, 0.186, 0.000)
		colorUpland    (0.257, 0.216, 0.195, 0.000)
		colorRock      (0.269, 0.227, 0.205, 0.000)
		colorSnow      (0.281, 0.237, 0.214, 1.000)
		BumpHeight      0.0385734
		BumpOffset      0.00771468
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.33037
		Period          0.17858
		Eccentricity    0.0724455
		Inclination     1.5392
		AscendingNode   9.57086
		ArgOfPericenter 165.906
		MeanAnomaly     41.0892
	}
}

Asteroid	"Domir S7"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            5.30988e-013
	Radius          0.547574
	InertiaMoment   0.398772

	RotationPeriod  1118.41
	Obliquity       7.35466
	EqAscendNode    123.598

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.692 0.604 0.456)

	Surface
	{
		SurfStyle       0.312533
		OceanStyle      0.756545
		Randomize      (-0.323, -0.041, 0.238)
		colorDistMagn   0.480047
		colorDistFreq   9.83646e-005
		detailScale     14.9524
		colorConversion true
		snowLevel       2
		tropicLatitude  0.120766
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.608091
		terraceProb     0.217048
		erosion         0
		montesMagn      0.552367
		montesFreq      2.89198
		montesSpiky     0.964836
		montesFraction  0.137449
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000684948
		hillsFraction   0.675444
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226027
		craterFreq      0.264626
		craterDensity   0.969472
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.482733
		volcanoTemp     1636.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.277, 0.242, 0.182, 0.000)
		colorShelf     (0.294, 0.257, 0.194, 0.000)
		colorBeach     (0.311, 0.272, 0.205, 0.000)
		colorDesert    (0.329, 0.287, 0.216, 0.000)
		colorLowland   (0.346, 0.302, 0.228, 0.000)
		colorUpland    (0.363, 0.317, 0.239, 0.000)
		colorRock      (0.381, 0.332, 0.251, 0.000)
		colorSnow      (0.398, 0.348, 0.262, 1.000)
		BumpHeight      0.492816
		BumpOffset      0.0985633
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.345975
		Period          0.191382
		Eccentricity    0.0817785
		Inclination     7.35466
		AscendingNode   123.598
		ArgOfPericenter 68.8047
		MeanAnomaly     -54.7376
	}
}

Asteroid	"Domir S8"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            7.81376e-010
	Radius          7.0872
	InertiaMoment   0.399738

	Obliquity       1.25381
	EqAscendNode    124.68
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.782 0.779 0.777)

	Surface
	{
		SurfStyle       0.68844
		OceanStyle      0.158828
		Randomize      (-0.272, -0.113, 0.218)
		colorDistMagn   0.501516
		colorDistFreq   0.0186746
		detailScale     193.528
		colorConversion true
		snowLevel       2
		tropicLatitude  0.020314
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.617924
		terraceProb     0.326764
		erosion         0
		montesMagn      0.471682
		montesFreq      3.34679
		montesSpiky     0.870047
		montesFraction  0.37414
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.114695
		hillsFraction   0.829323
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257395
		craterFreq      0.195869
		craterDensity   1.02237
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.468678
		volcanoTemp     1457.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.305, 0.265, 0.217, 0.000)
		colorShelf     (0.313, 0.273, 0.248, 0.000)
		colorBeach     (0.368, 0.320, 0.295, 0.000)
		colorDesert    (0.399, 0.343, 0.287, 0.000)
		colorLowland   (0.438, 0.366, 0.326, 0.000)
		colorUpland    (0.485, 0.444, 0.396, 0.000)
		colorRock      (0.524, 0.483, 0.427, 0.000)
		colorSnow      (0.571, 0.514, 0.450, 1.000)
		BumpHeight      6.37848
		BumpOffset      1.2757
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.209021
		Period          0.0898708
		Eccentricity    0.119466
		Inclination     1.25381
		AscendingNode   124.68
		ArgOfPericenter 141.367
		MeanAnomaly     175.203
	}
}

Asteroid	"Domir S9"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            4.57757e-018
	Radius          0.00999589
	InertiaMoment   0.397712

	RotationPeriod  2080.89
	Obliquity       -1.62797
	EqAscendNode    -135.933

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.629 0.626 0.623)

	Surface
	{
		SurfStyle       0.258357
		OceanStyle      0.750199
		Randomize      (0.321, -0.757, 0.663)
		colorDistMagn   0.291227
		colorDistFreq   5.48179e-008
		detailScale     0.272954
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0213133
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.507593
		terraceProb     0.126906
		erosion         0
		montesMagn      0.462446
		montesFreq      3.40996
		montesSpiky     0.963256
		montesFraction  0.293658
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.48359e-007
		hillsFraction   0.845921
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.211831
		craterFreq      0.249175
		craterDensity   0.998066
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.527975
		volcanoTemp     1507.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.252, 0.251, 0.249, 0.000)
		colorShelf     (0.267, 0.266, 0.265, 0.000)
		colorBeach     (0.283, 0.282, 0.280, 0.000)
		colorDesert    (0.299, 0.297, 0.296, 0.000)
		colorLowland   (0.315, 0.313, 0.312, 0.000)
		colorUpland    (0.330, 0.329, 0.327, 0.000)
		colorRock      (0.346, 0.344, 0.343, 0.000)
		colorSnow      (0.362, 0.360, 0.358, 1.000)
		BumpHeight      0.0089963
		BumpOffset      0.00179926
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.329703
		Period          0.17804
		Eccentricity    0.0749408
		Inclination     -1.62797
		AscendingNode   -135.933
		ArgOfPericenter -1.08758
		MeanAnomaly     -32.9424
	}
}

Asteroid	"Domir S10"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            6.73615e-015
	Radius          0.113696
	InertiaMoment   0.398978

	Obliquity       2.24055
	EqAscendNode    -82.4115
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.419 0.414 0.409)

	Surface
	{
		SurfStyle       0.0404527
		OceanStyle      0.848489
		Randomize      (-0.932, -0.092, -0.278)
		colorDistMagn   0.367647
		colorDistFreq   3.48492e-006
		detailScale     3.10467
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0588008
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.444319
		terraceProb     0.298723
		erosion         0
		montesMagn      0.528942
		montesFreq      3.24465
		montesSpiky     0.96559
		montesFraction  0.662171
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.06042e-005
		hillsFraction   0.695472
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25575
		craterFreq      0.148788
		craterDensity   1.01689
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.462111
		volcanoTemp     1507.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.168, 0.165, 0.164, 0.000)
		colorShelf     (0.178, 0.176, 0.174, 0.000)
		colorBeach     (0.189, 0.186, 0.184, 0.000)
		colorDesert    (0.199, 0.196, 0.194, 0.000)
		colorLowland   (0.210, 0.207, 0.204, 0.000)
		colorUpland    (0.220, 0.217, 0.215, 0.000)
		colorRock      (0.231, 0.228, 0.225, 0.000)
		colorSnow      (0.241, 0.238, 0.235, 1.000)
		BumpHeight      0.102327
		BumpOffset      0.0204653
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.174384
		Period          0.0684846
		Eccentricity    0.0683516
		Inclination     2.24055
		AscendingNode   -82.4115
		ArgOfPericenter 128.5
		MeanAnomaly     -134.64
	}
}

Asteroid	"Domir S11"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            9.9126e-012
	Radius          1.45259
	InertiaMoment   0.399915

	Obliquity       0.855116
	EqAscendNode    131.89
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.763 0.739 0.700)

	Surface
	{
		SurfStyle       0.48085
		OceanStyle      0.696982
		Randomize      (0.028, 0.473, 0.951)
		colorDistMagn   0.147436
		colorDistFreq   0.00145145
		detailScale     39.6653
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0121677
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.618963
		terraceProb     0.180268
		erosion         0
		montesMagn      0.593371
		montesFreq      3.65128
		montesSpiky     0.990156
		montesFraction  0.891601
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00476912
		hillsFraction   0.61952
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.207392
		craterFreq      0.213618
		craterDensity   0.833066
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.543428
		volcanoTemp     1353.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.305, 0.295, 0.280, 0.000)
		colorShelf     (0.324, 0.314, 0.298, 0.000)
		colorBeach     (0.343, 0.332, 0.315, 0.000)
		colorDesert    (0.362, 0.351, 0.333, 0.000)
		colorLowland   (0.382, 0.369, 0.350, 0.000)
		colorUpland    (0.401, 0.388, 0.368, 0.000)
		colorRock      (0.420, 0.406, 0.385, 0.000)
		colorSnow      (0.439, 0.425, 0.403, 1.000)
		BumpHeight      1.30733
		BumpOffset      0.261466
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.31296
		Period          0.164651
		Eccentricity    0.0679025
		Inclination     0.855116
		AscendingNode   131.89
		ArgOfPericenter -59.1946
		MeanAnomaly     -89.2554
	}
}

Asteroid	"Domir S12"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            1.45869e-008
	Radius          18.7998
	InertiaMoment   0.398023

	Obliquity       0.299086
	EqAscendNode    163.462
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.490 0.485 0.480)

	Surface
	{
		SurfStyle       0.613531
		OceanStyle      0.432667
		Randomize      (0.859, 0.190, -0.993)
		colorDistMagn   0.825543
		colorDistFreq   0.2134
		detailScale     513.361
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00150498
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.447497
		terraceProb     0.30073
		erosion         0
		montesMagn      0.378524
		montesFreq      3.35685
		montesSpiky     0.908774
		montesFraction  0.704493
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.866843
		hillsFraction   0.877633
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242159
		craterFreq      0.177316
		craterDensity   0.84897
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.487225
		volcanoTemp     1890.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.191, 0.165, 0.134, 0.000)
		colorShelf     (0.196, 0.170, 0.154, 0.000)
		colorBeach     (0.230, 0.199, 0.182, 0.000)
		colorDesert    (0.250, 0.214, 0.178, 0.000)
		colorLowland   (0.274, 0.228, 0.202, 0.000)
		colorUpland    (0.304, 0.277, 0.245, 0.000)
		colorRock      (0.328, 0.301, 0.264, 0.000)
		colorSnow      (0.357, 0.320, 0.278, 1.000)
		BumpHeight      16.9198
		BumpOffset      3.38397
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.174098
		Period          0.0683162
		Eccentricity    0.0668214
		Inclination     0.299086
		AscendingNode   163.462
		ArgOfPericenter -24.2676
		MeanAnomaly     43.6145
	}
}

Asteroid	"Domir S13"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            8.54555e-017
	Radius          0.0265169
	InertiaMoment   0.399174

	Obliquity       -3.46482
	EqAscendNode    98.2486
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.593 0.584 0.581)

	Surface
	{
		SurfStyle       0.993135
		OceanStyle      0.44188
		Randomize      (-0.313, 0.736, 0.505)
		colorDistMagn   0.823182
		colorDistFreq   4.84034e-007
		detailScale     0.724088
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0790389
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.289293
		terraceProb     0.191991
		erosion         0
		montesMagn      0.356327
		montesFreq      2.76666
		montesSpiky     0.894902
		montesFraction  0.394487
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.82903e-006
		hillsFraction   0.642005
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.278862
		craterFreq      0.185965
		craterDensity   1.01875
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.447117
		volcanoTemp     1369.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.201, 0.205, 0.233, 0.050)
		colorShelf     (0.237, 0.240, 0.267, 0.040)
		colorBeach     (0.273, 0.275, 0.302, 0.030)
		colorDesert    (0.308, 0.310, 0.343, 0.020)
		colorLowland   (0.344, 0.345, 0.378, 0.030)
		colorUpland    (0.379, 0.380, 0.413, 0.050)
		colorRock      (0.415, 0.415, 0.459, 0.020)
		colorSnow      (0.415, 0.415, 0.459, 1.000)
		BumpHeight      0.0238652
		BumpOffset      0.00477304
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.187279
		Period          0.0762194
		Eccentricity    0.083189
		Inclination     -3.46482
		AscendingNode   98.2486
		ArgOfPericenter 62.4957
		MeanAnomaly     -19.0651
	}
}

Asteroid	"Domir S14"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            1.25752e-013
	Radius          0.338782
	InertiaMoment   0.395815

	Obliquity       0.335119
	EqAscendNode    -159.004
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.572 0.426 0.374)

	Surface
	{
		SurfStyle       0.0520062
		OceanStyle      0.784352
		Randomize      (0.177, 0.586, 0.289)
		colorDistMagn   0.599117
		colorDistFreq   5.90699e-005
		detailScale     9.251
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00212837
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.478049
		terraceProb     0.273942
		erosion         0
		montesMagn      0.450191
		montesFreq      2.77817
		montesSpiky     0.93327
		montesFraction  0.309108
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000252999
		hillsFraction   0.764868
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229405
		craterFreq      0.220033
		craterDensity   1.09677
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.536989
		volcanoTemp     1516.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.229, 0.170, 0.150, 0.000)
		colorShelf     (0.243, 0.181, 0.159, 0.000)
		colorBeach     (0.258, 0.192, 0.168, 0.000)
		colorDesert    (0.272, 0.202, 0.178, 0.000)
		colorLowland   (0.286, 0.213, 0.187, 0.000)
		colorUpland    (0.300, 0.224, 0.196, 0.000)
		colorRock      (0.315, 0.234, 0.206, 0.000)
		colorSnow      (0.329, 0.245, 0.215, 1.000)
		BumpHeight      0.304903
		BumpOffset      0.0609807
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.165019
		Period          0.0630425
		Eccentricity    0.0154787
		Inclination     0.335119
		AscendingNode   -159.004
		ArgOfPericenter 37.1118
		MeanAnomaly     95.1298
	}
}



Asteroid	"Domir S15"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            1.85051e-010
	Radius          4.38487
	InertiaMoment   0.398292

	RotationPeriod  1381.22
	Obliquity       -1.9721
	EqAscendNode    23.3638

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.692 0.690 0.689)

	Surface
	{
		SurfStyle       0.54335
		OceanStyle      0.579241
		Randomize      (-0.426, -0.436, -0.004)
		colorDistMagn   0.690894
		colorDistFreq   0.0144645
		detailScale     119.736
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0673613
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.325019
		terraceProb     0.151799
		erosion         0
		montesMagn      0.611515
		montesFreq      3.54269
		montesSpiky     0.855798
		montesFraction  0.898048
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0238611
		hillsFraction   0.563135
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.206012
		craterFreq      0.216791
		craterDensity   0.692306
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.454965
		volcanoTemp     1556.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.270, 0.235, 0.193, 0.000)
		colorShelf     (0.277, 0.242, 0.220, 0.000)
		colorBeach     (0.325, 0.283, 0.262, 0.000)
		colorDesert    (0.353, 0.304, 0.255, 0.000)
		colorLowland   (0.388, 0.324, 0.289, 0.000)
		colorUpland    (0.429, 0.393, 0.351, 0.000)
		colorRock      (0.464, 0.428, 0.379, 0.000)
		colorSnow      (0.505, 0.456, 0.399, 1.000)
		BumpHeight      3.94638
		BumpOffset      0.789276
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.216202
		Period          0.0945418
		Eccentricity    0.125933
		Inclination     -1.9721
		AscendingNode   23.3638
		ArgOfPericenter -170.35
		MeanAnomaly     6.92896
	}
}




Asteroid	"Domir S17"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            1.5953e-015
	Radius          0.0790126
	InertiaMoment   0.396773

	Obliquity       -3.92024
	EqAscendNode    -17.1724
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.449 0.444 0.443)

	Surface
	{
		SurfStyle       0.291691
		OceanStyle      0.499538
		Randomize      (0.510, 0.655, -0.735)
		colorDistMagn   0.92437
		colorDistFreq   4.99481e-006
		detailScale     2.15757
		colorConversion true
		snowLevel       2
		tropicLatitude  0.134894
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.535791
		terraceProb     0.617292
		erosion         0
		montesMagn      0.660035
		montesFreq      2.03788
		montesSpiky     0.983803
		montesFraction  0.449098
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.43181e-005
		hillsFraction   0.433566
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23819
		craterFreq      0.200126
		craterDensity   0.833743
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.471099
		volcanoTemp     1615.09
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.180, 0.178, 0.177, 0.000)
		colorShelf     (0.191, 0.189, 0.188, 0.000)
		colorBeach     (0.202, 0.200, 0.199, 0.000)
		colorDesert    (0.213, 0.211, 0.210, 0.000)
		colorLowland   (0.225, 0.222, 0.221, 0.000)
		colorUpland    (0.236, 0.233, 0.232, 0.000)
		colorRock      (0.247, 0.244, 0.244, 0.000)
		colorSnow      (0.258, 0.256, 0.255, 1.000)
		BumpHeight      0.0711113
		BumpOffset      0.0142223
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.169974
		Period          0.0659032
		Eccentricity    0.0441795
		Inclination     -3.92024
		AscendingNode   -17.1724
		ArgOfPericenter 67.5883
		MeanAnomaly     39.0814
	}
}

Asteroid	"Domir S18"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            2.34758e-012
	Radius          1.02267
	InertiaMoment   0.398534

	Obliquity       1.94627
	EqAscendNode    -51.6507
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.427 0.422 0.417)

	Surface
	{
		SurfStyle       0.243365
		OceanStyle      0.920384
		Randomize      (0.118, 0.474, 0.466)
		colorDistMagn   0.452733
		colorDistFreq   0.000603973
		detailScale     27.9258
		colorConversion true
		snowLevel       2
		tropicLatitude  0.061112
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.408859
		terraceProb     0.148977
		erosion         0
		montesMagn      0.301672
		montesFreq      2.599
		montesSpiky     0.907041
		montesFraction  0.779792
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00262137
		hillsFraction   0.459392
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22163
		craterFreq      0.194987
		craterDensity   0.866013
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.458601
		volcanoTemp     1598.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.171, 0.169, 0.167, 0.000)
		colorShelf     (0.182, 0.180, 0.177, 0.000)
		colorBeach     (0.192, 0.190, 0.187, 0.000)
		colorDesert    (0.203, 0.201, 0.198, 0.000)
		colorLowland   (0.214, 0.211, 0.208, 0.000)
		colorUpland    (0.224, 0.222, 0.219, 0.000)
		colorRock      (0.235, 0.232, 0.229, 0.000)
		colorSnow      (0.246, 0.243, 0.240, 1.000)
		BumpHeight      0.920405
		BumpOffset      0.184081
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.171721
		Period          0.0669216
		Eccentricity    0.0539008
		Inclination     1.94627
		AscendingNode   -51.6507
		ArgOfPericenter 82.0002
		MeanAnomaly     -155.307
	}
}

Asteroid	"Domir S19"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            3.45459e-009
	Radius          9.10033
	InertiaMoment   0.399545

	Obliquity       4.93646
	EqAscendNode    62.6366
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.726 0.721 0.719)

	Surface
	{
		SurfStyle       0.700678
		OceanStyle      0.575059
		Randomize      (-0.009, 0.990, -0.325)
		colorDistMagn   0.788807
		colorDistFreq   0.0446065
		detailScale     248.5
		colorConversion true
		snowLevel       2
		tropicLatitude  0.146628
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.54185
		terraceProb     0.326544
		erosion         0
		montesMagn      0.456522
		montesFreq      2.9692
		montesSpiky     0.893085
		montesFraction  0.264588
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.165669
		hillsFraction   0.439404
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.216541
		craterFreq      0.236953
		craterDensity   0.732387
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.544583
		volcanoTemp     1745.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.283, 0.245, 0.201, 0.000)
		colorShelf     (0.291, 0.252, 0.230, 0.000)
		colorBeach     (0.341, 0.296, 0.273, 0.000)
		colorDesert    (0.370, 0.317, 0.266, 0.000)
		colorLowland   (0.407, 0.339, 0.302, 0.000)
		colorUpland    (0.450, 0.411, 0.367, 0.000)
		colorRock      (0.487, 0.447, 0.396, 0.000)
		colorSnow      (0.530, 0.476, 0.417, 1.000)
		BumpHeight      8.1903
		BumpOffset      1.63806
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.186703
		Period          0.075868
		Eccentricity    0.129822
		Inclination     4.93646
		AscendingNode   62.6366
		ArgOfPericenter -88.7163
		MeanAnomaly     -109.868
	}
}

Asteroid	"Domir S20"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            2.02382e-017
	Radius          0.0184277
	InertiaMoment   0.397299

	Obliquity       -2.76839
	EqAscendNode    38.9816
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.601 0.530 0.498)

	Surface
	{
		SurfStyle       0.515025
		OceanStyle      0.737961
		Randomize      (0.551, 0.064, -0.563)
		colorDistMagn   0.83367
		colorDistFreq   1.63419e-007
		detailScale     0.5032
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0909677
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.539106
		terraceProb     0.12979
		erosion         0
		montesMagn      0.408718
		montesFreq      2.20272
		montesSpiky     0.92726
		montesFraction  0.520242
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.12455e-006
		hillsFraction   0.646342
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.269552
		craterFreq      0.151506
		craterDensity   0.906672
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.505498
		volcanoTemp     1529.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.234, 0.180, 0.139, 0.000)
		colorShelf     (0.240, 0.186, 0.159, 0.000)
		colorBeach     (0.282, 0.217, 0.189, 0.000)
		colorDesert    (0.306, 0.233, 0.184, 0.000)
		colorLowland   (0.336, 0.249, 0.209, 0.000)
		colorUpland    (0.372, 0.302, 0.254, 0.000)
		colorRock      (0.402, 0.329, 0.274, 0.000)
		colorSnow      (0.439, 0.350, 0.289, 1.000)
		BumpHeight      0.016585
		BumpOffset      0.00331699
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.193113
		Period          0.0798085
		Eccentricity    0.0710596
		Inclination     -2.76839
		AscendingNode   38.9816
		ArgOfPericenter 59.0503
		MeanAnomaly     -126.102
	}
}

Asteroid	"Domir S21"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            2.97816e-014
	Radius          0.238514
	InertiaMoment   0.398755

	RotationPeriod  3288.21
	Obliquity       -4.58698
	EqAscendNode    -61.8816

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.622 0.618 0.612)

	Surface
	{
		SurfStyle       0.548901
		OceanStyle      0.505656
		Randomize      (0.370, 0.318, -0.952)
		colorDistMagn   0.260795
		colorDistFreq   2.33933e-005
		detailScale     6.51302
		colorConversion true
		snowLevel       2
		tropicLatitude  0.136861
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.688721
		terraceProb     0.551815
		erosion         0
		montesMagn      0.46107
		montesFreq      2.02188
		montesSpiky     0.990032
		montesFraction  0.662163
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000182531
		hillsFraction   0.743795
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.215803
		craterFreq      0.251213
		craterDensity   1.02639
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.459578
		volcanoTemp     1643.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.243, 0.210, 0.171, 0.000)
		colorShelf     (0.249, 0.216, 0.196, 0.000)
		colorBeach     (0.293, 0.253, 0.233, 0.000)
		colorDesert    (0.317, 0.272, 0.227, 0.000)
		colorLowland   (0.349, 0.291, 0.257, 0.000)
		colorUpland    (0.386, 0.352, 0.312, 0.000)
		colorRock      (0.417, 0.383, 0.337, 0.000)
		colorSnow      (0.454, 0.408, 0.355, 1.000)
		BumpHeight      0.214662
		BumpOffset      0.0429325
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.294169
		Period          0.150047
		Eccentricity    0.138758
		Inclination     -4.58698
		AscendingNode   -61.8816
		ArgOfPericenter -54.1228
		MeanAnomaly     -133.112
	}
}

Asteroid	"Domir S22"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            4.38252e-011
	Radius          2.1225
	InertiaMoment   0.399725

	RotationPeriod  4153.93
	Obliquity       -3.44321
	EqAscendNode    -108.324

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.572 0.505 0.415)

	Surface
	{
		SurfStyle       0.477049
		OceanStyle      0.944302
		Randomize      (0.497, -0.980, 0.721)
		colorDistMagn   0.713368
		colorDistFreq   0.00348022
		detailScale     57.9584
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0702851
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.496267
		terraceProb     0.326503
		erosion         0
		montesMagn      0.401955
		montesFreq      2.62813
		montesSpiky     0.865264
		montesFraction  0.491142
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0133657
		hillsFraction   0.570713
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237801
		craterFreq      0.210331
		craterDensity   1.03741
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.508458
		volcanoTemp     1452.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.229, 0.202, 0.166, 0.000)
		colorShelf     (0.243, 0.215, 0.176, 0.000)
		colorBeach     (0.258, 0.227, 0.187, 0.000)
		colorDesert    (0.272, 0.240, 0.197, 0.000)
		colorLowland   (0.286, 0.253, 0.207, 0.000)
		colorUpland    (0.300, 0.265, 0.218, 0.000)
		colorRock      (0.315, 0.278, 0.228, 0.000)
		colorSnow      (0.329, 0.290, 0.238, 1.000)
		BumpHeight      1.91025
		BumpOffset      0.38205
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.304422
		Period          0.15796
		Eccentricity    0.169474
		Inclination     -3.44321
		AscendingNode   -108.324
		ArgOfPericenter -167.578
		MeanAnomaly     144.618
	}
}

Asteroid	"Domir S23"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            6.44911e-008
	Radius          27.1139
	InertiaMoment   0.397686

	Obliquity       1.14726
	EqAscendNode    -65.52
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.831 0.755 0.709)

	Surface
	{
		SurfStyle       0.475612
		OceanStyle      0.807562
		Randomize      (0.068, -0.396, -0.803)
		colorDistMagn   0.371352
		colorDistFreq   0.190234
		detailScale     740.39
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0336707
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.535113
		terraceProb     0.16021
		erosion         0
		montesMagn      0.453756
		montesFreq      2.15557
		montesSpiky     0.990822
		montesFraction  0.878315
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.01371
		hillsFraction   0.796283
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249471
		craterFreq      0.264367
		craterDensity   1.0486
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.480874
		volcanoTemp     1406.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.332, 0.302, 0.284, 0.000)
		colorShelf     (0.353, 0.321, 0.301, 0.000)
		colorBeach     (0.374, 0.340, 0.319, 0.000)
		colorDesert    (0.395, 0.359, 0.337, 0.000)
		colorLowland   (0.416, 0.377, 0.355, 0.000)
		colorUpland    (0.436, 0.396, 0.372, 0.000)
		colorRock      (0.457, 0.415, 0.390, 0.000)
		colorSnow      (0.478, 0.434, 0.408, 1.000)
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
		SemiMajorAxis   0.289462
		Period          0.14646
		Eccentricity    0.0351951
		Inclination     1.14726
		AscendingNode   -65.52
		ArgOfPericenter 80.4196
		MeanAnomaly     16.1239
	}
}

Asteroid	"Domir S24"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            3.77813e-016
	Radius          0.0556276
	InertiaMoment   0.398963

	Obliquity       0.733057
	EqAscendNode    54.941
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.535 0.532 0.530)

	Surface
	{
		SurfStyle       0.5031
		OceanStyle      0.519558
		Randomize      (-0.448, -0.456, -0.364)
		colorDistMagn   0.74585
		colorDistFreq   2.38914e-006
		detailScale     1.519
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0227023
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.335228
		terraceProb     0.138729
		erosion         0
		montesMagn      0.424295
		montesFreq      3.27996
		montesSpiky     0.985599
		montesFraction  0.288206
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.68683e-006
		hillsFraction   0.925993
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257602
		craterFreq      0.171587
		craterDensity   0.984527
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.557126
		volcanoTemp     1355.95
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.209, 0.181, 0.148, 0.000)
		colorShelf     (0.214, 0.186, 0.169, 0.000)
		colorBeach     (0.252, 0.218, 0.201, 0.000)
		colorDesert    (0.273, 0.234, 0.196, 0.000)
		colorLowland   (0.300, 0.250, 0.222, 0.000)
		colorUpland    (0.332, 0.303, 0.270, 0.000)
		colorRock      (0.359, 0.330, 0.291, 0.000)
		colorSnow      (0.391, 0.351, 0.307, 1.000)
		BumpHeight      0.0500648
		BumpOffset      0.010013
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.214644
		Period          0.0935217
		Eccentricity    0.0640843
		Inclination     0.733057
		AscendingNode   54.941
		ArgOfPericenter 100.353
		MeanAnomaly     -146.378
	}
}

Asteroid	"Domir S25"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            5.55972e-013
	Radius          0.495025
	InertiaMoment   0.399901

	RotationPeriod  2513.34
	Obliquity       -1.73502
	EqAscendNode    -143.567

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.607 0.605 0.603)

	Surface
	{
		SurfStyle       0.780877
		OceanStyle      0.0543149
		Randomize      (0.770, -0.356, -0.916)
		colorDistMagn   0.0167259
		colorDistFreq   2.62166e-005
		detailScale     13.5175
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0189291
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.439687
		terraceProb     0.245844
		erosion         0
		montesMagn      0.441587
		montesFreq      3.0774
		montesSpiky     0.834705
		montesFraction  0.395451
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000372034
		hillsFraction   0.726225
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242478
		craterFreq      0.18221
		craterDensity   0.967642
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.452894
		volcanoTemp     1534.82
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.237, 0.206, 0.169, 0.000)
		colorShelf     (0.243, 0.212, 0.193, 0.000)
		colorBeach     (0.286, 0.248, 0.229, 0.000)
		colorDesert    (0.310, 0.266, 0.223, 0.000)
		colorLowland   (0.340, 0.285, 0.253, 0.000)
		colorUpland    (0.377, 0.345, 0.307, 0.000)
		colorRock      (0.407, 0.375, 0.332, 0.000)
		colorSnow      (0.443, 0.400, 0.350, 1.000)
		BumpHeight      0.445522
		BumpOffset      0.0891044
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.285363
		Period          0.14336
		Eccentricity    0.172753
		Inclination     -1.73502
		AscendingNode   -143.567
		ArgOfPericenter -46.3197
		MeanAnomaly     26.7182
	}
}

Asteroid	"Domir S26"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            8.18142e-010
	Radius          6.32433
	InertiaMoment   0.398001

	Obliquity       -3.8849
	EqAscendNode    56.7884
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.824 0.796 0.759)

	Surface
	{
		SurfStyle       0.248392
		OceanStyle      0.120043
		Randomize      (-0.653, -0.675, -0.977)
		colorDistMagn   0.692806
		colorDistFreq   0.0124924
		detailScale     172.696
		colorConversion true
		snowLevel       2
		tropicLatitude  0.118991
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.409213
		terraceProb     0.244514
		erosion         0
		montesMagn      0.335123
		montesFreq      2.90694
		montesSpiky     0.778165
		montesFraction  0.701337
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0777623
		hillsFraction   0.718363
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258327
		craterFreq      0.151163
		craterDensity   0.709608
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.476089
		volcanoTemp     1517.33
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.330, 0.318, 0.304, 0.000)
		colorShelf     (0.350, 0.338, 0.323, 0.000)
		colorBeach     (0.371, 0.358, 0.342, 0.000)
		colorDesert    (0.391, 0.378, 0.361, 0.000)
		colorLowland   (0.412, 0.398, 0.380, 0.000)
		colorUpland    (0.432, 0.418, 0.399, 0.000)
		colorRock      (0.453, 0.438, 0.418, 0.000)
		colorSnow      (0.474, 0.458, 0.437, 1.000)
		BumpHeight      5.6919
		BumpOffset      1.13838
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.282233
		Period          0.141008
		Eccentricity    0.0757549
		Inclination     -3.8849
		AscendingNode   56.7884
		ArgOfPericenter -27.2843
		MeanAnomaly     34.8129
	}
}

Asteroid	"Domir S27"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            4.79298e-018
	Radius          0.0129738
	InertiaMoment   0.399159

	Obliquity       2.02449
	EqAscendNode    33.7684
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.560 0.491 0.374)

	Surface
	{
		SurfStyle       0.656236
		OceanStyle      0.831305
		Randomize      (-0.278, 0.306, 0.035)
		colorDistMagn   0.821323
		colorDistFreq   7.22241e-008
		detailScale     0.35427
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0675694
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.470457
		terraceProb     0.188461
		erosion         0
		montesMagn      0.344196
		montesFreq      3.54798
		montesSpiky     0.941631
		montesFraction  0.376425
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.05677e-007
		hillsFraction   0.648813
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243308
		craterFreq      0.196584
		craterDensity   0.961528
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.574282
		volcanoTemp     1507.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.218, 0.167, 0.105, 0.000)
		colorShelf     (0.224, 0.172, 0.120, 0.000)
		colorBeach     (0.263, 0.201, 0.142, 0.000)
		colorDesert    (0.285, 0.216, 0.138, 0.000)
		colorLowland   (0.313, 0.231, 0.157, 0.000)
		colorUpland    (0.347, 0.280, 0.191, 0.000)
		colorRock      (0.375, 0.304, 0.206, 0.000)
		colorSnow      (0.408, 0.324, 0.217, 1.000)
		BumpHeight      0.0116764
		BumpOffset      0.00233528
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.384071
		Period          0.223846
		Eccentricity    0.0447198
		Inclination     2.02449
		AscendingNode   33.7684
		ArgOfPericenter -44.5613
		MeanAnomaly     -49.5885
	}
}



Asteroid	"Domir S28"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            7.05312e-015
	Radius          0.115452
	InertiaMoment   0.395685

	RotationPeriod  5132.05
	Obliquity       -3.97942
	EqAscendNode    138.761

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.729 0.617 0.567)

	Surface
	{
		SurfStyle       0.774958
		OceanStyle      0.354189
		Randomize      (0.819, 0.832, 0.714)
		colorDistMagn   0.26934
		colorDistFreq   6.08487e-006
		detailScale     3.15262
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0488635
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.582744
		terraceProb     0.522095
		erosion         0
		montesMagn      0.267024
		montesFreq      3.46898
		montesSpiky     0.988675
		montesFraction  0.682373
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.2117e-005
		hillsFraction   0.716403
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213352
		craterFreq      0.185976
		craterDensity   0.837508
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.581623
		volcanoTemp     1510.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.284, 0.210, 0.159, 0.000)
		colorShelf     (0.291, 0.216, 0.181, 0.000)
		colorBeach     (0.342, 0.253, 0.215, 0.000)
		colorDesert    (0.372, 0.271, 0.210, 0.000)
		colorLowland   (0.408, 0.290, 0.238, 0.000)
		colorUpland    (0.452, 0.351, 0.289, 0.000)
		colorRock      (0.488, 0.382, 0.312, 0.000)
		colorSnow      (0.532, 0.407, 0.329, 1.000)
		BumpHeight      0.103907
		BumpOffset      0.0207814
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.350507
		Period          0.195154
		Eccentricity    0.161065
		Inclination     -3.97942
		AscendingNode   138.761
		ArgOfPericenter 63.6738
		MeanAnomaly     165.944
	}
}




Asteroid	"Domir S30"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            1.52733e-008
	Radius          19.0902
	InertiaMoment   0.399348

	RotationPeriod  907.814
	Obliquity       -0.471843
	EqAscendNode    -67.4616

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.610 0.605 0.601)

	Surface
	{
		SurfStyle       0.130918
		OceanStyle      0.671374
		Randomize      (0.973, 0.651, -0.929)
		colorDistMagn   0.95398
		colorDistFreq   0.175346
		detailScale     521.289
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0136977
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.449077
		terraceProb     0.103063
		erosion         0
		montesMagn      0.56508
		montesFreq      2.70999
		montesSpiky     0.985505
		montesFraction  0.459106
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.33548
		hillsFraction   0.876181
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261134
		craterFreq      0.229939
		craterDensity   1.04061
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.441344
		volcanoTemp     1644.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.244, 0.242, 0.240, 0.000)
		colorShelf     (0.259, 0.257, 0.255, 0.000)
		colorBeach     (0.274, 0.272, 0.270, 0.000)
		colorDesert    (0.290, 0.287, 0.285, 0.000)
		colorLowland   (0.305, 0.302, 0.300, 0.000)
		colorUpland    (0.320, 0.317, 0.315, 0.000)
		colorRock      (0.335, 0.333, 0.330, 0.000)
		colorSnow      (0.351, 0.348, 0.345, 1.000)
		BumpHeight      17.1812
		BumpOffset      3.43623
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.175329
		Period          0.0690421
		Eccentricity    0.0733739
		Inclination     -0.471843
		AscendingNode   -67.4616
		ArgOfPericenter -129.392
		MeanAnomaly     -33.7778
	}
}

Asteroid	"Domir S31"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            8.94763e-017
	Radius          0.0269265
	InertiaMoment   0.396722

	Obliquity       -0.322924
	EqAscendNode    -101.721
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.467 0.405 0.366)

	Surface
	{
		SurfStyle       0.95494
		OceanStyle      0.917981
		Randomize      (0.601, -0.455, -0.678)
		colorDistMagn   0.818524
		colorDistFreq   2.34292e-007
		detailScale     0.735272
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00711782
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.618174
		terraceProb     0.181841
		erosion         0
		montesMagn      0.543518
		montesFreq      2.87027
		montesSpiky     0.96357
		montesFraction  0.590743
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.04554e-006
		hillsFraction   0.558251
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.200804
		craterFreq      0.21584
		craterDensity   1.01887
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.469803
		volcanoTemp     1503.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.159, 0.142, 0.146, 0.050)
		colorShelf     (0.187, 0.166, 0.168, 0.040)
		colorBeach     (0.215, 0.191, 0.190, 0.030)
		colorDesert    (0.243, 0.215, 0.216, 0.020)
		colorLowland   (0.271, 0.239, 0.238, 0.030)
		colorUpland    (0.299, 0.264, 0.260, 0.050)
		colorRock      (0.327, 0.288, 0.289, 0.020)
		colorSnow      (0.327, 0.288, 0.289, 1.000)
		BumpHeight      0.0242338
		BumpOffset      0.00484676
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.307765
		Period          0.160569
		Eccentricity    0.0512009
		Inclination     -0.322924
		AscendingNode   -101.721
		ArgOfPericenter 145.047
		MeanAnomaly     84.8056
	}
}

Asteroid	"Domir S32"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            1.31669e-013
	Radius          0.344014
	InertiaMoment   0.398516

	RotationPeriod  2922.93
	Obliquity       -3.26811
	EqAscendNode    -44.03

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.480 0.379 0.335)

	Surface
	{
		SurfStyle       0.0620774
		OceanStyle      0.619597
		Randomize      (0.536, -0.375, -0.655)
		colorDistMagn   0.476932
		colorDistFreq   5.79225e-005
		detailScale     9.39388
		colorConversion true
		snowLevel       2
		tropicLatitude  0.105556
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.580808
		terraceProb     0.337096
		erosion         0
		montesMagn      0.550789
		montesFreq      3.82695
		montesSpiky     0.884991
		montesFraction  0.491855
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000240993
		hillsFraction   0.444475
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219475
		craterFreq      0.240557
		craterDensity   0.970048
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.56759
		volcanoTemp     1596.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.192, 0.152, 0.134, 0.000)
		colorShelf     (0.204, 0.161, 0.142, 0.000)
		colorBeach     (0.216, 0.171, 0.151, 0.000)
		colorDesert    (0.228, 0.180, 0.159, 0.000)
		colorLowland   (0.240, 0.190, 0.168, 0.000)
		colorUpland    (0.252, 0.199, 0.176, 0.000)
		colorRock      (0.264, 0.208, 0.184, 0.000)
		colorSnow      (0.276, 0.218, 0.193, 1.000)
		BumpHeight      0.309613
		BumpOffset      0.0619226
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.271958
		Period          0.133379
		Eccentricity    0.17152
		Inclination     -3.26811
		AscendingNode   -44.03
		ArgOfPericenter -51.1078
		MeanAnomaly     19.2006
	}
}

Asteroid	"Domir S33"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            1.93758e-010
	Radius          4.45259
	InertiaMoment   0.399531

	Obliquity       1.57681
	EqAscendNode    74.506
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.856 0.792 0.737)

	Surface
	{
		SurfStyle       0.373797
		OceanStyle      0.968838
		Randomize      (0.673, 0.471, 0.377)
		colorDistMagn   0.397045
		colorDistFreq   0.0114483
		detailScale     121.585
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0437949
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.574061
		terraceProb     0.164527
		erosion         0
		montesMagn      0.467741
		montesFreq      2.81919
		montesSpiky     0.926893
		montesFraction  0.250789
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0578607
		hillsFraction   0.620366
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.277744
		craterFreq      0.235373
		craterDensity   0.979536
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.504169
		volcanoTemp     1644.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.342, 0.317, 0.295, 0.000)
		colorShelf     (0.364, 0.337, 0.313, 0.000)
		colorBeach     (0.385, 0.356, 0.331, 0.000)
		colorDesert    (0.406, 0.376, 0.350, 0.000)
		colorLowland   (0.428, 0.396, 0.368, 0.000)
		colorUpland    (0.449, 0.416, 0.387, 0.000)
		colorRock      (0.471, 0.436, 0.405, 0.000)
		colorSnow      (0.492, 0.455, 0.424, 1.000)
		BumpHeight      4.00733
		BumpOffset      0.801466
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.281594
		Period          0.14053
		Eccentricity    0.0418447
		Inclination     1.57681
		AscendingNode   74.506
		ArgOfPericenter -27.1587
		MeanAnomaly     144.39
	}
}

Asteroid	"Domir S34"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            2.85126e-007
	Radius          39.6144
	InertiaMoment   0.397265

	Obliquity       -0.271412
	EqAscendNode    -16.6082
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.662 0.604 0.579)

	Surface
	{
		SurfStyle       0.472693
		OceanStyle      0.928188
		Randomize      (0.676, -0.780, -0.597)
		colorDistMagn   0.412388
		colorDistFreq   0.869413
		detailScale     1081.74
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00937312
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.72252
		terraceProb     0.10499
		erosion         0
		montesMagn      0.629143
		montesFreq      3.28216
		montesSpiky     0.968168
		montesFraction  0.52467
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.74771
		hillsFraction   0.579969
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247847
		craterFreq      0.267016
		craterDensity   1.00875
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.516304
		volcanoTemp     1585.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.265, 0.242, 0.232, 0.000)
		colorShelf     (0.282, 0.257, 0.246, 0.000)
		colorBeach     (0.298, 0.272, 0.261, 0.000)
		colorDesert    (0.315, 0.287, 0.275, 0.000)
		colorLowland   (0.331, 0.302, 0.290, 0.000)
		colorUpland    (0.348, 0.317, 0.304, 0.000)
		colorRock      (0.364, 0.332, 0.319, 0.000)
		colorSnow      (0.381, 0.347, 0.333, 1.000)
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
		SemiMajorAxis   0.259435
		Period          0.124273
		Eccentricity    0.058478
		Inclination     -0.271412
		AscendingNode   -16.6082
		ArgOfPericenter -140.377
		MeanAnomaly     40.5303
	}
}

Asteroid	"Domir S35"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            1.67037e-015
	Radius          0.080233
	InertiaMoment   0.398739

	Obliquity       -5.00446
	EqAscendNode    56.2191
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.726 0.724 0.721)

	Surface
	{
		SurfStyle       0.836362
		OceanStyle      0.0384129
		Randomize      (0.547, 0.008, -0.189)
		colorDistMagn   0.494977
		colorDistFreq   2.97825e-006
		detailScale     2.1909
		colorConversion true
		snowLevel       2
		tropicLatitude  0.153432
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.329266
		terraceProb     0.122415
		erosion         0
		montesMagn      0.575971
		montesFreq      1.89754
		montesSpiky     0.967522
		montesFraction  0.491164
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.67025e-005
		hillsFraction   0.607109
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244091
		craterFreq      0.26293
		craterDensity   0.628534
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.470743
		volcanoTemp     1027.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.283, 0.246, 0.202, 0.000)
		colorShelf     (0.291, 0.254, 0.231, 0.000)
		colorBeach     (0.341, 0.297, 0.274, 0.000)
		colorDesert    (0.370, 0.319, 0.267, 0.000)
		colorLowland   (0.407, 0.340, 0.303, 0.000)
		colorUpland    (0.450, 0.413, 0.368, 0.000)
		colorRock      (0.487, 0.449, 0.397, 0.000)
		colorSnow      (0.530, 0.478, 0.418, 1.000)
		BumpHeight      0.0722097
		BumpOffset      0.0144419
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.291819
		Period          0.148253
		Eccentricity    0.0931188
		Inclination     -5.00446
		AscendingNode   56.2191
		ArgOfPericenter 136.068
		MeanAnomaly     117.156
	}
}

Asteroid	"Domir S36"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            2.45804e-012
	Radius          1.03847
	InertiaMoment   0.399711

	RotationPeriod  1675.36
	Obliquity       -5.4668
	EqAscendNode    -23.4664

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.605 0.602 0.600)

	Surface
	{
		SurfStyle       0.417259
		OceanStyle      0.517216
		Randomize      (-0.683, -0.428, 0.352)
		colorDistMagn   0.961881
		colorDistFreq   0.000530002
		detailScale     28.3571
		colorConversion true
		snowLevel       2
		tropicLatitude  0.185743
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.354799
		terraceProb     0.233138
		erosion         0
		montesMagn      0.545979
		montesFreq      2.60944
		montesSpiky     0.976031
		montesFraction  0.510327
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00314628
		hillsFraction   0.527371
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240685
		craterFreq      0.206763
		craterDensity   0.818039
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.456481
		volcanoTemp     1448.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.242, 0.241, 0.240, 0.000)
		colorShelf     (0.257, 0.256, 0.255, 0.000)
		colorBeach     (0.272, 0.271, 0.270, 0.000)
		colorDesert    (0.287, 0.286, 0.285, 0.000)
		colorLowland   (0.302, 0.301, 0.300, 0.000)
		colorUpland    (0.317, 0.316, 0.315, 0.000)
		colorRock      (0.333, 0.331, 0.330, 0.000)
		colorSnow      (0.348, 0.346, 0.345, 1.000)
		BumpHeight      0.934621
		BumpOffset      0.186924
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.263792
		Period          0.127417
		Eccentricity    0.109662
		Inclination     -5.4668
		AscendingNode   -23.4664
		ArgOfPericenter 142.122
		MeanAnomaly     131.301
	}
}

Asteroid	"Domir S37"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            3.61713e-009
	Radius          9.24087
	InertiaMoment   0.397659

	RotationPeriod  1494.09
	Obliquity       1.56132
	EqAscendNode    126.837

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.662 0.659 0.652)

	Surface
	{
		SurfStyle       0.00381326
		OceanStyle      0.49841
		Randomize      (-0.322, -0.837, 0.960)
		colorDistMagn   0.774009
		colorDistFreq   0.0651642
		detailScale     252.337
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0243829
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.51839
		terraceProb     0.380667
		erosion         0
		montesMagn      0.538706
		montesFreq      4.0933
		montesSpiky     0.910527
		montesFraction  0.553529
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.188276
		hillsFraction   0.528686
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225985
		craterFreq      0.199812
		craterDensity   0.905722
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.520088
		volcanoTemp     1736.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.265, 0.264, 0.261, 0.000)
		colorShelf     (0.282, 0.280, 0.277, 0.000)
		colorBeach     (0.298, 0.297, 0.294, 0.000)
		colorDesert    (0.315, 0.313, 0.310, 0.000)
		colorLowland   (0.331, 0.329, 0.326, 0.000)
		colorUpland    (0.348, 0.346, 0.343, 0.000)
		colorRock      (0.364, 0.362, 0.359, 0.000)
		colorSnow      (0.381, 0.379, 0.375, 1.000)
		BumpHeight      8.31678
		BumpOffset      1.66336
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.201751
		Period          0.0852229
		Eccentricity    0.0973742
		Inclination     1.56132
		AscendingNode   126.837
		ArgOfPericenter 52.4284
		MeanAnomaly     87.2995
	}
}

Asteroid	"Domir S38"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            2.11905e-017
	Radius          0.0187124
	InertiaMoment   0.398947

	RotationPeriod  1535.28
	Obliquity       0.503569
	EqAscendNode    179.701

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.827 0.774 0.691)

	Surface
	{
		SurfStyle       0.359273
		OceanStyle      0.43863
		Randomize      (0.248, 0.095, -0.448)
		colorDistMagn   0.729148
		colorDistFreq   5.18299e-008
		detailScale     0.510972
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.310602
		terraceProb     0.277119
		erosion         0
		montesMagn      0.512799
		montesFreq      3.60102
		montesSpiky     0.987435
		montesFraction  0.672668
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.64678e-007
		hillsFraction   0.59461
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22191
		craterFreq      0.197577
		craterDensity   0.94767
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.47473
		volcanoTemp     1509.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.331, 0.309, 0.276, 0.000)
		colorShelf     (0.352, 0.329, 0.294, 0.000)
		colorBeach     (0.372, 0.348, 0.311, 0.000)
		colorDesert    (0.393, 0.367, 0.328, 0.000)
		colorLowland   (0.414, 0.387, 0.345, 0.000)
		colorUpland    (0.434, 0.406, 0.363, 0.000)
		colorRock      (0.455, 0.425, 0.380, 0.000)
		colorSnow      (0.476, 0.445, 0.397, 1.000)
		BumpHeight      0.0168411
		BumpOffset      0.00336823
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.177045
		Period          0.0700579
		Eccentricity    0.0823527
		Inclination     0.503569
		AscendingNode   179.701
		ArgOfPericenter -72.5279
		MeanAnomaly     147.25
	}
}

Asteroid	"Domir S39"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            3.11829e-014
	Radius          0.21284
	InertiaMoment   0.399888

	RotationPeriod  4447.15
	Obliquity       0.21622
	EqAscendNode    -29.6461

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.494 0.491 0.485)

	Surface
	{
		SurfStyle       0.217398
		OceanStyle      0.681465
		Randomize      (-0.299, -0.328, -0.568)
		colorDistMagn   0.893927
		colorDistFreq   2.61932e-005
		detailScale     5.81196
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00729972
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.581722
		terraceProb     0.472423
		erosion         0
		montesMagn      0.658231
		montesFreq      3.2839
		montesSpiky     0.803719
		montesFraction  0.84461
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.39235e-005
		hillsFraction   0.615997
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255737
		craterFreq      0.17621
		craterDensity   0.757517
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.577175
		volcanoTemp     1467.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.198, 0.196, 0.194, 0.000)
		colorShelf     (0.210, 0.209, 0.206, 0.000)
		colorBeach     (0.222, 0.221, 0.218, 0.000)
		colorDesert    (0.235, 0.233, 0.230, 0.000)
		colorLowland   (0.247, 0.245, 0.242, 0.000)
		colorUpland    (0.259, 0.258, 0.255, 0.000)
		colorRock      (0.272, 0.270, 0.267, 0.000)
		colorSnow      (0.284, 0.282, 0.279, 1.000)
		BumpHeight      0.191556
		BumpOffset      0.0383113
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.318584
		Period          0.16911
		Eccentricity    0.126722
		Inclination     0.21622
		AscendingNode   -29.6461
		ArgOfPericenter 131.737
		MeanAnomaly     -18.8739
	}
}



Asteroid	"Domir S40"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            4.58872e-011
	Radius          2.75481
	InertiaMoment   0.397978

	Obliquity       -0.538263
	EqAscendNode    -121.261
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.769 0.641 0.572)

	Surface
	{
		SurfStyle       0.238615
		OceanStyle      0.727744
		Randomize      (0.770, -0.423, 0.905)
		colorDistMagn   0.58076
		colorDistFreq   0.00522883
		detailScale     75.2247
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00921277
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.520386
		terraceProb     0.245475
		erosion         0
		montesMagn      0.315078
		montesFreq      3.36785
		montesSpiky     0.85075
		montesFraction  0.72112
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0116699
		hillsFraction   0.595285
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.187277
		craterFreq      0.211393
		craterDensity   0.92371
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.595964
		volcanoTemp     1795.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.308, 0.256, 0.229, 0.000)
		colorShelf     (0.327, 0.272, 0.243, 0.000)
		colorBeach     (0.346, 0.288, 0.257, 0.000)
		colorDesert    (0.365, 0.304, 0.272, 0.000)
		colorLowland   (0.385, 0.321, 0.286, 0.000)
		colorUpland    (0.404, 0.337, 0.300, 0.000)
		colorRock      (0.423, 0.353, 0.315, 0.000)
		colorSnow      (0.442, 0.369, 0.329, 1.000)
		BumpHeight      2.47933
		BumpOffset      0.495866
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.337617
		Period          0.184488
		Eccentricity    0.0636473
		Inclination     -0.538263
		AscendingNode   -121.261
		ArgOfPericenter 45.9187
		MeanAnomaly     44.6438
	}
}

Asteroid	"Domir S41"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            6.75257e-008
	Radius          24.5118
	InertiaMoment   0.399144

	Obliquity       -3.64839
	EqAscendNode    -38.9352
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.672 0.667 0.664)

	Surface
	{
		SurfStyle       0.722545
		OceanStyle      0.820913
		Randomize      (0.882, -0.217, 0.812)
		colorDistMagn   0.517039
		colorDistFreq   0.263328
		detailScale     669.335
		colorConversion true
		snowLevel       2
		tropicLatitude  0.119775
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.710095
		terraceProb     0.14905
		erosion         0
		montesMagn      0.438744
		montesFreq      3.13931
		montesSpiky     0.987327
		montesFraction  0.151464
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.35276
		hillsFraction   0.53448
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227768
		craterFreq      0.272169
		craterDensity   0.860795
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.518167
		volcanoTemp     1533.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.262, 0.227, 0.186, 0.000)
		colorShelf     (0.269, 0.233, 0.212, 0.000)
		colorBeach     (0.316, 0.273, 0.252, 0.000)
		colorDesert    (0.343, 0.293, 0.246, 0.000)
		colorLowland   (0.376, 0.313, 0.279, 0.000)
		colorUpland    (0.417, 0.380, 0.338, 0.000)
		colorRock      (0.450, 0.414, 0.365, 0.000)
		colorSnow      (0.490, 0.440, 0.385, 1.000)
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
		SemiMajorAxis   0.171892
		Period          0.0670221
		Eccentricity    0.0548469
		Inclination     -3.64839
		AscendingNode   -38.9352
		ArgOfPericenter 11.9281
		MeanAnomaly     -31.3683
	}
}

Asteroid	"Domir S42"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            3.95589e-016
	Radius          0.0496398
	InertiaMoment   0.395533

	RotationPeriod  4916.59
	Obliquity       1.27289
	EqAscendNode    -49.9559

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.540 0.439 0.403)

	Surface
	{
		SurfStyle       0.108884
		OceanStyle      0.500162
		Randomize      (0.649, -0.574, -0.106)
		colorDistMagn   0.709289
		colorDistFreq   1.32039e-006
		detailScale     1.3555
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0402654
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.683981
		terraceProb     0.207795
		erosion         0
		montesMagn      0.507603
		montesFreq      2.26602
		montesSpiky     0.936632
		montesFraction  0.428213
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.61349e-006
		hillsFraction   0.733794
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.193987
		craterFreq      0.235296
		craterDensity   0.864577
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.529119
		volcanoTemp     1797.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.216, 0.176, 0.161, 0.000)
		colorShelf     (0.229, 0.187, 0.171, 0.000)
		colorBeach     (0.243, 0.198, 0.181, 0.000)
		colorDesert    (0.256, 0.209, 0.192, 0.000)
		colorLowland   (0.270, 0.220, 0.202, 0.000)
		colorUpland    (0.283, 0.231, 0.212, 0.000)
		colorRock      (0.297, 0.242, 0.222, 0.000)
		colorSnow      (0.310, 0.252, 0.232, 1.000)
		BumpHeight      0.0446758
		BumpOffset      0.00893516
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.281181
		Period          0.140221
		Eccentricity    0.0919311
		Inclination     1.27289
		AscendingNode   -49.9559
		ArgOfPericenter -87.7127
		MeanAnomaly     147.566
	}
}

Asteroid	"Domir S43"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            5.82131e-013
	Radius          0.642497
	InertiaMoment   0.398253

	RotationPeriod  3493.39
	Obliquity       5.45031
	EqAscendNode    -29.3879

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.480 0.472 0.470)

	Surface
	{
		SurfStyle       0.99241
		OceanStyle      0.900487
		Randomize      (0.527, 0.857, -0.032)
		colorDistMagn   0.658147
		colorDistFreq   0.000162567
		detailScale     17.5444
		colorConversion true
		snowLevel       2
		tropicLatitude  0.182975
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.542413
		terraceProb     0.425871
		erosion         0
		montesMagn      0.693378
		montesFreq      3.17606
		montesSpiky     0.986224
		montesFraction  0.772853
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000741476
		hillsFraction   0.594652
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220928
		craterFreq      0.186977
		craterDensity   0.884341
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.508776
		volcanoTemp     1601.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.163, 0.165, 0.188, 0.050)
		colorShelf     (0.192, 0.194, 0.216, 0.040)
		colorBeach     (0.221, 0.222, 0.244, 0.030)
		colorDesert    (0.249, 0.250, 0.277, 0.020)
		colorLowland   (0.278, 0.279, 0.305, 0.030)
		colorUpland    (0.307, 0.307, 0.333, 0.050)
		colorRock      (0.336, 0.335, 0.371, 0.020)
		colorSnow      (0.336, 0.335, 0.371, 1.000)
		BumpHeight      0.578247
		BumpOffset      0.115649
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.192946
		Period          0.079705
		Eccentricity    0.157978
		Inclination     5.45031
		AscendingNode   -29.3879
		ArgOfPericenter -140.114
		MeanAnomaly     2.8755
	}
}

Asteroid	"Domir S44"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            8.56637e-010
	Radius          5.71739
	InertiaMoment   0.399334

	RotationPeriod  4540.77
	Obliquity       -0.0637548
	EqAscendNode    -63.9156

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.633 0.631 0.626)

	Surface
	{
		SurfStyle       0.802342
		OceanStyle      0.180985
		Randomize      (0.390, 0.298, -0.811)
		colorDistMagn   0.201861
		colorDistFreq   0.0112454
		detailScale     156.123
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0018911
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.485875
		terraceProb     0.44469
		erosion         0
		montesMagn      0.596828
		montesFreq      2.01026
		montesSpiky     0.955096
		montesFraction  0.369442
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0642348
		hillsFraction   0.805943
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229933
		craterFreq      0.225595
		craterDensity   0.766492
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.498657
		volcanoTemp     1499.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.247, 0.214, 0.175, 0.000)
		colorShelf     (0.253, 0.221, 0.200, 0.000)
		colorBeach     (0.298, 0.259, 0.238, 0.000)
		colorDesert    (0.323, 0.278, 0.232, 0.000)
		colorLowland   (0.355, 0.296, 0.263, 0.000)
		colorUpland    (0.393, 0.360, 0.319, 0.000)
		colorRock      (0.424, 0.391, 0.344, 0.000)
		colorSnow      (0.462, 0.416, 0.363, 1.000)
		BumpHeight      5.14566
		BumpOffset      1.02913
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.229804
		Period          0.103602
		Eccentricity    0.159125
		Inclination     -0.0637548
		AscendingNode   -63.9156
		ArgOfPericenter 82.0162
		MeanAnomaly     -48.7631
	}
}

Asteroid	"Domir S45"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            5.01849e-018
	Radius          0.0115773
	InertiaMoment   0.396669

	Obliquity       2.33068
	EqAscendNode    -37.6237
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.448 0.442 0.438)

	Surface
	{
		SurfStyle       0.416619
		OceanStyle      0.0561454
		Randomize      (0.811, 0.565, 0.194)
		colorDistMagn   0.879524
		colorDistFreq   1.04878e-007
		detailScale     0.316137
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0769321
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.423823
		terraceProb     0.308136
		erosion         0
		montesMagn      0.440738
		montesFreq      1.45356
		montesSpiky     0.933154
		montesFraction  0.456145
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.11419e-007
		hillsFraction   0.634631
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240358
		craterFreq      0.18941
		craterDensity   0.673138
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.455947
		volcanoTemp     1282.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.179, 0.177, 0.175, 0.000)
		colorShelf     (0.190, 0.188, 0.186, 0.000)
		colorBeach     (0.201, 0.199, 0.197, 0.000)
		colorDesert    (0.213, 0.210, 0.208, 0.000)
		colorLowland   (0.224, 0.221, 0.219, 0.000)
		colorUpland    (0.235, 0.232, 0.230, 0.000)
		colorRock      (0.246, 0.243, 0.241, 0.000)
		colorSnow      (0.257, 0.254, 0.252, 1.000)
		BumpHeight      0.0104195
		BumpOffset      0.00208391
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.168826
		Period          0.0652368
		Eccentricity    0.0376815
		Inclination     2.33068
		AscendingNode   -37.6237
		ArgOfPericenter 23.8229
		MeanAnomaly     -46.3655
	}
}

Asteroid	"Domir S46"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            7.38498e-015
	Radius          0.149847
	InertiaMoment   0.398498

	Obliquity       4.00374
	EqAscendNode    90.0146
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.515 0.435 0.337)

	Surface
	{
		SurfStyle       0.815452
		OceanStyle      0.812701
		Randomize      (0.769, 0.834, 0.353)
		colorDistMagn   0.850964
		colorDistFreq   1.30572e-005
		detailScale     4.09181
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0986097
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.479611
		terraceProb     0.45662
		erosion         0
		montesMagn      0.449959
		montesFreq      2.50561
		montesSpiky     0.860332
		montesFraction  0.629417
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.37564e-005
		hillsFraction   0.671888
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225655
		craterFreq      0.217491
		craterDensity   0.652236
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.550728
		volcanoTemp     1358.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.201, 0.148, 0.094, 0.000)
		colorShelf     (0.206, 0.152, 0.108, 0.000)
		colorBeach     (0.242, 0.178, 0.128, 0.000)
		colorDesert    (0.263, 0.191, 0.125, 0.000)
		colorLowland   (0.288, 0.204, 0.142, 0.000)
		colorUpland    (0.319, 0.248, 0.172, 0.000)
		colorRock      (0.345, 0.270, 0.186, 0.000)
		colorSnow      (0.376, 0.287, 0.196, 1.000)
		BumpHeight      0.134862
		BumpOffset      0.0269724
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.241294
		Period          0.111468
		Eccentricity    0.0783488
		Inclination     4.00374
		AscendingNode   90.0146
		ArgOfPericenter -81.412
		MeanAnomaly     144.316
	}
}




Asteroid	"Domir S48"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            1.59919e-008
	Radius          17.0353
	InertiaMoment   0.39723

	Obliquity       0.122948
	EqAscendNode    -153.441
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.553 0.550 0.543)

	Surface
	{
		SurfStyle       0.444915
		OceanStyle      0.768065
		Randomize      (-0.075, 0.868, 0.934)
		colorDistMagn   0.539447
		colorDistFreq   0.254369
		detailScale     465.177
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000976562
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.456301
		terraceProb     0.460634
		erosion         0
		montesMagn      0.451323
		montesFreq      3.72577
		montesSpiky     0.970093
		montesFraction  0.472189
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.854303
		hillsFraction   0.930867
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263735
		craterFreq      0.275692
		craterDensity   0.840279
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.563456
		volcanoTemp     1297.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.221, 0.220, 0.217, 0.000)
		colorShelf     (0.235, 0.234, 0.231, 0.000)
		colorBeach     (0.249, 0.247, 0.244, 0.000)
		colorDesert    (0.263, 0.261, 0.258, 0.000)
		colorLowland   (0.277, 0.275, 0.271, 0.000)
		colorUpland    (0.291, 0.289, 0.285, 0.000)
		colorRock      (0.304, 0.302, 0.299, 0.000)
		colorSnow      (0.318, 0.316, 0.312, 1.000)
		BumpHeight      15.3317
		BumpOffset      3.06635
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.33654
		Period          0.183606
		Eccentricity    0.0153953
		Inclination     0.122948
		AscendingNode   -153.441
		ArgOfPericenter -116.513
		MeanAnomaly     -87.6221
	}
}



Asteroid	"Domir S50"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            1.37865e-013
	Radius          0.311
	InertiaMoment   0.399697

	RotationPeriod  8206.57
	Obliquity       0.449753
	EqAscendNode    51.8257

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.678 0.583 0.551)

	Surface
	{
		SurfStyle       0.705107
		OceanStyle      0.206948
		Randomize      (-0.304, 0.221, -0.386)
		colorDistMagn   0.304043
		colorDistFreq   6.28402e-005
		detailScale     8.49236
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0141219
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.433068
		terraceProb     0.250538
		erosion         0
		montesMagn      0.684167
		montesFreq      3.10808
		montesSpiky     0.943366
		montesFraction  0.3402
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000217771
		hillsFraction   0.682191
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254034
		craterFreq      0.245916
		craterDensity   1.02262
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.473198
		volcanoTemp     1478.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.265, 0.198, 0.154, 0.000)
		colorShelf     (0.271, 0.204, 0.176, 0.000)
		colorBeach     (0.319, 0.239, 0.209, 0.000)
		colorDesert    (0.346, 0.256, 0.204, 0.000)
		colorLowland   (0.380, 0.274, 0.231, 0.000)
		colorUpland    (0.421, 0.332, 0.281, 0.000)
		colorRock      (0.454, 0.361, 0.303, 0.000)
		colorSnow      (0.495, 0.385, 0.320, 1.000)
		BumpHeight      0.2799
		BumpOffset      0.0559799
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.301942
		Period          0.156034
		Eccentricity    0.0754488
		Inclination     0.449753
		AscendingNode   51.8257
		ArgOfPericenter 114.846
		MeanAnomaly     -112.527
	}
}

Asteroid	"Domir S51"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            2.02875e-010
	Radius          3.97331
	InertiaMoment   0.397632

	Obliquity       -3.79394
	EqAscendNode    -95.005
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.768 0.766 0.762)

	Surface
	{
		SurfStyle       0.99176
		OceanStyle      0.348742
		Randomize      (-0.923, 0.962, 0.932)
		colorDistMagn   0.612338
		colorDistFreq   0.00282129
		detailScale     108.498
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0893121
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.726983
		terraceProb     0.287971
		erosion         0
		montesMagn      0.343252
		montesFreq      3.32382
		montesSpiky     0.938822
		montesFraction  0.854109
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0534563
		hillsFraction   0.647132
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233414
		craterFreq      0.22239
		craterDensity   0.960189
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.453588
		volcanoTemp     1437.14
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.261, 0.268, 0.305, 0.050)
		colorShelf     (0.307, 0.314, 0.350, 0.040)
		colorBeach     (0.353, 0.360, 0.396, 0.030)
		colorDesert    (0.399, 0.406, 0.449, 0.020)
		colorLowland   (0.445, 0.452, 0.495, 0.030)
		colorUpland    (0.492, 0.498, 0.541, 0.050)
		colorRock      (0.538, 0.544, 0.602, 0.020)
		colorSnow      (0.538, 0.544, 0.602, 1.000)
		BumpHeight      3.57598
		BumpOffset      0.715195
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.209855
		Period          0.0904092
		Eccentricity    0.0084527
		Inclination     -3.79394
		AscendingNode   -95.005
		ArgOfPericenter -148.799
		MeanAnomaly     -99.6273
	}
}

Asteroid	"Domir S52"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            2.98541e-007
	Radius          51.4157
	InertiaMoment   0.398931

	RotationPeriod  5288.46
	Obliquity       1.34449
	EqAscendNode    -6.32893

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.647 0.645 0.642)

	Surface
	{
		SurfStyle       0.785312
		OceanStyle      0.074159
		Randomize      (0.878, -0.635, -0.276)
		colorDistMagn   0.86298
		colorDistFreq   1.14369
		detailScale     1403.99
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0468431
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.691025
		terraceProb     0.211916
		erosion         0
		montesMagn      0.468668
		montesFreq      3.14963
		montesSpiky     0.821026
		montesFraction  0.761622
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.69661
		hillsFraction   0.592618
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238751
		craterFreq      0.233541
		craterDensity   0.895573
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.525017
		volcanoTemp     1386.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.252, 0.219, 0.180, 0.000)
		colorShelf     (0.259, 0.226, 0.206, 0.000)
		colorBeach     (0.304, 0.264, 0.244, 0.000)
		colorDesert    (0.330, 0.284, 0.238, 0.000)
		colorLowland   (0.362, 0.303, 0.270, 0.000)
		colorUpland    (0.401, 0.368, 0.328, 0.000)
		colorRock      (0.433, 0.400, 0.353, 0.000)
		colorSnow      (0.472, 0.426, 0.373, 1.000)
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
		SemiMajorAxis   0.357593
		Period          0.201102
		Eccentricity    0.1794
		Inclination     1.34449
		AscendingNode   -6.32893
		ArgOfPericenter -16.8157
		MeanAnomaly     -112.713
	}
}

Asteroid	"Domir S53"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            1.74896e-015
	Radius          0.0725331
	InertiaMoment   0.399874

	RotationPeriod  2914.33
	Obliquity       -2.88946
	EqAscendNode    165.503

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.687 0.682 0.677)

	Surface
	{
		SurfStyle       0.325563
		OceanStyle      0.580245
		Randomize      (-0.843, -0.743, -0.354)
		colorDistMagn   0.332907
		colorDistFreq   2.86033e-006
		detailScale     1.98064
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0127185
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.549726
		terraceProb     0.276068
		erosion         0
		montesMagn      0.624009
		montesFreq      2.59767
		montesSpiky     0.764479
		montesFraction  0.362022
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.06593e-005
		hillsFraction   0.737363
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.26639
		craterFreq      0.224618
		craterDensity   0.977254
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.537231
		volcanoTemp     1512.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.275, 0.273, 0.271, 0.000)
		colorShelf     (0.292, 0.290, 0.288, 0.000)
		colorBeach     (0.309, 0.307, 0.305, 0.000)
		colorDesert    (0.326, 0.324, 0.322, 0.000)
		colorLowland   (0.343, 0.341, 0.339, 0.000)
		colorUpland    (0.360, 0.358, 0.355, 0.000)
		colorRock      (0.378, 0.375, 0.372, 0.000)
		colorSnow      (0.395, 0.392, 0.389, 1.000)
		BumpHeight      0.0652798
		BumpOffset      0.013056
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.24036
		Period          0.110822
		Eccentricity    0.135104
		Inclination     -2.88946
		AscendingNode   165.503
		ArgOfPericenter -60.9821
		MeanAnomaly     99.1521
	}
}

Asteroid	"Domir S54"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            2.5737e-012
	Radius          0.926687
	InertiaMoment   0.397955

	RotationPeriod  2931.92
	Obliquity       2.90169
	EqAscendNode    -30.8864

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.413 0.409 0.405)

	Surface
	{
		SurfStyle       0.321797
		OceanStyle      0.651048
		Randomize      (0.367, -0.214, -0.999)
		colorDistMagn   0.931694
		colorDistFreq   0.000536873
		detailScale     25.3047
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0974728
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.558913
		terraceProb     0.572309
		erosion         0
		montesMagn      0.630303
		montesFreq      3.26922
		montesSpiky     0.757929
		montesFraction  0.346649
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0012383
		hillsFraction   0.677326
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22461
		craterFreq      0.278567
		craterDensity   1.03439
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.507507
		volcanoTemp     1678.82
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.165, 0.164, 0.162, 0.000)
		colorShelf     (0.176, 0.174, 0.172, 0.000)
		colorBeach     (0.186, 0.184, 0.182, 0.000)
		colorDesert    (0.196, 0.194, 0.192, 0.000)
		colorLowland   (0.207, 0.205, 0.203, 0.000)
		colorUpland    (0.217, 0.215, 0.213, 0.000)
		colorRock      (0.227, 0.225, 0.223, 0.000)
		colorSnow      (0.238, 0.235, 0.233, 1.000)
		BumpHeight      0.834018
		BumpOffset      0.166804
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.19921
		Period          0.083618
		Eccentricity    0.184456
		Inclination     2.90169
		AscendingNode   -30.8864
		ArgOfPericenter -115.47
		MeanAnomaly     54.5166
	}
}

Asteroid	"Domir S55"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            3.78733e-009
	Radius          11.9938
	InertiaMoment   0.399129

	Obliquity       -2.6563
	EqAscendNode    14.41
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.465 0.461 0.458)

	Surface
	{
		SurfStyle       0.984258
		OceanStyle      0.67319
		Randomize      (-0.323, 0.526, 0.248)
		colorDistMagn   0.982699
		colorDistFreq   0.0842816
		detailScale     327.511
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0918599
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.744162
		terraceProb     0.289626
		erosion         0
		montesMagn      0.414393
		montesFreq      2.77564
		montesSpiky     0.925016
		montesFraction  0.544971
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.264941
		hillsFraction   0.51385
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233765
		craterFreq      0.23753
		craterDensity   0.820028
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.449458
		volcanoTemp     1692.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.158, 0.161, 0.183, 0.050)
		colorShelf     (0.186, 0.189, 0.211, 0.040)
		colorBeach     (0.214, 0.217, 0.238, 0.030)
		colorDesert    (0.242, 0.244, 0.270, 0.020)
		colorLowland   (0.270, 0.272, 0.298, 0.030)
		colorUpland    (0.298, 0.300, 0.325, 0.050)
		colorRock      (0.326, 0.327, 0.362, 0.020)
		colorSnow      (0.326, 0.327, 0.362, 1.000)
		BumpHeight      10.7944
		BumpOffset      2.15889
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.280386
		Period          0.139627
		Eccentricity    0.13258
		Inclination     -2.6563
		AscendingNode   14.41
		ArgOfPericenter -177.503
		MeanAnomaly     65.4172
	}
}


Asteroid	"Domir S57"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            3.26502e-014
	Radius          0.216128
	InertiaMoment   0.398233

	RotationPeriod  1850.93
	Obliquity       3.64992
	EqAscendNode    47.8568

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.639 0.633 0.630)

	Surface
	{
		SurfStyle       0.406802
		OceanStyle      0.934409
		Randomize      (0.292, -0.156, 0.221)
		colorDistMagn   0.266215
		colorDistFreq   2.93648e-005
		detailScale     5.90173
		colorConversion true
		snowLevel       2
		tropicLatitude  0.11618
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.337454
		terraceProb     0.255607
		erosion         0
		montesMagn      0.568477
		montesFreq      3.02978
		montesSpiky     0.916449
		montesFraction  0.581484
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.37698e-005
		hillsFraction   0.827872
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246762
		craterFreq      0.231694
		craterDensity   0.792012
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.561701
		volcanoTemp     1837.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.256, 0.253, 0.252, 0.000)
		colorShelf     (0.272, 0.269, 0.268, 0.000)
		colorBeach     (0.288, 0.285, 0.284, 0.000)
		colorDesert    (0.304, 0.301, 0.299, 0.000)
		colorLowland   (0.320, 0.317, 0.315, 0.000)
		colorUpland    (0.336, 0.332, 0.331, 0.000)
		colorRock      (0.352, 0.348, 0.347, 0.000)
		colorSnow      (0.368, 0.364, 0.362, 1.000)
		BumpHeight      0.194515
		BumpOffset      0.038903
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.232714
		Period          0.105577
		Eccentricity    0.0511802
		Inclination     3.64992
		AscendingNode   47.8568
		ArgOfPericenter -155.896
		MeanAnomaly     177.424
	}
}

Asteroid	"Domir S58"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            4.80465e-011
	Radius          2.79736
	InertiaMoment   0.399319

	Obliquity       -4.36257
	EqAscendNode    -58.6901
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.611 0.606 0.600)

	Surface
	{
		SurfStyle       0.807615
		OceanStyle      0.988679
		Randomize      (-0.963, 0.523, -0.317)
		colorDistMagn   0.901374
		colorDistFreq   0.00206349
		detailScale     76.3866
		colorConversion true
		snowLevel       2
		tropicLatitude  0.132322
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.380933
		terraceProb     0.110645
		erosion         0
		montesMagn      0.457103
		montesFreq      3.95785
		montesSpiky     0.828738
		montesFraction  0.535183
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0193483
		hillsFraction   0.608834
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226449
		craterFreq      0.16062
		craterDensity   0.795648
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.512937
		volcanoTemp     1584.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.238, 0.206, 0.168, 0.000)
		colorShelf     (0.244, 0.212, 0.192, 0.000)
		colorBeach     (0.287, 0.248, 0.228, 0.000)
		colorDesert    (0.311, 0.266, 0.222, 0.000)
		colorLowland   (0.342, 0.285, 0.252, 0.000)
		colorUpland    (0.379, 0.345, 0.306, 0.000)
		colorRock      (0.409, 0.376, 0.330, 0.000)
		colorSnow      (0.446, 0.400, 0.348, 1.000)
		BumpHeight      2.51762
		BumpOffset      0.503525
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.298908
		Period          0.153688
		Eccentricity    0.0318137
		Inclination     -4.36257
		AscendingNode   -58.6901
		ArgOfPericenter -7.50493
		MeanAnomaly     -44.9413
	}
}

Asteroid	"Domir S59"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            7.07029e-008
	Radius          24.8903
	InertiaMoment   0.396613

	RotationPeriod  1715.49
	Obliquity       -1.46123
	EqAscendNode    35.0744

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.642 0.592 0.505)

	Surface
	{
		SurfStyle       0.483835
		OceanStyle      0.199708
		Randomize      (0.726, 0.581, -0.993)
		colorDistMagn   0.237524
		colorDistFreq   0.263688
		detailScale     679.671
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0486168
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.411797
		terraceProb     0.397309
		erosion         0
		montesMagn      0.394041
		montesFreq      2.9595
		montesSpiky     0.71347
		montesFraction  0.755741
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.68937
		hillsFraction   0.858894
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242341
		craterFreq      0.255645
		craterDensity   0.741513
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.468845
		volcanoTemp     1495.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.257, 0.237, 0.202, 0.000)
		colorShelf     (0.273, 0.252, 0.215, 0.000)
		colorBeach     (0.289, 0.266, 0.227, 0.000)
		colorDesert    (0.305, 0.281, 0.240, 0.000)
		colorLowland   (0.321, 0.296, 0.252, 0.000)
		colorUpland    (0.337, 0.311, 0.265, 0.000)
		colorRock      (0.353, 0.326, 0.278, 0.000)
		colorSnow      (0.369, 0.341, 0.290, 1.000)
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
		SemiMajorAxis   0.289879
		Period          0.146777
		Eccentricity    0.0961717
		Inclination     -1.46123
		AscendingNode   35.0744
		ArgOfPericenter -81.9213
		MeanAnomaly     -81.3928
	}
}

Asteroid	"Domir S60"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            4.14202e-016
	Radius          0.0504064
	InertiaMoment   0.39848

	RotationPeriod  1230.2
	Obliquity       -5.78087
	EqAscendNode    -7.05346

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.693 0.690 0.684)

	Surface
	{
		SurfStyle       0.436666
		OceanStyle      0.06926
		Randomize      (0.539, -0.991, 0.067)
		colorDistMagn   0.530305
		colorDistFreq   7.25077e-007
		detailScale     1.37643
		colorConversion true
		snowLevel       2
		tropicLatitude  0.200048
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.438474
		terraceProb     0.450479
		erosion         0
		montesMagn      0.323504
		montesFreq      2.92365
		montesSpiky     0.962349
		montesFraction  0.72984
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.43092e-006
		hillsFraction   0.378078
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240483
		craterFreq      0.159616
		craterDensity   0.981825
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.512171
		volcanoTemp     1662.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.277, 0.276, 0.274, 0.000)
		colorShelf     (0.295, 0.293, 0.291, 0.000)
		colorBeach     (0.312, 0.311, 0.308, 0.000)
		colorDesert    (0.329, 0.328, 0.325, 0.000)
		colorLowland   (0.347, 0.345, 0.342, 0.000)
		colorUpland    (0.364, 0.362, 0.359, 0.000)
		colorRock      (0.381, 0.380, 0.376, 0.000)
		colorSnow      (0.399, 0.397, 0.394, 1.000)
		BumpHeight      0.0453658
		BumpOffset      0.00907315
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.20014
		Period          0.0842044
		Eccentricity    0.188246
		Inclination     -5.78087
		AscendingNode   -7.05346
		ArgOfPericenter 57.2751
		MeanAnomaly     44.298
	}
}

Asteroid	"Domir S61"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            6.09521e-013
	Radius          0.652419
	InertiaMoment   0.399503

	Obliquity       -3.75848
	EqAscendNode    146.863
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.692 0.688 0.687)

	Surface
	{
		SurfStyle       0.148882
		OceanStyle      0.155259
		Randomize      (0.732, 0.182, 0.220)
		colorDistMagn   0.843572
		colorDistFreq   0.00022381
		detailScale     17.8154
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0373781
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.714918
		terraceProb     0.247516
		erosion         0
		montesMagn      0.622834
		montesFreq      3.15316
		montesSpiky     0.911306
		montesFraction  0.337678
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000805514
		hillsFraction   0.631401
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263695
		craterFreq      0.247377
		craterDensity   1.01007
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.475626
		volcanoTemp     1557.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.277, 0.275, 0.275, 0.000)
		colorShelf     (0.294, 0.293, 0.292, 0.000)
		colorBeach     (0.311, 0.310, 0.309, 0.000)
		colorDesert    (0.329, 0.327, 0.326, 0.000)
		colorLowland   (0.346, 0.344, 0.343, 0.000)
		colorUpland    (0.363, 0.361, 0.360, 0.000)
		colorRock      (0.380, 0.379, 0.378, 0.000)
		colorSnow      (0.398, 0.396, 0.395, 1.000)
		BumpHeight      0.587177
		BumpOffset      0.117435
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.388798
		Period          0.227992
		Eccentricity    0.134365
		Inclination     -3.75848
		AscendingNode   146.863
		ArgOfPericenter 167.928
		MeanAnomaly     110.285
	}
}

Asteroid	"Domir S62"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            8.96943e-010
	Radius          5.80569
	InertiaMoment   0.397194

	Obliquity       -0.741354
	EqAscendNode    -8.0404
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.780 0.777 0.776)

	Surface
	{
		SurfStyle       0.793488
		OceanStyle      0.111731
		Randomize      (-0.539, 0.994, 0.349)
		colorDistMagn   0.0766075
		colorDistFreq   0.0128696
		detailScale     158.534
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0258122
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.458272
		terraceProb     0.258847
		erosion         0
		montesMagn      0.546522
		montesFreq      2.88125
		montesSpiky     0.934004
		montesFraction  0.820835
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.086742
		hillsFraction   0.562085
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.26084
		craterFreq      0.24849
		craterDensity   0.936313
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.494685
		volcanoTemp     1864.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.304, 0.264, 0.217, 0.000)
		colorShelf     (0.312, 0.272, 0.248, 0.000)
		colorBeach     (0.366, 0.319, 0.295, 0.000)
		colorDesert    (0.398, 0.342, 0.287, 0.000)
		colorLowland   (0.437, 0.365, 0.326, 0.000)
		colorUpland    (0.483, 0.443, 0.396, 0.000)
		colorRock      (0.522, 0.482, 0.427, 0.000)
		colorSnow      (0.569, 0.513, 0.450, 1.000)
		BumpHeight      5.22512
		BumpOffset      1.04502
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.297129
		Period          0.152317
		Eccentricity    0.06028
		Inclination     -0.741354
		AscendingNode   -8.0404
		ArgOfPericenter -1.39116
		MeanAnomaly     -20.8981
	}
}

Asteroid	"Domir S63"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            5.25462e-018
	Radius          0.0117561
	InertiaMoment   0.398705

	RotationPeriod  582.246
	Obliquity       -3.39292
	EqAscendNode    69.7376

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.614 0.501 0.347)

	Surface
	{
		SurfStyle       0.250885
		OceanStyle      0.308418
		Randomize      (0.768, 0.311, 0.130)
		colorDistMagn   0.434769
		colorDistFreq   6.24552e-008
		detailScale     0.321019
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0970006
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.692889
		terraceProb     0.188199
		erosion         0
		montesMagn      0.682025
		montesFreq      3.30136
		montesSpiky     0.868756
		montesFraction  0.323928
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.37015e-007
		hillsFraction   0.786225
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221567
		craterFreq      0.260117
		craterDensity   0.99146
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.629658
		volcanoTemp     1428.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.246, 0.200, 0.139, 0.000)
		colorShelf     (0.261, 0.213, 0.147, 0.000)
		colorBeach     (0.276, 0.226, 0.156, 0.000)
		colorDesert    (0.292, 0.238, 0.165, 0.000)
		colorLowland   (0.307, 0.251, 0.173, 0.000)
		colorUpland    (0.322, 0.263, 0.182, 0.000)
		colorRock      (0.338, 0.276, 0.191, 0.000)
		colorSnow      (0.353, 0.288, 0.199, 1.000)
		BumpHeight      0.0105805
		BumpOffset      0.00211609
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.223897
		Period          0.0996337
		Eccentricity    0.0864083
		Inclination     -3.39292
		AscendingNode   69.7376
		ArgOfPericenter -26.3783
		MeanAnomaly     2.14563
	}
}

Asteroid	"Domir S64"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            7.73246e-015
	Radius          0.152161
	InertiaMoment   0.399683

	Obliquity       2.33159
	EqAscendNode    91.1349
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.558 0.553 0.547)

	Surface
	{
		SurfStyle       0.521214
		OceanStyle      0.59302
		Randomize      (-0.934, -0.077, -0.688)
		colorDistMagn   0.746992
		colorDistFreq   1.20171e-005
		detailScale     4.15502
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0569386
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.689089
		terraceProb     0.131019
		erosion         0
		montesMagn      0.596401
		montesFreq      3.49233
		montesSpiky     0.999083
		montesFraction  0.196717
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.15197e-005
		hillsFraction   0.527676
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229896
		craterFreq      0.195861
		craterDensity   0.966903
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.47539
		volcanoTemp     1401.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.218, 0.188, 0.153, 0.000)
		colorShelf     (0.223, 0.194, 0.175, 0.000)
		colorBeach     (0.262, 0.227, 0.208, 0.000)
		colorDesert    (0.285, 0.243, 0.202, 0.000)
		colorLowland   (0.313, 0.260, 0.230, 0.000)
		colorUpland    (0.346, 0.315, 0.279, 0.000)
		colorRock      (0.374, 0.343, 0.301, 0.000)
		colorSnow      (0.408, 0.365, 0.317, 1.000)
		BumpHeight      0.136945
		BumpOffset      0.027389
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.19197
		Period          0.0791009
		Eccentricity    0.0520369
		Inclination     2.33159
		AscendingNode   91.1349
		ArgOfPericenter 147.834
		MeanAnomaly     -145.143
	}
}

Asteroid	"Domir S65"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            1.13787e-011
	Radius          1.35406
	InertiaMoment   0.397604

	RotationPeriod  1793.31
	Obliquity       6.27462
	EqAscendNode    147.097

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.610 0.604 0.599)

	Surface
	{
		SurfStyle       0.796071
		OceanStyle      0.939638
		Randomize      (-0.341, -0.278, 0.611)
		colorDistMagn   0.966354
		colorDistFreq   0.00111335
		detailScale     36.975
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0618753
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.554416
		terraceProb     0.116341
		erosion         0
		montesMagn      0.52235
		montesFreq      2.69789
		montesSpiky     0.907325
		montesFraction  0.563373
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00521285
		hillsFraction   0.642413
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236764
		craterFreq      0.200517
		craterDensity   0.723748
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.530756
		volcanoTemp     1515.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.238, 0.205, 0.168, 0.000)
		colorShelf     (0.244, 0.211, 0.192, 0.000)
		colorBeach     (0.287, 0.248, 0.228, 0.000)
		colorDesert    (0.311, 0.266, 0.222, 0.000)
		colorLowland   (0.341, 0.284, 0.252, 0.000)
		colorUpland    (0.378, 0.344, 0.306, 0.000)
		colorRock      (0.409, 0.374, 0.330, 0.000)
		colorSnow      (0.445, 0.398, 0.348, 1.000)
		BumpHeight      1.21866
		BumpOffset      0.243731
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.298581
		Period          0.153435
		Eccentricity    0.176882
		Inclination     6.27462
		AscendingNode   147.097
		ArgOfPericenter -73.1527
		MeanAnomaly     -29.7891
	}
}

Asteroid	"Domir S66"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            1.67444e-008
	Radius          17.2984
	InertiaMoment   0.398915

	Obliquity       -0.898355
	EqAscendNode    -114.641
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.630 0.578 0.531)

	Surface
	{
		SurfStyle       0.665843
		OceanStyle      0.520658
		Randomize      (-0.808, 0.643, -0.972)
		colorDistMagn   0.438864
		colorDistFreq   0.14116
		detailScale     472.361
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0169316
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.610823
		terraceProb     0.279385
		erosion         0
		montesMagn      0.573485
		montesFreq      2.52955
		montesSpiky     0.94676
		montesFraction  0.881834
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.601076
		hillsFraction   0.366239
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.211286
		craterFreq      0.219292
		craterDensity   1.02365
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.520472
		volcanoTemp     1864.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.246, 0.197, 0.149, 0.000)
		colorShelf     (0.252, 0.202, 0.170, 0.000)
		colorBeach     (0.296, 0.237, 0.202, 0.000)
		colorDesert    (0.321, 0.254, 0.197, 0.000)
		colorLowland   (0.353, 0.272, 0.223, 0.000)
		colorUpland    (0.390, 0.330, 0.271, 0.000)
		colorRock      (0.422, 0.359, 0.292, 0.000)
		colorSnow      (0.460, 0.382, 0.308, 1.000)
		BumpHeight      15.5685
		BumpOffset      3.11371
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.334966
		Period          0.18232
		Eccentricity    0.0534019
		Inclination     -0.898355
		AscendingNode   -114.641
		ArgOfPericenter 160.47
		MeanAnomaly     -81.6925
	}
}

Asteroid	"Domir S67"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            9.80948e-017
	Radius          0.0354879
	InertiaMoment   0.399861

	Obliquity       0.175366
	EqAscendNode    6.94965
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.712 0.707 0.705)

	Surface
	{
		SurfStyle       0.378617
		OceanStyle      0.375935
		Randomize      (-0.005, -0.455, 0.904)
		colorDistMagn   0.0582659
		colorDistFreq   6.01802e-007
		detailScale     0.969055
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00610837
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.606464
		terraceProb     0.411023
		erosion         0
		montesMagn      0.520784
		montesFreq      2.663
		montesSpiky     0.920585
		montesFraction  0.768623
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.66852e-006
		hillsFraction   0.671375
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252352
		craterFreq      0.188355
		craterDensity   1.07548
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.620362
		volcanoTemp     1396.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.285, 0.283, 0.282, 0.000)
		colorShelf     (0.303, 0.301, 0.300, 0.000)
		colorBeach     (0.320, 0.318, 0.317, 0.000)
		colorDesert    (0.338, 0.336, 0.335, 0.000)
		colorLowland   (0.356, 0.354, 0.353, 0.000)
		colorUpland    (0.374, 0.371, 0.370, 0.000)
		colorRock      (0.392, 0.389, 0.388, 0.000)
		colorSnow      (0.410, 0.407, 0.405, 1.000)
		BumpHeight      0.0319391
		BumpOffset      0.00638782
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.316821
		Period          0.167708
		Eccentricity    0.0909667
		Inclination     0.175366
		AscendingNode   6.94965
		ArgOfPericenter 71.0226
		MeanAnomaly     41.0519
	}
}

Asteroid	"Domir S68"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            1.44352e-013
	Radius          0.40365
	InertiaMoment   0.397932

	Obliquity       2.51624
	EqAscendNode    32.3806
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.492 0.488 0.480)

	Surface
	{
		SurfStyle       0.325498
		OceanStyle      0.864311
		Randomize      (-0.902, -0.996, -0.472)
		colorDistMagn   0.8205
		colorDistFreq   9.4557e-005
		detailScale     11.0223
		colorConversion true
		snowLevel       2
		tropicLatitude  0.084248
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.424247
		terraceProb     0.158625
		erosion         0
		montesMagn      0.579505
		montesFreq      2.18106
		montesSpiky     0.83595
		montesFraction  0.575524
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000386986
		hillsFraction   0.657909
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229257
		craterFreq      0.222608
		craterDensity   0.88358
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.508741
		volcanoTemp     1425.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.197, 0.195, 0.192, 0.000)
		colorShelf     (0.209, 0.207, 0.204, 0.000)
		colorBeach     (0.222, 0.220, 0.216, 0.000)
		colorDesert    (0.234, 0.232, 0.228, 0.000)
		colorLowland   (0.246, 0.244, 0.240, 0.000)
		colorUpland    (0.259, 0.256, 0.252, 0.000)
		colorRock      (0.271, 0.269, 0.264, 0.000)
		colorSnow      (0.283, 0.281, 0.276, 1.000)
		BumpHeight      0.363285
		BumpOffset      0.072657
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.236267
		Period          0.108004
		Eccentricity    0.0603961
		Inclination     2.51624
		AscendingNode   32.3806
		ArgOfPericenter -90.1352
		MeanAnomaly     65.9774
	}
}

Asteroid	"Domir S69"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            2.12421e-010
	Radius          3.592
	InertiaMoment   0.399114

	Obliquity       -0.525826
	EqAscendNode    -143.93
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.695 0.692 0.690)

	Surface
	{
		SurfStyle       0.546331
		OceanStyle      0.474199
		Randomize      (0.345, -0.217, -0.275)
		colorDistMagn   0.15264
		colorDistFreq   0.00659777
		detailScale     98.0855
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00568379
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.340832
		terraceProb     0.127898
		erosion         0
		montesMagn      0.593233
		montesFreq      2.84786
		montesSpiky     0.937749
		montesFraction  0.618929
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0293577
		hillsFraction   0.487341
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263322
		craterFreq      0.146743
		craterDensity   0.796363
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.565926
		volcanoTemp     1603.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.271, 0.235, 0.193, 0.000)
		colorShelf     (0.278, 0.242, 0.221, 0.000)
		colorBeach     (0.327, 0.284, 0.262, 0.000)
		colorDesert    (0.355, 0.305, 0.255, 0.000)
		colorLowland   (0.389, 0.325, 0.290, 0.000)
		colorUpland    (0.431, 0.395, 0.352, 0.000)
		colorRock      (0.466, 0.429, 0.379, 0.000)
		colorSnow      (0.508, 0.457, 0.400, 1.000)
		BumpHeight      3.2328
		BumpOffset      0.64656
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.252766
		Period          0.119512
		Eccentricity    0.0430439
		Inclination     -0.525826
		AscendingNode   -143.93
		ArgOfPericenter 112.022
		MeanAnomaly     -95.1646
	}
}

Asteroid	"Domir S70"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            3.12589e-007
	Radius          45.8811
	InertiaMoment   0.395118

	RotationPeriod  1226.43
	Obliquity       1.91003
	EqAscendNode    -124.11

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.597 0.508 0.458)

	Surface
	{
		SurfStyle       0.224865
		OceanStyle      0.475674
		Randomize      (-0.101, 0.445, -0.809)
		colorDistMagn   0.846218
		colorDistFreq   0.793321
		detailScale     1252.86
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0312347
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.313612
		terraceProb     0.115973
		erosion         0
		montesMagn      0.593917
		montesFreq      2.78119
		montesSpiky     0.888893
		montesFraction  0.751925
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.72722
		hillsFraction   0.664374
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228364
		craterFreq      0.260683
		craterDensity   0.676392
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.514758
		volcanoTemp     1791.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.239, 0.203, 0.183, 0.000)
		colorShelf     (0.254, 0.216, 0.195, 0.000)
		colorBeach     (0.269, 0.229, 0.206, 0.000)
		colorDesert    (0.283, 0.241, 0.218, 0.000)
		colorLowland   (0.298, 0.254, 0.229, 0.000)
		colorUpland    (0.313, 0.267, 0.241, 0.000)
		colorRock      (0.328, 0.280, 0.252, 0.000)
		colorSnow      (0.343, 0.292, 0.264, 1.000)
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
		SemiMajorAxis   0.231768
		Period          0.104933
		Eccentricity    0.0772201
		Inclination     1.91003
		AscendingNode   -124.11
		ArgOfPericenter -122.892
		MeanAnomaly     -140.355
	}
}

Asteroid	"Domir S71"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            1.83126e-015
	Radius          0.0941415
	InertiaMoment   0.398212

	Obliquity       -1.78578
	EqAscendNode    145.503
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.757 0.754 0.752)

	Surface
	{
		SurfStyle       0.282126
		OceanStyle      0.35209
		Randomize      (-0.385, 0.254, 0.422)
		colorDistMagn   0.417219
		colorDistFreq   5.24889e-006
		detailScale     2.57069
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0184799
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.613154
		terraceProb     0.358104
		erosion         0
		montesMagn      0.539582
		montesFreq      2.38909
		montesSpiky     0.925417
		montesFraction  0.773054
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.63455e-005
		hillsFraction   0.84598
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241605
		craterFreq      0.21217
		craterDensity   0.856001
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.412585
		volcanoTemp     1579.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.303, 0.301, 0.301, 0.000)
		colorShelf     (0.322, 0.320, 0.319, 0.000)
		colorBeach     (0.341, 0.339, 0.338, 0.000)
		colorDesert    (0.360, 0.358, 0.357, 0.000)
		colorLowland   (0.379, 0.377, 0.376, 0.000)
		colorUpland    (0.398, 0.396, 0.395, 0.000)
		colorRock      (0.416, 0.414, 0.413, 0.000)
		colorSnow      (0.435, 0.433, 0.432, 1.000)
		BumpHeight      0.0847274
		BumpOffset      0.0169455
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.22066
		Period          0.0974803
		Eccentricity    0.0141966
		Inclination     -1.78578
		AscendingNode   145.503
		ArgOfPericenter 118.261
		MeanAnomaly     -79.2529
	}
}

Asteroid	"Domir S72"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            2.69479e-012
	Radius          0.837755
	InertiaMoment   0.399305

	RotationPeriod  2303.01
	Obliquity       1.64078
	EqAscendNode    -108.94

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.715 0.626 0.552)

	Surface
	{
		SurfStyle       0.459575
		OceanStyle      0.615986
		Randomize      (0.111, -0.380, 0.768)
		colorDistMagn   0.950487
		colorDistFreq   0.000132068
		detailScale     22.8763
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0332738
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.585079
		terraceProb     0.13025
		erosion         0
		montesMagn      0.622797
		montesFreq      3.37694
		montesSpiky     0.904144
		montesFraction  0.391026
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00151089
		hillsFraction   0.612093
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223559
		craterFreq      0.203703
		craterDensity   1.03264
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.505952
		volcanoTemp     1219.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.286, 0.250, 0.221, 0.000)
		colorShelf     (0.304, 0.266, 0.235, 0.000)
		colorBeach     (0.322, 0.282, 0.249, 0.000)
		colorDesert    (0.340, 0.297, 0.262, 0.000)
		colorLowland   (0.357, 0.313, 0.276, 0.000)
		colorUpland    (0.375, 0.328, 0.290, 0.000)
		colorRock      (0.393, 0.344, 0.304, 0.000)
		colorSnow      (0.411, 0.360, 0.318, 1.000)
		BumpHeight      0.75398
		BumpOffset      0.150796
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.304006
		Period          0.157636
		Eccentricity    0.153949
		Inclination     1.64078
		AscendingNode   -108.94
		ArgOfPericenter -106.831
		MeanAnomaly     -144.721
	}
}

Asteroid	"Domir S73"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            3.96553e-009
	Radius          10.7028
	InertiaMoment   0.396554

	RotationPeriod  3263.31
	Obliquity       2.92402
	EqAscendNode    144.555

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.717 0.644 0.593)

	Surface
	{
		SurfStyle       0.536972
		OceanStyle      0.717694
		Randomize      (0.232, -0.245, -0.643)
		colorDistMagn   0.868961
		colorDistFreq   0.0478223
		detailScale     292.257
		colorConversion true
		snowLevel       2
		tropicLatitude  0.031053
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.270505
		terraceProb     0.455513
		erosion         0
		montesMagn      0.390926
		montesFreq      2.98418
		montesSpiky     0.817384
		montesFraction  0.416101
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.336585
		hillsFraction   0.505247
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250527
		craterFreq      0.248728
		craterDensity   1.04233
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.380215
		volcanoTemp     1920.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.280, 0.219, 0.166, 0.000)
		colorShelf     (0.287, 0.225, 0.190, 0.000)
		colorBeach     (0.337, 0.264, 0.226, 0.000)
		colorDesert    (0.366, 0.283, 0.220, 0.000)
		colorLowland   (0.401, 0.303, 0.249, 0.000)
		colorUpland    (0.445, 0.367, 0.303, 0.000)
		colorRock      (0.480, 0.399, 0.326, 0.000)
		colorSnow      (0.523, 0.425, 0.344, 1.000)
		BumpHeight      9.63251
		BumpOffset      1.9265
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.339627
		Period          0.186139
		Eccentricity    0.107372
		Inclination     2.92402
		AscendingNode   144.555
		ArgOfPericenter -22.5841
		MeanAnomaly     -100.991
	}
}

Asteroid	"Domir S74"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            2.32315e-017
	Radius          0.0219562
	InertiaMoment   0.398461

	Obliquity       4.95648
	EqAscendNode    -45.5769
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.731 0.657 0.627)

	Surface
	{
		SurfStyle       0.999994
		OceanStyle      0.191872
		Randomize      (0.132, 0.164, 0.807)
		colorDistMagn   0.265091
		colorDistFreq   5.70754e-008
		detailScale     0.59955
		colorConversion true
		snowLevel       2
		tropicLatitude  0.158803
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.33251
		terraceProb     0.391826
		erosion         0
		montesMagn      0.351472
		montesFreq      1.9738
		montesSpiky     0.978703
		montesFraction  0.405805
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.26558e-006
		hillsFraction   0.57306
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248019
		craterFreq      0.241387
		craterDensity   0.981335
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.474738
		volcanoTemp     1057.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.248, 0.230, 0.251, 0.050)
		colorShelf     (0.292, 0.269, 0.289, 0.040)
		colorBeach     (0.336, 0.309, 0.326, 0.030)
		colorDesert    (0.380, 0.348, 0.370, 0.020)
		colorLowland   (0.424, 0.388, 0.408, 0.030)
		colorUpland    (0.468, 0.427, 0.445, 0.050)
		colorRock      (0.511, 0.467, 0.496, 0.020)
		colorSnow      (0.511, 0.467, 0.496, 1.000)
		BumpHeight      0.0197606
		BumpOffset      0.00395212
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.255786
		Period          0.12166
		Eccentricity    0.054387
		Inclination     4.95648
		AscendingNode   -45.5769
		ArgOfPericenter -64.4669
		MeanAnomaly     0.801436
	}
}

Asteroid	"Domir S75"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            3.41864e-014
	Radius          0.195386
	InertiaMoment   0.399489

	Obliquity       5.03589
	EqAscendNode    -177.652
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.529 0.526 0.522)

	Surface
	{
		SurfStyle       0.137665
		OceanStyle      0.68919
		Randomize      (-0.601, -0.686, 0.407)
		colorDistMagn   0.763018
		colorDistFreq   2.18615e-005
		detailScale     5.33535
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00360469
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.631732
		terraceProb     0.253527
		erosion         0
		montesMagn      0.602269
		montesFreq      2.70837
		montesSpiky     0.95911
		montesFraction  0.463633
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.87909e-005
		hillsFraction   0.600651
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.206361
		craterFreq      0.158613
		craterDensity   1.01052
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.533239
		volcanoTemp     1360.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.212, 0.210, 0.209, 0.000)
		colorShelf     (0.225, 0.223, 0.222, 0.000)
		colorBeach     (0.238, 0.237, 0.235, 0.000)
		colorDesert    (0.251, 0.250, 0.248, 0.000)
		colorLowland   (0.265, 0.263, 0.261, 0.000)
		colorUpland    (0.278, 0.276, 0.274, 0.000)
		colorRock      (0.291, 0.289, 0.287, 0.000)
		colorSnow      (0.304, 0.302, 0.300, 1.000)
		BumpHeight      0.175848
		BumpOffset      0.0351695
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.17894
		Period          0.0711856
		Eccentricity    0.0920699
		Inclination     5.03589
		AscendingNode   -177.652
		ArgOfPericenter -45.8593
		MeanAnomaly     26.5537
	}
}

Asteroid	"Domir S76"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            5.03072e-011
	Radius          2.49625
	InertiaMoment   0.397157

	Obliquity       -3.41477
	EqAscendNode    -114.818
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.525 0.520 0.516)

	Surface
	{
		SurfStyle       0.365201
		OceanStyle      0.976976
		Randomize      (-0.072, 0.450, -0.180)
		colorDistMagn   0.49129
		colorDistFreq   0.00359617
		detailScale     68.1643
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0641337
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.514897
		terraceProb     0.183075
		erosion         0
		montesMagn      0.381501
		montesFreq      3.33724
		montesSpiky     0.960413
		montesFraction  0.659152
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0140827
		hillsFraction   0.650387
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230978
		craterFreq      0.273326
		craterDensity   0.79434
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.497788
		volcanoTemp     1490.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.210, 0.208, 0.206, 0.000)
		colorShelf     (0.223, 0.221, 0.219, 0.000)
		colorBeach     (0.236, 0.234, 0.232, 0.000)
		colorDesert    (0.249, 0.247, 0.245, 0.000)
		colorLowland   (0.263, 0.260, 0.258, 0.000)
		colorUpland    (0.276, 0.273, 0.271, 0.000)
		colorRock      (0.289, 0.286, 0.284, 0.000)
		colorSnow      (0.302, 0.299, 0.297, 1.000)
		BumpHeight      2.24663
		BumpOffset      0.449325
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.343124
		Period          0.189021
		Eccentricity    0.0508687
		Inclination     -3.41477
		AscendingNode   -114.818
		ArgOfPericenter -174.932
		MeanAnomaly     -157.061
	}
}

Asteroid	"Domir S77"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            7.40296e-008
	Radius          32.3052
	InertiaMoment   0.398688

	RotationPeriod  4375.58
	Obliquity       1.89864
	EqAscendNode    110.064

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.686 0.684 0.679)

	Surface
	{
		SurfStyle       0.225819
		OceanStyle      0.324862
		Randomize      (0.508, -0.169, 0.695)
		colorDistMagn   0.523772
		colorDistFreq   0.69539
		detailScale     882.149
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0379694
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.502391
		terraceProb     0.434251
		erosion         0
		montesMagn      0.314209
		montesFreq      3.36474
		montesSpiky     0.997881
		montesFraction  0.391676
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.28875
		hillsFraction   0.592776
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251075
		craterFreq      0.244845
		craterDensity   0.935835
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.472215
		volcanoTemp     1255.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.275, 0.273, 0.272, 0.000)
		colorShelf     (0.292, 0.291, 0.289, 0.000)
		colorBeach     (0.309, 0.308, 0.306, 0.000)
		colorDesert    (0.326, 0.325, 0.323, 0.000)
		colorLowland   (0.343, 0.342, 0.340, 0.000)
		colorUpland    (0.360, 0.359, 0.357, 0.000)
		colorRock      (0.377, 0.376, 0.374, 0.000)
		colorSnow      (0.395, 0.393, 0.390, 1.000)
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
		SemiMajorAxis   0.355889
		Period          0.199666
		Eccentricity    0.0997609
		Inclination     1.89864
		AscendingNode   110.064
		ArgOfPericenter -108.877
		MeanAnomaly     110.96
	}
}

Asteroid	"Domir S78"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            4.33693e-016
	Radius          0.0455691
	InertiaMoment   0.399669

	RotationPeriod  2751.19
	Obliquity       -2.19865
	EqAscendNode    -73.8343

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.570 0.566 0.563)

	Surface
	{
		SurfStyle       0.738261
		OceanStyle      0.78143
		Randomize      (-0.594, 0.007, -0.500)
		colorDistMagn   0.683263
		colorDistFreq   1.36474e-006
		detailScale     1.24434
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0613161
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.535215
		terraceProb     0.229203
		erosion         0
		montesMagn      0.462004
		montesFreq      3.21078
		montesSpiky     0.988694
		montesFraction  0.369792
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.99711e-006
		hillsFraction   0.358289
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258302
		craterFreq      0.270165
		craterDensity   0.948217
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.559719
		volcanoTemp     1652.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.222, 0.193, 0.158, 0.000)
		colorShelf     (0.228, 0.198, 0.180, 0.000)
		colorBeach     (0.268, 0.232, 0.214, 0.000)
		colorDesert    (0.291, 0.249, 0.208, 0.000)
		colorLowland   (0.319, 0.266, 0.237, 0.000)
		colorUpland    (0.353, 0.323, 0.287, 0.000)
		colorRock      (0.382, 0.351, 0.310, 0.000)
		colorSnow      (0.416, 0.374, 0.327, 1.000)
		BumpHeight      0.0410121
		BumpOffset      0.00820243
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.231304
		Period          0.104618
		Eccentricity    0.0619125
		Inclination     -2.19865
		AscendingNode   -73.8343
		ArgOfPericenter 72.0146
		MeanAnomaly     146.718
	}
}

Asteroid	"Domir S79"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            6.38203e-013
	Radius          0.582193
	InertiaMoment   0.397576

	Obliquity       -1.80557
	EqAscendNode    -134.135
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.517 0.509 0.503)

	Surface
	{
		SurfStyle       0.975237
		OceanStyle      0.264443
		Randomize      (0.177, 0.683, -0.553)
		colorDistMagn   0.750582
		colorDistFreq   0.000167584
		detailScale     15.8978
		colorConversion true
		snowLevel       2
		tropicLatitude  0.024551
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.472123
		terraceProb     0.164578
		erosion         0
		montesMagn      0.641896
		montesFreq      2.60158
		montesSpiky     0.904951
		montesFraction  0.618147
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000612669
		hillsFraction   0.538887
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229002
		craterFreq      0.201352
		craterDensity   0.799048
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.466192
		volcanoTemp     1590.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.176, 0.178, 0.201, 0.050)
		colorShelf     (0.207, 0.209, 0.231, 0.040)
		colorBeach     (0.238, 0.239, 0.262, 0.030)
		colorDesert    (0.269, 0.270, 0.297, 0.020)
		colorLowland   (0.300, 0.300, 0.327, 0.030)
		colorUpland    (0.331, 0.331, 0.357, 0.050)
		colorRock      (0.362, 0.361, 0.398, 0.020)
		colorSnow      (0.362, 0.361, 0.398, 1.000)
		BumpHeight      0.523974
		BumpOffset      0.104795
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.182749
		Period          0.073471
		Eccentricity    0.110997
		Inclination     -1.80557
		AscendingNode   -134.135
		ArgOfPericenter -72.7046
		MeanAnomaly     -28.0163
	}
}



Asteroid	"Domir S80"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            9.39148e-010
	Radius          7.53526
	InertiaMoment   0.3989

	RotationPeriod  1060.71
	Obliquity       -1.79827
	EqAscendNode    -37.7786

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.598 0.594 0.591)

	Surface
	{
		SurfStyle       0.755832
		OceanStyle      0.536069
		Randomize      (0.549, -0.908, 0.321)
		colorDistMagn   0.521171
		colorDistFreq   0.0167838
		detailScale     205.763
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0593547
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.543358
		terraceProb     0.7022
		erosion         0
		montesMagn      0.489682
		montesFreq      2.47927
		montesSpiky     0.910204
		montesFraction  0.230268
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.155359
		hillsFraction   0.543292
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255011
		craterFreq      0.181673
		craterDensity   1.00081
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.501864
		volcanoTemp     1709.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.233, 0.202, 0.165, 0.000)
		colorShelf     (0.239, 0.208, 0.189, 0.000)
		colorBeach     (0.281, 0.243, 0.225, 0.000)
		colorDesert    (0.305, 0.261, 0.219, 0.000)
		colorLowland   (0.335, 0.279, 0.248, 0.000)
		colorUpland    (0.371, 0.338, 0.301, 0.000)
		colorRock      (0.401, 0.368, 0.325, 0.000)
		colorSnow      (0.437, 0.392, 0.343, 1.000)
		BumpHeight      6.78174
		BumpOffset      1.35635
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.1945
		Period          0.08067
		Eccentricity    0.161577
		Inclination     -1.79827
		AscendingNode   -37.7786
		ArgOfPericenter 45.3735
		MeanAnomaly     65.4375
	}
}

Asteroid	"Domir S81"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            5.50186e-018
	Radius          0.0106279
	InertiaMoment   0.399847

	Obliquity       3.44106
	EqAscendNode    110.376
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.617 0.582 0.517)

	Surface
	{
		SurfStyle       0.496013
		OceanStyle      0.477546
		Randomize      (-0.775, 0.669, -0.642)
		colorDistMagn   0.152301
		colorDistFreq   6.29414e-008
		detailScale     0.290211
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0684907
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.672927
		terraceProb     0.395359
		erosion         0
		montesMagn      0.641712
		montesFreq      3.10378
		montesSpiky     0.895851
		montesFraction  0.625586
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.28909e-007
		hillsFraction   0.697207
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.271583
		craterFreq      0.208096
		craterDensity   0.741677
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.398854
		volcanoTemp     1593.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.247, 0.233, 0.207, 0.000)
		colorShelf     (0.262, 0.247, 0.220, 0.000)
		colorBeach     (0.278, 0.262, 0.233, 0.000)
		colorDesert    (0.293, 0.276, 0.246, 0.000)
		colorLowland   (0.309, 0.291, 0.259, 0.000)
		colorUpland    (0.324, 0.306, 0.272, 0.000)
		colorRock      (0.339, 0.320, 0.284, 0.000)
		colorSnow      (0.355, 0.335, 0.297, 1.000)
		BumpHeight      0.00956508
		BumpOffset      0.00191302
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.214398
		Period          0.0933605
		Eccentricity    0.107205
		Inclination     3.44106
		AscendingNode   110.376
		ArgOfPericenter -55.612
		MeanAnomaly     -45.5727
	}
}



Asteroid	"Domir S82"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            8.09628e-015
	Radius          0.135782
	InertiaMoment   0.397909

	Obliquity       2.87537
	EqAscendNode    -135.666
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.596 0.592 0.588)

	Surface
	{
		SurfStyle       0.831111
		OceanStyle      0.896006
		Randomize      (-0.955, 0.947, -0.539)
		colorDistMagn   0.480067
		colorDistFreq   6.58869e-006
		detailScale     3.70777
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0378468
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.422645
		terraceProb     0.323906
		erosion         0
		montesMagn      0.425086
		montesFreq      3.8612
		montesSpiky     0.874517
		montesFraction  0.378212
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.02497e-005
		hillsFraction   0.672195
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246163
		craterFreq      0.171788
		craterDensity   0.915574
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.423432
		volcanoTemp     1552.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.232, 0.201, 0.165, 0.000)
		colorShelf     (0.238, 0.207, 0.188, 0.000)
		colorBeach     (0.280, 0.243, 0.223, 0.000)
		colorDesert    (0.304, 0.261, 0.218, 0.000)
		colorLowland   (0.334, 0.278, 0.247, 0.000)
		colorUpland    (0.369, 0.338, 0.300, 0.000)
		colorRock      (0.399, 0.367, 0.323, 0.000)
		colorSnow      (0.435, 0.391, 0.341, 1.000)
		BumpHeight      0.122204
		BumpOffset      0.0244408
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.322959
		Period          0.172605
		Eccentricity    0.11234
		Inclination     2.87537
		AscendingNode   -135.666
		ArgOfPericenter 9.9573
		MeanAnomaly     96.6424
	}
}

Asteroid	"Domir S84"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            1.75323e-008
	Radius          15.6382
	InertiaMoment   0.394792

	RotationPeriod  4386.34
	Obliquity       0.817209
	EqAscendNode    -28.2808

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.729 0.654 0.548)

	Surface
	{
		SurfStyle       0.22167
		OceanStyle      0.0512003
		Randomize      (0.347, -0.321, -0.109)
		colorDistMagn   0.930476
		colorDistFreq   0.134908
		detailScale     427.028
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0276575
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.654477
		terraceProb     0.104974
		erosion         0
		montesMagn      0.606139
		montesFreq      3.33649
		montesSpiky     0.979869
		montesFraction  0.527015
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.595206
		hillsFraction   0.689963
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225447
		craterFreq      0.199088
		craterDensity   0.918628
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.586874
		volcanoTemp     1205.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.291, 0.262, 0.219, 0.000)
		colorShelf     (0.310, 0.278, 0.233, 0.000)
		colorBeach     (0.328, 0.295, 0.247, 0.000)
		colorDesert    (0.346, 0.311, 0.260, 0.000)
		colorLowland   (0.364, 0.327, 0.274, 0.000)
		colorUpland    (0.383, 0.344, 0.288, 0.000)
		colorRock      (0.401, 0.360, 0.301, 0.000)
		colorSnow      (0.419, 0.376, 0.315, 1.000)
		BumpHeight      14.0744
		BumpOffset      2.81488
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.315673
		Period          0.166797
		Eccentricity    0.0589905
		Inclination     0.817209
		AscendingNode   -28.2808
		ArgOfPericenter 92.6443
		MeanAnomaly     153.25
	}
}

Asteroid	"Domir S85"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            1.0271e-016
	Radius          0.0316679
	InertiaMoment   0.398192

	Obliquity       0.624339
	EqAscendNode    -116.029
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.691 0.689 0.687)

	Surface
	{
		SurfStyle       0.0625559
		OceanStyle      0.138661
		Randomize      (0.472, 0.887, -0.670)
		colorDistMagn   0.651836
		colorDistFreq   4.95205e-007
		detailScale     0.864745
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0115443
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.387961
		terraceProb     0.395382
		erosion         0
		montesMagn      0.393802
		montesFreq      4.00605
		montesSpiky     0.826962
		montesFraction  0.715539
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.75024e-006
		hillsFraction   0.717301
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239449
		craterFreq      0.272034
		craterDensity   0.984288
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.554887
		volcanoTemp     1544.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.276, 0.276, 0.275, 0.000)
		colorShelf     (0.294, 0.293, 0.292, 0.000)
		colorBeach     (0.311, 0.310, 0.309, 0.000)
		colorDesert    (0.328, 0.327, 0.326, 0.000)
		colorLowland   (0.346, 0.344, 0.344, 0.000)
		colorUpland    (0.363, 0.362, 0.361, 0.000)
		colorRock      (0.380, 0.379, 0.378, 0.000)
		colorSnow      (0.397, 0.396, 0.395, 1.000)
		BumpHeight      0.0285011
		BumpOffset      0.00570023
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.308817
		Period          0.161393
		Eccentricity    0.0622987
		Inclination     0.624339
		AscendingNode   -116.029
		ArgOfPericenter 162.7
		MeanAnomaly     -51.3471
	}
}

Asteroid	"Domir S86"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            1.51144e-013
	Radius          0.409883
	InertiaMoment   0.39929

	RotationPeriod  2447.78
	Obliquity       -0.925826
	EqAscendNode    -145.985

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.427 0.425 0.422)

	Surface
	{
		SurfStyle       0.695325
		OceanStyle      0.272448
		Randomize      (-0.331, 0.503, 0.288)
		colorDistMagn   0.676464
		colorDistFreq   2.39716e-005
		detailScale     11.1926
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00944911
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.743318
		terraceProb     0.21185
		erosion         0
		montesMagn      0.388898
		montesFreq      3.28048
		montesSpiky     0.806196
		montesFraction  0.594471
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000326191
		hillsFraction   0.758838
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239903
		craterFreq      0.204043
		craterDensity   0.813961
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.486747
		volcanoTemp     1833.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.167, 0.145, 0.118, 0.000)
		colorShelf     (0.171, 0.149, 0.135, 0.000)
		colorBeach     (0.201, 0.174, 0.160, 0.000)
		colorDesert    (0.218, 0.187, 0.156, 0.000)
		colorLowland   (0.239, 0.200, 0.177, 0.000)
		colorUpland    (0.265, 0.242, 0.215, 0.000)
		colorRock      (0.286, 0.264, 0.232, 0.000)
		colorSnow      (0.312, 0.281, 0.245, 1.000)
		BumpHeight      0.368895
		BumpOffset      0.073779
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.339655
		Period          0.186162
		Eccentricity    0.0722724
		Inclination     -0.925826
		AscendingNode   -145.985
		ArgOfPericenter -13.7424
		MeanAnomaly     61.0584
	}
}

Asteroid	"Domir S87"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            2.22416e-010
	Radius          3.64747
	InertiaMoment   0.396493

	RotationPeriod  1324.52
	Obliquity       1.16462
	EqAscendNode    -94.3499

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.693 0.552 0.503)

	Surface
	{
		SurfStyle       0.98901
		OceanStyle      0.624429
		Randomize      (-0.225, 0.300, -0.676)
		colorDistMagn   0.643263
		colorDistFreq   0.00878828
		detailScale     99.6004
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0276295
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.48272
		terraceProb     0.472592
		erosion         0
		montesMagn      0.56557
		montesFreq      3.07474
		montesSpiky     0.970801
		montesFraction  0.447392
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0335946
		hillsFraction   0.64173
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253504
		craterFreq      0.191928
		craterDensity   0.929328
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.546621
		volcanoTemp     1199.92
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.236, 0.193, 0.201, 0.050)
		colorShelf     (0.277, 0.226, 0.231, 0.040)
		colorBeach     (0.319, 0.259, 0.262, 0.030)
		colorDesert    (0.361, 0.292, 0.297, 0.020)
		colorLowland   (0.402, 0.325, 0.327, 0.030)
		colorUpland    (0.444, 0.358, 0.357, 0.050)
		colorRock      (0.485, 0.392, 0.398, 0.020)
		colorSnow      (0.485, 0.392, 0.398, 1.000)
		BumpHeight      3.28273
		BumpOffset      0.656545
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.186181
		Period          0.0755505
		Eccentricity    0.127385
		Inclination     1.16462
		AscendingNode   -94.3499
		ArgOfPericenter -92.0906
		MeanAnomaly     132.967
	}
}



Asteroid	"Domir S88"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            3.27297e-007
	Radius          46.5895
	InertiaMoment   0.398443

	RotationPeriod  2984.13
	Obliquity       -2.0335
	EqAscendNode    104.007

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.640 0.636 0.633)

	Surface
	{
		SurfStyle       0.640363
		OceanStyle      0.132376
		Randomize      (0.823, 0.515, 0.702)
		colorDistMagn   0.444027
		colorDistFreq   0.622368
		detailScale     1272.2
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0436778
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.65433
		terraceProb     0.464171
		erosion         0
		montesMagn      0.628636
		montesFreq      3.09503
		montesSpiky     0.994762
		montesFraction  0.290662
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.692
		hillsFraction   0.838376
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247747
		craterFreq      0.239107
		craterDensity   0.927462
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.463511
		volcanoTemp     1544.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.250, 0.216, 0.177, 0.000)
		colorShelf     (0.256, 0.223, 0.203, 0.000)
		colorBeach     (0.301, 0.261, 0.241, 0.000)
		colorDesert    (0.326, 0.280, 0.234, 0.000)
		colorLowland   (0.358, 0.299, 0.266, 0.000)
		colorUpland    (0.397, 0.362, 0.323, 0.000)
		colorRock      (0.429, 0.394, 0.348, 0.000)
		colorSnow      (0.467, 0.420, 0.367, 1.000)
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
		SemiMajorAxis   0.275741
		Period          0.136171
		Eccentricity    0.117634
		Inclination     -2.0335
		AscendingNode   104.007
		ArgOfPericenter 38.6058
		MeanAnomaly     176.863
	}
}

Asteroid	"Domir S89"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            1.91743e-015
	Radius          0.0955956
	InertiaMoment   0.399475

	Obliquity       -2.56591
	EqAscendNode    144.257
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.434 0.433 0.429)

	Surface
	{
		SurfStyle       0.00876001
		OceanStyle      0.494634
		Randomize      (0.653, -0.187, 0.067)
		colorDistMagn   0.507415
		colorDistFreq   4.27029e-006
		detailScale     2.6104
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0274738
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.491231
		terraceProb     0.174027
		erosion         0
		montesMagn      0.604038
		montesFreq      3.29225
		montesSpiky     0.925361
		montesFraction  0.492876
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.54342e-005
		hillsFraction   0.33413
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.26556
		craterFreq      0.20132
		craterDensity   0.940206
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.429708
		volcanoTemp     1750.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.174, 0.173, 0.172, 0.000)
		colorShelf     (0.185, 0.184, 0.182, 0.000)
		colorBeach     (0.195, 0.195, 0.193, 0.000)
		colorDesert    (0.206, 0.206, 0.204, 0.000)
		colorLowland   (0.217, 0.216, 0.215, 0.000)
		colorUpland    (0.228, 0.227, 0.225, 0.000)
		colorRock      (0.239, 0.238, 0.236, 0.000)
		colorSnow      (0.250, 0.249, 0.247, 1.000)
		BumpHeight      0.086036
		BumpOffset      0.0172072
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.19958
		Period          0.0838508
		Eccentricity    0.047051
		Inclination     -2.56591
		AscendingNode   144.257
		ArgOfPericenter -26.6735
		MeanAnomaly     8.09219
	}
}

Asteroid	"Domir S90"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            2.82159e-012
	Radius          0.850693
	InertiaMoment   0.397119

	Obliquity       -1.44801
	EqAscendNode    -169.396
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.438 0.434 0.431)

	Surface
	{
		SurfStyle       0.373659
		OceanStyle      0.634962
		Randomize      (-0.265, -0.742, 0.385)
		colorDistMagn   0.824715
		colorDistFreq   0.000496459
		detailScale     23.2296
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00467067
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.550797
		terraceProb     0.370916
		erosion         0
		montesMagn      0.541271
		montesFreq      3.48073
		montesSpiky     0.979481
		montesFraction  0.462064
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00177078
		hillsFraction   0.59903
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.195538
		craterFreq      0.200108
		craterDensity   0.734806
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.540606
		volcanoTemp     1491.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.175, 0.174, 0.173, 0.000)
		colorShelf     (0.186, 0.185, 0.183, 0.000)
		colorBeach     (0.197, 0.195, 0.194, 0.000)
		colorDesert    (0.208, 0.206, 0.205, 0.000)
		colorLowland   (0.219, 0.217, 0.216, 0.000)
		colorUpland    (0.230, 0.228, 0.227, 0.000)
		colorRock      (0.241, 0.239, 0.237, 0.000)
		colorSnow      (0.252, 0.250, 0.248, 1.000)
		BumpHeight      0.765624
		BumpOffset      0.153125
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.244146
		Period          0.113451
		Eccentricity    0.103586
		Inclination     -1.44801
		AscendingNode   -169.396
		ArgOfPericenter 108.01
		MeanAnomaly     -22.1254
	}
}

Asteroid	"Domir S91"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            4.15212e-009
	Radius          10.8681
	InertiaMoment   0.398671

	Obliquity       1.77756
	EqAscendNode    117.663
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.665 0.662 0.661)

	Surface
	{
		SurfStyle       0.286254
		OceanStyle      0.0566916
		Randomize      (0.548, -0.095, -0.446)
		colorDistMagn   0.236998
		colorDistFreq   0.0765627
		detailScale     296.771
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0321038
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.615121
		terraceProb     0.122126
		erosion         0
		montesMagn      0.341567
		montesFreq      3.15568
		montesSpiky     0.979506
		montesFraction  0.281153
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.364777
		hillsFraction   0.672011
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262328
		craterFreq      0.180902
		craterDensity   0.799314
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.436919
		volcanoTemp     1825.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.266, 0.265, 0.264, 0.000)
		colorShelf     (0.283, 0.281, 0.281, 0.000)
		colorBeach     (0.299, 0.298, 0.297, 0.000)
		colorDesert    (0.316, 0.315, 0.314, 0.000)
		colorLowland   (0.333, 0.331, 0.330, 0.000)
		colorUpland    (0.349, 0.348, 0.347, 0.000)
		colorRock      (0.366, 0.364, 0.363, 0.000)
		colorSnow      (0.382, 0.381, 0.380, 1.000)
		BumpHeight      9.78127
		BumpOffset      1.95625
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.294032
		Period          0.149943
		Eccentricity    0.0541989
		Inclination     1.77756
		AscendingNode   117.663
		ArgOfPericenter -130.107
		MeanAnomaly     121.639
	}
}

Asteroid	"Domir S92"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            2.43246e-017
	Radius          0.0222953
	InertiaMoment   0.399656

	RotationPeriod  1585.23
	Obliquity       -1.95649
	EqAscendNode    -75.5553

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.652 0.594 0.509)

	Surface
	{
		SurfStyle       0.284006
		OceanStyle      0.476352
		Randomize      (0.545, 0.294, 0.383)
		colorDistMagn   0.479789
		colorDistFreq   2.02403e-007
		detailScale     0.60881
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0539492
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.334058
		terraceProb     0.171146
		erosion         0
		montesMagn      0.430721
		montesFreq      3.68912
		montesSpiky     0.991172
		montesFraction  0.169678
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.39129e-007
		hillsFraction   0.678894
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246614
		craterFreq      0.206235
		craterDensity   0.750242
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.576113
		volcanoTemp     1716.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.261, 0.237, 0.204, 0.000)
		colorShelf     (0.277, 0.252, 0.216, 0.000)
		colorBeach     (0.293, 0.267, 0.229, 0.000)
		colorDesert    (0.309, 0.282, 0.242, 0.000)
		colorLowland   (0.326, 0.297, 0.254, 0.000)
		colorUpland    (0.342, 0.312, 0.267, 0.000)
		colorRock      (0.358, 0.327, 0.280, 0.000)
		colorSnow      (0.375, 0.341, 0.293, 1.000)
		BumpHeight      0.0200657
		BumpOffset      0.00401315
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.254244
		Period          0.120562
		Eccentricity    0.0898124
		Inclination     -1.95649
		AscendingNode   -75.5553
		ArgOfPericenter 177.612
		MeanAnomaly     -4.52037
	}
}

Asteroid	"Domir S93"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            3.5795e-014
	Radius          0.198404
	InertiaMoment   0.397547

	Obliquity       -0.790317
	EqAscendNode    -75.5382
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.536 0.488 0.426)

	Surface
	{
		SurfStyle       0.530686
		OceanStyle      0.601955
		Randomize      (-0.614, -0.624, -0.441)
		colorDistMagn   0.743521
		colorDistFreq   1.80995e-005
		detailScale     5.41774
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0218053
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.538197
		terraceProb     0.157184
		erosion         0
		montesMagn      0.606405
		montesFreq      3.31984
		montesSpiky     0.964184
		montesFraction  0.678971
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.78072e-005
		hillsFraction   0.540683
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.215853
		craterFreq      0.212582
		craterDensity   0.923544
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.471117
		volcanoTemp     1593.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.209, 0.166, 0.119, 0.000)
		colorShelf     (0.215, 0.171, 0.136, 0.000)
		colorBeach     (0.252, 0.200, 0.162, 0.000)
		colorDesert    (0.274, 0.215, 0.158, 0.000)
		colorLowland   (0.300, 0.230, 0.179, 0.000)
		colorUpland    (0.333, 0.278, 0.217, 0.000)
		colorRock      (0.359, 0.303, 0.234, 0.000)
		colorSnow      (0.392, 0.322, 0.247, 1.000)
		BumpHeight      0.178563
		BumpOffset      0.0357127
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.269515
		Period          0.131585
		Eccentricity    0.0416935
		Inclination     -0.790317
		AscendingNode   -75.5382
		ArgOfPericenter 73.6709
		MeanAnomaly     173.732
	}
}

Asteroid	"Domir S94"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            5.26742e-011
	Radius          2.53481
	InertiaMoment   0.398884

	Obliquity       -2.09795
	EqAscendNode    47.183
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.692 0.689 0.685)

	Surface
	{
		SurfStyle       0.870854
		OceanStyle      0.656837
		Randomize      (0.047, -0.107, 0.100)
		colorDistMagn   0.0922292
		colorDistFreq   0.00444728
		detailScale     69.2171
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0670587
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.264293
		terraceProb     0.120574
		erosion         0
		montesMagn      0.485994
		montesFreq      4.03198
		montesSpiky     0.981151
		montesFraction  0.358562
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0175219
		hillsFraction   0.643243
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235259
		craterFreq      0.243704
		craterDensity   0.86167
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.563242
		volcanoTemp     1644
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.235, 0.241, 0.274, 0.050)
		colorShelf     (0.277, 0.282, 0.315, 0.040)
		colorBeach     (0.319, 0.324, 0.356, 0.030)
		colorDesert    (0.360, 0.365, 0.404, 0.020)
		colorLowland   (0.402, 0.406, 0.445, 0.030)
		colorUpland    (0.443, 0.448, 0.486, 0.050)
		colorRock      (0.485, 0.489, 0.541, 0.020)
		colorSnow      (0.485, 0.489, 0.541, 1.000)
		BumpHeight      2.28132
		BumpOffset      0.456265
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.267751
		Period          0.130296
		Eccentricity    0.0595118
		Inclination     -2.09795
		AscendingNode   47.183
		ArgOfPericenter 131.439
		MeanAnomaly     -72.7537
	}
}



Asteroid	"Domir S95"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            7.75129e-008
	Radius          32.8041
	InertiaMoment   0.399833

	RotationPeriod  4151.5
	Obliquity       -0.55341
	EqAscendNode    141.836

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.696 0.526 0.455)

	Surface
	{
		SurfStyle       0.316039
		OceanStyle      0.569164
		Randomize      (-0.593, 0.297, -0.560)
		colorDistMagn   0.60472
		colorDistFreq   0.727983
		detailScale     895.771
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00631939
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.362892
		terraceProb     0.112756
		erosion         0
		montesMagn      0.634148
		montesFreq      2.962
		montesSpiky     0.861785
		montesFraction  0.697138
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.48626
		hillsFraction   0.813969
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238509
		craterFreq      0.172027
		craterDensity   0.933171
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.483591
		volcanoTemp     1618.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.278, 0.210, 0.182, 0.000)
		colorShelf     (0.296, 0.223, 0.193, 0.000)
		colorBeach     (0.313, 0.237, 0.205, 0.000)
		colorDesert    (0.331, 0.250, 0.216, 0.000)
		colorLowland   (0.348, 0.263, 0.227, 0.000)
		colorUpland    (0.365, 0.276, 0.239, 0.000)
		colorRock      (0.383, 0.289, 0.250, 0.000)
		colorSnow      (0.400, 0.302, 0.261, 1.000)
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
		SemiMajorAxis   0.304303
		Period          0.157867
		Eccentricity    0.135064
		Inclination     -0.55341
		AscendingNode   141.836
		ArgOfPericenter 126.009
		MeanAnomaly     164.27
	}
}




Asteroid	"Domir S97"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            6.68231e-013
	Radius          0.526322
	InertiaMoment   0.399084

	Obliquity       2.58149
	EqAscendNode    40.0587
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.767 0.765 0.764)

	Surface
	{
		SurfStyle       0.217725
		OceanStyle      0.503442
		Randomize      (-0.942, -0.443, 0.627)
		colorDistMagn   0.507514
		colorDistFreq   0.00021906
		detailScale     14.3721
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0845562
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.63536
		terraceProb     0.758285
		erosion         0
		montesMagn      0.304001
		montesFreq      2.28953
		montesSpiky     0.86362
		montesFraction  0.388722
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000576399
		hillsFraction   0.750839
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.207285
		craterFreq      0.230447
		craterDensity   0.713988
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.515234
		volcanoTemp     1470.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.307, 0.306, 0.306, 0.000)
		colorShelf     (0.326, 0.325, 0.325, 0.000)
		colorBeach     (0.345, 0.344, 0.344, 0.000)
		colorDesert    (0.364, 0.363, 0.363, 0.000)
		colorLowland   (0.383, 0.382, 0.382, 0.000)
		colorUpland    (0.402, 0.401, 0.401, 0.000)
		colorRock      (0.422, 0.421, 0.420, 0.000)
		colorSnow      (0.441, 0.440, 0.439, 1.000)
		BumpHeight      0.47369
		BumpOffset      0.094738
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.278
		Period          0.137848
		Eccentricity    0.0716518
		Inclination     2.58149
		AscendingNode   40.0587
		ArgOfPericenter -145.174
		MeanAnomaly     157.883
	}
}

Asteroid	"Domir S98"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            9.83336e-010
	Radius          6.72416
	InertiaMoment   0.394207

	RotationPeriod  3773.33
	Obliquity       4.91124
	EqAscendNode    -84.777

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.547 0.544 0.540)

	Surface
	{
		SurfStyle       0.990601
		OceanStyle      0.934873
		Randomize      (-0.365, -0.979, 0.237)
		colorDistMagn   0.634986
		colorDistFreq   0.0242685
		detailScale     183.615
		colorConversion true
		snowLevel       2
		tropicLatitude  0.126212
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.445054
		terraceProb     0.111558
		erosion         0
		montesMagn      0.50623
		montesFreq      3.3212
		montesSpiky     0.837305
		montesFraction  0.668416
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.109359
		hillsFraction   0.789959
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229396
		craterFreq      0.221492
		craterDensity   1.01017
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.455537
		volcanoTemp     1321.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.186, 0.190, 0.216, 0.050)
		colorShelf     (0.219, 0.223, 0.248, 0.040)
		colorBeach     (0.251, 0.256, 0.281, 0.030)
		colorDesert    (0.284, 0.288, 0.318, 0.020)
		colorLowland   (0.317, 0.321, 0.351, 0.030)
		colorUpland    (0.350, 0.353, 0.383, 0.050)
		colorRock      (0.383, 0.386, 0.426, 0.020)
		colorSnow      (0.383, 0.386, 0.426, 1.000)
		BumpHeight      6.05175
		BumpOffset      1.21035
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.2357
		Period          0.107615
		Eccentricity    0.179879
		Inclination     4.91124
		AscendingNode   -84.777
		ArgOfPericenter -95.0635
		MeanAnomaly     -25.5944
	}
}

Asteroid	"Domir S99"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            5.76075e-018
	Radius          0.013794
	InertiaMoment   0.398171

	RotationPeriod  5011.58
	Obliquity       -2.35596
	EqAscendNode    -138.719

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.463 0.461 0.458)

	Surface
	{
		SurfStyle       0.350923
		OceanStyle      0.104411
		Randomize      (-0.913, 0.980, -0.192)
		colorDistMagn   0.377324
		colorDistFreq   1.35611e-007
		detailScale     0.376669
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0289788
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.548964
		terraceProb     0.214476
		erosion         0
		montesMagn      0.332124
		montesFreq      3.23607
		montesSpiky     0.931083
		montesFraction  0.7653
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.62354e-007
		hillsFraction   0.494472
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24622
		craterFreq      0.182417
		craterDensity   0.886337
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.558762
		volcanoTemp     1825.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.185, 0.184, 0.183, 0.000)
		colorShelf     (0.197, 0.196, 0.195, 0.000)
		colorBeach     (0.208, 0.207, 0.206, 0.000)
		colorDesert    (0.220, 0.219, 0.217, 0.000)
		colorLowland   (0.232, 0.230, 0.229, 0.000)
		colorUpland    (0.243, 0.242, 0.240, 0.000)
		colorRock      (0.255, 0.253, 0.252, 0.000)
		colorSnow      (0.266, 0.265, 0.263, 1.000)
		BumpHeight      0.0124146
		BumpOffset      0.00248292
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.284791
		Period          0.14293
		Eccentricity    0.199794
		Inclination     -2.35596
		AscendingNode   -138.719
		ArgOfPericenter -65.6792
		MeanAnomaly     -151.483
	}
}

Asteroid	"Domir S100"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            8.47726e-015
	Radius          0.122752
	InertiaMoment   0.399276

	RotationPeriod  6191.5
	Obliquity       -3.31591
	EqAscendNode    145.314

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.439 0.431 0.428)

	Surface
	{
		SurfStyle       0.19772
		OceanStyle      0.318863
		Randomize      (-0.868, -0.671, -0.287)
		colorDistMagn   0.8506
		colorDistFreq   6.50588e-006
		detailScale     3.35194
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0344784
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.623932
		terraceProb     0.797834
		erosion         0
		montesMagn      0.456373
		montesFreq      2.27327
		montesSpiky     0.937183
		montesFraction  0.639997
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.8156e-005
		hillsFraction   0.6474
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227324
		craterFreq      0.146196
		craterDensity   0.889585
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.504687
		volcanoTemp     886.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.175, 0.173, 0.171, 0.000)
		colorShelf     (0.186, 0.183, 0.182, 0.000)
		colorBeach     (0.197, 0.194, 0.193, 0.000)
		colorDesert    (0.208, 0.205, 0.203, 0.000)
		colorLowland   (0.219, 0.216, 0.214, 0.000)
		colorUpland    (0.230, 0.227, 0.225, 0.000)
		colorRock      (0.241, 0.237, 0.236, 0.000)
		colorSnow      (0.252, 0.248, 0.246, 1.000)
		BumpHeight      0.110477
		BumpOffset      0.0220953
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.282576
		Period          0.141265
		Eccentricity    0.137619
		Inclination     -3.31591
		AscendingNode   145.314
		ArgOfPericenter -107.645
		MeanAnomaly     -25.7579
	}
}







Comet	"Domir C1"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            1.89901e-017
	Radius          0.0370835
	InertiaMoment   0.399089

	Oblateness      0.00573562

	RotationPeriod  66.7612
	Obliquity       55.1546
	EqAscendNode    275.32

	AbsMagn         7.40483
	SlopeParam      3.84941
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.675 0.674 0.672)

	Surface
	{
		SurfStyle       0.769179
		OceanStyle      0.168079
		Randomize      (0.494, 0.306, -0.349)
		colorDistMagn   0.0775923
		colorDistFreq   8.11563e-007
		detailScale     1.01263
		colorConversion true
		snowLevel       2
		tropicLatitude  0.524189
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.58187
		terraceProb     0.463113
		erosion         0
		montesMagn      0.4362
		montesFreq      3.06211
		montesSpiky     0.896693
		montesFraction  0.845355
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.22461e-006
		hillsFraction   0.393156
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219796
		craterFreq      0.273941
		craterDensity   0.888413
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.606298
		volcanoTemp     1213.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.263, 0.229, 0.188, 0.000)
		colorShelf     (0.270, 0.236, 0.215, 0.000)
		colorBeach     (0.317, 0.276, 0.255, 0.000)
		colorDesert    (0.344, 0.297, 0.249, 0.000)
		colorLowland   (0.378, 0.317, 0.282, 0.000)
		colorUpland    (0.419, 0.384, 0.343, 0.000)
		colorRock      (0.453, 0.418, 0.370, 0.000)
		colorSnow      (0.493, 0.445, 0.390, 1.000)
		BumpHeight      0.0333752
		BumpOffset      0.00667503
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.0797178
		DustBright  0.512814
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   21.1721
		Period          91.6175
		Eccentricity    0.910553
		Inclination     -25.2786
		AscendingNode   -17.1066
		ArgOfPericenter -145.96
		MeanAnomaly     88.3304
	}
}

Comet	"Domir C2"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            1.46875e-013
	Radius          0.816472
	InertiaMoment   0.39761

	Oblateness      0.00837584

	RotationPeriod  64.7183
	Obliquity       8.36026
	EqAscendNode    259.898

	AbsMagn         2.94388
	SlopeParam      4.41437
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.668 0.663 0.658)

	Surface
	{
		SurfStyle       0.772043
		OceanStyle      0.405142
		Randomize      (-0.098, -0.889, 0.592)
		colorDistMagn   0.763481
		colorDistFreq   0.00037428
		detailScale     22.2951
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998909
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.305697
		terraceProb     0.125267
		erosion         0
		montesMagn      0.485187
		montesFreq      3.54137
		montesSpiky     0.983314
		montesFraction  0.722371
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0013149
		hillsFraction   0.603893
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234591
		craterFreq      0.228493
		craterDensity   1.0025
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.44461
		volcanoTemp     1688.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.260, 0.225, 0.184, 0.000)
		colorShelf     (0.267, 0.232, 0.211, 0.000)
		colorBeach     (0.314, 0.272, 0.250, 0.000)
		colorDesert    (0.341, 0.292, 0.244, 0.000)
		colorLowland   (0.374, 0.312, 0.276, 0.000)
		colorUpland    (0.414, 0.378, 0.336, 0.000)
		colorRock      (0.447, 0.411, 0.362, 0.000)
		colorSnow      (0.488, 0.438, 0.382, 1.000)
		BumpHeight      0.734825
		BumpOffset      0.146965
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.27816
		GasToDust   0.25
		Particles   1541
		GasBright   0.053626
		DustBright  0.223392
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   15.604
		Period          57.9678
		Eccentricity    0.914612
		Inclination     -90.761
		AscendingNode   65.6966
		ArgOfPericenter 73.4618
		MeanAnomaly     54.6731
	}
}

Comet	"Domir C3"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            1.13597e-009
	Radius          14.4934
	InertiaMoment   0.399534

	Oblateness      0.00649466

	RotationPeriod  62.7279
	Obliquity       321.566
	EqAscendNode    244.475

	AbsMagn         10.797
	SlopeParam      5.01526
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.711 0.674 0.605)

	Surface
	{
		SurfStyle       0.108517
		OceanStyle      0.602822
		Randomize      (-0.310, -0.683, -0.622)
		colorDistMagn   0.104985
		colorDistFreq   0.0846095
		detailScale     395.765
		colorConversion true
		snowLevel       2
		tropicLatitude  0.945944
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.37178
		terraceProb     0.406328
		erosion         0
		montesMagn      0.29876
		montesFreq      2.24602
		montesSpiky     0.954445
		montesFraction  0.356364
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.417956
		hillsFraction   0.556866
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255284
		craterFreq      0.178343
		craterDensity   0.898836
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.568083
		volcanoTemp     1484.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.284, 0.269, 0.242, 0.000)
		colorShelf     (0.302, 0.286, 0.257, 0.000)
		colorBeach     (0.320, 0.303, 0.272, 0.000)
		colorDesert    (0.338, 0.320, 0.287, 0.000)
		colorLowland   (0.355, 0.337, 0.302, 0.000)
		colorUpland    (0.373, 0.354, 0.317, 0.000)
		colorRock      (0.391, 0.370, 0.333, 0.000)
		colorSnow      (0.409, 0.387, 0.348, 1.000)
		BumpHeight      13.044
		BumpOffset      2.6088
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.759352
		GasToDust   0.25
		Particles   2513
		GasBright   0.192378
		DustBright  0.569128
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   18.7152
		Period          76.1417
		Eccentricity    0.910139
		Inclination     103.567
		AscendingNode   32.7711
		ArgOfPericenter 154.799
		MeanAnomaly     -125.237
	}
}

Comet	"Domir C4"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            3.49774e-017
	Radius          0.0505227
	InertiaMoment   0.398314

	Oblateness      0.00947285

	RotationPeriod  60.7815
	Obliquity       274.772
	EqAscendNode    229.052

	AbsMagn         7.19295
	SlopeParam      5.7281
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.580 0.573 0.570)

	Surface
	{
		SurfStyle       0.362468
		OceanStyle      0.0698985
		Randomize      (-0.771, 0.958, -0.530)
		colorDistMagn   0.913958
		colorDistFreq   1.49562e-006
		detailScale     1.37961
		colorConversion true
		snowLevel       2
		tropicLatitude  0.983963
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.575913
		terraceProb     0.310136
		erosion         0
		montesMagn      0.34428
		montesFreq      2.78479
		montesSpiky     0.914802
		montesFraction  0.507737
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.21109e-006
		hillsFraction   0.599848
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.266859
		craterFreq      0.220996
		craterDensity   1.05205
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48708
		volcanoTemp     1690.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.232, 0.229, 0.228, 0.000)
		colorShelf     (0.246, 0.243, 0.242, 0.000)
		colorBeach     (0.261, 0.258, 0.256, 0.000)
		colorDesert    (0.275, 0.272, 0.271, 0.000)
		colorLowland   (0.290, 0.286, 0.285, 0.000)
		colorUpland    (0.304, 0.301, 0.299, 0.000)
		colorRock      (0.319, 0.315, 0.313, 0.000)
		colorSnow      (0.333, 0.329, 0.328, 1.000)
		BumpHeight      0.0454705
		BumpOffset      0.00909409
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.139004
		DustBright  0.306988
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   24.3504
		Period          113.004
		Eccentricity    0.934344
		Inclination     66.6346
		AscendingNode   80.8558
		ArgOfPericenter -153.019
		MeanAnomaly     -155.641
	}
}

Comet	"Domir C5"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            2.70524e-013
	Radius          0.897751
	InertiaMoment   0.399957

	Oblateness      0.00737009

	RotationPeriod  58.8718
	Obliquity       227.977
	EqAscendNode    213.63

	AbsMagn         2.44097
	SlopeParam      6.78741
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.560 0.393 0.330)

	Surface
	{
		SurfStyle       0.612046
		OceanStyle      0.0807138
		Randomize      (-0.473, 0.223, 0.445)
		colorDistMagn   0.573949
		colorDistFreq   0.000324109
		detailScale     24.5146
		colorConversion true
		snowLevel       2
		tropicLatitude  0.776363
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.409195
		terraceProb     0.198489
		erosion         0
		montesMagn      0.571127
		montesFreq      3.44763
		montesSpiky     0.96221
		montesFraction  0.340834
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00143708
		hillsFraction   0.570966
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244132
		craterFreq      0.248144
		craterDensity   0.799693
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.449037
		volcanoTemp     1353.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.218, 0.134, 0.092, 0.000)
		colorShelf     (0.224, 0.138, 0.106, 0.000)
		colorBeach     (0.263, 0.161, 0.125, 0.000)
		colorDesert    (0.285, 0.173, 0.122, 0.000)
		colorLowland   (0.313, 0.185, 0.139, 0.000)
		colorUpland    (0.347, 0.224, 0.168, 0.000)
		colorRock      (0.375, 0.244, 0.182, 0.000)
		colorSnow      (0.409, 0.259, 0.192, 1.000)
		BumpHeight      0.807976
		BumpOffset      0.161595
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.310985
		GasToDust   0.25
		Particles   1608
		GasBright   0.344946
		DustBright  0.585533
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   25.5535
		Period          121.481
		Eccentricity    0.938914
		Inclination     -98.0615
		AscendingNode   10.0898
		ArgOfPericenter 64.9357
		MeanAnomaly     40.6096
	}
}

Comet	"Domir C6"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            2.09231e-009
	Radius          19.7266
	InertiaMoment   0.398853

	Oblateness      0.010743

	RotationPeriod  56.9923
	Obliquity       181.183
	EqAscendNode    198.207

	AbsMagn         10.5364
	SlopeParam      2.23703
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.512 0.504 0.498)

	Surface
	{
		SurfStyle       0.671024
		OceanStyle      0.522129
		Randomize      (0.276, -0.551, 0.096)
		colorDistMagn   0.283625
		colorDistFreq   0.144254
		detailScale     538.667
		colorConversion true
		snowLevel       2
		tropicLatitude  0.241419
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.760989
		terraceProb     0.429656
		erosion         0
		montesMagn      0.568202
		montesFreq      2.47667
		montesSpiky     0.789201
		montesFraction  0.545224
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.679773
		hillsFraction   0.685878
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25977
		craterFreq      0.211822
		craterDensity   0.793511
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48754
		volcanoTemp     1562.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.200, 0.171, 0.139, 0.000)
		colorShelf     (0.205, 0.176, 0.159, 0.000)
		colorBeach     (0.241, 0.207, 0.189, 0.000)
		colorDesert    (0.261, 0.222, 0.184, 0.000)
		colorLowland   (0.287, 0.237, 0.209, 0.000)
		colorUpland    (0.317, 0.287, 0.254, 0.000)
		colorRock      (0.343, 0.313, 0.274, 0.000)
		colorSnow      (0.374, 0.333, 0.289, 1.000)
		BumpHeight      17.7539
		BumpOffset      3.55078
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.792177
		GasToDust   0.25
		Particles   2580
		GasBright   0.26429
		DustBright  0.350675
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   28.6586
		Period          144.283
		Eccentricity    0.948038
		Inclination     14.7182
		AscendingNode   130.978
		ArgOfPericenter -1.10451
		MeanAnomaly     126.696
	}
}

Comet	"Domir C7"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            6.44238e-017
	Radius          0.0556087
	InertiaMoment   0.397119

	Oblateness      0.00829662

	RotationPeriod  55.137
	Obliquity       134.389
	EqAscendNode    182.785

	AbsMagn         6.97877
	SlopeParam      2.95755
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.646 0.641 0.636)

	Surface
	{
		SurfStyle       0.184499
		OceanStyle      0.657332
		Randomize      (-0.260, 0.839, 0.325)
		colorDistMagn   0.664116
		colorDistFreq   1.38583e-006
		detailScale     1.51849
		colorConversion true
		snowLevel       2
		tropicLatitude  0.701848
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.343428
		terraceProb     0.169419
		erosion         0
		montesMagn      0.479085
		montesFreq      2.66529
		montesSpiky     0.965323
		montesFraction  0.351413
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.04781e-006
		hillsFraction   0.668957
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237479
		craterFreq      0.189623
		craterDensity   0.757477
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.512932
		volcanoTemp     1280.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.258, 0.256, 0.255, 0.000)
		colorShelf     (0.274, 0.272, 0.270, 0.000)
		colorBeach     (0.291, 0.289, 0.286, 0.000)
		colorDesert    (0.307, 0.305, 0.302, 0.000)
		colorLowland   (0.323, 0.321, 0.318, 0.000)
		colorUpland    (0.339, 0.337, 0.334, 0.000)
		colorRock      (0.355, 0.353, 0.350, 0.000)
		colorSnow      (0.371, 0.369, 0.366, 1.000)
		BumpHeight      0.0500479
		BumpOffset      0.0100096
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.146375
		DustBright  0.153077
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   23.7617
		Period          108.93
		Eccentricity    0.961039
		Inclination     1.03808
		AscendingNode   -3.76049
		ArgOfPericenter -32.8307
		MeanAnomaly     -158.334
	}
}

Comet	"Domir C8"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            4.98272e-013
	Radius          1.22077
	InertiaMoment   0.399318

	Oblateness      0.0122451

	RotationPeriod  53.3004
	Obliquity       87.5945
	EqAscendNode    167.362

	AbsMagn         1.83055
	SlopeParam      3.56126
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.686 0.568 0.468)

	Surface
	{
		SurfStyle       0.908677
		OceanStyle      0.191802
		Randomize      (-0.536, -0.481, 0.701)
		colorDistMagn   0.448753
		colorDistFreq   0.000764886
		detailScale     33.3352
		colorConversion true
		snowLevel       2
		tropicLatitude  0.987375
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.626579
		terraceProb     0.256627
		erosion         0
		montesMagn      0.474418
		montesFreq      3.78472
		montesSpiky     0.893859
		montesFraction  0.724604
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00420704
		hillsFraction   0.562938
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223102
		craterFreq      0.254579
		craterDensity   0.911239
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.532333
		volcanoTemp     1686.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.233, 0.199, 0.187, 0.050)
		colorShelf     (0.274, 0.233, 0.215, 0.040)
		colorBeach     (0.316, 0.267, 0.243, 0.030)
		colorDesert    (0.357, 0.301, 0.276, 0.020)
		colorLowland   (0.398, 0.335, 0.304, 0.030)
		colorUpland    (0.439, 0.369, 0.332, 0.050)
		colorRock      (0.480, 0.403, 0.369, 0.020)
		colorSnow      (0.480, 0.403, 0.369, 1.000)
		BumpHeight      1.0987
		BumpOffset      0.219739
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.343811
		GasToDust   0.25
		Particles   1674
		GasBright   0.0375148
		DustBright  0.746423
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   15.1793
		Period          55.6171
		Eccentricity    0.891078
		Inclination     144.411
		AscendingNode   -109.337
		ArgOfPericenter -16.9789
		MeanAnomaly     113.591
	}
}

Comet	"Domir C9"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            3.85378e-009
	Radius          21.7335
	InertiaMoment   0.397997

	Oblateness      0.00953018

	RotationPeriod  51.4776
	Obliquity       40.8002
	EqAscendNode    151.94

	AbsMagn         10.2862
	SlopeParam      4.12671
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.683 0.565 0.505)

	Surface
	{
		SurfStyle       0.72771
		OceanStyle      0.219121
		Randomize      (0.652, -0.038, -0.179)
		colorDistMagn   0.588252
		colorDistFreq   0.215384
		detailScale     593.469
		colorConversion true
		snowLevel       2
		tropicLatitude  0.964723
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.480707
		terraceProb     0.509562
		erosion         0
		montesMagn      0.605689
		montesFreq      3.59064
		montesSpiky     0.998352
		montesFraction  0.875346
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.870129
		hillsFraction   0.629594
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250443
		craterFreq      0.171653
		craterDensity   0.939876
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52775
		volcanoTemp     1411.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.267, 0.192, 0.142, 0.000)
		colorShelf     (0.273, 0.198, 0.162, 0.000)
		colorBeach     (0.321, 0.232, 0.192, 0.000)
		colorDesert    (0.349, 0.249, 0.187, 0.000)
		colorLowland   (0.383, 0.266, 0.212, 0.000)
		colorUpland    (0.424, 0.322, 0.258, 0.000)
		colorRock      (0.458, 0.350, 0.278, 0.000)
		colorSnow      (0.499, 0.373, 0.293, 1.000)
		BumpHeight      19.5602
		BumpOffset      3.91203
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.825003
		GasToDust   0.25
		Particles   2646
		GasBright   0.0500744
		DustBright  0.41835
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   17.928
		Period          71.3887
		Eccentricity    0.959927
		Inclination     35.5881
		AscendingNode   22.0953
		ArgOfPericenter -63.726
		MeanAnomaly     144.169
	}
}

Comet	"Domir C10"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            1.18661e-016
	Radius          0.0755502
	InertiaMoment   0.399749

	Oblateness      0.0140608

	RotationPeriod  49.6636
	Obliquity       354.006
	EqAscendNode    136.517

	AbsMagn         6.76162
	SlopeParam      4.70269
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.629 0.623 0.619)

	Surface
	{
		SurfStyle       0.158191
		OceanStyle      0.504282
		Randomize      (0.852, 0.659, -0.143)
		colorDistMagn   0.926767
		colorDistFreq   2.99459e-006
		detailScale     2.06302
		colorConversion true
		snowLevel       2
		tropicLatitude  0.966727
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.618288
		terraceProb     0.741869
		erosion         0
		montesMagn      0.558061
		montesFreq      4.28586
		montesSpiky     0.987925
		montesFraction  0.655367
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.64322e-005
		hillsFraction   0.804119
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256049
		craterFreq      0.236911
		craterDensity   0.968499
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.503195
		volcanoTemp     1277.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.252, 0.249, 0.248, 0.000)
		colorShelf     (0.267, 0.265, 0.263, 0.000)
		colorBeach     (0.283, 0.280, 0.279, 0.000)
		colorDesert    (0.299, 0.296, 0.294, 0.000)
		colorLowland   (0.314, 0.311, 0.310, 0.000)
		colorUpland    (0.330, 0.327, 0.325, 0.000)
		colorRock      (0.346, 0.342, 0.341, 0.000)
		colorSnow      (0.362, 0.358, 0.356, 1.000)
		BumpHeight      0.0679952
		BumpOffset      0.013599
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.158131
		DustBright  0.79478
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   23.9458
		Period          110.198
		Eccentricity    0.940805
		Inclination     81.1308
		AscendingNode   6.68953
		ArgOfPericenter -179.735
		MeanAnomaly     -57.1031
	}
}

Comet	"Domir C11"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            9.17755e-013
	Radius          1.34622
	InertiaMoment   0.398599

	Oblateness      0.0110307

	RotationPeriod  47.8539
	Obliquity       307.212
	EqAscendNode    121.094

	AbsMagn         1.02881
	SlopeParam      5.34528
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.479 0.425 0.363)

	Surface
	{
		SurfStyle       0.382207
		OceanStyle      0.560545
		Randomize      (0.545, -0.857, -0.819)
		colorDistMagn   0.499177
		colorDistFreq   0.000831703
		detailScale     36.7608
		colorConversion true
		snowLevel       2
		tropicLatitude  0.992223
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.408787
		terraceProb     0.339852
		erosion         0
		montesMagn      0.658085
		montesFreq      3.70446
		montesSpiky     0.986114
		montesFraction  0.795775
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00530868
		hillsFraction   0.654721
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233327
		craterFreq      0.245078
		craterDensity   0.87789
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.495767
		volcanoTemp     1846.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.191, 0.170, 0.145, 0.000)
		colorShelf     (0.203, 0.180, 0.154, 0.000)
		colorBeach     (0.215, 0.191, 0.163, 0.000)
		colorDesert    (0.227, 0.202, 0.172, 0.000)
		colorLowland   (0.239, 0.212, 0.181, 0.000)
		colorUpland    (0.251, 0.223, 0.190, 0.000)
		colorRock      (0.263, 0.234, 0.200, 0.000)
		colorSnow      (0.275, 0.244, 0.209, 1.000)
		BumpHeight      1.2116
		BumpOffset      0.242319
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.376637
		GasToDust   0.25
		Particles   1740
		GasBright   0.143408
		DustBright  0.493989
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   22.2868
		Period          98.9472
		Eccentricity    0.932047
		Inclination     -123.594
		AscendingNode   -108.467
		ArgOfPericenter -35.2203
		MeanAnomaly     -121.062
	}
}

Comet	"Domir C12"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            7.09817e-009
	Radius          29.502
	InertiaMoment   0.396339

	Oblateness      0.016077

	RotationPeriod  46.0438
	Obliquity       260.417
	EqAscendNode    105.672

	AbsMagn         10.0446
	SlopeParam      6.17406
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.646 0.641 0.637)

	Surface
	{
		SurfStyle       0.0450955
		OceanStyle      0.871379
		Randomize      (-0.125, 0.952, -0.329)
		colorDistMagn   0.611948
		colorDistFreq   0.560513
		detailScale     805.603
		colorConversion true
		snowLevel       2
		tropicLatitude  0.996007
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.361865
		terraceProb     0.486339
		erosion         0
		montesMagn      0.632285
		montesFreq      2.94045
		montesSpiky     0.849219
		montesFraction  0.626029
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.36371
		hillsFraction   0.797758
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248906
		craterFreq      0.278559
		craterDensity   0.945323
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.455779
		volcanoTemp     1403.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.258, 0.256, 0.255, 0.000)
		colorShelf     (0.275, 0.273, 0.271, 0.000)
		colorBeach     (0.291, 0.289, 0.287, 0.000)
		colorDesert    (0.307, 0.305, 0.303, 0.000)
		colorLowland   (0.323, 0.321, 0.319, 0.000)
		colorUpland    (0.339, 0.337, 0.335, 0.000)
		colorRock      (0.355, 0.353, 0.351, 0.000)
		colorSnow      (0.372, 0.369, 0.366, 1.000)
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
		MaxLength   0.857829
		GasToDust   0.25
		Particles   2712
		GasBright   0.0914265
		DustBright  0.230458
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   21.9535
		Period          96.7359
		Eccentricity    0.914479
		Inclination     108.615
		AscendingNode   87.7836
		ArgOfPericenter -114.419
		MeanAnomaly     68.809
	}
}

Comet	"Domir C13"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            2.18557e-016
	Radius          0.0833874
	InertiaMoment   0.399094

	Oblateness      0.0129107

	RotationPeriod  44.2287
	Obliquity       213.623
	EqAscendNode    90.2492

	AbsMagn         6.54075
	SlopeParam      7.87197
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.761 0.756 0.754)

	Surface
	{
		SurfStyle       0.856939
		OceanStyle      0.380626
		Randomize      (-0.780, -0.642, 0.630)
		colorDistMagn   0.943101
		colorDistFreq   3.02484e-006
		detailScale     2.27703
		colorConversion true
		snowLevel       2
		tropicLatitude  0.738983
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.692193
		terraceProb     0.222353
		erosion         0
		montesMagn      0.464742
		montesFreq      2.9615
		montesSpiky     0.981404
		montesFraction  0.468705
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.92122e-005
		hillsFraction   0.496614
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.21751
		craterFreq      0.20363
		craterDensity   0.830394
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.534243
		volcanoTemp     1545.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.259, 0.265, 0.302, 0.050)
		colorShelf     (0.304, 0.310, 0.347, 0.040)
		colorBeach     (0.350, 0.355, 0.392, 0.030)
		colorDesert    (0.396, 0.401, 0.445, 0.020)
		colorLowland   (0.441, 0.446, 0.490, 0.030)
		colorUpland    (0.487, 0.492, 0.535, 0.050)
		colorRock      (0.533, 0.537, 0.596, 0.020)
		colorSnow      (0.533, 0.537, 0.596, 1.000)
		BumpHeight      0.0750487
		BumpOffset      0.0150097
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.27665
		DustBright  0.529721
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   22.0113
		Period          97.1181
		Eccentricity    0.915777
		Inclination     -14.5148
		AscendingNode   -162.557
		ArgOfPericenter -148.824
		MeanAnomaly     -11.9847
	}
}

Comet	"Domir C14"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            1.69039e-012
	Radius          1.82593
	InertiaMoment   0.397621

	Oblateness      0.0189616

	RotationPeriod  42.4039
	Obliquity       166.829
	EqAscendNode    74.8266

	AbsMagn         -0.225254
	SlopeParam      2.61491
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.686 0.684 0.682)

	Surface
	{
		SurfStyle       0.748439
		OceanStyle      0.904471
		Randomize      (0.891, 0.929, 0.796)
		colorDistMagn   0.0580088
		colorDistFreq   0.00129242
		detailScale     49.8601
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997825
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.681846
		terraceProb     0.21659
		erosion         0
		montesMagn      0.305096
		montesFreq      2.97992
		montesSpiky     0.909494
		montesFraction  0.420654
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00611454
		hillsFraction   0.7938
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263024
		craterFreq      0.230462
		craterDensity   0.811468
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.43216
		volcanoTemp     1504.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.268, 0.233, 0.191, 0.000)
		colorShelf     (0.275, 0.239, 0.218, 0.000)
		colorBeach     (0.323, 0.281, 0.259, 0.000)
		colorDesert    (0.350, 0.301, 0.252, 0.000)
		colorLowland   (0.384, 0.322, 0.287, 0.000)
		colorUpland    (0.426, 0.390, 0.348, 0.000)
		colorRock      (0.460, 0.424, 0.375, 0.000)
		colorSnow      (0.501, 0.452, 0.396, 1.000)
		BumpHeight      1.64334
		BumpOffset      0.328667
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.409463
		GasToDust   0.25
		Particles   1806
		GasBright   0.197386
		DustBright  0.293471
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   20.6618
		Period          88.3255
		Eccentricity    0.933491
		Inclination     -84.7453
		AscendingNode   46.8819
		ArgOfPericenter -2.57925
		MeanAnomaly     -135.247
	}
}

Comet	"Domir C15"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            1.30739e-008
	Radius          32.5901
	InertiaMoment   0.399539

	Oblateness      0.0153426

	RotationPeriod  40.5647
	Obliquity       120.034
	EqAscendNode    59.404

	AbsMagn         9.81024
	SlopeParam      3.26366
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.746 0.744 0.743)

	Surface
	{
		SurfStyle       0.0870402
		OceanStyle      0.754656
		Randomize      (-0.574, -0.319, -0.666)
		colorDistMagn   0.599654
		colorDistFreq   0.453262
		detailScale     889.927
		colorConversion true
		snowLevel       2
		tropicLatitude  0.813812
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.676697
		terraceProb     0.100924
		erosion         0
		montesMagn      0.47631
		montesFreq      4.06867
		montesSpiky     0.990518
		montesFraction  0.522471
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.69439
		hillsFraction   0.833498
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241967
		craterFreq      0.225976
		craterDensity   0.889296
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.550691
		volcanoTemp     1685.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.298, 0.298, 0.297, 0.000)
		colorShelf     (0.317, 0.316, 0.316, 0.000)
		colorBeach     (0.336, 0.335, 0.334, 0.000)
		colorDesert    (0.354, 0.354, 0.353, 0.000)
		colorLowland   (0.373, 0.372, 0.372, 0.000)
		colorUpland    (0.392, 0.391, 0.390, 0.000)
		colorRock      (0.410, 0.409, 0.409, 0.000)
		colorSnow      (0.429, 0.428, 0.427, 1.000)
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
		MaxLength   0.890655
		GasToDust   0.25
		Particles   2779
		GasBright   0.4498
		DustBright  0.525543
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   27.3932
		Period          134.833
		Eccentricity    0.974739
		Inclination     173.569
		AscendingNode   -149.75
		ArgOfPericenter -169.385
		MeanAnomaly     103.808
	}
}

Comet	"Domir C16"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            4.02556e-016
	Radius          0.113014
	InertiaMoment   0.398321

	Oblateness      0.0227183

	RotationPeriod  38.7059
	Obliquity       73.2401
	EqAscendNode    43.9814

	AbsMagn         6.31534
	SlopeParam      3.84167
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.467 0.464 0.460)

	Surface
	{
		SurfStyle       0.69229
		OceanStyle      0.969418
		Randomize      (0.428, -0.494, -0.903)
		colorDistMagn   0.222591
		colorDistFreq   7.56374e-006
		detailScale     3.08603
		colorConversion true
		snowLevel       2
		tropicLatitude  0.863911
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.695424
		terraceProb     0.218194
		erosion         0
		montesMagn      0.437012
		montesFreq      2.63652
		montesSpiky     0.980497
		montesFraction  0.49738
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.8591e-005
		hillsFraction   0.370156
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220319
		craterFreq      0.248058
		craterDensity   0.92482
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.451113
		volcanoTemp     1723.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.182, 0.158, 0.129, 0.000)
		colorShelf     (0.187, 0.162, 0.147, 0.000)
		colorBeach     (0.219, 0.190, 0.175, 0.000)
		colorDesert    (0.238, 0.204, 0.170, 0.000)
		colorLowland   (0.261, 0.218, 0.193, 0.000)
		colorUpland    (0.289, 0.265, 0.235, 0.000)
		colorRock      (0.313, 0.288, 0.253, 0.000)
		colorSnow      (0.341, 0.306, 0.267, 1.000)
		BumpHeight      0.101712
		BumpOffset      0.0203425
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.0133394
		DustBright  0.646491
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   20.9992
		Period          90.4976
		Eccentricity    0.952244
		Inclination     62.9183
		AscendingNode   115.898
		ArgOfPericenter -30.3133
		MeanAnomaly     118.776
	}
}

Comet	"Domir C17"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            3.11348e-012
	Radius          2.01869
	InertiaMoment   0.399962

	Oblateness      0.0186117

	RotationPeriod  36.8219
	Obliquity       26.4458
	EqAscendNode    28.5588

	AbsMagn         17.5483
	SlopeParam      4.40648
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.793 0.790 0.789)

	Surface
	{
		SurfStyle       0.17138
		OceanStyle      0.391751
		Randomize      (0.925, 0.370, -0.715)
		colorDistMagn   0.789228
		colorDistFreq   0.00176183
		detailScale     55.1237
		colorConversion true
		snowLevel       2
		tropicLatitude  0.441889
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.723359
		terraceProb     0.254117
		erosion         0
		montesMagn      0.452803
		montesFreq      3.58008
		montesSpiky     0.999134
		montesFraction  0.258258
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00986601
		hillsFraction   0.682957
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.280866
		craterFreq      0.21702
		craterDensity   1.00345
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.488897
		volcanoTemp     1453.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.317, 0.316, 0.316, 0.000)
		colorShelf     (0.337, 0.336, 0.335, 0.000)
		colorBeach     (0.357, 0.356, 0.355, 0.000)
		colorDesert    (0.377, 0.375, 0.375, 0.000)
		colorLowland   (0.397, 0.395, 0.395, 0.000)
		colorUpland    (0.416, 0.415, 0.414, 0.000)
		colorRock      (0.436, 0.435, 0.434, 0.000)
		colorSnow      (0.456, 0.454, 0.454, 1.000)
		BumpHeight      1.81682
		BumpOffset      0.363364
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.442289
		GasToDust   0.25
		Particles   1873
		GasBright   0.0272911
		DustBright  0.317026
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   23.1129
		Period          104.5
		Eccentricity    0.92262
		Inclination     0.234081
		AscendingNode   -161.075
		ArgOfPericenter 148.114
		MeanAnomaly     -159.274
	}
}

Comet	"Domir C18"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            2.40805e-008
	Radius          44.1358
	InertiaMoment   0.398859

	Oblateness      0.0278693

	RotationPeriod  34.9068
	Obliquity       339.651
	EqAscendNode    13.1362

	AbsMagn         9.58195
	SlopeParam      5.00649
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.488 0.485 0.480)

	Surface
	{
		SurfStyle       0.170058
		OceanStyle      0.547789
		Randomize      (0.411, 0.564, 0.774)
		colorDistMagn   0.350796
		colorDistFreq   1.32144
		detailScale     1205.2
		colorConversion true
		snowLevel       2
		tropicLatitude  0.913699
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.500979
		terraceProb     0.141604
		erosion         0
		montesMagn      0.495497
		montesFreq      2.64745
		montesSpiky     0.942802
		montesFraction  0.715966
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.53042
		hillsFraction   0.639442
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232496
		craterFreq      0.234151
		craterDensity   0.949615
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.488649
		volcanoTemp     1628.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.195, 0.194, 0.192, 0.000)
		colorShelf     (0.208, 0.206, 0.204, 0.000)
		colorBeach     (0.220, 0.218, 0.216, 0.000)
		colorDesert    (0.232, 0.230, 0.228, 0.000)
		colorLowland   (0.244, 0.243, 0.240, 0.000)
		colorUpland    (0.256, 0.255, 0.252, 0.000)
		colorRock      (0.269, 0.267, 0.264, 0.000)
		colorSnow      (0.281, 0.279, 0.276, 1.000)
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
		MaxLength   0.923481
		GasToDust   0.25
		Particles   2845
		GasBright   0.114629
		DustBright  0.714174
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   19.6355
		Period          81.827
		Eccentricity    0.925889
		Inclination     58.282
		AscendingNode   -107.011
		ArgOfPericenter -173.813
		MeanAnomaly     61.437
	}
}

Comet	"Domir C19"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            7.41459e-016
	Radius          0.125041
	InertiaMoment   0.397133

	Oblateness      0.0229451

	RotationPeriod  32.9538
	Obliquity       292.857
	EqAscendNode    357.714

	AbsMagn         6.08445
	SlopeParam      5.71692
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.642 0.640 0.637)

	Surface
	{
		SurfStyle       0.917679
		OceanStyle      0.376613
		Randomize      (0.099, -0.634, 0.758)
		colorDistMagn   0.791121
		colorDistFreq   1.11336e-005
		detailScale     3.41446
		colorConversion true
		snowLevel       2
		tropicLatitude  0.991318
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.385708
		terraceProb     0.27408
		erosion         0
		montesMagn      0.550672
		montesFreq      3.33196
		montesSpiky     0.968794
		montesFraction  0.642602
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.64072e-005
		hillsFraction   0.523663
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243543
		craterFreq      0.258142
		craterDensity   0.961144
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.469899
		volcanoTemp     1501.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.218, 0.224, 0.255, 0.050)
		colorShelf     (0.257, 0.262, 0.293, 0.040)
		colorBeach     (0.295, 0.301, 0.331, 0.030)
		colorDesert    (0.334, 0.339, 0.376, 0.020)
		colorLowland   (0.372, 0.377, 0.414, 0.030)
		colorUpland    (0.411, 0.416, 0.452, 0.050)
		colorRock      (0.449, 0.454, 0.503, 0.020)
		colorSnow      (0.449, 0.454, 0.503, 1.000)
		BumpHeight      0.112537
		BumpOffset      0.0225074
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.101299
		DustBright  0.411991
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   24.8237
		Period          116.314
		Eccentricity    0.921019
		Inclination     96.4633
		AscendingNode   -95.5
		ArgOfPericenter -65.7403
		MeanAnomaly     19.3258
	}
}

Comet	"Domir C20"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            5.73465e-012
	Radius          2.7319
	InertiaMoment   0.399324

	Oblateness      0.0353514

	RotationPeriod  30.9555
	Obliquity       246.063
	EqAscendNode    342.291

	AbsMagn         15.5647
	SlopeParam      6.76717
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.765 0.644 0.573)

	Surface
	{
		SurfStyle       0.947635
		OceanStyle      0.690125
		Randomize      (-0.238, -0.787, -0.406)
		colorDistMagn   0.458766
		colorDistFreq   0.00275838
		detailScale     74.5991
		colorConversion true
		snowLevel       2
		tropicLatitude  0.941707
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.472269
		terraceProb     0.473376
		erosion         0
		montesMagn      0.576258
		montesFreq      3.23391
		montesSpiky     0.944428
		montesFraction  0.498742
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0181
		hillsFraction   0.479603
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.196028
		craterFreq      0.18943
		craterDensity   0.956672
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.487618
		volcanoTemp     1759.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.260, 0.225, 0.229, 0.050)
		colorShelf     (0.306, 0.264, 0.264, 0.040)
		colorBeach     (0.352, 0.303, 0.298, 0.030)
		colorDesert    (0.398, 0.341, 0.338, 0.020)
		colorLowland   (0.444, 0.380, 0.372, 0.030)
		colorUpland    (0.490, 0.419, 0.407, 0.050)
		colorRock      (0.536, 0.457, 0.453, 0.020)
		colorSnow      (0.536, 0.457, 0.453, 1.000)
		BumpHeight      2.45871
		BumpOffset      0.491742
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.475115
		GasToDust   0.25
		Particles   1939
		GasBright   0.255827
		DustBright  0.741949
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   8.35186
		Period          22.699
		Eccentricity    0.831554
		Inclination     -133.343
		AscendingNode   22.3188
		ArgOfPericenter 37.5887
		MeanAnomaly     86.1991
	}
}

Comet	"Domir C21"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            4.43533e-008
	Radius          48.8693
	InertiaMoment   0.398006

	Oblateness      0.0298632

	RotationPeriod  28.9033
	Obliquity       199.269
	EqAscendNode    326.868

	AbsMagn         9.35871
	SlopeParam      2.22563
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.808 0.770 0.752)

	Surface
	{
		SurfStyle       0.42548
		OceanStyle      0.926873
		Randomize      (0.728, 0.046, 0.369)
		colorDistMagn   0.316427
		colorDistFreq   1.92468
		detailScale     1334.46
		colorConversion true
		snowLevel       2
		tropicLatitude  0.946178
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.694543
		terraceProb     0.593283
		erosion         0
		montesMagn      0.429192
		montesFreq      3.55569
		montesSpiky     0.98849
		montesFraction  0.892977
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.02373
		hillsFraction   0.504492
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217649
		craterFreq      0.251648
		craterDensity   0.922924
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.521908
		volcanoTemp     1529
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.323, 0.308, 0.301, 0.000)
		colorShelf     (0.343, 0.327, 0.319, 0.000)
		colorBeach     (0.364, 0.346, 0.338, 0.000)
		colorDesert    (0.384, 0.366, 0.357, 0.000)
		colorLowland   (0.404, 0.385, 0.376, 0.000)
		colorUpland    (0.424, 0.404, 0.395, 0.000)
		colorRock      (0.445, 0.423, 0.413, 0.000)
		colorSnow      (0.465, 0.443, 0.432, 1.000)
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
		MaxLength   0.956307
		GasToDust   0.25
		Particles   2911
		GasBright   0.215215
		DustBright  0.467048
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   16.9538
		Period          65.6499
		Eccentricity    0.92906
		Inclination     89.7278
		AscendingNode   6.08864
		ArgOfPericenter 63.4113
		MeanAnomaly     -137.051
	}
}

Comet	"Domir C22"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            1.36567e-015
	Radius          0.169103
	InertiaMoment   0.399754

	Oblateness      0.0470929

	RotationPeriod  26.7869
	Obliquity       152.474
	EqAscendNode    311.446

	AbsMagn         5.84698
	SlopeParam      2.9487
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.745 0.641 0.579)

	Surface
	{
		SurfStyle       0.380669
		OceanStyle      0.707392
		Randomize      (-0.289, -0.045, 0.615)
		colorDistMagn   0.959856
		colorDistFreq   1.73132e-005
		detailScale     4.61763
		colorConversion true
		snowLevel       2
		tropicLatitude  0.34825
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.376982
		terraceProb     0.246548
		erosion         0
		montesMagn      0.302526
		montesFreq      2.86958
		montesSpiky     0.998192
		montesFraction  0.415913
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.33992e-005
		hillsFraction   0.743577
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.205658
		craterFreq      0.203716
		craterDensity   0.867631
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.499684
		volcanoTemp     1735.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.298, 0.256, 0.232, 0.000)
		colorShelf     (0.317, 0.272, 0.246, 0.000)
		colorBeach     (0.335, 0.288, 0.261, 0.000)
		colorDesert    (0.354, 0.304, 0.275, 0.000)
		colorLowland   (0.372, 0.320, 0.290, 0.000)
		colorUpland    (0.391, 0.336, 0.304, 0.000)
		colorRock      (0.410, 0.352, 0.318, 0.000)
		colorSnow      (0.428, 0.368, 0.333, 1.000)
		BumpHeight      0.152192
		BumpOffset      0.0304385
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.026749
		GasToDust   0.25
		Particles   1033
		GasBright   0.137343
		DustBright  0.229407
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   20.3982
		Period          86.6407
		Eccentricity    0.950646
		Inclination     -171.681
		AscendingNode   26.3268
		ArgOfPericenter -19.1324
		MeanAnomaly     82.3177
	}
}

Comet	"Domir C23"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            1.05625e-011
	Radius          3.02704
	InertiaMoment   0.398606

	Oblateness      0.0412509

	RotationPeriod  24.5946
	Obliquity       105.68
	EqAscendNode    296.023

	AbsMagn         14.5752
	SlopeParam      3.55336
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.754 0.753 0.751)

	Surface
	{
		SurfStyle       0.528877
		OceanStyle      0.288204
		Randomize      (-0.360, -0.556, -0.937)
		colorDistMagn   0.967589
		colorDistFreq   0.000749051
		detailScale     82.6583
		colorConversion true
		snowLevel       2
		tropicLatitude  0.949914
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.538356
		terraceProb     0.197376
		erosion         0
		montesMagn      0.673212
		montesFreq      2.99412
		montesSpiky     0.728301
		montesFraction  0.516121
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0308037
		hillsFraction   0.670418
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.205533
		craterFreq      0.258546
		craterDensity   1.0707
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.463738
		volcanoTemp     1662.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.294, 0.256, 0.210, 0.000)
		colorShelf     (0.302, 0.264, 0.240, 0.000)
		colorBeach     (0.354, 0.309, 0.286, 0.000)
		colorDesert    (0.385, 0.331, 0.278, 0.000)
		colorLowland   (0.422, 0.354, 0.316, 0.000)
		colorUpland    (0.467, 0.429, 0.383, 0.000)
		colorRock      (0.505, 0.467, 0.413, 0.000)
		colorSnow      (0.550, 0.497, 0.436, 1.000)
		BumpHeight      2.72433
		BumpOffset      0.544866
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.507941
		GasToDust   0.25
		Particles   2005
		GasBright   0.369039
		DustBright  0.482197
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   25.4762
		Period          120.93
		Eccentricity    0.962818
		Inclination     -28.4366
		AscendingNode   99.3971
		ArgOfPericenter -85.5979
		MeanAnomaly     -113.138
	}
}

Comet	"Domir C24"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            8.16932e-008
	Radius          66.0462
	InertiaMoment   0.396367

	Oblateness      0.0667529

	RotationPeriod  22.3118
	Obliquity       58.8857
	EqAscendNode    280.601

	AbsMagn         9.13962
	SlopeParam      4.11898
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.630 0.622 0.618)

	Surface
	{
		SurfStyle       0.0782896
		OceanStyle      0.208628
		Randomize      (0.044, 0.583, 0.657)
		colorDistMagn   0.293913
		colorDistFreq   3.7561
		detailScale     1803.5
		colorConversion true
		snowLevel       2
		tropicLatitude  0.435965
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.638004
		terraceProb     0.149816
		erosion         0
		montesMagn      0.556525
		montesFreq      3.4094
		montesSpiky     0.903618
		montesFraction  0.860467
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.44383
		hillsFraction   0.941074
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228825
		craterFreq      0.219265
		craterDensity   0.956903
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.538594
		volcanoTemp     1430.92
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.252, 0.249, 0.247, 0.000)
		colorShelf     (0.268, 0.264, 0.263, 0.000)
		colorBeach     (0.283, 0.280, 0.278, 0.000)
		colorDesert    (0.299, 0.295, 0.294, 0.000)
		colorLowland   (0.315, 0.311, 0.309, 0.000)
		colorUpland    (0.331, 0.326, 0.325, 0.000)
		colorRock      (0.346, 0.342, 0.340, 0.000)
		colorSnow      (0.362, 0.357, 0.356, 1.000)
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
		MaxLength   0.989133
		GasToDust   0.25
		Particles   2978
		GasBright   0.263886
		DustBright  0.271837
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   17.6621
		Period          69.8068
		Eccentricity    0.904902
		Inclination     57.3328
		AscendingNode   -149.509
		ArgOfPericenter 21.2654
		MeanAnomaly     -139.767
	}
}

Comet	"Domir C25"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            2.5154e-015
	Radius          0.187499
	InertiaMoment   0.3991

	Oblateness      0.062866

	RotationPeriod  19.9206
	Obliquity       12.0914
	EqAscendNode    265.178

	AbsMagn         5.60167
	SlopeParam      4.69449
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.604 0.595 0.592)

	Surface
	{
		SurfStyle       0.664063
		OceanStyle      0.0505278
		Randomize      (-0.180, -0.996, 0.171)
		colorDistMagn   0.556414
		colorDistFreq   1.36908e-005
		detailScale     5.11997
		colorConversion true
		snowLevel       2
		tropicLatitude  0.853118
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.483896
		terraceProb     0.445721
		erosion         0
		montesMagn      0.537006
		montesFreq      2.12911
		montesSpiky     0.918781
		montesFraction  0.103202
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.73983e-005
		hillsFraction   0.572705
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.202197
		craterFreq      0.253253
		craterDensity   0.859364
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.509355
		volcanoTemp     1866.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.235, 0.202, 0.166, 0.000)
		colorShelf     (0.241, 0.208, 0.190, 0.000)
		colorBeach     (0.284, 0.244, 0.225, 0.000)
		colorDesert    (0.308, 0.262, 0.219, 0.000)
		colorLowland   (0.338, 0.280, 0.249, 0.000)
		colorUpland    (0.374, 0.339, 0.302, 0.000)
		colorRock      (0.404, 0.369, 0.326, 0.000)
		colorSnow      (0.441, 0.393, 0.344, 1.000)
		BumpHeight      0.168749
		BumpOffset      0.0337498
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.059575
		GasToDust   0.25
		Particles   1100
		GasBright   0.011368
		DustBright  0.208842
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   21.3832
		Period          92.9909
		Eccentricity    0.924722
		Inclination     -132.351
		AscendingNode   27.7419
		ArgOfPericenter -86.256
		MeanAnomaly     39.9011
	}
}

Comet	"Domir C26"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            1.94548e-011
	Radius          4.08843
	InertiaMoment   0.397632

	Oblateness      0.109864

	RotationPeriod  17.3986
	Obliquity       325.297
	EqAscendNode    249.756

	AbsMagn         13.876
	SlopeParam      5.33562
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.779 0.705 0.677)

	Surface
	{
		SurfStyle       0.463032
		OceanStyle      0.218817
		Randomize      (-0.512, 0.292, 0.809)
		colorDistMagn   0.476036
		colorDistFreq   0.011983
		detailScale     111.641
		colorConversion true
		snowLevel       2
		tropicLatitude  0.746228
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.270734
		terraceProb     0.346389
		erosion         0
		montesMagn      0.573179
		montesFreq      2.73891
		montesSpiky     0.831028
		montesFraction  0.305896
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0380782
		hillsFraction   0.636616
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233955
		craterFreq      0.184073
		craterDensity   0.944149
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.472474
		volcanoTemp     1724.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.312, 0.282, 0.271, 0.000)
		colorShelf     (0.331, 0.300, 0.288, 0.000)
		colorBeach     (0.351, 0.317, 0.305, 0.000)
		colorDesert    (0.370, 0.335, 0.321, 0.000)
		colorLowland   (0.390, 0.352, 0.338, 0.000)
		colorUpland    (0.409, 0.370, 0.355, 0.000)
		colorRock      (0.429, 0.388, 0.372, 0.000)
		colorSnow      (0.448, 0.405, 0.389, 1.000)
		BumpHeight      3.67959
		BumpOffset      0.735918
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.540767
		GasToDust   0.25
		Particles   2072
		GasBright   0.077988
		DustBright  0.626708
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   15.0347
		Period          54.8245
		Eccentricity    0.957105
		Inclination     42.8851
		AscendingNode   80.5953
		ArgOfPericenter 16.7404
		MeanAnomaly     -130.542
	}
}

Comet	"Domir C27"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            1.50469e-007
	Radius          73.2789
	InertiaMoment   0.399544

	Oblateness      0.11514

	RotationPeriod  14.7166
	Obliquity       278.503
	EqAscendNode    234.333

	AbsMagn         8.92391
	SlopeParam      6.16018
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.495 0.418 0.363)

	Surface
	{
		SurfStyle       0.383988
		OceanStyle      0.212596
		Randomize      (-0.010, 0.606, 0.615)
		colorDistMagn   0.557432
		colorDistFreq   3.83874
		detailScale     2001
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997426
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.270906
		terraceProb     0.323472
		erosion         0
		montesMagn      0.443068
		montesFreq      3.04049
		montesSpiky     0.956989
		montesFraction  0.691768
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.187
		hillsFraction   0.760049
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252297
		craterFreq      0.273914
		craterDensity   1.04451
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.504203
		volcanoTemp     1390.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.198, 0.167, 0.145, 0.000)
		colorShelf     (0.210, 0.178, 0.154, 0.000)
		colorBeach     (0.223, 0.188, 0.163, 0.000)
		colorDesert    (0.235, 0.198, 0.172, 0.000)
		colorLowland   (0.247, 0.209, 0.181, 0.000)
		colorUpland    (0.260, 0.219, 0.190, 0.000)
		colorRock      (0.272, 0.230, 0.199, 0.000)
		colorSnow      (0.284, 0.240, 0.209, 1.000)
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
		GasBright   0.0660498
		DustBright  0.323133
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   18.7904
		Period          76.6014
		Eccentricity    0.928236
		Inclination     10.3838
		AscendingNode   -114.435
		ArgOfPericenter 141.33
		MeanAnomaly     -61.3925
	}
}

Comet	"Domir C28"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            4.63305e-015
	Radius          0.253091
	InertiaMoment   0.398329

	Oblateness      0.237102

	RotationPeriod  11.8359
	Obliquity       231.709
	EqAscendNode    218.91

	AbsMagn         5.34699
	SlopeParam      7.82288
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.786 0.782 0.780)

	Surface
	{
		SurfStyle       0.0268817
		OceanStyle      0.463516
		Randomize      (-0.394, -0.318, -0.352)
		colorDistMagn   0.46461
		colorDistFreq   4.72675e-005
		detailScale     6.91106
		colorConversion true
		snowLevel       2
		tropicLatitude  0.884067
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.259719
		terraceProb     0.154181
		erosion         0
		montesMagn      0.463261
		montesFreq      3.75253
		montesSpiky     0.97684
		montesFraction  0.301316
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00012478
		hillsFraction   0.584452
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.205897
		craterFreq      0.230422
		craterDensity   1.07686
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.543271
		volcanoTemp     1779.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.315, 0.313, 0.312, 0.000)
		colorShelf     (0.334, 0.333, 0.332, 0.000)
		colorBeach     (0.354, 0.352, 0.351, 0.000)
		colorDesert    (0.374, 0.372, 0.371, 0.000)
		colorLowland   (0.393, 0.391, 0.390, 0.000)
		colorUpland    (0.413, 0.411, 0.410, 0.000)
		colorRock      (0.433, 0.430, 0.429, 0.000)
		colorSnow      (0.452, 0.450, 0.449, 1.000)
		BumpHeight      0.227782
		BumpOffset      0.0455563
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.092401
		GasToDust   0.25
		Particles   1166
		GasBright   0.19986
		DustBright  0.673809
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   21.7343
		Period          95.291
		Eccentricity    0.929374
		Inclination     -106.891
		AscendingNode   112.493
		ArgOfPericenter 4.9216
		MeanAnomaly     48.9751
	}
}

Comet	"Domir C29"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            3.58333e-011
	Radius          4.53898
	InertiaMoment   0.399967

	Oblateness      0.249

	RotationPeriod  8.70265
	Obliquity       184.914
	EqAscendNode    203.488

	AbsMagn         13.3208
	SlopeParam      2.60508
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.711 0.706 0.703)

	Surface
	{
		SurfStyle       0.376203
		OceanStyle      0.0614596
		Randomize      (-0.714, -0.012, 0.060)
		colorDistMagn   0.384828
		colorDistFreq   0.00600127
		detailScale     123.944
		colorConversion true
		snowLevel       2
		tropicLatitude  0.192263
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.575731
		terraceProb     0.389821
		erosion         0
		montesMagn      0.437014
		montesFreq      3.77581
		montesSpiky     0.925907
		montesFraction  0.306747
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0480526
		hillsFraction   0.680181
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254676
		craterFreq      0.195693
		craterDensity   0.818283
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.486793
		volcanoTemp     1706.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.284, 0.282, 0.281, 0.000)
		colorShelf     (0.302, 0.300, 0.299, 0.000)
		colorBeach     (0.320, 0.317, 0.316, 0.000)
		colorDesert    (0.338, 0.335, 0.334, 0.000)
		colorLowland   (0.356, 0.353, 0.351, 0.000)
		colorUpland    (0.373, 0.370, 0.369, 0.000)
		colorRock      (0.391, 0.388, 0.387, 0.000)
		colorSnow      (0.409, 0.406, 0.404, 1.000)
		BumpHeight      4.08508
		BumpOffset      0.817016
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.573593
		GasToDust   0.25
		Particles   2138
		GasBright   0.16064
		DustBright  0.397516
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   31.1748
		Period          163.696
		Eccentricity    0.972112
		Inclination     -166.032
		AscendingNode   134.449
		ArgOfPericenter 38.6389
		MeanAnomaly     113.872
	}
}

Comet	"Domir C30"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            2.77145e-007
	Radius          98.8566
	InertiaMoment   0.398865

	Oblateness      0.249

	RotationPeriod  5.23943
	Obliquity       138.12
	EqAscendNode    188.065

	AbsMagn         8.71085
	SlopeParam      3.2554
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.489 0.483 0.480)

	Surface
	{
		SurfStyle       0.478872
		OceanStyle      0.548403
		Randomize      (-0.923, 0.928, -0.334)
		colorDistMagn   0.77525
		colorDistFreq   4.21386
		detailScale     2699.44
		colorConversion true
		snowLevel       2
		tropicLatitude  0.847925
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.445137
		terraceProb     0.220179
		erosion         0
		montesMagn      0.694611
		montesFreq      2.85088
		montesSpiky     0.98845
		montesFraction  0.635477
		dunesFraction   0
		hillsMagn       0
		hillsFreq       17.9212
		hillsFraction   0.481207
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25919
		craterFreq      0.343401
		craterDensity   0.809984
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.462981
		volcanoTemp     1255.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.195, 0.193, 0.192, 0.000)
		colorShelf     (0.208, 0.205, 0.204, 0.000)
		colorBeach     (0.220, 0.217, 0.216, 0.000)
		colorDesert    (0.232, 0.229, 0.228, 0.000)
		colorLowland   (0.244, 0.242, 0.240, 0.000)
		colorUpland    (0.256, 0.254, 0.252, 0.000)
		colorRock      (0.269, 0.266, 0.264, 0.000)
		colorSnow      (0.281, 0.278, 0.276, 1.000)
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
		GasBright   0.0841605
		DustBright  0.158482
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   12.6885
		Period          42.5058
		Eccentricity    0.939364
		Inclination     -18.5848
		AscendingNode   34.3764
		ArgOfPericenter -167.439
		MeanAnomaly     50.1183
	}
}

Comet	"Domir C31"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            8.53348e-015
	Radius          0.281149
	InertiaMoment   0.397148

	Oblateness      0.00125259

	RotationPeriod  140.172
	Obliquity       91.3256
	EqAscendNode    172.643

	AbsMagn         5.08105
	SlopeParam      3.83393
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.653 0.650 0.644)

	Surface
	{
		SurfStyle       0.012834
		OceanStyle      0.680439
		Randomize      (0.936, 0.116, 0.897)
		colorDistMagn   0.384152
		colorDistFreq   5.61451e-005
		detailScale     7.67724
		colorConversion true
		snowLevel       2
		tropicLatitude  0.925202
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.581604
		terraceProb     0.333566
		erosion         0
		montesMagn      0.594448
		montesFreq      1.99461
		montesSpiky     0.942152
		montesFraction  0.528241
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000236934
		hillsFraction   0.584445
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217863
		craterFreq      0.202261
		craterDensity   0.860977
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.498922
		volcanoTemp     1365.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.261, 0.260, 0.258, 0.000)
		colorShelf     (0.278, 0.276, 0.274, 0.000)
		colorBeach     (0.294, 0.292, 0.290, 0.000)
		colorDesert    (0.310, 0.309, 0.306, 0.000)
		colorLowland   (0.327, 0.325, 0.322, 0.000)
		colorUpland    (0.343, 0.341, 0.338, 0.000)
		colorRock      (0.359, 0.357, 0.354, 0.000)
		colorSnow      (0.376, 0.374, 0.371, 1.000)
		BumpHeight      0.253034
		BumpOffset      0.0506068
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.125227
		GasToDust   0.25
		Particles   1232
		GasBright   0.295138
		DustBright  0.431991
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   24.0366
		Period          110.826
		Eccentricity    0.927412
		Inclination     151.978
		AscendingNode   31.634
		ArgOfPericenter -60.565
		MeanAnomaly     -49.9275
	}
}

Comet	"Domir C32"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            6.60003e-011
	Radius          6.1199
	InertiaMoment   0.399329

	Oblateness      0.00236086

	RotationPeriod  118.389
	Obliquity       44.5313
	EqAscendNode    157.22

	AbsMagn         12.8527
	SlopeParam      4.39861
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.759 0.692 0.622)

	Surface
	{
		SurfStyle       0.632998
		OceanStyle      0.755046
		Randomize      (0.180, -0.246, 0.817)
		colorDistMagn   0.499858
		colorDistFreq   0.0173781
		detailScale     167.114
		colorConversion true
		snowLevel       2
		tropicLatitude  0.948633
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.6888
		terraceProb     0.372345
		erosion         0
		montesMagn      0.505435
		montesFreq      3.40342
		montesSpiky     0.915202
		montesFraction  0.681463
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0741651
		hillsFraction   0.663673
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.206425
		craterFreq      0.273215
		craterDensity   0.900016
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.557424
		volcanoTemp     1486.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.296, 0.235, 0.174, 0.000)
		colorShelf     (0.304, 0.242, 0.199, 0.000)
		colorBeach     (0.357, 0.284, 0.237, 0.000)
		colorDesert    (0.387, 0.304, 0.230, 0.000)
		colorLowland   (0.425, 0.325, 0.261, 0.000)
		colorUpland    (0.471, 0.394, 0.317, 0.000)
		colorRock      (0.509, 0.429, 0.342, 0.000)
		colorSnow      (0.554, 0.456, 0.361, 1.000)
		BumpHeight      5.50791
		BumpOffset      1.10158
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.606419
		GasToDust   0.25
		Particles   2204
		GasBright   0.191377
		DustBright  0.220239
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   20.9582
		Period          90.2327
		Eccentricity    0.914145
		Inclination     75.316
		AscendingNode   101.537
		ArgOfPericenter -112.511
		MeanAnomaly     111.971
	}
}

Comet	"Domir C33"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            5.10465e-007
	Radius          109.879
	InertiaMoment   0.398015

	Oblateness      0.00207728

	RotationPeriod  108.911
	Obliquity       357.737
	EqAscendNode    141.797

	AbsMagn         8.49979
	SlopeParam      4.99774
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.817 0.780 0.726)

	Surface
	{
		SurfStyle       0.236005
		OceanStyle      0.466563
		Randomize      (-0.374, -0.484, -0.895)
		colorDistMagn   0.518116
		colorDistFreq   3.9483
		detailScale     3000.42
		colorConversion true
		snowLevel       2
		tropicLatitude  0.657336
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.402982
		terraceProb     0.251292
		erosion         0
		montesMagn      0.345455
		montesFreq      2.80736
		montesSpiky     0.807747
		montesFraction  0.506796
		dunesFraction   0
		hillsMagn       0
		hillsFreq       38.659
		hillsFraction   0.750371
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241612
		craterFreq      0.379548
		craterDensity   0.929333
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.501467
		volcanoTemp     1716.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.327, 0.312, 0.290, 0.000)
		colorShelf     (0.347, 0.331, 0.308, 0.000)
		colorBeach     (0.368, 0.351, 0.327, 0.000)
		colorDesert    (0.388, 0.370, 0.345, 0.000)
		colorLowland   (0.409, 0.390, 0.363, 0.000)
		colorUpland    (0.429, 0.409, 0.381, 0.000)
		colorRock      (0.449, 0.429, 0.399, 0.000)
		colorSnow      (0.470, 0.448, 0.417, 1.000)
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
		GasBright   0.0214937
		DustBright  0.874609
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   21.9648
		Period          96.8111
		Eccentricity    0.917447
		Inclination     137.446
		AscendingNode   131.032
		ArgOfPericenter 102.975
		MeanAnomaly     -123.281
	}
}

Comet	"Domir C34"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            1.57176e-014
	Radius          0.378873
	InertiaMoment   0.39976

	Oblateness      0.00314908

	RotationPeriod  102.402
	Obliquity       310.943
	EqAscendNode    126.375

	AbsMagn         4.80155
	SlopeParam      5.70579
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.585 0.582 0.580)

	Surface
	{
		SurfStyle       0.608826
		OceanStyle      0.081439
		Randomize      (0.861, -0.202, 0.208)
		colorDistMagn   0.288371
		colorDistFreq   7.5321e-005
		detailScale     10.3457
		colorConversion true
		snowLevel       2
		tropicLatitude  0.925223
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.53405
		terraceProb     0.219622
		erosion         0
		montesMagn      0.513077
		montesFreq      3.55732
		montesSpiky     0.744764
		montesFraction  0.553446
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000237134
		hillsFraction   0.546122
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.216212
		craterFreq      0.274225
		craterDensity   0.89336
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.479956
		volcanoTemp     1478.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.228, 0.198, 0.162, 0.000)
		colorShelf     (0.234, 0.204, 0.186, 0.000)
		colorBeach     (0.275, 0.239, 0.220, 0.000)
		colorDesert    (0.298, 0.256, 0.215, 0.000)
		colorLowland   (0.327, 0.273, 0.244, 0.000)
		colorUpland    (0.363, 0.332, 0.296, 0.000)
		colorRock      (0.392, 0.361, 0.319, 0.000)
		colorSnow      (0.427, 0.384, 0.336, 1.000)
		BumpHeight      0.340985
		BumpOffset      0.0681971
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.158053
		GasToDust   0.25
		Particles   1299
		GasBright   0.0482069
		DustBright  0.532382
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   27.6628
		Period          136.829
		Eccentricity    0.976057
		Inclination     107.757
		AscendingNode   -36.365
		ArgOfPericenter 53.0623
		MeanAnomaly     69.2514
	}
}

Comet	"Domir C35"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            1.21565e-010
	Radius          6.80597
	InertiaMoment   0.398613

	Oblateness      0.00260291

	RotationPeriod  97.3017
	Obliquity       264.148
	EqAscendNode    110.952

	AbsMagn         12.4429
	SlopeParam      6.74721
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.673 0.668 0.664)

	Surface
	{
		SurfStyle       0.520561
		OceanStyle      0.738668
		Randomize      (-0.045, -0.763, -0.265)
		colorDistMagn   0.815514
		colorDistFreq   0.0269756
		detailScale     185.848
		colorConversion true
		snowLevel       2
		tropicLatitude  0.596345
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.610378
		terraceProb     0.561436
		erosion         0
		montesMagn      0.563242
		montesFreq      2.67271
		montesSpiky     0.952768
		montesFraction  0.431439
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.146514
		hillsFraction   0.594417
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.271919
		craterFreq      0.205457
		craterDensity   0.780691
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.481337
		volcanoTemp     1221.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.262, 0.227, 0.186, 0.000)
		colorShelf     (0.269, 0.234, 0.212, 0.000)
		colorBeach     (0.316, 0.274, 0.252, 0.000)
		colorDesert    (0.343, 0.294, 0.246, 0.000)
		colorLowland   (0.377, 0.314, 0.279, 0.000)
		colorUpland    (0.417, 0.381, 0.338, 0.000)
		colorRock      (0.451, 0.414, 0.365, 0.000)
		colorSnow      (0.491, 0.441, 0.385, 1.000)
		BumpHeight      6.12537
		BumpOffset      1.22507
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.639245
		GasToDust   0.25
		Particles   2271
		GasBright   0.0376609
		DustBright  0.227414
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   23.3398
		Period          106.042
		Eccentricity    0.970773
		Inclination     -94.5616
		AscendingNode   -143.256
		ArgOfPericenter 129.708
		MeanAnomaly     -107.412
	}
}

Comet	"Domir C36"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            3.74306e-018
	Radius          0.0234558
	InertiaMoment   0.396394

	Oblateness      0.00375366

	RotationPeriod  93.0352
	Obliquity       217.354
	EqAscendNode    95.5296

	AbsMagn         8.29011
	SlopeParam      2.21416
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.642 0.636 0.632)

	Surface
	{
		SurfStyle       0.02363
		OceanStyle      0.0396368
		Randomize      (-0.025, 0.043, 0.885)
		colorDistMagn   0.440456
		colorDistFreq   1.50161e-007
		detailScale     0.6405
		colorConversion true
		snowLevel       2
		tropicLatitude  0.58358
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.358738
		terraceProb     0.292756
		erosion         0
		montesMagn      0.607659
		montesFreq      3.56069
		montesSpiky     0.915649
		montesFraction  0.329974
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.29648e-006
		hillsFraction   0.72903
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241327
		craterFreq      0.179771
		craterDensity   0.906408
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51689
		volcanoTemp     1403.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.257, 0.254, 0.253, 0.000)
		colorShelf     (0.273, 0.270, 0.269, 0.000)
		colorBeach     (0.289, 0.286, 0.284, 0.000)
		colorDesert    (0.305, 0.302, 0.300, 0.000)
		colorLowland   (0.321, 0.318, 0.316, 0.000)
		colorUpland    (0.337, 0.334, 0.332, 0.000)
		colorRock      (0.353, 0.350, 0.348, 0.000)
		colorSnow      (0.369, 0.365, 0.364, 1.000)
		BumpHeight      0.0211102
		BumpOffset      0.00422205
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.150753
		DustBright  0.598809
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   11.7992
		Period          38.1164
		Eccentricity    0.914131
		Inclination     70.9453
		AscendingNode   164.465
		ArgOfPericenter 125.124
		MeanAnomaly     92.7084
	}
}

Comet	"Domir C37"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            2.89499e-014
	Radius          0.421566
	InertiaMoment   0.399106

	Oblateness      0.00308798

	RotationPeriod  89.3218
	Obliquity       170.56
	EqAscendNode    80.107

	AbsMagn         4.50547
	SlopeParam      2.93983
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.829 0.775 0.718)

	Surface
	{
		SurfStyle       0.820928
		OceanStyle      0.162828
		Randomize      (-0.228, 0.156, -0.156)
		colorDistMagn   0.902315
		colorDistFreq   7.24964e-005
		detailScale     11.5116
		colorConversion true
		snowLevel       2
		tropicLatitude  0.903042
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.612462
		terraceProb     0.416892
		erosion         0
		montesMagn      0.353087
		montesFreq      3.06744
		montesSpiky     0.936136
		montesFraction  0.346834
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000493929
		hillsFraction   0.603858
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24807
		craterFreq      0.232527
		craterDensity   0.755978
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.42914
		volcanoTemp     1876.33
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.323, 0.263, 0.201, 0.000)
		colorShelf     (0.332, 0.271, 0.230, 0.000)
		colorBeach     (0.390, 0.318, 0.273, 0.000)
		colorDesert    (0.423, 0.341, 0.266, 0.000)
		colorLowland   (0.464, 0.364, 0.302, 0.000)
		colorUpland    (0.514, 0.442, 0.366, 0.000)
		colorRock      (0.556, 0.480, 0.395, 0.000)
		colorSnow      (0.605, 0.511, 0.417, 1.000)
		BumpHeight      0.379409
		BumpOffset      0.0758818
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.190879
		GasToDust   0.25
		Particles   1365
		GasBright   0.112925
		DustBright  0.321124
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   25.2563
		Period          119.368
		Eccentricity    0.937284
		Inclination     58.1326
		AscendingNode   -130.928
		ArgOfPericenter -160.519
		MeanAnomaly     -177.629
	}
}

Comet	"Domir C38"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            2.23906e-010
	Radius          9.16255
	InertiaMoment   0.397642

	Oblateness      0.00439759

	RotationPeriod  86.0027
	Obliquity       123.766
	EqAscendNode    64.6844

	AbsMagn         12.0752
	SlopeParam      3.54544
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.551 0.504 0.412)

	Surface
	{
		SurfStyle       0.15666
		OceanStyle      0.145661
		Randomize      (-0.644, -0.202, -0.422)
		colorDistMagn   0.789482
		colorDistFreq   0.0360677
		detailScale     250.199
		colorConversion true
		snowLevel       2
		tropicLatitude  0.425477
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.578834
		terraceProb     0.207117
		erosion         0
		montesMagn      0.415622
		montesFreq      2.64604
		montesSpiky     0.968845
		montesFraction  0.428564
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.159526
		hillsFraction   0.664328
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.199847
		craterFreq      0.183102
		craterDensity   0.826721
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.483965
		volcanoTemp     1486.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.220, 0.201, 0.165, 0.000)
		colorShelf     (0.234, 0.214, 0.175, 0.000)
		colorBeach     (0.248, 0.227, 0.185, 0.000)
		colorDesert    (0.262, 0.239, 0.196, 0.000)
		colorLowland   (0.276, 0.252, 0.206, 0.000)
		colorUpland    (0.289, 0.264, 0.216, 0.000)
		colorRock      (0.303, 0.277, 0.226, 0.000)
		colorSnow      (0.317, 0.290, 0.237, 1.000)
		BumpHeight      8.2463
		BumpOffset      1.64926
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.672071
		GasToDust   0.25
		Particles   2337
		GasBright   0.293207
		DustBright  0.625328
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   19.3659
		Period          80.1471
		Eccentricity    0.945175
		Inclination     112.674
		AscendingNode   154.219
		ArgOfPericenter -108.548
		MeanAnomaly     -77.9927
	}
}

Comet	"Domir C39"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            6.89423e-018
	Radius          0.0261119
	InertiaMoment   0.39955

	Oblateness      0.00357652

	RotationPeriod  82.9787
	Obliquity       76.9713
	EqAscendNode    49.2618

	AbsMagn         8.08122
	SlopeParam      4.11125
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.682 0.677 0.674)

	Surface
	{
		SurfStyle       0.363086
		OceanStyle      0.625126
		Randomize      (0.835, -0.261, -0.415)
		colorDistMagn   0.371436
		colorDistFreq   4.17547e-007
		detailScale     0.71303
		colorConversion true
		snowLevel       2
		tropicLatitude  0.991614
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.427101
		terraceProb     0.319526
		erosion         0
		montesMagn      0.518602
		montesFreq      2.57183
		montesSpiky     0.887642
		montesFraction  0.538174
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.85295e-006
		hillsFraction   0.485783
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236308
		craterFreq      0.203152
		craterDensity   0.843584
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.513955
		volcanoTemp     1230.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.273, 0.271, 0.270, 0.000)
		colorShelf     (0.290, 0.288, 0.287, 0.000)
		colorBeach     (0.307, 0.305, 0.303, 0.000)
		colorDesert    (0.324, 0.322, 0.320, 0.000)
		colorLowland   (0.341, 0.338, 0.337, 0.000)
		colorUpland    (0.358, 0.355, 0.354, 0.000)
		colorRock      (0.375, 0.372, 0.371, 0.000)
		colorSnow      (0.392, 0.389, 0.388, 1.000)
		BumpHeight      0.0235007
		BumpOffset      0.00470015
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.228097
		DustBright  0.374924
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   16.518
		Period          63.1349
		Eccentricity    0.912431
		Inclination     -7.6036
		AscendingNode   -136.96
		ArgOfPericenter 172.242
		MeanAnomaly     -134.193
	}
}

Comet	"Domir C40"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            5.3322e-014
	Radius          0.56727
	InertiaMoment   0.398336

	Oblateness      0.00505455

	RotationPeriod  80.1833
	Obliquity       30.177
	EqAscendNode    33.8392

	AbsMagn         4.18888
	SlopeParam      4.6863
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.683 0.679 0.674)

	Surface
	{
		SurfStyle       0.875683
		OceanStyle      0.0612791
		Randomize      (0.415, 0.962, 0.223)
		colorDistMagn   0.824231
		colorDistFreq   4.06417e-005
		detailScale     15.4903
		colorConversion true
		snowLevel       2
		tropicLatitude  0.588574
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.343007
		terraceProb     0.377614
		erosion         0
		montesMagn      0.524173
		montesFreq      2.15642
		montesSpiky     0.83992
		montesFraction  0.495298
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000913118
		hillsFraction   0.502374
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259951
		craterFreq      0.256374
		craterDensity   0.862933
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.432381
		volcanoTemp     1558.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.232, 0.238, 0.270, 0.050)
		colorShelf     (0.273, 0.278, 0.310, 0.040)
		colorBeach     (0.314, 0.319, 0.351, 0.030)
		colorDesert    (0.355, 0.360, 0.398, 0.020)
		colorLowland   (0.396, 0.401, 0.438, 0.030)
		colorUpland    (0.437, 0.441, 0.479, 0.050)
		colorRock      (0.478, 0.482, 0.533, 0.020)
		colorSnow      (0.478, 0.482, 0.533, 1.000)
		BumpHeight      0.510543
		BumpOffset      0.102109
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.223705
		GasToDust   0.25
		Particles   1431
		GasBright   0.125728
		DustBright  0.16178
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   23.0138
		Period          103.828
		Eccentricity    0.936738
		Inclination     115.154
		AscendingNode   14.2546
		ArgOfPericenter -46.2873
		MeanAnomaly     -168.877
	}
}

Comet	"Domir C41"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            4.12407e-010
	Radius          10.205
	InertiaMoment   0.399972

	Oblateness      0.00409049

	RotationPeriod  77.5697
	Obliquity       343.383
	EqAscendNode    18.4167

	AbsMagn         11.739
	SlopeParam      5.32599
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.613 0.609 0.603)

	Surface
	{
		SurfStyle       0.948273
		OceanStyle      0.155416
		Randomize      (-0.212, -0.541, -0.390)
		colorDistMagn   0.00904769
		colorDistFreq   0.0358666
		detailScale     278.664
		colorConversion true
		snowLevel       2
		tropicLatitude  0.302737
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.409264
		terraceProb     0.398157
		erosion         0
		montesMagn      0.555591
		montesFreq      3.00474
		montesSpiky     0.901369
		montesFraction  0.215073
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.237138
		hillsFraction   0.659138
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.265737
		craterFreq      0.197385
		craterDensity   1.01745
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.538657
		volcanoTemp     1581.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.208, 0.213, 0.241, 0.050)
		colorShelf     (0.245, 0.250, 0.278, 0.040)
		colorBeach     (0.282, 0.286, 0.314, 0.030)
		colorDesert    (0.319, 0.323, 0.356, 0.020)
		colorLowland   (0.355, 0.359, 0.392, 0.030)
		colorUpland    (0.392, 0.396, 0.428, 0.050)
		colorRock      (0.429, 0.432, 0.477, 0.020)
		colorSnow      (0.429, 0.432, 0.477, 1.000)
		BumpHeight      9.18447
		BumpOffset      1.83689
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.704897
		GasToDust   0.25
		Particles   2403
		GasBright   0.383178
		DustBright  0.388817
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   25.0216
		Period          117.708
		Eccentricity    0.933116
		Inclination     9.86573
		AscendingNode   79.406
		ArgOfPericenter 151.24
		MeanAnomaly     -0.672125
	}
}

Comet	"Domir C42"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            1.26983e-017
	Radius          0.0351214
	InertiaMoment   0.398871

	Oblateness      0.00575317

	RotationPeriod  75.1034
	Obliquity       296.588
	EqAscendNode    2.99406

	AbsMagn         7.87256
	SlopeParam      6.14641
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.562 0.555 0.551)

	Surface
	{
		SurfStyle       0.24586
		OceanStyle      0.535727
		Randomize      (0.027, 0.543, -0.749)
		colorDistMagn   0.742356
		colorDistFreq   2.10479e-007
		detailScale     0.959049
		colorConversion true
		snowLevel       2
		tropicLatitude  0.967312
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.455134
		terraceProb     0.103519
		erosion         0
		montesMagn      0.616166
		montesFreq      3.18029
		montesSpiky     0.974009
		montesFraction  0.355316
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.44844e-006
		hillsFraction   0.708992
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253666
		craterFreq      0.254585
		craterDensity   1.05845
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.517514
		volcanoTemp     1622.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.225, 0.222, 0.220, 0.000)
		colorShelf     (0.239, 0.236, 0.234, 0.000)
		colorBeach     (0.253, 0.250, 0.248, 0.000)
		colorDesert    (0.267, 0.264, 0.262, 0.000)
		colorLowland   (0.281, 0.278, 0.276, 0.000)
		colorUpland    (0.295, 0.291, 0.289, 0.000)
		colorRock      (0.309, 0.305, 0.303, 0.000)
		colorSnow      (0.323, 0.319, 0.317, 1.000)
		BumpHeight      0.0316093
		BumpOffset      0.00632185
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.0252859
		DustBright  0.431196
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   23.8844
		Period          109.775
		Eccentricity    0.941177
		Inclination     -163.659
		AscendingNode   134.359
		ArgOfPericenter 51.9156
		MeanAnomaly     86.2308
	}
}

Comet	"Domir C43"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            9.82125e-014
	Radius          0.632096
	InertiaMoment   0.397162

	Oblateness      0.00459085

	RotationPeriod  72.7583
	Obliquity       249.794
	EqAscendNode    347.571

	AbsMagn         3.84641
	SlopeParam      7.776
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.530 0.527 0.523)

	Surface
	{
		SurfStyle       0.654778
		OceanStyle      0.862128
		Randomize      (-0.522, 0.764, -0.497)
		colorDistMagn   0.474193
		colorDistFreq   0.000191098
		detailScale     17.2604
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999969
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.643655
		terraceProb     0.141326
		erosion         0
		montesMagn      0.459467
		montesFreq      2.87593
		montesSpiky     0.821202
		montesFraction  0.729416
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00066625
		hillsFraction   0.736849
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258626
		craterFreq      0.170436
		craterDensity   0.92254
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.441352
		volcanoTemp     1661.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.207, 0.179, 0.147, 0.000)
		colorShelf     (0.212, 0.185, 0.168, 0.000)
		colorBeach     (0.249, 0.216, 0.199, 0.000)
		colorDesert    (0.270, 0.232, 0.194, 0.000)
		colorLowland   (0.297, 0.248, 0.220, 0.000)
		colorUpland    (0.328, 0.301, 0.267, 0.000)
		colorRock      (0.355, 0.327, 0.288, 0.000)
		colorSnow      (0.387, 0.348, 0.304, 1.000)
		BumpHeight      0.568887
		BumpOffset      0.113777
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.256531
		GasToDust   0.25
		Particles   1498
		GasBright   0.107683
		DustBright  0.833285
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   12.2623
		Period          40.3825
		Eccentricity    0.93
		Inclination     29.5226
		AscendingNode   48.178
		ArgOfPericenter -11.2679
		MeanAnomaly     30.1993
	}
}

Comet	"Domir C44"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            7.59604e-010
	Radius          13.7202
	InertiaMoment   0.399335

	Oblateness      0.00651573

	RotationPeriod  70.5137
	Obliquity       203
	EqAscendNode    332.149

	AbsMagn         11.4274
	SlopeParam      2.59523
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.531 0.379 0.323)

	Surface
	{
		SurfStyle       0.503685
		OceanStyle      0.710482
		Randomize      (0.788, -0.721, -0.839)
		colorDistMagn   0.662692
		colorDistFreq   0.10849
		detailScale     374.654
		colorConversion true
		snowLevel       2
		tropicLatitude  0.505027
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.499963
		terraceProb     0.449165
		erosion         0
		montesMagn      0.561123
		montesFreq      3.99509
		montesSpiky     0.866069
		montesFraction  0.281237
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.339999
		hillsFraction   0.587426
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218827
		craterFreq      0.23454
		craterDensity   0.7739
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.474712
		volcanoTemp     1850.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.207, 0.129, 0.090, 0.000)
		colorShelf     (0.213, 0.133, 0.103, 0.000)
		colorBeach     (0.250, 0.155, 0.123, 0.000)
		colorDesert    (0.271, 0.167, 0.120, 0.000)
		colorLowland   (0.298, 0.178, 0.136, 0.000)
		colorUpland    (0.329, 0.216, 0.165, 0.000)
		colorRock      (0.356, 0.235, 0.178, 0.000)
		colorSnow      (0.388, 0.250, 0.187, 1.000)
		BumpHeight      12.3482
		BumpOffset      2.46964
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.737723
		GasToDust   0.25
		Particles   2470
		GasBright   0.108506
		DustBright  0.516948
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   21.1616
		Period          91.5493
		Eccentricity    0.9306
		Inclination     -26.2366
		AscendingNode   -77.4847
		ArgOfPericenter -68.6348
		MeanAnomaly     -23.9049
	}
}

Comet	"Domir C45"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            2.33888e-017
	Radius          0.039152
	InertiaMoment   0.398023

	Oblateness      0.00520724

	RotationPeriod  68.3536
	Obliquity       156.205
	EqAscendNode    316.726

	AbsMagn         7.66355
	SlopeParam      3.24712
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.641 0.637 0.630)

	Surface
	{
		SurfStyle       0.520458
		OceanStyle      0.389999
		Randomize      (-0.121, 0.082, 0.316)
		colorDistMagn   0.0778977
		colorDistFreq   7.93685e-007
		detailScale     1.06911
		colorConversion true
		snowLevel       2
		tropicLatitude  0.975797
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.599244
		terraceProb     0.204275
		erosion         0
		montesMagn      0.631869
		montesFreq      2.50772
		montesSpiky     0.848933
		montesFraction  0.490348
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.07628e-006
		hillsFraction   0.495993
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250019
		craterFreq      0.264821
		craterDensity   0.932859
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.459198
		volcanoTemp     1528.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.250, 0.217, 0.176, 0.000)
		colorShelf     (0.256, 0.223, 0.202, 0.000)
		colorBeach     (0.301, 0.261, 0.239, 0.000)
		colorDesert    (0.327, 0.280, 0.233, 0.000)
		colorLowland   (0.359, 0.299, 0.265, 0.000)
		colorUpland    (0.397, 0.363, 0.321, 0.000)
		colorRock      (0.429, 0.395, 0.347, 0.000)
		colorSnow      (0.468, 0.420, 0.366, 1.000)
		BumpHeight      0.0352368
		BumpOffset      0.00704735
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.0720702
		DustBright  0.237871
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   20.9502
		Period          90.1811
		Eccentricity    0.92082
		Inclination     -57.2268
		AscendingNode   -35.3696
		ArgOfPericenter -105.816
		MeanAnomaly     -56.8412
	}
}

Comet	"Domir C46"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            1.80895e-013
	Radius          0.849489
	InertiaMoment   0.399765

	Oblateness      0.00736547

	RotationPeriod  66.2643
	Obliquity       109.411
	EqAscendNode    301.304

	AbsMagn         3.47042
	SlopeParam      3.82618
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.488 0.407 0.352)

	Surface
	{
		SurfStyle       0.286737
		OceanStyle      0.554297
		Randomize      (-0.648, -0.612, 0.816)
		colorDistMagn   0.953368
		colorDistFreq   0.000108925
		detailScale     23.1967
		colorConversion true
		snowLevel       2
		tropicLatitude  0.978613
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.437746
		terraceProb     0.27947
		erosion         0
		montesMagn      0.582492
		montesFreq      3.15456
		montesSpiky     0.863457
		montesFraction  0.538966
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00123333
		hillsFraction   0.685133
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.211849
		craterFreq      0.194019
		craterDensity   1.0722
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51769
		volcanoTemp     1382.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.195, 0.163, 0.141, 0.000)
		colorShelf     (0.207, 0.173, 0.149, 0.000)
		colorBeach     (0.219, 0.183, 0.158, 0.000)
		colorDesert    (0.232, 0.193, 0.167, 0.000)
		colorLowland   (0.244, 0.204, 0.176, 0.000)
		colorUpland    (0.256, 0.214, 0.185, 0.000)
		colorRock      (0.268, 0.224, 0.193, 0.000)
		colorSnow      (0.280, 0.234, 0.202, 1.000)
		BumpHeight      0.76454
		BumpOffset      0.152908
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.289356
		GasToDust   0.25
		Particles   1564
		GasBright   0.231634
		DustBright  0.562793
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   18.9454
		Period          77.5514
		Eccentricity    0.908889
		Inclination     -169.15
		AscendingNode   -132.832
		ArgOfPericenter -127.885
		MeanAnomaly     14.9622
	}
}

Comet	"Domir C47"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            1.39909e-009
	Radius          15.3011
	InertiaMoment   0.398619

	Oblateness      0.00589692

	RotationPeriod  64.2349
	Obliquity       62.6169
	EqAscendNode    285.881

	AbsMagn         11.1352
	SlopeParam      4.39074
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.635 0.631 0.627)

	Surface
	{
		SurfStyle       0.523986
		OceanStyle      0.472099
		Randomize      (-0.212, -0.156, -0.024)
		colorDistMagn   0.446447
		colorDistFreq   0.145881
		detailScale     417.821
		colorConversion true
		snowLevel       2
		tropicLatitude  0.810192
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.582343
		terraceProb     0.289171
		erosion         0
		montesMagn      0.521735
		montesFreq      3.28235
		montesSpiky     0.815958
		montesFraction  0.694662
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.57723
		hillsFraction   0.715694
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227817
		craterFreq      0.222203
		craterDensity   0.834539
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.466619
		volcanoTemp     1690.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.248, 0.214, 0.176, 0.000)
		colorShelf     (0.254, 0.221, 0.201, 0.000)
		colorBeach     (0.298, 0.259, 0.238, 0.000)
		colorDesert    (0.324, 0.278, 0.232, 0.000)
		colorLowland   (0.356, 0.296, 0.263, 0.000)
		colorUpland    (0.394, 0.360, 0.320, 0.000)
		colorRock      (0.425, 0.391, 0.345, 0.000)
		colorSnow      (0.463, 0.416, 0.364, 1.000)
		BumpHeight      13.771
		BumpOffset      2.75419
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.770548
		GasToDust   0.25
		Particles   2536
		GasBright   0.167917
		DustBright  0.310998
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   23.4579
		Period          106.848
		Eccentricity    0.957989
		Inclination     171.026
		AscendingNode   17.8195
		ArgOfPericenter -15.0246
		MeanAnomaly     179.558
	}
}

Comet	"Domir C48"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            4.30791e-017
	Radius          0.052597
	InertiaMoment   0.396421

	Oblateness      0.00821341

	RotationPeriod  62.2558
	Obliquity       15.8226
	EqAscendNode    270.459

	AbsMagn         7.45362
	SlopeParam      4.98901
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.797 0.709 0.633)

	Surface
	{
		SurfStyle       0.975817
		OceanStyle      0.251384
		Randomize      (-0.393, -0.539, -0.548)
		colorDistMagn   0.16922
		colorDistFreq   1.2597e-006
		detailScale     1.43625
		colorConversion true
		snowLevel       2
		tropicLatitude  0.667743
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.58165
		terraceProb     0.227811
		erosion         0
		montesMagn      0.373756
		montesFreq      2.89605
		montesSpiky     0.908629
		montesFraction  0.685615
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.62941e-006
		hillsFraction   0.768604
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236638
		craterFreq      0.25787
		craterDensity   0.910003
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.542575
		volcanoTemp     1490.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.271, 0.248, 0.253, 0.050)
		colorShelf     (0.319, 0.291, 0.291, 0.040)
		colorBeach     (0.367, 0.333, 0.329, 0.030)
		colorDesert    (0.415, 0.376, 0.374, 0.020)
		colorLowland   (0.462, 0.419, 0.412, 0.030)
		colorUpland    (0.510, 0.461, 0.450, 0.050)
		colorRock      (0.558, 0.504, 0.500, 0.020)
		colorSnow      (0.558, 0.504, 0.500, 1.000)
		BumpHeight      0.0473373
		BumpOffset      0.00946746
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.394671
		DustBright  0.56873
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   22.1296
		Period          97.9021
		Eccentricity    0.965146
		Inclination     -134.242
		AscendingNode   111.989
		ArgOfPericenter 160.919
		MeanAnomaly     117.949
	}
}

Comet	"Domir C49"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            3.33186e-013
	Radius          0.947739
	InertiaMoment   0.399112

	Oblateness      0.00668534

	RotationPeriod  60.3189
	Obliquity       329.028
	EqAscendNode    255.036

	AbsMagn         3.04946
	SlopeParam      5.69472
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.587 0.584 0.582)

	Surface
	{
		SurfStyle       0.0197103
		OceanStyle      0.527479
		Randomize      (0.887, 0.133, 0.120)
		colorDistMagn   0.0525119
		colorDistFreq   0.000481804
		detailScale     25.8796
		colorConversion true
		snowLevel       2
		tropicLatitude  0.898235
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.584747
		terraceProb     0.115124
		erosion         0
		montesMagn      0.442636
		montesFreq      2.97888
		montesSpiky     0.999397
		montesFraction  0.917729
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00171966
		hillsFraction   0.727634
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235084
		craterFreq      0.164038
		craterDensity   1.02512
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.519407
		volcanoTemp     1777.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.235, 0.233, 0.233, 0.000)
		colorShelf     (0.249, 0.248, 0.247, 0.000)
		colorBeach     (0.264, 0.263, 0.262, 0.000)
		colorDesert    (0.279, 0.277, 0.276, 0.000)
		colorLowland   (0.293, 0.292, 0.291, 0.000)
		colorUpland    (0.308, 0.306, 0.305, 0.000)
		colorRock      (0.323, 0.321, 0.320, 0.000)
		colorSnow      (0.337, 0.336, 0.334, 1.000)
		BumpHeight      0.852965
		BumpOffset      0.170593
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.322182
		GasToDust   0.25
		Particles   1630
		GasBright   0.303671
		DustBright  0.344216
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   16.2754
		Period          61.7492
		Eccentricity    0.948321
		Inclination     -94.2283
		AscendingNode   -168.401
		ArgOfPericenter -140.401
		MeanAnomaly     49.0034
	}
}

Comet	"Domir C50"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            2.57695e-009
	Radius          20.5481
	InertiaMoment   0.397653

	Oblateness      0.00934115

	RotationPeriod  58.4171
	Obliquity       282.234
	EqAscendNode    239.613

	AbsMagn         10.859
	SlopeParam      6.72753
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.408 0.402 0.400)

	Surface
	{
		SurfStyle       0.542159
		OceanStyle      0.835331
		Randomize      (0.169, 0.140, 0.632)
		colorDistMagn   0.626862
		colorDistFreq   0.230657
		detailScale     561.099
		colorConversion true
		snowLevel       2
		tropicLatitude  0.699607
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.441555
		terraceProb     0.337815
		erosion         0
		montesMagn      0.290842
		montesFreq      3.68178
		montesSpiky     0.938574
		montesFraction  0.895207
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.747429
		hillsFraction   0.721291
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252979
		craterFreq      0.232472
		craterDensity   0.922094
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.520037
		volcanoTemp     1450.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.159, 0.137, 0.112, 0.000)
		colorShelf     (0.163, 0.141, 0.128, 0.000)
		colorBeach     (0.192, 0.165, 0.152, 0.000)
		colorDesert    (0.208, 0.177, 0.148, 0.000)
		colorLowland   (0.229, 0.189, 0.168, 0.000)
		colorUpland    (0.253, 0.229, 0.204, 0.000)
		colorRock      (0.274, 0.249, 0.220, 0.000)
		colorSnow      (0.298, 0.266, 0.232, 1.000)
		BumpHeight      18.4933
		BumpOffset      3.69865
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.803374
		GasToDust   0.25
		Particles   2602
		GasBright   0.00922505
		DustBright  0.323149
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   18.7927
		Period          76.6157
		Eccentricity    0.921613
		Inclination     122.704
		AscendingNode   -136.857
		ArgOfPericenter -134.312
		MeanAnomaly     -131.063
	}
}

Comet	"Domir C51"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            7.93464e-017
	Radius          0.0587023
	InertiaMoment   0.399555

	Oblateness      0.00760393

	RotationPeriod  56.5439
	Obliquity       235.44
	EqAscendNode    224.191

	AbsMagn         7.24217
	SlopeParam      2.20263
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.514 0.505 0.501)

	Surface
	{
		SurfStyle       0.282047
		OceanStyle      0.268409
		Randomize      (-0.942, 0.328, 0.259)
		colorDistMagn   0.738866
		colorDistFreq   1.17005e-006
		detailScale     1.60296
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0790885
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.497453
		terraceProb     0.41969
		erosion         0
		montesMagn      0.575005
		montesFreq      2.71256
		montesSpiky     0.988777
		montesFraction  0.735371
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.93859e-006
		hillsFraction   0.441641
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259081
		craterFreq      0.215027
		craterDensity   0.907667
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.489691
		volcanoTemp     1771.25
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.206, 0.202, 0.200, 0.000)
		colorShelf     (0.219, 0.215, 0.213, 0.000)
		colorBeach     (0.231, 0.227, 0.225, 0.000)
		colorDesert    (0.244, 0.240, 0.238, 0.000)
		colorLowland   (0.257, 0.253, 0.250, 0.000)
		colorUpland    (0.270, 0.265, 0.263, 0.000)
		colorRock      (0.283, 0.278, 0.275, 0.000)
		colorSnow      (0.296, 0.290, 0.288, 1.000)
		BumpHeight      0.052832
		BumpOffset      0.0105664
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.0709037
		DustBright  0.745957
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   23.221
		Period          105.234
		Eccentricity    0.93488
		Inclination     -128.843
		AscendingNode   178.135
		ArgOfPericenter -6.63025
		MeanAnomaly     33.4957
	}
}

Comet	"Domir C52"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            6.13687e-013
	Radius          1.27229
	InertiaMoment   0.398344

	Oblateness      0.0106498

	RotationPeriod  54.6936
	Obliquity       188.645
	EqAscendNode    208.768

	AbsMagn         2.56511
	SlopeParam      2.93094
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.806 0.723 0.675)

	Surface
	{
		SurfStyle       0.71138
		OceanStyle      0.307657
		Randomize      (-0.048, -0.152, -0.575)
		colorDistMagn   0.847586
		colorDistFreq   0.00050863
		detailScale     34.7421
		colorConversion true
		snowLevel       2
		tropicLatitude  0.880762
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.452629
		terraceProb     0.155821
		erosion         0
		montesMagn      0.490029
		montesFreq      3.33287
		montesSpiky     0.963814
		montesFraction  0.765946
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00459473
		hillsFraction   0.744331
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243713
		craterFreq      0.260474
		craterDensity   0.796225
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.646384
		volcanoTemp     1617.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.314, 0.246, 0.189, 0.000)
		colorShelf     (0.322, 0.253, 0.216, 0.000)
		colorBeach     (0.379, 0.296, 0.257, 0.000)
		colorDesert    (0.411, 0.318, 0.250, 0.000)
		colorLowland   (0.451, 0.340, 0.284, 0.000)
		colorUpland    (0.500, 0.412, 0.344, 0.000)
		colorRock      (0.540, 0.448, 0.371, 0.000)
		colorSnow      (0.588, 0.477, 0.392, 1.000)
		BumpHeight      1.14506
		BumpOffset      0.229013
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.355008
		GasToDust   0.25
		Particles   1696
		GasBright   0.0731192
		DustBright  0.428228
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   22.4218
		Period          99.848
		Eccentricity    0.926304
		Inclination     -54.2124
		AscendingNode   149.052
		ArgOfPericenter -47.5612
		MeanAnomaly     160.957
	}
}

Comet	"Domir C53"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            4.74642e-009
	Radius          22.9413
	InertiaMoment   0.399978

	Oblateness      0.00869527

	RotationPeriod  52.8608
	Obliquity       141.851
	EqAscendNode    193.346

	AbsMagn         10.5957
	SlopeParam      3.53752
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.672 0.671 0.668)

	Surface
	{
		SurfStyle       0.0427903
		OceanStyle      0.739214
		Randomize      (-0.082, -0.733, 0.851)
		colorDistMagn   0.745413
		colorDistFreq   0.233209
		detailScale     626.451
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999159
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.49789
		terraceProb     0.518386
		erosion         0
		montesMagn      0.424207
		montesFreq      3.37601
		montesSpiky     0.962876
		montesFraction  0.55389
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.20873
		hillsFraction   0.487258
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.275983
		craterFreq      0.272729
		craterDensity   0.934115
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.484047
		volcanoTemp     1793.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.269, 0.268, 0.267, 0.000)
		colorShelf     (0.286, 0.285, 0.284, 0.000)
		colorBeach     (0.302, 0.302, 0.301, 0.000)
		colorDesert    (0.319, 0.319, 0.317, 0.000)
		colorLowland   (0.336, 0.335, 0.334, 0.000)
		colorUpland    (0.353, 0.352, 0.351, 0.000)
		colorRock      (0.370, 0.369, 0.367, 0.000)
		colorSnow      (0.387, 0.386, 0.384, 1.000)
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
		MaxLength   0.8362
		GasToDust   0.25
		Particles   2669
		GasBright   0.201988
		DustBright  0.783845
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   21.8366
		Period          95.9647
		Eccentricity    0.958928
		Inclination     -110.933
		AscendingNode   123.922
		ArgOfPericenter -83.3786
		MeanAnomaly     64.0719
	}
}

Comet	"Domir C54"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            1.46146e-016
	Radius          0.0787789
	InertiaMoment   0.398877

	Oblateness      0.0122146

	RotationPeriod  51.0405
	Obliquity       95.0568
	EqAscendNode    177.923

	AbsMagn         7.02858
	SlopeParam      4.10352
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.480 0.476 0.470)

	Surface
	{
		SurfStyle       0.370045
		OceanStyle      0.465247
		Randomize      (0.842, 0.355, -0.884)
		colorDistMagn   0.439552
		colorDistFreq   1.45487e-006
		detailScale     2.15119
		colorConversion true
		snowLevel       2
		tropicLatitude  0.768809
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.664212
		terraceProb     0.202077
		erosion         0
		montesMagn      0.526024
		montesFreq      2.48887
		montesSpiky     0.896239
		montesFraction  0.892823
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.08647e-005
		hillsFraction   0.667381
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263149
		craterFreq      0.207613
		craterDensity   0.91046
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.538599
		volcanoTemp     1400.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.192, 0.190, 0.188, 0.000)
		colorShelf     (0.204, 0.202, 0.200, 0.000)
		colorBeach     (0.216, 0.214, 0.212, 0.000)
		colorDesert    (0.228, 0.226, 0.223, 0.000)
		colorLowland   (0.240, 0.238, 0.235, 0.000)
		colorUpland    (0.252, 0.250, 0.247, 0.000)
		colorRock      (0.264, 0.262, 0.259, 0.000)
		colorSnow      (0.276, 0.274, 0.270, 1.000)
		BumpHeight      0.070901
		BumpOffset      0.0141802
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.176922
		DustBright  0.493399
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   27.316
		Period          134.264
		Eccentricity    0.964144
		Inclination     55.3227
		AscendingNode   -147.337
		ArgOfPericenter -55.2499
		MeanAnomaly     89.0854
	}
}

Comet	"Domir C55"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            1.13033e-012
	Radius          1.42096
	InertiaMoment   0.397177

	Oblateness      0.00989947

	RotationPeriod  49.228
	Obliquity       48.2625
	EqAscendNode    162.5

	AbsMagn         1.98457
	SlopeParam      4.67812
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.462 0.454 0.448)

	Surface
	{
		SurfStyle       0.421393
		OceanStyle      0.424523
		Randomize      (0.753, 0.026, 0.382)
		colorDistMagn   0.647533
		colorDistFreq   0.000864575
		detailScale     38.8016
		colorConversion true
		snowLevel       2
		tropicLatitude  0.981278
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.311065
		terraceProb     0.528188
		erosion         0
		montesMagn      0.393083
		montesFreq      3.46072
		montesSpiky     0.97035
		montesFraction  0.403512
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00431765
		hillsFraction   0.555524
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246106
		craterFreq      0.272888
		craterDensity   0.844505
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.527474
		volcanoTemp     1530.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.185, 0.182, 0.179, 0.000)
		colorShelf     (0.196, 0.193, 0.191, 0.000)
		colorBeach     (0.208, 0.204, 0.202, 0.000)
		colorDesert    (0.219, 0.216, 0.213, 0.000)
		colorLowland   (0.231, 0.227, 0.224, 0.000)
		colorUpland    (0.242, 0.239, 0.235, 0.000)
		colorRock      (0.254, 0.250, 0.247, 0.000)
		colorSnow      (0.266, 0.261, 0.258, 1.000)
		BumpHeight      1.27886
		BumpOffset      0.255772
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.387834
		GasToDust   0.25
		Particles   1763
		GasBright   0.114596
		DustBright  0.240211
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   17.7721
		Period          70.4598
		Eccentricity    0.933151
		Inclination     -113.299
		AscendingNode   48.3013
		ArgOfPericenter 15.4147
		MeanAnomaly     -110.055
	}
}

Comet	"Domir C56"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            8.7423e-009
	Radius          30.7778
	InertiaMoment   0.39934

	Oblateness      0.0141323

	RotationPeriod  47.4185
	Obliquity       1.46821
	EqAscendNode    147.078

	AbsMagn         10.3433
	SlopeParam      5.31639
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.467 0.378 0.336)

	Surface
	{
		SurfStyle       0.262846
		OceanStyle      0.747817
		Randomize      (0.585, 0.799, -0.139)
		colorDistMagn   0.407863
		colorDistFreq   0.0858227
		detailScale     840.44
		colorConversion true
		snowLevel       2
		tropicLatitude  0.56509
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.412748
		terraceProb     0.351651
		erosion         0
		montesMagn      0.555318
		montesFreq      2.64852
		montesSpiky     0.97103
		montesFraction  0.721645
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.72461
		hillsFraction   0.61606
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220848
		craterFreq      0.252284
		craterDensity   1.02471
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.480006
		volcanoTemp     1324.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.187, 0.151, 0.134, 0.000)
		colorShelf     (0.198, 0.161, 0.143, 0.000)
		colorBeach     (0.210, 0.170, 0.151, 0.000)
		colorDesert    (0.222, 0.180, 0.159, 0.000)
		colorLowland   (0.233, 0.189, 0.168, 0.000)
		colorUpland    (0.245, 0.198, 0.176, 0.000)
		colorRock      (0.257, 0.208, 0.185, 0.000)
		colorSnow      (0.268, 0.217, 0.193, 1.000)
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
		MaxLength   0.869026
		GasToDust   0.25
		Particles   2735
		GasBright   0.320632
		DustBright  0.518661
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   22.1022
		Period          97.7206
		Eccentricity    0.919311
		Inclination     146.665
		AscendingNode   136.211
		ArgOfPericenter 5.7146
		MeanAnomaly     -104.167
	}
}

Comet	"Domir C57"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            2.69182e-016
	Radius          0.088012
	InertiaMoment   0.398032

	Oblateness      0.011545

	RotationPeriod  45.6076
	Obliquity       314.674
	EqAscendNode    131.655

	AbsMagn         6.81218
	SlopeParam      6.13273
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.531 0.521 0.518)

	Surface
	{
		SurfStyle       0.51639
		OceanStyle      0.850877
		Randomize      (-0.742, 0.562, -0.370)
		colorDistMagn   0.932285
		colorDistFreq   3.37935e-006
		detailScale     2.40331
		colorConversion true
		snowLevel       2
		tropicLatitude  0.797366
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.514286
		terraceProb     0.121082
		erosion         0
		montesMagn      0.580113
		montesFreq      2.9045
		montesSpiky     0.966295
		montesFraction  0.313648
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.25219e-005
		hillsFraction   0.645013
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232336
		craterFreq      0.218766
		craterDensity   0.848557
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.518936
		volcanoTemp     1827.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.207, 0.177, 0.145, 0.000)
		colorShelf     (0.213, 0.182, 0.166, 0.000)
		colorBeach     (0.250, 0.214, 0.197, 0.000)
		colorDesert    (0.271, 0.229, 0.192, 0.000)
		colorLowland   (0.298, 0.245, 0.217, 0.000)
		colorUpland    (0.330, 0.297, 0.264, 0.000)
		colorRock      (0.356, 0.323, 0.285, 0.000)
		colorSnow      (0.388, 0.344, 0.300, 1.000)
		BumpHeight      0.0792108
		BumpOffset      0.0158422
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.231025
		DustBright  0.292755
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   13.6345
		Period          47.3467
		Eccentricity    0.88691
		Inclination     26.6532
		AscendingNode   94.4706
		ArgOfPericenter 114.738
		MeanAnomaly     100.145
	}
}

Comet	"Domir C58"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            2.08193e-012
	Radius          1.90578
	InertiaMoment   0.39977

	Oblateness      0.0165466

	RotationPeriod  43.7907
	Obliquity       267.88
	EqAscendNode    116.233

	AbsMagn         1.23944
	SlopeParam      7.7311
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.517 0.513 0.507)

	Surface
	{
		SurfStyle       0.97074
		OceanStyle      0.167553
		Randomize      (-0.739, 0.626, 0.962)
		colorDistMagn   0.169708
		colorDistFreq   0.00184843
		detailScale     52.0404
		colorConversion true
		snowLevel       2
		tropicLatitude  0.47798
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.485841
		terraceProb     0.163112
		erosion         0
		montesMagn      0.405848
		montesFreq      3.28912
		montesSpiky     0.964247
		montesFraction  0.593417
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00969261
		hillsFraction   0.706129
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235804
		craterFreq      0.208769
		craterDensity   0.805754
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.4479
		volcanoTemp     1811.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.176, 0.180, 0.203, 0.050)
		colorShelf     (0.207, 0.210, 0.233, 0.040)
		colorBeach     (0.238, 0.241, 0.264, 0.030)
		colorDesert    (0.269, 0.272, 0.299, 0.020)
		colorLowland   (0.300, 0.303, 0.330, 0.030)
		colorUpland    (0.331, 0.334, 0.360, 0.050)
		colorRock      (0.362, 0.364, 0.401, 0.020)
		colorSnow      (0.362, 0.364, 0.401, 1.000)
		BumpHeight      1.7152
		BumpOffset      0.34304
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.42066
		GasToDust   0.25
		Particles   1829
		GasBright   2.43844e-005
		DustBright  0.208242
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   23.27
		Period          105.567
		Eccentricity    0.91845
		Inclination     -68.4618
		AscendingNode   -21.5116
		ArgOfPericenter 162.392
		MeanAnomaly     -110.966
	}
}

Comet	"Domir C59"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            1.61023e-008
	Radius          34.3954
	InertiaMoment   0.398626

	Oblateness      0.0136378

	RotationPeriod  41.9629
	Obliquity       221.085
	EqAscendNode    100.81

	AbsMagn         10.0998
	SlopeParam      2.58533
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.469 0.401 0.377)

	Surface
	{
		SurfStyle       0.708386
		OceanStyle      0.774599
		Randomize      (-0.896, 0.335, 0.473)
		colorDistMagn   0.249507
		colorDistFreq   0.846569
		detailScale     939.225
		colorConversion true
		snowLevel       2
		tropicLatitude  0.988794
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.384424
		terraceProb     0.29825
		erosion         0
		montesMagn      0.513967
		montesFreq      2.54406
		montesSpiky     0.791867
		montesFraction  0.4262
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.06682
		hillsFraction   0.711261
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221086
		craterFreq      0.216869
		craterDensity   0.867359
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.503607
		volcanoTemp     1689.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.183, 0.136, 0.106, 0.000)
		colorShelf     (0.187, 0.140, 0.121, 0.000)
		colorBeach     (0.220, 0.164, 0.143, 0.000)
		colorDesert    (0.239, 0.176, 0.139, 0.000)
		colorLowland   (0.262, 0.188, 0.158, 0.000)
		colorUpland    (0.291, 0.228, 0.192, 0.000)
		colorRock      (0.314, 0.249, 0.207, 0.000)
		colorSnow      (0.342, 0.265, 0.219, 1.000)
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
		MaxLength   0.901852
		GasToDust   0.25
		Particles   2801
		GasBright   0.0409849
		DustBright  0.651768
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   21.3401
		Period          92.7103
		Eccentricity    0.91613
		Inclination     -40.5133
		AscendingNode   173.005
		ArgOfPericenter -115.789
		MeanAnomaly     -162.341
	}
}

Comet	"Domir C60"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            4.95801e-016
	Radius          0.118008
	InertiaMoment   0.396446

	Oblateness      0.0194101

	RotationPeriod  40.1194
	Obliquity       174.291
	EqAscendNode    85.3874

	AbsMagn         6.59224
	SlopeParam      3.23883
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.425 0.424 0.420)

	Surface
	{
		SurfStyle       0.235592
		OceanStyle      0.860583
		Randomize      (-0.891, 0.479, 0.122)
		colorDistMagn   0.940341
		colorDistFreq   9.78505e-006
		detailScale     3.22241
		colorConversion true
		snowLevel       2
		tropicLatitude  0.405469
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.462061
		terraceProb     0.342125
		erosion         0
		montesMagn      0.618729
		montesFreq      3.62299
		montesSpiky     0.878717
		montesFraction  0.634318
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.67354e-005
		hillsFraction   0.710417
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233591
		craterFreq      0.157671
		craterDensity   0.950444
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.598418
		volcanoTemp     1539.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.170, 0.169, 0.168, 0.000)
		colorShelf     (0.181, 0.180, 0.179, 0.000)
		colorBeach     (0.191, 0.191, 0.189, 0.000)
		colorDesert    (0.202, 0.201, 0.200, 0.000)
		colorLowland   (0.213, 0.212, 0.210, 0.000)
		colorUpland    (0.223, 0.222, 0.221, 0.000)
		colorRock      (0.234, 0.233, 0.231, 0.000)
		colorSnow      (0.245, 0.244, 0.242, 1.000)
		BumpHeight      0.106207
		BumpOffset      0.0212415
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.0445926
		DustBright  0.332647
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   13.3904
		Period          46.0811
		Eccentricity    0.888404
		Inclination     21.8664
		AscendingNode   104.607
		ArgOfPericenter -87.2362
		MeanAnomaly     12.2394
	}
}

Comet	"Domir C61"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            3.83466e-012
	Radius          2.13038
	InertiaMoment   0.399118

	Oblateness      0.0164032

	RotationPeriod  38.2551
	Obliquity       127.497
	EqAscendNode    69.9649

	AbsMagn         0.138975
	SlopeParam      3.81844
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.461 0.394 0.355)

	Surface
	{
		SurfStyle       0.483811
		OceanStyle      0.413074
		Randomize      (-0.756, 0.716, -0.434)
		colorDistMagn   0.926223
		colorDistFreq   0.00361991
		detailScale     58.1737
		colorConversion true
		snowLevel       2
		tropicLatitude  0.959526
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.354354
		terraceProb     0.148243
		erosion         0
		montesMagn      0.497024
		montesFreq      2.63102
		montesSpiky     0.89419
		montesFraction  0.44425
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.004857
		hillsFraction   0.529641
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252449
		craterFreq      0.182318
		craterDensity   0.87492
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.433704
		volcanoTemp     1244.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.184, 0.158, 0.142, 0.000)
		colorShelf     (0.196, 0.167, 0.151, 0.000)
		colorBeach     (0.208, 0.177, 0.160, 0.000)
		colorDesert    (0.219, 0.187, 0.169, 0.000)
		colorLowland   (0.231, 0.197, 0.177, 0.000)
		colorUpland    (0.242, 0.207, 0.186, 0.000)
		colorRock      (0.254, 0.217, 0.195, 0.000)
		colorSnow      (0.265, 0.226, 0.204, 1.000)
		BumpHeight      1.91735
		BumpOffset      0.383469
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.453486
		GasToDust   0.25
		Particles   1895
		GasBright   0.152743
		DustBright  0.708983
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   28.4286
		Period          142.549
		Eccentricity    0.945628
		Inclination     78.8149
		AscendingNode   77.8706
		ArgOfPericenter -13.7111
		MeanAnomaly     -153.928
	}
}

Comet	"Domir C62"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            2.96583e-008
	Radius          46.1059
	InertiaMoment   0.397663

	Oblateness      0.0236628

	RotationPeriod  36.3642
	Obliquity       80.7024
	EqAscendNode    54.5423

	AbsMagn         9.8639
	SlopeParam      4.38288
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.536 0.398 0.334)

	Surface
	{
		SurfStyle       0.717399
		OceanStyle      0.566577
		Randomize      (-0.764, -0.225, -0.942)
		colorDistMagn   0.215751
		colorDistFreq   1.06064
		detailScale     1259
		colorConversion true
		snowLevel       2
		tropicLatitude  0.827947
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.746955
		terraceProb     0.21297
		erosion         0
		montesMagn      0.504036
		montesFreq      2.38309
		montesSpiky     0.898967
		montesFraction  0.516492
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.66694
		hillsFraction   0.591419
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251867
		craterFreq      0.277142
		craterDensity   0.990062
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.4817
		volcanoTemp     1718.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.209, 0.135, 0.094, 0.000)
		colorShelf     (0.214, 0.139, 0.107, 0.000)
		colorBeach     (0.252, 0.163, 0.127, 0.000)
		colorDesert    (0.273, 0.175, 0.124, 0.000)
		colorLowland   (0.300, 0.187, 0.140, 0.000)
		colorUpland    (0.332, 0.227, 0.170, 0.000)
		colorRock      (0.359, 0.246, 0.184, 0.000)
		colorSnow      (0.391, 0.262, 0.194, 1.000)
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
		MaxLength   0.934678
		GasToDust   0.25
		Particles   2868
		GasBright   0.129069
		DustBright  0.417144
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   19.7641
		Period          82.632
		Eccentricity    0.924838
		Inclination     136.097
		AscendingNode   -171.735
		ArgOfPericenter 15.1829
		MeanAnomaly     67.6046
	}
}

Comet	"Domir C63"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            9.13204e-016
	Radius          0.131951
	InertiaMoment   0.399561

	Oblateness      0.0202261

	RotationPeriod  34.4406
	Obliquity       33.9081
	EqAscendNode    39.1197

	AbsMagn         6.36796
	SlopeParam      4.9803
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.594 0.591 0.585)

	Surface
	{
		SurfStyle       0.886502
		OceanStyle      0.54866
		Randomize      (0.407, -0.371, 0.566)
		colorDistMagn   0.591142
		colorDistFreq   5.92038e-006
		detailScale     3.60315
		colorConversion true
		snowLevel       2
		tropicLatitude  0.962491
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.433724
		terraceProb     0.143049
		erosion         0
		montesMagn      0.483791
		montesFreq      3.13663
		montesSpiky     0.9776
		montesFraction  0.337242
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.88115e-005
		hillsFraction   0.574731
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237957
		craterFreq      0.241912
		craterDensity   0.94721
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.489818
		volcanoTemp     1701.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.202, 0.207, 0.234, 0.050)
		colorShelf     (0.238, 0.242, 0.269, 0.040)
		colorBeach     (0.273, 0.278, 0.304, 0.030)
		colorDesert    (0.309, 0.313, 0.345, 0.020)
		colorLowland   (0.345, 0.348, 0.380, 0.030)
		colorUpland    (0.380, 0.384, 0.415, 0.050)
		colorRock      (0.416, 0.419, 0.462, 0.020)
		colorSnow      (0.416, 0.419, 0.462, 1.000)
		BumpHeight      0.118756
		BumpOffset      0.0237512
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.0681355
		DustBright  0.162564
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   24.2342
		Period          112.196
		Eccentricity    0.949378
		Inclination     98.8788
		AscendingNode   74.9396
		ArgOfPericenter 6.96261
		MeanAnomaly     48.7101
	}
}

Comet	"Domir C64"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            7.06296e-012
	Radius          2.855
	InertiaMoment   0.398351

	Oblateness      0.0296538

	RotationPeriod  32.4774
	Obliquity       347.114
	EqAscendNode    23.6971

	AbsMagn         18.722
	SlopeParam      5.68369
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.594 0.588 0.583)

	Surface
	{
		SurfStyle       0.548458
		OceanStyle      0.46089
		Randomize      (-0.039, 0.431, 0.558)
		colorDistMagn   0.486416
		colorDistFreq   0.00309739
		detailScale     77.9606
		colorConversion true
		snowLevel       2
		tropicLatitude  0.602565
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.45609
		terraceProb     0.294065
		erosion         0
		montesMagn      0.47042
		montesFreq      3.48726
		montesSpiky     0.868606
		montesFraction  0.345034
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0249787
		hillsFraction   0.946283
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.201584
		craterFreq      0.191558
		craterDensity   0.836218
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.637683
		volcanoTemp     1387.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.232, 0.200, 0.163, 0.000)
		colorShelf     (0.237, 0.206, 0.187, 0.000)
		colorBeach     (0.279, 0.241, 0.222, 0.000)
		colorDesert    (0.303, 0.259, 0.216, 0.000)
		colorLowland   (0.332, 0.276, 0.245, 0.000)
		colorUpland    (0.368, 0.335, 0.298, 0.000)
		colorRock      (0.398, 0.365, 0.321, 0.000)
		colorSnow      (0.433, 0.388, 0.338, 1.000)
		BumpHeight      2.5695
		BumpOffset      0.513901
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.486312
		GasToDust   0.25
		Particles   1962
		GasBright   0.253454
		DustBright  0.461732
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   17.7823
		Period          70.5201
		Eccentricity    0.902425
		Inclination     28.0342
		AscendingNode   126.514
		ArgOfPericenter -19.6697
		MeanAnomaly     -128.717
	}
}

Comet	"Domir C65"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            5.46268e-008
	Radius          51.5663
	InertiaMoment   0.399983

	Oblateness      0.0258285

	RotationPeriod  30.467
	Obliquity       300.32
	EqAscendNode    8.27449

	AbsMagn         9.63431
	SlopeParam      6.7081
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.606 0.519 0.377)

	Surface
	{
		SurfStyle       0.603566
		OceanStyle      0.526847
		Randomize      (0.227, -0.415, 0.960)
		colorDistMagn   0.306744
		colorDistFreq   0.521239
		detailScale     1408.1
		colorConversion true
		snowLevel       2
		tropicLatitude  0.814661
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.451449
		terraceProb     0.162828
		erosion         0
		montesMagn      0.451823
		montesFreq      3.42779
		montesSpiky     0.927719
		montesFraction  0.507084
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.33969
		hillsFraction   0.562765
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233036
		craterFreq      0.180546
		craterDensity   0.863041
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.447209
		volcanoTemp     1386.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.236, 0.176, 0.105, 0.000)
		colorShelf     (0.242, 0.182, 0.121, 0.000)
		colorBeach     (0.285, 0.213, 0.143, 0.000)
		colorDesert    (0.309, 0.228, 0.139, 0.000)
		colorLowland   (0.339, 0.244, 0.158, 0.000)
		colorUpland    (0.376, 0.296, 0.192, 0.000)
		colorRock      (0.406, 0.322, 0.207, 0.000)
		colorSnow      (0.443, 0.342, 0.219, 1.000)
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
		MaxLength   0.967504
		GasToDust   0.25
		Particles   2934
		GasBright   0.165238
		DustBright  0.234434
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   27.4555
		Period          135.293
		Eccentricity    0.935132
		Inclination     -5.37532
		AscendingNode   163.007
		ArgOfPericenter 8.96507
		MeanAnomaly     -59.7242
	}
}

Comet	"Domir C66"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            1.682e-015
	Radius          0.176791
	InertiaMoment   0.398883

	Oblateness      0.0387426

	RotationPeriod  28.4003
	Obliquity       253.525
	EqAscendNode    352.852

	AbsMagn         6.13843
	SlopeParam      2.19105
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.715 0.714 0.711)

	Surface
	{
		SurfStyle       0.397502
		OceanStyle      0.79593
		Randomize      (-0.716, 0.351, -0.603)
		colorDistMagn   0.953976
		colorDistFreq   2.35419e-005
		detailScale     4.82759
		colorConversion true
		snowLevel       2
		tropicLatitude  0.516335
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.70171
		terraceProb     0.266697
		erosion         0
		montesMagn      0.450745
		montesFreq      3.04498
		montesSpiky     0.763985
		montesFraction  0.579522
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.84474e-005
		hillsFraction   0.756637
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.269063
		craterFreq      0.217702
		craterDensity   0.943634
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.470851
		volcanoTemp     1352.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.286, 0.285, 0.284, 0.000)
		colorShelf     (0.304, 0.303, 0.302, 0.000)
		colorBeach     (0.322, 0.321, 0.320, 0.000)
		colorDesert    (0.340, 0.339, 0.338, 0.000)
		colorLowland   (0.358, 0.357, 0.355, 0.000)
		colorUpland    (0.376, 0.375, 0.373, 0.000)
		colorRock      (0.393, 0.393, 0.391, 0.000)
		colorSnow      (0.411, 0.410, 0.409, 1.000)
		BumpHeight      0.159112
		BumpOffset      0.0318225
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.037946
		GasToDust   0.25
		Particles   1056
		GasBright   0.417747
		DustBright  0.466412
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   25.6856
		Period          122.424
		Eccentricity    0.926893
		Inclination     -101.839
		AscendingNode   -12.9792
		ArgOfPericenter -94.3337
		MeanAnomaly     61.3133
	}
}

Comet	"Domir C67"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            1.30091e-011
	Radius          3.19387
	InertiaMoment   0.397191

	Oblateness      0.034309

	RotationPeriod  26.2669
	Obliquity       206.731
	EqAscendNode    337.429

	AbsMagn         15.8755
	SlopeParam      2.92203
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.723 0.683 0.658)

	Surface
	{
		SurfStyle       0.755497
		OceanStyle      0.495453
		Randomize      (0.453, -0.791, 0.543)
		colorDistMagn   0.195618
		colorDistFreq   0.00689195
		detailScale     87.2138
		colorConversion true
		snowLevel       2
		tropicLatitude  0.622149
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.446279
		terraceProb     0.368024
		erosion         0
		montesMagn      0.454219
		montesFreq      2.73701
		montesSpiky     0.804056
		montesFraction  0.149273
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0227829
		hillsFraction   0.559086
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227365
		craterFreq      0.274202
		craterDensity   0.841797
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.497284
		volcanoTemp     1371.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.282, 0.232, 0.184, 0.000)
		colorShelf     (0.289, 0.239, 0.211, 0.000)
		colorBeach     (0.340, 0.280, 0.250, 0.000)
		colorDesert    (0.369, 0.301, 0.244, 0.000)
		colorLowland   (0.405, 0.321, 0.277, 0.000)
		colorUpland    (0.448, 0.389, 0.336, 0.000)
		colorRock      (0.484, 0.424, 0.362, 0.000)
		colorSnow      (0.528, 0.451, 0.382, 1.000)
		BumpHeight      2.87448
		BumpOffset      0.574896
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.519138
		GasToDust   0.25
		Particles   2028
		GasBright   0.0179262
		DustBright  0.550719
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   25.4309
		Period          120.608
		Eccentricity    0.963196
		Inclination     64.2826
		AscendingNode   167.306
		ArgOfPericenter -52.5273
		MeanAnomaly     -9.00677
	}
}

Comet	"Domir C68"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            1.00616e-007
	Radius          69.075
	InertiaMoment   0.399346

	Oblateness      0.0539444

	RotationPeriod  24.0542
	Obliquity       159.937
	EqAscendNode    322.007

	AbsMagn         9.40998
	SlopeParam      3.52959
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.479 0.474 0.467)

	Surface
	{
		SurfStyle       0.488256
		OceanStyle      0.817199
		Randomize      (0.516, -0.398, -0.265)
		colorDistMagn   0.0392931
		colorDistFreq   2.63427
		detailScale     1886.21
		colorConversion true
		snowLevel       2
		tropicLatitude  0.987343
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.39241
		terraceProb     0.147987
		erosion         0
		montesMagn      0.578671
		montesFreq      3.17854
		montesSpiky     0.835355
		montesFraction  0.604887
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.92698
		hillsFraction   0.686553
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249874
		craterFreq      0.258236
		craterDensity   1.00443
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.537735
		volcanoTemp     1490.53
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.192, 0.189, 0.187, 0.000)
		colorShelf     (0.204, 0.201, 0.198, 0.000)
		colorBeach     (0.216, 0.213, 0.210, 0.000)
		colorDesert    (0.228, 0.225, 0.222, 0.000)
		colorLowland   (0.240, 0.237, 0.233, 0.000)
		colorUpland    (0.252, 0.249, 0.245, 0.000)
		colorRock      (0.264, 0.260, 0.257, 0.000)
		colorSnow      (0.275, 0.272, 0.268, 1.000)
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
		GasBright   0.0229261
		DustBright  0.230206
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   23.4508
		Period          106.8
		Eccentricity    0.945795
		Inclination     -72.5266
		AscendingNode   67.8378
		ArgOfPericenter 172.384
		MeanAnomaly     -41.9856
	}
}

Comet	"Domir C69"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            3.09804e-015
	Radius          0.197818
	InertiaMoment   0.39804

	Oblateness      0.0500971

	RotationPeriod  21.7471
	Obliquity       113.142
	EqAscendNode    306.584

	AbsMagn         5.90259
	SlopeParam      4.0958
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.491 0.486 0.481)

	Surface
	{
		SurfStyle       0.750506
		OceanStyle      0.502179
		Randomize      (-0.693, 0.598, 0.897)
		colorDistMagn   0.217091
		colorDistFreq   1.70673e-005
		detailScale     5.40174
		colorConversion true
		snowLevel       2
		tropicLatitude  0.946143
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.567342
		terraceProb     0.154405
		erosion         0
		montesMagn      0.67338
		montesFreq      3.41846
		montesSpiky     0.934321
		montesFraction  0.41718
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.27153e-005
		hillsFraction   0.473201
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238152
		craterFreq      0.260926
		craterDensity   0.911924
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.522236
		volcanoTemp     1539.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.192, 0.165, 0.135, 0.000)
		colorShelf     (0.196, 0.170, 0.154, 0.000)
		colorBeach     (0.231, 0.199, 0.183, 0.000)
		colorDesert    (0.250, 0.214, 0.178, 0.000)
		colorLowland   (0.275, 0.229, 0.202, 0.000)
		colorUpland    (0.304, 0.277, 0.245, 0.000)
		colorRock      (0.329, 0.301, 0.264, 0.000)
		colorSnow      (0.359, 0.321, 0.279, 1.000)
		BumpHeight      0.178036
		BumpOffset      0.0356072
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.070772
		GasToDust   0.25
		Particles   1122
		GasBright   0.110359
		DustBright  0.62726
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   18.5226
		Period          74.9698
		Eccentricity    0.913012
		Inclination     114.444
		AscendingNode   -54.4771
		ArgOfPericenter -171.691
		MeanAnomaly     103.247
	}
}

Comet	"Domir C70"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            2.39611e-011
	Radius          4.27745
	InertiaMoment   0.399776

	Oblateness      0.0834575

	RotationPeriod  19.3267
	Obliquity       66.3481
	EqAscendNode    291.162

	AbsMagn         14.7693
	SlopeParam      4.66995
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.729 0.726 0.721)

	Surface
	{
		SurfStyle       0.943631
		OceanStyle      0.967313
		Randomize      (0.364, -0.659, 0.752)
		colorDistMagn   0.437571
		colorDistFreq   0.0126353
		detailScale     116.803
		colorConversion true
		snowLevel       2
		tropicLatitude  0.984643
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.613514
		terraceProb     0.451317
		erosion         0
		montesMagn      0.627416
		montesFreq      3.19183
		montesSpiky     0.765608
		montesFraction  0.648995
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0518765
		hillsFraction   0.767184
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250773
		craterFreq      0.25903
		craterDensity   0.939569
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53998
		volcanoTemp     1499.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.248, 0.254, 0.289, 0.050)
		colorShelf     (0.292, 0.297, 0.332, 0.040)
		colorBeach     (0.336, 0.341, 0.375, 0.030)
		colorDesert    (0.379, 0.385, 0.426, 0.020)
		colorLowland   (0.423, 0.428, 0.469, 0.030)
		colorUpland    (0.467, 0.472, 0.512, 0.050)
		colorRock      (0.511, 0.515, 0.570, 0.020)
		colorSnow      (0.511, 0.515, 0.570, 1.000)
		BumpHeight      3.84971
		BumpOffset      0.769941
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.551964
		GasToDust   0.25
		Particles   2094
		GasBright   0.0880766
		DustBright  0.334029
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   26.4989
		Period          128.285
		Eccentricity    0.969144
		Inclination     13.8041
		AscendingNode   -10.3348
		ArgOfPericenter 84.8635
		MeanAnomaly     36.8723
	}
}

Comet	"Domir C71"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            1.85322e-007
	Radius          77.3057
	InertiaMoment   0.398633

	Oblateness      0.084247

	RotationPeriod  16.7692
	Obliquity       19.5538
	EqAscendNode    275.739

	AbsMagn         9.19001
	SlopeParam      5.30683
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.429 0.423 0.419)

	Surface
	{
		SurfStyle       0.642168
		OceanStyle      0.596138
		Randomize      (-0.027, 0.565, 0.358)
		colorDistMagn   0.814236
		colorDistFreq   2.2227
		detailScale     2110.96
		colorConversion true
		snowLevel       2
		tropicLatitude  0.910403
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.605163
		terraceProb     0.145306
		erosion         0
		montesMagn      0.5941
		montesFreq      2.38991
		montesSpiky     0.934684
		montesFraction  0.614796
		dunesFraction   0
		hillsMagn       0
		hillsFreq       17.5425
		hillsFraction   0.488783
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256447
		craterFreq      0.243167
		craterDensity   0.945243
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.421217
		volcanoTemp     1781.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.167, 0.144, 0.117, 0.000)
		colorShelf     (0.172, 0.148, 0.134, 0.000)
		colorBeach     (0.202, 0.173, 0.159, 0.000)
		colorDesert    (0.219, 0.186, 0.155, 0.000)
		colorLowland   (0.240, 0.199, 0.176, 0.000)
		colorUpland    (0.266, 0.241, 0.214, 0.000)
		colorRock      (0.288, 0.262, 0.230, 0.000)
		colorSnow      (0.313, 0.279, 0.243, 1.000)
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
		GasBright   0.2427
		DustBright  0.663892
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   23.963
		Period          110.317
		Eccentricity    0.957792
		Inclination     -72.3579
		AscendingNode   66.3135
		ArgOfPericenter -111.352
		MeanAnomaly     160.722
	}
}

Comet	"Domir C72"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            5.70621e-015
	Radius          0.264883
	InertiaMoment   0.396471

	Oblateness      0.155676

	RotationPeriod  14.0434
	Obliquity       332.759
	EqAscendNode    260.316

	AbsMagn         5.65922
	SlopeParam      6.11916
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.793 0.790 0.788)

	Surface
	{
		SurfStyle       0.261341
		OceanStyle      0.540719
		Randomize      (-0.922, -0.036, -0.497)
		colorDistMagn   0.993475
		colorDistFreq   3.88059e-005
		detailScale     7.23308
		colorConversion true
		snowLevel       2
		tropicLatitude  0.862277
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.348626
		terraceProb     0.113475
		erosion         0
		montesMagn      0.414446
		montesFreq      2.26735
		montesSpiky     0.966108
		montesFraction  0.478657
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000108268
		hillsFraction   0.370123
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238791
		craterFreq      0.211868
		craterDensity   0.898617
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.547118
		volcanoTemp     1416.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.317, 0.316, 0.315, 0.000)
		colorShelf     (0.337, 0.336, 0.335, 0.000)
		colorBeach     (0.357, 0.356, 0.355, 0.000)
		colorDesert    (0.377, 0.375, 0.375, 0.000)
		colorLowland   (0.397, 0.395, 0.394, 0.000)
		colorUpland    (0.416, 0.415, 0.414, 0.000)
		colorRock      (0.436, 0.435, 0.434, 0.000)
		colorSnow      (0.456, 0.454, 0.453, 1.000)
		BumpHeight      0.238395
		BumpOffset      0.047679
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.103598
		GasToDust   0.25
		Particles   1189
		GasBright   0.193135
		DustBright  0.397943
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   26.9074
		Period          131.262
		Eccentricity    0.920052
		Inclination     70.6532
		AscendingNode   60.618
		ArgOfPericenter 132.623
		MeanAnomaly     13.9321
	}
}

Comet	"Domir C73"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            4.41334e-011
	Radius          4.78801
	InertiaMoment   0.399123

	Oblateness      0.191928

	RotationPeriod  11.1075
	Obliquity       285.965
	EqAscendNode    244.894

	AbsMagn         14.0219
	SlopeParam      7.688
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.406 0.404 0.400)

	Surface
	{
		SurfStyle       0.360128
		OceanStyle      0.677637
		Randomize      (-0.026, 0.084, -0.346)
		colorDistMagn   0.32203
		colorDistFreq   0.00962701
		detailScale     130.745
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999008
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.301633
		terraceProb     0.644657
		erosion         0
		montesMagn      0.662315
		montesFreq      3.76716
		montesSpiky     0.939408
		montesFraction  0.558919
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0448049
		hillsFraction   0.634502
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249529
		craterFreq      0.228837
		craterDensity   0.812172
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.409301
		volcanoTemp     1617.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.162, 0.161, 0.160, 0.000)
		colorShelf     (0.172, 0.172, 0.170, 0.000)
		colorBeach     (0.183, 0.182, 0.180, 0.000)
		colorDesert    (0.193, 0.192, 0.190, 0.000)
		colorLowland   (0.203, 0.202, 0.200, 0.000)
		colorUpland    (0.213, 0.212, 0.210, 0.000)
		colorRock      (0.223, 0.222, 0.220, 0.000)
		colorSnow      (0.233, 0.232, 0.230, 1.000)
		BumpHeight      4.30921
		BumpOffset      0.861842
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.58479
		GasToDust   0.25
		Particles   2161
		GasBright   0.106312
		DustBright  0.169253
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   23.8429
		Period          109.489
		Eccentricity    0.928744
		Inclination     -67.5747
		AscendingNode   80.3185
		ArgOfPericenter 80.2151
		MeanAnomaly     150.047
	}
}

Comet	"Domir C74"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            3.41339e-007
	Radius          103.497
	InertiaMoment   0.397673

	Oblateness      0.249

	RotationPeriod  7.9031
	Obliquity       239.171
	EqAscendNode    229.471

	AbsMagn         8.97357
	SlopeParam      2.57541
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.527 0.524 0.522)

	Surface
	{
		SurfStyle       0.48162
		OceanStyle      0.265309
		Randomize      (-0.422, -0.499, -0.605)
		colorDistMagn   0.324801
		colorDistFreq   5.75564
		detailScale     2826.15
		colorConversion true
		snowLevel       2
		tropicLatitude  0.916297
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.426388
		terraceProb     0.241291
		erosion         0
		montesMagn      0.511525
		montesFreq      3.08343
		montesSpiky     0.869464
		montesFraction  0.786116
		dunesFraction   0
		hillsMagn       0
		hillsFreq       19.6424
		hillsFraction   0.460533
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239491
		craterFreq      0.429245
		craterDensity   0.872296
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.4348
		volcanoTemp     1409.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.211, 0.210, 0.209, 0.000)
		colorShelf     (0.224, 0.223, 0.222, 0.000)
		colorBeach     (0.237, 0.236, 0.235, 0.000)
		colorDesert    (0.250, 0.249, 0.248, 0.000)
		colorLowland   (0.264, 0.262, 0.261, 0.000)
		colorUpland    (0.277, 0.275, 0.274, 0.000)
		colorRock      (0.290, 0.288, 0.287, 0.000)
		colorSnow      (0.303, 0.302, 0.300, 1.000)
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
		GasBright   0.338102
		DustBright  0.421949
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   14.0351
		Period          49.4487
		Eccentricity    0.936254
		Inclination     168.515
		AscendingNode   -126.509
		ArgOfPericenter -45.2276
		MeanAnomaly     103.689
	}
}

Comet	"Domir C75"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            1.05101e-014
	Radius          0.296549
	InertiaMoment   0.399566

	Oblateness      0.249

	RotationPeriod  4.34488
	Obliquity       192.377
	EqAscendNode    214.049

	AbsMagn         5.40686
	SlopeParam      3.23053
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.615 0.545 0.501)

	Surface
	{
		SurfStyle       0.528347
		OceanStyle      0.821911
		Randomize      (0.519, -0.728, -0.775)
		colorDistMagn   0.705994
		colorDistFreq   4.8876e-005
		detailScale     8.09777
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997499
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.559346
		terraceProb     0.438416
		erosion         0
		montesMagn      0.454491
		montesFreq      3.03129
		montesSpiky     0.898692
		montesFraction  0.735224
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000200768
		hillsFraction   0.612424
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253358
		craterFreq      0.255803
		craterDensity   0.904425
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.519957
		volcanoTemp     1371.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.240, 0.185, 0.140, 0.000)
		colorShelf     (0.246, 0.191, 0.160, 0.000)
		colorBeach     (0.289, 0.224, 0.191, 0.000)
		colorDesert    (0.314, 0.240, 0.186, 0.000)
		colorLowland   (0.344, 0.256, 0.211, 0.000)
		colorUpland    (0.381, 0.311, 0.256, 0.000)
		colorRock      (0.412, 0.338, 0.276, 0.000)
		colorSnow      (0.449, 0.360, 0.291, 1.000)
		BumpHeight      0.266894
		BumpOffset      0.0533788
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.136424
		GasToDust   0.25
		Particles   1255
		GasBright   0.00172766
		DustBright  0.442811
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   25.3449
		Period          119.996
		Eccentricity    0.988119
		Inclination     -84.0598
		AscendingNode   143.679
		ArgOfPericenter -65.0053
		MeanAnomaly     -145.069
	}
}

Comet	"Domir C76"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            8.12881e-011
	Radius          6.40921
	InertiaMoment   0.398358

	Oblateness      0.00177331

	RotationPeriod  131.678
	Obliquity       145.582
	EqAscendNode    198.626

	AbsMagn         13.4402
	SlopeParam      3.81069
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.766 0.763 0.761)

	Surface
	{
		SurfStyle       0.995383
		OceanStyle      0.827165
		Randomize      (-0.947, -0.600, -0.557)
		colorDistMagn   0.458577
		colorDistFreq   0.0290082
		detailScale     175.014
		colorConversion true
		snowLevel       2
		tropicLatitude  0.572471
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.614035
		terraceProb     0.489725
		erosion         0
		montesMagn      0.549953
		montesFreq      2.25563
		montesSpiky     0.684523
		montesFraction  0.482564
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.116022
		hillsFraction   0.582804
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254213
		craterFreq      0.208516
		craterDensity   1.0921
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.455025
		volcanoTemp     1540.32
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.260, 0.267, 0.305, 0.050)
		colorShelf     (0.306, 0.313, 0.350, 0.040)
		colorBeach     (0.352, 0.359, 0.396, 0.030)
		colorDesert    (0.398, 0.405, 0.449, 0.020)
		colorLowland   (0.444, 0.450, 0.495, 0.030)
		colorUpland    (0.490, 0.496, 0.541, 0.050)
		colorRock      (0.536, 0.542, 0.602, 0.020)
		colorSnow      (0.536, 0.542, 0.602, 1.000)
		BumpHeight      5.76828
		BumpOffset      1.15366
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.617616
		GasToDust   0.25
		Particles   2227
		GasBright   0.0584651
		DustBright  0.87056
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   18.1219
		Period          72.5503
		Eccentricity    0.887409
		Inclination     158.707
		AscendingNode   -104.474
		ArgOfPericenter -73.031
		MeanAnomaly     49.4781
	}
}

Comet	"Domir C77"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            6.28705e-007
	Radius          115.887
	InertiaMoment   0.399988

	Oblateness      0.00176769

	RotationPeriod  115.655
	Obliquity       98.788
	EqAscendNode    183.203

	AbsMagn         8.75996
	SlopeParam      4.37502
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.664 0.513 0.387)

	Surface
	{
		SurfStyle       0.406658
		OceanStyle      0.979271
		Randomize      (-0.673, 0.032, 0.812)
		colorDistMagn   0.909851
		colorDistFreq   10.9069
		detailScale     3164.49
		colorConversion true
		snowLevel       2
		tropicLatitude  0.8023
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.595777
		terraceProb     0.448359
		erosion         0
		montesMagn      0.571773
		montesFreq      2.28604
		montesSpiky     0.92544
		montesFraction  0.495309
		dunesFraction   0
		hillsMagn       0
		hillsFreq       31.8419
		hillsFraction   0.435305
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.268475
		craterFreq      0.543634
		craterDensity   0.816311
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.451952
		volcanoTemp     1525.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.266, 0.205, 0.155, 0.000)
		colorShelf     (0.282, 0.218, 0.164, 0.000)
		colorBeach     (0.299, 0.231, 0.174, 0.000)
		colorDesert    (0.315, 0.243, 0.184, 0.000)
		colorLowland   (0.332, 0.256, 0.193, 0.000)
		colorUpland    (0.349, 0.269, 0.203, 0.000)
		colorRock      (0.365, 0.282, 0.213, 0.000)
		colorSnow      (0.382, 0.295, 0.222, 1.000)
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
		GasBright   0.0748342
		DustBright  0.538677
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   21.3681
		Period          92.8924
		Eccentricity    0.947159
		Inclination     99.0071
		AscendingNode   -125.948
		ArgOfPericenter -106.571
		MeanAnomaly     -77.1927
	}
}

Comet	"Domir C78"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            1.93583e-014
	Radius          0.396904
	InertiaMoment   0.39889

	Oblateness      0.00267541

	RotationPeriod  107.163
	Obliquity       51.9937
	EqAscendNode    167.781

	AbsMagn         5.14372
	SlopeParam      4.97161
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.465 0.461 0.453)

	Surface
	{
		SurfStyle       0.774229
		OceanStyle      0.683769
		Randomize      (-0.619, -0.793, -0.342)
		colorDistMagn   0.0109254
		colorDistFreq   5.08501e-005
		detailScale     10.8381
		colorConversion true
		snowLevel       2
		tropicLatitude  0.955164
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.655903
		terraceProb     0.117438
		erosion         0
		montesMagn      0.5648
		montesFreq      3.16482
		montesSpiky     0.936199
		montesFraction  0.373455
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000477931
		hillsFraction   0.770409
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231663
		craterFreq      0.232842
		craterDensity   0.845311
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.529707
		volcanoTemp     1611.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.181, 0.157, 0.127, 0.000)
		colorShelf     (0.186, 0.161, 0.145, 0.000)
		colorBeach     (0.219, 0.189, 0.172, 0.000)
		colorDesert    (0.237, 0.203, 0.168, 0.000)
		colorLowland   (0.260, 0.217, 0.190, 0.000)
		colorUpland    (0.288, 0.263, 0.231, 0.000)
		colorRock      (0.312, 0.286, 0.249, 0.000)
		colorSnow      (0.340, 0.304, 0.263, 1.000)
		BumpHeight      0.357214
		BumpOffset      0.0714427
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.16925
		GasToDust   0.25
		Particles   1321
		GasBright   0.0539442
		DustBright  0.244054
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   30.8279
		Period          160.971
		Eccentricity    0.972138
		Inclination     -140.303
		AscendingNode   -69.3245
		ArgOfPericenter -109.133
		MeanAnomaly     -113.634
	}
}

Comet	"Domir C79"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            1.49722e-010
	Radius          7.17747
	InertiaMoment   0.397205

	Oblateness      0.00228497

	RotationPeriod  101.075
	Obliquity       5.19937
	EqAscendNode    152.358

	AbsMagn         12.955
	SlopeParam      5.67272
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.559 0.452 0.414)

	Surface
	{
		SurfStyle       0.35174
		OceanStyle      0.638712
		Randomize      (-0.319, -0.745, 0.890)
		colorDistMagn   0.671244
		colorDistFreq   0.0323796
		detailScale     195.993
		colorConversion true
		snowLevel       2
		tropicLatitude  0.932293
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.317629
		terraceProb     0.562766
		erosion         0
		montesMagn      0.325802
		montesFreq      2.6495
		montesSpiky     0.917374
		montesFraction  0.615216
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.105064
		hillsFraction   0.617305
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223763
		craterFreq      0.279761
		craterDensity   0.657996
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.453598
		volcanoTemp     1688.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.224, 0.181, 0.166, 0.000)
		colorShelf     (0.237, 0.192, 0.176, 0.000)
		colorBeach     (0.251, 0.204, 0.186, 0.000)
		colorDesert    (0.265, 0.215, 0.197, 0.000)
		colorLowland   (0.279, 0.226, 0.207, 0.000)
		colorUpland    (0.293, 0.238, 0.218, 0.000)
		colorRock      (0.307, 0.249, 0.228, 0.000)
		colorSnow      (0.321, 0.260, 0.238, 1.000)
		BumpHeight      6.45972
		BumpOffset      1.29194
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.650442
		GasToDust   0.25
		Particles   2293
		GasBright   0.187849
		DustBright  0.594636
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   25.7528
		Period          122.905
		Eccentricity    0.965995
		Inclination     -106.301
		AscendingNode   -160.873
		ArgOfPericenter 135.123
		MeanAnomaly     -16.0264
	}
}

Comet	"Domir C80"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            4.61006e-018
	Radius          0.0245793
	InertiaMoment   0.399352

	Oblateness      0.00331575

	RotationPeriod  96.2125
	Obliquity       318.405
	EqAscendNode    136.936

	AbsMagn         8.54849
	SlopeParam      6.68893
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.728 0.560 0.497)

	Surface
	{
		SurfStyle       0.394456
		OceanStyle      0.691684
		Randomize      (0.071, 0.009, 0.725)
		colorDistMagn   0.30635
		colorDistFreq   3.83191e-007
		detailScale     0.67118
		colorConversion true
		snowLevel       2
		tropicLatitude  0.512614
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.458849
		terraceProb     0.284383
		erosion         0
		montesMagn      0.549737
		montesFreq      1.69782
		montesSpiky     0.920294
		montesFraction  0.444479
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.54885e-006
		hillsFraction   0.536203
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218799
		craterFreq      0.19654
		craterDensity   0.867788
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.477104
		volcanoTemp     1338.25
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.291, 0.224, 0.199, 0.000)
		colorShelf     (0.310, 0.238, 0.211, 0.000)
		colorBeach     (0.328, 0.252, 0.224, 0.000)
		colorDesert    (0.346, 0.266, 0.236, 0.000)
		colorLowland   (0.364, 0.280, 0.249, 0.000)
		colorUpland    (0.382, 0.294, 0.261, 0.000)
		colorRock      (0.401, 0.308, 0.274, 0.000)
		colorSnow      (0.419, 0.322, 0.286, 1.000)
		BumpHeight      0.0221214
		BumpOffset      0.00442428
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.139677
		DustBright  0.327294
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   20.2354
		Period          85.6054
		Eccentricity    0.929306
		Inclination     165.933
		AscendingNode   -145.632
		ArgOfPericenter 66.0732
		MeanAnomaly     -83.4597
	}
}

Comet	"Domir C81"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            3.56555e-014
	Radius          0.444533
	InertiaMoment   0.398049

	Oblateness      0.00275423

	RotationPeriod  92.0985
	Obliquity       271.611
	EqAscendNode    121.513

	AbsMagn         4.86759
	SlopeParam      2.1794
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.774 0.772 0.772)

	Surface
	{
		SurfStyle       0.155555
		OceanStyle      0.0468949
		Randomize      (0.021, -0.671, 0.497)
		colorDistMagn   0.362194
		colorDistFreq   6.36181e-005
		detailScale     12.1387
		colorConversion true
		snowLevel       2
		tropicLatitude  0.992438
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.624426
		terraceProb     0.442956
		erosion         0
		montesMagn      0.537757
		montesFreq      3.40301
		montesSpiky     0.963639
		montesFraction  0.39123
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00047781
		hillsFraction   0.697746
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242743
		craterFreq      0.195582
		craterDensity   0.870712
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.492989
		volcanoTemp     1813.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.310, 0.309, 0.309, 0.000)
		colorShelf     (0.329, 0.328, 0.328, 0.000)
		colorBeach     (0.348, 0.348, 0.347, 0.000)
		colorDesert    (0.368, 0.367, 0.366, 0.000)
		colorLowland   (0.387, 0.386, 0.386, 0.000)
		colorUpland    (0.406, 0.405, 0.405, 0.000)
		colorRock      (0.426, 0.425, 0.424, 0.000)
		colorSnow      (0.445, 0.444, 0.444, 1.000)
		BumpHeight      0.40008
		BumpOffset      0.080016
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.202076
		GasToDust   0.25
		Particles   1388
		GasBright   0.340772
		DustBright  0.610686
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   21.6484
		Period          94.7266
		Eccentricity    0.974402
		Inclination     103.419
		AscendingNode   -82.3599
		ArgOfPericenter 152.048
		MeanAnomaly     -56.7689
	}
}

Comet	"Domir C82"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            2.7577e-010
	Radius          9.60415
	InertiaMoment   0.399781

	Oblateness      0.00391531

	RotationPeriod  88.4916
	Obliquity       224.816
	EqAscendNode    106.09

	AbsMagn         12.5336
	SlopeParam      2.9131
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.417 0.414 0.408)

	Surface
	{
		SurfStyle       0.388432
		OceanStyle      0.669428
		Randomize      (0.313, -0.756, -0.409)
		colorDistMagn   0.348807
		colorDistFreq   0.0561436
		detailScale     262.257
		colorConversion true
		snowLevel       2
		tropicLatitude  0.773982
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.346337
		terraceProb     0.508987
		erosion         0
		montesMagn      0.492988
		montesFreq      3.08047
		montesSpiky     0.777628
		montesFraction  0.776768
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.252635
		hillsFraction   0.664952
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.271897
		craterFreq      0.204011
		craterDensity   0.796778
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.474602
		volcanoTemp     1348.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.167, 0.165, 0.163, 0.000)
		colorShelf     (0.177, 0.176, 0.173, 0.000)
		colorBeach     (0.188, 0.186, 0.184, 0.000)
		colorDesert    (0.198, 0.196, 0.194, 0.000)
		colorLowland   (0.209, 0.207, 0.204, 0.000)
		colorUpland    (0.219, 0.217, 0.214, 0.000)
		colorRock      (0.229, 0.227, 0.224, 0.000)
		colorSnow      (0.240, 0.238, 0.235, 1.000)
		BumpHeight      8.64374
		BumpOffset      1.72875
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.683268
		GasToDust   0.25
		Particles   2360
		GasBright   0.265318
		DustBright  0.370626
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   28.4153
		Period          142.45
		Eccentricity    0.942004
		Inclination     39.1677
		AscendingNode   100.776
		ArgOfPericenter -175.402
		MeanAnomaly     -102.799
	}
}

Comet	"Domir C83"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            8.49116e-018
	Radius          0.0275318
	InertiaMoment   0.398639

	Oblateness      0.00321379

	RotationPeriod  85.251
	Obliquity       178.022
	EqAscendNode    90.6679

	AbsMagn         8.33855
	SlopeParam      3.52165
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.454 0.445 0.442)

	Surface
	{
		SurfStyle       0.245247
		OceanStyle      0.212113
		Randomize      (-0.945, -0.252, 0.681)
		colorDistMagn   0.3039
		colorDistFreq   4.55932e-007
		detailScale     0.751801
		colorConversion true
		snowLevel       2
		tropicLatitude  0.967256
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.679953
		terraceProb     0.206695
		erosion         0
		montesMagn      0.635268
		montesFreq      1.68115
		montesSpiky     0.900998
		montesFraction  0.741753
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.85032e-006
		hillsFraction   0.508504
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.212005
		craterFreq      0.231408
		craterDensity   0.972219
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.610175
		volcanoTemp     1483.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.182, 0.178, 0.177, 0.000)
		colorShelf     (0.193, 0.189, 0.188, 0.000)
		colorBeach     (0.204, 0.200, 0.199, 0.000)
		colorDesert    (0.216, 0.211, 0.210, 0.000)
		colorLowland   (0.227, 0.223, 0.221, 0.000)
		colorUpland    (0.239, 0.234, 0.232, 0.000)
		colorRock      (0.250, 0.245, 0.243, 0.000)
		colorSnow      (0.261, 0.256, 0.254, 1.000)
		BumpHeight      0.0247786
		BumpOffset      0.00495572
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.152605
		DustBright  0.167826
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   13.8904
		Period          48.6861
		Eccentricity    0.900374
		Inclination     -74.5202
		AscendingNode   -67.1095
		ArgOfPericenter 144.243
		MeanAnomaly     124.026
	}
}

Comet	"Domir C84"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            6.5673e-014
	Radius          0.594774
	InertiaMoment   0.396496

	Oblateness      0.0044606

	RotationPeriod  82.2872
	Obliquity       131.228
	EqAscendNode    75.2453

	AbsMagn         4.57566
	SlopeParam      4.08807
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.822 0.786 0.747)

	Surface
	{
		SurfStyle       0.500575
		OceanStyle      0.0875658
		Randomize      (-0.652, 0.478, -0.097)
		colorDistMagn   0.581792
		colorDistFreq   8.39148e-005
		detailScale     16.2413
		colorConversion true
		snowLevel       2
		tropicLatitude  0.758237
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.551407
		terraceProb     0.234905
		erosion         0
		montesMagn      0.382299
		montesFreq      3.04447
		montesSpiky     0.933007
		montesFraction  0.535645
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000545009
		hillsFraction   0.813855
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226953
		craterFreq      0.159574
		craterDensity   0.914012
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.411206
		volcanoTemp     1357.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.267, 0.209, 0.000)
		colorShelf     (0.329, 0.275, 0.239, 0.000)
		colorBeach     (0.386, 0.322, 0.284, 0.000)
		colorDesert    (0.419, 0.346, 0.276, 0.000)
		colorLowland   (0.460, 0.369, 0.314, 0.000)
		colorUpland    (0.509, 0.448, 0.381, 0.000)
		colorRock      (0.550, 0.487, 0.411, 0.000)
		colorSnow      (0.600, 0.519, 0.433, 1.000)
		BumpHeight      0.535296
		BumpOffset      0.107059
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.234902
		GasToDust   0.25
		Particles   1454
		GasBright   0.0284085
		DustBright  0.776509
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   23.7239
		Period          108.67
		Eccentricity    0.920033
		Inclination     -177.708
		AscendingNode   102.58
		ArgOfPericenter 87.812
		MeanAnomaly     -39.0482
	}
}

Comet	"Domir C85"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            5.07934e-010
	Radius          10.7587
	InertiaMoment   0.399129

	Oblateness      0.00368971

	RotationPeriod  79.5393
	Obliquity       84.4336
	EqAscendNode    59.8227

	AbsMagn         12.1572
	SlopeParam      4.6618
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.541 0.538 0.533)

	Surface
	{
		SurfStyle       0.0810536
		OceanStyle      0.00587509
		Randomize      (0.594, 0.994, -0.362)
		colorDistMagn   0.895952
		colorDistFreq   0.0145605
		detailScale     293.785
		colorConversion true
		snowLevel       2
		tropicLatitude  0.62319
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.506314
		terraceProb     0.248151
		erosion         0
		montesMagn      0.516788
		montesFreq      2.59364
		montesSpiky     0.892811
		montesFraction  0.269794
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.309704
		hillsFraction   0.722136
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232363
		craterFreq      0.194194
		craterDensity   0.906167
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.485651
		volcanoTemp     1383.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.217, 0.215, 0.213, 0.000)
		colorShelf     (0.230, 0.229, 0.227, 0.000)
		colorBeach     (0.244, 0.242, 0.240, 0.000)
		colorDesert    (0.257, 0.255, 0.253, 0.000)
		colorLowland   (0.271, 0.269, 0.267, 0.000)
		colorUpland    (0.284, 0.282, 0.280, 0.000)
		colorRock      (0.298, 0.296, 0.293, 0.000)
		colorSnow      (0.311, 0.309, 0.307, 1.000)
		BumpHeight      9.68287
		BumpOffset      1.93657
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.716094
		GasToDust   0.25
		Particles   2426
		GasBright   0.0461699
		DustBright  0.443234
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   22.8533
		Period          102.744
		Eccentricity    0.926765
		Inclination     -83.8203
		AscendingNode   38.7563
		ArgOfPericenter -81.9794
		MeanAnomaly     -94.9092
	}
}

Comet	"Domir C86"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            1.56397e-017
	Radius          0.0368339
	InertiaMoment   0.397684

	Oblateness      0.00510817

	RotationPeriod  76.964
	Obliquity       37.6393
	EqAscendNode    44.4001

	AbsMagn         8.12953
	SlopeParam      5.29729
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.629 0.501 0.399)

	Surface
	{
		SurfStyle       0.16448
		OceanStyle      0.188374
		Randomize      (-0.192, -0.566, -0.474)
		colorDistMagn   0.971259
		colorDistFreq   5.09261e-007
		detailScale     1.00581
		colorConversion true
		snowLevel       2
		tropicLatitude  0.991971
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.499049
		terraceProb     0.224155
		erosion         0
		montesMagn      0.510938
		montesFreq      3.86507
		montesSpiky     0.993647
		montesFraction  0.615408
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.72631e-006
		hillsFraction   0.634577
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241907
		craterFreq      0.195853
		craterDensity   1.0677
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.531326
		volcanoTemp     1392.53
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.252, 0.200, 0.159, 0.000)
		colorShelf     (0.267, 0.213, 0.169, 0.000)
		colorBeach     (0.283, 0.225, 0.179, 0.000)
		colorDesert    (0.299, 0.238, 0.189, 0.000)
		colorLowland   (0.314, 0.251, 0.199, 0.000)
		colorUpland    (0.330, 0.263, 0.209, 0.000)
		colorRock      (0.346, 0.276, 0.219, 0.000)
		colorSnow      (0.362, 0.288, 0.229, 1.000)
		BumpHeight      0.0331505
		BumpOffset      0.00663011
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.149379
		DustBright  0.824511
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   21.4539
		Period          93.4525
		Eccentricity    0.928251
		Inclination     75.6573
		AscendingNode   83.2347
		ArgOfPericenter -14.1061
		MeanAnomaly     28.6882
	}
}

Comet	"Domir C87"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            1.20961e-013
	Radius          0.666323
	InertiaMoment   0.399571

	Oblateness      0.00419911

	RotationPeriod  74.5289
	Obliquity       350.845
	EqAscendNode    28.9775

	AbsMagn         4.26423
	SlopeParam      6.10568
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.808 0.739 0.694)

	Surface
	{
		SurfStyle       0.730383
		OceanStyle      0.515536
		Randomize      (0.849, -0.306, 0.460)
		colorDistMagn   0.0447453
		colorDistFreq   0.000208155
		detailScale     18.1951
		colorConversion true
		snowLevel       2
		tropicLatitude  0.819085
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.447255
		terraceProb     0.150759
		erosion         0
		montesMagn      0.461687
		montesFreq      3.0143
		montesSpiky     0.854269
		montesFraction  0.478274
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00119321
		hillsFraction   0.533778
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.277114
		craterFreq      0.165073
		craterDensity   0.876988
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.489781
		volcanoTemp     1637.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.315, 0.251, 0.194, 0.000)
		colorShelf     (0.323, 0.259, 0.222, 0.000)
		colorBeach     (0.380, 0.303, 0.264, 0.000)
		colorDesert    (0.412, 0.325, 0.257, 0.000)
		colorLowland   (0.453, 0.347, 0.292, 0.000)
		colorUpland    (0.501, 0.421, 0.354, 0.000)
		colorRock      (0.542, 0.458, 0.382, 0.000)
		colorSnow      (0.590, 0.488, 0.403, 1.000)
		BumpHeight      0.599691
		BumpOffset      0.119938
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.267727
		GasToDust   0.25
		Particles   1520
		GasBright   0.139859
		DustBright  0.518518
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   20.934
		Period          90.0767
		Eccentricity    0.929257
		Inclination     118.383
		AscendingNode   138.21
		ArgOfPericenter -33.3329
		MeanAnomaly     -110.417
	}
}

Comet	"Domir C88"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            9.3555e-010
	Radius          14.3929
	InertiaMoment   0.398366

	Oblateness      0.00580255

	RotationPeriod  72.2097
	Obliquity       304.051
	EqAscendNode    13.5549

	AbsMagn         11.8144
	SlopeParam      7.64656
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.485 0.434 0.333)

	Surface
	{
		SurfStyle       0.264799
		OceanStyle      0.0493748
		Randomize      (-0.938, -0.319, -0.323)
		colorDistMagn   0.540408
		colorDistFreq   0.163569
		detailScale     393.021
		colorConversion true
		snowLevel       2
		tropicLatitude  0.967763
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.705456
		terraceProb     0.161107
		erosion         0
		montesMagn      0.501955
		montesFreq      3.08292
		montesSpiky     0.906044
		montesFraction  0.201282
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.590306
		hillsFraction   0.688212
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229603
		craterFreq      0.218223
		craterDensity   1.07321
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.5516
		volcanoTemp     1702.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.194, 0.173, 0.133, 0.000)
		colorShelf     (0.206, 0.184, 0.142, 0.000)
		colorBeach     (0.218, 0.195, 0.150, 0.000)
		colorDesert    (0.230, 0.206, 0.158, 0.000)
		colorLowland   (0.243, 0.217, 0.167, 0.000)
		colorUpland    (0.255, 0.228, 0.175, 0.000)
		colorRock      (0.267, 0.238, 0.183, 0.000)
		colorSnow      (0.279, 0.249, 0.192, 1.000)
		BumpHeight      12.9536
		BumpOffset      2.59072
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.748919
		GasToDust   0.25
		Particles   2492
		GasBright   0.0930788
		DustBright  0.249785
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   19.2947
		Period          79.706
		Eccentricity    0.941384
		Inclination     -104.091
		AscendingNode   81.7336
		ArgOfPericenter 19.7884
		MeanAnomaly     -125.009
	}
}

Comet	"Domir C89"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            2.88062e-017
	Radius          0.0412672
	InertiaMoment   0.399993

	Oblateness      0.00475753

	RotationPeriod  69.9868
	Obliquity       257.256
	EqAscendNode    358.132

	AbsMagn         7.92087
	SlopeParam      2.56544
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.583 0.580 0.573)

	Surface
	{
		SurfStyle       0.589367
		OceanStyle      0.212556
		Randomize      (0.345, -0.549, -0.338)
		colorDistMagn   0.964534
		colorDistFreq   8.59318e-007
		detailScale     1.12687
		colorConversion true
		snowLevel       2
		tropicLatitude  0.935588
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.554771
		terraceProb     0.163029
		erosion         0
		montesMagn      0.451752
		montesFreq      2.35334
		montesSpiky     0.992822
		montesFraction  0.160681
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.00281e-006
		hillsFraction   0.735855
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248734
		craterFreq      0.192112
		craterDensity   0.771654
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.503568
		volcanoTemp     1467.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.227, 0.197, 0.161, 0.000)
		colorShelf     (0.233, 0.203, 0.183, 0.000)
		colorBeach     (0.274, 0.238, 0.218, 0.000)
		colorDesert    (0.297, 0.255, 0.212, 0.000)
		colorLowland   (0.327, 0.272, 0.241, 0.000)
		colorUpland    (0.362, 0.330, 0.292, 0.000)
		colorRock      (0.391, 0.359, 0.315, 0.000)
		colorSnow      (0.426, 0.382, 0.333, 1.000)
		BumpHeight      0.0371405
		BumpOffset      0.0074281
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.273456
		DustBright  0.553894
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   19.7953
		Period          82.8279
		Eccentricity    0.933774
		Inclination     -168.404
		AscendingNode   134.332
		ArgOfPericenter 53.6477
		MeanAnomaly     46.729
	}
}

Comet	"Domir C90"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            2.22796e-013
	Radius          0.891353
	InertiaMoment   0.398896

	Oblateness      0.00656913

	RotationPeriod  67.8448
	Obliquity       210.462
	EqAscendNode    342.71

	AbsMagn         3.92833
	SlopeParam      3.22222
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.482 0.478 0.475)

	Surface
	{
		SurfStyle       0.814832
		OceanStyle      0.98099
		Randomize      (0.087, 0.497, -0.197)
		colorDistMagn   0.877334
		colorDistFreq   0.000560816
		detailScale     24.3399
		colorConversion true
		snowLevel       2
		tropicLatitude  0.99885
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.615887
		terraceProb     0.178808
		erosion         0
		montesMagn      0.431286
		montesFreq      2.63606
		montesSpiky     0.904037
		montesFraction  0.434906
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00179113
		hillsFraction   0.672167
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246837
		craterFreq      0.263829
		craterDensity   0.973498
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.483558
		volcanoTemp     1359.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.188, 0.162, 0.133, 0.000)
		colorShelf     (0.193, 0.167, 0.152, 0.000)
		colorBeach     (0.226, 0.196, 0.180, 0.000)
		colorDesert    (0.246, 0.210, 0.176, 0.000)
		colorLowland   (0.270, 0.224, 0.199, 0.000)
		colorUpland    (0.299, 0.272, 0.242, 0.000)
		colorRock      (0.323, 0.296, 0.261, 0.000)
		colorSnow      (0.352, 0.315, 0.275, 1.000)
		BumpHeight      0.802218
		BumpOffset      0.160444
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.300553
		GasToDust   0.25
		Particles   1586
		GasBright   0.199394
		DustBright  0.312443
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   17.8643
		Period          71.0085
		Eccentricity    0.928664
		Inclination     117.311
		AscendingNode   169.876
		ArgOfPericenter -154.343
		MeanAnomaly     -153.985
	}
}

Comet	"Domir C91"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            1.72316e-009
	Radius          16.1258
	InertiaMoment   0.397219

	Oblateness      0.00531788

	RotationPeriod  65.7709
	Obliquity       163.668
	EqAscendNode    327.287

	AbsMagn         11.4976
	SlopeParam      3.80293
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.438 0.432 0.426)

	Surface
	{
		SurfStyle       0.130426
		OceanStyle      0.794913
		Randomize      (-0.444, 0.890, 0.157)
		colorDistMagn   0.956478
		colorDistFreq   0.180809
		detailScale     440.343
		colorConversion true
		snowLevel       2
		tropicLatitude  0.991375
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.605306
		terraceProb     0.205383
		erosion         0
		montesMagn      0.405554
		montesFreq      3.04081
		montesSpiky     0.917675
		montesFraction  0.571543
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.643596
		hillsFraction   0.656735
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248877
		craterFreq      0.205559
		craterDensity   0.864063
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.523136
		volcanoTemp     1620.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.175, 0.173, 0.170, 0.000)
		colorShelf     (0.186, 0.184, 0.181, 0.000)
		colorBeach     (0.197, 0.194, 0.192, 0.000)
		colorDesert    (0.208, 0.205, 0.202, 0.000)
		colorLowland   (0.219, 0.216, 0.213, 0.000)
		colorUpland    (0.230, 0.227, 0.224, 0.000)
		colorRock      (0.241, 0.238, 0.234, 0.000)
		colorSnow      (0.252, 0.248, 0.245, 1.000)
		BumpHeight      14.5132
		BumpOffset      2.90265
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.781745
		GasToDust   0.25
		Particles   2559
		GasBright   0.446961
		DustBright  0.549362
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   12.9491
		Period          43.822
		Eccentricity    0.907053
		Inclination     104.547
		AscendingNode   -66.1677
		ArgOfPericenter -21.6912
		MeanAnomaly     -54.0393
	}
}

Comet	"Domir C92"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            5.30575e-017
	Radius          0.0552022
	InertiaMoment   0.399357

	Oblateness      0.00743276

	RotationPeriod  63.7544
	Obliquity       116.874
	EqAscendNode    311.865

	AbsMagn         7.71199
	SlopeParam      4.36717
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.415 0.411 0.409)

	Surface
	{
		SurfStyle       0.881036
		OceanStyle      0.251113
		Randomize      (0.032, -0.828, 0.165)
		colorDistMagn   0.467335
		colorDistFreq   2.25862e-006
		detailScale     1.50739
		colorConversion true
		snowLevel       2
		tropicLatitude  0.799537
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.644255
		terraceProb     0.182969
		erosion         0
		montesMagn      0.279318
		montesFreq      2.46688
		montesSpiky     0.895417
		montesFraction  0.56224
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.73402e-006
		hillsFraction   0.584824
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235121
		craterFreq      0.233827
		craterDensity   0.97097
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.546467
		volcanoTemp     1466.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.141, 0.144, 0.163, 0.050)
		colorShelf     (0.166, 0.169, 0.188, 0.040)
		colorBeach     (0.191, 0.193, 0.213, 0.030)
		colorDesert    (0.216, 0.218, 0.241, 0.020)
		colorLowland   (0.241, 0.243, 0.266, 0.030)
		colorUpland    (0.266, 0.267, 0.290, 0.050)
		colorRock      (0.291, 0.292, 0.323, 0.020)
		colorSnow      (0.291, 0.292, 0.323, 1.000)
		BumpHeight      0.0496819
		BumpOffset      0.00993639
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.00521211
		DustBright  0.675598
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   16.5575
		Period          63.3613
		Eccentricity    0.946626
		Inclination     -124.425
		AscendingNode   62.0313
		ArgOfPericenter 41.8322
		MeanAnomaly     69.8817
	}
}

Comet	"Domir C93"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            4.10362e-013
	Radius          0.9987
	InertiaMoment   0.398057

	Oblateness      0.00602959

	RotationPeriod  61.7862
	Obliquity       70.0792
	EqAscendNode    296.442

	AbsMagn         3.56094
	SlopeParam      4.96294
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.655 0.650 0.646)

	Surface
	{
		SurfStyle       0.438184
		OceanStyle      0.551436
		Randomize      (-0.604, 0.359, 0.522)
		colorDistMagn   0.252053
		colorDistFreq   0.000257467
		detailScale     27.2712
		colorConversion true
		snowLevel       2
		tropicLatitude  0.924037
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.593249
		terraceProb     0.446418
		erosion         0
		montesMagn      0.617457
		montesFreq      2.89052
		montesSpiky     0.959363
		montesFraction  0.737975
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00108995
		hillsFraction   0.65228
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249091
		craterFreq      0.217071
		craterDensity   1.00111
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.582764
		volcanoTemp     1427.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.262, 0.260, 0.258, 0.000)
		colorShelf     (0.278, 0.276, 0.274, 0.000)
		colorBeach     (0.295, 0.293, 0.291, 0.000)
		colorDesert    (0.311, 0.309, 0.307, 0.000)
		colorLowland   (0.327, 0.325, 0.323, 0.000)
		colorUpland    (0.344, 0.341, 0.339, 0.000)
		colorRock      (0.360, 0.358, 0.355, 0.000)
		colorSnow      (0.377, 0.374, 0.371, 1.000)
		BumpHeight      0.89883
		BumpOffset      0.179766
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.333379
		GasToDust   0.25
		Particles   1653
		GasBright   0.0243656
		DustBright  0.340931
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   30.8407
		Period          161.071
		Eccentricity    0.953544
		Inclination     -49.736
		AscendingNode   -76.942
		ArgOfPericenter 4.08112
		MeanAnomaly     3.55915
	}
}

Comet	"Domir C94"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            3.17385e-009
	Radius          21.5707
	InertiaMoment   0.399786

	Oblateness      0.00842379

	RotationPeriod  59.8583
	Obliquity       23.2849
	EqAscendNode    281.019

	AbsMagn         11.2013
	SlopeParam      5.6618
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.437 0.431 0.425)

	Surface
	{
		SurfStyle       0.731108
		OceanStyle      0.0210008
		Randomize      (0.687, -0.922, 0.462)
		colorDistMagn   0.30316
		colorDistFreq   0.209039
		detailScale     589.025
		colorConversion true
		snowLevel       2
		tropicLatitude  0.68218
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.393415
		terraceProb     0.52341
		erosion         0
		montesMagn      0.387082
		montesFreq      3.03916
		montesSpiky     0.879391
		montesFraction  0.382945
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.32743
		hillsFraction   0.537903
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.265299
		craterFreq      0.247188
		craterDensity   0.96368
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.474791
		volcanoTemp     1470.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.170, 0.147, 0.119, 0.000)
		colorShelf     (0.175, 0.151, 0.136, 0.000)
		colorBeach     (0.205, 0.177, 0.162, 0.000)
		colorDesert    (0.223, 0.190, 0.157, 0.000)
		colorLowland   (0.245, 0.203, 0.179, 0.000)
		colorUpland    (0.271, 0.246, 0.217, 0.000)
		colorRock      (0.293, 0.267, 0.234, 0.000)
		colorSnow      (0.319, 0.284, 0.247, 1.000)
		BumpHeight      19.4137
		BumpOffset      3.88273
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.814571
		GasToDust   0.25
		Particles   2625
		GasBright   0.106857
		DustBright  0.742926
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   21.2825
		Period          92.3353
		Eccentricity    0.932258
		Inclination     -145.811
		AscendingNode   -82.5936
		ArgOfPericenter -61.731
		MeanAnomaly     -40.4334
	}
}

Comet	"Domir C95"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            9.77255e-017
	Radius          0.0618507
	InertiaMoment   0.398646

	Oblateness      0.00684858

	RotationPeriod  57.964
	Obliquity       336.491
	EqAscendNode    265.597

	AbsMagn         7.50232
	SlopeParam      6.67
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.725 0.674 0.625)

	Surface
	{
		SurfStyle       0.718911
		OceanStyle      0.092919
		Randomize      (-0.413, -0.354, -0.977)
		colorDistMagn   0.949598
		colorDistFreq   3.13073e-008
		detailScale     1.68894
		colorConversion true
		snowLevel       2
		tropicLatitude  0.536157
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.655138
		terraceProb     0.32773
		erosion         0
		montesMagn      0.378076
		montesFreq      3.10172
		montesSpiky     0.935672
		montesFraction  0.507391
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.34006e-006
		hillsFraction   0.480826
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251349
		craterFreq      0.256849
		craterDensity   0.809688
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.471931
		volcanoTemp     1151.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.283, 0.229, 0.175, 0.000)
		colorShelf     (0.290, 0.236, 0.200, 0.000)
		colorBeach     (0.341, 0.276, 0.237, 0.000)
		colorDesert    (0.370, 0.297, 0.231, 0.000)
		colorLowland   (0.406, 0.317, 0.262, 0.000)
		colorUpland    (0.450, 0.384, 0.319, 0.000)
		colorRock      (0.486, 0.418, 0.343, 0.000)
		colorSnow      (0.530, 0.445, 0.362, 1.000)
		BumpHeight      0.0556656
		BumpOffset      0.0111331
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.0987285
		DustBright  0.435541
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   17.0614
		Period          66.276
		Eccentricity    0.845039
		Inclination     -36.3487
		AscendingNode   116.515
		ArgOfPericenter -130.817
		MeanAnomaly     141.794
	}
}

Comet	"Domir C96"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            7.55835e-013
	Radius          1.33591
	InertiaMoment   0.39652

	Oblateness      0.00945058

	RotationPeriod  56.0968
	Obliquity       289.696
	EqAscendNode    250.174

	AbsMagn         3.1517
	SlopeParam      2.16769
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.822 0.747 0.710)

	Surface
	{
		SurfStyle       0.0856649
		OceanStyle      0.620051
		Randomize      (0.474, 0.705, 0.701)
		colorDistMagn   0.468969
		colorDistFreq   0.00114541
		detailScale     36.4793
		colorConversion true
		snowLevel       2
		tropicLatitude  0.690772
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.471635
		terraceProb     0.163415
		erosion         0
		montesMagn      0.414607
		montesFreq      2.76451
		montesSpiky     0.915428
		montesFraction  0.650849
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00466751
		hillsFraction   0.766319
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219677
		craterFreq      0.209907
		craterDensity   1.00503
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.564904
		volcanoTemp     1557.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.329, 0.299, 0.284, 0.000)
		colorShelf     (0.349, 0.317, 0.302, 0.000)
		colorBeach     (0.370, 0.336, 0.319, 0.000)
		colorDesert    (0.390, 0.355, 0.337, 0.000)
		colorLowland   (0.411, 0.374, 0.355, 0.000)
		colorUpland    (0.432, 0.392, 0.373, 0.000)
		colorRock      (0.452, 0.411, 0.390, 0.000)
		colorSnow      (0.473, 0.430, 0.408, 1.000)
		BumpHeight      1.20232
		BumpOffset      0.240464
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.366205
		GasToDust   0.25
		Particles   1719
		GasBright   0.0533408
		DustBright  0.165415
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   29.4508
		Period          150.307
		Eccentricity    0.939524
		Inclination     -26.7568
		AscendingNode   174.809
		ArgOfPericenter 148.5
		MeanAnomaly     168.293
	}
}

Comet	"Domir C97"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            5.84584e-009
	Radius          24.1685
	InertiaMoment   0.399135

	Oblateness      0.00781215

	RotationPeriod  54.2511
	Obliquity       242.902
	EqAscendNode    234.752

	AbsMagn         10.9217
	SlopeParam      2.90414
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.718 0.668 0.583)

	Surface
	{
		SurfStyle       0.993077
		OceanStyle      0.112236
		Randomize      (-0.882, 0.043, 0.475)
		colorDistMagn   0.0518345
		colorDistFreq   0.503068
		detailScale     659.961
		colorConversion true
		snowLevel       2
		tropicLatitude  0.745622
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.633163
		terraceProb     0.331305
		erosion         0
		montesMagn      0.544814
		montesFreq      3.43248
		montesSpiky     0.999064
		montesFraction  0.790799
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.29108
		hillsFraction   0.731195
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248847
		craterFreq      0.252215
		craterDensity   0.900827
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.476289
		volcanoTemp     1401.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.244, 0.234, 0.233, 0.050)
		colorShelf     (0.287, 0.274, 0.268, 0.040)
		colorBeach     (0.330, 0.314, 0.303, 0.030)
		colorDesert    (0.373, 0.354, 0.344, 0.020)
		colorLowland   (0.416, 0.394, 0.379, 0.030)
		colorUpland    (0.459, 0.434, 0.414, 0.050)
		colorRock      (0.502, 0.474, 0.461, 0.020)
		colorSnow      (0.502, 0.474, 0.461, 1.000)
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
		MaxLength   0.847397
		GasToDust   0.25
		Particles   2691
		GasBright   0.213
		DustBright  0.490243
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   18.6356
		Period          75.6565
		Eccentricity    0.902915
		Inclination     21.5694
		AscendingNode   137.881
		ArgOfPericenter -20.1756
		MeanAnomaly     -179.435
	}
}

Comet	"Domir C98"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            1.79998e-016
	Radius          0.0827356
	InertiaMoment   0.397694

	Oblateness      0.0108424

	RotationPeriod  52.4218
	Obliquity       196.108
	EqAscendNode    219.329

	AbsMagn         7.29128
	SlopeParam      3.51371
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.576 0.573 0.570)

	Surface
	{
		SurfStyle       0.32716
		OceanStyle      0.444244
		Randomize      (-0.353, 0.319, 0.161)
		colorDistMagn   0.404126
		colorDistFreq   1.93449e-006
		detailScale     2.25923
		colorConversion true
		snowLevel       2
		tropicLatitude  0.303228
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.597946
		terraceProb     0.649769
		erosion         0
		montesMagn      0.50189
		montesFreq      2.55769
		montesSpiky     0.79459
		montesFraction  0.669419
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.08261e-005
		hillsFraction   0.485828
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244064
		craterFreq      0.189792
		craterDensity   0.973474
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.567846
		volcanoTemp     1498.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.230, 0.229, 0.228, 0.000)
		colorShelf     (0.245, 0.244, 0.242, 0.000)
		colorBeach     (0.259, 0.258, 0.257, 0.000)
		colorDesert    (0.273, 0.272, 0.271, 0.000)
		colorLowland   (0.288, 0.287, 0.285, 0.000)
		colorUpland    (0.302, 0.301, 0.299, 0.000)
		colorRock      (0.317, 0.315, 0.314, 0.000)
		colorSnow      (0.331, 0.330, 0.328, 1.000)
		BumpHeight      0.074462
		BumpOffset      0.0148924
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.14033
		DustBright  0.2474
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   15.6202
		Period          58.0581
		Eccentricity    0.964006
		Inclination     160.763
		AscendingNode   59.9166
		ArgOfPericenter 84.0863
		MeanAnomaly     157.421
	}
}

Comet	"Domir C99"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            1.39215e-012
	Radius          1.49675
	InertiaMoment   0.399577

	Oblateness      0.00897023

	RotationPeriod  50.6038
	Obliquity       149.313
	EqAscendNode    203.906

	AbsMagn         2.68423
	SlopeParam      4.08035
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.435 0.431 0.424)

	Surface
	{
		SurfStyle       0.369111
		OceanStyle      0.785896
		Randomize      (0.272, -0.762, 0.280)
		colorDistMagn   0.143198
		colorDistFreq   0.000715464
		detailScale     40.8713
		colorConversion true
		snowLevel       2
		tropicLatitude  0.667395
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.466098
		terraceProb     0.134618
		erosion         0
		montesMagn      0.473947
		montesFreq      3.34585
		montesSpiky     0.9649
		montesFraction  0.535146
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00596441
		hillsFraction   0.64078
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245154
		craterFreq      0.258985
		craterDensity   0.881928
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.502469
		volcanoTemp     1758.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.174, 0.172, 0.169, 0.000)
		colorShelf     (0.185, 0.183, 0.180, 0.000)
		colorBeach     (0.196, 0.194, 0.191, 0.000)
		colorDesert    (0.207, 0.205, 0.201, 0.000)
		colorLowland   (0.218, 0.215, 0.212, 0.000)
		colorUpland    (0.229, 0.226, 0.222, 0.000)
		colorRock      (0.239, 0.237, 0.233, 0.000)
		colorSnow      (0.250, 0.248, 0.244, 1.000)
		BumpHeight      1.34708
		BumpOffset      0.269415
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.399031
		GasToDust   0.25
		Particles   1785
		GasBright   0.367179
		DustBright  0.505037
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   26.4722
		Period          128.09
		Eccentricity    0.941749
		Inclination     65.4126
		AscendingNode   33.5209
		ArgOfPericenter 105.907
		MeanAnomaly     161.54
	}
}

Comet	"Domir C100"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            1.07673e-008
	Radius          32.3303
	InertiaMoment   0.398373

	Oblateness      0.012516

	RotationPeriod  48.7925
	Obliquity       102.519
	EqAscendNode    188.484

	AbsMagn         10.6556
	SlopeParam      4.65365
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.744 0.696 0.668)

	Surface
	{
		SurfStyle       0.876097
		OceanStyle      0.896848
		Randomize      (-0.882, -0.532, 0.704)
		colorDistMagn   0.551401
		colorDistFreq   0.760415
		detailScale     882.834
		colorConversion true
		snowLevel       2
		tropicLatitude  0.627298
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.287643
		terraceProb     0.71154
		erosion         0
		montesMagn      0.527858
		montesFreq      2.70452
		montesSpiky     0.995433
		montesFraction  0.354926
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.38058
		hillsFraction   0.672836
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.27181
		craterFreq      0.228783
		craterDensity   0.966105
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.43675
		volcanoTemp     1548.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.253, 0.244, 0.267, 0.050)
		colorShelf     (0.298, 0.285, 0.307, 0.040)
		colorBeach     (0.342, 0.327, 0.347, 0.030)
		colorDesert    (0.387, 0.369, 0.394, 0.020)
		colorLowland   (0.431, 0.411, 0.434, 0.030)
		colorUpland    (0.476, 0.453, 0.474, 0.050)
		colorRock      (0.521, 0.494, 0.527, 0.020)
		colorSnow      (0.521, 0.494, 0.527, 1.000)
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
		MaxLength   0.880223
		GasToDust   0.25
		Particles   2758
		GasBright   0.267227
		DustBright  0.289475
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   16.1649
		Period          61.1215
		Eccentricity    0.946825
		Inclination     -113.469
		AscendingNode   165.037
		ArgOfPericenter 171.574
		MeanAnomaly     16.8391
	}
}

Comet	"Domir C101"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            3.31533e-016
	Radius          0.0926929
	InertiaMoment   0.399999

	Oblateness      0.0103949

	RotationPeriod  46.9831
	Obliquity       55.7248
	EqAscendNode    173.061

	AbsMagn         7.07824
	SlopeParam      5.28778
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.767 0.765 0.762)

	Surface
	{
		SurfStyle       0.71145
		OceanStyle      0.324964
		Randomize      (0.566, 0.052, -0.493)
		colorDistMagn   0.857947
		colorDistFreq   6.53916e-006
		detailScale     2.53113
		colorConversion true
		snowLevel       2
		tropicLatitude  0.798204
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.498346
		terraceProb     0.176674
		erosion         0
		montesMagn      0.644616
		montesFreq      3.47698
		montesSpiky     0.852736
		montesFraction  0.498801
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.01918e-005
		hillsFraction   0.443342
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25714
		craterFreq      0.168124
		craterDensity   0.769553
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.491448
		volcanoTemp     1354.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.299, 0.260, 0.213, 0.000)
		colorShelf     (0.307, 0.268, 0.244, 0.000)
		colorBeach     (0.361, 0.314, 0.289, 0.000)
		colorDesert    (0.391, 0.336, 0.282, 0.000)
		colorLowland   (0.430, 0.359, 0.320, 0.000)
		colorUpland    (0.476, 0.436, 0.388, 0.000)
		colorRock      (0.514, 0.474, 0.419, 0.000)
		colorSnow      (0.560, 0.505, 0.442, 1.000)
		BumpHeight      0.0834236
		BumpOffset      0.0166847
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.00942158
		DustBright  0.231768
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   16.5079
		Period          63.0772
		Eccentricity    0.945849
		Inclination     6.18665
		AscendingNode   118.505
		ArgOfPericenter -100.767
		MeanAnomaly     -115.201
	}
}

Comet	"Domir C102"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            2.56417e-012
	Radius          2.00231
	InertiaMoment   0.398902

	Oblateness      0.0145959

	RotationPeriod  45.1712
	Obliquity       8.93054
	EqAscendNode    157.639

	AbsMagn         2.13015
	SlopeParam      6.09229
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.806 0.757 0.680)

	Surface
	{
		SurfStyle       0.496414
		OceanStyle      0.462795
		Randomize      (-0.128, 0.897, 0.120)
		colorDistMagn   0.752572
		colorDistFreq   0.00181615
		detailScale     54.6764
		colorConversion true
		snowLevel       2
		tropicLatitude  0.839464
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.558348
		terraceProb     0.16683
		erosion         0
		montesMagn      0.411252
		montesFreq      3.28775
		montesSpiky     0.993304
		montesFraction  0.690341
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0108251
		hillsFraction   0.618255
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228306
		craterFreq      0.266755
		craterDensity   0.89404
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.449376
		volcanoTemp     1828.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.322, 0.303, 0.272, 0.000)
		colorShelf     (0.342, 0.322, 0.289, 0.000)
		colorBeach     (0.363, 0.340, 0.306, 0.000)
		colorDesert    (0.383, 0.359, 0.323, 0.000)
		colorLowland   (0.403, 0.378, 0.340, 0.000)
		colorUpland    (0.423, 0.397, 0.357, 0.000)
		colorRock      (0.443, 0.416, 0.374, 0.000)
		colorSnow      (0.463, 0.435, 0.391, 1.000)
		BumpHeight      1.80208
		BumpOffset      0.360416
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.431857
		GasToDust   0.25
		Particles   1852
		GasBright   0.0711948
		DustBright  0.654481
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   22.0863
		Period          97.6152
		Eccentricity    0.886703
		Inclination     58.4212
		AscendingNode   101.379
		ArgOfPericenter 131.943
		MeanAnomaly     57.8535
	}
}

Comet	"Domir C103"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            1.9832e-008
	Radius          36.2191
	InertiaMoment   0.397232

	Oblateness      0.0120508

	RotationPeriod  43.352
	Obliquity       322.136
	EqAscendNode    142.216

	AbsMagn         10.4008
	SlopeParam      7.60662
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.616 0.565 0.496)

	Surface
	{
		SurfStyle       0.720111
		OceanStyle      0.336601
		Randomize      (0.134, -0.044, -0.700)
		colorDistMagn   0.18553
		colorDistFreq   0.521539
		detailScale     989.023
		colorConversion true
		snowLevel       2
		tropicLatitude  0.745201
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.433435
		terraceProb     0.543168
		erosion         0
		montesMagn      0.28624
		montesFreq      3.14559
		montesSpiky     0.986829
		montesFraction  0.525535
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.92485
		hillsFraction   0.775897
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25
		craterFreq      0.249005
		craterDensity   0.891801
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.497302
		volcanoTemp     1325.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.240, 0.192, 0.139, 0.000)
		colorShelf     (0.247, 0.198, 0.159, 0.000)
		colorBeach     (0.290, 0.232, 0.188, 0.000)
		colorDesert    (0.314, 0.249, 0.183, 0.000)
		colorLowland   (0.345, 0.266, 0.208, 0.000)
		colorUpland    (0.382, 0.322, 0.253, 0.000)
		colorRock      (0.413, 0.350, 0.273, 0.000)
		colorSnow      (0.450, 0.373, 0.288, 1.000)
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
		MaxLength   0.913049
		GasToDust   0.25
		Particles   2824
		GasBright   0.0644585
		DustBright  0.345704
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   19.9915
		Period          84.0625
		Eccentricity    0.925394
		Inclination     -167.912
		AscendingNode   -144.878
		ArgOfPericenter 154.2
		MeanAnomaly     177.974
	}
}

Comet	"Domir C104"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            6.10644e-016
	Radius          0.124009
	InertiaMoment   0.399363

	Oblateness      0.0172623

	RotationPeriod  41.521
	Obliquity       275.342
	EqAscendNode    126.793

	AbsMagn         6.86255
	SlopeParam      2.55545
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.409 0.406 0.404)

	Surface
	{
		SurfStyle       0.351419
		OceanStyle      0.282589
		Randomize      (0.472, 0.155, 0.632)
		colorDistMagn   0.825344
		colorDistFreq   8.11977e-006
		detailScale     3.38628
		colorConversion true
		snowLevel       2
		tropicLatitude  0.718222
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.325149
		terraceProb     0.247273
		erosion         0
		montesMagn      0.493244
		montesFreq      2.70531
		montesSpiky     0.945607
		montesFraction  0.352684
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.53626e-005
		hillsFraction   0.78674
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.273591
		craterFreq      0.209816
		craterDensity   1.05879
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.457538
		volcanoTemp     1383.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.163, 0.162, 0.162, 0.000)
		colorShelf     (0.174, 0.172, 0.172, 0.000)
		colorBeach     (0.184, 0.183, 0.182, 0.000)
		colorDesert    (0.194, 0.193, 0.192, 0.000)
		colorLowland   (0.204, 0.203, 0.202, 0.000)
		colorUpland    (0.215, 0.213, 0.212, 0.000)
		colorRock      (0.225, 0.223, 0.222, 0.000)
		colorSnow      (0.235, 0.233, 0.232, 1.000)
		BumpHeight      0.111608
		BumpOffset      0.0223217
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.193422
		DustBright  0.701227
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   20.4749
		Period          87.1296
		Eccentricity    0.902468
		Inclination     81.2213
		AscendingNode   -136.185
		ArgOfPericenter 162.564
		MeanAnomaly     -21.42
	}
}

Comet	"Domir C105"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            4.72288e-012
	Radius          2.24298
	InertiaMoment   0.398066

	Oblateness      0.0143954

	RotationPeriod  39.673
	Obliquity       228.548
	EqAscendNode    111.371

	AbsMagn         1.43284
	SlopeParam      3.21389
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.594 0.592 0.588)

	Surface
	{
		SurfStyle       0.494648
		OceanStyle      0.881123
		Randomize      (-0.930, 0.875, 0.815)
		colorDistMagn   0.343257
		colorDistFreq   0.00426264
		detailScale     61.2482
		colorConversion true
		snowLevel       2
		tropicLatitude  0.984108
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.510242
		terraceProb     0.113766
		erosion         0
		montesMagn      0.543937
		montesFreq      3.45047
		montesSpiky     0.982785
		montesFraction  0.884138
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00710674
		hillsFraction   0.687862
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252011
		craterFreq      0.27333
		craterDensity   0.989216
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.516566
		volcanoTemp     1536.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.238, 0.237, 0.235, 0.000)
		colorShelf     (0.253, 0.252, 0.250, 0.000)
		colorBeach     (0.267, 0.266, 0.265, 0.000)
		colorDesert    (0.282, 0.281, 0.279, 0.000)
		colorLowland   (0.297, 0.296, 0.294, 0.000)
		colorUpland    (0.312, 0.311, 0.309, 0.000)
		colorRock      (0.327, 0.326, 0.323, 0.000)
		colorSnow      (0.342, 0.340, 0.338, 1.000)
		BumpHeight      2.01868
		BumpOffset      0.403736
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.464683
		GasToDust   0.25
		Particles   1918
		GasBright   0.159404
		DustBright  0.419732
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   18.0441
		Period          72.0832
		Eccentricity    0.883164
		Inclination     -81.4209
		AscendingNode   83.8951
		ArgOfPericenter 131.012
		MeanAnomaly     137.887
	}
}

Comet	"Domir C106"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            3.6528e-008
	Radius          48.4596
	InertiaMoment   0.399791

	Oblateness      0.0208077

	RotationPeriod  37.8027
	Obliquity       181.753
	EqAscendNode    95.9483

	AbsMagn         10.1554
	SlopeParam      3.79518
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.637 0.635 0.633)

	Surface
	{
		SurfStyle       0.01159
		OceanStyle      0.0300639
		Randomize      (-0.260, -0.065, -0.640)
		colorDistMagn   0.667374
		colorDistFreq   2.04371
		detailScale     1323.27
		colorConversion true
		snowLevel       2
		tropicLatitude  0.394577
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.733522
		terraceProb     0.337888
		erosion         0
		montesMagn      0.403402
		montesFreq      2.966
		montesSpiky     0.891821
		montesFraction  0.599782
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.02957
		hillsFraction   0.791822
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.287889
		craterFreq      0.268986
		craterDensity   0.783757
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.490582
		volcanoTemp     1779.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.255, 0.254, 0.253, 0.000)
		colorShelf     (0.271, 0.270, 0.269, 0.000)
		colorBeach     (0.287, 0.286, 0.285, 0.000)
		colorDesert    (0.303, 0.302, 0.301, 0.000)
		colorLowland   (0.319, 0.318, 0.317, 0.000)
		colorUpland    (0.335, 0.333, 0.332, 0.000)
		colorRock      (0.351, 0.349, 0.348, 0.000)
		colorSnow      (0.366, 0.365, 0.364, 1.000)
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
		MaxLength   0.945875
		GasToDust   0.25
		Particles   2890
		GasBright   0.088126
		DustBright  0.175496
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   19.0896
		Period          78.4385
		Eccentricity    0.903653
		Inclination     157.965
		AscendingNode   -131.851
		ArgOfPericenter -18.3516
		MeanAnomaly     121.834
	}
}

Comet	"Domir C107"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            1.12473e-015
	Radius          0.138901
	InertiaMoment   0.398652

	Oblateness      0.017566

	RotationPeriod  35.9045
	Obliquity       134.959
	EqAscendNode    80.5257

	AbsMagn         6.6435
	SlopeParam      4.35933
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.534 0.526 0.521)

	Surface
	{
		SurfStyle       0.125109
		OceanStyle      0.715896
		Randomize      (0.855, -0.007, -0.011)
		colorDistMagn   0.828301
		colorDistFreq   1.63692e-005
		detailScale     3.79293
		colorConversion true
		snowLevel       2
		tropicLatitude  0.893648
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.499839
		terraceProb     0.335932
		erosion         0
		montesMagn      0.665525
		montesFreq      2.54591
		montesSpiky     0.940429
		montesFraction  0.4701
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.95202e-005
		hillsFraction   0.503243
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264321
		craterFreq      0.203879
		craterDensity   0.76809
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.533186
		volcanoTemp     1514.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.214, 0.210, 0.208, 0.000)
		colorShelf     (0.227, 0.223, 0.221, 0.000)
		colorBeach     (0.240, 0.237, 0.234, 0.000)
		colorDesert    (0.254, 0.250, 0.247, 0.000)
		colorLowland   (0.267, 0.263, 0.260, 0.000)
		colorUpland    (0.281, 0.276, 0.273, 0.000)
		colorRock      (0.294, 0.289, 0.286, 0.000)
		colorSnow      (0.307, 0.302, 0.299, 1.000)
		BumpHeight      0.125011
		BumpOffset      0.0250022
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.016317
		GasToDust   0.25
		Particles   1012
		GasBright   0.294257
		DustBright  0.453852
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   23.6909
		Period          108.444
		Eccentricity    0.932755
		Inclination     100.972
		AscendingNode   -32.902
		ArgOfPericenter -58.62
		MeanAnomaly     64.6942
	}
}

Comet	"Domir C108"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            8.69895e-012
	Radius          3.0013
	InertiaMoment   0.396544

	Oblateness      0.0253912

	RotationPeriod  33.9721
	Obliquity       88.1648
	EqAscendNode    65.1031

	AbsMagn         0.447729
	SlopeParam      4.95428
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.729 0.724 0.722)

	Surface
	{
		SurfStyle       0.628223
		OceanStyle      0.563349
		Randomize      (0.505, -0.442, 0.580)
		colorDistMagn   0.219108
		colorDistFreq   0.00491773
		detailScale     81.9554
		colorConversion true
		snowLevel       2
		tropicLatitude  0.98159
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.661426
		terraceProb     0.227641
		erosion         0
		montesMagn      0.520156
		montesFreq      2.59168
		montesSpiky     0.899746
		montesFraction  0.721525
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0168401
		hillsFraction   0.58853
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.26567
		craterFreq      0.260044
		craterDensity   0.909111
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.532632
		volcanoTemp     1199.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.284, 0.246, 0.202, 0.000)
		colorShelf     (0.291, 0.253, 0.231, 0.000)
		colorBeach     (0.342, 0.297, 0.274, 0.000)
		colorDesert    (0.372, 0.319, 0.267, 0.000)
		colorLowland   (0.408, 0.340, 0.303, 0.000)
		colorUpland    (0.452, 0.413, 0.368, 0.000)
		colorRock      (0.488, 0.449, 0.397, 0.000)
		colorSnow      (0.532, 0.478, 0.419, 1.000)
		BumpHeight      2.70117
		BumpOffset      0.540233
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.497509
		GasToDust   0.25
		Particles   1984
		GasBright   0.195697
		DustBright  0.236898
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   19.6035
		Period          81.6269
		Eccentricity    0.959797
		Inclination     -166.241
		AscendingNode   20.8795
		ArgOfPericenter 55.2052
		MeanAnomaly     145.52
	}
}

Comet	"Domir C109"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            6.72801e-008
	Radius          54.2728
	InertiaMoment   0.399141

	Oblateness      0.0220954

	RotationPeriod  31.9983
	Obliquity       41.3705
	EqAscendNode    49.6805

	AbsMagn         9.9179
	SlopeParam      5.65093
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.636 0.529 0.425)

	Surface
	{
		SurfStyle       0.798863
		OceanStyle      0.0191711
		Randomize      (-0.337, -0.658, -0.751)
		colorDistMagn   0.0293872
		colorDistFreq   1.30215
		detailScale     1482.01
		colorConversion true
		snowLevel       2
		tropicLatitude  0.254075
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.508191
		terraceProb     0.416135
		erosion         0
		montesMagn      0.698972
		montesFreq      3.21711
		montesSpiky     0.720596
		montesFraction  0.602422
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.0619
		hillsFraction   0.422796
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.279108
		craterFreq      0.193781
		craterDensity   0.939472
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.505529
		volcanoTemp     1339.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.248, 0.180, 0.119, 0.000)
		colorShelf     (0.255, 0.185, 0.136, 0.000)
		colorBeach     (0.299, 0.217, 0.162, 0.000)
		colorDesert    (0.325, 0.233, 0.157, 0.000)
		colorLowland   (0.356, 0.249, 0.179, 0.000)
		colorUpland    (0.395, 0.302, 0.217, 0.000)
		colorRock      (0.426, 0.328, 0.234, 0.000)
		colorSnow      (0.465, 0.349, 0.247, 1.000)
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
		MaxLength   0.978701
		GasToDust   0.25
		Particles   2956
		GasBright   0.0104777
		DustBright  0.906604
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   17.7191
		Period          70.1448
		Eccentricity    0.904922
		Inclination     29.4995
		AscendingNode   164.771
		ArgOfPericenter 76.7219
		MeanAnomaly     8.52323
	}
}

Comet	"Domir C110"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            2.07161e-015
	Radius          0.185883
	InertiaMoment   0.397704

	Oblateness      0.0326772

	RotationPeriod  29.9752
	Obliquity       354.576
	EqAscendNode    34.2579

	AbsMagn         6.42031
	SlopeParam      6.6513
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.757 0.734 0.690)

	Surface
	{
		SurfStyle       0.944922
		OceanStyle      0.272501
		Randomize      (-0.566, -0.319, 0.021)
		colorDistMagn   0.985093
		colorDistFreq   1.9172e-005
		detailScale     5.07585
		colorConversion true
		snowLevel       2
		tropicLatitude  0.392253
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.563319
		terraceProb     0.217862
		erosion         0
		montesMagn      0.551612
		montesFreq      2.89128
		montesSpiky     0.887977
		montesFraction  0.655129
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.91048e-005
		hillsFraction   0.684506
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25154
		craterFreq      0.268499
		craterDensity   1.08204
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.550733
		volcanoTemp     1320.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.258, 0.257, 0.276, 0.050)
		colorShelf     (0.303, 0.301, 0.317, 0.040)
		colorBeach     (0.348, 0.345, 0.359, 0.030)
		colorDesert    (0.394, 0.389, 0.407, 0.020)
		colorLowland   (0.439, 0.433, 0.448, 0.030)
		colorUpland    (0.485, 0.477, 0.490, 0.050)
		colorRock      (0.530, 0.521, 0.545, 0.020)
		colorSnow      (0.530, 0.521, 0.545, 1.000)
		BumpHeight      0.167295
		BumpOffset      0.033459
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.049143
		GasToDust   0.25
		Particles   1079
		GasBright   0.0423927
		DustBright  0.559176
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   22.3221
		Period          99.1828
		Eccentricity    0.931024
		Inclination     -17.8899
		AscendingNode   -18.534
		ArgOfPericenter -33.5098
		MeanAnomaly     145.527
	}
}

Comet	"Domir C111"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            1.60224e-011
	Radius          3.36087
	InertiaMoment   0.399582

	Oblateness      0.0290429

	RotationPeriod  27.8935
	Obliquity       307.782
	EqAscendNode    18.8353

	AbsMagn         -1.51256
	SlopeParam      2.15592
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.625 0.620 0.617)

	Surface
	{
		SurfStyle       0.897574
		OceanStyle      0.196512
		Randomize      (-0.187, 0.995, 0.520)
		colorDistMagn   0.76189
		colorDistFreq   0.00546404
		detailScale     91.7742
		colorConversion true
		snowLevel       2
		tropicLatitude  0.570826
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.710317
		terraceProb     0.365074
		erosion         0
		montesMagn      0.534264
		montesFreq      2.94178
		montesSpiky     0.989091
		montesFraction  0.47906
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0310765
		hillsFraction   0.603777
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242719
		craterFreq      0.189491
		craterDensity   0.945132
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.538717
		volcanoTemp     1538.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.213, 0.217, 0.247, 0.050)
		colorShelf     (0.250, 0.254, 0.284, 0.040)
		colorBeach     (0.288, 0.291, 0.321, 0.030)
		colorDesert    (0.325, 0.329, 0.364, 0.020)
		colorLowland   (0.363, 0.366, 0.401, 0.030)
		colorUpland    (0.400, 0.403, 0.438, 0.050)
		colorRock      (0.438, 0.440, 0.488, 0.020)
		colorSnow      (0.438, 0.440, 0.488, 1.000)
		BumpHeight      3.02479
		BumpOffset      0.604957
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.530335
		GasToDust   0.25
		Particles   2051
		GasBright   0.0370486
		DustBright  0.249006
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   27.7174
		Period          137.234
		Eccentricity    0.963936
		Inclination     86.8996
		AscendingNode   3.23561
		ArgOfPericenter -121.13
		MeanAnomaly     48.6168
	}
}

Comet	"Domir C112"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            1.23922e-007
	Radius          72.6395
	InertiaMoment   0.39838

	Oblateness      0.0443138

	RotationPeriod  25.7422
	Obliquity       260.988
	EqAscendNode    3.41276

	AbsMagn         9.68694
	SlopeParam      2.89516
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.657 0.531 0.394)

	Surface
	{
		SurfStyle       0.0347577
		OceanStyle      0.352939
		Randomize      (-0.466, -0.179, 0.517)
		colorDistMagn   0.839921
		colorDistFreq   1.64276
		detailScale     1983.54
		colorConversion true
		snowLevel       2
		tropicLatitude  0.9987
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.45331
		terraceProb     0.380353
		erosion         0
		montesMagn      0.579193
		montesFreq      3.40098
		montesSpiky     0.98777
		montesFraction  0.492999
		dunesFraction   0
		hillsMagn       0
		hillsFreq       13.0531
		hillsFraction   0.694737
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.267477
		craterFreq      0.257398
		craterDensity   0.714633
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.506086
		volcanoTemp     1269.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.263, 0.212, 0.158, 0.000)
		colorShelf     (0.279, 0.226, 0.167, 0.000)
		colorBeach     (0.295, 0.239, 0.177, 0.000)
		colorDesert    (0.312, 0.252, 0.187, 0.000)
		colorLowland   (0.328, 0.266, 0.197, 0.000)
		colorUpland    (0.345, 0.279, 0.207, 0.000)
		colorRock      (0.361, 0.292, 0.217, 0.000)
		colorSnow      (0.378, 0.305, 0.227, 1.000)
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
		GasBright   0.145294
		DustBright  0.625248
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   22.1905
		Period          98.3065
		Eccentricity    0.914002
		Inclination     -46.2455
		AscendingNode   -102.904
		ArgOfPericenter 47.9613
		MeanAnomaly     -88.8892
	}
}

Comet	"Domir C113"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            3.81563e-015
	Radius          0.208121
	InertiaMoment   0.393654

	Oblateness      0.039875

	RotationPeriod  23.5083
	Obliquity       214.193
	EqAscendNode    347.99

	AbsMagn         6.19208
	SlopeParam      3.50576
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.420 0.413 0.409)

	Surface
	{
		SurfStyle       0.645443
		OceanStyle      0.00236539
		Randomize      (0.475, 0.751, 0.129)
		colorDistMagn   0.85659
		colorDistFreq   2.31906e-005
		detailScale     5.68309
		colorConversion true
		snowLevel       2
		tropicLatitude  0.70624
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.353446
		terraceProb     0.152472
		erosion         0
		montesMagn      0.457624
		montesFreq      2.1481
		montesSpiky     0.757338
		montesFraction  0.422541
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000112159
		hillsFraction   0.717851
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219466
		craterFreq      0.212955
		craterDensity   0.932976
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.415241
		volcanoTemp     1118.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.164, 0.140, 0.114, 0.000)
		colorShelf     (0.168, 0.145, 0.131, 0.000)
		colorBeach     (0.197, 0.169, 0.155, 0.000)
		colorDesert    (0.214, 0.182, 0.151, 0.000)
		colorLowland   (0.235, 0.194, 0.172, 0.000)
		colorUpland    (0.260, 0.236, 0.208, 0.000)
		colorRock      (0.281, 0.256, 0.225, 0.000)
		colorSnow      (0.306, 0.273, 0.237, 1.000)
		BumpHeight      0.187309
		BumpOffset      0.0374618
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.0819688
		GasToDust   0.25
		Particles   1145
		GasBright   0.112668
		DustBright  0.34236
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   22.4342
		Period          99.9306
		Eccentricity    0.954286
		Inclination     -11.5107
		AscendingNode   156.111
		ArgOfPericenter -6.7288
		MeanAnomaly     144.972
	}
}

Comet	"Domir C114"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            2.95112e-011
	Radius          4.49893
	InertiaMoment   0.398908

	Oblateness      0.06546

	RotationPeriod  21.1758
	Obliquity       167.399
	EqAscendNode    332.568

	AbsMagn         16.2426
	SlopeParam      4.07263
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.579 0.444 0.331)

	Surface
	{
		SurfStyle       0.437027
		OceanStyle      0.953523
		Randomize      (-0.917, 0.377, 0.042)
		colorDistMagn   0.680983
		colorDistFreq   0.0125789
		detailScale     122.851
		colorConversion true
		snowLevel       2
		tropicLatitude  0.337376
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.753765
		terraceProb     0.388174
		erosion         0
		montesMagn      0.599761
		montesFreq      3.18812
		montesSpiky     0.950952
		montesFraction  0.190531
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.020886
		hillsFraction   0.537402
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.210443
		craterFreq      0.215778
		craterDensity   0.837655
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.474987
		volcanoTemp     1516.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.232, 0.177, 0.132, 0.000)
		colorShelf     (0.246, 0.188, 0.141, 0.000)
		colorBeach     (0.261, 0.200, 0.149, 0.000)
		colorDesert    (0.275, 0.211, 0.157, 0.000)
		colorLowland   (0.290, 0.222, 0.166, 0.000)
		colorUpland    (0.304, 0.233, 0.174, 0.000)
		colorRock      (0.319, 0.244, 0.182, 0.000)
		colorSnow      (0.333, 0.255, 0.190, 1.000)
		BumpHeight      4.04903
		BumpOffset      0.809807
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.563161
		GasToDust   0.25
		Particles   2117
		GasBright   0.288103
		DustBright  0.651411
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   26.1475
		Period          125.742
		Eccentricity    0.934755
		Inclination     -32.0145
		AscendingNode   169.95
		ArgOfPericenter 155.731
		MeanAnomaly     -87.2069
	}
}

Comet	"Domir C115"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            2.28248e-007
	Radius          81.3157
	InertiaMoment   0.397246

	Oblateness      0.063517

	RotationPeriod  18.7249
	Obliquity       120.605
	EqAscendNode    317.145

	AbsMagn         9.46148
	SlopeParam      4.64552
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.636 0.632 0.626)

	Surface
	{
		SurfStyle       0.620878
		OceanStyle      0.472006
		Randomize      (0.630, 0.523, 0.080)
		colorDistMagn   0.349177
		colorDistFreq   3.05709
		detailScale     2220.46
		colorConversion true
		snowLevel       2
		tropicLatitude  0.84934
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.760329
		terraceProb     0.267227
		erosion         0
		montesMagn      0.677514
		montesFreq      1.8474
		montesSpiky     0.990954
		montesFraction  0.722344
		dunesFraction   0
		hillsMagn       0
		hillsFreq       16.5568
		hillsFraction   0.516257
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230781
		craterFreq      0.285753
		craterDensity   0.884603
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49622
		volcanoTemp     1590.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.248, 0.215, 0.175, 0.000)
		colorShelf     (0.255, 0.221, 0.200, 0.000)
		colorBeach     (0.299, 0.259, 0.238, 0.000)
		colorDesert    (0.325, 0.278, 0.232, 0.000)
		colorLowland   (0.356, 0.297, 0.263, 0.000)
		colorUpland    (0.395, 0.360, 0.319, 0.000)
		colorRock      (0.426, 0.392, 0.344, 0.000)
		colorSnow      (0.465, 0.417, 0.363, 1.000)
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
		GasBright   0.228195
		DustBright  0.395806
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   19.6002
		Period          81.6064
		Eccentricity    0.911774
		Inclination     104.745
		AscendingNode   37.8301
		ArgOfPericenter 164.692
		MeanAnomaly     -77.5205
	}
}

Comet	"Domir C116"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            7.02792e-015
	Radius          0.278642
	InertiaMoment   0.399368

	Oblateness      0.112748

	RotationPeriod  16.13
	Obliquity       73.8104
	EqAscendNode    301.722

	AbsMagn         5.9578
	SlopeParam      5.2783
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.835 0.786 0.717)

	Surface
	{
		SurfStyle       0.0365312
		OceanStyle      0.344427
		Randomize      (-0.394, -0.987, 0.727)
		colorDistMagn   0.878467
		colorDistFreq   3.12614e-005
		detailScale     7.60878
		colorConversion true
		snowLevel       2
		tropicLatitude  0.991699
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.535589
		terraceProb     0.557664
		erosion         0
		montesMagn      0.470736
		montesFreq      3.33289
		montesSpiky     0.893019
		montesFraction  0.49622
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000156535
		hillsFraction   0.549494
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218986
		craterFreq      0.228478
		craterDensity   0.942464
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.5888
		volcanoTemp     1735.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.334, 0.315, 0.287, 0.000)
		colorShelf     (0.355, 0.334, 0.305, 0.000)
		colorBeach     (0.376, 0.354, 0.323, 0.000)
		colorDesert    (0.397, 0.374, 0.341, 0.000)
		colorLowland   (0.417, 0.393, 0.359, 0.000)
		colorUpland    (0.438, 0.413, 0.377, 0.000)
		colorRock      (0.459, 0.433, 0.395, 0.000)
		colorSnow      (0.480, 0.452, 0.412, 1.000)
		BumpHeight      0.250778
		BumpOffset      0.0501555
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.114795
		GasToDust   0.25
		Particles   1211
		GasBright   0.131028
		DustBright  0.17746
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   29.3986
		Period          149.907
		Eccentricity    0.95515
		Inclination     106.482
		AscendingNode   -103.034
		ArgOfPericenter -93.4792
		MeanAnomaly     62.7468
	}
}

Comet	"Domir C117"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            5.43559e-011
	Radius          5.0353
	InertiaMoment   0.398074

	Oblateness      0.124826

	RotationPeriod  13.358
	Obliquity       27.0161
	EqAscendNode    286.3

	AbsMagn         14.9807
	SlopeParam      6.079
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.585 0.397 0.326)

	Surface
	{
		SurfStyle       0.921251
		OceanStyle      0.867115
		Randomize      (-0.230, -0.754, 0.337)
		colorDistMagn   0.986876
		colorDistFreq   0.00881936
		detailScale     137.497
		colorConversion true
		snowLevel       2
		tropicLatitude  0.733267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.280732
		terraceProb     0.103094
		erosion         0
		montesMagn      0.464601
		montesFreq      3.22839
		montesSpiky     0.913666
		montesFraction  0.574662
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0510829
		hillsFraction   0.652037
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220566
		craterFreq      0.16952
		craterDensity   1.00508
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.487178
		volcanoTemp     1590.09
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.199, 0.139, 0.130, 0.050)
		colorShelf     (0.234, 0.163, 0.150, 0.040)
		colorBeach     (0.269, 0.186, 0.170, 0.030)
		colorDesert    (0.304, 0.210, 0.192, 0.020)
		colorLowland   (0.339, 0.234, 0.212, 0.030)
		colorUpland    (0.374, 0.258, 0.232, 0.050)
		colorRock      (0.409, 0.282, 0.258, 0.020)
		colorSnow      (0.409, 0.282, 0.258, 1.000)
		BumpHeight      4.53177
		BumpOffset      0.906354
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.595987
		GasToDust   0.25
		Particles   2183
		GasBright   0.383631
		DustBright  0.409344
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   20.2145
		Period          85.4725
		Eccentricity    0.950754
		Inclination     106.379
		AscendingNode   -10.3473
		ArgOfPericenter -64.5786
		MeanAnomaly     -172.432
	}
}

Comet	"Domir C118"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            4.20404e-007
	Radius          108.89
	InertiaMoment   0.399797

	Oblateness      0.249

	RotationPeriod  10.3636
	Obliquity       340.222
	EqAscendNode    270.877

	AbsMagn         9.24058
	SlopeParam      7.56807
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.765 0.763 0.761)

	Surface
	{
		SurfStyle       0.392513
		OceanStyle      0.485293
		Randomize      (-0.803, 0.210, 0.987)
		colorDistMagn   0.0246033
		colorDistFreq   9.1218
		detailScale     2973.41
		colorConversion true
		snowLevel       2
		tropicLatitude  0.831598
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.635292
		terraceProb     0.101665
		erosion         0
		montesMagn      0.396254
		montesFreq      3.20597
		montesSpiky     0.984402
		montesFraction  0.722964
		dunesFraction   0
		hillsMagn       0
		hillsFreq       31.1614
		hillsFraction   0.483179
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247246
		craterFreq      0.376209
		craterDensity   0.872625
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.529938
		volcanoTemp     1643.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.306, 0.305, 0.304, 0.000)
		colorShelf     (0.325, 0.324, 0.324, 0.000)
		colorBeach     (0.344, 0.343, 0.343, 0.000)
		colorDesert    (0.364, 0.362, 0.362, 0.000)
		colorLowland   (0.383, 0.381, 0.381, 0.000)
		colorUpland    (0.402, 0.400, 0.400, 0.000)
		colorRock      (0.421, 0.419, 0.419, 0.000)
		colorSnow      (0.440, 0.438, 0.438, 1.000)
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
		GasBright   0.0204508
		DustBright  0.45701
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   17.9063
		Period          71.2592
		Eccentricity    0.871401
		Inclination     -130.365
		AscendingNode   102.106
		ArgOfPericenter 17.1115
		MeanAnomaly     -152.311
	}
}

Comet	"Domir C119"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            1.29446e-014
	Radius          0.311795
	InertiaMoment   0.398659

	Oblateness      0.249

	RotationPeriod  7.08327
	Obliquity       293.427
	EqAscendNode    255.455

	AbsMagn         5.71629
	SlopeParam      2.54541
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.725 0.598 0.543)

	Surface
	{
		SurfStyle       0.537025
		OceanStyle      0.30404
		Randomize      (-0.389, 0.224, 0.781)
		colorDistMagn   0.0264534
		colorDistFreq   5.65954e-005
		detailScale     8.51409
		colorConversion true
		snowLevel       2
		tropicLatitude  0.99874
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.573596
		terraceProb     0.257504
		erosion         0
		montesMagn      0.238886
		montesFreq      3.12133
		montesSpiky     0.936704
		montesFraction  0.233096
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000242748
		hillsFraction   0.718858
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252423
		craterFreq      0.175997
		craterDensity   0.957094
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.503964
		volcanoTemp     1606.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.283, 0.203, 0.152, 0.000)
		colorShelf     (0.290, 0.209, 0.174, 0.000)
		colorBeach     (0.341, 0.245, 0.206, 0.000)
		colorDesert    (0.370, 0.263, 0.201, 0.000)
		colorLowland   (0.406, 0.281, 0.228, 0.000)
		colorUpland    (0.449, 0.341, 0.277, 0.000)
		colorRock      (0.486, 0.371, 0.299, 0.000)
		colorSnow      (0.529, 0.395, 0.315, 1.000)
		BumpHeight      0.280616
		BumpOffset      0.0561231
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.147621
		GasToDust   0.25
		Particles   1278
		GasBright   0.0980009
		DustBright  0.863946
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   22.0874
		Period          97.6226
		Eccentricity    0.970684
		Inclination     -28.0796
		AscendingNode   -21.8157
		ArgOfPericenter 85.972
		MeanAnomaly     57.34
	}
}

Comet	"Domir C120"
{
	ParentBody     "Domir"
	Class	       "Asteroid"

	Mass            1.00117e-010
	Radius          6.74417
	InertiaMoment   0.396567

	Oblateness      0.249

	RotationPeriod  3.42252
	Obliquity       246.633
	EqAscendNode    240.032

	AbsMagn         14.1763
	SlopeParam      3.20554
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.746 0.744 0.743)

	Surface
	{
		SurfStyle       0.596475
		OceanStyle      0.711079
		Randomize      (0.136, 0.192, -0.537)
		colorDistMagn   0.855727
		colorDistFreq   0.018128
		detailScale     184.161
		colorConversion true
		snowLevel       2
		tropicLatitude  0.914665
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.389251
		terraceProb     0.412695
		erosion         0
		montesMagn      0.390644
		montesFreq      2.96552
		montesSpiky     0.967
		montesFraction  0.721187
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.109674
		hillsFraction   0.543566
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.273026
		craterFreq      0.241554
		craterDensity   1.03651
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.509092
		volcanoTemp     1144.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.291, 0.253, 0.208, 0.000)
		colorShelf     (0.299, 0.260, 0.238, 0.000)
		colorBeach     (0.351, 0.305, 0.282, 0.000)
		colorDesert    (0.381, 0.327, 0.275, 0.000)
		colorLowland   (0.418, 0.349, 0.312, 0.000)
		colorUpland    (0.463, 0.424, 0.379, 0.000)
		colorRock      (0.500, 0.461, 0.408, 0.000)
		colorSnow      (0.545, 0.491, 0.431, 1.000)
		BumpHeight      6.06975
		BumpOffset      1.21395
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.628813
		GasToDust   0.25
		Particles   2250
		GasBright   0.104026
		DustBright  0.542408
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   18.8911
		Period          77.218
		Eccentricity    0.907458
		Inclination     95.3789
		AscendingNode   -118.878
		ArgOfPericenter 66.2994
		MeanAnomaly     -165.731
	}
}

