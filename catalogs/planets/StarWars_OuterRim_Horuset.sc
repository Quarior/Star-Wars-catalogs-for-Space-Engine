// http://starwars.wikia.com/wiki/Korriban
// Region : Outer Rim
// Sector : Sith Worlds Sector
// Grid location : R5
// X : 9254.62, Y : 6991.44, Z : -28.79846208902734
Planet	"Korriban/Moraband/Pesegam"
{
	ParentBody     "Horuset"
	Class	       "Desert"

	Mass            2.44173
	Radius          8445.02
	InertiaMoment   0.328333

	Oblateness      0.00230049

	RotationPeriod  28.0161
	Obliquity       11.8304
	EqAscendNode    -34.7784

	AlbedoBond      0.368232
	AlbedoGeom      0.441879
	Brightness      2
	Color          (0.706 0.597 0.516)

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Terrestrial"
		Panspermia "false"
	} Surface
	{
		SurfStyle       0.502381
		OceanStyle      0.99779
		Randomize      (0.700, 0.536, -0.870)
		colorDistMagn   0.0639906
		colorDistFreq   1048.41
		detailScale     21721.1
		colorConversion true
		drivenDarkening -1
		seaLevel        0.012
		snowLevel       0.611111
		tropicLatitude  0.181719
		icecapLatitude  0.822384
		icecapHeight    0.04984
		climatePole     0.936508
		climateTropic   0.698413
		climateEquator  0.722222
		heightTempGrad  0.553551
		tropicWidth     0.105121
		mainFreq        1.27655
		venusFreq       0.611111
		venusMagn       0.130026
		mareFreq        0.001
		mareDensity     0
		terraceProb     0.436112
		erosion         0
		montesMagn      0.169457
		montesFreq      419.919
		montesSpiky     0.92832
		montesFraction  0.600363
		dunesMagn       0.043328
		dunesFreq       75.0709
		dunesFraction   0.818512
		hillsMagn       0.168231
		hillsFreq       1000
		hillsFraction   0
		hills2Fraction  0
		riversMagn      28.5714
		riversFreq      3.33333
		riversSin       4.87036
		riversOctaves   3
		canyonsMagn     0.06954
		canyonsFreq     75.3968
		canyonFraction  0
		cracksMagn      0.120555
		cracksFreq      0.740052
		cracksOctaves   0
		craterMagn      0.615639
		craterFreq      19.7148
		craterDensity   0
		craterOctaves   0
		craterRayedFactor 0
		volcanoMagn     0.607747
		volcanoFreq     0.720176
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 0.52381
		volcanoFlows    0.752702
		volcanoRadius   0.521116
		volcanoTemp     1707.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.4738
		stripeFluct     0
		stripeTwist     0
		cycloneMagn     2.74319
		cycloneFreq     1.01821
		cycloneDensity  0.361448
		cycloneOctaves  2
		colorSea       (0.640, 0.620, 0.420, 0.000)
		colorShelf     (0.680, 0.620, 0.470, 0.000)
		colorBeach     (0.740, 0.730, 0.610, 0.000)
		colorDesert    (0.450, 0.420, 0.380, 0.000)
		colorLowland   (0.530, 0.480, 0.400, 0.000)
		colorUpland    (0.600, 0.540, 0.420, 0.000)
		colorRock      (0.478, 0.303, 0.137, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 0.769)
		colorLowPlants (0.530, 0.480, 0.400, 0.000)
		colorUpPlants  (0.600, 0.540, 0.420, 0.000)
		BumpHeight      13.8312
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
		Height          11.2578
		Velocity        77.0601
		BumpHeight      4.25781
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.33333
		mainOctaves     10
		Coverage        0.238095
		stripeZones     2.4738
		stripeFluct     0
		stripeTwist     0
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Mars"
		Height          81.864
	        Density 1.7551	Pressure        1.38962
		Greenhouse      33.1347
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0
		Saturation      1

		Composition
		{
			N2    	79.7237
			O2    	17.8611
			Ar    	1.75496
			Ne    	0.36842
			CO2   	0.286412
			H2O   	0.00548312
		}
	}

	Aurora
	{
		Height      77.7598
		NorthLat    53.6695
		NorthLon    56.4404
		NorthRadius 2245.72
		NorthWidth  722.067
		NorthRings  3
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -44.4601
		SouthLon    257.065
		SouthRadius 2622.45
		SouthWidth  788.035
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
		SemiMajorAxis   2.10685
		Period          2.49123
		Eccentricity    0.0038612
		Inclination     -1.63933
		AscendingNode   -31.656
		ArgOfPericenter 314.846
		MeanAnomaly     72.0484
	}
}




