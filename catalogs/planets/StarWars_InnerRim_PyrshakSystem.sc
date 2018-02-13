// http://starwars.wikia.com/wiki/Manaan
// Region : Inner Rim
// Sector : 
// Grid location : O11
// X : 4769.58, Y : -2162.9, Z : 6.432961561325669

//http://starwars.wikia.com/wiki/Pyr
Planet	"Pyr/Pyrshak System 1"
{
	ParentBody     "Pyrshak System"
	Class	       "Selena"

	Mass            0.0580949
	Radius          2544.05
	InertiaMoment   0.337775

	Obliquity       0.121664
	EqAscendNode    -70.6124
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.741 0.613 0.560)

	Surface
	{
		SurfStyle       0.930752
		OceanStyle      0.406368
		Randomize      (0.372, -0.435, 0.622)
		colorDistMagn   0.0458643
		colorDistFreq   328.592
		detailScale     6543.45
		colorConversion true
		drivenDarkening 0
		seaLevel        0.176844
		snowLevel       2
		tropicLatitude  0.00346989
		icecapLatitude  10
		icecapHeight    0.0869699
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.8428
		venusFreq       1.61574
		venusMagn       0
		mareFreq        1.49608
		mareDensity     0.0206465
		terraceProb     0.377766
		erosion         0
		montesMagn      0.194878
		montesFreq      103.225
		montesSpiky     0.996552
		montesFraction  0.527657
		dunesMagn       0.0453309
		dunesFreq       3268.48
		dunesFraction   0.740319
		hillsMagn       0.128238
		hillsFreq       257.397
		hillsFraction   0.377486
		hills2Fraction  0
		riversMagn      60.1731
		riversFreq      2.9794
		riversSin       5.50881
		riversOctaves   0
		canyonsMagn     0.395064
		canyonsFreq     0.971242
		canyonFraction  0.658645
		cracksMagn      0.0639282
		cracksFreq      0.816372
		cracksOctaves   0
		craterMagn      0.574182
		craterFreq      8.86341
		craterDensity   0.811519
		craterOctaves   12
		craterRayedFactor 0.114049
		volcanoMagn     0.440956
		volcanoFreq     0.624085
		volcanoDensity  0.264744
		volcanoOctaves  3
		volcanoActivity 0.0805746
		volcanoFlows    0.188432
		volcanoRadius   0.363174
		volcanoTemp     1611.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.440, 0.450, 0.370, 0.000)
		colorShelf     (0.580, 0.550, 0.430, 0.000)
		colorBeach     (0.526, 0.405, 0.325, 0.000)
		colorDesert    (0.615, 0.472, 0.359, 0.000)
		colorLowland   (0.489, 0.356, 0.269, 0.000)
		colorUpland    (0.437, 0.319, 0.252, 0.000)
		colorRock      (0.330, 0.250, 0.230, 0.000)
		colorSnow      (0.940, 0.910, 0.870, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.999993
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
		Height          127.203
		Density         7.27482e-007
		Pressure        4.93288e-007
		Greenhouse      0.00639805
		Bright          0.938349
		Opacity         0
		SkyLight        0.312783
		Hue             0.0347791
		Saturation      1

		Composition
		{
			SO2   	89.4419
			Cl2   	9.80539
			Kr    	0.724997
			Xe    	0.0277263
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.26402
		Period          0.12896
		Eccentricity    0.0488874
		Inclination     0.121664
		AscendingNode   -70.6124
		ArgOfPericenter 83.5058
		MeanAnomaly     333.906
	}
}

