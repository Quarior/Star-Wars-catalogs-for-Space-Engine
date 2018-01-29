// http://starwars.wikia.com/wiki/Ryloth
// Region : Outer Rim
// Sector : Gaulus Sector
// Grid location : R17
// X : 10069.18, Y : -11430.32, Z : -273.5942109440851
Planet	"Mon Bala"
{
	ParentBody     "Ryloth System"
	Class	       "Desert"

	Mass            2.81908
	Radius          7438.34
	InertiaMoment   0.32878

	Obliquity       1.86148
	EqAscendNode    176.832
	TidalLocked     true

	AlbedoBond      0.334695
	AlbedoGeom      0.401634
	Brightness      2
	Color          (0.926 0.827 0.717)

	Surface
	{
		SurfStyle       0.561683
		OceanStyle      0.0224047
		Randomize      (-0.275, -0.888, -0.346)
		colorDistMagn   0.0630748
		colorDistFreq   1092.36
		detailScale     19131.8
		colorConversion true
		seaLevel        0.0758827
		snowLevel       2
		tropicLatitude  0.00179406
		icecapLatitude  10
		icecapHeight    0.220062
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        0.593476
		venusFreq       0.780052
		venusMagn       0
		mareFreq        2.39252
		mareDensity     0.205465
		terraceProb     0.293913
		erosion         0
		montesMagn      0.216428
		montesFreq      268.678
		montesSpiky     0.866135
		montesFraction  0.559082
		dunesMagn       0.0412614
		dunesFreq       48.1067
		dunesFraction   0.393653
		hillsMagn       0.115
		hillsFreq       692.764
		hillsFraction   0
		hills2Fraction  0
		riversMagn      59.3725
		riversFreq      3.52937
		riversSin       5.01343
		riversOctaves   0
		canyonsMagn     0.0613534
		canyonsFreq     219.279
		canyonFraction  0
		cracksMagn      0.11085
		cracksFreq      0.616565
		cracksOctaves   0
		craterMagn      0.8654
		craterFreq      20.0134
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.705588
		volcanoFreq     0.602729
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.903544
		volcanoRadius   0.514763
		volcanoTemp     1159.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1
		stripeTwist     3.5
		cycloneMagn     1.01404
		cycloneDensity  0.368571
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
		BumpHeight      13.8918
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
		Height          43.0107
		Velocity        105.316
		BumpHeight      5.63766
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.0005
		mainOctaves     10
		Coverage        0.26939
		stripeZones     1
		stripeTwist     3.5
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Venus"
		Height          176.79
		Density         352.391
		Pressure        819.468
		Greenhouse      548.547
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0
		Saturation      1

		Composition
		{
			CO2   	50.9928
			H2O   	37.651
			SO2   	10.6155
			N2    	0.736864
			CO    	0.00167016
			Ar    	0.00154477
			Ne    	0.000521663
			He    	7.63332e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.246225
		Period          0.119033
		Eccentricity    0.0421527
		Inclination     1.86148
		AscendingNode   176.832
		ArgOfPericenter 286.094
		MeanAnomaly     303.826
	}
}




Planet	"Ryloth/Twi'lek/Twi'lek Prime"
{
	ParentBody     "Ryloth System"
	Class	       "Terra"

	Mass            0.68851
	Radius          5324.38
	InertiaMoment   0.32878

	Obliquity       -0.918031
	EqAscendNode    54.8905
	TidalLocked     true

	AlbedoBond      0.346815
	AlbedoGeom      0.416178
	Brightness      2
	Color          (0.468 0.401 0.368)

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine/Terrestrial"
		Panspermia "false"
	}

	Surface
	{
		SurfStyle       0.561683
		OceanStyle      0.0224047
		Randomize      (1.044, -0.888, -0.346)
		colorDistMagn   0.0720633
		colorDistFreq   651.999
		detailScale     13694.6
		colorConversion true
		drivenDarkening -1
		seaLevel        0.0451818
		snowLevel       0.626984
		tropicLatitude  0.0284351
		icecapLatitude  0.777778
		icecapHeight    0.0793651
		climatePole     0.904762
		climateTropic   0
		climateEquator  0.31746
		heightTempGrad  0.600403
		tropicWidth     0.0741626
		mainFreq        1.3478
		venusFreq       0.736171
		venusMagn       0
		mareFreq        1.9734
		mareDensity     0.038469
		terraceProb     1
		erosion         0.120915
		montesMagn      0.216428
		montesFreq      192.321
		montesSpiky     0.866135
		montesFraction  0.559082
		dunesMagn       0.0412614
		dunesFreq       34.4349
		dunesFraction   0.393653
		hillsMagn       0.110927
		hillsFreq       495.882
		hillsFraction   0.916786
		hills2Fraction  0.867734
		riversMagn      100
		riversFreq      0
		riversSin       5.01343
		riversOctaves   0
		canyonsMagn     0.0765
		canyonsFreq     100
		canyonFraction  0.0898199
		cracksMagn      0.11085
		cracksFreq      0.441339
		cracksOctaves   0
		craterMagn      0.601098
		craterFreq      14.3256
		craterDensity   0
		craterOctaves   0
		craterRayedFactor 0
		volcanoMagn     0.674603
		volcanoFreq     0.460317
		volcanoDensity  0.198413
		volcanoOctaves  2
		volcanoActivity 0.722822
		volcanoFlows    0.903544
		volcanoRadius   0.325397
		volcanoTemp     1159.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1
		stripeFluct     0
		stripeTwist     3.5
		cycloneMagn     1.01404
		cycloneFreq     0
		cycloneDensity  0.368571
		cycloneOctaves  0
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
		BumpHeight      18.4127
		BumpOffset      0.83192
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
		Height          4.68945
		Velocity        85.316
		BumpHeight      4.6896
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.0005
		mainOctaves     10
		Coverage        0.134921
		stripeZones     1
		stripeFluct     0
		stripeTwist     3.5
	}

	Clouds
	{
		Height          9.37939
		Velocity        95.6097
		BumpHeight      4.6896
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.0005
		mainOctaves     10
		Coverage        0.134921
		stripeZones     1
		stripeFluct     0
		stripeTwist     3.5
	}

	Ocean
	{
		Height          0.83192
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
	}

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          59.4231
		Density         1.43477
		Pressure        1.11994
		Greenhouse      18.5223
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0
		Saturation      0.71377

		Composition
		{
			N2    	79.9496
			O2    	19.8641
			CO2   	0.09431
			H2O   	0.0791134
			Kr    	0.012821
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.903184
		Period          0.836246
		Eccentricity    0.035618
		Inclination     -0.918031
		AscendingNode   54.8905
		ArgOfPericenter 96.4361
		MeanAnomaly     72.6841
	}
}




