// http://starwars.wikia.com/wiki/Ord_Mantell
// Region : Mid Rim
// Sector : Bright Jewel Sector
// Grid location : L7
// X : 71.13, Y : 3824.46, Z : 130.29783200959514

http://starwars.wikia.com/wiki/Repta
DwarfPlanet	"Repta/Bright Jewel System 1"
{
	ParentBody     "Bright Jewel System"
	Class	       "Selena"

	Mass            0.00378954
	Radius          1187.85
	InertiaMoment   0.399743

	Obliquity       1.8083
	EqAscendNode    57.0014
	Precession      0
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
	Precession      0

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

	NoCometTail     true

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
	Precession      0
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
	Precession      0
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
	Precession      0
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
	Precession      0
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
	Precession      0

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
	Precession      0

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
	Precession      0
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
	Precession      0
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
	Precession      0

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
	Precession      0
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
	Precession      0

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
	Precession      0

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
	Precession      0

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
	Precession      0

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
	Precession      0

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
	Precession      0

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
	Precession      0

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
	Precession      0
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
	Precession      0
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
	Precession      0

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
	Precession      0
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
	Precession      0
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
	Precession      0
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
	Precession      0
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
	Precession      0
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
	Precession      0
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
	Precession      0
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
	Precession      0
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
	Precession      0
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
	Precession      0
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
	Precession      0
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
	Precession      0
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
	Precession      0

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
	Precession      0
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
	Precession      0

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
	Precession      0
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
	Precession      0
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
	Precession      0

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
	Precession      0

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
	Precession      0
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
	Precession      0

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
	Precession      0

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
	Precession      0

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
	Precession      0
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
	Precession      0
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
	Precession      0
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
	Precession      0
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
	Precession      0
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
	Precession      0
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
	Precession      0
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
	Precession      0
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
	Precession      0

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
	Precession      0

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
	Precession      0

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
	Precession      0

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
	Precession      0

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
	Precession      0

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
	Precession      0

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
	Precession      0

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
	Precession      0

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
	Precession      0

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
	Precession      0

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
	Precession      0

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
	Precession      0

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
	Precession      0

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
	Precession      0

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
	Precession      0

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
	Precession      0

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
	Precession      0

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
	Precession      0

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
	Precession      0

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
	Precession      0

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
	Precession      0

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
	Precession      0

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
	Precession      0

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
	Precession      0

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
	Precession      0

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
	Precession      0

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
	Precession      0

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
	Precession      0

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
	Precession      0

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
	Precession      0

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
	Precession      0

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
	Precession      0

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
	Precession      0
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
	Precession      0
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
	Precession      0
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
	Precession      0
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
	Precession      0
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
	Precession      0
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
	Precession      0
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
	Precession      0
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
	Precession      0
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
	Precession      0

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
	Precession      0

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
	Precession      0

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
	Precession      0

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
	Precession      0

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
	Precession      0

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
	Precession      0

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
	Precession      0

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
	Precession      0

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

// Ord Mantell Comet Cloud

Comet	"Ord Mantell C1"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            1.85133e-007
	Radius          72.1789
	InertiaMoment   0.39912

	Oblateness      0.016141

	RotationPeriod  34.6131
	Obliquity       263.573
	EqAscendNode    61.0121
	Precession      0

	AbsMagn         9.74849
	SlopeParam      4.70962
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.713 0.708 0.704)

	Surface
	{
		SurfStyle       0.661036
		OceanStyle      0.324464
		Randomize      (0.517, 0.140, 0.749)
		colorDistMagn   0.437044
		colorDistFreq   2.65544
		detailScale     1970.97
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998478
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.527517
		terraceProb     0.405697
		erosion         0
		montesMagn      0.421702
		montesFreq      3.55927
		montesSpiky     0.961741
		montesFraction  0.47182
		dunesFraction   0
		hillsMagn       0
		hillsFreq       12.0225
		hillsFraction   0.779469
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239041
		craterFreq      0.204309
		craterDensity   1.04931
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.501372
		volcanoTemp     1520.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.278, 0.241, 0.197, 0.000)
		colorShelf     (0.285, 0.248, 0.225, 0.000)
		colorBeach     (0.335, 0.290, 0.267, 0.000)
		colorDesert    (0.363, 0.311, 0.260, 0.000)
		colorLowland   (0.399, 0.333, 0.296, 0.000)
		colorUpland    (0.442, 0.403, 0.359, 0.000)
		colorRock      (0.477, 0.439, 0.387, 0.000)
		colorSnow      (0.520, 0.467, 0.408, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0932648
		DustBright  0.162257
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.05005
		Eccentricity    0.855582
		Inclination     -23.316
		AscendingNode   96.9597
		ArgOfPericenter 3.77423
		MeanAnomaly     18.0839
	}
}

Comet	"Ord Mantell C2"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            5.70038e-015
	Radius          0.254148
	InertiaMoment   0.397667

	Oblateness      0.0255732

	RotationPeriod  32.6538
	Obliquity       216.778
	EqAscendNode    45.5895
	Precession      0

	AbsMagn         6.25402
	SlopeParam      5.35345
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.428 0.422 0.416)

	Surface
	{
		SurfStyle       0.983868
		OceanStyle      0.0875386
		Randomize      (-0.124, 0.239, -0.587)
		colorDistMagn   0.516189
		colorDistFreq   3.73298e-006
		detailScale     6.93993
		colorConversion true
		snowLevel       2
		tropicLatitude  0.795082
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.463717
		terraceProb     0.364632
		erosion         0
		montesMagn      0.608418
		montesFreq      2.97602
		montesSpiky     0.864952
		montesFraction  0.749471
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000189741
		hillsFraction   0.773082
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260716
		craterFreq      0.211234
		craterDensity   0.962756
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.446384
		volcanoTemp     1564.53
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.145, 0.148, 0.166, 0.050)
		colorShelf     (0.171, 0.173, 0.191, 0.040)
		colorBeach     (0.197, 0.199, 0.216, 0.030)
		colorDesert    (0.222, 0.224, 0.246, 0.020)
		colorLowland   (0.248, 0.249, 0.271, 0.030)
		colorUpland    (0.274, 0.275, 0.295, 0.050)
		colorRock      (0.299, 0.300, 0.329, 0.020)
		colorSnow      (0.299, 0.300, 0.329, 1.000)
		BumpHeight      0.228733
		BumpOffset      0.0457466
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.103543
		GasToDust   0.25
		Particles   1188
		GasBright   0.313795
		DustBright  0.426214
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.02202
		Eccentricity    0.808251
		Inclination     -131.673
		AscendingNode   -99.5191
		ArgOfPericenter 171.155
		MeanAnomaly     -5.27957
	}
}

Comet	"Ord Mantell C3"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            4.40883e-011
	Radius          4.45584
	InertiaMoment   0.399563

	Oblateness      0.0203727

	RotationPeriod  30.6479
	Obliquity       169.984
	EqAscendNode    30.1669
	Precession      0

	AbsMagn         16.7813
	SlopeParam      6.18585
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.602 0.596 0.590)

	Surface
	{
		SurfStyle       0.977389
		OceanStyle      0.935613
		Randomize      (0.727, -0.952, 0.733)
		colorDistMagn   0.865437
		colorDistFreq   0.0165232
		detailScale     121.674
		colorConversion true
		snowLevel       2
		tropicLatitude  0.843292
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.582545
		terraceProb     0.171903
		erosion         0
		montesMagn      0.582913
		montesFreq      3.1325
		montesSpiky     0.922708
		montesFraction  0.187639
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0405982
		hillsFraction   0.782624
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234165
		craterFreq      0.19668
		craterDensity   1.01489
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.556049
		volcanoTemp     1675.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.205, 0.208, 0.236, 0.050)
		colorShelf     (0.241, 0.244, 0.272, 0.040)
		colorBeach     (0.277, 0.280, 0.307, 0.030)
		colorDesert    (0.313, 0.316, 0.348, 0.020)
		colorLowland   (0.349, 0.351, 0.384, 0.030)
		colorUpland    (0.385, 0.387, 0.419, 0.050)
		colorRock      (0.421, 0.423, 0.466, 0.020)
		colorSnow      (0.421, 0.423, 0.466, 1.000)
		BumpHeight      4.01026
		BumpOffset      0.802051
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.584735
		GasToDust   0.25
		Particles   2161
		GasBright   0.205068
		DustBright  0.219427
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.06984
		Eccentricity    0.787417
		Inclination     66.1596
		AscendingNode   -28.786
		ArgOfPericenter -66.1931
		MeanAnomaly     130.375
	}
}

Comet	"Ord Mantell C4"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            3.40992e-007
	Radius          99.3272
	InertiaMoment   0.398354

	Oblateness      0.033385

	RotationPeriod  28.5866
	Obliquity       123.19
	EqAscendNode    14.7443
	Precession      0

	AbsMagn         9.52165
	SlopeParam      7.91528
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.523 0.521 0.517)

	Surface
	{
		SurfStyle       0.031808
		OceanStyle      0.415198
		Randomize      (-0.740, -0.956, -0.099)
		colorDistMagn   0.384892
		colorDistFreq   6.79089
		detailScale     2712.3
		colorConversion true
		snowLevel       2
		tropicLatitude  0.864047
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.622039
		terraceProb     0.169027
		erosion         0
		montesMagn      0.564297
		montesFreq      2.8531
		montesSpiky     0.970308
		montesFraction  0.699115
		dunesFraction   0
		hillsMagn       0
		hillsFreq       22.8244
		hillsFraction   0.574601
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.275192
		craterFreq      0.369543
		craterDensity   0.92161
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.535566
		volcanoTemp     1448
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.209, 0.208, 0.207, 0.000)
		colorShelf     (0.222, 0.221, 0.220, 0.000)
		colorBeach     (0.235, 0.234, 0.233, 0.000)
		colorDesert    (0.249, 0.247, 0.246, 0.000)
		colorLowland   (0.262, 0.260, 0.259, 0.000)
		colorUpland    (0.275, 0.273, 0.271, 0.000)
		colorRock      (0.288, 0.286, 0.284, 0.000)
		colorSnow      (0.301, 0.299, 0.297, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0382978
		DustBright  0.870684
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.06862
		Eccentricity    0.912758
		Inclination     -112.285
		AscendingNode   156.662
		ArgOfPericenter -13.6305
		MeanAnomaly     90.2116
	}
}

Comet	"Ord Mantell C5"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            1.04994e-014
	Radius          0.274844
	InertiaMoment   0.399985

	Oblateness      0.0269774

	RotationPeriod  26.4596
	Obliquity       76.3954
	EqAscendNode    359.322
	Precession      0

	AbsMagn         6.02148
	SlopeParam      2.62317
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.504 0.502 0.499)

	Surface
	{
		SurfStyle       0.309695
		OceanStyle      0.694876
		Randomize      (-0.549, 0.254, -0.021)
		colorDistMagn   0.864063
		colorDistFreq   1.92072e-005
		detailScale     7.50507
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997411
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.419424
		terraceProb     0.287641
		erosion         0
		montesMagn      0.520565
		montesFreq      3.81278
		montesSpiky     0.970392
		montesFraction  0.339652
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000160677
		hillsFraction   0.773791
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226024
		craterFreq      0.180756
		craterDensity   0.871409
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.432248
		volcanoTemp     1632.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.202, 0.201, 0.199, 0.000)
		colorShelf     (0.214, 0.213, 0.212, 0.000)
		colorBeach     (0.227, 0.226, 0.224, 0.000)
		colorDesert    (0.239, 0.238, 0.237, 0.000)
		colorLowland   (0.252, 0.251, 0.249, 0.000)
		colorUpland    (0.265, 0.264, 0.262, 0.000)
		colorRock      (0.277, 0.276, 0.274, 0.000)
		colorSnow      (0.290, 0.289, 0.287, 1.000)
		BumpHeight      0.247359
		BumpOffset      0.0494719
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.136369
		GasToDust   0.25
		Particles   1255
		GasBright   0.0600459
		DustBright  0.533423
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.02022
		Eccentricity    0.856786
		Inclination     -24.2263
		AscendingNode   -110.95
		ArgOfPericenter -100.814
		MeanAnomaly     169.411
	}
}

Comet	"Ord Mantell C6"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            8.12053e-011
	Radius          6.15249
	InertiaMoment   0.398886

	Oblateness      0.046373

	RotationPeriod  24.2545
	Obliquity       29.6011
	EqAscendNode    343.899
	Precession      0

	AbsMagn         15.2539
	SlopeParam      3.27063
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.635 0.449 0.379)

	Surface
	{
		SurfStyle       0.27636
		OceanStyle      0.793458
		Randomize      (-0.790, 0.892, 0.124)
		colorDistMagn   0.958711
		colorDistFreq   0.0165788
		detailScale     168.004
		colorConversion true
		snowLevel       2
		tropicLatitude  0.486904
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.600319
		terraceProb     0.38378
		erosion         0
		montesMagn      0.610003
		montesFreq      3.00737
		montesSpiky     0.992729
		montesFraction  0.642555
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0691312
		hillsFraction   0.682601
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241872
		craterFreq      0.226845
		craterDensity   0.84419
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.463472
		volcanoTemp     1489.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.254, 0.180, 0.152, 0.000)
		colorShelf     (0.270, 0.191, 0.161, 0.000)
		colorBeach     (0.286, 0.202, 0.171, 0.000)
		colorDesert    (0.302, 0.213, 0.180, 0.000)
		colorLowland   (0.318, 0.224, 0.190, 0.000)
		colorUpland    (0.333, 0.236, 0.199, 0.000)
		colorRock      (0.349, 0.247, 0.209, 0.000)
		colorSnow      (0.365, 0.258, 0.218, 1.000)
		BumpHeight      5.53724
		BumpOffset      1.10745
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.617561
		GasToDust   0.25
		Particles   2227
		GasBright   0.0445348
		DustBright  0.23342
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.02577
		Eccentricity    0.83432
		Inclination     -0.478449
		AscendingNode   14.0922
		ArgOfPericenter 10.9628
		MeanAnomaly     -78.5157
	}
}

Comet	"Ord Mantell C7"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            6.28065e-007
	Radius          106.816
	InertiaMoment   0.397197

	Oblateness      0.0380462

	RotationPeriod  21.9565
	Obliquity       342.807
	EqAscendNode    328.477
	Precession      0

	AbsMagn         9.2996
	SlopeParam      3.8482
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.750 0.653 0.607)

	Surface
	{
		SurfStyle       0.178311
		OceanStyle      0.710078
		Randomize      (0.083, -0.772, 0.585)
		colorDistMagn   0.854274
		colorDistFreq   4.63189
		detailScale     2916.79
		colorConversion true
		snowLevel       2
		tropicLatitude  0.811141
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.654295
		terraceProb     0.55546
		erosion         0
		montesMagn      0.595212
		montesFreq      2.90154
		montesSpiky     0.900869
		montesFraction  0.338349
		dunesFraction   0
		hillsMagn       0
		hillsFreq       24.0402
		hillsFraction   0.793366
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.19289
		craterFreq      0.379221
		craterDensity   0.949043
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.55538
		volcanoTemp     1557.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.300, 0.261, 0.243, 0.000)
		colorShelf     (0.319, 0.278, 0.258, 0.000)
		colorBeach     (0.337, 0.294, 0.273, 0.000)
		colorDesert    (0.356, 0.310, 0.289, 0.000)
		colorLowland   (0.375, 0.327, 0.304, 0.000)
		colorUpland    (0.394, 0.343, 0.319, 0.000)
		colorRock      (0.412, 0.359, 0.334, 0.000)
		colorSnow      (0.431, 0.376, 0.349, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.167179
		DustBright  0.595262
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.05148
		Eccentricity    0.747093
		Inclination     -108.634
		AscendingNode   3.38016
		ArgOfPericenter 8.65495
		MeanAnomaly     -19.4664
	}
}

Comet	"Ord Mantell C8"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            1.93386e-014
	Radius          0.381096
	InertiaMoment   0.399348

	Oblateness      0.0713755

	RotationPeriod  19.5471
	Obliquity       296.013
	EqAscendNode    313.054
	Precession      0

	AbsMagn         5.78204
	SlopeParam      4.41313
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.546 0.475 0.420)

	Surface
	{
		SurfStyle       0.551153
		OceanStyle      0.793867
		Randomize      (0.324, 0.257, 0.930)
		colorDistMagn   0.900064
		colorDistFreq   4.89148e-005
		detailScale     10.4065
		colorConversion true
		snowLevel       2
		tropicLatitude  0.891127
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.399591
		terraceProb     0.397972
		erosion         0
		montesMagn      0.664662
		montesFreq      3.3915
		montesSpiky     0.829422
		montesFraction  0.150819
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000391926
		hillsFraction   0.613696
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231267
		craterFreq      0.207402
		craterDensity   0.801417
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.503638
		volcanoTemp     1497.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.213, 0.161, 0.118, 0.000)
		colorShelf     (0.219, 0.166, 0.134, 0.000)
		colorBeach     (0.257, 0.195, 0.160, 0.000)
		colorDesert    (0.279, 0.209, 0.155, 0.000)
		colorLowland   (0.306, 0.223, 0.176, 0.000)
		colorUpland    (0.339, 0.271, 0.214, 0.000)
		colorRock      (0.366, 0.294, 0.231, 0.000)
		colorSnow      (0.399, 0.313, 0.244, 1.000)
		BumpHeight      0.342986
		BumpOffset      0.0685973
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.169195
		GasToDust   0.25
		Particles   1321
		GasBright   0.124386
		DustBright  0.322542
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.09419
		Eccentricity    0.768662
		Inclination     -54.953
		AscendingNode   -16.4589
		ArgOfPericenter -174.797
		MeanAnomaly     -4.42258
	}
}

Comet	"Ord Mantell C9"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            1.4957e-010
	Radius          6.56058
	InertiaMoment   0.398044

	Oblateness      0.0619225

	RotationPeriod  17.0029
	Obliquity       249.218
	EqAscendNode    297.631
	Precession      0

	AbsMagn         14.3682
	SlopeParam      5.01389
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.668 0.664 0.658)

	Surface
	{
		SurfStyle       0.586854
		OceanStyle      0.920113
		Randomize      (0.227, 0.564, -0.254)
		colorDistMagn   0.953425
		colorDistFreq   0.0293626
		detailScale     179.148
		colorConversion true
		snowLevel       2
		tropicLatitude  0.327317
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.553889
		terraceProb     0.378195
		erosion         0
		montesMagn      0.536753
		montesFreq      2.85438
		montesSpiky     0.936725
		montesFraction  0.370151
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0952467
		hillsFraction   0.636516
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241386
		craterFreq      0.200339
		craterDensity   0.891517
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.590618
		volcanoTemp     1354.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.261, 0.226, 0.184, 0.000)
		colorShelf     (0.267, 0.232, 0.211, 0.000)
		colorBeach     (0.314, 0.272, 0.250, 0.000)
		colorDesert    (0.341, 0.292, 0.244, 0.000)
		colorLowland   (0.374, 0.312, 0.277, 0.000)
		colorUpland    (0.414, 0.378, 0.336, 0.000)
		colorRock      (0.448, 0.412, 0.362, 0.000)
		colorSnow      (0.488, 0.438, 0.382, 1.000)
		BumpHeight      5.90452
		BumpOffset      1.1809
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.650387
		GasToDust   0.25
		Particles   2293
		GasBright   0.314221
		DustBright  0.617194
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.09435
		Eccentricity    0.803275
		Inclination     -129.345
		AscendingNode   -174.729
		ArgOfPericenter -64.2553
		MeanAnomaly     85.0762
	}
}

Comet	"Ord Mantell C10"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            4.60536e-018
	Radius          0.0236057
	InertiaMoment   0.399778

	Oblateness      0.133427

	RotationPeriod  14.2936
	Obliquity       202.424
	EqAscendNode    282.209
	Precession      0

	AbsMagn         9.08149
	SlopeParam      5.72635
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.688 0.657 0.607)

	Surface
	{
		SurfStyle       0.00563228
		OceanStyle      0.300966
		Randomize      (0.997, 0.388, -0.033)
		colorDistMagn   0.51972
		colorDistFreq   3.03793e-007
		detailScale     0.644594
		colorConversion true
		snowLevel       2
		tropicLatitude  0.627863
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.4987
		terraceProb     0.142188
		erosion         0
		montesMagn      0.369821
		montesFreq      2.71512
		montesSpiky     0.89536
		montesFraction  0.534054
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.39083e-006
		hillsFraction   0.712996
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237173
		craterFreq      0.178179
		craterDensity   0.867361
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.597169
		volcanoTemp     1639.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.275, 0.263, 0.243, 0.000)
		colorShelf     (0.293, 0.279, 0.258, 0.000)
		colorBeach     (0.310, 0.295, 0.273, 0.000)
		colorDesert    (0.327, 0.312, 0.288, 0.000)
		colorLowland   (0.344, 0.328, 0.303, 0.000)
		colorUpland    (0.361, 0.345, 0.318, 0.000)
		colorRock      (0.379, 0.361, 0.334, 0.000)
		colorSnow      (0.396, 0.377, 0.349, 1.000)
		BumpHeight      0.0212452
		BumpOffset      0.00424903
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.244146
		DustBright  0.371756
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00379
		Eccentricity    0.860258
		Inclination     -127.805
		AscendingNode   -134.621
		ArgOfPericenter 22.9336
		MeanAnomaly     -10.2235
	}
}

Comet	"Ord Mantell C11"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            3.56192e-014
	Radius          0.398551
	InertiaMoment   0.398636

	Oblateness      0.13046

	RotationPeriod  11.3784
	Obliquity       155.63
	EqAscendNode    266.786
	Precession      0

	AbsMagn         5.53438
	SlopeParam      6.78423
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.785 0.783 0.781)

	Surface
	{
		SurfStyle       0.945904
		OceanStyle      0.090445
		Randomize      (0.465, -0.792, 0.283)
		colorDistMagn   0.346744
		colorDistFreq   9.17161e-005
		detailScale     10.8831
		colorConversion true
		snowLevel       2
		tropicLatitude  0.630236
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.688356
		terraceProb     0.119061
		erosion         0
		montesMagn      0.577523
		montesFreq      2.50043
		montesSpiky     0.908776
		montesFraction  0.346946
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000422743
		hillsFraction   0.541964
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226234
		craterFreq      0.180558
		craterDensity   0.918633
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.450085
		volcanoTemp     1767.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.267, 0.274, 0.313, 0.050)
		colorShelf     (0.314, 0.321, 0.359, 0.040)
		colorBeach     (0.361, 0.368, 0.406, 0.030)
		colorDesert    (0.408, 0.415, 0.461, 0.020)
		colorLowland   (0.455, 0.462, 0.508, 0.030)
		colorUpland    (0.502, 0.509, 0.555, 0.050)
		colorRock      (0.549, 0.556, 0.617, 0.020)
		colorSnow      (0.549, 0.556, 0.617, 1.000)
		BumpHeight      0.358696
		BumpOffset      0.0717392
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.202021
		GasToDust   0.25
		Particles   1387
		GasBright   0.136812
		DustBright  0.163576
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.04795
		Eccentricity    0.757092
		Inclination     63.3121
		AscendingNode   4.96359
		ArgOfPericenter 111.977
		MeanAnomaly     -87.9998
	}
}

Comet	"Ord Mantell C12"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            2.75489e-010
	Radius          9.22577
	InertiaMoment   0.396482

	Oblateness      0.249

	RotationPeriod  8.20087
	Obliquity       108.835
	EqAscendNode    251.364
	Precession      0

	AbsMagn         13.7162
	SlopeParam      2.23526
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.685 0.681 0.679)

	Surface
	{
		SurfStyle       0.581829
		OceanStyle      0.764018
		Randomize      (0.062, -0.061, 0.900)
		colorDistMagn   0.796001
		colorDistFreq   0.0204877
		detailScale     251.925
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999732
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.50823
		terraceProb     0.326254
		erosion         0
		montesMagn      0.436143
		montesFreq      1.47673
		montesSpiky     0.906262
		montesFraction  0.395617
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.197461
		hillsFraction   0.776935
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.28362
		craterFreq      0.184582
		craterDensity   0.905763
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.587657
		volcanoTemp     1466.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.267, 0.232, 0.190, 0.000)
		colorShelf     (0.274, 0.238, 0.217, 0.000)
		colorBeach     (0.322, 0.279, 0.258, 0.000)
		colorDesert    (0.349, 0.300, 0.251, 0.000)
		colorLowland   (0.384, 0.320, 0.285, 0.000)
		colorUpland    (0.425, 0.388, 0.346, 0.000)
		colorRock      (0.459, 0.422, 0.373, 0.000)
		colorSnow      (0.500, 0.450, 0.394, 1.000)
		BumpHeight      8.30319
		BumpOffset      1.66064
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.683213
		GasToDust   0.25
		Particles   2360
		GasBright   0.0113765
		DustBright  0.773498
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.08909
		Eccentricity    0.838992
		Inclination     26.8025
		AscendingNode   136.845
		ArgOfPericenter 86.0303
		MeanAnomaly     -80.4956
	}
}

