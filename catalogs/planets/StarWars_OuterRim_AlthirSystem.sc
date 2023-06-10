// http://starwars.wikia.com/wiki/Althir_III
// Region : Outer Rim
// Sector : Rolion Sector
// Grid location : P6
// X : 7396.66, Y : 4729.53, Z : -89.14240410441118

Planet	"Althir III/Althir/Althir System 3"
{
	ParentBody     "Althir System"
	Class	       "Terra"

	Mass            10.4895
	Radius          7196.86
	InertiaMoment   0.185018

	Oblateness      0.0270376

	RotationPeriod  10.8226
	Obliquity       360
	EqAscendNode    -94.1904

	Albedo          0.367
	Brightness      2
	Color          (0.850 0.850 1.000)
	
	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Terrestrial"
		Panspermia "false"
	}

	Surface
	{
		SurfStyle       0.281727
		OceanStyle      0.253968
		Randomize      (-0.744, -0.264, -0.343)
		colorDistMagn   0.088243
		colorDistFreq   712.086
		detailScale     15741
		colorConversion true
		drivenDarkening -1
		seaLevel        0.190476
		snowLevel       0.85
		tropicLatitude  0.222222
		icecapLatitude  1
		icecapHeight    0
		climatePole     1
		climateTropic   0.261905
		climateEquator  0.579365
		heightTempGrad  0.625
		tropicWidth     1
		mainFreq        1.10867
		venusFreq       0.567718
		venusMagn       0
		mareFreq        7.13136
		mareDensity     0
		terraceProb     0.152944
		erosion         0.122618
		montesMagn      0.248268
		montesFreq      322.543
		montesSpiky     0.945314
		montesFraction  0.766763
		dunesMagn       0.0613039
		dunesFreq       55.3738
		dunesFraction   0.976803
		hillsMagn       0.103249
		hillsFreq       543.407
		hillsFraction   0.6266
		hills2Fraction  0.0131627
		riversMagn      58.7067
		riversFreq      3.45319
		riversSin       6.10827
		riversOctaves   2
		canyonsMagn     0.0288881
		canyonsFreq     100
		canyonFraction  0.879275
		cracksMagn      0.09291
		cracksFreq      0.570575
		cracksOctaves   0
		craterMagn      0.708916
		craterFreq      18.837
		craterDensity   0
		craterOctaves   0
		craterRayedFactor 0
		volcanoMagn     0.667777
		volcanoFreq     0.740522
		volcanoDensity  0.292145
		volcanoOctaves  3
		volcanoActivity 0.547033
		volcanoFlows    0.555535
		volcanoRadius   0.528679
		volcanoTemp     1415.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.53822
		stripeFluct     0
		stripeTwist     0
		cycloneMagn     2.71959
		cycloneFreq     0.684165
		cycloneDensity  0.195772
		cycloneOctaves  3
		colorSea       (0.040, 0.100, 0.200, 1.000)
		colorShelf     (0.150, 0.480, 0.460, 1.000)
		colorBeach     (0.740, 0.730, 0.610, 0.000)
		colorDesert    (0.450, 0.420, 0.380, 0.000)
		colorLowland   (0.480, 0.380, 0.280, 0.000)
		colorUpland    (0.600, 0.540, 0.420, 0.000)
		colorRock      (0.170, 0.160, 0.160, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.308)
		colorLowPlants (0.100, 0.160, 0.070, 0.000)
		colorUpPlants  (0.090, 0.110, 0.040, 0.000)
		BumpHeight      19.1905
		BumpOffset      0.907
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
		Height          5.66748
		Velocity        184.735
		BumpHeight      5.66729
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.04867
		mainOctaves     10
		Coverage        0.1
		stripeZones     1.53822
		stripeFluct     0
		stripeTwist     0
	}

	Ocean
	{
		Height          3.65505
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
	}

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          62
		Density         1.2929
		Pressure        1
		Greenhouse      10.087
		Bright          5
		Opacity         1
		SkyLight        3
		Hue             0
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
		Height      100
		NorthLat    82
		NorthLon    -113
		NorthRadius 2500
		NorthWidth  600
		NorthRings  3
		NorthBright 0.3
		NorthParticles 0
		SouthLat    -63
		SouthLon    138
		SouthRadius 2000
		SouthWidth  600
		SouthRings  3
		SouthBright 0.3
		SouthParticles 0
		TopColor    (0.500 0.500 0.500)
		BottomColor (0.000 1.000 0.000)
	}

	Rings
	{
		Texture        "J1407b-rings.png"
		InnerRadius     20000
		OuterRadius     3e+005
		RotationPeriod  472981
		RotationOffset  0
		FrontBright     2.22222
		BackBright      2.61905
		Density         0.372759
		Brightness      1.2452
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.75889
		Period          2.77952
		Eccentricity    0.0647962
		Inclination     0.905221
		AscendingNode   -89.2714
		ArgOfPericenter 338.436
		MeanAnomaly     237.744
	}
}

///////////////
// GENERATED //
///////////////

Planet	"Althir System 1"
{
	ParentBody     "Althir System"
	Class	       "Desert"

	Mass            1.35955
	Radius          7709.39
	InertiaMoment   0.330588

	Oblateness      0.00989714

	RotationPeriod  15.8537
	Obliquity       -10.3613
	EqAscendNode    17.7057

	AlbedoBond      0.7
	AlbedoGeom      0.84
	Brightness      2
	Color          (0.645 0.640 0.638)

	Surface
	{
		SurfStyle       0.118872
		OceanStyle      0.965626
		Randomize      (-0.620, 0.049, -0.825)
		colorDistMagn   0.0468229
		colorDistFreq   1111.97
		detailScale     19829
		colorConversion true
		seaLevel        0.171211
		snowLevel       2
		tropicLatitude  0.173927
		icecapLatitude  10
		icecapHeight    0.215556
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        0.254824
		venusFreq       1.26379
		venusMagn       0.295075
		mareFreq        1.61297
		mareDensity     0.178427
		terraceProb     0.187719
		erosion         0
		montesMagn      0.178121
		montesFreq      256.047
		montesSpiky     0.897434
		montesFraction  0.187452
		dunesMagn       0.0479393
		dunesFreq       60.7533
		dunesFraction   0.363677
		hillsMagn       0.123984
		hillsFreq       1132.22
		hillsFraction   0
		hills2Fraction  0
		riversMagn      58.7356
		riversFreq      2.64742
		riversSin       6.39391
		riversOctaves   0
		canyonsMagn     0.0275749
		canyonsFreq     206.319
		canyonFraction  0
		cracksMagn      0.0632167
		cracksFreq      0.608639
		cracksOctaves   0
		craterMagn      0.627915
		craterFreq      15.5739
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.738061
		volcanoFreq     0.767478
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.837196
		volcanoRadius   0.506764
		volcanoTemp     1821.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.84101
		stripeTwist     0
		cycloneMagn     3.25837
		cycloneFreq     1.06555
		cycloneDensity  0.385499
		cycloneOctaves  3
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
		Height          43.6572
		Velocity        168.298
		BumpHeight      5.64399
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.08604
		mainOctaves     10
		Coverage        1
		stripeZones     1.84101
		stripeTwist     0
	}

	Clouds
	{
		Height          77.3145
		Velocity        98.776
		BumpHeight      5.69542
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.08604
		mainOctaves     10
		Coverage        1
		stripeZones     1.84101
		stripeTwist     0
	}

	Clouds
	{
		Height          110.972
		Velocity        121.953
		BumpHeight      5.75009
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.08604
		mainOctaves     10
		Coverage        1
		stripeZones     1.84101
		stripeTwist     0
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          385.47
		Density         19.4922
		Pressure        80.6708
		Greenhouse      499.345
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0
		Saturation      1

		Composition
		{
			H2O   	68.6548
			CO2   	15.3741
			H2S   	5.61845
			C2H2  	5.22574
			NH3   	1.4921
			CH4   	1.42324
			C2H4  	1.12796
			SO2   	0.446414
			C2H6  	0.276519
			N2    	0.21225
			C3H8  	0.147929
			Ar    	0.000231258
			CO    	0.000226265
			Cl2   	4.74149e-005
		}
	}

	Aurora
	{
		Height      85.2269
		NorthLat    82.4215
		NorthLon    122.53
		NorthRadius 1505.76
		NorthWidth  485.337
		NorthRings  4
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -79.9347
		SouthLon    311.849
		SouthRadius 1880.18
		SouthWidth  655.946
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
		SemiMajorAxis   0.859611
		Period          0.483419
		Eccentricity    0.0714688
		Inclination     0.353416
		AscendingNode   12.2377
		ArgOfPericenter 344.534
		MeanAnomaly     354.943
	}
}

DwarfMoon	"Althir System 1.D1"
{
	ParentBody     "Althir System 1"
	Class	       "Asteroid"

	Mass            1.4577e-007
	Radius          41.5661
	InertiaMoment   0.398064

	Oblateness      0.200442

	Obliquity       0.00145316
	EqAscendNode    31.499
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.638 0.633 0.631)

	Surface
	{
		SurfStyle       0.961838
		OceanStyle      0.619434
		Randomize      (-0.297, 0.189, 0.404)
		colorDistMagn   0.368983
		colorDistFreq   1.0753
		detailScale     1135.03
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.615515
		terraceProb     0.331283
		erosion         0
		montesMagn      0.398112
		montesFreq      3.34932
		montesSpiky     0.946352
		montesFraction  0.737623
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.58824
		hillsFraction   0.542644
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213399
		craterFreq      0.230648
		craterDensity   0.877063
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.490959
		volcanoTemp     1383.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.217, 0.222, 0.252, 0.050)
		colorShelf     (0.255, 0.260, 0.290, 0.040)
		colorBeach     (0.293, 0.298, 0.328, 0.030)
		colorDesert    (0.332, 0.336, 0.372, 0.020)
		colorLowland   (0.370, 0.374, 0.410, 0.030)
		colorUpland    (0.408, 0.412, 0.448, 0.050)
		colorRock      (0.447, 0.450, 0.498, 0.020)
		colorSnow      (0.447, 0.450, 0.498, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000107231
		Period          0.000550757
		Eccentricity    6.577e-006
		Inclination     0.00145316
		AscendingNode   31.499
		ArgOfPericenter -177.754
		MeanAnomaly     -155.614
	}
}

DwarfMoon	"Althir System 1.D2"
{
	ParentBody     "Althir System 1"
	Class	       "Asteroid"

	Mass            2.00468e-007
	Radius          80.6777
	InertiaMoment   0.399183

	Oblateness      0.249

	Obliquity       0.0021344
	EqAscendNode    15.5935
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.777 0.735 0.720)

	Surface
	{
		SurfStyle       0.751806
		OceanStyle      0.547263
		Randomize      (-0.533, 0.794, 0.943)
		colorDistMagn   0.980299
		colorDistFreq   4.42172
		detailScale     2203.04
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.575845
		terraceProb     0.212311
		erosion         0
		montesMagn      0.453698
		montesFreq      2.19494
		montesSpiky     0.954913
		montesFraction  0.699762
		dunesFraction   0
		hillsMagn       0
		hillsFreq       19.2279
		hillsFraction   0.841814
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244313
		craterFreq      0.277274
		craterDensity   0.957183
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.521613
		volcanoTemp     1561.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.303, 0.250, 0.202, 0.000)
		colorShelf     (0.311, 0.257, 0.230, 0.000)
		colorBeach     (0.365, 0.301, 0.273, 0.000)
		colorDesert    (0.396, 0.323, 0.266, 0.000)
		colorLowland   (0.435, 0.345, 0.302, 0.000)
		colorUpland    (0.482, 0.419, 0.367, 0.000)
		colorRock      (0.521, 0.455, 0.396, 0.000)
		colorSnow      (0.567, 0.485, 0.417, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000141375
		Period          0.000833757
		Eccentricity    9.28421e-005
		Inclination     0.0021344
		AscendingNode   15.5935
		ArgOfPericenter -111.146
		MeanAnomaly     -93.0115
	}
}

DwarfMoon	"Althir System 1.D3"
{
	ParentBody     "Althir System 1"
	Class	       "Asteroid"

	Mass            2.77284e-007
	Radius          45.2474
	InertiaMoment   0.395736

	Oblateness      0.0298416

	Obliquity       0.0095598
	EqAscendNode    90.9333
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.743 0.640 0.575)

	Surface
	{
		SurfStyle       0.676662
		OceanStyle      0.28913
		Randomize      (-0.609, 0.883, -0.345)
		colorDistMagn   0.074439
		colorDistFreq   0.884422
		detailScale     1235.56
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.676692
		terraceProb     0.133635
		erosion         0
		montesMagn      0.510481
		montesFreq      2.53619
		montesSpiky     0.92511
		montesFraction  0.290013
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.36741
		hillsFraction   0.690321
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234581
		craterFreq      0.250176
		craterDensity   0.978419
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.535947
		volcanoTemp     1587.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.290, 0.218, 0.161, 0.000)
		colorShelf     (0.297, 0.224, 0.184, 0.000)
		colorBeach     (0.349, 0.262, 0.219, 0.000)
		colorDesert    (0.379, 0.282, 0.213, 0.000)
		colorLowland   (0.416, 0.301, 0.242, 0.000)
		colorUpland    (0.461, 0.365, 0.293, 0.000)
		colorRock      (0.498, 0.397, 0.316, 0.000)
		colorSnow      (0.542, 0.423, 0.334, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000177233
		Period          0.00117031
		Eccentricity    4.40168e-005
		Inclination     0.0095598
		AscendingNode   90.9333
		ArgOfPericenter 171.107
		MeanAnomaly     -26.172
	}
}

DwarfMoon	"Althir System 1.D4"
{
	ParentBody     "Althir System 1"
	Class	       "Asteroid"

	Mass            3.86249e-007
	Radius          111.388
	InertiaMoment   0.398255

	Obliquity       86.2404
	EqAscendNode    65.5277
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.428 0.423 0.418)

	Surface
	{
		SurfStyle       0.31223
		OceanStyle      0.114453
		Randomize      (0.161, -0.630, 0.925)
		colorDistMagn   0.929895
		colorDistFreq   5.95485
		detailScale     3041.63
		colorConversion true
		snowLevel       2
		tropicLatitude  0.912905
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.528266
		terraceProb     0.40653
		erosion         0
		montesMagn      0.539252
		montesFreq      3.06906
		montesSpiky     0.984709
		montesFraction  0.429242
		dunesFraction   0
		hillsMagn       0
		hillsFreq       22.6912
		hillsFraction   0.68979
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224693
		craterFreq      0.470587
		craterDensity   0.711947
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.561887
		volcanoTemp     1665.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.171, 0.169, 0.167, 0.000)
		colorShelf     (0.182, 0.180, 0.178, 0.000)
		colorBeach     (0.193, 0.190, 0.188, 0.000)
		colorDesert    (0.203, 0.201, 0.199, 0.000)
		colorLowland   (0.214, 0.211, 0.209, 0.000)
		colorUpland    (0.225, 0.222, 0.220, 0.000)
		colorRock      (0.235, 0.233, 0.230, 0.000)
		colorSnow      (0.246, 0.243, 0.240, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00126575
		Period          0.0223359
		Eccentricity    0.333135
		Inclination     86.2404
		AscendingNode   65.5277
		ArgOfPericenter 62.7116
		MeanAnomaly     152.321
	}
}

DwarfMoon	"Althir System 1.D5"
{
	ParentBody     "Althir System 1"
	Class	       "Asteroid"

	Mass            5.42636e-007
	Radius          65.0168
	InertiaMoment   0.399317

	RotationPeriod  736.936
	Obliquity       -9.97442
	EqAscendNode    -120.142

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.792 0.791 0.789)

	Surface
	{
		SurfStyle       0.486626
		OceanStyle      0.981716
		Randomize      (0.207, 0.834, -0.965)
		colorDistMagn   0.60877
		colorDistFreq   1.24609
		detailScale     1775.39
		colorConversion true
		snowLevel       2
		tropicLatitude  0.172189
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.384804
		terraceProb     0.181334
		erosion         0
		montesMagn      0.401875
		montesFreq      2.33509
		montesSpiky     0.902577
		montesFraction  0.32428
		dunesFraction   0
		hillsMagn       0
		hillsFreq       12.8556
		hillsFraction   0.559684
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.284999
		craterFreq      0.195956
		craterDensity   0.726833
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.555724
		volcanoTemp     1989.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.317, 0.316, 0.315, 0.000)
		colorShelf     (0.337, 0.336, 0.335, 0.000)
		colorBeach     (0.356, 0.356, 0.355, 0.000)
		colorDesert    (0.376, 0.376, 0.375, 0.000)
		colorLowland   (0.396, 0.395, 0.394, 0.000)
		colorUpland    (0.416, 0.415, 0.414, 0.000)
		colorRock      (0.436, 0.435, 0.434, 0.000)
		colorSnow      (0.455, 0.455, 0.453, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00147239
		Period          0.0280231
		Eccentricity    0.326082
		Inclination     -9.97442
		AscendingNode   -120.142
		ArgOfPericenter 59.4253
		MeanAnomaly     68.3736
	}
}

DwarfMoon	"Althir System 1.D6"
{
	ParentBody     "Althir System 1"
	Class	       "Asteroid"

	Mass            7.70174e-007
	Radius          68.7749
	InertiaMoment   0.396531

	RotationPeriod  609.258
	Obliquity       -85.6391
	EqAscendNode    -92.4341

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.465 0.460 0.455)

	Surface
	{
		SurfStyle       0.537479
		OceanStyle      0.483546
		Randomize      (0.109, -0.177, 0.500)
		colorDistMagn   0.500071
		colorDistFreq   1.59912
		detailScale     1878.01
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998847
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.511882
		terraceProb     0.152767
		erosion         0
		montesMagn      0.37691
		montesFreq      2.66544
		montesSpiky     0.996037
		montesFraction  0.833414
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.73993
		hillsFraction   0.660971
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231776
		craterFreq      0.253034
		craterDensity   1.01549
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.470764
		volcanoTemp     1644.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.181, 0.156, 0.127, 0.000)
		colorShelf     (0.186, 0.161, 0.146, 0.000)
		colorBeach     (0.218, 0.189, 0.173, 0.000)
		colorDesert    (0.237, 0.202, 0.168, 0.000)
		colorLowland   (0.260, 0.216, 0.191, 0.000)
		colorUpland    (0.288, 0.262, 0.232, 0.000)
		colorRock      (0.311, 0.285, 0.250, 0.000)
		colorSnow      (0.339, 0.304, 0.264, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00205885
		Period          0.0463359
		Eccentricity    0.302535
		Inclination     -85.6391
		AscendingNode   -92.4341
		ArgOfPericenter -109.929
		MeanAnomaly     100.758
	}
}

DwarfMoon	"Althir System 1.D7"
{
	ParentBody     "Althir System 1"
	Class	       "Asteroid"

	Mass            1.10659e-006
	Radius          136.775
	InertiaMoment   0.398431

	Obliquity       -22.1933
	EqAscendNode    -124.986
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.791 0.789 0.787)

	Surface
	{
		SurfStyle       0.777196
		OceanStyle      0.315892
		Randomize      (-0.325, 0.658, 0.315)
		colorDistMagn   0.481483
		colorDistFreq   10.2918
		detailScale     3734.86
		colorConversion true
		snowLevel       2
		tropicLatitude  0.343567
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.467718
		terraceProb     0.264004
		erosion         0
		montesMagn      0.587533
		montesFreq      2.58814
		montesSpiky     0.86407
		montesFraction  0.380149
		dunesFraction   0
		hillsMagn       0
		hillsFreq       52.1327
		hillsFraction   0.610864
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232861
		craterFreq      0.663692
		craterDensity   0.898525
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.466733
		volcanoTemp     1638.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.308, 0.268, 0.220, 0.000)
		colorShelf     (0.316, 0.276, 0.252, 0.000)
		colorBeach     (0.372, 0.323, 0.299, 0.000)
		colorDesert    (0.403, 0.347, 0.291, 0.000)
		colorLowland   (0.443, 0.371, 0.331, 0.000)
		colorUpland    (0.490, 0.449, 0.401, 0.000)
		colorRock      (0.530, 0.489, 0.433, 0.000)
		colorSnow      (0.577, 0.520, 0.457, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00226544
		Period          0.0534823
		Eccentricity    0.0762089
		Inclination     -22.1933
		AscendingNode   -124.986
		ArgOfPericenter -4.88215
		MeanAnomaly     171.69
	}
}

DwarfMoon	"Althir System 1.D8"
{
	ParentBody     "Althir System 1"
	Class	       "Asteroid"

	Mass            1.61346e-006
	Radius          103.605
	InertiaMoment   0.399448

	Obliquity       -83.171
	EqAscendNode    -99.8065
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.762 0.646 0.590)

	Surface
	{
		SurfStyle       0.955967
		OceanStyle      0.432665
		Randomize      (-0.269, -0.285, 0.971)
		colorDistMagn   0.682047
		colorDistFreq   8.47086
		detailScale     2829.12
		colorConversion true
		snowLevel       2
		tropicLatitude  0.983289
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.446249
		terraceProb     0.196317
		erosion         0
		montesMagn      0.481388
		montesFreq      2.98881
		montesSpiky     0.917628
		montesFraction  0.509628
		dunesFraction   0
		hillsMagn       0
		hillsFreq       24.2345
		hillsFraction   0.562877
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263004
		craterFreq      0.425321
		craterDensity   0.990595
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.475359
		volcanoTemp     1325.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.259, 0.226, 0.236, 0.050)
		colorShelf     (0.305, 0.265, 0.272, 0.040)
		colorBeach     (0.350, 0.304, 0.307, 0.030)
		colorDesert    (0.396, 0.342, 0.348, 0.020)
		colorLowland   (0.442, 0.381, 0.384, 0.030)
		colorUpland    (0.488, 0.420, 0.419, 0.050)
		colorRock      (0.533, 0.459, 0.466, 0.020)
		colorSnow      (0.533, 0.459, 0.466, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00262906
		Period          0.0668625
		Eccentricity    0.154645
		Inclination     -83.171
		AscendingNode   -99.8065
		ArgOfPericenter 28.3255
		MeanAnomaly     -118.603
	}
}

DwarfMoon	"Althir System 1.D9"
{
	ParentBody     "Althir System 1"
	Class	       "Asteroid"

	Mass            2.39448e-006
	Radius          194.415
	InertiaMoment   0.396993

	Obliquity       -69.5575
	EqAscendNode    95.3879
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.488 0.482 0.478)

	Surface
	{
		SurfStyle       0.986191
		OceanStyle      0.0268633
		Randomize      (0.558, 0.876, -0.281)
		colorDistMagn   0.278987
		colorDistFreq   32.5326
		detailScale     5308.83
		colorConversion true
		snowLevel       2
		tropicLatitude  0.978881
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.571528
		terraceProb     0.399393
		erosion         0
		montesMagn      0.559019
		montesFreq      2.95807
		montesSpiky     0.87424
		montesFraction  0.675446
		dunesFraction   0
		hillsMagn       0
		hillsFreq       102.374
		hillsFraction   0.79218
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.273383
		craterFreq      1.20917
		craterDensity   1.05195
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.503677
		volcanoTemp     1612.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.166, 0.169, 0.191, 0.050)
		colorShelf     (0.195, 0.198, 0.220, 0.040)
		colorBeach     (0.225, 0.227, 0.249, 0.030)
		colorDesert    (0.254, 0.255, 0.282, 0.020)
		colorLowland   (0.283, 0.284, 0.311, 0.030)
		colorUpland    (0.312, 0.313, 0.339, 0.050)
		colorRock      (0.342, 0.342, 0.378, 0.020)
		colorSnow      (0.342, 0.342, 0.378, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0030944
		Period          0.0853782
		Eccentricity    0.398522
		Inclination     -69.5575
		AscendingNode   95.3879
		ArgOfPericenter -62.8673
		MeanAnomaly     128.609
	}
}

Planet	"Althir System 2"
{
	ParentBody     "Althir System"
	Class	       "Desert"

	Mass            6.59121
	Radius          9360.74
	InertiaMoment   0.331889

	Oblateness      0.0119828

	RotationPeriod  8.77582
	Obliquity       -13.1464
	EqAscendNode    6.49496

	AlbedoBond      0.7
	AlbedoGeom      0.84
	Brightness      2
	Color          (0.608 0.606 0.603)

	Surface
	{
		SurfStyle       0.956371
		OceanStyle      0.90821
		Randomize      (0.074, 0.908, 0.674)
		colorDistMagn   0.0476388
		colorDistFreq   1070.54
		detailScale     24076.3
		colorConversion true
		seaLevel        0.0429473
		snowLevel       2
		tropicLatitude  0.25893
		icecapLatitude  10
		icecapHeight    0.263991
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        0.725068
		venusFreq       0.669316
		venusMagn       0.368052
		mareFreq        1.71459
		mareDensity     0.204336
		terraceProb     0.239971
		erosion         0
		montesMagn      0.240289
		montesFreq      447.365
		montesSpiky     0.946121
		montesFraction  0.577273
		dunesMagn       0.0480878
		dunesFreq       94.2025
		dunesFraction   0.207769
		hillsMagn       0.167558
		hillsFreq       1016.95
		hillsFraction   0
		hills2Fraction  0
		riversMagn      54.8641
		riversFreq      3.98012
		riversSin       4.6418
		riversOctaves   0
		canyonsMagn     0.0411703
		canyonsFreq     214.903
		canyonFraction  0
		cracksMagn      0.118718
		cracksFreq      0.599019
		cracksOctaves   0
		craterMagn      1.0387
		craterFreq      20.8474
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.742602
		volcanoFreq     0.674474
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.721012
		volcanoRadius   0.461754
		volcanoTemp     1505.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.47142
		stripeTwist     0
		cycloneMagn     2.00223
		cycloneFreq     0.648784
		cycloneDensity  0.266485
		cycloneOctaves  2
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
		BumpHeight      11.4331
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
		Height          35.7773
		Velocity        76.9795
		BumpHeight      5.96489
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.04883
		mainOctaves     10
		Coverage        1
		stripeZones     2.47142
		stripeTwist     0
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Venus"
		Height          103.532
		Density         471.133
		Pressure        934.836
		Greenhouse      531.886
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.49267
		Saturation      0.585341

		Composition
		{
			CO2   	92.4161
			H2O   	6.60048
			N2    	0.530434
			SO2   	0.452314
			Ar    	0.000440404
			He    	0.000136202
			CO    	6.35199e-005
			Ne    	3.19457e-005
		}
	}

	Aurora
	{
		Height      111.673
		NorthLat    73.8201
		NorthLon    -115.111
		NorthRadius 2522.68
		NorthWidth  926.242
		NorthRings  3
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -74.3928
		SouthLon    58.8784
		SouthRadius 2486.84
		SouthWidth  747.001
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
		SemiMajorAxis   1.5526
		Period          1.17344
		Eccentricity    0.0904502
		Inclination     -1.87921
		AscendingNode   8.7115
		ArgOfPericenter 240.598
		MeanAnomaly     152.524
	}
}

DwarfMoon	"Althir System 2.D1"
{
	ParentBody     "Althir System 2"
	Class	       "Asteroid"

	Mass            4.99326e-010
	Radius          11.3217
	InertiaMoment   0.399801

	Oblateness      0.249

	Obliquity       3.78812e-005
	EqAscendNode    46.5595
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.726 0.677 0.603)

	Surface
	{
		SurfStyle       0.768864
		OceanStyle      0.0549662
		Randomize      (-0.702, 0.878, -0.622)
		colorDistMagn   0.757352
		colorDistFreq   0.10569
		detailScale     309.158
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.607847
		terraceProb     0.100207
		erosion         0
		montesMagn      0.476896
		montesFreq      2.42153
		montesSpiky     0.819273
		montesFraction  0.497216
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.216538
		hillsFraction   0.676588
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242034
		craterFreq      0.230608
		craterDensity   0.975772
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.45948
		volcanoTemp     1377.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.283, 0.230, 0.169, 0.000)
		colorShelf     (0.290, 0.237, 0.193, 0.000)
		colorBeach     (0.341, 0.278, 0.229, 0.000)
		colorDesert    (0.370, 0.298, 0.223, 0.000)
		colorLowland   (0.407, 0.318, 0.253, 0.000)
		colorUpland    (0.450, 0.386, 0.307, 0.000)
		colorRock      (0.486, 0.420, 0.331, 0.000)
		colorSnow      (0.530, 0.447, 0.349, 1.000)
		BumpHeight      10.1895
		BumpOffset      2.03791
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000226075
		Period          0.000765731
		Eccentricity    5.4062e-005
		Inclination     3.78812e-005
		AscendingNode   46.5595
		ArgOfPericenter 63.9258
		MeanAnomaly     -104.131
	}
}

DwarfMoon	"Althir System 2.D2"
{
	ParentBody     "Althir System 2"
	Class	       "Asteroid"

	Mass            7.349e-010
	Radius          6.66118
	InertiaMoment   0.397797

	Oblateness      0.039278

	Obliquity       -0.0144709
	EqAscendNode    35.6752
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.780 0.779 0.777)

	Surface
	{
		SurfStyle       0.213211
		OceanStyle      0.958266
		Randomize      (0.898, 0.595, 0.527)
		colorDistMagn   0.472472
		colorDistFreq   0.0355751
		detailScale     181.895
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000488281
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.512676
		terraceProb     0.115577
		erosion         0
		montesMagn      0.490463
		montesFreq      3.7308
		montesSpiky     0.95964
		montesFraction  0.539723
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.100263
		hillsFraction   0.762696
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254233
		craterFreq      0.268069
		craterDensity   1.00408
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.54751
		volcanoTemp     1700.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.312, 0.311, 0.311, 0.000)
		colorShelf     (0.331, 0.331, 0.330, 0.000)
		colorBeach     (0.351, 0.350, 0.350, 0.000)
		colorDesert    (0.370, 0.370, 0.369, 0.000)
		colorLowland   (0.390, 0.389, 0.389, 0.000)
		colorUpland    (0.409, 0.409, 0.408, 0.000)
		colorRock      (0.429, 0.428, 0.427, 0.000)
		colorSnow      (0.448, 0.448, 0.447, 1.000)
		BumpHeight      5.99506
		BumpOffset      1.19901
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000291923
		Period          0.00112357
		Eccentricity    4.98066e-005
		Inclination     -0.0144709
		AscendingNode   35.6751
		ArgOfPericenter 44.4359
		MeanAnomaly     -96.1206
	}
}

DwarfMoon	"Althir System 2.D3"
{
	ParentBody     "Althir System 2"
	Class	       "Asteroid"

	Mass            1.06416e-009
	Radius          13.1989
	InertiaMoment   0.39901

	Oblateness      0.137745

	Obliquity       -0.97878
	EqAscendNode    176.53
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.701 0.696 0.693)

	Surface
	{
		SurfStyle       0.708786
		OceanStyle      0.166735
		Randomize      (0.757, -0.283, -0.028)
		colorDistMagn   0.956868
		colorDistFreq   0.0694965
		detailScale     360.418
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0010358
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.661039
		terraceProb     0.150823
		erosion         0
		montesMagn      0.330363
		montesFreq      3.69893
		montesSpiky     0.859648
		montesFraction  0.583549
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.475887
		hillsFraction   0.445544
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228668
		craterFreq      0.25309
		craterDensity   0.806952
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.485823
		volcanoTemp     1369.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.273, 0.237, 0.194, 0.000)
		colorShelf     (0.280, 0.244, 0.222, 0.000)
		colorBeach     (0.330, 0.285, 0.263, 0.000)
		colorDesert    (0.358, 0.306, 0.256, 0.000)
		colorLowland   (0.393, 0.327, 0.291, 0.000)
		colorUpland    (0.435, 0.397, 0.353, 0.000)
		colorRock      (0.470, 0.432, 0.381, 0.000)
		colorSnow      (0.512, 0.459, 0.402, 1.000)
		BumpHeight      11.879
		BumpOffset      2.3758
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000337037
		Period          0.00139384
		Eccentricity    0.0282085
		Inclination     -0.97878
		AscendingNode   176.53
		ArgOfPericenter -62.3152
		MeanAnomaly     -151.987
	}
}