DwarfMoon	"Ryloth D1"
{
	ParentBody     "Ryloth"
	Class	       "Asteroid"

	Mass            3.12273e-009
	Radius          10.7615
	InertiaMoment   0.398588	Obliquity       -0.0037685
	EqAscendNode    -5.28249
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.666 0.662 0.659)

	Surface
	{
		SurfStyle       0.288669
		OceanStyle      0.603583
		Randomize      (-0.812, 0.195, 0.483)
		colorDistMagn   0.680367
		colorDistFreq   0.0541772
		detailScale     293.862
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.3669
		terraceProb     0.128256
		erosion         0
		montesMagn      0.457051
		montesFreq      2.78629
		montesSpiky     0.970154
		montesFraction  0.547268
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.264206
		hillsFraction   0.664402
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223489
		craterFreq      0.199262
		craterDensity   0.874495
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.522515
		volcanoTemp     1611.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.267, 0.265, 0.264, 0.000)
		colorShelf     (0.283, 0.281, 0.280, 0.000)
		colorBeach     (0.300, 0.298, 0.297, 0.000)
		colorDesert    (0.316, 0.314, 0.313, 0.000)
		colorLowland   (0.333, 0.331, 0.329, 0.000)
		colorUpland    (0.350, 0.347, 0.346, 0.000)
		colorRock      (0.366, 0.364, 0.362, 0.000)
		colorSnow      (0.383, 0.380, 0.379, 1.000)
		BumpHeight      9.68539
		BumpOffset      1.93708
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.69763e-004
		Eccentricity    4.06015e-005
		Inclination     -0.0037685
		AscendingNode   -5.28249
		ArgOfPericenter 125.856
		MeanAnomaly     -116.91
	}
}



