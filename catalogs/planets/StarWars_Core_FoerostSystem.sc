// http://starwars.wikia.com/wiki/Foerost
// Region : Core
// Sector : 
// Grid location : L10
// X : -0.61, Y : -111.07, Z : 362.8596282271542

Planet	"Foerost/Foerost System 8"
{
	ParentBody     "Foerost System"
	Class	       "Terra"

	Mass            0.786
	Radius          5651.62
	InertiaMoment   0.331583

	Oblateness      0.00723356

	RotationPeriod  22.2491
	Obliquity       -203.181
	EqAscendNode    166.19

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.703 0.584 0.364)

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Terrestrial"
		Panspermia "true"
	}

	Surface
	{
		SurfStyle       0.511111
		OceanStyle      0.404762
		Randomize      (-1.587, 1.397, -1.016)
		colorDistMagn   0.198413
		colorDistFreq   193.07
		detailScale     14536.3
		colorConversion false
		drivenDarkening 0
		seaLevel        0.634927
		snowLevel       1
		tropicLatitude  0.409407
		icecapLatitude  0.81746
		icecapHeight    0.190476
		climatePole     0.753968
		climateTropic   0.47619
		climateEquator  0.47619
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.952381
		venusFreq       1
		venusMagn       0.396825
		mareFreq        0.0111588
		mareDensity     0
		terraceProb     0.129125
		erosion         0.404762
		montesMagn      0.164908
		montesFreq      346.941
		montesSpiky     0.866435
		montesFraction  0.127889
		dunesMagn       0.0526228
		dunesFreq       100
		dunesFraction   0.760404
		hillsMagn       0.119404
		hillsFreq       623.298
		hillsFraction   0.551958
		hills2Fraction  0.184711
		riversMagn      65.3166
		riversFreq      3.03346
		riversSin       5.13161
		riversOctaves   1
		canyonsMagn     0.386647
		canyonsFreq     25.3968
		canyonFraction  0.259136
		cracksMagn      0.0581646
		cracksFreq      2.49991
		cracksOctaves   2
		craterMagn      0.54411
		craterFreq      0
		craterDensity   0.921288
		craterOctaves   13
		craterRayedFactor 0.0556714
		volcanoMagn     0.572802
		volcanoFreq     0.836095
		volcanoDensity  0.143753
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.118059
		volcanoRadius   0.525471
		volcanoTemp     1910.55
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
		colorSea       (0.040, 0.100, 0.200, 1.000)
		colorShelf     (0.150, 0.480, 0.460, 1.000)
		colorBeach     (0.400, 0.330, 0.280, 0.000)
		colorDesert    (0.260, 0.240, 0.220, 0.000)
		colorLowland   (0.500, 0.420, 0.350, 0.000)
		colorUpland    (0.240, 0.210, 0.210, 0.000)
		colorRock      (0.220, 0.210, 0.210, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.308)
		colorLowPlants (0.010, 0.010, 0.010, 0.000)
		colorUpPlants  (0.020, 0.030, 0.080, 0.000)
		BumpHeight      31.746
		BumpOffset      12.6984
		DiffMapAlpha   "Water"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.990448
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	Ocean
	{
		Height          20.1564
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
	}

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          223.463
		Density         1
		Pressure        1
		Greenhouse      223.81
		Bright          3.94471
		Opacity         0
		SkyLight        1.3149
		Hue             -0.0458227
		Saturation      1

		Composition
		{
			N2    	77.7729
			O2    	20.8625
			Ar    	0.9303
			H2O   	0.4
			CO2   	0.0398
		}
	}

	Aurora
	{
		Height      63.2481
		NorthLat    51.5391
		NorthLon    -149.067
		NorthRadius 1336.78
		NorthWidth  429.399
		NorthRings  2
		NorthBright 0.3
		NorthParticles 0
		SouthLat    -76.996
		SouthLon    34.5497
		SouthRadius 1305.15
		SouthWidth  246.321
		SouthRings  5
		SouthBright 0.3
		SouthParticles 0
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	NoRings 		true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.1449
		Period          2.72028
		Eccentricity    0.00881692
		Inclination     1.02068
		AscendingNode   164.851
		ArgOfPericenter 71.4216
		MeanAnomaly     22.9715
	}
}

Moon	"Foerost System 8.1"
{
	ParentBody     "Foerost System 8"
	Class	       "IceWorld"

	Mass            0.00332012
	Radius          1307.37
	InertiaMoment   0.397991

	Oblateness      0.00539645

	Obliquity       -0.914061
	EqAscendNode    154.577
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.652 0.391 0.175)

	Surface
	{
		SurfStyle       0.458923
		OceanStyle      0.226697
		Randomize      (-0.196, 0.041, 0.657)
		colorDistMagn   0.0512951
		colorDistFreq   201.023
		detailScale     3362.64
		colorConversion true
		drivenDarkening 0
		seaLevel        0.19024
		snowLevel       2
		tropicLatitude  0.00701661
		icecapLatitude  0.826535
		icecapHeight    0.19454
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.01926
		venusFreq       1.15334
		venusMagn       0.238825
		mareFreq        0.568211
		mareDensity     0.00123243
		terraceProb     0.324614
		erosion         0
		montesMagn      0.0600045
		montesFreq      72.8623
		montesSpiky     0.951345
		montesFraction  0.0578705
		dunesMagn       0.0258042
		dunesFreq       1716.76
		dunesFraction   0.139032
		hillsMagn       0.111819
		hillsFreq       167.246
		hillsFraction   0.986739
		hills2Fraction  0.00814026
		riversMagn      69.6092
		riversFreq      3.73979
		riversSin       5.36982
		riversOctaves   0
		canyonsMagn     0.400481
		canyonsFreq     0.439506
		canyonFraction  0
		cracksMagn      0.0444957
		cracksFreq      0.529532
		cracksOctaves   1
		craterMagn      0.656313
		craterFreq      3.90769
		craterDensity   0.911349
		craterOctaves   11
		craterRayedFactor 0.224824
		volcanoMagn     0.162652
		volcanoFreq     0.63268
		volcanoDensity  0.20421
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.150245
		volcanoRadius   0.145908
		volcanoTemp     1482.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.200, 0.142, 0.106, 0.000)
		colorShelf     (0.247, 0.177, 0.135, 0.000)
		colorBeach     (0.374, 0.268, 0.202, 0.200)
		colorDesert    (0.341, 0.251, 0.178, 0.500)
		colorLowland   (0.261, 0.194, 0.135, 0.800)
		colorUpland    (0.441, 0.342, 0.251, 1.000)
		colorRock      (0.670, 0.620, 0.550, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.261, 0.194, 0.135, 0.800)
		colorUpPlants  (0.441, 0.342, 0.251, 1.000)
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
		SemiMajorAxis   0.000258799
		Period          0.00392274
		Eccentricity    0.00349579
		Inclination     -0.914061
		AscendingNode   154.577
		ArgOfPericenter -90.674
		MeanAnomaly     -35.3955
	}
}

Moon	"Foerost System 8.2"
{
	ParentBody     "Foerost"
	Class	       "IceWorld"

	Mass            0.00385339
	Radius          1292.25
	InertiaMoment   0.394669

	Obliquity       -1.08327
	EqAscendNode    -173.286
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.706 0.475 0.244)

	Surface
	{
		SurfStyle       1
		OceanStyle      1
		Randomize      (-0.857, -0.048, -0.508)
		colorDistMagn   0.0545836
		colorDistFreq   175.267
		detailScale     3323.74
		colorConversion true
		drivenDarkening 0
		seaLevel        1
		snowLevel       1
		tropicLatitude  0.00221079
		icecapLatitude  0.960909
		icecapHeight    0.167699
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.64774
		venusFreq       2
		venusMagn       0
		mareFreq        0.539314
		mareDensity     0.00142838
		terraceProb     0.307954
		erosion         0
		montesMagn      0.078483
		montesFreq      74.9861
		montesSpiky     0.959966
		montesFraction  0.135096
		dunesMagn       0.0271027
		dunesFreq       100
		dunesFraction   0.451986
		hillsMagn       0.139184
		hillsFreq       154.981
		hillsFraction   0.0538447
		hills2Fraction  0.0423937
		riversMagn      61.3633
		riversFreq      4.70214
		riversSin       5.88332
		riversOctaves   0
		canyonsMagn     0.418484
		canyonsFreq     0.417001
		canyonFraction  0
		cracksMagn      0.0677945
		cracksFreq      0.47426
		cracksOctaves   0
		craterMagn      0.588744
		craterFreq      4.66675
		craterDensity   0.904455
		craterOctaves   11
		craterRayedFactor 0.136659
		volcanoMagn     0.201155
		volcanoFreq     0.758913
		volcanoDensity  0.203281
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.463854
		volcanoRadius   0.129874
		volcanoTemp     1406
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
		colorSea       (0.537, 0.338, 0.141, 1.000)
		colorShelf     (0.537, 0.338, 0.141, 1.000)
		colorBeach     (0.494, 0.295, 0.122, 1.000)
		colorDesert    (0.494, 0.295, 0.122, 1.000)
		colorLowland   (0.600, 0.385, 0.185, 1.000)
		colorUpland    (0.629, 0.423, 0.209, 1.000)
		colorRock      (0.930, 0.910, 0.860, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.600, 0.385, 0.185, 1.000)
		colorUpPlants  (0.629, 0.423, 0.209, 1.000)
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
		SemiMajorAxis   0.000561658
		Period          0.0125327
		Eccentricity    0.0477307
		Inclination     -1.08327
		AscendingNode   -173.286
		ArgOfPericenter 167.813
		MeanAnomaly     26.7675
	}
}

///////////////
// GENERATED //
///////////////
Planet	"Foerost System 1"
{
	ParentBody     "Foerost System"
	Class	       "Desert"

	Mass            0.0661753
	Radius          2652.87
	InertiaMoment   0.337334

	Oblateness      0.00126057

	RotationPeriod  41.1486
	Obliquity       -0.0395263
	EqAscendNode    -99.3853

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.507 0.504 0.500)

	Surface
	{
		SurfStyle       0.331105
		OceanStyle      0.409282
		Randomize      (-0.843, 0.082, -0.678)
		colorDistMagn   0.0857577
		colorDistFreq   265.788
		detailScale     6823.33
		colorConversion true
		seaLevel        0.101046
		snowLevel       2
		tropicLatitude  0.00091349
		icecapLatitude  10
		icecapHeight    0.15032
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        0.486326
		venusFreq       1.08845
		venusMagn       0.52366
		mareFreq        1.54526
		mareDensity     0.0298099
		terraceProb     0.605209
		erosion         0
		montesMagn      0.146777
		montesFreq      118.634
		montesSpiky     0.842237
		montesFraction  0.720811
		dunesMagn       0.0503833
		dunesFreq       17.2581
		dunesFraction   0.807398
		hillsMagn       0.158141
		hillsFreq       234.186
		hillsFraction   0
		hills2Fraction  0
		riversMagn      58.917
		riversFreq      2.29976
		riversSin       4.1161
		riversOctaves   0
		canyonsMagn     0.0245582
		canyonsFreq     70.6609
		canyonFraction  0
		cracksMagn      0.0823501
		cracksFreq      0.284154
		cracksOctaves   0
		craterMagn      0.609173
		craterFreq      8.43084
		craterDensity   0.345228
		craterOctaves   5.29111
		volcanoMagn     0.56362
		volcanoFreq     0.80986
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.481112
		volcanoRadius   0.451074
		volcanoTemp     1100
		lavaCoverTidal  0.332378
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
		Hapke           0.855321
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
		Height          122.175
		Density         0.0144679
		Pressure        0.0129609
		Greenhouse      0.979378
		Bright          6.79331
		Opacity         1
		SkyLight        2.26444
		Hue             -0.00828701
		Saturation      1

		Composition
		{
			CO2   	99.9314
			SO2   	0.058125
			C3H8  	0.0101957
			H2S   	0.000197265
			Cl2   	3.88668e-005
			Ar    	1.8093e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0215838
		Period          0.00704133
		Eccentricity    0.0825925
		Inclination     -0.0395263
		AscendingNode   -99.3853
		ArgOfPericenter 321.03
		MeanAnomaly     310.685
	}
}

DwarfMoon	"Foerost System 1.D1"
{
	ParentBody     "Foerost System 1"
	Class	       "Asteroid"

	Mass            3.66048e-007
	Radius          47.5642
	InertiaMoment   0.398341

	Oblateness      0.123262

	Obliquity       -0.00357903
	EqAscendNode    64.3703
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.511 0.392 0.344)

	Surface
	{
		SurfStyle       0.54189
		OceanStyle      0.254521
		Randomize      (-0.323, -0.162, 0.820)
		colorDistMagn   0.239974
		colorDistFreq   1.07798
		detailScale     1298.82
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.767581
		terraceProb     0.360261
		erosion         0
		montesMagn      0.621209
		montesFreq      2.90405
		montesSpiky     0.899684
		montesFraction  0.577422
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.72776
		hillsFraction   0.577086
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217124
		craterFreq      0.181427
		craterDensity   1.00949
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.481768
		volcanoTemp     1523.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.199, 0.133, 0.096, 0.000)
		colorShelf     (0.204, 0.137, 0.110, 0.000)
		colorBeach     (0.240, 0.161, 0.131, 0.000)
		colorDesert    (0.261, 0.173, 0.127, 0.000)
		colorLowland   (0.286, 0.184, 0.144, 0.000)
		colorUpland    (0.317, 0.224, 0.175, 0.000)
		colorRock      (0.342, 0.243, 0.189, 0.000)
		colorSnow      (0.373, 0.259, 0.199, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.8774e-005
		Period          0.000542802
		Eccentricity    2.08961e-005
		Inclination     -0.00357903
		AscendingNode   64.3703
		ArgOfPericenter 10.4218
		MeanAnomaly     -18.9795
	}
}

DwarfMoon	"Foerost System 1.D2"
{
	ParentBody     "Foerost System 1"
	Class	       "Asteroid"

	Mass            5.13499e-007
	Radius          67.2386
	InertiaMoment   0.399381

	Oblateness      0.0991204

	Obliquity       0.00826622
	EqAscendNode    68.111
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.564 0.559 0.556)

	Surface
	{
		SurfStyle       0.752901
		OceanStyle      0.520245
		Randomize      (-0.044, 0.750, 0.639)
		colorDistMagn   0.157151
		colorDistFreq   2.11391
		detailScale     1836.06
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.706479
		terraceProb     0.335866
		erosion         0
		montesMagn      0.638436
		montesFreq      2.67184
		montesSpiky     0.98531
		montesFraction  0.517201
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.02661
		hillsFraction   0.454733
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252269
		craterFreq      0.182404
		craterDensity   0.835311
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.514529
		volcanoTemp     1320.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.220, 0.190, 0.156, 0.000)
		colorShelf     (0.226, 0.196, 0.178, 0.000)
		colorBeach     (0.265, 0.229, 0.211, 0.000)
		colorDesert    (0.288, 0.246, 0.206, 0.000)
		colorLowland   (0.316, 0.263, 0.234, 0.000)
		colorUpland    (0.350, 0.319, 0.284, 0.000)
		colorRock      (0.378, 0.347, 0.306, 0.000)
		colorSnow      (0.412, 0.369, 0.323, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.27229e-005
		Period          0.000860653
		Eccentricity    2.26616e-005
		Inclination     0.00826622
		AscendingNode   68.111
		ArgOfPericenter 34.7268
		MeanAnomaly     -56.178
	}
}

Planet	"Foerost System 2"
{
	ParentBody     "Foerost System"
	Class	       "Selena"

	Mass            0.321742
	Radius          4980.8
	InertiaMoment   0.330073

	Obliquity       -1.87461
	EqAscendNode    49.8326
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.626 0.623 0.620)

	Surface
	{
		SurfStyle       0.0564139
		OceanStyle      0.577331
		Randomize      (-0.842, 0.293, 0.017)
		colorDistMagn   0.0899135
		colorDistFreq   612.895
		detailScale     12810.9
		colorConversion true
		drivenDarkening 0
		seaLevel        0.274272
		snowLevel       2
		tropicLatitude  0.0593086
		icecapLatitude  10
		icecapHeight    0.0979353
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.98099
		venusFreq       1.12287
		venusMagn       0
		mareFreq        1.85299
		mareDensity     0.0492601
		terraceProb     0.203867
		erosion         0
		montesMagn      0.168724
		montesFreq      290.726
		montesSpiky     0.895
		montesFraction  0.34065
		dunesMagn       0.0552933
		dunesFreq       6531.6
		dunesFraction   0.505757
		hillsMagn       0.147158
		hillsFreq       523.203
		hillsFraction   0.176782
		hills2Fraction  0
		riversMagn      64.7084
		riversFreq      2.94082
		riversSin       6.78689
		riversOctaves   0
		canyonsMagn     0.470748
		canyonsFreq     1.73024
		canyonFraction  0.808038
		cracksMagn      0.077415
		cracksFreq      2.16167
		cracksOctaves   0
		craterMagn      0.646889
		craterFreq      16.3322
		craterDensity   0.678786
		craterOctaves   10.868
		craterRayedFactor 0.125686
		volcanoMagn     0.530693
		volcanoFreq     0.622222
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.280049
		volcanoRadius   0.504505
		volcanoTemp     1567.03
		lavaCoverTidal  0.182224
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.320, 0.320, 0.000)
		colorShelf     (0.370, 0.370, 0.370, 0.000)
		colorBeach     (0.313, 0.311, 0.310, 0.000)
		colorDesert    (0.388, 0.374, 0.353, 0.200)
		colorLowland   (0.420, 0.398, 0.397, 0.500)
		colorUpland    (0.438, 0.417, 0.409, 0.800)
		colorRock      (0.650, 0.610, 0.620, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.996423
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
		Height          148.532
		Density         0.000357705
		Pressure        0.000403105
		Greenhouse      0.912914
		Bright          3.24119
		Opacity         0
		SkyLight        1.0804
		Hue             -0.00858986
		Saturation      1

		Composition
		{
			NH3   	30.2351
			H2O   	26.8943
			C2H2  	24.9555
			CO2   	7.16568
			CH4   	2.98669
			SO2   	2.98124
			H2S   	2.46548
			C2H4  	2.06235
			N2    	0.142863
			C2H6  	0.0610703
			C3H8  	0.0463936
			CO    	0.00186631
			Ar    	0.00114163
			Ne    	0.000191226
			Cl2   	4.12025e-005
			O2    	1.40093e-005
		}
	}

	Aurora
	{
		Height      136.979
		NorthLat    63.25
		NorthLon    -47.3154
		NorthRadius 1258.39
		NorthWidth  403.249
		NorthRings  5
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -62.0741
		SouthLon    154.976
		SouthRadius 1628.77
		SouthWidth  492.771
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
		SemiMajorAxis   0.047232
		Period          0.0227938
		Eccentricity    0.0789467
		Inclination     -1.87461
		AscendingNode   49.8326
		ArgOfPericenter 350.739
		MeanAnomaly     121.955
	}
}

DwarfMoon	"Foerost System 2.D1"
{
	ParentBody     "Foerost System 2"
	Class	       "Asteroid"

	Mass            7.63298e-011
	Radius          6.19962
	InertiaMoment   0.398789

	Oblateness      0.249

	Obliquity       0.00177327
	EqAscendNode    166.948
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.643 0.640 0.637)

	Surface
	{
		SurfStyle       0.00837287
		OceanStyle      0.0875731
		Randomize      (-0.902, -0.512, 0.582)
		colorDistMagn   0.545923
		colorDistFreq   0.0255926
		detailScale     169.291
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.48336
		terraceProb     0.110889
		erosion         0
		montesMagn      0.479561
		montesFreq      3.04307
		montesSpiky     0.987221
		montesFraction  0.424336
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0773145
		hillsFraction   0.530401
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252181
		craterFreq      0.234438
		craterDensity   0.851856
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.522754
		volcanoTemp     1522.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.257, 0.256, 0.255, 0.000)
		colorShelf     (0.273, 0.272, 0.271, 0.000)
		colorBeach     (0.289, 0.288, 0.287, 0.000)
		colorDesert    (0.305, 0.304, 0.303, 0.000)
		colorLowland   (0.321, 0.320, 0.318, 0.000)
		colorUpland    (0.338, 0.336, 0.334, 0.000)
		colorRock      (0.354, 0.352, 0.350, 0.000)
		colorSnow      (0.370, 0.368, 0.366, 1.000)
		BumpHeight      5.57965
		BumpOffset      1.11593
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   9.635e-005
		Period          0.00096428
		Eccentricity    3.41209e-005
		Inclination     0.00177327
		AscendingNode   166.948
		ArgOfPericenter 82.8729
		MeanAnomaly     -172.894
	}
}

DwarfMoon	"Foerost System 2.D2"
{
	ParentBody     "Foerost System 2"
	Class	       "Asteroid"

	Mass            0.000107863
	Radius          285.875
	InertiaMoment   0.396807

	Oblateness      0.0160421

	Obliquity       1.26682
	EqAscendNode    9.04622
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.691 0.687 0.682)

	Surface
	{
		SurfStyle       0.689706
		OceanStyle      0.520379
		Randomize      (0.797, 0.124, -0.444)
		colorDistMagn   0.660592
		colorDistFreq   33.1482
		detailScale     7806.29
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0440687
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.647554
		terraceProb     0.292235
		erosion         0
		montesMagn      0.595682
		montesFreq      2.96232
		montesSpiky     0.934714
		montesFraction  0.628091
		dunesFraction   0
		hillsMagn       0
		hillsFreq       145.61
		hillsFraction   0.588097
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.27593
		craterFreq      2.95313
		craterDensity   1.02292
		craterOctaves   17
		volcanoActivity 0.0191477
		volcanoFlows    0
		volcanoRadius   0.505965
		volcanoTemp     1384.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.270, 0.234, 0.191, 0.000)
		colorShelf     (0.277, 0.241, 0.218, 0.000)
		colorBeach     (0.325, 0.282, 0.259, 0.000)
		colorDesert    (0.353, 0.302, 0.252, 0.000)
		colorLowland   (0.387, 0.323, 0.286, 0.000)
		colorUpland    (0.429, 0.392, 0.348, 0.000)
		colorRock      (0.463, 0.426, 0.375, 0.000)
		colorSnow      (0.505, 0.454, 0.396, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00011686
		Period          0.00128782
		Eccentricity    0.00025804
		Inclination     1.26682
		AscendingNode   9.04622
		ArgOfPericenter -0.615574
		MeanAnomaly     31.5181
	}
}

Planet	"Foerost System 3"
{
	ParentBody     "Foerost System"
	Class	       "GasGiant"

	Mass            511.042
	Radius          76117.3
	InertiaMoment   0.24739

	Obliquity       1.26751
	EqAscendNode    -32.2449
	TidalLocked     true

	AlbedoBond      0.496917
	AlbedoGeom      0.5963
	Brightness      2
	Color          (0.561 0.342 0.157)

	Surface
	{
		SurfStyle       0.580073
		Randomize      (0.163, -0.999, 0.176)
		detailScale     195778
		colorConversion true
		tropicLatitude  0.0424919
		icecapLatitude  0.942492
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0.230177
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     3.62391
		stripeFluct     0.300353
		stripeTwist     8.67505
		cycloneMagn     8.79404
		cycloneFreq     0.739945
		cycloneDensity  0.261498
		cycloneOctaves  5
		colorLayer0    (0.570, 0.550, 0.480, 1.100)
		colorLayer1    (0.850, 0.860, 0.870, 0.700)
		colorLayer2    (0.450, 0.390, 0.260, 0.200)
		colorLayer3    (0.430, 0.330, 0.170, 0.020)
		colorLayer4    (0.830, 0.830, 0.830, 0.000)
		colorLayer5    (0.510, 0.400, 0.140, 0.000)
		colorLayer6    (0.370, 0.350, 0.280, 0.000)
		colorLayer7    (0.420, 0.390, 0.310, 1.000)
		colorLowPlants (0.830, 0.830, 0.830, 0.000)
		colorUpPlants  (0.510, 0.400, 0.140, 0.000)
		BumpHeight      10.5582
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          65.2969
		Velocity        470.558
		BumpHeight      54.7356
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.941103
		mainOctaves     12
		Coverage        0.46917
		stripeZones     3.62391
		stripeFluct     0.300353
		stripeTwist     8.67505
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Jupiter"
		Height          284.236
		Density         5460.78
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0132343
		Saturation      0.728336

		Composition
		{
			H2    	91.684
			He    	7.88664
			CH4   	0.340812
			N2    	0.0414352
			NH3   	0.0306534
			O2    	0.0086917
			C2H2  	0.00310647
			C2H4  	0.00134947
			Ne    	0.00124543
			Ar    	0.000999976
			C2H6  	0.000722196
			C3H8  	0.000312601
		}
	}

	Aurora
	{
		Height      2730.34
		NorthLat    86.0123
		NorthLon    -161.349
		NorthRadius 20193.5
		NorthWidth  7754.6
		NorthRings  4
		NorthBright 1
		NorthParticles 10000
		SouthLat    -85.3618
		SouthLon    18.0217
		SouthRadius 24262.2
		SouthWidth  15607.8
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
		SemiMajorAxis   0.0795124
		Period          0.0496005
		Eccentricity    0.0241221
		Inclination     1.26751
		AscendingNode   -32.2449
		ArgOfPericenter 71.4973
		MeanAnomaly     203.767
	}
}

DwarfMoon	"Foerost System 3.D1"
{
	ParentBody     "Foerost System 3"
	Class	       "Asteroid"

	Mass            4.74301e-009
	Radius          23.1478
	InertiaMoment   0.399183

	Oblateness      0.249

	Obliquity       -0.00749098
	EqAscendNode    61.8753
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.749 0.620 0.556)

	Surface
	{
		SurfStyle       0.872462
		OceanStyle      0.416729
		Randomize      (-0.017, -0.148, 0.602)
		colorDistMagn   0.723107
		colorDistFreq   0.240144
		detailScale     632.091
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.539298
		terraceProb     0.245364
		erosion         0
		montesMagn      0.445847
		montesFreq      3.02315
		montesSpiky     0.991886
		montesFraction  0.473826
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.937334
		hillsFraction   0.6944
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223272
		craterFreq      0.244259
		craterDensity   0.937964
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.490569
		volcanoTemp     1533.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.255, 0.217, 0.223, 0.050)
		colorShelf     (0.300, 0.254, 0.256, 0.040)
		colorBeach     (0.345, 0.291, 0.289, 0.030)
		colorDesert    (0.390, 0.329, 0.328, 0.020)
		colorLowland   (0.435, 0.366, 0.362, 0.030)
		colorUpland    (0.479, 0.403, 0.395, 0.050)
		colorRock      (0.524, 0.440, 0.439, 0.020)
		colorSnow      (0.524, 0.440, 0.439, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00117025
		Period          0.00102416
		Eccentricity    7.16484e-006
		Inclination     -0.00749098
		AscendingNode   61.8753
		ArgOfPericenter 98.683
		MeanAnomaly     -21.585
	}
}

DwarfMoon	"Foerost System 3.D2"
{
	ParentBody     "Foerost System 3"
	Class	       "Asteroid"

	Mass            6.52812e-009
	Radius          24.4374
	InertiaMoment   0.39573

	Oblateness      0.212353

	Obliquity       -0.00471968
	EqAscendNode    -94.2154
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.625 0.542 0.411)

	Surface
	{
		SurfStyle       0.787113
		OceanStyle      0.720213
		Randomize      (-0.411, -0.106, 0.460)
		colorDistMagn   0.736836
		colorDistFreq   0.306519
		detailScale     667.305
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.411788
		terraceProb     0.318166
		erosion         0
		montesMagn      0.571029
		montesFreq      2.44863
		montesSpiky     0.923344
		montesFraction  0.197678
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.30888
		hillsFraction   0.522636
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.283644
		craterFreq      0.235932
		craterDensity   0.956194
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.444857
		volcanoTemp     1638.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.244, 0.184, 0.115, 0.000)
		colorShelf     (0.250, 0.190, 0.132, 0.000)
		colorBeach     (0.294, 0.222, 0.156, 0.000)
		colorDesert    (0.319, 0.238, 0.152, 0.000)
		colorLowland   (0.350, 0.255, 0.173, 0.000)
		colorUpland    (0.388, 0.309, 0.210, 0.000)
		colorRock      (0.419, 0.336, 0.226, 0.000)
		colorSnow      (0.456, 0.358, 0.239, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00125312
		Period          0.00113485
		Eccentricity    4.55801e-005
		Inclination     -0.00471968
		AscendingNode   -94.2154
		ArgOfPericenter 131.019
		MeanAnomaly     70.3898
	}
}

DwarfMoon	"Foerost System 3.D3"
{
	ParentBody     "Foerost System 3"
	Class	       "Asteroid"

	Mass            8.94217e-009
	Radius          31.7097
	InertiaMoment   0.398254

	Oblateness      0.249

	Obliquity       0.00869817
	EqAscendNode    -11.8122
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.766 0.763 0.760)

	Surface
	{
		SurfStyle       0.776473
		OceanStyle      0.775318
		Randomize      (-0.066, -0.351, -0.193)
		colorDistMagn   0.179314
		colorDistFreq   0.447137
		detailScale     865.887
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.322166
		terraceProb     0.199686
		erosion         0
		montesMagn      0.441046
		montesFreq      2.85384
		montesSpiky     0.838258
		montesFraction  0.321041
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.19538
		hillsFraction   0.516595
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242573
		craterFreq      0.261071
		craterDensity   0.877298
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.452445
		volcanoTemp     1507.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.299, 0.259, 0.213, 0.000)
		colorShelf     (0.306, 0.267, 0.243, 0.000)
		colorBeach     (0.360, 0.313, 0.289, 0.000)
		colorDesert    (0.390, 0.336, 0.281, 0.000)
		colorLowland   (0.429, 0.358, 0.319, 0.000)
		colorUpland    (0.475, 0.435, 0.388, 0.000)
		colorRock      (0.513, 0.473, 0.418, 0.000)
		colorSnow      (0.559, 0.503, 0.441, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0012718
		Period          0.00116032
		Eccentricity    4.7336e-005
		Inclination     0.00869817
		AscendingNode   -11.8122
		ArgOfPericenter 170.79
		MeanAnomaly     128.166
	}
}

DwarfMoon	"Foerost System 3.D4"
{
	ParentBody     "Foerost System 3"
	Class	       "Asteroid"

	Mass            1.22033e-008
	Radius          33.2235
	InertiaMoment   0.399317

	Oblateness      0.00296435

	Obliquity       -28.592
	EqAscendNode    -93.2754
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.740 0.672 0.619)

	Surface
	{
		SurfStyle       0.687581
		OceanStyle      0.652983
		Randomize      (0.994, 0.466, -0.584)
		colorDistMagn   0.473839
		colorDistFreq   0.69151
		detailScale     907.224
		colorConversion true
		snowLevel       2
		tropicLatitude  0.620688
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.479543
		terraceProb     0.343211
		erosion         0
		montesMagn      0.5017
		montesFreq      3.79949
		montesSpiky     0.970838
		montesFraction  0.71377
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.09701
		hillsFraction   0.649672
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256997
		craterFreq      0.186451
		craterDensity   0.875468
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.450701
		volcanoTemp     1411.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.289, 0.229, 0.173, 0.000)
		colorShelf     (0.296, 0.235, 0.198, 0.000)
		colorBeach     (0.348, 0.276, 0.235, 0.000)
		colorDesert    (0.378, 0.296, 0.229, 0.000)
		colorLowland   (0.415, 0.316, 0.260, 0.000)
		colorUpland    (0.459, 0.383, 0.316, 0.000)
		colorRock      (0.496, 0.417, 0.340, 0.000)
		colorSnow      (0.540, 0.444, 0.359, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00228965
		Period          0.00280289
		Eccentricity    0.209476
		Inclination     -28.592
		AscendingNode   -93.2754
		ArgOfPericenter -35.9404
		MeanAnomaly     -78.0533
	}
}

DwarfMoon	"Foerost System 3.D5"
{
	ParentBody     "Foerost System 3"
	Class	       "Asteroid"

	Mass            1.66078e-008
	Radius          35.3529
	InertiaMoment   0.396528

	Oblateness      0.0227464

	Obliquity       79.6887
	EqAscendNode    -0.517335
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.575 0.570 0.566)

	Surface
	{
		SurfStyle       0.555472
		OceanStyle      0.441327
		Randomize      (-0.338, -0.172, -0.337)
		colorDistMagn   0.439157
		colorDistFreq   0.933611
		detailScale     965.371
		colorConversion true
		snowLevel       2
		tropicLatitude  0.352315
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.473262
		terraceProb     0.312592
		erosion         0
		montesMagn      0.410373
		montesFreq      2.64981
		montesSpiky     0.97259
		montesFraction  0.498789
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.73906
		hillsFraction   0.48598
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224643
		craterFreq      0.227803
		craterDensity   0.90651
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.578224
		volcanoTemp     1841.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.224, 0.194, 0.158, 0.000)
		colorShelf     (0.230, 0.199, 0.181, 0.000)
		colorBeach     (0.270, 0.234, 0.215, 0.000)
		colorDesert    (0.293, 0.251, 0.209, 0.000)
		colorLowland   (0.322, 0.268, 0.238, 0.000)
		colorUpland    (0.356, 0.325, 0.289, 0.000)
		colorRock      (0.385, 0.353, 0.311, 0.000)
		colorSnow      (0.419, 0.376, 0.328, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.002799
		Period          0.00378839
		Eccentricity    0.0557787
		Inclination     79.6887
		AscendingNode   -0.517335
		ArgOfPericenter -61.0483
		MeanAnomaly     88.6358
	}
}

DwarfMoon	"Foerost System 3.D6"
{
	ParentBody     "Foerost System 3"
	Class	       "Asteroid"

	Mass            2.25607e-008
	Radius          37.331
	InertiaMoment   0.39843

	Oblateness      0.0145645

	Obliquity       -45.6671
	EqAscendNode    121.789
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.710 0.709 0.707)

	Surface
	{
		SurfStyle       0.178486
		OceanStyle      0.99487
		Randomize      (-0.600, -0.255, 0.671)
		colorDistMagn   0.508907
		colorDistFreq   0.336025
		detailScale     1019.39
		colorConversion true
		snowLevel       2
		tropicLatitude  0.652389
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.457722
		terraceProb     0.577329
		erosion         0
		montesMagn      0.373119
		montesFreq      3.40431
		montesSpiky     0.997762
		montesFraction  0.370183
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.54693
		hillsFraction   0.750001
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.274725
		craterFreq      0.183523
		craterDensity   0.8834
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.467552
		volcanoTemp     1267.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.284, 0.283, 0.283, 0.000)
		colorShelf     (0.302, 0.301, 0.301, 0.000)
		colorBeach     (0.320, 0.319, 0.318, 0.000)
		colorDesert    (0.337, 0.337, 0.336, 0.000)
		colorLowland   (0.355, 0.354, 0.354, 0.000)
		colorUpland    (0.373, 0.372, 0.371, 0.000)
		colorRock      (0.391, 0.390, 0.389, 0.000)
		colorSnow      (0.408, 0.407, 0.407, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00310364
		Period          0.00442343
		Eccentricity    0.0884746
		Inclination     -45.6671
		AscendingNode   121.789
		ArgOfPericenter 13.9177
		MeanAnomaly     24.0382
	}
}

DwarfMoon	"Foerost System 3.D7"
{
	ParentBody     "Foerost System 3"
	Class	       "Asteroid"

	Mass            3.06181e-008
	Radius          48.4194
	InertiaMoment   0.399448

	Oblateness      0.00384097

	RotationPeriod  95.922
	Obliquity       85.8682
	EqAscendNode    -90.9482

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.702 0.698 0.695)

	Surface
	{
		SurfStyle       0.354143
		OceanStyle      0.139067
		Randomize      (0.795, -0.014, -0.106)
		colorDistMagn   0.707931
		colorDistFreq   1.3088
		detailScale     1322.17
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999766
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.443139
		terraceProb     0.326196
		erosion         0
		montesMagn      0.447511
		montesFreq      3.02252
		montesSpiky     0.947885
		montesFraction  0.416622
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.52504
		hillsFraction   0.831276
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23965
		craterFreq      0.185386
		craterDensity   0.857675
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.490377
		volcanoTemp     1359.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.281, 0.279, 0.278, 0.000)
		colorShelf     (0.298, 0.297, 0.295, 0.000)
		colorBeach     (0.316, 0.314, 0.313, 0.000)
		colorDesert    (0.333, 0.332, 0.330, 0.000)
		colorLowland   (0.351, 0.349, 0.348, 0.000)
		colorUpland    (0.368, 0.366, 0.365, 0.000)
		colorRock      (0.386, 0.384, 0.382, 0.000)
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
		SemiMajorAxis   0.00357627
		Period          0.00547137
		Eccentricity    0.425185
		Inclination     85.8682
		AscendingNode   -90.9482
		ArgOfPericenter 115.101
		MeanAnomaly     -132.826
	}
}

DwarfMoon	"Foerost System 3.D8"
{
	ParentBody     "Foerost System 3"
	Class	       "Asteroid"

	Mass            4.15492e-008
	Radius          50.3003
	InertiaMoment   0.396991

	Oblateness      0.00866447

	Obliquity       71.9024
	EqAscendNode    83.8391
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.620 0.616 0.613)

	Surface
	{
		SurfStyle       0.156216
		OceanStyle      0.113024
		Randomize      (-0.651, -0.162, -0.536)
		colorDistMagn   0.284422
		colorDistFreq   1.09191
		detailScale     1373.53
		colorConversion true
		snowLevel       2
		tropicLatitude  1
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.449187
		terraceProb     0.269631
		erosion         0
		montesMagn      0.484641
		montesFreq      2.4199
		montesSpiky     0.895263
		montesFraction  0.820206
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.26014
		hillsFraction   0.729967
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241385
		craterFreq      0.217252
		craterDensity   0.96916
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.479354
		volcanoTemp     1607.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.248, 0.246, 0.245, 0.000)
		colorShelf     (0.264, 0.262, 0.260, 0.000)
		colorBeach     (0.279, 0.277, 0.276, 0.000)
		colorDesert    (0.295, 0.293, 0.291, 0.000)
		colorLowland   (0.310, 0.308, 0.306, 0.000)
		colorUpland    (0.326, 0.323, 0.322, 0.000)
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
		SemiMajorAxis   0.00404922
		Period          0.00659187
		Eccentricity    0.0143235
		Inclination     71.9024
		AscendingNode   83.8391
		ArgOfPericenter -124.685
		MeanAnomaly     -140.857
	}
}

DwarfMoon	"Foerost System 3.D9"
{
	ParentBody     "Foerost System 3"
	Class	       "Asteroid"

	Mass            5.64265e-008
	Radius          53.4488
	InertiaMoment   0.398595

	Oblateness      0.00228717

	RotationPeriod  106.028
	Obliquity       -44.0944
	EqAscendNode    -129.105

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.540 0.532 0.528)

	Surface
	{
		SurfStyle       0.774728
		OceanStyle      0.771461
		Randomize      (0.736, 0.877, -0.724)
		colorDistMagn   0.863394
		colorDistFreq   1.21042
		detailScale     1459.51
		colorConversion true
		snowLevel       2
		tropicLatitude  0.570632
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.591317
		terraceProb     0.256171
		erosion         0
		montesMagn      0.407663
		montesFreq      2.91336
		montesSpiky     0.991819
		montesFraction  0.757565
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.88704
		hillsFraction   0.491194
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.21888
		craterFreq      0.269686
		craterDensity   0.790319
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.474802
		volcanoTemp     1356.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.211, 0.181, 0.148, 0.000)
		colorShelf     (0.216, 0.186, 0.169, 0.000)
		colorBeach     (0.254, 0.218, 0.201, 0.000)
		colorDesert    (0.275, 0.234, 0.196, 0.000)
		colorLowland   (0.302, 0.250, 0.222, 0.000)
		colorUpland    (0.335, 0.303, 0.269, 0.000)
		colorRock      (0.362, 0.330, 0.291, 0.000)
		colorSnow      (0.394, 0.351, 0.306, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00463152
		Period          0.00806375
		Eccentricity    0.231177
		Inclination     -44.0944
		AscendingNode   -129.105
		ArgOfPericenter -60.7463
		MeanAnomaly     -162.859
	}
}

DwarfMoon	"Foerost System 3.D10"
{
	ParentBody     "Foerost System 3"
	Class	       "Asteroid"

	Mass            7.67572e-008
	Radius          56.6334
	InertiaMoment   0.399577

	Oblateness      0.00350929

	Obliquity       1.83704
	EqAscendNode    -100.124
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.618 0.615 0.609)

	Surface
	{
		SurfStyle       0.0519792
		OceanStyle      0.958489
		Randomize      (-0.378, -0.444, -0.357)
		colorDistMagn   0.283209
		colorDistFreq   2.5075
		detailScale     1546.47
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0411491
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.399585
		terraceProb     0.220457
		erosion         0
		montesMagn      0.520707
		montesFreq      3.46181
		montesSpiky     0.935792
		montesFraction  0.230724
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.78433
		hillsFraction   0.59601
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239493
		craterFreq      0.249357
		craterDensity   0.793673
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.485175
		volcanoTemp     1342.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.247, 0.246, 0.244, 0.000)
		colorShelf     (0.263, 0.261, 0.259, 0.000)
		colorBeach     (0.278, 0.277, 0.274, 0.000)
		colorDesert    (0.294, 0.292, 0.289, 0.000)
		colorLowland   (0.309, 0.307, 0.304, 0.000)
		colorUpland    (0.325, 0.323, 0.320, 0.000)
		colorRock      (0.340, 0.338, 0.335, 0.000)
		colorSnow      (0.356, 0.353, 0.350, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0050381
		Period          0.00914853
		Eccentricity    0.00298631
		Inclination     1.83704
		AscendingNode   -100.124
		ArgOfPericenter 113.555
		MeanAnomaly     177.779
	}
}

Planet	"Foerost System 4"
{
	ParentBody     "Foerost System"
	Class	       "Oceania"

	Mass            7.43978
	Radius          12344
	InertiaMoment   0.33308

	RotationPeriod  6949.08
	Obliquity       -0.167479
	EqAscendNode    -173.904

	AlbedoBond      0.438682
	AlbedoGeom      0.526419
	Brightness      2
	Color          (0.503 0.495 0.490)

	Surface
	{
		SurfStyle       0.329323
		OceanStyle      0.890779
		Randomize      (0.724, -0.249, 0.165)
		colorDistMagn   0.0675024
		colorDistFreq   1471.72
		detailScale     31749.6
		colorConversion true
		seaLevel        0.960007
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  10
		icecapHeight    1.15679
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        0.852914
		venusFreq       1.06755
		venusMagn       0.39723
		mareFreq        0
		mareDensity     0
		terraceProb     0.412103
		erosion         0
		montesMagn      0.170574
		montesFreq      746.963
		montesSpiky     0.909647
		montesFraction  0.756384
		dunesMagn       0.0486493
		dunesFreq       111.76
		dunesFraction   0.591961
		hillsMagn       0.12657
		hillsFreq       1730
		hillsFraction   0.115133
		hills2Fraction  0.376302
		riversMagn      65.8408
		riversFreq      2.99321
		riversSin       5.71508
		riversOctaves   0
		canyonsMagn     0.0609323
		canyonsFreq     347.948
		canyonFraction  0.85844
		cracksMagn      0.0963032
		cracksFreq      1.06144
		cracksOctaves   0
		craterMagn      0.054328
		craterFreq      111.529
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.714022
		volcanoFreq     0.868762
		volcanoDensity  0
		volcanoOctaves  0
		volcanoActivity 2
		volcanoFlows    0
		volcanoRadius   0.419098
		volcanoTemp     1179.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.38016
		stripeTwist     0.581502
		cycloneMagn     2.42075
		cycloneFreq     0.598387
		cycloneDensity  0.461895
		cycloneOctaves  2
		colorSea       (0.040, 0.200, 0.100, 1.000)
		colorShelf     (0.150, 0.460, 0.280, 1.000)
		colorBeach     (0.950, 0.950, 0.950, 1.308)
		colorDesert    (0.770, 0.770, 0.470, 1.308)
		colorLowland   (0.880, 0.880, 0.880, 1.308)
		colorUpland    (1.000, 1.000, 1.000, 1.308)
		colorRock      (1.000, 1.000, 1.000, 1.308)
		colorSnow      (1.000, 1.000, 1.000, 1.308)
		BumpHeight      38.4788
		BumpOffset      36.939
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
		Height          6.55566
		Velocity        120.063
		BumpHeight      6.46415
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.03071
		mainOctaves     10
		Coverage        0.397804
		stripeZones     2.38016
		stripeTwist     0.581502
	}

	Clouds
	{
		Height          13.1113
		Velocity        149.418
		BumpHeight      5.80273
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.03071
		mainOctaves     10
		Coverage        0.397804
		stripeZones     2.38016
		stripeTwist     0.581502
	}

	Clouds
	{
		Height          19.667
		Velocity        199.404
		BumpHeight      5.52312
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.03071
		mainOctaves     10
		Coverage        0.397804
		stripeZones     2.38016
		stripeTwist     0.581502
	}

	Ocean
	{
		Height          36.9399
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
	}

	NoLava          true

	Atmosphere
	{
		Model          "Venus"
		Height          72.0462
		Density         1815.55
		Pressure        1547.23
		Greenhouse      262.046
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0628755
		Saturation      0.625751

		Composition
		{
			CO2   	93.3965
			H2O   	5.79603
			SO2   	0.417554
			N2    	0.388027
			CO    	0.001092
			Ar    	0.0005476
			He    	0.000206284
			Ne    	5.72854e-005
		}
	}

	NoAurora        true

	Rings
	{
		InnerRadius     18402.6
		OuterRadius     33408.3
		RotationPeriod  4.23536
		RotationOffset  0
		FrontBright     0.528583
		BackBright      0.937608
		Density         0.655302
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.15241
		Period          0.132118
		Eccentricity    0.0807233
		Inclination     -0.167479
		AscendingNode   -173.904
		ArgOfPericenter 324.129
		MeanAnomaly     289.792
	}
}

DwarfMoon	"Foerost System 4.D1"
{
	ParentBody     "Foerost System 4"
	Class	       "Asteroid"

	Mass            1.96264e-006
	Radius          161.612
	InertiaMoment   0.399009

	Oblateness      0.249

	Obliquity       -0.0122688
	EqAscendNode    154.518
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.509 0.505 0.504)

	Surface
	{
		SurfStyle       0.516158
		OceanStyle      0.856683
		Randomize      (-0.886, 0.629, 0.163)
		colorDistMagn   0.628352
		colorDistFreq   9.25711
		detailScale     4413.07
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.368953
		terraceProb     0.290755
		erosion         0
		montesMagn      0.485631
		montesFreq      3.66045
		montesSpiky     0.95441
		montesFraction  0.940339
		dunesFraction   0
		hillsMagn       0
		hillsFreq       43.1786
		hillsFraction   0.513729
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223313
		craterFreq      1.02204
		craterDensity   0.923382
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.496597
		volcanoTemp     1098.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.198, 0.172, 0.141, 0.000)
		colorShelf     (0.203, 0.177, 0.161, 0.000)
		colorBeach     (0.239, 0.207, 0.191, 0.000)
		colorDesert    (0.259, 0.222, 0.186, 0.000)
		colorLowland   (0.285, 0.238, 0.212, 0.000)
		colorUpland    (0.315, 0.288, 0.257, 0.000)
		colorRock      (0.341, 0.313, 0.277, 0.000)
		colorSnow      (0.371, 0.334, 0.292, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000265039
		Period          0.000914878
		Eccentricity    2.44479e-006
		Inclination     -0.0122688
		AscendingNode   154.518
		ArgOfPericenter -49.9385
		MeanAnomaly     -112.714
	}
}

DwarfMoon	"Foerost System 4.D2"
{
	ParentBody     "Foerost System 4"
	Class	       "Asteroid"

	Mass            2.94273e-006
	Radius          216.672
	InertiaMoment   0.399926

	Oblateness      0.249

	Obliquity       0.0109049
	EqAscendNode    -45.0464
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.511 0.506 0.497)

	Surface
	{
		SurfStyle       0.86592
		OceanStyle      0.891509
		Randomize      (0.806, -0.888, 0.090)
		colorDistMagn   0.934416
		colorDistFreq   26.0839
		detailScale     5916.59
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.380623
		terraceProb     0.332506
		erosion         0
		montesMagn      0.407453
		montesFreq      2.8973
		montesSpiky     0.853133
		montesFraction  0.3562
		dunesFraction   0
		hillsMagn       0
		hillsFreq       125.319
		hillsFraction   0.485608
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227866
		craterFreq      1.38275
		craterDensity   0.858207
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.537218
		volcanoTemp     1210.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.174, 0.177, 0.199, 0.050)
		colorShelf     (0.204, 0.207, 0.228, 0.040)
		colorBeach     (0.235, 0.238, 0.258, 0.030)
		colorDesert    (0.266, 0.268, 0.293, 0.020)
		colorLowland   (0.296, 0.298, 0.323, 0.030)
		colorUpland    (0.327, 0.329, 0.353, 0.050)
		colorRock      (0.358, 0.359, 0.392, 0.020)
		colorSnow      (0.358, 0.359, 0.392, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000319623
		Period          0.00121159
		Eccentricity    7.20168e-005
		Inclination     0.0109049
		AscendingNode   -45.0464
		ArgOfPericenter -21.1143
		MeanAnomaly     2.94283
	}
}

DwarfMoon	"Foerost System 4.D3"
{
	ParentBody     "Foerost System 4"
	Class	       "Asteroid"

	Mass            4.51853e-006
	Radius          237.195
	InertiaMoment   0.398012

	Obliquity       73.1696
	EqAscendNode    -1.94303
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.436 0.432 0.429)

	Surface
	{
		SurfStyle       0.734091
		OceanStyle      0.516206
		Randomize      (0.114, -0.725, -0.010)
		colorDistMagn   0.504115
		colorDistFreq   49.2044
		detailScale     6477
		colorConversion true
		snowLevel       2
		tropicLatitude  0.555066
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.766139
		terraceProb     0.42011
		erosion         0
		montesMagn      0.397692
		montesFreq      2.87227
		montesSpiky     0.877297
		montesFraction  0.680499
		dunesFraction   0
		hillsMagn       0
		hillsFreq       144.873
		hillsFraction   0.478002
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246148
		craterFreq      1.8522
		craterDensity   1.05468
		craterOctaves   16
		volcanoActivity 0.741108
		volcanoFlows    0
		volcanoRadius   0.46223
		volcanoTemp     1736.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.170, 0.147, 0.120, 0.000)
		colorShelf     (0.174, 0.151, 0.137, 0.000)
		colorBeach     (0.205, 0.177, 0.163, 0.000)
		colorDesert    (0.222, 0.190, 0.159, 0.000)
		colorLowland   (0.244, 0.203, 0.180, 0.000)
		colorUpland    (0.270, 0.246, 0.219, 0.000)
		colorRock      (0.292, 0.268, 0.236, 0.000)
		colorSnow      (0.318, 0.285, 0.249, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00093002
		Period          0.00601365
		Eccentricity    0.161941
		Inclination     73.1696
		AscendingNode   -1.94303
		ArgOfPericenter -135.944
		MeanAnomaly     103.092
	}
}

DwarfMoon	"Foerost System 4.D4"
{
	ParentBody     "Foerost System 4"
	Class	       "Asteroid"

	Mass            1.23323e-011
	Radius          3.18399
	InertiaMoment   0.399148

	Oblateness      0.00227954

	Obliquity       -36.9616
	EqAscendNode    39.9665
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.587 0.583 0.575)

	Surface
	{
		SurfStyle       0.397655
		OceanStyle      0.146315
		Randomize      (0.982, 0.921, 0.738)
		colorDistMagn   0.28291
		colorDistFreq   0.00459191
		detailScale     86.9443
		colorConversion true
		snowLevel       2
		tropicLatitude  0.932421
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.495397
		terraceProb     0.508922
		erosion         0
		montesMagn      0.640439
		montesFreq      3.71847
		montesSpiky     0.838265
		montesFraction  0.504764
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0220163
		hillsFraction   0.950118
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.206716
		craterFreq      0.202098
		craterDensity   0.798641
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.520102
		volcanoTemp     1200.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.235, 0.233, 0.230, 0.000)
		colorShelf     (0.250, 0.248, 0.244, 0.000)
		colorBeach     (0.264, 0.262, 0.259, 0.000)
		colorDesert    (0.279, 0.277, 0.273, 0.000)
		colorLowland   (0.294, 0.291, 0.288, 0.000)
		colorUpland    (0.308, 0.306, 0.302, 0.000)
		colorRock      (0.323, 0.320, 0.316, 0.000)
		colorSnow      (0.338, 0.335, 0.331, 1.000)
		BumpHeight      2.8656
		BumpOffset      0.573119
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0014682
		Period          0.0119282
		Eccentricity    0.160645
		Inclination     -36.9616
		AscendingNode   39.9665
		ArgOfPericenter 16.3855
		MeanAnomaly     -134.123
	}
}

Planet	"Foerost System 5"
{
	ParentBody     "Foerost System"
	Class	       "IceGiant"

	Mass            11.2838
	Radius          18482.8
	InertiaMoment   0.196864

	Oblateness      0.00932396

	RotationPeriod  16.7146
	Obliquity       5.32751
	EqAscendNode    100.442

	AlbedoBond      0.499043
	AlbedoGeom      0.598852
	Brightness      2

	Surface
	{
		SurfStyle       0.674012
		Randomize      (-0.027, -0.011, 0.239)
		detailScale     47538.9
		colorConversion true
		tropicLatitude  0.0977979
		icecapLatitude  0.997798
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     8.3928
		stripeFluct     0.347784
		stripeTwist     11.5073
		cycloneMagn     8.92101
		cycloneFreq     0.434539
		cycloneDensity  0.381715
		cycloneOctaves  1
		colorLayer0    (0.620, 0.550, 0.430, 1.000)
		colorLayer1    (0.710, 0.630, 0.480, 1.000)
		colorLayer2    (0.490, 0.400, 0.310, 1.000)
		colorLayer3    (0.720, 0.710, 0.500, 1.000)
		colorLayer4    (0.640, 0.520, 0.350, 1.000)
		colorLayer5    (0.490, 0.400, 0.310, 1.000)
		colorLayer6    (0.560, 0.460, 0.340, 1.000)
		colorLayer7    (0.560, 0.460, 0.340, 1.000)
		colorLowPlants (0.640, 0.520, 0.350, 1.000)
		colorUpPlants  (0.490, 0.400, 0.310, 1.000)
		BumpHeight      17.2535
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          84.2832
		Velocity        2308.16
		BumpHeight      51.8355
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.21548
		mainOctaves     12
		Coverage        0.495215
		stripeZones     8.3928
		stripeFluct     0.347784
		stripeTwist     11.5073
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Jupiter"
		Height          184.828
		Density         837.524
		Pressure        114722
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.0216844
		Saturation      0.845356

		Composition
		{
			H2    	93.8591
			He    	5.8141
			CH4   	0.278264
			N2    	0.0381482
			O2    	0.00625855
			C2H4  	0.00116935
			Ne    	0.00108496
			Ar    	0.000673551
			C2H2  	0.000656038
			C2H6  	0.000550671
		}
	}

	Aurora
	{
		Height      439.954
		NorthLat    67.2387
		NorthLon    128.769
		NorthRadius 5506.44
		NorthWidth  1619.22
		NorthRings  4
		NorthBright 1
		NorthParticles 10000
		SouthLat    -80.6403
		SouthLon    300.335
		SouthRadius 5793.5
		SouthWidth  1433.46
		SouthRings  3
		SouthBright 1
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	Rings
	{
		InnerRadius     25654.9
		OuterRadius     64622.7
		RotationPeriod  7.91007
		RotationOffset  0
		FrontBright     0.892631
		BackBright      0.777667
		Density         0.88603
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.24346
		Period          0.266728
		Eccentricity    0.0473802
		Inclination     -0.990883
		AscendingNode   101.68
		ArgOfPericenter 256.083
		MeanAnomaly     40.6251
	}
}

DwarfMoon	"Foerost System 5.D1"
{
	ParentBody     "Foerost System 5"
	Class	       "Asteroid"

	Mass            1.27497e-009
	Radius          14.6761
	InertiaMoment   0.398516

	Oblateness      0.249

	Obliquity       -0.00323579
	EqAscendNode    -39.1524
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.417 0.409 0.406)

	Surface
	{
		SurfStyle       0.503798
		OceanStyle      0.667208
		Randomize      (0.054, -0.596, -0.261)
		colorDistMagn   0.770629
		colorDistFreq   0.109537
		detailScale     400.755
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.636396
		terraceProb     0.127278
		erosion         0
		montesMagn      0.50857
		montesFreq      2.60753
		montesSpiky     0.988643
		montesFraction  0.409851
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.485933
		hillsFraction   0.77725
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228346
		craterFreq      0.231599
		craterDensity   1.00633
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.522557
		volcanoTemp     1373.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.163, 0.139, 0.114, 0.000)
		colorShelf     (0.167, 0.143, 0.130, 0.000)
		colorBeach     (0.196, 0.168, 0.154, 0.000)
		colorDesert    (0.213, 0.180, 0.150, 0.000)
		colorLowland   (0.233, 0.192, 0.171, 0.000)
		colorUpland    (0.259, 0.233, 0.207, 0.000)
		colorRock      (0.279, 0.254, 0.223, 0.000)
		colorSnow      (0.304, 0.270, 0.235, 1.000)
		BumpHeight      13.2085
		BumpOffset      2.6417
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000271276
		Period          0.00076925
		Eccentricity    5.75536e-005
		Inclination     -0.00323579
		AscendingNode   -39.1524
		ArgOfPericenter 89.3331
		MeanAnomaly     6.40659
	}
}

DwarfMoon	"Foerost System 5.D2"
{
	ParentBody     "Foerost System 5"
	Class	       "Asteroid"

	Mass            1.81063e-009
	Radius          20.7984
	InertiaMoment   0.399514

	Oblateness      0.00375879

	Obliquity       -32.976
	EqAscendNode    74.2067
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.820 0.780 0.728)

	Surface
	{
		SurfStyle       0.220723
		OceanStyle      0.990195
		Randomize      (-0.507, 0.210, -0.628)
		colorDistMagn   0.15028
		colorDistFreq   0.2751
		detailScale     567.936
		colorConversion true
		snowLevel       2
		tropicLatitude  0.782125
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.403976
		terraceProb     0.341098
		erosion         0
		montesMagn      0.469584
		montesFreq      2.21124
		montesSpiky     0.92881
		montesFraction  0.68116
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.01396
		hillsFraction   0.554729
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224085
		craterFreq      0.148419
		craterDensity   0.963072
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.466625
		volcanoTemp     1336.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.328, 0.312, 0.291, 0.000)
		colorShelf     (0.348, 0.332, 0.309, 0.000)
		colorBeach     (0.369, 0.351, 0.327, 0.000)
		colorDesert    (0.389, 0.371, 0.346, 0.000)
		colorLowland   (0.410, 0.390, 0.364, 0.000)
		colorUpland    (0.430, 0.410, 0.382, 0.000)
		colorRock      (0.451, 0.429, 0.400, 0.000)
		colorSnow      (0.471, 0.449, 0.418, 1.000)
		BumpHeight      18.7186
		BumpOffset      3.74372
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0017688
		Period          0.0128076
		Eccentricity    0.494034
		Inclination     -32.976
		AscendingNode   74.2067
		ArgOfPericenter 97.0946
		MeanAnomaly     67.5613
	}
}

DwarfMoon	"Foerost System 5.D3"
{
	ParentBody     "Foerost System 5"
	Class	       "Asteroid"

	Mass            2.54495e-009
	Radius          20.2834
	InertiaMoment   0.397177

	RotationPeriod  412.767
	Obliquity       -89.4071
	EqAscendNode    -89.5834

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.451 0.446 0.444)

	Surface
	{
		SurfStyle       0.194634
		OceanStyle      0.120149
		Randomize      (0.924, 0.840, -0.499)
		colorDistMagn   0.952473
		colorDistFreq   0.215235
		detailScale     553.873
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999974
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.692333
		terraceProb     0.634047
		erosion         0
		montesMagn      0.423712
		montesFreq      3.41792
		montesSpiky     0.920141
		montesFraction  0.72604
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.603427
		hillsFraction   0.736624
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228053
		craterFreq      0.224046
		craterDensity   0.876643
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.47422
		volcanoTemp     1644.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.180, 0.179, 0.178, 0.000)
		colorShelf     (0.192, 0.190, 0.189, 0.000)
		colorBeach     (0.203, 0.201, 0.200, 0.000)
		colorDesert    (0.214, 0.212, 0.211, 0.000)
		colorLowland   (0.226, 0.223, 0.222, 0.000)
		colorUpland    (0.237, 0.234, 0.233, 0.000)
		colorRock      (0.248, 0.245, 0.244, 0.000)
		colorSnow      (0.259, 0.257, 0.256, 1.000)
		BumpHeight      18.2551
		BumpOffset      3.65102
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00202563
		Period          0.0156961
		Eccentricity    0.104414
		Inclination     -89.4071
		AscendingNode   -89.5834
		ArgOfPericenter -38.2196
		MeanAnomaly     125.545
	}
}

DwarfMoon	"Foerost System 5.D4"
{
	ParentBody     "Foerost System 5"
	Class	       "Asteroid"

	Mass            3.54645e-009
	Radius          21.6317
	InertiaMoment   0.398676

	Obliquity       85.6337
	EqAscendNode    -35.1964
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.628 0.625 0.619)

	Surface
	{
		SurfStyle       0.527539
		OceanStyle      0.659991
		Randomize      (-0.372, -0.123, 0.592)
		colorDistMagn   0.415208
		colorDistFreq   0.119393
		detailScale     590.69
		colorConversion true
		snowLevel       2
		tropicLatitude  0.591032
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.720572
		terraceProb     0.280901
		erosion         0
		montesMagn      0.495368
		montesFreq      2.79089
		montesSpiky     0.818924
		montesFraction  0.44767
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.03038
		hillsFraction   0.679832
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.265723
		craterFreq      0.269661
		craterDensity   0.946791
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.505299
		volcanoTemp     1394.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.245, 0.212, 0.173, 0.000)
		colorShelf     (0.251, 0.219, 0.198, 0.000)
		colorBeach     (0.295, 0.256, 0.235, 0.000)
		colorDesert    (0.320, 0.275, 0.229, 0.000)
		colorLowland   (0.352, 0.294, 0.260, 0.000)
		colorUpland    (0.389, 0.356, 0.316, 0.000)
		colorRock      (0.421, 0.387, 0.340, 0.000)
		colorSnow      (0.458, 0.412, 0.359, 1.000)
		BumpHeight      19.4686
		BumpOffset      3.89371
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0023675
		Period          0.0198329
		Eccentricity    0.0389607
		Inclination     85.6337
		AscendingNode   -35.1964
		ArgOfPericenter 56.2631
		MeanAnomaly     97.6244
	}
}

DwarfMoon	"Foerost System 5.D5"
{
	ParentBody     "Foerost System 5"
	Class	       "Asteroid"

	Mass            4.907e-009
	Radius          23.1471
	InertiaMoment   0.399642

	RotationPeriod  1346.28
	Obliquity       -61.0015
	EqAscendNode    -128.919

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.580 0.459 0.390)

	Surface
	{
		SurfStyle       0.499369
		OceanStyle      0.931728
		Randomize      (-0.171, 0.736, -0.504)
		colorDistMagn   0.248426
		colorDistFreq   0.357686
		detailScale     632.07
		colorConversion true
		snowLevel       2
		tropicLatitude  0.69852
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.351745
		terraceProb     0.352449
		erosion         0
		montesMagn      0.546786
		montesFreq      2.72168
		montesSpiky     0.870957
		montesFraction  0.346774
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.08981
		hillsFraction   0.794028
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234055
		craterFreq      0.166261
		craterDensity   0.787509
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.528402
		volcanoTemp     1583.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.232, 0.184, 0.156, 0.000)
		colorShelf     (0.246, 0.195, 0.166, 0.000)
		colorBeach     (0.261, 0.207, 0.175, 0.000)
		colorDesert    (0.275, 0.218, 0.185, 0.000)
		colorLowland   (0.290, 0.230, 0.195, 0.000)
		colorUpland    (0.304, 0.241, 0.205, 0.000)
		colorRock      (0.319, 0.253, 0.214, 0.000)
		colorSnow      (0.333, 0.264, 0.224, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00280647
		Period          0.0255971
		Eccentricity    0.0705738
		Inclination     -61.0015
		AscendingNode   -128.919
		ArgOfPericenter -156.724
		MeanAnomaly     95.6829
	}
}

DwarfMoon	"Foerost System 5.D6"
{
	ParentBody     "Foerost System 5"
	Class	       "Asteroid"

	Mass            6.75006e-009
	Radius          23.8733
	InertiaMoment   0.397482

	Obliquity       19.1678
	EqAscendNode    92.2561
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.482 0.423 0.329)

	Surface
	{
		SurfStyle       0.402091
		OceanStyle      0.257779
		Randomize      (-0.122, -0.711, 0.000)
		colorDistMagn   0.57185
		colorDistFreq   0.203298
		detailScale     651.899
		colorConversion true
		snowLevel       2
		tropicLatitude  0.443165
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.455411
		terraceProb     0.126729
		erosion         0
		montesMagn      0.38877
		montesFreq      4.55083
		montesSpiky     0.95134
		montesFraction  0.61296
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.23967
		hillsFraction   0.714713
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.269015
		craterFreq      0.215617
		craterDensity   0.919063
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.546014
		volcanoTemp     1847.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.193, 0.169, 0.132, 0.000)
		colorShelf     (0.205, 0.180, 0.140, 0.000)
		colorBeach     (0.217, 0.190, 0.148, 0.000)
		colorDesert    (0.229, 0.201, 0.156, 0.000)
		colorLowland   (0.241, 0.212, 0.165, 0.000)
		colorUpland    (0.253, 0.222, 0.173, 0.000)
		colorRock      (0.265, 0.233, 0.181, 0.000)
		colorSnow      (0.277, 0.243, 0.189, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00301518
		Period          0.028505
		Eccentricity    0.00027023
		Inclination     19.1678
		AscendingNode   92.2561
		ArgOfPericenter -160.092
		MeanAnomaly     48.7928
	}
}

DwarfMoon	"Foerost System 5.D7"
{
	ParentBody     "Foerost System 5"
	Class	       "Asteroid"

	Mass            9.24208e-009
	Radius          31.4447
	InertiaMoment   0.398828

	Obliquity       50.229
	EqAscendNode    -134.192
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.723 0.607 0.502)

	Surface
	{
		SurfStyle       0.116544
		OceanStyle      0.17693
		Randomize      (0.655, -0.051, -0.683)
		colorDistMagn   0.794749
		colorDistFreq   0.630088
		detailScale     858.649
		colorConversion true
		snowLevel       2
		tropicLatitude  0.570869
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.473912
		terraceProb     0.442976
		erosion         0
		montesMagn      0.483177
		montesFreq      2.92992
		montesSpiky     0.913205
		montesFraction  0.512738
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.88125
		hillsFraction   0.560964
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214105
		craterFreq      0.227189
		craterDensity   1.01367
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.44767
		volcanoTemp     1438.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.289, 0.243, 0.201, 0.000)
		colorShelf     (0.307, 0.258, 0.214, 0.000)
		colorBeach     (0.325, 0.273, 0.226, 0.000)
		colorDesert    (0.343, 0.288, 0.239, 0.000)
		colorLowland   (0.361, 0.304, 0.251, 0.000)
		colorUpland    (0.380, 0.319, 0.264, 0.000)
		colorRock      (0.398, 0.334, 0.276, 0.000)
		colorSnow      (0.416, 0.349, 0.289, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00361049
		Period          0.0373509
		Eccentricity    0.183595
		Inclination     50.229
		AscendingNode   -134.192
		ArgOfPericenter 81.3088
		MeanAnomaly     -81.774
	}
}

DwarfMoon	"Foerost System 5.D8"
{
	ParentBody     "Foerost System 5"
	Class	       "Asteroid"

	Mass            1.26083e-008
	Radius          33.2064
	InertiaMoment   0.399768

	Obliquity       -72.7805
	EqAscendNode    162.687
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.766 0.763 0.762)

	Surface
	{
		SurfStyle       0.922366
		OceanStyle      0.268934
		Randomize      (0.696, 0.722, -0.515)
		colorDistMagn   0.303919
		colorDistFreq   0.867855
		detailScale     906.756
		colorConversion true
		snowLevel       2
		tropicLatitude  0.284535
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.265503
		terraceProb     0.177062
		erosion         0
		montesMagn      0.506837
		montesFreq      3.59463
		montesSpiky     0.929946
		montesFraction  0.67327
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.89314
		hillsFraction   0.724235
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262754
		craterFreq      0.20332
		craterDensity   0.935904
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.524565
		volcanoTemp     1688.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.261, 0.267, 0.305, 0.050)
		colorShelf     (0.307, 0.313, 0.351, 0.040)
		colorBeach     (0.353, 0.359, 0.396, 0.030)
		colorDesert    (0.399, 0.405, 0.450, 0.020)
		colorLowland   (0.445, 0.450, 0.495, 0.030)
		colorUpland    (0.491, 0.496, 0.541, 0.050)
		colorRock      (0.537, 0.542, 0.602, 0.020)
		colorSnow      (0.537, 0.542, 0.602, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00406655
		Period          0.0446469
		Eccentricity    0.0911376
		Inclination     -72.7805
		AscendingNode   162.687
		ArgOfPericenter 78.3465
		MeanAnomaly     -96.7102
	}
}

Planet	"Foerost System 6"
{
	ParentBody     "Foerost System"
	Class	       "IceWorld"

	Mass            0.0148866
	Radius          2140.63
	InertiaMoment   0.367896

	Oblateness      0.00234834

	RotationPeriod  48.7528
	Obliquity       -77.8121
	EqAscendNode    74.599

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.589 0.546 0.471)

	Surface
	{
		SurfStyle       0.899959
		OceanStyle      0.948343
		Randomize      (-0.116, 0.010, -0.639)
		colorDistMagn   0.0588567
		colorDistFreq   257.315
		detailScale     5505.83
		colorConversion true
		drivenDarkening 0
		seaLevel        0.196927
		snowLevel       2
		tropicLatitude  0.976933
		icecapLatitude  1
		icecapHeight    0.196927
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.91293
		venusFreq       1.00264
		venusMagn       0
		mareFreq        1.1753
		mareDensity     0.00279825
		terraceProb     0.227022
		erosion         0
		montesMagn      0.121931
		montesFreq      97.3708
		montesSpiky     0.972321
		montesFraction  0.152319
		dunesMagn       0.0333795
		dunesFreq       2806.52
		dunesFraction   0.946466
		hillsMagn       0.109397
		hillsFreq       273.113
		hillsFraction   0.0714122
		hills2Fraction  0.185862
		riversMagn      58.0278
		riversFreq      2.60242
		riversSin       6.82782
		riversOctaves   0
		canyonsMagn     0.457059
		canyonsFreq     0.661389
		canyonFraction  0
		cracksMagn      0.0348193
		cracksFreq      0.526349
		cracksOctaves   2
		craterMagn      0.597961
		craterFreq      3.94
		craterDensity   0.873848
		craterOctaves   11
		craterRayedFactor 0.199085
		volcanoMagn     0.353009
		volcanoFreq     0.727483
		volcanoDensity  0.19187
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.0251966
		volcanoRadius   0.273373
		volcanoTemp     1116.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.589, 0.409, 0.270, 0.000)
		colorShelf     (0.559, 0.389, 0.257, 0.000)
		colorBeach     (0.294, 0.205, 0.135, 0.000)
		colorDesert    (0.501, 0.348, 0.230, 0.000)
		colorLowland   (0.477, 0.360, 0.257, 0.000)
		colorUpland    (0.548, 0.381, 0.252, 0.000)
		colorRock      (1.000, 1.000, 1.000, 0.500)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.477, 0.360, 0.257, 0.000)
		colorUpPlants  (0.548, 0.381, 0.252, 0.000)
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
		SemiMajorAxis   0.393288
		Period          0.547683
		Eccentricity    0.0907915
		Inclination     0.497403
		AscendingNode   73.3126
		ArgOfPericenter 231.681
		MeanAnomaly     6.55915
	}
}

DwarfMoon	"Foerost System 6.D1"
{
	ParentBody     "Foerost System 6"
	Class	       "Asteroid"

	Mass            2.43987e-007
	Radius          87.6667
	InertiaMoment   0.399218

	Oblateness      0.249

	Obliquity       0.00580148
	EqAscendNode    -157.705
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.611 0.459 0.383)

	Surface
	{
		SurfStyle       0.971728
		OceanStyle      0.343883
		Randomize      (-0.186, -0.275, -0.056)
		colorDistMagn   0.777196
		colorDistFreq   6.36936
		detailScale     2393.89
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.429588
		terraceProb     0.296466
		erosion         0
		montesMagn      0.696345
		montesFreq      3.42063
		montesSpiky     0.969613
		montesFraction  0.590497
		dunesFraction   0
		hillsMagn       0
		hillsFreq       17.8811
		hillsFraction   0.647066
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.202544
		craterFreq      0.177236
		craterDensity   0.898954
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.513677
		volcanoTemp     1482.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.208, 0.161, 0.153, 0.050)
		colorShelf     (0.244, 0.188, 0.176, 0.040)
		colorBeach     (0.281, 0.216, 0.199, 0.030)
		colorDesert    (0.317, 0.243, 0.226, 0.020)
		colorLowland   (0.354, 0.271, 0.249, 0.030)
		colorUpland    (0.391, 0.298, 0.272, 0.050)
		colorRock      (0.427, 0.326, 0.302, 0.020)
		colorSnow      (0.427, 0.326, 0.302, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.33113e-005
		Period          0.000911311
		Eccentricity    7.9958e-005
		Inclination     0.00580148
		AscendingNode   -157.705
		ArgOfPericenter -84.5426
		MeanAnomaly     80.2416
	}
}

DwarfMoon	"Foerost System 6.D2"
{
	ParentBody     "Foerost System 6"
	Class	       "Asteroid"

	Mass            3.38873e-007
	Radius          93.7518
	InertiaMoment   0.396006

	Obliquity       -40.8602
	EqAscendNode    -9.50499
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.438 0.433 0.430)

	Surface
	{
		SurfStyle       0.81577
		OceanStyle      0.042554
		Randomize      (-0.827, 0.946, 0.075)
		colorDistMagn   0.563601
		colorDistFreq   2.09879
		detailScale     2560.05
		colorConversion true
		snowLevel       2
		tropicLatitude  0.988704
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.732966
		terraceProb     0.150141
		erosion         0
		montesMagn      0.532273
		montesFreq      2.4359
		montesSpiky     0.869299
		montesFraction  0.77852
		dunesFraction   0
		hillsMagn       0
		hillsFreq       25.3767
		hillsFraction   0.669544
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241894
		craterFreq      0.337264
		craterDensity   1.04477
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.538213
		volcanoTemp     1455.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.171, 0.147, 0.120, 0.000)
		colorShelf     (0.175, 0.152, 0.138, 0.000)
		colorBeach     (0.206, 0.178, 0.163, 0.000)
		colorDesert    (0.223, 0.191, 0.159, 0.000)
		colorLowland   (0.245, 0.204, 0.181, 0.000)
		colorUpland    (0.272, 0.247, 0.219, 0.000)
		colorRock      (0.293, 0.268, 0.237, 0.000)
		colorSnow      (0.320, 0.286, 0.249, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000299101
		Period          0.0245191
		Eccentricity    0.170233
		Inclination     -40.8602
		AscendingNode   -9.50499
		ArgOfPericenter 134.417
		MeanAnomaly     66.3111
	}
}

DwarfMoon	"Foerost System 6.D3"
{
	ParentBody     "Foerost System 6"
	Class	       "Asteroid"

	Mass            4.74401e-007
	Radius          126.461
	InertiaMoment   0.398302

	RotationPeriod  1930.71
	Obliquity       39.7326
	EqAscendNode    -99.2459

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.499 0.401 0.333)

	Surface
	{
		SurfStyle       0.196538
		OceanStyle      0.384379
		Randomize      (-0.204, 0.085, 0.249)
		colorDistMagn   0.790139
		colorDistFreq   5.47646
		detailScale     3453.22
		colorConversion true
		snowLevel       2
		tropicLatitude  0.753835
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.501668
		terraceProb     0.34832
		erosion         0
		montesMagn      0.607056
		montesFreq      3.47722
		montesSpiky     0.835634
		montesFraction  0.762797
		dunesFraction   0
		hillsMagn       0
		hillsFreq       35.557
		hillsFraction   0.553136
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224539
		craterFreq      0.535233
		craterDensity   0.923987
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.6108
		volcanoTemp     1676.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.200, 0.161, 0.133, 0.000)
		colorShelf     (0.212, 0.171, 0.141, 0.000)
		colorBeach     (0.225, 0.181, 0.150, 0.000)
		colorDesert    (0.237, 0.191, 0.158, 0.000)
		colorLowland   (0.249, 0.201, 0.166, 0.000)
		colorUpland    (0.262, 0.211, 0.175, 0.000)
		colorRock      (0.274, 0.221, 0.183, 0.000)
		colorSnow      (0.287, 0.231, 0.191, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000512931
		Period          0.0550635
		Eccentricity    0.44298
		Inclination     39.7326
		AscendingNode   -99.2459
		ArgOfPericenter -69.8806
		MeanAnomaly     -99.5422
	}
}

Planet	"Foerost System 7"
{
	ParentBody     "Foerost System"
	Class	       "IceGiant"

	Mass            76.9674
	Radius          31014.1
	InertiaMoment   0.233099

	Oblateness      0.0399015

	RotationPeriod  7.13668
	Obliquity       5.66702
	EqAscendNode    -108.648

	AlbedoBond      0.424785
	AlbedoGeom      0.509742
	Brightness      2

	Surface
	{
		SurfStyle       0.787176
		Randomize      (0.646, -0.944, -0.091)
		detailScale     79770.1
		colorConversion true
		tropicLatitude  0.0913876
		icecapLatitude  0.991388
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     5.81385
		stripeFluct     0.489021
		stripeTwist     11.0597
		cycloneMagn     11.1814
		cycloneFreq     0.47056
		cycloneDensity  0.456115
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
		BumpHeight      11.0852
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          35.8516
		Velocity        -549.618
		BumpHeight      24.766
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.98833
		mainOctaves     12
		Coverage        0.123926
		stripeZones     5.81385
		stripeFluct     0.489021
		stripeTwist     11.0597
	}

	Clouds
	{
		Height          60.6172
		Velocity        1832.32
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		ModulateColor  (1.000 1.000 1.000 0.577)
		mainFreq        0.98833
		mainOctaves     12
		Coverage        0.123926
		stripeZones     5.81385
		stripeFluct     0.489021
		stripeTwist     11.0597
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          258.745
		Density         6612.5
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.548189
		Saturation      0.962376

		Composition
		{
			H2    	92.6924
			He    	7.23185
			N2    	0.0338816
			CH4   	0.0323335
			O2    	0.00760359
			Ne    	0.00120585
			Ar    	0.000765469
		}
	}

	Aurora
	{
		Height      414.49
		NorthLat    64.3934
		NorthLon    16.7386
		NorthRadius 11451.7
		NorthWidth  2128.32
		NorthRings  2
		NorthBright 1
		NorthParticles 10000
		SouthLat    -59.6723
		SouthLon    179.413
		SouthRadius 9511.13
		SouthWidth  2823.81
		SouthRings  5
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
		SemiMajorAxis   0.665475
		Period          1.2048
		Eccentricity    0.00244198
		Inclination     1.78193
		AscendingNode   -112.682
		ArgOfPericenter 181.49
		MeanAnomaly     232.613
	}
}

Moon	"Foerost System 7.1"
{
	ParentBody     "Foerost System 7"
	Class	       "IceWorld"

	Mass            0.000173362
	Radius          491.608
	InertiaMoment   0.399383

	Oblateness      0.0117072

	Obliquity       1.24252
	EqAscendNode    -36.4745
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.434 0.430 0.424)

	Surface
	{
		SurfStyle       0.751164
		OceanStyle      0.758782
		Randomize      (0.218, -0.770, 0.805)
		colorDistMagn   0.0693077
		colorDistFreq   67.9644
		detailScale     1264.44
		colorConversion true
		drivenDarkening 0.7
		seaLevel        0.312217
		snowLevel       2
		tropicLatitude  0.0411809
		icecapLatitude  0.59745
		icecapHeight    0.324053
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.0567
		venusFreq       0.217894
		venusMagn       0
		mareFreq        0
		mareDensity     0.000132831
		terraceProb     0.281865
		erosion         0
		montesMagn      0.0738093
		montesFreq      28.1713
		montesSpiky     0.916846
		montesFraction  0.871013
		dunesMagn       0.0255878
		dunesFreq       640.717
		dunesFraction   0.744634
		hillsMagn       0.128822
		hillsFreq       56.9415
		hillsFraction   0.93456
		hills2Fraction  0.240419
		riversMagn      47.723
		riversFreq      3.38101
		riversSin       7.11244
		riversOctaves   0
		canyonsMagn     0.324648
		canyonsFreq     0.156364
		canyonFraction  0
		cracksMagn      0.0329371
		cracksFreq      0.226161
		cracksOctaves   0
		craterMagn      0.589177
		craterFreq      1.02487
		craterDensity   0.96395
		craterOctaves   9
		craterRayedFactor 0.0694869
		volcanoMagn     0.164395
		volcanoFreq     0.643859
		volcanoDensity  0.168155
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.170023
		volcanoRadius   0.163675
		volcanoTemp     1424.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.278, 0.275, 0.284, 0.250)
		colorShelf     (0.304, 0.314, 0.322, 0.250)
		colorBeach     (0.247, 0.232, 0.246, 0.200)
		colorDesert    (0.230, 0.211, 0.216, 0.200)
		colorLowland   (0.169, 0.163, 0.178, 0.200)
		colorUpland    (0.321, 0.318, 0.322, 0.250)
		colorRock      (0.640, 0.630, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.169, 0.163, 0.178, 0.200)
		colorUpPlants  (0.321, 0.318, 0.322, 0.250)
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
		SemiMajorAxis   0.00118659
		Period          0.0026945
		Eccentricity    0.0168238
		Inclination     1.24252
		AscendingNode   -36.4745
		ArgOfPericenter 177.963
		MeanAnomaly     -36.3965
	}
}

Moon	"Foerost System 7.2"
{
	ParentBody     "Foerost System 7"
	Class	       "IceWorld"

	Mass            0.000250943
	Radius          523.237
	InertiaMoment   0.39888

	Oblateness      0.00228176

	Obliquity       0.590256
	EqAscendNode    7.87645
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.631 0.545 0.511)

	Surface
	{
		SurfStyle       0.444922
		OceanStyle      0.516444
		Randomize      (0.252, 0.516, -0.528)
		colorDistMagn   0.0914485
		colorDistFreq   73.6837
		detailScale     1345.79
		colorConversion true
		drivenDarkening 0.7
		seaLevel        0.256011
		snowLevel       2
		tropicLatitude  0.0205532
		icecapLatitude  0.42549
		icecapHeight    0.277312
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.85373
		venusFreq       0.393905
		venusMagn       0
		mareFreq        0
		mareDensity     0.000181576
		terraceProb     0.311436
		erosion         0
		montesMagn      0.0458928
		montesFreq      31.8582
		montesSpiky     0.783675
		montesFraction  0.912433
		dunesMagn       0.0318327
		dunesFreq       697.052
		dunesFraction   0.0829177
		hillsMagn       0.133529
		hillsFreq       56.3169
		hillsFraction   0.852145
		hills2Fraction  0.172698
		riversMagn      60.3705
		riversFreq      3.4756
		riversSin       7.27223
		riversOctaves   0
		canyonsMagn     0.437248
		canyonsFreq     0.176972
		canyonFraction  0
		cracksMagn      0.0556019
		cracksFreq      0.185098
		cracksOctaves   0
		craterMagn      0.641499
		craterFreq      1.47852
		craterDensity   0.933678
		craterOctaves   9
		craterRayedFactor 0.130919
		volcanoMagn     0.184924
		volcanoFreq     0.606555
		volcanoDensity  0.171323
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.370633
		volcanoRadius   0.110379
		volcanoTemp     1259.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.631, 0.545, 0.511, 0.500)
		colorShelf     (0.599, 0.518, 0.485, 0.500)
		colorBeach     (0.442, 0.382, 0.357, 0.750)
		colorDesert    (0.536, 0.463, 0.434, 1.000)
		colorLowland   (0.555, 0.480, 0.449, 1.000)
		colorUpland    (0.587, 0.507, 0.475, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.555, 0.480, 0.449, 1.000)
		colorUpPlants  (0.587, 0.507, 0.475, 1.000)
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
		SemiMajorAxis   0.0019244
		Period          0.00556504
		Eccentricity    0.00897873
		Inclination     0.590256
		AscendingNode   7.87645
		ArgOfPericenter -172.251
		MeanAnomaly     148.069
	}
}

DwarfMoon	"Foerost System 7.D1"
{
	ParentBody     "Foerost System 7"
	Class	       "Asteroid"

	Mass            1.81363e-010
	Radius          7.85483
	InertiaMoment   0.399707

	Obliquity       64.5323
	EqAscendNode    -74.4825
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.655 0.652 0.648)

	Surface
	{
		SurfStyle       0.295674
		OceanStyle      0.885707
		Randomize      (0.612, 0.758, 0.520)
		colorDistMagn   0.90417
		colorDistFreq   0.0114451
		detailScale     214.489
		colorConversion true
		snowLevel       2
		tropicLatitude  0.99945
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.393785
		terraceProb     0.33135
		erosion         0
		montesMagn      0.527931
		montesFreq      2.38625
		montesSpiky     0.84562
		montesFraction  0.497497
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.166522
		hillsFraction   0.504766
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226304
		craterFreq      0.25583
		craterDensity   0.926752
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.520251
		volcanoTemp     1481.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.262, 0.261, 0.259, 0.000)
		colorShelf     (0.278, 0.277, 0.275, 0.000)
		colorBeach     (0.295, 0.293, 0.292, 0.000)
		colorDesert    (0.311, 0.310, 0.308, 0.000)
		colorLowland   (0.328, 0.326, 0.324, 0.000)
		colorUpland    (0.344, 0.342, 0.340, 0.000)
		colorRock      (0.360, 0.358, 0.356, 0.000)
		colorSnow      (0.377, 0.375, 0.373, 1.000)
		BumpHeight      7.06935
		BumpOffset      1.41387
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00960176
		Period          0.0620229
		Eccentricity    0.274088
		Inclination     64.5323
		AscendingNode   -74.4825
		ArgOfPericenter -74.7199
		MeanAnomaly     -88.6671
	}
}

DwarfMoon	"Foerost System 7.D2"
{
	ParentBody     "Foerost System 7"
	Class	       "Asteroid"

	Mass            2.81917e-010
	Radius          8.68312
	InertiaMoment   0.397618

	RotationPeriod  1427.06
	Obliquity       -37.6172
	EqAscendNode    -172.556

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.733 0.731 0.730)

	Surface
	{
		SurfStyle       0.889527
		OceanStyle      0.154927
		Randomize      (-0.186, 0.904, 0.655)
		colorDistMagn   0.988959
		colorDistFreq   0.0230665
		detailScale     237.107
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0791801
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.417433
		terraceProb     0.538404
		erosion         0
		montesMagn      0.546313
		montesFreq      2.7056
		montesSpiky     0.939808
		montesFraction  0.566002
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.18578
		hillsFraction   0.652741
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242277
		craterFreq      0.233294
		craterDensity   0.872521
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.467187
		volcanoTemp     1187.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.249, 0.256, 0.292, 0.050)
		colorShelf     (0.293, 0.300, 0.336, 0.040)
		colorBeach     (0.337, 0.344, 0.380, 0.030)
		colorDesert    (0.381, 0.388, 0.431, 0.020)
		colorLowland   (0.425, 0.431, 0.475, 0.030)
		colorUpland    (0.469, 0.475, 0.518, 0.050)
		colorRock      (0.513, 0.519, 0.577, 0.020)
		colorSnow      (0.513, 0.519, 0.577, 1.000)
		BumpHeight      7.81481
		BumpOffset      1.56296
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00991873
		Period          0.0651194
		Eccentricity    0.303845
		Inclination     -37.6172
		AscendingNode   -172.556
		ArgOfPericenter 58.0913
		MeanAnomaly     -160.649
	}
}

DwarfMoon	"Foerost System 7.D3"
{
	ParentBody     "Foerost System 7"
	Class	       "Asteroid"

	Mass            4.26924e-010
	Radius          11.6987
	InertiaMoment   0.398904

	RotationPeriod  2374.6
	Obliquity       65.5047
	EqAscendNode    73.8689

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.506 0.502 0.497)

	Surface
	{
		SurfStyle       0.870799
		OceanStyle      0.131795
		Randomize      (-0.572, 0.789, -0.108)
		colorDistMagn   0.434568
		colorDistFreq   0.0857107
		detailScale     319.452
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998307
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.577848
		terraceProb     0.424503
		erosion         0
		montesMagn      0.383113
		montesFreq      3.67671
		montesSpiky     0.795504
		montesFraction  0.328038
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.357141
		hillsFraction   0.611369
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.271807
		craterFreq      0.220381
		craterDensity   1.05101
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.520479
		volcanoTemp     1560.92
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.172, 0.176, 0.199, 0.050)
		colorShelf     (0.203, 0.206, 0.229, 0.040)
		colorBeach     (0.233, 0.236, 0.259, 0.030)
		colorDesert    (0.263, 0.266, 0.293, 0.020)
		colorLowland   (0.294, 0.296, 0.323, 0.030)
		colorUpland    (0.324, 0.326, 0.353, 0.050)
		colorRock      (0.354, 0.357, 0.393, 0.020)
		colorSnow      (0.354, 0.357, 0.393, 1.000)
		BumpHeight      10.5288
		BumpOffset      2.10577
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0101814
		Period          0.0677233
		Eccentricity    0.238403
		Inclination     65.5047
		AscendingNode   73.8689
		ArgOfPericenter -22.4502
		MeanAnomaly     172.402
	}
}

DwarfMoon	"Foerost System 7.D4"
{
	ParentBody     "Foerost System 7"
	Class	       "Asteroid"

	Mass            6.32918e-010
	Radius          12.49
	InertiaMoment   0.399833

	Obliquity       -39.5332
	EqAscendNode    -69.5734
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.434 0.430 0.427)

	Surface
	{
		SurfStyle       0.647657
		OceanStyle      0.200917
		Randomize      (-0.569, -0.990, -0.940)
		colorDistMagn   0.438255
		colorDistFreq   0.114308
		detailScale     341.06
		colorConversion true
		snowLevel       2
		tropicLatitude  0.891292
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.752796
		terraceProb     0.186117
		erosion         0
		montesMagn      0.660037
		montesFreq      2.34248
		montesSpiky     0.954984
		montesFraction  0.335264
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.348035
		hillsFraction   0.62786
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260493
		craterFreq      0.222533
		craterDensity   0.986463
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.573414
		volcanoTemp     1501.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.169, 0.146, 0.120, 0.000)
		colorShelf     (0.174, 0.150, 0.137, 0.000)
		colorBeach     (0.204, 0.176, 0.162, 0.000)
		colorDesert    (0.221, 0.189, 0.158, 0.000)
		colorLowland   (0.243, 0.202, 0.179, 0.000)
		colorUpland    (0.269, 0.245, 0.218, 0.000)
		colorRock      (0.291, 0.267, 0.235, 0.000)
		colorSnow      (0.317, 0.284, 0.248, 1.000)
		BumpHeight      11.241
		BumpOffset      2.2482
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0105289
		Period          0.0712203
		Eccentricity    0.315386
		Inclination     -39.5332
		AscendingNode   -69.5734
		ArgOfPericenter 16.9629
		MeanAnomaly     65.2326
	}
}

DwarfMoon	"Foerost System 7.D5"
{
	ParentBody     "Foerost System 7"
	Class	       "Asteroid"

	Mass            9.22021e-010
	Radius          13.5826
	InertiaMoment   0.397855

	RotationPeriod  1092.88
	Obliquity       24.0748
	EqAscendNode    40.7075

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.672 0.668 0.663)

	Surface
	{
		SurfStyle       0.810263
		OceanStyle      0.889069
		Randomize      (-0.891, 0.885, -0.014)
		colorDistMagn   0.877
		colorDistFreq   0.115677
		detailScale     370.896
		colorConversion true
		snowLevel       2
		tropicLatitude  0.706762
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.498538
		terraceProb     0.328763
		erosion         0
		montesMagn      0.369373
		montesFreq      3.50595
		montesSpiky     0.969626
		montesFraction  0.262717
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.560734
		hillsFraction   0.71052
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259305
		craterFreq      0.193776
		craterDensity   0.911343
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.443776
		volcanoTemp     1650.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.262, 0.227, 0.186, 0.000)
		colorShelf     (0.269, 0.234, 0.212, 0.000)
		colorBeach     (0.316, 0.274, 0.252, 0.000)
		colorDesert    (0.343, 0.294, 0.245, 0.000)
		colorLowland   (0.376, 0.314, 0.278, 0.000)
		colorUpland    (0.417, 0.381, 0.338, 0.000)
		colorRock      (0.450, 0.414, 0.365, 0.000)
		colorSnow      (0.490, 0.441, 0.384, 1.000)
		BumpHeight      12.2244
		BumpOffset      2.44487
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0108794
		Period          0.074805
		Eccentricity    0.409852
		Inclination     24.0748
		AscendingNode   40.7075
		ArgOfPericenter -73.8971
		MeanAnomaly     -92.7273
	}
}

DwarfMoon	"Foerost System 7.D6"
{
	ParentBody     "Foerost System 7"
	Class	       "Asteroid"

	Mass            1.3238e-009
	Radius          14.6618
	InertiaMoment   0.399046

	Obliquity       89.9021
	EqAscendNode    -108.874
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.500 0.387 0.324)

	Surface
	{
		SurfStyle       0.692181
		OceanStyle      0.441412
		Randomize      (0.959, 0.024, 0.902)
		colorDistMagn   0.807299
		colorDistFreq   0.0692404
		detailScale     400.366
		colorConversion true
		snowLevel       2
		tropicLatitude  0.94623
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.64758
		terraceProb     0.415766
		erosion         0
		montesMagn      0.420135
		montesFreq      2.64391
		montesSpiky     0.954589
		montesFraction  0.765123
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.684158
		hillsFraction   0.761815
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.26013
		craterFreq      0.158774
		craterDensity   0.907994
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.454999
		volcanoTemp     1382.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.195, 0.131, 0.091, 0.000)
		colorShelf     (0.200, 0.135, 0.104, 0.000)
		colorBeach     (0.235, 0.159, 0.123, 0.000)
		colorDesert    (0.255, 0.170, 0.120, 0.000)
		colorLowland   (0.280, 0.182, 0.136, 0.000)
		colorUpland    (0.310, 0.220, 0.165, 0.000)
		colorRock      (0.335, 0.240, 0.178, 0.000)
		colorSnow      (0.365, 0.255, 0.188, 1.000)
		BumpHeight      13.1957
		BumpOffset      2.63913
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0113566
		Period          0.0797809
		Eccentricity    0.0416731
		Inclination     89.9021
		AscendingNode   -108.874
		ArgOfPericenter -137.465
		MeanAnomaly     54.097
	}
}

DwarfMoon	"Foerost System 7.D7"
{
	ParentBody     "Foerost System 7"
	Class	       "Asteroid"

	Mass            1.87776e-009
	Radius          19.5131
	InertiaMoment   0.399958

	RotationPeriod  1436.89
	Obliquity       17.3346
	EqAscendNode    -30.9512

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.669 0.665 0.659)

	Surface
	{
		SurfStyle       0.0377486
		OceanStyle      0.747167
		Randomize      (-0.633, 0.327, 0.520)
		colorDistMagn   0.955537
		colorDistFreq   0.12541
		detailScale     532.837
		colorConversion true
		snowLevel       2
		tropicLatitude  0.550111
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.517626
		terraceProb     0.381966
		erosion         0
		montesMagn      0.455946
		montesFreq      2.61678
		montesSpiky     0.784851
		montesFraction  0.299522
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.91497
		hillsFraction   0.571921
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235761
		craterFreq      0.152121
		craterDensity   0.795476
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.499196
		volcanoTemp     1657.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.268, 0.266, 0.264, 0.000)
		colorShelf     (0.284, 0.283, 0.280, 0.000)
		colorBeach     (0.301, 0.299, 0.297, 0.000)
		colorDesert    (0.318, 0.316, 0.313, 0.000)
		colorLowland   (0.334, 0.333, 0.330, 0.000)
		colorUpland    (0.351, 0.349, 0.346, 0.000)
		colorRock      (0.368, 0.366, 0.363, 0.000)
		colorSnow      (0.385, 0.382, 0.379, 1.000)
		BumpHeight      17.5618
		BumpOffset      3.51235
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0115625
		Period          0.0819601
		Eccentricity    0.386674
		Inclination     17.3346
		AscendingNode   -30.9512
		ArgOfPericenter 45.934
		MeanAnomaly     -15.5705
	}
}

DwarfMoon	"Foerost System 7.D8"
{
	ParentBody     "Foerost System 7"
	Class	       "Asteroid"

	Mass            2.6367e-009
	Radius          20.2341
	InertiaMoment   0.398065

	RotationPeriod  3700.03
	Obliquity       -10.2878
	EqAscendNode    142.937

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.529 0.526 0.523)

	Surface
	{
		SurfStyle       0.404929
		OceanStyle      0.896859
		Randomize      (-0.196, 0.286, -0.867)
		colorDistMagn   0.657991
		colorDistFreq   0.169975
		detailScale     552.526
		colorConversion true
		snowLevel       2
		tropicLatitude  0.11334
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.596074
		terraceProb     0.353689
		erosion         0
		montesMagn      0.360799
		montesFreq      4.02178
		montesSpiky     0.965752
		montesFraction  0.753153
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.0591
		hillsFraction   0.74878
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233156
		craterFreq      0.250493
		craterDensity   0.872336
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.56625
		volcanoTemp     1709.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.211, 0.210, 0.209, 0.000)
		colorShelf     (0.225, 0.223, 0.222, 0.000)
		colorBeach     (0.238, 0.237, 0.235, 0.000)
		colorDesert    (0.251, 0.250, 0.248, 0.000)
		colorLowland   (0.264, 0.263, 0.262, 0.000)
		colorUpland    (0.277, 0.276, 0.275, 0.000)
		colorRock      (0.291, 0.289, 0.288, 0.000)
		colorSnow      (0.304, 0.302, 0.301, 1.000)
		BumpHeight      18.2107
		BumpOffset      3.64214
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0117926
		Period          0.0844195
		Eccentricity    0.137146
		Inclination     -10.2878
		AscendingNode   142.937
		ArgOfPericenter -15.231
		MeanAnomaly     -38.2903
	}
}

DwarfMoon	"Foerost System 7.S1"
{
	ParentBody     "Foerost System 7"
	Class	       "Asteroid"

	Mass            2.01436e-013
	Radius          0.822657
	InertiaMoment   0.399184

	Oblateness      0.249

	Obliquity       1.42947
	EqAscendNode    -100.77
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.798 0.701 0.660)

	Surface
	{
		SurfStyle       0.550325
		OceanStyle      0.431766
		Randomize      (-0.709, 0.120, -0.333)
		colorDistMagn   0.399198
		colorDistFreq   0.000428785
		detailScale     22.464
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0318093
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.279071
		terraceProb     0.114753
		erosion         0
		montesMagn      0.587658
		montesFreq      2.71955
		montesSpiky     0.752747
		montesFraction  0.323446
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00188847
		hillsFraction   0.852274
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.269255
		craterFreq      0.253316
		craterDensity   0.761859
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.399085
		volcanoTemp     1337.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.311, 0.238, 0.185, 0.000)
		colorShelf     (0.319, 0.245, 0.211, 0.000)
		colorBeach     (0.375, 0.287, 0.251, 0.000)
		colorDesert    (0.407, 0.308, 0.244, 0.000)
		colorLowland   (0.447, 0.329, 0.277, 0.000)
		colorUpland    (0.495, 0.400, 0.336, 0.000)
		colorRock      (0.535, 0.435, 0.363, 0.000)
		colorSnow      (0.583, 0.463, 0.383, 1.000)
		BumpHeight      0.740391
		BumpOffset      0.148078
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000316544
		Period          0.000371259
		Eccentricity    0
		Inclination     1.42947
		AscendingNode   -100.77
		ArgOfPericenter -90.2883
		MeanAnomaly     -64.4213
	}
}

DwarfMoon	"Foerost System 7.S2"
{
	ParentBody     "Foerost System 7"
	Class	       "Asteroid"

	Mass            2.87681e-013
	Radius          0.888038
	InertiaMoment   0.39574

	Oblateness      0.249

	Obliquity       -0.0363951
	EqAscendNode    -26.7937
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.572 0.567 0.564)

	Surface
	{
		SurfStyle       0.985265
		OceanStyle      0.85914
		Randomize      (0.393, -0.385, 0.829)
		colorDistMagn   0.206356
		colorDistFreq   0.000131092
		detailScale     24.2494
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00124488
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.59066
		terraceProb     0.159014
		erosion         0
		montesMagn      0.424469
		montesFreq      2.72275
		montesSpiky     0.97033
		montesFraction  0.254232
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00167741
		hillsFraction   0.687619
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219065
		craterFreq      0.257094
		craterDensity   0.731779
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.511941
		volcanoTemp     1409.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.194, 0.199, 0.226, 0.050)
		colorShelf     (0.229, 0.233, 0.260, 0.040)
		colorBeach     (0.263, 0.267, 0.293, 0.030)
		colorDesert    (0.297, 0.301, 0.333, 0.020)
		colorLowland   (0.332, 0.335, 0.367, 0.030)
		colorUpland    (0.366, 0.369, 0.401, 0.050)
		colorRock      (0.400, 0.403, 0.446, 0.020)
		colorSnow      (0.400, 0.403, 0.446, 1.000)
		BumpHeight      0.799235
		BumpOffset      0.159847
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000328624
		Period          0.000392713
		Eccentricity    0
		Inclination     -0.0363951
		AscendingNode   -26.7937
		ArgOfPericenter 160.739
		MeanAnomaly     -173.942
	}
}

DwarfMoon	"Foerost System 7.S3"
{
	ParentBody     "Foerost System 7"
	Class	       "Asteroid"

	Mass            4.08921e-013
	Radius          1.20567
	InertiaMoment   0.398256

	Oblateness      0.249

	Obliquity       1.23941
	EqAscendNode    -74.3806
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.732 0.729 0.728)

	Surface
	{
		SurfStyle       0.0679799
		OceanStyle      0.411571
		Randomize      (0.046, -0.330, -0.786)
		colorDistMagn   0.879755
		colorDistFreq   0.000833891
		detailScale     32.9229
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0344577
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.449897
		terraceProb     0.339007
		erosion         0
		montesMagn      0.442597
		montesFreq      2.6019
		montesSpiky     0.98133
		montesFraction  0.0742264
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00411696
		hillsFraction   0.579271
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262431
		craterFreq      0.149892
		craterDensity   0.835443
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.607191
		volcanoTemp     1601.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.293, 0.292, 0.291, 0.000)
		colorShelf     (0.311, 0.310, 0.310, 0.000)
		colorBeach     (0.330, 0.328, 0.328, 0.000)
		colorDesert    (0.348, 0.346, 0.346, 0.000)
		colorLowland   (0.366, 0.365, 0.364, 0.000)
		colorUpland    (0.385, 0.383, 0.382, 0.000)
		colorRock      (0.403, 0.401, 0.401, 0.000)
		colorSnow      (0.421, 0.419, 0.419, 1.000)
		BumpHeight      1.0851
		BumpOffset      0.217021
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000335052
		Period          0.000404291
		Eccentricity    0
		Inclination     1.23941
		AscendingNode   -74.3806
		ArgOfPericenter -174.68
		MeanAnomaly     106.179
	}
}

DwarfMoon	"Foerost System 7.S4"
{
	ParentBody     "Foerost System 7"
	Class	       "Asteroid"

	Mass            5.79334e-013
	Radius          1.22986
	InertiaMoment   0.399318

	Oblateness      0.249

	Obliquity       -1.29758
	EqAscendNode    -60.9683
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.570 0.407 0.345)

	Surface
	{
		SurfStyle       0.605477
		OceanStyle      0.375407
		Randomize      (-0.358, -0.264, -0.690)
		colorDistMagn   0.441918
		colorDistFreq   0.00107192
		detailScale     33.5833
		colorConversion true
		snowLevel       2
		tropicLatitude  0.039023
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.595732
		terraceProb     0.439796
		erosion         0
		montesMagn      0.398177
		montesFreq      3.32905
		montesSpiky     0.987681
		montesFraction  0.266814
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00361043
		hillsFraction   0.709288
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243217
		craterFreq      0.270178
		craterDensity   0.762551
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.478193
		volcanoTemp     1470.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.222, 0.138, 0.097, 0.000)
		colorShelf     (0.228, 0.142, 0.111, 0.000)
		colorBeach     (0.268, 0.167, 0.131, 0.000)
		colorDesert    (0.291, 0.179, 0.128, 0.000)
		colorLowland   (0.319, 0.191, 0.145, 0.000)
		colorUpland    (0.354, 0.232, 0.176, 0.000)
		colorRock      (0.382, 0.252, 0.190, 0.000)
		colorSnow      (0.416, 0.269, 0.200, 1.000)
		BumpHeight      1.10687
		BumpOffset      0.221374
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000353251
		Period          0.000437675
		Eccentricity    0
		Inclination     -1.29758
		AscendingNode   -60.9683
		ArgOfPericenter 105.485
		MeanAnomaly     132.305
	}
}

DwarfMoon	"Foerost System 7.S5"
{
	ParentBody     "Foerost System 7"
	Class	       "Asteroid"

	Mass            8.19134e-013
	Radius          1.32049
	InertiaMoment   0.396533

	Oblateness      0.249

	Obliquity       -0.7258
	EqAscendNode    48.2712
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.705 0.702 0.698)

	Surface
	{
		SurfStyle       0.625179
		OceanStyle      0.0876415
		Randomize      (-0.474, -0.040, -0.933)
		colorDistMagn   0.9297
		colorDistFreq   0.00150909
		detailScale     36.0582
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0231185
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.597289
		terraceProb     0.302979
		erosion         0
		montesMagn      0.617857
		montesFreq      3.45191
		montesSpiky     0.842793
		montesFraction  0.46011
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00246735
		hillsFraction   0.763326
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228964
		craterFreq      0.198221
		craterDensity   0.893817
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.561233
		volcanoTemp     1413.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.275, 0.239, 0.195, 0.000)
		colorShelf     (0.282, 0.246, 0.223, 0.000)
		colorBeach     (0.331, 0.288, 0.265, 0.000)
		colorDesert    (0.359, 0.309, 0.258, 0.000)
		colorLowland   (0.395, 0.330, 0.293, 0.000)
		colorUpland    (0.437, 0.400, 0.356, 0.000)
		colorRock      (0.472, 0.435, 0.384, 0.000)
		colorSnow      (0.515, 0.463, 0.405, 1.000)
		BumpHeight      1.18844
		BumpOffset      0.237688
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000375394
		Period          0.000479465
		Eccentricity    0
		Inclination     -0.7258
		AscendingNode   48.2712
		ArgOfPericenter 171.967
		MeanAnomaly     -80.4136
	}
}

DwarfMoon	"Foerost System 7.S6"
{
	ParentBody     "Foerost System 7"
	Class	       "Asteroid"

	Mass            1.15736e-012
	Radius          1.422
	InertiaMoment   0.398432

	Oblateness      0.249

	Obliquity       -0.422541
	EqAscendNode    -108.332
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.650 0.648 0.645)

	Surface
	{
		SurfStyle       0.78376
		OceanStyle      0.677971
		Randomize      (-0.947, -0.787, 0.433)
		colorDistMagn   0.872822
		colorDistFreq   0.00141243
		detailScale     38.83
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00863159
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.619575
		terraceProb     0.362973
		erosion         0
		montesMagn      0.500071
		montesFreq      2.99948
		montesSpiky     0.892697
		montesFraction  0.155283
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00347279
		hillsFraction   0.51954
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242132
		craterFreq      0.20357
		craterDensity   0.740647
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.534995
		volcanoTemp     1442.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.253, 0.220, 0.181, 0.000)
		colorShelf     (0.260, 0.227, 0.206, 0.000)
		colorBeach     (0.305, 0.266, 0.245, 0.000)
		colorDesert    (0.331, 0.285, 0.239, 0.000)
		colorLowland   (0.364, 0.304, 0.271, 0.000)
		colorUpland    (0.403, 0.369, 0.329, 0.000)
		colorRock      (0.435, 0.401, 0.355, 0.000)
		colorSnow      (0.474, 0.427, 0.374, 1.000)
		BumpHeight      1.2798
		BumpOffset      0.255959
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000386724
		Period          0.000501335
		Eccentricity    0
		Inclination     -0.422541
		AscendingNode   -108.332
		ArgOfPericenter -79.7178
		MeanAnomaly     110.153
	}
}

DwarfMoon	"Foerost System 7.S7"
{
	ParentBody     "Foerost System 7"
	Class	       "Asteroid"

	Mass            1.6361e-012
	Radius          2.03367
	InertiaMoment   0.399449

	Oblateness      0.249

	Obliquity       -1.41628
	EqAscendNode    99.691
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.530 0.522 0.519)

	Surface
	{
		SurfStyle       0.38242
		OceanStyle      0.115983
		Randomize      (-0.958, 0.474, 0.118)
		colorDistMagn   0.733981
		colorDistFreq   0.00179917
		detailScale     55.5328
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0318729
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.5955
		terraceProb     0.604708
		erosion         0
		montesMagn      0.456244
		montesFreq      2.52929
		montesSpiky     0.888932
		montesFraction  0.324495
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0106616
		hillsFraction   0.578281
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243869
		craterFreq      0.17893
		craterDensity   0.859926
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.477679
		volcanoTemp     1203.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.212, 0.209, 0.208, 0.000)
		colorShelf     (0.225, 0.222, 0.221, 0.000)
		colorBeach     (0.239, 0.235, 0.234, 0.000)
		colorDesert    (0.252, 0.248, 0.247, 0.000)
		colorLowland   (0.265, 0.261, 0.260, 0.000)
		colorUpland    (0.278, 0.274, 0.273, 0.000)
		colorRock      (0.292, 0.287, 0.286, 0.000)
		colorSnow      (0.305, 0.300, 0.299, 1.000)
		BumpHeight      1.8303
		BumpOffset      0.366061
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000391418
		Period          0.00051049
		Eccentricity    0
		Inclination     -1.41628
		AscendingNode   99.691
		ArgOfPericenter 20.4006
		MeanAnomaly     145.997
	}
}

DwarfMoon	"Foerost System 7.S8"
{
	ParentBody     "Foerost System 7"
	Class	       "Asteroid"

	Mass            2.31702e-012
	Radius          1.96756
	InertiaMoment   0.396994

	Oblateness      0.249

	Obliquity       0.957047
	EqAscendNode    54.6694
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.534 0.529 0.524)

	Surface
	{
		SurfStyle       0.154622
		OceanStyle      0.0852913
		Randomize      (0.412, 0.306, -0.597)
		colorDistMagn   0.71691
		colorDistFreq   0.00329715
		detailScale     53.7276
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0296716
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.298051
		terraceProb     0.36547
		erosion         0
		montesMagn      0.405923
		montesFreq      2.98464
		montesSpiky     0.851836
		montesFraction  0.666135
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00673669
		hillsFraction   0.74774
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.200954
		craterFreq      0.192959
		craterDensity   0.903045
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.523164
		volcanoTemp     1750.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.214, 0.212, 0.210, 0.000)
		colorShelf     (0.227, 0.225, 0.223, 0.000)
		colorBeach     (0.240, 0.238, 0.236, 0.000)
		colorDesert    (0.254, 0.251, 0.249, 0.000)
		colorLowland   (0.267, 0.264, 0.262, 0.000)
		colorUpland    (0.280, 0.278, 0.275, 0.000)
		colorRock      (0.294, 0.291, 0.288, 0.000)
		colorSnow      (0.307, 0.304, 0.301, 1.000)
		BumpHeight      1.77081
		BumpOffset      0.354162
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000394731
		Period          0.000516985
		Eccentricity    0
		Inclination     0.957047
		AscendingNode   54.6694
		ArgOfPericenter 6.65619
		MeanAnomaly     33.8126
	}
}

DwarfMoon	"Foerost System 7.S9"
{
	ParentBody     "Foerost System 7"
	Class	       "Asteroid"

	Mass            3.29152e-012
	Radius          2.11131
	InertiaMoment   0.398596

	Oblateness      0.249

	Obliquity       1.04249
	EqAscendNode    147.445
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.491 0.486 0.478)

	Surface
	{
		SurfStyle       0.983564
		OceanStyle      0.536364
		Randomize      (0.199, -0.753, -0.657)
		colorDistMagn   0.942325
		colorDistFreq   0.00275182
		detailScale     57.6528
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0102013
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.55032
		terraceProb     0.350693
		erosion         0
		montesMagn      0.425881
		montesFreq      3.53699
		montesSpiky     0.862841
		montesFraction  0.538686
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0136995
		hillsFraction   0.526645
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229075
		craterFreq      0.230196
		craterDensity   0.821065
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.547514
		volcanoTemp     1011.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.167, 0.170, 0.191, 0.050)
		colorShelf     (0.197, 0.199, 0.220, 0.040)
		colorBeach     (0.226, 0.228, 0.249, 0.030)
		colorDesert    (0.256, 0.257, 0.282, 0.020)
		colorLowland   (0.285, 0.286, 0.311, 0.030)
		colorUpland    (0.315, 0.316, 0.340, 0.050)
		colorRock      (0.344, 0.345, 0.378, 0.020)
		colorSnow      (0.344, 0.345, 0.378, 1.000)
		BumpHeight      1.90018
		BumpOffset      0.380036
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000405713
		Period          0.00053871
		Eccentricity    0
		Inclination     1.04249
		AscendingNode   147.445
		ArgOfPericenter -137.876
		MeanAnomaly     11.5132
	}
}

DwarfMoon	"Foerost System 7.S10"
{
	ParentBody     "Foerost System 7"
	Class	       "Asteroid"

	Mass            4.69693e-012
	Radius          2.28268
	InertiaMoment   0.399578

	Oblateness      0.249

	Obliquity       1.32454
	EqAscendNode    117.22
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.475 0.472 0.465)

	Surface
	{
		SurfStyle       0.844828
		OceanStyle      0.767222
		Randomize      (0.758, -0.582, -0.389)
		colorDistMagn   0.278423
		colorDistFreq   0.00130773
		detailScale     62.3323
		colorConversion true
		snowLevel       2
		tropicLatitude  0.024078
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.4821
		terraceProb     0.111861
		erosion         0
		montesMagn      0.536596
		montesFreq      2.68264
		montesSpiky     0.942341
		montesFraction  0.325023
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00843615
		hillsFraction   0.724224
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.215463
		craterFreq      0.246479
		craterDensity   0.900751
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.548952
		volcanoTemp     1039.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.185, 0.160, 0.130, 0.000)
		colorShelf     (0.190, 0.165, 0.149, 0.000)
		colorBeach     (0.223, 0.193, 0.177, 0.000)
		colorDesert    (0.242, 0.208, 0.172, 0.000)
		colorLowland   (0.266, 0.222, 0.195, 0.000)
		colorUpland    (0.295, 0.269, 0.237, 0.000)
		colorRock      (0.318, 0.292, 0.256, 0.000)
		colorSnow      (0.347, 0.311, 0.270, 1.000)
		BumpHeight      2.05441
		BumpOffset      0.410882
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000426557
		Period          0.000580754
		Eccentricity    0
		Inclination     1.32454
		AscendingNode   117.22
		ArgOfPericenter 151.522
		MeanAnomaly     -128.884
	}
}

DwarfMoon	"Foerost System 7.S11"
{
	ParentBody     "Foerost System 7"
	Class	       "Asteroid"

	Mass            6.7428e-012
	Radius          2.3946
	InertiaMoment   0.397335

	Oblateness      0.249

	Obliquity       -1.22379
	EqAscendNode    102.167
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.748 0.747 0.745)

	Surface
	{
		SurfStyle       0.434195
		OceanStyle      0.322713
		Randomize      (-0.426, -0.346, 0.862)
		colorDistMagn   0.467829
		colorDistFreq   0.00144678
		detailScale     65.3884
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0268309
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.553908
		terraceProb     0.525115
		erosion         0
		montesMagn      0.516651
		montesFreq      3.68058
		montesSpiky     0.99652
		montesFraction  0.827533
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0188593
		hillsFraction   0.626137
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242292
		craterFreq      0.225853
		craterDensity   1.02666
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.501955
		volcanoTemp     1346.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.299, 0.299, 0.298, 0.000)
		colorShelf     (0.318, 0.317, 0.317, 0.000)
		colorBeach     (0.336, 0.336, 0.335, 0.000)
		colorDesert    (0.355, 0.355, 0.354, 0.000)
		colorLowland   (0.374, 0.373, 0.373, 0.000)
		colorUpland    (0.392, 0.392, 0.391, 0.000)
		colorRock      (0.411, 0.411, 0.410, 0.000)
		colorSnow      (0.430, 0.429, 0.428, 1.000)
		BumpHeight      2.15514
		BumpOffset      0.431027
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000430431
		Period          0.000588684
		Eccentricity    0
		Inclination     -1.22379
		AscendingNode   102.167
		ArgOfPericenter 113.852
		MeanAnomaly     13.4315
	}
}

DwarfMoon	"Foerost System 7.S12"
{
	ParentBody     "Foerost System 7"
	Class	       "Asteroid"

	Mass            9.75459e-012
	Radius          3.20458
	InertiaMoment   0.398752

	Oblateness      0.249

	Obliquity       -1.1168
	EqAscendNode    -168.051
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.681 0.678 0.675)

	Surface
	{
		SurfStyle       0.761658
		OceanStyle      0.549954
		Randomize      (-0.423, 0.402, -0.150)
		colorDistMagn   0.519945
		colorDistFreq   0.0062088
		detailScale     87.5065
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00405596
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.766057
		terraceProb     0.112554
		erosion         0
		montesMagn      0.398742
		montesFreq      4.05014
		montesSpiky     0.960981
		montesFraction  0.458824
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0327856
		hillsFraction   0.505214
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236046
		craterFreq      0.19141
		craterDensity   0.778586
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.547701
		volcanoTemp     1191.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.266, 0.230, 0.189, 0.000)
		colorShelf     (0.272, 0.237, 0.216, 0.000)
		colorBeach     (0.320, 0.278, 0.257, 0.000)
		colorDesert    (0.347, 0.298, 0.250, 0.000)
		colorLowland   (0.381, 0.319, 0.284, 0.000)
		colorUpland    (0.422, 0.386, 0.344, 0.000)
		colorRock      (0.456, 0.420, 0.372, 0.000)
		colorSnow      (0.497, 0.447, 0.392, 1.000)
		BumpHeight      2.88413
		BumpOffset      0.576825
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000442268
		Period          0.000613132
		Eccentricity    0
		Inclination     -1.1168
		AscendingNode   -168.051
		ArgOfPericenter -73.8276
		MeanAnomaly     117.748
	}
}

DwarfMoon	"Foerost System 7.S13"
{
	ParentBody     "Foerost System 7"
	Class	       "Asteroid"

	Mass            1.42482e-011
	Radius          3.4609
	InertiaMoment   0.399705

	Oblateness      0.249

	Obliquity       0.238363
	EqAscendNode    -90.3756
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.721 0.597 0.554)

	Surface
	{
		SurfStyle       0.289674
		OceanStyle      0.0456625
		Randomize      (0.359, -0.045, -0.784)
		colorDistMagn   0.298893
		colorDistFreq   0.00490148
		detailScale     94.5055
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00585935
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.49274
		terraceProb     0.102974
		erosion         0
		montesMagn      0.447054
		montesFreq      3.27914
		montesSpiky     0.99288
		montesFraction  0.518967
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0339426
		hillsFraction   0.86326
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.209287
		craterFreq      0.170678
		craterDensity   0.669859
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.549733
		volcanoTemp     1249.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.288, 0.239, 0.221, 0.000)
		colorShelf     (0.306, 0.254, 0.235, 0.000)
		colorBeach     (0.324, 0.269, 0.249, 0.000)
		colorDesert    (0.342, 0.284, 0.263, 0.000)
		colorLowland   (0.360, 0.299, 0.277, 0.000)
		colorUpland    (0.379, 0.314, 0.291, 0.000)
		colorRock      (0.397, 0.329, 0.305, 0.000)
		colorSnow      (0.415, 0.344, 0.318, 1.000)
		BumpHeight      3.11481
		BumpOffset      0.622961
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000459056
		Period          0.000648372
		Eccentricity    0
		Inclination     0.238363
		AscendingNode   -90.3756
		ArgOfPericenter -114.901
		MeanAnomaly     40.5029
	}
}

DwarfMoon	"Foerost System 7.S14"
{
	ParentBody     "Foerost System 7"
	Class	       "Asteroid"

	Mass            2.10607e-011
	Radius          3.78703
	InertiaMoment   0.397612

	Oblateness      0.249

	Obliquity       0.330656
	EqAscendNode    -13.3614
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.782 0.779 0.776)

	Surface
	{
		SurfStyle       0.581682
		OceanStyle      0.694853
		Randomize      (-0.835, 0.886, -0.019)
		colorDistMagn   0.78474
		colorDistFreq   0.00222981
		detailScale     103.411
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0114614
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.575587
		terraceProb     0.135752
		erosion         0
		montesMagn      0.609227
		montesFreq      2.7041
		montesSpiky     0.912245
		montesFraction  0.738213
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0247782
		hillsFraction   0.888855
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241032
		craterFreq      0.234896
		craterDensity   0.933554
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.471865
		volcanoTemp     1512.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.305, 0.265, 0.217, 0.000)
		colorShelf     (0.313, 0.273, 0.248, 0.000)
		colorBeach     (0.368, 0.319, 0.295, 0.000)
		colorDesert    (0.399, 0.343, 0.287, 0.000)
		colorLowland   (0.438, 0.366, 0.326, 0.000)
		colorUpland    (0.485, 0.444, 0.396, 0.000)
		colorRock      (0.524, 0.483, 0.427, 0.000)
		colorSnow      (0.571, 0.514, 0.450, 1.000)
		BumpHeight      3.40833
		BumpOffset      0.681665
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000469928
		Period          0.000671541
		Eccentricity    0
		Inclination     0.330656
		AscendingNode   -13.3614
		ArgOfPericenter -57.5675
		MeanAnomaly     165.51
	}
}

DwarfMoon	"Foerost System 7.S15"
{
	ParentBody     "Foerost System 7"
	Class	       "Asteroid"

	Mass            3.15878e-011
	Radius          4.09045
	InertiaMoment   0.3989

	Oblateness      0.249

	Obliquity       0.903474
	EqAscendNode    146.008
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.450 0.445 0.438)

	Surface
	{
		SurfStyle       0.981643
		OceanStyle      0.358282
		Randomize      (-0.804, -0.608, 0.874)
		colorDistMagn   0.279927
		colorDistFreq   0.00399965
		detailScale     111.697
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00921924
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.358503
		terraceProb     0.152674
		erosion         0
		montesMagn      0.496791
		montesFreq      2.91786
		montesSpiky     0.883595
		montesFraction  0.691757
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0316115
		hillsFraction   0.365661
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.284565
		craterFreq      0.141101
		craterDensity   0.849701
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.540569
		volcanoTemp     1566.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.153, 0.156, 0.175, 0.050)
		colorShelf     (0.180, 0.182, 0.202, 0.040)
		colorBeach     (0.207, 0.209, 0.228, 0.030)
		colorDesert    (0.234, 0.236, 0.259, 0.020)
		colorLowland   (0.261, 0.262, 0.285, 0.030)
		colorUpland    (0.288, 0.289, 0.311, 0.050)
		colorRock      (0.315, 0.316, 0.346, 0.020)
		colorSnow      (0.315, 0.316, 0.346, 1.000)
		BumpHeight      3.68141
		BumpOffset      0.736282
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0004842
		Period          0.000702366
		Eccentricity    0
		Inclination     0.903474
		AscendingNode   146.008
		ArgOfPericenter 142.779
		MeanAnomaly     -35.183
	}
}

DwarfMoon	"Foerost System 7.S16"
{
	ParentBody     "Foerost System 7"
	Class	       "Asteroid"

	Mass            4.82327e-011
	Radius          5.51272
	InertiaMoment   0.39983

	Oblateness      0.249

	Obliquity       0.453749
	EqAscendNode    -17.8238
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.610 0.607 0.606)

	Surface
	{
		SurfStyle       0.905004
		OceanStyle      0.883234
		Randomize      (0.922, 0.318, -0.269)
		colorDistMagn   0.119357
		colorDistFreq   0.0185794
		detailScale     150.534
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0156474
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.463965
		terraceProb     0.118801
		erosion         0
		montesMagn      0.505299
		montesFreq      3.82509
		montesSpiky     0.894277
		montesFraction  0.248075
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0671469
		hillsFraction   0.562929
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254821
		craterFreq      0.171202
		craterDensity   0.860243
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.54143
		volcanoTemp     1518.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.207, 0.213, 0.242, 0.050)
		colorShelf     (0.244, 0.249, 0.279, 0.040)
		colorBeach     (0.281, 0.285, 0.315, 0.030)
		colorDesert    (0.317, 0.322, 0.357, 0.020)
		colorLowland   (0.354, 0.358, 0.394, 0.030)
		colorUpland    (0.390, 0.395, 0.430, 0.050)
		colorRock      (0.427, 0.431, 0.479, 0.020)
		colorSnow      (0.427, 0.431, 0.479, 1.000)
		BumpHeight      4.96145
		BumpOffset      0.99229
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000498511
		Period          0.000733733
		Eccentricity    0
		Inclination     0.453749
		AscendingNode   -17.8238
		ArgOfPericenter 67.8828
		MeanAnomaly     -167.344
	}
}

DwarfMoon	"Foerost System 7.S17"
{
	ParentBody     "Foerost System 7"
	Class	       "Asteroid"

	Mass            7.52932e-011
	Radius          6.06413
	InertiaMoment   0.39785

	Oblateness      0.249

	Obliquity       -1.15256
	EqAscendNode    114.877
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.809 0.776 0.732)

	Surface
	{
		SurfStyle       0.940804
		OceanStyle      0.294389
		Randomize      (-0.115, -0.195, 0.666)
		colorDistMagn   0.091302
		colorDistFreq   0.024525
		detailScale     165.591
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0216489
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.270415
		terraceProb     0.165439
		erosion         0
		montesMagn      0.493078
		montesFreq      3.35048
		montesSpiky     0.937152
		montesFraction  0.601143
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0857747
		hillsFraction   0.828815
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229888
		craterFreq      0.239007
		craterDensity   1.03145
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.479695
		volcanoTemp     1779.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.275, 0.271, 0.293, 0.050)
		colorShelf     (0.324, 0.318, 0.337, 0.040)
		colorBeach     (0.372, 0.365, 0.380, 0.030)
		colorDesert    (0.421, 0.411, 0.432, 0.020)
		colorLowland   (0.469, 0.458, 0.476, 0.030)
		colorUpland    (0.518, 0.504, 0.519, 0.050)
		colorRock      (0.566, 0.551, 0.578, 0.020)
		colorSnow      (0.566, 0.551, 0.578, 1.000)
		BumpHeight      5.45772
		BumpOffset      1.09154
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000512675
		Period          0.000765224
		Eccentricity    0
		Inclination     -1.15256
		AscendingNode   114.877
		ArgOfPericenter -158.707
		MeanAnomaly     -117.695
	}
}

DwarfMoon	"Foerost System 7.S18"
{
	ParentBody     "Foerost System 7"
	Class	       "Asteroid"

	Mass            1.20815e-010
	Radius          6.81908
	InertiaMoment   0.399043

	Oblateness      0.249

	Obliquity       0.439559
	EqAscendNode    -179.934
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.713 0.710 0.706)

	Surface
	{
		SurfStyle       0.224542
		OceanStyle      0.538566
		Randomize      (0.098, 0.424, 0.047)
		colorDistMagn   0.658179
		colorDistFreq   0.0322656
		detailScale     186.206
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.606132
		terraceProb     0.107435
		erosion         0
		montesMagn      0.440112
		montesFreq      3.70826
		montesSpiky     0.931749
		montesFraction  0.142332
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.104224
		hillsFraction   0.419199
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219248
		craterFreq      0.248525
		craterDensity   0.887623
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.541177
		volcanoTemp     1573.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.285, 0.284, 0.283, 0.000)
		colorShelf     (0.303, 0.302, 0.300, 0.000)
		colorBeach     (0.321, 0.319, 0.318, 0.000)
		colorDesert    (0.339, 0.337, 0.336, 0.000)
		colorLowland   (0.356, 0.355, 0.353, 0.000)
		colorUpland    (0.374, 0.373, 0.371, 0.000)
		colorRock      (0.392, 0.390, 0.389, 0.000)
		colorSnow      (0.410, 0.408, 0.406, 1.000)
		BumpHeight      6.13717
		BumpOffset      1.22743
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000520855
		Period          0.000783613
		Eccentricity    0
		Inclination     0.439559
		AscendingNode   -179.934
		ArgOfPericenter 37.1254
		MeanAnomaly     87.0151
	}
}

DwarfMoon	"Foerost System 7.S19"
{
	ParentBody     "Foerost System 7"
	Class	       "Asteroid"

	Mass            2.00725e-010
	Radius          7.67397
	InertiaMoment   0.399956

	Oblateness      0.249

	Obliquity       1.28123
	EqAscendNode    -35.012
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.722 0.719 0.718)

	Surface
	{
		SurfStyle       0.854486
		OceanStyle      0.717449
		Randomize      (0.917, -0.444, 0.004)
		colorDistMagn   0.801729
		colorDistFreq   0.0362471
		detailScale     209.55
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0426388
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.586604
		terraceProb     0.222049
		erosion         0
		montesMagn      0.433138
		montesFreq      2.71807
		montesSpiky     0.992323
		montesFraction  0.173896
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0834796
		hillsFraction   0.69674
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257856
		craterFreq      0.225266
		craterDensity   0.858396
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.591667
		volcanoTemp     1597.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.246, 0.252, 0.287, 0.050)
		colorShelf     (0.289, 0.295, 0.330, 0.040)
		colorBeach     (0.332, 0.338, 0.374, 0.030)
		colorDesert    (0.376, 0.381, 0.424, 0.020)
		colorLowland   (0.419, 0.424, 0.467, 0.030)
		colorUpland    (0.462, 0.468, 0.510, 0.050)
		colorRock      (0.506, 0.511, 0.567, 0.020)
		colorSnow      (0.506, 0.511, 0.567, 1.000)
		BumpHeight      6.90657
		BumpOffset      1.38131
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000525759
		Period          0.000794705
		Eccentricity    0
		Inclination     1.28123
		AscendingNode   -35.012
		ArgOfPericenter 65.1909
		MeanAnomaly     -50.4801
	}
}

DwarfMoon	"Foerost System 7.S20"
{
	ParentBody     "Foerost System 7"
	Class	       "Asteroid"

	Mass            3.48846e-010
	Radius          10.7815
	InertiaMoment   0.398061

	Oblateness      0.249

	Obliquity       -0.182862
	EqAscendNode    159.127
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.423 0.416 0.411)

	Surface
	{
		SurfStyle       0.864731
		OceanStyle      0.681029
		Randomize      (0.352, 0.786, -0.659)
		colorDistMagn   0.586312
		colorDistFreq   0.0578933
		detailScale     294.408
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00114512
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.414646
		terraceProb     0.519056
		erosion         0
		montesMagn      0.5549
		montesFreq      2.85902
		montesSpiky     0.771532
		montesFraction  0.40992
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.306051
		hillsFraction   0.664709
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240054
		craterFreq      0.159535
		craterDensity   0.941751
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.447378
		volcanoTemp     1458.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.144, 0.146, 0.164, 0.050)
		colorShelf     (0.169, 0.171, 0.189, 0.040)
		colorBeach     (0.195, 0.196, 0.214, 0.030)
		colorDesert    (0.220, 0.221, 0.242, 0.020)
		colorLowland   (0.245, 0.246, 0.267, 0.030)
		colorUpland    (0.271, 0.271, 0.292, 0.050)
		colorRock      (0.296, 0.296, 0.325, 0.020)
		colorSnow      (0.296, 0.296, 0.325, 1.000)
		BumpHeight      9.70339
		BumpOffset      1.94068
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000537778
		Period          0.000822111
		Eccentricity    0
		Inclination     -0.182862
		AscendingNode   159.127
		ArgOfPericenter 88.8921
		MeanAnomaly     -15.5923
	}
}

DwarfMoon	"Foerost System 7.S21"
{
	ParentBody     "Foerost System 7"
	Class	       "Asteroid"

	Mass            6.43786e-010
	Radius          12.4768
	InertiaMoment   0.399181

	Oblateness      0.249

	Obliquity       -0.170203
	EqAscendNode    103.147
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.558 0.556 0.552)

	Surface
	{
		SurfStyle       0.49221
		OceanStyle      0.989521
		Randomize      (-0.416, 0.994, -0.914)
		colorDistMagn   0.207563
		colorDistFreq   0.116176
		detailScale     340.699
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00368644
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.374218
		terraceProb     0.235604
		erosion         0
		montesMagn      0.58705
		montesFreq      2.62781
		montesSpiky     0.990048
		montesFraction  0.356738
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.516017
		hillsFraction   0.677769
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25811
		craterFreq      0.247874
		craterDensity   0.760037
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50866
		volcanoTemp     1286.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.223, 0.222, 0.221, 0.000)
		colorShelf     (0.237, 0.236, 0.235, 0.000)
		colorBeach     (0.251, 0.250, 0.249, 0.000)
		colorDesert    (0.265, 0.264, 0.262, 0.000)
		colorLowland   (0.279, 0.278, 0.276, 0.000)
		colorUpland    (0.293, 0.292, 0.290, 0.000)
		colorRock      (0.307, 0.306, 0.304, 0.000)
		colorSnow      (0.321, 0.319, 0.318, 1.000)
		BumpHeight      11.2291
		BumpOffset      2.24582
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000542119
		Period          0.000832086
		Eccentricity    0
		Inclination     -0.170203
		AscendingNode   103.147
		ArgOfPericenter -33.2984
		MeanAnomaly     -162.16
	}
}

DwarfMoon	"Foerost System 7.S22"
{
	ParentBody     "Foerost System 7"
	Class	       "Asteroid"

	Mass            1.29177e-009
	Radius          15.1089
	InertiaMoment   0.395714

	Oblateness      0.249

	Obliquity       0.423808
	EqAscendNode    -14.9153
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.774 0.772 0.771)

	Surface
	{
		SurfStyle       0.18178
		OceanStyle      0.799433
		Randomize      (-0.432, -0.158, -0.764)
		colorDistMagn   0.319953
		colorDistFreq   0.111085
		detailScale     412.573
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0146684
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.355585
		terraceProb     0.159723
		erosion         0
		montesMagn      0.358343
		montesFreq      2.48158
		montesSpiky     0.987202
		montesFraction  0.482587
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.620585
		hillsFraction   0.460521
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.26132
		craterFreq      0.25342
		craterDensity   0.822978
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.519289
		volcanoTemp     1369.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.310, 0.309, 0.308, 0.000)
		colorShelf     (0.329, 0.328, 0.328, 0.000)
		colorBeach     (0.348, 0.347, 0.347, 0.000)
		colorDesert    (0.368, 0.367, 0.366, 0.000)
		colorLowland   (0.387, 0.386, 0.386, 0.000)
		colorUpland    (0.406, 0.405, 0.405, 0.000)
		colorRock      (0.426, 0.425, 0.424, 0.000)
		colorSnow      (0.445, 0.444, 0.443, 1.000)
		BumpHeight      13.598
		BumpOffset      2.7196
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000563709
		Period          0.000882284
		Eccentricity    0
		Inclination     0.423808
		AscendingNode   -14.9153
		ArgOfPericenter 71.972
		MeanAnomaly     158.141
	}
}

DwarfMoon	"Foerost System 7.S23"
{
	ParentBody     "Foerost System 7"
	Class	       "Asteroid"

	Mass            2.93525e-009
	Radius          18.9525
	InertiaMoment   0.398252

	Oblateness      0.249

	Obliquity       -0.0591598
	EqAscendNode    -162.354
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.748 0.743 0.741)

	Surface
	{
		SurfStyle       0.103792
		OceanStyle      0.856473
		Randomize      (-0.617, -0.945, 0.362)
		colorDistMagn   0.390954
		colorDistFreq   0.199228
		detailScale     517.53
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.600373
		terraceProb     0.114729
		erosion         0
		montesMagn      0.519828
		montesFreq      2.8806
		montesSpiky     0.934952
		montesFraction  0.264229
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.728669
		hillsFraction   0.439187
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227822
		craterFreq      0.252424
		craterDensity   0.924399
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49394
		volcanoTemp     1513.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.299, 0.297, 0.296, 0.000)
		colorShelf     (0.318, 0.316, 0.315, 0.000)
		colorBeach     (0.337, 0.334, 0.334, 0.000)
		colorDesert    (0.355, 0.353, 0.352, 0.000)
		colorLowland   (0.374, 0.372, 0.371, 0.000)
		colorUpland    (0.393, 0.390, 0.389, 0.000)
		colorRock      (0.411, 0.409, 0.408, 0.000)
		colorSnow      (0.430, 0.427, 0.426, 1.000)
		BumpHeight      17.0573
		BumpOffset      3.41145
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000582634
		Period          0.000927086
		Eccentricity    0
		Inclination     -0.0591598
		AscendingNode   -162.354
		ArgOfPericenter -15.3267
		MeanAnomaly     85.0097
	}
}

DwarfMoon	"Foerost System 7.S24"
{
	ParentBody     "Foerost System 7"
	Class	       "Asteroid"

	Mass            6.83811e-016
	Radius          0.136779
	InertiaMoment   0.399315

	Oblateness      0.249

	Obliquity       -1.08211
	EqAscendNode    -88.8133
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.682 0.595 0.502)

	Surface
	{
		SurfStyle       0.900607
		OceanStyle      0.30456
		Randomize      (0.690, -0.450, 0.081)
		colorDistMagn   0.751484
		colorDistFreq   1.30176e-005
		detailScale     3.73497
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0269814
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.543277
		terraceProb     0.367193
		erosion         0
		montesMagn      0.371992
		montesFreq      2.53799
		montesSpiky     0.956758
		montesFraction  0.763421
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.26182e-005
		hillsFraction   0.778924
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217304
		craterFreq      0.17904
		craterDensity   0.802617
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.524405
		volcanoTemp     1547.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.232, 0.208, 0.201, 0.050)
		colorShelf     (0.273, 0.244, 0.231, 0.040)
		colorBeach     (0.314, 0.280, 0.261, 0.030)
		colorDesert    (0.354, 0.315, 0.296, 0.020)
		colorLowland   (0.395, 0.351, 0.326, 0.030)
		colorUpland    (0.436, 0.387, 0.356, 0.050)
		colorRock      (0.477, 0.423, 0.397, 0.020)
		colorSnow      (0.477, 0.423, 0.397, 1.000)
		BumpHeight      0.123101
		BumpOffset      0.0246202
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000593402
		Period          0.000952905
		Eccentricity    0
		Inclination     -1.08211
		AscendingNode   -88.8133
		ArgOfPericenter -121.091
		MeanAnomaly     -17.2193
	}
}

DwarfMoon	"Foerost System 7.S25"
{
	ParentBody     "Foerost System 7"
	Class	       "Asteroid"

	Mass            1.39543e-015
	Radius          0.16251
	InertiaMoment   0.396521

	Oblateness      0.249

	Obliquity       0.705586
	EqAscendNode    148.376
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.721 0.675 0.613)

	Surface
	{
		SurfStyle       0.00482765
		OceanStyle      0.980236
		Randomize      (0.127, 0.812, -0.974)
		colorDistMagn   0.968612
		colorDistFreq   7.54968e-006
		detailScale     4.43761
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00671272
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.439848
		terraceProb     0.207205
		erosion         0
		montesMagn      0.485863
		montesFreq      3.78281
		montesSpiky     0.971708
		montesFraction  0.540488
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.05003e-005
		hillsFraction   0.735186
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264283
		craterFreq      0.181992
		craterDensity   0.863365
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.5465
		volcanoTemp     1285.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.288, 0.270, 0.245, 0.000)
		colorShelf     (0.306, 0.287, 0.261, 0.000)
		colorBeach     (0.324, 0.304, 0.276, 0.000)
		colorDesert    (0.343, 0.321, 0.291, 0.000)
		colorLowland   (0.361, 0.338, 0.307, 0.000)
		colorUpland    (0.379, 0.355, 0.322, 0.000)
		colorRock      (0.397, 0.371, 0.337, 0.000)
		colorSnow      (0.415, 0.388, 0.353, 1.000)
		BumpHeight      0.146259
		BumpOffset      0.0292518
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000606724
		Period          0.000985175
		Eccentricity    0
		Inclination     0.705586
		AscendingNode   148.376
		ArgOfPericenter 37.2997
		MeanAnomaly     -149.442
	}
}

DwarfMoon	"Foerost System 7.S26"
{
	ParentBody     "Foerost System 7"
	Class	       "Asteroid"

	Mass            2.60562e-015
	Radius          0.191981
	InertiaMoment   0.398428

	Oblateness      0.249

	Obliquity       0.823585
	EqAscendNode    -24.7942
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.472 0.468 0.465)

	Surface
	{
		SurfStyle       0.804381
		OceanStyle      0.0587026
		Randomize      (0.238, -0.276, 0.851)
		colorDistMagn   0.58027
		colorDistFreq   2.11921e-005
		detailScale     5.24236
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0280745
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.275862
		terraceProb     0.219541
		erosion         0
		montesMagn      0.548234
		montesFreq      2.66514
		montesSpiky     0.919084
		montesFraction  0.762535
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.89627e-005
		hillsFraction   0.773166
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264063
		craterFreq      0.235937
		craterDensity   0.922133
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.532481
		volcanoTemp     1356.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.184, 0.159, 0.130, 0.000)
		colorShelf     (0.189, 0.164, 0.149, 0.000)
		colorBeach     (0.222, 0.192, 0.177, 0.000)
		colorDesert    (0.241, 0.206, 0.172, 0.000)
		colorLowland   (0.264, 0.220, 0.195, 0.000)
		colorUpland    (0.293, 0.267, 0.237, 0.000)
		colorRock      (0.316, 0.290, 0.256, 0.000)
		colorSnow      (0.345, 0.309, 0.270, 1.000)
		BumpHeight      0.172783
		BumpOffset      0.0345566
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000619376
		Period          0.00101615
		Eccentricity    0
		Inclination     0.823585
		AscendingNode   -24.7942
		ArgOfPericenter 47.7067
		MeanAnomaly     -30.6637
	}
}

DwarfMoon	"Foerost System 7.S27"
{
	ParentBody     "Foerost System 7"
	Class	       "Asteroid"

	Mass            4.56755e-015
	Radius          0.22147
	InertiaMoment   0.399446

	Oblateness      0.249

	Obliquity       -0.486749
	EqAscendNode    71.7422
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.666 0.662 0.660)

	Surface
	{
		SurfStyle       0.676358
		OceanStyle      0.303781
		Randomize      (-0.708, -0.829, 0.769)
		colorDistMagn   0.920327
		colorDistFreq   3.69711e-005
		detailScale     6.04761
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0137671
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.605986
		terraceProb     0.25379
		erosion         0
		montesMagn      0.512124
		montesFreq      2.99
		montesSpiky     0.739763
		montesFraction  0.653834
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000140971
		hillsFraction   0.439324
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.210113
		craterFreq      0.161289
		craterDensity   0.986622
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.43942
		volcanoTemp     1311.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.260, 0.225, 0.185, 0.000)
		colorShelf     (0.267, 0.232, 0.211, 0.000)
		colorBeach     (0.313, 0.271, 0.251, 0.000)
		colorDesert    (0.340, 0.291, 0.244, 0.000)
		colorLowland   (0.373, 0.311, 0.277, 0.000)
		colorUpland    (0.413, 0.377, 0.337, 0.000)
		colorRock      (0.446, 0.410, 0.363, 0.000)
		colorSnow      (0.486, 0.437, 0.383, 1.000)
		BumpHeight      0.199323
		BumpOffset      0.0398646
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000623448
		Period          0.00102619
		Eccentricity    0
		Inclination     -0.486749
		AscendingNode   71.7422
		ArgOfPericenter 120.878
		MeanAnomaly     18.5318
	}
}

DwarfMoon	"Foerost System 7.S28"
{
	ParentBody     "Foerost System 7"
	Class	       "Asteroid"

	Mass            7.63855e-015
	Radius          0.311187
	InertiaMoment   0.396986

	Oblateness      0.249

	Obliquity       0.0810344
	EqAscendNode    100.716
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.716 0.714 0.713)

	Surface
	{
		SurfStyle       0.903764
		OceanStyle      0.820863
		Randomize      (-0.492, 0.368, 0.970)
		colorDistMagn   0.530489
		colorDistFreq   6.75241e-006
		detailScale     8.49749
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00179406
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.422634
		terraceProb     0.628317
		erosion         0
		montesMagn      0.551114
		montesFreq      2.95312
		montesSpiky     0.860938
		montesFraction  0.690768
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000191753
		hillsFraction   0.610496
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244544
		craterFreq      0.182448
		craterDensity   0.809514
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.456788
		volcanoTemp     1810.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.243, 0.250, 0.285, 0.050)
		colorShelf     (0.286, 0.293, 0.328, 0.040)
		colorBeach     (0.329, 0.336, 0.371, 0.030)
		colorDesert    (0.372, 0.379, 0.421, 0.020)
		colorLowland   (0.415, 0.422, 0.464, 0.030)
		colorUpland    (0.458, 0.464, 0.506, 0.050)
		colorRock      (0.501, 0.507, 0.563, 0.020)
		colorSnow      (0.501, 0.507, 0.563, 1.000)
		BumpHeight      0.280069
		BumpOffset      0.0560137
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000629347
		Period          0.00104079
		Eccentricity    0
		Inclination     0.0810344
		AscendingNode   100.716
		ArgOfPericenter 100.883
		MeanAnomaly     -98.0087
	}
}

DwarfMoon	"Foerost System 7.S29"
{
	ParentBody     "Foerost System 7"
	Class	       "Asteroid"

	Mass            1.23197e-014
	Radius          0.338158
	InertiaMoment   0.398593

	Oblateness      0.249

	Obliquity       -1.21967
	EqAscendNode    124.698
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.705 0.703 0.702)

	Surface
	{
		SurfStyle       0.0814674
		OceanStyle      0.822181
		Randomize      (-0.765, 0.442, -0.794)
		colorDistMagn   0.262698
		colorDistFreq   1.05871e-005
		detailScale     9.23398
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0197548
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.558709
		terraceProb     0.149082
		erosion         0
		montesMagn      0.594679
		montesFreq      3.26037
		montesSpiky     0.994225
		montesFraction  0.569582
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000308717
		hillsFraction   0.744881
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.216573
		craterFreq      0.246598
		craterDensity   0.850027
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.54982
		volcanoTemp     1547.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.282, 0.281, 0.281, 0.000)
		colorShelf     (0.300, 0.299, 0.298, 0.000)
		colorBeach     (0.317, 0.316, 0.316, 0.000)
		colorDesert    (0.335, 0.334, 0.333, 0.000)
		colorLowland   (0.353, 0.352, 0.351, 0.000)
		colorUpland    (0.370, 0.369, 0.368, 0.000)
		colorRock      (0.388, 0.387, 0.386, 0.000)
		colorSnow      (0.405, 0.404, 0.404, 1.000)
		BumpHeight      0.304343
		BumpOffset      0.0608685
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000632052
		Period          0.0010475
		Eccentricity    0
		Inclination     -1.21967
		AscendingNode   124.698
		ArgOfPericenter -166.703
		MeanAnomaly     20.708
	}
}

DwarfMoon	"Foerost System 7.S30"
{
	ParentBody     "Foerost System 7"
	Class	       "Asteroid"

	Mass            1.93102e-014
	Radius          0.376404
	InertiaMoment   0.399575

	Oblateness      0.249

	Obliquity       1.2728
	EqAscendNode    50.898
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.536 0.530 0.522)

	Surface
	{
		SurfStyle       0.00685603
		OceanStyle      0.268384
		Randomize      (-0.373, 0.772, 0.459)
		colorDistMagn   0.348364
		colorDistFreq   0.000110975
		detailScale     10.2783
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0401068
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.446443
		terraceProb     0.254922
		erosion         0
		montesMagn      0.537577
		montesFreq      2.35507
		montesSpiky     0.961455
		montesFraction  0.703023
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00032782
		hillsFraction   0.808894
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241092
		craterFreq      0.203229
		craterDensity   1.0227
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.512032
		volcanoTemp     1742.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.214, 0.212, 0.209, 0.000)
		colorShelf     (0.228, 0.225, 0.222, 0.000)
		colorBeach     (0.241, 0.239, 0.235, 0.000)
		colorDesert    (0.254, 0.252, 0.248, 0.000)
		colorLowland   (0.268, 0.265, 0.261, 0.000)
		colorUpland    (0.281, 0.278, 0.274, 0.000)
		colorRock      (0.295, 0.292, 0.287, 0.000)
		colorSnow      (0.308, 0.305, 0.300, 1.000)
		BumpHeight      0.338763
		BumpOffset      0.0677527
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000638506
		Period          0.00106359
		Eccentricity    0
		Inclination     1.2728
		AscendingNode   50.898
		ArgOfPericenter -9.36954
		MeanAnomaly     151.101
	}
}

DwarfMoon	"Foerost System 7.S31"
{
	ParentBody     "Foerost System 7"
	Class	       "Asteroid"

	Mass            2.95828e-014
	Radius          0.415907
	InertiaMoment   0.397328

	Oblateness      0.249

	Obliquity       1.43234
	EqAscendNode    124.842
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.581 0.482 0.379)

	Surface
	{
		SurfStyle       0.00411825
		OceanStyle      0.166123
		Randomize      (-0.304, 0.388, -0.261)
		colorDistMagn   0.422363
		colorDistFreq   9.85829e-005
		detailScale     11.357
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0231442
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.329075
		terraceProb     0.472229
		erosion         0
		montesMagn      0.528056
		montesFreq      2.59747
		montesSpiky     0.844442
		montesFraction  0.709861
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00044327
		hillsFraction   0.550497
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245767
		craterFreq      0.172858
		craterDensity   0.806694
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.475527
		volcanoTemp     1170.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.232, 0.193, 0.151, 0.000)
		colorShelf     (0.247, 0.205, 0.161, 0.000)
		colorBeach     (0.261, 0.217, 0.170, 0.000)
		colorDesert    (0.276, 0.229, 0.180, 0.000)
		colorLowland   (0.290, 0.241, 0.189, 0.000)
		colorUpland    (0.305, 0.253, 0.199, 0.000)
		colorRock      (0.319, 0.265, 0.208, 0.000)
		colorSnow      (0.334, 0.277, 0.218, 1.000)
		BumpHeight      0.374316
		BumpOffset      0.0748632
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000650726
		Period          0.00109427
		Eccentricity    0
		Inclination     1.43234
		AscendingNode   124.842
		ArgOfPericenter 126.459
		MeanAnomaly     -141.494
	}
}

DwarfMoon	"Foerost System 7.S32"
{
	ParentBody     "Foerost System 7"
	Class	       "Asteroid"

	Mass            4.44887e-014
	Radius          0.574642
	InertiaMoment   0.398749

	Oblateness      0.249

	Obliquity       1.29476
	EqAscendNode    3.77477
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.814 0.749 0.672)

	Surface
	{
		SurfStyle       0.100134
		OceanStyle      0.116131
		Randomize      (0.527, -0.639, -0.453)
		colorDistMagn   0.508731
		colorDistFreq   0.000240846
		detailScale     15.6915
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0451565
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.636237
		terraceProb     0.238179
		erosion         0
		montesMagn      0.493345
		montesFreq      3.05188
		montesSpiky     0.926136
		montesFraction  0.669573
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000561507
		hillsFraction   0.850161
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241933
		craterFreq      0.213471
		craterDensity   0.963232
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.463052
		volcanoTemp     1519.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.325, 0.300, 0.269, 0.000)
		colorShelf     (0.346, 0.318, 0.286, 0.000)
		colorBeach     (0.366, 0.337, 0.302, 0.000)
		colorDesert    (0.387, 0.356, 0.319, 0.000)
		colorLowland   (0.407, 0.375, 0.336, 0.000)
		colorUpland    (0.427, 0.393, 0.353, 0.000)
		colorRock      (0.448, 0.412, 0.370, 0.000)
		colorSnow      (0.468, 0.431, 0.386, 1.000)
		BumpHeight      0.517177
		BumpOffset      0.103435
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000656067
		Period          0.00110777
		Eccentricity    0
		Inclination     1.29476
		AscendingNode   3.77477
		ArgOfPericenter -88.9427
		MeanAnomaly     -154.206
	}
}

DwarfMoon	"Foerost System 7.S33"
{
	ParentBody     "Foerost System 7"
	Class	       "Asteroid"

	Mass            6.59038e-014
	Radius          0.595701
	InertiaMoment   0.399702

	Oblateness      0.249

	Obliquity       1.30673
	EqAscendNode    5.33072
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.839 0.784 0.758)

	Surface
	{
		SurfStyle       0.607109
		OceanStyle      0.995067
		Randomize      (-0.995, 0.703, 0.946)
		colorDistMagn   0.501192
		colorDistFreq   6.8379e-005
		detailScale     16.2666
		colorConversion true
		snowLevel       2
		tropicLatitude  0.045549
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.261108
		terraceProb     0.399294
		erosion         0
		montesMagn      0.550564
		montesFreq      2.65788
		montesSpiky     0.943395
		montesFraction  0.376964
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000931732
		hillsFraction   0.697567
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233298
		craterFreq      0.232172
		craterDensity   0.745079
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.529143
		volcanoTemp     2103.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.327, 0.267, 0.212, 0.000)
		colorShelf     (0.336, 0.274, 0.242, 0.000)
		colorBeach     (0.394, 0.321, 0.288, 0.000)
		colorDesert    (0.428, 0.345, 0.280, 0.000)
		colorLowland   (0.470, 0.368, 0.318, 0.000)
		colorUpland    (0.520, 0.447, 0.386, 0.000)
		colorRock      (0.562, 0.486, 0.417, 0.000)
		colorSnow      (0.612, 0.517, 0.439, 1.000)
		BumpHeight      0.536131
		BumpOffset      0.107226
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000662611
		Period          0.00112438
		Eccentricity    0
		Inclination     1.30673
		AscendingNode   5.33072
		ArgOfPericenter 88.9095
		MeanAnomaly     -75.356
	}
}

DwarfMoon	"Foerost System 7.S34"
{
	ParentBody     "Foerost System 7"
	Class	       "Asteroid"

	Mass            9.64344e-014
	Radius          0.647011
	InertiaMoment   0.397607

	Oblateness      0.249

	Obliquity       0.921899
	EqAscendNode    161.278
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.767 0.696 0.628)

	Surface
	{
		SurfStyle       0.447725
		OceanStyle      0.816252
		Randomize      (-0.167, -0.125, 0.750)
		colorDistMagn   0.577223
		colorDistFreq   7.57979e-005
		detailScale     17.6677
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00523622
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.367868
		terraceProb     0.635921
		erosion         0
		montesMagn      0.524789
		montesFreq      3.30775
		montesSpiky     0.97183
		montesFraction  0.669773
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00120038
		hillsFraction   0.798092
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237838
		craterFreq      0.217864
		craterDensity   0.9565
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.440312
		volcanoTemp     1345.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.307, 0.279, 0.251, 0.000)
		colorShelf     (0.326, 0.296, 0.267, 0.000)
		colorBeach     (0.345, 0.313, 0.283, 0.000)
		colorDesert    (0.364, 0.331, 0.299, 0.000)
		colorLowland   (0.383, 0.348, 0.314, 0.000)
		colorUpland    (0.403, 0.366, 0.330, 0.000)
		colorRock      (0.422, 0.383, 0.346, 0.000)
		colorSnow      (0.441, 0.400, 0.361, 1.000)
		BumpHeight      0.58231
		BumpOffset      0.116462
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00068109
		Period          0.00117174
		Eccentricity    0
		Inclination     0.921899
		AscendingNode   161.278
		ArgOfPericenter 126.041
		MeanAnomaly     134.726
	}
}

DwarfMoon	"Foerost System 8.D1"
{
	ParentBody     "Foerost System 8"
	Class	       "Asteroid"

	Mass            3.86067e-008
	Radius          46.9016
	InertiaMoment   0.395327

	Oblateness      0.249

	Obliquity       -0.00613673
	EqAscendNode    99.8373
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.496 0.492 0.488)

	Surface
	{
		SurfStyle       0.149233
		OceanStyle      0.358376
		Randomize      (0.339, 0.752, -0.611)
		colorDistMagn   0.904171
		colorDistFreq   0.727127
		detailScale     1280.73
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.594419
		terraceProb     0.340383
		erosion         0
		montesMagn      0.575917
		montesFreq      3.36842
		montesSpiky     0.979779
		montesFraction  0.461966
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.25788
		hillsFraction   0.628966
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225047
		craterFreq      0.220131
		craterDensity   0.8837
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.532756
		volcanoTemp     1025.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.199, 0.197, 0.195, 0.000)
		colorShelf     (0.211, 0.209, 0.207, 0.000)
		colorBeach     (0.223, 0.222, 0.220, 0.000)
		colorDesert    (0.236, 0.234, 0.232, 0.000)
		colorLowland   (0.248, 0.246, 0.244, 0.000)
		colorUpland    (0.261, 0.258, 0.256, 0.000)
		colorRock      (0.273, 0.271, 0.268, 0.000)
		colorSnow      (0.285, 0.283, 0.281, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   9.62136e-005
		Period          0.000893145
		Eccentricity    2.28799e-005
		Inclination     -0.00613673
		AscendingNode   99.8373
		ArgOfPericenter 147.148
		MeanAnomaly     3.76695
	}
}

DwarfMoon	"Foerost System 8.D2"
{
	ParentBody     "Foerost System 8"
	Class	       "Asteroid"

	Mass            5.24166e-008
	Radius          49.5615
	InertiaMoment   0.398205

	Oblateness      0.223718

	Obliquity       0.00474847
	EqAscendNode    -79.104
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.486 0.429 0.349)

	Surface
	{
		SurfStyle       0.633756
		OceanStyle      0.947532
		Randomize      (-0.394, 0.094, -0.553)
		colorDistMagn   0.960595
		colorDistFreq   1.30217
		detailScale     1353.36
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.458678
		terraceProb     0.500869
		erosion         0
		montesMagn      0.582821
		montesFreq      2.64441
		montesSpiky     0.603998
		montesFraction  0.591512
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.3015
		hillsFraction   0.621572
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217095
		craterFreq      0.228404
		craterDensity   0.838747
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48271
		volcanoTemp     1197.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.190, 0.146, 0.098, 0.000)
		colorShelf     (0.194, 0.150, 0.112, 0.000)
		colorBeach     (0.229, 0.176, 0.132, 0.000)
		colorDesert    (0.248, 0.189, 0.129, 0.000)
		colorLowland   (0.272, 0.202, 0.146, 0.000)
		colorUpland    (0.301, 0.245, 0.178, 0.000)
		colorRock      (0.326, 0.266, 0.192, 0.000)
		colorSnow      (0.355, 0.283, 0.202, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000112695
		Period          0.00113221
		Eccentricity    8.44997e-005
		Inclination     0.00474847
		AscendingNode   -79.104
		ArgOfPericenter -68.0968
		MeanAnomaly     -56.9729
	}
}

DwarfMoon	"Foerost System 8.D3"
{
	ParentBody     "Foerost System 8"
	Class	       "Asteroid"

	Mass            1.32802e-007
	Radius          71.2007
	InertiaMoment   0.398385

	Obliquity       41.2717
	EqAscendNode    -163.487
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.446 0.442 0.440)

	Surface
	{
		SurfStyle       0.837227
		OceanStyle      0.307751
		Randomize      (0.424, -0.598, 0.809)
		colorDistMagn   0.458372
		colorDistFreq   1.14153
		detailScale     1944.25
		colorConversion true
		snowLevel       2
		tropicLatitude  0.188596
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.673
		terraceProb     0.39583
		erosion         0
		montesMagn      0.348667
		montesFreq      3.4416
		montesSpiky     0.991905
		montesFraction  0.457053
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.78599
		hillsFraction   0.554751
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236813
		craterFreq      0.204452
		craterDensity   0.794461
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.562742
		volcanoTemp     1311.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.174, 0.150, 0.123, 0.000)
		colorShelf     (0.179, 0.155, 0.141, 0.000)
		colorBeach     (0.210, 0.181, 0.167, 0.000)
		colorDesert    (0.228, 0.195, 0.163, 0.000)
		colorLowland   (0.250, 0.208, 0.185, 0.000)
		colorUpland    (0.277, 0.252, 0.224, 0.000)
		colorRock      (0.299, 0.274, 0.242, 0.000)
		colorSnow      (0.326, 0.292, 0.255, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0027787
		Period          0.138621
		Eccentricity    0.482607
		Inclination     41.2717
		AscendingNode   -163.487
		ArgOfPericenter -170.051
		MeanAnomaly     -30.7999
	}
}

DwarfMoon	"Foerost System 8.D4"
{
	ParentBody     "Foerost System 8"
	Class	       "Asteroid"

	Mass            1.82364e-007
	Radius          75.726
	InertiaMoment   0.399413

	Obliquity       87.947
	EqAscendNode    -71.6641
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.683 0.681 0.678)

	Surface
	{
		SurfStyle       0.665545
		OceanStyle      0.343099
		Randomize      (0.323, -0.629, -0.015)
		colorDistMagn   0.612031
		colorDistFreq   2.21612
		detailScale     2067.82
		colorConversion true
		snowLevel       2
		tropicLatitude  0.949786
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.298155
		terraceProb     0.276605
		erosion         0
		montesMagn      0.575013
		montesFreq      3.29282
		montesSpiky     0.996646
		montesFraction  0.352266
		dunesFraction   0
		hillsMagn       0
		hillsFreq       14.1517
		hillsFraction   0.680849
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230629
		craterFreq      0.1907
		craterDensity   0.953418
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.606704
		volcanoTemp     1345.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.266, 0.232, 0.190, 0.000)
		colorShelf     (0.273, 0.238, 0.217, 0.000)
		colorBeach     (0.321, 0.279, 0.258, 0.000)
		colorDesert    (0.348, 0.300, 0.251, 0.000)
		colorLowland   (0.383, 0.320, 0.285, 0.000)
		colorUpland    (0.424, 0.388, 0.346, 0.000)
		colorRock      (0.458, 0.422, 0.373, 0.000)
		colorSnow      (0.499, 0.449, 0.393, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00323261
		Period          0.173939
		Eccentricity    0.0770817
		Inclination     87.947
		AscendingNode   -71.664
		ArgOfPericenter 122.854
		MeanAnomaly     -156.645
	}
}

DwarfMoon	"Foerost System 8.D5"
{
	ParentBody     "Foerost System 8"
	Class	       "Asteroid"

	Mass            2.51782e-007
	Radius          99.885
	InertiaMoment   0.396883

	Obliquity       12.4997
	EqAscendNode    -48.6467
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.517 0.509 0.502)

	Surface
	{
		SurfStyle       0.0240325
		OceanStyle      0.931371
		Randomize      (-0.020, -0.949, -0.885)
		colorDistMagn   0.313977
		colorDistFreq   6.35597
		detailScale     2727.53
		colorConversion true
		snowLevel       2
		tropicLatitude  0.386697
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.564819
		terraceProb     0.515751
		erosion         0
		montesMagn      0.448841
		montesFreq      3.301
		montesSpiky     0.946071
		montesFraction  0.703092
		dunesFraction   0
		hillsMagn       0
		hillsFreq       19.6666
		hillsFraction   0.832289
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258865
		craterFreq      0.291083
		craterDensity   0.957826
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.494868
		volcanoTemp     1457.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.207, 0.204, 0.201, 0.000)
		colorShelf     (0.220, 0.216, 0.213, 0.000)
		colorBeach     (0.233, 0.229, 0.226, 0.000)
		colorDesert    (0.245, 0.242, 0.239, 0.000)
		colorLowland   (0.258, 0.254, 0.251, 0.000)
		colorUpland    (0.271, 0.267, 0.264, 0.000)
		colorRock      (0.284, 0.280, 0.276, 0.000)
		colorSnow      (0.297, 0.293, 0.289, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00388311
		Period          0.229
		Eccentricity    0.291288
		Inclination     12.4997
		AscendingNode   -48.6467
		ArgOfPericenter -93.7558
		MeanAnomaly     115.88
	}
}

DwarfMoon	"Foerost System 8.D6"
{
	ParentBody     "Foerost System 8"
	Class	       "Asteroid"

	Mass            3.49946e-007
	Radius          103.216
	InertiaMoment   0.398552

	Obliquity       -76.9327
	EqAscendNode    -163.842
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.577 0.572 0.564)

	Surface
	{
		SurfStyle       0.594624
		OceanStyle      0.97545
		Randomize      (0.653, -0.444, -0.553)
		colorDistMagn   0.254529
		colorDistFreq   5.87393
		detailScale     2818.48
		colorConversion true
		snowLevel       2
		tropicLatitude  0.271217
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.527695
		terraceProb     0.1231
		erosion         0
		montesMagn      0.42513
		montesFreq      2.50511
		montesSpiky     0.962671
		montesFraction  0.510013
		dunesFraction   0
		hillsMagn       0
		hillsFreq       22.0621
		hillsFraction   0.75112
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23619
		craterFreq      0.327583
		craterDensity   0.876882
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.571217
		volcanoTemp     1171.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.225, 0.194, 0.158, 0.000)
		colorShelf     (0.231, 0.200, 0.181, 0.000)
		colorBeach     (0.271, 0.234, 0.214, 0.000)
		colorDesert    (0.294, 0.252, 0.209, 0.000)
		colorLowland   (0.323, 0.269, 0.237, 0.000)
		colorUpland    (0.358, 0.326, 0.288, 0.000)
		colorRock      (0.387, 0.354, 0.310, 0.000)
		colorSnow      (0.421, 0.377, 0.327, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0041833
		Period          0.256062
		Eccentricity    0.096513
		Inclination     -76.9327
		AscendingNode   -163.842
		ArgOfPericenter -54.1676
		MeanAnomaly     24.8446
	}
}

DwarfMoon	"Foerost System 8.D7"
{
	ParentBody     "Foerost System 8"
	Class	       "Asteroid"

	Mass            4.90317e-007
	Radius          110.665
	InertiaMoment   0.399542

	RotationPeriod  6020.36
	Obliquity       -72.5768
	EqAscendNode    157.822

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.568 0.565 0.563)

	Surface
	{
		SurfStyle       0.183981
		OceanStyle      0.630554
		Randomize      (-0.637, 0.700, -0.490)
		colorDistMagn   0.114854
		colorDistFreq   4.08698
		detailScale     3021.9
		colorConversion true
		snowLevel       2
		tropicLatitude  0.360784
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.37834
		terraceProb     0.379184
		erosion         0
		montesMagn      0.412479
		montesFreq      3.04266
		montesSpiky     0.885454
		montesFraction  0.767149
		dunesFraction   0
		hillsMagn       0
		hillsFreq       27.2917
		hillsFraction   0.485189
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229942
		craterFreq      0.376958
		craterDensity   1.00004
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.538461
		volcanoTemp     1400.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.227, 0.226, 0.225, 0.000)
		colorShelf     (0.241, 0.240, 0.239, 0.000)
		colorBeach     (0.256, 0.254, 0.253, 0.000)
		colorDesert    (0.270, 0.268, 0.267, 0.000)
		colorLowland   (0.284, 0.282, 0.281, 0.000)
		colorUpland    (0.298, 0.297, 0.296, 0.000)
		colorRock      (0.312, 0.311, 0.310, 0.000)
		colorSnow      (0.327, 0.325, 0.324, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00438412
		Period          0.27472
		Eccentricity    0.484411
		Inclination     -72.5768
		AscendingNode   157.822
		ArgOfPericenter -89.514
		MeanAnomaly     65.0091
	}
}

DwarfMoon	"Foerost System 8.D8"
{
	ParentBody     "Foerost System 8"
	Class	       "Asteroid"

	Mass            6.93684e-007
	Radius          119.087
	InertiaMoment   0.397249

	RotationPeriod  13266
	Obliquity       9.26241
	EqAscendNode    152.114

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.418 0.413 0.409)

	Surface
	{
		SurfStyle       0.461907
		OceanStyle      0.643889
		Randomize      (-0.985, 0.122, -0.699)
		colorDistMagn   0.726314
		colorDistFreq   8.40316
		detailScale     3251.87
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0775092
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.361375
		terraceProb     0.719098
		erosion         0
		montesMagn      0.331291
		montesFreq      3.94083
		montesSpiky     0.8325
		montesFraction  0.722136
		dunesFraction   0
		hillsMagn       0
		hillsFreq       34.7065
		hillsFraction   0.529367
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223606
		craterFreq      0.481707
		craterDensity   0.691739
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.499026
		volcanoTemp     1759.14
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.167, 0.165, 0.163, 0.000)
		colorShelf     (0.178, 0.176, 0.174, 0.000)
		colorBeach     (0.188, 0.186, 0.184, 0.000)
		colorDesert    (0.199, 0.196, 0.194, 0.000)
		colorLowland   (0.209, 0.207, 0.204, 0.000)
		colorUpland    (0.220, 0.217, 0.215, 0.000)
		colorRock      (0.230, 0.227, 0.225, 0.000)
		colorSnow      (0.241, 0.238, 0.235, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00467671
		Period          0.302676
		Eccentricity    0.273809
		Inclination     9.26241
		AscendingNode   152.114
		ArgOfPericenter 152.791
		MeanAnomaly     120.699
	}
}

DwarfMoon	"Foerost System 8.D9"
{
	ParentBody     "Foerost System 8"
	Class	       "Asteroid"

	Mass            9.92858e-007
	Radius          162.077
	InertiaMoment   0.39871

	Obliquity       52.5594
	EqAscendNode    129.524
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.836 0.767 0.737)

	Surface
	{
		SurfStyle       0.134736
		OceanStyle      0.479246
		Randomize      (0.058, 0.714, -0.831)
		colorDistMagn   0.849611
		colorDistFreq   15.3169
		detailScale     4425.79
		colorConversion true
		snowLevel       2
		tropicLatitude  0.637099
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.739026
		terraceProb     0.168069
		erosion         0
		montesMagn      0.504993
		montesFreq      2.78167
		montesSpiky     0.984092
		montesFraction  0.573962
		dunesFraction   0
		hillsMagn       0
		hillsFreq       72.1932
		hillsFraction   0.528844
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252972
		craterFreq      0.96096
		craterDensity   1.06277
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.382943
		volcanoTemp     1746.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.334, 0.307, 0.295, 0.000)
		colorShelf     (0.355, 0.326, 0.313, 0.000)
		colorBeach     (0.376, 0.345, 0.332, 0.000)
		colorDesert    (0.397, 0.364, 0.350, 0.000)
		colorLowland   (0.418, 0.383, 0.369, 0.000)
		colorUpland    (0.439, 0.402, 0.387, 0.000)
		colorRock      (0.460, 0.422, 0.405, 0.000)
		colorSnow      (0.481, 0.441, 0.424, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00521613
		Period          0.356524
		Eccentricity    0.0839846
		Inclination     52.5594
		AscendingNode   129.524
		ArgOfPericenter 65.7198
		MeanAnomaly     -57.9314
	}
}

DwarfMoon	"Foerost System 8.D10"
{
	ParentBody     "Foerost System 8"
	Class	       "Asteroid"

	Mass            1.44096e-006
	Radius          166.64
	InertiaMoment   0.39967

	RotationPeriod  6832.95
	Obliquity       -43.9521
	EqAscendNode    -138.001

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.635 0.604 0.550)

	Surface
	{
		SurfStyle       0.975127
		OceanStyle      0.514096
		Randomize      (0.655, 0.686, 0.939)
		colorDistMagn   0.879841
		colorDistFreq   17.6748
		detailScale     4550.39
		colorConversion true
		snowLevel       2
		tropicLatitude  0.481814
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.473958
		terraceProb     0.703659
		erosion         0
		montesMagn      0.408969
		montesFreq      2.61608
		montesSpiky     0.950014
		montesFraction  0.437707
		dunesFraction   0
		hillsMagn       0
		hillsFreq       71.7783
		hillsFraction   0.49816
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254125
		craterFreq      1.03222
		craterDensity   0.881064
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.461964
		volcanoTemp     1922.95
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.216, 0.212, 0.220, 0.050)
		colorShelf     (0.254, 0.248, 0.253, 0.040)
		colorBeach     (0.292, 0.284, 0.286, 0.030)
		colorDesert    (0.330, 0.320, 0.325, 0.020)
		colorLowland   (0.368, 0.357, 0.358, 0.030)
		colorUpland    (0.406, 0.393, 0.391, 0.050)
		colorRock      (0.444, 0.429, 0.435, 0.020)
		colorSnow      (0.444, 0.429, 0.435, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00553537
		Period          0.38975
		Eccentricity    0.160669
		Inclination     -43.9521
		AscendingNode   -138.001
		ArgOfPericenter -66.4897
		MeanAnomaly     -113.823
	}
}

DwarfMoon	"Foerost System 8.D11"
{
	ParentBody     "Foerost System 8"
	Class	       "Asteroid"

	Mass            2.12659e-006
	Radius          181.492
	InertiaMoment   0.397541

	Obliquity       38.6259
	EqAscendNode    26.4894
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.571 0.569 0.565)

	Surface
	{
		SurfStyle       0.13467
		OceanStyle      0.698935
		Randomize      (0.430, 0.067, 0.463)
		colorDistMagn   0.514408
		colorDistFreq   13.5684
		detailScale     4955.94
		colorConversion true
		snowLevel       2
		tropicLatitude  0.965183
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.552694
		terraceProb     0.497075
		erosion         0
		montesMagn      0.482084
		montesFreq      2.87475
		montesSpiky     0.995706
		montesFraction  0.556512
		dunesFraction   0
		hillsMagn       0
		hillsFreq       85.305
		hillsFraction   0.509732
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239737
		craterFreq      1.11193
		craterDensity   0.889666
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.543841
		volcanoTemp     1209.32
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.228, 0.227, 0.226, 0.000)
		colorShelf     (0.243, 0.242, 0.240, 0.000)
		colorBeach     (0.257, 0.256, 0.254, 0.000)
		colorDesert    (0.271, 0.270, 0.268, 0.000)
		colorLowland   (0.285, 0.284, 0.282, 0.000)
		colorUpland    (0.300, 0.298, 0.296, 0.000)
		colorRock      (0.314, 0.313, 0.310, 0.000)
		colorSnow      (0.328, 0.327, 0.325, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00619104
		Period          0.461011
		Eccentricity    0.0511368
		Inclination     38.6259
		AscendingNode   26.4894
		ArgOfPericenter 129.17
		MeanAnomaly     -15.8726
	}
}

Planet	"Foerost System 9"
{
	ParentBody     "Foerost System"
	Class	       "GasGiant"

	Mass            564.39
	Radius          75906.6
	InertiaMoment   0.298526

	Oblateness      0.0538548

	RotationPeriod  9.72622
	Obliquity       -15.9988
	EqAscendNode    84.4123

	AlbedoBond      0.45997
	AlbedoGeom      0.551965
	Brightness      2

	Surface
	{
		SurfStyle       0.856851
		Randomize      (-0.387, 0.967, 0.035)
		detailScale     195236
		colorConversion true
		tropicLatitude  0.274881
		icecapLatitude  1
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     5.83586
		stripeFluct     0.445485
		stripeTwist     13.2409
		cycloneMagn     16.455
		cycloneFreq     0.689297
		cycloneDensity  0.338692
		cycloneOctaves  5
		colorLayer0    (0.200, 0.260, 0.330, 1.100)
		colorLayer1    (0.250, 0.330, 0.450, 0.900)
		colorLayer2    (0.220, 0.380, 0.560, 0.600)
		colorLayer3    (0.260, 0.430, 0.530, 0.100)
		colorLayer4    (0.240, 0.430, 0.630, 0.000)
		colorLayer5    (0.240, 0.510, 0.780, 0.000)
		colorLayer6    (0.340, 0.580, 0.750, 0.000)
		colorLayer7    (1.000, 1.000, 1.000, 1.000)
		colorLowPlants (0.240, 0.430, 0.630, 0.000)
		colorUpPlants  (0.240, 0.510, 0.780, 0.000)
		BumpHeight      10.019
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          22.3047
		Velocity        686.328
		BumpHeight      12.2843
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.04004
		mainOctaves     12
		Coverage        0.0997045
		stripeZones     5.83586
		stripeFluct     0.445485
		stripeTwist     13.2409
	}

	Clouds
	{
		Height          34.5859
		Velocity        1198.2
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		ModulateColor  (1.000 1.000 1.000 0.800)
		mainFreq        1.04004
		mainOctaves     12
		Coverage        0.0997045
		stripeZones     5.83586
		stripeFluct     0.445485
		stripeTwist     13.2409
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          132.862
		Density         10519.7
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0084781
		Saturation      0.579396

		Composition
		{
			H2    	91.049
			He    	8.94706
			N2    	0.00258227
			Ne    	0.00133301
		}
	}

	Aurora
	{
		Height      4231.43
		NorthLat    84.3352
		NorthLon    44.8665
		NorthRadius 16513.4
		NorthWidth  8287.68
		NorthRings  2
		NorthBright 1
		NorthParticles 10000
		SouthLat    -85.8448
		SouthLon    233.528
		SouthRadius 22705.1
		SouthWidth  14677.9
		SouthRings  5
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
		SemiMajorAxis   2.50098
		Period          8.74641
		Eccentricity    0.0822763
		Inclination     1.05339
		AscendingNode   85.7748
		ArgOfPericenter 320.636
		MeanAnomaly     61.4841
	}
}

DwarfMoon	"Foerost System 9.D1"
{
	ParentBody     "Foerost System 9"
	Class	       "Asteroid"

	Mass            4.43868e-010
	Radius          10.5888
	InertiaMoment   0.394592

	Oblateness      0.249

	Obliquity       0.00289629
	EqAscendNode    -93.8328
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.606 0.601 0.595)

	Surface
	{
		SurfStyle       0.789101
		OceanStyle      0.0920089
		Randomize      (0.334, 0.263, -0.380)
		colorDistMagn   0.391631
		colorDistFreq   0.0528716
		detailScale     289.145
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.453293
		terraceProb     0.12179
		erosion         0
		montesMagn      0.595808
		montesFreq      3.27548
		montesSpiky     0.920039
		montesFraction  0.684453
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.278883
		hillsFraction   0.472677
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253194
		craterFreq      0.276345
		craterDensity   0.982539
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.444841
		volcanoTemp     1549.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.236, 0.204, 0.167, 0.000)
		colorShelf     (0.242, 0.210, 0.190, 0.000)
		colorBeach     (0.285, 0.246, 0.226, 0.000)
		colorDesert    (0.309, 0.264, 0.220, 0.000)
		colorLowland   (0.339, 0.282, 0.250, 0.000)
		colorUpland    (0.376, 0.342, 0.303, 0.000)
		colorRock      (0.406, 0.372, 0.327, 0.000)
		colorSnow      (0.442, 0.396, 0.345, 1.000)
		BumpHeight      9.52992
		BumpOffset      1.90598
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.001056
		Period          0.000835382
		Eccentricity    7.79887e-005
		Inclination     0.00289629
		AscendingNode   -93.8328
		ArgOfPericenter -73.5802
		MeanAnomaly     122.887
	}
}

DwarfMoon	"Foerost System 9.D2"
{
	ParentBody     "Foerost System 9"
	Class	       "Asteroid"

	Mass            6.56828e-010
	Radius          11.517
	InertiaMoment   0.398157

	Oblateness      0.249

	Obliquity       -0.00670475
	EqAscendNode    93.0847
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.685 0.600 0.549)

	Surface
	{
		SurfStyle       0.186414
		OceanStyle      0.596049
		Randomize      (-0.106, -0.844, -0.575)
		colorDistMagn   0.10986
		colorDistFreq   0.099914
		detailScale     314.492
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.635216
		terraceProb     0.582515
		erosion         0
		montesMagn      0.558557
		montesFreq      3.12944
		montesSpiky     0.941109
		montesFraction  0.814201
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.381815
		hillsFraction   0.608309
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243026
		craterFreq      0.272654
		craterDensity   0.873215
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.513497
		volcanoTemp     1417.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.274, 0.240, 0.219, 0.000)
		colorShelf     (0.291, 0.255, 0.233, 0.000)
		colorBeach     (0.308, 0.270, 0.247, 0.000)
		colorDesert    (0.325, 0.285, 0.261, 0.000)
		colorLowland   (0.342, 0.300, 0.274, 0.000)
		colorUpland    (0.359, 0.315, 0.288, 0.000)
		colorRock      (0.377, 0.330, 0.302, 0.000)
		colorSnow      (0.394, 0.345, 0.315, 1.000)
		BumpHeight      10.3653
		BumpOffset      2.07307
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00121017
		Period          0.00102485
		Eccentricity    2.2243e-005
		Inclination     -0.00670475
		AscendingNode   93.0846
		ArgOfPericenter 162.982
		MeanAnomaly     -26.8541
	}
}

DwarfMoon	"Foerost System 9.D3"
{
	ParentBody     "Foerost System 9"
	Class	       "Asteroid"

	Mass            9.55394e-010
	Radius          15.3156
	InertiaMoment   0.399248

	Oblateness      0.249

	Obliquity       -0.0129683
	EqAscendNode    -83.488
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.537 0.473 0.366)

	Surface
	{
		SurfStyle       0.564764
		OceanStyle      0.720817
		Randomize      (0.634, 0.925, -0.244)
		colorDistMagn   0.533769
		colorDistFreq   0.0798138
		detailScale     418.219
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.643155
		terraceProb     0.291214
		erosion         0
		montesMagn      0.585739
		montesFreq      2.75937
		montesSpiky     0.888443
		montesFraction  0.278241
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.650134
		hillsFraction   0.641514
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239248
		craterFreq      0.249617
		craterDensity   0.87316
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.526612
		volcanoTemp     1576.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.210, 0.161, 0.103, 0.000)
		colorShelf     (0.215, 0.166, 0.117, 0.000)
		colorBeach     (0.253, 0.194, 0.139, 0.000)
		colorDesert    (0.274, 0.208, 0.135, 0.000)
		colorLowland   (0.301, 0.223, 0.154, 0.000)
		colorUpland    (0.333, 0.270, 0.187, 0.000)
		colorRock      (0.360, 0.294, 0.201, 0.000)
		colorSnow      (0.392, 0.312, 0.212, 1.000)
		BumpHeight      13.7841
		BumpOffset      2.75681
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00125362
		Period          0.00108054
		Eccentricity    3.96891e-005
		Inclination     -0.0129683
		AscendingNode   -83.488
		ArgOfPericenter -165.233
		MeanAnomaly     -134.532
	}
}

DwarfMoon	"Foerost System 9.D4"
{
	ParentBody     "Foerost System 9"
	Class	       "Asteroid"

	Mass            1.36998e-009
	Radius          16.1628
	InertiaMoment   0.396189

	Oblateness      0.238362

	Obliquity       0.00409756
	EqAscendNode    17.0498
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.603 0.515 0.482)

	Surface
	{
		SurfStyle       0.0624774
		OceanStyle      0.34708
		Randomize      (-0.110, -0.558, -0.100)
		colorDistMagn   0.731671
		colorDistFreq   0.157069
		detailScale     441.351
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.498005
		terraceProb     0.191753
		erosion         0
		montesMagn      0.544731
		montesFreq      2.28399
		montesSpiky     0.881091
		montesFraction  0.384004
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.576833
		hillsFraction   0.44154
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228292
		craterFreq      0.232183
		craterDensity   0.907985
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.488315
		volcanoTemp     1376.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.241, 0.206, 0.193, 0.000)
		colorShelf     (0.256, 0.219, 0.205, 0.000)
		colorBeach     (0.271, 0.232, 0.217, 0.000)
		colorDesert    (0.287, 0.244, 0.229, 0.000)
		colorLowland   (0.302, 0.257, 0.241, 0.000)
		colorUpland    (0.317, 0.270, 0.253, 0.000)
		colorRock      (0.332, 0.283, 0.265, 0.000)
		colorSnow      (0.347, 0.296, 0.277, 1.000)
		BumpHeight      14.5465
		BumpOffset      2.9093
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00138795
		Period          0.00125878
		Eccentricity    4.9664e-005
		Inclination     0.00409756
		AscendingNode   17.0498
		ArgOfPericenter 86.508
		MeanAnomaly     -13.1173
	}
}

DwarfMoon	"Foerost System 9.D5"
{
	ParentBody     "Foerost System 9"
	Class	       "Asteroid"

	Mass            1.9412e-009
	Radius          17.4141
	InertiaMoment   0.39834

	Oblateness      0.184662

	Obliquity       1.19603
	EqAscendNode    -143.563
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.698 0.696 0.695)

	Surface
	{
		SurfStyle       0.00338431
		OceanStyle      0.497397
		Randomize      (-0.753, 0.885, -0.147)
		colorDistMagn   0.0821194
		colorDistFreq   0.125817
		detailScale     475.52
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0130515
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.610859
		terraceProb     0.300178
		erosion         0
		montesMagn      0.513179
		montesFreq      3.51944
		montesSpiky     0.850822
		montesFraction  0.734151
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.718421
		hillsFraction   0.498022
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237383
		craterFreq      0.26419
		craterDensity   0.961219
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.567034
		volcanoTemp     1272.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.279, 0.278, 0.278, 0.000)
		colorShelf     (0.297, 0.296, 0.295, 0.000)
		colorBeach     (0.314, 0.313, 0.313, 0.000)
		colorDesert    (0.332, 0.331, 0.330, 0.000)
		colorLowland   (0.349, 0.348, 0.347, 0.000)
		colorUpland    (0.367, 0.365, 0.365, 0.000)
		colorRock      (0.384, 0.383, 0.382, 0.000)
		colorSnow      (0.401, 0.400, 0.400, 1.000)
		BumpHeight      15.6726
		BumpOffset      3.13453
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00145354
		Period          0.00134906
		Eccentricity    0.0265179
		Inclination     1.19603
		AscendingNode   -143.563
		ArgOfPericenter 98.6073
		MeanAnomaly     -113.624
	}
}

Moon	"Foerost System 9.1"
{
	ParentBody     "Foerost System 9"
	Class	       "Selena"

	Mass            0.0108817
	Radius          1931.86
	InertiaMoment   0.375466

	Oblateness      0.00884225

	Obliquity       -0.76974
	EqAscendNode    -23.5295
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.560 0.554 0.550)

	Surface
	{
		SurfStyle       0.172667
		OceanStyle      0.125715
		Randomize      (-0.057, -0.265, 0.051)
		colorDistMagn   0.097405
		colorDistFreq   183.583
		detailScale     4968.85
		colorConversion true
		drivenDarkening 0
		seaLevel        0.109853
		snowLevel       2
		tropicLatitude  0.0263015
		icecapLatitude  0.633825
		icecapHeight    0.135903
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.95322
		venusFreq       0.85195
		venusMagn       0
		mareFreq        0.953065
		mareDensity     0.00185884
		terraceProb     0.141845
		erosion         0
		montesMagn      0.0840414
		montesFreq      90.6799
		montesSpiky     0.857632
		montesFraction  0.791189
		dunesMagn       0.0329552
		dunesFreq       2509.54
		dunesFraction   0.704419
		hillsMagn       0.128081
		hillsFreq       220.484
		hillsFraction   0.552094
		hills2Fraction  0
		riversMagn      68.0449
		riversFreq      2.5214
		riversSin       5.84776
		riversOctaves   0
		canyonsMagn     0.425589
		canyonsFreq     0.779612
		canyonFraction  0.806299
		cracksMagn      0.0465559
		cracksFreq      0.943602
		cracksOctaves   0
		craterMagn      0.670953
		craterFreq      5.95457
		craterDensity   0.500298
		craterOctaves   7.81661
		craterRayedFactor 0.104854
		volcanoMagn     0.252936
		volcanoFreq     0.740003
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.250342
		volcanoRadius   0.242954
		volcanoTemp     1314.62
		lavaCoverTidal  0.321554
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.320, 0.320, 0.000)
		colorShelf     (0.370, 0.370, 0.370, 0.000)
		colorBeach     (0.280, 0.277, 0.275, 0.000)
		colorDesert    (0.347, 0.332, 0.314, 0.200)
		colorLowland   (0.375, 0.354, 0.352, 0.500)
		colorUpland    (0.392, 0.371, 0.363, 0.800)
		colorRock      (0.650, 0.610, 0.620, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.995982
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
		Height          96.5929
		Density         0.000401812
		Pressure        0.000100153
		Greenhouse      0.0194445
		Bright          3.31745
		Opacity         0
		SkyLight        1.10582
		Hue             -0.0233645
		Saturation      1

		Composition
		{
			SO2   	99.9999
			Cl2   	3.66906e-005
			Kr    	1.30582e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00242941
		Period          0.002915
		Eccentricity    0.0198223
		Inclination     -0.76974
		AscendingNode   -23.5295
		ArgOfPericenter -48.3408
		MeanAnomaly     136.752
	}
}

Moon	"Foerost System 9.2"
{
	ParentBody     "Foerost System 9"
	Class	       "Desert"

	Mass            0.128142
	Radius          4037.39
	InertiaMoment   0.329589

	Oblateness      0.00123919

	Obliquity       -0.960027
	EqAscendNode    146.47
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.469 0.466 0.464)

	Surface
	{
		SurfStyle       0.631197
		OceanStyle      0.18778
		Randomize      (0.906, 0.896, 0.948)
		colorDistMagn   0.0484001
		colorDistFreq   490.91
		detailScale     10384.4
		colorConversion true
		seaLevel        0.146035
		snowLevel       2
		tropicLatitude  0.00966736
		icecapLatitude  0.736857
		icecapHeight    0.15457
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.927774
		venusFreq       1.1571
		venusMagn       0.497991
		mareFreq        1.55651
		mareDensity     0.0208261
		terraceProb     0.255839
		erosion         0
		montesMagn      0.231657
		montesFreq      193.948
		montesSpiky     0.911011
		montesFraction  0.365639
		dunesMagn       0.0750716
		dunesFreq       37.4235
		dunesFraction   0.737809
		hillsMagn       0.105662
		hillsFreq       445.697
		hillsFraction   0
		hills2Fraction  0
		riversMagn      62.5188
		riversFreq      4.17346
		riversSin       4.86228
		riversOctaves   0
		canyonsMagn     0.0492533
		canyonsFreq     111.875
		canyonFraction  0
		cracksMagn      0.104021
		cracksFreq      0.274049
		cracksOctaves   0
		craterMagn      0.554734
		craterFreq      9.01335
		craterDensity   0.312353
		craterOctaves   4.13572
		volcanoMagn     0.700981
		volcanoFreq     0.500666
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.444413
		volcanoRadius   0.500043
		volcanoTemp     1767.65
		lavaCoverTidal  0.423285
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
		Hapke           0.501528
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
		Height          73.5184
		Density         0.0498472
		Pressure        0.0213694
		Greenhouse      0.536219
		Bright          8.70018
		Opacity         1
		SkyLight        2.90006
		Hue             0
		Saturation      0.979883

		Composition
		{
			CO2   	82.2962
			C2H2  	9.49921
			NH3   	3.09592
			SO2   	1.84301
			H2S   	1.4056
			CH4   	1.31218
			C2H6  	0.438005
			C2H4  	0.0526072
			C3H8  	0.0217468
			N2    	0.0214644
			H2O   	0.0136145
			CO    	0.000383386
			Cl2   	2.54927e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00406047
		Period          0.00629803
		Eccentricity    0.0463426
		Inclination     -0.960027
		AscendingNode   146.47
		ArgOfPericenter -136.658
		MeanAnomaly     -36.13
	}
}

Moon	"Foerost System 9.3"
{
	ParentBody     "Foerost System 9"
	Class	       "IceWorld"

	Mass            0.0150149
	Radius          2146.65
	InertiaMoment   0.366991

	Obliquity       -0.0852354
	EqAscendNode    -73.4171
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.631 0.512 0.390)

	Surface
	{
		SurfStyle       0.780767
		OceanStyle      0.434186
		Randomize      (0.433, 0.917, -0.373)
		colorDistMagn   0.0553937
		colorDistFreq   247.902
		detailScale     5521.31
		colorConversion true
		drivenDarkening 0.7
		seaLevel        0.251711
		snowLevel       2
		tropicLatitude  0.00239208
		icecapLatitude  0.948219
		icecapHeight    0.254058
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.7813
		venusFreq       1.0323
		venusMagn       0
		mareFreq        1.08691
		mareDensity     0.00338238
		terraceProb     0.458826
		erosion         0
		montesMagn      0.118778
		montesFreq      112.25
		montesSpiky     0.755599
		montesFraction  0.150229
		dunesMagn       0.0338073
		dunesFreq       2798.99
		dunesFraction   0.348855
		hillsMagn       0.137973
		hillsFreq       234.786
		hillsFraction   0.111901
		hills2Fraction  0.103449
		riversMagn      55.6431
		riversFreq      2.7684
		riversSin       4.36272
		riversOctaves   0
		canyonsMagn     0.666023
		canyonsFreq     0.85049
		canyonFraction  0
		cracksMagn      0.0694396
		cracksFreq      0.619777
		cracksOctaves   2
		craterMagn      0.572538
		craterFreq      6.83424
		craterDensity   0.882951
		craterOctaves   11
		craterRayedFactor 0.243606
		volcanoMagn     0.381784
		volcanoFreq     0.90979
		volcanoDensity  0.14747
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.207339
		volcanoRadius   0.32725
		volcanoTemp     1447.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.404, 0.328, 0.261, 0.250)
		colorShelf     (0.442, 0.374, 0.297, 0.250)
		colorBeach     (0.360, 0.277, 0.226, 0.200)
		colorDesert    (0.334, 0.251, 0.199, 0.200)
		colorLowland   (0.246, 0.195, 0.164, 0.200)
		colorUpland    (0.467, 0.379, 0.297, 0.250)
		colorRock      (0.640, 0.630, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.246, 0.195, 0.164, 0.200)
		colorUpPlants  (0.467, 0.379, 0.297, 0.250)
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
		SemiMajorAxis   0.00678657
		Period          0.0136101
		Eccentricity    0.00147913
		Inclination     -0.0852354
		AscendingNode   -73.4171
		ArgOfPericenter -62.8992
		MeanAnomaly     -37.3775
	}
}

DwarfMoon	"Foerost System 9.D6"
{
	ParentBody     "Foerost System 9"
	Class	       "Asteroid"

	Mass            7.19544e-009
	Radius          27.1019
	InertiaMoment   0.39951

	Obliquity       -1.11538
	EqAscendNode    -57.9396
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.417 0.413 0.408)

	Surface
	{
		SurfStyle       0.0580435
		OceanStyle      0.108312
		Randomize      (-0.049, -0.302, 0.266)
		colorDistMagn   0.842825
		colorDistFreq   0.349075
		detailScale     740.061
		colorConversion true
		snowLevel       2
		tropicLatitude  0.034056
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.485489
		terraceProb     0.702405
		erosion         0
		montesMagn      0.469175
		montesFreq      3.35115
		montesSpiky     0.833724
		montesFraction  0.694633
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.68395
		hillsFraction   0.600271
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220979
		craterFreq      0.184738
		craterDensity   0.955016
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.575589
		volcanoTemp     1439.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.167, 0.165, 0.163, 0.000)
		colorShelf     (0.177, 0.175, 0.173, 0.000)
		colorBeach     (0.188, 0.186, 0.184, 0.000)
		colorDesert    (0.198, 0.196, 0.194, 0.000)
		colorLowland   (0.209, 0.206, 0.204, 0.000)
		colorUpland    (0.219, 0.217, 0.214, 0.000)
		colorRock      (0.229, 0.227, 0.225, 0.000)
		colorSnow      (0.240, 0.237, 0.235, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0113429
		Period          0.0294088
		Eccentricity    0.0319435
		Inclination     -1.11538
		AscendingNode   -57.9396
		ArgOfPericenter 125.753
		MeanAnomaly     -10.8411
	}
}

DwarfMoon	"Foerost System 9.D7"
{
	ParentBody     "Foerost System 9"
	Class	       "Asteroid"

	Mass            9.84387e-009
	Radius          28.842
	InertiaMoment   0.397165

	Obliquity       -59.1908
	EqAscendNode    -23.5323
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.662 0.656 0.654)

	Surface
	{
		SurfStyle       0.46601
		OceanStyle      0.287584
		Randomize      (0.583, -0.803, -0.144)
		colorDistMagn   0.945215
		colorDistFreq   0.329133
		detailScale     787.579
		colorConversion true
		snowLevel       2
		tropicLatitude  0.91028
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.288297
		terraceProb     0.30622
		erosion         0
		montesMagn      0.512377
		montesFreq      2.34758
		montesSpiky     0.839437
		montesFraction  0.68424
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.38465
		hillsFraction   0.642978
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.274318
		craterFreq      0.243363
		craterDensity   0.921408
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.502022
		volcanoTemp     1347.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.265, 0.262, 0.261, 0.000)
		colorShelf     (0.281, 0.279, 0.278, 0.000)
		colorBeach     (0.298, 0.295, 0.294, 0.000)
		colorDesert    (0.315, 0.312, 0.310, 0.000)
		colorLowland   (0.331, 0.328, 0.327, 0.000)
		colorUpland    (0.348, 0.344, 0.343, 0.000)
		colorRock      (0.364, 0.361, 0.360, 0.000)
		colorSnow      (0.381, 0.377, 0.376, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0644953
		Period          0.398732
		Eccentricity    0.0149221
		Inclination     -59.1908
		AscendingNode   -23.5323
		ArgOfPericenter 141.783
		MeanAnomaly     133.801
	}
}

DwarfMoon	"Foerost System 9.D8"
{
	ParentBody     "Foerost System 9"
	Class	       "Asteroid"

	Mass            1.34211e-008
	Radius          38.6809
	InertiaMoment   0.398671

	Obliquity       81.2874
	EqAscendNode    81.1716
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.600 0.595 0.590)

	Surface
	{
		SurfStyle       0.584541
		OceanStyle      0.946283
		Randomize      (0.243, -0.346, -0.846)
		colorDistMagn   0.0739388
		colorDistFreq   1.07131
		detailScale     1056.25
		colorConversion true
		snowLevel       2
		tropicLatitude  0.991902
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.647392
		terraceProb     0.201956
		erosion         0
		montesMagn      0.317222
		montesFreq      3.55394
		montesSpiky     0.990481
		montesFraction  0.267701
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.10453
		hillsFraction   0.727866
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.26682
		craterFreq      0.277433
		craterDensity   1.03663
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.483826
		volcanoTemp     1366.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.234, 0.202, 0.165, 0.000)
		colorShelf     (0.240, 0.208, 0.189, 0.000)
		colorBeach     (0.282, 0.244, 0.224, 0.000)
		colorDesert    (0.306, 0.262, 0.218, 0.000)
		colorLowland   (0.336, 0.280, 0.248, 0.000)
		colorUpland    (0.372, 0.339, 0.301, 0.000)
		colorRock      (0.402, 0.369, 0.325, 0.000)
		colorSnow      (0.438, 0.393, 0.342, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0650333
		Period          0.403732
		Eccentricity    0.00579953
		Inclination     81.2874
		AscendingNode   81.1716
		ArgOfPericenter -48.8086
		MeanAnomaly     -145.101
	}
}

DwarfMoon	"Foerost System 9.D9"
{
	ParentBody     "Foerost System 9"
	Class	       "Asteroid"

	Mass            1.82531e-008
	Radius          38.8609
	InertiaMoment   0.399638

	Obliquity       -32.7846
	EqAscendNode    122.068
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.753 0.750 0.749)

	Surface
	{
		SurfStyle       0.727837
		OceanStyle      0.046866
		Randomize      (0.007, 0.712, 0.346)
		colorDistMagn   0.312735
		colorDistFreq   1.08204
		detailScale     1061.16
		colorConversion true
		snowLevel       2
		tropicLatitude  0.506114
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.632696
		terraceProb     0.481826
		erosion         0
		montesMagn      0.43048
		montesFreq      3.77066
		montesSpiky     0.749303
		montesFraction  0.478044
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.17524
		hillsFraction   0.701443
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.209587
		craterFreq      0.194538
		craterDensity   0.810479
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.465724
		volcanoTemp     1530.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.294, 0.255, 0.210, 0.000)
		colorShelf     (0.301, 0.262, 0.240, 0.000)
		colorBeach     (0.354, 0.307, 0.284, 0.000)
		colorDesert    (0.384, 0.330, 0.277, 0.000)
		colorLowland   (0.422, 0.352, 0.314, 0.000)
		colorUpland    (0.467, 0.427, 0.382, 0.000)
		colorRock      (0.504, 0.465, 0.412, 0.000)
		colorSnow      (0.550, 0.495, 0.434, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0653035
		Period          0.406251
		Eccentricity    0.26878
		Inclination     -32.7846
		AscendingNode   122.068
		ArgOfPericenter 154.71
		MeanAnomaly     -27.6546
	}
}

DwarfMoon	"Foerost System 9.D10"
{
	ParentBody     "Foerost System 9"
	Class	       "Asteroid"

	Mass            2.47861e-008
	Radius          41.1618
	InertiaMoment   0.397472

	RotationPeriod  18005
	Obliquity       -68.4062
	EqAscendNode    47.5465

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.659 0.581 0.452)

	Surface
	{
		SurfStyle       0.173339
		OceanStyle      0.369876
		Randomize      (-0.715, -0.774, 0.615)
		colorDistMagn   0.282922
		colorDistFreq   0.633683
		detailScale     1123.99
		colorConversion true
		snowLevel       2
		tropicLatitude  0.893969
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.737624
		terraceProb     0.224811
		erosion         0
		montesMagn      0.518948
		montesFreq      3.12752
		montesSpiky     0.885264
		montesFraction  0.547922
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.74527
		hillsFraction   0.789328
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245198
		craterFreq      0.228371
		craterDensity   0.880781
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.45714
		volcanoTemp     1586.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.264, 0.232, 0.181, 0.000)
		colorShelf     (0.280, 0.247, 0.192, 0.000)
		colorBeach     (0.297, 0.261, 0.203, 0.000)
		colorDesert    (0.313, 0.276, 0.215, 0.000)
		colorLowland   (0.330, 0.291, 0.226, 0.000)
		colorUpland    (0.346, 0.305, 0.237, 0.000)
		colorRock      (0.363, 0.320, 0.249, 0.000)
		colorSnow      (0.379, 0.334, 0.260, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.06579
		Period          0.410799
		Eccentricity    0.244502
		Inclination     -68.4062
		AscendingNode   47.5465
		ArgOfPericenter 42.9273
		MeanAnomaly     101.532
	}
}

DwarfMoon	"Foerost System 9.D11"
{
	ParentBody     "Foerost System 9"
	Class	       "Asteroid"

	Mass            3.36342e-008
	Radius          43.7354
	InertiaMoment   0.398823

	RotationPeriod  7281.74
	Obliquity       -64.0292
	EqAscendNode    -152.234

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.725 0.640 0.564)

	Surface
	{
		SurfStyle       0.32129
		OceanStyle      0.77513
		Randomize      (-0.941, 0.882, 0.351)
		colorDistMagn   0.568649
		colorDistFreq   1.58536
		detailScale     1194.27
		colorConversion true
		snowLevel       2
		tropicLatitude  0.421259
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.673475
		terraceProb     0.108378
		erosion         0
		montesMagn      0.270045
		montesFreq      2.46138
		montesSpiky     0.916099
		montesFraction  0.545892
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.47164
		hillsFraction   0.812659
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23807
		craterFreq      0.269817
		craterDensity   0.893477
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.586011
		volcanoTemp     1393.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.290, 0.256, 0.225, 0.000)
		colorShelf     (0.308, 0.272, 0.240, 0.000)
		colorBeach     (0.326, 0.288, 0.254, 0.000)
		colorDesert    (0.345, 0.304, 0.268, 0.000)
		colorLowland   (0.363, 0.320, 0.282, 0.000)
		colorUpland    (0.381, 0.336, 0.296, 0.000)
		colorRock      (0.399, 0.352, 0.310, 0.000)
		colorSnow      (0.417, 0.368, 0.324, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0662748
		Period          0.415349
		Eccentricity    0.194461
		Inclination     -64.0292
		AscendingNode   -152.234
		ArgOfPericenter 43.051
		MeanAnomaly     115.011
	}
}

DwarfMoon	"Foerost System 9.D12"
{
	ParentBody     "Foerost System 9"
	Class	       "Asteroid"

	Mass            4.56489e-008
	Radius          62.1541
	InertiaMoment   0.399764

	Obliquity       -21.4242
	EqAscendNode    173.278
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.652 0.528 0.441)

	Surface
	{
		SurfStyle       0.731958
		OceanStyle      0.233797
		Randomize      (-0.566, -0.797, 0.366)
		colorDistMagn   0.454373
		colorDistFreq   1.49896
		detailScale     1697.22
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0428214
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.367209
		terraceProb     0.110845
		erosion         0
		montesMagn      0.52973
		montesFreq      3.36851
		montesSpiky     0.877002
		montesFraction  0.6487
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.52779
		hillsFraction   0.632459
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.195551
		craterFreq      0.207971
		craterDensity   1.00572
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.588889
		volcanoTemp     1567.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.254, 0.180, 0.123, 0.000)
		colorShelf     (0.261, 0.185, 0.141, 0.000)
		colorBeach     (0.307, 0.217, 0.167, 0.000)
		colorDesert    (0.333, 0.232, 0.163, 0.000)
		colorLowland   (0.365, 0.248, 0.185, 0.000)
		colorUpland    (0.404, 0.301, 0.225, 0.000)
		colorRock      (0.437, 0.327, 0.242, 0.000)
		colorSnow      (0.476, 0.349, 0.256, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0665474
		Period          0.417914
		Eccentricity    0.429874
		Inclination     -21.4242
		AscendingNode   173.278
		ArgOfPericenter 162.822
		MeanAnomaly     70.7435
	}
}

DwarfMoon	"Foerost System 9.D13"
{
	ParentBody     "Foerost System 9"
	Class	       "Asteroid"

	Mass            6.20198e-008
	Radius          58.8845
	InertiaMoment   0.397728

	RotationPeriod  11079.3
	Obliquity       19.135
	EqAscendNode    7.37965

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.471 0.467 0.462)

	Surface
	{
		SurfStyle       0.49272
		OceanStyle      0.918462
		Randomize      (-0.720, -0.079, -0.070)
		colorDistMagn   0.387681
		colorDistFreq   2.37647
		detailScale     1607.94
		colorConversion true
		snowLevel       2
		tropicLatitude  0.618238
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.413951
		terraceProb     0.540797
		erosion         0
		montesMagn      0.613959
		montesFreq      3.18317
		montesSpiky     0.98983
		montesFraction  0.781483
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.47896
		hillsFraction   0.626542
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239269
		craterFreq      0.210189
		craterDensity   0.914439
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.460986
		volcanoTemp     1678.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.189, 0.187, 0.185, 0.000)
		colorShelf     (0.200, 0.198, 0.196, 0.000)
		colorBeach     (0.212, 0.210, 0.208, 0.000)
		colorDesert    (0.224, 0.222, 0.219, 0.000)
		colorLowland   (0.236, 0.233, 0.231, 0.000)
		colorUpland    (0.248, 0.245, 0.242, 0.000)
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
		SemiMajorAxis   0.066907
		Period          0.421306
		Eccentricity    0.488393
		Inclination     19.135
		AscendingNode   7.37965
		ArgOfPericenter -148.843
		MeanAnomaly     133.984
	}
}

DwarfMoon	"Foerost System 9.D14"
{
	ParentBody     "Foerost System 9"
	Class	       "Asteroid"

	Mass            8.44236e-008
	Radius          62.2851
	InertiaMoment   0.398968

	Obliquity       -67.26
	EqAscendNode    -166.792
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.782 0.736 0.688)

	Surface
	{
		SurfStyle       0.576945
		OceanStyle      0.0351713
		Randomize      (0.931, 0.736, -0.627)
		colorDistMagn   0.615458
		colorDistFreq   0.50698
		detailScale     1700.8
		colorConversion true
		snowLevel       2
		tropicLatitude  0.210937
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.411364
		terraceProb     0.167184
		erosion         0
		montesMagn      0.523654
		montesFreq      2.7682
		montesSpiky     0.884019
		montesFraction  0.697602
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.77142
		hillsFraction   0.810794
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.274891
		craterFreq      0.160446
		craterDensity   0.989767
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.460741
		volcanoTemp     1362.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.305, 0.250, 0.193, 0.000)
		colorShelf     (0.313, 0.258, 0.220, 0.000)
		colorBeach     (0.367, 0.302, 0.261, 0.000)
		colorDesert    (0.399, 0.324, 0.254, 0.000)
		colorLowland   (0.438, 0.346, 0.289, 0.000)
		colorUpland    (0.485, 0.419, 0.351, 0.000)
		colorRock      (0.524, 0.456, 0.378, 0.000)
		colorSnow      (0.571, 0.486, 0.399, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0672882
		Period          0.424911
		Eccentricity    0.400314
		Inclination     -67.26
		AscendingNode   -166.792
		ArgOfPericenter 22.9385
		MeanAnomaly     98.3621
	}
}

DwarfMoon	"Foerost System 9.D15"
{
	ParentBody     "Foerost System 9"
	Class	       "Asteroid"

	Mass            1.15248e-007
	Radius          66.3548
	InertiaMoment   0.399889

	Obliquity       -33.81
	EqAscendNode    -64.241
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.676 0.673 0.668)

	Surface
	{
		SurfStyle       0.203841
		OceanStyle      0.991562
		Randomize      (-0.915, -0.954, -0.709)
		colorDistMagn   0.81154
		colorDistFreq   1.94341
		detailScale     1811.93
		colorConversion true
		snowLevel       2
		tropicLatitude  0.831307
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.290288
		terraceProb     0.230742
		erosion         0
		montesMagn      0.587553
		montesFreq      2.74936
		montesSpiky     0.928698
		montesFraction  0.474549
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.91794
		hillsFraction   0.546709
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.216639
		craterFreq      0.217844
		craterDensity   0.747983
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.5367
		volcanoTemp     1357.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.270, 0.269, 0.267, 0.000)
		colorShelf     (0.287, 0.286, 0.284, 0.000)
		colorBeach     (0.304, 0.303, 0.301, 0.000)
		colorDesert    (0.321, 0.319, 0.317, 0.000)
		colorLowland   (0.338, 0.336, 0.334, 0.000)
		colorUpland    (0.355, 0.353, 0.351, 0.000)
		colorRock      (0.372, 0.370, 0.368, 0.000)
		colorSnow      (0.389, 0.387, 0.384, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0678237
		Period          0.429993
		Eccentricity    0.131517
		Inclination     -33.81
		AscendingNode   -64.241
		ArgOfPericenter 106.818
		MeanAnomaly     97.1391
	}
}

DwarfMoon	"Foerost System 9.D16"
{
	ParentBody     "Foerost System 9"
	Class	       "Asteroid"

	Mass            1.57931e-007
	Radius          68.6291
	InertiaMoment   0.397952

	Obliquity       -9.07313
	EqAscendNode    -43.7599
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.521 0.516 0.513)

	Surface
	{
		SurfStyle       0.492181
		OceanStyle      0.276004
		Randomize      (-0.075, 0.149, -0.151)
		colorDistMagn   0.731127
		colorDistFreq   2.75511
		detailScale     1874.03
		colorConversion true
		snowLevel       2
		tropicLatitude  0.289521
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.478399
		terraceProb     0.121501
		erosion         0
		montesMagn      0.543688
		montesFreq      2.45349
		montesSpiky     0.844436
		montesFraction  0.546323
		dunesFraction   0
		hillsMagn       0
		hillsFreq       13.4646
		hillsFraction   0.592933
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.275711
		craterFreq      0.262616
		craterDensity   0.933609
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.491048
		volcanoTemp     1678.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.209, 0.206, 0.205, 0.000)
		colorShelf     (0.222, 0.219, 0.218, 0.000)
		colorBeach     (0.235, 0.232, 0.231, 0.000)
		colorDesert    (0.248, 0.245, 0.244, 0.000)
		colorLowland   (0.261, 0.258, 0.257, 0.000)
		colorUpland    (0.274, 0.271, 0.269, 0.000)
		colorRock      (0.287, 0.284, 0.282, 0.000)
		colorSnow      (0.300, 0.297, 0.295, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0680942
		Period          0.432569
		Eccentricity    0.0961391
		Inclination     -9.07313
		AscendingNode   -43.7599
		ArgOfPericenter 91.8942
		MeanAnomaly     -127.682
	}
}

DwarfMoon	"Foerost System 9.D17"
{
	ParentBody     "Foerost System 9"
	Class	       "Asteroid"

	Mass            2.17485e-007
	Radius          90.2415
	InertiaMoment   0.399109

	RotationPeriod  6412.55
	Obliquity       21.069
	EqAscendNode    -111.053

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.667 0.664 0.662)

	Surface
	{
		SurfStyle       0.71813
		OceanStyle      0.0281495
		Randomize      (0.721, -0.406, 0.892)
		colorDistMagn   0.509129
		colorDistFreq   2.31082
		detailScale     2464.19
		colorConversion true
		snowLevel       2
		tropicLatitude  0.398447
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.533686
		terraceProb     0.213627
		erosion         0
		montesMagn      0.59103
		montesFreq      3.2277
		montesSpiky     0.920392
		montesFraction  0.491152
		dunesFraction   0
		hillsMagn       0
		hillsFreq       17.9758
		hillsFraction   0.61262
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213277
		craterFreq      0.28458
		craterDensity   0.985105
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.477972
		volcanoTemp     1201.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.260, 0.226, 0.185, 0.000)
		colorShelf     (0.267, 0.232, 0.212, 0.000)
		colorBeach     (0.314, 0.272, 0.252, 0.000)
		colorDesert    (0.340, 0.292, 0.245, 0.000)
		colorLowland   (0.374, 0.312, 0.278, 0.000)
		colorUpland    (0.414, 0.378, 0.338, 0.000)
		colorRock      (0.447, 0.411, 0.364, 0.000)
		colorSnow      (0.487, 0.438, 0.384, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0687596
		Period          0.438925
		Eccentricity    0.108011
		Inclination     21.069
		AscendingNode   -111.053
		ArgOfPericenter -99.2973
		MeanAnomaly     -4.39142
	}
}

DwarfMoon	"Foerost System 9.D18"
{
	ParentBody     "Foerost System 9"
	Class	       "Asteroid"

	Mass            3.0132e-007
	Radius          95.7394
	InertiaMoment   0.394479

	RotationPeriod  6483.81
	Obliquity       26.9084
	EqAscendNode    35.9362

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.639 0.636 0.634)

	Surface
	{
		SurfStyle       0.717436
		OceanStyle      0.661117
		Randomize      (0.504, 0.428, -0.799)
		colorDistMagn   0.453388
		colorDistFreq   4.19695
		detailScale     2614.32
		colorConversion true
		snowLevel       2
		tropicLatitude  0.77712
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.697536
		terraceProb     0.142672
		erosion         0
		montesMagn      0.607635
		montesFreq      1.96002
		montesSpiky     0.897709
		montesFraction  0.404816
		dunesFraction   0
		hillsMagn       0
		hillsFreq       15.8266
		hillsFraction   0.484522
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223846
		craterFreq      0.367513
		craterDensity   0.867309
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.424186
		volcanoTemp     1603.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.249, 0.216, 0.177, 0.000)
		colorShelf     (0.255, 0.223, 0.203, 0.000)
		colorBeach     (0.300, 0.261, 0.241, 0.000)
		colorDesert    (0.326, 0.280, 0.234, 0.000)
		colorLowland   (0.358, 0.299, 0.266, 0.000)
		colorUpland    (0.396, 0.363, 0.323, 0.000)
		colorRock      (0.428, 0.394, 0.348, 0.000)
		colorSnow      (0.466, 0.420, 0.367, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.069268
		Period          0.443802
		Eccentricity    0.493714
		Inclination     26.9084
		AscendingNode   35.9362
		ArgOfPericenter -52.4149
		MeanAnomaly     -170.95
	}
}

DwarfMoon	"Foerost System 9.D19"
{
	ParentBody     "Foerost System 9"
	Class	       "Asteroid"

	Mass            4.20574e-007
	Radius          102.779
	InertiaMoment   0.398153

	RotationPeriod  6562.76
	Obliquity       -21.8501
	EqAscendNode    -96.2459

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.725 0.723 0.720)

	Surface
	{
		SurfStyle       0.757564
		OceanStyle      0.84408
		Randomize      (-0.320, 0.709, 0.937)
		colorDistMagn   0.72407
		colorDistFreq   1.48637
		detailScale     2806.55
		colorConversion true
		snowLevel       2
		tropicLatitude  0.481307
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.604289
		terraceProb     0.193063
		erosion         0
		montesMagn      0.550894
		montesFreq      3.68781
		montesSpiky     0.884764
		montesFraction  0.677627
		dunesFraction   0
		hillsMagn       0
		hillsFreq       19.1364
		hillsFraction   0.408228
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229754
		craterFreq      0.36673
		craterDensity   0.854457
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.462216
		volcanoTemp     1307.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.283, 0.246, 0.202, 0.000)
		colorShelf     (0.290, 0.253, 0.231, 0.000)
		colorBeach     (0.341, 0.296, 0.274, 0.000)
		colorDesert    (0.370, 0.318, 0.267, 0.000)
		colorLowland   (0.406, 0.340, 0.303, 0.000)
		colorUpland    (0.450, 0.412, 0.367, 0.000)
		colorRock      (0.486, 0.448, 0.396, 0.000)
		colorSnow      (0.530, 0.477, 0.418, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0698292
		Period          0.449206
		Eccentricity    0.357629
		Inclination     -21.8501
		AscendingNode   -96.2459
		ArgOfPericenter 158.471
		MeanAnomaly     -11.5925
	}
}

DwarfMoon	"Foerost System 9.D20"
{
	ParentBody     "Foerost System 9"
	Class	       "Asteroid"

	Mass            5.92286e-007
	Radius          108.763
	InertiaMoment   0.399245

	RotationPeriod  9970.81
	Obliquity       45.6987
	EqAscendNode    -24.8319

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.736 0.733 0.728)

	Surface
	{
		SurfStyle       0.755972
		OceanStyle      0.873361
		Randomize      (-0.290, 0.798, -0.369)
		colorDistMagn   0.563242
		colorDistFreq   5.09338
		detailScale     2969.97
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999736
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.320547
		terraceProb     0.573803
		erosion         0
		montesMagn      0.565839
		montesFreq      2.6494
		montesSpiky     0.823771
		montesFraction  0.606618
		dunesFraction   0
		hillsMagn       0
		hillsFreq       23.3212
		hillsFraction   0.856666
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218985
		craterFreq      0.510626
		craterDensity   0.943996
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.5091
		volcanoTemp     1290.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.287, 0.249, 0.204, 0.000)
		colorShelf     (0.294, 0.256, 0.233, 0.000)
		colorBeach     (0.346, 0.300, 0.277, 0.000)
		colorDesert    (0.375, 0.322, 0.270, 0.000)
		colorLowland   (0.412, 0.344, 0.306, 0.000)
		colorUpland    (0.456, 0.418, 0.372, 0.000)
		colorRock      (0.493, 0.454, 0.401, 0.000)
		colorSnow      (0.537, 0.484, 0.423, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.070427
		Period          0.454986
		Eccentricity    0.370988
		Inclination     45.6987
		AscendingNode   -24.8319
		ArgOfPericenter 6.55009
		MeanAnomaly     100.597
	}
}

DwarfMoon	"Foerost System 9.D21"
{
	ParentBody     "Foerost System 9"
	Class	       "Asteroid"

	Mass            8.43078e-007
	Radius          143.153
	InertiaMoment   0.396172

	Obliquity       -76.4548
	EqAscendNode    -14.5343
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.709 0.682 0.645)

	Surface
	{
		SurfStyle       0.70978
		OceanStyle      0.791981
		Randomize      (-0.941, -0.792, 0.927)
		colorDistMagn   0.977261
		colorDistFreq   8.61469
		detailScale     3909.04
		colorConversion true
		snowLevel       2
		tropicLatitude  0.510224
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.54172
		terraceProb     0.300647
		erosion         0
		montesMagn      0.388343
		montesFreq      2.99827
		montesSpiky     0.856642
		montesFraction  0.895573
		dunesFraction   0
		hillsMagn       0
		hillsFreq       46.9773
		hillsFraction   0.799196
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238111
		craterFreq      0.65461
		craterDensity   1.07911
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.527444
		volcanoTemp     1577.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.277, 0.232, 0.180, 0.000)
		colorShelf     (0.284, 0.239, 0.206, 0.000)
		colorBeach     (0.333, 0.279, 0.245, 0.000)
		colorDesert    (0.362, 0.300, 0.238, 0.000)
		colorLowland   (0.397, 0.320, 0.271, 0.000)
		colorUpland    (0.440, 0.389, 0.329, 0.000)
		colorRock      (0.475, 0.423, 0.354, 0.000)
		colorSnow      (0.518, 0.450, 0.374, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0710629
		Period          0.461163
		Eccentricity    0.193924
		Inclination     -76.4548
		AscendingNode   -14.5343
		ArgOfPericenter 62.7217
		MeanAnomaly     138.098
	}
}

DwarfMoon	"Foerost System 9.D22"
{
	ParentBody     "Foerost System 9"
	Class	       "Asteroid"

	Mass            1.21554e-006
	Radius          153.317
	InertiaMoment   0.398336

	Obliquity       -60.611
	EqAscendNode    39.1738
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.790 0.738 0.662)

	Surface
	{
		SurfStyle       0.402686
		OceanStyle      0.832984
		Randomize      (0.277, 0.189, -0.945)
		colorDistMagn   0.904068
		colorDistFreq   16.1283
		detailScale     4186.58
		colorConversion true
		snowLevel       2
		tropicLatitude  0.937599
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.579178
		terraceProb     0.10816
		erosion         0
		montesMagn      0.391406
		montesFreq      3.20359
		montesSpiky     0.93032
		montesFraction  0.38638
		dunesFraction   0
		hillsMagn       0
		hillsFreq       56.4742
		hillsFraction   0.558988
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244024
		craterFreq      0.660168
		craterDensity   0.859994
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.54892
		volcanoTemp     1479.95
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.316, 0.295, 0.265, 0.000)
		colorShelf     (0.336, 0.314, 0.281, 0.000)
		colorBeach     (0.355, 0.332, 0.298, 0.000)
		colorDesert    (0.375, 0.351, 0.315, 0.000)
		colorLowland   (0.395, 0.369, 0.331, 0.000)
		colorUpland    (0.415, 0.387, 0.348, 0.000)
		colorRock      (0.434, 0.406, 0.364, 0.000)
		colorSnow      (0.454, 0.424, 0.381, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0716643
		Period          0.467029
		Eccentricity    0.245405
		Inclination     -60.611
		AscendingNode   39.1738
		ArgOfPericenter -143.551
		MeanAnomaly     91.3879
	}
}

DwarfMoon	"Foerost System 9.D23"
{
	ParentBody     "Foerost System 9"
	Class	       "Asteroid"

	Mass            1.77971e-006
	Radius          167.217
	InertiaMoment   0.399377

	RotationPeriod  8264.17
	Obliquity       -14.621
	EqAscendNode    -53.2836

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.523 0.370 0.285)

	Surface
	{
		SurfStyle       0.812062
		OceanStyle      0.988014
		Randomize      (0.025, -0.720, -0.235)
		colorDistMagn   0.811312
		colorDistFreq   16.3167
		detailScale     4566.13
		colorConversion true
		snowLevel       2
		tropicLatitude  0.43961
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.577529
		terraceProb     0.280999
		erosion         0
		montesMagn      0.647757
		montesFreq      2.73121
		montesSpiky     0.862214
		montesFraction  0.804149
		dunesFraction   0
		hillsMagn       0
		hillsFreq       57.4012
		hillsFraction   0.68724
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260112
		craterFreq      0.980057
		craterDensity   0.810673
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.510626
		volcanoTemp     1469.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.204, 0.126, 0.080, 0.000)
		colorShelf     (0.209, 0.130, 0.091, 0.000)
		colorBeach     (0.246, 0.152, 0.108, 0.000)
		colorDesert    (0.267, 0.163, 0.105, 0.000)
		colorLowland   (0.293, 0.174, 0.120, 0.000)
		colorUpland    (0.324, 0.211, 0.145, 0.000)
		colorRock      (0.350, 0.229, 0.157, 0.000)
		colorSnow      (0.382, 0.244, 0.165, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0721093
		Period          0.471386
		Eccentricity    0.264272
		Inclination     -14.621
		AscendingNode   -53.2836
		ArgOfPericenter 94.5201
		MeanAnomaly     -23.8913
	}
}

DwarfMoon	"Foerost System 9.D24"
{
	ParentBody     "Foerost System 9"
	Class	       "Asteroid"

	Mass            2.65455e-006
	Radius          181.589
	InertiaMoment   0.396762

	RotationPeriod  16733.4
	Obliquity       -9.97278
	EqAscendNode    17.4819

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.591 0.587 0.580)

	Surface
	{
		SurfStyle       0.352279
		OceanStyle      0.302098
		Randomize      (0.013, -0.983, 0.497)
		colorDistMagn   0.435504
		colorDistFreq   14.9529
		detailScale     4958.58
		colorConversion true
		snowLevel       2
		tropicLatitude  0.337285
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.631566
		terraceProb     0.434411
		erosion         0
		montesMagn      0.611742
		montesFreq      3.4385
		montesSpiky     0.992679
		montesFraction  0.317702
		dunesFraction   0
		hillsMagn       0
		hillsFreq       112.995
		hillsFraction   0.759129
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238107
		craterFreq      0.923998
		craterDensity   0.797571
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.5841
		volcanoTemp     1459.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.236, 0.235, 0.232, 0.000)
		colorShelf     (0.251, 0.250, 0.247, 0.000)
		colorBeach     (0.266, 0.264, 0.261, 0.000)
		colorDesert    (0.281, 0.279, 0.276, 0.000)
		colorLowland   (0.296, 0.294, 0.290, 0.000)
		colorUpland    (0.310, 0.308, 0.305, 0.000)
		colorRock      (0.325, 0.323, 0.319, 0.000)
		colorSnow      (0.340, 0.338, 0.334, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0727044
		Period          0.477234
		Eccentricity    0.317252
		Inclination     -9.97278
		AscendingNode   17.4819
		ArgOfPericenter 164.054
		MeanAnomaly     -95.925
	}
}

Moon	"Foerost System 9.4"
{
	ParentBody     "Foerost System 9"
	Class	       "IceWorld"

	Mass            4.05001e-006
	Radius          244.303
	InertiaMoment   0.398507

	Obliquity       -38.5922
	EqAscendNode    -15.4492
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.722 0.677 0.643)

	Surface
	{
		SurfStyle       0.723889
		OceanStyle      0.800924
		Randomize      (-0.966, -0.297, 0.152)
		colorDistMagn   0.0490855
		colorDistFreq   29.0082
		detailScale     628.361
		colorConversion true
		drivenDarkening 0.0970096
		seaLevel        0.158916
		snowLevel       2
		tropicLatitude  0.971784
		icecapLatitude  1
		icecapHeight    0.158916
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.72496
		venusFreq       1.2428
		venusMagn       0
		mareFreq        0
		mareDensity     1.14965e-006
		terraceProb     0.429564
		erosion         0
		montesMagn      0.0515988
		montesFreq      9.83587
		montesSpiky     0.916853
		montesFraction  0.531967
		dunesMagn       0.0245231
		dunesFreq       327.854
		dunesFraction   0.772904
		hillsMagn       0.12885
		hillsFreq       28.8762
		hillsFraction   0.384504
		hills2Fraction  0.0391758
		riversMagn      61.5285
		riversFreq      2.61699
		riversSin       5.85275
		riversOctaves   0
		canyonsMagn     0.533525
		canyonsFreq     0.0733417
		canyonFraction  0
		cracksMagn      0.0623941
		cracksFreq      0.0701131
		cracksOctaves   0
		craterMagn      1.0186
		craterFreq      0.933021
		craterDensity   0.839121
		craterOctaves   8
		craterRayedFactor 0.188418
		volcanoMagn     0.182448
		volcanoFreq     0.67183
		volcanoDensity  0.202847
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.137344
		volcanoRadius   0.12935
		volcanoTemp     1605.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.462, 0.433, 0.431, 0.250)
		colorShelf     (0.505, 0.494, 0.489, 0.250)
		colorBeach     (0.411, 0.365, 0.373, 0.200)
		colorDesert    (0.383, 0.332, 0.328, 0.200)
		colorLowland   (0.281, 0.257, 0.270, 0.200)
		colorUpland    (0.534, 0.501, 0.489, 0.250)
		colorRock      (0.640, 0.630, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.281, 0.257, 0.270, 0.200)
		colorUpPlants  (0.534, 0.501, 0.489, 0.250)
		BumpHeight      12.2151
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
		SemiMajorAxis   0.0732263
		Period          0.482382
		Eccentricity    0.437407
		Inclination     -38.5922
		AscendingNode   -15.4492
		ArgOfPericenter 117.247
		MeanAnomaly     75.3601
	}
}

DwarfMoon	"Foerost System 9.D25"
{
	ParentBody     "Foerost System 9"
	Class	       "Asteroid"

	Mass            1.01228e-011
	Radius          3.12688
	InertiaMoment   0.399507

	Obliquity       33.0173
	EqAscendNode    151.429
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.535 0.530 0.526)

	Surface
	{
		SurfStyle       0.181552
		OceanStyle      0.609224
		Randomize      (0.820, -0.921, 0.303)
		colorDistMagn   0.173438
		colorDistFreq   0.00602702
		detailScale     85.3847
		colorConversion true
		snowLevel       2
		tropicLatitude  0.26647
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.674101
		terraceProb     0.242028
		erosion         0
		montesMagn      0.487019
		montesFreq      3.22852
		montesSpiky     0.978102
		montesFraction  0.443236
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.021615
		hillsFraction   0.512648
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228581
		craterFreq      0.171358
		craterDensity   0.708772
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.531539
		volcanoTemp     1309.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.214, 0.212, 0.210, 0.000)
		colorShelf     (0.228, 0.225, 0.224, 0.000)
		colorBeach     (0.241, 0.239, 0.237, 0.000)
		colorDesert    (0.254, 0.252, 0.250, 0.000)
		colorLowland   (0.268, 0.265, 0.263, 0.000)
		colorUpland    (0.281, 0.278, 0.276, 0.000)
		colorRock      (0.294, 0.292, 0.289, 0.000)
		colorSnow      (0.308, 0.305, 0.302, 1.000)
		BumpHeight      2.81419
		BumpOffset      0.562838
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0738297
		Period          0.488356
		Eccentricity    0.161793
		Inclination     33.0173
		AscendingNode   151.429
		ArgOfPericenter 135.759
		MeanAnomaly     -51.9395
	}
}

DwarfMoon	"Foerost System 9.D26"
{
	ParentBody     "Foerost System 9"
	Class	       "Asteroid"

	Mass            2.126e-011
	Radius          3.84444
	InertiaMoment   0.397158

	RotationPeriod  21519.5
	Obliquity       -58.3387
	EqAscendNode    27.9124

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.484 0.479 0.474)

	Surface
	{
		SurfStyle       0.51681
		OceanStyle      0.929069
		Randomize      (0.363, -0.038, 0.104)
		colorDistMagn   0.325583
		colorDistFreq   0.00723985
		detailScale     104.979
		colorConversion true
		snowLevel       2
		tropicLatitude  0.931131
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.462444
		terraceProb     0.342448
		erosion         0
		montesMagn      0.474874
		montesFreq      3.17665
		montesSpiky     0.994852
		montesFraction  0.706353
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0346108
		hillsFraction   0.566917
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.210163
		craterFreq      0.187949
		craterDensity   0.816903
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.590618
		volcanoTemp     1499.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.189, 0.163, 0.133, 0.000)
		colorShelf     (0.194, 0.168, 0.152, 0.000)
		colorBeach     (0.227, 0.196, 0.180, 0.000)
		colorDesert    (0.247, 0.211, 0.175, 0.000)
		colorLowland   (0.271, 0.225, 0.199, 0.000)
		colorUpland    (0.300, 0.273, 0.242, 0.000)
		colorRock      (0.324, 0.297, 0.261, 0.000)
		colorSnow      (0.353, 0.316, 0.275, 1.000)
		BumpHeight      3.46
		BumpOffset      0.691999
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0740947
		Period          0.490988
		Eccentricity    0.300036
		Inclination     -58.3387
		AscendingNode   27.9124
		ArgOfPericenter -88.0332
		MeanAnomaly     73.8707
	}
}

DwarfMoon	"Foerost System 9.D27"
{
	ParentBody     "Foerost System 9"
	Class	       "Asteroid"

	Mass            4.02075e-011
	Radius          4.53709
	InertiaMoment   0.398667

	RotationPeriod  26068.1
	Obliquity       -88.7774
	EqAscendNode    -111.487

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.838 0.769 0.744)

	Surface
	{
		SurfStyle       0.566178
		OceanStyle      0.643337
		Randomize      (0.541, 0.975, 0.873)
		colorDistMagn   0.245011
		colorDistFreq   0.00953818
		detailScale     123.893
		colorConversion true
		snowLevel       2
		tropicLatitude  0.930388
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.622082
		terraceProb     0.635837
		erosion         0
		montesMagn      0.341314
		montesFreq      2.68439
		montesSpiky     0.972233
		montesFraction  0.523821
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0429023
		hillsFraction   0.630604
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249082
		craterFreq      0.220638
		craterDensity   0.963113
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.532131
		volcanoTemp     1560.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.327, 0.261, 0.208, 0.000)
		colorShelf     (0.335, 0.269, 0.238, 0.000)
		colorBeach     (0.394, 0.315, 0.283, 0.000)
		colorDesert    (0.427, 0.338, 0.275, 0.000)
		colorLowland   (0.469, 0.361, 0.312, 0.000)
		colorUpland    (0.519, 0.438, 0.379, 0.000)
		colorRock      (0.561, 0.477, 0.409, 0.000)
		colorSnow      (0.611, 0.507, 0.431, 1.000)
		BumpHeight      4.08338
		BumpOffset      0.816676
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0745619
		Period          0.495639
		Eccentricity    0.321511
		Inclination     -88.7774
		AscendingNode   -111.487
		ArgOfPericenter 10.7636
		MeanAnomaly     -154.193
	}
}

DwarfMoon	"Foerost System 9.D28"
{
	ParentBody     "Foerost System 9"
	Class	       "Asteroid"

	Mass            7.07117e-011
	Radius          6.42568
	InertiaMoment   0.399635

	RotationPeriod  7321.7
	Obliquity       -10.5971
	EqAscendNode    -19.7951

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.853 0.772 0.738)

	Surface
	{
		SurfStyle       0.687974
		OceanStyle      0.983826
		Randomize      (-0.159, -0.449, 0.768)
		colorDistMagn   0.743991
		colorDistFreq   0.0187595
		detailScale     175.464
		colorConversion true
		snowLevel       2
		tropicLatitude  0.356332
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.6614
		terraceProb     0.125601
		erosion         0
		montesMagn      0.621306
		montesFreq      3.10233
		montesSpiky     0.890203
		montesFraction  0.816502
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0905664
		hillsFraction   0.672592
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.280461
		craterFreq      0.246255
		craterDensity   0.920874
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.479527
		volcanoTemp     1606.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.333, 0.263, 0.207, 0.000)
		colorShelf     (0.341, 0.270, 0.236, 0.000)
		colorBeach     (0.401, 0.317, 0.280, 0.000)
		colorDesert    (0.435, 0.340, 0.273, 0.000)
		colorLowland   (0.478, 0.363, 0.310, 0.000)
		colorUpland    (0.529, 0.440, 0.376, 0.000)
		colorRock      (0.572, 0.479, 0.406, 0.000)
		colorSnow      (0.623, 0.510, 0.428, 1.000)
		BumpHeight      5.78311
		BumpOffset      1.15662
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0751139
		Period          0.501153
		Eccentricity    0.46535
		Inclination     -10.5971
		AscendingNode   -19.7951
		ArgOfPericenter 83.4463
		MeanAnomaly     -41.1395
	}
}

DwarfMoon	"Foerost System 9.D29"
{
	ParentBody     "Foerost System 9"
	Class	       "Asteroid"

	Mass            1.17902e-010
	Radius          7.13371
	InertiaMoment   0.397466

	RotationPeriod  6672.05
	Obliquity       38.1055
	EqAscendNode    109.242

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.460 0.454 0.448)

	Surface
	{
		SurfStyle       0.914087
		OceanStyle      0.364923
		Randomize      (0.181, -0.921, -0.831)
		colorDistMagn   0.328164
		colorDistFreq   0.0348598
		detailScale     194.798
		colorConversion true
		snowLevel       2
		tropicLatitude  0.667423
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.725796
		terraceProb     0.503803
		erosion         0
		montesMagn      0.549518
		montesFreq      1.74399
		montesSpiky     0.977903
		montesFraction  0.599901
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.117236
		hillsFraction   0.605819
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255076
		craterFreq      0.21745
		craterDensity   0.99395
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.490825
		volcanoTemp     1394.33
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.156, 0.159, 0.179, 0.050)
		colorShelf     (0.184, 0.186, 0.206, 0.040)
		colorBeach     (0.211, 0.213, 0.233, 0.030)
		colorDesert    (0.239, 0.241, 0.264, 0.020)
		colorLowland   (0.267, 0.268, 0.291, 0.030)
		colorUpland    (0.294, 0.295, 0.318, 0.050)
		colorRock      (0.322, 0.322, 0.354, 0.020)
		colorSnow      (0.322, 0.322, 0.354, 1.000)
		BumpHeight      6.42034
		BumpOffset      1.28407
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0757398
		Period          0.50743
		Eccentricity    0.159386
		Inclination     38.1055
		AscendingNode   109.242
		ArgOfPericenter 96.2964
		MeanAnomaly     71.1429
	}
}

DwarfMoon	"Foerost System 9.D30"
{
	ParentBody     "Foerost System 9"
	Class	       "Asteroid"

	Mass            1.88745e-010
	Radius          8.00547
	InertiaMoment   0.39882

	RotationPeriod  27029.7
	Obliquity       -74.3276
	EqAscendNode    -138.127

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.702 0.698 0.696)

	Surface
	{
		SurfStyle       0.666095
		OceanStyle      0.379183
		Randomize      (-0.304, 0.285, -0.569)
		colorDistMagn   0.0641328
		colorDistFreq   0.0424911
		detailScale     218.603
		colorConversion true
		snowLevel       2
		tropicLatitude  0.646096
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.478643
		terraceProb     0.566571
		erosion         0
		montesMagn      0.462306
		montesFreq      3.24814
		montesSpiky     0.957593
		montesFraction  0.712825
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.145718
		hillsFraction   0.493686
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230751
		craterFreq      0.151266
		craterDensity   0.949084
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.468946
		volcanoTemp     1649.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.274, 0.237, 0.195, 0.000)
		colorShelf     (0.281, 0.244, 0.223, 0.000)
		colorBeach     (0.330, 0.286, 0.265, 0.000)
		colorDesert    (0.358, 0.307, 0.258, 0.000)
		colorLowland   (0.393, 0.328, 0.292, 0.000)
		colorUpland    (0.435, 0.398, 0.355, 0.000)
		colorRock      (0.470, 0.433, 0.383, 0.000)
		colorSnow      (0.512, 0.461, 0.404, 1.000)
		BumpHeight      7.20492
		BumpOffset      1.44098
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0763845
		Period          0.513923
		Eccentricity    0.356941
		Inclination     -74.3276
		AscendingNode   -138.127
		ArgOfPericenter -13.1154
		MeanAnomaly     142.934
	}
}

DwarfMoon	"Foerost System 9.D31"
{
	ParentBody     "Foerost System 9"
	Class	       "Asteroid"

	Mass            2.92653e-010
	Radius          8.86611
	InertiaMoment   0.399761

	Obliquity       -51.0425
	EqAscendNode    -142.764
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.565 0.526 0.461)

	Surface
	{
		SurfStyle       0.0117951
		OceanStyle      0.501345
		Randomize      (0.401, -0.910, 0.668)
		colorDistMagn   0.928861
		colorDistFreq   0.0353375
		detailScale     242.104
		colorConversion true
		snowLevel       2
		tropicLatitude  0.480974
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.662656
		terraceProb     0.198174
		erosion         0
		montesMagn      0.458969
		montesFreq      2.89805
		montesSpiky     0.806933
		montesFraction  0.288671
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.137079
		hillsFraction   0.688476
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22866
		craterFreq      0.228557
		craterDensity   0.774886
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.493288
		volcanoTemp     1302.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.226, 0.210, 0.185, 0.000)
		colorShelf     (0.240, 0.224, 0.196, 0.000)
		colorBeach     (0.254, 0.237, 0.208, 0.000)
		colorDesert    (0.268, 0.250, 0.219, 0.000)
		colorLowland   (0.282, 0.263, 0.231, 0.000)
		colorUpland    (0.297, 0.276, 0.242, 0.000)
		colorRock      (0.311, 0.289, 0.254, 0.000)
		colorSnow      (0.325, 0.302, 0.265, 1.000)
		BumpHeight      7.9795
		BumpOffset      1.5959
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.076753
		Period          0.517646
		Eccentricity    0.171692
		Inclination     -51.0425
		AscendingNode   -142.764
		ArgOfPericenter 1.1331
		MeanAnomaly     -122.043
	}
}

DwarfMoon	"Foerost System 9.D32"
{
	ParentBody     "Foerost System 9"
	Class	       "Asteroid"

	Mass            4.42279e-010
	Radius          12.0532
	InertiaMoment   0.397723

	Obliquity       38.9853
	EqAscendNode    47.6936
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.611 0.498 0.452)

	Surface
	{
		SurfStyle       0.503016
		OceanStyle      0.411217
		Randomize      (0.459, 0.865, -0.759)
		colorDistMagn   0.542388
		colorDistFreq   0.0835049
		detailScale     329.134
		colorConversion true
		snowLevel       2
		tropicLatitude  0.941218
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.495386
		terraceProb     0.446187
		erosion         0
		montesMagn      0.526713
		montesFreq      2.90249
		montesSpiky     0.994176
		montesFraction  0.637753
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.319887
		hillsFraction   0.689991
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.212031
		craterFreq      0.214395
		craterDensity   0.963959
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.479744
		volcanoTemp     1795.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.238, 0.169, 0.126, 0.000)
		colorShelf     (0.244, 0.174, 0.145, 0.000)
		colorBeach     (0.287, 0.204, 0.172, 0.000)
		colorDesert    (0.311, 0.219, 0.167, 0.000)
		colorLowland   (0.342, 0.234, 0.190, 0.000)
		colorUpland    (0.379, 0.284, 0.230, 0.000)
		colorRock      (0.409, 0.309, 0.248, 0.000)
		colorSnow      (0.446, 0.329, 0.262, 1.000)
		BumpHeight      10.8479
		BumpOffset      2.16958
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0772246
		Period          0.522424
		Eccentricity    0.0683641
		Inclination     38.9853
		AscendingNode   47.6936
		ArgOfPericenter -76.8904
		MeanAnomaly     24.1936
	}
}

DwarfMoon	"Foerost System 9.D33"
{
	ParentBody     "Foerost System 9"
	Class	       "Asteroid"

	Mass            6.54586e-010
	Radius          12.7179
	InertiaMoment   0.398965

	RotationPeriod  6167.26
	Obliquity       -85.8217
	EqAscendNode    51.3156

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.638 0.513 0.417)

	Surface
	{
		SurfStyle       0.577129
		OceanStyle      0.217478
		Randomize      (0.409, -0.234, 0.014)
		colorDistMagn   0.190075
		colorDistFreq   0.116365
		detailScale     347.284
		colorConversion true
		snowLevel       2
		tropicLatitude  0.78743
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.612695
		terraceProb     0.24964
		erosion         0
		montesMagn      0.332669
		montesFreq      2.08387
		montesSpiky     0.990814
		montesFraction  0.80675
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.331238
		hillsFraction   0.656181
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219956
		craterFreq      0.182329
		craterDensity   1.01484
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.552463
		volcanoTemp     1244.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.249, 0.174, 0.117, 0.000)
		colorShelf     (0.255, 0.180, 0.133, 0.000)
		colorBeach     (0.300, 0.210, 0.158, 0.000)
		colorDesert    (0.326, 0.226, 0.154, 0.000)
		colorLowland   (0.357, 0.241, 0.175, 0.000)
		colorUpland    (0.396, 0.292, 0.213, 0.000)
		colorRock      (0.428, 0.318, 0.229, 0.000)
		colorSnow      (0.466, 0.339, 0.242, 1.000)
		BumpHeight      11.4461
		BumpOffset      2.28923
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0777405
		Period          0.527668
		Eccentricity    0.414974
		Inclination     -85.8217
		AscendingNode   51.3156
		ArgOfPericenter -111.805
		MeanAnomaly     4.23071
	}
}

DwarfMoon	"Foerost System 9.D34"
{
	ParentBody     "Foerost System 9"
	Class	       "Asteroid"

	Mass            9.52267e-010
	Radius          13.8076
	InertiaMoment   0.399887

	Obliquity       89.022
	EqAscendNode    156.656
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.522 0.440 0.379)

	Surface
	{
		SurfStyle       0.0165593
		OceanStyle      0.656854
		Randomize      (-0.432, 0.902, 0.095)
		colorDistMagn   0.655103
		colorDistFreq   0.00354733
		detailScale     377.039
		colorConversion true
		snowLevel       2
		tropicLatitude  0.396191
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.613883
		terraceProb     0.175624
		erosion         0
		montesMagn      0.473079
		montesFreq      3.92829
		montesSpiky     0.769331
		montesFraction  0.502056
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.544302
		hillsFraction   0.43209
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246937
		craterFreq      0.214946
		craterDensity   0.861033
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.454155
		volcanoTemp     1389.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.209, 0.176, 0.152, 0.000)
		colorShelf     (0.222, 0.187, 0.161, 0.000)
		colorBeach     (0.235, 0.198, 0.171, 0.000)
		colorDesert    (0.248, 0.209, 0.180, 0.000)
		colorLowland   (0.261, 0.220, 0.190, 0.000)
		colorUpland    (0.274, 0.231, 0.199, 0.000)
		colorRock      (0.287, 0.242, 0.209, 0.000)
		colorSnow      (0.300, 0.253, 0.218, 1.000)
		BumpHeight      12.4268
		BumpOffset      2.48536
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0781743
		Period          0.532091
		Eccentricity    0.0706652
		Inclination     89.022
		AscendingNode   156.656
		ArgOfPericenter -102.7
		MeanAnomaly     -38.9669
	}
}

DwarfMoon	"Foerost System 9.D35"
{
	ParentBody     "Foerost System 9"
	Class	       "Asteroid"

	Mass            1.36565e-009
	Radius          14.9258
	InertiaMoment   0.397948

	RotationPeriod  23436.8
	Obliquity       -35.5852
	EqAscendNode    -87.4128

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.691 0.688 0.687)

	Surface
	{
		SurfStyle       0.361519
		OceanStyle      0.0460546
		Randomize      (0.801, 0.823, 0.063)
		colorDistMagn   0.972712
		colorDistFreq   0.156178
		detailScale     407.575
		colorConversion true
		snowLevel       2
		tropicLatitude  0.76326
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.633971
		terraceProb     0.190341
		erosion         0
		montesMagn      0.282686
		montesFreq      3.72788
		montesSpiky     0.794823
		montesFraction  0.660291
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.526594
		hillsFraction   0.735892
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225861
		craterFreq      0.26814
		craterDensity   0.998387
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.531369
		volcanoTemp     1536.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.276, 0.275, 0.275, 0.000)
		colorShelf     (0.294, 0.293, 0.292, 0.000)
		colorBeach     (0.311, 0.310, 0.309, 0.000)
		colorDesert    (0.328, 0.327, 0.327, 0.000)
		colorLowland   (0.345, 0.344, 0.344, 0.000)
		colorUpland    (0.363, 0.361, 0.361, 0.000)
		colorRock      (0.380, 0.379, 0.378, 0.000)
		colorSnow      (0.397, 0.396, 0.395, 1.000)
		BumpHeight      13.4333
		BumpOffset      2.68665
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0784327
		Period          0.534731
		Eccentricity    0.072045
		Inclination     -35.5852
		AscendingNode   -87.4128
		ArgOfPericenter -129.681
		MeanAnomaly     178.669
	}
}

DwarfMoon	"Foerost System 9.D36"
{
	ParentBody     "Foerost System 9"
	Class	       "Asteroid"

	Mass            1.93526e-009
	Radius          20.2496
	InertiaMoment   0.399106

	RotationPeriod  28363.2
	Obliquity       21.8904
	EqAscendNode    -159.791

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.672 0.589 0.543)

	Surface
	{
		SurfStyle       0.61693
		OceanStyle      0.868469
		Randomize      (-0.520, -0.380, 0.637)
		colorDistMagn   0.926781
		colorDistFreq   0.300402
		detailScale     552.949
		colorConversion true
		snowLevel       2
		tropicLatitude  0.130541
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.489255
		terraceProb     0.45834
		erosion         0
		montesMagn      0.446645
		montesFreq      3.6035
		montesSpiky     0.942958
		montesFraction  0.510299
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.776942
		hillsFraction   0.459105
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246665
		craterFreq      0.197992
		craterDensity   0.872234
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.552515
		volcanoTemp     1648.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.262, 0.200, 0.152, 0.000)
		colorShelf     (0.269, 0.206, 0.174, 0.000)
		colorBeach     (0.316, 0.242, 0.206, 0.000)
		colorDesert    (0.343, 0.259, 0.201, 0.000)
		colorLowland   (0.377, 0.277, 0.228, 0.000)
		colorUpland    (0.417, 0.336, 0.277, 0.000)
		colorRock      (0.450, 0.365, 0.299, 0.000)
		colorSnow      (0.491, 0.389, 0.315, 1.000)
		BumpHeight      18.2246
		BumpOffset      3.64492
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0788766
		Period          0.539278
		Eccentricity    0.0973806
		Inclination     21.8904
		AscendingNode   -159.791
		ArgOfPericenter 144.602
		MeanAnomaly     34.4068
	}
}

DwarfMoon	"Foerost System 9.D37"
{
	ParentBody     "Foerost System 9"
	Class	       "Asteroid"

	Mass            2.71526e-009
	Radius          20.5833
	InertiaMoment   0.394344

	Obliquity       56.2267
	EqAscendNode    -153.156
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.664 0.663 0.660)

	Surface
	{
		SurfStyle       0.296857
		OceanStyle      0.233366
		Randomize      (-0.880, 0.227, 0.673)
		colorDistMagn   0.878311
		colorDistFreq   0.135241
		detailScale     562.062
		colorConversion true
		snowLevel       2
		tropicLatitude  0.378653
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.643542
		terraceProb     0.533099
		erosion         0
		montesMagn      0.585843
		montesFreq      3.10812
		montesSpiky     0.905534
		montesFraction  0.306513
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.02846
		hillsFraction   0.777757
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260997
		craterFreq      0.222251
		craterDensity   0.885391
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.543629
		volcanoTemp     1130.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.266, 0.265, 0.264, 0.000)
		colorShelf     (0.282, 0.282, 0.280, 0.000)
		colorBeach     (0.299, 0.298, 0.297, 0.000)
		colorDesert    (0.316, 0.315, 0.313, 0.000)
		colorLowland   (0.332, 0.331, 0.330, 0.000)
		colorUpland    (0.349, 0.348, 0.346, 0.000)
		colorRock      (0.365, 0.364, 0.363, 0.000)
		colorSnow      (0.382, 0.381, 0.379, 1.000)
		BumpHeight      18.525
		BumpOffset      3.705
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0790896
		Period          0.541463
		Eccentricity    0.114145
		Inclination     56.2267
		AscendingNode   -153.156
		ArgOfPericenter -172.146
		MeanAnomaly     -117.718
	}
}

DwarfMoon	"Foerost System 9.D38"
{
	ParentBody     "Foerost System 9"
	Class	       "Asteroid"

	Mass            3.77817e-009
	Radius          21.9821
	InertiaMoment   0.398149

	Obliquity       -30.8173
	EqAscendNode    99.0867
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.600 0.597 0.594)

	Surface
	{
		SurfStyle       0.839978
		OceanStyle      0.674899
		Randomize      (-0.644, 0.263, -0.795)
		colorDistMagn   0.146258
		colorDistFreq   0.0481388
		detailScale     600.257
		colorConversion true
		snowLevel       2
		tropicLatitude  0.627029
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.460876
		terraceProb     0.178929
		erosion         0
		montesMagn      0.553006
		montesFreq      2.63206
		montesSpiky     0.833795
		montesFraction  0.209369
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.30188
		hillsFraction   0.687247
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.266932
		craterFreq      0.166162
		craterDensity   0.883701
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.512584
		volcanoTemp     1331.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.234, 0.203, 0.166, 0.000)
		colorShelf     (0.240, 0.209, 0.190, 0.000)
		colorBeach     (0.282, 0.245, 0.226, 0.000)
		colorDesert    (0.306, 0.263, 0.220, 0.000)
		colorLowland   (0.336, 0.280, 0.250, 0.000)
		colorUpland    (0.372, 0.340, 0.303, 0.000)
		colorRock      (0.402, 0.370, 0.327, 0.000)
		colorSnow      (0.438, 0.394, 0.345, 1.000)
		BumpHeight      19.7839
		BumpOffset      3.95677
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0797331
		Period          0.548085
		Eccentricity    0.0149112
		Inclination     -30.8173
		AscendingNode   99.0867
		ArgOfPericenter 12.782
		MeanAnomaly     -143.381
	}
}

DwarfMoon	"Foerost System 9.D39"
{
	ParentBody     "Foerost System 9"
	Class	       "Asteroid"

	Mass            5.22123e-009
	Radius          23.4979
	InertiaMoment   0.399242

	RotationPeriod  14516.9
	Obliquity       -23.8056
	EqAscendNode    113.151

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.657 0.654 0.650)

	Surface
	{
		SurfStyle       0.253944
		OceanStyle      0.809046
		Randomize      (-0.529, 0.553, 0.151)
		colorDistMagn   0.719711
		colorDistFreq   0.257661
		detailScale     641.649
		colorConversion true
		snowLevel       2
		tropicLatitude  0.433542
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.489061
		terraceProb     0.179555
		erosion         0
		montesMagn      0.54248
		montesFreq      2.81504
		montesSpiky     0.974064
		montesFraction  0.785437
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.785033
		hillsFraction   0.60587
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260501
		craterFreq      0.242293
		craterDensity   0.965775
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.529404
		volcanoTemp     1870.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.263, 0.261, 0.260, 0.000)
		colorShelf     (0.279, 0.278, 0.276, 0.000)
		colorBeach     (0.296, 0.294, 0.293, 0.000)
		colorDesert    (0.312, 0.311, 0.309, 0.000)
		colorLowland   (0.328, 0.327, 0.325, 0.000)
		colorUpland    (0.345, 0.343, 0.341, 0.000)
		colorRock      (0.361, 0.360, 0.358, 0.000)
		colorSnow      (0.378, 0.376, 0.374, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.080115
		Period          0.552027
		Eccentricity    0.419563
		Inclination     -23.8056
		AscendingNode   113.151
		ArgOfPericenter 127.397
		MeanAnomaly     -32.4148
	}
}

DwarfMoon	"Foerost System 9.D40"
{
	ParentBody     "Foerost System 9"
	Class	       "Asteroid"

	Mass            7.1752e-009
	Radius          33.3301
	InertiaMoment   0.396155

	RotationPeriod  24304.3
	Obliquity       50.3045
	EqAscendNode    -50.4198

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.729 0.725 0.722)

	Surface
	{
		SurfStyle       0.774956
		OceanStyle      0.715459
		Randomize      (0.237, 0.050, -0.865)
		colorDistMagn   0.81222
		colorDistFreq   0.794641
		detailScale     910.133
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999528
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.502675
		terraceProb     0.551932
		erosion         0
		montesMagn      0.64796
		montesFreq      3.2102
		montesSpiky     0.993606
		montesFraction  0.590918
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.54769
		hillsFraction   0.788824
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242741
		craterFreq      0.176199
		craterDensity   0.892213
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.461752
		volcanoTemp     1738.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.284, 0.247, 0.202, 0.000)
		colorShelf     (0.292, 0.254, 0.231, 0.000)
		colorBeach     (0.343, 0.297, 0.274, 0.000)
		colorDesert    (0.372, 0.319, 0.267, 0.000)
		colorLowland   (0.408, 0.341, 0.303, 0.000)
		colorUpland    (0.452, 0.413, 0.368, 0.000)
		colorRock      (0.488, 0.450, 0.397, 0.000)
		colorSnow      (0.532, 0.479, 0.419, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0803565
		Period          0.554526
		Eccentricity    0.278033
		Inclination     50.3045
		AscendingNode   -50.4198
		ArgOfPericenter -54.3315
		MeanAnomaly     5.25352
	}
}

DwarfMoon	"Foerost System 9.D41"
{
	ParentBody     "Foerost System 9"
	Class	       "Asteroid"

	Mass            9.81652e-009
	Radius          31.8401
	InertiaMoment   0.398333

	RotationPeriod  24493.9
	Obliquity       39.9906
	EqAscendNode    93.9227

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.484 0.480 0.472)

	Surface
	{
		SurfStyle       0.0898955
		OceanStyle      0.623213
		Randomize      (-0.763, -0.618, -0.263)
		colorDistMagn   0.906964
		colorDistFreq   0.283083
		detailScale     869.447
		colorConversion true
		snowLevel       2
		tropicLatitude  0.788339
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.532793
		terraceProb     0.219734
		erosion         0
		montesMagn      0.656788
		montesFreq      1.91415
		montesSpiky     0.863985
		montesFraction  0.401928
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.65702
		hillsFraction   0.715289
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241439
		craterFreq      0.231669
		craterDensity   0.779813
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.469445
		volcanoTemp     1475.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.194, 0.192, 0.189, 0.000)
		colorShelf     (0.206, 0.204, 0.200, 0.000)
		colorBeach     (0.218, 0.216, 0.212, 0.000)
		colorDesert    (0.230, 0.228, 0.224, 0.000)
		colorLowland   (0.242, 0.240, 0.236, 0.000)
		colorUpland    (0.254, 0.252, 0.248, 0.000)
		colorRock      (0.266, 0.264, 0.259, 0.000)
		colorSnow      (0.278, 0.276, 0.271, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0807737
		Period          0.55885
		Eccentricity    0.294851
		Inclination     39.9906
		AscendingNode   93.9227
		ArgOfPericenter -139.909
		MeanAnomaly     2.69252
	}
}

DwarfMoon	"Foerost System 9.D42"
{
	ParentBody     "Foerost System 9"
	Class	       "Asteroid"

	Mass            1.33841e-008
	Radius          33.7009
	InertiaMoment   0.399374

	RotationPeriod  12366.1
	Obliquity       -30.8987
	EqAscendNode    -75.1392

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.790 0.692 0.620)

	Surface
	{
		SurfStyle       0.415193
		OceanStyle      0.2642
		Randomize      (-0.546, 0.315, -0.859)
		colorDistMagn   0.534138
		colorDistFreq   0.559696
		detailScale     920.26
		colorConversion true
		snowLevel       2
		tropicLatitude  0.743565
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.487203
		terraceProb     0.381916
		erosion         0
		montesMagn      0.596583
		montesFreq      2.29874
		montesSpiky     0.862
		montesFraction  0.10959
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.46514
		hillsFraction   0.659714
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232281
		craterFreq      0.220864
		craterDensity   0.756194
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52282
		volcanoTemp     1696.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.316, 0.277, 0.248, 0.000)
		colorShelf     (0.336, 0.294, 0.264, 0.000)
		colorBeach     (0.356, 0.312, 0.279, 0.000)
		colorDesert    (0.375, 0.329, 0.295, 0.000)
		colorLowland   (0.395, 0.346, 0.310, 0.000)
		colorUpland    (0.415, 0.364, 0.326, 0.000)
		colorRock      (0.435, 0.381, 0.341, 0.000)
		colorSnow      (0.454, 0.398, 0.357, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0812969
		Period          0.564288
		Eccentricity    0.263387
		Inclination     -30.8987
		AscendingNode   -75.1392
		ArgOfPericenter -92.6272
		MeanAnomaly     134.72
	}
}

DwarfMoon	"Foerost System 9.D43"
{
	ParentBody     "Foerost System 9"
	Class	       "Asteroid"

	Mass            1.82032e-008
	Radius          35.8578
	InertiaMoment   0.396752

	RotationPeriod  30015.5
	Obliquity       8.00043
	EqAscendNode    -47.701

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.724 0.643 0.588)

	Surface
	{
		SurfStyle       0.87378
		OceanStyle      0.849139
		Randomize      (0.041, -0.950, 0.993)
		colorDistMagn   0.526906
		colorDistFreq   0.705903
		detailScale     979.156
		colorConversion true
		snowLevel       2
		tropicLatitude  0.252519
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.314325
		terraceProb     0.254812
		erosion         0
		montesMagn      0.523656
		montesFreq      3.24726
		montesSpiky     0.973872
		montesFraction  0.496468
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.57129
		hillsFraction   0.59768
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243165
		craterFreq      0.23518
		craterDensity   0.851043
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.481116
		volcanoTemp     1344.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.246, 0.225, 0.235, 0.050)
		colorShelf     (0.290, 0.263, 0.271, 0.040)
		colorBeach     (0.333, 0.302, 0.306, 0.030)
		colorDesert    (0.377, 0.341, 0.347, 0.020)
		colorLowland   (0.420, 0.379, 0.382, 0.030)
		colorUpland    (0.463, 0.418, 0.418, 0.050)
		colorRock      (0.507, 0.456, 0.465, 0.020)
		colorSnow      (0.507, 0.456, 0.465, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0819108
		Period          0.570692
		Eccentricity    0.323221
		Inclination     8.00043
		AscendingNode   -47.701
		ArgOfPericenter -85.0431
		MeanAnomaly     -25.8237
	}
}

DwarfMoon	"Foerost System 9.D44"
{
	ParentBody     "Foerost System 9"
	Class	       "Asteroid"

	Mass            2.47186e-008
	Radius          36.934
	InertiaMoment   0.398503

	Obliquity       -56.5468
	EqAscendNode    169.324
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.407 0.402 0.399)

	Surface
	{
		SurfStyle       0.37128
		OceanStyle      0.246398
		Randomize      (-0.545, 0.788, -0.543)
		colorDistMagn   0.338796
		colorDistFreq   1.18518
		detailScale     1008.55
		colorConversion true
		snowLevel       2
		tropicLatitude  0.154772
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.741957
		terraceProb     0.103853
		erosion         0
		montesMagn      0.611092
		montesFreq      3.71712
		montesSpiky     0.832819
		montesFraction  0.691153
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.36512
		hillsFraction   0.618485
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.275853
		craterFreq      0.248012
		craterDensity   1.01475
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.519726
		volcanoTemp     1455.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.163, 0.161, 0.160, 0.000)
		colorShelf     (0.173, 0.171, 0.170, 0.000)
		colorBeach     (0.183, 0.181, 0.180, 0.000)
		colorDesert    (0.193, 0.191, 0.190, 0.000)
		colorLowland   (0.203, 0.201, 0.200, 0.000)
		colorUpland    (0.213, 0.211, 0.209, 0.000)
		colorRock      (0.224, 0.221, 0.219, 0.000)
		colorSnow      (0.234, 0.231, 0.229, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0821527
		Period          0.573222
		Eccentricity    0.0373722
		Inclination     -56.5468
		AscendingNode   169.324
		ArgOfPericenter 3.17247
		MeanAnomaly     -168.08
	}
}

DwarfMoon	"Foerost System 9.D45"
{
	ParentBody     "Foerost System 9"
	Class	       "Asteroid"

	Mass            3.35427e-008
	Radius          48.3736
	InertiaMoment   0.399504

	Obliquity       54.3273
	EqAscendNode    33.4129
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.540 0.536 0.531)

	Surface
	{
		SurfStyle       0.0557589
		OceanStyle      0.337321
		Randomize      (-0.767, 0.592, -0.871)
		colorDistMagn   0.0374191
		colorDistFreq   1.79711
		detailScale     1320.92
		colorConversion true
		snowLevel       2
		tropicLatitude  0.977531
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.663486
		terraceProb     0.317563
		erosion         0
		montesMagn      0.485119
		montesFreq      3.18951
		montesSpiky     0.930351
		montesFraction  0.61102
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.15671
		hillsFraction   0.739314
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221121
		craterFreq      0.209397
		craterDensity   0.89163
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.419006
		volcanoTemp     1452.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.216, 0.214, 0.213, 0.000)
		colorShelf     (0.230, 0.228, 0.226, 0.000)
		colorBeach     (0.243, 0.241, 0.239, 0.000)
		colorDesert    (0.257, 0.255, 0.252, 0.000)
		colorLowland   (0.270, 0.268, 0.266, 0.000)
		colorUpland    (0.284, 0.282, 0.279, 0.000)
		colorRock      (0.297, 0.295, 0.292, 0.000)
		colorSnow      (0.311, 0.308, 0.306, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0823691
		Period          0.575488
		Eccentricity    0.411087
		Inclination     54.3273
		AscendingNode   33.4129
		ArgOfPericenter 21.5326
		MeanAnomaly     -57.3669
	}
}

Planet	"Foerost System 10"
{
	ParentBody     "Foerost System"
	Class	       "IceWorld"

	Mass            8.67784
	Radius          13962.9
	InertiaMoment   0.328383

	Oblateness      0.0178072

	RotationPeriod  11.3571
	Obliquity       -120.76
	EqAscendNode    -133.365

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.633 0.626 0.623)

	Surface
	{
		SurfStyle       0.577554
		OceanStyle      0.565106
		Randomize      (-0.674, 0.220, 0.479)
		colorDistMagn   0.0767387
		colorDistFreq   1876.5
		detailScale     35913.5
		colorConversion true
		drivenDarkening 0
		seaLevel        0.161548
		snowLevel       2
		tropicLatitude  0.857229
		icecapLatitude  1
		icecapHeight    0.161548
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.69915
		venusFreq       1.17292
		venusMagn       0
		mareFreq        1.72232
		mareDensity     0.133608
		terraceProb     0.175056
		erosion         0
		montesMagn      0.222243
		montesFreq      627.799
		montesSpiky     0.956736
		montesFraction  0.00489954
		dunesMagn       0.0423934
		dunesFreq       18184.4
		dunesFraction   0.637435
		hillsMagn       0.147505
		hillsFreq       1484.79
		hillsFraction   0.355214
		hills2Fraction  0.192683
		riversMagn      63.4736
		riversFreq      3.65497
		riversSin       6.5547
		riversOctaves   0
		canyonsMagn     0.436244
		canyonsFreq     4.04598
		canyonFraction  0
		cracksMagn      0.0304357
		cracksFreq      6.69674
		cracksOctaves   4
		craterMagn      0.784733
		craterFreq      35.3028
		craterDensity   0.952032
		craterOctaves   14
		craterRayedFactor 0.05601
		volcanoMagn     0.508248
		volcanoFreq     0.677576
		volcanoDensity  0.224907
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.343457
		volcanoRadius   0.470872
		volcanoTemp     1475.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.190, 0.157, 0.137, 0.000)
		colorShelf     (0.234, 0.194, 0.174, 0.000)
		colorBeach     (0.355, 0.294, 0.262, 0.200)
		colorDesert    (0.323, 0.275, 0.230, 0.500)
		colorLowland   (0.247, 0.213, 0.174, 0.800)
		colorUpland    (0.418, 0.376, 0.324, 1.000)
		colorRock      (0.670, 0.620, 0.550, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.247, 0.213, 0.174, 0.800)
		colorUpPlants  (0.418, 0.376, 0.324, 1.000)
		BumpHeight      14.863
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.999233
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Sun"
		Height          69.8147
		Density         7.66616e-005
		Pressure        1.50778e-005
		Greenhouse      0.0579794
		Bright          2.38186
		Opacity         0
		SkyLight        0.793952
		Hue             -0.0224187
		Saturation      1

		Composition
		{
			N2    	49.0545
			He    	44.7996
			Ne    	5.06129
			H2    	1.08356
			CO    	0.000570133
			Ar    	0.000536377
		}
	}

	Aurora
	{
		Height      179.895
		NorthLat    72.3191
		NorthLon    -59.9524
		NorthRadius 3195.26
		NorthWidth  669.126
		NorthRings  2
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -55.0608
		SouthLon    133.533
		SouthRadius 4056.57
		SouthWidth  1159.68
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
		SemiMajorAxis   5.16943
		Period          26.0976
		Eccentricity    0.0892902
		Inclination     0.33413
		AscendingNode   -134.3
		ArgOfPericenter 190.161
		MeanAnomaly     273.667
	}
}

DwarfMoon	"Foerost System 10.D1"
{
	ParentBody     "Foerost System 10"
	Class	       "Asteroid"

	Mass            7.17763e-007
	Radius          131.194
	InertiaMoment   0.398929

	Oblateness      0.249

	Obliquity       0.0119293
	EqAscendNode    72.4971
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.757 0.754 0.750)

	Surface
	{
		SurfStyle       0.680276
		OceanStyle      0.87054
		Randomize      (-0.713, -0.595, 0.250)
		colorDistMagn   0.421329
		colorDistFreq   12.2575
		detailScale     3582.47
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.538515
		terraceProb     0.297666
		erosion         0
		montesMagn      0.382533
		montesFreq      3.48797
		montesSpiky     0.95
		montesFraction  0.676392
		dunesFraction   0
		hillsMagn       0
		hillsFreq       34.7853
		hillsFraction   0.4573
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236076
		craterFreq      0.526692
		craterDensity   0.928106
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.543705
		volcanoTemp     1877.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.295, 0.256, 0.210, 0.000)
		colorShelf     (0.303, 0.264, 0.240, 0.000)
		colorBeach     (0.356, 0.309, 0.285, 0.000)
		colorDesert    (0.386, 0.332, 0.277, 0.000)
		colorLowland   (0.424, 0.354, 0.315, 0.000)
		colorUpland    (0.469, 0.430, 0.382, 0.000)
		colorRock      (0.507, 0.467, 0.412, 0.000)
		colorSnow      (0.552, 0.497, 0.435, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000298024
		Period          0.00101007
		Eccentricity    3.30975e-005
		Inclination     0.0119293
		AscendingNode   72.4971
		ArgOfPericenter 65.6914
		MeanAnomaly     -117.993
	}
}

DwarfMoon	"Foerost System 10.D2"
{
	ParentBody     "Foerost System 10"
	Class	       "Asteroid"

	Mass            1.02859e-006
	Radius          141.712
	InertiaMoment   0.399855

	Oblateness      0.246073

	Obliquity       -0.000685038
	EqAscendNode    -87.8719
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.640 0.559 0.469)

	Surface
	{
		SurfStyle       0.947519
		OceanStyle      0.539809
		Randomize      (-0.094, 0.621, 0.657)
		colorDistMagn   0.676814
		colorDistFreq   11.9065
		detailScale     3869.68
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.460583
		terraceProb     0.162284
		erosion         0
		montesMagn      0.476919
		montesFreq      3.60683
		montesSpiky     0.970055
		montesFraction  0.543472
		dunesFraction   0
		hillsMagn       0
		hillsFreq       72.0314
		hillsFraction   0.389692
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213904
		craterFreq      0.639187
		craterDensity   1.01658
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.436022
		volcanoTemp     1902.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.218, 0.196, 0.188, 0.050)
		colorShelf     (0.256, 0.229, 0.216, 0.040)
		colorBeach     (0.294, 0.263, 0.244, 0.030)
		colorDesert    (0.333, 0.296, 0.277, 0.020)
		colorLowland   (0.371, 0.330, 0.305, 0.030)
		colorUpland    (0.410, 0.364, 0.333, 0.050)
		colorRock      (0.448, 0.397, 0.371, 0.020)
		colorSnow      (0.448, 0.397, 0.371, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000330938
		Period          0.00118194
		Eccentricity    9.48784e-005
		Inclination     -0.000685038
		AscendingNode   -87.8719
		ArgOfPericenter 97.6314
		MeanAnomaly     147.909
	}
}

Moon	"Foerost System 10.1"
{
	ParentBody     "Foerost System 10"
	Class	       "Selena"

	Mass            0.00372402
	Radius          1357.82
	InertiaMoment   0.395469

	Oblateness      0.0142117

	Obliquity       -0.898944
	EqAscendNode    47.5247
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.624 0.620 0.614)

	Surface
	{
		SurfStyle       0.433712
		OceanStyle      0.459416
		Randomize      (0.967, -0.736, 0.581)
		colorDistMagn   0.060745
		colorDistFreq   142.309
		detailScale     3492.4
		colorConversion true
		drivenDarkening 0
		seaLevel        0.21595
		snowLevel       2
		tropicLatitude  0.0287145
		icecapLatitude  2.20052
		icecapHeight    0.157955
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.87643
		venusFreq       0.899649
		venusMagn       0
		mareFreq        0.595096
		mareDensity     0.000756126
		terraceProb     0.306544
		erosion         0
		montesMagn      0.0473724
		montesFreq      57.2056
		montesSpiky     0.805512
		montesFraction  0.237911
		dunesMagn       0.0453104
		dunesFreq       1758.5
		dunesFraction   0.612906
		hillsMagn       0.13137
		hillsFreq       126.178
		hillsFraction   0.666825
		hills2Fraction  0
		riversMagn      51.1397
		riversFreq      1.81205
		riversSin       6.99383
		riversOctaves   0
		canyonsMagn     0.200268
		canyonsFreq     0.461718
		canyonFraction  0.533426
		cracksMagn      0.0364579
		cracksFreq      0.865429
		cracksOctaves   0
		craterMagn      0.587316
		craterFreq      2.94547
		craterDensity   0.66897
		craterOctaves   8.08942
		craterRayedFactor 0.106025
		volcanoMagn     0.17692
		volcanoFreq     0.586968
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.154841
		volcanoRadius   0.147071
		volcanoTemp     1444.1
		lavaCoverTidal  0.293998
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.420, 0.420, 0.430, 0.000)
		colorShelf     (0.470, 0.480, 0.480, 0.000)
		colorBeach     (0.343, 0.353, 0.369, 0.000)
		colorDesert    (0.300, 0.285, 0.283, 0.000)
		colorLowland   (0.381, 0.378, 0.344, 0.000)
		colorUpland    (0.406, 0.403, 0.375, 0.000)
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
		SemiMajorAxis   0.000531391
		Period          0.00240437
		Eccentricity    0.0207167
		Inclination     -0.898944
		AscendingNode   47.5247
		ArgOfPericenter -2.86185
		MeanAnomaly     40.2692
	}
}

Moon	"Foerost System 10.2"
{
	ParentBody     "Foerost System 10"
	Class	       "Selena"

	Mass            0.0461785
	Radius          2909.99
	InertiaMoment   0.343129

	Obliquity       -0.148944
	EqAscendNode    165.338
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.711 0.709 0.708)

	Surface
	{
		SurfStyle       0.0571461
		OceanStyle      0.42235
		Randomize      (0.264, 0.284, -0.137)
		colorDistMagn   0.0527099
		colorDistFreq   433.743
		detailScale     7484.67
		colorConversion true
		drivenDarkening 0
		seaLevel        0.167172
		snowLevel       2
		tropicLatitude  0.000690534
		icecapLatitude  0.67539
		icecapHeight    0.183514
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.63712
		venusFreq       1.00323
		venusMagn       0
		mareFreq        1.68011
		mareDensity     0.00701659
		terraceProb     0.19765
		erosion         0
		montesMagn      0.212486
		montesFreq      166.69
		montesSpiky     0.968621
		montesFraction  0.958717
		dunesMagn       0.0468446
		dunesFreq       3799.62
		dunesFraction   0.0128083
		hillsMagn       0.114297
		hillsFreq       291.014
		hillsFraction   0.944258
		hills2Fraction  0
		riversMagn      56.8342
		riversFreq      4.66339
		riversSin       6.33144
		riversOctaves   0
		canyonsMagn     0.458117
		canyonsFreq     1.10993
		canyonFraction  0.525858
		cracksMagn      0.0649766
		cracksFreq      1.33441
		cracksOctaves   0
		craterMagn      0.666919
		craterFreq      9.19289
		craterDensity   0.587281
		craterOctaves   9.39508
		craterRayedFactor 0.103528
		volcanoMagn     0.611155
		volcanoFreq     0.558422
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.421961
		volcanoRadius   0.514766
		volcanoTemp     1213.61
		lavaCoverTidal  0.241196
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.320, 0.320, 0.000)
		colorShelf     (0.370, 0.370, 0.370, 0.000)
		colorBeach     (0.355, 0.355, 0.354, 0.000)
		colorDesert    (0.441, 0.426, 0.403, 0.200)
		colorLowland   (0.476, 0.454, 0.453, 0.500)
		colorUpland    (0.498, 0.475, 0.467, 0.800)
		colorRock      (0.650, 0.610, 0.620, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.998864
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
		Height          122.364
		Density         0.00011355
		Pressure        3.65164e-005
		Greenhouse      0.118862
		Bright          2.57654
		Opacity         0
		SkyLight        0.858847
		Hue             -0.0225204
		Saturation      1

		Composition
		{
			C2H4  	84.7377
			N2    	10.5695
			C2H2  	3.02498
			C2H6  	1.6483
			CO    	0.00649347
			Ne    	0.00582911
			Ar    	0.00218512
			O2    	0.00208159
			Kr    	0.00172188
			CO2   	0.00119011
			Xe    	5.31346e-005
			H2S   	3.26229e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00123606
		Period          0.00850902
		Eccentricity    0.0485162
		Inclination     -0.148944
		AscendingNode   165.338
		ArgOfPericenter 98.826
		MeanAnomaly     131.475
	}
}

Moon	"Foerost System 10.3"
{
	ParentBody     "Foerost System 10"
	Class	       "IceWorld"

	Mass            0.00584481
	Radius          1575.15
	InertiaMoment   0.390366

	Obliquity       -1.33702
	EqAscendNode    98.5307
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.528 0.438 0.286)

	Surface
	{
		SurfStyle       0.580234
		OceanStyle      0.893086
		Randomize      (0.778, 0.196, 0.590)
		colorDistMagn   0.045265
		colorDistFreq   188.638
		detailScale     4051.37
		colorConversion true
		drivenDarkening 0
		seaLevel        0.19591
		snowLevel       2
		tropicLatitude  0.0304485
		icecapLatitude  1
		icecapHeight    0.19591
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.70161
		venusFreq       1.47878
		venusMagn       0
		mareFreq        0.776807
		mareDensity     0.00140925
		terraceProb     0.357158
		erosion         0
		montesMagn      0.0861889
		montesFreq      66.5328
		montesSpiky     0.994141
		montesFraction  0.463228
		dunesMagn       0.0451266
		dunesFreq       2067.41
		dunesFraction   0.273377
		hillsMagn       0.141944
		hillsFreq       161.177
		hillsFraction   0.00542148
		hills2Fraction  0.129345
		riversMagn      54.2892
		riversFreq      1.56383
		riversSin       5.39503
		riversOctaves   0
		canyonsMagn     0.605838
		canyonsFreq     0.588958
		canyonFraction  0
		cracksMagn      0.0762642
		cracksFreq      0.497686
		cracksOctaves   0
		craterMagn      0.529298
		craterFreq      4.55817
		craterDensity   0.913729
		craterOctaves   11
		craterRayedFactor 0.198261
		volcanoMagn     0.183344
		volcanoFreq     0.680723
		volcanoDensity  0.22633
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.255344
		volcanoRadius   0.17661
		volcanoTemp     1441.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.158, 0.110, 0.063, 0.000)
		colorShelf     (0.195, 0.136, 0.080, 0.000)
		colorBeach     (0.296, 0.206, 0.120, 0.200)
		colorDesert    (0.269, 0.193, 0.106, 0.500)
		colorLowland   (0.206, 0.149, 0.080, 0.800)
		colorUpland    (0.348, 0.263, 0.149, 1.000)
		colorRock      (0.670, 0.620, 0.550, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.206, 0.149, 0.080, 0.800)
		colorUpPlants  (0.348, 0.263, 0.149, 1.000)
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
		SemiMajorAxis   0.00188517
		Period          0.016064
		Eccentricity    0.0318757
		Inclination     -1.33702
		AscendingNode   98.5307
		ArgOfPericenter -135.905
		MeanAnomaly     -152.566
	}
}

Moon	"Foerost System 10.4"
{
	ParentBody     "Foerost System 10"
	Class	       "IceWorld"

	Mass            0.00760707
	Radius          1616.26
	InertiaMoment   0.383484

	Obliquity       0.0176912
	EqAscendNode    -36.6154
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.599 0.437 0.357)

	Surface
	{
		SurfStyle       0.622385
		OceanStyle      0.167464
		Randomize      (-0.221, 0.435, -0.577)
		colorDistMagn   0.0726629
		colorDistFreq   228.09
		detailScale     4157.12
		colorConversion true
		drivenDarkening 0
		seaLevel        0.167438
		snowLevel       2
		tropicLatitude  0.00059802
		icecapLatitude  0.487085
		icecapHeight    0.191167
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.55503
		venusFreq       1.02
		venusMagn       0
		mareFreq        0.697821
		mareDensity     0.00187901
		terraceProb     0.203004
		erosion         0
		montesMagn      0.074753
		montesFreq      96.3343
		montesSpiky     0.929623
		montesFraction  0.650988
		dunesMagn       0.0489774
		dunesFreq       2130.43
		dunesFraction   0.428549
		hillsMagn       0.112694
		hillsFreq       213.898
		hillsFraction   0.0905909
		hills2Fraction  0.0271176
		riversMagn      60.1846
		riversFreq      2.90389
		riversSin       5.28496
		riversOctaves   0
		canyonsMagn     0.532645
		canyonsFreq     0.576336
		canyonFraction  0
		cracksMagn      0.0343005
		cracksFreq      0.853167
		cracksOctaves   0
		craterMagn      0.544016
		craterFreq      5.85522
		craterDensity   0.989089
		craterOctaves   11
		craterRayedFactor 0.149898
		volcanoMagn     0.198689
		volcanoFreq     0.6415
		volcanoDensity  0.179839
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.289491
		volcanoRadius   0.188434
		volcanoTemp     1460.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.156, 0.083, 0.039, 1.000)
		colorShelf     (0.204, 0.114, 0.057, 1.000)
		colorBeach     (0.329, 0.149, 0.061, 0.200)
		colorDesert    (0.359, 0.166, 0.071, 0.200)
		colorLowland   (0.389, 0.175, 0.075, 0.200)
		colorUpland    (0.419, 0.210, 0.089, 0.200)
		colorRock      (0.920, 0.870, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.389, 0.175, 0.075, 0.200)
		colorUpPlants  (0.419, 0.210, 0.089, 0.200)
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
		SemiMajorAxis   0.00287517
		Period          0.0302537
		Eccentricity    0.0356449
		Inclination     0.0176912
		AscendingNode   -36.6154
		ArgOfPericenter 55.3947
		MeanAnomaly     54.9925
	}
}

DwarfMoon	"Foerost System 10.D3"
{
	ParentBody     "Foerost System 10"
	Class	       "Asteroid"

	Mass            3.56357e-006
	Radius          134.957
	InertiaMoment   0.398821

	Obliquity       -0.455298
	EqAscendNode    -33.5625
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.684 0.559 0.504)

	Surface
	{
		SurfStyle       0.00831093
		OceanStyle      0.992814
		Randomize      (0.671, -0.795, -0.211)
		colorDistMagn   0.483015
		colorDistFreq   10.5364
		detailScale     3685.23
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0152148
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.519577
		terraceProb     0.227839
		erosion         0
		montesMagn      0.313771
		montesFreq      3.47132
		montesSpiky     0.818432
		montesFraction  0.658037
		dunesFraction   0
		hillsMagn       0
		hillsFreq       45.3564
		hillsFraction   0.653784
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238465
		craterFreq      0.759161
		craterDensity   0.865222
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.476802
		volcanoTemp     1435.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.274, 0.224, 0.201, 0.000)
		colorShelf     (0.291, 0.238, 0.214, 0.000)
		colorBeach     (0.308, 0.252, 0.227, 0.000)
		colorDesert    (0.325, 0.266, 0.239, 0.000)
		colorLowland   (0.342, 0.280, 0.252, 0.000)
		colorUpland    (0.359, 0.293, 0.264, 0.000)
		colorRock      (0.376, 0.307, 0.277, 0.000)
		colorSnow      (0.393, 0.321, 0.290, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00438506
		Period          0.0570082
		Eccentricity    0.0154909
		Inclination     -0.455298
		AscendingNode   -33.5625
		ArgOfPericenter 107.673
		MeanAnomaly     -69.2009
	}
}

DwarfMoon	"Foerost System 10.D4"
{
	ParentBody     "Foerost System 10"
	Class	       "Asteroid"

	Mass            9.60504e-006
	Radius          176.757
	InertiaMoment   0.398218

	Obliquity       -0.0308451
	EqAscendNode    -15.6669
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.726 0.723 0.721)

	Surface
	{
		SurfStyle       0.833491
		OceanStyle      0.359367
		Randomize      (0.184, -0.508, 0.695)
		colorDistMagn   0.0762729
		colorDistFreq   20.6781
		detailScale     4826.65
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00109183
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.406392
		terraceProb     0.467989
		erosion         0
		montesMagn      0.545498
		montesFreq      3.10786
		montesSpiky     0.953269
		montesFraction  0.841344
		dunesFraction   0
		hillsMagn       0
		hillsFreq       78.4866
		hillsFraction   0.694232
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259549
		craterFreq      0.914008
		craterDensity   0.884886
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.553257
		volcanoTemp     1633.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.283, 0.246, 0.202, 0.000)
		colorShelf     (0.290, 0.253, 0.231, 0.000)
		colorBeach     (0.341, 0.296, 0.274, 0.000)
		colorDesert    (0.370, 0.318, 0.267, 0.000)
		colorLowland   (0.406, 0.340, 0.303, 0.000)
		colorUpland    (0.450, 0.412, 0.368, 0.000)
		colorRock      (0.486, 0.448, 0.397, 0.000)
		colorSnow      (0.530, 0.477, 0.418, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00668787
		Period          0.107376
		Eccentricity    0.0479161
		Inclination     -0.0308451
		AscendingNode   -15.6669
		ArgOfPericenter 125.014
		MeanAnomaly     98.2594
	}
}

DwarfMoon	"Foerost System 10.D5"
{
	ParentBody     "Foerost System 10"
	Class	       "Asteroid"

	Mass            5.52119e-011
	Radius          5.66483
	InertiaMoment   0.398287

	RotationPeriod  2064.33
	Obliquity       -75.1568
	EqAscendNode    -173.478

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.465 0.456 0.452)

	Surface
	{
		SurfStyle       0.290142
		OceanStyle      0.993099
		Randomize      (0.510, -0.659, -0.784)
		colorDistMagn   0.828937
		colorDistFreq   0.0239854
		detailScale     154.688
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0958761
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.405217
		terraceProb     0.193515
		erosion         0
		montesMagn      0.410388
		montesFreq      2.19332
		montesSpiky     0.928821
		montesFraction  0.395962
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0865972
		hillsFraction   0.775469
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228135
		craterFreq      0.266729
		craterDensity   1.02502
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.448392
		volcanoTemp     1651.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.186, 0.182, 0.181, 0.000)
		colorShelf     (0.198, 0.194, 0.192, 0.000)
		colorBeach     (0.209, 0.205, 0.203, 0.000)
		colorDesert    (0.221, 0.217, 0.215, 0.000)
		colorLowland   (0.232, 0.228, 0.226, 0.000)
		colorUpland    (0.244, 0.239, 0.237, 0.000)
		colorRock      (0.256, 0.251, 0.249, 0.000)
		colorSnow      (0.267, 0.262, 0.260, 1.000)
		BumpHeight      5.09834
		BumpOffset      1.01967
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0328957
		Period          1.17134
		Eccentricity    0.397415
		Inclination     -70.7045
		AscendingNode   -176.618
		ArgOfPericenter -171.189
		MeanAnomaly     -67.2172
	}
}

DwarfMoon	"Foerost System 10.D6"
{
	ParentBody     "Foerost System 10"
	Class	       "Asteroid"

	Mass            9.41249e-011
	Radius          6.45868
	InertiaMoment   0.399341

	RotationPeriod  1761.64
	Obliquity       -83.4706
	EqAscendNode    102.987

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.734 0.672 0.624)

	Surface
	{
		SurfStyle       0.75906
		OceanStyle      0.283766
		Randomize      (-0.260, 0.480, -0.858)
		colorDistMagn   0.751075
		colorDistFreq   0.0228676
		detailScale     176.365
		colorConversion true
		snowLevel       2
		tropicLatitude  0.973126
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.663157
		terraceProb     0.202092
		erosion         0
		montesMagn      0.266923
		montesFreq      2.20857
		montesSpiky     0.88055
		montesFraction  0.726155
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0929089
		hillsFraction   0.606486
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.269855
		craterFreq      0.226837
		craterDensity   0.773149
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.486884
		volcanoTemp     1609.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.286, 0.228, 0.175, 0.000)
		colorShelf     (0.294, 0.235, 0.200, 0.000)
		colorBeach     (0.345, 0.275, 0.237, 0.000)
		colorDesert    (0.374, 0.295, 0.231, 0.000)
		colorLowland   (0.411, 0.316, 0.262, 0.000)
		colorUpland    (0.455, 0.383, 0.318, 0.000)
		colorRock      (0.492, 0.416, 0.343, 0.000)
		colorSnow      (0.536, 0.443, 0.362, 1.000)
		BumpHeight      5.81281
		BumpOffset      1.16256
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0333267
		Period          1.19443
		Eccentricity    0.434744
		Inclination     -82.0469
		AscendingNode   102.594
		ArgOfPericenter -101.065
		MeanAnomaly     -102.763
	}
}

DwarfMoon	"Foerost System 10.D7"
{
	ParentBody     "Foerost System 10"
	Class	       "Asteroid"

	Mass            1.53282e-010
	Radius          7.29746
	InertiaMoment   0.396627

	RotationPeriod  1537.48
	Obliquity       -3.28459
	EqAscendNode    129.876

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.524 0.469 0.408)

	Surface
	{
		SurfStyle       0.315834
		OceanStyle      0.246316
		Randomize      (-0.368, 0.957, 0.771)
		colorDistMagn   0.898296
		colorDistFreq   0.0138921
		detailScale     199.269
		colorConversion true
		snowLevel       2
		tropicLatitude  0.192945
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.718232
		terraceProb     0.225503
		erosion         0
		montesMagn      0.387156
		montesFreq      2.3233
		montesSpiky     0.948508
		montesFraction  0.694768
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.078818
		hillsFraction   0.79101
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245028
		craterFreq      0.25168
		craterDensity   0.628253
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.557898
		volcanoTemp     1669.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.210, 0.188, 0.163, 0.000)
		colorShelf     (0.223, 0.199, 0.173, 0.000)
		colorBeach     (0.236, 0.211, 0.184, 0.000)
		colorDesert    (0.249, 0.223, 0.194, 0.000)
		colorLowland   (0.262, 0.235, 0.204, 0.000)
		colorUpland    (0.275, 0.246, 0.214, 0.000)
		colorRock      (0.288, 0.258, 0.224, 0.000)
		colorSnow      (0.301, 0.270, 0.235, 1.000)
		BumpHeight      6.56771
		BumpOffset      1.31354
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0336055
		Period          1.20945
		Eccentricity    0.0440993
		Inclination     8.87168
		AscendingNode   126.078
		ArgOfPericenter -146.944
		MeanAnomaly     -84.83
	}
}

DwarfMoon	"Foerost System 10.D8"
{
	ParentBody     "Foerost System 10"
	Class	       "Asteroid"

	Mass            2.40905e-010
	Radius          7.90126
	InertiaMoment   0.398461

	RotationPeriod  1307.79
	Obliquity       84.3905
	EqAscendNode    10.8369

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.700 0.638 0.614)

	Surface
	{
		SurfStyle       0.223032
		OceanStyle      0.788649
		Randomize      (0.588, -0.801, -0.807)
		colorDistMagn   0.414016
		colorDistFreq   0.0392
		detailScale     215.757
		colorConversion true
		snowLevel       2
		tropicLatitude  0.456367
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.447443
		terraceProb     0.175247
		erosion         0
		montesMagn      0.653932
		montesFreq      4.46939
		montesSpiky     0.834686
		montesFraction  0.755376
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.146022
		hillsFraction   0.54915
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259458
		craterFreq      0.164439
		craterDensity   0.91591
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51717
		volcanoTemp     1328.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.280, 0.255, 0.246, 0.000)
		colorShelf     (0.297, 0.271, 0.261, 0.000)
		colorBeach     (0.315, 0.287, 0.276, 0.000)
		colorDesert    (0.332, 0.303, 0.292, 0.000)
		colorLowland   (0.350, 0.319, 0.307, 0.000)
		colorUpland    (0.367, 0.335, 0.322, 0.000)
		colorRock      (0.385, 0.351, 0.338, 0.000)
		colorSnow      (0.402, 0.367, 0.353, 1.000)
		BumpHeight      7.11113
		BumpOffset      1.42223
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.034245
		Period          1.24414
		Eccentricity    0.1104
		Inclination     72.5227
		AscendingNode   14.4719
		ArgOfPericenter 19.2155
		MeanAnomaly     -151.281
	}
}

DwarfMoon	"Foerost System 10.D9"
{
	ParentBody     "Foerost System 10"
	Class	       "Asteroid"

	Mass            3.68068e-010
	Radius          10.7546
	InertiaMoment   0.399472

	RotationPeriod  1413.1
	Obliquity       -104.728
	EqAscendNode    -165.715

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.621 0.618 0.615)

	Surface
	{
		SurfStyle       0.0905381
		OceanStyle      0.207066
		Randomize      (0.052, 0.379, 0.509)
		colorDistMagn   0.160615
		colorDistFreq   0.0573518
		detailScale     293.671
		colorConversion true
		snowLevel       2
		tropicLatitude  0.430244
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.44834
		terraceProb     0.123988
		erosion         0
		montesMagn      0.57418
		montesFreq      2.65963
		montesSpiky     0.862889
		montesFraction  0.688447
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.327353
		hillsFraction   0.691826
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220516
		craterFreq      0.197324
		craterDensity   0.876786
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.405126
		volcanoTemp     1676.32
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.249, 0.247, 0.246, 0.000)
		colorShelf     (0.264, 0.263, 0.261, 0.000)
		colorBeach     (0.280, 0.278, 0.277, 0.000)
		colorDesert    (0.295, 0.293, 0.292, 0.000)
		colorLowland   (0.311, 0.309, 0.307, 0.000)
		colorUpland    (0.326, 0.324, 0.323, 0.000)
		colorRock      (0.342, 0.340, 0.338, 0.000)
		colorSnow      (0.357, 0.355, 0.353, 1.000)
		BumpHeight      9.6791
		BumpOffset      1.93582
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0348929
		Period          1.27962
		Eccentricity    0.398478
		Inclination     -83.2087
		AscendingNode   -166.236
		ArgOfPericenter 107.781
		MeanAnomaly     53.3726
	}
}

DwarfMoon	"Foerost System 10.D10"
{
	ParentBody     "Foerost System 10"
	Class	       "Asteroid"

	Mass            5.49635e-010
	Radius          11.6982
	InertiaMoment   0.39706

	RotationPeriod  1245.52
	Obliquity       6.88759
	EqAscendNode    6.21851

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.452 0.449 0.445)

	Surface
	{
		SurfStyle       0.315144
		OceanStyle      0.0869832
		Randomize      (0.660, -0.612, -0.182)
		colorDistMagn   0.489882
		colorDistFreq   0.0150865
		detailScale     319.439
		colorConversion true
		snowLevel       2
		tropicLatitude  0.120788
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.391018
		terraceProb     0.155402
		erosion         0
		montesMagn      0.580903
		montesFreq      2.81336
		montesSpiky     0.955454
		montesFraction  0.435558
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.316964
		hillsFraction   0.589571
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.289513
		craterFreq      0.24262
		craterDensity   0.953546
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.508409
		volcanoTemp     1929.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.181, 0.179, 0.178, 0.000)
		colorShelf     (0.192, 0.191, 0.189, 0.000)
		colorBeach     (0.203, 0.202, 0.200, 0.000)
		colorDesert    (0.215, 0.213, 0.211, 0.000)
		colorLowland   (0.226, 0.224, 0.223, 0.000)
		colorUpland    (0.237, 0.235, 0.234, 0.000)
		colorRock      (0.249, 0.247, 0.245, 0.000)
		colorSnow      (0.260, 0.258, 0.256, 1.000)
		BumpHeight      10.5284
		BumpOffset      2.10568
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0354886
		Period          1.31253
		Eccentricity    0.210307
		Inclination     0.0503586
		AscendingNode   6.62772
		ArgOfPericenter -34.1006
		MeanAnomaly     -114.764
	}
}

Comet	"Foerost System C1"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            2.6316e-011
	Radius          3.9488
	InertiaMoment   0.396099

	Oblateness      0.0212986

	RotationPeriod  32.1576
	Obliquity       31.6766
	EqAscendNode    87.8735

	AbsMagn         14.3549
	SlopeParam      4.4422
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.521 0.517 0.511)

	Surface
	{
		SurfStyle       0.347211
		OceanStyle      0.398696
		Randomize      (-0.383, 0.334, 0.154)
		colorDistMagn   0.788803
		colorDistFreq   0.00999476
		detailScale     107.829
		colorConversion true
		snowLevel       2
		tropicLatitude  0.700976
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.374216
		terraceProb     0.455367
		erosion         0
		montesMagn      0.409884
		montesFreq      2.78983
		montesSpiky     0.930788
		montesFraction  0.315532
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0298735
		hillsFraction   0.615002
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224149
		craterFreq      0.179059
		craterDensity   0.730857
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.551075
		volcanoTemp     1720.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.208, 0.207, 0.204, 0.000)
		colorShelf     (0.221, 0.220, 0.217, 0.000)
		colorBeach     (0.234, 0.233, 0.230, 0.000)
		colorDesert    (0.248, 0.246, 0.243, 0.000)
		colorLowland   (0.261, 0.259, 0.255, 0.000)
		colorUpland    (0.274, 0.272, 0.268, 0.000)
		colorRock      (0.287, 0.284, 0.281, 0.000)
		colorSnow      (0.300, 0.297, 0.294, 1.000)
		BumpHeight      3.55392
		BumpOffset      0.710784
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.557002
		GasToDust   0.25
		Particles   2105
		GasBright   0.155663
		DustBright  0.21678
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.92819
		Period          11.1266
		Eccentricity    0.935378
		Inclination     -120.043
		AscendingNode   -129.17
		ArgOfPericenter 99.7317
		MeanAnomaly     -96.0621
	}
}

Comet	"Foerost System C2"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            2.03535e-007
	Radius          85.4184
	InertiaMoment   0.399049

	Oblateness      0.0320858

	RotationPeriod  30.1387
	Obliquity       344.882
	EqAscendNode    72.4509

	AbsMagn         9.0776
	SlopeParam      5.04632
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.496 0.492 0.491)

	Surface
	{
		SurfStyle       0.78434
		OceanStyle      0.305536
		Randomize      (0.921, -0.654, -0.073)
		colorDistMagn   0.997422
		colorDistFreq   5.02938
		detailScale     2332.49
		colorConversion true
		snowLevel       2
		tropicLatitude  0.967135
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.304979
		terraceProb     0.101902
		erosion         0
		montesMagn      0.460694
		montesFreq      3.54243
		montesSpiky     0.996125
		montesFraction  0.52579
		dunesFraction   0
		hillsMagn       0
		hillsFreq       17.5859
		hillsFraction   0.818438
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220479
		craterFreq      0.304786
		craterDensity   0.983016
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.464414
		volcanoTemp     1102.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.193, 0.167, 0.137, 0.000)
		colorShelf     (0.198, 0.172, 0.157, 0.000)
		colorBeach     (0.233, 0.202, 0.187, 0.000)
		colorDesert    (0.253, 0.217, 0.182, 0.000)
		colorLowland   (0.278, 0.231, 0.206, 0.000)
		colorUpland    (0.308, 0.281, 0.250, 0.000)
		colorRock      (0.332, 0.305, 0.270, 0.000)
		colorSnow      (0.362, 0.325, 0.285, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.408752
		DustBright  0.448178
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.27171
		Period          19.605
		Eccentricity    0.973557
		Inclination     -95.3944
		AscendingNode   50.9705
		ArgOfPericenter -107.076
		MeanAnomaly     155.385
	}
}

Comet	"Foerost System C3"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            6.26698e-015
	Radius          0.244511
	InertiaMoment   0.397537

	Oblateness      0.0280339

	RotationPeriod  28.0621
	Obliquity       298.088
	EqAscendNode    57.0283

	AbsMagn         5.52984
	SlopeParam      5.76795
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.646 0.607 0.533)

	Surface
	{
		SurfStyle       0.552413
		OceanStyle      0.0697541
		Randomize      (-0.688, 0.523, 0.719)
		colorDistMagn   0.661407
		colorDistFreq   3.47155e-005
		detailScale     6.67679
		colorConversion true
		snowLevel       2
		tropicLatitude  0.765544
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.649312
		terraceProb     0.236787
		erosion         0
		montesMagn      0.457034
		montesFreq      2.92764
		montesSpiky     0.870902
		montesFraction  0.485809
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000175536
		hillsFraction   0.49062
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.272896
		craterFreq      0.21127
		craterDensity   0.945389
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.507334
		volcanoTemp     1760.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.252, 0.206, 0.149, 0.000)
		colorShelf     (0.259, 0.212, 0.170, 0.000)
		colorBeach     (0.304, 0.249, 0.202, 0.000)
		colorDesert    (0.330, 0.267, 0.197, 0.000)
		colorLowland   (0.362, 0.285, 0.224, 0.000)
		colorUpland    (0.401, 0.346, 0.272, 0.000)
		colorRock      (0.433, 0.376, 0.293, 0.000)
		colorSnow      (0.472, 0.401, 0.309, 1.000)
		BumpHeight      0.22006
		BumpOffset      0.044012
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.108636
		GasToDust   0.25
		Particles   1199
		GasBright   0.0195133
		DustBright  0.521903
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.09537
		Period          12.093
		Eccentricity    0.9573
		Inclination     165.739
		AscendingNode   -149.403
		ArgOfPericenter -131.796
		MeanAnomaly     -13.7908
	}
}

Comet	"Foerost System C4"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            4.84706e-011
	Radius          5.29049
	InertiaMoment   0.399497

	Oblateness      0.0433635

	RotationPeriod  25.9168
	Obliquity       251.294
	EqAscendNode    41.6057

	AbsMagn         13.7058
	SlopeParam      6.86113
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.672 0.667 0.662)

	Surface
	{
		SurfStyle       0.326883
		OceanStyle      0.00277964
		Randomize      (0.204, 0.689, -0.995)
		colorDistMagn   0.750237
		colorDistFreq   0.0139902
		detailScale     144.466
		colorConversion true
		snowLevel       2
		tropicLatitude  0.923348
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.49121
		terraceProb     0.202864
		erosion         0
		montesMagn      0.446189
		montesFreq      2.72672
		montesSpiky     0.937373
		montesFraction  0.792532
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0909
		hillsFraction   0.725651
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226678
		craterFreq      0.18591
		craterDensity   1.01991
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.398087
		volcanoTemp     1540.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.269, 0.267, 0.265, 0.000)
		colorShelf     (0.286, 0.283, 0.281, 0.000)
		colorBeach     (0.302, 0.300, 0.298, 0.000)
		colorDesert    (0.319, 0.317, 0.314, 0.000)
		colorLowland   (0.336, 0.333, 0.331, 0.000)
		colorUpland    (0.353, 0.350, 0.348, 0.000)
		colorRock      (0.370, 0.367, 0.364, 0.000)
		colorSnow      (0.386, 0.383, 0.381, 1.000)
		BumpHeight      4.76144
		BumpOffset      0.952288
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.589828
		GasToDust   0.25
		Particles   2171
		GasBright   0.0214803
		DustBright  0.204423
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.03792
		Period          11.7579
		Eccentricity    0.93652
		Inclination     -4.3293
		AscendingNode   -26.1851
		ArgOfPericenter -26.0667
		MeanAnomaly     132.574
	}
}

Comet	"Foerost System C5"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            3.74886e-007
	Radius          95.5268
	InertiaMoment   0.398263

	Oblateness      0.03932

	RotationPeriod  23.69
	Obliquity       204.499
	EqAscendNode    26.1831

	AbsMagn         8.86271
	SlopeParam      2.2768
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.548 0.540 0.538)

	Surface
	{
		SurfStyle       0.122023
		OceanStyle      0.884036
		Randomize      (-0.717, 0.745, 0.769)
		colorDistMagn   0.248128
		colorDistFreq   2.14234
		detailScale     2608.52
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997023
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.699438
		terraceProb     0.338997
		erosion         0
		montesMagn      0.57047
		montesFreq      3.70427
		montesSpiky     0.933029
		montesFraction  0.845391
		dunesFraction   0
		hillsMagn       0
		hillsFreq       20.3027
		hillsFraction   0.716123
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236966
		craterFreq      0.290782
		craterDensity   0.987027
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.410638
		volcanoTemp     1600.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.219, 0.216, 0.215, 0.000)
		colorShelf     (0.233, 0.230, 0.228, 0.000)
		colorBeach     (0.247, 0.243, 0.242, 0.000)
		colorDesert    (0.260, 0.257, 0.255, 0.000)
		colorLowland   (0.274, 0.270, 0.269, 0.000)
		colorUpland    (0.288, 0.284, 0.282, 0.000)
		colorRock      (0.301, 0.297, 0.296, 0.000)
		colorSnow      (0.315, 0.311, 0.309, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.109494
		DustBright  0.600896
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.12912
		Period          25.7945
		Eccentricity    0.950248
		Inclination     -76.2924
		AscendingNode   -136.604
		ArgOfPericenter 151.689
		MeanAnomaly     119.507
	}
}

Comet	"Foerost System C6"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            1.1543e-014
	Radius          0.327675
	InertiaMoment   0.399921

	Oblateness      0.0637569

	RotationPeriod  21.3661
	Obliquity       157.705
	EqAscendNode    10.7605

	AbsMagn         5.27214
	SlopeParam      2.98859
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.745 0.676 0.576)

	Surface
	{
		SurfStyle       0.982755
		OceanStyle      0.805517
		Randomize      (0.844, 0.352, -0.402)
		colorDistMagn   0.282386
		colorDistFreq   4.64211e-005
		detailScale     8.9477
		colorConversion true
		snowLevel       2
		tropicLatitude  0.508259
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.68711
		terraceProb     0.33459
		erosion         0
		montesMagn      0.427033
		montesFreq      3.23498
		montesSpiky     0.860744
		montesFraction  0.533561
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000226607
		hillsFraction   0.466155
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251914
		craterFreq      0.270186
		craterDensity   0.813145
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.534744
		volcanoTemp     1244.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.253, 0.236, 0.230, 0.050)
		colorShelf     (0.298, 0.277, 0.265, 0.040)
		colorBeach     (0.343, 0.318, 0.300, 0.030)
		colorDesert    (0.387, 0.358, 0.340, 0.020)
		colorLowland   (0.432, 0.399, 0.374, 0.030)
		colorUpland    (0.477, 0.439, 0.409, 0.050)
		colorRock      (0.522, 0.480, 0.455, 0.020)
		colorSnow      (0.522, 0.480, 0.455, 1.000)
		BumpHeight      0.294907
		BumpOffset      0.0589814
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.141462
		GasToDust   0.25
		Particles   1265
		GasBright   0.0841785
		DustBright  0.310698
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.77022
		Period          10.2385
		Eccentricity    0.965154
		Inclination     16.7994
		AscendingNode   102.939
		ArgOfPericenter 143.096
		MeanAnomaly     -166.453
	}
}

Comet	"Foerost System C7"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            8.92769e-011
	Radius          5.91484
	InertiaMoment   0.398811

	Oblateness      0.0615401

	RotationPeriod  18.9254
	Obliquity       110.911
	EqAscendNode    355.338

	AbsMagn         13.1796
	SlopeParam      3.58909
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.460 0.456 0.451)

	Surface
	{
		SurfStyle       0.554998
		OceanStyle      0.537396
		Randomize      (0.255, -0.771, -0.161)
		colorDistMagn   0.862141
		colorDistFreq   0.00382452
		detailScale     161.515
		colorConversion true
		snowLevel       2
		tropicLatitude  0.99319
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.287038
		terraceProb     0.378851
		erosion         0
		montesMagn      0.597443
		montesFreq      2.85795
		montesSpiky     0.957426
		montesFraction  0.588695
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.105451
		hillsFraction   0.650739
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248601
		craterFreq      0.183847
		craterDensity   0.825777
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.538868
		volcanoTemp     1433.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.179, 0.155, 0.126, 0.000)
		colorShelf     (0.184, 0.159, 0.144, 0.000)
		colorBeach     (0.216, 0.187, 0.171, 0.000)
		colorDesert    (0.235, 0.200, 0.167, 0.000)
		colorLowland   (0.258, 0.214, 0.189, 0.000)
		colorUpland    (0.285, 0.260, 0.230, 0.000)
		colorRock      (0.308, 0.282, 0.248, 0.000)
		colorSnow      (0.336, 0.301, 0.261, 1.000)
		BumpHeight      5.32336
		BumpOffset      1.06467
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.622654
		GasToDust   0.25
		Particles   2237
		GasBright   0.239382
		DustBright  0.639981
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.66596
		Period          15.5863
		Eccentricity    0.954357
		Inclination     -27.2768
		AscendingNode   62.0396
		ArgOfPericenter -84.2295
		MeanAnomaly     -36.2851
	}
}

Comet	"Foerost System C8"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            6.90492e-007
	Radius          128.053
	InertiaMoment   0.397016

	Oblateness      0.107542

	RotationPeriod  16.3432
	Obliquity       64.1165
	EqAscendNode    339.915

	AbsMagn         8.65028
	SlopeParam      4.15398
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.616 0.612 0.611)

	Surface
	{
		SurfStyle       0.115571
		OceanStyle      0.279596
		Randomize      (-0.243, 0.456, 0.389)
		colorDistMagn   0.650111
		colorDistFreq   10.1539
		detailScale     3496.71
		colorConversion true
		snowLevel       2
		tropicLatitude  0.970997
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.507358
		terraceProb     0.397334
		erosion         0
		montesMagn      0.450011
		montesFreq      3.60031
		montesSpiky     0.933955
		montesFraction  0.478841
		dunesFraction   0
		hillsMagn       0
		hillsFreq       34.2149
		hillsFraction   0.41744
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221964
		craterFreq      0.690956
		craterDensity   0.808466
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.487383
		volcanoTemp     1397.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.246, 0.245, 0.244, 0.000)
		colorShelf     (0.262, 0.260, 0.260, 0.000)
		colorBeach     (0.277, 0.276, 0.275, 0.000)
		colorDesert    (0.293, 0.291, 0.290, 0.000)
		colorLowland   (0.308, 0.306, 0.305, 0.000)
		colorUpland    (0.323, 0.321, 0.321, 0.000)
		colorRock      (0.339, 0.337, 0.336, 0.000)
		colorSnow      (0.354, 0.352, 0.351, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.186785
		DustBright  0.377064
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.54176
		Period          14.801
		Eccentricity    0.954126
		Inclination     161.434
		AscendingNode   127.588
		ArgOfPericenter 128.985
		MeanAnomaly     -101.074
	}
}

Comet	"Foerost System C9"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            2.12608e-014
	Radius          0.366228
	InertiaMoment   0.399281

	Oblateness      0.119225

	RotationPeriod  13.5868
	Obliquity       17.3222
	EqAscendNode    324.493

	AbsMagn         5.00259
	SlopeParam      4.7317
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.740 0.738 0.737)

	Surface
	{
		SurfStyle       0.291944
		OceanStyle      0.976754
		Randomize      (0.312, 0.465, 0.352)
		colorDistMagn   0.61619
		colorDistFreq   0.000101501
		detailScale     10.0005
		colorConversion true
		snowLevel       2
		tropicLatitude  0.56653
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.586936
		terraceProb     0.410201
		erosion         0
		montesMagn      0.694038
		montesFreq      3.18244
		montesSpiky     0.908301
		montesFraction  0.438167
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000337838
		hillsFraction   0.666398
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233518
		craterFreq      0.196711
		craterDensity   0.873738
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.481076
		volcanoTemp     1532.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.296, 0.295, 0.295, 0.000)
		colorShelf     (0.315, 0.314, 0.313, 0.000)
		colorBeach     (0.333, 0.332, 0.332, 0.000)
		colorDesert    (0.352, 0.351, 0.350, 0.000)
		colorLowland   (0.370, 0.369, 0.369, 0.000)
		colorUpland    (0.389, 0.388, 0.387, 0.000)
		colorRock      (0.407, 0.406, 0.406, 0.000)
		colorSnow      (0.426, 0.425, 0.424, 1.000)
		BumpHeight      0.329605
		BumpOffset      0.0659211
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.174288
		GasToDust   0.25
		Particles   1331
		GasBright   0.0969286
		DustBright  0.151407
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.27712
		Period          13.1735
		Eccentricity    0.928356
		Inclination     20.2044
		AscendingNode   -45.6674
		ArgOfPericenter -10.3139
		MeanAnomaly     39.9779
	}
}

Comet	"Foerost System C10"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            1.64437e-010
	Radius          7.93125
	InertiaMoment   0.397939

	Oblateness      0.249

	RotationPeriod  10.6122
	Obliquity       330.528
	EqAscendNode    309.07

	AbsMagn         12.7303
	SlopeParam      5.37959
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.749 0.657 0.599)

	Surface
	{
		SurfStyle       0.2647
		OceanStyle      0.225265
		Randomize      (-0.911, -0.946, -0.879)
		colorDistMagn   0.736433
		colorDistFreq   0.022073
		detailScale     216.576
		colorConversion true
		snowLevel       2
		tropicLatitude  0.591538
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.292218
		terraceProb     0.328195
		erosion         0
		montesMagn      0.547302
		montesFreq      3.48744
		montesSpiky     0.979566
		montesFraction  0.612956
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.133377
		hillsFraction   0.713376
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23805
		craterFreq      0.210443
		craterDensity   0.909948
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.513427
		volcanoTemp     1477.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.300, 0.263, 0.240, 0.000)
		colorShelf     (0.318, 0.279, 0.255, 0.000)
		colorBeach     (0.337, 0.295, 0.270, 0.000)
		colorDesert    (0.356, 0.312, 0.285, 0.000)
		colorLowland   (0.375, 0.328, 0.300, 0.000)
		colorUpland    (0.393, 0.345, 0.315, 0.000)
		colorRock      (0.412, 0.361, 0.329, 0.000)
		colorSnow      (0.431, 0.378, 0.344, 1.000)
		BumpHeight      7.13813
		BumpOffset      1.42763
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.65548
		GasToDust   0.25
		Particles   2303
		GasBright   0.3293
		DustBright  0.403523
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.78742
		Period          23.2603
		Eccentricity    0.97753
		Inclination     18.1762
		AscendingNode   97.8184
		ArgOfPericenter 19.491
		MeanAnomaly     94.2276
	}
}

Comet	"Foerost System C11"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            5.06312e-018
	Radius          0.0226751
	InertiaMoment   0.399714

	Oblateness      0.249

	RotationPeriod  7.35761
	Obliquity       283.734
	EqAscendNode    293.648

	AbsMagn         8.43968
	SlopeParam      6.22385
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.633 0.626 0.624)

	Surface
	{
		SurfStyle       0.586701
		OceanStyle      0.655491
		Randomize      (0.959, -0.338, -0.886)
		colorDistMagn   0.61105
		colorDistFreq   2.2698e-007
		detailScale     0.619183
		colorConversion true
		snowLevel       2
		tropicLatitude  0.973597
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.697096
		terraceProb     0.306578
		erosion         0
		montesMagn      0.510181
		montesFreq      3.07804
		montesSpiky     0.922564
		montesFraction  0.734676
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.11816e-006
		hillsFraction   0.532899
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232205
		craterFreq      0.255454
		craterDensity   0.838555
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.512805
		volcanoTemp     1420.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.247, 0.213, 0.175, 0.000)
		colorShelf     (0.253, 0.219, 0.200, 0.000)
		colorBeach     (0.297, 0.257, 0.237, 0.000)
		colorDesert    (0.323, 0.275, 0.231, 0.000)
		colorLowland   (0.354, 0.294, 0.262, 0.000)
		colorUpland    (0.392, 0.357, 0.318, 0.000)
		colorRock      (0.424, 0.388, 0.343, 0.000)
		colorSnow      (0.462, 0.413, 0.362, 1.000)
		BumpHeight      0.0204076
		BumpOffset      0.00408153
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.00350678
		DustBright  0.413802
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.81316
		Period          16.5345
		Eccentricity    0.940697
		Inclination     175.955
		AscendingNode   82.8383
		ArgOfPericenter 63.2814
		MeanAnomaly     131.094
	}
}

Comet	"Foerost System C12"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            3.91596e-014
	Radius          0.49124
	InertiaMoment   0.398554

	Oblateness      0.249

	RotationPeriod  3.73176
	Obliquity       236.939
	EqAscendNode    278.225

	AbsMagn         4.71868
	SlopeParam      8.06669
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.799 0.798 0.797)

	Surface
	{
		SurfStyle       0.198331
		OceanStyle      0.608215
		Randomize      (-0.304, 0.560, 0.361)
		colorDistMagn   0.30269
		colorDistFreq   0.000159461
		detailScale     13.4141
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998836
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.408753
		terraceProb     0.110607
		erosion         0
		montesMagn      0.69488
		montesFreq      2.97588
		montesSpiky     0.943562
		montesFraction  0.432087
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000427597
		hillsFraction   0.408016
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231401
		craterFreq      0.190397
		craterDensity   0.857026
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.565936
		volcanoTemp     1339.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.319, 0.319, 0.000)
		colorShelf     (0.340, 0.339, 0.339, 0.000)
		colorBeach     (0.360, 0.359, 0.359, 0.000)
		colorDesert    (0.380, 0.379, 0.379, 0.000)
		colorLowland   (0.400, 0.399, 0.399, 0.000)
		colorUpland    (0.420, 0.419, 0.418, 0.000)
		colorRock      (0.440, 0.439, 0.438, 0.000)
		colorSnow      (0.460, 0.459, 0.458, 1.000)
		BumpHeight      0.442116
		BumpOffset      0.0884232
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.207114
		GasToDust   0.25
		Particles   1398
		GasBright   0.0608248
		DustBright  0.840971
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.72566
		Period          22.8116
		Eccentricity    0.954138
		Inclination     95.8635
		AscendingNode   90.5156
		ArgOfPericenter -119.972
		MeanAnomaly     106.504
	}
}

Comet	"Foerost System C13"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            3.02872e-010
	Radius          8.85806
	InertiaMoment   0.396133

	Oblateness      0.00132178

	RotationPeriod  127.849
	Obliquity       190.145
	EqAscendNode    262.802

	AbsMagn         12.334
	SlopeParam      2.64928
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.718 0.716 0.715)

	Surface
	{
		SurfStyle       0.355902
		OceanStyle      0.557292
		Randomize      (0.243, -0.437, 0.064)
		colorDistMagn   0.104331
		colorDistFreq   0.0561684
		detailScale     241.884
		colorConversion true
		snowLevel       2
		tropicLatitude  0.643024
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.485599
		terraceProb     0.205864
		erosion         0
		montesMagn      0.434573
		montesFreq      1.83252
		montesSpiky     0.827621
		montesFraction  0.420439
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.116419
		hillsFraction   0.535906
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250254
		craterFreq      0.250318
		craterDensity   0.693684
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.556953
		volcanoTemp     1579.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.287, 0.286, 0.286, 0.000)
		colorShelf     (0.305, 0.304, 0.304, 0.000)
		colorBeach     (0.323, 0.322, 0.322, 0.000)
		colorDesert    (0.341, 0.340, 0.339, 0.000)
		colorLowland   (0.359, 0.358, 0.357, 0.000)
		colorUpland    (0.377, 0.376, 0.375, 0.000)
		colorRock      (0.395, 0.394, 0.393, 0.000)
		colorSnow      (0.413, 0.411, 0.411, 1.000)
		BumpHeight      7.97225
		BumpOffset      1.59445
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.688306
		GasToDust   0.25
		Particles   2370
		GasBright   0.0741611
		DustBright  0.512121
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.49082
		Period          14.4828
		Eccentricity    0.978718
		Inclination     148.491
		AscendingNode   -142.856
		ArgOfPericenter 26.4631
		MeanAnomaly     134.406
	}
}

Comet	"Foerost System C14"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            9.32565e-018
	Radius          0.0304262
	InertiaMoment   0.399055

	Oblateness      0.00221116

	RotationPeriod  114.025
	Obliquity       143.351
	EqAscendNode    247.38

	AbsMagn         8.23029
	SlopeParam      3.2927
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.439 0.436 0.430)

	Surface
	{
		SurfStyle       0.325318
		OceanStyle      0.615704
		Randomize      (0.120, -0.185, -0.168)
		colorDistMagn   0.718706
		colorDistFreq   6.83499e-007
		detailScale     0.830838
		colorConversion true
		snowLevel       2
		tropicLatitude  0.996083
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.539085
		terraceProb     0.189101
		erosion         0
		montesMagn      0.528441
		montesFreq      3.9213
		montesSpiky     0.944194
		montesFraction  0.247165
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.71433e-006
		hillsFraction   0.625598
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241746
		craterFreq      0.173786
		craterDensity   0.59076
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.508246
		volcanoTemp     1446.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.176, 0.174, 0.172, 0.000)
		colorShelf     (0.187, 0.185, 0.183, 0.000)
		colorBeach     (0.198, 0.196, 0.194, 0.000)
		colorDesert    (0.209, 0.207, 0.204, 0.000)
		colorLowland   (0.220, 0.218, 0.215, 0.000)
		colorUpland    (0.231, 0.229, 0.226, 0.000)
		colorRock      (0.242, 0.240, 0.237, 0.000)
		colorSnow      (0.253, 0.251, 0.248, 1.000)
		BumpHeight      0.0273836
		BumpOffset      0.00547672
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0502382
		DustBright  0.22053
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.2059
		Period          12.7464
		Eccentricity    0.938395
		Inclination     -48.8512
		AscendingNode   -12.0899
		ArgOfPericenter 114.234
		MeanAnomaly     -86.5161
	}
}

Comet	"Foerost System C15"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            7.21272e-014
	Radius          0.548423
	InertiaMoment   0.397548

	Oblateness      0.00192391

	RotationPeriod  106.068
	Obliquity       96.5565
	EqAscendNode    231.957

	AbsMagn         4.41719
	SlopeParam      3.86894
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.623 0.617 0.613)

	Surface
	{
		SurfStyle       0.156064
		OceanStyle      0.619905
		Randomize      (0.453, -0.706, 0.706)
		colorDistMagn   0.818879
		colorDistFreq   5.00245e-005
		detailScale     14.9756
		colorConversion true
		snowLevel       2
		tropicLatitude  0.220847
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.368332
		terraceProb     0.463636
		erosion         0
		montesMagn      0.580239
		montesFreq      3.55952
		montesSpiky     0.895897
		montesFraction  0.550854
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00111176
		hillsFraction   0.757546
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223414
		craterFreq      0.236853
		craterDensity   1.00575
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.55911
		volcanoTemp     1495.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.249, 0.247, 0.245, 0.000)
		colorShelf     (0.265, 0.262, 0.260, 0.000)
		colorBeach     (0.280, 0.278, 0.276, 0.000)
		colorDesert    (0.296, 0.293, 0.291, 0.000)
		colorLowland   (0.312, 0.309, 0.306, 0.000)
		colorUpland    (0.327, 0.324, 0.322, 0.000)
		colorRock      (0.343, 0.340, 0.337, 0.000)
		colorSnow      (0.358, 0.355, 0.352, 1.000)
		BumpHeight      0.493581
		BumpOffset      0.0987161
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.23994
		GasToDust   0.25
		Particles   1464
		GasBright   0.184724
		DustBright  0.570532
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.98269
		Period          24.6978
		Eccentricity    0.968196
		Inclination     83.8716
		AscendingNode   178.626
		ArgOfPericenter -108.848
		MeanAnomaly     127.188
	}
}

Comet	"Foerost System C16"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            5.57853e-010
	Radius          11.8906
	InertiaMoment   0.399503

	Oblateness      0.00286024

	RotationPeriod  100.228
	Obliquity       49.7622
	EqAscendNode    216.535

	AbsMagn         11.9761
	SlopeParam      4.43429
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.768 0.764 0.763)

	Surface
	{
		SurfStyle       0.304302
		OceanStyle      0.675774
		Randomize      (-0.992, -0.410, -0.859)
		colorDistMagn   0.878363
		colorDistFreq   0.109342
		detailScale     324.693
		colorConversion true
		snowLevel       2
		tropicLatitude  0.945549
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.414361
		terraceProb     0.347564
		erosion         0
		montesMagn      0.257966
		montesFreq      2.91989
		montesSpiky     0.71585
		montesFraction  0.192422
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.290497
		hillsFraction   0.784586
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240795
		craterFreq      0.243534
		craterDensity   0.707276
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.438315
		volcanoTemp     1786.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.307, 0.306, 0.305, 0.000)
		colorShelf     (0.326, 0.325, 0.324, 0.000)
		colorBeach     (0.346, 0.344, 0.343, 0.000)
		colorDesert    (0.365, 0.363, 0.363, 0.000)
		colorLowland   (0.384, 0.382, 0.382, 0.000)
		colorUpland    (0.403, 0.401, 0.401, 0.000)
		colorRock      (0.422, 0.420, 0.420, 0.000)
		colorSnow      (0.442, 0.440, 0.439, 1.000)
		BumpHeight      10.7015
		BumpOffset      2.14031
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.721132
		GasToDust   0.25
		Particles   2436
		GasBright   0.133519
		DustBright  0.306223
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.57826
		Period          21.7528
		Eccentricity    0.949475
		Inclination     118.578
		AscendingNode   88.5915
		ArgOfPericenter 47.1754
		MeanAnomaly     85.2129
	}
}

Comet	"Foerost System C17"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            1.71767e-017
	Radius          0.0339532
	InertiaMoment   0.398271

	Oblateness      0.00237082

	RotationPeriod  95.5086
	Obliquity       2.96787
	EqAscendNode    201.112

	AbsMagn         8.02153
	SlopeParam      5.03749
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.645 0.639 0.635)

	Surface
	{
		SurfStyle       0.942602
		OceanStyle      0.253772
		Randomize      (0.762, 0.953, -0.440)
		colorDistMagn   0.659283
		colorDistFreq   6.55485e-007
		detailScale     0.927149
		colorConversion true
		snowLevel       2
		tropicLatitude  0.202079
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.610103
		terraceProb     0.397333
		erosion         0
		montesMagn      0.565882
		montesFreq      2.89824
		montesSpiky     0.959049
		montesFraction  0.37635
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.38442e-006
		hillsFraction   0.777861
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.271371
		craterFreq      0.194575
		craterDensity   0.76513
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.527601
		volcanoTemp     1289.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.219, 0.224, 0.254, 0.050)
		colorShelf     (0.258, 0.262, 0.292, 0.040)
		colorBeach     (0.296, 0.300, 0.330, 0.030)
		colorDesert    (0.335, 0.339, 0.375, 0.020)
		colorLowland   (0.374, 0.377, 0.413, 0.030)
		colorUpland    (0.412, 0.416, 0.451, 0.050)
		colorRock      (0.451, 0.454, 0.502, 0.020)
		colorSnow      (0.451, 0.454, 0.502, 1.000)
		BumpHeight      0.0305579
		BumpOffset      0.00611158
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.335194
		DustBright  0.589034
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.784
		Period          16.3452
		Eccentricity    0.96575
		Inclination     167.025
		AscendingNode   57.7166
		ArgOfPericenter 95.7365
		MeanAnomaly     4.54217
	}
}

Comet	"Foerost System C18"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            1.32849e-013
	Radius          0.73648
	InertiaMoment   0.399927

	Oblateness      0.00343055

	RotationPeriod  91.4889
	Obliquity       316.174
	EqAscendNode    185.689

	AbsMagn         4.09382
	SlopeParam      5.75658
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.674 0.519 0.396)

	Surface
	{
		SurfStyle       0.783344
		OceanStyle      0.00900603
		Randomize      (0.740, -0.245, 0.132)
		colorDistMagn   0.348013
		colorDistFreq   0.000334781
		detailScale     20.1108
		colorConversion true
		snowLevel       2
		tropicLatitude  0.91053
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.450507
		terraceProb     0.108191
		erosion         0
		montesMagn      0.437837
		montesFreq      2.46095
		montesSpiky     0.976364
		montesFraction  0.238019
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00153964
		hillsFraction   0.55245
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.209914
		craterFreq      0.245883
		craterDensity   0.9103
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.547556
		volcanoTemp     1517.53
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.263, 0.177, 0.111, 0.000)
		colorShelf     (0.270, 0.182, 0.127, 0.000)
		colorBeach     (0.317, 0.213, 0.151, 0.000)
		colorDesert    (0.344, 0.228, 0.147, 0.000)
		colorLowland   (0.378, 0.244, 0.166, 0.000)
		colorUpland    (0.418, 0.296, 0.202, 0.000)
		colorRock      (0.452, 0.322, 0.218, 0.000)
		colorSnow      (0.492, 0.343, 0.230, 1.000)
		BumpHeight      0.662832
		BumpOffset      0.132566
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.272766
		GasToDust   0.25
		Particles   1530
		GasBright   0.256707
		DustBright  0.352008
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.62628
		Period          15.334
		Eccentricity    0.957345
		Inclination     -76.831
		AscendingNode   31.0253
		ArgOfPericenter 131.051
		MeanAnomaly     -141.806
	}
}

Comet	"Foerost System C19"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            1.02749e-009
	Radius          13.2627
	InertiaMoment   0.398817

	Oblateness      0.00279146

	RotationPeriod  87.9486
	Obliquity       269.379
	EqAscendNode    170.267

	AbsMagn         11.6476
	SlopeParam      6.83982
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.634 0.555 0.401)

	Surface
	{
		SurfStyle       0.402902
		OceanStyle      0.940499
		Randomize      (-0.764, -0.743, 0.232)
		colorDistMagn   0.0416086
		colorDistFreq   0.151582
		detailScale     362.161
		colorConversion true
		snowLevel       2
		tropicLatitude  0.407797
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.401087
		terraceProb     0.633249
		erosion         0
		montesMagn      0.619145
		montesFreq      3.15245
		montesSpiky     0.88333
		montesFraction  0.235333
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.541898
		hillsFraction   0.48698
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248492
		craterFreq      0.198247
		craterDensity   0.939273
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.493774
		volcanoTemp     1306.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.254, 0.222, 0.161, 0.000)
		colorShelf     (0.269, 0.236, 0.171, 0.000)
		colorBeach     (0.285, 0.250, 0.181, 0.000)
		colorDesert    (0.301, 0.264, 0.191, 0.000)
		colorLowland   (0.317, 0.278, 0.201, 0.000)
		colorUpland    (0.333, 0.292, 0.211, 0.000)
		colorRock      (0.349, 0.305, 0.221, 0.000)
		colorSnow      (0.364, 0.319, 0.231, 1.000)
		BumpHeight      11.9364
		BumpOffset      2.38729
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.753958
		GasToDust   0.25
		Particles   2502
		GasBright   0.140961
		DustBright  0.15224
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.80199
		Period          16.4619
		Eccentricity    0.950457
		Inclination     65.5762
		AscendingNode   -176.332
		ArgOfPericenter 32.0247
		MeanAnomaly     129.783
	}
}

Comet	"Foerost System C20"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            3.16372e-017
	Radius          0.0456162
	InertiaMoment   0.397031

	Oblateness      0.00394515

	RotationPeriod  84.7577
	Obliquity       222.585
	EqAscendNode    154.844

	AbsMagn         7.81282
	SlopeParam      2.26559
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.416 0.410 0.404)

	Surface
	{
		SurfStyle       0.77459
		OceanStyle      0.209044
		Randomize      (-0.027, 0.707, -0.887)
		colorDistMagn   0.39338
		colorDistFreq   1.01118e-006
		detailScale     1.24563
		colorConversion true
		snowLevel       2
		tropicLatitude  0.617778
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.565182
		terraceProb     0.366194
		erosion         0
		montesMagn      0.418934
		montesFreq      3.53243
		montesSpiky     0.826623
		montesFraction  0.786598
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.0638e-006
		hillsFraction   0.78572
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.266375
		craterFreq      0.224513
		craterDensity   0.94862
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.498526
		volcanoTemp     1880.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.162, 0.140, 0.113, 0.000)
		colorShelf     (0.166, 0.144, 0.129, 0.000)
		colorBeach     (0.195, 0.168, 0.153, 0.000)
		colorDesert    (0.212, 0.181, 0.149, 0.000)
		colorLowland   (0.233, 0.193, 0.170, 0.000)
		colorUpland    (0.258, 0.234, 0.206, 0.000)
		colorRock      (0.278, 0.254, 0.222, 0.000)
		colorSnow      (0.303, 0.271, 0.234, 1.000)
		BumpHeight      0.0410546
		BumpOffset      0.00821092
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0309602
		DustBright  0.746728
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.82223
		Period          16.5935
		Eccentricity    0.943994
		Inclination     175.487
		AscendingNode   -10.4321
		ArgOfPericenter -146.608
		MeanAnomaly     -177.971
	}
}

Comet	"Foerost System C21"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            2.44691e-013
	Radius          0.821052
	InertiaMoment   0.399286

	Oblateness      0.00321795

	RotationPeriod  81.8321
	Obliquity       175.791
	EqAscendNode    139.422

	AbsMagn         3.74267
	SlopeParam      2.97981
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.523 0.518 0.515)

	Surface
	{
		SurfStyle       0.238567
		OceanStyle      0.975268
		Randomize      (-0.993, -0.534, -0.615)
		colorDistMagn   0.960169
		colorDistFreq   0.000302452
		detailScale     22.4202
		colorConversion true
		snowLevel       2
		tropicLatitude  0.32546
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.754087
		terraceProb     0.29816
		erosion         0
		montesMagn      0.494606
		montesFreq      2.69581
		montesSpiky     0.917208
		montesFraction  0.419353
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00178986
		hillsFraction   0.686446
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.271372
		craterFreq      0.240829
		craterDensity   0.866966
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.580049
		volcanoTemp     1935.24
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.209, 0.207, 0.206, 0.000)
		colorShelf     (0.222, 0.220, 0.219, 0.000)
		colorBeach     (0.235, 0.233, 0.232, 0.000)
		colorDesert    (0.248, 0.246, 0.245, 0.000)
		colorLowland   (0.261, 0.259, 0.257, 0.000)
		colorUpland    (0.274, 0.272, 0.270, 0.000)
		colorRock      (0.287, 0.285, 0.283, 0.000)
		colorSnow      (0.301, 0.298, 0.296, 1.000)
		BumpHeight      0.738947
		BumpOffset      0.147789
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.305592
		GasToDust   0.25
		Particles   1597
		GasBright   0.0456887
		DustBright  0.416486
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.50742
		Period          28.7002
		Eccentricity    0.96146
		Inclination     16.1776
		AscendingNode   126.82
		ArgOfPericenter -165.301
		MeanAnomaly     117.333
	}
}

Comet	"Foerost System C22"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            1.89251e-009
	Radius          17.8271
	InertiaMoment   0.397947

	Oblateness      0.00453358

	RotationPeriod  79.1145
	Obliquity       128.996
	EqAscendNode    123.999

	AbsMagn         11.342
	SlopeParam      3.5812
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.505 0.503 0.500)

	Surface
	{
		SurfStyle       0.778815
		OceanStyle      0.782668
		Randomize      (-0.480, -0.129, -0.263)
		colorDistMagn   0.62799
		colorDistFreq   0.162699
		detailScale     486.798
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0405779
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.547441
		terraceProb     0.208244
		erosion         0
		montesMagn      0.393312
		montesFreq      3.71384
		montesSpiky     0.937321
		montesFraction  0.545351
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.800857
		hillsFraction   0.748301
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236249
		craterFreq      0.259116
		craterDensity   0.888245
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.544632
		volcanoTemp     1434.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.197, 0.171, 0.140, 0.000)
		colorShelf     (0.202, 0.176, 0.160, 0.000)
		colorBeach     (0.237, 0.206, 0.190, 0.000)
		colorDesert    (0.258, 0.221, 0.185, 0.000)
		colorLowland   (0.283, 0.237, 0.210, 0.000)
		colorUpland    (0.313, 0.287, 0.255, 0.000)
		colorRock      (0.339, 0.312, 0.275, 0.000)
		colorSnow      (0.369, 0.332, 0.290, 1.000)
		BumpHeight      16.0444
		BumpOffset      3.20887
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.786784
		GasToDust   0.25
		Particles   2569
		GasBright   0.149479
		DustBright  0.797182
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.07411
		Period          18.2605
		Eccentricity    0.949248
		Inclination     -50.7725
		AscendingNode   -177.017
		ArgOfPericenter -12.2307
		MeanAnomaly     -141.443
	}
}

Comet	"Foerost System C23"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            5.82719e-017
	Radius          0.0508269
	InertiaMoment   0.399719

	Oblateness      0.00366788

	RotationPeriod  76.5637
	Obliquity       82.2021
	EqAscendNode    108.576

	AbsMagn         7.60361
	SlopeParam      4.14624
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.717 0.715 0.714)

	Surface
	{
		SurfStyle       0.112772
		OceanStyle      0.347935
		Randomize      (0.237, 0.615, 0.215)
		colorDistMagn   0.884045
		colorDistFreq   8.70584e-007
		detailScale     1.38791
		colorConversion true
		snowLevel       2
		tropicLatitude  0.675605
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.326801
		terraceProb     0.333229
		erosion         0
		montesMagn      0.409009
		montesFreq      3.65343
		montesSpiky     0.883084
		montesFraction  0.645859
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.96811e-006
		hillsFraction   0.553655
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240006
		craterFreq      0.209708
		craterDensity   0.816184
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.570751
		volcanoTemp     1490.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.287, 0.286, 0.285, 0.000)
		colorShelf     (0.305, 0.304, 0.303, 0.000)
		colorBeach     (0.323, 0.322, 0.321, 0.000)
		colorDesert    (0.341, 0.339, 0.339, 0.000)
		colorLowland   (0.359, 0.357, 0.357, 0.000)
		colorUpland    (0.377, 0.375, 0.375, 0.000)
		colorRock      (0.395, 0.393, 0.392, 0.000)
		colorSnow      (0.412, 0.411, 0.410, 1.000)
		BumpHeight      0.0457442
		BumpOffset      0.00914885
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.136925
		DustBright  0.494223
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.30375
		Period          19.8259
		Eccentricity    0.945691
		Inclination     -46.6653
		AscendingNode   -26.636
		ArgOfPericenter 33.2681
		MeanAnomaly     68.1106
	}
}

Comet	"Foerost System C24"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            4.50692e-013
	Radius          1.10419
	InertiaMoment   0.398561

	Oblateness      0.00516168

	RotationPeriod  74.1488
	Obliquity       35.4078
	EqAscendNode    93.1539

	AbsMagn         3.35521
	SlopeParam      4.72345
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.585 0.582 0.579)

	Surface
	{
		SurfStyle       0.486655
		OceanStyle      0.335082
		Randomize      (-0.918, -0.523, -0.221)
		colorDistMagn   0.492554
		colorDistFreq   0.000434324
		detailScale     30.1516
		colorConversion true
		snowLevel       2
		tropicLatitude  0.465788
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.527061
		terraceProb     0.186744
		erosion         0
		montesMagn      0.609131
		montesFreq      2.56677
		montesSpiky     0.864703
		montesFraction  0.776173
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00261682
		hillsFraction   0.770944
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219872
		craterFreq      0.192932
		craterDensity   0.880967
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.508836
		volcanoTemp     1743.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.234, 0.233, 0.231, 0.000)
		colorShelf     (0.249, 0.248, 0.246, 0.000)
		colorBeach     (0.263, 0.262, 0.260, 0.000)
		colorDesert    (0.278, 0.277, 0.275, 0.000)
		colorLowland   (0.292, 0.291, 0.289, 0.000)
		colorUpland    (0.307, 0.306, 0.304, 0.000)
		colorRock      (0.322, 0.320, 0.318, 0.000)
		colorSnow      (0.336, 0.335, 0.333, 1.000)
		BumpHeight      0.993767
		BumpOffset      0.198753
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.338418
		GasToDust   0.25
		Particles   1663
		GasBright   0.0871124
		DustBright  0.228522
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.93942
		Period          11.1907
		Eccentricity    0.928412
		Inclination     41.2888
		AscendingNode   135.455
		ArgOfPericenter -173.006
		MeanAnomaly     -106.502
	}
}

Comet	"Foerost System C25"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            3.48578e-009
	Radius          19.8518
	InertiaMoment   0.396167

	Oblateness      0.00409401

	RotationPeriod  71.8462
	Obliquity       348.613
	EqAscendNode    77.7313

	AbsMagn         11.0547
	SlopeParam      5.36981
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.619 0.612 0.608)

	Surface
	{
		SurfStyle       0.889815
		OceanStyle      0.102293
		Randomize      (-0.103, -0.644, -0.019)
		colorDistMagn   0.416133
		colorDistFreq   0.124773
		detailScale     542.088
		colorConversion true
		snowLevel       2
		tropicLatitude  0.984784
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.523925
		terraceProb     0.207729
		erosion         0
		montesMagn      0.227074
		montesFreq      2.65422
		montesSpiky     0.892501
		montesFraction  0.646244
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.3685
		hillsFraction   0.575155
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227266
		craterFreq      0.253035
		craterDensity   0.926438
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.457093
		volcanoTemp     1157.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.210, 0.214, 0.243, 0.050)
		colorShelf     (0.248, 0.251, 0.280, 0.040)
		colorBeach     (0.285, 0.288, 0.316, 0.030)
		colorDesert    (0.322, 0.325, 0.359, 0.020)
		colorLowland   (0.359, 0.361, 0.395, 0.030)
		colorUpland    (0.396, 0.398, 0.432, 0.050)
		colorRock      (0.433, 0.435, 0.480, 0.020)
		colorSnow      (0.433, 0.435, 0.480, 1.000)
		BumpHeight      17.8667
		BumpOffset      3.57333
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.81961
		GasToDust   0.25
		Particles   2635
		GasBright   0.26807
		DustBright  0.532051
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.79697
		Period          23.33
		Eccentricity    0.954422
		Inclination     -79.2647
		AscendingNode   -87.392
		ArgOfPericenter 146.52
		MeanAnomaly     -62.5791
	}
}

Comet	"Foerost System C26"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            1.0733e-016
	Radius          0.068392
	InertiaMoment   0.399061

	Oblateness      0.00585032

	RotationPeriod  69.6373
	Obliquity       301.819
	EqAscendNode    62.3087

	AbsMagn         7.3933
	SlopeParam      6.20959
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.422 0.418 0.412)

	Surface
	{
		SurfStyle       0.259267
		OceanStyle      0.473784
		Randomize      (0.488, 0.331, -0.808)
		colorDistMagn   0.907838
		colorDistFreq   2.29536e-006
		detailScale     1.86756
		colorConversion true
		snowLevel       2
		tropicLatitude  0.608644
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.592385
		terraceProb     0.304221
		erosion         0
		montesMagn      0.461802
		montesFreq      3.47204
		montesSpiky     0.939428
		montesFraction  0.454604
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.12487e-005
		hillsFraction   0.807894
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230536
		craterFreq      0.216594
		craterDensity   0.955148
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.527223
		volcanoTemp     1571.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.169, 0.167, 0.165, 0.000)
		colorShelf     (0.179, 0.177, 0.175, 0.000)
		colorBeach     (0.190, 0.188, 0.185, 0.000)
		colorDesert    (0.200, 0.198, 0.196, 0.000)
		colorLowland   (0.211, 0.209, 0.206, 0.000)
		colorUpland    (0.221, 0.219, 0.216, 0.000)
		colorRock      (0.232, 0.230, 0.226, 0.000)
		colorSnow      (0.243, 0.240, 0.237, 1.000)
		BumpHeight      0.0615528
		BumpOffset      0.0123106
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.190975
		DustBright  0.293632
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.80576
		Period          16.4864
		Eccentricity    0.973062
		Inclination     154.354
		AscendingNode   -149.892
		ArgOfPericenter -161.181
		MeanAnomaly     -139.41
	}
}

Comet	"Foerost System C27"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            8.30117e-013
	Radius          1.22882
	InertiaMoment   0.397559

	Oblateness      0.0046425

	RotationPeriod  67.5071
	Obliquity       255.025
	EqAscendNode    46.8861

	AbsMagn         2.91843
	SlopeParam      8.00752
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.643 0.636 0.632)

	Surface
	{
		SurfStyle       0.587879
		OceanStyle      0.334262
		Randomize      (-0.475, 0.203, 0.975)
		colorDistMagn   0.893694
		colorDistFreq   0.000218488
		detailScale     33.5551
		colorConversion true
		snowLevel       2
		tropicLatitude  0.887537
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.628642
		terraceProb     0.529858
		erosion         0
		montesMagn      0.462449
		montesFreq      3.26476
		montesSpiky     0.887474
		montesFraction  0.471786
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00367026
		hillsFraction   0.642396
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23477
		craterFreq      0.19223
		craterDensity   0.918169
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.501153
		volcanoTemp     1333.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.251, 0.216, 0.177, 0.000)
		colorShelf     (0.257, 0.222, 0.202, 0.000)
		colorBeach     (0.302, 0.261, 0.240, 0.000)
		colorDesert    (0.328, 0.280, 0.234, 0.000)
		colorLowland   (0.360, 0.299, 0.265, 0.000)
		colorUpland    (0.398, 0.362, 0.322, 0.000)
		colorRock      (0.431, 0.394, 0.348, 0.000)
		colorSnow      (0.469, 0.420, 0.366, 1.000)
		BumpHeight      1.10594
		BumpOffset      0.221188
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.371243
		GasToDust   0.25
		Particles   1729
		GasBright   0.439123
		DustBright  0.529971
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.44715
		Period          14.212
		Eccentricity    0.931502
		Inclination     -34.9225
		AscendingNode   -63.2556
		ArgOfPericenter 179.477
		MeanAnomaly     -84.6526
	}
}

Comet	"Foerost System C28"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            6.42036e-009
	Radius          26.7282
	InertiaMoment   0.399508

	Oblateness      0.00662093

	RotationPeriod  65.4431
	Obliquity       208.231
	EqAscendNode    31.4635

	AbsMagn         10.7824
	SlopeParam      2.63957
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.475 0.471 0.469)

	Surface
	{
		SurfStyle       0.693722
		OceanStyle      0.337397
		Randomize      (-0.167, -0.803, -0.758)
		colorDistMagn   0.84448
		colorDistFreq   0.471055
		detailScale     729.859
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999942
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.565589
		terraceProb     0.331173
		erosion         0
		montesMagn      0.520229
		montesFreq      3.33953
		montesSpiky     0.858927
		montesFraction  0.732371
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.70176
		hillsFraction   0.736081
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262599
		craterFreq      0.238465
		craterDensity   0.983788
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.534696
		volcanoTemp     1459.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.185, 0.160, 0.131, 0.000)
		colorShelf     (0.190, 0.165, 0.150, 0.000)
		colorBeach     (0.223, 0.193, 0.178, 0.000)
		colorDesert    (0.242, 0.207, 0.173, 0.000)
		colorLowland   (0.266, 0.221, 0.197, 0.000)
		colorUpland    (0.294, 0.269, 0.239, 0.000)
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
		MaxLength   0.852435
		GasToDust   0.25
		Particles   2701
		GasBright   0.0079558
		DustBright  0.645625
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.41323
		Period          20.5872
		Eccentricity    0.961936
		Inclination     -118.031
		AscendingNode   15.0196
		ArgOfPericenter 24.1478
		MeanAnomaly     -41.7645
	}
}

Comet	"Foerost System C29"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            1.97687e-016
	Radius          0.0760604
	InertiaMoment   0.398278

	Oblateness      0.00524969

	RotationPeriod  63.4349
	Obliquity       161.436
	EqAscendNode    16.0409

	AbsMagn         7.18131
	SlopeParam      3.28448
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.418 0.416 0.414)

	Surface
	{
		SurfStyle       0.955283
		OceanStyle      0.85014
		Randomize      (0.029, -0.858, -0.907)
		colorDistMagn   0.00774664
		colorDistFreq   4.93853e-006
		detailScale     2.07696
		colorConversion true
		snowLevel       2
		tropicLatitude  0.56648
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.746105
		terraceProb     0.123548
		erosion         0
		montesMagn      0.463068
		montesFreq      2.6071
		montesSpiky     0.960561
		montesFraction  0.836295
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.9212e-005
		hillsFraction   0.639876
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248701
		craterFreq      0.202695
		craterDensity   0.947486
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.511935
		volcanoTemp     1179.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.142, 0.146, 0.166, 0.050)
		colorShelf     (0.167, 0.171, 0.190, 0.040)
		colorBeach     (0.192, 0.196, 0.215, 0.030)
		colorDesert    (0.217, 0.221, 0.244, 0.020)
		colorLowland   (0.243, 0.246, 0.269, 0.030)
		colorUpland    (0.268, 0.270, 0.294, 0.050)
		colorRock      (0.293, 0.295, 0.327, 0.020)
		colorSnow      (0.293, 0.295, 0.327, 1.000)
		BumpHeight      0.0684544
		BumpOffset      0.0136909
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0240764
		DustBright  0.313991
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.17164
		Period          18.9201
		Eccentricity    0.967196
		Inclination     -127.602
		AscendingNode   13.1144
		ArgOfPericenter -17.1533
		MeanAnomaly     19.642
	}
}

Comet	"Foerost System C30"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            1.52897e-012
	Radius          1.65553
	InertiaMoment   0.399932

	Oblateness      0.00749922

	RotationPeriod  61.4737
	Obliquity       114.642
	EqAscendNode    0.618356

	AbsMagn         2.41086
	SlopeParam      3.86121
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.632 0.626 0.622)

	Surface
	{
		SurfStyle       0.970032
		OceanStyle      0.246634
		Randomize      (0.954, 0.723, 0.792)
		colorDistMagn   0.852322
		colorDistFreq   0.00162487
		detailScale     45.2069
		colorConversion true
		snowLevel       2
		tropicLatitude  0.67491
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.580377
		terraceProb     0.173541
		erosion         0
		montesMagn      0.575028
		montesFreq      3.36872
		montesSpiky     0.988457
		montesFraction  0.692507
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00556841
		hillsFraction   0.866788
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.21728
		craterFreq      0.244559
		craterDensity   0.998178
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.610684
		volcanoTemp     1319.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.215, 0.219, 0.249, 0.050)
		colorShelf     (0.253, 0.257, 0.286, 0.040)
		colorBeach     (0.291, 0.294, 0.323, 0.030)
		colorDesert    (0.328, 0.332, 0.367, 0.020)
		colorLowland   (0.366, 0.370, 0.404, 0.030)
		colorUpland    (0.404, 0.407, 0.441, 0.050)
		colorRock      (0.442, 0.445, 0.491, 0.020)
		colorSnow      (0.442, 0.445, 0.491, 1.000)
		BumpHeight      1.48997
		BumpOffset      0.297995
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.404069
		GasToDust   0.25
		Particles   1796
		GasBright   0.107148
		DustBright  0.715405
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.08536
		Period          12.0343
		Eccentricity    0.89766
		Inclination     -103.881
		AscendingNode   161.736
		ArgOfPericenter 97.731
		MeanAnomaly     118.634
	}
}

Comet	"Foerost System C31"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            1.18255e-008
	Radius          29.7035
	InertiaMoment   0.398823

	Oblateness      0.00594284

	RotationPeriod  59.5517
	Obliquity       67.8477
	EqAscendNode    345.196

	AbsMagn         10.5225
	SlopeParam      4.4264
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.697 0.612 0.557)

	Surface
	{
		SurfStyle       0.0775652
		OceanStyle      0.467919
		Randomize      (0.528, -0.797, -0.016)
		colorDistMagn   0.668808
		colorDistFreq   0.420266
		detailScale     811.102
		colorConversion true
		snowLevel       2
		tropicLatitude  0.964399
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.306126
		terraceProb     0.328353
		erosion         0
		montesMagn      0.333993
		montesFreq      2.81321
		montesSpiky     0.936866
		montesFraction  0.612825
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.09268
		hillsFraction   0.566288
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250316
		craterFreq      0.207281
		craterDensity   0.989651
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.467863
		volcanoTemp     1489.53
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.279, 0.245, 0.223, 0.000)
		colorShelf     (0.296, 0.260, 0.237, 0.000)
		colorBeach     (0.314, 0.275, 0.251, 0.000)
		colorDesert    (0.331, 0.291, 0.264, 0.000)
		colorLowland   (0.349, 0.306, 0.278, 0.000)
		colorUpland    (0.366, 0.321, 0.292, 0.000)
		colorRock      (0.383, 0.337, 0.306, 0.000)
		colorSnow      (0.401, 0.352, 0.320, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.885261
		GasToDust   0.25
		Particles   2768
		GasBright   0.095987
		DustBright  0.411053
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.48185
		Period          21.0692
		Eccentricity    0.948448
		Inclination     -173.101
		AscendingNode   8.97358
		ArgOfPericenter 74.9748
		MeanAnomaly     -18.8843
	}
}

Comet	"Foerost System C32"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            3.64116e-016
	Radius          0.102542
	InertiaMoment   0.397047

	Oblateness      0.00841353

	RotationPeriod  57.6621
	Obliquity       21.0534
	EqAscendNode    329.773

	AbsMagn         6.96698
	SlopeParam      5.02867
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.549 0.544 0.541)

	Surface
	{
		SurfStyle       0.419865
		OceanStyle      0.135748
		Randomize      (-0.426, -0.239, 0.615)
		colorDistMagn   0.807053
		colorDistFreq   5.54406e-006
		detailScale     2.80009
		colorConversion true
		snowLevel       2
		tropicLatitude  0.971531
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.468736
		terraceProb     0.362771
		erosion         0
		montesMagn      0.459902
		montesFreq      2.8749
		montesSpiky     0.900547
		montesFraction  0.639442
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.20367e-005
		hillsFraction   0.742653
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.211557
		craterFreq      0.14272
		craterDensity   0.706794
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.460959
		volcanoTemp     1646.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.220, 0.218, 0.216, 0.000)
		colorShelf     (0.233, 0.231, 0.230, 0.000)
		colorBeach     (0.247, 0.245, 0.243, 0.000)
		colorDesert    (0.261, 0.258, 0.257, 0.000)
		colorLowland   (0.274, 0.272, 0.270, 0.000)
		colorUpland    (0.288, 0.286, 0.284, 0.000)
		colorRock      (0.302, 0.299, 0.297, 0.000)
		colorSnow      (0.316, 0.313, 0.311, 1.000)
		BumpHeight      0.0922882
		BumpOffset      0.0184576
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.246249
		DustBright  0.745278
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.97855
		Period          17.6218
		Eccentricity    0.947344
		Inclination     97.305
		AscendingNode   176.288
		ArgOfPericenter 51.3738
		MeanAnomaly     129.429
	}
}

Comet	"Foerost System C33"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            2.81618e-012
	Radius          1.83836
	InertiaMoment   0.399292

	Oblateness      0.00675041

	RotationPeriod  55.7987
	Obliquity       334.259
	EqAscendNode    314.351

	AbsMagn         1.79282
	SlopeParam      5.74526
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.564 0.557 0.553)

	Surface
	{
		SurfStyle       0.740145
		OceanStyle      0.570705
		Randomize      (0.170, -0.801, -0.160)
		colorDistMagn   0.489209
		colorDistFreq   0.00208372
		detailScale     50.1996
		colorConversion true
		snowLevel       2
		tropicLatitude  0.470941
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.362069
		terraceProb     0.181189
		erosion         0
		montesMagn      0.622029
		montesFreq      3.07767
		montesSpiky     0.870548
		montesFraction  0.365075
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00762459
		hillsFraction   0.759684
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.269113
		craterFreq      0.213555
		craterDensity   0.825772
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.466534
		volcanoTemp     1590.25
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.220, 0.190, 0.155, 0.000)
		colorShelf     (0.226, 0.195, 0.177, 0.000)
		colorBeach     (0.265, 0.229, 0.210, 0.000)
		colorDesert    (0.288, 0.245, 0.205, 0.000)
		colorLowland   (0.316, 0.262, 0.232, 0.000)
		colorUpland    (0.350, 0.318, 0.282, 0.000)
		colorRock      (0.378, 0.346, 0.304, 0.000)
		colorSnow      (0.412, 0.368, 0.321, 1.000)
		BumpHeight      1.65453
		BumpOffset      0.330906
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.436895
		GasToDust   0.25
		Particles   1862
		GasBright   0.207806
		DustBright  0.468208
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.13924
		Period          25.8709
		Eccentricity    0.95955
		Inclination     -167.721
		AscendingNode   88.7578
		ArgOfPericenter -33.6993
		MeanAnomaly     141.529
	}
}

Comet	"Foerost System C34"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            2.17811e-008
	Radius          40.0749
	InertiaMoment   0.397956

	Oblateness      0.00962111

	RotationPeriod  53.956
	Obliquity       287.465
	EqAscendNode    298.928

	AbsMagn         10.2728
	SlopeParam      6.81883
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.406 0.401 0.397)

	Surface
	{
		SurfStyle       0.414256
		OceanStyle      0.466717
		Randomize      (-0.097, 0.540, -0.415)
		colorDistMagn   0.613659
		colorDistFreq   0.790476
		detailScale     1094.31
		colorConversion true
		snowLevel       2
		tropicLatitude  0.805854
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.385203
		terraceProb     0.428676
		erosion         0
		montesMagn      0.538206
		montesFreq      2.97483
		montesSpiky     0.883069
		montesFraction  0.575411
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.56806
		hillsFraction   0.660775
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228127
		craterFreq      0.217681
		craterDensity   0.995635
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.487536
		volcanoTemp     1538.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.162, 0.161, 0.159, 0.000)
		colorShelf     (0.172, 0.171, 0.169, 0.000)
		colorBeach     (0.183, 0.181, 0.179, 0.000)
		colorDesert    (0.193, 0.191, 0.189, 0.000)
		colorLowland   (0.203, 0.201, 0.199, 0.000)
		colorUpland    (0.213, 0.211, 0.209, 0.000)
		colorRock      (0.223, 0.221, 0.218, 0.000)
		colorSnow      (0.233, 0.231, 0.228, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.918087
		GasToDust   0.25
		Particles   2834
		GasBright   0.132103
		DustBright  0.228397
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.2838
		Period          19.6882
		Eccentricity    0.954325
		Inclination     127.128
		AscendingNode   122.708
		ArgOfPericenter 19.6374
		MeanAnomaly     47.8471
	}
}

Comet	"Foerost System C35"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            6.70657e-016
	Radius          0.113771
	InertiaMoment   0.399724

	Oblateness      0.00771047

	RotationPeriod  52.1289
	Obliquity       240.671
	EqAscendNode    283.505

	AbsMagn         6.74965
	SlopeParam      2.25433
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.776 0.772 0.769)

	Surface
	{
		SurfStyle       0.721476
		OceanStyle      0.873772
		Randomize      (0.054, 0.093, -0.768)
		colorDistMagn   0.517715
		colorDistFreq   1.87397e-006
		detailScale     3.1067
		colorConversion true
		snowLevel       2
		tropicLatitude  0.514336
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.542562
		terraceProb     0.180705
		erosion         0
		montesMagn      0.583225
		montesFreq      2.67013
		montesSpiky     0.891644
		montesFraction  0.400514
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.50705e-005
		hillsFraction   0.498125
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223692
		craterFreq      0.274553
		craterDensity   0.828135
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.483475
		volcanoTemp     1424.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.303, 0.262, 0.215, 0.000)
		colorShelf     (0.310, 0.270, 0.246, 0.000)
		colorBeach     (0.365, 0.317, 0.292, 0.000)
		colorDesert    (0.396, 0.340, 0.285, 0.000)
		colorLowland   (0.434, 0.363, 0.323, 0.000)
		colorUpland    (0.481, 0.440, 0.392, 0.000)
		colorRock      (0.520, 0.479, 0.423, 0.000)
		colorSnow      (0.566, 0.510, 0.446, 1.000)
		BumpHeight      0.102394
		BumpOffset      0.0204787
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.359533
		DustBright  0.485454
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.24344
		Period          12.971
		Eccentricity    0.94622
		Inclination     55.5573
		AscendingNode   143.849
		ArgOfPericenter 106.309
		MeanAnomaly     123.983
	}
}

Comet	"Foerost System C36"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            5.18703e-012
	Radius          2.48223
	InertiaMoment   0.398568

	Oblateness      0.0110668

	RotationPeriod  50.3123
	Obliquity       193.876
	EqAscendNode    268.083

	AbsMagn         0.976145
	SlopeParam      2.97101
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.717 0.715 0.714)

	Surface
	{
		SurfStyle       0.301373
		OceanStyle      0.0676994
		Randomize      (-0.962, 0.585, 0.270)
		colorDistMagn   0.0183712
		colorDistFreq   0.00408518
		detailScale     67.7814
		colorConversion true
		snowLevel       2
		tropicLatitude  0.936591
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.763475
		terraceProb     0.298247
		erosion         0
		montesMagn      0.535971
		montesFreq      2.1121
		montesSpiky     0.869335
		montesFraction  0.166366
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.015127
		hillsFraction   0.759807
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241221
		craterFreq      0.254217
		craterDensity   0.969847
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.494481
		volcanoTemp     1225.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.287, 0.286, 0.285, 0.000)
		colorShelf     (0.305, 0.304, 0.303, 0.000)
		colorBeach     (0.322, 0.322, 0.321, 0.000)
		colorDesert    (0.340, 0.340, 0.339, 0.000)
		colorLowland   (0.358, 0.358, 0.357, 0.000)
		colorUpland    (0.376, 0.376, 0.375, 0.000)
		colorRock      (0.394, 0.393, 0.393, 0.000)
		colorSnow      (0.412, 0.411, 0.410, 1.000)
		BumpHeight      2.23401
		BumpOffset      0.446801
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.469721
		GasToDust   0.25
		Particles   1928
		GasBright   0.256548
		DustBright  0.272925
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.57562
		Period          21.734
		Eccentricity    0.959615
		Inclination     83.3609
		AscendingNode   179.044
		ArgOfPericenter 168.042
		MeanAnomaly     -172.664
	}
}

Comet	"Foerost System C37"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            4.01179e-008
	Radius          44.4221
	InertiaMoment   0.396199

	Oblateness      0.00874688

	RotationPeriod  48.5015
	Obliquity       147.082
	EqAscendNode    252.66

	AbsMagn         10.0316
	SlopeParam      3.57331
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.512 0.507 0.501)

	Surface
	{
		SurfStyle       0.58713
		OceanStyle      0.00840232
		Randomize      (-0.122, -0.010, 0.250)
		colorDistMagn   0.347684
		colorDistFreq   1.67254
		detailScale     1213.02
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998929
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.331348
		terraceProb     0.550416
		erosion         0
		montesMagn      0.571129
		montesFreq      3.46013
		montesSpiky     0.984027
		montesFraction  0.314872
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.69506
		hillsFraction   0.624444
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238824
		craterFreq      0.183015
		craterDensity   0.765938
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.496756
		volcanoTemp     1483.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.200, 0.172, 0.140, 0.000)
		colorShelf     (0.205, 0.177, 0.160, 0.000)
		colorBeach     (0.241, 0.208, 0.190, 0.000)
		colorDesert    (0.261, 0.223, 0.185, 0.000)
		colorLowland   (0.287, 0.238, 0.210, 0.000)
		colorUpland    (0.318, 0.289, 0.255, 0.000)
		colorRock      (0.343, 0.314, 0.275, 0.000)
		colorSnow      (0.374, 0.335, 0.290, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.950913
		GasToDust   0.25
		Particles   2900
		GasBright   0.00932436
		DustBright  0.204635
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.03665
		Period          18.0092
		Eccentricity    0.974382
		Inclination     -66.5939
		AscendingNode   54.8391
		ArgOfPericenter -107.019
		MeanAnomaly     -44.1904
	}
}

Comet	"Foerost System C38"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            1.23526e-015
	Radius          0.153749
	InertiaMoment   0.399067

	Oblateness      0.0128461

	RotationPeriod  46.6921
	Obliquity       100.288
	EqAscendNode    237.238

	AbsMagn         6.52856
	SlopeParam      4.13851
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.449 0.445 0.444)

	Surface
	{
		SurfStyle       0.298278
		OceanStyle      0.0843622
		Randomize      (-0.156, -0.317, -0.403)
		colorDistMagn   0.761502
		colorDistFreq   1.1866e-005
		detailScale     4.19838
		colorConversion true
		snowLevel       2
		tropicLatitude  0.989676
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.474167
		terraceProb     0.236247
		erosion         0
		montesMagn      0.47063
		montesFreq      2.04999
		montesSpiky     0.790311
		montesFraction  0.789056
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.46955e-005
		hillsFraction   0.800336
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243304
		craterFreq      0.216913
		craterDensity   1.04684
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.446444
		volcanoTemp     1419.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.180, 0.178, 0.177, 0.000)
		colorShelf     (0.191, 0.189, 0.189, 0.000)
		colorBeach     (0.202, 0.200, 0.200, 0.000)
		colorDesert    (0.213, 0.211, 0.211, 0.000)
		colorLowland   (0.224, 0.223, 0.222, 0.000)
		colorUpland    (0.236, 0.234, 0.233, 0.000)
		colorRock      (0.247, 0.245, 0.244, 0.000)
		colorSnow      (0.258, 0.256, 0.255, 1.000)
		BumpHeight      0.138374
		BumpOffset      0.0276749
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0213551
		GasToDust   0.25
		Particles   1022
		GasBright   0.0716782
		DustBright  0.626768
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.80905
		Period          16.5078
		Eccentricity    0.987953
		Inclination     -2.47018
		AscendingNode   -34.1257
		ArgOfPericenter -116.228
		MeanAnomaly     -43.2909
	}
}

Comet	"Foerost System C39"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            9.55387e-012
	Radius          2.74875
	InertiaMoment   0.39757

	Oblateness      0.0102158

	RotationPeriod  44.8793
	Obliquity       53.4933
	EqAscendNode    221.815

	AbsMagn         -0.322079
	SlopeParam      4.71522
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.674 0.557 0.488)

	Surface
	{
		SurfStyle       0.208566
		OceanStyle      0.518828
		Randomize      (0.893, 0.150, 0.617)
		colorDistMagn   0.413857
		colorDistFreq   0.0015468
		detailScale     75.0592
		colorConversion true
		snowLevel       2
		tropicLatitude  0.807891
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.569629
		terraceProb     0.293253
		erosion         0
		montesMagn      0.446043
		montesFreq      3.53639
		montesSpiky     0.924246
		montesFraction  0.824071
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0200825
		hillsFraction   0.735342
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226128
		craterFreq      0.247351
		craterDensity   0.922261
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50151
		volcanoTemp     1293.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.269, 0.223, 0.195, 0.000)
		colorShelf     (0.286, 0.237, 0.207, 0.000)
		colorBeach     (0.303, 0.251, 0.220, 0.000)
		colorDesert    (0.320, 0.265, 0.232, 0.000)
		colorLowland   (0.337, 0.279, 0.244, 0.000)
		colorUpland    (0.354, 0.293, 0.256, 0.000)
		colorRock      (0.371, 0.306, 0.268, 0.000)
		colorSnow      (0.387, 0.320, 0.281, 1.000)
		BumpHeight      2.47387
		BumpOffset      0.494775
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.502547
		GasToDust   0.25
		Particles   1995
		GasBright   0.0619089
		DustBright  0.321024
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.48711
		Period          28.5416
		Eccentricity    0.95757
		Inclination     0.975186
		AscendingNode   66.2993
		ArgOfPericenter 24.7538
		MeanAnomaly     43.9623
	}
}

Comet	"Foerost System C40"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            7.38922e-008
	Radius          60.0876
	InertiaMoment   0.399514

	Oblateness      0.0150988

	RotationPeriod  43.0586
	Obliquity       6.69904
	EqAscendNode    206.392

	AbsMagn         9.79762
	SlopeParam      5.36007
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.737 0.735 0.734)

	Surface
	{
		SurfStyle       0.0150365
		OceanStyle      0.800057
		Randomize      (-0.261, 0.636, -0.665)
		colorDistMagn   0.906653
		colorDistFreq   1.41524
		detailScale     1640.79
		colorConversion true
		snowLevel       2
		tropicLatitude  0.759751
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.470179
		terraceProb     0.594033
		erosion         0
		montesMagn      0.492831
		montesFreq      3.11664
		montesSpiky     0.994257
		montesFraction  0.396128
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.36415
		hillsFraction   0.620883
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.271635
		craterFreq      0.233839
		craterDensity   0.943011
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.486631
		volcanoTemp     1459.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.295, 0.294, 0.294, 0.000)
		colorShelf     (0.313, 0.313, 0.312, 0.000)
		colorBeach     (0.332, 0.331, 0.330, 0.000)
		colorDesert    (0.350, 0.349, 0.349, 0.000)
		colorLowland   (0.369, 0.368, 0.367, 0.000)
		colorUpland    (0.387, 0.386, 0.385, 0.000)
		colorRock      (0.405, 0.404, 0.404, 0.000)
		colorSnow      (0.424, 0.423, 0.422, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.983739
		GasToDust   0.25
		Particles   2967
		GasBright   0.191453
		DustBright  0.675966
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.63493
		Period          9.49765
		Eccentricity    0.936002
		Inclination     -125.009
		AscendingNode   147.327
		ArgOfPericenter -131.124
		MeanAnomaly     -128.217
	}
}

Comet	"Foerost System C41"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            2.2752e-015
	Radius          0.170073
	InertiaMoment   0.398286

	Oblateness      0.0120744

	RotationPeriod  41.2251
	Obliquity       319.905
	EqAscendNode    190.97

	AbsMagn         6.30287
	SlopeParam      6.19544
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.597 0.593 0.588)

	Surface
	{
		SurfStyle       0.953976
		OceanStyle      0.775816
		Randomize      (0.278, -0.632, -0.478)
		colorDistMagn   0.906341
		colorDistFreq   1.33839e-005
		detailScale     4.64412
		colorConversion true
		snowLevel       2
		tropicLatitude  0.161934
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.519877
		terraceProb     0.52829
		erosion         0
		montesMagn      0.4659
		montesFreq      3.87914
		montesSpiky     0.983585
		montesFraction  0.30909
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.90807e-005
		hillsFraction   0.555743
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254584
		craterFreq      0.252335
		craterDensity   0.815978
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.474034
		volcanoTemp     1533.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.203, 0.207, 0.235, 0.050)
		colorShelf     (0.239, 0.243, 0.270, 0.040)
		colorBeach     (0.275, 0.279, 0.306, 0.030)
		colorDesert    (0.311, 0.314, 0.347, 0.020)
		colorLowland   (0.346, 0.350, 0.382, 0.030)
		colorUpland    (0.382, 0.385, 0.417, 0.050)
		colorRock      (0.418, 0.421, 0.464, 0.020)
		colorSnow      (0.418, 0.421, 0.464, 1.000)
		BumpHeight      0.153065
		BumpOffset      0.0306131
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0541812
		GasToDust   0.25
		Particles   1089
		GasBright   0.154402
		DustBright  0.397504
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.71437
		Period          15.8961
		Eccentricity    0.990435
		Inclination     -36.778
		AscendingNode   -165.958
		ArgOfPericenter -165.035
		MeanAnomaly     2.90669
	}
}

Comet	"Foerost System C42"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            1.75971e-011
	Radius          3.72185
	InertiaMoment   0.399937

	Oblateness      0.0180474

	RotationPeriod  39.3739
	Obliquity       273.11
	EqAscendNode    175.547

	AbsMagn         17.362
	SlopeParam      7.95166
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.715 0.712 0.710)

	Surface
	{
		SurfStyle       0.227975
		OceanStyle      0.781026
		Randomize      (-0.468, -0.735, 0.945)
		colorDistMagn   0.827509
		colorDistFreq   0.00439894
		detailScale     101.631
		colorConversion true
		snowLevel       2
		tropicLatitude  0.419312
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.606057
		terraceProb     0.380703
		erosion         0
		montesMagn      0.590515
		montesFreq      3.62063
		montesSpiky     0.875109
		montesFraction  0.410718
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0451867
		hillsFraction   0.55857
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25328
		craterFreq      0.241815
		craterDensity   0.929455
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.4557
		volcanoTemp     1288.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.286, 0.285, 0.284, 0.000)
		colorShelf     (0.304, 0.303, 0.302, 0.000)
		colorBeach     (0.322, 0.321, 0.320, 0.000)
		colorDesert    (0.340, 0.338, 0.337, 0.000)
		colorLowland   (0.358, 0.356, 0.355, 0.000)
		colorUpland    (0.375, 0.374, 0.373, 0.000)
		colorRock      (0.393, 0.392, 0.391, 0.000)
		colorSnow      (0.411, 0.410, 0.408, 1.000)
		BumpHeight      3.34966
		BumpOffset      0.669933
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.535373
		GasToDust   0.25
		Particles   2061
		GasBright   0.0800913
		DustBright  0.156301
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.33762
		Period          7.9364
		Eccentricity    0.901266
		Inclination     -62.4898
		AscendingNode   -175.408
		ArgOfPericenter -64.029
		MeanAnomaly     -100.48
	}
}

Comet	"Foerost System C43"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            1.361e-007
	Radius          66.3883
	InertiaMoment   0.39883

	Oblateness      0.0145396

	RotationPeriod  37.4996
	Obliquity       226.316
	EqAscendNode    160.125

	AbsMagn         9.56963
	SlopeParam      2.62983
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.775 0.728 0.644)

	Surface
	{
		SurfStyle       0.605033
		OceanStyle      0.194222
		Randomize      (0.277, 0.139, -0.090)
		colorDistMagn   0.339601
		colorDistFreq   1.16608
		detailScale     1812.84
		colorConversion true
		snowLevel       2
		tropicLatitude  0.719069
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.441784
		terraceProb     0.392663
		erosion         0
		montesMagn      0.408433
		montesFreq      2.84832
		montesSpiky     0.816334
		montesFraction  0.355304
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.4208
		hillsFraction   0.459746
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232418
		craterFreq      0.174721
		craterDensity   0.742282
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.479316
		volcanoTemp     1516.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.302, 0.248, 0.180, 0.000)
		colorShelf     (0.310, 0.255, 0.206, 0.000)
		colorBeach     (0.364, 0.299, 0.245, 0.000)
		colorDesert    (0.395, 0.320, 0.238, 0.000)
		colorLowland   (0.434, 0.342, 0.270, 0.000)
		colorUpland    (0.481, 0.415, 0.328, 0.000)
		colorRock      (0.519, 0.452, 0.354, 0.000)
		colorSnow      (0.566, 0.481, 0.373, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.286803
		DustBright  0.434076
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.43012
		Period          14.1068
		Eccentricity    0.934459
		Inclination     -151.261
		AscendingNode   104.888
		ArgOfPericenter 48.8121
		MeanAnomaly     -64.9885
	}
}

Comet	"Foerost System C44"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            4.19062e-015
	Radius          0.230533
	InertiaMoment   0.397063

	Oblateness      0.0217983

	RotationPeriod  35.5963
	Obliquity       179.522
	EqAscendNode    144.702

	AbsMagn         6.07165
	SlopeParam      3.27624
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.722 0.673 0.653)

	Surface
	{
		SurfStyle       0.683969
		OceanStyle      0.448317
		Randomize      (0.867, -0.925, 0.334)
		colorDistMagn   0.108976
		colorDistFreq   1.11358e-005
		detailScale     6.29508
		colorConversion true
		snowLevel       2
		tropicLatitude  0.194361
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.56389
		terraceProb     0.301473
		erosion         0
		montesMagn      0.482409
		montesFreq      3.17202
		montesSpiky     0.908822
		montesFraction  0.733865
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000103828
		hillsFraction   0.673601
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245523
		craterFreq      0.212293
		craterDensity   0.854592
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.436985
		volcanoTemp     1459.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.282, 0.229, 0.183, 0.000)
		colorShelf     (0.289, 0.236, 0.209, 0.000)
		colorBeach     (0.339, 0.276, 0.248, 0.000)
		colorDesert    (0.368, 0.296, 0.241, 0.000)
		colorLowland   (0.404, 0.316, 0.274, 0.000)
		colorUpland    (0.448, 0.384, 0.333, 0.000)
		colorRock      (0.484, 0.417, 0.359, 0.000)
		colorSnow      (0.527, 0.444, 0.378, 1.000)
		BumpHeight      0.20748
		BumpOffset      0.0414959
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0870069
		GasToDust   0.25
		Particles   1155
		GasBright   0.18521
		DustBright  0.220156
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.55929
		Period          14.911
		Eccentricity    0.988175
		Inclination     -11.661
		AscendingNode   161.938
		ArgOfPericenter 66.4478
		MeanAnomaly     -105.332
	}
}

Comet	"Foerost System C45"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            3.24115e-011
	Radius          4.10676
	InertiaMoment   0.399298

	Oblateness      0.0179714

	RotationPeriod  33.6577
	Obliquity       132.728
	EqAscendNode    129.279

	AbsMagn         15.4976
	SlopeParam      3.85347
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.652 0.648 0.644)

	Surface
	{
		SurfStyle       0.355141
		OceanStyle      0.564696
		Randomize      (-0.473, -0.172, 0.813)
		colorDistMagn   0.208685
		colorDistFreq   0.0129729
		detailScale     112.142
		colorConversion true
		snowLevel       2
		tropicLatitude  0.465133
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.42527
		terraceProb     0.34189
		erosion         0
		montesMagn      0.40468
		montesFreq      3.28913
		montesSpiky     0.993278
		montesFraction  0.69364
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.05053
		hillsFraction   0.747184
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231477
		craterFreq      0.209662
		craterDensity   0.963517
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.448984
		volcanoTemp     1402.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.261, 0.259, 0.258, 0.000)
		colorShelf     (0.277, 0.276, 0.274, 0.000)
		colorBeach     (0.293, 0.292, 0.290, 0.000)
		colorDesert    (0.310, 0.308, 0.306, 0.000)
		colorLowland   (0.326, 0.324, 0.322, 0.000)
		colorUpland    (0.342, 0.340, 0.338, 0.000)
		colorRock      (0.359, 0.357, 0.354, 0.000)
		colorSnow      (0.375, 0.373, 0.371, 1.000)
		BumpHeight      3.69608
		BumpOffset      0.739217
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.568199
		GasToDust   0.25
		Particles   2127
		GasBright   0.014186
		DustBright  0.875666
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.39383
		Period          13.8835
		Eccentricity    0.969441
		Inclination     -73.9175
		AscendingNode   -171.067
		ArgOfPericenter 162.803
		MeanAnomaly     -156.561
	}
}

Comet	"Foerost System C46"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            2.50679e-007
	Radius          90.0966
	InertiaMoment   0.397965

	Oblateness      0.0275621

	RotationPeriod  31.6766
	Obliquity       85.9333
	EqAscendNode    113.857

	AbsMagn         9.34664
	SlopeParam      4.41851
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.640 0.637 0.634)

	Surface
	{
		SurfStyle       0.671714
		OceanStyle      0.0814161
		Randomize      (-0.540, -0.510, -0.010)
		colorDistMagn   0.422347
		colorDistFreq   6.92037
		detailScale     2460.24
		colorConversion true
		snowLevel       2
		tropicLatitude  0.578737
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.481508
		terraceProb     0.203968
		erosion         0
		montesMagn      0.440566
		montesFreq      2.63725
		montesSpiky     0.933333
		montesFraction  0.313738
		dunesFraction   0
		hillsMagn       0
		hillsFreq       17.1759
		hillsFraction   0.900188
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256439
		craterFreq      0.230244
		craterDensity   1.02308
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.425237
		volcanoTemp     1296.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.249, 0.217, 0.177, 0.000)
		colorShelf     (0.256, 0.223, 0.203, 0.000)
		colorBeach     (0.301, 0.261, 0.241, 0.000)
		colorDesert    (0.326, 0.280, 0.235, 0.000)
		colorLowland   (0.358, 0.299, 0.266, 0.000)
		colorUpland    (0.397, 0.363, 0.323, 0.000)
		colorRock      (0.429, 0.395, 0.349, 0.000)
		colorSnow      (0.467, 0.420, 0.368, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0430681
		DustBright  0.531271
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.87436
		Period          16.9341
		Eccentricity    0.95811
		Inclination     59.7944
		AscendingNode   -154.773
		ArgOfPericenter 51.1711
		MeanAnomaly     -31.1001
	}
}

Comet	"Foerost System C47"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            7.71861e-015
	Radius          0.25401
	InertiaMoment   0.39973

	Oblateness      0.0230555

	RotationPeriod  29.6447
	Obliquity       39.139
	EqAscendNode    98.4343

	AbsMagn         5.83379
	SlopeParam      5.01987
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.469 0.461 0.456)

	Surface
	{
		SurfStyle       0.0543369
		OceanStyle      0.334131
		Randomize      (-0.014, -0.636, 0.303)
		colorDistMagn   0.0690323
		colorDistFreq   4.66169e-005
		detailScale     6.93616
		colorConversion true
		snowLevel       2
		tropicLatitude  0.962412
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.441277
		terraceProb     0.185281
		erosion         0
		montesMagn      0.349504
		montesFreq      3.4014
		montesSpiky     0.90011
		montesFraction  0.650178
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000192171
		hillsFraction   0.600763
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232675
		craterFreq      0.260691
		craterDensity   0.687925
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.512691
		volcanoTemp     1566.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.188, 0.184, 0.182, 0.000)
		colorShelf     (0.199, 0.196, 0.194, 0.000)
		colorBeach     (0.211, 0.208, 0.205, 0.000)
		colorDesert    (0.223, 0.219, 0.216, 0.000)
		colorLowland   (0.235, 0.231, 0.228, 0.000)
		colorUpland    (0.246, 0.242, 0.239, 0.000)
		colorRock      (0.258, 0.254, 0.251, 0.000)
		colorSnow      (0.270, 0.265, 0.262, 1.000)
		BumpHeight      0.228609
		BumpOffset      0.0457218
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.119833
		GasToDust   0.25
		Particles   1221
		GasBright   0.034691
		DustBright  0.224135
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.93947
		Period          17.3628
		Eccentricity    0.9492
		Inclination     102.6
		AscendingNode   -135.689
		ArgOfPericenter 166.712
		MeanAnomaly     57.5341
	}
}

Comet	"Foerost System C48"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            5.96979e-011
	Radius          5.58065
	InertiaMoment   0.398574

	Oblateness      0.0364372

	RotationPeriod  27.5526
	Obliquity       352.345
	EqAscendNode    83.0117

	AbsMagn         14.5316
	SlopeParam      5.73399
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.753 0.749 0.746)

	Surface
	{
		SurfStyle       0.901596
		OceanStyle      0.23224
		Randomize      (-0.139, 0.573, -0.607)
		colorDistMagn   0.89523
		colorDistFreq   0.00873315
		detailScale     152.389
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0778658
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.523139
		terraceProb     0.128652
		erosion         0
		montesMagn      0.512294
		montesFreq      3.56448
		montesSpiky     0.904585
		montesFraction  0.282867
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0569127
		hillsFraction   0.664718
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258347
		craterFreq      0.258146
		craterDensity   0.709836
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50338
		volcanoTemp     1636.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.256, 0.262, 0.298, 0.050)
		colorShelf     (0.301, 0.307, 0.343, 0.040)
		colorBeach     (0.346, 0.352, 0.388, 0.030)
		colorDesert    (0.392, 0.397, 0.440, 0.020)
		colorLowland   (0.437, 0.442, 0.485, 0.030)
		colorUpland    (0.482, 0.487, 0.530, 0.050)
		colorRock      (0.527, 0.532, 0.590, 0.020)
		colorSnow      (0.527, 0.532, 0.590, 1.000)
		BumpHeight      5.02259
		BumpOffset      1.00452
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.601025
		GasToDust   0.25
		Particles   2193
		GasBright   0.143517
		DustBright  0.599795
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.09073
		Period          6.7129
		Eccentricity    0.886688
		Inclination     -176.663
		AscendingNode   12.932
		ArgOfPericenter -126.316
		MeanAnomaly     72.4577
	}
}

Comet	"Foerost System C49"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            4.61721e-007
	Radius          99.1139
	InertiaMoment   0.396231

	Oblateness      0.03081

	RotationPeriod  25.389
	Obliquity       305.55
	EqAscendNode    67.5891

	AbsMagn         9.12776
	SlopeParam      6.79815
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.847 0.807 0.731)

	Surface
	{
		SurfStyle       0.9959
		OceanStyle      0.857933
		Randomize      (0.007, -0.864, 0.819)
		colorDistMagn   0.670089
		colorDistFreq   0.265728
		detailScale     2706.47
		colorConversion true
		snowLevel       2
		tropicLatitude  0.651849
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.687172
		terraceProb     0.244551
		erosion         0
		montesMagn      0.51359
		montesFreq      3.36848
		montesSpiky     0.865603
		montesFraction  0.708722
		dunesFraction   0
		hillsMagn       0
		hillsFreq       26.9098
		hillsFraction   0.665729
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263052
		craterFreq      0.353494
		craterDensity   0.908426
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.516876
		volcanoTemp     1269.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.288, 0.282, 0.292, 0.050)
		colorShelf     (0.339, 0.331, 0.336, 0.040)
		colorBeach     (0.390, 0.379, 0.380, 0.030)
		colorDesert    (0.441, 0.428, 0.431, 0.020)
		colorLowland   (0.491, 0.476, 0.475, 0.030)
		colorUpland    (0.542, 0.524, 0.519, 0.050)
		colorRock      (0.593, 0.573, 0.577, 0.020)
		colorSnow      (0.593, 0.573, 0.577, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.107858
		DustBright  0.319941
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.20363
		Period          12.7329
		Eccentricity    0.960448
		Inclination     -114.242
		AscendingNode   -45.5384
		ArgOfPericenter 128.026
		MeanAnomaly     150.719
	}
}

Comet	"Foerost System C50"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            1.42167e-014
	Radius          0.345671
	InertiaMoment   0.399073

	Oblateness      0.0516455

	RotationPeriod  23.1404
	Obliquity       258.756
	EqAscendNode    52.1666

	AbsMagn         5.58801
	SlopeParam      2.243
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.699 0.620 0.573)

	Surface
	{
		SurfStyle       0.455535
		OceanStyle      0.884556
		Randomize      (0.542, -0.101, -0.814)
		colorDistMagn   0.735054
		colorDistFreq   4.02847e-005
		detailScale     9.43911
		colorConversion true
		snowLevel       2
		tropicLatitude  0.984269
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.508389
		terraceProb     0.522361
		erosion         0
		montesMagn      0.575801
		montesFreq      2.75492
		montesSpiky     0.925227
		montesFraction  0.441592
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000245061
		hillsFraction   0.665895
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246452
		craterFreq      0.223117
		craterDensity   1.03396
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.501631
		volcanoTemp     1525.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.280, 0.248, 0.229, 0.000)
		colorShelf     (0.297, 0.264, 0.243, 0.000)
		colorBeach     (0.315, 0.279, 0.258, 0.000)
		colorDesert    (0.332, 0.295, 0.272, 0.000)
		colorLowland   (0.350, 0.310, 0.286, 0.000)
		colorUpland    (0.367, 0.326, 0.301, 0.000)
		colorRock      (0.385, 0.341, 0.315, 0.000)
		colorSnow      (0.402, 0.357, 0.329, 1.000)
		BumpHeight      0.311103
		BumpOffset      0.0622207
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.152659
		GasToDust   0.25
		Particles   1288
		GasBright   0.283874
		DustBright  0.628411
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.72922
		Period          22.8375
		Eccentricity    0.971152
		Inclination     2.14669
		AscendingNode   -60.3484
		ArgOfPericenter 115.911
		MeanAnomaly     -131.71
	}
}

Comet	"Foerost System C51"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            1.09956e-010
	Radius          6.12826
	InertiaMoment   0.397581

	Oblateness      0.0458381

	RotationPeriod  20.7903
	Obliquity       211.962
	EqAscendNode    36.744

	AbsMagn         13.8427
	SlopeParam      2.96219
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.568 0.489 0.339)

	Surface
	{
		SurfStyle       0.302402
		OceanStyle      0.0622166
		Randomize      (0.376, 0.726, -0.903)
		colorDistMagn   0.83926
		colorDistFreq   0.0175448
		detailScale     167.342
		colorConversion true
		snowLevel       2
		tropicLatitude  0.674772
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.418109
		terraceProb     0.2695
		erosion         0
		montesMagn      0.513071
		montesFreq      3.8006
		montesSpiky     0.936719
		montesFraction  0.188602
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.12243
		hillsFraction   0.782956
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248923
		craterFreq      0.212457
		craterDensity   0.85044
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.502192
		volcanoTemp     1624.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.227, 0.196, 0.136, 0.000)
		colorShelf     (0.242, 0.208, 0.144, 0.000)
		colorBeach     (0.256, 0.220, 0.153, 0.000)
		colorDesert    (0.270, 0.232, 0.161, 0.000)
		colorLowland   (0.284, 0.244, 0.169, 0.000)
		colorUpland    (0.298, 0.257, 0.178, 0.000)
		colorRock      (0.313, 0.269, 0.186, 0.000)
		colorSnow      (0.327, 0.281, 0.195, 1.000)
		BumpHeight      5.51543
		BumpOffset      1.10309
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.633851
		GasToDust   0.25
		Particles   2260
		GasBright   0.220933
		DustBright  0.375839
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.84881
		Period          23.7092
		Eccentricity    0.969556
		Inclination     -13.0283
		AscendingNode   137.896
		ArgOfPericenter 158.907
		MeanAnomaly     -49.1211
	}
}

Comet	"Foerost System C52"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            3.38562e-018
	Radius          0.0214112
	InertiaMoment   0.399519

	Oblateness      0.0823822

	RotationPeriod  18.3181
	Obliquity       165.167
	EqAscendNode    21.3214

	AbsMagn         8.9122
	SlopeParam      3.56542
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.804 0.711 0.656)

	Surface
	{
		SurfStyle       0.264426
		OceanStyle      0.245692
		Randomize      (-0.708, -0.196, 0.899)
		colorDistMagn   0.937284
		colorDistFreq   1.98853e-007
		detailScale     0.584667
		colorConversion true
		snowLevel       2
		tropicLatitude  0.269297
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.476138
		terraceProb     0.297343
		erosion         0
		montesMagn      0.492447
		montesFreq      2.28117
		montesSpiky     0.960087
		montesFraction  0.54969
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.68018e-007
		hillsFraction   0.441379
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220922
		craterFreq      0.195283
		craterDensity   0.666888
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.544098
		volcanoTemp     1501.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.322, 0.285, 0.263, 0.000)
		colorShelf     (0.342, 0.302, 0.279, 0.000)
		colorBeach     (0.362, 0.320, 0.295, 0.000)
		colorDesert    (0.382, 0.338, 0.312, 0.000)
		colorLowland   (0.402, 0.356, 0.328, 0.000)
		colorUpland    (0.422, 0.373, 0.345, 0.000)
		colorRock      (0.442, 0.391, 0.361, 0.000)
		colorSnow      (0.462, 0.409, 0.377, 1.000)
		BumpHeight      0.01927
		BumpOffset      0.00385401
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.120733
		DustBright  0.160526
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.36255
		Period          8.0637
		Eccentricity    0.959346
		Inclination     26.2053
		AscendingNode   32.1247
		ArgOfPericenter -133.639
		MeanAnomaly     -21.3083
	}
}

Comet	"Foerost System C53"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            2.61854e-014
	Radius          0.378826
	InertiaMoment   0.398293

	Oblateness      0.0799704

	RotationPeriod  15.6973
	Obliquity       118.373
	EqAscendNode    5.89878

	AbsMagn         5.33276
	SlopeParam      4.13077
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.489 0.399 0.329)

	Surface
	{
		SurfStyle       0.176944
		OceanStyle      0.158137
		Randomize      (0.760, 0.228, 0.941)
		colorDistMagn   0.341523
		colorDistFreq   8.24616e-005
		detailScale     10.3445
		colorConversion true
		snowLevel       2
		tropicLatitude  0.848614
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.413087
		terraceProb     0.369691
		erosion         0
		montesMagn      0.532417
		montesFreq      3.24758
		montesSpiky     0.856097
		montesFraction  0.607019
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000267929
		hillsFraction   0.535159
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2652
		craterFreq      0.263292
		craterDensity   0.797954
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.538447
		volcanoTemp     1648.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.196, 0.160, 0.132, 0.000)
		colorShelf     (0.208, 0.170, 0.140, 0.000)
		colorBeach     (0.220, 0.180, 0.148, 0.000)
		colorDesert    (0.233, 0.190, 0.156, 0.000)
		colorLowland   (0.245, 0.200, 0.165, 0.000)
		colorUpland    (0.257, 0.210, 0.173, 0.000)
		colorRock      (0.269, 0.220, 0.181, 0.000)
		colorSnow      (0.281, 0.229, 0.189, 1.000)
		BumpHeight      0.340943
		BumpOffset      0.0681887
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.185485
		GasToDust   0.25
		Particles   1354
		GasBright   0.373916
		DustBright  0.391829
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.46278
		Period          14.3087
		Eccentricity    0.96957
		Inclination     167.932
		AscendingNode   110.46
		ArgOfPericenter 45.6379
		MeanAnomaly     123.256
	}
}

Comet	"Foerost System C54"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            2.02525e-010
	Radius          8.36796
	InertiaMoment   0.399942

	Oblateness      0.166218

	RotationPeriod  12.8929
	Obliquity       71.5789
	EqAscendNode    350.476

	AbsMagn         13.2933
	SlopeParam      4.707
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.600 0.593 0.589)

	Surface
	{
		SurfStyle       0.306176
		OceanStyle      0.116925
		Randomize      (0.873, -0.247, -0.215)
		colorDistMagn   0.788042
		colorDistFreq   0.025042
		detailScale     228.501
		colorConversion true
		snowLevel       2
		tropicLatitude  0.927308
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.498648
		terraceProb     0.250072
		erosion         0
		montesMagn      0.570155
		montesFreq      2.58161
		montesSpiky     0.803716
		montesFraction  0.505186
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.13069
		hillsFraction   0.798805
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226364
		craterFreq      0.227817
		craterDensity   0.866508
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.532922
		volcanoTemp     1453.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.240, 0.237, 0.235, 0.000)
		colorShelf     (0.255, 0.252, 0.250, 0.000)
		colorBeach     (0.270, 0.267, 0.265, 0.000)
		colorDesert    (0.285, 0.282, 0.280, 0.000)
		colorLowland   (0.300, 0.297, 0.294, 0.000)
		colorUpland    (0.315, 0.311, 0.309, 0.000)
		colorRock      (0.330, 0.326, 0.324, 0.000)
		colorSnow      (0.345, 0.341, 0.338, 1.000)
		BumpHeight      7.53116
		BumpOffset      1.50623
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.666677
		GasToDust   0.25
		Particles   2326
		GasBright   0.0213181
		DustBright  0.428913
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.90049
		Period          31.827
		Eccentricity    0.975031
		Inclination     -150.13
		AscendingNode   -102.253
		ArgOfPericenter 50.8311
		MeanAnomaly     -75.5504
	}
}

Comet	"Foerost System C55"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            6.2359e-018
	Radius          0.0234109
	InertiaMoment   0.398836

	Oblateness      0.201382

	RotationPeriod  9.85749
	Obliquity       24.7846
	EqAscendNode    335.054

	AbsMagn         8.69927
	SlopeParam      5.35037
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.749 0.746 0.744)

	Surface
	{
		SurfStyle       0.251148
		OceanStyle      0.106242
		Randomize      (-0.887, -0.060, -0.463)
		colorDistMagn   0.468627
		colorDistFreq   4.10111e-007
		detailScale     0.639272
		colorConversion true
		snowLevel       2
		tropicLatitude  0.55249
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.257545
		terraceProb     0.127899
		erosion         0
		montesMagn      0.389231
		montesFreq      1.91983
		montesSpiky     0.936722
		montesFraction  0.534243
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.08863e-006
		hillsFraction   0.727973
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.206199
		craterFreq      0.202909
		craterDensity   0.928053
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.483623
		volcanoTemp     1225.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.300, 0.299, 0.298, 0.000)
		colorShelf     (0.318, 0.317, 0.316, 0.000)
		colorBeach     (0.337, 0.336, 0.335, 0.000)
		colorDesert    (0.356, 0.355, 0.354, 0.000)
		colorLowland   (0.374, 0.373, 0.372, 0.000)
		colorUpland    (0.393, 0.392, 0.391, 0.000)
		colorRock      (0.412, 0.411, 0.409, 0.000)
		colorSnow      (0.431, 0.429, 0.428, 1.000)
		BumpHeight      0.0210698
		BumpOffset      0.00421395
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0994489
		DustBright  0.835269
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.92008
		Period          11.0804
		Eccentricity    0.952834
		Inclination     169.434
		AscendingNode   140.103
		ArgOfPericenter -19.4206
		MeanAnomaly     165.84
	}
}

Comet	"Foerost System C56"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            4.82302e-014
	Radius          0.518322
	InertiaMoment   0.397078

	Oblateness      0.249

	RotationPeriod  6.5234
	Obliquity       337.99
	EqAscendNode    319.631

	AbsMagn         5.06615
	SlopeParam      6.1814
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.771 0.723 0.706)

	Surface
	{
		SurfStyle       0.554246
		OceanStyle      0.168862
		Randomize      (-0.763, 0.166, 0.034)
		colorDistMagn   0.206248
		colorDistFreq   0.000181723
		detailScale     14.1536
		colorConversion true
		snowLevel       2
		tropicLatitude  0.316723
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.442377
		terraceProb     0.168794
		erosion         0
		montesMagn      0.662425
		montesFreq      2.68295
		montesSpiky     0.942579
		montesFraction  0.390377
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000809777
		hillsFraction   0.544687
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249501
		craterFreq      0.188821
		craterDensity   0.933145
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.436964
		volcanoTemp     1676.33
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.301, 0.246, 0.198, 0.000)
		colorShelf     (0.308, 0.253, 0.226, 0.000)
		colorBeach     (0.362, 0.296, 0.268, 0.000)
		colorDesert    (0.393, 0.318, 0.261, 0.000)
		colorLowland   (0.432, 0.340, 0.296, 0.000)
		colorUpland    (0.478, 0.412, 0.360, 0.000)
		colorRock      (0.516, 0.448, 0.388, 0.000)
		colorSnow      (0.563, 0.477, 0.409, 1.000)
		BumpHeight      0.46649
		BumpOffset      0.093298
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.218311
		GasToDust   0.25
		Particles   1420
		GasBright   0.102441
		DustBright  0.516764
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.83066
		Period          16.6485
		Eccentricity    0.953402
		Inclination     171.955
		AscendingNode   125.588
		ArgOfPericenter -54.392
		MeanAnomaly     -43.522
	}
}

Comet	"Foerost System C57"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            3.73026e-010
	Radius          9.12496
	InertiaMoment   0.399303

	Oblateness      0.249

	RotationPeriod  2.7895
	Obliquity       291.196
	EqAscendNode    304.208

	AbsMagn         12.8289
	SlopeParam      7.89872
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.794 0.745 0.689)

	Surface
	{
		SurfStyle       0.797614
		OceanStyle      0.998439
		Randomize      (-0.788, 0.798, -0.690)
		colorDistMagn   0.782776
		colorDistFreq   0.032967
		detailScale     249.172
		colorConversion true
		snowLevel       2
		tropicLatitude  0.992088
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.684088
		terraceProb     0.139198
		erosion         0
		montesMagn      0.360791
		montesFreq      3.86637
		montesSpiky     0.884962
		montesFraction  0.320694
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.253974
		hillsFraction   0.68602
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251436
		craterFreq      0.221079
		craterDensity   0.80969
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.478743
		volcanoTemp     1117.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.310, 0.253, 0.193, 0.000)
		colorShelf     (0.318, 0.261, 0.221, 0.000)
		colorBeach     (0.373, 0.306, 0.262, 0.000)
		colorDesert    (0.405, 0.328, 0.255, 0.000)
		colorLowland   (0.445, 0.350, 0.290, 0.000)
		colorUpland    (0.493, 0.425, 0.352, 0.000)
		colorRock      (0.532, 0.462, 0.379, 0.000)
		colorSnow      (0.580, 0.492, 0.400, 1.000)
		BumpHeight      8.21246
		BumpOffset      1.64249
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.699503
		GasToDust   0.25
		Particles   2392
		GasBright   0.0681741
		DustBright  0.235517
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.8418
		Period          10.6378
		Eccentricity    0.945012
		Inclination     122.703
		AscendingNode   -65.8574
		ArgOfPericenter -123.379
		MeanAnomaly     -62.7444
	}
}

Comet	"Foerost System C58"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            1.14858e-017
	Radius          0.0321056
	InertiaMoment   0.397974

	Oblateness      0.00179346

	RotationPeriod  123.408
	Obliquity       244.402
	EqAscendNode    288.786

	AbsMagn         8.4883
	SlopeParam      2.62005
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.797 0.769 0.740)

	Surface
	{
		SurfStyle       0.207581
		OceanStyle      0.460788
		Randomize      (-0.009, 0.845, -0.951)
		colorDistMagn   0.823289
		colorDistFreq   7.32266e-007
		detailScale     0.876696
		colorConversion true
		snowLevel       2
		tropicLatitude  0.989322
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.259544
		terraceProb     0.563564
		erosion         0
		montesMagn      0.599428
		montesFreq      2.64318
		montesSpiky     0.90273
		montesFraction  0.565004
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.07235e-006
		hillsFraction   0.657186
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242774
		craterFreq      0.170257
		craterDensity   0.814349
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.483447
		volcanoTemp     1311.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.319, 0.308, 0.296, 0.000)
		colorShelf     (0.339, 0.327, 0.315, 0.000)
		colorBeach     (0.359, 0.346, 0.333, 0.000)
		colorDesert    (0.379, 0.365, 0.352, 0.000)
		colorLowland   (0.399, 0.385, 0.370, 0.000)
		colorUpland    (0.418, 0.404, 0.389, 0.000)
		colorRock      (0.438, 0.423, 0.407, 0.000)
		colorSnow      (0.458, 0.442, 0.426, 1.000)
		BumpHeight      0.028895
		BumpOffset      0.005779
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.223472
		DustBright  0.564706
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.59958
		Period          15.165
		Eccentricity    0.950616
		Inclination     -21.6922
		AscendingNode   -140.097
		ArgOfPericenter -166.827
		MeanAnomaly     -60.0385
	}
}

Comet	"Foerost System C59"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            8.88342e-014
	Radius          0.563405
	InertiaMoment   0.399735

	Oblateness      0.0015366

	RotationPeriod  111.813
	Obliquity       197.607
	EqAscendNode    273.363

	AbsMagn         4.78582
	SlopeParam      3.268
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.542 0.444 0.409)

	Surface
	{
		SurfStyle       0.993463
		OceanStyle      0.47147
		Randomize      (-0.107, -0.412, 0.346)
		colorDistMagn   0.090987
		colorDistFreq   0.000221044
		detailScale     15.3847
		colorConversion true
		snowLevel       2
		tropicLatitude  0.94072
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.331443
		terraceProb     0.314333
		erosion         0
		montesMagn      0.490337
		montesFreq      2.99564
		montesSpiky     0.861156
		montesFraction  0.2191
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000955368
		hillsFraction   0.59972
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218925
		craterFreq      0.159407
		craterDensity   0.960688
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.493449
		volcanoTemp     1350.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.184, 0.155, 0.164, 0.050)
		colorShelf     (0.217, 0.182, 0.188, 0.040)
		colorBeach     (0.249, 0.209, 0.213, 0.030)
		colorDesert    (0.282, 0.235, 0.241, 0.020)
		colorLowland   (0.314, 0.262, 0.266, 0.030)
		colorUpland    (0.347, 0.289, 0.290, 0.050)
		colorRock      (0.379, 0.315, 0.323, 0.020)
		colorSnow      (0.379, 0.315, 0.323, 1.000)
		BumpHeight      0.507064
		BumpOffset      0.101413
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.251137
		GasToDust   0.25
		Particles   1487
		GasBright   0.161923
		DustBright  0.310741
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.05641
		Period          11.8654
		Eccentricity    0.941007
		Inclination     83.2285
		AscendingNode   139.028
		ArgOfPericenter 144.137
		MeanAnomaly     37.1567
	}
}

Comet	"Foerost System C60"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            6.87067e-010
	Radius          12.5476
	InertiaMoment   0.398581

	Oblateness      0.00250062

	RotationPeriod  104.523
	Obliquity       150.813
	EqAscendNode    257.941

	AbsMagn         12.4219
	SlopeParam      3.84573
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.566 0.455 0.400)

	Surface
	{
		SurfStyle       0.960348
		OceanStyle      0.000987351
		Randomize      (0.776, 0.253, -0.914)
		colorDistMagn   0.191159
		colorDistFreq   0.0626053
		detailScale     342.634
		colorConversion true
		snowLevel       2
		tropicLatitude  0.891642
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.361938
		terraceProb     0.184288
		erosion         0
		montesMagn      0.360251
		montesFreq      2.45791
		montesSpiky     0.954626
		montesFraction  0.435148
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.346907
		hillsFraction   0.635927
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224793
		craterFreq      0.198902
		craterDensity   1.00627
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.571823
		volcanoTemp     1535.32
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.192, 0.159, 0.160, 0.050)
		colorShelf     (0.226, 0.186, 0.184, 0.040)
		colorBeach     (0.260, 0.214, 0.208, 0.030)
		colorDesert    (0.294, 0.241, 0.236, 0.020)
		colorLowland   (0.328, 0.268, 0.260, 0.030)
		colorUpland    (0.362, 0.296, 0.284, 0.050)
		colorRock      (0.396, 0.323, 0.316, 0.020)
		colorSnow      (0.396, 0.323, 0.316, 1.000)
		BumpHeight      11.2929
		BumpOffset      2.25857
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.732329
		GasToDust   0.25
		Particles   2459
		GasBright   0.384412
		DustBright  0.572739
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.33217
		Period          20.0226
		Eccentricity    0.939203
		Inclination     46.8866
		AscendingNode   -113.847
		ArgOfPericenter 80.4045
		MeanAnomaly     -29.0046
	}
}

Comet	"Foerost System C61"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            2.11553e-017
	Radius          0.0347603
	InertiaMoment   0.396261

	Oblateness      0.00190754

	RotationPeriod  99.0109
	Obliquity       104.019
	EqAscendNode    242.518

	AbsMagn         8.27868
	SlopeParam      4.41062
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.447 0.443 0.440)

	Surface
	{
		SurfStyle       0.535899
		OceanStyle      0.251145
		Randomize      (0.711, -0.534, -0.551)
		colorDistMagn   0.530193
		colorDistFreq   5.96203e-007
		detailScale     0.949188
		colorConversion true
		snowLevel       2
		tropicLatitude  0.783425
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.545043
		terraceProb     0.174192
		erosion         0
		montesMagn      0.525711
		montesFreq      2.97392
		montesSpiky     0.992628
		montesFraction  0.575307
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.7886e-006
		hillsFraction   0.696498
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263627
		craterFreq      0.202488
		craterDensity   0.94362
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.541552
		volcanoTemp     1310.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.174, 0.151, 0.123, 0.000)
		colorShelf     (0.179, 0.155, 0.141, 0.000)
		colorBeach     (0.210, 0.182, 0.167, 0.000)
		colorDesert    (0.228, 0.195, 0.163, 0.000)
		colorLowland   (0.250, 0.208, 0.185, 0.000)
		colorUpland    (0.277, 0.253, 0.224, 0.000)
		colorRock      (0.299, 0.275, 0.242, 0.000)
		colorSnow      (0.326, 0.293, 0.255, 1.000)
		BumpHeight      0.0312843
		BumpOffset      0.00625685
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.295581
		DustBright  0.346057
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.08084
		Period          6.66534
		Eccentricity    0.891583
		Inclination     127.084
		AscendingNode   -7.39223
		ArgOfPericenter -29.5651
		MeanAnomaly     -40.8843
	}
}

Comet	"Foerost System C62"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            1.63621e-013
	Radius          0.77722
	InertiaMoment   0.399079

	Oblateness      0.0030594

	RotationPeriod  94.4879
	Obliquity       57.2245
	EqAscendNode    227.095

	AbsMagn         4.48874
	SlopeParam      5.01109
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.652 0.648 0.642)

	Surface
	{
		SurfStyle       0.586509
		OceanStyle      0.36085
		Randomize      (0.537, -0.487, 0.133)
		colorDistMagn   0.944121
		colorDistFreq   9.15865e-005
		detailScale     21.2233
		colorConversion true
		snowLevel       2
		tropicLatitude  0.826142
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.377249
		terraceProb     0.250533
		erosion         0
		montesMagn      0.490905
		montesFreq      3.54581
		montesSpiky     0.931305
		montesFraction  0.50484
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00147442
		hillsFraction   0.410702
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229174
		craterFreq      0.214143
		craterDensity   0.955621
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.443935
		volcanoTemp     1675.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.254, 0.220, 0.180, 0.000)
		colorShelf     (0.261, 0.227, 0.205, 0.000)
		colorBeach     (0.306, 0.266, 0.244, 0.000)
		colorDesert    (0.332, 0.285, 0.237, 0.000)
		colorLowland   (0.365, 0.305, 0.270, 0.000)
		colorUpland    (0.404, 0.370, 0.327, 0.000)
		colorRock      (0.437, 0.402, 0.353, 0.000)
		colorSnow      (0.476, 0.428, 0.372, 1.000)
		BumpHeight      0.699498
		BumpOffset      0.1399
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.283963
		GasToDust   0.25
		Particles   1553
		GasBright   0.00642833
		DustBright  0.319696
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.13259
		Period          18.655
		Eccentricity    0.957375
		Inclination     175.341
		AscendingNode   69.5155
		ArgOfPericenter -120.72
		MeanAnomaly     -154.274
	}
}

Comet	"Foerost System C63"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            1.26549e-009
	Radius          13.5152
	InertiaMoment   0.397592

	Oblateness      0.00224975

	RotationPeriod  90.5992
	Obliquity       10.4302
	EqAscendNode    211.673

	AbsMagn         12.0561
	SlopeParam      5.72278
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.721 0.651 0.587)

	Surface
	{
		SurfStyle       0.0327443
		OceanStyle      0.0134784
		Randomize      (0.927, -0.861, -0.031)
		colorDistMagn   0.147109
		colorDistFreq   0.134929
		detailScale     369.055
		colorConversion true
		snowLevel       2
		tropicLatitude  0.974228
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.621295
		terraceProb     0.302166
		erosion         0
		montesMagn      0.490194
		montesFreq      2.97386
		montesSpiky     0.989893
		montesFraction  0.640211
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.42312
		hillsFraction   0.689175
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249877
		craterFreq      0.235759
		craterDensity   0.84839
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.537773
		volcanoTemp     1873.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.288, 0.260, 0.235, 0.000)
		colorShelf     (0.306, 0.276, 0.249, 0.000)
		colorBeach     (0.324, 0.293, 0.264, 0.000)
		colorDesert    (0.343, 0.309, 0.279, 0.000)
		colorLowland   (0.361, 0.325, 0.293, 0.000)
		colorUpland    (0.379, 0.342, 0.308, 0.000)
		colorRock      (0.397, 0.358, 0.323, 0.000)
		colorSnow      (0.415, 0.374, 0.337, 1.000)
		BumpHeight      12.1637
		BumpOffset      2.43274
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.765155
		GasToDust   0.25
		Particles   2525
		GasBright   0.0638409
		DustBright  0.74677
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.28003
		Period          19.6623
		Eccentricity    0.96137
		Inclination     -70.2369
		AscendingNode   128.896
		ArgOfPericenter -58.2862
		MeanAnomaly     136.014
	}
}

Comet	"Foerost System C64"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            3.89654e-017
	Radius          0.0481423
	InertiaMoment   0.399525

	Oblateness      0.0035947

	RotationPeriod  87.1526
	Obliquity       323.636
	EqAscendNode    196.25

	AbsMagn         8.06982
	SlopeParam      6.77777
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.777 0.774 0.772)

	Surface
	{
		SurfStyle       0.98242
		OceanStyle      0.141717
		Randomize      (0.791, 0.106, -0.065)
		colorDistMagn   0.418753
		colorDistFreq   1.59408e-006
		detailScale     1.31461
		colorConversion true
		snowLevel       2
		tropicLatitude  0.899902
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.431299
		terraceProb     0.14651
		erosion         0
		montesMagn      0.46387
		montesFreq      2.43901
		montesSpiky     0.87006
		montesFraction  0.393487
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.1501e-006
		hillsFraction   0.795819
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252871
		craterFreq      0.189994
		craterDensity   1.03017
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.496574
		volcanoTemp     1128.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.264, 0.271, 0.309, 0.050)
		colorShelf     (0.311, 0.317, 0.355, 0.040)
		colorBeach     (0.357, 0.364, 0.401, 0.030)
		colorDesert    (0.404, 0.410, 0.455, 0.020)
		colorLowland   (0.451, 0.457, 0.502, 0.030)
		colorUpland    (0.497, 0.503, 0.548, 0.050)
		colorRock      (0.544, 0.549, 0.610, 0.020)
		colorSnow      (0.544, 0.549, 0.610, 1.000)
		BumpHeight      0.0433281
		BumpOffset      0.00866562
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0682253
		DustBright  0.426872
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.04826
		Period          18.087
		Eccentricity    0.926082
		Inclination     -148.913
		AscendingNode   145.906
		ArgOfPericenter -29.9176
		MeanAnomaly     -98.0068
	}
}

Comet	"Foerost System C65"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            3.0137e-013
	Radius          0.830911
	InertiaMoment   0.398301

	Oblateness      0.00255861

	RotationPeriod  84.032
	Obliquity       276.842
	EqAscendNode    180.828

	AbsMagn         4.17089
	SlopeParam      2.23163
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.556 0.552 0.549)

	Surface
	{
		SurfStyle       0.533307
		OceanStyle      0.499871
		Randomize      (0.908, -0.052, -0.132)
		colorDistMagn   0.945946
		colorDistFreq   0.000210083
		detailScale     22.6894
		colorConversion true
		snowLevel       2
		tropicLatitude  0.99067
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.339834
		terraceProb     0.32058
		erosion         0
		montesMagn      0.536139
		montesFreq      2.81716
		montesSpiky     0.835559
		montesFraction  0.459668
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00135754
		hillsFraction   0.388299
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228488
		craterFreq      0.21863
		craterDensity   0.916419
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.476066
		volcanoTemp     1582.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.217, 0.188, 0.154, 0.000)
		colorShelf     (0.222, 0.193, 0.176, 0.000)
		colorBeach     (0.261, 0.226, 0.209, 0.000)
		colorDesert    (0.283, 0.243, 0.203, 0.000)
		colorLowland   (0.311, 0.260, 0.231, 0.000)
		colorUpland    (0.344, 0.315, 0.280, 0.000)
		colorRock      (0.372, 0.342, 0.302, 0.000)
		colorSnow      (0.406, 0.364, 0.318, 1.000)
		BumpHeight      0.74782
		BumpOffset      0.149564
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.316789
		GasToDust   0.25
		Particles   1619
		GasBright   0.192828
		DustBright  0.786756
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.27435
		Period          7.61637
		Eccentricity    0.897741
		Inclination     -12.4987
		AscendingNode   95.3359
		ArgOfPericenter 7.51385
		MeanAnomaly     -42.0681
	}
}

Comet	"Foerost System C66"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            2.33088e-009
	Radius          18.8153
	InertiaMoment   0.399948

	Oblateness      0.00414314

	RotationPeriod  81.161
	Obliquity       230.047
	EqAscendNode    165.405

	AbsMagn         11.7214
	SlopeParam      2.95335
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.641 0.584 0.539)

	Surface
	{
		SurfStyle       0.592864
		OceanStyle      0.762355
		Randomize      (-0.280, -0.855, -0.718)
		colorDistMagn   0.149542
		colorDistFreq   0.0664545
		detailScale     513.783
		colorConversion true
		snowLevel       2
		tropicLatitude  0.791198
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.388717
		terraceProb     0.380683
		erosion         0
		montesMagn      0.552093
		montesFreq      3.40166
		montesSpiky     0.892449
		montesFraction  0.515604
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.735205
		hillsFraction   0.475982
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263797
		craterFreq      0.163507
		craterDensity   0.759184
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.607202
		volcanoTemp     1226.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.250, 0.199, 0.151, 0.000)
		colorShelf     (0.257, 0.204, 0.173, 0.000)
		colorBeach     (0.301, 0.239, 0.205, 0.000)
		colorDesert    (0.327, 0.257, 0.199, 0.000)
		colorLowland   (0.359, 0.274, 0.226, 0.000)
		colorUpland    (0.398, 0.333, 0.275, 0.000)
		colorRock      (0.430, 0.362, 0.296, 0.000)
		colorSnow      (0.468, 0.385, 0.313, 1.000)
		BumpHeight      16.9338
		BumpOffset      3.38675
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.797981
		GasToDust   0.25
		Particles   2591
		GasBright   0.169931
		DustBright  0.49414
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.52189
		Period          14.6767
		Eccentricity    0.940493
		Inclination     -156.111
		AscendingNode   -94.5113
		ArgOfPericenter -12.9019
		MeanAnomaly     -6.53349
	}
}

Comet	"Foerost System C67"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            7.17696e-017
	Radius          0.0507354
	InertiaMoment   0.398842

	Oblateness      0.00280937

	RotationPeriod  78.4868
	Obliquity       183.253
	EqAscendNode    149.983

	AbsMagn         7.86115
	SlopeParam      3.55751
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.781 0.779 0.776)

	Surface
	{
		SurfStyle       0.64014
		OceanStyle      0.301013
		Randomize      (-0.519, 0.608, -0.917)
		colorDistMagn   0.525383
		colorDistFreq   1.30984e-006
		detailScale     1.38541
		colorConversion true
		snowLevel       2
		tropicLatitude  0.298217
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.668097
		terraceProb     0.16312
		erosion         0
		montesMagn      0.37906
		montesFreq      4.42661
		montesSpiky     0.983129
		montesFraction  0.438756
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.40345e-006
		hillsFraction   0.625305
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.179369
		craterFreq      0.148643
		craterDensity   0.725472
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.477418
		volcanoTemp     1444.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.305, 0.265, 0.217, 0.000)
		colorShelf     (0.313, 0.273, 0.248, 0.000)
		colorBeach     (0.367, 0.320, 0.295, 0.000)
		colorDesert    (0.399, 0.343, 0.287, 0.000)
		colorLowland   (0.438, 0.366, 0.326, 0.000)
		colorUpland    (0.484, 0.444, 0.396, 0.000)
		colorRock      (0.524, 0.483, 0.427, 0.000)
		colorSnow      (0.570, 0.514, 0.450, 1.000)
		BumpHeight      0.0456618
		BumpOffset      0.00913237
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.109774
		DustBright  0.238783
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.56539
		Period          21.6611
		Eccentricity    0.947057
		Inclination     161.108
		AscendingNode   -57.4329
		ArgOfPericenter -12.3289
		MeanAnomaly     42.5412
	}
}

Comet	"Foerost System C68"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            5.55085e-013
	Radius          1.16545
	InertiaMoment   0.397093

	Oblateness      0.00466864

	RotationPeriod  75.9712
	Obliquity       136.459
	EqAscendNode    134.56

	AbsMagn         3.82681
	SlopeParam      4.12304
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.516 0.513 0.511)

	Surface
	{
		SurfStyle       0.904731
		OceanStyle      0.399226
		Randomize      (0.702, -0.217, -0.367)
		colorDistMagn   0.544754
		colorDistFreq   0.00106268
		detailScale     31.8247
		colorConversion true
		snowLevel       2
		tropicLatitude  0.988428
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.301365
		terraceProb     0.378301
		erosion         0
		montesMagn      0.623483
		montesFreq      3.05594
		montesSpiky     0.906614
		montesFraction  0.535179
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00352424
		hillsFraction   0.672868
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225936
		craterFreq      0.252046
		craterDensity   0.684103
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.497054
		volcanoTemp     1414.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.175, 0.180, 0.204, 0.050)
		colorShelf     (0.206, 0.210, 0.235, 0.040)
		colorBeach     (0.237, 0.241, 0.266, 0.030)
		colorDesert    (0.268, 0.272, 0.301, 0.020)
		colorLowland   (0.299, 0.303, 0.332, 0.030)
		colorUpland    (0.330, 0.333, 0.363, 0.050)
		colorRock      (0.361, 0.364, 0.403, 0.020)
		colorSnow      (0.361, 0.364, 0.403, 1.000)
		BumpHeight      1.04891
		BumpOffset      0.209782
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.349614
		GasToDust   0.25
		Particles   1686
		GasBright   0.311544
		DustBright  0.5215
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.83008
		Period          16.6447
		Eccentricity    0.940438
		Inclination     40.9346
		AscendingNode   -151.306
		ArgOfPericenter 146.825
		MeanAnomaly     -163.709
	}
}

Comet	"Foerost System C69"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            4.29318e-009
	Radius          29.9977
	InertiaMoment   0.399309

	Oblateness      0.0110631

	RotationPeriod  73.5852
	Obliquity       89.6644
	EqAscendNode    119.137

	AbsMagn         11.4109
	SlopeParam      4.69879
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.494 0.488 0.485)

	Surface
	{
		SurfStyle       0.662747
		OceanStyle      0.490772
		Randomize      (0.520, -0.885, -0.638)
		colorDistMagn   0.344549
		colorDistFreq   0.525525
		detailScale     819.138
		colorConversion true
		snowLevel       2
		tropicLatitude  0.913694
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.458976
		terraceProb     0.13669
		erosion         0
		montesMagn      0.372366
		montesFreq      3.68785
		montesSpiky     0.973573
		montesFraction  0.455327
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.96173
		hillsFraction   0.84227
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240943
		craterFreq      0.238711
		craterDensity   0.948798
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.532674
		volcanoTemp     1531.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.193, 0.166, 0.136, 0.000)
		colorShelf     (0.198, 0.171, 0.155, 0.000)
		colorBeach     (0.232, 0.200, 0.184, 0.000)
		colorDesert    (0.252, 0.215, 0.180, 0.000)
		colorLowland   (0.277, 0.230, 0.204, 0.000)
		colorUpland    (0.307, 0.278, 0.247, 0.000)
		colorRock      (0.331, 0.303, 0.267, 0.000)
		colorSnow      (0.361, 0.322, 0.281, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.830806
		GasToDust   0.25
		Particles   2658
		GasBright   0.224105
		DustBright  0.293425
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.01945
		Period          17.8942
		Eccentricity    0.952341
		Inclination     -137.705
		AscendingNode   126.69
		ArgOfPericenter 101.77
		MeanAnomaly     117.994
	}
}

Comet	"Foerost System C70"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            1.3219e-016
	Radius          0.0721904
	InertiaMoment   0.397983

	Oblateness      0.00530628

	RotationPeriod  71.3068
	Obliquity       42.8701
	EqAscendNode    103.715

	AbsMagn         7.65211
	SlopeParam      5.34069
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.815 0.793 0.763)

	Surface
	{
		SurfStyle       0.990389
		OceanStyle      0.283753
		Randomize      (-0.501, 0.940, -0.486)
		colorDistMagn   0.874273
		colorDistFreq   3.96485e-006
		detailScale     1.97128
		colorConversion true
		snowLevel       2
		tropicLatitude  0.62818
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.60907
		terraceProb     0.190333
		erosion         0
		montesMagn      0.462669
		montesFreq      3.20931
		montesSpiky     0.967837
		montesFraction  0.537045
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.34107e-005
		hillsFraction   0.635848
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.216202
		craterFreq      0.235783
		craterDensity   0.906235
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.46609
		volcanoTemp     1418.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.277, 0.277, 0.305, 0.050)
		colorShelf     (0.326, 0.325, 0.351, 0.040)
		colorBeach     (0.375, 0.373, 0.397, 0.030)
		colorDesert    (0.424, 0.420, 0.450, 0.020)
		colorLowland   (0.473, 0.468, 0.496, 0.030)
		colorUpland    (0.521, 0.515, 0.541, 0.050)
		colorRock      (0.570, 0.563, 0.602, 0.020)
		colorSnow      (0.570, 0.563, 0.602, 1.000)
		BumpHeight      0.0649714
		BumpOffset      0.0129943
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.099407
		DustBright  0.10261
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.38712
		Period          20.4048
		Eccentricity    0.944455
		Inclination     4.41319
		AscendingNode   154.735
		ArgOfPericenter 78.6726
		MeanAnomaly     8.22363
	}
}

Comet	"Foerost System C71"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            1.0224e-012
	Radius          1.7873
	InertiaMoment   0.39974

	Oblateness      0.0111549

	RotationPeriod  69.1181
	Obliquity       356.076
	EqAscendNode    88.2922

	AbsMagn         3.4487
	SlopeParam      6.16746
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.782 0.729 0.684)

	Surface
	{
		SurfStyle       0.552607
		OceanStyle      0.409509
		Randomize      (-0.759, 0.008, -0.624)
		colorDistMagn   0.569825
		colorDistFreq   0.00145577
		detailScale     48.8052
		colorConversion true
		snowLevel       2
		tropicLatitude  0.884264
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.536065
		terraceProb     0.21348
		erosion         0
		montesMagn      0.569279
		montesFreq      3.10508
		montesSpiky     0.928869
		montesFraction  0.673631
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0106556
		hillsFraction   0.71602
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222714
		craterFreq      0.206401
		craterDensity   0.908345
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.512779
		volcanoTemp     1287.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.305, 0.248, 0.192, 0.000)
		colorShelf     (0.313, 0.255, 0.219, 0.000)
		colorBeach     (0.368, 0.299, 0.260, 0.000)
		colorDesert    (0.399, 0.321, 0.253, 0.000)
		colorLowland   (0.438, 0.342, 0.287, 0.000)
		colorUpland    (0.485, 0.415, 0.349, 0.000)
		colorRock      (0.524, 0.452, 0.376, 0.000)
		colorSnow      (0.571, 0.481, 0.397, 1.000)
		BumpHeight      1.60857
		BumpOffset      0.321714
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.38244
		GasToDust   0.25
		Particles   1752
		GasBright   0.0350931
		DustBright  0.65141
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.21425
		Period          19.2107
		Eccentricity    0.945674
		Inclination     -117.501
		AscendingNode   84.0337
		ArgOfPericenter 81.0962
		MeanAnomaly     78.3142
	}
}

Comet	"Foerost System C72"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            7.9075e-009
	Radius          28.214
	InertiaMoment   0.398588

	Oblateness      0.00601093

	RotationPeriod  67.0048
	Obliquity       309.282
	EqAscendNode    72.8696

	AbsMagn         11.1198
	SlopeParam      7.84838
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.551 0.546 0.540)

	Surface
	{
		SurfStyle       0.982229
		OceanStyle      0.753217
		Randomize      (0.314, -0.726, 0.476)
		colorDistMagn   0.673877
		colorDistFreq   0.426548
		detailScale     770.432
		colorConversion true
		snowLevel       2
		tropicLatitude  0.900557
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.618039
		terraceProb     0.277172
		erosion         0
		montesMagn      0.40932
		montesFreq      3.18566
		montesSpiky     0.92755
		montesFraction  0.587038
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.48266
		hillsFraction   0.803254
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244022
		craterFreq      0.201665
		craterDensity   0.935098
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.493456
		volcanoTemp     1445.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.187, 0.191, 0.216, 0.050)
		colorShelf     (0.220, 0.224, 0.248, 0.040)
		colorBeach     (0.254, 0.257, 0.281, 0.030)
		colorDesert    (0.287, 0.290, 0.318, 0.020)
		colorLowland   (0.320, 0.322, 0.351, 0.030)
		colorUpland    (0.353, 0.355, 0.383, 0.050)
		colorRock      (0.386, 0.388, 0.426, 0.020)
		colorSnow      (0.386, 0.388, 0.426, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.863632
		GasToDust   0.25
		Particles   2724
		GasBright   0.0408697
		DustBright  0.33012
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.22426
		Period          26.5156
		Eccentricity    0.938632
		Inclination     91.5957
		AscendingNode   122.621
		ArgOfPericenter -161.833
		MeanAnomaly     0.277712
	}
}

Comet	"Foerost System C73"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            2.43478e-016
	Radius          0.108487
	InertiaMoment   0.396291

	Oblateness      0.0117087

	RotationPeriod  64.9551
	Obliquity       262.487
	EqAscendNode    57.447

	AbsMagn         7.44211
	SlopeParam      2.61025
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.449 0.441 0.437)

	Surface
	{
		SurfStyle       0.707549
		OceanStyle      0.928501
		Randomize      (0.494, -0.629, -0.712)
		colorDistMagn   0.610027
		colorDistFreq   7.89109e-006
		detailScale     2.96243
		colorConversion true
		snowLevel       2
		tropicLatitude  0.507674
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.439375
		terraceProb     0.135916
		erosion         0
		montesMagn      0.478844
		montesFreq      2.55006
		montesSpiky     0.829807
		montesFraction  0.841418
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.48626e-005
		hillsFraction   0.571922
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230667
		craterFreq      0.233088
		craterDensity   0.955468
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.481992
		volcanoTemp     1352.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.175, 0.150, 0.122, 0.000)
		colorShelf     (0.180, 0.154, 0.140, 0.000)
		colorBeach     (0.211, 0.181, 0.166, 0.000)
		colorDesert    (0.229, 0.194, 0.162, 0.000)
		colorLowland   (0.252, 0.207, 0.184, 0.000)
		colorUpland    (0.278, 0.251, 0.223, 0.000)
		colorRock      (0.301, 0.273, 0.241, 0.000)
		colorSnow      (0.328, 0.291, 0.254, 1.000)
		BumpHeight      0.0976386
		BumpOffset      0.0195277
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.144754
		DustBright  0.710722
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.25148
		Period          13.0192
		Eccentricity    0.981552
		Inclination     104.219
		AscendingNode   158.418
		ArgOfPericenter 103.091
		MeanAnomaly     -108.712
	}
}

Comet	"Foerost System C74"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            1.88313e-012
	Radius          1.74764
	InertiaMoment   0.399085

	Oblateness      0.00680714

	RotationPeriod  62.959
	Obliquity       215.693
	EqAscendNode    42.0244

	AbsMagn         3.02484
	SlopeParam      3.25974
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.685 0.575 0.439)

	Surface
	{
		SurfStyle       0.423322
		OceanStyle      0.777061
		Randomize      (0.878, -0.765, 0.435)
		colorDistMagn   0.290809
		colorDistFreq   0.000949699
		detailScale     47.7222
		colorConversion true
		snowLevel       2
		tropicLatitude  0.907254
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.376739
		terraceProb     0.668488
		erosion         0
		montesMagn      0.400437
		montesFreq      3.16909
		montesSpiky     0.950539
		montesFraction  0.353987
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00695652
		hillsFraction   0.418452
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.273231
		craterFreq      0.187572
		craterDensity   0.817955
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.543485
		volcanoTemp     1589.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.274, 0.230, 0.176, 0.000)
		colorShelf     (0.291, 0.244, 0.187, 0.000)
		colorBeach     (0.308, 0.259, 0.198, 0.000)
		colorDesert    (0.326, 0.273, 0.209, 0.000)
		colorLowland   (0.343, 0.287, 0.220, 0.000)
		colorUpland    (0.360, 0.302, 0.231, 0.000)
		colorRock      (0.377, 0.316, 0.242, 0.000)
		colorSnow      (0.394, 0.331, 0.253, 1.000)
		BumpHeight      1.57287
		BumpOffset      0.314575
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.415266
		GasToDust   0.25
		Particles   1818
		GasBright   0.123249
		DustBright  0.416714
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.03917
		Period          11.7651
		Eccentricity    0.936017
		Inclination     -102.589
		AscendingNode   -115.326
		ArgOfPericenter -137.348
		MeanAnomaly     160.86
	}
}

Comet	"Foerost System C75"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            1.45646e-008
	Radius          41.8234
	InertiaMoment   0.397603

	Oblateness      0.0127755

	RotationPeriod  61.0079
	Obliquity       168.899
	EqAscendNode    26.6018

	AbsMagn         10.8443
	SlopeParam      3.83799
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.852 0.785 0.742)

	Surface
	{
		SurfStyle       0.464915
		OceanStyle      0.535895
		Randomize      (-0.213, -0.756, -0.852)
		colorDistMagn   0.318102
		colorDistFreq   1.31567
		detailScale     1142.06
		colorConversion true
		snowLevel       2
		tropicLatitude  0.959968
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.765295
		terraceProb     0.100208
		erosion         0
		montesMagn      0.562561
		montesFreq      2.83823
		montesSpiky     0.998461
		montesFraction  0.712683
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.11176
		hillsFraction   0.645334
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234766
		craterFreq      0.155221
		craterDensity   0.85694
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.536784
		volcanoTemp     1618.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.341, 0.314, 0.297, 0.000)
		colorShelf     (0.362, 0.333, 0.315, 0.000)
		colorBeach     (0.383, 0.353, 0.334, 0.000)
		colorDesert    (0.404, 0.373, 0.353, 0.000)
		colorLowland   (0.426, 0.392, 0.371, 0.000)
		colorUpland    (0.447, 0.412, 0.390, 0.000)
		colorRock      (0.468, 0.432, 0.408, 0.000)
		colorSnow      (0.490, 0.451, 0.427, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.896458
		GasToDust   0.25
		Particles   2790
		GasBright   0.0644843
		DustBright  0.159965
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.67028
		Period          15.6139
		Eccentricity    0.957693
		Inclination     -65.1652
		AscendingNode   40.9208
		ArgOfPericenter -51.6967
		MeanAnomaly     158.854
	}
}

Comet	"Foerost System C76"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            4.48457e-016
	Radius          0.108253
	InertiaMoment   0.39953

	Oblateness      0.00772386

	RotationPeriod  59.0943
	Obliquity       122.104
	EqAscendNode    11.1792

	AbsMagn         7.23056
	SlopeParam      4.40275
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.711 0.648 0.626)

	Surface
	{
		SurfStyle       0.729171
		OceanStyle      0.950929
		Randomize      (0.421, -0.707, 0.474)
		colorDistMagn   0.197995
		colorDistFreq   4.38165e-006
		detailScale     2.95602
		colorConversion true
		snowLevel       2
		tropicLatitude  0.970927
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.456531
		terraceProb     0.370344
		erosion         0
		montesMagn      0.620642
		montesFreq      3.26896
		montesSpiky     0.890106
		montesFraction  0.427885
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.41349e-005
		hillsFraction   0.670306
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237108
		craterFreq      0.208168
		craterDensity   0.945455
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.493563
		volcanoTemp     1341.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.277, 0.220, 0.175, 0.000)
		colorShelf     (0.285, 0.227, 0.200, 0.000)
		colorBeach     (0.334, 0.266, 0.238, 0.000)
		colorDesert    (0.363, 0.285, 0.232, 0.000)
		colorLowland   (0.398, 0.305, 0.263, 0.000)
		colorUpland    (0.441, 0.370, 0.319, 0.000)
		colorRock      (0.477, 0.402, 0.345, 0.000)
		colorSnow      (0.519, 0.428, 0.363, 1.000)
		BumpHeight      0.0974273
		BumpOffset      0.0194855
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.245536
		DustBright  0.4634
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.94638
		Period          11.2305
		Eccentricity    0.945924
		Inclination     139.526
		AscendingNode   72.5473
		ArgOfPericenter -130.506
		MeanAnomaly     -27.5856
	}
}

Comet	"Foerost System C77"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            3.46849e-012
	Radius          2.5641
	InertiaMoment   0.398308

	Oblateness      0.0140941

	RotationPeriod  57.2115
	Obliquity       75.31
	EqAscendNode    355.757

	AbsMagn         2.53627
	SlopeParam      5.00233
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.446 0.416 0.358)

	Surface
	{
		SurfStyle       0.0297388
		OceanStyle      0.132526
		Randomize      (0.120, 0.240, 0.617)
		colorDistMagn   0.602249
		colorDistFreq   0.00268525
		detailScale     70.0169
		colorConversion true
		snowLevel       2
		tropicLatitude  0.812634
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.464254
		terraceProb     0.244599
		erosion         0
		montesMagn      0.494689
		montesFreq      2.80455
		montesSpiky     0.974074
		montesFraction  0.318941
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.021308
		hillsFraction   0.501566
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.207572
		craterFreq      0.180319
		craterDensity   0.75582
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.433394
		volcanoTemp     1031.33
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.178, 0.167, 0.143, 0.000)
		colorShelf     (0.190, 0.177, 0.152, 0.000)
		colorBeach     (0.201, 0.187, 0.161, 0.000)
		colorDesert    (0.212, 0.198, 0.170, 0.000)
		colorLowland   (0.223, 0.208, 0.179, 0.000)
		colorUpland    (0.234, 0.219, 0.188, 0.000)
		colorRock      (0.245, 0.229, 0.197, 0.000)
		colorSnow      (0.257, 0.239, 0.206, 1.000)
		BumpHeight      2.30769
		BumpOffset      0.461537
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.448092
		GasToDust   0.25
		Particles   1885
		GasBright   0.15949
		DustBright  0.233933
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.68964
		Period          15.7376
		Eccentricity    0.957816
		Inclination     22.9424
		AscendingNode   -157.854
		ArgOfPericenter -20.1573
		MeanAnomaly     89.9939
	}
}

Comet	"Foerost System C78"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            2.68262e-008
	Radius          42.3082
	InertiaMoment   0.399953

	Oblateness      0.00879918

	RotationPeriod  55.3536
	Obliquity       28.5157
	EqAscendNode    340.334

	AbsMagn         10.5817
	SlopeParam      5.71163
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.743 0.740 0.738)

	Surface
	{
		SurfStyle       0.0746599
		OceanStyle      0.479056
		Randomize      (0.231, 0.145, 0.346)
		colorDistMagn   0.543979
		colorDistFreq   0.408643
		detailScale     1155.3
		colorConversion true
		snowLevel       2
		tropicLatitude  0.654743
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.454641
		terraceProb     0.241579
		erosion         0
		montesMagn      0.55763
		montesFreq      3.02135
		montesSpiky     0.986624
		montesFraction  0.387382
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.20768
		hillsFraction   0.681915
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264927
		craterFreq      0.261855
		craterDensity   0.821037
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.511568
		volcanoTemp     1456.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.297, 0.296, 0.295, 0.000)
		colorShelf     (0.316, 0.314, 0.314, 0.000)
		colorBeach     (0.334, 0.333, 0.332, 0.000)
		colorDesert    (0.353, 0.351, 0.351, 0.000)
		colorLowland   (0.372, 0.370, 0.369, 0.000)
		colorUpland    (0.390, 0.388, 0.388, 0.000)
		colorRock      (0.409, 0.407, 0.406, 0.000)
		colorSnow      (0.427, 0.425, 0.425, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.929284
		GasToDust   0.25
		Particles   2857
		GasBright   0.407732
		DustBright  0.470177
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.8445
		Period          16.7388
		Eccentricity    0.948151
		Inclination     65.9211
		AscendingNode   155.735
		ArgOfPericenter -63.2143
		MeanAnomaly     -139.441
	}
}

Comet	"Foerost System C79"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            8.25998e-016
	Radius          0.157525
	InertiaMoment   0.398848

	Oblateness      0.0157159

	RotationPeriod  53.5152
	Obliquity       341.721
	EqAscendNode    324.911

	AbsMagn         7.01683
	SlopeParam      6.75766
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.673 0.667 0.665)

	Surface
	{
		SurfStyle       0.0187233
		OceanStyle      0.575312
		Randomize      (-0.030, -0.384, 0.758)
		colorDistMagn   0.764348
		colorDistFreq   2.1942e-005
		detailScale     4.30149
		colorConversion true
		snowLevel       2
		tropicLatitude  0.817944
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.737637
		terraceProb     0.229703
		erosion         0
		montesMagn      0.378994
		montesFreq      2.86413
		montesSpiky     0.899689
		montesFraction  0.615774
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.91076e-005
		hillsFraction   0.553017
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2498
		craterFreq      0.265488
		craterDensity   0.914945
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.539332
		volcanoTemp     1352.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.269, 0.267, 0.266, 0.000)
		colorShelf     (0.286, 0.284, 0.282, 0.000)
		colorBeach     (0.303, 0.300, 0.299, 0.000)
		colorDesert    (0.320, 0.317, 0.316, 0.000)
		colorLowland   (0.337, 0.334, 0.332, 0.000)
		colorUpland    (0.354, 0.350, 0.349, 0.000)
		colorRock      (0.370, 0.367, 0.365, 0.000)
		colorSnow      (0.387, 0.384, 0.382, 1.000)
		BumpHeight      0.141773
		BumpOffset      0.0283545
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0132054
		DustBright  0.54919
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.88334
		Period          10.872
		Eccentricity    0.934113
		Inclination     -142.822
		AscendingNode   -163.014
		ArgOfPericenter -14.6669
		MeanAnomaly     86.1251
	}
}

Comet	"Foerost System C80"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            6.38851e-012
	Radius          2.62067
	InertiaMoment   0.397108

	Oblateness      0.00996311

	RotationPeriod  51.691
	Obliquity       294.927
	EqAscendNode    309.489

	AbsMagn         1.94901
	SlopeParam      2.22019
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.669 0.542 0.466)

	Surface
	{
		SurfStyle       0.950925
		OceanStyle      0.26428
		Randomize      (0.325, 0.972, 0.633)
		colorDistMagn   0.832375
		colorDistFreq   0.00362281
		detailScale     71.5617
		colorConversion true
		snowLevel       2
		tropicLatitude  0.712392
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.701967
		terraceProb     0.230548
		erosion         0
		montesMagn      0.484555
		montesFreq      2.76812
		montesSpiky     0.830286
		montesFraction  0.616079
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0174503
		hillsFraction   0.733019
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.215922
		craterFreq      0.17799
		craterDensity   0.830019
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.530557
		volcanoTemp     1689.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.228, 0.190, 0.186, 0.050)
		colorShelf     (0.268, 0.222, 0.214, 0.040)
		colorBeach     (0.308, 0.255, 0.242, 0.030)
		colorDesert    (0.348, 0.287, 0.275, 0.020)
		colorLowland   (0.388, 0.320, 0.303, 0.030)
		colorUpland    (0.428, 0.353, 0.331, 0.050)
		colorRock      (0.469, 0.385, 0.368, 0.020)
		colorSnow      (0.469, 0.385, 0.368, 1.000)
		BumpHeight      2.3586
		BumpOffset      0.47172
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.480918
		GasToDust   0.25
		Particles   1951
		GasBright   0.0203742
		DustBright  0.226508
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.85221
		Period          10.6964
		Eccentricity    0.913462
		Inclination     104.971
		AscendingNode   132.593
		ArgOfPericenter 166.546
		MeanAnomaly     55.731
	}
}

Comet	"Foerost System C81"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            4.94105e-008
	Radius          61.147
	InertiaMoment   0.399314

	Oblateness      0.0177215

	RotationPeriod  49.8762
	Obliquity       248.133
	EqAscendNode    294.066

	AbsMagn         10.3297
	SlopeParam      2.94449
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.601 0.597 0.593)

	Surface
	{
		SurfStyle       0.555688
		OceanStyle      0.319411
		Randomize      (-0.896, 0.563, 0.036)
		colorDistMagn   0.347824
		colorDistFreq   1.76496
		detailScale     1669.72
		colorConversion true
		snowLevel       2
		tropicLatitude  0.846362
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.37916
		terraceProb     0.348802
		erosion         0
		montesMagn      0.569099
		montesFreq      3.60581
		montesSpiky     0.866319
		montesFraction  0.659167
		dunesFraction   0
		hillsMagn       0
		hillsFreq       10.0404
		hillsFraction   0.678225
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246072
		craterFreq      0.272238
		craterDensity   0.942413
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.46808
		volcanoTemp     1146.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.235, 0.203, 0.166, 0.000)
		colorShelf     (0.241, 0.209, 0.190, 0.000)
		colorBeach     (0.283, 0.245, 0.225, 0.000)
		colorDesert    (0.307, 0.263, 0.219, 0.000)
		colorLowland   (0.337, 0.281, 0.249, 0.000)
		colorUpland    (0.373, 0.341, 0.302, 0.000)
		colorRock      (0.403, 0.370, 0.326, 0.000)
		colorSnow      (0.439, 0.394, 0.344, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.96211
		GasToDust   0.25
		Particles   2923
		GasBright   0.103541
		DustBright  0.627828
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.45624
		Period          14.2682
		Eccentricity    0.96713
		Inclination     -112.452
		AscendingNode   -38.1116
		ArgOfPericenter -158.634
		MeanAnomaly     -61.0116
	}
}

Comet	"Foerost System C82"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            1.52139e-015
	Radius          0.16233
	InertiaMoment   0.397991

	Oblateness      0.0115374

	RotationPeriod  48.0662
	Obliquity       201.339
	EqAscendNode    278.644

	AbsMagn         6.80026
	SlopeParam      3.5496
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.752 0.748 0.747)

	Surface
	{
		SurfStyle       0.981655
		OceanStyle      0.206392
		Randomize      (0.059, 0.825, -0.707)
		colorDistMagn   0.467834
		colorDistFreq   6.30792e-006
		detailScale     4.4327
		colorConversion true
		snowLevel       2
		tropicLatitude  0.291309
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.637655
		terraceProb     0.36692
		erosion         0
		montesMagn      0.548683
		montesFreq      2.96346
		montesSpiky     0.911859
		montesFraction  0.853185
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.02856e-005
		hillsFraction   0.709174
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249592
		craterFreq      0.150202
		craterDensity   0.816161
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.548732
		volcanoTemp     1526.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.256, 0.262, 0.299, 0.050)
		colorShelf     (0.301, 0.307, 0.343, 0.040)
		colorBeach     (0.346, 0.352, 0.388, 0.030)
		colorDesert    (0.391, 0.397, 0.440, 0.020)
		colorLowland   (0.436, 0.441, 0.485, 0.030)
		colorUpland    (0.481, 0.486, 0.530, 0.050)
		colorRock      (0.527, 0.531, 0.590, 0.020)
		colorSnow      (0.527, 0.531, 0.590, 1.000)
		BumpHeight      0.146097
		BumpOffset      0.0292195
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0325521
		GasToDust   0.25
		Particles   1045
		GasBright   0.0834275
		DustBright  0.332428
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.26634
		Period          7.57619
		Eccentricity    0.966825
		Inclination     38.0196
		AscendingNode   173.852
		ArgOfPericenter 10.4253
		MeanAnomaly     107.323
	}
}

Comet	"Foerost System C83"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            1.17668e-011
	Radius          3.76564
	InertiaMoment   0.399745

	Oblateness      0.0202393

	RotationPeriod  46.2564
	Obliquity       154.544
	EqAscendNode    263.221

	AbsMagn         1.19139
	SlopeParam      4.11531
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.626 0.499 0.395)

	Surface
	{
		SurfStyle       0.241847
		OceanStyle      0.0503829
		Randomize      (-0.549, 0.579, -0.553)
		colorDistMagn   0.320872
		colorDistFreq   0.00449405
		detailScale     102.827
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999969
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.45972
		terraceProb     0.39608
		erosion         0
		montesMagn      0.369669
		montesFreq      3.54889
		montesSpiky     0.970065
		montesFraction  0.40472
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0354819
		hillsFraction   0.761954
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248396
		craterFreq      0.229602
		craterDensity   0.925399
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.448726
		volcanoTemp     1402.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.250, 0.200, 0.158, 0.000)
		colorShelf     (0.266, 0.212, 0.168, 0.000)
		colorBeach     (0.282, 0.225, 0.178, 0.000)
		colorDesert    (0.297, 0.237, 0.188, 0.000)
		colorLowland   (0.313, 0.250, 0.197, 0.000)
		colorUpland    (0.329, 0.262, 0.207, 0.000)
		colorRock      (0.344, 0.275, 0.217, 0.000)
		colorSnow      (0.360, 0.287, 0.227, 1.000)
		BumpHeight      3.38908
		BumpOffset      0.677815
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.513744
		GasToDust   0.25
		Particles   2017
		GasBright   0.233784
		DustBright  0.666558
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.33383
		Period          13.5169
		Eccentricity    0.947868
		Inclination     -110.744
		AscendingNode   144.621
		ArgOfPericenter -159.547
		MeanAnomaly     -158.96
	}
}

Comet	"Foerost System C84"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            9.10079e-008
	Radius          63.4436
	InertiaMoment   0.398595

	Oblateness      0.0134991

	RotationPeriod  44.4421
	Obliquity       107.75
	EqAscendNode    247.798

	AbsMagn         10.0867
	SlopeParam      4.6906
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.761 0.759 0.757)

	Surface
	{
		SurfStyle       0.40956
		OceanStyle      0.986263
		Randomize      (0.931, -0.993, -0.054)
		colorDistMagn   0.575301
		colorDistFreq   1.24026
		detailScale     1732.43
		colorConversion true
		snowLevel       2
		tropicLatitude  0.308731
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.451066
		terraceProb     0.143608
		erosion         0
		montesMagn      0.493561
		montesFreq      3.05779
		montesSpiky     0.943351
		montesFraction  0.480665
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.94391
		hillsFraction   0.57811
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.266239
		craterFreq      0.167147
		craterDensity   0.808755
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.551596
		volcanoTemp     1201.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.304, 0.304, 0.303, 0.000)
		colorShelf     (0.323, 0.323, 0.322, 0.000)
		colorBeach     (0.342, 0.342, 0.341, 0.000)
		colorDesert    (0.361, 0.361, 0.360, 0.000)
		colorLowland   (0.380, 0.380, 0.378, 0.000)
		colorUpland    (0.399, 0.399, 0.397, 0.000)
		colorRock      (0.418, 0.418, 0.416, 0.000)
		colorSnow      (0.437, 0.437, 0.435, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.994936
		GasToDust   0.25
		Particles   2989
		GasBright   0.186389
		DustBright  0.39844
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.26254
		Period          13.0857
		Eccentricity    0.984606
		Inclination     -105.537
		AscendingNode   18.6348
		ArgOfPericenter 137.91
		MeanAnomaly     130.328
	}
}

Comet	"Foerost System C85"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            2.80221e-015
	Radius          0.232078
	InertiaMoment   0.39632

	Oblateness      0.0231367

	RotationPeriod  42.6187
	Obliquity       60.9557
	EqAscendNode    232.376

	AbsMagn         6.58011
	SlopeParam      5.33105
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.711 0.557 0.481)

	Surface
	{
		SurfStyle       0.157286
		OceanStyle      0.526707
		Randomize      (-0.850, -0.762, -0.127)
		colorDistMagn   0.650829
		colorDistFreq   2.02621e-005
		detailScale     6.33727
		colorConversion true
		snowLevel       2
		tropicLatitude  0.96222
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.693316
		terraceProb     0.142853
		erosion         0
		montesMagn      0.621107
		montesFreq      2.86528
		montesSpiky     0.830127
		montesFraction  0.488282
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000120051
		hillsFraction   0.69673
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230008
		craterFreq      0.189541
		craterDensity   0.774518
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.45132
		volcanoTemp     1680.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.284, 0.223, 0.193, 0.000)
		colorShelf     (0.302, 0.237, 0.205, 0.000)
		colorBeach     (0.320, 0.251, 0.217, 0.000)
		colorDesert    (0.337, 0.265, 0.229, 0.000)
		colorLowland   (0.355, 0.279, 0.241, 0.000)
		colorUpland    (0.373, 0.292, 0.253, 0.000)
		colorRock      (0.391, 0.306, 0.265, 0.000)
		colorSnow      (0.409, 0.320, 0.277, 1.000)
		BumpHeight      0.20887
		BumpOffset      0.041774
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0653782
		GasToDust   0.25
		Particles   1111
		GasBright   0.101734
		DustBright  0.167581
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.55047
		Period          9.0447
		Eccentricity    0.949064
		Inclination     49.0328
		AscendingNode   26.5387
		ArgOfPericenter -39.5212
		MeanAnomaly     -111.657
	}
}

Comet	"Foerost System C86"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            2.1673e-011
	Radius          3.92986
	InertiaMoment   0.39909

	Oblateness      0.0160287

	RotationPeriod  40.7815
	Obliquity       14.1614
	EqAscendNode    216.953

	AbsMagn         0.0587664
	SlopeParam      6.15363
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.539 0.537 0.533)

	Surface
	{
		SurfStyle       0.524151
		OceanStyle      0.297812
		Randomize      (-0.918, -0.878, 0.226)
		colorDistMagn   0.0961366
		colorDistFreq   0.00851258
		detailScale     107.311
		colorConversion true
		snowLevel       2
		tropicLatitude  0.507028
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.493229
		terraceProb     0.165335
		erosion         0
		montesMagn      0.630717
		montesFreq      2.78901
		montesSpiky     0.896209
		montesFraction  0.378215
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0403163
		hillsFraction   0.534422
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229574
		craterFreq      0.264159
		craterDensity   0.998949
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.549669
		volcanoTemp     1769.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.210, 0.182, 0.149, 0.000)
		colorShelf     (0.216, 0.188, 0.170, 0.000)
		colorBeach     (0.253, 0.220, 0.202, 0.000)
		colorDesert    (0.275, 0.236, 0.197, 0.000)
		colorLowland   (0.302, 0.252, 0.224, 0.000)
		colorUpland    (0.334, 0.306, 0.272, 0.000)
		colorRock      (0.361, 0.333, 0.293, 0.000)
		colorSnow      (0.394, 0.354, 0.309, 1.000)
		BumpHeight      3.53687
		BumpOffset      0.707374
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.54657
		GasToDust   0.25
		Particles   2083
		GasBright   0.329259
		DustBright  0.424543
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.99234
		Period          17.7135
		Eccentricity    0.945454
		Inclination     -30.6776
		AscendingNode   -77.0305
		ArgOfPericenter 7.02325
		MeanAnomaly     -175.524
	}
}

Comet	"Foerost System C87"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            1.67625e-007
	Radius          90.2998
	InertiaMoment   0.397613

	Oblateness      0.0274454

	RotationPeriod  38.9252
	Obliquity       327.367
	EqAscendNode    201.531

	AbsMagn         9.8512
	SlopeParam      7.80036
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.743 0.709 0.681)

	Surface
	{
		SurfStyle       0.64085
		OceanStyle      0.0336253
		Randomize      (-0.799, -0.082, -0.435)
		colorDistMagn   0.808261
		colorDistFreq   5.53672
		detailScale     2465.79
		colorConversion true
		snowLevel       2
		tropicLatitude  0.937338
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.317035
		terraceProb     0.366247
		erosion         0
		montesMagn      0.529967
		montesFreq      3.19207
		montesSpiky     0.999885
		montesFraction  0.312275
		dunesFraction   0
		hillsMagn       0
		hillsFreq       18.4233
		hillsFraction   0.655808
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257329
		craterFreq      0.279343
		craterDensity   0.901533
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.469379
		volcanoTemp     1446.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.290, 0.241, 0.191, 0.000)
		colorShelf     (0.297, 0.248, 0.218, 0.000)
		colorBeach     (0.349, 0.291, 0.259, 0.000)
		colorDesert    (0.379, 0.312, 0.252, 0.000)
		colorLowland   (0.416, 0.333, 0.286, 0.000)
		colorUpland    (0.461, 0.404, 0.347, 0.000)
		colorRock      (0.498, 0.439, 0.375, 0.000)
		colorSnow      (0.542, 0.468, 0.395, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.217322
		DustBright  0.220966
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.61471
		Period          15.2607
		Eccentricity    0.959449
		Inclination     93.961
		AscendingNode   -122.652
		ArgOfPericenter -123.344
		MeanAnomaly     -124.045
	}
}

Comet	"Foerost System C88"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            5.1613e-015
	Radius          0.243425
	InertiaMoment   0.399535

	Oblateness      0.0194191

	RotationPeriod  37.0445
	Obliquity       280.573
	EqAscendNode    186.108

	AbsMagn         6.35556
	SlopeParam      2.60041
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.533 0.530 0.527)

	Surface
	{
		SurfStyle       0.263845
		OceanStyle      0.494727
		Randomize      (0.562, -0.738, -0.498)
		colorDistMagn   0.653151
		colorDistFreq   4.03618e-005
		detailScale     6.64713
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999313
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.407379
		terraceProb     0.281465
		erosion         0
		montesMagn      0.610607
		montesFreq      3.15709
		montesSpiky     0.939271
		montesFraction  0.474995
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000165025
		hillsFraction   0.684296
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232047
		craterFreq      0.214209
		craterDensity   0.950484
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.445029
		volcanoTemp     1685.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.213, 0.212, 0.211, 0.000)
		colorShelf     (0.227, 0.225, 0.224, 0.000)
		colorBeach     (0.240, 0.238, 0.237, 0.000)
		colorDesert    (0.253, 0.252, 0.250, 0.000)
		colorLowland   (0.267, 0.265, 0.264, 0.000)
		colorUpland    (0.280, 0.278, 0.277, 0.000)
		colorRock      (0.293, 0.291, 0.290, 0.000)
		colorSnow      (0.307, 0.305, 0.303, 1.000)
		BumpHeight      0.219083
		BumpOffset      0.0438165
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0982039
		GasToDust   0.25
		Particles   1178
		GasBright   0.0506492
		DustBright  0.872126
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.12222
		Period          18.5849
		Eccentricity    0.936035
		Inclination     -36.6741
		AscendingNode   -79.1923
		ArgOfPericenter 137.529
		MeanAnomaly     -54.1225
	}
}

Comet	"Foerost System C89"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            3.9919e-011
	Radius          5.57119
	InertiaMoment   0.398316

	Oblateness      0.0333105

	RotationPeriod  35.1333
	Obliquity       233.779
	EqAscendNode    170.686

	AbsMagn         18.356
	SlopeParam      3.25147
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.495 0.415 0.343)

	Surface
	{
		SurfStyle       0.756734
		OceanStyle      0.44407
		Randomize      (-0.925, 0.874, -0.864)
		colorDistMagn   0.109876
		colorDistFreq   0.0259162
		detailScale     152.131
		colorConversion true
		snowLevel       2
		tropicLatitude  0.160755
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.544582
		terraceProb     0.255792
		erosion         0
		montesMagn      0.552623
		montesFreq      2.73717
		montesSpiky     0.775641
		montesFraction  0.598723
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0958946
		hillsFraction   0.66392
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232855
		craterFreq      0.259786
		craterDensity   0.881619
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.400987
		volcanoTemp     1416.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.193, 0.141, 0.096, 0.000)
		colorShelf     (0.198, 0.145, 0.110, 0.000)
		colorBeach     (0.233, 0.170, 0.130, 0.000)
		colorDesert    (0.253, 0.182, 0.127, 0.000)
		colorLowland   (0.277, 0.195, 0.144, 0.000)
		colorUpland    (0.307, 0.236, 0.175, 0.000)
		colorRock      (0.332, 0.257, 0.189, 0.000)
		colorSnow      (0.362, 0.274, 0.199, 1.000)
		BumpHeight      5.01407
		BumpOffset      1.00281
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.579396
		GasToDust   0.25
		Particles   2150
		GasBright   0.0691872
		DustBright  0.538074
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.23876
		Period          12.9429
		Eccentricity    0.960681
		Inclination     62.8069
		AscendingNode   -177.625
		ArgOfPericenter 75.9759
		MeanAnomaly     105.824
	}
}

Comet	"Foerost System C90"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            3.08745e-007
	Radius          95.1381
	InertiaMoment   0.399958

	Oblateness      0.0241882

	RotationPeriod  33.1852
	Obliquity       186.984
	EqAscendNode    155.263

	AbsMagn         9.62192
	SlopeParam      3.83025
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.808 0.758 0.727)

	Surface
	{
		SurfStyle       0.851407
		OceanStyle      0.256535
		Randomize      (-0.923, -0.101, -0.082)
		colorDistMagn   0.915876
		colorDistFreq   5.10466
		detailScale     2597.91
		colorConversion true
		snowLevel       2
		tropicLatitude  0.808012
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.369698
		terraceProb     0.399642
		erosion         0
		montesMagn      0.628514
		montesFreq      2.35299
		montesSpiky     0.87639
		montesFraction  0.727831
		dunesFraction   0
		hillsMagn       0
		hillsFreq       22.2472
		hillsFraction   0.470924
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239444
		craterFreq      0.326221
		craterDensity   0.990683
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.461814
		volcanoTemp     1083.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.275, 0.265, 0.291, 0.050)
		colorShelf     (0.323, 0.311, 0.334, 0.040)
		colorBeach     (0.372, 0.356, 0.378, 0.030)
		colorDesert    (0.420, 0.402, 0.429, 0.020)
		colorLowland   (0.469, 0.447, 0.472, 0.030)
		colorUpland    (0.517, 0.493, 0.516, 0.050)
		colorRock      (0.566, 0.538, 0.574, 0.020)
		colorSnow      (0.566, 0.538, 0.574, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0504661
		DustBright  0.241282
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.96472
		Period          24.5643
		Eccentricity    0.987033
		Inclination     125.485
		AscendingNode   -82.4616
		ArgOfPericenter 86.634
		MeanAnomaly     111.162
	}
}

Comet	"Foerost System C91"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            9.50649e-015
	Radius          0.343859
	InertiaMoment   0.398854

	Oblateness      0.0418069

	RotationPeriod  31.1927
	Obliquity       140.19
	EqAscendNode    139.84

	AbsMagn         6.12571
	SlopeParam      4.39487
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.794 0.793 0.792)

	Surface
	{
		SurfStyle       0.400082
		OceanStyle      0.953673
		Randomize      (0.237, -0.002, 0.746)
		colorDistMagn   0.642622
		colorDistFreq   6.46869e-005
		detailScale     9.38965
		colorConversion true
		snowLevel       2
		tropicLatitude  0.720444
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.476767
		terraceProb     0.297509
		erosion         0
		montesMagn      0.579394
		montesFreq      2.57763
		montesSpiky     0.77587
		montesFraction  0.124131
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000405023
		hillsFraction   0.697114
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214557
		craterFreq      0.216696
		craterDensity   0.63375
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.500565
		volcanoTemp     1259.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.318, 0.317, 0.317, 0.000)
		colorShelf     (0.338, 0.337, 0.336, 0.000)
		colorBeach     (0.357, 0.357, 0.356, 0.000)
		colorDesert    (0.377, 0.377, 0.376, 0.000)
		colorLowland   (0.397, 0.396, 0.396, 0.000)
		colorUpland    (0.417, 0.416, 0.416, 0.000)
		colorRock      (0.437, 0.436, 0.435, 0.000)
		colorSnow      (0.457, 0.456, 0.455, 1.000)
		BumpHeight      0.309473
		BumpOffset      0.0618946
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.13103
		GasToDust   0.25
		Particles   1244
		GasBright   0.180105
		DustBright  0.59613
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.99373
		Period          17.7227
		Eccentricity    0.97777
		Inclination     -160.153
		AscendingNode   -97.675
		ArgOfPericenter 114.163
		MeanAnomaly     -32.8277
	}
}

Comet	"Foerost System C92"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            7.35257e-011
	Radius          5.8931
	InertiaMoment   0.397123

	Oblateness      0.0309606

	RotationPeriod  29.1472
	Obliquity       93.3956
	EqAscendNode    124.418

	AbsMagn         15.7978
	SlopeParam      4.99359
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.758 0.756 0.752)

	Surface
	{
		SurfStyle       0.674293
		OceanStyle      0.961671
		Randomize      (-0.827, 0.383, -0.377)
		colorDistMagn   0.402716
		colorDistFreq   0.022496
		detailScale     160.921
		colorConversion true
		snowLevel       2
		tropicLatitude  0.974554
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.567059
		terraceProb     0.242696
		erosion         0
		montesMagn      0.358494
		montesFreq      2.85911
		montesSpiky     0.993228
		montesFraction  0.514314
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0861169
		hillsFraction   0.634384
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239224
		craterFreq      0.230816
		craterDensity   0.855488
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.512534
		volcanoTemp     1738.95
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.296, 0.257, 0.211, 0.000)
		colorShelf     (0.303, 0.265, 0.241, 0.000)
		colorBeach     (0.356, 0.310, 0.286, 0.000)
		colorDesert    (0.387, 0.333, 0.278, 0.000)
		colorLowland   (0.425, 0.355, 0.316, 0.000)
		colorUpland    (0.470, 0.431, 0.384, 0.000)
		colorRock      (0.508, 0.469, 0.414, 0.000)
		colorSnow      (0.554, 0.499, 0.436, 1.000)
		BumpHeight      5.30379
		BumpOffset      1.06076
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.612222
		GasToDust   0.25
		Particles   2216
		GasBright   0.134102
		DustBright  0.32662
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.94287
		Period          17.3853
		Eccentricity    0.976954
		Inclination     78.1716
		AscendingNode   -103.996
		ArgOfPericenter 47.194
		MeanAnomaly     134.12
	}
}

Comet	"Foerost System C93"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            5.68669e-007
	Radius          133.954
	InertiaMoment   0.39932

	Oblateness      0.0550827

	RotationPeriod  27.039
	Obliquity       46.6013
	EqAscendNode    108.995

	AbsMagn         9.39785
	SlopeParam      5.70053
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.728 0.724 0.723)

	Surface
	{
		SurfStyle       0.733098
		OceanStyle      0.667227
		Randomize      (-0.016, -0.706, -0.547)
		colorDistMagn   0.542843
		colorDistFreq   3.94214
		detailScale     3657.83
		colorConversion true
		snowLevel       2
		tropicLatitude  0.889367
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.303067
		terraceProb     0.589395
		erosion         0
		montesMagn      0.399478
		montesFreq      4.65532
		montesSpiky     0.827581
		montesFraction  0.558388
		dunesFraction   0
		hillsMagn       0
		hillsFreq       37.8464
		hillsFraction   0.678172
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231243
		craterFreq      0.457273
		craterDensity   1.03052
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.439459
		volcanoTemp     1320.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.284, 0.246, 0.202, 0.000)
		colorShelf     (0.291, 0.254, 0.231, 0.000)
		colorBeach     (0.342, 0.297, 0.275, 0.000)
		colorDesert    (0.371, 0.319, 0.268, 0.000)
		colorLowland   (0.408, 0.340, 0.304, 0.000)
		colorUpland    (0.451, 0.413, 0.369, 0.000)
		colorRock      (0.488, 0.449, 0.398, 0.000)
		colorSnow      (0.531, 0.478, 0.419, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.330931
		DustBright  0.614277
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.31702
		Period          19.9177
		Eccentricity    0.962814
		Inclination     -28.8044
		AscendingNode   -114.444
		ArgOfPericenter 135.128
		MeanAnomaly     49.3933
	}
}

Comet	"Foerost System C94"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            1.75097e-014
	Radius          0.365034
	InertiaMoment   0.398

	Oblateness      0.0426274

	RotationPeriod  24.8563
	Obliquity       359.807
	EqAscendNode    93.5726

	AbsMagn         5.8895
	SlopeParam      6.73783
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.432 0.430 0.426)

	Surface
	{
		SurfStyle       0.263014
		OceanStyle      0.295971
		Randomize      (0.365, 0.816, -0.206)
		colorDistMagn   0.412607
		colorDistFreq   6.33439e-005
		detailScale     9.96786
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0839089
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.648561
		terraceProb     0.130725
		erosion         0
		montesMagn      0.597884
		montesFreq      2.38031
		montesSpiky     0.977299
		montesFraction  0.335636
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000250408
		hillsFraction   0.936584
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230417
		craterFreq      0.186233
		craterDensity   0.82145
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.561564
		volcanoTemp     1289.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.173, 0.172, 0.170, 0.000)
		colorShelf     (0.184, 0.183, 0.181, 0.000)
		colorBeach     (0.194, 0.193, 0.192, 0.000)
		colorDesert    (0.205, 0.204, 0.202, 0.000)
		colorLowland   (0.216, 0.215, 0.213, 0.000)
		colorUpland    (0.227, 0.226, 0.224, 0.000)
		colorRock      (0.238, 0.236, 0.234, 0.000)
		colorSnow      (0.248, 0.247, 0.245, 1.000)
		BumpHeight      0.32853
		BumpOffset      0.0657061
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.163856
		GasToDust   0.25
		Particles   1310
		GasBright   0.257645
		DustBright  0.372049
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.08097
		Period          25.4322
		Eccentricity    0.978692
		Inclination     4.70003
		AscendingNode   -124.982
		ArgOfPericenter -51.5865
		MeanAnomaly     -145.157
	}
}

Comet	"Foerost System C95"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            1.35425e-010
	Radius          8.27278
	InertiaMoment   0.399751

	Oblateness      0.0782184

	RotationPeriod  22.5849
	Obliquity       313.013
	EqAscendNode    78.15

	AbsMagn         14.722
	SlopeParam      2.2087
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.800 0.717 0.676)

	Surface
	{
		SurfStyle       0.39028
		OceanStyle      0.425899
		Randomize      (0.377, -0.760, -0.958)
		colorDistMagn   0.441064
		colorDistFreq   0.0330238
		detailScale     225.902
		colorConversion true
		snowLevel       2
		tropicLatitude  0.764763
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.466013
		terraceProb     0.190225
		erosion         0
		montesMagn      0.440275
		montesFreq      3.12263
		montesSpiky     0.859065
		montesFraction  0.501239
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.168142
		hillsFraction   0.593578
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240935
		craterFreq      0.23311
		craterDensity   0.885728
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49257
		volcanoTemp     1282.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.287, 0.271, 0.000)
		colorShelf     (0.340, 0.305, 0.287, 0.000)
		colorBeach     (0.360, 0.322, 0.304, 0.000)
		colorDesert    (0.380, 0.340, 0.321, 0.000)
		colorLowland   (0.400, 0.358, 0.338, 0.000)
		colorUpland    (0.420, 0.376, 0.355, 0.000)
		colorRock      (0.440, 0.394, 0.372, 0.000)
		colorSnow      (0.460, 0.412, 0.389, 1.000)
		BumpHeight      7.4455
		BumpOffset      1.4891
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.645048
		GasToDust   0.25
		Particles   2282
		GasBright   0.147101
		DustBright  0.16708
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.85719
		Period          5.62016
		Eccentricity    0.894687
		Inclination     163.634
		AscendingNode   -87.1601
		ArgOfPericenter -107.079
		MeanAnomaly     -132.562
	}
}

Comet	"Foerost System C96"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            4.16984e-018
	Radius          0.0226112
	InertiaMoment   0.398601

	Oblateness      0.0645123

	RotationPeriod  20.2075
	Obliquity       266.218
	EqAscendNode    62.7274

	AbsMagn         9.17809
	SlopeParam      2.93561
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.760 0.759 0.758)

	Surface
	{
		SurfStyle       0.213867
		OceanStyle      0.036164
		Randomize      (-0.908, -0.556, 0.436)
		colorDistMagn   0.877397
		colorDistFreq   4.50925e-007
		detailScale     0.617436
		colorConversion true
		snowLevel       2
		tropicLatitude  0.631451
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.388467
		terraceProb     0.169862
		erosion         0
		montesMagn      0.465981
		montesFreq      3.1542
		montesSpiky     0.697538
		montesFraction  0.840387
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.83551e-007
		hillsFraction   0.742998
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.271561
		craterFreq      0.232374
		craterDensity   0.827362
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.519103
		volcanoTemp     1629.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.304, 0.304, 0.303, 0.000)
		colorShelf     (0.323, 0.323, 0.322, 0.000)
		colorBeach     (0.342, 0.342, 0.341, 0.000)
		colorDesert    (0.361, 0.361, 0.360, 0.000)
		colorLowland   (0.380, 0.380, 0.379, 0.000)
		colorUpland    (0.399, 0.399, 0.398, 0.000)
		colorRock      (0.418, 0.418, 0.417, 0.000)
		colorSnow      (0.437, 0.437, 0.436, 1.000)
		BumpHeight      0.0203501
		BumpOffset      0.00407001
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0217637
		DustBright  0.776904
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.86485
		Period          10.7676
		Eccentricity    0.937976
		Inclination     -120.599
		AscendingNode   -19.6244
		ArgOfPericenter 19.0503
		MeanAnomaly     -18.6334
	}
}

Comet	"Foerost System C97"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            3.22507e-014
	Radius          0.511036
	InertiaMoment   0.396348

	Oblateness      0.124425

	RotationPeriod  17.7022
	Obliquity       219.424
	EqAscendNode    47.3048

	AbsMagn         5.64568
	SlopeParam      3.54168
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.432 0.423 0.420)

	Surface
	{
		SurfStyle       0.458751
		OceanStyle      0.140419
		Randomize      (-0.453, 0.279, 0.168)
		colorDistMagn   0.576394
		colorDistFreq   0.000196504
		detailScale     13.9547
		colorConversion true
		snowLevel       2
		tropicLatitude  0.958289
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.504238
		terraceProb     0.255117
		erosion         0
		montesMagn      0.605078
		montesFreq      2.37473
		montesSpiky     0.979468
		montesFraction  0.742324
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000641258
		hillsFraction   0.59797
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241302
		craterFreq      0.229721
		craterDensity   0.847519
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.438024
		volcanoTemp     1288.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.173, 0.169, 0.168, 0.000)
		colorShelf     (0.184, 0.180, 0.179, 0.000)
		colorBeach     (0.194, 0.191, 0.189, 0.000)
		colorDesert    (0.205, 0.201, 0.200, 0.000)
		colorLowland   (0.216, 0.212, 0.210, 0.000)
		colorUpland    (0.227, 0.222, 0.221, 0.000)
		colorRock      (0.237, 0.233, 0.231, 0.000)
		colorSnow      (0.248, 0.244, 0.242, 1.000)
		BumpHeight      0.459932
		BumpOffset      0.0919864
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.196682
		GasToDust   0.25
		Particles   1377
		GasBright   0.0416939
		DustBright  0.44146
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.9845
		Period          11.4491
		Eccentricity    0.932303
		Inclination     145.937
		AscendingNode   174.627
		ArgOfPericenter -43.8163
		MeanAnomaly     -160.291
	}
}

Comet	"Foerost System C98"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            2.49436e-010
	Radius          8.83717
	InertiaMoment   0.399096

	Oblateness      0.116429

	RotationPeriod  15.0408
	Obliquity       172.63
	EqAscendNode    31.8822

	AbsMagn         13.9867
	SlopeParam      4.10758
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.661 0.657 0.652)

	Surface
	{
		SurfStyle       0.809544
		OceanStyle      0.24189
		Randomize      (0.359, 0.848, -0.665)
		colorDistMagn   0.256943
		colorDistFreq   0.0317622
		detailScale     241.314
		colorConversion true
		snowLevel       2
		tropicLatitude  0.356356
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.611836
		terraceProb     0.293631
		erosion         0
		montesMagn      0.546241
		montesFreq      1.86543
		montesSpiky     0.916638
		montesFraction  0.571987
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.172367
		hillsFraction   0.642308
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238866
		craterFreq      0.210095
		craterDensity   0.869944
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.462189
		volcanoTemp     1199.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.258, 0.223, 0.183, 0.000)
		colorShelf     (0.264, 0.230, 0.209, 0.000)
		colorBeach     (0.311, 0.269, 0.248, 0.000)
		colorDesert    (0.337, 0.289, 0.241, 0.000)
		colorLowland   (0.370, 0.309, 0.274, 0.000)
		colorUpland    (0.410, 0.374, 0.332, 0.000)
		colorRock      (0.443, 0.407, 0.358, 0.000)
		colorSnow      (0.483, 0.434, 0.378, 1.000)
		BumpHeight      7.95345
		BumpOffset      1.59069
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.677874
		GasToDust   0.25
		Particles   2349
		GasBright   0.140637
		DustBright  0.827003
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.53059
		Period          21.4139
		Eccentricity    0.965847
		Inclination     -19.7982
		AscendingNode   -91.6252
		ArgOfPericenter -66.881
		MeanAnomaly     -16.1943
	}
}

Comet	"Foerost System C99"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            7.68033e-018
	Radius          0.0315749
	InertiaMoment   0.397624

	Oblateness      0.249

	RotationPeriod  12.1858
	Obliquity       125.835
	EqAscendNode    16.4596

	AbsMagn         8.96183
	SlopeParam      4.68241
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.582 0.580 0.577)

	Surface
	{
		SurfStyle       0.939874
		OceanStyle      0.498085
		Randomize      (-0.711, 0.486, 0.573)
		colorDistMagn   0.339886
		colorDistFreq   6.04063e-007
		detailScale     0.862205
		colorConversion true
		snowLevel       2
		tropicLatitude  0.673133
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.449052
		terraceProb     0.340225
		erosion         0
		montesMagn      0.691319
		montesFreq      3.09843
		montesSpiky     0.877276
		montesFraction  0.353545
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.89654e-006
		hillsFraction   0.558861
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232361
		craterFreq      0.205852
		craterDensity   0.771822
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.590882
		volcanoTemp     1543.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.198, 0.203, 0.231, 0.050)
		colorShelf     (0.233, 0.238, 0.266, 0.040)
		colorBeach     (0.268, 0.273, 0.300, 0.030)
		colorDesert    (0.303, 0.308, 0.341, 0.020)
		colorLowland   (0.338, 0.342, 0.375, 0.030)
		colorUpland    (0.373, 0.377, 0.410, 0.050)
		colorRock      (0.408, 0.412, 0.456, 0.020)
		colorSnow      (0.408, 0.412, 0.456, 1.000)
		BumpHeight      0.0284174
		BumpOffset      0.00568348
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.133286
		DustBright  0.518842
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.7434
		Period          16.0828
		Eccentricity    0.933181
		Inclination     12.705
		AscendingNode   -19.1849
		ArgOfPericenter 55.1034
		MeanAnomaly     -41.5539
	}
}

Comet	"Foerost System C100"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            5.94019e-014
	Radius          0.547398
	InertiaMoment   0.399541

	Oblateness      0.249

	RotationPeriod  9.08566
	Obliquity       79.0412
	EqAscendNode    1.03705

	AbsMagn         5.39277
	SlopeParam      5.32143
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.529 0.522 0.518)

	Surface
	{
		SurfStyle       0.974972
		OceanStyle      0.0790231
		Randomize      (0.964, 0.150, 0.772)
		colorDistMagn   0.69384
		colorDistFreq   0.000151977
		detailScale     14.9476
		colorConversion true
		snowLevel       2
		tropicLatitude  0.944764
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.667613
		terraceProb     0.240746
		erosion         0
		montesMagn      0.670538
		montesFreq      3.61811
		montesSpiky     0.814306
		montesFraction  0.481962
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000731673
		hillsFraction   0.959578
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242085
		craterFreq      0.246002
		craterDensity   0.964283
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.464089
		volcanoTemp     1585.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.180, 0.183, 0.207, 0.050)
		colorShelf     (0.212, 0.214, 0.238, 0.040)
		colorBeach     (0.243, 0.246, 0.269, 0.030)
		colorDesert    (0.275, 0.277, 0.306, 0.020)
		colorLowland   (0.307, 0.308, 0.337, 0.030)
		colorUpland    (0.339, 0.340, 0.368, 0.050)
		colorRock      (0.370, 0.371, 0.409, 0.020)
		colorSnow      (0.370, 0.371, 0.409, 1.000)
		BumpHeight      0.492658
		BumpOffset      0.0985316
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.229508
		GasToDust   0.25
		Particles   1443
		GasBright   0.0886745
		DustBright  0.247939
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.41765
		Period          20.6182
		Eccentricity    0.966369
		Inclination     163.704
		AscendingNode   -58.1707
		ArgOfPericenter 138.093
		MeanAnomaly     -119
	}
}

Comet	"Foerost System C101"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            4.5943e-010
	Radius          12.3115
	InertiaMoment   0.398323

	Oblateness      0.249

	RotationPeriod  5.6663
	Obliquity       32.2469
	EqAscendNode    345.614

	AbsMagn         13.4115
	SlopeParam      6.1399
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.587 0.584 0.583)

	Surface
	{
		SurfStyle       0.0438182
		OceanStyle      0.802945
		Randomize      (0.896, -0.540, -0.587)
		colorDistMagn   0.638608
		colorDistFreq   0.111702
		detailScale     336.186
		colorConversion true
		snowLevel       2
		tropicLatitude  0.317997
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.563024
		terraceProb     0.103479
		erosion         0
		montesMagn      0.418492
		montesFreq      3.44551
		montesSpiky     0.934469
		montesFraction  0.712546
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.486073
		hillsFraction   0.54843
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.210255
		craterFreq      0.221398
		craterDensity   0.847895
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.580059
		volcanoTemp     1442.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.235, 0.234, 0.233, 0.000)
		colorShelf     (0.250, 0.248, 0.248, 0.000)
		colorBeach     (0.264, 0.263, 0.262, 0.000)
		colorDesert    (0.279, 0.277, 0.277, 0.000)
		colorLowland   (0.294, 0.292, 0.291, 0.000)
		colorUpland    (0.308, 0.307, 0.306, 0.000)
		colorRock      (0.323, 0.321, 0.321, 0.000)
		colorSnow      (0.338, 0.336, 0.335, 1.000)
		BumpHeight      11.0804
		BumpOffset      2.21607
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.7107
		GasToDust   0.25
		Particles   2415
		GasBright   0.264785
		DustBright  0.556315
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.58938
		Period          15.1005
		Eccentricity    0.969025
		Inclination     50.6857
		AscendingNode   -176.987
		ArgOfPericenter -29.1337
		MeanAnomaly     -167.377
	}
}

Comet	"Foerost System C102"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            1.41462e-017
	Radius          0.0339073
	InertiaMoment   0.399963

	Oblateness      0.00121107

	RotationPeriod  147.419
	Obliquity       345.453
	EqAscendNode    330.192

	AbsMagn         8.74835
	SlopeParam      7.75444
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.537 0.532 0.528)

	Surface
	{
		SurfStyle       0.628546
		OceanStyle      0.494142
		Randomize      (0.064, -0.684, -0.783)
		colorDistMagn   0.8597
		colorDistFreq   5.44439e-007
		detailScale     0.925895
		colorConversion true
		snowLevel       2
		tropicLatitude  0.879257
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.509892
		terraceProb     0.165907
		erosion         0
		montesMagn      0.469169
		montesFreq      3.05126
		montesSpiky     0.807464
		montesFraction  0.409929
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.17378e-006
		hillsFraction   0.483219
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232126
		craterFreq      0.217383
		craterDensity   1.06082
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.458037
		volcanoTemp     1489.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.209, 0.181, 0.148, 0.000)
		colorShelf     (0.215, 0.186, 0.169, 0.000)
		colorBeach     (0.252, 0.218, 0.201, 0.000)
		colorDesert    (0.274, 0.234, 0.195, 0.000)
		colorLowland   (0.300, 0.250, 0.222, 0.000)
		colorUpland    (0.333, 0.303, 0.269, 0.000)
		colorRock      (0.359, 0.330, 0.290, 0.000)
		colorSnow      (0.392, 0.351, 0.306, 1.000)
		BumpHeight      0.0305165
		BumpOffset      0.00610331
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.192892
		DustBright  0.312695
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.97326
		Period          24.6278
		Eccentricity    0.951988
		Inclination     62.762
		AscendingNode   -81.4159
		ArgOfPericenter -34.3903
		MeanAnomaly     159.653
	}
}

Comet	"Foerost System C103"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            1.09411e-013
	Radius          0.760941
	InertiaMoment   0.398861

	Oblateness      0.00266507

	RotationPeriod  119.884
	Obliquity       298.658
	EqAscendNode    314.769

	AbsMagn         5.12899
	SlopeParam      2.59053
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.534 0.528 0.524)

	Surface
	{
		SurfStyle       0.572106
		OceanStyle      0.95175
		Randomize      (0.622, 0.398, -0.302)
		colorDistMagn   0.562024
		colorDistFreq   0.000146814
		detailScale     20.7787
		colorConversion true
		snowLevel       2
		tropicLatitude  0.679301
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.625208
		terraceProb     0.79793
		erosion         0
		montesMagn      0.536187
		montesFreq      3.15194
		montesSpiky     0.921328
		montesFraction  0.579816
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00152948
		hillsFraction   0.778066
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241098
		craterFreq      0.224613
		craterDensity   0.869455
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.437863
		volcanoTemp     1586
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.208, 0.179, 0.147, 0.000)
		colorShelf     (0.214, 0.185, 0.168, 0.000)
		colorBeach     (0.251, 0.216, 0.199, 0.000)
		colorDesert    (0.273, 0.232, 0.194, 0.000)
		colorLowland   (0.299, 0.248, 0.220, 0.000)
		colorUpland    (0.331, 0.301, 0.267, 0.000)
		colorRock      (0.358, 0.327, 0.288, 0.000)
		colorSnow      (0.390, 0.348, 0.304, 1.000)
		BumpHeight      0.684846
		BumpOffset      0.136969
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.262334
		GasToDust   0.25
		Particles   1509
		GasBright   0.436194
		DustBright  0.55388
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.82967
		Period          16.642
		Eccentricity    0.95998
		Inclination     47.6079
		AscendingNode   -50.6947
		ArgOfPericenter 87.6101
		MeanAnomaly     103.333
	}
}

Comet	"Foerost System C104"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            8.46214e-010
	Radius          13.2521
	InertiaMoment   0.397138

	Oblateness      0.00215503

	RotationPeriod  109.819
	Obliquity       251.864
	EqAscendNode    299.347

	AbsMagn         12.9306
	SlopeParam      3.24319
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.414 0.408 0.405)

	Surface
	{
		SurfStyle       0.513365
		OceanStyle      0.77738
		Randomize      (0.052, 0.651, 0.822)
		colorDistMagn   0.217214
		colorDistFreq   0.0910161
		detailScale     361.87
		colorConversion true
		snowLevel       2
		tropicLatitude  0.897383
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.434596
		terraceProb     0.303021
		erosion         0
		montesMagn      0.543828
		montesFreq      3.2884
		montesSpiky     0.972268
		montesFraction  0.440595
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.468192
		hillsFraction   0.548246
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246746
		craterFreq      0.248982
		craterDensity   0.91148
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.469546
		volcanoTemp     1537.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.161, 0.139, 0.113, 0.000)
		colorShelf     (0.166, 0.143, 0.130, 0.000)
		colorBeach     (0.194, 0.167, 0.154, 0.000)
		colorDesert    (0.211, 0.180, 0.150, 0.000)
		colorLowland   (0.232, 0.192, 0.170, 0.000)
		colorUpland    (0.257, 0.233, 0.206, 0.000)
		colorRock      (0.277, 0.253, 0.223, 0.000)
		colorSnow      (0.302, 0.269, 0.235, 1.000)
		BumpHeight      11.9269
		BumpOffset      2.38537
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.743526
		GasToDust   0.25
		Particles   2481
		GasBright   0.337018
		DustBright  0.337542
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.79547
		Period          10.3787
		Eccentricity    0.933742
		Inclination     -153.44
		AscendingNode   112.532
		ArgOfPericenter 84.6703
		MeanAnomaly     -174.027
	}
}

Comet	"Foerost System C105"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            2.60555e-017
	Radius          0.0470384
	InertiaMoment   0.399325

	Oblateness      0.0035821

	RotationPeriod  103.076
	Obliquity       205.07
	EqAscendNode    283.924

	AbsMagn         8.53698
	SlopeParam      3.82251
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.762 0.758 0.756)

	Surface
	{
		SurfStyle       0.616752
		OceanStyle      0.70544
		Randomize      (0.187, -0.228, 0.398)
		colorDistMagn   0.280281
		colorDistFreq   1.23546e-006
		detailScale     1.28446
		colorConversion true
		snowLevel       2
		tropicLatitude  0.755237
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.439465
		terraceProb     0.232325
		erosion         0
		montesMagn      0.668053
		montesFreq      3.15293
		montesSpiky     0.839408
		montesFraction  0.31061
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.08154e-006
		hillsFraction   0.5841
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233789
		craterFreq      0.198697
		craterDensity   0.946737
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.534234
		volcanoTemp     1571.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.297, 0.258, 0.212, 0.000)
		colorShelf     (0.305, 0.265, 0.242, 0.000)
		colorBeach     (0.358, 0.311, 0.287, 0.000)
		colorDesert    (0.389, 0.334, 0.280, 0.000)
		colorLowland   (0.427, 0.356, 0.317, 0.000)
		colorUpland    (0.472, 0.432, 0.385, 0.000)
		colorRock      (0.510, 0.470, 0.416, 0.000)
		colorSnow      (0.556, 0.500, 0.438, 1.000)
		BumpHeight      0.0423345
		BumpOffset      0.00846691
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0210607
		DustBright  0.337986
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.14296
		Period          25.899
		Eccentricity    0.968036
		Inclination     -116.493
		AscendingNode   131.522
		ArgOfPericenter 166.877
		MeanAnomaly     -168.316
	}
}

Comet	"Foerost System C106"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            2.01521e-013
	Radius          0.820868
	InertiaMoment   0.398009

	Oblateness      0.00271791

	RotationPeriod  97.8497
	Obliquity       158.275
	EqAscendNode    268.501

	AbsMagn         4.85207
	SlopeParam      4.38701
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.682 0.676 0.674)

	Surface
	{
		SurfStyle       0.781527
		OceanStyle      0.00109048
		Randomize      (-0.036, -0.277, -0.177)
		colorDistMagn   0.251358
		colorDistFreq   0.000412385
		detailScale     22.4152
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997409
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.530363
		terraceProb     0.304313
		erosion         0
		montesMagn      0.412216
		montesFreq      3.11831
		montesSpiky     0.981608
		montesFraction  0.86658
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000996864
		hillsFraction   0.817766
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.289429
		craterFreq      0.155185
		craterDensity   0.820386
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49286
		volcanoTemp     1517.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.266, 0.230, 0.189, 0.000)
		colorShelf     (0.273, 0.237, 0.216, 0.000)
		colorBeach     (0.321, 0.277, 0.256, 0.000)
		colorDesert    (0.348, 0.297, 0.249, 0.000)
		colorLowland   (0.382, 0.318, 0.283, 0.000)
		colorUpland    (0.423, 0.385, 0.344, 0.000)
		colorRock      (0.457, 0.419, 0.371, 0.000)
		colorSnow      (0.498, 0.446, 0.391, 1.000)
		BumpHeight      0.738781
		BumpOffset      0.147756
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.29516
		GasToDust   0.25
		Particles   1576
		GasBright   0.099286
		DustBright  0.744247
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.97519
		Period          17.5995
		Eccentricity    0.944449
		Inclination     103.192
		AscendingNode   67.128
		ArgOfPericenter -62.6539
		MeanAnomaly     149.811
	}
}

Comet	"Foerost System C107"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            1.55862e-009
	Radius          18.3489
	InertiaMoment   0.399756

	Oblateness      0.00432649

	RotationPeriod  93.5033
	Obliquity       111.481
	EqAscendNode    253.079

	AbsMagn         12.5119
	SlopeParam      4.98487
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.470 0.462 0.458)

	Surface
	{
		SurfStyle       0.161098
		OceanStyle      0.549771
		Randomize      (0.505, 0.560, 0.259)
		colorDistMagn   0.398263
		colorDistFreq   0.0326215
		detailScale     501.047
		colorConversion true
		snowLevel       2
		tropicLatitude  0.938465
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.468667
		terraceProb     0.366255
		erosion         0
		montesMagn      0.600235
		montesFreq      2.95568
		montesSpiky     0.970043
		montesFraction  0.606435
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.741762
		hillsFraction   0.648628
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230553
		craterFreq      0.159806
		craterDensity   0.800151
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.543861
		volcanoTemp     1714.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.188, 0.185, 0.183, 0.000)
		colorShelf     (0.200, 0.197, 0.194, 0.000)
		colorBeach     (0.211, 0.208, 0.206, 0.000)
		colorDesert    (0.223, 0.220, 0.217, 0.000)
		colorLowland   (0.235, 0.231, 0.229, 0.000)
		colorUpland    (0.247, 0.243, 0.240, 0.000)
		colorRock      (0.258, 0.254, 0.252, 0.000)
		colorSnow      (0.270, 0.266, 0.263, 1.000)
		BumpHeight      16.514
		BumpOffset      3.3028
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.776352
		GasToDust   0.25
		Particles   2548
		GasBright   0.0933263
		DustBright  0.434694
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.61626
		Period          9.39689
		Eccentricity    0.91267
		Inclination     -35.4459
		AscendingNode   -95.0017
		ArgOfPericenter -55.4323
		MeanAnomaly     -60.8169
	}
}

Comet	"Foerost System C108"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            4.79911e-017
	Radius          0.0508468
	InertiaMoment   0.398608

	Oblateness      0.0032325

	RotationPeriod  89.7347
	Obliquity       64.6868
	EqAscendNode    237.656

	AbsMagn         8.3271
	SlopeParam      5.68948
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.713 0.667 0.638)

	Surface
	{
		SurfStyle       0.0196056
		OceanStyle      0.217249
		Randomize      (0.540, 0.465, 0.435)
		colorDistMagn   0.277922
		colorDistFreq   1.60453e-006
		detailScale     1.38846
		colorConversion true
		snowLevel       2
		tropicLatitude  0.80063
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.520707
		terraceProb     0.359688
		erosion         0
		montesMagn      0.492345
		montesFreq      2.20395
		montesSpiky     0.940027
		montesFraction  0.487463
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.39083e-006
		hillsFraction   0.564788
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239695
		craterFreq      0.218577
		craterDensity   0.961098
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.490879
		volcanoTemp     1545.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.285, 0.267, 0.255, 0.000)
		colorShelf     (0.303, 0.283, 0.271, 0.000)
		colorBeach     (0.321, 0.300, 0.287, 0.000)
		colorDesert    (0.339, 0.317, 0.303, 0.000)
		colorLowland   (0.357, 0.333, 0.319, 0.000)
		colorUpland    (0.374, 0.350, 0.335, 0.000)
		colorRock      (0.392, 0.367, 0.351, 0.000)
		colorSnow      (0.410, 0.383, 0.367, 1.000)
		BumpHeight      0.0457621
		BumpOffset      0.00915243
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0501075
		DustBright  0.162399
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.95991
		Period          17.4981
		Eccentricity    0.967427
		Inclination     124.737
		AscendingNode   61.407
		ArgOfPericenter -123.02
		MeanAnomaly     61.3068
	}
}

Comet	"Foerost System C109"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            3.71176e-013
	Radius          1.13453
	InertiaMoment   0.396375

	Oblateness      0.0049692

	RotationPeriod  86.3754
	Obliquity       17.8925
	EqAscendNode    222.234

	AbsMagn         4.55918
	SlopeParam      6.71827
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.440 0.431 0.428)

	Surface
	{
		SurfStyle       0.719173
		OceanStyle      0.11149
		Randomize      (-0.655, -0.636, 0.732)
		colorDistMagn   0.772008
		colorDistFreq   0.000723947
		detailScale     30.9803
		colorConversion true
		snowLevel       2
		tropicLatitude  0.975434
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.5634
		terraceProb     0.108821
		erosion         0
		montesMagn      0.42845
		montesFreq      3.56714
		montesSpiky     0.891998
		montesFraction  0.415481
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00291939
		hillsFraction   0.79545
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217886
		craterFreq      0.256449
		craterDensity   1.0411
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51714
		volcanoTemp     1904.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.172, 0.147, 0.120, 0.000)
		colorShelf     (0.176, 0.151, 0.137, 0.000)
		colorBeach     (0.207, 0.177, 0.163, 0.000)
		colorDesert    (0.225, 0.190, 0.158, 0.000)
		colorLowland   (0.247, 0.203, 0.180, 0.000)
		colorUpland    (0.273, 0.246, 0.218, 0.000)
		colorRock      (0.295, 0.267, 0.236, 0.000)
		colorSnow      (0.321, 0.285, 0.248, 1.000)
		BumpHeight      1.02108
		BumpOffset      0.204216
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.327985
		GasToDust   0.25
		Particles   1642
		GasBright   0.2055
		DustBright  0.491493
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.1774
		Period          26.1596
		Eccentricity    0.972588
		Inclination     59.3829
		AscendingNode   0.845878
		ArgOfPericenter 110.393
		MeanAnomaly     100.634
	}
}

Comet	"Foerost System C110"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            2.87078e-009
	Radius          19.8726
	InertiaMoment   0.399102

	Oblateness      0.00374878

	RotationPeriod  83.3207
	Obliquity       331.098
	EqAscendNode    206.811

	AbsMagn         12.1377
	SlopeParam      2.19714
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.579 0.573 0.570)

	Surface
	{
		SurfStyle       0.60752
		OceanStyle      0.449858
		Randomize      (-0.836, -0.834, -0.693)
		colorDistMagn   0.375408
		colorDistFreq   0.153635
		detailScale     542.653
		colorConversion true
		snowLevel       2
		tropicLatitude  0.404616
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.471595
		terraceProb     0.319822
		erosion         0
		montesMagn      0.496081
		montesFreq      2.70783
		montesSpiky     0.955735
		montesFraction  0.807367
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.01586
		hillsFraction   0.71284
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248555
		craterFreq      0.218602
		craterDensity   0.727532
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.492122
		volcanoTemp     1626.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.226, 0.195, 0.160, 0.000)
		colorShelf     (0.232, 0.200, 0.182, 0.000)
		colorBeach     (0.272, 0.235, 0.217, 0.000)
		colorDesert    (0.295, 0.252, 0.211, 0.000)
		colorLowland   (0.324, 0.269, 0.239, 0.000)
		colorUpland    (0.359, 0.326, 0.291, 0.000)
		colorRock      (0.388, 0.355, 0.313, 0.000)
		colorSnow      (0.423, 0.378, 0.331, 1.000)
		BumpHeight      17.8853
		BumpOffset      3.57706
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.809177
		GasToDust   0.25
		Particles   2614
		GasBright   0.134999
		DustBright  0.24648
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.61825
		Period          15.2831
		Eccentricity    0.933522
		Inclination     -5.15861
		AscendingNode   168.497
		ArgOfPericenter 88.8902
		MeanAnomaly     120.024
	}
}

Comet	"Foerost System C111"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            8.83933e-017
	Radius          0.0701569
	InertiaMoment   0.397635

	Oblateness      0.00570732

	RotationPeriod  80.5012
	Obliquity       284.304
	EqAscendNode    191.389

	AbsMagn         8.11812
	SlopeParam      2.92671
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.483 0.479 0.477)

	Surface
	{
		SurfStyle       0.20999
		OceanStyle      0.370916
		Randomize      (0.176, -0.568, 0.912)
		colorDistMagn   0.209525
		colorDistFreq   2.92931e-006
		detailScale     1.91575
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998926
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.543184
		terraceProb     0.319532
		erosion         0
		montesMagn      0.604063
		montesFreq      3.25334
		montesSpiky     0.962368
		montesFraction  0.446252
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.19062e-005
		hillsFraction   0.696336
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223698
		craterFreq      0.217438
		craterDensity   0.815164
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.421863
		volcanoTemp     1237.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.193, 0.191, 0.191, 0.000)
		colorShelf     (0.205, 0.203, 0.203, 0.000)
		colorBeach     (0.217, 0.215, 0.214, 0.000)
		colorDesert    (0.230, 0.227, 0.226, 0.000)
		colorLowland   (0.242, 0.239, 0.238, 0.000)
		colorUpland    (0.254, 0.251, 0.250, 0.000)
		colorRock      (0.266, 0.263, 0.262, 0.000)
		colorSnow      (0.278, 0.275, 0.274, 1.000)
		BumpHeight      0.0631412
		BumpOffset      0.0126282
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.357582
		DustBright  0.508384
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.33127
		Period          27.3344
		Eccentricity    0.949364
		Inclination     137.919
		AscendingNode   -69.2855
		ArgOfPericenter 69.8293
		MeanAnomaly     -110.476
	}
}

Comet	"Foerost System C112"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            6.83658e-013
	Radius          1.23096
	InertiaMoment   0.399546

	Oblateness      0.00429069

	RotationPeriod  77.8683
	Obliquity       237.51
	EqAscendNode    175.966

	AbsMagn         4.24656
	SlopeParam      3.53376
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.784 0.782 0.780)

	Surface
	{
		SurfStyle       0.358662
		OceanStyle      0.742234
		Randomize      (0.010, 0.575, -0.527)
		colorDistMagn   0.946777
		colorDistFreq   0.00120631
		detailScale     33.6134
		colorConversion true
		snowLevel       2
		tropicLatitude  0.852827
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.483635
		terraceProb     0.301948
		erosion         0
		montesMagn      0.506975
		montesFreq      2.92037
		montesSpiky     0.908705
		montesFraction  0.367616
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00419614
		hillsFraction   0.571198
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234541
		craterFreq      0.201418
		craterDensity   1.02148
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52572
		volcanoTemp     1555.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.314, 0.313, 0.312, 0.000)
		colorShelf     (0.333, 0.332, 0.332, 0.000)
		colorBeach     (0.353, 0.352, 0.351, 0.000)
		colorDesert    (0.372, 0.372, 0.371, 0.000)
		colorLowland   (0.392, 0.391, 0.390, 0.000)
		colorUpland    (0.412, 0.411, 0.410, 0.000)
		colorRock      (0.431, 0.430, 0.429, 0.000)
		colorSnow      (0.451, 0.450, 0.449, 1.000)
		BumpHeight      1.10786
		BumpOffset      0.221573
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.360811
		GasToDust   0.25
		Particles   1708
		GasBright   0.259799
		DustBright  0.290653
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.41111
		Period          13.9896
		Eccentricity    0.932577
		Inclination     -1.20744
		AscendingNode   146.637
		ArgOfPericenter -106.427
		MeanAnomaly     -63.4048
	}
}

Comet	"Foerost System C113"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            5.28761e-009
	Radius          27.3757
	InertiaMoment   0.398331

	Oblateness      0.00648085

	RotationPeriod  75.3862
	Obliquity       190.715
	EqAscendNode    160.543

	AbsMagn         11.7965
	SlopeParam      4.09986
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.723 0.721 0.718)

	Surface
	{
		SurfStyle       0.643084
		OceanStyle      0.35024
		Randomize      (-0.965, -0.614, -0.966)
		colorDistMagn   0.747042
		colorDistFreq   0.504446
		detailScale     747.539
		colorConversion true
		snowLevel       2
		tropicLatitude  0.286011
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.28496
		terraceProb     0.158941
		erosion         0
		montesMagn      0.654673
		montesFreq      3.58967
		montesSpiky     0.841451
		montesFraction  0.629898
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.75391
		hillsFraction   0.709764
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.287923
		craterFreq      0.155512
		craterDensity   0.855909
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.482207
		volcanoTemp     1795.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.282, 0.245, 0.201, 0.000)
		colorShelf     (0.289, 0.252, 0.230, 0.000)
		colorBeach     (0.340, 0.296, 0.273, 0.000)
		colorDesert    (0.369, 0.317, 0.266, 0.000)
		colorLowland   (0.405, 0.339, 0.302, 0.000)
		colorUpland    (0.448, 0.411, 0.366, 0.000)
		colorRock      (0.484, 0.447, 0.395, 0.000)
		colorSnow      (0.528, 0.476, 0.417, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.842003
		GasToDust   0.25
		Particles   2680
		GasBright   0.00728765
		DustBright  0.227652
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.48089
		Period          21.0625
		Eccentricity    0.965286
		Inclination     -27.2917
		AscendingNode   4.05951
		ArgOfPericenter 48.5687
		MeanAnomaly     -144.087
	}
}

Comet	"Foerost System C114"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            1.6281e-016
	Radius          0.0762489
	InertiaMoment   0.399969

	Oblateness      0.00487628

	RotationPeriod  73.0279
	Obliquity       143.921
	EqAscendNode    145.121

	AbsMagn         7.90946
	SlopeParam      4.67424
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.482 0.443 0.394)

	Surface
	{
		SurfStyle       0.858895
		OceanStyle      0.125516
		Randomize      (0.229, 0.611, -0.153)
		colorDistMagn   0.752247
		colorDistFreq   3.00266e-006
		detailScale     2.0821
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999874
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.672197
		terraceProb     0.225712
		erosion         0
		montesMagn      0.554527
		montesFreq      3.51374
		montesSpiky     0.877259
		montesFraction  0.594665
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.54414e-005
		hillsFraction   0.725888
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237831
		craterFreq      0.208288
		craterDensity   0.889594
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.485555
		volcanoTemp     1857.92
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.164, 0.155, 0.158, 0.050)
		colorShelf     (0.193, 0.182, 0.181, 0.040)
		colorBeach     (0.222, 0.208, 0.205, 0.030)
		colorDesert    (0.250, 0.235, 0.232, 0.020)
		colorLowland   (0.279, 0.261, 0.256, 0.030)
		colorUpland    (0.308, 0.288, 0.280, 0.050)
		colorRock      (0.337, 0.315, 0.311, 0.020)
		colorSnow      (0.337, 0.315, 0.311, 1.000)
		BumpHeight      0.068624
		BumpOffset      0.0137248
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0647948
		DustBright  0.654631
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.87659
		Period          10.8338
		Eccentricity    0.949174
		Inclination     -123.9
		AscendingNode   162.69
		ArgOfPericenter -47.594
		MeanAnomaly     -153.141
	}
}

Comet	"Foerost System C115"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            1.25922e-012
	Radius          1.69316
	InertiaMoment   0.398867

	Oblateness      0.00732009

	RotationPeriod  70.7725
	Obliquity       97.1267
	EqAscendNode    129.698

	AbsMagn         3.90914
	SlopeParam      5.31185
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.715 0.712 0.710)

	Surface
	{
		SurfStyle       0.204268
		OceanStyle      0.621917
		Randomize      (-0.953, 0.813, 0.096)
		colorDistMagn   0.208853
		colorDistFreq   0.0021024
		detailScale     46.2346
		colorConversion true
		snowLevel       2
		tropicLatitude  0.98212
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.352651
		terraceProb     0.144624
		erosion         0
		montesMagn      0.454217
		montesFreq      2.57116
		montesSpiky     0.960651
		montesFraction  0.336831
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00789154
		hillsFraction   0.707506
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248435
		craterFreq      0.244282
		craterDensity   0.830981
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.40588
		volcanoTemp     1793.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.286, 0.285, 0.284, 0.000)
		colorShelf     (0.304, 0.303, 0.302, 0.000)
		colorBeach     (0.322, 0.321, 0.320, 0.000)
		colorDesert    (0.340, 0.338, 0.337, 0.000)
		colorLowland   (0.358, 0.356, 0.355, 0.000)
		colorUpland    (0.375, 0.374, 0.373, 0.000)
		colorRock      (0.393, 0.392, 0.391, 0.000)
		colorSnow      (0.411, 0.410, 0.408, 1.000)
		BumpHeight      1.52384
		BumpOffset      0.304769
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.393637
		GasToDust   0.25
		Particles   1775
		GasBright   0.0602273
		DustBright  0.343685
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.55898
		Period          14.9091
		Eccentricity    0.958542
		Inclination     22.743
		AscendingNode   -142.093
		ArgOfPericenter -20.5252
		MeanAnomaly     16.8294
	}
}

Comet	"Foerost System C116"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            9.73913e-009
	Radius          29.8005
	InertiaMoment   0.397152

	Oblateness      0.00545659

	RotationPeriod  68.6032
	Obliquity       50.3325
	EqAscendNode    114.276

	AbsMagn         11.4809
	SlopeParam      6.12628
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.553 0.551 0.546)

	Surface
	{
		SurfStyle       0.868316
		OceanStyle      0.176484
		Randomize      (0.735, -0.799, -0.865)
		colorDistMagn   0.47471
		colorDistFreq   0.203409
		detailScale     813.752
		colorConversion true
		snowLevel       2
		tropicLatitude  0.442071
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.43335
		terraceProb     0.323614
		erosion         0
		montesMagn      0.461633
		montesFreq      2.72854
		montesSpiky     0.938659
		montesFraction  0.757461
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.84969
		hillsFraction   0.688062
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220947
		craterFreq      0.222928
		craterDensity   1.0083
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.473062
		volcanoTemp     1518.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.188, 0.193, 0.218, 0.050)
		colorShelf     (0.221, 0.226, 0.251, 0.040)
		colorBeach     (0.254, 0.259, 0.284, 0.030)
		colorDesert    (0.288, 0.292, 0.322, 0.020)
		colorLowland   (0.321, 0.325, 0.355, 0.030)
		colorUpland    (0.354, 0.358, 0.388, 0.050)
		colorRock      (0.387, 0.391, 0.431, 0.020)
		colorSnow      (0.387, 0.391, 0.431, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.874829
		GasToDust   0.25
		Particles   2747
		GasBright   0.184925
		DustBright  0.703474
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.23525
		Period          7.42082
		Eccentricity    0.953107
		Inclination     75.5725
		AscendingNode   -171.839
		ArgOfPericenter 175.851
		MeanAnomaly     -1.49864
	}
}

Comet	"Foerost System C117"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            2.99875e-016
	Radius          0.104729
	InertiaMoment   0.399331

	Oblateness      0.00825161

	RotationPeriod  66.5062
	Obliquity       3.53815
	EqAscendNode    98.853

	AbsMagn         7.70055
	SlopeParam      7.71042
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.751 0.750 0.748)

	Surface
	{
		SurfStyle       0.788605
		OceanStyle      0.435591
		Randomize      (-0.618, -0.457, -0.372)
		colorDistMagn   0.493485
		colorDistFreq   8.6425e-006
		detailScale     2.85979
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0583467
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.408724
		terraceProb     0.356696
		erosion         0
		montesMagn      0.434481
		montesFreq      3.12065
		montesSpiky     0.853621
		montesFraction  0.596303
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.20868e-005
		hillsFraction   0.572522
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246314
		craterFreq      0.219139
		craterDensity   0.780672
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.470085
		volcanoTemp     1511.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.293, 0.255, 0.209, 0.000)
		colorShelf     (0.300, 0.262, 0.239, 0.000)
		colorBeach     (0.353, 0.307, 0.284, 0.000)
		colorDesert    (0.383, 0.330, 0.277, 0.000)
		colorLowland   (0.420, 0.352, 0.314, 0.000)
		colorUpland    (0.465, 0.427, 0.381, 0.000)
		colorRock      (0.503, 0.465, 0.411, 0.000)
		colorSnow      (0.548, 0.495, 0.434, 1.000)
		BumpHeight      0.0942558
		BumpOffset      0.0188512
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.153075
		DustBright  0.41981
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.17323
		Period          18.9309
		Eccentricity    0.964368
		Inclination     -0.20769
		AscendingNode   -20.8803
		ArgOfPericenter -147.966
		MeanAnomaly     79.1548
	}
}

Comet	"Foerost System C118"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            2.31932e-012
	Radius          1.84592
	InertiaMoment   0.398017

	Oblateness      0.00618625

	RotationPeriod  64.4703
	Obliquity       316.744
	EqAscendNode    83.4304

	AbsMagn         3.53977
	SlopeParam      2.58062
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.700 0.583 0.475)

	Surface
	{
		SurfStyle       0.135011
		OceanStyle      0.142348
		Randomize      (0.606, -0.190, -0.742)
		colorDistMagn   0.950143
		colorDistFreq   0.00195667
		detailScale     50.406
		colorConversion true
		snowLevel       2
		tropicLatitude  0.512994
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.696385
		terraceProb     0.130544
		erosion         0
		montesMagn      0.431011
		montesFreq      3.22131
		montesSpiky     0.965526
		montesFraction  0.735833
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00693514
		hillsFraction   0.635335
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219909
		craterFreq      0.230648
		craterDensity   0.832066
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.493598
		volcanoTemp     1635.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.280, 0.233, 0.190, 0.000)
		colorShelf     (0.298, 0.248, 0.202, 0.000)
		colorBeach     (0.315, 0.262, 0.214, 0.000)
		colorDesert    (0.333, 0.277, 0.226, 0.000)
		colorLowland   (0.350, 0.292, 0.238, 0.000)
		colorUpland    (0.368, 0.306, 0.249, 0.000)
		colorRock      (0.385, 0.321, 0.261, 0.000)
		colorSnow      (0.403, 0.335, 0.273, 1.000)
		BumpHeight      1.66133
		BumpOffset      0.332266
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.426463
		GasToDust   0.25
		Particles   1841
		GasBright   0.0839665
		DustBright  0.173406
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.75009
		Period          22.9888
		Eccentricity    0.949544
		Inclination     -27.1039
		AscendingNode   -132.289
		ArgOfPericenter 174.158
		MeanAnomaly     90.1996
	}
}

Comet	"Foerost System C119"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            1.79382e-008
	Radius          40.8756
	InertiaMoment   0.399761

	Oblateness      0.00930594

	RotationPeriod  62.4857
	Obliquity       269.95
	EqAscendNode    68.0078

	AbsMagn         11.1856
	SlopeParam      3.23489
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.734 0.731 0.728)

	Surface
	{
		SurfStyle       0.243424
		OceanStyle      0.567706
		Randomize      (0.965, 0.970, 0.649)
		colorDistMagn   0.465022
		colorDistFreq   0.589638
		detailScale     1116.18
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998149
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.560292
		terraceProb     0.169591
		erosion         0
		montesMagn      0.497612
		montesFreq      3.19617
		montesSpiky     0.95973
		montesFraction  0.505494
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.78582
		hillsFraction   0.644717
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221445
		craterFreq      0.221027
		craterDensity   0.900299
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.454939
		volcanoTemp     1454.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.294, 0.292, 0.291, 0.000)
		colorShelf     (0.312, 0.311, 0.309, 0.000)
		colorBeach     (0.330, 0.329, 0.328, 0.000)
		colorDesert    (0.349, 0.347, 0.346, 0.000)
		colorLowland   (0.367, 0.365, 0.364, 0.000)
		colorUpland    (0.385, 0.384, 0.382, 0.000)
		colorRock      (0.404, 0.402, 0.401, 0.000)
		colorSnow      (0.422, 0.420, 0.419, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.907655
		GasToDust   0.25
		Particles   2813
		GasBright   0.285831
		DustBright  0.456027
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.96572
		Period          17.5366
		Eccentricity    0.952788
		Inclination     157.229
		AscendingNode   99.1621
		ArgOfPericenter 84.3102
		MeanAnomaly     -44.9812
	}
}

Comet	"Foerost System C120"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            5.52331e-016
	Radius          0.114341
	InertiaMoment   0.398615

	Oblateness      0.00701619

	RotationPeriod  60.5443
	Obliquity       223.155
	EqAscendNode    52.5853

	AbsMagn         7.49083
	SlopeParam      3.81476
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.569 0.566 0.563)

	Surface
	{
		SurfStyle       0.0569784
		OceanStyle      0.240046
		Randomize      (0.956, 0.310, -0.357)
		colorDistMagn   0.477736
		colorDistFreq   1.01948e-005
		detailScale     3.12227
		colorConversion true
		snowLevel       2
		tropicLatitude  0.996504
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.500307
		terraceProb     0.246169
		erosion         0
		montesMagn      0.684414
		montesFreq      2.69289
		montesSpiky     0.996396
		montesFraction  0.460821
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.59852e-005
		hillsFraction   0.587632
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238683
		craterFreq      0.156539
		craterDensity   0.959579
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.540541
		volcanoTemp     1710.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.227, 0.226, 0.225, 0.000)
		colorShelf     (0.242, 0.240, 0.239, 0.000)
		colorBeach     (0.256, 0.255, 0.253, 0.000)
		colorDesert    (0.270, 0.269, 0.267, 0.000)
		colorLowland   (0.284, 0.283, 0.281, 0.000)
		colorUpland    (0.298, 0.297, 0.295, 0.000)
		colorRock      (0.313, 0.311, 0.309, 0.000)
		colorSnow      (0.327, 0.325, 0.323, 1.000)
		BumpHeight      0.102907
		BumpOffset      0.0205814
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.189441
		DustBright  0.236905
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.14133
		Period          18.7143
		Eccentricity    0.970399
		Inclination     -109.287
		AscendingNode   -59.8242
		ArgOfPericenter 90.5681
		MeanAnomaly     123.259
	}
}

Comet	"Foerost System C121"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            4.27188e-012
	Radius          2.52868
	InertiaMoment   0.396402

	Oblateness      0.0103736

	RotationPeriod  58.6387
	Obliquity       176.361
	EqAscendNode    37.1627

	AbsMagn         3.12784
	SlopeParam      4.37915
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.648 0.525 0.435)

	Surface
	{
		SurfStyle       0.370323
		OceanStyle      0.717629
		Randomize      (0.475, -0.163, 0.601)
		colorDistMagn   0.827428
		colorDistFreq   0.00486588
		detailScale     69.0497
		colorConversion true
		snowLevel       2
		tropicLatitude  0.994696
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.555302
		terraceProb     0.203211
		erosion         0
		montesMagn      0.525255
		montesFreq      2.18712
		montesSpiky     0.881932
		montesFraction  0.624209
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00963228
		hillsFraction   0.756218
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.26159
		craterFreq      0.237844
		craterDensity   1.05263
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.575305
		volcanoTemp     1716.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.259, 0.210, 0.174, 0.000)
		colorShelf     (0.275, 0.223, 0.185, 0.000)
		colorBeach     (0.292, 0.236, 0.196, 0.000)
		colorDesert    (0.308, 0.249, 0.207, 0.000)
		colorLowland   (0.324, 0.263, 0.218, 0.000)
		colorUpland    (0.340, 0.276, 0.228, 0.000)
		colorRock      (0.356, 0.289, 0.239, 0.000)
		colorSnow      (0.373, 0.302, 0.250, 1.000)
		BumpHeight      2.27581
		BumpOffset      0.455162
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.459289
		GasToDust   0.25
		Particles   1907
		GasBright   0.00307983
		DustBright  0.907752
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.5248
		Period          21.3728
		Eccentricity    0.964338
		Inclination     -98.6417
		AscendingNode   -138.633
		ArgOfPericenter 117.396
		MeanAnomaly     -150.312
	}
}

Comet	"Foerost System C122"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            3.304e-008
	Radius          44.6881
	InertiaMoment   0.399108

	Oblateness      0.00798099

	RotationPeriod  56.7624
	Obliquity       129.567
	EqAscendNode    21.7401

	AbsMagn         10.9068
	SlopeParam      4.97617
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.538 0.532 0.530)

	Surface
	{
		SurfStyle       0.379344
		OceanStyle      0.000307176
		Randomize      (0.036, -0.857, -0.392)
		colorDistMagn   0.244789
		colorDistFreq   0.93058
		detailScale     1220.28
		colorConversion true
		snowLevel       2
		tropicLatitude  0.753848
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.288461
		terraceProb     0.158588
		erosion         0
		montesMagn      0.459961
		montesFreq      3.26941
		montesSpiky     0.812376
		montesFraction  0.605522
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.66432
		hillsFraction   0.562182
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240612
		craterFreq      0.216003
		craterDensity   0.693567
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.479727
		volcanoTemp     1529.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.215, 0.213, 0.212, 0.000)
		colorShelf     (0.229, 0.226, 0.225, 0.000)
		colorBeach     (0.242, 0.240, 0.238, 0.000)
		colorDesert    (0.256, 0.253, 0.252, 0.000)
		colorLowland   (0.269, 0.266, 0.265, 0.000)
		colorUpland    (0.282, 0.279, 0.278, 0.000)
		colorRock      (0.296, 0.293, 0.291, 0.000)
		colorSnow      (0.309, 0.306, 0.304, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.940481
		GasToDust   0.25
		Particles   2879
		GasBright   0.0371637
		DustBright  0.558155
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.52559
		Period          14.6998
		Eccentricity    0.951835
		Inclination     81.1971
		AscendingNode   172.076
		ArgOfPericenter 17.0145
		MeanAnomaly     5.75371
	}
}

Comet	"Foerost System C123"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            1.01733e-015
	Radius          0.156441
	InertiaMoment   0.397645

	Oblateness      0.0118182

	RotationPeriod  54.9097
	Obliquity       82.7724
	EqAscendNode    6.31748

	AbsMagn         7.27969
	SlopeParam      5.67848
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.522 0.516 0.510)

	Surface
	{
		SurfStyle       0.404048
		OceanStyle      0.470445
		Randomize      (0.965, -0.908, 0.622)
		colorDistMagn   0.433302
		colorDistFreq   9.08611e-006
		detailScale     4.27187
		colorConversion true
		snowLevel       2
		tropicLatitude  0.976918
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.668136
		terraceProb     0.424306
		erosion         0
		montesMagn      0.572997
		montesFreq      2.87243
		montesSpiky     0.951609
		montesFraction  0.664015
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.23856e-005
		hillsFraction   0.705106
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261353
		craterFreq      0.245888
		craterDensity   0.854378
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.497765
		volcanoTemp     1480.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.209, 0.206, 0.204, 0.000)
		colorShelf     (0.222, 0.219, 0.217, 0.000)
		colorBeach     (0.235, 0.232, 0.230, 0.000)
		colorDesert    (0.248, 0.245, 0.242, 0.000)
		colorLowland   (0.261, 0.258, 0.255, 0.000)
		colorUpland    (0.274, 0.271, 0.268, 0.000)
		colorRock      (0.287, 0.284, 0.281, 0.000)
		colorSnow      (0.300, 0.297, 0.294, 1.000)
		BumpHeight      0.140796
		BumpOffset      0.0281593
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0109231
		GasToDust   0.25
		Particles   1001
		GasBright   0.0339884
		DustBright  0.245817
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.43991
		Period          28.1741
		Eccentricity    0.971209
		Inclination     -154.755
		AscendingNode   -39.3015
		ArgOfPericenter -87.6314
		MeanAnomaly     -78.0436
	}
}

Comet	"Foerost System C124"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            7.86829e-012
	Radius          2.76809
	InertiaMoment   0.399552

	Oblateness      0.00912526

	RotationPeriod  53.0751
	Obliquity       35.9781
	EqAscendNode    350.895

	AbsMagn         2.65653
	SlopeParam      6.69897
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.518 0.514 0.507)

	Surface
	{
		SurfStyle       0.59154
		OceanStyle      0.234707
		Randomize      (-0.214, 0.356, 0.210)
		colorDistMagn   0.788311
		colorDistFreq   0.00556398
		detailScale     75.5873
		colorConversion true
		snowLevel       2
		tropicLatitude  0.987986
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.546649
		terraceProb     0.367427
		erosion         0
		montesMagn      0.532773
		montesFreq      3.07694
		montesSpiky     0.97474
		montesFraction  0.327709
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0188478
		hillsFraction   0.775432
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.280575
		craterFreq      0.23902
		craterDensity   0.845448
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.506865
		volcanoTemp     1485.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.202, 0.175, 0.142, 0.000)
		colorShelf     (0.207, 0.180, 0.162, 0.000)
		colorBeach     (0.243, 0.211, 0.193, 0.000)
		colorDesert    (0.264, 0.226, 0.188, 0.000)
		colorLowland   (0.290, 0.242, 0.213, 0.000)
		colorUpland    (0.321, 0.293, 0.259, 0.000)
		colorRock      (0.347, 0.319, 0.279, 0.000)
		colorSnow      (0.378, 0.339, 0.294, 1.000)
		BumpHeight      2.49128
		BumpOffset      0.498256
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.492115
		GasToDust   0.25
		Particles   1973
		GasBright   0.137968
		DustBright  0.626324
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.92793
		Period          11.1251
		Eccentricity    0.93144
		Inclination     -88.8631
		AscendingNode   -76.3623
		ArgOfPericenter 152.329
		MeanAnomaly     169.171
	}
}

Comet	"Foerost System C125"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            6.08554e-008
	Radius          61.0704
	InertiaMoment   0.398338

	Oblateness      0.0135249

	RotationPeriod  51.2536
	Obliquity       349.184
	EqAscendNode    335.472

	AbsMagn         10.6414
	SlopeParam      2.18553
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.664 0.593 0.531)

	Surface
	{
		SurfStyle       0.0504179
		OceanStyle      0.0819064
		Randomize      (-0.814, -0.604, 1.000)
		colorDistMagn   0.350231
		colorDistFreq   2.74345
		detailScale     1667.63
		colorConversion true
		snowLevel       2
		tropicLatitude  0.907277
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.484424
		terraceProb     0.322504
		erosion         0
		montesMagn      0.442345
		montesFreq      2.3652
		montesSpiky     0.867749
		montesFraction  0.486172
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.47401
		hillsFraction   0.345543
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.292712
		craterFreq      0.207325
		craterDensity   1.00376
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.475359
		volcanoTemp     1232.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.266, 0.237, 0.212, 0.000)
		colorShelf     (0.282, 0.252, 0.226, 0.000)
		colorBeach     (0.299, 0.267, 0.239, 0.000)
		colorDesert    (0.316, 0.282, 0.252, 0.000)
		colorLowland   (0.332, 0.297, 0.266, 0.000)
		colorUpland    (0.349, 0.312, 0.279, 0.000)
		colorRock      (0.365, 0.326, 0.292, 0.000)
		colorSnow      (0.382, 0.341, 0.305, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.973307
		GasToDust   0.25
		Particles   2946
		GasBright   0.10751
		DustBright  0.341268
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.24429
		Period          12.9761
		Eccentricity    0.971818
		Inclination     105.044
		AscendingNode   156.023
		ArgOfPericenter 29.7392
		MeanAnomaly     -122.963
	}
}

Comet	"Foerost System C126"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            1.87379e-015
	Radius          0.171462
	InertiaMoment   0.399974

	Oblateness      0.0105118

	RotationPeriod  49.4404
	Obliquity       302.389
	EqAscendNode    320.05

	AbsMagn         7.06652
	SlopeParam      2.91779
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.522 0.516 0.511)

	Surface
	{
		SurfStyle       0.455726
		OceanStyle      0.669795
		Randomize      (-0.126, -0.840, -0.993)
		colorDistMagn   0.2416
		colorDistFreq   2.24215e-005
		detailScale     4.68207
		colorConversion true
		snowLevel       2
		tropicLatitude  0.928464
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.386618
		terraceProb     0.292727
		erosion         0
		montesMagn      0.524881
		montesFreq      2.36179
		montesSpiky     0.885866
		montesFraction  0.420084
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.76196e-005
		hillsFraction   0.623879
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233758
		craterFreq      0.239988
		craterDensity   0.724303
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.505318
		volcanoTemp     1468.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.209, 0.206, 0.204, 0.000)
		colorShelf     (0.222, 0.219, 0.217, 0.000)
		colorBeach     (0.235, 0.232, 0.230, 0.000)
		colorDesert    (0.248, 0.245, 0.243, 0.000)
		colorLowland   (0.261, 0.258, 0.255, 0.000)
		colorUpland    (0.274, 0.271, 0.268, 0.000)
		colorRock      (0.287, 0.284, 0.281, 0.000)
		colorSnow      (0.300, 0.297, 0.294, 1.000)
		BumpHeight      0.154316
		BumpOffset      0.0308632
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0437491
		GasToDust   0.25
		Particles   1068
		GasBright   0.27868
		DustBright  0.654585
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.38872
		Period          13.8521
		Eccentricity    0.931477
		Inclination     129.509
		AscendingNode   -92.6944
		ArgOfPericenter -97.0574
		MeanAnomaly     -42.4527
	}
}

Comet	"Foerost System C127"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            1.44924e-011
	Radius          3.77864
	InertiaMoment   0.398873

	Oblateness      0.0156082

	RotationPeriod  47.6309
	Obliquity       255.595
	EqAscendNode    304.627

	AbsMagn         2.09648
	SlopeParam      3.52582
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.800 0.703 0.651)

	Surface
	{
		SurfStyle       0.5375
		OceanStyle      0.677957
		Randomize      (0.289, 0.217, -0.692)
		colorDistMagn   0.623842
		colorDistFreq   0.00319102
		detailScale     103.182
		colorConversion true
		snowLevel       2
		tropicLatitude  0.99829
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.486712
		terraceProb     0.287845
		erosion         0
		montesMagn      0.519908
		montesFreq      2.67856
		montesSpiky     0.969714
		montesFraction  0.70436
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0422849
		hillsFraction   0.748376
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23108
		craterFreq      0.239612
		craterDensity   0.892809
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.44623
		volcanoTemp     1430.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.312, 0.239, 0.182, 0.000)
		colorShelf     (0.320, 0.246, 0.208, 0.000)
		colorBeach     (0.376, 0.288, 0.247, 0.000)
		colorDesert    (0.408, 0.309, 0.241, 0.000)
		colorLowland   (0.448, 0.331, 0.274, 0.000)
		colorUpland    (0.496, 0.401, 0.332, 0.000)
		colorRock      (0.536, 0.436, 0.358, 0.000)
		colorSnow      (0.584, 0.464, 0.378, 1.000)
		BumpHeight      3.40078
		BumpOffset      0.680156
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.524941
		GasToDust   0.25
		Particles   2040
		GasBright   0.220941
		DustBright  0.396811
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.63793
		Period          9.51387
		Eccentricity    0.910032
		Inclination     -121.177
		AscendingNode   -85.1321
		ArgOfPericenter -68.5907
		MeanAnomaly     -68.048
	}
}

Comet	"Foerost System C128"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            1.12088e-007
	Radius          67.0127
	InertiaMoment   0.397167

	Oblateness      0.0120858

	RotationPeriod  45.8204
	Obliquity       208.801
	EqAscendNode    289.205

	AbsMagn         10.3872
	SlopeParam      4.09213
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.604 0.600 0.599)

	Surface
	{
		SurfStyle       0.215892
		OceanStyle      0.328489
		Randomize      (-0.087, -0.672, -0.319)
		colorDistMagn   0.70887
		colorDistFreq   2.06438
		detailScale     1829.89
		colorConversion true
		snowLevel       2
		tropicLatitude  0.940283
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.44428
		terraceProb     0.352945
		erosion         0
		montesMagn      0.370784
		montesFreq      3.11369
		montesSpiky     0.966365
		montesFraction  0.430863
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.34749
		hillsFraction   0.649141
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224761
		craterFreq      0.161123
		craterDensity   0.767982
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.561372
		volcanoTemp     1516.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.242, 0.240, 0.239, 0.000)
		colorShelf     (0.257, 0.255, 0.254, 0.000)
		colorBeach     (0.272, 0.270, 0.269, 0.000)
		colorDesert    (0.287, 0.285, 0.284, 0.000)
		colorLowland   (0.302, 0.300, 0.299, 0.000)
		colorUpland    (0.317, 0.315, 0.314, 0.000)
		colorRock      (0.332, 0.330, 0.329, 0.000)
		colorSnow      (0.347, 0.345, 0.344, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.125942
		DustBright  0.176296
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.56144
		Period          14.9245
		Eccentricity    0.931064
		Inclination     -62.4407
		AscendingNode   98.7593
		ArgOfPericenter -113.91
		MeanAnomaly     -90.8878
	}
}

Comet	"Foerost System C129"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            3.45127e-015
	Radius          0.23381
	InertiaMoment   0.399337

	Oblateness      0.0182236

	RotationPeriod  44.0044
	Obliquity       162.007
	EqAscendNode    273.782

	AbsMagn         6.85067
	SlopeParam      4.66608
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.572 0.567 0.559)

	Surface
	{
		SurfStyle       0.32666
		OceanStyle      0.462196
		Randomize      (-0.664, -0.206, -0.549)
		colorDistMagn   0.882617
		colorDistFreq   2.99601e-005
		detailScale     6.38457
		colorConversion true
		snowLevel       2
		tropicLatitude  0.921024
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.390205
		terraceProb     0.612417
		erosion         0
		montesMagn      0.569895
		montesFreq      2.46276
		montesSpiky     0.844497
		montesFraction  0.499333
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000138579
		hillsFraction   0.628977
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242476
		craterFreq      0.212428
		craterDensity   0.867741
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.510668
		volcanoTemp     1063.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.229, 0.227, 0.224, 0.000)
		colorShelf     (0.243, 0.241, 0.237, 0.000)
		colorBeach     (0.257, 0.255, 0.251, 0.000)
		colorDesert    (0.272, 0.269, 0.265, 0.000)
		colorLowland   (0.286, 0.283, 0.279, 0.000)
		colorUpland    (0.300, 0.298, 0.293, 0.000)
		colorRock      (0.314, 0.312, 0.307, 0.000)
		colorSnow      (0.329, 0.326, 0.321, 1.000)
		BumpHeight      0.210429
		BumpOffset      0.0420858
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0765749
		GasToDust   0.25
		Particles   1134
		GasBright   0.374279
		DustBright  0.412446
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.60234
		Period          15.1824
		Eccentricity    0.963583
		Inclination     107.9
		AscendingNode   -109.306
		ArgOfPericenter -94.8773
		MeanAnomaly     -86.5776
	}
}

Comet	"Foerost System C130"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            2.66931e-011
	Radius          4.15092
	InertiaMoment   0.398026

	Oblateness      0.0142804

	RotationPeriod  42.1781
	Obliquity       115.212
	EqAscendNode    258.359

	AbsMagn         1.38856
	SlopeParam      5.3023
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.731 0.728 0.725)

	Surface
	{
		SurfStyle       0.0692999
		OceanStyle      0.657884
		Randomize      (0.709, -0.880, -0.785)
		colorDistMagn   0.657872
		colorDistFreq   0.00643245
		detailScale     113.348
		colorConversion true
		snowLevel       2
		tropicLatitude  0.889793
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.656046
		terraceProb     0.489742
		erosion         0
		montesMagn      0.463077
		montesFreq      3.60291
		montesSpiky     0.815977
		montesFraction  0.263189
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0445231
		hillsFraction   0.659807
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240097
		craterFreq      0.225866
		craterDensity   0.917047
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.508319
		volcanoTemp     1502.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.292, 0.291, 0.290, 0.000)
		colorShelf     (0.311, 0.309, 0.308, 0.000)
		colorBeach     (0.329, 0.328, 0.326, 0.000)
		colorDesert    (0.347, 0.346, 0.344, 0.000)
		colorLowland   (0.365, 0.364, 0.363, 0.000)
		colorUpland    (0.384, 0.382, 0.381, 0.000)
		colorRock      (0.402, 0.400, 0.399, 0.000)
		colorSnow      (0.420, 0.419, 0.417, 1.000)
		BumpHeight      3.73583
		BumpOffset      0.747166
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.557767
		GasToDust   0.25
		Particles   2106
		GasBright   0.0163928
		DustBright  0.454818
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.75463
		Period          16.1553
		Eccentricity    0.94332
		Inclination     21.3783
		AscendingNode   -79.5709
		ArgOfPericenter -4.48738
		MeanAnomaly     10.4273
	}
}

Comet	"Foerost System C131"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            2.06452e-007
	Radius          91.2874
	InertiaMoment   0.399767

	Oblateness      0.0216136

	RotationPeriod  40.3368
	Obliquity       68.418
	EqAscendNode    242.937

	AbsMagn         10.1423
	SlopeParam      6.11275
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.569 0.418 0.338)

	Surface
	{
		SurfStyle       0.455272
		OceanStyle      0.252217
		Randomize      (-0.047, 0.301, 0.030)
		colorDistMagn   0.597818
		colorDistFreq   3.53355
		detailScale     2492.76
		colorConversion true
		snowLevel       2
		tropicLatitude  0.967995
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.300598
		terraceProb     0.201683
		erosion         0
		montesMagn      0.597234
		montesFreq      2.62977
		montesSpiky     0.806851
		montesFraction  0.644774
		dunesFraction   0
		hillsMagn       0
		hillsFreq       20.2889
		hillsFraction   0.572436
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256383
		craterFreq      0.2872
		craterDensity   0.844452
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.512227
		volcanoTemp     1907.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.228, 0.167, 0.135, 0.000)
		colorShelf     (0.242, 0.178, 0.144, 0.000)
		colorBeach     (0.256, 0.188, 0.152, 0.000)
		colorDesert    (0.270, 0.198, 0.160, 0.000)
		colorLowland   (0.285, 0.209, 0.169, 0.000)
		colorUpland    (0.299, 0.219, 0.177, 0.000)
		colorRock      (0.313, 0.230, 0.186, 0.000)
		colorSnow      (0.327, 0.240, 0.194, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0896768
		DustBright  0.866021
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.48678
		Period          8.70803
		Eccentricity    0.937212
		Inclination     -139.34
		AscendingNode   -87.3451
		ArgOfPericenter 131.418
		MeanAnomaly     88.2604
	}
}

Comet	"Foerost System C132"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            6.35682e-015
	Radius          0.257118
	InertiaMoment   0.398621

	Oblateness      0.0171652

	RotationPeriod  38.4751
	Obliquity       21.6237
	EqAscendNode    227.514

	AbsMagn         6.63142
	SlopeParam      7.66813
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.596 0.590 0.585)

	Surface
	{
		SurfStyle       0.490731
		OceanStyle      0.016882
		Randomize      (0.750, 0.588, 0.770)
		colorDistMagn   0.367554
		colorDistFreq   4.58678e-005
		detailScale     7.02103
		colorConversion true
		snowLevel       2
		tropicLatitude  0.738777
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.467815
		terraceProb     0.46744
		erosion         0
		montesMagn      0.551097
		montesFreq      3.06259
		montesSpiky     0.915989
		montesFraction  0.762894
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000172202
		hillsFraction   0.66914
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.265107
		craterFreq      0.227739
		craterDensity   0.941406
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49595
		volcanoTemp     1334.92
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.238, 0.236, 0.234, 0.000)
		colorShelf     (0.253, 0.251, 0.249, 0.000)
		colorBeach     (0.268, 0.265, 0.263, 0.000)
		colorDesert    (0.283, 0.280, 0.278, 0.000)
		colorLowland   (0.298, 0.295, 0.293, 0.000)
		colorUpland    (0.313, 0.310, 0.307, 0.000)
		colorRock      (0.328, 0.324, 0.322, 0.000)
		colorSnow      (0.343, 0.339, 0.336, 1.000)
		BumpHeight      0.231406
		BumpOffset      0.0462812
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.109401
		GasToDust   0.25
		Particles   1200
		GasBright   0.0978708
		DustBright  0.542313
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.60097
		Period          15.1737
		Eccentricity    0.963079
		Inclination     26.9821
		AscendingNode   -22.4886
		ArgOfPericenter 9.66024
		MeanAnomaly     43.0272
	}
}

Comet	"Foerost System C133"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            4.91654e-011
	Radius          5.64908
	InertiaMoment   0.396428

	Oblateness      0.0258158

	RotationPeriod  36.5876
	Obliquity       334.829
	EqAscendNode    212.092

	AbsMagn         0.378842
	SlopeParam      2.57068
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.644 0.641 0.637)

	Surface
	{
		SurfStyle       0.753416
		OceanStyle      0.68235
		Randomize      (0.730, 0.773, 0.993)
		colorDistMagn   0.191163
		colorDistFreq   0.0152131
		detailScale     154.258
		colorConversion true
		snowLevel       2
		tropicLatitude  0.992537
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.323105
		terraceProb     0.156266
		erosion         0
		montesMagn      0.363883
		montesFreq      3.47437
		montesSpiky     0.843285
		montesFraction  0.870116
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0774587
		hillsFraction   0.564435
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.197264
		craterFreq      0.197337
		craterDensity   0.906802
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.546128
		volcanoTemp     1478.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.251, 0.218, 0.178, 0.000)
		colorShelf     (0.258, 0.224, 0.204, 0.000)
		colorBeach     (0.303, 0.263, 0.242, 0.000)
		colorDesert    (0.329, 0.282, 0.236, 0.000)
		colorLowland   (0.361, 0.301, 0.267, 0.000)
		colorUpland    (0.400, 0.365, 0.325, 0.000)
		colorRock      (0.432, 0.397, 0.350, 0.000)
		colorSnow      (0.470, 0.423, 0.369, 1.000)
		BumpHeight      5.08417
		BumpOffset      1.01683
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.590593
		GasToDust   0.25
		Particles   2172
		GasBright   0.0688057
		DustBright  0.255865
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.98185
		Period          24.6916
		Eccentricity    0.965847
		Inclination     118.892
		AscendingNode   -32.132
		ArgOfPericenter 133.084
		MeanAnomaly     126.259
	}
}

Comet	"Foerost System C134"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            3.80259e-007
	Radius          100.489
	InertiaMoment   0.399114

	Oblateness      0.0211382

	RotationPeriod  34.6682
	Obliquity       288.035
	EqAscendNode    196.669

	AbsMagn         9.90511
	SlopeParam      3.22659
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.755 0.751 0.750)

	Surface
	{
		SurfStyle       0.547832
		OceanStyle      0.759108
		Randomize      (-0.799, 0.283, 0.227)
		colorDistMagn   0.944416
		colorDistFreq   2.12465
		detailScale     2744.02
		colorConversion true
		snowLevel       2
		tropicLatitude  0.883569
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.435666
		terraceProb     0.387707
		erosion         0
		montesMagn      0.323085
		montesFreq      3.61163
		montesSpiky     0.947738
		montesFraction  0.632555
		dunesFraction   0
		hillsMagn       0
		hillsFreq       30.3263
		hillsFraction   0.650485
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.269271
		craterFreq      0.422467
		craterDensity   0.879257
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.42788
		volcanoTemp     1890.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.294, 0.255, 0.210, 0.000)
		colorShelf     (0.302, 0.263, 0.240, 0.000)
		colorBeach     (0.355, 0.308, 0.285, 0.000)
		colorDesert    (0.385, 0.330, 0.277, 0.000)
		colorLowland   (0.423, 0.353, 0.315, 0.000)
		colorUpland    (0.468, 0.428, 0.382, 0.000)
		colorRock      (0.506, 0.466, 0.412, 0.000)
		colorSnow      (0.551, 0.496, 0.435, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.219257
		DustBright  0.5899
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.6126
		Period          15.2473
		Eccentricity    0.958533
		Inclination     -162.111
		AscendingNode   -53.5159
		ArgOfPericenter -137.604
		MeanAnomaly     -137.439
	}
}

Comet	"Foerost System C135"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            1.17085e-014
	Radius          0.349594
	InertiaMoment   0.397656

	Oblateness      0.0322928

	RotationPeriod  32.7101
	Obliquity       241.241
	EqAscendNode    181.246

	AbsMagn         6.40797
	SlopeParam      3.80701
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.853 0.776 0.728)

	Surface
	{
		SurfStyle       0.705173
		OceanStyle      0.778483
		Randomize      (-0.356, -0.431, -0.300)
		colorDistMagn   0.318348
		colorDistFreq   4.3884e-005
		detailScale     9.54624
		colorConversion true
		snowLevel       2
		tropicLatitude  0.664653
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.489279
		terraceProb     0.266395
		erosion         0
		montesMagn      0.554563
		montesFreq      2.36341
		montesSpiky     0.869573
		montesFraction  0.867416
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000326815
		hillsFraction   0.923281
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240065
		craterFreq      0.214989
		craterDensity   0.912758
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.513306
		volcanoTemp     1418.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.333, 0.264, 0.204, 0.000)
		colorShelf     (0.341, 0.272, 0.233, 0.000)
		colorBeach     (0.401, 0.318, 0.277, 0.000)
		colorDesert    (0.435, 0.341, 0.269, 0.000)
		colorLowland   (0.478, 0.365, 0.306, 0.000)
		colorUpland    (0.529, 0.442, 0.371, 0.000)
		colorRock      (0.571, 0.481, 0.400, 0.000)
		colorSnow      (0.622, 0.512, 0.422, 1.000)
		BumpHeight      0.314634
		BumpOffset      0.0629269
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.142227
		GasToDust   0.25
		Particles   1267
		GasBright   0.16291
		DustBright  0.330734
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.93205
		Period          17.3138
		Eccentricity    0.951832
		Inclination     -153.386
		AscendingNode   -143.823
		ArgOfPericenter 47.108
		MeanAnomaly     155.582
	}
}

Comet	"Foerost System C136"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            9.05566e-011
	Radius          6.22452
	InertiaMoment   0.399557

	Oblateness      0.0269361

	RotationPeriod  30.7057
	Obliquity       194.447
	EqAscendNode    165.824

	AbsMagn         -1.71741
	SlopeParam      4.3713
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.579 0.574 0.572)

	Surface
	{
		SurfStyle       0.495285
		OceanStyle      0.588978
		Randomize      (-0.822, 0.576, -0.711)
		colorDistMagn   0.761488
		colorDistFreq   0.029365
		detailScale     169.971
		colorConversion true
		snowLevel       2
		tropicLatitude  0.632404
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.368984
		terraceProb     0.486164
		erosion         0
		montesMagn      0.640301
		montesFreq      3.16264
		montesSpiky     0.913497
		montesFraction  0.159736
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.111697
		hillsFraction   0.680271
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251641
		craterFreq      0.269759
		craterDensity   0.937685
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.565062
		volcanoTemp     1631.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.232, 0.230, 0.229, 0.000)
		colorShelf     (0.246, 0.244, 0.243, 0.000)
		colorBeach     (0.261, 0.258, 0.257, 0.000)
		colorDesert    (0.275, 0.273, 0.271, 0.000)
		colorLowland   (0.290, 0.287, 0.286, 0.000)
		colorUpland    (0.304, 0.301, 0.300, 0.000)
		colorRock      (0.318, 0.316, 0.314, 0.000)
		colorSnow      (0.333, 0.330, 0.329, 1.000)
		BumpHeight      5.60206
		BumpOffset      1.12041
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.623419
		GasToDust   0.25
		Particles   2239
		GasBright   0.380552
		DustBright  0.597579
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.71236
		Period          22.7154
		Eccentricity    0.979922
		Inclination     -24.8029
		AscendingNode   176.123
		ArgOfPericenter -63.8012
		MeanAnomaly     -29.5695
	}
}

Comet	"Foerost System C137"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            7.0039e-007
	Radius          136.511
	InertiaMoment   0.398346

	Oblateness      0.0420175

	RotationPeriod  28.6461
	Obliquity       147.652
	EqAscendNode    150.401

	AbsMagn         9.67449
	SlopeParam      4.96749
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.698 0.654 0.629)

	Surface
	{
		SurfStyle       0.323796
		OceanStyle      0.892886
		Randomize      (-0.887, 0.774, -0.614)
		colorDistMagn   0.786602
		colorDistFreq   3.83522
		detailScale     3727.65
		colorConversion true
		snowLevel       2
		tropicLatitude  0.518721
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.625487
		terraceProb     0.158198
		erosion         0
		montesMagn      0.380856
		montesFreq      2.05595
		montesSpiky     0.947269
		montesFraction  0.708996
		dunesFraction   0
		hillsMagn       0
		hillsFreq       27.3129
		hillsFraction   0.697585
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236399
		craterFreq      0.535434
		craterDensity   0.751119
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.436466
		volcanoTemp     1334.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.279, 0.262, 0.252, 0.000)
		colorShelf     (0.296, 0.278, 0.267, 0.000)
		colorBeach     (0.314, 0.294, 0.283, 0.000)
		colorDesert    (0.331, 0.311, 0.299, 0.000)
		colorLowland   (0.349, 0.327, 0.315, 0.000)
		colorUpland    (0.366, 0.343, 0.330, 0.000)
		colorRock      (0.384, 0.360, 0.346, 0.000)
		colorSnow      (0.401, 0.376, 0.362, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.296922
		DustBright  0.365695
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.69825
		Period          9.84207
		Eccentricity    0.970734
		Inclination     -178.6
		AscendingNode   37.417
		ArgOfPericenter 119.135
		MeanAnomaly     -49.3432
	}
}

Comet	"Foerost System C138"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            2.15655e-014
	Radius          0.385559
	InertiaMoment   0.399979

	Oblateness      0.0360906

	RotationPeriod  26.5211
	Obliquity       100.858
	EqAscendNode    134.979

	AbsMagn         6.17944
	SlopeParam      5.66753
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.650 0.645 0.640)

	Surface
	{
		SurfStyle       0.249001
		OceanStyle      0.443958
		Randomize      (-0.467, 0.268, -0.507)
		colorDistMagn   0.797235
		colorDistFreq   1.37859e-005
		detailScale     10.5283
		colorConversion true
		snowLevel       2
		tropicLatitude  0.890478
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.673729
		terraceProb     0.119312
		erosion         0
		montesMagn      0.503393
		montesFreq      2.78173
		montesSpiky     0.904658
		montesFraction  0.512116
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000327071
		hillsFraction   0.445525
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226016
		craterFreq      0.207375
		craterDensity   1.09559
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.537713
		volcanoTemp     1621.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.260, 0.258, 0.256, 0.000)
		colorShelf     (0.276, 0.274, 0.272, 0.000)
		colorBeach     (0.293, 0.290, 0.288, 0.000)
		colorDesert    (0.309, 0.306, 0.304, 0.000)
		colorLowland   (0.325, 0.323, 0.320, 0.000)
		colorUpland    (0.341, 0.339, 0.336, 0.000)
		colorRock      (0.358, 0.355, 0.352, 0.000)
		colorSnow      (0.374, 0.371, 0.368, 1.000)
		BumpHeight      0.347003
		BumpOffset      0.0694007
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.175053
		GasToDust   0.25
		Particles   1333
		GasBright   0.00248202
		DustBright  0.344622
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.34584
		Period          20.1175
		Eccentricity    0.946911
		Inclination     40.1644
		AscendingNode   161.015
		ArgOfPericenter -62.134
		MeanAnomaly     -142.065
	}
}

Comet	"Foerost System C139"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            1.66794e-010
	Radius          8.4486
	InertiaMoment   0.398879

	Oblateness      0.0581534

	RotationPeriod  24.3184
	Obliquity       54.0636
	EqAscendNode    119.556

	AbsMagn         16.1496
	SlopeParam      6.67991
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.592 0.590 0.586)

	Surface
	{
		SurfStyle       0.391458
		OceanStyle      0.245739
		Randomize      (-0.772, 0.824, -0.293)
		colorDistMagn   0.883209
		colorDistFreq   0.0400632
		detailScale     230.703
		colorConversion true
		snowLevel       2
		tropicLatitude  0.839356
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.646371
		terraceProb     0.666907
		erosion         0
		montesMagn      0.434001
		montesFreq      2.88523
		montesSpiky     0.98884
		montesFraction  0.393117
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.152695
		hillsFraction   0.527272
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.276969
		craterFreq      0.248804
		craterDensity   1.029
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.518971
		volcanoTemp     1456.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.237, 0.236, 0.234, 0.000)
		colorShelf     (0.252, 0.251, 0.249, 0.000)
		colorBeach     (0.267, 0.265, 0.264, 0.000)
		colorDesert    (0.281, 0.280, 0.278, 0.000)
		colorLowland   (0.296, 0.295, 0.293, 0.000)
		colorUpland    (0.311, 0.310, 0.307, 0.000)
		colorRock      (0.326, 0.324, 0.322, 0.000)
		colorSnow      (0.341, 0.339, 0.337, 1.000)
		BumpHeight      7.60374
		BumpOffset      1.52075
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.656245
		GasToDust   0.25
		Particles   2305
		GasBright   0.0550479
		DustBright  0.776542
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.74356
		Period          16.0839
		Eccentricity    0.93984
		Inclination     -171.79
		AscendingNode   71.1834
		ArgOfPericenter -139.582
		MeanAnomaly     -147.437
	}
}

Comet	"Foerost System C140"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            5.13571e-018
	Radius          0.0238823
	InertiaMoment   0.397181

	Oblateness      0.0516858

	RotationPeriod  22.0233
	Obliquity       7.26932
	EqAscendNode    104.133

	AbsMagn         9.4493
	SlopeParam      2.17385
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.625 0.621 0.619)

	Surface
	{
		SurfStyle       0.881566
		OceanStyle      0.676598
		Randomize      (-0.438, -0.124, 0.276)
		colorDistMagn   0.731598
		colorDistFreq   1.02563e-007
		detailScale     0.652147
		colorConversion true
		snowLevel       2
		tropicLatitude  0.917024
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.493322
		terraceProb     0.565774
		erosion         0
		montesMagn      0.545996
		montesFreq      3.78921
		montesSpiky     0.994313
		montesFraction  0.569717
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.35188e-006
		hillsFraction   0.45126
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226628
		craterFreq      0.262017
		craterDensity   1.0057
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.513268
		volcanoTemp     1342.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.213, 0.217, 0.247, 0.050)
		colorShelf     (0.250, 0.255, 0.285, 0.040)
		colorBeach     (0.288, 0.292, 0.322, 0.030)
		colorDesert    (0.325, 0.329, 0.365, 0.020)
		colorLowland   (0.363, 0.367, 0.402, 0.030)
		colorUpland    (0.400, 0.404, 0.439, 0.050)
		colorRock      (0.438, 0.441, 0.489, 0.020)
		colorSnow      (0.438, 0.441, 0.489, 1.000)
		BumpHeight      0.0214941
		BumpOffset      0.00429882
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0646341
		DustBright  0.451443
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.19583
		Period          19.0849
		Eccentricity    0.939359
		Inclination     -120.715
		AscendingNode   7.57938
		ArgOfPericenter -43.2827
		MeanAnomaly     -117.093
	}
}

Comet	"Foerost System C141"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            3.9721e-014
	Radius          0.5229
	InertiaMoment   0.399342

	Oblateness      0.0891213

	RotationPeriod  19.6173
	Obliquity       320.475
	EqAscendNode    88.7109

	AbsMagn         5.9448
	SlopeParam      2.90885
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.758 0.757 0.756)

	Surface
	{
		SurfStyle       0.591045
		OceanStyle      0.117921
		Randomize      (-0.445, -0.824, 0.693)
		colorDistMagn   0.276698
		colorDistFreq   0.00015189
		detailScale     14.2787
		colorConversion true
		snowLevel       2
		tropicLatitude  0.517978
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.605295
		terraceProb     0.12497
		erosion         0
		montesMagn      0.491778
		montesFreq      2.95775
		montesSpiky     0.911648
		montesFraction  0.693606
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000753907
		hillsFraction   0.541873
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253984
		craterFreq      0.260979
		craterDensity   0.975626
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.556606
		volcanoTemp     1625.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.296, 0.257, 0.212, 0.000)
		colorShelf     (0.303, 0.265, 0.242, 0.000)
		colorBeach     (0.356, 0.310, 0.287, 0.000)
		colorDesert    (0.387, 0.333, 0.280, 0.000)
		colorLowland   (0.425, 0.356, 0.317, 0.000)
		colorUpland    (0.470, 0.432, 0.385, 0.000)
		colorRock      (0.508, 0.469, 0.416, 0.000)
		colorSnow      (0.554, 0.500, 0.438, 1.000)
		BumpHeight      0.47061
		BumpOffset      0.094122
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.207879
		GasToDust   0.25
		Particles   1399
		GasBright   0.0369611
		DustBright  0.163602
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.94374
		Period          11.2153
		Eccentricity    0.940259
		Inclination     15.7167
		AscendingNode   49.0945
		ArgOfPericenter 107.268
		MeanAnomaly     -178.078
	}
}

Comet	"Foerost System C142"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            3.07214e-010
	Radius          9.33387
	InertiaMoment   0.398034

	Oblateness      0.0860596

	RotationPeriod  17.0773
	Obliquity       273.681
	EqAscendNode    73.2883

	AbsMagn         14.9291
	SlopeParam      3.51788
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.798 0.795 0.794)

	Surface
	{
		SurfStyle       0.609284
		OceanStyle      0.0881839
		Randomize      (-0.603, -0.778, -0.067)
		colorDistMagn   0.556977
		colorDistFreq   0.033636
		detailScale     254.877
		colorConversion true
		snowLevel       2
		tropicLatitude  0.78315
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.366825
		terraceProb     0.131993
		erosion         0
		montesMagn      0.619167
		montesFreq      3.33772
		montesSpiky     0.837565
		montesFraction  0.7028
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.256029
		hillsFraction   0.669859
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218935
		craterFreq      0.238096
		craterDensity   0.803409
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.481805
		volcanoTemp     1519.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.311, 0.270, 0.222, 0.000)
		colorShelf     (0.319, 0.278, 0.254, 0.000)
		colorBeach     (0.375, 0.326, 0.302, 0.000)
		colorDesert    (0.407, 0.350, 0.294, 0.000)
		colorLowland   (0.447, 0.374, 0.333, 0.000)
		colorUpland    (0.495, 0.453, 0.405, 0.000)
		colorRock      (0.535, 0.493, 0.436, 0.000)
		colorSnow      (0.583, 0.525, 0.460, 1.000)
		BumpHeight      8.40048
		BumpOffset      1.6801
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.689071
		GasToDust   0.25
		Particles   2371
		GasBright   0.166694
		DustBright  0.518356
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.18829
		Period          19.0335
		Eccentricity    0.950498
		Inclination     -128.132
		AscendingNode   -147.424
		ArgOfPericenter 105.297
		MeanAnomaly     -161.142
	}
}

Comet	"Foerost System C143"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            9.45934e-018
	Radius          0.0323644
	InertiaMoment   0.399772

	Oblateness      0.165561

	RotationPeriod  14.3732
	Obliquity       226.886
	EqAscendNode    57.8657

	AbsMagn         9.22862
	SlopeParam      4.08441
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.548 0.544 0.540)

	Surface
	{
		SurfStyle       0.742028
		OceanStyle      0.139031
		Randomize      (0.655, -0.151, -0.861)
		colorDistMagn   0.830035
		colorDistFreq   1.37218e-007
		detailScale     0.883763
		colorConversion true
		snowLevel       2
		tropicLatitude  0.415578
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.423822
		terraceProb     0.395119
		erosion         0
		montesMagn      0.393052
		montesFreq      2.71359
		montesSpiky     0.948777
		montesFraction  0.382203
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.97078e-006
		hillsFraction   0.718535
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249869
		craterFreq      0.185718
		craterDensity   0.807024
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.424506
		volcanoTemp     1468.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.214, 0.185, 0.151, 0.000)
		colorShelf     (0.219, 0.190, 0.173, 0.000)
		colorBeach     (0.258, 0.223, 0.205, 0.000)
		colorDesert    (0.280, 0.239, 0.200, 0.000)
		colorLowland   (0.307, 0.256, 0.227, 0.000)
		colorUpland    (0.340, 0.310, 0.276, 0.000)
		colorRock      (0.367, 0.337, 0.297, 0.000)
		colorSnow      (0.400, 0.359, 0.313, 1.000)
		BumpHeight      0.0291279
		BumpOffset      0.00582559
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.111739
		DustBright  0.257797
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.25876
		Period          19.5159
		Eccentricity    0.951939
		Inclination     -64.8644
		AscendingNode   -20.442
		ArgOfPericenter 63.0127
		MeanAnomaly     -135.707
	}
}

Comet	"Foerost System C144"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            7.31611e-014
	Radius          0.578156
	InertiaMoment   0.398628

	Oblateness      0.190986

	RotationPeriod  11.4646
	Obliquity       180.092
	EqAscendNode    42.4431

	AbsMagn         5.70286
	SlopeParam      4.65793
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.529 0.463 0.342)

	Surface
	{
		SurfStyle       0.921802
		OceanStyle      0.214561
		Randomize      (-0.821, -0.301, -0.572)
		colorDistMagn   0.970259
		colorDistFreq   0.000155848
		detailScale     15.7875
		colorConversion true
		snowLevel       2
		tropicLatitude  0.340751
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.767342
		terraceProb     0.361604
		erosion         0
		montesMagn      0.6225
		montesFreq      3.00624
		montesSpiky     0.936927
		montesFraction  0.552552
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000458261
		hillsFraction   0.786837
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225412
		craterFreq      0.240062
		craterDensity   0.905549
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.464138
		volcanoTemp     1758.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.180, 0.162, 0.137, 0.050)
		colorShelf     (0.212, 0.190, 0.157, 0.040)
		colorBeach     (0.243, 0.218, 0.178, 0.030)
		colorDesert    (0.275, 0.246, 0.202, 0.020)
		colorLowland   (0.307, 0.273, 0.222, 0.030)
		colorUpland    (0.339, 0.301, 0.243, 0.050)
		colorRock      (0.370, 0.329, 0.270, 0.020)
		colorSnow      (0.370, 0.329, 0.270, 1.000)
		BumpHeight      0.520341
		BumpOffset      0.104068
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.240705
		GasToDust   0.25
		Particles   1466
		GasBright   0.308663
		DustBright  0.54536
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.41507
		Period          8.33407
		Eccentricity    0.905562
		Inclination     -19.8848
		AscendingNode   114.126
		ArgOfPericenter -177.421
		MeanAnomaly     -23.3871
	}
}

Comet	"Foerost System C145"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            5.65849e-010
	Radius          12.6395
	InertiaMoment   0.396454

	Oblateness      0.249

	RotationPeriod  8.2955
	Obliquity       133.298
	EqAscendNode    27.0205

	AbsMagn         14.139
	SlopeParam      5.29277
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.675 0.673 0.671)

	Surface
	{
		SurfStyle       0.357332
		OceanStyle      0.678083
		Randomize      (0.314, -0.341, 0.413)
		colorDistMagn   0.908768
		colorDistFreq   0.0452433
		detailScale     345.142
		colorConversion true
		snowLevel       2
		tropicLatitude  0.965883
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.472665
		terraceProb     0.207623
		erosion         0
		montesMagn      0.491806
		montesFreq      3.4425
		montesSpiky     0.928644
		montesFraction  0.67699
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.340773
		hillsFraction   0.740645
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237746
		craterFreq      0.257829
		craterDensity   0.769653
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.510598
		volcanoTemp     1449.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.270, 0.269, 0.269, 0.000)
		colorShelf     (0.287, 0.286, 0.285, 0.000)
		colorBeach     (0.304, 0.303, 0.302, 0.000)
		colorDesert    (0.321, 0.320, 0.319, 0.000)
		colorLowland   (0.337, 0.337, 0.336, 0.000)
		colorUpland    (0.354, 0.353, 0.352, 0.000)
		colorRock      (0.371, 0.370, 0.369, 0.000)
		colorSnow      (0.388, 0.387, 0.386, 1.000)
		BumpHeight      11.3755
		BumpOffset      2.27511
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.721897
		GasToDust   0.25
		Particles   2438
		GasBright   0.226426
		DustBright  0.312084
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.3355
		Period          20.0457
		Eccentricity    0.960147
		Inclination     -58.4494
		AscendingNode   5.03735
		ArgOfPericenter 122.447
		MeanAnomaly     28.0562
	}
}

Comet	"Foerost System C146"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            1.74229e-017
	Radius          0.035812
	InertiaMoment   0.399119

	Oblateness      0.249

	RotationPeriod  4.7845
	Obliquity       86.5035
	EqAscendNode    11.5979

	AbsMagn         9.01161
	SlopeParam      6.09931
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.598 0.594 0.592)

	Surface
	{
		SurfStyle       0.100074
		OceanStyle      0.496052
		Randomize      (0.897, -0.883, -0.601)
		colorDistMagn   0.502786
		colorDistFreq   1.03416e-006
		detailScale     0.977906
		colorConversion true
		snowLevel       2
		tropicLatitude  0.832177
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.551317
		terraceProb     0.370966
		erosion         0
		montesMagn      0.399068
		montesFreq      2.56033
		montesSpiky     0.968938
		montesFraction  0.541515
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.71264e-006
		hillsFraction   0.673909
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.215968
		craterFreq      0.177782
		craterDensity   0.957997
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.587752
		volcanoTemp     1872.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.239, 0.238, 0.237, 0.000)
		colorShelf     (0.254, 0.253, 0.251, 0.000)
		colorBeach     (0.269, 0.267, 0.266, 0.000)
		colorDesert    (0.284, 0.282, 0.281, 0.000)
		colorLowland   (0.299, 0.297, 0.296, 0.000)
		colorUpland    (0.314, 0.312, 0.311, 0.000)
		colorRock      (0.329, 0.327, 0.325, 0.000)
		colorSnow      (0.344, 0.342, 0.340, 1.000)
		BumpHeight      0.0322308
		BumpOffset      0.00644616
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.10693
		DustBright  0.116067
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.36992
		Period          20.2849
		Eccentricity    0.940762
		Inclination     81.7007
		AscendingNode   55.2263
		ArgOfPericenter 79.6656
		MeanAnomaly     158.457
	}
}

Comet	"Foerost System C147"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            1.34753e-013
	Radius          0.782355
	InertiaMoment   0.397666

	Oblateness      0.00184022

	RotationPeriod  135.222
	Obliquity       39.7092
	EqAscendNode    356.175

	AbsMagn         5.4522
	SlopeParam      7.62742
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.671 0.610 0.511)

	Surface
	{
		SurfStyle       0.375824
		OceanStyle      0.134362
		Randomize      (0.532, -0.422, -0.110)
		colorDistMagn   0.589111
		colorDistFreq   0.000482842
		detailScale     21.3635
		colorConversion true
		snowLevel       2
		tropicLatitude  0.690525
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.533003
		terraceProb     0.105265
		erosion         0
		montesMagn      0.556766
		montesFreq      2.32546
		montesSpiky     0.933339
		montesFraction  0.541417
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00127828
		hillsFraction   0.732716
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224444
		craterFreq      0.219497
		craterDensity   0.970793
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.511281
		volcanoTemp     1616.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.268, 0.244, 0.204, 0.000)
		colorShelf     (0.285, 0.259, 0.217, 0.000)
		colorBeach     (0.302, 0.275, 0.230, 0.000)
		colorDesert    (0.319, 0.290, 0.243, 0.000)
		colorLowland   (0.336, 0.305, 0.256, 0.000)
		colorUpland    (0.352, 0.320, 0.268, 0.000)
		colorRock      (0.369, 0.336, 0.281, 0.000)
		colorSnow      (0.386, 0.351, 0.294, 1.000)
		BumpHeight      0.704119
		BumpOffset      0.140824
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.273531
		GasToDust   0.25
		Particles   1532
		GasBright   0.0272791
		DustBright  0.680204
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.03886
		Period          11.7633
		Eccentricity    0.958702
		Inclination     -82.2562
		AscendingNode   11.8163
		ArgOfPericenter 38.7855
		MeanAnomaly     -25.1907
	}
}

Comet	"Foerost System C148"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            1.04222e-009
	Radius          13.9962
	InertiaMoment   0.399562

	Oblateness      0.00183459

	RotationPeriod  116.939
	Obliquity       352.915
	EqAscendNode    340.753

	AbsMagn         13.5347
	SlopeParam      2.5607
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.738 0.736 0.735)

	Surface
	{
		SurfStyle       0.439645
		OceanStyle      0.390209
		Randomize      (-0.290, 0.304, 0.751)
		colorDistMagn   0.19469
		colorDistFreq   0.0524138
		detailScale     382.191
		colorConversion true
		snowLevel       2
		tropicLatitude  0.631209
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.651302
		terraceProb     0.781472
		erosion         0
		montesMagn      0.40905
		montesFreq      3.31156
		montesSpiky     0.920039
		montesFraction  0.531942
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.425582
		hillsFraction   0.70742
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232023
		craterFreq      0.210995
		craterDensity   0.844865
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48999
		volcanoTemp     1501.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.295, 0.295, 0.294, 0.000)
		colorShelf     (0.314, 0.313, 0.312, 0.000)
		colorBeach     (0.332, 0.331, 0.331, 0.000)
		colorDesert    (0.351, 0.350, 0.349, 0.000)
		colorLowland   (0.369, 0.368, 0.367, 0.000)
		colorUpland    (0.388, 0.387, 0.386, 0.000)
		colorRock      (0.406, 0.405, 0.404, 0.000)
		colorSnow      (0.425, 0.423, 0.423, 1.000)
		BumpHeight      12.5966
		BumpOffset      2.51932
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.754722
		GasToDust   0.25
		Particles   2504
		GasBright   0.0382575
		DustBright  0.353712
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.72362
		Period          9.9812
		Eccentricity    0.955307
		Inclination     144.847
		AscendingNode   59.7646
		ArgOfPericenter -152.003
		MeanAnomaly     24.7731
	}
}

Comet	"Foerost System C149"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            3.20908e-017
	Radius          0.0484274
	InertiaMoment   0.398353

	Oblateness      0.00288057

	RotationPeriod  107.998
	Obliquity       306.121
	EqAscendNode    325.33

	AbsMagn         8.79755
	SlopeParam      3.21826
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.735 0.689 0.656)

	Surface
	{
		SurfStyle       0.00803188
		OceanStyle      0.505029
		Randomize      (0.692, 0.591, 0.938)
		colorDistMagn   0.60499
		colorDistFreq   1.96335e-006
		detailScale     1.32239
		colorConversion true
		snowLevel       2
		tropicLatitude  0.806151
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.646354
		terraceProb     0.553642
		erosion         0
		montesMagn      0.411168
		montesFreq      2.59564
		montesSpiky     0.810246
		montesFraction  0.539866
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.472e-006
		hillsFraction   0.561286
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249388
		craterFreq      0.23863
		craterDensity   0.749426
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.570253
		volcanoTemp     1584
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.294, 0.276, 0.263, 0.000)
		colorShelf     (0.312, 0.293, 0.279, 0.000)
		colorBeach     (0.331, 0.310, 0.295, 0.000)
		colorDesert    (0.349, 0.327, 0.312, 0.000)
		colorLowland   (0.367, 0.345, 0.328, 0.000)
		colorUpland    (0.386, 0.362, 0.345, 0.000)
		colorRock      (0.404, 0.379, 0.361, 0.000)
		colorSnow      (0.423, 0.396, 0.377, 1.000)
		BumpHeight      0.0435847
		BumpOffset      0.00871693
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.137295
		DustBright  0.73916
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.36145
		Period          13.6853
		Eccentricity    0.922017
		Inclination     0.523169
		AscendingNode   72.2653
		ArgOfPericenter -6.88357
		MeanAnomaly     -77.7449
	}
}

Comet	"Foerost System C150"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            2.48199e-013
	Radius          0.866948
	InertiaMoment   0.399984

	Oblateness      0.0024238

	RotationPeriod  101.713
	Obliquity       259.326
	EqAscendNode    309.908

	AbsMagn         5.19112
	SlopeParam      3.79925
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.529 0.419 0.352)

	Surface
	{
		SurfStyle       0.60665
		OceanStyle      0.420672
		Randomize      (-0.691, -0.068, 0.729)
		colorDistMagn   0.97192
		colorDistFreq   0.000493318
		detailScale     23.6735
		colorConversion true
		snowLevel       2
		tropicLatitude  0.933411
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.427428
		terraceProb     0.200019
		erosion         0
		montesMagn      0.55742
		montesFreq      3.44365
		montesSpiky     0.959271
		montesFraction  0.721784
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00154334
		hillsFraction   0.418312
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213313
		craterFreq      0.225215
		craterDensity   0.761414
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.557855
		volcanoTemp     1515.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.206, 0.143, 0.099, 0.000)
		colorShelf     (0.212, 0.147, 0.113, 0.000)
		colorBeach     (0.249, 0.172, 0.134, 0.000)
		colorDesert    (0.270, 0.185, 0.130, 0.000)
		colorLowland   (0.296, 0.197, 0.148, 0.000)
		colorUpland    (0.328, 0.239, 0.179, 0.000)
		colorRock      (0.355, 0.260, 0.194, 0.000)
		colorSnow      (0.386, 0.277, 0.204, 1.000)
		BumpHeight      0.780253
		BumpOffset      0.156051
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.306357
		GasToDust   0.25
		Particles   1598
		GasBright   0.120992
		DustBright  0.439951
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.40659
		Period          13.9618
		Eccentricity    0.944595
		Inclination     -114.096
		AscendingNode   61.0352
		ArgOfPericenter 150.049
		MeanAnomaly     173.182
	}
}

Comet	"Foerost System C151"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            1.91964e-009
	Radius          18.9143
	InertiaMoment   0.398885

	Oblateness      0.0035829

	RotationPeriod  96.7381
	Obliquity       212.532
	EqAscendNode    294.485

	AbsMagn         13.0355
	SlopeParam      4.36345
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.627 0.535 0.431)

	Surface
	{
		SurfStyle       0.473543
		OceanStyle      0.0367326
		Randomize      (0.152, 0.173, -0.331)
		colorDistMagn   0.330776
		colorDistFreq   0.152424
		detailScale     516.486
		colorConversion true
		snowLevel       2
		tropicLatitude  0.977601
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.348626
		terraceProb     0.148676
		erosion         0
		montesMagn      0.65783
		montesFreq      3.81354
		montesSpiky     0.97756
		montesFraction  0.38691
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.828683
		hillsFraction   0.782155
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257285
		craterFreq      0.215834
		craterDensity   0.85838
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.456992
		volcanoTemp     1610.95
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.251, 0.214, 0.173, 0.000)
		colorShelf     (0.267, 0.227, 0.183, 0.000)
		colorBeach     (0.282, 0.241, 0.194, 0.000)
		colorDesert    (0.298, 0.254, 0.205, 0.000)
		colorLowland   (0.314, 0.267, 0.216, 0.000)
		colorUpland    (0.329, 0.281, 0.226, 0.000)
		colorRock      (0.345, 0.294, 0.237, 0.000)
		colorSnow      (0.361, 0.307, 0.248, 1.000)
		BumpHeight      17.0229
		BumpOffset      3.40457
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.787548
		GasToDust   0.25
		Particles   2570
		GasBright   0.0674289
		DustBright  0.178
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.70443
		Period          22.6581
		Eccentricity    0.944854
		Inclination     69.5506
		AscendingNode   -80.3932
		ArgOfPericenter -113.645
		MeanAnomaly     79.5933
	}
}

Comet	"Foerost System C152"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            5.91073e-017
	Radius          0.0537
	InertiaMoment   0.397195

	Oblateness      0.00289096

	RotationPeriod  92.5516
	Obliquity       165.738
	EqAscendNode    279.062

	AbsMagn         8.58575
	SlopeParam      4.95883
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.537 0.532 0.527)

	Surface
	{
		SurfStyle       0.765801
		OceanStyle      0.410311
		Randomize      (-0.028, 0.386, -0.172)
		colorDistMagn   0.975789
		colorDistFreq   1.31755e-006
		detailScale     1.46637
		colorConversion true
		snowLevel       2
		tropicLatitude  0.972004
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.565129
		terraceProb     0.330418
		erosion         0
		montesMagn      0.458499
		montesFreq      2.79071
		montesSpiky     0.928712
		montesFraction  0.864814
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.05601e-006
		hillsFraction   0.876087
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238817
		craterFreq      0.176726
		craterDensity   0.934446
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.502907
		volcanoTemp     1400.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.209, 0.181, 0.148, 0.000)
		colorShelf     (0.215, 0.186, 0.169, 0.000)
		colorBeach     (0.252, 0.218, 0.200, 0.000)
		colorDesert    (0.274, 0.234, 0.195, 0.000)
		colorLowland   (0.301, 0.250, 0.221, 0.000)
		colorUpland    (0.333, 0.303, 0.269, 0.000)
		colorRock      (0.360, 0.330, 0.290, 0.000)
		colorSnow      (0.392, 0.351, 0.306, 1.000)
		BumpHeight      0.04833
		BumpOffset      0.009666
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.243634
		DustBright  0.486281
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.83609
		Period          10.6058
		Eccentricity    0.928747
		Inclination     69.4279
		AscendingNode   -117.245
		ArgOfPericenter -147.461
		MeanAnomaly     30.1838
	}
}

Comet	"Foerost System C153"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            4.57151e-013
	Radius          1.17085
	InertiaMoment   0.399348

	Oblateness      0.00423381

	RotationPeriod  88.8938
	Obliquity       118.943
	EqAscendNode    263.64

	AbsMagn         4.91747
	SlopeParam      5.65663
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.665 0.662 0.657)

	Surface
	{
		SurfStyle       0.819656
		OceanStyle      0.613183
		Randomize      (0.935, 0.844, 0.627)
		colorDistMagn   0.79145
		colorDistFreq   0.000621169
		detailScale     31.9719
		colorConversion true
		snowLevel       2
		tropicLatitude  0.986809
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.758006
		terraceProb     0.624033
		erosion         0
		montesMagn      0.561461
		montesFreq      2.94086
		montesSpiky     0.834274
		montesFraction  0.63009
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00361352
		hillsFraction   0.748681
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.200907
		craterFreq      0.219017
		craterDensity   0.916148
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.443616
		volcanoTemp     1244.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.259, 0.225, 0.184, 0.000)
		colorShelf     (0.266, 0.232, 0.210, 0.000)
		colorBeach     (0.312, 0.271, 0.250, 0.000)
		colorDesert    (0.339, 0.291, 0.243, 0.000)
		colorLowland   (0.372, 0.311, 0.276, 0.000)
		colorUpland    (0.412, 0.377, 0.335, 0.000)
		colorRock      (0.445, 0.410, 0.362, 0.000)
		colorSnow      (0.485, 0.437, 0.381, 1.000)
		BumpHeight      1.05376
		BumpOffset      0.210752
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.339182
		GasToDust   0.25
		Particles   1665
		GasBright   0.162789
		DustBright  0.251613
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.81557
		Period          16.5502
		Eccentricity    0.957563
		Inclination     158.67
		AscendingNode   -24.8192
		ArgOfPericenter 93.6954
		MeanAnomaly     15.4106
	}
}

Comet	"Foerost System C154"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            3.53574e-009
	Radius          20.9872
	InertiaMoment   0.398043

	Oblateness      0.00338209

	RotationPeriod  85.6156
	Obliquity       72.1492
	EqAscendNode    248.217

	AbsMagn         12.6044
	SlopeParam      6.66109
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.522 0.518 0.515)

	Surface
	{
		SurfStyle       0.995615
		OceanStyle      0.0345127
		Randomize      (-0.935, -0.994, 0.081)
		colorDistMagn   0.338959
		colorDistFreq   0.354809
		detailScale     573.09
		colorConversion true
		snowLevel       2
		tropicLatitude  0.96719
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.436083
		terraceProb     0.335495
		erosion         0
		montesMagn      0.31842
		montesFreq      2.83689
		montesSpiky     0.908976
		montesFraction  0.565224
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.06653
		hillsFraction   0.491146
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238586
		craterFreq      0.26794
		craterDensity   0.911027
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.501576
		volcanoTemp     905.553
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.178, 0.181, 0.206, 0.050)
		colorShelf     (0.209, 0.212, 0.237, 0.040)
		colorBeach     (0.240, 0.243, 0.268, 0.030)
		colorDesert    (0.272, 0.274, 0.304, 0.020)
		colorLowland   (0.303, 0.305, 0.335, 0.030)
		colorUpland    (0.334, 0.336, 0.366, 0.050)
		colorRock      (0.366, 0.367, 0.407, 0.020)
		colorSnow      (0.366, 0.367, 0.407, 1.000)
		BumpHeight      18.8885
		BumpOffset      3.77769
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.820374
		GasToDust   0.25
		Particles   2637
		GasBright   0.406185
		DustBright  0.492704
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.53744
		Period          14.774
		Eccentricity    0.975351
		Inclination     50.7578
		AscendingNode   52.5787
		ArgOfPericenter 122.127
		MeanAnomaly     -24.7001
	}
}

Comet	"Foerost System C155"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            1.08868e-016
	Radius          0.0724804
	InertiaMoment   0.399777

	Oblateness      0.00488984

	RotationPeriod  82.6229
	Obliquity       25.3549
	EqAscendNode    232.795

	AbsMagn         8.37558
	SlopeParam      2.16211
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.679 0.677 0.676)

	Surface
	{
		SurfStyle       0.304801
		OceanStyle      0.851987
		Randomize      (0.265, -0.314, -0.547)
		colorDistMagn   0.781988
		colorDistFreq   2.44868e-006
		detailScale     1.9792
		colorConversion true
		snowLevel       2
		tropicLatitude  0.29959
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.508704
		terraceProb     0.134281
		erosion         0
		montesMagn      0.671031
		montesFreq      3.01871
		montesSpiky     0.963677
		montesFraction  0.520607
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.53606e-005
		hillsFraction   0.751242
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.200954
		craterFreq      0.214777
		craterDensity   0.740675
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.493668
		volcanoTemp     1696.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.272, 0.271, 0.270, 0.000)
		colorShelf     (0.289, 0.288, 0.287, 0.000)
		colorBeach     (0.306, 0.305, 0.304, 0.000)
		colorDesert    (0.323, 0.322, 0.321, 0.000)
		colorLowland   (0.340, 0.339, 0.338, 0.000)
		colorUpland    (0.357, 0.356, 0.355, 0.000)
		colorRock      (0.374, 0.372, 0.372, 0.000)
		colorSnow      (0.391, 0.389, 0.388, 1.000)
		BumpHeight      0.0652323
		BumpOffset      0.0130465
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.00637046
		DustBright  0.577005
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.09218
		Period          18.3821
		Eccentricity    0.94864
		Inclination     -10.264
		AscendingNode   -31.7892
		ArgOfPericenter 81.566
		MeanAnomaly     118.072
	}
}

Comet	"Foerost System C156"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            8.42015e-013
	Radius          1.29997
	InertiaMoment   0.398635

	Oblateness      0.00388847

	RotationPeriod  79.8521
	Obliquity       338.561
	EqAscendNode    217.372

	AbsMagn         4.62857
	SlopeParam      2.89988
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.562 0.558 0.556)

	Surface
	{
		SurfStyle       0.108695
		OceanStyle      0.163479
		Randomize      (-0.470, 0.971, 0.610)
		colorDistMagn   0.568354
		colorDistFreq   0.00119027
		detailScale     35.4978
		colorConversion true
		snowLevel       2
		tropicLatitude  0.658714
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.574108
		terraceProb     0.101275
		erosion         0
		montesMagn      0.440939
		montesFreq      3.13444
		montesSpiky     0.929949
		montesFraction  0.700125
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00376878
		hillsFraction   0.773711
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.26157
		craterFreq      0.203876
		craterDensity   1.02586
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.518573
		volcanoTemp     1503.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.225, 0.223, 0.223, 0.000)
		colorShelf     (0.239, 0.237, 0.236, 0.000)
		colorBeach     (0.253, 0.251, 0.250, 0.000)
		colorDesert    (0.267, 0.265, 0.264, 0.000)
		colorLowland   (0.281, 0.279, 0.278, 0.000)
		colorUpland    (0.295, 0.293, 0.292, 0.000)
		colorRock      (0.309, 0.307, 0.306, 0.000)
		colorSnow      (0.323, 0.321, 0.320, 1.000)
		BumpHeight      1.16997
		BumpOffset      0.233995
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.372008
		GasToDust   0.25
		Particles   1731
		GasBright   0.018741
		DustBright  0.249121
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.37026
		Period          13.7391
		Eccentricity    0.924163
		Inclination     -158.905
		AscendingNode   -151.885
		ArgOfPericenter -96.3784
		MeanAnomaly     157.711
	}
}

Comet	"Foerost System C157"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            6.51239e-009
	Radius          28.3107
	InertiaMoment   0.396479

	Oblateness      0.00550281

	RotationPeriod  77.2584
	Obliquity       291.766
	EqAscendNode    201.949

	AbsMagn         12.221
	SlopeParam      3.50994
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.637 0.569 0.464)

	Surface
	{
		SurfStyle       0.819525
		OceanStyle      0.244328
		Randomize      (0.688, -0.050, 0.266)
		colorDistMagn   0.974556
		colorDistFreq   0.110086
		detailScale     773.072
		colorConversion true
		snowLevel       2
		tropicLatitude  0.610455
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.521226
		terraceProb     0.274938
		erosion         0
		montesMagn      0.446822
		montesFreq      2.75922
		montesSpiky     0.952629
		montesFraction  0.44425
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.37902
		hillsFraction   0.844152
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2536
		craterFreq      0.233859
		craterDensity   0.885394
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.473905
		volcanoTemp     1427.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.248, 0.193, 0.130, 0.000)
		colorShelf     (0.255, 0.199, 0.149, 0.000)
		colorBeach     (0.299, 0.233, 0.176, 0.000)
		colorDesert    (0.325, 0.250, 0.172, 0.000)
		colorLowland   (0.357, 0.267, 0.195, 0.000)
		colorUpland    (0.395, 0.324, 0.237, 0.000)
		colorRock      (0.427, 0.352, 0.255, 0.000)
		colorSnow      (0.465, 0.375, 0.269, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.8532
		GasToDust   0.25
		Particles   2703
		GasBright   0.0970609
		DustBright  0.655288
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.65153
		Period          9.58757
		Eccentricity    0.960269
		Inclination     148.941
		AscendingNode   -171.931
		ArgOfPericenter -72.9198
		MeanAnomaly     108.61
	}
}

Comet	"Foerost System C158"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            2.00521e-016
	Radius          0.0805214
	InertiaMoment   0.399125

	Oblateness      0.00442941

	RotationPeriod  74.8083
	Obliquity       244.972
	EqAscendNode    186.527

	AbsMagn         8.16644
	SlopeParam      4.07669
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.686 0.682 0.678)

	Surface
	{
		SurfStyle       0.886445
		OceanStyle      0.553245
		Randomize      (0.905, 0.353, -0.336)
		colorDistMagn   0.268994
		colorDistFreq   2.6336e-006
		detailScale     2.19877
		colorConversion true
		snowLevel       2
		tropicLatitude  0.696797
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.484477
		terraceProb     0.20076
		erosion         0
		montesMagn      0.429896
		montesFreq      2.5865
		montesSpiky     0.939232
		montesFraction  0.210384
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.19744e-005
		hillsFraction   0.923617
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262143
		craterFreq      0.20646
		craterDensity   0.911981
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.544779
		volcanoTemp     1531.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.233, 0.239, 0.271, 0.050)
		colorShelf     (0.275, 0.280, 0.312, 0.040)
		colorBeach     (0.316, 0.321, 0.353, 0.030)
		colorDesert    (0.357, 0.362, 0.400, 0.020)
		colorLowland   (0.398, 0.403, 0.441, 0.030)
		colorUpland    (0.439, 0.444, 0.481, 0.050)
		colorRock      (0.481, 0.485, 0.536, 0.020)
		colorSnow      (0.481, 0.485, 0.536, 1.000)
		BumpHeight      0.0724693
		BumpOffset      0.0144939
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0821494
		DustBright  0.354686
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.56465
		Period          14.9448
		Eccentricity    0.977542
		Inclination     -144.919
		AscendingNode   135.441
		ArgOfPericenter 60.6804
		MeanAnomaly     -34.5992
	}
}

Comet	"Foerost System C159"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            1.55089e-012
	Radius          1.75264
	InertiaMoment   0.397676

	Oblateness      0.00625766

	RotationPeriod  72.4765
	Obliquity       198.178
	EqAscendNode    171.104

	AbsMagn         4.32091
	SlopeParam      4.64979
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.671 0.668 0.665)

	Surface
	{
		SurfStyle       0.81486
		OceanStyle      0.133058
		Randomize      (0.355, 0.436, 0.409)
		colorDistMagn   0.311164
		colorDistFreq   0.000519118
		detailScale     47.8587
		colorConversion true
		snowLevel       2
		tropicLatitude  0.881099
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.345146
		terraceProb     0.346435
		erosion         0
		montesMagn      0.475015
		montesFreq      3.12627
		montesSpiky     0.993592
		montesFraction  0.477121
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00748685
		hillsFraction   0.549011
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.200966
		craterFreq      0.193349
		craterDensity   0.822057
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.537652
		volcanoTemp     1296.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.262, 0.227, 0.186, 0.000)
		colorShelf     (0.268, 0.234, 0.213, 0.000)
		colorBeach     (0.315, 0.274, 0.253, 0.000)
		colorDesert    (0.342, 0.294, 0.246, 0.000)
		colorLowland   (0.376, 0.314, 0.279, 0.000)
		colorUpland    (0.416, 0.381, 0.339, 0.000)
		colorRock      (0.449, 0.414, 0.366, 0.000)
		colorSnow      (0.490, 0.441, 0.386, 1.000)
		BumpHeight      1.57737
		BumpOffset      0.315474
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.404834
		GasToDust   0.25
		Particles   1797
		GasBright   0.22766
		DustBright  0.693662
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.35905
		Period          20.2093
		Eccentricity    0.95221
		Inclination     -134.355
		AscendingNode   -30.9574
		ArgOfPericenter 59.9909
		MeanAnomaly     6.11702
	}
}

Comet	"Foerost System C160"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            1.1995e-008
	Radius          31.4694
	InertiaMoment   0.399568

	Oblateness      0.00502168

	RotationPeriod  70.2432
	Obliquity       151.383
	EqAscendNode    155.682

	AbsMagn         11.8729
	SlopeParam      5.28328
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.539 0.461 0.430)

	Surface
	{
		SurfStyle       0.980803
		OceanStyle      0.106216
		Randomize      (-0.652, -0.158, 0.140)
		colorDistMagn   0.43961
		colorDistFreq   0.374897
		detailScale     859.324
		colorConversion true
		snowLevel       2
		tropicLatitude  0.263046
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.662709
		terraceProb     0.238312
		erosion         0
		montesMagn      0.489231
		montesFreq      2.86833
		montesSpiky     0.954956
		montesFraction  0.819739
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.86298
		hillsFraction   0.405025
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250104
		craterFreq      0.248404
		craterDensity   1.02463
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.45217
		volcanoTemp     1868.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.183, 0.161, 0.172, 0.050)
		colorShelf     (0.216, 0.189, 0.198, 0.040)
		colorBeach     (0.248, 0.217, 0.224, 0.030)
		colorDesert    (0.280, 0.244, 0.254, 0.020)
		colorLowland   (0.313, 0.272, 0.280, 0.030)
		colorUpland    (0.345, 0.300, 0.305, 0.050)
		colorRock      (0.377, 0.327, 0.340, 0.020)
		colorSnow      (0.377, 0.327, 0.340, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.886026
		GasToDust   0.25
		Particles   2769
		GasBright   0.185466
		DustBright  0.420342
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.13982
		Period          25.8753
		Eccentricity    0.954317
		Inclination     140.874
		AscendingNode   -159.88
		ArgOfPericenter -20.9855
		MeanAnomaly     -53.2074
	}
}

Comet	"Foerost System C161"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            3.69334e-016
	Radius          0.108503
	InertiaMoment   0.39836

	Oblateness      0.0070816

	RotationPeriod  68.0924
	Obliquity       104.589
	EqAscendNode    140.259

	AbsMagn         7.95776
	SlopeParam      6.08597
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.616 0.612 0.606)

	Surface
	{
		SurfStyle       0.0253377
		OceanStyle      0.450676
		Randomize      (-0.946, 0.003, -0.790)
		colorDistMagn   0.633614
		colorDistFreq   2.98766e-006
		detailScale     2.96285
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999988
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.605704
		terraceProb     0.210727
		erosion         0
		montesMagn      0.457016
		montesFreq      3.34121
		montesSpiky     0.966662
		montesFraction  0.231402
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.75467e-005
		hillsFraction   0.473293
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263736
		craterFreq      0.261231
		craterDensity   0.897481
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.512127
		volcanoTemp     1421.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.247, 0.245, 0.242, 0.000)
		colorShelf     (0.262, 0.260, 0.257, 0.000)
		colorBeach     (0.277, 0.275, 0.273, 0.000)
		colorDesert    (0.293, 0.290, 0.288, 0.000)
		colorLowland   (0.308, 0.306, 0.303, 0.000)
		colorUpland    (0.324, 0.321, 0.318, 0.000)
		colorRock      (0.339, 0.336, 0.333, 0.000)
		colorSnow      (0.354, 0.352, 0.348, 1.000)
		BumpHeight      0.0976525
		BumpOffset      0.0195305
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.106013
		DustBright  0.184282
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.99573
		Period          11.5138
		Eccentricity    0.934964
		Inclination     33.7003
		AscendingNode   -112.402
		ArgOfPericenter -52.8567
		MeanAnomaly     -54.3649
	}
}

Comet	"Foerost System C162"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            2.85653e-012
	Radius          1.94924
	InertiaMoment   0.39999

	Oblateness      0.00568328

	RotationPeriod  66.0111
	Obliquity       57.7948
	EqAscendNode    124.836

	AbsMagn         3.98977
	SlopeParam      7.58815
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.737 0.676 0.591)

	Surface
	{
		SurfStyle       0.892762
		OceanStyle      0.466026
		Randomize      (0.571, -0.791, -0.448)
		colorDistMagn   0.541718
		colorDistFreq   0.00194864
		detailScale     53.2271
		colorConversion true
		snowLevel       2
		tropicLatitude  0.849657
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.637096
		terraceProb     0.229953
		erosion         0
		montesMagn      0.349255
		montesFreq      3.21547
		montesSpiky     0.982734
		montesFraction  0.750293
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00585397
		hillsFraction   0.739768
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23255
		craterFreq      0.156705
		craterDensity   0.866274
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51972
		volcanoTemp     1394.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.251, 0.237, 0.236, 0.050)
		colorShelf     (0.295, 0.277, 0.272, 0.040)
		colorBeach     (0.339, 0.318, 0.307, 0.030)
		colorDesert    (0.383, 0.358, 0.349, 0.020)
		colorLowland   (0.428, 0.399, 0.384, 0.030)
		colorUpland    (0.472, 0.440, 0.420, 0.050)
		colorRock      (0.516, 0.480, 0.467, 0.020)
		colorSnow      (0.516, 0.480, 0.467, 1.000)
		BumpHeight      1.75431
		BumpOffset      0.350862
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.43766
		GasToDust   0.25
		Particles   1863
		GasBright   0.328691
		DustBright  0.446091
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.44285
		Period          8.47828
		Eccentricity    0.93543
		Inclination     172.731
		AscendingNode   90.714
		ArgOfPericenter -47.9086
		MeanAnomaly     64.8937
	}
}

Comet	"Foerost System C163"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            2.20932e-008
	Radius          42.3837
	InertiaMoment   0.398891

	Oblateness      0.00800621

	RotationPeriod  63.9884
	Obliquity       11.0005
	EqAscendNode    109.414

	AbsMagn         11.552
	SlopeParam      2.55069
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.586 0.584 0.581)

	Surface
	{
		SurfStyle       0.224055
		OceanStyle      0.991267
		Randomize      (0.733, 0.781, -0.183)
		colorDistMagn   0.108749
		colorDistFreq   0.752981
		detailScale     1157.36
		colorConversion true
		snowLevel       2
		tropicLatitude  0.762542
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.48898
		terraceProb     0.486045
		erosion         0
		montesMagn      0.556494
		montesFreq      3.01834
		montesSpiky     0.937804
		montesFraction  0.156118
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.43332
		hillsFraction   0.792655
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233936
		craterFreq      0.239246
		craterDensity   0.860289
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.472598
		volcanoTemp     1384.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.234, 0.234, 0.232, 0.000)
		colorShelf     (0.249, 0.248, 0.247, 0.000)
		colorBeach     (0.264, 0.263, 0.262, 0.000)
		colorDesert    (0.278, 0.277, 0.276, 0.000)
		colorLowland   (0.293, 0.292, 0.291, 0.000)
		colorUpland    (0.308, 0.307, 0.305, 0.000)
		colorRock      (0.322, 0.321, 0.320, 0.000)
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
		MaxLength   0.918852
		GasToDust   0.25
		Particles   2836
		GasBright   0.221956
		DustBright  0.237312
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.89464
		Period          17.0672
		Eccentricity    0.961925
		Inclination     -44.7152
		AscendingNode   112.149
		ArgOfPericenter 39.428
		MeanAnomaly     -71.4536
	}
}

Comet	"Foerost System C164"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            6.80268e-016
	Radius          0.120737
	InertiaMoment   0.397209

	Oblateness      0.00635912

	RotationPeriod  62.0149
	Obliquity       324.206
	EqAscendNode    93.9913

	AbsMagn         7.74896
	SlopeParam      3.20993
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.742 0.739 0.736)

	Surface
	{
		SurfStyle       0.571273
		OceanStyle      0.950717
		Randomize      (0.140, -0.971, 0.116)
		colorDistMagn   0.285217
		colorDistFreq   1.5628e-006
		detailScale     3.29692
		colorConversion true
		snowLevel       2
		tropicLatitude  0.640436
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.422595
		terraceProb     0.191648
		erosion         0
		montesMagn      0.629033
		montesFreq      2.84622
		montesSpiky     0.924335
		montesFraction  0.409816
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.93072e-005
		hillsFraction   0.667664
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214458
		craterFreq      0.213978
		craterDensity   1.09358
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.497643
		volcanoTemp     1366.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.290, 0.251, 0.206, 0.000)
		colorShelf     (0.297, 0.259, 0.236, 0.000)
		colorBeach     (0.349, 0.303, 0.280, 0.000)
		colorDesert    (0.379, 0.325, 0.272, 0.000)
		colorLowland   (0.416, 0.347, 0.309, 0.000)
		colorUpland    (0.460, 0.421, 0.375, 0.000)
		colorRock      (0.497, 0.458, 0.405, 0.000)
		colorSnow      (0.542, 0.488, 0.427, 1.000)
		BumpHeight      0.108663
		BumpOffset      0.0217326
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0399466
		DustBright  0.903808
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.80904
		Period          16.5077
		Eccentricity    0.924086
		Inclination     -73.919
		AscendingNode   -165.197
		ArgOfPericenter -10.6619
		MeanAnomaly     43.9342
	}
}

Comet	"Foerost System C165"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            5.26139e-012
	Radius          2.62402
	InertiaMoment   0.399353

	Oblateness      0.00906447

	RotationPeriod  60.0827
	Obliquity       277.412
	EqAscendNode    78.5687

	AbsMagn         3.62859
	SlopeParam      3.7915
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.708 0.641 0.614)

	Surface
	{
		SurfStyle       0.142737
		OceanStyle      0.132038
		Randomize      (-0.228, -0.792, -0.026)
		colorDistMagn   0.29129
		colorDistFreq   0.00555792
		detailScale     71.6531
		colorConversion true
		snowLevel       2
		tropicLatitude  0.861104
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.36614
		terraceProb     0.30978
		erosion         0
		montesMagn      0.423812
		montesFreq      4.00015
		montesSpiky     0.935055
		montesFraction  0.455772
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0189997
		hillsFraction   0.919897
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247412
		craterFreq      0.240369
		craterDensity   0.678572
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.534534
		volcanoTemp     1664.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.283, 0.256, 0.246, 0.000)
		colorShelf     (0.301, 0.272, 0.261, 0.000)
		colorBeach     (0.319, 0.288, 0.276, 0.000)
		colorDesert    (0.337, 0.304, 0.292, 0.000)
		colorLowland   (0.354, 0.320, 0.307, 0.000)
		colorUpland    (0.372, 0.336, 0.322, 0.000)
		colorRock      (0.390, 0.352, 0.338, 0.000)
		colorSnow      (0.407, 0.368, 0.353, 1.000)
		BumpHeight      2.36161
		BumpOffset      0.472323
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.470486
		GasToDust   0.25
		Particles   1930
		GasBright   0.0636864
		DustBright  0.564555
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.0218
		Period          11.6644
		Eccentricity    0.927498
		Inclination     47.2255
		AscendingNode   -54.6806
		ArgOfPericenter 141.234
		MeanAnomaly     -134.536
	}
}

Comet	"Foerost System C166"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            4.0693e-008
	Radius          47.186
	InertiaMoment   0.398051

	Oblateness      0.00723144

	RotationPeriod  58.1847
	Obliquity       230.618
	EqAscendNode    63.1461

	AbsMagn         11.2524
	SlopeParam      4.35561
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.759 0.756 0.753)

	Surface
	{
		SurfStyle       0.848955
		OceanStyle      0.0753573
		Randomize      (-0.024, -0.404, -0.276)
		colorDistMagn   0.520274
		colorDistFreq   0.559753
		detailScale     1288.49
		colorConversion true
		snowLevel       2
		tropicLatitude  0.564166
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.691769
		terraceProb     0.164607
		erosion         0
		montesMagn      0.419239
		montesFreq      2.57663
		montesSpiky     0.990636
		montesFraction  0.654855
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.65246
		hillsFraction   0.449725
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225838
		craterFreq      0.196439
		craterDensity   0.837129
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.56429
		volcanoTemp     1495.53
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.296, 0.257, 0.211, 0.000)
		colorShelf     (0.304, 0.265, 0.241, 0.000)
		colorBeach     (0.357, 0.310, 0.286, 0.000)
		colorDesert    (0.387, 0.333, 0.279, 0.000)
		colorLowland   (0.425, 0.355, 0.316, 0.000)
		colorUpland    (0.471, 0.431, 0.384, 0.000)
		colorRock      (0.509, 0.469, 0.414, 0.000)
		colorSnow      (0.554, 0.499, 0.437, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.951678
		GasToDust   0.25
		Particles   2902
		GasBright   0.0501671
		DustBright  0.262561
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.46898
		Period          8.61466
		Eccentricity    0.901027
		Inclination     75.106
		AscendingNode   -152.503
		ArgOfPericenter 86.8442
		MeanAnomaly     8.50815
	}
}

Comet	"Foerost System C167"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            1.25297e-015
	Radius          0.162458
	InertiaMoment   0.399783

	Oblateness      0.0102987

	RotationPeriod  56.3147
	Obliquity       183.823
	EqAscendNode    47.7235

	AbsMagn         7.53947
	SlopeParam      4.95018
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.748 0.745 0.744)

	Surface
	{
		SurfStyle       0.843044
		OceanStyle      0.41327
		Randomize      (0.192, 0.426, 0.028)
		colorDistMagn   0.550625
		colorDistFreq   1.30577e-005
		detailScale     4.43619
		colorConversion true
		snowLevel       2
		tropicLatitude  0.959566
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.651136
		terraceProb     0.299089
		erosion         0
		montesMagn      0.39174
		montesFreq      2.65041
		montesSpiky     0.980049
		montesFraction  0.552463
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.00225e-005
		hillsFraction   0.552843
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248728
		craterFreq      0.229527
		craterDensity   0.924704
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.45517
		volcanoTemp     1279.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.292, 0.253, 0.208, 0.000)
		colorShelf     (0.299, 0.261, 0.238, 0.000)
		colorBeach     (0.351, 0.306, 0.283, 0.000)
		colorDesert    (0.381, 0.328, 0.275, 0.000)
		colorLowland   (0.419, 0.350, 0.312, 0.000)
		colorUpland    (0.464, 0.425, 0.379, 0.000)
		colorRock      (0.501, 0.462, 0.409, 0.000)
		colorSnow      (0.546, 0.492, 0.431, 1.000)
		BumpHeight      0.146212
		BumpOffset      0.0292425
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0221201
		GasToDust   0.25
		Particles   1024
		GasBright   0.174959
		DustBright  0.622255
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.99639
		Period          11.5176
		Eccentricity    0.971372
		Inclination     69.8289
		AscendingNode   -1.28974
		ArgOfPericenter -37.5976
		MeanAnomaly     -88.3771
	}
}

Comet	"Foerost System C168"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            9.69081e-012
	Radius          2.92271
	InertiaMoment   0.398641

	Oblateness      0.0082531

	RotationPeriod  54.4668
	Obliquity       137.029
	EqAscendNode    32.3009

	AbsMagn         3.22772
	SlopeParam      5.64578
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.818 0.774 0.727)

	Surface
	{
		SurfStyle       0.205454
		OceanStyle      0.982566
		Randomize      (-0.426, 0.392, 0.698)
		colorDistMagn   0.629348
		colorDistFreq   0.00696385
		detailScale     79.8095
		colorConversion true
		snowLevel       2
		tropicLatitude  0.232975
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.716731
		terraceProb     0.37176
		erosion         0
		montesMagn      0.526918
		montesFreq      2.77987
		montesSpiky     0.939528
		montesFraction  0.418265
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0174516
		hillsFraction   0.694177
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242024
		craterFreq      0.234756
		craterDensity   0.694393
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.527899
		volcanoTemp     1534.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.327, 0.310, 0.291, 0.000)
		colorShelf     (0.348, 0.329, 0.309, 0.000)
		colorBeach     (0.368, 0.348, 0.327, 0.000)
		colorDesert    (0.389, 0.368, 0.345, 0.000)
		colorLowland   (0.409, 0.387, 0.363, 0.000)
		colorUpland    (0.430, 0.406, 0.382, 0.000)
		colorRock      (0.450, 0.426, 0.400, 0.000)
		colorSnow      (0.471, 0.445, 0.418, 1.000)
		BumpHeight      2.63044
		BumpOffset      0.526088
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.503312
		GasToDust   0.25
		Particles   1996
		GasBright   0.134158
		DustBright  0.347543
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.64626
		Period          22.2392
		Eccentricity    0.961278
		Inclination     -127.181
		AscendingNode   12.4557
		ArgOfPericenter 160.565
		MeanAnomaly     -24.7863
	}
}

Comet	"Foerost System C169"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            7.49515e-008
	Radius          63.4635
	InertiaMoment   0.396503

	Oblateness      0.0116046

	RotationPeriod  52.6358
	Obliquity       90.2347
	EqAscendNode    16.8783

	AbsMagn         10.9701
	SlopeParam      6.64251
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.739 0.737 0.736)

	Surface
	{
		SurfStyle       0.0490179
		OceanStyle      0.792721
		Randomize      (-0.442, -0.511, 0.562)
		colorDistMagn   0.468528
		colorDistFreq   1.35923
		detailScale     1732.98
		colorConversion true
		snowLevel       2
		tropicLatitude  0.391955
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.751565
		terraceProb     0.170348
		erosion         0
		montesMagn      0.418204
		montesFreq      3.16043
		montesSpiky     0.97541
		montesFraction  0.31091
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.58704
		hillsFraction   0.594512
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214435
		craterFreq      0.221763
		craterDensity   0.726554
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.489207
		volcanoTemp     1549.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.296, 0.295, 0.294, 0.000)
		colorShelf     (0.314, 0.313, 0.313, 0.000)
		colorBeach     (0.333, 0.332, 0.331, 0.000)
		colorDesert    (0.351, 0.350, 0.350, 0.000)
		colorLowland   (0.370, 0.369, 0.368, 0.000)
		colorUpland    (0.388, 0.387, 0.386, 0.000)
		colorRock      (0.407, 0.406, 0.405, 0.000)
		colorSnow      (0.425, 0.424, 0.423, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.984504
		GasToDust   0.25
		Particles   2968
		GasBright   0.32614
		DustBright  0.640047
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.00136
		Period          17.7736
		Eccentricity    0.941721
		Inclination     78.2087
		AscendingNode   160.166
		ArgOfPericenter 52.6783
		MeanAnomaly     14.7697
	}
}

Comet	"Foerost System C170"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            2.30781e-015
	Radius          0.181033
	InertiaMoment   0.399131

	Oblateness      0.00947848

	RotationPeriod  50.8167
	Obliquity       43.4404
	EqAscendNode    1.45574

	AbsMagn         7.32872
	SlopeParam      2.15031
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.783 0.781 0.780)

	Surface
	{
		SurfStyle       0.78778
		OceanStyle      0.299634
		Randomize      (0.236, -0.810, -0.013)
		colorDistMagn   0.864807
		colorDistFreq   1.97973e-005
		detailScale     4.9434
		colorConversion true
		snowLevel       2
		tropicLatitude  0.845038
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.256024
		terraceProb     0.247605
		erosion         0
		montesMagn      0.588468
		montesFreq      2.89413
		montesSpiky     0.855861
		montesFraction  0.566201
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.51388e-005
		hillsFraction   0.769669
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240963
		craterFreq      0.189362
		craterDensity   0.850386
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.455324
		volcanoTemp     1460.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.305, 0.266, 0.218, 0.000)
		colorShelf     (0.313, 0.273, 0.250, 0.000)
		colorBeach     (0.368, 0.320, 0.296, 0.000)
		colorDesert    (0.399, 0.344, 0.289, 0.000)
		colorLowland   (0.438, 0.367, 0.328, 0.000)
		colorUpland    (0.485, 0.445, 0.398, 0.000)
		colorRock      (0.524, 0.484, 0.429, 0.000)
		colorSnow      (0.571, 0.516, 0.452, 1.000)
		BumpHeight      0.162929
		BumpOffset      0.0325859
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0549459
		GasToDust   0.25
		Particles   1090
		GasBright   0.258057
		DustBright  0.392617
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.47512
		Period          14.3853
		Eccentricity    0.947336
		Inclination     -86.3586
		AscendingNode   -44.6011
		ArgOfPericenter 2.02431
		MeanAnomaly     -3.20586
	}
}

Comet	"Foerost System C171"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            1.78492e-011
	Radius          3.92929
	InertiaMoment   0.397687

	Oblateness      0.0134021

	RotationPeriod  49.0048
	Obliquity       356.646
	EqAscendNode    346.033

	AbsMagn         2.77214
	SlopeParam      2.89089
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.654 0.537 0.463)

	Surface
	{
		SurfStyle       0.556996
		OceanStyle      0.774311
		Randomize      (0.534, -0.071, 0.986)
		colorDistMagn   0.920896
		colorDistFreq   0.013141
		detailScale     107.296
		colorConversion true
		snowLevel       2
		tropicLatitude  0.651193
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.522687
		terraceProb     0.340766
		erosion         0
		montesMagn      0.588909
		montesFreq      3.40088
		montesSpiky     0.986836
		montesFraction  0.870267
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0409392
		hillsFraction   0.688437
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224244
		craterFreq      0.173737
		craterDensity   0.866875
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.531329
		volcanoTemp     1158.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.255, 0.183, 0.130, 0.000)
		colorShelf     (0.262, 0.188, 0.148, 0.000)
		colorBeach     (0.308, 0.220, 0.176, 0.000)
		colorDesert    (0.334, 0.236, 0.171, 0.000)
		colorLowland   (0.366, 0.252, 0.194, 0.000)
		colorUpland    (0.406, 0.306, 0.236, 0.000)
		colorRock      (0.438, 0.333, 0.254, 0.000)
		colorSnow      (0.478, 0.354, 0.268, 1.000)
		BumpHeight      3.53636
		BumpOffset      0.707272
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.536138
		GasToDust   0.25
		Particles   2062
		GasBright   0.152714
		DustBright  0.182447
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.49628
		Period          14.5168
		Eccentricity    0.964578
		Inclination     136.114
		AscendingNode   -166.461
		ArgOfPericenter -121.334
		MeanAnomaly     115.554
	}
}

Comet	"Foerost System C172"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            1.38051e-007
	Radius          70.7501
	InertiaMoment   0.399573

	Oblateness      0.0109835

	RotationPeriod  47.1955
	Obliquity       309.852
	EqAscendNode    330.611

	AbsMagn         10.7018
	SlopeParam      3.50198
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.407 0.402 0.400)

	Surface
	{
		SurfStyle       0.281973
		OceanStyle      0.0864206
		Randomize      (-0.015, 0.840, 0.464)
		colorDistMagn   0.750726
		colorDistFreq   2.65138
		detailScale     1931.95
		colorConversion true
		snowLevel       2
		tropicLatitude  0.972597
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.574566
		terraceProb     0.178411
		erosion         0
		montesMagn      0.505259
		montesFreq      3.01491
		montesSpiky     0.970421
		montesFraction  0.664679
		dunesFraction   0
		hillsMagn       0
		hillsFreq       14.4392
		hillsFraction   0.6464
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.203017
		craterFreq      0.224624
		craterDensity   0.896854
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.515571
		volcanoTemp     1115.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.163, 0.161, 0.160, 0.000)
		colorShelf     (0.173, 0.171, 0.170, 0.000)
		colorBeach     (0.183, 0.181, 0.180, 0.000)
		colorDesert    (0.193, 0.191, 0.190, 0.000)
		colorLowland   (0.204, 0.201, 0.200, 0.000)
		colorUpland    (0.214, 0.211, 0.210, 0.000)
		colorRock      (0.224, 0.221, 0.220, 0.000)
		colorSnow      (0.234, 0.231, 0.230, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0120401
		DustBright  0.807607
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.71612
		Period          15.9073
		Eccentricity    0.961989
		Inclination     58.4816
		AscendingNode   150.127
		ArgOfPericenter -23.4814
		MeanAnomaly     -121.222
	}
}

Comet	"Foerost System C173"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            4.2507e-015
	Radius          0.243283
	InertiaMoment   0.398368

	Oblateness      0.0156136

	RotationPeriod  45.3841
	Obliquity       263.058
	EqAscendNode    315.188

	AbsMagn         7.11608
	SlopeParam      4.06896
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.546 0.538 0.532)

	Surface
	{
		SurfStyle       0.641085
		OceanStyle      0.533776
		Randomize      (0.136, -0.945, 0.316)
		colorDistMagn   0.343216
		colorDistFreq   3.25173e-005
		detailScale     6.64324
		colorConversion true
		snowLevel       2
		tropicLatitude  0.996203
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.351071
		terraceProb     0.161789
		erosion         0
		montesMagn      0.43397
		montesFreq      3.01462
		montesSpiky     0.914122
		montesFraction  0.851559
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000170397
		hillsFraction   0.709294
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.287751
		craterFreq      0.187219
		craterDensity   0.910587
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.407761
		volcanoTemp     1557.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.213, 0.183, 0.149, 0.000)
		colorShelf     (0.218, 0.188, 0.170, 0.000)
		colorBeach     (0.257, 0.221, 0.202, 0.000)
		colorDesert    (0.278, 0.237, 0.197, 0.000)
		colorLowland   (0.306, 0.253, 0.224, 0.000)
		colorUpland    (0.338, 0.307, 0.271, 0.000)
		colorRock      (0.366, 0.334, 0.293, 0.000)
		colorSnow      (0.398, 0.355, 0.309, 1.000)
		BumpHeight      0.218954
		BumpOffset      0.0437909
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0877719
		GasToDust   0.25
		Particles   1157
		GasBright   0.0371721
		DustBright  0.466962
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.19806
		Period          19.1001
		Eccentricity    0.988156
		Inclination     -127.744
		AscendingNode   90.9545
		ArgOfPericenter -116.722
		MeanAnomaly     -79.5797
	}
}

Comet	"Foerost System C174"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            3.28761e-011
	Radius          4.38223
	InertiaMoment   0.399995

	Oblateness      0.0128824

	RotationPeriod  43.5661
	Obliquity       216.263
	EqAscendNode    299.765

	AbsMagn         2.23633
	SlopeParam      4.64166
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.577 0.522 0.413)

	Surface
	{
		SurfStyle       0.684565
		OceanStyle      0.941518
		Randomize      (0.474, 0.262, -0.056)
		colorDistMagn   0.384924
		colorDistFreq   0.0105663
		detailScale     119.664
		colorConversion true
		snowLevel       2
		tropicLatitude  0.970925
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.646025
		terraceProb     0.15784
		erosion         0
		montesMagn      0.385741
		montesFreq      3.71623
		montesSpiky     0.991102
		montesFraction  0.453585
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.039206
		hillsFraction   0.677179
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243668
		craterFreq      0.267742
		craterDensity   0.746559
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.507436
		volcanoTemp     1059.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.225, 0.177, 0.116, 0.000)
		colorShelf     (0.231, 0.183, 0.132, 0.000)
		colorBeach     (0.271, 0.214, 0.157, 0.000)
		colorDesert    (0.294, 0.230, 0.153, 0.000)
		colorLowland   (0.323, 0.245, 0.174, 0.000)
		colorUpland    (0.358, 0.297, 0.211, 0.000)
		colorRock      (0.387, 0.324, 0.227, 0.000)
		colorSnow      (0.421, 0.344, 0.240, 1.000)
		BumpHeight      3.94401
		BumpOffset      0.788802
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.568964
		GasToDust   0.25
		Particles   2129
		GasBright   0.131269
		DustBright  0.857351
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.86243
		Period          10.7539
		Eccentricity    0.959036
		Inclination     82.3127
		AscendingNode   -102.966
		ArgOfPericenter -56.1811
		MeanAnomaly     -91.3781
	}
}

Comet	"Foerost System C175"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            2.54273e-007
	Radius          95.0419
	InertiaMoment   0.398897

	Oblateness      0.0184379

	RotationPeriod  41.7366
	Obliquity       169.469
	EqAscendNode    284.343

	AbsMagn         10.4451
	SlopeParam      5.27381
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.590 0.493 0.444)

	Surface
	{
		SurfStyle       0.681854
		OceanStyle      0.688375
		Randomize      (-0.261, -0.437, -0.657)
		colorDistMagn   0.723238
		colorDistFreq   6.52662
		detailScale     2595.28
		colorConversion true
		snowLevel       2
		tropicLatitude  0.76225
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.640917
		terraceProb     0.138381
		erosion         0
		montesMagn      0.531326
		montesFreq      2.78196
		montesSpiky     0.98012
		montesFraction  0.469956
		dunesFraction   0
		hillsMagn       0
		hillsFreq       20.0046
		hillsFraction   0.584515
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249143
		craterFreq      0.331129
		craterDensity   0.868914
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.495018
		volcanoTemp     1354.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.230, 0.168, 0.124, 0.000)
		colorShelf     (0.236, 0.173, 0.142, 0.000)
		colorBeach     (0.277, 0.202, 0.169, 0.000)
		colorDesert    (0.301, 0.217, 0.164, 0.000)
		colorLowland   (0.331, 0.232, 0.186, 0.000)
		colorUpland    (0.366, 0.281, 0.226, 0.000)
		colorRock      (0.396, 0.306, 0.244, 0.000)
		colorSnow      (0.431, 0.326, 0.257, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.129119
		DustBright  0.543988
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.45822
		Period          14.2805
		Eccentricity    0.966351
		Inclination     39.1397
		AscendingNode   177.579
		ArgOfPericenter -32.3044
		MeanAnomaly     46.9946
	}
}

Comet	"Foerost System C176"
{
	ParentBody     "Foerost System"
	Class	       "Asteroid"

	Mass            7.82926e-015
	Radius          0.271433
	InertiaMoment   0.397223

	Oblateness      0.0151738

	RotationPeriod  39.8909
	Obliquity       122.675
	EqAscendNode    268.92

	AbsMagn         6.90091
	SlopeParam      6.07273
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.657 0.654 0.648)

	Surface
	{
		SurfStyle       0.327969
		OceanStyle      0.80785
		Randomize      (0.754, -0.805, 0.922)
		colorDistMagn   0.969167
		colorDistFreq   1.06529e-005
		detailScale     7.41193
		colorConversion true
		snowLevel       2
		tropicLatitude  0.8442
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.529434
		terraceProb     0.440582
		erosion         0
		montesMagn      0.591517
		montesFreq      2.94378
		montesSpiky     0.879848
		montesFraction  0.69606
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000133913
		hillsFraction   0.510009
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256007
		craterFreq      0.18026
		craterDensity   1.0426
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.610293
		volcanoTemp     1332.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.263, 0.262, 0.259, 0.000)
		colorShelf     (0.279, 0.278, 0.276, 0.000)
		colorBeach     (0.296, 0.294, 0.292, 0.000)
		colorDesert    (0.312, 0.311, 0.308, 0.000)
		colorLowland   (0.329, 0.327, 0.324, 0.000)
		colorUpland    (0.345, 0.343, 0.340, 0.000)
		colorRock      (0.361, 0.360, 0.357, 0.000)
		colorSnow      (0.378, 0.376, 0.373, 1.000)
		BumpHeight      0.24429
		BumpOffset      0.048858
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.120598
		GasToDust   0.25
		Particles   1223
		GasBright   0.0897096
		DustBright  0.267884
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.62217
		Period          22.0664
		Eccentricity    0.969654
		Inclination     164.251
		AscendingNode   94.1232
		ArgOfPericenter 1.37466
		MeanAnomaly     77.3465
	}
}