Moon	"Korriban.1"
{
	ParentBody     "Korriban"
	Class	       "Selena"

	Mass            0.00076653
	Radius          675.923
	InertiaMoment   0.398255

	Oblateness      0.0768858

	Obliquity       -2.10542
	EqAscendNode    159.675
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.852 0.834 0.820)

	Surface
	{
		SurfStyle       0.509108
		OceanStyle      0.895259
		Randomize      (0.071, 0.414, 0.344)
		colorDistMagn   0.0587335
		colorDistFreq   105.22
		detailScale     2252.92
		colorConversion true
		drivenDarkening 0
		seaLevel        0.217236
		snowLevel       2
		tropicLatitude  0.0129645
		icecapLatitude  10
		icecapHeight    0.164148
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.59754
		venusFreq       2
		venusMagn       0
		mareFreq        0.202393
		mareDensity     0.00470697
		terraceProb     0.362895
		erosion         0
		montesMagn      0.0610558
		montesFreq      34.0968
		montesSpiky     0.969099
		montesFraction  0.362388
		dunesMagn       0.0438663
		dunesFreq       1154.69
		dunesFraction   0.419731
		hillsMagn       0.126329
		hillsFreq       102.613
		hillsFraction   0.227606
		hills2Fraction  0
		riversMagn      64.3653
		riversFreq      2.46423
		riversSin       6.44107
		riversOctaves   0
		canyonsMagn     0.513254
		canyonsFreq     0.337281
		canyonFraction  0.4635
		cracksMagn      0.0676918
		cracksFreq      0.554699
		cracksOctaves   0
		craterMagn      0.553827
		craterFreq      2.79696
		craterDensity   0.987752
		craterOctaves   10
		craterRayedFactor 0
		volcanoMagn     0.168603
		volcanoFreq     0.55343
		volcanoDensity  0.176983
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.242349
		volcanoRadius   0.132285
		volcanoTemp     1302.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.430, 0.400, 0.370, 0.000)
		colorShelf     (0.620, 0.600, 0.530, 0.000)
		colorBeach     (0.482, 0.473, 0.417, 0.000)
		colorDesert    (0.505, 0.480, 0.425, 0.000)
		colorLowland   (0.397, 0.356, 0.325, 0.000)
		colorUpland    (0.583, 0.550, 0.479, 0.000)
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
		SemiMajorAxis   0.000167811
		Period          0.000804439
		Eccentricity    0.0014954
		Inclination     -2.10542
		AscendingNode   159.675
		ArgOfPericenter 248.515
		MeanAnomaly     25.3756
	}
}