Comet	"Ord Mantell C13"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            8.48251e-018
	Radius          0.0371346
	InertiaMoment   0.399126

	Oblateness      0.249

	RotationPeriod  4.67859
	Obliquity       62.041
	EqAscendNode    235.941
	Precession      0

	AbsMagn         8.86656
	SlopeParam      2.95617
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.691 0.550 0.467)

	Surface
	{
		SurfStyle       0.504973
		OceanStyle      0.970627
		Randomize      (0.625, 0.789, -0.643)
		colorDistMagn   0.444614
		colorDistFreq   6.4509e-007
		detailScale     1.01402
		colorConversion true
		snowLevel       2
		tropicLatitude  0.941956
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.406217
		terraceProb     0.554445
		erosion         0
		montesMagn      0.526067
		montesFreq      2.39835
		montesSpiky     0.903944
		montesFraction  0.0997229
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.27723e-006
		hillsFraction   0.659606
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251295
		craterFreq      0.140381
		craterDensity   1.03952
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53187
		volcanoTemp     1234.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.269, 0.187, 0.131, 0.000)
		colorShelf     (0.276, 0.193, 0.149, 0.000)
		colorBeach     (0.325, 0.226, 0.177, 0.000)
		colorDesert    (0.352, 0.242, 0.173, 0.000)
		colorLowland   (0.387, 0.259, 0.196, 0.000)
		colorUpland    (0.428, 0.314, 0.238, 0.000)
		colorRock      (0.463, 0.341, 0.257, 0.000)
		colorSnow      (0.504, 0.363, 0.271, 1.000)
		BumpHeight      0.0334211
		BumpOffset      0.00668422
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0345168
		DustBright  0.434844
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.06029
		Eccentricity    0.840519
		Inclination     53.5447
		AscendingNode   -94.6143
		ArgOfPericenter 62.5672
		MeanAnomaly     -77.9631
	}
}

Comet	"Ord Mantell C14"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            6.56061e-014
	Radius          0.571462
	InertiaMoment   0.397678

	Oblateness      0.00149376

	RotationPeriod  134.284
	Obliquity       15.2467
	EqAscendNode    220.518
	Precession      0

	AbsMagn         5.27688
	SlopeParam      3.56003
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.684 0.678 0.676)

	Surface
	{
		SurfStyle       0.837213
		OceanStyle      0.908771
		Randomize      (0.130, -0.120, 0.170)
		colorDistMagn   0.467311
		colorDistFreq   5.36458e-006
		detailScale     15.6047
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998249
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.488771
		terraceProb     0.298631
		erosion         0
		montesMagn      0.546697
		montesFreq      3.72478
		montesSpiky     0.940162
		montesFraction  0.388069
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00106503
		hillsFraction   0.535854
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259028
		craterFreq      0.232889
		craterDensity   0.913668
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.553768
		volcanoTemp     1732.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.267, 0.231, 0.189, 0.000)
		colorShelf     (0.274, 0.237, 0.216, 0.000)
		colorBeach     (0.321, 0.278, 0.257, 0.000)
		colorDesert    (0.349, 0.299, 0.250, 0.000)
		colorLowland   (0.383, 0.319, 0.284, 0.000)
		colorUpland    (0.424, 0.387, 0.345, 0.000)
		colorRock      (0.458, 0.421, 0.372, 0.000)
		colorSnow      (0.499, 0.448, 0.392, 1.000)
		BumpHeight      0.514316
		BumpOffset      0.102863
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.234847
		GasToDust   0.25
		Particles   1454
		GasBright   0.126466
		DustBright  0.827382
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.06062
		Eccentricity    0.841921
		Inclination     -73.5346
		AscendingNode   -148.189
		ArgOfPericenter -118.65
		MeanAnomaly     158.712
	}
}

Comet	"Ord Mantell C15"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            5.07416e-010
	Radius          14.0627
	InertiaMoment   0.399568

	Oblateness      0.00384319

	RotationPeriod  116.62
	Obliquity       328.452
	EqAscendNode    205.096
	Precession      0

	AbsMagn         13.1883
	SlopeParam      4.1255
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.528 0.521 0.515)

	Surface
	{
		SurfStyle       0.965694
		OceanStyle      0.0499661
		Randomize      (0.929, 0.938, 0.031)
		colorDistMagn   0.40863
		colorDistFreq   0.0924179
		detailScale     384.006
		colorConversion true
		snowLevel       2
		tropicLatitude  0.278806
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.758906
		terraceProb     0.108248
		erosion         0
		montesMagn      0.377452
		montesFreq      4.09115
		montesSpiky     0.961559
		montesFraction  0.560866
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.519688
		hillsFraction   0.692039
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225551
		craterFreq      0.210906
		craterDensity   0.818826
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.466207
		volcanoTemp     1535.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.180, 0.182, 0.206, 0.050)
		colorShelf     (0.211, 0.213, 0.237, 0.040)
		colorBeach     (0.243, 0.245, 0.268, 0.030)
		colorDesert    (0.275, 0.276, 0.304, 0.020)
		colorLowland   (0.306, 0.307, 0.335, 0.030)
		colorUpland    (0.338, 0.338, 0.366, 0.050)
		colorRock      (0.370, 0.370, 0.407, 0.020)
		colorSnow      (0.370, 0.370, 0.407, 1.000)
		BumpHeight      12.6564
		BumpOffset      2.53129
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.716039
		GasToDust   0.25
		Particles   2426
		GasBright   0.122324
		DustBright  0.51601
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.03131
		Eccentricity    0.834142
		Inclination     -154.829
		AscendingNode   -31.8305
		ArgOfPericenter 4.6279
		MeanAnomaly     64.3287
	}
}

Comet	"Ord Mantell C16"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            1.56237e-017
	Radius          0.0353975
	InertiaMoment   0.398361

	Oblateness      0.00231946

	RotationPeriod  107.792
	Obliquity       281.658
	EqAscendNode    189.673
	Precession      0

	AbsMagn         8.65409
	SlopeParam      4.70141
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.644 0.642 0.637)

	Surface
	{
		SurfStyle       0.506826
		OceanStyle      0.958209
		Randomize      (-0.758, 0.172, -0.287)
		colorDistMagn   0.869822
		colorDistFreq   6.86174e-007
		detailScale     0.966589
		colorConversion true
		snowLevel       2
		tropicLatitude  0.785179
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.404834
		terraceProb     0.46469
		erosion         0
		montesMagn      0.591083
		montesFreq      2.52707
		montesSpiky     0.953192
		montesFraction  0.61446
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.75447e-006
		hillsFraction   0.739554
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237002
		craterFreq      0.238807
		craterDensity   1.00948
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.454505
		volcanoTemp     1873.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.251, 0.218, 0.178, 0.000)
		colorShelf     (0.258, 0.225, 0.204, 0.000)
		colorBeach     (0.303, 0.263, 0.242, 0.000)
		colorDesert    (0.329, 0.282, 0.236, 0.000)
		colorLowland   (0.361, 0.302, 0.267, 0.000)
		colorUpland    (0.400, 0.366, 0.325, 0.000)
		colorRock      (0.432, 0.398, 0.350, 0.000)
		colorSnow      (0.470, 0.424, 0.369, 1.000)
		BumpHeight      0.0318578
		BumpOffset      0.00637156
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0809233
		DustBright  0.241897
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.05885
		Eccentricity    0.725264
		Inclination     -103.131
		AscendingNode   53.0471
		ArgOfPericenter 100.186
		MeanAnomaly     -47.233
	}
}

Comet	"Ord Mantell C17"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            1.20838e-013
	Radius          0.855456
	InertiaMoment   0.39999

	Oblateness      0.00479787

	RotationPeriod  101.557
	Obliquity       234.864
	EqAscendNode    174.251
	Precession      0

	AbsMagn         5.00756
	SlopeParam      5.34377
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.475 0.467 0.462)

	Surface
	{
		SurfStyle       0.891596
		OceanStyle      0.0984899
		Randomize      (-0.382, -0.682, -0.380)
		colorDistMagn   0.71304
		colorDistFreq   0.000182339
		detailScale     23.3597
		colorConversion true
		snowLevel       2
		tropicLatitude  0.971388
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.581771
		terraceProb     0.539269
		erosion         0
		montesMagn      0.574874
		montesFreq      2.26733
		montesSpiky     0.905898
		montesFraction  0.6254
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00132284
		hillsFraction   0.655826
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230142
		craterFreq      0.203666
		craterDensity   0.88727
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.42534
		volcanoTemp     1261.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.162, 0.164, 0.185, 0.050)
		colorShelf     (0.190, 0.192, 0.212, 0.040)
		colorBeach     (0.219, 0.220, 0.240, 0.030)
		colorDesert    (0.247, 0.248, 0.272, 0.020)
		colorLowland   (0.276, 0.276, 0.300, 0.030)
		colorUpland    (0.304, 0.304, 0.328, 0.050)
		colorRock      (0.333, 0.332, 0.365, 0.020)
		colorSnow      (0.333, 0.332, 0.365, 1.000)
		BumpHeight      0.769911
		BumpOffset      0.153982
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.267673
		GasToDust   0.25
		Particles   1520
		GasBright   0.25004
		DustBright  0.557267
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.08071
		Eccentricity    0.7982
		Inclination     -30.8003
		AscendingNode   -127.834
		ArgOfPericenter -52.1282
		MeanAnomaly     -34.4309
	}
}

Comet	"Ord Mantell C18"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            9.34597e-010
	Radius          13.8344
	InertiaMoment   0.398892

	Oblateness      0.00288737

	RotationPeriod  96.6099
	Obliquity       188.07
	EqAscendNode    158.828
	Precession      0

	AbsMagn         12.7379
	SlopeParam      6.17189
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.513 0.504 0.500)

	Surface
	{
		SurfStyle       0.980092
		OceanStyle      0.0801832
		Randomize      (0.154, 0.583, 0.257)
		colorDistMagn   0.541076
		colorDistFreq   0.109779
		detailScale     377.77
		colorConversion true
		snowLevel       2
		tropicLatitude  0.943069
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.63049
		terraceProb     0.721905
		erosion         0
		montesMagn      0.268257
		montesFreq      3.52809
		montesSpiky     0.951231
		montesFraction  0.538153
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.350297
		hillsFraction   0.716165
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230996
		craterFreq      0.236121
		craterDensity   1.07419
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.465604
		volcanoTemp     1468.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.175, 0.176, 0.200, 0.050)
		colorShelf     (0.205, 0.207, 0.230, 0.040)
		colorBeach     (0.236, 0.237, 0.260, 0.030)
		colorDesert    (0.267, 0.267, 0.295, 0.020)
		colorLowland   (0.298, 0.297, 0.325, 0.030)
		colorUpland    (0.329, 0.327, 0.355, 0.050)
		colorRock      (0.359, 0.358, 0.395, 0.020)
		colorSnow      (0.359, 0.358, 0.395, 1.000)
		BumpHeight      12.4509
		BumpOffset      2.49018
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.748865
		GasToDust   0.25
		Particles   2492
		GasBright   0.181357
		DustBright  0.310437
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.07046
		Eccentricity    0.941819
		Inclination     -69.3861
		AscendingNode   96.989
		ArgOfPericenter -159.779
		MeanAnomaly     -176.151
	}
}

Comet	"Ord Mantell C19"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            2.87769e-017
	Radius          0.0523228
	InertiaMoment   0.397211

	Oblateness      0.00550619

	RotationPeriod  92.4411
	Obliquity       141.275
	EqAscendNode    143.405
	Precession      0

	AbsMagn         8.44346
	SlopeParam      7.86414
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.769 0.767 0.766)

	Surface
	{
		SurfStyle       0.605021
		OceanStyle      0.157877
		Randomize      (-0.900, 0.619, 0.406)
		colorDistMagn   0.75398
		colorDistFreq   1.63027e-006
		detailScale     1.42876
		colorConversion true
		snowLevel       2
		tropicLatitude  0.685194
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.552007
		terraceProb     0.644959
		erosion         0
		montesMagn      0.518532
		montesFreq      2.91142
		montesSpiky     0.796176
		montesFraction  0.456376
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.29495e-006
		hillsFraction   0.633901
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222975
		craterFreq      0.218279
		craterDensity   0.856471
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.574358
		volcanoTemp     1510.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.300, 0.261, 0.215, 0.000)
		colorShelf     (0.308, 0.269, 0.245, 0.000)
		colorBeach     (0.361, 0.315, 0.291, 0.000)
		colorDesert    (0.392, 0.338, 0.284, 0.000)
		colorLowland   (0.431, 0.361, 0.322, 0.000)
		colorUpland    (0.477, 0.437, 0.391, 0.000)
		colorRock      (0.515, 0.476, 0.422, 0.000)
		colorSnow      (0.561, 0.506, 0.445, 1.000)
		BumpHeight      0.0470905
		BumpOffset      0.0094181
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.417664
		DustBright  0.558617
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.09436
		Eccentricity    0.761318
		Inclination     -6.09301
		AscendingNode   44.4608
		ArgOfPericenter -102.185
		MeanAnomaly     131.643
	}
}

Comet	"Ord Mantell C20"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            2.22569e-013
	Radius          0.85693
	InertiaMoment   0.399354

	Oblateness      0.00341689

	RotationPeriod  88.7959
	Obliquity       94.4809
	EqAscendNode    127.983
	Precession      0

	AbsMagn         4.72394
	SlopeParam      2.61337
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.591 0.588 0.586)

	Surface
	{
		SurfStyle       0.626528
		OceanStyle      0.144087
		Randomize      (-0.624, -0.305, 0.768)
		colorDistMagn   0.436742
		colorDistFreq   0.000520056
		detailScale     23.3999
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998762
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.393865
		terraceProb     0.34681
		erosion         0
		montesMagn      0.404332
		montesFreq      3.04688
		montesSpiky     0.912913
		montesFraction  0.524178
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0020346
		hillsFraction   0.672635
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221632
		craterFreq      0.25178
		craterDensity   0.921166
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.520144
		volcanoTemp     1182.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.230, 0.200, 0.164, 0.000)
		colorShelf     (0.236, 0.206, 0.187, 0.000)
		colorBeach     (0.278, 0.241, 0.223, 0.000)
		colorDesert    (0.301, 0.259, 0.217, 0.000)
		colorLowland   (0.331, 0.277, 0.246, 0.000)
		colorUpland    (0.366, 0.335, 0.299, 0.000)
		colorRock      (0.396, 0.365, 0.322, 0.000)
		colorSnow      (0.431, 0.388, 0.340, 1.000)
		BumpHeight      0.771237
		BumpOffset      0.154247
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.300499
		GasToDust   0.25
		Particles   1586
		GasBright   0.321699
		DustBright  0.339068
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00976
		Eccentricity    0.899602
		Inclination     -171.453
		AscendingNode   -148.998
		ArgOfPericenter -30.0197
		MeanAnomaly     -51.1648
	}
}

Comet	"Ord Mantell C21"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            1.72141e-009
	Radius          20.2522
	InertiaMoment   0.398052

	Oblateness      0.00625532

	RotationPeriod  85.5269
	Obliquity       47.6867
	EqAscendNode    112.56
	Precession      0

	AbsMagn         12.3407
	SlopeParam      3.26237
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.745 0.616 0.529)

	Surface
	{
		SurfStyle       0.28223
		OceanStyle      0.413626
		Randomize      (0.383, 0.531, 0.391)
		colorDistMagn   0.5438
		colorDistFreq   0.340484
		detailScale     553.019
		colorConversion true
		snowLevel       2
		tropicLatitude  0.621994
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.411553
		terraceProb     0.365653
		erosion         0
		montesMagn      0.546858
		montesFreq      3.14828
		montesSpiky     0.997017
		montesFraction  0.524485
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.13418
		hillsFraction   0.721956
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239764
		craterFreq      0.20517
		craterDensity   0.748129
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.513422
		volcanoTemp     1495.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.298, 0.247, 0.212, 0.000)
		colorShelf     (0.317, 0.262, 0.225, 0.000)
		colorBeach     (0.335, 0.277, 0.238, 0.000)
		colorDesert    (0.354, 0.293, 0.251, 0.000)
		colorLowland   (0.372, 0.308, 0.265, 0.000)
		colorUpland    (0.391, 0.324, 0.278, 0.000)
		colorRock      (0.410, 0.339, 0.291, 0.000)
		colorSnow      (0.428, 0.354, 0.304, 1.000)
		BumpHeight      18.227
		BumpOffset      3.64539
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.781691
		GasToDust   0.25
		Particles   2558
		GasBright   0.0158478
		DustBright  0.329406
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.09065
		Eccentricity    0.857686
		Inclination     117.416
		AscendingNode   43.8908
		ArgOfPericenter 81.4784
		MeanAnomaly     -158.23
	}
}

Comet	"Ord Mantell C22"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            5.30035e-017
	Radius          0.0530802
	InertiaMoment   0.399783

	Oblateness      0.0039527

	RotationPeriod  82.5413
	Obliquity       0.892357
	EqAscendNode    97.1377
	Precession      0

	AbsMagn         8.23405
	SlopeParam      3.84046
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.500 0.496 0.494)

	Surface
	{
		SurfStyle       0.202402
		OceanStyle      0.240781
		Randomize      (0.686, 0.794, 0.978)
		colorDistMagn   0.916078
		colorDistFreq   2.27415e-006
		detailScale     1.44944
		colorConversion true
		snowLevel       2
		tropicLatitude  0.992041
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.466441
		terraceProb     0.16059
		erosion         0
		montesMagn      0.546113
		montesFreq      2.97115
		montesSpiky     0.900044
		montesFraction  0.337053
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.69343e-006
		hillsFraction   0.518499
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233802
		craterFreq      0.264917
		craterDensity   1.00924
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.562015
		volcanoTemp     1382.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.200, 0.198, 0.198, 0.000)
		colorShelf     (0.212, 0.211, 0.210, 0.000)
		colorBeach     (0.225, 0.223, 0.222, 0.000)
		colorDesert    (0.237, 0.236, 0.235, 0.000)
		colorLowland   (0.250, 0.248, 0.247, 0.000)
		colorUpland    (0.262, 0.260, 0.259, 0.000)
		colorRock      (0.275, 0.273, 0.272, 0.000)
		colorSnow      (0.287, 0.285, 0.284, 1.000)
		BumpHeight      0.0477722
		BumpOffset      0.00955444
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0870789
		DustBright  0.742661
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.08137
		Eccentricity    0.863903
		Inclination     -96.4132
		AscendingNode   -156.852
		ArgOfPericenter 35.7835
		MeanAnomaly     -90.3062
	}
}

Comet	"Ord Mantell C23"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            4.09944e-013
	Radius          1.24469
	InertiaMoment   0.398642

	Oblateness      0.00702428

	RotationPeriod  79.7761
	Obliquity       314.098
	EqAscendNode    81.7151
	Precession      0

	AbsMagn         4.4228
	SlopeParam      4.40525
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.413 0.409 0.406)

	Surface
	{
		SurfStyle       0.236095
		OceanStyle      0.497911
		Randomize      (0.789, -0.600, -0.616)
		colorDistMagn   0.712047
		colorDistFreq   0.000873193
		detailScale     33.9884
		colorConversion true
		snowLevel       2
		tropicLatitude  0.911346
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.704074
		terraceProb     0.285622
		erosion         0
		montesMagn      0.447571
		montesFreq      3.15902
		montesSpiky     0.902607
		montesFraction  0.499522
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00345885
		hillsFraction   0.741619
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260522
		craterFreq      0.200013
		craterDensity   0.779758
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.513175
		volcanoTemp     1431
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.165, 0.164, 0.163, 0.000)
		colorShelf     (0.175, 0.174, 0.173, 0.000)
		colorBeach     (0.186, 0.184, 0.183, 0.000)
		colorDesert    (0.196, 0.194, 0.193, 0.000)
		colorLowland   (0.206, 0.205, 0.203, 0.000)
		colorUpland    (0.217, 0.215, 0.213, 0.000)
		colorRock      (0.227, 0.225, 0.223, 0.000)
		colorSnow      (0.237, 0.235, 0.234, 1.000)
		BumpHeight      1.12022
		BumpOffset      0.224045
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.333325
		GasToDust   0.25
		Particles   1653
		GasBright   0.0843293
		DustBright  0.429898
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00833
		Eccentricity    0.877139
		Inclination     82.7723
		AscendingNode   -62.9416
		ArgOfPericenter 115.595
		MeanAnomaly     15.1388
	}
}

Comet	"Ord Mantell C24"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            3.17062e-009
	Radius          20.7453
	InertiaMoment   0.396506

	Oblateness      0.00445591

	RotationPeriod  77.1869
	Obliquity       267.304
	EqAscendNode    66.2925
	Precession      0

	AbsMagn         11.9823
	SlopeParam      5.00512
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.767 0.765 0.764)

	Surface
	{
		SurfStyle       0.469805
		OceanStyle      0.612391
		Randomize      (-0.188, 0.069, 0.289)
		colorDistMagn   0.268979
		colorDistFreq   0.232932
		detailScale     566.486
		colorConversion true
		snowLevel       2
		tropicLatitude  0.995565
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.275394
		terraceProb     0.261244
		erosion         0
		montesMagn      0.534897
		montesFreq      3.11076
		montesSpiky     0.91569
		montesFraction  0.443051
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.683134
		hillsFraction   0.673071
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252937
		craterFreq      0.254879
		craterDensity   0.851485
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.537531
		volcanoTemp     1629.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.307, 0.306, 0.306, 0.000)
		colorShelf     (0.326, 0.325, 0.325, 0.000)
		colorBeach     (0.345, 0.344, 0.344, 0.000)
		colorDesert    (0.365, 0.363, 0.363, 0.000)
		colorLowland   (0.384, 0.382, 0.382, 0.000)
		colorUpland    (0.403, 0.402, 0.401, 0.000)
		colorRock      (0.422, 0.421, 0.420, 0.000)
		colorSnow      (0.441, 0.440, 0.439, 1.000)
		BumpHeight      18.6708
		BumpOffset      3.73416
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.814517
		GasToDust   0.25
		Particles   2625
		GasBright   0.222751
		DustBright  0.775963
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.07036
		Eccentricity    0.811603
		Inclination     87.0529
		AscendingNode   84.4488
		ArgOfPericenter -128.8
		MeanAnomaly     176.374
	}
}

Comet	"Ord Mantell C25"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            9.76259e-017
	Radius          0.0765969
	InertiaMoment   0.399132

	Oblateness      0.00784583

	RotationPeriod  74.7405
	Obliquity       220.509
	EqAscendNode    50.8699
	Precession      0

	AbsMagn         8.02528
	SlopeParam      5.71518
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.715 0.709 0.706)

	Surface
	{
		SurfStyle       0.724366
		OceanStyle      0.804773
		Randomize      (-0.279, 0.413, -0.892)
		colorDistMagn   0.512559
		colorDistFreq   1.91365e-007
		detailScale     2.09161
		colorConversion true
		snowLevel       2
		tropicLatitude  0.71137
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.602699
		terraceProb     0.211929
		erosion         0
		montesMagn      0.412186
		montesFreq      2.91517
		montesSpiky     0.832442
		montesFraction  0.51429
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.65317e-005
		hillsFraction   0.597325
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.209114
		craterFreq      0.162104
		craterDensity   0.761015
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.471608
		volcanoTemp     1386.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.279, 0.241, 0.198, 0.000)
		colorShelf     (0.286, 0.248, 0.226, 0.000)
		colorBeach     (0.336, 0.291, 0.268, 0.000)
		colorDesert    (0.364, 0.312, 0.261, 0.000)
		colorLowland   (0.400, 0.333, 0.296, 0.000)
		colorUpland    (0.443, 0.404, 0.360, 0.000)
		colorRock      (0.479, 0.440, 0.388, 0.000)
		colorSnow      (0.522, 0.468, 0.409, 1.000)
		BumpHeight      0.0689372
		BumpOffset      0.0137874
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.192719
		DustBright  0.490481
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.03463
		Eccentricity    0.878867
		Inclination     95.5266
		AscendingNode   -13.1521
		ArgOfPericenter -2.69126
		MeanAnomaly     -109.944
	}
}