Moon	"Althir System 2.1"
{
	ParentBody     "Althir System 2"
	Class	       "Selena"

	Mass            0.00903326
	Radius          1580.38
	InertiaMoment   0.379808

	Oblateness      0.00863669

	Obliquity       0.171164
	EqAscendNode    -138.994
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.521 0.514 0.512)

	Surface
	{
		SurfStyle       0.311633
		OceanStyle      0.913308
		Randomize      (0.331, -0.650, 0.002)
		colorDistMagn   0.0746487
		colorDistFreq   188.215
		detailScale     4064.81
		colorConversion true
		drivenDarkening 0
		seaLevel        0.210989
		snowLevel       2
		tropicLatitude  0.00210018
		icecapLatitude  10
		icecapHeight    0.163551
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.74858
		venusFreq       1.27435
		venusMagn       0
		mareFreq        0.648708
		mareDensity     0.00337469
		terraceProb     0.371947
		erosion         0
		montesMagn      0.0808754
		montesFreq      92.2741
		montesSpiky     0.925758
		montesFraction  0.541254
		dunesMagn       0.0488764
		dunesFreq       2072.58
		dunesFraction   0.143497
		hillsMagn       0.114241
		hillsFreq       154.625
		hillsFraction   0.173034
		hills2Fraction  0
		riversMagn      48.759
		riversFreq      2.62352
		riversSin       5.49912
		riversOctaves   0
		canyonsMagn     0.518098
		canyonsFreq     0.619009
		canyonFraction  0.991276
		cracksMagn      0.0415839
		cracksFreq      0.560616
		cracksOctaves   0
		craterMagn      0.559629
		craterFreq      5.38373
		craterDensity   0.601101
		craterOctaves   8.2681
		craterRayedFactor 0.102369
		volcanoMagn     0.220475
		volcanoFreq     0.643696
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.301906
		volcanoRadius   0.147394
		volcanoTemp     1604.38
		lavaCoverTidal  0.27595
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.420, 0.420, 0.430, 0.000)
		colorShelf     (0.470, 0.480, 0.480, 0.000)
		colorBeach     (0.286, 0.293, 0.307, 0.000)
		colorDesert    (0.250, 0.237, 0.235, 0.000)
		colorLowland   (0.318, 0.314, 0.287, 0.000)
		colorUpland    (0.339, 0.334, 0.312, 0.000)
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
		SemiMajorAxis   0.000486387
		Period          0.00241475
		Eccentricity    0.0146116
		Inclination     0.171164
		AscendingNode   -138.994
		ArgOfPericenter 176.697
		MeanAnomaly     126.358
	}
}

Moon	"Althir System 2.2"
{
	ParentBody     "Althir System 2"
	Class	       "Selena"

	Mass            0.0107596
	Radius          1470.72
	InertiaMoment   0.375298

	Oblateness      0.00191243

	Obliquity       -0.321886
	EqAscendNode    -71.9503
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.505 0.501 0.497)

	Surface
	{
		SurfStyle       0.954205
		OceanStyle      0.671916
		Randomize      (0.724, -0.744, -0.836)
		colorDistMagn   0.0555488
		colorDistFreq   170.633
		detailScale     3782.77
		colorConversion true
		drivenDarkening 0
		seaLevel        0.198313
		snowLevel       2
		tropicLatitude  0.00909558
		icecapLatitude  10
		icecapHeight    0.204826
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.59576
		venusFreq       1.19355
		venusMagn       0
		mareFreq        0.598233
		mareDensity     0.00584062
		terraceProb     0.286498
		erosion         0
		montesMagn      0.0469388
		montesFreq      72.0177
		montesSpiky     0.89255
		montesFraction  0.477425
		dunesMagn       0.0384673
		dunesFreq       1946.01
		dunesFraction   0.332888
		hillsMagn       0.124474
		hillsFreq       167.322
		hillsFraction   0.893451
		hills2Fraction  0
		riversMagn      61.2544
		riversFreq      1.13352
		riversSin       5.69871
		riversOctaves   0
		canyonsMagn     0.236188
		canyonsFreq     0.373088
		canyonFraction  0.896487
		cracksMagn      0.060407
		cracksFreq      0.377191
		cracksOctaves   0
		craterMagn      0.543413
		craterFreq      3.8164
		craterDensity   0.846783
		craterOctaves   11
		craterRayedFactor 0.0925349
		volcanoMagn     0.19876
		volcanoFreq     0.586643
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.343554
		volcanoRadius   0.16117
		volcanoTemp     1471.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.390, 0.400, 0.160, 0.000)
		colorShelf     (0.580, 0.550, 0.240, 0.000)
		colorBeach     (0.358, 0.340, 0.209, 0.000)
		colorDesert    (0.414, 0.380, 0.214, 0.000)
		colorLowland   (0.318, 0.275, 0.154, 0.000)
		colorUpland    (0.298, 0.255, 0.144, 0.000)
		colorRock      (0.330, 0.240, 0.130, 0.000)
		colorSnow      (0.900, 0.890, 0.760, 1.000)
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
		SemiMajorAxis   0.000701917
		Period          0.00418573
		Eccentricity    0.00411202
		Inclination     -0.321886
		AscendingNode   -71.9503
		ArgOfPericenter 156.287
		MeanAnomaly     -32.8941
	}
}

DwarfMoon	"Althir System 3.D1"
{
	ParentBody     "Althir System 3"
	Class	       "Asteroid"

	Mass            4.36375e-008
	Radius          27.1153
	InertiaMoment   0.39679

	Oblateness      0.0752483

	Obliquity       -0.00245879
	EqAscendNode    29.004
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.670 0.664 0.662)

	Surface
	{
		SurfStyle       0.103491
		OceanStyle      0.890044
		Randomize      (-0.066, 0.939, 0.443)
		colorDistMagn   0.570728
		colorDistFreq   0.345334
		detailScale     740.428
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.571316
		terraceProb     0.233395
		erosion         0
		montesMagn      0.491061
		montesFreq      2.09411
		montesSpiky     0.796798
		montesFraction  0.693481
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.71585
		hillsFraction   0.700877
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237788
		craterFreq      0.145576
		craterDensity   0.809736
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.451466
		volcanoTemp     1456.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.268, 0.266, 0.265, 0.000)
		colorShelf     (0.285, 0.282, 0.281, 0.000)
		colorBeach     (0.301, 0.299, 0.298, 0.000)
		colorDesert    (0.318, 0.316, 0.314, 0.000)
		colorLowland   (0.335, 0.332, 0.331, 0.000)
		colorUpland    (0.352, 0.349, 0.347, 0.000)
		colorRock      (0.368, 0.365, 0.364, 0.000)
		colorSnow      (0.385, 0.382, 0.380, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000885971
		Period          0.000863546
		Eccentricity    9.28457e-005
		Inclination     -0.00245879
		AscendingNode   29.004
		ArgOfPericenter -89.4923
		MeanAnomaly     -158.219
	}
}

DwarfMoon	"Althir System 3.D2"
{
	ParentBody     "Althir System 3"
	Class	       "Asteroid"

	Mass            5.92746e-008
	Radius          28.2916
	InertiaMoment   0.398517

	Oblateness      0.050546

	Obliquity       0.00831536
	EqAscendNode    -121.186
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.431 0.426 0.423)

	Surface
	{
		SurfStyle       0.868074
		OceanStyle      0.751848
		Randomize      (-0.440, 0.256, -0.862)
		colorDistMagn   0.4208
		colorDistFreq   0.404373
		detailScale     772.55
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.539486
		terraceProb     0.414232
		erosion         0
		montesMagn      0.4818
		montesFreq      3.85148
		montesSpiky     0.884193
		montesFraction  0.478392
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.9715
		hillsFraction   0.465587
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247655
		craterFreq      0.264016
		craterDensity   0.876533
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.529947
		volcanoTemp     1324.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.147, 0.149, 0.169, 0.050)
		colorShelf     (0.172, 0.175, 0.195, 0.040)
		colorBeach     (0.198, 0.200, 0.220, 0.030)
		colorDesert    (0.224, 0.226, 0.250, 0.020)
		colorLowland   (0.250, 0.251, 0.275, 0.030)
		colorUpland    (0.276, 0.277, 0.301, 0.050)
		colorRock      (0.302, 0.302, 0.335, 0.020)
		colorSnow      (0.302, 0.302, 0.335, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000908298
		Period          0.000966625
		Eccentricity    5.67253e-005
		Inclination     0.00831536
		AscendingNode   -121.186
		ArgOfPericenter 96.0318
		MeanAnomaly     113.867
	}
}

DwarfMoon	"Althir System 3.D3"
{
	ParentBody     "Althir System 3"
	Class	       "Asteroid"

	Mass            8.06595e-008
	Radius          41.7655
	InertiaMoment   0.399515

	Oblateness      0.0909588

	Obliquity       -0.00979957
	EqAscendNode    -11.7467
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.682 0.583 0.519)

	Surface
	{
		SurfStyle       0.2269
		OceanStyle      0.138988
		Randomize      (0.650, -0.765, -0.385)
		colorDistMagn   0.954963
		colorDistFreq   1.3725
		detailScale     1140.48
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.302975
		terraceProb     0.45678
		erosion         0
		montesMagn      0.523724
		montesFreq      3.64744
		montesSpiky     0.935937
		montesFraction  0.452263
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.66766
		hillsFraction   0.72162
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251902
		craterFreq      0.224433
		craterDensity   0.919107
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.393531
		volcanoTemp     1760.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.273, 0.233, 0.208, 0.000)
		colorShelf     (0.290, 0.248, 0.221, 0.000)
		colorBeach     (0.307, 0.262, 0.234, 0.000)
		colorDesert    (0.324, 0.277, 0.247, 0.000)
		colorLowland   (0.341, 0.292, 0.260, 0.000)
		colorUpland    (0.358, 0.306, 0.273, 0.000)
		colorRock      (0.375, 0.321, 0.286, 0.000)
		colorSnow      (0.392, 0.335, 0.299, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000938083
		Period          0.00111004
		Eccentricity    3.05964e-006
		Inclination     -0.00979957
		AscendingNode   -11.7467
		ArgOfPericenter 167.397
		MeanAnomaly     145.229
	}
}

DwarfMoon	"Althir System 3.D4"
{
	ParentBody     "Althir System 3"
	Class	       "Asteroid"

	Mass            1.10057e-007
	Radius          71.2525
	InertiaMoment   0.397179

	Oblateness      0.249

	Obliquity       -0.00948404
	EqAscendNode    2.18576
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.753 0.752 0.750)

	Surface
	{
		SurfStyle       0.2947
		OceanStyle      0.413131
		Randomize      (-0.992, -0.498, -0.028)
		colorDistMagn   0.795879
		colorDistFreq   4.04463
		detailScale     1945.67
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.281309
		terraceProb     0.146447
		erosion         0
		montesMagn      0.254229
		montesFreq      2.73301
		montesSpiky     0.987275
		montesFraction  0.220193
		dunesFraction   0
		hillsMagn       0
		hillsFreq       10.6672
		hillsFraction   0.372798
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230497
		craterFreq      0.219213
		craterDensity   1.02802
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.47075
		volcanoTemp     1198.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.301, 0.301, 0.300, 0.000)
		colorShelf     (0.320, 0.319, 0.319, 0.000)
		colorBeach     (0.339, 0.338, 0.337, 0.000)
		colorDesert    (0.358, 0.357, 0.356, 0.000)
		colorLowland   (0.377, 0.376, 0.375, 0.000)
		colorUpland    (0.396, 0.395, 0.394, 0.000)
		colorRock      (0.414, 0.413, 0.412, 0.000)
		colorSnow      (0.433, 0.432, 0.431, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000967455
		Period          0.00125779
		Eccentricity    6.41072e-005
		Inclination     -0.00948404
		AscendingNode   2.18576
		ArgOfPericenter -43.255
		MeanAnomaly     177.909
	}
}

Moon	"Althir System 3.1"
{
	ParentBody     "Althir System 3"
	Class	       "Selena"

	Mass            0.00140425
	Radius          855.931
	InertiaMoment   0.3992

	Oblateness      0.00714297

	Obliquity       0.428306
	EqAscendNode    137.362
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.878 0.697 0.455)

	Surface
	{
		SurfStyle       0.810892
		OceanStyle      0.826296
		Randomize      (0.413, -0.520, -0.271)
		colorDistMagn   0.0461147
		colorDistFreq   116.279
		detailScale     2201.5
		colorConversion true
		drivenDarkening 0
		seaLevel        0.115179
		snowLevel       2
		tropicLatitude  0.00543725
		icecapLatitude  10
		icecapHeight    0.154857
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.6436
		venusFreq       1.31978
		venusMagn       0
		mareFreq        0.168602
		mareDensity     0.00084232
		terraceProb     0.457491
		erosion         0
		montesMagn      0.060703
		montesFreq      35.453
		montesSpiky     0.969914
		montesFraction  0.12695
		dunesMagn       0.0447392
		dunesFreq       1137
		dunesFraction   0.971131
		hillsMagn       0.107329
		hillsFreq       93.5039
		hillsFraction   0.337791
		hills2Fraction  0
		riversMagn      56.2756
		riversFreq      1.83331
		riversSin       6.4667
		riversOctaves   0
		canyonsMagn     0.313889
		canyonsFreq     0.337335
		canyonFraction  0.580531
		cracksMagn      0.0214588
		cracksFreq      0.480914
		cracksOctaves   0
		craterMagn      0.619231
		craterFreq      2.45183
		craterDensity   0.648098
		craterOctaves   8.87778
		craterRayedFactor 0.0526579
		volcanoMagn     0.12917
		volcanoFreq     0.529572
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.255026
		volcanoRadius   0.133871
		volcanoTemp     1036.39
		lavaCoverTidal  0.124691
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.400, 0.350, 0.320, 0.000)
		colorShelf     (0.470, 0.410, 0.380, 0.000)
		colorBeach     (0.301, 0.251, 0.223, 0.000)
		colorDesert    (0.274, 0.235, 0.197, 0.000)
		colorLowland   (0.209, 0.182, 0.149, 0.000)
		colorUpland    (0.355, 0.321, 0.276, 0.000)
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
		SemiMajorAxis   0.001224049
		Period          0.00278357
		Eccentricity    0.0209149
		Inclination     0.428306
		AscendingNode   137.362
		ArgOfPericenter -0.429312
		MeanAnomaly     120.814
	}
}

Moon	"Althir System 3.2"
{
	ParentBody     "Althir System 3"
	Class	       "Selena"

	Mass            0.00164099
	Radius          791.941
	InertiaMoment   0.398671

	Oblateness      0.00108909

	Obliquity       -0.199109
	EqAscendNode    68.02
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.948 0.820 0.590)

	Surface
	{
		SurfStyle       0.23552
		OceanStyle      0.701891
		Randomize      (0.873, 0.960, -0.154)
		colorDistMagn   0.0539469
		colorDistFreq   93.7605
		detailScale     2036.92
		colorConversion true
		drivenDarkening 0
		seaLevel        0.191787
		snowLevel       2
		tropicLatitude  0.00575673
		icecapLatitude  10
		icecapHeight    0.162583
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.66736
		venusFreq       1.63804
		venusMagn       0
		mareFreq        0.167635
		mareDensity     0.00189938
		terraceProb     0.439707
		erosion         0
		montesMagn      0.0505035
		montesFreq      41.0169
		montesSpiky     0.914474
		montesFraction  0.0310362
		dunesMagn       0.0480525
		dunesFreq       1069.41
		dunesFraction   0.77424
		hillsMagn       0.129869
		hillsFreq       78.2493
		hillsFraction   0.280975
		hills2Fraction  0
		riversMagn      55.3361
		riversFreq      2.93427
		riversSin       7.08766
		riversOctaves   0
		canyonsMagn     0.474431
		canyonsFreq     0.301502
		canyonFraction  0.528249
		cracksMagn      0.0314086
		cracksFreq      0.421687
		cracksOctaves   0
		craterMagn      0.588822
		craterFreq      2.28423
		craterDensity   0.985107
		craterOctaves   10
		craterRayedFactor 0.0774133
		volcanoMagn     0.152564
		volcanoFreq     0.582548
		volcanoDensity  0.39283
		volcanoOctaves  3
		volcanoActivity 1.44247
		volcanoFlows    0.240198
		volcanoRadius   0.167612
		volcanoTemp     1526.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.320, 0.320, 0.000)
		colorShelf     (0.370, 0.370, 0.370, 0.000)
		colorBeach     (0.402, 0.358, 0.327, 0.000)
		colorDesert    (0.499, 0.430, 0.373, 0.200)
		colorLowland   (0.539, 0.459, 0.419, 0.500)
		colorUpland    (0.563, 0.480, 0.432, 0.800)
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
		SemiMajorAxis   0.00902543
		Period          0.00586311
		Eccentricity    0.0280771
		Inclination     -0.199109
		AscendingNode   68.02
		ArgOfPericenter -71.0574
		MeanAnomaly     -72.1333
	}
}

Moon	"Althir System 3.3"
{
	ParentBody     "Althir System 3"
	Class	       "Selena"

	Mass            0.0192591
	Radius          1583.67
	InertiaMoment   0.362471

	Obliquity       -1.23615
	EqAscendNode    -45.8394
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.974 0.857 0.620)

	Surface
	{
		SurfStyle       0.917999
		OceanStyle      0.572793
		Randomize      (0.573, -0.858, -0.710)
		colorDistMagn   0.046032
		colorDistFreq   235.422
		detailScale     4073.29
		colorConversion true
		drivenDarkening 0
		seaLevel        0.21754
		snowLevel       2
		tropicLatitude  0.0397324
		icecapLatitude  10
		icecapHeight    0.113752
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.02393
		venusFreq       0.482194
		venusMagn       0
		mareFreq        0.734049
		mareDensity     0.0142892
		terraceProb     0.293909
		erosion         0
		montesMagn      0.0809213
		montesFreq      70.5882
		montesSpiky     0.810043
		montesFraction  0.893464
		dunesMagn       0.0320488
		dunesFreq       2046.72
		dunesFraction   0.331237
		hillsMagn       0.100556
		hillsFreq       162.091
		hillsFraction   0.936804
		hills2Fraction  0
		riversMagn      65.5391
		riversFreq      3.32631
		riversSin       6.59161
		riversOctaves   0
		canyonsMagn     0.422521
		canyonsFreq     0.553241
		canyonFraction  0.0243251
		cracksMagn      0.0717357
		cracksFreq      0.532444
		cracksOctaves   0
		craterMagn      0.675052
		craterFreq      4.42904
		craterDensity   0.906559
		craterOctaves   11
		craterRayedFactor 0.106244
		volcanoMagn     0.195755
		volcanoFreq     0.591652
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.369342
		volcanoRadius   0.126234
		volcanoTemp     1317.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.440, 0.450, 0.370, 0.000)
		colorShelf     (0.580, 0.550, 0.430, 0.000)
		colorBeach     (0.542, 0.502, 0.439, 0.000)
		colorDesert    (0.633, 0.586, 0.485, 0.000)
		colorLowland   (0.503, 0.441, 0.364, 0.000)
		colorUpland    (0.450, 0.396, 0.341, 0.000)
		colorRock      (0.330, 0.250, 0.230, 0.000)
		colorSnow      (0.940, 0.910, 0.870, 1.000)
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
		Height          79.1836
		Density         1.00322e-007
		Pressure        3.96202e-008
		Greenhouse      0.00168303
		Bright          0.631364
		Opacity         0
		SkyLight        0.210455
		Hue             -0.0128064
		Saturation      1

		Composition
		{
			Cl2   	55.362
			Kr    	36.8189
			Xe    	7.8191
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00968498
		Period          0.0123394
		Eccentricity    0.0125312
		Inclination     -1.23615
		AscendingNode   -45.8394
		ArgOfPericenter -169.503
		MeanAnomaly     -102.206
	}
}

DwarfMoon	"Althir System 3.D5"
{
	ParentBody     "Althir System 3"
	Class	       "Asteroid"

	Mass            4.00194e-007
	Radius          62.1647
	InertiaMoment   0.398829

	RotationPeriod  4551.64
	Obliquity       52.5599
	EqAscendNode    -54.2011

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.509 0.505 0.502)

	Surface
	{
		SurfStyle       0.725247
		OceanStyle      0.622888
		Randomize      (0.477, -0.070, 0.096)
		colorDistMagn   0.935214
		colorDistFreq   1.29101
		detailScale     1697.51
		colorConversion true
		snowLevel       2
		tropicLatitude  1
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.743277
		terraceProb     0.567025
		erosion         0
		montesMagn      0.544329
		montesFreq      2.6151
		montesSpiky     0.953925
		montesFraction  0.539941
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.09031
		hillsFraction   0.727862
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218726
		craterFreq      0.236834
		craterDensity   0.868749
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.462658
		volcanoTemp     1731.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.198, 0.172, 0.140, 0.000)
		colorShelf     (0.203, 0.177, 0.161, 0.000)
		colorBeach     (0.239, 0.207, 0.191, 0.000)
		colorDesert    (0.259, 0.222, 0.186, 0.000)
		colorLowland   (0.285, 0.237, 0.211, 0.000)
		colorUpland    (0.315, 0.288, 0.256, 0.000)
		colorRock      (0.341, 0.313, 0.276, 0.000)
		colorSnow      (0.371, 0.333, 0.291, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00808492
		Period          0.129812
		Eccentricity    0.274374
		Inclination     52.5599
		AscendingNode   -54.2011
		ArgOfPericenter 144.028
		MeanAnomaly     -81.2506
	}
}

DwarfMoon	"Althir System 3.D6"
{
	ParentBody     "Althir System 3"
	Class	       "Asteroid"

	Mass            5.62787e-007
	Radius          117.86
	InertiaMoment   0.399769

	Obliquity       0.0763123
	EqAscendNode    -53.5755
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.547 0.391 0.313)

	Surface
	{
		SurfStyle       0.977919
		OceanStyle      0.458373
		Randomize      (0.535, 0.927, 0.641)
		colorDistMagn   0.677016
		colorDistFreq   6.11766
		detailScale     3218.35
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00236703
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.713603
		terraceProb     0.100946
		erosion         0
		montesMagn      0.462203
		montesFreq      2.4141
		montesSpiky     0.989156
		montesFraction  0.738734
		dunesFraction   0
		hillsMagn       0
		hillsFreq       32.1275
		hillsFraction   0.652889
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240104
		craterFreq      0.485377
		craterDensity   1.00264
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.521195
		volcanoTemp     1447.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.186, 0.137, 0.125, 0.050)
		colorShelf     (0.219, 0.160, 0.144, 0.040)
		colorBeach     (0.252, 0.184, 0.163, 0.030)
		colorDesert    (0.285, 0.207, 0.185, 0.020)
		colorLowland   (0.317, 0.230, 0.203, 0.030)
		colorUpland    (0.350, 0.254, 0.222, 0.050)
		colorRock      (0.383, 0.277, 0.247, 0.020)
		colorSnow      (0.383, 0.277, 0.247, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.01255908
		Period          0.141398
		Eccentricity    0.0244147
		Inclination     0.0763123
		AscendingNode   -53.5755
		ArgOfPericenter -10.1877
		MeanAnomaly     84.0514
	}
}

DwarfMoon	"Althir System 3.D7"
{
	ParentBody     "Althir System 3"
	Class	       "Asteroid"

	Mass            7.99726e-007
	Radius          68.5461
	InertiaMoment   0.397738

	RotationPeriod  2759.17
	Obliquity       36.4814
	EqAscendNode    -24.9426

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.745 0.744 0.741)

	Surface
	{
		SurfStyle       0.872168
		OceanStyle      0.401254
		Randomize      (0.770, 0.242, -0.019)
		colorDistMagn   0.0948251
		colorDistFreq   1.82993
		detailScale     1871.77
		colorConversion true
		snowLevel       2
		tropicLatitude  0.945383
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.591642
		terraceProb     0.410802
		erosion         0
		montesMagn      0.614934
		montesFreq      2.95932
		montesSpiky     0.936184
		montesFraction  0.586216
		dunesFraction   0
		hillsMagn       0
		hillsFreq       16.0096
		hillsFraction   0.714314
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231269
		craterFreq      0.231623
		craterDensity   0.949725
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.464379
		volcanoTemp     1732.95
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.253, 0.260, 0.297, 0.050)
		colorShelf     (0.298, 0.305, 0.341, 0.040)
		colorBeach     (0.343, 0.349, 0.386, 0.030)
		colorDesert    (0.388, 0.394, 0.437, 0.020)
		colorLowland   (0.432, 0.439, 0.482, 0.030)
		colorUpland    (0.477, 0.483, 0.526, 0.050)
		colorRock      (0.522, 0.528, 0.586, 0.020)
		colorSnow      (0.522, 0.528, 0.586, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.01719256
		Period          0.157383
		Eccentricity    0.389107
		Inclination     36.4814
		AscendingNode   -24.9426
		ArgOfPericenter -154.996
		MeanAnomaly     -149.66
	}
}

DwarfMoon	"Althir System 3.D8"
{
	ParentBody     "Althir System 3"
	Class	       "Asteroid"

	Mass            1.15069e-006
	Radius          71.7414
	InertiaMoment   0.398974

	Obliquity       42.2136
	EqAscendNode    -128.529
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.657 0.523 0.430)

	Surface
	{
		SurfStyle       0.00314893
		OceanStyle      0.706696
		Randomize      (0.780, 0.378, 0.334)
		colorDistMagn   0.795187
		colorDistFreq   1.60504
		detailScale     1959.02
		colorConversion true
		snowLevel       2
		tropicLatitude  0.558114
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.524052
		terraceProb     0.784424
		erosion         0
		montesMagn      0.584701
		montesFreq      1.89231
		montesSpiky     0.969977
		montesFraction  0.472934
		dunesFraction   0
		hillsMagn       0
		hillsFreq       10.3497
		hillsFraction   0.44625
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.27042
		craterFreq      0.191598
		craterDensity   0.671887
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.587195
		volcanoTemp     1665.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.263, 0.209, 0.172, 0.000)
		colorShelf     (0.279, 0.222, 0.183, 0.000)
		colorBeach     (0.295, 0.235, 0.193, 0.000)
		colorDesert    (0.312, 0.248, 0.204, 0.000)
		colorLowland   (0.328, 0.261, 0.215, 0.000)
		colorUpland    (0.345, 0.274, 0.226, 0.000)
		colorRock      (0.361, 0.288, 0.236, 0.000)
		colorSnow      (0.378, 0.301, 0.247, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.01746514
		Period          0.164434
		Eccentricity    0.0396605
		Inclination     42.2136
		AscendingNode   -128.529
		ArgOfPericenter -50.2367
		MeanAnomaly     -87.9932
	}
}

DwarfMoon	"Althir System 3.D9"
{
	ParentBody     "Althir System 3"
	Class	       "Asteroid"

	Mass            1.68064e-006
	Radius          101.714
	InertiaMoment   0.399894

	RotationPeriod  4518.98
	Obliquity       -44.1828
	EqAscendNode    166.511

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.489 0.484 0.480)

	Surface
	{
		SurfStyle       0.730553
		OceanStyle      0.37544
		Randomize      (0.277, 0.029, 0.029)
		colorDistMagn   0.988712
		colorDistFreq   7.74342
		detailScale     2777.47
		colorConversion true
		snowLevel       2
		tropicLatitude  0.163152
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.606248
		terraceProb     0.263786
		erosion         0
		montesMagn      0.459724
		montesFreq      2.49355
		montesSpiky     0.99676
		montesFraction  0.661727
		dunesFraction   0
		hillsMagn       0
		hillsFreq       21.296
		hillsFraction   0.762636
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236594
		craterFreq      0.315791
		craterDensity   0.878341
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.534626
		volcanoTemp     1622.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.191, 0.165, 0.135, 0.000)
		colorShelf     (0.195, 0.169, 0.154, 0.000)
		colorBeach     (0.230, 0.199, 0.183, 0.000)
		colorDesert    (0.249, 0.213, 0.178, 0.000)
		colorLowland   (0.274, 0.228, 0.202, 0.000)
		colorUpland    (0.303, 0.276, 0.245, 0.000)
		colorRock      (0.327, 0.300, 0.264, 0.000)
		colorSnow      (0.357, 0.320, 0.279, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.01774728
		Period          0.171841
		Eccentricity    0.364427
		Inclination     -44.1828
		AscendingNode   166.511
		ArgOfPericenter -144.076
		MeanAnomaly     81.454
	}
}

DwarfMoon	"Althir System 3.D10"
{
	ParentBody     "Althir System 3"
	Class	       "Asteroid"

	Mass            2.49935e-006
	Radius          107.285
	InertiaMoment   0.397961

	RotationPeriod  1046
	Obliquity       72.1278
	EqAscendNode    -138.779

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.629 0.516 0.459)

	Surface
	{
		SurfStyle       0.624459
		OceanStyle      0.304661
		Randomize      (0.372, 0.631, 0.794)
		colorDistMagn   0.813234
		colorDistFreq   5.81281
		detailScale     2929.59
		colorConversion true
		snowLevel       2
		tropicLatitude  0.631325
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.573239
		terraceProb     0.230063
		erosion         0
		montesMagn      0.411159
		montesFreq      3.76944
		montesSpiky     0.83762
		montesFraction  0.421923
		dunesFraction   0
		hillsMagn       0
		hillsFreq       22.9668
		hillsFraction   0.835009
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237752
		craterFreq      0.42994
		craterDensity   0.709141
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.439994
		volcanoTemp     1241.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.245, 0.175, 0.129, 0.000)
		colorShelf     (0.251, 0.180, 0.147, 0.000)
		colorBeach     (0.295, 0.211, 0.174, 0.000)
		colorDesert    (0.321, 0.227, 0.170, 0.000)
		colorLowland   (0.352, 0.242, 0.193, 0.000)
		colorUpland    (0.390, 0.294, 0.234, 0.000)
		colorRock      (0.421, 0.320, 0.253, 0.000)
		colorSnow      (0.459, 0.340, 0.266, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0700158
		Period          0.178991
		Eccentricity    0.44251
		Inclination     72.1278
		AscendingNode   -138.779
		ArgOfPericenter 25.0122
		MeanAnomaly     -31.534
	}
}

DwarfMoon	"Althir System 3.D11"
{
	ParentBody     "Althir System 3"
	Class	       "Asteroid"

	Mass            3.79941e-006
	Radius          215.232
	InertiaMoment   0.399114

	RotationPeriod  2754.25
	Obliquity       75.0095
	EqAscendNode    100.203

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.477 0.406 0.355)

	Surface
	{
		SurfStyle       0.502352
		OceanStyle      0.135996
		Randomize      (0.113, 0.785, 0.266)
		colorDistMagn   0.570243
		colorDistFreq   32.8908
		detailScale     5877.27
		colorConversion true
		snowLevel       2
		tropicLatitude  0.972672
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.66919
		terraceProb     0.53302
		erosion         0
		montesMagn      0.415648
		montesFreq      2.928
		montesSpiky     0.984032
		montesFraction  0.848142
		dunesFraction   0
		hillsMagn       0
		hillsFreq       87.6885
		hillsFraction   0.725415
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.200757
		craterFreq      1.66742
		craterDensity   0.825877
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.512534
		volcanoTemp     1683.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.186, 0.138, 0.099, 0.000)
		colorShelf     (0.191, 0.142, 0.114, 0.000)
		colorBeach     (0.224, 0.166, 0.135, 0.000)
		colorDesert    (0.244, 0.178, 0.131, 0.000)
		colorLowland   (0.267, 0.191, 0.149, 0.000)
		colorUpland    (0.296, 0.231, 0.181, 0.000)
		colorRock      (0.320, 0.251, 0.195, 0.000)
		colorSnow      (0.349, 0.268, 0.206, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0703683
		Period          0.188522
		Eccentricity    0.397353
		Inclination     75.0095
		AscendingNode   100.203
		ArgOfPericenter 70.6843
		MeanAnomaly     -161.052
	}
}

