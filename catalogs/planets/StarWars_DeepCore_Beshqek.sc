// http://starwars.wikia.com/wiki/Byss
// Region : Deep Core
// Sector : 
// Grid location : K11
// X : -721.1, Y : -2731.02, Z : -274.4621174514146
Planet	"Chel"
{
	ParentBody     "Beshqek"
	Class	       "Selena"

	Mass            0.086846
	Radius          3028.58
	InertiaMoment   0.339679

	Obliquity       -2.43978
	EqAscendNode    172.891
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.777 0.774 0.772)

	Surface
	{
		SurfStyle       0.451931
		OceanStyle      0.608251
		Randomize      (0.762, 0.092, -0.737)
		colorDistMagn   0.0548915
		colorDistFreq   438.016
		detailScale     7789.67
		colorConversion true
		drivenDarkening 0
		seaLevel        0.238002
		snowLevel       2
		tropicLatitude  0.00528155
		icecapLatitude  10
		icecapHeight    0.177324
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.73946
		venusFreq       0.765297
		venusMagn       0
		mareFreq        1.46086
		mareDensity     0.0149362
		terraceProb     0.119127
		erosion         0
		montesMagn      0.182568
		montesFreq      146.161
		montesSpiky     0.968571
		montesFraction  0.937282
		dunesMagn       0.0364056
		dunesFreq       3996.92
		dunesFraction   0.0172073
		hillsMagn       0.126992
		hillsFreq       383.26
		hillsFraction   0.158288
		hills2Fraction  0
		riversMagn      56.839
		riversFreq      2.84095
		riversSin       6.25084
		riversOctaves   0
		canyonsMagn     0.539496
		canyonsFreq     1.16904
		canyonFraction  0.298894
		cracksMagn      0.0479799
		cracksFreq      1.34768
		cracksOctaves   0
		craterMagn      0.607907
		craterFreq      6.05607
		craterDensity   0.851913
		craterOctaves   12
		craterRayedFactor 0.110143
		volcanoMagn     0.641216
		volcanoFreq     0.817907
		volcanoDensity  0.26136
		volcanoOctaves  3
		volcanoActivity 0.178562
		volcanoFlows    0.0781133
		volcanoRadius   0.392871
		volcanoTemp     1583.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.420, 0.420, 0.430, 0.000)
		colorShelf     (0.470, 0.480, 0.480, 0.000)
		colorBeach     (0.427, 0.441, 0.463, 0.000)
		colorDesert    (0.373, 0.356, 0.355, 0.000)
		colorLowland   (0.474, 0.472, 0.432, 0.000)
		colorUpland    (0.505, 0.503, 0.471, 0.000)
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

	Atmosphere
	{
		Model          "Sun"
		Height          151.429
		Density         2.23158e-008
		Pressure        1.54925e-008
		Greenhouse      0.00216023
		Bright          0.5
		Opacity         0
		SkyLight        0.166667
		Hue             0.0121397
		Saturation      1

		Composition
		{
			Kr    	96.5514
			Xe    	3.44864
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.115517
		Period          0.0399652
		Eccentricity    0.00962153
		Inclination     -2.43978
		AscendingNode   172.891
		ArgOfPericenter 346.44
		MeanAnomaly     3.98227
	}
}


Planet	"Abanol"
{
	ParentBody     "Beshqek"
	Class	       "Desert"

	Mass            1.78413
	Radius          8913.74
	InertiaMoment   0.326348

	Obliquity       0.715514
	EqAscendNode    -314.641
	TidalLocked     true

	AlbedoBond      0.268062
	AlbedoGeom      0.321674
	Brightness      2
	Color          (0.829 0.617 0.302)

	Surface
	{
		SurfStyle       0.298894
		OceanStyle      0.507119
		Randomize      (0.875, -0.966, -0.683)
		colorDistMagn   0.064807
		colorDistFreq   1196.13
		detailScale     22926.6
		colorConversion true
		seaLevel        0.123556
		snowLevel       2
		tropicLatitude  0.0230436
		icecapLatitude  10
		icecapHeight    0.151592
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        0.428451
		venusFreq       0.506413
		venusMagn       0.470764
		mareFreq        1.82957
		mareDensity     0.169537
		terraceProb     0.226432
		erosion         0
		montesMagn      0.238771
		montesFreq      459.652
		montesSpiky     0.967838
		montesFraction  0.330207
		dunesMagn       0.0488335
		dunesFreq       79.2524
		dunesFraction   0.609882
		hillsMagn       0.138968
		hillsFreq       713.179
		hillsFraction   0
		hills2Fraction  0
		riversMagn      53.6807
		riversFreq      3.83547
		riversSin       7.72112
		riversOctaves   0
		canyonsMagn     0.0321926
		canyonsFreq     226.521
		canyonFraction  0
		cracksMagn      0.119419
		cracksFreq      0.967369
		cracksOctaves   0
		craterMagn      0.634324
		craterFreq      17.6525
		craterDensity   0.323088
		craterOctaves   5.45627
		volcanoMagn     0.688591
		volcanoFreq     0.725293
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.293615
		volcanoRadius   0.582151
		volcanoTemp     1514.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1
		stripeTwist     3.5
		cycloneMagn     1.08358
		cycloneDensity  0.34054
		cycloneOctaves  0
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
		Hapke           0.693278
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Clouds
	{
		Height          14.2754
		Velocity        143.51
		BumpHeight      4.27555
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.0947
		mainOctaves     10
		Coverage        0.136124
		stripeZones     1
		stripeTwist     3.5
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Titan"
		Height          148.793
		Density         0.0306722
		Pressure        0.0677329
		Greenhouse      21.2083
		Bright          7.89494
		Opacity         1
		SkyLight        2.63165
		Hue             0
		Saturation      1

		Composition
		{
			H2O   	83.2656
			NH3   	5.34327
			CH4   	5.0804
			CO2   	4.51598
			H2S   	0.718379
			SO2   	0.50478
			C2H4  	0.169993
			N2    	0.138115
			C2H2  	0.137853
			C2H6  	0.0846703
			C3H8  	0.0402582
			CO    	0.000556261
			Ne    	9.82781e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.248641
		Period          0.126203
		Eccentricity    0.04652
		Inclination     0.715514
		AscendingNode   -314.641
		ArgOfPericenter 59.4871
		MeanAnomaly     167.449
	}
}




DwarfMoon	"Abanol.D1"
{
	ParentBody     "Abanol"
	Class	       "Asteroid"

	Mass            1.30843e-008
	Radius          15.5121
	InertiaMoment   0.397464

	Obliquity       25.1036
	EqAscendNode    131.988
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.405 0.401 0.399)

	Surface
	{
		SurfStyle       0.379642
		OceanStyle      0.542668
		Randomize      (-0.984, -0.053, -0.961)
		colorDistMagn   0.695928
		colorDistFreq   0.100401
		detailScale     423.585
		colorConversion true
		snowLevel       2
		tropicLatitude  0.340022
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.313542
		terraceProb     0.212238
		erosion         0
		montesMagn      0.536176
		montesFreq      3.33646
		montesSpiky     0.974739
		montesFraction  0.213535
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.485433
		hillsFraction   0.931946
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238408
		craterFreq      0.156006
		craterDensity   0.704009
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.372298
		volcanoTemp     1478.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.162, 0.160, 0.159, 0.000)
		colorShelf     (0.172, 0.171, 0.169, 0.000)
		colorBeach     (0.182, 0.181, 0.179, 0.000)
		colorDesert    (0.192, 0.191, 0.189, 0.000)
		colorLowland   (0.203, 0.201, 0.199, 0.000)
		colorUpland    (0.213, 0.211, 0.209, 0.000)
		colorRock      (0.223, 0.221, 0.219, 0.000)
		colorSnow      (0.233, 0.231, 0.229, 1.000)
		BumpHeight      13.9609
		BumpOffset      2.79218
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00034323
		Eccentricity    0.000332
		Inclination     0.103625
		AscendingNode   131.988
		ArgOfPericenter -54.4583
		MeanAnomaly     -95.3209
	}
}


Planet	"Polos"
{
	ParentBody     "Beshqek"
	Class	       "Desert"

	Mass            1.54446
	Radius          7032.6
	InertiaMoment   0.328313

	Oblateness      0.00251949

	RotationPeriod  25.5787
	Obliquity       -0.218611
	EqAscendNode    173.609

	AlbedoBond      0.373925
	AlbedoGeom      0.44871
	Brightness      2
	Color          (1.000 0.827 0.611)

	Surface
	{
		SurfStyle       0.799206
		OceanStyle      0.477835
		Randomize      (0.490, 0.360, 0.650)
		colorDistMagn   0.0796494
		colorDistFreq   1005.11
		detailScale     18088.3
		colorConversion true
		drivenDarkening -1
		seaLevel        0.0186661
		snowLevel       0.85
		tropicLatitude  0.000488281
		icecapLatitude  1
		icecapHeight    0.146444
		climatePole     0.888889
		climateTropic   0.769841
		climateEquator  0.555556
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        0.645569
		venusFreq       0.85
		venusMagn       0
		mareFreq        1.79206
		mareDensity     0.21386
		terraceProb     0.196958
		erosion         0
		montesMagn      0.183978
		montesFreq      297.615
		montesSpiky     0.901635
		montesFraction  0.211363
		dunesMagn       0.0499761
		dunesFreq       80.6097
		dunesFraction   0.629883
		hillsMagn       0.118954
		hillsFreq       887.794
		hillsFraction   0
		hills2Fraction  0
		riversMagn      54.9409
		riversFreq      2.00524
		riversSin       6.76427
		riversOctaves   0
		canyonsMagn     0.0365917
		canyonsFreq     100
		canyonFraction  0
		cracksMagn      0.0956039
		cracksFreq      0.374059
		cracksOctaves   0
		craterMagn      0.704503
		craterFreq      21.4327
		craterDensity   0
		craterOctaves   0
		craterRayedFactor 0
		volcanoMagn     0.687202
		volcanoFreq     0.856722
		volcanoDensity  0.297534
		volcanoOctaves  3
		volcanoActivity 0.53755
		volcanoFlows    0.489827
		volcanoRadius   0.418495
		volcanoTemp     1345.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1
		stripeFluct     0
		stripeTwist     1.135
		cycloneMagn     0.829382
		cycloneFreq     0.667395
		cycloneDensity  0.334809
		cycloneOctaves  0
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
		BumpHeight      17.7445
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
		Height          12.5225
		Velocity        118.936
		BumpHeight      3.65043
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.05656
		mainOctaves     10
		Coverage        0.34785
		stripeZones     1
		stripeFluct     0
		stripeTwist     1.135
	}

	Clouds
	{
		Height          16.1733
		Velocity        53.2388
		BumpHeight      3.65043
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.05656
		mainOctaves     10
		Coverage        0.34785
		stripeZones     1
		stripeFluct     0
		stripeTwist     1.135
	}

	Clouds
	{
		Height          19.8237
		Velocity        193.872
		BumpHeight      3.65043
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.05656
		mainOctaves     10
		Coverage        0.34785
		stripeZones     1
		stripeFluct     0
		stripeTwist     1.135
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          47.6611
		Density         1.25871
		Pressure        0.811309
		Greenhouse      3.71035
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.460317
		Saturation      1.04762

		Composition
		{
			CO2   	50.8907
			SO2   	28.0772
			H2O   	20.6002
			N2    	0.426146
			CO    	0.00333315
			Ar    	0.00140676
			NH3   	0.00062727
			CH4   	0.000156145
			C2H4  	9.17797e-005
			C2H2  	4.63233e-005
			Ne    	1.25072e-005
			H2S   	1.12949e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.48949
		Period          0.3486
		Eccentricity    0.0426263
		Inclination     -0.218611
		AscendingNode   173.609
		ArgOfPericenter 223.221
		MeanAnomaly     145.734
	}
}



DwarfMoon	"Polos.D1"
{
	ParentBody     "Polos"
	Class	       "Asteroid"

	Mass            9.59448e-009
	Radius          28.8433
	InertiaMoment   0.399634

	Oblateness      0.202553

	Obliquity       -0.00109474
	EqAscendNode    -66.2885
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.643 0.589 0.499)

	Surface
	{
		SurfStyle       0.969453
		OceanStyle      0.263726
		Randomize      (0.299, 0.856, -0.607)
		colorDistMagn   0.826673
		colorDistFreq   0.298284
		detailScale     787.616
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.513569
		terraceProb     0.424873
		erosion         0
		montesMagn      0.572591
		montesFreq      3.46647
		montesSpiky     0.95074
		montesFraction  0.251162
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.9662
		hillsFraction   0.664078
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.197981
		craterFreq      0.197723
		craterDensity   0.846975
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.489875
		volcanoTemp     1467.24
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.219, 0.206, 0.200, 0.050)
		colorShelf     (0.257, 0.242, 0.229, 0.040)
		colorBeach     (0.296, 0.277, 0.259, 0.030)
		colorDesert    (0.334, 0.312, 0.294, 0.020)
		colorLowland   (0.373, 0.348, 0.324, 0.030)
		colorUpland    (0.411, 0.383, 0.354, 0.050)
		colorRock      (0.450, 0.418, 0.394, 0.020)
		colorSnow      (0.450, 0.418, 0.394, 1.000)
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
		SemiMajorAxis   0.000192001
		Period          0.00123807
		Eccentricity    4.91565e-006
		Inclination     -0.00109474
		AscendingNode   -66.2885
		ArgOfPericenter 94.0957
		MeanAnomaly     115.525
	}
}


Planet	"Relus"
{
	ParentBody     "Beshqek"
	Class	       "Terra"

	Mass            1.27305
	Radius          7143.4
	InertiaMoment   0.331377

	Oblateness      0.00634628

	RotationPeriod  28.3451
	Obliquity       -12.0725
	EqAscendNode    -21.5508

	AlbedoBond      0.3026
	AlbedoGeom      0.3447
	Brightness      1.5
	Color          (0.642 0.613 0.585)

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
		OceanStyle      0.0172073
		Randomize      (-0.737, -0.096, 0.217)
		colorDistMagn   0.0862323
		colorDistFreq   692.576
		detailScale     18373.2
		colorConversion true
		drivenDarkening -1
		seaLevel        0.540122
		snowLevel       1
		tropicLatitude  0.214331
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.793651
		climateTropic   0.579365
		climateEquator  0.126984
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.1084
		venusFreq       1
		venusMagn       0.348486
		mareFreq        4.19975
		mareDensity     0.0609106
		terraceProb     0.196958
		erosion         0.127076
		montesMagn      0.228982
		montesFreq      309.681
		montesSpiky     0.945997
		montesFraction  0.298894
		dunesMagn       0.0512639
		dunesFreq       74.952
		dunesFraction   0.507119
		hillsMagn       0.132397
		hillsFreq       930.526
		hillsFraction   0.827534
		hills2Fraction  0.570084
		riversMagn      58.8519
		riversFreq      3.1753
		riversSin       6.77185
		riversOctaves   2
		canyonsMagn     0.0367623
		canyonsFreq     100
		canyonFraction  0.880845
		cracksMagn      0.104059
		cracksFreq      0.43527
		cracksOctaves   0
		craterMagn      0.586919
		craterFreq      18.7612
		craterDensity   0.133638
		craterOctaves   11
		craterRayedFactor 0
		volcanoMagn     0.758907
		volcanoFreq     0.772643
		volcanoDensity  0.224728
		volcanoOctaves  3
		volcanoActivity 0.53474
		volcanoFlows    0.56568
		volcanoRadius   0.436853
		volcanoTemp     1712.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.42857
		stripeFluct     0.047619
		stripeTwist     0.3674
		cycloneMagn     13.1746
		cycloneFreq     1.14286
		cycloneDensity  0.690476
		cycloneOctaves  3
		colorSea       (0.040, 0.100, 0.200, 1.000)
		colorShelf     (0.150, 0.480, 0.460, 1.000)
		colorBeach     (0.400, 0.330, 0.280, 0.000)
		colorDesert    (0.260, 0.240, 0.220, 0.000)
		colorLowland   (0.500, 0.420, 0.350, 0.000)
		colorUpland    (0.240, 0.210, 0.210, 0.000)
		colorRock      (0.220, 0.210, 0.210, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.308)
		colorLowPlants (0.185, 0.186, 0.037, 0.000)
		colorUpPlants  (0.357, 0.344, 0.047, 0.000)
		BumpHeight      19.8526
		BumpOffset      10.507
		DiffMapAlpha   "Water"
		SpecBrightWater 0.65
		SpecBrightIce   0.85
		SpecularPower   55
		Hapke           0.967733
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Clouds
	{
		Height          9.3999
		Velocity        72.4681
		BumpHeight      3.4561
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.0544
		mainOctaves     9
		Coverage        0.41465
		stripeZones     1.42857
		stripeFluct     0.047619
		stripeTwist     0.3674
	}

	Ocean
	{
		Height          10.7228
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
	}

	Ocean
	{
		Height          10.507
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
	}

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          48.0174
		Density         0.841164
		Pressure        0.730511
		Greenhouse      17.5694
		Bright          10.0321
		Opacity         1
		SkyLight        3.27738
		Hue             0.4722		Saturation      1

		Composition
		{
			N2    	73.243
			O2    	24.4604
			Ar    	1.72372
			H2O   	0.5148
			CO2   	0.05154
			Ne    	0.00656332
		}
	}

	Aurora
	{
		Height      67.6287
		NorthLat    73.3611
		NorthLon    -130.401
		NorthRadius 2370.83
		NorthWidth  751.078
		NorthRings  3		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -90
		SouthLon    13.848
		SouthRadius 1801.77
		SouthWidth  583.706
		SouthRings  3		SouthBright 0.3
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
		SemiMajorAxis   0.640871
		Period          0.522237
		Eccentricity    0.02184
		Inclination     -0.331925
		AscendingNode   -24.0698
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}



Moon	"Relus.1"
{
	ParentBody     "Relus"
	Class	       "Selena"

	Mass            0.00294302
	Radius          1126.72
	InertiaMoment   0.399017

	Obliquity       -0.4853
	EqAscendNode    50.6086

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.537 0.533 0.528)

	Surface
	{
		SurfStyle       0.47292
		OceanStyle      0.792192
		Randomize      (-0.290, -0.926, 0.376)
		colorDistMagn   0.0598619
		colorDistFreq   105.151
		detailScale     2898
		colorConversion true
		drivenDarkening 0
		seaLevel        0.13292
		snowLevel       2
		tropicLatitude  0.359306
		icecapLatitude  10
		icecapHeight    0.173092
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.55994
		venusFreq       1.58073
		venusMagn       0
		mareFreq        0.37998
		mareDensity     0.000923003
		terraceProb     0.153136
		erosion         0
		montesMagn      0.0666174
		montesFreq      64.0207
		montesSpiky     0.850024
		montesFraction  0.17486
		dunesMagn       0.0391458
		dunesFreq       1473.07
		dunesFraction   0.700993
		hillsMagn       0.139563
		hillsFreq       120.31
		hillsFraction   0.802888
		hills2Fraction  0
		riversMagn      59.6836
		riversFreq      4.12936
		riversSin       5.3692
		riversOctaves   0
		canyonsMagn     0.335155
		canyonsFreq     0.378175
		canyonFraction  0.781761
		cracksMagn      0.0588441
		cracksFreq      0.388784
		cracksOctaves   0
		craterMagn      0.597954
		craterFreq      2.40109
		craterDensity   0.980313
		craterOctaves   10
		craterRayedFactor 0.209637
		volcanoMagn     0.175472
		volcanoFreq     0.724178
		volcanoDensity  0.194224
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.177688
		volcanoRadius   0.146103
		volcanoTemp     1209
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.420, 0.420, 0.430, 0.000)
		colorShelf     (0.470, 0.480, 0.480, 0.000)
		colorBeach     (0.295, 0.304, 0.317, 0.000)
		colorDesert    (0.258, 0.245, 0.243, 0.000)
		colorLowland   (0.327, 0.325, 0.296, 0.000)
		colorUpland    (0.349, 0.346, 0.322, 0.000)
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
		SemiMajorAxis   0.00173484
		Eccentricity    0.0344835
		Inclination     -7.35592
		AscendingNode   48.8143
		ArgOfPericenter 284.16
		MeanAnomaly     328.463
	}
}


Planet	"Byss"
{
	ParentBody     "Beshqek"
	Class	       "Terra"

	Mass            3.10655
	Radius          10796
	InertiaMoment   0.328888

	Oblateness      0.0031163

	RotationPeriod  30.8774
	Obliquity       -24.2811
	EqAscendNode    -21.0894

	AlbedoBond      0.311
	AlbedoGeom      0.367
	Brightness      1.5
	Color          (0.411 0.341 0.301)

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine/Terrestrial"
		Panspermia "false"
	}

	Surface
	{
		SurfStyle       0.546097
		OceanStyle      0.13128
		Randomize      (0.286, 0.508, 0.794)
		colorDistMagn   0.0555794
		colorDistFreq   1340.8
		detailScale     27767.9
		colorConversion true
		drivenDarkening -1
		seaLevel        0.558276
		snowLevel       0.85
		tropicLatitude  0.416035
		icecapLatitude  0.931574
		icecapHeight    0.140786
		climatePole     0.865079
		climateTropic   0.349206
		climateEquator  0.555556
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.714286
		venusFreq       0.85
		venusMagn       0.2843
		mareFreq        0.001
		mareDensity     0
		terraceProb     0.196958
		erosion         0.116406
		montesMagn      0.238771
		montesFreq      500
		montesSpiky     0.967838
		montesFraction  0.0172073
		dunesMagn       0.0488335
		dunesFreq       95.9876
		dunesFraction   0.158288
		hillsMagn       0.128161
		hillsFreq       863.777
		hillsFraction   0.298894
		hills2Fraction  0.507119
		riversMagn      5.55556
		riversFreq      3.83547
		riversSin       7.72112
		riversOctaves   2
		canyonsMagn     0.0321926
		canyonsFreq     100
		canyonFraction  0.880845
		cracksMagn      0.119419
		cracksFreq      1.17164
		cracksOctaves   0
		craterMagn      0.660514
		craterFreq      21.38
		craterDensity   0
		craterOctaves   0
		craterRayedFactor 0
		volcanoMagn     0.603175
		volcanoFreq     0.301587
		volcanoDensity  0.253968
		volcanoOctaves  2
		volcanoActivity 0.253968
		volcanoFlows    0.18254
		volcanoRadius   0.452381
		volcanoTemp     1514.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.69226
		stripeFluct     0
		stripeTwist     0.24771
		cycloneMagn     0.47619
		cycloneFreq     0.238095
		cycloneDensity  0.482975
		cycloneOctaves  1
		colorSea       (0.040, 0.100, 0.200, 1.000)
		colorShelf     (0.150, 0.480, 0.460, 1.000)
		colorBeach     (0.400, 0.330, 0.280, 0.000)
		colorDesert    (0.260, 0.240, 0.220, 0.000)
		colorLowland   (0.500, 0.420, 0.350, 0.000)
		colorUpland    (0.240, 0.210, 0.210, 0.000)
		colorRock      (0.220, 0.210, 0.210, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.308)
		colorLowPlants (0.100, 0.160, 0.070, 0.000)
		colorUpPlants  (0.090, 0.110, 0.040, 0.000)
		BumpHeight      19.207
		BumpOffset      10.7228
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
		Height          8.34082
		Velocity        64.484
		BumpHeight      4.50215
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.9323
		mainOctaves     10
		Coverage        0.261905
		stripeZones     1.69226
		stripeFluct     0
		stripeTwist     0.24771
	}

	Ocean
	{
		Height          10.7228
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
	}

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          53.98
		Pressure        0.997019
		Greenhouse		32.859
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0
		Saturation      1

		Composition
		{
	N2 77.455640214   O2 22.11308  H2O 0.38154 CO2 0.0481  Ar 0.001484 Ne 0.000155786	}
	}

	Aurora
	{
		Height      181.139
		NorthLat    89.2979
		NorthLon    74.4132
		NorthRadius 3118.16
		NorthWidth  675.458
		NorthRings  2
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -68.2555
		SouthLon    252.033
		SouthRadius 3211.21
		SouthWidth  1076.92
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
		PeriodDays      266.317575
		Eccentricity    0.0123872
		Inclination     -0.332029
		AscendingNode   -24.0995
		ArgOfPericenter 267.84
		MeanAnomaly     37.8412
	}
}



DwarfMoon	"Byss.D1"
{
	ParentBody     "Byss"
	Class	       "Asteroid"

	Mass            6.78075e-009
	Radius          27.0583
	InertiaMoment   0.39805

	Oblateness      0.249

	Obliquity       0.00213466
	EqAscendNode    -145.769
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.418 0.415 0.413)

	Surface
	{
		SurfStyle       0.424769
		OceanStyle      0.44241
		Randomize      (0.309, 0.215, 0.917)
		colorDistMagn   0.377707
		colorDistFreq   0.358124
		detailScale     738.871
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.512886
		terraceProb     0.371631
		erosion         0
		montesMagn      0.652343
		montesFreq      2.69244
		montesSpiky     0.874003
		montesFraction  0.697397
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.93953
		hillsFraction   0.538562
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254198
		craterFreq      0.206496
		craterDensity   0.780016
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.454421
		volcanoTemp     1389.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.167, 0.166, 0.165, 0.000)
		colorShelf     (0.178, 0.176, 0.175, 0.000)
		colorBeach     (0.188, 0.187, 0.186, 0.000)
		colorDesert    (0.198, 0.197, 0.196, 0.000)
		colorLowland   (0.209, 0.208, 0.206, 0.000)
		colorUpland    (0.219, 0.218, 0.217, 0.000)
		colorRock      (0.230, 0.228, 0.227, 0.000)
		colorSnow      (0.240, 0.239, 0.237, 1.000)
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
		SemiMajorAxis   0.0002789
		Eccentricity    6.18983e-005
		Inclination     0.00213466
		AscendingNode   -145.769
		ArgOfPericenter -85.9578
		MeanAnomaly     -41.7597
	}
}



DwarfMoon	"Byss.D2"
{
	ParentBody     "Byss"
	Class	       "Asteroid"

	Mass            9.28356e-009
	Radius          15.5528
	InertiaMoment   0.399174

	Oblateness      0.0339254

	Obliquity       0.00140364
	EqAscendNode    -140.962
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.722 0.720 0.718)

	Surface
	{
		SurfStyle       0.114196
		OceanStyle      0.161813
		Randomize      (0.733, 0.052, 0.073)
		colorDistMagn   0.734507
		colorDistFreq   0.101611
		detailScale     424.695
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.316371
		terraceProb     0.260268
		erosion         0
		montesMagn      0.460733
		montesFreq      3.21261
		montesSpiky     0.944355
		montesFraction  0.710221
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.836718
		hillsFraction   0.789585
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24861
		craterFreq      0.240679
		craterDensity   0.75736
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.540258
		volcanoTemp     1342.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.289, 0.288, 0.287, 0.000)
		colorShelf     (0.307, 0.306, 0.305, 0.000)
		colorBeach     (0.325, 0.324, 0.323, 0.000)
		colorDesert    (0.343, 0.342, 0.341, 0.000)
		colorLowland   (0.361, 0.360, 0.359, 0.000)
		colorUpland    (0.379, 0.378, 0.377, 0.000)
		colorRock      (0.397, 0.396, 0.395, 0.000)
		colorSnow      (0.415, 0.414, 0.413, 1.000)
		BumpHeight      13.9975
		BumpOffset      2.7995
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000301464
		Eccentricity    3.29913e-005
		Inclination     0.00140364
		AscendingNode   -140.962
		ArgOfPericenter 143.9
		MeanAnomaly     -154.837
	}
}

Moon	"Byss.1"
{
	ParentBody     "Byss"
	Class	       "Desert"

	Mass            0.045461
	Radius          2766.42
	InertiaMoment   0.345345

	Oblateness      0.00304397

	Obliquity       0.065283
	EqAscendNode    81.6404
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.912 0.860 0.841)

	Surface
	{
		SurfStyle       0.118254
		OceanStyle      0.144749
		Randomize      (0.147, 0.102, 0.653)
		colorDistMagn   0.06722
		colorDistFreq   345.589
		detailScale     7115.39
		colorConversion true
		drivenDarkening -1
		seaLevel        0.117972
		snowLevel       1
		tropicLatitude  0.00172633
		icecapLatitude  0.893577
		icecapHeight    0.124277
		climatePole     0.222222
		climateTropic   0.111111
		climateEquator  0.0634921
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.751122
		venusFreq       1
		venusMagn       0.464882
		mareFreq        1.73914
		mareDensity     0.0119874
		terraceProb     0.211526
		erosion         0
		montesMagn      0.175493
		montesFreq      132.294
		montesSpiky     0.942579
		montesFraction  0.692339
		dunesMagn       0.0326828
		dunesFreq       22.6758
		dunesFraction   0.391585
		hillsMagn       0.124997
		hillsFreq       369.916
		hillsFraction   0
		hills2Fraction  0
		riversMagn      60.1341
		riversFreq      4.13729
		riversSin       6.33442
		riversOctaves   0
		canyonsMagn     0.0586558
		canyonsFreq     77.7982
		canyonFraction  0
		cracksMagn      0.0649772
		cracksFreq      0.214435
		cracksOctaves   0
		craterMagn      0.589118
		craterFreq      8.11463
		craterDensity   0.941735
		craterOctaves   12
		craterRayedFactor 0
		volcanoMagn     0.528245
		volcanoFreq     0.574362
		volcanoDensity  0.333838
		volcanoOctaves  3
		volcanoActivity 0.41421
		volcanoFlows    0.950534
		volcanoRadius   0.440389
		volcanoTemp     1506.44
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
		Model          "Neptune"
		Height          40.486
		Density         0.00789974
		Pressure        0.0041788
		Greenhouse      0.368781
		Bright          9.68254
		Opacity         1
		SkyLight        3.1746
		Hue             0.015873
		Saturation      0.31746

		Composition
		{
			CO2   	99.3907
			Ar    	0.368598
			Cl2   	0.236477
			Ne    	0.0042116
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000526801
		Period          0.00393872
		Eccentricity    4.613e-005
		Inclination     0.065283
		AscendingNode   81.6404
		ArgOfPericenter -31.3103
		MeanAnomaly     38.6849
	}
}



Moon	"Byss.2"
{
	ParentBody     "Byss"
	Class	       "Selena"

	Mass            0.0049137
	Radius          1204.81
	InertiaMoment   0.388895

	Obliquity       2.4813
	EqAscendNode    -76.1024
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.924 0.876 0.813)

	Surface
	{
		SurfStyle       0.692339
		OceanStyle      0.391585
		Randomize      (-0.572, -0.711, -0.552)
		colorDistMagn   0.06722
		colorDistFreq   150.508
		detailScale     3098.84
		colorConversion true
		drivenDarkening 0
		seaLevel        0.181133
		snowLevel       2
		tropicLatitude  0.0681443
		icecapLatitude  10
		icecapHeight    0.146672
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.81435
		venusFreq       1.25953
		venusMagn       0
		mareFreq        0.480483
		mareDensity     0.003183
		terraceProb     0.440255
		erosion         0
		montesMagn      0.0590889
		montesFreq      57.6159
		montesSpiky     0.942579
		montesFraction  0.331594
		dunesMagn       0.0246598
		dunesFreq       1577.57
		dunesFraction   0.389908
		hillsMagn       0.119363
		hillsFreq       150.287
		hillsFraction   0.355077
		hills2Fraction  0
		riversMagn      68.1537
		riversFreq      3.23371
		riversSin       6.02238
		riversOctaves   0
		canyonsMagn     0.617825
		canyonsFreq     0.468738
		canyonFraction  0.0369976
		cracksMagn      0.0242459
		cracksFreq      0.41485
		cracksOctaves   0
		craterMagn      0.589118
		craterFreq      3.53402
		craterDensity   0.941735
		craterOctaves   10
		craterRayedFactor 0
		volcanoMagn     0.161056
		volcanoFreq     0.820279
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 0.750722
		volcanoFlows    0.252819
		volcanoRadius   0.126155
		volcanoTemp     1543.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.430, 0.400, 0.370, 0.000)
		colorShelf     (0.620, 0.600, 0.530, 0.000)
		colorBeach     (0.387, 0.379, 0.333, 0.000)
		colorDesert    (0.406, 0.385, 0.339, 0.000)
		colorLowland   (0.319, 0.285, 0.259, 0.000)
		colorUpland    (0.468, 0.441, 0.382, 0.000)
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
		SemiMajorAxis   0.00106841
		Period          0.01145
		Eccentricity    0.016702
		Inclination     2.4813
		AscendingNode   -76.1024
		ArgOfPericenter 144.261
		MeanAnomaly     36.8613
	}
}



DwarfMoon	"Byss.D3"
{
	ParentBody     "Byss"
	Class	       "Asteroid"

	Mass            1.26643e-008
	Radius          30.2657
	InertiaMoment   0.395648

	Oblateness      0.0647084

	Obliquity       50.2616
	EqAscendNode    -167.266
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.824 0.767 0.733)

	Surface
	{
		SurfStyle       0.946285
		OceanStyle      0.0815325
		Randomize      (-0.822, -0.765, -0.950)
		colorDistMagn   0.908229
		colorDistFreq   0.78131
		detailScale     826.456
		colorConversion true
		snowLevel       2
		tropicLatitude  0.169936
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.616962
		terraceProb     0.230584
		erosion         0
		montesMagn      0.481609
		montesFreq      3.46263
		montesSpiky     0.962856
		montesFraction  0.819157
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.22931
		hillsFraction   0.747923
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247827
		craterFreq      0.251688
		craterDensity   0.786325
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.498183
		volcanoTemp     1596.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.280, 0.269, 0.293, 0.050)
		colorShelf     (0.330, 0.315, 0.337, 0.040)
		colorBeach     (0.379, 0.361, 0.381, 0.030)
		colorDesert    (0.429, 0.407, 0.433, 0.020)
		colorLowland   (0.478, 0.453, 0.477, 0.030)
		colorUpland    (0.528, 0.499, 0.521, 0.050)
		colorRock      (0.577, 0.545, 0.579, 0.020)
		colorSnow      (0.577, 0.545, 0.579, 1.000)
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
		SemiMajorAxis   0.0026082
		Eccentricity    0.076164
		Inclination     50.2616
		AscendingNode   -167.266
		ArgOfPericenter 60.6421
		MeanAnomaly     83.4848
	}
}


Planet	"Kissarm"
{
	ParentBody     "Beshqek"
	Class	       "GasGiant"

	Mass            568.095
	Radius          76013.2
	InertiaMoment   0.224403

	Oblateness      0.0552112

	RotationPeriod  8.44546
	Obliquity       -70.1756
	EqAscendNode    -21.8028

	AlbedoBond      0.462954
	AlbedoGeom      0.555544
	Brightness      2

	Surface
	{
		SurfStyle       0.816441
		Randomize      (-0.259, 0.857, -0.690)
		detailScale     195510
		colorConversion true
		tropicLatitude  0.933347
		icecapLatitude  1
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     4.66245
		stripeFluct     0.317074
		stripeTwist     12.41
		cycloneMagn     7.75371
		cycloneFreq     0.851577
		cycloneDensity  0.406914
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
		BumpHeight      10.0003
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          26.8672
		Velocity        2112.23
		BumpHeight      16.8637
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.08088
		mainOctaves     12
		Coverage        0.129537
		stripeZones     4.66245
		stripeFluct     0.317074
		stripeTwist     12.41
	}

	Clouds
	{
		Height          43.7266
		Velocity        334.022
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		ModulateColor  (1.000 1.000 1.000 0.790)
		mainFreq        1.08088
		mainOctaves     12
		Coverage        0.129537
		stripeZones     4.66245
		stripeFluct     0.317074
		stripeTwist     12.41
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          178.638
		Density         7794.86
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.554852
		Saturation      0.778779

		Composition
		{
			H2    	91.971
			He    	7.97426
			N2    	0.0398553
			O2    	0.00971926
			CH4   	0.00315363
			Ne    	0.00119467
			Ar    	0.00084627
		}
	}

	Aurora
	{
		Height      2937.65
		NorthLat    84.3339
		NorthLon    -141.786
		NorthRadius 17526.3
		NorthWidth  8563.95
		NorthRings  4
		NorthBright 1
		NorthParticles 10000
		SouthLat    -83.2415
		SouthLon    37.9807
		SouthRadius 15269.5
		SouthWidth  7488.24
		SouthRings  3
		SouthBright 1
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	Rings
	{
		InnerRadius     112553
		OuterRadius     120564
		RotationPeriod  4.62581
		RotationOffset  0
		FrontBright     0.786626
		BackBright      0.677347
		Density         0.878821
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.35126
		Eccentricity    0.0620596
		Inclination     1.33014
		AscendingNode   -24.1419
		ArgOfPericenter 154.691
		MeanAnomaly     196.968
	}
}


Moon	"Kissarm.1"
{
	ParentBody     "Kissarm"
	Class	       "Desert"

	Mass            0.10813
	Radius          3210.1
	InertiaMoment   0.329317

	Oblateness      0.00485058

	Obliquity       -0.00728036
	EqAscendNode    -60.7888
	TidalLocked     true

	AlbedoBond      0.380289
	AlbedoGeom      0.456347
	Brightness      2
	Color          (0.905 0.805 0.666)

	Surface
	{
		SurfStyle       0.792192
		OceanStyle      0.17486
		Randomize      (-0.926, 0.376, -0.054)
		colorDistMagn   0.0597027
		colorDistFreq   407.731
		detailScale     8256.56
		colorConversion true
		seaLevel        0.129929
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  10
		icecapHeight    0.121438
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        1.10307
		venusFreq       0.371745
		venusMagn       0
		mareFreq        0.838979
		mareDensity     0.0365268
		terraceProb     0.405839
		erosion         0
		montesMagn      0.245476
		montesFreq      197.136
		montesSpiky     0.934332
		montesFraction  0.616847
		dunesMagn       0.0664301
		dunesFreq       30.1603
		dunesFraction   0.0416487
		hillsMagn       0.135058
		hillsFreq       355.421
		hillsFraction   0
		hills2Fraction  0
		riversMagn      56.9518
		riversFreq      2.51108
		riversSin       6.80524
		riversOctaves   0
		canyonsMagn     0.01102
		canyonsFreq     87.4201
		canyonFraction  0
		cracksMagn      0.0780352
		cracksFreq      0.289174
		cracksOctaves   0
		craterMagn      0.631537
		craterFreq      8.1845
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.73998
		volcanoFreq     0.698659
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.779783
		volcanoRadius   0.50233
		volcanoTemp     1850.39
		lavaCoverTidal  0.519097
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.14129
		stripeTwist     0
		cycloneMagn     2.33196
		cycloneFreq     0.722105
		cycloneDensity  0.438699
		cycloneOctaves  3
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
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Clouds
	{
		Height          15.6904
		Velocity        143.51
		BumpHeight      5.69041
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.08248
		mainOctaves     10
		Coverage        0.360578
		stripeZones     1.14129
		stripeTwist     0
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Mars"
		Height          141.127
		Density         2.61628
		Pressure        1.84058
		Greenhouse      5.56402
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0
		Saturation      1

		Composition
		{
			CO2   	97.4844
			SO2   	2.2709
			N2    	0.24341
			CO    	0.00126129
			Ar    	3.74352e-005
		}
	}

	Aurora
	{
		Height      53.5414
		NorthLat    77.5654
		NorthLon    172.401
		NorthRadius 836.754
		NorthWidth  272.248
		NorthRings  4
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -61.8123
		SouthLon    332.202
		SouthRadius 708.952
		SouthWidth  222.429
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
		SemiMajorAxis   0.00217181
		Period          0.00245562
		Eccentricity    0.0195155
		Inclination     -0.00728036
		AscendingNode   -60.7888
		ArgOfPericenter 85.9016
		MeanAnomaly     164.013
	}
}




Moon	"Kissarm.2"
{
	ParentBody     "Kissarm"
	Class	       "IceWorld"

	Mass            0.00011762
	Radius          406.79
	InertiaMoment   0.398388

	Obliquity       0.0647396
	EqAscendNode    7.1328
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.569 0.562 0.554)

	Surface
	{
		SurfStyle       0.924122
		OceanStyle      0.724276
		Randomize      (0.372, 0.317, 0.720)
		colorDistMagn   0.0550707
		colorDistFreq   57.8097
		detailScale     1046.29
		colorConversion true
		drivenDarkening 0.7
		seaLevel        0.222214
		snowLevel       2
		tropicLatitude  0.00226407
		icecapLatitude  0.838046
		icecapHeight    0.229046
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.91285
		venusFreq       0.986008
		venusMagn       0.155249
		mareFreq        0
		mareDensity     0.000138915
		terraceProb     0.389157
		erosion         0
		montesMagn      0.0706185
		montesFreq      18.1405
		montesSpiky     0.977295
		montesFraction  0.785839
		dunesMagn       0.0516832
		dunesFreq       530.713
		dunesFraction   0.253849
		hillsMagn       0.135857
		hillsFreq       44.7776
		hillsFraction   0.0342424
		hills2Fraction  0.154018
		riversMagn      62.4512
		riversFreq      2.06111
		riversSin       5.13213
		riversOctaves   0
		canyonsMagn     0.374137
		canyonsFreq     0.177202
		canyonFraction  0
		cracksMagn      0.0769001
		cracksFreq      0.0995177
		cracksOctaves   0
		craterMagn      0.648043
		craterFreq      1.02722
		craterDensity   0.902826
		craterOctaves   9
		craterRayedFactor 0
		volcanoMagn     0.157794
		volcanoFreq     0.492009
		volcanoDensity  0.183915
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.065639
		volcanoRadius   0.150304
		volcanoTemp     1630.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.433, 0.399, 0.322, 1.000)
		colorShelf     (0.433, 0.399, 0.322, 1.000)
		colorBeach     (0.398, 0.349, 0.277, 1.000)
		colorDesert    (0.398, 0.349, 0.277, 1.000)
		colorLowland   (0.484, 0.455, 0.421, 1.000)
		colorUpland    (0.507, 0.500, 0.477, 1.000)
		colorRock      (0.930, 0.910, 0.860, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.484, 0.455, 0.421, 1.000)
		colorUpPlants  (0.507, 0.500, 0.477, 1.000)
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
		SemiMajorAxis   0.00497001
		Period          0.00850169
		Eccentricity    0.0368928
		Inclination     0.0647396
		AscendingNode   7.1328
		ArgOfPericenter 65.4513
		MeanAnomaly     9.64512
	}
}



Moon	"Kissarm.3"
{
	ParentBody     "Kissarm"
	Class	       "IceWorld"

	Mass            0.000498148
	Radius          697.922
	InertiaMoment   0.397639

	Obliquity       1.36775
	EqAscendNode    -127.218
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.800 0.607 0.550)

	Surface
	{
		SurfStyle       0.84004
		OceanStyle      0.82159
		Randomize      (-0.386, 0.744, 0.822)
		colorDistMagn   0.0549213
		colorDistFreq   86.4319
		detailScale     1795.09
		colorConversion true
		drivenDarkening 0.7
		seaLevel        0.171182
		snowLevel       2
		tropicLatitude  0.021218
		icecapLatitude  0.883347
		icecapHeight    0.181098
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.0735
		venusFreq       0.620489
		venusMagn       0
		mareFreq        0.0696736
		mareDensity     0.000221546
		terraceProb     0.175277
		erosion         0
		montesMagn      0.0499803
		montesFreq      29.2351
		montesSpiky     0.957626
		montesFraction  0.874299
		dunesMagn       0.0384506
		dunesFreq       933.929
		dunesFraction   0.50302
		hillsMagn       0.104461
		hillsFreq       87.0003
		hillsFraction   0.231752
		hills2Fraction  0.220517
		riversMagn      59.7914
		riversFreq      3.01769
		riversSin       4.30074
		riversOctaves   0
		canyonsMagn     0.496701
		canyonsFreq     0.2126
		canyonFraction  0
		cracksMagn      0.0540391
		cracksFreq      0.260964
		cracksOctaves   0
		craterMagn      0.567983
		craterFreq      1.81213
		craterDensity   0.770747
		craterOctaves   10
		craterRayedFactor 0.175359
		volcanoMagn     0.152327
		volcanoFreq     0.774707
		volcanoDensity  0.189776
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.325819
		volcanoRadius   0.139732
		volcanoTemp     1638.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.800, 0.455, 0.316, 0.000)
		colorShelf     (0.760, 0.432, 0.300, 0.000)
		colorBeach     (0.400, 0.227, 0.158, 0.000)
		colorDesert    (0.680, 0.387, 0.269, 0.000)
		colorLowland   (0.648, 0.400, 0.300, 0.000)
		colorUpland    (0.744, 0.423, 0.294, 0.000)
		colorRock      (1.000, 1.000, 1.000, 0.500)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.648, 0.400, 0.300, 0.000)
		colorUpPlants  (0.744, 0.423, 0.294, 0.000)
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
		SemiMajorAxis   0.0075184
		Period          0.0158182
		Eccentricity    0.0174921
		Inclination     1.36775
		AscendingNode   -127.218
		ArgOfPericenter -124.458
		MeanAnomaly     -32.9401
	}
}



Moon	"Kissarm.4"
{
	ParentBody     "Kissarm"
	Class	       "IceWorld"

	Mass            0.000938516
	Radius          810.356
	InertiaMoment   0.396166

	Obliquity       1.25634
	EqAscendNode    19.1529
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.489 0.479 0.474)

	Surface
	{
		SurfStyle       0.303024
		OceanStyle      0.908081
		Randomize      (-0.090, -0.493, 0.071)
		colorDistMagn   0.0770445
		colorDistFreq   96.7435
		detailScale     2084.28
		colorConversion true
		drivenDarkening 0.625458
		seaLevel        0.186703
		snowLevel       2
		tropicLatitude  0.0432297
		icecapLatitude  0.747987
		icecapHeight    0.198664
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.62554
		venusFreq       0.890579
		venusMagn       0
		mareFreq        0.163646
		mareDensity     0.000633619
		terraceProb     0.347058
		erosion         0
		montesMagn      0.0691305
		montesFreq      39.4445
		montesSpiky     0.933873
		montesFraction  0.605107
		dunesMagn       0.0298311
		dunesFreq       1072.03
		dunesFraction   0.760778
		hillsMagn       0.133629
		hillsFreq       83.5655
		hillsFraction   0.908449
		hills2Fraction  0.158053
		riversMagn      66.9784
		riversFreq      2.73726
		riversSin       6.60267
		riversOctaves   0
		canyonsMagn     0.405956
		canyonsFreq     0.210887
		canyonFraction  0
		cracksMagn      0.0732211
		cracksFreq      0.369002
		cracksOctaves   0
		craterMagn      0.56932
		craterFreq      2.22313
		craterDensity   0.791931
		craterOctaves   10
		craterRayedFactor 0.132664
		volcanoMagn     0.19275
		volcanoFreq     0.634279
		volcanoDensity  0.236329
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.245973
		volcanoRadius   0.141741
		volcanoTemp     1730.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.489, 0.479, 0.474, 0.500)
		colorShelf     (0.464, 0.455, 0.451, 0.500)
		colorBeach     (0.342, 0.335, 0.332, 0.750)
		colorDesert    (0.415, 0.407, 0.403, 1.000)
		colorLowland   (0.430, 0.422, 0.417, 1.000)
		colorUpland    (0.455, 0.446, 0.441, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.430, 0.422, 0.417, 1.000)
		colorUpPlants  (0.455, 0.446, 0.441, 1.000)
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
		SemiMajorAxis   0.0113735
		Period          0.0294312
		Eccentricity    0.0213351
		Inclination     1.25634
		AscendingNode   19.1529
		ArgOfPericenter -123.603
		MeanAnomaly     -27.7484
	}
}



Moon	"Kissarm.5"
{
	ParentBody     "Kissarm"
	Class	       "IceWorld"

	Mass            0.00145472
	Radius          995.404
	InertiaMoment   0.39968

	Obliquity       -0.873858
	EqAscendNode    -42.9203
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.557 0.547 0.539)

	Surface
	{
		SurfStyle       0.802104
		OceanStyle      0.864562
		Randomize      (0.988, 0.929, 0.835)
		colorDistMagn   0.0831519
		colorDistFreq   134.301
		detailScale     2560.24
		colorConversion true
		drivenDarkening 0.413457
		seaLevel        0.14694
		snowLevel       2
		tropicLatitude  0.0283847
		icecapLatitude  0.474824
		icecapHeight    0.195007
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.86948
		venusFreq       1.14418
		venusMagn       0
		mareFreq        0.266019
		mareDensity     0.000477478
		terraceProb     0.374541
		erosion         0
		montesMagn      0.0469504
		montesFreq      39.0128
		montesSpiky     0.973849
		montesFraction  0.757634
		dunesMagn       0.0550745
		dunesFreq       1290.85
		dunesFraction   0.151162
		hillsMagn       0.114048
		hillsFreq       128.612
		hillsFraction   0.575272
		hills2Fraction  0.0631986
		riversMagn      49.147
		riversFreq      3.38486
		riversSin       7.6425
		riversOctaves   0
		canyonsMagn     0.354514
		canyonsFreq     0.405841
		canyonFraction  0
		cracksMagn      0.0285757
		cracksFreq      0.452641
		cracksOctaves   0
		craterMagn      0.580624
		craterFreq      3.50417
		craterDensity   0.834989
		craterOctaves   10
		craterRayedFactor 0.2488
		volcanoMagn     0.168873
		volcanoFreq     0.66402
		volcanoDensity  0.2321
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.308456
		volcanoRadius   0.126279
		volcanoTemp     1616.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.557, 0.410, 0.310, 0.000)
		colorShelf     (0.529, 0.390, 0.294, 0.000)
		colorBeach     (0.278, 0.205, 0.155, 0.000)
		colorDesert    (0.473, 0.349, 0.263, 0.000)
		colorLowland   (0.451, 0.361, 0.294, 0.000)
		colorUpland    (0.518, 0.381, 0.288, 0.000)
		colorRock      (1.000, 1.000, 1.000, 0.500)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.451, 0.361, 0.294, 0.000)
		colorUpPlants  (0.518, 0.381, 0.288, 0.000)
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
		SemiMajorAxis   0.0172052
		Period          0.0547595
		Eccentricity    0.00484487
		Inclination     -0.873858
		AscendingNode   -42.9203
		ArgOfPericenter 7.05867
		MeanAnomaly     110.058
	}
}



Moon	"Kissarm.6"
{
	ParentBody     "Kissarm"
	Class	       "IceWorld"

	Mass            0.0205559
	Radius          2237.59
	InertiaMoment   0.363056

	Obliquity       0.43802
	EqAscendNode    -126.671
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.801 0.767 0.724)

	Surface
	{
		SurfStyle       0.889783
		OceanStyle      0.897043
		Randomize      (0.571, 0.257, 0.486)
		colorDistMagn   0.0726429
		colorDistFreq   322.266
		detailScale     5755.21
		colorConversion true
		drivenDarkening 0.273315
		seaLevel        0.027576
		snowLevel       2
		tropicLatitude  0.00686201
		icecapLatitude  0.833646
		icecapHeight    0.0324755
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.68982
		venusFreq       0.907762
		venusMagn       0
		mareFreq        0.904247
		mareDensity     0.00293271
		terraceProb     0.318433
		erosion         0
		montesMagn      0.162646
		montesFreq      87.2643
		montesSpiky     0.907519
		montesFraction  0.0692621
		dunesMagn       0.0380954
		dunesFreq       2953.58
		dunesFraction   0.752312
		hillsMagn       0.111575
		hillsFreq       227.314
		hillsFraction   0.646482
		hills2Fraction  0.105478
		riversMagn      58.2617
		riversFreq      2.05405
		riversSin       6.71291
		riversOctaves   0
		canyonsMagn     0.462241
		canyonsFreq     0.749043
		canyonFraction  0
		cracksMagn      0.0401163
		cracksFreq      0.925081
		cracksOctaves   2
		craterMagn      0.602581
		craterFreq      7.19463
		craterDensity   0.874026
		craterOctaves   11
		craterRayedFactor 0.141697
		volcanoMagn     0.444753
		volcanoFreq     0.804846
		volcanoDensity  0.200351
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.187295
		volcanoRadius   0.336149
		volcanoTemp     1249.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.801, 0.575, 0.416, 0.000)
		colorShelf     (0.761, 0.546, 0.395, 0.000)
		colorBeach     (0.401, 0.288, 0.208, 0.000)
		colorDesert    (0.681, 0.489, 0.354, 0.000)
		colorLowland   (0.649, 0.506, 0.395, 0.000)
		colorUpland    (0.745, 0.535, 0.387, 0.000)
		colorRock      (1.000, 1.000, 1.000, 0.500)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.649, 0.506, 0.395, 0.000)
		colorUpPlants  (0.745, 0.535, 0.387, 0.000)
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
		SemiMajorAxis   0.0260272
		Period          0.101883
		Eccentricity    0.0397036
		Inclination     0.43802
		AscendingNode   -126.671
		ArgOfPericenter -175.543
		MeanAnomaly     81.2652
	}
}


Moon	"Kissarm.7"
{
	ParentBody     "Kissarm"
	Class	       "Selena"

	Mass            0.00254302
	Radius          1126.72
	InertiaMoment   0.399017

	Oblateness      0.00134823

	TidalLocked true
	Obliquity       -0.04853
	EqAscendNode    50.6086

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.537 0.533 0.528)

	Surface
	{
		SurfStyle       0.47292
		OceanStyle      0.792192
		Randomize      (-0.290, -0.926, 0.376)
		colorDistMagn   0.0598619
		colorDistFreq   105.151
		detailScale     2898
		colorConversion true
		drivenDarkening 0
		seaLevel        0.13292
		snowLevel       2
		tropicLatitude  0.359306
		icecapLatitude  10
		icecapHeight    0.173092
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.55994
		venusFreq       1.58073
		venusMagn       0
		mareFreq        0.37998
		mareDensity     0.000923003
		terraceProb     0.153136
		erosion         0
		montesMagn      0.0666174
		montesFreq      64.0207
		montesSpiky     0.850024
		montesFraction  0.17486
		dunesMagn       0.0391458
		dunesFreq       1473.07
		dunesFraction   0.700993
		hillsMagn       0.139563
		hillsFreq       120.31
		hillsFraction   0.802888
		hills2Fraction  0
		riversMagn      59.6836
		riversFreq      4.12936
		riversSin       5.3692
		riversOctaves   0
		canyonsMagn     0.335155
		canyonsFreq     0.378175
		canyonFraction  0.781761
		cracksMagn      0.0588441
		cracksFreq      0.388784
		cracksOctaves   0
		craterMagn      0.597954
		craterFreq      2.40109
		craterDensity   0.980313
		craterOctaves   10
		craterRayedFactor 0.209637
		volcanoMagn     0.175472
		volcanoFreq     0.724178
		volcanoDensity  0.194224
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.177688
		volcanoRadius   0.146103
		volcanoTemp     1209
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.420, 0.420, 0.430, 0.000)
		colorShelf     (0.470, 0.480, 0.480, 0.000)
		colorBeach     (0.295, 0.304, 0.317, 0.000)
		colorDesert    (0.258, 0.245, 0.243, 0.000)
		colorLowland   (0.327, 0.325, 0.296, 0.000)
		colorUpland    (0.349, 0.346, 0.322, 0.000)
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
		SemiMajorAxis   0.041394
		Eccentricity    0.0344835
		Inclination     -7.35592
		AscendingNode   48.8143
		ArgOfPericenter 284.16
		MeanAnomaly     328.463
	}
}


DwarfMoon	"Kissarm.D1"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            2.09732e-010
	Radius          8.08091
	InertiaMoment   0.399439

	RotationPeriod  1501.17
	Obliquity       -52.7635
	EqAscendNode    13.7822

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.465 0.460 0.452)

	Surface
	{
		SurfStyle       0.244546
		OceanStyle      0.349227
		Randomize      (-0.000, 0.786, 0.034)
		colorDistMagn   0.659915
		colorDistFreq   0.0538881
		detailScale     220.663
		colorConversion true
		snowLevel       2
		tropicLatitude  0.654896
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.265847
		terraceProb     0.288625
		erosion         0
		montesMagn      0.460189
		montesFreq      3.48517
		montesSpiky     0.865752
		montesFraction  0.697721
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.105897
		hillsFraction   0.595046
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222507
		craterFreq      0.266393
		craterDensity   0.873738
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.531767
		volcanoTemp     1730.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.186, 0.184, 0.181, 0.000)
		colorShelf     (0.198, 0.195, 0.192, 0.000)
		colorBeach     (0.209, 0.207, 0.204, 0.000)
		colorDesert    (0.221, 0.218, 0.215, 0.000)
		colorLowland   (0.233, 0.230, 0.226, 0.000)
		colorUpland    (0.244, 0.241, 0.238, 0.000)
		colorRock      (0.256, 0.253, 0.249, 0.000)
		colorSnow      (0.267, 0.264, 0.260, 1.000)
		BumpHeight      7.27282
		BumpOffset      1.45456
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.212194
		Period          2.37175
		Eccentricity    0.403137
		Inclination     -89.1606
		AscendingNode   16.1656
		ArgOfPericenter -138.913
		MeanAnomaly     -75.5819
	}
}



DwarfMoon	"Kissarm.D2"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            3.23083e-010
	Radius          8.57879
	InertiaMoment   0.396964

	RotationPeriod  1275.37
	Obliquity       13.0833
	EqAscendNode    -83.6988

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.734 0.630 0.593)

	Surface
	{
		SurfStyle       0.0386559
		OceanStyle      0.958752
		Randomize      (-0.359, 0.905, 0.599)
		colorDistMagn   0.458912
		colorDistFreq   0.011088
		detailScale     234.258
		colorConversion true
		snowLevel       2
		tropicLatitude  0.722648
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.349478
		terraceProb     0.437817
		erosion         0
		montesMagn      0.295695
		montesFreq      2.79794
		montesSpiky     0.986265
		montesFraction  0.499344
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.173341
		hillsFraction   0.749074
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246136
		craterFreq      0.173237
		craterDensity   0.899822
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.567673
		volcanoTemp     1551.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.294, 0.252, 0.237, 0.000)
		colorShelf     (0.312, 0.268, 0.252, 0.000)
		colorBeach     (0.330, 0.284, 0.267, 0.000)
		colorDesert    (0.349, 0.299, 0.282, 0.000)
		colorLowland   (0.367, 0.315, 0.297, 0.000)
		colorUpland    (0.385, 0.331, 0.311, 0.000)
		colorRock      (0.404, 0.347, 0.326, 0.000)
		colorSnow      (0.422, 0.362, 0.341, 1.000)
		BumpHeight      7.72091
		BumpOffset      1.54418
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.212525
		Period          2.3773
		Eccentricity    0.201072
		Inclination     43.2553
		AscendingNode   -83.2673
		ArgOfPericenter -45.2748
		MeanAnomaly     -13.1476
	}
}



DwarfMoon	"Kissarm.D3"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            4.85698e-010
	Radius          11.7532
	InertiaMoment   0.398584

	RotationPeriod  1428.1
	Obliquity       -21.8119
	EqAscendNode    33.4572

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.576 0.571 0.568)

	Surface
	{
		SurfStyle       0.975816
		OceanStyle      0.784383
		Randomize      (0.750, 0.467, 0.030)
		colorDistMagn   0.0746403
		colorDistFreq   0.103384
		detailScale     320.94
		colorConversion true
		snowLevel       2
		tropicLatitude  0.939933
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.502376
		terraceProb     0.314741
		erosion         0
		montesMagn      0.403309
		montesFreq      3.31394
		montesSpiky     0.89277
		montesFraction  0.286624
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.406543
		hillsFraction   0.531907
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251879
		craterFreq      0.275194
		craterDensity   0.796516
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.507816
		volcanoTemp     1719.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.196, 0.200, 0.227, 0.050)
		colorShelf     (0.230, 0.234, 0.261, 0.040)
		colorBeach     (0.265, 0.268, 0.295, 0.030)
		colorDesert    (0.300, 0.303, 0.335, 0.020)
		colorLowland   (0.334, 0.337, 0.369, 0.030)
		colorUpland    (0.369, 0.371, 0.403, 0.050)
		colorRock      (0.403, 0.406, 0.449, 0.020)
		colorSnow      (0.403, 0.406, 0.449, 1.000)
		BumpHeight      10.5779
		BumpOffset      2.11557
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.213016
		Period          2.38554
		Eccentricity    0.391161
		Inclination     -51.9865
		AscendingNode   38.0896
		ArgOfPericenter 66.2166
		MeanAnomaly     179.025
	}
}



DwarfMoon	"Kissarm.D4"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            7.15737e-010
	Radius          12.7443
	InertiaMoment   0.399568

	RotationPeriod  1273.32
	Obliquity       101.806
	EqAscendNode    47.3121

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.744 0.742 0.741)

	Surface
	{
		SurfStyle       0.0179745
		OceanStyle      0.302045
		Randomize      (0.904, -0.666, 0.191)
		colorDistMagn   0.8353
		colorDistFreq   0.102897
		detailScale     348.003
		colorConversion true
		snowLevel       2
		tropicLatitude  0.769943
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.631026
		terraceProb     0.12371
		erosion         0
		montesMagn      0.52002
		montesFreq      3.13906
		montesSpiky     0.836325
		montesFraction  0.502193
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.298847
		hillsFraction   0.636737
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232122
		craterFreq      0.196451
		craterDensity   0.669311
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.420779
		volcanoTemp     1466.09
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.298, 0.297, 0.296, 0.000)
		colorShelf     (0.316, 0.315, 0.315, 0.000)
		colorBeach     (0.335, 0.334, 0.333, 0.000)
		colorDesert    (0.353, 0.352, 0.352, 0.000)
		colorLowland   (0.372, 0.371, 0.370, 0.000)
		colorUpland    (0.390, 0.389, 0.389, 0.000)
		colorRock      (0.409, 0.408, 0.408, 0.000)
		colorSnow      (0.428, 0.426, 0.426, 1.000)
		BumpHeight      11.4698
		BumpOffset      2.29397
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.213541
		Period          2.39436
		Eccentricity    0.485187
		Inclination     87.1325
		AscendingNode   50.0401
		ArgOfPericenter 132.646
		MeanAnomaly     -48.5278
	}
}



DwarfMoon	"Kissarm.D5"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            1.03749e-009
	Radius          13.854
	InertiaMoment   0.397311

	RotationPeriod  1143.39
	Obliquity       -2.24975
	EqAscendNode    84.0246

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.759 0.757 0.755)

	Surface
	{
		SurfStyle       0.225784
		OceanStyle      0.0413544
		Randomize      (-0.098, 0.851, -0.470)
		colorDistMagn   0.900928
		colorDistFreq   0.0278204
		detailScale     378.306
		colorConversion true
		snowLevel       2
		tropicLatitude  0.471721
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.663683
		terraceProb     0.294742
		erosion         0
		montesMagn      0.460151
		montesFreq      2.84192
		montesSpiky     0.968376
		montesFraction  0.554056
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.371524
		hillsFraction   0.870887
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261897
		craterFreq      0.21471
		craterDensity   0.933148
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.509218
		volcanoTemp     1569.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.304, 0.303, 0.302, 0.000)
		colorShelf     (0.323, 0.322, 0.321, 0.000)
		colorBeach     (0.342, 0.341, 0.340, 0.000)
		colorDesert    (0.361, 0.359, 0.359, 0.000)
		colorLowland   (0.380, 0.378, 0.378, 0.000)
		colorUpland    (0.399, 0.397, 0.396, 0.000)
		colorRock      (0.418, 0.416, 0.415, 0.000)
		colorSnow      (0.436, 0.435, 0.434, 1.000)
		BumpHeight      12.4686
		BumpOffset      2.49372
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.214145
		Period          2.40453
		Eccentricity    0.18454
		Inclination     28.4131
		AscendingNode   81.1113
		ArgOfPericenter 102.81
		MeanAnomaly     -63.1194
	}
}



DwarfMoon	"Kissarm.D6"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            1.48343e-009
	Radius          14.6743
	InertiaMoment   0.39874

	RotationPeriod  1012.8
	Obliquity       -20.7922
	EqAscendNode    -80.5163

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.476 0.425 0.372)

	Surface
	{
		SurfStyle       0.0930174
		OceanStyle      0.94282
		Randomize      (0.238, -0.600, -0.505)
		colorDistMagn   0.241113
		colorDistFreq   0.176075
		detailScale     400.706
		colorConversion true
		snowLevel       2
		tropicLatitude  0.35307
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.59554
		terraceProb     0.387752
		erosion         0
		montesMagn      0.482868
		montesFreq      2.63198
		montesSpiky     0.995526
		montesFraction  0.348981
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.543524
		hillsFraction   0.714092
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264165
		craterFreq      0.235689
		craterDensity   0.765632
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.527656
		volcanoTemp     1466.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.190, 0.170, 0.149, 0.000)
		colorShelf     (0.202, 0.181, 0.158, 0.000)
		colorBeach     (0.214, 0.191, 0.167, 0.000)
		colorDesert    (0.226, 0.202, 0.177, 0.000)
		colorLowland   (0.238, 0.213, 0.186, 0.000)
		colorUpland    (0.250, 0.223, 0.195, 0.000)
		colorRock      (0.262, 0.234, 0.205, 0.000)
		colorSnow      (0.274, 0.244, 0.214, 1.000)
		BumpHeight      13.2068
		BumpOffset      2.64137
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.21453
		Period          2.41102
		Eccentricity    0.447601
		Inclination     1.06746
		AscendingNode   -82.3062
		ArgOfPericenter -48.0196
		MeanAnomaly     178.916
	}
}



DwarfMoon	"Kissarm.D7"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            2.09691e-009
	Radius          19.3166
	InertiaMoment   0.399695

	RotationPeriod  1122.71
	Obliquity       -118.185
	EqAscendNode    -63.8024

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.720 0.715 0.712)

	Surface
	{
		SurfStyle       0.798779
		OceanStyle      0.135998
		Randomize      (0.369, 0.442, -0.247)
		colorDistMagn   0.401158
		colorDistFreq   0.182827
		detailScale     527.473
		colorConversion true
		snowLevel       2
		tropicLatitude  0.883929
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.501135
		terraceProb     0.450229
		erosion         0
		montesMagn      0.431964
		montesFreq      2.70477
		montesSpiky     0.92594
		montesFraction  0.251613
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.00971
		hillsFraction   0.722311
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243617
		craterFreq      0.260082
		craterDensity   0.811891
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.570271
		volcanoTemp     1310.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.281, 0.243, 0.199, 0.000)
		colorShelf     (0.288, 0.250, 0.228, 0.000)
		colorBeach     (0.338, 0.293, 0.270, 0.000)
		colorDesert    (0.367, 0.315, 0.263, 0.000)
		colorLowland   (0.403, 0.336, 0.299, 0.000)
		colorUpland    (0.446, 0.408, 0.363, 0.000)
		colorRock      (0.482, 0.443, 0.391, 0.000)
		colorSnow      (0.525, 0.472, 0.413, 1.000)
		BumpHeight      17.385
		BumpOffset      3.47699
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.214828
		Period          2.41605
		Eccentricity    0.213368
		Inclination     -78.6297
		AscendingNode   -64.3172
		ArgOfPericenter 169.174
		MeanAnomaly     3.55155
	}
}



DwarfMoon	"Kissarm.D8"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            2.93594e-009
	Radius          20.5211
	InertiaMoment   0.397592

	RotationPeriod  1003.5
	Obliquity       -33.915
	EqAscendNode    167.572

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.453 0.448 0.444)

	Surface
	{
		SurfStyle       0.304667
		OceanStyle      0.813239
		Randomize      (-0.087, 0.668, -0.479)
		colorDistMagn   0.347479
		colorDistFreq   0.136355
		detailScale     560.364
		colorConversion true
		snowLevel       2
		tropicLatitude  0.515663
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.443527
		terraceProb     0.102619
		erosion         0
		montesMagn      0.419561
		montesFreq      2.64997
		montesSpiky     0.91671
		montesFraction  0.357604
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.975734
		hillsFraction   0.509532
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244238
		craterFreq      0.239238
		craterDensity   0.843918
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.497129
		volcanoTemp     1476.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.181, 0.179, 0.178, 0.000)
		colorShelf     (0.193, 0.190, 0.189, 0.000)
		colorBeach     (0.204, 0.202, 0.200, 0.000)
		colorDesert    (0.215, 0.213, 0.211, 0.000)
		colorLowland   (0.227, 0.224, 0.222, 0.000)
		colorUpland    (0.238, 0.235, 0.233, 0.000)
		colorRock      (0.249, 0.246, 0.244, 0.000)
		colorSnow      (0.261, 0.258, 0.255, 1.000)
		BumpHeight      18.469
		BumpOffset      3.69381
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.215349
		Period          2.42483
		Eccentricity    0.281346
		Inclination     -2.9892
		AscendingNode   164.619
		ArgOfPericenter -163.084
		MeanAnomaly     -107.105
	}
}



DwarfMoon	"Kissarm.D9"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            4.07817e-009
	Radius          21.9941
	InertiaMoment   0.398889

	RotationPeriod  912.857
	Obliquity       -41.7639
	EqAscendNode    -1.54636

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.597 0.499 0.409)

	Surface
	{
		SurfStyle       0.497123
		OceanStyle      0.210751
		Randomize      (-0.650, 0.174, -0.443)
		colorDistMagn   0.435374
		colorDistFreq   0.252403
		detailScale     600.586
		colorConversion true
		snowLevel       2
		tropicLatitude  0.884769
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.438978
		terraceProb     0.239079
		erosion         0
		montesMagn      0.516732
		montesFreq      2.94145
		montesSpiky     0.999416
		montesFraction  0.56871
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.982707
		hillsFraction   0.383212
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239314
		craterFreq      0.278269
		craterDensity   0.927076
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.45323
		volcanoTemp     1587.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.239, 0.200, 0.164, 0.000)
		colorShelf     (0.254, 0.212, 0.174, 0.000)
		colorBeach     (0.269, 0.225, 0.184, 0.000)
		colorDesert    (0.284, 0.237, 0.194, 0.000)
		colorLowland   (0.299, 0.250, 0.204, 0.000)
		colorUpland    (0.314, 0.262, 0.215, 0.000)
		colorRock      (0.328, 0.274, 0.225, 0.000)
		colorSnow      (0.343, 0.287, 0.235, 1.000)
		BumpHeight      19.7947
		BumpOffset      3.95894
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.215804
		Period          2.43253
		Eccentricity    0.347676
		Inclination     -20.5022
		AscendingNode   4.32678
		ArgOfPericenter -136.497
		MeanAnomaly     -38.4809
	}
}



DwarfMoon	"Kissarm.D10"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            5.62782e-009
	Radius          23.221
	InertiaMoment   0.399821

	RotationPeriod  820.293
	Obliquity       -8.40418
	EqAscendNode    38.4273

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.753 0.747 0.745)

	Surface
	{
		SurfStyle       0.949026
		OceanStyle      0.238367
		Randomize      (-0.060, 0.754, -0.070)
		colorDistMagn   0.619977
		colorDistFreq   0.144059
		detailScale     634.087
		colorConversion true
		snowLevel       2
		tropicLatitude  0.589488
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.472988
		terraceProb     0.326071
		erosion         0
		montesMagn      0.57787
		montesFreq      2.56322
		montesSpiky     0.896251
		montesFraction  0.938507
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.16151
		hillsFraction   0.763676
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.27647
		craterFreq      0.228747
		craterDensity   0.933592
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.498867
		volcanoTemp     1057.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.256, 0.262, 0.298, 0.050)
		colorShelf     (0.301, 0.306, 0.343, 0.040)
		colorBeach     (0.346, 0.351, 0.388, 0.030)
		colorDesert    (0.391, 0.396, 0.440, 0.020)
		colorLowland   (0.437, 0.441, 0.485, 0.030)
		colorUpland    (0.482, 0.486, 0.529, 0.050)
		colorRock      (0.527, 0.531, 0.589, 0.020)
		colorSnow      (0.527, 0.531, 0.589, 1.000)
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
		SemiMajorAxis   0.216377
		Period          2.44223
		Eccentricity    0.197519
		Inclination     -28.8774
		AscendingNode   34.0597
		ArgOfPericenter -152.227
		MeanAnomaly     75.2858
	}
}



DwarfMoon	"Kissarm.D11"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            7.72514e-009
	Radius          30.1531
	InertiaMoment   0.397833

	RotationPeriod  906.224
	Obliquity       -19.2132
	EqAscendNode    153.241

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.536 0.532 0.530)

	Surface
	{
		SurfStyle       0.604611
		OceanStyle      0.186134
		Randomize      (0.505, 0.167, -0.199)
		colorDistMagn   0.789508
		colorDistFreq   0.655895
		detailScale     823.38
		colorConversion true
		snowLevel       2
		tropicLatitude  0.552053
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.404061
		terraceProb     0.242661
		erosion         0
		montesMagn      0.632812
		montesFreq      2.87713
		montesSpiky     0.998223
		montesFraction  0.528939
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.81687
		hillsFraction   0.470873
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258345
		craterFreq      0.217344
		craterDensity   0.953186
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.521789
		volcanoTemp     1640.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.209, 0.181, 0.148, 0.000)
		colorShelf     (0.214, 0.186, 0.170, 0.000)
		colorBeach     (0.252, 0.218, 0.201, 0.000)
		colorDesert    (0.273, 0.234, 0.196, 0.000)
		colorLowland   (0.300, 0.250, 0.223, 0.000)
		colorUpland    (0.332, 0.303, 0.270, 0.000)
		colorRock      (0.359, 0.330, 0.292, 0.000)
		colorSnow      (0.391, 0.351, 0.308, 1.000)
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
		SemiMajorAxis   0.216918
		Period          2.45139
		Eccentricity    0.0536891
		Inclination     -50.0019
		AscendingNode   154.136
		ArgOfPericenter 96.3693
		MeanAnomaly     172.678
	}
}



DwarfMoon	"Kissarm.D12"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            1.05594e-008
	Radius          31.6328
	InertiaMoment   0.399032

	RotationPeriod  813.403
	Obliquity       -84.236
	EqAscendNode    -182.208

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.564 0.448 0.379)

	Surface
	{
		SurfStyle       0.202123
		OceanStyle      0.661921
		Randomize      (0.200, -0.554, 0.190)
		colorDistMagn   0.761037
		colorDistFreq   0.47468
		detailScale     863.786
		colorConversion true
		snowLevel       2
		tropicLatitude  0.351577
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.389887
		terraceProb     0.422773
		erosion         0
		montesMagn      0.576261
		montesFreq      3.88256
		montesSpiky     0.951205
		montesFraction  0.74507
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.80678
		hillsFraction   0.778358
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226706
		craterFreq      0.279134
		craterDensity   0.984607
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.512189
		volcanoTemp     1453.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.225, 0.179, 0.152, 0.000)
		colorShelf     (0.239, 0.190, 0.161, 0.000)
		colorBeach     (0.254, 0.202, 0.171, 0.000)
		colorDesert    (0.268, 0.213, 0.180, 0.000)
		colorLowland   (0.282, 0.224, 0.190, 0.000)
		colorUpland    (0.296, 0.235, 0.199, 0.000)
		colorRock      (0.310, 0.247, 0.209, 0.000)
		colorSnow      (0.324, 0.258, 0.218, 1.000)
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
		SemiMajorAxis   0.217574
		Period          2.46251
		Eccentricity    0.0815351
		Inclination     -63.6524
		AscendingNode   -179.917
		ArgOfPericenter 153.505
		MeanAnomaly     68.627
	}
}



DwarfMoon	"Kissarm.D13"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            1.43875e-008
	Radius          33.6757
	InertiaMoment   0.399946

	RotationPeriod  742.141
	Obliquity       70.3403
	EqAscendNode    5.52996

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.721 0.631 0.574)

	Surface
	{
		SurfStyle       0.461198
		OceanStyle      0.0588202
		Randomize      (0.490, -0.747, 0.826)
		colorDistMagn   0.757131
		colorDistFreq   0.90548
		detailScale     919.57
		colorConversion true
		snowLevel       2
		tropicLatitude  0.51492
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.380702
		terraceProb     0.308646
		erosion         0
		montesMagn      0.55007
		montesFreq      3.18064
		montesSpiky     0.936949
		montesFraction  0.538054
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.24229
		hillsFraction   0.676319
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242012
		craterFreq      0.258313
		craterDensity   0.794209
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.484966
		volcanoTemp     1326.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.288, 0.252, 0.229, 0.000)
		colorShelf     (0.306, 0.268, 0.244, 0.000)
		colorBeach     (0.324, 0.284, 0.258, 0.000)
		colorDesert    (0.342, 0.300, 0.272, 0.000)
		colorLowland   (0.360, 0.316, 0.287, 0.000)
		colorUpland    (0.378, 0.331, 0.301, 0.000)
		colorRock      (0.396, 0.347, 0.316, 0.000)
		colorSnow      (0.414, 0.363, 0.330, 1.000)
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
		SemiMajorAxis   0.218075
		Period          2.47103
		Eccentricity    0.0500741
		Inclination     80.0443
		AscendingNode   9.27405
		ArgOfPericenter -36.7693
		MeanAnomaly     -179.162
	}
}



DwarfMoon	"Kissarm.D14"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            1.95591e-008
	Radius          35.5508
	InertiaMoment   0.398045

	RotationPeriod  670.005
	Obliquity       19.0687
	EqAscendNode    74.8117

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.617 0.613 0.606)

	Surface
	{
		SurfStyle       0.0811332
		OceanStyle      0.488735
		Randomize      (0.141, -0.164, 0.759)
		colorDistMagn   0.231191
		colorDistFreq   0.724243
		detailScale     970.773
		colorConversion true
		snowLevel       2
		tropicLatitude  0.830927
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.654659
		terraceProb     0.186793
		erosion         0
		montesMagn      0.673914
		montesFreq      2.62531
		montesSpiky     0.959482
		montesFraction  0.657692
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.67705
		hillsFraction   0.820576
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231691
		craterFreq      0.228236
		craterDensity   0.758565
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.512838
		volcanoTemp     1706.32
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.247, 0.245, 0.242, 0.000)
		colorShelf     (0.262, 0.261, 0.258, 0.000)
		colorBeach     (0.278, 0.276, 0.273, 0.000)
		colorDesert    (0.293, 0.291, 0.288, 0.000)
		colorLowland   (0.309, 0.307, 0.303, 0.000)
		colorUpland    (0.324, 0.322, 0.318, 0.000)
		colorRock      (0.339, 0.337, 0.333, 0.000)
		colorSnow      (0.355, 0.353, 0.348, 1.000)
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
		SemiMajorAxis   0.218517
		Period          2.47854
		Eccentricity    0.149374
		Inclination     50.6001
		AscendingNode   80.0736
		ArgOfPericenter 64.1981
		MeanAnomaly     -61.3773
	}
}



DwarfMoon	"Kissarm.D15"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            2.65534e-008
	Radius          46.0858
	InertiaMoment   0.39917

	RotationPeriod  746.073
	Obliquity       126.868
	EqAscendNode    -39.0159

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.575 0.408 0.340)

	Surface
	{
		SurfStyle       0.889262
		OceanStyle      0.668651
		Randomize      (0.250, -0.858, 0.144)
		colorDistMagn   0.938
		colorDistFreq   1.45579
		detailScale     1258.45
		colorConversion true
		snowLevel       2
		tropicLatitude  0.686564
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.365519
		terraceProb     0.338866
		erosion         0
		montesMagn      0.337952
		montesFreq      2.68986
		montesSpiky     0.971406
		montesFraction  0.294891
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.34824
		hillsFraction   0.705956
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.1686
		craterFreq      0.243974
		craterDensity   1.07072
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.524559
		volcanoTemp     1389.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.196, 0.143, 0.136, 0.050)
		colorShelf     (0.230, 0.167, 0.156, 0.040)
		colorBeach     (0.265, 0.192, 0.177, 0.030)
		colorDesert    (0.299, 0.216, 0.201, 0.020)
		colorLowland   (0.334, 0.241, 0.221, 0.030)
		colorUpland    (0.368, 0.265, 0.241, 0.050)
		colorRock      (0.403, 0.290, 0.269, 0.020)
		colorSnow      (0.403, 0.290, 0.269, 1.000)
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
		SemiMajorAxis   0.218847
		Period          2.48416
		Eccentricity    0.464188
		Inclination     81.2041
		AscendingNode   -36.5259
		ArgOfPericenter 96.927
		MeanAnomaly     -5.77742
	}
}



DwarfMoon	"Kissarm.D16"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            3.60311e-008
	Radius          47.925
	InertiaMoment   0.395612

	RotationPeriod  662.69
	Obliquity       23.688
	EqAscendNode    127.423

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.465 0.382 0.342)

	Surface
	{
		SurfStyle       0.880885
		OceanStyle      0.0357539
		Randomize      (-0.484, 0.338, 0.464)
		colorDistMagn   0.998106
		colorDistFreq   1.68201
		detailScale     1308.67
		colorConversion true
		snowLevel       2
		tropicLatitude  0.424635
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.399915
		terraceProb     0.329102
		erosion         0
		montesMagn      0.336071
		montesFreq      2.7229
		montesSpiky     0.970758
		montesFraction  0.78409
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.83897
		hillsFraction   0.609997
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.271597
		craterFreq      0.201672
		craterDensity   1.05305
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.54893
		volcanoTemp     1337.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.158, 0.134, 0.137, 0.050)
		colorShelf     (0.186, 0.157, 0.157, 0.040)
		colorBeach     (0.214, 0.180, 0.178, 0.030)
		colorDesert    (0.242, 0.203, 0.202, 0.020)
		colorLowland   (0.269, 0.226, 0.222, 0.030)
		colorUpland    (0.297, 0.248, 0.243, 0.050)
		colorRock      (0.325, 0.271, 0.270, 0.020)
		colorSnow      (0.325, 0.271, 0.270, 1.000)
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
		SemiMajorAxis   0.219446
		Period          2.49437
		Eccentricity    0.103834
		Inclination     32.0132
		AscendingNode   127.238
		ArgOfPericenter -56.4292
		MeanAnomaly     -43.3593
	}
}



DwarfMoon	"Kissarm.D17"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            4.89097e-008
	Radius          50.9228
	InertiaMoment   0.398238

	RotationPeriod  606.11
	Obliquity       86.8122
	EqAscendNode    31.261

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.502 0.499 0.496)

	Surface
	{
		SurfStyle       0.201553
		OceanStyle      0.863432
		Randomize      (0.073, -0.671, -0.501)
		colorDistMagn   0.256215
		colorDistFreq   2.12987
		detailScale     1390.53
		colorConversion true
		snowLevel       2
		tropicLatitude  0.798515
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.717082
		terraceProb     0.227844
		erosion         0
		montesMagn      0.412104
		montesFreq      3.50554
		montesSpiky     0.986393
		montesFraction  0.566346
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.70473
		hillsFraction   0.582739
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.266052
		craterFreq      0.210988
		craterDensity   0.691095
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.473868
		volcanoTemp     1254.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.201, 0.199, 0.198, 0.000)
		colorShelf     (0.213, 0.212, 0.211, 0.000)
		colorBeach     (0.226, 0.224, 0.223, 0.000)
		colorDesert    (0.238, 0.237, 0.236, 0.000)
		colorLowland   (0.251, 0.249, 0.248, 0.000)
		colorUpland    (0.263, 0.262, 0.260, 0.000)
		colorRock      (0.276, 0.274, 0.273, 0.000)
		colorSnow      (0.288, 0.287, 0.285, 1.000)
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
		SemiMajorAxis   0.220005
		Period          2.50391
		Eccentricity    0.48833
		Inclination     49.3104
		AscendingNode   32.54
		ArgOfPericenter -99.8188
		MeanAnomaly     -72.0317
	}
}



DwarfMoon	"Kissarm.D18"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            6.64735e-008
	Radius          53.923
	InertiaMoment   0.399305

	RotationPeriod  551.142
	Obliquity       -106.82
	EqAscendNode    120.311

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.807 0.715 0.677)

	Surface
	{
		SurfStyle       0.737157
		OceanStyle      0.748433
		Randomize      (-0.586, -0.093, 0.278)
		colorDistMagn   0.416904
		colorDistFreq   2.244
		detailScale     1472.46
		colorConversion true
		snowLevel       2
		tropicLatitude  0.859375
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.286846
		terraceProb     0.283337
		erosion         0
		montesMagn      0.565197
		montesFreq      3.23735
		montesSpiky     0.913044
		montesFraction  0.780361
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.52453
		hillsFraction   0.588697
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.280864
		craterFreq      0.258087
		craterDensity   0.958677
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.481618
		volcanoTemp     1303.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.315, 0.243, 0.189, 0.000)
		colorShelf     (0.323, 0.250, 0.217, 0.000)
		colorBeach     (0.379, 0.293, 0.257, 0.000)
		colorDesert    (0.412, 0.315, 0.250, 0.000)
		colorLowland   (0.452, 0.336, 0.284, 0.000)
		colorUpland    (0.500, 0.407, 0.345, 0.000)
		colorRock      (0.541, 0.443, 0.372, 0.000)
		colorSnow      (0.589, 0.472, 0.392, 1.000)
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
		SemiMajorAxis   0.220486
		Period          2.51213
		Eccentricity    0.290777
		Inclination     -87.8093
		AscendingNode   123.104
		ArgOfPericenter -118.525
		MeanAnomaly     82.213
	}
}



DwarfMoon	"Kissarm.D19"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            9.05369e-008
	Radius          70.4787
	InertiaMoment   0.396476

	RotationPeriod  614.593
	Obliquity       134.046
	EqAscendNode    142.626

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.568 0.562 0.557)

	Surface
	{
		SurfStyle       0.9672
		OceanStyle      0.292102
		Randomize      (0.064, 0.892, 0.294)
		colorDistMagn   0.59925
		colorDistFreq   2.77522
		detailScale     1924.54
		colorConversion true
		snowLevel       2
		tropicLatitude  0.930443
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.563365
		terraceProb     0.17886
		erosion         0
		montesMagn      0.497562
		montesFreq      2.78106
		montesSpiky     0.679481
		montesFraction  0.695748
		dunesFraction   0
		hillsMagn       0
		hillsFreq       14.6229
		hillsFraction   0.618264
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223813
		craterFreq      0.19606
		craterDensity   0.819273
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.543259
		volcanoTemp     1543.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.193, 0.197, 0.223, 0.050)
		colorShelf     (0.227, 0.230, 0.256, 0.040)
		colorBeach     (0.261, 0.264, 0.290, 0.030)
		colorDesert    (0.296, 0.298, 0.329, 0.020)
		colorLowland   (0.330, 0.332, 0.362, 0.030)
		colorUpland    (0.364, 0.365, 0.396, 0.050)
		colorRock      (0.398, 0.399, 0.440, 0.020)
		colorSnow      (0.398, 0.399, 0.440, 1.000)
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
		SemiMajorAxis   0.220909
		Period          2.51935
		Eccentricity    0.0359903
		Inclination     72.6078
		AscendingNode   146.846
		ArgOfPericenter 178.099
		MeanAnomaly     86.6269
	}
}



DwarfMoon	"Kissarm.D20"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            1.2369e-007
	Radius          72.7778
	InertiaMoment   0.398415

	RotationPeriod  544.263
	Obliquity       -55.0143
	EqAscendNode    -71.4383

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.518 0.510 0.505)

	Surface
	{
		SurfStyle       0.926253
		OceanStyle      0.793488
		Randomize      (0.986, -0.599, -0.873)
		colorDistMagn   0.334022
		colorDistFreq   4.58954
		detailScale     1987.32
		colorConversion true
		snowLevel       2
		tropicLatitude  0.917741
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.653566
		terraceProb     0.218309
		erosion         0
		montesMagn      0.31286
		montesFreq      3.35271
		montesSpiky     0.890168
		montesFraction  0.688558
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.702
		hillsFraction   0.687743
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230786
		craterFreq      0.229836
		craterDensity   0.997278
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.476103
		volcanoTemp     1609.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.176, 0.179, 0.202, 0.050)
		colorShelf     (0.207, 0.209, 0.232, 0.040)
		colorBeach     (0.238, 0.240, 0.263, 0.030)
		colorDesert    (0.269, 0.270, 0.298, 0.020)
		colorLowland   (0.300, 0.301, 0.328, 0.030)
		colorUpland    (0.331, 0.332, 0.359, 0.050)
		colorRock      (0.362, 0.362, 0.399, 0.020)
		colorSnow      (0.362, 0.362, 0.399, 1.000)
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
		SemiMajorAxis   0.221402
		Period          2.5278
		Eccentricity    0.355383
		Inclination     -25.4553
		AscendingNode   -69.9838
		ArgOfPericenter 166.395
		MeanAnomaly     165.535
	}
}



DwarfMoon	"Kissarm.D21"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            1.6967e-007
	Radius          77.5214
	InertiaMoment   0.399436

	RotationPeriod  495.689
	Obliquity       76.8811
	EqAscendNode    80.8429

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.658 0.655 0.653)

	Surface
	{
		SurfStyle       0.197552
		OceanStyle      0.866435
		Randomize      (-0.813, -0.625, -0.388)
		colorDistMagn   0.467152
		colorDistFreq   1.91017
		detailScale     2116.85
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999653
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.333249
		terraceProb     0.242218
		erosion         0
		montesMagn      0.658601
		montesFreq      2.7921
		montesSpiky     0.786562
		montesFraction  0.536227
		dunesFraction   0
		hillsMagn       0
		hillsFreq       14.5125
		hillsFraction   0.946178
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24193
		craterFreq      0.232804
		craterDensity   0.786098
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.470873
		volcanoTemp     1622.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.263, 0.262, 0.261, 0.000)
		colorShelf     (0.280, 0.278, 0.277, 0.000)
		colorBeach     (0.296, 0.295, 0.294, 0.000)
		colorDesert    (0.312, 0.311, 0.310, 0.000)
		colorLowland   (0.329, 0.327, 0.326, 0.000)
		colorUpland    (0.345, 0.344, 0.343, 0.000)
		colorRock      (0.362, 0.360, 0.359, 0.000)
		colorSnow      (0.378, 0.376, 0.375, 1.000)
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
		SemiMajorAxis   0.221621
		Period          2.53154
		Eccentricity    0.3981
		Inclination     59.2098
		AscendingNode   83.8365
		ArgOfPericenter 10.668
		MeanAnomaly     -153.336
	}
}



DwarfMoon	"Kissarm.D22"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            2.33945e-007
	Radius          82.6568
	InertiaMoment   0.396955

	RotationPeriod  448.762
	Obliquity       -44.965
	EqAscendNode    132.472

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.542 0.535 0.531)

	Surface
	{
		SurfStyle       0.226183
		OceanStyle      0.944628
		Randomize      (-0.169, 0.557, -0.595)
		colorDistMagn   0.611133
		colorDistFreq   0.697897
		detailScale     2257.08
		colorConversion true
		snowLevel       2
		tropicLatitude  0.68073
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.447359
		terraceProb     0.116896
		erosion         0
		montesMagn      0.326694
		montesFreq      2.25425
		montesSpiky     0.771564
		montesFraction  0.300212
		dunesFraction   0
		hillsMagn       0
		hillsFreq       14.8192
		hillsFraction   0.656272
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227917
		craterFreq      0.224585
		craterDensity   0.862735
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.514348
		volcanoTemp     1536.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.217, 0.214, 0.213, 0.000)
		colorShelf     (0.231, 0.228, 0.226, 0.000)
		colorBeach     (0.244, 0.241, 0.239, 0.000)
		colorDesert    (0.258, 0.254, 0.252, 0.000)
		colorLowland   (0.271, 0.268, 0.266, 0.000)
		colorUpland    (0.285, 0.281, 0.279, 0.000)
		colorRock      (0.298, 0.295, 0.292, 0.000)
		colorSnow      (0.312, 0.308, 0.306, 1.000)
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
		SemiMajorAxis   0.221875
		Period          2.5359
		Eccentricity    0.398399
		Inclination     -3.90089
		AscendingNode   123.643
		ArgOfPericenter -42.0516
		MeanAnomaly     149.968
	}
}



DwarfMoon	"Kissarm.D23"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            3.24627e-007
	Radius          110.298
	InertiaMoment   0.398581

	RotationPeriod  509.003
	Obliquity       110.174
	EqAscendNode    114.5

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.633 0.629 0.627)

	Surface
	{
		SurfStyle       0.200472
		OceanStyle      0.06132
		Randomize      (-0.138, 0.031, 0.306)
		colorDistMagn   0.464404
		colorDistFreq   9.26255
		detailScale     3011.87
		colorConversion true
		snowLevel       2
		tropicLatitude  0.950201
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.295829
		terraceProb     0.106077
		erosion         0
		montesMagn      0.651206
		montesFreq      2.73113
		montesSpiky     0.729909
		montesFraction  0.670095
		dunesFraction   0
		hillsMagn       0
		hillsFreq       28.246
		hillsFraction   0.664096
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235285
		craterFreq      0.38345
		craterDensity   1.00705
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.450472
		volcanoTemp     1478.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.253, 0.252, 0.251, 0.000)
		colorShelf     (0.269, 0.267, 0.267, 0.000)
		colorBeach     (0.285, 0.283, 0.282, 0.000)
		colorDesert    (0.301, 0.299, 0.298, 0.000)
		colorLowland   (0.316, 0.315, 0.314, 0.000)
		colorUpland    (0.332, 0.330, 0.329, 0.000)
		colorRock      (0.348, 0.346, 0.345, 0.000)
		colorSnow      (0.364, 0.362, 0.361, 1.000)
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
		SemiMajorAxis   0.222285
		Period          2.54293
		Eccentricity    0.399283
		Inclination     67.8586
		AscendingNode   120.526
		ArgOfPericenter 105.26
		MeanAnomaly     -141.041
	}
}



DwarfMoon	"Kissarm.D24"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            4.53954e-007
	Radius          113.055
	InertiaMoment   0.399565

	RotationPeriod  441.819
	Obliquity       18.2014
	EqAscendNode    131.247

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.618 0.616 0.614)

	Surface
	{
		SurfStyle       0.950887
		OceanStyle      0.897636
		Randomize      (0.169, -0.863, 0.607)
		colorDistMagn   0.479078
		colorDistFreq   9.51493
		detailScale     3087.16
		colorConversion true
		snowLevel       2
		tropicLatitude  0.328061
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.505815
		terraceProb     0.514371
		erosion         0
		montesMagn      0.484893
		montesFreq      3.2077
		montesSpiky     0.946405
		montesFraction  0.900256
		dunesFraction   0
		hillsMagn       0
		hillsFreq       31.4461
		hillsFraction   0.637564
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.175896
		craterFreq      0.343852
		craterDensity   0.87265
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.527305
		volcanoTemp     1758.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.210, 0.216, 0.245, 0.050)
		colorShelf     (0.247, 0.253, 0.282, 0.040)
		colorBeach     (0.284, 0.290, 0.319, 0.030)
		colorDesert    (0.321, 0.326, 0.362, 0.020)
		colorLowland   (0.358, 0.363, 0.399, 0.030)
		colorUpland    (0.395, 0.400, 0.436, 0.050)
		colorRock      (0.432, 0.437, 0.485, 0.020)
		colorSnow      (0.432, 0.437, 0.485, 1.000)
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
		SemiMajorAxis   0.222776
		Period          2.55136
		Eccentricity    0.132387
		Inclination     -1.5659
		AscendingNode   125.472
		ArgOfPericenter -80.6148
		MeanAnomaly     -85.4658
	}
}


DwarfMoon	"Kissarm.D25"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            6.40733e-007
	Radius          121.4
	InertiaMoment   0.397305

	RotationPeriod  398.295
	Obliquity       -47.2982
	EqAscendNode    -109.721

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.743 0.618 0.560)

	Surface
	{
		SurfStyle       0.602755
		OceanStyle      0.986359
		Randomize      (-0.015, 0.992, -0.493)
		colorDistMagn   0.839827
		colorDistFreq   5.9569
		detailScale     3315.02
		colorConversion true
		snowLevel       2
		tropicLatitude  0.717227
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.648461
		terraceProb     0.340431
		erosion         0
		montesMagn      0.504419
		montesFreq      3.13722
		montesSpiky     0.995698
		montesFraction  0.477556
		dunesFraction   0
		hillsMagn       0
		hillsFreq       41.5498
		hillsFraction   0.626638
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.188886
		craterFreq      0.478947
		craterDensity   0.806546
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.616598
		volcanoTemp     1517.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.290, 0.210, 0.157, 0.000)
		colorShelf     (0.297, 0.216, 0.179, 0.000)
		colorBeach     (0.349, 0.254, 0.213, 0.000)
		colorDesert    (0.379, 0.272, 0.207, 0.000)
		colorLowland   (0.416, 0.291, 0.235, 0.000)
		colorUpland    (0.461, 0.352, 0.286, 0.000)
		colorRock      (0.498, 0.383, 0.308, 0.000)
		colorSnow      (0.543, 0.408, 0.325, 1.000)
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
		SemiMajorAxis   0.223021
		Period          2.55557
		Eccentricity    0.054104
		Inclination     -43.693
		AscendingNode   -113.999
		ArgOfPericenter 29.1295
		MeanAnomaly     91.3049
	}
}



DwarfMoon	"Kissarm.D26"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            9.14496e-007
	Radius          131.122
	InertiaMoment   0.398737

	RotationPeriod  360.806
	Obliquity       -32.7689
	EqAscendNode    -66.5316

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.805 0.725 0.695)

	Surface
	{
		SurfStyle       0.437911
		OceanStyle      0.847412
		Randomize      (0.786, -0.026, 0.058)
		colorDistMagn   0.251462
		colorDistFreq   5.25503
		detailScale     3580.5
		colorConversion true
		snowLevel       2
		tropicLatitude  0.882357
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.364061
		terraceProb     0.256884
		erosion         0
		montesMagn      0.431842
		montesFreq      2.6967
		montesSpiky     0.955471
		montesFraction  0.675761
		dunesFraction   0
		hillsMagn       0
		hillsFreq       28.9743
		hillsFraction   0.529753
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231206
		craterFreq      0.396164
		craterDensity   0.833279
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.54883
		volcanoTemp     1511.24
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.322, 0.290, 0.278, 0.000)
		colorShelf     (0.342, 0.308, 0.295, 0.000)
		colorBeach     (0.362, 0.326, 0.313, 0.000)
		colorDesert    (0.382, 0.344, 0.330, 0.000)
		colorLowland   (0.403, 0.362, 0.347, 0.000)
		colorUpland    (0.423, 0.380, 0.365, 0.000)
		colorRock      (0.443, 0.399, 0.382, 0.000)
		colorSnow      (0.463, 0.417, 0.399, 1.000)
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
		SemiMajorAxis   0.223288
		Period          2.56016
		Eccentricity    0.0379753
		Inclination     -41.9584
		AscendingNode   -64.69
		ArgOfPericenter 170.088
		MeanAnomaly     -163.577
	}
}



DwarfMoon	"Kissarm.D27"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            1.32277e-006
	Radius          183.294
	InertiaMoment   0.399692

	RotationPeriod  419.476
	Obliquity       -60.2093
	EqAscendNode    99.5867

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.742 0.739 0.737)

	Surface
	{
		SurfStyle       0.01781
		OceanStyle      0.369525
		Randomize      (-0.266, 0.578, -0.942)
		colorDistMagn   0.556755
		colorDistFreq   21.506
		detailScale     5005.13
		colorConversion true
		snowLevel       2
		tropicLatitude  0.991744
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.397365
		terraceProb     0.327855
		erosion         0
		montesMagn      0.418365
		montesFreq      2.82732
		montesSpiky     0.979826
		montesFraction  0.58799
		dunesFraction   0
		hillsMagn       0
		hillsFreq       119.518
		hillsFraction   0.697291
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223794
		craterFreq      1.09989
		craterDensity   0.905049
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.461819
		volcanoTemp     1562.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.297, 0.296, 0.295, 0.000)
		colorShelf     (0.315, 0.314, 0.313, 0.000)
		colorBeach     (0.334, 0.333, 0.332, 0.000)
		colorDesert    (0.352, 0.351, 0.350, 0.000)
		colorLowland   (0.371, 0.370, 0.368, 0.000)
		colorUpland    (0.390, 0.388, 0.387, 0.000)
		colorRock      (0.408, 0.407, 0.405, 0.000)
		colorSnow      (0.427, 0.425, 0.424, 1.000)
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
		SemiMajorAxis   0.223884
		Period          2.57042
		Eccentricity    0.223318
		Inclination     -81.9504
		AscendingNode   93.9145
		ArgOfPericenter 121.913
		MeanAnomaly     30.9102
	}
}



DwarfMoon	"Kissarm.D28"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            1.94424e-006
	Radius          184.998
	InertiaMoment   0.397587

	RotationPeriod  348.5
	Obliquity       -51.6892
	EqAscendNode    63.3665

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.722 0.686 0.658)

	Surface
	{
		SurfStyle       0.634177
		OceanStyle      0.895004
		Randomize      (-0.556, -0.374, 0.231)
		colorDistMagn   0.501999
		colorDistFreq   12.6112
		detailScale     5051.67
		colorConversion true
		snowLevel       2
		tropicLatitude  0.850558
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.739532
		terraceProb     0.330405
		erosion         0
		montesMagn      0.608721
		montesFreq      2.90157
		montesSpiky     0.990539
		montesFraction  0.715696
		dunesFraction   0
		hillsMagn       0
		hillsFreq       97.9881
		hillsFraction   0.626169
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232019
		craterFreq      1.18097
		craterDensity   1.05977
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.497422
		volcanoTemp     1362.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.282, 0.233, 0.184, 0.000)
		colorShelf     (0.289, 0.240, 0.211, 0.000)
		colorBeach     (0.340, 0.281, 0.250, 0.000)
		colorDesert    (0.368, 0.302, 0.244, 0.000)
		colorLowland   (0.405, 0.322, 0.277, 0.000)
		colorUpland    (0.448, 0.391, 0.336, 0.000)
		colorRock      (0.484, 0.425, 0.362, 0.000)
		colorSnow      (0.527, 0.453, 0.382, 1.000)
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
		SemiMajorAxis   0.224165
		Period          2.57526
		Eccentricity    0.0201102
		Inclination     -13.0225
		AscendingNode   63.7859
		ArgOfPericenter 38.0736
		MeanAnomaly     -86.5138
	}
}



DwarfMoon	"Kissarm.D29"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            2.91365e-006
	Radius          202.268
	InertiaMoment   0.398886

	RotationPeriod  311.854
	Obliquity       20.8992
	EqAscendNode    -42.3829

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.469 0.463 0.461)

	Surface
	{
		SurfStyle       0.102405
		OceanStyle      0.559452
		Randomize      (-0.685, 0.022, 0.430)
		colorDistMagn   0.0938392
		colorDistFreq   21.8222
		detailScale     5523.28
		colorConversion true
		snowLevel       2
		tropicLatitude  0.326317
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.477483
		terraceProb     0.557151
		erosion         0
		montesMagn      0.56714
		montesFreq      3.47598
		montesSpiky     0.980225
		montesFraction  0.450706
		dunesFraction   0
		hillsMagn       0
		hillsFreq       92.1266
		hillsFraction   0.704888
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253175
		craterFreq      1.47175
		craterDensity   0.778177
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.470017
		volcanoTemp     1605.14
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.188, 0.185, 0.184, 0.000)
		colorShelf     (0.199, 0.197, 0.196, 0.000)
		colorBeach     (0.211, 0.208, 0.207, 0.000)
		colorDesert    (0.223, 0.220, 0.219, 0.000)
		colorLowland   (0.234, 0.231, 0.230, 0.000)
		colorUpland    (0.246, 0.243, 0.242, 0.000)
		colorRock      (0.258, 0.255, 0.253, 0.000)
		colorSnow      (0.270, 0.266, 0.265, 1.000)
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
		SemiMajorAxis   0.224409
		Period          2.57947
		Eccentricity    0.270123
		Inclination     -27.4596
		AscendingNode   -45.006
		ArgOfPericenter 168.129
		MeanAnomaly     -33.1037
	}
}



Moon	"Kissarm.8"
{
	ParentBody     "Kissarm"
	Class	       "IceWorld"

	Mass            4.47107e-006
	Radius          223.999
	InertiaMoment   0.399818

	RotationPeriod  279.157
	Obliquity       62.1358
	EqAscendNode    30.5665

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.477 0.470 0.459)

	Surface
	{
		SurfStyle       0.296577
		OceanStyle      0.689501
		Randomize      (0.065, 0.684, -0.257)
		colorDistMagn   0.0850194
		colorDistFreq   28.5596
		detailScale     576.139
		colorConversion true
		drivenDarkening 0.03162
		seaLevel        0.255391
		snowLevel       2
		tropicLatitude  0.754105
		icecapLatitude  1
		icecapHeight    0.255391
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.72501
		venusFreq       0.991675
		venusMagn       0
		mareFreq        0
		mareDensity     1.92386e-006
		terraceProb     0.371133
		erosion         0
		montesMagn      0.0483206
		montesFreq      13.7812
		montesSpiky     0.948161
		montesFraction  0.577626
		dunesMagn       0.0459741
		dunesFreq       295.626
		dunesFraction   0.916297
		hillsMagn       0.112959
		hillsFreq       23.7793
		hillsFraction   0.174945
		hills2Fraction  0.0685653
		riversMagn      61.3642
		riversFreq      2.90125
		riversSin       5.14139
		riversOctaves   0
		canyonsMagn     0.540959
		canyonsFreq     0.0654557
		canyonFraction  0
		cracksMagn      0.0588857
		cracksFreq      0.0495283
		cracksOctaves   0
		craterMagn      1.16512
		craterFreq      0.605358
		craterDensity   0.782117
		craterOctaves   8
		craterRayedFactor 0.147867
		volcanoMagn     0.186611
		volcanoFreq     0.619561
		volcanoDensity  0.189112
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.2301
		volcanoRadius   0.170948
		volcanoTemp     1885.82
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.477, 0.470, 0.459, 0.500)
		colorShelf     (0.453, 0.447, 0.436, 0.500)
		colorBeach     (0.334, 0.329, 0.321, 0.750)
		colorDesert    (0.406, 0.400, 0.390, 1.000)
		colorLowland   (0.420, 0.414, 0.404, 1.000)
		colorUpland    (0.444, 0.437, 0.427, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.420, 0.414, 0.404, 1.000)
		colorUpPlants  (0.444, 0.437, 0.427, 1.000)
		BumpHeight      11.2
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
		SemiMajorAxis   0.224972
		Period          2.58918
		Eccentricity    0.0643032
		Inclination     75.2471
		AscendingNode   24.8477
		ArgOfPericenter -27.5106
		MeanAnomaly     -33.2599
	}
}



DwarfMoon	"Kissarm.D30"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            1.21062e-011
	Radius          2.86277
	InertiaMoment   0.397828

	RotationPeriod  2111.41
	Obliquity       -1.10101
	EqAscendNode    -7.82578

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.705 0.702 0.701)

	Surface
	{
		SurfStyle       0.083031
		OceanStyle      0.456472
		Randomize      (0.728, 0.102, 0.734)
		colorDistMagn   0.167977
		colorDistFreq   0.00457714
		detailScale     78.1727
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0384293
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.436323
		terraceProb     0.241351
		erosion         0
		montesMagn      0.529976
		montesFreq      3.55425
		montesSpiky     0.926717
		montesFraction  0.501086
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0184593
		hillsFraction   0.659223
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.278246
		craterFreq      0.250432
		craterDensity   0.960547
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52087
		volcanoTemp     1525.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.282, 0.281, 0.280, 0.000)
		colorShelf     (0.300, 0.299, 0.298, 0.000)
		colorBeach     (0.317, 0.316, 0.315, 0.000)
		colorDesert    (0.335, 0.334, 0.333, 0.000)
		colorLowland   (0.352, 0.351, 0.350, 0.000)
		colorUpland    (0.370, 0.369, 0.368, 0.000)
		colorRock      (0.388, 0.386, 0.385, 0.000)
		colorSnow      (0.405, 0.404, 0.403, 1.000)
		BumpHeight      2.57649
		BumpOffset      0.515298
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.225561
		Period          2.59935
		Eccentricity    0.216407
		Inclination     -1.11062
		AscendingNode   -10.465
		ArgOfPericenter -130.318
		MeanAnomaly     112.799
	}
}



DwarfMoon	"Kissarm.D31"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            2.47359e-011
	Radius          4.35475
	InertiaMoment   0.399029

	RotationPeriod  2242.83
	Obliquity       -36.6803
	EqAscendNode    75.693

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.487 0.481 0.480)

	Surface
	{
		SurfStyle       0.569222
		OceanStyle      0.475866
		Randomize      (0.476, 0.912, -0.347)
		colorDistMagn   0.656712
		colorDistFreq   0.0105738
		detailScale     118.914
		colorConversion true
		snowLevel       2
		tropicLatitude  0.995975
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.381583
		terraceProb     0.344163
		erosion         0
		montesMagn      0.571411
		montesFreq      3.02147
		montesSpiky     0.901909
		montesFraction  0.451067
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0594337
		hillsFraction   0.570801
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228668
		craterFreq      0.207608
		craterDensity   0.950029
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.624533
		volcanoTemp     1653.09
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.190, 0.164, 0.134, 0.000)
		colorShelf     (0.195, 0.169, 0.153, 0.000)
		colorBeach     (0.229, 0.197, 0.182, 0.000)
		colorDesert    (0.248, 0.212, 0.177, 0.000)
		colorLowland   (0.272, 0.226, 0.201, 0.000)
		colorUpland    (0.302, 0.274, 0.245, 0.000)
		colorRock      (0.326, 0.298, 0.264, 0.000)
		colorSnow      (0.355, 0.318, 0.278, 1.000)
		BumpHeight      3.91927
		BumpOffset      0.783854
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.226058
		Period          2.60795
		Eccentricity    0.392882
		Inclination     -68.3944
		AscendingNode   68.2641
		ArgOfPericenter -143.883
		MeanAnomaly     -157.135
	}
}



DwarfMoon	"Kissarm.D32"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            4.59194e-011
	Radius          5.10046
	InertiaMoment   0.399943

	RotationPeriod  1935.66
	Obliquity       58.9398
	EqAscendNode    160.497

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.619 0.518 0.414)

	Surface
	{
		SurfStyle       0.714759
		OceanStyle      0.452202
		Randomize      (-0.077, -0.199, 0.486)
		colorDistMagn   0.481919
		colorDistFreq   0.0137795
		detailScale     139.277
		colorConversion true
		snowLevel       2
		tropicLatitude  0.701624
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.366457
		terraceProb     0.365642
		erosion         0
		montesMagn      0.576707
		montesFreq      2.99785
		montesSpiky     0.943124
		montesFraction  0.803122
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0533511
		hillsFraction   0.642174
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237303
		craterFreq      0.193498
		craterDensity   0.985087
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.467067
		volcanoTemp     1494.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.242, 0.176, 0.116, 0.000)
		colorShelf     (0.248, 0.181, 0.132, 0.000)
		colorBeach     (0.291, 0.212, 0.157, 0.000)
		colorDesert    (0.316, 0.228, 0.153, 0.000)
		colorLowland   (0.347, 0.243, 0.174, 0.000)
		colorUpland    (0.384, 0.295, 0.211, 0.000)
		colorRock      (0.415, 0.321, 0.228, 0.000)
		colorSnow      (0.452, 0.342, 0.240, 1.000)
		BumpHeight      4.59041
		BumpOffset      0.918083
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.226587
		Period          2.61711
		Eccentricity    0.399001
		Inclination     15.5349
		AscendingNode   159.904
		ArgOfPericenter 38.3556
		MeanAnomaly     89.068
	}
}



DwarfMoon	"Kissarm.D33"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            7.96812e-011
	Radius          5.88719
	InertiaMoment   0.398041

	RotationPeriod  1696.92
	Obliquity       66.6206
	EqAscendNode    31.586

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.654 0.647 0.644)

	Surface
	{
		SurfStyle       0.692881
		OceanStyle      0.864769
		Randomize      (-0.684, -0.115, -0.543)
		colorDistMagn   0.548266
		colorDistFreq   0.0175352
		detailScale     160.759
		colorConversion true
		snowLevel       2
		tropicLatitude  0.84172
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.618311
		terraceProb     0.284932
		erosion         0
		montesMagn      0.585886
		montesFreq      3.66578
		montesSpiky     0.907031
		montesFraction  0.433094
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0580827
		hillsFraction   0.663216
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242756
		craterFreq      0.238962
		craterDensity   0.734468
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.591889
		volcanoTemp     1436.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.255, 0.220, 0.180, 0.000)
		colorShelf     (0.261, 0.227, 0.206, 0.000)
		colorBeach     (0.307, 0.265, 0.245, 0.000)
		colorDesert    (0.333, 0.285, 0.238, 0.000)
		colorLowland   (0.366, 0.304, 0.271, 0.000)
		colorUpland    (0.405, 0.369, 0.329, 0.000)
		colorRock      (0.438, 0.401, 0.354, 0.000)
		colorSnow      (0.477, 0.427, 0.374, 1.000)
		BumpHeight      5.29847
		BumpOffset      1.05969
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.226847
		Period          2.62161
		Eccentricity    0.121243
		Inclination     65.2573
		AscendingNode   32.1241
		ArgOfPericenter -162.129
		MeanAnomaly     -23.295
	}
}



DwarfMoon	"Kissarm.D34"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            1.31521e-010
	Radius          6.5377
	InertiaMoment   0.399167

	RotationPeriod  1473.04
	Obliquity       -12.3526
	EqAscendNode    157.648

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.583 0.576 0.571)

	Surface
	{
		SurfStyle       0.652858
		OceanStyle      0.0206004
		Randomize      (-0.794, 0.992, 0.109)
		colorDistMagn   0.29514
		colorDistFreq   0.0318436
		detailScale     178.523
		colorConversion true
		snowLevel       2
		tropicLatitude  0.712899
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.455933
		terraceProb     0.107609
		erosion         0
		montesMagn      0.404987
		montesFreq      2.43337
		montesSpiky     0.972301
		montesFraction  0.410671
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0723312
		hillsFraction   0.711031
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.207307
		craterFreq      0.16595
		craterDensity   0.802033
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.515401
		volcanoTemp     1400.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.227, 0.196, 0.160, 0.000)
		colorShelf     (0.233, 0.202, 0.183, 0.000)
		colorBeach     (0.274, 0.236, 0.217, 0.000)
		colorDesert    (0.297, 0.253, 0.211, 0.000)
		colorLowland   (0.326, 0.271, 0.240, 0.000)
		colorUpland    (0.361, 0.328, 0.291, 0.000)
		colorRock      (0.390, 0.357, 0.314, 0.000)
		colorSnow      (0.425, 0.380, 0.331, 1.000)
		BumpHeight      5.88393
		BumpOffset      1.17679
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.227084
		Period          2.62572
		Eccentricity    0.125926
		Inclination     33.5305
		AscendingNode   163.037
		ArgOfPericenter -171.681
		MeanAnomaly     -154.433
	}
}



DwarfMoon	"Kissarm.D35"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            2.08898e-010
	Radius          8.95049
	InertiaMoment   0.395582

	RotationPeriod  1588.87
	Obliquity       -22.1144
	EqAscendNode    -0.630476

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.690 0.612 0.577)

	Surface
	{
		SurfStyle       0.607401
		OceanStyle      0.183462
		Randomize      (0.850, -0.376, 0.254)
		colorDistMagn   0.0712832
		colorDistFreq   0.0264376
		detailScale     244.408
		colorConversion true
		snowLevel       2
		tropicLatitude  0.907627
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.628639
		terraceProb     0.208638
		erosion         0
		montesMagn      0.567173
		montesFreq      3.54555
		montesSpiky     0.897913
		montesFraction  0.616463
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.181002
		hillsFraction   0.489994
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254235
		craterFreq      0.230733
		craterDensity   1.03
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.424513
		volcanoTemp     1608.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.269, 0.208, 0.162, 0.000)
		colorShelf     (0.276, 0.214, 0.185, 0.000)
		colorBeach     (0.324, 0.251, 0.219, 0.000)
		colorDesert    (0.352, 0.269, 0.214, 0.000)
		colorLowland   (0.387, 0.287, 0.242, 0.000)
		colorUpland    (0.428, 0.349, 0.294, 0.000)
		colorRock      (0.462, 0.379, 0.318, 0.000)
		colorSnow      (0.504, 0.404, 0.335, 1.000)
		BumpHeight      8.05544
		BumpOffset      1.61109
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.22746
		Period          2.63225
		Eccentricity    0.414095
		Inclination     -43.1188
		AscendingNode   -4.66291
		ArgOfPericenter 85.2985
		MeanAnomaly     153.769
	}
}



DwarfMoon	"Kissarm.D36"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            3.21877e-010
	Radius          9.81884
	InertiaMoment   0.398234

	RotationPeriod  1412.14
	Obliquity       -97.8227
	EqAscendNode    85.8936

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.460 0.458 0.456)

	Surface
	{
		SurfStyle       0.669746
		OceanStyle      0.525895
		Randomize      (-0.647, 0.410, 0.854)
		colorDistMagn   0.329291
		colorDistFreq   0.0607041
		detailScale     268.12
		colorConversion true
		snowLevel       2
		tropicLatitude  0.98734
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.584394
		terraceProb     0.124813
		erosion         0
		montesMagn      0.499914
		montesFreq      2.63275
		montesSpiky     0.968925
		montesFraction  0.638383
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.209855
		hillsFraction   0.848026
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239127
		craterFreq      0.22789
		craterDensity   0.851583
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.497642
		volcanoTemp     1834.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.180, 0.156, 0.128, 0.000)
		colorShelf     (0.184, 0.160, 0.146, 0.000)
		colorBeach     (0.216, 0.188, 0.173, 0.000)
		colorDesert    (0.235, 0.201, 0.169, 0.000)
		colorLowland   (0.258, 0.215, 0.191, 0.000)
		colorUpland    (0.285, 0.261, 0.232, 0.000)
		colorRock      (0.308, 0.284, 0.251, 0.000)
		colorSnow      (0.336, 0.302, 0.264, 1.000)
		BumpHeight      8.83695
		BumpOffset      1.76739
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.227711
		Period          2.6366
		Eccentricity    0.332646
		Inclination     -71.5069
		AscendingNode   82.9418
		ArgOfPericenter 88.6222
		MeanAnomaly     -135.925
	}
}



DwarfMoon	"Kissarm.D37"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            4.83978e-010
	Radius          10.8054
	InertiaMoment   0.399302

	RotationPeriod  1271.16
	Obliquity       29.8416
	EqAscendNode    -148.115

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.618 0.584 0.519)

	Surface
	{
		SurfStyle       0.0920767
		OceanStyle      0.239153
		Randomize      (0.544, 0.992, 0.371)
		colorDistMagn   0.419634
		colorDistFreq   0.077851
		detailScale     295.059
		colorConversion true
		snowLevel       2
		tropicLatitude  0.676204
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.320094
		terraceProb     0.277574
		erosion         0
		montesMagn      0.500524
		montesFreq      2.94895
		montesSpiky     0.905147
		montesFraction  0.650545
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.329903
		hillsFraction   0.506839
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231054
		craterFreq      0.198275
		craterDensity   1.02211
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.560154
		volcanoTemp     1490.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.247, 0.234, 0.208, 0.000)
		colorShelf     (0.263, 0.248, 0.221, 0.000)
		colorBeach     (0.278, 0.263, 0.234, 0.000)
		colorDesert    (0.294, 0.277, 0.247, 0.000)
		colorLowland   (0.309, 0.292, 0.260, 0.000)
		colorUpland    (0.325, 0.307, 0.273, 0.000)
		colorRock      (0.340, 0.321, 0.286, 0.000)
		colorSnow      (0.356, 0.336, 0.299, 1.000)
		BumpHeight      9.72485
		BumpOffset      1.94497
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.228062
		Period          2.64271
		Eccentricity    0.141716
		Inclination     -14.074
		AscendingNode   -149.867
		ArgOfPericenter 177.079
		MeanAnomaly     72.7289
	}
}



DwarfMoon	"Kissarm.D38"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            7.13319e-010
	Radius          11.6577
	InertiaMoment   0.396463

	RotationPeriod  1127.36
	Obliquity       7.67454
	EqAscendNode    -32.4155

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.585 0.577 0.574)

	Surface
	{
		SurfStyle       0.342798
		OceanStyle      0.428476
		Randomize      (-0.033, -0.675, 0.300)
		colorDistMagn   0.442295
		colorDistFreq   0.0679107
		detailScale     318.332
		colorConversion true
		snowLevel       2
		tropicLatitude  0.680538
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.443333
		terraceProb     0.307523
		erosion         0
		montesMagn      0.529638
		montesFreq      2.50399
		montesSpiky     0.96295
		montesFraction  0.604074
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.195198
		hillsFraction   0.664471
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253461
		craterFreq      0.169836
		craterDensity   0.944025
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.673295
		volcanoTemp     1661.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.234, 0.231, 0.229, 0.000)
		colorShelf     (0.249, 0.245, 0.244, 0.000)
		colorBeach     (0.263, 0.260, 0.258, 0.000)
		colorDesert    (0.278, 0.274, 0.272, 0.000)
		colorLowland   (0.292, 0.288, 0.287, 0.000)
		colorUpland    (0.307, 0.303, 0.301, 0.000)
		colorRock      (0.322, 0.317, 0.315, 0.000)
		colorSnow      (0.336, 0.332, 0.330, 1.000)
		BumpHeight      10.4919
		BumpOffset      2.09838
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.22863
		Period          2.65257
		Eccentricity    0.238313
		Inclination     -48.845
		AscendingNode   -36.8048
		ArgOfPericenter -124.3
		MeanAnomaly     -79.2175
	}
}



DwarfMoon	"Kissarm.D39"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            1.03413e-009
	Radius          15.4165
	InertiaMoment   0.398411

	RotationPeriod  1237.79
	Obliquity       -83.5288
	EqAscendNode    -42.4652

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.500 0.492 0.488)

	Surface
	{
		SurfStyle       0.365208
		OceanStyle      0.863869
		Randomize      (-0.067, 0.832, -0.082)
		colorDistMagn   0.724036
		colorDistFreq   0.182538
		detailScale     420.973
		colorConversion true
		snowLevel       2
		tropicLatitude  0.720777
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.554217
		terraceProb     0.401675
		erosion         0
		montesMagn      0.420586
		montesFreq      3.1263
		montesSpiky     0.894373
		montesFraction  0.570036
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.538816
		hillsFraction   0.671038
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249302
		craterFreq      0.25033
		craterDensity   0.954093
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.508955
		volcanoTemp     1597.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.200, 0.197, 0.195, 0.000)
		colorShelf     (0.213, 0.209, 0.207, 0.000)
		colorBeach     (0.225, 0.222, 0.220, 0.000)
		colorDesert    (0.238, 0.234, 0.232, 0.000)
		colorLowland   (0.250, 0.246, 0.244, 0.000)
		colorUpland    (0.263, 0.259, 0.256, 0.000)
		colorRock      (0.275, 0.271, 0.268, 0.000)
		colorSnow      (0.288, 0.283, 0.281, 1.000)
		BumpHeight      13.8748
		BumpOffset      2.77497
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.229196
		Period          2.66244
		Eccentricity    0.0362003
		Inclination     -88.1404
		AscendingNode   -45.4394
		ArgOfPericenter -64.4755
		MeanAnomaly     -92.0782
	}
}



DwarfMoon	"Kissarm.D40"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            1.47878e-009
	Radius          16.4222
	InertiaMoment   0.399433

	RotationPeriod  1106.33
	Obliquity       -131.507
	EqAscendNode    109.068

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.707 0.593 0.553)

	Surface
	{
		SurfStyle       0.0214358
		OceanStyle      0.602169
		Randomize      (0.272, -0.482, 0.532)
		colorDistMagn   0.348583
		colorDistFreq   0.0349022
		detailScale     448.435
		colorConversion true
		snowLevel       2
		tropicLatitude  0.99862
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.406139
		terraceProb     0.28288
		erosion         0
		montesMagn      0.470026
		montesFreq      2.90891
		montesSpiky     0.779874
		montesFraction  0.647846
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.712869
		hillsFraction   0.804564
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247859
		craterFreq      0.213583
		craterDensity   0.924499
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.506758
		volcanoTemp     1865.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.283, 0.237, 0.221, 0.000)
		colorShelf     (0.301, 0.252, 0.235, 0.000)
		colorBeach     (0.318, 0.267, 0.249, 0.000)
		colorDesert    (0.336, 0.282, 0.263, 0.000)
		colorLowland   (0.354, 0.297, 0.276, 0.000)
		colorUpland    (0.371, 0.311, 0.290, 0.000)
		colorRock      (0.389, 0.326, 0.304, 0.000)
		colorSnow      (0.407, 0.341, 0.318, 1.000)
		BumpHeight      14.78
		BumpOffset      2.956
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.229401
		Period          2.66602
		Eccentricity    0.00202558
		Inclination     -83.9628
		AscendingNode   99.445
		ArgOfPericenter 165.867
		MeanAnomaly     8.7965
	}
}

DwarfMoon	"Kissarm.D41"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            2.09053e-009
	Radius          17.6993
	InertiaMoment   0.396947

	RotationPeriod  1001.09
	Obliquity       18.0374
	EqAscendNode    -14.6655

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.407 0.403 0.398)

	Surface
	{
		SurfStyle       0.17902
		OceanStyle      0.303674
		Randomize      (0.043, -0.796, 0.867)
		colorDistMagn   0.0535169
		colorDistFreq   0.156498
		detailScale     483.309
		colorConversion true
		snowLevel       2
		tropicLatitude  0.955981
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.606443
		terraceProb     0.103141
		erosion         0
		montesMagn      0.580982
		montesFreq      2.36911
		montesSpiky     0.936906
		montesFraction  0.166181
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.552953
		hillsFraction   0.387062
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.26125
		craterFreq      0.191792
		craterDensity   1.0419
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.593739
		volcanoTemp     1601.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.163, 0.161, 0.159, 0.000)
		colorShelf     (0.173, 0.171, 0.169, 0.000)
		colorBeach     (0.183, 0.181, 0.179, 0.000)
		colorDesert    (0.193, 0.192, 0.189, 0.000)
		colorLowland   (0.204, 0.202, 0.199, 0.000)
		colorUpland    (0.214, 0.212, 0.209, 0.000)
		colorRock      (0.224, 0.222, 0.219, 0.000)
		colorSnow      (0.234, 0.232, 0.229, 1.000)
		BumpHeight      15.9294
		BumpOffset      3.18587
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.229839
		Period          2.67365
		Eccentricity    0.347708
		Inclination     55.4198
		AscendingNode   -15.0088
		ArgOfPericenter -100.919
		MeanAnomaly     151.848
	}
}



DwarfMoon	"Kissarm.D42"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            2.92724e-009
	Radius          18.8664
	InertiaMoment   0.398577

	RotationPeriod  904.765
	Obliquity       -62.0975
	EqAscendNode    -109.172

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.590 0.584 0.578)

	Surface
	{
		SurfStyle       0.796489
		OceanStyle      0.0482458
		Randomize      (-0.860, 0.101, -0.349)
		colorDistMagn   0.596354
		colorDistFreq   0.0612202
		detailScale     515.178
		colorConversion true
		snowLevel       2
		tropicLatitude  0.904994
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.500655
		terraceProb     0.125435
		erosion         0
		montesMagn      0.57066
		montesFreq      2.83114
		montesSpiky     0.999926
		montesFraction  0.456883
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.00027
		hillsFraction   0.516543
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249749
		craterFreq      0.223764
		craterDensity   0.985861
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.450155
		volcanoTemp     1515.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.230, 0.199, 0.162, 0.000)
		colorShelf     (0.236, 0.204, 0.185, 0.000)
		colorBeach     (0.277, 0.239, 0.220, 0.000)
		colorDesert    (0.301, 0.257, 0.214, 0.000)
		colorLowland   (0.330, 0.274, 0.243, 0.000)
		colorUpland    (0.366, 0.333, 0.295, 0.000)
		colorRock      (0.395, 0.362, 0.318, 0.000)
		colorSnow      (0.431, 0.385, 0.335, 1.000)
		BumpHeight      16.9797
		BumpOffset      3.39595
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.230347
		Period          2.68252
		Eccentricity    0.379069
		Inclination     -68.7424
		AscendingNode   -108.091
		ArgOfPericenter 7.8251
		MeanAnomaly     -179.363
	}
}



DwarfMoon	"Kissarm.D43"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            4.06635e-009
	Radius          24.6401
	InertiaMoment   0.399562

	RotationPeriod  1001.56
	Obliquity       -22.1921
	EqAscendNode    -49.7721

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.598 0.595 0.592)

	Surface
	{
		SurfStyle       0.00712521
		OceanStyle      0.33441
		Randomize      (0.678, 0.616, -0.720)
		colorDistMagn   0.630967
		colorDistFreq   0.306862
		detailScale     672.839
		colorConversion true
		snowLevel       2
		tropicLatitude  0.83123
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.454177
		terraceProb     0.528691
		erosion         0
		montesMagn      0.445804
		montesFreq      3.4707
		montesSpiky     0.907105
		montesFraction  0.623075
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.56044
		hillsFraction   0.598528
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243697
		craterFreq      0.253514
		craterDensity   0.748518
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.490442
		volcanoTemp     1653.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.239, 0.238, 0.237, 0.000)
		colorShelf     (0.254, 0.253, 0.251, 0.000)
		colorBeach     (0.269, 0.268, 0.266, 0.000)
		colorDesert    (0.284, 0.282, 0.281, 0.000)
		colorLowland   (0.299, 0.297, 0.296, 0.000)
		colorUpland    (0.314, 0.312, 0.311, 0.000)
		colorRock      (0.329, 0.327, 0.325, 0.000)
		colorSnow      (0.344, 0.342, 0.340, 1.000)
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
		SemiMajorAxis   0.230666
		Period          2.6881
		Eccentricity    0.000715637
		Inclination     -40.1364
		AscendingNode   -51.3849
		ArgOfPericenter -5.17236
		MeanAnomaly     17.6722
	}
}


DwarfMoon	"Kissarm.D44"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            5.61181e-009
	Radius          25.7773
	InertiaMoment   0.397298

	RotationPeriod  890.867
	Obliquity       77.1672
	EqAscendNode    -70.2826

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.568 0.563 0.561)

	Surface
	{
		SurfStyle       0.444611
		OceanStyle      0.839801
		Randomize      (-0.934, -0.717, -0.594)
		colorDistMagn   0.741141
		colorDistFreq   0.0988242
		detailScale     703.892
		colorConversion true
		snowLevel       2
		tropicLatitude  0.910691
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.602913
		terraceProb     0.16938
		erosion         0
		montesMagn      0.34748
		montesFreq      3.21981
		montesSpiky     0.875349
		montesFraction  0.719096
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.01653
		hillsFraction   0.797584
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2312
		craterFreq      0.236703
		craterDensity   1.05489
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.549674
		volcanoTemp     1493.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.227, 0.225, 0.225, 0.000)
		colorShelf     (0.241, 0.239, 0.239, 0.000)
		colorBeach     (0.256, 0.254, 0.253, 0.000)
		colorDesert    (0.270, 0.268, 0.267, 0.000)
		colorLowland   (0.284, 0.282, 0.281, 0.000)
		colorUpland    (0.298, 0.296, 0.295, 0.000)
		colorRock      (0.312, 0.310, 0.309, 0.000)
		colorSnow      (0.327, 0.324, 0.323, 1.000)
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
		SemiMajorAxis   0.23116
		Period          2.69674
		Eccentricity    0.377173
		Inclination     80.525
		AscendingNode   -62.1248
		ArgOfPericenter -124.845
		MeanAnomaly     30.7382
	}
}



DwarfMoon	"Kissarm.D45"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            7.70347e-009
	Radius          27.4933
	InertiaMoment   0.398734

	RotationPeriod  813.274
	Obliquity       -93.3685
	EqAscendNode    118.953

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.461 0.455 0.450)

	Surface
	{
		SurfStyle       0.833931
		OceanStyle      0.163649
		Randomize      (-0.889, 0.822, -0.112)
		colorDistMagn   0.150366
		colorDistFreq   0.554572
		detailScale     750.751
		colorConversion true
		snowLevel       2
		tropicLatitude  0.924129
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.74585
		terraceProb     0.263144
		erosion         0
		montesMagn      0.615333
		montesFreq      4.10968
		montesSpiky     0.988354
		montesFraction  0.55711
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.52145
		hillsFraction   0.546265
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231975
		craterFreq      0.238026
		craterDensity   1.01299
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.409769
		volcanoTemp     1861.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.180, 0.155, 0.126, 0.000)
		colorShelf     (0.184, 0.159, 0.144, 0.000)
		colorBeach     (0.217, 0.187, 0.171, 0.000)
		colorDesert    (0.235, 0.200, 0.167, 0.000)
		colorLowland   (0.258, 0.214, 0.189, 0.000)
		colorUpland    (0.286, 0.259, 0.230, 0.000)
		colorRock      (0.309, 0.282, 0.248, 0.000)
		colorSnow      (0.336, 0.300, 0.261, 1.000)
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
		SemiMajorAxis   0.231753
		Period          2.70712
		Eccentricity    0.250266
		Inclination     -67.7823
		AscendingNode   115.943
		ArgOfPericenter 10.9742
		MeanAnomaly     161.723
	}
}



DwarfMoon	"Kissarm.D46"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            1.05302e-008
	Radius          29.1654
	InertiaMoment   0.399689

	RotationPeriod  739.549
	Obliquity       -4.93222
	EqAscendNode    161.434

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.651 0.646 0.641)

	Surface
	{
		SurfStyle       0.317591
		OceanStyle      0.592024
		Randomize      (-0.314, -0.190, 0.537)
		colorDistMagn   0.861885
		colorDistFreq   0.755353
		detailScale     796.411
		colorConversion true
		snowLevel       2
		tropicLatitude  0.747868
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.353485
		terraceProb     0.338907
		erosion         0
		montesMagn      0.495618
		montesFreq      1.98819
		montesSpiky     0.988978
		montesFraction  0.542451
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.26159
		hillsFraction   0.808463
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250534
		craterFreq      0.24971
		craterDensity   0.897511
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.579787
		volcanoTemp     1605.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.260, 0.258, 0.257, 0.000)
		colorShelf     (0.277, 0.275, 0.273, 0.000)
		colorBeach     (0.293, 0.291, 0.289, 0.000)
		colorDesert    (0.309, 0.307, 0.305, 0.000)
		colorLowland   (0.326, 0.323, 0.321, 0.000)
		colorUpland    (0.342, 0.339, 0.337, 0.000)
		colorRock      (0.358, 0.355, 0.353, 0.000)
		colorSnow      (0.374, 0.371, 0.369, 1.000)
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
		SemiMajorAxis   0.232385
		Period          2.71819
		Eccentricity    0.412756
		Inclination     43.6453
		AscendingNode   164.202
		ArgOfPericenter -21.1786
		MeanAnomaly     -22.0518
	}
}



DwarfMoon	"Kissarm.D47"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            1.4348e-008
	Radius          38.1071
	InertiaMoment   0.397581

	RotationPeriod  823.896
	Obliquity       96.9608
	EqAscendNode    -126.621

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.693 0.689 0.685)

	Surface
	{
		SurfStyle       0.298557
		OceanStyle      0.839673
		Randomize      (-0.344, 0.654, -0.961)
		colorDistMagn   0.191371
		colorDistFreq   0.868177
		detailScale     1040.58
		colorConversion true
		snowLevel       2
		tropicLatitude  0.875423
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.574852
		terraceProb     0.392925
		erosion         0
		montesMagn      0.626494
		montesFreq      4.255
		montesSpiky     0.957127
		montesFraction  0.927473
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.9781
		hillsFraction   0.907344
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218453
		craterFreq      0.218765
		craterDensity   0.848558
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.486248
		volcanoTemp     1590.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.277, 0.275, 0.274, 0.000)
		colorShelf     (0.295, 0.293, 0.291, 0.000)
		colorBeach     (0.312, 0.310, 0.308, 0.000)
		colorDesert    (0.329, 0.327, 0.325, 0.000)
		colorLowland   (0.347, 0.344, 0.342, 0.000)
		colorUpland    (0.364, 0.362, 0.360, 0.000)
		colorRock      (0.381, 0.379, 0.377, 0.000)
		colorSnow      (0.399, 0.396, 0.394, 1.000)
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
		SemiMajorAxis   0.232682
		Period          2.72341
		Eccentricity    0.338219
		Inclination     64.5284
		AscendingNode   -126.693
		ArgOfPericenter 69.365
		MeanAnomaly     5.99392
	}
}



DwarfMoon	"Kissarm.D48"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            1.95057e-008
	Radius          39.3068
	InertiaMoment   0.398883

	RotationPeriod  731.244
	Obliquity       -46.2668
	EqAscendNode    109.68

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.483 0.480 0.475)

	Surface
	{
		SurfStyle       0.963804
		OceanStyle      0.87987
		Randomize      (-0.579, 0.389, -0.475)
		colorDistMagn   0.238872
		colorDistFreq   0.807998
		detailScale     1073.34
		colorConversion true
		snowLevel       2
		tropicLatitude  0.631501
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.515574
		terraceProb     0.245182
		erosion         0
		montesMagn      0.637314
		montesFreq      2.26372
		montesSpiky     0.993667
		montesFraction  0.515294
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.56536
		hillsFraction   0.762728
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230771
		craterFreq      0.217171
		craterDensity   0.968372
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.465076
		volcanoTemp     1440.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.164, 0.168, 0.190, 0.050)
		colorShelf     (0.193, 0.197, 0.219, 0.040)
		colorBeach     (0.222, 0.225, 0.247, 0.030)
		colorDesert    (0.251, 0.254, 0.280, 0.020)
		colorLowland   (0.280, 0.283, 0.309, 0.030)
		colorUpland    (0.309, 0.312, 0.337, 0.050)
		colorRock      (0.338, 0.341, 0.375, 0.020)
		colorSnow      (0.338, 0.341, 0.375, 1.000)
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
		SemiMajorAxis   0.233206
		Period          2.73262
		Eccentricity    0.467181
		Inclination     -21.8568
		AscendingNode   119.819
		ArgOfPericenter 19.6727
		MeanAnomaly     28.0296
	}
}



DwarfMoon	"Kissarm.D49"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            2.64811e-008
	Radius          41.7269
	InertiaMoment   0.399815

	RotationPeriod  667.757
	Obliquity       -1.94732
	EqAscendNode    163.557

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.561 0.557 0.555)

	Surface
	{
		SurfStyle       0.103046
		OceanStyle      0.432262
		Randomize      (-0.979, -0.037, -0.041)
		colorDistMagn   0.209352
		colorDistFreq   0.357099
		detailScale     1139.42
		colorConversion true
		snowLevel       2
		tropicLatitude  0.389901
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.301228
		terraceProb     0.337723
		erosion         0
		montesMagn      0.377689
		montesFreq      2.61165
		montesSpiky     0.929717
		montesFraction  0.54648
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.14909
		hillsFraction   0.590841
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.21963
		craterFreq      0.206525
		craterDensity   0.796031
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.605667
		volcanoTemp     1199.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.224, 0.223, 0.222, 0.000)
		colorShelf     (0.238, 0.237, 0.236, 0.000)
		colorBeach     (0.252, 0.251, 0.250, 0.000)
		colorDesert    (0.266, 0.265, 0.264, 0.000)
		colorLowland   (0.280, 0.279, 0.277, 0.000)
		colorUpland    (0.294, 0.292, 0.291, 0.000)
		colorRock      (0.308, 0.306, 0.305, 0.000)
		colorSnow      (0.322, 0.320, 0.319, 1.000)
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
		SemiMajorAxis   0.233636
		Period          2.74018
		Eccentricity    0.1495
		Inclination     -24.8888
		AscendingNode   175.357
		ArgOfPericenter 17.9767
		MeanAnomaly     100.641
	}
}



DwarfMoon	"Kissarm.D50"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            3.5933e-008
	Radius          44.2509
	InertiaMoment   0.397823

	RotationPeriod  607.109
	Obliquity       32.6478
	EqAscendNode    -16.3215

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.444 0.440 0.437)

	Surface
	{
		SurfStyle       0.219214
		OceanStyle      0.877185
		Randomize      (0.983, -0.301, 0.789)
		colorDistMagn   0.995197
		colorDistFreq   1.65666
		detailScale     1208.34
		colorConversion true
		snowLevel       2
		tropicLatitude  0.98335
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.748034
		terraceProb     0.20635
		erosion         0
		montesMagn      0.38042
		montesFreq      3.13354
		montesSpiky     0.944905
		montesFraction  0.61114
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.22563
		hillsFraction   0.487966
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236958
		craterFreq      0.278784
		craterDensity   0.786758
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.543918
		volcanoTemp     1416.53
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.178, 0.176, 0.175, 0.000)
		colorShelf     (0.189, 0.187, 0.186, 0.000)
		colorBeach     (0.200, 0.198, 0.197, 0.000)
		colorDesert    (0.211, 0.209, 0.208, 0.000)
		colorLowland   (0.222, 0.220, 0.219, 0.000)
		colorUpland    (0.233, 0.231, 0.229, 0.000)
		colorRock      (0.244, 0.242, 0.240, 0.000)
		colorSnow      (0.255, 0.253, 0.251, 1.000)
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
		SemiMajorAxis   0.233985
		Period          2.74632
		Eccentricity    0.243
		Inclination     68.4379
		AscendingNode   -11.7747
		ArgOfPericenter 20.9394
		MeanAnomaly     -23.8414
	}
}



DwarfMoon	"Kissarm.D51"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            4.87762e-008
	Radius          58.5622
	InertiaMoment   0.399026

	RotationPeriod  689.224
	Obliquity       37.3617
	EqAscendNode    -128.433

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.733 0.694 0.645)

	Surface
	{
		SurfStyle       0.728455
		OceanStyle      0.489316
		Randomize      (0.908, -0.785, -0.985)
		colorDistMagn   0.528849
		colorDistFreq   1.93751
		detailScale     1599.14
		colorConversion true
		snowLevel       2
		tropicLatitude  0.689132
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.499327
		terraceProb     0.287721
		erosion         0
		montesMagn      0.416912
		montesFreq      2.31923
		montesSpiky     0.904959
		montesFraction  0.560968
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.16671
		hillsFraction   0.458508
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.205562
		craterFreq      0.218581
		craterDensity   1.04531
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.481574
		volcanoTemp     1576.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.286, 0.236, 0.181, 0.000)
		colorShelf     (0.293, 0.243, 0.207, 0.000)
		colorBeach     (0.345, 0.284, 0.245, 0.000)
		colorDesert    (0.374, 0.305, 0.239, 0.000)
		colorLowland   (0.410, 0.326, 0.271, 0.000)
		colorUpland    (0.454, 0.395, 0.329, 0.000)
		colorRock      (0.491, 0.430, 0.355, 0.000)
		colorSnow      (0.535, 0.458, 0.374, 1.000)
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
		SemiMajorAxis   0.234219
		Period          2.75045
		Eccentricity    0.368352
		Inclination     -10.1984
		AscendingNode   -122.435
		ArgOfPericenter -96.5812
		MeanAnomaly     166.485
	}
}



DwarfMoon	"Kissarm.D52"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            6.62911e-008
	Radius          59.5143
	InertiaMoment   0.39994

	RotationPeriod  602.578
	Obliquity       112.173
	EqAscendNode    156.824

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.485 0.479 0.476)

	Surface
	{
		SurfStyle       0.400872
		OceanStyle      0.632929
		Randomize      (-0.995, -0.898, -0.808)
		colorDistMagn   0.81645
		colorDistFreq   1.77574
		detailScale     1625.14
		colorConversion true
		snowLevel       2
		tropicLatitude  0.52697
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.25948
		terraceProb     0.250699
		erosion         0
		montesMagn      0.548897
		montesFreq      2.81433
		montesSpiky     0.812123
		montesFraction  0.765398
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.03127
		hillsFraction   0.690827
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2848
		craterFreq      0.253164
		craterDensity   0.924844
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.452545
		volcanoTemp     1478.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.194, 0.192, 0.190, 0.000)
		colorShelf     (0.206, 0.204, 0.202, 0.000)
		colorBeach     (0.218, 0.216, 0.214, 0.000)
		colorDesert    (0.230, 0.228, 0.226, 0.000)
		colorLowland   (0.242, 0.240, 0.238, 0.000)
		colorUpland    (0.255, 0.252, 0.250, 0.000)
		colorRock      (0.267, 0.263, 0.262, 0.000)
		colorSnow      (0.279, 0.275, 0.274, 1.000)
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
		SemiMajorAxis   0.234632
		Period          2.75771
		Eccentricity    0.320208
		Inclination     87.0932
		AscendingNode   159.99
		ArgOfPericenter 80.7347
		MeanAnomaly     -30.5743
	}
}



DwarfMoon	"Kissarm.D53"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            9.02865e-008
	Radius          63.1564
	InertiaMoment   0.398036

	RotationPeriod  547.198
	Obliquity       -51.2865
	EqAscendNode    -11.5054

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.684 0.653 0.597)

	Surface
	{
		SurfStyle       0.175248
		OceanStyle      0.52041
		Randomize      (-0.316, -0.375, 0.729)
		colorDistMagn   0.617407
		colorDistFreq   3.15294
		detailScale     1724.59
		colorConversion true
		snowLevel       2
		tropicLatitude  0.925957
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.515941
		terraceProb     0.201151
		erosion         0
		montesMagn      0.355164
		montesFreq      1.87006
		montesSpiky     0.917554
		montesFraction  0.863559
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.4804
		hillsFraction   0.597349
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248811
		craterFreq      0.259947
		craterDensity   0.949971
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.510437
		volcanoTemp     1380.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.274, 0.261, 0.239, 0.000)
		colorShelf     (0.291, 0.277, 0.254, 0.000)
		colorBeach     (0.308, 0.294, 0.269, 0.000)
		colorDesert    (0.325, 0.310, 0.284, 0.000)
		colorLowland   (0.342, 0.326, 0.299, 0.000)
		colorUpland    (0.359, 0.343, 0.314, 0.000)
		colorRock      (0.376, 0.359, 0.328, 0.000)
		colorSnow      (0.393, 0.375, 0.343, 1.000)
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
		SemiMajorAxis   0.235137
		Period          2.76662
		Eccentricity    0.134583
		Inclination     -16.7957
		AscendingNode   -11.2753
		ArgOfPericenter 83.4337
		MeanAnomaly     17.5122
	}
}



DwarfMoon	"Kissarm.D54"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            1.23343e-007
	Radius          67.2225
	InertiaMoment   0.399164

	RotationPeriod  499.53
	Obliquity       87.2971
	EqAscendNode    78.8659

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.641 0.579 0.456)

	Surface
	{
		SurfStyle       0.389164
		OceanStyle      0.893316
		Randomize      (-0.014, 0.581, 0.157)
		colorDistMagn   0.372583
		colorDistFreq   1.97082
		detailScale     1835.62
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999944
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.54535
		terraceProb     0.211726
		erosion         0
		montesMagn      0.518049
		montesFreq      3.23113
		montesSpiky     0.956327
		montesFraction  0.760317
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.0008
		hillsFraction   0.953568
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.287961
		craterFreq      0.175416
		craterDensity   0.841203
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.425245
		volcanoTemp     1311.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.256, 0.232, 0.183, 0.000)
		colorShelf     (0.272, 0.246, 0.194, 0.000)
		colorBeach     (0.288, 0.261, 0.205, 0.000)
		colorDesert    (0.305, 0.275, 0.217, 0.000)
		colorLowland   (0.321, 0.290, 0.228, 0.000)
		colorUpland    (0.337, 0.304, 0.240, 0.000)
		colorRock      (0.353, 0.319, 0.251, 0.000)
		colorSnow      (0.369, 0.333, 0.262, 1.000)
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
		SemiMajorAxis   0.235385
		Period          2.771
		Eccentricity    0.312489
		Inclination     36.0674
		AscendingNode   85.2519
		ArgOfPericenter 124.555
		MeanAnomaly     -10.6646
	}
}



DwarfMoon	"Kissarm.D55"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            1.69188e-007
	Radius          92.0938
	InertiaMoment   0.39555

	RotationPeriod  580.401
	Obliquity       10.8847
	EqAscendNode    4.62122

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.423 0.418 0.416)

	Surface
	{
		SurfStyle       0.718848
		OceanStyle      0.325757
		Randomize      (0.647, 0.245, -0.539)
		colorDistMagn   0.493873
		colorDistFreq   5.78171
		detailScale     2514.77
		colorConversion true
		snowLevel       2
		tropicLatitude  0.512273
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.689614
		terraceProb     0.415516
		erosion         0
		montesMagn      0.540945
		montesFreq      3.33625
		montesSpiky     0.933377
		montesFraction  0.520159
		dunesFraction   0
		hillsMagn       0
		hillsFreq       24.8446
		hillsFraction   0.7955
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232662
		craterFreq      0.272182
		craterDensity   1.03683
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.482419
		volcanoTemp     1726.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.165, 0.142, 0.116, 0.000)
		colorShelf     (0.169, 0.146, 0.133, 0.000)
		colorBeach     (0.199, 0.171, 0.158, 0.000)
		colorDesert    (0.216, 0.184, 0.154, 0.000)
		colorLowland   (0.237, 0.197, 0.175, 0.000)
		colorUpland    (0.262, 0.238, 0.212, 0.000)
		colorRock      (0.283, 0.259, 0.229, 0.000)
		colorSnow      (0.308, 0.276, 0.241, 1.000)
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
		SemiMajorAxis   0.235725
		Period          2.77701
		Eccentricity    0.199818
		Inclination     19.9437
		AscendingNode   3.44728
		ArgOfPericenter -100.604
		MeanAnomaly     123.37
	}
}



DwarfMoon	"Kissarm.D56"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            2.33269e-007
	Radius          91.2096
	InertiaMoment   0.39823

	RotationPeriod  492.167
	Obliquity       -64.323
	EqAscendNode    5.8343

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.715 0.713 0.711)

	Surface
	{
		SurfStyle       0.608693
		OceanStyle      0.785903
		Randomize      (-0.696, 0.374, 0.790)
		colorDistMagn   0.793011
		colorDistFreq   5.15113
		detailScale     2490.63
		colorConversion true
		snowLevel       2
		tropicLatitude  0.744239
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.270499
		terraceProb     0.139543
		erosion         0
		montesMagn      0.458108
		montesFreq      3.27002
		montesSpiky     0.858346
		montesFraction  0.302581
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.88
		hillsFraction   0.715764
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.267311
		craterFreq      0.232655
		craterDensity   0.871955
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50412
		volcanoTemp     1574.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.279, 0.242, 0.199, 0.000)
		colorShelf     (0.286, 0.249, 0.228, 0.000)
		colorBeach     (0.336, 0.292, 0.270, 0.000)
		colorDesert    (0.364, 0.314, 0.263, 0.000)
		colorLowland   (0.400, 0.335, 0.299, 0.000)
		colorUpland    (0.443, 0.406, 0.363, 0.000)
		colorRock      (0.479, 0.442, 0.391, 0.000)
		colorSnow      (0.522, 0.470, 0.413, 1.000)
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
		SemiMajorAxis   0.23624
		Period          2.78612
		Eccentricity    0.0234716
		Inclination     -67.9633
		AscendingNode   6.22251
		ArgOfPericenter 17.7793
		MeanAnomaly     54.3063
	}
}



DwarfMoon	"Kissarm.D57"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            3.23668e-007
	Radius          97.2073
	InertiaMoment   0.399299

	RotationPeriod  446.33
	Obliquity       63.6688
	EqAscendNode    -7.32238

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.453 0.421 0.371)

	Surface
	{
		SurfStyle       0.109659
		OceanStyle      0.189264
		Randomize      (0.182, 0.050, 0.394)
		colorDistMagn   0.853026
		colorDistFreq   7.27776
		detailScale     2654.41
		colorConversion true
		snowLevel       2
		tropicLatitude  0.53961
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.481224
		terraceProb     0.416503
		erosion         0
		montesMagn      0.529504
		montesFreq      2.36057
		montesSpiky     0.869254
		montesFraction  0.531517
		dunesFraction   0
		hillsMagn       0
		hillsFreq       19.8341
		hillsFraction   0.699443
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.204895
		craterFreq      0.291057
		craterDensity   0.939703
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.451855
		volcanoTemp     1788.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.181, 0.169, 0.148, 0.000)
		colorShelf     (0.193, 0.179, 0.158, 0.000)
		colorBeach     (0.204, 0.190, 0.167, 0.000)
		colorDesert    (0.215, 0.200, 0.176, 0.000)
		colorLowland   (0.227, 0.211, 0.185, 0.000)
		colorUpland    (0.238, 0.221, 0.195, 0.000)
		colorRock      (0.249, 0.232, 0.204, 0.000)
		colorSnow      (0.261, 0.242, 0.213, 1.000)
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
		SemiMajorAxis   0.236687
		Period          2.79403
		Eccentricity    0.0837485
		Inclination     84.0864
		AscendingNode   -5.33432
		ArgOfPericenter -51.1851
		MeanAnomaly     11.8731
	}
}



DwarfMoon	"Kissarm.D58"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            4.52579e-007
	Radius          104.362
	InertiaMoment   0.39645

	RotationPeriod  404.19
	Obliquity       114.464
	EqAscendNode    166.07

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.494 0.378 0.315)

	Surface
	{
		SurfStyle       0.524132
		OceanStyle      0.0654646
		Randomize      (-0.746, -0.161, 0.324)
		colorDistMagn   0.16574
		colorDistFreq   6.2654
		detailScale     2849.79
		colorConversion true
		snowLevel       2
		tropicLatitude  0.92624
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.43472
		terraceProb     0.196702
		erosion         0
		montesMagn      0.342609
		montesFreq      3.42125
		montesSpiky     0.963371
		montesFraction  0.567737
		dunesFraction   0
		hillsMagn       0
		hillsFreq       23.2641
		hillsFraction   0.736733
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236306
		craterFreq      0.354022
		craterDensity   0.946875
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.555247
		volcanoTemp     1232.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.193, 0.129, 0.088, 0.000)
		colorShelf     (0.197, 0.132, 0.101, 0.000)
		colorBeach     (0.232, 0.155, 0.120, 0.000)
		colorDesert    (0.252, 0.166, 0.117, 0.000)
		colorLowland   (0.276, 0.178, 0.132, 0.000)
		colorUpland    (0.306, 0.216, 0.161, 0.000)
		colorRock      (0.331, 0.235, 0.173, 0.000)
		colorSnow      (0.360, 0.250, 0.183, 1.000)
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
		SemiMajorAxis   0.236909
		Period          2.79795
		Eccentricity    0.102974
		Inclination     47.2784
		AscendingNode   169.682
		ArgOfPericenter 38.1694
		MeanAnomaly     62.171
	}
}



DwarfMoon	"Kissarm.D59"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            6.38734e-007
	Radius          107.028
	InertiaMoment   0.398407

	RotationPeriod  350.229
	Obliquity       -53.9094
	EqAscendNode    -183.854

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.471 0.467 0.462)

	Surface
	{
		SurfStyle       0.311919
		OceanStyle      0.0998652
		Randomize      (0.470, 0.080, 0.514)
		colorDistMagn   0.664986
		colorDistFreq   8.91201
		detailScale     2922.57
		colorConversion true
		snowLevel       2
		tropicLatitude  0.132293
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.3084
		terraceProb     0.129924
		erosion         0
		montesMagn      0.623483
		montesFreq      2.78995
		montesSpiky     0.784865
		montesFraction  0.845511
		dunesFraction   0
		hillsMagn       0
		hillsFreq       33.7123
		hillsFraction   0.427989
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224263
		craterFreq      0.340813
		craterDensity   0.79807
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.532408
		volcanoTemp     1501.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.188, 0.187, 0.185, 0.000)
		colorShelf     (0.200, 0.198, 0.196, 0.000)
		colorBeach     (0.212, 0.210, 0.208, 0.000)
		colorDesert    (0.224, 0.222, 0.219, 0.000)
		colorLowland   (0.236, 0.233, 0.231, 0.000)
		colorUpland    (0.247, 0.245, 0.242, 0.000)
		colorRock      (0.259, 0.257, 0.254, 0.000)
		colorSnow      (0.271, 0.268, 0.265, 1.000)
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
		SemiMajorAxis   0.237272
		Period          2.8044
		Eccentricity    0.230383
		Inclination     -59.5273
		AscendingNode   -173.867
		ArgOfPericenter 37.8299
		MeanAnomaly     -88.5025
	}
}



DwarfMoon	"Kissarm.D60"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            9.11544e-007
	Radius          144.855
	InertiaMoment   0.39943

	RotationPeriod  396.746
	Obliquity       -7.11005
	EqAscendNode    37.3131

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.703 0.701 0.700)

	Surface
	{
		SurfStyle       0.0691334
		OceanStyle      0.544334
		Randomize      (-0.841, -0.085, 0.136)
		colorDistMagn   0.890555
		colorDistFreq   14.7218
		detailScale     3955.51
		colorConversion true
		snowLevel       2
		tropicLatitude  0.132737
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.629511
		terraceProb     0.377156
		erosion         0
		montesMagn      0.488014
		montesFreq      3.03806
		montesSpiky     0.93713
		montesFraction  0.229394
		dunesFraction   0
		hillsMagn       0
		hillsFreq       73.7307
		hillsFraction   0.853603
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219027
		craterFreq      0.647858
		craterDensity   0.845106
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.497015
		volcanoTemp     1306.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.281, 0.280, 0.280, 0.000)
		colorShelf     (0.299, 0.298, 0.297, 0.000)
		colorBeach     (0.316, 0.316, 0.315, 0.000)
		colorDesert    (0.334, 0.333, 0.332, 0.000)
		colorLowland   (0.352, 0.351, 0.350, 0.000)
		colorUpland    (0.369, 0.368, 0.367, 0.000)
		colorRock      (0.387, 0.386, 0.385, 0.000)
		colorSnow      (0.404, 0.403, 0.402, 1.000)
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
		SemiMajorAxis   0.237768
		Period          2.81318
		Eccentricity    0.203255
		Inclination     11.6545
		AscendingNode   39.4802
		ArgOfPericenter -91.6301
		MeanAnomaly     -7.32371
	}
}



DwarfMoon	"Kissarm.D61"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            1.31833e-006
	Radius          156.135
	InertiaMoment   0.396938

	RotationPeriod  354.841
	Obliquity       29.5327
	EqAscendNode    161.114

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.459 0.455 0.451)

	Surface
	{
		SurfStyle       0.32985
		OceanStyle      0.568632
		Randomize      (-0.926, -0.828, -0.836)
		colorDistMagn   0.971412
		colorDistFreq   18.4098
		detailScale     4263.52
		colorConversion true
		snowLevel       2
		tropicLatitude  0.704275
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.436195
		terraceProb     0.195493
		erosion         0
		montesMagn      0.409509
		montesFreq      3.05666
		montesSpiky     0.912421
		montesFraction  0.555143
		dunesFraction   0
		hillsMagn       0
		hillsFreq       61.8951
		hillsFraction   0.424966
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.275065
		craterFreq      0.845791
		craterDensity   0.881943
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.446271
		volcanoTemp     1285.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.183, 0.182, 0.180, 0.000)
		colorShelf     (0.195, 0.194, 0.191, 0.000)
		colorBeach     (0.206, 0.205, 0.203, 0.000)
		colorDesert    (0.218, 0.216, 0.214, 0.000)
		colorLowland   (0.229, 0.228, 0.225, 0.000)
		colorUpland    (0.241, 0.239, 0.237, 0.000)
		colorRock      (0.252, 0.251, 0.248, 0.000)
		colorSnow      (0.264, 0.262, 0.259, 1.000)
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
		SemiMajorAxis   0.238127
		Period          2.81956
		Eccentricity    0.164295
		Inclination     72.9679
		AscendingNode   164.923
		ArgOfPericenter 13.715
		MeanAnomaly     -126.115
	}
}



DwarfMoon	"Kissarm.D62"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            1.93741e-006
	Radius          170.506
	InertiaMoment   0.398574

	RotationPeriod  320.568
	Obliquity       94.4204
	EqAscendNode    28.3168

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.603 0.601 0.598)

	Surface
	{
		SurfStyle       0.735962
		OceanStyle      0.854296
		Randomize      (-0.385, -0.209, -0.474)
		colorDistMagn   0.95557
		colorDistFreq   7.99843
		detailScale     4655.94
		colorConversion true
		snowLevel       2
		tropicLatitude  0.484853
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.573013
		terraceProb     0.223569
		erosion         0
		montesMagn      0.341734
		montesFreq      2.76743
		montesSpiky     0.998118
		montesFraction  0.516118
		dunesFraction   0
		hillsMagn       0
		hillsFreq       66.8415
		hillsFraction   0.523107
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231399
		craterFreq      0.878409
		craterDensity   0.784877
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.535324
		volcanoTemp     1503.25
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.235, 0.204, 0.167, 0.000)
		colorShelf     (0.241, 0.210, 0.191, 0.000)
		colorBeach     (0.283, 0.246, 0.227, 0.000)
		colorDesert    (0.308, 0.264, 0.221, 0.000)
		colorLowland   (0.338, 0.282, 0.251, 0.000)
		colorUpland    (0.374, 0.342, 0.305, 0.000)
		colorRock      (0.404, 0.372, 0.329, 0.000)
		colorSnow      (0.440, 0.396, 0.347, 1.000)
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
		SemiMajorAxis   0.238531
		Period          2.82674
		Eccentricity    0.135266
		Inclination     86.8719
		AscendingNode   29.039
		ArgOfPericenter -11.5916
		MeanAnomaly     109.983
	}
}



DwarfMoon	"Kissarm.D63"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            2.90286e-006
	Radius          183.225
	InertiaMoment   0.399559

	RotationPeriod  282.035
	Obliquity       14.4181
	EqAscendNode    -103.667

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.517 0.513 0.510)

	Surface
	{
		SurfStyle       0.975236
		OceanStyle      0.0827957
		Randomize      (-0.756, -0.186, 0.212)
		colorDistMagn   0.915465
		colorDistFreq   11.96
		detailScale     5003.27
		colorConversion true
		snowLevel       2
		tropicLatitude  0.29891
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.751301
		terraceProb     0.411134
		erosion         0
		montesMagn      0.341509
		montesFreq      2.43222
		montesSpiky     0.930038
		montesFraction  0.647376
		dunesFraction   0
		hillsMagn       0
		hillsFreq       90.8387
		hillsFraction   0.556963
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236194
		craterFreq      1.43105
		craterDensity   0.865597
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.554311
		volcanoTemp     1493.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.176, 0.180, 0.204, 0.050)
		colorShelf     (0.207, 0.210, 0.235, 0.040)
		colorBeach     (0.238, 0.241, 0.265, 0.030)
		colorDesert    (0.269, 0.272, 0.301, 0.020)
		colorLowland   (0.300, 0.303, 0.332, 0.030)
		colorUpland    (0.331, 0.334, 0.362, 0.050)
		colorRock      (0.362, 0.364, 0.403, 0.020)
		colorSnow      (0.362, 0.364, 0.403, 1.000)
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
		SemiMajorAxis   0.239059
		Period          2.83613
		Eccentricity    0.146875
		Inclination     -6.56224
		AscendingNode   -106.072
		ArgOfPericenter -122.623
		MeanAnomaly     -23.6596
	}
}



Moon	"Kissarm.9"
{
	ParentBody     "Kissarm"
	Class	       "IceWorld"

	Mass            4.45347e-006
	Radius          248.066
	InertiaMoment   0.397291

	RotationPeriod  307.172
	Obliquity       -83.2381
	EqAscendNode    -5.3953

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.760 0.668 0.539)

	Surface
	{
		SurfStyle       0.68339
		OceanStyle      0.375612
		Randomize      (-0.992, 0.628, -0.380)
		colorDistMagn   0.0611914
		colorDistFreq   24.4653
		detailScale     638.04
		colorConversion true
		drivenDarkening 0.0297248
		seaLevel        0.185691
		snowLevel       2
		tropicLatitude  0.316124
		icecapLatitude  0.843101
		icecapHeight    0.197771
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.65669
		venusFreq       0.949503
		venusMagn       0
		mareFreq        0
		mareDensity     1.37046e-006
		terraceProb     0.31541
		erosion         0
		montesMagn      0.0640437
		montesFreq      13.8104
		montesSpiky     0.873772
		montesFraction  0.084815
		dunesMagn       0.0405213
		dunesFreq       322.845
		dunesFraction   0.968042
		hillsMagn       0.142246
		hillsFreq       31.9692
		hillsFraction   0.129302
		hills2Fraction  0.283344
		riversMagn      66.273
		riversFreq      2.9588
		riversSin       6.62302
		riversOctaves   0
		canyonsMagn     0.488017
		canyonsFreq     0.0671904
		canyonFraction  0
		cracksMagn      0.0485397
		cracksFreq      0.0644039
		cracksOctaves   0
		craterMagn      0.821313
		craterFreq      0.886519
		craterDensity   0.965397
		craterOctaves   8
		craterRayedFactor 0.227868
		volcanoMagn     0.172591
		volcanoFreq     0.644003
		volcanoDensity  0.215182
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.287077
		volcanoRadius   0.137927
		volcanoTemp     1850.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.486, 0.427, 0.361, 0.250)
		colorShelf     (0.532, 0.487, 0.410, 0.250)
		colorBeach     (0.433, 0.361, 0.313, 0.200)
		colorDesert    (0.403, 0.327, 0.275, 0.200)
		colorLowland   (0.296, 0.254, 0.226, 0.200)
		colorUpland    (0.562, 0.494, 0.410, 0.250)
		colorRock      (0.640, 0.630, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.296, 0.254, 0.226, 0.200)
		colorUpPlants  (0.562, 0.494, 0.410, 0.250)
		BumpHeight      12.4033
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
		SemiMajorAxis   0.239317
		Period          2.84072
		Eccentricity    0.0249011
		Inclination     -79.3802
		AscendingNode   -6.15051
		ArgOfPericenter -51.805
		MeanAnomaly     85.1656
	}
}



DwarfMoon	"Kissarm.D64"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            1.20224e-011
	Radius          3.28125
	InertiaMoment   0.39873

	RotationPeriod  2335.12
	Obliquity       -5.79999
	EqAscendNode    3.73837

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.809 0.773 0.757)

	Surface
	{
		SurfStyle       0.0278698
		OceanStyle      0.14843
		Randomize      (-0.171, 0.798, -0.239)
		colorDistMagn   0.88042
		colorDistFreq   0.00725456
		detailScale     89.5999
		colorConversion true
		snowLevel       2
		tropicLatitude  0.150169
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.329604
		terraceProb     0.329612
		erosion         0
		montesMagn      0.455362
		montesFreq      2.57111
		montesSpiky     0.798666
		montesFraction  0.615974
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0260305
		hillsFraction   0.848641
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25612
		craterFreq      0.176603
		craterDensity   0.784628
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.474451
		volcanoTemp     1477.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.323, 0.309, 0.303, 0.000)
		colorShelf     (0.344, 0.329, 0.322, 0.000)
		colorBeach     (0.364, 0.348, 0.341, 0.000)
		colorDesert    (0.384, 0.367, 0.360, 0.000)
		colorLowland   (0.404, 0.387, 0.379, 0.000)
		colorUpland    (0.425, 0.406, 0.397, 0.000)
		colorRock      (0.445, 0.425, 0.416, 0.000)
		colorSnow      (0.465, 0.445, 0.435, 1.000)
		BumpHeight      2.95312
		BumpOffset      0.590624
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.239669
		Period          2.84699
		Eccentricity    0.332581
		Inclination     14.4089
		AscendingNode   4.36367
		ArgOfPericenter -104.146
		MeanAnomaly     164.333
	}
}



DwarfMoon	"Kissarm.D65"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            2.45903e-011
	Radius          4.00098
	InertiaMoment   0.399687

	RotationPeriod  2011.82
	Obliquity       14.9225
	EqAscendNode    -114.349

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.745 0.743 0.742)

	Surface
	{
		SurfStyle       0.432799
		OceanStyle      0.484725
		Randomize      (-0.839, -0.511, 0.298)
		colorDistMagn   0.289109
		colorDistFreq   0.00729088
		detailScale     109.254
		colorConversion true
		snowLevel       2
		tropicLatitude  0.762518
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.279998
		terraceProb     0.297207
		erosion         0
		montesMagn      0.573009
		montesFreq      3.35248
		montesSpiky     0.956992
		montesFraction  0.642561
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0386716
		hillsFraction   0.623972
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240894
		craterFreq      0.166275
		craterDensity   1.08567
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.487898
		volcanoTemp     1104.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.298, 0.297, 0.297, 0.000)
		colorShelf     (0.317, 0.316, 0.315, 0.000)
		colorBeach     (0.335, 0.334, 0.334, 0.000)
		colorDesert    (0.354, 0.353, 0.352, 0.000)
		colorLowland   (0.372, 0.372, 0.371, 0.000)
		colorUpland    (0.391, 0.390, 0.390, 0.000)
		colorRock      (0.410, 0.409, 0.408, 0.000)
		colorSnow      (0.428, 0.427, 0.427, 1.000)
		BumpHeight      3.60088
		BumpOffset      0.720177
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.239904
		Period          2.85118
		Eccentricity    0.469243
		Inclination     54.9862
		AscendingNode   -116.027
		ArgOfPericenter -39.977
		MeanAnomaly     -81.2866
	}
}



DwarfMoon	"Kissarm.D66"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            4.56815e-011
	Radius          4.66135
	InertiaMoment   0.397576

	RotationPeriod  1728.2
	Obliquity       45.3199
	EqAscendNode    -71.2656

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.617 0.613 0.609)

	Surface
	{
		SurfStyle       0.165823
		OceanStyle      0.467417
		Randomize      (0.729, 0.517, -0.606)
		colorDistMagn   0.472114
		colorDistFreq   0.00397291
		detailScale     127.286
		colorConversion true
		snowLevel       2
		tropicLatitude  0.948072
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.470756
		terraceProb     0.338777
		erosion         0
		montesMagn      0.3957
		montesFreq      2.34122
		montesSpiky     0.890119
		montesFraction  0.862137
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0575983
		hillsFraction   0.566482
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24793
		craterFreq      0.1714
		craterDensity   0.933855
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.450752
		volcanoTemp     1786.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.247, 0.245, 0.244, 0.000)
		colorShelf     (0.262, 0.260, 0.259, 0.000)
		colorBeach     (0.278, 0.276, 0.274, 0.000)
		colorDesert    (0.293, 0.291, 0.289, 0.000)
		colorLowland   (0.308, 0.306, 0.305, 0.000)
		colorUpland    (0.324, 0.322, 0.320, 0.000)
		colorRock      (0.339, 0.337, 0.335, 0.000)
		colorSnow      (0.355, 0.352, 0.350, 1.000)
		BumpHeight      4.19521
		BumpOffset      0.839043
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.240502
		Period          2.86185
		Eccentricity    0.425187
		Inclination     46.8727
		AscendingNode   -71.7366
		ArgOfPericenter -5.18137
		MeanAnomaly     93.9976
	}
}



DwarfMoon	"Kissarm.D67"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            7.93094e-011
	Radius          6.5464
	InertiaMoment   0.39888

	RotationPeriod  1837.79
	Obliquity       -87.8849
	EqAscendNode    39.4398

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.408 0.404 0.398)

	Surface
	{
		SurfStyle       0.333556
		OceanStyle      0.374822
		Randomize      (0.055, 0.910, -0.297)
		colorDistMagn   0.194312
		colorDistFreq   0.0285711
		detailScale     178.76
		colorConversion true
		snowLevel       2
		tropicLatitude  0.889178
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.695534
		terraceProb     0.375887
		erosion         0
		montesMagn      0.671512
		montesFreq      3.23863
		montesSpiky     0.993833
		montesFraction  0.894947
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.129459
		hillsFraction   0.635824
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.268366
		craterFreq      0.151766
		craterDensity   0.909057
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.58434
		volcanoTemp     1061.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.163, 0.162, 0.159, 0.000)
		colorShelf     (0.174, 0.172, 0.169, 0.000)
		colorBeach     (0.184, 0.182, 0.179, 0.000)
		colorDesert    (0.194, 0.192, 0.189, 0.000)
		colorLowland   (0.204, 0.202, 0.199, 0.000)
		colorUpland    (0.214, 0.212, 0.209, 0.000)
		colorRock      (0.225, 0.222, 0.219, 0.000)
		colorSnow      (0.235, 0.232, 0.229, 1.000)
		BumpHeight      5.89176
		BumpOffset      1.17835
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.240916
		Period          2.86925
		Eccentricity    0.192818
		Inclination     -37.3338
		AscendingNode   36.5424
		ArgOfPericenter 91.0681
		MeanAnomaly     143.029
	}
}



DwarfMoon	"Kissarm.D68"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            1.30958e-010
	Radius          7.3178
	InertiaMoment   0.399813

	RotationPeriod  1610.61
	Obliquity       19.5089
	EqAscendNode    -7.33023

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.575 0.532 0.467)

	Surface
	{
		SurfStyle       0.0449287
		OceanStyle      0.18619
		Randomize      (0.586, 0.803, -0.460)
		colorDistMagn   0.524231
		colorDistFreq   0.0170319
		detailScale     199.825
		colorConversion true
		snowLevel       2
		tropicLatitude  0.324347
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.604872
		terraceProb     0.343702
		erosion         0
		montesMagn      0.480258
		montesFreq      2.02676
		montesSpiky     0.923032
		montesFraction  0.880668
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.11925
		hillsFraction   0.627049
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247004
		craterFreq      0.239714
		craterDensity   1.01507
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.539678
		volcanoTemp     1568.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.230, 0.213, 0.187, 0.000)
		colorShelf     (0.245, 0.226, 0.198, 0.000)
		colorBeach     (0.259, 0.240, 0.210, 0.000)
		colorDesert    (0.273, 0.253, 0.222, 0.000)
		colorLowland   (0.288, 0.266, 0.233, 0.000)
		colorUpland    (0.302, 0.280, 0.245, 0.000)
		colorRock      (0.317, 0.293, 0.257, 0.000)
		colorSnow      (0.331, 0.306, 0.268, 1.000)
		BumpHeight      6.58602
		BumpOffset      1.3172
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.24146
		Period          2.87896
		Eccentricity    0.334031
		Inclination     -0.590431
		AscendingNode   -9.01794
		ArgOfPericenter -128.924
		MeanAnomaly     54.6302
	}
}



DwarfMoon	"Kissarm.D69"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            2.08067e-010
	Radius          8.20013
	InertiaMoment   0.397818

	RotationPeriod  1435.46
	Obliquity       128.428
	EqAscendNode    36.6156

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.524 0.516 0.514)

	Surface
	{
		SurfStyle       0.376695
		OceanStyle      0.960513
		Randomize      (0.593, 0.670, -0.887)
		colorDistMagn   0.947157
		colorDistFreq   0.0441471
		detailScale     223.918
		colorConversion true
		snowLevel       2
		tropicLatitude  0.45553
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.571813
		terraceProb     0.32434
		erosion         0
		montesMagn      0.432119
		montesFreq      2.91252
		montesSpiky     0.936497
		montesFraction  0.496988
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.149663
		hillsFraction   0.604843
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.202326
		craterFreq      0.230834
		craterDensity   0.865202
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.557403
		volcanoTemp     1518.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.210, 0.207, 0.205, 0.000)
		colorShelf     (0.223, 0.219, 0.218, 0.000)
		colorBeach     (0.236, 0.232, 0.231, 0.000)
		colorDesert    (0.249, 0.245, 0.244, 0.000)
		colorLowland   (0.262, 0.258, 0.257, 0.000)
		colorUpland    (0.275, 0.271, 0.270, 0.000)
		colorRock      (0.288, 0.284, 0.282, 0.000)
		colorSnow      (0.302, 0.297, 0.295, 1.000)
		BumpHeight      7.38012
		BumpOffset      1.47602
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.241792
		Period          2.88491
		Eccentricity    0.203842
		Inclination     64.5347
		AscendingNode   28.259
		ArgOfPericenter 55.8892
		MeanAnomaly     -135.07
	}
}



DwarfMoon	"Kissarm.D70"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            3.20674e-010
	Radius          9.02315
	InertiaMoment   0.399023

	RotationPeriod  1279.96
	Obliquity       43.937
	EqAscendNode    -93.2407

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.790 0.744 0.703)

	Surface
	{
		SurfStyle       0.573209
		OceanStyle      0.33017
		Randomize      (0.192, -0.849, -0.253)
		colorDistMagn   0.883305
		colorDistFreq   0.0465994
		detailScale     246.392
		colorConversion true
		snowLevel       2
		tropicLatitude  0.929159
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.591269
		terraceProb     0.243419
		erosion         0
		montesMagn      0.601713
		montesFreq      3.26965
		montesSpiky     0.964635
		montesFraction  0.242118
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.189838
		hillsFraction   0.644886
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246712
		craterFreq      0.246718
		craterDensity   0.932365
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.539465
		volcanoTemp     1485.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.308, 0.253, 0.197, 0.000)
		colorShelf     (0.316, 0.260, 0.225, 0.000)
		colorBeach     (0.371, 0.305, 0.267, 0.000)
		colorDesert    (0.403, 0.327, 0.260, 0.000)
		colorLowland   (0.442, 0.350, 0.295, 0.000)
		colorUpland    (0.490, 0.424, 0.358, 0.000)
		colorRock      (0.529, 0.461, 0.386, 0.000)
		colorSnow      (0.577, 0.491, 0.407, 1.000)
		BumpHeight      8.12084
		BumpOffset      1.62417
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.242135
		Period          2.89104
		Eccentricity    0.33027
		Inclination     65.3425
		AscendingNode   -96.3055
		ArgOfPericenter -174.937
		MeanAnomaly     91.1928
	}
}



DwarfMoon	"Kissarm.D71"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            4.82264e-010
	Radius          12.0982
	InertiaMoment   0.399938

	RotationPeriod  1395.38
	Obliquity       18.2267
	EqAscendNode    53.5575

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.552 0.547 0.545)

	Surface
	{
		SurfStyle       0.301542
		OceanStyle      0.719215
		Randomize      (0.397, 0.399, -0.789)
		colorDistMagn   0.211717
		colorDistFreq   0.0795873
		detailScale     330.361
		colorConversion true
		snowLevel       2
		tropicLatitude  0.461325
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.473785
		terraceProb     0.249044
		erosion         0
		montesMagn      0.651894
		montesFreq      3.64067
		montesSpiky     0.971366
		montesFraction  0.545792
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.405343
		hillsFraction   0.517162
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243397
		craterFreq      0.233721
		craterDensity   0.738818
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.524562
		volcanoTemp     1528
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.221, 0.219, 0.218, 0.000)
		colorShelf     (0.235, 0.232, 0.232, 0.000)
		colorBeach     (0.248, 0.246, 0.245, 0.000)
		colorDesert    (0.262, 0.260, 0.259, 0.000)
		colorLowland   (0.276, 0.273, 0.273, 0.000)
		colorUpland    (0.290, 0.287, 0.286, 0.000)
		colorRock      (0.304, 0.301, 0.300, 0.000)
		colorSnow      (0.317, 0.314, 0.313, 1.000)
		BumpHeight      10.8884
		BumpOffset      2.17767
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.242552
		Period          2.89853
		Eccentricity    0.450473
		Inclination     -36.6491
		AscendingNode   47.8957
		ArgOfPericenter 48.9277
		MeanAnomaly     -151.853
	}
}



DwarfMoon	"Kissarm.D72"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            7.10908e-010
	Radius          12.9422
	InertiaMoment   0.398032

	RotationPeriod  1232.2
	Obliquity       -119.471
	EqAscendNode    136.134

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.597 0.420 0.352)

	Surface
	{
		SurfStyle       0.773005
		OceanStyle      0.139285
		Randomize      (0.463, 0.993, 0.237)
		colorDistMagn   0.177091
		colorDistFreq   0.080876
		detailScale     353.409
		colorConversion true
		snowLevel       2
		tropicLatitude  0.795462
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.575082
		terraceProb     0.183017
		erosion         0
		montesMagn      0.610176
		montesFreq      4.22838
		montesSpiky     0.839677
		montesFraction  0.185679
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.302399
		hillsFraction   0.446061
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260413
		craterFreq      0.247551
		craterDensity   0.897633
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.533293
		volcanoTemp     1249.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.233, 0.143, 0.099, 0.000)
		colorShelf     (0.239, 0.147, 0.113, 0.000)
		colorBeach     (0.280, 0.172, 0.134, 0.000)
		colorDesert    (0.304, 0.185, 0.130, 0.000)
		colorLowland   (0.334, 0.197, 0.148, 0.000)
		colorUpland    (0.370, 0.239, 0.180, 0.000)
		colorRock      (0.400, 0.260, 0.194, 0.000)
		colorSnow      (0.436, 0.277, 0.204, 1.000)
		BumpHeight      11.648
		BumpOffset      2.3296
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.243143
		Period          2.90912
		Eccentricity    0.203128
		Inclination     -87.8209
		AscendingNode   135.896
		ArgOfPericenter 153.351
		MeanAnomaly     -153.189
	}
}



DwarfMoon	"Kissarm.D73"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            1.03077e-009
	Radius          14.0584
	InertiaMoment   0.399162

	RotationPeriod  1116.68
	Obliquity       -90.603
	EqAscendNode    111.819

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.790 0.754 0.696)

	Surface
	{
		SurfStyle       0.816692
		OceanStyle      0.0222272
		Randomize      (-0.233, 0.447, -0.869)
		colorDistMagn   0.308992
		colorDistFreq   0.0366223
		detailScale     383.889
		colorConversion true
		snowLevel       2
		tropicLatitude  0.983311
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.427865
		terraceProb     0.263797
		erosion         0
		montesMagn      0.456046
		montesFreq      1.98096
		montesSpiky     0.975413
		montesFraction  0.358297
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.605781
		hillsFraction   0.72158
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.212258
		craterFreq      0.166775
		craterDensity   0.856569
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.462052
		volcanoTemp     1847.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.308, 0.256, 0.195, 0.000)
		colorShelf     (0.316, 0.264, 0.223, 0.000)
		colorBeach     (0.371, 0.309, 0.264, 0.000)
		colorDesert    (0.403, 0.332, 0.258, 0.000)
		colorLowland   (0.442, 0.354, 0.292, 0.000)
		colorUpland    (0.490, 0.430, 0.355, 0.000)
		colorRock      (0.529, 0.468, 0.383, 0.000)
		colorSnow      (0.576, 0.498, 0.404, 1.000)
		BumpHeight      12.6526
		BumpOffset      2.53052
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.243761
		Period          2.92021
		Eccentricity    0.477063
		Inclination     -36.2317
		AscendingNode   108.795
		ArgOfPericenter 137.008
		MeanAnomaly     -164.175
	}
}



DwarfMoon	"Kissarm.D74"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            1.47414e-009
	Radius          15.138
	InertiaMoment   0.395517

	RotationPeriod  1004.16
	Obliquity       45.959
	EqAscendNode    49.493

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.737 0.735 0.730)

	Surface
	{
		SurfStyle       0.242888
		OceanStyle      0.747678
		Randomize      (-0.350, 0.556, -0.015)
		colorDistMagn   0.775828
		colorDistFreq   0.188537
		detailScale     413.367
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999961
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.572676
		terraceProb     0.361226
		erosion         0
		montesMagn      0.555228
		montesFreq      3.06463
		montesSpiky     0.952189
		montesFraction  0.792043
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.545913
		hillsFraction   0.694966
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261106
		craterFreq      0.207914
		craterDensity   0.890293
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.469567
		volcanoTemp     1269.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.295, 0.294, 0.292, 0.000)
		colorShelf     (0.313, 0.312, 0.310, 0.000)
		colorBeach     (0.332, 0.331, 0.328, 0.000)
		colorDesert    (0.350, 0.349, 0.347, 0.000)
		colorLowland   (0.369, 0.367, 0.365, 0.000)
		colorUpland    (0.387, 0.386, 0.383, 0.000)
		colorRock      (0.406, 0.404, 0.401, 0.000)
		colorSnow      (0.424, 0.423, 0.420, 1.000)
		BumpHeight      13.6242
		BumpOffset      2.72483
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.244237
		Period          2.92879
		Eccentricity    0.416143
		Inclination     54.6699
		AscendingNode   47.902
		ArgOfPericenter -178.857
		MeanAnomaly     -154.725
	}
}



DwarfMoon	"Kissarm.D75"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            2.08418e-009
	Radius          20.0149
	InertiaMoment   0.398225

	RotationPeriod  1115.98
	Obliquity       -83.0721
	EqAscendNode    -14.2704

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.536 0.533 0.528)

	Surface
	{
		SurfStyle       0.655524
		OceanStyle      0.847516
		Randomize      (0.090, -0.196, -0.805)
		colorDistMagn   0.701085
		colorDistFreq   0.164614
		detailScale     546.54
		colorConversion true
		snowLevel       2
		tropicLatitude  0.364236
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.725673
		terraceProb     0.138121
		erosion         0
		montesMagn      0.324913
		montesFreq      3.46329
		montesSpiky     0.94533
		montesFraction  0.607907
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.19708
		hillsFraction   0.518777
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230675
		craterFreq      0.271899
		craterDensity   0.917039
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.375064
		volcanoTemp     1486.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.209, 0.181, 0.148, 0.000)
		colorShelf     (0.215, 0.187, 0.169, 0.000)
		colorBeach     (0.252, 0.219, 0.201, 0.000)
		colorDesert    (0.274, 0.235, 0.196, 0.000)
		colorLowland   (0.300, 0.251, 0.222, 0.000)
		colorUpland    (0.333, 0.304, 0.269, 0.000)
		colorRock      (0.359, 0.331, 0.291, 0.000)
		colorSnow      (0.392, 0.352, 0.306, 1.000)
		BumpHeight      18.0134
		BumpOffset      3.60268
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.244664
		Period          2.93646
		Eccentricity    0.0804003
		Inclination     -86.4149
		AscendingNode   -18.6286
		ArgOfPericenter 11.8372
		MeanAnomaly     -166.977
	}
}



DwarfMoon	"Kissarm.D76"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            2.91856e-009
	Radius          20.8608
	InertiaMoment   0.399296

	RotationPeriod  987.968
	Obliquity       10.6391
	EqAscendNode    -13.6989

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.422 0.418 0.414)

	Surface
	{
		SurfStyle       0.804591
		OceanStyle      0.323275
		Randomize      (-0.134, -0.587, -0.369)
		colorDistMagn   0.346608
		colorDistFreq   0.376324
		detailScale     569.639
		colorConversion true
		snowLevel       2
		tropicLatitude  0.64471
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.498914
		terraceProb     0.365032
		erosion         0
		montesMagn      0.557725
		montesFreq      2.86732
		montesSpiky     0.875832
		montesFraction  0.148232
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.06936
		hillsFraction   0.639373
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249365
		craterFreq      0.239405
		craterDensity   0.883918
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.515315
		volcanoTemp     1518.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.165, 0.142, 0.116, 0.000)
		colorShelf     (0.169, 0.146, 0.133, 0.000)
		colorBeach     (0.199, 0.171, 0.157, 0.000)
		colorDesert    (0.215, 0.184, 0.153, 0.000)
		colorLowland   (0.237, 0.196, 0.174, 0.000)
		colorUpland    (0.262, 0.238, 0.211, 0.000)
		colorRock      (0.283, 0.259, 0.228, 0.000)
		colorSnow      (0.308, 0.276, 0.240, 1.000)
		BumpHeight      18.7747
		BumpOffset      3.75495
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.24529
		Period          2.94774
		Eccentricity    0.26342
		Inclination     29.8461
		AscendingNode   -16.6516
		ArgOfPericenter 174.774
		MeanAnomaly     -106.463
	}
}



DwarfMoon	"Kissarm.D77"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            4.05456e-009
	Radius          22.3171
	InertiaMoment   0.396437

	RotationPeriod  896.067
	Obliquity       3.17806
	EqAscendNode    -148.505

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.508 0.440 0.315)

	Surface
	{
		SurfStyle       0.806882
		OceanStyle      0.230859
		Randomize      (0.331, -0.510, -0.139)
		colorDistMagn   0.545134
		colorDistFreq   0.372171
		detailScale     609.405
		colorConversion true
		snowLevel       2
		tropicLatitude  0.467801
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.582726
		terraceProb     0.287464
		erosion         0
		montesMagn      0.425508
		montesFreq      2.75562
		montesSpiky     0.932227
		montesFraction  0.665287
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.47136
		hillsFraction   0.664893
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242559
		craterFreq      0.183262
		craterDensity   1.06376
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.457064
		volcanoTemp     1519.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.198, 0.149, 0.088, 0.000)
		colorShelf     (0.203, 0.154, 0.101, 0.000)
		colorBeach     (0.239, 0.180, 0.120, 0.000)
		colorDesert    (0.259, 0.193, 0.117, 0.000)
		colorLowland   (0.284, 0.207, 0.132, 0.000)
		colorUpland    (0.315, 0.251, 0.161, 0.000)
		colorRock      (0.340, 0.273, 0.173, 0.000)
		colorSnow      (0.371, 0.290, 0.183, 1.000)
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
		SemiMajorAxis   0.245609
		Period          2.95349
		Eccentricity    0.465969
		Inclination     -24.9941
		AscendingNode   -154.393
		ArgOfPericenter -177.495
		MeanAnomaly     -50.7846
	}
}



DwarfMoon	"Kissarm.D78"
{
	ParentBody     "Kissarm"
	Class	       "Asteroid"

	Mass            5.59583e-009
	Radius          23.7991
	InertiaMoment   0.398404

	RotationPeriod  817.408
	Obliquity       42.0124
	EqAscendNode    121.645

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.853 0.803 0.743)

	Surface
	{
		SurfStyle       0.515735
		OceanStyle      0.704927
		Randomize      (0.255, -0.006, -0.040)
		colorDistMagn   0.53672
		colorDistFreq   0.0105347
		detailScale     649.875
		colorConversion true
		snowLevel       2
		tropicLatitude  0.66261
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.460427
		terraceProb     0.523663
		erosion         0
		montesMagn      0.34945
		montesFreq      2.8099
		montesSpiky     0.983424
		montesFraction  0.469521
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.986688
		hillsFraction   0.749359
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243968
		craterFreq      0.22988
		craterDensity   0.973127
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.582772
		volcanoTemp     1380.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.333, 0.273, 0.208, 0.000)
		colorShelf     (0.341, 0.281, 0.238, 0.000)
		colorBeach     (0.401, 0.329, 0.282, 0.000)
		colorDesert    (0.435, 0.353, 0.275, 0.000)
		colorLowland   (0.478, 0.378, 0.312, 0.000)
		colorUpland    (0.529, 0.458, 0.379, 0.000)
		colorRock      (0.571, 0.498, 0.409, 0.000)
		colorSnow      (0.623, 0.530, 0.431, 1.000)
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
		SemiMajorAxis   0.245927
		Period          2.95922
		Eccentricity    0.0258819
		Inclination     0.990046
		AscendingNode   121.692
		ArgOfPericenter 14.2144
		MeanAnomaly     4.21673
	}
}



Planet	"Houll"
{
	ParentBody     "Beshqek"
	Class	       "IceWorld"

	Mass            8.76625
	Radius          13998.8
	InertiaMoment   0.330949

	Oblateness      0.0178799

	RotationPeriod  11.3733
	Obliquity       -184.555
	EqAscendNode    143.37

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.576 0.457 0.384)

	Surface
	{
		SurfStyle       0.629883
		OceanStyle      0.573422
		Randomize      (0.699, 0.682, -0.577)
		colorDistMagn   0.0751284
		colorDistFreq   1630.87
		detailScale     36005.7
		colorConversion true
		drivenDarkening 0
		seaLevel        0.204143
		snowLevel       2
		tropicLatitude  0.0923431
		icecapLatitude  0.727294
		icecapHeight    0.22859
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.92644
		venusFreq       0.811554
		venusMagn       0
		mareFreq        1.83427
		mareDensity     0.17547
		terraceProb     0.314148
		erosion         0
		montesMagn      0.217773
		montesFreq      759.807
		montesSpiky     0.925052
		montesFraction  0.826378
		dunesMagn       0.0404013
		dunesFreq       18460.1
		dunesFraction   0.214047
		hillsMagn       0.103259
		hillsFreq       1529.1
		hillsFraction   0.144749
		hills2Fraction  0.0672247
		riversMagn      68.6025
		riversFreq      3.0199
		riversSin       7.63138
		riversOctaves   0
		canyonsMagn     0.463969
		canyonsFreq     5.51917
		canyonFraction  0
		cracksMagn      0.069067
		cracksFreq      7.64759
		cracksOctaves   8
		craterMagn      0.703458
		craterFreq      34.8846
		craterDensity   0.762734
		craterOctaves   12.3639
		craterRayedFactor 0.139337
		volcanoMagn     0.638722
		volcanoFreq     0.488864
		volcanoDensity  0.33811
		volcanoOctaves  3
		volcanoActivity 1.08572
		volcanoFlows    0.367765
		volcanoRadius   0.501124
		volcanoTemp     1543.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.213, 0.139, 0.069, 1.000)
		colorShelf     (0.278, 0.190, 0.100, 1.000)
		colorBeach     (0.450, 0.248, 0.106, 0.200)
		colorDesert    (0.491, 0.277, 0.125, 0.200)
		colorLowland   (0.532, 0.292, 0.131, 0.200)
		colorUpland    (0.573, 0.350, 0.156, 0.200)
		colorRock      (0.920, 0.870, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.532, 0.292, 0.131, 0.200)
		colorUpPlants  (0.573, 0.350, 0.156, 0.200)
		BumpHeight      14.8259
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.906886
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          69.994
		Density         0.00931141
		Pressure        0.00224175
		Greenhouse      0.460987
		Bright          6.22018
		Opacity         1
		SkyLight        2.07339
		Hue             0
		Saturation      1

		Composition
		{
			N2    	94.9845
			CO    	4.14353
			Ar    	0.757209
			He    	0.0933052
			Ne    	0.0208275
			Kr    	0.000678436
		}
	}

	Aurora
	{
		Height      210.739
		NorthLat    85.122
		NorthLon    -161.212
		NorthRadius 3287.06
		NorthWidth  1257.23
		NorthRings  3
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -85.8253
		SouthLon    18.1333
		SouthRadius 4617.13
		SouthWidth  1406.86
		SouthRings  2
		SouthBright 0.3
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	Rings
	{
		InnerRadius     19706.4
		OuterRadius     31915.8
		RotationPeriod  3.88048
		RotationOffset  0
		FrontBright     0.746075
		BackBright      0.550492
		Density         0.976113
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   9.37425
		Period          29.2154
		Eccentricity    0.0283914
		Inclination     0.889648
		AscendingNode   143.734
		ArgOfPericenter 190.846
		MeanAnomaly     304.211
	}
}





Moon	"Houll.1"
{
	ParentBody     "Houll"
	Class	       "IceWorld"

	Mass            0.00135258
	Radius          971.713
	InertiaMoment   0.399017

	Obliquity       -0.584922
	EqAscendNode    -154.186
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.657 0.653 0.644)

	Surface
	{
		SurfStyle       0.570106
		OceanStyle      0.695414
		Randomize      (-0.387, -0.496, 0.944)
		colorDistMagn   0.0643564
		colorDistFreq   96.877
		detailScale     2499.3
		colorConversion true
		drivenDarkening 0
		seaLevel        0.169134
		snowLevel       2
		tropicLatitude  0.00455437
		icecapLatitude  0.480154
		icecapHeight    0.196583
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.07086
		venusFreq       0.676451
		venusMagn       0
		mareFreq        0.228372
		mareDensity     0.000526212
		terraceProb     0.434771
		erosion         0
		montesMagn      0.0647494
		montesFreq      38.0576
		montesSpiky     0.980058
		montesFraction  0.780853
		dunesMagn       0.0321028
		dunesFreq       1279.67
		dunesFraction   0.153352
		hillsMagn       0.138605
		hillsFreq       106.617
		hillsFraction   0.28704
		hills2Fraction  0.298958
		riversMagn      54.9336
		riversFreq      3.26639
		riversSin       4.57671
		riversOctaves   0
		canyonsMagn     0.299947
		canyonsFreq     0.358561
		canyonFraction  0
		cracksMagn      0.0395978
		cracksFreq      0.4096
		cracksOctaves   0
		craterMagn      0.633181
		craterFreq      3.19404
		craterDensity   0.91415
		craterOctaves   10
		craterRayedFactor 0
		volcanoMagn     0.170285
		volcanoFreq     0.927225
		volcanoDensity  0.258202
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.237811
		volcanoRadius   0.153733
		volcanoTemp     1405.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.197, 0.163, 0.142, 0.000)
		colorShelf     (0.243, 0.202, 0.180, 0.000)
		colorBeach     (0.368, 0.307, 0.271, 0.200)
		colorDesert    (0.335, 0.287, 0.238, 0.500)
		colorLowland   (0.256, 0.222, 0.180, 0.800)
		colorUpland    (0.434, 0.392, 0.335, 1.000)
		colorRock      (0.670, 0.620, 0.550, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.256, 0.222, 0.180, 0.800)
		colorUpPlants  (0.434, 0.392, 0.335, 1.000)
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
		SemiMajorAxis   0.00171708
		Period          0.0138971
		Eccentricity    0.00736492
		Inclination     -0.584922
		AscendingNode   -154.186
		ArgOfPericenter 61.0673
		MeanAnomaly     52.0933
	}
}



Moon	"Houll.2"
{
	ParentBody     "Houll"
	Class	       "IceWorld"

	Mass            0.0158676
	Radius          2056.34
	InertiaMoment   0.36701

	Obliquity       0.558289
	EqAscendNode    119.299
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.604 0.534 0.389)

	Surface
	{
		SurfStyle       0.74306
		OceanStyle      0.492623
		Randomize      (0.340, 0.487, 0.577)
		colorDistMagn   0.0697889
		colorDistFreq   258.554
		detailScale     5289.03
		colorConversion true
		drivenDarkening 0
		seaLevel        0.281634
		snowLevel       2
		tropicLatitude  0.00984453
		icecapLatitude  0.470633
		icecapHeight    0.304281
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.7809
		venusFreq       0.259125
		venusMagn       0
		mareFreq        1.23443
		mareDensity     0.00383414
		terraceProb     0.464695
		erosion         0
		montesMagn      0.122275
		montesFreq      89.9481
		montesSpiky     0.920698
		montesFraction  0.878816
		dunesMagn       0.0367744
		dunesFreq       2703.2
		dunesFraction   0.510087
		hillsMagn       0.13057
		hillsFreq       229.498
		hillsFraction   0.909763
		hills2Fraction  0.0427088
		riversMagn      61.711
		riversFreq      2.66328
		riversSin       5.57742
		riversOctaves   0
		canyonsMagn     0.528105
		canyonsFreq     0.619174
		canyonFraction  0
		cracksMagn      0.07348
		cracksFreq      0.771965
		cracksOctaves   2
		craterMagn      0.621593
		craterFreq      5.29447
		craterDensity   0.907899
		craterOctaves   11
		craterRayedFactor 0.170344
		volcanoMagn     0.310658
		volcanoFreq     0.750016
		volcanoDensity  0.207354
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.30745
		volcanoRadius   0.27604
		volcanoTemp     1445.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.387, 0.342, 0.261, 0.250)
		colorShelf     (0.423, 0.390, 0.296, 0.250)
		colorBeach     (0.345, 0.288, 0.226, 0.200)
		colorDesert    (0.320, 0.262, 0.198, 0.200)
		colorLowland   (0.236, 0.203, 0.163, 0.200)
		colorUpland    (0.447, 0.395, 0.296, 0.250)
		colorRock      (0.640, 0.630, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.236, 0.203, 0.163, 0.200)
		colorUpPlants  (0.447, 0.395, 0.296, 0.250)
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
		SemiMajorAxis   0.00293375
		Period          0.031011
		Eccentricity    0.0276042
		Inclination     0.558289
		AscendingNode   119.3
		ArgOfPericenter 29.599
		MeanAnomaly     13.202
	}
}



Moon	"Houll.3"
{
	ParentBody     "Houll"
	Class	       "IceWorld"

	Mass            0.00187132
	Radius          1081.85
	InertiaMoment   0.397738

	Obliquity       -0.217584
	EqAscendNode    -135.719
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.545 0.332 0.259)

	Surface
	{
		SurfStyle       0.766589
		OceanStyle      0.195327
		Randomize      (0.255, 0.457, -0.168)
		colorDistMagn   0.0620112
		colorDistFreq   120.721
		detailScale     2782.59
		colorConversion true
		drivenDarkening 0
		seaLevel        0.168949
		snowLevel       2
		tropicLatitude  0.002868
		icecapLatitude  0.7246
		icecapHeight    0.19081
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.02674
		venusFreq       0.807407
		venusMagn       0
		mareFreq        0.345735
		mareDensity     0.000562612
		terraceProb     0.431996
		erosion         0
		montesMagn      0.0778949
		montesFreq      36.9812
		montesSpiky     0.956596
		montesFraction  0.574352
		dunesMagn       0.0428459
		dunesFreq       1435.02
		dunesFraction   0.928124
		hillsMagn       0.131477
		hillsFreq       135.044
		hillsFraction   0.948925
		hills2Fraction  0.0953959
		riversMagn      53.192
		riversFreq      2.86806
		riversSin       5.34465
		riversOctaves   0
		canyonsMagn     0.575138
		canyonsFreq     0.395644
		canyonFraction  0
		cracksMagn      0.071758
		cracksFreq      0.250435
		cracksOctaves   0
		craterMagn      0.616844
		craterFreq      2.7037
		craterDensity   0.907264
		craterOctaves   10
		craterRayedFactor 0.207943
		volcanoMagn     0.173441
		volcanoFreq     0.7671
		volcanoDensity  0.245846
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.356025
		volcanoRadius   0.148371
		volcanoTemp     1616.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.349, 0.213, 0.174, 0.250)
		colorShelf     (0.381, 0.243, 0.197, 0.250)
		colorBeach     (0.310, 0.179, 0.150, 0.200)
		colorDesert    (0.289, 0.163, 0.132, 0.200)
		colorLowland   (0.212, 0.126, 0.109, 0.200)
		colorUpland    (0.403, 0.246, 0.197, 0.250)
		colorRock      (0.640, 0.630, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.212, 0.126, 0.109, 0.200)
		colorUpPlants  (0.403, 0.246, 0.197, 0.250)
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
		SemiMajorAxis   0.00501254
		Period          0.0693127
		Eccentricity    0.0303182
		Inclination     -0.217584
		AscendingNode   -135.719
		ArgOfPericenter 37.5456
		MeanAnomaly     84.9747
	}
}



Moon	"Houll.4"
{
	ParentBody     "Houll"
	Class	       "IceWorld"

	Mass            0.0022214
	Radius          1077.53
	InertiaMoment   0.396445

	Obliquity       0.0525545
	EqAscendNode    -28.1067
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.723 0.660 0.630)

	Surface
	{
		SurfStyle       0.847251
		OceanStyle      0.137219
		Randomize      (0.311, 0.924, 0.780)
		colorDistMagn   0.0822975
		colorDistFreq   136.625
		detailScale     2771.47
		colorConversion true
		drivenDarkening 0
		seaLevel        0.193939
		snowLevel       2
		tropicLatitude  0.00179406
		icecapLatitude  0.550077
		icecapHeight    0.208349
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.80345
		venusFreq       0.91733
		venusMagn       0.226331
		mareFreq        0.277116
		mareDensity     0.000750368
		terraceProb     0.320223
		erosion         0
		montesMagn      0.0610049
		montesFreq      44.1378
		montesSpiky     0.876648
		montesFraction  0.4337
		dunesMagn       0.0423824
		dunesFreq       1425.69
		dunesFraction   0.38575
		hillsMagn       0.131674
		hillsFreq       119.168
		hillsFraction   0.145691
		hills2Fraction  0.13897
		riversMagn      51.5416
		riversFreq      2.58893
		riversSin       6.88102
		riversOctaves   0
		canyonsMagn     0.533099
		canyonsFreq     0.341606
		canyonFraction  0
		cracksMagn      0.0492586
		cracksFreq      0.546972
		cracksOctaves   0
		craterMagn      0.628033
		craterFreq      3.68266
		craterDensity   0.887583
		craterOctaves   10
		craterRayedFactor 0.216856
		volcanoMagn     0.174234
		volcanoFreq     0.550968
		volcanoDensity  0.24498
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.166898
		volcanoRadius   0.156904
		volcanoTemp     1798.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.723, 0.495, 0.362, 0.000)
		colorShelf     (0.687, 0.470, 0.343, 0.000)
		colorBeach     (0.362, 0.247, 0.181, 0.000)
		colorDesert    (0.615, 0.421, 0.307, 0.000)
		colorLowland   (0.586, 0.435, 0.343, 0.000)
		colorUpland    (0.673, 0.460, 0.336, 0.000)
		colorRock      (1.000, 1.000, 1.000, 0.500)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.586, 0.435, 0.343, 0.000)
		colorUpPlants  (0.673, 0.460, 0.336, 0.000)
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
		SemiMajorAxis   0.00856429
		Period          0.154794
		Eccentricity    0.0407702
		Inclination     0.0525545
		AscendingNode   -28.1067
		ArgOfPericenter -10.7663
		MeanAnomaly     -118.641
	}
}



Moon	"Houll.5"
{
	ParentBody     "Houll"
	Class	       "IceWorld"

	Mass            0.00265845
	Radius          1214.91
	InertiaMoment   0.399731

	Obliquity       1.28392
	EqAscendNode    3.11636
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.853 0.779 0.736)

	Surface
	{
		SurfStyle       0.926956
		OceanStyle      0.711564
		Randomize      (-0.575, -0.083, -0.779)
		colorDistMagn   0.0466495
		colorDistFreq   133.793
		detailScale     3124.82
		colorConversion true
		drivenDarkening 0
		seaLevel        0.248902
		snowLevel       2
		tropicLatitude  0.0447857
		icecapLatitude  0.635042
		icecapHeight    0.274739
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.80817
		venusFreq       1.65565
		venusMagn       0.232103
		mareFreq        0.370746
		mareDensity     0.000786481
		terraceProb     0.334024
		erosion         0
		montesMagn      0.0459981
		montesFreq      38.8797
		montesSpiky     0.958478
		montesFraction  0.0904817
		dunesMagn       0.0468948
		dunesFreq       1610.58
		dunesFraction   0.237229
		hillsMagn       0.129306
		hillsFreq       118.865
		hillsFraction   0.62892
		hills2Fraction  0.0173919
		riversMagn      61.2255
		riversFreq      3.07764
		riversSin       5.94515
		riversOctaves   0
		canyonsMagn     0.633296
		canyonsFreq     0.593591
		canyonFraction  0
		cracksMagn      0.0266643
		cracksFreq      0.604069
		cracksOctaves   0
		craterMagn      0.589891
		craterFreq      3.19534
		craterDensity   0.836717
		craterOctaves   10
		craterRayedFactor 0.0988329
		volcanoMagn     0.187882
		volcanoFreq     0.756443
		volcanoDensity  0.255125
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.387792
		volcanoRadius   0.168335
		volcanoTemp     1276.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.648, 0.553, 0.427, 1.000)
		colorShelf     (0.648, 0.553, 0.427, 1.000)
		colorBeach     (0.597, 0.483, 0.368, 1.000)
		colorDesert    (0.597, 0.483, 0.368, 1.000)
		colorLowland   (0.725, 0.631, 0.560, 1.000)
		colorUpland    (0.759, 0.693, 0.633, 1.000)
		colorRock      (0.930, 0.910, 0.860, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.725, 0.631, 0.560, 1.000)
		colorUpPlants  (0.759, 0.693, 0.633, 1.000)
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
		SemiMajorAxis   0.0146327
		Period          0.345697
		Eccentricity    0.0176443
		Inclination     1.28392
		AscendingNode   3.11636
		ArgOfPericenter 25.9255
		MeanAnomaly     104.112
	}
}



DwarfMoon	"Houll.D1"
{
	ParentBody     "Houll"
	Class	       "Asteroid"

	Mass            1.11393e-006
	Radius          144.31
	InertiaMoment   0.399127

	RotationPeriod  356.54
	Obliquity       -50.7576
	EqAscendNode    130.817

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.784 0.708 0.656)

	Surface
	{
		SurfStyle       0.745465
		OceanStyle      0.183697
		Randomize      (0.102, -0.893, -0.691)
		colorDistMagn   0.697858
		colorDistFreq   5.60533
		detailScale     3940.63
		colorConversion true
		snowLevel       2
		tropicLatitude  0.729326
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.375746
		terraceProb     0.332754
		erosion         0
		montesMagn      0.594032
		montesFreq      3.32543
		montesSpiky     0.969662
		montesFraction  0.599359
		dunesFraction   0
		hillsMagn       0
		hillsFreq       41.7994
		hillsFraction   0.668256
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.208764
		craterFreq      0.841349
		craterDensity   0.816687
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.486582
		volcanoTemp     1723.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.306, 0.241, 0.184, 0.000)
		colorShelf     (0.314, 0.248, 0.210, 0.000)
		colorBeach     (0.369, 0.290, 0.249, 0.000)
		colorDesert    (0.400, 0.312, 0.243, 0.000)
		colorLowland   (0.439, 0.333, 0.276, 0.000)
		colorUpland    (0.486, 0.404, 0.335, 0.000)
		colorRock      (0.525, 0.439, 0.361, 0.000)
		colorSnow      (0.572, 0.467, 0.381, 1.000)
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
		SemiMajorAxis   0.0961541
		Period          5.82404
		Eccentricity    0.136542
		Inclination     -73.7814
		AscendingNode   133.032
		ArgOfPericenter -30.9997
		MeanAnomaly     137.722
	}
}



DwarfMoon	"Houll.D2"
{
	ParentBody     "Houll"
	Class	       "Asteroid"

	Mass            1.62464e-006
	Radius          156.432
	InertiaMoment   0.394997

	RotationPeriod  318.822
	Obliquity       25.5161
	EqAscendNode    85.5354

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.515 0.512 0.505)

	Surface
	{
		SurfStyle       0.125416
		OceanStyle      0.244407
		Randomize      (0.369, -0.443, -0.684)
		colorDistMagn   0.435039
		colorDistFreq   12.9312
		detailScale     4271.65
		colorConversion true
		snowLevel       2
		tropicLatitude  0.633112
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.378
		terraceProb     0.336751
		erosion         0
		montesMagn      0.351208
		montesFreq      2.54192
		montesSpiky     0.968615
		montesFraction  0.439336
		dunesFraction   0
		hillsMagn       0
		hillsFreq       61.4271
		hillsFraction   0.547547
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220448
		craterFreq      0.841379
		craterDensity   0.666474
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.523676
		volcanoTemp     1424.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.206, 0.205, 0.202, 0.000)
		colorShelf     (0.219, 0.217, 0.215, 0.000)
		colorBeach     (0.232, 0.230, 0.227, 0.000)
		colorDesert    (0.245, 0.243, 0.240, 0.000)
		colorLowland   (0.258, 0.256, 0.252, 0.000)
		colorUpland    (0.271, 0.269, 0.265, 0.000)
		colorRock      (0.283, 0.281, 0.278, 0.000)
		colorSnow      (0.296, 0.294, 0.290, 1.000)
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
		SemiMajorAxis   0.0964495
		Period          5.8509
		Eccentricity    0.379834
		Inclination     28.412
		AscendingNode   84.4841
		ArgOfPericenter 59.2629
		MeanAnomaly     -150.741
	}
}



DwarfMoon	"Houll.D3"
{
	ParentBody     "Houll"
	Class	       "Asteroid"

	Mass            1.80548e-011
	Radius          3.51807
	InertiaMoment   0.39836

	RotationPeriod  2028.33
	Obliquity       30.6639
	EqAscendNode    158.518

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.425 0.422 0.419)

	Surface
	{
		SurfStyle       0.482599
		OceanStyle      0.604425
		Randomize      (0.565, 0.255, -0.241)
		colorDistMagn   0.210966
		colorDistFreq   0.00191166
		detailScale     96.0666
		colorConversion true
		snowLevel       2
		tropicLatitude  0.246899
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.618242
		terraceProb     0.116138
		erosion         0
		montesMagn      0.613139
		montesFreq      3.67718
		montesSpiky     0.872751
		montesFraction  0.34127
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0271735
		hillsFraction   0.687667
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240437
		craterFreq      0.211486
		craterDensity   0.882063
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.57017
		volcanoTemp     1380.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.170, 0.169, 0.167, 0.000)
		colorShelf     (0.181, 0.179, 0.178, 0.000)
		colorBeach     (0.191, 0.190, 0.188, 0.000)
		colorDesert    (0.202, 0.201, 0.199, 0.000)
		colorLowland   (0.213, 0.211, 0.209, 0.000)
		colorUpland    (0.223, 0.222, 0.220, 0.000)
		colorRock      (0.234, 0.232, 0.230, 0.000)
		colorSnow      (0.244, 0.243, 0.241, 1.000)
		BumpHeight      3.16626
		BumpOffset      0.633252
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0981082
		Period          6.00248
		Eccentricity    0.10057
		Inclination     17.7964
		AscendingNode   164.258
		ArgOfPericenter 178.206
		MeanAnomaly     38.9472
	}
}



DwarfMoon	"Houll.D4"
{
	ParentBody     "Houll"
	Class	       "Asteroid"

	Mass            3.48729e-011
	Radius          5.23725
	InertiaMoment   0.399395

	RotationPeriod  2165.47
	Obliquity       6.7462
	EqAscendNode    120.871

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.503 0.500 0.495)

	Surface
	{
		SurfStyle       0.506761
		OceanStyle      0.240064
		Randomize      (-0.009, -0.925, 0.296)
		colorDistMagn   0.96465
		colorDistFreq   0.0145117
		detailScale     143.012
		colorConversion true
		snowLevel       2
		tropicLatitude  0.410227
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.325775
		terraceProb     0.154532
		erosion         0
		montesMagn      0.403595
		montesFreq      2.95808
		montesSpiky     0.993793
		montesFraction  0.417101
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0783335
		hillsFraction   0.563036
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.207413
		craterFreq      0.224338
		craterDensity   0.938057
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.5182
		volcanoTemp     1304.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.196, 0.170, 0.139, 0.000)
		colorShelf     (0.201, 0.175, 0.158, 0.000)
		colorBeach     (0.237, 0.205, 0.188, 0.000)
		colorDesert    (0.257, 0.220, 0.183, 0.000)
		colorLowland   (0.282, 0.235, 0.208, 0.000)
		colorUpland    (0.312, 0.285, 0.252, 0.000)
		colorRock      (0.337, 0.310, 0.272, 0.000)
		colorSnow      (0.367, 0.330, 0.287, 1.000)
		BumpHeight      4.71352
		BumpOffset      0.942705
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0987528
		Period          6.06174
		Eccentricity    0.162803
		Inclination     -19.8699
		AscendingNode   123.387
		ArgOfPericenter 88.1199
		MeanAnomaly     57.1793
	}
}



DwarfMoon	"Houll.D5"
{
	ParentBody     "Houll"
	Class	       "Asteroid"

	Mass            6.2257e-011
	Radius          5.82839
	InertiaMoment   0.396822

	RotationPeriod  1821.69
	Obliquity       58.4378
	EqAscendNode    0.600518

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.465 0.462 0.459)

	Surface
	{
		SurfStyle       0.578795
		OceanStyle      0.359837
		Randomize      (0.436, -0.008, 0.001)
		colorDistMagn   0.700732
		colorDistFreq   0.0235449
		detailScale     159.154
		colorConversion true
		snowLevel       2
		tropicLatitude  0.901489
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.53723
		terraceProb     0.198341
		erosion         0
		montesMagn      0.386283
		montesFreq      3.11423
		montesSpiky     0.899223
		montesFraction  0.362278
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0698145
		hillsFraction   0.589007
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.194215
		craterFreq      0.266019
		craterDensity   1.07214
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.539427
		volcanoTemp     1901.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.181, 0.157, 0.129, 0.000)
		colorShelf     (0.186, 0.162, 0.147, 0.000)
		colorBeach     (0.218, 0.190, 0.174, 0.000)
		colorDesert    (0.237, 0.203, 0.170, 0.000)
		colorLowland   (0.260, 0.217, 0.193, 0.000)
		colorUpland    (0.288, 0.264, 0.234, 0.000)
		colorRock      (0.311, 0.287, 0.252, 0.000)
		colorSnow      (0.339, 0.305, 0.266, 1.000)
		BumpHeight      5.24555
		BumpOffset      1.04911
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0990253
		Period          6.08684
		Eccentricity    0.360102
		Inclination     57.3692
		AscendingNode   4.82337
		ArgOfPericenter 127.505
		MeanAnomaly     -21.5642
	}
}



DwarfMoon	"Houll.D6"
{
	ParentBody     "Houll"
	Class	       "Asteroid"

	Mass            1.04975e-010
	Radius          6.64126
	InertiaMoment   0.398529

	RotationPeriod  1615.04
	Obliquity       61.6298
	EqAscendNode    -33.467

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.514 0.508 0.500)

	Surface
	{
		SurfStyle       0.912694
		OceanStyle      0.743893
		Randomize      (-0.530, -0.142, -0.914)
		colorDistMagn   0.684656
		colorDistFreq   0.0217914
		detailScale     181.351
		colorConversion true
		snowLevel       2
		tropicLatitude  0.704585
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.488759
		terraceProb     0.207207
		erosion         0
		montesMagn      0.563955
		montesFreq      4.04424
		montesSpiky     0.882402
		montesFraction  0.682633
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.102958
		hillsFraction   0.505932
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239396
		craterFreq      0.201387
		craterDensity   0.796915
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.571096
		volcanoTemp     1141.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.175, 0.178, 0.200, 0.050)
		colorShelf     (0.206, 0.208, 0.230, 0.040)
		colorBeach     (0.237, 0.239, 0.260, 0.030)
		colorDesert    (0.267, 0.269, 0.295, 0.020)
		colorLowland   (0.298, 0.300, 0.325, 0.030)
		colorUpland    (0.329, 0.330, 0.355, 0.050)
		colorRock      (0.360, 0.361, 0.395, 0.020)
		colorSnow      (0.360, 0.361, 0.395, 1.000)
		BumpHeight      5.97713
		BumpOffset      1.19543
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0996125
		Period          6.14106
		Eccentricity    0.110292
		Inclination     86.2458
		AscendingNode   -32.4724
		ArgOfPericenter 30.8379
		MeanAnomaly     126.526
	}
}



DwarfMoon	"Houll.D7"
{
	ParentBody     "Houll"
	Class	       "Asteroid"

	Mass            1.69514e-010
	Radius          7.47411
	InertiaMoment   0.399524

	RotationPeriod  1441.61
	Obliquity       67.48
	EqAscendNode    -95.5119

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.550 0.541 0.538)

	Surface
	{
		SurfStyle       0.399626
		OceanStyle      0.393704
		Randomize      (0.531, 0.627, 0.296)
		colorDistMagn   0.5868
		colorDistFreq   0.0182301
		detailScale     204.093
		colorConversion true
		snowLevel       2
		tropicLatitude  0.979823
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.373527
		terraceProb     0.45398
		erosion         0
		montesMagn      0.634172
		montesFreq      3.00292
		montesSpiky     0.802742
		montesFraction  0.427415
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.179805
		hillsFraction   0.668092
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241637
		craterFreq      0.276852
		craterDensity   0.800561
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.562026
		volcanoTemp     1235.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.220, 0.216, 0.215, 0.000)
		colorShelf     (0.234, 0.230, 0.228, 0.000)
		colorBeach     (0.248, 0.243, 0.242, 0.000)
		colorDesert    (0.261, 0.257, 0.255, 0.000)
		colorLowland   (0.275, 0.270, 0.269, 0.000)
		colorUpland    (0.289, 0.284, 0.282, 0.000)
		colorRock      (0.303, 0.297, 0.296, 0.000)
		colorSnow      (0.316, 0.311, 0.309, 1.000)
		BumpHeight      6.7267
		BumpOffset      1.34534
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.100017
		Period          6.17848
		Eccentricity    0.26409
		Inclination     78.2852
		AscendingNode   -97.7582
		ArgOfPericenter 80.8811
		MeanAnomaly     -107.855
	}
}



DwarfMoon	"Houll.D8"
{
	ParentBody     "Houll"
	Class	       "Asteroid"

	Mass            2.64647e-010
	Radius          10.6936
	InertiaMoment   0.397202

	RotationPeriod  1634.64
	Obliquity       146.038
	EqAscendNode    -155.96

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.772 0.770 0.767)

	Surface
	{
		SurfStyle       0.450267
		OceanStyle      0.725324
		Randomize      (0.942, -0.791, 0.097)
		colorDistMagn   0.787335
		colorDistFreq   0.0422315
		detailScale     292.006
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997036
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.486924
		terraceProb     0.115371
		erosion         0
		montesMagn      0.47535
		montesFreq      2.7314
		montesSpiky     0.99818
		montesFraction  0.530268
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.228624
		hillsFraction   0.898793
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261768
		craterFreq      0.272267
		craterDensity   0.755501
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.469289
		volcanoTemp     1644.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.309, 0.308, 0.307, 0.000)
		colorShelf     (0.328, 0.327, 0.326, 0.000)
		colorBeach     (0.348, 0.346, 0.345, 0.000)
		colorDesert    (0.367, 0.366, 0.364, 0.000)
		colorLowland   (0.386, 0.385, 0.384, 0.000)
		colorUpland    (0.405, 0.404, 0.403, 0.000)
		colorRock      (0.425, 0.423, 0.422, 0.000)
		colorSnow      (0.444, 0.443, 0.441, 1.000)
		BumpHeight      9.62421
		BumpOffset      1.92484
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.100239
		Period          6.1991
		Eccentricity    0.457643
		Inclination     63.9413
		AscendingNode   -151.559
		ArgOfPericenter -66.2427
		MeanAnomaly     -86.7325
	}
}



DwarfMoon	"Houll.D9"
{
	ParentBody     "Houll"
	Class	       "Asteroid"

	Mass            4.02181e-010
	Radius          10.9374
	InertiaMoment   0.398688

	RotationPeriod  1372.15
	Obliquity       39.0001
	EqAscendNode    67.6678

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.767 0.724 0.691)

	Surface
	{
		SurfStyle       0.2433
		OceanStyle      0.44756
		Randomize      (0.420, -0.409, -0.508)
		colorDistMagn   0.905217
		colorDistFreq   0.0907885
		detailScale     298.663
		colorConversion true
		snowLevel       2
		tropicLatitude  0.976911
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.368348
		terraceProb     0.177144
		erosion         0
		montesMagn      0.388655
		montesFreq      3.87752
		montesSpiky     0.795895
		montesFraction  0.585136
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.293052
		hillsFraction   0.634421
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.267311
		craterFreq      0.221441
		craterDensity   0.768668
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.420735
		volcanoTemp     1161.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.307, 0.289, 0.277, 0.000)
		colorShelf     (0.326, 0.308, 0.294, 0.000)
		colorBeach     (0.345, 0.326, 0.311, 0.000)
		colorDesert    (0.364, 0.344, 0.328, 0.000)
		colorLowland   (0.384, 0.362, 0.346, 0.000)
		colorUpland    (0.403, 0.380, 0.363, 0.000)
		colorRock      (0.422, 0.398, 0.380, 0.000)
		colorSnow      (0.441, 0.416, 0.398, 1.000)
		BumpHeight      9.84363
		BumpOffset      1.96873
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.10067
		Period          6.23915
		Eccentricity    0.246319
		Inclination     61.7038
		AscendingNode   73.7844
		ArgOfPericenter 166.53
		MeanAnomaly     -131.964
	}
}



DwarfMoon	"Houll.D10"
{
	ParentBody     "Houll"
	Class	       "Asteroid"

	Mass            5.97952e-010
	Radius          11.928
	InertiaMoment   0.399652

	RotationPeriod  1235.18
	Obliquity       40.2392
	EqAscendNode    88.2399

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.578 0.504 0.400)

	Surface
	{
		SurfStyle       0.404556
		OceanStyle      0.201303
		Randomize      (-0.589, -0.644, -0.094)
		colorDistMagn   0.377133
		colorDistFreq   0.0708091
		detailScale     325.713
		colorConversion true
		snowLevel       2
		tropicLatitude  0.644929
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.661683
		terraceProb     0.214519
		erosion         0
		montesMagn      0.35271
		montesFreq      2.04553
		montesSpiky     0.999399
		montesFraction  0.387486
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.274282
		hillsFraction   0.525264
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.279015
		craterFreq      0.249392
		craterDensity   0.877386
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.587171
		volcanoTemp     1614.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.231, 0.202, 0.160, 0.000)
		colorShelf     (0.246, 0.214, 0.170, 0.000)
		colorBeach     (0.260, 0.227, 0.180, 0.000)
		colorDesert    (0.275, 0.239, 0.190, 0.000)
		colorLowland   (0.289, 0.252, 0.200, 0.000)
		colorUpland    (0.304, 0.265, 0.210, 0.000)
		colorRock      (0.318, 0.277, 0.220, 0.000)
		colorSnow      (0.332, 0.290, 0.230, 1.000)
		BumpHeight      10.7352
		BumpOffset      2.14704
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.101269
		Period          6.29484
		Eccentricity    0.0197435
		Inclination     9.42348
		AscendingNode   96.0731
		ArgOfPericenter 67.2792
		MeanAnomaly     160.152
	}
}





Planet	"Pelutt"
{
	ParentBody     "Beshqek"
	Class	       "IceWorld"

	Mass            0.0779094
	Radius          3443.87
	InertiaMoment   0.331706

	Oblateness      0.0044051

	RotationPeriod  29.6986
	Obliquity       -88.4934
	EqAscendNode    -182.033

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.873 0.830 0.800)

	Surface
	{
		SurfStyle       0.0604822
		OceanStyle      0.447925
		Randomize      (-0.628, 0.472, -0.153)
		colorDistMagn   0.0407661
		colorDistFreq   404.28
		detailScale     8857.83
		colorConversion true
		drivenDarkening 0
		seaLevel        0.218142
		snowLevel       2
		tropicLatitude  0.999961
		icecapLatitude  1
		icecapHeight    0.218142
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.90821
		venusFreq       2
		venusMagn       0
		mareFreq        2.03652
		mareDensity     0.0137461
		terraceProb     0.134017
		erosion         0
		montesMagn      0.176368
		montesFreq      117.256
		montesSpiky     0.980154
		montesFraction  0.257615
		dunesMagn       0.0454234
		dunesFreq       4601.03
		dunesFraction   0.0923799
		hillsMagn       0.142042
		hillsFreq       451.578
		hillsFraction   0.976971
		hills2Fraction  0.0694011
		riversMagn      54.5237
		riversFreq      3.36319
		riversSin       6.78003
		riversOctaves   0
		canyonsMagn     0.403485
		canyonsFreq     1.22949
		canyonFraction  0
		cracksMagn      0.0319414
		cracksFreq      1.00491
		cracksOctaves   3
		craterMagn      0.679001
		craterFreq      12.0167
		craterDensity   0.880582
		craterOctaves   12
		craterRayedFactor 0.0667236
		volcanoMagn     0.533319
		volcanoFreq     0.722492
		volcanoDensity  0.160575
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.348196
		volcanoRadius   0.452563
		volcanoTemp     1197.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.763, 0.758, 0.756, 0.500)
		colorShelf     (0.725, 0.720, 0.718, 0.500)
		colorBeach     (0.534, 0.531, 0.529, 0.750)
		colorDesert    (0.649, 0.644, 0.643, 1.000)
		colorLowland   (0.672, 0.667, 0.665, 1.000)
		colorUpland    (0.710, 0.705, 0.703, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.672, 0.667, 0.665, 1.000)
		colorUpPlants  (0.710, 0.705, 0.703, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.990523
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
		Height          222.696
		Density         0.0013688
		Pressure        0.000240199
		Greenhouse      0.0283446
		Bright          3.93853
		Opacity         0
		SkyLight        1.31284
		Hue             -0.0176483
		Saturation      1

		Composition
		{
			O2    	99.9993
			Ar    	0.000539007
			Kr    	9.87116e-005
			N2    	2.08219e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   13.3943
		Period          49.8992
		Eccentricity    0.04106
		Inclination     2.01335
		AscendingNode   -179.777
		ArgOfPericenter 154.882
		MeanAnomaly     197.471
	}
}




DwarfMoon	"Pelutt.D1"
{
	ParentBody     "Pelutt"
	Class	       "Asteroid"

	Mass            5.44112e-009
	Radius          23.3927
	InertiaMoment   0.399372

	Oblateness      0.249

	Obliquity       -3.03331e-005
	EqAscendNode    45.1317
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.712 0.644 0.569)

	Surface
	{
		SurfStyle       0.426576
		OceanStyle      0.545016
		Randomize      (0.512, 0.867, 0.801)
		colorDistMagn   0.555328
		colorDistFreq   0.286633
		detailScale     638.776
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.391595
		terraceProb     0.186845
		erosion         0
		montesMagn      0.372828
		montesFreq      2.82626
		montesSpiky     0.838326
		montesFraction  0.686943
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.985963
		hillsFraction   0.685713
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242127
		craterFreq      0.209509
		craterDensity   1.04847
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.474101
		volcanoTemp     1563.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.285, 0.258, 0.227, 0.000)
		colorShelf     (0.302, 0.274, 0.242, 0.000)
		colorBeach     (0.320, 0.290, 0.256, 0.000)
		colorDesert    (0.338, 0.306, 0.270, 0.000)
		colorLowland   (0.356, 0.322, 0.284, 0.000)
		colorUpland    (0.374, 0.338, 0.299, 0.000)
		colorRock      (0.391, 0.354, 0.313, 0.000)
		colorSnow      (0.409, 0.371, 0.327, 1.000)
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
		SemiMajorAxis   4.97711e-005
		Period          0.00072753
		Eccentricity    7.31908e-005
		Inclination     -3.03331e-005
		AscendingNode   45.1317
		ArgOfPericenter 128.249
		MeanAnomaly     -149.953
	}
}

DwarfMoon	"Pelutt.D2"
{
	ParentBody     "Pelutt"
	Class	       "Asteroid"

	Mass            7.18069e-006
	Radius          175.039
	InertiaMoment   0.398285

	Oblateness      0.004785

	Obliquity       1.18743
	EqAscendNode    138.246
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.692 0.691 0.688)

	Surface
	{
		SurfStyle       0.689854
		OceanStyle      0.41503
		Randomize      (0.422, -0.559, -0.223)
		colorDistMagn   0.102599
		colorDistFreq   24.8635
		detailScale     4779.72
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0147696
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.638606
		terraceProb     0.108047
		erosion         0
		montesMagn      0.393416
		montesFreq      2.16832
		montesSpiky     0.935493
		montesFraction  0.717591
		dunesFraction   0
		hillsMagn       0
		hillsFreq       87.5989
		hillsFraction   0.776052
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.277122
		craterFreq      0.976169
		craterDensity   0.82583
		craterOctaves   16
		volcanoActivity 0.00458443
		volcanoFlows    0
		volcanoRadius   0.49097
		volcanoTemp     1421.33
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.270, 0.235, 0.193, 0.000)
		colorShelf     (0.277, 0.242, 0.220, 0.000)
		colorBeach     (0.325, 0.283, 0.261, 0.000)
		colorDesert    (0.353, 0.304, 0.255, 0.000)
		colorLowland   (0.388, 0.325, 0.289, 0.000)
		colorUpland    (0.429, 0.394, 0.351, 0.000)
		colorRock      (0.464, 0.428, 0.378, 0.000)
		colorSnow      (0.505, 0.456, 0.399, 1.000)
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
		SemiMajorAxis   8.47406e-005
		Eccentricity    0.00851329
		Inclination     1.18743
		AscendingNode   138.246
		ArgOfPericenter 74.8987
		MeanAnomaly     -151.148
	}
}


Comet	"Beshqek C1"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            3.41094e-014
	Radius          0.447473
	InertiaMoment   0.398549

	Oblateness      0.00213114

	RotationPeriod  108.211
	Obliquity       16.6216
	EqAscendNode    107.592

	AbsMagn         7.52496
	SlopeParam      6.62587
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.699 0.694 0.692)

	Surface
	{
		SurfStyle       0.710979
		OceanStyle      0.265711
		Randomize      (-0.324, 0.270, -0.705)
		colorDistMagn   0.428689
		colorDistFreq   0.000123217
		detailScale     12.219
		colorConversion true
		snowLevel       2
		tropicLatitude  0.763121
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.378891
		terraceProb     0.203797
		erosion         0
		montesMagn      0.462597
		montesFreq      3.88121
		montesSpiky     0.897891
		montesFraction  0.754868
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000511217
		hillsFraction   0.393662
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253463
		craterFreq      0.239137
		craterDensity   0.882448
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.427522
		volcanoTemp     1416.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.273, 0.236, 0.194, 0.000)
		colorShelf     (0.280, 0.243, 0.222, 0.000)
		colorBeach     (0.329, 0.285, 0.263, 0.000)
		colorDesert    (0.357, 0.305, 0.256, 0.000)
		colorLowland   (0.392, 0.326, 0.291, 0.000)
		colorUpland    (0.434, 0.396, 0.353, 0.000)
		colorRock      (0.469, 0.430, 0.381, 0.000)
		colorSnow      (0.511, 0.458, 0.402, 1.000)
		BumpHeight      0.402726
		BumpOffset      0.0805452
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.199693
		GasToDust   0.25
		Particles   1383
		GasBright   0.370825
		DustBright  0.379792
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   25.2371
		Period          129.054
		Eccentricity    0.96971
		Inclination     -118.254
		AscendingNode   -139.87
		ArgOfPericenter 143.229
		MeanAnomaly     -24.4331
	}
}

Comet	"Beshqek C2"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            2.63811e-010
	Radius          9.76429
	InertiaMoment   0.396106

	Oblateness      0.00320071

	RotationPeriod  101.875
	Obliquity       329.827
	EqAscendNode    92.1691

	AbsMagn         3.19823
	SlopeParam      2.13957
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.749 0.745 0.741)

	Surface
	{
		SurfStyle       0.366426
		OceanStyle      0.128252
		Randomize      (0.685, 0.547, 0.845)
		colorDistMagn   0.400388
		colorDistFreq   0.0315724
		detailScale     266.63
		colorConversion true
		snowLevel       2
		tropicLatitude  0.203587
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.389922
		terraceProb     0.222104
		erosion         0
		montesMagn      0.454496
		montesFreq      3.66804
		montesSpiky     0.763751
		montesFraction  0.739691
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.317097
		hillsFraction   0.569056
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.209385
		craterFreq      0.205258
		craterDensity   0.87908
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.496738
		volcanoTemp     1185.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.300, 0.298, 0.297, 0.000)
		colorShelf     (0.318, 0.317, 0.315, 0.000)
		colorBeach     (0.337, 0.335, 0.334, 0.000)
		colorDesert    (0.356, 0.354, 0.352, 0.000)
		colorLowland   (0.374, 0.373, 0.371, 0.000)
		colorUpland    (0.393, 0.391, 0.389, 0.000)
		colorRock      (0.412, 0.410, 0.408, 0.000)
		colorSnow      (0.431, 0.428, 0.426, 1.000)
		BumpHeight      8.78786
		BumpOffset      1.75757
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.680885
		GasToDust   0.25
		Particles   2355
		GasBright   0.023092
		DustBright  0.412011
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   40.5413
		Period          262.76
		Eccentricity    0.987701
		Inclination     155.856
		AscendingNode   157.673
		ArgOfPericenter 19.2447
		MeanAnomaly     -118.83
	}
}

Comet	"Beshqek C3"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            8.12296e-018
	Radius          0.0277171
	InertiaMoment   0.399051

	Oblateness      0.00265884

	RotationPeriod  96.8712
	Obliquity       283.033
	EqAscendNode    76.7466

	AbsMagn         10.9511
	SlopeParam      2.88274
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.673 0.592 0.556)

	Surface
	{
		SurfStyle       0.89381
		OceanStyle      0.122801
		Randomize      (0.441, 0.798, -0.805)
		colorDistMagn   0.357936
		colorDistFreq   2.76999e-007
		detailScale     0.756862
		colorConversion true
		snowLevel       2
		tropicLatitude  0.909896
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.444027
		terraceProb     0.129554
		erosion         0
		montesMagn      0.306646
		montesFreq      3.29934
		montesSpiky     0.903253
		montesFraction  0.824926
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.61978e-006
		hillsFraction   0.699602
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254227
		craterFreq      0.2181
		craterDensity   0.871546
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.571622
		volcanoTemp     1719.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.229, 0.207, 0.222, 0.050)
		colorShelf     (0.269, 0.243, 0.256, 0.040)
		colorBeach     (0.309, 0.278, 0.289, 0.030)
		colorDesert    (0.350, 0.314, 0.328, 0.020)
		colorLowland   (0.390, 0.350, 0.361, 0.030)
		colorUpland    (0.430, 0.385, 0.395, 0.050)
		colorRock      (0.471, 0.421, 0.439, 0.020)
		colorSnow      (0.471, 0.421, 0.439, 1.000)
		BumpHeight      0.0249454
		BumpOffset      0.00498908
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.103102
		DustBright  0.816488
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   42.2557
		Period          279.602
		Eccentricity    0.981711
		Inclination     -167.661
		AscendingNode   20.8679
		ArgOfPericenter -127.329
		MeanAnomaly     172.652
	}
}

Comet	"Beshqek C4"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            6.28252e-014
	Radius          0.604433
	InertiaMoment   0.397539

	Oblateness      0.00387399

	RotationPeriod  92.6659
	Obliquity       236.239
	EqAscendNode    61.324

	AbsMagn         7.3141
	SlopeParam      3.49477
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.477 0.473 0.467)

	Surface
	{
		SurfStyle       0.910321
		OceanStyle      0.655582
		Randomize      (-0.888, 0.322, 0.195)
		colorDistMagn   0.729164
		colorDistFreq   0.000230308
		detailScale     16.505
		colorConversion true
		snowLevel       2
		tropicLatitude  0.863759
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.320288
		terraceProb     0.310752
		erosion         0
		montesMagn      0.428311
		montesFreq      3.65792
		montesSpiky     0.872772
		montesFraction  0.148902
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000532669
		hillsFraction   0.619886
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248021
		craterFreq      0.250192
		craterDensity   0.849202
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.554481
		volcanoTemp     1915.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.162, 0.166, 0.187, 0.050)
		colorShelf     (0.191, 0.194, 0.215, 0.040)
		colorBeach     (0.220, 0.222, 0.243, 0.030)
		colorDesert    (0.248, 0.251, 0.276, 0.020)
		colorLowland   (0.277, 0.279, 0.304, 0.030)
		colorUpland    (0.306, 0.307, 0.332, 0.050)
		colorRock      (0.334, 0.336, 0.369, 0.020)
		colorSnow      (0.334, 0.336, 0.369, 1.000)
		BumpHeight      0.543989
		BumpOffset      0.108798
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.232519
		GasToDust   0.25
		Particles   1449
		GasBright   0.103396
		DustBright  0.500681
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   33.0061
		Period          193.021
		Eccentricity    0.963051
		Inclination     -173.149
		AscendingNode   -61.1446
		ArgOfPericenter 77.6535
		MeanAnomaly     25.388
	}
}

Comet	"Beshqek C5"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            4.85908e-010
	Radius          10.8325
	InertiaMoment   0.399499

	Oblateness      0.00314905

	RotationPeriod  88.9951
	Obliquity       189.444
	EqAscendNode    45.9014

	AbsMagn         2.7381
	SlopeParam      4.06197
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.552 0.544 0.540)

	Surface
	{
		SurfStyle       0.284992
		OceanStyle      0.757508
		Randomize      (0.722, -0.331, 0.246)
		colorDistMagn   0.550026
		colorDistFreq   0.0764898
		detailScale     295.799
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997796
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.677916
		terraceProb     0.144189
		erosion         0
		montesMagn      0.538348
		montesFreq      3.29383
		montesSpiky     0.942863
		montesFraction  0.578804
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.341296
		hillsFraction   0.63559
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23504
		craterFreq      0.243533
		craterDensity   0.861013
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.518128
		volcanoTemp     1563.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.221, 0.218, 0.216, 0.000)
		colorShelf     (0.235, 0.231, 0.229, 0.000)
		colorBeach     (0.249, 0.245, 0.243, 0.000)
		colorDesert    (0.262, 0.259, 0.256, 0.000)
		colorLowland   (0.276, 0.272, 0.270, 0.000)
		colorUpland    (0.290, 0.286, 0.283, 0.000)
		colorRock      (0.304, 0.299, 0.297, 0.000)
		colorSnow      (0.318, 0.313, 0.310, 1.000)
		BumpHeight      9.74925
		BumpOffset      1.94985
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.713711
		GasToDust   0.25
		Particles   2421
		GasBright   0.0664296
		DustBright  0.222134
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   19.124
		Period          85.1294
		Eccentricity    0.97032
		Inclination     91.2533
		AscendingNode   74.1603
		ArgOfPericenter -122.135
		MeanAnomaly     -59.2461
	}
}

Comet	"Beshqek C6"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            1.49615e-017
	Radius          0.0374167
	InertiaMoment   0.398265

	Oblateness      0.00452332

	RotationPeriod  85.7073
	Obliquity       142.65
	EqAscendNode    30.4788

	AbsMagn         10.6837
	SlopeParam      4.63431
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.675 0.670 0.666)

	Surface
	{
		SurfStyle       0.0572205
		OceanStyle      0.237987
		Randomize      (0.783, -0.870, -0.694)
		colorDistMagn   0.675533
		colorDistFreq   9.96482e-007
		detailScale     1.02173
		colorConversion true
		snowLevel       2
		tropicLatitude  0.387736
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.577824
		terraceProb     0.442039
		erosion         0
		montesMagn      0.612763
		montesFreq      2.928
		montesSpiky     0.878827
		montesFraction  0.712201
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.70167e-006
		hillsFraction   0.92869
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.292684
		craterFreq      0.151688
		craterDensity   0.784596
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.468937
		volcanoTemp     1423.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.270, 0.268, 0.266, 0.000)
		colorShelf     (0.287, 0.285, 0.283, 0.000)
		colorBeach     (0.304, 0.301, 0.300, 0.000)
		colorDesert    (0.321, 0.318, 0.316, 0.000)
		colorLowland   (0.338, 0.335, 0.333, 0.000)
		colorUpland    (0.355, 0.352, 0.350, 0.000)
		colorRock      (0.371, 0.368, 0.366, 0.000)
		colorSnow      (0.388, 0.385, 0.383, 1.000)
		BumpHeight      0.033675
		BumpOffset      0.00673501
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.223607
		DustBright  0.549442
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   24.5591
		Period          123.888
		Eccentricity    0.96515
		Inclination     22.8508
		AscendingNode   36.5698
		ArgOfPericenter 105.694
		MeanAnomaly     139.246
	}
}

Comet	"Beshqek C7"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            1.15716e-013
	Radius          0.670978
	InertiaMoment   0.399922

	Oblateness      0.00364429

	RotationPeriod  82.7072
	Obliquity       95.8558
	EqAscendNode    15.0562

	AbsMagn         7.10131
	SlopeParam      5.26527
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.790 0.787 0.786)

	Surface
	{
		SurfStyle       0.836665
		OceanStyle      0.763441
		Randomize      (0.747, -0.999, -0.755)
		colorDistMagn   0.61003
		colorDistFreq   0.00011406
		detailScale     18.3222
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999978
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.67423
		terraceProb     0.233718
		erosion         0
		montesMagn      0.556261
		montesFreq      3.55196
		montesSpiky     0.82031
		montesFraction  0.532336
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000959304
		hillsFraction   0.59561
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.290417
		craterFreq      0.242545
		craterDensity   0.872917
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.498934
		volcanoTemp     1394.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.308, 0.268, 0.220, 0.000)
		colorShelf     (0.316, 0.276, 0.252, 0.000)
		colorBeach     (0.371, 0.323, 0.299, 0.000)
		colorDesert    (0.403, 0.346, 0.291, 0.000)
		colorLowland   (0.442, 0.370, 0.330, 0.000)
		colorUpland    (0.490, 0.449, 0.401, 0.000)
		colorRock      (0.529, 0.488, 0.432, 0.000)
		colorSnow      (0.576, 0.520, 0.456, 1.000)
		BumpHeight      0.60388
		BumpOffset      0.120776
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.265345
		GasToDust   0.25
		Particles   1515
		GasBright   0.159359
		DustBright  0.298177
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   17.8232
		Period          76.5935
		Eccentricity    0.924326
		Inclination     63.6732
		AscendingNode   -92.4787
		ArgOfPericenter 18.022
		MeanAnomaly     49.4178
	}
}

Comet	"Beshqek C8"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            8.94981e-010
	Radius          14.6148
	InertiaMoment   0.398812

	Oblateness      0.0051916

	RotationPeriod  79.9307
	Obliquity       49.0615
	EqAscendNode    359.634

	AbsMagn         2.19534
	SlopeParam      6.06081
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.611 0.560 0.509)

	Surface
	{
		SurfStyle       0.484112
		OceanStyle      0.988305
		Randomize      (0.858, -0.891, -0.352)
		colorDistMagn   0.493162
		colorDistFreq   0.0827605
		detailScale     399.082
		colorConversion true
		snowLevel       2
		tropicLatitude  0.76298
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.26041
		terraceProb     0.205343
		erosion         0
		montesMagn      0.436307
		montesFreq      4.02609
		montesSpiky     0.868938
		montesFraction  0.20499
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.679561
		hillsFraction   0.489665
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235542
		craterFreq      0.235808
		craterDensity   1.05718
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.43647
		volcanoTemp     1928.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.244, 0.224, 0.204, 0.000)
		colorShelf     (0.259, 0.238, 0.216, 0.000)
		colorBeach     (0.275, 0.252, 0.229, 0.000)
		colorDesert    (0.290, 0.266, 0.242, 0.000)
		colorLowland   (0.305, 0.280, 0.255, 0.000)
		colorUpland    (0.321, 0.294, 0.267, 0.000)
		colorRock      (0.336, 0.308, 0.280, 0.000)
		colorSnow      (0.351, 0.322, 0.293, 1.000)
		BumpHeight      13.1533
		BumpOffset      2.63067
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.746537
		GasToDust   0.25
		Particles   2487
		GasBright   0.383727
		DustBright  0.558295
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   35.7843
		Period          217.897
		Eccentricity    0.980371
		Inclination     85.418
		AscendingNode   -21.8781
		ArgOfPericenter -90.7615
		MeanAnomaly     0.763389
	}
}

Comet	"Beshqek C9"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            2.75572e-017
	Radius          0.0415611
	InertiaMoment   0.397019

	Oblateness      0.00411476

	RotationPeriod  77.3323
	Obliquity       2.26718
	EqAscendNode    344.211

	AbsMagn         10.4278
	SlopeParam      7.51695
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.446 0.442 0.440)

	Surface
	{
		SurfStyle       0.977558
		OceanStyle      0.662084
		Randomize      (-0.386, 0.072, 0.673)
		colorDistMagn   0.230599
		colorDistFreq   1.34417e-006
		detailScale     1.13489
		colorConversion true
		snowLevel       2
		tropicLatitude  0.530842
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.661602
		terraceProb     0.473903
		erosion         0
		montesMagn      0.53604
		montesFreq      2.56347
		montesSpiky     0.89733
		montesFraction  0.542349
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.20046e-006
		hillsFraction   0.569505
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.210971
		craterFreq      0.165817
		craterDensity   0.934892
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.470551
		volcanoTemp     1557.53
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.152, 0.155, 0.176, 0.050)
		colorShelf     (0.179, 0.181, 0.202, 0.040)
		colorBeach     (0.205, 0.208, 0.229, 0.030)
		colorDesert    (0.232, 0.234, 0.260, 0.020)
		colorLowland   (0.259, 0.261, 0.286, 0.030)
		colorUpland    (0.286, 0.287, 0.312, 0.050)
		colorRock      (0.312, 0.314, 0.348, 0.020)
		colorSnow      (0.312, 0.314, 0.348, 1.000)
		BumpHeight      0.037405
		BumpOffset      0.00748099
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.292197
		DustBright  0.334312
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   36.6685
		Period          226.023
		Eccentricity    0.976431
		Inclination     -34.316
		AscendingNode   -6.07334
		ArgOfPericenter 12.1006
		MeanAnomaly     -161.329
	}
}

Comet	"Beshqek C10"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            2.13135e-013
	Radius          0.904756
	InertiaMoment   0.399282

	Oblateness      0.0059041

	RotationPeriod  74.8783
	Obliquity       315.473
	EqAscendNode    328.788

	AbsMagn         6.88594
	SlopeParam      2.5315
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.565 0.563 0.559)

	Surface
	{
		SurfStyle       0.878507
		OceanStyle      0.125315
		Randomize      (0.333, -0.409, 0.054)
		colorDistMagn   0.47804
		colorDistFreq   0.000677807
		detailScale     24.7059
		colorConversion true
		snowLevel       2
		tropicLatitude  0.73244
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.440704
		terraceProb     0.2249
		erosion         0
		montesMagn      0.46643
		montesFreq      2.22867
		montesSpiky     0.839328
		montesFraction  0.686141
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00140966
		hillsFraction   0.784079
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213362
		craterFreq      0.195887
		craterDensity   0.879624
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.442782
		volcanoTemp     1292.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.192, 0.197, 0.224, 0.050)
		colorShelf     (0.226, 0.231, 0.257, 0.040)
		colorBeach     (0.260, 0.265, 0.291, 0.030)
		colorDesert    (0.294, 0.298, 0.330, 0.020)
		colorLowland   (0.328, 0.332, 0.364, 0.030)
		colorUpland    (0.362, 0.366, 0.397, 0.050)
		colorRock      (0.396, 0.400, 0.442, 0.020)
		colorSnow      (0.396, 0.400, 0.442, 1.000)
		BumpHeight      0.81428
		BumpOffset      0.162856
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.298171
		GasToDust   0.25
		Particles   1582
		GasBright   0.00791004
		DustBright  0.303086
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   25.0343
		Period          127.501
		Eccentricity    0.961665
		Inclination     -68.8823
		AscendingNode   -130.401
		ArgOfPericenter -32.9281
		MeanAnomaly     69.5732
	}
}

Comet	"Beshqek C11"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            1.64844e-009
	Radius          16.2429
	InertiaMoment   0.39794

	Oblateness      0.00468234

	RotationPeriod  72.5434
	Obliquity       268.679
	EqAscendNode    313.366

	AbsMagn         1.51786
	SlopeParam      3.19401
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.450 0.446 0.438)

	Surface
	{
		SurfStyle       0.210577
		OceanStyle      0.252616
		Randomize      (0.296, -0.034, -0.512)
		colorDistMagn   0.902597
		colorDistFreq   0.0462125
		detailScale     443.54
		colorConversion true
		snowLevel       2
		tropicLatitude  0.780604
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.291765
		terraceProb     0.183055
		erosion         0
		montesMagn      0.615022
		montesFreq      2.57917
		montesSpiky     0.934425
		montesFraction  0.304414
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.303538
		hillsFraction   0.720682
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240483
		craterFreq      0.246804
		craterDensity   0.689422
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.568438
		volcanoTemp     1396.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.180, 0.178, 0.175, 0.000)
		colorShelf     (0.191, 0.189, 0.186, 0.000)
		colorBeach     (0.202, 0.201, 0.197, 0.000)
		colorDesert    (0.214, 0.212, 0.208, 0.000)
		colorLowland   (0.225, 0.223, 0.219, 0.000)
		colorUpland    (0.236, 0.234, 0.230, 0.000)
		colorRock      (0.247, 0.245, 0.241, 0.000)
		colorSnow      (0.259, 0.256, 0.252, 1.000)
		BumpHeight      14.6186
		BumpOffset      2.92372
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.779363
		GasToDust   0.25
		Particles   2554
		GasBright   0.0672022
		DustBright  0.72828
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   32.9264
		Period          192.322
		Eccentricity    0.978551
		Inclination     133.1
		AscendingNode   -33.4206
		ArgOfPericenter -9.23767
		MeanAnomaly     74.4132
	}
}

Comet	"Beshqek C12"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            5.07568e-017
	Radius          0.0560116
	InertiaMoment   0.399715

	Oblateness      0.00668297

	RotationPeriod  70.3075
	Obliquity       221.884
	EqAscendNode    297.943

	AbsMagn         10.1815
	SlopeParam      3.77671
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.417 0.414 0.411)

	Surface
	{
		SurfStyle       0.107415
		OceanStyle      0.942809
		Randomize      (-0.169, 0.393, 0.405)
		colorDistMagn   0.994747
		colorDistFreq   1.94413e-006
		detailScale     1.52949
		colorConversion true
		snowLevel       2
		tropicLatitude  0.786283
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.738824
		terraceProb     0.674931
		erosion         0
		montesMagn      0.443106
		montesFreq      2.59392
		montesSpiky     0.951133
		montesFraction  0.435684
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.27881e-006
		hillsFraction   0.72486
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259854
		craterFreq      0.186602
		craterDensity   0.910597
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.540066
		volcanoTemp     1472.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.167, 0.166, 0.165, 0.000)
		colorShelf     (0.177, 0.176, 0.175, 0.000)
		colorBeach     (0.188, 0.186, 0.185, 0.000)
		colorDesert    (0.198, 0.197, 0.195, 0.000)
		colorLowland   (0.209, 0.207, 0.206, 0.000)
		colorUpland    (0.219, 0.217, 0.216, 0.000)
		colorRock      (0.229, 0.228, 0.226, 0.000)
		colorSnow      (0.240, 0.238, 0.237, 1.000)
		BumpHeight      0.0504105
		BumpOffset      0.0100821
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.0688876
		DustBright  0.411082
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   37.6078
		Period          234.763
		Eccentricity    0.976463
		Inclination     91.5955
		AscendingNode   -163.114
		ArgOfPericenter -75.9052
		MeanAnomaly     -101.437
	}
}

Comet	"Beshqek C13"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            3.92568e-013
	Radius          1.0061
	InertiaMoment   0.398555

	Oblateness      0.00530593

	RotationPeriod  68.1545
	Obliquity       175.09
	EqAscendNode    282.521

	AbsMagn         6.66729
	SlopeParam      4.34068
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.495 0.487 0.481)

	Surface
	{
		SurfStyle       0.217193
		OceanStyle      0.854683
		Randomize      (-0.416, -0.353, -0.474)
		colorDistMagn   0.434227
		colorDistFreq   0.000469423
		detailScale     27.4732
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0416125
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.352362
		terraceProb     0.322671
		erosion         0
		montesMagn      0.300013
		montesFreq      2.78789
		montesSpiky     0.94866
		montesFraction  0.755531
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00151815
		hillsFraction   0.831792
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.215872
		craterFreq      0.26893
		craterDensity   0.777852
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.546598
		volcanoTemp     1311.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.198, 0.195, 0.192, 0.000)
		colorShelf     (0.210, 0.207, 0.204, 0.000)
		colorBeach     (0.223, 0.219, 0.216, 0.000)
		colorDesert    (0.235, 0.232, 0.228, 0.000)
		colorLowland   (0.247, 0.244, 0.240, 0.000)
		colorUpland    (0.260, 0.256, 0.252, 0.000)
		colorRock      (0.272, 0.268, 0.264, 0.000)
		colorSnow      (0.285, 0.280, 0.276, 1.000)
		BumpHeight      0.905488
		BumpOffset      0.181098
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.330997
		GasToDust   0.25
		Particles   1648
		GasBright   0.19537
		DustBright  0.769086
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   35.2258
		Period          212.815
		Eccentricity    0.967799
		Inclination     172.792
		AscendingNode   -173.825
		ArgOfPericenter -9.17695
		MeanAnomaly     -23.6954
	}
}

Comet	"Beshqek C14"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            3.03623e-009
	Radius          21.8793
	InertiaMoment   0.39614

	Oblateness      0.00743967

	RotationPeriod  66.0713
	Obliquity       128.296
	EqAscendNode    267.098

	AbsMagn         0.577318
	SlopeParam      4.93375
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.565 0.469 0.416)

	Surface
	{
		SurfStyle       0.853975
		OceanStyle      0.569268
		Randomize      (0.052, 0.334, 0.777)
		colorDistMagn   0.815609
		colorDistFreq   0.148617
		detailScale     597.452
		colorConversion true
		snowLevel       2
		tropicLatitude  0.911123
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.32113
		terraceProb     0.16645
		erosion         0
		montesMagn      0.452237
		montesFreq      1.49344
		montesSpiky     0.903384
		montesFraction  0.568624
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.709022
		hillsFraction   0.643306
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238322
		craterFreq      0.279596
		craterDensity   0.954973
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50216
		volcanoTemp     1160.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.192, 0.164, 0.166, 0.050)
		colorShelf     (0.226, 0.192, 0.191, 0.040)
		colorBeach     (0.260, 0.221, 0.216, 0.030)
		colorDesert    (0.294, 0.249, 0.245, 0.020)
		colorLowland   (0.328, 0.277, 0.270, 0.030)
		colorUpland    (0.362, 0.305, 0.295, 0.050)
		colorRock      (0.396, 0.333, 0.328, 0.020)
		colorSnow      (0.396, 0.333, 0.328, 1.000)
		BumpHeight      19.6914
		BumpOffset      3.93828
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.812189
		GasToDust   0.25
		Particles   2620
		GasBright   0.169773
		DustBright  0.479169
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   32.6541
		Period          189.941
		Eccentricity    0.98055
		Inclination     156.156
		AscendingNode   -60.8191
		ArgOfPericenter -12.9734
		MeanAnomaly     78.0143
	}
}

Comet	"Beshqek C15"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            9.34878e-017
	Radius          0.0623183
	InertiaMoment   0.399057

	Oblateness      0.00600696

	RotationPeriod  64.047
	Obliquity       81.5014
	EqAscendNode    251.675

	AbsMagn         9.94315
	SlopeParam      5.62524
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.677 0.674 0.670)

	Surface
	{
		SurfStyle       0.0517562
		OceanStyle      0.71233
		Randomize      (0.392, -0.192, 0.769)
		colorDistMagn   0.713367
		colorDistFreq   3.03593e-006
		detailScale     1.70171
		colorConversion true
		snowLevel       2
		tropicLatitude  0.573903
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.756567
		terraceProb     0.114093
		erosion         0
		montesMagn      0.51166
		montesFreq      2.61981
		montesSpiky     0.865301
		montesFraction  0.505589
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.62403e-006
		hillsFraction   0.698505
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224675
		craterFreq      0.22147
		craterDensity   1.02246
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.479164
		volcanoTemp     1426.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.271, 0.269, 0.268, 0.000)
		colorShelf     (0.288, 0.286, 0.285, 0.000)
		colorBeach     (0.305, 0.303, 0.301, 0.000)
		colorDesert    (0.322, 0.320, 0.318, 0.000)
		colorLowland   (0.339, 0.337, 0.335, 0.000)
		colorUpland    (0.355, 0.354, 0.352, 0.000)
		colorRock      (0.372, 0.370, 0.368, 0.000)
		colorSnow      (0.389, 0.387, 0.385, 1.000)
		BumpHeight      0.0560865
		BumpOffset      0.0112173
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.106918
		DustBright  0.226511
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   36.3394
		Period          222.987
		Eccentricity    0.974966
		Inclination     116.518
		AscendingNode   -179.333
		ArgOfPericenter -167.793
		MeanAnomaly     -61.8406
	}
}

Comet	"Beshqek C16"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            7.23061e-013
	Radius          1.35456
	InertiaMoment   0.39755

	Oblateness      0.00844374

	RotationPeriod  62.0722
	Obliquity       34.7071
	EqAscendNode    236.253

	AbsMagn         6.44458
	SlopeParam      6.60771
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.551 0.547 0.539)

	Surface
	{
		SurfStyle       0.571981
		OceanStyle      0.5085
		Randomize      (-0.750, 0.331, 0.511)
		colorDistMagn   0.930586
		colorDistFreq   0.00120182
		detailScale     36.9886
		colorConversion true
		snowLevel       2
		tropicLatitude  0.992827
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.609535
		terraceProb     0.168799
		erosion         0
		montesMagn      0.538602
		montesFreq      3.57634
		montesSpiky     0.883549
		montesFraction  0.662948
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00354443
		hillsFraction   0.521492
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224001
		craterFreq      0.176288
		craterDensity   0.841655
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.470511
		volcanoTemp     1542.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.215, 0.186, 0.151, 0.000)
		colorShelf     (0.220, 0.191, 0.173, 0.000)
		colorBeach     (0.259, 0.224, 0.205, 0.000)
		colorDesert    (0.281, 0.241, 0.199, 0.000)
		colorLowland   (0.309, 0.257, 0.226, 0.000)
		colorUpland    (0.342, 0.312, 0.275, 0.000)
		colorRock      (0.369, 0.339, 0.297, 0.000)
		colorSnow      (0.402, 0.361, 0.313, 1.000)
		BumpHeight      1.21911
		BumpOffset      0.243821
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.363823
		GasToDust   0.25
		Particles   1714
		GasBright   0.310567
		DustBright  0.507348
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   27.1012
		Period          143.613
		Eccentricity    0.971309
		Inclination     -63.1609
		AscendingNode   -164.99
		ArgOfPericenter -177.391
		MeanAnomaly     152.246
	}
}

Comet	"Beshqek C17"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            5.59235e-009
	Radius          24.3551
	InertiaMoment   0.399504

	Oblateness      0.00681008

	RotationPeriod  60.1389
	Obliquity       347.913
	EqAscendNode    220.83

	AbsMagn         -1.16951
	SlopeParam      2.12764
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.586 0.584 0.580)

	Surface
	{
		SurfStyle       0.107478
		OceanStyle      0.60948
		Randomize      (-0.863, 0.577, -0.408)
		colorDistMagn   0.629016
		colorDistFreq   0.395606
		detailScale     665.056
		colorConversion true
		snowLevel       2
		tropicLatitude  0.467
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.386393
		terraceProb     0.359701
		erosion         0
		montesMagn      0.250023
		montesFreq      3.83206
		montesSpiky     0.901861
		montesFraction  0.812009
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.74139
		hillsFraction   0.541594
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.208768
		craterFreq      0.242175
		craterDensity   0.628056
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.531856
		volcanoTemp     1427.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.234, 0.233, 0.232, 0.000)
		colorShelf     (0.249, 0.248, 0.247, 0.000)
		colorBeach     (0.264, 0.263, 0.261, 0.000)
		colorDesert    (0.278, 0.277, 0.276, 0.000)
		colorLowland   (0.293, 0.292, 0.290, 0.000)
		colorUpland    (0.308, 0.306, 0.305, 0.000)
		colorRock      (0.322, 0.321, 0.319, 0.000)
		colorSnow      (0.337, 0.336, 0.334, 1.000)
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
		MaxLength   0.845015
		GasToDust   0.25
		Particles   2686
		GasBright   0.22043
		DustBright  0.281972
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   30.1869
		Period          168.826
		Eccentricity    0.972867
		Inclination     -22.7527
		AscendingNode   77.5343
		ArgOfPericenter 97.3976
		MeanAnomaly     -139.165
	}
}

Comet	"Beshqek C18"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            1.72193e-016
	Radius          0.0838633
	InertiaMoment   0.398272

	Oblateness      0.00958385

	RotationPeriod  58.24
	Obliquity       301.118
	EqAscendNode    205.408

	AbsMagn         9.71154
	SlopeParam      2.87371
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.513 0.509 0.500)

	Surface
	{
		SurfStyle       0.42199
		OceanStyle      0.0267849
		Randomize      (-0.373, 0.851, 0.219)
		colorDistMagn   0.315984
		colorDistFreq   3.87292e-006
		detailScale     2.29003
		colorConversion true
		snowLevel       2
		tropicLatitude  0.839857
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.423767
		terraceProb     0.330876
		erosion         0
		montesMagn      0.595608
		montesFreq      3.69668
		montesSpiky     0.93634
		montesFraction  0.864572
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.83402e-005
		hillsFraction   0.667243
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.271247
		craterFreq      0.189123
		craterDensity   0.992638
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.430254
		volcanoTemp     1516.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.205, 0.203, 0.200, 0.000)
		colorShelf     (0.218, 0.216, 0.213, 0.000)
		colorBeach     (0.231, 0.229, 0.225, 0.000)
		colorDesert    (0.244, 0.242, 0.238, 0.000)
		colorLowland   (0.257, 0.254, 0.250, 0.000)
		colorUpland    (0.269, 0.267, 0.263, 0.000)
		colorRock      (0.282, 0.280, 0.275, 0.000)
		colorSnow      (0.295, 0.292, 0.288, 1.000)
		BumpHeight      0.075477
		BumpOffset      0.0150954
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.49127
		DustBright  0.495619
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   32.4507
		Period          188.169
		Eccentricity    0.975145
		Inclination     116.002
		AscendingNode   0.743079
		ArgOfPericenter -1.69238
		MeanAnomaly     68.752
	}
}

Comet	"Beshqek C19"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            1.33178e-012
	Radius          1.50856
	InertiaMoment   0.399928

	Oblateness      0.00774726

	RotationPeriod  56.3692
	Obliquity       254.324
	EqAscendNode    189.985

	AbsMagn         6.21694
	SlopeParam      3.4868
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.450 0.446 0.444)

	Surface
	{
		SurfStyle       0.0173156
		OceanStyle      0.506198
		Randomize      (0.882, -0.060, -0.200)
		colorDistMagn   0.610002
		colorDistFreq   0.00117665
		detailScale     41.1937
		colorConversion true
		snowLevel       2
		tropicLatitude  0.853968
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.411069
		terraceProb     0.23478
		erosion         0
		montesMagn      0.477006
		montesFreq      3.60207
		montesSpiky     0.943137
		montesFraction  0.679361
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00525109
		hillsFraction   0.616831
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240233
		craterFreq      0.17781
		craterDensity   0.924092
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.515271
		volcanoTemp     1319.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.180, 0.179, 0.178, 0.000)
		colorShelf     (0.191, 0.190, 0.189, 0.000)
		colorBeach     (0.202, 0.201, 0.200, 0.000)
		colorDesert    (0.214, 0.212, 0.211, 0.000)
		colorLowland   (0.225, 0.223, 0.222, 0.000)
		colorUpland    (0.236, 0.234, 0.233, 0.000)
		colorRock      (0.247, 0.246, 0.244, 0.000)
		colorSnow      (0.259, 0.257, 0.255, 1.000)
		BumpHeight      1.3577
		BumpOffset      0.271541
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.396649
		GasToDust   0.25
		Particles   1781
		GasBright   0.0381622
		DustBright  0.633213
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   28.1729
		Period          152.216
		Eccentricity    0.986058
		Inclination     -132.009
		AscendingNode   -11.4568
		ArgOfPericenter -106.605
		MeanAnomaly     -62.3779
	}
}

Comet	"Beshqek C20"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            1.03004e-008
	Radius          32.7606
	InertiaMoment   0.398818

	Oblateness      0.0109207

	RotationPeriod  54.5207
	Obliquity       207.53
	EqAscendNode    174.563

	AbsMagn         16.4403
	SlopeParam      4.05425
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.631 0.562 0.513)

	Surface
	{
		SurfStyle       0.89274
		OceanStyle      0.472596
		Randomize      (-0.340, -0.752, -0.507)
		colorDistMagn   0.440991
		colorDistFreq   0.339231
		detailScale     894.584
		colorConversion true
		snowLevel       2
		tropicLatitude  0.15478
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.635651
		terraceProb     0.217713
		erosion         0
		montesMagn      0.390809
		montesFreq      3.92281
		montesSpiky     0.846946
		montesFraction  0.835841
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.48216
		hillsFraction   0.550911
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246629
		craterFreq      0.234088
		craterDensity   0.769467
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.488094
		volcanoTemp     1232.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.215, 0.197, 0.205, 0.050)
		colorShelf     (0.252, 0.230, 0.236, 0.040)
		colorBeach     (0.290, 0.264, 0.267, 0.030)
		colorDesert    (0.328, 0.298, 0.303, 0.020)
		colorLowland   (0.366, 0.331, 0.334, 0.030)
		colorUpland    (0.404, 0.365, 0.365, 0.050)
		colorRock      (0.442, 0.399, 0.406, 0.020)
		colorSnow      (0.442, 0.399, 0.406, 1.000)
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
		MaxLength   0.877841
		GasToDust   0.25
		Particles   2753
		GasBright   0.0412398
		DustBright  0.314622
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   30.1127
		Period          168.204
		Eccentricity    0.98233
		Inclination     -143.606
		AscendingNode   -178.388
		ArgOfPericenter -154.482
		MeanAnomaly     119.844
	}
}

Comet	"Beshqek C21"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            3.17157e-016
	Radius          0.0934403
	InertiaMoment   0.397035

	Oblateness      0.00875286

	RotationPeriod  52.6893
	Obliquity       160.736
	EqAscendNode    159.14

	AbsMagn         9.48554
	SlopeParam      4.6262
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.446 0.440 0.433)

	Surface
	{
		SurfStyle       0.32971
		OceanStyle      0.302763
		Randomize      (0.747, 0.363, 0.887)
		colorDistMagn   0.271914
		colorDistFreq   3.02723e-006
		detailScale     2.55154
		colorConversion true
		snowLevel       2
		tropicLatitude  0.455616
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.486378
		terraceProb     0.340536
		erosion         0
		montesMagn      0.67372
		montesFreq      1.96128
		montesSpiky     0.893758
		montesFraction  0.606233
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.15403e-005
		hillsFraction   0.70538
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.208318
		craterFreq      0.277653
		craterDensity   0.991511
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.489113
		volcanoTemp     1662.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.178, 0.176, 0.173, 0.000)
		colorShelf     (0.190, 0.187, 0.184, 0.000)
		colorBeach     (0.201, 0.198, 0.195, 0.000)
		colorDesert    (0.212, 0.209, 0.206, 0.000)
		colorLowland   (0.223, 0.220, 0.217, 0.000)
		colorUpland    (0.234, 0.231, 0.227, 0.000)
		colorRock      (0.245, 0.242, 0.238, 0.000)
		colorSnow      (0.256, 0.253, 0.249, 1.000)
		BumpHeight      0.0840962
		BumpOffset      0.0168192
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.147004
		DustBright  0.693344
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   39.7669
		Period          255.267
		Eccentricity    0.976109
		Inclination     -36.8688
		AscendingNode   -132.983
		ArgOfPericenter 36.1657
		MeanAnomaly     -67.8624
	}
}

Comet	"Beshqek C22"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            2.45298e-012
	Radius          2.02834
	InertiaMoment   0.399288

	Oblateness      0.0125239

	RotationPeriod  50.87
	Obliquity       113.941
	EqAscendNode    143.717

	AbsMagn         5.98336
	SlopeParam      5.25585
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.703 0.608 0.526)

	Surface
	{
		SurfStyle       0.640735
		OceanStyle      0.89327
		Randomize      (0.751, -0.278, -0.248)
		colorDistMagn   0.352415
		colorDistFreq   0.00316386
		detailScale     55.3871
		colorConversion true
		snowLevel       2
		tropicLatitude  0.953392
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.333467
		terraceProb     0.318114
		erosion         0
		montesMagn      0.544347
		montesFreq      3.15795
		montesSpiky     0.98381
		montesFraction  0.635744
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00548237
		hillsFraction   0.489157
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257594
		craterFreq      0.180574
		craterDensity   0.815384
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.495112
		volcanoTemp     1671.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.274, 0.207, 0.147, 0.000)
		colorShelf     (0.281, 0.213, 0.168, 0.000)
		colorBeach     (0.330, 0.249, 0.200, 0.000)
		colorDesert    (0.358, 0.267, 0.194, 0.000)
		colorLowland   (0.394, 0.286, 0.221, 0.000)
		colorUpland    (0.436, 0.346, 0.268, 0.000)
		colorRock      (0.471, 0.377, 0.289, 0.000)
		colorSnow      (0.513, 0.401, 0.305, 1.000)
		BumpHeight      1.8255
		BumpOffset      0.365101
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.429475
		GasToDust   0.25
		Particles   1847
		GasBright   0.1228
		DustBright  0.402035
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   31.3886
		Period          179.007
		Eccentricity    0.975913
		Inclination     13.7341
		AscendingNode   115.221
		ArgOfPericenter 25.2662
		MeanAnomaly     96.7895
	}
}

Comet	"Beshqek C23"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            1.89721e-008
	Radius          36.5178
	InertiaMoment   0.397949

	Oblateness      0.0101097

	RotationPeriod  49.0579
	Obliquity       67.147
	EqAscendNode    128.295

	AbsMagn         15.0862
	SlopeParam      6.04773
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.559 0.555 0.553)

	Surface
	{
		SurfStyle       0.983715
		OceanStyle      0.738043
		Randomize      (-0.130, -0.956, 0.703)
		colorDistMagn   0.823249
		colorDistFreq   0.754531
		detailScale     997.179
		colorConversion true
		snowLevel       2
		tropicLatitude  0.844416
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.475809
		terraceProb     0.141956
		erosion         0
		montesMagn      0.588105
		montesFreq      2.20817
		montesSpiky     0.838065
		montesFraction  0.368112
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.22186
		hillsFraction   0.640087
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223383
		craterFreq      0.216231
		craterDensity   0.941906
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.45897
		volcanoTemp     1251.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.190, 0.194, 0.221, 0.050)
		colorShelf     (0.223, 0.228, 0.254, 0.040)
		colorBeach     (0.257, 0.261, 0.287, 0.030)
		colorDesert    (0.290, 0.294, 0.326, 0.020)
		colorLowland   (0.324, 0.327, 0.359, 0.030)
		colorUpland    (0.358, 0.361, 0.392, 0.050)
		colorRock      (0.391, 0.394, 0.437, 0.020)
		colorSnow      (0.391, 0.394, 0.437, 1.000)
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
		MaxLength   0.910667
		GasToDust   0.25
		Particles   2819
		GasBright   0.061336
		DustBright  0.147986
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   36.7375
		Period          226.661
		Eccentricity    0.973863
		Inclination     -57.7539
		AscendingNode   -162.402
		ArgOfPericenter 137.596
		MeanAnomaly     -171.287
	}
}

Comet	"Beshqek C24"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            5.84165e-016
	Radius          0.125584
	InertiaMoment   0.39972

	Oblateness      0.0144922

	RotationPeriod  47.2486
	Obliquity       20.3527
	EqAscendNode    112.872

	AbsMagn         9.26418
	SlopeParam      7.4813
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.708 0.705 0.700)

	Surface
	{
		SurfStyle       0.761473
		OceanStyle      0.661641
		Randomize      (-0.071, 0.426, -0.148)
		colorDistMagn   0.697559
		colorDistFreq   7.67936e-006
		detailScale     3.42929
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999403
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.553848
		terraceProb     0.133327
		erosion         0
		montesMagn      0.620267
		montesFreq      3.93283
		montesSpiky     0.846226
		montesFraction  0.551772
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.93679e-005
		hillsFraction   0.565694
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239461
		craterFreq      0.189835
		craterDensity   0.727737
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.466339
		volcanoTemp     1068.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.276, 0.240, 0.196, 0.000)
		colorShelf     (0.283, 0.247, 0.224, 0.000)
		colorBeach     (0.333, 0.289, 0.266, 0.000)
		colorDesert    (0.361, 0.310, 0.259, 0.000)
		colorLowland   (0.397, 0.331, 0.294, 0.000)
		colorUpland    (0.439, 0.402, 0.357, 0.000)
		colorRock      (0.475, 0.437, 0.385, 0.000)
		colorSnow      (0.517, 0.465, 0.406, 1.000)
		BumpHeight      0.113026
		BumpOffset      0.0226052
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.244268
		DustBright  0.44954
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   27.7751
		Period          149.003
		Eccentricity    0.986308
		Inclination     71.793
		AscendingNode   7.56929
		ArgOfPericenter 76.4126
		MeanAnomaly     176.456
	}
}

Comet	"Beshqek C25"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            4.51808e-012
	Radius          2.2619
	InertiaMoment   0.398562

	Oblateness      0.0117868

	RotationPeriod  45.4373
	Obliquity       333.558
	EqAscendNode    97.4496

	AbsMagn         5.7427
	SlopeParam      2.52138
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.487 0.477 0.473)

	Surface
	{
		SurfStyle       0.112938
		OceanStyle      0.492101
		Randomize      (-0.969, -0.751, 0.601)
		colorDistMagn   0.54748
		colorDistFreq   0.0015114
		detailScale     61.7649
		colorConversion true
		snowLevel       2
		tropicLatitude  0.961722
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.528193
		terraceProb     0.271256
		erosion         0
		montesMagn      0.261606
		montesFreq      2.18535
		montesSpiky     0.904934
		montesFraction  0.784804
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0137228
		hillsFraction   0.714107
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253328
		craterFreq      0.279559
		craterDensity   0.882624
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.436227
		volcanoTemp     1046.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.195, 0.191, 0.189, 0.000)
		colorShelf     (0.207, 0.203, 0.201, 0.000)
		colorBeach     (0.219, 0.215, 0.213, 0.000)
		colorDesert    (0.231, 0.227, 0.225, 0.000)
		colorLowland   (0.244, 0.239, 0.237, 0.000)
		colorUpland    (0.256, 0.250, 0.248, 0.000)
		colorRock      (0.268, 0.262, 0.260, 0.000)
		colorSnow      (0.280, 0.274, 0.272, 1.000)
		BumpHeight      2.03571
		BumpOffset      0.407142
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.462301
		GasToDust   0.25
		Particles   1913
		GasBright   0.155522
		DustBright  0.222773
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   45.9388
		Period          316.944
		Eccentricity    0.986641
		Inclination     76.4407
		AscendingNode   -81.4838
		ArgOfPericenter 34.9453
		MeanAnomaly     55.2847
	}
}

Comet	"Beshqek C26"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            3.49441e-008
	Radius          49.0611
	InertiaMoment   0.396173

	Oblateness      0.0167241

	RotationPeriod  43.6195
	Obliquity       286.764
	EqAscendNode    82.027

	AbsMagn         14.2514
	SlopeParam      3.18563
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.556 0.550 0.545)

	Surface
	{
		SurfStyle       0.800572
		OceanStyle      0.557098
		Randomize      (0.100, 0.710, -0.603)
		colorDistMagn   0.0821967
		colorDistFreq   1.29798
		detailScale     1339.7
		colorConversion true
		snowLevel       2
		tropicLatitude  0.970772
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.42416
		terraceProb     0.471733
		erosion         0
		montesMagn      0.429044
		montesFreq      3.61963
		montesSpiky     0.975109
		montesFraction  0.52849
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.76043
		hillsFraction   0.730216
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226936
		craterFreq      0.208803
		craterDensity   0.908118
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.459203
		volcanoTemp     1231.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.217, 0.187, 0.153, 0.000)
		colorShelf     (0.222, 0.192, 0.174, 0.000)
		colorBeach     (0.261, 0.225, 0.207, 0.000)
		colorDesert    (0.283, 0.242, 0.202, 0.000)
		colorLowland   (0.311, 0.258, 0.229, 0.000)
		colorUpland    (0.345, 0.313, 0.278, 0.000)
		colorRock      (0.372, 0.341, 0.300, 0.000)
		colorSnow      (0.406, 0.363, 0.316, 1.000)
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
		MaxLength   0.943493
		GasToDust   0.25
		Particles   2885
		GasBright   0.405644
		DustBright  0.457137
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   31.148
		Period          176.953
		Eccentricity    0.991366
		Inclination     -40.0326
		AscendingNode   41.5592
		ArgOfPericenter -53.6448
		MeanAnomaly     -59.55
	}
}

Comet	"Beshqek C27"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            1.07596e-015
	Radius          0.140101
	InertiaMoment   0.399062

	Oblateness      0.0139297

	RotationPeriod  41.7905
	Obliquity       239.97
	EqAscendNode    66.6044

	AbsMagn         9.04663
	SlopeParam      3.76894
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.676 0.673 0.669)

	Surface
	{
		SurfStyle       0.845409
		OceanStyle      0.853032
		Randomize      (-0.893, -0.204, -0.577)
		colorDistMagn   0.889699
		colorDistFreq   1.20861e-005
		detailScale     3.82569
		colorConversion true
		snowLevel       2
		tropicLatitude  0.885064
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.540746
		terraceProb     0.484598
		erosion         0
		montesMagn      0.483695
		montesFreq      3.47828
		montesSpiky     0.861936
		montesFraction  0.720458
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.86888e-005
		hillsFraction   0.552186
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259228
		craterFreq      0.214939
		craterDensity   0.951529
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.462115
		volcanoTemp     1387.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.264, 0.229, 0.187, 0.000)
		colorShelf     (0.270, 0.236, 0.214, 0.000)
		colorBeach     (0.318, 0.276, 0.254, 0.000)
		colorDesert    (0.345, 0.296, 0.247, 0.000)
		colorLowland   (0.379, 0.316, 0.281, 0.000)
		colorUpland    (0.419, 0.384, 0.341, 0.000)
		colorRock      (0.453, 0.417, 0.368, 0.000)
		colorSnow      (0.494, 0.444, 0.388, 1.000)
		BumpHeight      0.126091
		BumpOffset      0.0252182
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.0139347
		GasToDust   0.25
		Particles   1007
		GasBright   0.0159823
		DustBright  0.531285
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   42.3007
		Period          280.048
		Eccentricity    0.981698
		Inclination     -2.82602
		AscendingNode   -143.646
		ArgOfPericenter 162.802
		MeanAnomaly     -161.212
	}
}

Comet	"Beshqek C28"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            8.32176e-012
	Radius          3.03771
	InertiaMoment   0.397561

	Oblateness      0.0199811

	RotationPeriod  39.9453
	Obliquity       193.176
	EqAscendNode    51.1818

	AbsMagn         5.49357
	SlopeParam      4.33285
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.732 0.728 0.726)

	Surface
	{
		SurfStyle       0.38428
		OceanStyle      0.672278
		Randomize      (-0.696, -0.161, -0.221)
		colorDistMagn   0.379251
		colorDistFreq   0.00728715
		detailScale     82.9498
		colorConversion true
		snowLevel       2
		tropicLatitude  0.958685
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.434133
		terraceProb     0.276312
		erosion         0
		montesMagn      0.420301
		montesFreq      3.04407
		montesSpiky     0.904852
		montesFraction  0.434523
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0169291
		hillsFraction   0.578419
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234632
		craterFreq      0.263065
		craterDensity   1.03954
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.454714
		volcanoTemp     1460.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.293, 0.291, 0.290, 0.000)
		colorShelf     (0.311, 0.309, 0.309, 0.000)
		colorBeach     (0.330, 0.328, 0.327, 0.000)
		colorDesert    (0.348, 0.346, 0.345, 0.000)
		colorLowland   (0.366, 0.364, 0.363, 0.000)
		colorUpland    (0.384, 0.382, 0.381, 0.000)
		colorRock      (0.403, 0.400, 0.399, 0.000)
		colorSnow      (0.421, 0.419, 0.417, 1.000)
		BumpHeight      2.73394
		BumpOffset      0.546788
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.495127
		GasToDust   0.25
		Particles   1980
		GasBright   0.0204521
		DustBright  0.211302
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   31.1802
		Period          177.227
		Eccentricity    0.977451
		Inclination     -86.6401
		AscendingNode   -1.98261
		ArgOfPericenter 104.233
		MeanAnomaly     -153.245
	}
}

Comet	"Beshqek C29"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            6.43628e-008
	Radius          54.7529
	InertiaMoment   0.399509

	Oblateness      0.0167695

	RotationPeriod  38.0787
	Obliquity       146.381
	EqAscendNode    35.7592

	AbsMagn         13.6243
	SlopeParam      4.92515
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.514 0.508 0.503)

	Surface
	{
		SurfStyle       0.349496
		OceanStyle      0.387104
		Randomize      (-0.079, -0.332, 0.366)
		colorDistMagn   0.781491
		colorDistFreq   1.15267
		detailScale     1495.12
		colorConversion true
		snowLevel       2
		tropicLatitude  0.64976
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.309966
		terraceProb     0.123069
		erosion         0
		montesMagn      0.430766
		montesFreq      2.93224
		montesSpiky     0.945695
		montesFraction  0.453204
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.55999
		hillsFraction   0.663142
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219699
		craterFreq      0.244124
		craterDensity   0.981397
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.527907
		volcanoTemp     1669.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.205, 0.203, 0.201, 0.000)
		colorShelf     (0.218, 0.216, 0.214, 0.000)
		colorBeach     (0.231, 0.229, 0.226, 0.000)
		colorDesert    (0.244, 0.241, 0.239, 0.000)
		colorLowland   (0.257, 0.254, 0.252, 0.000)
		colorUpland    (0.270, 0.267, 0.264, 0.000)
		colorRock      (0.283, 0.279, 0.277, 0.000)
		colorSnow      (0.295, 0.292, 0.289, 1.000)
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
		MaxLength   0.976319
		GasToDust   0.25
		Particles   2952
		GasBright   0.105498
		DustBright  0.610743
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   38.4172
		Period          242.382
		Eccentricity    0.974806
		Inclination     -172.413
		AscendingNode   153.311
		ArgOfPericenter 147.531
		MeanAnomaly     173.043
	}
}

Comet	"Beshqek C30"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            1.98178e-015
	Radius          0.188088
	InertiaMoment   0.39828

	Oblateness      0.0243372

	RotationPeriod  36.185
	Obliquity       99.5869
	EqAscendNode    20.3366

	AbsMagn         8.83214
	SlopeParam      5.61453
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.706 0.704 0.703)

	Surface
	{
		SurfStyle       0.959265
		OceanStyle      0.951186
		Randomize      (-0.851, 0.761, -0.543)
		colorDistMagn   0.460477
		colorDistFreq   3.10746e-005
		detailScale     5.13607
		colorConversion true
		snowLevel       2
		tropicLatitude  0.990479
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.344603
		terraceProb     0.223816
		erosion         0
		montesMagn      0.517771
		montesFreq      3.01243
		montesSpiky     0.9676
		montesFraction  0.328657
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.0037e-005
		hillsFraction   0.520326
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233391
		craterFreq      0.19164
		craterDensity   0.983868
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.500853
		volcanoTemp     1475.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.240, 0.246, 0.281, 0.050)
		colorShelf     (0.282, 0.289, 0.323, 0.040)
		colorBeach     (0.325, 0.331, 0.366, 0.030)
		colorDesert    (0.367, 0.373, 0.415, 0.020)
		colorLowland   (0.410, 0.415, 0.457, 0.030)
		colorUpland    (0.452, 0.458, 0.499, 0.050)
		colorRock      (0.494, 0.500, 0.555, 0.020)
		colorSnow      (0.494, 0.500, 0.555, 1.000)
		BumpHeight      0.16928
		BumpOffset      0.0338559
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.0467605
		GasToDust   0.25
		Particles   1074
		GasBright   0.082686
		DustBright  0.318042
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   18.8576
		Period          83.3569
		Eccentricity    0.994662
		Inclination     175.357
		AscendingNode   69.2079
		ArgOfPericenter -123.371
		MeanAnomaly     113.877
	}
}

Comet	"Beshqek C31"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            1.53276e-011
	Radius          3.39134
	InertiaMoment   0.399933

	Oblateness      0.0207063

	RotationPeriod  34.2579
	Obliquity       52.7926
	EqAscendNode    4.91403

	AbsMagn         5.23431
	SlopeParam      6.58976
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.725 0.619 0.551)

	Surface
	{
		SurfStyle       0.716811
		OceanStyle      0.981972
		Randomize      (-0.168, 0.515, -0.946)
		colorDistMagn   0.573026
		colorDistFreq   0.00535877
		detailScale     92.6061
		colorConversion true
		snowLevel       2
		tropicLatitude  0.862588
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.476322
		terraceProb     0.39649
		erosion         0
		montesMagn      0.317474
		montesFreq      3.38879
		montesSpiky     0.965324
		montesFraction  0.297991
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0267829
		hillsFraction   0.817339
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219974
		craterFreq      0.259415
		craterDensity   0.782221
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.527547
		volcanoTemp     1438.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.283, 0.211, 0.154, 0.000)
		colorShelf     (0.290, 0.217, 0.176, 0.000)
		colorBeach     (0.341, 0.254, 0.209, 0.000)
		colorDesert    (0.370, 0.273, 0.204, 0.000)
		colorLowland   (0.406, 0.291, 0.231, 0.000)
		colorUpland    (0.450, 0.353, 0.281, 0.000)
		colorRock      (0.486, 0.384, 0.303, 0.000)
		colorSnow      (0.529, 0.409, 0.319, 1.000)
		BumpHeight      3.0522
		BumpOffset      0.610441
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.527952
		GasToDust   0.25
		Particles   2046
		GasBright   0.234922
		DustBright  0.650292
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   28.6381
		Period          156.002
		Eccentricity    0.975521
		Inclination     76.3302
		AscendingNode   -33.0309
		ArgOfPericenter -55.7667
		MeanAnomaly     -120.851
	}
}

Comet	"Beshqek C32"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            1.18548e-007
	Radius          73.4825
	InertiaMoment   0.398825

	Oblateness      0.0305269

	RotationPeriod  32.2907
	Obliquity       5.99834
	EqAscendNode    349.491

	AbsMagn         13.1112
	SlopeParam      2.11565
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.699 0.697 0.695)

	Surface
	{
		SurfStyle       0.843452
		OceanStyle      0.919405
		Randomize      (-0.298, -0.142, 0.482)
		colorDistMagn   0.824266
		colorDistFreq   3.13553
		detailScale     2006.56
		colorConversion true
		snowLevel       2
		tropicLatitude  0.150217
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.714913
		terraceProb     0.366938
		erosion         0
		montesMagn      0.51011
		montesFreq      3.49232
		montesSpiky     0.899159
		montesFraction  0.792982
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.7074
		hillsFraction   0.673097
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24812
		craterFreq      0.255368
		craterDensity   0.982062
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.427973
		volcanoTemp     1292.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.273, 0.237, 0.195, 0.000)
		colorShelf     (0.280, 0.244, 0.222, 0.000)
		colorBeach     (0.329, 0.286, 0.264, 0.000)
		colorDesert    (0.357, 0.307, 0.257, 0.000)
		colorLowland   (0.392, 0.328, 0.292, 0.000)
		colorUpland    (0.434, 0.397, 0.354, 0.000)
		colorRock      (0.469, 0.432, 0.382, 0.000)
		colorSnow      (0.511, 0.460, 0.403, 1.000)
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
		GasBright   0.184828
		DustBright  0.384873
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   14.98
		Period          59.0176
		Eccentricity    0.975568
		Inclination     -177.294
		AscendingNode   -15.1513
		ArgOfPericenter 125.772
		MeanAnomaly     -102.518
	}
}

Comet	"Beshqek C33"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            3.65019e-015
	Radius          0.210055
	InertiaMoment   0.39705

	Oblateness      0.0261697

	RotationPeriod  30.2754
	Obliquity       319.204
	EqAscendNode    334.069

	AbsMagn         8.62002
	SlopeParam      2.86465
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.721 0.674 0.659)

	Surface
	{
		SurfStyle       0.18418
		OceanStyle      0.977416
		Randomize      (0.877, 0.126, 0.146)
		colorDistMagn   0.121174
		colorDistFreq   1.44875e-005
		detailScale     5.73591
		colorConversion true
		snowLevel       2
		tropicLatitude  0.481311
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.48891
		terraceProb     0.305578
		erosion         0
		montesMagn      0.488223
		montesFreq      2.16121
		montesSpiky     0.915161
		montesFraction  0.288246
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000138325
		hillsFraction   0.757547
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232673
		craterFreq      0.254288
		craterDensity   0.803642
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.425003
		volcanoTemp     1502.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.289, 0.270, 0.263, 0.000)
		colorShelf     (0.307, 0.287, 0.280, 0.000)
		colorBeach     (0.325, 0.304, 0.296, 0.000)
		colorDesert    (0.343, 0.320, 0.313, 0.000)
		colorLowland   (0.361, 0.337, 0.329, 0.000)
		colorUpland    (0.379, 0.354, 0.346, 0.000)
		colorRock      (0.397, 0.371, 0.362, 0.000)
		colorSnow      (0.415, 0.388, 0.379, 1.000)
		BumpHeight      0.18905
		BumpOffset      0.03781
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.0795865
		GasToDust   0.25
		Particles   1140
		GasBright   0.0974746
		DustBright  0.156713
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   30.9453
		Period          175.228
		Eccentricity    0.961536
		Inclination     -66.1059
		AscendingNode   162.561
		ArgOfPericenter -83.8061
		MeanAnomaly     -121.626
	}
}

Comet	"Beshqek C34"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            2.82316e-011
	Radius          4.55
	InertiaMoment   0.399293

	Oblateness      0.0399628

	RotationPeriod  28.2029
	Obliquity       272.41
	EqAscendNode    318.646

	AbsMagn         4.96287
	SlopeParam      3.47882
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.515 0.433 0.307)

	Surface
	{
		SurfStyle       0.165668
		OceanStyle      0.554765
		Randomize      (0.221, 0.171, -0.606)
		colorDistMagn   0.15954
		colorDistFreq   0.00976529
		detailScale     124.245
		colorConversion true
		snowLevel       2
		tropicLatitude  0.824052
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.375181
		terraceProb     0.381778
		erosion         0
		montesMagn      0.474044
		montesFreq      4.16944
		montesSpiky     0.890443
		montesFraction  0.601492
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0509555
		hillsFraction   0.627964
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.201859
		craterFreq      0.244034
		craterDensity   0.941265
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.527605
		volcanoTemp     1584.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.206, 0.173, 0.123, 0.000)
		colorShelf     (0.219, 0.184, 0.130, 0.000)
		colorBeach     (0.232, 0.195, 0.138, 0.000)
		colorDesert    (0.245, 0.206, 0.146, 0.000)
		colorLowland   (0.258, 0.216, 0.153, 0.000)
		colorUpland    (0.271, 0.227, 0.161, 0.000)
		colorRock      (0.283, 0.238, 0.169, 0.000)
		colorSnow      (0.296, 0.249, 0.176, 1.000)
		BumpHeight      4.095
		BumpOffset      0.819
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.560778
		GasToDust   0.25
		Particles   2112
		GasBright   0.326878
		DustBright  0.411795
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   37.1038
		Period          230.059
		Eccentricity    0.973942
		Inclination     113.096
		AscendingNode   50.6266
		ArgOfPericenter -169.757
		MeanAnomaly     -0.464777
	}
}

Comet	"Beshqek C35"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            2.18351e-007
	Radius          82.0908
	InertiaMoment   0.397958

	Oblateness      0.0353562

	RotationPeriod  26.0626
	Obliquity       225.615
	EqAscendNode    303.224

	AbsMagn         12.6707
	SlopeParam      4.04654
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.782 0.779 0.777)

	Surface
	{
		SurfStyle       0.990704
		OceanStyle      0.919401
		Randomize      (0.350, 0.379, 0.602)
		colorDistMagn   0.0889883
		colorDistFreq   3.57353
		detailScale     2241.63
		colorConversion true
		snowLevel       2
		tropicLatitude  0.681965
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.586068
		terraceProb     0.570171
		erosion         0
		montesMagn      0.444701
		montesFreq      3.03415
		montesSpiky     0.896008
		montesFraction  0.536297
		dunesFraction   0
		hillsMagn       0
		hillsFreq       19.6214
		hillsFraction   0.624802
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242733
		craterFreq      0.277079
		craterDensity   0.868727
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.443925
		volcanoTemp     1247.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.266, 0.273, 0.311, 0.050)
		colorShelf     (0.313, 0.319, 0.358, 0.040)
		colorBeach     (0.360, 0.366, 0.404, 0.030)
		colorDesert    (0.407, 0.413, 0.459, 0.020)
		colorLowland   (0.454, 0.460, 0.505, 0.030)
		colorUpland    (0.501, 0.507, 0.552, 0.050)
		colorRock      (0.548, 0.553, 0.614, 0.020)
		colorSnow      (0.548, 0.553, 0.614, 1.000)
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
		GasBright   0.000662637
		DustBright  0.422498
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   38.1455
		Period          239.816
		Eccentricity    0.986858
		Inclination     91.4342
		AscendingNode   -2.26824
		ArgOfPericenter -143.162
		MeanAnomaly     -162.456
	}
}

Comet	"Beshqek C36"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            6.72317e-015
	Radius          0.281737
	InertiaMoment   0.399725

	Oblateness      0.0558382

	RotationPeriod  23.8417
	Obliquity       178.821
	EqAscendNode    287.801

	AbsMagn         8.40962
	SlopeParam      4.6181
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.831 0.772 0.721)

	Surface
	{
		SurfStyle       0.374394
		OceanStyle      0.0798415
		Randomize      (-0.114, 0.449, 0.040)
		colorDistMagn   0.624401
		colorDistFreq   4.6314e-005
		detailScale     7.6933
		colorConversion true
		snowLevel       2
		tropicLatitude  0.897848
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.661505
		terraceProb     0.371381
		erosion         0
		montesMagn      0.516146
		montesFreq      3.16519
		montesSpiky     0.978163
		montesFraction  0.385917
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000152028
		hillsFraction   0.569117
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252474
		craterFreq      0.186816
		craterDensity   0.870816
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53706
		volcanoTemp     1512.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.333, 0.309, 0.288, 0.000)
		colorShelf     (0.353, 0.328, 0.307, 0.000)
		colorBeach     (0.374, 0.348, 0.325, 0.000)
		colorDesert    (0.395, 0.367, 0.343, 0.000)
		colorLowland   (0.416, 0.386, 0.361, 0.000)
		colorUpland    (0.437, 0.406, 0.379, 0.000)
		colorRock      (0.457, 0.425, 0.397, 0.000)
		colorSnow      (0.478, 0.444, 0.415, 1.000)
		BumpHeight      0.253563
		BumpOffset      0.0507127
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.112412
		GasToDust   0.25
		Particles   1206
		GasBright   0.0550136
		DustBright  0.852633
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   31.7867
		Period          182.423
		Eccentricity    0.974234
		Inclination     115.233
		AscendingNode   139.214
		ArgOfPericenter -111.826
		MeanAnomaly     109.947
	}
}

Comet	"Beshqek C37"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            5.19989e-011
	Radius          5.08456
	InertiaMoment   0.398569

	Oblateness      0.0518385

	RotationPeriod  21.5249
	Obliquity       132.027
	EqAscendNode    272.379

	AbsMagn         4.67666
	SlopeParam      5.24647
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.712 0.708 0.706)

	Surface
	{
		SurfStyle       0.655177
		OceanStyle      0.333554
		Randomize      (0.650, 0.416, 0.509)
		colorDistMagn   0.0794443
		colorDistFreq   0.0199361
		detailScale     138.842
		colorConversion true
		snowLevel       2
		tropicLatitude  0.723853
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.434779
		terraceProb     0.51983
		erosion         0
		montesMagn      0.653167
		montesFreq      2.90171
		montesSpiky     0.830365
		montesFraction  0.73322
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0729053
		hillsFraction   0.47973
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.199495
		craterFreq      0.256356
		craterDensity   0.831736
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.484644
		volcanoTemp     848.074
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.278, 0.241, 0.198, 0.000)
		colorShelf     (0.285, 0.248, 0.226, 0.000)
		colorBeach     (0.334, 0.290, 0.268, 0.000)
		colorDesert    (0.363, 0.312, 0.261, 0.000)
		colorLowland   (0.398, 0.333, 0.296, 0.000)
		colorUpland    (0.441, 0.404, 0.360, 0.000)
		colorRock      (0.477, 0.439, 0.388, 0.000)
		colorSnow      (0.519, 0.468, 0.409, 1.000)
		BumpHeight      4.57611
		BumpOffset      0.915221
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.593604
		GasToDust   0.25
		Particles   2178
		GasBright   0.0708526
		DustBright  0.521281
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   24.1994
		Period          121.177
		Eccentricity    0.96081
		Inclination     2.10155
		AscendingNode   39.8088
		ArgOfPericenter -165.818
		MeanAnomaly     146.935
	}
}

Comet	"Beshqek C38"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            4.02175e-007
	Radius          110.074
	InertiaMoment   0.396206

	Oblateness      0.0856675

	RotationPeriod  19.0927
	Obliquity       85.2326
	EqAscendNode    256.956

	AbsMagn         12.2806
	SlopeParam      6.03474
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.743 0.740 0.737)

	Surface
	{
		SurfStyle       0.387525
		OceanStyle      0.0484728
		Randomize      (0.701, -0.289, 0.133)
		colorDistMagn   0.986925
		colorDistFreq   6.7229
		detailScale     3005.74
		colorConversion true
		snowLevel       2
		tropicLatitude  0.828018
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.414912
		terraceProb     0.332159
		erosion         0
		montesMagn      0.474417
		montesFreq      3.16175
		montesSpiky     0.871633
		montesFraction  0.800354
		dunesFraction   0
		hillsMagn       0
		hillsFreq       23.7377
		hillsFraction   0.592161
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213477
		craterFreq      0.434544
		craterDensity   0.942255
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.561977
		volcanoTemp     1442.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.297, 0.296, 0.295, 0.000)
		colorShelf     (0.316, 0.314, 0.313, 0.000)
		colorBeach     (0.334, 0.333, 0.331, 0.000)
		colorDesert    (0.353, 0.351, 0.350, 0.000)
		colorLowland   (0.371, 0.370, 0.368, 0.000)
		colorUpland    (0.390, 0.388, 0.387, 0.000)
		colorRock      (0.408, 0.407, 0.405, 0.000)
		colorSnow      (0.427, 0.425, 0.424, 1.000)
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
		GasBright   0.0494325
		DustBright  0.227188
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   26.0899
		Period          135.65
		Eccentricity    0.969463
		Inclination     101.419
		AscendingNode   -126.218
		ArgOfPericenter 102.955
		MeanAnomaly     -59.2918
	}
}

Comet	"Beshqek C39"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            1.23833e-014
	Radius          0.314928
	InertiaMoment   0.399068

	Oblateness      0.0879657

	RotationPeriod  16.5208
	Obliquity       38.4383
	EqAscendNode    241.533

	AbsMagn         8.20036
	SlopeParam      7.44672
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.612 0.563 0.522)

	Surface
	{
		SurfStyle       0.956223
		OceanStyle      0.876093
		Randomize      (-0.868, -0.632, 0.218)
		colorDistMagn   0.157089
		colorDistFreq   4.56804e-005
		detailScale     8.59963
		colorConversion true
		snowLevel       2
		tropicLatitude  0.316269
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.658935
		terraceProb     0.512765
		erosion         0
		montesMagn      0.549135
		montesFreq      2.60075
		montesSpiky     0.861926
		montesFraction  0.617975
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000262742
		hillsFraction   0.492479
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259282
		craterFreq      0.153984
		craterDensity   0.832907
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.519921
		volcanoTemp     1452.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.208, 0.197, 0.209, 0.050)
		colorShelf     (0.245, 0.231, 0.240, 0.040)
		colorBeach     (0.282, 0.265, 0.271, 0.030)
		colorDesert    (0.318, 0.298, 0.308, 0.020)
		colorLowland   (0.355, 0.332, 0.339, 0.030)
		colorUpland    (0.392, 0.366, 0.370, 0.050)
		colorRock      (0.429, 0.400, 0.412, 0.020)
		colorSnow      (0.429, 0.400, 0.412, 1.000)
		BumpHeight      0.283435
		BumpOffset      0.056687
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.145238
		GasToDust   0.25
		Particles   1273
		GasBright   0.180951
		DustBright  0.580156
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   22.9358
		Period          111.811
		Eccentricity    0.969483
		Inclination     24.8694
		AscendingNode   155.564
		ArgOfPericenter -22.2117
		MeanAnomaly     -129.335
	}
}

Comet	"Beshqek C40"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            9.57756e-011
	Radius          6.81596
	InertiaMoment   0.397572

	Oblateness      0.16487

	RotationPeriod  13.7773
	Obliquity       351.644
	EqAscendNode    226.111

	AbsMagn         4.37232
	SlopeParam      2.51122
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.749 0.638 0.582)

	Surface
	{
		SurfStyle       0.1982
		OceanStyle      0.259627
		Randomize      (-0.325, -0.078, 0.192)
		colorDistMagn   0.527975
		colorDistFreq   0.0341735
		detailScale     186.121
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997192
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.640219
		terraceProb     0.196944
		erosion         0
		montesMagn      0.462707
		montesFreq      2.77558
		montesSpiky     0.939666
		montesFraction  0.424068
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.130069
		hillsFraction   0.527297
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222551
		craterFreq      0.239528
		craterDensity   0.947721
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.453494
		volcanoTemp     1544.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.300, 0.255, 0.233, 0.000)
		colorShelf     (0.318, 0.271, 0.247, 0.000)
		colorBeach     (0.337, 0.287, 0.262, 0.000)
		colorDesert    (0.356, 0.303, 0.276, 0.000)
		colorLowland   (0.375, 0.319, 0.291, 0.000)
		colorUpland    (0.393, 0.335, 0.305, 0.000)
		colorRock      (0.412, 0.351, 0.320, 0.000)
		colorSnow      (0.431, 0.367, 0.335, 1.000)
		BumpHeight      6.13436
		BumpOffset      1.22687
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.62643
		GasToDust   0.25
		Particles   2245
		GasBright   0.132249
		DustBright  0.313345
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   21.3244
		Period          100.237
		Eccentricity    0.99277
		Inclination     102.631
		AscendingNode   4.02065
		ArgOfPericenter 151.435
		MeanAnomaly     -67.4665
	}
}

Comet	"Beshqek C41"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            7.40756e-007
	Radius          123.074
	InertiaMoment   0.399515

	Oblateness      0.205002

	RotationPeriod  10.819
	Obliquity       304.85
	EqAscendNode    210.688

	AbsMagn         11.9274
	SlopeParam      3.17724
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.731 0.625 0.566)

	Surface
	{
		SurfStyle       0.214875
		OceanStyle      0.846232
		Randomize      (-0.344, -0.413, -0.422)
		colorDistMagn   0.0863475
		colorDistFreq   8.87769
		detailScale     3360.74
		colorConversion true
		snowLevel       2
		tropicLatitude  0.75662
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.678392
		terraceProb     0.357294
		erosion         0
		montesMagn      0.550873
		montesFreq      3.10526
		montesSpiky     0.911362
		montesFraction  0.576431
		dunesFraction   0
		hillsMagn       0
		hillsFreq       39.4764
		hillsFraction   0.715436
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.209962
		craterFreq      0.394466
		craterDensity   0.932739
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.395174
		volcanoTemp     1606.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.292, 0.250, 0.226, 0.000)
		colorShelf     (0.311, 0.266, 0.241, 0.000)
		colorBeach     (0.329, 0.281, 0.255, 0.000)
		colorDesert    (0.347, 0.297, 0.269, 0.000)
		colorLowland   (0.366, 0.313, 0.283, 0.000)
		colorUpland    (0.384, 0.328, 0.297, 0.000)
		colorRock      (0.402, 0.344, 0.311, 0.000)
		colorSnow      (0.420, 0.360, 0.326, 1.000)
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
		GasBright   0.330957
		DustBright  0.599123
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   30.1848
		Period          168.809
		Eccentricity    0.964531
		Inclination     170.862
		AscendingNode   133.481
		ArgOfPericenter -71.7814
		MeanAnomaly     29.5795
	}
}

Comet	"Beshqek C42"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            2.28084e-014
	Radius          0.422062
	InertiaMoment   0.398287

	Oblateness      0.249

	RotationPeriod  7.58554
	Obliquity       258.055
	EqAscendNode    195.266

	AbsMagn         7.99164
	SlopeParam      3.76117
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.707 0.586 0.540)

	Surface
	{
		SurfStyle       0.408989
		OceanStyle      0.0758862
		Randomize      (-0.209, -0.012, 0.440)
		colorDistMagn   0.985699
		colorDistFreq   0.00013119
		detailScale     11.5251
		colorConversion true
		snowLevel       2
		tropicLatitude  0.89332
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.540879
		terraceProb     0.445518
		erosion         0
		montesMagn      0.526296
		montesFreq      3.42559
		montesSpiky     0.916389
		montesFraction  0.829257
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000272874
		hillsFraction   0.650878
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249784
		craterFreq      0.190944
		craterDensity   0.780248
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.579356
		volcanoTemp     1365.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.283, 0.234, 0.216, 0.000)
		colorShelf     (0.301, 0.249, 0.229, 0.000)
		colorBeach     (0.318, 0.264, 0.243, 0.000)
		colorDesert    (0.336, 0.278, 0.256, 0.000)
		colorLowland   (0.354, 0.293, 0.270, 0.000)
		colorUpland    (0.371, 0.307, 0.283, 0.000)
		colorRock      (0.389, 0.322, 0.297, 0.000)
		colorSnow      (0.407, 0.337, 0.310, 1.000)
		BumpHeight      0.379856
		BumpOffset      0.0759712
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.178064
		GasToDust   0.25
		Particles   1339
		GasBright   0.254973
		DustBright  0.359593
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   33.4956
		Period          197.33
		Eccentricity    0.984373
		Inclination     106.097
		AscendingNode   -65.3507
		ArgOfPericenter -145.376
		MeanAnomaly     94.0009
	}
}

Comet	"Beshqek C43"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            1.76407e-010
	Radius          7.6229
	InertiaMoment   0.399938

	Oblateness      0.249

	RotationPeriod  3.98824
	Obliquity       211.261
	EqAscendNode    179.843

	AbsMagn         4.04539
	SlopeParam      4.32503
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.704 0.621 0.516)

	Surface
	{
		SurfStyle       0.929528
		OceanStyle      0.396592
		Randomize      (-0.292, 0.602, 0.439)
		colorDistMagn   0.0230727
		colorDistFreq   0.0411371
		detailScale     208.156
		colorConversion true
		snowLevel       2
		tropicLatitude  0.632197
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.673732
		terraceProb     0.200038
		erosion         0
		montesMagn      0.540844
		montesFreq      3.3699
		montesSpiky     0.869467
		montesFraction  0.451832
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0823847
		hillsFraction   0.812342
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237483
		craterFreq      0.231302
		craterDensity   0.769103
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.541631
		volcanoTemp     1354.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.240, 0.217, 0.207, 0.050)
		colorShelf     (0.282, 0.254, 0.238, 0.040)
		colorBeach     (0.324, 0.292, 0.269, 0.030)
		colorDesert    (0.366, 0.329, 0.305, 0.020)
		colorLowland   (0.409, 0.366, 0.336, 0.030)
		colorUpland    (0.451, 0.403, 0.367, 0.050)
		colorRock      (0.493, 0.441, 0.408, 0.020)
		colorSnow      (0.493, 0.441, 0.408, 1.000)
		BumpHeight      6.86061
		BumpOffset      1.37212
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.659256
		GasToDust   0.25
		Particles   2311
		GasBright   0.14173
		DustBright  0.157323
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   32.4714
		Period          188.35
		Eccentricity    0.978789
		Inclination     132.183
		AscendingNode   58.5209
		ArgOfPericenter 108.985
		MeanAnomaly     -23.3509
	}
}

Comet	"Beshqek C44"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            5.43168e-018
	Radius          0.0261354
	InertiaMoment   0.398831

	Oblateness      0.00186872

	RotationPeriod  129.331
	Obliquity       164.467
	EqAscendNode    164.42

	AbsMagn         11.6025
	SlopeParam      4.91657
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.644 0.641 0.638)

	Surface
	{
		SurfStyle       0.800525
		OceanStyle      0.463073
		Randomize      (0.866, -0.277, 0.962)
		colorDistMagn   0.673636
		colorDistFreq   2.51705e-007
		detailScale     0.713672
		colorConversion true
		snowLevel       2
		tropicLatitude  0.995625
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.752143
		terraceProb     0.416867
		erosion         0
		montesMagn      0.526529
		montesFreq      3.1981
		montesSpiky     0.982565
		montesFraction  0.477604
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.04045e-006
		hillsFraction   0.445394
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213554
		craterFreq      0.176961
		craterDensity   0.881586
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.510457
		volcanoTemp     1359.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.251, 0.218, 0.179, 0.000)
		colorShelf     (0.258, 0.224, 0.204, 0.000)
		colorBeach     (0.303, 0.263, 0.242, 0.000)
		colorDesert    (0.329, 0.282, 0.236, 0.000)
		colorLowland   (0.361, 0.301, 0.268, 0.000)
		colorUpland    (0.399, 0.365, 0.325, 0.000)
		colorRock      (0.432, 0.398, 0.351, 0.000)
		colorSnow      (0.470, 0.423, 0.370, 1.000)
		BumpHeight      0.0235219
		BumpOffset      0.00470438
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.0258358
		DustBright  0.757704
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   33.221
		Period          194.909
		Eccentricity    0.968166
		Inclination     95.3783
		AscendingNode   46.4358
		ArgOfPericenter -169.099
		MeanAnomaly     -146.807
	}
}

Comet	"Beshqek C45"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            4.20102e-014
	Radius          0.47214
	InertiaMoment   0.397066

	Oblateness      0.0017995

	RotationPeriod  114.686
	Obliquity       117.672
	EqAscendNode    148.998

	AbsMagn         7.7829
	SlopeParam      5.60386
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.467 0.463 0.460)

	Surface
	{
		SurfStyle       0.208691
		OceanStyle      0.419777
		Randomize      (0.467, 0.549, -0.563)
		colorDistMagn   0.825917
		colorDistFreq   0.000124624
		detailScale     12.8926
		colorConversion true
		snowLevel       2
		tropicLatitude  0.912713
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.598721
		terraceProb     0.112843
		erosion         0
		montesMagn      0.505973
		montesFreq      2.43494
		montesSpiky     0.988428
		montesFraction  0.648354
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00046425
		hillsFraction   0.374214
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.199846
		craterFreq      0.231342
		craterDensity   0.97327
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.551959
		volcanoTemp     1550.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.187, 0.185, 0.184, 0.000)
		colorShelf     (0.199, 0.197, 0.195, 0.000)
		colorBeach     (0.210, 0.209, 0.207, 0.000)
		colorDesert    (0.222, 0.220, 0.218, 0.000)
		colorLowland   (0.234, 0.232, 0.230, 0.000)
		colorUpland    (0.245, 0.243, 0.241, 0.000)
		colorRock      (0.257, 0.255, 0.253, 0.000)
		colorSnow      (0.269, 0.266, 0.264, 1.000)
		BumpHeight      0.424926
		BumpOffset      0.0849852
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.21089
		GasToDust   0.25
		Particles   1405
		GasBright   0.043067
		DustBright  0.424959
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   29.0811
		Period          159.635
		Eccentricity    0.965258
		Inclination     -126.757
		AscendingNode   79.3866
		ArgOfPericenter 141.005
		MeanAnomaly     -175.145
	}
}

Comet	"Beshqek C46"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            3.24918e-010
	Radius          10.2115
	InertiaMoment   0.399299

	Oblateness      0.00275179

	RotationPeriod  106.516
	Obliquity       70.8782
	EqAscendNode    133.575

	AbsMagn         3.68964
	SlopeParam      6.57202
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.502 0.424 0.395)

	Surface
	{
		SurfStyle       0.213497
		OceanStyle      0.814628
		Randomize      (0.747, 0.819, 0.518)
		colorDistMagn   0.489361
		colorDistFreq   0.0674811
		detailScale     278.842
		colorConversion true
		snowLevel       2
		tropicLatitude  0.685145
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.357019
		terraceProb     0.248472
		erosion         0
		montesMagn      0.516577
		montesFreq      3.3103
		montesSpiky     0.922339
		montesFraction  0.499005
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.26207
		hillsFraction   0.557455
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241338
		craterFreq      0.189392
		craterDensity   0.75975
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.564837
		volcanoTemp     1886.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.201, 0.170, 0.158, 0.000)
		colorShelf     (0.213, 0.180, 0.168, 0.000)
		colorBeach     (0.226, 0.191, 0.178, 0.000)
		colorDesert    (0.238, 0.201, 0.187, 0.000)
		colorLowland   (0.251, 0.212, 0.197, 0.000)
		colorUpland    (0.263, 0.223, 0.207, 0.000)
		colorRock      (0.276, 0.233, 0.217, 0.000)
		colorSnow      (0.289, 0.244, 0.227, 1.000)
		BumpHeight      9.19034
		BumpOffset      1.83807
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.692082
		GasToDust   0.25
		Particles   2377
		GasBright   0.14389
		DustBright  0.808623
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   39.9076
		Period          256.623
		Eccentricity    0.990343
		Inclination     -67.058
		AscendingNode   169.711
		ArgOfPericenter 11.711
		MeanAnomaly     1.83813
	}
}

Comet	"Beshqek C47"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            1.00045e-017
	Radius          0.0292429
	InertiaMoment   0.397967

	Oblateness      0.00234237

	RotationPeriod  100.577
	Obliquity       24.0839
	EqAscendNode    118.153

	AbsMagn         11.2998
	SlopeParam      2.10359
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.717 0.715 0.711)

	Surface
	{
		SurfStyle       0.100306
		OceanStyle      0.0824261
		Randomize      (0.145, -0.794, -0.549)
		colorDistMagn   0.365107
		colorDistFreq   3.91357e-007
		detailScale     0.798525
		colorConversion true
		snowLevel       2
		tropicLatitude  0.961127
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.5131
		terraceProb     0.218783
		erosion         0
		montesMagn      0.524683
		montesFreq      2.27303
		montesSpiky     0.946956
		montesFraction  0.283759
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.83909e-006
		hillsFraction   0.585159
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227857
		craterFreq      0.177366
		craterDensity   0.848657
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.488151
		volcanoTemp     1641.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.287, 0.286, 0.285, 0.000)
		colorShelf     (0.305, 0.304, 0.302, 0.000)
		colorBeach     (0.322, 0.322, 0.320, 0.000)
		colorDesert    (0.340, 0.340, 0.338, 0.000)
		colorLowland   (0.358, 0.357, 0.356, 0.000)
		colorUpland    (0.376, 0.375, 0.373, 0.000)
		colorRock      (0.394, 0.393, 0.391, 0.000)
		colorSnow      (0.412, 0.411, 0.409, 1.000)
		BumpHeight      0.0263186
		BumpOffset      0.00526371
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.133839
		DustBright  0.50316
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   35.2552
		Period          213.082
		Eccentricity    0.991364
		Inclination     64.5872
		AscendingNode   -71.7101
		ArgOfPericenter 159.555
		MeanAnomaly     -72.4193
	}
}

Comet	"Beshqek C48"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            7.73776e-014
	Radius          0.632343
	InertiaMoment   0.399731

	Oblateness      0.00339765

	RotationPeriod  95.799
	Obliquity       337.29
	EqAscendNode    102.73

	AbsMagn         7.57356
	SlopeParam      2.85558
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.427 0.424 0.421)

	Surface
	{
		SurfStyle       0.797367
		OceanStyle      0.191703
		Randomize      (-0.008, 0.341, 0.525)
		colorDistMagn   0.278993
		colorDistFreq   6.09169e-005
		detailScale     17.2672
		colorConversion true
		snowLevel       2
		tropicLatitude  0.591161
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.720093
		terraceProb     0.186374
		erosion         0
		montesMagn      0.623646
		montesFreq      3.19204
		montesSpiky     0.953625
		montesFraction  0.247412
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000629391
		hillsFraction   0.779625
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.26418
		craterFreq      0.232958
		craterDensity   0.970506
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.430509
		volcanoTemp     1656.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.167, 0.144, 0.118, 0.000)
		colorShelf     (0.171, 0.148, 0.135, 0.000)
		colorBeach     (0.201, 0.174, 0.160, 0.000)
		colorDesert    (0.218, 0.186, 0.156, 0.000)
		colorLowland   (0.239, 0.199, 0.177, 0.000)
		colorUpland    (0.265, 0.241, 0.215, 0.000)
		colorRock      (0.286, 0.263, 0.231, 0.000)
		colorSnow      (0.312, 0.280, 0.244, 1.000)
		BumpHeight      0.569109
		BumpOffset      0.113822
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.243716
		GasToDust   0.25
		Particles   1472
		GasBright   0.0865293
		DustBright  0.234957
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   35.7782
		Period          217.841
		Eccentricity    0.97676
		Inclination     165.244
		AscendingNode   -29.6169
		ArgOfPericenter -20.2279
		MeanAnomaly     -108.051
	}
}

Comet	"Beshqek C49"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            5.98459e-010
	Radius          11.4279
	InertiaMoment   0.398576

	Oblateness      0.00281525

	RotationPeriod  91.7408
	Obliquity       290.495
	EqAscendNode    87.3074

	AbsMagn         3.29605
	SlopeParam      3.47084
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.651 0.572 0.519)

	Surface
	{
		SurfStyle       0.640015
		OceanStyle      0.88528
		Randomize      (0.466, -0.250, -0.727)
		colorDistMagn   0.973775
		colorDistFreq   0.0689563
		detailScale     312.058
		colorConversion true
		snowLevel       2
		tropicLatitude  0.770962
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.346654
		terraceProb     0.303017
		erosion         0
		montesMagn      0.502896
		montesFreq      2.18583
		montesSpiky     0.944859
		montesFraction  0.422545
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.331864
		hillsFraction   0.517456
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262316
		craterFreq      0.214779
		craterDensity   1.05454
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.528254
		volcanoTemp     1384.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.254, 0.194, 0.145, 0.000)
		colorShelf     (0.260, 0.200, 0.166, 0.000)
		colorBeach     (0.306, 0.235, 0.197, 0.000)
		colorDesert    (0.332, 0.252, 0.192, 0.000)
		colorLowland   (0.364, 0.269, 0.218, 0.000)
		colorUpland    (0.403, 0.326, 0.265, 0.000)
		colorRock      (0.436, 0.355, 0.286, 0.000)
		colorSnow      (0.475, 0.378, 0.301, 1.000)
		BumpHeight      10.2851
		BumpOffset      2.05702
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.724908
		GasToDust   0.25
		Particles   2444
		GasBright   0.26452
		DustBright  0.541453
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   36.0732
		Period          220.541
		Eccentricity    0.96068
		Inclination     -160.775
		AscendingNode   -6.78361
		ArgOfPericenter -6.28037
		MeanAnomaly     -68.4956
	}
}

Comet	"Beshqek C50"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            1.8427e-017
	Radius          0.039158
	InertiaMoment   0.396237

	Oblateness      0.00394731

	RotationPeriod  88.1733
	Obliquity       243.701
	EqAscendNode    71.8848

	AbsMagn         11.0149
	SlopeParam      4.03882
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.542 0.538 0.535)

	Surface
	{
		SurfStyle       0.617618
		OceanStyle      0.310169
		Randomize      (-0.038, 0.916, 0.497)
		colorDistMagn   0.732599
		colorDistFreq   3.45922e-007
		detailScale     1.06928
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998735
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.628366
		terraceProb     0.4484
		erosion         0
		montesMagn      0.491863
		montesFreq      2.20857
		montesSpiky     0.876112
		montesFraction  0.468529
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.12193e-006
		hillsFraction   0.563815
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240795
		craterFreq      0.265602
		craterDensity   0.805687
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.504704
		volcanoTemp     1727.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.211, 0.183, 0.150, 0.000)
		colorShelf     (0.217, 0.188, 0.171, 0.000)
		colorBeach     (0.255, 0.221, 0.203, 0.000)
		colorDesert    (0.276, 0.237, 0.198, 0.000)
		colorLowland   (0.303, 0.253, 0.225, 0.000)
		colorUpland    (0.336, 0.307, 0.273, 0.000)
		colorRock      (0.363, 0.334, 0.294, 0.000)
		colorSnow      (0.395, 0.355, 0.310, 1.000)
		BumpHeight      0.0352422
		BumpOffset      0.00704845
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.189928
		DustBright  0.300531
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   33.5027
		Period          197.393
		Eccentricity    0.980303
		Inclination     150.303
		AscendingNode   168.456
		ArgOfPericenter 49.7774
		MeanAnomaly     -35.0348
	}
}

Comet	"Beshqek C51"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            1.4252e-013
	Radius          0.707801
	InertiaMoment   0.399074

	Oblateness      0.00328093

	RotationPeriod  84.962
	Obliquity       196.907
	EqAscendNode    56.4622

	AbsMagn         7.36305
	SlopeParam      4.61001
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.782 0.781 0.779)

	Surface
	{
		SurfStyle       0.547206
		OceanStyle      0.011596
		Randomize      (0.382, 0.380, 0.931)
		colorDistMagn   0.805119
		colorDistFreq   0.000343761
		detailScale     19.3277
		colorConversion true
		snowLevel       2
		tropicLatitude  0.230151
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.573356
		terraceProb     0.127677
		erosion         0
		montesMagn      0.530764
		montesFreq      2.77523
		montesSpiky     0.937159
		montesFraction  0.0999114
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00142731
		hillsFraction   0.717891
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230491
		craterFreq      0.223003
		craterDensity   0.913935
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.44398
		volcanoTemp     1282.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.305, 0.266, 0.218, 0.000)
		colorShelf     (0.313, 0.273, 0.249, 0.000)
		colorBeach     (0.367, 0.320, 0.296, 0.000)
		colorDesert    (0.399, 0.344, 0.288, 0.000)
		colorLowland   (0.438, 0.367, 0.327, 0.000)
		colorUpland    (0.485, 0.445, 0.397, 0.000)
		colorRock      (0.524, 0.484, 0.429, 0.000)
		colorSnow      (0.571, 0.515, 0.452, 1.000)
		BumpHeight      0.637021
		BumpOffset      0.127404
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.276542
		GasToDust   0.25
		Particles   1538
		GasBright   0.435108
		DustBright  0.539837
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   29.9508
		Period          166.849
		Eccentricity    0.969242
		Inclination     151.457
		AscendingNode   -17.3087
		ArgOfPericenter 168.35
		MeanAnomaly     -78.0124
	}
}

Comet	"Beshqek C52"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            1.10229e-009
	Radius          15.3001
	InertiaMoment   0.397583

	Oblateness      0.00457191

	RotationPeriod  82.0207
	Obliquity       150.112
	EqAscendNode    41.0396

	AbsMagn         2.85072
	SlopeParam      5.23711
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.547 0.540 0.537)

	Surface
	{
		SurfStyle       0.778395
		OceanStyle      0.251198
		Randomize      (0.600, -0.172, 0.228)
		colorDistMagn   0.201371
		colorDistFreq   0.0366404
		detailScale     417.794
		colorConversion true
		snowLevel       2
		tropicLatitude  0.528181
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.385019
		terraceProb     0.46187
		erosion         0
		montesMagn      0.37786
		montesFreq      2.29181
		montesSpiky     0.976087
		montesFraction  0.307594
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.68416
		hillsFraction   0.757406
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221244
		craterFreq      0.189246
		craterDensity   0.959146
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.454222
		volcanoTemp     1371.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.213, 0.184, 0.150, 0.000)
		colorShelf     (0.219, 0.189, 0.172, 0.000)
		colorBeach     (0.257, 0.221, 0.204, 0.000)
		colorDesert    (0.279, 0.238, 0.199, 0.000)
		colorLowland   (0.306, 0.254, 0.226, 0.000)
		colorUpland    (0.339, 0.308, 0.274, 0.000)
		colorRock      (0.366, 0.335, 0.296, 0.000)
		colorSnow      (0.399, 0.356, 0.312, 1.000)
		BumpHeight      13.7701
		BumpOffset      2.75401
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.757734
		GasToDust   0.25
		Particles   2510
		GasBright   0.00351824
		DustBright  0.655914
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   29.2391
		Period          160.938
		Eccentricity    0.969403
		Inclination     -12.2159
		AscendingNode   -90.9558
		ArgOfPericenter -148.402
		MeanAnomaly     -106.607
	}
}

Comet	"Beshqek C53"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            3.39402e-017
	Radius          0.0438381
	InertiaMoment   0.39952

	Oblateness      0.00376455

	RotationPeriod  79.2906
	Obliquity       103.318
	EqAscendNode    25.617

	AbsMagn         10.7445
	SlopeParam      6.02184
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.733 0.731 0.727)

	Surface
	{
		SurfStyle       0.799431
		OceanStyle      0.149088
		Randomize      (-0.814, 0.803, -0.963)
		colorDistMagn   0.490234
		colorDistFreq   1.43106e-006
		detailScale     1.19707
		colorConversion true
		snowLevel       2
		tropicLatitude  0.763577
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.761394
		terraceProb     0.166127
		erosion         0
		montesMagn      0.382444
		montesFreq      3.24536
		montesSpiky     0.917966
		montesFraction  0.467639
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.65159e-006
		hillsFraction   0.384549
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235493
		craterFreq      0.239928
		craterDensity   0.847782
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.54311
		volcanoTemp     1389.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.286, 0.248, 0.203, 0.000)
		colorShelf     (0.293, 0.256, 0.233, 0.000)
		colorBeach     (0.344, 0.300, 0.276, 0.000)
		colorDesert    (0.374, 0.322, 0.269, 0.000)
		colorLowland   (0.410, 0.343, 0.305, 0.000)
		colorUpland    (0.454, 0.417, 0.371, 0.000)
		colorRock      (0.491, 0.453, 0.400, 0.000)
		colorSnow      (0.535, 0.482, 0.421, 1.000)
		BumpHeight      0.0394543
		BumpOffset      0.00789087
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.0221417
		DustBright  0.321777
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   31.6749
		Period          181.462
		Eccentricity    0.977723
		Inclination     138.203
		AscendingNode   -136.955
		ArgOfPericenter 48.515
		MeanAnomaly     60.9668
	}
}

Comet	"Beshqek C54"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            2.62503e-013
	Radius          0.947479
	InertiaMoment   0.398295

	Oblateness      0.00522356

	RotationPeriod  76.7297
	Obliquity       56.5238
	EqAscendNode    10.1945

	AbsMagn         7.15076
	SlopeParam      7.41314
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.475 0.470 0.466)

	Surface
	{
		SurfStyle       0.17151
		OceanStyle      0.775448
		Randomize      (0.848, 0.633, -0.039)
		colorDistMagn   0.81244
		colorDistFreq   0.000161782
		detailScale     25.8725
		colorConversion true
		snowLevel       2
		tropicLatitude  0.162254
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.493818
		terraceProb     0.189246
		erosion         0
		montesMagn      0.518135
		montesFreq      3.86958
		montesSpiky     0.901404
		montesFraction  0.822704
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00204009
		hillsFraction   0.666003
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218537
		craterFreq      0.229388
		craterDensity   0.700887
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.487089
		volcanoTemp     1712.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.190, 0.188, 0.186, 0.000)
		colorShelf     (0.202, 0.200, 0.198, 0.000)
		colorBeach     (0.214, 0.212, 0.210, 0.000)
		colorDesert    (0.226, 0.223, 0.221, 0.000)
		colorLowland   (0.237, 0.235, 0.233, 0.000)
		colorUpland    (0.249, 0.247, 0.245, 0.000)
		colorRock      (0.261, 0.259, 0.256, 0.000)
		colorSnow      (0.273, 0.270, 0.268, 1.000)
		BumpHeight      0.852731
		BumpOffset      0.170546
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.309368
		GasToDust   0.25
		Particles   1604
		GasBright   0.102247
		DustBright  0.726159
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   43.269
		Period          289.719
		Eccentricity    0.98882
		Inclination     131.57
		AscendingNode   5.88498
		ArgOfPericenter 175.987
		MeanAnomaly     -105.052
	}
}

Comet	"Beshqek C55"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            2.03027e-009
	Radius          17.1313
	InertiaMoment   0.399943

	Oblateness      0.00428322

	RotationPeriod  74.3065
	Obliquity       9.72951
	EqAscendNode    354.772

	AbsMagn         2.3304
	SlopeParam      2.50102
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.731 0.692 0.634)

	Surface
	{
		SurfStyle       0.125358
		OceanStyle      0.994986
		Randomize      (-0.791, -0.175, -0.530)
		colorDistMagn   0.482566
		colorDistFreq   0.186946
		detailScale     467.8
		colorConversion true
		snowLevel       2
		tropicLatitude  0.451391
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.506599
		terraceProb     0.112655
		erosion         0
		montesMagn      0.286143
		montesFreq      2.77256
		montesSpiky     0.909847
		montesFraction  0.67237
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.625975
		hillsFraction   0.691031
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219252
		craterFreq      0.238775
		craterDensity   0.841176
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.544159
		volcanoTemp     1669.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.292, 0.277, 0.254, 0.000)
		colorShelf     (0.311, 0.294, 0.270, 0.000)
		colorBeach     (0.329, 0.311, 0.285, 0.000)
		colorDesert    (0.347, 0.329, 0.301, 0.000)
		colorLowland   (0.365, 0.346, 0.317, 0.000)
		colorUpland    (0.384, 0.363, 0.333, 0.000)
		colorRock      (0.402, 0.380, 0.349, 0.000)
		colorSnow      (0.420, 0.398, 0.365, 1.000)
		BumpHeight      15.4182
		BumpOffset      3.08364
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.79056
		GasToDust   0.25
		Particles   2576
		GasBright   0.0935879
		DustBright  0.419304
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   27.1581
		Period          144.066
		Eccentricity    0.985508
		Inclination     162.832
		AscendingNode   -171.821
		ArgOfPericenter -33.5483
		MeanAnomaly     157.344
	}
}

Comet	"Beshqek C56"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            6.25137e-017
	Radius          0.0586746
	InertiaMoment   0.398837

	Oblateness      0.00592855

	RotationPeriod  71.997
	Obliquity       322.935
	EqAscendNode    339.349

	AbsMagn         10.4861
	SlopeParam      3.16883
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.579 0.575 0.574)

	Surface
	{
		SurfStyle       0.768428
		OceanStyle      0.0944725
		Randomize      (-0.804, 0.988, -0.834)
		colorDistMagn   0.0788491
		colorDistFreq   2.94522e-006
		detailScale     1.60221
		colorConversion true
		snowLevel       2
		tropicLatitude  0.312101
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.70427
		terraceProb     0.3341
		erosion         0
		montesMagn      0.506081
		montesFreq      3.06141
		montesSpiky     0.987945
		montesFraction  0.943723
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.21868e-005
		hillsFraction   0.574666
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.271888
		craterFreq      0.237474
		craterDensity   0.819432
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.5933
		volcanoTemp     1768.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.226, 0.196, 0.161, 0.000)
		colorShelf     (0.232, 0.201, 0.184, 0.000)
		colorBeach     (0.272, 0.236, 0.218, 0.000)
		colorDesert    (0.295, 0.253, 0.212, 0.000)
		colorLowland   (0.324, 0.270, 0.241, 0.000)
		colorUpland    (0.359, 0.328, 0.293, 0.000)
		colorRock      (0.388, 0.357, 0.316, 0.000)
		colorSnow      (0.423, 0.380, 0.333, 1.000)
		BumpHeight      0.0528071
		BumpOffset      0.0105614
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.240883
		DustBright  0.756495
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   37.4738
		Period          233.509
		Eccentricity    0.978277
		Inclination     124.846
		AscendingNode   177.359
		ArgOfPericenter 162.781
		MeanAnomaly     179.19
	}
}

Comet	"Beshqek C57"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            4.83499e-013
	Radius          1.06103
	InertiaMoment   0.397081

	Oblateness      0.00479336

	RotationPeriod  69.7824
	Obliquity       276.141
	EqAscendNode    323.927

	AbsMagn         6.93605
	SlopeParam      3.7534
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.463 0.458 0.456)

	Surface
	{
		SurfStyle       0.586303
		OceanStyle      0.842288
		Randomize      (-0.627, -0.508, -0.103)
		colorDistMagn   0.116801
		colorDistFreq   0.000232674
		detailScale     28.9732
		colorConversion true
		snowLevel       2
		tropicLatitude  0.899161
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.277886
		terraceProb     0.218064
		erosion         0
		montesMagn      0.513847
		montesFreq      3.06607
		montesSpiky     0.844956
		montesFraction  0.59669
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00322509
		hillsFraction   0.492153
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239095
		craterFreq      0.216145
		craterDensity   0.959515
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.416018
		volcanoTemp     1630.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.181, 0.156, 0.128, 0.000)
		colorShelf     (0.185, 0.160, 0.146, 0.000)
		colorBeach     (0.218, 0.188, 0.173, 0.000)
		colorDesert    (0.236, 0.201, 0.169, 0.000)
		colorLowland   (0.259, 0.215, 0.191, 0.000)
		colorUpland    (0.287, 0.261, 0.232, 0.000)
		colorRock      (0.310, 0.284, 0.251, 0.000)
		colorSnow      (0.338, 0.302, 0.264, 1.000)
		BumpHeight      0.954928
		BumpOffset      0.190986
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.342194
		GasToDust   0.25
		Particles   1671
		GasBright   0.204942
		DustBright  0.476923
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   17.6475
		Period          75.4633
		Eccentricity    0.975067
		Inclination     21.4874
		AscendingNode   21.8296
		ArgOfPericenter 131.022
		MeanAnomaly     -110.124
	}
}

Comet	"Beshqek C58"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            3.73951e-009
	Radius          22.9263
	InertiaMoment   0.399304

	Oblateness      0.0067089

	RotationPeriod  67.6473
	Obliquity       229.347
	EqAscendNode    308.504

	AbsMagn         1.6912
	SlopeParam      4.31722
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.535 0.448 0.352)

	Surface
	{
		SurfStyle       0.591591
		OceanStyle      0.309441
		Randomize      (0.882, -0.906, -0.824)
		colorDistMagn   0.0821803
		colorDistFreq   0.365545
		detailScale     626.041
		colorConversion true
		snowLevel       2
		tropicLatitude  0.956953
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.518193
		terraceProb     0.308629
		erosion         0
		montesMagn      0.524464
		montesFreq      3.30912
		montesSpiky     0.969523
		montesFraction  0.596218
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.33653
		hillsFraction   0.679706
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232431
		craterFreq      0.221399
		craterDensity   0.881333
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.546944
		volcanoTemp     1747.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.209, 0.152, 0.099, 0.000)
		colorShelf     (0.214, 0.157, 0.113, 0.000)
		colorBeach     (0.252, 0.184, 0.134, 0.000)
		colorDesert    (0.273, 0.197, 0.130, 0.000)
		colorLowland   (0.300, 0.211, 0.148, 0.000)
		colorUpland    (0.332, 0.256, 0.180, 0.000)
		colorRock      (0.359, 0.278, 0.194, 0.000)
		colorSnow      (0.391, 0.296, 0.204, 1.000)
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
		MaxLength   0.823386
		GasToDust   0.25
		Particles   2643
		GasBright   0.131742
		DustBright  0.234609
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   41.3747
		Period          270.904
		Eccentricity    0.971102
		Inclination     57.672
		AscendingNode   -4.99785
		ArgOfPericenter -88.3944
		MeanAnomaly     -33.3288
	}
}

Comet	"Beshqek C59"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            1.15143e-016
	Radius          0.0657146
	InertiaMoment   0.397976

	Oblateness      0.00543271

	RotationPeriod  65.5792
	Obliquity       182.552
	EqAscendNode    293.082

	AbsMagn         10.2377
	SlopeParam      4.90801
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.504 0.501 0.498)

	Surface
	{
		SurfStyle       0.179075
		OceanStyle      0.0603135
		Randomize      (-0.825, 0.171, -0.868)
		colorDistMagn   0.499557
		colorDistFreq   1.66254e-006
		detailScale     1.79445
		colorConversion true
		snowLevel       2
		tropicLatitude  0.813223
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.516044
		terraceProb     0.234605
		erosion         0
		montesMagn      0.529757
		montesFreq      2.89518
		montesSpiky     0.99707
		montesFraction  0.601805
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.63302e-006
		hillsFraction   0.699279
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259769
		craterFreq      0.237965
		craterDensity   0.908512
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.493618
		volcanoTemp     1485.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.202, 0.201, 0.199, 0.000)
		colorShelf     (0.214, 0.213, 0.212, 0.000)
		colorBeach     (0.227, 0.226, 0.224, 0.000)
		colorDesert    (0.240, 0.238, 0.237, 0.000)
		colorLowland   (0.252, 0.251, 0.249, 0.000)
		colorUpland    (0.265, 0.263, 0.262, 0.000)
		colorRock      (0.277, 0.276, 0.274, 0.000)
		colorSnow      (0.290, 0.288, 0.286, 1.000)
		BumpHeight      0.0591431
		BumpOffset      0.0118286
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.356205
		DustBright  0.494633
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   47.4562
		Period          332.776
		Eccentricity    0.971461
		Inclination     -128.083
		AscendingNode   12.3377
		ArgOfPericenter -80.3352
		MeanAnomaly     42.568
	}
}

Comet	"Beshqek C60"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            8.90543e-013
	Radius          1.41979
	InertiaMoment   0.399736

	Oblateness      0.00758942

	RotationPeriod  63.5676
	Obliquity       135.758
	EqAscendNode    277.659

	AbsMagn         6.71823
	SlopeParam      5.59324
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.768 0.766 0.765)

	Surface
	{
		SurfStyle       0.197717
		OceanStyle      0.279017
		Randomize      (-0.494, -0.257, -0.780)
		colorDistMagn   0.620595
		colorDistFreq   0.000717029
		detailScale     38.7696
		colorConversion true
		snowLevel       2
		tropicLatitude  0.765587
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.304241
		terraceProb     0.360804
		erosion         0
		montesMagn      0.508377
		montesFreq      3.59032
		montesSpiky     0.809967
		montesFraction  0.423626
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00526177
		hillsFraction   0.781512
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221346
		craterFreq      0.250888
		craterDensity   0.869879
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.496621
		volcanoTemp     1543.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.307, 0.306, 0.306, 0.000)
		colorShelf     (0.326, 0.326, 0.325, 0.000)
		colorBeach     (0.346, 0.345, 0.344, 0.000)
		colorDesert    (0.365, 0.364, 0.363, 0.000)
		colorLowland   (0.384, 0.383, 0.382, 0.000)
		colorUpland    (0.403, 0.402, 0.401, 0.000)
		colorRock      (0.422, 0.421, 0.420, 0.000)
		colorSnow      (0.442, 0.441, 0.440, 1.000)
		BumpHeight      1.27781
		BumpOffset      0.255561
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.37502
		GasToDust   0.25
		Particles   1737
		GasBright   0.255723
		DustBright  0.279602
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   24.9307
		Period          126.711
		Eccentricity    0.961921
		Inclination     67.0649
		AscendingNode   -55.4758
		ArgOfPericenter -124.925
		MeanAnomaly     40.5719
	}
}

Comet	"Beshqek C61"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            6.88771e-009
	Radius          25.6798
	InertiaMoment   0.398583

	Oblateness      0.00615572

	RotationPeriod  61.6035
	Obliquity       88.9637
	EqAscendNode    262.236

	AbsMagn         0.831996
	SlopeParam      6.55448
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.753 0.750 0.746)

	Surface
	{
		SurfStyle       0.600884
		OceanStyle      0.486775
		Randomize      (-0.695, 0.043, 0.281)
		colorDistMagn   0.944305
		colorDistFreq   0.324186
		detailScale     701.23
		colorConversion true
		snowLevel       2
		tropicLatitude  0.272898
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.441942
		terraceProb     0.172777
		erosion         0
		montesMagn      0.514373
		montesFreq      2.06769
		montesSpiky     0.971681
		montesFraction  0.527213
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.37972
		hillsFraction   0.790832
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24105
		craterFreq      0.236324
		craterDensity   0.850768
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.527464
		volcanoTemp     1514.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.294, 0.255, 0.209, 0.000)
		colorShelf     (0.301, 0.262, 0.239, 0.000)
		colorBeach     (0.354, 0.307, 0.284, 0.000)
		colorDesert    (0.384, 0.330, 0.276, 0.000)
		colorLowland   (0.422, 0.352, 0.313, 0.000)
		colorUpland    (0.467, 0.427, 0.381, 0.000)
		colorRock      (0.505, 0.465, 0.410, 0.000)
		colorSnow      (0.550, 0.495, 0.433, 1.000)
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
		MaxLength   0.856212
		GasToDust   0.25
		Particles   2709
		GasBright   0.00807643
		DustBright  0.211735
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   35.8847
		Period          218.815
		Eccentricity    0.970632
		Inclination     -75.1998
		AscendingNode   179.91
		ArgOfPericenter 72.848
		MeanAnomaly     72.5612
	}
}

Comet	"Beshqek C62"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            2.12077e-016
	Radius          0.0879255
	InertiaMoment   0.396267

	Oblateness      0.00847662

	RotationPeriod  59.6791
	Obliquity       42.1694
	EqAscendNode    246.814

	AbsMagn         9.99767
	SlopeParam      2.09146
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.446 0.442 0.439)

	Surface
	{
		SurfStyle       0.241074
		OceanStyle      0.737797
		Randomize      (0.745, -0.555, -0.837)
		colorDistMagn   0.415247
		colorDistFreq   3.30703e-006
		detailScale     2.40095
		colorConversion true
		snowLevel       2
		tropicLatitude  0.870577
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.454749
		terraceProb     0.166542
		erosion         0
		montesMagn      0.592758
		montesFreq      3.86736
		montesSpiky     0.851296
		montesFraction  0.645685
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.82939e-005
		hillsFraction   0.780294
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.270852
		craterFreq      0.154819
		craterDensity   1.02088
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.520251
		volcanoTemp     1403.25
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.178, 0.177, 0.176, 0.000)
		colorShelf     (0.189, 0.188, 0.187, 0.000)
		colorBeach     (0.201, 0.199, 0.198, 0.000)
		colorDesert    (0.212, 0.210, 0.208, 0.000)
		colorLowland   (0.223, 0.221, 0.219, 0.000)
		colorUpland    (0.234, 0.232, 0.230, 0.000)
		colorRock      (0.245, 0.243, 0.241, 0.000)
		colorSnow      (0.256, 0.254, 0.252, 1.000)
		BumpHeight      0.0791329
		BumpOffset      0.0158266
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.0674631
		DustBright  0.636835
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   29.059
		Period          159.453
		Eccentricity    0.973956
		Inclination     39.5752
		AscendingNode   79.3218
		ArgOfPericenter -85.5004
		MeanAnomaly     -169.158
	}
}

Comet	"Beshqek C63"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            1.64027e-012
	Radius          1.59045
	InertiaMoment   0.39908

	Oblateness      0.00699155

	RotationPeriod  57.7875
	Obliquity       355.375
	EqAscendNode    231.391

	AbsMagn         6.49653
	SlopeParam      2.84647
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.643 0.639 0.638)

	Surface
	{
		SurfStyle       0.282884
		OceanStyle      0.804236
		Randomize      (0.190, -0.421, -0.830)
		colorDistMagn   0.737708
		colorDistFreq   0.00105338
		detailScale     43.4298
		colorConversion true
		snowLevel       2
		tropicLatitude  0.449637
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.597383
		terraceProb     0.103208
		erosion         0
		montesMagn      0.682785
		montesFreq      2.74269
		montesSpiky     0.924312
		montesFraction  0.694887
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00578971
		hillsFraction   0.6915
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248794
		craterFreq      0.1917
		craterDensity   0.883601
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.525169
		volcanoTemp     1207.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.257, 0.256, 0.255, 0.000)
		colorShelf     (0.273, 0.272, 0.271, 0.000)
		colorBeach     (0.289, 0.288, 0.287, 0.000)
		colorDesert    (0.305, 0.304, 0.303, 0.000)
		colorLowland   (0.321, 0.320, 0.319, 0.000)
		colorUpland    (0.338, 0.336, 0.335, 0.000)
		colorRock      (0.354, 0.351, 0.351, 0.000)
		colorSnow      (0.370, 0.367, 0.367, 1.000)
		BumpHeight      1.4314
		BumpOffset      0.286281
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.407846
		GasToDust   0.25
		Particles   1803
		GasBright   0.0601967
		DustBright  0.328588
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   15.158
		Period          60.0722
		Eccentricity    0.962942
		Inclination     -22.4218
		AscendingNode   -23.6125
		ArgOfPericenter -128.977
		MeanAnomaly     -69.4751
	}
}

Comet	"Beshqek C64"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            1.26863e-008
	Radius          34.3566
	InertiaMoment   0.397594

	Oblateness      0.00967609

	RotationPeriod  55.9226
	Obliquity       308.581
	EqAscendNode    215.969

	AbsMagn         -0.601978
	SlopeParam      3.46284
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.759 0.758 0.756)

	Surface
	{
		SurfStyle       0.521632
		OceanStyle      0.86661
		Randomize      (0.222, -0.266, -0.035)
		colorDistMagn   0.387456
		colorDistFreq   0.7805
		detailScale     938.164
		colorConversion true
		snowLevel       2
		tropicLatitude  0.994719
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.595411
		terraceProb     0.497711
		erosion         0
		montesMagn      0.513667
		montesFreq      3.02778
		montesSpiky     0.819827
		montesFraction  0.824846
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.7642
		hillsFraction   0.404648
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260978
		craterFreq      0.230574
		craterDensity   0.765015
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.394287
		volcanoTemp     1377.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.296, 0.258, 0.212, 0.000)
		colorShelf     (0.304, 0.265, 0.242, 0.000)
		colorBeach     (0.357, 0.311, 0.287, 0.000)
		colorDesert    (0.387, 0.334, 0.280, 0.000)
		colorLowland   (0.425, 0.356, 0.317, 0.000)
		colorUpland    (0.471, 0.432, 0.385, 0.000)
		colorRock      (0.509, 0.470, 0.416, 0.000)
		colorSnow      (0.554, 0.500, 0.438, 1.000)
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
		MaxLength   0.889038
		GasToDust   0.25
		Particles   2775
		GasBright   0.186774
		DustBright  0.686497
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   39.0529
		Period          248.423
		Eccentricity    0.979773
		Inclination     -123.635
		AscendingNode   -133.504
		ArgOfPericenter 178.085
		MeanAnomaly     -169.157
	}
}

Comet	"Beshqek C65"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            3.90621e-016
	Radius          0.0985017
	InertiaMoment   0.399526

	Oblateness      0.00797714

	RotationPeriod  54.0787
	Obliquity       261.787
	EqAscendNode    200.546

	AbsMagn         9.76461
	SlopeParam      4.0311
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.729 0.726 0.725)

	Surface
	{
		SurfStyle       0.335045
		OceanStyle      0.443561
		Randomize      (0.383, -0.910, 0.774)
		colorDistMagn   0.336797
		colorDistFreq   4.49177e-006
		detailScale     2.68975
		colorConversion true
		snowLevel       2
		tropicLatitude  0.966632
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.26243
		terraceProb     0.405799
		erosion         0
		montesMagn      0.479087
		montesFreq      2.53625
		montesSpiky     0.8391
		montesFraction  0.276857
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.19884e-005
		hillsFraction   0.742271
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230943
		craterFreq      0.165288
		craterDensity   0.872678
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.553559
		volcanoTemp     1301.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.292, 0.291, 0.290, 0.000)
		colorShelf     (0.310, 0.309, 0.308, 0.000)
		colorBeach     (0.328, 0.327, 0.326, 0.000)
		colorDesert    (0.346, 0.345, 0.345, 0.000)
		colorLowland   (0.365, 0.363, 0.363, 0.000)
		colorUpland    (0.383, 0.381, 0.381, 0.000)
		colorRock      (0.401, 0.400, 0.399, 0.000)
		colorSnow      (0.419, 0.418, 0.417, 1.000)
		BumpHeight      0.0886515
		BumpOffset      0.0177303
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.152225
		DustBright  0.405532
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   28.4338
		Period          154.335
		Eccentricity    0.97851
		Inclination     -129.221
		AscendingNode   -102.491
		ArgOfPericenter 94.0763
		MeanAnomaly     13.5469
	}
}

Comet	"Beshqek C66"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            3.02117e-012
	Radius          2.12769
	InertiaMoment   0.398303

	Oblateness      0.0110841

	RotationPeriod  52.2506
	Obliquity       214.992
	EqAscendNode    185.123

	AbsMagn         6.27011
	SlopeParam      4.60193
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.665 0.607 0.564)

	Surface
	{
		SurfStyle       0.423973
		OceanStyle      0.528669
		Randomize      (0.963, 0.545, 0.293)
		colorDistMagn   0.847595
		colorDistFreq   0.000576
		detailScale     58.1003
		colorConversion true
		snowLevel       2
		tropicLatitude  0.535434
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.489544
		terraceProb     0.180259
		erosion         0
		montesMagn      0.404217
		montesFreq      3.31711
		montesSpiky     0.955167
		montesFraction  0.354399
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00996404
		hillsFraction   0.847451
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246615
		craterFreq      0.225095
		craterDensity   0.981124
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.512794
		volcanoTemp     1648.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.266, 0.243, 0.226, 0.000)
		colorShelf     (0.282, 0.258, 0.240, 0.000)
		colorBeach     (0.299, 0.273, 0.254, 0.000)
		colorDesert    (0.316, 0.288, 0.268, 0.000)
		colorLowland   (0.332, 0.303, 0.282, 0.000)
		colorUpland    (0.349, 0.319, 0.296, 0.000)
		colorRock      (0.366, 0.334, 0.310, 0.000)
		colorSnow      (0.382, 0.349, 0.324, 1.000)
		BumpHeight      1.91493
		BumpOffset      0.382985
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.440672
		GasToDust   0.25
		Particles   1870
		GasBright   0.0804175
		DustBright  0.161827
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   27.7548
		Period          148.84
		Eccentricity    0.954925
		Inclination     -39.2134
		AscendingNode   -54.6345
		ArgOfPericenter -158.363
		MeanAnomaly     -13.5128
	}
}

Comet	"Beshqek C67"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            2.33665e-008
	Radius          38.4915
	InertiaMoment   0.399949

	Oblateness      0.00916377

	RotationPeriod  50.4335
	Obliquity       168.198
	EqAscendNode    169.701

	AbsMagn         16.9521
	SlopeParam      5.22778
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.665 0.614 0.581)

	Surface
	{
		SurfStyle       0.463999
		OceanStyle      0.503257
		Randomize      (-0.875, -0.842, -0.568)
		colorDistMagn   0.851378
		colorDistFreq   0.800979
		detailScale     1051.07
		colorConversion true
		snowLevel       2
		tropicLatitude  0.68874
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.548138
		terraceProb     0.347696
		erosion         0
		montesMagn      0.523253
		montesFreq      1.87321
		montesSpiky     0.768961
		montesFraction  0.499698
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.33228
		hillsFraction   0.638544
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.195057
		craterFreq      0.249187
		craterDensity   0.901776
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.652864
		volcanoTemp     1708.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.266, 0.246, 0.232, 0.000)
		colorShelf     (0.283, 0.261, 0.247, 0.000)
		colorBeach     (0.299, 0.276, 0.262, 0.000)
		colorDesert    (0.316, 0.292, 0.276, 0.000)
		colorLowland   (0.333, 0.307, 0.291, 0.000)
		colorUpland    (0.349, 0.322, 0.305, 0.000)
		colorRock      (0.366, 0.338, 0.320, 0.000)
		colorSnow      (0.382, 0.353, 0.334, 1.000)
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
		MaxLength   0.921864
		GasToDust   0.25
		Particles   2842
		GasBright   0.284162
		DustBright  0.442569
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   37.9621
		Period          238.088
		Eccentricity    0.985263
		Inclination     146.849
		AscendingNode   -32.3203
		ArgOfPericenter -116.715
		MeanAnomaly     -29.4759
	}
}

Comet	"Beshqek C68"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            7.19475e-016
	Radius          0.131769
	InertiaMoment   0.398843

	Oblateness      0.0127926

	RotationPeriod  48.6225
	Obliquity       121.404
	EqAscendNode    154.278

	AbsMagn         9.5374
	SlopeParam      6.00902
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.693 0.557 0.457)

	Surface
	{
		SurfStyle       0.880392
		OceanStyle      0.843553
		Randomize      (-0.126, 0.663, -0.648)
		colorDistMagn   0.88492
		colorDistFreq   1.0446e-005
		detailScale     3.59816
		colorConversion true
		snowLevel       2
		tropicLatitude  0.630151
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.578838
		terraceProb     0.337893
		erosion         0
		montesMagn      0.568833
		montesFreq      2.20762
		montesSpiky     0.930755
		montesFraction  0.64146
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.39009e-005
		hillsFraction   0.614217
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259228
		craterFreq      0.24748
		craterDensity   0.845997
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.531673
		volcanoTemp     1579.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.236, 0.195, 0.183, 0.050)
		colorShelf     (0.277, 0.229, 0.210, 0.040)
		colorBeach     (0.319, 0.262, 0.237, 0.030)
		colorDesert    (0.361, 0.295, 0.269, 0.020)
		colorLowland   (0.402, 0.329, 0.297, 0.030)
		colorUpland    (0.444, 0.362, 0.324, 0.050)
		colorRock      (0.485, 0.396, 0.361, 0.020)
		colorSnow      (0.485, 0.396, 0.361, 1.000)
		BumpHeight      0.118592
		BumpOffset      0.0237183
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.185072
		DustBright  0.226145
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   18.7385
		Period          82.5687
		Eccentricity    0.951326
		Inclination     28.46
		AscendingNode   38.4861
		ArgOfPericenter -168.233
		MeanAnomaly     177.878
	}
}

Comet	"Beshqek C69"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            5.56462e-012
	Radius          2.38387
	InertiaMoment   0.397096

	Oblateness      0.0104965

	RotationPeriod  46.8131
	Obliquity       74.6093
	EqAscendNode    138.856

	AbsMagn         6.03801
	SlopeParam      7.3805
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.631 0.626 0.622)

	Surface
	{
		SurfStyle       0.0397711
		OceanStyle      0.158929
		Randomize      (0.548, 0.215, -0.336)
		colorDistMagn   0.803139
		colorDistFreq   0.00160178
		detailScale     65.0954
		colorConversion true
		snowLevel       2
		tropicLatitude  0.803048
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.46046
		terraceProb     0.471988
		erosion         0
		montesMagn      0.689546
		montesFreq      2.31988
		montesSpiky     0.904409
		montesFraction  0.513569
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00829564
		hillsFraction   0.776673
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.199567
		craterFreq      0.196348
		craterDensity   0.942361
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.488192
		volcanoTemp     1330.25
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.252, 0.251, 0.249, 0.000)
		colorShelf     (0.268, 0.266, 0.264, 0.000)
		colorBeach     (0.284, 0.282, 0.280, 0.000)
		colorDesert    (0.300, 0.298, 0.295, 0.000)
		colorLowland   (0.315, 0.313, 0.311, 0.000)
		colorUpland    (0.331, 0.329, 0.327, 0.000)
		colorRock      (0.347, 0.345, 0.342, 0.000)
		colorSnow      (0.363, 0.360, 0.358, 1.000)
		BumpHeight      2.14548
		BumpOffset      0.429096
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.473498
		GasToDust   0.25
		Particles   1936
		GasBright   0.00815502
		DustBright  0.887549
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   36.6559
		Period          225.906
		Eccentricity    0.977717
		Inclination     31.4758
		AscendingNode   137.233
		ArgOfPericenter 105.767
		MeanAnomaly     -39.947
	}
}

Comet	"Beshqek C70"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            4.30383e-008
	Radius          51.4893
	InertiaMoment   0.39931

	Oblateness      0.0149221

	RotationPeriod  45.0007
	Obliquity       27.8151
	EqAscendNode    123.433

	AbsMagn         15.3311
	SlopeParam      2.49078
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.410 0.406 0.404)

	Surface
	{
		SurfStyle       0.508206
		OceanStyle      0.98687
		Randomize      (-0.065, -0.146, -0.463)
		colorDistMagn   0.754678
		colorDistFreq   1.23507
		detailScale     1406
		colorConversion true
		snowLevel       2
		tropicLatitude  0.383716
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.57113
		terraceProb     0.39313
		erosion         0
		montesMagn      0.463113
		montesFreq      3.14412
		montesSpiky     0.9132
		montesFraction  0.869778
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.7284
		hillsFraction   0.746565
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234851
		craterFreq      0.233819
		craterDensity   0.88135
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.503849
		volcanoTemp     1663.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.160, 0.138, 0.113, 0.000)
		colorShelf     (0.164, 0.142, 0.129, 0.000)
		colorBeach     (0.193, 0.166, 0.153, 0.000)
		colorDesert    (0.209, 0.179, 0.149, 0.000)
		colorLowland   (0.230, 0.191, 0.170, 0.000)
		colorUpland    (0.254, 0.231, 0.206, 0.000)
		colorRock      (0.275, 0.252, 0.222, 0.000)
		colorSnow      (0.299, 0.268, 0.234, 1.000)
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
		MaxLength   0.95469
		GasToDust   0.25
		Particles   2908
		GasBright   0.0395399
		DustBright  0.540651
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   23.0406
		Period          112.578
		Eccentricity    0.964692
		Inclination     39.8517
		AscendingNode   -144.837
		ArgOfPericenter 171.589
		MeanAnomaly     -86.5472
	}
}

Comet	"Beshqek C71"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            1.32518e-015
	Radius          0.147637
	InertiaMoment   0.397984

	Oblateness      0.0123466

	RotationPeriod  43.1806
	Obliquity       341.021
	EqAscendNode    108.01

	AbsMagn         9.31505
	SlopeParam      3.16042
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.679 0.677 0.673)

	Surface
	{
		SurfStyle       0.609362
		OceanStyle      0.124037
		Randomize      (-0.828, 0.368, 0.481)
		colorDistMagn   0.365149
		colorDistFreq   1.39467e-005
		detailScale     4.03148
		colorConversion true
		snowLevel       2
		tropicLatitude  0.937763
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.497129
		terraceProb     0.188461
		erosion         0
		montesMagn      0.57582
		montesFreq      3.22286
		montesSpiky     0.862988
		montesFraction  0.583442
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.40698e-005
		hillsFraction   0.739993
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.201172
		craterFreq      0.178684
		craterDensity   0.964062
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.564039
		volcanoTemp     1464.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.265, 0.230, 0.188, 0.000)
		colorShelf     (0.272, 0.237, 0.215, 0.000)
		colorBeach     (0.319, 0.277, 0.256, 0.000)
		colorDesert    (0.346, 0.298, 0.249, 0.000)
		colorLowland   (0.380, 0.318, 0.283, 0.000)
		colorUpland    (0.421, 0.386, 0.343, 0.000)
		colorRock      (0.455, 0.420, 0.370, 0.000)
		colorSnow      (0.496, 0.447, 0.390, 1.000)
		BumpHeight      0.132873
		BumpOffset      0.0265747
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.0251315
		GasToDust   0.25
		Particles   1030
		GasBright   0.0336656
		DustBright  0.231011
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   38.0306
		Period          238.733
		Eccentricity    0.989876
		Inclination     -62.5763
		AscendingNode   72.1989
		ArgOfPericenter -98.5629
		MeanAnomaly     40.8206
	}
}

Comet	"Beshqek C72"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            1.02493e-011
	Radius          3.18879
	InertiaMoment   0.399741

	Oblateness      0.0176581

	RotationPeriod  41.3482
	Obliquity       294.226
	EqAscendNode    92.5878

	AbsMagn         5.7991
	SlopeParam      3.74562
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.602 0.599 0.597)

	Surface
	{
		SurfStyle       0.439458
		OceanStyle      0.88952
		Randomize      (-0.995, 0.422, 0.578)
		colorDistMagn   0.50417
		colorDistFreq   0.00150774
		detailScale     87.0752
		colorConversion true
		snowLevel       2
		tropicLatitude  0.902269
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.515494
		terraceProb     0.211976
		erosion         0
		montesMagn      0.618859
		montesFreq      2.38234
		montesSpiky     0.980969
		montesFraction  0.603238
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0332832
		hillsFraction   0.667883
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213332
		craterFreq      0.155233
		craterDensity   1.01389
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.510483
		volcanoTemp     1049.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.241, 0.240, 0.239, 0.000)
		colorShelf     (0.256, 0.255, 0.254, 0.000)
		colorBeach     (0.271, 0.270, 0.268, 0.000)
		colorDesert    (0.286, 0.285, 0.283, 0.000)
		colorLowland   (0.301, 0.300, 0.298, 0.000)
		colorUpland    (0.316, 0.314, 0.313, 0.000)
		colorRock      (0.331, 0.329, 0.328, 0.000)
		colorSnow      (0.346, 0.344, 0.343, 1.000)
		BumpHeight      2.86991
		BumpOffset      0.573982
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.506323
		GasToDust   0.25
		Particles   2002
		GasBright   0.139524
		DustBright  0.609639
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   25.8945
		Period          134.129
		Eccentricity    0.9562
		Inclination     175.352
		AscendingNode   107.466
		ArgOfPericenter -131.071
		MeanAnomaly     116.621
	}
}

Comet	"Beshqek C73"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            7.92711e-008
	Radius          57.6906
	InertiaMoment   0.398589

	Oblateness      0.0147517

	RotationPeriod  39.4983
	Obliquity       247.432
	EqAscendNode    77.1653

	AbsMagn         14.4207
	SlopeParam      4.3094
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.530 0.528 0.523)

	Surface
	{
		SurfStyle       0.0975373
		OceanStyle      0.47406
		Randomize      (0.537, 0.492, -0.600)
		colorDistMagn   0.568978
		colorDistFreq   1.17307
		detailScale     1575.34
		colorConversion true
		snowLevel       2
		tropicLatitude  0.739288
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.521201
		terraceProb     0.243424
		erosion         0
		montesMagn      0.407331
		montesFreq      3.1231
		montesSpiky     0.957946
		montesFraction  0.897484
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.60726
		hillsFraction   0.819643
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242644
		craterFreq      0.181118
		craterDensity   1.0126
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.546238
		volcanoTemp     1369.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.212, 0.211, 0.209, 0.000)
		colorShelf     (0.225, 0.224, 0.222, 0.000)
		colorBeach     (0.239, 0.238, 0.235, 0.000)
		colorDesert    (0.252, 0.251, 0.248, 0.000)
		colorLowland   (0.265, 0.264, 0.262, 0.000)
		colorUpland    (0.278, 0.277, 0.275, 0.000)
		colorRock      (0.292, 0.290, 0.288, 0.000)
		colorSnow      (0.305, 0.304, 0.301, 1.000)
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
		MaxLength   0.987516
		GasToDust   0.25
		Particles   2974
		GasBright   0.106368
		DustBright  0.327282
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   32.083
		Period          184.98
		Eccentricity    0.967481
		Inclination     -149.145
		AscendingNode   136.569
		ArgOfPericenter 92.4574
		MeanAnomaly     -145.505
	}
}

Comet	"Beshqek C74"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            2.44082e-015
	Radius          0.197487
	InertiaMoment   0.396297

	Oblateness      0.0209978

	RotationPeriod  37.6257
	Obliquity       200.638
	EqAscendNode    61.7427

	AbsMagn         9.09669
	SlopeParam      4.89947
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.485 0.483 0.479)

	Surface
	{
		SurfStyle       0.143437
		OceanStyle      0.17947
		Randomize      (-0.221, 0.809, -0.955)
		colorDistMagn   0.525514
		colorDistFreq   2.80124e-005
		detailScale     5.3927
		colorConversion true
		snowLevel       2
		tropicLatitude  0.545664
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.531715
		terraceProb     0.311619
		erosion         0
		montesMagn      0.408411
		montesFreq      2.485
		montesSpiky     0.958139
		montesFraction  0.432852
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000136458
		hillsFraction   0.60376
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251284
		craterFreq      0.271508
		craterDensity   0.971098
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.452257
		volcanoTemp     1666.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.194, 0.193, 0.192, 0.000)
		colorShelf     (0.206, 0.205, 0.204, 0.000)
		colorBeach     (0.218, 0.217, 0.216, 0.000)
		colorDesert    (0.230, 0.229, 0.228, 0.000)
		colorLowland   (0.243, 0.242, 0.240, 0.000)
		colorUpland    (0.255, 0.254, 0.252, 0.000)
		colorRock      (0.267, 0.266, 0.263, 0.000)
		colorSnow      (0.279, 0.278, 0.275, 1.000)
		BumpHeight      0.177738
		BumpOffset      0.0355476
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.0579575
		GasToDust   0.25
		Particles   1096
		GasBright   0.279417
		DustBright  0.638719
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   19.7174
		Period          89.122
		Eccentricity    0.954796
		Inclination     -47.1449
		AscendingNode   38.7505
		ArgOfPericenter 67.0259
		MeanAnomaly     164.906
	}
}

Comet	"Beshqek C75"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            1.8878e-011
	Radius          3.57282
	InertiaMoment   0.399086

	Oblateness      0.0180198

	RotationPeriod  35.7246
	Obliquity       153.844
	EqAscendNode    46.3201

	AbsMagn         5.55207
	SlopeParam      5.58267
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.777 0.685 0.636)

	Surface
	{
		SurfStyle       0.0103852
		OceanStyle      0.623752
		Randomize      (-0.743, 0.049, -0.024)
		colorDistMagn   0.584029
		colorDistFreq   0.00635
		detailScale     97.5618
		colorConversion true
		snowLevel       2
		tropicLatitude  0.85546
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.544831
		terraceProb     0.420787
		erosion         0
		montesMagn      0.397961
		montesFreq      3.77344
		montesSpiky     0.848277
		montesFraction  0.419965
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0306157
		hillsFraction   0.827052
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217848
		craterFreq      0.169654
		craterDensity   0.862866
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.413941
		volcanoTemp     1246.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.311, 0.274, 0.254, 0.000)
		colorShelf     (0.330, 0.291, 0.270, 0.000)
		colorBeach     (0.350, 0.308, 0.286, 0.000)
		colorDesert    (0.369, 0.325, 0.302, 0.000)
		colorLowland   (0.388, 0.343, 0.318, 0.000)
		colorUpland    (0.408, 0.360, 0.334, 0.000)
		colorRock      (0.427, 0.377, 0.350, 0.000)
		colorSnow      (0.447, 0.394, 0.366, 1.000)
		BumpHeight      3.21554
		BumpOffset      0.643107
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.539149
		GasToDust   0.25
		Particles   2068
		GasBright   0.218979
		DustBright  0.383644
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   37.4631
		Period          233.409
		Eccentricity    0.96889
		Inclination     80.1636
		AscendingNode   -32.9378
		ArgOfPericenter 135.192
		MeanAnomaly     41.1146
	}
}

Comet	"Beshqek C76"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            1.46007e-007
	Radius          77.1706
	InertiaMoment   0.397605

	Oblateness      0.0260998

	RotationPeriod  33.7886
	Obliquity       107.049
	EqAscendNode    30.8975

	AbsMagn         13.7571
	SlopeParam      6.53713
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.685 0.642 0.578)

	Surface
	{
		SurfStyle       0.301214
		OceanStyle      0.0731869
		Randomize      (0.284, -0.461, 0.030)
		colorDistMagn   0.359177
		colorDistFreq   1.71731
		detailScale     2107.27
		colorConversion true
		snowLevel       2
		tropicLatitude  0.993534
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.477443
		terraceProb     0.129812
		erosion         0
		montesMagn      0.675124
		montesFreq      2.54606
		montesSpiky     0.940428
		montesFraction  0.633307
		dunesFraction   0
		hillsMagn       0
		hillsFreq       15.4806
		hillsFraction   0.654413
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228183
		craterFreq      0.227032
		craterDensity   0.846961
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.491879
		volcanoTemp     1417.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.274, 0.257, 0.231, 0.000)
		colorShelf     (0.291, 0.273, 0.246, 0.000)
		colorBeach     (0.308, 0.289, 0.260, 0.000)
		colorDesert    (0.326, 0.305, 0.274, 0.000)
		colorLowland   (0.343, 0.321, 0.289, 0.000)
		colorUpland    (0.360, 0.337, 0.303, 0.000)
		colorRock      (0.377, 0.353, 0.318, 0.000)
		colorSnow      (0.394, 0.369, 0.332, 1.000)
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
		GasBright   0.121281
		DustBright  0.165829
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   37.2544
		Period          231.461
		Eccentricity    0.985357
		Inclination     67.8336
		AscendingNode   104.665
		ArgOfPericenter 17.7323
		MeanAnomaly     -98.4134
	}
}

Comet	"Beshqek C77"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            4.49569e-015
	Radius          0.221265
	InertiaMoment   0.399531

	Oblateness      0.0227056

	RotationPeriod  31.8105
	Obliquity       60.255
	EqAscendNode    15.4749

	AbsMagn         8.88155
	SlopeParam      2.07926
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.609 0.532 0.440)

	Surface
	{
		SurfStyle       0.97769
		OceanStyle      0.0137722
		Randomize      (0.520, 0.931, 0.772)
		colorDistMagn   0.356574
		colorDistFreq   1.0317e-005
		detailScale     6.04201
		colorConversion true
		snowLevel       2
		tropicLatitude  0.988761
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.6309
		terraceProb     0.334615
		erosion         0
		montesMagn      0.610187
		montesFreq      2.70763
		montesSpiky     0.970218
		montesFraction  0.701065
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000115597
		hillsFraction   0.600171
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225453
		craterFreq      0.228292
		craterDensity   0.981461
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.540794
		volcanoTemp     1472.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.207, 0.186, 0.176, 0.050)
		colorShelf     (0.243, 0.218, 0.202, 0.040)
		colorBeach     (0.280, 0.250, 0.229, 0.030)
		colorDesert    (0.316, 0.282, 0.259, 0.020)
		colorLowland   (0.353, 0.314, 0.286, 0.030)
		colorUpland    (0.389, 0.346, 0.312, 0.050)
		colorRock      (0.426, 0.377, 0.347, 0.020)
		colorSnow      (0.426, 0.377, 0.347, 1.000)
		BumpHeight      0.199138
		BumpOffset      0.0398277
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.0907835
		GasToDust   0.25
		Particles   1163
		GasBright   0.371498
		DustBright  0.400098
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   33.0258
		Period          193.193
		Eccentricity    0.978619
		Inclination     47.2976
		AscendingNode   40.3893
		ArgOfPericenter 134.66
		MeanAnomaly     -13.0177
	}
}

Comet	"Beshqek C78"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            3.47708e-011
	Radius          4.77935
	InertiaMoment   0.39831

	Oblateness      0.0335985

	RotationPeriod  29.7823
	Obliquity       13.4607
	EqAscendNode    0.0522963

	AbsMagn         5.29531
	SlopeParam      2.83735
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.824 0.739 0.673)

	Surface
	{
		SurfStyle       0.0892549
		OceanStyle      0.295963
		Randomize      (0.883, 0.464, -0.801)
		colorDistMagn   0.566922
		colorDistFreq   0.0127921
		detailScale     130.508
		colorConversion true
		snowLevel       2
		tropicLatitude  0.899335
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.658187
		terraceProb     0.11344
		erosion         0
		montesMagn      0.42827
		montesFreq      2.7471
		montesSpiky     0.960335
		montesFraction  0.605383
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0716454
		hillsFraction   0.461122
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251496
		craterFreq      0.236078
		craterDensity   0.945826
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.566344
		volcanoTemp     1511.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.329, 0.296, 0.269, 0.000)
		colorShelf     (0.350, 0.314, 0.286, 0.000)
		colorBeach     (0.371, 0.333, 0.303, 0.000)
		colorDesert    (0.391, 0.351, 0.320, 0.000)
		colorLowland   (0.412, 0.370, 0.336, 0.000)
		colorUpland    (0.432, 0.388, 0.353, 0.000)
		colorRock      (0.453, 0.407, 0.370, 0.000)
		colorSnow      (0.474, 0.425, 0.387, 1.000)
		BumpHeight      4.30142
		BumpOffset      0.860284
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.571975
		GasToDust   0.25
		Particles   2135
		GasBright   0.0184768
		DustBright  0.437606
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   30.9805
		Period          175.528
		Eccentricity    0.961021
		Inclination     115.92
		AscendingNode   86.6741
		ArgOfPericenter -82.7788
		MeanAnomaly     139.835
	}
}

Comet	"Beshqek C79"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            2.68928e-007
	Radius          86.4588
	InertiaMoment   0.399954

	Oblateness      0.0299244

	RotationPeriod  27.6945
	Obliquity       326.666
	EqAscendNode    344.63

	AbsMagn         13.2224
	SlopeParam      3.45484
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.641 0.574 0.522)

	Surface
	{
		SurfStyle       0.248508
		OceanStyle      0.181108
		Randomize      (0.278, -0.749, -0.669)
		colorDistMagn   0.832258
		colorDistFreq   1.54337
		detailScale     2360.9
		colorConversion true
		snowLevel       2
		tropicLatitude  0.509294
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.71075
		terraceProb     0.124755
		erosion         0
		montesMagn      0.453304
		montesFreq      2.54912
		montesSpiky     0.89285
		montesFraction  0.619433
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.9489
		hillsFraction   0.675061
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235735
		craterFreq      0.187419
		craterDensity   0.830731
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.572192
		volcanoTemp     1577.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.256, 0.230, 0.209, 0.000)
		colorShelf     (0.272, 0.244, 0.222, 0.000)
		colorBeach     (0.288, 0.258, 0.235, 0.000)
		colorDesert    (0.304, 0.273, 0.248, 0.000)
		colorLowland   (0.320, 0.287, 0.261, 0.000)
		colorUpland    (0.336, 0.301, 0.274, 0.000)
		colorRock      (0.352, 0.316, 0.287, 0.000)
		colorSnow      (0.369, 0.330, 0.300, 1.000)
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
		GasBright   0.0936404
		DustBright  0.846929
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   37.228
		Period          231.215
		Eccentricity    0.985613
		Inclination     161.592
		AscendingNode   113.02
		ArgOfPericenter 1.4887
		MeanAnomaly     -174.948
	}
}

Comet	"Beshqek C80"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            8.28047e-015
	Radius          0.295999
	InertiaMoment   0.39885

	Oblateness      0.0456801

	RotationPeriod  25.5361
	Obliquity       279.872
	EqAscendNode    329.207

	AbsMagn         8.66894
	SlopeParam      4.02338
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.728 0.610 0.518)

	Surface
	{
		SurfStyle       0.128566
		OceanStyle      0.302723
		Randomize      (-0.276, 0.963, -0.259)
		colorDistMagn   0.211034
		colorDistFreq   3.55477e-005
		detailScale     8.08274
		colorConversion true
		snowLevel       2
		tropicLatitude  0.419961
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.688576
		terraceProb     0.644854
		erosion         0
		montesMagn      0.607905
		montesFreq      2.64296
		montesSpiky     0.998254
		montesFraction  0.388949
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000210128
		hillsFraction   0.718883
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247164
		craterFreq      0.169862
		craterDensity   0.9513
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.45423
		volcanoTemp     1368.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.291, 0.244, 0.207, 0.000)
		colorShelf     (0.309, 0.259, 0.220, 0.000)
		colorBeach     (0.327, 0.275, 0.233, 0.000)
		colorDesert    (0.346, 0.290, 0.246, 0.000)
		colorLowland   (0.364, 0.305, 0.259, 0.000)
		colorUpland    (0.382, 0.320, 0.272, 0.000)
		colorRock      (0.400, 0.336, 0.285, 0.000)
		colorSnow      (0.418, 0.351, 0.298, 1.000)
		BumpHeight      0.266399
		BumpOffset      0.0532797
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.123609
		GasToDust   0.25
		Particles   1229
		GasBright   0.0991354
		DustBright  0.525921
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   41.6719
		Period          273.828
		Eccentricity    0.980203
		Inclination     117.985
		AscendingNode   -161.931
		ArgOfPericenter 164.187
		MeanAnomaly     -140.64
	}
}

Comet	"Beshqek C81"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            6.40435e-011
	Radius          5.35429
	InertiaMoment   0.397111

	Oblateness      0.0417393

	RotationPeriod  23.2937
	Obliquity       233.078
	EqAscendNode    313.785

	AbsMagn         5.0269
	SlopeParam      4.59386
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.495 0.492 0.490)

	Surface
	{
		SurfStyle       0.102963
		OceanStyle      0.919976
		Randomize      (-0.861, -0.784, 0.063)
		colorDistMagn   0.642883
		colorDistFreq   0.0251803
		detailScale     146.208
		colorConversion true
		snowLevel       2
		tropicLatitude  0.835214
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.34651
		terraceProb     0.182923
		erosion         0
		montesMagn      0.511015
		montesFreq      3.96079
		montesSpiky     0.974595
		montesFraction  0.318257
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0907691
		hillsFraction   0.616555
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219822
		craterFreq      0.249161
		craterDensity   0.996191
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.485906
		volcanoTemp     1517.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.198, 0.197, 0.196, 0.000)
		colorShelf     (0.211, 0.209, 0.208, 0.000)
		colorBeach     (0.223, 0.221, 0.220, 0.000)
		colorDesert    (0.235, 0.234, 0.233, 0.000)
		colorLowland   (0.248, 0.246, 0.245, 0.000)
		colorUpland    (0.260, 0.258, 0.257, 0.000)
		colorRock      (0.272, 0.271, 0.269, 0.000)
		colorSnow      (0.285, 0.283, 0.282, 1.000)
		BumpHeight      4.81886
		BumpOffset      0.963771
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.604801
		GasToDust   0.25
		Particles   2201
		GasBright   0.0673712
		DustBright  0.242171
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   45.3124
		Period          310.483
		Eccentricity    0.984782
		Inclination     -63.9042
		AscendingNode   -66.5526
		ArgOfPericenter 71.3655
		MeanAnomaly     -152.178
	}
}

Comet	"Beshqek C82"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            4.95331e-007
	Radius          115.668
	InertiaMoment   0.399315

	Oblateness      0.0678134

	RotationPeriod  20.951
	Obliquity       186.283
	EqAscendNode    298.362

	AbsMagn         12.7676
	SlopeParam      5.21848
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.813 0.744 0.658)

	Surface
	{
		SurfStyle       0.419342
		OceanStyle      0.396132
		Randomize      (0.581, -0.309, -0.194)
		colorDistMagn   0.114695
		colorDistFreq   8.7422
		detailScale     3158.5
		colorConversion true
		snowLevel       2
		tropicLatitude  0.991972
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.444703
		terraceProb     0.244309
		erosion         0
		montesMagn      0.538086
		montesFreq      2.03642
		montesSpiky     0.921425
		montesFraction  0.52264
		dunesFraction   0
		hillsMagn       0
		hillsFreq       25.9465
		hillsFraction   0.707549
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242944
		craterFreq      0.462282
		craterDensity   0.982707
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.530608
		volcanoTemp     1564.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.325, 0.297, 0.263, 0.000)
		colorShelf     (0.346, 0.316, 0.280, 0.000)
		colorBeach     (0.366, 0.335, 0.296, 0.000)
		colorDesert    (0.386, 0.353, 0.313, 0.000)
		colorLowland   (0.407, 0.372, 0.329, 0.000)
		colorUpland    (0.427, 0.390, 0.346, 0.000)
		colorRock      (0.447, 0.409, 0.362, 0.000)
		colorSnow      (0.468, 0.428, 0.378, 1.000)
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
		GasBright   0.219702
		DustBright  0.574327
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   28.3731
		Period          153.841
		Eccentricity    0.960753
		Inclination     87.7105
		AscendingNode   142.486
		ArgOfPericenter -79.4505
		MeanAnomaly     175.547
	}
}

Comet	"Beshqek C83"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            1.52516e-014
	Radius          0.331581
	InertiaMoment   0.397993

	Oblateness      0.0663001

	RotationPeriod  18.4877
	Obliquity       139.489
	EqAscendNode    282.939

	AbsMagn         8.4582
	SlopeParam      5.99628
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.518 0.512 0.509)

	Surface
	{
		SurfStyle       0.874702
		OceanStyle      0.248646
		Randomize      (-0.538, 0.501, -0.810)
		colorDistMagn   0.861819
		colorDistFreq   5.71259e-005
		detailScale     9.05436
		colorConversion true
		snowLevel       2
		tropicLatitude  0.95345
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.533191
		terraceProb     0.199977
		erosion         0
		montesMagn      0.5658
		montesFreq      3.4239
		montesSpiky     0.875608
		montesFraction  0.601458
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000321548
		hillsFraction   0.694379
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232771
		craterFreq      0.221275
		craterDensity   1.0367
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.500472
		volcanoTemp     1659.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.176, 0.179, 0.204, 0.050)
		colorShelf     (0.207, 0.210, 0.234, 0.040)
		colorBeach     (0.238, 0.241, 0.265, 0.030)
		colorDesert    (0.270, 0.271, 0.300, 0.020)
		colorLowland   (0.301, 0.302, 0.331, 0.030)
		colorUpland    (0.332, 0.333, 0.361, 0.050)
		colorRock      (0.363, 0.364, 0.402, 0.020)
		colorSnow      (0.363, 0.364, 0.402, 1.000)
		BumpHeight      0.298423
		BumpOffset      0.0596845
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.156435
		GasToDust   0.25
		Particles   1295
		GasBright   0.160656
		DustBright  0.31786
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   37.6286
		Period          234.958
		Eccentricity    0.976825
		Inclination     -93.6021
		AscendingNode   66.9548
		ArgOfPericenter -53.0073
		MeanAnomaly     -147.277
	}
}

Comet	"Beshqek C84"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            1.1796e-010
	Radius          7.16372
	InertiaMoment   0.399747

	Oblateness      0.117973

	RotationPeriod  15.8778
	Obliquity       92.6949
	EqAscendNode    267.517

	AbsMagn         4.74437
	SlopeParam      7.34873
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.676 0.517 0.434)

	Surface
	{
		SurfStyle       0.871075
		OceanStyle      0.609302
		Randomize      (0.663, 0.734, 0.231)
		colorDistMagn   0.886325
		colorDistFreq   0.0418579
		detailScale     195.617
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999858
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.735808
		terraceProb     0.243392
		erosion         0
		montesMagn      0.676019
		montesFreq      2.17525
		montesSpiky     0.983124
		montesFraction  0.336973
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.135304
		hillsFraction   0.508252
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250853
		craterFreq      0.273746
		craterDensity   1.03725
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.554448
		volcanoTemp     1614.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.230, 0.181, 0.174, 0.050)
		colorShelf     (0.270, 0.212, 0.200, 0.040)
		colorBeach     (0.311, 0.243, 0.226, 0.030)
		colorDesert    (0.352, 0.274, 0.256, 0.020)
		colorLowland   (0.392, 0.305, 0.282, 0.030)
		colorUpland    (0.433, 0.336, 0.308, 0.050)
		colorRock      (0.473, 0.367, 0.343, 0.020)
		colorSnow      (0.473, 0.367, 0.343, 1.000)
		BumpHeight      6.44735
		BumpOffset      1.28947
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.637627
		GasToDust   0.25
		Particles   2267
		GasBright   0.380177
		DustBright  0.582825
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   22.7371
		Period          110.361
		Eccentricity    0.969481
		Inclination     161.675
		AscendingNode   84.9221
		ArgOfPericenter 14.6564
		MeanAnomaly     -38.9034
	}
}

Comet	"Beshqek C85"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            3.63209e-018
	Radius          0.0205339
	InertiaMoment   0.398596

	Oblateness      0.132247

	RotationPeriod  13.087
	Obliquity       45.9006
	EqAscendNode    252.094

	AbsMagn         12.3672
	SlopeParam      2.4805
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.498 0.494 0.491)

	Surface
	{
		SurfStyle       0.205253
		OceanStyle      0.445488
		Randomize      (-0.506, -0.324, 0.975)
		colorDistMagn   0.845249
		colorDistFreq   3.16276e-007
		detailScale     0.560713
		colorConversion true
		snowLevel       2
		tropicLatitude  0.536437
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.446441
		terraceProb     0.130584
		erosion         0
		montesMagn      0.574239
		montesFreq      2.79093
		montesSpiky     0.793121
		montesFraction  0.678535
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.61799e-007
		hillsFraction   0.461759
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240736
		craterFreq      0.15459
		craterDensity   0.852691
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.503731
		volcanoTemp     1633.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.199, 0.198, 0.196, 0.000)
		colorShelf     (0.212, 0.210, 0.209, 0.000)
		colorBeach     (0.224, 0.223, 0.221, 0.000)
		colorDesert    (0.237, 0.235, 0.233, 0.000)
		colorLowland   (0.249, 0.247, 0.245, 0.000)
		colorUpland    (0.261, 0.260, 0.258, 0.000)
		colorRock      (0.274, 0.272, 0.270, 0.000)
		colorSnow      (0.286, 0.284, 0.282, 1.000)
		BumpHeight      0.0184805
		BumpOffset      0.0036961
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.293849
		DustBright  0.35364
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   39.7109
		Period          254.728
		Eccentricity    0.974724
		Inclination     151.958
		AscendingNode   -47.1197
		ArgOfPericenter -117.46
		MeanAnomaly     -139.986
	}
}

Comet	"Beshqek C86"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            2.80915e-014
	Radius          0.443676
	InertiaMoment   0.396326

	Oblateness      0.249

	RotationPeriod  10.0688
	Obliquity       359.106
	EqAscendNode    236.672

	AbsMagn         8.24872
	SlopeParam      3.15198
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.753 0.640 0.551)

	Surface
	{
		SurfStyle       0.117234
		OceanStyle      0.748733
		Randomize      (-0.148, 0.695, -0.422)
		colorDistMagn   0.674064
		colorDistFreq   6.70704e-005
		detailScale     12.1153
		colorConversion true
		snowLevel       2
		tropicLatitude  0.523317
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.70519
		terraceProb     0.355488
		erosion         0
		montesMagn      0.640449
		montesFreq      3.34658
		montesSpiky     0.966049
		montesFraction  0.913993
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000325305
		hillsFraction   0.757424
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233799
		craterFreq      0.24128
		craterDensity   0.873936
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.499505
		volcanoTemp     1423.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.301, 0.256, 0.220, 0.000)
		colorShelf     (0.320, 0.272, 0.234, 0.000)
		colorBeach     (0.339, 0.288, 0.248, 0.000)
		colorDesert    (0.358, 0.304, 0.262, 0.000)
		colorLowland   (0.376, 0.320, 0.275, 0.000)
		colorUpland    (0.395, 0.336, 0.289, 0.000)
		colorRock      (0.414, 0.352, 0.303, 0.000)
		colorSnow      (0.433, 0.368, 0.317, 1.000)
		BumpHeight      0.399309
		BumpOffset      0.0798617
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.189261
		GasToDust   0.25
		Particles   1362
		GasBright   0.00427383
		DustBright  0.327702
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   37.8549
		Period          237.081
		Eccentricity    0.975495
		Inclination     -148.073
		AscendingNode   -64.7521
		ArgOfPericenter 106.987
		MeanAnomaly     40.1693
	}
}

Comet	"Beshqek C87"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            2.17267e-010
	Radius          8.02321
	InertiaMoment   0.399092

	Oblateness      0.249

	RotationPeriod  6.7574
	Obliquity       312.312
	EqAscendNode    221.249

	AbsMagn         4.44459
	SlopeParam      3.73784
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.505 0.468 0.412)

	Surface
	{
		SurfStyle       0.586044
		OceanStyle      0.566971
		Randomize      (0.608, 0.683, 0.748)
		colorDistMagn   0.402754
		colorDistFreq   0.0292284
		detailScale     219.087
		colorConversion true
		snowLevel       2
		tropicLatitude  0.8745
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.724754
		terraceProb     0.412394
		erosion         0
		montesMagn      0.52832
		montesFreq      2.67371
		montesSpiky     0.903945
		montesFraction  0.340959
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.141203
		hillsFraction   0.775382
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246794
		craterFreq      0.210551
		craterDensity   0.85407
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.430679
		volcanoTemp     1643.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.197, 0.159, 0.115, 0.000)
		colorShelf     (0.202, 0.164, 0.132, 0.000)
		colorBeach     (0.237, 0.192, 0.157, 0.000)
		colorDesert    (0.257, 0.206, 0.153, 0.000)
		colorLowland   (0.283, 0.220, 0.173, 0.000)
		colorUpland    (0.313, 0.267, 0.210, 0.000)
		colorRock      (0.338, 0.290, 0.227, 0.000)
		colorSnow      (0.368, 0.309, 0.239, 1.000)
		BumpHeight      7.22089
		BumpOffset      1.44418
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.670453
		GasToDust   0.25
		Particles   2334
		GasBright   0.0587193
		DustBright  0.757743
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   36.8799
		Period          227.98
		Eccentricity    0.978991
		Inclination     99.9327
		AscendingNode   34.3827
		ArgOfPericenter 30.5964
		MeanAnomaly     43.1654
	}
}

Comet	"Beshqek C88"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            6.68983e-018
	Radius          0.0274787
	InertiaMoment   0.397616

	Oblateness      0.249

	RotationPeriod  3.05439
	Obliquity       265.518
	EqAscendNode    205.826

	AbsMagn         12.0064
	SlopeParam      4.3016
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.657 0.654 0.648)

	Surface
	{
		SurfStyle       0.234254
		OceanStyle      0.591746
		Randomize      (0.658, -0.443, 0.162)
		colorDistMagn   0.516689
		colorDistFreq   3.84298e-007
		detailScale     0.750353
		colorConversion true
		snowLevel       2
		tropicLatitude  0.902704
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.439688
		terraceProb     0.246969
		erosion         0
		montesMagn      0.485598
		montesFreq      3.18363
		montesSpiky     0.990537
		montesFraction  0.633063
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.69222e-006
		hillsFraction   0.69867
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230391
		craterFreq      0.236572
		craterDensity   0.77917
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.469979
		volcanoTemp     1741.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.263, 0.261, 0.259, 0.000)
		colorShelf     (0.279, 0.278, 0.275, 0.000)
		colorBeach     (0.296, 0.294, 0.292, 0.000)
		colorDesert    (0.312, 0.310, 0.308, 0.000)
		colorLowland   (0.329, 0.327, 0.324, 0.000)
		colorUpland    (0.345, 0.343, 0.340, 0.000)
		colorRock      (0.361, 0.360, 0.356, 0.000)
		colorSnow      (0.378, 0.376, 0.373, 1.000)
		BumpHeight      0.0247309
		BumpOffset      0.00494617
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.0656065
		DustBright  0.435342
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   18.9186
		Period          83.7616
		Eccentricity    0.952218
		Inclination     21.0638
		AscendingNode   -175.774
		ArgOfPericenter -161.645
		MeanAnomaly     115.022
	}
}

Comet	"Beshqek C89"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            5.1741e-014
	Radius          0.496843
	InertiaMoment   0.399536

	Oblateness      0.00145755

	RotationPeriod  124.529
	Obliquity       218.723
	EqAscendNode    190.404

	AbsMagn         8.03993
	SlopeParam      4.89094
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.599 0.593 0.588)

	Surface
	{
		SurfStyle       0.998776
		OceanStyle      0.173814
		Randomize      (-0.903, -0.140, -0.397)
		colorDistMagn   0.051332
		colorDistFreq   0.000159276
		detailScale     13.5671
		colorConversion true
		snowLevel       2
		tropicLatitude  0.410416
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.293422
		terraceProb     0.286526
		erosion         0
		montesMagn      0.530809
		montesFreq      2.51297
		montesSpiky     0.993402
		montesFraction  0.635089
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000674255
		hillsFraction   0.573965
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217068
		craterFreq      0.212793
		craterDensity   0.824022
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.539882
		volcanoTemp     1488.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.204, 0.208, 0.235, 0.050)
		colorShelf     (0.240, 0.243, 0.271, 0.040)
		colorBeach     (0.276, 0.279, 0.306, 0.030)
		colorDesert    (0.311, 0.315, 0.347, 0.020)
		colorLowland   (0.347, 0.350, 0.382, 0.030)
		colorUpland    (0.383, 0.386, 0.418, 0.050)
		colorRock      (0.419, 0.421, 0.465, 0.020)
		colorSnow      (0.419, 0.421, 0.465, 1.000)
		BumpHeight      0.447159
		BumpOffset      0.0894318
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.222087
		GasToDust   0.25
		Particles   1428
		GasBright   0.187242
		DustBright  0.798193
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   24.4142
		Period          122.794
		Eccentricity    0.980733
		Inclination     -28.4946
		AscendingNode   40.7076
		ArgOfPericenter 71.6259
		MeanAnomaly     -128.244
	}
}

Comet	"Beshqek C90"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            4.0018e-010
	Radius          10.7382
	InertiaMoment   0.398318

	Oblateness      0.00232451

	RotationPeriod  112.404
	Obliquity       171.929
	EqAscendNode    174.981

	AbsMagn         4.12336
	SlopeParam      5.57214
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.744 0.742 0.740)

	Surface
	{
		SurfStyle       0.329312
		OceanStyle      0.214125
		Randomize      (0.446, -0.852, 0.560)
		colorDistMagn   0.556099
		colorDistFreq   0.094462
		detailScale     293.223
		colorConversion true
		snowLevel       2
		tropicLatitude  0.228592
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.597525
		terraceProb     0.382002
		erosion         0
		montesMagn      0.517799
		montesFreq      3.34228
		montesSpiky     0.825793
		montesFraction  0.351505
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.219435
		hillsFraction   0.743068
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248875
		craterFreq      0.211418
		craterDensity   1.08096
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.419236
		volcanoTemp     1802.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.298, 0.297, 0.296, 0.000)
		colorShelf     (0.316, 0.316, 0.315, 0.000)
		colorBeach     (0.335, 0.334, 0.333, 0.000)
		colorDesert    (0.353, 0.353, 0.352, 0.000)
		colorLowland   (0.372, 0.371, 0.370, 0.000)
		colorUpland    (0.390, 0.390, 0.389, 0.000)
		colorRock      (0.409, 0.408, 0.407, 0.000)
		colorSnow      (0.428, 0.427, 0.426, 1.000)
		BumpHeight      9.66434
		BumpOffset      1.93287
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.703279
		GasToDust   0.25
		Particles   2400
		GasBright   0.166847
		DustBright  0.503074
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   40.5426
		Period          262.772
		Eccentricity    0.976054
		Inclination     19.8108
		AscendingNode   -27.9728
		ArgOfPericenter 0.61155
		MeanAnomaly     -54.8486
	}
}

Comet	"Beshqek C91"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            1.23218e-017
	Radius          0.030767
	InertiaMoment   0.399959

	Oblateness      0.0020498

	RotationPeriod  104.942
	Obliquity       125.135
	EqAscendNode    159.559

	AbsMagn         11.6756
	SlopeParam      6.51997
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.735 0.731 0.728)

	Surface
	{
		SurfStyle       0.85249
		OceanStyle      0.531504
		Randomize      (0.503, -0.830, 0.447)
		colorDistMagn   0.577591
		colorDistFreq   1.6798e-007
		detailScale     0.840143
		colorConversion true
		snowLevel       2
		tropicLatitude  0.992574
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.69665
		terraceProb     0.392901
		erosion         0
		montesMagn      0.349387
		montesFreq      3.28113
		montesSpiky     0.917634
		montesFraction  0.936734
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.55008e-006
		hillsFraction   0.894007
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257675
		craterFreq      0.192548
		craterDensity   0.920262
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.453478
		volcanoTemp     1331.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.250, 0.256, 0.291, 0.050)
		colorShelf     (0.294, 0.300, 0.335, 0.040)
		colorBeach     (0.338, 0.344, 0.379, 0.030)
		colorDesert    (0.382, 0.388, 0.430, 0.020)
		colorLowland   (0.426, 0.432, 0.473, 0.030)
		colorUpland    (0.470, 0.475, 0.517, 0.050)
		colorRock      (0.515, 0.519, 0.575, 0.020)
		colorSnow      (0.515, 0.519, 0.575, 1.000)
		BumpHeight      0.0276903
		BumpOffset      0.00553805
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.109193
		DustBright  0.245215
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   28.1992
		Period          152.429
		Eccentricity    0.99129
		Inclination     -89.2872
		AscendingNode   -98.0477
		ArgOfPericenter -54.0816
		MeanAnomaly     66.8593
	}
}

Comet	"Beshqek C92"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            9.53006e-014
	Radius          0.665067
	InertiaMoment   0.398856

	Oblateness      0.0029748

	RotationPeriod  99.3431
	Obliquity       78.3405
	EqAscendNode    144.136

	AbsMagn         7.83124
	SlopeParam      2.06698
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.483 0.401 0.318)

	Surface
	{
		SurfStyle       0.782663
		OceanStyle      0.600421
		Randomize      (-0.044, -0.186, -0.291)
		colorDistMagn   0.768511
		colorDistFreq   0.000226474
		detailScale     18.1608
		colorConversion true
		snowLevel       2
		tropicLatitude  0.870559
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.606421
		terraceProb     0.337093
		erosion         0
		montesMagn      0.57354
		montesFreq      2.81931
		montesSpiky     0.916655
		montesFraction  0.623427
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00117897
		hillsFraction   0.900949
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262161
		craterFreq      0.205816
		craterDensity   1.02005
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.511184
		volcanoTemp     1569.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.188, 0.136, 0.089, 0.000)
		colorShelf     (0.193, 0.140, 0.102, 0.000)
		colorBeach     (0.227, 0.164, 0.121, 0.000)
		colorDesert    (0.246, 0.176, 0.118, 0.000)
		colorLowland   (0.270, 0.188, 0.134, 0.000)
		colorUpland    (0.299, 0.229, 0.162, 0.000)
		colorRock      (0.323, 0.249, 0.175, 0.000)
		colorSnow      (0.352, 0.265, 0.185, 1.000)
		BumpHeight      0.59856
		BumpOffset      0.119712
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.254913
		GasToDust   0.25
		Particles   1494
		GasBright   0.307996
		DustBright  0.530899
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   32.6848
		Period          190.209
		Eccentricity    0.959835
		Inclination     67.0986
		AscendingNode   -50.758
		ArgOfPericenter 129.849
		MeanAnomaly     98.9326
	}
}

Comet	"Beshqek C93"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            7.37081e-010
	Radius          12.0211
	InertiaMoment   0.397126

	Oblateness      0.00247976

	RotationPeriod  94.7677
	Obliquity       31.5462
	EqAscendNode    128.713

	AbsMagn         3.77495
	SlopeParam      2.8282
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.601 0.497 0.455)

	Surface
	{
		SurfStyle       0.24873
		OceanStyle      0.880545
		Randomize      (-0.677, -0.358, -0.760)
		colorDistMagn   0.525693
		colorDistFreq   0.105097
		detailScale     328.255
		colorConversion true
		snowLevel       2
		tropicLatitude  0.853024
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.492185
		terraceProb     0.201337
		erosion         0
		montesMagn      0.508687
		montesFreq      2.89963
		montesSpiky     0.884316
		montesFraction  0.731426
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.32122
		hillsFraction   0.519113
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250522
		craterFreq      0.161431
		craterDensity   0.771829
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.549274
		volcanoTemp     1631.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.240, 0.199, 0.182, 0.000)
		colorShelf     (0.255, 0.211, 0.193, 0.000)
		colorBeach     (0.270, 0.223, 0.205, 0.000)
		colorDesert    (0.285, 0.236, 0.216, 0.000)
		colorLowland   (0.300, 0.248, 0.227, 0.000)
		colorUpland    (0.315, 0.261, 0.239, 0.000)
		colorRock      (0.330, 0.273, 0.250, 0.000)
		colorSnow      (0.345, 0.286, 0.261, 1.000)
		BumpHeight      10.819
		BumpOffset      2.16379
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.736105
		GasToDust   0.25
		Particles   2466
		GasBright   0.22306
		DustBright  0.300321
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   35.1185
		Period          211.844
		Eccentricity    0.976622
		Inclination     35.7741
		AscendingNode   56.3318
		ArgOfPericenter -111.956
		MeanAnomaly     168.938
	}
}

Comet	"Beshqek C94"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            2.26952e-017
	Radius          0.041191
	InertiaMoment   0.399321

	Oblateness      0.00355528

	RotationPeriod  90.8437
	Obliquity       344.752
	EqAscendNode    113.291

	AbsMagn         11.3681
	SlopeParam      3.44682
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.693 0.691 0.688)

	Surface
	{
		SurfStyle       0.790646
		OceanStyle      0.373968
		Randomize      (-0.640, 0.724, 0.660)
		colorDistMagn   0.910486
		colorDistFreq   1.11721e-006
		detailScale     1.12479
		colorConversion true
		snowLevel       2
		tropicLatitude  0.914259
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.279068
		terraceProb     0.15928
		erosion         0
		montesMagn      0.475644
		montesFreq      2.88784
		montesSpiky     0.885878
		montesFraction  0.949944
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.59851e-006
		hillsFraction   0.674488
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.197427
		craterFreq      0.181975
		craterDensity   0.87488
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.568028
		volcanoTemp     1323.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.270, 0.235, 0.193, 0.000)
		colorShelf     (0.277, 0.242, 0.220, 0.000)
		colorBeach     (0.326, 0.283, 0.261, 0.000)
		colorDesert    (0.354, 0.304, 0.255, 0.000)
		colorLowland   (0.388, 0.325, 0.289, 0.000)
		colorUpland    (0.430, 0.394, 0.351, 0.000)
		colorRock      (0.465, 0.429, 0.378, 0.000)
		colorSnow      (0.506, 0.456, 0.399, 1.000)
		BumpHeight      0.0370719
		BumpOffset      0.00741438
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.100865
		DustBright  0.107003
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   42.7887
		Period          284.909
		Eccentricity    0.98409
		Inclination     -127.358
		AscendingNode   -149.599
		ArgOfPericenter 82.1024
		MeanAnomaly     117.762
	}
}

Comet	"Beshqek C95"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            1.75532e-013
	Radius          0.744382
	InertiaMoment   0.398002

	Oblateness      0.0029183

	RotationPeriod  87.3719
	Obliquity       297.958
	EqAscendNode    97.8683

	AbsMagn         7.6221
	SlopeParam      4.01567
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.557 0.552 0.546)

	Surface
	{
		SurfStyle       0.196961
		OceanStyle      0.552412
		Randomize      (0.304, -0.621, 0.084)
		colorDistMagn   0.466039
		colorDistFreq   0.000341583
		detailScale     20.3266
		colorConversion true
		snowLevel       2
		tropicLatitude  0.960141
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.578646
		terraceProb     0.365205
		erosion         0
		montesMagn      0.481159
		montesFreq      2.82953
		montesSpiky     0.908117
		montesFraction  0.788214
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00115246
		hillsFraction   0.569833
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22396
		craterFreq      0.201903
		craterDensity   0.694643
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.465472
		volcanoTemp     1608.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.223, 0.221, 0.219, 0.000)
		colorShelf     (0.237, 0.235, 0.232, 0.000)
		colorBeach     (0.251, 0.249, 0.246, 0.000)
		colorDesert    (0.265, 0.262, 0.260, 0.000)
		colorLowland   (0.278, 0.276, 0.273, 0.000)
		colorUpland    (0.292, 0.290, 0.287, 0.000)
		colorRock      (0.306, 0.304, 0.301, 0.000)
		colorSnow      (0.320, 0.318, 0.314, 1.000)
		BumpHeight      0.669943
		BumpOffset      0.133989
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.287739
		GasToDust   0.25
		Particles   1561
		GasBright   0.0306583
		DustBright  0.661696
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   43.861
		Period          295.686
		Eccentricity    0.984513
		Inclination     -27.0815
		AscendingNode   69.9447
		ArgOfPericenter 123.804
		MeanAnomaly     -1.76792
	}
}

Comet	"Beshqek C96"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            1.35761e-009
	Radius          16.0969
	InertiaMoment   0.399752

	Oblateness      0.00413227

	RotationPeriod  84.2321
	Obliquity       251.163
	EqAscendNode    82.4457

	AbsMagn         3.39113
	SlopeParam      4.5858
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.565 0.559 0.558)

	Surface
	{
		SurfStyle       0.817405
		OceanStyle      0.488519
		Randomize      (0.683, -0.953, -0.959)
		colorDistMagn   0.759634
		colorDistFreq   0.181725
		detailScale     439.553
		colorConversion true
		snowLevel       2
		tropicLatitude  0.996525
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.646235
		terraceProb     0.32037
		erosion         0
		montesMagn      0.547344
		montesFreq      2.78937
		montesSpiky     0.735362
		montesFraction  0.808836
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.637371
		hillsFraction   0.611954
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.265399
		craterFreq      0.195568
		craterDensity   0.951914
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.561675
		volcanoTemp     1459.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.220, 0.190, 0.156, 0.000)
		colorShelf     (0.226, 0.196, 0.178, 0.000)
		colorBeach     (0.266, 0.229, 0.212, 0.000)
		colorDesert    (0.288, 0.246, 0.206, 0.000)
		colorLowland   (0.316, 0.263, 0.234, 0.000)
		colorUpland    (0.350, 0.319, 0.284, 0.000)
		colorRock      (0.378, 0.347, 0.307, 0.000)
		colorSnow      (0.412, 0.369, 0.323, 1.000)
		BumpHeight      14.4872
		BumpOffset      2.89744
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.768931
		GasToDust   0.25
		Particles   2533
		GasBright   0.0389377
		DustBright  0.337904
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   30.8557
		Period          174.468
		Eccentricity    0.975266
		Inclination     -17.9835
		AscendingNode   139.986
		ArgOfPericenter -168.445
		MeanAnomaly     -147.306
	}
}

Comet	"Beshqek C97"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            4.18018e-017
	Radius          0.0460936
	InertiaMoment   0.398603

	Oblateness      0.00336412

	RotationPeriod  81.3463
	Obliquity       204.369
	EqAscendNode    67.0231

	AbsMagn         11.0794
	SlopeParam      5.2092
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.601 0.597 0.593)

	Surface
	{
		SurfStyle       0.563596
		OceanStyle      0.301966
		Randomize      (0.403, -0.743, 0.289)
		colorDistMagn   0.508011
		colorDistFreq   2.89434e-007
		detailScale     1.25866
		colorConversion true
		snowLevel       2
		tropicLatitude  0.532876
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.48124
		terraceProb     0.18659
		erosion         0
		montesMagn      0.383886
		montesFreq      2.69097
		montesSpiky     0.935272
		montesFraction  0.259736
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.30787e-006
		hillsFraction   0.799506
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248981
		craterFreq      0.238558
		craterDensity   0.84773
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.435021
		volcanoTemp     1282.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.235, 0.203, 0.166, 0.000)
		colorShelf     (0.241, 0.209, 0.190, 0.000)
		colorBeach     (0.283, 0.245, 0.225, 0.000)
		colorDesert    (0.307, 0.263, 0.219, 0.000)
		colorLowland   (0.337, 0.281, 0.249, 0.000)
		colorUpland    (0.373, 0.340, 0.302, 0.000)
		colorRock      (0.403, 0.370, 0.326, 0.000)
		colorSnow      (0.439, 0.394, 0.344, 1.000)
		BumpHeight      0.0414842
		BumpOffset      0.00829685
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.139855
		DustBright  0.721473
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   20.5602
		Period          94.8974
		Eccentricity    0.970965
		Inclination     32.7139
		AscendingNode   -110.962
		ArgOfPericenter -130.311
		MeanAnomaly     -32.3511
	}
}

Comet	"Beshqek C98"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            3.23307e-013
	Radius          0.996975
	InertiaMoment   0.396354

	Oblateness      0.0046675

	RotationPeriod  78.6603
	Obliquity       157.575
	EqAscendNode    51.6005

	AbsMagn         7.41191
	SlopeParam      5.98362
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.623 0.463 0.366)

	Surface
	{
		SurfStyle       0.189312
		OceanStyle      0.36112
		Randomize      (0.043, 0.286, -0.055)
		colorDistMagn   0.457552
		colorDistFreq   0.000602426
		detailScale     27.2241
		colorConversion true
		snowLevel       2
		tropicLatitude  0.959402
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.711806
		terraceProb     0.242874
		erosion         0
		montesMagn      0.529668
		montesFreq      4.09328
		montesSpiky     0.8447
		montesFraction  0.816686
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00285699
		hillsFraction   0.699205
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23468
		craterFreq      0.26427
		craterDensity   0.968094
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.498124
		volcanoTemp     1553.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.249, 0.185, 0.146, 0.000)
		colorShelf     (0.265, 0.197, 0.155, 0.000)
		colorBeach     (0.280, 0.209, 0.165, 0.000)
		colorDesert    (0.296, 0.220, 0.174, 0.000)
		colorLowland   (0.311, 0.232, 0.183, 0.000)
		colorUpland    (0.327, 0.243, 0.192, 0.000)
		colorRock      (0.343, 0.255, 0.201, 0.000)
		colorSnow      (0.358, 0.266, 0.210, 1.000)
		BumpHeight      0.897277
		BumpOffset      0.179455
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.320565
		GasToDust   0.25
		Particles   1627
		GasBright   0.120853
		DustBright  0.424962
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   31.557
		Period          180.449
		Eccentricity    0.974482
		Inclination     84.239
		AscendingNode   170.952
		ArgOfPericenter 11.2404
		MeanAnomaly     13.5887
	}
}

Comet	"Beshqek C99"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            2.50055e-009
	Radius          18.0085
	InertiaMoment   0.399097

	Oblateness      0.00383581

	RotationPeriod  76.135
	Obliquity       110.78
	EqAscendNode    36.1779

	AbsMagn         2.9594
	SlopeParam      7.31779
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.520 0.513 0.509)

	Surface
	{
		SurfStyle       0.581883
		OceanStyle      0.298317
		Randomize      (-0.860, 0.391, 0.852)
		colorDistMagn   0.512718
		colorDistFreq   0.17721
		detailScale     491.753
		colorConversion true
		snowLevel       2
		tropicLatitude  0.929145
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.475729
		terraceProb     0.662915
		erosion         0
		montesMagn      0.424846
		montesFreq      3.49709
		montesSpiky     0.863276
		montesFraction  0.304662
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.703686
		hillsFraction   0.572879
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22757
		craterFreq      0.214271
		craterDensity   0.938083
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.499347
		volcanoTemp     1478.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.203, 0.174, 0.142, 0.000)
		colorShelf     (0.208, 0.179, 0.163, 0.000)
		colorBeach     (0.244, 0.210, 0.193, 0.000)
		colorDesert    (0.265, 0.226, 0.188, 0.000)
		colorLowland   (0.291, 0.241, 0.214, 0.000)
		colorUpland    (0.322, 0.292, 0.259, 0.000)
		colorRock      (0.348, 0.318, 0.280, 0.000)
		colorSnow      (0.380, 0.338, 0.295, 1.000)
		BumpHeight      16.2077
		BumpOffset      3.24154
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.801757
		GasToDust   0.25
		Particles   2599
		GasBright   0.0645907
		DustBright  0.16571
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   41.4585
		Period          271.727
		Eccentricity    0.983418
		Inclination     68.8943
		AscendingNode   124.774
		ArgOfPericenter -45.1745
		MeanAnomaly     -111.844
	}
}

Comet	"Beshqek C100"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            7.69938e-017
	Radius          0.0617487
	InertiaMoment   0.397626

	Oblateness      0.00532401

	RotationPeriod  73.7412
	Obliquity       63.9861
	EqAscendNode    20.7553

	AbsMagn         10.8059
	SlopeParam      2.47019
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.466 0.459 0.456)

	Surface
	{
		SurfStyle       0.418671
		OceanStyle      0.00884924
		Randomize      (0.431, -0.550, -0.167)
		colorDistMagn   0.663287
		colorDistFreq   1.84315e-006
		detailScale     1.68615
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999942
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.516142
		terraceProb     0.321319
		erosion         0
		montesMagn      0.501309
		montesFreq      2.96681
		montesSpiky     0.880255
		montesFraction  0.418494
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.27981e-006
		hillsFraction   0.737874
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232063
		craterFreq      0.221894
		craterDensity   0.832152
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.530769
		volcanoTemp     1411.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.186, 0.184, 0.182, 0.000)
		colorShelf     (0.198, 0.195, 0.194, 0.000)
		colorBeach     (0.210, 0.207, 0.205, 0.000)
		colorDesert    (0.221, 0.218, 0.217, 0.000)
		colorLowland   (0.233, 0.230, 0.228, 0.000)
		colorUpland    (0.245, 0.241, 0.239, 0.000)
		colorRock      (0.256, 0.253, 0.251, 0.000)
		colorSnow      (0.268, 0.264, 0.262, 1.000)
		BumpHeight      0.0555739
		BumpOffset      0.0111148
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.242676
		DustBright  0.472112
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   34.576
		Period          206.954
		Eccentricity    0.962404
		Inclination     41.8435
		AscendingNode   55.7352
		ArgOfPericenter -43.7562
		MeanAnomaly     130.744
	}
}

Comet	"Beshqek C101"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            5.95491e-013
	Radius          1.11508
	InertiaMoment   0.399542

	Oblateness      0.00434831

	RotationPeriod  71.4561
	Obliquity       17.1918
	EqAscendNode    5.33272

	AbsMagn         7.20009
	SlopeParam      3.14353
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.506 0.389 0.348)

	Surface
	{
		SurfStyle       0.489189
		OceanStyle      0.326529
		Randomize      (0.473, -0.821, -0.926)
		colorDistMagn   0.359042
		colorDistFreq   0.000580624
		detailScale     30.4493
		colorConversion true
		snowLevel       2
		tropicLatitude  0.362866
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.524979
		terraceProb     0.549432
		erosion         0
		montesMagn      0.36915
		montesFreq      3.06142
		montesSpiky     0.87137
		montesFraction  0.543419
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00325495
		hillsFraction   0.455956
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245624
		craterFreq      0.24313
		craterDensity   0.976285
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.479903
		volcanoTemp     1537.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.202, 0.156, 0.139, 0.000)
		colorShelf     (0.215, 0.165, 0.148, 0.000)
		colorBeach     (0.228, 0.175, 0.157, 0.000)
		colorDesert    (0.240, 0.185, 0.166, 0.000)
		colorLowland   (0.253, 0.195, 0.174, 0.000)
		colorUpland    (0.266, 0.204, 0.183, 0.000)
		colorRock      (0.278, 0.214, 0.192, 0.000)
		colorSnow      (0.291, 0.224, 0.200, 1.000)
		BumpHeight      1.00358
		BumpOffset      0.200715
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.353391
		GasToDust   0.25
		Particles   1693
		GasBright   0.159132
		DustBright  0.240142
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   41.6388
		Period          273.502
		Eccentricity    0.981915
		Inclination     -20.3114
		AscendingNode   -69.505
		ArgOfPericenter 65.4343
		MeanAnomaly     -133.33
	}
}

Comet	"Beshqek C102"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            4.60569e-009
	Radius          24.1309
	InertiaMoment   0.398325

	Oblateness      0.00603679

	RotationPeriod  69.2619
	Obliquity       330.398
	EqAscendNode    349.91

	AbsMagn         2.45929
	SlopeParam      3.73006
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.775 0.747 0.694)

	Surface
	{
		SurfStyle       0.484814
		OceanStyle      0.592851
		Randomize      (0.265, 0.555, 0.844)
		colorDistMagn   0.82393
		colorDistFreq   0.394455
		detailScale     658.935
		colorConversion true
		snowLevel       2
		tropicLatitude  0.910401
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.67186
		terraceProb     0.520895
		erosion         0
		montesMagn      0.246489
		montesFreq      2.8896
		montesSpiky     0.845069
		montesFraction  0.624694
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.40213
		hillsFraction   0.863846
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245476
		craterFreq      0.217544
		craterDensity   0.839947
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.433266
		volcanoTemp     2024.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.310, 0.299, 0.278, 0.000)
		colorShelf     (0.329, 0.317, 0.295, 0.000)
		colorBeach     (0.349, 0.336, 0.312, 0.000)
		colorDesert    (0.368, 0.355, 0.330, 0.000)
		colorLowland   (0.387, 0.373, 0.347, 0.000)
		colorUpland    (0.407, 0.392, 0.364, 0.000)
		colorRock      (0.426, 0.411, 0.382, 0.000)
		colorSnow      (0.445, 0.429, 0.399, 1.000)
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
		MaxLength   0.834583
		GasToDust   0.25
		Particles   2665
		GasBright   0.404407
		DustBright  0.479354
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   44.646
		Period          303.659
		Eccentricity    0.982395
		Inclination     43.4604
		AscendingNode   129.774
		ArgOfPericenter 89.408
		MeanAnomaly     49.0423
	}
}

Comet	"Beshqek C103"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            1.41813e-016
	Radius          0.0690445
	InertiaMoment   0.399964

	Oblateness      0.00491697

	RotationPeriod  67.144
	Obliquity       283.603
	EqAscendNode    334.488

	AbsMagn         10.545
	SlopeParam      4.2938
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.706 0.704 0.703)

	Surface
	{
		SurfStyle       0.605287
		OceanStyle      0.964428
		Randomize      (-0.254, -0.195, 0.360)
		colorDistMagn   0.617132
		colorDistFreq   1.40897e-006
		detailScale     1.88538
		colorConversion true
		snowLevel       2
		tropicLatitude  0.605404
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.459668
		terraceProb     0.216316
		erosion         0
		montesMagn      0.591701
		montesFreq      2.65104
		montesSpiky     0.981919
		montesFraction  0.233322
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.05074e-006
		hillsFraction   0.588634
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217457
		craterFreq      0.255619
		craterDensity   0.791127
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.447927
		volcanoTemp     1402.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.275, 0.239, 0.197, 0.000)
		colorShelf     (0.283, 0.246, 0.225, 0.000)
		colorBeach     (0.332, 0.289, 0.267, 0.000)
		colorDesert    (0.360, 0.310, 0.260, 0.000)
		colorLowland   (0.396, 0.331, 0.295, 0.000)
		colorUpland    (0.438, 0.401, 0.358, 0.000)
		colorRock      (0.473, 0.436, 0.386, 0.000)
		colorSnow      (0.516, 0.465, 0.408, 1.000)
		BumpHeight      0.0621401
		BumpOffset      0.012428
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.00945748
		DustBright  0.55879
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   31.1993
		Period          177.39
		Eccentricity    0.978608
		Inclination     51.6484
		AscendingNode   31.4881
		ArgOfPericenter -28.2191
		MeanAnomaly     56.4484
	}
}

Comet	"Beshqek C104"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            1.09682e-012
	Radius          1.49459
	InertiaMoment   0.398862

	Oblateness      0.00683343

	RotationPeriod  65.0904
	Obliquity       236.809
	EqAscendNode    319.065

	AbsMagn         6.986
	SlopeParam      4.88242
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.635 0.508 0.431)

	Surface
	{
		SurfStyle       0.293944
		OceanStyle      0.184259
		Randomize      (0.377, -0.617, 0.212)
		colorDistMagn   0.075326
		colorDistFreq   0.000903934
		detailScale     40.8122
		colorConversion true
		snowLevel       2
		tropicLatitude  0.186728
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.393101
		terraceProb     0.384828
		erosion         0
		montesMagn      0.527484
		montesFreq      2.46955
		montesSpiky     0.885695
		montesFraction  0.711646
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00709647
		hillsFraction   0.467829
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213582
		craterFreq      0.193317
		craterDensity   0.875154
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.410874
		volcanoTemp     1792.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.254, 0.203, 0.173, 0.000)
		colorShelf     (0.270, 0.216, 0.183, 0.000)
		colorBeach     (0.286, 0.229, 0.194, 0.000)
		colorDesert    (0.302, 0.241, 0.205, 0.000)
		colorLowland   (0.318, 0.254, 0.216, 0.000)
		colorUpland    (0.334, 0.267, 0.226, 0.000)
		colorRock      (0.349, 0.279, 0.237, 0.000)
		colorSnow      (0.365, 0.292, 0.248, 1.000)
		BumpHeight      1.34513
		BumpOffset      0.269026
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.386217
		GasToDust   0.25
		Particles   1760
		GasBright   0.019129
		DustBright  0.233605
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   22.3573
		Period          107.607
		Eccentricity    0.971434
		Inclination     -121.105
		AscendingNode   167.522
		ArgOfPericenter 9.53494
		MeanAnomaly     -85.4114
	}
}

Comet	"Beshqek C105"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            8.48311e-009
	Radius          26.9738
	InertiaMoment   0.397141

	Oblateness      0.00549257

	RotationPeriod  63.091
	Obliquity       190.015
	EqAscendNode    303.642

	AbsMagn         1.85344
	SlopeParam      5.56165
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.758 0.756 0.755)

	Surface
	{
		SurfStyle       0.732599
		OceanStyle      0.374793
		Randomize      (-0.276, -0.764, -0.179)
		colorDistMagn   0.0804769
		colorDistFreq   0.334246
		detailScale     736.564
		colorConversion true
		snowLevel       2
		tropicLatitude  0.894023
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.265767
		terraceProb     0.224775
		erosion         0
		montesMagn      0.411628
		montesFreq      2.93787
		montesSpiky     0.839581
		montesFraction  0.77564
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.7658
		hillsFraction   0.633391
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241221
		craterFreq      0.194851
		craterDensity   0.811122
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.484234
		volcanoTemp     1407.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.296, 0.257, 0.211, 0.000)
		colorShelf     (0.303, 0.265, 0.241, 0.000)
		colorBeach     (0.356, 0.310, 0.287, 0.000)
		colorDesert    (0.387, 0.333, 0.279, 0.000)
		colorLowland   (0.425, 0.355, 0.317, 0.000)
		colorUpland    (0.470, 0.431, 0.385, 0.000)
		colorRock      (0.508, 0.469, 0.415, 0.000)
		colorSnow      (0.553, 0.499, 0.438, 1.000)
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
		MaxLength   0.867409
		GasToDust   0.25
		Particles   2732
		GasBright   0.0993285
		DustBright  0.637892
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   40.0748
		Period          258.238
		Eccentricity    0.98501
		Inclination     65.9762
		AscendingNode   107.253
		ArgOfPericenter 57.6294
		MeanAnomaly     -20.0208
	}
}

Comet	"Beshqek C106"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            2.61201e-016
	Radius          0.0925702
	InertiaMoment   0.399327

	Oblateness      0.00774156

	RotationPeriod  61.1371
	Obliquity       143.22
	EqAscendNode    288.22

	AbsMagn         10.2944
	SlopeParam      6.503
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.689 0.683 0.681)

	Surface
	{
		SurfStyle       0.446229
		OceanStyle      0.860504
		Randomize      (-0.970, -0.508, 0.932)
		colorDistMagn   0.317534
		colorDistFreq   5.04201e-006
		detailScale     2.52778
		colorConversion true
		snowLevel       2
		tropicLatitude  0.944234
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.312217
		terraceProb     0.268073
		erosion         0
		montesMagn      0.572146
		montesFreq      2.44988
		montesSpiky     0.880817
		montesFraction  0.654902
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.1924e-005
		hillsFraction   0.484429
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239806
		craterFreq      0.158426
		craterDensity   0.692559
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.466971
		volcanoTemp     1771.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.276, 0.273, 0.272, 0.000)
		colorShelf     (0.293, 0.290, 0.290, 0.000)
		colorBeach     (0.310, 0.308, 0.307, 0.000)
		colorDesert    (0.327, 0.325, 0.324, 0.000)
		colorLowland   (0.344, 0.342, 0.341, 0.000)
		colorUpland    (0.362, 0.359, 0.358, 0.000)
		colorRock      (0.379, 0.376, 0.375, 0.000)
		colorSnow      (0.396, 0.393, 0.392, 1.000)
		BumpHeight      0.0833132
		BumpOffset      0.0166626
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.081718
		DustBright  0.339989
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   34.1157
		Period          202.835
		Eccentricity    0.985066
		Inclination     -143.297
		AscendingNode   150.965
		ArgOfPericenter -157.911
		MeanAnomaly     93.8518
	}
}

Comet	"Beshqek C107"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            2.02021e-012
	Radius          1.67011
	InertiaMoment   0.39801

	Oblateness      0.00623363

	RotationPeriod  59.2212
	Obliquity       96.4261
	EqAscendNode    272.797

	AbsMagn         6.76896
	SlopeParam      2.05464
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.657 0.654 0.648)

	Surface
	{
		SurfStyle       0.459617
		OceanStyle      0.955704
		Randomize      (0.387, -0.525, 0.149)
		colorDistMagn   0.796659
		colorDistFreq   0.0019826
		detailScale     45.6051
		colorConversion true
		snowLevel       2
		tropicLatitude  0.975866
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.388646
		terraceProb     0.549827
		erosion         0
		montesMagn      0.457664
		montesFreq      3.3545
		montesSpiky     0.957499
		montesFraction  0.527157
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00618333
		hillsFraction   0.634921
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234172
		craterFreq      0.216475
		craterDensity   0.990418
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.556529
		volcanoTemp     1814.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.263, 0.262, 0.259, 0.000)
		colorShelf     (0.279, 0.278, 0.275, 0.000)
		colorBeach     (0.296, 0.294, 0.291, 0.000)
		colorDesert    (0.312, 0.311, 0.308, 0.000)
		colorLowland   (0.329, 0.327, 0.324, 0.000)
		colorUpland    (0.345, 0.343, 0.340, 0.000)
		colorRock      (0.362, 0.360, 0.356, 0.000)
		colorSnow      (0.378, 0.376, 0.372, 1.000)
		BumpHeight      1.5031
		BumpOffset      0.300619
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.419043
		GasToDust   0.25
		Particles   1826
		GasBright   0.229108
		DustBright  0.677086
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   39.6205
		Period          253.859
		Eccentricity    0.976464
		Inclination     47.3535
		AscendingNode   -113.734
		ArgOfPericenter 72.1954
		MeanAnomaly     -55.6277
	}
}

Comet	"Beshqek C108"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            1.56248e-008
	Radius          36.1762
	InertiaMoment   0.399757

	Oblateness      0.00879611

	RotationPeriod  57.3365
	Obliquity       49.6318
	EqAscendNode    257.375

	AbsMagn         1.06055
	SlopeParam      2.81903
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.666 0.611 0.530)

	Surface
	{
		SurfStyle       0.322497
		OceanStyle      0.229814
		Randomize      (0.602, -0.540, 0.036)
		colorDistMagn   0.985402
		colorDistFreq   0.524057
		detailScale     987.851
		colorConversion true
		snowLevel       2
		tropicLatitude  0.819209
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.495981
		terraceProb     0.306724
		erosion         0
		montesMagn      0.528037
		montesFreq      2.64492
		montesSpiky     0.9752
		montesFraction  0.28669
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.44678
		hillsFraction   0.60162
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249482
		craterFreq      0.172638
		craterDensity   0.815183
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.401249
		volcanoTemp     1519.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.266, 0.244, 0.212, 0.000)
		colorShelf     (0.283, 0.260, 0.225, 0.000)
		colorBeach     (0.300, 0.275, 0.239, 0.000)
		colorDesert    (0.316, 0.290, 0.252, 0.000)
		colorLowland   (0.333, 0.305, 0.265, 0.000)
		colorUpland    (0.350, 0.321, 0.278, 0.000)
		colorRock      (0.366, 0.336, 0.292, 0.000)
		colorSnow      (0.383, 0.351, 0.305, 1.000)
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
		MaxLength   0.900235
		GasToDust   0.25
		Particles   2798
		GasBright   0.184215
		DustBright  0.406465
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   47.5503
		Period          333.766
		Eccentricity    0.982578
		Inclination     124.274
		AscendingNode   70.6371
		ArgOfPericenter 172.401
		MeanAnomaly     -54.6947
	}
}

Comet	"Beshqek C109"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            4.81101e-016
	Radius          0.103404
	InertiaMoment   0.398609

	Oblateness      0.00709544

	RotationPeriod  55.4772
	Obliquity       2.83746
	EqAscendNode    241.952

	AbsMagn         10.0526
	SlopeParam      3.4388
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.716 0.711 0.708)

	Surface
	{
		SurfStyle       0.594136
		OceanStyle      0.98347
		Randomize      (-0.819, 0.882, 0.592)
		colorDistMagn   0.743128
		colorDistFreq   5.06549e-006
		detailScale     2.82362
		colorConversion true
		snowLevel       2
		tropicLatitude  0.668021
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.58514
		terraceProb     0.223125
		erosion         0
		montesMagn      0.591911
		montesFreq      2.81719
		montesSpiky     0.979017
		montesFraction  0.759403
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.28309e-005
		hillsFraction   0.601123
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245902
		craterFreq      0.188449
		craterDensity   0.971754
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.624699
		volcanoTemp     1646.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.279, 0.242, 0.198, 0.000)
		colorShelf     (0.286, 0.249, 0.227, 0.000)
		colorBeach     (0.336, 0.291, 0.269, 0.000)
		colorDesert    (0.365, 0.313, 0.262, 0.000)
		colorLowland   (0.401, 0.334, 0.297, 0.000)
		colorUpland    (0.444, 0.405, 0.361, 0.000)
		colorRock      (0.479, 0.441, 0.389, 0.000)
		colorSnow      (0.522, 0.469, 0.411, 1.000)
		BumpHeight      0.0930636
		BumpOffset      0.0186127
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.102063
		DustBright  0.173103
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   43.3353
		Period          290.386
		Eccentricity    0.986047
		Inclination     135.269
		AscendingNode   -6.75437
		ArgOfPericenter 64.5997
		MeanAnomaly     -130.751
	}
}

Comet	"Beshqek C110"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            3.72096e-012
	Radius          2.24066
	InertiaMoment   0.396381

	Oblateness      0.00990231

	RotationPeriod  53.6376
	Obliquity       316.043
	EqAscendNode    226.529

	AbsMagn         6.54823
	SlopeParam      4.00795
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.787 0.785 0.783)

	Surface
	{
		SurfStyle       0.925707
		OceanStyle      0.478726
		Randomize      (-0.534, 0.210, -0.564)
		colorDistMagn   0.87995
		colorDistFreq   0.00337817
		detailScale     61.1849
		colorConversion true
		snowLevel       2
		tropicLatitude  0.807687
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.298059
		terraceProb     0.371814
		erosion         0
		montesMagn      0.415046
		montesFreq      2.39221
		montesSpiky     0.92761
		montesFraction  0.716342
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0145036
		hillsFraction   0.651222
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.277345
		craterFreq      0.248803
		craterDensity   0.802679
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.621174
		volcanoTemp     1525.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.267, 0.275, 0.313, 0.050)
		colorShelf     (0.315, 0.322, 0.360, 0.040)
		colorBeach     (0.362, 0.369, 0.407, 0.030)
		colorDesert    (0.409, 0.416, 0.462, 0.020)
		colorLowland   (0.456, 0.463, 0.509, 0.030)
		colorUpland    (0.504, 0.510, 0.556, 0.050)
		colorRock      (0.551, 0.557, 0.618, 0.020)
		colorSnow      (0.551, 0.557, 0.618, 1.000)
		BumpHeight      2.01659
		BumpOffset      0.403319
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.451869
		GasToDust   0.25
		Particles   1892
		GasBright   0.326621
		DustBright  0.433033
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   29.9645
		Period          166.964
		Eccentricity    0.990064
		Inclination     -169.597
		AscendingNode   -160.866
		ArgOfPericenter -158.63
		MeanAnomaly     123.567
	}
}

Comet	"Beshqek C111"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            2.8779e-008
	Radius          40.3942
	InertiaMoment   0.399103

	Oblateness      0.00812171

	RotationPeriod  51.8126
	Obliquity       269.249
	EqAscendNode    211.107

	AbsMagn         -0.168126
	SlopeParam      4.57775
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.644 0.641 0.639)

	Surface
	{
		SurfStyle       0.856348
		OceanStyle      0.625684
		Randomize      (-0.135, 0.287, -0.259)
		colorDistMagn   0.410894
		colorDistFreq   1.2072
		detailScale     1103.03
		colorConversion true
		snowLevel       2
		tropicLatitude  0.62578
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.422044
		terraceProb     0.100984
		erosion         0
		montesMagn      0.652159
		montesFreq      3.60093
		montesSpiky     0.848577
		montesFraction  0.382852
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.61538
		hillsFraction   0.68357
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213125
		craterFreq      0.221307
		craterDensity   0.880658
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.467827
		volcanoTemp     1323.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.219, 0.224, 0.256, 0.050)
		colorShelf     (0.257, 0.263, 0.294, 0.040)
		colorBeach     (0.296, 0.301, 0.332, 0.030)
		colorDesert    (0.335, 0.339, 0.377, 0.020)
		colorLowland   (0.373, 0.378, 0.416, 0.030)
		colorUpland    (0.412, 0.416, 0.454, 0.050)
		colorRock      (0.451, 0.455, 0.505, 0.020)
		colorSnow      (0.451, 0.455, 0.505, 1.000)
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
		MaxLength   0.933061
		GasToDust   0.25
		Particles   2864
		GasBright   0.217187
		DustBright  0.226953
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   39.1907
		Period          249.74
		Eccentricity    0.968931
		Inclination     -62.154
		AscendingNode   28.9199
		ArgOfPericenter -99.1794
		MeanAnomaly     -152.864
	}
}

Comet	"Beshqek C112"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            8.86125e-016
	Radius          0.138781
	InertiaMoment   0.397637

	Oblateness      0.0114249

	RotationPeriod  49.9973
	Obliquity       222.455
	EqAscendNode    195.684

	AbsMagn         9.818
	SlopeParam      5.19995
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.460 0.459 0.456)

	Surface
	{
		SurfStyle       0.936794
		OceanStyle      0.854863
		Randomize      (-0.236, 0.227, -0.082)
		colorDistMagn   0.364395
		colorDistFreq   4.91886e-006
		detailScale     3.78965
		colorConversion true
		snowLevel       2
		tropicLatitude  0.839751
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.469215
		terraceProb     0.253674
		erosion         0
		montesMagn      0.441776
		montesFreq      2.74776
		montesSpiky     0.959097
		montesFraction  0.800916
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.63844e-005
		hillsFraction   0.623455
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228629
		craterFreq      0.258776
		craterDensity   0.857743
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.573796
		volcanoTemp     1552.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.157, 0.161, 0.182, 0.050)
		colorShelf     (0.184, 0.188, 0.210, 0.040)
		colorBeach     (0.212, 0.216, 0.237, 0.030)
		colorDesert    (0.239, 0.243, 0.269, 0.020)
		colorLowland   (0.267, 0.271, 0.296, 0.030)
		colorUpland    (0.295, 0.298, 0.323, 0.050)
		colorRock      (0.322, 0.326, 0.360, 0.020)
		colorSnow      (0.322, 0.326, 0.360, 1.000)
		BumpHeight      0.124903
		BumpOffset      0.0249806
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.044621
		DustBright  0.884005
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   43.745
		Period          294.513
		Eccentricity    0.967005
		Inclination     90.3747
		AscendingNode   37.1303
		ArgOfPericenter -116.334
		MeanAnomaly     136.042
	}
}

Comet	"Beshqek C113"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            6.85354e-012
	Radius          2.50086
	InertiaMoment   0.399547

	Oblateness      0.00937236

	RotationPeriod  48.1871
	Obliquity       175.66
	EqAscendNode    180.262

	AbsMagn         6.32299
	SlopeParam      5.97104
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.726 0.724 0.722)

	Surface
	{
		SurfStyle       0.935406
		OceanStyle      0.8592
		Randomize      (0.129, -0.978, 0.462)
		colorDistMagn   0.830948
		colorDistFreq   0.00111803
		detailScale     68.2901
		colorConversion true
		snowLevel       2
		tropicLatitude  0.897537
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.508751
		terraceProb     0.51677
		erosion         0
		montesMagn      0.599908
		montesFreq      2.38229
		montesSpiky     0.946957
		montesFraction  0.810472
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0154041
		hillsFraction   0.465066
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22723
		craterFreq      0.195802
		craterDensity   0.953382
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.553596
		volcanoTemp     1578.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.247, 0.253, 0.289, 0.050)
		colorShelf     (0.290, 0.297, 0.332, 0.040)
		colorBeach     (0.334, 0.340, 0.375, 0.030)
		colorDesert    (0.377, 0.384, 0.426, 0.020)
		colorLowland   (0.421, 0.427, 0.469, 0.030)
		colorUpland    (0.464, 0.471, 0.513, 0.050)
		colorRock      (0.508, 0.514, 0.570, 0.020)
		colorSnow      (0.508, 0.514, 0.570, 1.000)
		BumpHeight      2.25077
		BumpOffset      0.450154
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.484694
		GasToDust   0.25
		Particles   1958
		GasBright   0.0656618
		DustBright  0.547451
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   33.2686
		Period          195.328
		Eccentricity    0.954177
		Inclination     -111.828
		AscendingNode   2.28983
		ArgOfPericenter -116.852
		MeanAnomaly     -83.651
	}
}

Comet	"Beshqek C114"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            5.30072e-008
	Radius          54.236
	InertiaMoment   0.398332

	Oblateness      0.0132829

	RotationPeriod  46.3774
	Obliquity       128.866
	EqAscendNode    164.839

	AbsMagn         17.6737
	SlopeParam      7.28762
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.599 0.478 0.407)

	Surface
	{
		SurfStyle       0.632947
		OceanStyle      0.447393
		Randomize      (-0.929, -0.314, -0.873)
		colorDistMagn   0.832827
		colorDistFreq   1.02165
		detailScale     1481
		colorConversion true
		snowLevel       2
		tropicLatitude  0.794216
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.508658
		terraceProb     0.460707
		erosion         0
		montesMagn      0.546991
		montesFreq      2.90306
		montesSpiky     0.873228
		montesFraction  0.58018
		dunesFraction   0
		hillsMagn       0
		hillsFreq       10.0086
		hillsFraction   0.6992
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.210924
		craterFreq      0.20195
		craterDensity   0.797165
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.435006
		volcanoTemp     1908.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.234, 0.162, 0.114, 0.000)
		colorShelf     (0.240, 0.167, 0.130, 0.000)
		colorBeach     (0.281, 0.196, 0.155, 0.000)
		colorDesert    (0.305, 0.210, 0.151, 0.000)
		colorLowland   (0.335, 0.225, 0.171, 0.000)
		colorUpland    (0.371, 0.272, 0.208, 0.000)
		colorRock      (0.401, 0.296, 0.224, 0.000)
		colorSnow      (0.437, 0.315, 0.236, 1.000)
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
		MaxLength   0.965886
		GasToDust   0.25
		Particles   2931
		GasBright   0.0494435
		DustBright  0.248156
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   39.5345
		Period          253.033
		Eccentricity    0.978306
		Inclination     -46.4637
		AscendingNode   -108.105
		ArgOfPericenter -71.5635
		MeanAnomaly     152.059
	}
}

Comet	"Beshqek C115"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            1.63213e-015
	Radius          0.154827
	InertiaMoment   0.39997

	Oblateness      0.0109363

	RotationPeriod  44.5636
	Obliquity       82.0717
	EqAscendNode    149.416

	AbsMagn         9.58952
	SlopeParam      2.45983
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.771 0.769 0.768)

	Surface
	{
		SurfStyle       0.369553
		OceanStyle      0.961612
		Randomize      (0.889, 0.635, -0.243)
		colorDistMagn   0.646461
		colorDistFreq   1.10723e-005
		detailScale     4.22781
		colorConversion true
		snowLevel       2
		tropicLatitude  0.96158
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.256145
		terraceProb     0.227901
		erosion         0
		montesMagn      0.615281
		montesFreq      3.17322
		montesSpiky     0.935408
		montesFraction  0.596533
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.74747e-005
		hillsFraction   0.359009
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24104
		craterFreq      0.190903
		craterDensity   0.899101
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.511053
		volcanoTemp     1458.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.308, 0.308, 0.307, 0.000)
		colorShelf     (0.328, 0.327, 0.326, 0.000)
		colorBeach     (0.347, 0.346, 0.345, 0.000)
		colorDesert    (0.366, 0.365, 0.365, 0.000)
		colorLowland   (0.385, 0.384, 0.384, 0.000)
		colorUpland    (0.405, 0.404, 0.403, 0.000)
		colorRock      (0.424, 0.423, 0.422, 0.000)
		colorSnow      (0.443, 0.442, 0.441, 1.000)
		BumpHeight      0.139344
		BumpOffset      0.0278689
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.0363285
		GasToDust   0.25
		Particles   1053
		GasBright   0.176115
		DustBright  0.605971
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   34.6342
		Period          207.477
		Eccentricity    0.98292
		Inclination     -76.8734
		AscendingNode   75.3961
		ArgOfPericenter -47.8653
		MeanAnomaly     126.392
	}
}

Comet	"Beshqek C116"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            1.26234e-011
	Radius          3.35928
	InertiaMoment   0.398868

	Oblateness      0.015636

	RotationPeriod  42.741
	Obliquity       35.2774
	EqAscendNode    133.994

	AbsMagn         6.09229
	SlopeParam      3.13507
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.779 0.703 0.610)

	Surface
	{
		SurfStyle       0.731448
		OceanStyle      0.0231056
		Randomize      (0.780, 0.968, -0.096)
		colorDistMagn   0.22779
		colorDistFreq   0.0088983
		detailScale     91.7306
		colorConversion true
		snowLevel       2
		tropicLatitude  0.542746
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.491377
		terraceProb     0.305472
		erosion         0
		montesMagn      0.477263
		montesFreq      3.54675
		montesSpiky     0.980061
		montesFraction  0.75438
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0296268
		hillsFraction   0.883225
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22878
		craterFreq      0.221667
		craterDensity   0.942837
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.527887
		volcanoTemp     1312.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.304, 0.239, 0.171, 0.000)
		colorShelf     (0.312, 0.246, 0.195, 0.000)
		colorBeach     (0.366, 0.288, 0.232, 0.000)
		colorDesert    (0.397, 0.309, 0.226, 0.000)
		colorLowland   (0.436, 0.330, 0.256, 0.000)
		colorUpland    (0.483, 0.401, 0.311, 0.000)
		colorRock      (0.522, 0.436, 0.336, 0.000)
		colorSnow      (0.569, 0.464, 0.354, 1.000)
		BumpHeight      3.02335
		BumpOffset      0.60467
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.51752
		GasToDust   0.25
		Particles   2025
		GasBright   0.132615
		DustBright  0.333958
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   27.2604
		Period          144.88
		Eccentricity    0.970341
		Inclination     133.379
		AscendingNode   48.308
		ArgOfPericenter 22.5053
		MeanAnomaly     -135.484
	}
}

Comet	"Beshqek C117"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            9.76328e-008
	Radius          60.4771
	InertiaMoment   0.397155

	Oblateness      0.0127965

	RotationPeriod  40.9048
	Obliquity       348.483
	EqAscendNode    118.571

	AbsMagn         15.607
	SlopeParam      3.72227
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.545 0.538 0.535)

	Surface
	{
		SurfStyle       0.261653
		OceanStyle      0.917669
		Randomize      (0.745, 0.299, -0.294)
		colorDistMagn   0.804042
		colorDistFreq   2.12715
		detailScale     1651.43
		colorConversion true
		snowLevel       2
		tropicLatitude  0.393545
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.294624
		terraceProb     0.139855
		erosion         0
		montesMagn      0.514302
		montesFreq      2.48712
		montesSpiky     0.926841
		montesFraction  0.578675
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.39672
		hillsFraction   0.511221
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227856
		craterFreq      0.246966
		craterDensity   0.907967
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.403403
		volcanoTemp     1502.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.218, 0.215, 0.214, 0.000)
		colorShelf     (0.232, 0.229, 0.227, 0.000)
		colorBeach     (0.245, 0.242, 0.241, 0.000)
		colorDesert    (0.259, 0.256, 0.254, 0.000)
		colorLowland   (0.272, 0.269, 0.268, 0.000)
		colorUpland    (0.286, 0.283, 0.281, 0.000)
		colorRock      (0.300, 0.296, 0.294, 0.000)
		colorSnow      (0.313, 0.310, 0.308, 1.000)
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
		MaxLength   0.998712
		GasToDust   0.25
		Particles   2997
		GasBright   0.326477
		DustBright  0.624583
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   24.4455
		Period          123.03
		Eccentricity    0.969064
		Inclination     164.707
		AscendingNode   60.5848
		ArgOfPericenter -8.94758
		MeanAnomaly     175.842
	}
}

Comet	"Beshqek C118"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            3.00619e-015
	Radius          0.208068
	InertiaMoment   0.399332

	Oblateness      0.0187226

	RotationPeriod  39.05
	Obliquity       301.689
	EqAscendNode    103.149

	AbsMagn         9.36613
	SlopeParam      4.286
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.799 0.714 0.673)

	Surface
	{
		SurfStyle       0.42627
		OceanStyle      0.82936
		Randomize      (-0.758, -0.958, -0.241)
		colorDistMagn   0.771985
		colorDistFreq   3.19759e-005
		detailScale     5.68165
		colorConversion true
		snowLevel       2
		tropicLatitude  0.907913
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.313111
		terraceProb     0.546988
		erosion         0
		montesMagn      0.401991
		montesFreq      2.49781
		montesSpiky     0.985436
		montesFraction  0.420972
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.9543e-005
		hillsFraction   0.716147
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243304
		craterFreq      0.210279
		craterDensity   0.984719
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51799
		volcanoTemp     1548.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.319, 0.286, 0.269, 0.000)
		colorShelf     (0.339, 0.304, 0.286, 0.000)
		colorBeach     (0.359, 0.321, 0.303, 0.000)
		colorDesert    (0.379, 0.339, 0.320, 0.000)
		colorLowland   (0.399, 0.357, 0.337, 0.000)
		colorUpland    (0.419, 0.375, 0.353, 0.000)
		colorRock      (0.439, 0.393, 0.370, 0.000)
		colorSnow      (0.459, 0.411, 0.387, 1.000)
		BumpHeight      0.187261
		BumpOffset      0.0374523
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.0691545
		GasToDust   0.25
		Particles   1119
		GasBright   0.255694
		DustBright  0.379852
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   27.7517
		Period          148.815
		Eccentricity    0.969724
		Inclination     100.116
		AscendingNode   52.3727
		ArgOfPericenter -43.9217
		MeanAnomaly     164.017
	}
}

Comet	"Beshqek C119"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            2.32507e-011
	Radius          3.74387
	InertiaMoment   0.398019

	Oblateness      0.0154877

	RotationPeriod  37.1711
	Obliquity       254.894
	EqAscendNode    87.7261

	AbsMagn         5.85507
	SlopeParam      4.87393
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.679 0.676 0.673)

	Surface
	{
		SurfStyle       0.90154
		OceanStyle      0.356463
		Randomize      (-0.415, -0.249, -0.871)
		colorDistMagn   0.943752
		colorDistFreq   0.00823896
		detailScale     102.233
		colorConversion true
		snowLevel       2
		tropicLatitude  0.95926
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.519987
		terraceProb     0.436569
		erosion         0
		montesMagn      0.546891
		montesFreq      2.86145
		montesSpiky     0.986124
		montesFraction  0.36525
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0312602
		hillsFraction   0.555745
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231978
		craterFreq      0.171824
		craterDensity   0.924579
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.457929
		volcanoTemp     1277.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.231, 0.236, 0.269, 0.050)
		colorShelf     (0.272, 0.277, 0.309, 0.040)
		colorBeach     (0.312, 0.318, 0.350, 0.030)
		colorDesert    (0.353, 0.358, 0.397, 0.020)
		colorLowland   (0.394, 0.399, 0.437, 0.030)
		colorUpland    (0.435, 0.439, 0.478, 0.050)
		colorRock      (0.475, 0.480, 0.531, 0.020)
		colorSnow      (0.475, 0.480, 0.531, 1.000)
		BumpHeight      3.36948
		BumpOffset      0.673896
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.550346
		GasToDust   0.25
		Particles   2091
		GasBright   0.147653
		DustBright  0.17238
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   35.2909
		Period          213.405
		Eccentricity    0.974595
		Inclination     3.85993
		AscendingNode   110.273
		ArgOfPericenter 152.842
		MeanAnomaly     62.74
	}
}

Comet	"Beshqek C120"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            1.79827e-007
	Radius          81.3143
	InertiaMoment   0.399762

	Oblateness      0.0229475

	RotationPeriod  35.2622
	Obliquity       208.1
	EqAscendNode    72.3035

	AbsMagn         14.6024
	SlopeParam      5.5512
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.450 0.443 0.440)

	Surface
	{
		SurfStyle       0.940322
		OceanStyle      0.498799
		Randomize      (0.675, -0.328, 0.201)
		colorDistMagn   0.556315
		colorDistFreq   3.99726
		detailScale     2220.42
		colorConversion true
		snowLevel       2
		tropicLatitude  0.857108
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.346289
		terraceProb     0.275689
		erosion         0
		montesMagn      0.427387
		montesFreq      2.46485
		montesSpiky     0.878211
		montesFraction  0.362717
		dunesFraction   0
		hillsMagn       0
		hillsFreq       13.4669
		hillsFraction   0.596647
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.216618
		craterFreq      0.254983
		craterDensity   0.899895
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.414984
		volcanoTemp     1493.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.153, 0.155, 0.176, 0.050)
		colorShelf     (0.180, 0.181, 0.202, 0.040)
		colorBeach     (0.207, 0.208, 0.229, 0.030)
		colorDesert    (0.234, 0.235, 0.260, 0.020)
		colorLowland   (0.261, 0.261, 0.286, 0.030)
		colorUpland    (0.288, 0.288, 0.312, 0.050)
		colorRock      (0.315, 0.314, 0.348, 0.020)
		colorSnow      (0.315, 0.314, 0.348, 1.000)
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
		GasBright   0.0164223
		DustBright  0.788097
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   24.6871
		Period          124.859
		Eccentricity    0.97109
		Inclination     55.7587
		AscendingNode   -92.7651
		ArgOfPericenter 50.9458
		MeanAnomaly     65.5157
	}
}

Comet	"Beshqek C121"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            5.53701e-015
	Radius          0.231758
	InertiaMoment   0.398616

	Oblateness      0.0192462

	RotationPeriod  33.3167
	Obliquity       161.306
	EqAscendNode    56.8809

	AbsMagn         9.14692
	SlopeParam      6.4862
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.692 0.689 0.688)

	Surface
	{
		SurfStyle       0.746473
		OceanStyle      0.0737156
		Randomize      (0.934, -0.746, -0.709)
		colorDistMagn   0.59025
		colorDistFreq   2.82541e-005
		detailScale     6.32853
		colorConversion true
		snowLevel       2
		tropicLatitude  0.993634
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.448438
		terraceProb     0.117012
		erosion         0
		montesMagn      0.662731
		montesFreq      2.78438
		montesSpiky     0.763446
		montesFraction  0.389319
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000162387
		hillsFraction   0.708847
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252826
		craterFreq      0.245568
		craterDensity   0.984781
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.45867
		volcanoTemp     1061.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.270, 0.234, 0.193, 0.000)
		colorShelf     (0.277, 0.241, 0.220, 0.000)
		colorBeach     (0.325, 0.283, 0.261, 0.000)
		colorDesert    (0.353, 0.303, 0.254, 0.000)
		colorLowland   (0.388, 0.324, 0.289, 0.000)
		colorUpland    (0.429, 0.393, 0.351, 0.000)
		colorRock      (0.464, 0.427, 0.378, 0.000)
		colorSnow      (0.505, 0.455, 0.399, 1.000)
		BumpHeight      0.208582
		BumpOffset      0.0417164
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.10198
		GasToDust   0.25
		Particles   1185
		GasBright   0.0388553
		DustBright  0.45015
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   28.0712
		Period          151.392
		Eccentricity    0.968197
		Inclination     -93.1929
		AscendingNode   79.2127
		ArgOfPericenter 129.569
		MeanAnomaly     -52.5141
	}
}

Comet	"Beshqek C122"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            4.28248e-011
	Radius          5.03651
	InertiaMoment   0.396408

	Oblateness      0.0286477

	RotationPeriod  31.3274
	Obliquity       114.512
	EqAscendNode    41.4583

	AbsMagn         5.61004
	SlopeParam      2.04221
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.822 0.758 0.691)

	Surface
	{
		SurfStyle       0.385927
		OceanStyle      0.797151
		Randomize      (0.483, 0.702, -0.306)
		colorDistMagn   0.291466
		colorDistFreq   0.0162248
		detailScale     137.53
		colorConversion true
		snowLevel       2
		tropicLatitude  0.774712
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.342702
		terraceProb     0.56641
		erosion         0
		montesMagn      0.623132
		montesFreq      2.99011
		montesSpiky     0.986751
		montesFraction  0.624178
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0585722
		hillsFraction   0.665425
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254617
		craterFreq      0.227234
		craterDensity   0.901435
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.456087
		volcanoTemp     1879.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.329, 0.303, 0.277, 0.000)
		colorShelf     (0.349, 0.322, 0.294, 0.000)
		colorBeach     (0.370, 0.341, 0.311, 0.000)
		colorDesert    (0.390, 0.360, 0.328, 0.000)
		colorLowland   (0.411, 0.379, 0.346, 0.000)
		colorUpland    (0.432, 0.398, 0.363, 0.000)
		colorRock      (0.452, 0.417, 0.380, 0.000)
		colorSnow      (0.473, 0.436, 0.398, 1.000)
		BumpHeight      4.53285
		BumpOffset      0.906571
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.583172
		GasToDust   0.25
		Particles   2157
		GasBright   0.134832
		DustBright  0.838661
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   35.9582
		Period          219.488
		Eccentricity    0.955703
		Inclination     -128.304
		AscendingNode   -58.3031
		ArgOfPericenter 171.185
		MeanAnomaly     47.4529
	}
}

Comet	"Beshqek C123"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            3.31219e-007
	Radius          90.5171
	InertiaMoment   0.399109

	Oblateness      0.0248547

	RotationPeriod  29.2858
	Obliquity       67.7173
	EqAscendNode    26.0357

	AbsMagn         13.8967
	SlopeParam      2.80983
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.545 0.538 0.532)

	Surface
	{
		SurfStyle       0.223687
		OceanStyle      0.858524
		Randomize      (-0.571, -0.460, -0.065)
		colorDistMagn   0.426212
		colorDistFreq   1.91808
		detailScale     2471.72
		colorConversion true
		snowLevel       2
		tropicLatitude  0.930356
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.411183
		terraceProb     0.284862
		erosion         0
		montesMagn      0.451604
		montesFreq      2.55635
		montesSpiky     0.973503
		montesFraction  0.759924
		dunesFraction   0
		hillsMagn       0
		hillsFreq       21.8662
		hillsFraction   0.787913
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.21246
		craterFreq      0.348301
		craterDensity   0.739266
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.467639
		volcanoTemp     1298.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.218, 0.215, 0.213, 0.000)
		colorShelf     (0.231, 0.228, 0.226, 0.000)
		colorBeach     (0.245, 0.242, 0.239, 0.000)
		colorDesert    (0.259, 0.255, 0.253, 0.000)
		colorLowland   (0.272, 0.269, 0.266, 0.000)
		colorUpland    (0.286, 0.282, 0.279, 0.000)
		colorRock      (0.300, 0.296, 0.293, 0.000)
		colorSnow      (0.313, 0.309, 0.306, 1.000)
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
		GasBright   0.129983
		DustBright  0.527996
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   33.8835
		Period          200.768
		Eccentricity    0.971776
		Inclination     -176.125
		AscendingNode   79.2603
		ArgOfPericenter -115.625
		MeanAnomaly     -51.7761
	}
}

Comet	"Beshqek C124"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            1.01985e-014
	Radius          0.311956
	InertiaMoment   0.397647

	Oblateness      0.0381456

	RotationPeriod  27.1821
	Obliquity       20.923
	EqAscendNode    10.6132

	AbsMagn         8.9311
	SlopeParam      3.43077
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.639 0.634 0.632)

	Surface
	{
		SurfStyle       0.672441
		OceanStyle      0.757218
		Randomize      (-0.750, 0.686, 0.877)
		colorDistMagn   0.309495
		colorDistFreq   6.42664e-005
		detailScale     8.51848
		colorConversion true
		snowLevel       2
		tropicLatitude  0.645891
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.574671
		terraceProb     0.178039
		erosion         0
		montesMagn      0.621529
		montesFreq      3.54098
		montesSpiky     0.968205
		montesFraction  0.31228
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000238955
		hillsFraction   0.607956
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221079
		craterFreq      0.218465
		craterDensity   0.91011
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.465567
		volcanoTemp     1469.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.249, 0.216, 0.177, 0.000)
		colorShelf     (0.255, 0.222, 0.202, 0.000)
		colorBeach     (0.300, 0.260, 0.240, 0.000)
		colorDesert    (0.326, 0.279, 0.234, 0.000)
		colorLowland   (0.358, 0.298, 0.265, 0.000)
		colorUpland    (0.396, 0.362, 0.322, 0.000)
		colorRock      (0.428, 0.393, 0.348, 0.000)
		colorSnow      (0.466, 0.419, 0.367, 1.000)
		BumpHeight      0.280761
		BumpOffset      0.0561521
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.134806
		GasToDust   0.25
		Particles   1252
		GasBright   0.0878744
		DustBright  0.254591
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   27.5145
		Period          146.911
		Eccentricity    0.96472
		Inclination     28.7736
		AscendingNode   71.2334
		ArgOfPericenter -163.634
		MeanAnomaly     -76.6001
	}
}

Comet	"Beshqek C125"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            7.8878e-011
	Radius          5.60285
	InertiaMoment   0.399553

	Oblateness      0.0340089

	RotationPeriod  25.0048
	Obliquity       334.129
	EqAscendNode    355.191

	AbsMagn         5.3557
	SlopeParam      4.00023
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.666 0.661 0.659)

	Surface
	{
		SurfStyle       0.277044
		OceanStyle      0.798027
		Randomize      (0.932, 0.259, 0.443)
		colorDistMagn   0.76624
		colorDistFreq   0.00693416
		detailScale     152.995
		colorConversion true
		snowLevel       2
		tropicLatitude  0.808735
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.578387
		terraceProb     0.397191
		erosion         0
		montesMagn      0.651998
		montesFreq      2.71872
		montesSpiky     0.97651
		montesFraction  0.544497
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0811875
		hillsFraction   0.639474
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.192506
		craterFreq      0.156721
		craterDensity   0.896557
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.388317
		volcanoTemp     1569.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.266, 0.264, 0.264, 0.000)
		colorShelf     (0.283, 0.281, 0.280, 0.000)
		colorBeach     (0.300, 0.297, 0.296, 0.000)
		colorDesert    (0.316, 0.314, 0.313, 0.000)
		colorLowland   (0.333, 0.330, 0.329, 0.000)
		colorUpland    (0.349, 0.347, 0.346, 0.000)
		colorRock      (0.366, 0.363, 0.362, 0.000)
		colorSnow      (0.383, 0.380, 0.379, 1.000)
		BumpHeight      5.04256
		BumpOffset      1.00851
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.615998
		GasToDust   0.25
		Particles   2224
		GasBright   0.261018
		DustBright  0.565934
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   30.5306
		Period          171.718
		Eccentricity    0.989245
		Inclination     -39.1792
		AscendingNode   66.6385
		ArgOfPericenter 45.9302
		MeanAnomaly     -131.264
	}
}

Comet	"Beshqek C126"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            6.10063e-007
	Radius          121.916
	InertiaMoment   0.39834

	Oblateness      0.0545281

	RotationPeriod  22.7398
	Obliquity       287.334
	EqAscendNode    339.768

	AbsMagn         13.3378
	SlopeParam      4.56971
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.665 0.660 0.654)

	Surface
	{
		SurfStyle       0.18525
		OceanStyle      0.0517173
		Randomize      (0.202, 0.179, 0.893)
		colorDistMagn   0.731146
		colorDistFreq   2.52868
		detailScale     3329.11
		colorConversion true
		snowLevel       2
		tropicLatitude  0.993673
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.419292
		terraceProb     0.112791
		erosion         0
		montesMagn      0.370403
		montesFreq      2.45912
		montesSpiky     0.956562
		montesFraction  0.331362
		dunesFraction   0
		hillsMagn       0
		hillsFreq       30.5074
		hillsFraction   0.861371
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246788
		craterFreq      0.471134
		craterDensity   0.970012
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.495097
		volcanoTemp     1332.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.266, 0.264, 0.262, 0.000)
		colorShelf     (0.282, 0.280, 0.278, 0.000)
		colorBeach     (0.299, 0.297, 0.294, 0.000)
		colorDesert    (0.316, 0.313, 0.311, 0.000)
		colorLowland   (0.332, 0.330, 0.327, 0.000)
		colorUpland    (0.349, 0.346, 0.344, 0.000)
		colorRock      (0.366, 0.363, 0.360, 0.000)
		colorSnow      (0.382, 0.379, 0.376, 1.000)
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
		GasBright   0.191628
		DustBright  0.319811
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   24.3782
		Period          122.522
		Eccentricity    0.968236
		Inclination     -120.131
		AscendingNode   -108.493
		ArgOfPericenter 157.25
		MeanAnomaly     -113.802
	}
}

Comet	"Beshqek C127"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            1.87844e-014
	Radius          0.34679
	InertiaMoment   0.399975

	Oblateness      0.0511056

	RotationPeriod  20.3702
	Obliquity       240.54
	EqAscendNode    324.345

	AbsMagn         8.71796
	SlopeParam      5.19073
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.447 0.438 0.435)

	Surface
	{
		SurfStyle       0.795591
		OceanStyle      0.539122
		Randomize      (0.390, -0.913, -0.106)
		colorDistMagn   0.279383
		colorDistFreq   9.62022e-005
		detailScale     9.46967
		colorConversion true
		snowLevel       2
		tropicLatitude  0.970547
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.326862
		terraceProb     0.447699
		erosion         0
		montesMagn      0.513801
		montesFreq      3.11392
		montesSpiky     0.870435
		montesFraction  0.456679
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000356091
		hillsFraction   0.772433
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214295
		craterFreq      0.255771
		craterDensity   0.86169
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.531765
		volcanoTemp     1661.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.174, 0.149, 0.122, 0.000)
		colorShelf     (0.179, 0.153, 0.139, 0.000)
		colorBeach     (0.210, 0.180, 0.165, 0.000)
		colorDesert    (0.228, 0.193, 0.161, 0.000)
		colorLowland   (0.251, 0.206, 0.183, 0.000)
		colorUpland    (0.277, 0.250, 0.222, 0.000)
		colorRock      (0.300, 0.272, 0.239, 0.000)
		colorSnow      (0.327, 0.289, 0.252, 1.000)
		BumpHeight      0.312111
		BumpOffset      0.0624221
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.167632
		GasToDust   0.25
		Particles   1318
		GasBright   0.431962
		DustBright  0.563963
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   24.7775
		Period          125.545
		Eccentricity    0.972337
		Inclination     -47.3362
		AscendingNode   -98.2968
		ArgOfPericenter 165.39
		MeanAnomaly     -61.1671
	}
}

Comet	"Beshqek C128"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            1.45283e-010
	Radius          7.55137
	InertiaMoment   0.398874

	Oblateness      0.0882411

	RotationPeriod  17.8742
	Obliquity       193.746
	EqAscendNode    308.923

	AbsMagn         5.09018
	SlopeParam      5.95854
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.468 0.466 0.462)

	Surface
	{
		SurfStyle       0.0472981
		OceanStyle      0.0874986
		Randomize      (-0.265, -0.909, -0.078)
		colorDistMagn   0.411625
		colorDistFreq   0.0284055
		detailScale     206.203
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997867
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.285717
		terraceProb     0.220855
		erosion         0
		montesMagn      0.435937
		montesFreq      3.36801
		montesSpiky     0.860918
		montesFraction  0.426216
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.151895
		hillsFraction   0.600429
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.265188
		craterFreq      0.269055
		craterDensity   0.76192
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.594339
		volcanoTemp     1368.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.187, 0.186, 0.185, 0.000)
		colorShelf     (0.199, 0.198, 0.196, 0.000)
		colorBeach     (0.211, 0.210, 0.208, 0.000)
		colorDesert    (0.223, 0.221, 0.220, 0.000)
		colorLowland   (0.234, 0.233, 0.231, 0.000)
		colorUpland    (0.246, 0.245, 0.243, 0.000)
		colorRock      (0.258, 0.256, 0.254, 0.000)
		colorSnow      (0.269, 0.268, 0.266, 1.000)
		BumpHeight      6.79623
		BumpOffset      1.35925
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.648824
		GasToDust   0.25
		Particles   2290
		GasBright   0.33529
		DustBright  0.345122
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   49.0251
		Period          349.414
		Eccentricity    0.989359
		Inclination     74.9733
		AscendingNode   -35.6165
		ArgOfPericenter 33.9961
		MeanAnomaly     44.5973
	}
}

Comet	"Beshqek C129"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            4.47337e-018
	Radius          0.0214635
	InertiaMoment   0.39717

	Oblateness      0.0901317

	RotationPeriod  15.2243
	Obliquity       146.952
	EqAscendNode    293.5

	AbsMagn         12.8673
	SlopeParam      7.25819
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.749 0.747 0.744)

	Surface
	{
		SurfStyle       0.847985
		OceanStyle      0.706072
		Randomize      (-0.322, -0.371, -0.420)
		colorDistMagn   0.480802
		colorDistFreq   2.58327e-007
		detailScale     0.586096
		colorConversion true
		snowLevel       2
		tropicLatitude  0.880983
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.40491
		terraceProb     0.310992
		erosion         0
		montesMagn      0.54721
		montesFreq      3.24933
		montesSpiky     0.891945
		montesFraction  0.364004
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.19245e-006
		hillsFraction   0.758471
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243102
		craterFreq      0.256012
		craterDensity   0.84604
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.546511
		volcanoTemp     1275.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.292, 0.254, 0.208, 0.000)
		colorShelf     (0.299, 0.261, 0.238, 0.000)
		colorBeach     (0.352, 0.306, 0.283, 0.000)
		colorDesert    (0.382, 0.328, 0.275, 0.000)
		colorLowland   (0.419, 0.351, 0.312, 0.000)
		colorUpland    (0.464, 0.426, 0.379, 0.000)
		colorRock      (0.502, 0.463, 0.409, 0.000)
		colorSnow      (0.546, 0.493, 0.431, 1.000)
		BumpHeight      0.0193171
		BumpOffset      0.00386343
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.018909
		DustBright  0.345989
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   24.1342
		Period          120.688
		Eccentricity    0.986394
		Inclination     40.0104
		AscendingNode   -118.79
		ArgOfPericenter -124.156
		MeanAnomaly     47.2423
	}
}

Comet	"Beshqek C130"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            3.45983e-014
	Radius          0.467729
	InertiaMoment   0.399338

	Oblateness      0.183758

	RotationPeriod  12.3837
	Obliquity       100.157
	EqAscendNode    278.078

	AbsMagn         8.50684
	SlopeParam      2.44943
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.778 0.702 0.664)

	Surface
	{
		SurfStyle       0.525286
		OceanStyle      0.566403
		Randomize      (0.503, 0.793, 0.907)
		colorDistMagn   0.397804
		colorDistFreq   0.000146144
		detailScale     12.7721
		colorConversion true
		snowLevel       2
		tropicLatitude  0.948392
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.47559
		terraceProb     0.200174
		erosion         0
		montesMagn      0.600452
		montesFreq      3.11126
		montesSpiky     0.890553
		montesFraction  0.571034
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000680841
		hillsFraction   0.760029
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229681
		craterFreq      0.259178
		craterDensity   1.0255
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.487545
		volcanoTemp     1284.32
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.303, 0.239, 0.186, 0.000)
		colorShelf     (0.311, 0.246, 0.212, 0.000)
		colorBeach     (0.366, 0.288, 0.252, 0.000)
		colorDesert    (0.397, 0.309, 0.246, 0.000)
		colorLowland   (0.436, 0.330, 0.279, 0.000)
		colorUpland    (0.482, 0.400, 0.338, 0.000)
		colorRock      (0.521, 0.435, 0.365, 0.000)
		colorSnow      (0.568, 0.463, 0.385, 1.000)
		BumpHeight      0.420956
		BumpOffset      0.0841912
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.200458
		GasToDust   0.25
		Particles   1384
		GasBright   0.0941672
		DustBright  0.755218
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   36.7165
		Period          226.467
		Eccentricity    0.983356
		Inclination     148.766
		AscendingNode   -23.551
		ArgOfPericenter -63.1355
		MeanAnomaly     -107.598
	}
}

Comet	"Beshqek C131"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            2.67593e-010
	Radius          8.38127
	InertiaMoment   0.398028

	Oblateness      0.241099

	RotationPeriod  9.30189
	Obliquity       53.3629
	EqAscendNode    262.655

	AbsMagn         4.81117
	SlopeParam      3.12659
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.535 0.530 0.524)

	Surface
	{
		SurfStyle       0.315669
		OceanStyle      0.869159
		Randomize      (0.553, 0.486, -0.942)
		colorDistMagn   0.290691
		colorDistFreq   0.0285549
		detailScale     228.865
		colorConversion true
		snowLevel       2
		tropicLatitude  0.799967
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.464812
		terraceProb     0.234828
		erosion         0
		montesMagn      0.519169
		montesFreq      2.99867
		montesSpiky     0.911162
		montesFraction  0.669842
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.181526
		hillsFraction   0.615369
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238432
		craterFreq      0.203524
		craterDensity   0.731264
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.552137
		volcanoTemp     1398.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.214, 0.212, 0.210, 0.000)
		colorShelf     (0.227, 0.225, 0.223, 0.000)
		colorBeach     (0.241, 0.238, 0.236, 0.000)
		colorDesert    (0.254, 0.252, 0.249, 0.000)
		colorLowland   (0.267, 0.265, 0.262, 0.000)
		colorUpland    (0.281, 0.278, 0.275, 0.000)
		colorRock      (0.294, 0.291, 0.288, 0.000)
		colorSnow      (0.308, 0.305, 0.301, 1.000)
		BumpHeight      7.54314
		BumpOffset      1.50863
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.68165
		GasToDust   0.25
		Particles   2356
		GasBright   0.0907103
		DustBright  0.443161
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   29.9527
		Period          166.866
		Eccentricity    0.971875
		Inclination     -72.116
		AscendingNode   -56.922
		ArgOfPericenter 74.2719
		MeanAnomaly     -12.9982
	}
}

Comet	"Beshqek C132"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            8.2394e-018
	Radius          0.028971
	InertiaMoment   0.399768

	Oblateness      0.249

	RotationPeriod  5.90683
	Obliquity       6.56862
	EqAscendNode    247.232

	AbsMagn         12.4559
	SlopeParam      3.71447
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.649 0.594 0.567)

	Surface
	{
		SurfStyle       0.620212
		OceanStyle      0.96599
		Randomize      (-0.931, -0.673, -0.412)
		colorDistMagn   0.45492
		colorDistFreq   7.01634e-007
		detailScale     0.791101
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999635
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.529517
		terraceProb     0.140192
		erosion         0
		montesMagn      0.649497
		montesFreq      2.21281
		montesSpiky     0.949498
		montesFraction  0.426839
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.26565e-006
		hillsFraction   0.628156
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239809
		craterFreq      0.17407
		craterDensity   0.902077
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.542371
		volcanoTemp     1617.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.253, 0.202, 0.159, 0.000)
		colorShelf     (0.259, 0.208, 0.182, 0.000)
		colorBeach     (0.305, 0.243, 0.216, 0.000)
		colorDesert    (0.331, 0.261, 0.210, 0.000)
		colorLowland   (0.363, 0.279, 0.238, 0.000)
		colorUpland    (0.402, 0.338, 0.289, 0.000)
		colorRock      (0.435, 0.368, 0.312, 0.000)
		colorSnow      (0.474, 0.392, 0.329, 1.000)
		BumpHeight      0.0260739
		BumpOffset      0.00521478
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.0499943
		DustBright  0.168364
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   21.0228
		Period          98.1179
		Eccentricity    0.965972
		Inclination     -89.3036
		AscendingNode   -109.977
		ArgOfPericenter -50.5823
		MeanAnomaly     -129.893
	}
}

Comet	"Beshqek C133"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            6.37259e-014
	Radius          0.518671
	InertiaMoment   0.398623

	RotationPeriod  154.581
	Obliquity       319.774
	EqAscendNode    231.81

	AbsMagn         8.29712
	SlopeParam      4.2782
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.602 0.593 0.590)

	Surface
	{
		SurfStyle       0.881972
		OceanStyle      0.694875
		Randomize      (-0.488, 0.829, 0.384)
		colorDistMagn   0.0507336
		colorDistFreq   0.000226414
		detailScale     14.1632
		colorConversion true
		snowLevel       2
		tropicLatitude  0.609334
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.288696
		terraceProb     0.160547
		erosion         0
		montesMagn      0.524798
		montesFreq      3.50581
		montesSpiky     0.984687
		montesFraction  0.707576
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000623439
		hillsFraction   0.632952
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264421
		craterFreq      0.232312
		craterDensity   0.82909
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.583276
		volcanoTemp     1359.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.205, 0.208, 0.236, 0.050)
		colorShelf     (0.241, 0.243, 0.271, 0.040)
		colorBeach     (0.277, 0.279, 0.307, 0.030)
		colorDesert    (0.313, 0.315, 0.348, 0.020)
		colorLowland   (0.349, 0.350, 0.383, 0.030)
		colorUpland    (0.385, 0.386, 0.419, 0.050)
		colorRock      (0.421, 0.421, 0.466, 0.020)
		colorSnow      (0.421, 0.421, 0.466, 1.000)
		BumpHeight      0.466804
		BumpOffset      0.0933607
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.233284
		GasToDust   0.25
		Particles   1451
		GasBright   0.20242
		DustBright  0.500425
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   41.0934
		Period          268.146
		Eccentricity    0.980704
		Inclination     7.05238
		AscendingNode   63.6576
		ArgOfPericenter 165.996
		MeanAnomaly     -6.65127
	}
}

Comet	"Beshqek C134"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            4.92873e-010
	Radius          11.3223
	InertiaMoment   0.396434

	Oblateness      0.00190221

	RotationPeriod  120.795
	Obliquity       272.98
	EqAscendNode    216.387

	AbsMagn         4.51571
	SlopeParam      4.86545
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.511 0.428 0.318)

	Surface
	{
		SurfStyle       0.648527
		OceanStyle      0.859215
		Randomize      (-0.126, 0.091, 0.038)
		colorDistMagn   0.775791
		colorDistFreq   0.0867151
		detailScale     309.174
		colorConversion true
		snowLevel       2
		tropicLatitude  0.89755
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.512807
		terraceProb     0.603918
		erosion         0
		montesMagn      0.473571
		montesFreq      3.42112
		montesSpiky     0.850494
		montesFraction  0.61364
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.286965
		hillsFraction   0.6358
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245916
		craterFreq      0.154845
		craterDensity   0.967451
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.575907
		volcanoTemp     1477.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.199, 0.146, 0.089, 0.000)
		colorShelf     (0.204, 0.150, 0.102, 0.000)
		colorBeach     (0.240, 0.175, 0.121, 0.000)
		colorDesert    (0.261, 0.188, 0.118, 0.000)
		colorLowland   (0.286, 0.201, 0.134, 0.000)
		colorUpland    (0.317, 0.244, 0.162, 0.000)
		colorRock      (0.342, 0.265, 0.175, 0.000)
		colorSnow      (0.373, 0.282, 0.185, 1.000)
		BumpHeight      10.1901
		BumpOffset      2.03801
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.714476
		GasToDust   0.25
		Particles   2423
		GasBright   0.134422
		DustBright  0.252909
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   25.3498
		Period          129.919
		Eccentricity    0.970093
		Inclination     -42.4419
		AscendingNode   126.678
		ArgOfPericenter -5.77533
		MeanAnomaly     -20.9609
	}
}

Comet	"Beshqek C135"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            1.5176e-017
	Radius          0.0320954
	InertiaMoment   0.399115

	Oblateness      0.00170314

	RotationPeriod  110.354
	Obliquity       226.186
	EqAscendNode    200.965

	AbsMagn         12.087
	SlopeParam      5.5408
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.514 0.439 0.382)

	Surface
	{
		SurfStyle       0.706326
		OceanStyle      0.245044
		Randomize      (0.014, -0.861, -0.287)
		colorDistMagn   0.782771
		colorDistFreq   2.82818e-007
		detailScale     0.876418
		colorConversion true
		snowLevel       2
		tropicLatitude  0.94363
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.658237
		terraceProb     0.307431
		erosion         0
		montesMagn      0.515218
		montesFreq      2.99977
		montesSpiky     0.961789
		montesFraction  0.482194
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.72448e-006
		hillsFraction   0.670742
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238357
		craterFreq      0.267156
		craterDensity   0.834509
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.479316
		volcanoTemp     1499.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.201, 0.149, 0.107, 0.000)
		colorShelf     (0.206, 0.154, 0.122, 0.000)
		colorBeach     (0.242, 0.180, 0.145, 0.000)
		colorDesert    (0.262, 0.193, 0.141, 0.000)
		colorLowland   (0.288, 0.207, 0.160, 0.000)
		colorUpland    (0.319, 0.250, 0.195, 0.000)
		colorRock      (0.345, 0.272, 0.210, 0.000)
		colorSnow      (0.376, 0.290, 0.221, 1.000)
		BumpHeight      0.0288858
		BumpOffset      0.00577717
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.354038
		DustBright  0.51778
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   33.2318
		Period          195.004
		Eccentricity    0.977026
		Inclination     -102.144
		AscendingNode   47.4942
		ArgOfPericenter 11.6321
		MeanAnomaly     134.111
	}
}

Comet	"Beshqek C136"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            1.17375e-013
	Radius          0.701303
	InertiaMoment   0.397658

	Oblateness      0.00259897

	RotationPeriod  103.469
	Obliquity       179.391
	EqAscendNode    185.542

	AbsMagn         8.08822
	SlopeParam      6.46958
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.721 0.719 0.718)

	Surface
	{
		SurfStyle       0.738344
		OceanStyle      0.0282422
		Randomize      (-0.021, 0.107, -0.591)
		colorDistMagn   0.515615
		colorDistFreq   0.000121088
		detailScale     19.1503
		colorConversion true
		snowLevel       2
		tropicLatitude  0.746622
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.740548
		terraceProb     0.495551
		erosion         0
		montesMagn      0.485731
		montesFreq      3.62713
		montesSpiky     0.865435
		montesFraction  0.772054
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00136257
		hillsFraction   0.584283
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253956
		craterFreq      0.212295
		craterDensity   0.876696
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.430364
		volcanoTemp     1831.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.281, 0.244, 0.201, 0.000)
		colorShelf     (0.288, 0.252, 0.230, 0.000)
		colorBeach     (0.339, 0.295, 0.273, 0.000)
		colorDesert    (0.368, 0.316, 0.266, 0.000)
		colorLowland   (0.404, 0.338, 0.302, 0.000)
		colorUpland    (0.447, 0.410, 0.366, 0.000)
		colorRock      (0.483, 0.446, 0.395, 0.000)
		colorSnow      (0.526, 0.475, 0.417, 1.000)
		BumpHeight      0.631173
		BumpOffset      0.126235
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.26611
		GasToDust   0.25
		Particles   1517
		GasBright   0.258758
		DustBright  0.297547
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   19.1403
		Period          85.2381
		Eccentricity    0.953565
		Inclination     -131.43
		AscendingNode   63.249
		ArgOfPericenter 81.064
		MeanAnomaly     127.999
	}
}

Comet	"Beshqek C137"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            9.0781e-010
	Radius          12.5302
	InertiaMoment   0.399558

	Oblateness      0.00214448

	RotationPeriod  98.1671
	Obliquity       132.597
	EqAscendNode    170.119

	AbsMagn         4.19988
	SlopeParam      2.02972
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.476 0.471 0.469)

	Surface
	{
		SurfStyle       0.305243
		OceanStyle      0.393278
		Randomize      (0.215, 0.170, -0.700)
		colorDistMagn   0.969087
		colorDistFreq   0.118315
		detailScale     342.157
		colorConversion true
		snowLevel       2
		tropicLatitude  0.887989
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.324955
		terraceProb     0.357772
		erosion         0
		montesMagn      0.531651
		montesFreq      2.75787
		montesSpiky     0.956749
		montesFraction  0.721457
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.499074
		hillsFraction   0.525301
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245752
		craterFreq      0.235277
		craterDensity   0.757905
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.46705
		volcanoTemp     1442.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.191, 0.188, 0.188, 0.000)
		colorShelf     (0.202, 0.200, 0.199, 0.000)
		colorBeach     (0.214, 0.212, 0.211, 0.000)
		colorDesert    (0.226, 0.224, 0.223, 0.000)
		colorLowland   (0.238, 0.236, 0.235, 0.000)
		colorUpland    (0.250, 0.247, 0.246, 0.000)
		colorRock      (0.262, 0.259, 0.258, 0.000)
		colorSnow      (0.274, 0.271, 0.270, 1.000)
		BumpHeight      11.2772
		BumpOffset      2.25543
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.747302
		GasToDust   0.25
		Particles   2489
		GasBright   0.00582278
		DustBright  0.234968
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   33.7301
		Period          199.406
		Eccentricity    0.956693
		Inclination     76.5371
		AscendingNode   149.595
		ArgOfPericenter 96.5471
		MeanAnomaly     -7.4042
	}
}

Comet	"Beshqek C138"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            2.79522e-017
	Radius          0.0434389
	InertiaMoment   0.398347

	Oblateness      0.00316567

	RotationPeriod  93.7734
	Obliquity       85.8028
	EqAscendNode    154.697

	AbsMagn         11.7498
	SlopeParam      2.80061
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.712 0.709 0.709)

	Surface
	{
		SurfStyle       0.197372
		OceanStyle      0.246553
		Randomize      (-0.813, -0.744, 0.325)
		colorDistMagn   0.123918
		colorDistFreq   8.93365e-007
		detailScale     1.18617
		colorConversion true
		snowLevel       2
		tropicLatitude  0.965669
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.41929
		terraceProb     0.203697
		erosion         0
		montesMagn      0.548583
		montesFreq      2.73542
		montesSpiky     0.936462
		montesFraction  0.755046
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.42971e-006
		hillsFraction   0.501098
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230352
		craterFreq      0.21315
		craterDensity   0.864168
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.551994
		volcanoTemp     1269.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.285, 0.284, 0.283, 0.000)
		colorShelf     (0.302, 0.301, 0.301, 0.000)
		colorBeach     (0.320, 0.319, 0.319, 0.000)
		colorDesert    (0.338, 0.337, 0.337, 0.000)
		colorLowland   (0.356, 0.355, 0.354, 0.000)
		colorUpland    (0.374, 0.372, 0.372, 0.000)
		colorRock      (0.391, 0.390, 0.390, 0.000)
		colorSnow      (0.409, 0.408, 0.407, 1.000)
		BumpHeight      0.039095
		BumpOffset      0.007819
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.0603628
		DustBright  0.664915
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   37.7336
		Period          235.942
		Eccentricity    0.970137
		Inclination     -157.046
		AscendingNode   -119.644
		ArgOfPericenter -142.373
		MeanAnomaly     52.4
	}
}

Comet	"Beshqek C139"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            2.1619e-013
	Radius          0.775234
	InertiaMoment   0.39998

	Oblateness      0.00254277

	RotationPeriod  89.9725
	Obliquity       39.0085
	EqAscendNode    139.274

	AbsMagn         7.87956
	SlopeParam      3.42273
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.680 0.677 0.675)

	Surface
	{
		SurfStyle       0.486818
		OceanStyle      0.0546769
		Randomize      (-0.675, 0.201, -0.963)
		colorDistMagn   0.357135
		colorDistFreq   0.000387809
		detailScale     21.1691
		colorConversion true
		snowLevel       2
		tropicLatitude  0.613397
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.352823
		terraceProb     0.108048
		erosion         0
		montesMagn      0.605353
		montesFreq      3.15054
		montesSpiky     0.949893
		montesFraction  0.652377
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00123696
		hillsFraction   0.764633
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242266
		craterFreq      0.241677
		craterDensity   0.870997
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.469221
		volcanoTemp     1863.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.272, 0.271, 0.270, 0.000)
		colorShelf     (0.289, 0.288, 0.287, 0.000)
		colorBeach     (0.306, 0.305, 0.304, 0.000)
		colorDesert    (0.323, 0.322, 0.321, 0.000)
		colorLowland   (0.340, 0.339, 0.337, 0.000)
		colorUpland    (0.357, 0.356, 0.354, 0.000)
		colorRock      (0.374, 0.372, 0.371, 0.000)
		colorSnow      (0.391, 0.389, 0.388, 1.000)
		BumpHeight      0.69771
		BumpOffset      0.139542
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.298936
		GasToDust   0.25
		Particles   1583
		GasBright   0.0582981
		DustBright  0.351466
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   33.7912
		Period          199.948
		Eccentricity    0.97799
		Inclination     104.066
		AscendingNode   10.1939
		ArgOfPericenter -77.1922
		MeanAnomaly     82.9845
	}
}

Comet	"Beshqek C140"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            1.67207e-009
	Radius          16.9767
	InertiaMoment   0.39888

	Oblateness      0.00371231

	RotationPeriod  86.5895
	Obliquity       352.214
	EqAscendNode    123.852

	AbsMagn         3.85839
	SlopeParam      3.99252
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.539 0.534 0.530)

	Surface
	{
		SurfStyle       0.71801
		OceanStyle      0.217745
		Randomize      (-0.503, 0.138, 0.813)
		colorDistMagn   0.00330406
		colorDistFreq   0.138339
		detailScale     463.576
		colorConversion true
		snowLevel       2
		tropicLatitude  0.212147
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.295501
		terraceProb     0.408919
		erosion         0
		montesMagn      0.558613
		montesFreq      3.2087
		montesSpiky     0.967511
		montesFraction  0.573592
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.606796
		hillsFraction   0.600222
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.268869
		craterFreq      0.224253
		craterDensity   0.953937
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.513245
		volcanoTemp     1453.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.210, 0.181, 0.148, 0.000)
		colorShelf     (0.216, 0.187, 0.170, 0.000)
		colorBeach     (0.254, 0.219, 0.201, 0.000)
		colorDesert    (0.275, 0.235, 0.196, 0.000)
		colorLowland   (0.302, 0.251, 0.223, 0.000)
		colorUpland    (0.334, 0.304, 0.270, 0.000)
		colorRock      (0.361, 0.331, 0.292, 0.000)
		colorSnow      (0.394, 0.352, 0.307, 1.000)
		BumpHeight      15.279
		BumpOffset      3.0558
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.780128
		GasToDust   0.25
		Particles   2555
		GasBright   0.180028
		DustBright  0.714222
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   45.4428
		Period          311.824
		Eccentricity    0.989464
		Inclination     20.0117
		AscendingNode   3.41367
		ArgOfPericenter -17.2801
		MeanAnomaly     -114.088
	}
}

Comet	"Beshqek C141"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            5.14844e-017
	Radius          0.0479581
	InertiaMoment   0.397184

	Oblateness      0.00290317

	RotationPeriod  83.5169
	Obliquity       305.42
	EqAscendNode    108.429

	AbsMagn         11.4375
	SlopeParam      4.56168
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.428 0.425 0.422)

	Surface
	{
		SurfStyle       0.456101
		OceanStyle      0.941297
		Randomize      (-0.079, 0.902, -0.764)
		colorDistMagn   0.666621
		colorDistFreq   1.76956e-006
		detailScale     1.30958
		colorConversion true
		snowLevel       2
		tropicLatitude  0.593932
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.271065
		terraceProb     0.339103
		erosion         0
		montesMagn      0.544317
		montesFreq      3.17575
		montesSpiky     0.946419
		montesFraction  0.720348
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.36869e-006
		hillsFraction   0.582711
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236478
		craterFreq      0.261126
		craterDensity   0.838384
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.492114
		volcanoTemp     1801.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.171, 0.170, 0.169, 0.000)
		colorShelf     (0.182, 0.181, 0.179, 0.000)
		colorBeach     (0.192, 0.191, 0.190, 0.000)
		colorDesert    (0.203, 0.202, 0.201, 0.000)
		colorLowland   (0.214, 0.212, 0.211, 0.000)
		colorUpland    (0.225, 0.223, 0.222, 0.000)
		colorRock      (0.235, 0.234, 0.232, 0.000)
		colorSnow      (0.246, 0.244, 0.243, 1.000)
		BumpHeight      0.0431623
		BumpOffset      0.00863246
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.150682
		DustBright  0.428055
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   28.6434
		Period          156.044
		Eccentricity    0.977353
		Inclination     -62.5308
		AscendingNode   -137.982
		ArgOfPericenter 23.6365
		MeanAnomaly     -41.7811
	}
}

Comet	"Beshqek C142"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            3.98195e-013
	Radius          1.05154
	InertiaMoment   0.399343

	Oblateness      0.00427411

	RotationPeriod  80.6834
	Obliquity       258.626
	EqAscendNode    93.0065

	AbsMagn         7.67057
	SlopeParam      5.18153
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.693 0.557 0.474)

	Surface
	{
		SurfStyle       0.932937
		OceanStyle      0.781496
		Randomize      (0.908, -0.720, -0.498)
		colorDistMagn   0.455702
		colorDistFreq   0.000590679
		detailScale     28.7142
		colorConversion true
		snowLevel       2
		tropicLatitude  0.982872
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.576382
		terraceProb     0.407926
		erosion         0
		montesMagn      0.542006
		montesFreq      3.42787
		montesSpiky     0.786719
		montesFraction  0.245183
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00323018
		hillsFraction   0.712592
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.267594
		craterFreq      0.177607
		craterDensity   0.844897
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50874
		volcanoTemp     1233.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.236, 0.195, 0.190, 0.050)
		colorShelf     (0.277, 0.228, 0.218, 0.040)
		colorBeach     (0.319, 0.262, 0.246, 0.030)
		colorDesert    (0.360, 0.295, 0.280, 0.020)
		colorLowland   (0.402, 0.328, 0.308, 0.030)
		colorUpland    (0.444, 0.362, 0.337, 0.050)
		colorRock      (0.485, 0.395, 0.374, 0.020)
		colorSnow      (0.485, 0.395, 0.374, 1.000)
		BumpHeight      0.94639
		BumpOffset      0.189278
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.331762
		GasToDust   0.25
		Particles   1650
		GasBright   0.0840758
		DustBright  0.179148
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   26.7014
		Period          140.448
		Eccentricity    0.964213
		Inclination     1.70332
		AscendingNode   -63.8477
		ArgOfPericenter -78.031
		MeanAnomaly     -55.4025
	}
}

Comet	"Beshqek C143"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            3.07975e-009
	Radius          18.7171
	InertiaMoment   0.398036

	Oblateness      0.00331491

	RotationPeriod  78.0392
	Obliquity       211.831
	EqAscendNode    77.5839

	AbsMagn         3.48368
	SlopeParam      5.94611
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.470 0.466 0.464)

	Surface
	{
		SurfStyle       0.736936
		OceanStyle      0.92409
		Randomize      (-0.738, -0.688, 0.547)
		colorDistMagn   0.655845
		colorDistFreq   0.146954
		detailScale     511.101
		colorConversion true
		snowLevel       2
		tropicLatitude  0.563308
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.574351
		terraceProb     0.461304
		erosion         0
		montesMagn      0.393448
		montesFreq      3.1089
		montesSpiky     0.878556
		montesFraction  0.753416
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.98606
		hillsFraction   0.77681
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.289116
		craterFreq      0.187723
		craterDensity   0.941327
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.472127
		volcanoTemp     1628.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.183, 0.158, 0.130, 0.000)
		colorShelf     (0.188, 0.163, 0.148, 0.000)
		colorBeach     (0.221, 0.191, 0.176, 0.000)
		colorDesert    (0.240, 0.205, 0.172, 0.000)
		colorLowland   (0.263, 0.219, 0.195, 0.000)
		colorUpland    (0.291, 0.265, 0.236, 0.000)
		colorRock      (0.315, 0.289, 0.255, 0.000)
		colorSnow      (0.343, 0.307, 0.269, 1.000)
		BumpHeight      16.8454
		BumpOffset      3.36907
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.812954
		GasToDust   0.25
		Particles   2622
		GasBright   0.282973
		DustBright  0.464737
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   47.2232
		Period          330.328
		Eccentricity    0.981085
		Inclination     3.66092
		AscendingNode   50.0525
		ArgOfPericenter 40.3632
		MeanAnomaly     -149.606
	}
}

Comet	"Beshqek C144"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            9.4828e-017
	Radius          0.0651334
	InertiaMoment   0.399773

	Oblateness      0.00487255

	RotationPeriod  75.548
	Obliquity       165.037
	EqAscendNode    62.1613

	AbsMagn         11.1448
	SlopeParam      7.22944
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.730 0.728 0.726)

	Surface
	{
		SurfStyle       0.983892
		OceanStyle      0.939555
		Randomize      (-0.910, -0.305, 0.722)
		colorDistMagn   0.985786
		colorDistFreq   2.73463e-006
		detailScale     1.77858
		colorConversion true
		snowLevel       2
		tropicLatitude  0.38034
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.570793
		terraceProb     0.1419
		erosion         0
		montesMagn      0.510485
		montesFreq      3.21397
		montesSpiky     0.988237
		montesFraction  0.67105
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.24961e-005
		hillsFraction   0.458127
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251223
		craterFreq      0.211822
		craterDensity   0.95431
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.397116
		volcanoTemp     1597.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.248, 0.255, 0.290, 0.050)
		colorShelf     (0.292, 0.299, 0.334, 0.040)
		colorBeach     (0.336, 0.342, 0.377, 0.030)
		colorDesert    (0.380, 0.386, 0.428, 0.020)
		colorLowland   (0.424, 0.430, 0.472, 0.030)
		colorUpland    (0.467, 0.473, 0.515, 0.050)
		colorRock      (0.511, 0.517, 0.573, 0.020)
		colorSnow      (0.511, 0.517, 0.573, 1.000)
		BumpHeight      0.0586201
		BumpOffset      0.011724
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.189086
		DustBright  0.243111
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   24.3271
		Period          122.137
		Eccentricity    0.95738
		Inclination     17.7264
		AscendingNode   86.629
		ArgOfPericenter 86.0217
		MeanAnomaly     83.5566
	}
}

Comet	"Beshqek C145"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            7.33424e-013
	Radius          1.15758
	InertiaMoment   0.398629

	Oblateness      0.00375278

	RotationPeriod  73.1822
	Obliquity       118.243
	EqAscendNode    46.7388

	AbsMagn         7.46068
	SlopeParam      2.43898
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.756 0.753 0.751)

	Surface
	{
		SurfStyle       0.154558
		OceanStyle      0.364204
		Randomize      (0.944, 0.124, 0.751)
		colorDistMagn   0.394391
		colorDistFreq   0.000460125
		detailScale     31.6097
		colorConversion true
		snowLevel       2
		tropicLatitude  0.741956
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.530382
		terraceProb     0.168857
		erosion         0
		montesMagn      0.487126
		montesFreq      2.74524
		montesSpiky     0.860718
		montesFraction  0.924384
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00396132
		hillsFraction   0.807564
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24844
		craterFreq      0.179038
		craterDensity   0.993613
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.513584
		volcanoTemp     1279.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.302, 0.301, 0.300, 0.000)
		colorShelf     (0.321, 0.320, 0.319, 0.000)
		colorBeach     (0.340, 0.339, 0.338, 0.000)
		colorDesert    (0.359, 0.358, 0.357, 0.000)
		colorLowland   (0.378, 0.377, 0.375, 0.000)
		colorUpland    (0.397, 0.395, 0.394, 0.000)
		colorRock      (0.416, 0.414, 0.413, 0.000)
		colorSnow      (0.435, 0.433, 0.432, 1.000)
		BumpHeight      1.04182
		BumpOffset      0.208365
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.364588
		GasToDust   0.25
		Particles   1716
		GasBright   0.455174
		DustBright  0.46151
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   22.4785
		Period          108.483
		Eccentricity    0.952779
		Inclination     35.7671
		AscendingNode   -56.1938
		ArgOfPericenter 61.8788
		MeanAnomaly     83.649
	}
}

Comet	"Beshqek C146"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            5.67251e-009
	Radius          25.4554
	InertiaMoment   0.396459

	Oblateness      0.00544946

	RotationPeriod  70.9204
	Obliquity       71.4485
	EqAscendNode    31.3162

	AbsMagn         3.06448
	SlopeParam      3.11809
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.815 0.772 0.738)

	Surface
	{
		SurfStyle       0.0798448
		OceanStyle      0.829798
		Randomize      (0.925, 0.188, -0.404)
		colorDistMagn   0.279784
		colorDistFreq   0.273229
		detailScale     695.103
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999565
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.588727
		terraceProb     0.160415
		erosion         0
		montesMagn      0.64397
		montesFreq      3.52892
		montesSpiky     0.873343
		montesFraction  0.373637
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.46698
		hillsFraction   0.563362
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240668
		craterFreq      0.227398
		craterDensity   0.697922
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53861
		volcanoTemp     1650.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.326, 0.309, 0.295, 0.000)
		colorShelf     (0.347, 0.328, 0.314, 0.000)
		colorBeach     (0.367, 0.347, 0.332, 0.000)
		colorDesert    (0.387, 0.367, 0.350, 0.000)
		colorLowland   (0.408, 0.386, 0.369, 0.000)
		colorUpland    (0.428, 0.405, 0.387, 0.000)
		colorRock      (0.448, 0.424, 0.406, 0.000)
		colorSnow      (0.469, 0.444, 0.424, 1.000)
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
		MaxLength   0.84578
		GasToDust   0.25
		Particles   2688
		GasBright   0.0334186
		DustBright  0.567751
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   36.8727
		Period          227.913
		Eccentricity    0.969505
		Inclination     133.093
		AscendingNode   105.746
		ArgOfPericenter 31.2509
		MeanAnomaly     66.0644
	}
}

Comet	"Beshqek C147"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            1.74661e-016
	Radius          0.0715797
	InertiaMoment   0.399121

	Oblateness      0.00423006

	RotationPeriod  68.7458
	Obliquity       24.6542
	EqAscendNode    15.8936

	AbsMagn         10.868
	SlopeParam      3.70668
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.779 0.777 0.775)

	Surface
	{
		SurfStyle       0.104635
		OceanStyle      0.0353795
		Randomize      (-0.790, 0.270, 0.847)
		colorDistMagn   0.501164
		colorDistFreq   3.42073e-006
		detailScale     1.9546
		colorConversion true
		snowLevel       2
		tropicLatitude  0.934747
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.717874
		terraceProb     0.237613
		erosion         0
		montesMagn      0.438473
		montesFreq      4.02712
		montesSpiky     0.895192
		montesFraction  0.686205
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.87523e-006
		hillsFraction   0.674954
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251041
		craterFreq      0.140152
		craterDensity   0.883019
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.499749
		volcanoTemp     1149.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.312, 0.311, 0.310, 0.000)
		colorShelf     (0.331, 0.330, 0.329, 0.000)
		colorBeach     (0.351, 0.350, 0.349, 0.000)
		colorDesert    (0.370, 0.369, 0.368, 0.000)
		colorLowland   (0.390, 0.389, 0.387, 0.000)
		colorUpland    (0.409, 0.408, 0.407, 0.000)
		colorRock      (0.429, 0.427, 0.426, 0.000)
		colorSnow      (0.448, 0.447, 0.446, 1.000)
		BumpHeight      0.0644217
		BumpOffset      0.0128843
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.0327461
		DustBright  0.25291
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   29.3661
		Period          161.988
		Eccentricity    0.983791
		Inclination     -88.0445
		AscendingNode   -157.922
		ArgOfPericenter -173.411
		MeanAnomaly     59.5558
	}
}

Comet	"Beshqek C148"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            1.35088e-012
	Radius          1.57673
	InertiaMoment   0.397668

	Oblateness      0.00618631

	RotationPeriod  66.6444
	Obliquity       337.86
	EqAscendNode    0.470989

	AbsMagn         7.24929
	SlopeParam      4.27042
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.627 0.625 0.623)

	Surface
	{
		SurfStyle       0.560808
		OceanStyle      0.29693
		Randomize      (0.043, -0.437, 0.057)
		colorDistMagn   0.173888
		colorDistFreq   0.0010922
		detailScale     43.0553
		colorConversion true
		snowLevel       2
		tropicLatitude  0.616424
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.369703
		terraceProb     0.191014
		erosion         0
		montesMagn      0.506934
		montesFreq      2.86165
		montesSpiky     0.975403
		montesFraction  0.639462
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00521586
		hillsFraction   0.54428
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256936
		craterFreq      0.185178
		craterDensity   0.681387
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.424856
		volcanoTemp     1131.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.245, 0.212, 0.175, 0.000)
		colorShelf     (0.251, 0.219, 0.199, 0.000)
		colorBeach     (0.295, 0.256, 0.237, 0.000)
		colorDesert    (0.320, 0.275, 0.231, 0.000)
		colorLowland   (0.351, 0.294, 0.262, 0.000)
		colorUpland    (0.389, 0.356, 0.318, 0.000)
		colorRock      (0.420, 0.387, 0.343, 0.000)
		colorSnow      (0.458, 0.412, 0.362, 1.000)
		BumpHeight      1.41906
		BumpOffset      0.283812
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.397414
		GasToDust   0.25
		Particles   1782
		GasBright   0.133758
		DustBright  0.636385
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   35.2851
		Period          213.353
		Eccentricity    0.974797
		Inclination     18.209
		AscendingNode   -141.736
		ArgOfPericenter -77.0426
		MeanAnomaly     -134.787
	}
}

Comet	"Beshqek C149"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            1.04481e-008
	Radius          27.9214
	InertiaMoment   0.399563

	Oblateness      0.00476029

	RotationPeriod  64.6047
	Obliquity       291.066
	EqAscendNode    345.048

	AbsMagn         2.58267
	SlopeParam      4.85698
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.435 0.429 0.423)

	Surface
	{
		SurfStyle       0.511234
		OceanStyle      0.0569656
		Randomize      (-0.959, -0.603, 0.515)
		colorDistMagn   0.589361
		colorDistFreq   0.558872
		detailScale     762.441
		colorConversion true
		snowLevel       2
		tropicLatitude  0.889193
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.507624
		terraceProb     0.132475
		erosion         0
		montesMagn      0.348331
		montesFreq      3.02443
		montesSpiky     0.89941
		montesFraction  0.327252
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.29214
		hillsFraction   0.879255
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238778
		craterFreq      0.203119
		craterDensity   0.770594
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.558229
		volcanoTemp     1466.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.170, 0.146, 0.118, 0.000)
		colorShelf     (0.174, 0.150, 0.135, 0.000)
		colorBeach     (0.204, 0.176, 0.161, 0.000)
		colorDesert    (0.222, 0.189, 0.156, 0.000)
		colorLowland   (0.244, 0.202, 0.178, 0.000)
		colorUpland    (0.270, 0.244, 0.216, 0.000)
		colorRock      (0.291, 0.266, 0.233, 0.000)
		colorSnow      (0.317, 0.283, 0.245, 1.000)
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
		MaxLength   0.878606
		GasToDust   0.25
		Particles   2754
		GasBright   0.105804
		DustBright  0.348826
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   36.2114
		Period          221.81
		Eccentricity    0.964966
		Inclination     -23.2365
		AscendingNode   110.221
		ArgOfPericenter 106.865
		MeanAnomaly     55.012
	}
}

Comet	"Beshqek C150"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            3.21704e-016
	Radius          0.0976646
	InertiaMoment   0.398355

	Oblateness      0.00701114

	RotationPeriod  62.617
	Obliquity       244.271
	EqAscendNode    329.626

	AbsMagn         10.6044
	SlopeParam      5.53044
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.734 0.732 0.728)

	Surface
	{
		SurfStyle       0.312609
		OceanStyle      0.486691
		Randomize      (0.906, 0.094, 0.314)
		colorDistMagn   0.710064
		colorDistFreq   3.12265e-006
		detailScale     2.6669
		colorConversion true
		snowLevel       2
		tropicLatitude  0.891538
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.267406
		terraceProb     0.166793
		erosion         0
		montesMagn      0.496739
		montesFreq      2.27182
		montesSpiky     0.99339
		montesFraction  0.323923
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.03212e-005
		hillsFraction   0.528149
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.272947
		craterFreq      0.180698
		craterDensity   0.873803
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.452338
		volcanoTemp     1444.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.294, 0.293, 0.291, 0.000)
		colorShelf     (0.312, 0.311, 0.309, 0.000)
		colorBeach     (0.330, 0.329, 0.328, 0.000)
		colorDesert    (0.349, 0.348, 0.346, 0.000)
		colorLowland   (0.367, 0.366, 0.364, 0.000)
		colorUpland    (0.385, 0.384, 0.382, 0.000)
		colorRock      (0.404, 0.402, 0.400, 0.000)
		colorSnow      (0.422, 0.421, 0.419, 1.000)
		BumpHeight      0.0878982
		BumpOffset      0.0175796
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.274006
		DustBright  0.66511
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   39.8636
		Period          256.198
		Eccentricity    0.981011
		Inclination     1.4504
		AscendingNode   146.322
		ArgOfPericenter -138.926
		MeanAnomaly     -101.946
	}
}

Comet	"Beshqek C151"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            2.48814e-012
	Radius          1.72572
	InertiaMoment   0.399985

	Oblateness      0.00535945

	RotationPeriod  60.6729
	Obliquity       197.477
	EqAscendNode    314.203

	AbsMagn         7.03578
	SlopeParam      6.45312
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.788 0.744 0.680)

	Surface
	{
		SurfStyle       0.560737
		OceanStyle      0.656553
		Randomize      (-0.058, 0.817, 0.738)
		colorDistMagn   0.0542871
		colorDistFreq   0.00181891
		detailScale     47.1237
		colorConversion true
		snowLevel       2
		tropicLatitude  0.776049
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.53212
		terraceProb     0.114518
		erosion         0
		montesMagn      0.397189
		montesFreq      3.49974
		montesSpiky     0.948261
		montesFraction  0.34115
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00606509
		hillsFraction   0.749498
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252676
		craterFreq      0.197455
		craterDensity   0.904727
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.481927
		volcanoTemp     1536.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.307, 0.253, 0.190, 0.000)
		colorShelf     (0.315, 0.260, 0.218, 0.000)
		colorBeach     (0.370, 0.305, 0.258, 0.000)
		colorDesert    (0.402, 0.327, 0.252, 0.000)
		colorLowland   (0.441, 0.350, 0.286, 0.000)
		colorUpland    (0.488, 0.424, 0.347, 0.000)
		colorRock      (0.528, 0.461, 0.374, 0.000)
		colorSnow      (0.575, 0.491, 0.395, 1.000)
		BumpHeight      1.55315
		BumpOffset      0.31063
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.43024
		GasToDust   0.25
		Particles   1848
		GasBright   0.21877
		DustBright  0.404833
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   35.3315
		Period          213.774
		Eccentricity    0.974703
		Inclination     124.926
		AscendingNode   69.9106
		ArgOfPericenter 156.002
		MeanAnomaly     72.6303
	}
}

Comet	"Beshqek C152"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            1.9244e-008
	Radius          38.1695
	InertiaMoment   0.398887

	Oblateness      0.00795975

	RotationPeriod  58.7651
	Obliquity       150.683
	EqAscendNode    298.781

	AbsMagn         2.00616
	SlopeParam      2.01714
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.749 0.746 0.743)

	Surface
	{
		SurfStyle       0.558631
		OceanStyle      0.739094
		Randomize      (0.260, -0.599, -0.451)
		colorDistMagn   0.335652
		colorDistFreq   0.560105
		detailScale     1042.28
		colorConversion true
		snowLevel       2
		tropicLatitude  0.647524
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.559742
		terraceProb     0.601477
		erosion         0
		montesMagn      0.542541
		montesFreq      3.09627
		montesSpiky     0.837012
		montesFraction  0.524337
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.10433
		hillsFraction   0.539259
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238047
		craterFreq      0.170152
		craterDensity   0.887834
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.6115
		volcanoTemp     1239.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.292, 0.254, 0.208, 0.000)
		colorShelf     (0.300, 0.261, 0.238, 0.000)
		colorBeach     (0.352, 0.306, 0.282, 0.000)
		colorDesert    (0.382, 0.328, 0.275, 0.000)
		colorLowland   (0.420, 0.351, 0.312, 0.000)
		colorUpland    (0.465, 0.425, 0.379, 0.000)
		colorRock      (0.502, 0.463, 0.409, 0.000)
		colorSnow      (0.547, 0.493, 0.431, 1.000)
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
		MaxLength   0.911432
		GasToDust   0.25
		Particles   2821
		GasBright   0.126274
		DustBright  0.181816
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   32.8372
		Period          191.541
		Eccentricity    0.968643
		Inclination     164.243
		AscendingNode   -54.5534
		ArgOfPericenter -51.6337
		MeanAnomaly     112.233
	}
}

Comet	"Beshqek C153"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            5.92536e-016
	Radius          0.106625
	InertiaMoment   0.397198

	Oblateness      0.00597538

	RotationPeriod  56.8871
	Obliquity       103.888
	EqAscendNode    283.358

	AbsMagn         10.3516
	SlopeParam      2.79136
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.617 0.613 0.606)

	Surface
	{
		SurfStyle       0.303639
		OceanStyle      0.144654
		Randomize      (-0.851, 0.480, -0.689)
		colorDistMagn   0.492733
		colorDistFreq   1.92377e-006
		detailScale     2.91157
		colorConversion true
		snowLevel       2
		tropicLatitude  0.942766
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.370296
		terraceProb     0.377373
		erosion         0
		montesMagn      0.370618
		montesFreq      2.94262
		montesSpiky     0.948724
		montesFraction  0.635656
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.87151e-005
		hillsFraction   0.90012
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.201859
		craterFreq      0.236493
		craterDensity   0.801291
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.425322
		volcanoTemp     1553.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.247, 0.245, 0.243, 0.000)
		colorShelf     (0.262, 0.260, 0.258, 0.000)
		colorBeach     (0.278, 0.276, 0.273, 0.000)
		colorDesert    (0.293, 0.291, 0.288, 0.000)
		colorLowland   (0.309, 0.306, 0.303, 0.000)
		colorUpland    (0.324, 0.322, 0.318, 0.000)
		colorRock      (0.339, 0.337, 0.334, 0.000)
		colorSnow      (0.355, 0.352, 0.349, 1.000)
		BumpHeight      0.0959623
		BumpOffset      0.0191925
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.371644
		DustBright  0.420932
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   34.1089
		Period          202.774
		Eccentricity    0.981791
		Inclination     167.705
		AscendingNode   -118.593
		ArgOfPericenter -142.336
		MeanAnomaly     63.6293
	}
}

Comet	"Beshqek C154"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            4.58284e-012
	Radius          2.36427
	InertiaMoment   0.399349

	Oblateness      0.00907291

	RotationPeriod  55.0329
	Obliquity       57.0941
	EqAscendNode    267.935

	AbsMagn         6.81949
	SlopeParam      3.41468
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.734 0.731 0.730)

	Surface
	{
		SurfStyle       0.649254
		OceanStyle      0.287644
		Randomize      (-0.414, -0.635, -0.122)
		colorDistMagn   0.428368
		colorDistFreq   0.00198739
		detailScale     64.5603
		colorConversion true
		snowLevel       2
		tropicLatitude  0.847281
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.420017
		terraceProb     0.362678
		erosion         0
		montesMagn      0.627991
		montesFreq      4.69472
		montesSpiky     0.92755
		montesFraction  0.457912
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00999066
		hillsFraction   0.441777
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219136
		craterFreq      0.264378
		craterDensity   0.835904
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.532353
		volcanoTemp     1474.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.286, 0.249, 0.204, 0.000)
		colorShelf     (0.293, 0.256, 0.234, 0.000)
		colorBeach     (0.345, 0.300, 0.277, 0.000)
		colorDesert    (0.374, 0.322, 0.270, 0.000)
		colorLowland   (0.411, 0.344, 0.307, 0.000)
		colorUpland    (0.455, 0.417, 0.372, 0.000)
		colorRock      (0.491, 0.453, 0.402, 0.000)
		colorSnow      (0.536, 0.483, 0.424, 1.000)
		BumpHeight      2.12784
		BumpOffset      0.425569
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.463065
		GasToDust   0.25
		Particles   1915
		GasBright   0.0133345
		DustBright  0.463728
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   39.8816
		Period          256.372
		Eccentricity    0.977624
		Inclination     -1.359
		AscendingNode   -126.926
		ArgOfPericenter 21.1399
		MeanAnomaly     85.1384
	}
}

Comet	"Beshqek C155"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            3.54451e-008
	Radius          41.5481
	InertiaMoment   0.398045

	Oblateness      0.00677999

	RotationPeriod  53.1973
	Obliquity       10.2998
	EqAscendNode    252.513

	AbsMagn         1.26846
	SlopeParam      3.9848
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.606 0.601 0.598)

	Surface
	{
		SurfStyle       0.853823
		OceanStyle      0.273915
		Randomize      (-0.930, 0.181, 0.190)
		colorDistMagn   0.228344
		colorDistFreq   0.882624
		detailScale     1134.54
		colorConversion true
		snowLevel       2
		tropicLatitude  0.783421
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.466407
		terraceProb     0.218631
		erosion         0
		montesMagn      0.52299
		montesFreq      3.17516
		montesSpiky     0.986875
		montesFraction  0.502657
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.2179
		hillsFraction   0.701286
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240105
		craterFreq      0.216855
		craterDensity   1.08428
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.476161
		volcanoTemp     1421.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.206, 0.210, 0.239, 0.050)
		colorShelf     (0.242, 0.246, 0.275, 0.040)
		colorBeach     (0.279, 0.283, 0.311, 0.030)
		colorDesert    (0.315, 0.319, 0.353, 0.020)
		colorLowland   (0.352, 0.355, 0.389, 0.030)
		colorUpland    (0.388, 0.391, 0.425, 0.050)
		colorRock      (0.424, 0.427, 0.473, 0.020)
		colorSnow      (0.424, 0.427, 0.473, 1.000)
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
		MaxLength   0.944258
		GasToDust   0.25
		Particles   2887
		GasBright   0.0836514
		DustBright  0.877898
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   38.2857
		Period          241.139
		Eccentricity    0.979265
		Inclination     41.715
		AscendingNode   18.3244
		ArgOfPericenter 97.8463
		MeanAnomaly     83.2244
	}
}

Comet	"Beshqek C156"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            1.09138e-015
	Radius          0.146446
	InertiaMoment   0.399778

	Oblateness      0.0104062

	RotationPeriod  51.3751
	Obliquity       323.505
	EqAscendNode    237.09

	AbsMagn         10.1078
	SlopeParam      4.55366
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.657 0.655 0.653)

	Surface
	{
		SurfStyle       0.541004
		OceanStyle      0.698261
		Randomize      (-0.859, 0.027, -0.240)
		colorDistMagn   0.58668
		colorDistFreq   1.69059e-005
		detailScale     3.99896
		colorConversion true
		snowLevel       2
		tropicLatitude  0.526188
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.657482
		terraceProb     0.118752
		erosion         0
		montesMagn      0.588836
		montesFreq      3.21741
		montesSpiky     0.929105
		montesFraction  0.484599
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.79873e-005
		hillsFraction   0.638807
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.216682
		craterFreq      0.212325
		craterDensity   1.04392
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.531996
		volcanoTemp     1287.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.256, 0.223, 0.183, 0.000)
		colorShelf     (0.263, 0.229, 0.209, 0.000)
		colorBeach     (0.309, 0.269, 0.248, 0.000)
		colorDesert    (0.335, 0.288, 0.242, 0.000)
		colorLowland   (0.368, 0.308, 0.274, 0.000)
		colorUpland    (0.407, 0.374, 0.333, 0.000)
		colorRock      (0.440, 0.406, 0.359, 0.000)
		colorSnow      (0.480, 0.433, 0.379, 1.000)
		BumpHeight      0.131802
		BumpOffset      0.0263603
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.0146994
		GasToDust   0.25
		Particles   1009
		GasBright   0.0943482
		DustBright  0.551687
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   27.683
		Period          148.263
		Eccentricity    0.96435
		Inclination     67.4023
		AscendingNode   9.5608
		ArgOfPericenter 122.439
		MeanAnomaly     135.536
	}
}

Comet	"Beshqek C157"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            8.44104e-012
	Radius          2.56429
	InertiaMoment   0.398636

	Oblateness      0.00772843

	RotationPeriod  49.5615
	Obliquity       276.711
	EqAscendNode    221.668

	AbsMagn         6.59969
	SlopeParam      5.17235
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.534 0.529 0.526)

	Surface
	{
		SurfStyle       0.997959
		OceanStyle      0.734462
		Randomize      (-0.883, 0.094, 0.370)
		colorDistMagn   0.789427
		colorDistFreq   0.00440774
		detailScale     70.0222
		colorConversion true
		snowLevel       2
		tropicLatitude  0.931504
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.50393
		terraceProb     0.35837
		erosion         0
		montesMagn      0.36894
		montesFreq      1.7502
		montesSpiky     0.845476
		montesFraction  0.617496
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0145153
		hillsFraction   0.804429
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.21907
		craterFreq      0.255055
		craterDensity   0.98617
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.539876
		volcanoTemp     1440.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.182, 0.185, 0.211, 0.050)
		colorShelf     (0.214, 0.217, 0.242, 0.040)
		colorBeach     (0.246, 0.249, 0.274, 0.030)
		colorDesert    (0.278, 0.280, 0.311, 0.020)
		colorLowland   (0.310, 0.312, 0.342, 0.030)
		colorUpland    (0.342, 0.344, 0.374, 0.050)
		colorRock      (0.374, 0.376, 0.416, 0.020)
		colorSnow      (0.374, 0.376, 0.416, 1.000)
		BumpHeight      2.30786
		BumpOffset      0.461572
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.495891
		GasToDust   0.25
		Particles   1981
		GasBright   0.0677858
		DustBright  0.262736
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   43.3707
		Period          290.741
		Eccentricity    0.973795
		Inclination     -139.747
		AscendingNode   134.892
		ArgOfPericenter -80.6797
		MeanAnomaly     18.5178
	}
}

Comet	"Beshqek C158"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            6.52854e-008
	Radius          57.2349
	InertiaMoment   0.396484

	Oblateness      0.0118729

	RotationPeriod  47.7518
	Obliquity       229.917
	EqAscendNode    206.245

	AbsMagn         0.186686
	SlopeParam      5.93376
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.595 0.589 0.585)

	Surface
	{
		SurfStyle       0.767783
		OceanStyle      0.916185
		Randomize      (-0.114, -0.324, 0.463)
		colorDistMagn   0.351328
		colorDistFreq   1.52405
		detailScale     1562.89
		colorConversion true
		snowLevel       2
		tropicLatitude  0.696845
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.430631
		terraceProb     0.169525
		erosion         0
		montesMagn      0.317236
		montesFreq      3.23572
		montesSpiky     0.978026
		montesFraction  0.621388
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.25049
		hillsFraction   0.405024
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241276
		craterFreq      0.211355
		craterDensity   0.928191
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.492461
		volcanoTemp     1542.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.232, 0.200, 0.164, 0.000)
		colorShelf     (0.238, 0.206, 0.187, 0.000)
		colorBeach     (0.280, 0.241, 0.222, 0.000)
		colorDesert    (0.303, 0.259, 0.217, 0.000)
		colorLowland   (0.333, 0.277, 0.246, 0.000)
		colorUpland    (0.369, 0.336, 0.298, 0.000)
		colorRock      (0.399, 0.365, 0.322, 0.000)
		colorSnow      (0.434, 0.389, 0.339, 1.000)
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
		MaxLength   0.977084
		GasToDust   0.25
		Particles   2953
		GasBright   0.21527
		DustBright  0.599739
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   32.0573
		Period          184.758
		Eccentricity    0.967199
		Inclination     -93.4302
		AscendingNode   -8.29695
		ArgOfPericenter -82.2459
		MeanAnomaly     -152.287
	}
}

Comet	"Beshqek C159"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            2.01019e-015
	Radius          0.15811
	InertiaMoment   0.399126

	Oblateness      0.00886964

	RotationPeriod  45.9415
	Obliquity       183.123
	EqAscendNode    190.822

	AbsMagn         9.8717
	SlopeParam      7.20134
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.787 0.785 0.782)

	Surface
	{
		SurfStyle       0.868446
		OceanStyle      0.967614
		Randomize      (-0.056, 0.531, -0.767)
		colorDistMagn   0.688116
		colorDistFreq   1.1078e-005
		detailScale     4.31746
		colorConversion true
		snowLevel       2
		tropicLatitude  0.271341
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.703368
		terraceProb     0.232996
		erosion         0
		montesMagn      0.66672
		montesFreq      3.22159
		montesSpiky     0.987701
		montesFraction  0.804347
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.21874e-005
		hillsFraction   0.713474
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.267797
		craterFreq      0.278684
		craterDensity   0.758485
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.42106
		volcanoTemp     1446.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.268, 0.275, 0.313, 0.050)
		colorShelf     (0.315, 0.322, 0.360, 0.040)
		colorBeach     (0.362, 0.369, 0.407, 0.030)
		colorDesert    (0.409, 0.416, 0.461, 0.020)
		colorLowland   (0.457, 0.463, 0.508, 0.030)
		colorUpland    (0.504, 0.510, 0.555, 0.050)
		colorRock      (0.551, 0.557, 0.618, 0.020)
		colorSnow      (0.551, 0.557, 0.618, 1.000)
		BumpHeight      0.142299
		BumpOffset      0.0284598
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.0475255
		GasToDust   0.25
		Particles   1075
		GasBright   0.161426
		DustBright  0.33807
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   38.168
		Period          240.028
		Eccentricity    0.993466
		Inclination     167.126
		AscendingNode   -154.274
		ArgOfPericenter 178.592
		MeanAnomaly     -31.1101
	}
}

Comet	"Beshqek C160"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            1.55473e-011
	Radius          3.54522
	InertiaMoment   0.397679

	Oblateness      0.013938

	RotationPeriod  44.126
	Obliquity       136.328
	EqAscendNode    175.4

	AbsMagn         6.37557
	SlopeParam      2.4285
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.738 0.698 0.679)

	Surface
	{
		SurfStyle       0.918466
		OceanStyle      0.044042
		Randomize      (-0.320, 0.692, 0.728)
		colorDistMagn   0.229824
		colorDistFreq   0.0104496
		detailScale     96.8081
		colorConversion true
		snowLevel       2
		tropicLatitude  0.945646
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.53212
		terraceProb     0.150231
		erosion         0
		montesMagn      0.444795
		montesFreq      2.93411
		montesSpiky     0.905963
		montesFraction  0.386898
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0172087
		hillsFraction   0.824781
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.202337
		craterFreq      0.25503
		craterDensity   0.872931
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.553118
		volcanoTemp     1449.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.251, 0.244, 0.271, 0.050)
		colorShelf     (0.295, 0.286, 0.312, 0.040)
		colorBeach     (0.340, 0.328, 0.353, 0.030)
		colorDesert    (0.384, 0.370, 0.400, 0.020)
		colorLowland   (0.428, 0.412, 0.441, 0.030)
		colorUpland    (0.472, 0.454, 0.482, 0.050)
		colorRock      (0.517, 0.496, 0.536, 0.020)
		colorSnow      (0.517, 0.496, 0.536, 1.000)
		BumpHeight      3.1907
		BumpOffset      0.638139
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.528717
		GasToDust   0.25
		Particles   2047
		GasBright   0.3761
		DustBright  0.607882
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   43.4946
		Period          291.988
		Eccentricity    0.991064
		Inclination     90.5479
		AscendingNode   -61.2504
		ArgOfPericenter -66.7803
		MeanAnomaly     128.115
	}
}

Comet	"Beshqek C161"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            1.20247e-007
	Radius          61.4057
	InertiaMoment   0.399569

	Oblateness      0.0102624

	RotationPeriod  42.3006
	Obliquity       89.534
	EqAscendNode    159.977

	AbsMagn         19.001
	SlopeParam      3.10958
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.680 0.675 0.672)

	Surface
	{
		SurfStyle       0.744484
		OceanStyle      0.324946
		Randomize      (-0.521, 0.113, -0.680)
		colorDistMagn   0.206671
		colorDistFreq   0.484847
		detailScale     1676.78
		colorConversion true
		snowLevel       2
		tropicLatitude  0.677165
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.276866
		terraceProb     0.404684
		erosion         0
		montesMagn      0.509194
		montesFreq      2.69081
		montesSpiky     0.951441
		montesFraction  0.503066
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.44952
		hillsFraction   0.855419
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228939
		craterFreq      0.221281
		craterDensity   0.710359
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.496244
		volcanoTemp     1477.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.265, 0.230, 0.188, 0.000)
		colorShelf     (0.272, 0.236, 0.215, 0.000)
		colorBeach     (0.320, 0.277, 0.255, 0.000)
		colorDesert    (0.347, 0.297, 0.249, 0.000)
		colorLowland   (0.381, 0.317, 0.282, 0.000)
		colorUpland    (0.422, 0.385, 0.343, 0.000)
		colorRock      (0.456, 0.419, 0.370, 0.000)
		colorSnow      (0.496, 0.446, 0.390, 1.000)
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
		GasBright   0.294974
		DustBright  0.373495
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   28.4954
		Period          154.837
		Eccentricity    0.982605
		Inclination     -127.019
		AscendingNode   -21.9133
		ArgOfPericenter 25.3541
		MeanAnomaly     -161.111
	}
}

Comet	"Beshqek C162"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            3.7025e-015
	Radius          0.219597
	InertiaMoment   0.398362

	Oblateness      0.0165864

	RotationPeriod  40.4604
	Obliquity       42.7397
	EqAscendNode    144.555

	AbsMagn         9.64192
	SlopeParam      3.69887
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.698 0.695 0.693)

	Surface
	{
		SurfStyle       0.511117
		OceanStyle      0.861923
		Randomize      (-0.711, 0.246, -0.107)
		colorDistMagn   0.0333092
		colorDistFreq   3.43027e-005
		detailScale     5.99646
		colorConversion true
		snowLevel       2
		tropicLatitude  0.676093
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.487482
		terraceProb     0.189033
		erosion         0
		montesMagn      0.303705
		montesFreq      2.88861
		montesSpiky     0.907596
		montesFraction  0.757849
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000133502
		hillsFraction   0.77199
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25578
		craterFreq      0.208475
		craterDensity   0.714905
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.43413
		volcanoTemp     1839.95
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.272, 0.236, 0.194, 0.000)
		colorShelf     (0.279, 0.243, 0.222, 0.000)
		colorBeach     (0.328, 0.285, 0.263, 0.000)
		colorDesert    (0.356, 0.306, 0.256, 0.000)
		colorLowland   (0.391, 0.327, 0.291, 0.000)
		colorUpland    (0.433, 0.396, 0.353, 0.000)
		colorRock      (0.467, 0.431, 0.381, 0.000)
		colorSnow      (0.509, 0.459, 0.402, 1.000)
		BumpHeight      0.197637
		BumpOffset      0.0395275
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.0803512
		GasToDust   0.25
		Particles   1142
		GasBright   0.000110577
		DustBright  0.352845
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   35.425
		Period          214.623
		Eccentricity    0.980481
		Inclination     179.681
		AscendingNode   50.9187
		ArgOfPericenter -63.6778
		MeanAnomaly     154.49
	}
}

Comet	"Beshqek C163"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            2.86362e-011
	Radius          3.76469
	InertiaMoment   0.399991

	Oblateness      0.0119446

	RotationPeriod  38.6003
	Obliquity       355.945
	EqAscendNode    129.132

	AbsMagn         6.14623
	SlopeParam      4.26263
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.457 0.452 0.446)

	Surface
	{
		SurfStyle       0.339798
		OceanStyle      0.920981
		Randomize      (-0.700, -0.991, -0.720)
		colorDistMagn   0.181692
		colorDistFreq   0.00328509
		detailScale     102.801
		colorConversion true
		snowLevel       2
		tropicLatitude  0.494442
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.572654
		terraceProb     0.10594
		erosion         0
		montesMagn      0.427495
		montesFreq      2.74548
		montesSpiky     0.873603
		montesFraction  0.403257
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0373142
		hillsFraction   0.644314
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255537
		craterFreq      0.184503
		craterDensity   0.832484
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.508485
		volcanoTemp     1568.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.183, 0.181, 0.178, 0.000)
		colorShelf     (0.194, 0.192, 0.189, 0.000)
		colorBeach     (0.205, 0.204, 0.201, 0.000)
		colorDesert    (0.217, 0.215, 0.212, 0.000)
		colorLowland   (0.228, 0.226, 0.223, 0.000)
		colorUpland    (0.240, 0.238, 0.234, 0.000)
		colorRock      (0.251, 0.249, 0.245, 0.000)
		colorSnow      (0.262, 0.260, 0.256, 1.000)
		BumpHeight      3.38822
		BumpOffset      0.677644
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.561543
		GasToDust   0.25
		Particles   2114
		GasBright   0.0497093
		DustBright  0.787732
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   36.2441
		Period          222.11
		Eccentricity    0.987712
		Inclination     154.13
		AscendingNode   -23.3467
		ArgOfPericenter -115.563
		MeanAnomaly     -56.3759
	}
}

Comet	"Beshqek C164"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            2.2148e-007
	Radius          85.8243
	InertiaMoment   0.398893

	Oblateness      0.0201423

	RotationPeriod  36.7147
	Obliquity       309.151
	EqAscendNode    113.71

	AbsMagn         15.9247
	SlopeParam      4.84853
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.773 0.771 0.769)

	Surface
	{
		SurfStyle       0.756621
		OceanStyle      0.433359
		Randomize      (-0.545, 0.844, -0.869)
		colorDistMagn   0.478572
		colorDistFreq   3.9833
		detailScale     2343.58
		colorConversion true
		snowLevel       2
		tropicLatitude  0.940049
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.367053
		terraceProb     0.516781
		erosion         0
		montesMagn      0.543085
		montesFreq      3.5793
		montesSpiky     0.962878
		montesFraction  0.633546
		dunesFraction   0
		hillsMagn       0
		hillsFreq       20.0007
		hillsFraction   0.703799
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231486
		craterFreq      0.17377
		craterDensity   0.875306
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.428355
		volcanoTemp     1519.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.301, 0.262, 0.215, 0.000)
		colorShelf     (0.309, 0.270, 0.246, 0.000)
		colorBeach     (0.363, 0.316, 0.292, 0.000)
		colorDesert    (0.394, 0.339, 0.284, 0.000)
		colorLowland   (0.433, 0.362, 0.323, 0.000)
		colorUpland    (0.479, 0.440, 0.392, 0.000)
		colorRock      (0.518, 0.478, 0.423, 0.000)
		colorSnow      (0.564, 0.509, 0.446, 1.000)
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
		GasBright   0.0617983
		DustBright  0.46013
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   27.9561
		Period          150.462
		Eccentricity    0.958975
		Inclination     110.331
		AscendingNode   -39.5866
		ArgOfPericenter -140.899
		MeanAnomaly     17.5299
	}
}

Comet	"Beshqek C165"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            6.81955e-015
	Radius          0.363683
	InertiaMoment   0.397212

	Oblateness      0.055064

	RotationPeriod  34.7977
	Obliquity       262.357
	EqAscendNode    98.287

	AbsMagn         9.41743
	SlopeParam      5.52012
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.774 0.772 0.771)

	Surface
	{
		SurfStyle       0.924784
		OceanStyle      0.888112
		Randomize      (-0.213, 0.094, -0.479)
		colorDistMagn   0.632972
		colorDistFreq   7.15242e-005
		detailScale     9.93096
		colorConversion true
		snowLevel       2
		tropicLatitude  0.984389
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.668261
		terraceProb     0.34422
		erosion         0
		montesMagn      0.616492
		montesFreq      2.59991
		montesSpiky     0.989696
		montesFraction  0.690605
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000236321
		hillsFraction   0.570589
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260389
		craterFreq      0.257223
		craterDensity   0.797479
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.444416
		volcanoTemp     2049.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.263, 0.270, 0.308, 0.050)
		colorShelf     (0.309, 0.317, 0.354, 0.040)
		colorBeach     (0.356, 0.363, 0.401, 0.030)
		colorDesert    (0.402, 0.409, 0.455, 0.020)
		colorLowland   (0.449, 0.456, 0.501, 0.030)
		colorUpland    (0.495, 0.502, 0.547, 0.050)
		colorRock      (0.542, 0.548, 0.609, 0.020)
		colorSnow      (0.542, 0.548, 0.609, 1.000)
		BumpHeight      0.327314
		BumpOffset      0.0654629
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.113177
		GasToDust   0.25
		Particles   1208
		GasBright   0.0366281
		DustBright  0.169787
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   27.2361
		Period          144.687
		Eccentricity    0.94868
		Inclination     -86.1203
		AscendingNode   100.783
		ArgOfPericenter 140.264
		MeanAnomaly     106.652
	}
}

Comet	"Beshqek C166"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            5.27444e-011
	Radius          5.31613
	InertiaMoment   0.399354

	Oblateness      0.0251644

	RotationPeriod  32.8424
	Obliquity       215.563
	EqAscendNode    82.8644

	AbsMagn         5.91062
	SlopeParam      6.43683
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.578 0.571 0.566)

	Surface
	{
		SurfStyle       0.596145
		OceanStyle      0.231884
		Randomize      (-0.645, 0.022, -0.241)
		colorDistMagn   0.628902
		colorDistFreq   0.00970749
		detailScale     145.166
		colorConversion true
		snowLevel       2
		tropicLatitude  0.392204
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.597758
		terraceProb     0.483922
		erosion         0
		montesMagn      0.488762
		montesFreq      2.76267
		montesSpiky     0.939428
		montesFraction  0.547399
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0790186
		hillsFraction   0.393648
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241108
		craterFreq      0.265207
		craterDensity   0.782953
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.558652
		volcanoTemp     1384.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.225, 0.194, 0.159, 0.000)
		colorShelf     (0.231, 0.200, 0.181, 0.000)
		colorBeach     (0.271, 0.234, 0.215, 0.000)
		colorDesert    (0.295, 0.251, 0.210, 0.000)
		colorLowland   (0.323, 0.268, 0.238, 0.000)
		colorUpland    (0.358, 0.326, 0.289, 0.000)
		colorRock      (0.387, 0.354, 0.312, 0.000)
		colorSnow      (0.422, 0.377, 0.329, 1.000)
		BumpHeight      4.78451
		BumpOffset      0.956903
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.594369
		GasToDust   0.25
		Particles   2180
		GasBright   0.163394
		DustBright  0.527507
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   29.2974
		Period          161.419
		Eccentricity    0.967755
		Inclination     -12.5429
		AscendingNode   -5.06245
		ArgOfPericenter 23.8515
		MeanAnomaly     55.0057
	}
}

Comet	"Beshqek C167"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            4.07939e-007
	Radius          133.258
	InertiaMoment   0.398053

	Oblateness      0.0578292

	RotationPeriod  30.8413
	Obliquity       168.768
	EqAscendNode    67.4418

	AbsMagn         14.7988
	SlopeParam      2.00449
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.712 0.708 0.706)

	Surface
	{
		SurfStyle       0.627935
		OceanStyle      0.204288
		Randomize      (-0.581, -0.514, -0.071)
		colorDistMagn   0.0352222
		colorDistFreq   6.88343
		detailScale     3638.83
		colorConversion true
		snowLevel       2
		tropicLatitude  0.9973
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.652135
		terraceProb     0.459575
		erosion         0
		montesMagn      0.526218
		montesFreq      3.12399
		montesSpiky     0.986014
		montesFraction  0.47257
		dunesFraction   0
		hillsMagn       0
		hillsFreq       36.6401
		hillsFraction   0.526963
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217269
		craterFreq      0.474972
		craterDensity   0.916467
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.490614
		volcanoTemp     1452.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.278, 0.241, 0.198, 0.000)
		colorShelf     (0.285, 0.248, 0.226, 0.000)
		colorBeach     (0.335, 0.290, 0.268, 0.000)
		colorDesert    (0.363, 0.311, 0.261, 0.000)
		colorLowland   (0.399, 0.333, 0.297, 0.000)
		colorUpland    (0.441, 0.404, 0.360, 0.000)
		colorRock      (0.477, 0.439, 0.388, 0.000)
		colorSnow      (0.520, 0.467, 0.410, 1.000)
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
		GasBright   0.110942
		DustBright  0.264446
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   43.0516
		Period          287.538
		Eccentricity    0.989122
		Inclination     86.3596
		AscendingNode   134.28
		ArgOfPericenter -156.197
		MeanAnomaly     130.37
	}
}

Comet	"Beshqek C168"
{
	ParentBody     "Beshqek"
	Class	       "Asteroid"

	Mass            1.25607e-014
	Radius          0.329291
	InertiaMoment   0.399784

	Oblateness      0.0327429

	RotationPeriod  28.7857
	Obliquity       121.974
	EqAscendNode    52.0192

	AbsMagn         9.19732
	SlopeParam      2.78208
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.696 0.691 0.688)

	Surface
	{
		SurfStyle       0.639967
		OceanStyle      0.883995
		Randomize      (0.653, 0.428, -0.611)
		colorDistMagn   0.141921
		colorDistFreq   1.863e-005
		detailScale     8.99184
		colorConversion true
		snowLevel       2
		tropicLatitude  0.614373
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.640045
		terraceProb     0.149168
		erosion         0
		montesMagn      0.505498
		montesFreq      2.95185
		montesSpiky     0.898723
		montesFraction  0.399615
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000155631
		hillsFraction   0.780208
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224859
		craterFreq      0.185809
		craterDensity   0.86494
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.43221
		volcanoTemp     1342.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.271, 0.235, 0.193, 0.000)
		colorShelf     (0.278, 0.242, 0.220, 0.000)
		colorBeach     (0.327, 0.283, 0.262, 0.000)
		colorDesert    (0.355, 0.304, 0.255, 0.000)
		colorLowland   (0.390, 0.325, 0.289, 0.000)
		colorUpland    (0.432, 0.394, 0.351, 0.000)
		colorRock      (0.466, 0.428, 0.379, 0.000)
		colorSnow      (0.508, 0.456, 0.399, 1.000)
		BumpHeight      0.296362
		BumpOffset      0.0592724
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.146003
		GasToDust   0.25
		Particles   1274
		GasBright   0.304898
		DustBright  0.554976
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   32.6636
		Period          190.024
		Eccentricity    0.969905
		Inclination     79.6919
		AscendingNode   33.7107
		ArgOfPericenter -48.6709
		MeanAnomaly     118.414
	}
}