Moon	"Korriban.2"
{
	ParentBody     "Korriban"
	Class	       "Desert"

	Mass            0.0244804
	Radius          2096.42
	InertiaMoment   0.345042

	Oblateness      0.00317414

	Obliquity       -0.30512
	EqAscendNode    38.1185
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.764 0.634 0.535)

	Surface
	{
		SurfStyle       0.937867
		OceanStyle      0.62785
		Randomize      (0.855, -0.233, 0.235)
		colorDistMagn   0.049368
		colorDistFreq   198.732
		detailScale     5392.11
		colorConversion true
		seaLevel        0.0843613
		snowLevel       2
		tropicLatitude  0.010066
		icecapLatitude  0.912367
		icecapHeight    0.0890877
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.936868
		venusFreq       2
		venusMagn       0.396888
		mareFreq        1.13157
		mareDensity     0.0457529
		terraceProb     0.301346
		erosion         0
		montesMagn      0.125395
		montesFreq      115.751
		montesSpiky     0.998288
		montesFraction  0.706842
		dunesMagn       0.038656
		dunesFreq       26.1841
		dunesFraction   0.671847
		hillsMagn       0.145911
		hillsFreq       247.436
		hillsFraction   0
		hills2Fraction  0
		riversMagn      63.1841
		riversFreq      3.09912
		riversSin       5.12607
		riversOctaves   0
		canyonsMagn     0.0459676
		canyonsFreq     60.106
		canyonFraction  0
		cracksMagn      0.089841
		cracksFreq      0.214894
		cracksOctaves   0
		craterMagn      0.51865
		craterFreq      5.07394
		craterDensity   0.424163
		craterOctaves   5.05523
		volcanoMagn     0.423331
		volcanoFreq     0.830589
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.647655
		volcanoRadius   0.309206
		volcanoTemp     1661.64
		lavaCoverTidal  0.303292
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
		Hapke           0.628417
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
		Height          47.3299
		Density         0.0361999
		Pressure        0.0126963
		Greenhouse      0.188759
		Bright          8.20373
		Opacity         1
		SkyLight        2.73458
		Hue             0
		Saturation      1

		Composition
		{
			SO2   	98.1915
			CO2   	1.79211
			C3H8  	0.0160885
			Cl2   	0.000275578
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000349172
		Period          0.00238979
		Eccentricity    0.0084831
		Inclination     -0.30512
		AscendingNode   38.1185
		ArgOfPericenter -107.486
		MeanAnomaly     95.1295
	}
}



Moon	"Korriban.3"
{
	ParentBody     "Korriban"
	Class	       "Selena"

	Mass            0.00291543
	Radius          921.05
	InertiaMoment   0.398618

	Obliquity       3.15078
	EqAscendNode    23.2078
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.907 0.874 0.836)

	Surface
	{
		SurfStyle       0.706842
		OceanStyle      0.671847
		Randomize      (0.876, 0.256, 0.071)
		colorDistMagn   0.049368
		colorDistFreq   87.3119
		detailScale     2368.99
		colorConversion true
		drivenDarkening 0
		seaLevel        0.216412
		snowLevel       2
		tropicLatitude  0.107525
		icecapLatitude  10
		icecapHeight    0.174515
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.94679
		venusFreq       0.987552
		venusMagn       0
		mareFreq        0.248049
		mareDensity     0.00266534
		terraceProb     0.112568
		erosion         0
		montesMagn      0.0650466
		montesFreq      50.8545
		montesSpiky     0.998288
		montesFraction  0.509108
		dunesMagn       0.0294285
		dunesFreq       1246.02
		dunesFraction   0.895259
		hillsMagn       0.131586
		hillsFreq       107.074
		hillsFraction   0.362388
		hills2Fraction  0
		riversMagn      60.7015
		riversFreq      2.3895
		riversSin       5.79617
		riversOctaves   0
		canyonsMagn     0.53935
		canyonsFreq     0.369348
		canyonFraction  0.419731
		cracksMagn      0.0428057
		cracksFreq      0.516611
		cracksOctaves   0
		craterMagn      0.51865
		craterFreq      2.22921
		craterDensity   0.922964
		craterOctaves   10
		craterRayedFactor 0.185602
		volcanoMagn     0.199577
		volcanoFreq     0.802273
		volcanoDensity  0.363958
		volcanoOctaves  3
		volcanoActivity 0.875641
		volcanoFlows    0.313078
		volcanoRadius   0.162399
		volcanoTemp     1671.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.470, 0.400, 0.340, 0.000)
		colorShelf     (0.640, 0.600, 0.470, 0.000)
		colorBeach     (0.353, 0.336, 0.263, 0.000)
		colorDesert    (0.375, 0.342, 0.268, 0.000)
		colorLowland   (0.308, 0.254, 0.213, 0.000)
		colorUpland    (0.437, 0.392, 0.285, 0.000)
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
		SemiMajorAxis   0.000731002
		Period          0.00731054
		Eccentricity    0.0126178
		Inclination     3.15078
		AscendingNode   23.2078
		ArgOfPericenter 248.515
		MeanAnomaly     211.004
	}
}