DwarfMoon	"Althir System 3.D12"
{
	ParentBody     "Althir System 3"
	Class	       "Asteroid"

	Mass            5.93395e-006
	Radius          125.8
	InertiaMoment   0.394675

	RotationPeriod  280.747
	Obliquity       -0.899613
	EqAscendNode    164.811

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.595 0.589 0.588)

	Surface
	{
		SurfStyle       0.550726
		OceanStyle      0.950243
		Randomize      (0.023, 0.996, 0.305)
		colorDistMagn   0.711148
		colorDistFreq   10.4261
		detailScale     3435.18
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00515592
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.572736
		terraceProb     0.377472
		erosion         0
		montesMagn      0.594787
		montesFreq      2.63543
		montesSpiky     0.976312
		montesFraction  0.546096
		dunesFraction   0
		hillsMagn       0
		hillsFreq       51.0825
		hillsFraction   0.767668
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235299
		craterFreq      0.357116
		craterDensity   0.971225
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.512524
		volcanoTemp     1593.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.232, 0.200, 0.165, 0.000)
		colorShelf     (0.238, 0.206, 0.188, 0.000)
		colorBeach     (0.279, 0.242, 0.223, 0.000)
		colorDesert    (0.303, 0.259, 0.217, 0.000)
		colorLowland   (0.333, 0.277, 0.247, 0.000)
		colorUpland    (0.369, 0.336, 0.300, 0.000)
		colorRock      (0.398, 0.365, 0.323, 0.000)
		colorSnow      (0.434, 0.389, 0.341, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0706444
		Period          0.196103
		Eccentricity    0.473998
		Inclination     -1.03324
		AscendingNode   164.291
		ArgOfPericenter -11.4436
		MeanAnomaly     160.468
	}
}

DwarfMoon	"Althir System 3.D13"
{
	ParentBody     "Althir System 3"
	Class	       "Asteroid"

	Mass            1.92029e-011
	Radius          2.32746
	InertiaMoment   0.39816

	RotationPeriod  3684.04
	Obliquity       -39.537
	EqAscendNode    30.3658

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.778 0.648 0.599)

	Surface
	{
		SurfStyle       0.90244
		OceanStyle      0.640074
		Randomize      (-0.877, -0.478, 0.041)
		colorDistMagn   0.864644
		colorDistFreq   0.00346588
		detailScale     63.5553
		colorConversion true
		snowLevel       2
		tropicLatitude  0.96949
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.653198
		terraceProb     0.115236
		erosion         0
		montesMagn      0.423898
		montesFreq      1.67122
		montesSpiky     0.948099
		montesFraction  0.435841
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0101606
		hillsFraction   0.489036
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257935
		craterFreq      0.241932
		craterDensity   0.998437
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.528734
		volcanoTemp     1100.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.265, 0.227, 0.239, 0.050)
		colorShelf     (0.311, 0.266, 0.275, 0.040)
		colorBeach     (0.358, 0.305, 0.311, 0.030)
		colorDesert    (0.405, 0.344, 0.353, 0.020)
		colorLowland   (0.452, 0.383, 0.389, 0.030)
		colorUpland    (0.498, 0.421, 0.425, 0.050)
		colorRock      (0.545, 0.460, 0.473, 0.020)
		colorSnow      (0.545, 0.460, 0.473, 1.000)
		BumpHeight      2.09472
		BumpOffset      0.418944
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0711464
		Period          0.210137
		Eccentricity    0.261199
		Inclination     -39.537
		AscendingNode   30.3658
		ArgOfPericenter -47.222
		MeanAnomaly     -47.299
	}
}

DwarfMoon	"Althir System 3.D14"
{
	ParentBody     "Althir System 3"
	Class	       "Asteroid"

	Mass            3.67922e-011
	Radius          2.65381
	InertiaMoment   0.39925

	RotationPeriod  1297.85
	Obliquity       -25.2418
	EqAscendNode    -16.3291

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.578 0.573 0.570)

	Surface
	{
		SurfStyle       0.79179
		OceanStyle      0.0194762
		Randomize      (-0.658, 0.786, -0.963)
		colorDistMagn   0.332036
		colorDistFreq   0.0031649
		detailScale     72.4668
		colorConversion true
		snowLevel       2
		tropicLatitude  0.765333
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.486148
		terraceProb     0.116003
		erosion         0
		montesMagn      0.493581
		montesFreq      3.11124
		montesSpiky     0.944447
		montesFraction  0.203823
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0183995
		hillsFraction   0.73691
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223037
		craterFreq      0.234257
		craterDensity   0.831467
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.448886
		volcanoTemp     1514.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.226, 0.195, 0.160, 0.000)
		colorShelf     (0.231, 0.200, 0.182, 0.000)
		colorBeach     (0.272, 0.235, 0.217, 0.000)
		colorDesert    (0.295, 0.252, 0.211, 0.000)
		colorLowland   (0.324, 0.269, 0.239, 0.000)
		colorUpland    (0.359, 0.326, 0.291, 0.000)
		colorRock      (0.388, 0.355, 0.313, 0.000)
		colorSnow      (0.422, 0.378, 0.331, 1.000)
		BumpHeight      2.38843
		BumpOffset      0.477686
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0715651
		Period          0.222087
		Eccentricity    0.342623
		Inclination     -25.2418
		AscendingNode   -16.3291
		ArgOfPericenter 82.2113
		MeanAnomaly     -133.728
	}
}

DwarfMoon	"Althir System 3.D15"
{
	ParentBody     "Althir System 3"
	Class	       "Asteroid"

	Mass            6.53084e-011
	Radius          3.02413
	InertiaMoment   0.396202

	Obliquity       29.683
	EqAscendNode    -130.316
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.718 0.663 0.579)

	Surface
	{
		SurfStyle       0.162129
		OceanStyle      0.771824
		Randomize      (-0.496, 0.460, -0.021)
		colorDistMagn   0.727921
		colorDistFreq   0.00262298
		detailScale     82.5788
		colorConversion true
		snowLevel       2
		tropicLatitude  0.406982
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.397559
		terraceProb     0.275953
		erosion         0
		montesMagn      0.453393
		montesFreq      2.29832
		montesSpiky     0.882164
		montesFraction  0.64926
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0201547
		hillsFraction   0.58034
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226535
		craterFreq      0.156613
		craterDensity   0.765745
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.492125
		volcanoTemp     1765.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.287, 0.265, 0.232, 0.000)
		colorShelf     (0.305, 0.282, 0.246, 0.000)
		colorBeach     (0.323, 0.298, 0.260, 0.000)
		colorDesert    (0.341, 0.315, 0.275, 0.000)
		colorLowland   (0.359, 0.332, 0.289, 0.000)
		colorUpland    (0.377, 0.348, 0.304, 0.000)
		colorRock      (0.395, 0.365, 0.318, 0.000)
		colorSnow      (0.413, 0.381, 0.333, 1.000)
		BumpHeight      2.72171
		BumpOffset      0.544343
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.072108
		Period          0.23791
		Eccentricity    0.351887
		Inclination     29.683
		AscendingNode   -130.316
		ArgOfPericenter -149.171
		MeanAnomaly     174.208
	}
}

DwarfMoon	"Althir System 3.D16"
{
	ParentBody     "Althir System 3"
	Class	       "Asteroid"

	Mass            1.09651e-010
	Radius          6.33522
	InertiaMoment   0.398344

	Obliquity       79.5366
	EqAscendNode    172.305
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.612 0.607 0.604)

	Surface
	{
		SurfStyle       0.276533
		OceanStyle      0.885593
		Randomize      (-0.174, -0.368, 0.527)
		colorDistMagn   0.319723
		colorDistFreq   0.0281492
		detailScale     172.994
		colorConversion true
		snowLevel       2
		tropicLatitude  0.13168
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.697565
		terraceProb     0.112688
		erosion         0
		montesMagn      0.618386
		montesFreq      2.49398
		montesSpiky     0.93511
		montesFraction  0.835074
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0949228
		hillsFraction   0.505413
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236605
		craterFreq      0.204287
		craterDensity   0.937039
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.56107
		volcanoTemp     1331.24
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.245, 0.243, 0.242, 0.000)
		colorShelf     (0.260, 0.258, 0.257, 0.000)
		colorBeach     (0.275, 0.273, 0.272, 0.000)
		colorDesert    (0.291, 0.288, 0.287, 0.000)
		colorLowland   (0.306, 0.304, 0.302, 0.000)
		colorUpland    (0.321, 0.319, 0.317, 0.000)
		colorRock      (0.337, 0.334, 0.332, 0.000)
		colorSnow      (0.352, 0.349, 0.347, 1.000)
		BumpHeight      5.7017
		BumpOffset      1.14034
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0727088
		Period          0.255834
		Eccentricity    0.182228
		Inclination     79.5366
		AscendingNode   172.305
		ArgOfPericenter -139.397
		MeanAnomaly     127.022
	}
}

DwarfMoon	"Althir System 3.D17"
{
	ParentBody     "Althir System 3"
	Class	       "Asteroid"

	Mass            1.76483e-010
	Radius          4.96503
	InertiaMoment   0.399382

	RotationPeriod  2164.06
	Obliquity       -29.9348
	EqAscendNode    -148.185

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.522 0.519 0.513)

	Surface
	{
		SurfStyle       0.186032
		OceanStyle      0.794589
		Randomize      (-0.730, -0.809, -0.987)
		colorDistMagn   0.130123
		colorDistFreq   0.0136382
		detailScale     135.579
		colorConversion true
		snowLevel       2
		tropicLatitude  0.270974
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.575303
		terraceProb     0.109122
		erosion         0
		montesMagn      0.442125
		montesFreq      4.11112
		montesSpiky     0.974604
		montesFraction  0.493885
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0557022
		hillsFraction   0.677115
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237692
		craterFreq      0.212038
		craterDensity   0.91211
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.444007
		volcanoTemp     1521.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.209, 0.208, 0.205, 0.000)
		colorShelf     (0.222, 0.221, 0.218, 0.000)
		colorBeach     (0.235, 0.233, 0.231, 0.000)
		colorDesert    (0.248, 0.246, 0.244, 0.000)
		colorLowland   (0.261, 0.259, 0.257, 0.000)
		colorUpland    (0.274, 0.272, 0.269, 0.000)
		colorRock      (0.287, 0.285, 0.282, 0.000)
		colorSnow      (0.300, 0.298, 0.295, 1.000)
		BumpHeight      4.46853
		BumpOffset      0.893706
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0731521
		Period          0.269336
		Eccentricity    0.0945167
		Inclination     -29.935
		AscendingNode   -148.185
		ArgOfPericenter 142.122
		MeanAnomaly     -142.972
	}
}

DwarfMoon	"Althir System 3.D18"
{
	ParentBody     "Althir System 3"
	Class	       "Asteroid"

	Mass            2.74811e-010
	Radius          5.23801
	InertiaMoment   0.39678

	RotationPeriod  1254.04
	Obliquity       13.1994
	EqAscendNode    165.948

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.727 0.672 0.640)

	Surface
	{
		SurfStyle       0.900348
		OceanStyle      0.250033
		Randomize      (-0.465, 0.146, -0.721)
		colorDistMagn   0.845322
		colorDistFreq   0.0125436
		detailScale     143.033
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0556318
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.683455
		terraceProb     0.461364
		erosion         0
		montesMagn      0.546652
		montesFreq      2.85592
		montesSpiky     0.900082
		montesFraction  0.386021
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0753046
		hillsFraction   0.641916
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.270629
		craterFreq      0.228406
		craterDensity   0.987648
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.5249
		volcanoTemp     1453.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.247, 0.235, 0.256, 0.050)
		colorShelf     (0.291, 0.276, 0.294, 0.040)
		colorBeach     (0.334, 0.316, 0.333, 0.030)
		colorDesert    (0.378, 0.356, 0.378, 0.020)
		colorLowland   (0.421, 0.397, 0.416, 0.030)
		colorUpland    (0.465, 0.437, 0.454, 0.050)
		colorRock      (0.509, 0.477, 0.506, 0.020)
		colorSnow      (0.509, 0.477, 0.506, 1.000)
		BumpHeight      4.71421
		BumpOffset      0.942842
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0734468
		Period          0.278439
		Eccentricity    0.00411093
		Inclination     13.1523
		AscendingNode   165.977
		ArgOfPericenter 24.4952
		MeanAnomaly     13.0439
	}
}

DwarfPlanet	"Althir System 4"
{
	ParentBody     "Althir System"
	Class	       "Selena"

	Mass            0.0130926
	Radius          1568.26
	InertiaMoment   0.369864

	Oblateness      0.00207178

	RotationPeriod  34.8337
	Obliquity       45.1795
	EqAscendNode    -34.5454

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.627 0.472 0.361)

	Surface
	{
		SurfStyle       0.664712
		OceanStyle      0.0936459
		Randomize      (-0.598, -0.433, 0.029)
		colorDistMagn   0.0790899
		colorDistFreq   163.442
		detailScale     4033.65
		colorConversion true
		drivenDarkening 0
		seaLevel        0.301734
		snowLevel       2
		tropicLatitude  0.731729
		icecapLatitude  10
		icecapHeight    0.146918
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.09091
		venusFreq       1.00006
		venusMagn       0
		mareFreq        0.702602
		mareDensity     0.00823741
		terraceProb     0.348297
		erosion         0
		montesMagn      0.0500509
		montesFreq      63.4046
		montesSpiky     0.887181
		montesFraction  0.125483
		dunesMagn       0.024923
		dunesFreq       2104.63
		dunesFraction   0.679682
		hillsMagn       0.120346
		hillsFreq       180.401
		hillsFraction   0.175854
		hills2Fraction  0
		riversMagn      53.8289
		riversFreq      2.96433
		riversSin       6.25636
		riversOctaves   0
		canyonsMagn     0.460165
		canyonsFreq     0.53078
		canyonFraction  0.025111
		cracksMagn      0.0405237
		cracksFreq      0.484214
		cracksOctaves   0
		craterMagn      0.518355
		craterFreq      5.02437
		craterDensity   0.885393
		craterOctaves   11
		craterRayedFactor 0.201011
		volcanoMagn     0.220436
		volcanoFreq     0.618621
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 1.77438
		volcanoFlows    0.21597
		volcanoRadius   0.180295
		volcanoTemp     1505.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.430, 0.400, 0.370, 0.000)
		colorShelf     (0.620, 0.600, 0.530, 0.000)
		colorBeach     (0.389, 0.288, 0.195, 0.000)
		colorDesert    (0.407, 0.293, 0.198, 0.000)
		colorLowland   (0.320, 0.217, 0.151, 0.000)
		colorUpland    (0.470, 0.335, 0.224, 0.000)
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
		SemiMajorAxis   5.01139
		Period          6.8047
		Eccentricity    0.0183997
		Inclination     -1.70611
		AscendingNode   -26.9181
		ArgOfPericenter 308.211
		MeanAnomaly     68.8273
	}
}

DwarfMoon	"Althir System 4.D1"
{
	ParentBody     "Althir System 4"
	Class	       "Asteroid"

	Mass            8.16272e-009
	Radius          15.7831
	InertiaMoment   0.399737

	Oblateness      0.249

	Obliquity       -0.00441476
	EqAscendNode    -152.243
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.770 0.722 0.663)

	Surface
	{
		SurfStyle       0.100161
		OceanStyle      0.225296
		Randomize      (0.482, 0.809, -0.224)
		colorDistMagn   0.812653
		colorDistFreq   0.139041
		detailScale     430.985
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.375692
		terraceProb     0.362164
		erosion         0
		montesMagn      0.488469
		montesFreq      3.04036
		montesSpiky     0.92328
		montesFraction  0.547026
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.661506
		hillsFraction   0.839546
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239799
		craterFreq      0.232139
		craterDensity   0.910874
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.483928
		volcanoTemp     1440.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.308, 0.289, 0.265, 0.000)
		colorShelf     (0.327, 0.307, 0.282, 0.000)
		colorBeach     (0.347, 0.325, 0.298, 0.000)
		colorDesert    (0.366, 0.343, 0.315, 0.000)
		colorLowland   (0.385, 0.361, 0.331, 0.000)
		colorUpland    (0.404, 0.379, 0.348, 0.000)
		colorRock      (0.424, 0.397, 0.364, 0.000)
		colorSnow      (0.443, 0.415, 0.381, 1.000)
		BumpHeight      14.2048
		BumpOffset      2.84096
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.83555e-005
		Period          0.00039748
		Eccentricity    3.59801e-005
		Inclination     -0.00441476
		AscendingNode   -152.243
		ArgOfPericenter -45.3617
		MeanAnomaly     20.4782
	}
}

Planet	"Althir System 5"
{
	ParentBody     "Althir System"
	Class	       "GasGiant"

	Mass            71.5728
	Radius          55435.3
	InertiaMoment   0.223791

	Oblateness      0.072028

	RotationPeriod  12.9607
	Obliquity       -5.65725
	EqAscendNode    -126.317

	AlbedoBond      0.492077
	AlbedoGeom      0.590492
	Brightness      2

	Surface
	{
		SurfStyle       0.682693
		Randomize      (-0.981, -0.242, 0.134)
		detailScale     142583
		colorConversion true
		tropicLatitude  0.104589
		icecapLatitude  1
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0.0957817
		stripeZones     4.82783
		stripeFluct     0.484721
		stripeTwist     11.874
		cycloneMagn     14.1236
		cycloneFreq     0.812922
		cycloneDensity  0.476824
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
		BumpHeight      20
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          233.742
		Velocity        360.974
		BumpHeight      51.1676
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.03625
		mainOctaves     12
		Coverage        0.420769
		stripeZones     4.82783
		stripeFluct     0.484721
		stripeTwist     11.874
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Jupiter"
		Height          554.353
		Density         3537.58
		Pressure        653625
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0295075
		Saturation      0.768552

		Composition
		{
			H2    	92.1399
			He    	7.50588
			CH4   	0.303451
			N2    	0.0315503
			O2    	0.00654987
			NH3   	0.00525037
			C2H2  	0.00336236
			C2H4  	0.00129603
			Ne    	0.000933318
			Ar    	0.000856111
			C2H6  	0.000607689
			C3H8  	0.000341722
		}
	}

	Aurora
	{
		Height      3281.94
		NorthLat    84.1264
		NorthLon    -101.53
		NorthRadius 11836.8
		NorthWidth  5063.53
		NorthRings  4
		NorthBright 1
		NorthParticles 10000
		SouthLat    -82.1961
		SouthLon    74.9432
		SouthRadius 8214.35
		SouthWidth  3995.92
		SouthRings  3
		SouthBright 1
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	Rings
	{
		InnerRadius     71287.7
		OuterRadius     169022
		RotationPeriod  13.6402
		RotationOffset  0
		FrontBright     0.981897
		BackBright      0.838927
		Density         0.666388
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   10.2081
		Period          19.7821
		Eccentricity    0.017735
		Inclination     0.509164
		AscendingNode   -130.994
		ArgOfPericenter 93.5338
		MeanAnomaly     37.0988
	}
}

Moon	"Althir System 5.1"
{
	ParentBody     "Althir System 5"
	Class	       "Selena"

	Mass            0.00973879
	Radius          1862.82
	InertiaMoment   0.377511

	Oblateness      0.00540832

	Obliquity       1.11523
	EqAscendNode    -167.676
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.609 0.606 0.604)

	Surface
	{
		SurfStyle       0.505063
		OceanStyle      0.712473
		Randomize      (0.618, -0.186, 0.194)
		colorDistMagn   0.0802837
		colorDistFreq   243.191
		detailScale     4791.29
		colorConversion true
		drivenDarkening 0
		seaLevel        0.259913
		snowLevel       2
		tropicLatitude  0.00417187
		icecapLatitude  0.704506
		icecapHeight    0.278874
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.00653
		venusFreq       0.849897
		venusMagn       0
		mareFreq        0.995303
		mareDensity     0.00162092
		terraceProb     0.197137
		erosion         0
		montesMagn      0.0909018
		montesFreq      94.6886
		montesSpiky     0.929409
		montesFraction  0.974429
		dunesMagn       0.0567352
		dunesFreq       2467.7
		dunesFraction   0.355867
		hillsMagn       0.11163
		hillsFreq       206.313
		hillsFraction   0.507751
		hills2Fraction  0
		riversMagn      58.3514
		riversFreq      2.74987
		riversSin       5.1957
		riversOctaves   0
		canyonsMagn     0.637044
		canyonsFreq     0.718974
		canyonFraction  0.840808
		cracksMagn      0.024409
		cracksFreq      0.92666
		cracksOctaves   0
		craterMagn      0.649115
		craterFreq      4.08773
		craterDensity   0.850189
		craterOctaves   9.49364
		craterRayedFactor 0.188969
		volcanoMagn     0.301767
		volcanoFreq     0.548866
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.196693
		volcanoRadius   0.220022
		volcanoTemp     1406.82
		lavaCoverTidal  0.152157
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.430, 0.400, 0.370, 0.000)
		colorShelf     (0.620, 0.600, 0.530, 0.000)
		colorBeach     (0.377, 0.370, 0.326, 0.000)
		colorDesert    (0.396, 0.376, 0.332, 0.000)
		colorLowland   (0.310, 0.279, 0.254, 0.000)
		colorUpland    (0.456, 0.430, 0.374, 0.000)
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
		SemiMajorAxis   0.00144247
		Period          0.00374488
		Eccentricity    0.00839371
		Inclination     1.11523
		AscendingNode   -167.676
		ArgOfPericenter -132.202
		MeanAnomaly     99.1977
	}
}

Moon	"Althir System 5.2"
{
	ParentBody     "Althir System 5"
	Class	       "Selena"

	Mass            0.0113853
	Radius          1844.76
	InertiaMoment   0.373419

	Obliquity       -0.325724
	EqAscendNode    17.6654
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.678 0.675 0.673)

	Surface
	{
		SurfStyle       0.242681
		OceanStyle      0.287205
		Randomize      (-0.111, -0.142, 0.386)
		colorDistMagn   0.0536762
		colorDistFreq   192.567
		detailScale     4744.84
		colorConversion true
		drivenDarkening 0
		seaLevel        0.255019
		snowLevel       2
		tropicLatitude  0.0112356
		icecapLatitude  0.800788
		icecapHeight    0.267617
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.8871
		venusFreq       0.501856
		venusMagn       0
		mareFreq        0.826015
		mareDensity     0.00329744
		terraceProb     0.115333
		erosion         0
		montesMagn      0.098196
		montesFreq      76.6721
		montesSpiky     0.873466
		montesFraction  0.383918
		dunesMagn       0.0447932
		dunesFreq       2429.94
		dunesFraction   0.79611
		hillsMagn       0.131181
		hillsFreq       185.988
		hillsFraction   0.814867
		hills2Fraction  0
		riversMagn      71.0424
		riversFreq      2.05984
		riversSin       4.46337
		riversOctaves   0
		canyonsMagn     0.529108
		canyonsFreq     0.604335
		canyonFraction  0.0736633
		cracksMagn      0.0671723
		cracksFreq      0.81339
		cracksOctaves   0
		craterMagn      0.677042
		craterFreq      5.98583
		craterDensity   0.703337
		craterOctaves   9.81114
		craterRayedFactor 0.0677712
		volcanoMagn     0.253743
		volcanoFreq     0.567386
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.27858
		volcanoRadius   0.244015
		volcanoTemp     1832.63
		lavaCoverTidal  0.120087
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.320, 0.320, 0.000)
		colorShelf     (0.370, 0.370, 0.370, 0.000)
		colorBeach     (0.339, 0.338, 0.336, 0.000)
		colorDesert    (0.420, 0.405, 0.383, 0.200)
		colorLowland   (0.454, 0.432, 0.431, 0.500)
		colorUpland    (0.474, 0.452, 0.444, 0.800)
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
		SemiMajorAxis   0.00244133
		Period          0.0082454
		Eccentricity    0.0369362
		Inclination     -0.325724
		AscendingNode   17.6654
		ArgOfPericenter -16.9786
		MeanAnomaly     123.112
	}
}

Moon	"Althir System 5.3"
{
	ParentBody     "Althir System 5"
	Class	       "Desert"

	Mass            0.13369
	Radius          3779.18
	InertiaMoment   0.32829

	Obliquity       0.183254
	EqAscendNode    -124.652
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.675 0.614 0.572)

	Surface
	{
		SurfStyle       0.877189
		OceanStyle      0.39693
		Randomize      (0.193, 0.136, -0.982)
		colorDistMagn   0.065505
		colorDistFreq   469.862
		detailScale     9720.26
		colorConversion true
		seaLevel        0.135114
		snowLevel       2
		tropicLatitude  0.0029701
		icecapLatitude  0.74949
		icecapHeight    0.146886
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.04856
		venusFreq       1.52001
		venusMagn       0.487563
		mareFreq        2.21831
		mareDensity     0.0292645
		terraceProb     0.224564
		erosion         0
		montesMagn      0.227107
		montesFreq      207.506
		montesSpiky     0.844108
		montesFraction  0.32031
		dunesMagn       0.0705976
		dunesFreq       28.0813
		dunesFraction   0.615681
		hillsMagn       0.119059
		hillsFreq       389.267
		hillsFraction   0
		hills2Fraction  0
		riversMagn      65.8572
		riversFreq      2.19515
		riversSin       5.36227
		riversOctaves   0
		canyonsMagn     0.0445853
		canyonsFreq     97.1287
		canyonFraction  0
		cracksMagn      0.10192
		cracksFreq      0.397217
		cracksOctaves   0
		craterMagn      0.613552
		craterFreq      12.3735
		craterDensity   0.745596
		craterOctaves   9.89923
		volcanoMagn     0.738415
		volcanoFreq     0.728185
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.469729
		volcanoRadius   0.458595
		volcanoTemp     1167.72
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
		Hapke           0.917995
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
		Height          48.9018
		Density         0.00820048
		Pressure        0.00335115
		Greenhouse      0.233284
		Bright          6.06412
		Opacity         1
		SkyLight        2.02137
		Hue             -0.000223793
		Saturation      1

		Composition
		{
			CO2   	45.6437
			H2S   	38.1356
			C2H4  	7.19532
			SO2   	4.57923
			C2H2  	2.26825
			C3H8  	1.26842
			C2H6  	0.684039
			N2    	0.198438
			NH3   	0.0155032
			H2O   	0.0109914
			Ne    	0.000217693
			CO    	0.000205193
			Ar    	7.11591e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00413187
		Period          0.0181393
		Eccentricity    0.0122981
		Inclination     0.183254
		AscendingNode   -124.652
		ArgOfPericenter 22.5231
		MeanAnomaly     70.5795
	}
}

Moon	"Althir System 5.4"
{
	ParentBody     "Althir System 5"
	Class	       "Selena"

	Mass            0.0157847
	Radius          2182.04
	InertiaMoment   0.363006

	Obliquity       0.941902
	EqAscendNode    -175.568
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.457 0.451 0.447)

	Surface
	{
		SurfStyle       0.980071
		OceanStyle      0.142332
		Randomize      (0.237, 0.953, -0.363)
		colorDistMagn   0.0444148
		colorDistFreq   293.242
		detailScale     5612.33
		colorConversion true
		drivenDarkening 0
		seaLevel        0.188693
		snowLevel       2
		tropicLatitude  0.00129187
		icecapLatitude  0.950411
		icecapHeight    0.190462
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.70266
		venusFreq       0.859537
		venusMagn       0
		mareFreq        1.14193
		mareDensity     0.00263673
		terraceProb     0.251395
		erosion         0
		montesMagn      0.0991814
		montesFreq      96.2945
		montesSpiky     0.811816
		montesFraction  0.24204
		dunesMagn       0.0451609
		dunesFreq       2873.68
		dunesFraction   0.602904
		hillsMagn       0.116191
		hillsFreq       253.609
		hillsFraction   0.893843
		hills2Fraction  0
		riversMagn      58.7044
		riversFreq      4.0865
		riversSin       6.39443
		riversOctaves   0
		canyonsMagn     0.498137
		canyonsFreq     0.849324
		canyonFraction  0.998287
		cracksMagn      0.0511051
		cracksFreq      0.643114
		cracksOctaves   0
		craterMagn      0.5323
		craterFreq      6.22869
		craterDensity   0.939548
		craterOctaves   11
		craterRayedFactor 0.14816
		volcanoMagn     0.372152
		volcanoFreq     0.771817
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.301476
		volcanoRadius   0.343817
		volcanoTemp     1686.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.390, 0.400, 0.160, 0.000)
		colorShelf     (0.580, 0.550, 0.240, 0.000)
		colorBeach     (0.325, 0.307, 0.188, 0.000)
		colorDesert    (0.375, 0.343, 0.192, 0.000)
		colorLowland   (0.288, 0.248, 0.139, 0.000)
		colorUpland    (0.270, 0.230, 0.130, 0.000)
		colorRock      (0.330, 0.240, 0.130, 0.000)
		colorSnow      (0.900, 0.890, 0.760, 1.000)
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
		SemiMajorAxis   0.00699304
		Period          0.0399721
		Eccentricity    0.0390234
		Inclination     0.941902
		AscendingNode   -175.568
		ArgOfPericenter -81.2985
		MeanAnomaly     161.528
	}
}

Moon	"Althir System 5.5"
{
	ParentBody     "Althir System 5"
	Class	       "Selena"

	Mass            0.0187645
	Radius          2007.11
	InertiaMoment   0.365829

	Obliquity       1.05893
	EqAscendNode    26.3629
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.820 0.783 0.729)

	Surface
	{
		SurfStyle       0.0750264
		OceanStyle      0.537733
		Randomize      (-0.301, -0.448, -0.141)
		colorDistMagn   0.0794313
		colorDistFreq   238.765
		detailScale     5162.39
		colorConversion true
		drivenDarkening 0
		seaLevel        0.345169
		snowLevel       2
		tropicLatitude  0.0359815
		icecapLatitude  0.488652
		icecapHeight    0.374664
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.72952
		venusFreq       1.39497
		venusMagn       0
		mareFreq        1.28828
		mareDensity     0.00539776
		terraceProb     0.170589
		erosion         0
		montesMagn      0.108074
		montesFreq      98.4891
		montesSpiky     0.881611
		montesFraction  0.862985
		dunesMagn       0.0476741
		dunesFreq       2640.36
		dunesFraction   0.0320122
		hillsMagn       0.138456
		hillsFreq       224.878
		hillsFraction   0.318441
		hills2Fraction  0
		riversMagn      62.5207
		riversFreq      3.36486
		riversSin       8.05527
		riversOctaves   0
		canyonsMagn     0.487458
		canyonsFreq     0.764377
		canyonFraction  0.777305
		cracksMagn      0.076337
		cracksFreq      1.22578
		cracksOctaves   0
		craterMagn      0.614252
		craterFreq      5.27589
		craterDensity   0.916156
		craterOctaves   11
		craterRayedFactor 0.10851
		volcanoMagn     0.299075
		volcanoFreq     0.533865
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.230603
		volcanoRadius   0.232234
		volcanoTemp     1380.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.320, 0.320, 0.000)
		colorShelf     (0.370, 0.370, 0.370, 0.000)
		colorBeach     (0.410, 0.391, 0.364, 0.000)
		colorDesert    (0.508, 0.470, 0.415, 0.200)
		colorLowland   (0.549, 0.501, 0.466, 0.500)
		colorUpland    (0.574, 0.524, 0.481, 0.800)
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

	Atmosphere
	{
		Model          "Sun"
		Height          100.355
		Density         1.47131e-008
		Pressure        3.53274e-009
		Greenhouse      0.000324646
		Bright          0.5
		Opacity         0
		SkyLight        0.166667
		Hue             0.015279
		Saturation      1

		Composition
		{
			SO2   	82.316
			Cl2   	11.3957
			Kr    	4.24036
			Xe    	2.04801
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0118355
		Period          0.0880091
		Eccentricity    0.0048021
		Inclination     1.05893
		AscendingNode   26.3629
		ArgOfPericenter -15.5472
		MeanAnomaly     -96.627
	}
}