//http://starwars.wikia.com/wiki/Manaan/Legends
Planet	"Manaan/Pyrshak System 2"
{
	ParentBody     "Pyrshak System"
	Class	       "Terra"

	Mass            1.6134
	Radius          7105.5 // wookieepedia
	InertiaMoment   0.329883

	Oblateness      0.00723052

	RotationPeriod  26 // wookieepedia
	Obliquity       51.7958
	EqAscendNode    90.9592

	AlbedoBond      0.271201
	AlbedoGeom      0.325441
	Brightness      2
	Color          (0.771 0.768 0.766)
	
	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine/Terrestrial"
		Panspermia "false"		   
	}

	Surface
	{
		SurfStyle       0.790476
		OceanStyle      0.52381
		Randomize      (-0.969, 0.220, -0.540)
		colorDistMagn   0.0600675
		colorDistFreq   733.762
		detailScale     16535.7
		colorConversion true
		drivenDarkening -1
		seaLevel        1
		snowLevel       0.00793651
		tropicLatitude  0.78378
		icecapLatitude  1
		icecapHeight    0.888603
		climatePole     0.9375
		climateTropic   0.4125
		climateEquator  0.6875
		heightTempGrad  0
		tropicWidth     0.5
		mainFreq        5
		venusFreq       1.14286
		venusMagn       0.238095
		mareFreq        6.05376
		mareDensity     0.0599755
		terraceProb     0.0396825
		erosion         0.72403
		montesMagn      0.094921
		montesFreq      69.3651
		montesSpiky     0.452381
		montesFraction  0.861905
		dunesMagn       0.0593283
		dunesFreq       54.5411
		dunesFraction   0.390908
		hillsMagn       2.4127
		hillsFreq       102.381
		hillsFraction   0.31568
		hills2Fraction  0.708748
		riversMagn      5.1893
		riversFreq      1.78733
		riversSin       4.50243
		riversOctaves   2
		canyonsMagn     0.0323704
		canyonsFreq     70
		canyonFraction  0.282268
		cracksMagn      0.12433
		cracksFreq      0.484546
		cracksOctaves   0
		craterMagn      0.642368
		craterFreq      17.7416
		craterDensity   0
		craterOctaves   0
		craterRayedFactor 0
		volcanoMagn     0.893651
		volcanoFreq     1.25397
		volcanoDensity  0.054286
		volcanoOctaves  5
		volcanoActivity 0.396825
		volcanoFlows    0.667558
		volcanoRadius   0.888889
		volcanoTemp     1698.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.626
		stripeFluct     0
		stripeTwist     0
		cycloneMagn     1.94412
		cycloneFreq     0.861255
		cycloneDensity  0.310285
		cycloneOctaves  4
		colorSea       (0.040, 0.100, 0.200, 1.000)
		colorShelf     (0.150, 0.480, 0.460, 1.000)
		colorBeach     (0.780, 0.750, 0.740, 0.000)
		colorDesert    (0.470, 0.420, 0.390, 0.000)
		colorLowland   (0.270, 0.250, 0.230, 0.000)
		colorUpland    (0.490, 0.480, 0.460, 0.000)
		colorRock      (0.260, 0.240, 0.230, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.308)
		colorLowPlants (0.230, 0.200, 0.020, 0.000)
		colorUpPlants  (0.500, 0.470, 0.050, 0.000)
		BumpHeight      8.93651
		BumpOffset      1.5873
		DiffMapAlpha   "Water"
		SpecBrightWater 0.65
		SpecBrightIce   0.85
		SpecularPower   26.0314
		Hapke           0
		SpotBright      1.26984
		SpotWidth       0.103175
		DayAmbient      0.07
	}

	Clouds
	{
		Height          100
		Velocity        30
		BumpHeight      4.05015
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.59524
		mainOctaves     18
		Coverage        0.142402
		stripeZones     4.04762
		stripeFluct     2
		stripeTwist     1.26984
	}

	Ocean
	{
		Height          8.93642
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
	}

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          350
		Density         100
		Pressure        0.946
		Greenhouse      0
		Bright          5.87302
		Opacity         1
		SkyLight        8.88889
		Hue             0.015873
		Saturation      1.39683

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
		Height      219.303
		NorthLat    68.99
		NorthLon    -85.3579
		NorthRadius 3139.98
		NorthWidth  692.596
		NorthRings  3
		NorthBright 0.3
		NorthParticles 0
		SouthLat    -72.4796
		SouthLon    77.6318
		SouthRadius 2933
		SouthWidth  885.739
		SouthRings  2
		SouthBright 0.3
		SouthParticles 0
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.91136
		Period          1.15539773806884 // 222j cf. wookiepedia	
		Eccentricity    0.0849009
		Inclination     1.55874
		AscendingNode   97.5318
		ArgOfPericenter 35.4171
		MeanAnomaly     114.698
	}
}