Comet	"Ord Mantell C26"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            7.55065e-013
	Radius          1.28501
	InertiaMoment   0.397688

	Oblateness      0.0050752

	RotationPeriod  72.4117
	Obliquity       173.715
	EqAscendNode    35.4474
	Precession      0

	AbsMagn         4.09987
	SlopeParam      6.76403
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.741 0.620 0.545)

	Surface
	{
		SurfStyle       0.223089
		OceanStyle      0.963774
		Randomize      (0.970, -0.544, -0.626)
		colorDistMagn   0.271062
		colorDistFreq   0.00055518
		detailScale     35.0895
		colorConversion true
		snowLevel       2
		tropicLatitude  0.689168
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.34285
		terraceProb     0.43149
		erosion         0
		montesMagn      0.409092
		montesFreq      2.6342
		montesSpiky     0.921918
		montesFraction  0.418466
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00564429
		hillsFraction   0.429197
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229153
		craterFreq      0.226165
		craterDensity   0.87149
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.513758
		volcanoTemp     1953.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.297, 0.248, 0.218, 0.000)
		colorShelf     (0.315, 0.264, 0.232, 0.000)
		colorBeach     (0.334, 0.279, 0.245, 0.000)
		colorDesert    (0.352, 0.295, 0.259, 0.000)
		colorLowland   (0.371, 0.310, 0.272, 0.000)
		colorUpland    (0.389, 0.326, 0.286, 0.000)
		colorRock      (0.408, 0.341, 0.300, 0.000)
		colorSnow      (0.426, 0.357, 0.313, 1.000)
		BumpHeight      1.15651
		BumpOffset      0.231303
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.366151
		GasToDust   0.25
		Particles   1719
		GasBright   0.125428
		DustBright  0.242258
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.09434
		Eccentricity    0.885857
		Inclination     -42.506
		AscendingNode   83.6548
		ArgOfPericenter 148.999
		MeanAnomaly     -77.8036
	}
}

Comet	"Ord Mantell C27"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            5.83989e-009
	Radius          29.7691
	InertiaMoment   0.399574

	Oblateness      0.00874696

	RotationPeriod  70.181
	Obliquity       126.921
	EqAscendNode    20.0248
	Precession      0

	AbsMagn         11.6533
	SlopeParam      2.22384
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.412 0.410 0.407)

	Surface
	{
		SurfStyle       0.353002
		OceanStyle      0.408112
		Randomize      (-0.279, 0.527, 0.198)
		colorDistMagn   0.809892
		colorDistFreq   0.206965
		detailScale     812.896
		colorConversion true
		snowLevel       2
		tropicLatitude  0.858307
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.640281
		terraceProb     0.179824
		erosion         0
		montesMagn      0.625557
		montesFreq      3.11294
		montesSpiky     0.985206
		montesFraction  0.623186
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.26383
		hillsFraction   0.586702
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257661
		craterFreq      0.183782
		craterDensity   1.01466
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.566503
		volcanoTemp     1632.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.165, 0.164, 0.163, 0.000)
		colorShelf     (0.175, 0.174, 0.173, 0.000)
		colorBeach     (0.185, 0.184, 0.183, 0.000)
		colorDesert    (0.196, 0.195, 0.193, 0.000)
		colorLowland   (0.206, 0.205, 0.204, 0.000)
		colorUpland    (0.216, 0.215, 0.214, 0.000)
		colorRock      (0.227, 0.225, 0.224, 0.000)
		colorSnow      (0.237, 0.235, 0.234, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.847342
		GasToDust   0.25
		Particles   2691
		GasBright   0.341017
		DustBright  0.511156
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00894
		Eccentricity    0.851818
		Inclination     143.809
		AscendingNode   93.4409
		ArgOfPericenter 37.3793
		MeanAnomaly     115.58
	}
}

Comet	"Ord Mantell C28"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            1.79814e-016
	Radius          0.0795969
	InertiaMoment   0.398369

	Oblateness      0.00575272

	RotationPeriod  68.0324
	Obliquity       80.1266
	EqAscendNode    4.60217
	Precession      0

	AbsMagn         7.81658
	SlopeParam      2.94732
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.685 0.681 0.679)

	Surface
	{
		SurfStyle       0.207655
		OceanStyle      0.397958
		Randomize      (-0.409, 0.718, -0.959)
		colorDistMagn   0.540208
		colorDistFreq   4.83597e-006
		detailScale     2.17353
		colorConversion true
		snowLevel       2
		tropicLatitude  0.938493
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.678873
		terraceProb     0.214339
		erosion         0
		montesMagn      0.48318
		montesFreq      2.96971
		montesSpiky     0.95893
		montesFraction  0.681303
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.23107e-005
		hillsFraction   0.652496
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.275958
		craterFreq      0.183897
		craterDensity   0.879594
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.602252
		volcanoTemp     1534.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.274, 0.273, 0.271, 0.000)
		colorShelf     (0.291, 0.290, 0.288, 0.000)
		colorBeach     (0.308, 0.307, 0.305, 0.000)
		colorDesert    (0.325, 0.324, 0.322, 0.000)
		colorLowland   (0.342, 0.341, 0.339, 0.000)
		colorUpland    (0.359, 0.358, 0.356, 0.000)
		colorRock      (0.377, 0.375, 0.373, 0.000)
		colorSnow      (0.394, 0.392, 0.390, 1.000)
		BumpHeight      0.0716372
		BumpOffset      0.0143274
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.246444
		DustBright  0.290216
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.03589
		Eccentricity    0.882867
		Inclination     52.0159
		AscendingNode   54.5083
		ArgOfPericenter 75.6074
		MeanAnomaly     171.744
	}
}

Comet	"Ord Mantell C29"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            1.39073e-012
	Radius          1.83498
	InertiaMoment   0.399996

	Oblateness      0.00975603

	RotationPeriod  65.9529
	Obliquity       33.3323
	EqAscendNode    349.18
	Precession      0

	AbsMagn         3.74928
	SlopeParam      3.55212
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.786 0.714 0.650)

	Surface
	{
		SurfStyle       0.0707502
		OceanStyle      0.72079
		Randomize      (0.415, -0.601, 0.088)
		colorDistMagn   0.77606
		colorDistFreq   0.00222281
		detailScale     50.1072
		colorConversion true
		snowLevel       2
		tropicLatitude  0.974343
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.472667
		terraceProb     0.203687
		erosion         0
		montesMagn      0.359055
		montesFreq      3.09141
		montesSpiky     0.924035
		montesFraction  0.427472
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00650067
		hillsFraction   0.504775
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22699
		craterFreq      0.22261
		craterDensity   0.958979
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.459093
		volcanoTemp     1329.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.314, 0.286, 0.260, 0.000)
		colorShelf     (0.334, 0.303, 0.276, 0.000)
		colorBeach     (0.354, 0.321, 0.293, 0.000)
		colorDesert    (0.373, 0.339, 0.309, 0.000)
		colorLowland   (0.393, 0.357, 0.325, 0.000)
		colorUpland    (0.413, 0.375, 0.341, 0.000)
		colorRock      (0.432, 0.393, 0.358, 0.000)
		colorSnow      (0.452, 0.410, 0.374, 1.000)
		BumpHeight      1.65148
		BumpOffset      0.330297
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.398976
		GasToDust   0.25
		Particles   1785
		GasBright   0.00403902
		DustBright  0.217107
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.05871
		Eccentricity    0.677982
		Inclination     -119.093
		AscendingNode   67.8321
		ArgOfPericenter 95.8857
		MeanAnomaly     15.6646
	}
}

Comet	"Ord Mantell C30"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            1.07563e-008
	Radius          31.1089
	InertiaMoment   0.398898

	Oblateness      0.0065142

	RotationPeriod  63.9316
	Obliquity       346.538
	EqAscendNode    333.757
	Precession      0

	AbsMagn         11.3473
	SlopeParam      4.11777
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.789 0.787 0.784)

	Surface
	{
		SurfStyle       0.495172
		OceanStyle      0.746192
		Randomize      (-0.551, -0.937, 0.131)
		colorDistMagn   0.794774
		colorDistFreq   0.419709
		detailScale     849.481
		colorConversion true
		snowLevel       2
		tropicLatitude  0.705375
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.491638
		terraceProb     0.530071
		erosion         0
		montesMagn      0.500735
		montesFreq      3.14664
		montesSpiky     0.976303
		montesFraction  0.491779
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.87868
		hillsFraction   0.871795
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243167
		craterFreq      0.242788
		craterDensity   1.00599
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.493058
		volcanoTemp     1661.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.315, 0.315, 0.314, 0.000)
		colorShelf     (0.335, 0.334, 0.333, 0.000)
		colorBeach     (0.355, 0.354, 0.353, 0.000)
		colorDesert    (0.375, 0.374, 0.372, 0.000)
		colorLowland   (0.394, 0.393, 0.392, 0.000)
		colorUpland    (0.414, 0.413, 0.412, 0.000)
		colorRock      (0.434, 0.433, 0.431, 0.000)
		colorSnow      (0.453, 0.452, 0.451, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.880168
		GasToDust   0.25
		Particles   2757
		GasBright   0.054552
		DustBright  0.651081
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.09469
		Eccentricity    0.852576
		Inclination     140.11
		AscendingNode   75.51
		ArgOfPericenter 148.057
		MeanAnomaly     41.2525
	}
}

Comet	"Ord Mantell C31"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            3.31196e-016
	Radius          0.113173
	InertiaMoment   0.397225

	Oblateness      0.0107771

	RotationPeriod  61.9594
	Obliquity       299.744
	EqAscendNode    318.334
	Precession      0

	AbsMagn         7.60738
	SlopeParam      4.69321
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.484 0.476 0.472)

	Surface
	{
		SurfStyle       0.185781
		OceanStyle      0.182548
		Randomize      (-0.848, 0.096, -0.972)
		colorDistMagn   0.590377
		colorDistFreq   9.70467e-007
		detailScale     3.09037
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999753
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.375421
		terraceProb     0.216478
		erosion         0
		montesMagn      0.558058
		montesFreq      3.48998
		montesSpiky     0.848528
		montesFraction  0.782113
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.66427e-005
		hillsFraction   0.736519
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247069
		craterFreq      0.268775
		craterDensity   0.903788
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.418183
		volcanoTemp     1430.82
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.194, 0.190, 0.189, 0.000)
		colorShelf     (0.206, 0.202, 0.201, 0.000)
		colorBeach     (0.218, 0.214, 0.213, 0.000)
		colorDesert    (0.230, 0.226, 0.224, 0.000)
		colorLowland   (0.242, 0.238, 0.236, 0.000)
		colorUpland    (0.254, 0.250, 0.248, 0.000)
		colorRock      (0.266, 0.262, 0.260, 0.000)
		colorSnow      (0.279, 0.274, 0.272, 1.000)
		BumpHeight      0.101855
		BumpOffset      0.0203711
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0531945
		DustBright  0.336925
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.06559
		Eccentricity    0.785239
		Inclination     150.347
		AscendingNode   17.8448
		ArgOfPericenter -79.5714
		MeanAnomaly     -174.199
	}
}

Comet	"Ord Mantell C32"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            2.56156e-012
	Radius          1.92697
	InertiaMoment   0.399359

	Oblateness      0.00738682

	RotationPeriod  60.0283
	Obliquity       252.949
	EqAscendNode    302.912
	Precession      0

	AbsMagn         3.36257
	SlopeParam      5.33411
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.747 0.682 0.645)

	Surface
	{
		SurfStyle       0.809995
		OceanStyle      0.661865
		Randomize      (0.217, 0.879, 0.862)
		colorDistMagn   0.615006
		colorDistFreq   0.00241968
		detailScale     52.619
		colorConversion true
		snowLevel       2
		tropicLatitude  0.989988
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.458233
		terraceProb     0.502459
		erosion         0
		montesMagn      0.462597
		montesFreq      2.91712
		montesSpiky     0.739833
		montesFraction  0.534878
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00792107
		hillsFraction   0.692514
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249065
		craterFreq      0.204411
		craterDensity   0.964463
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.501178
		volcanoTemp     1483.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.291, 0.232, 0.181, 0.000)
		colorShelf     (0.299, 0.239, 0.206, 0.000)
		colorBeach     (0.351, 0.279, 0.245, 0.000)
		colorDesert    (0.381, 0.300, 0.239, 0.000)
		colorLowland   (0.418, 0.320, 0.271, 0.000)
		colorUpland    (0.463, 0.388, 0.329, 0.000)
		colorRock      (0.500, 0.423, 0.355, 0.000)
		colorSnow      (0.545, 0.450, 0.374, 1.000)
		BumpHeight      1.73427
		BumpOffset      0.346854
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.431802
		GasToDust   0.25
		Particles   1852
		GasBright   0.170898
		DustBright  0.703708
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00048
		Eccentricity    0.847195
		Inclination     -140.02
		AscendingNode   82.1846
		ArgOfPericenter -106.557
		MeanAnomaly     111.501
	}
}

Comet	"Ord Mantell C33"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            1.98118e-008
	Radius          44.0605
	InertiaMoment   0.398061

	Oblateness      0.0121156

	RotationPeriod  58.1312
	Obliquity       206.155
	EqAscendNode    287.489
	Precession      0

	AbsMagn         11.0598
	SlopeParam      6.15802
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.787 0.785 0.783)

	Surface
	{
		SurfStyle       0.590041
		OceanStyle      0.577949
		Randomize      (-0.447, -0.179, 0.876)
		colorDistMagn   0.785293
		colorDistFreq   1.32207
		detailScale     1203.15
		colorConversion true
		snowLevel       2
		tropicLatitude  0.448332
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.427196
		terraceProb     0.379178
		erosion         0
		montesMagn      0.553356
		montesFreq      3.09978
		montesSpiky     0.853388
		montesFraction  0.597459
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.33508
		hillsFraction   0.793487
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22748
		craterFreq      0.235985
		craterDensity   0.84706
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.514171
		volcanoTemp     1385.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.307, 0.267, 0.219, 0.000)
		colorShelf     (0.315, 0.275, 0.251, 0.000)
		colorBeach     (0.370, 0.322, 0.298, 0.000)
		colorDesert    (0.401, 0.345, 0.290, 0.000)
		colorLowland   (0.441, 0.369, 0.329, 0.000)
		colorUpland    (0.488, 0.447, 0.400, 0.000)
		colorRock      (0.527, 0.486, 0.431, 0.000)
		colorSnow      (0.575, 0.518, 0.454, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.912994
		GasToDust   0.25
		Particles   2824
		GasBright   0.142258
		DustBright  0.416834
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00098
		Eccentricity    0.850239
		Inclination     33.4686
		AscendingNode   126.646
		ArgOfPericenter -133.166
		MeanAnomaly     -17.8458
	}
}

Comet	"Ord Mantell C34"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            6.10022e-016
	Radius          0.119361
	InertiaMoment   0.399788

	Oblateness      0.00840558

	RotationPeriod  56.2619
	Obliquity       159.361
	EqAscendNode    272.067
	Precession      0

	AbsMagn         7.3971
	SlopeParam      7.81542
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.797 0.756 0.713)

	Surface
	{
		SurfStyle       0.646233
		OceanStyle      0.829007
		Randomize      (-0.232, -0.840, -0.112)
		colorDistMagn   0.428229
		colorDistFreq   4.37131e-006
		detailScale     3.25936
		colorConversion true
		snowLevel       2
		tropicLatitude  0.982142
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.580671
		terraceProb     0.177582
		erosion         0
		montesMagn      0.562511
		montesFreq      2.15441
		montesSpiky     0.91887
		montesFraction  0.425054
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.40006e-005
		hillsFraction   0.736257
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233828
		craterFreq      0.15398
		craterDensity   0.759194
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.435734
		volcanoTemp     1483.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.311, 0.257, 0.200, 0.000)
		colorShelf     (0.319, 0.265, 0.228, 0.000)
		colorBeach     (0.375, 0.310, 0.271, 0.000)
		colorDesert    (0.406, 0.333, 0.264, 0.000)
		colorLowland   (0.446, 0.356, 0.299, 0.000)
		colorUpland    (0.494, 0.431, 0.363, 0.000)
		colorRock      (0.534, 0.469, 0.392, 0.000)
		colorSnow      (0.582, 0.499, 0.413, 1.000)
		BumpHeight      0.107425
		BumpOffset      0.021485
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0763597
		DustBright  0.167219
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.02638
		Eccentricity    0.882823
		Inclination     -82.6284
		AscendingNode   -28.1536
		ArgOfPericenter -49.1263
		MeanAnomaly     -26.7972
	}
}

Comet	"Ord Mantell C35"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            4.71808e-012
	Radius          2.7197
	InertiaMoment   0.398649

	Oblateness      0.0136855

	RotationPeriod  54.4145
	Obliquity       112.566
	EqAscendNode    256.644
	Precession      0

	AbsMagn         2.92684
	SlopeParam      2.60354
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.572 0.568 0.560)

	Surface
	{
		SurfStyle       0.764688
		OceanStyle      0.125576
		Randomize      (-0.334, -0.944, 0.075)
		colorDistMagn   0.749113
		colorDistFreq   0.00627903
		detailScale     74.2658
		colorConversion true
		snowLevel       2
		tropicLatitude  0.956997
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.584085
		terraceProb     0.148602
		erosion         0
		montesMagn      0.481811
		montesFreq      3.537
		montesSpiky     0.916666
		montesFraction  0.669694
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0200794
		hillsFraction   0.711899
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228842
		craterFreq      0.241185
		craterDensity   1.05973
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.489774
		volcanoTemp     1619.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.223, 0.193, 0.157, 0.000)
		colorShelf     (0.229, 0.199, 0.179, 0.000)
		colorBeach     (0.269, 0.233, 0.213, 0.000)
		colorDesert    (0.292, 0.250, 0.207, 0.000)
		colorLowland   (0.320, 0.267, 0.235, 0.000)
		colorUpland    (0.355, 0.324, 0.286, 0.000)
		colorRock      (0.383, 0.352, 0.308, 0.000)
		colorSnow      (0.418, 0.375, 0.325, 1.000)
		BumpHeight      2.44773
		BumpOffset      0.489545
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.464628
		GasToDust   0.25
		Particles   1918
		GasBright   0.27123
		DustBright  0.456835
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.09208
		Eccentricity    0.835478
		Inclination     -140.494
		AscendingNode   -176.236
		ArgOfPericenter -157.644
		MeanAnomaly     -16.7922
	}
}

Comet	"Ord Mantell C36"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            3.64908e-008
	Radius          46.65
	InertiaMoment   0.39653

	Oblateness      0.00948663

	RotationPeriod  52.5839
	Obliquity       65.7722
	EqAscendNode    241.221
	Precession      0

	AbsMagn         10.7872
	SlopeParam      3.25411
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.421 0.416 0.413)

	Surface
	{
		SurfStyle       0.836259
		OceanStyle      0.812827
		Randomize      (-0.005, 0.990, 0.907)
		colorDistMagn   0.382786
		colorDistFreq   1.40549
		detailScale     1273.86
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0240705
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.386533
		terraceProb     0.23641
		erosion         0
		montesMagn      0.523834
		montesFreq      2.54433
		montesSpiky     0.966388
		montesFraction  0.584518
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.65212
		hillsFraction   0.848571
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234271
		craterFreq      0.232958
		craterDensity   0.804049
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.376061
		volcanoTemp     1750.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.164, 0.141, 0.116, 0.000)
		colorShelf     (0.168, 0.146, 0.132, 0.000)
		colorBeach     (0.198, 0.171, 0.157, 0.000)
		colorDesert    (0.214, 0.183, 0.153, 0.000)
		colorLowland   (0.235, 0.196, 0.173, 0.000)
		colorUpland    (0.261, 0.237, 0.211, 0.000)
		colorRock      (0.282, 0.258, 0.227, 0.000)
		colorSnow      (0.307, 0.275, 0.239, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.94582
		GasToDust   0.25
		Particles   2890
		GasBright   0.17805
		DustBright  0.234503
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.02134
		Eccentricity    0.717875
		Inclination     -113.099
		AscendingNode   -179.135
		ArgOfPericenter -144.076
		MeanAnomaly     24.896
	}
}

Comet	"Ord Mantell C37"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            1.12358e-015
	Radius          0.16793
	InertiaMoment   0.399137

	Oblateness      0.0155717

	RotationPeriod  50.7652
	Obliquity       18.9779
	EqAscendNode    225.799
	Precession      0

	AbsMagn         7.18514
	SlopeParam      3.83272
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.680 0.676 0.673)

	Surface
	{
		SurfStyle       0.972975
		OceanStyle      0.808822
		Randomize      (0.366, -0.108, 0.425)
		colorDistMagn   0.420979
		colorDistFreq   1.74847e-005
		detailScale     4.5856
		colorConversion true
		snowLevel       2
		tropicLatitude  0.942174
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.610241
		terraceProb     0.223993
		erosion         0
		montesMagn      0.515995
		montesFreq      3.51251
		montesSpiky     0.876082
		montesFraction  0.202553
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.02111e-005
		hillsFraction   0.531768
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228394
		craterFreq      0.22201
		craterDensity   0.884465
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.521896
		volcanoTemp     1512.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.231, 0.237, 0.269, 0.050)
		colorShelf     (0.272, 0.277, 0.310, 0.040)
		colorBeach     (0.313, 0.318, 0.350, 0.030)
		colorDesert    (0.354, 0.358, 0.397, 0.020)
		colorLowland   (0.394, 0.399, 0.438, 0.030)
		colorUpland    (0.435, 0.439, 0.478, 0.050)
		colorRock      (0.476, 0.480, 0.532, 0.020)
		colorSnow      (0.476, 0.480, 0.532, 1.000)
		BumpHeight      0.151137
		BumpOffset      0.0302273
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0162622
		GasToDust   0.25
		Particles   1012
		GasBright   0.440111
		DustBright  0.456928
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.02635
		Eccentricity    0.953062
		Inclination     98.1639
		AscendingNode   -51.3987
		ArgOfPericenter 71.3797
		MeanAnomaly     63.9024
	}
}

Comet	"Ord Mantell C38"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            8.69009e-012
	Radius          2.88963
	InertiaMoment   0.397698

	Oblateness      0.0109719

	RotationPeriod  48.9534
	Obliquity       332.184
	EqAscendNode    210.376
	Precession      0

	AbsMagn         2.42082
	SlopeParam      4.39738
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.542 0.539 0.536)

	Surface
	{
		SurfStyle       0.0917622
		OceanStyle      0.764339
		Randomize      (0.122, 0.253, -0.360)
		colorDistMagn   0.48223
		colorDistFreq   0.00215451
		detailScale     78.9061
		colorConversion true
		snowLevel       2
		tropicLatitude  0.415042
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.613759
		terraceProb     0.455705
		erosion         0
		montesMagn      0.532969
		montesFreq      3.23716
		montesSpiky     0.790592
		montesFraction  0.44754
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0234394
		hillsFraction   0.51709
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240984
		craterFreq      0.201171
		craterDensity   0.797275
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.494096
		volcanoTemp     1503.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.217, 0.215, 0.214, 0.000)
		colorShelf     (0.230, 0.229, 0.228, 0.000)
		colorBeach     (0.244, 0.242, 0.241, 0.000)
		colorDesert    (0.258, 0.256, 0.254, 0.000)
		colorLowland   (0.271, 0.269, 0.268, 0.000)
		colorUpland    (0.285, 0.283, 0.281, 0.000)
		colorRock      (0.298, 0.296, 0.295, 0.000)
		colorSnow      (0.312, 0.310, 0.308, 1.000)
		BumpHeight      2.60066
		BumpOffset      0.520133
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.497454
		GasToDust   0.25
		Particles   1984
		GasBright   0.0288851
		DustBright  0.55264
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0548
		Eccentricity    0.793696
		Inclination     175.882
		AscendingNode   -145.57
		ArgOfPericenter 167.59
		MeanAnomaly     -36.6662
	}
}