DwarfMoon	"Althir System 5.D1"
{
	ParentBody     "Althir System 5"
	Class	       "Asteroid"

	Mass            8.30527e-007
	Radius          127.391
	InertiaMoment   0.398433

	RotationPeriod  341.028
	Obliquity       -116.894
	EqAscendNode    -114.642

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.777 0.710 0.655)

	Surface
	{
		SurfStyle       0.586373
		OceanStyle      0.995238
		Randomize      (-0.278, -0.148, 0.907)
		colorDistMagn   0.604677
		colorDistFreq   9.16851
		detailScale     3478.61
		colorConversion true
		snowLevel       2
		tropicLatitude  0.986309
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.721874
		terraceProb     0.256714
		erosion         0
		montesMagn      0.416641
		montesFreq      3.64741
		montesSpiky     0.979968
		montesFraction  0.73263
		dunesFraction   0
		hillsMagn       0
		hillsFreq       32.2191
		hillsFraction   0.586384
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256574
		craterFreq      0.520107
		craterDensity   0.757849
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.500339
		volcanoTemp     1675.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.303, 0.241, 0.183, 0.000)
		colorShelf     (0.311, 0.249, 0.209, 0.000)
		colorBeach     (0.365, 0.291, 0.249, 0.000)
		colorDesert    (0.396, 0.313, 0.242, 0.000)
		colorLowland   (0.435, 0.334, 0.275, 0.000)
		colorUpland    (0.482, 0.405, 0.334, 0.000)
		colorRock      (0.520, 0.440, 0.360, 0.000)
		colorSnow      (0.567, 0.469, 0.380, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0595947
		Period          0.994529
		Eccentricity    0.274111
		Inclination     -32.7822
		AscendingNode   -116.491
		ArgOfPericenter -71.7299
		MeanAnomaly     -125.425
	}
}

DwarfMoon	"Althir System 5.D2"
{
	ParentBody     "Althir System 5"
	Class	       "Asteroid"

	Mass            1.19674e-006
	Radius          185.791
	InertiaMoment   0.39945

	RotationPeriod  408.41
	Obliquity       30.9998
	EqAscendNode    60.6254

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.625 0.477 0.373)

	Surface
	{
		SurfStyle       0.0955119
		OceanStyle      0.139994
		Randomize      (0.234, 0.450, -0.248)
		colorDistMagn   0.61308
		colorDistFreq   26.1993
		detailScale     5073.32
		colorConversion true
		snowLevel       2
		tropicLatitude  0.448614
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.640992
		terraceProb     0.438969
		erosion         0
		montesMagn      0.300786
		montesFreq      3.2932
		montesSpiky     0.931799
		montesFraction  0.601579
		dunesFraction   0
		hillsMagn       0
		hillsFreq       94.9407
		hillsFraction   0.683536
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.200989
		craterFreq      1.12039
		craterDensity   0.921568
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.548692
		volcanoTemp     1245.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.250, 0.191, 0.149, 0.000)
		colorShelf     (0.266, 0.203, 0.159, 0.000)
		colorBeach     (0.281, 0.215, 0.168, 0.000)
		colorDesert    (0.297, 0.227, 0.177, 0.000)
		colorLowland   (0.313, 0.239, 0.187, 0.000)
		colorUpland    (0.328, 0.251, 0.196, 0.000)
		colorRock      (0.344, 0.263, 0.205, 0.000)
		colorSnow      (0.359, 0.275, 0.214, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0598749
		Period          1.00155
		Eccentricity    0.0660052
		Inclination     -17.7257
		AscendingNode   60.4854
		ArgOfPericenter 54.8143
		MeanAnomaly     -153.225
	}
}

DwarfMoon	"Althir System 5.D3"
{
	ParentBody     "Althir System 5"
	Class	       "Asteroid"

	Mass            1.75096e-006
	Radius          179.361
	InertiaMoment   0.396996

	RotationPeriod  331.389
	Obliquity       -56.2985
	EqAscendNode    -87.707

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.548 0.542 0.539)

	Surface
	{
		SurfStyle       0.84925
		OceanStyle      0.436142
		Randomize      (0.296, 0.038, 0.523)
		colorDistMagn   0.762587
		colorDistFreq   11.2436
		detailScale     4897.74
		colorConversion true
		snowLevel       2
		tropicLatitude  0.992957
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.58947
		terraceProb     0.139015
		erosion         0
		montesMagn      0.561193
		montesFreq      3.06143
		montesSpiky     0.943746
		montesFraction  0.686287
		dunesFraction   0
		hillsMagn       0
		hillsFreq       103.078
		hillsFraction   0.57369
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229437
		craterFreq      0.818747
		craterDensity   1.00193
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.482694
		volcanoTemp     1155.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.214, 0.184, 0.151, 0.000)
		colorShelf     (0.219, 0.190, 0.172, 0.000)
		colorBeach     (0.257, 0.222, 0.205, 0.000)
		colorDesert    (0.279, 0.238, 0.199, 0.000)
		colorLowland   (0.307, 0.255, 0.226, 0.000)
		colorUpland    (0.339, 0.309, 0.275, 0.000)
		colorRock      (0.367, 0.336, 0.296, 0.000)
		colorSnow      (0.400, 0.358, 0.312, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0605054
		Period          1.01741
		Eccentricity    0.485434
		Inclination     -79.326
		AscendingNode   -91.1007
		ArgOfPericenter 109.623
		MeanAnomaly     -146.678
	}
}

DwarfMoon	"Althir System 5.D4"
{
	ParentBody     "Althir System 5"
	Class	       "Asteroid"

	Mass            2.60946e-006
	Radius          195.515
	InertiaMoment   0.398597

	RotationPeriod  298.96
	Obliquity       -74.995
	EqAscendNode    -141.539

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.716 0.714 0.711)

	Surface
	{
		SurfStyle       0.892192
		OceanStyle      0.613395
		Randomize      (-0.578, 0.050, 0.738)
		colorDistMagn   0.428511
		colorDistFreq   22.9598
		detailScale     5338.86
		colorConversion true
		snowLevel       2
		tropicLatitude  0.578359
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.448858
		terraceProb     0.496704
		erosion         0
		montesMagn      0.505311
		montesFreq      2.83754
		montesSpiky     0.962205
		montesFraction  0.436481
		dunesFraction   0
		hillsMagn       0
		hillsFreq       78.4472
		hillsFraction   0.518038
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244556
		craterFreq      1.61954
		craterDensity   0.709914
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.476993
		volcanoTemp     1689.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.243, 0.250, 0.285, 0.050)
		colorShelf     (0.286, 0.293, 0.327, 0.040)
		colorBeach     (0.329, 0.335, 0.370, 0.030)
		colorDesert    (0.372, 0.378, 0.420, 0.020)
		colorLowland   (0.415, 0.421, 0.462, 0.030)
		colorUpland    (0.458, 0.464, 0.505, 0.050)
		colorRock      (0.501, 0.507, 0.562, 0.020)
		colorSnow      (0.501, 0.507, 0.562, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0609507
		Period          1.02866
		Eccentricity    0.295143
		Inclination     -72.2047
		AscendingNode   -143.224
		ArgOfPericenter -159.545
		MeanAnomaly     -40.2421
	}
}

DwarfMoon	"Althir System 5.D5"
{
	ParentBody     "Althir System 5"
	Class	       "Asteroid"

	Mass            3.97707e-006
	Radius          216.084
	InertiaMoment   0.399578

	RotationPeriod  269.851
	Obliquity       28.4115
	EqAscendNode    -141.106

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.518 0.425 0.290)

	Surface
	{
		SurfStyle       0.794852
		OceanStyle      0.420978
		Randomize      (0.109, 0.594, -0.603)
		colorDistMagn   0.736061
		colorDistFreq   14.8493
		detailScale     5900.54
		colorConversion true
		snowLevel       2
		tropicLatitude  0.749909
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.394279
		terraceProb     0.316272
		erosion         0
		montesMagn      0.612198
		montesFreq      3.59659
		montesSpiky     0.93278
		montesFraction  0.25441
		dunesFraction   0
		hillsMagn       0
		hillsFreq       141.226
		hillsFraction   0.432444
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240131
		craterFreq      1.61182
		craterDensity   0.881201
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.505246
		volcanoTemp     1652.92
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.202, 0.144, 0.081, 0.000)
		colorShelf     (0.207, 0.149, 0.093, 0.000)
		colorBeach     (0.244, 0.174, 0.110, 0.000)
		colorDesert    (0.264, 0.187, 0.107, 0.000)
		colorLowland   (0.290, 0.200, 0.122, 0.000)
		colorUpland    (0.321, 0.242, 0.148, 0.000)
		colorRock      (0.347, 0.263, 0.160, 0.000)
		colorSnow      (0.378, 0.280, 0.168, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.061188
		Period          1.03468
		Eccentricity    0.478245
		Inclination     -22.5015
		AscendingNode   -146.051
		ArgOfPericenter 148.3
		MeanAnomaly     -146.111
	}
}

DwarfMoon	"Althir System 5.D6"
{
	ParentBody     "Althir System 5"
	Class	       "Asteroid"

	Mass            6.23142e-006
	Radius          233.902
	InertiaMoment   0.397337

	RotationPeriod  234.728
	Obliquity       -79.6955
	EqAscendNode    -91.7895

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.758 0.680 0.573)

	Surface
	{
		SurfStyle       0.112493
		OceanStyle      0.605026
		Randomize      (-0.034, 0.527, 0.492)
		colorDistMagn   0.769799
		colorDistFreq   19.5158
		detailScale     6387.09
		colorConversion true
		snowLevel       2
		tropicLatitude  0.986743
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.259481
		terraceProb     0.10061
		erosion         0
		montesMagn      0.578252
		montesFreq      3.04273
		montesSpiky     0.873092
		montesFraction  0.710997
		dunesFraction   0
		hillsMagn       0
		hillsFreq       118.477
		hillsFraction   0.780805
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258104
		craterFreq      1.60818
		craterDensity   0.971105
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.562776
		volcanoTemp     1520.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.303, 0.272, 0.229, 0.000)
		colorShelf     (0.322, 0.289, 0.244, 0.000)
		colorBeach     (0.341, 0.306, 0.258, 0.000)
		colorDesert    (0.360, 0.323, 0.272, 0.000)
		colorLowland   (0.379, 0.340, 0.287, 0.000)
		colorUpland    (0.398, 0.357, 0.301, 0.000)
		colorRock      (0.417, 0.374, 0.315, 0.000)
		colorSnow      (0.436, 0.391, 0.330, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0618003
		Period          1.05025
		Eccentricity    0.28998
		Inclination     -25.1258
		AscendingNode   -90.0464
		ArgOfPericenter 30.9029
		MeanAnomaly     78.3683
	}
}

DwarfMoon	"Althir System 5.D7"
{
	ParentBody     "Althir System 5"
	Class	       "Asteroid"

	Mass            2.066e-011
	Radius          4.11908
	InertiaMoment   0.398753

	RotationPeriod  1596.13
	Obliquity       34.1136
	EqAscendNode    -158.934

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.802 0.746 0.713)

	Surface
	{
		SurfStyle       0.0103006
		OceanStyle      0.812391
		Randomize      (0.408, 0.824, -0.495)
		colorDistMagn   0.667054
		colorDistFreq   0.00382311
		detailScale     112.478
		colorConversion true
		snowLevel       2
		tropicLatitude  0.238195
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.421688
		terraceProb     0.429305
		erosion         0
		montesMagn      0.446358
		montesFreq      3.10043
		montesSpiky     0.910148
		montesFraction  0.628461
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.028765
		hillsFraction   0.587563
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243602
		craterFreq      0.23288
		craterDensity   1.01159
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.498882
		volcanoTemp     1499.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.321, 0.298, 0.285, 0.000)
		colorShelf     (0.341, 0.317, 0.303, 0.000)
		colorBeach     (0.361, 0.336, 0.321, 0.000)
		colorDesert    (0.381, 0.354, 0.339, 0.000)
		colorLowland   (0.401, 0.373, 0.356, 0.000)
		colorUpland    (0.421, 0.392, 0.374, 0.000)
		colorRock      (0.441, 0.410, 0.392, 0.000)
		colorSnow      (0.461, 0.429, 0.410, 1.000)
		BumpHeight      3.70718
		BumpOffset      0.741435
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.062359
		Period          1.06452
		Eccentricity    0.465719
		Inclination     34.8975
		AscendingNode   -155.587
		ArgOfPericenter 118.772
		MeanAnomaly     -134.225
	}
}

DwarfMoon	"Althir System 5.D8"
{
	ParentBody     "Althir System 5"
	Class	       "Asteroid"

	Mass            3.92143e-011
	Radius          4.85287
	InertiaMoment   0.399705

	RotationPeriod  1439.51
	Obliquity       27.0277
	EqAscendNode    44.8952

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.501 0.497 0.489)

	Surface
	{
		SurfStyle       0.288215
		OceanStyle      0.0247831
		Randomize      (-0.772, -0.141, -0.842)
		colorDistMagn   0.82827
		colorDistFreq   0.00477179
		detailScale     132.516
		colorConversion true
		snowLevel       2
		tropicLatitude  0.611256
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.329872
		terraceProb     0.293594
		erosion         0
		montesMagn      0.538235
		montesFreq      2.71084
		montesSpiky     0.926619
		montesFraction  0.359898
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0534756
		hillsFraction   0.826917
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213607
		craterFreq      0.188103
		craterDensity   0.775175
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.464602
		volcanoTemp     1325.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.200, 0.199, 0.196, 0.000)
		colorShelf     (0.213, 0.211, 0.208, 0.000)
		colorBeach     (0.226, 0.224, 0.220, 0.000)
		colorDesert    (0.238, 0.236, 0.232, 0.000)
		colorLowland   (0.251, 0.249, 0.244, 0.000)
		colorUpland    (0.263, 0.261, 0.257, 0.000)
		colorRock      (0.276, 0.273, 0.269, 0.000)
		colorSnow      (0.288, 0.286, 0.281, 1.000)
		BumpHeight      4.36758
		BumpOffset      0.873517
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0628055
		Period          1.07598
		Eccentricity    0.0852238
		Inclination     14.2439
		AscendingNode   49.9341
		ArgOfPericenter -156.303
		MeanAnomaly     -143.81
	}
}

DwarfMoon	"Althir System 5.D9"
{
	ParentBody     "Althir System 5"
	Class	       "Asteroid"

	Mass            6.91436e-011
	Radius          5.63175
	InertiaMoment   0.397614

	RotationPeriod  1307.45
	Obliquity       14.2529
	EqAscendNode    25.6224

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.576 0.572 0.570)

	Surface
	{
		SurfStyle       0.172492
		OceanStyle      0.918821
		Randomize      (0.372, -0.486, 0.201)
		colorDistMagn   0.720898
		colorDistFreq   0.0276377
		detailScale     153.784
		colorConversion true
		snowLevel       2
		tropicLatitude  0.979848
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.644559
		terraceProb     0.352473
		erosion         0
		montesMagn      0.460099
		montesFreq      3.2151
		montesSpiky     0.941499
		montesFraction  0.531243
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0777825
		hillsFraction   0.501077
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231705
		craterFreq      0.224753
		craterDensity   1.04253
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.485008
		volcanoTemp     1368.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.230, 0.229, 0.228, 0.000)
		colorShelf     (0.245, 0.243, 0.242, 0.000)
		colorBeach     (0.259, 0.257, 0.257, 0.000)
		colorDesert    (0.273, 0.272, 0.271, 0.000)
		colorLowland   (0.288, 0.286, 0.285, 0.000)
		colorUpland    (0.302, 0.300, 0.299, 0.000)
		colorRock      (0.317, 0.315, 0.314, 0.000)
		colorSnow      (0.331, 0.329, 0.328, 1.000)
		BumpHeight      5.06858
		BumpOffset      1.01372
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0631811
		Period          1.08564
		Eccentricity    0.0931561
		Inclination     65.7032
		AscendingNode   27.4925
		ArgOfPericenter 119.766
		MeanAnomaly     -22.7254
	}
}

DwarfMoon	"Althir System 5.D10"
{
	ParentBody     "Althir System 5"
	Class	       "Asteroid"

	Mass            1.15511e-010
	Radius          6.31108
	InertiaMoment   0.398901

	RotationPeriod  1179.51
	Obliquity       -71.8154
	EqAscendNode    95.6554

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.700 0.619 0.464)

	Surface
	{
		SurfStyle       0.615369
		OceanStyle      0.0363403
		Randomize      (-0.199, -0.938, 0.336)
		colorDistMagn   0.585646
		colorDistFreq   0.00722631
		detailScale     172.335
		colorConversion true
		snowLevel       2
		tropicLatitude  0.954213
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.546301
		terraceProb     0.452091
		erosion         0
		montesMagn      0.414082
		montesFreq      3.0726
		montesSpiky     0.98056
		montesFraction  0.448625
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.119851
		hillsFraction   0.715927
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254892
		craterFreq      0.220015
		craterDensity   0.817577
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.436042
		volcanoTemp     1278.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.273, 0.211, 0.130, 0.000)
		colorShelf     (0.280, 0.217, 0.149, 0.000)
		colorBeach     (0.329, 0.254, 0.176, 0.000)
		colorDesert    (0.357, 0.273, 0.172, 0.000)
		colorLowland   (0.392, 0.291, 0.195, 0.000)
		colorUpland    (0.434, 0.353, 0.237, 0.000)
		colorRock      (0.469, 0.384, 0.255, 0.000)
		colorSnow      (0.511, 0.409, 0.269, 1.000)
		BumpHeight      5.67997
		BumpOffset      1.13599
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0636064
		Period          1.09662
		Eccentricity    0.475833
		Inclination     -33.8441
		AscendingNode   94.3279
		ArgOfPericenter 16.881
		MeanAnomaly     46.8479
	}
}

DwarfMoon	"Althir System 5.D11"
{
	ParentBody     "Althir System 5"
	Class	       "Asteroid"

	Mass            1.85197e-010
	Radius          8.64119
	InertiaMoment   0.399831

	RotationPeriod  1255.4
	Obliquity       46.764
	EqAscendNode    143.974

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.578 0.576 0.573)

	Surface
	{
		SurfStyle       0.223709
		OceanStyle      0.870168
		Randomize      (0.042, 0.047, -0.419)
		colorDistMagn   0.33477
		colorDistFreq   0.0172664
		detailScale     235.962
		colorConversion true
		snowLevel       2
		tropicLatitude  0.447298
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.471403
		terraceProb     0.301511
		erosion         0
		montesMagn      0.617613
		montesFreq      2.78514
		montesSpiky     0.717671
		montesFraction  0.74267
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.166964
		hillsFraction   0.632097
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257758
		craterFreq      0.272691
		craterDensity   1.03324
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.525912
		volcanoTemp     1790.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.231, 0.230, 0.229, 0.000)
		colorShelf     (0.246, 0.245, 0.244, 0.000)
		colorBeach     (0.260, 0.259, 0.258, 0.000)
		colorDesert    (0.275, 0.273, 0.272, 0.000)
		colorLowland   (0.289, 0.288, 0.287, 0.000)
		colorUpland    (0.304, 0.302, 0.301, 0.000)
		colorRock      (0.318, 0.317, 0.315, 0.000)
		colorSnow      (0.333, 0.331, 0.330, 1.000)
		BumpHeight      7.77707
		BumpOffset      1.55541
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0640716
		Period          1.10868
		Eccentricity    0.0942378
		Inclination     31.9275
		AscendingNode   144.332
		ArgOfPericenter 26.7705
		MeanAnomaly     -142.033
	}
}

DwarfMoon	"Althir System 5.D12"
{
	ParentBody     "Althir System 5"
	Class	       "Asteroid"

	Mass            2.87495e-010
	Radius          9.48382
	InertiaMoment   0.397851

	RotationPeriod  1140.53
	Obliquity       147.157
	EqAscendNode    133.988

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.679 0.675 0.671)

	Surface
	{
		SurfStyle       0.476398
		OceanStyle      0.145801
		Randomize      (-0.479, -0.379, -0.075)
		colorDistMagn   0.341235
		colorDistFreq   0.025986
		detailScale     258.971
		colorConversion true
		snowLevel       2
		tropicLatitude  0.928303
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.559023
		terraceProb     0.549687
		erosion         0
		montesMagn      0.52811
		montesFreq      2.89554
		montesSpiky     0.951587
		montesFraction  0.3857
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.151739
		hillsFraction   0.621265
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253733
		craterFreq      0.238716
		craterDensity   0.814241
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.485812
		volcanoTemp     1241.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.272, 0.270, 0.269, 0.000)
		colorShelf     (0.289, 0.287, 0.285, 0.000)
		colorBeach     (0.306, 0.304, 0.302, 0.000)
		colorDesert    (0.323, 0.321, 0.319, 0.000)
		colorLowland   (0.340, 0.338, 0.336, 0.000)
		colorUpland    (0.357, 0.354, 0.352, 0.000)
		colorRock      (0.374, 0.371, 0.369, 0.000)
		colorSnow      (0.391, 0.388, 0.386, 1.000)
		BumpHeight      8.53544
		BumpOffset      1.70709
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.064535
		Period          1.12072
		Eccentricity    0.173273
		Inclination     40.0715
		AscendingNode   140.941
		ArgOfPericenter 41.5086
		MeanAnomaly     -173.496
	}
}

DwarfMoon	"Althir System 5.D13"
{
	ParentBody     "Althir System 5"
	Class	       "Asteroid"

	Mass            4.34905e-010
	Radius          10.4567
	InertiaMoment   0.399044

	RotationPeriod  1049.94
	Obliquity       -110.873
	EqAscendNode    -181.225

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.815 0.737 0.690)

	Surface
	{
		SurfStyle       0.921997
		OceanStyle      0.888932
		Randomize      (-0.216, -0.621, -0.797)
		colorDistMagn   0.817332
		colorDistFreq   0.0667285
		detailScale     285.538
		colorConversion true
		snowLevel       2
		tropicLatitude  0.968445
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.710559
		terraceProb     0.249579
		erosion         0
		montesMagn      0.536931
		montesFreq      3.73229
		montesSpiky     0.940481
		montesFraction  0.572978
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.214951
		hillsFraction   0.74629
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.27091
		craterFreq      0.236939
		craterDensity   0.755541
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.587312
		volcanoTemp     1428.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.277, 0.258, 0.276, 0.050)
		colorShelf     (0.326, 0.302, 0.317, 0.040)
		colorBeach     (0.375, 0.347, 0.359, 0.030)
		colorDesert    (0.424, 0.391, 0.407, 0.020)
		colorLowland   (0.473, 0.435, 0.448, 0.030)
		colorUpland    (0.522, 0.479, 0.490, 0.050)
		colorRock      (0.570, 0.524, 0.545, 0.020)
		colorSnow      (0.570, 0.524, 0.545, 1.000)
		BumpHeight      9.41105
		BumpOffset      1.88221
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0648901
		Period          1.12999
		Eccentricity    0.447274
		Inclination     -35.3355
		AscendingNode   -177.477
		ArgOfPericenter -35.4713
		MeanAnomaly     41.2223
	}
}

DwarfMoon	"Althir System 5.D14"
{
	ParentBody     "Althir System 5"
	Class	       "Asteroid"

	Mass            6.44183e-010
	Radius          11.3314
	InertiaMoment   0.399956

	RotationPeriod  959.067
	Obliquity       -4.04641
	EqAscendNode    134.819

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.551 0.545 0.542)

	Surface
	{
		SurfStyle       0.512641
		OceanStyle      0.498245
		Randomize      (0.844, -0.621, -0.306)
		colorDistMagn   0.713423
		colorDistFreq   0.0533721
		detailScale     309.423
		colorConversion true
		snowLevel       2
		tropicLatitude  0.309612
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.661065
		terraceProb     0.127141
		erosion         0
		montesMagn      0.374297
		montesFreq      3.59339
		montesSpiky     0.875398
		montesFraction  0.497515
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.282531
		hillsFraction   0.67569
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217678
		craterFreq      0.272006
		craterDensity   0.792149
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.499919
		volcanoTemp     1603.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.215, 0.185, 0.152, 0.000)
		colorShelf     (0.220, 0.191, 0.173, 0.000)
		colorBeach     (0.259, 0.223, 0.206, 0.000)
		colorDesert    (0.281, 0.240, 0.200, 0.000)
		colorLowland   (0.308, 0.256, 0.227, 0.000)
		colorUpland    (0.341, 0.310, 0.276, 0.000)
		colorRock      (0.369, 0.338, 0.298, 0.000)
		colorSnow      (0.402, 0.359, 0.314, 1.000)
		BumpHeight      10.1983
		BumpOffset      2.03965
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0653003
		Period          1.14072
		Eccentricity    0.461761
		Inclination     -20.97
		AscendingNode   140.273
		ArgOfPericenter 74.1401
		MeanAnomaly     -123.641
	}
}

DwarfMoon	"Althir System 5.D15"
{
	ParentBody     "Althir System 5"
	Class	       "Asteroid"

	Mass            9.3775e-010
	Radius          15.0091
	InertiaMoment   0.398062

	RotationPeriod  1032.95
	Obliquity       96.0283
	EqAscendNode    -53.6215

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.744 0.741 0.737)

	Surface
	{
		SurfStyle       0.252278
		OceanStyle      0.211816
		Randomize      (0.989, -0.741, -0.881)
		colorDistMagn   0.578633
		colorDistFreq   0.124361
		detailScale     409.849
		colorConversion true
		snowLevel       2
		tropicLatitude  0.79418
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.431378
		terraceProb     0.267981
		erosion         0
		montesMagn      0.452618
		montesFreq      2.60439
		montesSpiky     0.932479
		montesFraction  0.81531
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.658746
		hillsFraction   0.4992
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239562
		craterFreq      0.17925
		craterDensity   0.797462
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.555481
		volcanoTemp     1632.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.297, 0.296, 0.295, 0.000)
		colorShelf     (0.316, 0.315, 0.313, 0.000)
		colorBeach     (0.335, 0.333, 0.331, 0.000)
		colorDesert    (0.353, 0.352, 0.350, 0.000)
		colorLowland   (0.372, 0.370, 0.368, 0.000)
		colorUpland    (0.390, 0.389, 0.387, 0.000)
		colorRock      (0.409, 0.407, 0.405, 0.000)
		colorSnow      (0.428, 0.426, 0.424, 1.000)
		BumpHeight      13.5082
		BumpOffset      2.70164
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0655243
		Period          1.14659
		Eccentricity    0.0314521
		Inclination     65.3403
		AscendingNode   -51.3985
		ArgOfPericenter 59.5429
		MeanAnomaly     -33.3008
	}
}

Moon	"Althir System 5.6"
{
	ParentBody     "Althir System 5"
	Class	       "Selena"

	Mass            0.000966414
	Radius          756.386
	InertiaMoment   0.399778

	Oblateness      0.00105851

	RotationPeriod  63.5409
	Obliquity       -21.9629
	EqAscendNode    -167.408

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.689 0.686 0.681)

	Surface
	{
		SurfStyle       0.162211
		OceanStyle      0.966776
		Randomize      (0.521, 0.868, -0.333)
		colorDistMagn   0.0833178
		colorDistFreq   103.835
		detailScale     1945.47
		colorConversion true
		drivenDarkening 0
		seaLevel        0.183426
		snowLevel       2
		tropicLatitude  0.0868757
		icecapLatitude  0.555809
		icecapHeight    0.202491
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.72225
		venusFreq       0.41813
		venusMagn       0
		mareFreq        0.111309
		mareDensity     0.000696239
		terraceProb     0.250163
		erosion         0
		montesMagn      0.0473196
		montesFreq      25.7834
		montesSpiky     0.955948
		montesFraction  0.701866
		dunesMagn       0.0289022
		dunesFreq       983.503
		dunesFraction   0.173709
		hillsMagn       0.128227
		hillsFreq       92.0576
		hillsFraction   0.420501
		hills2Fraction  0
		riversMagn      64.5301
		riversFreq      2.81701
		riversSin       6.37433
		riversOctaves   0
		canyonsMagn     0.544089
		canyonsFreq     0.265871
		canyonFraction  0.596071
		cracksMagn      0.028815
		cracksFreq      0.403999
		cracksOctaves   0
		craterMagn      0.630754
		craterFreq      1.87906
		craterDensity   0.785763
		craterOctaves   10
		craterRayedFactor 0
		volcanoMagn     0.197632
		volcanoFreq     0.723418
		volcanoDensity  0.144746
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.325449
		volcanoRadius   0.14391
		volcanoTemp     1417.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.320, 0.320, 0.000)
		colorShelf     (0.370, 0.370, 0.370, 0.000)
		colorBeach     (0.345, 0.343, 0.341, 0.000)
		colorDesert    (0.427, 0.411, 0.388, 0.200)
		colorLowland   (0.462, 0.439, 0.436, 0.500)
		colorUpland    (0.482, 0.459, 0.450, 0.800)
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
		SemiMajorAxis   0.0660712
		Period          1.16097
		Eccentricity    0.354518
		Inclination     -17.7805
		AscendingNode   -171.977
		ArgOfPericenter -30.6559
		MeanAnomaly     65.1554
	}
}

DwarfMoon	"Althir System 5.D16"
{
	ParentBody     "Althir System 5"
	Class	       "Asteroid"

	Mass            1.90767e-009
	Radius          17.2152
	InertiaMoment   0.39572

	RotationPeriod  865.704
	Obliquity       105.91
	EqAscendNode    84.7959

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.798 0.796 0.794)

	Surface
	{
		SurfStyle       0.506826
		OceanStyle      0.298867
		Randomize      (-0.979, -0.327, -0.003)
		colorDistMagn   0.342648
		colorDistFreq   0.149125
		detailScale     470.09
		colorConversion true
		snowLevel       2
		tropicLatitude  0.98506
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.439859
		terraceProb     0.267325
		erosion         0
		montesMagn      0.593614
		montesFreq      2.68389
		montesSpiky     0.993142
		montesFraction  0.63991
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.864041
		hillsFraction   0.872892
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234032
		craterFreq      0.244479
		craterDensity   0.785972
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.459316
		volcanoTemp     1500.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.311, 0.271, 0.222, 0.000)
		colorShelf     (0.319, 0.279, 0.254, 0.000)
		colorBeach     (0.375, 0.326, 0.302, 0.000)
		colorDesert    (0.407, 0.350, 0.294, 0.000)
		colorLowland   (0.447, 0.374, 0.334, 0.000)
		colorUpland    (0.495, 0.454, 0.405, 0.000)
		colorRock      (0.534, 0.493, 0.437, 0.000)
		colorSnow      (0.582, 0.525, 0.461, 1.000)
		BumpHeight      15.4937
		BumpOffset      3.09874
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0665342
		Period          1.1732
		Eccentricity    0.283091
		Inclination     86.963
		AscendingNode   80.5492
		ArgOfPericenter -167.427
		MeanAnomaly     -17.1542
	}
}