Planet	"Navlaas/Pyrshak System 3"
{
	ParentBody     "Pyrshak System"
	Class	       "GasGiant"

	Mass            71.1988
	Radius          54775.9
	InertiaMoment   0.212334

	Oblateness      0.0722264

	RotationPeriod  12.5077
	Obliquity       420.998
	EqAscendNode    -113.851

	AlbedoBond      0.455318
	AlbedoGeom      0.546382
	Brightness      2

	Surface
	{
		SurfStyle       0.757708
		Randomize      (0.123, -0.256, 0.316)
		detailScale     140887
		colorConversion true
		tropicLatitude  0.869816
		icecapLatitude  1
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     7.11655
		stripeFluct     0.405561
		stripeTwist     8.71813
		cycloneMagn     9.81997
		cycloneFreq     1.12009
		cycloneDensity  0.57326
		cycloneOctaves  5
		colorLayer0    (0.120, 0.200, 0.480, 1.100)
		colorLayer1    (0.330, 0.400, 0.720, 0.700)
		colorLayer2    (0.330, 0.400, 0.720, 0.200)
		colorLayer3    (0.600, 0.600, 0.600, 0.050)
		colorLayer4    (0.350, 0.430, 0.770, 0.000)
		colorLayer5    (0.470, 0.540, 0.850, 0.000)
		colorLayer6    (0.600, 0.650, 0.910, 0.000)
		colorLayer7    (0.990, 0.990, 1.000, 1.000)
		colorLowPlants (0.350, 0.430, 0.770, 0.000)
		colorUpPlants  (0.470, 0.540, 0.850, 0.000)
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
		Height          72.7773
		Velocity        -439.07
		BumpHeight      52.7759
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.895967
		mainOctaves     12
		Coverage        0.0531812
		stripeZones     7.11655
		stripeFluct     0.405561
		stripeTwist     8.71813
	}

	Clouds
	{
		Height          125.551
		Velocity        631.304
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		ModulateColor  (1.000 1.000 1.000 0.747)
		mainFreq        0.895967
		mainOctaves     12
		Coverage        0.0531812
		stripeZones     7.11655
		stripeFluct     0.405561
		stripeTwist     8.71813
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          547.759
		Density         6160.92
		Pressure        730448
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0391707
		Saturation      0.774956

		Composition
		{
			H2    	92.247
			He    	7.69183
			N2    	0.0462139
			O2    	0.00956432
			CH4   	0.00330247
			Ne    	0.00125471
			Ar    	0.000842191
		}
	}

	Aurora
	{
		Height      2087.92
		NorthLat    82.0768
		NorthLon    -82.2082
		NorthRadius 14529.8
		NorthWidth  8154.88
		NorthRings  5
		NorthBright 1
		NorthParticles 10000
		SouthLat    -81.3859
		SouthLon    96.1833
		SouthRadius 9322.84
		SouthWidth  4724.81
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
		SemiMajorAxis   14.5169
		Period          52.5738
		Eccentricity    0.0262148
		Inclination     1.61054
		AscendingNode   -110.801
		ArgOfPericenter 20.1443
		MeanAnomaly     286.977
	}
}

DwarfMoon	"Navlaas DwarfMoon 1/Pyrshak System 3.D1"
{
	ParentBody     "Pyrshak System 3"
	Class	       "Asteroid"

	Mass            2.53872e-006
	Radius          196.639
	InertiaMoment   0.395756

	Oblateness      0.207322

	Obliquity       0.00991999
	EqAscendNode    57.8472
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.575 0.571 0.567)

	Surface
	{
		SurfStyle       0.667244
		OceanStyle      0.0363328
		Randomize      (0.121, -0.202, -0.967)
		colorDistMagn   0.844474
		colorDistFreq   18.3098
		detailScale     5369.55
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.664474
		terraceProb     0.703301
		erosion         0
		montesMagn      0.61495
		montesFreq      2.91102
		montesSpiky     0.780933
		montesFraction  0.174662
		dunesFraction   0
		hillsMagn       0
		hillsFreq       65.1619
		hillsFraction   0.490522
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228643
		craterFreq      1.33453
		craterDensity   0.735563
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.524179
		volcanoTemp     1414.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.224, 0.194, 0.159, 0.000)
		colorShelf     (0.230, 0.200, 0.182, 0.000)
		colorBeach     (0.270, 0.234, 0.216, 0.000)
		colorDesert    (0.293, 0.251, 0.210, 0.000)
		colorLowland   (0.322, 0.268, 0.238, 0.000)
		colorUpland    (0.356, 0.325, 0.289, 0.000)
		colorRock      (0.385, 0.354, 0.312, 0.000)
		colorSnow      (0.420, 0.377, 0.329, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000721916
		Period          0.00132945
		Eccentricity    9.93041e-005
		Inclination     0.00991999
		AscendingNode   57.8472
		ArgOfPericenter -176.14
		MeanAnomaly     66.1837
	}
}