Comet	"Ord Mantell C39"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            6.72116e-008
	Radius          65.4411
	InertiaMoment   0.399579

	Oblateness      0.0178923

	RotationPeriod  47.144
	Obliquity       285.389
	EqAscendNode    194.954
	Precession      0

	AbsMagn         10.5271
	SlopeParam      4.99638
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.685 0.681 0.677)

	Surface
	{
		SurfStyle       0.637791
		OceanStyle      0.599269
		Randomize      (-0.078, 0.644, 0.043)
		colorDistMagn   0.601246
		colorDistFreq   2.37598
		detailScale     1786.98
		colorConversion true
		snowLevel       2
		tropicLatitude  0.409205
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.34338
		terraceProb     0.139556
		erosion         0
		montesMagn      0.439137
		montesFreq      2.71694
		montesSpiky     0.922277
		montesFraction  0.629075
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.2833
		hillsFraction   0.426128
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222632
		craterFreq      0.221468
		craterDensity   0.932768
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.480762
		volcanoTemp     1515.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.267, 0.232, 0.190, 0.000)
		colorShelf     (0.274, 0.238, 0.217, 0.000)
		colorBeach     (0.322, 0.279, 0.257, 0.000)
		colorDesert    (0.349, 0.300, 0.251, 0.000)
		colorLowland   (0.383, 0.320, 0.284, 0.000)
		colorUpland    (0.425, 0.388, 0.345, 0.000)
		colorRock      (0.459, 0.422, 0.372, 0.000)
		colorSnow      (0.500, 0.450, 0.393, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.978646
		GasToDust   0.25
		Particles   2956
		GasBright   0.0289199
		DustBright  0.237092
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.04347
		Eccentricity    0.657069
		Inclination     94.6959
		AscendingNode   -13.5485
		ArgOfPericenter 83.6255
		MeanAnomaly     -77.7235
	}
}

Comet	"Ord Mantell C40"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            2.0695e-015
	Radius          0.178991
	InertiaMoment   0.398376

	Oblateness      0.0128015

	RotationPeriod  45.3325
	Obliquity       238.595
	EqAscendNode    179.531
	Precession      0

	AbsMagn         6.97087
	SlopeParam      5.70406
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.493 0.491 0.486)

	Surface
	{
		SurfStyle       0.000390478
		OceanStyle      0.19598
		Randomize      (-0.892, 0.550, -0.997)
		colorDistMagn   0.726317
		colorDistFreq   2.03609e-005
		detailScale     4.88765
		colorConversion true
		snowLevel       2
		tropicLatitude  0.209171
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.584937
		terraceProb     0.241651
		erosion         0
		montesMagn      0.512402
		montesFreq      3.0645
		montesSpiky     0.911637
		montesFraction  0.561777
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.69522e-005
		hillsFraction   0.655334
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256492
		craterFreq      0.222846
		craterDensity   0.84462
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.510439
		volcanoTemp     1577.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.197, 0.196, 0.194, 0.000)
		colorShelf     (0.210, 0.209, 0.207, 0.000)
		colorBeach     (0.222, 0.221, 0.219, 0.000)
		colorDesert    (0.234, 0.233, 0.231, 0.000)
		colorLowland   (0.247, 0.245, 0.243, 0.000)
		colorUpland    (0.259, 0.258, 0.255, 0.000)
		colorRock      (0.271, 0.270, 0.267, 0.000)
		colorSnow      (0.284, 0.282, 0.280, 1.000)
		BumpHeight      0.161092
		BumpOffset      0.0322184
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0490882
		GasToDust   0.25
		Particles   1078
		GasBright   0.125905
		DustBright  0.624594
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.06387
		Eccentricity    0.902793
		Inclination     -129.347
		AscendingNode   168.818
		ArgOfPericenter -62.2575
		MeanAnomaly     86.3754
	}
}

Comet	"Ord Mantell C41"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            1.60061e-011
	Radius          4.04273
	InertiaMoment   0.392793

	Oblateness      0.0202693

	RotationPeriod  43.5142
	Obliquity       191.801
	EqAscendNode    164.109
	Precession      0

	AbsMagn         1.80532
	SlopeParam      6.74412
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.568 0.563 0.559)

	Surface
	{
		SurfStyle       0.0621628
		OceanStyle      0.818396
		Randomize      (-0.416, 0.618, 0.389)
		colorDistMagn   0.677397
		colorDistFreq   0.00748016
		detailScale     110.394
		colorConversion true
		snowLevel       2
		tropicLatitude  0.917417
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.598217
		terraceProb     0.611024
		erosion         0
		montesMagn      0.566904
		montesFreq      3.19542
		montesSpiky     0.947056
		montesFraction  0.42278
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0281009
		hillsFraction   0.539012
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23748
		craterFreq      0.162805
		craterDensity   0.794811
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.42537
		volcanoTemp     1638.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.227, 0.225, 0.223, 0.000)
		colorShelf     (0.241, 0.239, 0.237, 0.000)
		colorBeach     (0.255, 0.253, 0.251, 0.000)
		colorDesert    (0.270, 0.267, 0.265, 0.000)
		colorLowland   (0.284, 0.282, 0.279, 0.000)
		colorUpland    (0.298, 0.296, 0.293, 0.000)
		colorRock      (0.312, 0.310, 0.307, 0.000)
		colorSnow      (0.326, 0.324, 0.321, 1.000)
		BumpHeight      3.63846
		BumpOffset      0.727692
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.53028
		GasToDust   0.25
		Particles   2051
		GasBright   0.0986577
		DustBright  0.336327
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.08972
		Eccentricity    0.88123
		Inclination     -112.516
		AscendingNode   97.0154
		ArgOfPericenter -115.149
		MeanAnomaly     -101.392
	}
}

Comet	"Ord Mantell C42"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            1.23795e-007
	Radius          69.9554
	InertiaMoment   0.398904

	Oblateness      0.01514

	RotationPeriod  41.6844
	Obliquity       145.006
	EqAscendNode    148.686
	Precession      0

	AbsMagn         10.2772
	SlopeParam      2.21236
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.743 0.739 0.737)

	Surface
	{
		SurfStyle       0.586974
		OceanStyle      0.682849
		Randomize      (-0.662, 0.377, 0.905)
		colorDistMagn   0.381791
		colorDistFreq   2.52494
		detailScale     1910.25
		colorConversion true
		snowLevel       2
		tropicLatitude  0.641577
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.592211
		terraceProb     0.207061
		erosion         0
		montesMagn      0.42806
		montesFreq      3.06833
		montesSpiky     0.893393
		montesFraction  0.635236
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.9835
		hillsFraction   0.918872
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.202032
		craterFreq      0.195698
		craterDensity   0.74818
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.489019
		volcanoTemp     1344.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.290, 0.251, 0.206, 0.000)
		colorShelf     (0.297, 0.259, 0.236, 0.000)
		colorBeach     (0.349, 0.303, 0.280, 0.000)
		colorDesert    (0.379, 0.325, 0.273, 0.000)
		colorLowland   (0.416, 0.347, 0.310, 0.000)
		colorUpland    (0.461, 0.421, 0.376, 0.000)
		colorRock      (0.498, 0.458, 0.405, 0.000)
		colorSnow      (0.543, 0.488, 0.427, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.262833
		DustBright  0.656639
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00686
		Eccentricity    0.845471
		Inclination     -174.592
		AscendingNode   -153.842
		ArgOfPericenter -36.9237
		MeanAnomaly     8.37687
	}
}

Comet	"Ord Mantell C43"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            3.81176e-015
	Radius          0.249796
	InertiaMoment   0.397238

	Oblateness      0.0243576

	RotationPeriod  39.8381
	Obliquity       98.2121
	EqAscendNode    133.263
	Precession      0

	AbsMagn         6.75359
	SlopeParam      2.93844
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.739 0.659 0.536)

	Surface
	{
		SurfStyle       0.695006
		OceanStyle      0.954621
		Randomize      (-0.357, -0.122, 0.559)
		colorDistMagn   0.90822
		colorDistFreq   3.03998e-005
		detailScale     6.82111
		colorConversion true
		snowLevel       2
		tropicLatitude  0.344975
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.605178
		terraceProb     0.46778
		erosion         0
		montesMagn      0.377771
		montesFreq      3.35709
		montesSpiky     0.930368
		montesFraction  0.868922
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000141813
		hillsFraction   0.607872
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226235
		craterFreq      0.228829
		craterDensity   1.017
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.451248
		volcanoTemp     1396.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.288, 0.224, 0.150, 0.000)
		colorShelf     (0.296, 0.230, 0.171, 0.000)
		colorBeach     (0.347, 0.270, 0.203, 0.000)
		colorDesert    (0.377, 0.290, 0.198, 0.000)
		colorLowland   (0.414, 0.309, 0.225, 0.000)
		colorUpland    (0.458, 0.375, 0.273, 0.000)
		colorRock      (0.495, 0.408, 0.295, 0.000)
		colorSnow      (0.540, 0.435, 0.311, 1.000)
		BumpHeight      0.224817
		BumpOffset      0.0449634
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0819142
		GasToDust   0.25
		Particles   1145
		GasBright   0.208304
		DustBright  0.395655
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.05506
		Eccentricity    0.90101
		Inclination     68.1139
		AscendingNode   15.4163
		ArgOfPericenter 70.0536
		MeanAnomaly     -72.9472
	}
}

Comet	"Ord Mantell C44"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            2.94812e-011
	Radius          4.33323
	InertiaMoment   0.399365

	Oblateness      0.0182419

	RotationPeriod  37.9701
	Obliquity       51.4178
	EqAscendNode    117.841
	Precession      0

	AbsMagn         0.993635
	SlopeParam      3.5442
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.466 0.458 0.456)

	Surface
	{
		SurfStyle       0.900892
		OceanStyle      0.427171
		Randomize      (-0.931, -0.022, 0.041)
		colorDistMagn   0.911915
		colorDistFreq   0.014363
		detailScale     118.326
		colorConversion true
		snowLevel       2
		tropicLatitude  0.661691
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.427149
		terraceProb     0.142148
		erosion         0
		montesMagn      0.344547
		montesFreq      3.48621
		montesSpiky     0.979858
		montesFraction  0.647168
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0379422
		hillsFraction   0.653054
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.216028
		craterFreq      0.229425
		craterDensity   0.892486
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.439184
		volcanoTemp     1671.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.158, 0.160, 0.182, 0.050)
		colorShelf     (0.186, 0.188, 0.210, 0.040)
		colorBeach     (0.214, 0.215, 0.237, 0.030)
		colorDesert    (0.242, 0.243, 0.269, 0.020)
		colorLowland   (0.270, 0.270, 0.296, 0.030)
		colorUpland    (0.298, 0.298, 0.323, 0.050)
		colorRock      (0.326, 0.325, 0.360, 0.020)
		colorSnow      (0.326, 0.325, 0.360, 1.000)
		BumpHeight      3.89991
		BumpOffset      0.779981
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.563106
		GasToDust   0.25
		Particles   2117
		GasBright   0.116515
		DustBright  0.17193
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.06035
		Eccentricity    0.919145
		Inclination     -166.479
		AscendingNode   141.697
		ArgOfPericenter -60.4319
		MeanAnomaly     -171.919
	}
}

Comet	"Ord Mantell C45"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            2.28015e-007
	Radius          97.4033
	InertiaMoment   0.398069

	Oblateness      0.0295329

	RotationPeriod  36.0746
	Obliquity       4.62352
	EqAscendNode    102.418
	Precession      0

	AbsMagn         10.0359
	SlopeParam      4.11004
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.521 0.462 0.392)

	Surface
	{
		SurfStyle       0.883644
		OceanStyle      0.363043
		Randomize      (0.870, 0.546, -0.701)
		colorDistMagn   0.349349
		colorDistFreq   4.31863
		detailScale     2659.76
		colorConversion true
		snowLevel       2
		tropicLatitude  0.653901
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.424375
		terraceProb     0.253794
		erosion         0
		montesMagn      0.663593
		montesFreq      3.01533
		montesSpiky     0.757739
		montesFraction  0.303589
		dunesFraction   0
		hillsMagn       0
		hillsFreq       21.8681
		hillsFraction   0.470411
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218333
		craterFreq      0.37696
		craterDensity   0.859137
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.517921
		volcanoTemp     1721.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.177, 0.162, 0.157, 0.050)
		colorShelf     (0.208, 0.189, 0.180, 0.040)
		colorBeach     (0.240, 0.217, 0.204, 0.030)
		colorDesert    (0.271, 0.245, 0.231, 0.020)
		colorLowland   (0.302, 0.272, 0.255, 0.030)
		colorUpland    (0.333, 0.300, 0.278, 0.050)
		colorRock      (0.365, 0.328, 0.309, 0.020)
		colorSnow      (0.365, 0.328, 0.309, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.357858
		DustBright  0.415073
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.08113
		Eccentricity    0.887611
		Inclination     43.9575
		AscendingNode   -134.285
		ArgOfPericenter 159.176
		MeanAnomaly     -140.211
	}
}

Comet	"Ord Mantell C46"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            7.02076e-015
	Radius          0.268412
	InertiaMoment   0.399794

	Oblateness      0.0225483

	RotationPeriod  34.1455
	Obliquity       317.829
	EqAscendNode    86.9956
	Precession      0

	AbsMagn         6.53258
	SlopeParam      4.68502
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.422 0.418 0.413)

	Surface
	{
		SurfStyle       0.732729
		OceanStyle      0.464452
		Randomize      (-0.381, -0.870, -0.192)
		colorDistMagn   0.294971
		colorDistFreq   2.96371e-005
		detailScale     7.32943
		colorConversion true
		snowLevel       2
		tropicLatitude  0.469971
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.711015
		terraceProb     0.241554
		erosion         0
		montesMagn      0.508684
		montesFreq      3.13085
		montesSpiky     0.990194
		montesFraction  0.709972
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000126784
		hillsFraction   0.660903
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232166
		craterFreq      0.218437
		craterDensity   1.08894
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.497952
		volcanoTemp     1487.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.165, 0.142, 0.116, 0.000)
		colorShelf     (0.169, 0.146, 0.132, 0.000)
		colorBeach     (0.198, 0.171, 0.157, 0.000)
		colorDesert    (0.215, 0.184, 0.153, 0.000)
		colorLowland   (0.236, 0.196, 0.174, 0.000)
		colorUpland    (0.262, 0.238, 0.211, 0.000)
		colorRock      (0.283, 0.259, 0.227, 0.000)
		colorSnow      (0.308, 0.276, 0.240, 1.000)
		BumpHeight      0.241571
		BumpOffset      0.0483141
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.11474
		GasToDust   0.25
		Particles   1211
		GasBright   0.0100784
		DustBright  0.44734
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.05548
		Eccentricity    0.884455
		Inclination     -38.6215
		AscendingNode   -136.436
		ArgOfPericenter -40.5733
		MeanAnomaly     149.009
	}
}

Comet	"Ord Mantell C47"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            5.43006e-011
	Radius          6.02046
	InertiaMoment   0.398655

	Oblateness      0.0368922

	RotationPeriod  32.1757
	Obliquity       271.035
	EqAscendNode    71.573
	Precession      0

	AbsMagn         -0.289631
	SlopeParam      5.32449
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.708 0.624 0.581)

	Surface
	{
		SurfStyle       0.801699
		OceanStyle      0.487182
		Randomize      (0.615, 0.287, -0.442)
		colorDistMagn   0.20409
		colorDistFreq   0.0211047
		detailScale     164.399
		colorConversion true
		snowLevel       2
		tropicLatitude  0.27308
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.52945
		terraceProb     0.2663
		erosion         0
		montesMagn      0.545146
		montesFreq      3.50358
		montesSpiky     0.891355
		montesFraction  0.494468
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0994197
		hillsFraction   0.74554
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23202
		craterFreq      0.208291
		craterDensity   0.898703
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.545698
		volcanoTemp     1561.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.276, 0.212, 0.163, 0.000)
		colorShelf     (0.283, 0.218, 0.186, 0.000)
		colorBeach     (0.333, 0.256, 0.221, 0.000)
		colorDesert    (0.361, 0.274, 0.215, 0.000)
		colorLowland   (0.396, 0.293, 0.244, 0.000)
		colorUpland    (0.439, 0.356, 0.296, 0.000)
		colorRock      (0.474, 0.387, 0.319, 0.000)
		colorSnow      (0.517, 0.412, 0.337, 1.000)
		BumpHeight      5.41841
		BumpOffset      1.08368
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.595932
		GasToDust   0.25
		Particles   2183
		GasBright   0.0763683
		DustBright  0.865536
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.03105
		Eccentricity    0.855252
		Inclination     103.247
		AscendingNode   6.92637
		ArgOfPericenter -164.692
		MeanAnomaly     83.653
	}
}

Comet	"Ord Mantell C48"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            4.19976e-007
	Radius          104.904
	InertiaMoment   0.396554

	Oblateness      0.0285003

	RotationPeriod  30.1573
	Obliquity       224.241
	EqAscendNode    56.1504
	Precession      0

	AbsMagn         9.80177
	SlopeParam      6.14426
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.696 0.693 0.691)

	Surface
	{
		SurfStyle       0.556526
		OceanStyle      0.700876
		Randomize      (0.718, 0.513, -0.207)
		colorDistMagn   0.538392
		colorDistFreq   6.80477
		detailScale     2864.58
		colorConversion true
		snowLevel       2
		tropicLatitude  0.955493
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.439969
		terraceProb     0.347014
		erosion         0
		montesMagn      0.584006
		montesFreq      3.07033
		montesSpiky     0.922194
		montesFraction  0.339686
		dunesFraction   0
		hillsMagn       0
		hillsFreq       30.774
		hillsFraction   0.711254
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242944
		craterFreq      0.433579
		craterDensity   0.993802
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.543505
		volcanoTemp     1523.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.271, 0.236, 0.194, 0.000)
		colorShelf     (0.278, 0.243, 0.221, 0.000)
		colorBeach     (0.327, 0.284, 0.263, 0.000)
		colorDesert    (0.355, 0.305, 0.256, 0.000)
		colorLowland   (0.390, 0.326, 0.290, 0.000)
		colorUpland    (0.431, 0.395, 0.353, 0.000)
		colorRock      (0.466, 0.430, 0.380, 0.000)
		colorSnow      (0.508, 0.458, 0.401, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0877723
		DustBright  0.538619
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.08
		Eccentricity    0.760874
		Inclination     -75.2958
		AscendingNode   -134.963
		ArgOfPericenter -129.453
		MeanAnomaly     -127.65
	}
}

Comet	"Ord Mantell C49"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            1.29314e-014
	Radius          0.372174
	InertiaMoment   0.399143

	Oblateness      0.0481351

	RotationPeriod  28.0812
	Obliquity       177.446
	EqAscendNode    40.7278
	Precession      0

	AbsMagn         6.30698
	SlopeParam      7.76885
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.718 0.678 0.631)

	Surface
	{
		SurfStyle       0.808328
		OceanStyle      0.117959
		Randomize      (-0.662, -0.243, -0.076)
		colorDistMagn   0.831729
		colorDistFreq   8.62578e-005
		detailScale     10.1628
		colorConversion true
		snowLevel       2
		tropicLatitude  0.991657
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.453218
		terraceProb     0.366576
		erosion         0
		montesMagn      0.45907
		montesFreq      3.44695
		montesSpiky     0.952889
		montesFraction  0.48677
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000255388
		hillsFraction   0.693167
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227626
		craterFreq      0.146143
		craterDensity   0.815376
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.501367
		volcanoTemp     1720.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.280, 0.230, 0.177, 0.000)
		colorShelf     (0.287, 0.237, 0.202, 0.000)
		colorBeach     (0.337, 0.278, 0.240, 0.000)
		colorDesert    (0.366, 0.298, 0.233, 0.000)
		colorLowland   (0.402, 0.319, 0.265, 0.000)
		colorUpland    (0.445, 0.386, 0.322, 0.000)
		colorRock      (0.481, 0.420, 0.347, 0.000)
		colorSnow      (0.524, 0.447, 0.366, 1.000)
		BumpHeight      0.334957
		BumpOffset      0.0669914
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.147566
		GasToDust   0.25
		Particles   1277
		GasBright   0.0619172
		DustBright  0.24896
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.01856
		Eccentricity    0.771865
		Inclination     82.6546
		AscendingNode   -88.4658
		ArgOfPericenter -154.613
		MeanAnomaly     -90.7156
	}
}

Comet	"Ord Mantell C50"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            1.00015e-010
	Radius          6.49803
	InertiaMoment   0.397708

	Oblateness      0.0386205

	RotationPeriod  25.9366
	Obliquity       130.652
	EqAscendNode    25.3052
	Precession      0

	AbsMagn         17.4212
	SlopeParam      2.59368
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.773 0.772 0.771)

	Surface
	{
		SurfStyle       0.701181
		OceanStyle      0.265482
		Randomize      (0.334, 0.441, -0.265)
		colorDistMagn   0.514964
		colorDistFreq   0.0203712
		detailScale     177.44
		colorConversion true
		snowLevel       2
		tropicLatitude  0.982553
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.743676
		terraceProb     0.245439
		erosion         0
		montesMagn      0.498691
		montesFreq      3.01113
		montesSpiky     0.95874
		montesFraction  0.53775
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0815565
		hillsFraction   0.650876
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260111
		craterFreq      0.157574
		craterDensity   0.998482
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.531481
		volcanoTemp     1380.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.302, 0.263, 0.216, 0.000)
		colorShelf     (0.309, 0.270, 0.247, 0.000)
		colorBeach     (0.363, 0.317, 0.293, 0.000)
		colorDesert    (0.394, 0.340, 0.285, 0.000)
		colorLowland   (0.433, 0.363, 0.324, 0.000)
		colorUpland    (0.479, 0.440, 0.393, 0.000)
		colorRock      (0.518, 0.479, 0.424, 0.000)
		colorSnow      (0.564, 0.510, 0.447, 1.000)
		BumpHeight      5.84823
		BumpOffset      1.16965
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.628758
		GasToDust   0.25
		Particles   2250
		GasBright   0.205374
		DustBright  0.58999
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.056
		Eccentricity    0.844788
		Inclination     107.389
		AscendingNode   89.3107
		ArgOfPericenter 98.4635
		MeanAnomaly     42.3524
	}
}

Comet	"Ord Mantell C51"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            7.73543e-007
	Radius          145.183
	InertiaMoment   0.399584

	Oblateness      0.0671115

	RotationPeriod  23.7107
	Obliquity       83.8577
	EqAscendNode    9.8826
	Precession      0

	AbsMagn         9.57369
	SlopeParam      3.24583
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.668 0.506 0.403)

	Surface
	{
		SurfStyle       0.194992
		OceanStyle      0.807722
		Randomize      (-0.008, -0.480, -0.814)
		colorDistMagn   0.475883
		colorDistFreq   5.56431
		detailScale     3964.47
		colorConversion true
		snowLevel       2
		tropicLatitude  0.916497
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.436288
		terraceProb     0.312656
		erosion         0
		montesMagn      0.63687
		montesFreq      2.93532
		montesSpiky     0.86123
		montesFraction  0.625373
		dunesFraction   0
		hillsMagn       0
		hillsFreq       65.5927
		hillsFraction   0.700878
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231281
		craterFreq      0.554085
		craterDensity   0.66733
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.541072
		volcanoTemp     1655.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.267, 0.202, 0.161, 0.000)
		colorShelf     (0.284, 0.215, 0.171, 0.000)
		colorBeach     (0.300, 0.228, 0.181, 0.000)
		colorDesert    (0.317, 0.240, 0.192, 0.000)
		colorLowland   (0.334, 0.253, 0.202, 0.000)
		colorUpland    (0.350, 0.265, 0.212, 0.000)
		colorRock      (0.367, 0.278, 0.222, 0.000)
		colorSnow      (0.384, 0.291, 0.232, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.152237
		DustBright  0.327614
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.03324
		Eccentricity    0.874394
		Inclination     37.3711
		AscendingNode   36.5073
		ArgOfPericenter 43.4073
		MeanAnomaly     -147.236
	}
}