DwarfMoon	"Althir System 5.D17"
{
	ParentBody     "Althir System 5"
	Class	       "Asteroid"

	Mass            2.67757e-009
	Radius          18.3969
	InertiaMoment   0.398253

	RotationPeriod  796.4
	Obliquity       107.234
	EqAscendNode    100.127

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.687 0.682 0.679)

	Surface
	{
		SurfStyle       0.0521983
		OceanStyle      0.595716
		Randomize      (0.093, -0.918, 0.217)
		colorDistMagn   0.139312
		colorDistFreq   0.105466
		detailScale     502.357
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999129
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.608825
		terraceProb     0.299133
		erosion         0
		montesMagn      0.596546
		montesFreq      2.87078
		montesSpiky     0.953259
		montesFraction  0.546429
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.565026
		hillsFraction   0.580853
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237105
		craterFreq      0.173403
		craterDensity   0.878396
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.426563
		volcanoTemp     1516.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.275, 0.273, 0.272, 0.000)
		colorShelf     (0.292, 0.290, 0.289, 0.000)
		colorBeach     (0.309, 0.307, 0.306, 0.000)
		colorDesert    (0.327, 0.324, 0.323, 0.000)
		colorLowland   (0.344, 0.341, 0.340, 0.000)
		colorUpland    (0.361, 0.358, 0.357, 0.000)
		colorRock      (0.378, 0.375, 0.374, 0.000)
		colorSnow      (0.395, 0.392, 0.391, 1.000)
		BumpHeight      16.5572
		BumpOffset      3.31143
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0667465
		Period          1.17882
		Eccentricity    0.250021
		Inclination     74.4091
		AscendingNode   97.5802
		ArgOfPericenter 112.197
		MeanAnomaly     11.6723
	}
}

DwarfMoon	"Althir System 5.D18"
{
	ParentBody     "Althir System 5"
	Class	       "Asteroid"

	Mass            3.7269e-009
	Radius          24.1069
	InertiaMoment   0.399316

	RotationPeriod  871.885
	Obliquity       -17.5438
	EqAscendNode    -173.922

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.833 0.789 0.709)

	Surface
	{
		SurfStyle       0.341165
		OceanStyle      0.535706
		Randomize      (-0.448, -0.021, -0.498)
		colorDistMagn   0.227651
		colorDistFreq   0.30778
		detailScale     658.28
		colorConversion true
		snowLevel       2
		tropicLatitude  0.12333
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.404288
		terraceProb     0.108545
		erosion         0
		montesMagn      0.591903
		montesFreq      2.55054
		montesSpiky     0.876756
		montesFraction  0.745328
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.736139
		hillsFraction   0.613857
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241353
		craterFreq      0.219928
		craterDensity   0.962246
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.571501
		volcanoTemp     863.456
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.333, 0.315, 0.284, 0.000)
		colorShelf     (0.354, 0.335, 0.301, 0.000)
		colorBeach     (0.375, 0.355, 0.319, 0.000)
		colorDesert    (0.395, 0.375, 0.337, 0.000)
		colorLowland   (0.416, 0.394, 0.355, 0.000)
		colorUpland    (0.437, 0.414, 0.372, 0.000)
		colorRock      (0.458, 0.434, 0.390, 0.000)
		colorSnow      (0.479, 0.454, 0.408, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0670477
		Period          1.18681
		Eccentricity    0.351886
		Inclination     -24.6274
		AscendingNode   -179.707
		ArgOfPericenter 111.137
		MeanAnomaly     109.399
	}
}

DwarfMoon	"Althir System 5.D19"
{
	ParentBody     "Althir System 5"
	Class	       "Asteroid"

	Mass            5.15172e-009
	Radius          25.1329
	InertiaMoment   0.396524

	RotationPeriod  787.007
	Obliquity       16.8919
	EqAscendNode    61.5754

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.728 0.662 0.589)

	Surface
	{
		SurfStyle       0.41345
		OceanStyle      0.416958
		Randomize      (-0.835, -0.996, -0.890)
		colorDistMagn   0.761621
		colorDistFreq   0.210791
		detailScale     686.295
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997275
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.52651
		terraceProb     0.241717
		erosion         0
		montesMagn      0.583865
		montesFreq      3.14777
		montesSpiky     0.915915
		montesFraction  0.576203
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.64044
		hillsFraction   0.790101
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228261
		craterFreq      0.268148
		craterDensity   1.00131
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.580243
		volcanoTemp     1730.92
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.291, 0.265, 0.235, 0.000)
		colorShelf     (0.309, 0.281, 0.250, 0.000)
		colorBeach     (0.328, 0.298, 0.265, 0.000)
		colorDesert    (0.346, 0.315, 0.280, 0.000)
		colorLowland   (0.364, 0.331, 0.294, 0.000)
		colorUpland    (0.382, 0.348, 0.309, 0.000)
		colorRock      (0.400, 0.364, 0.324, 0.000)
		colorSnow      (0.419, 0.381, 0.338, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0676867
		Period          1.20382
		Eccentricity    0.0882479
		Inclination     75.1859
		AscendingNode   52.533
		ArgOfPericenter 90.7823
		MeanAnomaly     7.22888
	}
}

DwarfMoon	"Althir System 5.D20"
{
	ParentBody     "Althir System 5"
	Class	       "Asteroid"

	Mass            7.08117e-009
	Radius          26.8057
	InertiaMoment   0.398429

	RotationPeriod  728.364
	Obliquity       5.36823
	EqAscendNode    -166.45

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.792 0.790 0.787)

	Surface
	{
		SurfStyle       0.722939
		OceanStyle      0.0726247
		Randomize      (0.879, -0.267, -0.648)
		colorDistMagn   0.753777
		colorDistFreq   0.271549
		detailScale     731.975
		colorConversion true
		snowLevel       2
		tropicLatitude  0.571424
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.647576
		terraceProb     0.14938
		erosion         0
		montesMagn      0.439786
		montesFreq      3.2555
		montesSpiky     0.993377
		montesFraction  0.311522
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.55505
		hillsFraction   0.655926
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247593
		craterFreq      0.207395
		craterDensity   0.830039
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.453775
		volcanoTemp     1480.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.309, 0.268, 0.220, 0.000)
		colorShelf     (0.317, 0.276, 0.252, 0.000)
		colorBeach     (0.372, 0.324, 0.299, 0.000)
		colorDesert    (0.404, 0.347, 0.291, 0.000)
		colorLowland   (0.444, 0.371, 0.331, 0.000)
		colorUpland    (0.491, 0.450, 0.401, 0.000)
		colorRock      (0.531, 0.490, 0.433, 0.000)
		colorSnow      (0.578, 0.521, 0.456, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0683291
		Period          1.221
		Eccentricity    0.257162
		Inclination     -29.5084
		AscendingNode   -173.795
		ArgOfPericenter -97.9908
		MeanAnomaly     -120.116
	}
}

DwarfMoon	"Althir System 5.D21"
{
	ParentBody     "Althir System 5"
	Class	       "Asteroid"

	Mass            9.68948e-009
	Radius          28.4785
	InertiaMoment   0.399447

	RotationPeriod  671.002
	Obliquity       -186.055
	EqAscendNode    174.875

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.662 0.581 0.443)

	Surface
	{
		SurfStyle       0.138504
		OceanStyle      0.630167
		Randomize      (0.349, 0.281, 0.839)
		colorDistMagn   0.52641
		colorDistFreq   0.559832
		detailScale     777.654
		colorConversion true
		snowLevel       2
		tropicLatitude  0.939379
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.675244
		terraceProb     0.584293
		erosion         0
		montesMagn      0.476411
		montesFreq      2.48636
		montesSpiky     0.9665
		montesFraction  0.419459
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.83566
		hillsFraction   0.563111
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257914
		craterFreq      0.207135
		craterDensity   0.890653
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.591731
		volcanoTemp     1287.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.265, 0.232, 0.177, 0.000)
		colorShelf     (0.281, 0.247, 0.188, 0.000)
		colorBeach     (0.298, 0.261, 0.200, 0.000)
		colorDesert    (0.314, 0.276, 0.211, 0.000)
		colorLowland   (0.331, 0.290, 0.222, 0.000)
		colorUpland    (0.347, 0.305, 0.233, 0.000)
		colorRock      (0.364, 0.319, 0.244, 0.000)
		colorSnow      (0.381, 0.334, 0.255, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0686327
		Period          1.22914
		Eccentricity    0.00693354
		Inclination     -76.0023
		AscendingNode   179.163
		ArgOfPericenter -111.307
		MeanAnomaly     138.183
	}
}

DwarfMoon	"Althir System 5.D22"
{
	ParentBody     "Althir System 5"
	Class	       "Asteroid"

	Mass            1.32126e-008
	Radius          37.4316
	InertiaMoment   0.396988

	RotationPeriod  742.578
	Obliquity       50.2405
	EqAscendNode    -55.4312

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.430 0.426 0.424)

	Surface
	{
		SurfStyle       0.261571
		OceanStyle      0.0612804
		Randomize      (0.785, 0.368, -0.349)
		colorDistMagn   0.424675
		colorDistFreq   1.0438
		detailScale     1022.13
		colorConversion true
		snowLevel       2
		tropicLatitude  0.693056
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.35087
		terraceProb     0.310761
		erosion         0
		montesMagn      0.616147
		montesFreq      1.91657
		montesSpiky     0.981981
		montesFraction  0.802131
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.43244
		hillsFraction   0.758801
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255904
		craterFreq      0.224065
		craterDensity   0.893644
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.492023
		volcanoTemp     1552.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.172, 0.170, 0.169, 0.000)
		colorShelf     (0.183, 0.181, 0.180, 0.000)
		colorBeach     (0.194, 0.192, 0.191, 0.000)
		colorDesert    (0.204, 0.202, 0.201, 0.000)
		colorLowland   (0.215, 0.213, 0.212, 0.000)
		colorUpland    (0.226, 0.224, 0.222, 0.000)
		colorRock      (0.237, 0.234, 0.233, 0.000)
		colorSnow      (0.247, 0.245, 0.244, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.068984
		Period          1.23859
		Eccentricity    0.0441248
		Inclination     -12.4261
		AscendingNode   -54.3972
		ArgOfPericenter 103.724
		MeanAnomaly     -15.8826
	}
}

DwarfMoon	"Althir System 5.D23"
{
	ParentBody     "Althir System 5"
	Class	       "Asteroid"

	Mass            1.79714e-008
	Radius          38.3775
	InertiaMoment   0.398594

	RotationPeriod  665.709
	Obliquity       -127.153
	EqAscendNode    116.202

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.506 0.502 0.494)

	Surface
	{
		SurfStyle       0.851207
		OceanStyle      0.0428333
		Randomize      (0.965, 0.828, -0.432)
		colorDistMagn   0.600035
		colorDistFreq   0.35635
		detailScale     1047.96
		colorConversion true
		snowLevel       2
		tropicLatitude  0.945001
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.486928
		terraceProb     0.318118
		erosion         0
		montesMagn      0.534332
		montesFreq      2.92444
		montesSpiky     0.926845
		montesFraction  0.680676
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.9379
		hillsFraction   0.466144
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.269905
		craterFreq      0.243075
		craterDensity   0.963108
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.42199
		volcanoTemp     1583.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.172, 0.176, 0.198, 0.050)
		colorShelf     (0.202, 0.206, 0.227, 0.040)
		colorBeach     (0.233, 0.236, 0.257, 0.030)
		colorDesert    (0.263, 0.266, 0.292, 0.020)
		colorLowland   (0.293, 0.296, 0.321, 0.030)
		colorUpland    (0.324, 0.326, 0.351, 0.050)
		colorRock      (0.354, 0.356, 0.391, 0.020)
		colorSnow      (0.354, 0.356, 0.391, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0695553
		Period          1.25401
		Eccentricity    0.497815
		Inclination     -84.5849
		AscendingNode   118.949
		ArgOfPericenter -2.47246
		MeanAnomaly     128.432
	}
}

DwarfMoon	"Althir System 5.D24"
{
	ParentBody     "Althir System 5"
	Class	       "Asteroid"

	Mass            2.4405e-008
	Radius          40.7182
	InertiaMoment   0.399576

	RotationPeriod  613.987
	Obliquity       89.543
	EqAscendNode    -127.27

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.757 0.655 0.587)

	Surface
	{
		SurfStyle       0.215522
		OceanStyle      0.313403
		Randomize      (-0.416, -0.662, 0.435)
		colorDistMagn   0.11256
		colorDistFreq   0.818886
		detailScale     1111.88
		colorConversion true
		snowLevel       2
		tropicLatitude  0.745367
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.690075
		terraceProb     0.315604
		erosion         0
		montesMagn      0.460827
		montesFreq      2.96668
		montesSpiky     0.967026
		montesFraction  0.505627
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.0503
		hillsFraction   0.623774
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249822
		craterFreq      0.172373
		craterDensity   0.875563
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.600725
		volcanoTemp     1339.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.303, 0.262, 0.235, 0.000)
		colorShelf     (0.322, 0.278, 0.250, 0.000)
		colorBeach     (0.341, 0.295, 0.264, 0.000)
		colorDesert    (0.360, 0.311, 0.279, 0.000)
		colorLowland   (0.379, 0.327, 0.294, 0.000)
		colorUpland    (0.398, 0.344, 0.308, 0.000)
		colorRock      (0.417, 0.360, 0.323, 0.000)
		colorSnow      (0.436, 0.377, 0.338, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0700487
		Period          1.26738
		Eccentricity    0.440106
		Inclination     78.4559
		AscendingNode   -132.751
		ArgOfPericenter 19.073
		MeanAnomaly     -49.2978
	}
}

DwarfMoon	"Althir System 5.D25"
{
	ParentBody     "Althir System 5"
	Class	       "Asteroid"

	Mass            3.31175e-008
	Radius          43.215
	InertiaMoment   0.39733

	RotationPeriod  564.081
	Obliquity       -94.5453
	EqAscendNode    44.833

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.548 0.545 0.543)

	Surface
	{
		SurfStyle       0.598425
		OceanStyle      0.241364
		Randomize      (-0.818, 0.358, 0.703)
		colorDistMagn   0.404673
		colorDistFreq   1.43308
		detailScale     1180.06
		colorConversion true
		snowLevel       2
		tropicLatitude  0.839393
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.591802
		terraceProb     0.236879
		erosion         0
		montesMagn      0.517934
		montesFreq      3.45523
		montesSpiky     0.953802
		montesFraction  0.152367
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.32518
		hillsFraction   0.482477
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241244
		craterFreq      0.179168
		craterDensity   0.756904
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.518685
		volcanoTemp     1188.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.214, 0.185, 0.152, 0.000)
		colorShelf     (0.219, 0.191, 0.174, 0.000)
		colorBeach     (0.258, 0.223, 0.206, 0.000)
		colorDesert    (0.280, 0.240, 0.201, 0.000)
		colorLowland   (0.307, 0.256, 0.228, 0.000)
		colorUpland    (0.340, 0.311, 0.277, 0.000)
		colorRock      (0.367, 0.338, 0.299, 0.000)
		colorSnow      (0.400, 0.360, 0.315, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0706264
		Period          1.28309
		Eccentricity    0.062883
		Inclination     -39.9657
		AscendingNode   41.0628
		ArgOfPericenter 89.3944
		MeanAnomaly     -98.0881
	}
}

Moon	"Althir System 5.7"
{
	ParentBody     "Althir System 5"
	Class	       "Selena"

	Mass            0.00535084
	Radius          1530.03
	InertiaMoment   0.391953

	Oblateness      0.00210859

	RotationPeriod  54.2427
	Obliquity       -49.7338
	EqAscendNode    126.834

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.489 0.485 0.477)

	Surface
	{
		SurfStyle       0.375693
		OceanStyle      0.100352
		Randomize      (-0.095, 0.521, -0.056)
		colorDistMagn   0.0649361
		colorDistFreq   192.663
		detailScale     3935.33
		colorConversion true
		drivenDarkening 0
		seaLevel        0.174096
		snowLevel       2
		tropicLatitude  0.70676
		icecapLatitude  1
		icecapHeight    0.174096
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.60699
		venusFreq       0.619334
		venusMagn       0
		mareFreq        0.765881
		mareDensity     0.00125461
		terraceProb     0.392301
		erosion         0
		montesMagn      0.0660672
		montesFreq      88.0821
		montesSpiky     0.993774
		montesFraction  0.268645
		dunesMagn       0.055619
		dunesFreq       2017.43
		dunesFraction   0.326334
		hillsMagn       0.113827
		hillsFreq       150.657
		hillsFraction   0.232557
		hills2Fraction  0
		riversMagn      68.2202
		riversFreq      2.68212
		riversSin       5.15254
		riversOctaves   0
		canyonsMagn     0.478513
		canyonsFreq     0.553843
		canyonFraction  0.848059
		cracksMagn      0.0662248
		cracksFreq      0.96557
		cracksOctaves   0
		craterMagn      0.690505
		craterFreq      4.37801
		craterDensity   0.846271
		craterOctaves   11
		craterRayedFactor 0
		volcanoMagn     0.171014
		volcanoFreq     0.665519
		volcanoDensity  0.220151
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.0832416
		volcanoRadius   0.146224
		volcanoTemp     1575.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.420, 0.420, 0.430, 0.000)
		colorShelf     (0.470, 0.480, 0.480, 0.000)
		colorBeach     (0.269, 0.276, 0.286, 0.000)
		colorDesert    (0.235, 0.223, 0.219, 0.000)
		colorLowland   (0.298, 0.296, 0.267, 0.000)
		colorUpland    (0.318, 0.315, 0.291, 0.000)
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
		SemiMajorAxis   0.0712477
		Period          1.30001
		Eccentricity    0.0108185
		Inclination     -7.19413
		AscendingNode   133.852
		ArgOfPericenter -12.3959
		MeanAnomaly     149.532
	}
}

DwarfMoon	"Althir System 5.D26"
{
	ParentBody     "Althir System 5"
	Class	       "Asteroid"

	Mass            6.10606e-008
	Radius          58.1162
	InertiaMoment   0.399703

	RotationPeriod  561.968
	Obliquity       50.1728
	EqAscendNode    -139.808

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.746 0.744 0.742)

	Surface
	{
		SurfStyle       0.775091
		OceanStyle      0.165558
		Randomize      (0.178, -0.774, 0.447)
		colorDistMagn   0.729026
		colorDistFreq   2.48761
		detailScale     1586.96
		colorConversion true
		snowLevel       2
		tropicLatitude  0.651365
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.592417
		terraceProb     0.184297
		erosion         0
		montesMagn      0.381243
		montesFreq      3.08018
		montesSpiky     0.966384
		montesFraction  0.324404
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.6461
		hillsFraction   0.329253
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256583
		craterFreq      0.190594
		craterDensity   0.905231
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.489119
		volcanoTemp     1506.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.291, 0.253, 0.208, 0.000)
		colorShelf     (0.298, 0.261, 0.238, 0.000)
		colorBeach     (0.351, 0.305, 0.282, 0.000)
		colorDesert    (0.380, 0.328, 0.275, 0.000)
		colorLowland   (0.418, 0.350, 0.312, 0.000)
		colorUpland    (0.463, 0.424, 0.379, 0.000)
		colorRock      (0.500, 0.462, 0.408, 0.000)
		colorSnow      (0.545, 0.491, 0.431, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0717817
		Period          1.3147
		Eccentricity    0.370633
		Inclination     76.9081
		AscendingNode   -145.127
		ArgOfPericenter -150.591
		MeanAnomaly     145.098
	}
}

DwarfMoon	"Althir System 5.D27"
{
	ParentBody     "Althir System 5"
	Class	       "Asteroid"

	Mass            8.31082e-008
	Radius          61.6058
	InertiaMoment   0.397608

	RotationPeriod  514.096
	Obliquity       -13.4318
	EqAscendNode    -91.7892

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.665 0.661 0.656)

	Surface
	{
		SurfStyle       0.927027
		OceanStyle      0.0204684
		Randomize      (-0.069, 0.004, -0.603)
		colorDistMagn   0.633263
		colorDistFreq   0.697393
		detailScale     1682.25
		colorConversion true
		snowLevel       2
		tropicLatitude  0.233374
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.608895
		terraceProb     0.270407
		erosion         0
		montesMagn      0.526328
		montesFreq      3.37967
		montesSpiky     0.840573
		montesFraction  0.74132
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.12094
		hillsFraction   0.656585
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.211049
		craterFreq      0.192335
		craterDensity   0.852762
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.440949
		volcanoTemp     1294.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.226, 0.232, 0.262, 0.050)
		colorShelf     (0.266, 0.271, 0.302, 0.040)
		colorBeach     (0.306, 0.311, 0.341, 0.030)
		colorDesert    (0.346, 0.351, 0.387, 0.020)
		colorLowland   (0.386, 0.390, 0.426, 0.030)
		colorUpland    (0.425, 0.430, 0.466, 0.050)
		colorRock      (0.465, 0.470, 0.518, 0.020)
		colorSnow      (0.465, 0.470, 0.518, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0719895
		Period          1.32041
		Eccentricity    0.316603
		Inclination     -0.625919
		AscendingNode   -85.4345
		ArgOfPericenter 58.1246
		MeanAnomaly     -165.711
	}
}

DwarfMoon	"Althir System 5.D28"
{
	ParentBody     "Althir System 5"
	Class	       "Asteroid"

	Mass            1.13434e-007
	Radius          65.5842
	InertiaMoment   0.398898

	RotationPeriod  473.101
	Obliquity       -83.9247
	EqAscendNode    -130.684

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.601 0.501 0.437)

	Surface
	{
		SurfStyle       0.862031
		OceanStyle      0.0611329
		Randomize      (-0.500, -0.400, -0.672)
		colorDistMagn   0.869602
		colorDistFreq   3.17835
		detailScale     1790.89
		colorConversion true
		snowLevel       2
		tropicLatitude  0.803518
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.472353
		terraceProb     0.420888
		erosion         0
		montesMagn      0.369818
		montesFreq      2.97735
		montesSpiky     0.935107
		montesFraction  0.455388
		dunesFraction   0
		hillsMagn       0
		hillsFreq       12.39
		hillsFraction   0.562798
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249721
		craterFreq      0.27688
		craterDensity   1.05634
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.447402
		volcanoTemp     1375.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.204, 0.175, 0.175, 0.050)
		colorShelf     (0.240, 0.205, 0.201, 0.040)
		colorBeach     (0.277, 0.235, 0.227, 0.030)
		colorDesert    (0.313, 0.265, 0.258, 0.020)
		colorLowland   (0.349, 0.295, 0.284, 0.030)
		colorUpland    (0.385, 0.325, 0.310, 0.050)
		colorRock      (0.421, 0.355, 0.345, 0.020)
		colorSnow      (0.421, 0.355, 0.345, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0723409
		Period          1.33009
		Eccentricity    0.412315
		Inclination     -45.2033
		AscendingNode   -137.556
		ArgOfPericenter 168.194
		MeanAnomaly     -10.4957
	}
}

DwarfMoon	"Althir System 5.D29"
{
	ParentBody     "Althir System 5"
	Class	       "Asteroid"

	Mass            1.5541e-007
	Radius          93.4074
	InertiaMoment   0.399828

	RotationPeriod  567.023
	Obliquity       62.4839
	EqAscendNode    182.64

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.803 0.772 0.745)

	Surface
	{
		SurfStyle       0.16818
		OceanStyle      0.958004
		Randomize      (0.793, 0.134, 0.753)
		colorDistMagn   0.586509
		colorDistFreq   2.41148
		detailScale     2550.64
		colorConversion true
		snowLevel       2
		tropicLatitude  0.420644
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.691385
		terraceProb     0.171305
		erosion         0
		montesMagn      0.44149
		montesFreq      3.10139
		montesSpiky     0.906478
		montesFraction  0.86042
		dunesFraction   0
		hillsMagn       0
		hillsFreq       20.5246
		hillsFraction   0.819898
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241518
		craterFreq      0.247907
		craterDensity   0.791622
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.541018
		volcanoTemp     1571.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.321, 0.309, 0.298, 0.000)
		colorShelf     (0.341, 0.328, 0.317, 0.000)
		colorBeach     (0.361, 0.348, 0.335, 0.000)
		colorDesert    (0.381, 0.367, 0.354, 0.000)
		colorLowland   (0.401, 0.386, 0.372, 0.000)
		colorUpland    (0.421, 0.405, 0.391, 0.000)
		colorRock      (0.441, 0.425, 0.410, 0.000)
		colorSnow      (0.462, 0.444, 0.428, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0728873
		Period          1.34519
		Eccentricity    0.0686783
		Inclination     87.2429
		AscendingNode   177.488
		ArgOfPericenter 101.199
		MeanAnomaly     -135.056
	}
}

DwarfMoon	"Althir System 5.D30"
{
	ParentBody     "Althir System 5"
	Class	       "Asteroid"

	Mass            2.13954e-007
	Radius          88.9691
	InertiaMoment   0.397846

	RotationPeriod  468.032
	Obliquity       115.5
	EqAscendNode    -25.5269

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.630 0.628 0.625)

	Surface
	{
		SurfStyle       0.328584
		OceanStyle      0.320906
		Randomize      (-0.929, -0.275, 0.597)
		colorDistMagn   0.65812
		colorDistFreq   6.01518
		detailScale     2429.45
		colorConversion true
		snowLevel       2
		tropicLatitude  0.493963
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.337695
		terraceProb     0.669254
		erosion         0
		montesMagn      0.639052
		montesFreq      2.93062
		montesSpiky     0.91857
		montesFraction  0.76025
		dunesFraction   0
		hillsMagn       0
		hillsFreq       15.2635
		hillsFraction   0.79183
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249106
		craterFreq      0.314015
		craterDensity   0.794968
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.525555
		volcanoTemp     1165.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.252, 0.251, 0.250, 0.000)
		colorShelf     (0.268, 0.267, 0.266, 0.000)
		colorBeach     (0.284, 0.282, 0.281, 0.000)
		colorDesert    (0.299, 0.298, 0.297, 0.000)
		colorLowland   (0.315, 0.314, 0.313, 0.000)
		colorUpland    (0.331, 0.330, 0.328, 0.000)
		colorRock      (0.347, 0.345, 0.344, 0.000)
		colorSnow      (0.363, 0.361, 0.359, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0734948
		Period          1.36204
		Eccentricity    0.15818
		Inclination     46.5827
		AscendingNode   -28.9667
		ArgOfPericenter 14.38
		MeanAnomaly     94.1844
	}
}

DwarfMoon	"Althir System 5.D31"
{
	ParentBody     "Althir System 5"
	Class	       "Asteroid"

	Mass            2.96328e-007
	Radius          94.6534
	InertiaMoment   0.399041

	RotationPeriod  427.2
	Obliquity       110.093
	EqAscendNode    23.8859

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.628 0.626 0.623)

	Surface
	{
		SurfStyle       0.240593
		OceanStyle      0.839003
		Randomize      (0.625, 0.652, 0.384)
		colorDistMagn   0.944627
		colorDistFreq   3.27852
		detailScale     2584.67
		colorConversion true
		snowLevel       2
		tropicLatitude  0.354986
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.359295
		terraceProb     0.587734
		erosion         0
		montesMagn      0.458219
		montesFreq      3.64459
		montesSpiky     0.979809
		montesFraction  0.546258
		dunesFraction   0
		hillsMagn       0
		hillsFreq       26.0432
		hillsFraction   0.723991
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25671
		craterFreq      0.215882
		craterDensity   0.982122
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.42027
		volcanoTemp     1735.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.251, 0.250, 0.249, 0.000)
		colorShelf     (0.267, 0.266, 0.265, 0.000)
		colorBeach     (0.282, 0.282, 0.280, 0.000)
		colorDesert    (0.298, 0.297, 0.296, 0.000)
		colorLowland   (0.314, 0.313, 0.312, 0.000)
		colorUpland    (0.330, 0.329, 0.327, 0.000)
		colorRock      (0.345, 0.344, 0.343, 0.000)
		colorSnow      (0.361, 0.360, 0.358, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0740646
		Period          1.37791
		Eccentricity    0.285394
		Inclination     67.0766
		AscendingNode   22.1628
		ArgOfPericenter -78.3507
		MeanAnomaly     30.258
	}
}

DwarfMoon	"Althir System 5.D32"
{
	ParentBody     "Althir System 5"
	Class	       "Asteroid"

	Mass            4.13437e-007
	Radius          101.573
	InertiaMoment   0.399953

	RotationPeriod  391.139
	Obliquity       -38.2155
	EqAscendNode    -14.3992

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.555 0.483 0.412)

	Surface
	{
		SurfStyle       0.971633
		OceanStyle      0.2752
		Randomize      (-0.568, -0.752, 0.370)
		colorDistMagn   0.968806
		colorDistFreq   4.34799
		detailScale     2773.62
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998967
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.762505
		terraceProb     0.28433
		erosion         0
		montesMagn      0.554501
		montesFreq      3.76805
		montesSpiky     0.992236
		montesFraction  0.458075
		dunesFraction   0
		hillsMagn       0
		hillsFreq       22.6806
		hillsFraction   0.662875
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.215409
		craterFreq      0.310018
		craterDensity   0.757868
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.419583
		volcanoTemp     1435.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.189, 0.169, 0.165, 0.050)
		colorShelf     (0.222, 0.198, 0.189, 0.040)
		colorBeach     (0.255, 0.227, 0.214, 0.030)
		colorDesert    (0.288, 0.256, 0.243, 0.020)
		colorLowland   (0.322, 0.285, 0.268, 0.030)
		colorUpland    (0.355, 0.314, 0.292, 0.050)
		colorRock      (0.388, 0.343, 0.325, 0.020)
		colorSnow      (0.388, 0.343, 0.325, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0742997
		Period          1.38448
		Eccentricity    0.213737
		Inclination     -55.3062
		AscendingNode   -14.404
		ArgOfPericenter 147.107
		MeanAnomaly     -31.7692
	}
}

DwarfMoon	"Althir System 5.D33"
{
	ParentBody     "Althir System 5"
	Class	       "Asteroid"

	Mass            5.81948e-007
	Radius          105.98
	InertiaMoment   0.398057

	RotationPeriod  346.104
	Obliquity       23.5209
	EqAscendNode    -139.655

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.581 0.576 0.572)

	Surface
	{
		SurfStyle       0.226595
		OceanStyle      0.870181
		Randomize      (0.483, -0.030, 0.452)
		colorDistMagn   0.14987
		colorDistFreq   7.65212
		detailScale     2893.97
		colorConversion true
		snowLevel       2
		tropicLatitude  0.295104
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.505515
		terraceProb     0.113243
		erosion         0
		montesMagn      0.676628
		montesFreq      2.8989
		montesSpiky     0.887049
		montesFraction  0.309827
		dunesFraction   0
		hillsMagn       0
		hillsFreq       28.4567
		hillsFraction   0.861024
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2426
		craterFreq      0.450228
		craterDensity   0.986281
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.552499
		volcanoTemp     1644.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.232, 0.231, 0.229, 0.000)
		colorShelf     (0.247, 0.245, 0.243, 0.000)
		colorBeach     (0.262, 0.259, 0.258, 0.000)
		colorDesert    (0.276, 0.274, 0.272, 0.000)
		colorLowland   (0.291, 0.288, 0.286, 0.000)
		colorUpland    (0.305, 0.303, 0.300, 0.000)
		colorRock      (0.320, 0.317, 0.315, 0.000)
		colorSnow      (0.334, 0.331, 0.329, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0749216
		Period          1.4019
		Eccentricity    0.448478
		Inclination     32.3717
		AscendingNode   -147.92
		ArgOfPericenter 91.0562
		MeanAnomaly     -29.7196
	}
}