DwarfMoon	"Ryloth D2"
{
	ParentBody     "Ryloth"
	Class	       "Asteroid"

	Mass            4.33192e-009
	Radius          20.9693
	InertiaMoment   0.399571

	Obliquity       0.00474043
	EqAscendNode    -123.265
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.470 0.468 0.465)

	Surface
	{
		SurfStyle       0.844756
		OceanStyle      0.47847
		Randomize      (0.007, -0.235, 0.979)
		colorDistMagn   0.989029
		colorDistFreq   0.258619
		detailScale     572.601
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.66781
		terraceProb     0.31622
		erosion         0
		montesMagn      0.586079
		montesFreq      3.14666
		montesSpiky     0.997669
		montesFraction  0.500814
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.732424
		hillsFraction   0.634862
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.288913
		craterFreq      0.222733
		craterDensity   0.843551
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.507891
		volcanoTemp     1707.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.183, 0.159, 0.130, 0.000)
		colorShelf     (0.188, 0.164, 0.149, 0.000)
		colorBeach     (0.221, 0.192, 0.177, 0.000)
		colorDesert    (0.240, 0.206, 0.172, 0.000)
		colorLowland   (0.263, 0.220, 0.195, 0.000)
		colorUpland    (0.291, 0.267, 0.237, 0.000)
		colorRock      (0.315, 0.290, 0.256, 0.000)
		colorSnow      (0.343, 0.309, 0.270, 1.000)
		BumpHeight      18.8723
		BumpOffset      3.77447
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.19238e-004
		Eccentricity    7.67115e-005
		Inclination     0.00474043
		AscendingNode   -123.265
		ArgOfPericenter 174.272
		MeanAnomaly     -171.588
	}
}


DwarfMoon	"Ryloth D3"
{
	ParentBody     "Ryloth"
	Class	       "Asteroid"

	Mass            5.97156e-009
	Radius          15.4418
	InertiaMoment   0.397319

	Obliquity       0.0142714
	EqAscendNode    67.4388
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.695 0.691 0.690)

	Surface
	{
		SurfStyle       0.401174
		OceanStyle      0.893511
		Randomize      (0.952, -0.592, 0.448)
		colorDistMagn   0.696563
		colorDistFreq   0.0393911
		detailScale     421.665
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.418979
		terraceProb     0.528317
		erosion         0
		montesMagn      0.421937
		montesFreq      3.21265
		montesSpiky     0.965613
		montesFraction  0.701831
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.358193
		hillsFraction   0.583877
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258098
		craterFreq      0.271253
		craterDensity   0.743508
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.560011
		volcanoTemp     1685.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.278, 0.277, 0.276, 0.000)
		colorShelf     (0.295, 0.294, 0.293, 0.000)
		colorBeach     (0.313, 0.311, 0.310, 0.000)
		colorDesert    (0.330, 0.328, 0.328, 0.000)
		colorLowland   (0.347, 0.346, 0.345, 0.000)
		colorUpland    (0.365, 0.363, 0.362, 0.000)
		colorRock      (0.382, 0.380, 0.379, 0.000)
		colorSnow      (0.400, 0.398, 0.397, 1.000)
		BumpHeight      13.8976
		BumpOffset      2.77953
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.6201e-004
		Eccentricity    6.67642e-006
		Inclination     0.0142714
		AscendingNode   67.4388
		ArgOfPericenter 114.075
		MeanAnomaly     -153.821
	}
}