Comet	"Ord Mantell C52"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            2.38179e-014
	Radius          0.402506
	InertiaMoment   0.398383

	Oblateness      0.0568259

	RotationPeriod  21.3877
	Obliquity       37.0634
	EqAscendNode    354.46
	Precession      0

	AbsMagn         6.07587
	SlopeParam      3.82497
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.549 0.381 0.300)

	Surface
	{
		SurfStyle       0.638312
		OceanStyle      0.649888
		Randomize      (-0.584, 0.667, -0.937)
		colorDistMagn   0.871805
		colorDistFreq   2.88557e-005
		detailScale     10.9911
		colorConversion true
		snowLevel       2
		tropicLatitude  0.916369
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.264861
		terraceProb     0.350464
		erosion         0
		montesMagn      0.628883
		montesFreq      3.23852
		montesSpiky     0.999535
		montesFraction  0.535748
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000371502
		hillsFraction   0.786534
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240448
		craterFreq      0.198664
		craterDensity   1.05704
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.484677
		volcanoTemp     1528.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.214, 0.130, 0.084, 0.000)
		colorShelf     (0.220, 0.133, 0.096, 0.000)
		colorBeach     (0.258, 0.156, 0.114, 0.000)
		colorDesert    (0.280, 0.168, 0.111, 0.000)
		colorLowland   (0.308, 0.179, 0.126, 0.000)
		colorUpland    (0.341, 0.217, 0.153, 0.000)
		colorRock      (0.368, 0.236, 0.165, 0.000)
		colorSnow      (0.401, 0.252, 0.174, 1.000)
		BumpHeight      0.362255
		BumpOffset      0.072451
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.180392
		GasToDust   0.25
		Particles   1344
		GasBright   0.362885
		DustBright  0.601453
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00138
		Eccentricity    0.852775
		Inclination     -97.183
		AscendingNode   -33.2431
		ArgOfPericenter -29.1977
		MeanAnomaly     64.2144
	}
}

Comet	"Ord Mantell C53"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            1.84215e-010
	Radius          8.97711
	InertiaMoment   0.393931

	Oblateness      0.102132

	RotationPeriod  18.9482
	Obliquity       350.269
	EqAscendNode    339.037
	Precession      0

	AbsMagn         15.5195
	SlopeParam      4.38951
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.593 0.590 0.587)

	Surface
	{
		SurfStyle       0.921435
		OceanStyle      0.448715
		Randomize      (0.709, -0.987, 0.584)
		colorDistMagn   0.526871
		colorDistFreq   0.0307692
		detailScale     245.135
		colorConversion true
		snowLevel       2
		tropicLatitude  0.67645
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.575392
		terraceProb     0.400947
		erosion         0
		montesMagn      0.435432
		montesFreq      3.55397
		montesSpiky     0.930259
		montesFraction  0.776068
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.202095
		hillsFraction   0.595488
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250357
		craterFreq      0.22124
		craterDensity   0.92032
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.499891
		volcanoTemp     1830.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.202, 0.207, 0.235, 0.050)
		colorShelf     (0.237, 0.242, 0.270, 0.040)
		colorBeach     (0.273, 0.278, 0.305, 0.030)
		colorDesert    (0.308, 0.313, 0.347, 0.020)
		colorLowland   (0.344, 0.348, 0.382, 0.030)
		colorUpland    (0.380, 0.384, 0.417, 0.050)
		colorRock      (0.415, 0.419, 0.464, 0.020)
		colorSnow      (0.415, 0.419, 0.464, 1.000)
		BumpHeight      8.0794
		BumpOffset      1.61588
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.661584
		GasToDust   0.25
		Particles   2316
		GasBright   0.282466
		DustBright  0.366358
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.03901
		Eccentricity    0.895751
		Inclination     33.683
		AscendingNode   -153.185
		ArgOfPericenter -23.8837
		MeanAnomaly     -110.246
	}
}

Comet	"Ord Mantell C54"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            5.67211e-018
	Radius          0.0249323
	InertiaMoment   0.39891

	Oblateness      0.0970298

	RotationPeriod  16.3674
	Obliquity       303.475
	EqAscendNode    323.615
	Precession      0

	AbsMagn         9.35061
	SlopeParam      4.98765
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.841 0.779 0.742)

	Surface
	{
		SurfStyle       0.696775
		OceanStyle      0.105421
		Randomize      (-0.224, -0.149, -0.283)
		colorDistMagn   0.226814
		colorDistFreq   2.20213e-007
		detailScale     0.680818
		colorConversion true
		snowLevel       2
		tropicLatitude  0.32771
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.501974
		terraceProb     0.29502
		erosion         0
		montesMagn      0.600488
		montesFreq      2.87469
		montesSpiky     0.854685
		montesFraction  0.216369
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.47688e-006
		hillsFraction   0.552581
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263554
		craterFreq      0.245087
		craterDensity   1.03639
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.435183
		volcanoTemp     1423.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.328, 0.265, 0.208, 0.000)
		colorShelf     (0.337, 0.273, 0.238, 0.000)
		colorBeach     (0.395, 0.320, 0.282, 0.000)
		colorDesert    (0.429, 0.343, 0.275, 0.000)
		colorLowland   (0.471, 0.366, 0.312, 0.000)
		colorUpland    (0.522, 0.444, 0.379, 0.000)
		colorRock      (0.564, 0.483, 0.408, 0.000)
		colorSnow      (0.614, 0.514, 0.431, 1.000)
		BumpHeight      0.0224391
		BumpOffset      0.00448781
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.164787
		DustBright  0.168523
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.083
		Eccentricity    0.818262
		Inclination     -142.303
		AscendingNode   4.69536
		ArgOfPericenter 24.2352
		MeanAnomaly     -25.5255
	}
}

Comet	"Ord Mantell C55"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            4.38697e-014
	Radius          0.555137
	InertiaMoment   0.397252

	Oblateness      0.19896

	RotationPeriod  13.6127
	Obliquity       256.681
	EqAscendNode    308.192
	Precession      0

	AbsMagn         5.83814
	SlopeParam      5.69299
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.755 0.752 0.748)

	Surface
	{
		SurfStyle       0.84588
		OceanStyle      0.26856
		Randomize      (0.674, 0.003, 0.217)
		colorDistMagn   0.327
		colorDistFreq   3.10474e-005
		detailScale     15.1589
		colorConversion true
		snowLevel       2
		tropicLatitude  0.979616
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.548776
		terraceProb     0.36046
		erosion         0
		montesMagn      0.428122
		montesFreq      3.24051
		montesSpiky     0.871494
		montesFraction  0.268975
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000663648
		hillsFraction   0.370031
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23714
		craterFreq      0.222528
		craterDensity   0.882022
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.425171
		volcanoTemp     1696.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.295, 0.256, 0.209, 0.000)
		colorShelf     (0.302, 0.263, 0.239, 0.000)
		colorBeach     (0.355, 0.308, 0.284, 0.000)
		colorDesert    (0.385, 0.331, 0.277, 0.000)
		colorLowland   (0.423, 0.353, 0.314, 0.000)
		colorUpland    (0.468, 0.429, 0.382, 0.000)
		colorRock      (0.506, 0.466, 0.411, 0.000)
		colorSnow      (0.551, 0.496, 0.434, 1.000)
		BumpHeight      0.499624
		BumpOffset      0.0999247
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.213218
		GasToDust   0.25
		Particles   1410
		GasBright   0.0437036
		DustBright  0.774094
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.03292
		Eccentricity    0.812873
		Inclination     144.051
		AscendingNode   -88.5577
		ArgOfPericenter -148.777
		MeanAnomaly     162.142
	}
}

Comet	"Ord Mantell C56"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            3.39301e-010
	Radius          9.74434
	InertiaMoment   0.39937

	Oblateness      0.229524

	RotationPeriod  10.6404
	Obliquity       209.886
	EqAscendNode    292.77
	Precession      0

	AbsMagn         14.5459
	SlopeParam      6.72447
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.536 0.534 0.531)

	Surface
	{
		SurfStyle       0.538432
		OceanStyle      0.584873
		Randomize      (0.596, 0.285, -0.405)
		colorDistMagn   0.406733
		colorDistFreq   0.026637
		detailScale     266.085
		colorConversion true
		snowLevel       2
		tropicLatitude  0.798503
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.415344
		terraceProb     0.336683
		erosion         0
		montesMagn      0.514507
		montesFreq      2.99537
		montesSpiky     0.965024
		montesFraction  0.720441
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.239141
		hillsFraction   0.765215
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220955
		craterFreq      0.241644
		craterDensity   0.904526
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.475698
		volcanoTemp     1099.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.209, 0.181, 0.149, 0.000)
		colorShelf     (0.215, 0.187, 0.170, 0.000)
		colorBeach     (0.252, 0.219, 0.202, 0.000)
		colorDesert    (0.274, 0.235, 0.196, 0.000)
		colorLowland   (0.300, 0.251, 0.223, 0.000)
		colorUpland    (0.333, 0.304, 0.271, 0.000)
		colorRock      (0.359, 0.331, 0.292, 0.000)
		colorSnow      (0.392, 0.352, 0.308, 1.000)
		BumpHeight      8.7699
		BumpOffset      1.75398
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.69441
		GasToDust   0.25
		Particles   2382
		GasBright   0.0564998
		DustBright  0.445784
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.06378
		Eccentricity    0.840831
		Inclination     58.3871
		AscendingNode   -110.344
		ArgOfPericenter 13.9326
		MeanAnomaly     123.902
	}
}

Comet	"Ord Mantell C57"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            1.04473e-017
	Radius          0.0343325
	InertiaMoment   0.398078

	Oblateness      0.249

	RotationPeriod  7.3887
	Obliquity       163.092
	EqAscendNode    277.347
	Precession      0

	AbsMagn         9.13167
	SlopeParam      2.20083
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.626 0.623 0.622)

	Surface
	{
		SurfStyle       0.928079
		OceanStyle      0.652527
		Randomize      (-0.886, 0.457, -0.307)
		colorDistMagn   0.901667
		colorDistFreq   7.74593e-007
		detailScale     0.937505
		colorConversion true
		snowLevel       2
		tropicLatitude  0.871269
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.460278
		terraceProb     0.315946
		erosion         0
		montesMagn      0.687484
		montesFreq      3.42618
		montesSpiky     0.992306
		montesFraction  0.905548
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.14863e-006
		hillsFraction   0.625398
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.266249
		craterFreq      0.216622
		craterDensity   0.840721
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.535004
		volcanoTemp     1513.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.213, 0.218, 0.249, 0.050)
		colorShelf     (0.250, 0.256, 0.286, 0.040)
		colorBeach     (0.288, 0.293, 0.323, 0.030)
		colorDesert    (0.325, 0.330, 0.367, 0.020)
		colorLowland   (0.363, 0.368, 0.404, 0.030)
		colorUpland    (0.400, 0.405, 0.441, 0.050)
		colorRock      (0.438, 0.443, 0.491, 0.020)
		colorSnow      (0.438, 0.443, 0.491, 1.000)
		BumpHeight      0.0308992
		BumpOffset      0.00617985
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.169262
		DustBright  0.817509
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.09486
		Eccentricity    0.696485
		Inclination     -75.3103
		AscendingNode   151.907
		ArgOfPericenter 88.0972
		MeanAnomaly     177.178
	}
}

Comet	"Ord Mantell C58"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            8.08026e-014
	Radius          0.60359
	InertiaMoment   0.399799

	Oblateness      0.249

	RotationPeriod  3.76678
	Obliquity       116.298
	EqAscendNode    261.924
	Precession      0

	AbsMagn         5.59252
	SlopeParam      2.92955
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.698 0.695 0.692)

	Surface
	{
		SurfStyle       0.918224
		OceanStyle      0.466322
		Randomize      (0.291, 0.599, 0.198)
		colorDistMagn   0.476247
		colorDistFreq   0.00011091
		detailScale     16.482
		colorConversion true
		snowLevel       2
		tropicLatitude  0.968172
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.49256
		terraceProb     0.126679
		erosion         0
		montesMagn      0.545857
		montesFreq      3.45432
		montesSpiky     0.911391
		montesFraction  0.394593
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000820253
		hillsFraction   0.69777
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263617
		craterFreq      0.239465
		craterDensity   0.838487
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.446053
		volcanoTemp     1104.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.237, 0.243, 0.277, 0.050)
		colorShelf     (0.279, 0.285, 0.318, 0.040)
		colorBeach     (0.321, 0.327, 0.360, 0.030)
		colorDesert    (0.363, 0.369, 0.408, 0.020)
		colorLowland   (0.405, 0.410, 0.449, 0.030)
		colorUpland    (0.447, 0.452, 0.491, 0.050)
		colorRock      (0.489, 0.494, 0.546, 0.020)
		colorSnow      (0.489, 0.494, 0.546, 1.000)
		BumpHeight      0.543231
		BumpOffset      0.108646
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.246044
		GasToDust   0.25
		Particles   1476
		GasBright   0.154776
		DustBright  0.516481
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.07204
		Eccentricity    0.841555
		Inclination     159.725
		AscendingNode   -57.8521
		ArgOfPericenter -174.483
		MeanAnomaly     72.8881
	}
}

Comet	"Ord Mantell C59"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            6.24949e-010
	Radius          13.3982
	InertiaMoment   0.398662

	Oblateness      0.002231

	RotationPeriod  128.043
	Obliquity       69.5034
	EqAscendNode    246.502
	Precession      0

	AbsMagn         13.8536
	SlopeParam      3.53628
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.759 0.699 0.599)

	Surface
	{
		SurfStyle       0.240302
		OceanStyle      0.336188
		Randomize      (0.056, -0.714, -0.454)
		colorDistMagn   0.439409
		colorDistFreq   0.0378811
		detailScale     365.86
		colorConversion true
		snowLevel       2
		tropicLatitude  0.573616
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.472752
		terraceProb     0.171241
		erosion         0
		montesMagn      0.655647
		montesFreq      2.25449
		montesSpiky     0.720776
		montesFraction  0.202696
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.291284
		hillsFraction   0.484209
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247288
		craterFreq      0.247453
		craterDensity   0.928138
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.472703
		volcanoTemp     1236.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.304, 0.280, 0.240, 0.000)
		colorShelf     (0.323, 0.297, 0.255, 0.000)
		colorBeach     (0.342, 0.314, 0.270, 0.000)
		colorDesert    (0.361, 0.332, 0.285, 0.000)
		colorLowland   (0.380, 0.349, 0.300, 0.000)
		colorUpland    (0.399, 0.367, 0.315, 0.000)
		colorRock      (0.417, 0.384, 0.330, 0.000)
		colorSnow      (0.436, 0.402, 0.345, 1.000)
		BumpHeight      12.0584
		BumpOffset      2.41168
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.727236
		GasToDust   0.25
		Particles   2448
		GasBright   0.103031
		DustBright  0.252712
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.07144
		Eccentricity    0.868592
		Inclination     -104.358
		AscendingNode   3.27255
		ArgOfPericenter 170.976
		MeanAnomaly     99.1151
	}
}

Comet	"Ord Mantell C60"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            1.92426e-017
	Radius          0.0373879
	InertiaMoment   0.396577

	Oblateness      0.00196687

	RotationPeriod  114.114
	Obliquity       22.7091
	EqAscendNode    231.079
	Precession      0

	AbsMagn         8.91606
	SlopeParam      4.10232
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.518 0.515 0.512)

	Surface
	{
		SurfStyle       0.666683
		OceanStyle      0.191942
		Randomize      (-0.686, -0.277, -0.385)
		colorDistMagn   0.974613
		colorDistFreq   1.14302e-006
		detailScale     1.02094
		colorConversion true
		snowLevel       2
		tropicLatitude  0.717771
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.624212
		terraceProb     0.241157
		erosion         0
		montesMagn      0.490337
		montesFreq      3.12661
		montesSpiky     0.955369
		montesFraction  0.321626
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.86228e-006
		hillsFraction   0.536683
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253753
		craterFreq      0.217908
		craterDensity   0.752864
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.429017
		volcanoTemp     1359.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.202, 0.175, 0.143, 0.000)
		colorShelf     (0.207, 0.180, 0.164, 0.000)
		colorBeach     (0.244, 0.211, 0.195, 0.000)
		colorDesert    (0.264, 0.226, 0.190, 0.000)
		colorLowland   (0.290, 0.242, 0.215, 0.000)
		colorUpland    (0.321, 0.293, 0.261, 0.000)
		colorRock      (0.347, 0.319, 0.282, 0.000)
		colorSnow      (0.378, 0.340, 0.297, 1.000)
		BumpHeight      0.0336491
		BumpOffset      0.00672983
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.29296
		DustBright  0.54727
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.07373
		Eccentricity    0.854856
		Inclination     -23.6432
		AscendingNode   163.92
		ArgOfPericenter 49.5141
		MeanAnomaly     -60.6641
	}
}

Comet	"Ord Mantell C61"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            1.48828e-013
	Radius          0.828747
	InertiaMoment   0.399149

	Oblateness      0.00323319

	RotationPeriod  106.128
	Obliquity       335.915
	EqAscendNode    215.657
	Precession      0

	AbsMagn         5.33745
	SlopeParam      4.67684
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.531 0.528 0.524)

	Surface
	{
		SurfStyle       0.173102
		OceanStyle      0.184876
		Randomize      (0.097, 0.775, -0.670)
		colorDistMagn   0.247393
		colorDistFreq   0.000512709
		detailScale     22.6303
		colorConversion true
		snowLevel       2
		tropicLatitude  0.323818
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.64904
		terraceProb     0.150505
		erosion         0
		montesMagn      0.551289
		montesFreq      1.96545
		montesSpiky     0.98219
		montesFraction  0.518157
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00171751
		hillsFraction   0.481587
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23628
		craterFreq      0.174242
		craterDensity   0.99533
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.561475
		volcanoTemp     1251.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.212, 0.211, 0.209, 0.000)
		colorShelf     (0.226, 0.224, 0.222, 0.000)
		colorBeach     (0.239, 0.238, 0.236, 0.000)
		colorDesert    (0.252, 0.251, 0.249, 0.000)
		colorLowland   (0.265, 0.264, 0.262, 0.000)
		colorUpland    (0.279, 0.277, 0.275, 0.000)
		colorRock      (0.292, 0.290, 0.288, 0.000)
		colorSnow      (0.305, 0.303, 0.301, 1.000)
		BumpHeight      0.745872
		BumpOffset      0.149174
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.27887
		GasToDust   0.25
		Particles   1543
		GasBright   0.213933
		DustBright  0.310783
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.08238
		Eccentricity    0.865331
		Inclination     -16.6391
		AscendingNode   127.667
		ArgOfPericenter 44.6656
		MeanAnomaly     173.354
	}
}

Comet	"Ord Mantell C62"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            1.15108e-009
	Radius          14.6124
	InertiaMoment   0.397719

	Oblateness      0.00255303

	RotationPeriod  100.275
	Obliquity       289.12
	EqAscendNode    200.234
	Precession      0

	AbsMagn         13.3024
	SlopeParam      5.3149
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.745 0.693 0.653)

	Surface
	{
		SurfStyle       0.0370808
		OceanStyle      0.108062
		Randomize      (0.677, -0.718, 0.344)
		colorDistMagn   0.081629
		colorDistFreq   0.0510425
		detailScale     399.016
		colorConversion true
		snowLevel       2
		tropicLatitude  0.880419
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.356804
		terraceProb     0.179531
		erosion         0
		montesMagn      0.536754
		montesFreq      3.02897
		montesSpiky     0.885403
		montesFraction  0.624919
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.530401
		hillsFraction   0.579212
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.200902
		craterFreq      0.232702
		craterDensity   0.86264
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.538077
		volcanoTemp     1592.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.298, 0.277, 0.261, 0.000)
		colorShelf     (0.317, 0.295, 0.277, 0.000)
		colorBeach     (0.335, 0.312, 0.294, 0.000)
		colorDesert    (0.354, 0.329, 0.310, 0.000)
		colorLowland   (0.373, 0.347, 0.326, 0.000)
		colorUpland    (0.391, 0.364, 0.343, 0.000)
		colorRock      (0.410, 0.381, 0.359, 0.000)
		colorSnow      (0.428, 0.399, 0.375, 1.000)
		BumpHeight      13.1512
		BumpOffset      2.63023
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.760062
		GasToDust   0.25
		Particles   2515
		GasBright   0.0976471
		DustBright  0.111556
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.05119
		Eccentricity    0.812989
		Inclination     -83.4389
		AscendingNode   117.731
		ArgOfPericenter 58.3097
		MeanAnomaly     -120.949
	}
}

Comet	"Ord Mantell C63"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            3.54425e-017
	Radius          0.0512659
	InertiaMoment   0.39959

	Oblateness      0.00397144

	RotationPeriod  95.5479
	Obliquity       242.326
	EqAscendNode    184.812
	Precession      0

	AbsMagn         8.70308
	SlopeParam      6.13061
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.551 0.457 0.349)

	Surface
	{
		SurfStyle       0.282275
		OceanStyle      0.0507978
		Randomize      (0.909, -0.753, -0.221)
		colorDistMagn   0.1626
		colorDistFreq   1.78605e-006
		detailScale     1.3999
		colorConversion true
		snowLevel       2
		tropicLatitude  0.881022
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.716243
		terraceProb     0.128372
		erosion         0
		montesMagn      0.531882
		montesFreq      2.94222
		montesSpiky     0.957202
		montesFraction  0.31604
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.1859e-006
		hillsFraction   0.604865
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236096
		craterFreq      0.226643
		craterDensity   0.802661
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.504559
		volcanoTemp     1704.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.220, 0.183, 0.140, 0.000)
		colorShelf     (0.234, 0.194, 0.148, 0.000)
		colorBeach     (0.248, 0.206, 0.157, 0.000)
		colorDesert    (0.262, 0.217, 0.166, 0.000)
		colorLowland   (0.276, 0.229, 0.175, 0.000)
		colorUpland    (0.289, 0.240, 0.183, 0.000)
		colorRock      (0.303, 0.251, 0.192, 0.000)
		colorSnow      (0.317, 0.263, 0.201, 1.000)
		BumpHeight      0.0461393
		BumpOffset      0.00922787
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.017899
		DustBright  0.675791
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.02946
		Eccentricity    0.926455
		Inclination     -34.214
		AscendingNode   -79.7029
		ArgOfPericenter 92.7421
		MeanAnomaly     83.0806
	}
}

Comet	"Ord Mantell C64"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            2.74123e-013
	Radius          0.905129
	InertiaMoment   0.398391

	Oblateness      0.00306621

	RotationPeriod  91.523
	Obliquity       195.532
	EqAscendNode    169.389
	Precession      0

	AbsMagn         5.07107
	SlopeParam      7.72425
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.434 0.430 0.427)

	Surface
	{
		SurfStyle       0.615086
		OceanStyle      0.0163593
		Randomize      (-0.024, 0.189, -0.553)
		colorDistMagn   0.0455997
		colorDistFreq   0.000504192
		detailScale     24.7161
		colorConversion true
		snowLevel       2
		tropicLatitude  0.243849
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.542327
		terraceProb     0.459745
		erosion         0
		montesMagn      0.519056
		montesFreq      3.45573
		montesSpiky     0.971766
		montesFraction  0.528539
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00171823
		hillsFraction   0.64919
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239931
		craterFreq      0.239499
		craterDensity   0.909813
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.47346
		volcanoTemp     1199.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.169, 0.146, 0.120, 0.000)
		colorShelf     (0.174, 0.151, 0.137, 0.000)
		colorBeach     (0.204, 0.176, 0.162, 0.000)
		colorDesert    (0.221, 0.189, 0.158, 0.000)
		colorLowland   (0.243, 0.202, 0.179, 0.000)
		colorUpland    (0.269, 0.245, 0.218, 0.000)
		colorRock      (0.291, 0.267, 0.235, 0.000)
		colorSnow      (0.317, 0.284, 0.248, 1.000)
		BumpHeight      0.814617
		BumpOffset      0.162923
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.311696
		GasToDust   0.25
		Particles   1609
		GasBright   0.0320875
		DustBright  0.346089
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0486
		Eccentricity    0.775835
		Inclination     178.582
		AscendingNode   -0.3865
		ArgOfPericenter 65.5991
		MeanAnomaly     -141.366
	}
}