Moon	"Navlaas Moon 1/Pyrshak System 3.1"
{
	ParentBody     "Pyrshak System 3"
	Class	       "Desert"

	Mass            0.0522963
	Radius          3029.28
	InertiaMoment   0.344745

	Oblateness      0.00402918

	Obliquity       -0.0888757
	EqAscendNode    -58.8346
	TidalLocked     true

	AlbedoBond      0.32486
	AlbedoGeom      0.389832
	Brightness      2
	Color          (0.711 0.706 0.703)

	Surface
	{
		SurfStyle       0.615005
		OceanStyle      0.787691
		Randomize      (0.831, 0.131, 0.522)
		colorDistMagn   0.0429274
		colorDistFreq   360.604
		detailScale     7791.49
		colorConversion true
		seaLevel        0.110744
		snowLevel       0.85
		tropicLatitude  0.00269662
		icecapLatitude  0.934632
		icecapHeight    0.115639
		climatePole     0.9375
		climateTropic   0.562126
		climateEquator  0.6875
		heightTempGrad  0.375374
		tropicWidth     0.498713
		mainFreq        0.576232
		venusFreq       1.01157
		venusMagn       0
		mareFreq        0.982268
		mareDensity     0.0116985
		terraceProb     0.216343
		erosion         0
		montesMagn      0.175483
		montesFreq      145.993
		montesSpiky     0.878029
		montesFraction  0.0360526
		dunesMagn       0.0649295
		dunesFreq       29.4781
		dunesFraction   0.663754
		hillsMagn       0.141199
		hillsFreq       286.533
		hillsFraction   0
		hills2Fraction  0
		riversMagn      55.9726
		riversFreq      3.10723
		riversSin       5.51882
		riversOctaves   0
		canyonsMagn     0.0398637
		canyonsFreq     75.4785
		canyonFraction  0
		cracksMagn      0.107814
		cracksFreq      0.269759
		cracksOctaves   0
		craterMagn      0.568124
		craterFreq      6.59001
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.664249
		volcanoFreq     0.737944
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.844413
		volcanoRadius   0.420136
		volcanoTemp     1917.86
		lavaCoverTidal  0.433442
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.40705
		stripeTwist     0.0811406
		cycloneMagn     2.46773
		cycloneFreq     0.600693
		cycloneDensity  0.393549
		cycloneOctaves  4
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
		Height          14.0037
		Velocity        64.2035
		BumpHeight      4.00363
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.989326
		mainOctaves     10
		Coverage        0.249721
		stripeZones     2.40705
		stripeTwist     0.0811406
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Venus"
		Height          151.464
		Density         6.9434
		Pressure        3.15683
		Greenhouse      1.63925
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.463789
		Saturation      0.99315

		Composition
		{
			CO2   	83.6891
			SO2   	16.3108
			Ar    	9.21434e-005
			Kr    	1.77885e-005
		}
	}

	Aurora
	{
		Height      72.0819
		NorthLat    89.9939
		NorthLon    100.316
		NorthRadius 648.964
		NorthWidth  199.23
		NorthRings  2
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -90
		SouthLon    256.798
		SouthRadius 757.707
		SouthWidth  163.545
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
		SemiMajorAxis   0.00141671
		Period          0.00365346
		Eccentricity    0.0293136
		Inclination     -0.0888757
		AscendingNode   -58.8346
		ArgOfPericenter 108.774
		MeanAnomaly     -133.745
	}
}