DwarfMoon	"Ryloth D4"
{
	ParentBody     "Ryloth"
	Class	       "Asteroid"

	Mass            8.18988e-009
	Radius          15.8846
	InertiaMoment   0.398744

	Obliquity       73.4302
	EqAscendNode    -15.0678
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.446 0.443 0.441)

	Surface
	{
		SurfStyle       0.322567
		OceanStyle      0.676529
		Randomize      (-0.161, -0.767, 0.392)
		colorDistMagn   0.867519
		colorDistFreq   0.0829065
		detailScale     433.756
		colorConversion true
		snowLevel       2
		tropicLatitude  0.592247
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.531057
		terraceProb     0.301516
		erosion         0
		montesMagn      0.378622
		montesFreq      2.60903
		montesSpiky     0.864061
		montesFraction  0.721583
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.666621
		hillsFraction   0.488113
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247065
		craterFreq      0.247487
		craterDensity   0.877222
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.500378
		volcanoTemp     1094.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.178, 0.177, 0.176, 0.000)
		colorShelf     (0.189, 0.188, 0.188, 0.000)
		colorBeach     (0.201, 0.199, 0.199, 0.000)
		colorDesert    (0.212, 0.210, 0.210, 0.000)
		colorLowland   (0.223, 0.221, 0.221, 0.000)
		colorUpland    (0.234, 0.233, 0.232, 0.000)
		colorRock      (0.245, 0.244, 0.243, 0.000)
		colorSnow      (0.256, 0.255, 0.254, 1.000)
		BumpHeight      14.2961
		BumpOffset      2.85923
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00061287
		Eccentricity    0.0234548
		Inclination     73.4302
		AscendingNode   -15.0678
		ArgOfPericenter 159.706
		MeanAnomaly     -144.556
	}
}

DwarfMoon	"Ryloth D5"
{
	ParentBody     "Ryloth"
	Class	       "Asteroid"

	Mass            6.17548e-009
	Radius          27.2239
	InertiaMoment   0.398151

	Obliquity       40.6293
	EqAscendNode    -86.3223
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.794 0.792 0.789)

	Surface
	{
		SurfStyle       0.440597
		OceanStyle      0.330156
		Randomize      (-0.511, 0.152, 0.804)
		colorDistMagn   0.14613
		colorDistFreq   0.275981
		detailScale     743.393
		colorConversion true
		snowLevel       2
		tropicLatitude  0.835961
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.260289
		terraceProb     0.358499
		erosion         0
		montesMagn      0.419896
		montesFreq      2.57929
		montesSpiky     0.930777
		montesFraction  0.638477
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.50839
		hillsFraction   0.799466
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257609
		craterFreq      0.241513
		craterDensity   0.956982
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.410208
		volcanoTemp     1476.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.318, 0.317, 0.315, 0.000)
		colorShelf     (0.338, 0.337, 0.335, 0.000)
		colorBeach     (0.357, 0.356, 0.355, 0.000)
		colorDesert    (0.377, 0.376, 0.375, 0.000)
		colorLowland   (0.397, 0.396, 0.394, 0.000)
		colorUpland    (0.417, 0.416, 0.414, 0.000)
		colorRock      (0.437, 0.435, 0.434, 0.000)
		colorSnow      (0.457, 0.455, 0.454, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00113544
		Eccentricity    0.293459
		Inclination     40.6293
		AscendingNode   -86.3223
		ArgOfPericenter -165.507
		MeanAnomaly     132.945
	}
}