Comet	"Ord Mantell C65"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            2.12014e-009
	Radius          20.0108
	InertiaMoment   0.394319

	Oblateness      0.00456579

	RotationPeriod  87.9791
	Obliquity       148.738
	EqAscendNode    153.966
	Precession      0

	AbsMagn         12.8367
	SlopeParam      2.58378
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.783 0.737 0.674)

	Surface
	{
		SurfStyle       0.603295
		OceanStyle      0.637114
		Randomize      (-0.167, 0.229, 0.098)
		colorDistMagn   0.776169
		colorDistFreq   0.261891
		detailScale     546.429
		colorConversion true
		snowLevel       2
		tropicLatitude  0.499553
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.536765
		terraceProb     0.238931
		erosion         0
		montesMagn      0.480308
		montesFreq      2.15081
		montesSpiky     0.851708
		montesFraction  0.626137
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.723298
		hillsFraction   0.78915
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256856
		craterFreq      0.250361
		craterDensity   0.845577
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.39896
		volcanoTemp     1180.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.306, 0.251, 0.189, 0.000)
		colorShelf     (0.313, 0.258, 0.216, 0.000)
		colorBeach     (0.368, 0.302, 0.256, 0.000)
		colorDesert    (0.400, 0.324, 0.249, 0.000)
		colorLowland   (0.439, 0.346, 0.283, 0.000)
		colorUpland    (0.486, 0.420, 0.344, 0.000)
		colorRock      (0.525, 0.457, 0.371, 0.000)
		colorSnow      (0.572, 0.486, 0.391, 1.000)
		BumpHeight      18.0097
		BumpOffset      3.60195
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.792888
		GasToDust   0.25
		Particles   2581
		GasBright   0.124131
		DustBright  0.738532
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.07551
		Eccentricity    0.809874
		Inclination     119.922
		AscendingNode   167.962
		ArgOfPericenter 58.2585
		MeanAnomaly     38.4052
	}
}

Comet	"Ord Mantell C66"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            6.52808e-017
	Radius          0.056066
	InertiaMoment   0.398917

	Oblateness      0.00357276

	RotationPeriod  84.7854
	Obliquity       101.943
	EqAscendNode    138.544
	Precession      0

	AbsMagn         8.49208
	SlopeParam      3.23754
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.817 0.746 0.678)

	Surface
	{
		SurfStyle       0.458548
		OceanStyle      0.552528
		Randomize      (0.271, 0.384, -0.451)
		colorDistMagn   0.0124434
		colorDistFreq   2.61266e-006
		detailScale     1.53098
		colorConversion true
		snowLevel       2
		tropicLatitude  0.960791
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.735066
		terraceProb     0.216408
		erosion         0
		montesMagn      0.43891
		montesFreq      2.08497
		montesSpiky     0.977372
		montesFraction  0.404662
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.59204e-006
		hillsFraction   0.659465
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241216
		craterFreq      0.20632
		craterDensity   0.824648
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.505995
		volcanoTemp     1259.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.327, 0.299, 0.271, 0.000)
		colorShelf     (0.347, 0.317, 0.288, 0.000)
		colorBeach     (0.368, 0.336, 0.305, 0.000)
		colorDesert    (0.388, 0.355, 0.322, 0.000)
		colorLowland   (0.408, 0.373, 0.339, 0.000)
		colorUpland    (0.429, 0.392, 0.356, 0.000)
		colorRock      (0.449, 0.411, 0.373, 0.000)
		colorSnow      (0.470, 0.429, 0.390, 1.000)
		BumpHeight      0.0504594
		BumpOffset      0.0100919
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.111038
		DustBright  0.436112
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.07622
		Eccentricity    0.7341
		Inclination     149.454
		AscendingNode   23.6398
		ArgOfPericenter -31.6577
		MeanAnomaly     80.8679
	}
}

Comet	"Ord Mantell C67"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            5.04899e-013
	Radius          1.23802
	InertiaMoment   0.397265

	Oblateness      0.00530275

	RotationPeriod  81.8577
	Obliquity       55.149
	EqAscendNode    123.121
	Precession      0

	AbsMagn         4.79101
	SlopeParam      3.81723
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.418 0.414 0.409)

	Surface
	{
		SurfStyle       0.272229
		OceanStyle      0.963361
		Randomize      (0.693, -0.193, 0.439)
		colorDistMagn   0.76079
		colorDistFreq   0.000841201
		detailScale     33.8062
		colorConversion true
		snowLevel       2
		tropicLatitude  0.903639
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.623525
		terraceProb     0.368928
		erosion         0
		montesMagn      0.534171
		montesFreq      2.61171
		montesSpiky     0.772663
		montesFraction  0.863878
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00547341
		hillsFraction   0.545143
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.274071
		craterFreq      0.230221
		craterDensity   0.977332
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.454576
		volcanoTemp     1756.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.167, 0.166, 0.163, 0.000)
		colorShelf     (0.178, 0.176, 0.174, 0.000)
		colorBeach     (0.188, 0.186, 0.184, 0.000)
		colorDesert    (0.199, 0.197, 0.194, 0.000)
		colorLowland   (0.209, 0.207, 0.204, 0.000)
		colorUpland    (0.220, 0.217, 0.215, 0.000)
		colorRock      (0.230, 0.228, 0.225, 0.000)
		colorSnow      (0.241, 0.238, 0.235, 1.000)
		BumpHeight      1.11422
		BumpOffset      0.222843
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.344522
		GasToDust   0.25
		Particles   1675
		GasBright   0.0606849
		DustBright  0.170951
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.08792
		Eccentricity    0.825047
		Inclination     -88.0842
		AscendingNode   60.0725
		ArgOfPericenter 146.945
		MeanAnomaly     -1.9936
	}
}

Comet	"Ord Mantell C68"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            3.90503e-009
	Radius          21.9123
	InertiaMoment   0.399376

	Oblateness      0.00409964

	RotationPeriod  79.1385
	Obliquity       8.35469
	EqAscendNode    107.699
	Precession      0

	AbsMagn         12.4288
	SlopeParam      4.38165
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.718 0.716 0.715)

	Surface
	{
		SurfStyle       0.0812851
		OceanStyle      0.310498
		Randomize      (0.885, -0.224, 0.073)
		colorDistMagn   0.598827
		colorDistFreq   0.174005
		detailScale     598.353
		colorConversion true
		snowLevel       2
		tropicLatitude  0.255331
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.723539
		terraceProb     0.453502
		erosion         0
		montesMagn      0.387807
		montesFreq      3.85263
		montesSpiky     0.887356
		montesFraction  0.225869
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.47767
		hillsFraction   0.645519
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.207912
		craterFreq      0.149712
		craterDensity   0.87778
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.457196
		volcanoTemp     2090.54
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
		colorSnow      (0.413, 0.412, 0.411, 1.000)
		BumpHeight      19.7211
		BumpOffset      3.94422
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.825714
		GasToDust   0.25
		Particles   2647
		GasBright   0.229896
		DustBright  0.486227
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0714
		Eccentricity    0.83883
		Inclination     166.333
		AscendingNode   -80.8132
		ArgOfPericenter 11.2165
		MeanAnomaly     -97.3893
	}
}

Comet	"Ord Mantell C69"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            1.20239e-016
	Radius          0.0765975
	InertiaMoment   0.398086

	Oblateness      0.00604335

	RotationPeriod  76.5862
	Obliquity       321.56
	EqAscendNode    92.276
	Precession      0

	AbsMagn         8.28244
	SlopeParam      4.97894
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.785 0.781 0.780)

	Surface
	{
		SurfStyle       0.750122
		OceanStyle      0.480661
		Randomize      (0.096, -0.531, 0.075)
		colorDistMagn   0.126324
		colorDistFreq   3.13097e-006
		detailScale     2.09162
		colorConversion true
		snowLevel       2
		tropicLatitude  0.935617
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.453769
		terraceProb     0.376863
		erosion         0
		montesMagn      0.543838
		montesFreq      2.12635
		montesSpiky     0.963995
		montesFraction  0.479674
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.2743e-005
		hillsFraction   0.69638
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.197793
		craterFreq      0.256681
		craterDensity   0.57703
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.507989
		volcanoTemp     1723.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.306, 0.266, 0.218, 0.000)
		colorShelf     (0.314, 0.273, 0.249, 0.000)
		colorBeach     (0.369, 0.320, 0.296, 0.000)
		colorDesert    (0.400, 0.344, 0.288, 0.000)
		colorLowland   (0.439, 0.367, 0.327, 0.000)
		colorUpland    (0.487, 0.445, 0.398, 0.000)
		colorRock      (0.526, 0.484, 0.429, 0.000)
		colorSnow      (0.573, 0.516, 0.452, 1.000)
		BumpHeight      0.0689378
		BumpOffset      0.0137876
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.152261
		DustBright  0.248348
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.09091
		Eccentricity    0.799545
		Inclination     129.637
		AscendingNode   72.1641
		ArgOfPericenter -7.08516
		MeanAnomaly     -96.7298
	}
}

Comet	"Ord Mantell C70"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            9.2996e-013
	Radius          1.3573
	InertiaMoment   0.399804

	Oblateness      0.00466536

	RotationPeriod  74.1702
	Obliquity       274.766
	EqAscendNode    76.8534
	Precession      0

	AbsMagn         4.49426
	SlopeParam      5.68198
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.661 0.504 0.396)

	Surface
	{
		SurfStyle       0.880127
		OceanStyle      0.939883
		Randomize      (-0.382, -0.562, 0.296)
		colorDistMagn   0.803544
		colorDistFreq   0.000729631
		detailScale     37.0634
		colorConversion true
		snowLevel       2
		tropicLatitude  0.513154
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.48666
		terraceProb     0.104156
		erosion         0
		montesMagn      0.562238
		montesFreq      4.02108
		montesSpiky     0.826629
		montesFraction  0.584343
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00437994
		hillsFraction   0.655159
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2476
		craterFreq      0.195293
		craterDensity   1.07949
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.489482
		volcanoTemp     1628.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.225, 0.177, 0.158, 0.050)
		colorShelf     (0.264, 0.207, 0.182, 0.040)
		colorBeach     (0.304, 0.237, 0.206, 0.030)
		colorDesert    (0.344, 0.267, 0.234, 0.020)
		colorLowland   (0.383, 0.298, 0.257, 0.030)
		colorUpland    (0.423, 0.328, 0.281, 0.050)
		colorRock      (0.463, 0.358, 0.313, 0.020)
		colorSnow      (0.463, 0.358, 0.313, 1.000)
		BumpHeight      1.22157
		BumpOffset      0.244315
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.377347
		GasToDust   0.25
		Particles   1742
		GasBright   0.388663
		DustBright  0.496433
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.05709
		Eccentricity    0.93101
		Inclination     -119.68
		AscendingNode   -19.2972
		ArgOfPericenter 33.5693
		MeanAnomaly     -74.8137
	}
}

Comet	"Ord Mantell C71"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            7.19257e-009
	Radius          29.9038
	InertiaMoment   0.398668

	Oblateness      0.00684172

	RotationPeriod  71.8667
	Obliquity       227.972
	EqAscendNode    61.4308
	Precession      0

	AbsMagn         12.0624
	SlopeParam      6.70509
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.584 0.581 0.579)

	Surface
	{
		SurfStyle       0.163659
		OceanStyle      0.19086
		Randomize      (0.067, -0.690, 0.842)
		colorDistMagn   0.273861
		colorDistFreq   0.355681
		detailScale     816.572
		colorConversion true
		snowLevel       2
		tropicLatitude  0.737823
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.44575
		terraceProb     0.382229
		erosion         0
		montesMagn      0.441344
		montesFreq      2.98257
		montesSpiky     0.785716
		montesFraction  0.42825
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.8815
		hillsFraction   0.629025
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250198
		craterFreq      0.198759
		craterDensity   0.934157
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.554672
		volcanoTemp     1879.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.234, 0.232, 0.231, 0.000)
		colorShelf     (0.248, 0.247, 0.246, 0.000)
		colorBeach     (0.263, 0.261, 0.260, 0.000)
		colorDesert    (0.277, 0.276, 0.275, 0.000)
		colorLowland   (0.292, 0.290, 0.289, 0.000)
		colorUpland    (0.306, 0.305, 0.304, 0.000)
		colorRock      (0.321, 0.319, 0.318, 0.000)
		colorSnow      (0.336, 0.334, 0.333, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.858539
		GasToDust   0.25
		Particles   2714
		GasBright   0.283746
		DustBright  0.285837
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.07375
		Eccentricity    0.8123
		Inclination     177.753
		AscendingNode   -78.0864
		ArgOfPericenter 166.863
		MeanAnomaly     -155.069
	}
}

Comet	"Ord Mantell C72"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            2.21465e-016
	Radius          0.0840747
	InertiaMoment   0.396599

	Oblateness      0.00521577

	RotationPeriod  69.657
	Obliquity       181.177
	EqAscendNode    46.0082
	Precession      0

	AbsMagn         8.07358
	SlopeParam      2.18923
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.528 0.456 0.358)

	Surface
	{
		SurfStyle       0.691366
		OceanStyle      0.0741881
		Randomize      (0.761, 0.204, 0.082)
		colorDistMagn   0.798618
		colorDistFreq   3.91118e-006
		detailScale     2.2958
		colorConversion true
		snowLevel       2
		tropicLatitude  0.892603
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.446451
		terraceProb     0.357082
		erosion         0
		montesMagn      0.693214
		montesFreq      3.19005
		montesSpiky     0.899416
		montesFraction  0.105795
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.99796e-005
		hillsFraction   0.573095
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.207269
		craterFreq      0.255767
		craterDensity   0.890758
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.551266
		volcanoTemp     1235.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.206, 0.155, 0.100, 0.000)
		colorShelf     (0.211, 0.160, 0.115, 0.000)
		colorBeach     (0.248, 0.187, 0.136, 0.000)
		colorDesert    (0.269, 0.201, 0.132, 0.000)
		colorLowland   (0.296, 0.214, 0.150, 0.000)
		colorUpland    (0.327, 0.260, 0.183, 0.000)
		colorRock      (0.354, 0.283, 0.197, 0.000)
		colorSnow      (0.386, 0.301, 0.208, 1.000)
		BumpHeight      0.0756672
		BumpOffset      0.0151334
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0145353
		DustBright  0.239534
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.08178
		Eccentricity    0.966392
		Inclination     62.7935
		AscendingNode   69.972
		ArgOfPericenter 178.872
		MeanAnomaly     57.2742
	}
}

Comet	"Ord Mantell C73"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            1.71287e-012
	Radius          1.85037
	InertiaMoment   0.399155

	Oblateness      0.00772372

	RotationPeriod  67.5261
	Obliquity       134.383
	EqAscendNode    30.5856
	Precession      0

	AbsMagn         4.17683
	SlopeParam      2.92063
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.685 0.683 0.682)

	Surface
	{
		SurfStyle       0.0610821
		OceanStyle      0.843435
		Randomize      (-0.986, 0.516, -0.888)
		colorDistMagn   0.684026
		colorDistFreq   0.0029754
		detailScale     50.5274
		colorConversion true
		snowLevel       2
		tropicLatitude  0.9813
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.681133
		terraceProb     0.155206
		erosion         0
		montesMagn      0.382417
		montesFreq      2.78458
		montesSpiky     0.911582
		montesFraction  0.478466
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00554562
		hillsFraction   0.485176
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248674
		craterFreq      0.199204
		craterDensity   0.847571
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.520263
		volcanoTemp     1375.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.274, 0.273, 0.273, 0.000)
		colorShelf     (0.291, 0.290, 0.290, 0.000)
		colorBeach     (0.308, 0.307, 0.307, 0.000)
		colorDesert    (0.326, 0.324, 0.324, 0.000)
		colorLowland   (0.343, 0.342, 0.341, 0.000)
		colorUpland    (0.360, 0.359, 0.358, 0.000)
		colorRock      (0.377, 0.376, 0.375, 0.000)
		colorSnow      (0.394, 0.393, 0.392, 1.000)
		BumpHeight      1.66533
		BumpOffset      0.333066
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.410173
		GasToDust   0.25
		Particles   1808
		GasBright   0.0858609
		DustBright  0.652695
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.05105
		Eccentricity    0.85497
		Inclination     -104.691
		AscendingNode   -122.346
		ArgOfPericenter 106.775
		MeanAnomaly     162.211
	}
}

Comet	"Ord Mantell C74"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            1.32478e-008
	Radius          32.8589
	InertiaMoment   0.397729

	Oblateness      0.00591886

	RotationPeriod  65.4616
	Obliquity       87.5889
	EqAscendNode    15.163
	Precession      0

	AbsMagn         11.7272
	SlopeParam      3.52835
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.499 0.393 0.321)

	Surface
	{
		SurfStyle       0.913754
		OceanStyle      0.210023
		Randomize      (-0.864, -0.879, 0.026)
		colorDistMagn   0.316985
		colorDistFreq   0.785419
		detailScale     897.266
		colorConversion true
		snowLevel       2
		tropicLatitude  0.470744
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.758914
		terraceProb     0.22138
		erosion         0
		montesMagn      0.401008
		montesFreq      3.18322
		montesSpiky     0.996898
		montesFraction  0.559254
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.79476
		hillsFraction   0.630366
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.265731
		craterFreq      0.216208
		craterDensity   0.881147
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.465706
		volcanoTemp     1429.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.170, 0.138, 0.129, 0.050)
		colorShelf     (0.200, 0.161, 0.148, 0.040)
		colorBeach     (0.230, 0.185, 0.167, 0.030)
		colorDesert    (0.259, 0.208, 0.190, 0.020)
		colorLowland   (0.289, 0.232, 0.209, 0.030)
		colorUpland    (0.319, 0.256, 0.228, 0.050)
		colorRock      (0.349, 0.279, 0.254, 0.020)
		colorSnow      (0.349, 0.279, 0.254, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.891365
		GasToDust   0.25
		Particles   2780
		GasBright   0.0741595
		DustBright  0.348883
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.02035
		Eccentricity    0.872051
		Inclination     -65.7638
		AscendingNode   170.881
		ArgOfPericenter -173.328
		MeanAnomaly     30.3006
	}
}

Comet	"Ord Mantell C75"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            4.07911e-016
	Radius          0.114502
	InertiaMoment   0.399595

	Oblateness      0.00871771

	RotationPeriod  63.4529
	Obliquity       40.7946
	EqAscendNode    359.74
	Precession      0

	AbsMagn         7.86491
	SlopeParam      4.09459
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.459 0.453 0.450)

	Surface
	{
		SurfStyle       0.551222
		OceanStyle      0.480319
		Randomize      (-0.103, 0.222, -0.842)
		colorDistMagn   0.905599
		colorDistFreq   7.28577e-006
		detailScale     3.12666
		colorConversion true
		snowLevel       2
		tropicLatitude  0.233309
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.479781
		terraceProb     0.156509
		erosion         0
		montesMagn      0.498938
		montesFreq      2.93891
		montesSpiky     0.865528
		montesFraction  0.564709
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.69137e-005
		hillsFraction   0.63324
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255186
		craterFreq      0.209195
		craterDensity   0.954108
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.504455
		volcanoTemp     1686.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.179, 0.154, 0.126, 0.000)
		colorShelf     (0.184, 0.159, 0.144, 0.000)
		colorBeach     (0.216, 0.186, 0.171, 0.000)
		colorDesert    (0.234, 0.199, 0.166, 0.000)
		colorLowland   (0.257, 0.213, 0.189, 0.000)
		colorUpland    (0.285, 0.258, 0.229, 0.000)
		colorRock      (0.308, 0.281, 0.247, 0.000)
		colorSnow      (0.335, 0.299, 0.261, 1.000)
		BumpHeight      0.103051
		BumpOffset      0.0206103
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.212675
		DustBright  0.694853
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.06239
		Eccentricity    0.875835
		Inclination     135.807
		AscendingNode   19.3925
		ArgOfPericenter 31.1241
		MeanAnomaly     34.4619
	}
}

Comet	"Ord Mantell C76"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            3.1549e-012
	Radius          2.03536
	InertiaMoment   0.398398

	Oblateness      0.00671112

	RotationPeriod  61.4913
	Obliquity       354
	EqAscendNode    344.318
	Precession      0

	AbsMagn         3.83328
	SlopeParam      4.66868
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.693 0.690 0.688)

	Surface
	{
		SurfStyle       0.11271
		OceanStyle      0.365566
		Randomize      (0.904, -0.168, 0.877)
		colorDistMagn   0.744982
		colorDistFreq   0.0028624
		detailScale     55.5788
		colorConversion true
		snowLevel       2
		tropicLatitude  1
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.634352
		terraceProb     0.389859
		erosion         0
		montesMagn      0.312529
		montesFreq      3.43378
		montesSpiky     0.94776
		montesFraction  0.431341
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0111947
		hillsFraction   0.861443
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263626
		craterFreq      0.182458
		craterDensity   0.909703
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.414849
		volcanoTemp     1252.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.277, 0.276, 0.275, 0.000)
		colorShelf     (0.294, 0.293, 0.293, 0.000)
		colorBeach     (0.312, 0.310, 0.310, 0.000)
		colorDesert    (0.329, 0.328, 0.327, 0.000)
		colorLowland   (0.346, 0.345, 0.344, 0.000)
		colorUpland    (0.364, 0.362, 0.361, 0.000)
		colorRock      (0.381, 0.379, 0.379, 0.000)
		colorSnow      (0.398, 0.397, 0.396, 1.000)
		BumpHeight      1.83182
		BumpOffset      0.366364
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.442999
		GasToDust   0.25
		Particles   1874
		GasBright   0.173692
		DustBright  0.418323
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.03207
		Eccentricity    0.930666
		Inclination     95.5623
		AscendingNode   -23.316
		ArgOfPericenter 147.047
		MeanAnomaly     -153.671
	}
}

Comet	"Ord Mantell C77"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            2.44008e-008
	Radius          44.7078
	InertiaMoment   0.394567

	Oblateness      0.00965947

	RotationPeriod  59.569
	Obliquity       307.206
	EqAscendNode    328.895
	Precession      0

	AbsMagn         11.4163
	SlopeParam      5.30534
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.515 0.512 0.509)

	Surface
	{
		SurfStyle       0.157828
		OceanStyle      0.834133
		Randomize      (0.142, 0.847, 0.288)
		colorDistMagn   0.871938
		colorDistFreq   0.954902
		detailScale     1220.82
		colorConversion true
		snowLevel       2
		tropicLatitude  0.987894
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.57189
		terraceProb     0.164455
		erosion         0
		montesMagn      0.45635
		montesFreq      3.21263
		montesSpiky     0.977197
		montesFraction  0.185691
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.36384
		hillsFraction   0.380221
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230903
		craterFreq      0.248946
		craterDensity   0.731008
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.503335
		volcanoTemp     1160.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.206, 0.205, 0.204, 0.000)
		colorShelf     (0.219, 0.218, 0.216, 0.000)
		colorBeach     (0.232, 0.231, 0.229, 0.000)
		colorDesert    (0.245, 0.243, 0.242, 0.000)
		colorLowland   (0.258, 0.256, 0.255, 0.000)
		colorUpland    (0.270, 0.269, 0.267, 0.000)
		colorRock      (0.283, 0.282, 0.280, 0.000)
		colorSnow      (0.296, 0.295, 0.293, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.924191
		GasToDust   0.25
		Particles   2846
		GasBright   0.0974493
		DustBright  0.179053
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0554
		Eccentricity    0.872051
		Inclination     -50.2189
		AscendingNode   -27.6782
		ArgOfPericenter -5.42
		MeanAnomaly     -34.6928
	}
}

Comet	"Ord Mantell C78"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            7.51319e-016
	Radius          0.126074
	InertiaMoment   0.398923

	Oblateness      0.00762712

	RotationPeriod  57.6791
	Obliquity       260.412
	EqAscendNode    313.473
	Precession      0

	AbsMagn         7.65588
	SlopeParam      6.11704
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.490 0.410 0.375)

	Surface
	{
		SurfStyle       0.787028
		OceanStyle      0.812351
		Randomize      (-0.316, -0.951, 0.175)
		colorDistMagn   0.354119
		colorDistFreq   1.14309e-006
		detailScale     3.44267
		colorConversion true
		snowLevel       2
		tropicLatitude  0.566392
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.365251
		terraceProb     0.169214
		erosion         0
		montesMagn      0.360387
		montesFreq      2.72934
		montesSpiky     0.937735
		montesFraction  0.485071
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.28677e-005
		hillsFraction   0.73928
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.206555
		craterFreq      0.209424
		craterDensity   0.838589
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.484282
		volcanoTemp     1454.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.191, 0.139, 0.105, 0.000)
		colorShelf     (0.196, 0.143, 0.120, 0.000)
		colorBeach     (0.230, 0.168, 0.142, 0.000)
		colorDesert    (0.250, 0.180, 0.139, 0.000)
		colorLowland   (0.275, 0.193, 0.157, 0.000)
		colorUpland    (0.304, 0.233, 0.191, 0.000)
		colorRock      (0.329, 0.254, 0.206, 0.000)
		colorSnow      (0.358, 0.270, 0.217, 1.000)
		BumpHeight      0.113467
		BumpOffset      0.0226934
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.313133
		DustBright  0.447856
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.07047
		Eccentricity    0.862885
		Inclination     -98.0535
		AscendingNode   29.7683
		ArgOfPericenter -162.442
		MeanAnomaly     158.45
	}
}

