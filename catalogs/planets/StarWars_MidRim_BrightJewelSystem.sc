// http://starwars.wikia.com/wiki/Ord_Mantell
// Region : Mid Rim
// Sector : Bright Jewel Sector
// Grid location : L7
// X : 71.13, Y : 3824.46, Z : 130.29783200959514

// http://starwars.wikia.com/wiki/Repta
DwarfPlanet	"Repta/Bright Jewel System 1"
{
	ParentBody     "Bright Jewel System"
	Class	       "Selena"

	Mass            0.00378954
	Radius          1187.85
	InertiaMoment   0.399743

	Obliquity       1.8083
	EqAscendNode    57.0014
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.725 0.696 0.656)

	Surface
	{
		SurfStyle       0.15662
		OceanStyle      0.689606
		Randomize      (-0.394, 0.161, 0.229)
		colorDistMagn   0.0496344
		colorDistFreq   154.512
		detailScale     3055.22
		colorConversion true
		drivenDarkening 0
		seaLevel        0.2455
		snowLevel       2
		tropicLatitude  0.0554411
		icecapLatitude  10
		icecapHeight    0.117416
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.99783
		venusFreq       1.01096
		venusMagn       0
		mareFreq        0.42619
		mareDensity     0.00120576
		terraceProb     0.186738
		erosion         0
		montesMagn      0.0616127
		montesFreq      71.0395
		montesSpiky     0.810872
		montesFraction  0.739905
		dunesMagn       0.0339917
		dunesFreq       1576.7
		dunesFraction   0.21277
		hillsMagn       0.134031
		hillsFreq       150.866
		hillsFraction   0.778948
		hills2Fraction  0
		riversMagn      62.977
		riversFreq      2.99473
		riversSin       6.48268
		riversOctaves   0
		canyonsMagn     0.479435
		canyonsFreq     0.405806
		canyonFraction  0.154552
		cracksMagn      0.0650183
		cracksFreq      0.616286
		cracksOctaves   0
		craterMagn      0.635551
		craterFreq      3.57834
		craterDensity   0.0978904
		craterOctaves   1
		craterRayedFactor 0
		volcanoMagn     0.190338
		volcanoFreq     0.793433
		volcanoDensity  0.251346
		volcanoOctaves  3
		volcanoActivity 0.158828
		volcanoFlows    0.375576
		volcanoRadius   0.141999
		volcanoTemp     1211.81
		lavaCoverTidal  0
		lavaCoverSun    1.09216
		lavaCoverYoung  0
		colorSea       (0.320, 0.320, 0.320, 0.000)
		colorShelf     (0.370, 0.370, 0.370, 0.000)
		colorBeach     (0.363, 0.348, 0.328, 0.000)
		colorDesert    (0.450, 0.418, 0.374, 0.200)
		colorLowland   (0.486, 0.445, 0.420, 0.500)
		colorUpland    (0.508, 0.466, 0.433, 0.800)
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
		SemiMajorAxis   0.152001
		Eccentricity    0.041575
		Inclination     2.77855
		AscendingNode   57.2754
		ArgOfPericenter 210.081
		MeanAnomaly     339.389
	}
}

// http://starwars.wikia.com/wiki/Ord_Mantell/Legends
Planet	"Ord Mantell/Bright Jewel System 2"
{
	ParentBody     "Bright Jewel System"
	Class	       "Terra"

	Mass            1.25
	Radius          7025
	InertiaMoment   0.330945

	Oblateness      0.00924449

	RotationPeriod  26
	Obliquity       174.753
	EqAscendNode    -17.0375
	//Precession      0

	AlbedoBond      0.370436
	AlbedoGeom      0.444524
	Brightness      2
	Color          (0.656 0.629 0.576)
    
    Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine/Terrestrial"
		Panspermia "false"
	}

	Surface
	{
		SurfStyle       0.440278
		OceanStyle      0.0933267
		Randomize      (0.093, 0.044, -0.760)
		colorDistMagn   0.0662249
		colorDistFreq   534.993
		detailScale     10719.9
		colorConversion true
		seaLevel        0.213135
		snowLevel       2
		tropicLatitude  0.0957516
		icecapLatitude  0.797953
		icecapHeight    0.229688
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.828294
		venusFreq       0.59273
		venusMagn       0
		mareFreq        2.48063
		mareDensity     0.025135
		terraceProb     0.409125
		erosion         0.132239
		montesMagn      0.212232
		montesFreq      141.934
		montesSpiky     0.925681
		montesFraction  0.513974
		dunesMagn       0.0423197
		dunesFreq       39.302
		dunesFraction   0.500316
		hillsMagn       0.100543
		hillsFreq       321.42
		hillsFraction   0.72726
		hills2Fraction  0.107795
		riversMagn      55.1856
		riversFreq      4.32611
		riversSin       6.43253
		riversOctaves   2
		canyonsMagn     0.0515705
		canyonsFreq     110.697
		canyonFraction  0.287961
		cracksMagn      0.0756111
		cracksFreq      0.428715
		cracksOctaves   0
		craterMagn      0.613999
		craterFreq      10.4472
		craterDensity   0.0647193
		craterOctaves   3.66373
		volcanoMagn     0.644378
		volcanoFreq     0.618114
		volcanoDensity  0.318969
		volcanoOctaves  3
		volcanoActivity 0.65208
		volcanoFlows    0.668103
		volcanoRadius   0.46875
		volcanoTemp     1123.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.95382
		stripeTwist     0.143981
		cycloneMagn     2.63797
		cycloneFreq     0.740282
		cycloneDensity  0.359659
		cycloneOctaves  2
		colorSea       (0.040, 0.100, 0.200, 1.000)
		colorShelf     (0.150, 0.480, 0.460, 1.000)
		colorBeach     (0.400, 0.330, 0.280, 0.000)
		colorDesert    (0.260, 0.240, 0.220, 0.000)
		colorLowland   (0.500, 0.420, 0.350, 0.000)
		colorUpland    (0.240, 0.210, 0.210, 0.000)
		colorRock      (0.220, 0.210, 0.210, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.308)
		colorLowPlants (0.500, 0.420, 0.350, 0.000)
		colorUpPlants  (0.240, 0.210, 0.210, 0.000)
		BumpHeight      20
		BumpOffset      4.2627
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
		Height          4.08496
		Velocity        135.153
		BumpHeight      4.08487
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.962381
		mainOctaves     10
		Coverage        0.284061
		stripeZones     1.49597
		stripeTwist     0
	}

	Clouds
	{
		Height          8.16992
		Velocity        34.3073
		BumpHeight      4.08487
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.962381
		mainOctaves     10
		Coverage        0.284061
		stripeZones     1.49597
		stripeTwist     0
	}

	Ocean
	{
		Height          7.61517
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
		Greenhouse      1
		Bright          0.793651
		Opacity         0
		SkyLight        0
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
		Height      67.2138
		NorthLat    74.1462
		NorthLon    -65.5421
		NorthRadius 2091.95
		NorthWidth  530.965
		NorthRings  4
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -69.7463
		SouthLon    90.1758
		SouthRadius 999.395
		SouthWidth  257.224
		SouthRings  3
		SouthBright 0.3
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.62307
		GasToDust   0.23664
		Particles   2900
		GasBright   0.059019
		DustBright  0.98258
		GasColor   (0.160 0.472 0.805)
		DustColor  (0.807 0.233 0.840)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          0.9144421629021218
        SemiMajorAxis   7.5
		Eccentricity    0.0780122
		Inclination     -1.73031
		AscendingNode   -21.8851
		ArgOfPericenter 353.651
		MeanAnomaly     217.551
	}
}

DwarfMoon	"Ord Mantell D1"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            1.74026e-009
	Radius          16.339
	InertiaMoment   0.399868

	Oblateness      0.249

	Obliquity       0.0138791
	EqAscendNode    71.723
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.648 0.642 0.638)

	Surface
	{
		SurfStyle       0.656735
		OceanStyle      0.37852
		Randomize      (0.860, 0.376, 0.594)
		colorDistMagn   0.422715
		colorDistFreq   0.210436
		detailScale     446.164
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.390823
		terraceProb     0.218452
		erosion         0
		montesMagn      0.587421
		montesFreq      2.77926
		montesSpiky     0.987707
		montesFraction  0.362884
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.756932
		hillsFraction   0.664638
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231148
		craterFreq      0.19747
		craterDensity   0.851629
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.581217
		volcanoTemp     1808.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.253, 0.218, 0.179, 0.000)
		colorShelf     (0.259, 0.225, 0.204, 0.000)
		colorBeach     (0.305, 0.263, 0.243, 0.000)
		colorDesert    (0.331, 0.282, 0.236, 0.000)
		colorLowland   (0.363, 0.302, 0.268, 0.000)
		colorUpland    (0.402, 0.366, 0.326, 0.000)
		colorRock      (0.434, 0.398, 0.351, 0.000)
		colorSnow      (0.473, 0.424, 0.370, 1.000)
		BumpHeight      14.7051
		BumpOffset      2.94102
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000138176
		Period          0.00072022
		Eccentricity    8.41481e-005
		Inclination     0.0138791
		AscendingNode   71.723
		ArgOfPericenter 33.3366
		MeanAnomaly     -134.513
	}
}

DwarfMoon	"Ord Mantell D2"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            2.4487e-009
	Radius          8.9098
	InertiaMoment   0.397915

	Oblateness      0.0347472

	Obliquity       -0.00199591
	EqAscendNode    -81.6528
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.542 0.536 0.531)

	Surface
	{
		SurfStyle       0.29639
		OceanStyle      0.0249917
		Randomize      (0.518, -0.297, -0.069)
		colorDistMagn   0.349412
		colorDistFreq   0.0523757
		detailScale     243.297
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.321966
		terraceProb     0.206143
		erosion         0
		montesMagn      0.479027
		montesFreq      3.04326
		montesSpiky     0.925357
		montesFraction  0.737889
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.171475
		hillsFraction   0.468259
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257204
		craterFreq      0.276644
		craterDensity   0.873731
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.525202
		volcanoTemp     1518.95
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.217, 0.214, 0.212, 0.000)
		colorShelf     (0.230, 0.228, 0.225, 0.000)
		colorBeach     (0.244, 0.241, 0.239, 0.000)
		colorDesert    (0.257, 0.255, 0.252, 0.000)
		colorLowland   (0.271, 0.268, 0.265, 0.000)
		colorUpland    (0.285, 0.281, 0.279, 0.000)
		colorRock      (0.298, 0.295, 0.292, 0.000)
		colorSnow      (0.312, 0.308, 0.305, 1.000)
		BumpHeight      8.01882
		BumpOffset      1.60376
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000173411
		Period          0.00101259
		Eccentricity    2.57736e-005
		Inclination     -0.00199591
		AscendingNode   -81.6528
		ArgOfPericenter 138.681
		MeanAnomaly     -151.979
	}
}

Moon	"Ord Mantell Twin Moon 1/Ord Mantell 1"
{
	ParentBody     "Ord Mantell"
	Class	       "Selena"

	Mass            0.00349877
	Radius          905.21
	InertiaMoment   0.398145

	Oblateness      0.00604661

	Obliquity       -0.451691
	EqAscendNode    -73.5964
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.630 0.531 0.437)

	Surface
	{
		SurfStyle       0.3376
		OceanStyle      0.535244
		Randomize      (0.561, 0.231, -0.989)
		colorDistMagn   0.0549179
		colorDistFreq   178.819
		detailScale     3136.92
		colorConversion true
		drivenDarkening 0
		seaLevel        0.214307
		snowLevel       2
		tropicLatitude  0.0254448
		icecapLatitude  10
		icecapHeight    0.181532
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.92274
		venusFreq       1.02562
		venusMagn       0
		mareFreq        0.446972
		mareDensity     0.0022504
		terraceProb     0.473958
		erosion         0
		montesMagn      0.0580639
		montesFreq      50.6803
		montesSpiky     0.959147
		montesFraction  0.961916
		dunesMagn       0.0401366
		dunesFreq       1589.6
		dunesFraction   0.870767
		hillsMagn       0.142187
		hillsFreq       131.605
		hillsFraction   0.373508
		hills2Fraction  0
		riversMagn      62.1046
		riversFreq      3.34615
		riversSin       5.62832
		riversOctaves   0
		canyonsMagn     0.484404
		canyonsFreq     0.258663
		canyonFraction  0.622408
		cracksMagn      0.0616519
		cracksFreq      0.39449
		cracksOctaves   0
		craterMagn      0.682192
		craterFreq      3.77346
		craterDensity   0.785333
		craterOctaves   9.6622
		craterRayedFactor 0.233947
		volcanoMagn     0.18906
		volcanoFreq     0.714114
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.0309826
		volcanoRadius   0.139529
		volcanoTemp     1168.74
		lavaCoverTidal  0.0375328
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.420, 0.420, 0.430, 0.000)
		colorShelf     (0.470, 0.480, 0.480, 0.000)
		colorBeach     (0.451, 0.441, 0.424, 0.000)
		colorDesert    (0.393, 0.356, 0.325, 0.000)
		colorLowland   (0.500, 0.472, 0.395, 0.000)
		colorUpland    (0.533, 0.503, 0.431, 0.000)
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
		SemiMajorAxis   0.000280451
		Period          0.00208044
		Eccentricity    0.0141814
		Inclination     -0.451691
		AscendingNode   -73.5964
		ArgOfPericenter -131.294
		MeanAnomaly     45.8361
	}
}

Moon	"Ord Mantell Twin Moon 2/Ord Mantell 2"
{
	ParentBody     "Ord Mantell"
	Class	       "Selena"

	Mass            0.00410565
	Radius          1219.61
	InertiaMoment   0.394465

	Oblateness      0.00166991

	Obliquity       1.05928
	EqAscendNode    -93.0168
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.819 0.774 0.706)

	Surface
	{
		SurfStyle       0.3376
		OceanStyle      0.535244
		Randomize      (0.561, 0.231, -0.989)
		colorDistMagn   0.0549179
		colorDistFreq   178.819
		detailScale     3136.92
		colorConversion true
		drivenDarkening 0
		seaLevel        0.214307
		snowLevel       2
		tropicLatitude  0.0254448
		icecapLatitude  10
		icecapHeight    0.181532
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.92274
		venusFreq       1.02562
		venusMagn       0
		mareFreq        0.446972
		mareDensity     0.0022504
		terraceProb     0.473958
		erosion         0
		montesMagn      0.0580639
		montesFreq      50.6803
		montesSpiky     0.959147
		montesFraction  0.961916
		dunesMagn       0.0401366
		dunesFreq       1589.6
		dunesFraction   0.870767
		hillsMagn       0.142187
		hillsFreq       131.605
		hillsFraction   0.373508
		hills2Fraction  0
		riversMagn      62.1046
		riversFreq      3.34615
		riversSin       5.62832
		riversOctaves   0
		canyonsMagn     0.484404
		canyonsFreq     0.258663
		canyonFraction  0.622408
		cracksMagn      0.0616519
		cracksFreq      0.39449
		cracksOctaves   0
		craterMagn      0.682192
		craterFreq      3.77346
		craterDensity   0.785333
		craterOctaves   9.6622
		craterRayedFactor 0.233947
		volcanoMagn     0.18906
		volcanoFreq     0.714114
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.0309826
		volcanoRadius   0.139529
		volcanoTemp     1168.74
		lavaCoverTidal  0.0375328
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.420, 0.420, 0.430, 0.000)
		colorShelf     (0.470, 0.480, 0.480, 0.000)
		colorBeach     (0.451, 0.441, 0.424, 0.000)
		colorDesert    (0.393, 0.356, 0.325, 0.000)
		colorLowland   (0.500, 0.472, 0.395, 0.000)
		colorUpland    (0.533, 0.503, 0.431, 0.000)
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
		SemiMajorAxis   0.000547647
		Period          0.00567603
		Eccentricity    0.0277774
		Inclination     1.05928
		AscendingNode   -93.0168
		ArgOfPericenter 66.078
		MeanAnomaly     147.16
	}
}

DwarfMoon	"Ord Mantell D3"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            8.91697e-009
	Radius          26.5797
	InertiaMoment   0.399221

	RotationPeriod  8748.95
	Obliquity       -57.3061
	EqAscendNode    98.5569
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.409 0.406 0.404)

	Surface
	{
		SurfStyle       0.925301
		OceanStyle      0.324145
		Randomize      (-0.969, -0.634, -0.934)
		colorDistMagn   0.00256491
		colorDistFreq   0.382518
		detailScale     725.802
		colorConversion true
		snowLevel       2
		tropicLatitude  0.917757
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.448297
		terraceProb     0.257241
		erosion         0
		montesMagn      0.557001
		montesFreq      2.79583
		montesSpiky     0.945386
		montesFraction  0.642742
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.10385
		hillsFraction   0.751198
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.27839
		craterFreq      0.232681
		craterDensity   0.97277
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.454304
		volcanoTemp     1473.33
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.139, 0.142, 0.162, 0.050)
		colorShelf     (0.163, 0.167, 0.186, 0.040)
		colorBeach     (0.188, 0.191, 0.210, 0.030)
		colorDesert    (0.212, 0.215, 0.239, 0.020)
		colorLowland   (0.237, 0.240, 0.263, 0.030)
		colorUpland    (0.261, 0.264, 0.287, 0.050)
		colorRock      (0.286, 0.289, 0.319, 0.020)
		colorSnow      (0.286, 0.289, 0.319, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00587379
		Period          0.199615
		Eccentricity    0.342462
		Inclination     -57.3061
		AscendingNode   98.5569
		ArgOfPericenter 163.397
		MeanAnomaly     -109.988
	}
}

DwarfMoon	"Ord Mantell D4"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            1.21692e-008
	Radius          19.5262
	InertiaMoment   0.396027

	RotationPeriod  8146.07
	Obliquity       34.6549
	EqAscendNode    -129.031
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.774 0.770 0.768)

	Surface
	{
		SurfStyle       0.246096
		OceanStyle      0.445406
		Randomize      (0.969, -0.230, 0.074)
		colorDistMagn   0.886399
		colorDistFreq   0.292466
		detailScale     533.196
		colorConversion true
		snowLevel       2
		tropicLatitude  0.474455
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.577733
		terraceProb     0.506364
		erosion         0
		montesMagn      0.479182
		montesFreq      2.75141
		montesSpiky     0.905561
		montesFraction  0.417972
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.462233
		hillsFraction   0.581302
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227226
		craterFreq      0.165714
		craterDensity   0.806014
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.521214
		volcanoTemp     1284.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.310, 0.308, 0.307, 0.000)
		colorShelf     (0.329, 0.327, 0.326, 0.000)
		colorBeach     (0.348, 0.346, 0.345, 0.000)
		colorDesert    (0.368, 0.366, 0.365, 0.000)
		colorLowland   (0.387, 0.385, 0.384, 0.000)
		colorUpland    (0.407, 0.404, 0.403, 0.000)
		colorRock      (0.426, 0.423, 0.422, 0.000)
		colorSnow      (0.445, 0.443, 0.441, 1.000)
		BumpHeight      17.5736
		BumpOffset      3.51472
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00649909
		Period          0.232325
		Eccentricity    0.408042
		Inclination     34.6549
		AscendingNode   -129.031
		ArgOfPericenter 165.855
		MeanAnomaly     9.59284
	}
}

DwarfMoon	"Ord Mantell D5"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            1.65619e-008
	Radius          20.0539
	InertiaMoment   0.398306

	Obliquity       10.9758
	EqAscendNode    37.4299
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.746 0.742 0.740)

	Surface
	{
		SurfStyle       0.272438
		OceanStyle      0.249091
		Randomize      (0.239, -0.872, 0.042)
		colorDistMagn   0.549158
		colorDistFreq   0.292191
		detailScale     547.605
		colorConversion true
		snowLevel       2
		tropicLatitude  0.354743
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.727199
		terraceProb     0.349192
		erosion         0
		montesMagn      0.461773
		montesFreq      2.90569
		montesSpiky     0.907088
		montesFraction  0.41913
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.03019
		hillsFraction   0.683566
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243977
		craterFreq      0.198941
		craterDensity   0.912949
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.504098
		volcanoTemp     1819.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.298, 0.297, 0.296, 0.000)
		colorShelf     (0.317, 0.316, 0.315, 0.000)
		colorBeach     (0.336, 0.334, 0.333, 0.000)
		colorDesert    (0.354, 0.353, 0.352, 0.000)
		colorLowland   (0.373, 0.371, 0.370, 0.000)
		colorUpland    (0.392, 0.390, 0.389, 0.000)
		colorRock      (0.410, 0.408, 0.407, 0.000)
		colorSnow      (0.429, 0.427, 0.426, 1.000)
		BumpHeight      18.0485
		BumpOffset      3.6097
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00670253
		Period          0.243318
		Eccentricity    0.279091
		Inclination     10.9758
		AscendingNode   37.4299
		ArgOfPericenter 129.125
		MeanAnomaly     49.8274
	}
}

DwarfMoon	"Ord Mantell D6"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            2.24985e-008
	Radius          38.8176
	InertiaMoment   0.399355

	Obliquity       -28.9895
	EqAscendNode    21.7651
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.530 0.481 0.395)

	Surface
	{
		SurfStyle       0.712339
		OceanStyle      0.905568
		Randomize      (0.301, 0.345, -0.589)
		colorDistMagn   0.65167
		colorDistFreq   1.188
		detailScale     1059.98
		colorConversion true
		snowLevel       2
		tropicLatitude  0.837149
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.729536
		terraceProb     0.375206
		erosion         0
		montesMagn      0.433539
		montesFreq      2.66658
		montesSpiky     0.969493
		montesFraction  0.794862
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.20157
		hillsFraction   0.778366
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217705
		craterFreq      0.253507
		craterDensity   0.959316
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.505921
		volcanoTemp     1542.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.207, 0.164, 0.111, 0.000)
		colorShelf     (0.212, 0.168, 0.126, 0.000)
		colorBeach     (0.249, 0.197, 0.150, 0.000)
		colorDesert    (0.271, 0.212, 0.146, 0.000)
		colorLowland   (0.297, 0.226, 0.166, 0.000)
		colorUpland    (0.329, 0.274, 0.201, 0.000)
		colorRock      (0.355, 0.298, 0.217, 0.000)
		colorSnow      (0.387, 0.318, 0.229, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00720813
		Period          0.271363
		Eccentricity    0.270187
		Inclination     -28.9895
		AscendingNode   21.7651
		ArgOfPericenter 29.8245
		MeanAnomaly     -28.8351
	}
}

DwarfMoon	"Ord Mantell D7"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            3.05339e-008
	Radius          21.5545
	InertiaMoment   0.396679

	RotationPeriod  5241.51
	Obliquity       82.508
	EqAscendNode    -49.9077
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.531 0.525 0.518)

	Surface
	{
		SurfStyle       0.749302
		OceanStyle      0.793735
		Randomize      (-0.829, -0.671, -0.946)
		colorDistMagn   0.980778
		colorDistFreq   0.267437
		detailScale     588.581
		colorConversion true
		snowLevel       2
		tropicLatitude  0.787691
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.38854
		terraceProb     0.318617
		erosion         0
		montesMagn      0.401859
		montesFreq      2.35727
		montesSpiky     0.984724
		montesFraction  0.846149
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.937167
		hillsFraction   0.56363
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253605
		craterFreq      0.231195
		craterDensity   0.899361
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.54755
		volcanoTemp     1088.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.207, 0.178, 0.145, 0.000)
		colorShelf     (0.212, 0.184, 0.166, 0.000)
		colorBeach     (0.249, 0.215, 0.197, 0.000)
		colorDesert    (0.271, 0.231, 0.192, 0.000)
		colorLowland   (0.297, 0.247, 0.218, 0.000)
		colorUpland    (0.329, 0.299, 0.264, 0.000)
		colorRock      (0.356, 0.325, 0.285, 0.000)
		colorSnow      (0.387, 0.346, 0.300, 1.000)
		BumpHeight      19.399
		BumpOffset      3.87981
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00768915
		Period          0.298974
		Eccentricity    0.489598
		Inclination     82.508
		AscendingNode   -49.9077
		ArgOfPericenter 76.379
		MeanAnomaly     -72.3281
	}
}

DwarfMoon	"Ord Mantell D8"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            4.14349e-008
	Radius          29.8137
	InertiaMoment   0.398478

	Obliquity       30.7543
	EqAscendNode    -116.589
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.504 0.497 0.490)

	Surface
	{
		SurfStyle       0.800736
		OceanStyle      0.00645436
		Randomize      (-0.765, -0.366, 0.126)
		colorDistMagn   0.681389
		colorDistFreq   0.734297
		detailScale     814.114
		colorConversion true
		snowLevel       2
		tropicLatitude  0.517721
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.261796
		terraceProb     0.275782
		erosion         0
		montesMagn      0.451289
		montesFreq      3.3556
		montesSpiky     0.921671
		montesFraction  0.293413
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.04324
		hillsFraction   0.651776
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239994
		craterFreq      0.193219
		craterDensity   0.98101
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.44149
		volcanoTemp     1850.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.197, 0.169, 0.137, 0.000)
		colorShelf     (0.202, 0.174, 0.157, 0.000)
		colorBeach     (0.237, 0.204, 0.186, 0.000)
		colorDesert    (0.257, 0.219, 0.181, 0.000)
		colorLowland   (0.282, 0.233, 0.206, 0.000)
		colorUpland    (0.312, 0.283, 0.250, 0.000)
		colorRock      (0.338, 0.308, 0.269, 0.000)
		colorSnow      (0.368, 0.328, 0.284, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00790233
		Period          0.311494
		Eccentricity    0.469045
		Inclination     30.7543
		AscendingNode   -116.589
		ArgOfPericenter 135.645
		MeanAnomaly     60.3472
	}
}