Moon	"Navlaas Moon 2/Pyrshak System 3.2"
{
	ParentBody     "Pyrshak System 3"
	Class	       "Desert"

	Mass            0.688857
	Radius          7267.12
	InertiaMoment   0.330541

	Obliquity       1.28103
	EqAscendNode    -50.6816
	TidalLocked     true

	AlbedoBond      0.270137
	AlbedoGeom      0.324164
	Brightness      2
	Color          (0.556 0.428 0.351)

	Surface
	{
		SurfStyle       0.607483
		OceanStyle      0.085309
		Randomize      (-0.271, 0.354, -0.069)
		colorDistMagn   0.0627458
		colorDistFreq   1090.66
		detailScale     18691.5
		colorConversion true
		seaLevel        0.0580668
		snowLevel       2
		tropicLatitude  0.0404013
		icecapLatitude  0.896688
		icecapHeight    0.065149
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.711723
		venusFreq       0.27038
		venusMagn       0.409529
		mareFreq        2.26018
		mareDensity     0.0565952
		terraceProb     0.342529
		erosion         0
		montesMagn      0.252865
		montesFreq      342.921
		montesSpiky     0.832534
		montesFraction  0.336865
		dunesMagn       0.0442444
		dunesFreq       66.445
		dunesFraction   0.7032
		hillsMagn       0.155249
		hillsFreq       734.49
		hillsFraction   0
		hills2Fraction  0
		riversMagn      62.9828
		riversFreq      2.81019
		riversSin       7.27607
		riversOctaves   0
		canyonsMagn     0.00848054
		canyonsFreq     179.456
		canyonFraction  0
		cracksMagn      0.0636818
		cracksFreq      0.688632
		cracksOctaves   0
		craterMagn      0.556496
		craterFreq      22.7098
		craterDensity   0.166461
		craterOctaves   3.04546
		volcanoMagn     0.679781
		volcanoFreq     0.94785
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.837496
		volcanoRadius   0.486036
		volcanoTemp     1419.88
		lavaCoverTidal  0.347242
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.84739
		stripeTwist     0.178132
		cycloneMagn     2.91804
		cycloneFreq     0.934424
		cycloneDensity  0.464089
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
		Height          14.3296
		Velocity        84.7985
		BumpHeight      4.3297
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.964466
		mainOctaves     10
		Coverage        0.140274
		stripeZones     2.84739
		stripeTwist     0.178132
	}

	Clouds
	{
		Height          18.6592
		Velocity        58.2943
		BumpHeight      4.3297
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.964466
		mainOctaves     10
		Coverage        0.140274
		stripeZones     2.84739
		stripeTwist     0.178132
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Mars"
		Height          42.2253
		Density         0.269941
		Pressure        0.0949993
		Greenhouse      2.95196
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.00374747
		Saturation      1

		Composition
		{
			N2    	99.788
			CO    	0.173343
			Ar    	0.0325153
			CO2   	0.00354756
			Kr    	0.00178758
			Ne    	0.000820029
		}
	}

	Aurora
	{
		Height      89.8004
		NorthLat    81.0886
		NorthLon    8.13652
		NorthRadius 2140.25
		NorthWidth  512.28
		NorthRings  3
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -52.1108
		SouthLon    195.626
		SouthRadius 1863.46
		SouthWidth  639.471
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
		SemiMajorAxis   0.00238324
		Period          0.00793605
		Eccentricity    0.0112654
		Inclination     1.28103
		AscendingNode   -50.6816
		ArgOfPericenter -34.3266
		MeanAnomaly     -53.8704
	}
}