Comet	"Ord Mantell C79"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            5.81091e-012
	Radius          2.76677
	InertiaMoment   0.397279

	Oblateness      0.0110619

	RotationPeriod  55.8155
	Obliquity       213.617
	EqAscendNode    298.05
	Precession      0

	AbsMagn         3.45587
	SlopeParam      7.68142
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.545 0.541 0.535)

	Surface
	{
		SurfStyle       0.0934051
		OceanStyle      0.422239
		Randomize      (0.518, -0.687, 0.690)
		colorDistMagn   0.166871
		colorDistFreq   0.00575793
		detailScale     75.5512
		colorConversion true
		snowLevel       2
		tropicLatitude  0.840654
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.48667
		terraceProb     0.137629
		erosion         0
		montesMagn      0.586845
		montesFreq      2.34592
		montesSpiky     0.787735
		montesFraction  0.477233
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.019652
		hillsFraction   0.711392
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260806
		craterFreq      0.242721
		craterDensity   0.909808
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.415568
		volcanoTemp     1331.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.218, 0.217, 0.214, 0.000)
		colorShelf     (0.232, 0.230, 0.227, 0.000)
		colorBeach     (0.245, 0.244, 0.241, 0.000)
		colorDesert    (0.259, 0.257, 0.254, 0.000)
		colorLowland   (0.272, 0.271, 0.267, 0.000)
		colorUpland    (0.286, 0.284, 0.281, 0.000)
		colorRock      (0.300, 0.298, 0.294, 0.000)
		colorSnow      (0.313, 0.311, 0.307, 1.000)
		BumpHeight      2.49009
		BumpOffset      0.498018
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.475825
		GasToDust   0.25
		Particles   1941
		GasBright   0.209608
		DustBright  0.235867
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00534
		Eccentricity    0.830419
		Inclination     89.878
		AscendingNode   -167.16
		ArgOfPericenter 46.2081
		MeanAnomaly     -120.721
	}
}

Comet	"Ord Mantell C80"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            4.49433e-008
	Radius          49.2735
	InertiaMoment   0.399381

	Oblateness      0.00870794

	RotationPeriod  53.9727
	Obliquity       166.823
	EqAscendNode    282.628
	Precession      0

	AbsMagn         11.1249
	SlopeParam      2.57385
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.638 0.631 0.629)

	Surface
	{
		SurfStyle       0.0975065
		OceanStyle      0.210563
		Randomize      (-0.861, 0.934, 0.574)
		colorDistMagn   0.56787
		colorDistFreq   1.72708
		detailScale     1345.49
		colorConversion true
		snowLevel       2
		tropicLatitude  0.985796
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.292343
		terraceProb     0.235321
		erosion         0
		montesMagn      0.596714
		montesFreq      2.84332
		montesSpiky     0.889414
		montesFraction  0.296773
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.31749
		hillsFraction   0.795746
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.189697
		craterFreq      0.208038
		craterDensity   1.04935
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.545401
		volcanoTemp     1577.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.255, 0.252, 0.251, 0.000)
		colorShelf     (0.271, 0.268, 0.267, 0.000)
		colorBeach     (0.287, 0.284, 0.283, 0.000)
		colorDesert    (0.303, 0.300, 0.299, 0.000)
		colorLowland   (0.319, 0.316, 0.314, 0.000)
		colorUpland    (0.335, 0.331, 0.330, 0.000)
		colorRock      (0.351, 0.347, 0.346, 0.000)
		colorSnow      (0.367, 0.363, 0.362, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.957017
		GasToDust   0.25
		Particles   2913
		GasBright   0.0275008
		DustBright  0.902461
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.04674
		Eccentricity    0.735124
		Inclination     79.1517
		AscendingNode   93.9205
		ArgOfPericenter -117.299
		MeanAnomaly     63.6743
	}
}

Comet	"Ord Mantell C81"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            1.38384e-015
	Radius          0.17123
	InertiaMoment   0.398094

	Oblateness      0.0126536

	RotationPeriod  52.1454
	Obliquity       120.029
	EqAscendNode    267.205
	Precession      0

	AbsMagn         7.4459
	SlopeParam      3.22923
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.748 0.745 0.744)

	Surface
	{
		SurfStyle       0.849164
		OceanStyle      0.179986
		Randomize      (0.869, -0.038, 0.779)
		colorDistMagn   0.86835
		colorDistFreq   1.37961e-005
		detailScale     4.67572
		colorConversion true
		snowLevel       2
		tropicLatitude  0.983183
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.624527
		terraceProb     0.27386
		erosion         0
		montesMagn      0.514317
		montesFreq      2.26251
		montesSpiky     0.987064
		montesFraction  0.565265
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.04253e-005
		hillsFraction   0.634946
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260196
		craterFreq      0.215455
		craterDensity   0.958055
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.462219
		volcanoTemp     1718.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.292, 0.253, 0.208, 0.000)
		colorShelf     (0.299, 0.261, 0.238, 0.000)
		colorBeach     (0.352, 0.306, 0.283, 0.000)
		colorDesert    (0.382, 0.328, 0.275, 0.000)
		colorLowland   (0.419, 0.350, 0.313, 0.000)
		colorUpland    (0.464, 0.425, 0.379, 0.000)
		colorRock      (0.501, 0.462, 0.409, 0.000)
		colorSnow      (0.546, 0.492, 0.432, 1.000)
		BumpHeight      0.154107
		BumpOffset      0.0308214
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0274592
		GasToDust   0.25
		Particles   1035
		GasBright   0.0544507
		DustBright  0.559997
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.08659
		Eccentricity    0.770647
		Inclination     -121.566
		AscendingNode   127.063
		ArgOfPericenter 50.1741
		MeanAnomaly     30.9617
	}
}

Comet	"Ord Mantell C82"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            1.0703e-011
	Radius          3.0521
	InertiaMoment   0.39981

	Oblateness      0.0100103

	RotationPeriod  50.3287
	Obliquity       73.2345
	EqAscendNode    251.782
	Precession      0

	AbsMagn         3.03297
	SlopeParam      3.80948
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.581 0.578 0.575)

	Surface
	{
		SurfStyle       0.389175
		OceanStyle      0.397007
		Randomize      (-0.566, 0.558, -0.971)
		colorDistMagn   0.696374
		colorDistFreq   0.00799924
		detailScale     83.3427
		colorConversion true
		snowLevel       2
		tropicLatitude  0.948138
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.492648
		terraceProb     0.225118
		erosion         0
		montesMagn      0.59738
		montesFreq      2.53972
		montesSpiky     0.926665
		montesFraction  0.335683
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0204868
		hillsFraction   0.797397
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263848
		craterFreq      0.237127
		craterDensity   0.737269
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.599838
		volcanoTemp     1498.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.232, 0.231, 0.230, 0.000)
		colorShelf     (0.247, 0.246, 0.245, 0.000)
		colorBeach     (0.261, 0.260, 0.259, 0.000)
		colorDesert    (0.276, 0.275, 0.273, 0.000)
		colorLowland   (0.290, 0.289, 0.288, 0.000)
		colorUpland    (0.305, 0.304, 0.302, 0.000)
		colorRock      (0.320, 0.318, 0.316, 0.000)
		colorSnow      (0.334, 0.333, 0.331, 1.000)
		BumpHeight      2.74689
		BumpOffset      0.549378
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.508651
		GasToDust   0.25
		Particles   2007
		GasBright   0.0441414
		DustBright  0.254793
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.06897
		Eccentricity    0.764026
		Inclination     142.357
		AscendingNode   159.091
		ArgOfPericenter 55.8616
		MeanAnomaly     -131.68
	}
}

Comet	"Ord Mantell C83"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            8.27798e-008
	Radius          66.8655
	InertiaMoment   0.398675

	Oblateness      0.0145819

	RotationPeriod  48.518
	Obliquity       26.4402
	EqAscendNode    236.36
	Precession      0

	AbsMagn         10.8491
	SlopeParam      4.3738
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.563 0.559 0.552)

	Surface
	{
		SurfStyle       0.322893
		OceanStyle      0.204081
		Randomize      (-0.442, -0.028, 0.907)
		colorDistMagn   0.464621
		colorDistFreq   2.08503
		detailScale     1825.87
		colorConversion true
		snowLevel       2
		tropicLatitude  0.741148
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.412354
		terraceProb     0.662951
		erosion         0
		montesMagn      0.355275
		montesFreq      3.49253
		montesSpiky     0.92086
		montesFraction  0.534332
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.93687
		hillsFraction   0.471792
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222441
		craterFreq      0.276956
		craterDensity   0.984724
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.542857
		volcanoTemp     1488.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.225, 0.224, 0.221, 0.000)
		colorShelf     (0.239, 0.238, 0.235, 0.000)
		colorBeach     (0.253, 0.252, 0.249, 0.000)
		colorDesert    (0.267, 0.266, 0.262, 0.000)
		colorLowland   (0.282, 0.280, 0.276, 0.000)
		colorUpland    (0.296, 0.294, 0.290, 0.000)
		colorRock      (0.310, 0.308, 0.304, 0.000)
		colorSnow      (0.324, 0.322, 0.318, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.989843
		GasToDust   0.25
		Particles   2979
		GasBright   0.161939
		DustBright  0.621482
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.08228
		Eccentricity    0.78023
		Inclination     37.5545
		AscendingNode   81.8429
		ArgOfPericenter -111.053
		MeanAnomaly     46.6312
	}
}

Comet	"Ord Mantell C84"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            2.54886e-015
	Radius          0.189053
	InertiaMoment   0.396621

	Oblateness      0.0114606

	RotationPeriod  46.7085
	Obliquity       339.646
	EqAscendNode    220.937
	Precession      0

	AbsMagn         7.23438
	SlopeParam      4.97025
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.413 0.408 0.405)

	Surface
	{
		SurfStyle       0.347568
		OceanStyle      0.689142
		Randomize      (0.219, -0.193, -0.514)
		colorDistMagn   0.488871
		colorDistFreq   2.11111e-005
		detailScale     5.16242
		colorConversion true
		snowLevel       2
		tropicLatitude  0.367576
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.277692
		terraceProb     0.335073
		erosion         0
		montesMagn      0.371693
		montesFreq      2.86299
		montesSpiky     0.998717
		montesFraction  0.823019
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.34969e-005
		hillsFraction   0.662977
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229829
		craterFreq      0.23568
		craterDensity   0.781581
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.568921
		volcanoTemp     1559.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.165, 0.163, 0.162, 0.000)
		colorShelf     (0.175, 0.174, 0.172, 0.000)
		colorBeach     (0.186, 0.184, 0.182, 0.000)
		colorDesert    (0.196, 0.194, 0.192, 0.000)
		colorLowland   (0.206, 0.204, 0.203, 0.000)
		colorUpland    (0.217, 0.214, 0.213, 0.000)
		colorRock      (0.227, 0.225, 0.223, 0.000)
		colorSnow      (0.237, 0.235, 0.233, 1.000)
		BumpHeight      0.170148
		BumpOffset      0.0340296
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0602852
		GasToDust   0.25
		Particles   1101
		GasBright   0.124348
		DustBright  0.34356
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.09593
		Eccentricity    0.906512
		Inclination     -22.5121
		AscendingNode   118.662
		ArgOfPericenter 123.768
		MeanAnomaly     -174.095
	}
}

Comet	"Ord Mantell C85"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            1.97136e-011
	Radius          4.13847
	InertiaMoment   0.39916

	Oblateness      0.0169853

	RotationPeriod  44.8958
	Obliquity       292.852
	EqAscendNode    205.515
	Precession      0

	AbsMagn         2.54581
	SlopeParam      5.67101
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.524 0.515 0.510)

	Surface
	{
		SurfStyle       0.977057
		OceanStyle      0.193614
		Randomize      (-0.286, 0.358, 0.935)
		colorDistMagn   0.495935
		colorDistFreq   0.0130863
		detailScale     113.008
		colorConversion true
		snowLevel       2
		tropicLatitude  0.983441
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.28702
		terraceProb     0.301905
		erosion         0
		montesMagn      0.368024
		montesFreq      3.08379
		montesSpiky     0.995617
		montesFraction  0.288007
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0362481
		hillsFraction   0.647517
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245706
		craterFreq      0.276108
		craterDensity   0.805776
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.501884
		volcanoTemp     1739.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.178, 0.180, 0.204, 0.050)
		colorShelf     (0.210, 0.211, 0.235, 0.040)
		colorBeach     (0.241, 0.242, 0.265, 0.030)
		colorDesert    (0.272, 0.273, 0.301, 0.020)
		colorLowland   (0.304, 0.304, 0.332, 0.030)
		colorUpland    (0.335, 0.335, 0.362, 0.050)
		colorRock      (0.367, 0.366, 0.403, 0.020)
		colorSnow      (0.367, 0.366, 0.403, 1.000)
		BumpHeight      3.72462
		BumpOffset      0.744925
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.541477
		GasToDust   0.25
		Particles   2073
		GasBright   0.309336
		DustBright  0.643058
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.05064
		Eccentricity    0.853116
		Inclination     -38.3107
		AscendingNode   -31.718
		ArgOfPericenter 49.0019
		MeanAnomaly     58.396
	}
}

Comet	"Ord Mantell C86"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            1.5247e-007
	Radius          73.8871
	InertiaMoment   0.397739

	Oblateness      0.0135046

	RotationPeriod  43.0752
	Obliquity       246.057
	EqAscendNode    190.092
	Precession      0

	AbsMagn         10.5863
	SlopeParam      6.68595
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.523 0.465 0.399)

	Surface
	{
		SurfStyle       0.177356
		OceanStyle      0.190654
		Randomize      (-0.043, 0.254, -0.435)
		colorDistMagn   0.3055
		colorDistFreq   3.68078
		detailScale     2017.61
		colorConversion true
		snowLevel       2
		tropicLatitude  0.92022
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.74175
		terraceProb     0.118414
		erosion         0
		montesMagn      0.403525
		montesFreq      2.6919
		montesSpiky     0.94863
		montesFraction  0.387826
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.77769
		hillsFraction   0.521966
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.27512
		craterFreq      0.238208
		craterDensity   0.988699
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.434892
		volcanoTemp     1670.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.209, 0.186, 0.160, 0.000)
		colorShelf     (0.222, 0.198, 0.170, 0.000)
		colorBeach     (0.235, 0.209, 0.179, 0.000)
		colorDesert    (0.249, 0.221, 0.189, 0.000)
		colorLowland   (0.262, 0.233, 0.199, 0.000)
		colorUpland    (0.275, 0.244, 0.209, 0.000)
		colorRock      (0.288, 0.256, 0.219, 0.000)
		colorSnow      (0.301, 0.268, 0.229, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.244463
		DustBright  0.392418
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.07464
		Eccentricity    0.851436
		Inclination     -174.96
		AscendingNode   -80.7902
		ArgOfPericenter -6.55572
		MeanAnomaly     -112.461
	}
}

Comet	"Ord Mantell C87"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            4.69466e-015
	Radius          0.256148
	InertiaMoment   0.399601

	Oblateness      0.0200743

	RotationPeriod  41.2418
	Obliquity       199.263
	EqAscendNode    174.669
	Precession      0

	AbsMagn         7.0207
	SlopeParam      2.17758
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.749 0.621 0.559)

	Surface
	{
		SurfStyle       0.0477489
		OceanStyle      0.544406
		Randomize      (-0.922, 0.813, -0.736)
		colorDistMagn   0.666165
		colorDistFreq   3.91532e-005
		detailScale     6.99456
		colorConversion true
		snowLevel       2
		tropicLatitude  0.925972
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.760908
		terraceProb     0.449108
		erosion         0
		montesMagn      0.32328
		montesFreq      3.71948
		montesSpiky     0.987653
		montesFraction  0.723176
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000216459
		hillsFraction   0.727836
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221181
		craterFreq      0.26799
		craterDensity   0.888953
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.490944
		volcanoTemp     1539.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.300, 0.249, 0.224, 0.000)
		colorShelf     (0.318, 0.264, 0.238, 0.000)
		colorBeach     (0.337, 0.280, 0.252, 0.000)
		colorDesert    (0.356, 0.295, 0.266, 0.000)
		colorLowland   (0.375, 0.311, 0.280, 0.000)
		colorUpland    (0.393, 0.326, 0.293, 0.000)
		colorRock      (0.412, 0.342, 0.307, 0.000)
		colorSnow      (0.431, 0.357, 0.321, 1.000)
		BumpHeight      0.230533
		BumpOffset      0.0461067
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.093111
		GasToDust   0.25
		Particles   1167
		GasBright   0.14233
		DustBright  0.179037
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.03375
		Eccentricity    0.789168
		Inclination     -127.286
		AscendingNode   -42.2518
		ArgOfPericenter 69.0237
		MeanAnomaly     -29.1623
	}
}

Comet	"Ord Mantell C88"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            3.63099e-011
	Radius          4.5767
	InertiaMoment   0.398405

	Oblateness      0.0161563

	RotationPeriod  39.3908
	Obliquity       152.469
	EqAscendNode    159.247
	Precession      0

	AbsMagn         1.96078
	SlopeParam      2.9117
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.561 0.557 0.554)

	Surface
	{
		SurfStyle       0.341046
		OceanStyle      0.0264296
		Randomize      (-0.181, 0.710, 0.602)
		colorDistMagn   0.626739
		colorDistFreq   0.000490341
		detailScale     124.974
		colorConversion true
		snowLevel       2
		tropicLatitude  0.720535
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.615174
		terraceProb     0.524125
		erosion         0
		montesMagn      0.44601
		montesFreq      3.09184
		montesSpiky     0.948404
		montesFraction  0.756715
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0632776
		hillsFraction   0.807455
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230548
		craterFreq      0.259431
		craterDensity   1.02107
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.538263
		volcanoTemp     1461.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.224, 0.223, 0.222, 0.000)
		colorShelf     (0.238, 0.237, 0.235, 0.000)
		colorBeach     (0.252, 0.251, 0.249, 0.000)
		colorDesert    (0.266, 0.265, 0.263, 0.000)
		colorLowland   (0.280, 0.279, 0.277, 0.000)
		colorUpland    (0.294, 0.293, 0.291, 0.000)
		colorRock      (0.308, 0.307, 0.305, 0.000)
		colorSnow      (0.322, 0.321, 0.318, 1.000)
		BumpHeight      4.11903
		BumpOffset      0.823806
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.574303
		GasToDust   0.25
		Particles   2140
		GasBright   0.00155856
		DustBright  0.804296
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.07738
		Eccentricity    0.764426
		Inclination     106.411
		AscendingNode   -177.228
		ArgOfPericenter -118.339
		MeanAnomaly     104.812
	}
}

Comet	"Ord Mantell C89"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            2.80831e-007
	Radius          100.036
	InertiaMoment   0.394752

	Oblateness      0.0237207

	RotationPeriod  37.5167
	Obliquity       105.674
	EqAscendNode    143.824
	Precession      0

	AbsMagn         10.3342
	SlopeParam      3.52041
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.754 0.751 0.749)

	Surface
	{
		SurfStyle       0.423773
		OceanStyle      0.334618
		Randomize      (0.524, -0.690, 0.846)
		colorDistMagn   0.965702
		colorDistFreq   2.97144
		detailScale     2731.65
		colorConversion true
		snowLevel       2
		tropicLatitude  0.255628
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.457646
		terraceProb     0.478442
		erosion         0
		montesMagn      0.489543
		montesFreq      2.24959
		montesSpiky     0.962358
		montesFraction  0.574334
		dunesFraction   0
		hillsMagn       0
		hillsFreq       23.2614
		hillsFraction   0.625424
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.271176
		craterFreq      0.361758
		craterDensity   0.984982
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.554233
		volcanoTemp     1303.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.302, 0.300, 0.300, 0.000)
		colorShelf     (0.321, 0.319, 0.319, 0.000)
		colorBeach     (0.339, 0.338, 0.337, 0.000)
		colorDesert    (0.358, 0.357, 0.356, 0.000)
		colorLowland   (0.377, 0.375, 0.375, 0.000)
		colorUpland    (0.396, 0.394, 0.393, 0.000)
		colorRock      (0.415, 0.413, 0.412, 0.000)
		colorSnow      (0.434, 0.432, 0.431, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0299006
		DustBright  0.46044
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.06063
		Eccentricity    0.942898
		Inclination     -62.4943
		AscendingNode   170.391
		ArgOfPericenter -109.39
		MeanAnomaly     100.152
	}
}

Comet	"Ord Mantell C90"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            8.647e-015
	Radius          0.283489
	InertiaMoment   0.398929

	Oblateness      0.0197632

	RotationPeriod  35.6138
	Obliquity       58.8801
	EqAscendNode    128.402
	Precession      0

	AbsMagn         6.80419
	SlopeParam      4.08687
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.661 0.659 0.656)

	Surface
	{
		SurfStyle       0.708955
		OceanStyle      0.00997411
		Randomize      (0.926, 0.615, -0.081)
		colorDistMagn   0.120229
		colorDistFreq   4.34344e-005
		detailScale     7.74113
		colorConversion true
		snowLevel       2
		tropicLatitude  0.910069
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.5469
		terraceProb     0.504847
		erosion         0
		montesMagn      0.538108
		montesFreq      2.45301
		montesSpiky     0.797464
		montesFraction  0.313335
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000119622
		hillsFraction   0.619179
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246934
		craterFreq      0.171896
		craterDensity   0.842602
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.510006
		volcanoTemp     1566.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.258, 0.224, 0.184, 0.000)
		colorShelf     (0.264, 0.231, 0.210, 0.000)
		colorBeach     (0.311, 0.270, 0.249, 0.000)
		colorDesert    (0.337, 0.290, 0.243, 0.000)
		colorLowland   (0.370, 0.310, 0.276, 0.000)
		colorUpland    (0.410, 0.376, 0.335, 0.000)
		colorRock      (0.443, 0.409, 0.361, 0.000)
		colorSnow      (0.483, 0.435, 0.381, 1.000)
		BumpHeight      0.25514
		BumpOffset      0.0510279
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.125937
		GasToDust   0.25
		Particles   1234
		GasBright   0.117003
		DustBright  0.857824
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.08595
		Eccentricity    0.921758
		Inclination     12.729
		AscendingNode   61.6157
		ArgOfPericenter 146.893
		MeanAnomaly     -114.816
	}
}

Comet	"Ord Mantell C91"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            6.68783e-011
	Radius          6.19206
	InertiaMoment   0.397292

	Oblateness      0.029599

	RotationPeriod  33.6755
	Obliquity       12.0859
	EqAscendNode    112.979
	Precession      0

	AbsMagn         1.20734
	SlopeParam      4.66052
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.537 0.394 0.292)

	Surface
	{
		SurfStyle       0.796543
		OceanStyle      0.698309
		Randomize      (-0.663, -0.770, 0.330)
		colorDistMagn   0.646088
		colorDistFreq   0.0274039
		detailScale     169.085
		colorConversion true
		snowLevel       2
		tropicLatitude  0.848244
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.402553
		terraceProb     0.158277
		erosion         0
		montesMagn      0.411056
		montesFreq      3.12839
		montesSpiky     0.904723
		montesFraction  0.448965
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0818039
		hillsFraction   0.429299
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241774
		craterFreq      0.160612
		craterDensity   0.905117
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.494334
		volcanoTemp     1587.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.209, 0.134, 0.082, 0.000)
		colorShelf     (0.215, 0.138, 0.093, 0.000)
		colorBeach     (0.252, 0.161, 0.111, 0.000)
		colorDesert    (0.274, 0.173, 0.108, 0.000)
		colorLowland   (0.301, 0.185, 0.123, 0.000)
		colorUpland    (0.333, 0.224, 0.149, 0.000)
		colorRock      (0.360, 0.244, 0.161, 0.000)
		colorSnow      (0.392, 0.260, 0.169, 1.000)
		BumpHeight      5.57285
		BumpOffset      1.11457
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.607129
		GasToDust   0.25
		Particles   2206
		GasBright   0.118063
		DustBright  0.541251
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.01438
		Eccentricity    0.894028
		Inclination     -51.9772
		AscendingNode   116.159
		ArgOfPericenter 151.473
		MeanAnomaly     -54.2115
	}
}