DwarfMoon	"Ord Mantell D9"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            5.62706e-008
	Radius          30.4227
	InertiaMoment   0.399485

	RotationPeriod  1844.48
	Obliquity       82.0903
	EqAscendNode    148.527
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.479 0.475 0.469)

	Surface
	{
		SurfStyle       0.5842
		OceanStyle      0.143997
		Randomize      (0.587, -0.136, 0.488)
		colorDistMagn   0.442763
		colorDistFreq   0.45482
		detailScale     830.744
		colorConversion true
		snowLevel       2
		tropicLatitude  0.517504
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.476157
		terraceProb     0.163122
		erosion         0
		montesMagn      0.67012
		montesFreq      2.90466
		montesSpiky     0.921893
		montesFraction  0.627662
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.35969
		hillsFraction   0.741339
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.277023
		craterFreq      0.248037
		craterDensity   0.964025
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.467165
		volcanoTemp     1732.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.187, 0.161, 0.131, 0.000)
		colorShelf     (0.192, 0.166, 0.150, 0.000)
		colorBeach     (0.225, 0.195, 0.178, 0.000)
		colorDesert    (0.245, 0.209, 0.174, 0.000)
		colorLowland   (0.268, 0.223, 0.197, 0.000)
		colorUpland    (0.297, 0.271, 0.239, 0.000)
		colorRock      (0.321, 0.294, 0.258, 0.000)
		colorSnow      (0.350, 0.313, 0.272, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00817026
		Period          0.327469
		Eccentricity    0.380082
		Inclination     82.0781
		AscendingNode   148.528
		ArgOfPericenter -172.294
		MeanAnomaly     -8.6437
	}
}

DwarfMoon	"Ord Mantell D10"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            7.65437e-008
	Radius          31.7428
	InertiaMoment   0.397097

	RotationPeriod  582.641
	Obliquity       9.517
	EqAscendNode    141.816
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.515 0.508 0.504)

	Surface
	{
		SurfStyle       0.2033
		OceanStyle      0.373863
		Randomize      (0.615, -0.275, 0.602)
		colorDistMagn   0.197787
		colorDistFreq   0.75874
		detailScale     866.79
		colorConversion true
		snowLevel       2
		tropicLatitude  0.103857
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.312324
		terraceProb     0.465087
		erosion         0
		montesMagn      0.312
		montesFreq      3.29889
		montesSpiky     0.985394
		montesFraction  0.668856
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.72931
		hillsFraction   0.55481
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236022
		craterFreq      0.190088
		craterDensity   0.861957
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.453477
		volcanoTemp     1674.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.206, 0.203, 0.201, 0.000)
		colorShelf     (0.219, 0.216, 0.214, 0.000)
		colorBeach     (0.232, 0.228, 0.227, 0.000)
		colorDesert    (0.245, 0.241, 0.239, 0.000)
		colorLowland   (0.257, 0.254, 0.252, 0.000)
		colorUpland    (0.270, 0.266, 0.264, 0.000)
		colorRock      (0.283, 0.279, 0.277, 0.000)
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
		SemiMajorAxis   0.00863163
		Period          0.355595
		Eccentricity    0.19649
		Inclination     8.6367
		AscendingNode   141.902
		ArgOfPericenter -170.036
		MeanAnomaly     103.813
	}
}

DwarfMoon	"Ord Mantell D11"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            1.04386e-007
	Radius          62.0061
	InertiaMoment   0.39864

	RotationPeriod  1288.24
	Obliquity       -23.8151
	EqAscendNode    -2.86836
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.832 0.766 0.723)

	Surface
	{
		SurfStyle       0.227286
		OceanStyle      0.236897
		Randomize      (-0.638, 0.864, 0.754)
		colorDistMagn   0.262335
		colorDistFreq   1.84889
		detailScale     1693.18
		colorConversion true
		snowLevel       2
		tropicLatitude  0.741024
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.334186
		terraceProb     0.239532
		erosion         0
		montesMagn      0.539748
		montesFreq      2.77167
		montesSpiky     0.964041
		montesFraction  0.260024
		dunesFraction   0
		hillsMagn       0
		hillsFreq       10.0459
		hillsFraction   0.648137
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.274999
		craterFreq      0.26023
		craterDensity   1.06898
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.480194
		volcanoTemp     1621.33
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.333, 0.306, 0.289, 0.000)
		colorShelf     (0.354, 0.326, 0.307, 0.000)
		colorBeach     (0.374, 0.345, 0.325, 0.000)
		colorDesert    (0.395, 0.364, 0.343, 0.000)
		colorLowland   (0.416, 0.383, 0.361, 0.000)
		colorUpland    (0.437, 0.402, 0.379, 0.000)
		colorRock      (0.458, 0.421, 0.398, 0.000)
		colorSnow      (0.478, 0.441, 0.416, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00894258
		Period          0.374982
		Eccentricity    0.19515
		Inclination     -24.0196
		AscendingNode   -2.8784
		ArgOfPericenter 103.857
		MeanAnomaly     162.729
	}
}

DwarfMoon	"Ord Mantell D12"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            1.42857e-007
	Radius          45.8047
	InertiaMoment   0.399613

	RotationPeriod  410.854
	Obliquity       -37.0104
	EqAscendNode    175.913
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.488 0.484 0.478)

	Surface
	{
		SurfStyle       0.538933
		OceanStyle      0.466703
		Randomize      (0.412, 0.549, -0.728)
		colorDistMagn   0.287514
		colorDistFreq   0.771079
		detailScale     1250.77
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0385238
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.436056
		terraceProb     0.292454
		erosion         0
		montesMagn      0.519763
		montesFreq      2.34568
		montesSpiky     0.967974
		montesFraction  0.337791
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.4572
		hillsFraction   0.804545
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.274726
		craterFreq      0.204372
		craterDensity   1.01534
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.538746
		volcanoTemp     1489.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.190, 0.165, 0.134, 0.000)
		colorShelf     (0.195, 0.169, 0.153, 0.000)
		colorBeach     (0.229, 0.198, 0.182, 0.000)
		colorDesert    (0.249, 0.213, 0.177, 0.000)
		colorLowland   (0.273, 0.227, 0.201, 0.000)
		colorUpland    (0.302, 0.276, 0.244, 0.000)
		colorRock      (0.327, 0.300, 0.263, 0.000)
		colorSnow      (0.356, 0.319, 0.277, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00951842
		Period          0.411779
		Eccentricity    0.0382034
		Inclination     -38.3723
		AscendingNode   177.157
		ArgOfPericenter -118.129
		MeanAnomaly     25.5827
	}
}

DwarfMoon	"Ord Mantell D13"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            1.96397e-007
	Radius          46.5856
	InertiaMoment   0.397417

	RotationPeriod  321.147
	Obliquity       -84.2556
	EqAscendNode    164.291
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.513 0.505 0.500)

	Surface
	{
		SurfStyle       0.949474
		OceanStyle      0.393055
		Randomize      (-0.767, 0.463, 0.721)
		colorDistMagn   0.77299
		colorDistFreq   1.54443
		detailScale     1272.1
		colorConversion true
		snowLevel       2
		tropicLatitude  0.457529
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.495743
		terraceProb     0.274908
		erosion         0
		montesMagn      0.511326
		montesFreq      2.43689
		montesSpiky     0.954129
		montesFraction  0.486076
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.18572
		hillsFraction   0.54319
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233622
		craterFreq      0.231212
		craterDensity   0.928006
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.512826
		volcanoTemp     1549.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.174, 0.177, 0.200, 0.050)
		colorShelf     (0.205, 0.207, 0.230, 0.040)
		colorBeach     (0.236, 0.238, 0.260, 0.030)
		colorDesert    (0.267, 0.268, 0.295, 0.020)
		colorLowland   (0.298, 0.298, 0.325, 0.030)
		colorUpland    (0.328, 0.328, 0.355, 0.050)
		colorRock      (0.359, 0.359, 0.395, 0.020)
		colorSnow      (0.359, 0.359, 0.395, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00983124
		Period          0.432244
		Eccentricity    0.138797
		Inclination     -61.0022
		AscendingNode   165.02
		ArgOfPericenter 161.003
		MeanAnomaly     -105.86
	}
}

DwarfMoon	"Ord Mantell D14"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            2.71543e-007
	Radius          48.815
	InertiaMoment   0.398794

	RotationPeriod  264.866
	Obliquity       -48.0097
	EqAscendNode    -136.892
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.842 0.798 0.711)

	Surface
	{
		SurfStyle       0.850976
		OceanStyle      0.770765
		Randomize      (-0.030, -0.636, 0.396)
		colorDistMagn   0.501986
		colorDistFreq   0.677658
		detailScale     1332.97
		colorConversion true
		snowLevel       2
		tropicLatitude  0.534921
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.412892
		terraceProb     0.527477
		erosion         0
		montesMagn      0.546941
		montesFreq      3.80348
		montesSpiky     0.868106
		montesFraction  0.324344
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.4746
		hillsFraction   0.448045
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263745
		craterFreq      0.23749
		craterDensity   1.00362
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.44387
		volcanoTemp     1225.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.286, 0.279, 0.285, 0.050)
		colorShelf     (0.337, 0.327, 0.327, 0.040)
		colorBeach     (0.387, 0.375, 0.370, 0.030)
		colorDesert    (0.438, 0.423, 0.420, 0.020)
		colorLowland   (0.488, 0.471, 0.462, 0.030)
		colorUpland    (0.539, 0.519, 0.505, 0.050)
		colorRock      (0.590, 0.567, 0.562, 0.020)
		colorSnow      (0.590, 0.567, 0.562, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0103377
		Period          0.466072
		Eccentricity    0.193313
		Inclination     -44.5279
		AscendingNode   -134.908
		ArgOfPericenter 47.2207
		MeanAnomaly     171.725
	}
}

// http://starwars.wikia.com/wiki/Cairns
Planet	"Cairns/Bright Jewel System 3"
{
	ParentBody     "Bright Jewel System"
	Class	       "Terra"

	Mass            0.389231
	Radius          4643.26
	InertiaMoment   0.333056

	RotationPeriod  1864.86
	Obliquity       0.688927
	EqAscendNode    -136.895
	//Precession      0

	AlbedoBond      0.26688
	AlbedoGeom      0.320256
	Brightness      2
	Color          (0.773 0.771 0.767)

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine/Terrestrial"
	}

	Surface
	{
		SurfStyle       0.513861
		OceanStyle      0.880875
		Randomize      (-0.952, -0.427, -0.010)
		colorDistMagn   0.0440451
		colorDistFreq   541.508
		detailScale     11942.7
		colorConversion true
		seaLevel        0.163931
		snowLevel       0.85
		tropicLatitude  0.00883632
		icecapLatitude  0.948568
		icecapHeight    0.167511
		climatePole     0.9375
		climateTropic   0.318475
		climateEquator  0.6875
		heightTempGrad  0.619025
		tropicWidth     0.0702457
		mainFreq        1.21482
		venusFreq       1.6972
		venusMagn       0
		mareFreq        3.77211
		mareDensity     0.0323776
		terraceProb     0.377163
		erosion         0.119681
		montesMagn      0.168288
		montesFreq      190.638
		montesSpiky     0.90973
		montesFraction  0.132035
		dunesMagn       0.0709494
		dunesFreq       35.5611
		dunesFraction   0.160435
		hillsMagn       0.149066
		hillsFreq       602.391
		hillsFraction   0.893471
		hills2Fraction  0.757832
		riversMagn      62.6745
		riversFreq      3.4263
		riversSin       6.13208
		riversOctaves   2
		canyonsMagn     0.0484907
		canyonsFreq     116.841
		canyonFraction  0.246616
		cracksMagn      0.112604
		cracksFreq      0.485783
		cracksOctaves   0
		craterMagn      0.634809
		craterFreq      12.0522
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.739726
		volcanoFreq     0.585533
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 1.34901
		volcanoFlows    0.767534
		volcanoRadius   0.623304
		volcanoTemp     1101.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.82648
		stripeTwist     0.930134
		cycloneMagn     1.47028
		cycloneFreq     0.586483
		cycloneDensity  0.297
		cycloneOctaves  2
		colorSea       (0.040, 0.200, 0.100, 1.000)
		colorShelf     (0.150, 0.460, 0.280, 1.000)
		colorBeach     (0.400, 0.330, 0.280, 0.000)
		colorDesert    (0.260, 0.240, 0.220, 0.000)
		colorLowland   (0.500, 0.420, 0.350, 0.000)
		colorUpland    (0.240, 0.210, 0.210, 0.000)
		colorRock      (0.220, 0.210, 0.210, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.308)
		colorLowPlants (0.079, 0.070, 0.013, 0.000)
		colorUpPlants  (0.171, 0.168, 0.071, 0.000)
		BumpHeight      20
		BumpOffset      3.27862
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
		Height          4.53857
		Velocity        151.128
		BumpHeight      4.53874
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.00961
		mainOctaves     10
		Coverage        0.111466
		stripeZones     1.82648
		stripeTwist     0.930134
	}

	Clouds
	{
		Height          9.07764
		Velocity        210.073
		BumpHeight      4.53874
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.00961
		mainOctaves     10
		Coverage        0.111466
		stripeZones     1.82648
		stripeTwist     0.930134
	}

	Ocean
	{
		Height          3.27862
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
	}

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          63.1388
		Density         1.7159
		Pressure        1.0279
		Greenhouse      64.125
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.00358512
		Saturation      1

		Composition
		{
			CO2   	94.1539
			O2    	5.53006
			N2    	0.208435
			SO2   	0.104638
			H2O   	0.00264367
			Ar    	0.000321849
			Ne    	3.40137e-005
		}
	}

	NoAurora        true

	Rings
	{
		InnerRadius     6629.45
		OuterRadius     12188.6
		RotationPeriod  4.05317
		RotationOffset  0
		FrontBright     0.517163
		BackBright      0.570721
		Density         0.682594
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   12.9155
		Eccentricity    0.0964909
		Inclination     0.688927
		AscendingNode   -136.895
		ArgOfPericenter 317.702
		MeanAnomaly     327.991
	}
}

DwarfMoon	"Cairns D1"
{
	ParentBody     "Cairns"
	Class	       "Asteroid"

	Mass            2.34065e-009
	Radius          9.44509
	InertiaMoment   0.397916

	Oblateness      0.16399

	Obliquity       0.0112646
	EqAscendNode    78.6783
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.440 0.436 0.430)

	Surface
	{
		SurfStyle       0.764328
		OceanStyle      0.495433
		Randomize      (-0.749, -0.035, -0.307)
		colorDistMagn   0.385579
		colorDistFreq   0.0327082
		detailScale     257.914
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.658591
		terraceProb     0.136894
		erosion         0
		montesMagn      0.536456
		montesFreq      2.84297
		montesSpiky     0.940089
		montesFraction  0.643646
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.224346
		hillsFraction   0.764842
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246619
		craterFreq      0.235213
		craterDensity   0.962268
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.455324
		volcanoTemp     1323.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.172, 0.148, 0.120, 0.000)
		colorShelf     (0.176, 0.153, 0.138, 0.000)
		colorBeach     (0.207, 0.179, 0.163, 0.000)
		colorDesert    (0.225, 0.192, 0.159, 0.000)
		colorLowland   (0.247, 0.205, 0.181, 0.000)
		colorUpland    (0.273, 0.248, 0.219, 0.000)
		colorRock      (0.295, 0.270, 0.237, 0.000)
		colorSnow      (0.322, 0.288, 0.249, 1.000)
		BumpHeight      8.50058
		BumpOffset      1.70012
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   6.80472e-005
		Period          0.000520344
		Eccentricity    9.0142e-005
		Inclination     0.0112646
		AscendingNode   78.6783
		ArgOfPericenter -151.312
		MeanAnomaly     163.271
	}
}

DwarfMoon	"Cairns D2"
{
	ParentBody     "Cairns"
	Class	       "Asteroid"

	Mass            3.26825e-009
	Radius          23.4484
	InertiaMoment   0.399085

	Oblateness      0.249

	Obliquity       -0.0104132
	EqAscendNode    139.628
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.791 0.788 0.786)

	Surface
	{
		SurfStyle       0.566434
		OceanStyle      0.399405
		Randomize      (-0.719, 0.321, 0.388)
		colorDistMagn   0.33701
		colorDistFreq   0.270562
		detailScale     640.298
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.606225
		terraceProb     0.392217
		erosion         0
		montesMagn      0.690237
		montesFreq      3.55395
		montesSpiky     0.891109
		montesFraction  0.69931
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.04231
		hillsFraction   0.407003
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254887
		craterFreq      0.203918
		craterDensity   0.93452
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.481291
		volcanoTemp     1384.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.308, 0.268, 0.220, 0.000)
		colorShelf     (0.316, 0.276, 0.252, 0.000)
		colorBeach     (0.372, 0.323, 0.299, 0.000)
		colorDesert    (0.403, 0.347, 0.291, 0.000)
		colorLowland   (0.443, 0.370, 0.330, 0.000)
		colorUpland    (0.490, 0.449, 0.401, 0.000)
		colorRock      (0.530, 0.489, 0.432, 0.000)
		colorSnow      (0.577, 0.520, 0.456, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000104894
		Period          0.000995864
		Eccentricity    2.04406e-005
		Inclination     -0.0104132
		AscendingNode   139.628
		ArgOfPericenter 95.8694
		MeanAnomaly     -131.336
	}
}

// http://starwars.wikia.com/wiki/Su_Exposs
Planet	"Su Exposs/Bright Jewel System 4"
{
	ParentBody     "Bright Jewel System"
	Class	       "GasGiant"

	Mass            1746.64
	Radius          76371.2
	InertiaMoment   0.195856

	Oblateness      0.0188343

	RotationPeriod  7.92654
	Obliquity       -98.0026
	EqAscendNode    -144.134
	//Precession      0

	AlbedoBond      0.494355
	AlbedoGeom      0.593226
	Brightness      2

	Surface
	{
		SurfStyle       0.558276
		Randomize      (0.231, 0.085, -0.162)
		detailScale     196431
		colorConversion true
		tropicLatitude  0.604186
		icecapLatitude  1
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     3.15586
		stripeFluct     0.42807
		stripeTwist     10.5911
		cycloneMagn     4.95656
		cycloneFreq     0.522472
		cycloneDensity  0.243103
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
		BumpHeight      5.73013
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          24.5859
		Velocity        -1247.61
		BumpHeight      18.854
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.776061
		mainOctaves     12
		Coverage        0.443548
		stripeZones     3.15586
		stripeFluct     0.42807
		stripeTwist     10.5911
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Jupiter"
		Height          100
		Density         5383.26
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.00651296
		Saturation      0.573319

		Composition
		{
			H2    	92.3441
			He    	7.3643
			CH4   	0.241284
			N2    	0.0305611
			NH3   	0.00738781
			O2    	0.0062186
			C2H2  	0.00260324
			C2H4  	0.00111864
			Ne    	0.000925277
			Ar    	0.000708254
			C2H6  	0.000584882
			C3H8  	0.000258386
		}
	}

	Aurora
	{
		Height      6035.9
		NorthLat    85.9755
		NorthLon    32.4161
		NorthRadius 21965.4
		NorthWidth  12598.9
		NorthRings  2
		NorthBright 1
		NorthParticles 10000
		SouthLat    -85.0796
		SouthLon    212.003
		SouthRadius 18366.7
		SouthWidth  5694.63
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
		SemiMajorAxis   18.6141
		Eccentricity    0.0952381
		Inclination     1.85698
		AscendingNode   -144.999
		ArgOfPericenter 0
		MeanAnomaly     97.1429
	}
}

DwarfMoon	"Su Exposs D1"
{
	ParentBody     "Su Exposs"
	Class	       "Asteroid"

	Mass            8.93216e-010
	Radius          14.9883
	InertiaMoment   0.399941

	Oblateness      0.249

	Obliquity       -0.00110964
	EqAscendNode    19.6806
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.605 0.423 0.327)

	Surface
	{
		SurfStyle       0.682971
		OceanStyle      0.697919
		Randomize      (0.394, -0.387, 0.772)
		colorDistMagn   0.739657
		colorDistFreq   0.121869
		detailScale     409.28
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.35931
		terraceProb     0.185709
		erosion         0
		montesMagn      0.453659
		montesFreq      2.90287
		montesSpiky     0.984372
		montesFraction  0.767734
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.520097
		hillsFraction   0.724795
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238384
		craterFreq      0.205879
		craterDensity   0.906969
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.502609
		volcanoTemp     1515.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.236, 0.144, 0.092, 0.000)
		colorShelf     (0.242, 0.148, 0.105, 0.000)
		colorBeach     (0.285, 0.173, 0.124, 0.000)
		colorDesert    (0.309, 0.186, 0.121, 0.000)
		colorLowland   (0.339, 0.199, 0.138, 0.000)
		colorUpland    (0.375, 0.241, 0.167, 0.000)
		colorRock      (0.406, 0.262, 0.180, 0.000)
		colorSnow      (0.442, 0.279, 0.190, 1.000)
		BumpHeight      13.4894
		BumpOffset      2.69789
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00180433
		Period          0.00106061
		Eccentricity    4.28121e-005
		Inclination     -0.00110964
		AscendingNode   19.6806
		ArgOfPericenter 138.814
		MeanAnomaly     41.2602
	}
}

Moon	"Su Exposs 1"
{
	ParentBody     "Su Exposs"
	Class	       "Selena"

	Mass            0.0230218
	Radius          2145.33
	InertiaMoment   0.360424

	Oblateness      0.00996678

	Obliquity       0.0947545
	EqAscendNode    110.964
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.626 0.619 0.615)

	Surface
	{
		SurfStyle       0.536361
		OceanStyle      0.454466
		Randomize      (0.252, -0.242, 0.815)
		colorDistMagn   0.0543743
		colorDistFreq   262.948
		detailScale     5517.91
		colorConversion true
		drivenDarkening 0
		seaLevel        0.192665
		snowLevel       2
		tropicLatitude  0.00185932
		icecapLatitude  10
		icecapHeight    0.167614
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.87563
		venusFreq       1.21286
		venusMagn       0
		mareFreq        1.07508
		mareDensity     0.00648391
		terraceProb     0.458532
		erosion         0
		montesMagn      0.134085
		montesFreq      129.882
		montesSpiky     0.997895
		montesFraction  0.23916
		dunesMagn       0.0363186
		dunesFreq       2836.47
		dunesFraction   0.189891
		hillsMagn       0.134162
		hillsFreq       280.48
		hillsFraction   0.161491
		hills2Fraction  0
		riversMagn      71.5213
		riversFreq      2.12097
		riversSin       6.12148
		riversOctaves   0
		canyonsMagn     0.501922
		canyonsFreq     0.881918
		canyonFraction  0.53763
		cracksMagn      0.0421111
		cracksFreq      0.659171
		cracksOctaves   0
		craterMagn      0.609784
		craterFreq      5.65379
		craterDensity   0.504747
		craterOctaves   6.36793
		craterRayedFactor 0.142048
		volcanoMagn     0.371409
		volcanoFreq     0.592694
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.323204
		volcanoRadius   0.309271
		volcanoTemp     1640.73
		lavaCoverTidal  0.467886
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.430, 0.400, 0.370, 0.000)
		colorShelf     (0.620, 0.600, 0.530, 0.000)
		colorBeach     (0.388, 0.377, 0.332, 0.000)
		colorDesert    (0.407, 0.384, 0.338, 0.000)
		colorLowland   (0.319, 0.285, 0.258, 0.000)
		colorUpland    (0.469, 0.439, 0.381, 0.000)
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
		SemiMajorAxis   0.00288825
		Period          0.00214797
		Eccentricity    0.0249139
		Inclination     0.0947545
		AscendingNode   110.964
		ArgOfPericenter 146.161
		MeanAnomaly     76.2183
	}
}

Moon	"Su Exposs 2"
{
	ParentBody     "Su Exposs"
	Class	       "Selena"

	Mass            0.0275323
	Radius          2460.88
	InertiaMoment   0.35587

	Oblateness      0.00439199

	Obliquity       -1.36238
	EqAscendNode    107.694
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.739 0.650 0.585)

	Surface
	{
		SurfStyle       0.298928
		OceanStyle      0.280836
		Randomize      (0.781, 0.350, -0.669)
		colorDistMagn   0.0511516
		colorDistFreq   254.022
		detailScale     6329.51
		colorConversion true
		drivenDarkening 0
		seaLevel        0.121779
		snowLevel       2
		tropicLatitude  0.0280511
		icecapLatitude  1.80408
		icecapHeight    0.140808
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.68509
		venusFreq       1.19538
		venusMagn       0
		mareFreq        1.35836
		mareDensity     0.0047725
		terraceProb     0.218801
		erosion         0
		montesMagn      0.117712
		montesFreq      148.204
		montesSpiky     0.971789
		montesFraction  0.294204
		dunesMagn       0.0232236
		dunesFreq       3218.6
		dunesFraction   0.539024
		hillsMagn       0.141761
		hillsFreq       228.084
		hillsFraction   0.968698
		hills2Fraction  0
		riversMagn      61.5624
		riversFreq      1.34926
		riversSin       4.94878
		riversOctaves   0
		canyonsMagn     0.517904
		canyonsFreq     0.71038
		canyonFraction  0.251381
		cracksMagn      0.0379
		cracksFreq      1.12263
		cracksOctaves   0
		craterMagn      0.559019
		craterFreq      8.99911
		craterDensity   0.822239
		craterOctaves   10.5263
		craterRayedFactor 0.181277
		volcanoMagn     0.493583
		volcanoFreq     0.727689
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.175032
		volcanoRadius   0.391962
		volcanoTemp     1204.14
		lavaCoverTidal  0.136457
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.420, 0.420, 0.430, 0.000)
		colorShelf     (0.470, 0.480, 0.480, 0.000)
		colorBeach     (0.406, 0.370, 0.351, 0.000)
		colorDesert    (0.355, 0.299, 0.269, 0.000)
		colorLowland   (0.451, 0.396, 0.327, 0.000)
		colorUpland    (0.480, 0.422, 0.357, 0.000)
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
		SemiMajorAxis   0.00407864
		Period          0.00360453
		Eccentricity    0.00328597
		Inclination     -1.36238
		AscendingNode   107.694
		ArgOfPericenter -172.395
		MeanAnomaly     31.2092
	}
}

