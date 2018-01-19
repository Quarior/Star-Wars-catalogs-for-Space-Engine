// http://starwars.wikia.com/wiki/Dellalt
// Region : Outer Rim
// Sector : Tion Hegemony Sector
// Grid location : T6
// X : 12414.46, Y : 4803.3, Z : 299.5206462553954
// TODO : remove the two much spiky mounts
Planet	"Dellalt/Dellalt Planet/Dellalt System 6"
{
	ParentBody     "Dellalt System"
	Class	       "Terra"

	Mass            0.9		// assumed from gravity : wookieepedia
	Radius          6184    // from wookieepedia
	InertiaMoment   0.329864

	Obliquity       -2.03738
	EqAscendNode    -45.529
	TidalLocked     false

	RotationPeriod  23.8 // from wookieepedia
	AlbedoBond      0.320772
	AlbedoGeom      0.384926
	Brightness      2
	Color          (0.778 0.702 0.811)
	
	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine/Terrestrial"
	}

	Surface
	{
		SurfStyle       1
		OceanStyle      0.785714
		Randomize      (0.189, -0.472, 0.572)
		colorDistMagn   0.309524
		colorDistFreq   559.514
		detailScale     11763.8
		colorConversion true
		drivenDarkening -1
		seaLevel        0.619048
		snowLevel       0
		tropicLatitude  0.0252167
		icecapLatitude  1
		icecapHeight    0.181133
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.07
		mainFreq        0.714286
		venusFreq       0
		venusMagn       0.413725
		mareFreq        0.00464159
		mareDensity     0.0634921
		terraceProb     0.510724
		erosion         0.547619
		montesMagn      0.31746
		montesFreq      178.571
		montesSpiky     1
		montesFraction  0.706349
		dunesMagn       1.19048
		dunesFreq       43.8503
		dunesFraction   0.801587
		hillsMagn       1.90476
		hillsFreq       570.166
		hillsFraction   0.634921
		hills2Fraction  0.84127
		riversMagn      57.0822
		riversFreq      2.86247
		riversSin       6.72047
		riversOctaves   2
		canyonsMagn     1.50794
		canyonsFreq     11.1111
		canyonFraction  0.350418
		cracksMagn      0.634921
		cracksFreq      0.418317
		cracksOctaves   0
		craterMagn      0.654781
		craterFreq      13.4367
		craterDensity   0.0147607
		craterOctaves   2
		craterRayedFactor 0
		volcanoMagn     0.762802
		volcanoFreq     0.661296
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.666667
		volcanoRadius   0.424651
		volcanoTemp     1424.59
		lavaCoverTidal  0.0881683
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     0.634921
		stripeFluct     1.36508
		stripeTwist     1.90476
		cycloneMagn     0.634921
		cycloneFreq     1.31746
		cycloneDensity  0.833333
		cycloneOctaves  7
		colorSea       (0.040, 0.200, 0.200, 1.000)
		colorShelf     (0.150, 0.370, 0.370, 1.000)
		colorBeach     (0.480, 0.380, 0.280, 0.000)
		colorDesert    (0.410, 0.280, 0.180, 0.000)
		colorLowland   (0.310, 0.230, 0.170, 0.000)
		colorUpland    (0.510, 0.330, 0.190, 0.000)
		colorRock      (0.220, 0.210, 0.210, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.308)
		colorLowPlants (0.100, 0.160, 0.070, 0.000)
		colorUpPlants  (0.090, 0.110, 0.040, 0.000)
		BumpHeight      20
		BumpOffset      7.05063
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
		Height          75.4658
		Velocity        1428.57
		BumpHeight      5.4659
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.52381
		mainOctaves     15
		Coverage        0.166667
		stripeZones     0.634921
		stripeFluct     1.36508
		stripeTwist     1.90476
	}

	Clouds
	{
		Height          80.5957
		Velocity        1563
		BumpHeight      5.4659
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.52381
		mainOctaves     15
		Coverage        0.166667
		stripeZones     0.634921
		stripeFluct     1.36508
		stripeTwist     1.90476
	}

	Ocean
	{
		Height          13.6507
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
	}

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          150.3988
		Density         0.438257
		Pressure        0.388031
		Greenhouse      114.286
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.0197114
		Saturation      1

		Composition
		{
			N2  77.7729
			O2  20.8625
			Ar  0.9303
			H2O 0.4000
			CO2 0.0398
		}
	}

	Aurora
	{
		Height      112.54
		NorthLat    76.4332
		NorthLon    31.7021
		NorthRadius 1241.04
		NorthWidth  331.888
		NorthRings  4
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -90
		SouthLon    232.935
		SouthRadius 1310.51
		SouthWidth  511.596
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
		SemiMajorAxis   0.996026
		Period          1.507219087220134 // from wookieepedia
		Eccentricity    0.0980712
		Inclination     -1.0138
		AscendingNode   -138.427
		ArgOfPericenter 54.6924
		MeanAnomaly     44.237
	}
}

Moon	"Dellalt Moon 1"
{
	ParentBody     "Dellalt"
	Class	       "Desert"

	Mass            0.00609613
	Radius          1502.86
	InertiaMoment   0.386537

	Oblateness      0.0101266

	Obliquity       -0.591104
	EqAscendNode    -68.4798
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.865 0.617 0.398)

	Surface
	{
		SurfStyle       0.74278
		OceanStyle      0.734556
		Randomize      (-0.945, 0.758, -0.849)
		colorDistMagn   0.0651441
		colorDistFreq   199.623
		detailScale     3865.43
		colorConversion true
		seaLevel        0.126046
		snowLevel       2
		tropicLatitude  0.0170578
		icecapLatitude  0.874972
		icecapHeight    0.138351
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.495702
		venusFreq       0.859031
		venusMagn       0.342231
		mareFreq        0.336794
		mareDensity     0.00242715
		terraceProb     0.26464
		erosion         0
		montesMagn      0.0483852
		montesFreq      77.9523
		montesSpiky     0.925267
		montesFraction  0.0380251
		dunesMagn       0.0419283
		dunesFreq       12.0845
		dunesFraction   0.961411
		hillsMagn       0.155819
		hillsFreq       161.65
		hillsFraction   0
		hills2Fraction  0
		riversMagn      66.3977
		riversFreq      3.93523
		riversSin       6.57257
		riversOctaves   0
		canyonsMagn     0.0320633
		canyonsFreq     37.2238
		canyonFraction  0
		cracksMagn      0.108668
		cracksFreq      0.138442
		cracksOctaves   0
		craterMagn      0.501182
		craterFreq      4.3852
		craterDensity   0.307508
		craterOctaves   3.85137
		volcanoMagn     0.197698
		volcanoFreq     0.635086
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.961652
		volcanoRadius   0.157148
		volcanoTemp     1780.06
		lavaCoverTidal  0.362768
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
		Hapke           0.51489
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
		Height          75.1428
		Density         0.048511
		Pressure        0.0275705
		Greenhouse      0.737586
		Bright          8.65303
		Opacity         1
		SkyLight        2.88434
		Hue             0
		Saturation      1

		Composition
		{
			CO2   	73.3599
			CH4   	11.9141
			H2S   	6.17523
			NH3   	5.54277
			SO2   	1.71479
			C2H2  	0.518956
			H2O   	0.345478
			C2H6  	0.1806
			N2    	0.166597
			C2H4  	0.0672328
			C3H8  	0.0118216
			CO    	0.00247954
			Ne    	4.97382e-005
			Ar    	2.25079e-005
			Cl2   	1.41995e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000191333
		Period          0.00254927
		Eccentricity    0.041601
		Inclination     -0.591104
		AscendingNode   -68.4797
		ArgOfPericenter -41.983
		MeanAnomaly     -86.1684
	}
}

DwarfMoon	"Dellalt Moon 2"
{
	ParentBody     "Dellalt"
	Class	       "Asteroid"

	Mass            3.85888e-007
	Radius          91.6261
	InertiaMoment   0.397767

	RotationPeriod  499.91
	Obliquity       63.4608
	EqAscendNode    98.5925

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.524 0.518 0.511)

	Surface
	{
		SurfStyle       0.351016
		OceanStyle      0.331014
		Randomize      (-0.245, 0.262, -0.940)
		colorDistMagn   0.297388
		colorDistFreq   4.69751
		detailScale     2502
		colorConversion true
		snowLevel       2
		tropicLatitude  0.947682
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.317761
		terraceProb     0.14138
		erosion         0
		montesMagn      0.438455
		montesFreq      2.95205
		montesSpiky     0.960121
		montesFraction  0.231823
		dunesFraction   0
		hillsMagn       0
		hillsFreq       17.8047
		hillsFraction   0.691014
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.209251
		craterFreq      0.287266
		craterDensity   1.01853
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.477821
		volcanoTemp     1803.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.210, 0.207, 0.204, 0.000)
		colorShelf     (0.223, 0.220, 0.217, 0.000)
		colorBeach     (0.236, 0.233, 0.230, 0.000)
		colorDesert    (0.249, 0.246, 0.243, 0.000)
		colorLowland   (0.262, 0.259, 0.256, 0.000)
		colorUpland    (0.275, 0.272, 0.268, 0.000)
		colorRock      (0.288, 0.285, 0.281, 0.000)
		colorSnow      (0.301, 0.298, 0.294, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00124686
		Period          0.0427722
		Eccentricity    0.471282
		Inclination     63.4608
		AscendingNode   98.5925
		ArgOfPericenter 122.647
		MeanAnomaly     105.213
	}
}

///////////////
// GENERATED //
///////////////
Planet	"Dellalt System 1"
{
	ParentBody     "Dellalt System"
	Class	       "Desert"

	Mass            5.09125
	Radius          8745.67
	InertiaMoment   0.328965

	Obliquity       0.921239
	EqAscendNode    47.9341
	TidalLocked     true

	AlbedoBond      0.378606
	AlbedoGeom      0.454327
	Brightness      2
	Color          (0.692 0.620 0.572)

	Surface
	{
		SurfStyle       0.652847
		OceanStyle      0.616511
		Randomize      (-0.299, 0.855, 0.981)
		colorDistMagn   0.054765
		colorDistFreq   1186.54
		detailScale     22494.4
		colorConversion true
		seaLevel        0.0385428
		snowLevel       0.85
		tropicLatitude  0.0293811
		icecapLatitude  10
		icecapHeight    0.249646
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        1.10082
		venusFreq       0.793604
		venusMagn       0
		mareFreq        1.48081
		mareDensity     0.201735
		terraceProb     0.158811
		erosion         0
		montesMagn      0.166184
		montesFreq      465.879
		montesSpiky     0.99349
		montesFraction  0.751299
		dunesMagn       0.053035
		dunesFreq       55.9208
		dunesFraction   0.0953277
		hillsMagn       0.114773
		hillsFreq       1133.48
		hillsFraction   0
		hills2Fraction  0
		riversMagn      61.4136
		riversFreq      3.1518
		riversSin       5.88873
		riversOctaves   0
		canyonsMagn     0.0331917
		canyonsFreq     245.947
		canyonFraction  0
		cracksMagn      0.112482
		cracksFreq      0.915537
		cracksOctaves   0
		craterMagn      0.965213
		craterFreq      17.9203
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.676854
		volcanoFreq     0.5609
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.625081
		volcanoRadius   0.475304
		volcanoTemp     1443.15
		lavaCoverTidal  0.314262
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1
		stripeTwist     3.5
		cycloneMagn     0.726936
		cycloneDensity  0.408704
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
		BumpHeight      12.1539
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
		Height          9.22852
		Velocity        105.408
		BumpHeight      3.15191
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.940385
		mainOctaves     10
		Coverage        0.357211
		stripeZones     1
		stripeTwist     3.5
	}

	Clouds
	{
		Height          12.3809
		Velocity        19.0497
		BumpHeight      3.15191
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.940385
		mainOctaves     10
		Coverage        0.357211
		stripeZones     1
		stripeTwist     3.5
	}

	Clouds
	{
		Height          15.5322
		Velocity        93.0174
		BumpHeight      3.15191
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.940385
		mainOctaves     10
		Coverage        0.357211
		stripeZones     1
		stripeTwist     3.5
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          43.7283
		Density         1.26765
		Pressure        1.66508
		Greenhouse      9.89928
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0114807
		Saturation      1

		Composition
		{
			CO2   	83.9412
			SO2   	9.1031
			H2O   	6.8068
			C2H2  	0.0647331
			H2S   	0.0349496
			NH3   	0.0195013
			CH4   	0.0133396
			N2    	0.0116575
			C3H8  	0.00276143
			C2H4  	0.000829434
			C2H6  	0.000661297
			CO    	0.000282074
			He    	0.000147906
			Ar    	1.80085e-005
			Ne    	1.7042e-005
		}
	}

	Aurora
	{
		Height      274.282
		NorthLat    49.7637
		NorthLon    115.985
		NorthRadius 2698.63
		NorthWidth  668.635
		NorthRings  4
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -34.5074
		SouthLon    287.891
		SouthRadius 2734.29
		SouthWidth  661.286
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
		SemiMajorAxis   0.0619114
		Period          0.0184354
		Eccentricity    0.0386548
		Inclination     0.921238
		AscendingNode   47.9341
		ArgOfPericenter 305.663
		MeanAnomaly     78.3762
	}
}

DwarfMoon	"Dellalt System 1.D1"
{
	ParentBody     "Dellalt System 1"
	Class	       "Asteroid"

	Mass            1.40146e-007
	Radius          76.9113
	InertiaMoment   0.399788

	Oblateness      0.249

	Obliquity       -0.0122836
	EqAscendNode    -61.4559
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.461 0.457 0.448)

	Surface
	{
		SurfStyle       0.146153
		OceanStyle      0.947413
		Randomize      (0.077, 0.090, 0.125)
		colorDistMagn   0.83769
		colorDistFreq   3.26356
		detailScale     2100.19
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.275108
		terraceProb     0.328022
		erosion         0
		montesMagn      0.518505
		montesFreq      2.12312
		montesSpiky     0.897986
		montesFraction  0.367085
		dunesFraction   0
		hillsMagn       0
		hillsFreq       12.2231
		hillsFraction   0.380335
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238939
		craterFreq      0.184728
		craterDensity   0.809266
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.544394
		volcanoTemp     1467.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.184, 0.183, 0.179, 0.000)
		colorShelf     (0.196, 0.194, 0.190, 0.000)
		colorBeach     (0.208, 0.205, 0.202, 0.000)
		colorDesert    (0.219, 0.217, 0.213, 0.000)
		colorLowland   (0.231, 0.228, 0.224, 0.000)
		colorUpland    (0.242, 0.240, 0.235, 0.000)
		colorRock      (0.254, 0.251, 0.246, 0.000)
		colorSnow      (0.265, 0.263, 0.257, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000223049
		Period          0.000853823
		Eccentricity    5.69486e-005
		Inclination     -0.0122836
		AscendingNode   -61.4559
		ArgOfPericenter -6.94221
		MeanAnomaly     -32.8416
	}
}

DwarfMoon	"Dellalt System 1.D2"
{
	ParentBody     "Dellalt System 1"
	Class	       "Asteroid"

	Mass            1.92611e-007
	Radius          44.6607
	InertiaMoment   0.397772

	Oblateness      0.0476656

	Obliquity       51.159
	EqAscendNode    -22.0488
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.491 0.485 0.481)

	Surface
	{
		SurfStyle       0.829511
		OceanStyle      0.922242
		Randomize      (0.340, -0.802, -0.661)
		colorDistMagn   0.447413
		colorDistFreq   0.827181
		detailScale     1219.53
		colorConversion true
		snowLevel       2
		tropicLatitude  0.985622
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.284134
		terraceProb     0.26896
		erosion         0
		montesMagn      0.500082
		montesFreq      3.24559
		montesSpiky     0.897024
		montesFraction  0.470603
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.45851
		hillsFraction   0.503415
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.212765
		craterFreq      0.202306
		craterDensity   0.98169
		craterOctaves   14
		volcanoActivity 0.384889
		volcanoFlows    0
		volcanoRadius   0.42457
		volcanoTemp     1787.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.191, 0.165, 0.135, 0.000)
		colorShelf     (0.196, 0.170, 0.154, 0.000)
		colorBeach     (0.231, 0.199, 0.183, 0.000)
		colorDesert    (0.250, 0.214, 0.178, 0.000)
		colorLowland   (0.275, 0.228, 0.202, 0.000)
		colorUpland    (0.304, 0.277, 0.245, 0.000)
		colorRock      (0.329, 0.301, 0.265, 0.000)
		colorSnow      (0.358, 0.320, 0.279, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000263075
		Period          0.00109367
		Eccentricity    0.0822313
		Inclination     51.159
		AscendingNode   -22.0488
		ArgOfPericenter -66.7987
		MeanAnomaly     -77.8435
	}
}

DwarfMoon	"Dellalt System 1.D3"
{
	ParentBody     "Dellalt System 1"
	Class	       "Asteroid"

	Mass            2.66207e-007
	Radius          87.3943
	InertiaMoment   0.398995

	Oblateness      0.00716436

	RotationPeriod  57.7107
	Obliquity       -12.7127
	EqAscendNode    172.734

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.490 0.441 0.367)

	Surface
	{
		SurfStyle       0.936234
		OceanStyle      0.375819
		Randomize      (-0.651, -0.403, -0.426)
		colorDistMagn   0.956573
		colorDistFreq   4.77418
		detailScale     2386.45
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0278871
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.584625
		terraceProb     0.251366
		erosion         0
		montesMagn      0.619824
		montesFreq      3.13626
		montesSpiky     0.964635
		montesFraction  0.537672
		dunesFraction   0
		hillsMagn       0
		hillsFreq       13.1835
		hillsFraction   0.543172
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240506
		craterFreq      0.230446
		craterDensity   0.884558
		craterOctaves   15
		volcanoActivity 0.763309
		volcanoFlows    0
		volcanoRadius   0.491197
		volcanoTemp     1476.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.167, 0.154, 0.147, 0.050)
		colorShelf     (0.196, 0.181, 0.169, 0.040)
		colorBeach     (0.225, 0.207, 0.191, 0.030)
		colorDesert    (0.255, 0.234, 0.216, 0.020)
		colorLowland   (0.284, 0.260, 0.238, 0.030)
		colorUpland    (0.314, 0.286, 0.260, 0.050)
		colorRock      (0.343, 0.313, 0.290, 0.020)
		colorSnow      (0.343, 0.313, 0.290, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000548417
		Period          0.0032918
		Eccentricity    0.464396
		Inclination     -12.7127
		AscendingNode   172.734
		ArgOfPericenter 140.443
		MeanAnomaly     -75.3906
	}
}

Planet	"Dellalt System 2"
{
	ParentBody     "Dellalt System"
	Class	       "IceGiant"

	Mass            26.0631
	Radius          25383.9
	InertiaMoment   0.22804

	RotationPeriod  723.647
	Obliquity       -2.26262
	EqAscendNode    101.946

	AlbedoBond      0.506311
	AlbedoGeom      0.607574
	Brightness      2

	Surface
	{
		SurfStyle       0.133675
		Randomize      (-0.549, -0.289, 0.486)
		detailScale     65288.9
		colorConversion true
		tropicLatitude  0.0497043
		icecapLatitude  0.949704
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0.113585
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     6.81348
		stripeFluct     0.398042
		stripeTwist     9.5509
		cycloneMagn     8.76268
		cycloneFreq     0.50667
		cycloneDensity  0.591168
		cycloneOctaves  1
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
		BumpHeight      15.5913
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          39.416
		Velocity        584.806
		BumpHeight      23.8248
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.44416
		mainOctaves     12
		Coverage        0.531557
		stripeZones     6.81348
		stripeFluct     0.398042
		stripeTwist     9.5509
	}

	Clouds
	{
		Height          63.2402
		Velocity        492.668
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		ModulateColor  (1.000 1.000 1.000 0.303)
		mainFreq        1.44416
		mainOctaves     12
		Coverage        0.531557
		stripeZones     6.81348
		stripeFluct     0.398042
		stripeTwist     9.5509
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Jupiter"
		Height          253.839
		Density         2048.53
		Pressure        371876
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.0207969
		Saturation      0.640664

		Composition
		{
			H2    	90.7356
			He    	8.82865
			CH4   	0.346865
			N2    	0.0434929
			NH3   	0.0303945
			O2    	0.00737119
			C2H2  	0.00308603
			C2H4  	0.00152274
			Ne    	0.00106462
			Ar    	0.000918064
			C2H6  	0.000654813
			C3H8  	0.000341043
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.105959
		Period          0.0412744
		Eccentricity    0.0878548
		Inclination     -2.26262
		AscendingNode   101.946
		ArgOfPericenter 322.959
		MeanAnomaly     266.651
	}
}

DwarfMoon	"Dellalt System 2.D1"
{
	ParentBody     "Dellalt System 2"
	Class	       "Asteroid"

	Mass            2.39959e-011
	Radius          3.83692
	InertiaMoment   0.398329

	Oblateness      0.249

	Obliquity       -0.0032506
	EqAscendNode    104.874
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.782 0.723 0.632)

	Surface
	{
		SurfStyle       0.696919
		OceanStyle      0.647428
		Randomize      (-0.234, 0.754, 0.484)
		colorDistMagn   0.441169
		colorDistFreq   0.00874976
		detailScale     104.774
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.561303
		terraceProb     0.202773
		erosion         0
		montesMagn      0.421138
		montesFreq      2.81734
		montesSpiky     0.986544
		montesFraction  0.791531
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.035319
		hillsFraction   0.69141
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24499
		craterFreq      0.147724
		craterDensity   0.847112
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.498818
		volcanoTemp     1575.25
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.305, 0.246, 0.177, 0.000)
		colorShelf     (0.313, 0.253, 0.202, 0.000)
		colorBeach     (0.368, 0.296, 0.240, 0.000)
		colorDesert    (0.399, 0.318, 0.234, 0.000)
		colorLowland   (0.438, 0.340, 0.266, 0.000)
		colorUpland    (0.485, 0.412, 0.322, 0.000)
		colorRock      (0.524, 0.448, 0.348, 0.000)
		colorSnow      (0.571, 0.477, 0.367, 1.000)
		BumpHeight      3.45323
		BumpOffset      0.690646
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000350287
		Period          0.000742681
		Eccentricity    1.20574e-005
		Inclination     -0.0032506
		AscendingNode   104.874
		ArgOfPericenter 132.329
		MeanAnomaly     86.2785
	}
}

DwarfMoon	"Dellalt System 2.D2"
{
	ParentBody     "Dellalt System 2"
	Class	       "Asteroid"

	Mass            4.4709e-011
	Radius          3.18003
	InertiaMoment   0.399371

	Oblateness      0.129945

	Obliquity       0.0100606
	EqAscendNode    -114.851
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.716 0.714 0.713)

	Surface
	{
		SurfStyle       0.588933
		OceanStyle      0.333377
		Randomize      (0.210, 0.349, -0.996)
		colorDistMagn   0.192976
		colorDistFreq   0.00170808
		detailScale     86.8359
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.666542
		terraceProb     0.350231
		erosion         0
		montesMagn      0.546835
		montesFreq      3.40214
		montesSpiky     0.968105
		montesFraction  0.168643
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0237168
		hillsFraction   0.378327
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231821
		craterFreq      0.2193
		craterDensity   0.783321
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.567287
		volcanoTemp     1552.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.279, 0.243, 0.200, 0.000)
		colorShelf     (0.286, 0.250, 0.228, 0.000)
		colorBeach     (0.336, 0.293, 0.271, 0.000)
		colorDesert    (0.365, 0.314, 0.264, 0.000)
		colorLowland   (0.401, 0.336, 0.299, 0.000)
		colorUpland    (0.444, 0.407, 0.363, 0.000)
		colorRock      (0.480, 0.443, 0.392, 0.000)
		colorSnow      (0.523, 0.472, 0.413, 1.000)
		BumpHeight      2.86202
		BumpOffset      0.572405
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000376788
		Period          0.000828538
		Eccentricity    2.01148e-006
		Inclination     0.0100606
		AscendingNode   -114.851
		ArgOfPericenter 43.4048
		MeanAnomaly     49.3338
	}
}

DwarfMoon	"Dellalt System 2.D3"
{
	ParentBody     "Dellalt System 2"
	Class	       "Asteroid"

	Mass            7.77869e-011
	Radius          6.23187
	InertiaMoment   0.396741

	Oblateness      0.249

	Obliquity       0.00328146
	EqAscendNode    97.9339
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.551 0.504 0.423)

	Surface
	{
		SurfStyle       0.466994
		OceanStyle      0.855098
		Randomize      (0.848, -0.105, -0.813)
		colorDistMagn   0.602937
		colorDistFreq   0.0125872
		detailScale     170.172
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.378045
		terraceProb     0.352675
		erosion         0
		montesMagn      0.321877
		montesFreq      3.2568
		montesSpiky     0.931561
		montesFraction  0.244033
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0932068
		hillsFraction   0.552664
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254462
		craterFreq      0.223831
		craterDensity   1.07017
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.458165
		volcanoTemp     1505.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.220, 0.201, 0.169, 0.000)
		colorShelf     (0.234, 0.214, 0.180, 0.000)
		colorBeach     (0.248, 0.227, 0.190, 0.000)
		colorDesert    (0.262, 0.239, 0.201, 0.000)
		colorLowland   (0.275, 0.252, 0.211, 0.000)
		colorUpland    (0.289, 0.264, 0.222, 0.000)
		colorRock      (0.303, 0.277, 0.233, 0.000)
		colorSnow      (0.317, 0.290, 0.243, 1.000)
		BumpHeight      5.60868
		BumpOffset      1.12174
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000423176
		Period          0.000986161
		Eccentricity    4.03004e-006
		Inclination     0.00328146
		AscendingNode   97.9339
		ArgOfPericenter 148.11
		MeanAnomaly     161.647
	}
}

DwarfMoon	"Dellalt System 2.D4"
{
	ParentBody     "Dellalt System 2"
	Class	       "Asteroid"

	Mass            1.28652e-010
	Radius          3.84088
	InertiaMoment   0.3985

	Oblateness      0.0491675

	Obliquity       -0.00985898
	EqAscendNode    -131.168
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.712 0.708 0.707)

	Surface
	{
		SurfStyle       0.0877116
		OceanStyle      0.327964
		Randomize      (0.697, -0.835, -0.906)
		colorDistMagn   0.867772
		colorDistFreq   0.00608018
		detailScale     104.882
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.321619
		terraceProb     0.268521
		erosion         0
		montesMagn      0.557058
		montesFreq      3.2761
		montesSpiky     0.958232
		montesFraction  0.633741
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0418642
		hillsFraction   0.795203
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247202
		craterFreq      0.160307
		craterDensity   0.824385
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.54837
		volcanoTemp     1753.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.285, 0.283, 0.283, 0.000)
		colorShelf     (0.303, 0.301, 0.301, 0.000)
		colorBeach     (0.320, 0.319, 0.318, 0.000)
		colorDesert    (0.338, 0.336, 0.336, 0.000)
		colorLowland   (0.356, 0.354, 0.354, 0.000)
		colorUpland    (0.374, 0.372, 0.371, 0.000)
		colorRock      (0.391, 0.390, 0.389, 0.000)
		colorSnow      (0.409, 0.407, 0.407, 1.000)
		BumpHeight      3.45679
		BumpOffset      0.691358
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000441887
		Period          0.00105228
		Eccentricity    4.86011e-005
		Inclination     -0.00985898
		AscendingNode   -131.168
		ArgOfPericenter -64.0876
		MeanAnomaly     -22.6855
	}
}

DwarfMoon	"Dellalt System 2.D5"
{
	ParentBody     "Dellalt System 2"
	Class	       "Asteroid"

	Mass            2.04661e-010
	Radius          4.21689
	InertiaMoment   0.399501

	Oblateness      0.0281719

	Obliquity       0.013142
	EqAscendNode    17.8617
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.463 0.457 0.451)

	Surface
	{
		SurfStyle       0.261067
		OceanStyle      0.466812
		Randomize      (-0.780, 0.623, 0.720)
		colorDistMagn   0.328664
		colorDistFreq   0.0110745
		detailScale     115.149
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000488281
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.657689
		terraceProb     0.335543
		erosion         0
		montesMagn      0.264795
		montesFreq      2.59072
		montesSpiky     0.903025
		montesFraction  0.326101
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0394879
		hillsFraction   0.683958
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232326
		craterFreq      0.21335
		craterDensity   0.883088
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.574533
		volcanoTemp     1408.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.185, 0.183, 0.180, 0.000)
		colorShelf     (0.197, 0.194, 0.192, 0.000)
		colorBeach     (0.208, 0.206, 0.203, 0.000)
		colorDesert    (0.220, 0.217, 0.214, 0.000)
		colorLowland   (0.232, 0.228, 0.225, 0.000)
		colorUpland    (0.243, 0.240, 0.237, 0.000)
		colorRock      (0.255, 0.251, 0.248, 0.000)
		colorSnow      (0.266, 0.263, 0.259, 1.000)
		BumpHeight      3.79521
		BumpOffset      0.759041
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000500993
		Period          0.00127032
		Eccentricity    3.51254e-005
		Inclination     0.013142
		AscendingNode   17.8617
		ArgOfPericenter -58.4077
		MeanAnomaly     37.3325
	}
}

DwarfMoon	"Dellalt System 2.D6"
{
	ParentBody     "Dellalt System 2"
	Class	       "Asteroid"

	Mass            3.15743e-010
	Radius          10.9046
	InertiaMoment   0.397142

	Oblateness      0.0178932

	Obliquity       -40.6281
	EqAscendNode    -10.8106
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.575 0.567 0.564)

	Surface
	{
		SurfStyle       0.85379
		OceanStyle      0.728624
		Randomize      (0.517, 0.001, -0.300)
		colorDistMagn   0.250563
		colorDistFreq   0.0556103
		detailScale     297.767
		colorConversion true
		snowLevel       2
		tropicLatitude  0.987191
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.529478
		terraceProb     0.542563
		erosion         0
		montesMagn      0.581249
		montesFreq      2.26013
		montesSpiky     0.994911
		montesFraction  0.719071
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.215084
		hillsFraction   0.677266
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232751
		craterFreq      0.22013
		craterDensity   0.850467
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.515622
		volcanoTemp     1522.25
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.196, 0.199, 0.225, 0.050)
		colorShelf     (0.230, 0.233, 0.259, 0.040)
		colorBeach     (0.265, 0.267, 0.293, 0.030)
		colorDesert    (0.299, 0.301, 0.333, 0.020)
		colorLowland   (0.334, 0.335, 0.366, 0.030)
		colorUpland    (0.368, 0.369, 0.400, 0.050)
		colorRock      (0.403, 0.403, 0.445, 0.020)
		colorSnow      (0.403, 0.403, 0.445, 1.000)
		BumpHeight      9.8141
		BumpOffset      1.96282
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0013005
		Period          0.00531289
		Eccentricity    0.235219
		Inclination     -40.6281
		AscendingNode   -10.8106
		ArgOfPericenter 142.243
		MeanAnomaly     144.763
	}
}

Planet	"Dellalt System 3"
{
	ParentBody     "Dellalt System"
	Class	       "IceGiant"

	Mass            23.5083
	Radius          23989.7
	InertiaMoment   0.247368

	RotationPeriod  2609.26
	Obliquity       -0.532491
	EqAscendNode    98.7845

	AlbedoBond      0.513494
	AlbedoGeom      0.616193
	Brightness      2

	Surface
	{
		SurfStyle       0.221849
		Randomize      (0.917, 0.397, -0.202)
		detailScale     61702.9
		colorConversion true
		tropicLatitude  0.0120989
		icecapLatitude  0.912099
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     7.47461
		stripeFluct     0.412605
		stripeTwist     11.9248
		cycloneMagn     10.3006
		cycloneFreq     0.46201
		cycloneDensity  0.384703
		cycloneOctaves  1
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
		BumpHeight      15.5149
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          60.3906
		Velocity        -370.455
		BumpHeight      44.8764
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.47204
		mainOctaves     12
		Coverage        0.56747
		stripeZones     7.47461
		stripeFluct     0.412605
		stripeTwist     11.9248
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          239.897
		Density         1826.09
		Pressure        334354
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.0358924
		Saturation      0.702051

		Composition
		{
			H2    	91.839
			He    	7.703
			CH4   	0.373541
			N2    	0.0423675
			NH3   	0.0263844
			O2    	0.00799996
			C2H2  	0.00310916
			Ne    	0.0013323
			C2H4  	0.0012568
			Ar    	0.000960764
			C2H6  	0.000631604
			C3H8  	0.000367468
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.190138
		Period          0.0992161
		Eccentricity    0.0727463
		Inclination     -0.532491
		AscendingNode   98.7845
		ArgOfPericenter 74.7063
		MeanAnomaly     105.766
	}
}

DwarfMoon	"Dellalt System 3.D1"
{
	ParentBody     "Dellalt System 3"
	Class	       "Asteroid"

	Mass            9.04301e-009
	Radius          17.9991
	InertiaMoment   0.399852

	Oblateness      0.131944

	Obliquity       0.0141222
	EqAscendNode    61.1215
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.739 0.738 0.736)

	Surface
	{
		SurfStyle       0.446982
		OceanStyle      0.224933
		Randomize      (-1.000, -0.863, -0.472)
		colorDistMagn   0.596796
		colorDistFreq   0.0735703
		detailScale     491.496
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000488281
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.760365
		terraceProb     0.373581
		erosion         0
		montesMagn      0.649918
		montesFreq      2.53331
		montesSpiky     0.995281
		montesFraction  0.573075
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.689953
		hillsFraction   0.467545
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.299174
		craterFreq      0.236001
		craterDensity   0.719473
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.565712
		volcanoTemp     1178.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.296, 0.295, 0.294, 0.000)
		colorShelf     (0.314, 0.314, 0.313, 0.000)
		colorBeach     (0.333, 0.332, 0.331, 0.000)
		colorDesert    (0.351, 0.350, 0.349, 0.000)
		colorLowland   (0.370, 0.369, 0.368, 0.000)
		colorUpland    (0.388, 0.387, 0.386, 0.000)
		colorRock      (0.407, 0.406, 0.405, 0.000)
		colorSnow      (0.425, 0.424, 0.423, 1.000)
		BumpHeight      16.1992
		BumpOffset      3.23984
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000349458
		Period          0.000779223
		Eccentricity    1.23759e-005
		Inclination     0.0141222
		AscendingNode   61.1215
		ArgOfPericenter 171.585
		MeanAnomaly     134.684
	}
}

DwarfMoon	"Dellalt System 3.D2"
{
	ParentBody     "Dellalt System 3"
	Class	       "Asteroid"

	Mass            1.23395e-008
	Radius          18.3751
	InertiaMoment   0.397888

	Oblateness      0.0601162

	Obliquity       0.00181723
	EqAscendNode    -99.5128
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.837 0.775 0.719)

	Surface
	{
		SurfStyle       0.66051
		OceanStyle      0.0966028
		Randomize      (0.354, 0.814, -0.396)
		colorDistMagn   0.33245
		colorDistFreq   0.213872
		detailScale     501.762
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.684871
		terraceProb     0.252427
		erosion         0
		montesMagn      0.48957
		montesFreq      2.4699
		montesSpiky     0.927901
		montesFraction  0.576859
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.941637
		hillsFraction   0.738166
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257982
		craterFreq      0.206465
		craterDensity   0.959983
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.465021
		volcanoTemp     1329.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.326, 0.264, 0.201, 0.000)
		colorShelf     (0.335, 0.271, 0.230, 0.000)
		colorBeach     (0.393, 0.318, 0.273, 0.000)
		colorDesert    (0.427, 0.341, 0.266, 0.000)
		colorLowland   (0.469, 0.364, 0.302, 0.000)
		colorUpland    (0.519, 0.442, 0.367, 0.000)
		colorRock      (0.561, 0.481, 0.395, 0.000)
		colorSnow      (0.611, 0.512, 0.417, 1.000)
		BumpHeight      16.5376
		BumpOffset      3.30751
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000416976
		Period          0.00101563
		Eccentricity    9.60211e-005
		Inclination     0.00181723
		AscendingNode   -99.5128
		ArgOfPericenter 66.7669
		MeanAnomaly     -78.149
	}
}

DwarfMoon	"Dellalt System 3.D3"
{
	ParentBody     "Dellalt System 3"
	Class	       "Asteroid"

	Mass            1.67918e-008
	Radius          35.4501
	InertiaMoment   0.399067

	Oblateness      0.249

	Obliquity       0.00578242
	EqAscendNode    -88.7961
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.505 0.501 0.500)

	Surface
	{
		SurfStyle       0.688464
		OceanStyle      0.454476
		Randomize      (0.689, -0.139, 0.827)
		colorDistMagn   0.335182
		colorDistFreq   0.747955
		detailScale     968.024
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.370708
		terraceProb     0.192838
		erosion         0
		montesMagn      0.55906
		montesFreq      3.14678
		montesSpiky     0.882239
		montesFraction  0.614272
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.23485
		hillsFraction   0.620368
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2454
		craterFreq      0.256883
		craterDensity   0.980731
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.551751
		volcanoTemp     1437.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.197, 0.170, 0.140, 0.000)
		colorShelf     (0.202, 0.175, 0.160, 0.000)
		colorBeach     (0.237, 0.206, 0.190, 0.000)
		colorDesert    (0.258, 0.221, 0.185, 0.000)
		colorLowland   (0.283, 0.236, 0.210, 0.000)
		colorUpland    (0.313, 0.286, 0.255, 0.000)
		colorRock      (0.338, 0.311, 0.275, 0.000)
		colorSnow      (0.369, 0.331, 0.290, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000441492
		Period          0.0011065
		Eccentricity    6.71662e-005
		Inclination     0.00578242
		AscendingNode   -88.7961
		ArgOfPericenter -88.3989
		MeanAnomaly     -154.601
	}
}

DwarfMoon	"Dellalt System 3.D4"
{
	ParentBody     "Dellalt System 3"
	Class	       "Asteroid"

	Mass            2.28095e-008
	Radius          19.8664
	InertiaMoment   0.399977

	Oblateness      0.00204148

	Obliquity       46.775
	EqAscendNode    145.433
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.785 0.735 0.691)

	Surface
	{
		SurfStyle       0.399399
		OceanStyle      0.174429
		Randomize      (0.984, -0.455, 0.021)
		colorDistMagn   0.745911
		colorDistFreq   0.17713
		detailScale     542.485
		colorConversion true
		snowLevel       2
		tropicLatitude  0.422704
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.436653
		terraceProb     0.285904
		erosion         0
		montesMagn      0.557241
		montesFreq      2.38638
		montesSpiky     0.912583
		montesFraction  0.490693
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.585767
		hillsFraction   0.808927
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242553
		craterFreq      0.18116
		craterDensity   0.850497
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.555137
		volcanoTemp     1306.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.314, 0.294, 0.276, 0.000)
		colorShelf     (0.333, 0.312, 0.294, 0.000)
		colorBeach     (0.353, 0.331, 0.311, 0.000)
		colorDesert    (0.373, 0.349, 0.328, 0.000)
		colorLowland   (0.392, 0.368, 0.346, 0.000)
		colorUpland    (0.412, 0.386, 0.363, 0.000)
		colorRock      (0.432, 0.404, 0.380, 0.000)
		colorSnow      (0.451, 0.423, 0.397, 1.000)
		BumpHeight      17.8798
		BumpOffset      3.57595
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00113731
		Period          0.00457495
		Eccentricity    0.366789
		Inclination     46.775
		AscendingNode   145.433
		ArgOfPericenter 66.2363
		MeanAnomaly     67.7711
	}
}

DwarfMoon	"Dellalt System 3.D5"
{
	ParentBody     "Dellalt System 3"
	Class	       "Asteroid"

	Mass            3.09552e-008
	Radius          27.5988
	InertiaMoment   0.398095

	Obliquity       -85.0565
	EqAscendNode    102.741
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.599 0.592 0.588)

	Surface
	{
		SurfStyle       0.70965
		OceanStyle      0.489282
		Randomize      (-0.234, -0.539, 0.416)
		colorDistMagn   0.694821
		colorDistFreq   0.255582
		detailScale     753.631
		colorConversion true
		snowLevel       2
		tropicLatitude  0.974049
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.71855
		terraceProb     0.291816
		erosion         0
		montesMagn      0.532659
		montesFreq      3.38145
		montesSpiky     0.897328
		montesFraction  0.506652
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.19843
		hillsFraction   0.6379
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.21248
		craterFreq      0.241869
		craterDensity   0.939535
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.501099
		volcanoTemp     1789.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.234, 0.201, 0.165, 0.000)
		colorShelf     (0.240, 0.207, 0.188, 0.000)
		colorBeach     (0.282, 0.243, 0.223, 0.000)
		colorDesert    (0.306, 0.260, 0.218, 0.000)
		colorLowland   (0.336, 0.278, 0.247, 0.000)
		colorUpland    (0.372, 0.337, 0.300, 0.000)
		colorRock      (0.402, 0.367, 0.323, 0.000)
		colorSnow      (0.438, 0.391, 0.341, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00163806
		Period          0.00790795
		Eccentricity    0.0597079
		Inclination     -85.0565
		AscendingNode   102.741
		ArgOfPericenter -150.602
		MeanAnomaly     -116.801
	}
}

DwarfMoon	"Dellalt System 3.D6"
{
	ParentBody     "Dellalt System 3"
	Class	       "Asteroid"

	Mass            4.20073e-008
	Radius          27.9064
	InertiaMoment   0.399204

	RotationPeriod  225.808
	Obliquity       -56.2435
	EqAscendNode    19.9325

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.428 0.423 0.417)

	Surface
	{
		SurfStyle       0.768848
		OceanStyle      0.392522
		Randomize      (0.022, -0.899, -0.689)
		colorDistMagn   0.117295
		colorDistFreq   0.391454
		detailScale     762.032
		colorConversion true
		snowLevel       2
		tropicLatitude  0.940039
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.302736
		terraceProb     0.265008
		erosion         0
		montesMagn      0.439355
		montesFreq      2.66047
		montesSpiky     0.993689
		montesFraction  0.509521
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.76165
		hillsFraction   0.57717
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221732
		craterFreq      0.223174
		craterDensity   0.723535
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.471967
		volcanoTemp     1611.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.167, 0.144, 0.117, 0.000)
		colorShelf     (0.171, 0.148, 0.133, 0.000)
		colorBeach     (0.201, 0.174, 0.158, 0.000)
		colorDesert    (0.218, 0.186, 0.154, 0.000)
		colorLowland   (0.240, 0.199, 0.175, 0.000)
		colorUpland    (0.265, 0.241, 0.212, 0.000)
		colorRock      (0.287, 0.262, 0.229, 0.000)
		colorSnow      (0.312, 0.279, 0.242, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0022676
		Period          0.0128801
		Eccentricity    0.479849
		Inclination     -56.2435
		AscendingNode   19.9325
		ArgOfPericenter -99.5596
		MeanAnomaly     -151.402
	}
}

DwarfMoon	"Dellalt System 3.D7"
{
	ParentBody     "Dellalt System 3"
	Class	       "Asteroid"

	Mass            5.70511e-008
	Radius          29.061
	InertiaMoment   0.395908

	Obliquity       38.1005
	EqAscendNode    55.0962
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.536 0.533 0.529)

	Surface
	{
		SurfStyle       0.138178
		OceanStyle      0.674255
		Randomize      (0.369, 0.486, -0.624)
		colorDistMagn   0.705658
		colorDistFreq   0.721982
		detailScale     793.56
		colorConversion true
		snowLevel       2
		tropicLatitude  0.915904
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.637472
		terraceProb     0.205087
		erosion         0
		montesMagn      0.52073
		montesFreq      2.83512
		montesSpiky     0.895559
		montesFraction  0.73087
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.61629
		hillsFraction   0.768372
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226738
		craterFreq      0.21476
		craterDensity   0.86396
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.546771
		volcanoTemp     1568.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.214, 0.213, 0.212, 0.000)
		colorShelf     (0.228, 0.226, 0.225, 0.000)
		colorBeach     (0.241, 0.240, 0.238, 0.000)
		colorDesert    (0.254, 0.253, 0.251, 0.000)
		colorLowland   (0.268, 0.266, 0.265, 0.000)
		colorUpland    (0.281, 0.280, 0.278, 0.000)
		colorRock      (0.295, 0.293, 0.291, 0.000)
		colorSnow      (0.308, 0.306, 0.304, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00281829
		Period          0.0178462
		Eccentricity    0.0907155
		Inclination     38.1005
		AscendingNode   55.0962
		ArgOfPericenter -74.7233
		MeanAnomaly     170.385
	}
}

Planet	"Dellalt System 4"
{
	ParentBody     "Dellalt System"
	Class	       "Selena"

	Mass            0.0526699
	Radius          2464.97
	InertiaMoment   0.34607

	Obliquity       -0.752327
	EqAscendNode    -74.8173
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.697 0.694 0.691)

	Surface
	{
		SurfStyle       0.960616
		OceanStyle      0.251718
		Randomize      (-0.552, -0.129, -0.974)
		colorDistMagn   0.0622394
		colorDistFreq   314.599
		detailScale     6340.05
		colorConversion true
		drivenDarkening 0
		seaLevel        0.260736
		snowLevel       2
		tropicLatitude  0.0208583
		icecapLatitude  10
		icecapHeight    0.176849
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.8432
		venusFreq       1.15013
		venusMagn       0
		mareFreq        1.23552
		mareDensity     0.0171199
		terraceProb     0.364397
		erosion         0
		montesMagn      0.134292
		montesFreq      113.125
		montesSpiky     0.981501
		montesFraction  0.373124
		dunesMagn       0.0511525
		dunesFreq       3243.3
		dunesFraction   0.795829
		hillsMagn       0.121269
		hillsFreq       257.566
		hillsFraction   0.935223
		hills2Fraction  0
		riversMagn      60.2721
		riversFreq      2.64794
		riversSin       4.43152
		riversOctaves   0
		canyonsMagn     0.402049
		canyonsFreq     0.832578
		canyonFraction  0.320502
		cracksMagn      0.0397668
		cracksFreq      1.40514
		cracksOctaves   0
		craterMagn      0.573804
		craterFreq      5.91828
		craterDensity   0.937002
		craterOctaves   12
		craterRayedFactor 0.202881
		volcanoMagn     0.454245
		volcanoFreq     0.818227
		volcanoDensity  0.184163
		volcanoOctaves  3
		volcanoActivity 0.0233542
		volcanoFlows    0.376374
		volcanoRadius   0.419703
		volcanoTemp     1230.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.390, 0.400, 0.160, 0.000)
		colorShelf     (0.580, 0.550, 0.240, 0.000)
		colorBeach     (0.495, 0.472, 0.290, 0.000)
		colorDesert    (0.572, 0.527, 0.297, 0.000)
		colorLowland   (0.439, 0.382, 0.214, 0.000)
		colorUpland    (0.412, 0.354, 0.200, 0.000)
		colorRock      (0.330, 0.240, 0.130, 0.000)
		colorSnow      (0.900, 0.890, 0.760, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.98921
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
		Height          106.08
		Density         0.00107902
		Pressure        0.000414547
		Greenhouse      0.0528278
		Bright          4.04209
		Opacity         0
		SkyLight        1.34736
		Hue             0.0236253
		Saturation      1

		Composition
		{
			SO2   	99.5832
			CO2   	0.416747
			C3H8  	4.39582e-005
			Cl2   	1.35452e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.333329
		Period          0.230308
		Eccentricity    0.0384865
		Inclination     -0.752327
		AscendingNode   -74.8172
		ArgOfPericenter 332.566
		MeanAnomaly     71.1573
	}
}

DwarfMoon	"Dellalt System 4.D1"
{
	ParentBody     "Dellalt System 4"
	Class	       "Asteroid"

	Mass            1.35291e-006
	Radius          151.379
	InertiaMoment   0.399567

	Oblateness      0.249

	Obliquity       0.0148154
	EqAscendNode    77.5338
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.744 0.632 0.551)

	Surface
	{
		SurfStyle       0.972952
		OceanStyle      0.468648
		Randomize      (0.376, -0.190, 0.872)
		colorDistMagn   0.823981
		colorDistFreq   12.6407
		detailScale     4133.66
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.612913
		terraceProb     0.266328
		erosion         0
		montesMagn      0.290336
		montesFreq      3.7386
		montesSpiky     0.967501
		montesFraction  0.548683
		dunesFraction   0
		hillsMagn       0
		hillsFreq       57.1873
		hillsFraction   0.87103
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242229
		craterFreq      0.534216
		craterDensity   0.950752
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.458864
		volcanoTemp     1805.09
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.253, 0.221, 0.221, 0.050)
		colorShelf     (0.298, 0.259, 0.254, 0.040)
		colorBeach     (0.342, 0.297, 0.287, 0.030)
		colorDesert    (0.387, 0.335, 0.325, 0.020)
		colorLowland   (0.432, 0.373, 0.358, 0.030)
		colorUpland    (0.476, 0.411, 0.391, 0.050)
		colorRock      (0.521, 0.449, 0.436, 0.020)
		colorSnow      (0.521, 0.449, 0.436, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.13855e-005
		Period          0.000928227
		Eccentricity    2.22749e-005
		Inclination     0.0148154
		AscendingNode   77.5338
		ArgOfPericenter 50.8728
		MeanAnomaly     -35.4813
	}
}

DwarfMoon	"Dellalt System 4.D2"
{
	ParentBody     "Dellalt System 4"
	Class	       "Asteroid"

	Mass            1.99065e-006
	Radius          85.6542
	InertiaMoment   0.397311

	RotationPeriod  294.871
	Obliquity       -19.442
	EqAscendNode    163.961

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.548 0.540 0.537)

	Surface
	{
		SurfStyle       0.412329
		OceanStyle      0.442321
		Randomize      (-0.455, 0.128, -0.553)
		colorDistMagn   0.702435
		colorDistFreq   4.28184
		detailScale     2338.93
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0927709
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.71801
		terraceProb     0.227083
		erosion         0
		montesMagn      0.696459
		montesFreq      2.36061
		montesSpiky     0.93871
		montesFraction  0.673037
		dunesFraction   0
		hillsMagn       0
		hillsFreq       14.0967
		hillsFraction   0.561244
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242722
		craterFreq      0.224584
		craterDensity   0.773405
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.514936
		volcanoTemp     1652.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.219, 0.216, 0.215, 0.000)
		colorShelf     (0.233, 0.230, 0.228, 0.000)
		colorBeach     (0.246, 0.243, 0.241, 0.000)
		colorDesert    (0.260, 0.257, 0.255, 0.000)
		colorLowland   (0.274, 0.270, 0.268, 0.000)
		colorUpland    (0.288, 0.284, 0.282, 0.000)
		colorRock      (0.301, 0.297, 0.295, 0.000)
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

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000270532
		Period          0.0112129
		Eccentricity    0.146429
		Inclination     -19.442
		AscendingNode   163.961
		ArgOfPericenter -105.435
		MeanAnomaly     -109.376
	}
}

Planet	"Dellalt System 5"
{
	ParentBody     "Dellalt System"
	Class	       "Desert"

	Mass            0.257885
	Radius          5035.42
	InertiaMoment   0.327926

	Oblateness      0.00393501

	RotationPeriod  30.3257
	Obliquity       -31.6172
	EqAscendNode    -50.4342

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.468 0.462 0.456)

	Surface
	{
		SurfStyle       0.421162
		OceanStyle      0.578374
		Randomize      (-0.114, -0.867, -0.438)
		colorDistMagn   0.0832995
		colorDistFreq   700.057
		detailScale     12951.4
		colorConversion true
		seaLevel        0.105873
		snowLevel       2
		tropicLatitude  0.533415
		icecapLatitude  0.926363
		icecapHeight    0.111365
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.707948
		venusFreq       1.10509
		venusMagn       0
		mareFreq        1.76679
		mareDensity     0.0344141
		terraceProb     0.124762
		erosion         0
		montesMagn      0.16695
		montesFreq      209.276
		montesSpiky     0.98438
		montesFraction  0.36266
		dunesMagn       0.0535071
		dunesFreq       43.9641
		dunesFraction   0.122047
		hillsMagn       0.15346
		hillsFreq       506.715
		hillsFraction   0
		hills2Fraction  0
		riversMagn      70.0823
		riversFreq      2.46791
		riversSin       6.68492
		riversOctaves   0
		canyonsMagn     0.0112692
		canyonsFreq     144.602
		canyonFraction  0
		cracksMagn      0.11143
		cracksFreq      0.56459
		cracksOctaves   0
		craterMagn      0.584814
		craterFreq      14.7798
		craterDensity   0.705023
		craterOctaves   12.4912
		volcanoMagn     0.643799
		volcanoFreq     0.850625
		volcanoDensity  0.261732
		volcanoOctaves  3
		volcanoActivity 0.228212
		volcanoFlows    0.753702
		volcanoRadius   0.479979
		volcanoTemp     1860.04
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
		Hapke           0.969309
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
		Height          42.809
		Density         0.00306908
		Pressure        0.0013104
		Greenhouse      0.186099
		Bright          4.98198
		Opacity         1
		SkyLight        1.66066
		Hue             0.0353273
		Saturation      1

		Composition
		{
			CO2   	97.7312
			H2O   	1.12437
			SO2   	0.855503
			NH3   	0.0834071
			H2S   	0.0640406
			N2    	0.0405472
			C2H6  	0.036322
			C2H2  	0.0318473
			C2H4  	0.0308072
			C3H8  	0.00187968
			CH4   	2.32957e-005
			Ar    	2.11211e-005
			CO    	1.56227e-005
		}
	}

	Aurora
	{
		Height      52.1147
		NorthLat    52.4041
		NorthLon    156.038
		NorthRadius 1502.23
		NorthWidth  547.463
		NorthRings  3
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -51.6075
		SouthLon    345.483
		SouthRadius 1506.94
		SouthWidth  347.138
		SouthRings  2
		SouthBright 0.3
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	Rings
	{
		InnerRadius     6291.38
		OuterRadius     11157.9
		RotationPeriod  4.44624
		RotationOffset  0
		FrontBright     0.971205
		BackBright      0.7942
		Density         0.599895
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.584984
		Period          0.535447
		Eccentricity    0.0538201
		Inclination     -0.995808
		AscendingNode   -52.1761
		ArgOfPericenter 39.6857
		MeanAnomaly     338.17
	}
}

DwarfMoon	"Dellalt System 5.D1"
{
	ParentBody     "Dellalt System 5"
	Class	       "Asteroid"

	Mass            4.15056e-010
	Radius          12.0135
	InertiaMoment   0.399917

	Oblateness      0.249

	Obliquity       -0.00615154
	EqAscendNode    -116.136
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.798 0.684 0.639)

	Surface
	{
		SurfStyle       0.88617
		OceanStyle      0.961682
		Randomize      (-0.338, -0.025, -0.743)
		colorDistMagn   0.707841
		colorDistFreq   0.0491552
		detailScale     328.049
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.644615
		terraceProb     0.1606
		erosion         0
		montesMagn      0.442554
		montesFreq      3.40437
		montesSpiky     0.974043
		montesFraction  0.603422
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.292909
		hillsFraction   0.622412
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.274994
		craterFreq      0.277249
		craterDensity   0.745247
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.477629
		volcanoTemp     1669.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.271, 0.240, 0.256, 0.050)
		colorShelf     (0.319, 0.281, 0.294, 0.040)
		colorBeach     (0.367, 0.322, 0.332, 0.030)
		colorDesert    (0.415, 0.363, 0.377, 0.020)
		colorLowland   (0.463, 0.404, 0.415, 0.030)
		colorUpland    (0.511, 0.445, 0.454, 0.050)
		colorRock      (0.559, 0.486, 0.505, 0.020)
		colorSnow      (0.559, 0.486, 0.505, 1.000)
		BumpHeight      10.8122
		BumpOffset      2.16244
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   8.85549e-005
		Period          0.000949042
		Eccentricity    7.73837e-005
		Inclination     -0.00615154
		AscendingNode   -116.136
		ArgOfPericenter -169.856
		MeanAnomaly     83.6388
	}
}

DwarfMoon	"Dellalt System 5.D2"
{
	ParentBody     "Dellalt System 5"
	Class	       "Asteroid"

	Mass            6.16155e-010
	Radius          12.5288
	InertiaMoment   0.397997

	Oblateness      0.249

	Obliquity       0.0114949
	EqAscendNode    112.027
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.559 0.455 0.345)

	Surface
	{
		SurfStyle       0.180059
		OceanStyle      0.215744
		Randomize      (0.826, 0.471, -0.855)
		colorDistMagn   0.485805
		colorDistFreq   0.0837748
		detailScale     342.12
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.529552
		terraceProb     0.319103
		erosion         0
		montesMagn      0.563664
		montesFreq      2.67021
		montesSpiky     0.991295
		montesFraction  0.743312
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.420027
		hillsFraction   0.766251
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235591
		craterFreq      0.226772
		craterDensity   1.09889
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.548412
		volcanoTemp     1856.95
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.224, 0.182, 0.138, 0.000)
		colorShelf     (0.238, 0.193, 0.147, 0.000)
		colorBeach     (0.252, 0.205, 0.155, 0.000)
		colorDesert    (0.266, 0.216, 0.164, 0.000)
		colorLowland   (0.280, 0.227, 0.173, 0.000)
		colorUpland    (0.294, 0.239, 0.181, 0.000)
		colorRock      (0.308, 0.250, 0.190, 0.000)
		colorSnow      (0.322, 0.262, 0.198, 1.000)
		BumpHeight      11.2759
		BumpOffset      2.25519
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000100056
		Period          0.00113981
		Eccentricity    3.21472e-005
		Inclination     0.0114949
		AscendingNode   112.027
		ArgOfPericenter 81.8625
		MeanAnomaly     175.456
	}
}

Moon	"Dellalt System 5.1"
{
	ParentBody     "Dellalt System 5"
	Class	       "Selena"

	Mass            0.000269169
	Radius          495.097
	InertiaMoment   0.399442

	Oblateness      0.0104831

	Obliquity       -1.33941
	EqAscendNode    83.9575
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.546 0.542 0.538)

	Surface
	{
		SurfStyle       0.421745
		OceanStyle      0.810062
		Randomize      (0.516, -0.980, 0.768)
		colorDistMagn   0.0724067
		colorDistFreq   48.597
		detailScale     1273.42
		colorConversion true
		drivenDarkening 0
		seaLevel        0.255731
		snowLevel       2
		tropicLatitude  0.0347486
		icecapLatitude  10
		icecapHeight    0.217415
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.88179
		venusFreq       0.460043
		venusMagn       0
		mareFreq        0
		mareDensity     0.000298205
		terraceProb     0.323268
		erosion         0
		montesMagn      0.0492541
		montesFreq      17.3229
		montesSpiky     0.959871
		montesFraction  0.313006
		dunesMagn       0.0427197
		dunesFreq       635.721
		dunesFraction   0.251838
		hillsMagn       0.122069
		hillsFreq       60.0314
		hillsFraction   0.0388567
		hills2Fraction  0
		riversMagn      63.2205
		riversFreq      1.99876
		riversSin       5.816
		riversOctaves   0
		canyonsMagn     0.321046
		canyonsFreq     0.205015
		canyonFraction  0.119244
		cracksMagn      0.0653584
		cracksFreq      0.345998
		cracksOctaves   0
		craterMagn      0.575994
		craterFreq      1.1764
		craterDensity   0.868074
		craterOctaves   8.33483
		craterRayedFactor 0.207526
		volcanoMagn     0.170602
		volcanoFreq     0.810629
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.288664
		volcanoRadius   0.160603
		volcanoTemp     1425.89
		lavaCoverTidal  0.0821201
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.420, 0.420, 0.430, 0.000)
		colorShelf     (0.470, 0.480, 0.480, 0.000)
		colorBeach     (0.301, 0.309, 0.323, 0.000)
		colorDesert    (0.262, 0.249, 0.247, 0.000)
		colorLowland   (0.333, 0.331, 0.301, 0.000)
		colorUpland    (0.355, 0.352, 0.328, 0.000)
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
		SemiMajorAxis   0.000160285
		Period          0.00230983
		Eccentricity    0.0360397
		Inclination     -1.33941
		AscendingNode   83.9575
		ArgOfPericenter 42.7103
		MeanAnomaly     -12.9099
	}
}

DwarfMoon	"Dellalt System 5.D3"
{
	ParentBody     "Dellalt System 5"
	Class	       "Asteroid"

	Mass            1.29138e-009
	Radius          14.7229
	InertiaMoment   0.395209

	RotationPeriod  669.23
	Obliquity       7.75085
	EqAscendNode    71.7371

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.480 0.477 0.474)

	Surface
	{
		SurfStyle       0.771322
		OceanStyle      0.271928
		Randomize      (-0.826, 0.663, 0.903)
		colorDistMagn   0.730908
		colorDistFreq   0.140792
		detailScale     402.032
		colorConversion true
		snowLevel       2
		tropicLatitude  0.217271
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.574748
		terraceProb     0.314623
		erosion         0
		montesMagn      0.363014
		montesFreq      3.24624
		montesSpiky     0.994951
		montesFraction  0.340666
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.514675
		hillsFraction   0.528998
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.180996
		craterFreq      0.251916
		craterDensity   0.747572
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.422716
		volcanoTemp     1435.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.187, 0.162, 0.133, 0.000)
		colorShelf     (0.192, 0.167, 0.152, 0.000)
		colorBeach     (0.226, 0.196, 0.180, 0.000)
		colorDesert    (0.245, 0.210, 0.175, 0.000)
		colorLowland   (0.269, 0.224, 0.199, 0.000)
		colorUpland    (0.298, 0.272, 0.242, 0.000)
		colorRock      (0.322, 0.296, 0.261, 0.000)
		colorSnow      (0.351, 0.315, 0.275, 1.000)
		BumpHeight      13.2506
		BumpOffset      2.65011
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000793348
		Period          0.0254485
		Eccentricity    0.340332
		Inclination     7.75085
		AscendingNode   71.7371
		ArgOfPericenter -151.491
		MeanAnomaly     -82.646
	}
}

DwarfMoon	"Dellalt System 5.D4"
{
	ParentBody     "Dellalt System 5"
	Class	       "Asteroid"

	Mass            1.83319e-009
	Radius          20.6037
	InertiaMoment   0.398194

	RotationPeriod  1555.89
	Obliquity       81.4904
	EqAscendNode    -53.865

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.446 0.441 0.434)

	Surface
	{
		SurfStyle       0.463584
		OceanStyle      0.910295
		Randomize      (0.701, -0.577, -0.544)
		colorDistMagn   0.721708
		colorDistFreq   0.341416
		detailScale     562.618
		colorConversion true
		snowLevel       2
		tropicLatitude  0.83193
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.367038
		terraceProb     0.251744
		erosion         0
		montesMagn      0.664034
		montesFreq      3.51024
		montesSpiky     0.872663
		montesFraction  0.623208
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.10271
		hillsFraction   0.76031
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261528
		craterFreq      0.231414
		craterDensity   0.798702
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.527016
		volcanoTemp     1646.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.178, 0.176, 0.174, 0.000)
		colorShelf     (0.190, 0.187, 0.185, 0.000)
		colorBeach     (0.201, 0.198, 0.195, 0.000)
		colorDesert    (0.212, 0.209, 0.206, 0.000)
		colorLowland   (0.223, 0.220, 0.217, 0.000)
		colorUpland    (0.234, 0.231, 0.228, 0.000)
		colorRock      (0.245, 0.242, 0.239, 0.000)
		colorSnow      (0.257, 0.253, 0.250, 1.000)
		BumpHeight      18.5433
		BumpOffset      3.70866
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0013923
		Period          0.0591649
		Eccentricity    0.336497
		Inclination     81.4904
		AscendingNode   -53.865
		ArgOfPericenter 149.757
		MeanAnomaly     -179.901
	}
}

DwarfMoon	"Dellalt System 5.D5"
{
	ParentBody     "Dellalt System 5"
	Class	       "Asteroid"

	Mass            2.57579e-009
	Radius          20.3383
	InertiaMoment   0.399274

	Obliquity       -18.4569
	EqAscendNode    35.0526
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.492 0.486 0.483)

	Surface
	{
		SurfStyle       0.572889
		OceanStyle      0.636761
		Randomize      (-0.771, -0.272, 0.478)
		colorDistMagn   0.757436
		colorDistFreq   0.208071
		detailScale     555.371
		colorConversion true
		snowLevel       2
		tropicLatitude  0.575617
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.406694
		terraceProb     0.459029
		erosion         0
		montesMagn      0.62253
		montesFreq      2.31883
		montesSpiky     0.999004
		montesFraction  0.651482
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.15321
		hillsFraction   0.562161
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2405
		craterFreq      0.148219
		craterDensity   1.06326
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.569661
		volcanoTemp     2032.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.192, 0.165, 0.135, 0.000)
		colorShelf     (0.197, 0.170, 0.154, 0.000)
		colorBeach     (0.231, 0.199, 0.183, 0.000)
		colorDesert    (0.251, 0.214, 0.179, 0.000)
		colorLowland   (0.276, 0.229, 0.203, 0.000)
		colorUpland    (0.305, 0.277, 0.246, 0.000)
		colorRock      (0.330, 0.302, 0.265, 0.000)
		colorSnow      (0.359, 0.321, 0.280, 1.000)
		BumpHeight      18.3045
		BumpOffset      3.66089
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0019674
		Period          0.0993811
		Eccentricity    0.0774485
		Inclination     -18.4569
		AscendingNode   35.0526
		ArgOfPericenter -5.45919
		MeanAnomaly     76.7922
	}
}

/*Planet	"Dellalt System 6"
{
	ParentBody     "Dellalt System"
	Class	       "Desert"

	Mass            1.22636
	Radius          8110.74
	InertiaMoment   0.329292

	Oblateness      0.010244

	RotationPeriod  17.6633
	Obliquity       3.02792
	EqAscendNode    -142.348

	AlbedoBond      0.329978
	AlbedoGeom      0.395974
	Brightness      2
	Color          (0.789 0.785 0.783)

	Surface
	{
		SurfStyle       0.49558
		OceanStyle      0.630305
		Randomize      (-0.166, 0.464, 0.674)
		colorDistMagn   0.0492745
		colorDistFreq   993.014
		detailScale     20861.3
		colorConversion true
		seaLevel        0.0561706
		snowLevel       0.85
		tropicLatitude  0.0670676
		icecapLatitude  0.939163
		icecapHeight    0.0590346
		climatePole     0.9375
		climateTropic   0.528635
		climateEquator  0.6875
		heightTempGrad  0.408865
		tropicWidth     0.391394
		mainFreq        0.887735
		venusFreq       1.55361
		venusMagn       0.301884
		mareFreq        2.43742
		mareDensity     0.11721
		terraceProb     0.118987
		erosion         0
		montesMagn      0.15153
		montesFreq      409.19
		montesSpiky     0.914702
		montesFraction  0.348614
		dunesMagn       0.0534481
		dunesFreq       95.0693
		dunesFraction   0.651653
		hillsMagn       0.143434
		hillsFreq       762.896
		hillsFraction   0
		hills2Fraction  0
		riversMagn      52.6534
		riversFreq      2.95727
		riversSin       6.87364
		riversOctaves   0
		canyonsMagn     0.048045
		canyonsFreq     189.018
		canyonFraction  0
		cracksMagn      0.0967182
		cracksFreq      0.70739
		cracksOctaves   0
		craterMagn      0.61393
		craterFreq      22.3499
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.690776
		volcanoFreq     0.614434
		volcanoDensity  0.333289
		volcanoOctaves  3
		volcanoActivity 0.558582
		volcanoFlows    0.848396
		volcanoRadius   0.479635
		volcanoTemp     1268.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.76591
		stripeTwist     0
		cycloneMagn     2.54323
		cycloneFreq     0.984039
		cycloneDensity  0.327219
		cycloneOctaves  2
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
		Height          15.1636
		Velocity        66.1593
		BumpHeight      5.16334
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.911009
		mainOctaves     10
		Coverage        0.259956
		stripeZones     1.76591
		stripeTwist     0
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          43.075
		Density         7.37101
		Pressure        2.70564
		Greenhouse      3.09453
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.0470293
		Saturation      0.895212

		Composition
		{
			CO2   	79.2702
			N2    	20.6287
			CO    	0.0892845
			Ar    	0.00818839
			SO2   	0.00321277
			Ne    	0.000309406
			Kr    	1.70069e-005
			H2O   	1.42819e-005
		}
	}

	Aurora
	{
		Height      91.4039
		NorthLat    85.9516
		NorthLon    -151.98
		NorthRadius 1835.9
		NorthWidth  385.832
		NorthRings  2
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -88.212
		SouthLon    22.1227
		SouthRadius 1061.39
		SouthWidth  374.05
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
		SemiMajorAxis   0.996026
		Period          1.18961
		Eccentricity    0.0980712
		Inclination     -1.0138
		AscendingNode   -138.427
		ArgOfPericenter 54.6924
		MeanAnomaly     44.237
	}
}

DwarfMoon	"Dellalt System 6.D1"
{
	ParentBody     "Dellalt System 6"
	Class	       "Asteroid"

	Mass            5.14496e-008
	Radius          54.029
	InertiaMoment   0.398665

	Oblateness      0.249

	Obliquity       0.00288148
	EqAscendNode    50.1936
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.649 0.645 0.643)

	Surface
	{
		SurfStyle       0.304612
		OceanStyle      0.145579
		Randomize      (0.567, -0.589, 0.543)
		colorDistMagn   0.604895
		colorDistFreq   1.89254
		detailScale     1475.35
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.480018
		terraceProb     0.31778
		erosion         0
		montesMagn      0.398995
		montesFreq      3.51786
		montesSpiky     0.880281
		montesFraction  0.505072
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.74754
		hillsFraction   0.693314
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244034
		craterFreq      0.202981
		craterDensity   1.03127
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.503964
		volcanoTemp     1208.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.260, 0.258, 0.257, 0.000)
		colorShelf     (0.276, 0.274, 0.273, 0.000)
		colorBeach     (0.292, 0.290, 0.289, 0.000)
		colorDesert    (0.308, 0.306, 0.305, 0.000)
		colorLowland   (0.325, 0.322, 0.321, 0.000)
		colorUpland    (0.341, 0.338, 0.337, 0.000)
		colorRock      (0.357, 0.355, 0.354, 0.000)
		colorSnow      (0.373, 0.371, 0.370, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000167611
		Period          0.00113324
		Eccentricity    3.24925e-005
		Inclination     0.00288148
		AscendingNode   50.1936
		ArgOfPericenter -30.5839
		MeanAnomaly     -157.241
	}
}

DwarfMoon	"Dellalt System 6.D2"
{
	ParentBody     "Dellalt System 6"
	Class	       "Asteroid"

	Mass            6.99458e-008
	Radius          57.429
	InertiaMoment   0.399633

	Oblateness      0.216712

	Obliquity       0.00197294
	EqAscendNode    67.6535
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.516 0.509 0.503)

	Surface
	{
		SurfStyle       0.621572
		OceanStyle      0.701458
		Randomize      (-0.941, -0.355, 0.888)
		colorDistMagn   0.445962
		colorDistFreq   1.40467
		detailScale     1568.2
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.453483
		terraceProb     0.357986
		erosion         0
		montesMagn      0.415884
		montesFreq      3.27751
		montesSpiky     0.836287
		montesFraction  0.620435
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.19146
		hillsFraction   0.68554
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240085
		craterFreq      0.232806
		craterDensity   0.807767
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.485714
		volcanoTemp     1300.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.201, 0.173, 0.141, 0.000)
		colorShelf     (0.207, 0.178, 0.161, 0.000)
		colorBeach     (0.243, 0.209, 0.191, 0.000)
		colorDesert    (0.263, 0.224, 0.186, 0.000)
		colorLowland   (0.289, 0.239, 0.211, 0.000)
		colorUpland    (0.320, 0.290, 0.257, 0.000)
		colorRock      (0.346, 0.315, 0.277, 0.000)
		colorSnow      (0.377, 0.336, 0.292, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000178501
		Period          0.00124547
		Eccentricity    4.21924e-005
		Inclination     0.00197294
		AscendingNode   67.6535
		ArgOfPericenter -25.3182
		MeanAnomaly     97.4963
	}
}

DwarfMoon	"Dellalt System 6.D3"
{
	ParentBody     "Dellalt System 6"
	Class	       "Asteroid"

	Mass            9.53081e-008
	Radius          60.891
	InertiaMoment   0.397462

	Oblateness      0.0314969

	Obliquity       0.199353
	EqAscendNode    -133.812
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.707 0.638 0.559)

	Surface
	{
		SurfStyle       0.402531
		OceanStyle      0.767249
		Randomize      (-0.445, 0.695, 0.522)
		colorDistMagn   0.805699
		colorDistFreq   2.17197
		detailScale     1662.73
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00271863
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.564012
		terraceProb     0.479484
		erosion         0
		montesMagn      0.510262
		montesFreq      2.80683
		montesSpiky     0.87492
		montesFraction  0.435954
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.48499
		hillsFraction   0.943339
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218457
		craterFreq      0.178405
		craterDensity   0.985342
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.497262
		volcanoTemp     1691.09
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.283, 0.255, 0.224, 0.000)
		colorShelf     (0.300, 0.271, 0.237, 0.000)
		colorBeach     (0.318, 0.287, 0.251, 0.000)
		colorDesert    (0.336, 0.303, 0.265, 0.000)
		colorLowland   (0.353, 0.319, 0.279, 0.000)
		colorUpland    (0.371, 0.335, 0.293, 0.000)
		colorRock      (0.389, 0.351, 0.307, 0.000)
		colorSnow      (0.407, 0.367, 0.321, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000323817
		Period          0.00304313
		Eccentricity    0.042809
		Inclination     0.199353
		AscendingNode   -133.812
		ArgOfPericenter -177.093
		MeanAnomaly     68.1845
	}
}

DwarfMoon	"Dellalt System 6.D4"
{
	ParentBody     "Dellalt System 6"
	Class	       "Asteroid"

	Mass            1.30286e-007
	Radius          79.8344
	InertiaMoment   0.398818

	RotationPeriod  2767.53
	Obliquity       49.1084
	EqAscendNode    73.6513

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.536 0.533 0.528)

	Surface
	{
		SurfStyle       0.526733
		OceanStyle      0.840438
		Randomize      (-0.372, 0.229, 0.903)
		colorDistMagn   0.103206
		colorDistFreq   2.78785
		detailScale     2180.01
		colorConversion true
		snowLevel       2
		tropicLatitude  0.963507
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.660937
		terraceProb     0.384847
		erosion         0
		montesMagn      0.492934
		montesFreq      3.98689
		montesSpiky     0.960094
		montesFraction  0.702124
		dunesFraction   0
		hillsMagn       0
		hillsFreq       13.7277
		hillsFraction   0.559417
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255392
		craterFreq      0.218023
		craterDensity   0.977125
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.445938
		volcanoTemp     1384.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.209, 0.181, 0.148, 0.000)
		colorShelf     (0.214, 0.186, 0.169, 0.000)
		colorBeach     (0.252, 0.218, 0.201, 0.000)
		colorDesert    (0.273, 0.234, 0.195, 0.000)
		colorLowland   (0.300, 0.250, 0.222, 0.000)
		colorUpland    (0.332, 0.304, 0.269, 0.000)
		colorRock      (0.359, 0.330, 0.290, 0.000)
		colorSnow      (0.391, 0.352, 0.306, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00216531
		Period          0.0526198
		Eccentricity    0.370211
		Inclination     49.1084
		AscendingNode   73.6513
		ArgOfPericenter -160.226
		MeanAnomaly     110.014
	}
}

DwarfMoon	"Dellalt System 6.D5"
{
	ParentBody     "Dellalt System 6"
	Class	       "Asteroid"

	Mass            1.78857e-007
	Radius          82.3977
	InertiaMoment   0.39976

	RotationPeriod  3257.37
	Obliquity       -79.7111
	EqAscendNode    -23.2686

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.504 0.495 0.490)

	Surface
	{
		SurfStyle       0.677622
		OceanStyle      0.254986
		Randomize      (0.934, 0.448, 0.006)
		colorDistMagn   0.945147
		colorDistFreq   2.26461
		detailScale     2250.01
		colorConversion true
		snowLevel       2
		tropicLatitude  0.514562
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.285233
		terraceProb     0.317738
		erosion         0
		montesMagn      0.452099
		montesFreq      3.70331
		montesSpiky     0.950873
		montesFraction  0.274414
		dunesFraction   0
		hillsMagn       0
		hillsFreq       14.2238
		hillsFraction   0.757954
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.212428
		craterFreq      0.228014
		craterDensity   0.79139
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.465989
		volcanoTemp     1488.95
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.197, 0.168, 0.137, 0.000)
		colorShelf     (0.202, 0.173, 0.157, 0.000)
		colorBeach     (0.237, 0.203, 0.186, 0.000)
		colorDesert    (0.257, 0.218, 0.181, 0.000)
		colorLowland   (0.282, 0.233, 0.206, 0.000)
		colorUpland    (0.313, 0.282, 0.250, 0.000)
		colorRock      (0.338, 0.307, 0.269, 0.000)
		colorSnow      (0.368, 0.327, 0.284, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00272578
		Period          0.07432
		Eccentricity    0.34176
		Inclination     -79.7111
		AscendingNode   -23.2686
		ArgOfPericenter 172.822
		MeanAnomaly     -105.919
	}
}

DwarfMoon	"Dellalt System 6.D6"
{
	ParentBody     "Dellalt System 6"
	Class	       "Asteroid"

	Mass            2.4685e-007
	Radius          87.9278
	InertiaMoment   0.39772

	Obliquity       12.3159
	EqAscendNode    -66.5176
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.749 0.745 0.742)

	Surface
	{
		SurfStyle       0.268207
		OceanStyle      0.17927
		Randomize      (0.441, 0.705, 0.517)
		colorDistMagn   0.474488
		colorDistFreq   3.34654
		detailScale     2401.02
		colorConversion true
		snowLevel       2
		tropicLatitude  0.351007
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.42263
		terraceProb     0.429796
		erosion         0
		montesMagn      0.468115
		montesFreq      2.91978
		montesSpiky     0.958665
		montesFraction  0.352432
		dunesFraction   0
		hillsMagn       0
		hillsFreq       19.7895
		hillsFraction   0.517654
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232301
		craterFreq      0.232258
		craterDensity   0.934945
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.481174
		volcanoTemp     1414.96
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
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0029755
		Period          0.0847638
		Eccentricity    0.262223
		Inclination     12.3159
		AscendingNode   -66.5176
		ArgOfPericenter 4.85162
		MeanAnomaly     -46.2435
	}
}

DwarfMoon	"Dellalt System 6.D7"
{
	ParentBody     "Dellalt System 6"
	Class	       "Asteroid"

	Mass            3.42939e-007
	Radius          94.0157
	InertiaMoment   0.398963

	RotationPeriod  1307.34
	Obliquity       52.4696
	EqAscendNode    0.500003

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.666 0.662 0.656)

	Surface
	{
		SurfStyle       0.79122
		OceanStyle      0.872463
		Randomize      (0.753, -0.204, -0.411)
		colorDistMagn   0.912042
		colorDistFreq   5.20779
		detailScale     2567.26
		colorConversion true
		snowLevel       2
		tropicLatitude  0.966207
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.518639
		terraceProb     0.294977
		erosion         0
		montesMagn      0.540254
		montesFreq      3.58491
		montesSpiky     0.998343
		montesFraction  0.413751
		dunesFraction   0
		hillsMagn       0
		hillsFreq       22.0384
		hillsFraction   0.769999
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217358
		craterFreq      0.346952
		craterDensity   1.03661
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.520286
		volcanoTemp     1493.24
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.260, 0.225, 0.184, 0.000)
		colorShelf     (0.266, 0.232, 0.210, 0.000)
		colorBeach     (0.313, 0.271, 0.249, 0.000)
		colorDesert    (0.340, 0.291, 0.243, 0.000)
		colorLowland   (0.373, 0.311, 0.276, 0.000)
		colorUpland    (0.413, 0.377, 0.335, 0.000)
		colorRock      (0.446, 0.411, 0.361, 0.000)
		colorSnow      (0.486, 0.437, 0.381, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00330945
		Period          0.0994268
		Eccentricity    0.401782
		Inclination     52.4696
		AscendingNode   0.500003
		ArgOfPericenter -32.6918
		MeanAnomaly     33.0156
	}
}

DwarfMoon	"Dellalt System 6.D8"
{
	ParentBody     "Dellalt System 6"
	Class	       "Asteroid"

	Mass            4.80243e-007
	Radius          126.319
	InertiaMoment   0.399885

	Obliquity       -45.1239
	EqAscendNode    -107.106
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.438 0.431 0.428)

	Surface
	{
		SurfStyle       0.588228
		OceanStyle      0.0323554
		Randomize      (0.231, 0.261, -0.463)
		colorDistMagn   0.141082
		colorDistFreq   12.7745
		detailScale     3449.35
		colorConversion true
		snowLevel       2
		tropicLatitude  0.763721
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.49913
		terraceProb     0.133236
		erosion         0
		montesMagn      0.539474
		montesFreq      3.50382
		montesSpiky     0.933022
		montesFraction  0.440173
		dunesFraction   0
		hillsMagn       0
		hillsFreq       39.5089
		hillsFraction   0.447939
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24656
		craterFreq      0.563215
		craterDensity   0.846225
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.450084
		volcanoTemp     1486.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.171, 0.146, 0.120, 0.000)
		colorShelf     (0.175, 0.151, 0.137, 0.000)
		colorBeach     (0.206, 0.177, 0.162, 0.000)
		colorDesert    (0.223, 0.189, 0.158, 0.000)
		colorLowland   (0.245, 0.202, 0.180, 0.000)
		colorUpland    (0.272, 0.245, 0.218, 0.000)
		colorRock      (0.293, 0.267, 0.235, 0.000)
		colorSnow      (0.320, 0.284, 0.248, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00380772
		Period          0.122706
		Eccentricity    0.074559
		Inclination     -45.1239
		AscendingNode   -107.106
		ArgOfPericenter -142.758
		MeanAnomaly     -144.337
	}
}

DwarfMoon	"Dellalt System 6.D9"
{
	ParentBody     "Dellalt System 6"
	Class	       "Asteroid"

	Mass            6.78997e-007
	Radius          129.46
	InertiaMoment   0.397945

	Obliquity       -43.5504
	EqAscendNode    -39.2812
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.605 0.601 0.597)

	Surface
	{
		SurfStyle       0.714324
		OceanStyle      0.609022
		Randomize      (-0.617, -0.300, 0.966)
		colorDistMagn   0.982114
		colorDistFreq   11.6441
		detailScale     3535.13
		colorConversion true
		snowLevel       2
		tropicLatitude  0.987464
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.552064
		terraceProb     0.324196
		erosion         0
		montesMagn      0.3134
		montesFreq      3.52262
		montesSpiky     0.864002
		montesFraction  0.628585
		dunesFraction   0
		hillsMagn       0
		hillsFreq       31.3512
		hillsFraction   0.628126
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246116
		craterFreq      0.579133
		craterDensity   0.844307
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.427657
		volcanoTemp     1366.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.236, 0.204, 0.167, 0.000)
		colorShelf     (0.242, 0.210, 0.191, 0.000)
		colorBeach     (0.284, 0.246, 0.227, 0.000)
		colorDesert    (0.308, 0.264, 0.221, 0.000)
		colorLowland   (0.339, 0.282, 0.251, 0.000)
		colorUpland    (0.375, 0.342, 0.304, 0.000)
		colorRock      (0.405, 0.372, 0.328, 0.000)
		colorSnow      (0.442, 0.396, 0.346, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00446299
		Period          0.155707
		Eccentricity    0.40228
		Inclination     -43.5504
		AscendingNode   -39.2812
		ArgOfPericenter -127.793
		MeanAnomaly     130.641
	}
}

DwarfMoon	"Dellalt System 6.D10"
{
	ParentBody     "Dellalt System 6"
	Class	       "Asteroid"

	Mass            9.71092e-007
	Radius          139.586
	InertiaMoment   0.399104

	RotationPeriod  6665
	Obliquity       -55.6988
	EqAscendNode    -135.704

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.663 0.630 0.572)

	Surface
	{
		SurfStyle       0.691703
		OceanStyle      0.372799
		Randomize      (-0.908, 0.141, -0.634)
		colorDistMagn   0.710816
		colorDistFreq   9.47628
		detailScale     3811.63
		colorConversion true
		snowLevel       2
		tropicLatitude  0.591892
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.465326
		terraceProb     0.438952
		erosion         0
		montesMagn      0.49144
		montesFreq      2.63718
		montesSpiky     0.976017
		montesFraction  0.737387
		dunesFraction   0
		hillsMagn       0
		hillsFreq       43.5369
		hillsFraction   0.660443
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24773
		craterFreq      0.790192
		craterDensity   1.02485
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.547358
		volcanoTemp     1574.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.259, 0.214, 0.160, 0.000)
		colorShelf     (0.265, 0.221, 0.183, 0.000)
		colorBeach     (0.312, 0.258, 0.217, 0.000)
		colorDesert    (0.338, 0.277, 0.212, 0.000)
		colorLowland   (0.371, 0.296, 0.240, 0.000)
		colorUpland    (0.411, 0.359, 0.292, 0.000)
		colorRock      (0.444, 0.391, 0.314, 0.000)
		colorSnow      (0.484, 0.416, 0.332, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00509783
		Period          0.190085
		Eccentricity    0.283106
		Inclination     -55.6988
		AscendingNode   -135.704
		ArgOfPericenter -7.60324
		MeanAnomaly     -73.6198
	}
}

DwarfMoon	"Dellalt System 6.D11"
{
	ParentBody     "Dellalt System 6"
	Class	       "Asteroid"

	Mass            1.40808e-006
	Radius          151.589
	InertiaMoment   0.394239

	RotationPeriod  1305.22
	Obliquity       84.3543
	EqAscendNode    -27.9938

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.562 0.466 0.318)

	Surface
	{
		SurfStyle       0.358161
		OceanStyle      0.981592
		Randomize      (-0.137, -0.126, 0.399)
		colorDistMagn   0.331731
		colorDistFreq   8.50275
		detailScale     4139.39
		colorConversion true
		snowLevel       2
		tropicLatitude  0.502159
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.476449
		terraceProb     0.257802
		erosion         0
		montesMagn      0.543171
		montesFreq      3.34757
		montesSpiky     0.989425
		montesFraction  0.432094
		dunesFraction   0
		hillsMagn       0
		hillsFreq       49.6596
		hillsFraction   0.567585
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.265421
		craterFreq      0.9156
		craterDensity   0.874482
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.471199
		volcanoTemp     1292.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.225, 0.186, 0.127, 0.000)
		colorShelf     (0.239, 0.198, 0.135, 0.000)
		colorBeach     (0.253, 0.210, 0.143, 0.000)
		colorDesert    (0.267, 0.221, 0.151, 0.000)
		colorLowland   (0.281, 0.233, 0.159, 0.000)
		colorUpland    (0.295, 0.245, 0.167, 0.000)
		colorRock      (0.309, 0.256, 0.175, 0.000)
		colorSnow      (0.323, 0.268, 0.183, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00567644
		Period          0.223349
		Eccentricity    0.34855
		Inclination     84.3543
		AscendingNode   -27.9938
		ArgOfPericenter -66.4964
		MeanAnomaly     -20.7742
	}
}*/

Planet	"Dellalt System 7"
{
	ParentBody     "Dellalt System"
	Class	       "Oceania"

	Mass            5.92929
	Radius          13532.1
	InertiaMoment   0.330371

	Oblateness      0.0172895

	RotationPeriod  13.3516
	Obliquity       32.2682
	EqAscendNode    116.062

	AlbedoBond      0.383618
	AlbedoGeom      0.460341
	Brightness      2
	Color          (0.792 0.788 0.787)

	Surface
	{
		SurfStyle       0.476002
		OceanStyle      0.198045
		Randomize      (0.760, -0.878, -0.849)
		colorDistMagn   0.0680586
		colorDistFreq   1413.78
		detailScale     34805.2
		colorConversion true
		seaLevel        0.978183
		snowLevel       2
		tropicLatitude  0.540571
		icecapLatitude  10
		icecapHeight    1.02044
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        0.477832
		venusFreq       0.755672
		venusMagn       0.452219
		mareFreq        0
		mareDensity     0
		terraceProb     0.313711
		erosion         0
		montesMagn      0.165011
		montesFreq      648.938
		montesSpiky     0.989721
		montesFraction  0.442238
		dunesMagn       0.0623429
		dunesFreq       119.205
		dunesFraction   0.653167
		hillsMagn       0.0968987
		hillsFreq       1229.08
		hillsFraction   0.619689
		hills2Fraction  0.218508
		riversMagn      53.3841
		riversFreq      2.53179
		riversSin       5.33571
		riversOctaves   0
		canyonsMagn     0.0254426
		canyonsFreq     368.522
		canyonFraction  0.239998
		cracksMagn      0.0679274
		cracksFreq      0.791673
		cracksOctaves   0
		craterMagn      0.0122546
		craterFreq      116.627
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.62473
		volcanoFreq     0.671739
		volcanoDensity  0
		volcanoOctaves  0
		volcanoActivity 1.00474
		volcanoFlows    0
		volcanoRadius   0.444909
		volcanoTemp     1189.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.40659
		stripeTwist     0
		cycloneMagn     1.93964
		cycloneFreq     1.00202
		cycloneDensity  0.285275
		cycloneOctaves  3
		colorSea       (0.040, 0.100, 0.200, 1.000)
		colorShelf     (0.150, 0.480, 0.460, 1.000)
		colorBeach     (0.950, 0.950, 0.950, 1.308)
		colorDesert    (0.770, 0.770, 0.470, 1.308)
		colorLowland   (0.880, 0.880, 0.880, 1.308)
		colorUpland    (1.000, 1.000, 1.000, 1.308)
		colorRock      (1.000, 1.000, 1.000, 1.308)
		colorSnow      (1.000, 1.000, 1.000, 1.308)
		BumpHeight      159.255
		BumpOffset      155.78
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
		Height          25.4287
		Velocity        154.93
		BumpHeight      6.77719
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.91936
		mainOctaves     10
		Coverage        0.306029
		stripeZones     2.40659
		stripeTwist     0
	}

	Clouds
	{
		Height          50.8574
		Velocity        19.5914
		BumpHeight      6.22307
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.91936
		mainOctaves     10
		Coverage        0.306029
		stripeZones     2.40659
		stripeTwist     0
	}

	Ocean
	{
		Height          155.78
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
	}

	NoLava          true

	Atmosphere
	{
		Model          "Venus"
		Height          195.044
		Density         478.735
		Pressure        784.001
		Greenhouse      468.584
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.46048
		Saturation      0.52096

		Composition
		{
			H2O   	56.8045
			CO2   	41.8542
			SO2   	1.04091
			N2    	0.300134
			CO    	0.000145925
			Ar    	9.07847e-005
			Ne    	2.85496e-005
		}
	}

	Aurora
	{
		Height      164.177
		NorthLat    73.2987
		NorthLon    -59.9737
		NorthRadius 3947.29
		NorthWidth  980.588
		NorthRings  5
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -78.7141
		SouthLon    145.609
		SouthRadius 3018.1
		SouthWidth  912.018
		SouthRings  4
		SouthBright 0.3
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	Rings
	{
		InnerRadius     20220.5
		OuterRadius     48954.6
		RotationPeriod  7.31917
		RotationOffset  0
		FrontBright     0.983258
		BackBright      0.821129
		Density         0.895516
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.09579
		Period          3.63093
		Eccentricity    0.0156984
		Inclination     -0.827257
		AscendingNode   122.765
		ArgOfPericenter 101.227
		MeanAnomaly     261.775
	}
}

DwarfMoon	"Dellalt System 7.D1"
{
	ParentBody     "Dellalt System 7"
	Class	       "Asteroid"

	Mass            2.86266e-010
	Radius          8.71468
	InertiaMoment   0.399473

	Oblateness      0.249

	Obliquity       0.0119145
	EqAscendNode    -143.476
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.555 0.450 0.390)

	Surface
	{
		SurfStyle       0.33457
		OceanStyle      0.808204
		Randomize      (-0.830, -0.640, 0.867)
		colorDistMagn   0.256482
		colorDistFreq   0.057496
		detailScale     237.969
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.742461
		terraceProb     0.270013
		erosion         0
		montesMagn      0.519137
		montesFreq      2.91173
		montesSpiky     0.924279
		montesFraction  0.494605
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.154964
		hillsFraction   0.75609
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223945
		craterFreq      0.239311
		craterDensity   0.891843
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.418931
		volcanoTemp     1137.24
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.222, 0.180, 0.156, 0.000)
		colorShelf     (0.236, 0.191, 0.166, 0.000)
		colorBeach     (0.250, 0.202, 0.176, 0.000)
		colorDesert    (0.264, 0.214, 0.185, 0.000)
		colorLowland   (0.278, 0.225, 0.195, 0.000)
		colorUpland    (0.292, 0.236, 0.205, 0.000)
		colorRock      (0.305, 0.247, 0.215, 0.000)
		colorSnow      (0.319, 0.259, 0.224, 1.000)
		BumpHeight      7.84321
		BumpOffset      1.56864
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000222848
		Period          0.000790115
		Eccentricity    8.76013e-005
		Inclination     0.0119145
		AscendingNode   -143.476
		ArgOfPericenter 108.688
		MeanAnomaly     -38.1209
	}
}

DwarfMoon	"Dellalt System 7.D2"
{
	ParentBody     "Dellalt System 7"
	Class	       "Asteroid"

	Mass            4.33147e-010
	Radius          11.7264
	InertiaMoment   0.397063

	Oblateness      0.249

	Obliquity       -0.00754899
	EqAscendNode    23.2797
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.783 0.779 0.777)

	Surface
	{
		SurfStyle       0.900645
		OceanStyle      0.625201
		Randomize      (-0.352, 0.673, -0.200)
		colorDistMagn   0.806646
		colorDistFreq   0.0388609
		detailScale     320.209
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.318502
		terraceProb     0.366041
		erosion         0
		montesMagn      0.661673
		montesFreq      3.37035
		montesSpiky     0.929672
		montesFraction  0.490867
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.36584
		hillsFraction   0.59541
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246575
		craterFreq      0.274507
		craterDensity   0.832534
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.585913
		volcanoTemp     1193.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.266, 0.273, 0.311, 0.050)
		colorShelf     (0.313, 0.319, 0.357, 0.040)
		colorBeach     (0.360, 0.366, 0.404, 0.030)
		colorDesert    (0.407, 0.413, 0.458, 0.020)
		colorLowland   (0.454, 0.459, 0.505, 0.030)
		colorUpland    (0.501, 0.506, 0.552, 0.050)
		colorRock      (0.548, 0.553, 0.614, 0.020)
		colorSnow      (0.548, 0.553, 0.614, 1.000)
		BumpHeight      10.5538
		BumpOffset      2.11075
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000270313
		Period          0.00105555
		Eccentricity    5.22376e-005
		Inclination     -0.00754899
		AscendingNode   23.2797
		ArgOfPericenter -132.499
		MeanAnomaly     19.5369
	}
}

DwarfMoon	"Dellalt System 7.D3"
{
	ParentBody     "Dellalt System 7"
	Class	       "Asteroid"

	Mass            6.41701e-010
	Radius          12.5341
	InertiaMoment   0.398625

	Oblateness      0.249

	Obliquity       0.00469768
	EqAscendNode    76.0139
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.652 0.649 0.648)

	Surface
	{
		SurfStyle       0.935616
		OceanStyle      0.259803
		Randomize      (-0.897, -0.355, 0.161)
		colorDistMagn   0.356528
		colorDistFreq   0.137894
		detailScale     342.264
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.537076
		terraceProb     0.116177
		erosion         0
		montesMagn      0.530039
		montesFreq      3.07561
		montesSpiky     0.962764
		montesFraction  0.335494
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.380413
		hillsFraction   0.719666
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.216678
		craterFreq      0.196342
		craterDensity   0.871578
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.544082
		volcanoTemp     1805.53
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.222, 0.227, 0.259, 0.050)
		colorShelf     (0.261, 0.266, 0.298, 0.040)
		colorBeach     (0.300, 0.305, 0.337, 0.030)
		colorDesert    (0.339, 0.344, 0.382, 0.020)
		colorLowland   (0.378, 0.383, 0.421, 0.030)
		colorUpland    (0.417, 0.422, 0.460, 0.050)
		colorRock      (0.456, 0.461, 0.512, 0.020)
		colorSnow      (0.456, 0.461, 0.512, 1.000)
		BumpHeight      11.2807
		BumpOffset      2.25613
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000299968
		Period          0.00123393
		Eccentricity    7.99767e-005
		Inclination     0.00469768
		AscendingNode   76.0139
		ArgOfPericenter 22.4302
		MeanAnomaly     133.852
	}
}

Moon	"Dellalt System 7.1"
{
	ParentBody     "Dellalt System 7"
	Class	       "Selena"

	Mass            0.0063167
	Radius          1520.52
	InertiaMoment   0.386761

	Oblateness      0.010396

	Obliquity       0.73834
	EqAscendNode    27.3366
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.654 0.650 0.643)

	Surface
	{
		SurfStyle       0.322484
		OceanStyle      0.538892
		Randomize      (-0.997, 0.593, -0.641)
		colorDistMagn   0.0464422
		colorDistFreq   180.192
		detailScale     3910.86
		colorConversion true
		drivenDarkening 0
		seaLevel        0.206974
		snowLevel       2
		tropicLatitude  0.0250412
		icecapLatitude  0.701495
		icecapHeight    0.225889
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.81759
		venusFreq       1.3496
		venusMagn       0
		mareFreq        0.610515
		mareDensity     0.0021972
		terraceProb     0.22844
		erosion         0
		montesMagn      0.0489864
		montesFreq      70.5255
		montesSpiky     0.759052
		montesFraction  0.72719
		dunesMagn       0.0434695
		dunesFreq       1977.79
		dunesFraction   0.405798
		hillsMagn       0.115035
		hillsFreq       211.108
		hillsFraction   0.0102582
		hills2Fraction  0
		riversMagn      63.2814
		riversFreq      3.38865
		riversSin       6.35026
		riversOctaves   0
		canyonsMagn     0.574455
		canyonsFreq     0.564087
		canyonFraction  0.250333
		cracksMagn      0.0697033
		cracksFreq      0.631697
		cracksOctaves   0
		craterMagn      0.608701
		craterFreq      3.17648
		craterDensity   0.757038
		craterOctaves   9.005
		craterRayedFactor 0.144468
		volcanoMagn     0.173928
		volcanoFreq     0.472972
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.364019
		volcanoRadius   0.156613
		volcanoTemp     1535.02
		lavaCoverTidal  0.201515
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.420, 0.420, 0.430, 0.000)
		colorShelf     (0.470, 0.480, 0.480, 0.000)
		colorBeach     (0.360, 0.370, 0.386, 0.000)
		colorDesert    (0.314, 0.299, 0.296, 0.000)
		colorLowland   (0.399, 0.396, 0.360, 0.000)
		colorUpland    (0.425, 0.422, 0.392, 0.000)
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
		SemiMajorAxis   0.000482572
		Period          0.00251646
		Eccentricity    0.00846498
		Inclination     0.73834
		AscendingNode   27.3366
		ArgOfPericenter -65.9239
		MeanAnomaly     9.84639
	}
}

Moon	"Dellalt System 7.2"
{
	ParentBody     "Dellalt System 7"
	Class	       "IceWorld"

	Mass            0.00761975
	Radius          1494.58
	InertiaMoment   0.382026

	Oblateness      0.00223943

	Obliquity       0.0486104
	EqAscendNode    79.0932
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.534 0.524 0.520)

	Surface
	{
		SurfStyle       0.320114
		OceanStyle      0.0171121
		Randomize      (-0.828, -0.614, -0.970)
		colorDistMagn   0.0625834
		colorDistFreq   190.818
		detailScale     3844.13
		colorConversion true
		drivenDarkening 0
		seaLevel        0.154706
		snowLevel       2
		tropicLatitude  0.00129187
		icecapLatitude  0.783233
		icecapHeight    0.170506
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.8985
		venusFreq       1.27213
		venusMagn       0
		mareFreq        0.695191
		mareDensity     0.00295234
		terraceProb     0.335015
		erosion         0
		montesMagn      0.0665212
		montesFreq      81.069
		montesSpiky     0.902639
		montesFraction  0.329842
		dunesMagn       0.0420307
		dunesFreq       1972.07
		dunesFraction   0.17947
		hillsMagn       0.139976
		hillsFreq       183.646
		hillsFraction   0.0189205
		hills2Fraction  0.250014
		riversMagn      59.3365
		riversFreq      3.06199
		riversSin       5.83389
		riversOctaves   0
		canyonsMagn     0.458986
		canyonsFreq     0.658397
		canyonFraction  0
		cracksMagn      0.059562
		cracksFreq      0.570275
		cracksOctaves   1
		craterMagn      0.58429
		craterFreq      4.44971
		craterDensity   0.887954
		craterOctaves   11
		craterRayedFactor 0.22865
		volcanoMagn     0.173134
		volcanoFreq     0.656722
		volcanoDensity  0.178455
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.388564
		volcanoRadius   0.147697
		volcanoTemp     1317.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.534, 0.524, 0.520, 0.500)
		colorShelf     (0.507, 0.498, 0.494, 0.500)
		colorBeach     (0.374, 0.367, 0.364, 0.750)
		colorDesert    (0.454, 0.446, 0.442, 1.000)
		colorLowland   (0.470, 0.461, 0.458, 1.000)
		colorUpland    (0.496, 0.488, 0.483, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.470, 0.461, 0.458, 1.000)
		colorUpPlants  (0.496, 0.488, 0.483, 1.000)
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
		SemiMajorAxis   0.000739002
		Period          0.00476834
		Eccentricity    0.00525737
		Inclination     0.0486104
		AscendingNode   79.0933
		ArgOfPericenter -148.479
		MeanAnomaly     60.706
	}
}

Planet	"Dellalt System 8"
{
	ParentBody     "Dellalt System"
	Class	       "GasGiant"

	Mass            4078.28
	Radius          69613.2
	InertiaMoment   0.253892

	Oblateness      0.00687655

	RotationPeriod  8.22608
	Obliquity       21.4372
	EqAscendNode    147.54

	AlbedoBond      0.496545
	AlbedoGeom      0.595855
	Brightness      2

	Surface
	{
		SurfStyle       0.627576
		Randomize      (-0.723, 0.746, -0.916)
		detailScale     179049
		colorConversion true
		tropicLatitude  0.398921
		icecapLatitude  1
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.5894
		stripeFluct     0.360399
		stripeTwist     12.5641
		cycloneMagn     9.63821
		cycloneFreq     0.776715
		cycloneDensity  0.266105
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
		BumpHeight      3.41813
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          13.0781
		Velocity        1382.01
		BumpHeight      9.65819
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.24063
		mainOctaves     12
		Coverage        0.465454
		stripeZones     2.5894
		stripeFluct     0.360399
		stripeTwist     12.5641
	}

	Clouds
	{
		Height          22.7344
		Velocity        -716.64
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		ModulateColor  (1.000 1.000 1.000 0.406)
		mainFreq        1.24063
		mainOctaves     12
		Coverage        0.465454
		stripeZones     2.5894
		stripeFluct     0.360399
		stripeTwist     12.5641
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Jupiter"
		Height          100
		Density         5535.64
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0241512
		Saturation      0.602167

		Composition
		{
			H2    	92.4125
			He    	7.26622
			CH4   	0.274702
			N2    	0.0375947
			O2    	0.00728366
			Ne    	0.000913723
			Ar    	0.00074984
		}
	}

	Aurora
	{
		Height      2541.01
		NorthLat    86.5041
		NorthLon    83.8793
		NorthRadius 18645.1
		NorthWidth  9257.2
		NorthRings  3
		NorthBright 1
		NorthParticles 10000
		SouthLat    -86.5439
		SouthLon    260.918
		SouthRadius 15338.1
		SouthWidth  7452.56
		SouthRings  2
		SouthBright 1
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	Rings
	{
		InnerRadius     77107.3
		OuterRadius     107226
		RotationPeriod  1.21396
		RotationOffset  0
		FrontBright     0.909308
		BackBright      0.720009
		Density         0.528349
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.49269
		Period          7.7443
		Eccentricity    0.0608644
		Inclination     -2.43137
		AscendingNode   146.946
		ArgOfPericenter 96.8535
		MeanAnomaly     265.761
	}
}

DwarfMoon	"Dellalt System 8.D1"
{
	ParentBody     "Dellalt System 8"
	Class	       "Asteroid"

	Mass            2.88431e-008
	Radius          39.6449
	InertiaMoment   0.399949

	Oblateness      0.249

	Obliquity       0.00201153
	EqAscendNode    145.684
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.410 0.403 0.398)

	Surface
	{
		SurfStyle       0.681718
		OceanStyle      0.549983
		Randomize      (-0.753, -0.610, -0.379)
		colorDistMagn   0.740893
		colorDistFreq   0.995052
		detailScale     1082.57
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.498136
		terraceProb     0.151161
		erosion         0
		montesMagn      0.587761
		montesFreq      2.91226
		montesSpiky     0.895727
		montesFraction  0.76729
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.23317
		hillsFraction   0.5425
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.216255
		craterFreq      0.238613
		craterDensity   0.72784
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.559648
		volcanoTemp     1518.92
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.160, 0.137, 0.112, 0.000)
		colorShelf     (0.164, 0.141, 0.127, 0.000)
		colorBeach     (0.193, 0.165, 0.151, 0.000)
		colorDesert    (0.209, 0.177, 0.147, 0.000)
		colorLowland   (0.230, 0.189, 0.167, 0.000)
		colorUpland    (0.254, 0.230, 0.203, 0.000)
		colorRock      (0.275, 0.250, 0.219, 0.000)
		colorSnow      (0.299, 0.266, 0.231, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00192068
		Period          0.000762298
		Eccentricity    6.99466e-005
		Inclination     0.00201153
		AscendingNode   145.684
		ArgOfPericenter -127.997
		MeanAnomaly     -178.343
	}
}

DwarfMoon	"Dellalt System 8.D2"
{
	ParentBody     "Dellalt System 8"
	Class	       "Asteroid"

	Mass            3.91387e-008
	Radius          51.385
	InertiaMoment   0.398051

	Oblateness      0.249

	Obliquity       -0.00404097
	EqAscendNode    -95.5046
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.579 0.575 0.568)

	Surface
	{
		SurfStyle       0.0127605
		OceanStyle      0.38207
		Randomize      (0.191, -0.470, -0.913)
		colorDistMagn   0.666468
		colorDistFreq   1.54531
		detailScale     1403.15
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.32435
		terraceProb     0.370551
		erosion         0
		montesMagn      0.533702
		montesFreq      2.64026
		montesSpiky     0.778
		montesFraction  0.721566
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.02542
		hillsFraction   0.665996
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239981
		craterFreq      0.162722
		craterDensity   0.783742
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.541124
		volcanoTemp     1254.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.232, 0.230, 0.227, 0.000)
		colorShelf     (0.246, 0.244, 0.242, 0.000)
		colorBeach     (0.261, 0.259, 0.256, 0.000)
		colorDesert    (0.275, 0.273, 0.270, 0.000)
		colorLowland   (0.290, 0.288, 0.284, 0.000)
		colorUpland    (0.304, 0.302, 0.298, 0.000)
		colorRock      (0.318, 0.316, 0.313, 0.000)
		colorSnow      (0.333, 0.331, 0.327, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00232
		Period          0.00101199
		Eccentricity    6.25682e-005
		Inclination     -0.00404097
		AscendingNode   -95.5046
		ArgOfPericenter -10.8461
		MeanAnomaly     127.844
	}
}

DwarfMoon	"Dellalt System 8.D3"
{
	ParentBody     "Dellalt System 8"
	Class	       "Asteroid"

	Mass            5.31412e-008
	Radius          53.9711
	InertiaMoment   0.399174

	Oblateness      0.247899

	Obliquity       0.00510569
	EqAscendNode    -86.6399
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.751 0.647 0.546)

	Surface
	{
		SurfStyle       0.433207
		OceanStyle      0.96373
		Randomize      (-0.075, 0.490, -0.634)
		colorDistMagn   0.8114
		colorDistFreq   1.85357
		detailScale     1473.77
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.278029
		terraceProb     0.182687
		erosion         0
		montesMagn      0.536791
		montesFreq      3.37896
		montesSpiky     0.955749
		montesFraction  0.116232
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.6872
		hillsFraction   0.462109
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222363
		craterFreq      0.210996
		craterDensity   0.751283
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.489817
		volcanoTemp     1465.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.300, 0.259, 0.218, 0.000)
		colorShelf     (0.319, 0.275, 0.232, 0.000)
		colorBeach     (0.338, 0.291, 0.246, 0.000)
		colorDesert    (0.357, 0.307, 0.259, 0.000)
		colorLowland   (0.375, 0.324, 0.273, 0.000)
		colorUpland    (0.394, 0.340, 0.287, 0.000)
		colorRock      (0.413, 0.356, 0.300, 0.000)
		colorSnow      (0.432, 0.372, 0.314, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00262233
		Period          0.00121611
		Eccentricity    6.32669e-005
		Inclination     0.00510569
		AscendingNode   -86.6399
		ArgOfPericenter 137.535
		MeanAnomaly     -54.204
	}
}

Moon	"Dellalt System 8.1"
{
	ParentBody     "Dellalt System 8"
	Class	       "Desert"

	Mass            0.382797
	Radius          6063.88
	InertiaMoment   0.331819

	Oblateness      0.0136058

	Obliquity       0.705318
	EqAscendNode    -160.284
	TidalLocked     true

	AlbedoBond      0.269409
	AlbedoGeom      0.323291
	Brightness      2
	Color          (0.729 0.689 0.660)

	Surface
	{
		SurfStyle       0.53449
		OceanStyle      0.440872
		Randomize      (-0.648, -0.095, 0.581)
		colorDistMagn   0.067546
		colorDistFreq   685.336
		detailScale     15596.6
		colorConversion true
		seaLevel        0.0752362
		snowLevel       2
		tropicLatitude  0.00421451
		icecapLatitude  10
		icecapHeight    0.158745
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        1.49604
		venusFreq       1.1357
		venusMagn       0
		mareFreq        1.20459
		mareDensity     0.03595
		terraceProb     0.56112
		erosion         0
		montesMagn      0.224645
		montesFreq      279.756
		montesSpiky     0.89958
		montesFraction  0.838565
		dunesMagn       0.0573772
		dunesFreq       50.6337
		dunesFraction   0.876668
		hillsMagn       0.147606
		hillsFreq       689.291
		hillsFraction   0
		hills2Fraction  0
		riversMagn      60.1874
		riversFreq      1.54196
		riversSin       3.90938
		riversOctaves   0
		canyonsMagn     0.0380213
		canyonsFreq     152.149
		canyonFraction  0
		cracksMagn      0.0844405
		cracksFreq      0.367374
		cracksOctaves   0
		craterMagn      0.5851
		craterFreq      22.3428
		craterDensity   0.0911277
		craterOctaves   1.36089
		volcanoMagn     0.69391
		volcanoFreq     0.773097
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.664075
		volcanoRadius   0.539421
		volcanoTemp     1632.47
		lavaCoverTidal  0.747119
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.12913
		stripeTwist     0
		cycloneMagn     2.40124
		cycloneFreq     0.693537
		cycloneDensity  0.491316
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
		Hapke           0.600272
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Clouds
	{
		Height          15.3486
		Velocity        103.77
		BumpHeight      5.34876
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.947845
		mainOctaves     10
		Coverage        0.138819
		stripeZones     2.12913
		stripeTwist     0
	}

	Clouds
	{
		Height          20.6978
		Velocity        132.118
		BumpHeight      5.34876
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.947845
		mainOctaves     10
		Coverage        0.138819
		stripeZones     2.12913
		stripeTwist     0
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Titan"
		Height          303.194
		Density         0.0399728
		Pressure        0.109986
		Greenhouse      20.8036
		Bright          8.3244
		Opacity         1
		SkyLight        2.7748
		Hue             0
		Saturation      1

		Composition
		{
			H2O   	73
			CO2   	19.537
			CH4   	2.21243
			H2S   	1.51058
			NH3   	1.43956
			C2H2  	1.06375
			SO2   	1.00721
			C2H6  	0.151399
			C2H4  	0.0682608
			N2    	0.00765373
			C3H8  	0.00213584
			CO    	4.05148e-005
		}
	}

	Aurora
	{
		Height      153.156
		NorthLat    67.9867
		NorthLon    -121.403
		NorthRadius 1840.89
		NorthWidth  306.581
		NorthRings  3
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -73.1576
		SouthLon    75.7891
		SouthRadius 1238.42
		SouthWidth  276.697
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
		SemiMajorAxis   0.00369315
		Period          0.00203244
		Eccentricity    0.0182069
		Inclination     0.705318
		AscendingNode   -160.284
		ArgOfPericenter -103.11
		MeanAnomaly     127.065
	}
}

Moon	"Dellalt System 8.2"
{
	ParentBody     "Dellalt System 8"
	Class	       "Desert"

	Mass            4.4432
	Radius          11708.4
	InertiaMoment   0.330696

	Oblateness      0.00321391

	Obliquity       -0.356236
	EqAscendNode    -3.79976
	TidalLocked     true

	AlbedoBond      0.329496
	AlbedoGeom      0.395396
	Brightness      2
	Color          (0.499 0.492 0.490)

	Surface
	{
		SurfStyle       0.83038
		OceanStyle      0.277977
		Randomize      (-0.679, 0.803, -0.178)
		colorDistMagn   0.052018
		colorDistFreq   1387.25
		detailScale     30114.6
		colorConversion true
		seaLevel        0.0446519
		snowLevel       2
		tropicLatitude  0.0124294
		icecapLatitude  10
		icecapHeight    0.204328
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        0.946527
		venusFreq       0.731777
		venusMagn       0.445056
		mareFreq        2.00364
		mareDensity     0.210598
		terraceProb     0.453779
		erosion         0
		montesMagn      0.252861
		montesFreq      605.239
		montesSpiky     0.929551
		montesFraction  0.526895
		dunesMagn       0.0370912
		dunesFreq       82.0753
		dunesFraction   0.570726
		hillsMagn       0.128192
		hillsFreq       972.596
		hillsFraction   0
		hills2Fraction  0
		riversMagn      66.3935
		riversFreq      2.11549
		riversSin       7.13129
		riversOctaves   0
		canyonsMagn     0.0608885
		canyonsFreq     306.187
		canyonFraction  0
		cracksMagn      0.124873
		cracksFreq      0.813726
		cracksOctaves   0
		craterMagn      0.790928
		craterFreq      40.989
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.690595
		volcanoFreq     0.670418
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.716796
		volcanoRadius   0.444022
		volcanoTemp     1465.99
		lavaCoverTidal  0.82319
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.87258
		stripeTwist     0.0870969
		cycloneMagn     2.15146
		cycloneFreq     0.506162
		cycloneDensity  0.493915
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
		BumpHeight      17.4174
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
		Height          52.416
		Velocity        88.0611
		BumpHeight      5.50917
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.04965
		mainOctaves     10
		Coverage        0.258993
		stripeZones     1.87258
		stripeTwist     0.0870969
	}

	Clouds
	{
		Height          96.123
		Velocity        112.654
		BumpHeight      5.86113
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.04965
		mainOctaves     10
		Coverage        0.258993
		stripeZones     1.87258
		stripeTwist     0.0870969
	}

	Clouds
	{
		Height          139.83
		Velocity        150.423
		BumpHeight      5.74438
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.04965
		mainOctaves     10
		Coverage        0.258993
		stripeZones     1.87258
		stripeTwist     0.0870969
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Venus"
		Height          585.204
		Density         36.8892
		Pressure        207.256
		Greenhouse      528.182
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0577401
		Saturation      0.61548

		Composition
		{
			H2O   	96.8032
			CO2   	2.77798
			SO2   	0.409059
			N2    	0.00964994
			CO    	4.81077e-005
			Ar    	1.42699e-005
		}
	}

	Aurora
	{
		Height      154.254
		NorthLat    63.0636
		NorthLon    77.8338
		NorthRadius 2918.67
		NorthWidth  845.404
		NorthRings  5
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -75.5771
		SouthLon    258.194
		SouthRadius 2721.72
		SouthWidth  955.116
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
		SemiMajorAxis   0.00508956
		Period          0.00328643
		Eccentricity    0.0277329
		Inclination     -0.356236
		AscendingNode   -3.79976
		ArgOfPericenter 70.3685
		MeanAnomaly     132.343
	}
}

DwarfMoon	"Dellalt System 8.D4"
{
	ParentBody     "Dellalt System 8"
	Class	       "Asteroid"

	Mass            1.3469e-007
	Radius          78.4475
	InertiaMoment   0.399309

	Oblateness      0.0157043

	Obliquity       0.360007
	EqAscendNode    151.857
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.710 0.705 0.704)

	Surface
	{
		SurfStyle       0.372274
		OceanStyle      0.244082
		Randomize      (-0.388, -0.458, -0.025)
		colorDistMagn   0.537885
		colorDistFreq   3.53353
		detailScale     2142.14
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00304931
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.499815
		terraceProb     0.307695
		erosion         0
		montesMagn      0.564353
		montesFreq      2.5406
		montesSpiky     0.875678
		montesFraction  0.702532
		dunesFraction   0
		hillsMagn       0
		hillsFreq       13.7449
		hillsFraction   0.907341
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244324
		craterFreq      0.236419
		craterDensity   0.941259
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.457108
		volcanoTemp     1237.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.284, 0.282, 0.281, 0.000)
		colorShelf     (0.302, 0.300, 0.299, 0.000)
		colorBeach     (0.320, 0.317, 0.317, 0.000)
		colorDesert    (0.337, 0.335, 0.334, 0.000)
		colorLowland   (0.355, 0.353, 0.352, 0.000)
		colorUpland    (0.373, 0.370, 0.369, 0.000)
		colorRock      (0.391, 0.388, 0.387, 0.000)
		colorSnow      (0.408, 0.406, 0.405, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00701395
		Period          0.00531968
		Eccentricity    0.030703
		Inclination     0.360007
		AscendingNode   151.857
		ArgOfPericenter 141.493
		MeanAnomaly     -169.385
	}
}

Moon	"Dellalt System 8.3"
{
	ParentBody     "Dellalt System 8"
	Class	       "Desert"

	Mass            0.603307
	Radius          6550.94
	InertiaMoment   0.328781

	Obliquity       -1.44027
	EqAscendNode    -31.5337
	TidalLocked     true

	AlbedoBond      0.28021
	AlbedoGeom      0.336251
	Brightness      2
	Color          (0.579 0.575 0.569)

	Surface
	{
		SurfStyle       0.0220545
		OceanStyle      0.464999
		Randomize      (0.279, -0.116, -0.972)
		colorDistMagn   0.0886284
		colorDistFreq   827.797
		detailScale     16849.4
		colorConversion true
		seaLevel        0.0602006
		snowLevel       2
		tropicLatitude  0.0483639
		icecapLatitude  0.89385
		icecapHeight    0.0645151
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.10416
		venusFreq       1.33231
		venusMagn       0.264012
		mareFreq        1.19543
		mareDensity     0.0659186
		terraceProb     0.153955
		erosion         0
		montesMagn      0.155227
		montesFreq      273.96
		montesSpiky     0.779812
		montesFraction  0.333373
		dunesMagn       0.0292336
		dunesFreq       50.3503
		dunesFraction   0.74195
		hillsMagn       0.174287
		hillsFreq       821.204
		hillsFraction   0
		hills2Fraction  0
		riversMagn      69.6422
		riversFreq      2.12811
		riversSin       6.58003
		riversOctaves   0
		canyonsMagn     0.0463369
		canyonsFreq     148.921
		canyonFraction  0
		cracksMagn      0.117189
		cracksFreq      0.477009
		cracksOctaves   0
		craterMagn      0.608064
		craterFreq      20.3774
		craterDensity   0.181011
		craterOctaves   2.55793
		volcanoMagn     0.726635
		volcanoFreq     0.76872
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.622088
		volcanoRadius   0.458183
		volcanoTemp     1377
		lavaCoverTidal  0.467569
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.05219
		stripeTwist     0.362299
		cycloneMagn     2.55038
		cycloneFreq     0.865285
		cycloneDensity  0.349272
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
		Height          14.3271
		Velocity        50.8771
		BumpHeight      4.32696
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.987635
		mainOctaves     10
		Coverage        0.160419
		stripeZones     2.05219
		stripeTwist     0.362299
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Mars"
		Height          40.7191
		Density         0.26178
		Pressure        0.0956816
		Greenhouse      0.325029
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.0313966
		Saturation      1

		Composition
		{
			CO2   	83.4334
			SO2   	15.7987
			CH4   	0.400724
			N2    	0.227873
			H2O   	0.0824278
			NH3   	0.0329235
			H2S   	0.0155728
			C2H6  	0.00239309
			C2H2  	0.00215068
			Ar    	0.0014411
			CO    	0.00100758
			C2H4  	0.000708149
			C3H8  	0.000572925
			Ne    	6.75069e-005
		}
	}

	Aurora
	{
		Height      64.8606
		NorthLat    53.4825
		NorthLon    179.439
		NorthRadius 1752.9
		NorthWidth  527.977
		NorthRings  5
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -36.7091
		SouthLon    370.91
		SouthRadius 1693.6
		SouthWidth  452.607
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
		SemiMajorAxis   0.00966598
		Period          0.00860553
		Eccentricity    0.0445562
		Inclination     -1.44027
		AscendingNode   -31.5337
		ArgOfPericenter -103.391
		MeanAnomaly     -147.516
	}
}

Moon	"Dellalt System 8.4"
{
	ParentBody     "Dellalt System 8"
	Class	       "Selena"

	Mass            0.706894
	Radius          7324.62
	InertiaMoment   0.327301

	Obliquity       1.14533
	EqAscendNode    -69.8277
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.452 0.448 0.440)

	Surface
	{
		SurfStyle       0.199975
		OceanStyle      0.160586
		Randomize      (-0.481, 0.294, -0.849)
		colorDistMagn   0.0833649
		colorDistFreq   997.255
		detailScale     18839.3
		colorConversion true
		drivenDarkening 0
		seaLevel        0.196274
		snowLevel       2
		tropicLatitude  0.0327778
		icecapLatitude  1
		icecapHeight    0.196274
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.77773
		venusFreq       0.990197
		venusMagn       0
		mareFreq        2.01057
		mareDensity     0.0401312
		terraceProb     0.114468
		erosion         0
		montesMagn      0.240381
		montesFreq      356.551
		montesSpiky     0.934146
		montesFraction  0.824754
		dunesMagn       0.0371147
		dunesFreq       9730.98
		dunesFraction   0.359589
		hillsMagn       0.117082
		hillsFreq       806.727
		hillsFraction   0.104666
		hills2Fraction  0
		riversMagn      62.7319
		riversFreq      3.77365
		riversSin       6.23837
		riversOctaves   0
		canyonsMagn     0.523078
		canyonsFreq     2.44585
		canyonFraction  0.208577
		cracksMagn      0.0311412
		cracksFreq      4.14235
		cracksOctaves   0
		craterMagn      0.611721
		craterFreq      24.4396
		craterDensity   0.870262
		craterOctaves   12.5783
		craterRayedFactor 0.166489
		volcanoMagn     0.646035
		volcanoFreq     0.883979
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.368847
		volcanoRadius   0.513114
		volcanoTemp     1514.44
		lavaCoverTidal  0.0360432
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.320, 0.320, 0.000)
		colorShelf     (0.370, 0.370, 0.370, 0.000)
		colorBeach     (0.226, 0.224, 0.220, 0.000)
		colorDesert    (0.280, 0.269, 0.251, 0.200)
		colorLowland   (0.303, 0.287, 0.282, 0.500)
		colorUpland    (0.317, 0.300, 0.291, 0.800)
		colorRock      (0.650, 0.610, 0.620, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.976362
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
		Height          72.7837
		Density         0.00236383
		Pressure        0.000649844
		Greenhouse      0.322089
		Bright          4.7285
		Opacity         0
		SkyLight        1.57617
		Hue             0.039148
		Saturation      1

		Composition
		{
			N2    	97.8668
			Ar    	1.27993
			Ne    	0.442173
			CO    	0.407541
			Kr    	0.00354213
			CH4   	4.37363e-005
		}
	}

	Aurora
	{
		Height      129.116
		NorthLat    50.5859
		NorthLon    -131.857
		NorthRadius 1549.45
		NorthWidth  353.186
		NorthRings  4
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -42.4951
		SouthLon    44.8553
		SouthRadius 2021.11
		SouthWidth  449.867
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
		SemiMajorAxis   0.0133207
		Period          0.0139218
		Eccentricity    0.00237395
		Inclination     1.14533
		AscendingNode   -69.8277
		ArgOfPericenter -50.4895
		MeanAnomaly     100.414
	}
}

Moon	"Dellalt System 8.5"
{
	ParentBody     "Dellalt System 8"
	Class	       "Desert"

	Mass            0.832391
	Radius          7223.26
	InertiaMoment   0.332634

	Obliquity       -0.0837677
	EqAscendNode    37.7367
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.774 0.772 0.770)

	Surface
	{
		SurfStyle       0.910915
		OceanStyle      0.418477
		Randomize      (-0.453, -0.604, -0.351)
		colorDistMagn   0.0837939
		colorDistFreq   867.799
		detailScale     18578.6
		colorConversion true
		seaLevel        0.10155
		snowLevel       2
		tropicLatitude  0.00276213
		icecapLatitude  0.811677
		icecapHeight    0.1148
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.878598
		venusFreq       1.01626
		venusMagn       0
		mareFreq        1.73333
		mareDensity     0.0844505
		terraceProb     0.125613
		erosion         0
		montesMagn      0.158333
		montesFreq      315.868
		montesSpiky     0.803566
		montesFraction  0.783737
		dunesMagn       0.0577536
		dunesFreq       59.2252
		dunesFraction   0.256411
		hillsMagn       0.106016
		hillsFreq       904.977
		hillsFraction   0
		hills2Fraction  0
		riversMagn      56.9853
		riversFreq      2.29749
		riversSin       6.90619
		riversOctaves   0
		canyonsMagn     0.0290318
		canyonsFreq     188.933
		canyonFraction  0
		cracksMagn      0.0979077
		cracksFreq      0.512236
		cracksOctaves   0
		craterMagn      0.57615
		craterFreq      18.7655
		craterDensity   0.637846
		craterOctaves   9.31114
		volcanoMagn     0.573433
		volcanoFreq     0.779745
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.909227
		volcanoRadius   0.474808
		volcanoTemp     1321.3
		lavaCoverTidal  0.153397
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
		Hapke           0.884214
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
		Height          36.1163
		Density         0.0115786
		Pressure        0.00321452
		Greenhouse      0.618798
		Bright          6.49727
		Opacity         1
		SkyLight        2.16576
		Hue             0.0468993
		Saturation      1

		Composition
		{
			N2    	96.9289
			Ar    	2.62154
			CO    	0.380135
			Ne    	0.0667902
			Kr    	0.0026322
		}
	}

	Aurora
	{
		Height      219.366
		NorthLat    85.1617
		NorthLon    95.3175
		NorthRadius 2155.1
		NorthWidth  676.004
		NorthRings  3
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -83.5752
		SouthLon    250.456
		SouthRadius 2113.36
		SouthWidth  740.248
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
		SemiMajorAxis   0.0183574
		Period          0.0225224
		Eccentricity    0.0260063
		Inclination     -0.0837677
		AscendingNode   37.7367
		ArgOfPericenter 25.5811
		MeanAnomaly     -166.581
	}
}

Moon	"Dellalt System 8.6"
{
	ParentBody     "Dellalt System 8"
	Class	       "Oceania"

	Mass            9.86235
	Radius          15447.7
	InertiaMoment   0.331187

	Obliquity       -1.07915
	EqAscendNode    101.409
	TidalLocked     true

	AlbedoBond      0.353198
	AlbedoGeom      0.423838
	Brightness      2
	Color          (0.640 0.635 0.633)

	Surface
	{
		SurfStyle       0.729781
		OceanStyle      0.608025
		Randomize      (-0.687, -0.859, 0.746)
		colorDistMagn   0.0701629
		colorDistFreq   1802.97
		detailScale     39732.3
		colorConversion true
		seaLevel        0.9702
		snowLevel       2
		tropicLatitude  0.0238542
		icecapLatitude  10
		icecapHeight    0.990027
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        0.888873
		venusFreq       0.527863
		venusMagn       0.363651
		mareFreq        0
		mareDensity     0
		terraceProb     0.316422
		erosion         0
		montesMagn      0.17793
		montesFreq      772.463
		montesSpiky     0.998684
		montesFraction  0.627281
		dunesMagn       0.0462255
		dunesFreq       144.883
		dunesFraction   0.438642
		hillsMagn       0.14553
		hillsFreq       1670.92
		hillsFraction   0.646155
		hills2Fraction  0.210935
		riversMagn      54.2938
		riversFreq      2.37301
		riversSin       6.29532
		riversOctaves   0
		canyonsMagn     0.052464
		canyonsFreq     401.312
		canyonFraction  0.74502
		cracksMagn      0.10338
		cracksFreq      1.632
		cracksOctaves   3
		craterMagn      0.0143755
		craterFreq      153.553
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.664146
		volcanoFreq     0.58417
		volcanoDensity  0
		volcanoOctaves  0
		volcanoActivity 2
		volcanoFlows    0
		volcanoRadius   0.490228
		volcanoTemp     1729.97
		lavaCoverTidal  0.210555
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.42454
		stripeTwist     0.432099
		cycloneMagn     2.00793
		cycloneFreq     0.771437
		cycloneDensity  0.405426
		cycloneOctaves  3
		colorSea       (0.040, 0.200, 0.200, 1.000)
		colorShelf     (0.150, 0.370, 0.370, 1.000)
		colorBeach     (0.950, 0.950, 0.950, 1.308)
		colorDesert    (0.770, 0.770, 0.470, 1.308)
		colorLowland   (0.880, 0.880, 0.880, 1.308)
		colorUpland    (1.000, 1.000, 1.000, 1.308)
		colorRock      (1.000, 1.000, 1.000, 1.308)
		colorSnow      (1.000, 1.000, 1.000, 1.308)
		BumpHeight      148.732
		BumpOffset      144.3
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
		Height          20.1826
		Velocity        125.412
		BumpHeight      5.57907
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.07729
		mainOctaves     10
		Coverage        0.25533
		stripeZones     2.42454
		stripeTwist     0.432099
	}

	Clouds
	{
		Height          40.3652
		Velocity        194.974
		BumpHeight      6.22027
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.07729
		mainOctaves     10
		Coverage        0.25533
		stripeZones     2.42454
		stripeTwist     0.432099
	}

	Ocean
	{
		Height          144.3
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
	}

	NoLava          true

	Atmosphere
	{
		Model          "Thick"
		Height          192.556
		Density         889.655
		Pressure        1699.24
		Greenhouse      513.026
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.613863
		Saturation      0.5

		Composition
		{
			H2O   	71.0224
			CO2   	28.8908
			SO2   	0.0808682
			N2    	0.00550113
			Ar    	0.000307686
			Ne    	5.78114e-005
			CO    	2.03182e-005
		}
	}

	Aurora
	{
		Height      228.075
		NorthLat    76.5418
		NorthLon    -108.57
		NorthRadius 3782.06
		NorthWidth  920.729
		NorthRings  2
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -81.1618
		SouthLon    78.5078
		SouthRadius 4873.82
		SouthWidth  1478.76
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
		SemiMajorAxis   0.0252985
		Period          0.0363964
		Eccentricity    0.0185862
		Inclination     -1.07915
		AscendingNode   101.409
		ArgOfPericenter -13.9335
		MeanAnomaly     -5.00343
	}
}

DwarfMoon	"Dellalt System 8.D5"
{
	ParentBody     "Dellalt System 8"
	Class	       "Asteroid"

	Mass            7.04734e-007
	Radius          129.362
	InertiaMoment   0.398585

	Obliquity       80.4698
	EqAscendNode    -18.8478
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.483 0.474 0.469)

	Surface
	{
		SurfStyle       0.47034
		OceanStyle      0.931156
		Randomize      (-0.138, -0.076, -0.391)
		colorDistMagn   0.85494
		colorDistFreq   7.81466
		detailScale     3532.43
		colorConversion true
		snowLevel       2
		tropicLatitude  0.450007
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.704601
		terraceProb     0.298471
		erosion         0
		montesMagn      0.679449
		montesFreq      1.98804
		montesSpiky     0.98198
		montesFraction  0.483
		dunesFraction   0
		hillsMagn       0
		hillsFreq       55.2102
		hillsFraction   0.691505
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.200712
		craterFreq      0.482528
		craterDensity   0.921255
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.424164
		volcanoTemp     1181.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.193, 0.190, 0.188, 0.000)
		colorShelf     (0.205, 0.201, 0.199, 0.000)
		colorBeach     (0.217, 0.213, 0.211, 0.000)
		colorDesert    (0.229, 0.225, 0.223, 0.000)
		colorLowland   (0.241, 0.237, 0.235, 0.000)
		colorUpland    (0.254, 0.249, 0.246, 0.000)
		colorRock      (0.266, 0.261, 0.258, 0.000)
		colorSnow      (0.278, 0.272, 0.270, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.11801
		Period          0.367129
		Eccentricity    0.140764
		Inclination     80.4698
		AscendingNode   -18.8478
		ArgOfPericenter -134.641
		MeanAnomaly     72.6054
	}
}

DwarfMoon	"Dellalt System 8.D6"
{
	ParentBody     "Dellalt System 8"
	Class	       "Asteroid"

	Mass            1.00925e-006
	Radius          139.894
	InertiaMoment   0.399569

	Obliquity       32.3165
	EqAscendNode    -101.238
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.835 0.794 0.728)

	Surface
	{
		SurfStyle       0.87835
		OceanStyle      0.424725
		Randomize      (-0.865, -0.907, -0.146)
		colorDistMagn   0.411716
		colorDistFreq   12.6535
		detailScale     3820.04
		colorConversion true
		snowLevel       2
		tropicLatitude  0.63816
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.453132
		terraceProb     0.282108
		erosion         0
		montesMagn      0.494972
		montesFreq      1.92093
		montesSpiky     0.880995
		montesFraction  0.413401
		dunesFraction   0
		hillsMagn       0
		hillsFreq       33.8532
		hillsFraction   0.776924
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25239
		craterFreq      0.652145
		craterDensity   0.828794
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.498677
		volcanoTemp     1494.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.284, 0.278, 0.291, 0.050)
		colorShelf     (0.334, 0.326, 0.335, 0.040)
		colorBeach     (0.384, 0.373, 0.379, 0.030)
		colorDesert    (0.434, 0.421, 0.430, 0.020)
		colorLowland   (0.484, 0.468, 0.473, 0.030)
		colorUpland    (0.535, 0.516, 0.517, 0.050)
		colorRock      (0.585, 0.564, 0.575, 0.020)
		colorSnow      (0.585, 0.564, 0.575, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.11843
		Period          0.369091
		Eccentricity    0.215751
		Inclination     32.3165
		AscendingNode   -101.238
		ArgOfPericenter -40.1103
		MeanAnomaly     -94.6604
	}
}

DwarfMoon	"Dellalt System 8.D7"
{
	ParentBody     "Dellalt System 8"
	Class	       "Asteroid"

	Mass            1.46576e-006
	Radius          151.551
	InertiaMoment   0.397313

	Obliquity       14.5103
	EqAscendNode    11.5918
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.505 0.502 0.497)

	Surface
	{
		SurfStyle       0.686011
		OceanStyle      0.295619
		Randomize      (0.339, -0.477, -0.571)
		colorDistMagn   0.681805
		colorDistFreq   4.32335
		detailScale     4138.34
		colorConversion true
		snowLevel       2
		tropicLatitude  0.482809
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.757597
		terraceProb     0.515617
		erosion         0
		montesMagn      0.534899
		montesFreq      2.96049
		montesSpiky     0.853421
		montesFraction  0.232239
		dunesFraction   0
		hillsMagn       0
		hillsFreq       50.253
		hillsFraction   0.806289
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244834
		craterFreq      0.746401
		craterDensity   0.976444
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.515718
		volcanoTemp     1630.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.197, 0.171, 0.139, 0.000)
		colorShelf     (0.202, 0.176, 0.159, 0.000)
		colorBeach     (0.237, 0.206, 0.189, 0.000)
		colorDesert    (0.258, 0.221, 0.184, 0.000)
		colorLowland   (0.283, 0.236, 0.209, 0.000)
		colorUpland    (0.313, 0.286, 0.254, 0.000)
		colorRock      (0.339, 0.311, 0.274, 0.000)
		colorSnow      (0.369, 0.332, 0.288, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.118891
		Period          0.371247
		Eccentricity    0.353373
		Inclination     14.5103
		AscendingNode   11.5918
		ArgOfPericenter 108.958
		MeanAnomaly     -74.1818
	}
}

DwarfMoon	"Dellalt System 8.D8"
{
	ParentBody     "Dellalt System 8"
	Class	       "Asteroid"

	Mass            2.16497e-006
	Radius          204.146
	InertiaMoment   0.398741

	RotationPeriod  6553.32
	Obliquity       -75.582
	EqAscendNode    157.04

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.736 0.733 0.730)

	Surface
	{
		SurfStyle       0.869035
		OceanStyle      0.474364
		Randomize      (-0.199, 0.810, -0.953)
		colorDistMagn   0.864541
		colorDistFreq   27.3184
		detailScale     5574.54
		colorConversion true
		snowLevel       2
		tropicLatitude  0.378283
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.571387
		terraceProb     0.291366
		erosion         0
		montesMagn      0.510027
		montesFreq      3.45429
		montesSpiky     0.783406
		montesFraction  0.4773
		dunesFraction   0
		hillsMagn       0
		hillsFreq       68.5291
		hillsFraction   0.671729
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233249
		craterFreq      1.56188
		craterDensity   0.778872
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.449573
		volcanoTemp     1707.82
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.250, 0.256, 0.292, 0.050)
		colorShelf     (0.294, 0.300, 0.336, 0.040)
		colorBeach     (0.338, 0.344, 0.380, 0.030)
		colorDesert    (0.382, 0.388, 0.431, 0.020)
		colorLowland   (0.427, 0.432, 0.475, 0.030)
		colorUpland    (0.471, 0.476, 0.518, 0.050)
		colorRock      (0.515, 0.520, 0.577, 0.020)
		colorSnow      (0.515, 0.520, 0.577, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.119435
		Period          0.3738
		Eccentricity    0.385091
		Inclination     -75.582
		AscendingNode   157.04
		ArgOfPericenter -74.3137
		MeanAnomaly     -53.547
	}
}

Moon	"Dellalt System 8.7"
{
	ParentBody     "Dellalt System 8"
	Class	       "IceWorld"

	Mass            2.71185
	Radius          10209
	InertiaMoment   0.331765

	Obliquity       37.6364
	EqAscendNode    95.3532
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.690 0.639 0.593)

	Surface
	{
		SurfStyle       0.673621
		OceanStyle      0.834939
		Randomize      (-0.135, 0.502, 0.399)
		colorDistMagn   0.0653673
		colorDistFreq   1348.57
		detailScale     26258.1
		colorConversion true
		drivenDarkening 0
		seaLevel        0.281145
		snowLevel       2
		tropicLatitude  0.749595
		icecapLatitude  1
		icecapHeight    0.281145
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.50543
		venusFreq       1.19764
		venusMagn       0
		mareFreq        1.32638
		mareDensity     0.118888
		terraceProb     0.158864
		erosion         0
		montesMagn      0.197265
		montesFreq      507.761
		montesSpiky     0.855946
		montesFraction  0.939881
		dunesMagn       0.0391444
		dunesFreq       13567
		dunesFraction   0.970411
		hillsMagn       0.13426
		hillsFreq       1072.13
		hillsFraction   0.353944
		hills2Fraction  0.109421
		riversMagn      64.1515
		riversFreq      2.6736
		riversSin       6.41188
		riversOctaves   0
		canyonsMagn     0.491373
		canyonsFreq     4.25516
		canyonFraction  0
		cracksMagn      0.0486225
		cracksFreq      2.74262
		cracksOctaves   3
		craterMagn      0.550456
		craterFreq      30.5701
		craterDensity   0.990696
		craterOctaves   14
		craterRayedFactor 0
		volcanoMagn     0.539827
		volcanoFreq     0.59059
		volcanoDensity  0.20698
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.338133
		volcanoRadius   0.534125
		volcanoTemp     1587.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.442, 0.409, 0.398, 0.250)
		colorShelf     (0.483, 0.467, 0.451, 0.250)
		colorBeach     (0.393, 0.345, 0.344, 0.200)
		colorDesert    (0.366, 0.313, 0.303, 0.200)
		colorLowland   (0.269, 0.243, 0.249, 0.200)
		colorUpland    (0.511, 0.473, 0.451, 0.250)
		colorRock      (0.640, 0.630, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.269, 0.243, 0.249, 0.200)
		colorUpPlants  (0.511, 0.473, 0.451, 0.250)
		BumpHeight      19.4396
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.990967
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
		Height          55.4633
		Density         0.000903318
		Pressure        0.000284768
		Greenhouse      0.231651
		Bright          3.90093
		Opacity         0
		SkyLight        1.30031
		Hue             -0.00659231
		Saturation      1

		Composition
		{
			N2    	53.6715
			CH4   	29.9167
			CO    	14.6866
			Ar    	1.13542
			Ne    	0.46539
			He    	0.0982044
			Kr    	0.0260034
			C2H4  	0.00013898
		}
	}

	Aurora
	{
		Height      166.598
		NorthLat    50.8901
		NorthLon    18.3656
		NorthRadius 2570.89
		NorthWidth  935.406
		NorthRings  5
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -48.7773
		SouthLon    214.13
		SouthRadius 2661.05
		SouthWidth  704.251
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
		SemiMajorAxis   0.119987
		Period          0.376268
		Eccentricity    0.189867
		Inclination     37.6364
		AscendingNode   95.3532
		ArgOfPericenter 51.995
		MeanAnomaly     -60.3878
	}
}

Moon	"Dellalt System 8.8"
{
	ParentBody     "Dellalt System 8"
	Class	       "IceWorld"

	Mass            5.04516e-006
	Radius          240.544
	InertiaMoment   0.397594

	RotationPeriod  9955.37
	Obliquity       -66.068
	EqAscendNode    4.51816

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.740 0.739 0.737)

	Surface
	{
		SurfStyle       0.508916
		OceanStyle      0.485285
		Randomize      (0.339, -0.321, 0.673)
		colorDistMagn   0.0611116
		colorDistFreq   31.6174
		detailScale     618.694
		colorConversion true
		drivenDarkening 0.0540869
		seaLevel        0.105797
		snowLevel       2
		tropicLatitude  0.743894
		icecapLatitude  1
		icecapHeight    0.105797
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.52371
		venusFreq       1.2244
		venusMagn       0
		mareFreq        0
		mareDensity     1.34135e-006
		terraceProb     0.213941
		erosion         0
		montesMagn      0.0477254
		montesFreq      14.3072
		montesSpiky     0.910282
		montesFraction  0.580843
		dunesMagn       0.0521903
		dunesFreq       322.924
		dunesFraction   0.877505
		hillsMagn       0.11875
		hillsFreq       28.0189
		hillsFraction   0.00344078
		hills2Fraction  0.147844
		riversMagn      56.6085
		riversFreq      1.54045
		riversSin       7.26541
		riversOctaves   0
		canyonsMagn     0.417304
		canyonsFreq     0.0887776
		canyonFraction  0
		cracksMagn      0.0318326
		cracksFreq      0.0837386
		cracksOctaves   0
		craterMagn      1.00928
		craterFreq      0.624131
		craterDensity   0.92279
		craterOctaves   8
		craterRayedFactor 0.105473
		volcanoMagn     0.16352
		volcanoFreq     0.715993
		volcanoDensity  0.189347
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.315868
		volcanoRadius   0.174549
		volcanoTemp     1870.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.222, 0.185, 0.162, 0.000)
		colorShelf     (0.274, 0.229, 0.206, 0.000)
		colorBeach     (0.415, 0.347, 0.309, 0.200)
		colorDesert    (0.378, 0.325, 0.273, 0.500)
		colorLowland   (0.289, 0.251, 0.206, 0.800)
		colorUpland    (0.489, 0.443, 0.383, 1.000)
		colorRock      (0.670, 0.620, 0.550, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.289, 0.251, 0.206, 0.800)
		colorUpPlants  (0.489, 0.443, 0.383, 1.000)
		BumpHeight      12.0272
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
		SemiMajorAxis   0.120449
		Period          0.378568
		Eccentricity    0.367092
		Inclination     -66.068
		AscendingNode   4.51816
		ArgOfPericenter 101.006
		MeanAnomaly     -92.3368
	}
}

DwarfMoon	"Dellalt System 8.D9"
{
	ParentBody     "Dellalt System 8"
	Class	       "Asteroid"

	Mass            1.48664e-011
	Radius          3.30514
	InertiaMoment   0.39889

	RotationPeriod  5001.4
	Obliquity       -81.1284
	EqAscendNode    109.832

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.516 0.508 0.504)

	Surface
	{
		SurfStyle       0.595036
		OceanStyle      0.308822
		Randomize      (0.200, 0.813, -0.093)
		colorDistMagn   0.352593
		colorDistFreq   0.0027801
		detailScale     90.2522
		colorConversion true
		snowLevel       2
		tropicLatitude  0.934874
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.600497
		terraceProb     0.659712
		erosion         0
		montesMagn      0.443639
		montesFreq      3.0121
		montesSpiky     0.986533
		montesFraction  0.442322
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0288541
		hillsFraction   0.545826
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237357
		craterFreq      0.256199
		craterDensity   0.886504
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.519881
		volcanoTemp     1316.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.201, 0.173, 0.141, 0.000)
		colorShelf     (0.206, 0.178, 0.161, 0.000)
		colorBeach     (0.242, 0.208, 0.191, 0.000)
		colorDesert    (0.263, 0.223, 0.186, 0.000)
		colorLowland   (0.289, 0.239, 0.212, 0.000)
		colorUpland    (0.320, 0.289, 0.257, 0.000)
		colorRock      (0.346, 0.315, 0.277, 0.000)
		colorSnow      (0.377, 0.335, 0.292, 1.000)
		BumpHeight      2.97462
		BumpOffset      0.594924
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.120831
		Period          0.380372
		Eccentricity    0.446289
		Inclination     -81.1284
		AscendingNode   109.832
		ArgOfPericenter -51.9682
		MeanAnomaly     138.063
	}
}

Moon	"Dellalt System 8.9"
{
	ParentBody     "Dellalt System 8"
	Class	       "IceWorld"

	Mass            0.00435579
	Radius          1429.8
	InertiaMoment   0.392246

	Obliquity       76.1477
	EqAscendNode    -15.7454
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.815 0.711 0.613)

	Surface
	{
		SurfStyle       0.203453
		OceanStyle      0.420953
		Randomize      (-0.173, 0.579, -0.490)
		colorDistMagn   0.0689537
		colorDistFreq   175.143
		detailScale     3677.52
		colorConversion true
		drivenDarkening 0.0538059
		seaLevel        0.167383
		snowLevel       2
		tropicLatitude  0.526808
		icecapLatitude  1
		icecapHeight    0.167383
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.53592
		venusFreq       0.973791
		venusMagn       0
		mareFreq        0.488128
		mareDensity     0.00125951
		terraceProb     0.499664
		erosion         0
		montesMagn      0.0772698
		montesFreq      58.6342
		montesSpiky     0.996193
		montesFraction  0.187393
		dunesMagn       0.0370232
		dunesFreq       1907.8
		dunesFraction   0.302951
		hillsMagn       0.122007
		hillsFreq       156.103
		hillsFraction   0.648854
		hills2Fraction  0.137819
		riversMagn      60.7798
		riversFreq      2.97868
		riversSin       5.58104
		riversOctaves   0
		canyonsMagn     0.397204
		canyonsFreq     0.588092
		canyonFraction  0
		cracksMagn      0.0478326
		cracksFreq      0.527824
		cracksOctaves   0
		craterMagn      0.557959
		craterFreq      3.69997
		craterDensity   0.948317
		craterOctaves   11
		craterRayedFactor 0.139483
		volcanoMagn     0.190614
		volcanoFreq     0.725133
		volcanoDensity  0.147295
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.27967
		volcanoRadius   0.17453
		volcanoTemp     1825.33
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.815, 0.711, 0.613, 0.500)
		colorShelf     (0.774, 0.675, 0.582, 0.500)
		colorBeach     (0.571, 0.498, 0.429, 0.750)
		colorDesert    (0.693, 0.604, 0.521, 1.000)
		colorLowland   (0.717, 0.626, 0.540, 1.000)
		colorUpland    (0.758, 0.661, 0.570, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.717, 0.626, 0.540, 1.000)
		colorUpPlants  (0.758, 0.661, 0.570, 1.000)
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
		SemiMajorAxis   0.121078
		Period          0.381538
		Eccentricity    0.0729124
		Inclination     76.1477
		AscendingNode   -15.7454
		ArgOfPericenter -100.732
		MeanAnomaly     122.601
	}
}

DwarfMoon	"Dellalt System 8.D10"
{
	ParentBody     "Dellalt System 8"
	Class	       "Asteroid"

	Mass            5.3625e-011
	Radius          5.55872
	InertiaMoment   0.397834

	Obliquity       46.0795
	EqAscendNode    -62.5858
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.668 0.486 0.406)

	Surface
	{
		SurfStyle       0.643501
		OceanStyle      0.463613
		Randomize      (0.315, 0.917, 0.617)
		colorDistMagn   0.407334
		colorDistFreq   0.013858
		detailScale     151.79
		colorConversion true
		snowLevel       2
		tropicLatitude  0.970206
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.63956
		terraceProb     0.505784
		erosion         0
		montesMagn      0.378477
		montesFreq      2.78024
		montesSpiky     0.944255
		montesFraction  0.237067
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0831518
		hillsFraction   0.591456
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262955
		craterFreq      0.276038
		craterDensity   0.90573
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.417224
		volcanoTemp     1421.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.261, 0.165, 0.114, 0.000)
		colorShelf     (0.267, 0.170, 0.130, 0.000)
		colorBeach     (0.314, 0.199, 0.154, 0.000)
		colorDesert    (0.341, 0.214, 0.150, 0.000)
		colorLowland   (0.374, 0.228, 0.170, 0.000)
		colorUpland    (0.414, 0.277, 0.207, 0.000)
		colorRock      (0.448, 0.301, 0.223, 0.000)
		colorSnow      (0.488, 0.321, 0.235, 1.000)
		BumpHeight      5.00284
		BumpOffset      1.00057
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.121448
		Period          0.383291
		Eccentricity    0.474907
		Inclination     46.0795
		AscendingNode   -62.5858
		ArgOfPericenter 108.306
		MeanAnomaly     -157.905
	}
}

DwarfMoon	"Dellalt System 8.D11"
{
	ParentBody     "Dellalt System 8"
	Class	       "Asteroid"

	Mass            9.16697e-011
	Radius          6.35947
	InertiaMoment   0.399033

	Obliquity       -12.6168
	EqAscendNode    64.9308
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.544 0.450 0.314)

	Surface
	{
		SurfStyle       0.819715
		OceanStyle      0.411536
		Randomize      (-0.528, 0.778, 0.738)
		colorDistMagn   0.953213
		colorDistFreq   0.0108084
		detailScale     173.656
		colorConversion true
		snowLevel       2
		tropicLatitude  0.362272
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.656391
		terraceProb     0.122017
		erosion         0
		montesMagn      0.470414
		montesFreq      2.85067
		montesSpiky     0.923711
		montesFraction  0.676389
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.107892
		hillsFraction   0.944493
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.269735
		craterFreq      0.251875
		craterDensity   0.775226
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.529704
		volcanoTemp     1100.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.212, 0.153, 0.088, 0.000)
		colorShelf     (0.218, 0.157, 0.100, 0.000)
		colorBeach     (0.256, 0.184, 0.119, 0.000)
		colorDesert    (0.277, 0.198, 0.116, 0.000)
		colorLowland   (0.305, 0.211, 0.132, 0.000)
		colorUpland    (0.337, 0.256, 0.160, 0.000)
		colorRock      (0.364, 0.279, 0.173, 0.000)
		colorSnow      (0.397, 0.297, 0.182, 1.000)
		BumpHeight      5.72352
		BumpOffset      1.1447
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.121881
		Period          0.385342
		Eccentricity    0.268953
		Inclination     -12.6168
		AscendingNode   64.9308
		ArgOfPericenter -151.724
		MeanAnomaly     -126.323
	}
}

DwarfPlanet	"Dellalt System 9"
{
	ParentBody     "Dellalt System"
	Class	       "IceWorld"

	Mass            0.0116914
	Radius          1977.84
	InertiaMoment   0.379055

	Oblateness      0.00263667

	RotationPeriod  47.0798
	Obliquity       50.6005
	EqAscendNode    165.453

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.598 0.406 0.267)

	Surface
	{
		SurfStyle       0.917029
		OceanStyle      0.0181422
		Randomize      (-0.097, -0.333, 0.694)
		colorDistMagn   0.0539493
		colorDistFreq   238.329
		detailScale     5087.12
		colorConversion true
		drivenDarkening 0
		seaLevel        0.166749
		snowLevel       2
		tropicLatitude  0.79091
		icecapLatitude  1
		icecapHeight    0.166749
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.94648
		venusFreq       1.73398
		venusMagn       0
		mareFreq        0.864074
		mareDensity     0.00181443
		terraceProb     0.184271
		erosion         0
		montesMagn      0.119797
		montesFreq      86.4885
		montesSpiky     0.954144
		montesFraction  0.812129
		dunesMagn       0.0345609
		dunesFreq       2598.78
		dunesFraction   0.682949
		hillsMagn       0.113589
		hillsFreq       238.922
		hillsFraction   0.266943
		hills2Fraction  0.248084
		riversMagn      54.9381
		riversFreq      2.35932
		riversSin       5.50132
		riversOctaves   0
		canyonsMagn     0.345677
		canyonsFreq     0.729252
		canyonFraction  0
		cracksMagn      0.0477249
		cracksFreq      0.818505
		cracksOctaves   2
		craterMagn      0.514946
		craterFreq      6.05073
		craterDensity   0.726463
		craterOctaves   11
		craterRayedFactor 0.198415
		volcanoMagn     0.366066
		volcanoFreq     0.863128
		volcanoDensity  0.218013
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.379693
		volcanoRadius   0.298165
		volcanoTemp     1946.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.454, 0.288, 0.155, 1.000)
		colorShelf     (0.454, 0.288, 0.155, 1.000)
		colorBeach     (0.418, 0.252, 0.133, 1.000)
		colorDesert    (0.418, 0.252, 0.133, 1.000)
		colorLowland   (0.508, 0.329, 0.203, 1.000)
		colorUpland    (0.532, 0.361, 0.229, 1.000)
		colorRock      (0.930, 0.910, 0.860, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.508, 0.329, 0.203, 1.000)
		colorUpPlants  (0.532, 0.361, 0.229, 1.000)
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
		SemiMajorAxis   7.20414
		Period          23.1406
		Eccentricity    0.00435374
		Inclination     -0.405951
		AscendingNode   164.372
		ArgOfPericenter 14.3833
		MeanAnomaly     135.626
	}
}

Moon	"Dellalt System 9.1"
{
	ParentBody     "Dellalt System 9"
	Class	       "IceWorld"

	Mass            2.54931e-005
	Radius          244.624
	InertiaMoment   0.39948

	Oblateness      0.00955855

	Obliquity       0.0412823
	EqAscendNode    -4.35632
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.784 0.720 0.689)

	Surface
	{
		SurfStyle       0.235861
		OceanStyle      0.321525
		Randomize      (-0.567, 0.685, -0.002)
		colorDistMagn   0.0496537
		colorDistFreq   24.6689
		detailScale     629.187
		colorConversion true
		drivenDarkening 0
		seaLevel        0.235829
		snowLevel       2
		tropicLatitude  0.00142357
		icecapLatitude  0.80733
		icecapHeight    0.251733
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.93987
		venusFreq       0.878826
		venusMagn       0
		mareFreq        0
		mareDensity     5.89251e-005
		terraceProb     0.208281
		erosion         0
		montesMagn      0.052836
		montesFreq      15.3592
		montesSpiky     0.927874
		montesFraction  0.544374
		dunesMagn       0.0418115
		dunesFreq       323.627
		dunesFraction   0.952152
		hillsMagn       0.117285
		hillsFreq       27.6528
		hillsFraction   0.48691
		hills2Fraction  0.21731
		riversMagn      62.8952
		riversFreq      3.8154
		riversSin       6.50583
		riversOctaves   0
		canyonsMagn     0.555554
		canyonsFreq     0.105215
		canyonFraction  0
		cracksMagn      0.0224447
		cracksFreq      0.0817898
		cracksOctaves   0
		craterMagn      1.08788
		craterFreq      0.711468
		craterDensity   0.792733
		craterOctaves   8
		craterRayedFactor 0.216232
		volcanoMagn     0.159147
		volcanoFreq     0.795622
		volcanoDensity  0.221412
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.268841
		volcanoRadius   0.157971
		volcanoTemp     1224.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.784, 0.720, 0.689, 0.500)
		colorShelf     (0.745, 0.684, 0.655, 0.500)
		colorBeach     (0.549, 0.504, 0.483, 0.750)
		colorDesert    (0.667, 0.612, 0.586, 1.000)
		colorLowland   (0.690, 0.634, 0.607, 1.000)
		colorUpland    (0.729, 0.670, 0.641, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.690, 0.634, 0.607, 1.000)
		colorUpPlants  (0.729, 0.670, 0.641, 1.000)
		BumpHeight      12.2312
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
		SemiMajorAxis   6.39146e-005
		Period          0.00273007
		Eccentricity    0.0168826
		Inclination     0.0412823
		AscendingNode   -4.35632
		ArgOfPericenter 172.148
		MeanAnomaly     -0.233528
	}
}

Moon	"Dellalt System 9.2"
{
	ParentBody     "Dellalt System 9"
	Class	       "IceWorld"

	Mass            2.98655e-005
	Radius          273.917
	InertiaMoment   0.398986

	Obliquity       -1.13652
	EqAscendNode    145.279
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.636 0.452 0.351)

	Surface
	{
		SurfStyle       0.0691585
		OceanStyle      0.263578
		Randomize      (0.582, -0.207, -0.850)
		colorDistMagn   0.0790803
		colorDistFreq   38.6689
		detailScale     704.531
		colorConversion true
		drivenDarkening 0
		seaLevel        0.31641
		snowLevel       2
		tropicLatitude  0.0118349
		icecapLatitude  0.48143
		icecapHeight    0.338107
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.06558
		venusFreq       1.27179
		venusMagn       0
		mareFreq        0
		mareDensity     4.77806e-005
		terraceProb     0.354548
		erosion         0
		montesMagn      0.0456004
		montesFreq      15.407
		montesSpiky     0.962571
		montesFraction  0.871408
		dunesMagn       0.0295048
		dunesFreq       355.727
		dunesFraction   0.874267
		hillsMagn       0.123479
		hillsFreq       27.9762
		hillsFraction   0.241029
		hills2Fraction  0.184855
		riversMagn      60.1284
		riversFreq      3.21219
		riversSin       3.11916
		riversOctaves   0
		canyonsMagn     0.767612
		canyonsFreq     0.0858812
		canyonFraction  0
		cracksMagn      0.0427163
		cracksFreq      0.161034
		cracksOctaves   0
		craterMagn      0.934727
		craterFreq      0.782035
		craterDensity   0.978623
		craterOctaves   8
		craterRayedFactor 0.124746
		volcanoMagn     0.18746
		volcanoFreq     0.756959
		volcanoDensity  0.161178
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.128842
		volcanoRadius   0.169006
		volcanoTemp     1655.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.636, 0.452, 0.351, 0.500)
		colorShelf     (0.604, 0.429, 0.334, 0.500)
		colorBeach     (0.445, 0.316, 0.246, 0.750)
		colorDesert    (0.540, 0.384, 0.299, 1.000)
		colorLowland   (0.559, 0.397, 0.309, 1.000)
		colorUpland    (0.591, 0.420, 0.327, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.559, 0.397, 0.309, 1.000)
		colorUpPlants  (0.591, 0.420, 0.327, 1.000)
		BumpHeight      13.6959
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
		SemiMajorAxis   0.000160038
		Period          0.010815
		Eccentricity    0.0237736
		Inclination     -1.13652
		AscendingNode   145.279
		ArgOfPericenter 67.2459
		MeanAnomaly     -156.325
	}
}

Moon	"Dellalt System 9.3"
{
	ParentBody     "Dellalt System 9"
	Class	       "IceWorld"

	Mass            3.48507e-005
	Radius          271.447
	InertiaMoment   0.398421

	Obliquity       -1.43201
	EqAscendNode    105.341
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.532 0.524 0.517)

	Surface
	{
		SurfStyle       0.61423
		OceanStyle      0.00740018
		Randomize      (0.319, 0.953, -0.564)
		colorDistMagn   0.0555576
		colorDistFreq   38.5
		detailScale     698.177
		colorConversion true
		drivenDarkening 0
		seaLevel        0.242888
		snowLevel       2
		tropicLatitude  0.0303054
		icecapLatitude  0.72859
		icecapHeight    0.267671
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.80643
		venusFreq       1.14558
		venusMagn       0.224258
		mareFreq        0
		mareDensity     6.00673e-005
		terraceProb     0.410757
		erosion         0
		montesMagn      0.0775338
		montesFreq      12.6847
		montesSpiky     0.86221
		montesFraction  0.847633
		dunesMagn       0.0347251
		dunesFreq       363.097
		dunesFraction   0.680568
		hillsMagn       0.130105
		hillsFreq       29.8311
		hillsFraction   0.333208
		hills2Fraction  0.204728
		riversMagn      63.4091
		riversFreq      3.38717
		riversSin       5.87812
		riversOctaves   0
		canyonsMagn     0.41899
		canyonsFreq     0.0708572
		canyonFraction  0
		cracksMagn      0.0616596
		cracksFreq      0.0974123
		cracksOctaves   0
		craterMagn      0.82334
		craterFreq      0.539807
		craterDensity   0.900939
		craterOctaves   8
		craterRayedFactor 0.0658016
		volcanoMagn     0.19029
		volcanoFreq     0.732031
		volcanoDensity  0.180496
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.306217
		volcanoRadius   0.149128
		volcanoTemp     1618.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.138, 0.099, 0.057, 1.000)
		colorShelf     (0.181, 0.136, 0.083, 1.000)
		colorBeach     (0.293, 0.178, 0.088, 0.200)
		colorDesert    (0.319, 0.199, 0.103, 0.200)
		colorLowland   (0.346, 0.209, 0.108, 0.200)
		colorUpland    (0.373, 0.251, 0.129, 0.200)
		colorRock      (0.920, 0.870, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.346, 0.209, 0.108, 0.200)
		colorUpPlants  (0.373, 0.251, 0.129, 0.200)
		BumpHeight      13.5724
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
		SemiMajorAxis   0.000253242
		Period          0.021523
		Eccentricity    0.0450854
		Inclination     -1.43201
		AscendingNode   105.341
		ArgOfPericenter -24.2858
		MeanAnomaly     -168.173
	}
}

Moon	"Dellalt System 9.4"
{
	ParentBody     "Dellalt System 9"
	Class	       "IceWorld"

	Mass            4.0543e-005
	Radius          303.244
	InertiaMoment   0.397686

	Obliquity       -0.00328639
	EqAscendNode    13.7577
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.674 0.450 0.388)

	Surface
	{
		SurfStyle       0.187558
		OceanStyle      0.659453
		Randomize      (0.650, -0.720, 0.987)
		colorDistMagn   0.0443225
		colorDistFreq   36.1626
		detailScale     779.96
		colorConversion true
		drivenDarkening 0
		seaLevel        0.139213
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  0.558332
		icecapHeight    0.193754
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.56296
		venusFreq       1.09734
		venusMagn       0
		mareFreq        0
		mareDensity     4.77203e-005
		terraceProb     0.159098
		erosion         0
		montesMagn      0.0495312
		montesFreq      11.413
		montesSpiky     0.882914
		montesFraction  0.824261
		dunesMagn       0.0359158
		dunesFreq       398.811
		dunesFraction   0.772745
		hillsMagn       0.149613
		hillsFreq       31.549
		hillsFraction   0.852571
		hills2Fraction  0.106554
		riversMagn      57.5313
		riversFreq      3.57867
		riversSin       5.35369
		riversOctaves   0
		canyonsMagn     0.49968
		canyonsFreq     0.0888267
		canyonFraction  0
		cracksMagn      0.0610763
		cracksFreq      0.100758
		cracksOctaves   0
		craterMagn      0.755516
		craterFreq      0.811035
		craterDensity   0.733692
		craterOctaves   8
		craterRayedFactor 0
		volcanoMagn     0.168906
		volcanoFreq     0.783743
		volcanoDensity  0.202684
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.320064
		volcanoRadius   0.143248
		volcanoTemp     1845.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.674, 0.450, 0.388, 0.500)
		colorShelf     (0.641, 0.428, 0.368, 0.500)
		colorBeach     (0.472, 0.315, 0.271, 0.750)
		colorDesert    (0.573, 0.383, 0.330, 1.000)
		colorLowland   (0.594, 0.396, 0.341, 1.000)
		colorUpland    (0.627, 0.419, 0.361, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.594, 0.396, 0.341, 1.000)
		colorUpPlants  (0.627, 0.419, 0.361, 1.000)
		BumpHeight      15.1622
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
		SemiMajorAxis   0.000400725
		Period          0.0428316
		Eccentricity    0.0052719
		Inclination     -0.00328639
		AscendingNode   13.7577
		ArgOfPericenter -10.3657
		MeanAnomaly     106.394
	}
}

Moon	"Dellalt System 9.5"
{
	ParentBody     "Dellalt System 9"
	Class	       "IceWorld"

	Mass            4.70557e-005
	Radius          299.964
	InertiaMoment   0.396307

	Obliquity       1.30346
	EqAscendNode    142.658
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.753 0.749 0.745)

	Surface
	{
		SurfStyle       0.438633
		OceanStyle      0.155297
		Randomize      (-0.544, -0.706, -0.861)
		colorDistMagn   0.0611587
		colorDistFreq   36.4446
		detailScale     771.525
		colorConversion true
		drivenDarkening 0
		seaLevel        0.245552
		snowLevel       2
		tropicLatitude  0.0145624
		icecapLatitude  0.924207
		icecapHeight    0.246631
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.54334
		venusFreq       0.884262
		venusMagn       0
		mareFreq        0
		mareDensity     7.83045e-005
		terraceProb     0.526176
		erosion         0
		montesMagn      0.0678997
		montesFreq      16.7219
		montesSpiky     0.878323
		montesFraction  0.270667
		dunesMagn       0.0431193
		dunesFreq       397.288
		dunesFraction   0.588616
		hillsMagn       0.14215
		hillsFreq       30.7972
		hillsFraction   0.857973
		hills2Fraction  0.0518914
		riversMagn      49.632
		riversFreq      3.57628
		riversSin       5.91755
		riversOctaves   0
		canyonsMagn     0.464938
		canyonsFreq     0.088079
		canyonFraction  0
		cracksMagn      0.0357659
		cracksFreq      0.107759
		cracksOctaves   0
		craterMagn      0.881806
		craterFreq      0.749088
		craterDensity   0.93339
		craterOctaves   8
		craterRayedFactor 0.202116
		volcanoMagn     0.178784
		volcanoFreq     0.503695
		volcanoDensity  0.190555
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.220038
		volcanoRadius   0.169489
		volcanoTemp     1167.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.753, 0.749, 0.745, 0.500)
		colorShelf     (0.715, 0.711, 0.708, 0.500)
		colorBeach     (0.527, 0.524, 0.522, 0.750)
		colorDesert    (0.640, 0.636, 0.634, 1.000)
		colorLowland   (0.663, 0.659, 0.656, 1.000)
		colorUpland    (0.700, 0.696, 0.693, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.663, 0.659, 0.656, 1.000)
		colorUpPlants  (0.700, 0.696, 0.693, 1.000)
		BumpHeight      14.9982
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
		SemiMajorAxis   0.000634101
		Period          0.0852337
		Eccentricity    0.0476608
		Inclination     1.30346
		AscendingNode   142.658
		ArgOfPericenter 43.4433
		MeanAnomaly     120.455
	}
}

Planet	"Dellalt System 10"
{
	ParentBody     "Dellalt System"
	Class	       "IceGiant"

	Mass            67.1611
	Radius          29970.5
	InertiaMoment   0.202385

	Oblateness      0.0401385

	RotationPeriod  6.87928
	Obliquity       39.7638
	EqAscendNode    77.4774

	AlbedoBond      0.411097
	AlbedoGeom      0.493317
	Brightness      2

	Surface
	{
		SurfStyle       0.763252
		Randomize      (-0.471, -0.066, 0.058)
		detailScale     77085.8
		colorConversion true
		tropicLatitude  0.644731
		icecapLatitude  1
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.4404
		stripeFluct     0.321788
		stripeTwist     8.16723
		cycloneMagn     7.72535
		cycloneFreq     0.575013
		cycloneDensity  0.480358
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
		BumpHeight      11.4676
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          29.3652
		Velocity        1336.96
		BumpHeight      17.8976
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.937573
		mainOctaves     12
		Coverage        0.0554866
		stripeZones     2.4404
		stripeFluct     0.321788
		stripeTwist     8.16723
	}

	Clouds
	{
		Height          47.2637
		Velocity        576.523
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		ModulateColor  (1.000 1.000 1.000 0.800)
		mainFreq        0.937573
		mainOctaves     12
		Coverage        0.0554866
		stripeZones     2.4404
		stripeFluct     0.321788
		stripeTwist     8.16723
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          190.444
		Density         9614.51
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.0107675
		Saturation      0.719187

		Composition
		{
			H2    	93.0177
			He    	6.96541
			N2    	0.0158286
			Ne    	0.00103504
			O2    	3.26678e-005
			Ar    	1.38404e-005
		}
	}

	Aurora
	{
		Height      726.753
		NorthLat    69.6741
		NorthLon    14.2488
		NorthRadius 9020.87
		NorthWidth  3292.22
		NorthRings  3
		NorthBright 1
		NorthParticles 10000
		SouthLat    -48.3983
		SouthLon    176.16
		SouthRadius 6466.56
		SouthWidth  2084.53
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
		SemiMajorAxis   11.1103
		Period          44.3128
		Eccentricity    0.0255502
		Inclination     2.40484
		AscendingNode   82.2882
		ArgOfPericenter 116.483
		MeanAnomaly     307.207
	}
}

DwarfMoon	"Dellalt System 10.D1"
{
	ParentBody     "Dellalt System 10"
	Class	       "Asteroid"

	Mass            2.64442e-007
	Radius          88.0423
	InertiaMoment   0.398964

	Oblateness      0.249

	Obliquity       -0.0136334
	EqAscendNode    -127.655
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.578 0.575 0.572)

	Surface
	{
		SurfStyle       0.662453
		OceanStyle      0.322098
		Randomize      (0.621, 0.536, -0.440)
		colorDistMagn   0.802404
		colorDistFreq   3.5124
		detailScale     2404.14
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.514697
		terraceProb     0.163994
		erosion         0
		montesMagn      0.502818
		montesFreq      2.65999
		montesSpiky     0.888202
		montesFraction  0.559325
		dunesFraction   0
		hillsMagn       0
		hillsFreq       17.1993
		hillsFraction   0.780907
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245243
		craterFreq      0.270594
		craterDensity   0.892701
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.546725
		volcanoTemp     1361.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.225, 0.195, 0.160, 0.000)
		colorShelf     (0.231, 0.201, 0.183, 0.000)
		colorBeach     (0.271, 0.236, 0.217, 0.000)
		colorDesert    (0.295, 0.253, 0.212, 0.000)
		colorLowland   (0.323, 0.270, 0.240, 0.000)
		colorUpland    (0.358, 0.328, 0.292, 0.000)
		colorRock      (0.387, 0.356, 0.314, 0.000)
		colorSnow      (0.422, 0.379, 0.332, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00047022
		Period          0.000719568
		Eccentricity    7.62361e-005
		Inclination     -0.0136334
		AscendingNode   -127.655
		ArgOfPericenter 43.7898
		MeanAnomaly     -175.162
	}
}

DwarfMoon	"Dellalt System 10.D2"
{
	ParentBody     "Dellalt System 10"
	Class	       "Asteroid"

	Mass            3.67952e-007
	Radius          92.7822
	InertiaMoment   0.399886

	Oblateness      0.249

	Obliquity       0.00901356
	EqAscendNode    -4.48676
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.768 0.766 0.764)

	Surface
	{
		SurfStyle       0.748992
		OceanStyle      0.795194
		Randomize      (0.187, -0.944, 0.977)
		colorDistMagn   0.317115
		colorDistFreq   6.5529
		detailScale     2533.57
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.595765
		terraceProb     0.125417
		erosion         0
		montesMagn      0.597597
		montesFreq      3.83414
		montesSpiky     0.895258
		montesFraction  0.423967
		dunesFraction   0
		hillsMagn       0
		hillsFreq       24.7252
		hillsFraction   0.574359
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.268601
		craterFreq      0.301756
		craterDensity   0.914825
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.482508
		volcanoTemp     2055.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.299, 0.260, 0.214, 0.000)
		colorShelf     (0.307, 0.268, 0.244, 0.000)
		colorBeach     (0.361, 0.314, 0.290, 0.000)
		colorDesert    (0.392, 0.337, 0.283, 0.000)
		colorLowland   (0.430, 0.360, 0.321, 0.000)
		colorUpland    (0.476, 0.436, 0.390, 0.000)
		colorRock      (0.514, 0.475, 0.420, 0.000)
		colorSnow      (0.561, 0.505, 0.443, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000485042
		Period          0.000753858
		Eccentricity    5.29276e-005
		Inclination     0.00901356
		AscendingNode   -4.48676
		ArgOfPericenter 166.503
		MeanAnomaly     -40.7606
	}
}

DwarfMoon	"Dellalt System 10.D3"
{
	ParentBody     "Dellalt System 10"
	Class	       "Asteroid"

	Mass            5.16242e-007
	Radius          121.541
	InertiaMoment   0.397946

	Oblateness      0.249

	Obliquity       -0.00611475
	EqAscendNode    -109.842
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.705 0.654 0.558)

	Surface
	{
		SurfStyle       0.719368
		OceanStyle      0.416136
		Randomize      (-0.629, -0.776, 0.882)
		colorDistMagn   0.533338
		colorDistFreq   5.24237
		detailScale     3318.88
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.304582
		terraceProb     0.169968
		erosion         0
		montesMagn      0.378412
		montesFreq      2.14538
		montesSpiky     0.965658
		montesFraction  0.314067
		dunesFraction   0
		hillsMagn       0
		hillsFreq       27.6606
		hillsFraction   0.664034
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229803
		craterFreq      0.616975
		craterDensity   0.865514
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.520073
		volcanoTemp     1492.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.275, 0.222, 0.156, 0.000)
		colorShelf     (0.282, 0.229, 0.179, 0.000)
		colorBeach     (0.331, 0.268, 0.212, 0.000)
		colorDesert    (0.360, 0.288, 0.206, 0.000)
		colorLowland   (0.395, 0.308, 0.234, 0.000)
		colorUpland    (0.437, 0.373, 0.285, 0.000)
		colorRock      (0.473, 0.406, 0.307, 0.000)
		colorSnow      (0.515, 0.432, 0.324, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000571603
		Period          0.000964412
		Eccentricity    8.23733e-005
		Inclination     -0.00611475
		AscendingNode   -109.842
		ArgOfPericenter -94.0413
		MeanAnomaly     145.659
	}
}

DwarfMoon	"Dellalt System 10.D4"
{
	ParentBody     "Dellalt System 10"
	Class	       "Asteroid"

	Mass            7.31543e-007
	Radius          129.431
	InertiaMoment   0.399105

	Oblateness      0.249

	Obliquity       0.0115474
	EqAscendNode    62.8619
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.794 0.698 0.651)

	Surface
	{
		SurfStyle       0.448592
		OceanStyle      0.464157
		Randomize      (-0.938, 0.467, 0.568)
		colorDistMagn   0.455566
		colorDistFreq   12.9999
		detailScale     3534.33
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.342978
		terraceProb     0.41299
		erosion         0
		montesMagn      0.424193
		montesFreq      3.23127
		montesSpiky     0.986758
		montesFraction  0.305749
		dunesFraction   0
		hillsMagn       0
		hillsFreq       36.9492
		hillsFraction   0.703488
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.291315
		craterFreq      0.478312
		craterDensity   0.87285
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.538727
		volcanoTemp     1428.53
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.317, 0.279, 0.260, 0.000)
		colorShelf     (0.337, 0.297, 0.276, 0.000)
		colorBeach     (0.357, 0.314, 0.293, 0.000)
		colorDesert    (0.377, 0.332, 0.309, 0.000)
		colorLowland   (0.397, 0.349, 0.325, 0.000)
		colorUpland    (0.417, 0.366, 0.342, 0.000)
		colorRock      (0.436, 0.384, 0.358, 0.000)
		colorSnow      (0.456, 0.401, 0.374, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000603601
		Period          0.00104652
		Eccentricity    4.55446e-005
		Inclination     0.0115474
		AscendingNode   62.8619
		ArgOfPericenter 91.0226
		MeanAnomaly     -98.8249
	}
}

DwarfMoon	"Dellalt System 10.D5"
{
	ParentBody     "Dellalt System 10"
	Class	       "Asteroid"

	Mass            1.04907e-006
	Radius          140.192
	InertiaMoment   0.394305

	Oblateness      0.249

	Obliquity       -0.0140316
	EqAscendNode    -122.031
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.715 0.658 0.594)

	Surface
	{
		SurfStyle       0.861096
		OceanStyle      0.23734
		Randomize      (0.620, 0.264, 0.415)
		colorDistMagn   0.494677
		colorDistFreq   11.5362
		detailScale     3828.18
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.39373
		terraceProb     0.414627
		erosion         0
		montesMagn      0.507391
		montesFreq      3.42099
		montesSpiky     0.891222
		montesFraction  0.536486
		dunesFraction   0
		hillsMagn       0
		hillsFreq       40.4026
		hillsFraction   0.818569
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239306
		craterFreq      0.640597
		craterDensity   0.974919
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.584965
		volcanoTemp     1491.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.243, 0.230, 0.238, 0.050)
		colorShelf     (0.286, 0.270, 0.273, 0.040)
		colorBeach     (0.329, 0.309, 0.309, 0.030)
		colorDesert    (0.372, 0.349, 0.351, 0.020)
		colorLowland   (0.415, 0.388, 0.386, 0.030)
		colorUpland    (0.458, 0.428, 0.422, 0.050)
		colorRock      (0.501, 0.467, 0.470, 0.020)
		colorSnow      (0.501, 0.467, 0.470, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000628525
		Period          0.001112
		Eccentricity    1.03951e-005
		Inclination     -0.0140316
		AscendingNode   -122.031
		ArgOfPericenter 90.6994
		MeanAnomaly     129.771
	}
}

DwarfMoon	"Dellalt System 10.D6"
{
	ParentBody     "Dellalt System 10"
	Class	       "Asteroid"

	Mass            1.52608e-006
	Radius          150.964
	InertiaMoment   0.398148

	Oblateness      0.17909

	Obliquity       -0.0147721
	EqAscendNode    -141.114
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.505 0.501 0.496)

	Surface
	{
		SurfStyle       0.387095
		OceanStyle      0.784929
		Randomize      (-0.823, -0.130, 0.275)
		colorDistMagn   0.0141599
		colorDistFreq   9.34431
		detailScale     4122.33
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.767386
		terraceProb     0.114897
		erosion         0
		montesMagn      0.665514
		montesFreq      2.36928
		montesSpiky     0.867507
		montesFraction  0.358636
		dunesFraction   0
		hillsMagn       0
		hillsFreq       69.8675
		hillsFraction   0.772603
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239196
		craterFreq      0.653977
		craterDensity   0.794193
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.494351
		volcanoTemp     1646.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.202, 0.200, 0.199, 0.000)
		colorShelf     (0.215, 0.213, 0.211, 0.000)
		colorBeach     (0.227, 0.225, 0.223, 0.000)
		colorDesert    (0.240, 0.238, 0.236, 0.000)
		colorLowland   (0.253, 0.250, 0.248, 0.000)
		colorUpland    (0.265, 0.263, 0.261, 0.000)
		colorRock      (0.278, 0.275, 0.273, 0.000)
		colorSnow      (0.290, 0.288, 0.285, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000678281
		Period          0.00124662
		Eccentricity    7.30949e-005
		Inclination     -0.0147721
		AscendingNode   -141.114
		ArgOfPericenter 150.783
		MeanAnomaly     -140.883
	}
}

Moon	"Dellalt System 10.1"
{
	ParentBody     "Dellalt System 10"
	Class	       "Desert"

	Mass            0.036174
	Radius          2858.87
	InertiaMoment   0.352822

	Oblateness      0.0135644

	Obliquity       1.30036
	EqAscendNode    37.1102
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.771 0.712 0.675)

	Surface
	{
		SurfStyle       0.890668
		OceanStyle      0.178872
		Randomize      (0.555, 0.220, -0.285)
		colorDistMagn   0.0704183
		colorDistFreq   360.29
		detailScale     7353.18
		colorConversion true
		seaLevel        0.19403
		snowLevel       2
		tropicLatitude  0.0430184
		icecapLatitude  10
		icecapHeight    0.161942
		climatePole     0.4375
		climateTropic   0.467313
		climateEquator  0.6875
		heightTempGrad  0.470187
		tropicWidth     0.234893
		mainFreq        0.848586
		venusFreq       0.280478
		venusMagn       0.374748
		mareFreq        1.74536
		mareDensity     0.00659472
		terraceProb     0.575212
		erosion         0
		montesMagn      0.215205
		montesFreq      144.101
		montesSpiky     0.987715
		montesFraction  0.0733439
		dunesMagn       0.0447594
		dunesFreq       25.7732
		dunesFraction   0.0761433
		hillsMagn       0.124889
		hillsFreq       286.813
		hillsFraction   0
		hills2Fraction  0
		riversMagn      67.4916
		riversFreq      2.60801
		riversSin       5.96719
		riversOctaves   0
		canyonsMagn     0.0292833
		canyonsFreq     77.6125
		canyonFraction  0
		cracksMagn      0.125716
		cracksFreq      0.256199
		cracksOctaves   0
		craterMagn      0.603337
		craterFreq      8.97303
		craterDensity   0.322865
		craterOctaves   4.29904
		volcanoMagn     0.636403
		volcanoFreq     0.684498
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.786087
		volcanoRadius   0.537881
		volcanoTemp     1624.81
		lavaCoverTidal  0.519926
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
		Hapke           0.866953
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
		Height          142.944
		Density         0.0133047
		Pressure        0.00955058
		Greenhouse      0.246549
		Bright          6.68037
		Opacity         1
		SkyLight        2.22679
		Hue             -0.0017611
		Saturation      1

		Composition
		{
			CO2   	92.0508
			SO2   	7.85727
			C3H8  	0.0892864
			Ar    	0.00263473
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000999086
		Period          0.00222796
		Eccentricity    0.023353
		Inclination     1.30036
		AscendingNode   37.1102
		ArgOfPericenter 107.44
		MeanAnomaly     60.3714
	}
}

Moon	"Dellalt System 10.2"
{
	ParentBody     "Dellalt System 10"
	Class	       "Selena"

	Mass            0.0458441
	Radius          2903.17
	InertiaMoment   0.346761

	Oblateness      0.00127233

	Obliquity       0.0614313
	EqAscendNode    -168.211
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.512 0.507 0.504)

	Surface
	{
		SurfStyle       0.124001
		OceanStyle      0.751409
		Randomize      (-0.444, 0.896, -0.878)
		colorDistMagn   0.0840106
		colorDistFreq   354.295
		detailScale     7467.11
		colorConversion true
		drivenDarkening 0
		seaLevel        0.154766
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  0.988752
		icecapHeight    0.155683
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.87213
		venusFreq       0.759569
		venusMagn       0
		mareFreq        1.71759
		mareDensity     0.00780048
		terraceProb     0.39585
		erosion         0
		montesMagn      0.200041
		montesFreq      123.675
		montesSpiky     0.885857
		montesFraction  0.99128
		dunesMagn       0.0325609
		dunesFreq       3835.1
		dunesFraction   0.112161
		hillsMagn       0.111055
		hillsFreq       334.335
		hillsFraction   0.408816
		hills2Fraction  0
		riversMagn      54.502
		riversFreq      4.38569
		riversSin       6.32334
		riversOctaves   0
		canyonsMagn     0.60018
		canyonsFreq     1.14172
		canyonFraction  0.84307
		cracksMagn      0.039378
		cracksFreq      1.9077
		cracksOctaves   0
		craterMagn      0.556107
		craterFreq      8.02936
		craterDensity   0.669243
		craterOctaves   8.9453
		craterRayedFactor 0.0784337
		volcanoMagn     0.571733
		volcanoFreq     0.610429
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.450567
		volcanoRadius   0.549736
		volcanoTemp     1236.13
		lavaCoverTidal  0.282843
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.320, 0.320, 0.000)
		colorShelf     (0.370, 0.370, 0.370, 0.000)
		colorBeach     (0.256, 0.253, 0.252, 0.000)
		colorDesert    (0.317, 0.304, 0.287, 0.200)
		colorLowland   (0.343, 0.324, 0.322, 0.500)
		colorUpland    (0.358, 0.340, 0.332, 0.800)
		colorRock      (0.650, 0.610, 0.620, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.993145
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
		Height          162.33
		Density         0.000685499
		Pressure        0.00017199
		Greenhouse      0.048378
		Bright          3.69149
		Opacity         0
		SkyLight        1.2305
		Hue             0.00599029
		Saturation      1

		Composition
		{
			CO2   	98.8546
			Ar    	0.764741
			C2H6  	0.268211
			N2    	0.0733546
			Kr    	0.0272178
			H2S   	0.0105665
			Xe    	0.000941616
			C2H4  	0.000355362
			CO    	1.91677e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00204816
		Period          0.00653911
		Eccentricity    0.0306361
		Inclination     0.0614313
		AscendingNode   -168.211
		ArgOfPericenter -94.297
		MeanAnomaly     -157.036
	}
}

Moon	"Dellalt System 10.3"
{
	ParentBody     "Dellalt System 10"
	Class	       "Desert"

	Mass            0.597731
	Radius          6958.51
	InertiaMoment   0.330005

	Obliquity       0.882262
	EqAscendNode    -64.4886
	TidalLocked     true

	AlbedoBond      0.263286
	AlbedoGeom      0.315943
	Brightness      2
	Color          (0.755 0.682 0.633)

	Surface
	{
		SurfStyle       0.458278
		OceanStyle      0.0102002
		Randomize      (-0.293, 0.883, -0.484)
		colorDistMagn   0.0831057
		colorDistFreq   794.83
		detailScale     17897.7
		colorConversion true
		seaLevel        0.037066
		snowLevel       2
		tropicLatitude  0.0260443
		icecapLatitude  0.932988
		icecapHeight    0.0430464
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.13724
		venusFreq       0.246837
		venusMagn       0.508205
		mareFreq        2.06214
		mareDensity     0.0508313
		terraceProb     0.209873
		erosion         0
		montesMagn      0.191042
		montesFreq      343.758
		montesSpiky     0.98823
		montesFraction  0.445213
		dunesMagn       0.0494122
		dunesFreq       46.0514
		dunesFraction   0.224662
		hillsMagn       0.15057
		hillsFreq       664.516
		hillsFraction   0
		hills2Fraction  0
		riversMagn      63.7947
		riversFreq      4.01966
		riversSin       5.04097
		riversOctaves   0
		canyonsMagn     0.0142784
		canyonsFreq     169.448
		canyonFraction  0
		cracksMagn      0.103523
		cracksFreq      0.749416
		cracksOctaves   0
		craterMagn      0.588355
		craterFreq      21.9559
		craterDensity   0.24846
		craterOctaves   3.53965
		volcanoMagn     0.689239
		volcanoFreq     0.67487
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.860443
		volcanoRadius   0.465005
		volcanoTemp     1118.59
		lavaCoverTidal  0.248983
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.87573
		stripeTwist     0.501999
		cycloneMagn     2.10462
		cycloneFreq     0.650292
		cycloneDensity  0.236082
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
		Height          13.1953
		Velocity        82.1412
		BumpHeight      3.19523
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.0137
		mainOctaves     10
		Coverage        0.126572
		stripeZones     1.87573
		stripeTwist     0.501999
	}

	Clouds
	{
		Height          16.3906
		Velocity        55.5005
		BumpHeight      3.19523
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.0137
		mainOctaves     10
		Coverage        0.126572
		stripeZones     1.87573
		stripeTwist     0.501999
	}

	Clouds
	{
		Height          19.5854
		Velocity        166.697
		BumpHeight      3.19523
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.0137
		mainOctaves     10
		Coverage        0.126572
		stripeZones     1.87573
		stripeTwist     0.501999
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Mars"
		Height          34.7925
		Density         0.380743
		Pressure        0.0885632
		Greenhouse      1.9042
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.0137417
		Saturation      1

		Composition
		{
			N2    	99.2127
			Ar    	0.761389
			CO    	0.0256152
			Ne    	0.00031156
		}
	}

	Aurora
	{
		Height      116.151
		NorthLat    61.4029
		NorthLon    -73.2282
		NorthRadius 1798.04
		NorthWidth  345.735
		NorthRings  4
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -43.5676
		SouthLon    93.3887
		SouthRadius 2000.01
		SouthWidth  574.895
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
		SemiMajorAxis   0.00293254
		Period          0.0111574
		Eccentricity    0.0110882
		Inclination     0.882262
		AscendingNode   -64.4886
		ArgOfPericenter 23.1404
		MeanAnomaly     -114.415
	}
}

Moon	"Dellalt System 10.4"
{
	ParentBody     "Dellalt System 10"
	Class	       "IceWorld"

	Mass            2.99344e-005
	Radius          258.054
	InertiaMoment   0.398005

	Obliquity       -0.226329
	EqAscendNode    -110.029
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.679 0.676 0.670)

	Surface
	{
		SurfStyle       0.036904
		OceanStyle      0.825939
		Randomize      (0.438, 0.894, 0.152)
		colorDistMagn   0.0891754
		colorDistFreq   32.5079
		detailScale     663.729
		colorConversion true
		drivenDarkening 0.667991
		seaLevel        0.140704
		snowLevel       2
		tropicLatitude  0.00452812
		icecapLatitude  0.632652
		icecapHeight    0.171352
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.81117
		venusFreq       1.6229
		venusMagn       0.196573
		mareFreq        0
		mareDensity     6.17919e-005
		terraceProb     0.282811
		erosion         0
		montesMagn      0.0731003
		montesFreq      11.0402
		montesSpiky     0.966813
		montesFraction  0.666305
		dunesMagn       0.0454518
		dunesFreq       338.172
		dunesFraction   0.302982
		hillsMagn       0.119619
		hillsFreq       34.2803
		hillsFraction   0.966107
		hills2Fraction  0.277042
		riversMagn      62.1787
		riversFreq      4.02841
		riversSin       5.84062
		riversOctaves   0
		canyonsMagn     0.438515
		canyonsFreq     0.116796
		canyonFraction  0
		cracksMagn      0.070268
		cracksFreq      0.148696
		cracksOctaves   0
		craterMagn      0.936439
		craterFreq      0.608741
		craterDensity   0.97791
		craterOctaves   8
		craterRayedFactor 0.173681
		volcanoMagn     0.192616
		volcanoFreq     0.582018
		volcanoDensity  0.183091
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.0762257
		volcanoRadius   0.160882
		volcanoTemp     1586.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.679, 0.676, 0.670, 0.500)
		colorShelf     (0.645, 0.642, 0.636, 0.500)
		colorBeach     (0.475, 0.473, 0.469, 0.750)
		colorDesert    (0.577, 0.574, 0.569, 1.000)
		colorLowland   (0.597, 0.595, 0.589, 1.000)
		colorUpland    (0.631, 0.628, 0.623, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.597, 0.595, 0.589, 1.000)
		colorUpPlants  (0.631, 0.628, 0.623, 1.000)
		BumpHeight      12.9027
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
		SemiMajorAxis   0.0041988
		Period          0.0192003
		Eccentricity    0.0278792
		Inclination     -0.226329
		AscendingNode   -110.029
		ArgOfPericenter 48.6457
		MeanAnomaly     -109.41
	}
}

DwarfMoon	"Dellalt System 10.D7"
{
	ParentBody     "Dellalt System 10"
	Class	       "Asteroid"

	Mass            3.15193e-011
	Radius          4.90726
	InertiaMoment   0.396749

	RotationPeriod  432.526
	Obliquity       -0.324712
	EqAscendNode    62.9708

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.705 0.701 0.700)

	Surface
	{
		SurfStyle       0.177545
		OceanStyle      0.869546
		Randomize      (-0.703, -0.680, -0.902)
		colorDistMagn   0.621761
		colorDistFreq   0.00932054
		detailScale     134.001
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00966736
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.594718
		terraceProb     0.409234
		erosion         0
		montesMagn      0.533941
		montesFreq      3.39574
		montesSpiky     0.95545
		montesFraction  0.728221
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0621176
		hillsFraction   0.531
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230041
		craterFreq      0.205568
		craterDensity   0.920885
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.521257
		volcanoTemp     1444.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.282, 0.281, 0.280, 0.000)
		colorShelf     (0.300, 0.298, 0.297, 0.000)
		colorBeach     (0.317, 0.316, 0.315, 0.000)
		colorDesert    (0.335, 0.333, 0.332, 0.000)
		colorLowland   (0.353, 0.351, 0.350, 0.000)
		colorUpland    (0.370, 0.368, 0.367, 0.000)
		colorRock      (0.388, 0.386, 0.385, 0.000)
		colorSnow      (0.405, 0.403, 0.402, 1.000)
		BumpHeight      4.41653
		BumpOffset      0.883306
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00601182
		Period          0.032895
		Eccentricity    0.187991
		Inclination     -0.324712
		AscendingNode   62.9708
		ArgOfPericenter 105.027
		MeanAnomaly     35.9618
	}
}

Moon	"Dellalt System 10.5"
{
	ParentBody     "Dellalt System 10"
	Class	       "IceWorld"

	Mass            0.000132289
	Radius          422.994
	InertiaMoment   0.399883

	Obliquity       -0.104893
	EqAscendNode    177.854
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.459 0.452 0.446)

	Surface
	{
		SurfStyle       0.416097
		OceanStyle      0.927584
		Randomize      (-0.626, 0.932, 0.893)
		colorDistMagn   0.0501539
		colorDistFreq   60.6451
		detailScale     1087.96
		colorConversion true
		drivenDarkening 0.325844
		seaLevel        0.237724
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  0.879445
		icecapHeight    0.247983
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.00352
		venusFreq       1.47889
		venusMagn       0
		mareFreq        0
		mareDensity     0.000128512
		terraceProb     0.219497
		erosion         0
		montesMagn      0.0662881
		montesFreq      20.1056
		montesSpiky     0.954825
		montesFraction  0.607196
		dunesMagn       0.0322252
		dunesFreq       554.335
		dunesFraction   0.829997
		hillsMagn       0.133426
		hillsFreq       52.099
		hillsFraction   0.116596
		hills2Fraction  0.229435
		riversMagn      64.3836
		riversFreq      3.00412
		riversSin       4.69973
		riversOctaves   0
		canyonsMagn     0.590344
		canyonsFreq     0.146816
		canyonFraction  0
		cracksMagn      0.0550367
		cracksFreq      0.202813
		cracksOctaves   0
		craterMagn      0.639694
		craterFreq      0.837903
		craterDensity   0.817631
		craterOctaves   9
		craterRayedFactor 0.0984785
		volcanoMagn     0.177503
		volcanoFreq     0.925508
		volcanoDensity  0.221585
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.357058
		volcanoRadius   0.14434
		volcanoTemp     1451.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.459, 0.452, 0.446, 0.500)
		colorShelf     (0.436, 0.429, 0.424, 0.500)
		colorBeach     (0.321, 0.316, 0.312, 0.750)
		colorDesert    (0.390, 0.384, 0.379, 1.000)
		colorLowland   (0.403, 0.397, 0.393, 1.000)
		colorUpland    (0.426, 0.420, 0.415, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.403, 0.397, 0.393, 1.000)
		colorUpPlants  (0.426, 0.420, 0.415, 1.000)
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
		SemiMajorAxis   0.00860769
		Period          0.0563572
		Eccentricity    0.0101104
		Inclination     -0.104893
		AscendingNode   177.854
		ArgOfPericenter 114.755
		MeanAnomaly     -139.65
	}
}

Moon	"Dellalt System 10.6"
{
	ParentBody     "Dellalt System 10"
	Class	       "IceWorld"

	Mass            0.000196875
	Radius          512.826
	InertiaMoment   0.399418

	Obliquity       1.49129
	EqAscendNode    -59.9094
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.727 0.725 0.722)

	Surface
	{
		SurfStyle       0.881793
		OceanStyle      0.934972
		Randomize      (-0.410, 0.180, -0.382)
		colorDistMagn   0.06838
		colorDistFreq   79.3443
		detailScale     1319.02
		colorConversion true
		drivenDarkening 0.227577
		seaLevel        0.256234
		snowLevel       2
		tropicLatitude  0.0450852
		icecapLatitude  0.612247
		icecapHeight    0.288864
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.7558
		venusFreq       1.41014
		venusMagn       0
		mareFreq        0
		mareDensity     0.000157473
		terraceProb     0.11564
		erosion         0
		montesMagn      0.0754665
		montesFreq      18.6091
		montesSpiky     0.813297
		montesFraction  0.585087
		dunesMagn       0.0401429
		dunesFreq       665.692
		dunesFraction   0.527408
		hillsMagn       0.112217
		hillsFreq       52.4777
		hillsFraction   0.764065
		hills2Fraction  0.106387
		riversMagn      57.8801
		riversFreq      3.22212
		riversSin       6.48967
		riversOctaves   0
		canyonsMagn     0.587591
		canyonsFreq     0.274318
		canyonFraction  0
		cracksMagn      0.046352
		cracksFreq      0.189996
		cracksOctaves   0
		craterMagn      0.603754
		craterFreq      1.74582
		craterDensity   0.786009
		craterOctaves   9
		craterRayedFactor 0.205164
		volcanoMagn     0.192272
		volcanoFreq     0.746415
		volcanoDensity  0.221911
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.214101
		volcanoRadius   0.133074
		volcanoTemp     1799.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.727, 0.544, 0.414, 0.000)
		colorShelf     (0.691, 0.516, 0.393, 0.000)
		colorBeach     (0.364, 0.272, 0.207, 0.000)
		colorDesert    (0.618, 0.462, 0.352, 0.000)
		colorLowland   (0.589, 0.478, 0.393, 0.000)
		colorUpland    (0.676, 0.505, 0.385, 0.000)
		colorRock      (1.000, 1.000, 1.000, 0.500)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.589, 0.478, 0.393, 0.000)
		colorUpPlants  (0.676, 0.505, 0.385, 0.000)
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
		SemiMajorAxis   0.0123244
		Period          0.096554
		Eccentricity    0.0177896
		Inclination     1.49129
		AscendingNode   -59.9094
		ArgOfPericenter 12.6406
		MeanAnomaly     62.057
	}
}

Moon	"Dellalt System 10.7"
{
	ParentBody     "Dellalt System 10"
	Class	       "IceWorld"

	Mass            0.00271858
	Radius          1151.83
	InertiaMoment   0.398918

	Obliquity       -0.430864
	EqAscendNode    35.4991
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.642 0.549 0.423)

	Surface
	{
		SurfStyle       0.388096
		OceanStyle      0.458907
		Randomize      (0.075, -0.359, 0.963)
		colorDistMagn   0.0423694
		colorDistFreq   162.46
		detailScale     2962.56
		colorConversion true
		drivenDarkening 0.158946
		seaLevel        0.151331
		snowLevel       2
		tropicLatitude  0.014323
		icecapLatitude  0.707608
		icecapHeight    0.163781
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.99418
		venusFreq       0.922087
		venusMagn       0
		mareFreq        0.376593
		mareDensity     0.00120677
		terraceProb     0.523124
		erosion         0
		montesMagn      0.051134
		montesFreq      65.8071
		montesSpiky     0.858
		montesFraction  0.959837
		dunesMagn       0.051528
		dunesFreq       1526.75
		dunesFraction   0.629964
		hillsMagn       0.122126
		hillsFreq       132.525
		hillsFraction   0.688538
		hills2Fraction  0.0719179
		riversMagn      57.4544
		riversFreq      3.36509
		riversSin       5.46457
		riversOctaves   0
		canyonsMagn     0.47122
		canyonsFreq     0.368606
		canyonFraction  0
		cracksMagn      0.040358
		cracksFreq      0.589801
		cracksOctaves   0
		craterMagn      0.648085
		craterFreq      3.26143
		craterDensity   0.750706
		craterOctaves   10
		craterRayedFactor 0.0982988
		volcanoMagn     0.170203
		volcanoFreq     0.602181
		volcanoDensity  0.229336
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.159333
		volcanoRadius   0.125783
		volcanoTemp     1461.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.642, 0.549, 0.423, 0.500)
		colorShelf     (0.610, 0.521, 0.402, 0.500)
		colorBeach     (0.449, 0.384, 0.296, 0.750)
		colorDesert    (0.546, 0.466, 0.359, 1.000)
		colorLowland   (0.565, 0.483, 0.372, 1.000)
		colorUpland    (0.597, 0.510, 0.393, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.565, 0.483, 0.372, 1.000)
		colorUpPlants  (0.597, 0.510, 0.393, 1.000)
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
		SemiMajorAxis   0.0176461
		Period          0.165418
		Eccentricity    0.000833372
		Inclination     -0.430864
		AscendingNode   35.4991
		ArgOfPericenter -128.777
		MeanAnomaly     -149.697
	}
}

DwarfMoon	"Dellalt System 10.D8"
{
	ParentBody     "Dellalt System 10"
	Class	       "Asteroid"

	Mass            2.46619e-010
	Radius          9.91742
	InertiaMoment   0.398663

	RotationPeriod  1567.57
	Obliquity       -68.5419
	EqAscendNode    -61.5779

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.589 0.497 0.331)

	Surface
	{
		SurfStyle       0.897424
		OceanStyle      0.659255
		Randomize      (-0.501, -0.879, 0.808)
		colorDistMagn   0.140999
		colorDistFreq   0.0576341
		detailScale     270.812
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998791
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.743483
		terraceProb     0.33225
		erosion         0
		montesMagn      0.503968
		montesFreq      3.15125
		montesSpiky     0.889666
		montesFraction  0.478175
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.225022
		hillsFraction   0.558089
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250551
		craterFreq      0.214986
		craterDensity   0.993464
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.536275
		volcanoTemp     1386.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.200, 0.174, 0.133, 0.050)
		colorShelf     (0.235, 0.204, 0.152, 0.040)
		colorBeach     (0.271, 0.233, 0.172, 0.030)
		colorDesert    (0.306, 0.263, 0.196, 0.020)
		colorLowland   (0.341, 0.293, 0.215, 0.030)
		colorUpland    (0.377, 0.323, 0.235, 0.050)
		colorRock      (0.412, 0.353, 0.262, 0.020)
		colorSnow      (0.412, 0.353, 0.262, 1.000)
		BumpHeight      8.92568
		BumpOffset      1.78514
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0990976
		Period          2.20148
		Eccentricity    0.349346
		Inclination     -36.1218
		AscendingNode   -63.3206
		ArgOfPericenter -21.325
		MeanAnomaly     19.4239
	}
}

DwarfMoon	"Dellalt System 10.D9"
{
	ParentBody     "Dellalt System 10"
	Class	       "Asteroid"

	Mass            3.76288e-010
	Radius          10.5735
	InertiaMoment   0.399632

	RotationPeriod  1364.65
	Obliquity       114.482
	EqAscendNode    97.1793

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.493 0.485 0.479)

	Surface
	{
		SurfStyle       0.534654
		OceanStyle      0.416912
		Randomize      (-0.612, -0.428, -0.621)
		colorDistMagn   0.568902
		colorDistFreq   0.00735995
		detailScale     288.727
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997404
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.326576
		terraceProb     0.187559
		erosion         0
		montesMagn      0.497144
		montesFreq      3.44022
		montesSpiky     0.826049
		montesFraction  0.735898
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.287348
		hillsFraction   0.735443
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247315
		craterFreq      0.200213
		craterDensity   0.869126
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.578902
		volcanoTemp     1710.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.192, 0.165, 0.134, 0.000)
		colorShelf     (0.197, 0.170, 0.153, 0.000)
		colorBeach     (0.232, 0.199, 0.182, 0.000)
		colorDesert    (0.251, 0.213, 0.177, 0.000)
		colorLowland   (0.276, 0.228, 0.201, 0.000)
		colorUpland    (0.306, 0.276, 0.244, 0.000)
		colorRock      (0.330, 0.300, 0.264, 0.000)
		colorSnow      (0.360, 0.320, 0.278, 1.000)
		BumpHeight      9.51614
		BumpOffset      1.90323
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0993449
		Period          2.20973
		Eccentricity    0.00111548
		Inclination     77.6287
		AscendingNode   100.421
		ArgOfPericenter -30.8823
		MeanAnomaly     -119.814
	}
}

DwarfMoon	"Dellalt System 10.D10"
{
	ParentBody     "Dellalt System 10"
	Class	       "Asteroid"

	Mass            5.6129e-010
	Radius          11.5759
	InertiaMoment   0.397458

	RotationPeriod  1224.98
	Obliquity       -93.956
	EqAscendNode    77.2366

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.749 0.642 0.548)

	Surface
	{
		SurfStyle       0.468842
		OceanStyle      0.599439
		Randomize      (0.511, -0.035, 0.261)
		colorDistMagn   0.32554
		colorDistFreq   0.0940728
		detailScale     316.099
		colorConversion true
		snowLevel       2
		tropicLatitude  0.988578
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.632549
		terraceProb     0.415144
		erosion         0
		montesMagn      0.529646
		montesFreq      2.0455
		montesSpiky     0.865473
		montesFraction  0.671657
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.198822
		hillsFraction   0.741434
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.272833
		craterFreq      0.264455
		craterDensity   0.905891
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.426127
		volcanoTemp     1576.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.300, 0.257, 0.219, 0.000)
		colorShelf     (0.318, 0.273, 0.233, 0.000)
		colorBeach     (0.337, 0.289, 0.247, 0.000)
		colorDesert    (0.356, 0.305, 0.260, 0.000)
		colorLowland   (0.375, 0.321, 0.274, 0.000)
		colorUpland    (0.393, 0.337, 0.288, 0.000)
		colorRock      (0.412, 0.353, 0.301, 0.000)
		colorSnow      (0.431, 0.369, 0.315, 1.000)
		BumpHeight      10.4183
		BumpOffset      2.08366
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0998827
		Period          2.2277
		Eccentricity    0.271517
		Inclination     -49.1297
		AscendingNode   81.956
		ArgOfPericenter 42.7745
		MeanAnomaly     -162.234
	}
}

DwarfMoon	"Dellalt System 10.D11"
{
	ParentBody     "Dellalt System 10"
	Class	       "Asteroid"

	Mass            8.21842e-010
	Radius          12.6
	InertiaMoment   0.398816

	RotationPeriod  1107.46
	Obliquity       -36.1764
	EqAscendNode    -181.353

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.765 0.761 0.759)

	Surface
	{
		SurfStyle       0.771206
		OceanStyle      0.588225
		Randomize      (0.564, 0.288, -0.603)
		colorDistMagn   0.777543
		colorDistFreq   0.112004
		detailScale     344.065
		colorConversion true
		snowLevel       2
		tropicLatitude  0.508994
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.497202
		terraceProb     0.534106
		erosion         0
		montesMagn      0.477544
		montesFreq      2.95486
		montesSpiky     0.961926
		montesFraction  0.686589
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.302506
		hillsFraction   0.688684
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.280175
		craterFreq      0.17981
		craterDensity   0.877394
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.502029
		volcanoTemp     1388.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.299, 0.259, 0.213, 0.000)
		colorShelf     (0.306, 0.266, 0.243, 0.000)
		colorBeach     (0.360, 0.312, 0.289, 0.000)
		colorDesert    (0.390, 0.335, 0.281, 0.000)
		colorLowland   (0.429, 0.358, 0.319, 0.000)
		colorUpland    (0.475, 0.434, 0.387, 0.000)
		colorRock      (0.513, 0.472, 0.418, 0.000)
		colorSnow      (0.559, 0.502, 0.440, 1.000)
		BumpHeight      11.34
		BumpOffset      2.26801
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.100531
		Period          2.24943
		Eccentricity    0.341547
		Inclination     -66.0221
		AscendingNode   -171.028
		ArgOfPericenter -167.97
		MeanAnomaly     -12.0129
	}
}

DwarfMoon	"Dellalt System 10.D12"
{
	ParentBody     "Dellalt System 10"
	Class	       "Asteroid"

	Mass            1.18497e-009
	Radius          17.1854
	InertiaMoment   0.399758

	RotationPeriod  1250.14
	Obliquity       9.63076
	EqAscendNode    -3.4131

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.514 0.506 0.500)

	Surface
	{
		SurfStyle       0.964838
		OceanStyle      0.610824
		Randomize      (-0.572, 0.578, -0.235)
		colorDistMagn   0.717596
		colorDistFreq   0.145019
		detailScale     469.276
		colorConversion true
		snowLevel       2
		tropicLatitude  0.358469
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.596643
		terraceProb     0.367454
		erosion         0
		montesMagn      0.243568
		montesFreq      3.87719
		montesSpiky     0.932462
		montesFraction  0.180303
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.578153
		hillsFraction   0.600572
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218688
		craterFreq      0.143019
		craterDensity   0.973813
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.537444
		volcanoTemp     1304.14
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.175, 0.177, 0.200, 0.050)
		colorShelf     (0.205, 0.208, 0.230, 0.040)
		colorBeach     (0.236, 0.238, 0.260, 0.030)
		colorDesert    (0.267, 0.268, 0.295, 0.020)
		colorLowland   (0.298, 0.299, 0.325, 0.030)
		colorUpland    (0.329, 0.329, 0.355, 0.050)
		colorRock      (0.360, 0.359, 0.395, 0.020)
		colorSnow      (0.360, 0.359, 0.395, 1.000)
		BumpHeight      15.4669
		BumpOffset      3.09337
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.100976
		Period          2.26439
		Eccentricity    0.496604
		Inclination     -30.6369
		AscendingNode   0.123623
		ArgOfPericenter 30.5697
		MeanAnomaly     -61.9771
	}
}

DwarfMoon	"Dellalt System 10.D13"
{
	ParentBody     "Dellalt System 10"
	Class	       "Asteroid"

	Mass            1.68677e-009
	Radius          17.5608
	InertiaMoment   0.397717

	RotationPeriod  1075.73
	Obliquity       105.453
	EqAscendNode    -120.814

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.674 0.543 0.423)

	Surface
	{
		SurfStyle       0.266791
		OceanStyle      0.239266
		Randomize      (-0.144, 0.349, -0.251)
		colorDistMagn   0.647707
		colorDistFreq   0.061849
		detailScale     479.527
		colorConversion true
		snowLevel       2
		tropicLatitude  0.858258
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.348902
		terraceProb     0.13489
		erosion         0
		montesMagn      0.568028
		montesFreq      3.15942
		montesSpiky     0.894623
		montesFraction  0.429126
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.857711
		hillsFraction   0.86318
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261064
		craterFreq      0.237812
		craterDensity   0.928172
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.479107
		volcanoTemp     1568.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.270, 0.217, 0.169, 0.000)
		colorShelf     (0.287, 0.231, 0.180, 0.000)
		colorBeach     (0.303, 0.244, 0.190, 0.000)
		colorDesert    (0.320, 0.258, 0.201, 0.000)
		colorLowland   (0.337, 0.271, 0.212, 0.000)
		colorUpland    (0.354, 0.285, 0.222, 0.000)
		colorRock      (0.371, 0.298, 0.233, 0.000)
		colorSnow      (0.388, 0.312, 0.243, 1.000)
		BumpHeight      15.8047
		BumpOffset      3.16094
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.101206
		Period          2.27213
		Eccentricity    0.467306
		Inclination     85.0444
		AscendingNode   -123.948
		ArgOfPericenter -4.9788
		MeanAnomaly     89.6002
	}
}

DwarfMoon	"Dellalt System 10.D14"
{
	ParentBody     "Dellalt System 10"
	Class	       "Asteroid"

	Mass            2.37551e-009
	Radius          18.8302
	InertiaMoment   0.398961

	RotationPeriod  977.399
	Obliquity       -68.9811
	EqAscendNode    60.4563

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.726 0.724 0.723)

	Surface
	{
		SurfStyle       0.309695
		OceanStyle      0.941746
		Randomize      (-0.552, -0.422, 0.387)
		colorDistMagn   0.445748
		colorDistFreq   0.143199
		detailScale     514.189
		colorConversion true
		snowLevel       2
		tropicLatitude  0.99846
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.470547
		terraceProb     0.208561
		erosion         0
		montesMagn      0.526581
		montesFreq      2.84039
		montesSpiky     0.970199
		montesFraction  0.598561
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.784087
		hillsFraction   0.518074
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24071
		craterFreq      0.19149
		craterDensity   0.787617
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.499009
		volcanoTemp     1487.25
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.290, 0.290, 0.289, 0.000)
		colorShelf     (0.309, 0.308, 0.307, 0.000)
		colorBeach     (0.327, 0.326, 0.325, 0.000)
		colorDesert    (0.345, 0.344, 0.343, 0.000)
		colorLowland   (0.363, 0.362, 0.361, 0.000)
		colorUpland    (0.381, 0.380, 0.379, 0.000)
		colorRock      (0.399, 0.398, 0.398, 0.000)
		colorSnow      (0.417, 0.416, 0.416, 1.000)
		BumpHeight      16.9471
		BumpOffset      3.38943
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.101415
		Period          2.27916
		Eccentricity    0.176563
		Inclination     -34.4227
		AscendingNode   62.8992
		ArgOfPericenter -40.9053
		MeanAnomaly     64.7021
	}
}

DwarfMoon	"Dellalt System 10.D15"
{
	ParentBody     "Dellalt System 10"
	Class	       "Asteroid"

	Mass            3.31574e-009
	Radius          20.1954
	InertiaMoment   0.399883

	RotationPeriod  891.394
	Obliquity       34.7515
	EqAscendNode    -87.092

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.743 0.740 0.735)

	Surface
	{
		SurfStyle       0.3279
		OceanStyle      0.388149
		Randomize      (-0.206, 0.033, -0.697)
		colorDistMagn   0.950619
		colorDistFreq   0.295906
		detailScale     551.468
		colorConversion true
		snowLevel       2
		tropicLatitude  0.651609
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.536355
		terraceProb     0.456244
		erosion         0
		montesMagn      0.676181
		montesFreq      3.45246
		montesSpiky     0.802946
		montesFraction  0.672575
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.02235
		hillsFraction   0.823346
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236198
		craterFreq      0.188262
		craterDensity   0.929757
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.46118
		volcanoTemp     1675.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.297, 0.296, 0.294, 0.000)
		colorShelf     (0.316, 0.314, 0.312, 0.000)
		colorBeach     (0.334, 0.333, 0.331, 0.000)
		colorDesert    (0.353, 0.351, 0.349, 0.000)
		colorLowland   (0.371, 0.370, 0.368, 0.000)
		colorUpland    (0.390, 0.388, 0.386, 0.000)
		colorRock      (0.409, 0.407, 0.404, 0.000)
		colorSnow      (0.427, 0.425, 0.423, 1.000)
		BumpHeight      18.1758
		BumpOffset      3.63517
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.101638
		Period          2.28666
		Eccentricity    0.392896
		Inclination     23.7898
		AscendingNode   -91.6787
		ArgOfPericenter -59.7767
		MeanAnomaly     33.7711
	}
}

Barycenter	"Dellalt System 11-11.1"
{
	ParentBody     "Dellalt System"
	Mass            0.509878
	Radius          14990.7
	RotationPeriod  24
	Obliquity       0
	EqAscendNode    0


	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   24.0607
		Period          141.241
		Eccentricity    0.0583566
		Inclination     -0.700161
		AscendingNode   2.42824
		ArgOfPericenter 65.2844
		MeanAnomaly     165.496
	}
}

Planet	"Dellalt System 11"
{
	ParentBody     "Dellalt System 11-11.1"
	Class	       "IceWorld"

	Mass            0.299419
	Radius          5616.54
	InertiaMoment   0.329601

	Oblateness      0.00638425

	RotationPeriod  26.1083
	Obliquity       -8.97828
	EqAscendNode    38.1177

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.859 0.752 0.707)

	Surface
	{
		SurfStyle       0.86091
		OceanStyle      0.908222
		Randomize      (0.972, -0.967, -0.296)
		colorDistMagn   0.0464319
		colorDistFreq   781.338
		detailScale     14446.1
		colorConversion true
		drivenDarkening 0
		seaLevel        0.32595
		snowLevel       2
		tropicLatitude  0.141749
		icecapLatitude  0.780952
		icecapHeight    0.335757
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.08595
		venusFreq       0.72096
		venusMagn       0
		mareFreq        1.31451
		mareDensity     0.0232181
		terraceProb     0.248059
		erosion         0
		montesMagn      0.167398
		montesFreq      235.543
		montesSpiky     0.99174
		montesFraction  0.377336
		dunesMagn       0.0515285
		dunesFreq       7437.53
		dunesFraction   0.729961
		hillsMagn       0.116857
		hillsFreq       620.837
		hillsFraction   0.00401622
		hills2Fraction  0.102311
		riversMagn      65.235
		riversFreq      2.56883
		riversSin       6.58014
		riversOctaves   0
		canyonsMagn     0.419444
		canyonsFreq     2.45624
		canyonFraction  0
		cracksMagn      0.0412316
		cracksFreq      2.1046
		cracksOctaves   4
		craterMagn      0.584361
		craterFreq      17.2186
		craterDensity   0.984398
		craterOctaves   13
		craterRayedFactor 0.10267
		volcanoMagn     0.596996
		volcanoFreq     0.723168
		volcanoDensity  0.252501
		volcanoOctaves  3
		volcanoActivity 0.254863
		volcanoFlows    0.141915
		volcanoRadius   0.53093
		volcanoTemp     1602.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.859, 0.564, 0.406, 0.000)
		colorShelf     (0.816, 0.536, 0.385, 0.000)
		colorBeach     (0.429, 0.282, 0.203, 0.000)
		colorDesert    (0.730, 0.480, 0.345, 0.000)
		colorLowland   (0.696, 0.496, 0.385, 0.000)
		colorUpland    (0.799, 0.524, 0.377, 0.000)
		colorRock      (1.000, 1.000, 1.000, 0.500)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.696, 0.496, 0.385, 0.000)
		colorUpPlants  (0.799, 0.524, 0.377, 0.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.999923
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
		Height          59.6129
		Density         7.75148e-006
		Pressure        1.02979e-006
		Greenhouse      0.00986476
		Bright          1.50618
		Opacity         0
		SkyLight        0.50206
		Hue             0.00553935
		Saturation      1

		Composition
		{
			Ne    	58.4843
			N2    	41.5102
			Ar    	0.00423516
			CO    	0.00132666
		}
	}

	Aurora
	{
		Height      85.8605
		NorthLat    79.0992
		NorthLon    -178.718
		NorthRadius 1599.11
		NorthWidth  585.934
		NorthRings  3
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -90
		SouthLon    -2.539
		SouthRadius 1181.88
		SouthWidth  347.3
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
		SemiMajorAxis   0.00141051
		Period          0.161793
		Eccentricity    0.00129363
		Inclination     -0.853741
		AscendingNode   166.898
		ArgOfPericenter 128.909
		MeanAnomaly     83.2187
	}
}

Moon	"Dellalt System 11.1"
{
	ParentBody     "Dellalt System 11-11.1"
	Class	       "IceWorld"

	Mass            0.210459
	Radius          4724.03
	InertiaMoment   0.32757

	Obliquity       -0.853741
	EqAscendNode    166.898
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.724 0.621 0.563)

	Surface
	{
		SurfStyle       0.0541423
		OceanStyle      0.500361
		Randomize      (0.924, 0.275, -0.513)
		colorDistMagn   0.04685
		colorDistFreq   549.873
		detailScale     12150.5
		colorConversion true
		drivenDarkening 0
		seaLevel        0.168191
		snowLevel       2
		tropicLatitude  0.00340048
		icecapLatitude  0.818366
		icecapHeight    0.180728
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.59312
		venusFreq       1.04423
		venusMagn       0
		mareFreq        1.66781
		mareDensity     0.0250037
		terraceProb     0.307038
		erosion         0
		montesMagn      0.209353
		montesFreq      249.968
		montesSpiky     0.960432
		montesFraction  0.557745
		dunesMagn       0.059382
		dunesFreq       6289.48
		dunesFraction   0.480087
		hillsMagn       0.148952
		hillsFreq       554.202
		hillsFraction   0.390311
		hills2Fraction  0.285066
		riversMagn      55.0187
		riversFreq      4.01345
		riversSin       4.71115
		riversOctaves   0
		canyonsMagn     0.429825
		canyonsFreq     1.16062
		canyonFraction  0
		cracksMagn      0.0649779
		cracksFreq      1.73176
		cracksOctaves   5
		craterMagn      0.573085
		craterFreq      10.3584
		craterDensity   0.703973
		craterOctaves   13
		craterRayedFactor 0.0912772
		volcanoMagn     0.561121
		volcanoFreq     0.611756
		volcanoDensity  0.244737
		volcanoOctaves  3
		volcanoActivity 0.193747
		volcanoFlows    0.161087
		volcanoRadius   0.539488
		volcanoTemp     1774.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.724, 0.621, 0.563, 0.500)
		colorShelf     (0.688, 0.590, 0.535, 0.500)
		colorBeach     (0.507, 0.435, 0.394, 0.750)
		colorDesert    (0.616, 0.528, 0.479, 1.000)
		colorLowland   (0.637, 0.547, 0.495, 1.000)
		colorUpland    (0.674, 0.578, 0.524, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.637, 0.547, 0.495, 1.000)
		colorUpPlants  (0.674, 0.578, 0.524, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.999892
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
		Height          55.022
		Density         1.08168e-005
		Pressure        1.21634e-006
		Greenhouse      0.0104505
		Bright          1.60998
		Opacity         0
		SkyLight        0.536659
		Hue             -0.00245312
		Saturation      1

		Composition
		{
			N2    	92.7389
			Ne    	7.26084
			Ar    	0.000148834
			CO    	0.000140228
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00200673
		Period          0.161793
		Eccentricity    0.00129363
		Inclination     -0.853741
		AscendingNode   166.898
		ArgOfPericenter -51.0914
		MeanAnomaly     83.2187
	}
}

Comet	"Dellalt System C1"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            3.58944e-011
	Radius          4.76743
	InertiaMoment   0.398544

	Oblateness      0.00989855

	RotationPeriod  53.8258
	Obliquity       320.844
	EqAscendNode    230.837

	AbsMagn         8.57358
	SlopeParam      5.09166
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.686 0.684 0.683)

	Surface
	{
		SurfStyle       0.957653
		OceanStyle      0.24054
		Randomize      (-0.156, 0.747, 0.397)
		colorDistMagn   0.341863
		colorDistFreq   0.00690268
		detailScale     130.183
		colorConversion true
		snowLevel       2
		tropicLatitude  0.848392
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.691402
		terraceProb     0.181357
		erosion         0
		montesMagn      0.551824
		montesFreq      2.40196
		montesSpiky     0.95378
		montesFraction  0.675047
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0658523
		hillsFraction   0.75814
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2256
		craterFreq      0.184004
		craterDensity   0.782034
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.510608
		volcanoTemp     1227.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.233, 0.239, 0.273, 0.050)
		colorShelf     (0.274, 0.280, 0.314, 0.040)
		colorBeach     (0.315, 0.321, 0.355, 0.030)
		colorDesert    (0.357, 0.362, 0.403, 0.020)
		colorLowland   (0.398, 0.403, 0.444, 0.030)
		colorUpland    (0.439, 0.444, 0.485, 0.050)
		colorRock      (0.480, 0.485, 0.539, 0.020)
		colorSnow      (0.480, 0.485, 0.539, 1.000)
		BumpHeight      4.29069
		BumpOffset      0.858137
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.573684
		GasToDust   0.25
		Particles   2138
		GasBright   0.121157
		DustBright  0.180942
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   16.6386
		Period          81.2226
		Eccentricity    0.951781
		Inclination     19.116
		AscendingNode   169.479
		ArgOfPericenter -144.441
		MeanAnomaly     -21.4597
	}
}

Comet	"Dellalt System C2"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            2.77617e-007
	Radius          85.9225
	InertiaMoment   0.396084

	Oblateness      0.00795416

	RotationPeriod  51.9995
	Obliquity       274.05
	EqAscendNode    215.414

	AbsMagn         4.90124
	SlopeParam      5.82681
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.806 0.751 0.673)

	Surface
	{
		SurfStyle       0.439819
		OceanStyle      0.492191
		Randomize      (-0.739, -0.380, -0.371)
		colorDistMagn   0.505426
		colorDistFreq   1.83359
		detailScale     2346.26
		colorConversion true
		snowLevel       2
		tropicLatitude  0.993987
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.483987
		terraceProb     0.159305
		erosion         0
		montesMagn      0.401735
		montesFreq      3.20876
		montesSpiky     0.880571
		montesFraction  0.492514
		dunesFraction   0
		hillsMagn       0
		hillsFreq       12.7196
		hillsFraction   0.666155
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237278
		craterFreq      0.223009
		craterDensity   0.877726
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.376472
		volcanoTemp     1623.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.322, 0.301, 0.269, 0.000)
		colorShelf     (0.342, 0.319, 0.286, 0.000)
		colorBeach     (0.363, 0.338, 0.303, 0.000)
		colorDesert    (0.383, 0.357, 0.320, 0.000)
		colorLowland   (0.403, 0.376, 0.337, 0.000)
		colorUpland    (0.423, 0.394, 0.353, 0.000)
		colorRock      (0.443, 0.413, 0.370, 0.000)
		colorSnow      (0.463, 0.432, 0.387, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.361904
		DustBright  0.424681
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   11.7391
		Period          48.1344
		Eccentricity    0.921208
		Inclination     101.415
		AscendingNode   95.6062
		ArgOfPericenter -127.271
		MeanAnomaly     167.886
	}
}

Comet	"Dellalt System C3"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            8.54803e-015
	Radius          0.295284
	InertiaMoment   0.399047

	Oblateness      0.0113835

	RotationPeriod  50.1835
	Obliquity       227.256
	EqAscendNode    199.992

	AbsMagn         12.5811
	SlopeParam      6.97505
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.528 0.521 0.515)

	Surface
	{
		SurfStyle       0.212435
		OceanStyle      0.517427
		Randomize      (-0.864, -0.730, -0.295)
		colorDistMagn   0.359915
		colorDistFreq   5.35978e-005
		detailScale     8.06323
		colorConversion true
		snowLevel       2
		tropicLatitude  0.274021
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.597747
		terraceProb     0.10781
		erosion         0
		montesMagn      0.300454
		montesFreq      2.98993
		montesSpiky     0.962896
		montesFraction  0.711154
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000187395
		hillsFraction   0.53764
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228416
		craterFreq      0.232328
		craterDensity   0.9764
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.501202
		volcanoTemp     1499.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.211, 0.208, 0.206, 0.000)
		colorShelf     (0.224, 0.222, 0.219, 0.000)
		colorBeach     (0.237, 0.235, 0.232, 0.000)
		colorDesert    (0.251, 0.248, 0.245, 0.000)
		colorLowland   (0.264, 0.261, 0.257, 0.000)
		colorUpland    (0.277, 0.274, 0.270, 0.000)
		colorRock      (0.290, 0.287, 0.283, 0.000)
		colorSnow      (0.303, 0.300, 0.296, 1.000)
		BumpHeight      0.265756
		BumpOffset      0.0531511
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.125318
		GasToDust   0.25
		Particles   1232
		GasBright   0.00901661
		DustBright  0.462055
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   18.762
		Period          97.2569
		Eccentricity    0.970829
		Inclination     -122.931
		AscendingNode   164.079
		ArgOfPericenter 155.366
		MeanAnomaly     -38.6898
	}
}

Comet	"Dellalt System C4"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            6.61129e-011
	Radius          5.31947
	InertiaMoment   0.397532

	Oblateness      0.00920855

	RotationPeriod  48.373
	Obliquity       180.461
	EqAscendNode    184.569

	AbsMagn         8.36348
	SlopeParam      2.33309
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.647 0.640 0.636)

	Surface
	{
		SurfStyle       0.784661
		OceanStyle      0.334566
		Randomize      (0.724, 0.160, -0.406)
		colorDistMagn   0.633711
		colorDistFreq   0.0100216
		detailScale     145.257
		colorConversion true
		snowLevel       2
		tropicLatitude  0.128493
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.277179
		terraceProb     0.36894
		erosion         0
		montesMagn      0.638802
		montesFreq      3.89651
		montesSpiky     0.900232
		montesFraction  0.597319
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0532886
		hillsFraction   0.722374
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236393
		craterFreq      0.239319
		craterDensity   0.963906
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.488321
		volcanoTemp     1147.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.252, 0.218, 0.178, 0.000)
		colorShelf     (0.259, 0.224, 0.204, 0.000)
		colorBeach     (0.304, 0.262, 0.242, 0.000)
		colorDesert    (0.330, 0.282, 0.235, 0.000)
		colorLowland   (0.362, 0.301, 0.267, 0.000)
		colorUpland    (0.401, 0.365, 0.325, 0.000)
		colorRock      (0.433, 0.397, 0.350, 0.000)
		colorSnow      (0.472, 0.422, 0.369, 1.000)
		BumpHeight      4.78753
		BumpOffset      0.957505
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.60651
		GasToDust   0.25
		Particles   2205
		GasBright   0.0747112
		DustBright  0.880847
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   12.4546
		Period          52.6011
		Eccentricity    0.942993
		Inclination     -7.72223
		AscendingNode   41.42
		ArgOfPericenter 27.6475
		MeanAnomaly     97.4035
	}
}

Comet	"Dellalt System C5"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            5.11336e-007
	Radius          115.398
	InertiaMoment   0.399495

	Oblateness      0.0132151

	RotationPeriod  46.5634
	Obliquity       133.667
	EqAscendNode    169.147

	AbsMagn         4.61136
	SlopeParam      3.033
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.564 0.510 0.465)

	Surface
	{
		SurfStyle       0.0966487
		OceanStyle      0.393786
		Randomize      (0.177, 0.067, 0.163)
		colorDistMagn   0.516141
		colorDistFreq   9.40406
		detailScale     3151.13
		colorConversion true
		snowLevel       2
		tropicLatitude  0.662148
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.260574
		terraceProb     0.132173
		erosion         0
		montesMagn      0.578719
		montesFreq      3.63174
		montesSpiky     0.964486
		montesFraction  0.244048
		dunesFraction   0
		hillsMagn       0
		hillsFreq       35.7683
		hillsFraction   0.609045
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258726
		craterFreq      0.522751
		craterDensity   0.918142
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.437775
		volcanoTemp     1649.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.226, 0.204, 0.186, 0.000)
		colorShelf     (0.240, 0.217, 0.198, 0.000)
		colorBeach     (0.254, 0.230, 0.209, 0.000)
		colorDesert    (0.268, 0.242, 0.221, 0.000)
		colorLowland   (0.282, 0.255, 0.232, 0.000)
		colorUpland    (0.296, 0.268, 0.244, 0.000)
		colorRock      (0.310, 0.281, 0.256, 0.000)
		colorSnow      (0.324, 0.293, 0.267, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0878341
		DustBright  0.552211
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   12.7345
		Period          54.3844
		Eccentricity    0.928253
		Inclination     -32.7115
		AscendingNode   -115.52
		ArgOfPericenter -111.458
		MeanAnomaly     34.1879
	}
}

Comet	"Dellalt System C6"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            1.57444e-014
	Radius          0.32932
	InertiaMoment   0.39826

	Oblateness      0.0107497

	RotationPeriod  44.7503
	Obliquity       86.8728
	EqAscendNode    153.724

	AbsMagn         12.2
	SlopeParam      3.62915
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.622 0.614 0.610)

	Surface
	{
		SurfStyle       0.641786
		OceanStyle      0.014535
		Randomize      (-0.930, -0.686, -0.382)
		colorDistMagn   0.410838
		colorDistFreq   4.42706e-005
		detailScale     8.99262
		colorConversion true
		snowLevel       2
		tropicLatitude  0.95375
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.45279
		terraceProb     0.208916
		erosion         0
		montesMagn      0.565796
		montesFreq      3.06139
		montesSpiky     0.993634
		montesFraction  0.542725
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000247903
		hillsFraction   0.765363
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24243
		craterFreq      0.249274
		craterDensity   0.902636
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.556014
		volcanoTemp     1392.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.243, 0.209, 0.171, 0.000)
		colorShelf     (0.249, 0.215, 0.195, 0.000)
		colorBeach     (0.292, 0.252, 0.232, 0.000)
		colorDesert    (0.317, 0.270, 0.226, 0.000)
		colorLowland   (0.348, 0.289, 0.256, 0.000)
		colorUpland    (0.386, 0.350, 0.311, 0.000)
		colorRock      (0.417, 0.381, 0.336, 0.000)
		colorSnow      (0.454, 0.406, 0.354, 1.000)
		BumpHeight      0.296388
		BumpOffset      0.0592775
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.158144
		GasToDust   0.25
		Particles   1299
		GasBright   0.0636979
		DustBright  0.260834
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   21.3991
		Period          118.466
		Eccentricity    0.958372
		Inclination     27.3523
		AscendingNode   -123.34
		ArgOfPericenter 121.463
		MeanAnomaly     98.3258
	}
}

Comet	"Dellalt System C7"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            1.21772e-010
	Radius          7.14755
	InertiaMoment   0.399919

	Oblateness      0.0155379

	RotationPeriod  42.9288
	Obliquity       40.0785
	EqAscendNode    138.301

	AbsMagn         8.15439
	SlopeParam      4.19343
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.419 0.416 0.415)

	Surface
	{
		SurfStyle       0.553362
		OceanStyle      0.426118
		Randomize      (-0.305, -0.171, 0.594)
		colorDistMagn   0.485215
		colorDistFreq   0.0104241
		detailScale     195.176
		colorConversion true
		snowLevel       2
		tropicLatitude  0.887678
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.674088
		terraceProb     0.119321
		erosion         0
		montesMagn      0.423555
		montesFreq      2.82063
		montesSpiky     0.918809
		montesFraction  0.374993
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0909959
		hillsFraction   0.524457
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227807
		craterFreq      0.22239
		craterDensity   0.963028
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.464678
		volcanoTemp     1503.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.163, 0.141, 0.116, 0.000)
		colorShelf     (0.168, 0.146, 0.133, 0.000)
		colorBeach     (0.197, 0.171, 0.158, 0.000)
		colorDesert    (0.214, 0.183, 0.153, 0.000)
		colorLowland   (0.235, 0.195, 0.174, 0.000)
		colorUpland    (0.260, 0.237, 0.211, 0.000)
		colorRock      (0.281, 0.258, 0.228, 0.000)
		colorSnow      (0.306, 0.275, 0.240, 1.000)
		BumpHeight      6.4328
		BumpOffset      1.28656
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.639336
		GasToDust   0.25
		Particles   2271
		GasBright   0.20656
		DustBright  0.602458
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   15.8451
		Period          75.4819
		Eccentricity    0.966901
		Inclination     51.2242
		AscendingNode   -87.8606
		ArgOfPericenter -51.9784
		MeanAnomaly     -152.348
	}
}

Comet	"Dellalt System C8"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            3.74945e-018
	Radius          0.020387
	InertiaMoment   0.398808

	Oblateness      0.0127258

	RotationPeriod  41.0942
	Obliquity       353.284
	EqAscendNode    122.879

	AbsMagn         4.30248
	SlopeParam      4.77389
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.414 0.406 0.402)

	Surface
	{
		SurfStyle       0.799584
		OceanStyle      0.505832
		Randomize      (-0.677, 0.951, 0.931)
		colorDistMagn   0.991237
		colorDistFreq   2.2005e-007
		detailScale     0.5567
		colorConversion true
		snowLevel       2
		tropicLatitude  0.842517
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.759567
		terraceProb     0.492179
		erosion         0
		montesMagn      0.65224
		montesFreq      3.55524
		montesSpiky     0.984189
		montesFraction  0.376311
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.18795e-007
		hillsFraction   0.526547
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245086
		craterFreq      0.258643
		craterDensity   1.06412
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.622592
		volcanoTemp     1684.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.162, 0.138, 0.113, 0.000)
		colorShelf     (0.166, 0.142, 0.129, 0.000)
		colorBeach     (0.195, 0.167, 0.153, 0.000)
		colorDesert    (0.211, 0.179, 0.149, 0.000)
		colorLowland   (0.232, 0.191, 0.169, 0.000)
		colorUpland    (0.257, 0.232, 0.205, 0.000)
		colorRock      (0.277, 0.252, 0.221, 0.000)
		colorSnow      (0.302, 0.268, 0.233, 1.000)
		BumpHeight      0.0183483
		BumpOffset      0.00366965
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.155142
		DustBright  0.338363
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   16.7628
		Period          82.1332
		Eccentricity    0.962436
		Inclination     -127.175
		AscendingNode   131.244
		ArgOfPericenter -33.494
		MeanAnomaly     -124.848
	}
}

Comet	"Dellalt System C9"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            2.89993e-014
	Radius          0.442709
	InertiaMoment   0.397009

	Oblateness      0.0183527

	RotationPeriod  39.2416
	Obliquity       306.49
	EqAscendNode    107.456

	AbsMagn         11.8537
	SlopeParam      5.42988
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.451 0.446 0.438)

	Surface
	{
		SurfStyle       0.538057
		OceanStyle      0.358054
		Randomize      (0.247, -0.214, -0.995)
		colorDistMagn   0.360669
		colorDistFreq   0.000133969
		detailScale     12.0889
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999395
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.307218
		terraceProb     0.370835
		erosion         0
		montesMagn      0.546621
		montesFreq      3.78981
		montesSpiky     0.956179
		montesFraction  0.34193
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000431779
		hillsFraction   0.536277
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.205162
		craterFreq      0.262392
		craterDensity   0.830792
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.531368
		volcanoTemp     1234.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.176, 0.152, 0.123, 0.000)
		colorShelf     (0.180, 0.156, 0.140, 0.000)
		colorBeach     (0.212, 0.183, 0.166, 0.000)
		colorDesert    (0.230, 0.196, 0.162, 0.000)
		colorLowland   (0.253, 0.210, 0.184, 0.000)
		colorUpland    (0.280, 0.254, 0.223, 0.000)
		colorRock      (0.302, 0.277, 0.241, 0.000)
		colorSnow      (0.329, 0.295, 0.254, 1.000)
		BumpHeight      0.398438
		BumpOffset      0.0796876
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.19097
		GasToDust   0.25
		Particles   1365
		GasBright   0.365194
		DustBright  0.612797
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   15.3244
		Period          71.7916
		Eccentricity    0.95347
		Inclination     -138.305
		AscendingNode   -139.934
		ArgOfPericenter -34.2901
		MeanAnomaly     -27.4933
	}
}

Comet	"Dellalt System C10"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            2.24288e-010
	Radius          7.9629
	InertiaMoment   0.399279

	Oblateness      0.01536

	RotationPeriod  37.3654
	Obliquity       259.696
	EqAscendNode    92.0337

	AbsMagn         7.94571
	SlopeParam      6.29831
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.718 0.678 0.617)

	Surface
	{
		SurfStyle       0.549838
		OceanStyle      0.938452
		Randomize      (0.281, 0.382, 0.865)
		colorDistMagn   0.664683
		colorDistFreq   0.0305782
		detailScale     217.44
		colorConversion true
		snowLevel       2
		tropicLatitude  0.377407
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.681427
		terraceProb     0.183252
		erosion         0
		montesMagn      0.410569
		montesFreq      2.34153
		montesSpiky     0.999681
		montesFraction  0.734917
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0931467
		hillsFraction   0.791109
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257373
		craterFreq      0.237776
		craterDensity   0.921484
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.47648
		volcanoTemp     1512.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.280, 0.230, 0.173, 0.000)
		colorShelf     (0.287, 0.237, 0.197, 0.000)
		colorBeach     (0.338, 0.278, 0.234, 0.000)
		colorDesert    (0.366, 0.298, 0.228, 0.000)
		colorLowland   (0.402, 0.319, 0.259, 0.000)
		colorUpland    (0.445, 0.386, 0.315, 0.000)
		colorRock      (0.481, 0.420, 0.339, 0.000)
		colorSnow      (0.524, 0.447, 0.358, 1.000)
		BumpHeight      7.16661
		BumpOffset      1.43332
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.672162
		GasToDust   0.25
		Particles   2337
		GasBright   0.286493
		DustBright  0.375984
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   12.9122
		Period          55.5265
		Eccentricity    0.968685
		Inclination     77.8547
		AscendingNode   157.466
		ArgOfPericenter -105.259
		MeanAnomaly     -18.6618
	}
}

Comet	"Dellalt System C11"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            6.90599e-018
	Radius          0.0274208
	InertiaMoment   0.397935

	Oblateness      0.0225047

	RotationPeriod  35.4598
	Obliquity       212.901
	EqAscendNode    76.6111

	AbsMagn         3.96981
	SlopeParam      8.44237
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.449 0.443 0.440)

	Surface
	{
		SurfStyle       0.928412
		OceanStyle      0.860636
		Randomize      (-0.708, 0.765, 0.282)
		colorDistMagn   0.333162
		colorDistFreq   4.21218e-007
		detailScale     0.74877
		colorConversion true
		snowLevel       2
		tropicLatitude  0.696039
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.301278
		terraceProb     0.23359
		erosion         0
		montesMagn      0.543583
		montesFreq      2.7105
		montesSpiky     0.960013
		montesFraction  0.617657
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.28514e-006
		hillsFraction   0.598164
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245864
		craterFreq      0.223718
		craterDensity   1.02043
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.429827
		volcanoTemp     1407.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.153, 0.155, 0.176, 0.050)
		colorShelf     (0.179, 0.182, 0.202, 0.040)
		colorBeach     (0.206, 0.208, 0.229, 0.030)
		colorDesert    (0.233, 0.235, 0.259, 0.020)
		colorLowland   (0.260, 0.262, 0.286, 0.030)
		colorUpland    (0.287, 0.288, 0.312, 0.050)
		colorRock      (0.314, 0.315, 0.347, 0.020)
		colorSnow      (0.314, 0.315, 0.347, 1.000)
		BumpHeight      0.0246787
		BumpOffset      0.00493574
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.170534
		DustBright  0.176431
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   16.7506
		Period          82.0437
		Eccentricity    0.962989
		Inclination     -13.2838
		AscendingNode   142.59
		ArgOfPericenter 79.4308
		MeanAnomaly     30.2705
	}
}

Comet	"Dellalt System C12"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            5.34129e-014
	Radius          0.492917
	InertiaMoment   0.399712

	Oblateness      0.0190429

	RotationPeriod  33.5185
	Obliquity       166.107
	EqAscendNode    61.1885

	AbsMagn         11.5341
	SlopeParam      2.69824
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.830 0.738 0.704)

	Surface
	{
		SurfStyle       0.242026
		OceanStyle      0.0185163
		Randomize      (0.774, 0.615, 0.148)
		colorDistMagn   0.704371
		colorDistFreq   4.72005e-005
		detailScale     13.4599
		colorConversion true
		snowLevel       2
		tropicLatitude  0.984968
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.463838
		terraceProb     0.241139
		erosion         0
		montesMagn      0.604783
		montesFreq      3.39347
		montesSpiky     0.899697
		montesFraction  0.531546
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000621698
		hillsFraction   0.689786
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226512
		craterFreq      0.22295
		craterDensity   0.655596
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.552323
		volcanoTemp     1819.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.332, 0.295, 0.282, 0.000)
		colorShelf     (0.353, 0.314, 0.299, 0.000)
		colorBeach     (0.374, 0.332, 0.317, 0.000)
		colorDesert    (0.394, 0.351, 0.335, 0.000)
		colorLowland   (0.415, 0.369, 0.352, 0.000)
		colorUpland    (0.436, 0.388, 0.370, 0.000)
		colorRock      (0.457, 0.406, 0.387, 0.000)
		colorSnow      (0.477, 0.424, 0.405, 1.000)
		BumpHeight      0.443625
		BumpOffset      0.088725
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.223796
		GasToDust   0.25
		Particles   1431
		GasBright   0.0420281
		DustBright  0.789423
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   19.4
		Period          102.259
		Eccentricity    0.979985
		Inclination     89.6474
		AscendingNode   46.0097
		ArgOfPericenter 105.967
		MeanAnomaly     -174.061
	}
}

Comet	"Dellalt System C13"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            4.13111e-010
	Radius          10.7163
	InertiaMoment   0.398551

	Oblateness      0.0284606

	RotationPeriod  31.534
	Obliquity       119.313
	EqAscendNode    45.7659

	AbsMagn         7.73689
	SlopeParam      3.33438
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.716 0.712 0.710)

	Surface
	{
		SurfStyle       0.00502594
		OceanStyle      0.0307344
		Randomize      (-0.051, -0.797, -0.974)
		colorDistMagn   0.392288
		colorDistFreq   0.0586267
		detailScale     292.626
		colorConversion true
		snowLevel       2
		tropicLatitude  0.99812
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.436671
		terraceProb     0.259624
		erosion         0
		montesMagn      0.373566
		montesFreq      2.86184
		montesSpiky     0.883845
		montesFraction  0.67305
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.319747
		hillsFraction   0.696073
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235518
		craterFreq      0.269264
		craterDensity   0.937499
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.484804
		volcanoTemp     1372.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.286, 0.285, 0.284, 0.000)
		colorShelf     (0.304, 0.302, 0.302, 0.000)
		colorBeach     (0.322, 0.320, 0.319, 0.000)
		colorDesert    (0.340, 0.338, 0.337, 0.000)
		colorLowland   (0.358, 0.356, 0.355, 0.000)
		colorUpland    (0.376, 0.374, 0.373, 0.000)
		colorRock      (0.394, 0.391, 0.390, 0.000)
		colorSnow      (0.412, 0.409, 0.408, 1.000)
		BumpHeight      9.64465
		BumpOffset      1.92893
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.704988
		GasToDust   0.25
		Particles   2404
		GasBright   0.0565432
		DustBright  0.459394
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   17.4023
		Period          86.8784
		Eccentricity    0.958936
		Inclination     75.8313
		AscendingNode   -102.371
		ArgOfPericenter -157.618
		MeanAnomaly     -3.93172
	}
}

Comet	"Dellalt System C14"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            1.272e-017
	Radius          0.0305111
	InertiaMoment   0.396119

	Oblateness      0.0241587

	RotationPeriod  29.4982
	Obliquity       72.5184
	EqAscendNode    30.3434

	AbsMagn         3.60664
	SlopeParam      3.90831
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.586 0.528 0.490)

	Surface
	{
		SurfStyle       0.856021
		OceanStyle      0.804367
		Randomize      (-0.742, 0.136, -0.120)
		colorDistMagn   0.774401
		colorDistFreq   5.51482e-007
		detailScale     0.833157
		colorConversion true
		snowLevel       2
		tropicLatitude  0.68398
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.45739
		terraceProb     0.440675
		erosion         0
		montesMagn      0.392807
		montesFreq      2.50387
		montesSpiky     0.885531
		montesFraction  0.534169
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.87618e-006
		hillsFraction   0.706328
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240031
		craterFreq      0.247331
		craterDensity   0.971238
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.390471
		volcanoTemp     1672.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.199, 0.185, 0.196, 0.050)
		colorShelf     (0.234, 0.216, 0.226, 0.040)
		colorBeach     (0.269, 0.248, 0.255, 0.030)
		colorDesert    (0.305, 0.280, 0.289, 0.020)
		colorLowland   (0.340, 0.311, 0.319, 0.030)
		colorUpland    (0.375, 0.343, 0.348, 0.050)
		colorRock      (0.410, 0.375, 0.387, 0.020)
		colorSnow      (0.410, 0.375, 0.387, 1.000)
		BumpHeight      0.02746
		BumpOffset      0.005492
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0337992
		DustBright  0.166625
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   14.7037
		Period          67.4747
		Eccentricity    0.96918
		Inclination     71.038
		AscendingNode   134.467
		ArgOfPericenter 38.5177
		MeanAnomaly     -67.2529
	}
}

Comet	"Dellalt System C15"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            9.838e-014
	Radius          0.663757
	InertiaMoment   0.399053

	Oblateness      0.0376816

	RotationPeriod  27.4014
	Obliquity       25.7241
	EqAscendNode    14.9208

	AbsMagn         11.2357
	SlopeParam      4.47462
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.515 0.419 0.317)

	Surface
	{
		SurfStyle       0.687283
		OceanStyle      0.979744
		Randomize      (0.079, 0.658, -0.400)
		colorDistMagn   0.68684
		colorDistFreq   0.00022613
		detailScale     18.125
		colorConversion true
		snowLevel       2
		tropicLatitude  0.686098
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.326161
		terraceProb     0.258822
		erosion         0
		montesMagn      0.560814
		montesFreq      2.91016
		montesSpiky     0.90626
		montesFraction  0.545831
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00117993
		hillsFraction   0.520045
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217136
		craterFreq      0.212743
		craterDensity   0.781784
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.472848
		volcanoTemp     1314.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.201, 0.143, 0.089, 0.000)
		colorShelf     (0.206, 0.147, 0.102, 0.000)
		colorBeach     (0.242, 0.172, 0.121, 0.000)
		colorDesert    (0.263, 0.184, 0.117, 0.000)
		colorLowland   (0.288, 0.197, 0.133, 0.000)
		colorUpland    (0.319, 0.239, 0.162, 0.000)
		colorRock      (0.345, 0.260, 0.175, 0.000)
		colorSnow      (0.376, 0.277, 0.184, 1.000)
		BumpHeight      0.597381
		BumpOffset      0.119476
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.256622
		GasToDust   0.25
		Particles   1498
		GasBright   0.155943
		DustBright  0.528968
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   12.2588
		Period          51.3659
		Eccentricity    0.974684
		Inclination     128.936
		AscendingNode   61.453
		ArgOfPericenter 35.0878
		MeanAnomaly     -5.97838
	}
}

Comet	"Dellalt System C16"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            7.60899e-010
	Radius          11.9158
	InertiaMoment   0.397543

	Oblateness      0.0330542

	RotationPeriod  25.2322
	Obliquity       338.93
	EqAscendNode    359.498

	AbsMagn         7.52735
	SlopeParam      5.08272
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.635 0.634 0.631)

	Surface
	{
		SurfStyle       0.554232
		OceanStyle      0.52014
		Randomize      (-0.997, 0.741, 0.354)
		colorDistMagn   0.653539
		colorDistFreq   0.0846573
		detailScale     325.38
		colorConversion true
		snowLevel       2
		tropicLatitude  0.712044
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.589734
		terraceProb     0.312592
		erosion         0
		montesMagn      0.44505
		montesFreq      3.30578
		montesSpiky     0.867632
		montesFraction  0.711498
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.358241
		hillsFraction   0.5411
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231889
		craterFreq      0.149976
		craterDensity   0.919125
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.492207
		volcanoTemp     1562.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.248, 0.215, 0.177, 0.000)
		colorShelf     (0.254, 0.222, 0.202, 0.000)
		colorBeach     (0.299, 0.260, 0.240, 0.000)
		colorDesert    (0.324, 0.279, 0.234, 0.000)
		colorLowland   (0.356, 0.298, 0.265, 0.000)
		colorUpland    (0.394, 0.361, 0.322, 0.000)
		colorRock      (0.426, 0.393, 0.347, 0.000)
		colorSnow      (0.464, 0.418, 0.366, 1.000)
		BumpHeight      10.7242
		BumpOffset      2.14484
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.737814
		GasToDust   0.25
		Particles   2470
		GasBright   0.105917
		DustBright  0.26348
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   15.3382
		Period          71.8892
		Eccentricity    0.949152
		Inclination     40.5667
		AscendingNode   -91.6483
		ArgOfPericenter -77.5293
		MeanAnomaly     171.935
	}
}

Comet	"Dellalt System C17"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            2.34287e-017
	Radius          0.0411127
	InertiaMoment   0.399501

	Oblateness      0.0535644

	RotationPeriod  22.977
	Obliquity       292.136
	EqAscendNode    344.076

	AbsMagn         3.20308
	SlopeParam      5.81513
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.634 0.631 0.627)

	Surface
	{
		SurfStyle       0.00641383
		OceanStyle      0.216801
		Randomize      (0.895, 0.025, 0.821)
		colorDistMagn   0.499095
		colorDistFreq   6.32213e-007
		detailScale     1.12265
		colorConversion true
		snowLevel       2
		tropicLatitude  0.915085
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.515733
		terraceProb     0.231749
		erosion         0
		montesMagn      0.53509
		montesFreq      2.8199
		montesSpiky     0.834933
		montesFraction  0.61933
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.14594e-006
		hillsFraction   0.639861
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232608
		craterFreq      0.252889
		craterDensity   0.795608
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.464778
		volcanoTemp     1825.24
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.254, 0.253, 0.251, 0.000)
		colorShelf     (0.269, 0.268, 0.267, 0.000)
		colorBeach     (0.285, 0.284, 0.282, 0.000)
		colorDesert    (0.301, 0.300, 0.298, 0.000)
		colorLowland   (0.317, 0.316, 0.314, 0.000)
		colorUpland    (0.333, 0.331, 0.329, 0.000)
		colorRock      (0.349, 0.347, 0.345, 0.000)
		colorSnow      (0.365, 0.363, 0.361, 1.000)
		BumpHeight      0.0370014
		BumpOffset      0.00740028
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.295251
		DustBright  0.558633
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   11.7899
		Period          48.4468
		Eccentricity    0.967342
		Inclination     -172.391
		AscendingNode   75.9484
		ArgOfPericenter 179.852
		MeanAnomaly     25.1392
	}
}

Comet	"Dellalt System C18"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            1.81204e-013
	Radius          0.737505
	InertiaMoment   0.398268

	Oblateness      0.0494161

	RotationPeriod  20.619
	Obliquity       245.341
	EqAscendNode    328.653

	AbsMagn         10.9542
	SlopeParam      6.95192
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.631 0.627 0.625)

	Surface
	{
		SurfStyle       0.452566
		OceanStyle      0.206271
		Randomize      (0.380, 0.600, -0.473)
		colorDistMagn   0.371382
		colorDistFreq   0.000358884
		detailScale     20.1388
		colorConversion true
		snowLevel       2
		tropicLatitude  0.99913
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.460051
		terraceProb     0.193537
		erosion         0
		montesMagn      0.349522
		montesFreq      2.17691
		montesSpiky     0.881676
		montesFraction  0.529587
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00118259
		hillsFraction   0.544872
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229546
		craterFreq      0.184377
		craterDensity   0.889023
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.517514
		volcanoTemp     969.445
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.252, 0.251, 0.250, 0.000)
		colorShelf     (0.268, 0.266, 0.265, 0.000)
		colorBeach     (0.284, 0.282, 0.281, 0.000)
		colorDesert    (0.300, 0.298, 0.297, 0.000)
		colorLowland   (0.316, 0.313, 0.312, 0.000)
		colorUpland    (0.331, 0.329, 0.328, 0.000)
		colorRock      (0.347, 0.345, 0.344, 0.000)
		colorSnow      (0.363, 0.360, 0.359, 1.000)
		BumpHeight      0.663755
		BumpOffset      0.132751
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.289448
		GasToDust   0.25
		Particles   1564
		GasBright   0.217943
		DustBright  0.320428
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   15.1026
		Period          70.2392
		Eccentricity    0.976919
		Inclination     -64.9427
		AscendingNode   -105.385
		ArgOfPericenter -164.654
		MeanAnomaly     84.1962
	}
}

Comet	"Dellalt System C19"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            1.40148e-009
	Radius          16.0673
	InertiaMoment   0.399924

	Oblateness      0.0859165

	RotationPeriod  18.1372
	Obliquity       198.547
	EqAscendNode    313.23

	AbsMagn         7.3165
	SlopeParam      2.32214
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.687 0.685 0.682)

	Surface
	{
		SurfStyle       0.197227
		OceanStyle      0.723105
		Randomize      (0.311, 0.363, -0.908)
		colorDistMagn   0.50809
		colorDistFreq   0.00768199
		detailScale     438.745
		colorConversion true
		snowLevel       2
		tropicLatitude  0.715711
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.571054
		terraceProb     0.327011
		erosion         0
		montesMagn      0.533661
		montesFreq      2.96911
		montesSpiky     0.976959
		montesFraction  0.630396
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.559008
		hillsFraction   0.626896
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241591
		craterFreq      0.269892
		craterDensity   0.989445
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.528546
		volcanoTemp     1517.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.275, 0.274, 0.273, 0.000)
		colorShelf     (0.292, 0.291, 0.290, 0.000)
		colorBeach     (0.309, 0.308, 0.307, 0.000)
		colorDesert    (0.326, 0.326, 0.324, 0.000)
		colorLowland   (0.344, 0.343, 0.341, 0.000)
		colorUpland    (0.361, 0.360, 0.358, 0.000)
		colorRock      (0.378, 0.377, 0.375, 0.000)
		colorSnow      (0.395, 0.394, 0.392, 1.000)
		BumpHeight      14.4606
		BumpOffset      2.89212
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.77064
		GasToDust   0.25
		Particles   2536
		GasBright   0.103376
		DustBright  0.119482
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   18.0384
		Period          91.6849
		Eccentricity    0.970099
		Inclination     -131.061
		AscendingNode   108.386
		ArgOfPericenter 37.7128
		MeanAnomaly     -12.2925
	}
}

Comet	"Dellalt System C20"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            4.31525e-017
	Radius          0.0456439
	InertiaMoment   0.398815

	Oblateness      0.0871744

	RotationPeriod  15.5046
	Obliquity       151.753
	EqAscendNode    297.808

	AbsMagn         2.74371
	SlopeParam      3.02432
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.413 0.409 0.403)

	Surface
	{
		SurfStyle       0.198243
		OceanStyle      0.0385998
		Randomize      (-0.490, -0.080, 0.321)
		colorDistMagn   0.824072
		colorDistFreq   2.84581e-007
		detailScale     1.24638
		colorConversion true
		snowLevel       2
		tropicLatitude  0.754853
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.415276
		terraceProb     0.211527
		erosion         0
		montesMagn      0.650212
		montesFreq      3.43053
		montesSpiky     0.998418
		montesFraction  0.622227
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.03646e-006
		hillsFraction   0.510104
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233243
		craterFreq      0.202568
		craterDensity   0.928893
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.466835
		volcanoTemp     1556.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.165, 0.163, 0.161, 0.000)
		colorShelf     (0.175, 0.174, 0.171, 0.000)
		colorBeach     (0.186, 0.184, 0.181, 0.000)
		colorDesert    (0.196, 0.194, 0.192, 0.000)
		colorLowland   (0.206, 0.204, 0.202, 0.000)
		colorUpland    (0.217, 0.215, 0.212, 0.000)
		colorRock      (0.227, 0.225, 0.222, 0.000)
		colorSnow      (0.237, 0.235, 0.232, 1.000)
		BumpHeight      0.0410795
		BumpOffset      0.00821591
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0162052
		DustBright  0.691139
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   13.3551
		Period          58.4076
		Eccentricity    0.93563
		Inclination     -125.305
		AscendingNode   67.6628
		ArgOfPericenter -139.689
		MeanAnomaly     -142.617
	}
}

Comet	"Dellalt System C21"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            3.33754e-013
	Radius          0.995204
	InertiaMoment   0.397025

	Oblateness      0.173357

	RotationPeriod  12.6856
	Obliquity       104.958
	EqAscendNode    282.385

	AbsMagn         10.6867
	SlopeParam      3.62129
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.587 0.584 0.581)

	Surface
	{
		SurfStyle       0.85345
		OceanStyle      0.939171
		Randomize      (0.211, -0.814, 0.790)
		colorDistMagn   0.383336
		colorDistFreq   0.000337326
		detailScale     27.1757
		colorConversion true
		snowLevel       2
		tropicLatitude  0.679126
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.47368
		terraceProb     0.581091
		erosion         0
		montesMagn      0.396463
		montesFreq      3.27075
		montesSpiky     0.952712
		montesFraction  0.917557
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00242397
		hillsFraction   0.703641
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250524
		craterFreq      0.213588
		craterDensity   0.866767
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.440047
		volcanoTemp     1558.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.199, 0.204, 0.232, 0.050)
		colorShelf     (0.235, 0.239, 0.267, 0.040)
		colorBeach     (0.270, 0.274, 0.302, 0.030)
		colorDesert    (0.305, 0.309, 0.343, 0.020)
		colorLowland   (0.340, 0.345, 0.378, 0.030)
		colorUpland    (0.376, 0.380, 0.413, 0.050)
		colorRock      (0.411, 0.415, 0.459, 0.020)
		colorSnow      (0.411, 0.415, 0.459, 1.000)
		BumpHeight      0.895683
		BumpOffset      0.179137
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.322274
		GasToDust   0.25
		Particles   1630
		GasBright   0.0321125
		DustBright  0.359718
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   15.7226
		Period          74.6085
		Eccentricity    0.964957
		Inclination     -98.1473
		AscendingNode   143.684
		ArgOfPericenter 47.8921
		MeanAnomaly     -9.81847
	}
}

Comet	"Dellalt System C22"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            2.58135e-009
	Radius          17.8228
	InertiaMoment   0.399284

	Oblateness      0.22523

	RotationPeriod  9.63144
	Obliquity       58.1641
	EqAscendNode    266.963

	AbsMagn         7.10373
	SlopeParam      4.18568
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.471 0.370 0.333)

	Surface
	{
		SurfStyle       0.673892
		OceanStyle      0.15652
		Randomize      (-0.983, -0.087, 0.130)
		colorDistMagn   0.775157
		colorDistFreq   0.227488
		detailScale     486.68
		colorConversion true
		snowLevel       2
		tropicLatitude  0.565187
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.626072
		terraceProb     0.441385
		erosion         0
		montesMagn      0.595475
		montesFreq      2.89573
		montesSpiky     0.981543
		montesFraction  0.471196
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.881207
		hillsFraction   0.634978
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.266142
		craterFreq      0.24358
		craterDensity   0.98719
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.524206
		volcanoTemp     1474.95
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.184, 0.126, 0.093, 0.000)
		colorShelf     (0.189, 0.129, 0.107, 0.000)
		colorBeach     (0.222, 0.152, 0.127, 0.000)
		colorDesert    (0.240, 0.163, 0.123, 0.000)
		colorLowland   (0.264, 0.174, 0.140, 0.000)
		colorUpland    (0.292, 0.211, 0.170, 0.000)
		colorRock      (0.316, 0.229, 0.183, 0.000)
		colorSnow      (0.344, 0.244, 0.193, 1.000)
		BumpHeight      16.0405
		BumpOffset      3.2081
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.803466
		GasToDust   0.25
		Particles   2602
		GasBright   0.123561
		DustBright  0.752756
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   18.2186
		Period          93.0624
		Eccentricity    0.955582
		Inclination     -89.3937
		AscendingNode   167.869
		ArgOfPericenter -93.1182
		MeanAnomaly     155.649
	}
}

Comet	"Dellalt System C23"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            7.94817e-017
	Radius          0.0616428
	InertiaMoment   0.397944

	Oblateness      0.249

	RotationPeriod  6.27279
	Obliquity       11.3698
	EqAscendNode    251.54

	AbsMagn         2.20211
	SlopeParam      4.76558
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.651 0.646 0.643)

	Surface
	{
		SurfStyle       0.88168
		OceanStyle      0.157295
		Randomize      (0.454, -0.699, 0.985)
		colorDistMagn   0.822897
		colorDistFreq   9.03879e-007
		detailScale     1.68326
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997393
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.538697
		terraceProb     0.259772
		erosion         0
		montesMagn      0.387114
		montesFreq      3.0049
		montesSpiky     0.96725
		montesFraction  0.605491
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.67444e-006
		hillsFraction   0.494087
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261427
		craterFreq      0.207195
		craterDensity   0.876918
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.528443
		volcanoTemp     1758.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.221, 0.226, 0.257, 0.050)
		colorShelf     (0.260, 0.265, 0.296, 0.040)
		colorBeach     (0.300, 0.304, 0.334, 0.030)
		colorDesert    (0.339, 0.342, 0.380, 0.020)
		colorLowland   (0.378, 0.381, 0.418, 0.030)
		colorUpland    (0.417, 0.420, 0.457, 0.050)
		colorRock      (0.456, 0.459, 0.508, 0.020)
		colorSnow      (0.456, 0.459, 0.508, 1.000)
		BumpHeight      0.0554785
		BumpOffset      0.0110957
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.112186
		DustBright  0.448617
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   18.4239
		Period          94.6398
		Eccentricity    0.966633
		Inclination     -94.0559
		AscendingNode   -90.8229
		ArgOfPericenter -10.2474
		MeanAnomaly     -123.425
	}
}

Comet	"Dellalt System C24"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            6.14734e-013
	Radius          1.1029
	InertiaMoment   0.399717

	Oblateness      0.249

	RotationPeriod  2.50529
	Obliquity       324.575
	EqAscendNode    236.117

	AbsMagn         10.4306
	SlopeParam      5.41994
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.598 0.490 0.429)

	Surface
	{
		SurfStyle       0.0741702
		OceanStyle      0.38848
		Randomize      (0.980, 0.828, -0.973)
		colorDistMagn   0.541023
		colorDistFreq   0.000846656
		detailScale     30.1165
		colorConversion true
		snowLevel       2
		tropicLatitude  0.426827
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.582331
		terraceProb     0.476178
		erosion         0
		montesMagn      0.556409
		montesFreq      2.73215
		montesSpiky     0.984638
		montesFraction  0.120223
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00342241
		hillsFraction   0.713816
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221384
		craterFreq      0.167962
		craterDensity   0.892346
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.45333
		volcanoTemp     1616.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.239, 0.196, 0.172, 0.000)
		colorShelf     (0.254, 0.208, 0.183, 0.000)
		colorBeach     (0.269, 0.220, 0.193, 0.000)
		colorDesert    (0.284, 0.233, 0.204, 0.000)
		colorLowland   (0.299, 0.245, 0.215, 0.000)
		colorUpland    (0.314, 0.257, 0.225, 0.000)
		colorRock      (0.329, 0.269, 0.236, 0.000)
		colorSnow      (0.344, 0.282, 0.247, 1.000)
		BumpHeight      0.992611
		BumpOffset      0.198522
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.3551
		GasToDust   0.25
		Particles   1697
		GasBright   0.0635524
		DustBright  0.181738
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   18.9585
		Period          98.7888
		Eccentricity    0.966458
		Inclination     -25.0659
		AscendingNode   132.594
		ArgOfPericenter -85.8697
		MeanAnomaly     81.0927
	}
}

Comet	"Dellalt System C25"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            4.75452e-009
	Radius          24.0909
	InertiaMoment   0.398558

	Oblateness      0.00186812

	RotationPeriod  122.292
	Obliquity       277.781
	EqAscendNode    220.695

	AbsMagn         6.88839
	SlopeParam      6.28344
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.714 0.710 0.708)

	Surface
	{
		SurfStyle       0.068002
		OceanStyle      0.339891
		Randomize      (0.365, 0.996, 0.747)
		colorDistMagn   0.403032
		colorDistFreq   0.33511
		detailScale     657.843
		colorConversion true
		snowLevel       2
		tropicLatitude  0.94471
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.695681
		terraceProb     0.254702
		erosion         0
		montesMagn      0.581942
		montesFreq      2.30907
		montesSpiky     0.960557
		montesFraction  0.745386
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.35035
		hillsFraction   0.889677
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24251
		craterFreq      0.183189
		craterDensity   1.02702
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.478157
		volcanoTemp     1368.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.285, 0.284, 0.283, 0.000)
		colorShelf     (0.303, 0.302, 0.301, 0.000)
		colorBeach     (0.321, 0.319, 0.319, 0.000)
		colorDesert    (0.339, 0.337, 0.336, 0.000)
		colorLowland   (0.357, 0.355, 0.354, 0.000)
		colorUpland    (0.375, 0.373, 0.372, 0.000)
		colorRock      (0.393, 0.390, 0.389, 0.000)
		colorSnow      (0.410, 0.408, 0.407, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.836292
		GasToDust   0.25
		Particles   2669
		GasBright   0.232168
		DustBright  0.497608
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   17.8025
		Period          89.8925
		Eccentricity    0.989723
		Inclination     -27.1987
		AscendingNode   -8.12117
		ArgOfPericenter -172.751
		MeanAnomaly     124.353
	}
}

Comet	"Dellalt System C26"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            1.46395e-016
	Radius          0.068244
	InertiaMoment   0.396153

	Oblateness      0.00165294

	RotationPeriod  111.204
	Obliquity       230.987
	EqAscendNode    205.272

	AbsMagn         1.52663
	SlopeParam      8.35571
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.521 0.516 0.508)

	Surface
	{
		SurfStyle       0.0356794
		OceanStyle      0.412563
		Randomize      (0.397, -0.674, 0.412)
		colorDistMagn   0.646263
		colorDistFreq   1.33198e-006
		detailScale     1.86352
		colorConversion true
		snowLevel       2
		tropicLatitude  0.891332
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.702287
		terraceProb     0.180762
		erosion         0
		montesMagn      0.413727
		montesFreq      2.3019
		montesSpiky     0.974569
		montesFraction  0.634606
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.35883e-005
		hillsFraction   0.720128
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244166
		craterFreq      0.182295
		craterDensity   1.07598
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.468262
		volcanoTemp     1329.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.208, 0.206, 0.203, 0.000)
		colorShelf     (0.221, 0.219, 0.216, 0.000)
		colorBeach     (0.234, 0.232, 0.229, 0.000)
		colorDesert    (0.247, 0.245, 0.241, 0.000)
		colorLowland   (0.260, 0.258, 0.254, 0.000)
		colorUpland    (0.273, 0.271, 0.267, 0.000)
		colorRock      (0.286, 0.284, 0.279, 0.000)
		colorSnow      (0.299, 0.297, 0.292, 1.000)
		BumpHeight      0.0614196
		BumpOffset      0.0122839
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.156252
		DustBright  0.258011
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   10.633
		Period          41.4937
		Eccentricity    0.959672
		Inclination     33.4183
		AscendingNode   -80.304
		ArgOfPericenter 76.3829
		MeanAnomaly     107.891
	}
}

Comet	"Dellalt System C27"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            1.13226e-012
	Radius          1.4922
	InertiaMoment   0.399059

	Oblateness      0.00257814

	RotationPeriod  104.086
	Obliquity       184.193
	EqAscendNode    189.85

	AbsMagn         10.1842
	SlopeParam      2.68869
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.784 0.781 0.779)

	Surface
	{
		SurfStyle       0.0020659
		OceanStyle      0.982941
		Randomize      (0.197, 0.659, -0.029)
		colorDistMagn   0.495376
		colorDistFreq   0.00197176
		detailScale     40.7469
		colorConversion true
		snowLevel       2
		tropicLatitude  0.962763
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.355702
		terraceProb     0.390716
		erosion         0
		montesMagn      0.37381
		montesFreq      3.30987
		montesSpiky     0.968606
		montesFraction  0.532019
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00604
		hillsFraction   0.766689
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258456
		craterFreq      0.223102
		craterDensity   0.963434
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.474744
		volcanoTemp     1401.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.314, 0.313, 0.311, 0.000)
		colorShelf     (0.333, 0.332, 0.331, 0.000)
		colorBeach     (0.353, 0.352, 0.350, 0.000)
		colorDesert    (0.372, 0.371, 0.370, 0.000)
		colorLowland   (0.392, 0.391, 0.389, 0.000)
		colorUpland    (0.412, 0.410, 0.409, 0.000)
		colorRock      (0.431, 0.430, 0.428, 0.000)
		colorSnow      (0.451, 0.449, 0.448, 1.000)
		BumpHeight      1.34298
		BumpOffset      0.268595
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.387926
		GasToDust   0.25
		Particles   1763
		GasBright   0.392059
		DustBright  0.506691
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   17.8616
		Period          90.3399
		Eccentricity    0.968081
		Inclination     -70.1648
		AscendingNode   -171.751
		ArgOfPericenter -144.119
		MeanAnomaly     154.818
	}
}

Comet	"Dellalt System C28"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            8.75723e-009
	Radius          26.6412
	InertiaMoment   0.397555

	Oblateness      0.00209944

	RotationPeriod  98.6625
	Obliquity       137.398
	EqAscendNode    174.427

	AbsMagn         6.66979
	SlopeParam      3.32622
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.534 0.531 0.528)

	Surface
	{
		SurfStyle       0.255847
		OceanStyle      0.203336
		Randomize      (0.860, -0.069, -0.745)
		colorDistMagn   0.558404
		colorDistFreq   0.452315
		detailScale     727.482
		colorConversion true
		snowLevel       2
		tropicLatitude  0.855128
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.269795
		terraceProb     0.204824
		erosion         0
		montesMagn      0.355628
		montesFreq      3.61832
		montesSpiky     0.996172
		montesFraction  0.326352
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.10679
		hillsFraction   0.479313
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227038
		craterFreq      0.266086
		craterDensity   0.884495
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.521998
		volcanoTemp     1084.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.213, 0.212, 0.211, 0.000)
		colorShelf     (0.227, 0.225, 0.225, 0.000)
		colorBeach     (0.240, 0.239, 0.238, 0.000)
		colorDesert    (0.253, 0.252, 0.251, 0.000)
		colorLowland   (0.267, 0.265, 0.264, 0.000)
		colorUpland    (0.280, 0.279, 0.277, 0.000)
		colorRock      (0.293, 0.292, 0.291, 0.000)
		colorSnow      (0.307, 0.305, 0.304, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.869118
		GasToDust   0.25
		Particles   2735
		GasBright   0.288861
		DustBright  0.294376
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   17.1136
		Period          84.7252
		Eccentricity    0.953972
		Inclination     80.4732
		AscendingNode   163.552
		ArgOfPericenter 11.4259
		MeanAnomaly     -91.0529
	}
}

Comet	"Dellalt System C29"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            2.69641e-016
	Radius          0.0924272
	InertiaMoment   0.399506

	Oblateness      0.00314675

	RotationPeriod  94.1936
	Obliquity       90.604
	EqAscendNode    159.005

	AbsMagn         0.590504
	SlopeParam      3.90058
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.694 0.690 0.685)

	Surface
	{
		SurfStyle       0.448061
		OceanStyle      0.625269
		Randomize      (-0.583, -0.104, 0.472)
		colorDistMagn   0.116195
		colorDistFreq   2.64143e-006
		detailScale     2.52388
		colorConversion true
		snowLevel       2
		tropicLatitude  0.840902
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.592638
		terraceProb     0.20649
		erosion         0
		montesMagn      0.527273
		montesFreq      2.47283
		montesSpiky     0.816149
		montesFraction  0.482
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.90151e-005
		hillsFraction   0.541892
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235178
		craterFreq      0.20498
		craterDensity   0.787342
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.57655
		volcanoTemp     1799.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.277, 0.276, 0.274, 0.000)
		colorShelf     (0.295, 0.293, 0.291, 0.000)
		colorBeach     (0.312, 0.310, 0.308, 0.000)
		colorDesert    (0.329, 0.328, 0.326, 0.000)
		colorLowland   (0.347, 0.345, 0.343, 0.000)
		colorUpland    (0.364, 0.362, 0.360, 0.000)
		colorRock      (0.382, 0.379, 0.377, 0.000)
		colorSnow      (0.399, 0.397, 0.394, 1.000)
		BumpHeight      0.0831844
		BumpOffset      0.0166369
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.014542
		DustBright  0.253181
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   19.7554
		Period          105.082
		Eccentricity    0.975469
		Inclination     -113.392
		AscendingNode   126.459
		ArgOfPericenter 152.147
		MeanAnomaly     176.005
	}
}

Comet	"Dellalt System C30"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            2.08548e-012
	Radius          1.64816
	InertiaMoment   0.398275

	Oblateness      0.00249634

	RotationPeriod  90.3414
	Obliquity       43.8097
	EqAscendNode    143.582

	AbsMagn         9.94581
	SlopeParam      4.46669
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.682 0.564 0.416)

	Surface
	{
		SurfStyle       0.424143
		OceanStyle      0.1562
		Randomize      (0.658, -0.537, -0.176)
		colorDistMagn   0.806438
		colorDistFreq   0.000661463
		detailScale     45.0057
		colorConversion true
		snowLevel       2
		tropicLatitude  0.619913
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.682175
		terraceProb     0.224883
		erosion         0
		montesMagn      0.463778
		montesFreq      2.69228
		montesSpiky     0.824567
		montesFraction  0.672446
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00495237
		hillsFraction   0.864371
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239779
		craterFreq      0.218455
		craterDensity   0.939374
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.495749
		volcanoTemp     1598.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.273, 0.226, 0.166, 0.000)
		colorShelf     (0.290, 0.240, 0.177, 0.000)
		colorBeach     (0.307, 0.254, 0.187, 0.000)
		colorDesert    (0.324, 0.268, 0.198, 0.000)
		colorLowland   (0.341, 0.282, 0.208, 0.000)
		colorUpland    (0.358, 0.296, 0.218, 0.000)
		colorRock      (0.375, 0.310, 0.229, 0.000)
		colorSnow      (0.392, 0.325, 0.239, 1.000)
		BumpHeight      1.48334
		BumpOffset      0.296669
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.420752
		GasToDust   0.25
		Particles   1829
		GasBright   0.0852723
		DustBright  0.666937
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   16.9622
		Period          83.6031
		Eccentricity    0.961239
		Inclination     -23.2347
		AscendingNode   63.5704
		ArgOfPericenter 111.208
		MeanAnomaly     75.0261
	}
}

Comet	"Dellalt System C31"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            1.61297e-008
	Radius          36.1222
	InertiaMoment   0.39993

	Oblateness      0.0036934

	RotationPeriod  86.9212
	Obliquity       357.015
	EqAscendNode    128.159

	AbsMagn         6.44713
	SlopeParam      5.07379
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.692 0.690 0.689)

	Surface
	{
		SurfStyle       0.0733828
		OceanStyle      0.781121
		Randomize      (-0.947, 0.028, -0.304)
		colorDistMagn   0.217837
		colorDistFreq   0.388537
		detailScale     986.377
		colorConversion true
		snowLevel       2
		tropicLatitude  0.986787
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.562014
		terraceProb     0.162683
		erosion         0
		montesMagn      0.423028
		montesFreq      2.13399
		montesSpiky     0.963475
		montesFraction  0.0793289
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.46171
		hillsFraction   0.793459
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255948
		craterFreq      0.264446
		craterDensity   0.911541
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.529617
		volcanoTemp     1510.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.277, 0.276, 0.276, 0.000)
		colorShelf     (0.294, 0.293, 0.293, 0.000)
		colorBeach     (0.311, 0.311, 0.310, 0.000)
		colorDesert    (0.329, 0.328, 0.327, 0.000)
		colorLowland   (0.346, 0.345, 0.344, 0.000)
		colorUpland    (0.363, 0.362, 0.362, 0.000)
		colorRock      (0.381, 0.380, 0.379, 0.000)
		colorSnow      (0.398, 0.397, 0.396, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.901944
		GasToDust   0.25
		Particles   2801
		GasBright   0.0752898
		DustBright  0.361406
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   17.0553
		Period          84.2927
		Eccentricity    0.966728
		Inclination     -96.3404
		AscendingNode   1.15641
		ArgOfPericenter 45.4975
		MeanAnomaly     78.0721
	}
}

Comet	"Dellalt System C32"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            4.96646e-016
	Radius          0.101952
	InertiaMoment   0.398821

	Oblateness      0.00288809

	RotationPeriod  83.8205
	Obliquity       310.221
	EqAscendNode    112.737

	AbsMagn         -1.13709
	SlopeParam      5.80351
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.710 0.576 0.487)

	Surface
	{
		SurfStyle       0.121998
		OceanStyle      0.609587
		Randomize      (0.438, -0.282, -0.971)
		colorDistMagn   0.903364
		colorDistFreq   5.06832e-006
		detailScale     2.78396
		colorConversion true
		snowLevel       2
		tropicLatitude  0.694139
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.494451
		terraceProb     0.610352
		erosion         0
		montesMagn      0.531662
		montesFreq      2.61331
		montesSpiky     0.894058
		montesFraction  0.644145
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.97103e-005
		hillsFraction   0.596502
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237813
		craterFreq      0.252808
		craterDensity   0.797685
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.518171
		volcanoTemp     1344.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.284, 0.231, 0.195, 0.000)
		colorShelf     (0.302, 0.245, 0.207, 0.000)
		colorBeach     (0.319, 0.259, 0.219, 0.000)
		colorDesert    (0.337, 0.274, 0.231, 0.000)
		colorLowland   (0.355, 0.288, 0.244, 0.000)
		colorUpland    (0.373, 0.303, 0.256, 0.000)
		colorRock      (0.390, 0.317, 0.268, 0.000)
		colorSnow      (0.408, 0.331, 0.280, 1.000)
		BumpHeight      0.0917565
		BumpOffset      0.0183513
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.21321
		DustBright  0.707972
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   14.0059
		Period          62.7287
		Eccentricity    0.968083
		Inclination     -150.708
		AscendingNode   65.2052
		ArgOfPericenter 35.0444
		MeanAnomaly     166.398
	}
}

Comet	"Dellalt System C33"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            3.84119e-012
	Radius          2.23743
	InertiaMoment   0.397041

	Oblateness      0.00420209

	RotationPeriod  80.965
	Obliquity       263.427
	EqAscendNode    97.3141

	AbsMagn         9.71413
	SlopeParam      6.92918
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.767 0.765 0.761)

	Surface
	{
		SurfStyle       0.306091
		OceanStyle      0.758067
		Randomize      (0.618, -0.385, 0.366)
		colorDistMagn   0.820417
		colorDistFreq   0.00188718
		detailScale     61.0968
		colorConversion true
		snowLevel       2
		tropicLatitude  0.823737
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.649557
		terraceProb     0.449047
		erosion         0
		montesMagn      0.499148
		montesFreq      1.94755
		montesSpiky     0.924066
		montesFraction  0.661664
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00988675
		hillsFraction   0.682372
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251577
		craterFreq      0.236926
		craterDensity   0.828298
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.435221
		volcanoTemp     1630.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.307, 0.306, 0.304, 0.000)
		colorShelf     (0.326, 0.325, 0.323, 0.000)
		colorBeach     (0.345, 0.344, 0.342, 0.000)
		colorDesert    (0.365, 0.363, 0.362, 0.000)
		colorLowland   (0.384, 0.383, 0.381, 0.000)
		colorUpland    (0.403, 0.402, 0.400, 0.000)
		colorRock      (0.422, 0.421, 0.419, 0.000)
		colorSnow      (0.441, 0.440, 0.438, 1.000)
		BumpHeight      2.01369
		BumpOffset      0.402738
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.453578
		GasToDust   0.25
		Particles   1896
		GasBright   0.175946
		DustBright  0.429723
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   9.2133
		Period          33.4675
		Eccentricity    0.897392
		Inclination     -136.161
		AscendingNode   -19.2673
		ArgOfPericenter 132.787
		MeanAnomaly     61.1871
	}
}

Comet	"Dellalt System C34"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            2.97089e-008
	Radius          39.786
	InertiaMoment   0.39929

	Oblateness      0.00329369

	RotationPeriod  78.3033
	Obliquity       216.632
	EqAscendNode    81.8915

	AbsMagn         6.21955
	SlopeParam      2.31115
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.692 0.687 0.683)

	Surface
	{
		SurfStyle       0.938621
		OceanStyle      0.666004
		Randomize      (0.838, -0.002, 0.267)
		colorDistMagn   0.497471
		colorDistFreq   0.886892
		detailScale     1086.42
		colorConversion true
		snowLevel       2
		tropicLatitude  0.295345
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.449401
		terraceProb     0.153318
		erosion         0
		montesMagn      0.434516
		montesFreq      2.35893
		montesSpiky     0.896125
		montesFraction  0.787129
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.66261
		hillsFraction   0.547884
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.267028
		craterFreq      0.255333
		craterDensity   1.00019
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.466307
		volcanoTemp     1525.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.235, 0.240, 0.273, 0.050)
		colorShelf     (0.277, 0.282, 0.314, 0.040)
		colorBeach     (0.318, 0.323, 0.355, 0.030)
		colorDesert    (0.360, 0.364, 0.403, 0.020)
		colorLowland   (0.401, 0.405, 0.444, 0.030)
		colorUpland    (0.443, 0.447, 0.485, 0.050)
		colorRock      (0.484, 0.488, 0.540, 0.020)
		colorSnow      (0.484, 0.488, 0.540, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.93477
		GasToDust   0.25
		Particles   2868
		GasBright   0.101422
		DustBright  0.188734
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   26.3384
		Period          161.765
		Eccentricity    0.97423
		Inclination     -26.0417
		AscendingNode   -26.5252
		ArgOfPericenter 105.318
		MeanAnomaly     -63.0211
	}
}

Comet	"Dellalt System C35"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            9.14761e-016
	Radius          0.138588
	InertiaMoment   0.397953

	Oblateness      0.00480091

	RotationPeriod  75.7977
	Obliquity       169.838
	EqAscendNode    66.469

	AbsMagn         16.4623
	SlopeParam      3.01562
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.549 0.545 0.540)

	Surface
	{
		SurfStyle       0.054205
		OceanStyle      0.827149
		Randomize      (-0.328, 0.513, 0.373)
		colorDistMagn   0.480746
		colorDistFreq   5.56642e-006
		detailScale     3.78439
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997153
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.483006
		terraceProb     0.512204
		erosion         0
		montesMagn      0.526818
		montesFreq      3.05027
		montesSpiky     0.832437
		montesFraction  0.620585
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.82762e-005
		hillsFraction   0.800216
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.212658
		craterFreq      0.245014
		craterDensity   0.985975
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.609957
		volcanoTemp     1618.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.219, 0.218, 0.216, 0.000)
		colorShelf     (0.233, 0.232, 0.230, 0.000)
		colorBeach     (0.247, 0.245, 0.243, 0.000)
		colorDesert    (0.261, 0.259, 0.257, 0.000)
		colorLowland   (0.274, 0.273, 0.270, 0.000)
		colorUpland    (0.288, 0.286, 0.284, 0.000)
		colorRock      (0.302, 0.300, 0.297, 0.000)
		colorSnow      (0.315, 0.314, 0.311, 1.000)
		BumpHeight      0.12473
		BumpOffset      0.0249459
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.31651
		DustBright  0.458132
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   14.4366
		Period          65.6448
		Eccentricity    0.957887
		Inclination     -93.8711
		AscendingNode   87.0868
		ArgOfPericenter -4.77086
		MeanAnomaly     115.922
	}
}

Comet	"Dellalt System C36"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            7.07501e-012
	Radius          2.46034
	InertiaMoment   0.399722

	Oblateness      0.00372627

	RotationPeriod  73.4201
	Obliquity       123.044
	EqAscendNode    51.0464

	AbsMagn         9.48807
	SlopeParam      3.61344
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.546 0.394 0.305)

	Surface
	{
		SurfStyle       0.211035
		OceanStyle      0.807633
		Randomize      (-0.541, -0.143, 0.144)
		colorDistMagn   0.721743
		colorDistFreq   0.00332045
		detailScale     67.1837
		colorConversion true
		snowLevel       2
		tropicLatitude  0.989014
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.31434
		terraceProb     0.307729
		erosion         0
		montesMagn      0.419169
		montesFreq      2.36073
		montesSpiky     0.960659
		montesFraction  0.851134
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00925017
		hillsFraction   0.71974
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231165
		craterFreq      0.222712
		craterDensity   0.812991
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.562304
		volcanoTemp     1433.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.218, 0.158, 0.122, 0.000)
		colorShelf     (0.232, 0.167, 0.130, 0.000)
		colorBeach     (0.246, 0.177, 0.137, 0.000)
		colorDesert    (0.259, 0.187, 0.145, 0.000)
		colorLowland   (0.273, 0.197, 0.152, 0.000)
		colorUpland    (0.287, 0.207, 0.160, 0.000)
		colorRock      (0.300, 0.217, 0.168, 0.000)
		colorSnow      (0.314, 0.227, 0.175, 1.000)
		BumpHeight      2.21431
		BumpOffset      0.442862
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.486404
		GasToDust   0.25
		Particles   1962
		GasBright   0.214704
		DustBright  0.244425
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   9.99834
		Period          37.8349
		Eccentricity    0.95765
		Inclination     140.658
		AscendingNode   58.976
		ArgOfPericenter -154.315
		MeanAnomaly     130.969
	}
}

Comet	"Dellalt System C37"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            5.47201e-008
	Radius          54.1632
	InertiaMoment   0.398565

	Oblateness      0.00544997

	RotationPeriod  71.1485
	Obliquity       76.2496
	EqAscendNode    35.6238

	AbsMagn         5.98605
	SlopeParam      4.17793
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.644 0.643 0.640)

	Surface
	{
		SurfStyle       0.64584
		OceanStyle      0.849903
		Randomize      (0.741, 0.991, -0.129)
		colorDistMagn   0.452951
		colorDistFreq   1.15542
		detailScale     1479.02
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997428
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.515444
		terraceProb     0.318813
		erosion         0
		montesMagn      0.314993
		montesFreq      2.85521
		montesSpiky     0.931636
		montesFraction  0.681309
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.04592
		hillsFraction   0.352832
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229887
		craterFreq      0.202969
		craterDensity   0.853957
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.55241
		volcanoTemp     1424.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.251, 0.219, 0.179, 0.000)
		colorShelf     (0.258, 0.225, 0.205, 0.000)
		colorBeach     (0.303, 0.264, 0.243, 0.000)
		colorDesert    (0.329, 0.283, 0.237, 0.000)
		colorLowland   (0.361, 0.302, 0.269, 0.000)
		colorUpland    (0.400, 0.366, 0.327, 0.000)
		colorRock      (0.432, 0.399, 0.352, 0.000)
		colorSnow      (0.470, 0.424, 0.371, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.967596
		GasToDust   0.25
		Particles   2934
		GasBright   0.025175
		DustBright  0.91844
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   12.2817
		Period          51.5095
		Eccentricity    0.943701
		Inclination     -18.0239
		AscendingNode   -172.108
		ArgOfPericenter -102.153
		MeanAnomaly     156.142
	}
}

Comet	"Dellalt System C38"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            1.68487e-015
	Radius          0.152116
	InertiaMoment   0.396186

	Oblateness      0.004136

	RotationPeriod  68.9656
	Obliquity       29.4553
	EqAscendNode    20.2012

	AbsMagn         15.0976
	SlopeParam      4.75728
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.516 0.512 0.505)

	Surface
	{
		SurfStyle       0.84061
		OceanStyle      0.873538
		Randomize      (-0.882, -0.596, -0.228)
		colorDistMagn   0.386283
		colorDistFreq   1.30264e-005
		detailScale     4.15379
		colorConversion true
		snowLevel       2
		tropicLatitude  0.96594
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.35165
		terraceProb     0.164552
		erosion         0
		montesMagn      0.391824
		montesFreq      2.80532
		montesSpiky     0.954465
		montesFraction  0.12903
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.37858e-005
		hillsFraction   0.71106
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248573
		craterFreq      0.252733
		craterDensity   0.938703
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.553952
		volcanoTemp     1833.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.201, 0.174, 0.142, 0.000)
		colorShelf     (0.206, 0.179, 0.162, 0.000)
		colorBeach     (0.242, 0.210, 0.192, 0.000)
		colorDesert    (0.263, 0.225, 0.187, 0.000)
		colorLowland   (0.289, 0.241, 0.212, 0.000)
		colorUpland    (0.320, 0.292, 0.258, 0.000)
		colorRock      (0.345, 0.317, 0.278, 0.000)
		colorSnow      (0.376, 0.338, 0.293, 1.000)
		BumpHeight      0.136905
		BumpOffset      0.0273809
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0380376
		GasToDust   0.25
		Particles   1056
		GasBright   0.0538438
		DustBright  0.574258
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   17.0657
		Period          84.3696
		Eccentricity    0.957078
		Inclination     -59.1522
		AscendingNode   116.4
		ArgOfPericenter 141.775
		MeanAnomaly     -28.005
	}
}

Comet	"Dellalt System C39"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            1.30313e-011
	Radius          3.35492
	InertiaMoment   0.399065

	Oblateness      0.00617075

	RotationPeriod  66.8572
	Obliquity       342.661
	EqAscendNode    4.7786

	AbsMagn         9.26667
	SlopeParam      5.41003
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.669 0.608 0.512)

	Surface
	{
		SurfStyle       0.701725
		OceanStyle      0.549857
		Randomize      (-0.447, -0.155, -0.583)
		colorDistMagn   0.417598
		colorDistFreq   0.00804427
		detailScale     91.6118
		colorConversion true
		snowLevel       2
		tropicLatitude  0.46665
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.460829
		terraceProb     0.637485
		erosion         0
		montesMagn      0.390512
		montesFreq      3.18883
		montesSpiky     0.89305
		montesFraction  0.678186
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0299803
		hillsFraction   0.790795
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252653
		craterFreq      0.150904
		craterDensity   0.880391
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.469989
		volcanoTemp     974.261
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.261, 0.207, 0.143, 0.000)
		colorShelf     (0.267, 0.213, 0.164, 0.000)
		colorBeach     (0.314, 0.249, 0.194, 0.000)
		colorDesert    (0.341, 0.268, 0.189, 0.000)
		colorLowland   (0.374, 0.286, 0.215, 0.000)
		colorUpland    (0.415, 0.347, 0.261, 0.000)
		colorRock      (0.448, 0.377, 0.281, 0.000)
		colorSnow      (0.488, 0.402, 0.297, 1.000)
		BumpHeight      3.01943
		BumpOffset      0.603886
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.51923
		GasToDust   0.25
		Particles   2028
		GasBright   0.0452534
		DustBright  0.267335
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   12.4611
		Period          52.6422
		Eccentricity    0.955119
		Inclination     -25.8813
		AscendingNode   101.361
		ArgOfPericenter -8.57109
		MeanAnomaly     84.3957
	}
}

Comet	"Dellalt System C40"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            1.00788e-007
	Radius          59.3268
	InertiaMoment   0.397566

	Oblateness      0.00466843

	RotationPeriod  64.8116
	Obliquity       295.867
	EqAscendNode    349.356

	AbsMagn         5.74547
	SlopeParam      6.2687
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.583 0.577 0.572)

	Surface
	{
		SurfStyle       0.377612
		OceanStyle      0.0758145
		Randomize      (0.800, 0.203, -0.393)
		colorDistMagn   0.940114
		colorDistFreq   2.79883
		detailScale     1620.02
		colorConversion true
		snowLevel       2
		tropicLatitude  0.948102
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.353033
		terraceProb     0.336263
		erosion         0
		montesMagn      0.46547
		montesFreq      2.59267
		montesSpiky     0.89268
		montesFraction  0.570911
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.29212
		hillsFraction   0.632127
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248617
		craterFreq      0.210109
		craterDensity   0.807941
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.492065
		volcanoTemp     1476.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.233, 0.231, 0.229, 0.000)
		colorShelf     (0.248, 0.245, 0.243, 0.000)
		colorBeach     (0.263, 0.260, 0.257, 0.000)
		colorDesert    (0.277, 0.274, 0.272, 0.000)
		colorLowland   (0.292, 0.288, 0.286, 0.000)
		colorUpland    (0.306, 0.303, 0.300, 0.000)
		colorRock      (0.321, 0.317, 0.314, 0.000)
		colorSnow      (0.335, 0.332, 0.329, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.162456
		DustBright  0.634619
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   11.8613
		Period          48.8878
		Eccentricity    0.943815
		Inclination     -22.3711
		AscendingNode   75.5467
		ArgOfPericenter 24.3976
		MeanAnomaly     -15.2485
	}
}

Comet	"Dellalt System C41"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            3.10333e-015
	Radius          0.207808
	InertiaMoment   0.399512

	Oblateness      0.0069868

	RotationPeriod  62.819
	Obliquity       249.072
	EqAscendNode    333.933

	AbsMagn         14.2595
	SlopeParam      8.27653
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.599 0.592 0.587)

	Surface
	{
		SurfStyle       0.293268
		OceanStyle      0.456963
		Randomize      (-0.924, -0.749, -0.200)
		colorDistMagn   0.646618
		colorDistFreq   1.17435e-005
		detailScale     5.67454
		colorConversion true
		snowLevel       2
		tropicLatitude  0.780358
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.478443
		terraceProb     0.478514
		erosion         0
		montesMagn      0.542184
		montesFreq      3.46558
		montesSpiky     0.715643
		montesFraction  0.2687
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000137886
		hillsFraction   0.530795
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227748
		craterFreq      0.198369
		craterDensity   0.952549
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.522023
		volcanoTemp     1818.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.239, 0.237, 0.235, 0.000)
		colorShelf     (0.254, 0.252, 0.250, 0.000)
		colorBeach     (0.269, 0.266, 0.264, 0.000)
		colorDesert    (0.284, 0.281, 0.279, 0.000)
		colorLowland   (0.299, 0.296, 0.294, 0.000)
		colorUpland    (0.314, 0.311, 0.308, 0.000)
		colorRock      (0.329, 0.326, 0.323, 0.000)
		colorSnow      (0.344, 0.341, 0.338, 1.000)
		BumpHeight      0.187027
		BumpOffset      0.0374054
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0708636
		GasToDust   0.25
		Particles   1122
		GasBright   0.126583
		DustBright  0.354978
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   13.3301
		Period          58.2442
		Eccentricity    0.974409
		Inclination     17.9144
		AscendingNode   173.511
		ArgOfPericenter -103.02
		MeanAnomaly     149.808
	}
}

Comet	"Dellalt System C42"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            2.4002e-011
	Radius          3.666
	InertiaMoment   0.398283

	Oblateness      0.00525789

	RotationPeriod  60.8708
	Obliquity       202.278
	EqAscendNode    318.511

	AbsMagn         9.04908
	SlopeParam      2.67911
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.637 0.632 0.628)

	Surface
	{
		SurfStyle       0.312372
		OceanStyle      0.943981
		Randomize      (-0.929, -0.071, -0.868)
		colorDistMagn   0.452193
		colorDistFreq   0.00728909
		detailScale     100.106
		colorConversion true
		snowLevel       2
		tropicLatitude  0.870749
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.551542
		terraceProb     0.342082
		erosion         0
		montesMagn      0.47308
		montesFreq      3.40177
		montesSpiky     0.96955
		montesFraction  0.844366
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.029862
		hillsFraction   0.624406
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238545
		craterFreq      0.213506
		craterDensity   0.884757
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.457738
		volcanoTemp     1689.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.255, 0.253, 0.251, 0.000)
		colorShelf     (0.271, 0.268, 0.267, 0.000)
		colorBeach     (0.286, 0.284, 0.283, 0.000)
		colorDesert    (0.302, 0.300, 0.298, 0.000)
		colorLowland   (0.318, 0.316, 0.314, 0.000)
		colorUpland    (0.334, 0.332, 0.330, 0.000)
		colorRock      (0.350, 0.347, 0.345, 0.000)
		colorSnow      (0.366, 0.363, 0.361, 1.000)
		BumpHeight      3.2994
		BumpOffset      0.65988
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.552056
		GasToDust   0.25
		Particles   2095
		GasBright   0.310976
		DustBright  0.655072
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   17.365
		Period          86.5987
		Eccentricity    0.953217
		Inclination     38.3229
		AscendingNode   4.84325
		ArgOfPericenter -44.7574
		MeanAnomaly     69.1399
	}
}

Comet	"Dellalt System C43"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            1.85638e-007
	Radius          81.2161
	InertiaMoment   0.399935

	Oblateness      0.0079276

	RotationPeriod  58.9596
	Obliquity       155.484
	EqAscendNode    303.088

	AbsMagn         5.49644
	SlopeParam      3.31805
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.724 0.721 0.720)

	Surface
	{
		SurfStyle       0.73246
		OceanStyle      0.964526
		Randomize      (-0.714, -0.477, -0.487)
		colorDistMagn   0.261779
		colorDistFreq   4.05443
		detailScale     2217.74
		colorConversion true
		snowLevel       2
		tropicLatitude  0.517365
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.459724
		terraceProb     0.121606
		erosion         0
		montesMagn      0.585754
		montesFreq      2.91603
		montesSpiky     0.754511
		montesFraction  0.61033
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.99235
		hillsFraction   0.840125
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264008
		craterFreq      0.155802
		craterDensity   0.970737
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.445352
		volcanoTemp     1260.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.282, 0.245, 0.202, 0.000)
		colorShelf     (0.289, 0.252, 0.230, 0.000)
		colorBeach     (0.340, 0.296, 0.274, 0.000)
		colorDesert    (0.369, 0.317, 0.266, 0.000)
		colorLowland   (0.405, 0.339, 0.302, 0.000)
		colorUpland    (0.449, 0.411, 0.367, 0.000)
		colorRock      (0.485, 0.447, 0.396, 0.000)
		colorSnow      (0.528, 0.476, 0.418, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.247822
		DustBright  0.402713
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   13.7142
		Period          60.7793
		Eccentricity    0.958985
		Inclination     -54.8314
		AscendingNode   167.931
		ArgOfPericenter 112.677
		MeanAnomaly     158.467
	}
}

Comet	"Dellalt System C44"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            5.71592e-015
	Radius          0.226442
	InertiaMoment   0.398827

	Oblateness      0.00592955

	RotationPeriod  57.0788
	Obliquity       108.69
	EqAscendNode    287.666

	AbsMagn         13.6307
	SlopeParam      3.89285
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.795 0.792 0.790)

	Surface
	{
		SurfStyle       0.0790608
		OceanStyle      0.962866
		Randomize      (0.245, -0.967, 0.239)
		colorDistMagn   0.736278
		colorDistFreq   7.61986e-006
		detailScale     6.18338
		colorConversion true
		snowLevel       2
		tropicLatitude  0.90211
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.697129
		terraceProb     0.165828
		erosion         0
		montesMagn      0.471816
		montesFreq      2.15042
		montesSpiky     0.841522
		montesFraction  0.163441
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000123882
		hillsFraction   0.497298
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264097
		craterFreq      0.188011
		craterDensity   0.774275
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.444872
		volcanoTemp     1104.53
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.318, 0.317, 0.316, 0.000)
		colorShelf     (0.338, 0.337, 0.336, 0.000)
		colorBeach     (0.358, 0.356, 0.356, 0.000)
		colorDesert    (0.378, 0.376, 0.375, 0.000)
		colorLowland   (0.397, 0.396, 0.395, 0.000)
		colorUpland    (0.417, 0.416, 0.415, 0.000)
		colorRock      (0.437, 0.436, 0.435, 0.000)
		colorSnow      (0.457, 0.455, 0.454, 1.000)
		BumpHeight      0.203798
		BumpOffset      0.0407596
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.103689
		GasToDust   0.25
		Particles   1189
		GasBright   0.147408
		DustBright  0.187613
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   13.7752
		Period          61.1856
		Eccentricity    0.933682
		Inclination     -10.4489
		AscendingNode   -132.643
		ArgOfPericenter 95.0846
		MeanAnomaly     26.9097
	}
}

Comet	"Dellalt System C45"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            4.42086e-011
	Radius          5.03064
	InertiaMoment   0.397056

	Oblateness      0.00892142

	RotationPeriod  55.2225
	Obliquity       61.8952
	EqAscendNode    272.243

	AbsMagn         8.83456
	SlopeParam      4.45877
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.782 0.778 0.777)

	Surface
	{
		SurfStyle       0.247188
		OceanStyle      0.232162
		Randomize      (-0.530, 0.033, -0.756)
		colorDistMagn   0.308506
		colorDistFreq   0.0154567
		detailScale     137.37
		colorConversion true
		snowLevel       2
		tropicLatitude  0.915038
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.692199
		terraceProb     0.119248
		erosion         0
		montesMagn      0.326628
		montesFreq      2.58728
		montesSpiky     0.924268
		montesFraction  0.726115
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0433565
		hillsFraction   0.648026
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233871
		craterFreq      0.165275
		craterDensity   1.02211
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.494659
		volcanoTemp     1260.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.313, 0.311, 0.311, 0.000)
		colorShelf     (0.332, 0.331, 0.330, 0.000)
		colorBeach     (0.352, 0.350, 0.349, 0.000)
		colorDesert    (0.372, 0.370, 0.369, 0.000)
		colorLowland   (0.391, 0.389, 0.388, 0.000)
		colorUpland    (0.411, 0.409, 0.408, 0.000)
		colorRock      (0.430, 0.428, 0.427, 0.000)
		colorSnow      (0.450, 0.448, 0.447, 1.000)
		BumpHeight      4.52758
		BumpOffset      0.905515
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.584881
		GasToDust   0.25
		Particles   2161
		GasBright   0.408968
		DustBright  0.41054
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   13.7154
		Period          60.7874
		Eccentricity    0.937853
		Inclination     10.4629
		AscendingNode   68.0469
		ArgOfPericenter -156.683
		MeanAnomaly     56.3188
	}
}

Comet	"Dellalt System C46"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            3.41922e-007
	Radius          88.2022
	InertiaMoment   0.399295

	Oblateness      0.00670839

	RotationPeriod  53.3851
	Obliquity       15.1009
	EqAscendNode    256.82

	AbsMagn         5.23731
	SlopeParam      5.06489
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.587 0.584 0.579)

	Surface
	{
		SurfStyle       0.978234
		OceanStyle      0.271794
		Randomize      (0.213, -0.542, -0.949)
		colorDistMagn   0.578809
		colorDistFreq   2.48365
		detailScale     2408.51
		colorConversion true
		snowLevel       2
		tropicLatitude  0.547201
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.509961
		terraceProb     0.26463
		erosion         0
		montesMagn      0.405131
		montesFreq      3.21287
		montesSpiky     0.981277
		montesFraction  0.409233
		dunesFraction   0
		hillsMagn       0
		hillsFreq       18.2899
		hillsFraction   0.495064
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.273201
		craterFreq      0.323085
		craterDensity   0.675402
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.532896
		volcanoTemp     991.611
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.199, 0.204, 0.231, 0.050)
		colorShelf     (0.235, 0.239, 0.266, 0.040)
		colorBeach     (0.270, 0.274, 0.301, 0.030)
		colorDesert    (0.305, 0.309, 0.341, 0.020)
		colorLowland   (0.340, 0.344, 0.376, 0.030)
		colorUpland    (0.376, 0.379, 0.411, 0.050)
		colorRock      (0.411, 0.414, 0.457, 0.020)
		colorSnow      (0.411, 0.414, 0.457, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0292753
		DustBright  0.474719
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   15.7455
		Period          74.7712
		Eccentricity    0.971524
		Inclination     154.812
		AscendingNode   109.311
		ArgOfPericenter 34.4859
		MeanAnomaly     20.7994
	}
}

Comet	"Dellalt System C47"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            1.0528e-014
	Radius          0.311605
	InertiaMoment   0.397962

	Oblateness      0.0102468

	RotationPeriod  51.5618
	Obliquity       328.307
	EqAscendNode    241.398

	AbsMagn         13.1166
	SlopeParam      5.79196
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.659 0.572 0.508)

	Surface
	{
		SurfStyle       0.679246
		OceanStyle      0.657558
		Randomize      (0.002, 0.526, -0.977)
		colorDistMagn   0.891261
		colorDistFreq   4.78757e-005
		detailScale     8.5089
		colorConversion true
		snowLevel       2
		tropicLatitude  0.592525
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.444231
		terraceProb     0.431463
		erosion         0
		montesMagn      0.497357
		montesFreq      2.57588
		montesSpiky     0.864961
		montesFraction  0.410139
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000266936
		hillsFraction   0.616443
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238773
		craterFreq      0.24841
		craterDensity   1.06722
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.552035
		volcanoTemp     1557.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.257, 0.194, 0.142, 0.000)
		colorShelf     (0.264, 0.200, 0.162, 0.000)
		colorBeach     (0.310, 0.234, 0.193, 0.000)
		colorDesert    (0.336, 0.251, 0.188, 0.000)
		colorLowland   (0.369, 0.269, 0.213, 0.000)
		colorUpland    (0.409, 0.326, 0.259, 0.000)
		colorRock      (0.442, 0.354, 0.279, 0.000)
		colorSnow      (0.481, 0.377, 0.295, 1.000)
		BumpHeight      0.280445
		BumpOffset      0.056089
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.136515
		GasToDust   0.25
		Particles   1255
		GasBright   0.115783
		DustBright  0.872699
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   15.3518
		Period          71.9847
		Eccentricity    0.974719
		Inclination     19.9825
		AscendingNode   -88.1152
		ArgOfPericenter -107.722
		MeanAnomaly     84.5549
	}
}

Comet	"Dellalt System C48"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            8.14267e-011
	Radius          5.4405
	InertiaMoment   0.399727

	Oblateness      0.00762534

	RotationPeriod  49.7475
	Obliquity       281.512
	EqAscendNode    225.975

	AbsMagn         8.62241
	SlopeParam      6.90681
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.584 0.580 0.575)

	Surface
	{
		SurfStyle       0.869843
		OceanStyle      0.684456
		Randomize      (0.886, 0.446, -0.761)
		colorDistMagn   0.68267
		colorDistFreq   0.0144115
		detailScale     148.562
		colorConversion true
		snowLevel       2
		tropicLatitude  0.374727
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.306416
		terraceProb     0.250122
		erosion         0
		montesMagn      0.46182
		montesFreq      2.89602
		montesSpiky     0.885726
		montesFraction  0.392003
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0658164
		hillsFraction   0.394511
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228835
		craterFreq      0.231074
		craterDensity   0.929929
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.489073
		volcanoTemp     1365.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.198, 0.203, 0.230, 0.050)
		colorShelf     (0.233, 0.238, 0.264, 0.040)
		colorBeach     (0.268, 0.273, 0.299, 0.030)
		colorDesert    (0.304, 0.307, 0.339, 0.020)
		colorLowland   (0.339, 0.342, 0.373, 0.030)
		colorUpland    (0.374, 0.377, 0.408, 0.050)
		colorRock      (0.409, 0.412, 0.454, 0.020)
		colorSnow      (0.409, 0.412, 0.454, 1.000)
		BumpHeight      4.89645
		BumpOffset      0.97929
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.617707
		GasToDust   0.25
		Particles   2227
		GasBright   0.118562
		DustBright  0.554406
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   13.9306
		Period          62.2235
		Eccentricity    0.943783
		Inclination     94.5598
		AscendingNode   -158.896
		ArgOfPericenter -13.0006
		MeanAnomaly     -113.823
	}
}

Comet	"Dellalt System C49"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            6.29777e-007
	Radius          121.783
	InertiaMoment   0.398572

	Oblateness      0.0118575

	RotationPeriod  47.9377
	Obliquity       234.718
	EqAscendNode    210.553

	AbsMagn         4.96602
	SlopeParam      2.3001
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.560 0.557 0.552)

	Surface
	{
		SurfStyle       0.765268
		OceanStyle      0.636876
		Randomize      (0.333, -0.088, 0.203)
		colorDistMagn   0.673107
		colorDistFreq   12.4392
		detailScale     3325.49
		colorConversion true
		snowLevel       2
		tropicLatitude  1
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.339032
		terraceProb     0.144237
		erosion         0
		montesMagn      0.483148
		montesFreq      2.75782
		montesSpiky     0.902832
		montesFraction  0.602513
		dunesFraction   0
		hillsMagn       0
		hillsFreq       42.5193
		hillsFraction   0.392479
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.210242
		craterFreq      0.621482
		craterDensity   0.762463
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.586784
		volcanoTemp     1657.82
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.218, 0.189, 0.155, 0.000)
		colorShelf     (0.224, 0.195, 0.177, 0.000)
		colorBeach     (0.263, 0.228, 0.210, 0.000)
		colorDesert    (0.285, 0.245, 0.204, 0.000)
		colorLowland   (0.313, 0.262, 0.232, 0.000)
		colorUpland    (0.347, 0.317, 0.281, 0.000)
		colorRock      (0.375, 0.345, 0.303, 0.000)
		colorSnow      (0.408, 0.367, 0.320, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0840812
		DustBright  0.273373
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   15.4483
		Period          72.6643
		Eccentricity    0.955554
		Inclination     102.845
		AscendingNode   99.3397
		ArgOfPericenter 175.965
		MeanAnomaly     147.504
	}
}

Comet	"Dellalt System C50"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            1.93913e-014
	Radius          0.335117
	InertiaMoment   0.396218

	Oblateness      0.00859003

	RotationPeriod  46.1277
	Obliquity       187.924
	EqAscendNode    195.13

	AbsMagn         12.6754
	SlopeParam      3.0069
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.444 0.438 0.435)

	Surface
	{
		SurfStyle       0.391713
		OceanStyle      0.53205
		Randomize      (-0.361, 0.418, -0.184)
		colorDistMagn   0.939451
		colorDistFreq   9.59624e-005
		detailScale     9.15092
		colorConversion true
		snowLevel       2
		tropicLatitude  0.981772
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.578124
		terraceProb     0.140196
		erosion         0
		montesMagn      0.556154
		montesFreq      2.29568
		montesSpiky     0.97852
		montesFraction  0.370252
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000196727
		hillsFraction   0.601348
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240155
		craterFreq      0.258588
		craterDensity   0.843958
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.554599
		volcanoTemp     1605.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.178, 0.175, 0.174, 0.000)
		colorShelf     (0.189, 0.186, 0.185, 0.000)
		colorBeach     (0.200, 0.197, 0.196, 0.000)
		colorDesert    (0.211, 0.208, 0.207, 0.000)
		colorLowland   (0.222, 0.219, 0.218, 0.000)
		colorUpland    (0.233, 0.230, 0.228, 0.000)
		colorRock      (0.244, 0.241, 0.239, 0.000)
		colorSnow      (0.255, 0.252, 0.250, 1.000)
		BumpHeight      0.301605
		BumpOffset      0.060321
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.169341
		GasToDust   0.25
		Particles   1321
		GasBright   0.247756
		DustBright  0.594185
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   8.95617
		Period          32.0763
		Eccentricity    0.93695
		Inclination     108.782
		AscendingNode   170.818
		ArgOfPericenter -155.128
		MeanAnomaly     175.18
	}
}

Comet	"Dellalt System C51"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            1.49978e-010
	Radius          7.54346
	InertiaMoment   0.399071

	Oblateness      0.0138742

	RotationPeriod  44.3129
	Obliquity       141.129
	EqAscendNode    179.708

	AbsMagn         8.412
	SlopeParam      3.60557
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.793 0.791 0.789)

	Surface
	{
		SurfStyle       0.585143
		OceanStyle      0.151046
		Randomize      (-0.838, 0.618, 0.135)
		colorDistMagn   0.550878
		colorDistFreq   0.0235296
		detailScale     205.987
		colorConversion true
		snowLevel       2
		tropicLatitude  0.463578
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.692792
		terraceProb     0.254962
		erosion         0
		montesMagn      0.546193
		montesFreq      3.02855
		montesSpiky     0.964102
		montesFraction  0.566724
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.154958
		hillsFraction   0.637645
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.28098
		craterFreq      0.226226
		craterDensity   1.06723
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.495127
		volcanoTemp     1555.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.309, 0.269, 0.221, 0.000)
		colorShelf     (0.317, 0.277, 0.252, 0.000)
		colorBeach     (0.373, 0.324, 0.300, 0.000)
		colorDesert    (0.405, 0.348, 0.292, 0.000)
		colorLowland   (0.444, 0.372, 0.331, 0.000)
		colorUpland    (0.492, 0.451, 0.402, 0.000)
		colorRock      (0.532, 0.490, 0.434, 0.000)
		colorSnow      (0.579, 0.522, 0.458, 1.000)
		BumpHeight      6.78912
		BumpOffset      1.35782
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.650533
		GasToDust   0.25
		Particles   2294
		GasBright   0.185994
		DustBright  0.340434
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   16.9738
		Period          83.689
		Eccentricity    0.95497
		Inclination     -115.072
		AscendingNode   11.9399
		ArgOfPericenter 140.767
		MeanAnomaly     -166.976
	}
}

Comet	"Dellalt System C52"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            4.61794e-018
	Radius          0.0205834
	InertiaMoment   0.397577

	Oblateness      0.00990157

	RotationPeriod  42.4887
	Obliquity       94.3351
	EqAscendNode    164.285

	AbsMagn         4.67999
	SlopeParam      4.17019
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.662 0.658 0.653)

	Surface
	{
		SurfStyle       0.432123
		OceanStyle      0.989458
		Randomize      (0.180, -0.688, -0.021)
		colorDistMagn   0.541027
		colorDistFreq   3.66351e-007
		detailScale     0.562064
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999498
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.684214
		terraceProb     0.22773
		erosion         0
		montesMagn      0.488184
		montesFreq      3.46159
		montesSpiky     0.930274
		montesFraction  0.304386
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.35138e-006
		hillsFraction   0.53139
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235633
		craterFreq      0.223964
		craterDensity   0.953544
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.399179
		volcanoTemp     1687.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.265, 0.263, 0.261, 0.000)
		colorShelf     (0.281, 0.280, 0.278, 0.000)
		colorBeach     (0.298, 0.296, 0.294, 0.000)
		colorDesert    (0.314, 0.313, 0.310, 0.000)
		colorLowland   (0.331, 0.329, 0.327, 0.000)
		colorUpland    (0.347, 0.345, 0.343, 0.000)
		colorRock      (0.364, 0.362, 0.359, 0.000)
		colorSnow      (0.380, 0.378, 0.376, 1.000)
		BumpHeight      0.018525
		BumpOffset      0.00370501
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0869721
		DustBright  0.123942
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   17.9593
		Period          91.0821
		Eccentricity    0.974105
		Inclination     62.0796
		AscendingNode   90.2424
		ArgOfPericenter 57.2471
		MeanAnomaly     -106.643
	}
}

Comet	"Dellalt System C53"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            3.57163e-014
	Radius          0.467255
	InertiaMoment   0.399517

	Oblateness      0.0164808

	RotationPeriod  40.6503
	Obliquity       47.5409
	EqAscendNode    148.862

	AbsMagn         12.2848
	SlopeParam      4.749
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.762 0.759 0.756)

	Surface
	{
		SurfStyle       0.951005
		OceanStyle      0.665366
		Randomize      (0.021, -0.257, -0.394)
		colorDistMagn   0.136001
		colorDistFreq   0.000122262
		detailScale     12.7592
		colorConversion true
		snowLevel       2
		tropicLatitude  0.951621
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.633487
		terraceProb     0.375888
		erosion         0
		montesMagn      0.575239
		montesFreq      2.0372
		montesSpiky     0.843606
		montesFraction  0.335745
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000543389
		hillsFraction   0.62932
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238238
		craterFreq      0.179134
		craterDensity   0.980873
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.527249
		volcanoTemp     1644.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.259, 0.266, 0.302, 0.050)
		colorShelf     (0.305, 0.311, 0.348, 0.040)
		colorBeach     (0.350, 0.357, 0.393, 0.030)
		colorDesert    (0.396, 0.402, 0.446, 0.020)
		colorLowland   (0.442, 0.448, 0.491, 0.030)
		colorUpland    (0.488, 0.493, 0.537, 0.050)
		colorRock      (0.533, 0.539, 0.597, 0.020)
		colorSnow      (0.533, 0.539, 0.597, 1.000)
		BumpHeight      0.42053
		BumpOffset      0.0841059
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.202167
		GasToDust   0.25
		Particles   1388
		GasBright   0.327814
		DustBright  0.367586
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   14.3553
		Period          65.0907
		Eccentricity    0.949037
		Inclination     25.1978
		AscendingNode   -14.8878
		ArgOfPericenter -77.4921
		MeanAnomaly     165.389
	}
}

Comet	"Dellalt System C54"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            2.7624e-010
	Radius          7.89144
	InertiaMoment   0.39829

	Oblateness      0.0112202

	RotationPeriod  38.7925
	Obliquity       0.746553
	EqAscendNode    133.44

	AbsMagn         8.20272
	SlopeParam      5.40015
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.619 0.616 0.614)

	Surface
	{
		SurfStyle       0.941578
		OceanStyle      0.678056
		Randomize      (0.013, 0.374, 0.038)
		colorDistMagn   0.488306
		colorDistFreq   0.0406354
		detailScale     215.489
		colorConversion true
		snowLevel       2
		tropicLatitude  0.527942
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.394022
		terraceProb     0.4427
		erosion         0
		montesMagn      0.62571
		montesFreq      2.82065
		montesSpiky     0.893597
		montesFraction  0.286505
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.145561
		hillsFraction   0.648494
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230996
		craterFreq      0.165933
		craterDensity   1.01268
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.517411
		volcanoTemp     1584.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.211, 0.216, 0.246, 0.050)
		colorShelf     (0.248, 0.252, 0.282, 0.040)
		colorBeach     (0.285, 0.289, 0.319, 0.030)
		colorDesert    (0.322, 0.326, 0.362, 0.020)
		colorLowland   (0.359, 0.363, 0.399, 0.030)
		colorUpland    (0.396, 0.400, 0.436, 0.050)
		colorRock      (0.434, 0.437, 0.485, 0.020)
		colorSnow      (0.434, 0.437, 0.485, 1.000)
		BumpHeight      7.10229
		BumpOffset      1.42046
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.683359
		GasToDust   0.25
		Particles   2360
		GasBright   0.011567
		DustBright  0.36832
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   11.3978
		Period          46.0505
		Eccentricity    0.981858
		Inclination     -148.759
		AscendingNode   33.3844
		ArgOfPericenter 10.869
		MeanAnomaly     -71.1925
	}
}

Comet	"Dellalt System C55"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            8.50564e-018
	Radius          0.0289427
	InertiaMoment   0.39994

	Oblateness      0.0199814

	RotationPeriod  36.9098
	Obliquity       313.952
	EqAscendNode    118.017

	AbsMagn         4.37589
	SlopeParam      6.25407
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.816 0.733 0.693)

	Surface
	{
		SurfStyle       0.924891
		OceanStyle      0.725342
		Randomize      (0.372, 0.776, 0.665)
		colorDistMagn   0.919428
		colorDistFreq   6.94788e-007
		detailScale     0.790328
		colorConversion true
		snowLevel       2
		tropicLatitude  0.659225
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.590924
		terraceProb     0.229374
		erosion         0
		montesMagn      0.431795
		montesFreq      2.70858
		montesSpiky     0.920185
		montesFraction  0.678257
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.73015e-006
		hillsFraction   0.602745
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225003
		craterFreq      0.158802
		craterDensity   0.942526
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.475499
		volcanoTemp     1593.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.277, 0.257, 0.277, 0.050)
		colorShelf     (0.326, 0.300, 0.319, 0.040)
		colorBeach     (0.375, 0.344, 0.360, 0.030)
		colorDesert    (0.424, 0.388, 0.409, 0.020)
		colorLowland   (0.473, 0.432, 0.450, 0.030)
		colorUpland    (0.522, 0.476, 0.492, 0.050)
		colorRock      (0.571, 0.520, 0.547, 0.020)
		colorSnow      (0.571, 0.520, 0.547, 1.000)
		BumpHeight      0.0260484
		BumpOffset      0.00520968
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0773562
		DustBright  0.787018
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   18.2687
		Period          93.4466
		Eccentricity    0.953518
		Inclination     -5.46292
		AscendingNode   152.948
		ArgOfPericenter 88.402
		MeanAnomaly     -109.316
	}
}

Comet	"Dellalt System C56"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            6.5785e-014
	Radius          0.735312
	InertiaMoment   0.398833

	Oblateness      0.0469291

	RotationPeriod  34.9962
	Obliquity       267.158
	EqAscendNode    102.595

	AbsMagn         11.9313
	SlopeParam      8.20354
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.757 0.714 0.637)

	Surface
	{
		SurfStyle       0.720605
		OceanStyle      0.0115781
		Randomize      (0.201, 0.685, 0.825)
		colorDistMagn   0.912974
		colorDistFreq   0.000212691
		detailScale     20.0789
		colorConversion true
		snowLevel       2
		tropicLatitude  0.56175
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.419454
		terraceProb     0.422958
		erosion         0
		montesMagn      0.291486
		montesFreq      2.89456
		montesSpiky     0.869648
		montesFraction  0.666366
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00101825
		hillsFraction   0.522541
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.283056
		craterFreq      0.214748
		craterDensity   0.955968
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.43056
		volcanoTemp     1427.92
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.295, 0.243, 0.178, 0.000)
		colorShelf     (0.303, 0.250, 0.204, 0.000)
		colorBeach     (0.356, 0.293, 0.242, 0.000)
		colorDesert    (0.386, 0.314, 0.236, 0.000)
		colorLowland   (0.424, 0.336, 0.268, 0.000)
		colorUpland    (0.469, 0.407, 0.325, 0.000)
		colorRock      (0.507, 0.443, 0.351, 0.000)
		colorSnow      (0.553, 0.471, 0.370, 1.000)
		BumpHeight      0.661781
		BumpOffset      0.132356
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.234993
		GasToDust   0.25
		Particles   1454
		GasBright   0.0815272
		DustBright  0.467333
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   16.4932
		Period          80.1603
		Eccentricity    0.94616
		Inclination     75.3238
		AscendingNode   147.486
		ArgOfPericenter 33.2844
		MeanAnomaly     -66.1763
	}
}

Comet	"Dellalt System C57"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            5.088e-010
	Radius          11.3116
	InertiaMoment   0.397072

	Oblateness      0.0246114

	RotationPeriod  33.0452
	Obliquity       220.364
	EqAscendNode    87.172

	AbsMagn         7.994
	SlopeParam      2.6695
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.532 0.528 0.526)

	Surface
	{
		SurfStyle       0.857301
		OceanStyle      0.785029
		Randomize      (-0.519, -0.435, 0.870)
		colorDistMagn   0.440589
		colorDistFreq   0.0568014
		detailScale     308.882
		colorConversion true
		snowLevel       2
		tropicLatitude  0.544587
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.492487
		terraceProb     0.371693
		erosion         0
		montesMagn      0.555055
		montesFreq      3.19055
		montesSpiky     0.963948
		montesFraction  0.582752
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.412032
		hillsFraction   0.726675
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218924
		craterFreq      0.259087
		craterDensity   0.878873
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.584651
		volcanoTemp     1736.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.181, 0.185, 0.210, 0.050)
		colorShelf     (0.213, 0.216, 0.242, 0.040)
		colorBeach     (0.245, 0.248, 0.273, 0.030)
		colorDesert    (0.276, 0.280, 0.310, 0.020)
		colorLowland   (0.308, 0.311, 0.342, 0.030)
		colorUpland    (0.340, 0.343, 0.373, 0.050)
		colorRock      (0.372, 0.375, 0.415, 0.020)
		colorSnow      (0.372, 0.375, 0.415, 1.000)
		BumpHeight      10.1804
		BumpOffset      2.03609
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.716185
		GasToDust   0.25
		Particles   2426
		GasBright   0.0484392
		DustBright  0.184908
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   12.8645
		Period          55.2192
		Eccentricity    0.965176
		Inclination     17.073
		AscendingNode   125.47
		ArgOfPericenter -38.4947
		MeanAnomaly     -25.3078
	}
}

Comet	"Dellalt System C58"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            1.56663e-017
	Radius          0.0441248
	InertiaMoment   0.399301

	Oblateness      0.0541922

	RotationPeriod  31.0492
	Obliquity       173.569
	EqAscendNode    71.7494

	AbsMagn         4.04924
	SlopeParam      3.30987
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.718 0.715 0.710)

	Surface
	{
		SurfStyle       0.879991
		OceanStyle      0.0258847
		Randomize      (-0.295, -0.511, -0.508)
		colorDistMagn   0.763518
		colorDistFreq   1.2326e-006
		detailScale     1.2049
		colorConversion true
		snowLevel       2
		tropicLatitude  0.523838
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.535701
		terraceProb     0.190585
		erosion         0
		montesMagn      0.383777
		montesFreq      3.24047
		montesSpiky     0.939223
		montesFraction  0.542269
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.85549e-006
		hillsFraction   0.683713
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227588
		craterFreq      0.200634
		craterDensity   0.870285
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.508567
		volcanoTemp     1020.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.244, 0.250, 0.284, 0.050)
		colorShelf     (0.287, 0.293, 0.327, 0.040)
		colorBeach     (0.330, 0.336, 0.369, 0.030)
		colorDesert    (0.374, 0.379, 0.419, 0.020)
		colorLowland   (0.417, 0.422, 0.462, 0.030)
		colorUpland    (0.460, 0.465, 0.504, 0.050)
		colorRock      (0.503, 0.508, 0.561, 0.020)
		colorSnow      (0.503, 0.508, 0.561, 1.000)
		BumpHeight      0.0397123
		BumpOffset      0.00794246
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.191396
		DustBright  0.526438
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   21.115
		Period          116.115
		Eccentricity    0.963583
		Inclination     28.2325
		AscendingNode   116.54
		ArgOfPericenter 178.547
		MeanAnomaly     179.029
	}
}

Comet	"Dellalt System C59"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            1.21168e-013
	Radius          0.700664
	InertiaMoment   0.39797

	Oblateness      0.0319998

	RotationPeriod  28.9996
	Obliquity       126.775
	EqAscendNode    56.3268

	AbsMagn         11.6061
	SlopeParam      3.88513
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.679 0.676 0.672)

	Surface
	{
		SurfStyle       0.394513
		OceanStyle      0.0277578
		Randomize      (-0.647, 0.786, -0.088)
		colorDistMagn   0.607334
		colorDistFreq   0.000293729
		detailScale     19.1328
		colorConversion true
		snowLevel       2
		tropicLatitude  0.581906
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.654126
		terraceProb     0.488323
		erosion         0
		montesMagn      0.469197
		montesFreq      2.78949
		montesSpiky     0.962659
		montesFraction  0.358903
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000790475
		hillsFraction   0.744692
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245377
		craterFreq      0.186646
		craterDensity   1.00501
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.43812
		volcanoTemp     912.776
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.271, 0.270, 0.269, 0.000)
		colorShelf     (0.288, 0.287, 0.286, 0.000)
		colorBeach     (0.305, 0.304, 0.302, 0.000)
		colorDesert    (0.322, 0.321, 0.319, 0.000)
		colorLowland   (0.339, 0.338, 0.336, 0.000)
		colorUpland    (0.356, 0.355, 0.353, 0.000)
		colorRock      (0.373, 0.372, 0.370, 0.000)
		colorSnow      (0.390, 0.389, 0.386, 1.000)
		BumpHeight      0.630597
		BumpOffset      0.126119
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.267819
		GasToDust   0.25
		Particles   1520
		GasBright   0.131026
		DustBright  0.271295
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   15.7
		Period          74.4476
		Eccentricity    0.936682
		Inclination     -25.9944
		AscendingNode   -141.605
		ArgOfPericenter -72.3307
		MeanAnomaly     113.289
	}
}

Comet	"Dellalt System C60"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            9.37145e-010
	Radius          16.935
	InertiaMoment   0.399733

	Oblateness      0.0684128

	RotationPeriod  26.8865
	Obliquity       79.9808
	EqAscendNode    40.9042

	AbsMagn         7.78526
	SlopeParam      4.45085
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.512 0.509 0.504)

	Surface
	{
		SurfStyle       0.0497557
		OceanStyle      0.871952
		Randomize      (0.102, -0.913, -0.756)
		colorDistMagn   0.506241
		colorDistFreq   0.0631558
		detailScale     462.437
		colorConversion true
		snowLevel       2
		tropicLatitude  0.722167
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.64552
		terraceProb     0.134076
		erosion         0
		montesMagn      0.529732
		montesFreq      3.00661
		montesSpiky     0.879414
		montesFraction  0.418649
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.975692
		hillsFraction   0.570923
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220403
		craterFreq      0.208545
		craterDensity   1.00406
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.566662
		volcanoTemp     1328.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.205, 0.204, 0.202, 0.000)
		colorShelf     (0.218, 0.216, 0.214, 0.000)
		colorBeach     (0.231, 0.229, 0.227, 0.000)
		colorDesert    (0.243, 0.242, 0.240, 0.000)
		colorLowland   (0.256, 0.254, 0.252, 0.000)
		colorUpland    (0.269, 0.267, 0.265, 0.000)
		colorRock      (0.282, 0.280, 0.277, 0.000)
		colorSnow      (0.295, 0.293, 0.290, 1.000)
		BumpHeight      15.2415
		BumpOffset      3.04829
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.749011
		GasToDust   0.25
		Particles   2492
		GasBright   0.341172
		DustBright  0.545634
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   19.1531
		Period          100.313
		Eccentricity    0.965515
		Inclination     -146.205
		AscendingNode   177.306
		ArgOfPericenter 115.42
		MeanAnomaly     100.022
	}
}

Comet	"Dellalt System C61"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            2.88554e-017
	Radius          0.0434006
	InertiaMoment   0.398578

	Oblateness      0.0441283

	RotationPeriod  24.698
	Obliquity       33.1865
	EqAscendNode    25.4816

	AbsMagn         3.69386
	SlopeParam      5.05601
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.725 0.681 0.642)

	Surface
	{
		SurfStyle       0.372269
		OceanStyle      0.545582
		Randomize      (0.591, 0.382, -0.344)
		colorDistMagn   0.731819
		colorDistFreq   2.37225e-007
		detailScale     1.18512
		colorConversion true
		snowLevel       2
		tropicLatitude  0.816933
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.739372
		terraceProb     0.417482
		erosion         0
		montesMagn      0.452198
		montesFreq      2.71529
		montesSpiky     0.968567
		montesFraction  0.702159
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.1197e-006
		hillsFraction   0.455689
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240534
		craterFreq      0.16981
		craterDensity   0.862882
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.46658
		volcanoTemp     1483.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.290, 0.272, 0.257, 0.000)
		colorShelf     (0.308, 0.289, 0.273, 0.000)
		colorBeach     (0.326, 0.306, 0.289, 0.000)
		colorDesert    (0.345, 0.323, 0.305, 0.000)
		colorLowland   (0.363, 0.340, 0.321, 0.000)
		colorUpland    (0.381, 0.357, 0.337, 0.000)
		colorRock      (0.399, 0.374, 0.353, 0.000)
		colorSnow      (0.417, 0.392, 0.369, 1.000)
		BumpHeight      0.0390605
		BumpOffset      0.0078121
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.25352
		DustBright  0.317773
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   13.5559
		Period          59.7303
		Eccentricity    0.950033
		Inclination     -50.0641
		AscendingNode   -84.5988
		ArgOfPericenter 164.994
		MeanAnomaly     -144.671
	}
}

Comet	"Dellalt System C62"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            2.23176e-013
	Radius          1.03577
	InertiaMoment   0.396249

	Oblateness      0.0932983

	RotationPeriod  22.4197
	Obliquity       346.392
	EqAscendNode    10.059

	AbsMagn         11.3031
	SlopeParam      5.78046
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.447 0.442 0.435)

	Surface
	{
		SurfStyle       0.425841
		OceanStyle      0.816448
		Randomize      (-0.650, 0.480, -0.428)
		colorDistMagn   0.689176
		colorDistFreq   0.000486385
		detailScale     28.2835
		colorConversion true
		snowLevel       2
		tropicLatitude  0.444211
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.603704
		terraceProb     0.151754
		erosion         0
		montesMagn      0.495527
		montesFreq      3.03275
		montesSpiky     0.862709
		montesFraction  0.505097
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00267087
		hillsFraction   0.588602
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229781
		craterFreq      0.172851
		craterDensity   0.849698
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.535691
		volcanoTemp     1753.92
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.179, 0.177, 0.174, 0.000)
		colorShelf     (0.190, 0.188, 0.185, 0.000)
		colorBeach     (0.201, 0.199, 0.196, 0.000)
		colorDesert    (0.212, 0.210, 0.206, 0.000)
		colorLowland   (0.223, 0.221, 0.217, 0.000)
		colorUpland    (0.234, 0.232, 0.228, 0.000)
		colorRock      (0.246, 0.243, 0.239, 0.000)
		colorSnow      (0.257, 0.254, 0.250, 1.000)
		BumpHeight      0.932195
		BumpOffset      0.186439
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.300645
		GasToDust   0.25
		Particles   1587
		GasBright   0.00071891
		DustBright  0.255061
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   17.1856
		Period          85.2604
		Eccentricity    0.966442
		Inclination     23.3422
		AscendingNode   87.8229
		ArgOfPericenter 118.078
		MeanAnomaly     16.5125
	}
}

Comet	"Dellalt System C63"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            1.7261e-009
	Radius          16.9622
	InertiaMoment   0.399076

	Oblateness      0.0670556

	RotationPeriod  20.034
	Obliquity       299.598
	EqAscendNode    354.636

	AbsMagn         7.57594
	SlopeParam      6.8848
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.683 0.579 0.541)

	Surface
	{
		SurfStyle       0.459721
		OceanStyle      0.0455313
		Randomize      (0.734, 0.516, -0.523)
		colorDistMagn   0.16708
		colorDistFreq   0.0827939
		detailScale     463.181
		colorConversion true
		snowLevel       2
		tropicLatitude  0.712503
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.340852
		terraceProb     0.539003
		erosion         0
		montesMagn      0.297162
		montesFreq      3.75314
		montesSpiky     0.973634
		montesFraction  0.397579
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.414087
		hillsFraction   0.51241
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22543
		craterFreq      0.243195
		craterDensity   0.908057
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.542679
		volcanoTemp     1116.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.273, 0.232, 0.217, 0.000)
		colorShelf     (0.290, 0.246, 0.230, 0.000)
		colorBeach     (0.307, 0.260, 0.244, 0.000)
		colorDesert    (0.325, 0.275, 0.257, 0.000)
		colorLowland   (0.342, 0.289, 0.271, 0.000)
		colorUpland    (0.359, 0.304, 0.284, 0.000)
		colorRock      (0.376, 0.318, 0.298, 0.000)
		colorSnow      (0.393, 0.333, 0.311, 1.000)
		BumpHeight      15.266
		BumpOffset      3.05319
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.781837
		GasToDust   0.25
		Particles   2559
		GasBright   0.0457898
		DustBright  0.694476
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   11.2458
		Period          45.1319
		Eccentricity    0.939358
		Inclination     -98.3063
		AscendingNode   42.8959
		ArgOfPericenter 115.782
		MeanAnomaly     18.0405
	}
}

Comet	"Dellalt System C64"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            5.3148e-017
	Radius          0.0635386
	InertiaMoment   0.397588

	Oblateness      0.148864

	RotationPeriod  17.5187
	Obliquity       252.804
	EqAscendNode    339.214

	AbsMagn         3.30076
	SlopeParam      2.289
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.746 0.741 0.739)

	Surface
	{
		SurfStyle       0.201528
		OceanStyle      0.0483486
		Randomize      (0.344, -0.435, 0.005)
		colorDistMagn   0.0273282
		colorDistFreq   1.92937e-006
		detailScale     1.73503
		colorConversion true
		snowLevel       2
		tropicLatitude  0.201479
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.60781
		terraceProb     0.306233
		erosion         0
		montesMagn      0.496988
		montesFreq      3.26474
		montesSpiky     0.977768
		montesFraction  0.472908
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.13955e-005
		hillsFraction   0.615005
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.215037
		craterFreq      0.211968
		craterDensity   0.942055
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.477938
		volcanoTemp     1241.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.298, 0.296, 0.296, 0.000)
		colorShelf     (0.317, 0.315, 0.314, 0.000)
		colorBeach     (0.336, 0.334, 0.332, 0.000)
		colorDesert    (0.354, 0.352, 0.351, 0.000)
		colorLowland   (0.373, 0.371, 0.369, 0.000)
		colorUpland    (0.391, 0.389, 0.388, 0.000)
		colorRock      (0.410, 0.408, 0.406, 0.000)
		colorSnow      (0.429, 0.426, 0.425, 1.000)
		BumpHeight      0.0571847
		BumpOffset      0.0114369
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0513531
		DustBright  0.3734
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   16.9638
		Period          83.615
		Eccentricity    0.960925
		Inclination     -64.2149
		AscendingNode   8.42976
		ArgOfPericenter -80.6878
		MeanAnomaly     -96.0336
	}
}

Comet	"Dellalt System C65"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            4.11062e-013
	Radius          1.05068
	InertiaMoment   0.399522

	Oblateness      0.122086

	RotationPeriod  14.8449
	Obliquity       206.009
	EqAscendNode    323.791

	AbsMagn         11.018
	SlopeParam      2.99816
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.689 0.593 0.491)

	Surface
	{
		SurfStyle       0.402882
		OceanStyle      0.560335
		Randomize      (-0.926, 0.577, 0.979)
		colorDistMagn   0.779915
		colorDistFreq   0.000537549
		detailScale     28.6905
		colorConversion true
		snowLevel       2
		tropicLatitude  0.996768
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.69636
		terraceProb     0.106937
		erosion         0
		montesMagn      0.649357
		montesFreq      2.80986
		montesSpiky     0.830672
		montesFraction  0.769326
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00227889
		hillsFraction   0.745927
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.27859
		craterFreq      0.175504
		craterDensity   0.833702
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.512346
		volcanoTemp     1485.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.276, 0.237, 0.197, 0.000)
		colorShelf     (0.293, 0.252, 0.209, 0.000)
		colorBeach     (0.310, 0.267, 0.221, 0.000)
		colorDesert    (0.327, 0.282, 0.233, 0.000)
		colorLowland   (0.345, 0.297, 0.246, 0.000)
		colorUpland    (0.362, 0.312, 0.258, 0.000)
		colorRock      (0.379, 0.326, 0.270, 0.000)
		colorSnow      (0.396, 0.341, 0.282, 1.000)
		BumpHeight      0.945609
		BumpOffset      0.189122
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.333471
		GasToDust   0.25
		Particles   1653
		GasBright   0.163614
		DustBright  0.745625
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   12.1536
		Period          50.7061
		Eccentricity    0.925608
		Inclination     -110.334
		AscendingNode   17.2774
		ArgOfPericenter 140.988
		MeanAnomaly     74.9112
	}
}

Comet	"Dellalt System C66"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            3.17926e-009
	Radius          24.639
	InertiaMoment   0.398298

	Oblateness      0.249

	RotationPeriod  11.9744
	Obliquity       159.215
	EqAscendNode    308.369

	AbsMagn         7.36545
	SlopeParam      3.5977
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.513 0.505 0.500)

	Surface
	{
		SurfStyle       0.146389
		OceanStyle      0.895733
		Randomize      (-0.384, -0.745, -0.578)
		colorDistMagn   0.70275
		colorDistFreq   0.382173
		detailScale     672.809
		colorConversion true
		snowLevel       2
		tropicLatitude  0.80827
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.622445
		terraceProb     0.268953
		erosion         0
		montesMagn      0.464235
		montesFreq      3.26559
		montesSpiky     0.956493
		montesFraction  0.295412
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.78771
		hillsFraction   0.804108
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256738
		craterFreq      0.264613
		craterDensity   0.78581
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.493495
		volcanoTemp     1591.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.205, 0.202, 0.200, 0.000)
		colorShelf     (0.218, 0.215, 0.212, 0.000)
		colorBeach     (0.231, 0.227, 0.225, 0.000)
		colorDesert    (0.243, 0.240, 0.237, 0.000)
		colorLowland   (0.256, 0.252, 0.250, 0.000)
		colorUpland    (0.269, 0.265, 0.262, 0.000)
		colorRock      (0.282, 0.278, 0.275, 0.000)
		colorSnow      (0.295, 0.290, 0.287, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.814663
		GasToDust   0.25
		Particles   2625
		GasBright   0.141896
		DustBright  0.45183
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   19.9583
		Period          106.705
		Eccentricity    0.972434
		Inclination     -39.8064
		AscendingNode   55.2772
		ArgOfPericenter 106.234
		MeanAnomaly     -102.256
	}
}

Comet	"Dellalt System C67"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            9.78921e-017
	Radius          0.0650814
	InertiaMoment   0.399945

	Oblateness      0.249

	RotationPeriod  8.85432
	Obliquity       112.421
	EqAscendNode    292.946

	AbsMagn         2.85613
	SlopeParam      4.16244
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.787 0.782 0.781)

	Surface
	{
		SurfStyle       0.803729
		OceanStyle      0.271168
		Randomize      (0.831, -0.081, 0.458)
		colorDistMagn   0.172747
		colorDistFreq   3.71687e-006
		detailScale     1.77716
		colorConversion true
		snowLevel       2
		tropicLatitude  0.852144
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.332508
		terraceProb     0.635789
		erosion         0
		montesMagn      0.531046
		montesFreq      3.98975
		montesSpiky     0.981051
		montesFraction  0.834894
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.30382e-006
		hillsFraction   0.722356
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258856
		craterFreq      0.25134
		craterDensity   1.04448
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.55619
		volcanoTemp     1420.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.307, 0.266, 0.219, 0.000)
		colorShelf     (0.315, 0.274, 0.250, 0.000)
		colorBeach     (0.370, 0.321, 0.297, 0.000)
		colorDesert    (0.401, 0.344, 0.289, 0.000)
		colorLowland   (0.441, 0.368, 0.328, 0.000)
		colorUpland    (0.488, 0.446, 0.398, 0.000)
		colorRock      (0.527, 0.485, 0.429, 0.000)
		colorSnow      (0.574, 0.516, 0.453, 1.000)
		BumpHeight      0.0585733
		BumpOffset      0.0117147
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0829176
		DustBright  0.195295
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   15.4622
		Period          72.7623
		Eccentricity    0.957504
		Inclination     151.625
		AscendingNode   -115.297
		ArgOfPericenter -42.8223
		MeanAnomaly     156.084
	}
}

Comet	"Dellalt System C68"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            7.57124e-013
	Radius          1.51624
	InertiaMoment   0.39884

	Oblateness      0.249

	RotationPeriod  5.4086
	Obliquity       65.6264
	EqAscendNode    277.523

	AbsMagn         10.7475
	SlopeParam      4.74073
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.461 0.459 0.457)

	Surface
	{
		SurfStyle       0.881723
		OceanStyle      0.776596
		Randomize      (0.692, 0.933, 0.731)
		colorDistMagn   0.0307548
		colorDistFreq   0.000307139
		detailScale     41.4034
		colorConversion true
		snowLevel       2
		tropicLatitude  0.730276
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.473837
		terraceProb     0.346568
		erosion         0
		montesMagn      0.615329
		montesFreq      2.56872
		montesSpiky     0.977835
		montesFraction  0.529667
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00568478
		hillsFraction   0.59504
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.20931
		craterFreq      0.221262
		craterDensity   0.999134
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50014
		volcanoTemp     1644.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.157, 0.161, 0.183, 0.050)
		colorShelf     (0.185, 0.188, 0.210, 0.040)
		colorBeach     (0.212, 0.216, 0.237, 0.030)
		colorDesert    (0.240, 0.243, 0.269, 0.020)
		colorLowland   (0.268, 0.271, 0.297, 0.030)
		colorUpland    (0.295, 0.298, 0.324, 0.050)
		colorRock      (0.323, 0.326, 0.361, 0.020)
		colorSnow      (0.323, 0.326, 0.361, 1.000)
		BumpHeight      1.36462
		BumpOffset      0.272923
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.366297
		GasToDust   0.25
		Particles   1719
		GasBright   0.272346
		DustBright  0.490353
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   18.8889
		Period          98.245
		Eccentricity    0.971378
		Inclination     80.8745
		AscendingNode   -33.6553
		ArgOfPericenter -61.5261
		MeanAnomaly     9.74215
	}
}

Comet	"Dellalt System C69"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            5.85581e-009
	Radius          25.4358
	InertiaMoment   0.397087

	Oblateness      0.00130589

	RotationPeriod  142.592
	Obliquity       18.8321
	EqAscendNode    262.101

	AbsMagn         7.15318
	SlopeParam      5.39031
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.752 0.747 0.745)

	Surface
	{
		SurfStyle       0.12211
		OceanStyle      0.812639
		Randomize      (-0.579, -0.747, -0.671)
		colorDistMagn   0.806182
		colorDistFreq   0.523585
		detailScale     694.566
		colorConversion true
		snowLevel       2
		tropicLatitude  0.757027
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.398547
		terraceProb     0.112711
		erosion         0
		montesMagn      0.330343
		montesFreq      3.10478
		montesSpiky     0.913747
		montesFraction  0.6118
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.77241
		hillsFraction   0.560038
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233654
		craterFreq      0.262046
		craterDensity   0.933019
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.478416
		volcanoTemp     1368.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.301, 0.299, 0.298, 0.000)
		colorShelf     (0.319, 0.318, 0.317, 0.000)
		colorBeach     (0.338, 0.336, 0.335, 0.000)
		colorDesert    (0.357, 0.355, 0.354, 0.000)
		colorLowland   (0.376, 0.374, 0.373, 0.000)
		colorUpland    (0.395, 0.392, 0.391, 0.000)
		colorRock      (0.413, 0.411, 0.410, 0.000)
		colorSnow      (0.432, 0.430, 0.429, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.847489
		GasToDust   0.25
		Particles   2691
		GasBright   0.186086
		DustBright  0.261099
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   13.5404
		Period          59.6274
		Eccentricity    0.963758
		Inclination     -60.9431
		AscendingNode   -46.6475
		ArgOfPericenter -24.0237
		MeanAnomaly     101.243
	}
}

Comet	"Dellalt System C70"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            1.80305e-016
	Radius          0.0933943
	InertiaMoment   0.399306

	Oblateness      0.00304149

	RotationPeriod  118.964
	Obliquity       332.038
	EqAscendNode    246.678

	AbsMagn         2.33685
	SlopeParam      6.23957
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.705 0.702 0.701)

	Surface
	{
		SurfStyle       0.0703763
		OceanStyle      0.403829
		Randomize      (-0.551, 0.858, 0.238)
		colorDistMagn   0.683079
		colorDistFreq   3.39829e-006
		detailScale     2.55029
		colorConversion true
		snowLevel       2
		tropicLatitude  0.412554
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.299197
		terraceProb     0.347678
		erosion         0
		montesMagn      0.424298
		montesFreq      2.32199
		montesSpiky     0.869196
		montesFraction  0.666959
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.09637e-005
		hillsFraction   0.576487
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262303
		craterFreq      0.206811
		craterDensity   0.939422
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.583921
		volcanoTemp     1651.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.282, 0.281, 0.280, 0.000)
		colorShelf     (0.299, 0.298, 0.298, 0.000)
		colorBeach     (0.317, 0.316, 0.315, 0.000)
		colorDesert    (0.335, 0.334, 0.333, 0.000)
		colorLowland   (0.352, 0.351, 0.350, 0.000)
		colorUpland    (0.370, 0.369, 0.368, 0.000)
		colorRock      (0.388, 0.386, 0.386, 0.000)
		colorSnow      (0.405, 0.404, 0.403, 1.000)
		BumpHeight      0.0840548
		BumpOffset      0.016811
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.442705
		DustBright  0.488967
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   16.0028
		Period          76.6115
		Eccentricity    0.956505
		Inclination     -175.051
		AscendingNode   -40.044
		ArgOfPericenter -131.11
		MeanAnomaly     137.532
	}
}

Comet	"Dellalt System C71"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            1.39453e-012
	Radius          1.57555
	InertiaMoment   0.397979

	Oblateness      0.00222699

	RotationPeriod  109.265
	Obliquity       285.243
	EqAscendNode    231.256

	AbsMagn         10.489
	SlopeParam      8.13575
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.639 0.577 0.555)

	Surface
	{
		SurfStyle       0.0651086
		OceanStyle      0.138293
		Randomize      (0.054, -0.711, 0.907)
		colorDistMagn   0.0921961
		colorDistFreq   0.000841262
		detailScale     43.0231
		colorConversion true
		snowLevel       2
		tropicLatitude  0.774494
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.707688
		terraceProb     0.211994
		erosion         0
		montesMagn      0.324123
		montesFreq      3.28835
		montesSpiky     0.715232
		montesFraction  0.131986
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00642786
		hillsFraction   0.83103
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234448
		craterFreq      0.179731
		craterDensity   0.88568
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.531117
		volcanoTemp     1483.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.256, 0.231, 0.222, 0.000)
		colorShelf     (0.272, 0.245, 0.236, 0.000)
		colorBeach     (0.288, 0.260, 0.250, 0.000)
		colorDesert    (0.304, 0.274, 0.263, 0.000)
		colorLowland   (0.320, 0.289, 0.277, 0.000)
		colorUpland    (0.336, 0.303, 0.291, 0.000)
		colorRock      (0.352, 0.318, 0.305, 0.000)
		colorSnow      (0.368, 0.332, 0.319, 1.000)
		BumpHeight      1.418
		BumpOffset      0.283599
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.399123
		GasToDust   0.25
		Particles   1786
		GasBright   0.0210837
		DustBright  0.595075
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   20.4366
		Period          110.564
		Eccentricity    0.963453
		Inclination     155.988
		AscendingNode   178.197
		ArgOfPericenter 146.023
		MeanAnomaly     -114.991
	}
}

Comet	"Dellalt System C72"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            1.07857e-008
	Radius          36.3232
	InertiaMoment   0.399738

	Oblateness      0.00402277

	RotationPeriod  102.666
	Obliquity       238.449
	EqAscendNode    215.833

	AbsMagn         6.9385
	SlopeParam      2.65986
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.685 0.620 0.548)

	Surface
	{
		SurfStyle       0.103104
		OceanStyle      0.999863
		Randomize      (0.541, 0.097, 0.599)
		colorDistMagn   0.577155
		colorDistFreq   0.554051
		detailScale     991.865
		colorConversion true
		snowLevel       2
		tropicLatitude  0.851449
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.506393
		terraceProb     0.128823
		erosion         0
		montesMagn      0.42263
		montesFreq      3.39587
		montesSpiky     0.973977
		montesFraction  0.595054
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.21606
		hillsFraction   0.550033
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239506
		craterFreq      0.188067
		craterDensity   0.943882
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.493035
		volcanoTemp     1682.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.274, 0.248, 0.219, 0.000)
		colorShelf     (0.291, 0.264, 0.233, 0.000)
		colorBeach     (0.308, 0.279, 0.246, 0.000)
		colorDesert    (0.325, 0.295, 0.260, 0.000)
		colorLowland   (0.343, 0.310, 0.274, 0.000)
		colorUpland    (0.360, 0.326, 0.288, 0.000)
		colorRock      (0.377, 0.341, 0.301, 0.000)
		colorSnow      (0.394, 0.357, 0.315, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.880315
		GasToDust   0.25
		Particles   2758
		GasBright   0.0280392
		DustBright  0.272606
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   10.9902
		Period          43.6024
		Eccentricity    0.940498
		Inclination     -167.567
		AscendingNode   -94.2052
		ArgOfPericenter 126.767
		MeanAnomaly     6.00452
	}
}

Comet	"Dellalt System C73"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            3.32099e-016
	Radius          0.0975936
	InertiaMoment   0.398585

	Oblateness      0.00279661

	RotationPeriod  97.5166
	Obliquity       191.655
	EqAscendNode    200.411

	AbsMagn         1.69939
	SlopeParam      3.30167
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.678 0.627 0.587)

	Surface
	{
		SurfStyle       0.295153
		OceanStyle      0.490668
		Randomize      (-0.297, -0.720, -0.047)
		colorDistMagn   0.312828
		colorDistFreq   7.30704e-006
		detailScale     2.66496
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999703
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.643944
		terraceProb     0.256052
		erosion         0
		montesMagn      0.582514
		montesFreq      2.45693
		montesSpiky     0.951526
		montesFraction  0.784505
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.67635e-005
		hillsFraction   0.68072
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229308
		craterFreq      0.20204
		craterDensity   0.926241
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.458102
		volcanoTemp     1216.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.271, 0.251, 0.235, 0.000)
		colorShelf     (0.288, 0.267, 0.249, 0.000)
		colorBeach     (0.305, 0.282, 0.264, 0.000)
		colorDesert    (0.322, 0.298, 0.279, 0.000)
		colorLowland   (0.339, 0.314, 0.293, 0.000)
		colorUpland    (0.356, 0.329, 0.308, 0.000)
		colorRock      (0.373, 0.345, 0.323, 0.000)
		colorSnow      (0.390, 0.361, 0.337, 1.000)
		BumpHeight      0.0878343
		BumpOffset      0.0175669
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.119582
		DustBright  0.66555
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   15.7207
		Period          74.595
		Eccentricity    0.950431
		Inclination     80.3163
		AscendingNode   18.2633
		ArgOfPericenter -102.574
		MeanAnomaly     -25.1735
	}
}

Comet	"Dellalt System C74"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            2.56855e-012
	Radius          2.24023
	InertiaMoment   0.396279

	Oblateness      0.00474479

	RotationPeriod  93.219
	Obliquity       144.861
	EqAscendNode    184.988

	AbsMagn         10.2405
	SlopeParam      3.8774
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.474 0.469 0.461)

	Surface
	{
		SurfStyle       0.235685
		OceanStyle      0.613368
		Randomize      (0.596, -0.094, 0.804)
		colorDistMagn   0.383207
		colorDistFreq   0.00204576
		detailScale     61.1732
		colorConversion true
		snowLevel       2
		tropicLatitude  0.43462
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.751333
		terraceProb     0.320096
		erosion         0
		montesMagn      0.515132
		montesFreq      2.70143
		montesSpiky     0.943941
		montesFraction  0.348273
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0116941
		hillsFraction   0.625634
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239444
		craterFreq      0.21879
		craterDensity   1.02252
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.498382
		volcanoTemp     1896.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.190, 0.188, 0.184, 0.000)
		colorShelf     (0.201, 0.199, 0.196, 0.000)
		colorBeach     (0.213, 0.211, 0.207, 0.000)
		colorDesert    (0.225, 0.223, 0.219, 0.000)
		colorLowland   (0.237, 0.234, 0.230, 0.000)
		colorUpland    (0.249, 0.246, 0.242, 0.000)
		colorRock      (0.261, 0.258, 0.253, 0.000)
		colorSnow      (0.272, 0.270, 0.265, 1.000)
		BumpHeight      2.01621
		BumpOffset      0.403241
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.431949
		GasToDust   0.25
		Particles   1852
		GasBright   0.0992556
		DustBright  0.370363
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   13.1308
		Period          56.9427
		Eccentricity    0.984504
		Inclination     28.8112
		AscendingNode   48.4201
		ArgOfPericenter 43.5227
		MeanAnomaly     121.505
	}
}

Comet	"Dellalt System C75"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            1.98658e-008
	Radius          38.1426
	InertiaMoment   0.399082

	Oblateness      0.00332073

	RotationPeriod  89.4841
	Obliquity       98.0663
	EqAscendNode    169.565

	AbsMagn         6.72071
	SlopeParam      4.44294
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.783 0.779 0.778)

	Surface
	{
		SurfStyle       0.506305
		OceanStyle      0.0561363
		Randomize      (-0.894, -0.213, -0.020)
		colorDistMagn   0.669132
		colorDistFreq   1.11214
		detailScale     1041.55
		colorConversion true
		snowLevel       2
		tropicLatitude  0.827996
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.560626
		terraceProb     0.461026
		erosion         0
		montesMagn      0.549663
		montesFreq      3.10095
		montesSpiky     0.889286
		montesFraction  0.190513
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.00236
		hillsFraction   0.397865
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.272854
		craterFreq      0.254657
		craterDensity   0.727078
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.491927
		volcanoTemp     1398.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.305, 0.265, 0.218, 0.000)
		colorShelf     (0.313, 0.273, 0.249, 0.000)
		colorBeach     (0.368, 0.319, 0.296, 0.000)
		colorDesert    (0.399, 0.343, 0.288, 0.000)
		colorLowland   (0.438, 0.366, 0.327, 0.000)
		colorUpland    (0.485, 0.444, 0.397, 0.000)
		colorRock      (0.525, 0.483, 0.428, 0.000)
		colorSnow      (0.572, 0.514, 0.451, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.913141
		GasToDust   0.25
		Particles   2824
		GasBright   0.257989
		DustBright  0.696116
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   14.7154
		Period          67.5554
		Eccentricity    0.941945
		Inclination     47.6353
		AscendingNode   -153.604
		ArgOfPericenter -91.2891
		MeanAnomaly     -178.646
	}
}

Comet	"Dellalt System C76"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            6.11685e-016
	Radius          0.138229
	InertiaMoment   0.397598

	Oblateness      0.00550744

	RotationPeriod  86.1493
	Obliquity       51.272
	EqAscendNode    154.143

	AbsMagn         0.843742
	SlopeParam      5.04715
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.642 0.637 0.634)

	Surface
	{
		SurfStyle       0.323404
		OceanStyle      0.631415
		Randomize      (0.576, 0.878, 0.462)
		colorDistMagn   0.742882
		colorDistFreq   1.22639e-005
		detailScale     3.77457
		colorConversion true
		snowLevel       2
		tropicLatitude  0.623947
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.492314
		terraceProb     0.207776
		erosion         0
		montesMagn      0.423975
		montesFreq      3.16765
		montesSpiky     0.975207
		montesFraction  0.635672
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.97137e-005
		hillsFraction   0.682747
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.268932
		craterFreq      0.22317
		craterDensity   0.981972
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.540326
		volcanoTemp     1292.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.257, 0.255, 0.253, 0.000)
		colorShelf     (0.273, 0.271, 0.269, 0.000)
		colorBeach     (0.289, 0.287, 0.285, 0.000)
		colorDesert    (0.305, 0.303, 0.301, 0.000)
		colorLowland   (0.321, 0.319, 0.317, 0.000)
		colorUpland    (0.337, 0.335, 0.333, 0.000)
		colorRock      (0.353, 0.351, 0.349, 0.000)
		colorSnow      (0.369, 0.366, 0.364, 1.000)
		BumpHeight      0.124406
		BumpOffset      0.0248812
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.21038
		DustBright  0.428211
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   20.4952
		Period          111.04
		Eccentricity    0.963511
		Inclination     160.119
		AscendingNode   43.2821
		ArgOfPericenter -79.0928
		MeanAnomaly     138.479
	}
}

Comet	"Dellalt System C77"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            4.73094e-012
	Radius          2.36265
	InertiaMoment   0.399528

	Oblateness      0.00384802

	RotationPeriod  83.1133
	Obliquity       4.47772
	EqAscendNode    138.72

	AbsMagn         10.0003
	SlopeParam      5.76902
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.615 0.612 0.610)

	Surface
	{
		SurfStyle       0.950395
		OceanStyle      0.803643
		Randomize      (0.695, -0.672, -0.031)
		colorDistMagn   0.644938
		colorDistFreq   0.00337012
		detailScale     64.5161
		colorConversion true
		snowLevel       2
		tropicLatitude  0.355071
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.531111
		terraceProb     0.312418
		erosion         0
		montesMagn      0.439198
		montesFreq      3.24233
		montesSpiky     0.983225
		montesFraction  0.164131
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0131608
		hillsFraction   0.676609
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222675
		craterFreq      0.241956
		craterDensity   0.957137
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.464885
		volcanoTemp     1529.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.209, 0.214, 0.244, 0.050)
		colorShelf     (0.246, 0.251, 0.280, 0.040)
		colorBeach     (0.283, 0.288, 0.317, 0.030)
		colorDesert    (0.320, 0.324, 0.360, 0.020)
		colorLowland   (0.357, 0.361, 0.396, 0.030)
		colorUpland    (0.394, 0.398, 0.433, 0.050)
		colorRock      (0.430, 0.435, 0.482, 0.020)
		colorSnow      (0.430, 0.435, 0.482, 1.000)
		BumpHeight      2.12638
		BumpOffset      0.425277
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.464775
		GasToDust   0.25
		Particles   1918
		GasBright   0.125513
		DustBright  0.197566
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   15.4069
		Period          72.3728
		Eccentricity    0.965036
		Inclination     17.5658
		AscendingNode   -48.4706
		ArgOfPericenter -63.7206
		MeanAnomaly     -118.642
	}
}

Comet	"Dellalt System C78"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            3.65904e-008
	Radius          53.8354
	InertiaMoment   0.398305

	Oblateness      0.00627552

	RotationPeriod  80.3085
	Obliquity       317.683
	EqAscendNode    123.298

	AbsMagn         6.49907
	SlopeParam      6.86314
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.546 0.541 0.538)

	Surface
	{
		SurfStyle       0.624706
		OceanStyle      0.308
		Randomize      (0.673, -0.854, -0.224)
		colorDistMagn   0.671319
		colorDistFreq   1.97175
		detailScale     1470.06
		colorConversion true
		snowLevel       2
		tropicLatitude  0.674206
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.441569
		terraceProb     0.110695
		erosion         0
		montesMagn      0.495521
		montesFreq      3.3266
		montesSpiky     0.993587
		montesFraction  0.535341
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.14495
		hillsFraction   0.731034
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222799
		craterFreq      0.190132
		craterDensity   1.02935
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.479714
		volcanoTemp     1468.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.213, 0.184, 0.151, 0.000)
		colorShelf     (0.219, 0.189, 0.172, 0.000)
		colorBeach     (0.257, 0.222, 0.204, 0.000)
		colorDesert    (0.279, 0.238, 0.199, 0.000)
		colorLowland   (0.306, 0.254, 0.226, 0.000)
		colorUpland    (0.339, 0.308, 0.274, 0.000)
		colorRock      (0.366, 0.335, 0.296, 0.000)
		colorSnow      (0.399, 0.357, 0.312, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.945967
		GasToDust   0.25
		Particles   2890
		GasBright   0.361413
		DustBright  0.446152
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   15.9221
		Period          76.0329
		Eccentricity    0.954788
		Inclination     170.52
		AscendingNode   -94.7622
		ArgOfPericenter 41.7096
		MeanAnomaly     38.6106
	}
}

Comet	"Dellalt System C79"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            1.12664e-015
	Radius          0.146349
	InertiaMoment   0.399951

	Oblateness      0.00440246

	RotationPeriod  77.6873
	Obliquity       270.889
	EqAscendNode    107.875

	AbsMagn         -0.578255
	SlopeParam      2.27785
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.709 0.706 0.702)

	Surface
	{
		SurfStyle       0.503447
		OceanStyle      0.620777
		Randomize      (-0.372, 0.800, -0.329)
		colorDistMagn   0.972863
		colorDistFreq   6.22505e-006
		detailScale     3.99629
		colorConversion true
		snowLevel       2
		tropicLatitude  0.815635
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.380713
		terraceProb     0.197821
		erosion         0
		montesMagn      0.532629
		montesFreq      2.29391
		montesSpiky     0.973985
		montesFraction  0.686778
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.51283e-005
		hillsFraction   0.582412
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.271027
		craterFreq      0.255464
		craterDensity   0.625474
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.543735
		volcanoTemp     1447.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.277, 0.240, 0.197, 0.000)
		colorShelf     (0.284, 0.247, 0.225, 0.000)
		colorBeach     (0.333, 0.289, 0.267, 0.000)
		colorDesert    (0.362, 0.311, 0.260, 0.000)
		colorLowland   (0.397, 0.332, 0.295, 0.000)
		colorUpland    (0.440, 0.402, 0.358, 0.000)
		colorRock      (0.475, 0.438, 0.386, 0.000)
		colorSnow      (0.518, 0.466, 0.407, 1.000)
		BumpHeight      0.131714
		BumpOffset      0.0263428
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0164086
		GasToDust   0.25
		Particles   1012
		GasBright   0.0032377
		DustBright  0.488814
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   15.5701
		Period          73.5257
		Eccentricity    0.955571
		Inclination     142.582
		AscendingNode   13.4476
		ArgOfPericenter -93.6411
		MeanAnomaly     -26.9009
	}
}

Comet	"Dellalt System C80"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            8.71379e-012
	Radius          3.3241
	InertiaMoment   0.398846

	Oblateness      0.00708639

	RotationPeriod  75.2148
	Obliquity       224.095
	EqAscendNode    92.4524

	AbsMagn         9.76722
	SlopeParam      2.9894
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.631 0.457 0.398)

	Surface
	{
		SurfStyle       0.416325
		OceanStyle      0.146472
		Randomize      (-0.689, -0.763, -0.824)
		colorDistMagn   0.796719
		colorDistFreq   0.00364358
		detailScale     90.7701
		colorConversion true
		snowLevel       2
		tropicLatitude  0.961893
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.482869
		terraceProb     0.37383
		erosion         0
		montesMagn      0.429341
		montesFreq      3.50111
		montesSpiky     0.991223
		montesFraction  0.641771
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0279866
		hillsFraction   0.585792
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24484
		craterFreq      0.187066
		craterDensity   0.797877
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.495418
		volcanoTemp     1919.53
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.253, 0.183, 0.159, 0.000)
		colorShelf     (0.268, 0.194, 0.169, 0.000)
		colorBeach     (0.284, 0.206, 0.179, 0.000)
		colorDesert    (0.300, 0.217, 0.189, 0.000)
		colorLowland   (0.316, 0.229, 0.199, 0.000)
		colorUpland    (0.331, 0.240, 0.209, 0.000)
		colorRock      (0.347, 0.251, 0.219, 0.000)
		colorSnow      (0.363, 0.263, 0.229, 1.000)
		BumpHeight      2.99169
		BumpOffset      0.598338
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.497601
		GasToDust   0.25
		Particles   1985
		GasBright   0.0640856
		DustBright  0.912453
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   16.7066
		Period          81.7206
		Eccentricity    0.959409
		Inclination     62.3816
		AscendingNode   -10.4335
		ArgOfPericenter 62.9594
		MeanAnomaly     162.462
	}
}

Comet	"Dellalt System C81"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            6.73949e-008
	Radius          57.1977
	InertiaMoment   0.397102

	Oblateness      0.00494144

	RotationPeriod  72.8645
	Obliquity       177.301
	EqAscendNode    77.0298

	AbsMagn         6.27271
	SlopeParam      3.58982
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.499 0.490 0.488)

	Surface
	{
		SurfStyle       0.910719
		OceanStyle      0.482623
		Randomize      (0.210, 0.664, 0.447)
		colorDistMagn   0.284676
		colorDistFreq   2.18436
		detailScale     1561.88
		colorConversion true
		snowLevel       2
		tropicLatitude  0.981387
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.440747
		terraceProb     0.357348
		erosion         0
		montesMagn      0.347971
		montesFreq      3.06499
		montesSpiky     0.961988
		montesFraction  0.660676
		dunesFraction   0
		hillsMagn       0
		hillsFreq       10.097
		hillsFraction   0.782348
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241258
		craterFreq      0.265676
		craterDensity   0.712185
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.493047
		volcanoTemp     1408.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.170, 0.172, 0.195, 0.050)
		colorShelf     (0.199, 0.201, 0.224, 0.040)
		colorBeach     (0.229, 0.231, 0.254, 0.030)
		colorDesert    (0.259, 0.260, 0.288, 0.020)
		colorLowland   (0.289, 0.289, 0.317, 0.030)
		colorUpland    (0.319, 0.319, 0.346, 0.050)
		colorRock      (0.349, 0.348, 0.385, 0.020)
		colorSnow      (0.349, 0.348, 0.385, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.978793
		GasToDust   0.25
		Particles   2957
		GasBright   0.0824103
		DustBright  0.578614
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   16.4857
		Period          80.1054
		Eccentricity    0.966309
		Inclination     99.3412
		AscendingNode   130.053
		ArgOfPericenter -50.5433
		MeanAnomaly     84.2281
	}
}

Comet	"Dellalt System C82"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            2.07514e-015
	Radius          0.205304
	InertiaMoment   0.399312

	Oblateness      0.0079674

	RotationPeriod  70.6157
	Obliquity       130.506
	EqAscendNode    61.6072

	AbsMagn         16.9812
	SlopeParam      4.1547
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.529 0.466 0.339)

	Surface
	{
		SurfStyle       0.690521
		OceanStyle      0.341541
		Randomize      (-0.440, 0.321, 0.744)
		colorDistMagn   0.322467
		colorDistFreq   1.38893e-005
		detailScale     5.60616
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999961
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.328368
		terraceProb     0.201624
		erosion         0
		montesMagn      0.63473
		montesFreq      2.7608
		montesSpiky     0.967319
		montesFraction  0.361963
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.70804e-005
		hillsFraction   0.704681
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238442
		craterFreq      0.210372
		craterDensity   0.889554
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.4843
		volcanoTemp     1284.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.206, 0.158, 0.095, 0.000)
		colorShelf     (0.212, 0.163, 0.109, 0.000)
		colorBeach     (0.249, 0.191, 0.129, 0.000)
		colorDesert    (0.270, 0.205, 0.125, 0.000)
		colorLowland   (0.296, 0.219, 0.142, 0.000)
		colorUpland    (0.328, 0.265, 0.173, 0.000)
		colorRock      (0.355, 0.289, 0.187, 0.000)
		colorSnow      (0.386, 0.307, 0.197, 1.000)
		BumpHeight      0.184773
		BumpOffset      0.0369547
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0492346
		GasToDust   0.25
		Particles   1079
		GasBright   0.0634759
		DustBright  0.282035
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   13.4809
		Period          59.2353
		Eccentricity    0.928698
		Inclination     -41.1441
		AscendingNode   5.48554
		ArgOfPericenter -128.37
		MeanAnomaly     93.6176
	}
}

Comet	"Dellalt System C83"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            1.60497e-011
	Radius          3.54298
	InertiaMoment   0.397988

	Oblateness      0.00560642

	RotationPeriod  68.4519
	Obliquity       83.7119
	EqAscendNode    46.1846

	AbsMagn         9.53995
	SlopeParam      4.73247
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.676 0.674 0.671)

	Surface
	{
		SurfStyle       0.998063
		OceanStyle      0.831266
		Randomize      (0.456, -0.868, -0.459)
		colorDistMagn   0.822424
		colorDistFreq   0.00381349
		detailScale     96.7469
		colorConversion true
		snowLevel       2
		tropicLatitude  0.505186
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.639924
		terraceProb     0.122805
		erosion         0
		montesMagn      0.627136
		montesFreq      2.37616
		montesSpiky     0.803791
		montesFraction  0.518939
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0339439
		hillsFraction   0.684598
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.291561
		craterFreq      0.201653
		craterDensity   0.801396
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.528188
		volcanoTemp     1589.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.230, 0.236, 0.268, 0.050)
		colorShelf     (0.270, 0.276, 0.309, 0.040)
		colorBeach     (0.311, 0.317, 0.349, 0.030)
		colorDesert    (0.352, 0.357, 0.396, 0.020)
		colorLowland   (0.392, 0.398, 0.436, 0.030)
		colorUpland    (0.433, 0.438, 0.476, 0.050)
		colorRock      (0.473, 0.478, 0.530, 0.020)
		colorSnow      (0.473, 0.478, 0.530, 1.000)
		BumpHeight      3.18868
		BumpOffset      0.637736
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.530427
		GasToDust   0.25
		Particles   2051
		GasBright   0.201491
		DustBright  0.628507
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   17.1305
		Period          84.8508
		Eccentricity    0.951468
		Inclination     62.5096
		AscendingNode   157.133
		ArgOfPericenter 97.3129
		MeanAnomaly     32.1715
	}
}

Comet	"Dellalt System C84"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            1.24133e-007
	Radius          80.024
	InertiaMoment   0.399743

	Oblateness      0.00894629

	RotationPeriod  66.3597
	Obliquity       36.9176
	EqAscendNode    30.762

	AbsMagn         6.04068
	SlopeParam      5.3805
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.677 0.582 0.524)

	Surface
	{
		SurfStyle       0.803687
		OceanStyle      0.768793
		Randomize      (0.544, -0.702, -0.587)
		colorDistMagn   0.596979
		colorDistFreq   4.35159
		detailScale     2185.19
		colorConversion true
		snowLevel       2
		tropicLatitude  0.672644
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.72106
		terraceProb     0.443948
		erosion         0
		montesMagn      0.518078
		montesFreq      2.84666
		montesSpiky     0.971508
		montesFraction  0.29277
		dunesFraction   0
		hillsMagn       0
		hillsFreq       15.5353
		hillsFraction   0.801668
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.289399
		craterFreq      0.240204
		craterDensity   0.826357
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.473888
		volcanoTemp     1588.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.264, 0.198, 0.147, 0.000)
		colorShelf     (0.271, 0.204, 0.168, 0.000)
		colorBeach     (0.318, 0.238, 0.199, 0.000)
		colorDesert    (0.345, 0.256, 0.194, 0.000)
		colorLowland   (0.379, 0.273, 0.220, 0.000)
		colorUpland    (0.420, 0.332, 0.267, 0.000)
		colorRock      (0.454, 0.361, 0.288, 0.000)
		colorSnow      (0.494, 0.384, 0.304, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.155275
		DustBright  0.35921
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   14.9542
		Period          69.2066
		Eccentricity    0.961115
		Inclination     8.95663
		AscendingNode   -57.8342
		ArgOfPericenter 102.842
		MeanAnomaly     -4.67982
	}
}

Comet	"Dellalt System C85"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            3.82215e-015
	Radius          0.219462
	InertiaMoment   0.398592

	Oblateness      0.00635001

	RotationPeriod  64.3277
	Obliquity       350.123
	EqAscendNode    15.3395

	AbsMagn         15.3438
	SlopeParam      6.22518
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.504 0.494 0.489)

	Surface
	{
		SurfStyle       0.950797
		OceanStyle      0.918995
		Randomize      (0.057, -0.995, -0.866)
		colorDistMagn   0.247082
		colorDistFreq   1.97483e-005
		detailScale     5.99276
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997588
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.481427
		terraceProb     0.151496
		erosion         0
		montesMagn      0.594785
		montesFreq      2.75168
		montesSpiky     0.867199
		montesFraction  0.358984
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000125422
		hillsFraction   0.473632
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229529
		craterFreq      0.272263
		craterDensity   1.03708
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.479242
		volcanoTemp     1251.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.171, 0.173, 0.196, 0.050)
		colorShelf     (0.201, 0.202, 0.225, 0.040)
		colorBeach     (0.232, 0.232, 0.254, 0.030)
		colorDesert    (0.262, 0.262, 0.289, 0.020)
		colorLowland   (0.292, 0.291, 0.318, 0.030)
		colorUpland    (0.322, 0.321, 0.347, 0.050)
		colorRock      (0.353, 0.351, 0.387, 0.020)
		colorSnow      (0.353, 0.351, 0.387, 1.000)
		BumpHeight      0.197515
		BumpOffset      0.0395031
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0820606
		GasToDust   0.25
		Particles   1145
		GasBright   0.36048
		DustBright  0.638491
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   14.7368
		Period          67.7026
		Eccentricity    0.954631
		Inclination     81.0924
		AscendingNode   -119.379
		ArgOfPericenter 2.35378
		MeanAnomaly     137.025
	}
}

Comet	"Dellalt System C86"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            2.95616e-011
	Radius          4.94459
	InertiaMoment   0.396308

	Oblateness      0.00991117

	RotationPeriod  62.3465
	Obliquity       303.329
	EqAscendNode    359.917

	AbsMagn         9.31754
	SlopeParam      8.0724
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.488 0.483 0.476)

	Surface
	{
		SurfStyle       0.927034
		OceanStyle      0.268402
		Randomize      (0.412, -0.037, 0.619)
		colorDistMagn   0.850181
		colorDistFreq   0.0129315
		detailScale     135.02
		colorConversion true
		snowLevel       2
		tropicLatitude  0.990908
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.634826
		terraceProb     0.289309
		erosion         0
		montesMagn      0.595762
		montesFreq      3.96289
		montesSpiky     0.992302
		montesFraction  0.263117
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0478694
		hillsFraction   0.363804
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223369
		craterFreq      0.178304
		craterDensity   0.908379
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.558617
		volcanoTemp     1314.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.166, 0.169, 0.190, 0.050)
		colorShelf     (0.195, 0.198, 0.219, 0.040)
		colorBeach     (0.225, 0.227, 0.247, 0.030)
		colorDesert    (0.254, 0.256, 0.281, 0.020)
		colorLowland   (0.283, 0.285, 0.309, 0.030)
		colorUpland    (0.313, 0.314, 0.338, 0.050)
		colorRock      (0.342, 0.343, 0.376, 0.020)
		colorSnow      (0.342, 0.343, 0.376, 1.000)
		BumpHeight      4.45013
		BumpOffset      0.890027
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.563252
		GasToDust   0.25
		Particles   2117
		GasBright   0.286982
		DustBright  0.396476
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   19.3324
		Period          101.725
		Eccentricity    0.952723
		Inclination     135.138
		AscendingNode   27.2474
		ArgOfPericenter 160.565
		MeanAnomaly     79.6151
	}
}

Comet	"Dellalt System C87"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            2.28637e-007
	Radius          85.7725
	InertiaMoment   0.399088

	Oblateness      0.00719984

	RotationPeriod  60.4078
	Obliquity       256.535
	EqAscendNode    344.494

	AbsMagn         5.80185
	SlopeParam      2.65018
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.653 0.650 0.645)

	Surface
	{
		SurfStyle       0.301348
		OceanStyle      0.388761
		Randomize      (-0.875, -0.424, 0.343)
		colorDistMagn   0.678866
		colorDistFreq   3.59564
		detailScale     2342.16
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998924
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.272266
		terraceProb     0.696308
		erosion         0
		montesMagn      0.450445
		montesFreq      2.12017
		montesSpiky     0.969518
		montesFraction  0.461968
		dunesFraction   0
		hillsMagn       0
		hillsFreq       20.905
		hillsFraction   0.536691
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224834
		craterFreq      0.266188
		craterDensity   0.965325
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.445528
		volcanoTemp     1281.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.261, 0.260, 0.258, 0.000)
		colorShelf     (0.278, 0.276, 0.274, 0.000)
		colorBeach     (0.294, 0.293, 0.290, 0.000)
		colorDesert    (0.310, 0.309, 0.307, 0.000)
		colorLowland   (0.327, 0.325, 0.323, 0.000)
		colorUpland    (0.343, 0.341, 0.339, 0.000)
		colorRock      (0.359, 0.358, 0.355, 0.000)
		colorSnow      (0.376, 0.374, 0.371, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.176224
		DustBright  0.19172
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   15.9483
		Period          76.2207
		Eccentricity    0.945832
		Inclination     17.2615
		AscendingNode   21.3661
		ArgOfPericenter 119.645
		MeanAnomaly     26.9434
	}
}

Comet	"Dellalt System C88"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            7.03991e-015
	Radius          0.305575
	InertiaMoment   0.397609

	Oblateness      0.0112101

	RotationPeriod  58.5045
	Obliquity       209.74
	EqAscendNode    329.072

	AbsMagn         14.4293
	SlopeParam      3.29346
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.556 0.549 0.547)

	Surface
	{
		SurfStyle       0.326822
		OceanStyle      0.767612
		Randomize      (0.243, -0.903, 0.742)
		colorDistMagn   0.291976
		colorDistFreq   4.65512e-005
		detailScale     8.34424
		colorConversion true
		snowLevel       2
		tropicLatitude  0.507193
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.330512
		terraceProb     0.242537
		erosion         0
		montesMagn      0.475895
		montesFreq      3.68237
		montesSpiky     0.940763
		montesFraction  0.413252
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0002407
		hillsFraction   0.625721
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.26951
		craterFreq      0.185021
		craterDensity   0.769733
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.546178
		volcanoTemp     1455
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.222, 0.220, 0.219, 0.000)
		colorShelf     (0.236, 0.233, 0.233, 0.000)
		colorBeach     (0.250, 0.247, 0.246, 0.000)
		colorDesert    (0.264, 0.261, 0.260, 0.000)
		colorLowland   (0.278, 0.275, 0.274, 0.000)
		colorUpland    (0.292, 0.288, 0.287, 0.000)
		colorRock      (0.306, 0.302, 0.301, 0.000)
		colorSnow      (0.319, 0.316, 0.315, 1.000)
		BumpHeight      0.275017
		BumpOffset      0.0550035
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.114886
		GasToDust   0.25
		Particles   1211
		GasBright   0.0323815
		DustBright  0.820049
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   18.4684
		Period          94.9829
		Eccentricity    0.980118
		Inclination     -16.6296
		AscendingNode   77.8554
		ArgOfPericenter -139.177
		MeanAnomaly     8.98935
	}
}

Comet	"Dellalt System C89"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            5.44486e-011
	Radius          5.31298
	InertiaMoment   0.399533

	Oblateness      0.00818972

	RotationPeriod  56.6301
	Obliquity       162.946
	EqAscendNode    313.649

	AbsMagn         9.09914
	SlopeParam      3.86966
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.625 0.620 0.616)

	Surface
	{
		SurfStyle       0.595973
		OceanStyle      0.143783
		Randomize      (-0.484, 0.193, -0.037)
		colorDistMagn   0.714748
		colorDistFreq   0.0170917
		detailScale     145.08
		colorConversion true
		snowLevel       2
		tropicLatitude  0.82782
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.481573
		terraceProb     0.212444
		erosion         0
		montesMagn      0.478429
		montesFreq      2.89046
		montesSpiky     0.849249
		montesFraction  0.25086
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0593936
		hillsFraction   0.559687
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250535
		craterFreq      0.234107
		craterDensity   0.887928
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.572334
		volcanoTemp     1643.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.244, 0.211, 0.172, 0.000)
		colorShelf     (0.250, 0.217, 0.197, 0.000)
		colorBeach     (0.294, 0.254, 0.234, 0.000)
		colorDesert    (0.319, 0.273, 0.228, 0.000)
		colorLowland   (0.350, 0.292, 0.259, 0.000)
		colorUpland    (0.387, 0.354, 0.314, 0.000)
		colorRock      (0.419, 0.385, 0.339, 0.000)
		colorSnow      (0.456, 0.409, 0.357, 1.000)
		BumpHeight      4.78168
		BumpOffset      0.956336
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.596078
		GasToDust   0.25
		Particles   2183
		GasBright   0.0520984
		DustBright  0.484819
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   16.3309
		Period          78.9797
		Eccentricity    0.962629
		Inclination     47.6832
		AscendingNode   112.399
		ArgOfPericenter 31.3433
		MeanAnomaly     -103.969
	}
}

Comet	"Dellalt System C90"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            4.21121e-007
	Radius          119.172
	InertiaMoment   0.398313

	Oblateness      0.0127127

	RotationPeriod  54.7788
	Obliquity       116.152
	EqAscendNode    298.227

	AbsMagn         5.55492
	SlopeParam      4.43503
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.638 0.634 0.632)

	Surface
	{
		SurfStyle       0.186169
		OceanStyle      0.185937
		Randomize      (-0.942, -0.692, 0.354)
		colorDistMagn   0.628281
		colorDistFreq   2.60291
		detailScale     3254.18
		colorConversion true
		snowLevel       2
		tropicLatitude  0.990597
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.530718
		terraceProb     0.474423
		erosion         0
		montesMagn      0.571972
		montesFreq      2.73116
		montesSpiky     0.96656
		montesFraction  0.412895
		dunesFraction   0
		hillsMagn       0
		hillsFreq       37.6699
		hillsFraction   0.753642
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257914
		craterFreq      0.439544
		craterDensity   1.00513
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.455667
		volcanoTemp     1585.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.255, 0.254, 0.253, 0.000)
		colorShelf     (0.271, 0.270, 0.269, 0.000)
		colorBeach     (0.287, 0.285, 0.284, 0.000)
		colorDesert    (0.303, 0.301, 0.300, 0.000)
		colorLowland   (0.319, 0.317, 0.316, 0.000)
		colorUpland    (0.335, 0.333, 0.332, 0.000)
		colorRock      (0.351, 0.349, 0.348, 0.000)
		colorSnow      (0.367, 0.365, 0.363, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0345562
		DustBright  0.186848
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   10.824
		Period          42.6168
		Eccentricity    0.938378
		Inclination     155.723
		AscendingNode   44.1152
		ArgOfPericenter 17.3963
		MeanAnomaly     30.5124
	}
}

Comet	"Dellalt System C91"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            1.29666e-014
	Radius          0.3291
	InertiaMoment   0.399956

	Oblateness      0.00936542

	RotationPeriod  52.9453
	Obliquity       69.3576
	EqAscendNode    282.804

	AbsMagn         13.7638
	SlopeParam      5.03831
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.637 0.632 0.627)

	Surface
	{
		SurfStyle       0.891583
		OceanStyle      0.406793
		Randomize      (0.797, 0.896, 0.960)
		colorDistMagn   0.619917
		colorDistFreq   5.39136e-005
		detailScale     8.98664
		colorConversion true
		snowLevel       2
		tropicLatitude  0.992099
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.49572
		terraceProb     0.704953
		erosion         0
		montesMagn      0.558325
		montesFreq      2.90146
		montesSpiky     0.968472
		montesFraction  0.415021
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000275098
		hillsFraction   0.707984
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225709
		craterFreq      0.260807
		craterDensity   0.951227
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.459011
		volcanoTemp     1615.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.217, 0.221, 0.251, 0.050)
		colorShelf     (0.255, 0.259, 0.288, 0.040)
		colorBeach     (0.293, 0.297, 0.326, 0.030)
		colorDesert    (0.331, 0.335, 0.370, 0.020)
		colorLowland   (0.369, 0.373, 0.407, 0.030)
		colorUpland    (0.408, 0.411, 0.445, 0.050)
		colorRock      (0.446, 0.449, 0.495, 0.020)
		colorSnow      (0.446, 0.449, 0.495, 1.000)
		BumpHeight      0.29619
		BumpOffset      0.0592381
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.147712
		GasToDust   0.25
		Particles   1278
		GasBright   0.151853
		DustBright  0.554037
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   21.2388
		Period          117.138
		Eccentricity    0.969387
		Inclination     -72.6534
		AscendingNode   88.6945
		ArgOfPericenter 33.6527
		MeanAnomaly     -105.268
	}
}

Comet	"Dellalt System C92"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            1.00288e-010
	Radius          7.36698
	InertiaMoment   0.398852

	Oblateness      0.0145073

	RotationPeriod  51.1246
	Obliquity       22.5633
	EqAscendNode    267.381

	AbsMagn         8.88398
	SlopeParam      5.75764
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.572 0.569 0.567)

	Surface
	{
		SurfStyle       0.685359
		OceanStyle      0.630551
		Randomize      (-0.096, -0.564, 0.262)
		colorDistMagn   0.358962
		colorDistFreq   0.0315874
		detailScale     201.168
		colorConversion true
		snowLevel       2
		tropicLatitude  0.871438
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.68821
		terraceProb     0.283779
		erosion         0
		montesMagn      0.559075
		montesFreq      3.07854
		montesSpiky     0.936956
		montesFraction  0.706152
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.101346
		hillsFraction   0.5952
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254236
		craterFreq      0.266593
		craterDensity   0.961552
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.519667
		volcanoTemp     1171.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.223, 0.193, 0.159, 0.000)
		colorShelf     (0.229, 0.199, 0.181, 0.000)
		colorBeach     (0.269, 0.233, 0.215, 0.000)
		colorDesert    (0.292, 0.250, 0.210, 0.000)
		colorLowland   (0.320, 0.267, 0.238, 0.000)
		colorUpland    (0.355, 0.324, 0.289, 0.000)
		colorRock      (0.383, 0.353, 0.312, 0.000)
		colorSnow      (0.417, 0.375, 0.329, 1.000)
		BumpHeight      6.63028
		BumpOffset      1.32606
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.628904
		GasToDust   0.25
		Particles   2250
		GasBright   0.107029
		DustBright  0.283348
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   16.9854
		Period          83.7753
		Eccentricity    0.956774
		Inclination     45.438
		AscendingNode   -54.8314
		ArgOfPericenter 170.024
		MeanAnomaly     -117.523
	}
}

Comet	"Dellalt System C93"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            7.75654e-007
	Radius          128.623
	InertiaMoment   0.397117

	Oblateness      0.0106608

	RotationPeriod  49.3118
	Obliquity       335.769
	EqAscendNode    251.959

	AbsMagn         5.29829
	SlopeParam      6.8418
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.411 0.408 0.404)

	Surface
	{
		SurfStyle       0.828383
		OceanStyle      0.100903
		Randomize      (-0.245, 0.987, 0.017)
		colorDistMagn   0.610703
		colorDistFreq   10.1426
		detailScale     3512.27
		colorConversion true
		snowLevel       2
		tropicLatitude  0.985381
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.315423
		terraceProb     0.21955
		erosion         0
		montesMagn      0.563651
		montesFreq      3.30625
		montesSpiky     0.853444
		montesFraction  0.19783
		dunesFraction   0
		hillsMagn       0
		hillsFreq       43.0122
		hillsFraction   0.686982
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252093
		craterFreq      0.594945
		craterDensity   1.03616
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.518449
		volcanoTemp     1734.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.160, 0.139, 0.113, 0.000)
		colorShelf     (0.165, 0.143, 0.129, 0.000)
		colorBeach     (0.193, 0.167, 0.153, 0.000)
		colorDesert    (0.210, 0.179, 0.149, 0.000)
		colorLowland   (0.230, 0.192, 0.170, 0.000)
		colorUpland    (0.255, 0.233, 0.206, 0.000)
		colorRock      (0.276, 0.253, 0.222, 0.000)
		colorSnow      (0.300, 0.269, 0.234, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.291516
		DustBright  0.583347
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   16.5599
		Period          80.6468
		Eccentricity    0.96363
		Inclination     -104.108
		AscendingNode   -170.561
		ArgOfPericenter -133.725
		MeanAnomaly     172.723
	}
}

Comet	"Dellalt System C94"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            2.38829e-014
	Radius          0.455469
	InertiaMoment   0.399318

	Oblateness      0.016705

	RotationPeriod  47.5023
	Obliquity       288.975
	EqAscendNode    236.536

	AbsMagn         13.228
	SlopeParam      2.26664
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.554 0.551 0.548)

	Surface
	{
		SurfStyle       0.695266
		OceanStyle      0.179326
		Randomize      (0.080, -0.041, -0.448)
		colorDistMagn   0.779347
		colorDistFreq   9.90932e-005
		detailScale     12.4373
		colorConversion true
		snowLevel       2
		tropicLatitude  0.938058
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.327782
		terraceProb     0.147962
		erosion         0
		montesMagn      0.504654
		montesFreq      2.37551
		montesSpiky     0.837569
		montesFraction  0.723512
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000632783
		hillsFraction   0.707064
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.266728
		craterFreq      0.205414
		craterDensity   0.768245
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.520241
		volcanoTemp     1150.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.216, 0.187, 0.153, 0.000)
		colorShelf     (0.222, 0.193, 0.175, 0.000)
		colorBeach     (0.261, 0.226, 0.208, 0.000)
		colorDesert    (0.283, 0.243, 0.203, 0.000)
		colorLowland   (0.310, 0.259, 0.230, 0.000)
		colorUpland    (0.344, 0.314, 0.279, 0.000)
		colorRock      (0.371, 0.342, 0.301, 0.000)
		colorSnow      (0.405, 0.364, 0.318, 1.000)
		BumpHeight      0.409922
		BumpOffset      0.0819845
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.180538
		GasToDust   0.25
		Particles   1344
		GasBright   0.21941
		DustBright  0.33994
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   13.0674
		Period          56.5309
		Eccentricity    0.965352
		Inclination     -165.49
		AscendingNode   -82.3111
		ArgOfPericenter -64.8913
		MeanAnomaly     153.539
	}
}

Comet	"Dellalt System C95"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            1.84717e-010
	Radius          7.96725
	InertiaMoment   0.397997

	Oblateness      0.0124331

	RotationPeriod  45.6916
	Obliquity       242.18
	EqAscendNode    221.114

	AbsMagn         8.67134
	SlopeParam      2.98063
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.731 0.728 0.727)

	Surface
	{
		SurfStyle       0.0953503
		OceanStyle      0.110788
		Randomize      (-0.736, -0.253, -0.447)
		colorDistMagn   0.657484
		colorDistFreq   0.0358845
		detailScale     217.559
		colorConversion true
		snowLevel       2
		tropicLatitude  0.919822
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.591205
		terraceProb     0.190525
		erosion         0
		montesMagn      0.450402
		montesFreq      2.56847
		montesSpiky     0.787534
		montesFraction  0.654764
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.171977
		hillsFraction   0.91496
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240131
		craterFreq      0.146879
		craterDensity   1.05435
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.485692
		volcanoTemp     1755.33
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.293, 0.291, 0.291, 0.000)
		colorShelf     (0.311, 0.309, 0.309, 0.000)
		colorBeach     (0.329, 0.328, 0.327, 0.000)
		colorDesert    (0.347, 0.346, 0.345, 0.000)
		colorLowland   (0.366, 0.364, 0.363, 0.000)
		colorUpland    (0.384, 0.382, 0.381, 0.000)
		colorRock      (0.402, 0.400, 0.400, 0.000)
		colorSnow      (0.421, 0.419, 0.418, 1.000)
		BumpHeight      7.17052
		BumpOffset      1.4341
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.66173
		GasToDust   0.25
		Particles   2316
		GasBright   0.110044
		DustBright  0.133792
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   18.6143
		Period          96.1108
		Eccentricity    0.962823
		Inclination     -13.5627
		AscendingNode   -107.202
		ArgOfPericenter -15.6379
		MeanAnomaly     134.301
	}
}

Comet	"Dellalt System C96"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            5.68757e-018
	Radius          0.028163
	InertiaMoment   0.399749

	Oblateness      0.0194698

	RotationPeriod  43.875
	Obliquity       195.386
	EqAscendNode    205.691

	AbsMagn         5.03002
	SlopeParam      3.58194
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.611 0.608 0.606)

	Surface
	{
		SurfStyle       0.521511
		OceanStyle      0.128132
		Randomize      (-0.086, -0.226, -0.441)
		colorDistMagn   0.826202
		colorDistFreq   4.29695e-007
		detailScale     0.769037
		colorConversion true
		snowLevel       2
		tropicLatitude  0.166553
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.369089
		terraceProb     0.112178
		erosion         0
		montesMagn      0.463505
		montesFreq      3.24356
		montesSpiky     0.983279
		montesFraction  0.460693
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.91403e-006
		hillsFraction   0.723831
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256979
		craterFreq      0.161149
		craterDensity   0.94527
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.477117
		volcanoTemp     1418.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.238, 0.207, 0.170, 0.000)
		colorShelf     (0.244, 0.213, 0.194, 0.000)
		colorBeach     (0.287, 0.249, 0.230, 0.000)
		colorDesert    (0.312, 0.267, 0.224, 0.000)
		colorLowland   (0.342, 0.286, 0.255, 0.000)
		colorUpland    (0.379, 0.346, 0.309, 0.000)
		colorRock      (0.409, 0.377, 0.333, 0.000)
		colorSnow      (0.446, 0.401, 0.352, 1.000)
		BumpHeight      0.0253467
		BumpOffset      0.00506934
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.00753765
		DustBright  0.720785
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   15.5964
		Period          73.712
		Eccentricity    0.981745
		Inclination     173.763
		AscendingNode   16.8967
		ArgOfPericenter 18.9175
		MeanAnomaly     -25.6401
	}
}

Comet	"Dellalt System C97"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            4.39893e-014
	Radius          0.493513
	InertiaMoment   0.398599

	Oblateness      0.014685

	RotationPeriod  42.0479
	Obliquity       148.592
	EqAscendNode    190.268

	AbsMagn         12.7724
	SlopeParam      4.14697
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.459 0.454 0.448)

	Surface
	{
		SurfStyle       0.215921
		OceanStyle      0.917487
		Randomize      (0.076, 0.746, -0.913)
		colorDistMagn   0.568537
		colorDistFreq   0.00014578
		detailScale     13.4762
		colorConversion true
		snowLevel       2
		tropicLatitude  0.961921
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.333743
		terraceProb     0.286482
		erosion         0
		montesMagn      0.499207
		montesFreq      2.32687
		montesSpiky     0.964874
		montesFraction  0.619762
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000531972
		hillsFraction   0.590251
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.196431
		craterFreq      0.192461
		craterDensity   0.805586
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.470216
		volcanoTemp     1790.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.184, 0.182, 0.179, 0.000)
		colorShelf     (0.195, 0.193, 0.190, 0.000)
		colorBeach     (0.207, 0.204, 0.202, 0.000)
		colorDesert    (0.218, 0.216, 0.213, 0.000)
		colorLowland   (0.230, 0.227, 0.224, 0.000)
		colorUpland    (0.241, 0.238, 0.235, 0.000)
		colorRock      (0.253, 0.250, 0.246, 0.000)
		colorSnow      (0.264, 0.261, 0.258, 1.000)
		BumpHeight      0.444162
		BumpOffset      0.0888324
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.213364
		GasToDust   0.25
		Particles   1410
		GasBright   0.0286468
		DustBright  0.384163
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   18.7395
		Period          97.0814
		Eccentricity    0.978246
		Inclination     -103.09
		AscendingNode   -156.824
		ArgOfPericenter -27.0267
		MeanAnomaly     146.275
	}
}

Comet	"Dellalt System C98"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            3.40226e-010
	Radius          10.9886
	InertiaMoment   0.396337

	Oblateness      0.0227313

	RotationPeriod  40.2052
	Obliquity       101.797
	EqAscendNode    174.846

	AbsMagn         8.46058
	SlopeParam      4.72422
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.627 0.539 0.416)

	Surface
	{
		SurfStyle       0.977797
		OceanStyle      0.00962607
		Randomize      (0.340, -0.532, 0.974)
		colorDistMagn   0.461137
		colorDistFreq   0.044214
		detailScale     300.062
		colorConversion true
		snowLevel       2
		tropicLatitude  0.790918
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.283511
		terraceProb     0.667756
		erosion         0
		montesMagn      0.663028
		montesFreq      2.32894
		montesSpiky     0.976321
		montesFraction  0.307048
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.246918
		hillsFraction   0.632407
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243075
		craterFreq      0.184547
		craterDensity   0.81896
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.551981
		volcanoTemp     1458.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.213, 0.189, 0.166, 0.050)
		colorShelf     (0.251, 0.221, 0.191, 0.040)
		colorBeach     (0.288, 0.253, 0.216, 0.030)
		colorDesert    (0.326, 0.286, 0.245, 0.020)
		colorLowland   (0.363, 0.318, 0.270, 0.030)
		colorUpland    (0.401, 0.350, 0.295, 0.050)
		colorRock      (0.439, 0.383, 0.328, 0.020)
		colorSnow      (0.439, 0.383, 0.328, 1.000)
		BumpHeight      9.88974
		BumpOffset      1.97795
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.694556
		GasToDust   0.25
		Particles   2382
		GasBright   0.115249
		DustBright  0.782048
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   23.9814
		Period          140.544
		Eccentricity    0.970129
		Inclination     -94.5666
		AscendingNode   130.076
		ArgOfPericenter 13.2874
		MeanAnomaly     41.7451
	}
}

Comet	"Dellalt System C99"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            1.04758e-017
	Radius          0.0305695
	InertiaMoment   0.399094

	Oblateness      0.0176584

	RotationPeriod  38.3419
	Obliquity       55.0032
	EqAscendNode    159.423

	AbsMagn         4.74767
	SlopeParam      5.37073
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.765 0.712 0.691)

	Surface
	{
		SurfStyle       0.79316
		OceanStyle      0.354977
		Randomize      (-0.832, -0.435, 0.328)
		colorDistMagn   0.161297
		colorDistFreq   4.8358e-007
		detailScale     0.834752
		colorConversion true
		snowLevel       2
		tropicLatitude  0.771497
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.457748
		terraceProb     0.218643
		erosion         0
		montesMagn      0.474098
		montesFreq      3.27564
		montesSpiky     0.966024
		montesFraction  0.718326
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.07389e-006
		hillsFraction   0.666546
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256819
		craterFreq      0.23573
		craterDensity   0.787195
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.494721
		volcanoTemp     1471.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.299, 0.242, 0.194, 0.000)
		colorShelf     (0.306, 0.249, 0.221, 0.000)
		colorBeach     (0.360, 0.292, 0.263, 0.000)
		colorDesert    (0.390, 0.313, 0.256, 0.000)
		colorLowland   (0.429, 0.335, 0.290, 0.000)
		colorUpland    (0.475, 0.406, 0.353, 0.000)
		colorRock      (0.513, 0.441, 0.380, 0.000)
		colorSnow      (0.559, 0.470, 0.401, 1.000)
		BumpHeight      0.0275126
		BumpOffset      0.00550252
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.109076
		DustBright  0.472707
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   19.1495
		Period          100.285
		Eccentricity    0.956974
		Inclination     143.87
		AscendingNode   -69.0116
		ArgOfPericenter -135.976
		MeanAnomaly     -61.6422
	}
}

Comet	"Dellalt System C100"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            8.10229e-014
	Radius          0.67959
	InertiaMoment   0.39762

	Oblateness      0.0275995

	RotationPeriod  36.4524
	Obliquity       8.20888
	EqAscendNode    144.001

	AbsMagn         12.3715
	SlopeParam      6.21091
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.498 0.494 0.491)

	Surface
	{
		SurfStyle       0.477998
		OceanStyle      0.535523
		Randomize      (0.946, -0.456, -0.724)
		colorDistMagn   0.224092
		colorDistFreq   0.000247636
		detailScale     18.5573
		colorConversion true
		snowLevel       2
		tropicLatitude  0.8954
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.764256
		terraceProb     0.38618
		erosion         0
		montesMagn      0.626604
		montesFreq      2.51649
		montesSpiky     0.87009
		montesFraction  0.641854
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000916187
		hillsFraction   0.949495
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218881
		craterFreq      0.239873
		craterDensity   0.616136
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.491696
		volcanoTemp     1522.25
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.199, 0.198, 0.197, 0.000)
		colorShelf     (0.211, 0.210, 0.209, 0.000)
		colorBeach     (0.224, 0.222, 0.221, 0.000)
		colorDesert    (0.236, 0.235, 0.233, 0.000)
		colorLowland   (0.249, 0.247, 0.246, 0.000)
		colorUpland    (0.261, 0.259, 0.258, 0.000)
		colorRock      (0.274, 0.272, 0.270, 0.000)
		colorSnow      (0.286, 0.284, 0.283, 1.000)
		BumpHeight      0.611631
		BumpOffset      0.122326
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.24619
		GasToDust   0.25
		Particles   1477
		GasBright   0.0656435
		DustBright  0.200626
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   11.0731
		Period          44.0966
		Eccentricity    0.915513
		Inclination     108.24
		AscendingNode   2.58847
		ArgOfPericenter 173.827
		MeanAnomaly     175.286
	}
}

Comet	"Dellalt System C101"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            6.26653e-010
	Radius          11.9475
	InertiaMoment   0.399539

	Oblateness      0.0217645

	RotationPeriod  34.5305
	Obliquity       321.415
	EqAscendNode    128.578

	AbsMagn         8.25109
	SlopeParam      8.0129
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.688 0.685 0.680)

	Surface
	{
		SurfStyle       0.229683
		OceanStyle      0.124402
		Randomize      (-0.587, 0.283, -0.500)
		colorDistMagn   0.725761
		colorDistFreq   0.0604552
		detailScale     326.247
		colorConversion true
		snowLevel       2
		tropicLatitude  0.639276
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.690494
		terraceProb     0.285233
		erosion         0
		montesMagn      0.613393
		montesFreq      2.58333
		montesSpiky     0.900147
		montesFraction  0.695265
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.241984
		hillsFraction   0.668649
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226665
		craterFreq      0.26964
		craterDensity   1.00432
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.598404
		volcanoTemp     1602.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.275, 0.274, 0.272, 0.000)
		colorShelf     (0.292, 0.291, 0.289, 0.000)
		colorBeach     (0.310, 0.308, 0.306, 0.000)
		colorDesert    (0.327, 0.325, 0.323, 0.000)
		colorLowland   (0.344, 0.343, 0.340, 0.000)
		colorUpland    (0.361, 0.360, 0.357, 0.000)
		colorRock      (0.378, 0.377, 0.374, 0.000)
		colorSnow      (0.396, 0.394, 0.391, 1.000)
		BumpHeight      10.7528
		BumpOffset      2.15056
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.727382
		GasToDust   0.25
		Particles   2449
		GasBright   0.229413
		DustBright  0.521343
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   13.07
		Period          56.5475
		Eccentricity    0.924883
		Inclination     178.843
		AscendingNode   4.9244
		ArgOfPericenter 35.7419
		MeanAnomaly     176.055
	}
}

Comet	"Dellalt System C102"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            1.92951e-017
	Radius          0.0420327
	InertiaMoment   0.39832

	Oblateness      0.0344398

	RotationPeriod  32.5693
	Obliquity       274.62
	EqAscendNode    113.155

	AbsMagn         4.44809
	SlopeParam      2.64048
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.429 0.424 0.421)

	Surface
	{
		SurfStyle       0.130523
		OceanStyle      0.935609
		Randomize      (-0.751, -0.507, -0.505)
		colorDistMagn   0.430644
		colorDistFreq   8.12783e-007
		detailScale     1.14777
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997789
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.589349
		terraceProb     0.64116
		erosion         0
		montesMagn      0.416349
		montesFreq      2.9383
		montesSpiky     0.994297
		montesFraction  0.611129
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.32451e-006
		hillsFraction   0.58971
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245237
		craterFreq      0.16116
		craterDensity   0.899164
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.417739
		volcanoTemp     1362.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.172, 0.170, 0.168, 0.000)
		colorShelf     (0.182, 0.180, 0.179, 0.000)
		colorBeach     (0.193, 0.191, 0.190, 0.000)
		colorDesert    (0.204, 0.202, 0.200, 0.000)
		colorLowland   (0.215, 0.212, 0.211, 0.000)
		colorUpland    (0.225, 0.223, 0.221, 0.000)
		colorRock      (0.236, 0.233, 0.232, 0.000)
		colorSnow      (0.247, 0.244, 0.242, 1.000)
		BumpHeight      0.0378295
		BumpOffset      0.00756589
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.158699
		DustBright  0.276544
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   20.3641
		Period          109.976
		Eccentricity    0.970992
		Inclination     64.9695
		AscendingNode   96.3913
		ArgOfPericenter -19.3803
		MeanAnomaly     46.5008
	}
}

Comet	"Dellalt System C103"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            1.49234e-013
	Radius          0.740063
	InertiaMoment   0.399961

	Oblateness      0.0277733

	RotationPeriod  30.5613
	Obliquity       227.826
	EqAscendNode    97.7328

	AbsMagn         12.0103
	SlopeParam      3.28524
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.645 0.641 0.638)

	Surface
	{
		SurfStyle       0.540119
		OceanStyle      0.0348076
		Randomize      (-0.882, -0.040, -0.174)
		colorDistMagn   0.9166
		colorDistFreq   0.000393425
		detailScale     20.2086
		colorConversion true
		snowLevel       2
		tropicLatitude  0.3182
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.403481
		terraceProb     0.257088
		erosion         0
		montesMagn      0.592401
		montesFreq      1.9957
		montesSpiky     0.969833
		montesFraction  0.323629
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0010721
		hillsFraction   0.497363
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259732
		craterFreq      0.25319
		craterDensity   0.932127
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.385181
		volcanoTemp     1751.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.252, 0.218, 0.179, 0.000)
		colorShelf     (0.258, 0.224, 0.204, 0.000)
		colorBeach     (0.303, 0.263, 0.243, 0.000)
		colorDesert    (0.329, 0.282, 0.236, 0.000)
		colorLowland   (0.361, 0.301, 0.268, 0.000)
		colorUpland    (0.400, 0.365, 0.326, 0.000)
		colorRock      (0.432, 0.397, 0.351, 0.000)
		colorSnow      (0.471, 0.423, 0.370, 1.000)
		BumpHeight      0.666056
		BumpOffset      0.133211
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.279016
		GasToDust   0.25
		Particles   1543
		GasBright   0.389658
		DustBright  0.530071
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   17.4531
		Period          87.2592
		Eccentricity    0.986094
		Inclination     -52.8543
		AscendingNode   -23.288
		ArgOfPericenter 54.6175
		MeanAnomaly     6.05589
	}
}

Comet	"Dellalt System C104"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            1.15422e-009
	Radius          16.4045
	InertiaMoment   0.398858

	Oblateness      0.044795

	RotationPeriod  28.4974
	Obliquity       181.032
	EqAscendNode    82.3102

	AbsMagn         8.04229
	SlopeParam      3.86193
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.419 0.414 0.412)

	Surface
	{
		SurfStyle       0.807728
		OceanStyle      0.527122
		Randomize      (-0.082, -0.191, -0.916)
		colorDistMagn   0.582631
		colorDistFreq   0.0144352
		detailScale     447.952
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998314
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.61106
		terraceProb     0.165683
		erosion         0
		montesMagn      0.449099
		montesFreq      3.4616
		montesSpiky     0.91487
		montesFraction  0.690478
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.506957
		hillsFraction   0.700134
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233875
		craterFreq      0.231351
		craterDensity   0.741039
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.489534
		volcanoTemp     1309.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.163, 0.141, 0.115, 0.000)
		colorShelf     (0.168, 0.145, 0.132, 0.000)
		colorBeach     (0.197, 0.170, 0.156, 0.000)
		colorDesert    (0.214, 0.182, 0.152, 0.000)
		colorLowland   (0.235, 0.195, 0.173, 0.000)
		colorUpland    (0.260, 0.236, 0.210, 0.000)
		colorRock      (0.281, 0.257, 0.227, 0.000)
		colorSnow      (0.306, 0.274, 0.239, 1.000)
		BumpHeight      14.7641
		BumpOffset      2.95281
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.760208
		GasToDust   0.25
		Particles   2515
		GasBright   0.291662
		DustBright  0.312554
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   17.5535
		Period          88.013
		Eccentricity    0.960058
		Inclination     -87.4498
		AscendingNode   41.0508
		ArgOfPericenter -38.5722
		MeanAnomaly     -159.527
	}
}

Comet	"Dellalt System C105"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            3.55392e-017
	Radius          0.0458414
	InertiaMoment   0.397132

	Oblateness      0.0368434

	RotationPeriod  26.3673
	Obliquity       134.237
	EqAscendNode    66.8876

	AbsMagn         4.12714
	SlopeParam      4.42713
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.541 0.538 0.531)

	Surface
	{
		SurfStyle       0.765514
		OceanStyle      0.0300929
		Randomize      (0.968, 0.682, 0.354)
		colorDistMagn   0.528311
		colorDistFreq   1.20906e-006
		detailScale     1.25178
		colorConversion true
		snowLevel       2
		tropicLatitude  0.469383
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.491844
		terraceProb     0.220675
		erosion         0
		montesMagn      0.591969
		montesFreq      3.08086
		montesSpiky     0.863707
		montesFraction  0.407829
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.32387e-006
		hillsFraction   0.424547
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264197
		craterFreq      0.224663
		craterDensity   0.908209
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.548787
		volcanoTemp     2044.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.211, 0.183, 0.149, 0.000)
		colorShelf     (0.217, 0.188, 0.170, 0.000)
		colorBeach     (0.254, 0.221, 0.202, 0.000)
		colorDesert    (0.276, 0.237, 0.197, 0.000)
		colorLowland   (0.303, 0.253, 0.223, 0.000)
		colorUpland    (0.336, 0.307, 0.271, 0.000)
		colorRock      (0.363, 0.333, 0.292, 0.000)
		colorSnow      (0.395, 0.355, 0.308, 1.000)
		BumpHeight      0.0412572
		BumpOffset      0.00825145
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0120552
		DustBright  0.276647
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   16.5978
		Period          80.9242
		Eccentricity    0.974626
		Inclination     -150.787
		AscendingNode   38.3848
		ArgOfPericenter 59.8594
		MeanAnomaly     -65.8743
	}
}

Comet	"Dellalt System C106"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            2.7487e-013
	Radius          1.01478
	InertiaMoment   0.399323

	Oblateness      0.0620631

	RotationPeriod  24.1586
	Obliquity       87.4431
	EqAscendNode    51.4651

	AbsMagn         11.6792
	SlopeParam      5.02949
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.430 0.425 0.419)

	Surface
	{
		SurfStyle       0.160231
		OceanStyle      0.810015
		Randomize      (-0.452, -0.321, 0.521)
		colorDistMagn   0.356951
		colorDistFreq   0.000238961
		detailScale     27.7101
		colorConversion true
		snowLevel       2
		tropicLatitude  0.979667
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.464903
		terraceProb     0.272588
		erosion         0
		montesMagn      0.509159
		montesFreq      3.62708
		montesSpiky     0.808945
		montesFraction  0.886937
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00295174
		hillsFraction   0.658746
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241186
		craterFreq      0.197115
		craterDensity   1.07275
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.494069
		volcanoTemp     1200.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.172, 0.170, 0.168, 0.000)
		colorShelf     (0.183, 0.180, 0.178, 0.000)
		colorBeach     (0.194, 0.191, 0.189, 0.000)
		colorDesert    (0.204, 0.202, 0.199, 0.000)
		colorLowland   (0.215, 0.212, 0.210, 0.000)
		colorUpland    (0.226, 0.223, 0.220, 0.000)
		colorRock      (0.237, 0.234, 0.231, 0.000)
		colorSnow      (0.247, 0.244, 0.241, 1.000)
		BumpHeight      0.913298
		BumpOffset      0.18266
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.311842
		GasToDust   0.25
		Particles   1609
		GasBright   0.0779389
		DustBright  0.69525
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   14.0614
		Period          63.1019
		Eccentricity    0.960467
		Inclination     -105.368
		AscendingNode   77.2587
		ArgOfPericenter -62.6057
		MeanAnomaly     129.996
	}
}

Comet	"Dellalt System C107"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            2.12592e-009
	Radius          17.9163
	InertiaMoment   0.398005

	Oblateness      0.0536897

	RotationPeriod  21.8562
	Obliquity       40.6488
	EqAscendNode    36.0425

	AbsMagn         7.83361
	SlopeParam      5.74631
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.609 0.605 0.599)

	Surface
	{
		SurfStyle       0.742256
		OceanStyle      0.722993
		Randomize      (-0.157, 0.642, -0.847)
		colorDistMagn   0.569124
		colorDistFreq   0.194424
		detailScale     489.233
		colorConversion true
		snowLevel       2
		tropicLatitude  0.656122
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.474899
		terraceProb     0.164373
		erosion         0
		montesMagn      0.403878
		montesFreq      2.54461
		montesSpiky     0.894067
		montesFraction  0.332346
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.793655
		hillsFraction   0.576843
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23094
		craterFreq      0.24459
		craterDensity   0.721928
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.507499
		volcanoTemp     1474.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.237, 0.206, 0.168, 0.000)
		colorShelf     (0.244, 0.212, 0.192, 0.000)
		colorBeach     (0.286, 0.248, 0.228, 0.000)
		colorDesert    (0.311, 0.266, 0.222, 0.000)
		colorLowland   (0.341, 0.284, 0.251, 0.000)
		colorUpland    (0.378, 0.345, 0.305, 0.000)
		colorRock      (0.408, 0.375, 0.329, 0.000)
		colorSnow      (0.445, 0.399, 0.347, 1.000)
		BumpHeight      16.1246
		BumpOffset      3.22493
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.793034
		GasToDust   0.25
		Particles   2581
		GasBright   0.0731581
		DustBright  0.384517
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   11.4753
		Period          46.5206
		Eccentricity    0.921733
		Inclination     -175.571
		AscendingNode   -87.9531
		ArgOfPericenter 10.3464
		MeanAnomaly     -44.5058
	}
}

Comet	"Dellalt System C108"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            6.54588e-017
	Radius          0.0627777
	InertiaMoment   0.399754

	Oblateness      0.0954291

	RotationPeriod  19.4416
	Obliquity       353.854
	EqAscendNode    20.6199

	AbsMagn         3.77908
	SlopeParam      6.82078
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.641 0.557 0.448)

	Surface
	{
		SurfStyle       0.36336
		OceanStyle      0.509635
		Randomize      (-0.453, 0.659, -0.690)
		colorDistMagn   0.193261
		colorDistFreq   1.53066e-006
		detailScale     1.71425
		colorConversion true
		snowLevel       2
		tropicLatitude  0.119129
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.339464
		terraceProb     0.119451
		erosion         0
		montesMagn      0.431743
		montesFreq      3.66428
		montesSpiky     0.927878
		montesFraction  0.666691
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.95296e-006
		hillsFraction   0.656587
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.270904
		craterFreq      0.194082
		craterDensity   0.978467
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.485306
		volcanoTemp     1729.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.256, 0.223, 0.179, 0.000)
		colorShelf     (0.272, 0.237, 0.190, 0.000)
		colorBeach     (0.288, 0.251, 0.202, 0.000)
		colorDesert    (0.304, 0.265, 0.213, 0.000)
		colorLowland   (0.321, 0.279, 0.224, 0.000)
		colorUpland    (0.337, 0.293, 0.235, 0.000)
		colorRock      (0.353, 0.307, 0.246, 0.000)
		colorSnow      (0.369, 0.321, 0.258, 1.000)
		BumpHeight      0.0565
		BumpOffset      0.0113
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.206232
		DustBright  0.73593
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   16.3451
		Period          79.0828
		Eccentricity    0.962136
		Inclination     176.665
		AscendingNode   92.8482
		ArgOfPericenter 171.247
		MeanAnomaly     -117.79
	}
}

Comet	"Dellalt System C109"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            5.06277e-013
	Radius          1.10978
	InertiaMoment   0.398605

	Oblateness      0.0899152

	RotationPeriod  16.891
	Obliquity       307.06
	EqAscendNode    5.19729

	AbsMagn         11.3715
	SlopeParam      2.25538
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.675 0.669 0.666)

	Surface
	{
		SurfStyle       0.135277
		OceanStyle      0.700866
		Randomize      (0.423, -0.660, 0.830)
		colorDistMagn   0.317957
		colorDistFreq   0.000899423
		detailScale     30.3044
		colorConversion true
		snowLevel       2
		tropicLatitude  0.451142
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.700391
		terraceProb     0.41618
		erosion         0
		montesMagn      0.589886
		montesFreq      2.57
		montesSpiky     0.904174
		montesFraction  0.711317
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00260858
		hillsFraction   0.750742
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.195064
		craterFreq      0.227166
		craterDensity   0.866462
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.521159
		volcanoTemp     1465.82
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.270, 0.268, 0.267, 0.000)
		colorShelf     (0.287, 0.284, 0.283, 0.000)
		colorBeach     (0.304, 0.301, 0.300, 0.000)
		colorDesert    (0.321, 0.318, 0.317, 0.000)
		colorLowland   (0.337, 0.335, 0.333, 0.000)
		colorUpland    (0.354, 0.351, 0.350, 0.000)
		colorRock      (0.371, 0.368, 0.367, 0.000)
		colorSnow      (0.388, 0.385, 0.383, 1.000)
		BumpHeight      0.998801
		BumpOffset      0.19976
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.344668
		GasToDust   0.25
		Particles   1676
		GasBright   0.174169
		DustBright  0.452479
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   15.8773
		Period          75.7123
		Eccentricity    0.969842
		Inclination     77.4525
		AscendingNode   12.139
		ArgOfPericenter 34.0811
		MeanAnomaly     137.747
	}
}

Comet	"Dellalt System C110"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            3.91568e-009
	Radius          24.5057
	InertiaMoment   0.396364

	Oblateness      0.176277

	RotationPeriod  14.1739
	Obliquity       260.266
	EqAscendNode    349.775

	AbsMagn         7.62447
	SlopeParam      2.97183
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.510 0.352 0.291)

	Surface
	{
		SurfStyle       0.333155
		OceanStyle      0.840842
		Randomize      (0.897, 0.931, -0.583)
		colorDistMagn   0.509518
		colorDistFreq   0.436205
		detailScale     669.17
		colorConversion true
		snowLevel       2
		tropicLatitude  0.930884
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.697038
		terraceProb     0.276477
		erosion         0
		montesMagn      0.360762
		montesFreq      2.98826
		montesSpiky     0.882542
		montesFraction  0.538727
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.24191
		hillsFraction   0.753918
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258363
		craterFreq      0.184862
		craterDensity   0.745792
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.521276
		volcanoTemp     1196.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.204, 0.141, 0.116, 0.000)
		colorShelf     (0.217, 0.150, 0.124, 0.000)
		colorBeach     (0.229, 0.158, 0.131, 0.000)
		colorDesert    (0.242, 0.167, 0.138, 0.000)
		colorLowland   (0.255, 0.176, 0.145, 0.000)
		colorUpland    (0.268, 0.185, 0.153, 0.000)
		colorRock      (0.280, 0.194, 0.160, 0.000)
		colorSnow      (0.293, 0.202, 0.167, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.82586
		GasToDust   0.25
		Particles   2648
		GasBright   0.104847
		DustBright  0.206288
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   18.4999
		Period          95.2257
		Eccentricity    0.954473
		Inclination     143.475
		AscendingNode   -148.691
		ArgOfPericenter 18.0013
		MeanAnomaly     157.743
	}
}

Comet	"Dellalt System C111"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            1.20567e-016
	Radius          0.0687424
	InertiaMoment   0.3991

	Oblateness      0.202705

	RotationPeriod  11.2488
	Obliquity       213.472
	EqAscendNode    334.352

	AbsMagn         3.39572
	SlopeParam      3.57405
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.611 0.608 0.606)

	Surface
	{
		SurfStyle       0.779148
		OceanStyle      0.107316
		Randomize      (0.039, 0.413, -0.965)
		colorDistMagn   0.915192
		colorDistFreq   3.93881e-006
		detailScale     1.87713
		colorConversion true
		snowLevel       2
		tropicLatitude  0.207241
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.497477
		terraceProb     0.240006
		erosion         0
		montesMagn      0.570344
		montesFreq      3.01182
		montesSpiky     0.917439
		montesFraction  0.285237
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.26507e-005
		hillsFraction   0.85258
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.204416
		craterFreq      0.209297
		craterDensity   0.818767
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.504335
		volcanoTemp     1545.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.238, 0.207, 0.170, 0.000)
		colorShelf     (0.244, 0.213, 0.194, 0.000)
		colorBeach     (0.287, 0.249, 0.230, 0.000)
		colorDesert    (0.311, 0.268, 0.224, 0.000)
		colorLowland   (0.342, 0.286, 0.254, 0.000)
		colorUpland    (0.379, 0.347, 0.309, 0.000)
		colorRock      (0.409, 0.377, 0.333, 0.000)
		colorSnow      (0.446, 0.401, 0.351, 1.000)
		BumpHeight      0.0618682
		BumpOffset      0.0123736
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.315089
		DustBright  0.480533
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   17.9048
		Period          90.6681
		Eccentricity    0.976754
		Inclination     -152.952
		AscendingNode   -159.796
		ArgOfPericenter 80.1424
		MeanAnomaly     56.2167
	}
}

Comet	"Dellalt System C112"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            9.32496e-013
	Radius          1.5162
	InertiaMoment   0.39763

	Oblateness      0.249

	RotationPeriod  8.05852
	Obliquity       166.677
	EqAscendNode    318.93

	AbsMagn         11.0826
	SlopeParam      4.13923
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.647 0.646 0.644)

	Surface
	{
		SurfStyle       0.044873
		OceanStyle      0.409239
		Randomize      (-0.969, 0.266, -0.962)
		colorDistMagn   0.912006
		colorDistFreq   0.000414147
		detailScale     41.4022
		colorConversion true
		snowLevel       2
		tropicLatitude  0.787752
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.539031
		terraceProb     0.359822
		erosion         0
		montesMagn      0.534668
		montesFreq      3.52329
		montesSpiky     0.930527
		montesFraction  0.739941
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00288244
		hillsFraction   0.657766
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.209511
		craterFreq      0.213178
		craterDensity   0.822181
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.54033
		volcanoTemp     1385.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.259, 0.258, 0.257, 0.000)
		colorShelf     (0.275, 0.274, 0.274, 0.000)
		colorBeach     (0.291, 0.290, 0.290, 0.000)
		colorDesert    (0.307, 0.307, 0.306, 0.000)
		colorLowland   (0.324, 0.323, 0.322, 0.000)
		colorUpland    (0.340, 0.339, 0.338, 0.000)
		colorRock      (0.356, 0.355, 0.354, 0.000)
		colorSnow      (0.372, 0.371, 0.370, 1.000)
		BumpHeight      1.36458
		BumpOffset      0.272915
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.377494
		GasToDust   0.25
		Particles   1742
		GasBright   0.218485
		DustBright  0.261624
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   17.0002
		Period          83.8845
		Eccentricity    0.951538
		Inclination     59.3447
		AscendingNode   52.803
		ArgOfPericenter -161.837
		MeanAnomaly     -177.646
	}
}

Comet	"Dellalt System C113"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            7.21219e-009
	Radius          26.8666
	InertiaMoment   0.399544

	Oblateness      0.249

	RotationPeriod  4.51914
	Obliquity       119.883
	EqAscendNode    303.507

	AbsMagn         7.4143
	SlopeParam      4.71599
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.754 0.749 0.747)

	Surface
	{
		SurfStyle       0.0434767
		OceanStyle      0.250745
		Randomize      (0.594, -0.965, -0.267)
		colorDistMagn   0.279573
		colorDistFreq   0.23035
		detailScale     733.638
		colorConversion true
		snowLevel       2
		tropicLatitude  0.881324
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.695692
		terraceProb     0.132098
		erosion         0
		montesMagn      0.626249
		montesFreq      2.78273
		montesSpiky     0.877749
		montesFraction  0.356209
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.40085
		hillsFraction   0.893074
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246333
		craterFreq      0.279834
		craterDensity   0.975253
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.563548
		volcanoTemp     1809.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.302, 0.300, 0.299, 0.000)
		colorShelf     (0.320, 0.318, 0.317, 0.000)
		colorBeach     (0.339, 0.337, 0.336, 0.000)
		colorDesert    (0.358, 0.356, 0.355, 0.000)
		colorLowland   (0.377, 0.375, 0.373, 0.000)
		colorUpland    (0.396, 0.393, 0.392, 0.000)
		colorRock      (0.415, 0.412, 0.411, 0.000)
		colorSnow      (0.433, 0.431, 0.429, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.858686
		GasToDust   0.25
		Particles   2714
		GasBright   0.0136188
		DustBright  0.950976
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   16.4305
		Period          79.703
		Eccentricity    0.97041
		Inclination     -22.5896
		AscendingNode   92.152
		ArgOfPericenter -46.8608
		MeanAnomaly     -38.1272
	}
}

Comet	"Dellalt System C114"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            2.22069e-016
	Radius          0.0938136
	InertiaMoment   0.398328

	Oblateness      0.00199578

	RotationPeriod  132.98
	Obliquity       73.0887
	EqAscendNode    288.084

	AbsMagn         2.96462
	SlopeParam      5.36098
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.446 0.438 0.434)

	Surface
	{
		SurfStyle       0.740226
		OceanStyle      0.658304
		Randomize      (-0.968, 0.215, -0.039)
		colorDistMagn   0.0778648
		colorDistFreq   3.02497e-006
		detailScale     2.56174
		colorConversion true
		snowLevel       2
		tropicLatitude  0.976704
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.690256
		terraceProb     0.148628
		erosion         0
		montesMagn      0.566105
		montesFreq      2.58062
		montesSpiky     0.834476
		montesFraction  0.399382
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.12924e-005
		hillsFraction   0.93119
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.271299
		craterFreq      0.191843
		craterDensity   0.78461
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.479836
		volcanoTemp     1602.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.174, 0.149, 0.122, 0.000)
		colorShelf     (0.178, 0.153, 0.139, 0.000)
		colorBeach     (0.210, 0.180, 0.165, 0.000)
		colorDesert    (0.227, 0.193, 0.161, 0.000)
		colorLowland   (0.250, 0.206, 0.182, 0.000)
		colorUpland    (0.276, 0.250, 0.221, 0.000)
		colorRock      (0.299, 0.272, 0.239, 0.000)
		colorSnow      (0.325, 0.289, 0.252, 1.000)
		BumpHeight      0.0844323
		BumpOffset      0.0168865
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0474893
		DustBright  0.601592
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   15.206
		Period          70.9616
		Eccentricity    0.949575
		Inclination     50.5901
		AscendingNode   -92.3193
		ArgOfPericenter 53.4326
		MeanAnomaly     -168.928
	}
}

Comet	"Dellalt System C115"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            1.71754e-012
	Radius          1.66419
	InertiaMoment   0.399966

	Oblateness      0.00189972

	RotationPeriod  116.151
	Obliquity       26.2944
	EqAscendNode    272.662

	AbsMagn         10.8089
	SlopeParam      6.19675
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.734 0.674 0.587)

	Surface
	{
		SurfStyle       0.213451
		OceanStyle      0.0583196
		Randomize      (-0.925, 0.248, -0.869)
		colorDistMagn   0.541594
		colorDistFreq   0.00137305
		detailScale     45.4433
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998498
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.411139
		terraceProb     0.111469
		erosion         0
		montesMagn      0.32571
		montesFreq      2.38907
		montesSpiky     0.947989
		montesFraction  0.382865
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00636288
		hillsFraction   0.588254
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249917
		craterFreq      0.241151
		craterDensity   0.959113
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.528641
		volcanoTemp     1463.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.293, 0.270, 0.235, 0.000)
		colorShelf     (0.312, 0.286, 0.249, 0.000)
		colorBeach     (0.330, 0.303, 0.264, 0.000)
		colorDesert    (0.348, 0.320, 0.279, 0.000)
		colorLowland   (0.367, 0.337, 0.293, 0.000)
		colorUpland    (0.385, 0.354, 0.308, 0.000)
		colorRock      (0.404, 0.371, 0.323, 0.000)
		colorSnow      (0.422, 0.388, 0.337, 1.000)
		BumpHeight      1.49777
		BumpOffset      0.299553
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.41032
		GasToDust   0.25
		Particles   1808
		GasBright   0.0441008
		DustBright  0.289467
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   16.7336
		Period          81.9187
		Eccentricity    0.967595
		Inclination     -68.004
		AscendingNode   -161.973
		ArgOfPericenter 90.1632
		MeanAnomaly     81.7128
	}
}

Comet	"Dellalt System C116"
{
	ParentBody     "Dellalt System"
	Class	       "Asteroid"

	Mass            1.3284e-008
	Radius          36.6268
	InertiaMoment   0.398864

	Oblateness      0.00304504

	RotationPeriod  107.488
	Obliquity       339.5
	EqAscendNode    257.239

	AbsMagn         7.2025
	SlopeParam      7.95674
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.671 0.624 0.566)

	Surface
	{
		SurfStyle       0.0332725
		OceanStyle      0.178485
		Randomize      (-0.111, -0.011, -0.066)
		colorDistMagn   0.734208
		colorDistFreq   1.06617
		detailScale     1000.15
		colorConversion true
		snowLevel       2
		tropicLatitude  0.4879
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.53758
		terraceProb     0.58754
		erosion         0
		montesMagn      0.326264
		montesFreq      3.2034
		montesSpiky     0.988903
		montesFraction  0.557751
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.46877
		hillsFraction   0.419975
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245262
		craterFreq      0.227046
		craterDensity   0.871394
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.562881
		volcanoTemp     1307.95
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.268, 0.250, 0.226, 0.000)
		colorShelf     (0.285, 0.265, 0.240, 0.000)
		colorBeach     (0.302, 0.281, 0.255, 0.000)
		colorDesert    (0.319, 0.296, 0.269, 0.000)
		colorLowland   (0.335, 0.312, 0.283, 0.000)
		colorUpland    (0.352, 0.327, 0.297, 0.000)
		colorRock      (0.369, 0.343, 0.311, 0.000)
		colorSnow      (0.386, 0.359, 0.325, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.891512
		GasToDust   0.25
		Particles   2780
		GasBright   0.156457
		DustBright  0.661598
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   25.0843
		Period          150.35
		Eccentricity    0.970176
		Inclination     10.639
		AscendingNode   -137.504
		ArgOfPericenter -135.094
		MeanAnomaly     -115.165
	}
}