DwarfMoon	"Althir System 5.D34"
{
	ParentBody     "Althir System 5"
	Class	       "Asteroid"

	Mass            8.27874e-007
	Radius          140.893
	InertiaMoment   0.399179

	RotationPeriod  383.967
	Obliquity       11.1996
	EqAscendNode    -97.1631

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.664 0.574 0.542)

	Surface
	{
		SurfStyle       0.536668
		OceanStyle      0.633017
		Randomize      (-0.669, -0.841, 0.070)
		colorDistMagn   0.974625
		colorDistFreq   13.2293
		detailScale     3847.32
		colorConversion true
		snowLevel       2
		tropicLatitude  0.711488
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.372282
		terraceProb     0.201841
		erosion         0
		montesMagn      0.631584
		montesFreq      3.12856
		montesSpiky     0.778862
		montesFraction  0.47937
		dunesFraction   0
		hillsMagn       0
		hillsFreq       58.393
		hillsFraction   0.601721
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.21117
		craterFreq      0.605003
		craterDensity   0.905271
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.387521
		volcanoTemp     1409.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.259, 0.195, 0.152, 0.000)
		colorShelf     (0.266, 0.201, 0.173, 0.000)
		colorBeach     (0.312, 0.235, 0.206, 0.000)
		colorDesert    (0.339, 0.253, 0.201, 0.000)
		colorLowland   (0.372, 0.270, 0.228, 0.000)
		colorUpland    (0.412, 0.327, 0.276, 0.000)
		colorRock      (0.445, 0.356, 0.298, 0.000)
		colorSnow      (0.485, 0.379, 0.314, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0752166
		Period          1.41018
		Eccentricity    0.475996
		Inclination     45.9925
		AscendingNode   -98.7184
		ArgOfPericenter -11.4795
		MeanAnomaly     -26.7253
	}
}

DwarfMoon	"Althir System 5.D35"
{
	ParentBody     "Althir System 5"
	Class	       "Asteroid"

	Mass            1.19277e-006
	Radius          151.443
	InertiaMoment   0.395693

	RotationPeriod  344.854
	Obliquity       -100.127
	EqAscendNode    -132.989

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.700 0.599 0.461)

	Surface
	{
		SurfStyle       0.845498
		OceanStyle      0.40858
		Randomize      (0.839, 0.622, -0.869)
		colorDistMagn   0.51979
		colorDistFreq   14.496
		detailScale     4135.4
		colorConversion true
		snowLevel       2
		tropicLatitude  0.780737
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.637756
		terraceProb     0.185963
		erosion         0
		montesMagn      0.475879
		montesFreq      1.53657
		montesSpiky     0.933501
		montesFraction  0.416812
		dunesFraction   0
		hillsMagn       0
		hillsFreq       43.6143
		hillsFraction   0.721498
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248907
		craterFreq      0.646277
		craterDensity   0.930789
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.540926
		volcanoTemp     1507.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.273, 0.204, 0.129, 0.000)
		colorShelf     (0.280, 0.210, 0.148, 0.000)
		colorBeach     (0.329, 0.245, 0.175, 0.000)
		colorDesert    (0.357, 0.263, 0.171, 0.000)
		colorLowland   (0.392, 0.281, 0.194, 0.000)
		colorUpland    (0.434, 0.341, 0.235, 0.000)
		colorRock      (0.469, 0.371, 0.254, 0.000)
		colorSnow      (0.511, 0.395, 0.268, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0758327
		Period          1.42755
		Eccentricity    0.159286
		Inclination     -79.2934
		AscendingNode   -132.825
		ArgOfPericenter -99.7425
		MeanAnomaly     98.8495
	}
}

DwarfMoon	"Althir System 5.D36"
{
	ParentBody     "Althir System 5"
	Class	       "Asteroid"

	Mass            1.74489e-006
	Radius          165.143
	InertiaMoment   0.398249

	RotationPeriod  313.627
	Obliquity       114.516
	EqAscendNode    -170.941

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.619 0.514 0.440)

	Surface
	{
		SurfStyle       0.0580311
		OceanStyle      0.439366
		Randomize      (-0.311, -0.668, 0.440)
		colorDistMagn   0.618733
		colorDistFreq   17.7746
		detailScale     4509.51
		colorConversion true
		snowLevel       2
		tropicLatitude  0.595381
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.581741
		terraceProb     0.136705
		erosion         0
		montesMagn      0.360324
		montesFreq      2.61298
		montesSpiky     0.896779
		montesFraction  0.852738
		dunesFraction   0
		hillsMagn       0
		hillsFreq       93.849
		hillsFraction   0.622883
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241015
		craterFreq      0.799278
		craterDensity   0.718114
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.446446
		volcanoTemp     1768.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.247, 0.205, 0.176, 0.000)
		colorShelf     (0.263, 0.218, 0.187, 0.000)
		colorBeach     (0.278, 0.231, 0.198, 0.000)
		colorDesert    (0.294, 0.244, 0.209, 0.000)
		colorLowland   (0.309, 0.257, 0.220, 0.000)
		colorUpland    (0.325, 0.270, 0.231, 0.000)
		colorRock      (0.340, 0.283, 0.242, 0.000)
		colorSnow      (0.356, 0.295, 0.253, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0760945
		Period          1.43495
		Eccentricity    0.289721
		Inclination     81.4467
		AscendingNode   -164.065
		ArgOfPericenter -103.724
		MeanAnomaly     85.9868
	}
}

DwarfMoon	"Althir System 5.D37"
{
	ParentBody     "Althir System 5"
	Class	       "Asteroid"

	Mass            2.59994e-006
	Radius          178.066
	InertiaMoment   0.399313

	RotationPeriod  279.118
	Obliquity       22.0469
	EqAscendNode    -17.2642

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.601 0.595 0.590)

	Surface
	{
		SurfStyle       0.670515
		OceanStyle      0.444526
		Randomize      (0.751, -0.937, -0.683)
		colorDistMagn   0.220574
		colorDistFreq   8.66355
		detailScale     4862.39
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0576201
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.412487
		terraceProb     0.239073
		erosion         0
		montesMagn      0.475932
		montesFreq      2.91833
		montesSpiky     0.973302
		montesFraction  0.591824
		dunesFraction   0
		hillsMagn       0
		hillsFreq       61.0008
		hillsFraction   0.530974
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228823
		craterFreq      0.999222
		craterDensity   1.06433
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.608771
		volcanoTemp     1419.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.234, 0.202, 0.165, 0.000)
		colorShelf     (0.240, 0.208, 0.189, 0.000)
		colorBeach     (0.282, 0.244, 0.224, 0.000)
		colorDesert    (0.306, 0.262, 0.218, 0.000)
		colorLowland   (0.337, 0.280, 0.248, 0.000)
		colorUpland    (0.373, 0.339, 0.301, 0.000)
		colorRock      (0.403, 0.369, 0.324, 0.000)
		colorSnow      (0.439, 0.393, 0.342, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0766263
		Period          1.45001
		Eccentricity    0.295054
		Inclination     -25.0082
		AscendingNode   -3.67353
		ArgOfPericenter -8.15093
		MeanAnomaly     6.09293
	}
}

DwarfMoon	"Althir System 5.D38"
{
	ParentBody     "Althir System 5"
	Class	       "Asteroid"

	Mass            3.96169e-006
	Radius          239.758
	InertiaMoment   0.396511

	RotationPeriod  302.348
	Obliquity       -41.9674
	EqAscendNode    -37.737

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.679 0.599 0.540)

	Surface
	{
		SurfStyle       0.921526
		OceanStyle      0.853047
		Randomize      (0.006, 0.073, -0.887)
		colorDistMagn   0.807863
		colorDistFreq   24.0901
		detailScale     6547
		colorConversion true
		snowLevel       2
		tropicLatitude  0.990621
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.647038
		terraceProb     0.243663
		erosion         0
		montesMagn      0.558265
		montesFreq      2.96313
		montesSpiky     0.943627
		montesFraction  0.770534
		dunesFraction   0
		hillsMagn       0
		hillsFreq       115.957
		hillsFraction   0.624651
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257059
		craterFreq      2.05369
		craterDensity   0.959523
		craterOctaves   17
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.455949
		volcanoTemp     1489.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.231, 0.210, 0.216, 0.050)
		colorShelf     (0.272, 0.245, 0.249, 0.040)
		colorBeach     (0.312, 0.281, 0.281, 0.030)
		colorDesert    (0.353, 0.317, 0.319, 0.020)
		colorLowland   (0.394, 0.353, 0.351, 0.030)
		colorUpland    (0.435, 0.389, 0.384, 0.050)
		colorRock      (0.475, 0.425, 0.427, 0.020)
		colorSnow      (0.475, 0.425, 0.427, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0770195
		Period          1.46119
		Eccentricity    0.103681
		Inclination     -63.0564
		AscendingNode   -37.4042
		ArgOfPericenter -163.966
		MeanAnomaly     100.577
	}
}

DwarfMoon	"Althir System 5.D39"
{
	ParentBody     "Althir System 5"
	Class	       "Asteroid"

	Mass            6.20561e-006
	Radius          263.984
	InertiaMoment   0.398425

	RotationPeriod  268.199
	Obliquity       50.4057
	EqAscendNode    -177.187

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.505 0.422 0.366)

	Surface
	{
		SurfStyle       0.420516
		OceanStyle      0.393499
		Randomize      (-0.806, 0.602, -0.992)
		colorDistMagn   0.433495
		colorDistFreq   49.891
		detailScale     7208.52
		colorConversion true
		snowLevel       2
		tropicLatitude  0.160557
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.63217
		terraceProb     0.476816
		erosion         0
		montesMagn      0.322739
		montesFreq      2.97708
		montesSpiky     0.975641
		montesFraction  0.497088
		dunesFraction   0
		hillsMagn       0
		hillsFreq       165.21
		hillsFraction   0.498494
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259921
		craterFreq      2.97641
		craterDensity   0.931192
		craterOctaves   17
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.571338
		volcanoTemp     1281.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.202, 0.169, 0.146, 0.000)
		colorShelf     (0.215, 0.179, 0.156, 0.000)
		colorBeach     (0.227, 0.190, 0.165, 0.000)
		colorDesert    (0.240, 0.200, 0.174, 0.000)
		colorLowland   (0.253, 0.211, 0.183, 0.000)
		colorUpland    (0.265, 0.221, 0.192, 0.000)
		colorRock      (0.278, 0.232, 0.201, 0.000)
		colorSnow      (0.291, 0.242, 0.210, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0774633
		Period          1.47384
		Eccentricity    0.165146
		Inclination     55.2804
		AscendingNode   -170.14
		ArgOfPericenter -47.3154
		MeanAnomaly     100.927
	}
}

DwarfMoon	"Althir System 5.D40"
{
	ParentBody     "Althir System 5"
	Class	       "Asteroid"

	Mass            2.05335e-011
	Radius          3.77833
	InertiaMoment   0.399444

	RotationPeriod  1650.04
	Obliquity       -118.508
	EqAscendNode    83.2094

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.530 0.525 0.523)

	Surface
	{
		SurfStyle       0.565799
		OceanStyle      0.546649
		Randomize      (0.981, -0.883, -0.758)
		colorDistMagn   0.43675
		colorDistFreq   0.00757869
		detailScale     103.174
		colorConversion true
		snowLevel       2
		tropicLatitude  0.990206
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.258743
		terraceProb     0.115854
		erosion         0
		montesMagn      0.391664
		montesFreq      2.96622
		montesSpiky     0.868287
		montesFraction  0.480701
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0373506
		hillsFraction   0.701463
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261085
		craterFreq      0.195176
		craterDensity   0.873512
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.493302
		volcanoTemp     1459.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.207, 0.179, 0.146, 0.000)
		colorShelf     (0.212, 0.184, 0.167, 0.000)
		colorBeach     (0.249, 0.215, 0.199, 0.000)
		colorDesert    (0.270, 0.231, 0.193, 0.000)
		colorLowland   (0.297, 0.247, 0.220, 0.000)
		colorUpland    (0.329, 0.299, 0.267, 0.000)
		colorRock      (0.355, 0.326, 0.287, 0.000)
		colorSnow      (0.387, 0.347, 0.303, 1.000)
		BumpHeight      3.4005
		BumpOffset      0.6801
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.077818
		Period          1.48397
		Eccentricity    0.126899
		Inclination     -87.911
		AscendingNode   82.0001
		ArgOfPericenter -146.033
		MeanAnomaly     -168.707
	}
}

DwarfMoon	"Althir System 5.D41"
{
	ParentBody     "Althir System 5"
	Class	       "Asteroid"

	Mass            3.90047e-011
	Radius          4.44731
	InertiaMoment   0.396979

	RotationPeriod  1462.62
	Obliquity       149.847
	EqAscendNode    -18.3746

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.584 0.580 0.575)

	Surface
	{
		SurfStyle       0.310322
		OceanStyle      0.154868
		Randomize      (-0.649, 0.502, -0.166)
		colorDistMagn   0.362105
		colorDistFreq   0.0103481
		detailScale     121.441
		colorConversion true
		snowLevel       2
		tropicLatitude  0.842364
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.35302
		terraceProb     0.517055
		erosion         0
		montesMagn      0.49055
		montesFreq      3.57103
		montesSpiky     0.956931
		montesFraction  0.667249
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0454301
		hillsFraction   0.567659
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258605
		craterFreq      0.235096
		craterDensity   0.838048
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51326
		volcanoTemp     1528.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.234, 0.232, 0.230, 0.000)
		colorShelf     (0.248, 0.246, 0.244, 0.000)
		colorBeach     (0.263, 0.261, 0.259, 0.000)
		colorDesert    (0.277, 0.275, 0.273, 0.000)
		colorLowland   (0.292, 0.290, 0.287, 0.000)
		colorUpland    (0.306, 0.304, 0.302, 0.000)
		colorRock      (0.321, 0.319, 0.316, 0.000)
		colorSnow      (0.336, 0.333, 0.331, 1.000)
		BumpHeight      4.00258
		BumpOffset      0.800516
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0783701
		Period          1.49979
		Eccentricity    0.167306
		Inclination     87.2148
		AscendingNode   -7.95258
		ArgOfPericenter -133.625
		MeanAnomaly     13.5583
	}
}

DwarfMoon	"Althir System 5.D42"
{
	ParentBody     "Althir System 5"
	Class	       "Asteroid"

	Mass            6.88125e-011
	Radius          6.28002
	InertiaMoment   0.39859

	RotationPeriod  1540.31
	Obliquity       17.3892
	EqAscendNode    -92.0911

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.789 0.786 0.784)

	Surface
	{
		SurfStyle       0.700357
		OceanStyle      0.40275
		Randomize      (0.711, 0.289, -0.095)
		colorDistMagn   0.478813
		colorDistFreq   0.00871836
		detailScale     171.486
		colorConversion true
		snowLevel       2
		tropicLatitude  0.463431
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.741456
		terraceProb     0.353573
		erosion         0
		montesMagn      0.377292
		montesFreq      1.89693
		montesSpiky     0.931796
		montesFraction  0.357134
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0980409
		hillsFraction   0.505851
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264974
		craterFreq      0.268102
		craterDensity   0.926994
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.515693
		volcanoTemp     1244.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.308, 0.267, 0.220, 0.000)
		colorShelf     (0.316, 0.275, 0.251, 0.000)
		colorBeach     (0.371, 0.322, 0.298, 0.000)
		colorDesert    (0.402, 0.346, 0.290, 0.000)
		colorLowland   (0.442, 0.369, 0.329, 0.000)
		colorUpland    (0.489, 0.448, 0.400, 0.000)
		colorRock      (0.529, 0.487, 0.431, 0.000)
		colorSnow      (0.576, 0.519, 0.455, 1.000)
		BumpHeight      5.65202
		BumpOffset      1.1304
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0790237
		Period          1.51859
		Eccentricity    0.484902
		Inclination     20.2538
		AscendingNode   -84.9216
		ArgOfPericenter -170.75
		MeanAnomaly     34.9233
	}
}

DwarfMoon	"Althir System 5.D43"
{
	ParentBody     "Althir System 5"
	Class	       "Asteroid"

	Mass            1.15006e-010
	Radius          7.02909
	InertiaMoment   0.399573

	RotationPeriod  1378.69
	Obliquity       -19.8139
	EqAscendNode    -90.3189

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.549 0.543 0.541)

	Surface
	{
		SurfStyle       0.261146
		OceanStyle      0.940873
		Randomize      (0.192, -0.598, 0.690)
		colorDistMagn   0.828008
		colorDistFreq   0.0390093
		detailScale     191.941
		colorConversion true
		snowLevel       2
		tropicLatitude  0.360388
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.406256
		terraceProb     0.193164
		erosion         0
		montesMagn      0.595374
		montesFreq      3.89799
		montesSpiky     0.983737
		montesFraction  0.650509
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.133017
		hillsFraction   0.507737
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258006
		craterFreq      0.157499
		craterDensity   0.949086
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.548315
		volcanoTemp     1470.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.220, 0.217, 0.216, 0.000)
		colorShelf     (0.233, 0.231, 0.230, 0.000)
		colorBeach     (0.247, 0.244, 0.243, 0.000)
		colorDesert    (0.261, 0.258, 0.257, 0.000)
		colorLowland   (0.274, 0.272, 0.271, 0.000)
		colorUpland    (0.288, 0.285, 0.284, 0.000)
		colorRock      (0.302, 0.299, 0.298, 0.000)
		colorSnow      (0.316, 0.312, 0.311, 1.000)
		BumpHeight      6.32618
		BumpOffset      1.26524
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0792978
		Period          1.5265
		Eccentricity    0.443904
		Inclination     8.88374
		AscendingNode   -86.3967
		ArgOfPericenter 65.7908
		MeanAnomaly     -122.019
	}
}

DwarfMoon	"Althir System 5.D44"
{
	ParentBody     "Althir System 5"
	Class	       "Asteroid"

	Mass            1.84447e-010
	Radius          7.89924
	InertiaMoment   0.397323

	RotationPeriod  1250.74
	Obliquity       -15.8382
	EqAscendNode    109.818

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.774 0.772 0.769)

	Surface
	{
		SurfStyle       0.39308
		OceanStyle      0.670473
		Randomize      (0.377, -0.269, 0.826)
		colorDistMagn   0.275325
		colorDistFreq   0.00678829
		detailScale     215.702
		colorConversion true
		snowLevel       2
		tropicLatitude  0.265921
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.755666
		terraceProb     0.433316
		erosion         0
		montesMagn      0.408141
		montesFreq      3.20008
		montesSpiky     0.794186
		montesFraction  0.907756
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.127501
		hillsFraction   0.451908
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231346
		craterFreq      0.262789
		craterDensity   0.813866
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.635789
		volcanoTemp     1825.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.310, 0.309, 0.308, 0.000)
		colorShelf     (0.329, 0.328, 0.327, 0.000)
		colorBeach     (0.348, 0.347, 0.346, 0.000)
		colorDesert    (0.368, 0.367, 0.365, 0.000)
		colorLowland   (0.387, 0.386, 0.385, 0.000)
		colorUpland    (0.407, 0.405, 0.404, 0.000)
		colorRock      (0.426, 0.425, 0.423, 0.000)
		colorSnow      (0.445, 0.444, 0.442, 1.000)
		BumpHeight      7.10932
		BumpOffset      1.42186
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0796254
		Period          1.53597
		Eccentricity    0.375968
		Inclination     -1.03294
		AscendingNode   115.457
		ArgOfPericenter -53.4286
		MeanAnomaly     93.2946
	}
}

DwarfMoon	"Althir System 5.D45"
{
	ParentBody     "Althir System 5"
	Class	       "Asteroid"

	Mass            2.86404e-010
	Radius          8.72919
	InertiaMoment   0.398746

	RotationPeriod  1136.59
	Obliquity       12.4499
	EqAscendNode    -83.1687

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.485 0.482 0.478)

	Surface
	{
		SurfStyle       0.0310727
		OceanStyle      0.530446
		Randomize      (0.999, -0.711, 0.210)
		colorDistMagn   0.826778
		colorDistFreq   0.034969
		detailScale     238.365
		colorConversion true
		snowLevel       2
		tropicLatitude  0.440594
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.314723
		terraceProb     0.19395
		erosion         0
		montesMagn      0.49448
		montesFreq      2.33763
		montesSpiky     0.953613
		montesFraction  0.287878
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.228644
		hillsFraction   0.762258
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261837
		craterFreq      0.221839
		craterDensity   1.07413
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53055
		volcanoTemp     1848.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.194, 0.193, 0.191, 0.000)
		colorShelf     (0.206, 0.205, 0.203, 0.000)
		colorBeach     (0.218, 0.217, 0.215, 0.000)
		colorDesert    (0.230, 0.229, 0.227, 0.000)
		colorLowland   (0.242, 0.241, 0.239, 0.000)
		colorUpland    (0.255, 0.253, 0.251, 0.000)
		colorRock      (0.267, 0.265, 0.263, 0.000)
		colorSnow      (0.279, 0.277, 0.275, 1.000)
		BumpHeight      7.85627
		BumpOffset      1.57125
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0802404
		Period          1.5538
		Eccentricity    0.0381937
		Inclination     -26.4651
		AscendingNode   -75.8105
		ArgOfPericenter 165.558
		MeanAnomaly     174.478
	}
}

DwarfMoon	"Althir System 5.D46"
{
	ParentBody     "Althir System 5"
	Class	       "Asteroid"

	Mass            4.33343e-010
	Radius          11.7576
	InertiaMoment   0.3997

	RotationPeriod  1227.52
	Obliquity       -67.3554
	EqAscendNode    42.8349

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.545 0.467 0.355)

	Surface
	{
		SurfStyle       0.549095
		OceanStyle      0.213973
		Randomize      (0.046, -0.710, -0.643)
		colorDistMagn   0.641867
		colorDistFreq   0.096765
		detailScale     321.061
		colorConversion true
		snowLevel       2
		tropicLatitude  0.988018
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.364408
		terraceProb     0.28552
		erosion         0
		montesMagn      0.455196
		montesFreq      2.58891
		montesSpiky     0.845205
		montesFraction  0.445531
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.472676
		hillsFraction   0.522294
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237218
		craterFreq      0.248249
		craterDensity   1.0996
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.509543
		volcanoTemp     1851.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.213, 0.159, 0.099, 0.000)
		colorShelf     (0.218, 0.164, 0.113, 0.000)
		colorBeach     (0.256, 0.192, 0.135, 0.000)
		colorDesert    (0.278, 0.206, 0.131, 0.000)
		colorLowland   (0.305, 0.220, 0.149, 0.000)
		colorUpland    (0.338, 0.266, 0.181, 0.000)
		colorRock      (0.365, 0.290, 0.195, 0.000)
		colorSnow      (0.398, 0.308, 0.206, 1.000)
		BumpHeight      10.5818
		BumpOffset      2.11637
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0804906
		Period          1.56107
		Eccentricity    0.227384
		Inclination     -40.6021
		AscendingNode   41.957
		ArgOfPericenter 88.6231
		MeanAnomaly     15.7727
	}
}

DwarfMoon	"Althir System 5.D47"
{
	ParentBody     "Althir System 5"
	Class	       "Asteroid"

	Mass            6.4198e-010
	Radius          12.5496
	InertiaMoment   0.397602

	RotationPeriod  1099.54
	Obliquity       35.2612
	EqAscendNode    99.098

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.456 0.452 0.450)

	Surface
	{
		SurfStyle       0.920487
		OceanStyle      0.328256
		Randomize      (0.753, -0.562, 0.714)
		colorDistMagn   0.736154
		colorDistFreq   0.0901446
		detailScale     342.687
		colorConversion true
		snowLevel       2
		tropicLatitude  0.558637
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.361239
		terraceProb     0.254222
		erosion         0
		montesMagn      0.539654
		montesFreq      2.48564
		montesSpiky     0.891814
		montesFraction  0.70012
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.237472
		hillsFraction   0.515309
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249088
		craterFreq      0.182856
		craterDensity   0.804503
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.486982
		volcanoTemp     1678.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.155, 0.158, 0.180, 0.050)
		colorShelf     (0.182, 0.185, 0.207, 0.040)
		colorBeach     (0.210, 0.212, 0.234, 0.030)
		colorDesert    (0.237, 0.240, 0.265, 0.020)
		colorLowland   (0.265, 0.267, 0.292, 0.030)
		colorUpland    (0.292, 0.294, 0.319, 0.050)
		colorRock      (0.319, 0.321, 0.355, 0.020)
		colorSnow      (0.319, 0.321, 0.355, 1.000)
		BumpHeight      11.2946
		BumpOffset      2.25893
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0809431
		Period          1.57426
		Eccentricity    0.0505535
		Inclination     8.27948
		AscendingNode   104.912
		ArgOfPericenter -105.438
		MeanAnomaly     132.124
	}
}

DwarfMoon	"Althir System 5.D48"
{
	ParentBody     "Althir System 5"
	Class	       "Asteroid"

	Mass            9.34674e-010
	Radius          13.6447
	InertiaMoment   0.398895

	RotationPeriod  1008.83
	Obliquity       -99.0054
	EqAscendNode    -141.498

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.671 0.669 0.666)

	Surface
	{
		SurfStyle       0.516635
		OceanStyle      0.805614
		Randomize      (-0.443, 0.743, -0.985)
		colorDistMagn   0.849318
		colorDistFreq   0.102097
		detailScale     372.591
		colorConversion true
		snowLevel       2
		tropicLatitude  0.754141
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.511846
		terraceProb     0.199891
		erosion         0
		montesMagn      0.483953
		montesFreq      2.83344
		montesSpiky     0.950037
		montesFraction  0.610505
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.415895
		hillsFraction   0.641998
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240213
		craterFreq      0.21768
		craterDensity   0.889708
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.483674
		volcanoTemp     1474.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.262, 0.228, 0.186, 0.000)
		colorShelf     (0.268, 0.234, 0.213, 0.000)
		colorBeach     (0.315, 0.274, 0.253, 0.000)
		colorDesert    (0.342, 0.294, 0.246, 0.000)
		colorLowland   (0.376, 0.315, 0.280, 0.000)
		colorUpland    (0.416, 0.381, 0.340, 0.000)
		colorRock      (0.450, 0.415, 0.366, 0.000)
		colorSnow      (0.490, 0.442, 0.386, 1.000)
		BumpHeight      12.2802
		BumpOffset      2.45605
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0812952
		Period          1.58454
		Eccentricity    0.351686
		Inclination     -60.2605
		AscendingNode   -148.905
		ArgOfPericenter -51.3933
		MeanAnomaly     -78.2375
	}
}

DwarfMoon	"Althir System 5.D49"
{
	ParentBody     "Althir System 5"
	Class	       "Asteroid"

	Mass            1.34131e-009
	Radius          14.7266
	InertiaMoment   0.399826

	RotationPeriod  923.682
	Obliquity       -9.33404
	EqAscendNode    -138.465

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.627 0.543 0.442)

	Surface
	{
		SurfStyle       0.903639
		OceanStyle      0.979597
		Randomize      (-0.023, -0.282, 0.799)
		colorDistMagn   0.630386
		colorDistFreq   0.0707468
		detailScale     402.133
		colorConversion true
		snowLevel       2
		tropicLatitude  0.396096
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.531957
		terraceProb     0.381097
		erosion         0
		montesMagn      0.377143
		montesFreq      3.23449
		montesSpiky     0.766975
		montesFraction  0.76319
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.256157
		hillsFraction   0.687103
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244052
		craterFreq      0.214246
		craterDensity   0.895575
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50681
		volcanoTemp     1400.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.213, 0.190, 0.177, 0.050)
		colorShelf     (0.251, 0.223, 0.203, 0.040)
		colorBeach     (0.288, 0.255, 0.230, 0.030)
		colorDesert    (0.326, 0.288, 0.261, 0.020)
		colorLowland   (0.363, 0.320, 0.287, 0.030)
		colorUpland    (0.401, 0.353, 0.314, 0.050)
		colorRock      (0.439, 0.385, 0.349, 0.020)
		colorSnow      (0.439, 0.385, 0.349, 1.000)
		BumpHeight      13.2539
		BumpOffset      2.65078
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.081605
		Period          1.5936
		Eccentricity    0.294743
		Inclination     15.4795
		AscendingNode   -139.176
		ArgOfPericenter -71.5554
		MeanAnomaly     91.2798
	}
}

DwarfMoon	"Althir System 5.D50"
{
	ParentBody     "Althir System 5"
	Class	       "Asteroid"

	Mass            1.90182e-009
	Radius          19.5973
	InertiaMoment   0.397841

	RotationPeriod  1015.97
	Obliquity       -56.5949
	EqAscendNode    83.5224

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.476 0.471 0.467)

	Surface
	{
		SurfStyle       0.225138
		OceanStyle      0.654679
		Randomize      (0.522, -0.983, 0.198)
		colorDistMagn   0.191346
		colorDistFreq   0.249364
		detailScale     535.138
		colorConversion true
		snowLevel       2
		tropicLatitude  0.968774
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.620924
		terraceProb     0.400901
		erosion         0
		montesMagn      0.400519
		montesFreq      2.85192
		montesSpiky     0.934241
		montesFraction  0.450329
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.700415
		hillsFraction   0.432285
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238876
		craterFreq      0.17348
		craterDensity   0.958315
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.420101
		volcanoTemp     1477.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.190, 0.188, 0.187, 0.000)
		colorShelf     (0.202, 0.200, 0.198, 0.000)
		colorBeach     (0.214, 0.212, 0.210, 0.000)
		colorDesert    (0.226, 0.224, 0.222, 0.000)
		colorLowland   (0.238, 0.236, 0.233, 0.000)
		colorUpland    (0.250, 0.247, 0.245, 0.000)
		colorRock      (0.262, 0.259, 0.257, 0.000)
		colorSnow      (0.273, 0.271, 0.268, 1.000)
		BumpHeight      17.6376
		BumpOffset      3.52752
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0821916
		Period          1.61082
		Eccentricity    0.102917
		Inclination     -85.5836
		AscendingNode   69.5841
		ArgOfPericenter -137.269
		MeanAnomaly     -116.792
	}
}

DwarfMoon	"Althir System 5.D51"
{
	ParentBody     "Althir System 5"
	Class	       "Asteroid"

	Mass            2.66958e-009
	Radius          20.3183
	InertiaMoment   0.399038

	RotationPeriod  907.445
	Obliquity       46.3853
	EqAscendNode    15.6815

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.587 0.581 0.577)

	Surface
	{
		SurfStyle       0.201374
		OceanStyle      0.943743
		Randomize      (0.084, 0.492, -0.299)
		colorDistMagn   0.850399
		colorDistFreq   0.275632
		detailScale     554.825
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999819
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.492198
		terraceProb     0.271583
		erosion         0
		montesMagn      0.311158
		montesFreq      3.53166
		montesSpiky     0.903451
		montesFraction  0.304306
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.532376
		hillsFraction   0.573748
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226172
		craterFreq      0.254788
		craterDensity   0.951514
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.472165
		volcanoTemp     1339.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.235, 0.233, 0.231, 0.000)
		colorShelf     (0.249, 0.247, 0.245, 0.000)
		colorBeach     (0.264, 0.262, 0.260, 0.000)
		colorDesert    (0.279, 0.276, 0.274, 0.000)
		colorLowland   (0.293, 0.291, 0.289, 0.000)
		colorUpland    (0.308, 0.305, 0.303, 0.000)
		colorRock      (0.323, 0.320, 0.318, 0.000)
		colorSnow      (0.338, 0.334, 0.332, 1.000)
		BumpHeight      18.2865
		BumpOffset      3.65729
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0827046
		Period          1.62592
		Eccentricity    0.454149
		Inclination     43.2999
		AscendingNode   13.4212
		ArgOfPericenter -157.893
		MeanAnomaly     -93.9035
	}
}

