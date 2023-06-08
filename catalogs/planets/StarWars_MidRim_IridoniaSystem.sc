// http://starwars.wikia.com/wiki/Iridonia
// Region : Mid Rim
// Sector : Glythe Sector
// Grid location : J7
// X : -1731.82, Y : 4403.4, Z : 264.05876303407706

// http://starwars.wikia.com/wiki/Iridonia/Legends
Planet	"Iridonia/Iridonia System 1"
{
	ParentBody     "Iridonia System"
	Class          "Terra"
	Mass            0.87
	Radius          6023.6
	InertiaMoment   0.3748
	Oblateness      0.0017382
	RotationPeriod  29
	Obliquity       18.23
	EqAscendNode    -110.57

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	BrightnessReal  1

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine/Terrestrial"
	}

	Surface
	{
		Preset         "terra_wet_mars_black_plants.cfg"
		SurfStyle       0.6246
		Randomize      (0.046, -0.473, -0.840)
		colorDistMagn   0.55725
		colorDistFreq   136.56
		detailScale     2.0169e+08
		drivenDarkening -1
		seaLevel        0.030534
		snowLevel       0.31746
		tropicLatitude  0.76336
		icecapLatitude  1
		icecapHeight    0.21374
		climatePole     0.72519
		climateTropic   0.84733
		climateEquator  0.77863
		climateSteppeMin 0.3125
		climateSteppeMax 0.5625
		climateForestMin 0.5
		climateForestMax 0.6875
		climateGrassMin  0.625
		climateGrassMax  0.8125
		humidity        0.63359
		heightTempGrad  0.625
		beachWidth      0.00033588
		tropicWidth     0.5
		mainFreq        1.0687
		venusFreq       0.79389
		venusMagn       1.3359
		mareFreq        0.001
		mareDensity     0.038168
		terraceProb     0
		erosion         0.055556
		montesMagn      1.5267
		montesFreq      30.534
		montesSpiky     0.02381
		montesFraction  0.053435
		dunesMagn       0.79365
		dunesFreq       9160.3
		dunesFraction   0.061069
		hillsMagn       0.31746
		hillsFreq       687.02
		hillsFraction   0.068702
		hills2Fraction  0.10687
		riversMagn      6.3492
		riversFreq      0.63492
		riversSin       0.63492
		riftsMagn       0
		riftsFreq       0.61069
		riftsSin        0.61069
		canyonsMagn     0.076336
		canyonsFreq     16.667
		canyonsFraction 0.099237
		cracksMagn      0.71429
		cracksFreq      0.27778
		cracksOctaves   1
		craterMagn      2.6718
		craterFreq      0
		craterDensity   0.19084
		craterOctaves   6
		craterRayedFactor 0.031746
		volcanoMagn     0.61832
		volcanoFreq     1.2672
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.61069
		volcanoRadius   0.76336
		volcanoTemp     1669
		lavaCoverTidal  0.047619
		lavaCoverSun    0.10317
		lavaCoverYoung  0.38931
		stripeZones     1.9785
		stripeFluct     0
		stripeTwist     0.080724
		cycloneMagn     4.7328
		cycloneFreq     1.2061
		cycloneDensity  0.41881
		cycloneOctaves  3
		cycloneMagn2     1.9847
		cycloneFreq2     0.53435
		cycloneLatitude2 0.26718
		cycloneOctaves2  1
		BumpHeight      19.841
		BumpOffset      7.1429
		DiffMapAlpha   "Water"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		RoughnessWater  0.50737
		RoughnessIce    0.50737
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0.73684
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Ocean
	{
		Depth           0.60575
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		ModulateBright  1
	}

	Clouds
	{
		Height          105.63
		Velocity        105.93
		BumpHeight      10.318
		BumpOffset      11.111
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		ModulateBright  1
		mainFreq        0.66412
		mainOctaves     10
		Coverage        0.51145
		stripeZones     1.9785
		stripeFluct     0
		stripeTwist     0.080724
	}

	Lava
	{
		Height          -1e+38
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		ModulateBright  1
	}

	Atmosphere
	{
		Model          "Thick"
		Height          223.46
		Density         1e-09
		Pressure        1.8828
		Greenhouse      34.351
		Bright          5.4962
		Opacity         0.25397
		SkyLight        4.5238
		Hue             -0.5
		Saturation      0.51908

		Composition
		{
			N2        	77.773
			O2        	20.862
			Ar        	0.9303
			H2O       	0.4
			CO2       	0.0398
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          4.47801694
		SemiMajorAxis   1.09216366
		Eccentricity    0.0062968
		Inclination     -2.66638
		AscendingNode   -100.008
		ArgOfPericenter 162.835
		MeanAnomaly     42.7891
	}
}


///////////////
// GENERATED //
///////////////

DwarfMoon	"Iridonia System 1.D1"
{
	ParentBody     "Iridonia System 1"
	Class	       "Asteroid"

	Mass            3.7927e-006
	Radius          200.999
	InertiaMoment   0.394702

	Oblateness      0.249

	Obliquity       0.0111169
	EqAscendNode    81.3909
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.735 0.733 0.730)

	Surface
	{
		SurfStyle       0.692215
		OceanStyle      0.788046
		Randomize      (-0.093, 0.436, 0.590)
		colorDistMagn   0.0210897
		colorDistFreq   13.4054
		detailScale     5488.61
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.597446
		terraceProb     0.142949
		erosion         0
		montesMagn      0.544343
		montesFreq      2.89145
		montesSpiky     0.892634
		montesFraction  0.541072
		dunesFraction   0
		hillsMagn       0
		hillsFreq       74.0228
		hillsFraction   0.510187
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.276524
		craterFreq      1.46002
		craterDensity   0.720748
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.499249
		volcanoTemp     1092.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.287, 0.249, 0.204, 0.000)
		colorShelf     (0.294, 0.257, 0.234, 0.000)
		colorBeach     (0.346, 0.301, 0.277, 0.000)
		colorDesert    (0.375, 0.323, 0.270, 0.000)
		colorLowland   (0.412, 0.345, 0.307, 0.000)
		colorUpland    (0.456, 0.418, 0.372, 0.000)
		colorRock      (0.493, 0.455, 0.402, 0.000)
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
		SemiMajorAxis   0.000101654
		Period          0.000900784
		Eccentricity    1.50304e-005
		Inclination     0.0111169
		AscendingNode   81.3909
		ArgOfPericenter -47.0606
		MeanAnomaly     -111.505
	}
}

DwarfMoon	"Iridonia System 1.D2"
{
	ParentBody     "Iridonia System 1"
	Class	       "Asteroid"

	Mass            5.92274e-006
	Radius          154.244
	InertiaMoment   0.398162

	Oblateness      0.0207402

	RotationPeriod  16.8343
	Obliquity       -64.6811
	EqAscendNode    -177.712
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.606 0.602 0.599)

	Surface
	{
		SurfStyle       0.639711
		OceanStyle      0.241092
		Randomize      (0.228, 0.137, -0.690)
		colorDistMagn   0.267779
		colorDistFreq   20.1877
		detailScale     4211.89
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0360873
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.488777
		terraceProb     0.384486
		erosion         0
		montesMagn      0.417298
		montesFreq      3.1053
		montesSpiky     0.942332
		montesFraction  0.231204
		dunesFraction   0
		hillsMagn       0
		hillsFreq       56.4351
		hillsFraction   0.842908
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250072
		craterFreq      0.717
		craterDensity   0.743903
		craterOctaves   11.0193
		volcanoActivity 2
		volcanoFlows    0
		volcanoRadius   0.571761
		volcanoTemp     1330.58
		lavaCoverTidal  0.179018
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.236, 0.205, 0.168, 0.000)
		colorShelf     (0.242, 0.211, 0.192, 0.000)
		colorBeach     (0.285, 0.247, 0.228, 0.000)
		colorDesert    (0.309, 0.265, 0.222, 0.000)
		colorLowland   (0.339, 0.283, 0.252, 0.000)
		colorUpland    (0.376, 0.343, 0.306, 0.000)
		colorRock      (0.406, 0.373, 0.330, 0.000)
		colorSnow      (0.442, 0.397, 0.348, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000128506
		Period          0.0012803
		Eccentricity    0.353868
		Inclination     -64.6811
		AscendingNode   -177.712
		ArgOfPericenter -76.9175
		MeanAnomaly     109.142
	}
}

Planet	"Iridonia System 2"
{
	ParentBody     "Iridonia System"
	Class	       "Desert"

	Mass            0.239663
	Radius          3554.55
	InertiaMoment   0.330436

	Oblateness      0.00454854

	RotationPeriod  17.433
	Obliquity       31.577
	EqAscendNode    16.237
	//Precession      0

	AbsMagn         -2.3421
	SlopeParam      4.49658
	AlbedoBond      0.290424
	AlbedoGeom      0.348509
	Brightness      2
	Color          (0.705 0.612 0.554)

	Surface
	{
		SurfStyle       0.893325
		OceanStyle      0.974839
		Randomize      (0.735, -0.793, 0.617)
		colorDistMagn   0.0428603
		colorDistFreq   494.829
		detailScale     9142.52
		colorConversion true
		seaLevel        0.0539118
		snowLevel       2
		tropicLatitude  0.518312
		icecapLatitude  10
		icecapHeight    0.116357
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        0.685631
		venusFreq       0.905706
		venusMagn       0.369206
		mareFreq        2.20888
		mareDensity     0.121587
		terraceProb     0.301855
		erosion         0
		montesMagn      0.19954
		montesFreq      151.159
		montesSpiky     0.967182
		montesFraction  0.550836
		dunesMagn       0.0573251
		dunesFreq       26.6606
		dunesFraction   0.745546
		hillsMagn       0.134551
		hillsFreq       426.485
		hillsFraction   0
		hills2Fraction  0
		riversMagn      63.9564
		riversFreq      3.12796
		riversSin       6.74926
		riversOctaves   0
		canyonsMagn     0.0394404
		canyonsFreq     98.1971
		canyonFraction  0
		cracksMagn      0.0719399
		cracksFreq      0.363739
		cracksOctaves   0
		craterMagn      0.61802
		craterFreq      8.33519
		craterDensity   0
		craterOctaves   0.834496
		volcanoMagn     0.650698
		volcanoFreq     0.814755
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.776588
		volcanoRadius   0.454375
		volcanoTemp     1369.87
		lavaCoverTidal  0
		lavaCoverSun    0.269893
		lavaCoverYoung  0
		stripeZones     2.47555
		stripeTwist     0
		cycloneMagn     3.2755
		cycloneFreq     0.743543
		cycloneDensity  0.476137
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
		Height          14.7417
		Velocity        105.928
		BumpHeight      4.74162
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.991153
		mainOctaves     10
		Coverage        0.180848
		stripeZones     2.47555
		stripeTwist     0
	}

	Clouds
	{
		Height          19.4832
		Velocity        116.179
		BumpHeight      4.74162
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.991153
		mainOctaves     10
		Coverage        0.180848
		stripeZones     2.47555
		stripeTwist     0
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Titan"
		Height          177.728
		Density         0.185422
		Pressure        0.530202
		Greenhouse      10.8134
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0
		Saturation      1

		Composition
		{
			CO2   	57.5942
			NH3   	21.8189
			H2O   	6.2497
			CH4   	5.86219
			C2H2  	4.21302
			SO2   	3.56757
			H2S   	0.434182
			C2H4  	0.126617
			C3H8  	0.0818483
			C2H6  	0.0356802
			N2    	0.0154881
			Ar    	0.00026455
			CO    	0.000223658
			O2    	0.000115386
		}
	}

	Aurora
	{
		Height      79.8069
		NorthLat    76.9216
		NorthLon    -105.773
		NorthRadius 1168.56
		NorthWidth  394.795
		NorthRings  2
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -63.0885
		SouthLon    92.7555
		SouthRadius 1101.22
		SouthWidth  311.4
		SouthRings  5
		SouthBright 0.3
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.737251
		GasToDust   0
		Particles   2284
		GasBright   0.120886
		DustBright  0.0630144
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.65165
		Period          1.79292
		Eccentricity    0.0592227
		Inclination     -0.367277
		AscendingNode   12.9123
		ArgOfPericenter 335.529
		MeanAnomaly     41.0493
	}
}

DwarfMoon	"Iridonia System 2.D1"
{
	ParentBody     "Iridonia System 2"
	Class	       "Asteroid"

	Mass            5.52273e-009
	Radius          12.7916
	InertiaMoment   0.398843

	Oblateness      0.249

	Obliquity       -0.000454789
	EqAscendNode    8.49021
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.585 0.580 0.577)

	Surface
	{
		SurfStyle       0.61125
		OceanStyle      0.863677
		Randomize      (-0.304, 0.837, -0.611)
		colorDistMagn   0.0822951
		colorDistFreq   0.134851
		detailScale     349.296
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.698364
		terraceProb     0.209552
		erosion         0
		montesMagn      0.569578
		montesFreq      2.73876
		montesSpiky     0.980464
		montesFraction  0.614214
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.26624
		hillsFraction   0.774266
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.207331
		craterFreq      0.242223
		craterDensity   0.479221
		craterOctaves   6.63314
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.549968
		volcanoTemp     1396.1
		lavaCoverTidal  0
		lavaCoverSun    0.269893
		lavaCoverYoung  0
		colorSea       (0.228, 0.197, 0.162, 0.000)
		colorShelf     (0.234, 0.203, 0.185, 0.000)
		colorBeach     (0.275, 0.238, 0.219, 0.000)
		colorDesert    (0.298, 0.255, 0.214, 0.000)
		colorLowland   (0.327, 0.273, 0.242, 0.000)
		colorUpland    (0.362, 0.331, 0.294, 0.000)
		colorRock      (0.392, 0.360, 0.317, 0.000)
		colorSnow      (0.427, 0.383, 0.335, 1.000)
		BumpHeight      11.5124
		BumpOffset      2.30249
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.77463e-005
		Period          0.000389752
		Eccentricity    1.36304e-005
		Inclination     -0.000454789
		AscendingNode   8.49021
		ArgOfPericenter 14.0941
		MeanAnomaly     84.5583
	}
}

Moon	"Iridonia System 2.1"
{
	ParentBody     "Iridonia System 2"
	Class	       "Selena"

	Mass            0.00072779
	Radius          605.118
	InertiaMoment   0.399074

	Oblateness      0.00663549

	Obliquity       1.0217
	EqAscendNode    -26.9447
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.435 0.430 0.427)

	Surface
	{
		SurfStyle       0.17568
		OceanStyle      0.373078
		Randomize      (-0.376, 0.716, -0.710)
		colorDistMagn   0.0785506
		colorDistFreq   59.8938
		detailScale     1556.4
		colorConversion true
		drivenDarkening 0
		seaLevel        0.198207
		snowLevel       2
		tropicLatitude  0.0346748
		icecapLatitude  10
		icecapHeight    0.108501
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.72708
		venusFreq       1.21362
		venusMagn       0
		mareFreq        0.00419651
		mareDensity     0.00116599
		terraceProb     0.278771
		erosion         0
		montesMagn      0.0713874
		montesFreq      31.2762
		montesSpiky     0.993904
		montesFraction  0.161599
		dunesMagn       0.0296369
		dunesFreq       814.259
		dunesFraction   0.263403
		hillsMagn       0.103874
		hillsFreq       72.6554
		hillsFraction   0.791438
		hills2Fraction  0
		riversMagn      50.1372
		riversFreq      3.94893
		riversSin       4.7225
		riversOctaves   0
		canyonsMagn     0.324032
		canyonsFreq     0.190044
		canyonFraction  0.683543
		cracksMagn      0.0355182
		cracksFreq      0.176562
		cracksOctaves   0
		craterMagn      0.524539
		craterFreq      2.05519
		craterDensity   0.647695
		craterOctaves   6.11733
		craterRayedFactor 0.064787
		volcanoMagn     0.194708
		volcanoFreq     0.550607
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.23946
		volcanoRadius   0.160965
		volcanoTemp     1750.49
		lavaCoverTidal  0.0859927
		lavaCoverSun    0.269893
		lavaCoverYoung  0
		colorSea       (0.320, 0.320, 0.320, 0.000)
		colorShelf     (0.370, 0.370, 0.370, 0.000)
		colorBeach     (0.218, 0.215, 0.214, 0.000)
		colorDesert    (0.270, 0.258, 0.244, 0.200)
		colorLowland   (0.292, 0.275, 0.274, 0.500)
		colorUpland    (0.305, 0.288, 0.282, 0.800)
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
		SemiMajorAxis   0.000159858
		Period          0.00238409
		Eccentricity    0.0262478
		Inclination     1.0217
		AscendingNode   -26.9447
		ArgOfPericenter -57.9752
		MeanAnomaly     -81.4897
	}
}

Moon	"Iridonia System 2.2"
{
	ParentBody     "Iridonia System 2"
	Class	       "Selena"

	Mass            0.000846393
	Radius          566.351
	InertiaMoment   0.398525

	Oblateness      0.00126386

	Obliquity       -1.14849
	EqAscendNode    121.845
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.669 0.665 0.663)

	Surface
	{
		SurfStyle       0.0140767
		OceanStyle      0.332593
		Randomize      (-0.483, -0.950, -0.305)
		colorDistMagn   0.0589933
		colorDistFreq   80.8018
		detailScale     1456.69
		colorConversion true
		drivenDarkening 0
		seaLevel        0.150946
		snowLevel       2
		tropicLatitude  0.0194814
		icecapLatitude  10
		icecapHeight    0.131391
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.85763
		venusFreq       1.69592
		venusMagn       0
		mareFreq        0
		mareDensity     0.00139945
		terraceProb     0.22964
		erosion         0
		montesMagn      0.0582394
		montesFreq      19.6294
		montesSpiky     0.834354
		montesFraction  0.273394
		dunesMagn       0.0313037
		dunesFreq       729.371
		dunesFraction   0.918498
		hillsMagn       0.118707
		hillsFreq       73.4564
		hillsFraction   0.279133
		hills2Fraction  0
		riversMagn      55.2782
		riversFreq      1.59529
		riversSin       5.81904
		riversOctaves   0
		canyonsMagn     0.365714
		canyonsFreq     0.185703
		canyonFraction  0.495857
		cracksMagn      0.0245512
		cracksFreq      0.364732
		cracksOctaves   0
		craterMagn      0.611496
		craterFreq      1.84419
		craterDensity   0.685349
		craterOctaves   6.81387
		craterRayedFactor 0.116013
		volcanoMagn     0.17334
		volcanoFreq     0.783515
		volcanoDensity  0.272998
		volcanoOctaves  3
		volcanoActivity 0.465487
		volcanoFlows    0.347446
		volcanoRadius   0.142933
		volcanoTemp     1649.48
		lavaCoverTidal  0
		lavaCoverSun    0.269893
		lavaCoverYoung  0
		colorSea       (0.320, 0.320, 0.320, 0.000)
		colorShelf     (0.370, 0.370, 0.370, 0.000)
		colorBeach     (0.334, 0.333, 0.332, 0.000)
		colorDesert    (0.415, 0.399, 0.378, 0.200)
		colorLowland   (0.448, 0.426, 0.425, 0.500)
		colorUpland    (0.468, 0.446, 0.438, 0.800)
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
		SemiMajorAxis   0.000247147
		Period          0.00458192
		Eccentricity    0.00566064
		Inclination     -1.14849
		AscendingNode   121.845
		ArgOfPericenter -36.515
		MeanAnomaly     156.068
	}
}

Moon	"Iridonia System 2.3"
{
	ParentBody     "Iridonia System 2"
	Class	       "Selena"

	Mass            0.000982123
	Radius          760.434
	InertiaMoment   0.397832

	Obliquity       -0.0904723
	EqAscendNode    -96.7543
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.488 0.483 0.477)

	Surface
	{
		SurfStyle       0.5341
		OceanStyle      0.621254
		Randomize      (-0.823, -0.225, -0.304)
		colorDistMagn   0.056691
		colorDistFreq   99.6799
		detailScale     1955.88
		colorConversion true
		drivenDarkening 0
		seaLevel        0.255025
		snowLevel       2
		tropicLatitude  0.00210018
		icecapLatitude  10
		icecapHeight    0.100855
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.67344
		venusFreq       1.608
		venusMagn       0
		mareFreq        0.125277
		mareDensity     0.000684193
		terraceProb     0.104049
		erosion         0
		montesMagn      0.0465513
		montesFreq      36.5972
		montesSpiky     0.910746
		montesFraction  0.0498331
		dunesMagn       0.0336601
		dunesFreq       997.293
		dunesFraction   0.651748
		hillsMagn       0.147851
		hillsFreq       101.088
		hillsFraction   0.470981
		hills2Fraction  0
		riversMagn      53.7113
		riversFreq      3.0336
		riversSin       6.60776
		riversOctaves   0
		canyonsMagn     0.459811
		canyonsFreq     0.229213
		canyonFraction  0.869576
		cracksMagn      0.0489886
		cracksFreq      0.320963
		cracksOctaves   0
		craterMagn      0.559778
		craterFreq      1.98277
		craterDensity   0.621684
		craterOctaves   7.57096
		craterRayedFactor 0.0657186
		volcanoMagn     0.179998
		volcanoFreq     0.647271
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 1.04909
		volcanoFlows    0.164935
		volcanoRadius   0.161543
		volcanoTemp     1559.66
		lavaCoverTidal  0
		lavaCoverSun    0.269893
		lavaCoverYoung  0
		colorSea       (0.430, 0.400, 0.370, 0.000)
		colorShelf     (0.620, 0.600, 0.530, 0.000)
		colorBeach     (0.302, 0.295, 0.257, 0.000)
		colorDesert    (0.317, 0.300, 0.262, 0.000)
		colorLowland   (0.249, 0.222, 0.200, 0.000)
		colorUpland    (0.366, 0.343, 0.296, 0.000)
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
		SemiMajorAxis   0.0003821
		Period          0.00880555
		Eccentricity    0.0457673
		Inclination     -0.0904723
		AscendingNode   -96.7543
		ArgOfPericenter 141.265
		MeanAnomaly     156.114
	}
}

DwarfMoon	"Iridonia System 2.D2"
{
	ParentBody     "Iridonia System 2"
	Class	       "Asteroid"

	Mass            1.92087e-008
	Radius          36.4361
	InertiaMoment   0.399906

	Obliquity       -68.7531
	EqAscendNode    -91.6789
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.797 0.794 0.792)

	Surface
	{
		SurfStyle       0.104092
		OceanStyle      0.322142
		Randomize      (-0.352, -0.789, -0.422)
		colorDistMagn   0.301271
		colorDistFreq   0.386635
		detailScale     994.948
		colorConversion true
		snowLevel       2
		tropicLatitude  0.987634
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.536866
		terraceProb     0.306446
		erosion         0
		montesMagn      0.411986
		montesFreq      3.99903
		montesSpiky     0.903163
		montesFraction  0.461448
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.34281
		hillsFraction   0.754626
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245761
		craterFreq      0.269516
		craterDensity   0.692848
		craterOctaves   7.1859
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.500445
		volcanoTemp     1643.65
		lavaCoverTidal  0
		lavaCoverSun    0.269893
		lavaCoverYoung  0
		colorSea       (0.319, 0.318, 0.317, 0.000)
		colorShelf     (0.339, 0.337, 0.337, 0.000)
		colorBeach     (0.359, 0.357, 0.357, 0.000)
		colorDesert    (0.379, 0.377, 0.376, 0.000)
		colorLowland   (0.399, 0.397, 0.396, 0.000)
		colorUpland    (0.418, 0.417, 0.416, 0.000)
		colorRock      (0.438, 0.437, 0.436, 0.000)
		colorSnow      (0.458, 0.457, 0.456, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00172292
		Period          0.084484
		Eccentricity    0.18254
		Inclination     -68.7531
		AscendingNode   -91.6789
		ArgOfPericenter 23.7121
		MeanAnomaly     112.641
	}
}

DwarfMoon	"Iridonia System 2.D3"
{
	ParentBody     "Iridonia System 2"
	Class	       "Asteroid"

	Mass            2.60791e-008
	Radius          19.7546
	InertiaMoment   0.397981

	RotationPeriod  315.541
	Obliquity       -32.4717
	EqAscendNode    28.4641
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.614 0.610 0.604)

	Surface
	{
		SurfStyle       0.709339
		OceanStyle      0.92503
		Randomize      (-0.325, -0.271, -0.196)
		colorDistMagn   0.695604
		colorDistFreq   0.240088
		detailScale     539.432
		colorConversion true
		snowLevel       2
		tropicLatitude  0.837255
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.456111
		terraceProb     0.249665
		erosion         0
		montesMagn      0.496109
		montesFreq      3.64125
		montesSpiky     0.971222
		montesFraction  0.520179
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.928004
		hillsFraction   0.461996
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232912
		craterFreq      0.192085
		craterDensity   0.632456
		craterOctaves   6.63314
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.555022
		volcanoTemp     1342.65
		lavaCoverTidal  0
		lavaCoverSun    0.269893
		lavaCoverYoung  0
		colorSea       (0.240, 0.207, 0.169, 0.000)
		colorShelf     (0.246, 0.213, 0.193, 0.000)
		colorBeach     (0.289, 0.250, 0.229, 0.000)
		colorDesert    (0.313, 0.268, 0.223, 0.000)
		colorLowland   (0.344, 0.287, 0.254, 0.000)
		colorUpland    (0.381, 0.348, 0.308, 0.000)
		colorRock      (0.411, 0.378, 0.332, 0.000)
		colorSnow      (0.448, 0.403, 0.350, 1.000)
		BumpHeight      17.7791
		BumpOffset      3.55583
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00232424
		Period          0.132373
		Eccentricity    0.0895203
		Inclination     -26.3245
		AscendingNode   28.4381
		ArgOfPericenter -124.063
		MeanAnomaly     54.517
	}
}

DwarfMoon	"Iridonia System 2.D4"
{
	ParentBody     "Iridonia System 2"
	Class	       "Asteroid"

	Mass            3.53877e-008
	Radius          49.109
	InertiaMoment   0.399127

	RotationPeriod  444.952
	Obliquity       51.8113
	EqAscendNode    -58.5553
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.740 0.739 0.737)

	Surface
	{
		SurfStyle       0.478341
		OceanStyle      0.71029
		Randomize      (0.654, -0.087, -0.448)
		colorDistMagn   0.159082
		colorDistFreq   0.967091
		detailScale     1341
		colorConversion true
		snowLevel       2
		tropicLatitude  0.993127
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.459769
		terraceProb     0.453679
		erosion         0
		montesMagn      0.446384
		montesFreq      3.32072
		montesSpiky     0.991131
		montesFraction  0.541034
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.74716
		hillsFraction   0.76448
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238749
		craterFreq      0.152388
		craterDensity   0.647578
		craterOctaves   7.73866
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.503658
		volcanoTemp     1393.48
		lavaCoverTidal  0
		lavaCoverSun    0.269893
		lavaCoverYoung  0
		colorSea       (0.296, 0.296, 0.295, 0.000)
		colorShelf     (0.315, 0.314, 0.313, 0.000)
		colorBeach     (0.333, 0.332, 0.332, 0.000)
		colorDesert    (0.352, 0.351, 0.350, 0.000)
		colorLowland   (0.370, 0.369, 0.368, 0.000)
		colorUpland    (0.389, 0.388, 0.387, 0.000)
		colorRock      (0.407, 0.406, 0.405, 0.000)
		colorSnow      (0.426, 0.425, 0.424, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00289595
		Period          0.184105
		Eccentricity    0.425738
		Inclination     45.6093
		AscendingNode   -55.8292
		ArgOfPericenter 155.271
		MeanAnomaly     -54.3618
	}
}

DwarfMoon	"Iridonia System 2.D5"
{
	ParentBody     "Iridonia System 2"
	Class	       "Asteroid"

	Mass            4.80342e-008
	Radius          28.4092
	InertiaMoment   0.395005

	RotationPeriod  266.373
	Obliquity       -24.5693
	EqAscendNode    1.51588
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.578 0.570 0.567)

	Surface
	{
		SurfStyle       0.593311
		OceanStyle      0.714195
		Randomize      (-0.036, -0.961, -0.029)
		colorDistMagn   0.215838
		colorDistFreq   0.438177
		detailScale     775.761
		colorConversion true
		snowLevel       2
		tropicLatitude  0.954681
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.566387
		terraceProb     0.176147
		erosion         0
		montesMagn      0.463985
		montesFreq      4.05434
		montesSpiky     0.81274
		montesFraction  0.717649
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.03408
		hillsFraction   0.599325
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244002
		craterFreq      0.2383
		craterDensity   0.689199
		craterOctaves   7.1859
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.540167
		volcanoTemp     1294.91
		lavaCoverTidal  0
		lavaCoverSun    0.269893
		lavaCoverYoung  0
		colorSea       (0.225, 0.194, 0.159, 0.000)
		colorShelf     (0.231, 0.200, 0.181, 0.000)
		colorBeach     (0.272, 0.234, 0.215, 0.000)
		colorDesert    (0.295, 0.251, 0.210, 0.000)
		colorLowland   (0.323, 0.268, 0.238, 0.000)
		colorUpland    (0.358, 0.325, 0.289, 0.000)
		colorRock      (0.387, 0.353, 0.312, 0.000)
		colorSnow      (0.422, 0.376, 0.329, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0032824
		Period          0.22216
		Eccentricity    0.247302
		Inclination     -48.165
		AscendingNode   4.19301
		ArgOfPericenter 11.0726
		MeanAnomaly     141.116
	}
}

DwarfMoon	"Iridonia System 2.D6"
{
	ParentBody     "Iridonia System 2"
	Class	       "Asteroid"

	Mass            6.52773e-008
	Radius          29.6604
	InertiaMoment   0.398179

	RotationPeriod  249.714
	Obliquity       -18.7149
	EqAscendNode    -27.2016
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.566 0.430 0.358)

	Surface
	{
		SurfStyle       0.349687
		OceanStyle      0.348407
		Randomize      (0.969, -0.224, 0.851)
		colorDistMagn   0.730887
		colorDistFreq   0.761181
		detailScale     809.926
		colorConversion true
		snowLevel       2
		tropicLatitude  0.967581
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.743308
		terraceProb     0.550712
		erosion         0
		montesMagn      0.581852
		montesFreq      3.00372
		montesSpiky     0.784953
		montesFraction  0.510472
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.83452
		hillsFraction   0.461045
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.200765
		craterFreq      0.266498
		craterDensity   0.706268
		craterOctaves   7.1859
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.458095
		volcanoTemp     1448.7
		lavaCoverTidal  0
		lavaCoverSun    0.269893
		lavaCoverYoung  0
		colorSea       (0.227, 0.172, 0.143, 0.000)
		colorShelf     (0.241, 0.183, 0.152, 0.000)
		colorBeach     (0.255, 0.194, 0.161, 0.000)
		colorDesert    (0.269, 0.204, 0.170, 0.000)
		colorLowland   (0.283, 0.215, 0.179, 0.000)
		colorUpland    (0.297, 0.226, 0.188, 0.000)
		colorRock      (0.311, 0.237, 0.197, 0.000)
		colorSnow      (0.326, 0.247, 0.206, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00378944
		Period          0.275576
		Eccentricity    0.32944
		Inclination     -58.4391
		AscendingNode   -27.198
		ArgOfPericenter -141.438
		MeanAnomaly     -148.224
	}
}

DwarfMoon	"Iridonia System 2.D7"
{
	ParentBody     "Iridonia System 2"
	Class	       "Asteroid"

	Mass            8.88943e-008
	Radius          57.4711
	InertiaMoment   0.399263

	RotationPeriod  385.641
	Obliquity       -16.0895
	EqAscendNode    -144.831
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.701 0.698 0.695)

	Surface
	{
		SurfStyle       0.66599
		OceanStyle      0.431429
		Randomize      (-0.204, -0.517, 0.186)
		colorDistMagn   0.512513
		colorDistFreq   2.31005
		detailScale     1569.35
		colorConversion true
		snowLevel       2
		tropicLatitude  0.841264
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.335326
		terraceProb     0.545871
		erosion         0
		montesMagn      0.391895
		montesFreq      3.03049
		montesSpiky     0.893349
		montesFraction  0.579194
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.05718
		hillsFraction   0.597749
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234834
		craterFreq      0.251373
		craterDensity   0.688951
		craterOctaves   7.73866
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.521465
		volcanoTemp     1342.75
		lavaCoverTidal  0
		lavaCoverSun    0.269893
		lavaCoverYoung  0
		colorSea       (0.273, 0.237, 0.195, 0.000)
		colorShelf     (0.280, 0.244, 0.222, 0.000)
		colorBeach     (0.329, 0.286, 0.264, 0.000)
		colorDesert    (0.357, 0.307, 0.257, 0.000)
		colorLowland   (0.392, 0.328, 0.292, 0.000)
		colorUpland    (0.434, 0.398, 0.354, 0.000)
		colorRock      (0.469, 0.433, 0.382, 0.000)
		colorSnow      (0.511, 0.461, 0.403, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00437868
		Period          0.34229
		Eccentricity    0.0671617
		Inclination     43.7503
		AscendingNode   -143.193
		ArgOfPericenter -54.9779
		MeanAnomaly     79.8523
	}
}

Planet	"Iridonia System 3"
{
	ParentBody     "Iridonia System"
	Class	       "Desert"

	Mass            1.14009
	Radius          6431.97
	InertiaMoment   0.331671

	Oblateness      0.00822368

	RotationPeriod  14.5019
	Obliquity       -19.2598
	EqAscendNode    0.957457
	//Precession      0

	AlbedoBond      0.327122
	AlbedoGeom      0.392547
	Brightness      2
	Color          (0.623 0.621 0.619)

	Surface
	{
		SurfStyle       0.141233
		OceanStyle      0.141079
		Randomize      (0.548, 0.447, 0.069)
		colorDistMagn   0.0717253
		colorDistFreq   888.674
		detailScale     16543.4
		colorConversion true
		seaLevel        0.0113376
		snowLevel       0.85
		tropicLatitude  0.305987
		icecapLatitude  10
		icecapHeight    0.0971781
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        0.81237
		venusFreq       1.33731
		venusMagn       0
		mareFreq        0.800492
		mareDensity     0.205477
		terraceProb     0.397824
		erosion         0
		montesMagn      0.186313
		montesFreq      205.503
		montesSpiky     0.878299
		montesFraction  0.10278
		dunesMagn       0.0583407
		dunesFreq       67.1209
		dunesFraction   0.162972
		hillsMagn       0.100064
		hillsFreq       671.436
		hillsFraction   0
		hills2Fraction  0
		riversMagn      54.4938
		riversFreq      3.64752
		riversSin       5.66068
		riversOctaves   0
		canyonsMagn     0.0261973
		canyonsFreq     180.547
		canyonFraction  0
		cracksMagn      0.101896
		cracksFreq      0.577142
		cracksOctaves   0
		craterMagn      0.651753
		craterFreq      16.8285
		craterDensity   0.105696
		craterOctaves   1.62577
		volcanoMagn     0.724952
		volcanoFreq     0.822889
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.466362
		volcanoRadius   0.567141
		volcanoTemp     1695.7
		lavaCoverTidal  0
		lavaCoverSun    0.0172864
		lavaCoverYoung  0
		stripeZones     2.53097
		stripeTwist     0
		cycloneMagn     3.17952
		cycloneFreq     0.619697
		cycloneDensity  0.334454
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
		BumpHeight      18.889
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
		Height          14.562
		Velocity        194.393
		BumpHeight      5.11727
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.03801
		mainOctaves     10
		Coverage        0.254245
		stripeZones     2.53097
		stripeTwist     0
	}

	Clouds
	{
		Height          19.6792
		Velocity        31.5054
		BumpHeight      5.11727
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.03801
		mainOctaves     10
		Coverage        0.254245
		stripeZones     2.53097
		stripeTwist     0
	}

	Clouds
	{
		Height          24.7964
		Velocity        32.0225
		BumpHeight      5.11727
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.03801
		mainOctaves     10
		Coverage        0.254245
		stripeZones     2.53097
		stripeTwist     0
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          132.065
		Density         0.207251
		Pressure        0.415809
		Greenhouse      7.83116
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0
		Saturation      0.81414

		Composition
		{
			CO2   	79.181
			H2O   	13.7421
			H2S   	2.24486
			C2H2  	1.56799
			CH4   	1.24698
			SO2   	0.82672
			NH3   	0.665842
			C2H4  	0.43926
			C2H6  	0.0431652
			C3H8  	0.0330377
			N2    	0.00885246
			Ar    	0.000115225
			He    	2.73383e-005
			Cl2   	1.82182e-005
			CO    	1.43602e-005
			Ne    	1.18035e-005
		}
	}

	Aurora
	{
		Height      152.094
		NorthLat    69.1561
		NorthLon    60.102
		NorthRadius 1566.27
		NorthWidth  657.928
		NorthRings  2
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -59.4725
		SouthLon    240.221
		SouthRadius 2534.65
		SouthWidth  620.782
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
		SemiMajorAxis   7.72851
		Period          5.5204
		Eccentricity    0.0182132
		Inclination     1.46792
		AscendingNode   10.3351
		ArgOfPericenter 68.8539
		MeanAnomaly     306.423
	}
}

Planet	"Iridonia System 4"
{
	ParentBody     "Iridonia System"
	Class	       "Desert"

	Mass            5.50223
	Radius          10028.2
	InertiaMoment   0.325352

	Oblateness      0.0127672

	RotationPeriod  10.1959
	Obliquity       9.90346
	EqAscendNode    65.1565
	//Precession      0

	AlbedoBond      0.276335
	AlbedoGeom      0.331602
	Brightness      2
	Color          (0.473 0.469 0.468)

	Surface
	{
		SurfStyle       0.243512
		OceanStyle      0.75752
		Randomize      (0.695, -0.428, -0.708)
		colorDistMagn   0.040638
		colorDistFreq   998.185
		detailScale     25793.1
		colorConversion true
		seaLevel        0.0268649
		snowLevel       0.85
		tropicLatitude  0.181637
		icecapLatitude  10
		icecapHeight    0.237359
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        0.591005
		venusFreq       1.05757
		venusMagn       0.450697
		mareFreq        2.48243
		mareDensity     0.201479
		terraceProb     0.478971
		erosion         0
		montesMagn      0.17454
		montesFreq      417.953
		montesSpiky     0.918675
		montesFraction  0.661391
		dunesMagn       0.0647296
		dunesFreq       88.3464
		dunesFraction   0.237276
		hillsMagn       0.14859
		hillsFreq       1155.26
		hillsFraction   0
		hills2Fraction  0
		riversMagn      53.8484
		riversFreq      3.53087
		riversSin       7.28406
		riversOctaves   0
		canyonsMagn     0.0516596
		canyonsFreq     277.419
		canyonFraction  0
		cracksMagn      0.131542
		cracksFreq      0.958273
		cracksOctaves   0
		craterMagn      0.834657
		craterFreq      30.9098
		craterDensity   0
		craterOctaves   0.762253
		volcanoMagn     0.75123
		volcanoFreq     0.872852
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.828637
		volcanoRadius   0.462094
		volcanoTemp     1411.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0.703378
		stripeZones     1.51296
		stripeTwist     0
		cycloneMagn     2.34021
		cycloneFreq     1.07857
		cycloneDensity  0.345861
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
		BumpHeight      13.4057
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
		Height          12.1953
		Velocity        108.01
		BumpHeight      5.49292
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.1344
		mainOctaves     10
		Coverage        0.15267
		stripeZones     1.51296
		stripeTwist     0
	}

	Clouds
	{
		Height          17.6885
		Velocity        40.6721
		BumpHeight      5.49292
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.1344
		mainOctaves     10
		Coverage        0.15267
		stripeZones     1.51296
		stripeTwist     0
	}

	Clouds
	{
		Height          23.1816
		Velocity        64.3254
		BumpHeight      5.3701
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.1344
		mainOctaves     10
		Coverage        0.15267
		stripeZones     1.51296
		stripeTwist     0
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Mars"
		Height          116.204
		Density         0.100881
		Pressure        0.358826
		Greenhouse      60.0027
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.0231484
		Saturation      1

		Composition
		{
			H2O   	82.1463
			H2    	5.99386
			NH3   	5.5233
			CO2   	2.95945
			C2H2  	1.58645
			CH4   	0.72043
			SO2   	0.520825
			H2S   	0.315529
			C2H6  	0.141963
			C2H4  	0.0414273
			C3H8  	0.0362531
			N2    	0.0137555
			CO    	0.000250659
			Ar    	0.000136437
		}
	}

	Aurora
	{
		Height      251.368
		NorthLat    61.8366
		NorthLon    4.08696
		NorthRadius 3109.84
		NorthWidth  716.017
		NorthRings  3
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -55.6638
		SouthLon    166.06
		SouthRadius 2238.5
		SouthWidth  850.188
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
		SemiMajorAxis   15.7358
		Period          16.0384
		Eccentricity    0.0624048
		Inclination     1.10794
		AscendingNode   62.2365
		ArgOfPericenter 185.489
		MeanAnomaly     100.819
	}
}

DwarfMoon	"Iridonia System 4.D1"
{
	ParentBody     "Iridonia System 4"
	Class	       "Asteroid"

	Mass            3.29442e-010
	Radius          9.03725
	InertiaMoment   0.399846

	Oblateness      0.249

	Obliquity       -0.0141092
	EqAscendNode    -101.464
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.634 0.589 0.539)

	Surface
	{
		SurfStyle       0.352414
		OceanStyle      0.274732
		Randomize      (-0.392, 0.202, 0.625)
		colorDistMagn   0.398847
		colorDistFreq   0.0616268
		detailScale     246.777
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.430912
		terraceProb     0.215813
		erosion         0
		montesMagn      0.427234
		montesFreq      3.86937
		montesSpiky     0.955862
		montesFraction  0.372541
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.210617
		hillsFraction   0.586425
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.268329
		craterFreq      0.191887
		craterDensity   0.863946
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.480504
		volcanoTemp     1658.14
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.254, 0.236, 0.215, 0.000)
		colorShelf     (0.269, 0.251, 0.229, 0.000)
		colorBeach     (0.285, 0.265, 0.242, 0.000)
		colorDesert    (0.301, 0.280, 0.256, 0.000)
		colorLowland   (0.317, 0.295, 0.269, 0.000)
		colorUpland    (0.333, 0.309, 0.283, 0.000)
		colorRock      (0.349, 0.324, 0.296, 0.000)
		colorSnow      (0.365, 0.339, 0.310, 1.000)
		BumpHeight      8.13352
		BumpOffset      1.6267
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000249051
		Period          0.000969044
		Eccentricity    6.70413e-005
		Inclination     -0.0141092
		AscendingNode   -101.464
		ArgOfPericenter -29.5078
		MeanAnomaly     -89.3882
	}
}

DwarfMoon	"Iridonia System 4.D2"
{
	ParentBody     "Iridonia System 4"
	Class	       "Asteroid"

	Mass            4.94753e-010
	Radius          6.85827
	InertiaMoment   0.397877

	Oblateness      0.0485834

	Obliquity       0.836187
	EqAscendNode    139.431
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.627 0.623 0.620)

	Surface
	{
		SurfStyle       0.823976
		OceanStyle      0.421636
		Randomize      (-0.631, 0.249, 0.411)
		colorDistMagn   0.45129
		colorDistFreq   0.0210427
		detailScale     187.276
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0101192
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.762255
		terraceProb     0.243874
		erosion         0
		montesMagn      0.435896
		montesFreq      2.98674
		montesSpiky     0.959118
		montesFraction  0.333435
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.112587
		hillsFraction   0.805232
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245387
		craterFreq      0.240038
		craterDensity   0.754056
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.481921
		volcanoTemp     1709.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.245, 0.212, 0.174, 0.000)
		colorShelf     (0.251, 0.218, 0.198, 0.000)
		colorBeach     (0.295, 0.256, 0.235, 0.000)
		colorDesert    (0.320, 0.274, 0.229, 0.000)
		colorLowland   (0.351, 0.293, 0.260, 0.000)
		colorUpland    (0.389, 0.355, 0.316, 0.000)
		colorRock      (0.420, 0.387, 0.341, 0.000)
		colorSnow      (0.458, 0.412, 0.359, 1.000)
		BumpHeight      6.17244
		BumpOffset      1.23449
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000300839
		Period          0.0012865
		Eccentricity    0.00431302
		Inclination     0.836187
		AscendingNode   139.431
		ArgOfPericenter 159.779
		MeanAnomaly     54.7828
	}
}

Moon	"Iridonia System 4.1"
{
	ParentBody     "Iridonia System 4"
	Class	       "Selena"

	Mass            0.0051383
	Radius          1027.31
	InertiaMoment   0.391794

	Oblateness      0.00377804

	Obliquity       -1.27083
	EqAscendNode    138.784
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.728 0.725 0.724)

	Surface
	{
		SurfStyle       0.182831
		OceanStyle      0.44207
		Randomize      (0.709, -0.888, -0.057)
		colorDistMagn   0.0861728
		colorDistFreq   157.312
		detailScale     2642.31
		colorConversion true
		drivenDarkening 0
		seaLevel        0.239765
		snowLevel       2
		tropicLatitude  0.0156131
		icecapLatitude  10
		icecapHeight    0.106507
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.03829
		venusFreq       0.972577
		venusMagn       0
		mareFreq        0.342207
		mareDensity     0.00485512
		terraceProb     0.180312
		erosion         0
		montesMagn      0.0469997
		montesFreq      48.7469
		montesSpiky     0.994586
		montesFraction  0.992121
		dunesMagn       0.0425091
		dunesFreq       1331.14
		dunesFraction   0.0728313
		hillsMagn       0.112172
		hillsFreq       131.574
		hillsFraction   0.798864
		hills2Fraction  0
		riversMagn      56.6477
		riversFreq      2.59594
		riversSin       6.21298
		riversOctaves   0
		canyonsMagn     0.537654
		canyonsFreq     0.491339
		canyonFraction  0.43645
		cracksMagn      0.0331952
		cracksFreq      0.501649
		cracksOctaves   0
		craterMagn      0.621477
		craterFreq      2.86185
		craterDensity   0.848935
		craterOctaves   9.74563
		craterRayedFactor 0.167304
		volcanoMagn     0.184327
		volcanoFreq     0.688555
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.328906
		volcanoRadius   0.148528
		volcanoTemp     1801.8
		lavaCoverTidal  0.0282636
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.320, 0.320, 0.000)
		colorShelf     (0.370, 0.370, 0.370, 0.000)
		colorBeach     (0.364, 0.363, 0.362, 0.000)
		colorDesert    (0.451, 0.435, 0.412, 0.200)
		colorLowland   (0.488, 0.464, 0.463, 0.500)
		colorUpland    (0.509, 0.486, 0.478, 0.800)
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
		SemiMajorAxis   0.000480381
		Period          0.00259469
		Eccentricity    0.00470361
		Inclination     -1.27083
		AscendingNode   138.784
		ArgOfPericenter 87.6394
		MeanAnomaly     85.9923
	}
}

Moon	"Iridonia System 4.2"
{
	ParentBody     "Iridonia System 4"
	Class	       "Selena"

	Mass            0.00624696
	Radius          1400.19
	InertiaMoment   0.386762

	Oblateness      0.00189676

	Obliquity       -0.37945
	EqAscendNode    128.103
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.567 0.563 0.561)

	Surface
	{
		SurfStyle       0.361642
		OceanStyle      0.558633
		Randomize      (0.286, 0.764, -0.368)
		colorDistMagn   0.0611729
		colorDistFreq   125.377
		detailScale     3601.37
		colorConversion true
		drivenDarkening 0
		seaLevel        0.161121
		snowLevel       2
		tropicLatitude  0.00579799
		icecapLatitude  10
		icecapHeight    0.161488
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.60902
		venusFreq       1.20113
		venusMagn       0
		mareFreq        0.679702
		mareDensity     0.00283769
		terraceProb     0.205726
		erosion         0
		montesMagn      0.0532907
		montesFreq      82.6347
		montesSpiky     0.894695
		montesFraction  0.910048
		dunesMagn       0.0421226
		dunesFreq       1852.02
		dunesFraction   0.934506
		hillsMagn       0.122941
		hillsFreq       169.622
		hillsFraction   0.166333
		hills2Fraction  0
		riversMagn      62.2261
		riversFreq      2.13722
		riversSin       5.82072
		riversOctaves   0
		canyonsMagn     0.687381
		canyonsFreq     0.359102
		canyonFraction  0.397248
		cracksMagn      0.0391777
		cracksFreq      0.750658
		cracksOctaves   0
		craterMagn      0.653685
		craterFreq      3.55014
		craterDensity   0.742074
		craterOctaves   9.72733
		craterRayedFactor 0
		volcanoMagn     0.16605
		volcanoFreq     0.642864
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.0111058
		volcanoRadius   0.129516
		volcanoTemp     1652.36
		lavaCoverTidal  0.128552
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.420, 0.420, 0.430, 0.000)
		colorShelf     (0.470, 0.480, 0.480, 0.000)
		colorBeach     (0.312, 0.321, 0.337, 0.000)
		colorDesert    (0.272, 0.259, 0.258, 0.000)
		colorLowland   (0.346, 0.343, 0.314, 0.000)
		colorUpland    (0.369, 0.366, 0.342, 0.000)
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
		SemiMajorAxis   0.000767075
		Period          0.00523505
		Eccentricity    0.0360352
		Inclination     -0.37945
		AscendingNode   128.102
		ArgOfPericenter 92.8419
		MeanAnomaly     100.24
	}
}

Moon	"Iridonia System 4.3"
{
	ParentBody     "Iridonia System 4"
	Class	       "Selena"

	Mass            0.00750948
	Radius          1307.15
	InertiaMoment   0.382108

	Obliquity       -1.21175
	EqAscendNode    125.585
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.452 0.448 0.443)

	Surface
	{
		SurfStyle       0.508344
		OceanStyle      0.733762
		Randomize      (-0.624, 0.157, -0.478)
		colorDistMagn   0.0400322
		colorDistFreq   178.186
		detailScale     3362.05
		colorConversion true
		drivenDarkening 0
		seaLevel        0.224983
		snowLevel       2
		tropicLatitude  0.0193371
		icecapLatitude  10
		icecapHeight    0.153373
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.76592
		venusFreq       1.1497
		venusMagn       0
		mareFreq        0.390366
		mareDensity     0.00546794
		terraceProb     0.210039
		erosion         0
		montesMagn      0.0458305
		montesFreq      66.1164
		montesSpiky     0.934494
		montesFraction  0.461654
		dunesMagn       0.0405331
		dunesFreq       1701.56
		dunesFraction   0.77358
		hillsMagn       0.135286
		hillsFreq       145.816
		hillsFraction   0.546863
		hills2Fraction  0
		riversMagn      56.436
		riversFreq      3.80873
		riversSin       6.01694
		riversOctaves   0
		canyonsMagn     0.543795
		canyonsFreq     0.446476
		canyonFraction  0.0182034
		cracksMagn      0.0309251
		cracksFreq      0.428325
		cracksOctaves   0
		craterMagn      0.563972
		craterFreq      4.72007
		craterDensity   0.911062
		craterOctaves   11
		craterRayedFactor 0.178179
		volcanoMagn     0.184492
		volcanoFreq     0.797993
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.178206
		volcanoRadius   0.136472
		volcanoTemp     1258.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.430, 0.400, 0.370, 0.000)
		colorShelf     (0.620, 0.600, 0.530, 0.000)
		colorBeach     (0.280, 0.274, 0.239, 0.000)
		colorDesert    (0.294, 0.278, 0.244, 0.000)
		colorLowland   (0.231, 0.206, 0.186, 0.000)
		colorUpland    (0.339, 0.318, 0.275, 0.000)
		colorRock      (0.300, 0.260, 0.220, 0.000)
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
		Height          65.3573
		Density         6.85582e-008
		Pressure        5.44085e-008
		Greenhouse      0.00339279
		Bright          0.585075
		Opacity         0
		SkyLight        0.195025
		Hue             0.0377269
		Saturation      1

		Composition
		{
			Cl2   	99.214
			Kr    	0.746994
			Xe    	0.0390355
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00122487
		Period          0.0105621
		Eccentricity    0.0295622
		Inclination     -1.21175
		AscendingNode   125.585
		ArgOfPericenter -61.4108
		MeanAnomaly     -67.2645
	}
}

Moon	"Iridonia System 4.4"
{
	ParentBody     "Iridonia System 4"
	Class	       "Desert"

	Mass            0.00894629
	Radius          1232.52
	InertiaMoment   0.377545

	Obliquity       0.572672
	EqAscendNode    -28.6346
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.634 0.630 0.623)

	Surface
	{
		SurfStyle       0.547299
		OceanStyle      0.483018
		Randomize      (0.523, -0.723, -0.013)
		colorDistMagn   0.0467893
		colorDistFreq   193.002
		detailScale     3170.11
		colorConversion true
		seaLevel        0.143395
		snowLevel       2
		tropicLatitude  0.0193679
		icecapLatitude  10
		icecapHeight    0.144293
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.589736
		venusFreq       1.31101
		venusMagn       0
		mareFreq        0.615457
		mareDensity     0.0115415
		terraceProb     0.14281
		erosion         0
		montesMagn      0.0502354
		montesFreq      61.8717
		montesSpiky     0.869662
		montesFraction  0.903276
		dunesMagn       0.0513516
		dunesFreq       10.0181
		dunesFraction   0.41215
		hillsMagn       0.13724
		hillsFreq       178.873
		hillsFraction   0
		hills2Fraction  0
		riversMagn      67.6783
		riversFreq      4.47025
		riversSin       4.56385
		riversOctaves   0
		canyonsMagn     0.0465583
		canyonsFreq     32.8339
		canyonFraction  0
		cracksMagn      0.0938267
		cracksFreq      0.0763094
		cracksOctaves   0
		craterMagn      0.584821
		craterFreq      3.96799
		craterDensity   0.91008
		craterOctaves   9.91808
		volcanoMagn     0.212319
		volcanoFreq     0.792521
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.782
		volcanoRadius   0.15371
		volcanoTemp     1926.78
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
		Hapke           0.987974
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
		Height          61.626
		Density         0.00120257
		Pressure        0.00105822
		Greenhouse      0.176246
		Bright          4.13068
		Opacity         1
		SkyLight        1.37689
		Hue             0.0454783
		Saturation      1

		Composition
		{
			SO2   	99.9921
			Cl2   	0.00781259
			Kr    	7.52064e-005
			Xe    	1.23749e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00195588
		Period          0.0213093
		Eccentricity    0.0146581
		Inclination     0.572672
		AscendingNode   -28.6346
		ArgOfPericenter 154.986
		MeanAnomaly     -18.0927
	}
}

Moon	"Iridonia System 4.5"
{
	ParentBody     "Iridonia System 4"
	Class	       "Desert"

	Mass            0.0105812
	Radius          1462.69
	InertiaMoment   0.372459

	Obliquity       1.27512
	EqAscendNode    -91.6412
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.25
	AlbedoGeom      0.3
	Brightness      2
	Color          (0.679 0.678 0.676)

	Surface
	{
		SurfStyle       0.130336
		OceanStyle      0.145419
		Randomize      (-0.627, 0.753, -0.121)
		colorDistMagn   0.045999
		colorDistFreq   175.579
		detailScale     3762.11
		colorConversion true
		seaLevel        0.122408
		snowLevel       2
		tropicLatitude  0.0310127
		icecapLatitude  10
		icecapHeight    0.106967
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        0.793974
		venusFreq       1.49019
		venusMagn       0.353109
		mareFreq        0.781425
		mareDensity     0.00840589
		terraceProb     0.187416
		erosion         0
		montesMagn      0.0610729
		montesFreq      89.1346
		montesSpiky     0.952096
		montesFraction  0.37001
		dunesMagn       0.0485674
		dunesFreq       12.5676
		dunesFraction   0.441787
		hillsMagn       0.128779
		hillsFreq       183.108
		hillsFraction   0
		hills2Fraction  0
		riversMagn      57.0047
		riversFreq      2.84531
		riversSin       5.3657
		riversOctaves   0
		canyonsMagn     0.0492973
		canyonsFreq     36.2743
		canyonFraction  0
		cracksMagn      0.0729589
		cracksFreq      0.153636
		cracksOctaves   0
		craterMagn      0.62577
		craterFreq      4.76416
		craterDensity   0.295937
		craterOctaves   3.54013
		volcanoMagn     0.22126
		volcanoFreq     0.787588
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.822312
		volcanoRadius   0.153852
		volcanoTemp     1715.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.84095
		stripeTwist     0.772106
		cycloneMagn     3.35285
		cycloneFreq     0.877778
		cycloneDensity  0.338096
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
		Height          14.2701
		Velocity        91.351
		BumpHeight      4.2702
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.10549
		mainOctaves     10
		Coverage        0.1
		stripeZones     1.84095
		stripeTwist     0.772106
	}

	Clouds
	{
		Height          18.5404
		Velocity        152.93
		BumpHeight      4.2702
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.10549
		mainOctaves     10
		Coverage        0.1
		stripeZones     1.84095
		stripeTwist     0.772106
	}

	Clouds
	{
		Height          22.8105
		Velocity        80.8385
		BumpHeight      4.2702
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.10549
		mainOctaves     10
		Coverage        0.1
		stripeZones     1.84095
		stripeTwist     0.772106
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          73.1344
		Density         0.12287
		Pressure        0.108271
		Greenhouse      1.12226
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0467703
		Saturation      1

		Composition
		{
			SO2   	99.9968
			Cl2   	0.00315357
		}
	}

	Aurora
	{
		Height      12.2053
		NorthLat    59.1192
		NorthLon    60.9182
		NorthRadius 431.606
		NorthWidth  149.739
		NorthRings  2
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -90
		SouthLon    237.018
		SouthRadius 453.352
		SouthWidth  124.968
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
		SemiMajorAxis   0.00312316
		Period          0.0429916
		Eccentricity    0.0156472
		Inclination     1.27512
		AscendingNode   -91.6412
		ArgOfPericenter 22.1987
		MeanAnomaly     -123.399
	}
}

Moon	"Iridonia System 4.6"
{
	ParentBody     "Iridonia System 4"
	Class	       "Desert"

	Mass            0.0124421
	Radius          1373.12
	InertiaMoment   0.374592

	Oblateness      0.00116965

	RotationPeriod  39.3074
	Obliquity       4.13667
	EqAscendNode    -64.9733
	//Precession      0

	AlbedoBond      0.355334
	AlbedoGeom      0.426401
	Brightness      2
	Color          (0.534 0.410 0.338)

	Surface
	{
		SurfStyle       0.133852
		OceanStyle      0.669456
		Randomize      (-0.130, -0.146, -0.752)
		colorDistMagn   0.070177
		colorDistFreq   187.138
		detailScale     3531.73
		colorConversion true
		seaLevel        0.11095
		snowLevel       2
		tropicLatitude  0.0716739
		icecapLatitude  10
		icecapHeight    0.156382
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        0.581266
		venusFreq       0.838404
		venusMagn       0.401217
		mareFreq        0.709414
		mareDensity     0.014735
		terraceProb     0.300415
		erosion         0
		montesMagn      0.0516615
		montesFreq      54.0757
		montesSpiky     0.913191
		montesFraction  0.0957386
		dunesMagn       0.0552535
		dunesFreq       12.0908
		dunesFraction   0.528859
		hillsMagn       0.116956
		hillsFreq       138.952
		hillsFraction   0
		hills2Fraction  0
		riversMagn      61.8038
		riversFreq      4.23549
		riversSin       5.19694
		riversOctaves   0
		canyonsMagn     0.028231
		canyonsFreq     35.9428
		canyonFraction  0
		cracksMagn      0.101597
		cracksFreq      0.0911069
		cracksOctaves   0
		craterMagn      0.606089
		craterFreq      3.69526
		craterDensity   0.110682
		craterOctaves   1.28119
		volcanoMagn     0.218818
		volcanoFreq     0.560428
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.500835
		volcanoRadius   0.146675
		volcanoTemp     1575.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     3.33621
		stripeTwist     0.0687431
		cycloneMagn     2.11899
		cycloneFreq     0.904954
		cycloneDensity  0.341965
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
		Height          14.5963
		Velocity        144.895
		BumpHeight      4.59627
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.03922
		mainOctaves     10
		Coverage        0.310669
		stripeZones     3.33621
		stripeTwist     0.0687431
	}

	Clouds
	{
		Height          19.1925
		Velocity        96.9161
		BumpHeight      4.59627
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.03922
		mainOctaves     10
		Coverage        0.310669
		stripeZones     3.33621
		stripeTwist     0.0687431
	}

	Clouds
	{
		Height          23.7888
		Velocity        116.106
		BumpHeight      4.59627
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.03922
		mainOctaves     10
		Coverage        0.310669
		stripeZones     3.33621
		stripeTwist     0.0687431
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          68.6558
		Density         0.386792
		Pressure        0.447284
		Greenhouse      1.97935
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0390189
		Saturation      1

		Composition
		{
			CO2   	75.6556
			SO2   	24.2798
			C3H8  	0.0641611
			Cl2   	0.000296214
			Kr    	9.52815e-005
		}
	}

	Aurora
	{
		Height      22.6668
		NorthLat    53.3373
		NorthLon    -111.476
		NorthRadius 330.566
		NorthWidth  89.2066
		NorthRings  5
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -37.947
		SouthLon    40.9239
		SouthRadius 462.646
		SouthWidth  108.905
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
		SemiMajorAxis   0.00498707
		Period          0.0867338
		Eccentricity    0.00766441
		Inclination     -0.0715779
		AscendingNode   -67.7814
		ArgOfPericenter 96.8252
		MeanAnomaly     -101.651
	}
}

DwarfMoon	"Iridonia System 4.D3"
{
	ParentBody     "Iridonia System 4"
	Class	       "Asteroid"

	Mass            5.71209e-009
	Radius          23.8333
	InertiaMoment   0.399331

	RotationPeriod  665.799
	Obliquity       28.7534
	EqAscendNode    -166.277
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.440 0.431 0.427)

	Surface
	{
		SurfStyle       0.342948
		OceanStyle      0.36995
		Randomize      (0.210, 0.224, 0.857)
		colorDistMagn   0.301694
		colorDistFreq   0.277669
		detailScale     650.809
		colorConversion true
		snowLevel       2
		tropicLatitude  0.951354
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.565775
		terraceProb     0.502038
		erosion         0
		montesMagn      0.22992
		montesFreq      3.66263
		montesSpiky     0.869735
		montesFraction  0.538535
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.10829
		hillsFraction   0.515201
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217117
		craterFreq      0.23049
		craterDensity   1.00358
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.370862
		volcanoTemp     1562.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.176, 0.173, 0.171, 0.000)
		colorShelf     (0.187, 0.183, 0.181, 0.000)
		colorBeach     (0.198, 0.194, 0.192, 0.000)
		colorDesert    (0.209, 0.205, 0.203, 0.000)
		colorLowland   (0.220, 0.216, 0.213, 0.000)
		colorUpland    (0.231, 0.227, 0.224, 0.000)
		colorRock      (0.242, 0.237, 0.235, 0.000)
		colorSnow      (0.253, 0.248, 0.245, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.02103
		Period          0.751915
		Eccentricity    0.475904
		Inclination     -44.258
		AscendingNode   -162.285
		ArgOfPericenter 109.949
		MeanAnomaly     -53.6512
	}
}

Planet	"Iridonia System 5"
{
	ParentBody     "Iridonia System"
	Class	       "IceGiant"

	Mass            28.2906
	Radius          25496.3
	InertiaMoment   0.203536

	Oblateness      0.0340804

	RotationPeriod  9.04262
	Obliquity       -0.933309
	EqAscendNode    51.3044
	//Precession      0

	AlbedoBond      0.484471
	AlbedoGeom      0.581366
	Brightness      2

	Surface
	{
		SurfStyle       0.0785356
		Randomize      (-0.742, -0.963, 0.117)
		detailScale     65577.9
		colorConversion true
		tropicLatitude  0.0275971
		icecapLatitude  0.927597
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0.907545
		stripeZones     6.47793
		stripeFluct     0.308309
		stripeTwist     12.1323
		cycloneMagn     5.79234
		cycloneFreq     0.680672
		cycloneDensity  0.361745
		cycloneOctaves  1
		colorLayer0    (0.280, 0.260, 0.250, 1.000)
		colorLayer1    (0.300, 0.280, 0.270, 1.000)
		colorLayer2    (0.360, 0.330, 0.320, 1.000)
		colorLayer3    (0.400, 0.370, 0.360, 1.000)
		colorLayer4    (0.440, 0.430, 0.420, 1.000)
		colorLayer5    (0.520, 0.470, 0.460, 1.000)
		colorLayer6    (0.640, 0.620, 0.590, 1.000)
		colorLayer7    (0.610, 0.590, 0.700, 1.000)
		colorLowPlants (0.440, 0.430, 0.420, 1.000)
		colorUpPlants  (0.520, 0.470, 0.460, 1.000)
		BumpHeight      15.0311
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          63.0176
		Velocity        3079.33
		BumpHeight      47.9864
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.01997
		mainOctaves     12
		Coverage        0.422357
		stripeZones     6.47793
		stripeFluct     0.308309
		stripeTwist     12.1323
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          254.963
		Density         2811.92
		Pressure        519001
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0202565
		Saturation      0.924252

		Composition
		{
			H2    	92.276
			He    	7.3436
			CH4   	0.294445
			N2    	0.0415365
			NH3   	0.0271357
			O2    	0.00855925
			C2H2  	0.00377716
			C2H4  	0.00149182
			Ne    	0.0013256
			Ar    	0.00102394
			C2H6  	0.000752009
			C3H8  	0.000373362
		}
	}

	Aurora
	{
		Height      522.869
		NorthLat    81.5846
		NorthLon    3.00291
		NorthRadius 7436.14
		NorthWidth  2064.95
		NorthRings  3
		NorthBright 1
		NorthParticles 10000
		SouthLat    -63.3951
		SouthLon    185.992
		SouthRadius 6031.42
		SouthWidth  1559.62
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
		SemiMajorAxis   32.9038
		Period          48.4948
		Eccentricity    0.0565066
		Inclination     -0.754201
		AscendingNode   41.0867
		ArgOfPericenter 148.999
		MeanAnomaly     173.283
	}
}

DwarfMoon	"Iridonia System 5.D1"
{
	ParentBody     "Iridonia System 5"
	Class	       "Asteroid"

	Mass            1.09261e-007
	Radius          32.6818
	InertiaMoment   0.398732

	Oblateness      0.0717084

	Obliquity       -0.0130353
	EqAscendNode    16.5149
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.836 0.757 0.717)

	Surface
	{
		SurfStyle       0.455196
		OceanStyle      0.718675
		Randomize      (-0.196, 0.224, 0.151)
		colorDistMagn   0.858375
		colorDistFreq   0.801848
		detailScale     892.43
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000488281
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.50568
		terraceProb     0.491519
		erosion         0
		montesMagn      0.467438
		montesFreq      2.49126
		montesSpiky     0.974121
		montesFraction  0.771701
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.57769
		hillsFraction   0.440216
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217569
		craterFreq      0.228553
		craterDensity   1.03598
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.547664
		volcanoTemp     1358.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.334, 0.303, 0.287, 0.000)
		colorShelf     (0.355, 0.322, 0.305, 0.000)
		colorBeach     (0.376, 0.341, 0.323, 0.000)
		colorDesert    (0.397, 0.360, 0.340, 0.000)
		colorLowland   (0.418, 0.379, 0.358, 0.000)
		colorUpland    (0.439, 0.398, 0.376, 0.000)
		colorRock      (0.460, 0.416, 0.394, 0.000)
		colorSnow      (0.481, 0.435, 0.412, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000359918
		Period          0.000742446
		Eccentricity    4.98057e-005
		Inclination     -0.0130353
		AscendingNode   16.5149
		ArgOfPericenter -130.767
		MeanAnomaly     -85.925
	}
}

DwarfMoon	"Iridonia System 5.D2"
{
	ParentBody     "Iridonia System 5"
	Class	       "Asteroid"

	Mass            1.49618e-007
	Radius          45.3589
	InertiaMoment   0.399688

	Oblateness      0.0628963

	Obliquity       0.0100664
	EqAscendNode    -54.9995
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.745 0.741 0.739)

	Surface
	{
		SurfStyle       0.0519621
		OceanStyle      0.428429
		Randomize      (0.526, 0.579, -0.120)
		colorDistMagn   0.798508
		colorDistFreq   1.15913
		detailScale     1238.6
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.600996
		terraceProb     0.232119
		erosion         0
		montesMagn      0.429327
		montesFreq      3.67585
		montesSpiky     0.91404
		montesFraction  0.897613
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.5347
		hillsFraction   0.649513
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251115
		craterFreq      0.198825
		craterDensity   0.745833
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.591001
		volcanoTemp     1599.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.298, 0.296, 0.296, 0.000)
		colorShelf     (0.317, 0.315, 0.314, 0.000)
		colorBeach     (0.335, 0.333, 0.333, 0.000)
		colorDesert    (0.354, 0.352, 0.351, 0.000)
		colorLowland   (0.372, 0.370, 0.369, 0.000)
		colorUpland    (0.391, 0.389, 0.388, 0.000)
		colorRock      (0.410, 0.407, 0.406, 0.000)
		colorSnow      (0.428, 0.426, 0.425, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000470495
		Period          0.00110966
		Eccentricity    4.80083e-005
		Inclination     0.0100664
		AscendingNode   -54.9995
		ArgOfPericenter 158.532
		MeanAnomaly     94.4101
	}
}

Moon	"Iridonia System 5.1"
{
	ParentBody     "Iridonia System 5"
	Class	       "Desert"

	Mass            0.00440961
	Radius          976.893
	InertiaMoment   0.391775

	Oblateness      0.00427311

	Obliquity       0.0837396
	EqAscendNode    -52.3979
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.608 0.463 0.407)

	Surface
	{
		SurfStyle       0.942897
		OceanStyle      0.728382
		Randomize      (0.148, 0.185, -0.870)
		colorDistMagn   0.0582641
		colorDistFreq   125.461
		detailScale     2512.62
		colorConversion true
		seaLevel        0.157193
		snowLevel       2
		tropicLatitude  0.00262947
		icecapLatitude  10
		icecapHeight    0.165105
		climatePole     0.4375
		climateTropic   0.438188
		climateEquator  0.6875
		heightTempGrad  0.499312
		tropicWidth     0.178686
		mainFreq        0.865699
		venusFreq       1.38839
		venusMagn       0.426649
		mareFreq        0.375858
		mareDensity     0.00708205
		terraceProb     0.170557
		erosion         0
		montesMagn      0.0455308
		montesFreq      53.8913
		montesSpiky     0.984415
		montesFraction  0.790645
		dunesMagn       0.0676517
		dunesFreq       8.24164
		dunesFraction   0.642384
		hillsMagn       0.131433
		hillsFreq       88.7329
		hillsFraction   0
		hills2Fraction  0
		riversMagn      54.3573
		riversFreq      2.81179
		riversSin       6.28165
		riversOctaves   0
		canyonsMagn     0.0249459
		canyonsFreq     25.6763
		canyonFraction  0
		cracksMagn      0.0801931
		cracksFreq      0.108636
		cracksOctaves   0
		craterMagn      0.614528
		craterFreq      2.78544
		craterDensity   0.601594
		craterOctaves   6.12156
		volcanoMagn     0.176042
		volcanoFreq     0.786248
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.238126
		volcanoRadius   0.140875
		volcanoTemp     1324.07
		lavaCoverTidal  0.254823
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
		Hapke           0.932309
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
		Height          48.8446
		Density         0.00676908
		Pressure        0.00414014
		Greenhouse      0.211364
		Bright          5.83587
		Opacity         1
		SkyLight        1.94529
		Hue             0.0285155
		Saturation      1

		Composition
		{
			SO2   	99.9987
			Cl2   	0.00122613
			Xe    	3.35333e-005
			Kr    	1.38501e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000796078
		Period          0.00244207
		Eccentricity    0.0335378
		Inclination     0.0837396
		AscendingNode   -52.3979
		ArgOfPericenter -83.1004
		MeanAnomaly     -52.8217
	}
}

Moon	"Iridonia System 5.2"
{
	ParentBody     "Iridonia System 5"
	Class	       "Selena"

	Mass            0.00517466
	Radius          1316.13
	InertiaMoment   0.386656

	Oblateness      0.00288363

	Obliquity       -0.78725
	EqAscendNode    -10.2667
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.781 0.777 0.774)

	Surface
	{
		SurfStyle       0.872543
		OceanStyle      0.762941
		Randomize      (-0.368, -0.659, -0.485)
		colorDistMagn   0.0760481
		colorDistFreq   167.408
		detailScale     3385.16
		colorConversion true
		drivenDarkening 0
		seaLevel        0.213103
		snowLevel       2
		tropicLatitude  0.0273673
		icecapLatitude  10
		icecapHeight    0.115166
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.93927
		venusFreq       1.2807
		venusMagn       0
		mareFreq        0.488489
		mareDensity     0.00241802
		terraceProb     0.144905
		erosion         0
		montesMagn      0.0461505
		montesFreq      51.2037
		montesSpiky     0.999095
		montesFraction  0.596428
		dunesMagn       0.0476869
		dunesFreq       1662.55
		dunesFraction   0.787075
		hillsMagn       0.126853
		hillsFreq       171.161
		hillsFraction   0.130108
		hills2Fraction  0
		riversMagn      56.3694
		riversFreq      2.30503
		riversSin       5.61996
		riversOctaves   0
		canyonsMagn     0.514593
		canyonsFreq     0.381711
		canyonFraction  0.677995
		cracksMagn      0.0235943
		cracksFreq      0.707712
		cracksOctaves   0
		craterMagn      0.561616
		craterFreq      2.71718
		craterDensity   0.791748
		craterOctaves   9.34641
		craterRayedFactor 0.127495
		volcanoMagn     0.170474
		volcanoFreq     0.612303
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.233224
		volcanoRadius   0.172445
		volcanoTemp     1562.16
		lavaCoverTidal  0.167029
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.400, 0.350, 0.320, 0.000)
		colorShelf     (0.470, 0.410, 0.380, 0.000)
		colorBeach     (0.437, 0.365, 0.325, 0.000)
		colorDesert    (0.398, 0.342, 0.287, 0.000)
		colorLowland   (0.305, 0.264, 0.217, 0.000)
		colorUpland    (0.516, 0.466, 0.403, 0.000)
		colorRock      (0.670, 0.620, 0.550, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.999991
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
		Height          65.8065
		Density         8.76218e-007
		Pressure        4.56209e-007
		Greenhouse      0.00548025
		Bright          0.973918
		Opacity         0
		SkyLight        0.324639
		Hue             0.0362668
		Saturation      1

		Composition
		{
			Cl2   	76.7684
			Kr    	21.5482
			Xe    	1.67973
			SO2   	0.00367065
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00115188
		Period          0.00425043
		Eccentricity    0.0307844
		Inclination     -0.78725
		AscendingNode   -10.2667
		ArgOfPericenter -126.266
		MeanAnomaly     160.447
	}
}

Moon	"Iridonia System 5.3"
{
	ParentBody     "Iridonia System 5"
	Class	       "Desert"

	Mass            0.0610498
	Radius          2585
	InertiaMoment   0.342197

	Obliquity       -0.329485
	EqAscendNode    -107.673
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.7
	AlbedoGeom      0.84
	Brightness      2
	Color          (0.572 0.566 0.560)

	Surface
	{
		SurfStyle       0.30385
		OceanStyle      0.59541
		Randomize      (0.568, 0.547, 0.572)
		colorDistMagn   0.040803
		colorDistFreq   390.153
		detailScale     6648.75
		colorConversion true
		seaLevel        0.130651
		snowLevel       2
		tropicLatitude  0.00678338
		icecapLatitude  10
		icecapHeight    0.194016
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        1.25348
		venusFreq       0.889429
		venusMagn       0.469531
		mareFreq        1.29923
		mareDensity     0.0276866
		terraceProb     0.112905
		erosion         0
		montesMagn      0.134324
		montesFreq      140.251
		montesSpiky     0.949351
		montesFraction  0.888431
		dunesMagn       0.0469782
		dunesFreq       16.6558
		dunesFraction   0.649448
		hillsMagn       0.130671
		hillsFreq       255.594
		hillsFraction   0
		hills2Fraction  0
		riversMagn      58.1744
		riversFreq      3.36824
		riversSin       4.16224
		riversOctaves   0
		canyonsMagn     0.03738
		canyonsFreq     60.5919
		canyonFraction  0
		cracksMagn      0.0908542
		cracksFreq      0.249221
		cracksOctaves   0
		craterMagn      0.568299
		craterFreq      5.9638
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.493182
		volcanoFreq     0.690357
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.406719
		volcanoRadius   0.438775
		volcanoTemp     1359.3
		lavaCoverTidal  0.13291
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.6077
		stripeTwist     0.201427
		cycloneMagn     3.64893
		cycloneFreq     0.903828
		cycloneDensity  0.437575
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
		Height          41.9858
		Velocity        102.373
		BumpHeight      6.21726
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.04718
		mainOctaves     10
		Coverage        1
		stripeZones     2.6077
		stripeTwist     0.201427
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          129.25
		Density         16.5198
		Pressure        53.962
		Greenhouse      536.412
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0
		Saturation      1

		Composition
		{
			H2O   	31.7511
			NH3   	18.2079
			CO2   	17.8348
			CH4   	17.1799
			H2S   	13.0777
			C2H4  	1.51908
			C2H6  	0.173337
			C2H2  	0.151136
			SO2   	0.0684449
			N2    	0.0214233
			C3H8  	0.0143444
			CO    	0.000683914
			O2    	5.73434e-005
			Ar    	5.36013e-005
		}
	}

	Aurora
	{
		Height      44.847
		NorthLat    56.0102
		NorthLon    109.19
		NorthRadius 763.348
		NorthWidth  159.376
		NorthRings  3
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -75.8298
		SouthLon    318.633
		SouthRadius 472.315
		SouthWidth  142.966
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
		SemiMajorAxis   0.00166672
		Period          0.00739068
		Eccentricity    0.0182266
		Inclination     -0.329485
		AscendingNode   -107.673
		ArgOfPericenter 68.9158
		MeanAnomaly     157.52
	}
}

Moon	"Iridonia System 5.4"
{
	ParentBody     "Iridonia System 5"
	Class	       "Selena"

	Mass            0.00725046
	Radius          1470.4
	InertiaMoment   0.384126

	Obliquity       -0.712532
	EqAscendNode    1.04642
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.465 0.394 0.339)

	Surface
	{
		SurfStyle       0.646382
		OceanStyle      0.0330833
		Randomize      (-0.623, 0.129, -0.202)
		colorDistMagn   0.0635147
		colorDistFreq   160.93
		detailScale     3781.96
		colorConversion true
		drivenDarkening 0
		seaLevel        0.188856
		snowLevel       2
		tropicLatitude  0.0248693
		icecapLatitude  10
		icecapHeight    0.119159
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.79488
		venusFreq       0.773455
		venusMagn       0
		mareFreq        0.728143
		mareDensity     0.00288803
		terraceProb     0.154942
		erosion         0
		montesMagn      0.0494868
		montesFreq      60.3093
		montesSpiky     0.979439
		montesFraction  0.210752
		dunesMagn       0.0462996
		dunesFreq       1932.73
		dunesFraction   0.471524
		hillsMagn       0.118611
		hillsFreq       159.471
		hillsFraction   0.176774
		hills2Fraction  0
		riversMagn      60.8279
		riversFreq      2.1445
		riversSin       5.87011
		riversOctaves   0
		canyonsMagn     0.616594
		canyonsFreq     0.552622
		canyonFraction  0.213474
		cracksMagn      0.0412247
		cracksFreq      0.358981
		cracksOctaves   0
		craterMagn      0.621761
		craterFreq      4.25362
		craterDensity   0.903625
		craterOctaves   11
		craterRayedFactor 0
		volcanoMagn     0.166863
		volcanoFreq     0.682783
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.325397
		volcanoRadius   0.150302
		volcanoTemp     1332.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.430, 0.400, 0.370, 0.000)
		colorShelf     (0.620, 0.600, 0.530, 0.000)
		colorBeach     (0.288, 0.240, 0.183, 0.000)
		colorDesert    (0.302, 0.244, 0.187, 0.000)
		colorLowland   (0.237, 0.181, 0.143, 0.000)
		colorUpland    (0.349, 0.280, 0.210, 0.000)
		colorRock      (0.300, 0.260, 0.220, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.999988
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
		Height          73.5201
		Density         1.16298e-006
		Pressure        7.05332e-007
		Greenhouse      0.00651788
		Bright          1.03066
		Opacity         0
		SkyLight        0.343552
		Hue             -0.0482304
		Saturation      1

		Composition
		{
			SO2   	99.996
			Cl2   	0.00396546
			Kr    	8.18092e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00241166
		Period          0.0128759
		Eccentricity    0.00788253
		Inclination     -0.712532
		AscendingNode   1.04642
		ArgOfPericenter 74.8106
		MeanAnomaly     -162.749
	}
}

Moon	"Iridonia System 5.5"
{
	ParentBody     "Iridonia System 5"
	Class	       "Selena"

	Mass            0.00868208
	Radius          1370.87
	InertiaMoment   0.379526

	Obliquity       0.70026
	EqAscendNode    18.7004
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.519 0.513 0.509)

	Surface
	{
		SurfStyle       0.0633056
		OceanStyle      0.0361609
		Randomize      (-0.142, 0.044, -0.894)
		colorDistMagn   0.0631667
		colorDistFreq   166.405
		detailScale     3525.97
		colorConversion true
		drivenDarkening 0
		seaLevel        0.0908196
		snowLevel       2
		tropicLatitude  0.0241176
		icecapLatitude  10
		icecapHeight    0.152476
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.93098
		venusFreq       1.0467
		venusMagn       0
		mareFreq        0.619253
		mareDensity     0.0053954
		terraceProb     0.307377
		erosion         0
		montesMagn      0.0626474
		montesFreq      53.0822
		montesSpiky     0.985732
		montesFraction  0.0205775
		dunesMagn       0.0496757
		dunesFreq       1803.73
		dunesFraction   0.0370289
		hillsMagn       0.119036
		hillsFreq       120.323
		hillsFraction   0.723788
		hills2Fraction  0
		riversMagn      54.4144
		riversFreq      2.16369
		riversSin       4.89407
		riversOctaves   0
		canyonsMagn     0.364913
		canyonsFreq     0.659154
		canyonFraction  0.0860612
		cracksMagn      0.0563055
		cracksFreq      0.285786
		cracksOctaves   0
		craterMagn      0.604915
		craterFreq      3.91033
		craterDensity   0.773832
		craterOctaves   11
		craterRayedFactor 0.23873
		volcanoMagn     0.183035
		volcanoFreq     0.765795
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.423324
		volcanoRadius   0.143514
		volcanoTemp     1509.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.320, 0.320, 0.000)
		colorShelf     (0.370, 0.370, 0.370, 0.000)
		colorBeach     (0.259, 0.256, 0.254, 0.000)
		colorDesert    (0.322, 0.308, 0.290, 0.200)
		colorLowland   (0.348, 0.328, 0.326, 0.500)
		colorUpland    (0.363, 0.344, 0.336, 0.800)
		colorRock      (0.650, 0.610, 0.620, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.999877
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
		Height          68.5437
		Density         1.2317e-005
		Pressure        1.01094e-005
		Greenhouse      0.0189077
		Bright          1.65235
		Opacity         0
		SkyLight        0.550782
		Hue             -0.040479
		Saturation      1

		Composition
		{
			CO2   	83.2084
			SO2   	16.6102
			C3H8  	0.181151
			Cl2   	0.000256142
			Kr    	3.03383e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00348955
		Period          0.0224103
		Eccentricity    0.0351212
		Inclination     0.70026
		AscendingNode   18.7004
		ArgOfPericenter 53.0747
		MeanAnomaly     -3.84133
	}
}

Moon	"Iridonia System 5.6"
{
	ParentBody     "Iridonia System 5"
	Class	       "Selena"

	Mass            0.0105039
	Radius          1299.08
	InertiaMoment   0.374715

	Obliquity       1.41802
	EqAscendNode    -93.7264
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.687 0.550 0.469)

	Surface
	{
		SurfStyle       0.43551
		OceanStyle      0.737481
		Randomize      (0.285, -0.590, 0.908)
		colorDistMagn   0.0503551
		colorDistFreq   171.713
		detailScale     3341.31
		colorConversion true
		drivenDarkening 0
		seaLevel        0.181506
		snowLevel       2
		tropicLatitude  0.0338366
		icecapLatitude  10
		icecapHeight    0.167498
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.60747
		venusFreq       0.717962
		venusMagn       0
		mareFreq        0.509754
		mareDensity     0.00881702
		terraceProb     0.365141
		erosion         0
		montesMagn      0.0472272
		montesFreq      71.1408
		montesSpiky     0.769149
		montesFraction  0.636983
		dunesMagn       0.0574452
		dunesFreq       1711.37
		dunesFraction   0.302093
		hillsMagn       0.116163
		hillsFreq       148.478
		hillsFraction   0.156186
		hills2Fraction  0
		riversMagn      55.6175
		riversFreq      2.30398
		riversSin       6.13632
		riversOctaves   0
		canyonsMagn     0.489364
		canyonsFreq     0.487469
		canyonFraction  0.367455
		cracksMagn      0.0457439
		cracksFreq      0.459242
		cracksOctaves   0
		craterMagn      0.574726
		craterFreq      2.72696
		craterDensity   0.701757
		craterOctaves   11
		craterRayedFactor 0.234098
		volcanoMagn     0.15935
		volcanoFreq     0.591996
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.184981
		volcanoRadius   0.148342
		volcanoTemp     1774.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.420, 0.420, 0.430, 0.000)
		colorShelf     (0.470, 0.480, 0.480, 0.000)
		colorBeach     (0.378, 0.313, 0.282, 0.000)
		colorDesert    (0.330, 0.253, 0.216, 0.000)
		colorLowland   (0.419, 0.335, 0.263, 0.000)
		colorUpland    (0.447, 0.357, 0.286, 0.000)
		colorRock      (0.340, 0.340, 0.340, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.999582
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
		Height          64.9541
		Density         4.18285e-005
		Pressure        3.60504e-005
		Greenhouse      0.0314422
		Bright          2.11006
		Opacity         0
		SkyLight        0.703353
		Hue             -0.0327276
		Saturation      1

		Composition
		{
			CO2   	85.153
			SO2   	7.62443
			H2S   	4.599
			C3H8  	2.60342
			Ar    	0.0153183
			Cl2   	0.00476243
			Kr    	3.24373e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00504921
		Period          0.0390044
		Eccentricity    0.0198426
		Inclination     1.41802
		AscendingNode   -93.7264
		ArgOfPericenter 144.985
		MeanAnomaly     -173.026
	}
}

Moon	"Iridonia System 5.7"
{
	ParentBody     "Iridonia System 5"
	Class	       "Selena"

	Mass            0.0128747
	Radius          1774.8
	InertiaMoment   0.36933

	RotationPeriod  215.711
	Obliquity       0.632457
	EqAscendNode    -46.7528
	//Precession      0

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.485 0.398 0.324)

	Surface
	{
		SurfStyle       0.0148396
		OceanStyle      0.183388
		Randomize      (0.926, -0.498, 0.205)
		colorDistMagn   0.0733237
		colorDistFreq   202.472
		detailScale     4564.9
		colorConversion true
		drivenDarkening 0
		seaLevel        0.255207
		snowLevel       2
		tropicLatitude  0.0202994
		icecapLatitude  10
		icecapHeight    0.145813
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.85279
		venusFreq       1.06215
		venusMagn       0
		mareFreq        0.884643
		mareDensity     0.00443124
		terraceProb     0.191102
		erosion         0
		montesMagn      0.0901288
		montesFreq      90.4587
		montesSpiky     0.83156
		montesFraction  0.413994
		dunesMagn       0.0245897
		dunesFreq       2348.47
		dunesFraction   0.881272
		hillsMagn       0.128871
		hillsFreq       209.427
		hillsFraction   0.770526
		hills2Fraction  0
		riversMagn      62.1593
		riversFreq      4.48668
		riversSin       5.97643
		riversOctaves   0
		canyonsMagn     0.502308
		canyonsFreq     0.632898
		canyonFraction  0.837862
		cracksMagn      0.0260616
		cracksFreq      0.476055
		cracksOctaves   0
		craterMagn      0.639648
		craterFreq      3.39957
		craterDensity   0.767861
		craterOctaves   11
		craterRayedFactor 0
		volcanoMagn     0.292626
		volcanoFreq     0.447925
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.251887
		volcanoRadius   0.218959
		volcanoTemp     1499.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.320, 0.320, 0.000)
		colorShelf     (0.370, 0.370, 0.370, 0.000)
		colorBeach     (0.242, 0.199, 0.162, 0.000)
		colorDesert    (0.300, 0.239, 0.185, 0.200)
		colorLowland   (0.325, 0.255, 0.208, 0.500)
		colorUpland    (0.339, 0.267, 0.214, 0.800)
		colorRock      (0.650, 0.610, 0.620, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.992691
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
		Height          88.7402
		Density         0.000730896
		Pressure        0.000589597
		Greenhouse      0.0961548
		Bright          3.73913
		Opacity         0
		SkyLight        1.24638
		Hue             -0.0249762
		Saturation      1

		Composition
		{
			CO2   	78.8556
			SO2   	20.7718
			C3H8  	0.372524
			Cl2   	5.25551e-005
			Ar    	1.62828e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00730596
		Period          0.0678853
		Eccentricity    0.0194944
		Inclination     0.634688
		AscendingNode   -46.7631
		ArgOfPericenter -6.43249
		MeanAnomaly     -126.417
	}
}

Moon	"Iridonia System 5.8"
{
	ParentBody     "Iridonia System 5"
	Class	       "Desert"

	Mass            0.160478
	Radius          3518.97
	InertiaMoment   0.333319

	Oblateness      0.00437451

	RotationPeriod  21.5115
	Obliquity       -51.6523
	EqAscendNode    -142.311
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.656 0.654 0.651)

	Surface
	{
		SurfStyle       0.590087
		OceanStyle      0.764168
		Randomize      (-0.071, 0.559, -0.824)
		colorDistMagn   0.0473901
		colorDistFreq   380.468
		detailScale     9050.98
		colorConversion true
		seaLevel        0.0426971
		snowLevel       2
		tropicLatitude  0.7762
		icecapLatitude  10
		icecapHeight    0.116331
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        0.714822
		venusFreq       1.10665
		venusMagn       0.320411
		mareFreq        2.31517
		mareDensity     0.0560995
		terraceProb     0.167674
		erosion         0
		montesMagn      0.161597
		montesFreq      184.219
		montesSpiky     0.979679
		montesFraction  0.365327
		dunesMagn       0.0477815
		dunesFreq       35.8348
		dunesFraction   0.675006
		hillsMagn       0.118249
		hillsFreq       388.52
		hillsFraction   0
		hills2Fraction  0
		riversMagn      57.2578
		riversFreq      2.40994
		riversSin       6.16732
		riversOctaves   0
		canyonsMagn     0.0110865
		canyonsFreq     100.477
		canyonFraction  0
		cracksMagn      0.0743318
		cracksFreq      0.281219
		cracksOctaves   0
		craterMagn      0.537871
		craterFreq      9.80035
		craterDensity   0.445792
		craterOctaves   5.51124
		volcanoMagn     0.663444
		volcanoFreq     0.798322
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.797664
		volcanoRadius   0.424859
		volcanoTemp     1340.26
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
		Hapke           0.770532
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
		Height          175.948
		Density         0.0229468
		Pressure        0.0418977
		Greenhouse      8.59481
		Bright          7.4498
		Opacity         1
		SkyLight        2.48327
		Hue             0
		Saturation      1

		Composition
		{
			H2O   	33.3772
			CH4   	25.9249
			NH3   	18.8107
			H2S   	16.6184
			CO2   	2.65756
			SO2   	1.93873
			C2H2  	0.273913
			C3H8  	0.193307
			C2H6  	0.096746
			C2H4  	0.0905429
			N2    	0.0174984
			CO    	0.000413864
			O2    	2.46402e-005
			Ar    	1.65595e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0105714
		Period          0.117849
		Eccentricity    0.0354069
		Inclination     -0.952419
		AscendingNode   -141.063
		ArgOfPericenter -137.48
		MeanAnomaly     10.0946
	}
}

Moon	"Iridonia System 5.9"
{
	ParentBody     "Iridonia System 5"
	Class	       "Desert"

	Mass            0.0204533
	Radius          1615.02
	InertiaMoment   0.363636

	Oblateness      0.00221864

	RotationPeriod  27.8204
	Obliquity       1.64792
	EqAscendNode    -66.7203
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.621 0.617 0.612)

	Surface
	{
		SurfStyle       0.728097
		OceanStyle      0.72706
		Randomize      (-0.548, 0.281, -0.327)
		colorDistMagn   0.0500553
		colorDistFreq   196.079
		detailScale     4153.93
		colorConversion true
		seaLevel        0.110734
		snowLevel       2
		tropicLatitude  0.027096
		icecapLatitude  10
		icecapHeight    0.20795
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        0.765712
		venusFreq       0.773991
		venusMagn       0.443794
		mareFreq        0.379503
		mareDensity     0.020718
		terraceProb     0.503958
		erosion         0
		montesMagn      0.0577762
		montesFreq      76.2865
		montesSpiky     0.970812
		montesFraction  0.42547
		dunesMagn       0.0461328
		dunesFreq       19.8764
		dunesFraction   0.0519509
		hillsMagn       0.1364
		hillsFreq       161.925
		hillsFraction   0
		hills2Fraction  0
		riversMagn      47.892
		riversFreq      3.11058
		riversSin       7.59667
		riversOctaves   0
		canyonsMagn     0.0356376
		canyonsFreq     49.6341
		canyonFraction  0
		cracksMagn      0.0878952
		cracksFreq      0.148455
		cracksOctaves   0
		craterMagn      0.618299
		craterFreq      4.7416
		craterDensity   0.505102
		craterOctaves   6.52901
		volcanoMagn     0.212694
		volcanoFreq     0.839845
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.674306
		volcanoRadius   0.158897
		volcanoTemp     1715.26
		lavaCoverTidal  0
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
		Hapke           0.826765
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
		Height          80.7511
		Density         0.0173235
		Pressure        0.0165715
		Greenhouse      1.06679
		Bright          7.04251
		Opacity         1
		SkyLight        2.3475
		Hue             -0.00947342
		Saturation      1

		Composition
		{
			CO2   	74.7163
			C2H4  	13.2608
			C2H2  	4.937
			C2H6  	3.51712
			SO2   	1.55684
			H2S   	1.1289
			C3H8  	0.838333
			N2    	0.0435601
			CO    	0.00097027
			Ar    	8.5371e-005
			Cl2   	6.4626e-005
			O2    	2.09925e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0152962
		Period          0.205626
		Eccentricity    0.0113696
		Inclination     -0.266942
		AscendingNode   -64.6939
		ArgOfPericenter -150.685
		MeanAnomaly     116.246
	}
}

DwarfMoon	"Iridonia System 5.D3"
{
	ParentBody     "Iridonia System 5"
	Class	       "Asteroid"

	Mass            5.87069e-006
	Radius          136.496
	InertiaMoment   0.398228

	RotationPeriod  146.486
	Obliquity       40.6874
	EqAscendNode    -98.5697
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.551 0.548 0.543)

	Surface
	{
		SurfStyle       0.502199
		OceanStyle      0.335002
		Randomize      (-0.323, -0.300, -0.217)
		colorDistMagn   0.879072
		colorDistFreq   8.42875
		detailScale     3727.25
		colorConversion true
		snowLevel       2
		tropicLatitude  0.894107
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.344377
		terraceProb     0.142364
		erosion         0
		montesMagn      0.391674
		montesFreq      2.52121
		montesSpiky     0.962454
		montesFraction  0.743714
		dunesFraction   0
		hillsMagn       0
		hillsFreq       36.0594
		hillsFraction   0.775884
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237364
		craterFreq      0.777715
		craterDensity   1.04977
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.472235
		volcanoTemp     1491.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.215, 0.186, 0.152, 0.000)
		colorShelf     (0.221, 0.192, 0.174, 0.000)
		colorBeach     (0.259, 0.225, 0.206, 0.000)
		colorDesert    (0.281, 0.241, 0.201, 0.000)
		colorLowland   (0.309, 0.257, 0.228, 0.000)
		colorUpland    (0.342, 0.312, 0.277, 0.000)
		colorRock      (0.369, 0.340, 0.299, 0.000)
		colorSnow      (0.403, 0.362, 0.315, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0763754
		Period          2.29503
		Eccentricity    0.0408328
		Inclination     54.2303
		AscendingNode   -90.5002
		ArgOfPericenter 39.7726
		MeanAnomaly     108.104
	}
}

DwarfMoon	"Iridonia System 5.D4"
{
	ParentBody     "Iridonia System 5"
	Class	       "Asteroid"

	Mass            1.88931e-011
	Radius          3.55251
	InertiaMoment   0.399298

	RotationPeriod  1781.45
	Obliquity       -9.79544
	EqAscendNode    136.913
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.654 0.650 0.645)

	Surface
	{
		SurfStyle       0.68168
		OceanStyle      0.748777
		Randomize      (-0.941, 0.057, 0.787)
		colorDistMagn   0.320124
		colorDistFreq   0.00605337
		detailScale     97.0072
		colorConversion true
		snowLevel       2
		tropicLatitude  0.12835
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.571765
		terraceProb     0.301405
		erosion         0
		montesMagn      0.418493
		montesFreq      3.97636
		montesSpiky     0.971067
		montesFraction  0.652982
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0376699
		hillsFraction   0.660696
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231407
		craterFreq      0.23267
		craterDensity   1.01686
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.61119
		volcanoTemp     1566.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.255, 0.221, 0.181, 0.000)
		colorShelf     (0.261, 0.228, 0.207, 0.000)
		colorBeach     (0.307, 0.267, 0.245, 0.000)
		colorDesert    (0.333, 0.286, 0.239, 0.000)
		colorLowland   (0.366, 0.306, 0.271, 0.000)
		colorUpland    (0.405, 0.371, 0.329, 0.000)
		colorRock      (0.438, 0.403, 0.355, 0.000)
		colorSnow      (0.477, 0.429, 0.374, 1.000)
		BumpHeight      3.19726
		BumpOffset      0.639452
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0769555
		Period          2.32123
		Eccentricity    0.287802
		Inclination     -10.2504
		AscendingNode   136.706
		ArgOfPericenter 139.36
		MeanAnomaly     161.504
	}
}

DwarfMoon	"Iridonia System 5.D5"
{
	ParentBody     "Iridonia System 5"
	Class	       "Asteroid"

	Mass            3.62754e-011
	Radius          2.98847
	InertiaMoment   0.396444

	RotationPeriod  1158.44
	Obliquity       -36.8068
	EqAscendNode    43.8337
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.739 0.640 0.523)

	Surface
	{
		SurfStyle       0.275207
		OceanStyle      0.86637
		Randomize      (0.892, -0.275, -0.108)
		colorDistMagn   0.821266
		colorDistFreq   0.00626261
		detailScale     81.6052
		colorConversion true
		snowLevel       2
		tropicLatitude  0.723984
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.75141
		terraceProb     0.403857
		erosion         0
		montesMagn      0.528139
		montesFreq      3.23519
		montesSpiky     0.97476
		montesFraction  0.239204
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0185651
		hillsFraction   0.780976
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255297
		craterFreq      0.249521
		craterDensity   0.790022
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.45729
		volcanoTemp     1227.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.296, 0.256, 0.209, 0.000)
		colorShelf     (0.314, 0.272, 0.222, 0.000)
		colorBeach     (0.333, 0.288, 0.235, 0.000)
		colorDesert    (0.351, 0.304, 0.249, 0.000)
		colorLowland   (0.370, 0.320, 0.262, 0.000)
		colorUpland    (0.388, 0.336, 0.275, 0.000)
		colorRock      (0.407, 0.352, 0.288, 0.000)
		colorSnow      (0.425, 0.368, 0.301, 1.000)
		BumpHeight      2.68963
		BumpOffset      0.537925
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0772368
		Period          2.33397
		Eccentricity    0.16416
		Inclination     -11.2614
		AscendingNode   35.3499
		ArgOfPericenter -176.5
		MeanAnomaly     -47.8093
	}
}

DwarfMoon	"Iridonia System 5.D6"
{
	ParentBody     "Iridonia System 5"
	Class	       "Asteroid"

	Mass            6.44878e-011
	Radius          3.26098
	InertiaMoment   0.398406

	RotationPeriod  970.855
	Obliquity       -28.4169
	EqAscendNode    85.2402
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.774 0.744 0.716)

	Surface
	{
		SurfStyle       0.0667175
		OceanStyle      0.239117
		Randomize      (0.909, -0.295, -0.965)
		colorDistMagn   0.667799
		colorDistFreq   0.0051016
		detailScale     89.0466
		colorConversion true
		snowLevel       2
		tropicLatitude  0.532948
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.368634
		terraceProb     0.363358
		erosion         0
		montesMagn      0.553418
		montesFreq      3.08676
		montesSpiky     0.949861
		montesFraction  0.70268
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0269199
		hillsFraction   0.57296
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.290906
		craterFreq      0.235392
		craterDensity   0.834412
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.539602
		volcanoTemp     1627.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.310, 0.298, 0.286, 0.000)
		colorShelf     (0.329, 0.316, 0.304, 0.000)
		colorBeach     (0.348, 0.335, 0.322, 0.000)
		colorDesert    (0.368, 0.353, 0.340, 0.000)
		colorLowland   (0.387, 0.372, 0.358, 0.000)
		colorUpland    (0.406, 0.390, 0.376, 0.000)
		colorRock      (0.426, 0.409, 0.394, 0.000)
		colorSnow      (0.445, 0.428, 0.412, 1.000)
		BumpHeight      2.93489
		BumpOffset      0.586977
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0776401
		Period          2.35227
		Eccentricity    0.0545109
		Inclination     23.1294
		AscendingNode   78.4792
		ArgOfPericenter 126.164
		MeanAnomaly     -15.2608
	}
}

DwarfMoon	"Iridonia System 5.D7"
{
	ParentBody     "Iridonia System 5"
	Class	       "Asteroid"

	Mass            1.08395e-010
	Radius          3.63764
	InertiaMoment   0.399429

	RotationPeriod  848.161
	Obliquity       61.7065
	EqAscendNode    -98.3085
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.646 0.574 0.535)

	Surface
	{
		SurfStyle       0.72854
		OceanStyle      0.922699
		Randomize      (0.883, 0.470, -0.603)
		colorDistMagn   0.979107
		colorDistFreq   0.00335862
		detailScale     99.3319
		colorConversion true
		snowLevel       2
		tropicLatitude  0.91738
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.732762
		terraceProb     0.426545
		erosion         0
		montesMagn      0.470183
		montesFreq      3.25385
		montesSpiky     0.947534
		montesFraction  0.644788
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0258577
		hillsFraction   0.60552
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.200148
		craterFreq      0.149673
		craterDensity   0.812651
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.403191
		volcanoTemp     1604.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.252, 0.195, 0.150, 0.000)
		colorShelf     (0.258, 0.201, 0.171, 0.000)
		colorBeach     (0.303, 0.236, 0.203, 0.000)
		colorDesert    (0.329, 0.253, 0.198, 0.000)
		colorLowland   (0.362, 0.270, 0.225, 0.000)
		colorUpland    (0.400, 0.327, 0.273, 0.000)
		colorRock      (0.433, 0.356, 0.294, 0.000)
		colorSnow      (0.471, 0.379, 0.310, 1.000)
		BumpHeight      3.27388
		BumpOffset      0.654776
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0781685
		Period          2.37633
		Eccentricity    0.463237
		Inclination     -20.739
		AscendingNode   -98.3468
		ArgOfPericenter 113.384
		MeanAnomaly     35.1335
	}
}

DwarfMoon	"Iridonia System 5.D8"
{
	ParentBody     "Iridonia System 5"
	Class	       "Asteroid"

	Mass            1.74613e-010
	Radius          4.01258
	InertiaMoment   0.396934

	RotationPeriod  743.429
	Obliquity       -151.26
	EqAscendNode    -58.3504
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.785 0.782 0.779)

	Surface
	{
		SurfStyle       0.901661
		OceanStyle      0.886165
		Randomize      (0.212, 0.411, 0.915)
		colorDistMagn   0.695267
		colorDistFreq   0.00310216
		detailScale     109.57
		colorConversion true
		snowLevel       2
		tropicLatitude  0.61893
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.430081
		terraceProb     0.194821
		erosion         0
		montesMagn      0.674261
		montesFreq      3.10343
		montesSpiky     0.914766
		montesFraction  0.815084
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0391876
		hillsFraction   0.703869
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222805
		craterFreq      0.140382
		craterDensity   0.936626
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.534204
		volcanoTemp     1149.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.267, 0.274, 0.311, 0.050)
		colorShelf     (0.314, 0.320, 0.358, 0.040)
		colorBeach     (0.361, 0.367, 0.405, 0.030)
		colorDesert    (0.408, 0.414, 0.459, 0.020)
		colorLowland   (0.455, 0.461, 0.506, 0.030)
		colorUpland    (0.502, 0.508, 0.553, 0.050)
		colorRock      (0.549, 0.555, 0.615, 0.020)
		colorSnow      (0.549, 0.555, 0.615, 1.000)
		BumpHeight      3.61132
		BumpOffset      0.722264
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0786806
		Period          2.39972
		Eccentricity    0.347513
		Inclination     -47.711
		AscendingNode   -56.6658
		ArgOfPericenter 149.275
		MeanAnomaly     -44.1557
	}
}

DwarfMoon	"Iridonia System 5.D9"
{
	ParentBody     "Iridonia System 5"
	Class	       "Asteroid"

	Mass            2.72085e-010
	Radius          10.4766
	InertiaMoment   0.398572

	RotationPeriod  1447.39
	Obliquity       -14.4078
	EqAscendNode    134.371
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.541 0.537 0.532)

	Surface
	{
		SurfStyle       0.376945
		OceanStyle      0.843023
		Randomize      (0.761, -0.793, 0.926)
		colorDistMagn   0.0134175
		colorDistFreq   0.043314
		detailScale     286.081
		colorConversion true
		snowLevel       2
		tropicLatitude  0.577197
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.425913
		terraceProb     0.196531
		erosion         0
		montesMagn      0.401839
		montesFreq      2.13705
		montesSpiky     0.958662
		montesFraction  0.224019
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.212405
		hillsFraction   0.657774
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231807
		craterFreq      0.189558
		craterDensity   0.75997
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.572923
		volcanoTemp     1324.53
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.217, 0.215, 0.213, 0.000)
		colorShelf     (0.230, 0.228, 0.226, 0.000)
		colorBeach     (0.244, 0.242, 0.240, 0.000)
		colorDesert    (0.257, 0.255, 0.253, 0.000)
		colorLowland   (0.271, 0.268, 0.266, 0.000)
		colorUpland    (0.284, 0.282, 0.280, 0.000)
		colorRock      (0.298, 0.295, 0.293, 0.000)
		colorSnow      (0.311, 0.309, 0.306, 1.000)
		BumpHeight      9.42892
		BumpOffset      1.88578
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0790035
		Period          2.41451
		Eccentricity    0.106559
		Inclination     -44.8507
		AscendingNode   137.778
		ArgOfPericenter -125.459
		MeanAnomaly     -36.5926
	}
}

DwarfMoon	"Iridonia System 5.D10"
{
	ParentBody     "Iridonia System 5"
	Class	       "Asteroid"

	Mass            4.12844e-010
	Radius          6.12066
	InertiaMoment   0.399558

	RotationPeriod  740.867
	Obliquity       70.9222
	EqAscendNode    -19.7063
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.457 0.452 0.445)

	Surface
	{
		SurfStyle       0.782877
		OceanStyle      0.308598
		Randomize      (-0.745, 0.829, -0.767)
		colorDistMagn   0.525465
		colorDistFreq   0.0126613
		detailScale     167.135
		colorConversion true
		snowLevel       2
		tropicLatitude  0.727575
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.332793
		terraceProb     0.127693
		erosion         0
		montesMagn      0.460183
		montesFreq      2.80205
		montesSpiky     0.770127
		montesFraction  0.761062
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.112792
		hillsFraction   0.862338
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213063
		craterFreq      0.162916
		craterDensity   0.985243
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.409949
		volcanoTemp     1648.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.178, 0.154, 0.125, 0.000)
		colorShelf     (0.183, 0.158, 0.142, 0.000)
		colorBeach     (0.215, 0.185, 0.169, 0.000)
		colorDesert    (0.233, 0.199, 0.165, 0.000)
		colorLowland   (0.256, 0.212, 0.187, 0.000)
		colorUpland    (0.283, 0.258, 0.227, 0.000)
		colorRock      (0.306, 0.280, 0.245, 0.000)
		colorSnow      (0.334, 0.298, 0.258, 1.000)
		BumpHeight      5.5086
		BumpOffset      1.10172
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0793828
		Period          2.43191
		Eccentricity    0.22715
		Inclination     66.4793
		AscendingNode   -19.5756
		ArgOfPericenter -102.5
		MeanAnomaly     48.5015
	}
}

DwarfMoon	"Iridonia System 5.D11"
{
	ParentBody     "Iridonia System 5"
	Class	       "Asteroid"

	Mass            6.13028e-010
	Radius          6.53531
	InertiaMoment   0.397288

	RotationPeriod  653.441
	Obliquity       72.7082
	EqAscendNode    -31.0658
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.470 0.465 0.463)

	Surface
	{
		SurfStyle       0.755867
		OceanStyle      0.437952
		Randomize      (-0.884, -0.031, 0.781)
		colorDistMagn   0.829495
		colorDistFreq   0.0196684
		detailScale     178.458
		colorConversion true
		snowLevel       2
		tropicLatitude  0.884066
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.409789
		terraceProb     0.237508
		erosion         0
		montesMagn      0.556183
		montesFreq      2.63418
		montesSpiky     0.957116
		montesFraction  0.414149
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.134218
		hillsFraction   0.398863
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235394
		craterFreq      0.237057
		craterDensity   0.913823
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.537051
		volcanoTemp     1665.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.183, 0.158, 0.130, 0.000)
		colorShelf     (0.188, 0.163, 0.148, 0.000)
		colorBeach     (0.221, 0.191, 0.176, 0.000)
		colorDesert    (0.239, 0.204, 0.171, 0.000)
		colorLowland   (0.263, 0.218, 0.194, 0.000)
		colorUpland    (0.291, 0.265, 0.236, 0.000)
		colorRock      (0.315, 0.288, 0.255, 0.000)
		colorSnow      (0.343, 0.307, 0.268, 1.000)
		BumpHeight      5.88178
		BumpOffset      1.17636
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0798953
		Period          2.4555
		Eccentricity    0.0853742
		Inclination     54.2676
		AscendingNode   -34.212
		ArgOfPericenter -2.40625
		MeanAnomaly     -51.4733
	}
}

Comet	"C1"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            6.27117e-010
	Radius          11.7511
	InertiaMoment   0.398517

	Oblateness      0.0105732

	RotationPeriod  48.2147
	Obliquity       125.955
	EqAscendNode    70.8291
	//Precession      0

	AbsMagn         3.98801
	SlopeParam      6.45744
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.726 0.724 0.722)

	Surface
	{
		SurfStyle       0.571805
		OceanStyle      0.512276
		Randomize      (-0.786, -0.018, -0.808)
		colorDistMagn   0.237324
		colorDistFreq   0.117139
		detailScale     320.883
		colorConversion true
		snowLevel       2
		tropicLatitude  0.873734
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.557587
		terraceProb     0.147555
		erosion         0
		montesMagn      0.559711
		montesFreq      2.48607
		montesSpiky     0.985518
		montesFraction  0.448541
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.293743
		hillsFraction   0.671478
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221271
		craterFreq      0.17685
		craterDensity   0.888927
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.567266
		volcanoTemp     1596.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.283, 0.246, 0.202, 0.000)
		colorShelf     (0.291, 0.253, 0.231, 0.000)
		colorBeach     (0.341, 0.297, 0.275, 0.000)
		colorDesert    (0.370, 0.319, 0.267, 0.000)
		colorLowland   (0.407, 0.340, 0.303, 0.000)
		colorUpland    (0.450, 0.413, 0.368, 0.000)
		colorRock      (0.487, 0.449, 0.397, 0.000)
		colorSnow      (0.530, 0.478, 0.419, 1.000)
		BumpHeight      10.576
		BumpOffset      2.11519
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.727422
		GasToDust   0.25
		Particles   2449
		GasBright   0.133425
		DustBright  0.455718
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   411.684
		Period          2146.21
		Eccentricity    0.553843
		Inclination     -122.854
		AscendingNode   75.7078
		ArgOfPericenter 48.3163
		MeanAnomaly     79.3941
	}
}

Comet	"C2"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            1.93094e-017
	Radius          0.0404776
	InertiaMoment   0.395934

	Oblateness      0.0150044

	RotationPeriod  46.405
	Obliquity       79.161
	EqAscendNode    55.4065
	//Precession      0

	AbsMagn         11.5504
	SlopeParam      2.02046
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.585 0.582 0.580)

	Surface
	{
		SurfStyle       0.818458
		OceanStyle      0.571732
		Randomize      (0.884, -0.071, -0.835)
		colorDistMagn   0.130294
		colorDistFreq   2.16149e-007
		detailScale     1.10531
		colorConversion true
		snowLevel       2
		tropicLatitude  0.838209
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.41132
		terraceProb     0.435706
		erosion         0
		montesMagn      0.534834
		montesFreq      3.71818
		montesSpiky     0.906792
		montesFraction  0.930106
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.68166e-006
		hillsFraction   0.758152
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246505
		craterFreq      0.237014
		craterDensity   0.762708
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.482512
		volcanoTemp     1457.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.228, 0.198, 0.162, 0.000)
		colorShelf     (0.234, 0.204, 0.186, 0.000)
		colorBeach     (0.275, 0.238, 0.220, 0.000)
		colorDesert    (0.298, 0.256, 0.215, 0.000)
		colorLowland   (0.328, 0.273, 0.244, 0.000)
		colorUpland    (0.363, 0.331, 0.296, 0.000)
		colorRock      (0.392, 0.361, 0.319, 0.000)
		colorSnow      (0.427, 0.384, 0.336, 1.000)
		BumpHeight      0.0364298
		BumpOffset      0.00728596
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0781263
		DustBright  0.195503
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   522.714
		Period          3070.6
		Eccentricity    0.691048
		Inclination     81.2409
		AscendingNode   53.7502
		ArgOfPericenter -85.4416
		MeanAnomaly     -152.489
	}
}

Comet	"C3"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            1.49344e-013
	Radius          0.727865
	InertiaMoment   0.399024

	Oblateness      0.0123587

	RotationPeriod  44.5913
	Obliquity       32.3667
	EqAscendNode    39.9839
	//Precession      0

	AbsMagn         7.74789
	SlopeParam      2.7938
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.628 0.626 0.623)

	Surface
	{
		SurfStyle       0.728052
		OceanStyle      0.28599
		Randomize      (-0.075, -0.975, -0.157)
		colorDistMagn   0.105011
		colorDistFreq   0.00043722
		detailScale     19.8756
		colorConversion true
		snowLevel       2
		tropicLatitude  0.856108
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.575675
		terraceProb     0.10398
		erosion         0
		montesMagn      0.482119
		montesFreq      4.25408
		montesSpiky     0.98648
		montesFraction  0.404684
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00118552
		hillsFraction   0.764449
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213143
		craterFreq      0.206791
		craterDensity   0.941108
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.496787
		volcanoTemp     1507.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.245, 0.213, 0.174, 0.000)
		colorShelf     (0.251, 0.219, 0.199, 0.000)
		colorBeach     (0.295, 0.257, 0.237, 0.000)
		colorDesert    (0.320, 0.275, 0.231, 0.000)
		colorLowland   (0.352, 0.294, 0.262, 0.000)
		colorUpland    (0.389, 0.357, 0.318, 0.000)
		colorRock      (0.421, 0.388, 0.343, 0.000)
		colorSnow      (0.459, 0.413, 0.361, 1.000)
		BumpHeight      0.655079
		BumpOffset      0.131016
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.279056
		GasToDust   0.25
		Particles   1543
		GasBright   0.261219
		DustBright  0.496897
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   546.737
		Period          3284.69
		Eccentricity    0.70218
		Inclination     126.976
		AscendingNode   -88.8259
		ArgOfPericenter -126.02
		MeanAnomaly     166.074
	}
}

Comet	"C4"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            1.15507e-009
	Radius          15.8121
	InertiaMoment   0.397488

	Oblateness      0.0177054

	RotationPeriod  42.7689
	Obliquity       345.572
	EqAscendNode    24.5613
	//Precession      0

	AbsMagn         3.62665
	SlopeParam      3.41681
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.831 0.758 0.728)

	Surface
	{
		SurfStyle       0.620208
		OceanStyle      0.631719
		Randomize      (-0.195, 0.595, 0.415)
		colorDistMagn   0.459894
		colorDistFreq   0.128188
		detailScale     431.775
		colorConversion true
		snowLevel       2
		tropicLatitude  0.938217
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.70988
		terraceProb     0.364107
		erosion         0
		montesMagn      0.602839
		montesFreq      3.6094
		montesSpiky     0.879126
		montesFraction  0.376676
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.538862
		hillsFraction   0.662983
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.208417
		craterFreq      0.256607
		craterDensity   0.975926
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.518792
		volcanoTemp     1668.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.324, 0.258, 0.204, 0.000)
		colorShelf     (0.332, 0.265, 0.233, 0.000)
		colorBeach     (0.390, 0.311, 0.277, 0.000)
		colorDesert    (0.424, 0.333, 0.269, 0.000)
		colorLowland   (0.465, 0.356, 0.306, 0.000)
		colorUpland    (0.515, 0.432, 0.371, 0.000)
		colorRock      (0.556, 0.470, 0.400, 0.000)
		colorSnow      (0.606, 0.500, 0.422, 1.000)
		BumpHeight      14.2309
		BumpOffset      2.84617
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.760248
		GasToDust   0.25
		Particles   2515
		GasBright   0.178638
		DustBright  0.263964
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   429.915
		Period          2290.34
		Eccentricity    0.641948
		Inclination     -80.3414
		AscendingNode   138.36
		ArgOfPericenter 81.9845
		MeanAnomaly     73.8621
	}
}

Comet	"C5"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            3.55654e-017
	Radius          0.0450841
	InertiaMoment   0.399474

	Oblateness      0.0146601

	RotationPeriod  40.9329
	Obliquity       298.778
	EqAscendNode    9.13874
	//Precession      0

	AbsMagn         11.2509
	SlopeParam      3.98683
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.845 0.803 0.751)

	Surface
	{
		SurfStyle       0.926876
		OceanStyle      0.97381
		Randomize      (0.528, -0.758, 0.526)
		colorDistMagn   0.248651
		colorDistFreq   1.67606e-006
		detailScale     1.2311
		colorConversion true
		snowLevel       2
		tropicLatitude  0.18738
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.543004
		terraceProb     0.542897
		erosion         0
		montesMagn      0.530504
		montesFreq      3.11491
		montesSpiky     0.747784
		montesFraction  0.30885
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.9009e-006
		hillsFraction   0.623937
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24514
		craterFreq      0.15861
		craterDensity   0.861368
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.511533
		volcanoTemp     1595.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.287, 0.281, 0.300, 0.050)
		colorShelf     (0.338, 0.329, 0.345, 0.040)
		colorBeach     (0.389, 0.378, 0.391, 0.030)
		colorDesert    (0.440, 0.426, 0.443, 0.020)
		colorLowland   (0.490, 0.474, 0.488, 0.030)
		colorUpland    (0.541, 0.522, 0.533, 0.050)
		colorRock      (0.592, 0.570, 0.593, 0.020)
		colorSnow      (0.592, 0.570, 0.593, 1.000)
		BumpHeight      0.0405757
		BumpOffset      0.00811514
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.428922
		DustBright  0.498168
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   542.938
		Period          3250.51
		Eccentricity    0.864073
		Inclination     66.8108
		AscendingNode   -10.2901
		ArgOfPericenter 4.32152
		MeanAnomaly     -161.243
	}
}

Comet	"C6"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            2.75073e-013
	Radius          0.978973
	InertiaMoment   0.39823

	Oblateness      0.0211935

	RotationPeriod  39.0784
	Obliquity       251.984
	EqAscendNode    353.716
	//Precession      0

	AbsMagn         7.5384
	SlopeParam      4.55578
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.613 0.608 0.602)

	Surface
	{
		SurfStyle       0.431438
		OceanStyle      0.14611
		Randomize      (0.498, -0.578, 0.009)
		colorDistMagn   0.89534
		colorDistFreq   0.000521229
		detailScale     26.7325
		colorConversion true
		snowLevel       2
		tropicLatitude  0.271044
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.309577
		terraceProb     0.280621
		erosion         0
		montesMagn      0.439596
		montesFreq      2.97481
		montesSpiky     0.973641
		montesFraction  0.71186
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00231791
		hillsFraction   0.736248
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.202308
		craterFreq      0.246857
		craterDensity   0.79273
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.554458
		volcanoTemp     1406.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.245, 0.243, 0.241, 0.000)
		colorShelf     (0.261, 0.258, 0.256, 0.000)
		colorBeach     (0.276, 0.274, 0.271, 0.000)
		colorDesert    (0.291, 0.289, 0.286, 0.000)
		colorLowland   (0.306, 0.304, 0.301, 0.000)
		colorUpland    (0.322, 0.319, 0.316, 0.000)
		colorRock      (0.337, 0.334, 0.331, 0.000)
		colorSnow      (0.352, 0.350, 0.346, 1.000)
		BumpHeight      0.881076
		BumpOffset      0.176215
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.311882
		GasToDust   0.25
		Particles   1609
		GasBright   0.0132708
		DustBright  0.598305
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   370.257
		Period          1830.55
		Eccentricity    0.709568
		Inclination     -75.7933
		AscendingNode   15.8894
		ArgOfPericenter -85.06
		MeanAnomaly     33.5947
	}
}

Comet	"C7"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            2.12749e-009
	Radius          17.6196
	InertiaMoment   0.399899

	Oblateness      0.0177404

	RotationPeriod  37.1999
	Obliquity       205.19
	EqAscendNode    338.294
	//Precession      0

	AbsMagn         3.22554
	SlopeParam      5.17477
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.541 0.538 0.535)

	Surface
	{
		SurfStyle       0.569561
		OceanStyle      0.222301
		Randomize      (-0.002, -0.586, -0.463)
		colorDistMagn   0.655246
		colorDistFreq   0.222609
		detailScale     481.131
		colorConversion true
		snowLevel       2
		tropicLatitude  0.24732
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.493132
		terraceProb     0.367263
		erosion         0
		montesMagn      0.575139
		montesFreq      3.4113
		montesSpiky     0.874597
		montesFraction  0.923025
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.598223
		hillsFraction   0.517572
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263552
		craterFreq      0.252701
		craterDensity   0.91725
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.515061
		volcanoTemp     1922.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.211, 0.183, 0.150, 0.000)
		colorShelf     (0.216, 0.188, 0.171, 0.000)
		colorBeach     (0.254, 0.221, 0.203, 0.000)
		colorDesert    (0.276, 0.237, 0.198, 0.000)
		colorLowland   (0.303, 0.253, 0.225, 0.000)
		colorUpland    (0.335, 0.307, 0.273, 0.000)
		colorRock      (0.362, 0.334, 0.294, 0.000)
		colorSnow      (0.395, 0.355, 0.310, 1.000)
		BumpHeight      15.8576
		BumpOffset      3.17152
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.793074
		GasToDust   0.25
		Particles   2581
		GasBright   0.0239055
		DustBright  0.272157
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   464.221
		Period          2569.88
		Eccentricity    0.537403
		Inclination     150.699
		AscendingNode   30.3213
		ArgOfPericenter 99.1942
		MeanAnomaly     121.587
	}
}

Comet	"C8"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            6.55071e-017
	Radius          0.0606123
	InertiaMoment   0.398784

	Oblateness      0.0259519

	RotationPeriod  35.2915
	Obliquity       158.395
	EqAscendNode    322.871
	//Precession      0

	AbsMagn         10.9686
	SlopeParam      5.93701
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.412 0.408 0.405)

	Surface
	{
		SurfStyle       0.0204688
		OceanStyle      0.143833
		Randomize      (-0.085, -0.665, 0.498)
		colorDistMagn   0.381138
		colorDistFreq   2.45861e-006
		detailScale     1.65512
		colorConversion true
		snowLevel       2
		tropicLatitude  0.430057
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.508046
		terraceProb     0.150871
		erosion         0
		montesMagn      0.36986
		montesFreq      3.28242
		montesSpiky     0.951726
		montesFraction  0.742796
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.86093e-006
		hillsFraction   0.786604
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.207172
		craterFreq      0.276949
		craterDensity   0.822717
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.478161
		volcanoTemp     1347.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.165, 0.163, 0.162, 0.000)
		colorShelf     (0.175, 0.173, 0.172, 0.000)
		colorBeach     (0.185, 0.183, 0.182, 0.000)
		colorDesert    (0.196, 0.194, 0.192, 0.000)
		colorLowland   (0.206, 0.204, 0.202, 0.000)
		colorUpland    (0.216, 0.214, 0.213, 0.000)
		colorRock      (0.227, 0.224, 0.223, 0.000)
		colorSnow      (0.237, 0.234, 0.233, 1.000)
		BumpHeight      0.0545511
		BumpOffset      0.0109102
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.109113
		DustBright  0.671436
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   560.826
		Period          3412.47
		Eccentricity    0.661432
		Inclination     147.461
		AscendingNode   -126.934
		ArgOfPericenter -116.975
		MeanAnomaly     -0.557876
	}
}

Comet	"C9"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            5.0665e-013
	Radius          1.09135
	InertiaMoment   0.396945

	Oblateness      0.0217872

	RotationPeriod  33.3467
	Obliquity       111.601
	EqAscendNode    307.448
	//Precession      0

	AbsMagn         7.32763
	SlopeParam      7.20868
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.609 0.606 0.605)

	Surface
	{
		SurfStyle       0.784477
		OceanStyle      0.66123
		Randomize      (0.527, -0.075, 0.076)
		colorDistMagn   0.412189
		colorDistFreq   0.000746968
		detailScale     29.8012
		colorConversion true
		snowLevel       2
		tropicLatitude  0.66232
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.360015
		terraceProb     0.128426
		erosion         0
		montesMagn      0.441888
		montesFreq      2.75197
		montesSpiky     0.870717
		montesFraction  0.893092
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00328863
		hillsFraction   0.835253
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2566
		craterFreq      0.249103
		craterDensity   0.795489
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.566642
		volcanoTemp     1413.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.238, 0.206, 0.169, 0.000)
		colorShelf     (0.244, 0.212, 0.194, 0.000)
		colorBeach     (0.286, 0.248, 0.230, 0.000)
		colorDesert    (0.311, 0.267, 0.224, 0.000)
		colorLowland   (0.341, 0.285, 0.254, 0.000)
		colorUpland    (0.378, 0.345, 0.309, 0.000)
		colorRock      (0.408, 0.376, 0.333, 0.000)
		colorSnow      (0.445, 0.400, 0.351, 1.000)
		BumpHeight      0.982217
		BumpOffset      0.196443
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.344708
		GasToDust   0.25
		Particles   1676
		GasBright   0.0924654
		DustBright  0.37257
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   535.153
		Period          3180.86
		Eccentricity    0.699464
		Inclination     -72.7369
		AscendingNode   -14.7897
		ArgOfPericenter 138.746
		MeanAnomaly     116.298
	}
}

Comet	"C10"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            3.91857e-009
	Radius          23.6787
	InertiaMoment   0.399257

	Oblateness      0.0328194

	RotationPeriod  31.3581
	Obliquity       64.8067
	EqAscendNode    292.026
	//Precession      0

	AbsMagn         2.76963
	SlopeParam      2.43127
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.838 0.790 0.714)

	Surface
	{
		SurfStyle       0.741856
		OceanStyle      0.941252
		Randomize      (0.996, -0.037, -0.173)
		colorDistMagn   0.68296
		colorDistFreq   0.117565
		detailScale     646.586
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999277
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.275235
		terraceProb     0.272351
		erosion         0
		montesMagn      0.33848
		montesFreq      3.23973
		montesSpiky     0.964502
		montesFraction  0.752542
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.20191
		hillsFraction   0.60801
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240182
		craterFreq      0.150192
		craterDensity   0.884973
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.476062
		volcanoTemp     1391.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.327, 0.269, 0.200, 0.000)
		colorShelf     (0.335, 0.277, 0.229, 0.000)
		colorBeach     (0.394, 0.324, 0.271, 0.000)
		colorDesert    (0.427, 0.348, 0.264, 0.000)
		colorLowland   (0.469, 0.371, 0.300, 0.000)
		colorUpland    (0.519, 0.450, 0.364, 0.000)
		colorRock      (0.561, 0.490, 0.393, 0.000)
		colorSnow      (0.611, 0.522, 0.414, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.825899
		GasToDust   0.25
		Particles   2648
		GasBright   0.244863
		DustBright  0.704659
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   480.37
		Period          2705.14
		Eccentricity    0.721525
		Inclination     -150.579
		AscendingNode   -23.1162
		ArgOfPericenter 48.0503
		MeanAnomaly     -163.389
	}
}

Comet	"C11"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            1.20656e-016
	Radius          0.067598
	InertiaMoment   0.3979

	Oblateness      0.0282279

	RotationPeriod  29.3173
	Obliquity       18.0124
	EqAscendNode    276.603
	//Precession      0

	AbsMagn         10.7004
	SlopeParam      3.11182
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.576 0.571 0.566)

	Surface
	{
		SurfStyle       0.513653
		OceanStyle      0.938287
		Randomize      (-0.386, -0.446, -0.689)
		colorDistMagn   0.694385
		colorDistFreq   2.09809e-006
		detailScale     1.84588
		colorConversion true
		snowLevel       2
		tropicLatitude  0.622548
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.396034
		terraceProb     0.525437
		erosion         0
		montesMagn      0.580917
		montesFreq      2.78197
		montesSpiky     0.914449
		montesFraction  0.643947
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.42992e-006
		hillsFraction   0.659273
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229067
		craterFreq      0.218164
		craterDensity   0.991876
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51245
		volcanoTemp     1765.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.225, 0.194, 0.159, 0.000)
		colorShelf     (0.230, 0.200, 0.181, 0.000)
		colorBeach     (0.271, 0.234, 0.215, 0.000)
		colorDesert    (0.294, 0.251, 0.210, 0.000)
		colorLowland   (0.323, 0.268, 0.238, 0.000)
		colorUpland    (0.357, 0.325, 0.289, 0.000)
		colorRock      (0.386, 0.354, 0.312, 0.000)
		colorSnow      (0.421, 0.377, 0.329, 1.000)
		BumpHeight      0.0608382
		BumpOffset      0.0121676
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.200934
		DustBright  0.433075
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   392.88
		Period          2000.86
		Eccentricity    0.833852
		Inclination     26.0253
		AscendingNode   -57.9598
		ArgOfPericenter -127.125
		MeanAnomaly     -74.8952
	}
}

Comet	"C12"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            9.33186e-013
	Radius          1.46609
	InertiaMoment   0.399691

	Oblateness      0.0435013

	RotationPeriod  27.2147
	Obliquity       331.218
	EqAscendNode    261.181
	//Precession      0

	AbsMagn         7.11498
	SlopeParam      3.70093
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.507 0.426 0.357)

	Surface
	{
		SurfStyle       0.307259
		OceanStyle      0.701549
		Randomize      (-0.775, 0.317, -0.701)
		colorDistMagn   0.635504
		colorDistFreq   0.00111602
		detailScale     40.0341
		colorConversion true
		snowLevel       2
		tropicLatitude  0.113513
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.544134
		terraceProb     0.401754
		erosion         0
		montesMagn      0.525631
		montesFreq      2.60599
		montesSpiky     0.96383
		montesFraction  0.544791
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00605478
		hillsFraction   0.622099
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241005
		craterFreq      0.209486
		craterDensity   0.770657
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.360936
		volcanoTemp     1021.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.203, 0.170, 0.143, 0.000)
		colorShelf     (0.215, 0.181, 0.152, 0.000)
		colorBeach     (0.228, 0.192, 0.161, 0.000)
		colorDesert    (0.241, 0.202, 0.170, 0.000)
		colorLowland   (0.253, 0.213, 0.179, 0.000)
		colorUpland    (0.266, 0.224, 0.188, 0.000)
		colorRock      (0.279, 0.234, 0.197, 0.000)
		colorSnow      (0.291, 0.245, 0.206, 1.000)
		BumpHeight      1.31948
		BumpOffset      0.263897
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.377534
		GasToDust   0.25
		Particles   1742
		GasBright   0.119745
		DustBright  0.19875
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   424.173
		Period          2244.62
		Eccentricity    0.665564
		Inclination     -144.91
		AscendingNode   3.1165
		ArgOfPericenter -25.2628
		MeanAnomaly     1.92203
	}
}

Comet	"C13"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            7.21752e-009
	Radius          26.418
	InertiaMoment   0.398524

	Oblateness      0.0387069

	RotationPeriod  25.0386
	Obliquity       284.424
	EqAscendNode    245.758
	//Precession      0

	AbsMagn         2.23331
	SlopeParam      4.26468
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.590 0.582 0.579)

	Surface
	{
		SurfStyle       0.0971211
		OceanStyle      0.654337
		Randomize      (-0.326, 0.553, 0.514)
		colorDistMagn   0.656497
		colorDistFreq   0.395843
		detailScale     721.389
		colorConversion true
		snowLevel       2
		tropicLatitude  0.995163
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.677831
		terraceProb     0.432302
		erosion         0
		montesMagn      0.441503
		montesFreq      2.75728
		montesSpiky     0.963002
		montesFraction  0.757331
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.14336
		hillsFraction   0.606342
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247023
		craterFreq      0.21136
		craterDensity   0.965822
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50321
		volcanoTemp     1393.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.236, 0.233, 0.232, 0.000)
		colorShelf     (0.251, 0.247, 0.246, 0.000)
		colorBeach     (0.266, 0.262, 0.261, 0.000)
		colorDesert    (0.280, 0.276, 0.275, 0.000)
		colorLowland   (0.295, 0.291, 0.289, 0.000)
		colorUpland    (0.310, 0.306, 0.304, 0.000)
		colorRock      (0.325, 0.320, 0.318, 0.000)
		colorSnow      (0.339, 0.335, 0.333, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.858725
		GasToDust   0.25
		Particles   2714
		GasBright   0.34931
		DustBright  0.453672
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   611.168
		Period          3882.11
		Eccentricity    0.758813
		Inclination     26.2376
		AscendingNode   138.701
		ArgOfPericenter 93.1778
		MeanAnomaly     -93.907
	}
}

Comet	"C14"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            2.22233e-016
	Radius          0.0907761
	InertiaMoment   0.395974

	Oblateness      0.0610559

	RotationPeriod  22.7751
	Obliquity       237.629
	EqAscendNode    230.335
	//Precession      0

	AbsMagn         10.4439
	SlopeParam      4.85076
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.792 0.720 0.638)

	Surface
	{
		SurfStyle       0.273732
		OceanStyle      0.656521
		Randomize      (0.253, 0.245, 0.391)
		colorDistMagn   0.752297
		colorDistFreq   6.60713e-006
		detailScale     2.47879
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999252
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.281806
		terraceProb     0.188961
		erosion         0
		montesMagn      0.647306
		montesFreq      3.06099
		montesSpiky     0.975923
		montesFraction  0.339527
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.27184e-005
		hillsFraction   0.654094
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.20973
		craterFreq      0.14013
		craterDensity   1.00137
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.400756
		volcanoTemp     1040.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.317, 0.288, 0.255, 0.000)
		colorShelf     (0.337, 0.306, 0.271, 0.000)
		colorBeach     (0.357, 0.324, 0.287, 0.000)
		colorDesert    (0.376, 0.342, 0.303, 0.000)
		colorLowland   (0.396, 0.360, 0.319, 0.000)
		colorUpland    (0.416, 0.378, 0.335, 0.000)
		colorRock      (0.436, 0.396, 0.351, 0.000)
		colorSnow      (0.456, 0.414, 0.367, 1.000)
		BumpHeight      0.0816985
		BumpOffset      0.0163397
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.240839
		DustBright  0.246629
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   552.819
		Period          3339.66
		Eccentricity    0.735229
		Inclination     74.5505
		AscendingNode   -82.6631
		ArgOfPericenter 103.924
		MeanAnomaly     -44.5502
	}
}

Comet	"C15"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            1.71881e-012
	Radius          1.63631
	InertiaMoment   0.39903

	Oblateness      0.0582535

	RotationPeriod  20.4072
	Obliquity       190.835
	EqAscendNode    214.913
	//Precession      0

	AbsMagn         6.8998
	SlopeParam      5.52283
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.592 0.589 0.582)

	Surface
	{
		SurfStyle       0.717432
		OceanStyle      0.598247
		Randomize      (-0.820, -0.172, 0.531)
		colorDistMagn   0.638888
		colorDistFreq   0.0020129
		detailScale     44.6822
		colorConversion true
		snowLevel       2
		tropicLatitude  0.658359
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.391714
		terraceProb     0.461177
		erosion         0
		montesMagn      0.428681
		montesFreq      2.56528
		montesSpiky     0.804138
		montesFraction  0.11928
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00651642
		hillsFraction   0.731627
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.268267
		craterFreq      0.198461
		craterDensity   0.971181
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.515041
		volcanoTemp     1529.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.231, 0.200, 0.163, 0.000)
		colorShelf     (0.237, 0.206, 0.186, 0.000)
		colorBeach     (0.278, 0.241, 0.221, 0.000)
		colorDesert    (0.302, 0.259, 0.215, 0.000)
		colorLowland   (0.332, 0.277, 0.245, 0.000)
		colorUpland    (0.367, 0.336, 0.297, 0.000)
		colorRock      (0.397, 0.365, 0.320, 0.000)
		colorSnow      (0.432, 0.389, 0.338, 1.000)
		BumpHeight      1.47268
		BumpOffset      0.294536
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.410359
		GasToDust   0.25
		Particles   1808
		GasBright   0.0516173
		DustBright  0.920338
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   622.563
		Period          3991.18
		Eccentricity    0.709997
		Inclination     128.209
		AscendingNode   10.577
		ArgOfPericenter -32.5906
		MeanAnomaly     -138.888
	}
}

Comet	"C16"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            1.32938e-008
	Radius          35.4641
	InertiaMoment   0.397499

	Oblateness      0.0989438

	RotationPeriod  17.9133
	Obliquity       144.041
	EqAscendNode    199.49
	//Precession      0

	AbsMagn         1.56696
	SlopeParam      6.44111
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.693 0.690 0.685)

	Surface
	{
		SurfStyle       0.418016
		OceanStyle      0.119847
		Randomize      (-0.697, 0.422, 0.343)
		colorDistMagn   0.91115
		colorDistFreq   0.478439
		detailScale     968.405
		colorConversion true
		snowLevel       2
		tropicLatitude  0.90524
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.466084
		terraceProb     0.189509
		erosion         0
		montesMagn      0.424297
		montesFreq      2.81633
		montesSpiky     0.994606
		montesFraction  0.553104
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.24253
		hillsFraction   0.726627
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243094
		craterFreq      0.238429
		craterDensity   0.793907
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.523331
		volcanoTemp     1506.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.277, 0.276, 0.274, 0.000)
		colorShelf     (0.295, 0.293, 0.291, 0.000)
		colorBeach     (0.312, 0.310, 0.308, 0.000)
		colorDesert    (0.329, 0.328, 0.325, 0.000)
		colorLowland   (0.347, 0.345, 0.343, 0.000)
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

	CometTail
	{
		MaxLength   0.891551
		GasToDust   0.25
		Particles   2780
		GasBright   0.0736212
		DustBright  0.582821
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   371.072
		Period          1836.6
		Eccentricity    0.75585
		Inclination     105.545
		AscendingNode   -111.57
		ArgOfPericenter -91.7321
		MeanAnomaly     104.664
	}
}

Comet	"C17"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            4.09325e-016
	Radius          0.101352
	InertiaMoment   0.399479

	Oblateness      0.104045

	RotationPeriod  15.266
	Obliquity       97.2466
	EqAscendNode    184.068
	//Precession      0

	AbsMagn         10.197
	SlopeParam      2.00783
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.792 0.728 0.659)

	Surface
	{
		SurfStyle       0.962298
		OceanStyle      0.821936
		Randomize      (-0.175, -0.389, -0.258)
		colorDistMagn   0.733727
		colorDistFreq   2.79845e-006
		detailScale     2.76757
		colorConversion true
		snowLevel       2
		tropicLatitude  0.893144
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.472764
		terraceProb     0.1462
		erosion         0
		montesMagn      0.339553
		montesFreq      2.06868
		montesSpiky     0.928465
		montesFraction  0.332816
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.84905e-005
		hillsFraction   0.594577
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225625
		craterFreq      0.263387
		craterDensity   0.813332
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.504322
		volcanoTemp     1754.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.269, 0.255, 0.263, 0.050)
		colorShelf     (0.317, 0.298, 0.303, 0.040)
		colorBeach     (0.364, 0.342, 0.342, 0.030)
		colorDesert    (0.412, 0.386, 0.389, 0.020)
		colorLowland   (0.459, 0.429, 0.428, 0.030)
		colorUpland    (0.507, 0.473, 0.468, 0.050)
		colorRock      (0.555, 0.517, 0.520, 0.020)
		colorSnow      (0.555, 0.517, 0.520, 1.000)
		BumpHeight      0.0912164
		BumpOffset      0.0182433
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.058366
		DustBright  0.282562
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   430.872
		Period          2298
		Eccentricity    0.682561
		Inclination     147.133
		AscendingNode   -129.692
		ArgOfPericenter 156.43
		MeanAnomaly     -43.8383
	}
}

Comet	"C18"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            3.16584e-012
	Radius          2.19589
	InertiaMoment   0.398237

	Oblateness      0.20546

	RotationPeriod  12.4286
	Obliquity       50.4523
	EqAscendNode    168.645
	//Precession      0

	AbsMagn         6.68138
	SlopeParam      2.78453
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.722 0.720 0.716)

	Surface
	{
		SurfStyle       0.838263
		OceanStyle      0.667904
		Randomize      (-0.585, 0.068, -0.459)
		colorDistMagn   0.861437
		colorDistFreq   0.00232611
		detailScale     59.9626
		colorConversion true
		snowLevel       2
		tropicLatitude  0.987041
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.358795
		terraceProb     0.229269
		erosion         0
		montesMagn      0.57061
		montesFreq      3.38649
		montesSpiky     0.993735
		montesFraction  0.673611
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0100922
		hillsFraction   0.812869
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217914
		craterFreq      0.195246
		craterDensity   0.937679
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.456925
		volcanoTemp     1282.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.282, 0.245, 0.200, 0.000)
		colorShelf     (0.289, 0.252, 0.229, 0.000)
		colorBeach     (0.340, 0.295, 0.272, 0.000)
		colorDesert    (0.368, 0.317, 0.265, 0.000)
		colorLowland   (0.405, 0.338, 0.301, 0.000)
		colorUpland    (0.448, 0.411, 0.365, 0.000)
		colorRock      (0.484, 0.447, 0.394, 0.000)
		colorSnow      (0.527, 0.475, 0.415, 1.000)
		BumpHeight      1.97631
		BumpOffset      0.395261
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.443185
		GasToDust   0.25
		Particles   1875
		GasBright   0.190046
		DustBright  0.635369
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   586.201
		Period          3646.67
		Eccentricity    0.774176
		Inclination     38.5508
		AscendingNode   -45.3898
		ArgOfPericenter 30.4476
		MeanAnomaly     81.071
	}
}

Comet	"C19"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            2.44854e-008
	Radius          39.6089
	InertiaMoment   0.399904

	Oblateness      0.249

	RotationPeriod  9.35097
	Obliquity       3.65798
	EqAscendNode    153.222
	//Precession      0

	AbsMagn         0.650695
	SlopeParam      3.40875
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.541 0.536 0.532)

	Surface
	{
		SurfStyle       0.916603
		OceanStyle      0.589472
		Randomize      (0.158, -0.618, 0.018)
		colorDistMagn   0.703898
		colorDistFreq   0.275819
		detailScale     1081.59
		colorConversion true
		snowLevel       2
		tropicLatitude  0.562654
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.542618
		terraceProb     0.189076
		erosion         0
		montesMagn      0.302517
		montesFreq      3.51164
		montesSpiky     0.993939
		montesFraction  0.340908
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.28959
		hillsFraction   0.540902
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.206265
		craterFreq      0.248858
		craterDensity   0.909019
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.425772
		volcanoTemp     1751.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.184, 0.188, 0.213, 0.050)
		colorShelf     (0.216, 0.220, 0.245, 0.040)
		colorBeach     (0.249, 0.252, 0.277, 0.030)
		colorDesert    (0.281, 0.284, 0.314, 0.020)
		colorLowland   (0.314, 0.316, 0.346, 0.030)
		colorUpland    (0.346, 0.349, 0.378, 0.050)
		colorRock      (0.379, 0.381, 0.421, 0.020)
		colorSnow      (0.379, 0.381, 0.421, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.924377
		GasToDust   0.25
		Particles   2847
		GasBright   0.147508
		DustBright  0.362393
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   373.212
		Period          1852.51
		Eccentricity    0.523121
		Inclination     149.418
		AscendingNode   -179.939
		ArgOfPericenter -166.337
		MeanAnomaly     134.288
	}
}

Comet	"C20"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            7.53927e-016
	Radius          0.135969
	InertiaMoment   0.39879

	Oblateness      0.249

	RotationPeriod  5.96138
	Obliquity       316.864
	EqAscendNode    137.8
	//Precession      0

	AbsMagn         9.95818
	SlopeParam      3.97912
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.760 0.758 0.754)

	Surface
	{
		SurfStyle       0.899038
		OceanStyle      0.931623
		Randomize      (-0.666, 0.997, -0.158)
		colorDistMagn   0.919197
		colorDistFreq   1.61853e-005
		detailScale     3.71286
		colorConversion true
		snowLevel       2
		tropicLatitude  0.91799
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.686445
		terraceProb     0.112819
		erosion         0
		montesMagn      0.529156
		montesFreq      2.71266
		montesSpiky     0.982981
		montesFraction  0.527147
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.80916e-005
		hillsFraction   0.568921
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237145
		craterFreq      0.233617
		craterDensity   0.993034
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.499844
		volcanoTemp     1257.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.258, 0.265, 0.302, 0.050)
		colorShelf     (0.304, 0.311, 0.347, 0.040)
		colorBeach     (0.350, 0.356, 0.392, 0.030)
		colorDesert    (0.395, 0.402, 0.445, 0.020)
		colorLowland   (0.441, 0.447, 0.490, 0.030)
		colorUpland    (0.486, 0.492, 0.535, 0.050)
		colorRock      (0.532, 0.538, 0.596, 0.020)
		colorSnow      (0.532, 0.538, 0.596, 1.000)
		BumpHeight      0.122372
		BumpOffset      0.0244744
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.346378
		DustBright  0.64801
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   506.682
		Period          2930.42
		Eccentricity    0.74385
		Inclination     24.3627
		AscendingNode   161.935
		ArgOfPericenter 123.867
		MeanAnomaly     -170.648
	}
}

Comet	"C21"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            5.83107e-012
	Radius          2.45331
	InertiaMoment   0.396961

	RotationPeriod  157.017
	Obliquity       270.069
	EqAscendNode    122.377
	//Precession      0

	AbsMagn         6.45896
	SlopeParam      4.54776
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.660 0.655 0.652)

	Surface
	{
		SurfStyle       0.418678
		OceanStyle      0.641235
		Randomize      (0.697, 0.777, 0.347)
		colorDistMagn   0.327521
		colorDistFreq   0.00314199
		detailScale     66.9918
		colorConversion true
		snowLevel       2
		tropicLatitude  0.907393
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.709986
		terraceProb     0.221128
		erosion         0
		montesMagn      0.430649
		montesFreq      2.75559
		montesSpiky     0.965286
		montesFraction  0.426047
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0134731
		hillsFraction   0.805195
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.277659
		craterFreq      0.205754
		craterDensity   0.93128
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.518214
		volcanoTemp     1249.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.264, 0.262, 0.261, 0.000)
		colorShelf     (0.281, 0.278, 0.277, 0.000)
		colorBeach     (0.297, 0.295, 0.293, 0.000)
		colorDesert    (0.314, 0.311, 0.309, 0.000)
		colorLowland   (0.330, 0.328, 0.326, 0.000)
		colorUpland    (0.347, 0.344, 0.342, 0.000)
		colorRock      (0.363, 0.360, 0.358, 0.000)
		colorSnow      (0.380, 0.377, 0.375, 1.000)
		BumpHeight      2.20798
		BumpOffset      0.441596
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.476011
		GasToDust   0.25
		Particles   1941
		GasBright   0.276559
		DustBright  0.402316
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   458.695
		Period          2524.13
		Eccentricity    0.863248
		Inclination     -148.487
		AscendingNode   -143.711
		ArgOfPericenter -152.955
		MeanAnomaly     -179.029
	}
}

Comet	"C22"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            4.50991e-008
	Radius          53.122
	InertiaMoment   0.399262

	Oblateness      0.00216229

	RotationPeriod  121.009
	Obliquity       223.275
	EqAscendNode    106.955
	//Precession      0

	AbsMagn         -0.993953
	SlopeParam      5.16561
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.574 0.434 0.317)

	Surface
	{
		SurfStyle       0.573919
		OceanStyle      0.643063
		Randomize      (-0.444, 0.332, -0.264)
		colorDistMagn   0.831479
		colorDistFreq   1.11181
		detailScale     1450.58
		colorConversion true
		snowLevel       2
		tropicLatitude  0.824017
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.39148
		terraceProb     0.473292
		erosion         0
		montesMagn      0.498753
		montesFreq      2.66813
		montesSpiky     0.910503
		montesFraction  0.498168
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.81838
		hillsFraction   0.539885
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22244
		craterFreq      0.213638
		craterDensity   0.835145
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.468187
		volcanoTemp     1445.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.224, 0.148, 0.089, 0.000)
		colorShelf     (0.230, 0.152, 0.102, 0.000)
		colorBeach     (0.270, 0.178, 0.121, 0.000)
		colorDesert    (0.293, 0.191, 0.117, 0.000)
		colorLowland   (0.322, 0.204, 0.133, 0.000)
		colorUpland    (0.356, 0.247, 0.162, 0.000)
		colorRock      (0.385, 0.269, 0.174, 0.000)
		colorSnow      (0.419, 0.287, 0.184, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.957203
		GasToDust   0.25
		Particles   2913
		GasBright   0.16948
		DustBright  0.193881
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   374.567
		Period          1862.61
		Eccentricity    0.683479
		Inclination     44.1668
		AscendingNode   95.3229
		ArgOfPericenter -44.1411
		MeanAnomaly     -90.9951
	}
}

Comet	"C23"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            1.38863e-015
	Radius          0.151954
	InertiaMoment   0.397909

	Oblateness      0.00196195

	RotationPeriod  110.478
	Obliquity       176.481
	EqAscendNode    91.5321
	//Precession      0

	AbsMagn         9.72617
	SlopeParam      5.92471
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.537 0.530 0.524)

	Surface
	{
		SurfStyle       0.722165
		OceanStyle      0.597998
		Randomize      (0.715, 0.251, 0.692)
		colorDistMagn   0.32765
		colorDistFreq   1.66994e-005
		detailScale     4.14935
		colorConversion true
		snowLevel       2
		tropicLatitude  0.363751
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.475893
		terraceProb     0.404316
		erosion         0
		montesMagn      0.465854
		montesFreq      3.32593
		montesSpiky     0.845585
		montesFraction  0.615252
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.03257e-005
		hillsFraction   0.539499
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.272819
		craterFreq      0.269155
		craterDensity   0.886885
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.487782
		volcanoTemp     1423.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.209, 0.180, 0.147, 0.000)
		colorShelf     (0.215, 0.186, 0.168, 0.000)
		colorBeach     (0.252, 0.217, 0.199, 0.000)
		colorDesert    (0.274, 0.233, 0.194, 0.000)
		colorLowland   (0.301, 0.249, 0.220, 0.000)
		colorUpland    (0.333, 0.302, 0.267, 0.000)
		colorRock      (0.360, 0.329, 0.288, 0.000)
		colorSnow      (0.392, 0.350, 0.304, 1.000)
		BumpHeight      0.136758
		BumpOffset      0.0273517
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0276452
		GasToDust   0.25
		Particles   1035
		GasBright   0.0215936
		DustBright  0.826254
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   349.362
		Period          1677.8
		Eccentricity    0.677431
		Inclination     21.2368
		AscendingNode   87.0032
		ArgOfPericenter 143.478
		MeanAnomaly     82.0116
	}
}

Comet	"C24"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            1.07401e-011
	Radius          3.28938
	InertiaMoment   0.399696

	Oblateness      0.00294818

	RotationPeriod  103.56
	Obliquity       129.687
	EqAscendNode    76.1095
	//Precession      0

	AbsMagn         6.23166
	SlopeParam      7.18105
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.430 0.428 0.425)

	Surface
	{
		SurfStyle       0.405055
		OceanStyle      0.725881
		Randomize      (0.462, -0.810, 0.280)
		colorDistMagn   0.349975
		colorDistFreq   0.00478287
		detailScale     89.8221
		colorConversion true
		snowLevel       2
		tropicLatitude  0.550055
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.303576
		terraceProb     0.21732
		erosion         0
		montesMagn      0.528002
		montesFreq      2.66477
		montesSpiky     0.946488
		montesFraction  0.470109
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0244944
		hillsFraction   0.616363
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220653
		craterFreq      0.257701
		craterDensity   0.875277
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.530441
		volcanoTemp     1548.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.172, 0.171, 0.170, 0.000)
		colorShelf     (0.183, 0.182, 0.181, 0.000)
		colorBeach     (0.194, 0.193, 0.191, 0.000)
		colorDesert    (0.204, 0.203, 0.202, 0.000)
		colorLowland   (0.215, 0.214, 0.212, 0.000)
		colorUpland    (0.226, 0.225, 0.223, 0.000)
		colorRock      (0.237, 0.236, 0.234, 0.000)
		colorSnow      (0.247, 0.246, 0.244, 1.000)
		BumpHeight      2.96044
		BumpOffset      0.592089
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.508837
		GasToDust   0.25
		Particles   2007
		GasBright   0.0449897
		DustBright  0.487345
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   463.604
		Period          2564.76
		Eccentricity    0.702528
		Inclination     -117.879
		AscendingNode   -37.9329
		ArgOfPericenter 173.386
		MeanAnomaly     -71.5129
	}
}

Comet	"C25"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            8.30669e-008
	Radius          59.3839
	InertiaMoment   0.398531

	Oblateness      0.00248145

	RotationPeriod  98.24
	Obliquity       82.8922
	EqAscendNode    60.6869
	//Precession      0

	AbsMagn         16.5681
	SlopeParam      2.42075
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.575 0.471 0.433)

	Surface
	{
		SurfStyle       0.606574
		OceanStyle      0.252592
		Randomize      (0.022, -0.878, 0.572)
		colorDistMagn   0.869963
		colorDistFreq   1.02423
		detailScale     1621.58
		colorConversion true
		snowLevel       2
		tropicLatitude  0.499233
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.61229
		terraceProb     0.416934
		erosion         0
		montesMagn      0.286214
		montesFreq      2.68023
		montesSpiky     0.861339
		montesFraction  0.0519525
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.93021
		hillsFraction   0.386234
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232207
		craterFreq      0.184616
		craterDensity   0.957487
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.561368
		volcanoTemp     1585.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.224, 0.160, 0.121, 0.000)
		colorShelf     (0.230, 0.165, 0.139, 0.000)
		colorBeach     (0.270, 0.193, 0.164, 0.000)
		colorDesert    (0.293, 0.207, 0.160, 0.000)
		colorLowland   (0.322, 0.221, 0.182, 0.000)
		colorUpland    (0.357, 0.268, 0.221, 0.000)
		colorRock      (0.386, 0.292, 0.238, 0.000)
		colorSnow      (0.420, 0.311, 0.251, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.990029
		GasToDust   0.25
		Particles   2979
		GasBright   0.0311266
		DustBright  0.185694
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   496.238
		Period          2840.29
		Eccentricity    0.722833
		Inclination     121.605
		AscendingNode   -18.4658
		ArgOfPericenter 95.7881
		MeanAnomaly     -46.0694
	}
}

Comet	"C26"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            2.55769e-015
	Radius          0.203685
	InertiaMoment   0.396013

	Oblateness      0.00353104

	RotationPeriod  93.8353
	Obliquity       36.0979
	EqAscendNode    45.2643
	//Precession      0

	AbsMagn         9.49984
	SlopeParam      3.1033
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.645 0.644 0.641)

	Surface
	{
		SurfStyle       0.753145
		OceanStyle      0.622209
		Randomize      (0.112, -0.900, 0.643)
		colorDistMagn   0.873661
		colorDistFreq   3.24377e-005
		detailScale     5.56197
		colorConversion true
		snowLevel       2
		tropicLatitude  0.831112
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.674616
		terraceProb     0.304174
		erosion         0
		montesMagn      0.397408
		montesFreq      3.63681
		montesSpiky     0.93761
		montesFraction  0.843724
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.76689e-005
		hillsFraction   0.725742
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233256
		craterFreq      0.21682
		craterDensity   0.873668
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.490338
		volcanoTemp     1457.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.252, 0.219, 0.180, 0.000)
		colorShelf     (0.258, 0.225, 0.205, 0.000)
		colorBeach     (0.303, 0.264, 0.244, 0.000)
		colorDesert    (0.329, 0.283, 0.237, 0.000)
		colorLowland   (0.361, 0.303, 0.269, 0.000)
		colorUpland    (0.400, 0.367, 0.327, 0.000)
		colorRock      (0.432, 0.399, 0.353, 0.000)
		colorSnow      (0.471, 0.425, 0.372, 1.000)
		BumpHeight      0.183317
		BumpOffset      0.0366634
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0604712
		GasToDust   0.25
		Particles   1101
		GasBright   0.142088
		DustBright  0.559219
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   569.712
		Period          3493.89
		Eccentricity    0.666335
		Inclination     20.4321
		AscendingNode   -12.1478
		ArgOfPericenter -148.753
		MeanAnomaly     151.852
	}
}

Comet	"C27"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            1.97819e-011
	Radius          3.6781
	InertiaMoment   0.399036

	Oblateness      0.00295382

	RotationPeriod  90.0269
	Obliquity       349.304
	EqAscendNode    29.8418
	//Precession      0

	AbsMagn         5.9985
	SlopeParam      3.69313
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.475 0.471 0.467)

	Surface
	{
		SurfStyle       0.289175
		OceanStyle      0.0212561
		Randomize      (0.015, 0.853, 0.815)
		colorDistMagn   0.605246
		colorDistFreq   0.00428802
		detailScale     100.437
		colorConversion true
		snowLevel       2
		tropicLatitude  0.867529
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.75054
		terraceProb     0.233464
		erosion         0
		montesMagn      0.544842
		montesFreq      3.69624
		montesSpiky     0.885346
		montesFraction  0.474552
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0287275
		hillsFraction   0.730628
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23063
		craterFreq      0.267716
		craterDensity   1.01767
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.445125
		volcanoTemp     1632.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.190, 0.189, 0.187, 0.000)
		colorShelf     (0.202, 0.200, 0.199, 0.000)
		colorBeach     (0.214, 0.212, 0.210, 0.000)
		colorDesert    (0.225, 0.224, 0.222, 0.000)
		colorLowland   (0.237, 0.236, 0.234, 0.000)
		colorUpland    (0.249, 0.248, 0.245, 0.000)
		colorRock      (0.261, 0.259, 0.257, 0.000)
		colorSnow      (0.273, 0.271, 0.269, 1.000)
		BumpHeight      3.31029
		BumpOffset      0.662058
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.541663
		GasToDust   0.25
		Particles   2074
		GasBright   0.100943
		DustBright  0.284851
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   513.109
		Period          2986.35
		Eccentricity    0.794286
		Inclination     117.16
		AscendingNode   -107.201
		ArgOfPericenter -67.8281
		MeanAnomaly     -93.1476
	}
}

Comet	"C28"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            1.52999e-007
	Radius          79.5811
	InertiaMoment   0.397511

	Oblateness      0.004153

	RotationPeriod  86.6385
	Obliquity       302.509
	EqAscendNode    14.4192
	//Precession      0

	AbsMagn         15.1512
	SlopeParam      4.2569
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.469 0.464 0.460)

	Surface
	{
		SurfStyle       0.316965
		OceanStyle      0.522068
		Randomize      (0.790, 0.953, 0.545)
		colorDistMagn   0.478476
		colorDistFreq   2.78755
		detailScale     2173.09
		colorConversion true
		snowLevel       2
		tropicLatitude  0.82643
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.468148
		terraceProb     0.447686
		erosion         0
		montesMagn      0.323124
		montesFreq      3.00931
		montesSpiky     0.970777
		montesFraction  0.626256
		dunesFraction   0
		hillsMagn       0
		hillsFreq       12.1026
		hillsFraction   0.734063
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248411
		craterFreq      0.219509
		craterDensity   0.872268
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.508226
		volcanoTemp     1263.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.188, 0.186, 0.184, 0.000)
		colorShelf     (0.200, 0.197, 0.196, 0.000)
		colorBeach     (0.211, 0.209, 0.207, 0.000)
		colorDesert    (0.223, 0.221, 0.219, 0.000)
		colorLowland   (0.235, 0.232, 0.230, 0.000)
		colorUpland    (0.246, 0.244, 0.242, 0.000)
		colorRock      (0.258, 0.255, 0.253, 0.000)
		colorSnow      (0.270, 0.267, 0.265, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.279095
		DustBright  0.591186
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   538.619
		Period          3211.81
		Eccentricity    0.796031
		Inclination     -143.065
		AscendingNode   -74.7305
		ArgOfPericenter -177.222
		MeanAnomaly     157.894
	}
}

Comet	"C29"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            4.71094e-015
	Radius          0.227812
	InertiaMoment   0.399485

	Oblateness      0.00342659

	RotationPeriod  83.5618
	Obliquity       255.715
	EqAscendNode    358.997
	//Precession      0

	AbsMagn         9.27822
	SlopeParam      4.84232
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.527 0.522 0.516)

	Surface
	{
		SurfStyle       0.120788
		OceanStyle      0.515241
		Randomize      (0.422, -0.333, -0.912)
		colorDistMagn   0.409746
		colorDistFreq   1.20599e-005
		detailScale     6.22078
		colorConversion true
		snowLevel       2
		tropicLatitude  0.923429
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.390893
		terraceProb     0.178804
		erosion         0
		montesMagn      0.559293
		montesFreq      3.47169
		montesSpiky     0.89266
		montesFraction  0.696075
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000113197
		hillsFraction   0.725297
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23648
		craterFreq      0.213771
		craterDensity   0.705461
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.486674
		volcanoTemp     1585.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.211, 0.209, 0.206, 0.000)
		colorShelf     (0.224, 0.222, 0.219, 0.000)
		colorBeach     (0.237, 0.235, 0.232, 0.000)
		colorDesert    (0.250, 0.248, 0.245, 0.000)
		colorLowland   (0.264, 0.261, 0.258, 0.000)
		colorUpland    (0.277, 0.274, 0.271, 0.000)
		colorRock      (0.290, 0.287, 0.284, 0.000)
		colorSnow      (0.303, 0.300, 0.297, 1.000)
		BumpHeight      0.205031
		BumpOffset      0.0410061
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.093297
		GasToDust   0.25
		Particles   1168
		GasBright   0.210667
		DustBright  0.3441
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   568.886
		Period          3486.3
		Eccentricity    0.783824
		Inclination     -37.2006
		AscendingNode   172.067
		ArgOfPericenter 28.154
		MeanAnomaly     -160.101
	}
}

Comet	"C30"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            3.64358e-011
	Radius          4.92794
	InertiaMoment   0.398245

	Oblateness      0.00478288

	RotationPeriod  80.7251
	Obliquity       208.921
	EqAscendNode    343.574
	//Precession      0

	AbsMagn         5.75833
	SlopeParam      5.51254
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.804 0.701 0.664)

	Surface
	{
		SurfStyle       0.621291
		OceanStyle      0.017916
		Randomize      (-0.506, -0.966, 0.424)
		colorDistMagn   0.819889
		colorDistFreq   0.0110186
		detailScale     134.566
		colorConversion true
		snowLevel       2
		tropicLatitude  0.961135
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.544685
		terraceProb     0.28333
		erosion         0
		montesMagn      0.494538
		montesFreq      3.56479
		montesSpiky     0.818006
		montesFraction  0.807905
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0726303
		hillsFraction   0.536681
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.27431
		craterFreq      0.242081
		craterDensity   1.03865
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.428224
		volcanoTemp     1225.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.314, 0.238, 0.186, 0.000)
		colorShelf     (0.322, 0.245, 0.213, 0.000)
		colorBeach     (0.378, 0.287, 0.253, 0.000)
		colorDesert    (0.410, 0.308, 0.246, 0.000)
		colorLowland   (0.450, 0.329, 0.279, 0.000)
		colorUpland    (0.498, 0.399, 0.339, 0.000)
		colorRock      (0.539, 0.434, 0.365, 0.000)
		colorSnow      (0.587, 0.462, 0.385, 1.000)
		BumpHeight      4.43514
		BumpOffset      0.887029
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.574489
		GasToDust   0.25
		Particles   2140
		GasBright   0.104981
		DustBright  0.134273
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   460.015
		Period          2535.04
		Eccentricity    0.695199
		Inclination     85.1698
		AscendingNode   114.833
		ArgOfPericenter -86.946
		MeanAnomaly     -48.2155
	}
}

Comet	"C31"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            2.81805e-007
	Radius          89.0281
	InertiaMoment   0.399909

	Oblateness      0.00392212

	RotationPeriod  78.0783
	Obliquity       162.126
	EqAscendNode    328.151
	//Precession      0

	AbsMagn         14.2971
	SlopeParam      6.42494
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.730 0.669 0.581)

	Surface
	{
		SurfStyle       0.3107
		OceanStyle      0.108276
		Randomize      (-0.567, 0.473, -0.639)
		colorDistMagn   0.939536
		colorDistFreq   3.66769
		detailScale     2431.06
		colorConversion true
		snowLevel       2
		tropicLatitude  0.181598
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.497434
		terraceProb     0.457126
		erosion         0
		montesMagn      0.626614
		montesFreq      3.23195
		montesSpiky     0.9777
		montesFraction  0.715878
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.1289
		hillsFraction   0.598004
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240782
		craterFreq      0.251845
		craterDensity   0.923066
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.508953
		volcanoTemp     1253.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.292, 0.268, 0.232, 0.000)
		colorShelf     (0.310, 0.284, 0.247, 0.000)
		colorBeach     (0.329, 0.301, 0.261, 0.000)
		colorDesert    (0.347, 0.318, 0.276, 0.000)
		colorLowland   (0.365, 0.335, 0.290, 0.000)
		colorUpland    (0.383, 0.351, 0.305, 0.000)
		colorRock      (0.402, 0.368, 0.319, 0.000)
		colorSnow      (0.420, 0.385, 0.334, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.3603
		DustBright  0.36344
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   526.953
		Period          3108.03
		Eccentricity    0.841192
		Inclination     15.1003
		AscendingNode   36.226
		ArgOfPericenter -138.961
		MeanAnomaly     -110.922
	}
}

Comet	"C32"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            8.67697e-015
	Radius          0.305158
	InertiaMoment   0.398796

	Oblateness      0.00545096

	RotationPeriod  75.5849
	Obliquity       115.332
	EqAscendNode    312.729
	//Precession      0

	AbsMagn         9.06045
	SlopeParam      10.4876
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.573 0.500 0.474)

	Surface
	{
		SurfStyle       0.368365
		OceanStyle      0.758653
		Randomize      (-0.293, 0.219, -0.464)
		colorDistMagn   0.469416
		colorDistFreq   7.59343e-005
		detailScale     8.33286
		colorConversion true
		snowLevel       2
		tropicLatitude  0.942525
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.52042
		terraceProb     0.164498
		erosion         0
		montesMagn      0.403386
		montesFreq      2.31395
		montesSpiky     0.996603
		montesFraction  0.820422
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000172091
		hillsFraction   0.667039
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222104
		craterFreq      0.241084
		craterDensity   0.870558
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.376331
		volcanoTemp     1692.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.229, 0.200, 0.190, 0.000)
		colorShelf     (0.243, 0.212, 0.202, 0.000)
		colorBeach     (0.258, 0.225, 0.213, 0.000)
		colorDesert    (0.272, 0.237, 0.225, 0.000)
		colorLowland   (0.286, 0.250, 0.237, 0.000)
		colorUpland    (0.301, 0.262, 0.249, 0.000)
		colorRock      (0.315, 0.275, 0.261, 0.000)
		colorSnow      (0.329, 0.287, 0.273, 1.000)
		BumpHeight      0.274642
		BumpOffset      0.0549285
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.126123
		GasToDust   0.25
		Particles   1234
		GasBright   0.0232183
		DustBright  0.385009
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   397.042
		Period          2032.73
		Eccentricity    0.752914
		Inclination     -123.04
		AscendingNode   138.494
		ArgOfPericenter 154.596
		MeanAnomaly     -70.7838
	}
}

Comet	"C33"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            6.71102e-011
	Radius          5.51411
	InertiaMoment   0.396978

	Oblateness      0.00440134

	RotationPeriod  73.2174
	Obliquity       68.5378
	EqAscendNode    297.306
	//Precession      0

	AbsMagn         5.50978
	SlopeParam      2.77523
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.718 0.714 0.713)

	Surface
	{
		SurfStyle       0.633957
		OceanStyle      0.0796176
		Randomize      (0.535, 0.230, 0.344)
		colorDistMagn   0.90051
		colorDistFreq   0.0224669
		detailScale     150.572
		colorConversion true
		snowLevel       2
		tropicLatitude  0.738225
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.526084
		terraceProb     0.178379
		erosion         0
		montesMagn      0.387545
		montesFreq      2.77864
		montesSpiky     0.773426
		montesFraction  0.760561
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0725299
		hillsFraction   0.47966
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257938
		craterFreq      0.240624
		craterDensity   0.773587
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.550463
		volcanoTemp     1590.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.280, 0.243, 0.200, 0.000)
		colorShelf     (0.287, 0.250, 0.228, 0.000)
		colorBeach     (0.338, 0.293, 0.271, 0.000)
		colorDesert    (0.366, 0.314, 0.264, 0.000)
		colorLowland   (0.402, 0.336, 0.299, 0.000)
		colorUpland    (0.445, 0.407, 0.364, 0.000)
		colorRock      (0.481, 0.443, 0.392, 0.000)
		colorSnow      (0.524, 0.472, 0.414, 1.000)
		BumpHeight      4.9627
		BumpOffset      0.99254
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.607315
		GasToDust   0.25
		Particles   2206
		GasBright   0.103484
		DustBright  0.789229
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   618.169
		Period          3949
		Eccentricity    0.720529
		Inclination     -153.848
		AscendingNode   147.545
		ArgOfPericenter -133.137
		MeanAnomaly     87.6762
	}
}

Comet	"C34"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            5.19049e-007
	Radius          119.231
	InertiaMoment   0.399268

	Oblateness      0.00617887

	RotationPeriod  70.9542
	Obliquity       21.7435
	EqAscendNode    281.884
	//Precession      0

	AbsMagn         13.6604
	SlopeParam      3.40068
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.810 0.790 0.766)

	Surface
	{
		SurfStyle       0.783392
		OceanStyle      0.237009
		Randomize      (0.795, -0.033, 0.881)
		colorDistMagn   0.188447
		colorDistFreq   9.65166
		detailScale     3255.81
		colorConversion true
		snowLevel       2
		tropicLatitude  0.492846
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.411718
		terraceProb     0.391096
		erosion         0
		montesMagn      0.369436
		montesFreq      2.37167
		montesSpiky     0.883455
		montesFraction  0.633816
		dunesFraction   0
		hillsMagn       0
		hillsFreq       36.273
		hillsFraction   0.578413
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.271738
		craterFreq      0.47177
		craterDensity   0.8266
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.429095
		volcanoTemp     1896.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.316, 0.269, 0.214, 0.000)
		colorShelf     (0.324, 0.277, 0.245, 0.000)
		colorBeach     (0.381, 0.324, 0.291, 0.000)
		colorDesert    (0.413, 0.348, 0.283, 0.000)
		colorLowland   (0.454, 0.371, 0.322, 0.000)
		colorUpland    (0.502, 0.450, 0.390, 0.000)
		colorRock      (0.543, 0.490, 0.421, 0.000)
		colorSnow      (0.592, 0.521, 0.444, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.100991
		DustBright  0.476209
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   592.327
		Period          3703.98
		Eccentricity    0.849568
		Inclination     27.4917
		AscendingNode   105.658
		ArgOfPericenter -134.428
		MeanAnomaly     53.0424
	}
}

Comet	"C35"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            1.59819e-014
	Radius          0.341524
	InertiaMoment   0.397918

	Oblateness      0.00499388

	RotationPeriod  68.7783
	Obliquity       334.949
	EqAscendNode    266.461
	//Precession      0

	AbsMagn         8.84578
	SlopeParam      3.9714
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.455 0.451 0.446)

	Surface
	{
		SurfStyle       0.540101
		OceanStyle      0.468045
		Randomize      (-0.520, 0.933, -0.455)
		colorDistMagn   0.687565
		colorDistFreq   7.3874e-005
		detailScale     9.32589
		colorConversion true
		snowLevel       2
		tropicLatitude  0.702105
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.262547
		terraceProb     0.11975
		erosion         0
		montesMagn      0.484661
		montesFreq      2.44634
		montesSpiky     0.954854
		montesFraction  0.375145
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0002241
		hillsFraction   0.578663
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263341
		craterFreq      0.252751
		craterDensity   0.961367
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.44185
		volcanoTemp     1356.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.177, 0.153, 0.125, 0.000)
		colorShelf     (0.182, 0.158, 0.143, 0.000)
		colorBeach     (0.214, 0.185, 0.169, 0.000)
		colorDesert    (0.232, 0.198, 0.165, 0.000)
		colorLowland   (0.255, 0.212, 0.187, 0.000)
		colorUpland    (0.282, 0.257, 0.227, 0.000)
		colorRock      (0.305, 0.280, 0.245, 0.000)
		colorSnow      (0.332, 0.298, 0.258, 1.000)
		BumpHeight      0.307372
		BumpOffset      0.0614744
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.158949
		GasToDust   0.25
		Particles   1300
		GasBright   0.0612377
		DustBright  0.200449
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   497.084
		Period          2847.55
		Eccentricity    0.752134
		Inclination     139.881
		AscendingNode   -94.056
		ArgOfPericenter 79.8499
		MeanAnomaly     -40.8507
	}
}

Comet	"C36"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            1.23608e-010
	Radius          7.38344
	InertiaMoment   0.399701

	Oblateness      0.00698876

	RotationPeriod  66.6759
	Obliquity       288.155
	EqAscendNode    251.038
	//Precession      0

	AbsMagn         5.25123
	SlopeParam      4.53975
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.412 0.409 0.406)

	Surface
	{
		SurfStyle       0.421485
		OceanStyle      0.724101
		Randomize      (0.699, -0.684, 0.632)
		colorDistMagn   0.163215
		colorDistFreq   0.0165097
		detailScale     201.617
		colorConversion true
		snowLevel       2
		tropicLatitude  0.955142
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.70462
		terraceProb     0.293194
		erosion         0
		montesMagn      0.207238
		montesFreq      3.36733
		montesSpiky     0.919342
		montesFraction  0.793649
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.13324
		hillsFraction   0.586374
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249015
		craterFreq      0.23817
		craterDensity   0.81799
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.481189
		volcanoTemp     1720.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.165, 0.163, 0.162, 0.000)
		colorShelf     (0.175, 0.174, 0.173, 0.000)
		colorBeach     (0.186, 0.184, 0.183, 0.000)
		colorDesert    (0.196, 0.194, 0.193, 0.000)
		colorLowland   (0.206, 0.204, 0.203, 0.000)
		colorUpland    (0.216, 0.215, 0.213, 0.000)
		colorRock      (0.227, 0.225, 0.223, 0.000)
		colorSnow      (0.237, 0.235, 0.233, 1.000)
		BumpHeight      6.64509
		BumpOffset      1.32902
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.640141
		GasToDust   0.25
		Particles   2273
		GasBright   0.218671
		DustBright  0.527502
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   491.543
		Period          2800.07
		Eccentricity    0.750363
		Inclination     -177.11
		AscendingNode   -108.301
		ArgOfPericenter -9.50263
		MeanAnomaly     42.4175
	}
}

Comet	"C37"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            3.80601e-018
	Radius          0.0211527
	InertiaMoment   0.398538

	Oblateness      0.00565461

	RotationPeriod  64.6353
	Obliquity       241.361
	EqAscendNode    235.616
	//Precession      0

	AbsMagn         13.1415
	SlopeParam      5.15648
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.652 0.649 0.644)

	Surface
	{
		SurfStyle       0.118546
		OceanStyle      0.741916
		Randomize      (0.427, 0.940, -0.222)
		colorDistMagn   0.0701272
		colorDistFreq   1.04476e-007
		detailScale     0.577609
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998285
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.646436
		terraceProb     0.306469
		erosion         0
		montesMagn      0.566017
		montesFreq      2.77802
		montesSpiky     0.999052
		montesFraction  0.533952
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.28452e-006
		hillsFraction   0.716983
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235354
		craterFreq      0.245476
		craterDensity   1.02974
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53046
		volcanoTemp     1460.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.261, 0.259, 0.258, 0.000)
		colorShelf     (0.277, 0.276, 0.274, 0.000)
		colorBeach     (0.293, 0.292, 0.290, 0.000)
		colorDesert    (0.310, 0.308, 0.306, 0.000)
		colorLowland   (0.326, 0.324, 0.322, 0.000)
		colorUpland    (0.342, 0.341, 0.338, 0.000)
		colorRock      (0.359, 0.357, 0.354, 0.000)
		colorSnow      (0.375, 0.373, 0.370, 1.000)
		BumpHeight      0.0190374
		BumpOffset      0.00380748
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.151636
		DustBright  0.279023
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   617.093
		Period          3938.7
		Eccentricity    0.735138
		Inclination     110.882
		AscendingNode   -106.244
		ArgOfPericenter -125.638
		MeanAnomaly     -157.489
	}
}

Comet	"C38"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            2.94366e-014
	Radius          0.457227
	InertiaMoment   0.396051

	Oblateness      0.00778707

	RotationPeriod  62.6469
	Obliquity       194.566
	EqAscendNode    220.193
	//Precession      0

	AbsMagn         8.63352
	SlopeParam      5.91249
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.571 0.497 0.458)

	Surface
	{
		SurfStyle       0.904422
		OceanStyle      0.877647
		Randomize      (-0.018, 0.900, 0.102)
		colorDistMagn   0.823873
		colorDistFreq   0.000111674
		detailScale     12.4853
		colorConversion true
		snowLevel       2
		tropicLatitude  0.831633
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.60939
		terraceProb     0.722022
		erosion         0
		montesMagn      0.533588
		montesFreq      3.1491
		montesSpiky     0.957217
		montesFraction  0.666867
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00039491
		hillsFraction   0.687687
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.203886
		craterFreq      0.232622
		craterDensity   1.01171
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.370276
		volcanoTemp     1474.53
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.194, 0.174, 0.183, 0.050)
		colorShelf     (0.228, 0.204, 0.211, 0.040)
		colorBeach     (0.263, 0.233, 0.238, 0.030)
		colorDesert    (0.297, 0.263, 0.270, 0.020)
		colorLowland   (0.331, 0.293, 0.298, 0.030)
		colorUpland    (0.365, 0.323, 0.325, 0.050)
		colorRock      (0.400, 0.353, 0.362, 0.020)
		colorSnow      (0.400, 0.353, 0.362, 1.000)
		BumpHeight      0.411504
		BumpOffset      0.0823009
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.191775
		GasToDust   0.25
		Particles   1367
		GasBright   0.37626
		DustBright  0.538886
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   252.74
		Period          1032.38
		Eccentricity    0.979072
		Inclination     -129.701
		AscendingNode   -71.0229
		ArgOfPericenter 63.4441
		MeanAnomaly     -145.562
	}
}

Comet	"C39"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            2.27671e-010
	Radius          8.2662
	InertiaMoment   0.399042

	Oblateness      0.00640822

	RotationPeriod  60.7022
	Obliquity       147.772
	EqAscendNode    204.771
	//Precession      0

	AbsMagn         4.98063
	SlopeParam      7.154
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.716 0.634 0.589)

	Surface
	{
		SurfStyle       0.294752
		OceanStyle      0.836662
		Randomize      (-0.292, 0.069, -0.964)
		colorDistMagn   0.222786
		colorDistFreq   0.0333715
		detailScale     225.723
		colorConversion true
		snowLevel       2
		tropicLatitude  0.490951
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.736913
		terraceProb     0.249309
		erosion         0
		montesMagn      0.547322
		montesFreq      3.18226
		montesSpiky     0.965664
		montesFraction  0.611051
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.227707
		hillsFraction   0.554289
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234794
		craterFreq      0.210603
		craterDensity   0.808115
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.478745
		volcanoTemp     1339.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.286, 0.254, 0.235, 0.000)
		colorShelf     (0.304, 0.269, 0.250, 0.000)
		colorBeach     (0.322, 0.285, 0.265, 0.000)
		colorDesert    (0.340, 0.301, 0.280, 0.000)
		colorLowland   (0.358, 0.317, 0.294, 0.000)
		colorUpland    (0.376, 0.333, 0.309, 0.000)
		colorRock      (0.394, 0.349, 0.324, 0.000)
		colorSnow      (0.412, 0.365, 0.338, 1.000)
		BumpHeight      7.43958
		BumpOffset      1.48792
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.672967
		GasToDust   0.25
		Particles   2339
		GasBright   0.281943
		DustBright  0.31769
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   519.964
		Period          3046.4
		Eccentricity    0.639579
		Inclination     165.742
		AscendingNode   112.996
		ArgOfPericenter -110.647
		MeanAnomaly     -9.77533
	}
}

Comet	"C40"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            7.01017e-018
	Radius          0.0283145
	InertiaMoment   0.397522

	Oblateness      0.00886536

	RotationPeriod  58.7939
	Obliquity       100.978
	EqAscendNode    189.348
	//Precession      0

	AbsMagn         12.6972
	SlopeParam      2.41019
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.566 0.563 0.561)

	Surface
	{
		SurfStyle       0.783169
		OceanStyle      0.508348
		Randomize      (0.280, 0.121, 0.936)
		colorDistMagn   0.705337
		colorDistFreq   3.45364e-007
		detailScale     0.773176
		colorConversion true
		snowLevel       2
		tropicLatitude  0.773258
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.514513
		terraceProb     0.114967
		erosion         0
		montesMagn      0.513226
		montesFreq      3.26537
		montesSpiky     0.969804
		montesFraction  0.598662
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.17314e-006
		hillsFraction   0.676581
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220888
		craterFreq      0.199414
		craterDensity   0.935525
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.444228
		volcanoTemp     1394.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.221, 0.191, 0.157, 0.000)
		colorShelf     (0.227, 0.197, 0.179, 0.000)
		colorBeach     (0.266, 0.231, 0.213, 0.000)
		colorDesert    (0.289, 0.248, 0.207, 0.000)
		colorLowland   (0.317, 0.265, 0.235, 0.000)
		colorUpland    (0.351, 0.321, 0.286, 0.000)
		colorRock      (0.380, 0.349, 0.308, 0.000)
		colorSnow      (0.413, 0.372, 0.325, 1.000)
		BumpHeight      0.0254831
		BumpOffset      0.00509662
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.00830709
		DustBright  0.275812
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   607.411
		Period          3846.37
		Eccentricity    0.655233
		Inclination     90.4579
		AscendingNode   -49.648
		ArgOfPericenter -126.261
		MeanAnomaly     98.2823
	}
}

Comet	"C41"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            5.42186e-014
	Radius          0.51197
	InertiaMoment   0.39949

	Oblateness      0.00728437

	RotationPeriod  56.9155
	Obliquity       54.1834
	EqAscendNode    173.925
	//Precession      0

	AbsMagn         8.42304
	SlopeParam      3.09476
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.583 0.437 0.328)

	Surface
	{
		SurfStyle       0.245583
		OceanStyle      0.596487
		Randomize      (-0.185, -0.647, 0.673)
		colorDistMagn   0.897895
		colorDistFreq   1.22128e-005
		detailScale     13.9802
		colorConversion true
		snowLevel       2
		tropicLatitude  0.795698
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.563424
		terraceProb     0.521946
		erosion         0
		montesMagn      0.474167
		montesFreq      3.03945
		montesSpiky     0.975122
		montesFraction  0.665332
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000827052
		hillsFraction   0.903711
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237623
		craterFreq      0.175096
		craterDensity   0.869661
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.507184
		volcanoTemp     1716.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.233, 0.175, 0.131, 0.000)
		colorShelf     (0.248, 0.186, 0.139, 0.000)
		colorBeach     (0.262, 0.197, 0.147, 0.000)
		colorDesert    (0.277, 0.208, 0.156, 0.000)
		colorLowland   (0.291, 0.218, 0.164, 0.000)
		colorUpland    (0.306, 0.229, 0.172, 0.000)
		colorRock      (0.320, 0.240, 0.180, 0.000)
		colorSnow      (0.335, 0.251, 0.188, 1.000)
		BumpHeight      0.460773
		BumpOffset      0.0921547
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.224601
		GasToDust   0.25
		Particles   1433
		GasBright   0.0678551
		DustBright  0.700751
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   313.374
		Period          1425.35
		Eccentricity    0.835524
		Inclination     86.8724
		AscendingNode   135.123
		ArgOfPericenter 15.3241
		MeanAnomaly     -41.4051
	}
}

Comet	"C42"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            4.19342e-010
	Radius          11.0635
	InertiaMoment   0.398253

	Oblateness      0.010108

	RotationPeriod  55.061
	Obliquity       7.38915
	EqAscendNode    158.503
	//Precession      0

	AbsMagn         4.69546
	SlopeParam      3.68532
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.418 0.411 0.406)

	Surface
	{
		SurfStyle       0.738654
		OceanStyle      0.704727
		Randomize      (0.496, 0.204, 0.781)
		colorDistMagn   0.74289
		colorDistFreq   0.0519269
		detailScale     302.106
		colorConversion true
		snowLevel       2
		tropicLatitude  0.985232
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.500504
		terraceProb     0.304755
		erosion         0
		montesMagn      0.459532
		montesFreq      2.51935
		montesSpiky     0.885945
		montesFraction  0.42365
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.294613
		hillsFraction   0.763066
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259006
		craterFreq      0.263981
		craterDensity   0.790724
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.544264
		volcanoTemp     1678.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.163, 0.140, 0.114, 0.000)
		colorShelf     (0.167, 0.144, 0.130, 0.000)
		colorBeach     (0.196, 0.168, 0.154, 0.000)
		colorDesert    (0.213, 0.181, 0.150, 0.000)
		colorLowland   (0.234, 0.193, 0.170, 0.000)
		colorUpland    (0.259, 0.234, 0.207, 0.000)
		colorRock      (0.280, 0.255, 0.223, 0.000)
		colorSnow      (0.305, 0.271, 0.235, 1.000)
		BumpHeight      9.95712
		BumpOffset      1.99142
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.705793
		GasToDust   0.25
		Particles   2405
		GasBright   0.0667535
		DustBright  0.386339
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   320.412
		Period          1473.63
		Eccentricity    0.748774
		Inclination     72.7814
		AscendingNode   5.19953
		ArgOfPericenter 74.1674
		MeanAnomaly     -138.147
	}
}

Comet	"C43"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            1.29119e-017
	Radius          0.0317089
	InertiaMoment   0.399914

	Oblateness      0.00832293

	RotationPeriod  53.2251
	Obliquity       320.595
	EqAscendNode    143.08
	//Precession      0

	AbsMagn         12.3043
	SlopeParam      4.24912
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.439 0.432 0.429)

	Surface
	{
		SurfStyle       0.644335
		OceanStyle      0.243899
		Randomize      (-0.616, 0.196, -0.102)
		colorDistMagn   0.0875341
		colorDistFreq   7.65337e-007
		detailScale     0.865863
		colorConversion true
		snowLevel       2
		tropicLatitude  0.951431
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.642488
		terraceProb     0.348502
		erosion         0
		montesMagn      0.628844
		montesFreq      2.94653
		montesSpiky     0.945664
		montesFraction  0.651231
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.8678e-006
		hillsFraction   0.498682
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232684
		craterFreq      0.234045
		craterDensity   0.982526
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.591153
		volcanoTemp     1448.53
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.171, 0.147, 0.120, 0.000)
		colorShelf     (0.176, 0.151, 0.137, 0.000)
		colorBeach     (0.206, 0.177, 0.163, 0.000)
		colorDesert    (0.224, 0.190, 0.159, 0.000)
		colorLowland   (0.246, 0.203, 0.180, 0.000)
		colorUpland    (0.272, 0.246, 0.219, 0.000)
		colorRock      (0.294, 0.268, 0.236, 0.000)
		colorSnow      (0.320, 0.285, 0.249, 1.000)
		BumpHeight      0.028538
		BumpOffset      0.0057076
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.193492
		DustBright  0.744087
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   448.838
		Period          2443.21
		Eccentricity    0.957021
		Inclination     -61.1647
		AscendingNode   83.3086
		ArgOfPericenter -76.2271
		MeanAnomaly     90.6565
	}
}

Comet	"C44"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            9.98638e-014
	Radius          0.685135
	InertiaMoment   0.398803

	Oblateness      0.0115903

	RotationPeriod  51.4028
	Obliquity       273.801
	EqAscendNode    127.658
	//Precession      0

	AbsMagn         8.21372
	SlopeParam      4.83389
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.559 0.553 0.548)

	Surface
	{
		SurfStyle       0.701521
		OceanStyle      0.802912
		Randomize      (-0.767, 0.002, -0.298)
		colorDistMagn   0.0235292
		colorDistFreq   0.000378356
		detailScale     18.7088
		colorConversion true
		snowLevel       2
		tropicLatitude  0.985485
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.328354
		terraceProb     0.434197
		erosion         0
		montesMagn      0.399502
		montesFreq      2.84136
		montesSpiky     0.821679
		montesFraction  0.717749
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000738441
		hillsFraction   0.777087
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241962
		craterFreq      0.241831
		craterDensity   0.930283
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.498735
		volcanoTemp     1452.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.218, 0.188, 0.154, 0.000)
		colorShelf     (0.224, 0.194, 0.175, 0.000)
		colorBeach     (0.263, 0.227, 0.208, 0.000)
		colorDesert    (0.285, 0.243, 0.203, 0.000)
		colorLowland   (0.313, 0.260, 0.230, 0.000)
		colorUpland    (0.347, 0.315, 0.280, 0.000)
		colorRock      (0.375, 0.343, 0.302, 0.000)
		colorSnow      (0.408, 0.365, 0.318, 1.000)
		BumpHeight      0.616622
		BumpOffset      0.123324
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.257427
		GasToDust   0.25
		Particles   1499
		GasBright   0.165108
		DustBright  0.456958
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   466.766
		Period          2591.05
		Eccentricity    0.638138
		Inclination     -7.06425
		AscendingNode   147.928
		ArgOfPericenter -68.3208
		MeanAnomaly     -129.085
	}
}

Comet	"C45"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            7.72375e-010
	Radius          12.3912
	InertiaMoment   0.396994

	Oblateness      0.0094611

	RotationPeriod  49.5891
	Obliquity       227.006
	EqAscendNode    112.235
	//Precession      0

	AbsMagn         4.39241
	SlopeParam      5.50229
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.650 0.647 0.645)

	Surface
	{
		SurfStyle       0.788289
		OceanStyle      0.751728
		Randomize      (0.139, 0.547, 0.934)
		colorDistMagn   0.115061
		colorDistFreq   0.063147
		detailScale     338.362
		colorConversion true
		snowLevel       2
		tropicLatitude  0.954023
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.431232
		terraceProb     0.109734
		erosion         0
		montesMagn      0.581586
		montesFreq      3.16927
		montesSpiky     0.905638
		montesFraction  0.543773
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.369337
		hillsFraction   0.793618
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24396
		craterFreq      0.202739
		craterDensity   0.788556
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.501932
		volcanoTemp     1535.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.253, 0.220, 0.181, 0.000)
		colorShelf     (0.260, 0.226, 0.206, 0.000)
		colorBeach     (0.305, 0.265, 0.245, 0.000)
		colorDesert    (0.331, 0.284, 0.239, 0.000)
		colorLowland   (0.364, 0.304, 0.271, 0.000)
		colorUpland    (0.403, 0.369, 0.329, 0.000)
		colorRock      (0.435, 0.401, 0.355, 0.000)
		colorSnow      (0.474, 0.427, 0.374, 1.000)
		BumpHeight      11.1521
		BumpOffset      2.23042
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.738619
		GasToDust   0.25
		Particles   2471
		GasBright   0.0994653
		DustBright  0.207087
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   477.603
		Period          2681.8
		Eccentricity    0.7766
		Inclination     97.1714
		AscendingNode   -72.7994
		ArgOfPericenter -20.8503
		MeanAnomaly     51.5662
	}
}

Comet	"C46"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            2.3782e-017
	Radius          0.0424292
	InertiaMoment   0.399273

	Oblateness      0.0134023

	RotationPeriod  47.7794
	Obliquity       180.212
	EqAscendNode    96.8125
	//Precession      0

	AbsMagn         11.9491
	SlopeParam      6.40892
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.776 0.660 0.608)

	Surface
	{
		SurfStyle       0.753743
		OceanStyle      0.856727
		Randomize      (0.657, -0.692, 0.857)
		colorDistMagn   0.555549
		colorDistFreq   1.19516e-006
		detailScale     1.1586
		colorConversion true
		snowLevel       2
		tropicLatitude  0.921803
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.527602
		terraceProb     0.176361
		erosion         0
		montesMagn      0.654129
		montesFreq      2.44407
		montesSpiky     0.952805
		montesFraction  0.741715
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.83652e-006
		hillsFraction   0.753252
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.210082
		craterFreq      0.18751
		craterDensity   0.844907
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.511914
		volcanoTemp     1545.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.303, 0.225, 0.170, 0.000)
		colorShelf     (0.311, 0.231, 0.194, 0.000)
		colorBeach     (0.365, 0.271, 0.231, 0.000)
		colorDesert    (0.396, 0.291, 0.225, 0.000)
		colorLowland   (0.435, 0.310, 0.255, 0.000)
		colorUpland    (0.481, 0.376, 0.310, 0.000)
		colorRock      (0.520, 0.409, 0.334, 0.000)
		colorSnow      (0.567, 0.436, 0.352, 1.000)
		BumpHeight      0.0381863
		BumpOffset      0.00763726
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.303371
		DustBright  0.487668
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   609.251
		Period          3863.86
		Eccentricity    0.728085
		Inclination     -67.0817
		AscendingNode   -121.009
		ArgOfPericenter 140.589
		MeanAnomaly     -179.26
	}
}

Comet	"C47"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            1.83936e-013
	Radius          0.767438
	InertiaMoment   0.397927

	Oblateness      0.0110217

	RotationPeriod  45.9692
	Obliquity       133.418
	EqAscendNode    81.39
	//Precession      0

	AbsMagn         8.00498
	SlopeParam      9.71682
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.687 0.684 0.679)

	Surface
	{
		SurfStyle       0.23683
		OceanStyle      0.969805
		Randomize      (-0.784, -0.798, -0.224)
		colorDistMagn   0.948721
		colorDistFreq   0.000421955
		detailScale     20.9562
		colorConversion true
		snowLevel       2
		tropicLatitude  0.363939
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.64343
		terraceProb     0.115368
		erosion         0
		montesMagn      0.661353
		montesFreq      2.43456
		montesSpiky     0.937746
		montesFraction  0.32663
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00152388
		hillsFraction   0.742172
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259545
		craterFreq      0.230244
		craterDensity   0.997276
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.530566
		volcanoTemp     1502.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.275, 0.274, 0.272, 0.000)
		colorShelf     (0.292, 0.291, 0.289, 0.000)
		colorBeach     (0.309, 0.308, 0.306, 0.000)
		colorDesert    (0.326, 0.325, 0.323, 0.000)
		colorLowland   (0.343, 0.342, 0.340, 0.000)
		colorUpland    (0.361, 0.359, 0.357, 0.000)
		colorRock      (0.378, 0.376, 0.374, 0.000)
		colorSnow      (0.395, 0.393, 0.391, 1.000)
		BumpHeight      0.690694
		BumpOffset      0.138139
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.290253
		GasToDust   0.25
		Particles   1566
		GasBright   0.210446
		DustBright  0.265079
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   406.781
		Period          2107.99
		Eccentricity    0.597346
		Inclination     39.7287
		AscendingNode   -29.8101
		ArgOfPericenter 13.3096
		MeanAnomaly     176.493
	}
}

Comet	"C48"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            1.42262e-009
	Radius          16.579
	InertiaMoment   0.399707

	Oblateness      0.0156772

	RotationPeriod  44.1538
	Obliquity       86.6234
	EqAscendNode    65.9674
	//Precession      0

	AbsMagn         4.06708
	SlopeParam      2.76591
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.456 0.449 0.442)

	Surface
	{
		SurfStyle       0.933832
		OceanStyle      0.127761
		Randomize      (0.781, -0.924, 0.855)
		colorDistMagn   0.956055
		colorDistFreq   0.118779
		detailScale     452.717
		colorConversion true
		snowLevel       2
		tropicLatitude  0.785657
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.653179
		terraceProb     0.358884
		erosion         0
		montesMagn      0.448976
		montesFreq      4.00047
		montesSpiky     0.915727
		montesFraction  0.722851
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.753042
		hillsFraction   0.699682
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213661
		craterFreq      0.274291
		craterDensity   0.834652
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.480985
		volcanoTemp     1217.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.155, 0.157, 0.177, 0.050)
		colorShelf     (0.182, 0.184, 0.203, 0.040)
		colorBeach     (0.210, 0.211, 0.230, 0.030)
		colorDesert    (0.237, 0.238, 0.261, 0.020)
		colorLowland   (0.264, 0.265, 0.288, 0.030)
		colorUpland    (0.292, 0.292, 0.314, 0.050)
		colorRock      (0.319, 0.319, 0.349, 0.020)
		colorSnow      (0.319, 0.319, 0.349, 1.000)
		BumpHeight      14.9211
		BumpOffset      2.98422
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.771445
		GasToDust   0.25
		Particles   2538
		GasBright   0.00153609
		DustBright  0.958476
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   661.381
		Period          4370.23
		Eccentricity    0.810837
		Inclination     123.635
		AscendingNode   -141.592
		ArgOfPericenter -101.721
		MeanAnomaly     -39.7589
	}
}

Comet	"C49"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            4.38035e-017
	Radius          0.0475302
	InertiaMoment   0.398545

	Oblateness      0.0129976

	RotationPeriod  42.3285
	Obliquity       39.8291
	EqAscendNode    50.5448
	//Precession      0

	AbsMagn         11.6226
	SlopeParam      3.39261
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.771 0.742 0.714)

	Surface
	{
		SurfStyle       0.108711
		OceanStyle      0.625057
		Randomize      (0.008, 0.136, 0.576)
		colorDistMagn   0.997105
		colorDistFreq   1.55123e-006
		detailScale     1.29789
		colorConversion true
		snowLevel       2
		tropicLatitude  0.984838
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.658291
		terraceProb     0.433212
		erosion         0
		montesMagn      0.558003
		montesFreq      2.70841
		montesSpiky     0.764597
		montesFraction  0.334751
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.29459e-006
		hillsFraction   0.91775
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259121
		craterFreq      0.221089
		craterDensity   0.771924
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.477969
		volcanoTemp     1567.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.308, 0.297, 0.286, 0.000)
		colorShelf     (0.328, 0.315, 0.304, 0.000)
		colorBeach     (0.347, 0.334, 0.321, 0.000)
		colorDesert    (0.366, 0.352, 0.339, 0.000)
		colorLowland   (0.385, 0.371, 0.357, 0.000)
		colorUpland    (0.405, 0.389, 0.375, 0.000)
		colorRock      (0.424, 0.408, 0.393, 0.000)
		colorSnow      (0.443, 0.426, 0.411, 1.000)
		BumpHeight      0.0427772
		BumpOffset      0.00855544
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0390858
		DustBright  0.605413
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   557.3
		Period          3380.34
		Eccentricity    0.795629
		Inclination     -139.51
		AscendingNode   9.17593
		ArgOfPericenter -77.5347
		MeanAnomaly     -128.992
	}
}

Comet	"C50"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            3.38788e-013
	Radius          1.02673
	InertiaMoment   0.396087

	Oblateness      0.018344

	RotationPeriod  40.4886
	Obliquity       353.035
	EqAscendNode    35.1222
	//Precession      0

	AbsMagn         7.79626
	SlopeParam      3.96368
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.594 0.496 0.461)

	Surface
	{
		SurfStyle       0.865164
		OceanStyle      0.987133
		Randomize      (0.777, -0.344, -0.369)
		colorDistMagn   0.631997
		colorDistFreq   0.000350527
		detailScale     28.0365
		colorConversion true
		snowLevel       2
		tropicLatitude  0.714479
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.471809
		terraceProb     0.214693
		erosion         0
		montesMagn      0.582911
		montesFreq      3.26864
		montesSpiky     0.942716
		montesFraction  0.0693819
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00269851
		hillsFraction   0.919054
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.215629
		craterFreq      0.213205
		craterDensity   0.698576
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.480342
		volcanoTemp     1255.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.202, 0.174, 0.184, 0.050)
		colorShelf     (0.238, 0.203, 0.212, 0.040)
		colorBeach     (0.273, 0.233, 0.240, 0.030)
		colorDesert    (0.309, 0.263, 0.272, 0.020)
		colorLowland   (0.345, 0.293, 0.300, 0.030)
		colorUpland    (0.380, 0.322, 0.327, 0.050)
		colorRock      (0.416, 0.352, 0.364, 0.020)
		colorSnow      (0.416, 0.352, 0.364, 1.000)
		BumpHeight      0.924053
		BumpOffset      0.184811
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.323079
		GasToDust   0.25
		Particles   1632
		GasBright   0.0393764
		DustBright  0.289609
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   542.415
		Period          3245.82
		Eccentricity    0.758052
		Inclination     -50.0222
		AscendingNode   131.776
		ArgOfPericenter 123.407
		MeanAnomaly     88.6206
	}
}

Comet	"C51"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            2.62029e-009
	Radius          18.5735
	InertiaMoment   0.399048

	Oblateness      0.0155975

	RotationPeriod  38.6288
	Obliquity       306.24
	EqAscendNode    19.6996
	//Precession      0

	AbsMagn         3.7134
	SlopeParam      4.53175
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.453 0.444 0.440)

	Surface
	{
		SurfStyle       0.965321
		OceanStyle      0.931978
		Randomize      (0.905, 0.436, 0.373)
		colorDistMagn   0.550241
		colorDistFreq   0.255813
		detailScale     507.18
		colorConversion true
		snowLevel       2
		tropicLatitude  0.76436
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.58139
		terraceProb     0.146252
		erosion         0
		montesMagn      0.645494
		montesFreq      2.93596
		montesSpiky     0.936651
		montesFraction  0.289642
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.631645
		hillsFraction   0.707238
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218933
		craterFreq      0.21165
		craterDensity   0.90143
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.509963
		volcanoTemp     1271.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.154, 0.156, 0.176, 0.050)
		colorShelf     (0.181, 0.182, 0.202, 0.040)
		colorBeach     (0.208, 0.209, 0.229, 0.030)
		colorDesert    (0.235, 0.235, 0.260, 0.020)
		colorLowland   (0.263, 0.262, 0.286, 0.030)
		colorUpland    (0.290, 0.289, 0.312, 0.050)
		colorRock      (0.317, 0.315, 0.348, 0.020)
		colorSnow      (0.317, 0.315, 0.348, 1.000)
		BumpHeight      16.7161
		BumpOffset      3.34323
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.804271
		GasToDust   0.25
		Particles   2604
		GasBright   0.145397
		DustBright  0.668075
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   484.982
		Period          2744.2
		Eccentricity    0.747441
		Inclination     -174.097
		AscendingNode   46.8316
		ArgOfPericenter -73.3592
		MeanAnomaly     -96.0233
	}
}

Comet	"C52"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            8.06806e-017
	Radius          0.063585
	InertiaMoment   0.397533

	Oblateness      0.0223361

	RotationPeriod  36.7437
	Obliquity       259.446
	EqAscendNode    4.277
	//Precession      0

	AbsMagn         11.3186
	SlopeParam      5.14737
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.466 0.464 0.461)

	Surface
	{
		SurfStyle       0.52643
		OceanStyle      0.313062
		Randomize      (0.870, -0.194, 0.992)
		colorDistMagn   0.0570393
		colorDistFreq   3.02171e-006
		detailScale     1.73629
		colorConversion true
		snowLevel       2
		tropicLatitude  0.98768
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.338711
		terraceProb     0.117419
		erosion         0
		montesMagn      0.539977
		montesFreq      2.80114
		montesSpiky     0.927635
		montesFraction  0.512834
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.28585e-006
		hillsFraction   0.701262
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261982
		craterFreq      0.220533
		craterDensity   0.825265
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.563097
		volcanoTemp     1619.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.182, 0.158, 0.129, 0.000)
		colorShelf     (0.186, 0.163, 0.147, 0.000)
		colorBeach     (0.219, 0.190, 0.175, 0.000)
		colorDesert    (0.238, 0.204, 0.170, 0.000)
		colorLowland   (0.261, 0.218, 0.194, 0.000)
		colorUpland    (0.289, 0.265, 0.235, 0.000)
		colorRock      (0.312, 0.288, 0.253, 0.000)
		colorSnow      (0.340, 0.306, 0.267, 1.000)
		BumpHeight      0.0572265
		BumpOffset      0.0114453
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.118405
		DustBright  0.379553
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   353.78
		Period          1709.73
		Eccentricity    0.623505
		Inclination     38.405
		AscendingNode   -91.2158
		ArgOfPericenter -143.398
		MeanAnomaly     -75.4948
	}
}

Comet	"C53"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            6.24007e-013
	Radius          1.15031
	InertiaMoment   0.399496

	Oblateness      0.0191731

	RotationPeriod  34.8271
	Obliquity       212.652
	EqAscendNode    348.854
	//Precession      0

	AbsMagn         7.58698
	SlopeParam      5.90034
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.558 0.483 0.423)

	Surface
	{
		SurfStyle       0.0554872
		OceanStyle      0.0826282
		Randomize      (0.058, 0.568, -0.815)
		colorDistMagn   0.653511
		colorDistFreq   0.000872292
		detailScale     31.4111
		colorConversion true
		snowLevel       2
		tropicLatitude  0.444444
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.30507
		terraceProb     0.507002
		erosion         0
		montesMagn      0.468407
		montesFreq      3.09968
		montesSpiky     0.88237
		montesFraction  0.780331
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00340598
		hillsFraction   0.572678
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.268833
		craterFreq      0.205823
		craterDensity   0.853743
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.473913
		volcanoTemp     1689.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.223, 0.193, 0.169, 0.000)
		colorShelf     (0.237, 0.205, 0.180, 0.000)
		colorBeach     (0.251, 0.217, 0.190, 0.000)
		colorDesert    (0.265, 0.229, 0.201, 0.000)
		colorLowland   (0.279, 0.241, 0.212, 0.000)
		colorUpland    (0.293, 0.253, 0.222, 0.000)
		colorRock      (0.307, 0.265, 0.233, 0.000)
		colorSnow      (0.321, 0.278, 0.243, 1.000)
		BumpHeight      1.03528
		BumpOffset      0.207055
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.355905
		GasToDust   0.25
		Particles   1698
		GasBright   0.291616
		DustBright  0.690829
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   595.678
		Period          3735.46
		Eccentricity    0.664985
		Inclination     133.705
		AscendingNode   36.3698
		ArgOfPericenter 131.624
		MeanAnomaly     -47.0516
	}
}

Comet	"C54"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            4.82623e-009
	Radius          24.846
	InertiaMoment   0.398261

	Oblateness      0.0279101

	RotationPeriod  32.8725
	Obliquity       165.858
	EqAscendNode    333.432
	//Precession      0

	AbsMagn         3.32258
	SlopeParam      7.12752
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.740 0.666 0.538)

	Surface
	{
		SurfStyle       0.0466211
		OceanStyle      0.293544
		Randomize      (-0.602, -0.786, -0.980)
		colorDistMagn   0.828946
		colorDistFreq   0.341747
		detailScale     678.463
		colorConversion true
		snowLevel       2
		tropicLatitude  0.569358
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.674397
		terraceProb     0.364835
		erosion         0
		montesMagn      0.56272
		montesFreq      3.38001
		montesSpiky     0.997776
		montesFraction  0.264367
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.64565
		hillsFraction   0.611215
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214946
		craterFreq      0.204557
		craterDensity   0.829761
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.567896
		volcanoTemp     1456.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.296, 0.266, 0.215, 0.000)
		colorShelf     (0.315, 0.283, 0.229, 0.000)
		colorBeach     (0.333, 0.300, 0.242, 0.000)
		colorDesert    (0.352, 0.316, 0.255, 0.000)
		colorLowland   (0.370, 0.333, 0.269, 0.000)
		colorUpland    (0.389, 0.350, 0.282, 0.000)
		colorRock      (0.407, 0.366, 0.296, 0.000)
		colorSnow      (0.426, 0.383, 0.309, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.837097
		GasToDust   0.25
		Particles   2670
		GasBright   0.237342
		DustBright  0.42959
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   416.048
		Period          2180.43
		Eccentricity    0.759543
		Inclination     -132.983
		AscendingNode   -25.7651
		ArgOfPericenter -116.328
		MeanAnomaly     127.589
	}
}

Comet	"C55"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            1.48603e-016
	Radius          0.071241
	InertiaMoment   0.39992

	Oblateness      0.0243777

	RotationPeriod  30.8721
	Obliquity       119.063
	EqAscendNode    318.009
	//Precession      0

	AbsMagn         11.0326
	SlopeParam      2.39958
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.479 0.474 0.472)

	Surface
	{
		SurfStyle       0.928754
		OceanStyle      0.394119
		Randomize      (-0.188, 0.045, -0.265)
		colorDistMagn   0.815618
		colorDistFreq   4.43836e-006
		detailScale     1.94535
		colorConversion true
		snowLevel       2
		tropicLatitude  0.868499
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.569003
		terraceProb     0.262429
		erosion         0
		montesMagn      0.356406
		montesFreq      4.23682
		montesSpiky     0.935302
		montesFraction  0.743475
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.86402e-006
		hillsFraction   0.714628
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244099
		craterFreq      0.21649
		craterDensity   0.868277
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.515128
		volcanoTemp     1746.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.163, 0.166, 0.189, 0.050)
		colorShelf     (0.191, 0.194, 0.217, 0.040)
		colorBeach     (0.220, 0.223, 0.245, 0.030)
		colorDesert    (0.249, 0.251, 0.278, 0.020)
		colorLowland   (0.278, 0.279, 0.307, 0.030)
		colorUpland    (0.306, 0.308, 0.335, 0.050)
		colorRock      (0.335, 0.336, 0.373, 0.020)
		colorSnow      (0.335, 0.336, 0.373, 1.000)
		BumpHeight      0.0641169
		BumpOffset      0.0128234
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.145809
		DustBright  0.205609
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   348.58
		Period          1672.17
		Eccentricity    0.696329
		Inclination     154.253
		AscendingNode   98.8081
		ArgOfPericenter 113.42
		MeanAnomaly     42.0469
	}
}

Comet	"C56"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            1.14934e-012
	Radius          1.53873
	InertiaMoment   0.398809

	Oblateness      0.0362984

	RotationPeriod  28.8175
	Obliquity       72.269
	EqAscendNode    302.587
	//Precession      0

	AbsMagn         7.37656
	SlopeParam      3.0862
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.751 0.749 0.748)

	Surface
	{
		SurfStyle       0.197063
		OceanStyle      0.31394
		Randomize      (0.215, 0.488, 0.802)
		colorDistMagn   0.123195
		colorDistFreq   0.000832948
		detailScale     42.0177
		colorConversion true
		snowLevel       2
		tropicLatitude  0.174528
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.475411
		terraceProb     0.214991
		erosion         0
		montesMagn      0.435828
		montesFreq      1.33095
		montesSpiky     0.924567
		montesFraction  0.572472
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00509009
		hillsFraction   0.507483
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245658
		craterFreq      0.2535
		craterDensity   0.911171
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.445678
		volcanoTemp     1158.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.300, 0.300, 0.299, 0.000)
		colorShelf     (0.319, 0.318, 0.318, 0.000)
		colorBeach     (0.338, 0.337, 0.337, 0.000)
		colorDesert    (0.357, 0.356, 0.355, 0.000)
		colorLowland   (0.376, 0.374, 0.374, 0.000)
		colorUpland    (0.394, 0.393, 0.393, 0.000)
		colorRock      (0.413, 0.412, 0.411, 0.000)
		colorSnow      (0.432, 0.431, 0.430, 1.000)
		BumpHeight      1.38486
		BumpOffset      0.276972
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.38873
		GasToDust   0.25
		Particles   1765
		GasBright   0.396187
		DustBright  0.439718
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   251.365
		Period          1023.96
		Eccentricity    0.551439
		Inclination     -101.864
		AscendingNode   171.554
		ArgOfPericenter -98.6907
		MeanAnomaly     12.7731
	}
}

Comet	"C57"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            8.88931e-009
	Radius          27.8383
	InertiaMoment   0.39701

	Oblateness      0.0321604

	RotationPeriod  26.6983
	Obliquity       25.4747
	EqAscendNode    287.164
	//Precession      0

	AbsMagn         2.88112
	SlopeParam      3.6775
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.749 0.746 0.744)

	Surface
	{
		SurfStyle       0.85087
		OceanStyle      0.939391
		Randomize      (-0.257, -0.340, -0.834)
		colorDistMagn   0.078279
		colorDistFreq   0.469798
		detailScale     760.171
		colorConversion true
		snowLevel       2
		tropicLatitude  0.414588
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.341847
		terraceProb     0.154216
		erosion         0
		montesMagn      0.517443
		montesFreq      3.4368
		montesSpiky     0.969075
		montesFraction  0.519055
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.55274
		hillsFraction   0.694757
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224179
		craterFreq      0.244758
		craterDensity   0.764982
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.533918
		volcanoTemp     1642.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.255, 0.261, 0.298, 0.050)
		colorShelf     (0.300, 0.306, 0.342, 0.040)
		colorBeach     (0.345, 0.351, 0.387, 0.030)
		colorDesert    (0.390, 0.396, 0.439, 0.020)
		colorLowland   (0.435, 0.440, 0.484, 0.030)
		colorUpland    (0.480, 0.485, 0.528, 0.050)
		colorRock      (0.525, 0.530, 0.588, 0.020)
		colorSnow      (0.525, 0.530, 0.588, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.869922
		GasToDust   0.25
		Particles   2737
		GasBright   0.0171767
		DustBright  0.503214
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   489.427
		Period          2782.01
		Eccentricity    0.581022
		Inclination     34.3543
		AscendingNode   132.735
		ArgOfPericenter -34.7943
		MeanAnomaly     112.361
	}
}

Comet	"C58"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            2.73709e-016
	Radius          0.0952956
	InertiaMoment   0.399279

	Oblateness      0.0501686

	RotationPeriod  24.5025
	Obliquity       338.68
	EqAscendNode    271.741
	//Precession      0

	AbsMagn         10.7614
	SlopeParam      4.24135
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.764 0.762 0.760)

	Surface
	{
		SurfStyle       0.832066
		OceanStyle      0.637612
		Randomize      (0.557, -0.700, 0.099)
		colorDistMagn   0.534215
		colorDistFreq   8.01166e-007
		detailScale     2.60221
		colorConversion true
		snowLevel       2
		tropicLatitude  0.629857
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.318306
		terraceProb     0.120254
		erosion         0
		montesMagn      0.63142
		montesFreq      2.42008
		montesSpiky     0.970265
		montesFraction  0.534111
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.36747e-005
		hillsFraction   0.575421
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237882
		craterFreq      0.169306
		craterDensity   0.79201
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50331
		volcanoTemp     1398.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.298, 0.259, 0.213, 0.000)
		colorShelf     (0.306, 0.267, 0.243, 0.000)
		colorBeach     (0.359, 0.312, 0.289, 0.000)
		colorDesert    (0.390, 0.335, 0.281, 0.000)
		colorLowland   (0.428, 0.358, 0.319, 0.000)
		colorUpland    (0.474, 0.434, 0.388, 0.000)
		colorRock      (0.512, 0.472, 0.418, 0.000)
		colorSnow      (0.558, 0.503, 0.441, 1.000)
		BumpHeight      0.085766
		BumpOffset      0.0171532
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0188595
		DustBright  0.186018
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   541.363
		Period          3236.38
		Eccentricity    0.583798
		Inclination     -46.6173
		AscendingNode   -121.191
		ArgOfPericenter 25.2871
		MeanAnomaly     -123.192
	}
}

Comet	"C59"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            2.11694e-012
	Radius          1.72406
	InertiaMoment   0.397936

	Oblateness      0.0464906

	RotationPeriod  22.2156
	Obliquity       291.886
	EqAscendNode    256.319
	//Precession      0

	AbsMagn         7.1644
	SlopeParam      4.82548
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.787 0.786 0.785)

	Surface
	{
		SurfStyle       0.389757
		OceanStyle      0.136503
		Randomize      (0.512, 0.908, -0.616)
		colorDistMagn   0.245256
		colorDistFreq   0.00208306
		detailScale     47.0783
		colorConversion true
		snowLevel       2
		tropicLatitude  0.908246
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.642097
		terraceProb     0.19106
		erosion         0
		montesMagn      0.395369
		montesFreq      3.06933
		montesSpiky     0.931788
		montesFraction  0.487025
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00521473
		hillsFraction   0.784821
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213909
		craterFreq      0.164547
		craterDensity   0.88912
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.395133
		volcanoTemp     1728.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.315, 0.314, 0.314, 0.000)
		colorShelf     (0.335, 0.334, 0.334, 0.000)
		colorBeach     (0.354, 0.354, 0.353, 0.000)
		colorDesert    (0.374, 0.373, 0.373, 0.000)
		colorLowland   (0.394, 0.393, 0.392, 0.000)
		colorUpland    (0.413, 0.413, 0.412, 0.000)
		colorRock      (0.433, 0.432, 0.432, 0.000)
		colorSnow      (0.453, 0.452, 0.451, 1.000)
		BumpHeight      1.55165
		BumpOffset      0.31033
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.421556
		GasToDust   0.25
		Particles   1831
		GasBright   0.104161
		DustBright  0.585203
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   501.601
		Period          2886.45
		Eccentricity    0.867343
		Inclination     -16.4111
		AscendingNode   -103.424
		ArgOfPericenter -73.221
		MeanAnomaly     -115.163
	}
}

Comet	"C60"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            1.6373e-008
	Radius          37.2379
	InertiaMoment   0.399712

	Oblateness      0.076607

	RotationPeriod  19.8195
	Obliquity       245.092
	EqAscendNode    240.896
	//Precession      0

	AbsMagn         2.3666
	SlopeParam      5.49208
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.523 0.519 0.518)

	Surface
	{
		SurfStyle       0.960453
		OceanStyle      0.686368
		Randomize      (0.252, 0.627, 0.274)
		colorDistMagn   0.432922
		colorDistFreq   0.924819
		detailScale     1016.84
		colorConversion true
		snowLevel       2
		tropicLatitude  0.571404
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.444295
		terraceProb     0.17105
		erosion         0
		montesMagn      0.570529
		montesFreq      4.3568
		montesSpiky     0.978261
		montesFraction  0.817084
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.80798
		hillsFraction   0.799854
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259673
		craterFreq      0.251423
		craterDensity   0.899719
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.522013
		volcanoTemp     1173.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.178, 0.182, 0.207, 0.050)
		colorShelf     (0.209, 0.213, 0.238, 0.040)
		colorBeach     (0.240, 0.244, 0.269, 0.030)
		colorDesert    (0.272, 0.275, 0.305, 0.020)
		colorLowland   (0.303, 0.306, 0.337, 0.030)
		colorUpland    (0.334, 0.338, 0.368, 0.050)
		colorRock      (0.366, 0.369, 0.409, 0.020)
		colorSnow      (0.366, 0.369, 0.409, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.902748
		GasToDust   0.25
		Particles   2803
		GasBright   0.0785622
		DustBright  0.295289
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   440.424
		Period          2374.83
		Eccentricity    0.597457
		Inclination     -48.7441
		AscendingNode   37.2232
		ArgOfPericenter 161.168
		MeanAnomaly     17.4307
	}
}

Comet	"C61"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            5.04138e-016
	Radius          0.106772
	InertiaMoment   0.398552

	Oblateness      0.0767167

	RotationPeriod  17.2916
	Obliquity       198.298
	EqAscendNode    225.474
	//Precession      0

	AbsMagn         10.5023
	SlopeParam      6.39306
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.749 0.746 0.743)

	Surface
	{
		SurfStyle       0.795135
		OceanStyle      0.585128
		Randomize      (-0.897, 0.730, -0.979)
		colorDistMagn   0.0434485
		colorDistFreq   9.62635e-006
		detailScale     2.91558
		colorConversion true
		snowLevel       2
		tropicLatitude  0.814745
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.650173
		terraceProb     0.28465
		erosion         0
		montesMagn      0.44885
		montesFreq      2.69585
		montesSpiky     0.94477
		montesFraction  0.673081
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.47816e-005
		hillsFraction   0.59651
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.212793
		craterFreq      0.247929
		craterDensity   0.836734
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.482967
		volcanoTemp     1290.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.292, 0.253, 0.208, 0.000)
		colorShelf     (0.300, 0.261, 0.238, 0.000)
		colorBeach     (0.352, 0.306, 0.282, 0.000)
		colorDesert    (0.382, 0.328, 0.275, 0.000)
		colorLowland   (0.419, 0.350, 0.312, 0.000)
		colorUpland    (0.464, 0.425, 0.379, 0.000)
		colorRock      (0.502, 0.462, 0.408, 0.000)
		colorSnow      (0.547, 0.492, 0.431, 1.000)
		BumpHeight      0.0960946
		BumpOffset      0.0192189
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.231054
		DustBright  0.627283
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   481.227
		Period          2712.38
		Eccentricity    0.746925
		Inclination     123.143
		AscendingNode   -76.6413
		ArgOfPericenter 36.5164
		MeanAnomaly     95.6662
	}
}

Comet	"C62"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            3.89914e-012
	Radius          2.30622
	InertiaMoment   0.396122

	Oblateness      0.138891

	RotationPeriod  14.6023
	Obliquity       151.503
	EqAscendNode    210.051
	//Precession      0

	AbsMagn         6.94986
	SlopeParam      9.36238
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.423 0.420 0.418)

	Surface
	{
		SurfStyle       0.974937
		OceanStyle      0.20892
		Randomize      (0.472, -0.964, -0.408)
		colorDistMagn   0.808348
		colorDistFreq   0.00187707
		detailScale     62.9751
		colorConversion true
		snowLevel       2
		tropicLatitude  0.761926
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.512636
		terraceProb     0.328411
		erosion         0
		montesMagn      0.591162
		montesFreq      3.30754
		montesSpiky     0.917727
		montesFraction  0.503464
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0120373
		hillsFraction   0.679139
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244875
		craterFreq      0.243892
		craterDensity   0.86259
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.517631
		volcanoTemp     1750.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.144, 0.147, 0.167, 0.050)
		colorShelf     (0.169, 0.172, 0.192, 0.040)
		colorBeach     (0.195, 0.197, 0.217, 0.030)
		colorDesert    (0.220, 0.222, 0.246, 0.020)
		colorLowland   (0.246, 0.248, 0.272, 0.030)
		colorUpland    (0.271, 0.273, 0.297, 0.050)
		colorRock      (0.296, 0.298, 0.330, 0.020)
		colorSnow      (0.296, 0.298, 0.330, 1.000)
		BumpHeight      2.0756
		BumpOffset      0.415119
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.454382
		GasToDust   0.25
		Particles   1897
		GasBright   0.178173
		DustBright  0.364651
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   375.319
		Period          1868.22
		Eccentricity    0.605024
		Inclination     127.21
		AscendingNode   -107.806
		ArgOfPericenter 117.505
		MeanAnomaly     45.0103
	}
}

Comet	"C63"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            3.0157e-008
	Radius          41.7212
	InertiaMoment   0.399053

	Oblateness      0.167091

	RotationPeriod  11.7123
	Obliquity       104.709
	EqAscendNode    194.629
	//Precession      0

	AbsMagn         1.73706
	SlopeParam      2.75657
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.444 0.441 0.440)

	Surface
	{
		SurfStyle       0.682666
		OceanStyle      0.478991
		Randomize      (-0.468, 0.837, -0.172)
		colorDistMagn   0.253864
		colorDistFreq   0.824154
		detailScale     1139.27
		colorConversion true
		snowLevel       2
		tropicLatitude  0.977515
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.542799
		terraceProb     0.101672
		erosion         0
		montesMagn      0.477073
		montesFreq      1.93769
		montesSpiky     0.950873
		montesFraction  0.409846
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.80165
		hillsFraction   0.627834
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253184
		craterFreq      0.236823
		craterDensity   0.959755
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50344
		volcanoTemp     1386.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.173, 0.150, 0.123, 0.000)
		colorShelf     (0.178, 0.154, 0.141, 0.000)
		colorBeach     (0.209, 0.181, 0.167, 0.000)
		colorDesert    (0.227, 0.194, 0.163, 0.000)
		colorLowland   (0.249, 0.207, 0.185, 0.000)
		colorUpland    (0.275, 0.251, 0.224, 0.000)
		colorRock      (0.298, 0.273, 0.242, 0.000)
		colorSnow      (0.324, 0.291, 0.255, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.935574
		GasToDust   0.25
		Particles   2869
		GasBright   0.0880326
		DustBright  0.139278
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   368.85
		Period          1820.13
		Eccentricity    0.733238
		Inclination     177.133
		AscendingNode   27.9767
		ArgOfPericenter 165.824
		MeanAnomaly     64.1772
	}
}

Comet	"C64"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            9.28556e-016
	Radius          0.14283
	InertiaMoment   0.397544

	Oblateness      0.249

	RotationPeriod  8.5672
	Obliquity       57.9146
	EqAscendNode    179.206
	//Precession      0

	AbsMagn         10.2533
	SlopeParam      3.38452
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.701 0.568 0.465)

	Surface
	{
		SurfStyle       0.887625
		OceanStyle      0.302321
		Randomize      (-0.328, 0.774, 0.630)
		colorDistMagn   0.598995
		colorDistFreq   1.60274e-005
		detailScale     3.9002
		colorConversion true
		snowLevel       2
		tropicLatitude  0.950141
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.587528
		terraceProb     0.183143
		erosion         0
		montesMagn      0.564163
		montesFreq      3.09485
		montesSpiky     0.972622
		montesFraction  0.686622
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.93851e-005
		hillsFraction   0.562646
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233644
		craterFreq      0.243582
		craterDensity   0.856306
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.552952
		volcanoTemp     1421.33
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.238, 0.199, 0.186, 0.050)
		colorShelf     (0.280, 0.233, 0.214, 0.040)
		colorBeach     (0.322, 0.267, 0.242, 0.030)
		colorDesert    (0.364, 0.301, 0.274, 0.020)
		colorLowland   (0.406, 0.335, 0.302, 0.030)
		colorUpland    (0.448, 0.369, 0.330, 0.050)
		colorRock      (0.490, 0.403, 0.367, 0.020)
		colorSnow      (0.490, 0.403, 0.367, 1.000)
		BumpHeight      0.128547
		BumpOffset      0.0257093
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.317692
		DustBright  0.394105
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   639.269
		Period          4152.91
		Eccentricity    0.702845
		Inclination     16.2322
		AscendingNode   -33.1941
		ArgOfPericenter 101.544
		MeanAnomaly     -73.3158
	}
}

Comet	"C65"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            7.18172e-012
	Radius          2.58376
	InertiaMoment   0.399501

	Oblateness      0.249

	RotationPeriod  5.08823
	Obliquity       11.1203
	EqAscendNode    163.783
	//Precession      0

	AbsMagn         6.73226
	SlopeParam      3.95597
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.640 0.638 0.636)

	Surface
	{
		SurfStyle       0.866494
		OceanStyle      0.752093
		Randomize      (-0.965, 0.273, -0.532)
		colorDistMagn   0.735709
		colorDistFreq   0.00459137
		detailScale     70.5539
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998711
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.517068
		terraceProb     0.27084
		erosion         0
		montesMagn      0.486788
		montesFreq      2.93426
		montesSpiky     0.942363
		montesFraction  0.461976
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0216033
		hillsFraction   0.696592
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257233
		craterFreq      0.233854
		craterDensity   0.924671
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.452103
		volcanoTemp     1630.53
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.218, 0.223, 0.254, 0.050)
		colorShelf     (0.256, 0.261, 0.292, 0.040)
		colorBeach     (0.295, 0.300, 0.331, 0.030)
		colorDesert    (0.333, 0.338, 0.375, 0.020)
		colorLowland   (0.371, 0.376, 0.413, 0.030)
		colorUpland    (0.410, 0.415, 0.451, 0.050)
		colorRock      (0.448, 0.453, 0.502, 0.020)
		colorSnow      (0.448, 0.453, 0.502, 1.000)
		BumpHeight      2.32539
		BumpOffset      0.465077
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.487208
		GasToDust   0.25
		Particles   1964
		GasBright   0.00212781
		DustBright  0.394156
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   335.646
		Period          1579.97
		Eccentricity    0.659901
		Inclination     86.4379
		AscendingNode   86.9586
		ArgOfPericenter 76.089
		MeanAnomaly     -126.773
	}
}

Comet	"C66"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            5.55454e-008
	Radius          55.8135
	InertiaMoment   0.398268

	Oblateness      0.00155258

	RotationPeriod  138.323
	Obliquity       324.326
	EqAscendNode    148.361
	//Precession      0

	AbsMagn         0.897483
	SlopeParam      4.52377
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.744 0.741 0.739)

	Surface
	{
		SurfStyle       0.780249
		OceanStyle      0.435929
		Randomize      (0.577, -0.817, -0.532)
		colorDistMagn   0.745416
		colorDistFreq   2.22707
		detailScale     1524.08
		colorConversion true
		snowLevel       2
		tropicLatitude  0.57242
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.452729
		terraceProb     0.462245
		erosion         0
		montesMagn      0.370564
		montesFreq      2.86374
		montesSpiky     0.823807
		montesFraction  0.551418
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.9608
		hillsFraction   0.603909
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218555
		craterFreq      0.268745
		craterDensity   0.893815
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.573537
		volcanoTemp     1979.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.290, 0.252, 0.207, 0.000)
		colorShelf     (0.297, 0.259, 0.237, 0.000)
		colorBeach     (0.350, 0.304, 0.281, 0.000)
		colorDesert    (0.379, 0.326, 0.274, 0.000)
		colorLowland   (0.416, 0.348, 0.311, 0.000)
		colorUpland    (0.461, 0.423, 0.377, 0.000)
		colorRock      (0.498, 0.460, 0.407, 0.000)
		colorSnow      (0.543, 0.489, 0.429, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.9684
		GasToDust   0.25
		Particles   2936
		GasBright   0.0567345
		DustBright  0.824036
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   406.516
		Period          2105.93
		Eccentricity    0.517462
		Inclination     157.923
		AscendingNode   107.847
		ArgOfPericenter 157.43
		MeanAnomaly     -116.999
	}
}

Comet	"C67"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            1.71029e-015
	Radius          0.160009
	InertiaMoment   0.399925

	Oblateness      0.00164577

	RotationPeriod  117.892
	Obliquity       277.532
	EqAscendNode    132.938
	//Precession      0

	AbsMagn         10.0128
	SlopeParam      5.13829
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.754 0.652 0.557)

	Surface
	{
		SurfStyle       0.274861
		OceanStyle      0.797204
		Randomize      (0.031, -0.812, 0.480)
		colorDistMagn   0.935496
		colorDistFreq   3.48375e-006
		detailScale     4.36931
		colorConversion true
		snowLevel       2
		tropicLatitude  0.515308
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.529485
		terraceProb     0.427032
		erosion         0
		montesMagn      0.578841
		montesFreq      2.94577
		montesSpiky     0.858732
		montesFraction  0.100811
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.27421e-005
		hillsFraction   0.425902
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.202736
		craterFreq      0.185467
		craterDensity   0.935809
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.495654
		volcanoTemp     1215.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.302, 0.261, 0.223, 0.000)
		colorShelf     (0.320, 0.277, 0.237, 0.000)
		colorBeach     (0.339, 0.293, 0.251, 0.000)
		colorDesert    (0.358, 0.310, 0.264, 0.000)
		colorLowland   (0.377, 0.326, 0.278, 0.000)
		colorUpland    (0.396, 0.342, 0.292, 0.000)
		colorRock      (0.415, 0.358, 0.306, 0.000)
		colorSnow      (0.434, 0.375, 0.320, 1.000)
		BumpHeight      0.144008
		BumpOffset      0.0288016
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0388422
		GasToDust   0.25
		Particles   1058
		GasBright   0.0697866
		DustBright  0.49547
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   511.237
		Period          2970.03
		Eccentricity    0.675452
		Inclination     105.023
		AscendingNode   -149.268
		ArgOfPericenter -141.862
		MeanAnomaly     -37.909
	}
}

Comet	"C68"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            1.32278e-011
	Radius          3.45671
	InertiaMoment   0.398815

	Oblateness      0.00251765

	RotationPeriod  108.602
	Obliquity       230.737
	EqAscendNode    117.516
	//Precession      0

	AbsMagn         6.51084
	SlopeParam      5.88825
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.670 0.666 0.661)

	Surface
	{
		SurfStyle       0.13967
		OceanStyle      0.132298
		Randomize      (0.676, -0.185, 0.374)
		colorDistMagn   0.170109
		colorDistFreq   0.00873043
		detailScale     94.3913
		colorConversion true
		snowLevel       2
		tropicLatitude  0.229927
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.427272
		terraceProb     0.410757
		erosion         0
		montesMagn      0.659171
		montesFreq      3.52354
		montesSpiky     0.959977
		montesFraction  0.478201
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0199891
		hillsFraction   0.878879
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230997
		craterFreq      0.233428
		craterDensity   0.751923
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.403141
		volcanoTemp     1349.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.268, 0.266, 0.264, 0.000)
		colorShelf     (0.285, 0.283, 0.281, 0.000)
		colorBeach     (0.301, 0.300, 0.297, 0.000)
		colorDesert    (0.318, 0.316, 0.314, 0.000)
		colorLowland   (0.335, 0.333, 0.330, 0.000)
		colorUpland    (0.352, 0.350, 0.347, 0.000)
		colorRock      (0.368, 0.366, 0.363, 0.000)
		colorSnow      (0.385, 0.383, 0.380, 1.000)
		BumpHeight      3.11104
		BumpOffset      0.622208
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.520034
		GasToDust   0.25
		Particles   2030
		GasBright   0.0455795
		DustBright  0.204164
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   393.48
		Period          2005.45
		Eccentricity    0.559862
		Inclination     44.0714
		AscendingNode   164.324
		ArgOfPericenter -13.0936
		MeanAnomaly     -142.94
	}
}

Comet	"C69"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            1.02308e-007
	Radius          62.5216
	InertiaMoment   0.397026

	Oblateness      0.00216169

	RotationPeriod  102.169
	Obliquity       183.943
	EqAscendNode    102.093
	//Precession      0

	AbsMagn         -0.471892
	SlopeParam      7.10158
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.645 0.640 0.637)

	Surface
	{
		SurfStyle       0.544642
		OceanStyle      0.689878
		Randomize      (0.088, -0.446, -0.329)
		colorDistMagn   0.232004
		colorDistFreq   3.11964
		detailScale     1707.26
		colorConversion true
		snowLevel       2
		tropicLatitude  0.365461
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.633366
		terraceProb     0.245206
		erosion         0
		montesMagn      0.612214
		montesFreq      3.58721
		montesSpiky     0.993177
		montesFraction  0.58513
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.26416
		hillsFraction   0.727879
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.185765
		craterFreq      0.244861
		craterDensity   0.828352
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.436566
		volcanoTemp     1907.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.251, 0.218, 0.178, 0.000)
		colorShelf     (0.258, 0.224, 0.204, 0.000)
		colorBeach     (0.303, 0.262, 0.242, 0.000)
		colorDesert    (0.329, 0.282, 0.236, 0.000)
		colorLowland   (0.361, 0.301, 0.268, 0.000)
		colorUpland    (0.400, 0.365, 0.325, 0.000)
		colorRock      (0.432, 0.397, 0.351, 0.000)
		colorSnow      (0.471, 0.422, 0.370, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.177354
		DustBright  0.556877
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   598.347
		Period          3760.6
		Eccentricity    0.743131
		Inclination     18.7715
		AscendingNode   -51.613
		ArgOfPericenter 34.1831
		MeanAnomaly     -68.1465
	}
}

Comet	"C70"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            3.15014e-015
	Radius          0.214087
	InertiaMoment   0.399285

	Oblateness      0.00314647

	RotationPeriod  97.1121
	Obliquity       137.149
	EqAscendNode    86.6704
	//Precession      0

	AbsMagn         9.77933
	SlopeParam      2.38893
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.741 0.739 0.738)

	Surface
	{
		SurfStyle       0.875164
		OceanStyle      0.097127
		Randomize      (0.298, -0.343, -0.709)
		colorDistMagn   0.834674
		colorDistFreq   2.86699e-005
		detailScale     5.84599
		colorConversion true
		snowLevel       2
		tropicLatitude  0.660545
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.698403
		terraceProb     0.583306
		erosion         0
		montesMagn      0.565451
		montesFreq      3.72053
		montesSpiky     0.973638
		montesFraction  0.21447
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000105082
		hillsFraction   0.402987
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2709
		craterFreq      0.151713
		craterDensity   0.873593
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.526446
		volcanoTemp     1408.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.252, 0.258, 0.295, 0.050)
		colorShelf     (0.296, 0.303, 0.339, 0.040)
		colorBeach     (0.341, 0.347, 0.384, 0.030)
		colorDesert    (0.385, 0.391, 0.435, 0.020)
		colorLowland   (0.430, 0.436, 0.479, 0.030)
		colorUpland    (0.474, 0.480, 0.524, 0.050)
		colorRock      (0.519, 0.524, 0.583, 0.020)
		colorSnow      (0.519, 0.524, 0.583, 1.000)
		BumpHeight      0.192678
		BumpOffset      0.0385356
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0716682
		GasToDust   0.25
		Particles   1124
		GasBright   0.125864
		DustBright  0.292852
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   517.019
		Period          3020.56
		Eccentricity    0.795956
		Inclination     -131.264
		AscendingNode   58.479
		ArgOfPericenter -127.48
		MeanAnomaly     -3.84677
	}
}

Comet	"C71"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            2.4364e-011
	Radius          3.87179
	InertiaMoment   0.397945

	Oblateness      0.00261793

	RotationPeriod  92.8727
	Obliquity       90.3545
	EqAscendNode    71.2478
	//Precession      0

	AbsMagn         6.28475
	SlopeParam      3.07763
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.530 0.421 0.324)

	Surface
	{
		SurfStyle       0.434551
		OceanStyle      0.422483
		Randomize      (-0.274, 0.553, 0.513)
		colorDistMagn   0.478646
		colorDistFreq   0.0104309
		detailScale     105.726
		colorConversion true
		snowLevel       2
		tropicLatitude  0.99809
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.427794
		terraceProb     0.347953
		erosion         0
		montesMagn      0.555686
		montesFreq      3.0493
		montesSpiky     0.810224
		montesFraction  0.738776
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0265604
		hillsFraction   0.47579
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238808
		craterFreq      0.260481
		craterDensity   1.00773
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.470297
		volcanoTemp     1429.33
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.212, 0.168, 0.130, 0.000)
		colorShelf     (0.225, 0.179, 0.138, 0.000)
		colorBeach     (0.238, 0.189, 0.146, 0.000)
		colorDesert    (0.252, 0.200, 0.154, 0.000)
		colorLowland   (0.265, 0.211, 0.162, 0.000)
		colorUpland    (0.278, 0.221, 0.170, 0.000)
		colorRock      (0.291, 0.232, 0.178, 0.000)
		colorSnow      (0.305, 0.242, 0.186, 1.000)
		BumpHeight      3.48461
		BumpOffset      0.696921
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.55286
		GasToDust   0.25
		Particles   2096
		GasBright   0.324829
		DustBright  0.578374
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   258.221
		Period          1066.14
		Eccentricity    0.519119
		Inclination     6.8104
		AscendingNode   124.947
		ArgOfPericenter -117.719
		MeanAnomaly     163.299
	}
}

Comet	"C72"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            1.88438e-007
	Radius          83.66
	InertiaMoment   0.399717

	Oblateness      0.00372824

	RotationPeriod  89.1781
	Obliquity       43.5602
	EqAscendNode    55.8252
	//Precession      0

	AbsMagn         17.1233
	SlopeParam      3.66968
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.621 0.615 0.614)

	Surface
	{
		SurfStyle       0.666529
		OceanStyle      0.173373
		Randomize      (0.623, -0.726, -0.637)
		colorDistMagn   0.717469
		colorDistFreq   1.88653
		detailScale     2284.48
		colorConversion true
		snowLevel       2
		tropicLatitude  0.351768
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.66215
		terraceProb     0.224798
		erosion         0
		montesMagn      0.434081
		montesFreq      2.05806
		montesSpiky     0.940298
		montesFraction  0.874672
		dunesFraction   0
		hillsMagn       0
		hillsFreq       19.6091
		hillsFraction   0.556115
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235676
		craterFreq      0.224589
		craterDensity   0.899314
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.497244
		volcanoTemp     1637.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.242, 0.209, 0.172, 0.000)
		colorShelf     (0.248, 0.215, 0.196, 0.000)
		colorBeach     (0.292, 0.252, 0.233, 0.000)
		colorDesert    (0.317, 0.271, 0.227, 0.000)
		colorLowland   (0.348, 0.289, 0.258, 0.000)
		colorUpland    (0.385, 0.351, 0.313, 0.000)
		colorRock      (0.416, 0.382, 0.337, 0.000)
		colorSnow      (0.453, 0.406, 0.356, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.246058
		DustBright  0.341632
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   454.498
		Period          2489.57
		Eccentricity    0.780944
		Inclination     -39.181
		AscendingNode   -30.6943
		ArgOfPericenter -176.675
		MeanAnomaly     -14.0952
	}
}

Comet	"C73"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            5.80214e-015
	Radius          0.239766
	InertiaMoment   0.398559

	Oblateness      0.00306062

	RotationPeriod  85.8729
	Obliquity       356.766
	EqAscendNode    40.4026
	//Precession      0

	AbsMagn         9.55177
	SlopeParam      4.23358
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.744 0.656 0.581)

	Surface
	{
		SurfStyle       0.436063
		OceanStyle      0.26313
		Randomize      (0.330, -0.951, -0.642)
		colorDistMagn   0.323861
		colorDistFreq   3.41722e-005
		detailScale     6.5472
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998147
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.337065
		terraceProb     0.465916
		erosion         0
		montesMagn      0.419846
		montesFreq      2.94293
		montesSpiky     0.913201
		montesFraction  0.621326
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000155595
		hillsFraction   0.531739
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230172
		craterFreq      0.189357
		craterDensity   0.922016
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.495921
		volcanoTemp     1350.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.298, 0.263, 0.232, 0.000)
		colorShelf     (0.316, 0.279, 0.247, 0.000)
		colorBeach     (0.335, 0.295, 0.261, 0.000)
		colorDesert    (0.353, 0.312, 0.276, 0.000)
		colorLowland   (0.372, 0.328, 0.291, 0.000)
		colorUpland    (0.391, 0.345, 0.305, 0.000)
		colorRock      (0.409, 0.361, 0.320, 0.000)
		colorSnow      (0.428, 0.377, 0.334, 1.000)
		BumpHeight      0.215789
		BumpOffset      0.0431578
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.104494
		GasToDust   0.25
		Particles   1190
		GasBright   0.130027
		DustBright  0.142149
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   565.043
		Period          3451.03
		Eccentricity    0.734133
		Inclination     -94.6603
		AscendingNode   111.128
		ArgOfPericenter 103.284
		MeanAnomaly     127.301
	}
}

Comet	"C74"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            4.48754e-011
	Radius          5.18142
	InertiaMoment   0.396156

	Oblateness      0.004251

	RotationPeriod  82.8595
	Obliquity       309.972
	EqAscendNode    24.98
	//Precession      0

	AbsMagn         6.05304
	SlopeParam      4.81709
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.407 0.403 0.396)

	Surface
	{
		SurfStyle       0.433665
		OceanStyle      0.835492
		Randomize      (-0.524, -0.508, -0.502)
		colorDistMagn   0.917154
		colorDistFreq   0.0207926
		detailScale     141.487
		colorConversion true
		snowLevel       2
		tropicLatitude  0.949782
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.512839
		terraceProb     0.301769
		erosion         0
		montesMagn      0.424312
		montesFreq      3.1487
		montesSpiky     0.967154
		montesFraction  0.624234
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.064512
		hillsFraction   0.900948
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246086
		craterFreq      0.227051
		craterDensity   0.747274
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.417516
		volcanoTemp     1805.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.163, 0.161, 0.159, 0.000)
		colorShelf     (0.173, 0.171, 0.169, 0.000)
		colorBeach     (0.183, 0.181, 0.178, 0.000)
		colorDesert    (0.193, 0.191, 0.188, 0.000)
		colorLowland   (0.203, 0.201, 0.198, 0.000)
		colorUpland    (0.214, 0.211, 0.208, 0.000)
		colorRock      (0.224, 0.222, 0.218, 0.000)
		colorSnow      (0.234, 0.232, 0.228, 1.000)
		BumpHeight      4.66328
		BumpOffset      0.932656
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.585686
		GasToDust   0.25
		Particles   2163
		GasBright   0.0278276
		DustBright  0.728835
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   367.13
		Period          1807.41
		Eccentricity    0.726372
		Inclination     59.1502
		AscendingNode   -91.4377
		ArgOfPericenter -176.917
		MeanAnomaly     116.912
	}
}

Comet	"C75"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            3.47079e-007
	Radius          93.6821
	InertiaMoment   0.399059

	Oblateness      0.00351674

	RotationPeriod  80.0724
	Obliquity       263.177
	EqAscendNode    9.55743
	//Precession      0

	AbsMagn         15.4038
	SlopeParam      5.48191
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.424 0.420 0.413)

	Surface
	{
		SurfStyle       0.208135
		OceanStyle      0.0662728
		Randomize      (-0.167, 0.666, -0.309)
		colorDistMagn   0.340205
		colorDistFreq   7.30587
		detailScale     2558.15
		colorConversion true
		snowLevel       2
		tropicLatitude  0.945219
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.618998
		terraceProb     0.122334
		erosion         0
		montesMagn      0.304383
		montesFreq      2.97771
		montesSpiky     0.926934
		montesFraction  0.349948
		dunesFraction   0
		hillsMagn       0
		hillsFreq       27.9231
		hillsFraction   0.607021
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.211146
		craterFreq      0.25394
		craterDensity   0.85397
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.401934
		volcanoTemp     1231.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.169, 0.168, 0.165, 0.000)
		colorShelf     (0.180, 0.178, 0.175, 0.000)
		colorBeach     (0.191, 0.189, 0.186, 0.000)
		colorDesert    (0.201, 0.199, 0.196, 0.000)
		colorLowland   (0.212, 0.210, 0.206, 0.000)
		colorUpland    (0.222, 0.220, 0.217, 0.000)
		colorRock      (0.233, 0.231, 0.227, 0.000)
		colorSnow      (0.244, 0.241, 0.237, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0422718
		DustBright  0.398878
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   347.039
		Period          1661.1
		Eccentricity    0.800488
		Inclination     113.96
		AscendingNode   -114.39
		ArgOfPericenter 110.292
		MeanAnomaly     -132.285
	}
}

Comet	"C76"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            1.06868e-014
	Radius          0.320909
	InertiaMoment   0.397556

	Oblateness      0.0048775

	RotationPeriod  77.4655
	Obliquity       216.383
	EqAscendNode    354.135
	//Precession      0

	AbsMagn         9.32914
	SlopeParam      6.37735
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.669 0.666 0.661)

	Surface
	{
		SurfStyle       0.211452
		OceanStyle      0.850859
		Randomize      (-0.792, 0.645, -0.683)
		colorDistMagn   0.552928
		colorDistFreq   7.60527e-005
		detailScale     8.76297
		colorConversion true
		snowLevel       2
		tropicLatitude  0.593488
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.441446
		terraceProb     0.294615
		erosion         0
		montesMagn      0.540303
		montesFreq      3.53484
		montesSpiky     0.939405
		montesFraction  0.541951
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000198565
		hillsFraction   0.70788
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.204929
		craterFreq      0.195326
		craterDensity   0.82248
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.474551
		volcanoTemp     1619.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.268, 0.266, 0.264, 0.000)
		colorShelf     (0.284, 0.283, 0.281, 0.000)
		colorBeach     (0.301, 0.300, 0.297, 0.000)
		colorDesert    (0.318, 0.316, 0.314, 0.000)
		colorLowland   (0.334, 0.333, 0.330, 0.000)
		colorUpland    (0.351, 0.350, 0.347, 0.000)
		colorRock      (0.368, 0.366, 0.363, 0.000)
		colorSnow      (0.385, 0.383, 0.380, 1.000)
		BumpHeight      0.288818
		BumpOffset      0.0577637
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.13732
		GasToDust   0.25
		Particles   1257
		GasBright   0.143351
		DustBright  0.782285
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   509.389
		Period          2953.94
		Eccentricity    0.776068
		Inclination     -129.94
		AscendingNode   129.289
		ArgOfPericenter 100.97
		MeanAnomaly     123.886
	}
}

Comet	"C77"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            8.2655e-011
	Radius          5.80124
	InertiaMoment   0.399507

	Oblateness      0.00400322

	RotationPeriod  75.0046
	Obliquity       169.589
	EqAscendNode    338.712
	//Precession      0

	AbsMagn         5.81461
	SlopeParam      9.12352
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.757 0.753 0.750)

	Surface
	{
		SurfStyle       0.52922
		OceanStyle      0.737746
		Randomize      (-0.687, -0.878, -0.886)
		colorDistMagn   0.938718
		colorDistFreq   0.024885
		detailScale     158.412
		colorConversion true
		snowLevel       2
		tropicLatitude  0.143451
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.539589
		terraceProb     0.427026
		erosion         0
		montesMagn      0.59119
		montesFreq      1.74187
		montesSpiky     0.897545
		montesFraction  0.330391
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0959109
		hillsFraction   0.765112
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264589
		craterFreq      0.184735
		craterDensity   0.938751
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.524935
		volcanoTemp     1284.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.295, 0.256, 0.210, 0.000)
		colorShelf     (0.303, 0.264, 0.240, 0.000)
		colorBeach     (0.356, 0.309, 0.285, 0.000)
		colorDesert    (0.386, 0.331, 0.277, 0.000)
		colorLowland   (0.424, 0.354, 0.315, 0.000)
		colorUpland    (0.469, 0.429, 0.382, 0.000)
		colorRock      (0.507, 0.467, 0.412, 0.000)
		colorSnow      (0.553, 0.497, 0.435, 1.000)
		BumpHeight      5.22111
		BumpOffset      1.04422
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.618512
		GasToDust   0.25
		Particles   2229
		GasBright   0.130513
		DustBright  0.47961
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   609.245
		Period          3863.8
		Eccentricity    0.870017
		Inclination     -175.498
		AscendingNode   49.7995
		ArgOfPericenter 20.6056
		MeanAnomaly     -23.231
	}
}

Comet	"C78"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            6.39276e-007
	Radius          125.406
	InertiaMoment   0.398276

	Oblateness      0.00554519

	RotationPeriod  72.664
	Obliquity       122.794
	EqAscendNode    323.29
	//Precession      0

	AbsMagn         14.4696
	SlopeParam      2.74719
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.689 0.609 0.531)

	Surface
	{
		SurfStyle       0.120947
		OceanStyle      0.529404
		Randomize      (0.850, 0.550, 0.232)
		colorDistMagn   0.0354567
		colorDistFreq   11.903
		detailScale     3424.42
		colorConversion true
		snowLevel       2
		tropicLatitude  0.898161
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.428238
		terraceProb     0.142272
		erosion         0
		montesMagn      0.353146
		montesFreq      3.364
		montesSpiky     0.992415
		montesFraction  0.710111
		dunesFraction   0
		hillsMagn       0
		hillsFreq       50.2489
		hillsFraction   0.567571
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244821
		craterFreq      0.468414
		craterDensity   0.976228
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.500028
		volcanoTemp     1213.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.275, 0.243, 0.212, 0.000)
		colorShelf     (0.293, 0.259, 0.226, 0.000)
		colorBeach     (0.310, 0.274, 0.239, 0.000)
		colorDesert    (0.327, 0.289, 0.252, 0.000)
		colorLowland   (0.344, 0.304, 0.266, 0.000)
		colorUpland    (0.362, 0.319, 0.279, 0.000)
		colorRock      (0.379, 0.335, 0.292, 0.000)
		colorSnow      (0.396, 0.350, 0.305, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0804159
		DustBright  0.214193
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   419.997
		Period          2211.55
		Eccentricity    0.579899
		Inclination     -172.541
		AscendingNode   -153.175
		ArgOfPericenter -15.2216
		MeanAnomaly     117.292
	}
}

Comet	"C79"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            1.96837e-014
	Radius          0.359234
	InertiaMoment   0.39993

	Oblateness      0.00453498

	RotationPeriod  70.4232
	Obliquity       76.0002
	EqAscendNode    307.867
	//Precession      0

	AbsMagn         9.11055
	SlopeParam      3.37643
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.478 0.473 0.468)

	Surface
	{
		SurfStyle       0.660248
		OceanStyle      0.159533
		Randomize      (-0.693, 0.210, 0.699)
		colorDistMagn   0.551456
		colorDistFreq   3.2488e-005
		detailScale     9.80948
		colorConversion true
		snowLevel       2
		tropicLatitude  0.873181
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.456328
		terraceProb     0.335617
		erosion         0
		montesMagn      0.537836
		montesFreq      2.48635
		montesSpiky     0.928381
		montesFraction  0.453967
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000264776
		hillsFraction   0.612757
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236886
		craterFreq      0.264806
		craterDensity   0.815877
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.491786
		volcanoTemp     1601.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.186, 0.161, 0.131, 0.000)
		colorShelf     (0.191, 0.165, 0.150, 0.000)
		colorBeach     (0.225, 0.194, 0.178, 0.000)
		colorDesert    (0.244, 0.208, 0.173, 0.000)
		colorLowland   (0.268, 0.222, 0.196, 0.000)
		colorUpland    (0.296, 0.269, 0.238, 0.000)
		colorRock      (0.320, 0.293, 0.257, 0.000)
		colorSnow      (0.349, 0.312, 0.271, 1.000)
		BumpHeight      0.323311
		BumpOffset      0.0646621
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.170146
		GasToDust   0.25
		Particles   1323
		GasBright   0.258662
		DustBright  0.520434
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   539.446
		Period          3219.2
		Eccentricity    0.751726
		Inclination     132.353
		AscendingNode   155.094
		ArgOfPericenter 150.182
		MeanAnomaly     62.9513
	}
}

Comet	"C80"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            1.5224e-010
	Radius          7.76705
	InertiaMoment   0.398821

	Oblateness      0.00628066

	RotationPeriod  68.2662
	Obliquity       29.2059
	EqAscendNode    292.444
	//Precession      0

	AbsMagn         5.56813
	SlopeParam      3.94825
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.476 0.379 0.328)

	Surface
	{
		SurfStyle       0.511743
		OceanStyle      0.471739
		Randomize      (-0.151, 0.285, -0.343)
		colorDistMagn   0.124454
		colorDistFreq   0.0399162
		detailScale     212.092
		colorConversion true
		snowLevel       2
		tropicLatitude  0.983796
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.455704
		terraceProb     0.305452
		erosion         0
		montesMagn      0.532422
		montesFreq      2.79283
		montesSpiky     0.997132
		montesFraction  0.702239
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0949986
		hillsFraction   0.662735
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244074
		craterFreq      0.251277
		craterDensity   0.790718
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.485299
		volcanoTemp     1343.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.186, 0.129, 0.092, 0.000)
		colorShelf     (0.190, 0.133, 0.105, 0.000)
		colorBeach     (0.224, 0.155, 0.125, 0.000)
		colorDesert    (0.243, 0.167, 0.121, 0.000)
		colorLowland   (0.267, 0.178, 0.138, 0.000)
		colorUpland    (0.295, 0.216, 0.167, 0.000)
		colorRock      (0.319, 0.235, 0.181, 0.000)
		colorSnow      (0.348, 0.250, 0.190, 1.000)
		BumpHeight      6.99034
		BumpOffset      1.39807
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.651338
		GasToDust   0.25
		Particles   2295
		GasBright   0.181283
		DustBright  0.282299
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   376.888
		Period          1879.94
		Eccentricity    0.678107
		Inclination     -104.583
		AscendingNode   32.3199
		ArgOfPericenter 16.6168
		MeanAnomaly     7.49082
	}
}

Comet	"C81"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            4.68758e-018
	Radius          0.0222448
	InertiaMoment   0.397042

	Oblateness      0.00506486

	RotationPeriod  66.1796
	Obliquity       342.412
	EqAscendNode    277.022
	//Precession      0

	AbsMagn         13.795
	SlopeParam      4.51578
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.547 0.477 0.341)

	Surface
	{
		SurfStyle       0.157748
		OceanStyle      0.271165
		Randomize      (-0.343, 0.864, -0.367)
		colorDistMagn   0.818311
		colorDistFreq   3.68317e-007
		detailScale     0.607431
		colorConversion true
		snowLevel       2
		tropicLatitude  0.724143
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.529569
		terraceProb     0.692337
		erosion         0
		montesMagn      0.399936
		montesFreq      2.88985
		montesSpiky     0.943367
		montesFraction  0.580982
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.26385e-007
		hillsFraction   0.837055
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257428
		craterFreq      0.158886
		craterDensity   0.785134
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.450213
		volcanoTemp     1546.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.219, 0.191, 0.136, 0.000)
		colorShelf     (0.233, 0.203, 0.145, 0.000)
		colorBeach     (0.246, 0.215, 0.153, 0.000)
		colorDesert    (0.260, 0.227, 0.162, 0.000)
		colorLowland   (0.274, 0.239, 0.170, 0.000)
		colorUpland    (0.287, 0.250, 0.179, 0.000)
		colorRock      (0.301, 0.262, 0.187, 0.000)
		colorSnow      (0.315, 0.274, 0.196, 1.000)
		BumpHeight      0.0200203
		BumpOffset      0.00400406
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.42672
		DustBright  0.521349
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   554.703
		Period          3356.74
		Eccentricity    0.693351
		Inclination     150.283
		AscendingNode   22.6511
		ArgOfPericenter 170.586
		MeanAnomaly     31.4039
	}
}

Comet	"C82"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            3.6255e-014
	Radius          0.481057
	InertiaMoment   0.39929

	Oblateness      0.00710778

	RotationPeriod  64.1525
	Obliquity       295.617
	EqAscendNode    261.599
	//Precession      0

	AbsMagn         8.89523
	SlopeParam      5.12923
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.428 0.423 0.417)

	Surface
	{
		SurfStyle       0.273169
		OceanStyle      0.223122
		Randomize      (-0.500, 0.740, 0.919)
		colorDistMagn   0.369835
		colorDistFreq   9.2873e-005
		detailScale     13.1361
		colorConversion true
		snowLevel       2
		tropicLatitude  0.974291
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.26324
		terraceProb     0.330308
		erosion         0
		montesMagn      0.435953
		montesFreq      2.9035
		montesSpiky     0.961442
		montesFraction  0.408769
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000525087
		hillsFraction   0.760947
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249568
		craterFreq      0.273896
		craterDensity   0.801288
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.409277
		volcanoTemp     1307.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.171, 0.169, 0.167, 0.000)
		colorShelf     (0.182, 0.180, 0.177, 0.000)
		colorBeach     (0.193, 0.190, 0.188, 0.000)
		colorDesert    (0.203, 0.201, 0.198, 0.000)
		colorLowland   (0.214, 0.212, 0.209, 0.000)
		colorUpland    (0.225, 0.222, 0.219, 0.000)
		colorRock      (0.236, 0.233, 0.230, 0.000)
		colorSnow      (0.246, 0.243, 0.240, 1.000)
		BumpHeight      0.432951
		BumpOffset      0.0865902
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.202972
		GasToDust   0.25
		Particles   1389
		GasBright   0.00578076
		DustBright  0.626775
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   514.426
		Period          2997.86
		Eccentricity    0.634738
		Inclination     13.2413
		AscendingNode   -161.246
		ArgOfPericenter 131.118
		MeanAnomaly     -58.6217
	}
}

Comet	"C83"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            2.80407e-010
	Radius          8.69104
	InertiaMoment   0.397953

	Oblateness      0.00574057

	RotationPeriod  62.1753
	Obliquity       248.823
	EqAscendNode    246.177
	//Precession      0

	AbsMagn         5.31206
	SlopeParam      5.87624
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.686 0.683 0.680)

	Surface
	{
		SurfStyle       0.579635
		OceanStyle      0.74782
		Randomize      (-0.842, 0.654, -0.995)
		colorDistMagn   0.395701
		colorDistFreq   0.046154
		detailScale     237.323
		colorConversion true
		snowLevel       2
		tropicLatitude  0.945894
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.596657
		terraceProb     0.431774
		erosion         0
		montesMagn      0.437496
		montesFreq      2.30133
		montesSpiky     0.982727
		montesFraction  0.83891
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.113064
		hillsFraction   0.559559
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255861
		craterFreq      0.18019
		craterDensity   0.913662
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.477858
		volcanoTemp     1426.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.267, 0.232, 0.190, 0.000)
		colorShelf     (0.274, 0.239, 0.218, 0.000)
		colorBeach     (0.322, 0.280, 0.258, 0.000)
		colorDesert    (0.350, 0.300, 0.252, 0.000)
		colorLowland   (0.384, 0.321, 0.286, 0.000)
		colorUpland    (0.425, 0.389, 0.347, 0.000)
		colorRock      (0.459, 0.423, 0.374, 0.000)
		colorSnow      (0.501, 0.451, 0.394, 1.000)
		BumpHeight      7.82194
		BumpOffset      1.56439
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.684164
		GasToDust   0.25
		Particles   2361
		GasBright   0.0216172
		DustBright  0.295425
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   521.035
		Period          3055.81
		Eccentricity    0.762021
		Inclination     164.781
		AscendingNode   95.6515
		ArgOfPericenter 88.442
		MeanAnomaly     -143.187
	}
}

Comet	"C84"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            8.63394e-018
	Radius          0.0297947
	InertiaMoment   0.399723

	Oblateness      0.00805531

	RotationPeriod  60.24
	Obliquity       202.029
	EqAscendNode    230.754
	//Precession      0

	AbsMagn         13.2539
	SlopeParam      7.07615
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.704 0.701 0.701)

	Surface
	{
		SurfStyle       0.836416
		OceanStyle      0.557985
		Randomize      (0.420, 0.912, 0.097)
		colorDistMagn   0.89776
		colorDistFreq   7.54631e-007
		detailScale     0.813593
		colorConversion true
		snowLevel       2
		tropicLatitude  0.698675
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.607579
		terraceProb     0.43691
		erosion         0
		montesMagn      0.508606
		montesFreq      3.66413
		montesSpiky     0.894446
		montesFraction  0.621088
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.8026e-006
		hillsFraction   0.622338
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253701
		craterFreq      0.180793
		craterDensity   0.707122
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.412682
		volcanoTemp     1488.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.274, 0.238, 0.196, 0.000)
		colorShelf     (0.281, 0.245, 0.224, 0.000)
		colorBeach     (0.331, 0.288, 0.266, 0.000)
		colorDesert    (0.359, 0.309, 0.259, 0.000)
		colorLowland   (0.394, 0.330, 0.294, 0.000)
		colorUpland    (0.436, 0.400, 0.357, 0.000)
		colorRock      (0.471, 0.435, 0.385, 0.000)
		colorSnow      (0.514, 0.463, 0.406, 1.000)
		BumpHeight      0.0268152
		BumpOffset      0.00536304
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.101978
		DustBright  0.699551
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   529.327
		Period          3129.05
		Eccentricity    0.738249
		Inclination     23.0534
		AscendingNode   -20.5501
		ArgOfPericenter 16.1384
		MeanAnomaly     -48.4729
	}
}

Comet	"C85"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            6.67774e-014
	Radius          0.538156
	InertiaMoment   0.398565

	Oblateness      0.00651524

	RotationPeriod  58.3394
	Obliquity       155.234
	EqAscendNode    215.332
	//Precession      0

	AbsMagn         8.68247
	SlopeParam      2.37824
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.726 0.723 0.718)

	Surface
	{
		SurfStyle       0.999781
		OceanStyle      0.372395
		Randomize      (0.297, -0.526, -0.800)
		colorDistMagn   0.877045
		colorDistFreq   0.000183616
		detailScale     14.6952
		colorConversion true
		snowLevel       2
		tropicLatitude  0.701387
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.266136
		terraceProb     0.126956
		erosion         0
		montesMagn      0.343769
		montesFreq      3.14047
		montesSpiky     0.976519
		montesFraction  0.501385
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000728249
		hillsFraction   0.709919
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241008
		craterFreq      0.205498
		craterDensity   1.0126
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.438156
		volcanoTemp     1349.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.247, 0.253, 0.287, 0.050)
		colorShelf     (0.290, 0.296, 0.330, 0.040)
		colorBeach     (0.334, 0.340, 0.374, 0.030)
		colorDesert    (0.377, 0.383, 0.424, 0.020)
		colorLowland   (0.421, 0.426, 0.467, 0.030)
		colorUpland    (0.464, 0.470, 0.510, 0.050)
		colorRock      (0.508, 0.513, 0.568, 0.020)
		colorSnow      (0.508, 0.513, 0.568, 1.000)
		BumpHeight      0.48434
		BumpOffset      0.096868
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.235798
		GasToDust   0.25
		Particles   1456
		GasBright   0.0905323
		DustBright  0.395483
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   412.807
		Period          2155
		Eccentricity    0.796149
		Inclination     -45.1288
		AscendingNode   104.066
		ArgOfPericenter 167.39
		MeanAnomaly     8.7965
	}
}

Comet	"C86"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            5.16475e-010
	Radius          11.6435
	InertiaMoment   0.396189

	Oblateness      0.00902602

	RotationPeriod  56.4673
	Obliquity       108.44
	EqAscendNode    199.909
	//Precession      0

	AbsMagn         5.04446
	SlopeParam      3.06904
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.812 0.760 0.700)

	Surface
	{
		SurfStyle       0.0781775
		OceanStyle      0.569968
		Randomize      (0.668, -0.962, 0.224)
		colorDistMagn   0.381827
		colorDistFreq   0.0991516
		detailScale     317.945
		colorConversion true
		snowLevel       2
		tropicLatitude  0.937278
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.505575
		terraceProb     0.394214
		erosion         0
		montesMagn      0.543065
		montesFreq      3.24061
		montesSpiky     0.961617
		montesFraction  0.45407
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.365047
		hillsFraction   0.68862
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254641
		craterFreq      0.230534
		craterDensity   0.755172
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.521358
		volcanoTemp     1554.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.325, 0.304, 0.280, 0.000)
		colorShelf     (0.345, 0.323, 0.297, 0.000)
		colorBeach     (0.366, 0.342, 0.315, 0.000)
		colorDesert    (0.386, 0.361, 0.332, 0.000)
		colorLowland   (0.406, 0.380, 0.350, 0.000)
		colorUpland    (0.427, 0.399, 0.367, 0.000)
		colorRock      (0.447, 0.418, 0.385, 0.000)
		colorSnow      (0.467, 0.437, 0.402, 1.000)
		BumpHeight      10.4791
		BumpOffset      2.09583
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.71699
		GasToDust   0.25
		Particles   2428
		GasBright   0.238083
		DustBright  0.732419
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   442.058
		Period          2388.06
		Eccentricity    0.628388
		Inclination     159.868
		AscendingNode   99.0923
		ArgOfPericenter -144.036
		MeanAnomaly     -102.174
	}
}

Comet	"C87"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            1.59027e-017
	Radius          0.0333224
	InertiaMoment   0.399065

	Oblateness      0.0074241

	RotationPeriod  54.6178
	Obliquity       61.6458
	EqAscendNode    184.486
	//Precession      0

	AbsMagn         12.7948
	SlopeParam      3.66186
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.461 0.420 0.373)

	Surface
	{
		SurfStyle       0.103968
		OceanStyle      0.832659
		Randomize      (0.135, 0.790, 0.787)
		colorDistMagn   0.0564445
		colorDistFreq   6.02696e-007
		detailScale     0.909923
		colorConversion true
		snowLevel       2
		tropicLatitude  0.966336
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.753936
		terraceProb     0.272263
		erosion         0
		montesMagn      0.550794
		montesFreq      2.94235
		montesSpiky     0.962817
		montesFraction  0.419567
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.8116e-006
		hillsFraction   0.389768
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.215234
		craterFreq      0.230697
		craterDensity   0.95905
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.510667
		volcanoTemp     1629.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.184, 0.168, 0.149, 0.000)
		colorShelf     (0.196, 0.178, 0.159, 0.000)
		colorBeach     (0.207, 0.189, 0.168, 0.000)
		colorDesert    (0.219, 0.199, 0.177, 0.000)
		colorLowland   (0.230, 0.210, 0.187, 0.000)
		colorUpland    (0.242, 0.220, 0.196, 0.000)
		colorRock      (0.253, 0.231, 0.205, 0.000)
		colorSnow      (0.265, 0.241, 0.214, 1.000)
		BumpHeight      0.0299901
		BumpOffset      0.00599803
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.199356
		DustBright  0.455633
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   489.799
		Period          2785.18
		Eccentricity    0.658906
		Inclination     -166.548
		AscendingNode   1.91972
		ArgOfPericenter 152.538
		MeanAnomaly     9.80012
	}
}

Comet	"C88"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            1.22995e-013
	Radius          0.721156
	InertiaMoment   0.397567

	Oblateness      0.0103586

	RotationPeriod  52.7856
	Obliquity       14.8515
	EqAscendNode    169.064
	//Precession      0

	AbsMagn         8.47163
	SlopeParam      4.22581
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.510 0.415 0.334)

	Surface
	{
		SurfStyle       0.251395
		OceanStyle      0.137873
		Randomize      (0.993, -0.781, -0.121)
		colorDistMagn   0.315275
		colorDistFreq   0.000432806
		detailScale     19.6924
		colorConversion true
		snowLevel       2
		tropicLatitude  0.927397
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.385347
		terraceProb     0.466634
		erosion         0
		montesMagn      0.651832
		montesFreq      3.0779
		montesSpiky     0.997087
		montesFraction  0.631994
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00139209
		hillsFraction   0.682794
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.208008
		craterFreq      0.212159
		craterDensity   1.08208
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.458305
		volcanoTemp     1500.09
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.204, 0.166, 0.134, 0.000)
		colorShelf     (0.217, 0.176, 0.142, 0.000)
		colorBeach     (0.229, 0.187, 0.150, 0.000)
		colorDesert    (0.242, 0.197, 0.159, 0.000)
		colorLowland   (0.255, 0.207, 0.167, 0.000)
		colorUpland    (0.268, 0.218, 0.175, 0.000)
		colorRock      (0.280, 0.228, 0.184, 0.000)
		colorSnow      (0.293, 0.238, 0.192, 1.000)
		BumpHeight      0.64904
		BumpOffset      0.129808
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.268624
		GasToDust   0.25
		Particles   1522
		GasBright   0.123369
		DustBright  0.216106
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   463.898
		Period          2567.21
		Eccentricity    0.576529
		Inclination     -55.8288
		AscendingNode   -142.76
		ArgOfPericenter 17.0113
		MeanAnomaly     61.6228
	}
}

Comet	"C89"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            9.51281e-010
	Radius          13.0183
	InertiaMoment   0.399512

	Oblateness      0.00851337

	RotationPeriod  50.9657
	Obliquity       328.057
	EqAscendNode    153.641
	//Precession      0

	AbsMagn         4.76292
	SlopeParam      4.80871
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.514 0.510 0.504)

	Surface
	{
		SurfStyle       0.691545
		OceanStyle      0.847383
		Randomize      (-0.082, -0.887, -0.802)
		colorDistMagn   0.424174
		colorDistFreq   0.100448
		detailScale     355.487
		colorConversion true
		snowLevel       2
		tropicLatitude  0.97457
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.536406
		terraceProb     0.231468
		erosion         0
		montesMagn      0.662192
		montesFreq      2.56121
		montesSpiky     0.993329
		montesFraction  0.234842
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.481444
		hillsFraction   0.70722
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.27033
		craterFreq      0.244482
		craterDensity   0.722882
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.540613
		volcanoTemp     1526.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.200, 0.173, 0.141, 0.000)
		colorShelf     (0.205, 0.178, 0.161, 0.000)
		colorBeach     (0.241, 0.209, 0.191, 0.000)
		colorDesert    (0.262, 0.224, 0.186, 0.000)
		colorLowland   (0.288, 0.240, 0.212, 0.000)
		colorUpland    (0.318, 0.291, 0.257, 0.000)
		colorRock      (0.344, 0.316, 0.277, 0.000)
		colorSnow      (0.375, 0.336, 0.292, 1.000)
		BumpHeight      11.7165
		BumpOffset      2.3433
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.749816
		GasToDust   0.25
		Particles   2494
		GasBright   0.348087
		DustBright  0.475874
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   522.66
		Period          3070.12
		Eccentricity    0.82888
		Inclination     91.1178
		AscendingNode   -62.9404
		ArgOfPericenter -42.5881
		MeanAnomaly     165.483
	}
}

Comet	"C90"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            2.92906e-017
	Radius          0.044666
	InertiaMoment   0.398283

	Oblateness      0.0119508

	RotationPeriod  49.1534
	Obliquity       281.263
	EqAscendNode    138.219
	//Precession      0

	AbsMagn         12.3915
	SlopeParam      5.47177
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.847 0.798 0.733)

	Surface
	{
		SurfStyle       0.772836
		OceanStyle      0.991315
		Randomize      (-0.164, -0.911, 0.542)
		colorDistMagn   0.872636
		colorDistFreq   1.4357e-006
		detailScale     1.21968
		colorConversion true
		snowLevel       2
		tropicLatitude  0.918256
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.429952
		terraceProb     0.286452
		erosion         0
		montesMagn      0.593243
		montesFreq      2.51235
		montesSpiky     0.945832
		montesFraction  0.895675
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.87168e-006
		hillsFraction   0.581171
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220763
		craterFreq      0.247248
		craterDensity   0.904775
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.616747
		volcanoTemp     1275.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.330, 0.271, 0.205, 0.000)
		colorShelf     (0.339, 0.279, 0.235, 0.000)
		colorBeach     (0.398, 0.327, 0.279, 0.000)
		colorDesert    (0.432, 0.351, 0.271, 0.000)
		colorLowland   (0.474, 0.375, 0.308, 0.000)
		colorUpland    (0.525, 0.455, 0.374, 0.000)
		colorRock      (0.567, 0.495, 0.403, 0.000)
		colorSnow      (0.618, 0.527, 0.425, 1.000)
		BumpHeight      0.0401994
		BumpOffset      0.00803988
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.244818
		DustBright  0.26363
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   454.203
		Period          2487.15
		Eccentricity    0.750243
		Inclination     156.998
		AscendingNode   124.343
		ArgOfPericenter 36.0316
		MeanAnomaly     -127.638
	}
}

Comet	"C91"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            2.26542e-013
	Radius          0.806056
	InertiaMoment   0.399935

	Oblateness      0.00984936

	RotationPeriod  47.344
	Obliquity       234.469
	EqAscendNode    122.796
	//Precession      0

	AbsMagn         8.26209
	SlopeParam      6.36178
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.611 0.607 0.605)

	Surface
	{
		SurfStyle       0.966732
		OceanStyle      0.299824
		Randomize      (-0.453, -0.873, -0.040)
		colorDistMagn   0.361474
		colorDistFreq   0.000340295
		detailScale     22.0107
		colorConversion true
		snowLevel       2
		tropicLatitude  0.548381
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.319317
		terraceProb     0.17961
		erosion         0
		montesMagn      0.39461
		montesFreq      2.82361
		montesSpiky     0.814804
		montesFraction  0.495381
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00190319
		hillsFraction   0.62699
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.216352
		craterFreq      0.187071
		craterDensity   0.900858
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.586585
		volcanoTemp     1512.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.208, 0.212, 0.242, 0.050)
		colorShelf     (0.244, 0.249, 0.278, 0.040)
		colorBeach     (0.281, 0.285, 0.315, 0.030)
		colorDesert    (0.318, 0.322, 0.357, 0.020)
		colorLowland   (0.354, 0.358, 0.393, 0.030)
		colorUpland    (0.391, 0.395, 0.430, 0.050)
		colorRock      (0.427, 0.431, 0.478, 0.020)
		colorSnow      (0.427, 0.431, 0.478, 1.000)
		BumpHeight      0.72545
		BumpOffset      0.14509
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.30145
		GasToDust   0.25
		Particles   1588
		GasBright   0.0402596
		DustBright  0.952675
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   443.164
		Period          2397.03
		Eccentricity    0.654283
		Inclination     -77.5113
		AscendingNode   -26.5817
		ArgOfPericenter 13.4131
		MeanAnomaly     -12.3895
	}
}

Comet	"C92"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            1.75214e-009
	Radius          17.4553
	InertiaMoment   0.398828

	Oblateness      0.0139235

	RotationPeriod  45.533
	Obliquity       187.674
	EqAscendNode    107.373
	//Precession      0

	AbsMagn         4.46435
	SlopeParam      8.94099
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.746 0.710 0.641)

	Surface
	{
		SurfStyle       0.252875
		OceanStyle      0.323436
		Randomize      (0.754, -0.344, 0.070)
		colorDistMagn   0.743713
		colorDistFreq   0.263629
		detailScale     476.646
		colorConversion true
		snowLevel       2
		tropicLatitude  0.279901
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.541019
		terraceProb     0.102702
		erosion         0
		montesMagn      0.445225
		montesFreq      3.25089
		montesSpiky     0.931567
		montesFraction  0.650089
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.747855
		hillsFraction   0.697824
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245087
		craterFreq      0.244545
		craterDensity   0.966233
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.432412
		volcanoTemp     1344.53
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.298, 0.284, 0.256, 0.000)
		colorShelf     (0.317, 0.302, 0.272, 0.000)
		colorBeach     (0.336, 0.319, 0.288, 0.000)
		colorDesert    (0.354, 0.337, 0.304, 0.000)
		colorLowland   (0.373, 0.355, 0.320, 0.000)
		colorUpland    (0.392, 0.373, 0.336, 0.000)
		colorRock      (0.410, 0.390, 0.352, 0.000)
		colorSnow      (0.429, 0.408, 0.368, 1.000)
		BumpHeight      15.7098
		BumpOffset      3.14195
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.782642
		GasToDust   0.25
		Particles   2560
		GasBright   0.0674653
		DustBright  0.609956
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   569.26
		Period          3489.74
		Eccentricity    0.835509
		Inclination     -22.4891
		AscendingNode   -29.741
		ArgOfPericenter 150.813
		MeanAnomaly     166.726
	}
}

Comet	"C93"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            5.39497e-017
	Radius          0.0499075
	InertiaMoment   0.397058

	Oblateness      0.0113904

	RotationPeriod  43.7157
	Obliquity       140.88
	EqAscendNode    91.9508
	//Precession      0

	AbsMagn         12.0285
	SlopeParam      2.73779
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.789 0.785 0.783)

	Surface
	{
		SurfStyle       0.883321
		OceanStyle      0.995363
		Randomize      (-0.386, 0.624, -0.093)
		colorDistMagn   0.835428
		colorDistFreq   1.61824e-006
		detailScale     1.36281
		colorConversion true
		snowLevel       2
		tropicLatitude  0.775822
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.636333
		terraceProb     0.143037
		erosion         0
		montesMagn      0.419858
		montesFreq      3.00602
		montesSpiky     0.955658
		montesFraction  0.230666
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.53557e-006
		hillsFraction   0.735094
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257006
		craterFreq      0.237662
		craterDensity   0.807796
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.491296
		volcanoTemp     1690.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.268, 0.275, 0.313, 0.050)
		colorShelf     (0.316, 0.322, 0.360, 0.040)
		colorBeach     (0.363, 0.369, 0.407, 0.030)
		colorDesert    (0.410, 0.416, 0.462, 0.020)
		colorLowland   (0.457, 0.463, 0.509, 0.030)
		colorUpland    (0.505, 0.510, 0.556, 0.050)
		colorRock      (0.552, 0.557, 0.619, 0.020)
		colorSnow      (0.552, 0.557, 0.619, 1.000)
		BumpHeight      0.0449168
		BumpOffset      0.00898335
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0574118
		DustBright  0.304496
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   444.616
		Period          2408.82
		Eccentricity    0.962386
		Inclination     155.039
		AscendingNode   -74.2192
		ArgOfPericenter -158.231
		MeanAnomaly     149.445
	}
}

Comet	"C94"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            4.17263e-013
	Radius          1.08113
	InertiaMoment   0.399296

	Oblateness      0.0164442

	RotationPeriod  41.8873
	Obliquity       94.0857
	EqAscendNode    76.5282
	//Precession      0

	AbsMagn         8.05327
	SlopeParam      3.36832
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.783 0.736 0.684)

	Surface
	{
		SurfStyle       0.122575
		OceanStyle      0.00453457
		Randomize      (-0.492, 0.667, -0.301)
		colorDistMagn   0.251934
		colorDistFreq   0.000395025
		detailScale     29.5222
		colorConversion true
		snowLevel       2
		tropicLatitude  0.914003
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.345594
		terraceProb     0.118374
		erosion         0
		montesMagn      0.438726
		montesFreq      2.98677
		montesSpiky     0.909238
		montesFraction  0.598286
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00289754
		hillsFraction   0.576713
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24741
		craterFreq      0.256368
		craterDensity   0.848895
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.487075
		volcanoTemp     1691.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.313, 0.294, 0.274, 0.000)
		colorShelf     (0.333, 0.313, 0.291, 0.000)
		colorBeach     (0.352, 0.331, 0.308, 0.000)
		colorDesert    (0.372, 0.349, 0.325, 0.000)
		colorLowland   (0.391, 0.368, 0.342, 0.000)
		colorUpland    (0.411, 0.386, 0.359, 0.000)
		colorRock      (0.430, 0.405, 0.376, 0.000)
		colorSnow      (0.450, 0.423, 0.393, 1.000)
		BumpHeight      0.973021
		BumpOffset      0.194604
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.334276
		GasToDust   0.25
		Particles   1655
		GasBright   0.184245
		DustBright  0.66215
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   483.036
		Period          2727.7
		Eccentricity    0.735659
		Inclination     83.0785
		AscendingNode   -114.734
		ArgOfPericenter -26.6135
		MeanAnomaly     -19.7198
	}
}

Comet	"C95"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            3.22722e-009
	Radius          19.4965
	InertiaMoment   0.397962

	Oblateness      0.0135757

	RotationPeriod  40.0431
	Obliquity       47.2914
	EqAscendNode    61.1056
	//Precession      0

	AbsMagn         4.14464
	SlopeParam      3.94053
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.715 0.709 0.706)

	Surface
	{
		SurfStyle       0.319309
		OceanStyle      0.825164
		Randomize      (-0.485, -0.210, -0.177)
		colorDistMagn   0.350779
		colorDistFreq   0.334014
		detailScale     532.384
		colorConversion true
		snowLevel       2
		tropicLatitude  0.972136
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.746347
		terraceProb     0.432746
		erosion         0
		montesMagn      0.474039
		montesFreq      3.56242
		montesSpiky     0.831954
		montesFraction  0.73512
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.935885
		hillsFraction   0.631729
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263387
		craterFreq      0.19274
		craterDensity   1.05704
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.486694
		volcanoTemp     1571.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.286, 0.283, 0.282, 0.000)
		colorShelf     (0.304, 0.301, 0.300, 0.000)
		colorBeach     (0.322, 0.319, 0.318, 0.000)
		colorDesert    (0.339, 0.337, 0.335, 0.000)
		colorLowland   (0.357, 0.354, 0.353, 0.000)
		colorUpland    (0.375, 0.372, 0.371, 0.000)
		colorRock      (0.393, 0.390, 0.388, 0.000)
		colorSnow      (0.411, 0.408, 0.406, 1.000)
		BumpHeight      17.5468
		BumpOffset      3.50936
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.815467
		GasToDust   0.25
		Particles   2627
		GasBright   0.146909
		DustBright  0.383972
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   621.75
		Period          3983.37
		Eccentricity    0.616274
		Inclination     60.4263
		AscendingNode   27.0498
		ArgOfPericenter -112.013
		MeanAnomaly     53.6353
	}
}

Comet	"C96"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            9.93683e-017
	Radius          0.0669627
	InertiaMoment   0.399728

	Oblateness      0.0197825

	RotationPeriod  38.1778
	Obliquity       0.497101
	EqAscendNode    45.683
	//Precession      0

	AbsMagn         11.696
	SlopeParam      4.50781
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.475 0.473 0.469)

	Surface
	{
		SurfStyle       0.659473
		OceanStyle      0.752182
		Randomize      (0.731, 0.894, -0.183)
		colorDistMagn   0.647822
		colorDistFreq   3.17804e-006
		detailScale     1.82853
		colorConversion true
		snowLevel       2
		tropicLatitude  0.207952
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.574869
		terraceProb     0.199932
		erosion         0
		montesMagn      0.585182
		montesFreq      3.10932
		montesSpiky     0.942728
		montesFraction  0.574218
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.91069e-006
		hillsFraction   0.722184
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.266774
		craterFreq      0.264701
		craterDensity   0.881273
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.529429
		volcanoTemp     1069.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.185, 0.161, 0.131, 0.000)
		colorShelf     (0.190, 0.165, 0.150, 0.000)
		colorBeach     (0.223, 0.194, 0.178, 0.000)
		colorDesert    (0.242, 0.208, 0.174, 0.000)
		colorLowland   (0.266, 0.222, 0.197, 0.000)
		colorUpland    (0.295, 0.269, 0.239, 0.000)
		colorRock      (0.318, 0.293, 0.258, 0.000)
		colorSnow      (0.347, 0.312, 0.272, 1.000)
		BumpHeight      0.0602664
		BumpOffset      0.0120533
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0723145
		DustBright  0.143053
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   380.673
		Period          1908.34
		Eccentricity    0.784771
		Inclination     -168.147
		AscendingNode   73.5829
		ArgOfPericenter 65.7241
		MeanAnomaly     111.606
	}
}

Comet	"C97"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            7.68545e-013
	Radius          1.20708
	InertiaMoment   0.398572

	Oblateness      0.0165135

	RotationPeriod  36.2856
	Obliquity       313.703
	EqAscendNode    30.2604
	//Precession      0

	AbsMagn         7.84459
	SlopeParam      5.12019
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.495 0.455 0.379)

	Surface
	{
		SurfStyle       0.815923
		OceanStyle      0.0718162
		Randomize      (0.294, 0.031, -0.613)
		colorDistMagn   0.930304
		colorDistFreq   0.00032312
		detailScale     32.9613
		colorConversion true
		snowLevel       2
		tropicLatitude  0.894005
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.391534
		terraceProb     0.342704
		erosion         0
		montesMagn      0.477299
		montesFreq      2.94939
		montesSpiky     0.992785
		montesFraction  0.606345
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00315266
		hillsFraction   0.622797
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234338
		craterFreq      0.209578
		craterDensity   0.972954
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.520546
		volcanoTemp     1458.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.193, 0.155, 0.106, 0.000)
		colorShelf     (0.198, 0.159, 0.121, 0.000)
		colorBeach     (0.232, 0.187, 0.144, 0.000)
		colorDesert    (0.252, 0.200, 0.140, 0.000)
		colorLowland   (0.277, 0.214, 0.159, 0.000)
		colorUpland    (0.307, 0.259, 0.193, 0.000)
		colorRock      (0.331, 0.282, 0.209, 0.000)
		colorSnow      (0.361, 0.300, 0.220, 1.000)
		BumpHeight      1.08637
		BumpOffset      0.217274
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.367101
		GasToDust   0.25
		Particles   1721
		GasBright   0.276315
		DustBright  0.423539
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   362.743
		Period          1775.11
		Eccentricity    0.656715
		Inclination     128.316
		AscendingNode   -91.989
		ArgOfPericenter 138.807
		MeanAnomaly     12.609
	}
}

Comet	"C98"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            5.94413e-009
	Radius          26.1691
	InertiaMoment   0.396221

	Oblateness      0.024049

	RotationPeriod  34.3606
	Obliquity       266.909
	EqAscendNode    14.8379
	//Precession      0

	AbsMagn         3.79819
	SlopeParam      5.86429
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.682 0.677 0.675)

	Surface
	{
		SurfStyle       0.698798
		OceanStyle      0.423008
		Randomize      (-0.436, 0.785, 0.994)
		colorDistMagn   0.716241
		colorDistFreq   0.406466
		detailScale     714.59
		colorConversion true
		snowLevel       2
		tropicLatitude  0.945032
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.549945
		terraceProb     0.18337
		erosion         0
		montesMagn      0.662846
		montesFreq      3.74375
		montesSpiky     0.807397
		montesFraction  0.356531
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.47363
		hillsFraction   0.907001
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224383
		craterFreq      0.249276
		craterDensity   0.891921
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.550382
		volcanoTemp     1843.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.266, 0.230, 0.189, 0.000)
		colorShelf     (0.273, 0.237, 0.216, 0.000)
		colorBeach     (0.320, 0.278, 0.257, 0.000)
		colorDesert    (0.348, 0.298, 0.250, 0.000)
		colorLowland   (0.382, 0.318, 0.284, 0.000)
		colorUpland    (0.423, 0.386, 0.344, 0.000)
		colorRock      (0.457, 0.420, 0.371, 0.000)
		colorSnow      (0.498, 0.447, 0.392, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.848293
		GasToDust   0.25
		Particles   2693
		GasBright   0.174438
		DustBright  0.209903
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   428.841
		Period          2281.76
		Eccentricity    0.674051
		Inclination     47.8469
		AscendingNode   -60.6206
		ArgOfPericenter -62.0536
		MeanAnomaly     138.949
	}
}

Comet	"C99"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            1.83024e-016
	Radius          0.0747313
	InertiaMoment   0.399071

	Oblateness      0.0206828

	RotationPeriod  32.3956
	Obliquity       220.114
	EqAscendNode    359.415
	//Precession      0

	AbsMagn         11.3872
	SlopeParam      7.05121
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.639 0.634 0.630)

	Surface
	{
		SurfStyle       0.33138
		OceanStyle      0.398588
		Randomize      (-0.582, 0.087, -0.630)
		colorDistMagn   0.588185
		colorDistFreq   2.7388e-006
		detailScale     2.04066
		colorConversion true
		snowLevel       2
		tropicLatitude  0.612544
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.465477
		terraceProb     0.472128
		erosion         0
		montesMagn      0.505429
		montesFreq      3.25084
		montesSpiky     0.912539
		montesFraction  0.403913
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.59488e-005
		hillsFraction   0.728368
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221026
		craterFreq      0.208674
		craterDensity   0.856047
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.522691
		volcanoTemp     1811.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.256, 0.254, 0.252, 0.000)
		colorShelf     (0.272, 0.269, 0.268, 0.000)
		colorBeach     (0.288, 0.285, 0.284, 0.000)
		colorDesert    (0.304, 0.301, 0.299, 0.000)
		colorLowland   (0.320, 0.317, 0.315, 0.000)
		colorUpland    (0.336, 0.333, 0.331, 0.000)
		colorRock      (0.352, 0.349, 0.347, 0.000)
		colorSnow      (0.368, 0.364, 0.362, 1.000)
		BumpHeight      0.0672582
		BumpOffset      0.0134516
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0112149
		DustBright  0.857612
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   423.117
		Period          2236.24
		Eccentricity    0.788502
		Inclination     2.71458
		AscendingNode   -150.401
		ArgOfPericenter -158.345
		MeanAnomaly     121.462
	}
}

Comet	"C100"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            1.41556e-012
	Radius          1.62086
	InertiaMoment   0.397578

	Oblateness      0.0308457

	RotationPeriod  30.3831
	Obliquity       173.32
	EqAscendNode    343.993
	//Precession      0

	AbsMagn         7.63549
	SlopeParam      2.36749
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.776 0.715 0.683)

	Surface
	{
		SurfStyle       0.903793
		OceanStyle      0.72118
		Randomize      (-0.490, 0.011, -0.024)
		colorDistMagn   0.195789
		colorDistFreq   0.00124996
		detailScale     44.2603
		colorConversion true
		snowLevel       2
		tropicLatitude  0.963999
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.674927
		terraceProb     0.278914
		erosion         0
		montesMagn      0.361653
		montesFreq      3.50909
		montesSpiky     0.926383
		montesFraction  0.227923
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00505744
		hillsFraction   0.788383
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235662
		craterFreq      0.27878
		craterDensity   0.998215
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.546343
		volcanoTemp     1754.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.264, 0.250, 0.273, 0.050)
		colorShelf     (0.310, 0.293, 0.314, 0.040)
		colorBeach     (0.357, 0.336, 0.355, 0.030)
		colorDesert    (0.403, 0.379, 0.403, 0.020)
		colorLowland   (0.450, 0.422, 0.444, 0.030)
		colorUpland    (0.496, 0.465, 0.485, 0.050)
		colorRock      (0.543, 0.508, 0.540, 0.020)
		colorSnow      (0.543, 0.508, 0.540, 1.000)
		BumpHeight      1.45877
		BumpOffset      0.291755
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.399927
		GasToDust   0.25
		Particles   1787
		GasBright   0.0398128
		DustBright  0.513501
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   595.198
		Period          3730.95
		Eccentricity    0.687574
		Inclination     -111.485
		AscendingNode   -154.704
		ArgOfPericenter 29.024
		MeanAnomaly     49.3519
	}
}

Comet	"C101"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            1.09483e-008
	Radius          29.1915
	InertiaMoment   0.399517

	Oblateness      0.0270232

	RotationPeriod  28.3138
	Obliquity       126.526
	EqAscendNode    328.57
	//Precession      0

	AbsMagn         3.41695
	SlopeParam      3.06043
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.820 0.714 0.677)

	Surface
	{
		SurfStyle       0.745812
		OceanStyle      0.283639
		Randomize      (0.875, 0.210, 0.722)
		colorDistMagn   0.602003
		colorDistFreq   0.449914
		detailScale     797.124
		colorConversion true
		snowLevel       2
		tropicLatitude  0.267765
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.691429
		terraceProb     0.124546
		erosion         0
		montesMagn      0.380399
		montesFreq      2.87542
		montesSpiky     0.995526
		montesFraction  0.17139
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.97837
		hillsFraction   0.799695
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250517
		craterFreq      0.214326
		craterDensity   1.01798
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.495285
		volcanoTemp     1265.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.243, 0.189, 0.000)
		colorShelf     (0.328, 0.250, 0.217, 0.000)
		colorBeach     (0.385, 0.293, 0.257, 0.000)
		colorDesert    (0.418, 0.314, 0.250, 0.000)
		colorLowland   (0.459, 0.336, 0.284, 0.000)
		colorUpland    (0.508, 0.407, 0.345, 0.000)
		colorRock      (0.549, 0.443, 0.372, 0.000)
		colorSnow      (0.598, 0.471, 0.392, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.881119
		GasToDust   0.25
		Particles   2759
		GasBright   0.0311515
		DustBright  0.206649
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   301.868
		Period          1347.57
		Eccentricity    0.449156
		Inclination     -139.207
		AscendingNode   -12.3358
		ArgOfPericenter 126.598
		MeanAnomaly     143.348
	}
}

Comet	"C102"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            3.37108e-016
	Radius          0.100393
	InertiaMoment   0.398291

	Oblateness      0.0415721

	RotationPeriod  26.1774
	Obliquity       79.7313
	EqAscendNode    313.147
	//Precession      0

	AbsMagn         11.0974
	SlopeParam      3.65403
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.581 0.578 0.571)

	Surface
	{
		SurfStyle       0.719763
		OceanStyle      0.381332
		Randomize      (0.612, 0.715, -0.739)
		colorDistMagn   0.642135
		colorDistFreq   4.27321e-006
		detailScale     2.7414
		colorConversion true
		snowLevel       2
		tropicLatitude  0.960836
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.58878
		terraceProb     0.131672
		erosion         0
		montesMagn      0.572208
		montesFreq      3.05086
		montesSpiky     0.910694
		montesFraction  0.451795
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.33657e-005
		hillsFraction   0.64075
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22293
		craterFreq      0.211442
		craterDensity   0.879982
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.482745
		volcanoTemp     1267.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.227, 0.196, 0.160, 0.000)
		colorShelf     (0.233, 0.202, 0.183, 0.000)
		colorBeach     (0.273, 0.237, 0.217, 0.000)
		colorDesert    (0.296, 0.254, 0.211, 0.000)
		colorLowland   (0.326, 0.272, 0.240, 0.000)
		colorUpland    (0.360, 0.329, 0.291, 0.000)
		colorRock      (0.389, 0.358, 0.314, 0.000)
		colorSnow      (0.424, 0.381, 0.331, 1.000)
		BumpHeight      0.0903538
		BumpOffset      0.0180708
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.137266
		DustBright  0.585021
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   437.859
		Period          2354.12
		Eccentricity    0.653639
		Inclination     34.829
		AscendingNode   103.458
		ArgOfPericenter 109.981
		MeanAnomaly     0.303287
	}
}

Comet	"C103"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            2.60729e-012
	Radius          1.80717
	InertiaMoment   0.399941

	Oblateness      0.0376522

	RotationPeriod  23.9612
	Obliquity       32.937
	EqAscendNode    297.725
	//Precession      0

	AbsMagn         7.42539
	SlopeParam      4.21805
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.468 0.459 0.456)

	Surface
	{
		SurfStyle       0.0227729
		OceanStyle      0.356839
		Randomize      (-0.166, 0.400, 0.788)
		colorDistMagn   0.939627
		colorDistFreq   0.00219082
		detailScale     49.3477
		colorConversion true
		snowLevel       2
		tropicLatitude  0.731391
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.298454
		terraceProb     0.337649
		erosion         0
		montesMagn      0.599986
		montesFreq      3.0376
		montesSpiky     0.896931
		montesFraction  0.427018
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00806063
		hillsFraction   0.651294
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.285437
		craterFreq      0.213169
		craterDensity   0.859524
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.501641
		volcanoTemp     1395.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.187, 0.184, 0.182, 0.000)
		colorShelf     (0.199, 0.195, 0.194, 0.000)
		colorBeach     (0.211, 0.207, 0.205, 0.000)
		colorDesert    (0.222, 0.218, 0.217, 0.000)
		colorLowland   (0.234, 0.230, 0.228, 0.000)
		colorUpland    (0.246, 0.241, 0.239, 0.000)
		colorRock      (0.258, 0.253, 0.251, 0.000)
		colorSnow      (0.269, 0.264, 0.262, 1.000)
		BumpHeight      1.62645
		BumpOffset      0.32529
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.432753
		GasToDust   0.25
		Particles   1854
		GasBright   0.101323
		DustBright  0.305451
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   487.738
		Period          2767.62
		Eccentricity    0.785315
		Inclination     -165.782
		AscendingNode   -9.7649
		ArgOfPericenter 170.791
		MeanAnomaly     47.3717
	}
}

Comet	"C104"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            2.01655e-008
	Radius          39.2341
	InertiaMoment   0.398834

	Oblateness      0.0607678

	RotationPeriod  21.6498
	Obliquity       346.143
	EqAscendNode    282.302
	//Precession      0

	AbsMagn         2.98878
	SlopeParam      4.80034
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.771 0.767 0.765)

	Surface
	{
		SurfStyle       0.11403
		OceanStyle      0.0916693
		Randomize      (-0.423, -0.063, 0.011)
		colorDistMagn   0.952568
		colorDistFreq   0.847533
		detailScale     1071.35
		colorConversion true
		snowLevel       2
		tropicLatitude  0.653344
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.585272
		terraceProb     0.330947
		erosion         0
		montesMagn      0.454485
		montesFreq      2.56763
		montesSpiky     0.836468
		montesFraction  0.652423
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.23852
		hillsFraction   0.60302
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253548
		craterFreq      0.247329
		craterDensity   1.00797
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.556678
		volcanoTemp     1436.95
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.308, 0.307, 0.306, 0.000)
		colorShelf     (0.328, 0.326, 0.325, 0.000)
		colorBeach     (0.347, 0.345, 0.344, 0.000)
		colorDesert    (0.366, 0.364, 0.363, 0.000)
		colorLowland   (0.385, 0.383, 0.382, 0.000)
		colorUpland    (0.405, 0.402, 0.401, 0.000)
		colorRock      (0.424, 0.422, 0.421, 0.000)
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

	CometTail
	{
		MaxLength   0.913945
		GasToDust   0.25
		Particles   2826
		GasBright   0.274628
		DustBright  0.616632
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   348.489
		Period          1671.51
		Eccentricity    0.694078
		Inclination     -36.1435
		AscendingNode   78.99
		ArgOfPericenter -130.404
		MeanAnomaly     13.8722
	}
}

Comet	"C105"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            6.20909e-016
	Radius          0.111873
	InertiaMoment   0.397073

	Oblateness      0.0576466

	RotationPeriod  19.2243
	Obliquity       299.348
	EqAscendNode    266.88
	//Precession      0

	AbsMagn         10.823
	SlopeParam      5.46168
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.556 0.388 0.321)

	Surface
	{
		SurfStyle       0.796959
		OceanStyle      0.832179
		Randomize      (-0.215, 0.659, -0.598)
		colorDistMagn   0.89152
		colorDistFreq   5.47184e-006
		detailScale     3.05487
		colorConversion true
		snowLevel       2
		tropicLatitude  0.890607
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.702236
		terraceProb     0.82115
		erosion         0
		montesMagn      0.636353
		montesFreq      3.39409
		montesSpiky     0.972947
		montesFraction  0.530955
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.67309e-005
		hillsFraction   0.376368
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252207
		craterFreq      0.149347
		craterDensity   0.882663
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.549301
		volcanoTemp     1709.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.217, 0.132, 0.090, 0.000)
		colorShelf     (0.222, 0.136, 0.103, 0.000)
		colorBeach     (0.261, 0.159, 0.122, 0.000)
		colorDesert    (0.283, 0.171, 0.119, 0.000)
		colorLowland   (0.311, 0.183, 0.135, 0.000)
		colorUpland    (0.344, 0.221, 0.164, 0.000)
		colorRock      (0.372, 0.241, 0.177, 0.000)
		colorSnow      (0.406, 0.256, 0.186, 1.000)
		BumpHeight      0.100685
		BumpOffset      0.0201371
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.211402
		DustBright  0.364344
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   569.97
		Period          3496.26
		Eccentricity    0.802659
		Inclination     -7.02242
		AscendingNode   -72.7126
		ArgOfPericenter -134.56
		MeanAnomaly     118.978
	}
}

Comet	"C106"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            4.80229e-012
	Radius          2.43011
	InertiaMoment   0.399301

	Oblateness      0.102568

	RotationPeriod  16.6605
	Obliquity       252.554
	EqAscendNode    251.457
	//Precession      0

	AbsMagn         7.21369
	SlopeParam      6.34636
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.516 0.449 0.411)

	Surface
	{
		SurfStyle       0.470566
		OceanStyle      0.388847
		Randomize      (0.245, -0.270, -0.912)
		colorDistMagn   0.545623
		colorDistFreq   0.00248538
		detailScale     66.3581
		colorConversion true
		snowLevel       2
		tropicLatitude  0.944824
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.68775
		terraceProb     0.17723
		erosion         0
		montesMagn      0.574138
		montesFreq      2.8471
		montesSpiky     0.911558
		montesFraction  0.494532
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0100657
		hillsFraction   0.748198
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217203
		craterFreq      0.255123
		craterDensity   1.05133
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.537115
		volcanoTemp     1726.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.206, 0.180, 0.164, 0.000)
		colorShelf     (0.219, 0.191, 0.175, 0.000)
		colorBeach     (0.232, 0.202, 0.185, 0.000)
		colorDesert    (0.245, 0.213, 0.195, 0.000)
		colorLowland   (0.258, 0.225, 0.206, 0.000)
		colorUpland    (0.271, 0.236, 0.216, 0.000)
		colorRock      (0.284, 0.247, 0.226, 0.000)
		colorSnow      (0.297, 0.258, 0.236, 1.000)
		BumpHeight      2.1871
		BumpOffset      0.437419
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.465579
		GasToDust   0.25
		Particles   1920
		GasBright   0.110918
		DustBright  0.149315
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   585.419
		Period          3639.38
		Eccentricity    0.746698
		Inclination     103.84
		AscendingNode   -73.9654
		ArgOfPericenter -117.391
		MeanAnomaly     -36.6487
	}
}

Comet	"C107"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            3.71423e-008
	Radius          43.6952
	InertiaMoment   0.397971

	Oblateness      0.109778

	RotationPeriod  13.927
	Obliquity       205.76
	EqAscendNode    236.035
	//Precession      0

	AbsMagn         2.49391
	SlopeParam      8.79218
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.546 0.475 0.346)

	Surface
	{
		SurfStyle       0.0298817
		OceanStyle      0.0656881
		Randomize      (-0.252, -0.450, -0.825)
		colorDistMagn   0.957591
		colorDistFreq   0.534001
		detailScale     1193.17
		colorConversion true
		snowLevel       2
		tropicLatitude  0.55918
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.596352
		terraceProb     0.380126
		erosion         0
		montesMagn      0.276032
		montesFreq      2.81855
		montesSpiky     0.951344
		montesFraction  0.53945
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.26392
		hillsFraction   0.602084
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255191
		craterFreq      0.190937
		craterDensity   0.992249
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.495825
		volcanoTemp     1668.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.218, 0.190, 0.138, 0.000)
		colorShelf     (0.232, 0.202, 0.147, 0.000)
		colorBeach     (0.245, 0.214, 0.155, 0.000)
		colorDesert    (0.259, 0.226, 0.164, 0.000)
		colorLowland   (0.273, 0.237, 0.173, 0.000)
		colorUpland    (0.286, 0.249, 0.181, 0.000)
		colorRock      (0.300, 0.261, 0.190, 0.000)
		colorSnow      (0.314, 0.273, 0.199, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.946771
		GasToDust   0.25
		Particles   2892
		GasBright   0.36139
		DustBright  0.38333
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   369.703
		Period          1826.44
		Eccentricity    0.669554
		Inclination     171.713
		AscendingNode   173.008
		ArgOfPericenter -14.7559
		MeanAnomaly     -77.1566
	}
}

Comet	"C108"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            1.14364e-015
	Radius          0.150518
	InertiaMoment   0.399733

	Oblateness      0.235956

	RotationPeriod  10.9813
	Obliquity       158.966
	EqAscendNode    220.612
	//Precession      0

	AbsMagn         10.5613
	SlopeParam      2.72836
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.647 0.643 0.637)

	Surface
	{
		SurfStyle       0.626239
		OceanStyle      0.292288
		Randomize      (0.459, 0.172, 0.580)
		colorDistMagn   0.51473
		colorDistFreq   1.5487e-005
		detailScale     4.11015
		colorConversion true
		snowLevel       2
		tropicLatitude  0.793705
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.539882
		terraceProb     0.376042
		erosion         0
		montesMagn      0.490323
		montesFreq      2.89701
		montesSpiky     0.851373
		montesFraction  0.632689
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.40471e-005
		hillsFraction   0.715438
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218833
		craterFreq      0.23485
		craterDensity   0.82299
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.486275
		volcanoTemp     1013.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.252, 0.218, 0.178, 0.000)
		colorShelf     (0.259, 0.225, 0.204, 0.000)
		colorBeach     (0.304, 0.263, 0.242, 0.000)
		colorDesert    (0.330, 0.283, 0.236, 0.000)
		colorLowland   (0.362, 0.302, 0.268, 0.000)
		colorUpland    (0.401, 0.366, 0.325, 0.000)
		colorRock      (0.434, 0.398, 0.351, 0.000)
		colorSnow      (0.472, 0.424, 0.370, 1.000)
		BumpHeight      0.135466
		BumpOffset      0.0270932
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0172132
		GasToDust   0.25
		Particles   1014
		GasBright   0.0190204
		DustBright  0.410186
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   390.883
		Period          1985.62
		Eccentricity    0.670086
		Inclination     -128.226
		AscendingNode   -83.7352
		ArgOfPericenter 80.4235
		MeanAnomaly     -147.603
	}
}

Comet	"C109"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            8.84523e-012
	Radius          2.70475
	InertiaMoment   0.398579

	Oblateness      0.249

	RotationPeriod  7.76429
	Obliquity       112.171
	EqAscendNode    205.189
	//Precession      0

	AbsMagn         6.99977
	SlopeParam      3.36021
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.764 0.763 0.761)

	Surface
	{
		SurfStyle       0.0675962
		OceanStyle      0.769739
		Randomize      (0.820, 0.756, -0.860)
		colorDistMagn   0.685951
		colorDistFreq   0.00254565
		detailScale     73.8576
		colorConversion true
		snowLevel       2
		tropicLatitude  0.934848
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.616757
		terraceProb     0.448374
		erosion         0
		montesMagn      0.63126
		montesFreq      3.03999
		montesSpiky     0.972437
		montesFraction  0.604899
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0174282
		hillsFraction   0.489612
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237037
		craterFreq      0.223364
		craterDensity   0.999289
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.521516
		volcanoTemp     1171.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.306, 0.305, 0.305, 0.000)
		colorShelf     (0.325, 0.324, 0.324, 0.000)
		colorBeach     (0.344, 0.343, 0.343, 0.000)
		colorDesert    (0.363, 0.362, 0.362, 0.000)
		colorLowland   (0.382, 0.381, 0.381, 0.000)
		colorUpland    (0.401, 0.400, 0.400, 0.000)
		colorRock      (0.420, 0.420, 0.419, 0.000)
		colorSnow      (0.439, 0.439, 0.438, 1.000)
		BumpHeight      2.43427
		BumpOffset      0.486855
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.498405
		GasToDust   0.25
		Particles   1986
		GasBright   0.0944399
		DustBright  0.819253
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   635.482
		Period          4116.05
		Eccentricity    0.711009
		Inclination     -1.45713
		AscendingNode   -19.4394
		ArgOfPericenter -139.642
		MeanAnomaly     78.2639
	}
}

Comet	"C110"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            6.84115e-008
	Radius          58.8238
	InertiaMoment   0.396251

	Oblateness      0.249

	RotationPeriod  4.18908
	Obliquity       65.3769
	EqAscendNode    189.767
	//Precession      0

	AbsMagn         1.89653
	SlopeParam      3.93281
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.635 0.577 0.509)

	Surface
	{
		SurfStyle       0.567848
		OceanStyle      0.864614
		Randomize      (0.598, 0.816, -0.137)
		colorDistMagn   0.429841
		colorDistFreq   2.88403
		detailScale     1606.28
		colorConversion true
		snowLevel       2
		tropicLatitude  0.789057
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.634913
		terraceProb     0.388698
		erosion         0
		montesMagn      0.62602
		montesFreq      3.30717
		montesSpiky     0.907138
		montesFraction  0.535713
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.4586
		hillsFraction   0.637147
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242269
		craterFreq      0.196911
		craterDensity   0.895748
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.449888
		volcanoTemp     1467.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.248, 0.196, 0.143, 0.000)
		colorShelf     (0.254, 0.202, 0.163, 0.000)
		colorBeach     (0.299, 0.236, 0.193, 0.000)
		colorDesert    (0.324, 0.254, 0.188, 0.000)
		colorLowland   (0.356, 0.271, 0.214, 0.000)
		colorUpland    (0.394, 0.329, 0.260, 0.000)
		colorRock      (0.426, 0.357, 0.280, 0.000)
		colorSnow      (0.464, 0.381, 0.295, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.979597
		GasToDust   0.25
		Particles   2958
		GasBright   0.0971479
		DustBright  0.501032
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   577.458
		Period          3565.39
		Eccentricity    0.705063
		Inclination     -126.516
		AscendingNode   -120.099
		ArgOfPericenter 44.3056
		MeanAnomaly     26.67
	}
}

Comet	"C111"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            2.10644e-015
	Radius          0.167417
	InertiaMoment   0.399077

	Oblateness      0.00124314

	RotationPeriod  130.606
	Obliquity       18.5826
	EqAscendNode    174.344
	//Precession      0

	AbsMagn         10.3102
	SlopeParam      4.49985
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.710 0.708 0.707)

	Surface
	{
		SurfStyle       0.259779
		OceanStyle      0.642161
		Randomize      (-0.695, -0.697, 0.008)
		colorDistMagn   0.654335
		colorDistFreq   1.71337e-005
		detailScale     4.57161
		colorConversion true
		snowLevel       2
		tropicLatitude  0.344226
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.492625
		terraceProb     0.138468
		erosion         0
		montesMagn      0.52259
		montesFreq      2.60716
		montesSpiky     0.974803
		montesFraction  0.225084
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.5049e-005
		hillsFraction   0.62111
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226073
		craterFreq      0.242106
		craterDensity   0.918419
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.468312
		volcanoTemp     1206.36
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
		BumpHeight      0.150675
		BumpOffset      0.0301351
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0500392
		GasToDust   0.25
		Particles   1080
		GasBright   0.0625967
		DustBright  0.220069
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   414.637
		Period          2169.35
		Eccentricity    0.63798
		Inclination     -153.607
		AscendingNode   129.352
		ArgOfPericenter 110.839
		MeanAnomaly     7.04952
	}
}

Comet	"C112"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            1.62918e-011
	Radius          3.6435
	InertiaMoment   0.397588

	Oblateness      0.00211674

	RotationPeriod  115.224
	Obliquity       331.788
	EqAscendNode    158.922
	//Precession      0

	AbsMagn         6.78294
	SlopeParam      5.11117
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.634 0.589 0.503)

	Surface
	{
		SurfStyle       0.817889
		OceanStyle      0.999072
		Randomize      (-0.693, -0.675, 0.707)
		colorDistMagn   0.0914328
		colorDistFreq   0.00384599
		detailScale     99.4919
		colorConversion true
		snowLevel       2
		tropicLatitude  0.272242
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.600327
		terraceProb     0.154552
		erosion         0
		montesMagn      0.511845
		montesFreq      2.90911
		montesSpiky     0.900347
		montesFraction  0.567341
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0298819
		hillsFraction   0.751627
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234949
		craterFreq      0.183449
		craterDensity   0.910386
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.534214
		volcanoTemp     1283.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.247, 0.200, 0.141, 0.000)
		colorShelf     (0.254, 0.206, 0.161, 0.000)
		colorBeach     (0.298, 0.241, 0.191, 0.000)
		colorDesert    (0.323, 0.259, 0.186, 0.000)
		colorLowland   (0.355, 0.277, 0.211, 0.000)
		colorUpland    (0.393, 0.336, 0.256, 0.000)
		colorRock      (0.425, 0.365, 0.276, 0.000)
		colorSnow      (0.463, 0.389, 0.291, 1.000)
		BumpHeight      3.27915
		BumpOffset      0.65583
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.531231
		GasToDust   0.25
		Particles   2052
		GasBright   0.215184
		DustBright  0.551969
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   454.378
		Period          2488.59
		Eccentricity    0.506581
		Inclination     -13.7965
		AscendingNode   -160.772
		ArgOfPericenter 41.0925
		MeanAnomaly     -122.024
	}
}

Comet	"C113"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            1.26005e-007
	Radius          65.3811
	InertiaMoment   0.399523

	Oblateness      0.00185148

	RotationPeriod  106.877
	Obliquity       284.994
	EqAscendNode    143.499
	//Precession      0

	AbsMagn         1.11986
	SlopeParam      5.85241
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.755 0.753 0.752)

	Surface
	{
		SurfStyle       0.0699788
		OceanStyle      0.685189
		Randomize      (0.867, 0.420, 0.879)
		colorDistMagn   0.308616
		colorDistFreq   2.41506
		detailScale     1785.34
		colorConversion true
		snowLevel       2
		tropicLatitude  0.958169
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.491315
		terraceProb     0.255105
		erosion         0
		montesMagn      0.645126
		montesFreq      2.68509
		montesSpiky     0.969773
		montesFraction  0.738369
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.31724
		hillsFraction   0.592822
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240679
		craterFreq      0.201047
		craterDensity   1.0232
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.502904
		volcanoTemp     1637.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.302, 0.301, 0.301, 0.000)
		colorShelf     (0.321, 0.320, 0.319, 0.000)
		colorBeach     (0.340, 0.339, 0.338, 0.000)
		colorDesert    (0.359, 0.358, 0.357, 0.000)
		colorLowland   (0.377, 0.376, 0.376, 0.000)
		colorUpland    (0.396, 0.395, 0.395, 0.000)
		colorRock      (0.415, 0.414, 0.413, 0.000)
		colorSnow      (0.434, 0.433, 0.432, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.15335
		DustBright  0.298289
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   503.177
		Period          2900.06
		Eccentricity    0.719993
		Inclination     -173.175
		AscendingNode   -75.2038
		ArgOfPericenter 3.60418
		MeanAnomaly     -66.0876
	}
}

Comet	"C114"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            3.87979e-015
	Radius          0.225676
	InertiaMoment   0.398299

	Oblateness      0.00276424

	RotationPeriod  100.855
	Obliquity       238.2
	EqAscendNode    128.076
	//Precession      0

	AbsMagn         10.0678
	SlopeParam      7.02673
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.659 0.656 0.652)

	Surface
	{
		SurfStyle       0.584861
		OceanStyle      0.856951
		Randomize      (0.123, 0.169, 0.803)
		colorDistMagn   0.523792
		colorDistFreq   3.46535e-005
		detailScale     6.16247
		colorConversion true
		snowLevel       2
		tropicLatitude  0.711652
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.663325
		terraceProb     0.314649
		erosion         0
		montesMagn      0.470008
		montesFreq      2.83247
		montesSpiky     0.915988
		montesFraction  0.77196
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000122645
		hillsFraction   0.569791
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252524
		craterFreq      0.263925
		craterDensity   0.906695
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.456385
		volcanoTemp     1307.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.257, 0.223, 0.182, 0.000)
		colorShelf     (0.264, 0.230, 0.209, 0.000)
		colorBeach     (0.310, 0.269, 0.248, 0.000)
		colorDesert    (0.336, 0.289, 0.241, 0.000)
		colorLowland   (0.369, 0.308, 0.274, 0.000)
		colorUpland    (0.409, 0.374, 0.332, 0.000)
		colorRock      (0.442, 0.407, 0.358, 0.000)
		colorSnow      (0.481, 0.433, 0.378, 1.000)
		BumpHeight      0.203109
		BumpOffset      0.0406217
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.082865
		GasToDust   0.25
		Particles   1147
		GasBright   0.373128
		DustBright  0.562998
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   481.724
		Period          2716.59
		Eccentricity    0.612842
		Inclination     163.654
		AscendingNode   34.6067
		ArgOfPericenter -78.6073
		MeanAnomaly     80.9067
	}
}

Comet	"C115"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            3.00074e-011
	Radius          4.04651
	InertiaMoment   0.399946

	Oblateness      0.00228668

	RotationPeriod  96.0305
	Obliquity       191.405
	EqAscendNode    112.654
	//Precession      0

	AbsMagn         6.56247
	SlopeParam      2.3567
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.639 0.566 0.447)

	Surface
	{
		SurfStyle       0.635153
		OceanStyle      0.357432
		Randomize      (0.897, 0.159, 0.406)
		colorDistMagn   0.493974
		colorDistFreq   0.0133931
		detailScale     110.497
		colorConversion true
		snowLevel       2
		tropicLatitude  0.943004
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.617884
		terraceProb     0.250863
		erosion         0
		montesMagn      0.528138
		montesFreq      2.72827
		montesSpiky     0.942444
		montesFraction  0.808571
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0299692
		hillsFraction   0.663617
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263833
		craterFreq      0.240463
		craterDensity   0.973486
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.487916
		volcanoTemp     1498.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.249, 0.192, 0.125, 0.000)
		colorShelf     (0.256, 0.198, 0.143, 0.000)
		colorBeach     (0.300, 0.232, 0.170, 0.000)
		colorDesert    (0.326, 0.249, 0.165, 0.000)
		colorLowland   (0.358, 0.266, 0.188, 0.000)
		colorUpland    (0.396, 0.323, 0.228, 0.000)
		colorRock      (0.428, 0.351, 0.246, 0.000)
		colorSnow      (0.467, 0.374, 0.259, 1.000)
		BumpHeight      3.64186
		BumpOffset      0.728373
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.564057
		GasToDust   0.25
		Particles   2119
		GasBright   0.284012
		DustBright  0.3366
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   468.737
		Period          2607.48
		Eccentricity    0.6242
		Inclination     66.364
		AscendingNode   70.5828
		ArgOfPericenter -128.121
		MeanAnomaly     -60.6416
	}
}

Comet	"C116"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            2.32086e-007
	Radius          88.1971
	InertiaMoment   0.39884

	Oblateness      0.00332584

	RotationPeriod  91.9412
	Obliquity       144.611
	EqAscendNode    97.2312
	//Precession      0

	AbsMagn         -0.0636311
	SlopeParam      3.0518
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.699 0.695 0.693)

	Surface
	{
		SurfStyle       0.403339
		OceanStyle      0.320324
		Randomize      (0.083, 0.498, 0.945)
		colorDistMagn   0.645479
		colorDistFreq   5.52978
		detailScale     2408.37
		colorConversion true
		snowLevel       2
		tropicLatitude  0.529061
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.697477
		terraceProb     0.443197
		erosion         0
		montesMagn      0.652351
		montesFreq      3.19657
		montesSpiky     0.974308
		montesFraction  0.445578
		dunesFraction   0
		hillsMagn       0
		hillsFreq       13.8243
		hillsFraction   0.657301
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231347
		craterFreq      0.270411
		craterDensity   0.756002
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.408199
		volcanoTemp     1145.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.279, 0.278, 0.277, 0.000)
		colorShelf     (0.297, 0.295, 0.294, 0.000)
		colorBeach     (0.314, 0.313, 0.312, 0.000)
		colorDesert    (0.332, 0.330, 0.329, 0.000)
		colorLowland   (0.349, 0.348, 0.346, 0.000)
		colorUpland    (0.367, 0.365, 0.364, 0.000)
		colorRock      (0.384, 0.382, 0.381, 0.000)
		colorSnow      (0.402, 0.400, 0.398, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.00508826
		DustBright  0.300011
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   473.63
		Period          2648.41
		Eccentricity    0.802488
		Inclination     3.62043
		AscendingNode   -17.0054
		ArgOfPericenter -159.71
		MeanAnomaly     81.9797
	}
}

Comet	"C117"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            7.1461e-015
	Radius          0.250429
	InertiaMoment   0.397088

	Oblateness      0.00266018

	RotationPeriod  88.3517
	Obliquity       97.8169
	EqAscendNode    81.8086
	//Precession      0

	AbsMagn         9.8328
	SlopeParam      3.64619
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.752 0.749 0.747)

	Surface
	{
		SurfStyle       0.831272
		OceanStyle      0.484292
		Randomize      (-0.456, 0.575, 0.298)
		colorDistMagn   0.316804
		colorDistFreq   2.07235e-005
		detailScale     6.83838
		colorConversion true
		snowLevel       2
		tropicLatitude  0.951296
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.457671
		terraceProb     0.48114
		erosion         0
		montesMagn      0.402259
		montesFreq      3.46102
		montesSpiky     0.843071
		montesFraction  0.683278
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000197867
		hillsFraction   0.796864
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.20631
		craterFreq      0.215328
		craterDensity   1.00323
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.489394
		volcanoTemp     1465.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.293, 0.255, 0.209, 0.000)
		colorShelf     (0.301, 0.262, 0.239, 0.000)
		colorBeach     (0.353, 0.307, 0.284, 0.000)
		colorDesert    (0.384, 0.330, 0.276, 0.000)
		colorLowland   (0.421, 0.352, 0.314, 0.000)
		colorUpland    (0.466, 0.427, 0.381, 0.000)
		colorRock      (0.504, 0.465, 0.411, 0.000)
		colorSnow      (0.549, 0.495, 0.433, 1.000)
		BumpHeight      0.225386
		BumpOffset      0.0450772
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.115691
		GasToDust   0.25
		Particles   1213
		GasBright   0.0597895
		DustBright  0.729796
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   446.591
		Period          2424.89
		Eccentricity    0.792782
		Inclination     105.326
		AscendingNode   -106.56
		ArgOfPericenter -42.8436
		MeanAnomaly     25.0773
	}
}

Comet	"C118"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            5.527e-011
	Radius          5.46291
	InertiaMoment   0.399307

	Oblateness      0.00387835

	RotationPeriod  85.124
	Obliquity       51.0226
	EqAscendNode    66.3861
	//Precession      0

	AbsMagn         6.33754
	SlopeParam      4.21028
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.760 0.756 0.755)

	Surface
	{
		SurfStyle       0.802499
		OceanStyle      0.90068
		Randomize      (0.982, 0.719, -0.393)
		colorDistMagn   0.513934
		colorDistFreq   0.0151875
		detailScale     149.174
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999095
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.452958
		terraceProb     0.435931
		erosion         0
		montesMagn      0.570315
		montesFreq      2.70767
		montesSpiky     0.926732
		montesFraction  0.752416
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.082295
		hillsFraction   0.577412
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264675
		craterFreq      0.16138
		craterDensity   1.02487
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.475971
		volcanoTemp     1628.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.296, 0.257, 0.211, 0.000)
		colorShelf     (0.304, 0.265, 0.241, 0.000)
		colorBeach     (0.357, 0.310, 0.287, 0.000)
		colorDesert    (0.388, 0.333, 0.279, 0.000)
		colorLowland   (0.426, 0.355, 0.317, 0.000)
		colorUpland    (0.471, 0.431, 0.385, 0.000)
		colorRock      (0.509, 0.469, 0.415, 0.000)
		colorSnow      (0.555, 0.499, 0.438, 1.000)
		BumpHeight      4.91662
		BumpOffset      0.983324
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.596883
		GasToDust   0.25
		Particles   2185
		GasBright   0.0638897
		DustBright  0.410182
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   412.963
		Period          2156.22
		Eccentricity    0.753821
		Inclination     -41.9678
		AscendingNode   168.958
		ArgOfPericenter -79.4537
		MeanAnomaly     -158.72
	}
}

Comet	"C119"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            4.27474e-007
	Radius          97.7822
	InertiaMoment   0.39798

	Oblateness      0.00307078

	RotationPeriod  82.1702
	Obliquity       4.22827
	EqAscendNode    50.9635
	//Precession      0

	AbsMagn         17.9432
	SlopeParam      4.79199
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.569 0.523 0.451)

	Surface
	{
		SurfStyle       0.383182
		OceanStyle      0.611005
		Randomize      (-0.144, -0.901, 0.687)
		colorDistMagn   0.667325
		colorDistFreq   3.50295
		detailScale     2670.11
		colorConversion true
		snowLevel       2
		tropicLatitude  0.868069
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.695935
		terraceProb     0.528246
		erosion         0
		montesMagn      0.557025
		montesFreq      2.82705
		montesSpiky     0.977391
		montesFraction  0.206345
		dunesFraction   0
		hillsMagn       0
		hillsFreq       21.9704
		hillsFraction   0.556417
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243174
		craterFreq      0.352684
		craterDensity   0.891714
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.450571
		volcanoTemp     1531.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.228, 0.209, 0.180, 0.000)
		colorShelf     (0.242, 0.222, 0.192, 0.000)
		colorBeach     (0.256, 0.235, 0.203, 0.000)
		colorDesert    (0.270, 0.249, 0.214, 0.000)
		colorLowland   (0.285, 0.262, 0.225, 0.000)
		colorUpland    (0.299, 0.275, 0.237, 0.000)
		colorRock      (0.313, 0.288, 0.248, 0.000)
		colorSnow      (0.327, 0.301, 0.259, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.185781
		DustBright  0.772777
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   427.46
		Period          2270.76
		Eccentricity    0.77436
		Inclination     -60.8543
		AscendingNode   80.4006
		ArgOfPericenter -6.35661
		MeanAnomaly     111.834
	}
}

Comet	"C120"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            1.31622e-014
	Radius          0.338373
	InertiaMoment   0.399739

	Oblateness      0.00445201

	RotationPeriod  79.4301
	Obliquity       317.434
	EqAscendNode    35.5409
	//Precession      0

	AbsMagn         9.60397
	SlopeParam      5.45162
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.737 0.733 0.729)

	Surface
	{
		SurfStyle       0.581842
		OceanStyle      0.564502
		Randomize      (-0.990, -0.957, 0.445)
		colorDistMagn   0.618105
		colorDistFreq   9.06049e-005
		detailScale     9.23983
		colorConversion true
		snowLevel       2
		tropicLatitude  0.941693
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.393851
		terraceProb     0.43337
		erosion         0
		montesMagn      0.523361
		montesFreq      2.71492
		montesSpiky     0.870178
		montesFraction  0.567834
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000316565
		hillsFraction   0.845336
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248015
		craterFreq      0.247128
		craterDensity   0.973417
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53261
		volcanoTemp     1712.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.288, 0.249, 0.204, 0.000)
		colorShelf     (0.295, 0.256, 0.233, 0.000)
		colorBeach     (0.346, 0.300, 0.277, 0.000)
		colorDesert    (0.376, 0.322, 0.270, 0.000)
		colorLowland   (0.413, 0.344, 0.306, 0.000)
		colorUpland    (0.457, 0.418, 0.372, 0.000)
		colorRock      (0.494, 0.454, 0.401, 0.000)
		colorSnow      (0.538, 0.484, 0.423, 1.000)
		BumpHeight      0.304535
		BumpOffset      0.0609071
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.148517
		GasToDust   0.25
		Particles   1279
		GasBright   0.162599
		DustBright  0.480446
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   632.13
		Period          4083.53
		Eccentricity    0.764985
		Inclination     -134.461
		AscendingNode   -111.812
		ArgOfPericenter -61.6952
		MeanAnomaly     66.5985
	}
}

Comet	"C121"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            1.018e-010
	Radius          6.05066
	InertiaMoment   0.398586

	Oblateness      0.00349977

	RotationPeriod  76.8611
	Obliquity       270.64
	EqAscendNode    20.1183
	//Precession      0

	AbsMagn         6.10723
	SlopeParam      6.33107
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.483 0.477 0.472)

	Surface
	{
		SurfStyle       0.233702
		OceanStyle      0.780399
		Randomize      (-0.723, 0.330, -0.421)
		colorDistMagn   0.803945
		colorDistFreq   0.0194854
		detailScale     165.223
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999917
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.516333
		terraceProb     0.233308
		erosion         0
		montesMagn      0.3484
		montesFreq      3.32656
		montesSpiky     0.936436
		montesFraction  0.695487
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.08088
		hillsFraction   0.58322
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251731
		craterFreq      0.185639
		craterDensity   0.851784
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.524256
		volcanoTemp     1836.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.193, 0.191, 0.189, 0.000)
		colorShelf     (0.205, 0.203, 0.201, 0.000)
		colorBeach     (0.217, 0.215, 0.212, 0.000)
		colorDesert    (0.229, 0.227, 0.224, 0.000)
		colorLowland   (0.241, 0.239, 0.236, 0.000)
		colorUpland    (0.253, 0.251, 0.248, 0.000)
		colorRock      (0.265, 0.263, 0.260, 0.000)
		colorSnow      (0.277, 0.274, 0.272, 1.000)
		BumpHeight      5.44559
		BumpOffset      1.08912
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.629709
		GasToDust   0.25
		Particles   2251
		GasBright   0.102158
		DustBright  0.225373
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   573.113
		Period          3525.22
		Eccentricity    0.751641
		Inclination     -177.792
		AscendingNode   128.57
		ArgOfPericenter -104.781
		MeanAnomaly     -30.1426
	}
}

Comet	"C122"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            7.87352e-007
	Radius          132.241
	InertiaMoment   0.396281

	Oblateness      0.00499415

	RotationPeriod  74.4313
	Obliquity       223.845
	EqAscendNode    4.69569
	//Precession      0

	AbsMagn         15.69
	SlopeParam      8.66595
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.565 0.561 0.556)

	Surface
	{
		SurfStyle       0.101943
		OceanStyle      0.215177
		Randomize      (-0.039, 0.509, 0.907)
		colorDistMagn   0.754918
		colorDistFreq   6.4024
		detailScale     3611.07
		colorConversion true
		snowLevel       2
		tropicLatitude  0.621785
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.675499
		terraceProb     0.359042
		erosion         0
		montesMagn      0.547927
		montesFreq      2.88893
		montesSpiky     0.973127
		montesFraction  0.458497
		dunesFraction   0
		hillsMagn       0
		hillsFreq       40.7203
		hillsFraction   0.614833
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234027
		craterFreq      0.630059
		craterDensity   0.861018
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.475958
		volcanoTemp     1570.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.226, 0.224, 0.222, 0.000)
		colorShelf     (0.240, 0.238, 0.236, 0.000)
		colorBeach     (0.254, 0.252, 0.250, 0.000)
		colorDesert    (0.268, 0.266, 0.264, 0.000)
		colorLowland   (0.283, 0.280, 0.278, 0.000)
		colorUpland    (0.297, 0.294, 0.292, 0.000)
		colorRock      (0.311, 0.308, 0.306, 0.000)
		colorSnow      (0.325, 0.322, 0.320, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.301217
		DustBright  0.510801
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   490.177
		Period          2788.4
		Eccentricity    0.771376
		Inclination     -153.41
		AscendingNode   -116.481
		ArgOfPericenter 111.293
		MeanAnomaly     -139.923
	}
}

Comet	"C123"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            2.42431e-014
	Radius          0.374377
	InertiaMoment   0.399083

	Oblateness      0.00396163

	RotationPeriod  72.1163
	Obliquity       177.051
	EqAscendNode    349.273
	//Precession      0

	AbsMagn         9.38028
	SlopeParam      2.7189
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.665 0.660 0.655)

	Surface
	{
		SurfStyle       0.571489
		OceanStyle      0.61681
		Randomize      (0.545, 0.424, -0.709)
		colorDistMagn   0.0432353
		colorDistFreq   8.1781e-005
		detailScale     10.223
		colorConversion true
		snowLevel       2
		tropicLatitude  0.994216
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.35933
		terraceProb     0.163782
		erosion         0
		montesMagn      0.63336
		montesFreq      3.54442
		montesSpiky     0.992595
		montesFraction  0.423916
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000209169
		hillsFraction   0.546779
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254103
		craterFreq      0.274147
		craterDensity   1.01488
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.475591
		volcanoTemp     1494.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.259, 0.224, 0.183, 0.000)
		colorShelf     (0.266, 0.231, 0.210, 0.000)
		colorBeach     (0.312, 0.270, 0.249, 0.000)
		colorDesert    (0.339, 0.290, 0.242, 0.000)
		colorLowland   (0.372, 0.310, 0.275, 0.000)
		colorUpland    (0.412, 0.376, 0.334, 0.000)
		colorRock      (0.445, 0.409, 0.360, 0.000)
		colorSnow      (0.485, 0.435, 0.380, 1.000)
		BumpHeight      0.336939
		BumpOffset      0.0673879
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.181343
		GasToDust   0.25
		Particles   1346
		GasBright   0.213494
		DustBright  0.283011
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   590.815
		Period          3689.81
		Eccentricity    0.713883
		Inclination     -85.8276
		AscendingNode   -132.613
		ArgOfPericenter 104.887
		MeanAnomaly     161.734
	}
}

Comet	"C124"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            1.87503e-010
	Radius          8.19106
	InertiaMoment   0.397599

	Oblateness      0.0056791

	RotationPeriod  69.8971
	Obliquity       130.257
	EqAscendNode    333.851
	//Precession      0

	AbsMagn         5.87046
	SlopeParam      3.35208
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.606 0.602 0.599)

	Surface
	{
		SurfStyle       0.678728
		OceanStyle      0.919234
		Randomize      (0.435, 0.734, 0.325)
		colorDistMagn   0.129586
		colorDistFreq   0.0528526
		detailScale     223.671
		colorConversion true
		snowLevel       2
		tropicLatitude  0.97633
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.49072
		terraceProb     0.192879
		erosion         0
		montesMagn      0.340702
		montesFreq      2.28703
		montesSpiky     0.942665
		montesFraction  0.587224
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.150192
		hillsFraction   0.53863
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247479
		craterFreq      0.210506
		craterDensity   0.785586
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.494683
		volcanoTemp     1549.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.236, 0.205, 0.168, 0.000)
		colorShelf     (0.242, 0.211, 0.192, 0.000)
		colorBeach     (0.285, 0.247, 0.228, 0.000)
		colorDesert    (0.309, 0.265, 0.222, 0.000)
		colorLowland   (0.339, 0.283, 0.252, 0.000)
		colorUpland    (0.375, 0.343, 0.306, 0.000)
		colorRock      (0.406, 0.373, 0.330, 0.000)
		colorSnow      (0.442, 0.397, 0.348, 1.000)
		BumpHeight      7.37195
		BumpOffset      1.47439
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.662535
		GasToDust   0.25
		Particles   2318
		GasBright   0.479744
		DustBright  0.501248
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   546.124
		Period          3279.17
		Eccentricity    0.817299
		Inclination     -38.9874
		AscendingNode   53.4395
		ArgOfPericenter 109.527
		MeanAnomaly     57.3433
	}
}

Comet	"C125"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            5.77337e-018
	Radius          0.0231619
	InertiaMoment   0.399528

	Oblateness      0.00446992

	RotationPeriod  67.7582
	Obliquity       83.4625
	EqAscendNode    318.428
	//Precession      0

	AbsMagn         14.6551
	SlopeParam      3.92509
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.435 0.430 0.427)

	Surface
	{
		SurfStyle       0.422088
		OceanStyle      0.661108
		Randomize      (0.843, 0.281, -0.274)
		colorDistMagn   0.995633
		colorDistFreq   3.99829e-007
		detailScale     0.632475
		colorConversion true
		snowLevel       2
		tropicLatitude  0.565823
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.322948
		terraceProb     0.465834
		erosion         0
		montesMagn      0.510373
		montesFreq      3.16998
		montesSpiky     0.774865
		montesFraction  0.612453
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.07172e-006
		hillsFraction   0.890412
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221131
		craterFreq      0.181302
		craterDensity   0.892668
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.506696
		volcanoTemp     1826.25
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.174, 0.172, 0.171, 0.000)
		colorShelf     (0.185, 0.183, 0.182, 0.000)
		colorBeach     (0.196, 0.194, 0.192, 0.000)
		colorDesert    (0.206, 0.204, 0.203, 0.000)
		colorLowland   (0.217, 0.215, 0.214, 0.000)
		colorUpland    (0.228, 0.226, 0.224, 0.000)
		colorRock      (0.239, 0.237, 0.235, 0.000)
		colorSnow      (0.250, 0.248, 0.246, 1.000)
		BumpHeight      0.0208457
		BumpOffset      0.00416915
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0319993
		DustBright  0.633479
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   701.122
		Period          4769.98
		Eccentricity    0.784538
		Inclination     128.802
		AscendingNode   13.3965
		ArgOfPericenter 166.724
		MeanAnomaly     37.7967
	}
}

Comet	"C126"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            4.46529e-014
	Radius          0.507358
	InertiaMoment   0.398306

	Oblateness      0.00643391

	RotationPeriod  65.6868
	Obliquity       36.6682
	EqAscendNode    303.005
	//Precession      0

	AbsMagn         9.16082
	SlopeParam      4.49189
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.598 0.550 0.484)

	Surface
	{
		SurfStyle       0.264522
		OceanStyle      0.696387
		Randomize      (-0.677, -0.838, -0.831)
		colorDistMagn   0.305793
		colorDistFreq   0.000166406
		detailScale     13.8543
		colorConversion true
		snowLevel       2
		tropicLatitude  0.608607
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.697234
		terraceProb     0.25338
		erosion         0
		montesMagn      0.498178
		montesFreq      2.79642
		montesSpiky     0.795837
		montesFraction  0.742695
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000516355
		hillsFraction   0.591148
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.18938
		craterFreq      0.20629
		craterDensity   0.922719
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.56562
		volcanoTemp     1304.09
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.239, 0.220, 0.194, 0.000)
		colorShelf     (0.254, 0.234, 0.206, 0.000)
		colorBeach     (0.269, 0.248, 0.218, 0.000)
		colorDesert    (0.284, 0.261, 0.230, 0.000)
		colorLowland   (0.299, 0.275, 0.242, 0.000)
		colorUpland    (0.314, 0.289, 0.254, 0.000)
		colorRock      (0.329, 0.303, 0.266, 0.000)
		colorSnow      (0.344, 0.317, 0.278, 1.000)
		BumpHeight      0.456622
		BumpOffset      0.0913244
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.214169
		GasToDust   0.25
		Particles   1412
		GasBright   0.0374917
		DustBright  0.312473
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   642.702
		Period          4186.4
		Eccentricity    0.773407
		Inclination     68.0884
		AscendingNode   153.112
		ArgOfPericenter -111.488
		MeanAnomaly     19.1567
	}
}

Comet	"C127"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            3.45358e-010
	Radius          9.04051
	InertiaMoment   0.399951

	Oblateness      0.00503991

	RotationPeriod  63.6725
	Obliquity       349.874
	EqAscendNode    287.583
	//Precession      0

	AbsMagn         5.62597
	SlopeParam      5.10218
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.668 0.667 0.665)

	Surface
	{
		SurfStyle       0.844285
		OceanStyle      0.191838
		Randomize      (0.124, -0.640, 0.567)
		colorDistMagn   0.549226
		colorDistFreq   0.0520671
		detailScale     246.866
		colorConversion true
		snowLevel       2
		tropicLatitude  0.124781
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.677539
		terraceProb     0.238019
		erosion         0
		montesMagn      0.469616
		montesFreq      2.45329
		montesSpiky     0.989994
		montesFraction  0.480408
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.237865
		hillsFraction   0.566789
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232143
		craterFreq      0.210556
		craterDensity   0.909248
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.465042
		volcanoTemp     1245.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.261, 0.227, 0.186, 0.000)
		colorShelf     (0.267, 0.233, 0.213, 0.000)
		colorBeach     (0.314, 0.273, 0.253, 0.000)
		colorDesert    (0.341, 0.293, 0.246, 0.000)
		colorLowland   (0.374, 0.313, 0.279, 0.000)
		colorUpland    (0.414, 0.380, 0.339, 0.000)
		colorRock      (0.448, 0.413, 0.366, 0.000)
		colorSnow      (0.488, 0.440, 0.386, 1.000)
		BumpHeight      8.13646
		BumpOffset      1.62729
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.695361
		GasToDust   0.25
		Particles   2384
		GasBright   0.138665
		DustBright  0.695786
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   499.779
		Period          2870.74
		Eccentricity    0.684965
		Inclination     -174.708
		AscendingNode   -42.4923
		ArgOfPericenter -159.659
		MeanAnomaly     -15.9857
	}
}

Comet	"C128"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            1.06338e-017
	Radius          0.031426
	InertiaMoment   0.398846

	Oblateness      0.00729023

	RotationPeriod  61.7061
	Obliquity       303.08
	EqAscendNode    272.16
	//Precession      0

	AbsMagn         13.9365
	SlopeParam      5.84059
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.605 0.602 0.599)

	Surface
	{
		SurfStyle       0.170358
		OceanStyle      0.61959
		Randomize      (-0.236, 0.869, 0.260)
		colorDistMagn   0.428385
		colorDistFreq   1.46316e-007
		detailScale     0.858141
		colorConversion true
		snowLevel       2
		tropicLatitude  0.994955
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.550242
		terraceProb     0.331482
		erosion         0
		montesMagn      0.418966
		montesFreq      3.27044
		montesSpiky     0.949488
		montesFraction  0.409201
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.96841e-006
		hillsFraction   0.678175
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.215723
		craterFreq      0.218815
		craterDensity   0.947632
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.519684
		volcanoTemp     1417.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.242, 0.241, 0.240, 0.000)
		colorShelf     (0.257, 0.256, 0.255, 0.000)
		colorBeach     (0.272, 0.271, 0.270, 0.000)
		colorDesert    (0.287, 0.286, 0.285, 0.000)
		colorLowland   (0.302, 0.301, 0.300, 0.000)
		colorUpland    (0.317, 0.316, 0.315, 0.000)
		colorRock      (0.332, 0.331, 0.330, 0.000)
		colorSnow      (0.348, 0.346, 0.345, 1.000)
		BumpHeight      0.0282834
		BumpOffset      0.00565669
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.116875
		DustBright  0.402062
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   544.94
		Period          3268.5
		Eccentricity    0.76765
		Inclination     -110.866
		AscendingNode   -112.113
		ArgOfPericenter -175.051
		MeanAnomaly     115.545
	}
}

Comet	"C129"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            8.22449e-014
	Radius          0.559185
	InertiaMoment   0.397103

	Oblateness      0.0056212

	RotationPeriod  59.7797
	Obliquity       256.285
	EqAscendNode    256.738
	//Precession      0

	AbsMagn         8.94481
	SlopeParam      7.0027
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.617 0.614 0.611)

	Surface
	{
		SurfStyle       0.35688
		OceanStyle      0.846527
		Randomize      (-0.076, -0.171, 0.208)
		colorDistMagn   0.969321
		colorDistFreq   0.000133973
		detailScale     15.2695
		colorConversion true
		snowLevel       2
		tropicLatitude  0.891763
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.453999
		terraceProb     0.149999
		erosion         0
		montesMagn      0.334595
		montesFreq      3.10365
		montesSpiky     0.929912
		montesFraction  0.323917
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000991072
		hillsFraction   0.450412
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24045
		craterFreq      0.225629
		craterDensity   0.921644
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.412621
		volcanoTemp     1227.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.247, 0.246, 0.244, 0.000)
		colorShelf     (0.262, 0.261, 0.260, 0.000)
		colorBeach     (0.278, 0.276, 0.275, 0.000)
		colorDesert    (0.293, 0.292, 0.290, 0.000)
		colorLowland   (0.309, 0.307, 0.305, 0.000)
		colorUpland    (0.324, 0.322, 0.321, 0.000)
		colorRock      (0.339, 0.338, 0.336, 0.000)
		colorSnow      (0.355, 0.353, 0.351, 1.000)
		BumpHeight      0.503266
		BumpOffset      0.100653
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.246995
		GasToDust   0.25
		Particles   1478
		GasBright   0.0578266
		DustBright  0.145598
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   525.943
		Period          3099.09
		Eccentricity    0.784659
		Inclination     -137.9
		AscendingNode   -15.2354
		ArgOfPericenter -122.171
		MeanAnomaly     2.38462
	}
}

Comet	"C130"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            6.36106e-010
	Radius          12.2819
	InertiaMoment   0.399313

	Oblateness      0.00828113

	RotationPeriod  57.8866
	Obliquity       209.491
	EqAscendNode    241.315
	//Precession      0

	AbsMagn         5.37228
	SlopeParam      2.34586
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.757 0.684 0.572)

	Surface
	{
		SurfStyle       0.194435
		OceanStyle      0.405888
		Randomize      (0.495, 0.260, -0.813)
		colorDistMagn   0.698837
		colorDistFreq   0.067601
		detailScale     335.378
		colorConversion true
		snowLevel       2
		tropicLatitude  0.595831
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.390846
		terraceProb     0.480091
		erosion         0
		montesMagn      0.476518
		montesFreq      3.78535
		montesSpiky     0.943943
		montesFraction  0.45329
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.299977
		hillsFraction   0.600837
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236761
		craterFreq      0.273732
		craterDensity   1.05918
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.468054
		volcanoTemp     1687.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.303, 0.274, 0.229, 0.000)
		colorShelf     (0.322, 0.291, 0.243, 0.000)
		colorBeach     (0.341, 0.308, 0.258, 0.000)
		colorDesert    (0.360, 0.325, 0.272, 0.000)
		colorLowland   (0.379, 0.342, 0.286, 0.000)
		colorUpland    (0.398, 0.359, 0.301, 0.000)
		colorRock      (0.416, 0.376, 0.315, 0.000)
		colorSnow      (0.435, 0.394, 0.329, 1.000)
		BumpHeight      11.0537
		BumpOffset      2.21074
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.728187
		GasToDust   0.25
		Particles   2450
		GasBright   0.236167
		DustBright  0.451744
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   544.29
		Period          3262.66
		Eccentricity    0.695663
		Inclination     -7.42389
		AscendingNode   -160.681
		ArgOfPericenter 154.933
		MeanAnomaly     -177.552
	}
}

Comet	"C131"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            1.95861e-017
	Radius          0.0345822
	InertiaMoment   0.397989

	Oblateness      0.00637879

	RotationPeriod  56.0204
	Obliquity       162.697
	EqAscendNode    225.892
	//Precession      0

	AbsMagn         13.3705
	SlopeParam      3.04316
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.593 0.590 0.585)

	Surface
	{
		SurfStyle       0.561831
		OceanStyle      0.287944
		Randomize      (0.762, 0.582, -0.526)
		colorDistMagn   0.855045
		colorDistFreq   9.46544e-007
		detailScale     0.944325
		colorConversion true
		snowLevel       2
		tropicLatitude  0.40678
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.304647
		terraceProb     0.215311
		erosion         0
		montesMagn      0.46607
		montesFreq      3.27709
		montesSpiky     0.812266
		montesFraction  0.414082
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.08065e-006
		hillsFraction   0.668788
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.189298
		craterFreq      0.211294
		craterDensity   0.905451
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.466475
		volcanoTemp     1382.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.231, 0.201, 0.164, 0.000)
		colorShelf     (0.237, 0.206, 0.187, 0.000)
		colorBeach     (0.279, 0.242, 0.222, 0.000)
		colorDesert    (0.303, 0.259, 0.217, 0.000)
		colorLowland   (0.332, 0.277, 0.246, 0.000)
		colorUpland    (0.368, 0.336, 0.299, 0.000)
		colorRock      (0.398, 0.366, 0.322, 0.000)
		colorSnow      (0.433, 0.389, 0.339, 1.000)
		BumpHeight      0.031124
		BumpOffset      0.0062248
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.149836
		DustBright  0.222561
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   596.108
		Period          3739.51
		Eccentricity    0.847876
		Inclination     173.268
		AscendingNode   6.6098
		ArgOfPericenter -56.7842
		MeanAnomaly     23.8235
	}
}

Comet	"C132"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            1.51485e-013
	Radius          0.760751
	InertiaMoment   0.399744

	Oblateness      0.00945001

	RotationPeriod  54.1755
	Obliquity       115.902
	EqAscendNode    210.47
	//Precession      0

	AbsMagn         8.73152
	SlopeParam      3.63835
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.470 0.467 0.462)

	Surface
	{
		SurfStyle       0.233506
		OceanStyle      0.43374
		Randomize      (0.629, -0.645, -0.317)
		colorDistMagn   0.160468
		colorDistFreq   0.000290113
		detailScale     20.7736
		colorConversion true
		snowLevel       2
		tropicLatitude  0.651657
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.539099
		terraceProb     0.112798
		erosion         0
		montesMagn      0.638278
		montesFreq      3.6627
		montesSpiky     0.967285
		montesFraction  0.467094
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00158588
		hillsFraction   0.509798
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239019
		craterFreq      0.258117
		craterDensity   0.840969
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.472563
		volcanoTemp     1099.14
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.188, 0.187, 0.185, 0.000)
		colorShelf     (0.200, 0.199, 0.196, 0.000)
		colorBeach     (0.211, 0.210, 0.208, 0.000)
		colorDesert    (0.223, 0.222, 0.219, 0.000)
		colorLowland   (0.235, 0.234, 0.231, 0.000)
		colorUpland    (0.247, 0.245, 0.242, 0.000)
		colorRock      (0.258, 0.257, 0.254, 0.000)
		colorSnow      (0.270, 0.269, 0.266, 1.000)
		BumpHeight      0.684676
		BumpOffset      0.136935
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.279821
		GasToDust   0.25
		Particles   1545
		GasBright   0.395368
		DustBright  0.461517
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   636.83
		Period          4129.16
		Eccentricity    0.726558
		Inclination     101.534
		AscendingNode   -16.3214
		ArgOfPericenter 74.6628
		MeanAnomaly     70.8559
	}
}

Comet	"C133"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            1.17163e-009
	Radius          13.4919
	InertiaMoment   0.398592

	Oblateness      0.00726863

	RotationPeriod  52.3468
	Obliquity       69.1081
	EqAscendNode    195.047
	//Precession      0

	AbsMagn         5.10754
	SlopeParam      4.20253
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.799 0.797 0.795)

	Surface
	{
		SurfStyle       0.840832
		OceanStyle      0.504766
		Randomize      (0.686, 0.939, -0.774)
		colorDistMagn   0.995008
		colorDistFreq   0.143904
		detailScale     368.418
		colorConversion true
		snowLevel       2
		tropicLatitude  0.404434
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.463791
		terraceProb     0.299875
		erosion         0
		montesMagn      0.529137
		montesFreq      2.24661
		montesSpiky     0.97237
		montesFraction  0.59853
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.600517
		hillsFraction   0.739845
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227808
		craterFreq      0.174437
		craterDensity   1.02283
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.468341
		volcanoTemp     1875.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.312, 0.271, 0.223, 0.000)
		colorShelf     (0.320, 0.279, 0.254, 0.000)
		colorBeach     (0.376, 0.327, 0.302, 0.000)
		colorDesert    (0.408, 0.351, 0.294, 0.000)
		colorLowland   (0.448, 0.375, 0.334, 0.000)
		colorUpland    (0.496, 0.454, 0.405, 0.000)
		colorRock      (0.535, 0.494, 0.437, 0.000)
		colorSnow      (0.583, 0.526, 0.461, 1.000)
		BumpHeight      12.1427
		BumpOffset      2.42854
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.761013
		GasToDust   0.25
		Particles   2517
		GasBright   0.0110693
		DustBright  0.530302
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   532.444
		Period          3156.73
		Eccentricity    0.820477
		Inclination     67.2582
		AscendingNode   -154.35
		ArgOfPericenter 154.418
		MeanAnomaly     153.556
	}
}

Comet	"C134"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            3.60752e-017
	Radius          0.0471217
	InertiaMoment   0.396311

	Oblateness      0.0107018

	RotationPeriod  50.5291
	Obliquity       22.3138
	EqAscendNode    179.625
	//Precession      0

	AbsMagn         12.8954
	SlopeParam      4.78365
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.457 0.451 0.448)

	Surface
	{
		SurfStyle       0.829941
		OceanStyle      0.510168
		Randomize      (-0.005, -0.120, -0.150)
		colorDistMagn   0.424706
		colorDistFreq   9.11875e-007
		detailScale     1.28674
		colorConversion true
		snowLevel       2
		tropicLatitude  0.938848
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.335669
		terraceProb     0.387303
		erosion         0
		montesMagn      0.275441
		montesFreq      2.909
		montesSpiky     0.943342
		montesFraction  0.793284
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.63625e-006
		hillsFraction   0.721807
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228037
		craterFreq      0.214929
		craterDensity   0.742342
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.522425
		volcanoTemp     1370.92
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.178, 0.153, 0.125, 0.000)
		colorShelf     (0.183, 0.158, 0.143, 0.000)
		colorBeach     (0.215, 0.185, 0.170, 0.000)
		colorDesert    (0.233, 0.199, 0.166, 0.000)
		colorLowland   (0.256, 0.212, 0.188, 0.000)
		colorUpland    (0.283, 0.257, 0.228, 0.000)
		colorRock      (0.306, 0.280, 0.246, 0.000)
		colorSnow      (0.333, 0.298, 0.260, 1.000)
		BumpHeight      0.0424095
		BumpOffset      0.00848191
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0179538
		DustBright  0.207903
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   335.53
		Period          1579.15
		Eccentricity    0.772248
		Inclination     123.892
		AscendingNode   122.975
		ArgOfPericenter 103.638
		MeanAnomaly     128.451
	}
}

Comet	"C135"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            2.79016e-013
	Radius          0.834058
	InertiaMoment   0.399089

	Oblateness      0.00834051

	RotationPeriod  48.7179
	Obliquity       335.52
	EqAscendNode    164.202
	//Precession      0

	AbsMagn         8.52029
	SlopeParam      5.44159
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.765 0.692 0.567)

	Surface
	{
		SurfStyle       0.796356
		OceanStyle      0.157429
		Randomize      (-0.406, 0.301, -0.283)
		colorDistMagn   0.0625343
		colorDistFreq   0.000374814
		detailScale     22.7753
		colorConversion true
		snowLevel       2
		tropicLatitude  0.589797
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.328425
		terraceProb     0.417683
		erosion         0
		montesMagn      0.504642
		montesFreq      3.06193
		montesSpiky     0.833282
		montesFraction  0.321981
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00136977
		hillsFraction   0.653673
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246892
		craterFreq      0.264304
		craterDensity   0.852637
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.457241
		volcanoTemp     1351.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.298, 0.235, 0.159, 0.000)
		colorShelf     (0.306, 0.242, 0.181, 0.000)
		colorBeach     (0.359, 0.284, 0.215, 0.000)
		colorDesert    (0.390, 0.304, 0.210, 0.000)
		colorLowland   (0.428, 0.325, 0.238, 0.000)
		colorUpland    (0.474, 0.394, 0.289, 0.000)
		colorRock      (0.512, 0.429, 0.312, 0.000)
		colorSnow      (0.558, 0.457, 0.329, 1.000)
		BumpHeight      0.750652
		BumpOffset      0.15013
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.312647
		GasToDust   0.25
		Particles   1611
		GasBright   0.0984091
		DustBright  0.611935
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   501.688
		Period          2887.2
		Eccentricity    0.750609
		Inclination     168.276
		AscendingNode   -7.07594
		ArgOfPericenter 127.695
		MeanAnomaly     129.006
	}
}

Comet	"C136"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            2.15799e-009
	Radius          18.4162
	InertiaMoment   0.39761

	Oblateness      0.0124523

	RotationPeriod  46.9086
	Obliquity       288.725
	EqAscendNode    148.779
	//Precession      0

	AbsMagn         4.82947
	SlopeParam      6.31592
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.798 0.796 0.793)

	Surface
	{
		SurfStyle       0.209779
		OceanStyle      0.544119
		Randomize      (-0.063, -0.717, -0.483)
		colorDistMagn   0.123493
		colorDistFreq   0.157477
		detailScale     502.885
		colorConversion true
		snowLevel       2
		tropicLatitude  0.99483
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.711721
		terraceProb     0.288629
		erosion         0
		montesMagn      0.641813
		montesFreq      3.62316
		montesSpiky     0.981664
		montesFraction  0.40971
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.773742
		hillsFraction   0.437543
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.204396
		craterFreq      0.248156
		craterDensity   0.856822
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.585703
		volcanoTemp     1712.71
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
		colorSnow      (0.459, 0.457, 0.456, 1.000)
		BumpHeight      16.5746
		BumpOffset      3.31491
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.793839
		GasToDust   0.25
		Particles   2583
		GasBright   0.0780116
		DustBright  0.316819
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   508.614
		Period          2947.19
		Eccentricity    0.582475
		Inclination     -55.1171
		AscendingNode   68.4674
		ArgOfPericenter 150.365
		MeanAnomaly     173.747
	}
}

Comet	"C137"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            6.64462e-017
	Radius          0.0515466
	InertiaMoment   0.399534

	Oblateness      0.00966456

	RotationPeriod  45.0964
	Obliquity       241.931
	EqAscendNode    133.357
	//Precession      0

	AbsMagn         12.4808
	SlopeParam      8.55596
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.551 0.548 0.546)

	Surface
	{
		SurfStyle       0.597434
		OceanStyle      0.240278
		Randomize      (0.925, -0.765, 0.355)
		colorDistMagn   0.936139
		colorDistFreq   1.73886e-006
		detailScale     1.40757
		colorConversion true
		snowLevel       2
		tropicLatitude  0.943678
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.280452
		terraceProb     0.29714
		erosion         0
		montesMagn      0.525961
		montesFreq      4.22763
		montesSpiky     0.883325
		montesFraction  0.759616
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.97748e-006
		hillsFraction   0.802973
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227558
		craterFreq      0.178587
		craterDensity   0.827335
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.476579
		volcanoTemp     1399.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.215, 0.186, 0.153, 0.000)
		colorShelf     (0.221, 0.192, 0.175, 0.000)
		colorBeach     (0.259, 0.225, 0.207, 0.000)
		colorDesert    (0.281, 0.241, 0.202, 0.000)
		colorLowland   (0.309, 0.257, 0.229, 0.000)
		colorUpland    (0.342, 0.312, 0.278, 0.000)
		colorRock      (0.369, 0.340, 0.300, 0.000)
		colorSnow      (0.402, 0.361, 0.316, 1.000)
		BumpHeight      0.0463919
		BumpOffset      0.00927839
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.225657
		DustBright  0.65366
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   463.189
		Period          2561.32
		Eccentricity    0.825071
		Inclination     -119.902
		AscendingNode   -42.3363
		ArgOfPericenter -155.398
		MeanAnomaly     150.19
	}
}

Comet	"C138"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            5.13913e-013
	Radius          1.14072
	InertiaMoment   0.398314

	Oblateness      0.0146382

	RotationPeriod  43.2769
	Obliquity       195.137
	EqAscendNode    117.934
	//Precession      0

	AbsMagn         8.3105
	SlopeParam      2.70941
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.750 0.746 0.742)

	Surface
	{
		SurfStyle       0.758657
		OceanStyle      0.873214
		Randomize      (-0.482, 0.101, -0.686)
		colorDistMagn   0.905061
		colorDistFreq   0.00064077
		detailScale     31.1493
		colorConversion true
		snowLevel       2
		tropicLatitude  0.551345
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.319816
		terraceProb     0.37849
		erosion         0
		montesMagn      0.293684
		montesFreq      2.85337
		montesSpiky     0.801609
		montesFraction  0.471878
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00210737
		hillsFraction   0.464235
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233283
		craterFreq      0.222689
		craterDensity   0.798421
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53138
		volcanoTemp     1657.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.292, 0.254, 0.208, 0.000)
		colorShelf     (0.300, 0.261, 0.238, 0.000)
		colorBeach     (0.352, 0.306, 0.282, 0.000)
		colorDesert    (0.382, 0.328, 0.275, 0.000)
		colorLowland   (0.420, 0.350, 0.312, 0.000)
		colorUpland    (0.465, 0.425, 0.379, 0.000)
		colorRock      (0.502, 0.462, 0.408, 0.000)
		colorSnow      (0.547, 0.492, 0.431, 1.000)
		BumpHeight      1.02665
		BumpOffset      0.20533
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.345472
		GasToDust   0.25
		Particles   1677
		GasBright   0.177978
		DustBright  0.385826
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   492.954
		Period          2812.14
		Eccentricity    0.755208
		Inclination     142.163
		AscendingNode   -63.3212
		ArgOfPericenter 120.559
		MeanAnomaly     -157.267
	}
}

Comet	"C139"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            3.97474e-009
	Radius          20.0931
	InertiaMoment   0.399956

	Oblateness      0.0113478

	RotationPeriod  41.4452
	Obliquity       148.342
	EqAscendNode    102.512
	//Precession      0

	AbsMagn         4.53516
	SlopeParam      3.34394
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.646 0.641 0.639)

	Surface
	{
		SurfStyle       0.887529
		OceanStyle      0.293048
		Randomize      (0.194, -0.911, 0.361)
		colorDistMagn   0.407785
		colorDistFreq   0.0594903
		detailScale     548.677
		colorConversion true
		snowLevel       2
		tropicLatitude  0.909187
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.416631
		terraceProb     0.226389
		erosion         0
		montesMagn      0.674307
		montesFreq      3.23229
		montesSpiky     0.992123
		montesFraction  0.531719
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.800525
		hillsFraction   0.940446
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23374
		craterFreq      0.214912
		craterDensity   0.768021
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.544028
		volcanoTemp     1826.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.220, 0.224, 0.256, 0.050)
		colorShelf     (0.258, 0.263, 0.294, 0.040)
		colorBeach     (0.297, 0.301, 0.332, 0.030)
		colorDesert    (0.336, 0.340, 0.377, 0.020)
		colorLowland   (0.375, 0.378, 0.415, 0.030)
		colorUpland    (0.414, 0.417, 0.454, 0.050)
		colorRock      (0.452, 0.455, 0.505, 0.020)
		colorSnow      (0.452, 0.455, 0.505, 1.000)
		BumpHeight      18.0838
		BumpOffset      3.61676
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.826664
		GasToDust   0.25
		Particles   2649
		GasBright   0.0930389
		DustBright  0.155251
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   368.169
		Period          1815.09
		Eccentricity    0.687438
		Inclination     92.4058
		AscendingNode   -30.4361
		ArgOfPericenter -178.558
		MeanAnomaly     -157.397
	}
}

Comet	"C140"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            1.22385e-016
	Radius          0.0706578
	InertiaMoment   0.398852

	Oblateness      0.0174851

	RotationPeriod  39.5964
	Obliquity       101.548
	EqAscendNode    87.0891
	//Precession      0

	AbsMagn         12.1095
	SlopeParam      3.91737
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.534 0.439 0.356)

	Surface
	{
		SurfStyle       0.62569
		OceanStyle      0.152226
		Randomize      (0.956, -0.957, 0.838)
		colorDistMagn   0.10744
		colorDistFreq   2.18803e-006
		detailScale     1.92943
		colorConversion true
		snowLevel       2
		tropicLatitude  0.982479
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.577359
		terraceProb     0.107922
		erosion         0
		montesMagn      0.534308
		montesFreq      3.36555
		montesSpiky     0.99251
		montesFraction  0.78715
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.36011e-006
		hillsFraction   0.788328
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246109
		craterFreq      0.26731
		craterDensity   0.955059
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.510437
		volcanoTemp     1288.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.208, 0.149, 0.100, 0.000)
		colorShelf     (0.214, 0.154, 0.114, 0.000)
		colorBeach     (0.251, 0.180, 0.135, 0.000)
		colorDesert    (0.273, 0.193, 0.132, 0.000)
		colorLowland   (0.299, 0.206, 0.150, 0.000)
		colorUpland    (0.331, 0.250, 0.182, 0.000)
		colorRock      (0.358, 0.272, 0.196, 0.000)
		colorSnow      (0.390, 0.290, 0.207, 1.000)
		BumpHeight      0.063592
		BumpOffset      0.0127184
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.317852
		DustBright  0.414925
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   392.655
		Period          1999.14
		Eccentricity    0.603947
		Inclination     23.3912
		AscendingNode   -162.084
		ArgOfPericenter -172.149
		MeanAnomaly     -51.9894
	}
}

Comet	"C141"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            9.46562e-013
	Radius          1.24075
	InertiaMoment   0.397118

	Oblateness      0.0133983

	RotationPeriod  37.7252
	Obliquity       54.7537
	EqAscendNode    71.6665
	//Precession      0

	AbsMagn         8.10157
	SlopeParam      4.48394
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.636 0.603 0.548)

	Surface
	{
		SurfStyle       0.229222
		OceanStyle      0.0206823
		Randomize      (-0.186, -0.168, -0.122)
		colorDistMagn   0.858496
		colorDistFreq   0.00120325
		detailScale     33.8809
		colorConversion true
		snowLevel       2
		tropicLatitude  0.852126
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.404837
		terraceProb     0.344681
		erosion         0
		montesMagn      0.419628
		montesFreq      3.46542
		montesSpiky     0.839527
		montesFraction  0.542953
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00472023
		hillsFraction   0.591494
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.206766
		craterFreq      0.207132
		craterDensity   0.791904
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.467713
		volcanoTemp     1343.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.254, 0.241, 0.219, 0.000)
		colorShelf     (0.270, 0.256, 0.233, 0.000)
		colorBeach     (0.286, 0.271, 0.247, 0.000)
		colorDesert    (0.302, 0.286, 0.260, 0.000)
		colorLowland   (0.318, 0.301, 0.274, 0.000)
		colorUpland    (0.334, 0.316, 0.288, 0.000)
		colorRock      (0.350, 0.331, 0.301, 0.000)
		colorSnow      (0.366, 0.347, 0.315, 1.000)
		BumpHeight      1.11668
		BumpOffset      0.223336
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.378298
		GasToDust   0.25
		Particles   1744
		GasBright   0.205631
		DustBright  0.211632
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   482.944
		Period          2726.91
		Eccentricity    0.718888
		Inclination     -30.3945
		AscendingNode   -86.4536
		ArgOfPericenter -138.781
		MeanAnomaly     32.6135
	}
}

Comet	"C142"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            7.32098e-009
	Radius          27.6148
	InertiaMoment   0.399318

	Oblateness      0.0213527

	RotationPeriod  35.8257
	Obliquity       7.95943
	EqAscendNode    56.2439
	//Precession      0

	AbsMagn         4.22078
	SlopeParam      5.09321
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.416 0.412 0.410)

	Surface
	{
		SurfStyle       0.802577
		OceanStyle      0.755546
		Randomize      (0.574, 0.732, 0.254)
		colorDistMagn   0.561081
		colorDistFreq   0.459453
		detailScale     754.068
		colorConversion true
		snowLevel       2
		tropicLatitude  0.233859
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.767869
		terraceProb     0.144424
		erosion         0
		montesMagn      0.568269
		montesFreq      3.17092
		montesSpiky     0.99578
		montesFraction  0.596716
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.5799
		hillsFraction   0.659896
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23104
		craterFreq      0.194535
		craterDensity   0.870186
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.533694
		volcanoTemp     1393.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.162, 0.140, 0.115, 0.000)
		colorShelf     (0.166, 0.144, 0.131, 0.000)
		colorBeach     (0.195, 0.169, 0.156, 0.000)
		colorDesert    (0.212, 0.181, 0.152, 0.000)
		colorLowland   (0.233, 0.194, 0.172, 0.000)
		colorUpland    (0.258, 0.235, 0.209, 0.000)
		colorRock      (0.278, 0.256, 0.226, 0.000)
		colorSnow      (0.303, 0.272, 0.238, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.85949
		GasToDust   0.25
		Particles   2716
		GasBright   0.0467594
		DustBright  0.854991
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   416.171
		Period          2181.4
		Eccentricity    0.562067
		Inclination     -173.693
		AscendingNode   37.2824
		ArgOfPericenter 6.9828
		MeanAnomaly     170.436
	}
}

Comet	"C143"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            2.25418e-016
	Radius          0.0765637
	InertiaMoment   0.397997

	Oblateness      0.0164334

	RotationPeriod  33.8917
	Obliquity       321.165
	EqAscendNode    40.8213
	//Precession      0

	AbsMagn         11.7706
	SlopeParam      5.82884
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.514 0.442 0.388)

	Surface
	{
		SurfStyle       0.510645
		OceanStyle      0.533048
		Randomize      (-0.156, -0.917, 0.439)
		colorDistMagn   0.915637
		colorDistFreq   1.68703e-006
		detailScale     2.0907
		colorConversion true
		snowLevel       2
		tropicLatitude  0.98178
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.483517
		terraceProb     0.331824
		erosion         0
		montesMagn      0.302737
		montesFreq      3.21417
		montesSpiky     0.926256
		montesFraction  0.753548
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.40811e-005
		hillsFraction   0.578721
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.21373
		craterFreq      0.251962
		craterDensity   0.845857
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.476879
		volcanoTemp     1411.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.200, 0.150, 0.109, 0.000)
		colorShelf     (0.205, 0.155, 0.124, 0.000)
		colorBeach     (0.241, 0.181, 0.147, 0.000)
		colorDesert    (0.262, 0.194, 0.144, 0.000)
		colorLowland   (0.288, 0.208, 0.163, 0.000)
		colorUpland    (0.318, 0.252, 0.198, 0.000)
		colorRock      (0.344, 0.274, 0.213, 0.000)
		colorSnow      (0.375, 0.292, 0.225, 1.000)
		BumpHeight      0.0689073
		BumpOffset      0.0137815
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0650132
		DustBright  0.521223
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   491.124
		Period          2796.49
		Eccentricity    0.570259
		Inclination     62.1629
		AscendingNode   177.026
		ArgOfPericenter -11.9061
		MeanAnomaly     135.35
	}
}

Comet	"C144"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            1.74345e-012
	Radius          1.7105
	InertiaMoment   0.399749

	Oblateness      0.0268926

	RotationPeriod  31.916
	Obliquity       274.371
	EqAscendNode    25.3987
	//Precession      0

	AbsMagn         7.89291
	SlopeParam      6.97909
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.817 0.742 0.677)

	Surface
	{
		SurfStyle       0.659032
		OceanStyle      0.385174
		Randomize      (-0.889, 0.504, -0.629)
		colorDistMagn   0.231869
		colorDistFreq   0.00094906
		detailScale     46.7081
		colorConversion true
		snowLevel       2
		tropicLatitude  0.707485
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.763137
		terraceProb     0.200631
		erosion         0
		montesMagn      0.628297
		montesFreq      3.74303
		montesSpiky     0.985144
		montesFraction  0.463822
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00746029
		hillsFraction   0.723971
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230573
		craterFreq      0.163624
		craterDensity   0.83407
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.427906
		volcanoTemp     1400.32
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.318, 0.252, 0.190, 0.000)
		colorShelf     (0.327, 0.260, 0.217, 0.000)
		colorBeach     (0.384, 0.304, 0.257, 0.000)
		colorDesert    (0.416, 0.327, 0.251, 0.000)
		colorLowland   (0.457, 0.349, 0.284, 0.000)
		colorUpland    (0.506, 0.423, 0.345, 0.000)
		colorRock      (0.547, 0.460, 0.372, 0.000)
		colorSnow      (0.596, 0.490, 0.393, 1.000)
		BumpHeight      1.53945
		BumpOffset      0.307891
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.411124
		GasToDust   0.25
		Particles   1810
		GasBright   0.0460079
		DustBright  0.224715
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   263.98
		Period          1102.01
		Eccentricity    0.51736
		Inclination     -118.693
		AscendingNode   148.195
		ArgOfPericenter 109.519
		MeanAnomaly     -76.7407
	}
}

Comet	"C145"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            1.34843e-008
	Radius          29.7773
	InertiaMoment   0.398599

	Oblateness      0.0208242

	RotationPeriod  29.8907
	Obliquity       227.577
	EqAscendNode    9.97612
	//Precession      0

	AbsMagn         3.88112
	SlopeParam      2.33498
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.754 0.751 0.746)

	Surface
	{
		SurfStyle       0.134101
		OceanStyle      0.0576783
		Randomize      (-0.235, -0.170, -0.441)
		colorDistMagn   0.479785
		colorDistFreq   0.367866
		detailScale     813.118
		colorConversion true
		snowLevel       2
		tropicLatitude  0.859701
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.538714
		terraceProb     0.321892
		erosion         0
		montesMagn      0.327539
		montesFreq      3.75548
		montesSpiky     0.841632
		montesFraction  0.720485
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.21564
		hillsFraction   0.785008
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.288887
		craterFreq      0.191912
		craterDensity   0.834361
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.556842
		volcanoTemp     1400.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.301, 0.300, 0.299, 0.000)
		colorShelf     (0.320, 0.319, 0.317, 0.000)
		colorBeach     (0.339, 0.338, 0.336, 0.000)
		colorDesert    (0.358, 0.357, 0.355, 0.000)
		colorLowland   (0.377, 0.375, 0.373, 0.000)
		colorUpland    (0.396, 0.394, 0.392, 0.000)
		colorRock      (0.414, 0.413, 0.410, 0.000)
		colorSnow      (0.433, 0.432, 0.429, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.892316
		GasToDust   0.25
		Particles   2782
		GasBright   0.172935
		DustBright  0.582274
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   411.914
		Period          2148.01
		Eccentricity    0.678105
		Inclination     -139.572
		AscendingNode   89.6739
		ArgOfPericenter -35.6668
		MeanAnomaly     155.096
	}
}

Comet	"C146"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            4.15191e-016
	Radius          0.105951
	InertiaMoment   0.396339

	Oblateness      0.0349074

	RotationPeriod  27.8064
	Obliquity       180.782
	EqAscendNode    354.554
	//Precession      0

	AbsMagn         11.4568
	SlopeParam      3.0345
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.513 0.506 0.502)

	Surface
	{
		SurfStyle       0.0884487
		OceanStyle      0.322824
		Randomize      (0.586, -0.930, 0.337)
		colorDistMagn   0.470483
		colorDistFreq   5.46864e-006
		detailScale     2.89318
		colorConversion true
		snowLevel       2
		tropicLatitude  0.404995
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.730174
		terraceProb     0.2659
		erosion         0
		montesMagn      0.59087
		montesFreq      2.17781
		montesSpiky     0.990538
		montesFraction  0.483877
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.84351e-005
		hillsFraction   0.653621
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235444
		craterFreq      0.240859
		craterDensity   0.947899
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.468884
		volcanoTemp     1386.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.205, 0.202, 0.201, 0.000)
		colorShelf     (0.218, 0.215, 0.213, 0.000)
		colorBeach     (0.231, 0.228, 0.226, 0.000)
		colorDesert    (0.244, 0.240, 0.238, 0.000)
		colorLowland   (0.257, 0.253, 0.251, 0.000)
		colorUpland    (0.269, 0.265, 0.263, 0.000)
		colorRock      (0.282, 0.278, 0.276, 0.000)
		colorSnow      (0.295, 0.291, 0.288, 1.000)
		BumpHeight      0.0953562
		BumpOffset      0.0190712
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.126648
		DustBright  0.313048
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   570.928
		Period          3505.09
		Eccentricity    0.692443
		Inclination     -23.4721
		AscendingNode   -121.602
		ArgOfPericenter 82.0443
		MeanAnomaly     -131.232
	}
}

Comet	"C147"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            3.21122e-012
	Radius          1.83179
	InertiaMoment   0.399094

	Oblateness      0.027691

	RotationPeriod  25.652
	Obliquity       133.988
	EqAscendNode    339.131
	//Precession      0

	AbsMagn         7.68396
	SlopeParam      3.6305
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.534 0.531 0.528)

	Surface
	{
		SurfStyle       0.460612
		OceanStyle      0.971875
		Randomize      (-0.616, -0.268, -0.403)
		colorDistMagn   0.944622
		colorDistFreq   0.00231199
		detailScale     50.0201
		colorConversion true
		snowLevel       2
		tropicLatitude  0.81777
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.453732
		terraceProb     0.287911
		erosion         0
		montesMagn      0.458339
		montesFreq      3.38038
		montesSpiky     0.691853
		montesFraction  0.250118
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00922142
		hillsFraction   0.710274
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236556
		craterFreq      0.255774
		craterDensity   0.744783
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.461333
		volcanoTemp     1281.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.213, 0.212, 0.211, 0.000)
		colorShelf     (0.227, 0.226, 0.224, 0.000)
		colorBeach     (0.240, 0.239, 0.238, 0.000)
		colorDesert    (0.254, 0.252, 0.251, 0.000)
		colorLowland   (0.267, 0.265, 0.264, 0.000)
		colorUpland    (0.280, 0.279, 0.277, 0.000)
		colorRock      (0.294, 0.292, 0.290, 0.000)
		colorSnow      (0.307, 0.305, 0.304, 1.000)
		BumpHeight      1.64861
		BumpOffset      0.329722
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.44395
		GasToDust   0.25
		Particles   1876
		GasBright   0.320766
		DustBright  0.603417
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   541.104
		Period          3234.06
		Eccentricity    0.66089
		Inclination     -129.034
		AscendingNode   75.6881
		ArgOfPericenter -90.2342
		MeanAnomaly     98.1769
	}
}

Comet	"C148"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            2.48364e-008
	Radius          41.4086
	InertiaMoment   0.397621

	Oblateness      0.0493674

	RotationPeriod  23.4143
	Obliquity       87.1936
	EqAscendNode    323.708
	//Precession      0

	AbsMagn         3.50883
	SlopeParam      4.19477
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.750 0.748 0.747)

	Surface
	{
		SurfStyle       0.192163
		OceanStyle      0.332133
		Randomize      (-0.382, 0.283, -0.765)
		colorDistMagn   0.496741
		colorDistFreq   0.913857
		detailScale     1130.73
		colorConversion true
		snowLevel       2
		tropicLatitude  0.996521
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.616041
		terraceProb     0.454319
		erosion         0
		montesMagn      0.604969
		montesFreq      3.28523
		montesSpiky     0.785869
		montesFraction  0.528141
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.45861
		hillsFraction   0.710732
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.275688
		craterFreq      0.211723
		craterDensity   0.88827
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.483205
		volcanoTemp     1635.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.300, 0.299, 0.299, 0.000)
		colorShelf     (0.319, 0.318, 0.318, 0.000)
		colorBeach     (0.337, 0.337, 0.336, 0.000)
		colorDesert    (0.356, 0.355, 0.355, 0.000)
		colorLowland   (0.375, 0.374, 0.374, 0.000)
		colorUpland    (0.394, 0.393, 0.392, 0.000)
		colorRock      (0.412, 0.411, 0.411, 0.000)
		colorSnow      (0.431, 0.430, 0.430, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.925142
		GasToDust   0.25
		Particles   2848
		GasBright   0.247196
		DustBright  0.361473
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   251.289
		Period          1023.5
		Eccentricity    0.57609
		Inclination     5.41851
		AscendingNode   -111.519
		ArgOfPericenter 6.86901
		MeanAnomaly     127.426
	}
}

Comet	"C149"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            7.64732e-016
	Radius          0.112098
	InertiaMoment   0.399539

	Oblateness      0.0395367

	RotationPeriod  21.0774
	Obliquity       40.3994
	EqAscendNode    308.286
	//Precession      0

	AbsMagn         11.163
	SlopeParam      4.77532
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.632 0.628 0.625)

	Surface
	{
		SurfStyle       0.707796
		OceanStyle      0.907697
		Randomize      (0.463, -0.145, 0.166)
		colorDistMagn   0.655068
		colorDistFreq   1.59823e-006
		detailScale     3.06103
		colorConversion true
		snowLevel       2
		tropicLatitude  0.64363
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.511454
		terraceProb     0.420991
		erosion         0
		montesMagn      0.541941
		montesFreq      3.1825
		montesSpiky     0.924496
		montesFraction  0.307109
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.17948e-005
		hillsFraction   0.778334
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226327
		craterFreq      0.234162
		craterDensity   0.82634
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.470905
		volcanoTemp     1484.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.246, 0.213, 0.175, 0.000)
		colorShelf     (0.253, 0.220, 0.200, 0.000)
		colorBeach     (0.297, 0.257, 0.237, 0.000)
		colorDesert    (0.322, 0.276, 0.231, 0.000)
		colorLowland   (0.354, 0.295, 0.262, 0.000)
		colorUpland    (0.392, 0.358, 0.319, 0.000)
		colorRock      (0.423, 0.389, 0.344, 0.000)
		colorSnow      (0.461, 0.414, 0.362, 1.000)
		BumpHeight      0.100888
		BumpOffset      0.0201777
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.136368
		DustBright  0.156788
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   581.946
		Period          3607.04
		Eccentricity    0.693669
		Inclination     -64.62
		AscendingNode   -41.4459
		ArgOfPericenter -136.266
		MeanAnomaly     38.3534
	}
}

Comet	"C150"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            5.91465e-012
	Radius          2.56492
	InertiaMoment   0.398321

	Oblateness      0.0780994

	RotationPeriod  18.6211
	Obliquity       353.605
	EqAscendNode    292.863
	//Precession      0

	AbsMagn         7.47414
	SlopeParam      5.43161
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.539 0.534 0.531)

	Surface
	{
		SurfStyle       0.369122
		OceanStyle      0.917149
		Randomize      (-0.135, -0.047, -0.412)
		colorDistMagn   0.0207747
		colorDistFreq   0.00262238
		detailScale     70.0395
		colorConversion true
		snowLevel       2
		tropicLatitude  0.985713
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.580884
		terraceProb     0.239978
		erosion         0
		montesMagn      0.536251
		montesFreq      3.24628
		montesSpiky     0.8594
		montesFraction  0.376387
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0174953
		hillsFraction   0.767982
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22336
		craterFreq      0.237212
		craterDensity   0.842515
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.571539
		volcanoTemp     1831.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.216, 0.214, 0.212, 0.000)
		colorShelf     (0.229, 0.227, 0.225, 0.000)
		colorBeach     (0.243, 0.240, 0.239, 0.000)
		colorDesert    (0.256, 0.254, 0.252, 0.000)
		colorLowland   (0.270, 0.267, 0.265, 0.000)
		colorUpland    (0.283, 0.280, 0.279, 0.000)
		colorRock      (0.297, 0.294, 0.292, 0.000)
		colorSnow      (0.310, 0.307, 0.305, 1.000)
		BumpHeight      2.30843
		BumpOffset      0.461686
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.476776
		GasToDust   0.25
		Particles   1942
		GasBright   0.0188314
		DustBright  0.758811
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   537.792
		Period          3204.41
		Eccentricity    0.819982
		Inclination     96.8219
		AscendingNode   -117.106
		ArgOfPericenter 125.232
		MeanAnomaly     -140.489
	}
}

Comet	"C151"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            4.57456e-008
	Radius          66.9243
	InertiaMoment   0.399962

	Oblateness      0.243854

	RotationPeriod  16.0196
	Obliquity       306.811
	EqAscendNode    277.441
	//Precession      0

	AbsMagn         3.09292
	SlopeParam      6.3009
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.695 0.628 0.535)

	Surface
	{
		SurfStyle       0.604899
		OceanStyle      0.567171
		Randomize      (0.928, 0.741, -0.696)
		colorDistMagn   0.862461
		colorDistFreq   1.64161
		detailScale     1827.48
		colorConversion true
		snowLevel       2
		tropicLatitude  0.98379
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.342861
		terraceProb     0.147531
		erosion         0
		montesMagn      0.336712
		montesFreq      3.52988
		montesSpiky     0.930662
		montesFraction  0.836991
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.16339
		hillsFraction   0.713076
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257678
		craterFreq      0.235523
		craterDensity   0.921999
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.472197
		volcanoTemp     1824.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.271, 0.213, 0.150, 0.000)
		colorShelf     (0.278, 0.220, 0.171, 0.000)
		colorBeach     (0.327, 0.257, 0.203, 0.000)
		colorDesert    (0.355, 0.276, 0.198, 0.000)
		colorLowland   (0.389, 0.295, 0.225, 0.000)
		colorUpland    (0.431, 0.358, 0.273, 0.000)
		colorRock      (0.466, 0.389, 0.294, 0.000)
		colorSnow      (0.508, 0.414, 0.310, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.957968
		GasToDust   0.25
		Particles   2915
		GasBright   0.0384775
		DustBright  0.423652
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   355.974
		Period          1725.66
		Eccentricity    0.753773
		Inclination     -88.3535
		AscendingNode   -101.687
		ArgOfPericenter 89.5492
		MeanAnomaly     114.71
	}
}

Comet	"C152"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            1.40854e-015
	Radius          0.158876
	InertiaMoment   0.398859

	Oblateness      0.154492

	RotationPeriod  13.2395
	Obliquity       260.016
	EqAscendNode    262.018
	//Precession      0

	AbsMagn         10.8853
	SlopeParam      8.45824
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.684 0.584 0.426)

	Surface
	{
		SurfStyle       0.842825
		OceanStyle      0.288775
		Randomize      (0.637, -0.350, -0.159)
		colorDistMagn   0.879297
		colorDistFreq   1.88738e-005
		detailScale     4.33839
		colorConversion true
		snowLevel       2
		tropicLatitude  0.948871
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.270541
		terraceProb     0.144831
		erosion         0
		montesMagn      0.38784
		montesFreq      3.29018
		montesSpiky     0.925198
		montesFraction  0.623732
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.3207e-005
		hillsFraction   0.678721
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238428
		craterFreq      0.234932
		craterDensity   0.90158
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.529888
		volcanoTemp     1297.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.267, 0.198, 0.119, 0.000)
		colorShelf     (0.274, 0.204, 0.136, 0.000)
		colorBeach     (0.322, 0.239, 0.162, 0.000)
		colorDesert    (0.349, 0.257, 0.157, 0.000)
		colorLowland   (0.383, 0.274, 0.179, 0.000)
		colorUpland    (0.424, 0.333, 0.217, 0.000)
		colorRock      (0.458, 0.362, 0.234, 0.000)
		colorSnow      (0.499, 0.385, 0.247, 1.000)
		BumpHeight      0.142989
		BumpOffset      0.0285978
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0284102
		GasToDust   0.25
		Particles   1037
		GasBright   0.13471
		DustBright  0.811906
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   573.425
		Period          3528.11
		Eccentricity    0.678127
		Inclination     -132.448
		AscendingNode   53.4605
		ArgOfPericenter 163.002
		MeanAnomaly     19.2629
	}
}

Comet	"C153"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            1.0894e-011
	Radius          3.95405
	InertiaMoment   0.397133

	Oblateness      0.249

	RotationPeriod  10.2347
	Obliquity       213.222
	EqAscendNode    246.595
	//Precession      0

	AbsMagn         7.26287
	SlopeParam      2.69989
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.599 0.446 0.394)

	Surface
	{
		SurfStyle       0.410569
		OceanStyle      0.3079
		Randomize      (-0.421, -0.433, -0.500)
		colorDistMagn   0.980721
		colorDistFreq   0.00782017
		detailScale     107.972
		colorConversion true
		snowLevel       2
		tropicLatitude  0.778863
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.713424
		terraceProb     0.177404
		erosion         0
		montesMagn      0.517648
		montesFreq      3.09076
		montesSpiky     0.957765
		montesFraction  0.569519
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0526227
		hillsFraction   0.728274
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.281667
		craterFreq      0.238682
		craterDensity   0.860319
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.507879
		volcanoTemp     1586.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.240, 0.179, 0.158, 0.000)
		colorShelf     (0.255, 0.190, 0.168, 0.000)
		colorBeach     (0.270, 0.201, 0.177, 0.000)
		colorDesert    (0.285, 0.212, 0.187, 0.000)
		colorLowland   (0.300, 0.223, 0.197, 0.000)
		colorUpland    (0.315, 0.234, 0.207, 0.000)
		colorRock      (0.330, 0.245, 0.217, 0.000)
		colorSnow      (0.345, 0.257, 0.227, 1.000)
		BumpHeight      3.55865
		BumpOffset      0.711729
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.509602
		GasToDust   0.25
		Particles   2009
		GasBright   0.127074
		DustBright  0.504029
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   300.582
		Period          1338.97
		Eccentricity    0.395479
		Inclination     -162.062
		AscendingNode   1.32766
		ArgOfPericenter -38.5595
		MeanAnomaly     102.047
	}
}

Comet	"C154"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            8.42576e-008
	Radius          62.0933
	InertiaMoment   0.399324

	Oblateness      0.249

	RotationPeriod  6.94084
	Obliquity       166.428
	EqAscendNode    231.173
	//Precession      0

	AbsMagn         2.61587
	SlopeParam      3.33579
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.741 0.739 0.735)

	Surface
	{
		SurfStyle       0.611501
		OceanStyle      0.294186
		Randomize      (-0.649, 0.885, 0.789)
		colorDistMagn   0.977873
		colorDistFreq   1.99529
		detailScale     1695.56
		colorConversion true
		snowLevel       2
		tropicLatitude  0.703947
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.646138
		terraceProb     0.390689
		erosion         0
		montesMagn      0.407389
		montesFreq      3.48092
		montesSpiky     0.982303
		montesFraction  0.780594
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.1132
		hillsFraction   0.441392
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25366
		craterFreq      0.230226
		craterDensity   0.685611
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.394696
		volcanoTemp     1430.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.289, 0.251, 0.206, 0.000)
		colorShelf     (0.296, 0.259, 0.235, 0.000)
		colorBeach     (0.348, 0.303, 0.279, 0.000)
		colorDesert    (0.378, 0.325, 0.272, 0.000)
		colorLowland   (0.415, 0.347, 0.309, 0.000)
		colorUpland    (0.459, 0.421, 0.375, 0.000)
		colorRock      (0.496, 0.458, 0.404, 0.000)
		colorSnow      (0.541, 0.488, 0.426, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.990794
		GasToDust   0.25
		Particles   2981
		GasBright   0.0821784
		DustBright  0.23341
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   500.164
		Period          2874.06
		Eccentricity    0.694844
		Inclination     37.4723
		AscendingNode   115.397
		ArgOfPericenter 118.885
		MeanAnomaly     -78.4843
	}
}

Comet	"C155"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            2.59435e-015
	Radius          0.239521
	InertiaMoment   0.398006

	Oblateness      0.249

	RotationPeriod  3.26173
	Obliquity       119.634
	EqAscendNode    215.75
	//Precession      0

	AbsMagn         10.6209
	SlopeParam      3.90964
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.707 0.677 0.639)

	Surface
	{
		SurfStyle       0.708547
		OceanStyle      0.583676
		Randomize      (-0.786, -0.633, -0.343)
		colorDistMagn   0.00136423
		colorDistFreq   3.02746e-005
		detailScale     6.54052
		colorConversion true
		snowLevel       2
		tropicLatitude  0.947083
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.449731
		terraceProb     0.111606
		erosion         0
		montesMagn      0.643071
		montesFreq      2.6104
		montesSpiky     0.911172
		montesFraction  0.36218
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000121139
		hillsFraction   0.743854
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.278178
		craterFreq      0.228731
		craterDensity   0.963546
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.468524
		volcanoTemp     1298.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.276, 0.230, 0.179, 0.000)
		colorShelf     (0.283, 0.237, 0.204, 0.000)
		colorBeach     (0.332, 0.278, 0.243, 0.000)
		colorDesert    (0.361, 0.298, 0.236, 0.000)
		colorLowland   (0.396, 0.318, 0.268, 0.000)
		colorUpland    (0.438, 0.386, 0.326, 0.000)
		colorRock      (0.474, 0.420, 0.351, 0.000)
		colorSnow      (0.516, 0.447, 0.370, 1.000)
		BumpHeight      0.215569
		BumpOffset      0.0431138
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.061236
		GasToDust   0.25
		Particles   1103
		GasBright   0.255578
		DustBright  0.544497
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   291.802
		Period          1280.73
		Eccentricity    0.555346
		Inclination     -61.0477
		AscendingNode   42.5458
		ArgOfPericenter 114.012
		MeanAnomaly     -6.22868
	}
}

Comet	"C156"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            2.00655e-011
	Radius          3.84619
	InertiaMoment   0.399754

	Oblateness      0.00171896

	RotationPeriod  125.469
	Obliquity       72.8393
	EqAscendNode    200.328
	//Precession      0

	AbsMagn         7.04951
	SlopeParam      4.476
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.799 0.752 0.695)

	Surface
	{
		SurfStyle       0.613135
		OceanStyle      0.537849
		Randomize      (0.091, -0.916, 0.336)
		colorDistMagn   0.756473
		colorDistFreq   0.00778995
		detailScale     105.027
		colorConversion true
		snowLevel       2
		tropicLatitude  0.99057
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.614504
		terraceProb     0.384674
		erosion         0
		montesMagn      0.437618
		montesFreq      3.11068
		montesSpiky     0.990293
		montesFraction  0.571035
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0439584
		hillsFraction   0.751002
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230071
		craterFreq      0.184888
		craterDensity   0.849062
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.474801
		volcanoTemp     1524.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.312, 0.256, 0.195, 0.000)
		colorShelf     (0.320, 0.263, 0.222, 0.000)
		colorBeach     (0.376, 0.308, 0.264, 0.000)
		colorDesert    (0.407, 0.331, 0.257, 0.000)
		colorLowland   (0.447, 0.354, 0.292, 0.000)
		colorUpland    (0.495, 0.429, 0.354, 0.000)
		colorRock      (0.535, 0.466, 0.382, 0.000)
		colorSnow      (0.583, 0.497, 0.403, 1.000)
		BumpHeight      3.46157
		BumpOffset      0.692314
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.542428
		GasToDust   0.25
		Particles   2075
		GasBright   0.183401
		DustBright  0.301161
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   437.685
		Period          2352.72
		Eccentricity    0.832726
		Inclination     -72.9264
		AscendingNode   -104.173
		ArgOfPericenter -4.87893
		MeanAnomaly     -139.156
	}
}

Comet	"C157"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            1.55192e-007
	Radius          92.255
	InertiaMoment   0.398606

	Oblateness      0.00377292

	RotationPeriod  112.882
	Obliquity       26.045
	EqAscendNode    184.905
	//Precession      0

	AbsMagn         2.04685
	SlopeParam      5.08426
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.728 0.725 0.722)

	Surface
	{
		SurfStyle       0.526305
		OceanStyle      0.513149
		Randomize      (-0.790, 0.537, -0.767)
		colorDistMagn   0.212225
		colorDistFreq   3.68085
		detailScale     2519.18
		colorConversion true
		snowLevel       2
		tropicLatitude  0.661304
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.728911
		terraceProb     0.283411
		erosion         0
		montesMagn      0.230967
		montesFreq      2.70519
		montesSpiky     0.903226
		montesFraction  0.3365
		dunesFraction   0
		hillsMagn       0
		hillsFreq       13.1077
		hillsFraction   0.72573
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252874
		craterFreq      0.304084
		craterDensity   0.979974
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.564829
		volcanoTemp     1548.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.284, 0.246, 0.202, 0.000)
		colorShelf     (0.291, 0.254, 0.231, 0.000)
		colorBeach     (0.342, 0.297, 0.274, 0.000)
		colorDesert    (0.371, 0.319, 0.267, 0.000)
		colorLowland   (0.408, 0.341, 0.303, 0.000)
		colorUpland    (0.452, 0.413, 0.368, 0.000)
		colorRock      (0.488, 0.449, 0.397, 0.000)
		colorSnow      (0.532, 0.478, 0.419, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.423991
		DustBright  0.545058
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   601.351
		Period          3788.95
		Eccentricity    0.703253
		Inclination     114.743
		AscendingNode   20.2682
		ArgOfPericenter -65.8051
		MeanAnomaly     157.285
	}
}

Comet	"C158"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            4.77847e-015
	Radius          0.238241
	InertiaMoment   0.396367

	Oblateness      0.00240584

	RotationPeriod  105.278
	Obliquity       339.251
	EqAscendNode    169.482
	//Precession      0

	AbsMagn         10.3674
	SlopeParam      5.81715
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.526 0.435 0.361)

	Surface
	{
		SurfStyle       0.116721
		OceanStyle      0.279228
		Randomize      (-0.457, -0.463, -0.417)
		colorDistMagn   0.376985
		colorDistFreq   1.59906e-005
		detailScale     6.50557
		colorConversion true
		snowLevel       2
		tropicLatitude  0.202216
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.613666
		terraceProb     0.325185
		erosion         0
		montesMagn      0.60199
		montesFreq      3.44181
		montesSpiky     0.731743
		montesFraction  0.682144
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000178135
		hillsFraction   0.610499
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213938
		craterFreq      0.194359
		craterDensity   1.02456
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.496812
		volcanoTemp     1504.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.210, 0.174, 0.144, 0.000)
		colorShelf     (0.224, 0.185, 0.153, 0.000)
		colorBeach     (0.237, 0.196, 0.162, 0.000)
		colorDesert    (0.250, 0.207, 0.171, 0.000)
		colorLowland   (0.263, 0.217, 0.180, 0.000)
		colorUpland    (0.276, 0.228, 0.190, 0.000)
		colorRock      (0.289, 0.239, 0.199, 0.000)
		colorSnow      (0.302, 0.250, 0.208, 1.000)
		BumpHeight      0.214417
		BumpOffset      0.0428834
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.094062
		GasToDust   0.25
		Particles   1169
		GasBright   0.324531
		DustBright  0.329004
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   637.804
		Period          4138.64
		Eccentricity    0.682683
		Inclination     -162.448
		AscendingNode   34.7943
		ArgOfPericenter -89.3059
		MeanAnomaly     63.2022
	}
}

Comet	"C159"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            3.69581e-011
	Radius          5.65304
	InertiaMoment   0.3991

	Oblateness      0.00469003

	RotationPeriod  99.6084
	Obliquity       292.456
	EqAscendNode    154.06
	//Precession      0

	AbsMagn         6.83342
	SlopeParam      6.95589
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.627 0.623 0.618)

	Surface
	{
		SurfStyle       0.084376
		OceanStyle      0.264682
		Randomize      (0.883, -0.271, -0.686)
		colorDistMagn   0.317992
		colorDistFreq   0.025145
		detailScale     154.366
		colorConversion true
		snowLevel       2
		tropicLatitude  0.912992
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.398056
		terraceProb     0.291009
		erosion         0
		montesMagn      0.58677
		montesFreq      2.38525
		montesSpiky     0.97583
		montesFraction  0.627093
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.070482
		hillsFraction   0.607261
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.266263
		craterFreq      0.253551
		craterDensity   0.85223
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.528436
		volcanoTemp     1558.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.251, 0.249, 0.247, 0.000)
		colorShelf     (0.267, 0.265, 0.263, 0.000)
		colorBeach     (0.282, 0.280, 0.278, 0.000)
		colorDesert    (0.298, 0.296, 0.294, 0.000)
		colorLowland   (0.314, 0.312, 0.309, 0.000)
		colorUpland    (0.329, 0.327, 0.325, 0.000)
		colorRock      (0.345, 0.343, 0.340, 0.000)
		colorSnow      (0.361, 0.358, 0.356, 1.000)
		BumpHeight      5.08773
		BumpOffset      1.01755
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.575254
		GasToDust   0.25
		Particles   2141
		GasBright   0.0188019
		DustBright  0.31922
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   415.739
		Period          2178
		Eccentricity    0.622291
		Inclination     -7.9562
		AscendingNode   103.413
		ArgOfPericenter 115.699
		MeanAnomaly     -18.123
	}
}

Comet	"C160"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            2.85844e-007
	Radius          93.1116
	InertiaMoment   0.397631

	Oblateness      0.0029632

	RotationPeriod  94.9906
	Obliquity       245.662
	EqAscendNode    138.637
	//Precession      0

	AbsMagn         1.32281
	SlopeParam      2.32404
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.821 0.755 0.703)

	Surface
	{
		SurfStyle       0.0473553
		OceanStyle      0.244021
		Randomize      (0.805, 0.023, 0.525)
		colorDistMagn   0.988476
		colorDistFreq   6.86972
		detailScale     2542.57
		colorConversion true
		snowLevel       2
		tropicLatitude  0.963543
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.717719
		terraceProb     0.16572
		erosion         0
		montesMagn      0.444167
		montesFreq      2.61842
		montesSpiky     0.799676
		montesFraction  0.785414
		dunesFraction   0
		hillsMagn       0
		hillsFreq       24.1189
		hillsFraction   0.629699
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25004
		craterFreq      0.333661
		craterDensity   0.785233
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.478773
		volcanoTemp     1608.53
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.329, 0.302, 0.281, 0.000)
		colorShelf     (0.349, 0.321, 0.299, 0.000)
		colorBeach     (0.370, 0.340, 0.317, 0.000)
		colorDesert    (0.390, 0.358, 0.334, 0.000)
		colorLowland   (0.411, 0.377, 0.352, 0.000)
		colorUpland    (0.431, 0.396, 0.369, 0.000)
		colorRock      (0.452, 0.415, 0.387, 0.000)
		colorSnow      (0.472, 0.434, 0.404, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0943159
		DustBright  0.728192
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   494.801
		Period          2827.96
		Eccentricity    0.702907
		Inclination     33.388
		AscendingNode   -81.2181
		ArgOfPericenter -122.97
		MeanAnomaly     -69.9366
	}
}

Comet	"C161"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            8.80136e-015
	Radius          0.34718
	InertiaMoment   0.399544

	Oblateness      0.00547044

	RotationPeriod  91.0381
	Obliquity       198.868
	EqAscendNode    123.215
	//Precession      0

	AbsMagn         10.1232
	SlopeParam      3.02582
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.630 0.627 0.624)

	Surface
	{
		SurfStyle       0.692122
		OceanStyle      0.14959
		Randomize      (-0.433, 0.398, -0.682)
		colorDistMagn   0.319149
		colorDistFreq   4.55224e-005
		detailScale     9.48033
		colorConversion true
		snowLevel       2
		tropicLatitude  0.9966
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.617078
		terraceProb     0.537427
		erosion         0
		montesMagn      0.549724
		montesFreq      2.7346
		montesSpiky     0.916416
		montesFraction  0.638041
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000309169
		hillsFraction   0.701706
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258051
		craterFreq      0.263023
		craterDensity   0.813797
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.616432
		volcanoTemp     1303.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.246, 0.213, 0.175, 0.000)
		colorShelf     (0.252, 0.219, 0.200, 0.000)
		colorBeach     (0.296, 0.257, 0.237, 0.000)
		colorDesert    (0.321, 0.276, 0.231, 0.000)
		colorLowland   (0.353, 0.295, 0.262, 0.000)
		colorUpland    (0.391, 0.357, 0.318, 0.000)
		colorRock      (0.422, 0.389, 0.343, 0.000)
		colorSnow      (0.460, 0.414, 0.362, 1.000)
		BumpHeight      0.312462
		BumpOffset      0.0624924
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.126888
		GasToDust   0.25
		Particles   1236
		GasBright   0.088072
		DustBright  0.418923
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   606.408
		Period          3836.84
		Eccentricity    0.770353
		Inclination     -101.9
		AscendingNode   -28.718
		ArgOfPericenter -164.032
		MeanAnomaly     59.1164
	}
}

Comet	"C162"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            6.80721e-011
	Radius          5.76755
	InertiaMoment   0.398329

	Oblateness      0.00349065

	RotationPeriod  87.5459
	Obliquity       152.073
	EqAscendNode    107.792
	//Precession      0

	AbsMagn         6.61386
	SlopeParam      3.62265
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.604 0.597 0.593)

	Surface
	{
		SurfStyle       0.688182
		OceanStyle      0.545335
		Randomize      (-0.484, -0.621, -0.573)
		colorDistMagn   0.190973
		colorDistFreq   0.00209113
		detailScale     157.492
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999128
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.512681
		terraceProb     0.423417
		erosion         0
		montesMagn      0.504774
		montesFreq      3.29478
		montesSpiky     0.884326
		montesFraction  0.627237
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0786732
		hillsFraction   0.511519
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231024
		craterFreq      0.264752
		craterDensity   0.981562
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.446309
		volcanoTemp     1174.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.235, 0.203, 0.166, 0.000)
		colorShelf     (0.241, 0.209, 0.190, 0.000)
		colorBeach     (0.284, 0.245, 0.225, 0.000)
		colorDesert    (0.308, 0.263, 0.219, 0.000)
		colorLowland   (0.338, 0.281, 0.249, 0.000)
		colorUpland    (0.374, 0.340, 0.302, 0.000)
		colorRock      (0.404, 0.370, 0.326, 0.000)
		colorSnow      (0.441, 0.394, 0.344, 1.000)
		BumpHeight      5.19079
		BumpOffset      1.03816
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.60808
		GasToDust   0.25
		Particles   2208
		GasBright   0.230776
		DustBright  0.760705
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   657.976
		Period          4336.52
		Eccentricity    0.781202
		Inclination     -72.5768
		AscendingNode   46.7266
		ArgOfPericenter -43.7974
		MeanAnomaly     95.0622
	}
}

Comet	"C163"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            5.26489e-007
	Radius          134.735
	InertiaMoment   0.399967

	Oblateness      0.00623019

	RotationPeriod  84.3909
	Obliquity       105.279
	EqAscendNode    92.3695
	//Precession      0

	AbsMagn         0.274669
	SlopeParam      4.18702
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.788 0.733 0.663)

	Surface
	{
		SurfStyle       0.271512
		OceanStyle      0.371645
		Randomize      (0.466, 0.281, 0.578)
		colorDistMagn   0.358006
		colorDistFreq   3.09449
		detailScale     3679.16
		colorConversion true
		snowLevel       2
		tropicLatitude  0.880075
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.541882
		terraceProb     0.394136
		erosion         0
		montesMagn      0.567195
		montesFreq      3.02831
		montesSpiky     0.960943
		montesFraction  0.421783
		dunesFraction   0
		hillsMagn       0
		hillsFreq       29.8548
		hillsFraction   0.440568
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230418
		craterFreq      0.552548
		craterDensity   0.970493
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.399381
		volcanoTemp     1480.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.315, 0.293, 0.265, 0.000)
		colorShelf     (0.335, 0.312, 0.282, 0.000)
		colorBeach     (0.355, 0.330, 0.298, 0.000)
		colorDesert    (0.374, 0.348, 0.315, 0.000)
		colorLowland   (0.394, 0.367, 0.331, 0.000)
		colorUpland    (0.414, 0.385, 0.348, 0.000)
		colorRock      (0.433, 0.403, 0.365, 0.000)
		colorSnow      (0.453, 0.422, 0.381, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.19725
		DustBright  0.478718
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   492.505
		Period          2808.3
		Eccentricity    0.70211
		Inclination     -123.004
		AscendingNode   65.8255
		ArgOfPericenter 75.6312
		MeanAnomaly     -24.2608
	}
}

Comet	"C164"
{
	ParentBody     "Iridonia System"
	Class	       "Asteroid"

	Mass            1.6211e-014
	Radius          0.357255
	InertiaMoment   0.398865

	Oblateness      0.0040284

	RotationPeriod  81.4932
	Obliquity       58.4849
	EqAscendNode    76.9469
	//Precession      0

	AbsMagn         9.8866
	SlopeParam      4.76701
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.425 0.416 0.413)

	Surface
	{
		SurfStyle       0.0390893
		OceanStyle      0.291094
		Randomize      (-0.880, 0.830, -0.356)
		colorDistMagn   0.25986
		colorDistFreq   3.93478e-005
		detailScale     9.75545
		colorConversion true
		snowLevel       2
		tropicLatitude  0.939275
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.416945
		terraceProb     0.132925
		erosion         0
		montesMagn      0.46689
		montesFreq      3.19266
		montesSpiky     0.843946
		montesFraction  0.554285
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000272671
		hillsFraction   0.665031
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223773
		craterFreq      0.188661
		craterDensity   0.846757
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.483528
		volcanoTemp     1509.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.170, 0.166, 0.165, 0.000)
		colorShelf     (0.181, 0.177, 0.176, 0.000)
		colorBeach     (0.191, 0.187, 0.186, 0.000)
		colorDesert    (0.202, 0.198, 0.196, 0.000)
		colorLowland   (0.212, 0.208, 0.206, 0.000)
		colorUpland    (0.223, 0.218, 0.217, 0.000)
		colorRock      (0.234, 0.229, 0.227, 0.000)
		colorSnow      (0.244, 0.239, 0.237, 1.000)
		BumpHeight      0.32153
		BumpOffset      0.0643059
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.159714
		GasToDust   0.25
		Particles   1302
		GasBright   0.126465
		DustBright  0.233989
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   543.325
		Period          3253.99
		Eccentricity    0.879865
		Inclination     -11.5606
		AscendingNode   -171.466
		ArgOfPericenter 81.6352
		MeanAnomaly     93.1344
	}
}

Planet	"Iridonia System 6"
{
	ParentBody     "Iridonia System"
	Class	       "Desert"

	Mass            0.0488238
	Radius          2737.21
	InertiaMoment   0.343891

	Oblateness      0.0035586

	RotationPeriod  30.245
	Obliquity       -77.5818
	EqAscendNode    183.813
	//Precession      0

	AbsMagn         -1.77471
	SlopeParam      2.05606
	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.583 0.580 0.573)

	Surface
	{
		SurfStyle       0.188284
		OceanStyle      0.89666
		Randomize      (-0.368, 0.067, 0.460)
		colorDistMagn   0.0626819
		colorDistFreq   370.918
		detailScale     7040.26
		colorConversion true
		seaLevel        0.0478275
		snowLevel       2
		tropicLatitude  0.974367
		icecapLatitude  10
		icecapHeight    0.151231
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        0.915409
		venusFreq       1.08453
		venusMagn       0
		mareFreq        1.81816
		mareDensity     0.0146418
		terraceProb     0.30042
		erosion         0
		montesMagn      0.190596
		montesFreq      155.203
		montesSpiky     0.812824
		montesFraction  0.728533
		dunesMagn       0.0373468
		dunesFreq       20.9388
		dunesFraction   0.867493
		hillsMagn       0.13191
		hillsFreq       267.195
		hillsFraction   0
		hills2Fraction  0
		riversMagn      60.1391
		riversFreq      3.18858
		riversSin       6.54722
		riversOctaves   0
		canyonsMagn     0.0346144
		canyonsFreq     67.3344
		canyonFraction  0
		cracksMagn      0.122765
		cracksFreq      0.257671
		cracksOctaves   0
		craterMagn      0.504479
		craterFreq      4.97691
		craterDensity   0.143719
		craterOctaves   1.94028
		volcanoMagn     0.637218
		volcanoFreq     0.89398
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.785175
		volcanoRadius   0.521521
		volcanoTemp     1622.73
		lavaCoverTidal  0
		lavaCoverSun    0.838093
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
		Hapke           0.930986
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
		Height          136.86
		Density         0.00690143
		Pressure        0.0106143
		Greenhouse      0.774389
		Bright          5.85852
		Opacity         1
		SkyLight        1.95284
		Hue             -0.0119576
		Saturation      1

		Composition
		{
			SO2   	99.9993
			Cl2   	0.000731232
			Kr    	1.5082e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.5
		GasToDust   0.666667
		Particles   2000
		GasBright   0.0720611
		DustBright  0.0917806
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   55.72683
		//Period          58.5696
		Eccentricity    0.0920667
		Inclination     -0.583133
		AscendingNode   177.786
		ArgOfPericenter 355.007
		MeanAnomaly     72.3942
	}
}

DwarfMoon	"Iridonia System 6.D1"
{
	ParentBody     "Iridonia System 6"
	Class	       "Asteroid"

	Mass            5.39841e-006
	Radius          105.529
	InertiaMoment   0.398578

	Oblateness      0.0155845

	Obliquity       0.818048
	EqAscendNode    -80.7141
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.656 0.651 0.647)

	Surface
	{
		SurfStyle       0.162133
		OceanStyle      0.441602
		Randomize      (-0.862, 0.763, 0.901)
		colorDistMagn   0.175819
		colorDistFreq   3.56
		detailScale     2881.66
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0217588
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.417299
		terraceProb     0.2056
		erosion         0
		montesMagn      0.610486
		montesFreq      4.04019
		montesSpiky     0.992272
		montesFraction  0.253443
		dunesFraction   0
		hillsMagn       0
		hillsFreq       19.7594
		hillsFraction   0.624909
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248016
		craterFreq      0.390244
		craterDensity   0
		craterOctaves   0.596749
		volcanoActivity 0.658432
		volcanoFlows    0
		volcanoRadius   0.475315
		volcanoTemp     1603.31
		lavaCoverTidal  0
		lavaCoverSun    0.838093
		lavaCoverYoung  0
		colorSea       (0.262, 0.260, 0.259, 0.000)
		colorShelf     (0.279, 0.277, 0.275, 0.000)
		colorBeach     (0.295, 0.293, 0.291, 0.000)
		colorDesert    (0.312, 0.309, 0.308, 0.000)
		colorLowland   (0.328, 0.325, 0.324, 0.000)
		colorUpland    (0.344, 0.342, 0.340, 0.000)
		colorRock      (0.361, 0.358, 0.356, 0.000)
		colorSnow      (0.377, 0.374, 0.372, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   6.31771e-005
		Period          0.00131425
		Eccentricity    0.0279868
		Inclination     0.818048
		AscendingNode   -80.7141
		ArgOfPericenter 72.4579
		MeanAnomaly     52.7102
	}
}

DwarfMoon	"Iridonia System 6.D2"
{
	ParentBody     "Iridonia System 6"
	Class	       "Asteroid"

	Mass            5.7409e-011
	Radius          3.28383
	InertiaMoment   0.396439

	Oblateness      0.00905259

	Obliquity       0.741468
	EqAscendNode    -34.052
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.632 0.628 0.626)

	Surface
	{
		SurfStyle       0.263979
		OceanStyle      0.574167
		Randomize      (0.034, -0.073, 0.512)
		colorDistMagn   0.260341
		colorDistFreq   0.00786301
		detailScale     89.6704
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0247444
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.752586
		terraceProb     0.647369
		erosion         0
		montesMagn      0.539889
		montesFreq      3.59462
		montesSpiky     0.868055
		montesFraction  0.632554
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0296132
		hillsFraction   0.708331
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23024
		craterFreq      0.260307
		craterDensity   0
		craterOctaves   0.358049
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.433682
		volcanoTemp     1184.41
		lavaCoverTidal  0
		lavaCoverSun    0.838093
		lavaCoverYoung  0
		colorSea       (0.253, 0.251, 0.250, 0.000)
		colorShelf     (0.269, 0.267, 0.266, 0.000)
		colorBeach     (0.284, 0.283, 0.282, 0.000)
		colorDesert    (0.300, 0.298, 0.297, 0.000)
		colorLowland   (0.316, 0.314, 0.313, 0.000)
		colorUpland    (0.332, 0.330, 0.329, 0.000)
		colorRock      (0.348, 0.345, 0.344, 0.000)
		colorSnow      (0.363, 0.361, 0.360, 1.000)
		BumpHeight      2.95545
		BumpOffset      0.591089
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000106854
		Period          0.00289102
		Eccentricity    0.00295478
		Inclination     0.741468
		AscendingNode   -34.052
		ArgOfPericenter -173.826
		MeanAnomaly     -134.499
	}
}

DwarfMoon	"Iridonia System 6.D3"
{
	ParentBody     "Iridonia System 6"
	Class	       "Asteroid"

	Mass            9.7517e-011
	Radius          6.59625
	InertiaMoment   0.398404

	RotationPeriod  1248.37
	Obliquity       43.3743
	EqAscendNode    -8.14599
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.432 0.430 0.428)

	Surface
	{
		SurfStyle       0.783394
		OceanStyle      0.428891
		Randomize      (0.274, 0.188, 0.581)
		colorDistMagn   0.659151
		colorDistFreq   0.0171594
		detailScale     180.122
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998109
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.731117
		terraceProb     0.360518
		erosion         0
		montesMagn      0.512857
		montesFreq      3.57076
		montesSpiky     0.873499
		montesFraction  0.610551
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.103722
		hillsFraction   0.749069
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250154
		craterFreq      0.229709
		craterDensity   0
		craterOctaves   0.437616
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.501919
		volcanoTemp     1096.05
		lavaCoverTidal  0
		lavaCoverSun    0.838093
		lavaCoverYoung  0
		colorSea       (0.169, 0.146, 0.120, 0.000)
		colorShelf     (0.173, 0.151, 0.137, 0.000)
		colorBeach     (0.203, 0.176, 0.163, 0.000)
		colorDesert    (0.221, 0.189, 0.158, 0.000)
		colorLowland   (0.242, 0.202, 0.180, 0.000)
		colorUpland    (0.268, 0.245, 0.218, 0.000)
		colorRock      (0.290, 0.267, 0.235, 0.000)
		colorSnow      (0.316, 0.284, 0.248, 1.000)
		BumpHeight      5.93663
		BumpOffset      1.18733
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000569837
		Period          0.0356033
		Eccentricity    0.128718
		Inclination     43.3743
		AscendingNode   -8.14599
		ArgOfPericenter -15.8249
		MeanAnomaly     -81.2202
	}
}

DwarfMoon	"Iridonia System 6.D4"
{
	ParentBody     "Iridonia System 6"
	Class	       "Asteroid"

	Mass            1.58366e-010
	Radius          4.01764
	InertiaMoment   0.399428

	Obliquity       -38.467
	EqAscendNode    14.7693
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.800 0.797 0.794)

	Surface
	{
		SurfStyle       0.31794
		OceanStyle      0.613838
		Randomize      (-0.227, 0.975, 0.417)
		colorDistMagn   0.0514166
		colorDistFreq   0.0115697
		detailScale     109.708
		colorConversion true
		snowLevel       2
		tropicLatitude  0.971054
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.467536
		terraceProb     0.22966
		erosion         0
		montesMagn      0.502618
		montesFreq      2.41701
		montesSpiky     0.805681
		montesFraction  0.361142
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0488622
		hillsFraction   0.582776
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24833
		craterFreq      0.191891
		craterDensity   0
		craterOctaves   0.397832
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.484682
		volcanoTemp     2000.91
		lavaCoverTidal  0
		lavaCoverSun    0.838093
		lavaCoverYoung  0
		colorSea       (0.320, 0.319, 0.318, 0.000)
		colorShelf     (0.340, 0.339, 0.338, 0.000)
		colorBeach     (0.360, 0.359, 0.357, 0.000)
		colorDesert    (0.380, 0.379, 0.377, 0.000)
		colorLowland   (0.400, 0.399, 0.397, 0.000)
		colorUpland    (0.420, 0.419, 0.417, 0.000)
		colorRock      (0.440, 0.439, 0.437, 0.000)
		colorSnow      (0.460, 0.459, 0.457, 1.000)
		BumpHeight      3.61587
		BumpOffset      0.723175
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00122983
		Period          0.112883
		Eccentricity    0.370199
		Inclination     -38.467
		AscendingNode   14.7693
		ArgOfPericenter -32.3357
		MeanAnomaly     -130.782
	}
}