Moon	"Su Exposs 3"
{
	ParentBody     "Su Exposs"
	Class	       "Selena"

	Mass            0.0326647
	Radius          2403.52
	InertiaMoment   0.351413

	Oblateness      0.00120473

	Obliquity       0.830196
	EqAscendNode    -166.295
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.506 0.500 0.493)

	Surface
	{
		SurfStyle       0.421986
		OceanStyle      0.738086
		Randomize      (-0.247, 0.739, -0.684)
		colorDistMagn   0.0468356
		colorDistFreq   280.718
		detailScale     6181.98
		colorConversion true
		drivenDarkening 0
		seaLevel        0.249694
		snowLevel       2
		tropicLatitude  0.00345266
		icecapLatitude  6.94574
		icecapHeight    0.150637
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.60527
		venusFreq       0.950398
		venusMagn       0
		mareFreq        1.17263
		mareDensity     0.00991495
		terraceProb     0.353575
		erosion         0
		montesMagn      0.166076
		montesFreq      139.208
		montesSpiky     0.88789
		montesFraction  0.537217
		dunesMagn       0.0354375
		dunesFreq       3142.51
		dunesFraction   0.860781
		hillsMagn       0.124892
		hillsFreq       307.011
		hillsFraction   0.950603
		hills2Fraction  0
		riversMagn      48.8176
		riversFreq      3.40459
		riversSin       6.24298
		riversOctaves   0
		canyonsMagn     0.469861
		canyonsFreq     0.658493
		canyonFraction  0.126966
		cracksMagn      0.0249736
		cracksFreq      1.639
		cracksOctaves   0
		craterMagn      0.621604
		craterFreq      7.30184
		craterDensity   0.648591
		craterOctaves   8.69648
		craterRayedFactor 0.13899
		volcanoMagn     0.487749
		volcanoFreq     0.863239
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.243564
		volcanoRadius   0.360654
		volcanoTemp     1661.79
		lavaCoverTidal  0.305882
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.420, 0.420, 0.430, 0.000)
		colorShelf     (0.470, 0.480, 0.480, 0.000)
		colorBeach     (0.278, 0.285, 0.296, 0.000)
		colorDesert    (0.243, 0.230, 0.227, 0.000)
		colorLowland   (0.309, 0.305, 0.276, 0.000)
		colorUpland    (0.329, 0.325, 0.301, 0.000)
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
		SemiMajorAxis   0.00575965
		Period          0.0060488
		Eccentricity    0.0480287
		Inclination     0.830196
		AscendingNode   -166.295
		ArgOfPericenter 118.336
		MeanAnomaly     -39.3907
	}
}

Moon	"Su Exposs 4"
{
	ParentBody     "Su Exposs"
	Class	       "Desert"

	Mass            0.385054
	Radius          5705.52
	InertiaMoment   0.327207

	Obliquity       -0.61305
	EqAscendNode    11.9224
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.371991
	AlbedoGeom      0.44639
	Brightness      2
	Color          (0.702 0.662 0.587)

	Surface
	{
		SurfStyle       0.475573
		OceanStyle      0.190056
		Randomize      (-0.663, 0.848, 0.202)
		colorDistMagn   0.0410465
		colorDistFreq   720.239
		detailScale     14674.9
		colorConversion true
		seaLevel        0.0566825
		snowLevel       0.85
		tropicLatitude  0.0212825
		icecapLatitude  0.89876
		icecapHeight    0.0635259
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.06171
		venusFreq       1.10994
		venusMagn       0.514924
		mareFreq        1.28815
		mareDensity     0.0468066
		terraceProb     0.336056
		erosion         0
		montesMagn      0.208173
		montesFreq      190.871
		montesSpiky     0.899772
		montesFraction  0.999307
		dunesMagn       0.0503993
		dunesFreq       59.2154
		dunesFraction   0.0417689
		hillsMagn       0.174006
		hillsFreq       703.205
		hillsFraction   0
		hills2Fraction  0
		riversMagn      58.6482
		riversFreq      4.54894
		riversSin       5.1655
		riversOctaves   0
		canyonsMagn     0.0547374
		canyonsFreq     146.316
		canyonFraction  0
		cracksMagn      0.0747842
		cracksFreq      0.516121
		cracksOctaves   0
		craterMagn      0.522147
		craterFreq      14.6296
		craterDensity   0
		craterOctaves   0.366713
		volcanoMagn     0.647923
		volcanoFreq     0.618873
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.701163
		volcanoRadius   0.518283
		volcanoTemp     1566.17
		lavaCoverTidal  0.370075
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.11645
		stripeTwist     0.375537
		cycloneMagn     3.76488
		cycloneFreq     0.910899
		cycloneDensity  0.319524
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
		Height          14.9927
		Velocity        85.2558
		BumpHeight      4.99276
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.05788
		mainOctaves     10
		Coverage        0.343983
		stripeZones     2.11645
		stripeTwist     0.375537
	}

	Clouds
	{
		Height          19.9854
		Velocity        49.2899
		BumpHeight      4.99276
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.05788
		mainOctaves     10
		Coverage        0.343983
		stripeZones     2.11645
		stripeTwist     0.375537
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          89.3829
		Density         1.35829
		Pressure        0.746641
		Greenhouse      2.20135
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0
		Saturation      1

		Composition
		{
			CO2   	30.1045
			H2S   	22.9971
			C2H2  	22.8482
			CH4   	14.8781
			C2H4  	7.60101
			NH3   	0.437711
			C3H8  	0.418347
			SO2   	0.309726
			C2H6  	0.267468
			N2    	0.135259
			CO    	0.00187783
			H2O   	0.000423449
			Cl2   	0.000252507
			Ar    	2.0061e-005
			O2    	1.41169e-005
			Ne    	1.3378e-005
		}
	}

	Aurora
	{
		Height      63.5554
		NorthLat    45.0458
		NorthLon    148.314
		NorthRadius 1183.09
		NorthWidth  410.954
		NorthRings  3
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -44.3938
		SouthLon    355.355
		SouthRadius 1591.23
		SouthWidth  229.055
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
		SemiMajorAxis   0.00813349
		Period          0.0101495
		Eccentricity    0.0431074
		Inclination     -0.61305
		AscendingNode   11.9224
		ArgOfPericenter 99.9382
		MeanAnomaly     -102.04
	}
}

Moon	"Su Exposs 5"
{
	ParentBody     "Su Exposs"
	Class	       "Desert"

	Mass            0.0451559
	Radius          2669.06
	InertiaMoment   0.348662

	Obliquity       -0.67236
	EqAscendNode    -116.206
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.501 0.496 0.487)

	Surface
	{
		SurfStyle       0.603902
		OceanStyle      0.858672
		Randomize      (0.605, 0.574, 0.840)
		colorDistMagn   0.0660163
		colorDistFreq   294.137
		detailScale     6864.98
		colorConversion true
		seaLevel        0.0570963
		snowLevel       2
		tropicLatitude  0.0124006
		icecapLatitude  0.895217
		icecapHeight    0.0648292
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.976453
		venusFreq       0.709961
		venusMagn       0.383167
		mareFreq        1.46061
		mareDensity     0.0133798
		terraceProb     0.751629
		erosion         0
		montesMagn      0.180258
		montesFreq      91.1915
		montesSpiky     0.982703
		montesFraction  0.619335
		dunesMagn       0.0481667
		dunesFreq       33.824
		dunesFraction   0.858618
		hillsMagn       0.122192
		hillsFreq       316.806
		hillsFraction   0
		hills2Fraction  0
		riversMagn      54.7115
		riversFreq      2.89486
		riversSin       6.22862
		riversOctaves   0
		canyonsMagn     0.0257089
		canyonsFreq     67.573
		canyonFraction  0
		cracksMagn      0.0783007
		cracksFreq      0.200238
		cracksOctaves   0
		craterMagn      0.540294
		craterFreq      9.24194
		craterDensity   0.924429
		craterOctaves   11.8846
		volcanoMagn     0.614573
		volcanoFreq     0.926215
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.664828
		volcanoRadius   0.404993
		volcanoTemp     1613.25
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
		Hapke           0.958675
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
		Height          40.7653
		Density         0.00413248
		Pressure        0.00106871
		Greenhouse      0.0520022
		Bright          5.2874
		Opacity         1
		SkyLight        1.76247
		Hue             -0.0439992
		Saturation      1

		Composition
		{
			SO2   	99.9852
			Cl2   	0.00975352
			Kr    	0.00497321
			Xe    	4.97396e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0114857
		Period          0.0170337
		Eccentricity    0.0359416
		Inclination     -0.67236
		AscendingNode   -116.206
		ArgOfPericenter -141.224
		MeanAnomaly     -38.3371
	}
}

Moon	"Su Exposs 6"
{
	ParentBody     "Su Exposs"
	Class	       "Desert"

	Mass            0.0527361
	Radius          3037.48
	InertiaMoment   0.344112

	Obliquity       0.722753
	EqAscendNode    -130.088
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.527 0.524 0.518)

	Surface
	{
		SurfStyle       0.195504
		OceanStyle      0.914593
		Randomize      (-0.816, 0.676, 0.047)
		colorDistMagn   0.0454604
		colorDistFreq   388.397
		detailScale     7812.57
		colorConversion true
		seaLevel        0.0444801
		snowLevel       2
		tropicLatitude  0.0106417
		icecapLatitude  0.918214
		icecapHeight    0.0512298
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.22235
		venusFreq       0.966886
		venusMagn       0.350109
		mareFreq        1.32413
		mareDensity     0.0110833
		terraceProb     0.270764
		erosion         0
		montesMagn      0.197066
		montesFreq      111.006
		montesSpiky     0.839891
		montesFraction  0.83361
		dunesMagn       0.0509898
		dunesFreq       29.5919
		dunesFraction   0.500857
		hillsMagn       0.132125
		hillsFreq       304.727
		hillsFraction   0
		hills2Fraction  0
		riversMagn      60.0929
		riversFreq      3.19854
		riversSin       5.43962
		riversOctaves   0
		canyonsMagn     0.0457179
		canyonsFreq     78.2402
		canyonFraction  0
		cracksMagn      0.0854357
		cracksFreq      0.302739
		cracksOctaves   0
		craterMagn      0.551099
		craterFreq      9.49866
		craterDensity   0.692816
		craterOctaves   9.01035
		volcanoMagn     0.636989
		volcanoFreq     0.620628
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.396413
		volcanoRadius   0.493151
		volcanoTemp     1691.72
		lavaCoverTidal  0
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
		Hapke           0.783837
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
		Height          53.3392
		Density         0.0216163
		Pressure        0.00559002
		Greenhouse      0.100767
		Bright          7.36133
		Opacity         1
		SkyLight        2.45378
		Hue             -0.0362478
		Saturation      1

		Composition
		{
			SO2   	99.9945
			Kr    	0.00434853
			Cl2   	0.00098586
			Xe    	0.000138453
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0162195
		Period          0.0285844
		Eccentricity    0.0093745
		Inclination     0.722753
		AscendingNode   -130.088
		ArgOfPericenter 64.294
		MeanAnomaly     -147.627
	}
}

Moon	"Su Exposs 7"
{
	ParentBody     "Su Exposs"
	Class	       "Desert"

	Mass            0.0613885
	Radius          2946.79
	InertiaMoment   0.340059

	Obliquity       -1.38393
	EqAscendNode    -121.888
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.627 0.620 0.617)

	Surface
	{
		SurfStyle       0.556819
		OceanStyle      0.643449
		Randomize      (0.927, 0.621, 0.018)
		colorDistMagn   0.0572416
		colorDistFreq   316.065
		detailScale     7579.3
		colorConversion true
		seaLevel        0.149599
		snowLevel       2
		tropicLatitude  0.0234588
		icecapLatitude  0.728765
		icecapHeight    0.161332
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.98496
		venusFreq       1.07629
		venusMagn       0
		mareFreq        1.25151
		mareDensity     0.0168161
		terraceProb     0.419741
		erosion         0
		montesMagn      0.247942
		montesFreq      128.717
		montesSpiky     0.939741
		montesFraction  0.983083
		dunesMagn       0.0496752
		dunesFreq       17.4445
		dunesFraction   0.120733
		hillsMagn       0.132168
		hillsFreq       311.928
		hillsFraction   0
		hills2Fraction  0
		riversMagn      55.2509
		riversFreq      2.93231
		riversSin       7.16317
		riversOctaves   0
		canyonsMagn     0.0607202
		canyonsFreq     77.9146
		canyonFraction  0
		cracksMagn      0.103757
		cracksFreq      0.192742
		cracksOctaves   0
		craterMagn      0.57254
		craterFreq      5.79788
		craterDensity   0.619947
		craterOctaves   9.51005
		volcanoMagn     0.731308
		volcanoFreq     0.646716
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 0.959542
		volcanoFlows    0.437831
		volcanoRadius   0.538826
		volcanoTemp     1306.5
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
		Hapke           0.83822
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
		Height          41.9928
		Density         0.016178
		Pressure        0.00419264
		Greenhouse      0.0898158
		Bright          6.94681
		Opacity         1
		SkyLight        2.3156
		Hue             -0.0284964
		Saturation      1

		Composition
		{
			SO2   	99.9941
			Kr    	0.00478153
			Cl2   	0.000616808
			Xe    	0.000484658
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0229044
		Period          0.0479678
		Eccentricity    0.00431219
		Inclination     -1.38393
		AscendingNode   -121.888
		ArgOfPericenter -97.4447
		MeanAnomaly     41.0799
	}
}

DwarfMoon	"Su Exposs D2"
{
	ParentBody     "Su Exposs"
	Class	       "Asteroid"

	Mass            1.2685e-008
	Radius          38.0341
	InertiaMoment   0.399431

	Obliquity       -42.0086
	EqAscendNode    89.8228
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.544 0.541 0.535)

	Surface
	{
		SurfStyle       0.0935706
		OceanStyle      0.769713
		Randomize      (0.245, -0.955, -0.227)
		colorDistMagn   0.845126
		colorDistFreq   1.08419
		detailScale     1038.58
		colorConversion true
		snowLevel       2
		tropicLatitude  0.834683
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.491591
		terraceProb     0.298499
		erosion         0
		montesMagn      0.379764
		montesFreq      3.07328
		montesSpiky     0.981974
		montesFraction  0.275761
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.80447
		hillsFraction   0.589082
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.18806
		craterFreq      0.150751
		craterDensity   0.936956
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.553477
		volcanoTemp     1600.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.217, 0.216, 0.214, 0.000)
		colorShelf     (0.231, 0.230, 0.227, 0.000)
		colorBeach     (0.245, 0.243, 0.241, 0.000)
		colorDesert    (0.258, 0.257, 0.254, 0.000)
		colorLowland   (0.272, 0.270, 0.267, 0.000)
		colorUpland    (0.285, 0.284, 0.281, 0.000)
		colorRock      (0.299, 0.297, 0.294, 0.000)
		colorSnow      (0.313, 0.311, 0.308, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.100664
		Period          0.441969
		Eccentricity    0.136873
		Inclination     -42.0086
		AscendingNode   89.8228
		ArgOfPericenter -7.96217
		MeanAnomaly     115.476
	}
}

DwarfMoon	"Su Exposs D3"
{
	ParentBody     "Su Exposs"
	Class	       "Asteroid"

	Mass            1.72586e-008
	Radius          38.157
	InertiaMoment   0.396941

	Obliquity       -65.364
	EqAscendNode    63.4119
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.824 0.731 0.693)

	Surface
	{
		SurfStyle       0.00806528
		OceanStyle      0.101363
		Randomize      (-0.618, -0.408, -0.379)
		colorDistMagn   0.297722
		colorDistFreq   0.622893
		detailScale     1041.94
		colorConversion true
		snowLevel       2
		tropicLatitude  0.980597
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.382834
		terraceProb     0.277641
		erosion         0
		montesMagn      0.509629
		montesFreq      3.9365
		montesSpiky     0.908526
		montesFraction  0.325051
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.43229
		hillsFraction   0.735809
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257343
		craterFreq      0.25396
		craterDensity   0.977517
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.432588
		volcanoTemp     1712.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.330, 0.292, 0.277, 0.000)
		colorShelf     (0.350, 0.311, 0.294, 0.000)
		colorBeach     (0.371, 0.329, 0.312, 0.000)
		colorDesert    (0.392, 0.347, 0.329, 0.000)
		colorLowland   (0.412, 0.365, 0.346, 0.000)
		colorUpland    (0.433, 0.384, 0.364, 0.000)
		colorRock      (0.453, 0.402, 0.381, 0.000)
		colorSnow      (0.474, 0.420, 0.398, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.101046
		Period          0.444483
		Eccentricity    0.430003
		Inclination     -65.364
		AscendingNode   63.4119
		ArgOfPericenter 48.528
		MeanAnomaly     -150.151
	}
}

DwarfMoon	"Su Exposs D4"
{
	ParentBody     "Su Exposs"
	Class	       "Asteroid"

	Mass            2.34408e-008
	Radius          40.4152
	InertiaMoment   0.398575

	Obliquity       74.8932
	EqAscendNode    80.903
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.594 0.488 0.433)

	Surface
	{
		SurfStyle       0.336114
		OceanStyle      0.694314
		Randomize      (-0.966, 0.767, 0.175)
		colorDistMagn   0.810551
		colorDistFreq   1.20189
		detailScale     1103.6
		colorConversion true
		snowLevel       2
		tropicLatitude  0.996839
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.586
		terraceProb     0.421631
		erosion         0
		montesMagn      0.571654
		montesFreq      3.19349
		montesSpiky     0.967963
		montesFraction  0.32548
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.03438
		hillsFraction   0.842678
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221984
		craterFreq      0.198879
		craterDensity   0.902696
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.572211
		volcanoTemp     1419.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.238, 0.195, 0.173, 0.000)
		colorShelf     (0.253, 0.207, 0.184, 0.000)
		colorBeach     (0.268, 0.220, 0.195, 0.000)
		colorDesert    (0.282, 0.232, 0.206, 0.000)
		colorLowland   (0.297, 0.244, 0.216, 0.000)
		colorUpland    (0.312, 0.256, 0.227, 0.000)
		colorRock      (0.327, 0.269, 0.238, 0.000)
		colorSnow      (0.342, 0.281, 0.249, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.101692
		Period          0.448754
		Eccentricity    0.165177
		Inclination     74.8932
		AscendingNode   80.903
		ArgOfPericenter -118.929
		MeanAnomaly     -65.6162
	}
}

DwarfMoon	"Su Exposs D5"
{
	ParentBody     "Su Exposs"
	Class	       "Asteroid"

	Mass            3.18107e-008
	Radius          42.9449
	InertiaMoment   0.39956

	Obliquity       -89.5232
	EqAscendNode    -6.85369
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.814 0.789 0.747)

	Surface
	{
		SurfStyle       0.0342369
		OceanStyle      0.434977
		Randomize      (-0.640, -0.446, -0.856)
		colorDistMagn   0.582172
		colorDistFreq   0.979526
		detailScale     1172.68
		colorConversion true
		snowLevel       2
		tropicLatitude  0.120477
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.410571
		terraceProb     0.192388
		erosion         0
		montesMagn      0.549703
		montesFreq      2.0932
		montesSpiky     0.953175
		montesFraction  0.671818
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.09482
		hillsFraction   0.516734
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240668
		craterFreq      0.238132
		craterDensity   0.993312
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.471386
		volcanoTemp     1568.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.326, 0.315, 0.299, 0.000)
		colorShelf     (0.346, 0.335, 0.318, 0.000)
		colorBeach     (0.367, 0.355, 0.336, 0.000)
		colorDesert    (0.387, 0.375, 0.355, 0.000)
		colorLowland   (0.407, 0.394, 0.374, 0.000)
		colorUpland    (0.428, 0.414, 0.392, 0.000)
		colorRock      (0.448, 0.434, 0.411, 0.000)
		colorSnow      (0.468, 0.453, 0.430, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.102345
		Period          0.453086
		Eccentricity    0.379364
		Inclination     -89.5232
		AscendingNode   -6.85369
		ArgOfPericenter -88.3812
		MeanAnomaly     -17.4527
	}
}

DwarfMoon	"Su Exposs D6"
{
	ParentBody     "Su Exposs"
	Class	       "Asteroid"

	Mass            4.31697e-008
	Radius          61.5164
	InertiaMoment   0.397293

	RotationPeriod  8014.7
	Obliquity       29.2404
	EqAscendNode    -79.3973
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.779 0.777 0.774)

	Surface
	{
		SurfStyle       0.219931
		OceanStyle      0.179902
		Randomize      (0.121, 0.966, -0.153)
		colorDistMagn   0.546059
		colorDistFreq   1.8095
		detailScale     1679.81
		colorConversion true
		snowLevel       2
		tropicLatitude  0.696569
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.374614
		terraceProb     0.340716
		erosion         0
		montesMagn      0.632842
		montesFreq      3.18428
		montesSpiky     0.966391
		montesFraction  0.478255
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.06762
		hillsFraction   0.709759
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247546
		craterFreq      0.186968
		craterDensity   1.01201
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.542194
		volcanoTemp     2012.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.311, 0.311, 0.310, 0.000)
		colorShelf     (0.331, 0.330, 0.329, 0.000)
		colorBeach     (0.350, 0.350, 0.349, 0.000)
		colorDesert    (0.370, 0.369, 0.368, 0.000)
		colorLowland   (0.389, 0.388, 0.387, 0.000)
		colorUpland    (0.409, 0.408, 0.407, 0.000)
		colorRock      (0.428, 0.427, 0.426, 0.000)
		colorSnow      (0.448, 0.447, 0.445, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.102957
		Period          0.457157
		Eccentricity    0.291087
		Inclination     29.2404
		AscendingNode   -79.3973
		ArgOfPericenter -84.1004
		MeanAnomaly     117.949
	}
}

DwarfMoon	"Su Exposs D7"
{
	ParentBody     "Su Exposs"
	Class	       "Asteroid"

	Mass            5.86366e-008
	Radius          57.8188
	InertiaMoment   0.398731

	Obliquity       -88.1116
	EqAscendNode    70.878
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.543 0.540 0.538)

	Surface
	{
		SurfStyle       0.784117
		OceanStyle      0.435031
		Randomize      (0.901, 0.902, -0.805)
		colorDistMagn   0.911614
		colorDistFreq   2.35083
		detailScale     1578.84
		colorConversion true
		snowLevel       2
		tropicLatitude  0.945322
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.635742
		terraceProb     0.337429
		erosion         0
		montesMagn      0.593085
		montesFreq      3.94266
		montesSpiky     0.953719
		montesFraction  0.839095
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.44418
		hillsFraction   0.863194
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228021
		craterFreq      0.230259
		craterDensity   0.885439
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.525858
		volcanoTemp     1810.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.212, 0.183, 0.151, 0.000)
		colorShelf     (0.217, 0.189, 0.172, 0.000)
		colorBeach     (0.255, 0.221, 0.204, 0.000)
		colorDesert    (0.277, 0.237, 0.199, 0.000)
		colorLowland   (0.304, 0.254, 0.226, 0.000)
		colorUpland    (0.337, 0.308, 0.274, 0.000)
		colorRock      (0.364, 0.335, 0.296, 0.000)
		colorSnow      (0.396, 0.356, 0.312, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.103451
		Period          0.460445
		Eccentricity    0.374833
		Inclination     -88.1116
		AscendingNode   70.878
		ArgOfPericenter -83.2594
		MeanAnomaly     153.174
	}
}

DwarfMoon	"Su Exposs D8"
{
	ParentBody     "Su Exposs"
	Class	       "Asteroid"

	Mass            7.97849e-008
	Radius          61.1412
	InertiaMoment   0.399688

	RotationPeriod  6783.08
	Obliquity       -8.17182
	EqAscendNode    -154.109
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.779 0.775 0.772)

	Surface
	{
		SurfStyle       0.0681563
		OceanStyle      0.172047
		Randomize      (0.323, -0.576, -0.778)
		colorDistMagn   0.507116
		colorDistFreq   2.02576
		detailScale     1669.56
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0636533
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.380003
		terraceProb     0.197791
		erosion         0
		montesMagn      0.485559
		montesFreq      3.11779
		montesSpiky     0.972878
		montesFraction  0.6946
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.08198
		hillsFraction   0.528862
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.265722
		craterFreq      0.234923
		craterDensity   0.901021
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.499821
		volcanoTemp     1381
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.311, 0.310, 0.309, 0.000)
		colorShelf     (0.331, 0.329, 0.328, 0.000)
		colorBeach     (0.350, 0.349, 0.347, 0.000)
		colorDesert    (0.370, 0.368, 0.367, 0.000)
		colorLowland   (0.389, 0.387, 0.386, 0.000)
		colorUpland    (0.409, 0.407, 0.405, 0.000)
		colorRock      (0.428, 0.426, 0.425, 0.000)
		colorSnow      (0.448, 0.446, 0.444, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.104025
		Period          0.464286
		Eccentricity    0.47161
		Inclination     -8.17182
		AscendingNode   -154.109
		ArgOfPericenter -34.885
		MeanAnomaly     85.5482
	}
}