DwarfMoon	"Althir System 5.D52"
{
	ParentBody     "Althir System 5"
	Class	       "Asteroid"

	Mass            3.71604e-009
	Radius          21.7374
	InertiaMoment   0.399951

	RotationPeriod  834.341
	Obliquity       4.42307
	EqAscendNode    87.3734

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.641 0.638 0.636)

	Surface
	{
		SurfStyle       0.731083
		OceanStyle      0.885024
		Randomize      (-0.677, -0.530, 0.236)
		colorDistMagn   0.84784
		colorDistFreq   0.412267
		detailScale     593.576
		colorConversion true
		snowLevel       2
		tropicLatitude  0.227165
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.610112
		terraceProb     0.328682
		erosion         0
		montesMagn      0.425545
		montesFreq      2.1852
		montesSpiky     0.78033
		montesFraction  0.677855
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.1009
		hillsFraction   0.497364
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.21203
		craterFreq      0.226469
		craterDensity   0.739837
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.346544
		volcanoTemp     1760.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.250, 0.217, 0.178, 0.000)
		colorShelf     (0.256, 0.223, 0.204, 0.000)
		colorBeach     (0.301, 0.262, 0.242, 0.000)
		colorDesert    (0.327, 0.281, 0.235, 0.000)
		colorLowland   (0.359, 0.300, 0.267, 0.000)
		colorUpland    (0.397, 0.364, 0.325, 0.000)
		colorRock      (0.429, 0.396, 0.350, 0.000)
		colorSnow      (0.468, 0.421, 0.369, 1.000)
		BumpHeight      19.5637
		BumpOffset      3.91273
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0831953
		Period          1.64041
		Eccentricity    0.0328736
		Inclination     -12.6226
		AscendingNode   86.8304
		ArgOfPericenter -157.286
		MeanAnomaly     127.092
	}
}

DwarfMoon	"Althir System 5.D53"
{
	ParentBody     "Althir System 5"
	Class	       "Asteroid"

	Mass            5.13699e-009
	Radius          23.2117
	InertiaMoment   0.398053

	RotationPeriod  764.629
	Obliquity       -66.5793
	EqAscendNode    -148.029

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.666 0.662 0.661)

	Surface
	{
		SurfStyle       0.168505
		OceanStyle      0.337468
		Randomize      (-0.962, 0.518, 0.575)
		colorDistMagn   0.253513
		colorDistFreq   0.435919
		detailScale     633.834
		colorConversion true
		snowLevel       2
		tropicLatitude  0.507265
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.688259
		terraceProb     0.145288
		erosion         0
		montesMagn      0.466038
		montesFreq      2.7641
		montesSpiky     0.920488
		montesFraction  0.607127
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.60292
		hillsFraction   0.439784
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.275678
		craterFreq      0.15729
		craterDensity   0.82783
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.39181
		volcanoTemp     1620.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.267, 0.265, 0.264, 0.000)
		colorShelf     (0.283, 0.282, 0.281, 0.000)
		colorBeach     (0.300, 0.298, 0.297, 0.000)
		colorDesert    (0.317, 0.315, 0.314, 0.000)
		colorLowland   (0.333, 0.331, 0.331, 0.000)
		colorUpland    (0.350, 0.348, 0.347, 0.000)
		colorRock      (0.366, 0.364, 0.364, 0.000)
		colorSnow      (0.383, 0.381, 0.380, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0834801
		Period          1.64885
		Eccentricity    0.238038
		Inclination     -57.6926
		AscendingNode   -146.853
		ArgOfPericenter 22.2083
		MeanAnomaly     -132.986
	}
}

DwarfMoon	"Althir System 5.D54"
{
	ParentBody     "Althir System 5"
	Class	       "Asteroid"

	Mass            7.06125e-009
	Radius          31.1667
	InertiaMoment   0.399176

	RotationPeriod  864.701
	Obliquity       92.3994
	EqAscendNode    -110.47

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.775 0.772 0.770)

	Surface
	{
		SurfStyle       0.678996
		OceanStyle      0.995953
		Randomize      (-0.084, -0.786, 0.206)
		colorDistMagn   0.98649
		colorDistFreq   0.456952
		detailScale     851.057
		colorConversion true
		snowLevel       2
		tropicLatitude  0.92458
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.449407
		terraceProb     0.374403
		erosion         0
		montesMagn      0.495823
		montesFreq      3.00583
		montesSpiky     0.950172
		montesFraction  0.943649
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.37278
		hillsFraction   0.619732
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221486
		craterFreq      0.247483
		craterDensity   1.01167
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.487267
		volcanoTemp     1666.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.302, 0.263, 0.216, 0.000)
		colorShelf     (0.310, 0.270, 0.246, 0.000)
		colorBeach     (0.364, 0.317, 0.293, 0.000)
		colorDesert    (0.396, 0.340, 0.285, 0.000)
		colorLowland   (0.434, 0.363, 0.323, 0.000)
		colorUpland    (0.481, 0.440, 0.393, 0.000)
		colorRock      (0.520, 0.479, 0.424, 0.000)
		colorSnow      (0.566, 0.510, 0.447, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0840979
		Period          1.66718
		Eccentricity    0.0473545
		Inclination     87.324
		AscendingNode   -112.563
		ArgOfPericenter 48.2793
		MeanAnomaly     157.937
	}
}

DwarfMoon	"Althir System 5.D55"
{
	ParentBody     "Althir System 5"
	Class	       "Asteroid"

	Mass            9.66256e-009
	Radius          31.4234
	InertiaMoment   0.395664

	RotationPeriod  755.365
	Obliquity       -80.5166
	EqAscendNode    -42.7478

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.518 0.513 0.510)

	Surface
	{
		SurfStyle       0.627801
		OceanStyle      0.451669
		Randomize      (0.213, 0.150, 0.167)
		colorDistMagn   0.598381
		colorDistFreq   0.536847
		detailScale     858.068
		colorConversion true
		snowLevel       2
		tropicLatitude  0.874479
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.709263
		terraceProb     0.21483
		erosion         0
		montesMagn      0.597142
		montesFreq      3.21187
		montesSpiky     0.916961
		montesFraction  0.717059
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.0623
		hillsFraction   0.612139
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230476
		craterFreq      0.235778
		craterDensity   0.964047
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.528486
		volcanoTemp     1532.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.202, 0.174, 0.143, 0.000)
		colorShelf     (0.207, 0.180, 0.163, 0.000)
		colorBeach     (0.244, 0.210, 0.194, 0.000)
		colorDesert    (0.264, 0.226, 0.189, 0.000)
		colorLowland   (0.290, 0.241, 0.214, 0.000)
		colorUpland    (0.321, 0.292, 0.260, 0.000)
		colorRock      (0.347, 0.318, 0.280, 0.000)
		colorSnow      (0.378, 0.339, 0.296, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0846794
		Period          1.68451
		Eccentricity    0.0378074
		Inclination     -59.6507
		AscendingNode   -48.1112
		ArgOfPericenter -20.3366
		MeanAnomaly     -176.738
	}
}

DwarfMoon	"Althir System 5.D56"
{
	ParentBody     "Althir System 5"
	Class	       "Asteroid"

	Mass            1.31762e-008
	Radius          33.334
	InertiaMoment   0.398245

	RotationPeriod  694.933
	Obliquity       -76.6556
	EqAscendNode    -12.6528

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.568 0.562 0.557)

	Surface
	{
		SurfStyle       0.97512
		OceanStyle      0.111141
		Randomize      (-0.094, -0.309, -0.772)
		colorDistMagn   0.484451
		colorDistFreq   0.450086
		detailScale     910.241
		colorConversion true
		snowLevel       2
		tropicLatitude  0.96441
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.513665
		terraceProb     0.106011
		erosion         0
		montesMagn      0.581706
		montesFreq      2.54957
		montesSpiky     0.985226
		montesFraction  0.529956
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.38374
		hillsFraction   0.664142
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.202812
		craterFreq      0.222592
		craterDensity   0.925754
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49139
		volcanoTemp     1563.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.193, 0.197, 0.223, 0.050)
		colorShelf     (0.227, 0.230, 0.256, 0.040)
		colorBeach     (0.261, 0.264, 0.290, 0.030)
		colorDesert    (0.295, 0.298, 0.328, 0.020)
		colorLowland   (0.329, 0.332, 0.362, 0.030)
		colorUpland    (0.363, 0.365, 0.395, 0.050)
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
		SemiMajorAxis   0.0849072
		Period          1.69131
		Eccentricity    0.0624139
		Inclination     -29.8354
		AscendingNode   -16.2979
		ArgOfPericenter 179.66
		MeanAnomaly     40.3034
	}
}

Planet	"Althir System 6"
{
	ParentBody     "Althir System"
	Class	       "Titan"

	Mass            0.331985
	Radius          5029.54
	InertiaMoment   0.330907

	Oblateness      0.00642423

	RotationPeriod  20.9956
	Obliquity       63.506
	EqAscendNode    63.1645

	AlbedoBond      0.65
	AlbedoGeom      0.78
	Brightness      2
	Color          (0.776 0.773 0.772)

	Surface
	{
		SurfStyle       0.952887
		OceanStyle      0.25086
		Randomize      (-0.154, 0.429, -0.833)
		colorDistMagn   0.090901
		colorDistFreq   607.26
		detailScale     12936.3
		colorConversion true
		seaLevel        0.246121
		snowLevel       2
		tropicLatitude  0.888828
		icecapLatitude  10
		icecapHeight    0.140867
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.82005
		venusFreq       1.39542
		venusMagn       -1
		mareFreq        2.25384
		mareDensity     0.0570356
		terraceProb     0.201932
		erosion         0.109703
		montesMagn      0.165302
		montesFreq      214.882
		montesSpiky     0.907809
		montesFraction  0.329644
		dunesMagn       0.0361063
		dunesFreq       45.5001
		dunesFraction   0.949535
		hillsMagn       0.137137
		hillsFreq       396.402
		hillsFraction   0.156959
		hills2Fraction  0.0768947
		riversMagn      66.7165
		riversFreq      1.87979
		riversSin       7.82504
		riversOctaves   2
		canyonsMagn     0.0159435
		canyonsFreq     131.026
		canyonFraction  0.347545
		cracksMagn      0.0422815
		cracksFreq      3.15277
		cracksOctaves   5
		craterMagn      0.631568
		craterFreq      11.3656
		craterDensity   0.08391
		craterOctaves   4.50612
		craterRayedFactor 0
		volcanoMagn     0.580197
		volcanoFreq     0.570455
		volcanoDensity  0.231382
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.563842
		volcanoRadius   0.479222
		volcanoTemp     1615.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.3167
		stripeTwist     0
		cycloneMagn     1.72026
		cycloneFreq     0.573569
		cycloneDensity  0.38671
		cycloneOctaves  2
		colorSea       (0.090, 0.110, 0.150, 1.000)
		colorShelf     (0.250, 0.480, 0.460, 1.000)
		colorBeach     (0.776, 0.649, 0.517, 0.000)
		colorDesert    (0.474, 0.371, 0.270, 0.000)
		colorLowland   (0.520, 0.394, 0.131, 0.000)
		colorUpland    (0.536, 0.356, 0.355, 0.000)
		colorRock      (0.640, 0.710, 0.740, 0.350)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.520, 0.394, 0.131, 0.000)
		colorUpPlants  (0.536, 0.356, 0.355, 0.000)
		BumpHeight      20
		BumpOffset      4.92243
		DiffMapAlpha   "Water"
		SpecBrightWater 0.65
		SpecBrightIce   0.1
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Clouds
	{
		Height          5.89404
		Velocity        69.6466
		BumpHeight      5.24849
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.07985
		mainOctaves     10
		Coverage        0.1
		stripeZones     2.3167
		stripeTwist     0
	}

	Ocean
	{
		Height          4.92243
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
	}

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          69.7012
		Density         0.15545
		Pressure        0.0912277
		Greenhouse      3.6047
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0
		Saturation      1

		Composition
		{
			CH4   	74.7173
			CO2   	12.5463
			C2H2  	11.8189
			C2H4  	0.686436
			C2H6  	0.0867783
			H2S   	0.0719417
			N2    	0.068481
			Ar    	0.00191723
			CO    	0.00130583
			C3H8  	0.000425542
			NH3   	9.81827e-005
			Ne    	6.67212e-005
			O2    	1.68548e-005
			Kr    	1.093e-005
		}
	}

	Aurora
	{
		Height      121.912
		NorthLat    78.4327
		NorthLon    112.845
		NorthRadius 1289.01
		NorthWidth  376.621
		NorthRings  4
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -66.661
		SouthLon    292.78
		SouthRadius 1388.78
		SouthWidth  374.925
		SouthRings  3
		SouthBright 0.3
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	Rings
	{
		InnerRadius     7600.16
		OuterRadius     8793.31
		RotationPeriod  3.5685
		RotationOffset  0
		FrontBright     0.934875
		BackBright      0.857708
		Density         0.788268
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   19.1
		Period          50.6317
		Eccentricity    0.0443799
		Inclination     -1.41216
		AscendingNode   56.1904
		ArgOfPericenter 252.555
		MeanAnomaly     211.219
	}
}

Planet	"Althir System 7"
{
	ParentBody     "Althir System"
	Class	       "Titan"

	Mass            1.57811
	Radius          8735.94
	InertiaMoment   0.33242

	Oblateness      0.0111684

	RotationPeriod  16.7651
	Obliquity       237.011
	EqAscendNode    58.4407

	AlbedoBond      0.629475
	AlbedoGeom      0.75537
	Brightness      2
	Color          (0.596 0.533 0.458)

	Surface
	{
		SurfStyle       0.0127562
		OceanStyle      0.320089
		Randomize      (0.559, 0.307, -0.952)
		colorDistMagn   0.0466427
		colorDistFreq   1077.96
		detailScale     22469.3
		colorConversion true
		seaLevel        0.376996
		snowLevel       0.779937
		tropicLatitude  0.836267
		icecapLatitude  10
		icecapHeight    0.19312
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.80458
		venusFreq       1.66474
		venusMagn       0.0959921
		mareFreq        1.51936
		mareDensity     0.14465
		terraceProb     0.265088
		erosion         0.135795
		montesMagn      0.23587
		montesFreq      287.024
		montesSpiky     0.914685
		montesFraction  0.786203
		dunesMagn       0.0505406
		dunesFreq       94.4616
		dunesFraction   0.674959
		hillsMagn       0.145063
		hillsFreq       910.918
		hillsFraction   0.387966
		hills2Fraction  0.0437034
		riversMagn      59.7137
		riversFreq      2.60259
		riversSin       7.32845
		riversOctaves   2
		canyonsMagn     0.0111184
		canyonsFreq     257.165
		canyonFraction  0.626046
		cracksMagn      0.0311508
		cracksFreq      5.53166
		cracksOctaves   3
		craterMagn      0.682699
		craterFreq      25.7028
		craterDensity   0.0123558
		craterOctaves   1.65843
		craterRayedFactor 0
		volcanoMagn     0.601119
		volcanoFreq     0.779207
		volcanoDensity  0.237489
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.720295
		volcanoRadius   0.443996
		volcanoTemp     1798.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.09791
		stripeTwist     0
		cycloneMagn     3.31447
		cycloneFreq     0.883254
		cycloneDensity  0.340215
		cycloneOctaves  4
		colorSea       (0.090, 0.110, 0.150, 1.000)
		colorShelf     (0.250, 0.480, 0.460, 1.000)
		colorBeach     (0.298, 0.200, 0.131, 0.000)
		colorDesert    (0.506, 0.340, 0.223, 0.000)
		colorLowland   (0.483, 0.352, 0.250, 0.000)
		colorUpland    (0.554, 0.372, 0.244, 0.000)
		colorRock      (1.000, 1.000, 1.000, 0.500)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.483, 0.352, 0.250, 0.000)
		colorUpPlants  (0.554, 0.372, 0.244, 0.000)
		BumpHeight      20
		BumpOffset      7.53992
		DiffMapAlpha   "Water"
		SpecBrightWater 0.65
		SpecBrightIce   0.1
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Clouds
	{
		Height          4.26953
		Velocity        109.908
		BumpHeight      4.26984
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.14668
		mainOctaves     10
		Coverage        0.141051
		stripeZones     2.09791
		stripeTwist     0
	}

	Clouds
	{
		Height          8.54004
		Velocity        156.955
		BumpHeight      4.26984
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.14668
		mainOctaves     10
		Coverage        0.141051
		stripeZones     2.09791
		stripeTwist     0
	}

	Ocean
	{
		Height          7.53992
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
	}

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          50.646
		Density         0.768729
		Pressure        0.441185
		Greenhouse      9.22129
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0
		Saturation      1

		Composition
		{
			CH4   	99.7488
			N2    	0.247455
			C2H4  	0.00293985
			CO    	0.000530057
			O2    	7.86905e-005
			He    	6.7276e-005
			C2H2  	5.57407e-005
			Ar    	5.27924e-005
			Ne    	1.52904e-005
		}
	}

	Aurora
	{
		Height      160.729
		NorthLat    83.4361
		NorthLon    125.2
		NorthRadius 2485.45
		NorthWidth  633.104
		NorthRings  4
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -87.3455
		SouthLon    336.43
		SouthRadius 2606.06
		SouthWidth  721.492
		SouthRings  3
		SouthBright 0.3
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	Rings
	{
		InnerRadius     13570.3
		OuterRadius     25329.4
		RotationPeriod  5.98257
		RotationOffset  0
		FrontBright     0.610367
		BackBright      0.80275
		Density         0.918966
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   40.3172
		Period          155.277
		Eccentricity    0.0970262
		Inclination     -0.748805
		AscendingNode   69.169
		ArgOfPericenter 310.379
		MeanAnomaly     106.034
	}
}

Planet	"Althir System 8"
{
	ParentBody     "Althir System"
	Class	       "Titan"

	Mass            7.68402
	Radius          13536
	InertiaMoment   0.327422

	Oblateness      0.0172513

	RotationPeriod  11.6836
	Obliquity       1.83245
	EqAscendNode    -35.9287

	AlbedoBond      0.587277
	AlbedoGeom      0.704733
	Brightness      2
	Color          (0.553 0.548 0.543)

	Surface
	{
		SurfStyle       0.554413
		OceanStyle      0.639347
		Randomize      (0.215, -0.469, -0.972)
		colorDistMagn   0.0786123
		colorDistFreq   1846.52
		detailScale     34815.5
		colorConversion true
		seaLevel        0.50344
		snowLevel       0.614986
		tropicLatitude  0.0176586
		icecapLatitude  0.740678
		icecapHeight    0.523318
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.89235
		venusFreq       1.5294
		venusMagn       -1
		mareFreq        2.03759
		mareDensity     0.210977
		terraceProb     0.443399
		erosion         0.121703
		montesMagn      0.249803
		montesFreq      731.201
		montesSpiky     0.928207
		montesFraction  0.85845
		dunesMagn       0.0546814
		dunesFreq       118.377
		dunesFraction   0.187671
		hillsMagn       0.125064
		hillsFreq       2021.7
		hillsFraction   0.448254
		hills2Fraction  0.36482
		riversMagn      59.3976
		riversFreq      2.63975
		riversSin       5.77162
		riversOctaves   2
		canyonsMagn     0.0505704
		canyonsFreq     373.973
		canyonFraction  0.449674
		cracksMagn      0.0209864
		cracksFreq      5.33603
		cracksOctaves   7
		craterMagn      0.684433
		craterFreq      31.8465
		craterDensity   0
		craterOctaves   0
		craterRayedFactor 0
		volcanoMagn     0.547139
		volcanoFreq     0.635214
		volcanoDensity  0.251724
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.824719
		volcanoRadius   0.426254
		volcanoTemp     1575.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.75655
		stripeTwist     0
		cycloneMagn     3.11684
		cycloneFreq     0.89915
		cycloneDensity  0.390932
		cycloneOctaves  4
		colorSea       (0.090, 0.110, 0.150, 1.000)
		colorShelf     (0.250, 0.480, 0.460, 1.000)
		colorBeach     (0.155, 0.071, 0.022, 0.200)
		colorDesert    (0.282, 0.126, 0.049, 0.200)
		colorLowland   (0.332, 0.323, 0.315, 0.200)
		colorUpland    (0.282, 0.132, 0.071, 0.120)
		colorRock      (0.880, 0.960, 1.000, 0.500)
		colorSnow      (0.270, 0.250, 0.260, 0.154)
		colorLowPlants (0.332, 0.323, 0.315, 0.200)
		colorUpPlants  (0.282, 0.132, 0.071, 0.120)
		BumpHeight      15.312
		BumpOffset      7.70869
		DiffMapAlpha   "Water"
		SpecBrightWater 0.65
		SpecBrightIce   0.1
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Clouds
	{
		Height          4.64551
		Velocity        90.271
		BumpHeight      4.64549
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.02419
		mainOctaves     10
		Coverage        0.225445
		stripeZones     1.75655
		stripeTwist     0
	}

	Clouds
	{
		Height          9.29102
		Velocity        62.8399
		BumpHeight      4.64549
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.02419
		mainOctaves     10
		Coverage        0.225445
		stripeZones     1.75655
		stripeTwist     0
	}

	Ocean
	{
		Height          7.70869
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
	}

	NoLava          true

	Atmosphere
	{
		Model          "Mars"
		Height          119.234
		Density         0.140287
		Pressure        0.389263
		Greenhouse      7.21618
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.0388164
		Saturation      1

		Composition
		{
			H2    	98.4937
			N2    	0.797848
			CH4   	0.687451
			CO    	0.019198
			Ar    	0.00116621
			Ne    	0.000312658
			O2    	0.000296691
			He    	3.47733e-005
		}
	}

	Aurora
	{
		Height      188.124
		NorthLat    45.2572
		NorthLon    90.4252
		NorthRadius 4472.64
		NorthWidth  841.605
		NorthRings  3
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -79.7841
		SouthLon    269.186
		SouthRadius 4608.5
		SouthWidth  1309.99
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
		SemiMajorAxis   79.4385
		Period          429.454
		Eccentricity    0.0190354
		Inclination     -1.31186
		AscendingNode   -32.4981
		ArgOfPericenter 149.395
		MeanAnomaly     2.8508
	}
}

DwarfMoon	"Althir System 8.D1"
{
	ParentBody     "Althir System 8"
	Class	       "Asteroid"

	Mass            8.2493e-010
	Radius          13.6621
	InertiaMoment   0.395978

	Oblateness      0.249

	Obliquity       0.00585061
	EqAscendNode    12.9978
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.566 0.497 0.463)

	Surface
	{
		SurfStyle       0.209299
		OceanStyle      0.39191
		Randomize      (0.636, -0.738, 0.526)
		colorDistMagn   0.95789
		colorDistFreq   0.0841269
		detailScale     373.066
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.563988
		terraceProb     0.356066
		erosion         0
		montesMagn      0.676893
		montesFreq      1.69276
		montesSpiky     0.979076
		montesFraction  0.887393
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.592079
		hillsFraction   0.709592
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229261
		craterFreq      0.23119
		craterDensity   0.850368
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.537179
		volcanoTemp     1473.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.227, 0.199, 0.185, 0.000)
		colorShelf     (0.241, 0.211, 0.197, 0.000)
		colorBeach     (0.255, 0.223, 0.208, 0.000)
		colorDesert    (0.269, 0.236, 0.220, 0.000)
		colorLowland   (0.283, 0.248, 0.231, 0.000)
		colorUpland    (0.297, 0.261, 0.243, 0.000)
		colorRock      (0.312, 0.273, 0.254, 0.000)
		colorSnow      (0.326, 0.286, 0.266, 1.000)
		BumpHeight      12.2959
		BumpOffset      2.45917
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000315751
		Period          0.00117059
		Eccentricity    1.40217e-005
		Inclination     0.00585061
		AscendingNode   12.9978
		ArgOfPericenter -23.2376
		MeanAnomaly     -109.714
	}
}

Moon	"Althir System 8.1"
{
	ParentBody     "Althir System 8"
	Class	       "Selena"

	Mass            9.73546e-005
	Radius          382.007
	InertiaMoment   0.396871

	Oblateness      0.00962814

	Obliquity       -0.321057
	EqAscendNode    140.841
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.636 0.531 0.414)

	Surface
	{
		SurfStyle       0.550334
		OceanStyle      0.848716
		Randomize      (0.222, 0.423, -0.893)
		colorDistMagn   0.0968646
		colorDistFreq   42.2693
		detailScale     982.544
		colorConversion true
		drivenDarkening 0
		seaLevel        0.326593
		snowLevel       2
		tropicLatitude  0.00375055
		icecapLatitude  0.728292
		icecapHeight    0.341896
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.78868
		venusFreq       0.325486
		venusMagn       0
		mareFreq        0
		mareDensity     0.00014044
		terraceProb     0.320828
		erosion         0
		montesMagn      0.0603518
		montesFreq      23.2584
		montesSpiky     0.835354
		montesFraction  0.550044
		dunesMagn       0.0347455
		dunesFreq       517.371
		dunesFraction   0.53441
		hillsMagn       0.103727
		hillsFreq       50.266
		hillsFraction   0.428731
		hills2Fraction  0
		riversMagn      73.1713
		riversFreq      2.42013
		riversSin       4.50173
		riversOctaves   0
		canyonsMagn     0.473169
		canyonsFreq     0.151571
		canyonFraction  0.956224
		cracksMagn      0.040278
		cracksFreq      0.0783881
		cracksOctaves   0
		craterMagn      0.639016
		craterFreq      1.23529
		craterDensity   0.806421
		craterOctaves   8.99257
		craterRayedFactor 0.249608
		volcanoMagn     0.168034
		volcanoFreq     0.692894
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.282457
		volcanoRadius   0.181463
		volcanoTemp     1727.9
		lavaCoverTidal  0.000916839
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.430, 0.400, 0.370, 0.000)
		colorShelf     (0.620, 0.600, 0.530, 0.000)
		colorBeach     (0.395, 0.324, 0.224, 0.000)
		colorDesert    (0.414, 0.329, 0.228, 0.000)
		colorLowland   (0.325, 0.244, 0.174, 0.000)
		colorUpland    (0.477, 0.377, 0.257, 0.000)
		colorRock      (0.300, 0.260, 0.220, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      19.1004
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
		SemiMajorAxis   0.00055164
		Period          0.00270313
		Eccentricity    0.0455712
		Inclination     -0.321057
		AscendingNode   140.841
		ArgOfPericenter 111.393
		MeanAnomaly     -9.25668
	}
}

DwarfMoon	"Althir System 8.D2"
{
	ParentBody     "Althir System 8"
	Class	       "Asteroid"

	Mass            1.69267e-009
	Radius          15.9392
	InertiaMoment   0.399347

	Oblateness      0.00995034

	Obliquity       0.0780929
	EqAscendNode    -33.2593
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.481 0.477 0.469)

	Surface
	{
		SurfStyle       0.123457
		OceanStyle      0.275469
		Randomize      (0.195, -0.457, -0.872)
		colorDistMagn   0.842776
		colorDistFreq   0.103825
		detailScale     435.245
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00260671
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.402593
		terraceProb     0.327404
		erosion         0
		montesMagn      0.36496
		montesFreq      3.23246
		montesSpiky     0.920657
		montesFraction  0.46061
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.695493
		hillsFraction   0.698161
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.271948
		craterFreq      0.218052
		craterDensity   0.872286
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.532933
		volcanoTemp     1268.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.193, 0.191, 0.188, 0.000)
		colorShelf     (0.205, 0.203, 0.199, 0.000)
		colorBeach     (0.217, 0.215, 0.211, 0.000)
		colorDesert    (0.229, 0.226, 0.223, 0.000)
		colorLowland   (0.241, 0.238, 0.235, 0.000)
		colorUpland    (0.253, 0.250, 0.246, 0.000)
		colorRock      (0.265, 0.262, 0.258, 0.000)
		colorSnow      (0.277, 0.274, 0.270, 1.000)
		BumpHeight      14.3452
		BumpOffset      2.86905
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000881498
		Period          0.00546031
		Eccentricity    0.000225084
		Inclination     0.0780929
		AscendingNode   -33.2593
		ArgOfPericenter -156.016
		MeanAnomaly     -40.6098
	}
}

Moon	"Althir System 8.2"
{
	ParentBody     "Althir System 8"
	Class	       "IceWorld"

	Mass            0.00138619
	Radius          922.01
	InertiaMoment   0.39937

	Obliquity       0.17394
	EqAscendNode    40.0019
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.612 0.605 0.603)

	Surface
	{
		SurfStyle       0.732218
		OceanStyle      0.911279
		Randomize      (-0.396, -0.672, -0.246)
		colorDistMagn   0.0471921
		colorDistFreq   113.064
		detailScale     2371.46
		colorConversion true
		drivenDarkening 0
		seaLevel        0.207512
		snowLevel       2
		tropicLatitude  0.00570472
		icecapLatitude  0.773599
		icecapHeight    0.22487
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.91769
		venusFreq       0.877872
		venusMagn       0
		mareFreq        0.215429
		mareDensity     0.000760192
		terraceProb     0.655696
		erosion         0
		montesMagn      0.0493982
		montesFreq      48.8522
		montesSpiky     0.932216
		montesFraction  0.527545
		dunesMagn       0.0415359
		dunesFreq       1244.3
		dunesFraction   0.569707
		hillsMagn       0.101321
		hillsFreq       90.9153
		hillsFraction   0.57201
		hills2Fraction  0.140899
		riversMagn      58.1296
		riversFreq      3.05206
		riversSin       6.67819
		riversOctaves   0
		canyonsMagn     0.497298
		canyonsFreq     0.35933
		canyonFraction  0
		cracksMagn      0.0251555
		cracksFreq      0.448476
		cracksOctaves   0
		craterMagn      0.587573
		craterFreq      2.84755
		craterDensity   0.794067
		craterOctaves   10
		craterRayedFactor 0.231099
		volcanoMagn     0.190828
		volcanoFreq     0.639558
		volcanoDensity  0.171885
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.18878
		volcanoRadius   0.182655
		volcanoTemp     1301.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.392, 0.387, 0.404, 0.250)
		colorShelf     (0.429, 0.442, 0.458, 0.250)
		colorBeach     (0.349, 0.327, 0.350, 0.200)
		colorDesert    (0.325, 0.297, 0.308, 0.200)
		colorLowland   (0.239, 0.230, 0.253, 0.200)
		colorUpland    (0.453, 0.448, 0.458, 0.250)
		colorRock      (0.640, 0.630, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.239, 0.230, 0.253, 0.200)
		colorUpPlants  (0.453, 0.448, 0.458, 0.250)
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
		SemiMajorAxis   0.0014086
		Period          0.0110288
		Eccentricity    0.0189525
		Inclination     0.17394
		AscendingNode   40.0019
		ArgOfPericenter -78.2532
		MeanAnomaly     48.6105
	}
}