Moon	"Navlaas Moon 3/Pyrshak System 3.3"
{
	ParentBody     "Pyrshak System 3"
	Class	       "IceWorld"

	Mass            4.54166e-005
	Radius          296.447
	InertiaMoment   0.398402

	Obliquity       0.239864
	EqAscendNode    -10.2008
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.777 0.724 0.676)

	Surface
	{
		SurfStyle       0.403933
		OceanStyle      0.209949
		Randomize      (-0.793, -0.157, -0.471)
		colorDistMagn   0.0633516
		colorDistFreq   27.5543
		detailScale     762.479
		colorConversion true
		drivenDarkening 0.7
		seaLevel        0.186954
		snowLevel       2
		tropicLatitude  0.00833653
		icecapLatitude  0.527379
		icecapHeight    0.22593
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.51618
		venusFreq       0.947538
		venusMagn       0
		mareFreq        0
		mareDensity     7.45943e-005
		terraceProb     0.456127
		erosion         0
		montesMagn      0.0488916
		montesFreq      10.6523
		montesSpiky     0.907248
		montesFraction  0.339727
		dunesMagn       0.0466008
		dunesFreq       389.03
		dunesFraction   0.869297
		hillsMagn       0.127898
		hillsFreq       32.3415
		hillsFraction   0.834096
		hills2Fraction  0.0769502
		riversMagn      59.0167
		riversFreq      2.08751
		riversSin       6.59536
		riversOctaves   0
		canyonsMagn     0.541919
		canyonsFreq     0.0858897
		canyonFraction  0
		cracksMagn      0.0555542
		cracksFreq      0.09613
		cracksOctaves   0
		craterMagn      0.828486
		craterFreq      0.788694
		craterDensity   0.945002
		craterOctaves   8
		craterRayedFactor 0
		volcanoMagn     0.179436
		volcanoFreq     0.512127
		volcanoDensity  0.213953
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.289334
		volcanoRadius   0.166034
		volcanoTemp     1308.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.777, 0.724, 0.676, 0.500)
		colorShelf     (0.738, 0.687, 0.643, 0.500)
		colorBeach     (0.544, 0.507, 0.474, 0.750)
		colorDesert    (0.660, 0.615, 0.575, 1.000)
		colorLowland   (0.684, 0.637, 0.595, 1.000)
		colorUpland    (0.723, 0.673, 0.629, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.684, 0.637, 0.595, 1.000)
		colorUpPlants  (0.723, 0.673, 0.629, 1.000)
		BumpHeight      14.8224
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
		SemiMajorAxis   0.00400919
		Period          0.0173991
		Eccentricity    0.00164147
		Inclination     0.239864
		AscendingNode   -10.2008
		ArgOfPericenter 133.55
		MeanAnomaly     10.841
	}
}

Moon	"Navlaas Moon 4/Pyrshak System 3.4"
{
	ParentBody     "Pyrshak System 3"
	Class	       "IceWorld"

	Mass            9.76531e-005
	Radius          406.229
	InertiaMoment   0.397659

	Obliquity       -0.844696
	EqAscendNode    166.767
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.634 0.489 0.341)

	Surface
	{
		SurfStyle       0.48446
		OceanStyle      0.879902
		Randomize      (-0.241, -0.995, 0.478)
		colorDistMagn   0.0613248
		colorDistFreq   39.8314
		detailScale     1044.84
		colorConversion true
		drivenDarkening 0.7
		seaLevel        0.259618
		snowLevel       2
		tropicLatitude  0.00340048
		icecapLatitude  0.513905
		icecapHeight    0.272401
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.77598
		venusFreq       1.33037
		venusMagn       0
		mareFreq        0
		mareDensity     8.04801e-005
		terraceProb     0.220561
		erosion         0
		montesMagn      0.0604469
		montesFreq      20.9241
		montesSpiky     0.989499
		montesFraction  0.738372
		dunesMagn       0.0549563
		dunesFreq       529.426
		dunesFraction   0.400167
		hillsMagn       0.140037
		hillsFreq       45.5669
		hillsFraction   0.00508665
		hills2Fraction  0.0286481
		riversMagn      56.5641
		riversFreq      2.98713
		riversSin       5.3385
		riversOctaves   0
		canyonsMagn     0.459906
		canyonsFreq     0.155955
		canyonFraction  0
		cracksMagn      0.0520331
		cracksFreq      0.208497
		cracksOctaves   0
		craterMagn      0.675601
		craterFreq      1.19809
		craterDensity   0.798706
		craterOctaves   9
		craterRayedFactor 0.123595
		volcanoMagn     0.185152
		volcanoFreq     0.625553
		volcanoDensity  0.237895
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.37624
		volcanoRadius   0.140932
		volcanoTemp     1295.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.190, 0.122, 0.075, 0.000)
		colorShelf     (0.235, 0.152, 0.095, 0.000)
		colorBeach     (0.355, 0.230, 0.143, 0.200)
		colorDesert    (0.323, 0.215, 0.126, 0.500)
		colorLowland   (0.247, 0.166, 0.095, 0.800)
		colorUpland    (0.418, 0.293, 0.177, 1.000)
		colorRock      (0.670, 0.620, 0.550, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.247, 0.166, 0.095, 0.800)
		colorUpPlants  (0.418, 0.293, 0.177, 1.000)
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
		SemiMajorAxis   0.00674442
		Period          0.0379629
		Eccentricity    0.0396885
		Inclination     -0.844696
		AscendingNode   166.767
		ArgOfPericenter -154.204
		MeanAnomaly     -165.248
	}
}