DwarfMoon	"Su Exposs D9"
{
	ParentBody     "Su Exposs"
	Class	       "Asteroid"

	Mass            1.08852e-007
	Radius          65.1248
	InertiaMoment   0.397578

	Obliquity       -59.9282
	EqAscendNode    177.803
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.509 0.453 0.405)

	Surface
	{
		SurfStyle       0.0807392
		OceanStyle      0.701584
		Randomize      (0.867, 0.394, -0.955)
		colorDistMagn   0.564318
		colorDistFreq   1.55202
		detailScale     1778.34
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0331806
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.641174
		terraceProb     0.257957
		erosion         0
		montesMagn      0.496932
		montesFreq      2.65239
		montesSpiky     0.975946
		montesFraction  0.695751
		dunesFraction   0
		hillsMagn       0
		hillsFreq       10.052
		hillsFraction   0.711112
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.208315
		craterFreq      0.256391
		craterDensity   0.872378
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.529416
		volcanoTemp     1269.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.204, 0.181, 0.162, 0.000)
		colorShelf     (0.216, 0.193, 0.172, 0.000)
		colorBeach     (0.229, 0.204, 0.182, 0.000)
		colorDesert    (0.242, 0.215, 0.192, 0.000)
		colorLowland   (0.254, 0.227, 0.203, 0.000)
		colorUpland    (0.267, 0.238, 0.213, 0.000)
		colorRock      (0.280, 0.249, 0.223, 0.000)
		colorSnow      (0.293, 0.261, 0.233, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.104462
		Period          0.467214
		Eccentricity    0.157894
		Inclination     -59.9282
		AscendingNode   177.803
		ArgOfPericenter 161.4
		MeanAnomaly     103.652
	}
}

DwarfMoon	"Su Exposs D10"
{
	ParentBody     "Su Exposs"
	Class	       "Asteroid"

	Mass            1.4905e-007
	Radius          67.4157
	InertiaMoment   0.398881

	Obliquity       -59.5856
	EqAscendNode    55.3723
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.800 0.753 0.660)

	Surface
	{
		SurfStyle       0.294132
		OceanStyle      0.636504
		Randomize      (-0.252, 0.066, -0.517)
		colorDistMagn   0.881493
		colorDistFreq   3.55515
		detailScale     1840.9
		colorConversion true
		snowLevel       2
		tropicLatitude  0.986072
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.53385
		terraceProb     0.181388
		erosion         0
		montesMagn      0.430744
		montesFreq      3.07108
		montesSpiky     0.865223
		montesFraction  0.334868
		dunesFraction   0
		hillsMagn       0
		hillsFreq       14.2863
		hillsFraction   0.534719
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.283542
		craterFreq      0.228947
		craterDensity   0.867191
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49427
		volcanoTemp     1386.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.301, 0.264, 0.000)
		colorShelf     (0.340, 0.320, 0.281, 0.000)
		colorBeach     (0.360, 0.339, 0.297, 0.000)
		colorDesert    (0.380, 0.358, 0.314, 0.000)
		colorLowland   (0.400, 0.376, 0.330, 0.000)
		colorUpland    (0.420, 0.395, 0.347, 0.000)
		colorRock      (0.440, 0.414, 0.363, 0.000)
		colorSnow      (0.460, 0.433, 0.380, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.104838
		Period          0.46974
		Eccentricity    0.0306817
		Inclination     -59.5856
		AscendingNode   55.3723
		ArgOfPericenter -28.6742
		MeanAnomaly     76.2001
	}
}

DwarfMoon	"Su Exposs D11"
{
	ParentBody     "Su Exposs"
	Class	       "Asteroid"

	Mass            2.05053e-007
	Radius          88.531
	InertiaMoment   0.399814

	RotationPeriod  16528.6
	Obliquity       -49.0977
	EqAscendNode    -44.7374
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.678 0.675 0.671)

	Surface
	{
		SurfStyle       0.0537024
		OceanStyle      0.2247
		Randomize      (0.951, -0.425, 0.321)
		colorDistMagn   0.137923
		colorDistFreq   5.40559
		detailScale     2417.49
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999737
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.287532
		terraceProb     0.438104
		erosion         0
		montesMagn      0.447128
		montesFreq      3.6755
		montesSpiky     0.939954
		montesFraction  0.82729
		dunesFraction   0
		hillsMagn       0
		hillsFreq       15.8062
		hillsFraction   0.644847
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233119
		craterFreq      0.293535
		craterDensity   0.660669
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.468532
		volcanoTemp     1553.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.271, 0.270, 0.269, 0.000)
		colorShelf     (0.288, 0.287, 0.285, 0.000)
		colorBeach     (0.305, 0.304, 0.302, 0.000)
		colorDesert    (0.322, 0.320, 0.319, 0.000)
		colorLowland   (0.339, 0.337, 0.336, 0.000)
		colorUpland    (0.356, 0.354, 0.352, 0.000)
		colorRock      (0.373, 0.371, 0.369, 0.000)
		colorSnow      (0.390, 0.388, 0.386, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.105084
		Period          0.471394
		Eccentricity    0.377229
		Inclination     -49.0977
		AscendingNode   -44.7374
		ArgOfPericenter -117.426
		MeanAnomaly     2.79397
	}
}

DwarfMoon	"Su Exposs D12"
{
	ParentBody     "Su Exposs"
	Class	       "Asteroid"

	Mass            2.83755e-007
	Radius          93.8706
	InertiaMoment   0.39782

	RotationPeriod  12458.9
	Obliquity       -77.5354
	EqAscendNode    -53.2826
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.604 0.601 0.596)

	Surface
	{
		SurfStyle       0.00940361
		OceanStyle      0.77868
		Randomize      (-0.521, 0.091, 0.328)
		colorDistMagn   0.658351
		colorDistFreq   6.8347
		detailScale     2563.29
		colorConversion true
		snowLevel       2
		tropicLatitude  0.852068
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.544777
		terraceProb     0.309553
		erosion         0
		montesMagn      0.574445
		montesFreq      2.99387
		montesSpiky     0.89772
		montesFraction  0.67562
		dunesFraction   0
		hillsMagn       0
		hillsFreq       20.2429
		hillsFraction   0.755225
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252474
		craterFreq      0.316767
		craterDensity   0.823129
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.495865
		volcanoTemp     2134.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.242, 0.240, 0.239, 0.000)
		colorShelf     (0.257, 0.255, 0.253, 0.000)
		colorBeach     (0.272, 0.270, 0.268, 0.000)
		colorDesert    (0.287, 0.285, 0.283, 0.000)
		colorLowland   (0.302, 0.300, 0.298, 0.000)
		colorUpland    (0.317, 0.315, 0.313, 0.000)
		colorRock      (0.332, 0.330, 0.328, 0.000)
		colorSnow      (0.347, 0.345, 0.343, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.105437
		Period          0.47377
		Eccentricity    0.389741
		Inclination     -77.5354
		AscendingNode   -53.2826
		ArgOfPericenter -141.12
		MeanAnomaly     -143.666
	}
}

DwarfMoon	"Su Exposs D13"
{
	ParentBody     "Su Exposs"
	Class	       "Asteroid"

	Mass            3.95479e-007
	Radius          100.724
	InertiaMoment   0.399024

	Obliquity       -51.3942
	EqAscendNode    95.9557
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.736 0.734 0.732)

	Surface
	{
		SurfStyle       0.00690062
		OceanStyle      0.484287
		Randomize      (-0.645, 0.249, -0.611)
		colorDistMagn   0.27705
		colorDistFreq   7.12187
		detailScale     2750.43
		colorConversion true
		snowLevel       2
		tropicLatitude  0.891669
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.415869
		terraceProb     0.27697
		erosion         0
		montesMagn      0.485302
		montesFreq      2.81195
		montesSpiky     0.991349
		montesFraction  0.931871
		dunesFraction   0
		hillsMagn       0
		hillsFreq       31.6683
		hillsFraction   0.620134
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238103
		craterFreq      0.332085
		craterDensity   0.894471
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.526378
		volcanoTemp     1509.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.295, 0.294, 0.293, 0.000)
		colorShelf     (0.313, 0.312, 0.311, 0.000)
		colorBeach     (0.331, 0.330, 0.329, 0.000)
		colorDesert    (0.350, 0.349, 0.348, 0.000)
		colorLowland   (0.368, 0.367, 0.366, 0.000)
		colorUpland    (0.387, 0.385, 0.384, 0.000)
		colorRock      (0.405, 0.404, 0.403, 0.000)
		colorSnow      (0.423, 0.422, 0.421, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.106098
		Period          0.478231
		Eccentricity    0.0454281
		Inclination     -51.3942
		AscendingNode   95.9557
		ArgOfPericenter -73.5866
		MeanAnomaly     -26.4593
	}
}

DwarfMoon	"Su Exposs D14"
{
	ParentBody     "Su Exposs"
	Class	       "Asteroid"

	Mass            5.55969e-007
	Radius          106.576
	InertiaMoment   0.399939

	RotationPeriod  1834.37
	Obliquity       53.3896
	EqAscendNode    -131.306
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.721 0.718 0.716)

	Surface
	{
		SurfStyle       0.443452
		OceanStyle      0.49519
		Randomize      (-0.537, 0.709, 0.491)
		colorDistMagn   0.625788
		colorDistFreq   6.55528
		detailScale     2910.22
		colorConversion true
		snowLevel       2
		tropicLatitude  0.624689
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.749522
		terraceProb     0.19963
		erosion         0
		montesMagn      0.441423
		montesFreq      2.70881
		montesSpiky     0.960995
		montesFraction  0.495462
		dunesFraction   0
		hillsMagn       0
		hillsFreq       23.6065
		hillsFraction   0.50165
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24235
		craterFreq      0.384194
		craterDensity   0.754098
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.515974
		volcanoTemp     1532.82
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.289, 0.287, 0.286, 0.000)
		colorShelf     (0.307, 0.305, 0.304, 0.000)
		colorBeach     (0.325, 0.323, 0.322, 0.000)
		colorDesert    (0.343, 0.341, 0.340, 0.000)
		colorLowland   (0.361, 0.359, 0.358, 0.000)
		colorUpland    (0.379, 0.377, 0.376, 0.000)
		colorRock      (0.397, 0.395, 0.394, 0.000)
		colorSnow      (0.415, 0.413, 0.412, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.10655
		Period          0.481295
		Eccentricity    0.178603
		Inclination     53.4122
		AscendingNode   -131.302
		ArgOfPericenter 43.7013
		MeanAnomaly     -44.9566
	}
}

DwarfMoon	"Su Exposs D15"
{
	ParentBody     "Su Exposs"
	Class	       "Asteroid"

	Mass            7.89723e-007
	Radius          140.145
	InertiaMoment   0.398033

	RotationPeriod  2895.25
	Obliquity       -14.0031
	EqAscendNode    -23.6381
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.726 0.723 0.719)

	Surface
	{
		SurfStyle       0.944595
		OceanStyle      0.694295
		Randomize      (-0.812, 0.899, -0.696)
		colorDistMagn   0.977966
		colorDistFreq   7.16114
		detailScale     3826.89
		colorConversion true
		snowLevel       2
		tropicLatitude  0.460235
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.391662
		terraceProb     0.261196
		erosion         0
		montesMagn      0.565108
		montesFreq      3.14768
		montesSpiky     0.909634
		montesFraction  0.569453
		dunesFraction   0
		hillsMagn       0
		hillsFreq       48.6323
		hillsFraction   0.665149
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251602
		craterFreq      0.740593
		craterDensity   0.791464
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.409031
		volcanoTemp     1505.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.247, 0.253, 0.288, 0.050)
		colorShelf     (0.291, 0.297, 0.331, 0.040)
		colorBeach     (0.334, 0.340, 0.374, 0.030)
		colorDesert    (0.378, 0.383, 0.424, 0.020)
		colorLowland   (0.421, 0.427, 0.468, 0.030)
		colorUpland    (0.465, 0.470, 0.511, 0.050)
		colorRock      (0.508, 0.513, 0.568, 0.020)
		colorSnow      (0.508, 0.513, 0.568, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.10686
		Period          0.483391
		Eccentricity    0.452828
		Inclination     -14.0047
		AscendingNode   -23.6383
		ArgOfPericenter -41.8881
		MeanAnomaly     25.1251
	}
}

// http://starwars.wikia.com/wiki/Quatin

Planet	"Quatin/Bright Jewel System 5"
{
	ParentBody     "Bright Jewel System"
	Class	       "GasGiant"

	Mass            1643.64
	Radius          76667.3
	InertiaMoment   0.257396

	Oblateness      0.0187558

	RotationPeriod  9.12279
	Obliquity       7.03199
	EqAscendNode    137.855
	//Precession      0

	AlbedoBond      0.496826
	AlbedoGeom      0.596192
	Brightness      2

	Surface
	{
		SurfStyle       0.243126
		Randomize      (0.239, -0.954, -0.689)
		detailScale     197193
		colorConversion true
		tropicLatitude  0.083003
		icecapLatitude  0.983003
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0.954796
		stripeZones     5.07434
		stripeFluct     0.365613
		stripeTwist     14.1129
		cycloneMagn     12.8431
		cycloneFreq     0.95876
		cycloneDensity  0.505911
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
		BumpHeight      5.92984
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          24.7422
		Velocity        572.592
		BumpHeight      18.814
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.889504
		mainOctaves     12
		Coverage        0.468262
		stripeZones     5.07434
		stripeFluct     0.365613
		stripeTwist     14.1129
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Venus"
		Height          100
		Density         5367.33
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.0471187
		Saturation      0.890094

		Composition
		{
			H2    	93.1051
			He    	6.54567
			CH4   	0.270186
			N2    	0.039486
			NH3   	0.0245976
			O2    	0.00821636
			C2H2  	0.00285817
			C2H4  	0.00118382
			Ne    	0.00097362
			Ar    	0.000847702
			C2H6  	0.000622413
			C3H8  	0.000303301
		}
	}

	Aurora
	{
		Height      2598.6
		NorthLat    85.853
		NorthLon    -140.408
		NorthRadius 15958.2
		NorthWidth  8971.97
		NorthRings  2
		NorthBright 1
		NorthParticles 10000
		SouthLat    -86.5532
		SouthLon    34.6785
		SouthRadius 21829.7
		SouthWidth  9109.28
		SouthRings  5
		SouthBright 1
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	Rings
	{
		InnerRadius     122018
		OuterRadius     229300
		RotationPeriod  5.03136
		RotationOffset  0
		FrontBright     0.554167
		BackBright      0.818384
		Density         0.997459
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   23.8953
		Eccentricity    0.0838852
		Inclination     -175.587
		AscendingNode   138.123
		ArgOfPericenter 248.806
		MeanAnomaly     330.416
	}
}

DwarfMoon	"Quatin D1"
{
	ParentBody     "Quatin"
	Class	       "Asteroid"

	Mass            6.6557e-007
	Radius          123.992
	InertiaMoment   0.399504

	Oblateness      0.249

	Obliquity       0.014646
	EqAscendNode    -132.956
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.752 0.749 0.744)

	Surface
	{
		SurfStyle       0.0665958
		OceanStyle      0.63911
		Randomize      (0.081, -0.835, 0.144)
		colorDistMagn   0.590124
		colorDistFreq   6.84475
		detailScale     3385.81
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.716737
		terraceProb     0.496609
		erosion         0
		montesMagn      0.429788
		montesFreq      3.38881
		montesSpiky     0.898386
		montesFraction  0.592511
		dunesFraction   0
		hillsMagn       0
		hillsFreq       39.4477
		hillsFraction   0.815081
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253068
		craterFreq      0.462322
		craterDensity   0.769065
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.435298
		volcanoTemp     1353.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.301, 0.300, 0.298, 0.000)
		colorShelf     (0.320, 0.318, 0.316, 0.000)
		colorBeach     (0.338, 0.337, 0.335, 0.000)
		colorDesert    (0.357, 0.356, 0.354, 0.000)
		colorLowland   (0.376, 0.374, 0.372, 0.000)
		colorUpland    (0.395, 0.393, 0.391, 0.000)
		colorRock      (0.413, 0.412, 0.409, 0.000)
		colorSnow      (0.432, 0.431, 0.428, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0016901
		Period          0.000991162
		Eccentricity    1.4107e-005
		Inclination     0.014646
		AscendingNode   -132.956
		ArgOfPericenter -152.997
		MeanAnomaly     -120.179
	}
}

DwarfMoon	"Quatin D2"
{
	ParentBody     "Quatin"
	Class	       "Asteroid"

	Mass            9.51215e-007
	Radius          134.131
	InertiaMoment   0.397149

	Oblateness      0.16404

	Obliquity       0.000348185
	EqAscendNode    158.652
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.689 0.575 0.514)

	Surface
	{
		SurfStyle       0.735674
		OceanStyle      0.688623
		Randomize      (0.254, -0.264, 0.494)
		colorDistMagn   0.862068
		colorDistFreq   11.7947
		detailScale     3662.66
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.455759
		terraceProb     0.118503
		erosion         0
		montesMagn      0.505519
		montesFreq      2.55016
		montesSpiky     0.938787
		montesFraction  0.45663
		dunesFraction   0
		hillsMagn       0
		hillsFreq       39.857
		hillsFraction   0.554053
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246116
		craterFreq      0.58927
		craterDensity   0.742882
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.457451
		volcanoTemp     1198.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.269, 0.195, 0.144, 0.000)
		colorShelf     (0.276, 0.201, 0.164, 0.000)
		colorBeach     (0.324, 0.236, 0.195, 0.000)
		colorDesert    (0.352, 0.253, 0.190, 0.000)
		colorLowland   (0.386, 0.270, 0.216, 0.000)
		colorUpland    (0.427, 0.328, 0.262, 0.000)
		colorRock      (0.462, 0.356, 0.282, 0.000)
		colorSnow      (0.503, 0.379, 0.298, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00210648
		Period          0.00137915
		Eccentricity    5.13789e-005
		Inclination     0.000348185
		AscendingNode   158.652
		ArgOfPericenter 12.4859
		MeanAnomaly     -136.633
	}
}

Moon	"Quatin 1"
{
	ParentBody     "Quatin"
	Class	       "Oceania"

	Mass            0.675034
	Radius          6779.1
	InertiaMoment   0.330399

	Oblateness      0.00553424

	Obliquity       -0.779235
	EqAscendNode    109.877
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.349157
	AlbedoGeom      0.418989
	Brightness      2
	Color          (0.470 0.462 0.457)

	Surface
	{
		SurfStyle       0.665192
		OceanStyle      0.614418
		Randomize      (0.449, -0.925, 0.673)
		colorDistMagn   0.0451105
		colorDistFreq   1015.33
		detailScale     17436.2
		colorConversion true
		seaLevel        0.943588
		snowLevel       2
		tropicLatitude  0.0156245
		icecapLatitude  0.890769
		icecapHeight    1.07532
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.37547
		venusFreq       1.11244
		venusMagn       0.492252
		mareFreq        0
		mareDensity     0
		terraceProb     0.177853
		erosion         0
		montesMagn      0.179479
		montesFreq      421.353
		montesSpiky     0.795723
		montesFraction  0.431941
		dunesMagn       0.0501602
		dunesFreq       74.7239
		dunesFraction   0.491999
		hillsMagn       0.141128
		hillsFreq       914.934
		hillsFraction   0.331698
		hills2Fraction  0.264644
		riversMagn      58.7933
		riversFreq      3.61894
		riversSin       5.25788
		riversOctaves   0
		canyonsMagn     0.0376804
		canyonsFreq     167.257
		canyonFraction  0.402196
		cracksMagn      0.114161
		cracksFreq      0.501898
		cracksOctaves   2
		craterMagn      0.0357849
		craterFreq      59.9799
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.713667
		volcanoFreq     0.776859
		volcanoDensity  0
		volcanoOctaves  0
		volcanoActivity 2
		volcanoFlows    0
		volcanoRadius   0.530211
		volcanoTemp     1369.78
		lavaCoverTidal  0.551118
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.29753
		stripeTwist     0.0107946
		cycloneMagn     2.34404
		cycloneFreq     0.679873
		cycloneDensity  0.369989
		cycloneOctaves  2
		colorSea       (0.040, 0.200, 0.200, 1.000)
		colorShelf     (0.150, 0.370, 0.370, 1.000)
		colorBeach     (0.950, 0.950, 0.950, 1.308)
		colorDesert    (0.770, 0.770, 0.470, 1.308)
		colorLowland   (0.880, 0.880, 0.880, 1.308)
		colorUpland    (1.000, 1.000, 1.000, 1.308)
		colorRock      (1.000, 1.000, 1.000, 1.308)
		colorSnow      (1.000, 1.000, 1.000, 1.308)
		BumpHeight      60.3682
		BumpOffset      56.9628
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
		Height          5.46387
		Velocity        84.8616
		BumpHeight      5.46381
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.03076
		mainOctaves     10
		Coverage        0.248596
		stripeZones     2.29753
		stripeTwist     0.0107946
	}

	Ocean
	{
		Height          56.9628
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
	}

	NoLava          true

	Atmosphere
	{
		Model          "Titan"
		Height          101.678
		Density         1.12623
		Pressure        0.862043
		Greenhouse      3.45001
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0
		Saturation      1

		Composition
		{
			CO2   	61.9183
			NH3   	28.9899
			CH4   	4.83036
			C2H4  	1.70184
			C2H2  	0.955881
			H2O   	0.820698
			H2S   	0.505253
			SO2   	0.197829
			N2    	0.0285218
			C2H6  	0.027322
			C3H8  	0.0237091
			CO    	0.000135451
			Cl2   	0.000108191
			Ne    	9.30651e-005
			Ar    	3.44325e-005
			O2    	1.51448e-005
		}
	}

	Aurora
	{
		Height      176.693
		NorthLat    47.8473
		NorthLon    -25.0325
		NorthRadius 1863.33
		NorthWidth  599.561
		NorthRings  5
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -67.8219
		SouthLon    150.18
		SouthRadius 2080.53
		SouthWidth  428.846
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
		SemiMajorAxis   0.00340141
		Period          0.00282928
		Eccentricity    0.00626279
		Inclination     -0.779235
		AscendingNode   109.877
		ArgOfPericenter -76.4107
		MeanAnomaly     -12.5587
	}
}

Moon	"Quatin 2"
{
	ParentBody     "Quatin"
	Class	       "Oceania"

	Mass            0.833969
	Radius          6666.78
	InertiaMoment   0.329476

	Oblateness      0.00102919

	Obliquity       0.741816
	EqAscendNode    61.7475
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.438014
	AlbedoGeom      0.525617
	Brightness      2
	Color          (0.755 0.667 0.592)

	Surface
	{
		SurfStyle       0.109353
		OceanStyle      0.836587
		Randomize      (-0.559, -0.310, 0.433)
		colorDistMagn   0.0475282
		colorDistFreq   651.991
		detailScale     17147.3
		colorConversion true
		seaLevel        0.941863
		snowLevel       2
		tropicLatitude  0.0222221
		icecapLatitude  10
		icecapHeight    1.13987
		climatePole     0.894582
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        1.1069
		venusFreq       1.21978
		venusMagn       0.226902
		mareFreq        0
		mareDensity     0
		terraceProb     0.291163
		erosion         0
		montesMagn      0.169836
		montesFreq      329.014
		montesSpiky     0.924019
		montesFraction  0.596802
		dunesMagn       0.0475518
		dunesFreq       61.165
		dunesFraction   0.846701
		hillsMagn       0.140415
		hillsFreq       965.215
		hillsFraction   0.562164
		hills2Fraction  0.556511
		riversMagn      64.0783
		riversFreq      1.54906
		riversSin       5.62283
		riversOctaves   0
		canyonsMagn     0.061816
		canyonsFreq     203.54
		canyonFraction  0.404827
		cracksMagn      0.100269
		cracksFreq      0.510713
		cracksOctaves   0
		craterMagn      0.0551027
		craterFreq      60.0058
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.690346
		volcanoFreq     0.787929
		volcanoDensity  0
		volcanoOctaves  0
		volcanoActivity 2
		volcanoFlows    0
		volcanoRadius   0.481065
		volcanoTemp     1357.35
		lavaCoverTidal  0.469266
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.02808
		stripeTwist     0.263595
		cycloneMagn     2.39417
		cycloneFreq     0.508983
		cycloneDensity  0.522207
		cycloneOctaves  4
		colorSea       (0.040, 0.200, 0.100, 1.000)
		colorShelf     (0.150, 0.460, 0.280, 1.000)
		colorBeach     (0.950, 0.950, 0.950, 1.308)
		colorDesert    (0.770, 0.770, 0.470, 1.308)
		colorLowland   (0.880, 0.880, 0.880, 1.308)
		colorUpland    (1.000, 1.000, 1.000, 1.308)
		colorRock      (1.000, 1.000, 1.000, 1.308)
		colorSnow      (1.000, 1.000, 1.000, 1.308)
		BumpHeight      35.0751
		BumpOffset      33.0359
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
		Height          4.08984
		Velocity        54.2851
		BumpHeight      4.09005
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.946577
		mainOctaves     10
		Coverage        0.396691
		stripeZones     2.02808
		stripeTwist     0.263595
	}

	Clouds
	{
		Height          8.18018
		Velocity        196.398
		BumpHeight      4.09005
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.946577
		mainOctaves     10
		Coverage        0.396691
		stripeZones     2.02808
		stripeTwist     0.263595
	}

	Ocean
	{
		Height          33.0359
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
	}

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          103.419
		Density         4.18584
		Pressure        3.60765
		Greenhouse      26.6571
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0
		Saturation      1

		Composition
		{
			CH4   	54.8605
			CO2   	11.3068
			C2H2  	11.2617
			SO2   	10.3182
			NH3   	7.66701
			H2S   	2.20735
			C2H4  	1.60518
			C2H6  	0.63887
			C3H8  	0.0661271
			N2    	0.0461825
			H2O   	0.0216215
			CO    	0.000206553
			Ar    	0.000115298
			Ne    	2.29821e-005
			Cl2   	2.25021e-005
			Kr    	1.21129e-005
		}
	}

	Aurora
	{
		Height      90.2931
		NorthLat    83.9017
		NorthLon    92.5652
		NorthRadius 1480.68
		NorthWidth  372.871
		NorthRings  3
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -62.7494
		SouthLon    237.816
		SouthRadius 2289.65
		SouthWidth  773.655
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
		SemiMajorAxis   0.0054556
		Period          0.00574685
		Eccentricity    0.0195748
		Inclination     0.741816
		AscendingNode   61.7475
		ArgOfPericenter -121.315
		MeanAnomaly     37.7064
	}
}