Moon	"Althir System 8.3"
{
	ParentBody     "Althir System 8"
	Class	       "IceWorld"

	Mass            0.000163612
	Radius          482.243
	InertiaMoment   0.398865

	Obliquity       0.899161
	EqAscendNode    -89.503
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.632 0.485 0.392)

	Surface
	{
		SurfStyle       0.355642
		OceanStyle      0.0628495
		Randomize      (0.779, 0.280, -0.819)
		colorDistMagn   0.0520714
		colorDistFreq   67.0191
		detailScale     1240.36
		colorConversion true
		drivenDarkening 0
		seaLevel        0.198174
		snowLevel       2
		tropicLatitude  0.0222864
		icecapLatitude  0.432759
		icecapHeight    0.217177
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.6395
		venusFreq       1.43552
		venusMagn       0
		mareFreq        0
		mareDensity     0.000105414
		terraceProb     0.327932
		erosion         0
		montesMagn      0.0722417
		montesFreq      24.1221
		montesSpiky     0.936348
		montesFraction  0.199353
		dunesMagn       0.0395118
		dunesFreq       629.65
		dunesFraction   0.653443
		hillsMagn       0.114257
		hillsFreq       53.6894
		hillsFraction   0.0740577
		hills2Fraction  0.0168301
		riversMagn      57.37
		riversFreq      3.4367
		riversSin       7.47554
		riversOctaves   0
		canyonsMagn     0.550147
		canyonsFreq     0.215396
		canyonFraction  0
		cracksMagn      0.04337
		cracksFreq      0.166336
		cracksOctaves   0
		craterMagn      0.646293
		craterFreq      1.30674
		craterDensity   0.882575
		craterOctaves   9
		craterRayedFactor 0
		volcanoMagn     0.20629
		volcanoFreq     0.686815
		volcanoDensity  0.19916
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.293977
		volcanoRadius   0.128481
		volcanoTemp     1527.95
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.632, 0.485, 0.392, 0.500)
		colorShelf     (0.600, 0.461, 0.372, 0.500)
		colorBeach     (0.442, 0.340, 0.274, 0.750)
		colorDesert    (0.537, 0.413, 0.333, 1.000)
		colorLowland   (0.556, 0.427, 0.345, 1.000)
		colorUpland    (0.587, 0.451, 0.364, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.556, 0.427, 0.345, 1.000)
		colorUpPlants  (0.587, 0.451, 0.364, 1.000)
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
		SemiMajorAxis   0.00225088
		Period          0.0222797
		Eccentricity    0.0421825
		Inclination     0.899161
		AscendingNode   -89.5029
		ArgOfPericenter -74.2704
		MeanAnomaly     73.3465
	}
}

Moon	"Althir System 8.4"
{
	ParentBody     "Althir System 8"
	Class	       "IceWorld"

	Mass            0.000192065
	Radius          478.776
	InertiaMoment   0.398273

	Obliquity       -1.49084
	EqAscendNode    14.4621
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.738 0.488 0.412)

	Surface
	{
		SurfStyle       0.130309
		OceanStyle      0.127716
		Randomize      (-0.464, 0.816, -0.422)
		colorDistMagn   0.0485869
		colorDistFreq   57.9445
		detailScale     1231.44
		colorConversion true
		drivenDarkening 0
		seaLevel        0.184375
		snowLevel       2
		tropicLatitude  0.0516034
		icecapLatitude  0.97113
		icecapHeight    0.186745
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.93688
		venusFreq       1.46177
		venusMagn       0
		mareFreq        0
		mareDensity     0.000174021
		terraceProb     0.368754
		erosion         0
		montesMagn      0.0458264
		montesFreq      22.6936
		montesSpiky     0.903419
		montesFraction  0.0402028
		dunesMagn       0.0442713
		dunesFreq       637.425
		dunesFraction   0.746625
		hillsMagn       0.140297
		hillsFreq       55.2395
		hillsFraction   0.315974
		hills2Fraction  0.0285533
		riversMagn      69.1417
		riversFreq      3.75357
		riversSin       6.60274
		riversOctaves   0
		canyonsMagn     0.516464
		canyonsFreq     0.148147
		canyonFraction  0
		cracksMagn      0.025619
		cracksFreq      0.197336
		cracksOctaves   0
		craterMagn      0.639825
		craterFreq      1.39449
		craterDensity   0.887765
		craterOctaves   9
		craterRayedFactor 0.133205
		volcanoMagn     0.183363
		volcanoFreq     0.794793
		volcanoDensity  0.243458
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.346528
		volcanoRadius   0.146879
		volcanoTemp     1266.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.738, 0.488, 0.412, 0.500)
		colorShelf     (0.701, 0.463, 0.391, 0.500)
		colorBeach     (0.517, 0.341, 0.288, 0.750)
		colorDesert    (0.628, 0.414, 0.350, 1.000)
		colorLowland   (0.650, 0.429, 0.362, 1.000)
		colorUpland    (0.687, 0.453, 0.383, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.650, 0.429, 0.362, 1.000)
		colorUpPlants  (0.687, 0.453, 0.383, 1.000)
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
		SemiMajorAxis   0.00359682
		Period          0.0450046
		Eccentricity    0.0312961
		Inclination     -1.49084
		AscendingNode   14.4621
		ArgOfPericenter -103.114
		MeanAnomaly     -151.933
	}
}

Moon	"Althir System 8.5"
{
	ParentBody     "Althir System 8"
	Class	       "IceWorld"

	Mass            0.000224488
	Radius          535.679
	InertiaMoment   0.397467

	Obliquity       -0.459249
	EqAscendNode    67.1122
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.799 0.698 0.553)

	Surface
	{
		SurfStyle       0.514302
		OceanStyle      0.55316
		Randomize      (-0.595, 0.882, 0.870)
		colorDistMagn   0.0628868
		colorDistFreq   72.4357
		detailScale     1377.8
		colorConversion true
		drivenDarkening 0
		seaLevel        0.228857
		snowLevel       2
		tropicLatitude  0.0133585
		icecapLatitude  0.578482
		icecapHeight    0.255441
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.95952
		venusFreq       1.59788
		venusMagn       0
		mareFreq        0
		mareDensity     0.000141391
		terraceProb     0.286725
		erosion         0
		montesMagn      0.0456343
		montesFreq      24.2873
		montesSpiky     0.936814
		montesFraction  0.99994
		dunesMagn       0.0350211
		dunesFreq       713.101
		dunesFraction   0.533168
		hillsMagn       0.137387
		hillsFreq       61.5826
		hillsFraction   0.55583
		hills2Fraction  0.21458
		riversMagn      71.7065
		riversFreq      2.30751
		riversSin       5.96801
		riversOctaves   0
		canyonsMagn     0.448068
		canyonsFreq     0.203053
		canyonFraction  0
		cracksMagn      0.0447314
		cracksFreq      0.142047
		cracksOctaves   0
		craterMagn      0.617818
		craterFreq      1.26545
		craterDensity   0.996289
		craterOctaves   9
		craterRayedFactor 0.210597
		volcanoMagn     0.211247
		volcanoFreq     0.647348
		volcanoDensity  0.19383
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.0968983
		volcanoRadius   0.14697
		volcanoTemp     1487.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.240, 0.174, 0.122, 0.000)
		colorShelf     (0.296, 0.216, 0.155, 0.000)
		colorBeach     (0.447, 0.328, 0.232, 0.200)
		colorDesert    (0.407, 0.307, 0.205, 0.500)
		colorLowland   (0.311, 0.237, 0.155, 0.800)
		colorUpland    (0.527, 0.419, 0.288, 1.000)
		colorRock      (0.670, 0.620, 0.550, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.311, 0.237, 0.155, 0.800)
		colorUpPlants  (0.527, 0.419, 0.288, 1.000)
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
		SemiMajorAxis   0.00574756
		Period          0.0909086
		Eccentricity    0.00532463
		Inclination     -0.459249
		AscendingNode   67.1122
		ArgOfPericenter 59.1823
		MeanAnomaly     -112.098
	}
}

Moon	"Althir System 8.6"
{
	ParentBody     "Althir System 8"
	Class	       "IceWorld"

	Mass            0.000261484
	Radius          530.434
	InertiaMoment   0.395447

	RotationPeriod  157.009
	Obliquity       0.0847657
	EqAscendNode    -86.4149

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.558 0.551 0.547)

	Surface
	{
		SurfStyle       0.361214
		OceanStyle      0.428063
		Randomize      (-0.580, 0.951, 0.809)
		colorDistMagn   0.057689
		colorDistFreq   68.829
		detailScale     1364.31
		colorConversion true
		drivenDarkening 0
		seaLevel        0.210279
		snowLevel       2
		tropicLatitude  0.00838643
		icecapLatitude  0.656768
		icecapHeight    0.227328
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.88226
		venusFreq       0.466423
		venusMagn       0.22156
		mareFreq        0
		mareDensity     0.000155139
		terraceProb     0.246954
		erosion         0
		montesMagn      0.0590918
		montesFreq      25.7122
		montesSpiky     0.991891
		montesFraction  0.459073
		dunesMagn       0.0304857
		dunesFreq       704.01
		dunesFraction   0.795618
		hillsMagn       0.117278
		hillsFreq       53.5165
		hillsFraction   0.833925
		hills2Fraction  0.214106
		riversMagn      58.2543
		riversFreq      3.15203
		riversSin       6.08957
		riversOctaves   0
		canyonsMagn     0.583993
		canyonsFreq     0.164551
		canyonFraction  0
		cracksMagn      0.0312494
		cracksFreq      0.306316
		cracksOctaves   0
		craterMagn      0.610745
		craterFreq      1.12464
		craterDensity   0.991404
		craterOctaves   9
		craterRayedFactor 0.177638
		volcanoMagn     0.158774
		volcanoFreq     0.766587
		volcanoDensity  0.19513
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.230878
		volcanoRadius   0.16088
		volcanoTemp     1311.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.558, 0.551, 0.547, 0.500)
		colorShelf     (0.530, 0.523, 0.520, 0.500)
		colorBeach     (0.390, 0.385, 0.383, 0.750)
		colorDesert    (0.474, 0.468, 0.465, 1.000)
		colorLowland   (0.491, 0.484, 0.481, 1.000)
		colorUpland    (0.519, 0.512, 0.509, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.491, 0.484, 0.481, 1.000)
		colorUpPlants  (0.519, 0.512, 0.509, 1.000)
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
		SemiMajorAxis   0.00918437
		Period          0.183634
		Eccentricity    0.0163536
		Inclination     0.466792
		AscendingNode   -85.7128
		ArgOfPericenter -9.66233
		MeanAnomaly     161.366
	}
}

Moon	"Althir System 8.7"
{
	ParentBody     "Althir System 8"
	Class	       "IceWorld"

	Mass            0.000303773
	Radius          592.275
	InertiaMoment   0.399597

	RotationPeriod  88.0305
	Obliquity       -56.1193
	EqAscendNode    25.4557

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.431 0.427 0.423)

	Surface
	{
		SurfStyle       0.232644
		OceanStyle      0.545409
		Randomize      (0.240, -0.355, 0.102)
		colorDistMagn   0.074974
		colorDistFreq   61.2517
		detailScale     1523.36
		colorConversion true
		drivenDarkening 0
		seaLevel        0.237249
		snowLevel       2
		tropicLatitude  0.833521
		icecapLatitude  1
		icecapHeight    0.237249
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.93645
		venusFreq       0.886406
		venusMagn       0
		mareFreq        0
		mareDensity     0.00019688
		terraceProb     0.320506
		erosion         0
		montesMagn      0.0555773
		montesFreq      19.0793
		montesSpiky     0.985749
		montesFraction  0.791274
		dunesMagn       0.0362425
		dunesFreq       782.98
		dunesFraction   0.727656
		hillsMagn       0.134597
		hillsFreq       53.699
		hillsFraction   0.0352834
		hills2Fraction  0.110759
		riversMagn      61.4535
		riversFreq      2.63091
		riversSin       4.32005
		riversOctaves   0
		canyonsMagn     0.358611
		canyonsFreq     0.222841
		canyonFraction  0
		cracksMagn      0.0397153
		cracksFreq      0.199683
		cracksOctaves   0
		craterMagn      0.656921
		craterFreq      1.98716
		craterDensity   0.830471
		craterOctaves   9
		craterRayedFactor 0.214581
		volcanoMagn     0.179105
		volcanoFreq     0.709643
		volcanoDensity  0.198407
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.0804639
		volcanoRadius   0.109431
		volcanoTemp     1884.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.431, 0.427, 0.423, 0.500)
		colorShelf     (0.410, 0.405, 0.402, 0.500)
		colorBeach     (0.302, 0.299, 0.296, 0.750)
		colorDesert    (0.367, 0.363, 0.359, 1.000)
		colorLowland   (0.379, 0.375, 0.372, 1.000)
		colorUpland    (0.401, 0.397, 0.393, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.379, 0.375, 0.372, 1.000)
		colorUpPlants  (0.401, 0.397, 0.393, 1.000)
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
		SemiMajorAxis   0.0146762
		Period          0.370936
		Eccentricity    0.0230649
		Inclination     -0.373502
		AscendingNode   23.4235
		ArgOfPericenter -56.9855
		MeanAnomaly     31.692
	}
}

Moon	"Althir System 8.8"
{
	ParentBody     "Althir System 8"
	Class	       "IceWorld"

	Mass            0.00352218
	Radius          1254.54
	InertiaMoment   0.398156

	Oblateness      0.00176354

	RotationPeriod  54.9126
	Obliquity       -80.2702
	EqAscendNode    4.80988

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.440 0.433 0.425)

	Surface
	{
		SurfStyle       0.7107
		OceanStyle      0.464784
		Randomize      (0.276, -0.635, -0.463)
		colorDistMagn   0.062075
		colorDistFreq   129.098
		detailScale     3226.74
		colorConversion true
		drivenDarkening 0
		seaLevel        0.210264
		snowLevel       2
		tropicLatitude  0.987385
		icecapLatitude  1
		icecapHeight    0.210264
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.62414
		venusFreq       1.07182
		venusMagn       0
		mareFreq        0.535996
		mareDensity     0.00119052
		terraceProb     0.444305
		erosion         0
		montesMagn      0.049931
		montesFreq      60.6541
		montesSpiky     0.986944
		montesFraction  0.92588
		dunesMagn       0.0235583
		dunesFreq       1664.14
		dunesFraction   0.246594
		hillsMagn       0.141791
		hillsFreq       174.585
		hillsFraction   0.952158
		hills2Fraction  0.0763525
		riversMagn      59.9637
		riversFreq      2.99427
		riversSin       5.36101
		riversOctaves   0
		canyonsMagn     0.475405
		canyonsFreq     0.532621
		canyonFraction  0
		cracksMagn      0.0687493
		cracksFreq      0.487564
		cracksOctaves   1
		craterMagn      0.540045
		craterFreq      4.83299
		craterDensity   0.717662
		craterOctaves   10
		craterRayedFactor 0.116292
		volcanoMagn     0.178845
		volcanoFreq     0.735428
		volcanoDensity  0.167142
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.353163
		volcanoRadius   0.151124
		volcanoTemp     1596.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.282, 0.277, 0.285, 0.250)
		colorShelf     (0.308, 0.316, 0.323, 0.250)
		colorBeach     (0.251, 0.234, 0.246, 0.200)
		colorDesert    (0.233, 0.212, 0.217, 0.200)
		colorLowland   (0.172, 0.164, 0.178, 0.200)
		colorUpland    (0.326, 0.320, 0.323, 0.250)
		colorRock      (0.640, 0.630, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.172, 0.164, 0.178, 0.200)
		colorUpPlants  (0.326, 0.320, 0.323, 0.250)
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
		SemiMajorAxis   0.023452
		Period          0.74913
		Eccentricity    0.0297848
		Inclination     -0.625781
		AscendingNode   8.13911
		ArgOfPericenter 131.017
		MeanAnomaly     -40.9386
	}
}

Moon	"Althir System 8.9"
{
	ParentBody     "Althir System 8"
	Class	       "IceWorld"

	Mass            0.000407864
	Radius          653.124
	InertiaMoment   0.398573

	RotationPeriod  84.2978
	Obliquity       61.6172
	EqAscendNode    -119.196

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.580 0.363 0.291)

	Surface
	{
		SurfStyle       0.710497
		OceanStyle      0.574875
		Randomize      (-0.183, -0.093, -0.892)
		colorDistMagn   0.0534798
		colorDistFreq   90.8571
		detailScale     1679.87
		colorConversion true
		drivenDarkening 0
		seaLevel        0.201763
		snowLevel       2
		tropicLatitude  0.88157
		icecapLatitude  1
		icecapHeight    0.201763
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.91155
		venusFreq       1.09612
		venusMagn       0
		mareFreq        0.0400469
		mareDensity     0.000262589
		terraceProb     0.44173
		erosion         0
		montesMagn      0.0690691
		montesFreq      27.4866
		montesSpiky     0.904188
		montesFraction  0.910391
		dunesMagn       0.0392312
		dunesFreq       863.343
		dunesFraction   0.305877
		hillsMagn       0.144731
		hillsFreq       80.1664
		hillsFraction   0.346525
		hills2Fraction  0.0146321
		riversMagn      61.1959
		riversFreq      3.31963
		riversSin       6.27638
		riversOctaves   0
		canyonsMagn     0.424421
		canyonsFreq     0.216155
		canyonFraction  0
		cracksMagn      0.0626455
		cracksFreq      0.362332
		cracksOctaves   0
		craterMagn      0.529297
		craterFreq      1.81879
		craterDensity   0.781202
		craterOctaves   9
		craterRayedFactor 0.110383
		volcanoMagn     0.192566
		volcanoFreq     0.726594
		volcanoDensity  0.22777
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.396478
		volcanoRadius   0.130784
		volcanoTemp     1655.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.371, 0.233, 0.195, 0.250)
		colorShelf     (0.406, 0.265, 0.222, 0.250)
		colorBeach     (0.331, 0.196, 0.169, 0.200)
		colorDesert    (0.308, 0.178, 0.149, 0.200)
		colorLowland   (0.226, 0.138, 0.122, 0.200)
		colorUpland    (0.429, 0.269, 0.222, 0.250)
		colorRock      (0.640, 0.630, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.226, 0.138, 0.122, 0.200)
		colorUpPlants  (0.429, 0.269, 0.222, 0.250)
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
		SemiMajorAxis   0.0374754
		Period          1.51354
		Eccentricity    0.041546
		Inclination     -0.37193
		AscendingNode   -125.252
		ArgOfPericenter -32.0895
		MeanAnomaly     -32.3228
	}
}

DwarfMoon	"Althir System 8.D3"
{
	ParentBody     "Althir System 8"
	Class	       "Asteroid"

	Mass            2.97981e-008
	Radius          55.5187
	InertiaMoment   0.399733

	RotationPeriod  842.682
	Obliquity       -75.5488
	EqAscendNode    37.4647

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.669 0.665 0.659)

	Surface
	{
		SurfStyle       0.792658
		OceanStyle      0.155971
		Randomize      (-0.845, 0.097, -0.863)
		colorDistMagn   0.215468
		colorDistFreq   1.24837
		detailScale     1516.03
		colorConversion true
		snowLevel       2
		tropicLatitude  0.731191
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.52982
		terraceProb     0.354754
		erosion         0
		montesMagn      0.441564
		montesFreq      2.24911
		montesSpiky     0.954221
		montesFraction  0.821043
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.17249
		hillsFraction   0.650396
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227933
		craterFreq      0.236581
		craterDensity   1.00097
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.549266
		volcanoTemp     1615.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.261, 0.226, 0.185, 0.000)
		colorShelf     (0.268, 0.233, 0.211, 0.000)
		colorBeach     (0.315, 0.273, 0.251, 0.000)
		colorDesert    (0.341, 0.293, 0.244, 0.000)
		colorLowland   (0.375, 0.313, 0.277, 0.000)
		colorUpland    (0.415, 0.379, 0.336, 0.000)
		colorRock      (0.448, 0.412, 0.363, 0.000)
		colorSnow      (0.489, 0.439, 0.382, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.220123
		Period          21.5468
		Eccentricity    0.0582492
		Inclination     -72.1954
		AscendingNode   34.6478
		ArgOfPericenter 82.2573
		MeanAnomaly     -98.733
	}
}

DwarfMoon	"Althir System 8.D4"
{
	ParentBody     "Althir System 8"
	Class	       "Asteroid"

	Mass            4.04355e-008
	Radius          51.1233
	InertiaMoment   0.397668

	RotationPeriod  665.678
	Obliquity       54.81
	EqAscendNode    -174.165

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.577 0.461 0.389)

	Surface
	{
		SurfStyle       0.84882
		OceanStyle      0.310452
		Randomize      (-0.300, -0.802, 0.891)
		colorDistMagn   0.0508627
		colorDistFreq   1.18241
		detailScale     1396.01
		colorConversion true
		snowLevel       2
		tropicLatitude  0.194796
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.40912
		terraceProb     0.37769
		erosion         0
		montesMagn      0.41009
		montesFreq      3.44952
		montesSpiky     0.825208
		montesFraction  0.875816
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.22432
		hillsFraction   0.512409
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254831
		craterFreq      0.227062
		craterDensity   0.861637
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.572587
		volcanoTemp     1605.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.225, 0.157, 0.109, 0.000)
		colorShelf     (0.231, 0.161, 0.124, 0.000)
		colorBeach     (0.271, 0.189, 0.148, 0.000)
		colorDesert    (0.294, 0.203, 0.144, 0.000)
		colorLowland   (0.323, 0.216, 0.163, 0.000)
		colorUpland    (0.358, 0.262, 0.198, 0.000)
		colorRock      (0.387, 0.286, 0.214, 0.000)
		colorSnow      (0.421, 0.304, 0.226, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.220667
		Period          21.6268
		Eccentricity    0.20002
		Inclination     44.1654
		AscendingNode   -175.259
		ArgOfPericenter 152.565
		MeanAnomaly     -18.7813
	}
}

DwarfMoon	"Althir System 8.D5"
{
	ParentBody     "Althir System 8"
	Class	       "Asteroid"

	Mass            5.49083e-008
	Radius          54.0111
	InertiaMoment   0.398933

	RotationPeriod  604.884
	Obliquity       -68.6304
	EqAscendNode    118.847

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.813 0.755 0.669)

	Surface
	{
		SurfStyle       0.414269
		OceanStyle      0.584951
		Randomize      (-0.597, -0.048, -0.115)
		colorDistMagn   0.109509
		colorDistFreq   1.85361
		detailScale     1474.86
		colorConversion true
		snowLevel       2
		tropicLatitude  0.810912
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.740665
		terraceProb     0.405814
		erosion         0
		montesMagn      0.449085
		montesFreq      2.54871
		montesSpiky     0.879349
		montesFraction  0.738633
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.15043
		hillsFraction   0.548026
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244543
		craterFreq      0.250405
		craterDensity   0.899832
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53811
		volcanoTemp     1253.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.325, 0.302, 0.268, 0.000)
		colorShelf     (0.346, 0.321, 0.284, 0.000)
		colorBeach     (0.366, 0.340, 0.301, 0.000)
		colorDesert    (0.386, 0.358, 0.318, 0.000)
		colorLowland   (0.407, 0.377, 0.335, 0.000)
		colorUpland    (0.427, 0.396, 0.351, 0.000)
		colorRock      (0.447, 0.415, 0.368, 0.000)
		colorSnow      (0.467, 0.434, 0.385, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.221304
		Period          21.7205
		Eccentricity    0.404164
		Inclination     -53.273
		AscendingNode   119.476
		ArgOfPericenter 149.114
		MeanAnomaly     178.771
	}
}

DwarfMoon	"Althir System 8.D6"
{
	ParentBody     "Althir System 8"
	Class	       "Asteroid"

	Mass            7.46783e-008
	Radius          57.4725
	InertiaMoment   0.399858

	RotationPeriod  552.862
	Obliquity       -0.19358
	EqAscendNode    118.325

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.601 0.597 0.590)

	Surface
	{
		SurfStyle       0.632767
		OceanStyle      0.0825207
		Randomize      (0.892, -0.780, 0.064)
		colorDistMagn   0.74825
		colorDistFreq   1.77959
		detailScale     1569.38
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0222596
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.54648
		terraceProb     0.558782
		erosion         0
		montesMagn      0.474991
		montesFreq      3.18451
		montesSpiky     0.846023
		montesFraction  0.272238
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.78022
		hillsFraction   0.540775
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223154
		craterFreq      0.245857
		craterDensity   0.802491
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.544098
		volcanoTemp     1449.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.234, 0.203, 0.165, 0.000)
		colorShelf     (0.240, 0.209, 0.189, 0.000)
		colorBeach     (0.282, 0.245, 0.224, 0.000)
		colorDesert    (0.306, 0.263, 0.218, 0.000)
		colorLowland   (0.336, 0.280, 0.248, 0.000)
		colorUpland    (0.372, 0.340, 0.301, 0.000)
		colorRock      (0.402, 0.370, 0.324, 0.000)
		colorSnow      (0.438, 0.394, 0.342, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.221518
		Period          21.752
		Eccentricity    0.488852
		Inclination     1.16576
		AscendingNode   120.678
		ArgOfPericenter 36.1406
		MeanAnomaly     -50.2068
	}
}

DwarfMoon	"Althir System 8.D7"
{
	ParentBody     "Althir System 8"
	Class	       "Asteroid"

	Mass            1.01818e-007
	Radius          59.5223
	InertiaMoment   0.397899

	RotationPeriod  489.496
	Obliquity       44.2667
	EqAscendNode    -5.51333

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.655 0.651 0.650)

	Surface
	{
		SurfStyle       0.364746
		OceanStyle      0.872769
		Randomize      (0.371, -0.476, -0.953)
		colorDistMagn   0.669215
		colorDistFreq   0.183373
		detailScale     1625.36
		colorConversion true
		snowLevel       2
		tropicLatitude  0.901615
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.376984
		terraceProb     0.209285
		erosion         0
		montesMagn      0.366702
		montesFreq      2.45943
		montesSpiky     0.976715
		montesFraction  0.472882
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.68836
		hillsFraction   0.841949
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224303
		craterFreq      0.186826
		craterDensity   1.06456
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.502081
		volcanoTemp     1496.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.262, 0.261, 0.260, 0.000)
		colorShelf     (0.279, 0.277, 0.276, 0.000)
		colorBeach     (0.295, 0.293, 0.292, 0.000)
		colorDesert    (0.311, 0.309, 0.309, 0.000)
		colorLowland   (0.328, 0.326, 0.325, 0.000)
		colorUpland    (0.344, 0.342, 0.341, 0.000)
		colorRock      (0.360, 0.358, 0.357, 0.000)
		colorSnow      (0.377, 0.375, 0.374, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.221818
		Period          21.7961
		Eccentricity    0.266309
		Inclination     71.628
		AscendingNode   -6.43815
		ArgOfPericenter -61.5187
		MeanAnomaly     102.99
	}
}

DwarfMoon	"Althir System 8.D8"
{
	ParentBody     "Althir System 8"
	Class	       "Asteroid"

	Mass            1.39298e-007
	Radius          77.8959
	InertiaMoment   0.399074

	RotationPeriod  548.157
	Obliquity       113.598
	EqAscendNode    24.453

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.516 0.508 0.504)

	Surface
	{
		SurfStyle       0.25079
		OceanStyle      0.647942
		Randomize      (0.893, 0.456, -0.039)
		colorDistMagn   0.653627
		colorDistFreq   4.16437
		detailScale     2127.08
		colorConversion true
		snowLevel       2
		tropicLatitude  0.42737
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.612022
		terraceProb     0.455446
		erosion         0
		montesMagn      0.381516
		montesFreq      3.30612
		montesSpiky     0.890261
		montesFraction  0.358238
		dunesFraction   0
		hillsMagn       0
		hillsFreq       15.4904
		hillsFraction   0.641169
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237809
		craterFreq      0.258622
		craterDensity   0.931893
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.491123
		volcanoTemp     1369.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.206, 0.203, 0.201, 0.000)
		colorShelf     (0.219, 0.216, 0.214, 0.000)
		colorBeach     (0.232, 0.229, 0.227, 0.000)
		colorDesert    (0.245, 0.241, 0.239, 0.000)
		colorLowland   (0.258, 0.254, 0.252, 0.000)
		colorUpland    (0.271, 0.267, 0.264, 0.000)
		colorRock      (0.284, 0.280, 0.277, 0.000)
		colorSnow      (0.296, 0.292, 0.290, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.22236
		Period          21.8761
		Eccentricity    0.352376
		Inclination     86.9617
		AscendingNode   15.2512
		ArgOfPericenter -119.29
		MeanAnomaly     10.6036
	}
}

DwarfMoon	"Althir System 8.D9"
{
	ParentBody     "Althir System 8"
	Class	       "Asteroid"

	Mass            1.91427e-007
	Radius          82.3756
	InertiaMoment   0.399983

	RotationPeriod  495.342
	Obliquity       -113.733
	EqAscendNode    -161.731

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.490 0.485 0.482)

	Surface
	{
		SurfStyle       0.12403
		OceanStyle      0.696798
		Randomize      (0.866, 0.560, -0.242)
		colorDistMagn   0.40797
		colorDistFreq   3.91214
		detailScale     2249.4
		colorConversion true
		snowLevel       2
		tropicLatitude  0.986286
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.685457
		terraceProb     0.64509
		erosion         0
		montesMagn      0.446412
		montesFreq      2.45361
		montesSpiky     0.825881
		montesFraction  0.653282
		dunesFraction   0
		hillsMagn       0
		hillsFreq       16.1868
		hillsFraction   0.674745
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25141
		craterFreq      0.227227
		craterDensity   1.01229
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.512883
		volcanoTemp     1329
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.196, 0.194, 0.193, 0.000)
		colorShelf     (0.208, 0.206, 0.205, 0.000)
		colorBeach     (0.221, 0.218, 0.217, 0.000)
		colorDesert    (0.233, 0.230, 0.229, 0.000)
		colorLowland   (0.245, 0.243, 0.241, 0.000)
		colorUpland    (0.257, 0.255, 0.253, 0.000)
		colorRock      (0.270, 0.267, 0.265, 0.000)
		colorSnow      (0.282, 0.279, 0.277, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.223003
		Period          21.971
		Eccentricity    0.382334
		Inclination     -34.3679
		AscendingNode   -164.209
		ArgOfPericenter 178.781
		MeanAnomaly     -118.384
	}
}

DwarfMoon	"Althir System 8.D10"
{
	ParentBody     "Althir System 8"
	Class	       "Asteroid"

	Mass            2.6454e-007
	Radius          88.1398
	InertiaMoment   0.398105

	RotationPeriod  450.014
	Obliquity       -105.873
	EqAscendNode    17.4188

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.531 0.523 0.518)

	Surface
	{
		SurfStyle       0.925325
		OceanStyle      0.250183
		Randomize      (-0.117, -0.658, 0.698)
		colorDistMagn   0.0241688
		colorDistFreq   5.65497
		detailScale     2406.8
		colorConversion true
		snowLevel       2
		tropicLatitude  0.225586
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.420219
		terraceProb     0.215599
		erosion         0
		montesMagn      0.437734
		montesFreq      2.82931
		montesSpiky     0.919877
		montesFraction  0.54367
		dunesFraction   0
		hillsMagn       0
		hillsFreq       22.2337
		hillsFraction   0.567894
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264792
		craterFreq      0.258249
		craterDensity   0.879018
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.57469
		volcanoTemp     1608.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.181, 0.183, 0.207, 0.050)
		colorShelf     (0.213, 0.214, 0.238, 0.040)
		colorBeach     (0.244, 0.246, 0.270, 0.030)
		colorDesert    (0.276, 0.277, 0.306, 0.020)
		colorLowland   (0.308, 0.308, 0.337, 0.030)
		colorUpland    (0.340, 0.340, 0.368, 0.050)
		colorRock      (0.372, 0.371, 0.409, 0.020)
		colorSnow      (0.372, 0.371, 0.409, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.223646
		Period          22.0662
		Eccentricity    0.132975
		Inclination     -80.5054
		AscendingNode   11.6631
		ArgOfPericenter -35.8323
		MeanAnomaly     177.454
	}
}