Planet	"Or Tuma"
{
	ParentBody     "Ryloth System"
	Class	       "IceWorld"

	Mass            0.45162
	Radius          5543.4
	InertiaMoment   0.330039

	Oblateness      0.00121291

	RotationPeriod  47.8608
	Obliquity       44.7475
	EqAscendNode    -103.917

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.607 0.534 0.519)

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Terrestrial"
	}

	Surface
	{
		SurfStyle       0.706831
		OceanStyle      0.559082
		Randomize      (0.123, -0.955, -0.306)
		colorDistMagn   0.0894769
		colorDistFreq   746.061
		detailScale     14257.9
		colorConversion true
		drivenDarkening 0
		seaLevel        0.204797
		snowLevel       2
		tropicLatitude  0.703366
		icecapLatitude  1
		icecapHeight    0.204797
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.79636
		venusFreq       2
		venusMagn       0
		mareFreq        1.49299
		mareDensity     0.0450148
		terraceProb     0.104076
		erosion         0
		montesMagn      0.170502
		montesFreq      191.646
		montesSpiky     0.874806
		montesFraction  0.935653
		dunesMagn       0.0319952
		dunesFreq       7427.63
		dunesFraction   0.306559
		hillsMagn       0.143187
		hillsFreq       664.7
		hillsFraction   0.477895
		hills2Fraction  0.0328028
		riversMagn      61.4652
		riversFreq      1.85655
		riversSin       6.04813
		riversOctaves   0
		canyonsMagn     0.468904
		canyonsFreq     1.95176
		canyonFraction  0
		cracksMagn      0.0459892
		cracksFreq      1.3222
		cracksOctaves   6
		craterMagn      0.605333
		craterFreq      12.8842
		craterDensity   0.220071
		craterOctaves   3.08244
		craterRayedFactor 0.0529415
		volcanoMagn     0.593804
		volcanoFreq     0.77612
		volcanoDensity  0.27323
		volcanoOctaves  3
		volcanoActivity 0.604488
		volcanoFlows    0.256438
		volcanoRadius   0.495802
		volcanoTemp     1161.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.12008
		stripeTwist     0.227273
		cycloneMagn     2.51679
		cycloneFreq     0.582198
		cycloneDensity  0.304034
		cycloneOctaves  2
		colorSea       (0.327, 0.281, 0.224, 0.250)
		colorShelf     (0.357, 0.320, 0.254, 0.250)
		colorBeach     (0.291, 0.237, 0.194, 0.200)
		colorDesert    (0.271, 0.215, 0.170, 0.200)
		colorLowland   (0.199, 0.167, 0.140, 0.200)
		colorUpland    (0.378, 0.325, 0.254, 0.250)
		colorRock      (0.640, 0.630, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.199, 0.167, 0.140, 0.200)
		colorUpPlants  (0.378, 0.325, 0.254, 0.250)
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
		Height          13.2192
		Velocity        105.316
		BumpHeight      3.21906
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.03551
		mainOctaves     10
		Coverage        0.223114
		stripeZones     2.12008
		stripeTwist     0.227273
	}

	Clouds
	{
		Height          16.438
		Velocity        95.6097
		BumpHeight      3.21906
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.03551
		mainOctaves     10
		Coverage        0.223114
		stripeZones     2.12008
		stripeTwist     0.227273
	}

	Clouds
	{
		Height          19.6572
		Velocity        115.785
		BumpHeight      3.21906
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.03551
		mainOctaves     10
		Coverage        0.223114
		stripeZones     2.12008
		stripeTwist     0.227273
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Jupiter"
		Height          47.12
		Density         0.471913
		Pressure        0.194387
		Greenhouse      0.957792
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0
		Saturation      1

		Composition
		{
			O2    	91.5891
			N2    	8.06502
			CH4   	0.291402
			CO2   	0.0398158
			He    	0.0146225
		}
	}

	Aurora
	{
		Height      85.6148
		NorthLat    80.8353
		NorthLon    17.7541
		NorthRadius 1268.8
		NorthWidth  330.632
		NorthRings  4		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -88.7582
		SouthLon    217.086
		SouthRadius 1190.81
		SouthWidth  368.1
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
		SemiMajorAxis   2.80757
		Period          4.58317
		Eccentricity    0.074853
		Inclination     0.289553
		AscendingNode   -100.048
		ArgOfPericenter 162.421
		MeanAnomaly     57.4128
	}
}