DwarfMoon	"Korriban.D1"
{
	ParentBody     "Korriban"
	Class	       "Asteroid"

	Mass            7.80941e-010
	Radius          11.7648
	InertiaMoment   0.39936

	Oblateness      0.00100207

	RotationPeriod  140.813
	Obliquity       68.8544
	EqAscendNode    94.9519

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.515 0.507 0.501)

	Surface
	{
		SurfStyle       0.337732
		OceanStyle      0.974792
		Randomize      (0.618, -0.219, 0.469)
		colorDistMagn   0.727736
		colorDistFreq   0.0468836
		detailScale     321.256
		colorConversion true
		snowLevel       2
		tropicLatitude  0.978716
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.705724
		terraceProb     0.192082
		erosion         0
		montesMagn      0.651866
		montesFreq      2.67059
		montesSpiky     0.88611
		montesFraction  0.928348
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.311989
		hillsFraction   0.530121
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2281
		craterFreq      0.173762
		craterDensity   0.885878
		craterOctaves   11.667
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.408229
		volcanoTemp     1785.3
		lavaCoverTidal  0
		lavaCoverSun    0.014706
		lavaCoverYoung  0
		colorSea       (0.206, 0.203, 0.200, 0.000)
		colorShelf     (0.219, 0.215, 0.213, 0.000)
		colorBeach     (0.232, 0.228, 0.225, 0.000)
		colorDesert    (0.245, 0.241, 0.238, 0.000)
		colorLowland   (0.258, 0.253, 0.251, 0.000)
		colorUpland    (0.270, 0.266, 0.263, 0.000)
		colorRock      (0.283, 0.279, 0.276, 0.000)
		colorSnow      (0.296, 0.291, 0.288, 1.000)
		BumpHeight      10.5883
		BumpOffset      2.11766
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.001420201
		Eccentricity    0.282644
		Inclination     68.8544
		AscendingNode   94.9519
		ArgOfPericenter -86.5516
		MeanAnomaly     103.614
	}
}



DwarfMoon	"Korriban.D2"
{
	ParentBody     "Korriban"
	Class	       "Asteroid"

	Mass            1.12817e-009
	Radius          8.81853
	InertiaMoment   0.396699

	RotationPeriod  176.398
	Obliquity       1.84704
	EqAscendNode    -53.2018

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.701 0.696 0.694)

	Surface
	{
		SurfStyle       0.014018
		OceanStyle      0.500409
		Randomize      (0.380, -0.355, -0.300)
		colorDistMagn   0.882618
		colorDistFreq   0.0545427
		detailScale     240.805
		colorConversion true
		snowLevel       2
		tropicLatitude  0.057615
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.437789
		terraceProb     0.386132
		erosion         0
		montesMagn      0.696155
		montesFreq      3.04402
		montesSpiky     0.982541
		montesFraction  0.598313
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.202608
		hillsFraction   0.538395
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256283
		craterFreq      0.197769
		craterDensity   0.854929
		craterOctaves   10.6948
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.478835
		volcanoTemp     1784.85
		lavaCoverTidal  0
		lavaCoverSun    0.014706
		lavaCoverYoung  0
		colorSea       (0.280, 0.278, 0.277, 0.000)
		colorShelf     (0.298, 0.296, 0.295, 0.000)
		colorBeach     (0.315, 0.313, 0.312, 0.000)
		colorDesert    (0.333, 0.331, 0.329, 0.000)
		colorLowland   (0.350, 0.348, 0.347, 0.000)
		colorUpland    (0.368, 0.365, 0.364, 0.000)
		colorRock      (0.386, 0.383, 0.381, 0.000)
		colorSnow      (0.403, 0.400, 0.399, 1.000)
		BumpHeight      7.93667
		BumpOffset      1.58733
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00250123
		Eccentricity    0.4739
		Inclination     1.84704
		AscendingNode   -53.2018
		ArgOfPericenter 106.494
		MeanAnomaly     20.6277
	}
}