Moon	"Navlaas Moon 5/Pyrshak System 3.5"
{
	ParentBody     "Pyrshak System 3"
	Class	       "IceWorld"

	Mass            0.000158955
	Radius          449.608
	InertiaMoment   0.396227

	Obliquity       -0.250243
	EqAscendNode    -142.107
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.820 0.759 0.721)

	Surface
	{
		SurfStyle       0.851031
		OceanStyle      0.949449
		Randomize      (-0.878, -0.875, -0.900)
		colorDistMagn   0.0463617
		colorDistFreq   61.754
		detailScale     1156.42
		colorConversion true
		drivenDarkening 0.451814
		seaLevel        0.182235
		snowLevel       2
		tropicLatitude  0.00282613
		icecapLatitude  0.927827
		icecapHeight    0.188231
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.52916
		venusFreq       1.45453
		venusMagn       0
		mareFreq        0
		mareDensity     0.000157117
		terraceProb     0.276264
		erosion         0
		montesMagn      0.0462719
		montesFreq      16.5405
		montesSpiky     0.983673
		montesFraction  0.294227
		dunesMagn       0.0488768
		dunesFreq       576.267
		dunesFraction   0.885786
		hillsMagn       0.134084
		hillsFreq       45.3864
		hillsFraction   0.743446
		hills2Fraction  0.118829
		riversMagn      57.2904
		riversFreq      3.03987
		riversSin       5.99069
		riversOctaves   0
		canyonsMagn     0.577219
		canyonsFreq     0.147648
		canyonFraction  0
		cracksMagn      0.0369919
		cracksFreq      0.180618
		cracksOctaves   0
		craterMagn      0.600401
		craterFreq      1.06234
		craterDensity   0.875136
		craterOctaves   9
		craterRayedFactor 0.0975625
		volcanoMagn     0.185198
		volcanoFreq     0.583066
		volcanoDensity  0.231358
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.156728
		volcanoRadius   0.162413
		volcanoTemp     1670.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.820, 0.569, 0.414, 0.000)
		colorShelf     (0.779, 0.540, 0.393, 0.000)
		colorBeach     (0.410, 0.284, 0.207, 0.000)
		colorDesert    (0.697, 0.484, 0.352, 0.000)
		colorLowland   (0.664, 0.501, 0.393, 0.000)
		colorUpland    (0.762, 0.529, 0.385, 0.000)
		colorRock      (1.000, 1.000, 1.000, 0.500)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.664, 0.501, 0.393, 0.000)
		colorUpPlants  (0.762, 0.529, 0.385, 0.000)
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
		SemiMajorAxis   0.0113457
		Period          0.0828307
		Eccentricity    0.0493963
		Inclination     -0.250243
		AscendingNode   -142.107
		ArgOfPericenter -59.665
		MeanAnomaly     -145.738
	}
}