Comet	"Ord Mantell C92"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            5.17255e-007
	Radius          110.794
	InertiaMoment   0.399387

	Oblateness      0.0249442

	RotationPeriod  31.6948
	Obliquity       325.292
	EqAscendNode    97.5564
	Precession      0

	AbsMagn         10.091
	SlopeParam      5.2958
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.707 0.705 0.703)

	Surface
	{
		SurfStyle       0.511692
		OceanStyle      0.766845
		Randomize      (-0.197, -0.812, 0.965)
		colorDistMagn   0.366883
		colorDistFreq   4.26609
		detailScale     3025.43
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999459
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.653998
		terraceProb     0.243564
		erosion         0
		montesMagn      0.570341
		montesFreq      3.78482
		montesSpiky     0.881625
		montesFraction  0.683191
		dunesFraction   0
		hillsMagn       0
		hillsFreq       36.0363
		hillsFraction   0.563588
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233002
		craterFreq      0.477421
		craterDensity   0.908609
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.544246
		volcanoTemp     1328.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.276, 0.240, 0.197, 0.000)
		colorShelf     (0.283, 0.247, 0.225, 0.000)
		colorBeach     (0.332, 0.289, 0.267, 0.000)
		colorDesert    (0.361, 0.310, 0.260, 0.000)
		colorLowland   (0.396, 0.331, 0.295, 0.000)
		colorUpland    (0.439, 0.402, 0.358, 0.000)
		colorRock      (0.474, 0.437, 0.387, 0.000)
		colorSnow      (0.516, 0.465, 0.408, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.081864
		DustBright  0.261936
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00602
		Eccentricity    0.890869
		Inclination     -103.823
		AscendingNode   -114.503
		ArgOfPericenter 63.7682
		MeanAnomaly     59.8801
	}
}

Comet	"Ord Mantell C93"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            1.59267e-014
	Radius          0.383288
	InertiaMoment   0.398102

	Oblateness      0.0381078

	RotationPeriod  29.6634
	Obliquity       278.497
	EqAscendNode    82.1338
	Precession      0

	AbsMagn         6.58411
	SlopeParam      6.10358
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.561 0.448 0.369)

	Surface
	{
		SurfStyle       0.858284
		OceanStyle      0.881508
		Randomize      (0.113, 0.358, 0.172)
		colorDistMagn   0.595721
		colorDistFreq   0.000125911
		detailScale     10.4663
		colorConversion true
		snowLevel       2
		tropicLatitude  0.797651
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.498826
		terraceProb     0.285384
		erosion         0
		montesMagn      0.638182
		montesFreq      2.5656
		montesSpiky     0.994071
		montesFraction  0.472866
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000289344
		hillsFraction   0.628951
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.215942
		craterFreq      0.252466
		craterDensity   0.725958
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.536873
		volcanoTemp     1442.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.191, 0.157, 0.147, 0.050)
		colorShelf     (0.225, 0.184, 0.170, 0.040)
		colorBeach     (0.258, 0.211, 0.192, 0.030)
		colorDesert    (0.292, 0.238, 0.218, 0.020)
		colorLowland   (0.326, 0.265, 0.240, 0.030)
		colorUpland    (0.359, 0.291, 0.262, 0.050)
		colorRock      (0.393, 0.318, 0.291, 0.020)
		colorSnow      (0.393, 0.318, 0.291, 1.000)
		BumpHeight      0.344959
		BumpOffset      0.0689919
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.158763
		GasToDust   0.25
		Particles   1300
		GasBright   0.246134
		DustBright  0.582153
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.07013
		Eccentricity    0.809334
		Inclination     -76.118
		AscendingNode   48.3112
		ArgOfPericenter -18.8538
		MeanAnomaly     134.592
	}
}

Comet	"Ord Mantell C94"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            1.23181e-010
	Radius          6.86277
	InertiaMoment   0.399815

	Oblateness      0.0329469

	RotationPeriod  27.5719
	Obliquity       231.703
	EqAscendNode    66.7112
	Precession      0

	AbsMagn         0.0855522
	SlopeParam      7.64022
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.427 0.420 0.417)

	Surface
	{
		SurfStyle       0.815471
		OceanStyle      0.115971
		Randomize      (-0.650, 0.416, 0.649)
		colorDistMagn   0.831206
		colorDistFreq   0.0106995
		detailScale     187.399
		colorConversion true
		snowLevel       2
		tropicLatitude  0.839475
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.341942
		terraceProb     0.305216
		erosion         0
		montesMagn      0.523927
		montesFreq      3.07441
		montesSpiky     0.973632
		montesFraction  0.440274
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.144706
		hillsFraction   0.540998
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220404
		craterFreq      0.201608
		craterDensity   0.944729
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.469927
		volcanoTemp     1589.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.167, 0.143, 0.117, 0.000)
		colorShelf     (0.171, 0.147, 0.133, 0.000)
		colorBeach     (0.201, 0.172, 0.159, 0.000)
		colorDesert    (0.218, 0.185, 0.154, 0.000)
		colorLowland   (0.239, 0.197, 0.175, 0.000)
		colorUpland    (0.265, 0.239, 0.213, 0.000)
		colorRock      (0.286, 0.260, 0.229, 0.000)
		colorSnow      (0.312, 0.277, 0.242, 1.000)
		BumpHeight      6.17649
		BumpOffset      1.2353
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.639955
		GasToDust   0.25
		Particles   2272
		GasBright   0.182653
		DustBright  0.330121
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.07768
		Eccentricity    0.752377
		Inclination     -96.1763
		AscendingNode   -38.5657
		ArgOfPericenter -139.977
		MeanAnomaly     -155.725
	}
}

Comet	"Ord Mantell C95"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            3.79284e-018
	Radius          0.0237261
	InertiaMoment   0.398682

	Oblateness      0.0518429

	RotationPeriod  25.409
	Obliquity       184.909
	EqAscendNode    51.2886
	Precession      0

	AbsMagn         9.85538
	SlopeParam      2.56388
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.599 0.594 0.590)

	Surface
	{
		SurfStyle       0.0105564
		OceanStyle      0.674764
		Randomize      (0.943, -0.949, -0.737)
		colorDistMagn   0.743516
		colorDistFreq   2.83836e-007
		detailScale     0.647881
		colorConversion true
		snowLevel       2
		tropicLatitude  0.309805
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.428477
		terraceProb     0.274623
		erosion         0
		montesMagn      0.244379
		montesFreq      2.81878
		montesSpiky     0.99925
		montesFraction  0.263363
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.84286e-006
		hillsFraction   0.675901
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.274794
		craterFreq      0.17598
		craterDensity   0.968764
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.499252
		volcanoTemp     1557.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.240, 0.238, 0.236, 0.000)
		colorShelf     (0.255, 0.252, 0.251, 0.000)
		colorBeach     (0.270, 0.267, 0.265, 0.000)
		colorDesert    (0.285, 0.282, 0.280, 0.000)
		colorLowland   (0.300, 0.297, 0.295, 0.000)
		colorUpland    (0.315, 0.312, 0.310, 0.000)
		colorRock      (0.330, 0.327, 0.324, 0.000)
		colorSnow      (0.345, 0.341, 0.339, 1.000)
		BumpHeight      0.0213535
		BumpOffset      0.0042707
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.414113
		DustBright  0.583147
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.05948
		Eccentricity    0.789193
		Inclination     -162.563
		AscendingNode   -90.563
		ArgOfPericenter -140.818
		MeanAnomaly     -22.5564
	}
}

Comet	"Ord Mantell C96"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            2.93349e-014
	Radius          0.425089
	InertiaMoment   0.396643

	Oblateness      0.0460426

	RotationPeriod  23.1613
	Obliquity       138.114
	EqAscendNode    35.866
	Precession      0

	AbsMagn         6.35965
	SlopeParam      3.22092
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.685 0.684 0.681)

	Surface
	{
		SurfStyle       0.421284
		OceanStyle      0.359369
		Randomize      (0.896, 0.806, 0.354)
		colorDistMagn   0.837978
		colorDistFreq   6.4883e-005
		detailScale     11.6078
		colorConversion true
		snowLevel       2
		tropicLatitude  0.928609
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.581826
		terraceProb     0.37609
		erosion         0
		montesMagn      0.43862
		montesFreq      2.56696
		montesSpiky     0.995399
		montesFraction  0.666715
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000404289
		hillsFraction   0.717292
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.26333
		craterFreq      0.219575
		craterDensity   0.777415
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.389461
		volcanoTemp     1530.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.274, 0.274, 0.273, 0.000)
		colorShelf     (0.291, 0.291, 0.290, 0.000)
		colorBeach     (0.308, 0.308, 0.307, 0.000)
		colorDesert    (0.326, 0.325, 0.324, 0.000)
		colorLowland   (0.343, 0.342, 0.341, 0.000)
		colorUpland    (0.360, 0.359, 0.358, 0.000)
		colorRock      (0.377, 0.376, 0.375, 0.000)
		colorSnow      (0.394, 0.393, 0.392, 1.000)
		BumpHeight      0.38258
		BumpOffset      0.076516
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.191589
		GasToDust   0.25
		Particles   1366
		GasBright   0.32335
		DustBright  0.358397
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.02324
		Eccentricity    0.866151
		Inclination     -106.047
		AscendingNode   -154.034
		ArgOfPericenter -104.046
		MeanAnomaly     -149.21
	}
}

Comet	"Ord Mantell C97"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            2.26884e-010
	Radius          9.26701
	InertiaMoment   0.399166

	Oblateness      0.077111

	RotationPeriod  20.8122
	Obliquity       91.3201
	EqAscendNode    20.4435
	Precession      0

	AbsMagn         18.4672
	SlopeParam      3.80172
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.659 0.515 0.445)

	Surface
	{
		SurfStyle       0.0500402
		OceanStyle      0.479621
		Randomize      (0.372, -0.080, -0.481)
		colorDistMagn   0.596475
		colorDistFreq   0.0565829
		detailScale     253.051
		colorConversion true
		snowLevel       2
		tropicLatitude  0.243133
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.478016
		terraceProb     0.128422
		erosion         0
		montesMagn      0.534969
		montesFreq      3.67056
		montesSpiky     0.896599
		montesFraction  0.529483
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.196299
		hillsFraction   0.373391
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257709
		craterFreq      0.219786
		craterDensity   0.817656
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.590358
		volcanoTemp     1475.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.264, 0.206, 0.178, 0.000)
		colorShelf     (0.280, 0.219, 0.189, 0.000)
		colorBeach     (0.297, 0.232, 0.200, 0.000)
		colorDesert    (0.313, 0.245, 0.211, 0.000)
		colorLowland   (0.330, 0.257, 0.223, 0.000)
		colorUpland    (0.346, 0.270, 0.234, 0.000)
		colorRock      (0.363, 0.283, 0.245, 0.000)
		colorSnow      (0.379, 0.296, 0.256, 1.000)
		BumpHeight      8.34031
		BumpOffset      1.66806
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.672781
		GasToDust   0.25
		Particles   2338
		GasBright   0.0122107
		DustBright  0.354023
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.02724
		Eccentricity    0.904122
		Inclination     -98.6439
		AscendingNode   -170.031
		ArgOfPericenter 175.861
		MeanAnomaly     -1.60056
	}
}

Comet	"Ord Mantell C98"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            6.98595e-018
	Radius          0.0263306
	InertiaMoment   0.397748

	Oblateness      0.0735746

	RotationPeriod  18.3412
	Obliquity       44.5258
	EqAscendNode    5.02087
	Precession      0

	AbsMagn         9.626
	SlopeParam      4.36595
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.598 0.595 0.590)

	Surface
	{
		SurfStyle       0.683629
		OceanStyle      0.362228
		Randomize      (-0.270, 0.269, -0.555)
		colorDistMagn   0.721752
		colorDistFreq   9.20866e-008
		detailScale     0.719
		colorConversion true
		snowLevel       2
		tropicLatitude  0.983831
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.719062
		terraceProb     0.258002
		erosion         0
		montesMagn      0.272088
		montesFreq      3.27819
		montesSpiky     0.912802
		montesFraction  0.170726
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.57034e-006
		hillsFraction   0.635457
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252174
		craterFreq      0.238239
		craterDensity   1.02526
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.457957
		volcanoTemp     1504.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.233, 0.202, 0.165, 0.000)
		colorShelf     (0.239, 0.208, 0.189, 0.000)
		colorBeach     (0.281, 0.244, 0.224, 0.000)
		colorDesert    (0.305, 0.262, 0.218, 0.000)
		colorLowland   (0.335, 0.280, 0.248, 0.000)
		colorUpland    (0.371, 0.339, 0.301, 0.000)
		colorRock      (0.401, 0.369, 0.324, 0.000)
		colorSnow      (0.437, 0.393, 0.342, 1.000)
		BumpHeight      0.0236975
		BumpOffset      0.0047395
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0785951
		DustBright  0.772125
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.05412
		Eccentricity    0.816755
		Inclination     -85.1128
		AscendingNode   -110.077
		ArgOfPericenter -133.627
		MeanAnomaly     -5.7217
	}
}

Comet	"Ord Mantell C99"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            5.40313e-014
	Radius          0.573671
	InertiaMoment   0.399606

	Oblateness      0.134831

	RotationPeriod  15.7219
	Obliquity       357.731
	EqAscendNode    349.598
	Precession      0

	AbsMagn         6.12991
	SlopeParam      4.96158
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.631 0.555 0.508)

	Surface
	{
		SurfStyle       0.936171
		OceanStyle      0.0565095
		Randomize      (-0.326, -0.047, -0.830)
		colorDistMagn   0.793122
		colorDistFreq   5.47148e-005
		detailScale     15.665
		colorConversion true
		snowLevel       2
		tropicLatitude  0.397989
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.585685
		terraceProb     0.35269
		erosion         0
		montesMagn      0.518757
		montesFreq      3.441
		montesSpiky     0.89005
		montesFraction  0.498276
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000615577
		hillsFraction   0.498096
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264434
		craterFreq      0.193438
		craterDensity   0.973102
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.490021
		volcanoTemp     1404.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.214, 0.194, 0.203, 0.050)
		colorShelf     (0.252, 0.227, 0.234, 0.040)
		colorBeach     (0.290, 0.261, 0.264, 0.030)
		colorDesert    (0.328, 0.294, 0.300, 0.020)
		colorLowland   (0.366, 0.327, 0.330, 0.030)
		colorUpland    (0.404, 0.361, 0.361, 0.050)
		colorRock      (0.441, 0.394, 0.401, 0.020)
		colorSnow      (0.441, 0.394, 0.401, 1.000)
		BumpHeight      0.516304
		BumpOffset      0.103261
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.224415
		GasToDust   0.25
		Particles   1433
		GasBright   0.0810473
		DustBright  0.454159
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.02995
		Eccentricity    0.892187
		Inclination     -21.2989
		AscendingNode   19.2012
		ArgOfPericenter 175.388
		MeanAnomaly     76.3334
	}
}

Comet	"Ord Mantell C100"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            4.17893e-010
	Radius          10.2906
	InertiaMoment   0.398412

	Oblateness      0.148347

	RotationPeriod  12.9194
	Obliquity       310.937
	EqAscendNode    334.176
	Precession      0

	AbsMagn         15.8231
	SlopeParam      5.6601
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.560 0.554 0.548)

	Surface
	{
		SurfStyle       0.815837
		OceanStyle      0.732063
		Randomize      (-0.567, -0.184, 0.187)
		colorDistMagn   0.265904
		colorDistFreq   0.070701
		detailScale     281.001
		colorConversion true
		snowLevel       2
		tropicLatitude  0.885487
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.558415
		terraceProb     0.320665
		erosion         0
		montesMagn      0.421371
		montesFreq      3.42749
		montesSpiky     0.924339
		montesFraction  0.667656
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.244026
		hillsFraction   0.551438
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240471
		craterFreq      0.159313
		craterDensity   0.753189
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.462657
		volcanoTemp     1354.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.219, 0.189, 0.153, 0.000)
		colorShelf     (0.224, 0.194, 0.175, 0.000)
		colorBeach     (0.263, 0.227, 0.208, 0.000)
		colorDesert    (0.286, 0.244, 0.203, 0.000)
		colorLowland   (0.314, 0.261, 0.230, 0.000)
		colorUpland    (0.347, 0.316, 0.280, 0.000)
		colorRock      (0.375, 0.344, 0.301, 0.000)
		colorSnow      (0.409, 0.366, 0.318, 1.000)
		BumpHeight      9.2615
		BumpOffset      1.8523
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.705607
		GasToDust   0.25
		Particles   2405
		GasBright   0.0462403
		DustBright  0.173453
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0231
		Eccentricity    0.835124
		Inclination     166.321
		AscendingNode   15.6908
		ArgOfPericenter -174.941
		MeanAnomaly     -150.082
	}
}

Comet	"Ord Mantell C101"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            1.28673e-017
	Radius          0.0355137
	InertiaMoment   0.394901

	Oblateness      0.249

	RotationPeriod  9.88632
	Obliquity       264.143
	EqAscendNode    318.753
	Precession      0

	AbsMagn         9.40185
	SlopeParam      6.66706
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.748 0.744 0.740)

	Surface
	{
		SurfStyle       0.828268
		OceanStyle      0.580632
		Randomize      (0.377, 0.933, 0.158)
		colorDistMagn   0.364822
		colorDistFreq   6.37145e-007
		detailScale     0.969761
		colorConversion true
		snowLevel       2
		tropicLatitude  0.749502
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.416195
		terraceProb     0.243373
		erosion         0
		montesMagn      0.502564
		montesFreq      2.49877
		montesSpiky     0.944645
		montesFraction  0.790851
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.97604e-006
		hillsFraction   0.874036
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2661
		craterFreq      0.208643
		craterDensity   0.816094
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.443337
		volcanoTemp     1452.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.292, 0.253, 0.207, 0.000)
		colorShelf     (0.299, 0.260, 0.237, 0.000)
		colorBeach     (0.351, 0.305, 0.281, 0.000)
		colorDesert    (0.381, 0.327, 0.274, 0.000)
		colorLowland   (0.419, 0.350, 0.311, 0.000)
		colorUpland    (0.464, 0.424, 0.378, 0.000)
		colorRock      (0.501, 0.461, 0.407, 0.000)
		colorSnow      (0.546, 0.491, 0.429, 1.000)
		BumpHeight      0.0319624
		BumpOffset      0.00639247
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.189792
		DustBright  0.514387
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.02636
		Eccentricity    0.835917
		Inclination     -84.4953
		AscendingNode   48.8012
		ArgOfPericenter 161.604
		MeanAnomaly     39.0767
	}
}

Comet	"Ord Mantell C102"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            9.95188e-014
	Radius          0.637407
	InertiaMoment   0.398935

	Oblateness      0.249

	RotationPeriod  6.55532
	Obliquity       217.349
	EqAscendNode    303.331
	Precession      0

	AbsMagn         5.89382
	SlopeParam      2.16586
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.754 0.682 0.579)

	Surface
	{
		SurfStyle       0.35935
		OceanStyle      0.340232
		Randomize      (0.063, -0.940, 0.443)
		colorDistMagn   0.151146
		colorDistFreq   0.000135863
		detailScale     17.4055
		colorConversion true
		snowLevel       2
		tropicLatitude  0.948718
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.309879
		terraceProb     0.233105
		erosion         0
		montesMagn      0.53081
		montesFreq      2.23505
		montesSpiky     0.967238
		montesFraction  0.888178
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000716966
		hillsFraction   0.677973
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24512
		craterFreq      0.248861
		craterDensity   0.912466
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51324
		volcanoTemp     1519.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.302, 0.273, 0.232, 0.000)
		colorShelf     (0.321, 0.290, 0.246, 0.000)
		colorBeach     (0.339, 0.307, 0.261, 0.000)
		colorDesert    (0.358, 0.324, 0.275, 0.000)
		colorLowland   (0.377, 0.341, 0.290, 0.000)
		colorUpland    (0.396, 0.358, 0.304, 0.000)
		colorRock      (0.415, 0.375, 0.318, 0.000)
		colorSnow      (0.434, 0.392, 0.333, 1.000)
		BumpHeight      0.573666
		BumpOffset      0.114733
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.257241
		GasToDust   0.25
		Particles   1499
		GasBright   0.127703
		DustBright  0.260963
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.06947
		Eccentricity    0.839134
		Inclination     83.1465
		AscendingNode   46.9741
		ArgOfPericenter 151.712
		MeanAnomaly     23.6044
	}
}

Comet	"Ord Mantell C103"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            7.69707e-010
	Radius          13.872
	InertiaMoment   0.397305

	Oblateness      0.249

	RotationPeriod  2.82567
	Obliquity       170.554
	EqAscendNode    287.908
	Precession      0

	AbsMagn         14.7375
	SlopeParam      2.90274
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.610 0.604 0.601)

	Surface
	{
		SurfStyle       0.420588
		OceanStyle      0.0630999
		Randomize      (0.763, 0.803, 0.362)
		colorDistMagn   0.763002
		colorDistFreq   0.126356
		detailScale     378.798
		colorConversion true
		snowLevel       2
		tropicLatitude  0.938264
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.700158
		terraceProb     0.269553
		erosion         0
		montesMagn      0.525545
		montesFreq      4.2993
		montesSpiky     0.733025
		montesFraction  0.625847
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.401595
		hillsFraction   0.375877
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248673
		craterFreq      0.220489
		craterDensity   0.814139
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.496778
		volcanoTemp     1470.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.244, 0.242, 0.240, 0.000)
		colorShelf     (0.259, 0.257, 0.255, 0.000)
		colorBeach     (0.274, 0.272, 0.270, 0.000)
		colorDesert    (0.290, 0.287, 0.285, 0.000)
		colorLowland   (0.305, 0.302, 0.300, 0.000)
		colorUpland    (0.320, 0.317, 0.315, 0.000)
		colorRock      (0.335, 0.332, 0.330, 0.000)
		colorSnow      (0.350, 0.348, 0.345, 1.000)
		BumpHeight      12.4848
		BumpOffset      2.49696
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.738433
		GasToDust   0.25
		Particles   2471
		GasBright   0.338445
		DustBright  0.534707
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.07704
		Eccentricity    0.888166
		Inclination     75.8491
		AscendingNode   48.8289
		ArgOfPericenter 126.181
		MeanAnomaly     -169.941
	}
}

Comet	"Ord Mantell C104"
{
	ParentBody     "Ord Mantell"
	Class	       "Asteroid"

	Mass            2.36998e-017
	Radius          0.0394815
	InertiaMoment   0.399392

	Oblateness      0.00162111

	RotationPeriod  123.556
	Obliquity       123.76
	EqAscendNode    272.485
	Precession      0

	AbsMagn         9.18202
	SlopeParam      3.51247
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.536 0.532 0.528)

	Surface
	{
		SurfStyle       0.706234
		OceanStyle      0.683983
		Randomize      (-0.662, 0.797, 0.037)
		colorDistMagn   0.87069
		colorDistFreq   5.06915e-007
		detailScale     1.07811
		colorConversion true
		snowLevel       2
		tropicLatitude  0.462261
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.442535
		terraceProb     0.129727
		erosion         0
		montesMagn      0.569578
		montesFreq      2.40062
		montesSpiky     0.836429
		montesFraction  0.442292
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.4743e-006
		hillsFraction   0.732922
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252774
		craterFreq      0.246402
		craterDensity   0.830857
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.5124
		volcanoTemp     1838.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.209, 0.181, 0.148, 0.000)
		colorShelf     (0.215, 0.186, 0.169, 0.000)
		colorBeach     (0.252, 0.218, 0.200, 0.000)
		colorDesert    (0.274, 0.234, 0.195, 0.000)
		colorLowland   (0.300, 0.250, 0.222, 0.000)
		colorUpland    (0.333, 0.303, 0.269, 0.000)
		colorRock      (0.359, 0.330, 0.290, 0.000)
		colorSnow      (0.392, 0.351, 0.306, 1.000)
		BumpHeight      0.0355333
		BumpOffset      0.00710667
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.249074
		DustBright  0.308565
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.02791
		Eccentricity    0.845592
		Inclination     141.78
		AscendingNode   151.066
		ArgOfPericenter 101.403
		MeanAnomaly     -145.164
	}
}