DwarfMoon	"Quatin D3"
{
	ParentBody     "Quatin"
	Class	       "Asteroid"

	Mass            3.04849e-006
	Radius          207.115
	InertiaMoment   0.397458

	Oblateness      0.00263205

	Obliquity       1.18644
	EqAscendNode    111.135
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.682 0.679 0.678)

	Surface
	{
		SurfStyle       0.61445
		OceanStyle      0.194837
		Randomize      (-0.528, 0.834, 0.896)
		colorDistMagn   0.768412
		colorDistFreq   29.6135
		detailScale     5655.62
		colorConversion true
		snowLevel       2
		tropicLatitude  0.023413
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.471017
		terraceProb     0.452828
		erosion         0
		montesMagn      0.459725
		montesFreq      2.34834
		montesSpiky     0.918418
		montesFraction  0.336173
		dunesFraction   0
		hillsMagn       0
		hillsFreq       83.4475
		hillsFraction   0.665312
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222193
		craterFreq      1.60184
		craterDensity   0.72447
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.512767
		volcanoTemp     1487.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.266, 0.231, 0.190, 0.000)
		colorShelf     (0.273, 0.238, 0.217, 0.000)
		colorBeach     (0.320, 0.278, 0.258, 0.000)
		colorDesert    (0.348, 0.299, 0.251, 0.000)
		colorLowland   (0.382, 0.319, 0.285, 0.000)
		colorUpland    (0.423, 0.387, 0.346, 0.000)
		colorRock      (0.457, 0.421, 0.373, 0.000)
		colorSnow      (0.498, 0.448, 0.393, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00875035
		Period          0.0116766
		Eccentricity    0.0295046
		Inclination     1.18644
		AscendingNode   111.135
		ArgOfPericenter -69.2665
		MeanAnomaly     -111.92
	}
}

Moon	"Quatin 3"
{
	ParentBody     "Quatin"
	Class	       "Desert"

	Mass            1.35784
	Radius          7706.54
	InertiaMoment   0.326286

	Obliquity       0.213261
	EqAscendNode    -16.4984
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.303597
	AlbedoGeom      0.364316
	Brightness      2
	Color          (0.568 0.563 0.559)

	Surface
	{
		SurfStyle       0.722599
		OceanStyle      0.158997
		Randomize      (0.490, 0.954, 0.557)
		colorDistMagn   0.0417579
		colorDistFreq   919.722
		detailScale     19821.7
		colorConversion true
		seaLevel        0.0849723
		snowLevel       2
		tropicLatitude  0.00736475
		icecapLatitude  10
		icecapHeight    0.144721
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        0.88599
		venusFreq       1.51529
		venusMagn       0.411651
		mareFreq        1.7584
		mareDensity     0.176979
		terraceProb     0.310082
		erosion         0
		montesMagn      0.201532
		montesFreq      366.247
		montesSpiky     0.85329
		montesFraction  0.960839
		dunesMagn       0.0448279
		dunesFreq       85.2093
		dunesFraction   0.479661
		hillsMagn       0.171208
		hillsFreq       941.123
		hillsFraction   0
		hills2Fraction  0
		riversMagn      62.1178
		riversFreq      2.30279
		riversSin       4.84904
		riversOctaves   0
		canyonsMagn     0.0268281
		canyonsFreq     238.9
		canyonFraction  0
		cracksMagn      0.0834016
		cracksFreq      0.646378
		cracksOctaves   0
		craterMagn      0.625145
		craterFreq      22.947
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.734446
		volcanoFreq     0.683598
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.705747
		volcanoRadius   0.426757
		volcanoTemp     1608.08
		lavaCoverTidal  0.176572
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.5299
		stripeTwist     0.361012
		cycloneMagn     1.62523
		cycloneFreq     1.10512
		cycloneDensity  0.427297
		cycloneOctaves  2
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
		Height          36.6758
		Velocity        57.374
		BumpHeight      5.5377
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.0066
		mainOctaves     10
		Coverage        0.207193
		stripeZones     2.5299
		stripeTwist     0.361012
	}

	Clouds
	{
		Height          63.3521
		Velocity        76.2973
		BumpHeight      6.82165
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.0066
		mainOctaves     10
		Coverage        0.207193
		stripeZones     2.5299
		stripeTwist     0.361012
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          249.432
		Density         45.3793
		Pressure        83.9083
		Greenhouse      338.924
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0
		Saturation      1

		Composition
		{
			H2O   	27.3368
			CH4   	21.5682
			NH3   	16.3448
			CO2   	14.3715
			H2S   	12.8408
			C2H2  	4.7643
			SO2   	1.06992
			C2H6  	1.06465
			C2H4  	0.435241
			C3H8  	0.156784
			N2    	0.0461528
			Ar    	0.000492772
			CO    	0.000183084
			Ne    	5.34215e-005
			O2    	4.07262e-005
			Cl2   	2.60295e-005
		}
	}

	Aurora
	{
		Height      79.7953
		NorthLat    70.2221
		NorthLon    5.12814
		NorthRadius 1999.03
		NorthWidth  527.927
		NorthRings  4
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -66.6311
		SouthLon    176.318
		SouthRadius 1722.78
		SouthWidth  441.796
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
		SemiMajorAxis   0.0140349
		Period          0.0237088
		Eccentricity    0.0296592
		Inclination     0.213261
		AscendingNode   -16.4984
		ArgOfPericenter -11.7066
		MeanAnomaly     -69.0172
	}
}

DwarfMoon	"Quatin D4"
{
	ParentBody     "Quatin"
	Class	       "Asteroid"

	Mass            1.31598e-011
	Radius          3.05946
	InertiaMoment   0.399758

	Obliquity       -0.998511
	EqAscendNode    97.4295
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.426 0.419 0.416)

	Surface
	{
		SurfStyle       0.259388
		OceanStyle      0.577839
		Randomize      (0.128, -0.621, -0.032)
		colorDistMagn   0.553578
		colorDistFreq   0.00553404
		detailScale     83.5437
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0229944
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.718714
		terraceProb     0.146696
		erosion         0
		montesMagn      0.512598
		montesFreq      3.28811
		montesSpiky     0.972409
		montesFraction  0.613453
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0158171
		hillsFraction   0.441676
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.273456
		craterFreq      0.231463
		craterDensity   0.813906
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.423492
		volcanoTemp     1410.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.170, 0.168, 0.166, 0.000)
		colorShelf     (0.181, 0.178, 0.177, 0.000)
		colorBeach     (0.192, 0.189, 0.187, 0.000)
		colorDesert    (0.202, 0.199, 0.198, 0.000)
		colorLowland   (0.213, 0.209, 0.208, 0.000)
		colorUpland    (0.224, 0.220, 0.218, 0.000)
		colorRock      (0.234, 0.230, 0.229, 0.000)
		colorSnow      (0.245, 0.241, 0.239, 1.000)
		BumpHeight      2.75352
		BumpOffset      0.550703
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0225109
		Period          0.0481797
		Eccentricity    0.0457994
		Inclination     -0.998511
		AscendingNode   97.4295
		ArgOfPericenter 156.984
		MeanAnomaly     49.8101
	}
}

Moon	"Quatin 4"
{
	ParentBody     "Quatin"
	Class	       "Selena"

	Mass            0.00155914
	Radius          886.062
	InertiaMoment   0.399139

	Obliquity       -1.28666
	EqAscendNode    -121.389
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.743 0.647 0.602)

	Surface
	{
		SurfStyle       0.94033
		OceanStyle      0.817153
		Randomize      (-0.174, -0.668, -0.823)
		colorDistMagn   0.0517294
		colorDistFreq   133.564
		detailScale     2279
		colorConversion true
		drivenDarkening 0
		seaLevel        0.192792
		snowLevel       2
		tropicLatitude  0.0219795
		icecapLatitude  3.66907
		icecapHeight    0.125439
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.82817
		venusFreq       0.227365
		venusMagn       0
		mareFreq        0.206921
		mareDensity     0.00100171
		terraceProb     0.433465
		erosion         0
		montesMagn      0.0540446
		montesFreq      47.7762
		montesSpiky     0.974559
		montesFraction  0.325651
		dunesMagn       0.0542116
		dunesFreq       1157.55
		dunesFraction   0.637789
		hillsMagn       0.144734
		hillsFreq       114.332
		hillsFraction   0.290073
		hills2Fraction  0
		riversMagn      57.0675
		riversFreq      3.23561
		riversSin       8.00978
		riversOctaves   0
		canyonsMagn     0.348869
		canyonsFreq     0.27898
		canyonFraction  0.426401
		cracksMagn      0.0417409
		cracksFreq      0.581557
		cracksOctaves   0
		craterMagn      0.631706
		craterFreq      2.31904
		craterDensity   0.981439
		craterOctaves   10
		craterRayedFactor 0.14978
		volcanoMagn     0.179644
		volcanoFreq     0.516658
		volcanoDensity  0.240254
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.367731
		volcanoRadius   0.149174
		volcanoTemp     1302.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.440, 0.450, 0.370, 0.000)
		colorShelf     (0.580, 0.550, 0.430, 0.000)
		colorBeach     (0.528, 0.427, 0.349, 0.000)
		colorDesert    (0.617, 0.498, 0.385, 0.000)
		colorLowland   (0.491, 0.375, 0.289, 0.000)
		colorUpland    (0.439, 0.337, 0.271, 0.000)
		colorRock      (0.330, 0.250, 0.230, 0.000)
		colorSnow      (0.940, 0.910, 0.870, 1.000)
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
		SemiMajorAxis   0.0361056
		Period          0.0978676
		Eccentricity    0.0128276
		Inclination     -1.28666
		AscendingNode   -121.389
		ArgOfPericenter 112.314
		MeanAnomaly     -123.119
	}
}

DwarfMoon	"Quatin D5"
{
	ParentBody     "Quatin"
	Class	       "Asteroid"

	Mass            4.88905e-011
	Radius          5.25429
	InertiaMoment   0.398961

	RotationPeriod  1608.96
	Obliquity       -65.5806
	EqAscendNode    2.65565
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.559 0.505 0.446)

	Surface
	{
		SurfStyle       0.589897
		OceanStyle      0.104768
		Randomize      (-0.407, 0.194, -0.148)
		colorDistMagn   0.146369
		colorDistFreq   0.00836223
		detailScale     143.477
		colorConversion true
		snowLevel       2
		tropicLatitude  0.980887
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.470873
		terraceProb     0.372114
		erosion         0
		montesMagn      0.503639
		montesFreq      2.90451
		montesSpiky     0.827529
		montesFraction  0.550859
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0779939
		hillsFraction   0.643476
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.210449
		craterFreq      0.180403
		craterDensity   0.943704
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.529384
		volcanoTemp     1382.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.218, 0.172, 0.125, 0.000)
		colorShelf     (0.224, 0.177, 0.143, 0.000)
		colorBeach     (0.263, 0.207, 0.170, 0.000)
		colorDesert    (0.285, 0.222, 0.165, 0.000)
		colorLowland   (0.313, 0.237, 0.187, 0.000)
		colorUpland    (0.347, 0.288, 0.228, 0.000)
		colorRock      (0.375, 0.313, 0.246, 0.000)
		colorSnow      (0.408, 0.333, 0.259, 1.000)
		BumpHeight      4.72886
		BumpOffset      0.945773
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.264157
		Period          1.93673
		Eccentricity    0.438975
		Inclination     -35.6763
		AscendingNode   2.78777
		ArgOfPericenter 67.5477
		MeanAnomaly     -8.51941
	}
}

DwarfMoon	"Quatin D6"
{
	ParentBody     "Quatin"
	Class	       "Asteroid"

	Mass            8.43177e-011
	Radius          6.05206
	InertiaMoment   0.399883

	RotationPeriod  1446.73
	Obliquity       -11.1609
	EqAscendNode    -7.26587
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.678 0.616 0.545)

	Surface
	{
		SurfStyle       0.97567
		OceanStyle      0.498347
		Randomize      (0.546, -0.900, 0.721)
		colorDistMagn   0.904006
		colorDistFreq   0.0127739
		detailScale     165.262
		colorConversion true
		snowLevel       2
		tropicLatitude  0.553857
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.58745
		terraceProb     0.400034
		erosion         0
		montesMagn      0.66729
		montesFreq      2.81567
		montesSpiky     0.989927
		montesFraction  0.339335
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0846835
		hillsFraction   0.614061
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244576
		craterFreq      0.168427
		craterDensity   0.979178
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.511046
		volcanoTemp     1245.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.230, 0.216, 0.218, 0.050)
		colorShelf     (0.271, 0.253, 0.251, 0.040)
		colorBeach     (0.312, 0.290, 0.283, 0.030)
		colorDesert    (0.352, 0.326, 0.321, 0.020)
		colorLowland   (0.393, 0.363, 0.354, 0.030)
		colorUpland    (0.434, 0.400, 0.387, 0.050)
		colorRock      (0.474, 0.437, 0.430, 0.020)
		colorSnow      (0.474, 0.437, 0.430, 1.000)
		BumpHeight      5.44685
		BumpOffset      1.08937
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.26454
		Period          1.94095
		Eccentricity    0.279097
		Inclination     44.73
		AscendingNode   -5.41194
		ArgOfPericenter -33.8607
		MeanAnomaly     52.3734
	}
}

DwarfMoon	"Quatin D7"
{
	ParentBody     "Quatin"
	Class	       "Asteroid"

	Mass            1.38527e-010
	Radius          6.78877
	InertiaMoment   0.397942

	RotationPeriod  1291.42
	Obliquity       -89.1988
	EqAscendNode    -48.5835
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.783 0.739 0.683)

	Surface
	{
		SurfStyle       0.0929729
		OceanStyle      0.010219
		Randomize      (-0.090, 0.340, 0.148)
		colorDistMagn   0.280439
		colorDistFreq   0.0219355
		detailScale     185.379
		colorConversion true
		snowLevel       2
		tropicLatitude  0.820126
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.474541
		terraceProb     0.209271
		erosion         0
		montesMagn      0.492707
		montesFreq      2.79305
		montesSpiky     0.946257
		montesFraction  0.51398
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.126182
		hillsFraction   0.606431
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229235
		craterFreq      0.218525
		craterDensity   1.01461
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.591953
		volcanoTemp     1160.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.313, 0.296, 0.273, 0.000)
		colorShelf     (0.333, 0.314, 0.290, 0.000)
		colorBeach     (0.352, 0.333, 0.307, 0.000)
		colorDesert    (0.372, 0.351, 0.324, 0.000)
		colorLowland   (0.391, 0.370, 0.342, 0.000)
		colorUpland    (0.411, 0.388, 0.359, 0.000)
		colorRock      (0.430, 0.407, 0.376, 0.000)
		colorSnow      (0.450, 0.425, 0.393, 1.000)
		BumpHeight      6.1099
		BumpOffset      1.22198
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.26504
		Period          1.94645
		Eccentricity    0.0127169
		Inclination     -87.2677
		AscendingNode   -55.0013
		ArgOfPericenter -96.1728
		MeanAnomaly     -127.653
	}
}

DwarfMoon	"Quatin D8"
{
	ParentBody     "Quatin"
	Class	       "Asteroid"

	Mass            2.19227e-010
	Radius          9.24608
	InertiaMoment   0.399102

	RotationPeriod  1383.15
	Obliquity       -9.61528
	EqAscendNode    -153.723
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.505 0.498 0.496)

	Surface
	{
		SurfStyle       0.230208
		OceanStyle      0.801781
		Randomize      (-0.244, 0.297, 0.417)
		colorDistMagn   0.774642
		colorDistFreq   0.013778
		detailScale     252.48
		colorConversion true
		snowLevel       2
		tropicLatitude  0.796284
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.558994
		terraceProb     0.528862
		erosion         0
		montesMagn      0.447655
		montesFreq      2.91203
		montesSpiky     0.893736
		montesFraction  0.146198
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.245421
		hillsFraction   0.541866
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219064
		craterFreq      0.252432
		craterDensity   0.73886
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.439996
		volcanoTemp     1234.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.202, 0.199, 0.198, 0.000)
		colorShelf     (0.215, 0.212, 0.211, 0.000)
		colorBeach     (0.227, 0.224, 0.223, 0.000)
		colorDesert    (0.240, 0.237, 0.235, 0.000)
		colorLowland   (0.253, 0.249, 0.248, 0.000)
		colorUpland    (0.265, 0.261, 0.260, 0.000)
		colorRock      (0.278, 0.274, 0.273, 0.000)
		colorSnow      (0.290, 0.286, 0.285, 1.000)
		BumpHeight      8.32147
		BumpOffset      1.66429
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.265492
		Period          1.95144
		Eccentricity    0.0383826
		Inclination     -61.6468
		AscendingNode   -158.419
		ArgOfPericenter 24.9753
		MeanAnomaly     158.412
	}
}

DwarfMoon	"Quatin D9"
{
	ParentBody     "Quatin"
	Class	       "Asteroid"

	Mass            3.36812e-010
	Radius          10.0597
	InertiaMoment   0.394136

	RotationPeriod  1232.54
	Obliquity       51.2326
	EqAscendNode    -133.167
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.507 0.501 0.499)

	Surface
	{
		SurfStyle       0.571634
		OceanStyle      0.500135
		Randomize      (-0.935, 0.561, -0.325)
		colorDistMagn   0.852986
		colorDistFreq   0.0378134
		detailScale     274.696
		colorConversion true
		snowLevel       2
		tropicLatitude  0.580885
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.573647
		terraceProb     0.205283
		erosion         0
		montesMagn      0.629284
		montesFreq      2.33906
		montesSpiky     0.99916
		montesFraction  0.84216
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.206034
		hillsFraction   0.694945
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253444
		craterFreq      0.206795
		craterDensity   0.929478
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.467094
		volcanoTemp     1625.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.198, 0.170, 0.140, 0.000)
		colorShelf     (0.203, 0.175, 0.160, 0.000)
		colorBeach     (0.238, 0.205, 0.190, 0.000)
		colorDesert    (0.258, 0.220, 0.185, 0.000)
		colorLowland   (0.284, 0.236, 0.210, 0.000)
		colorUpland    (0.314, 0.286, 0.255, 0.000)
		colorRock      (0.339, 0.311, 0.275, 0.000)
		colorSnow      (0.370, 0.331, 0.290, 1.000)
		BumpHeight      9.05371
		BumpOffset      1.81074
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.266117
		Period          1.95832
		Eccentricity    0.320714
		Inclination     65.161
		AscendingNode   -141.138
		ArgOfPericenter -81.4117
		MeanAnomaly     166.876
	}
}

DwarfMoon	"Quatin D10"
{
	ParentBody     "Quatin"
	Class	       "Asteroid"

	Mass            5.05239e-010
	Radius          11.0555
	InertiaMoment   0.398144

	RotationPeriod  1127.89
	Obliquity       -21.783
	EqAscendNode    -137.524
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.613 0.610 0.608)

	Surface
	{
		SurfStyle       0.0848582
		OceanStyle      0.813287
		Randomize      (-0.374, 0.717, 0.722)
		colorDistMagn   0.748746
		colorDistFreq   0.0564341
		detailScale     301.888
		colorConversion true
		snowLevel       2
		tropicLatitude  0.729013
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.285607
		terraceProb     0.543107
		erosion         0
		montesMagn      0.633473
		montesFreq      3.38117
		montesSpiky     0.982369
		montesFraction  0.794227
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.302625
		hillsFraction   0.380164
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.215085
		craterFreq      0.157841
		craterDensity   0.91011
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.585607
		volcanoTemp     1527.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.245, 0.244, 0.243, 0.000)
		colorShelf     (0.261, 0.259, 0.258, 0.000)
		colorBeach     (0.276, 0.274, 0.274, 0.000)
		colorDesert    (0.291, 0.290, 0.289, 0.000)
		colorLowland   (0.307, 0.305, 0.304, 0.000)
		colorUpland    (0.322, 0.320, 0.319, 0.000)
		colorRock      (0.337, 0.335, 0.334, 0.000)
		colorSnow      (0.353, 0.350, 0.350, 1.000)
		BumpHeight      9.94991
		BumpOffset      1.98998
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.266662
		Period          1.96435
		Eccentricity    0.00465958
		Inclination     -61.8244
		AscendingNode   -138.776
		ArgOfPericenter -73.172
		MeanAnomaly     -119.074
	}
}

DwarfMoon	"Quatin D11"
{
	ParentBody     "Quatin"
	Class	       "Asteroid"

	Mass            7.43207e-010
	Radius          12.0005
	InertiaMoment   0.399238

	RotationPeriod  1024.95
	Obliquity       43.799
	EqAscendNode    -77.176
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.803 0.767 0.700)

	Surface
	{
		SurfStyle       0.958929
		OceanStyle      0.331294
		Randomize      (-0.428, 0.203, -0.549)
		colorDistMagn   0.466933
		colorDistFreq   0.0391065
		detailScale     327.694
		colorConversion true
		snowLevel       2
		tropicLatitude  0.81666
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.376293
		terraceProb     0.337956
		erosion         0
		montesMagn      0.552519
		montesFreq      2.7338
		montesSpiky     0.907937
		montesFraction  0.677241
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.350235
		hillsFraction   0.511231
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.269136
		craterFreq      0.242297
		craterDensity   0.901636
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.616292
		volcanoTemp     1452.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.273, 0.269, 0.280, 0.050)
		colorShelf     (0.321, 0.315, 0.322, 0.040)
		colorBeach     (0.369, 0.361, 0.364, 0.030)
		colorDesert    (0.417, 0.407, 0.413, 0.020)
		colorLowland   (0.466, 0.453, 0.455, 0.030)
		colorUpland    (0.514, 0.499, 0.497, 0.050)
		colorRock      (0.562, 0.545, 0.553, 0.020)
		colorSnow      (0.562, 0.545, 0.553, 1.000)
		BumpHeight      10.8005
		BumpOffset      2.16009
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.266954
		Period          1.96758
		Eccentricity    0.186003
		Inclination     29.7456
		AscendingNode   -81.7037
		ArgOfPericenter 46.0284
		MeanAnomaly     -129.297
	}
}

DwarfMoon	"Quatin D12"
{
	ParentBody     "Quatin"
	Class	       "Asteroid"

	Mass            1.07572e-009
	Radius          15.9316
	InertiaMoment   0.396133

	RotationPeriod  1113.89
	Obliquity       -26.4114
	EqAscendNode    25.656
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.665 0.601 0.550)

	Surface
	{
		SurfStyle       0.694886
		OceanStyle      0.219013
		Randomize      (-0.721, 0.497, 0.785)
		colorDistMagn   0.993247
		colorDistFreq   0.171647
		detailScale     435.038
		colorConversion true
		snowLevel       2
		tropicLatitude  0.246059
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.579899
		terraceProb     0.808806
		erosion         0
		montesMagn      0.55193
		montesFreq      3.37698
		montesSpiky     0.892474
		montesFraction  0.647461
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.623108
		hillsFraction   0.657108
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243392
		craterFreq      0.231564
		craterDensity   1.02119
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49952
		volcanoTemp     1521.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.259, 0.204, 0.154, 0.000)
		colorShelf     (0.266, 0.210, 0.176, 0.000)
		colorBeach     (0.312, 0.246, 0.209, 0.000)
		colorDesert    (0.339, 0.264, 0.203, 0.000)
		colorLowland   (0.372, 0.282, 0.231, 0.000)
		colorUpland    (0.412, 0.342, 0.280, 0.000)
		colorRock      (0.445, 0.372, 0.302, 0.000)
		colorSnow      (0.485, 0.397, 0.319, 1.000)
		BumpHeight      14.3384
		BumpOffset      2.86768
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.267448
		Period          1.97304
		Eccentricity    0.338123
		Inclination     25.5053
		AscendingNode   32.8458
		ArgOfPericenter 20.2114
		MeanAnomaly     -84.1177
	}
}

DwarfMoon	"Quatin D13"
{
	ParentBody     "Quatin"
	Class	       "Asteroid"

	Mass            1.53619e-009
	Radius          16.7908
	InertiaMoment   0.398328

	RotationPeriod  1000.31
	Obliquity       22.6861
	EqAscendNode    167.248
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.711 0.707 0.704)

	Surface
	{
		SurfStyle       0.821578
		OceanStyle      0.794911
		Randomize      (-0.898, 0.833, -0.289)
		colorDistMagn   0.219078
		colorDistFreq   0.218676
		detailScale     458.502
		colorConversion true
		snowLevel       2
		tropicLatitude  0.637086
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.513067
		terraceProb     0.202449
		erosion         0
		montesMagn      0.454442
		montesFreq      2.74528
		montesSpiky     0.815835
		montesFraction  0.531948
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.645022
		hillsFraction   0.717344
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.267363
		craterFreq      0.238706
		craterDensity   0.905279
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.566725
		volcanoTemp     1673.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.277, 0.240, 0.197, 0.000)
		colorShelf     (0.284, 0.247, 0.225, 0.000)
		colorBeach     (0.334, 0.290, 0.267, 0.000)
		colorDesert    (0.363, 0.311, 0.260, 0.000)
		colorLowland   (0.398, 0.332, 0.296, 0.000)
		colorUpland    (0.441, 0.403, 0.359, 0.000)
		colorRock      (0.476, 0.438, 0.387, 0.000)
		colorSnow      (0.519, 0.466, 0.408, 1.000)
		BumpHeight      15.1118
		BumpOffset      3.02235
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.267961
		Period          1.97872
		Eccentricity    0.394999
		Inclination     60.6139
		AscendingNode   161.167
		ArgOfPericenter -92.8974
		MeanAnomaly     -9.24858
	}
}