DwarfMoon	"Korriban.D3"
{
	ParentBody     "Korriban"
	Class	       "Asteroid"

	Mass            2.01603e-007
	Radius          80.2017
	InertiaMoment   0.39856

	RotationPeriod  428.332
	Obliquity       69.9303
	EqAscendNode    -160.681

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.808 0.771 0.748)

	Surface
	{
		SurfStyle       0.468467
		OceanStyle      0.949801
		Randomize      (0.921, -0.883, -0.751)
		colorDistMagn   0.742378
		colorDistFreq   4.9174
		detailScale     2190.04
		colorConversion true
		snowLevel       2
		tropicLatitude  0.491715
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.587796
		terraceProb     0.421685
		erosion         0
		montesMagn      0.433037
		montesFreq      3.84073
		montesSpiky     0.787778
		montesFraction  0.620854
		dunesFraction   0
		hillsMagn       0
		hillsFreq       20.468
		hillsFraction   0.855
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253185
		craterFreq      0.205072
		craterDensity   0.74078
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.488328
		volcanoTemp     1703.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.323, 0.308, 0.299, 0.000)
		colorShelf     (0.343, 0.328, 0.318, 0.000)
		colorBeach     (0.363, 0.347, 0.337, 0.000)
		colorDesert    (0.384, 0.366, 0.355, 0.000)
		colorLowland   (0.404, 0.385, 0.374, 0.000)
		colorUpland    (0.424, 0.405, 0.393, 0.000)
		colorRock      (0.444, 0.424, 0.411, 0.000)
		colorSnow      (0.464, 0.443, 0.430, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00294894	Eccentricity    0.212103
		Inclination     58.8707
		AscendingNode   -149.582
		ArgOfPericenter -104.891
		MeanAnomaly     77.3201
	}
}



DwarfMoon	"Korriban.D4"
{
	ParentBody     "Korriban"
	Class	       "Asteroid"

	Mass            2.78886e-007
	Radius          83.9291
	InertiaMoment   0.399549

	RotationPeriod  385.789
	Obliquity       36.8459
	EqAscendNode    -161.272

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.756 0.644 0.549)

	Surface
	{
		SurfStyle       0.384755
		OceanStyle      0.197843
		Randomize      (0.226, -0.310, -0.477)
		colorDistMagn   0.610744
		colorDistFreq   3.00612
		detailScale     2291.82
		colorConversion true
		snowLevel       2
		tropicLatitude  0.309849
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.585374
		terraceProb     0.368755
		erosion         0
		montesMagn      0.54223
		montesFreq      3.19717
		montesSpiky     0.973149
		montesFraction  0.431995
		dunesFraction   0
		hillsMagn       0
		hillsFreq       15.8826
		hillsFraction   0.439704
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.280533
		craterFreq      0.235934
		craterDensity   1.02746
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.475627
		volcanoTemp     1286.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.302, 0.258, 0.219, 0.000)
		colorShelf     (0.321, 0.274, 0.233, 0.000)
		colorBeach     (0.340, 0.290, 0.247, 0.000)
		colorDesert    (0.359, 0.306, 0.261, 0.000)
		colorLowland   (0.378, 0.322, 0.274, 0.000)
		colorUpland    (0.397, 0.338, 0.288, 0.000)
		colorRock      (0.416, 0.354, 0.302, 0.000)
		colorSnow      (0.435, 0.370, 0.315, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0039718
		Eccentricity    0.364511
		Inclination     50.5316
		AscendingNode   -162.75
		ArgOfPericenter -64.9339
		MeanAnomaly     78.6859
	}
}