Moon	"Navlaas Moon 6/Pyrshak System 3.6"
{
	ParentBody     "Pyrshak System 3"
	Class	       "IceWorld"

	Mass            0.000230492
	Radius          540.396
	InertiaMoment   0.39969

	Obliquity       1.29562
	EqAscendNode    -89.0611
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.566 0.561 0.553)

	Surface
	{
		SurfStyle       0.25012
		OceanStyle      0.0837065
		Randomize      (-0.664, -0.008, 0.694)
		colorDistMagn   0.0657012
		colorDistFreq   65.7917
		detailScale     1389.93
		colorConversion true
		drivenDarkening 0.268579
		seaLevel        0.257789
		snowLevel       2
		tropicLatitude  0.0322335
		icecapLatitude  0.974974
		icecapHeight    0.258219
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.96603
		venusFreq       1.06948
		venusMagn       0
		mareFreq        0
		mareDensity     0.000180307
		terraceProb     0.305227
		erosion         0
		montesMagn      0.0563202
		montesFreq      29.1672
		montesSpiky     0.963289
		montesFraction  0.208662
		dunesMagn       0.0458298
		dunesFreq       714.989
		dunesFraction   0.123654
		hillsMagn       0.146659
		hillsFreq       59.6906
		hillsFraction   0.752619
		hills2Fraction  0.201086
		riversMagn      66.2994
		riversFreq      2.88976
		riversSin       5.50919
		riversOctaves   0
		canyonsMagn     0.590499
		canyonsFreq     0.198383
		canyonFraction  0
		cracksMagn      0.0634445
		cracksFreq      0.190275
		cracksOctaves   0
		craterMagn      0.546213
		craterFreq      1.88319
		craterDensity   0.983079
		craterOctaves   9
		craterRayedFactor 0.211604
		volcanoMagn     0.180102
		volcanoFreq     0.67264
		volcanoDensity  0.162685
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.34492
		volcanoRadius   0.148008
		volcanoTemp     1155
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.566, 0.561, 0.553, 0.500)
		colorShelf     (0.538, 0.533, 0.526, 0.500)
		colorBeach     (0.396, 0.392, 0.387, 0.750)
		colorDesert    (0.481, 0.477, 0.470, 1.000)
		colorLowland   (0.498, 0.493, 0.487, 1.000)
		colorUpland    (0.526, 0.521, 0.515, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.498, 0.493, 0.487, 1.000)
		colorUpPlants  (0.526, 0.521, 0.515, 1.000)
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
		SemiMajorAxis   0.0190863
		Period          0.180727
		Eccentricity    0.0319262
		Inclination     1.29562
		AscendingNode   -89.0611
		ArgOfPericenter 30.3438
		MeanAnomaly     109.224
	}
}

DwarfMoon	"Navlaas DwarfMoon 2/Pyrshak System 3.D2"
{
	ParentBody     "Pyrshak System 3"
	Class	       "Asteroid"

	Mass            1.79607e-010
	Radius          8.84814
	InertiaMoment   0.398598

	RotationPeriod  1567.79
	Obliquity       12.5442
	EqAscendNode    -147.147

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.516 0.514 0.511)

	Surface
	{
		SurfStyle       0.593242
		OceanStyle      0.593297
		Randomize      (0.831, -0.602, -0.417)
		colorDistMagn   0.695315
		colorDistFreq   0.0165454
		detailScale     241.613
		colorConversion true
		snowLevel       2
		tropicLatitude  0.325324
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.409391
		terraceProb     0.252121
		erosion         0
		montesMagn      0.354392
		montesFreq      2.34448
		montesSpiky     0.995955
		montesFraction  0.583828
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.2031
		hillsFraction   0.675247
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227716
		craterFreq      0.254557
		craterDensity   0.905473
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.568223
		volcanoTemp     1591.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.201, 0.175, 0.143, 0.000)
		colorShelf     (0.206, 0.180, 0.164, 0.000)
		colorBeach     (0.243, 0.211, 0.194, 0.000)
		colorDesert    (0.263, 0.226, 0.189, 0.000)
		colorLowland   (0.289, 0.241, 0.215, 0.000)
		colorUpland    (0.320, 0.293, 0.261, 0.000)
		colorRock      (0.346, 0.319, 0.281, 0.000)
		colorSnow      (0.377, 0.339, 0.296, 1.000)
		BumpHeight      7.96333
		BumpOffset      1.59267
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.113161
		Period          2.6091
		Eccentricity    0.135225
		Inclination     28.169
		AscendingNode   -146.085
		ArgOfPericenter -110.695
		MeanAnomaly     61.6836
	}
}