DwarfMoon	"Quatin D14"
{
	ParentBody     "Quatin"
	Class	       "Asteroid"

	Mass            2.16925e-009
	Radius          18.0702
	InertiaMoment   0.399371

	RotationPeriod  917.165
	Obliquity       -110.707
	EqAscendNode    155.336
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.537 0.532 0.525)

	Surface
	{
		SurfStyle       0.992678
		OceanStyle      0.927212
		Randomize      (0.232, -0.971, 0.982)
		colorDistMagn   0.198295
		colorDistFreq   0.130552
		detailScale     493.437
		colorConversion true
		snowLevel       2
		tropicLatitude  0.907861
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.514479
		terraceProb     0.226071
		erosion         0
		montesMagn      0.57795
		montesFreq      3.25738
		montesSpiky     0.846089
		montesFraction  0.480947
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.730023
		hillsFraction   0.787214
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248673
		craterFreq      0.194666
		craterDensity   0.87971
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.474157
		volcanoTemp     1624.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.182, 0.186, 0.210, 0.050)
		colorShelf     (0.215, 0.218, 0.241, 0.040)
		colorBeach     (0.247, 0.250, 0.273, 0.030)
		colorDesert    (0.279, 0.282, 0.310, 0.020)
		colorLowland   (0.311, 0.314, 0.341, 0.030)
		colorUpland    (0.343, 0.346, 0.373, 0.050)
		colorRock      (0.376, 0.378, 0.415, 0.020)
		colorSnow      (0.376, 0.378, 0.415, 1.000)
		BumpHeight      16.2632
		BumpOffset      3.25263
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.268347
		Period          1.983
		Eccentricity    0.49047
		Inclination     -46.7853
		AscendingNode   165.971
		ArgOfPericenter 36.6469
		MeanAnomaly     11.7873
	}
}

DwarfMoon	"Quatin D15"
{
	ParentBody     "Quatin"
	Class	       "Asteroid"

	Mass            3.03462e-009
	Radius          19.3398
	InertiaMoment   0.396739

	RotationPeriod  836.037
	Obliquity       -19.7071
	EqAscendNode    59.4206
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.405 0.402 0.400)

	Surface
	{
		SurfStyle       0.383803
		OceanStyle      0.56069
		Randomize      (0.851, 0.959, -0.737)
		colorDistMagn   0.935875
		colorDistFreq   0.129035
		detailScale     528.105
		colorConversion true
		snowLevel       2
		tropicLatitude  0.448632
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.438539
		terraceProb     0.104087
		erosion         0
		montesMagn      0.495903
		montesFreq      3.11129
		montesSpiky     0.890986
		montesFraction  0.612866
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.735515
		hillsFraction   0.561432
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233809
		craterFreq      0.258109
		craterDensity   0.761128
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.562041
		volcanoTemp     1342.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.162, 0.161, 0.160, 0.000)
		colorShelf     (0.172, 0.171, 0.170, 0.000)
		colorBeach     (0.182, 0.181, 0.180, 0.000)
		colorDesert    (0.193, 0.191, 0.190, 0.000)
		colorLowland   (0.203, 0.201, 0.200, 0.000)
		colorUpland    (0.213, 0.211, 0.210, 0.000)
		colorRock      (0.223, 0.221, 0.220, 0.000)
		colorSnow      (0.233, 0.231, 0.230, 1.000)
		BumpHeight      17.4058
		BumpOffset      3.48116
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.268808
		Period          1.98811
		Eccentricity    0.353745
		Inclination     30.2238
		AscendingNode   61.7822
		ArgOfPericenter 2.02399
		MeanAnomaly     147.735
	}
}

DwarfMoon	"Quatin D16"
{
	ParentBody     "Quatin"
	Class	       "Asteroid"

	Mass            4.21225e-009
	Radius          25.5709
	InertiaMoment   0.398499

	RotationPeriod  929.539
	Obliquity       127.496
	EqAscendNode    -171.263
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.465 0.458 0.452)

	Surface
	{
		SurfStyle       0.166377
		OceanStyle      0.953536
		Randomize      (0.485, 0.841, 0.740)
		colorDistMagn   0.140225
		colorDistFreq   0.478038
		detailScale     698.256
		colorConversion true
		snowLevel       2
		tropicLatitude  0.995886
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.601344
		terraceProb     0.195741
		erosion         0
		montesMagn      0.462579
		montesFreq      2.85196
		montesSpiky     0.983304
		montesFraction  0.724586
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.53573
		hillsFraction   0.740739
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236186
		craterFreq      0.174611
		craterDensity   0.827995
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.506793
		volcanoTemp     1550.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.186, 0.183, 0.181, 0.000)
		colorShelf     (0.197, 0.195, 0.192, 0.000)
		colorBeach     (0.209, 0.206, 0.203, 0.000)
		colorDesert    (0.221, 0.218, 0.215, 0.000)
		colorLowland   (0.232, 0.229, 0.226, 0.000)
		colorUpland    (0.244, 0.241, 0.237, 0.000)
		colorRock      (0.256, 0.252, 0.249, 0.000)
		colorSnow      (0.267, 0.263, 0.260, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.269404
		Period          1.99472
		Eccentricity    0.361155
		Inclination     43.4781
		AscendingNode   -167.179
		ArgOfPericenter -76.836
		MeanAnomaly     -107.813
	}
}

DwarfMoon	"Quatin D17"
{
	ParentBody     "Quatin"
	Class	       "Asteroid"

	Mass            5.80947e-009
	Radius          26.3387
	InertiaMoment   0.399501

	RotationPeriod  827.137
	Obliquity       -9.68065
	EqAscendNode    -97.4099
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.436 0.433 0.428)

	Surface
	{
		SurfStyle       0.867284
		OceanStyle      0.0600744
		Randomize      (0.781, 0.448, 0.324)
		colorDistMagn   0.84865
		colorDistFreq   0.316233
		detailScale     719.223
		colorConversion true
		snowLevel       2
		tropicLatitude  0.282873
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.602394
		terraceProb     0.349405
		erosion         0
		montesMagn      0.531409
		montesFreq      3.23596
		montesSpiky     0.962142
		montesFraction  0.405995
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.57561
		hillsFraction   0.473234
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221657
		craterFreq      0.226122
		craterDensity   1.00998
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.506557
		volcanoTemp     1387.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.148, 0.151, 0.171, 0.050)
		colorShelf     (0.174, 0.177, 0.197, 0.040)
		colorBeach     (0.201, 0.203, 0.223, 0.030)
		colorDesert    (0.227, 0.229, 0.253, 0.020)
		colorLowland   (0.253, 0.255, 0.278, 0.030)
		colorUpland    (0.279, 0.281, 0.304, 0.050)
		colorRock      (0.305, 0.307, 0.338, 0.020)
		colorSnow      (0.305, 0.307, 0.338, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.269718
		Period          1.99821
		Eccentricity    0.244165
		Inclination     12.2641
		AscendingNode   -96.6017
		ArgOfPericenter 22.7634
		MeanAnomaly     -141.343
	}
}

DwarfMoon	"Quatin D18"
{
	ParentBody     "Quatin"
	Class	       "Asteroid"

	Mass            7.97074e-009
	Radius          28.0411
	InertiaMoment   0.397141

	RotationPeriod  756.405
	Obliquity       -17.1854
	EqAscendNode    103.276
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.448 0.442 0.437)

	Surface
	{
		SurfStyle       0.932105
		OceanStyle      0.959011
		Randomize      (0.474, 0.558, -0.775)
		colorDistMagn   0.776446
		colorDistFreq   0.392959
		detailScale     765.709
		colorConversion true
		snowLevel       2
		tropicLatitude  0.746013
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.757187
		terraceProb     0.426051
		erosion         0
		montesMagn      0.312554
		montesFreq      3.77527
		montesSpiky     0.84545
		montesFraction  0.536287
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.64893
		hillsFraction   0.547884
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229964
		craterFreq      0.18997
		craterDensity   0.854757
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.493405
		volcanoTemp     1716.09
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.152, 0.155, 0.175, 0.050)
		colorShelf     (0.179, 0.181, 0.201, 0.040)
		colorBeach     (0.206, 0.208, 0.227, 0.030)
		colorDesert    (0.233, 0.234, 0.258, 0.020)
		colorLowland   (0.260, 0.261, 0.284, 0.030)
		colorUpland    (0.287, 0.287, 0.310, 0.050)
		colorRock      (0.314, 0.314, 0.345, 0.020)
		colorSnow      (0.314, 0.314, 0.345, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.270125
		Period          2.00274
		Eccentricity    0.453632
		Inclination     -49.2216
		AscendingNode   100.808
		ArgOfPericenter -45.2
		MeanAnomaly     178.165
	}
}

DwarfMoon	"Quatin D19"
{
	ParentBody     "Quatin"
	Class	       "Asteroid"

	Mass            1.08912e-008
	Radius          29.8291
	InertiaMoment   0.39866

	RotationPeriod  695.049
	Obliquity       -29.1671
	EqAscendNode    -13.5382
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.552 0.546 0.539)

	Surface
	{
		SurfStyle       0.369028
		OceanStyle      0.979617
		Randomize      (0.559, -0.563, -0.259)
		colorDistMagn   0.355677
		colorDistFreq   0.298681
		detailScale     814.533
		colorConversion true
		snowLevel       2
		tropicLatitude  0.414076
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.297386
		terraceProb     0.142867
		erosion         0
		montesMagn      0.561765
		montesFreq      3.27054
		montesSpiky     0.865184
		montesFraction  0.636742
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.73459
		hillsFraction   0.658837
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240952
		craterFreq      0.201857
		craterDensity   0.883491
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.456744
		volcanoTemp     1277.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.221, 0.219, 0.215, 0.000)
		colorShelf     (0.235, 0.232, 0.229, 0.000)
		colorBeach     (0.248, 0.246, 0.242, 0.000)
		colorDesert    (0.262, 0.260, 0.256, 0.000)
		colorLowland   (0.276, 0.273, 0.269, 0.000)
		colorUpland    (0.290, 0.287, 0.283, 0.000)
		colorRock      (0.304, 0.301, 0.296, 0.000)
		colorSnow      (0.318, 0.314, 0.310, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.270469
		Period          2.00656
		Eccentricity    0.18031
		Inclination     4.7797
		AscendingNode   -9.28497
		ArgOfPericenter 45.5494
		MeanAnomaly     179.309
	}
}

DwarfMoon	"Quatin D20"
{
	ParentBody     "Quatin"
	Class	       "Asteroid"

	Mass            1.48356e-008
	Radius          39.9843
	InertiaMoment   0.399629

	RotationPeriod  790.045
	Obliquity       -53.1466
	EqAscendNode    -140.93
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.585 0.580 0.573)

	Surface
	{
		SurfStyle       0.440242
		OceanStyle      0.304063
		Randomize      (-0.438, 0.310, -0.469)
		colorDistMagn   0.968579
		colorDistFreq   0.450201
		detailScale     1091.84
		colorConversion true
		snowLevel       2
		tropicLatitude  0.584459
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.687435
		terraceProb     0.375162
		erosion         0
		montesMagn      0.564147
		montesFreq      3.31304
		montesSpiky     0.924691
		montesFraction  0.371169
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.7116
		hillsFraction   0.716557
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.203344
		craterFreq      0.216677
		craterDensity   0.831921
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.4841
		volcanoTemp     1703.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.234, 0.232, 0.229, 0.000)
		colorShelf     (0.249, 0.247, 0.244, 0.000)
		colorBeach     (0.263, 0.261, 0.258, 0.000)
		colorDesert    (0.278, 0.276, 0.272, 0.000)
		colorLowland   (0.293, 0.290, 0.287, 0.000)
		colorUpland    (0.307, 0.305, 0.301, 0.000)
		colorRock      (0.322, 0.319, 0.315, 0.000)
		colorSnow      (0.336, 0.334, 0.330, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.270857
		Period          2.01088
		Eccentricity    0.0316118
		Inclination     -33.1947
		AscendingNode   -134.955
		ArgOfPericenter 127.1
		MeanAnomaly     70.8457
	}
}

DwarfMoon	"Quatin D21"
{
	ParentBody     "Quatin"
	Class	       "Asteroid"

	Mass            2.01647e-008
	Radius          40.1705
	InertiaMoment   0.397452

	RotationPeriod  687.752
	Obliquity       27.1265
	EqAscendNode    -145.32
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.717 0.643 0.575)

	Surface
	{
		SurfStyle       0.769468
		OceanStyle      0.451999
		Randomize      (-0.692, 0.840, 0.052)
		colorDistMagn   0.403781
		colorDistFreq   0.388565
		detailScale     1096.92
		colorConversion true
		snowLevel       2
		tropicLatitude  0.368663
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.661381
		terraceProb     0.317837
		erosion         0
		montesMagn      0.603949
		montesFreq      2.47825
		montesSpiky     0.964114
		montesFraction  0.517975
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.22792
		hillsFraction   0.764832
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243723
		craterFreq      0.184553
		craterDensity   0.833134
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.514329
		volcanoTemp     1089.53
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.280, 0.219, 0.161, 0.000)
		colorShelf     (0.287, 0.225, 0.184, 0.000)
		colorBeach     (0.337, 0.264, 0.219, 0.000)
		colorDesert    (0.366, 0.283, 0.213, 0.000)
		colorLowland   (0.402, 0.302, 0.242, 0.000)
		colorUpland    (0.445, 0.366, 0.293, 0.000)
		colorRock      (0.480, 0.399, 0.316, 0.000)
		colorSnow      (0.523, 0.424, 0.334, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.271336
		Period          2.01622
		Eccentricity    0.364612
		Inclination     33.085
		AscendingNode   -137.622
		ArgOfPericenter -76.6315
		MeanAnomaly     -53.2296
	}
}

DwarfMoon	"Quatin D22"
{
	ParentBody     "Quatin"
	Class	       "Asteroid"

	Mass            2.73732e-008
	Radius          42.545
	InertiaMoment   0.398812

	RotationPeriod  630.769
	Obliquity       49.7415
	EqAscendNode    96.4145
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.705 0.641 0.589)

	Surface
	{
		SurfStyle       0.204051
		OceanStyle      0.104099
		Randomize      (0.860, 0.099, 0.864)
		colorDistMagn   0.818833
		colorDistFreq   0.809896
		detailScale     1161.76
		colorConversion true
		snowLevel       2
		tropicLatitude  0.816092
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.408072
		terraceProb     0.167462
		erosion         0
		montesMagn      0.353043
		montesFreq      2.11785
		montesSpiky     0.994352
		montesFraction  0.499541
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.87914
		hillsFraction   0.412207
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261729
		craterFreq      0.242098
		craterDensity   0.941547
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.480979
		volcanoTemp     1449.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.282, 0.256, 0.236, 0.000)
		colorShelf     (0.299, 0.272, 0.250, 0.000)
		colorBeach     (0.317, 0.288, 0.265, 0.000)
		colorDesert    (0.335, 0.305, 0.280, 0.000)
		colorLowland   (0.352, 0.321, 0.294, 0.000)
		colorUpland    (0.370, 0.337, 0.309, 0.000)
		colorRock      (0.387, 0.353, 0.324, 0.000)
		colorSnow      (0.405, 0.369, 0.339, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.271874
		Period          2.02222
		Eccentricity    0.275309
		Inclination     41.7055
		AscendingNode   100.837
		ArgOfPericenter -91.3835
		MeanAnomaly     73.8919
	}
}

DwarfMoon	"Quatin D23"
{
	ParentBody     "Quatin"
	Class	       "Asteroid"

	Mass            3.71434e-008
	Radius          45.2042
	InertiaMoment   0.399755

	RotationPeriod  579.663
	Obliquity       54.0639
	EqAscendNode    17.3334
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.667 0.662 0.659)

	Surface
	{
		SurfStyle       0.691418
		OceanStyle      0.900386
		Randomize      (0.947, 0.686, 0.026)
		colorDistMagn   0.446298
		colorDistFreq   0.827582
		detailScale     1234.38
		colorConversion true
		snowLevel       2
		tropicLatitude  0.850938
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.497209
		terraceProb     0.122042
		erosion         0
		montesMagn      0.647924
		montesFreq      2.49366
		montesSpiky     0.987199
		montesFraction  0.502086
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.63082
		hillsFraction   0.596125
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225832
		craterFreq      0.213467
		craterDensity   0.86136
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.421032
		volcanoTemp     1519.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.260, 0.225, 0.184, 0.000)
		colorShelf     (0.267, 0.232, 0.211, 0.000)
		colorBeach     (0.313, 0.271, 0.250, 0.000)
		colorDesert    (0.340, 0.291, 0.244, 0.000)
		colorLowland   (0.373, 0.311, 0.277, 0.000)
		colorUpland    (0.413, 0.377, 0.336, 0.000)
		colorRock      (0.447, 0.410, 0.362, 0.000)
		colorSnow      (0.487, 0.437, 0.382, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.27221
		Period          2.02597
		Eccentricity    0.244129
		Inclination     72.0241
		AscendingNode   23.4786
		ArgOfPericenter 118.465
		MeanAnomaly     -58.0877
	}
}

DwarfMoon	"Quatin D24"
{
	ParentBody     "Quatin"
	Class	       "Asteroid"

	Mass            5.04238e-008
	Radius          64.184
	InertiaMoment   0.397712

	RotationPeriod  694.918
	Obliquity       61.3679
	EqAscendNode    -156.687
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.594 0.461 0.400)

	Surface
	{
		SurfStyle       0.588383
		OceanStyle      0.214471
		Randomize      (0.625, 0.852, 0.085)
		colorDistMagn   0.557663
		colorDistFreq   3.12659
		detailScale     1752.65
		colorConversion true
		snowLevel       2
		tropicLatitude  0.258561
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.69329
		terraceProb     0.372233
		erosion         0
		montesMagn      0.54941
		montesFreq      2.44413
		montesSpiky     0.914641
		montesFraction  0.5996
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.42943
		hillsFraction   0.635618
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23513
		craterFreq      0.211295
		craterDensity   0.712453
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51591
		volcanoTemp     1418.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.232, 0.157, 0.112, 0.000)
		colorShelf     (0.238, 0.161, 0.128, 0.000)
		colorBeach     (0.279, 0.189, 0.152, 0.000)
		colorDesert    (0.303, 0.203, 0.148, 0.000)
		colorLowland   (0.333, 0.217, 0.168, 0.000)
		colorUpland    (0.368, 0.263, 0.204, 0.000)
		colorRock      (0.398, 0.286, 0.220, 0.000)
		colorSnow      (0.434, 0.304, 0.232, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.272539
		Period          2.02964
		Eccentricity    0.43769
		Inclination     65.3329
		AscendingNode   -163.815
		ArgOfPericenter 153.41
		MeanAnomaly     36.0051
	}
}

DwarfMoon	"Quatin D25"
{
	ParentBody     "Quatin"
	Class	       "Asteroid"

	Mass            6.85431e-008
	Radius          60.877
	InertiaMoment   0.398958

	RotationPeriod  574.643
	Obliquity       136.794
	EqAscendNode    73.461
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.715 0.713 0.712)

	Surface
	{
		SurfStyle       0.129149
		OceanStyle      0.774033
		Randomize      (0.219, -0.779, 0.171)
		colorDistMagn   0.00070405
		colorDistFreq   2.70255
		detailScale     1662.35
		colorConversion true
		snowLevel       2
		tropicLatitude  0.9832
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.420272
		terraceProb     0.343689
		erosion         0
		montesMagn      0.465051
		montesFreq      2.24182
		montesSpiky     0.844703
		montesFraction  0.683744
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.34592
		hillsFraction   0.645726
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253336
		craterFreq      0.24514
		craterDensity   0.940254
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.487388
		volcanoTemp     1590.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.286, 0.285, 0.285, 0.000)
		colorShelf     (0.304, 0.303, 0.303, 0.000)
		colorBeach     (0.322, 0.321, 0.321, 0.000)
		colorDesert    (0.340, 0.339, 0.338, 0.000)
		colorLowland   (0.358, 0.357, 0.356, 0.000)
		colorUpland    (0.376, 0.374, 0.374, 0.000)
		colorRock      (0.393, 0.392, 0.392, 0.000)
		colorSnow      (0.411, 0.410, 0.410, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.273187
		Period          2.03689
		Eccentricity    0.166801
		Inclination     86.773
		AscendingNode   78.0526
		ArgOfPericenter 14.8408
		MeanAnomaly     -148.107
	}
}

DwarfMoon	"Quatin D26"
{
	ParentBody     "Quatin"
	Class	       "Asteroid"

	Mass            9.33802e-008
	Radius          64.4115
	InertiaMoment   0.399881

	RotationPeriod  524.731
	Obliquity       -7.47617
	EqAscendNode    47.9688
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.692 0.568 0.526)

	Surface
	{
		SurfStyle       0.70965
		OceanStyle      0.647906
		Randomize      (-0.999, -0.684, -0.526)
		colorDistMagn   0.543378
		colorDistFreq   1.84656
		detailScale     1758.86
		colorConversion true
		snowLevel       2
		tropicLatitude  0.604366
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.354468
		terraceProb     0.416979
		erosion         0
		montesMagn      0.618648
		montesFreq      1.94555
		montesSpiky     0.999157
		montesFraction  0.274991
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.35219
		hillsFraction   0.683907
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239947
		craterFreq      0.221223
		craterDensity   0.831086
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.519381
		volcanoTemp     1664.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.270, 0.193, 0.147, 0.000)
		colorShelf     (0.277, 0.199, 0.168, 0.000)
		colorBeach     (0.325, 0.233, 0.200, 0.000)
		colorDesert    (0.353, 0.250, 0.195, 0.000)
		colorLowland   (0.387, 0.267, 0.221, 0.000)
		colorUpland    (0.429, 0.324, 0.268, 0.000)
		colorRock      (0.464, 0.352, 0.289, 0.000)
		colorSnow      (0.505, 0.375, 0.305, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.273782
		Period          2.04355
		Eccentricity    0.000727651
		Inclination     -31.5016
		AscendingNode   44.2851
		ArgOfPericenter -26.4496
		MeanAnomaly     73.4263
	}
}

DwarfMoon	"Quatin D27"
{
	ParentBody     "Quatin"
	Class	       "Asteroid"

	Mass            1.2762e-007
	Radius          68.6458
	InertiaMoment   0.397937

	RotationPeriod  479.809
	Obliquity       -87.8749
	EqAscendNode    88.5454
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.680 0.678 0.675)

	Surface
	{
		SurfStyle       0.348294
		OceanStyle      0.671842
		Randomize      (-0.539, -0.461, -0.625)
		colorDistMagn   0.358928
		colorDistFreq   3.91498
		detailScale     1874.49
		colorConversion true
		snowLevel       2
		tropicLatitude  0.985461
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.647517
		terraceProb     0.233742
		erosion         0
		montesMagn      0.30629
		montesFreq      3.59925
		montesSpiky     0.977122
		montesFraction  0.492731
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.7282
		hillsFraction   0.682702
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259941
		craterFreq      0.175727
		craterDensity   0.922215
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.493696
		volcanoTemp     1892.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.272, 0.271, 0.270, 0.000)
		colorShelf     (0.289, 0.288, 0.287, 0.000)
		colorBeach     (0.306, 0.305, 0.304, 0.000)
		colorDesert    (0.323, 0.322, 0.320, 0.000)
		colorLowland   (0.340, 0.339, 0.337, 0.000)
		colorUpland    (0.357, 0.356, 0.354, 0.000)
		colorRock      (0.374, 0.373, 0.371, 0.000)
		colorSnow      (0.391, 0.390, 0.388, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.274274
		Period          2.04905
		Eccentricity    0.0376948
		Inclination     -45.91
		AscendingNode   101.582
		ArgOfPericenter -169.244
		MeanAnomaly     -87.3394
	}
}

DwarfMoon	"Quatin D28"
{
	ParentBody     "Quatin"
	Class	       "Asteroid"

	Mass            1.75142e-007
	Radius          71.022
	InertiaMoment   0.399099

	RotationPeriod  427.036
	Obliquity       56.238
	EqAscendNode    -23.7322
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.630 0.626 0.623)

	Surface
	{
		SurfStyle       0.138301
		OceanStyle      0.447929
		Randomize      (0.974, 0.700, 0.380)
		colorDistMagn   0.527265
		colorDistFreq   2.30898
		detailScale     1939.37
		colorConversion true
		snowLevel       2
		tropicLatitude  0.866981
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.428935
		terraceProb     0.577351
		erosion         0
		montesMagn      0.512387
		montesFreq      3.29611
		montesSpiky     0.925849
		montesFraction  0.406347
		dunesFraction   0
		hillsMagn       0
		hillsFreq       10.6426
		hillsFraction   0.833537
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263908
		craterFreq      0.173932
		craterDensity   0.860258
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.464275
		volcanoTemp     2202.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.252, 0.250, 0.249, 0.000)
		colorShelf     (0.268, 0.266, 0.265, 0.000)
		colorBeach     (0.283, 0.282, 0.280, 0.000)
		colorDesert    (0.299, 0.297, 0.296, 0.000)
		colorLowland   (0.315, 0.313, 0.311, 0.000)
		colorUpland    (0.331, 0.329, 0.327, 0.000)
		colorRock      (0.346, 0.344, 0.342, 0.000)
		colorSnow      (0.362, 0.360, 0.358, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.27457
		Period          2.05237
		Eccentricity    0.331647
		Inclination     4.21979
		AscendingNode   -23.9705
		ArgOfPericenter 91.6124
		MeanAnomaly     52.4353
	}
}

DwarfMoon	"Quatin D29"
{
	ParentBody     "Quatin"
	Class	       "Asteroid"

	Mass            2.41629e-007
	Radius          93.4583
	InertiaMoment   0.393898

	RotationPeriod  472.838
	Obliquity       -130.402
	EqAscendNode    -152.991
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.751 0.666 0.623)

	Surface
	{
		SurfStyle       0.834045
		OceanStyle      0.148437
		Randomize      (-0.986, 0.069, 0.528)
		colorDistMagn   0.134678
		colorDistFreq   6.28927
		detailScale     2552.04
		colorConversion true
		snowLevel       2
		tropicLatitude  0.885137
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.557151
		terraceProb     0.279874
		erosion         0
		montesMagn      0.559732
		montesFreq      3.92236
		montesSpiky     0.91386
		montesFraction  0.452653
		dunesFraction   0
		hillsMagn       0
		hillsFreq       18.3976
		hillsFraction   0.563609
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247902
		craterFreq      0.324268
		craterDensity   0.836127
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.441563
		volcanoTemp     1628.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.293, 0.227, 0.175, 0.000)
		colorShelf     (0.300, 0.233, 0.200, 0.000)
		colorBeach     (0.353, 0.273, 0.237, 0.000)
		colorDesert    (0.383, 0.293, 0.231, 0.000)
		colorLowland   (0.421, 0.313, 0.262, 0.000)
		colorUpland    (0.466, 0.380, 0.318, 0.000)
		colorRock      (0.503, 0.413, 0.343, 0.000)
		colorSnow      (0.548, 0.440, 0.362, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.275156
		Period          2.05895
		Eccentricity    0.475257
		Inclination     -76.435
		AscendingNode   -146.507
		ArgOfPericenter 11.2282
		MeanAnomaly     31.4517
	}
}

DwarfMoon	"Quatin D30"
{
	ParentBody     "Quatin"
	Class	       "Asteroid"

	Mass            3.35527e-007
	Radius          99.229
	InertiaMoment   0.398139

	RotationPeriod  430.475
	Obliquity       -51.0059
	EqAscendNode    -35.7013
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.735 0.635 0.599)

	Surface
	{
		SurfStyle       0.124149
		OceanStyle      0.820187
		Randomize      (0.843, -0.828, 0.049)
		colorDistMagn   0.80263
		colorDistFreq   5.10635
		detailScale     2709.61
		colorConversion true
		snowLevel       2
		tropicLatitude  0.990117
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.629631
		terraceProb     0.484774
		erosion         0
		montesMagn      0.377558
		montesFreq      4.26643
		montesSpiky     0.990158
		montesFraction  0.945646
		dunesFraction   0
		hillsMagn       0
		hillsFreq       14.6786
		hillsFraction   0.781776
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.284502
		craterFreq      0.416193
		craterDensity   0.896586
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.526225
		volcanoTemp     1536.95
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.294, 0.254, 0.240, 0.000)
		colorShelf     (0.312, 0.270, 0.255, 0.000)
		colorBeach     (0.331, 0.286, 0.270, 0.000)
		colorDesert    (0.349, 0.302, 0.285, 0.000)
		colorLowland   (0.368, 0.318, 0.299, 0.000)
		colorUpland    (0.386, 0.333, 0.314, 0.000)
		colorRock      (0.404, 0.349, 0.329, 0.000)
		colorSnow      (0.423, 0.365, 0.344, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.275441
		Period          2.06215
		Eccentricity    0.339179
		Inclination     -51.028
		AscendingNode   -27.4949
		ArgOfPericenter 73.1808
		MeanAnomaly     151.851
	}
}

DwarfMoon	"Quatin D31"
{
	ParentBody     "Quatin"
	Class	       "Asteroid"

	Mass            4.69595e-007
	Radius          106.622
	InertiaMoment   0.399235

	RotationPeriod  393.26
	Obliquity       15.1478
	EqAscendNode    139.729
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.686 0.683 0.680)

	Surface
	{
		SurfStyle       0.749685
		OceanStyle      0.89671
		Randomize      (0.896, 0.259, 0.636)
		colorDistMagn   0.245422
		colorDistFreq   5.89587
		detailScale     2911.48
		colorConversion true
		snowLevel       2
		tropicLatitude  0.245039
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.46961
		terraceProb     0.155188
		erosion         0
		montesMagn      0.539402
		montesFreq      3.35338
		montesSpiky     0.93238
		montesFraction  0.540112
		dunesFraction   0
		hillsMagn       0
		hillsFreq       21.7994
		hillsFraction   0.715286
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264555
		craterFreq      0.43522
		craterDensity   0.60222
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.477027
		volcanoTemp     1592.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.268, 0.232, 0.190, 0.000)
		colorShelf     (0.274, 0.239, 0.218, 0.000)
		colorBeach     (0.322, 0.280, 0.259, 0.000)
		colorDesert    (0.350, 0.300, 0.252, 0.000)
		colorLowland   (0.384, 0.321, 0.286, 0.000)
		colorUpland    (0.425, 0.389, 0.347, 0.000)
		colorRock      (0.460, 0.423, 0.374, 0.000)
		colorSnow      (0.501, 0.451, 0.395, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.275961
		Period          2.06798
		Eccentricity    0.467562
		Inclination     1.1296
		AscendingNode   149.658
		ArgOfPericenter -99.4671
		MeanAnomaly     -10.7074
	}
}

DwarfMoon	"Quatin D32"
{
	ParentBody     "Quatin"
	Class	       "Asteroid"

	Mass            6.63488e-007
	Radius          112.946
	InertiaMoment   0.396116

	RotationPeriod  350.844
	Obliquity       -88.0434
	EqAscendNode    -39.1599
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.702 0.601 0.467)

	Surface
	{
		SurfStyle       0.245525
		OceanStyle      0.172166
		Randomize      (-0.228, -0.894, 0.137)
		colorDistMagn   0.370506
		colorDistFreq   7.63593
		detailScale     3084.18
		colorConversion true
		snowLevel       2
		tropicLatitude  0.707348
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.52573
		terraceProb     0.238231
		erosion         0
		montesMagn      0.619971
		montesFreq      3.11626
		montesSpiky     0.992697
		montesFraction  0.571924
		dunesFraction   0
		hillsMagn       0
		hillsFreq       18.1356
		hillsFraction   0.552926
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.278672
		craterFreq      0.493081
		craterDensity   0.843652
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.570879
		volcanoTemp     1380.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.281, 0.240, 0.187, 0.000)
		colorShelf     (0.299, 0.255, 0.199, 0.000)
		colorBeach     (0.316, 0.271, 0.210, 0.000)
		colorDesert    (0.334, 0.286, 0.222, 0.000)
		colorLowland   (0.351, 0.301, 0.234, 0.000)
		colorUpland    (0.369, 0.316, 0.245, 0.000)
		colorRock      (0.386, 0.331, 0.257, 0.000)
		colorSnow      (0.404, 0.346, 0.269, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.276491
		Period          2.07394
		Eccentricity    0.129805
		Inclination     -76.0629
		AscendingNode   -42.5058
		ArgOfPericenter -120.653
		MeanAnomaly     -14.4683
	}
}

DwarfMoon	"Quatin D33"
{
	ParentBody     "Quatin"
	Class	       "Asteroid"

	Mass            9.48133e-007
	Radius          148.857
	InertiaMoment   0.398324

	RotationPeriod  386.369
	Obliquity       41.0262
	EqAscendNode    -83.4816
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.734 0.683 0.666)

	Surface
	{
		SurfStyle       0.372359
		OceanStyle      0.564299
		Randomize      (-0.729, -0.259, 0.919)
		colorDistMagn   0.826784
		colorDistFreq   11.4619
		detailScale     4064.79
		colorConversion true
		snowLevel       2
		tropicLatitude  0.834543
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.590556
		terraceProb     0.214544
		erosion         0
		montesMagn      0.543179
		montesFreq      2.81654
		montesSpiky     0.934611
		montesFraction  0.620474
		dunesFraction   0
		hillsMagn       0
		hillsFreq       45.4429
		hillsFraction   0.656832
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.27503
		craterFreq      0.74571
		craterDensity   0.946115
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.508796
		volcanoTemp     2047.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.293, 0.273, 0.266, 0.000)
		colorShelf     (0.312, 0.290, 0.283, 0.000)
		colorBeach     (0.330, 0.307, 0.299, 0.000)
		colorDesert    (0.348, 0.324, 0.316, 0.000)
		colorLowland   (0.367, 0.342, 0.333, 0.000)
		colorUpland    (0.385, 0.359, 0.349, 0.000)
		colorRock      (0.403, 0.376, 0.366, 0.000)
		colorSnow      (0.422, 0.393, 0.383, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.277138
		Period          2.08124
		Eccentricity    0.0285645
		Inclination     39.0103
		AscendingNode   -85.1048
		ArgOfPericenter 14.7034
		MeanAnomaly     3.49825
	}
}

DwarfMoon	"Quatin D34"
{
	ParentBody     "Quatin"
	Class	       "Asteroid"

	Mass            1.37343e-006
	Radius          159.68
	InertiaMoment   0.399368

	RotationPeriod  346.432
	Obliquity       -67.7293
	EqAscendNode    99.8737
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.614 0.552 0.490)

	Surface
	{
		SurfStyle       0.978024
		OceanStyle      0.943275
		Randomize      (0.824, -0.533, -0.282)
		colorDistMagn   0.682758
		colorDistFreq   9.19051
		detailScale     4360.34
		colorConversion true
		snowLevel       2
		tropicLatitude  0.961873
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.587154
		terraceProb     0.633953
		erosion         0
		montesMagn      0.456343
		montesFreq      3.98426
		montesSpiky     0.996412
		montesFraction  0.787825
		dunesFraction   0
		hillsMagn       0
		hillsFreq       73.4232
		hillsFraction   0.674468
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217578
		craterFreq      0.898675
		craterDensity   1.01074
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.473847
		volcanoTemp     1438.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.209, 0.193, 0.196, 0.050)
		colorShelf     (0.246, 0.226, 0.225, 0.040)
		colorBeach     (0.283, 0.259, 0.255, 0.030)
		colorDesert    (0.319, 0.293, 0.289, 0.020)
		colorLowland   (0.356, 0.326, 0.318, 0.030)
		colorUpland    (0.393, 0.359, 0.348, 0.050)
		colorRock      (0.430, 0.392, 0.387, 0.020)
		colorSnow      (0.430, 0.392, 0.387, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.27775
		Period          2.08813
		Eccentricity    0.164013
		Inclination     -43.7461
		AscendingNode   89.9745
		ArgOfPericenter -20.7881
		MeanAnomaly     -115.126
	}
}

DwarfMoon	"Quatin D35"
{
	ParentBody     "Quatin"
	Class	       "Asteroid"

	Mass            2.02228e-006
	Radius          174.486
	InertiaMoment   0.396729

	RotationPeriod  312.159
	Obliquity       29.5841
	EqAscendNode    68.6448
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.793 0.792 0.790)

	Surface
	{
		SurfStyle       0.610724
		OceanStyle      0.251479
		Randomize      (0.218, -0.036, -0.400)
		colorDistMagn   0.473985
		colorDistFreq   18.6256
		detailScale     4764.62
		colorConversion true
		snowLevel       2
		tropicLatitude  0.806362
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.364396
		terraceProb     0.236918
		erosion         0
		montesMagn      0.459665
		montesFreq      2.46501
		montesSpiky     0.898905
		montesFraction  0.731074
		dunesFraction   0
		hillsMagn       0
		hillsFreq       75.527
		hillsFraction   0.703116
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262878
		craterFreq      0.869038
		craterDensity   0.932467
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.575333
		volcanoTemp     1675.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.309, 0.269, 0.221, 0.000)
		colorShelf     (0.317, 0.277, 0.253, 0.000)
		colorBeach     (0.373, 0.325, 0.300, 0.000)
		colorDesert    (0.405, 0.348, 0.292, 0.000)
		colorLowland   (0.444, 0.372, 0.332, 0.000)
		colorUpland    (0.492, 0.451, 0.403, 0.000)
		colorRock      (0.532, 0.491, 0.435, 0.000)
		colorSnow      (0.579, 0.523, 0.458, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.278003
		Period          2.09098
		Eccentricity    0.354348
		Inclination     39.571
		AscendingNode   75.4668
		ArgOfPericenter -5.96905
		MeanAnomaly     -149.827
	}
}

DwarfMoon	"Quatin D36"
{
	ParentBody     "Quatin"
	Class	       "Asteroid"

	Mass            3.03713e-006
	Radius          189.909
	InertiaMoment   0.398495

	RotationPeriod  278.907
	Obliquity       84.2782
	EqAscendNode    -26.9264
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.528 0.433 0.317)

	Surface
	{
		SurfStyle       0.74982
		OceanStyle      0.533996
		Randomize      (0.791, -0.990, -0.292)
		colorDistMagn   0.694285
		colorDistFreq   25.6099
		detailScale     5185.79
		colorConversion true
		snowLevel       2
		tropicLatitude  0.468773
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.643113
		terraceProb     0.10251
		erosion         0
		montesMagn      0.354902
		montesFreq      2.95086
		montesSpiky     0.900775
		montesFraction  0.555002
		dunesFraction   0
		hillsMagn       0
		hillsFreq       55.5954
		hillsFraction   0.682339
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232614
		craterFreq      1.32052
		craterDensity   0.941434
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.470246
		volcanoTemp     1182.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.206, 0.147, 0.089, 0.000)
		colorShelf     (0.211, 0.152, 0.102, 0.000)
		colorBeach     (0.248, 0.178, 0.121, 0.000)
		colorDesert    (0.269, 0.191, 0.117, 0.000)
		colorLowland   (0.296, 0.204, 0.133, 0.000)
		colorUpland    (0.327, 0.247, 0.162, 0.000)
		colorRock      (0.354, 0.269, 0.175, 0.000)
		colorSnow      (0.386, 0.286, 0.184, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.278223
		Period          2.09347
		Eccentricity    0.412546
		Inclination     80.2684
		AscendingNode   -23.381
		ArgOfPericenter 22.3819
		MeanAnomaly     21.315
	}
}

// http://starwars.wikia.com/wiki/Hota
Planet	"Hota/Bright Jewel System 6"
{
	ParentBody     "Bright Jewel System"
	Class	       "IceGiant"

	Mass            12.4461
	Radius          20037.7
	InertiaMoment   0.186057

	Oblateness      0.027709

	RotationPeriod  10.2424
	Obliquity       18.4283
	EqAscendNode    -150.718
	//Precession      0

	AlbedoBond      0.499761
	AlbedoGeom      0.599714
	Brightness      2

	Surface
	{
		SurfStyle       0.127232
		Randomize      (0.615, 0.684, 0.050)
		detailScale     51538
		colorConversion true
		tropicLatitude  0.327086
		icecapLatitude  1
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0.869336
		stripeZones     7.46844
		stripeFluct     0.449891
		stripeTwist     10.4777
		cycloneMagn     9.09877
		cycloneFreq     0.895563
		cycloneDensity  0.502792
		cycloneOctaves  0
		colorLayer0    (0.810, 0.810, 0.810, 1.000)
		colorLayer1    (0.630, 0.650, 0.650, 1.000)
		colorLayer2    (0.580, 0.560, 0.580, 1.000)
		colorLayer3    (0.610, 0.610, 0.630, 1.000)
		colorLayer4    (0.720, 0.720, 0.720, 1.000)
		colorLayer5    (0.780, 0.780, 0.780, 1.000)
		colorLayer6    (0.540, 0.540, 0.560, 1.000)
		colorLayer7    (0.690, 0.660, 0.620, 1.000)
		colorLowPlants (0.720, 0.720, 0.720, 1.000)
		colorUpPlants  (0.780, 0.780, 0.780, 1.000)
		BumpHeight      17.8101
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          54.3242
		Velocity        1515.94
		BumpHeight      36.5133
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.03994
		mainOctaves     12
		Coverage        0.498806
		stripeZones     7.46844
		stripeFluct     0.449891
		stripeTwist     10.4777
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          200.377
		Density         570.285
		Pressure        102472
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0486246
		Saturation      0.944177

		Composition
		{
			H2    	89.6077
			He    	9.95643
			CH4   	0.341295
			N2    	0.0457401
			NH3   	0.0299377
			O2    	0.00944242
			C2H2  	0.00407816
			C2H4  	0.00152781
			Ne    	0.00147865
			Ar    	0.00114737
			C2H6  	0.000840849
			C3H8  	0.000406319
		}
	}

	Aurora
	{
		Height      295.586
		NorthLat    59.9647
		NorthLon    12.5649
		NorthRadius 4794.86
		NorthWidth  1483.29
		NorthRings  2
		NorthBright 1
		NorthParticles 10000
		SouthLat    -81.6706
		SouthLon    177.677
		SouthRadius 4476.35
		SouthWidth  967.748
		SouthRings  5
		SouthBright 1
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	Rings
	{
		InnerRadius     29429.2
		OuterRadius     72166.8
		RotationPeriod  8.99158
		RotationOffset  0
		FrontBright     0.768427
		BackBright      0.580862
		Density         0.85792
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   38.6635
		Eccentricity    0.053371
		Inclination     -0.742112
		AscendingNode   -152.933
		ArgOfPericenter 80.1941
		MeanAnomaly     194.052
	}
}

DwarfMoon	"Hota D1"
{
	ParentBody     "Hota"
	Class	       "Asteroid"

	Mass            3.94961e-010
	Radius          11.3048
	InertiaMoment   0.398789

	Oblateness      0.249

	Obliquity       0.00067101
	EqAscendNode    -26.7803
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.588 0.584 0.581)

	Surface
	{
		SurfStyle       0.84261
		OceanStyle      0.310588
		Randomize      (-0.829, 0.476, -0.916)
		colorDistMagn   0.521237
		colorDistFreq   0.0860774
		detailScale     308.696
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.357491
		terraceProb     0.426594
		erosion         0
		montesMagn      0.446489
		montesFreq      2.62663
		montesSpiky     0.970561
		montesFraction  0.30029
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.231134
		hillsFraction   0.637654
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246668
		craterFreq      0.246827
		craterDensity   0.954463
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.545862
		volcanoTemp     1516.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.229, 0.199, 0.163, 0.000)
		colorShelf     (0.235, 0.204, 0.186, 0.000)
		colorBeach     (0.276, 0.240, 0.221, 0.000)
		colorDesert    (0.300, 0.257, 0.215, 0.000)
		colorLowland   (0.329, 0.275, 0.244, 0.000)
		colorUpland    (0.365, 0.333, 0.296, 0.000)
		colorRock      (0.394, 0.362, 0.320, 0.000)
		colorSnow      (0.429, 0.386, 0.337, 1.000)
		BumpHeight      10.1743
		BumpOffset      2.03486
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000321228
		Period          0.000943804
		Eccentricity    1.87473e-005
		Inclination     0.00067101
		AscendingNode   -26.7803
		ArgOfPericenter -125.197
		MeanAnomaly     -148.459
	}
}

DwarfMoon	"Hota D2"
{
	ParentBody     "Hota"
	Class	       "Asteroid"

	Mass            5.87737e-010
	Radius          6.71408
	InertiaMoment   0.399735

	Oblateness      0.060293

	Obliquity       -0.000757682
	EqAscendNode    149.445
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.443 0.438 0.431)

	Surface
	{
		SurfStyle       0.84394
		OceanStyle      0.491779
		Randomize      (-0.711, 0.223, -0.508)
		colorDistMagn   0.983454
		colorDistFreq   0.0222586
		detailScale     183.339
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.635369
		terraceProb     0.480292
		erosion         0
		montesMagn      0.470977
		montesFreq      2.69663
		montesSpiky     0.970796
		montesFraction  0.808973
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.10684
		hillsFraction   0.687665
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259907
		craterFreq      0.228632
		craterDensity   1.04692
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.515292
		volcanoTemp     1513.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.173, 0.149, 0.121, 0.000)
		colorShelf     (0.177, 0.153, 0.138, 0.000)
		colorBeach     (0.208, 0.180, 0.164, 0.000)
		colorDesert    (0.226, 0.193, 0.160, 0.000)
		colorLowland   (0.248, 0.206, 0.181, 0.000)
		colorUpland    (0.275, 0.250, 0.220, 0.000)
		colorRock      (0.297, 0.272, 0.237, 0.000)
		colorSnow      (0.323, 0.289, 0.250, 1.000)
		BumpHeight      6.04267
		BumpOffset      1.20853
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000340477
		Period          0.0010299
		Eccentricity    3.68274e-005
		Inclination     -0.000757682
		AscendingNode   149.445
		ArgOfPericenter -164.886
		MeanAnomaly     -58.714
	}
}

DwarfMoon	"Hota D3"
{
	ParentBody     "Hota"
	Class	       "Asteroid"

	Mass            8.58868e-010
	Radius          13.222
	InertiaMoment   0.397673

	Oblateness      0.249

	Obliquity       -0.00570565
	EqAscendNode    178.176
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.711 0.627 0.558)

	Surface
	{
		SurfStyle       0.0189204
		OceanStyle      0.695412
		Randomize      (-0.956, 0.838, 0.484)
		colorDistMagn   0.567363
		colorDistFreq   0.0580358
		detailScale     361.049
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.49301
		terraceProb     0.314899
		erosion         0
		montesMagn      0.36071
		montesFreq      3.37095
		montesSpiky     0.925673
		montesFraction  0.443087
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.356499
		hillsFraction   0.585524
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251559
		craterFreq      0.200257
		craterDensity   0.759397
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.484027
		volcanoTemp     1076.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.284, 0.251, 0.223, 0.000)
		colorShelf     (0.302, 0.267, 0.237, 0.000)
		colorBeach     (0.320, 0.282, 0.251, 0.000)
		colorDesert    (0.338, 0.298, 0.265, 0.000)
		colorLowland   (0.355, 0.314, 0.279, 0.000)
		colorUpland    (0.373, 0.329, 0.293, 0.000)
		colorRock      (0.391, 0.345, 0.307, 0.000)
		colorSnow      (0.409, 0.361, 0.321, 1.000)
		BumpHeight      11.8998
		BumpOffset      2.37996
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000358203
		Period          0.00111137
		Eccentricity    3.38819e-005
		Inclination     -0.00570565
		AscendingNode   178.176
		ArgOfPericenter 4.39886
		MeanAnomaly     -60.9225
	}
}

DwarfMoon	"Hota D4"
{
	ParentBody     "Hota"
	Class	       "Asteroid"

	Mass            1.23632e-009
	Radius          7.59166
	InertiaMoment   0.398935

	Oblateness      0.0333011

	Obliquity       0.00490177
	EqAscendNode    128.25
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.493 0.485 0.479)

	Surface
	{
		SurfStyle       0.0924862
		OceanStyle      0.858999
		Randomize      (0.650, -0.607, 0.947)
		colorDistMagn   0.565406
		colorDistFreq   0.0343341
		detailScale     207.303
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.751962
		terraceProb     0.269844
		erosion         0
		montesMagn      0.43434
		montesFreq      2.30905
		montesSpiky     0.937041
		montesFraction  0.911595
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.148199
		hillsFraction   0.668644
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.267672
		craterFreq      0.226592
		craterDensity   0.869374
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.562046
		volcanoTemp     1671.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.197, 0.194, 0.192, 0.000)
		colorShelf     (0.209, 0.206, 0.204, 0.000)
		colorBeach     (0.222, 0.218, 0.216, 0.000)
		colorDesert    (0.234, 0.230, 0.228, 0.000)
		colorLowland   (0.246, 0.242, 0.240, 0.000)
		colorUpland    (0.259, 0.254, 0.252, 0.000)
		colorRock      (0.271, 0.267, 0.264, 0.000)
		colorSnow      (0.283, 0.279, 0.276, 1.000)
		BumpHeight      6.83249
		BumpOffset      1.3665
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00036584
		Period          0.0011471
		Eccentricity    5.53841e-005
		Inclination     0.00490177
		AscendingNode   128.25
		ArgOfPericenter 139.405
		MeanAnomaly     60.2676
	}
}

DwarfMoon	"Hota D5"
{
	ParentBody     "Hota"
	Class	       "Asteroid"

	Mass            1.75746e-009
	Radius          10.7873
	InertiaMoment   0.399861

	Oblateness      0.0556107

	Obliquity       0.014655
	EqAscendNode    -142.237
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.457 0.450 0.446)

	Surface
	{
		SurfStyle       0.853862
		OceanStyle      0.74741
		Randomize      (-0.700, 0.810, -0.855)
		colorDistMagn   0.935522
		colorDistFreq   0.0636631
		detailScale     294.567
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.413896
		terraceProb     0.542676
		erosion         0
		montesMagn      0.526872
		montesFreq      3.563
		montesSpiky     0.9218
		montesFraction  0.812761
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.259133
		hillsFraction   0.342556
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222174
		craterFreq      0.226796
		craterDensity   0.798438
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.536118
		volcanoTemp     1665.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.155, 0.157, 0.178, 0.050)
		colorShelf     (0.183, 0.184, 0.205, 0.040)
		colorBeach     (0.210, 0.211, 0.232, 0.030)
		colorDesert    (0.238, 0.238, 0.263, 0.020)
		colorLowland   (0.265, 0.265, 0.290, 0.030)
		colorUpland    (0.293, 0.292, 0.317, 0.050)
		colorRock      (0.320, 0.319, 0.352, 0.020)
		colorSnow      (0.320, 0.319, 0.352, 1.000)
		BumpHeight      9.70861
		BumpOffset      1.94172
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00039014
		Period          0.00126326
		Eccentricity    5.07956e-005
		Inclination     0.014655
		AscendingNode   -142.237
		ArgOfPericenter 111.97
		MeanAnomaly     -67.1984
	}
}

Moon	"Hota 1"
{
	ParentBody     "Hota"
	Class	       "Selena"

	Mass            0.000228664
	Radius          412.154
	InertiaMoment   0.399083

	Oblateness      0.00505167

	Obliquity       0.670365
	EqAscendNode    3.41319
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.492 0.487 0.484)

	Surface
	{
		SurfStyle       0.384358
		OceanStyle      0.10421
		Randomize      (-0.816, -0.318, -0.645)
		colorDistMagn   0.0808684
		colorDistFreq   50.6382
		detailScale     1060.08
		colorConversion true
		drivenDarkening 0
		seaLevel        0.195007
		snowLevel       2
		tropicLatitude  0.0233875
		icecapLatitude  10
		icecapHeight    0.123232
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.90634
		venusFreq       1.4299
		venusMagn       0
		mareFreq        0
		mareDensity     0.000433778
		terraceProb     0.289025
		erosion         0
		montesMagn      0.0469529
		montesFreq      17.736
		montesSpiky     0.968948
		montesFraction  0.125528
		dunesMagn       0.0421932
		dunesFreq       538.436
		dunesFraction   0.200588
		hillsMagn       0.103586
		hillsFreq       54.7252
		hillsFraction   0.240042
		hills2Fraction  0
		riversMagn      51.5426
		riversFreq      2.25757
		riversSin       6.40223
		riversOctaves   0
		canyonsMagn     0.35889
		canyonsFreq     0.11305
		canyonFraction  0.839966
		cracksMagn      0.0200652
		cracksFreq      0.0758202
		cracksOctaves   0
		craterMagn      0.58774
		craterFreq      1.36405
		craterDensity   0.742237
		craterOctaves   8.88118
		craterRayedFactor 0.121332
		volcanoMagn     0.16259
		volcanoFreq     0.655841
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.200283
		volcanoRadius   0.139259
		volcanoTemp     1334.9
		lavaCoverTidal  0.0146697
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.420, 0.420, 0.430, 0.000)
		colorShelf     (0.470, 0.480, 0.480, 0.000)
		colorBeach     (0.271, 0.278, 0.290, 0.000)
		colorDesert    (0.236, 0.224, 0.223, 0.000)
		colorLowland   (0.300, 0.297, 0.271, 0.000)
		colorUpland    (0.320, 0.317, 0.295, 0.000)
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
		SemiMajorAxis   0.000653756
		Period          0.0027402
		Eccentricity    0.0431973
		Inclination     0.670365
		AscendingNode   3.41319
		ArgOfPericenter -113.336
		MeanAnomaly     -101.746
	}
}

Moon	"Hota 2"
{
	ParentBody     "Hota"
	Class	       "Selena"

	Mass            0.000269716
	Radius          387.61
	InertiaMoment   0.398536

	Obliquity       0.541053
	EqAscendNode    -127.727
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.784 0.781 0.779)

	Surface
	{
		SurfStyle       0.728606
		OceanStyle      0.103466
		Randomize      (0.804, 0.188, -0.317)
		colorDistMagn   0.073417
		colorDistFreq   50.4186
		detailScale     996.954
		colorConversion true
		drivenDarkening 0
		seaLevel        0.278654
		snowLevel       2
		tropicLatitude  0.00832222
		icecapLatitude  10
		icecapHeight    0.178166
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.63821
		venusFreq       1.28062
		venusMagn       0
		mareFreq        0
		mareDensity     0.000666844
		terraceProb     0.150271
		erosion         0
		montesMagn      0.0490588
		montesFreq      19.6349
		montesSpiky     0.984122
		montesFraction  0.626447
		dunesMagn       0.0296319
		dunesFreq       510.061
		dunesFraction   0.738192
		hillsMagn       0.119296
		hillsFreq       45.0337
		hillsFraction   0.669718
		hills2Fraction  0
		riversMagn      54.049
		riversFreq      2.105
		riversSin       5.35648
		riversOctaves   0
		canyonsMagn     0.51675
		canyonsFreq     0.129908
		canyonFraction  0.36375
		cracksMagn      0.0638883
		cracksFreq      0.252316
		cracksOctaves   0
		craterMagn      0.686463
		craterFreq      1.15911
		craterDensity   0.987913
		craterOctaves   9
		craterRayedFactor 0.115724
		volcanoMagn     0.170045
		volcanoFreq     0.682638
		volcanoDensity  0.219888
		volcanoOctaves  3
		volcanoActivity 0.00599376
		volcanoFlows    0.140381
		volcanoRadius   0.127408
		volcanoTemp     1643.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.470, 0.400, 0.340, 0.000)
		colorShelf     (0.640, 0.600, 0.470, 0.000)
		colorBeach     (0.494, 0.476, 0.374, 0.000)
		colorDesert    (0.525, 0.484, 0.382, 0.000)
		colorLowland   (0.431, 0.359, 0.304, 0.000)
		colorUpland    (0.612, 0.554, 0.405, 0.000)
		colorRock      (0.300, 0.260, 0.220, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      19.3805
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
		SemiMajorAxis   0.00108967
		Period          0.00589661
		Eccentricity    0.0041541
		Inclination     0.541053
		AscendingNode   -127.727
		ArgOfPericenter -168.556
		MeanAnomaly     102.48
	}
}

Moon	"Hota 3"
{
	ParentBody     "Hota"
	Class	       "Selena"

	Mass            0.00316458
	Radius          1119.35
	InertiaMoment   0.397839

	Obliquity       -0.515757
	EqAscendNode    145.446
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.446 0.441 0.438)

	Surface
	{
		SurfStyle       0.43419
		OceanStyle      0.927164
		Randomize      (-0.374, 0.748, -0.970)
		colorDistMagn   0.0675067
		colorDistFreq   112.682
		detailScale     2879.03
		colorConversion true
		drivenDarkening 0
		seaLevel        0.218574
		snowLevel       2
		tropicLatitude  0.00534883
		icecapLatitude  10
		icecapHeight    0.162604
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.99984
		venusFreq       0.53616
		venusMagn       0
		mareFreq        0.344779
		mareDensity     0.00211141
		terraceProb     0.220517
		erosion         0
		montesMagn      0.0630094
		montesFreq      64.9759
		montesSpiky     0.985304
		montesFraction  0.509753
		dunesMagn       0.0264912
		dunesFreq       1469.06
		dunesFraction   0.552288
		hillsMagn       0.104164
		hillsFreq       120.325
		hillsFraction   0.810319
		hills2Fraction  0
		riversMagn      57.5136
		riversFreq      3.84484
		riversSin       6.25611
		riversOctaves   0
		canyonsMagn     0.356818
		canyonsFreq     0.361928
		canyonFraction  0.0361325
		cracksMagn      0.020287
		cracksFreq      0.413177
		cracksOctaves   0
		craterMagn      0.538158
		craterFreq      2.54142
		craterDensity   0.994272
		craterOctaves   10
		craterRayedFactor 0.185975
		volcanoMagn     0.171978
		volcanoFreq     0.687173
		volcanoDensity  0.171886
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.327238
		volcanoRadius   0.177366
		volcanoTemp     1838.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.420, 0.420, 0.430, 0.000)
		colorShelf     (0.470, 0.480, 0.480, 0.000)
		colorBeach     (0.245, 0.251, 0.263, 0.000)
		colorDesert    (0.214, 0.203, 0.202, 0.000)
		colorLowland   (0.272, 0.269, 0.246, 0.000)
		colorUpland    (0.290, 0.286, 0.267, 0.000)
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
		SemiMajorAxis   0.00181626
		Period          0.0126874
		Eccentricity    0.00151114
		Inclination     -0.515757
		AscendingNode   145.446
		ArgOfPericenter -95.1937
		MeanAnomaly     -173.662
	}
}

Moon	"Hota 4"
{
	ParentBody     "Hota"
	Class	       "Selena"

	Mass            0.000369727
	Radius          483.419
	InertiaMoment   0.396702

	Obliquity       -1.23868
	EqAscendNode    131.16
	//Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.694 0.545 0.478)

	Surface
	{
		SurfStyle       0.0144907
		OceanStyle      0.438789
		Randomize      (0.939, 0.134, 0.697)
		colorDistMagn   0.076329
		colorDistFreq   67.8662
		detailScale     1243.38
		colorConversion true
		drivenDarkening 0
		seaLevel        0.228792
		snowLevel       2
		tropicLatitude  0.0178733
		icecapLatitude  10
		icecapHeight    0.16709
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.67034
		venusFreq       1.13727
		venusMagn       0
		mareFreq        0
		mareDensity     0.000700537
		terraceProb     0.187832
		erosion         0
		montesMagn      0.0618483
		montesFreq      19.8236
		montesSpiky     0.900758
		montesFraction  0.456823
		dunesMagn       0.0364118
		dunesFreq       638.449
		dunesFraction   0.328128
		hillsMagn       0.131666
		hillsFreq       55.9644
		hillsFraction   0.00532499
		hills2Fraction  0
		riversMagn      56.0152
		riversFreq      3.21154
		riversSin       6.29439
		riversOctaves   0
		canyonsMagn     0.49767
		canyonsFreq     0.159107
		canyonFraction  0.815861
		cracksMagn      0.0479203
		cracksFreq      0.320491
		cracksOctaves   0
		craterMagn      0.649864
		craterFreq      0.943925
		craterDensity   0.957882
		craterOctaves   9
		craterRayedFactor 0
		volcanoMagn     0.182182
		volcanoFreq     0.714711
		volcanoDensity  0.178533
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.147198
		volcanoRadius   0.158297
		volcanoTemp     1137.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.320, 0.320, 0.000)
		colorShelf     (0.370, 0.370, 0.370, 0.000)
		colorBeach     (0.347, 0.273, 0.239, 0.000)
		colorDesert    (0.430, 0.327, 0.273, 0.200)
		colorLowland   (0.465, 0.349, 0.306, 0.500)
		colorUpland    (0.486, 0.365, 0.316, 0.800)
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
		SemiMajorAxis   0.00302731
		Period          0.027305
		Eccentricity    0.00831146
		Inclination     -1.23868
		AscendingNode   131.16
		ArgOfPericenter -69.1197
		MeanAnomaly     -13.9381
	}
}

DwarfMoon	"Hota D6"
{
	ParentBody     "Hota"
	Class	       "Asteroid"

	Mass            8.99651e-009
	Radius          17.014
	InertiaMoment   0.399214

	RotationPeriod  357.662
	Obliquity       -45.3123
	EqAscendNode    -28.482
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.630 0.628 0.623)

	Surface
	{
		SurfStyle       0.545283
		OceanStyle      0.833313
		Randomize      (0.513, 0.074, -0.278)
		colorDistMagn   0.404378
		colorDistFreq   0.151065
		detailScale     464.596
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998103
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.644682
		terraceProb     0.257292
		erosion         0
		montesMagn      0.571143
		montesFreq      2.8191
		montesSpiky     0.958446
		montesFraction  0.294381
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.749493
		hillsFraction   0.714639
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.20795
		craterFreq      0.18255
		craterDensity   0.930558
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.526588
		volcanoTemp     1443.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.246, 0.213, 0.175, 0.000)
		colorShelf     (0.252, 0.220, 0.200, 0.000)
		colorBeach     (0.296, 0.257, 0.237, 0.000)
		colorDesert    (0.321, 0.276, 0.231, 0.000)
		colorLowland   (0.353, 0.295, 0.262, 0.000)
		colorUpland    (0.391, 0.358, 0.318, 0.000)
		colorRock      (0.422, 0.389, 0.343, 0.000)
		colorSnow      (0.460, 0.414, 0.362, 1.000)
		BumpHeight      15.3126
		BumpOffset      3.06253
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0152812
		Period          0.309669
		Eccentricity    0.267988
		Inclination     -53.8586
		AscendingNode   -33.94
		ArgOfPericenter -26.18
		MeanAnomaly     -92.4139
	}
}

DwarfMoon	"Hota D7"
{
	ParentBody     "Hota"
	Class	       "Asteroid"

	Mass            1.22767e-008
	Radius          32.451
	InertiaMoment   0.395975

	RotationPeriod  507.488
	Obliquity       -8.99591
	EqAscendNode    104.037
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.452 0.443 0.440)

	Surface
	{
		SurfStyle       0.39592
		OceanStyle      0.166747
		Randomize      (0.833, 0.249, -0.062)
		colorDistMagn   0.607856
		colorDistFreq   0.448276
		detailScale     886.127
		colorConversion true
		snowLevel       2
		tropicLatitude  0.483523
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.628063
		terraceProb     0.221227
		erosion         0
		montesMagn      0.52648
		montesFreq      3.5988
		montesSpiky     0.966728
		montesFraction  0.569497
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.19803
		hillsFraction   0.683318
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258753
		craterFreq      0.25103
		craterDensity   0.809041
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.441754
		volcanoTemp     1276.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.181, 0.177, 0.176, 0.000)
		colorShelf     (0.192, 0.188, 0.187, 0.000)
		colorBeach     (0.203, 0.199, 0.198, 0.000)
		colorDesert    (0.215, 0.210, 0.209, 0.000)
		colorLowland   (0.226, 0.221, 0.220, 0.000)
		colorUpland    (0.237, 0.233, 0.231, 0.000)
		colorRock      (0.249, 0.244, 0.242, 0.000)
		colorSnow      (0.260, 0.255, 0.253, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0155312
		Period          0.317302
		Eccentricity    0.0885451
		Inclination     -30.0079
		AscendingNode   104.838
		ArgOfPericenter -158.463
		MeanAnomaly     177.363
	}
}

DwarfMoon	"Hota D8"
{
	ParentBody     "Hota"
	Class	       "Asteroid"

	Mass            1.6707e-008
	Radius          18.4516
	InertiaMoment   0.398296

	RotationPeriod  301.977
	Obliquity       -19.4163
	EqAscendNode    60.2968
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.573 0.570 0.564)

	Surface
	{
		SurfStyle       0.191621
		OceanStyle      0.787252
		Randomize      (-0.244, -0.166, 0.850)
		colorDistMagn   0.361883
		colorDistFreq   0.273485
		detailScale     503.851
		colorConversion true
		snowLevel       2
		tropicLatitude  0.336333
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.494438
		terraceProb     0.338115
		erosion         0
		montesMagn      0.482841
		montesFreq      2.96398
		montesSpiky     0.999871
		montesFraction  0.779471
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.921765
		hillsFraction   0.742922
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.271378
		craterFreq      0.176546
		craterDensity   0.785129
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.567528
		volcanoTemp     1695.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.229, 0.228, 0.226, 0.000)
		colorShelf     (0.243, 0.242, 0.240, 0.000)
		colorBeach     (0.258, 0.256, 0.254, 0.000)
		colorDesert    (0.272, 0.271, 0.268, 0.000)
		colorLowland   (0.286, 0.285, 0.282, 0.000)
		colorUpland    (0.301, 0.299, 0.296, 0.000)
		colorRock      (0.315, 0.313, 0.310, 0.000)
		colorSnow      (0.329, 0.328, 0.324, 1.000)
		BumpHeight      16.6064
		BumpOffset      3.32128
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0158418
		Period          0.326867
		Eccentricity    0.141107
		Inclination     21.5983
		AscendingNode   58.0053
		ArgOfPericenter 149.575
		MeanAnomaly     122.77
	}
}

DwarfMoon	"Hota D9"
{
	ParentBody     "Hota"
	Class	       "Asteroid"

	Mass            2.26948e-008
	Radius          46.7933
	InertiaMoment   0.399347

	RotationPeriod  539.575
	Obliquity       37.314
	EqAscendNode    -81.9767
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.706 0.652 0.603)

	Surface
	{
		SurfStyle       0.117499
		OceanStyle      0.960119
		Randomize      (0.979, -0.675, -0.335)
		colorDistMagn   0.307198
		colorDistFreq   0.853183
		detailScale     1277.77
		colorConversion true
		snowLevel       2
		tropicLatitude  0.960557
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.591562
		terraceProb     0.223773
		erosion         0
		montesMagn      0.249455
		montesFreq      2.90617
		montesSpiky     0.897124
		montesFraction  0.582324
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.88603
		hillsFraction   0.705574
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239172
		craterFreq      0.179261
		craterDensity   0.8417
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48413
		volcanoTemp     1227.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.282, 0.261, 0.241, 0.000)
		colorShelf     (0.300, 0.277, 0.256, 0.000)
		colorBeach     (0.318, 0.293, 0.271, 0.000)
		colorDesert    (0.335, 0.310, 0.287, 0.000)
		colorLowland   (0.353, 0.326, 0.302, 0.000)
		colorUpland    (0.371, 0.342, 0.317, 0.000)
		colorRock      (0.388, 0.359, 0.332, 0.000)
		colorSnow      (0.406, 0.375, 0.347, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0162851
		Period          0.340681
		Eccentricity    0.0236506
		Inclination     64.0287
		AscendingNode   -82.5983
		ArgOfPericenter 15.8417
		MeanAnomaly     92.2299
	}
}

DwarfMoon	"Hota D10"
{
	ParentBody     "Hota"
	Class	       "Asteroid"

	Mass            3.07997e-008
	Radius          25.9315
	InertiaMoment   0.396651

	RotationPeriod  313.884
	Obliquity       8.18174
	EqAscendNode    -122.24
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.663 0.659 0.658)

	Surface
	{
		SurfStyle       0.381972
		OceanStyle      0.149144
		Randomize      (0.453, 0.074, 0.420)
		colorDistMagn   0.595131
		colorDistFreq   0.306697
		detailScale     708.104
		colorConversion true
		snowLevel       2
		tropicLatitude  0.334488
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.70997
		terraceProb     0.586899
		erosion         0
		montesMagn      0.54921
		montesFreq      3.44163
		montesSpiky     0.940133
		montesFraction  0.926838
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.49019
		hillsFraction   0.854756
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238102
		craterFreq      0.2353
		craterDensity   0.782195
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.511991
		volcanoTemp     1701.82
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.265, 0.264, 0.263, 0.000)
		colorShelf     (0.282, 0.280, 0.279, 0.000)
		colorBeach     (0.298, 0.297, 0.296, 0.000)
		colorDesert    (0.315, 0.313, 0.312, 0.000)
		colorLowland   (0.331, 0.329, 0.329, 0.000)
		colorUpland    (0.348, 0.346, 0.345, 0.000)
		colorRock      (0.364, 0.362, 0.362, 0.000)
		colorSnow      (0.381, 0.379, 0.378, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.016679
		Period          0.353116
		Eccentricity    0.031939
		Inclination     22.5565
		AscendingNode   -121.223
		ArgOfPericenter -103.686
		MeanAnomaly     -71.27
	}
}

DwarfMoon	"Hota D11"
{
	ParentBody     "Hota"
	Class	       "Asteroid"

	Mass            4.1796e-008
	Radius          26.8252
	InertiaMoment   0.398469

	RotationPeriod  287.285
	Obliquity       -15.8052
	EqAscendNode    -35.8375
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.548 0.465 0.387)

	Surface
	{
		SurfStyle       0.120141
		OceanStyle      0.580293
		Randomize      (0.415, -0.633, 0.826)
		colorDistMagn   0.547572
		colorDistFreq   0.518204
		detailScale     732.506
		colorConversion true
		snowLevel       2
		tropicLatitude  0.491839
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.325921
		terraceProb     0.466664
		erosion         0
		montesMagn      0.27151
		montesFreq      2.9663
		montesSpiky     0.976051
		montesFraction  0.855121
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.5789
		hillsFraction   0.615219
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.276477
		craterFreq      0.275633
		craterDensity   0.907787
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.54321
		volcanoTemp     1119.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.219, 0.186, 0.155, 0.000)
		colorShelf     (0.233, 0.198, 0.164, 0.000)
		colorBeach     (0.247, 0.209, 0.174, 0.000)
		colorDesert    (0.260, 0.221, 0.184, 0.000)
		colorLowland   (0.274, 0.233, 0.193, 0.000)
		colorUpland    (0.288, 0.244, 0.203, 0.000)
		colorRock      (0.302, 0.256, 0.213, 0.000)
		colorSnow      (0.315, 0.267, 0.222, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0171656
		Period          0.368682
		Eccentricity    0.48862
		Inclination     -14.962
		AscendingNode   -33.1318
		ArgOfPericenter 123.242
		MeanAnomaly     75.8357
	}
}

DwarfMoon	"Hota D12"
{
	ParentBody     "Hota"
	Class	       "Asteroid"

	Mass            5.67631e-008
	Radius          52.1932
	InertiaMoment   0.399477

	RotationPeriod  434.882
	Obliquity       31.5379
	EqAscendNode    -41.368
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.672 0.519 0.409)

	Surface
	{
		SurfStyle       0.41269
		OceanStyle      0.512107
		Randomize      (-0.871, 0.140, 0.569)
		colorDistMagn   0.63663
		colorDistFreq   0.192523
		detailScale     1425.22
		colorConversion true
		snowLevel       2
		tropicLatitude  0.994371
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.400599
		terraceProb     0.272869
		erosion         0
		montesMagn      0.455981
		montesFreq      2.49601
		montesSpiky     0.932621
		montesFraction  0.225112
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.97629
		hillsFraction   0.753145
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262671
		craterFreq      0.214474
		craterDensity   0.868051
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.457618
		volcanoTemp     1419.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.269, 0.207, 0.163, 0.000)
		colorShelf     (0.286, 0.220, 0.174, 0.000)
		colorBeach     (0.302, 0.233, 0.184, 0.000)
		colorDesert    (0.319, 0.246, 0.194, 0.000)
		colorLowland   (0.336, 0.259, 0.204, 0.000)
		colorUpland    (0.353, 0.272, 0.215, 0.000)
		colorRock      (0.370, 0.285, 0.225, 0.000)
		colorSnow      (0.386, 0.298, 0.235, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0176462
		Period          0.384274
		Eccentricity    0.103578
		Inclination     57.4867
		AscendingNode   -37.0241
		ArgOfPericenter -174.151
		MeanAnomaly     -83.7934
	}
}

DwarfMoon	"Hota D13"
{
	ParentBody     "Hota"
	Class	       "Asteroid"

	Mass            7.72181e-008
	Radius          28.1148
	InertiaMoment   0.397077

	RotationPeriod  231.784
	Obliquity       -35.9279
	EqAscendNode    -111.08
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.758 0.755 0.750)

	Surface
	{
		SurfStyle       0.517759
		OceanStyle      0.0133712
		Randomize      (0.056, -0.599, 0.142)
		colorDistMagn   0.450725
		colorDistFreq   0.469659
		detailScale     767.723
		colorConversion true
		snowLevel       2
		tropicLatitude  0.59497
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.323993
		terraceProb     0.222533
		erosion         0
		montesMagn      0.481797
		montesFreq      3.42919
		montesSpiky     0.94873
		montesFraction  0.313668
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.75475
		hillsFraction   0.388676
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244082
		craterFreq      0.232925
		craterDensity   0.867368
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.489447
		volcanoTemp     1425.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.296, 0.257, 0.210, 0.000)
		colorShelf     (0.303, 0.264, 0.240, 0.000)
		colorBeach     (0.356, 0.310, 0.285, 0.000)
		colorDesert    (0.386, 0.332, 0.278, 0.000)
		colorLowland   (0.424, 0.355, 0.315, 0.000)
		colorUpland    (0.470, 0.431, 0.383, 0.000)
		colorRock      (0.508, 0.468, 0.413, 0.000)
		colorSnow      (0.553, 0.499, 0.435, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0178573
		Period          0.391189
		Eccentricity    0.36554
		Inclination     -23.2567
		AscendingNode   -104.955
		ArgOfPericenter -166.461
		MeanAnomaly     -177.388
	}
}

DwarfMoon	"Hota D14"
{
	ParentBody     "Hota"
	Class	       "Asteroid"

	Mass            1.05315e-007
	Radius          70.4662
	InertiaMoment   0.398631

	RotationPeriod  438.081
	Obliquity       31.1128
	EqAscendNode    12.2437
	//Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.667 0.579 0.408)

	Surface
	{
		SurfStyle       0.920855
		OceanStyle      0.817548
		Randomize      (-0.126, 0.061, 0.520)
		colorDistMagn   0.437046
		colorDistFreq   3.52644
		detailScale     1924.2
		colorConversion true
		snowLevel       2
		tropicLatitude  0.380385
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.48678
		terraceProb     0.308065
		erosion         0
		montesMagn      0.558442
		montesFreq      1.78285
		montesSpiky     0.831094
		montesFraction  0.691347
		dunesFraction   0
		hillsMagn       0
		hillsFreq       14.7649
		hillsFraction   0.739879
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.283459
		craterFreq      0.16601
		craterDensity   0.940206
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.517186
		volcanoTemp     1849.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.227, 0.203, 0.163, 0.050)
		colorShelf     (0.267, 0.237, 0.188, 0.040)
		colorBeach     (0.307, 0.272, 0.212, 0.030)
		colorDesert    (0.347, 0.307, 0.241, 0.020)
		colorLowland   (0.387, 0.342, 0.265, 0.030)
		colorUpland    (0.427, 0.376, 0.290, 0.050)
		colorRock      (0.467, 0.411, 0.323, 0.020)
		colorSnow      (0.467, 0.411, 0.323, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0184668
		Period          0.411386
		Eccentricity    0.46492
		Inclination     -8.94891
		AscendingNode   10.2408
		ArgOfPericenter -158.406
		MeanAnomaly     81.448
	}
}
