// http://starwars.wikia.com/wiki/Dellalt
// Region : Outer Rim
// Sector : Tion Hegemony Sector
// Grid location : T6
// X : 12414.46, Y : 4803.3, Z : 299.5206462553954
Planet	"Dellalt/Dellalt Planet"
{
	ParentBody     "Dellalt System"
	Class	       "Desert"

	Mass            0.0526699
	Radius          2804.97
	InertiaMoment   0.34607

	Obliquity       -0.752327
	EqAscendNode    -74.8173
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.779 0.477 0.310)

	Surface
	{
		SurfStyle       0.939784
		OceanStyle      0.837351
		Randomize      (0.397, -0.202, 0.550)
		colorDistMagn   0.0560643
		colorDistFreq   281.389
		detailScale     7214.54
		colorConversion true
		seaLevel        0.0424169
		snowLevel       2
		tropicLatitude  0.0208583
		icecapLatitude  0.922874
		icecapHeight    0.0443196
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.167
		venusFreq       0.892454
		venusMagn       0.255986
		mareFreq        1.38156
		mareDensity     0.0151092
		terraceProb     0.155762
		erosion         0
		montesMagn      0.191417
		montesFreq      129.497
		montesSpiky     0.934543
		montesFraction  0.521637
		dunesMagn       0.0450602
		dunesFreq       19.2357
		dunesFraction   0.735863
		hillsMagn       0.111698
		hillsFreq       348.537
		hillsFraction   0
		hills2Fraction  0
		riversMagn      59.8483
		riversFreq      2.32057
		riversSin       5.17932
		riversOctaves   0
		canyonsMagn     0.0270712
		canyonsFreq     71.6673
		canyonFraction  0
		cracksMagn      0.121832
		cracksFreq      0.242978
		cracksOctaves   0
		craterMagn      0.593085
		craterFreq      10.3002
		craterDensity   0.590937
		craterOctaves   8.46288
		volcanoMagn     0.61761
		volcanoFreq     0.781564
		volcanoDensity  0.306984
		volcanoOctaves  3
		volcanoActivity 0.183449
		volcanoFlows    0.7627
		volcanoRadius   0.541351
		volcanoTemp     1729.42
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
		Hapke           0.819933
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
		Height          77.3252
		Density         0.0180067
		Pressure        0.00766089
		Greenhouse      0.294334
		Bright          7.0972
		Opacity         1
		SkyLight        2.36573
		Hue             0
		Saturation      1

		Composition
		{
			CO2   	61.8369
			CH4   	27.6456
			C2H2  	7.21269
			NH3   	1.41503
			H2S   	1.04299
			C2H4  	0.74776
			N2    	0.0617094
			C2H6  	0.0252816
			SO2   	0.00784371
			C3H8  	0.00392124
			CO    	0.000211659
			H2O   	5.00972e-005
			Ar    	4.21828e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.106049
		Period          0.0887567
		Eccentricity    0.0384865
		Inclination     -0.752327
		AscendingNode   -74.8172
		ArgOfPericenter 332.566
		MeanAnomaly     71.1573
	}
}

DwarfMoon	"4.D1"
{
	ParentBody     "4"
	Class	       "Asteroid"

	Mass            1.26032e-007
	Radius          84.0991
	InertiaMoment   0.398241

	Oblateness      0.249

	Obliquity       -0.00898322
	EqAscendNode    156.401
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.557 0.412 0.216)

	Surface
	{
		SurfStyle       0.44774
		OceanStyle      0.0933108
		Randomize      (-0.565, -0.408, 0.848)
		colorDistMagn   0.567808
		colorDistFreq   5.37782
		detailScale     2296.47
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.450621
		terraceProb     0.249526
		erosion         0
		montesMagn      0.622761
		montesFreq      2.98696
		montesSpiky     0.915848
		montesFraction  0.631126
		dunesFraction   0
		hillsMagn       0
		hillsFreq       17.6064
		hillsFraction   0.76732
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239762
		craterFreq      0.215368
		craterDensity   0.861834
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.515085
		volcanoTemp     1259.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.322, 0.306, 0.290, 0.000)
		colorShelf     (0.342, 0.325, 0.309, 0.000)
		colorBeach     (0.362, 0.344, 0.327, 0.000)
		colorDesert    (0.382, 0.363, 0.345, 0.000)
		colorLowland   (0.402, 0.382, 0.363, 0.000)
		colorUpland    (0.422, 0.402, 0.381, 0.000)
		colorRock      (0.442, 0.421, 0.399, 0.000)
		colorSnow      (0.463, 0.440, 0.418, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   6.05906e-005
		Period          0.00118852
		Eccentricity    2.21019e-005
		Inclination     -0.00898322
		AscendingNode   156.401
		ArgOfPericenter -170.957
		MeanAnomaly     -106.585
	}
}

DwarfMoon	"4.D2"
{
	ParentBody     "4"
	Class	       "Asteroid"

	Mass            1.72931e-007
	Radius          82.6268
	InertiaMoment   0.399307

	Oblateness      0.00240655

	Obliquity       -19.442
	EqAscendNode    163.961
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.668 0.425 0.184)

	Surface
	{
		SurfStyle       0.0826205
		OceanStyle      0.0469094
		Randomize      (0.547, 0.796, 0.697)
		colorDistMagn   0.607992
		colorDistFreq   0.651412
		detailScale     2256.26
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0927709
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.619368
		terraceProb     0.329011
		erosion         0
		montesMagn      0.415068
		montesFreq      2.94393
		montesSpiky     0.931105
		montesFraction  0.546868
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.94573
		hillsFraction   0.566005
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238227
		craterFreq      0.216847
		craterDensity   0.798857
		craterOctaves   15
		volcanoActivity 0.0555025
		volcanoFlows    0
		volcanoRadius   0.535428
		volcanoTemp     1799.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.205, 0.157, 0.118, 0.000)
		colorShelf     (0.218, 0.167, 0.125, 0.000)
		colorBeach     (0.231, 0.176, 0.133, 0.000)
		colorDesert    (0.244, 0.186, 0.140, 0.000)
		colorLowland   (0.257, 0.196, 0.147, 0.000)
		colorUpland    (0.270, 0.206, 0.155, 0.000)
		colorRock      (0.282, 0.215, 0.162, 0.000)
		colorSnow      (0.295, 0.225, 0.169, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000143267
		Period          0.00432134
		Eccentricity    0.146429
		Inclination     -19.442
		AscendingNode   163.961
		ArgOfPericenter -105.435
		MeanAnomaly     -109.376
	}
}

//////////////
// GENERATED//
//////////////
/*Star	"Dellalt System"
{
	ParentBody     "Dellalt System"
	Class	       "M5 V"
	Luminosity      0.000855067
	MassSol         0.151397
	RadSol          0.178939
	Teff            3240

	Age             4.94428

	InertiaMoment   0.087652

	RotationPeriod  39.2781
	Obliquity       113.517
	EqAscendNode    102.023

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (1.000 0.501 0.198)

	Surface
	{
		Randomize      (0.656, 0.779, 0.038)
		colorDistMagn   0.682687
		colorDistFreq   11.7666
		detailScale     320328
		colorConversion true
		tropicLatitude  0.5912
		icecapLatitude  1.0608
		mareFreq        18.0838
		mareDensity     0.010128
		erosion         1
		montesFreq      537
		dunesMagn       0.599329
		hillsMagn       0.03
		hillsFreq       639.861
		craterOctaves   0
		BumpHeight      275.494
		BumpOffset      275.494
		SpecBrightWater 0
		SpecBrightIce   0
		SpecularPower   55
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Sun"
		Height          1245.42
		Density         0
		Pressure        1
		Bright          10
		Opacity         0
		SkyLight        0
		Hue             0
		Saturation      1
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	Corona
	{
		Radius      725805
		Period      0.0361104
		Brightness  0.5
		RayDensity  2.37329
		RayCurv     8.31817
	}

	NoCometTail     true

	Orbit
	{
		RefPlane        "Static"
		SemiMajorAxis   0
		Period          0
		Eccentricity    0
		Inclination     113.517
		AscendingNode   102.023
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}*/

Planet	"1"
{
	ParentBody     "Dellalt System"
	Class	       "GasGiant"

	Mass            1151.54
	Radius          78361.2
	InertiaMoment   0.21051

	Obliquity       0.921239
	EqAscendNode    47.9341
	TidalLocked     true

	AlbedoBond      0.497008
	AlbedoGeom      0.59641
	Brightness      2
	Color          (0.569 0.349 0.162)

	Surface
	{
		SurfStyle       0.14798
		Randomize      (-0.285, -0.374, 0.161)
		detailScale     201549
		colorConversion true
		tropicLatitude  0.0293811
		icecapLatitude  0.929381
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0.807261
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     8.49918
		stripeFluct     0.345618
		stripeTwist     12.0662
		cycloneMagn     9.63267
		cycloneFreq     1.07034
		cycloneDensity  0.345194
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
		BumpHeight      7.24097
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          32.8125
		Velocity        578.661
		BumpHeight      25.573
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.699033
		mainOctaves     12
		Coverage        0.470084
		stripeZones     8.49918
		stripeFluct     0.345618
		stripeTwist     12.0662
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Jupiter"
		Height          135.106
		Density         5403.47
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.00363318
		Saturation      0.692597

		Composition
		{
			H2    	92.1912
			He    	7.4775
			CH4   	0.261503
			N2    	0.0310861
			NH3   	0.0245185
			O2    	0.00707743
			C2H2  	0.0034017
			C2H4  	0.00112365
			Ne    	0.00105434
			Ar    	0.000695916
			C2H6  	0.000552679
			C3H8  	0.000347517
		}
	}

	Aurora
	{
		Height      2313.2
		NorthLat    84.7912
		NorthLon    96.0902
		NorthRadius 18163.5
		NorthWidth  11005.9
		NorthRings  3
		NorthBright 1
		NorthParticles 10000
		SouthLat    -83.2338
		SouthLon    281.212
		SouthRadius 24106.4
		SouthWidth  10643.3
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
		SemiMajorAxis   0.0196972
		Period          0.00702532
		Eccentricity    0.0386548
		Inclination     0.921238
		AscendingNode   47.9341
		ArgOfPericenter 305.663
		MeanAnomaly     78.3762
	}
}

DwarfMoon	"1.D1"
{
	ParentBody     "1"
	Class	       "Asteroid"

	Mass            1.40146e-007
	Radius          76.9113
	InertiaMoment   0.399788

	Oblateness      0.249

	Obliquity       -0.0104175
	EqAscendNode    -70.4776
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.483 0.478 0.474)

	Surface
	{
		SurfStyle       0.239998
		OceanStyle      0.581433
		Randomize      (0.306, 0.239, -0.563)
		colorDistMagn   0.543253
		colorDistFreq   5.06719
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
		mainFreq        0.556172
		terraceProb     0.252562
		erosion         0
		montesMagn      0.412819
		montesFreq      3.2307
		montesSpiky     0.819433
		montesFraction  0.723595
		dunesFraction   0
		hillsMagn       0
		hillsFreq       13.6946
		hillsFraction   0.750418
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230058
		craterFreq      0.205019
		craterDensity   0.921975
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.463818
		volcanoTemp     1309.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.193, 0.191, 0.189, 0.000)
		colorShelf     (0.205, 0.203, 0.201, 0.000)
		colorBeach     (0.218, 0.215, 0.213, 0.000)
		colorDesert    (0.230, 0.227, 0.225, 0.000)
		colorLowland   (0.242, 0.239, 0.237, 0.000)
		colorUpland    (0.254, 0.251, 0.249, 0.000)
		colorRock      (0.266, 0.263, 0.260, 0.000)
		colorSnow      (0.278, 0.275, 0.272, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00142169
		Period          0.000913584
		Eccentricity    9.19662e-005
		Inclination     -0.0104175
		AscendingNode   -70.4776
		ArgOfPericenter 150.586
		MeanAnomaly     127.293
	}
}

DwarfMoon	"1.D2"
{
	ParentBody     "1"
	Class	       "Asteroid"

	Mass            1.92611e-007
	Radius          44.6607
	InertiaMoment   0.397772

	Oblateness      0.054214

	Obliquity       -0.00900178
	EqAscendNode    102.318
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.531 0.373 0.302)

	Surface
	{
		SurfStyle       0.943721
		OceanStyle      0.0802054
		Randomize      (0.437, -0.345, -0.118)
		colorDistMagn   0.205143
		colorDistFreq   0.391892
		detailScale     1219.53
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.397131
		terraceProb     0.194044
		erosion         0
		montesMagn      0.550436
		montesFreq      3.52625
		montesSpiky     0.849091
		montesFraction  0.598997
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.88241
		hillsFraction   0.503231
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241054
		craterFreq      0.265124
		craterDensity   0.77525
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.478654
		volcanoTemp     882.679
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.181, 0.130, 0.121, 0.050)
		colorShelf     (0.213, 0.153, 0.139, 0.040)
		colorBeach     (0.244, 0.175, 0.157, 0.030)
		colorDesert    (0.276, 0.198, 0.178, 0.020)
		colorLowland   (0.308, 0.220, 0.197, 0.030)
		colorUpland    (0.340, 0.242, 0.215, 0.050)
		colorRock      (0.372, 0.265, 0.239, 0.020)
		colorSnow      (0.372, 0.265, 0.239, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00153555
		Period          0.0010255
		Eccentricity    4.88407e-005
		Inclination     -0.00900178
		AscendingNode   102.318
		ArgOfPericenter -114.755
		MeanAnomaly     -120.794
	}
}

DwarfMoon	"1.D3"
{
	ParentBody     "1"
	Class	       "Asteroid"

	Mass            2.66207e-007
	Radius          87.3943
	InertiaMoment   0.398995

	Oblateness      0.249

	Obliquity       -0.0018374
	EqAscendNode    -177.31
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.538 0.532 0.529)

	Surface
	{
		SurfStyle       0.812129
		OceanStyle      0.682949
		Randomize      (0.834, -0.964, -0.245)
		colorDistMagn   0.685313
		colorDistFreq   3.96645
		detailScale     2386.45
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.355404
		terraceProb     0.155367
		erosion         0
		montesMagn      0.397712
		montesFreq      3.01597
		montesSpiky     0.948576
		montesFraction  0.69655
		dunesFraction   0
		hillsMagn       0
		hillsFreq       13.4134
		hillsFraction   0.635621
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227291
		craterFreq      0.217697
		craterDensity   1.0146
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.399642
		volcanoTemp     1319.24
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.210, 0.181, 0.148, 0.000)
		colorShelf     (0.215, 0.186, 0.169, 0.000)
		colorBeach     (0.253, 0.218, 0.201, 0.000)
		colorDesert    (0.274, 0.234, 0.196, 0.000)
		colorLowland   (0.301, 0.250, 0.222, 0.000)
		colorUpland    (0.333, 0.303, 0.270, 0.000)
		colorRock      (0.360, 0.330, 0.291, 0.000)
		colorSnow      (0.393, 0.351, 0.307, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0015832
		Period          0.00107361
		Eccentricity    2.83768e-005
		Inclination     -0.0018374
		AscendingNode   -177.31
		ArgOfPericenter 6.56397
		MeanAnomaly     -176.743
	}
}

DwarfMoon	"1.D4"
{
	ParentBody     "1"
	Class	       "Asteroid"

	Mass            3.70465e-007
	Radius          47.5081
	InertiaMoment   0.399913

	Oblateness      0.0265874

	Obliquity       -0.00211878
	EqAscendNode    172.734
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.725 0.720 0.718)

	Surface
	{
		SurfStyle       0.10602
		OceanStyle      0.30263
		Randomize      (-0.471, -0.066, 0.058)
		colorDistMagn   0.784451
		colorDistFreq   1.00976
		detailScale     1297.29
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.362481
		terraceProb     0.338431
		erosion         0
		montesMagn      0.441096
		montesFreq      2.94736
		montesSpiky     0.961071
		montesFraction  0.399567
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.66742
		hillsFraction   0.682814
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237342
		craterFreq      0.214268
		craterDensity   1.06956
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.399989
		volcanoTemp     1975.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.290, 0.288, 0.287, 0.000)
		colorShelf     (0.308, 0.306, 0.305, 0.000)
		colorBeach     (0.326, 0.324, 0.323, 0.000)
		colorDesert    (0.344, 0.342, 0.341, 0.000)
		colorLowland   (0.363, 0.360, 0.359, 0.000)
		colorUpland    (0.381, 0.378, 0.377, 0.000)
		colorRock      (0.399, 0.396, 0.395, 0.000)
		colorSnow      (0.417, 0.414, 0.413, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00167003
		Period          0.00116312
		Eccentricity    9.28793e-005
		Inclination     -0.00211878
		AscendingNode   172.734
		ArgOfPericenter 140.443
		MeanAnomaly     -75.3906
	}
}

DwarfMoon	"1.D5"
{
	ParentBody     "1"
	Class	       "Asteroid"

	Mass            5.19864e-007
	Radius          67.3747
	InertiaMoment   0.397991

	Oblateness      0.0408422

	Obliquity       -1.04223e-005
	EqAscendNode    -106.14
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.792 0.791 0.789)

	Surface
	{
		SurfStyle       0.54488
		OceanStyle      0.562553
		Randomize      (-0.728, 0.584, 0.077)
		colorDistMagn   0.812419
		colorDistFreq   2.3722
		detailScale     1839.78
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.39636
		terraceProb     0.500905
		erosion         0
		montesMagn      0.609712
		montesFreq      3.43107
		montesSpiky     0.905138
		montesFraction  0.682773
		dunesFraction   0
		hillsMagn       0
		hillsFreq       15.7913
		hillsFraction   0.64372
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235362
		craterFreq      0.148697
		craterDensity   1.02461
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.441976
		volcanoTemp     1168.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.309, 0.269, 0.221, 0.000)
		colorShelf     (0.317, 0.277, 0.253, 0.000)
		colorBeach     (0.372, 0.324, 0.300, 0.000)
		colorDesert    (0.404, 0.348, 0.292, 0.000)
		colorLowland   (0.443, 0.372, 0.331, 0.000)
		colorUpland    (0.491, 0.451, 0.403, 0.000)
		colorRock      (0.530, 0.490, 0.434, 0.000)
		colorSnow      (0.578, 0.522, 0.458, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00182902
		Period          0.00133311
		Eccentricity    4.64053e-005
		Inclination     -1.04223e-005
		AscendingNode   -106.14
		ArgOfPericenter 150.048
		MeanAnomaly     24.1488
	}
}

Planet	"2"
{
	ParentBody     "Dellalt System"
	Class	       "IceGiant"

	Mass            26.0631
	Radius          24264.3
	InertiaMoment   0.22804

	RotationPeriod  278.881
	Obliquity       -2.26262
	EqAscendNode    101.946

	AlbedoBond      0.426896
	AlbedoGeom      0.512275
	Brightness      2
	Color          (0.588 0.376 0.207)

	Surface
	{
		SurfStyle       0.327064
		Randomize      (0.855, 0.981, 0.306)
		detailScale     62409
		colorConversion true
		tropicLatitude  0.0497043
		icecapLatitude  0.949704
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0.360158
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     4.12643
		stripeFluct     0.375914
		stripeTwist     10.4118
		cycloneMagn     8.09769
		cycloneFreq     0.921067
		cycloneDensity  0.56273
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
		BumpHeight      14.9036
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          60.4512
		Velocity        -1404.3
		BumpHeight      45.5478
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.20635
		mainOctaves     12
		Coverage        0.13448
		stripeZones     4.12643
		stripeFluct     0.375914
		stripeTwist     10.4118
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Jupiter"
		Height          242.643
		Density         2453.63
		Pressure        445416
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

	Aurora
	{
		Height      717.853
		NorthLat    85.995
		NorthLon    128.13
		NorthRadius 7946.37
		NorthWidth  1650.12
		NorthRings  4
		NorthBright 1
		NorthParticles 10000
		SouthLat    -90
		SouthLon    319.001
		SouthRadius 5748.42
		SouthWidth  1562.83
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
		SemiMajorAxis   0.0337109
		Period          0.0159032
		Eccentricity    0.0878548
		Inclination     -2.26262
		AscendingNode   101.946
		ArgOfPericenter 322.959
		MeanAnomaly     266.651
	}
}

Planet	"3"
{
	ParentBody     "Dellalt System"
	Class	       "IceGiant"

	Mass            23.5083
	Radius          23256.5
	InertiaMoment   0.247368

	RotationPeriod  1005.56
	Obliquity       -0.532491
	EqAscendNode    98.7845

	AlbedoBond      0.509726
	AlbedoGeom      0.611671
	Brightness      2
	Color          (0.483 0.281 0.114)

	Surface
	{
		SurfStyle       0.528168
		Randomize      (0.503, -0.809, 0.263)
		detailScale     59817
		colorConversion true
		tropicLatitude  0.0120989
		icecapLatitude  0.912099
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0.0912269
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     3.2713
		stripeFluct     0.347603
		stripeTwist     11.9495
		cycloneMagn     10.3553
		cycloneFreq     0.954741
		cycloneDensity  0.451785
		cycloneOctaves  0
		colorLayer0    (0.570, 0.550, 0.480, 1.000)
		colorLayer1    (0.850, 0.860, 0.870, 1.000)
		colorLayer2    (0.450, 0.390, 0.260, 1.000)
		colorLayer3    (0.430, 0.330, 0.170, 1.000)
		colorLayer4    (0.830, 0.830, 0.830, 1.000)
		colorLayer5    (0.510, 0.400, 0.140, 1.000)
		colorLayer6    (0.370, 0.350, 0.280, 1.000)
		colorLayer7    (0.420, 0.390, 0.310, 1.000)
		colorLowPlants (0.830, 0.830, 0.830, 1.000)
		colorUpPlants  (0.510, 0.400, 0.140, 1.000)
		BumpHeight      15.0407
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          102.051
		Velocity        324.197
		BumpHeight      64.6123
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.08211
		mainOctaves     12
		Coverage        0.548629
		stripeZones     3.2713
		stripeFluct     0.347603
		stripeTwist     11.9495
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Jupiter"
		Height          232.565
		Density         2067.5
		Pressure        378556
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.0358924
		Saturation      0.702051

		Composition
		{
			H2    	91.8391
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

	Rings
	{
		InnerRadius     25772.5
		OuterRadius     42287.9
		RotationPeriod  3.58731
		RotationOffset  0
		FrontBright     0.755492
		BackBright      0.62767
		Density         0.809041
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0604926
		Period          0.0382291
		Eccentricity    0.0727463
		Inclination     -0.532491
		AscendingNode   98.7845
		ArgOfPericenter 74.7063
		MeanAnomaly     105.766
	}
}

DwarfMoon	"3.D1"
{
	ParentBody     "3"
	Class	       "Asteroid"

	Mass            2.486e-009
	Radius          20.4386
	InertiaMoment   0.398778

	Oblateness      0.249

	Obliquity       0.00181723
	EqAscendNode    -99.5128
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.575 0.566 0.562)

	Surface
	{
		SurfStyle       0.0988233
		OceanStyle      0.169498
		Randomize      (-0.570, -0.260, 0.340)
		colorDistMagn   0.263809
		colorDistFreq   0.298154
		detailScale     558.11
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.504197
		terraceProb     0.121328
		erosion         0
		montesMagn      0.582197
		montesFreq      2.96299
		montesSpiky     0.886644
		montesFraction  0.418585
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.882172
		hillsFraction   0.709169
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246262
		craterFreq      0.240092
		craterDensity   0.822405
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.465234
		volcanoTemp     1191.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.230, 0.226, 0.225, 0.000)
		colorShelf     (0.244, 0.241, 0.239, 0.000)
		colorBeach     (0.259, 0.255, 0.253, 0.000)
		colorDesert    (0.273, 0.269, 0.267, 0.000)
		colorLowland   (0.287, 0.283, 0.281, 0.000)
		colorUpland    (0.302, 0.297, 0.295, 0.000)
		colorRock      (0.316, 0.311, 0.309, 0.000)
		colorSnow      (0.330, 0.325, 0.323, 1.000)
		BumpHeight      18.3947
		BumpOffset      3.67895
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000411983
		Period          0.000997441
		Eccentricity    9.60211e-005
		Inclination     0.00181723
		AscendingNode   -99.5128
		ArgOfPericenter 66.7669
		MeanAnomaly     -78.149
	}
}

DwarfMoon	"3.D2"
{
	ParentBody     "3"
	Class	       "Asteroid"

	Mass            3.4662e-009
	Radius          21.6852
	InertiaMoment   0.399727

	Oblateness      0.249

	Obliquity       0.00578242
	EqAscendNode    -88.7961
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.811 0.751 0.661)

	Surface
	{
		SurfStyle       0.298394
		OceanStyle      0.286998
		Randomize      (-0.859, -0.750, -0.651)
		colorDistMagn   0.41535
		colorDistFreq   0.151864
		detailScale     592.152
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.326299
		terraceProb     0.334286
		erosion         0
		montesMagn      0.348934
		montesFreq      3.55816
		montesSpiky     0.987357
		montesFraction  0.364573
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.12235
		hillsFraction   0.506781
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.266556
		craterFreq      0.240865
		craterDensity   0.776612
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.544832
		volcanoTemp     1661.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.325, 0.300, 0.264, 0.000)
		colorShelf     (0.345, 0.319, 0.281, 0.000)
		colorBeach     (0.365, 0.338, 0.298, 0.000)
		colorDesert    (0.385, 0.357, 0.314, 0.000)
		colorLowland   (0.406, 0.375, 0.331, 0.000)
		colorUpland    (0.426, 0.394, 0.347, 0.000)
		colorRock      (0.446, 0.413, 0.364, 0.000)
		colorSnow      (0.466, 0.432, 0.380, 1.000)
		BumpHeight      19.5167
		BumpOffset      3.90334
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000438564
		Period          0.00109551
		Eccentricity    6.71662e-005
		Inclination     0.00578242
		AscendingNode   -88.7961
		ArgOfPericenter -88.3989
		MeanAnomaly     -154.601
	}
}

DwarfMoon	"3.D3"
{
	ParentBody     "3"
	Class	       "Asteroid"

	Mass            4.79814e-009
	Radius          23.2151
	InertiaMoment   0.397656

	Oblateness      0.0659638

	Obliquity       46.775
	EqAscendNode    145.433
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.743 0.741 0.738)

	Surface
	{
		SurfStyle       0.876876
		OceanStyle      0.741832
		Randomize      (0.536, -0.688, -0.234)
		colorDistMagn   0.334384
		colorDistFreq   0.298628
		detailScale     633.928
		colorConversion true
		snowLevel       2
		tropicLatitude  0.422704
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.516102
		terraceProb     0.408105
		erosion         0
		montesMagn      0.480089
		montesFreq      2.42595
		montesSpiky     0.99623
		montesFraction  0.564759
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.979395
		hillsFraction   0.675262
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.207061
		craterFreq      0.231244
		craterDensity   0.910542
		craterOctaves   13
		volcanoActivity 0.00584672
		volcanoFlows    0
		volcanoRadius   0.55787
		volcanoTemp     1585
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.252, 0.259, 0.295, 0.050)
		colorShelf     (0.297, 0.304, 0.339, 0.040)
		colorBeach     (0.342, 0.348, 0.384, 0.030)
		colorDesert    (0.386, 0.393, 0.435, 0.020)
		colorLowland   (0.431, 0.437, 0.480, 0.030)
		colorUpland    (0.475, 0.482, 0.524, 0.050)
		colorRock      (0.520, 0.526, 0.583, 0.020)
		colorSnow      (0.520, 0.526, 0.583, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000699569
		Period          0.00220706
		Eccentricity    0.366789
		Inclination     46.775
		AscendingNode   145.433
		ArgOfPericenter 66.2363
		MeanAnomaly     67.7711
	}
}

DwarfMoon	"3.D4"
{
	ParentBody     "3"
	Class	       "Asteroid"

	Mass            6.60275e-009
	Radius          24.4828
	InertiaMoment   0.398926

	Oblateness      0.00279594

	Obliquity       -85.0565
	EqAscendNode    102.741
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.754 0.687 0.608)

	Surface
	{
		SurfStyle       0.674351
		OceanStyle      0.00181334
		Randomize      (0.571, 0.218, 0.210)
		colorDistMagn   0.0278923
		colorDistFreq   0.381768
		detailScale     668.542
		colorConversion true
		snowLevel       2
		tropicLatitude  0.974049
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.550064
		terraceProb     0.248765
		erosion         0
		montesMagn      0.495006
		montesFreq      2.81951
		montesSpiky     0.94269
		montesFraction  0.546021
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.37561
		hillsFraction   0.798896
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24095
		craterFreq      0.221858
		craterDensity   0.891138
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.500745
		volcanoTemp     1393.95
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.294, 0.234, 0.170, 0.000)
		colorShelf     (0.302, 0.241, 0.195, 0.000)
		colorBeach     (0.355, 0.282, 0.231, 0.000)
		colorDesert    (0.385, 0.302, 0.225, 0.000)
		colorLowland   (0.422, 0.323, 0.255, 0.000)
		colorUpland    (0.468, 0.392, 0.310, 0.000)
		colorRock      (0.505, 0.426, 0.334, 0.000)
		colorSnow      (0.551, 0.454, 0.353, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00120032
		Period          0.00496038
		Eccentricity    0.0597079
		Inclination     -85.0565
		AscendingNode   102.741
		ArgOfPericenter -150.602
		MeanAnomaly     -116.801
	}
}

Planet	"5"
{
	ParentBody     "Dellalt System"
	Class	       "IceWorld"

	Mass            0.257885
	Radius          5035.42
	InertiaMoment   0.327926

	Obliquity       -0.995808
	EqAscendNode    -52.1761
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.410 0.403 0.401)

	Surface
	{
		SurfStyle       0.935223
		OceanStyle      0.320502
		Randomize      (-0.497, -0.254, 0.592)
		colorDistMagn   0.0540653
		colorDistFreq   606.828
		detailScale     12951.4
		colorConversion true
		drivenDarkening 0
		seaLevel        0.177137
		snowLevel       2
		tropicLatitude  0.0312138
		icecapLatitude  0.470993
		icecapHeight    0.19959
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.89113
		venusFreq       0.701343
		venusMagn       0
		mareFreq        2.1088
		mareDensity     0.0256695
		terraceProb     0.454603
		erosion         0
		montesMagn      0.192194
		montesFreq      200.666
		montesSpiky     0.860714
		montesFraction  0.703359
		dunesMagn       0.0376239
		dunesFreq       6572.72
		dunesFraction   0.79751
		hillsMagn       0.138405
		hillsFreq       537.837
		hillsFraction   0.154707
		hills2Fraction  0.250824
		riversMagn      52.8468
		riversFreq      2.44444
		riversSin       7.74679
		riversOctaves   0
		canyonsMagn     0.418264
		canyonsFreq     1.95341
		canyonFraction  0
		cracksMagn      0.0652286
		cracksFreq      2.29113
		cracksOctaves   4
		craterMagn      0.65491
		craterFreq      12.4568
		craterDensity   0.970946
		craterOctaves   13
		craterRayedFactor 0.142833
		volcanoMagn     0.574738
		volcanoFreq     0.543218
		volcanoDensity  0.222819
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.366352
		volcanoRadius   0.464968
		volcanoTemp     1490.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.311, 0.286, 0.232, 1.000)
		colorShelf     (0.311, 0.286, 0.232, 1.000)
		colorBeach     (0.287, 0.250, 0.200, 1.000)
		colorDesert    (0.287, 0.250, 0.200, 1.000)
		colorLowland   (0.348, 0.327, 0.304, 1.000)
		colorUpland    (0.365, 0.359, 0.344, 1.000)
		colorRock      (0.930, 0.910, 0.860, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.348, 0.327, 0.304, 1.000)
		colorUpPlants  (0.365, 0.359, 0.344, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.991325
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
		Height          125.541
		Density         0.000867501
		Pressure        0.000243417
		Greenhouse      0.0563797
		Bright          3.86949
		Opacity         0
		SkyLight        1.28983
		Hue             0.0267131
		Saturation      1

		Composition
		{
			CO2   	85.7527
			H2    	6.56128
			CH4   	3.1497
			C2H4  	2.15535
			C2H2  	2.03325
			H2S   	0.141255
			C2H6  	0.123933
			N2    	0.0616569
			CO    	0.0193312
			Ar    	0.000898316
			He    	0.000300618
			C3H8  	0.000201404
			Ne    	6.62128e-005
			NH3   	4.42639e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.186114
		Period          0.206351
		Eccentricity    0.0538201
		Inclination     -0.995808
		AscendingNode   -52.1761
		ArgOfPericenter 39.6857
		MeanAnomaly     338.17
	}
}

Moon	"5.1"
{
	ParentBody     "5"
	Class	       "IceWorld"

	Mass            5.90648e-006
	Radius          262.499
	InertiaMoment   0.398704

	Oblateness      0.00886221

	Obliquity       3.62903
	EqAscendNode    -12.9099
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.638 0.632 0.630)

	Surface
	{
		SurfStyle       0.811672
		OceanStyle      0.859789
		Randomize      (-0.715, 0.368, -0.780)
		colorDistMagn   0.072711
		colorDistFreq   36.4199
		detailScale     675.162
		colorConversion true
		drivenDarkening 0
		seaLevel        0.236946
		snowLevel       2
		tropicLatitude  0.125541
		icecapLatitude  0.980604
		icecapHeight    0.238291
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.86245
		venusFreq       0.403473
		venusMagn       0
		mareFreq        0
		mareDensity     1.79594e-006
		terraceProb     0.111568
		erosion         0
		montesMagn      0.0587886
		montesFreq      13.9882
		montesSpiky     0.972112
		montesFraction  0.466812
		dunesMagn       0.0321638
		dunesFreq       345.368
		dunesFraction   0.161538
		hillsMagn       0.141964
		hillsFreq       34.0705
		hillsFraction   0.831747
		hills2Fraction  0.127047
		riversMagn      58.0814
		riversFreq      2.86938
		riversSin       6.14321
		riversOctaves   0
		canyonsMagn     0.478982
		canyonsFreq     0.123179
		canyonFraction  0
		cracksMagn      0.0667337
		cracksFreq      0.0863112
		cracksOctaves   0
		craterMagn      0.94637
		craterFreq      0.784003
		craterDensity   0.711103
		craterOctaves   8
		craterRayedFactor 0.0750388
		volcanoMagn     0.163034
		volcanoFreq     0.656855
		volcanoDensity  0.192099
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.284342
		volcanoRadius   0.17236
		volcanoTemp     1408.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.638, 0.474, 0.362, 0.000)
		colorShelf     (0.606, 0.450, 0.344, 0.000)
		colorBeach     (0.319, 0.237, 0.181, 0.000)
		colorDesert    (0.542, 0.403, 0.308, 0.000)
		colorLowland   (0.517, 0.417, 0.344, 0.000)
		colorUpland    (0.593, 0.441, 0.337, 0.000)
		colorRock      (1.000, 1.000, 1.000, 0.500)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.517, 0.417, 0.344, 0.000)
		colorUpPlants  (0.593, 0.441, 0.337, 0.000)
		BumpHeight      13.125
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
		SemiMajorAxis   0.000420137
		Period          0.00980727
		Eccentricity    0.360397
		Inclination     3.62903
		AscendingNode   -12.9099
		ArgOfPericenter -40.7562
		MeanAnomaly     42.7103
	}
}

DwarfMoon	"5.D1"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            1.90684e-011
	Radius          3.72267
	InertiaMoment   0.399665

	Obliquity       -41.323
	EqAscendNode    -44.7485
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.744 0.741 0.739)

	Surface
	{
		SurfStyle       0.418362
		OceanStyle      2.90317e-006
		Randomize      (0.628, -0.683, 0.688)
		colorDistMagn   0.250563
		colorDistFreq   0.00648108
		detailScale     101.654
		colorConversion true
		snowLevel       2
		tropicLatitude  0.967112
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
		hillsFreq       0.0250669
		hillsFraction   0.677266
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232751
		craterFreq      0.22013
		craterDensity   0.850467
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.515622
		volcanoTemp     1522.25
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.297, 0.297, 0.296, 0.000)
		colorShelf     (0.316, 0.315, 0.314, 0.000)
		colorBeach     (0.335, 0.334, 0.333, 0.000)
		colorDesert    (0.353, 0.352, 0.351, 0.000)
		colorLowland   (0.372, 0.371, 0.370, 0.000)
		colorUpland    (0.390, 0.389, 0.388, 0.000)
		colorRock      (0.409, 0.408, 0.407, 0.000)
		colorSnow      (0.428, 0.426, 0.425, 1.000)
		BumpHeight      3.3504
		BumpOffset      0.67008
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000963761
		Period          0.0340738
		Eccentricity    0.0395958
		Inclination     -41.323
		AscendingNode   -44.7485
		ArgOfPericenter 86.5965
		MeanAnomaly     114.743
	}
}

Planet	"6"
{
	ParentBody     "Dellalt System"
	Class	       "Titan"

	Mass            1.22636
	Radius          8110.74
	InertiaMoment   0.329292

	Oblateness      0.00504846

	RotationPeriod  25.1609
	Obliquity       0.36541
	EqAscendNode    -139.765

	AlbedoBond      0.65
	AlbedoGeom      0.78
	Brightness      2
	Color          (0.636 0.630 0.627)

	Surface
	{
		SurfStyle       0.190262
		OceanStyle      0.798641
		Randomize      (-0.275, -0.756, 0.680)
		colorDistMagn   0.0625722
		colorDistFreq   1092.75
		detailScale     20861.3
		colorConversion true
		seaLevel        0.137668
		snowLevel       0.85
		tropicLatitude  0.0228592
		icecapLatitude  10
		icecapHeight    0.158076
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.98743
		venusFreq       1.13365
		venusMagn       -1
		mareFreq        2.20922
		mareDensity     0.117586
		terraceProb     0.208911
		erosion         0.105812
		montesMagn      0.249889
		montesFreq      356.583
		montesSpiky     0.947671
		montesFraction  0.732053
		dunesMagn       0.0313493
		dunesFreq       56.4042
		dunesFraction   0.836915
		hillsMagn       0.146466
		hillsFreq       1012.13
		hillsFraction   0.49558
		hills2Fraction  0.630305
		riversMagn      59.6879
		riversFreq      3.93701
		riversSin       8.5177
		riversOctaves   2
		canyonsMagn     0.0456744
		canyonsFreq     250.234
		canyonFraction  0.85485
		cracksMagn      0.0371018
		cracksFreq      4.38691
		cracksOctaves   4
		craterMagn      0.633194
		craterFreq      21.1392
		craterDensity   0.0294794
		craterOctaves   1.17202
		craterRayedFactor 0
		volcanoMagn     0.641497
		volcanoFreq     0.513207
		volcanoDensity  0.20718
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.829537
		volcanoRadius   0.489049
		volcanoTemp     1456.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.24737
		stripeTwist     0.0525079
		cycloneMagn     2.57239
		cycloneFreq     0.635402
		cycloneDensity  0.265004
		cycloneOctaves  4
		colorSea       (0.150, 0.100, 0.090, 1.000)
		colorShelf     (0.640, 0.350, 0.210, 1.000)
		colorBeach     (0.318, 0.236, 0.180, 0.000)
		colorDesert    (0.540, 0.402, 0.306, 0.000)
		colorLowland   (0.515, 0.416, 0.342, 0.000)
		colorUpland    (0.591, 0.439, 0.335, 0.000)
		colorRock      (1.000, 1.000, 1.000, 0.500)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.515, 0.416, 0.342, 0.000)
		colorUpPlants  (0.591, 0.439, 0.335, 0.000)
		BumpHeight      20
		BumpOffset      2.75336
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
		Height          5.16357
		Velocity        105.708
		BumpHeight      5.16334
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.961225
		mainOctaves     10
		Coverage        0.1
		stripeZones     1.24737
		stripeTwist     0.0525079
	}

	Ocean
	{
		Height          2.75336
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
	}

	NoLava          true

	Atmosphere
	{
		Model          "Mars"
		Height          40.5537
		Density         1.71188
		Pressure        0.560859
		Greenhouse      5.45162
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.0470293
		Saturation      1

		Composition
		{
			N2    	99.5148
			CO    	0.430716
			Ar    	0.0395015
			He    	0.0133683
			Ne    	0.0014926
			Kr    	0.000110287
		}
	}

	Aurora
	{
		Height      149.558
		NorthLat    66.2439
		NorthLon    -151.98
		NorthRadius 1060.7
		NorthWidth  373.808
		NorthRings  2
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -72.1104
		SouthLon    18.1024
		SouthRadius 1566.71
		SouthWidth  367.049
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
		SemiMajorAxis   0.316887
		Period          0.458451
		Eccentricity    0.0980712
		Inclination     -1.0138
		AscendingNode   -138.427
		ArgOfPericenter 54.6924
		MeanAnomaly     44.237
	}
}

DwarfMoon	"6.D1"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            1.57196e-009
	Radius          15.9289
	InertiaMoment   0.399107

	Oblateness      0.249

	Obliquity       0.0123384
	EqAscendNode    -163.002
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.643 0.550 0.514)

	Surface
	{
		SurfStyle       0.151316
		OceanStyle      0.676777
		Randomize      (0.104, 0.657, 0.889)
		colorDistMagn   0.596796
		colorDistFreq   0.0576198
		detailScale     434.965
		colorConversion true
		snowLevel       2
		tropicLatitude  0
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
		hillsFreq       0.540366
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
		colorSea       (0.257, 0.220, 0.206, 0.000)
		colorShelf     (0.273, 0.234, 0.219, 0.000)
		colorBeach     (0.289, 0.248, 0.232, 0.000)
		colorDesert    (0.305, 0.261, 0.244, 0.000)
		colorLowland   (0.322, 0.275, 0.257, 0.000)
		colorUpland    (0.338, 0.289, 0.270, 0.000)
		colorRock      (0.354, 0.303, 0.283, 0.000)
		colorSnow      (0.370, 0.316, 0.296, 1.000)
		BumpHeight      14.336
		BumpOffset      2.8672
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00012696
		Period          0.000747089
		Eccentricity    3.0399e-005
		Inclination     0.0123384
		AscendingNode   -163.002
		ArgOfPericenter -148.795
		MeanAnomaly     -68.2972
	}
}

DwarfMoon	"6.D2"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            2.21828e-009
	Radius          16.8313
	InertiaMoment   0.394393

	Oblateness      0.20374

	Obliquity       0.00288148
	EqAscendNode    50.1936
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.718 0.678 0.610)

	Surface
	{
		SurfStyle       0.387606
		OceanStyle      0.84436
		Randomize      (-0.802, -0.976, -0.488)
		colorDistMagn   0.33245
		colorDistFreq   0.179446
		detailScale     459.608
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
		hillsFreq       0.790064
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
		colorSea       (0.287, 0.271, 0.244, 0.000)
		colorShelf     (0.305, 0.288, 0.259, 0.000)
		colorBeach     (0.323, 0.305, 0.275, 0.000)
		colorDesert    (0.341, 0.322, 0.290, 0.000)
		colorLowland   (0.359, 0.339, 0.305, 0.000)
		colorUpland    (0.377, 0.356, 0.320, 0.000)
		colorRock      (0.395, 0.373, 0.336, 0.000)
		colorSnow      (0.413, 0.390, 0.351, 1.000)
		BumpHeight      15.1482
		BumpOffset      3.02964
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

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

DwarfMoon	"6.D3"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            3.10147e-009
	Radius          22.0475
	InertiaMoment   0.39815

	Oblateness      0.249

	Obliquity       0.00197294
	EqAscendNode    67.6535
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.680 0.675 0.671)

	Surface
	{
		SurfStyle       0.207877
		OceanStyle      0.991866
		Randomize      (0.063, -0.216, 0.689)
		colorDistMagn   0.335182
		colorDistFreq   0.289307
		detailScale     602.044
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
		hillsFreq       0.864436
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
		colorSea       (0.272, 0.270, 0.268, 0.000)
		colorShelf     (0.289, 0.287, 0.285, 0.000)
		colorBeach     (0.306, 0.304, 0.302, 0.000)
		colorDesert    (0.323, 0.321, 0.319, 0.000)
		colorLowland   (0.340, 0.337, 0.335, 0.000)
		colorUpland    (0.357, 0.354, 0.352, 0.000)
		colorRock      (0.374, 0.371, 0.369, 0.000)
		colorSnow      (0.391, 0.388, 0.386, 1.000)
		BumpHeight      19.8427
		BumpOffset      3.96855
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

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

DwarfMoon	"6.D4"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            4.30304e-009
	Radius          23.3347
	InertiaMoment   0.399243

	Oblateness      0.216428

	Obliquity       -0.00758556
	EqAscendNode    80.3979
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.649 0.535 0.471)

	Surface
	{
		SurfStyle       0.847358
		OceanStyle      0.383159
		Randomize      (-0.516, 0.827, -0.031)
		colorDistMagn   0.745911
		colorDistFreq   0.244376
		detailScale     637.193
		colorConversion true
		snowLevel       2
		tropicLatitude  0
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
		hillsFreq       0.808148
		hillsFraction   0.808927
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242553
		craterFreq      0.18116
		craterDensity   0.850497
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.555137
		volcanoTemp     1306.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.253, 0.182, 0.132, 0.000)
		colorShelf     (0.259, 0.187, 0.151, 0.000)
		colorBeach     (0.305, 0.220, 0.179, 0.000)
		colorDesert    (0.331, 0.236, 0.174, 0.000)
		colorLowland   (0.363, 0.252, 0.198, 0.000)
		colorUpland    (0.402, 0.305, 0.240, 0.000)
		colorRock      (0.435, 0.332, 0.259, 0.000)
		colorSnow      (0.474, 0.353, 0.273, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000183718
		Period          0.00130046
		Eccentricity    2.47873e-005
		Inclination     -0.00758556
		AscendingNode   80.3979
		ArgOfPericenter 119.566
		MeanAnomaly     -148.589
	}
}

DwarfMoon	"6.D5"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            5.93244e-009
	Radius          24.9464
	InertiaMoment   0.396161

	RotationPeriod  266.639
	Obliquity       59.1868
	EqAscendNode    68.1845

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.688 0.683 0.680)

	Surface
	{
		SurfStyle       0.67149
		OceanStyle      0.510991
		Randomize      (0.570, 0.721, -0.888)
		colorDistMagn   0.694821
		colorDistFreq   0.208817
		detailScale     681.203
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999931
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
		hillsFreq       0.979145
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
		colorSea       (0.268, 0.232, 0.190, 0.000)
		colorShelf     (0.275, 0.239, 0.218, 0.000)
		colorBeach     (0.323, 0.280, 0.258, 0.000)
		colorDesert    (0.351, 0.300, 0.252, 0.000)
		colorLowland   (0.385, 0.321, 0.286, 0.000)
		colorUpland    (0.426, 0.389, 0.347, 0.000)
		colorRock      (0.461, 0.423, 0.374, 0.000)
		colorSnow      (0.502, 0.451, 0.394, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00114669
		Period          0.0202787
		Eccentricity    0.42809
		Inclination     59.1868
		AscendingNode   68.1845
		ArgOfPericenter -14.3351
		MeanAnomaly     -177.093
	}
}

DwarfMoon	"6.D6"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            8.137e-009
	Radius          26.312
	InertiaMoment   0.398334

	Obliquity       55.0069
	EqAscendNode    -122.04
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.709 0.707 0.706)

	Surface
	{
		SurfStyle       0.830549
		OceanStyle      0.684445
		Randomize      (0.265, -0.641, -0.338)
		colorDistMagn   0.117295
		colorDistFreq   0.348001
		detailScale     718.493
		colorConversion true
		snowLevel       2
		tropicLatitude  0.728624
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
		hillsFreq       1.5661
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
		colorSea       (0.277, 0.240, 0.198, 0.000)
		colorShelf     (0.284, 0.247, 0.226, 0.000)
		colorBeach     (0.333, 0.290, 0.268, 0.000)
		colorDesert    (0.362, 0.311, 0.261, 0.000)
		colorLowland   (0.397, 0.332, 0.296, 0.000)
		colorUpland    (0.440, 0.403, 0.360, 0.000)
		colorRock      (0.475, 0.438, 0.388, 0.000)
		colorSnow      (0.518, 0.466, 0.409, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00140726
		Period          0.0275698
		Eccentricity    0.0274637
		Inclination     55.0069
		AscendingNode   -122.04
		ArgOfPericenter 21.5674
		MeanAnomaly     -31.0178
	}
}

DwarfMoon	"6.D7"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            1.11158e-008
	Radius          34.1117
	InertiaMoment   0.399375

	Obliquity       33.0336
	EqAscendNode    -105.919
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.458 0.456 0.452)

	Surface
	{
		SurfStyle       0.203689
		OceanStyle      0.687955
		Randomize      (-0.192, 0.743, 0.239)
		colorDistMagn   0.705658
		colorDistFreq   0.994742
		detailScale     931.476
		colorConversion true
		snowLevel       2
		tropicLatitude  0.62033
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
		hillsFreq       2.22692
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
		colorSea       (0.183, 0.182, 0.181, 0.000)
		colorShelf     (0.195, 0.194, 0.192, 0.000)
		colorBeach     (0.206, 0.205, 0.203, 0.000)
		colorDesert    (0.218, 0.216, 0.215, 0.000)
		colorLowland   (0.229, 0.228, 0.226, 0.000)
		colorUpland    (0.241, 0.239, 0.237, 0.000)
		colorRock      (0.252, 0.251, 0.249, 0.000)
		colorSnow      (0.264, 0.262, 0.260, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00171627
		Period          0.037132
		Eccentricity    0.0525601
		Inclination     33.0336
		AscendingNode   -105.919
		ArgOfPericenter 146.096
		MeanAnomaly     172.822
	}
}

DwarfMoon	"6.D8"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            1.51389e-008
	Radius          35.7078
	InertiaMoment   0.396755

	RotationPeriod  2235.1
	Obliquity       -19.0048
	EqAscendNode    -77.3599

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.792 0.789 0.786)

	Surface
	{
		SurfStyle       0.783455
		OceanStyle      0.272631
		Randomize      (-0.542, 0.415, -0.289)
		colorDistMagn   0.823981
		colorDistFreq   0.703341
		detailScale     975.062
		colorConversion true
		snowLevel       2
		tropicLatitude  0.491729
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
		hillsFreq       3.18195
		hillsFraction   0.87103
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242229
		craterFreq      0.149198
		craterDensity   0.950752
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.458864
		volcanoTemp     1805.09
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.309, 0.268, 0.220, 0.000)
		colorShelf     (0.317, 0.276, 0.252, 0.000)
		colorBeach     (0.372, 0.323, 0.299, 0.000)
		colorDesert    (0.404, 0.347, 0.291, 0.000)
		colorLowland   (0.444, 0.371, 0.330, 0.000)
		colorUpland    (0.491, 0.450, 0.401, 0.000)
		colorRock      (0.531, 0.489, 0.432, 0.000)
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
		SemiMajorAxis   0.00212052
		Period          0.0509958
		Eccentricity    0.284211
		Inclination     -19.0048
		AscendingNode   -77.3599
		ArgOfPericenter -46.2435
		MeanAnomaly     -66.5176
	}
}

DwarfMoon	"6.D9"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            2.05747e-008
	Radius          37.9782
	InertiaMoment   0.398505

	RotationPeriod  1785.6
	Obliquity       54.6416
	EqAscendNode    33.0156

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.568 0.565 0.562)

	Surface
	{
		SurfStyle       0.0417044
		OceanStyle      0.331113
		Randomize      (-0.836, 0.832, 0.594)
		colorDistMagn   0.702435
		colorDistFreq   0.841785
		detailScale     1037.06
		colorConversion true
		snowLevel       2
		tropicLatitude  0.974856
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
		hillsFreq       2.77133
		hillsFraction   0.561244
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242722
		craterFreq      0.195912
		craterDensity   0.773405
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.514936
		volcanoTemp     1652.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.227, 0.226, 0.225, 0.000)
		colorShelf     (0.241, 0.240, 0.239, 0.000)
		colorBeach     (0.256, 0.254, 0.253, 0.000)
		colorDesert    (0.270, 0.268, 0.267, 0.000)
		colorLowland   (0.284, 0.282, 0.281, 0.000)
		colorUpland    (0.298, 0.297, 0.295, 0.000)
		colorRock      (0.312, 0.311, 0.309, 0.000)
		colorSnow      (0.327, 0.325, 0.323, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00256646
		Period          0.0679003
		Eccentricity    0.318144
		Inclination     54.6416
		AscendingNode   33.0156
		ArgOfPericenter -34.3114
		MeanAnomaly     -32.6918
	}
}

DwarfMoon	"6.D10"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            2.79283e-008
	Radius          40.099
	InertiaMoment   0.399505

	RotationPeriod  3011.29
	Obliquity       -63.1588
	EqAscendNode    -144.337

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.756 0.754 0.753)

	Surface
	{
		SurfStyle       0.055522
		OceanStyle      0.913201
		Randomize      (0.262, 0.368, -0.739)
		colorDistMagn   0.707841
		colorDistFreq   0.547639
		detailScale     1094.97
		colorConversion true
		snowLevel       2
		tropicLatitude  0.52566
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
		hillsFreq       3.26331
		hillsFraction   0.622412
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.274994
		craterFreq      0.277249
		craterDensity   0.745247
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.477629
		volcanoTemp     1669.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.302, 0.302, 0.301, 0.000)
		colorShelf     (0.321, 0.321, 0.320, 0.000)
		colorBeach     (0.340, 0.339, 0.339, 0.000)
		colorDesert    (0.359, 0.358, 0.358, 0.000)
		colorLowland   (0.378, 0.377, 0.376, 0.000)
		colorUpland    (0.397, 0.396, 0.395, 0.000)
		colorRock      (0.416, 0.415, 0.414, 0.000)
		colorSnow      (0.435, 0.434, 0.433, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00300161
		Period          0.0858817
		Eccentricity    0.485906
		Inclination     -63.1587
		AscendingNode   -144.337
		ArgOfPericenter -36.5171
		MeanAnomaly     -142.758
	}
}

Barycenter	"7-7.1"
{
	ParentBody     "Dellalt System"
	Mass            6.19315
	Radius          5264.34
	RotationPeriod  24
	Obliquity       0
	EqAscendNode    0


	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.66678
		Period          1.39923
		Eccentricity    0.0156984
		Inclination     -0.827257
		AscendingNode   122.765
		ArgOfPericenter 101.227
		MeanAnomaly     261.775
	}
}

Planet	"7"
{
	ParentBody     "7-7.1"
	Class	       "Titan"

	Mass            5.92929
	Radius          13532.1
	InertiaMoment   0.330371

	Oblateness      0.00184026

	Obliquity       0.0486104
	EqAscendNode    79.0932
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.476 0.174 0.046)

	Surface
	{
		SurfStyle       0.518829
		OceanStyle      0.757751
		Randomize      (0.230, -0.094, -0.290)
		colorDistMagn   0.0881638
		colorDistFreq   1821.56
		detailScale     34805.2
		colorConversion true
		seaLevel        0.289552
		snowLevel       0.85
		tropicLatitude  0.00129187
		icecapLatitude  10
		icecapHeight    0.129462
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        1.68787
		venusFreq       1.39057
		venusMagn       -1
		mareFreq        1.79824
		mareDensity     0.200003
		terraceProb     0.446273
		erosion         0.117911
		montesMagn      0.244263
		montesFreq      770.445
		montesSpiky     0.879913
		montesFraction  0.810062
		dunesMagn       0.0606241
		dunesFreq       165.582
		dunesFraction   0.313006
		hillsMagn       0.135655
		hillsFreq       1074.09
		hillsFraction   0.251838
		hills2Fraction  0.0388567
		riversMagn      61.402
		riversFreq      3.66477
		riversSin       5.97919
		riversOctaves   2
		canyonsMagn     0.038527
		canyonsFreq     373.373
		canyonFraction  0.119244
		cracksMagn      0.0724794
		cracksFreq      9.28075
		cracksOctaves   4
		craterMagn      0.708788
		craterFreq      38.0138
		craterDensity   0
		craterOctaves   0
		craterRayedFactor 0
		volcanoMagn     0.525814
		volcanoFreq     0.811544
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.392047
		volcanoRadius   0.431317
		volcanoTemp     1594.19
		lavaCoverTidal  0.150266
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.05864
		stripeTwist     0.19342
		cycloneMagn     2.37843
		cycloneFreq     0.808161
		cycloneDensity  0.385009
		cycloneOctaves  3
		colorSea       (0.150, 0.100, 0.090, 1.000)
		colorShelf     (0.640, 0.350, 0.210, 1.000)
		colorBeach     (0.148, 0.062, 0.017, 0.200)
		colorDesert    (0.270, 0.110, 0.037, 0.200)
		colorLowland   (0.318, 0.283, 0.240, 0.200)
		colorUpland    (0.270, 0.115, 0.054, 0.120)
		colorRock      (0.880, 0.960, 1.000, 0.500)
		colorSnow      (0.270, 0.250, 0.260, 0.154)
		colorLowPlants (0.318, 0.283, 0.240, 0.200)
		colorUpPlants  (0.270, 0.115, 0.054, 0.120)
		BumpHeight      17.426
		BumpOffset      5.04574
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
		Height          9.69922
		Velocity        19.5914
		BumpHeight      6.31633
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.04824
		mainOctaves     10
		Coverage        1
		stripeZones     2.05864
		stripeTwist     0.19342
	}

	Clouds
	{
		Height          19.3984
		Velocity        144.981
		BumpHeight      6.21496
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.04824
		mainOctaves     10
		Coverage        1
		stripeZones     2.05864
		stripeTwist     0.19342
	}

	Ocean
	{
		Height          5.04574
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
	}

	NoLava          true

	Atmosphere
	{
		Model          "Jupiter"
		Height          67.6603
		Density         10.3763
		Pressure        2.35263
		Greenhouse      6.45816
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0412687
		Saturation      0.982915

		Composition
		{
			N2    	99.6688
			Ar    	0.271061
			CO    	0.0484588
			Ne    	0.00948076
			He    	0.0021464
		}
	}

	Aurora
	{
		Height      188.6
		NorthLat    69.3694
		NorthLon    167.946
		NorthRadius 3023.29
		NorthWidth  913.587
		NorthRings  4
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -44.1441
		SouthLon    357.471
		SouthRadius 3081.78
		SouthWidth  749.106
		SouthRings  3
		SouthBright 0.3
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	Rings
	{
		InnerRadius     20897.5
		OuterRadius     33914.5
		RotationPeriod  6.11365
		RotationOffset  0
		FrontBright     0.894267
		BackBright      0.959867
		Density         0.897872
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.14844e-005
		Period          0.00466866
		Eccentricity    0.00525737
		Inclination     0.0486104
		AscendingNode   79.0933
		ArgOfPericenter 31.5212
		MeanAnomaly     60.706
	}
}

Moon	"7.1"
{
	ParentBody     "7-7.1"
	Class	       "Desert"

	Mass            0.263853
	Radius          5071.64
	InertiaMoment   0.332007

	Oblateness      0.00219013

	Obliquity       0.0486104
	EqAscendNode    79.0932
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.814 0.556 0.363)

	Surface
	{
		SurfStyle       0.271928
		OceanStyle      0.702276
		Randomize      (0.663, 0.903, 0.543)
		colorDistMagn   0.0516658
		colorDistFreq   656.026
		detailScale     13044.5
		colorConversion true
		seaLevel        0.0484166
		snowLevel       2
		tropicLatitude  0.00129187
		icecapLatitude  0.91007
		icecapHeight    0.0567952
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.26622
		venusFreq       0.762243
		venusMagn       0
		mareFreq        0.970122
		mareDensity     0.0352206
		terraceProb     0.383881
		erosion         0
		montesMagn      0.258421
		montesFreq      277.155
		montesSpiky     0.929018
		montesFraction  0.100577
		dunesMagn       0.0638407
		dunesFreq       32.0503
		dunesFraction   0.749589
		hillsMagn       0.108345
		hillsFreq       604.115
		hillsFraction   0
		hills2Fraction  0
		riversMagn      53.1702
		riversFreq      3.34312
		riversSin       4.94883
		riversOctaves   0
		canyonsMagn     0.0548157
		canyonsFreq     113.096
		canyonFraction  0
		cracksMagn      0.091646
		cracksFreq      0.39206
		cracksOctaves   0
		craterMagn      0.612539
		craterFreq      16.1191
		craterDensity   0.350308
		craterOctaves   5.02744
		volcanoMagn     0.720846
		volcanoFreq     0.749197
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.726874
		volcanoRadius   0.503277
		volcanoTemp     1241.03
		lavaCoverTidal  0.308434
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
		Hapke           0.591908
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
		Height          80.9743
		Density         0.0408092
		Pressure        0.0247751
		Greenhouse      3.30549
		Bright          8.35895
		Opacity         1
		SkyLight        2.78632
		Hue             0
		Saturation      1

		Composition
		{
			CH4   	95.3809
			N2    	2.23896
			H2    	1.2748
			C2H4  	1.03627
			CO    	0.0605055
			C2H2  	0.00565114
			Ne    	0.00131092
			He    	0.000678862
			C2H6  	0.000394839
			Ar    	0.000342646
			Kr    	9.38088e-005
			CO2   	9.2009e-005
		}
	}

	Aurora
	{
		Height      60.8324
		NorthLat    46.6464
		NorthLon    98.8991
		NorthRadius 1417.73
		NorthWidth  385.714
		NorthRings  3
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -24.6592
		SouthLon    303.558
		SouthRadius 1364.72
		SouthWidth  378.742
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
		SemiMajorAxis   0.000707517
		Period          0.00466866
		Eccentricity    0.00525737
		Inclination     0.0486104
		AscendingNode   79.0933
		ArgOfPericenter -148.479
		MeanAnomaly     60.706
	}
}

Planet	"8"
{
	ParentBody     "Dellalt System"
	Class	       "GasGiant"

	Mass            4078.28
	Radius          69551.9
	InertiaMoment   0.253892

	Oblateness      0.00687209

	RotationPeriod  8.21788
	Obliquity       21.4318
	EqAscendNode    147.54

	AlbedoBond      0.461767
	AlbedoGeom      0.554121
	Brightness      2

	Surface
	{
		SurfStyle       0.825008
		Randomize      (0.157, -0.303, 0.303)
		detailScale     178891
		colorConversion true
		tropicLatitude  0.398835
		icecapLatitude  1
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     9.20468
		stripeFluct     0.420492
		stripeTwist     7.82954
		cycloneMagn     12.2278
		cycloneFreq     0.741574
		cycloneDensity  0.434612
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
		BumpHeight      3.41512
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          13.0703
		Velocity        492.668
		BumpHeight      9.65849
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.602338
		mainOctaves     12
		Coverage        0.117672
		stripeZones     9.20468
		stripeFluct     0.420492
		stripeTwist     7.82954
	}

	Clouds
	{
		Height          22.7344
		Velocity        -370.455
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		ModulateColor  (1.000 1.000 1.000 0.800)
		mainFreq        0.602338
		mainOctaves     12
		Coverage        0.117672
		stripeZones     9.20468
		stripeFluct     0.420492
		stripeTwist     7.82954
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Jupiter"
		Height          100
		Density         6974.06
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0241512
		Saturation      0.602167

		Composition
		{
			H2    	92.6515
			He    	7.28501
			N2    	0.0376919
			CH4   	0.0168576
			O2    	0.00730249
			Ne    	0.000916086
			Ar    	0.000751778
		}
	}

	Aurora
	{
		Height      2538.77
		NorthLat    86.5041
		NorthLon    83.8793
		NorthRadius 18628.7
		NorthWidth  9249.06
		NorthRings  3
		NorthBright 1
		NorthParticles 10000
		SouthLat    -86.5439
		SouthLon    260.918
		SouthRadius 15324.6
		SouthWidth  7446
		SouthRings  2
		SouthBright 1
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	Rings
	{
		InnerRadius     77039.4
		OuterRadius     107131
		RotationPeriod  1.21236
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
		SemiMajorAxis   1.11121
		Period          2.8961
		Eccentricity    0.0608644
		Inclination     -2.43137
		AscendingNode   146.946
		ArgOfPericenter 96.8535
		MeanAnomaly     265.761
	}
}

DwarfMoon	"8.D1"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            1.50225e-010
	Radius          7.78249
	InertiaMoment   0.399311

	Oblateness      0.249

	Obliquity       0.0147064
	EqAscendNode    168.63
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.588 0.584 0.582)

	Surface
	{
		SurfStyle       0.676783
		OceanStyle      0.114692
		Randomize      (-0.372, -0.021, -0.562)
		colorDistMagn   0.745958
		colorDistFreq   0.0454356
		detailScale     212.514
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.49731
		terraceProb     0.17776
		erosion         0
		montesMagn      0.485664
		montesFreq      3.07002
		montesSpiky     0.958323
		montesFraction  0.349771
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.182692
		hillsFraction   0.615947
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.277701
		craterFreq      0.255386
		craterDensity   0.857818
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52716
		volcanoTemp     1810.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.229, 0.199, 0.163, 0.000)
		colorShelf     (0.235, 0.205, 0.186, 0.000)
		colorBeach     (0.277, 0.240, 0.221, 0.000)
		colorDesert    (0.300, 0.257, 0.215, 0.000)
		colorLowland   (0.330, 0.275, 0.245, 0.000)
		colorUpland    (0.365, 0.333, 0.297, 0.000)
		colorRock      (0.394, 0.362, 0.320, 0.000)
		colorSnow      (0.430, 0.386, 0.338, 1.000)
		BumpHeight      7.00424
		BumpOffset      1.40085
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00198999
		Period          0.000803929
		Eccentricity    8.86025e-005
		Inclination     0.0147064
		AscendingNode   168.63
		ArgOfPericenter -171.515
		MeanAnomaly     -6.32909
	}
}

DwarfMoon	"8.D2"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            2.36422e-010
	Radius          8.67457
	InertiaMoment   0.396505

	Oblateness      0.249

	Obliquity       -0.00404097
	EqAscendNode    -95.5046
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.634 0.628 0.625)

	Surface
	{
		SurfStyle       0.377303
		OceanStyle      0.783553
		Randomize      (-0.875, -0.168, 0.230)
		colorDistMagn   0.887738
		colorDistFreq   0.0576615
		detailScale     236.874
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.471015
		terraceProb     0.16277
		erosion         0
		montesMagn      0.610457
		montesFreq      2.42534
		montesSpiky     0.964274
		montesFraction  0.407205
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.172917
		hillsFraction   0.775093
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.266708
		craterFreq      0.170033
		craterDensity   0.8432
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.547553
		volcanoTemp     1710.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.254, 0.251, 0.250, 0.000)
		colorShelf     (0.269, 0.267, 0.265, 0.000)
		colorBeach     (0.285, 0.283, 0.281, 0.000)
		colorDesert    (0.301, 0.298, 0.297, 0.000)
		colorLowland   (0.317, 0.314, 0.312, 0.000)
		colorUpland    (0.333, 0.330, 0.328, 0.000)
		colorRock      (0.349, 0.346, 0.344, 0.000)
		colorSnow      (0.364, 0.361, 0.359, 1.000)
		BumpHeight      7.80711
		BumpOffset      1.56142
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00231984
		Period          0.00101188
		Eccentricity    6.25682e-005
		Inclination     -0.00404097
		AscendingNode   -95.5046
		ArgOfPericenter -10.8461
		MeanAnomaly     127.844
	}
}

DwarfMoon	"8.D3"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            3.61613e-010
	Radius          9.5796
	InertiaMoment   0.398423

	Oblateness      0.203148

	Obliquity       0.00510569
	EqAscendNode    -86.6399
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.643 0.482 0.400)

	Surface
	{
		SurfStyle       0.569676
		OceanStyle      0.0294751
		Randomize      (-0.258, 0.705, -0.451)
		colorDistMagn   0.542726
		colorDistFreq   0.0660124
		detailScale     261.587
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.560903
		terraceProb     0.363775
		erosion         0
		montesMagn      0.495916
		montesFreq      3.932
		montesSpiky     0.937665
		montesFraction  0.50476
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.239247
		hillsFraction   0.671375
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219987
		craterFreq      0.25583
		craterDensity   0.917574
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.496551
		volcanoTemp     1284.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.251, 0.164, 0.112, 0.000)
		colorShelf     (0.257, 0.169, 0.128, 0.000)
		colorBeach     (0.302, 0.198, 0.152, 0.000)
		colorDesert    (0.328, 0.212, 0.148, 0.000)
		colorLowland   (0.360, 0.226, 0.168, 0.000)
		colorUpland    (0.399, 0.275, 0.204, 0.000)
		colorRock      (0.431, 0.299, 0.220, 0.000)
		colorSnow      (0.470, 0.318, 0.232, 1.000)
		BumpHeight      8.62164
		BumpOffset      1.72433
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0026223
		Period          0.00121609
		Eccentricity    6.32669e-005
		Inclination     0.00510569
		AscendingNode   -86.6399
		ArgOfPericenter 137.535
		MeanAnomaly     -54.204
	}
}

Moon	"8.1"
{
	ParentBody     "8"
	Class	       "Desert"

	Mass            0.339946
	Radius          5489.02
	InertiaMoment   0.33028

	Oblateness      0.0112998

	Obliquity       0.705318
	EqAscendNode    -160.284
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.654 0.647 0.644)

	Surface
	{
		SurfStyle       0.32054
		OceanStyle      0.277699
		Randomize      (0.356, 0.018, 0.164)
		colorDistMagn   0.0701521
		colorDistFreq   583.136
		detailScale     14118.1
		colorConversion true
		seaLevel        0.114435
		snowLevel       2
		tropicLatitude  0.00421451
		icecapLatitude  10
		icecapHeight    0.132873
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        0.931387
		venusFreq       0.740995
		venusMagn       0
		mareFreq        1.4622
		mareDensity     0.0425039
		terraceProb     0.185715
		erosion         0
		montesMagn      0.184753
		montesFreq      288.608
		montesSpiky     0.872889
		montesFraction  0.761125
		dunesMagn       0.0555499
		dunesFreq       52.0517
		dunesFraction   0.402531
		hillsMagn       0.107434
		hillsFreq       666.189
		hillsFraction   0
		hills2Fraction  0
		riversMagn      59.0344
		riversFreq      3.07345
		riversSin       6.54162
		riversOctaves   0
		canyonsMagn     0.045384
		canyonsFreq     144.53
		canyonFraction  0
		cracksMagn      0.10824
		cracksFreq      0.569915
		cracksOctaves   0
		craterMagn      0.640332
		craterFreq      14.6207
		craterDensity   0.181122
		craterOctaves   2.83685
		volcanoMagn     0.643054
		volcanoFreq     0.773424
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.552804
		volcanoRadius   0.403385
		volcanoTemp     1536.79
		lavaCoverTidal  0.693021
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
		Hapke           0.913158
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
		Height          246.499
		Density         0.00868415
		Pressure        0.018205
		Greenhouse      8.3003
		Bright          6.13402
		Opacity         1
		SkyLight        2.04467
		Hue             0
		Saturation      1

		Composition
		{
			NH3   	36.387
			CH4   	17.9504
			H2O   	13.6707
			CO2   	12.8455
			SO2   	9.64121
			C2H2  	4.98021
			H2    	2.62573
			C2H4  	0.898449
			N2    	0.305546
			C3H8  	0.243228
			C2H6  	0.242682
			H2S   	0.20517
			CO    	0.00397728
			He    	0.000148137
			Ar    	4.03779e-005
			Cl2   	3.63373e-005
			Kr    	1.93073e-005
		}
	}

	Aurora
	{
		Height      102.692
		NorthLat    68.066
		NorthLon    -128.176
		NorthRadius 1542.51
		NorthWidth  572.007
		NorthRings  3
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -53.9543
		SouthLon    46.3852
		SouthRadius 1232.84
		SouthWidth  447.435
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
		Period          0.00203245
		Eccentricity    0.0182069
		Inclination     0.705318
		AscendingNode   -160.284
		ArgOfPericenter -103.11
		MeanAnomaly     127.065
	}
}

Moon	"8.2"
{
	ParentBody     "8"
	Class	       "Desert"

	Mass            0.0417798
	Radius          2995.58
	InertiaMoment   0.347041

	Oblateness      0.00607172

	Obliquity       -0.356236
	EqAscendNode    -3.79976
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.536 0.533 0.528)

	Surface
	{
		SurfStyle       0.526733
		OceanStyle      0.840438
		Randomize      (-0.372, 0.229, 0.903)
		colorDistMagn   0.0625164
		colorDistFreq   436.263
		detailScale     7704.8
		colorConversion true
		seaLevel        0.118895
		snowLevel       2
		tropicLatitude  0.0124294
		icecapLatitude  0.936877
		icecapHeight    0.122852
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.584043
		venusFreq       0.581631
		venusMagn       0.31319
		mareFreq        2.3234
		mareDensity     0.00725922
		terraceProb     0.100535
		erosion         0
		montesMagn      0.21916
		montesFreq      186.531
		montesSpiky     0.910813
		montesFraction  0.958141
		dunesMagn       0.0220704
		dunesFreq       24.8346
		dunesFraction   0.242323
		hillsMagn       0.123453
		hillsFreq       445.423
		hillsFraction   0
		hills2Fraction  0
		riversMagn      63.848
		riversFreq      2.9559
		riversSin       5.16883
		riversOctaves   0
		canyonsMagn     0.0666999
		canyonsFreq     86.5037
		canyonFraction  0
		cracksMagn      0.0670858
		cracksFreq      0.244574
		cracksOctaves   0
		craterMagn      0.630945
		craterFreq      8.34112
		craterDensity   0.373167
		craterOctaves   4.51356
		volcanoMagn     0.739369
		volcanoFreq     0.74966
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.564248
		volcanoRadius   0.445019
		volcanoTemp     1384.59
		lavaCoverTidal  0.461599
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
		Hapke           0.804136
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
		Height          149.779
		Density         0.0195864
		Pressure        0.0117403
		Greenhouse      0.584324
		Bright          7.21757
		Opacity         1
		SkyLight        2.40586
		Hue             -0.00037707
		Saturation      1

		Composition
		{
			CO2   	84.043
			H2O   	8.34133
			NH3   	3.68161
			SO2   	1.80166
			CH4   	0.77995
			H2S   	0.342916
			C2H4  	0.324199
			C3H8  	0.259532
			C2H2  	0.224471
			N2    	0.177258
			C2H6  	0.0217095
			CO    	0.00217302
			He    	0.000107967
			Ar    	4.84423e-005
			Ne    	4.01902e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00508956
		Period          0.00328821
		Eccentricity    0.0277329
		Inclination     -0.356236
		AscendingNode   -3.79976
		ArgOfPericenter 70.3685
		MeanAnomaly     132.343
	}
}

DwarfMoon	"8.D4"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            1.14446e-009
	Radius          14.7569
	InertiaMoment   0.398589

	Oblateness      0.0122695

	Obliquity       0.360007
	EqAscendNode    151.857
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.606 0.603 0.596)

	Surface
	{
		SurfStyle       0.863119
		OceanStyle      0.856443
		Randomize      (-0.490, 0.161, 0.862)
		colorDistMagn   0.945147
		colorDistFreq   0.0726365
		detailScale     402.962
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00304931
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
		hillsFreq       0.456221
		hillsFraction   0.757954
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.212428
		craterFreq      0.214937
		craterDensity   0.79139
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.465989
		volcanoTemp     1488.95
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.206, 0.211, 0.239, 0.050)
		colorShelf     (0.242, 0.247, 0.274, 0.040)
		colorBeach     (0.279, 0.283, 0.310, 0.030)
		colorDesert    (0.315, 0.319, 0.352, 0.020)
		colorLowland   (0.352, 0.356, 0.388, 0.030)
		colorUpland    (0.388, 0.392, 0.423, 0.050)
		colorRock      (0.424, 0.428, 0.471, 0.020)
		colorSnow      (0.424, 0.428, 0.471, 1.000)
		BumpHeight      13.2812
		BumpOffset      2.65624
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

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

Moon	"8.3"
{
	ParentBody     "8"
	Class	       "Desert"

	Mass            0.0607574
	Radius          3381.03
	InertiaMoment   0.335302

	Obliquity       -1.44027
	EqAscendNode    -31.5337
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.784 0.711 0.623)

	Surface
	{
		SurfStyle       0.652969
		OceanStyle      0.609884
		Randomize      (-0.641, 0.648, 0.962)
		colorDistMagn   0.0790016
		colorDistFreq   398.357
		detailScale     8696.21
		colorConversion true
		seaLevel        0.119251
		snowLevel       2
		tropicLatitude  0.0483639
		icecapLatitude  0.789728
		icecapHeight    0.132994
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.720969
		venusFreq       0.883737
		venusMagn       0
		mareFreq        1.13986
		mareDensity     0.00955672
		terraceProb     0.255953
		erosion         0
		montesMagn      0.220442
		montesFreq      127.696
		montesSpiky     0.906658
		montesFraction  0.39781
		dunesMagn       0.0425519
		dunesFreq       27.5781
		dunesFraction   0.294484
		hillsMagn       0.107111
		hillsFreq       351.847
		hillsFraction   0
		hills2Fraction  0
		riversMagn      59.4249
		riversFreq      3.0305
		riversSin       7.3021
		riversOctaves   0
		canyonsMagn     0.0496153
		canyonsFreq     79.9132
		canyonFraction  0
		cracksMagn      0.0758344
		cracksFreq      0.381779
		cracksOctaves   0
		craterMagn      0.612351
		craterFreq      9.11499
		craterDensity   0.462355
		craterOctaves   6.13173
		volcanoMagn     0.674107
		volcanoFreq     0.685407
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.79808
		volcanoRadius   0.505143
		volcanoTemp     1599
		lavaCoverTidal  0.265491
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
		Hapke           0.838195
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
		Height          140.161
		Density         0.0161805
		Pressure        0.00967803
		Greenhouse      2.23382
		Bright          6.94702
		Opacity         1
		SkyLight        2.31567
		Hue             0
		Saturation      1

		Composition
		{
			CH4   	99.4362
			N2    	0.536803
			C2H4  	0.0134472
			C2H2  	0.00598805
			CO    	0.00583674
			Ar    	0.00062739
			He    	0.00051609
			Ne    	0.000283096
			C2H6  	0.000231182
			CO2   	2.18339e-005
			Kr    	1.926e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00966598
		Period          0.0086061
		Eccentricity    0.0445562
		Inclination     -1.44027
		AscendingNode   -31.5337
		ArgOfPericenter -103.391
		MeanAnomaly     -147.516
	}
}

Moon	"8.4"
{
	ParentBody     "8"
	Class	       "IceWorld"

	Mass            0.0722548
	Radius          3361.56
	InertiaMoment   0.338461

	Obliquity       1.14533
	EqAscendNode    -69.8277
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.722 0.692 0.640)

	Surface
	{
		SurfStyle       0.268426
		OceanStyle      0.588228
		Randomize      (0.227, 0.231, 0.261)
		colorDistMagn   0.0688057
		colorDistFreq   439.342
		detailScale     8646.13
		colorConversion true
		drivenDarkening 0
		seaLevel        0.229328
		snowLevel       2
		tropicLatitude  0.0327778
		icecapLatitude  0.642688
		icecapHeight    0.252719
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.55789
		venusFreq       0.641354
		venusMagn       0.15993
		mareFreq        2.03762
		mareDensity     0.0106906
		terraceProb     0.346396
		erosion         0
		montesMagn      0.197201
		montesFreq      195.645
		montesSpiky     0.927132
		montesFraction  0.529638
		dunesMagn       0.0270879
		dunesFreq       4506.17
		dunesFraction   0.512556
		hillsMagn       0.106301
		hillsFreq       402.54
		hillsFraction   0.502136
		hills2Fraction  0.208056
		riversMagn      53.729
		riversFreq      2.3014
		riversSin       6.0793
		riversOctaves   0
		canyonsMagn     0.600762
		canyonsFreq     1.08352
		canyonFraction  0
		cracksMagn      0.0501302
		cracksFreq      1.6185
		cracksOctaves   2
		craterMagn      0.530167
		craterFreq      9.99276
		craterDensity   0.766793
		craterOctaves   10.2802
		craterRayedFactor 0.151819
		volcanoMagn     0.644759
		volcanoFreq     0.600624
		volcanoDensity  0.188287
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.399616
		volcanoRadius   0.544481
		volcanoTemp     1691.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.722, 0.692, 0.640, 0.500)
		colorShelf     (0.686, 0.657, 0.608, 0.500)
		colorBeach     (0.505, 0.484, 0.448, 0.750)
		colorDesert    (0.614, 0.588, 0.544, 1.000)
		colorLowland   (0.635, 0.609, 0.563, 1.000)
		colorUpland    (0.671, 0.644, 0.595, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.635, 0.609, 0.563, 1.000)
		colorUpPlants  (0.671, 0.644, 0.595, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.912695
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
		Height          52.8302
		Density         0.00873047
		Pressure        0.00269125
		Greenhouse      0.65176
		Bright          6.14055
		Opacity         1
		SkyLight        2.04685
		Hue             0.0228771
		Saturation      1

		Composition
		{
			N2    	50.1699
			H2    	49.6558
			CO    	0.0951519
			He    	0.0387246
			Ar    	0.0372453
			Ne    	0.00257864
			CH4   	0.000633393
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0133207
		Period          0.0139229
		Eccentricity    0.00237395
		Inclination     1.14533
		AscendingNode   -69.8277
		ArgOfPericenter -50.4895
		MeanAnomaly     100.414
	}
}

DwarfMoon	"8.D5"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            3.21167e-009
	Radius          21.9266
	InertiaMoment   0.398745

	Obliquity       71.8739
	EqAscendNode    -166.581
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.648 0.645 0.639)

	Surface
	{
		SurfStyle       0.046244
		OceanStyle      0.570614
		Randomize      (-0.806, 0.087, -0.378)
		colorDistMagn   0.244274
		colorDistFreq   0.242278
		detailScale     598.742
		colorConversion true
		snowLevel       2
		tropicLatitude  0.220698
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.375899
		terraceProb     0.327368
		erosion         0
		montesMagn      0.499297
		montesFreq      3.26873
		montesSpiky     0.821302
		montesFraction  0.578768
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.906819
		hillsFraction   0.570062
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218561
		craterFreq      0.192928
		craterDensity   0.826372
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.551722
		volcanoTemp     1517.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.259, 0.258, 0.256, 0.000)
		colorShelf     (0.275, 0.274, 0.272, 0.000)
		colorBeach     (0.292, 0.290, 0.288, 0.000)
		colorDesert    (0.308, 0.306, 0.304, 0.000)
		colorLowland   (0.324, 0.322, 0.320, 0.000)
		colorUpland    (0.340, 0.339, 0.336, 0.000)
		colorRock      (0.356, 0.355, 0.352, 0.000)
		colorSnow      (0.373, 0.371, 0.368, 1.000)
		BumpHeight      19.7339
		BumpOffset      3.94678
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0624951
		Period          0.141485
		Eccentricity    0.260063
		Inclination     71.8739
		AscendingNode   -166.581
		ArgOfPericenter 90.3632
		MeanAnomaly     25.5811
	}
}

DwarfMoon	"8.D6"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            4.45269e-009
	Radius          23.3419
	InertiaMoment   0.399698

	RotationPeriod  7527.91
	Obliquity       50.7043
	EqAscendNode    75.252

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.554 0.547 0.544)

	Surface
	{
		SurfStyle       0.431294
		OceanStyle      0.437183
		Randomize      (0.779, -0.800, -0.325)
		colorDistMagn   0.498722
		colorDistFreq   0.30592
		detailScale     637.39
		colorConversion true
		snowLevel       2
		tropicLatitude  0.968597
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.640258
		terraceProb     0.340542
		erosion         0
		montesMagn      0.607555
		montesFreq      2.31438
		montesSpiky     0.978301
		montesFraction  0.699151
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.62223
		hillsFraction   0.742894
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213557
		craterFreq      0.242358
		craterDensity   1.03813
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.499808
		volcanoTemp     1464.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.222, 0.219, 0.217, 0.000)
		colorShelf     (0.236, 0.233, 0.231, 0.000)
		colorBeach     (0.250, 0.246, 0.245, 0.000)
		colorDesert    (0.263, 0.260, 0.258, 0.000)
		colorLowland   (0.277, 0.274, 0.272, 0.000)
		colorUpland    (0.291, 0.287, 0.285, 0.000)
		colorRock      (0.305, 0.301, 0.299, 0.000)
		colorSnow      (0.319, 0.315, 0.313, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0629786
		Period          0.14313
		Eccentricity    0.243051
		Inclination     50.7043
		AscendingNode   75.252
		ArgOfPericenter 160.94
		MeanAnomaly     -154.852
	}
}

DwarfMoon	"8.D7"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            6.1351e-009
	Radius          24.9427
	InertiaMoment   0.3976

	Obliquity       -56.5812
	EqAscendNode    64.6331
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.828 0.796 0.757)

	Surface
	{
		SurfStyle       0.0852411
		OceanStyle      0.18007
		Randomize      (-0.253, -0.636, -0.323)
		colorDistMagn   0.44523
		colorDistFreq   0.245052
		detailScale     681.101
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999988
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.699362
		terraceProb     0.495731
		erosion         0
		montesMagn      0.593142
		montesFreq      3.11563
		montesSpiky     0.892478
		montesFraction  0.065237
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.3231
		hillsFraction   0.769394
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256013
		craterFreq      0.21241
		craterDensity   0.956014
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.504274
		volcanoTemp     1339.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.331, 0.318, 0.303, 0.000)
		colorShelf     (0.352, 0.338, 0.322, 0.000)
		colorBeach     (0.373, 0.358, 0.341, 0.000)
		colorDesert    (0.393, 0.378, 0.360, 0.000)
		colorLowland   (0.414, 0.398, 0.379, 0.000)
		colorUpland    (0.435, 0.418, 0.397, 0.000)
		colorRock      (0.456, 0.438, 0.416, 0.000)
		colorSnow      (0.476, 0.457, 0.435, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.063395
		Period          0.144552
		Eccentricity    0.0171559
		Inclination     -56.5812
		AscendingNode   64.6331
		ArgOfPericenter 20.1987
		MeanAnomaly     -24.6594
	}
}

DwarfMoon	"8.D8"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            8.41094e-009
	Radius          25.7254
	InertiaMoment   0.398893

	RotationPeriod  3819.84
	Obliquity       -20.0552
	EqAscendNode    13.8835

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.769 0.736 0.677)

	Surface
	{
		SurfStyle       0.323768
		OceanStyle      0.836543
		Randomize      (0.679, 0.899, 0.611)
		colorDistMagn   0.358442
		colorDistFreq   0.47616
		detailScale     702.475
		colorConversion true
		snowLevel       2
		tropicLatitude  0.640161
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.492531
		terraceProb     0.177225
		erosion         0
		montesMagn      0.547809
		montesFreq      3.02715
		montesSpiky     0.806049
		montesFraction  0.561086
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.949533
		hillsFraction   0.619149
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22547
		craterFreq      0.188526
		craterDensity   0.941998
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.449888
		volcanoTemp     1512.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.308, 0.294, 0.271, 0.000)
		colorShelf     (0.327, 0.313, 0.288, 0.000)
		colorBeach     (0.346, 0.331, 0.305, 0.000)
		colorDesert    (0.365, 0.350, 0.322, 0.000)
		colorLowland   (0.385, 0.368, 0.339, 0.000)
		colorUpland    (0.404, 0.386, 0.355, 0.000)
		colorRock      (0.423, 0.405, 0.372, 0.000)
		colorSnow      (0.442, 0.423, 0.389, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0636005
		Period          0.145255
		Eccentricity    0.23201
		Inclination     -20.0552
		AscendingNode   13.8835
		ArgOfPericenter -3.60582
		MeanAnomaly     106.77
	}
}

DwarfMoon	"8.D9"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            1.14858e-008
	Radius          33.8199
	InertiaMoment   0.399824

	Obliquity       54.4792
	EqAscendNode    -58.3174
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.655 0.649 0.645)

	Surface
	{
		SurfStyle       0.0512609
		OceanStyle      0.322433
		Randomize      (-0.890, 0.248, 0.089)
		colorDistMagn   0.782068
		colorDistFreq   0.508627
		detailScale     923.509
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999946
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.505105
		terraceProb     0.331094
		erosion         0
		montesMagn      0.665975
		montesFreq      3.32828
		montesSpiky     0.994624
		montesFraction  0.764966
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.9655
		hillsFraction   0.491345
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252447
		craterFreq      0.258146
		craterDensity   0.887551
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.432554
		volcanoTemp     1320.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.262, 0.260, 0.258, 0.000)
		colorShelf     (0.278, 0.276, 0.274, 0.000)
		colorBeach     (0.295, 0.292, 0.290, 0.000)
		colorDesert    (0.311, 0.308, 0.306, 0.000)
		colorLowland   (0.327, 0.325, 0.323, 0.000)
		colorUpland    (0.344, 0.341, 0.339, 0.000)
		colorRock      (0.360, 0.357, 0.355, 0.000)
		colorSnow      (0.377, 0.373, 0.371, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0640958
		Period          0.146955
		Eccentricity    0.470778
		Inclination     54.4792
		AscendingNode   -58.3174
		ArgOfPericenter 42.8997
		MeanAnomaly     95.502
	}
}

DwarfMoon	"8.D10"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            1.56387e-008
	Radius          35.6868
	InertiaMoment   0.397839

	Obliquity       78.5201
	EqAscendNode    -131.53
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.511 0.504 0.497)

	Surface
	{
		SurfStyle       0.00163384
		OceanStyle      0.796476
		Randomize      (0.999, 0.243, 0.320)
		colorDistMagn   0.631874
		colorDistFreq   0.843549
		detailScale     974.487
		colorConversion true
		snowLevel       2
		tropicLatitude  0.736567
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.594572
		terraceProb     0.145626
		erosion         0
		montesMagn      0.43482
		montesFreq      3.1304
		montesSpiky     0.976087
		montesFraction  0.630778
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.77141
		hillsFraction   0.664017
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253978
		craterFreq      0.205435
		craterDensity   0.789993
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.507559
		volcanoTemp     1606.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.204, 0.202, 0.199, 0.000)
		colorShelf     (0.217, 0.214, 0.211, 0.000)
		colorBeach     (0.230, 0.227, 0.224, 0.000)
		colorDesert    (0.243, 0.239, 0.236, 0.000)
		colorLowland   (0.256, 0.252, 0.248, 0.000)
		colorUpland    (0.268, 0.264, 0.261, 0.000)
		colorRock      (0.281, 0.277, 0.273, 0.000)
		colorSnow      (0.294, 0.290, 0.286, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0643011
		Period          0.147662
		Eccentricity    0.175629
		Inclination     78.5201
		AscendingNode   -131.53
		ArgOfPericenter 177.824
		MeanAnomaly     61.8073
	}
}

DwarfMoon	"8.D11"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            2.12503e-008
	Radius          37.9693
	InertiaMoment   0.399036

	RotationPeriod  2174.32
	Obliquity       -21.6478
	EqAscendNode    -60.3878

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.619 0.614 0.612)

	Surface
	{
		SurfStyle       0.460756
		OceanStyle      0.229577
		Randomize      (-0.188, -0.979, -0.499)
		colorDistMagn   0.13391
		colorDistFreq   0.72729
		detailScale     1036.81
		colorConversion true
		snowLevel       2
		tropicLatitude  0.604417
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.664674
		terraceProb     0.106227
		erosion         0
		montesMagn      0.532663
		montesFreq      2.56957
		montesSpiky     0.998907
		montesFraction  0.419332
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.88042
		hillsFraction   0.688262
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264384
		craterFreq      0.214669
		craterDensity   0.879279
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.526572
		volcanoTemp     1445.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.247, 0.246, 0.245, 0.000)
		colorShelf     (0.263, 0.261, 0.260, 0.000)
		colorBeach     (0.278, 0.277, 0.276, 0.000)
		colorDesert    (0.294, 0.292, 0.291, 0.000)
		colorLowland   (0.309, 0.307, 0.306, 0.000)
		colorUpland    (0.325, 0.323, 0.322, 0.000)
		colorRock      (0.340, 0.338, 0.337, 0.000)
		colorSnow      (0.356, 0.353, 0.352, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.064639
		Period          0.148827
		Eccentricity    0.279164
		Inclination     -21.6478
		AscendingNode   -60.3878
		ArgOfPericenter 120.182
		MeanAnomaly     51.995
	}
}

DwarfMoon	"8.D12"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            2.88431e-008
	Radius          39.6449
	InertiaMoment   0.399949

	Obliquity       42.153
	EqAscendNode    -92.3368
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.715 0.661 0.604)

	Surface
	{
		SurfStyle       0.0171121
		OceanStyle      0.72143
		Randomize      (-0.614, -0.970, -0.360)
		colorDistMagn   0.233234
		colorDistFreq   1.06715
		detailScale     1082.57
		colorConversion true
		snowLevel       2
		tropicLatitude  0.823047
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.576028
		terraceProb     0.238233
		erosion         0
		montesMagn      0.538813
		montesFreq      4.048
		montesSpiky     0.961627
		montesFraction  0.535445
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.60797
		hillsFraction   0.620029
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251477
		craterFreq      0.245971
		craterDensity   0.983781
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.514551
		volcanoTemp     1822.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.286, 0.264, 0.242, 0.000)
		colorShelf     (0.304, 0.281, 0.257, 0.000)
		colorBeach     (0.322, 0.297, 0.272, 0.000)
		colorDesert    (0.340, 0.314, 0.287, 0.000)
		colorLowland   (0.358, 0.330, 0.302, 0.000)
		colorUpland    (0.375, 0.347, 0.317, 0.000)
		colorRock      (0.393, 0.364, 0.332, 0.000)
		colorSnow      (0.411, 0.380, 0.347, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0651974
		Period          0.15076
		Eccentricity    0.194293
		Inclination     42.153
		AscendingNode   -92.3368
		ArgOfPericenter 3.96206
		MeanAnomaly     101.006
	}
}

DwarfMoon	"8.D13"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            3.91387e-008
	Radius          51.385
	InertiaMoment   0.398051

	Obliquity       65.8222
	EqAscendNode    -144.412
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.410 0.407 0.405)

	Surface
	{
		SurfStyle       0.928138
		OceanStyle      0.0102326
		Randomize      (0.320, 0.273, -0.215)
		colorDistMagn   0.449769
		colorDistFreq   1.18824
		detailScale     1403.15
		colorConversion true
		snowLevel       2
		tropicLatitude  0.535473
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.595598
		terraceProb     0.332463
		erosion         0
		montesMagn      0.503298
		montesFreq      3.72417
		montesSpiky     0.902928
		montesFraction  0.456674
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.30244
		hillsFraction   0.817362
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237346
		craterFreq      0.223702
		craterDensity   0.913395
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.492325
		volcanoTemp     1317.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.140, 0.142, 0.162, 0.050)
		colorShelf     (0.164, 0.167, 0.186, 0.040)
		colorBeach     (0.189, 0.191, 0.210, 0.030)
		colorDesert    (0.213, 0.216, 0.239, 0.020)
		colorLowland   (0.238, 0.240, 0.263, 0.030)
		colorUpland    (0.263, 0.265, 0.287, 0.050)
		colorRock      (0.287, 0.289, 0.320, 0.020)
		colorSnow      (0.287, 0.289, 0.320, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0656378
		Period          0.15229
		Eccentricity    0.0246433
		Inclination     65.8222
		AscendingNode   -144.412
		ArgOfPericenter 138.063
		MeanAnomaly     109.832
	}
}

DwarfMoon	"8.D14"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            5.31412e-008
	Radius          53.9711
	InertiaMoment   0.399174

	RotationPeriod  8123.11
	Obliquity       84.1195
	EqAscendNode    91.5185

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.538 0.480 0.418)

	Surface
	{
		SurfStyle       0.749363
		OceanStyle      0.434397
		Randomize      (0.363, 0.100, 0.783)
		colorDistMagn   0.740893
		colorDistFreq   1.84413
		detailScale     1473.77
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999326
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
		hillsFreq       5.99205
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
		colorSea       (0.210, 0.163, 0.117, 0.000)
		colorShelf     (0.215, 0.168, 0.134, 0.000)
		colorBeach     (0.253, 0.197, 0.159, 0.000)
		colorDesert    (0.274, 0.211, 0.155, 0.000)
		colorLowland   (0.301, 0.226, 0.176, 0.000)
		colorUpland    (0.333, 0.274, 0.213, 0.000)
		colorRock      (0.360, 0.298, 0.230, 0.000)
		colorSnow      (0.392, 0.317, 0.243, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.066256
		Period          0.154447
		Eccentricity    0.178946
		Inclination     84.1195
		AscendingNode   91.5185
		ArgOfPericenter -127.503
		MeanAnomaly     152.295
	}
}

DwarfMoon	"8.D15"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            7.22597e-008
	Radius          57.4326
	InertiaMoment   0.395651

	Obliquity       -18.645
	EqAscendNode    161.933
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.614 0.527 0.398)

	Surface
	{
		SurfStyle       0.957771
		OceanStyle      0.620718
		Randomize      (-0.974, -0.236, 0.174)
		colorDistMagn   0.666468
		colorDistFreq   1.93046
		detailScale     1568.29
		colorConversion true
		snowLevel       2
		tropicLatitude  0.100269
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
		hillsFreq       7.52719
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
		colorSea       (0.209, 0.185, 0.159, 0.050)
		colorShelf     (0.246, 0.216, 0.183, 0.040)
		colorBeach     (0.283, 0.248, 0.207, 0.030)
		colorDesert    (0.319, 0.279, 0.235, 0.020)
		colorLowland   (0.356, 0.311, 0.259, 0.030)
		colorUpland    (0.393, 0.343, 0.282, 0.050)
		colorRock      (0.430, 0.374, 0.314, 0.020)
		colorSnow      (0.430, 0.374, 0.314, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0664572
		Period          0.155151
		Eccentricity    0.225693
		Inclination     -18.645
		AscendingNode   161.933
		ArgOfPericenter -62.5858
		MeanAnomaly     -1.14723
	}
}

DwarfMoon	"8.D16"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            9.84902e-008
	Radius          60.4846
	InertiaMoment   0.398243

	RotationPeriod  4131.22
	Obliquity       66.646
	EqAscendNode    -110.866

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.756 0.675 0.640)

	Surface
	{
		SurfStyle       0.0635085
		OceanStyle      0.735394
		Randomize      (-0.134, 0.927, -0.146)
		colorDistMagn   0.8114
		colorDistFreq   2.32797
		detailScale     1651.63
		colorConversion true
		snowLevel       2
		tropicLatitude  0.889284
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
		hillsFreq       10.9106
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
		colorSea       (0.302, 0.270, 0.256, 0.000)
		colorShelf     (0.321, 0.287, 0.272, 0.000)
		colorBeach     (0.340, 0.304, 0.288, 0.000)
		colorDesert    (0.359, 0.321, 0.304, 0.000)
		colorLowland   (0.378, 0.338, 0.320, 0.000)
		colorUpland    (0.397, 0.355, 0.336, 0.000)
		colorRock      (0.416, 0.371, 0.352, 0.000)
		colorSnow      (0.435, 0.388, 0.368, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0670115
		Period          0.157096
		Eccentricity    0.18248
		Inclination     66.646
		AscendingNode   -110.866
		ArgOfPericenter 13.6461
		MeanAnomaly     -25.2336
	}
}

Barycenter	"9-9.1"
{
	ParentBody     "Dellalt System"
	Mass            0.0125457
	Radius          1685.65
	RotationPeriod  24
	Obliquity       0
	EqAscendNode    0


	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.29201
		Period          8.91796
		Eccentricity    0.00435374
		Inclination     -0.405951
		AscendingNode   164.372
		ArgOfPericenter 14.3833
		MeanAnomaly     135.626
	}
}

DwarfPlanet	"9"
{
	ParentBody     "9-9.1"
	Class	       "IceWorld"

	Mass            0.0116914
	Radius          1977.84
	InertiaMoment   0.379055

	Obliquity       -1.43201
	EqAscendNode    105.341
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.584 0.579 0.578)

	Surface
	{
		SurfStyle       0.499104
		OceanStyle      0.811144
		Randomize      (0.069, -0.118, 0.004)
		colorDistMagn   0.0879837
		colorDistFreq   218.438
		detailScale     5087.12
		colorConversion true
		drivenDarkening 0
		seaLevel        0.17529
		snowLevel       2
		tropicLatitude  0.0303054
		icecapLatitude  0.65178
		icecapHeight    0.194833
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.84439
		venusFreq       0.913877
		venusMagn       0
		mareFreq        1.08863
		mareDensity     0.00242457
		terraceProb     0.852946
		erosion         0
		montesMagn      0.110705
		montesFreq      81.5441
		montesSpiky     0.993568
		montesFraction  0.876668
		dunesMagn       0.0319106
		dunesFreq       2558.23
		dunesFraction   0.669529
		hillsMagn       0.133799
		hillsFreq       222.557
		hillsFraction   0.0464446
		hills2Fraction  0.115855
		riversMagn      59.3833
		riversFreq      3.50835
		riversSin       6.35217
		riversOctaves   0
		canyonsMagn     0.451907
		canyonsFreq     0.770772
		canyonFraction  0
		cracksMagn      0.0452505
		cracksFreq      1.01225
		cracksOctaves   1
		craterMagn      0.599977
		craterFreq      5.50428
		craterDensity   0.841231
		craterOctaves   11
		craterRayedFactor 0.0876574
		volcanoMagn     0.267768
		volcanoFreq     0.668956
		volcanoDensity  0.259397
		volcanoOctaves  3
		volcanoActivity 0.00458708
		volcanoFlows    0.235424
		volcanoRadius   0.262523
		volcanoTemp     1453.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.175, 0.145, 0.127, 0.000)
		colorShelf     (0.216, 0.180, 0.162, 0.000)
		colorBeach     (0.327, 0.272, 0.243, 0.200)
		colorDesert    (0.298, 0.255, 0.214, 0.500)
		colorLowland   (0.228, 0.197, 0.162, 0.800)
		colorUpland    (0.386, 0.347, 0.300, 1.000)
		colorRock      (0.670, 0.620, 0.550, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.228, 0.197, 0.162, 0.800)
		colorUpPlants  (0.386, 0.347, 0.300, 1.000)
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

	Atmosphere
	{
		Model          "Sun"
		Height          98.892
		Density         1.16352e-008
		Pressure        1.39424e-009
		Greenhouse      0.000707759
		Bright          0.5
		Opacity         0
		SkyLight        0.166667
		Hue             0.0150868
		Saturation      1

		Composition
		{
			N2    	76.476
			Ne    	23.5226
			Ar    	0.00139913
			CO    	2.46041e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.72444e-005
		Period          0.0208082
		Eccentricity    0.0450854
		Inclination     -1.43201
		AscendingNode   105.341
		ArgOfPericenter 155.714
		MeanAnomaly     -168.173
	}
}

Moon	"9.1"
{
	ParentBody     "9-9.1"
	Class	       "IceWorld"

	Mass            0.000854294
	Radius          785.511
	InertiaMoment   0.398129

	Obliquity       -1.43201
	EqAscendNode    105.341
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.572 0.561 0.556)

	Surface
	{
		SurfStyle       0.110694
		OceanStyle      0.526895
		Randomize      (-0.444, 0.301, -0.410)
		colorDistMagn   0.0555366
		colorDistFreq   93.0898
		detailScale     2020.38
		colorConversion true
		drivenDarkening 0
		seaLevel        0.191518
		snowLevel       2
		tropicLatitude  0.0303054
		icecapLatitude  0.791302
		icecapHeight    0.210067
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.92898
		venusFreq       1.303
		venusMagn       0
		mareFreq        0.110742
		mareDensity     0.000593862
		terraceProb     0.184591
		erosion         0
		montesMagn      0.0689632
		montesFreq      38.7059
		montesSpiky     0.88235
		montesFraction  0.70982
		dunesMagn       0.0445056
		dunesFreq       1049.91
		dunesFraction   0.960357
		hillsMagn       0.113645
		hillsFreq       86.9035
		hillsFraction   0.0407344
		hills2Fraction  0.194222
		riversMagn      65.4346
		riversFreq      2.21639
		riversSin       8.11654
		riversOctaves   0
		canyonsMagn     0.604581
		canyonsFreq     0.297787
		canyonFraction  0
		cracksMagn      0.0746396
		cracksFreq      0.506023
		cracksOctaves   0
		craterMagn      0.619384
		craterFreq      2.18626
		craterDensity   0.773689
		craterOctaves   10
		craterRayedFactor 0.0560917
		volcanoMagn     0.176476
		volcanoFreq     0.55663
		volcanoDensity  0.272341
		volcanoOctaves  3
		volcanoActivity 0.133126
		volcanoFlows    0.243528
		volcanoRadius   0.132316
		volcanoTemp     1462.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.572, 0.561, 0.556, 0.500)
		colorShelf     (0.544, 0.533, 0.529, 0.500)
		colorBeach     (0.401, 0.393, 0.389, 0.750)
		colorDesert    (0.487, 0.477, 0.473, 1.000)
		colorLowland   (0.504, 0.494, 0.490, 1.000)
		colorUpland    (0.532, 0.522, 0.517, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.504, 0.494, 0.490, 1.000)
		colorUpPlants  (0.532, 0.522, 0.517, 1.000)
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
		SemiMajorAxis   0.000235997
		Period          0.0208082
		Eccentricity    0.0450854
		Inclination     -1.43201
		AscendingNode   105.341
		ArgOfPericenter -24.2858
		MeanAnomaly     -168.173
	}
}

Planet	"10"
{
	ParentBody     "Dellalt System"
	Class	       "IceGiant"

	Mass            67.1611
	Radius          29931.2
	InertiaMoment   0.202385

	Oblateness      0.0400881

	RotationPeriod  6.87007
	Obliquity       39.7638
	EqAscendNode    77.4774

	AlbedoBond      0.413961
	AlbedoGeom      0.496753
	Brightness      2

	Surface
	{
		SurfStyle       0.757617
		Randomize      (0.945, -0.079, 0.760)
		detailScale     76984.7
		colorConversion true
		tropicLatitude  0.644731
		icecapLatitude  1
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     6.62875
		stripeFluct     0.348214
		stripeTwist     11.7622
		cycloneMagn     7.49898
		cycloneFreq     0.770944
		cycloneDensity  0.394489
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
		BumpHeight      11.4525
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          25.6523
		Velocity        -238.802
		BumpHeight      14.2
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.40314
		mainOctaves     12
		Coverage        0.0698045
		stripeZones     6.62875
		stripeFluct     0.348214
		stripeTwist     11.7622
	}

	Clouds
	{
		Height          39.8516
		Velocity        1582.77
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		ModulateColor  (1.000 1.000 1.000 0.800)
		mainFreq        1.40314
		mainOctaves     12
		Coverage        0.0698045
		stripeZones     6.62875
		stripeFluct     0.348214
		stripeTwist     11.7622
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          153.452
		Density         11901
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.0107675
		Saturation      0.719187

		Composition
		{
			H2    	93.0324
			He    	6.96652
			Ne    	0.00103521
			N2    	2.89008e-005
		}
	}

	Aurora
	{
		Height      725.799
		NorthLat    69.6741
		NorthLon    14.2488
		NorthRadius 8998.05
		NorthWidth  3283.89
		NorthRings  3
		NorthBright 1
		NorthParticles 10000
		SouthLat    -48.3983
		SouthLon    176.16
		SouthRadius 6450.2
		SouthWidth  2079.25
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
		SemiMajorAxis   3.53477
		Period          17.0685
		Eccentricity    0.0255502
		Inclination     2.40484
		AscendingNode   82.2882
		ArgOfPericenter 116.483
		MeanAnomaly     307.207
	}
}

DwarfMoon	"10.D1"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            8.24584e-010
	Radius          13.6451
	InertiaMoment   0.397951

	Oblateness      0.249

	Obliquity       -0.00611475
	EqAscendNode    -109.842
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.598 0.594 0.592)

	Surface
	{
		SurfStyle       0.435997
		OceanStyle      0.67117
		Randomize      (-0.512, 0.310, 0.385)
		colorDistMagn   0.321515
		colorDistFreq   0.129258
		detailScale     372.602
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.418818
		terraceProb     0.225808
		erosion         0
		montesMagn      0.544808
		montesFreq      2.42885
		montesSpiky     0.987942
		montesFraction  0.291149
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.563026
		hillsFraction   0.629847
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237603
		craterFreq      0.228491
		craterDensity   0.879067
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.45406
		volcanoTemp     1361.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.239, 0.238, 0.237, 0.000)
		colorShelf     (0.254, 0.253, 0.252, 0.000)
		colorBeach     (0.269, 0.267, 0.266, 0.000)
		colorDesert    (0.284, 0.282, 0.281, 0.000)
		colorLowland   (0.299, 0.297, 0.296, 0.000)
		colorUpland    (0.314, 0.312, 0.311, 0.000)
		colorRock      (0.329, 0.327, 0.325, 0.000)
		colorSnow      (0.344, 0.342, 0.340, 1.000)
		BumpHeight      12.2806
		BumpOffset      2.45612
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000571359
		Period          0.000963794
		Eccentricity    8.23733e-005
		Inclination     -0.00611475
		AscendingNode   -109.842
		ArgOfPericenter -94.0413
		MeanAnomaly     145.659
	}
}

DwarfMoon	"10.D2"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            1.18877e-009
	Radius          14.7866
	InertiaMoment   0.399108

	Oblateness      0.249

	Obliquity       0.0115474
	EqAscendNode    62.8619
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.482 0.408 0.329)

	Surface
	{
		SurfStyle       0.483194
		OceanStyle      0.333373
		Randomize      (-0.070, 0.037, 0.680)
		colorDistMagn   0.353777
		colorDistFreq   0.0989421
		detailScale     403.774
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.316971
		terraceProb     0.444437
		erosion         0
		montesMagn      0.512341
		montesFreq      2.8408
		montesSpiky     0.884408
		montesFraction  0.650552
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.516664
		hillsFraction   0.652996
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241459
		craterFreq      0.231492
		craterDensity   0.907876
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.536464
		volcanoTemp     1147.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.193, 0.163, 0.132, 0.000)
		colorShelf     (0.205, 0.173, 0.140, 0.000)
		colorBeach     (0.217, 0.184, 0.148, 0.000)
		colorDesert    (0.229, 0.194, 0.156, 0.000)
		colorLowland   (0.241, 0.204, 0.165, 0.000)
		colorUpland    (0.253, 0.214, 0.173, 0.000)
		colorRock      (0.265, 0.224, 0.181, 0.000)
		colorSnow      (0.277, 0.235, 0.189, 1.000)
		BumpHeight      13.308
		BumpOffset      2.6616
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000603419
		Period          0.00104604
		Eccentricity    4.55446e-005
		Inclination     0.0115474
		AscendingNode   62.8619
		ArgOfPericenter 91.0226
		MeanAnomaly     -98.8249
	}
}

DwarfMoon	"10.D3"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            1.69201e-009
	Radius          15.9167
	InertiaMoment   0.394447

	Oblateness      0.2348

	Obliquity       -0.0140316
	EqAscendNode    -122.031
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.772 0.769 0.766)

	Surface
	{
		SurfStyle       0.647231
		OceanStyle      0.0753134
		Randomize      (-0.769, 0.800, -0.481)
		colorDistMagn   0.993715
		colorDistFreq   0.158718
		detailScale     434.633
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.412493
		terraceProb     0.344754
		erosion         0
		montesMagn      0.349921
		montesFreq      3.36126
		montesSpiky     0.94277
		montesFraction  0.367217
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.665735
		hillsFraction   0.698907
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2506
		craterFreq      0.244891
		craterDensity   0.846839
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.597503
		volcanoTemp     1275.95
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.301, 0.262, 0.215, 0.000)
		colorShelf     (0.309, 0.269, 0.245, 0.000)
		colorBeach     (0.363, 0.315, 0.291, 0.000)
		colorDesert    (0.394, 0.339, 0.283, 0.000)
		colorLowland   (0.432, 0.362, 0.322, 0.000)
		colorUpland    (0.479, 0.439, 0.391, 0.000)
		colorRock      (0.517, 0.477, 0.421, 0.000)
		colorSnow      (0.564, 0.508, 0.444, 1.000)
		BumpHeight      14.3251
		BumpOffset      2.86501
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000628391
		Period          0.00111164
		Eccentricity    1.03951e-005
		Inclination     -0.0140316
		AscendingNode   -122.031
		ArgOfPericenter 90.6994
		MeanAnomaly     129.771
	}
}

DwarfMoon	"10.D4"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            2.38268e-009
	Radius          21.1436
	InertiaMoment   0.398152

	Oblateness      0.249

	Obliquity       -0.0147721
	EqAscendNode    -141.114
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.732 0.729 0.728)

	Surface
	{
		SurfStyle       0.260035
		OceanStyle      0.278203
		Randomize      (-0.791, -0.583, 0.893)
		colorDistMagn   0.488694
		colorDistFreq   0.167059
		detailScale     577.361
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.386533
		terraceProb     0.503007
		erosion         0
		montesMagn      0.484742
		montesFreq      2.98718
		montesSpiky     0.984845
		montesFraction  0.531361
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.21601
		hillsFraction   0.420547
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255777
		craterFreq      0.20598
		craterDensity   0.796322
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.501279
		volcanoTemp     1587.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.293, 0.292, 0.291, 0.000)
		colorShelf     (0.311, 0.310, 0.309, 0.000)
		colorBeach     (0.329, 0.328, 0.328, 0.000)
		colorDesert    (0.348, 0.346, 0.346, 0.000)
		colorLowland   (0.366, 0.365, 0.364, 0.000)
		colorUpland    (0.384, 0.383, 0.382, 0.000)
		colorRock      (0.402, 0.401, 0.400, 0.000)
		colorSnow      (0.421, 0.419, 0.419, 1.000)
		BumpHeight      19.0292
		BumpOffset      3.80585
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000678243
		Period          0.00124652
		Eccentricity    7.30949e-005
		Inclination     -0.0147721
		AscendingNode   -141.114
		ArgOfPericenter 150.783
		MeanAnomaly     -140.883
	}
}

Moon	"10.1"
{
	ParentBody     "10"
	Class	       "Selena"

	Mass            0.00142976
	Radius          989.721
	InertiaMoment   0.398699

	Oblateness      0.0168899

	Obliquity       1.30036
	EqAscendNode    37.1102
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.633 0.543 0.386)

	Surface
	{
		SurfStyle       0.86132
		OceanStyle      0.783737
		Randomize      (-0.351, 0.822, -0.163)
		colorDistMagn   0.0840225
		colorDistFreq   130.604
		detailScale     2545.62
		colorConversion true
		drivenDarkening 0
		seaLevel        0.139084
		snowLevel       2
		tropicLatitude  0.0430184
		icecapLatitude  0.797482
		icecapHeight    0.149356
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.95339
		venusFreq       1.64219
		venusMagn       0
		mareFreq        0.302804
		mareDensity     0.000645379
		terraceProb     0.465747
		erosion         0
		montesMagn      0.0637197
		montesFreq      37.7022
		montesSpiky     0.903714
		montesFraction  0.256411
		dunesMagn       0.0491969
		dunesFreq       1317.52
		dunesFraction   0.732073
		hillsMagn       0.138857
		hillsFreq       115.66
		hillsFraction   0.344038
		hills2Fraction  0
		riversMagn      60.3066
		riversFreq      2.15494
		riversSin       4.57089
		riversOctaves   0
		canyonsMagn     0.27517
		canyonsFreq     0.360775
		canyonFraction  0.545994
		cracksMagn      0.0605268
		cracksFreq      0.667551
		cracksOctaves   0
		craterMagn      0.501768
		craterFreq      2.33344
		craterDensity   0.694801
		craterOctaves   7.91224
		craterRayedFactor 0.112177
		volcanoMagn     0.179513
		volcanoFreq     0.819994
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.104279
		volcanoRadius   0.125257
		volcanoTemp     1194.31
		lavaCoverTidal  0.231973
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.400, 0.350, 0.320, 0.000)
		colorShelf     (0.470, 0.410, 0.380, 0.000)
		colorBeach     (0.354, 0.255, 0.162, 0.000)
		colorDesert    (0.323, 0.239, 0.143, 0.000)
		colorLowland   (0.247, 0.185, 0.108, 0.000)
		colorUpland    (0.418, 0.326, 0.201, 0.000)
		colorRock      (0.670, 0.620, 0.550, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.993903
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
		Height          49.4861
		Density         0.000609671
		Pressure        0.000205438
		Greenhouse      0.0699922
		Bright          3.60595
		Opacity         0
		SkyLight        1.20198
		Hue             0.0432111
		Saturation      1

		Composition
		{
			CO2   	98.5409
			H2S   	0.640386
			C2H2  	0.238446
			C2H6  	0.199515
			NH3   	0.179245
			SO2   	0.0905794
			CH4   	0.0677363
			C2H4  	0.0227249
			N2    	0.0169478
			C3H8  	0.0031334
			H2O   	0.000180792
			Ar    	0.000165273
			CO    	1.63746e-005
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
		Period          0.00222854
		Eccentricity    0.023353
		Inclination     1.30036
		AscendingNode   37.1102
		ArgOfPericenter 107.44
		MeanAnomaly     60.3714
	}
}

Moon	"10.2"
{
	ParentBody     "10"
	Class	       "Desert"

	Mass            0.0167842
	Radius          2094.4
	InertiaMoment   0.365308

	Oblateness      0.00410067

	Obliquity       0.488405
	EqAscendNode    -35.8948
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.431 0.428 0.425)

	Surface
	{
		SurfStyle       0.27665
		OceanStyle      0.64774
		Randomize      (0.460, 0.216, 0.954)
		colorDistMagn   0.0487342
		colorDistFreq   288.654
		detailScale     5386.93
		colorConversion true
		seaLevel        0.128558
		snowLevel       2
		tropicLatitude  0.0162197
		icecapLatitude  0.840976
		icecapHeight    0.136536
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.12294
		venusFreq       1.05201
		venusMagn       0.524757
		mareFreq        0.868668
		mareDensity     0.00491671
		terraceProb     0.360394
		erosion         0
		montesMagn      0.146533
		montesFreq      69.6114
		montesSpiky     0.811949
		montesFraction  0.438642
		dunesMagn       0.0428996
		dunesFreq       25.3663
		dunesFraction   0.646155
		hillsMagn       0.121694
		hillsFreq       223.435
		hillsFraction   0
		hills2Fraction  0
		riversMagn      58.0853
		riversFreq      2.10562
		riversSin       6.39603
		riversOctaves   0
		canyonsMagn     0.0333967
		canyonsFreq     47.6171
		canyonFraction  0
		cracksMagn      0.133119
		cracksFreq      0.159094
		cracksOctaves   0
		craterMagn      0.639989
		craterFreq      4.82219
		craterDensity   0.529739
		craterOctaves   6.68361
		volcanoMagn     0.41769
		volcanoFreq     0.810504
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.443255
		volcanoRadius   0.295616
		volcanoTemp     1818.09
		lavaCoverTidal  0.386226
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
		Hapke           0.973874
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
		Height          104.72
		Density         0.0026126
		Pressure        0.0016069
		Greenhouse      0.222862
		Bright          4.82408
		Opacity         1
		SkyLight        1.60803
		Hue             0
		Saturation      1

		Composition
		{
			CO2   	52.0432
			NH3   	16.6186
			CH4   	11.7676
			C2H2  	8.14835
			H2S   	8.12302
			H2O   	2.02484
			SO2   	0.970113
			C2H6  	0.135453
			N2    	0.0793671
			C2H4  	0.0622331
			C3H8  	0.0253743
			Ar    	0.00160059
			He    	9.44245e-005
			CO    	7.22183e-005
			Cl2   	4.70802e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00143049
		Period          0.00381761
		Eccentricity    0.0467976
		Inclination     0.488405
		AscendingNode   -35.8948
		ArgOfPericenter -3.54562
		MeanAnomaly     25.7682
	}
}

Moon	"10.3"
{
	ParentBody     "10"
	Class	       "Selena"

	Mass            0.00196177
	Radius          1098.86
	InertiaMoment   0.397124

	Oblateness      0.00194399

	Obliquity       0.0614313
	EqAscendNode    -168.211
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.475 0.473 0.469)

	Surface
	{
		SurfStyle       0.462172
		OceanStyle      0.304563
		Randomize      (-0.619, -0.201, -0.138)
		colorDistMagn   0.0472968
		colorDistFreq   118.602
		detailScale     2826.34
		colorConversion true
		drivenDarkening 0
		seaLevel        0.1418
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  0.972797
		icecapHeight    0.14279
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.02606
		venusFreq       0.728474
		venusMagn       0
		mareFreq        0.363137
		mareDensity     0.000728976
		terraceProb     0.325456
		erosion         0
		montesMagn      0.0761155
		montesFreq      61.9436
		montesSpiky     0.863478
		montesFraction  0.47034
		dunesMagn       0.0425712
		dunesFreq       1412.87
		dunesFraction   0.931156
		hillsMagn       0.133933
		hillsFreq       140.197
		hillsFraction   0.870173
		hills2Fraction  0
		riversMagn      70.1888
		riversFreq      3.28412
		riversSin       4.05784
		riversOctaves   0
		canyonsMagn     0.45258
		canyonsFreq     0.478701
		canyonFraction  0.725716
		cracksMagn      0.0464863
		cracksFreq      0.514421
		cracksOctaves   0
		craterMagn      0.66534
		craterFreq      3.62111
		craterDensity   0.857857
		craterOctaves   9.9599
		craterRayedFactor 0.147585
		volcanoMagn     0.212979
		volcanoFreq     0.500054
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.354747
		volcanoRadius   0.146288
		volcanoTemp     1142.46
		lavaCoverTidal  0.00445521
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.420, 0.420, 0.430, 0.000)
		colorShelf     (0.470, 0.480, 0.480, 0.000)
		colorBeach     (0.262, 0.269, 0.281, 0.000)
		colorDesert    (0.228, 0.217, 0.216, 0.000)
		colorLowland   (0.290, 0.288, 0.263, 0.000)
		colorUpland    (0.309, 0.307, 0.286, 0.000)
		colorRock      (0.340, 0.340, 0.340, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.99988
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
		Height          82.4149
		Density         1.19636e-005
		Pressure        2.46565e-006
		Greenhouse      0.0224705
		Bright          1.64275
		Opacity         0
		SkyLight        0.547584
		Hue             -0.0412861
		Saturation      1

		Composition
		{
			N2    	68.3336
			CH4   	31.4355
			Ar    	0.163743
			CO    	0.037421
			Ne    	0.029586
			O2    	0.000126814
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
		Period          0.00654124
		Eccentricity    0.0306361
		Inclination     0.0614313
		AscendingNode   -168.211
		ArgOfPericenter -94.297
		MeanAnomaly     -157.036
	}
}

Moon	"10.4"
{
	ParentBody     "10"
	Class	       "IceWorld"

	Mass            0.00228508
	Radius          1087.63
	InertiaMoment   0.39992

	Obliquity       0.882262
	EqAscendNode    -64.4886
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.469 0.391 0.368)

	Surface
	{
		SurfStyle       0.285754
		OceanStyle      0.253305
		Randomize      (0.757, -0.151, 0.798)
		colorDistMagn   0.0556655
		colorDistFreq   143.629
		detailScale     2797.46
		colorConversion true
		drivenDarkening 0.7
		seaLevel        0.180465
		snowLevel       2
		tropicLatitude  0.0260443
		icecapLatitude  0.729574
		icecapHeight    0.198373
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.58899
		venusFreq       0.785184
		venusMagn       0
		mareFreq        0.364401
		mareDensity     0.000640925
		terraceProb     0.282108
		erosion         0
		montesMagn      0.0529003
		montesFreq      43.4117
		montesSpiky     0.83256
		montesFraction  0.669297
		dunesMagn       0.0501794
		dunesFreq       1442.94
		dunesFraction   0.261371
		hillsMagn       0.122016
		hillsFreq       133.881
		hillsFraction   0.214476
		hills2Fraction  0.205803
		riversMagn      59.8943
		riversFreq      3.54359
		riversSin       8.27032
		riversOctaves   0
		canyonsMagn     0.543547
		canyonsFreq     0.380109
		canyonFraction  0
		cracksMagn      0.0455113
		cracksFreq      0.486106
		cracksOctaves   0
		craterMagn      0.559993
		craterFreq      3.63767
		craterDensity   0.962502
		craterOctaves   10
		craterRayedFactor 0.0504811
		volcanoMagn     0.183257
		volcanoFreq     0.613126
		volcanoDensity  0.21202
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.197128
		volcanoRadius   0.127511
		volcanoTemp     1538.14
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.469, 0.391, 0.368, 0.500)
		colorShelf     (0.445, 0.371, 0.350, 0.500)
		colorBeach     (0.328, 0.274, 0.258, 0.750)
		colorDesert    (0.399, 0.332, 0.313, 1.000)
		colorLowland   (0.413, 0.344, 0.324, 1.000)
		colorUpland    (0.436, 0.363, 0.342, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.413, 0.344, 0.324, 1.000)
		colorUpPlants  (0.436, 0.363, 0.342, 1.000)
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
		SemiMajorAxis   0.00293254
		Period          0.0112068
		Eccentricity    0.0110882
		Inclination     0.882262
		AscendingNode   -64.4886
		ArgOfPericenter 23.1404
		MeanAnomaly     -114.415
	}
}

Moon	"10.5"
{
	ParentBody     "10"
	Class	       "IceWorld"

	Mass            0.00265464
	Radius          1214.34
	InertiaMoment   0.399456

	Obliquity       -0.226329
	EqAscendNode    -110.029
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.831 0.732 0.650)

	Surface
	{
		SurfStyle       0.474364
		OceanStyle      0.546978
		Randomize      (0.810, -0.953, 0.738)
		colorDistMagn   0.0866117
		colorDistFreq   116.955
		detailScale     3123.34
		colorConversion true
		drivenDarkening 0
		seaLevel        0.243642
		snowLevel       2
		tropicLatitude  0.00452812
		icecapLatitude  0.808701
		icecapHeight    0.25949
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.8214
		venusFreq       1.37988
		venusMagn       0.251498
		mareFreq        0.463654
		mareDensity     0.000636438
		terraceProb     0.348171
		erosion         0
		montesMagn      0.0648997
		montesFreq      55.1206
		montesSpiky     0.888018
		montesFraction  0.604645
		dunesMagn       0.0437543
		dunesFreq       1619.8
		dunesFraction   0.0737917
		hillsMagn       0.134216
		hillsFreq       139.746
		hillsFraction   0.432473
		hills2Fraction  0.225346
		riversMagn      56.2276
		riversFreq      2.50785
		riversSin       7.76059
		riversOctaves   0
		canyonsMagn     0.513043
		canyonsFreq     0.48415
		canyonFraction  0
		cracksMagn      0.0439317
		cracksFreq      0.250947
		cracksOctaves   0
		craterMagn      0.531834
		craterFreq      3.56168
		craterDensity   0.854422
		craterOctaves   10
		craterRayedFactor 0.178606
		volcanoMagn     0.197968
		volcanoFreq     0.521721
		volcanoDensity  0.16974
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.122196
		volcanoRadius   0.155629
		volcanoTemp     1714.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.249, 0.183, 0.143, 0.000)
		colorShelf     (0.308, 0.227, 0.182, 0.000)
		colorBeach     (0.466, 0.344, 0.273, 0.200)
		colorDesert    (0.424, 0.322, 0.240, 0.500)
		colorLowland   (0.324, 0.249, 0.182, 0.800)
		colorUpland    (0.549, 0.439, 0.338, 1.000)
		colorRock      (0.670, 0.620, 0.550, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.324, 0.249, 0.182, 0.800)
		colorUpPlants  (0.549, 0.439, 0.338, 1.000)
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

	Atmosphere
	{
		Model          "Pluto"
		Height          91.0752
		Density         3.23583e-008
		Pressure        4.18856e-009
		Greenhouse      0.000917673
		Bright          0.503497
		Opacity         0
		SkyLight        0.167832
		Hue             -0.0257833
		Saturation      1

		Composition
		{
			Ne    	99.4295
			N2    	0.570525
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0041988
		Period          0.0191999
		Eccentricity    0.0278792
		Inclination     -0.226329
		AscendingNode   -110.029
		ArgOfPericenter 48.6457
		MeanAnomaly     -109.41
	}
}

DwarfMoon	"10.D5"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            1.61546e-008
	Radius          35.6848
	InertiaMoment   0.398506

	RotationPeriod  432.526
	Obliquity       -0.324712
	EqAscendNode    62.9708

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.779 0.777 0.773)

	Surface
	{
		SurfStyle       0.148639
		OceanStyle      0.719111
		Randomize      (-0.292, -0.271, -0.865)
		colorDistMagn   0.189319
		colorDistFreq   0.637319
		detailScale     974.433
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00966736
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.266529
		terraceProb     0.313391
		erosion         0
		montesMagn      0.39526
		montesFreq      2.95519
		montesSpiky     0.964967
		montesFraction  0.689666
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.57336
		hillsFraction   0.629095
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264921
		craterFreq      0.217413
		craterDensity   1.0103
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.518694
		volcanoTemp     1561.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.312, 0.311, 0.309, 0.000)
		colorShelf     (0.331, 0.330, 0.328, 0.000)
		colorBeach     (0.351, 0.349, 0.348, 0.000)
		colorDesert    (0.370, 0.369, 0.367, 0.000)
		colorLowland   (0.389, 0.388, 0.386, 0.000)
		colorUpland    (0.409, 0.408, 0.406, 0.000)
		colorRock      (0.428, 0.427, 0.425, 0.000)
		colorSnow      (0.448, 0.447, 0.444, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

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

Moon	"10.6"
{
	ParentBody     "10"
	Class	       "IceWorld"

	Mass            0.0356429
	Radius          2845.18
	InertiaMoment   0.350507

	Obliquity       -0.104893
	EqAscendNode    177.854
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.788 0.782 0.780)

	Surface
	{
		SurfStyle       0.485285
		OceanStyle      0.87456
		Randomize      (-0.321, 0.673, 0.018)
		colorDistMagn   0.0491833
		colorDistFreq   307.841
		detailScale     7317.97
		colorConversion true
		drivenDarkening 0
		seaLevel        0.177649
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  0.513747
		icecapHeight    0.207843
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.73505
		venusFreq       1.55765
		venusMagn       0
		mareFreq        1.61253
		mareDensity     0.0049046
		terraceProb     0.122786
		erosion         0
		montesMagn      0.229806
		montesFreq      162.438
		montesSpiky     0.996775
		montesFraction  0.877505
		dunesMagn       0.0226327
		dunesFreq       3773.07
		dunesFraction   0.00344078
		hillsMagn       0.102388
		hillsFreq       319.177
		hillsFraction   0.492812
		hills2Fraction  0.0458449
		riversMagn      61.7169
		riversFreq      2.22574
		riversSin       5.39703
		riversOctaves   0
		canyonsMagn     0.551775
		canyonsFreq     0.927055
		canyonFraction  0
		cracksMagn      0.0636938
		cracksFreq      0.584603
		cracksOctaves   3
		craterMagn      0.536295
		craterFreq      9.81772
		craterDensity   0.648216
		craterOctaves   9.10083
		craterRayedFactor 0.169644
		volcanoMagn     0.627638
		volcanoFreq     0.660209
		volcanoDensity  0.205571
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.168593
		volcanoRadius   0.444216
		volcanoTemp     1592.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.236, 0.196, 0.172, 0.000)
		colorShelf     (0.292, 0.243, 0.218, 0.000)
		colorBeach     (0.441, 0.368, 0.328, 0.200)
		colorDesert    (0.402, 0.344, 0.289, 0.500)
		colorLowland   (0.307, 0.266, 0.218, 0.800)
		colorUpland    (0.520, 0.469, 0.406, 1.000)
		colorRock      (0.670, 0.620, 0.550, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.307, 0.266, 0.218, 0.800)
		colorUpPlants  (0.520, 0.469, 0.406, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.960169
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Titan"
		Height          142.259
		Density         0.00398312
		Pressure        0.00530631
		Greenhouse      0.582887
		Bright          5.24861
		Opacity         1
		SkyLight        1.74954
		Hue             -0.0102806
		Saturation      1

		Composition
		{
			H2    	99.9919
			He    	0.004099
			Ne    	0.00403488
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00860769
		Period          0.0563423
		Eccentricity    0.0101104
		Inclination     -0.104893
		AscendingNode   177.854
		ArgOfPericenter 114.755
		MeanAnomaly     -139.65
	}
}

Moon	"10.7"
{
	ParentBody     "10"
	Class	       "IceWorld"

	Mass            0.0041246
	Radius          1321.54
	InertiaMoment   0.393185

	Obliquity       1.49129
	EqAscendNode    -59.9094
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.550 0.547 0.542)

	Surface
	{
		SurfStyle       0.308822
		OceanStyle      0.569261
		Randomize      (0.813, -0.093, 0.190)
		colorDistMagn   0.0695954
		colorDistFreq   176.736
		detailScale     3399.07
		colorConversion true
		drivenDarkening 0
		seaLevel        0.166748
		snowLevel       2
		tropicLatitude  0.0450852
		icecapLatitude  0.567157
		icecapHeight    0.19118
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.81065
		venusFreq       1.22605
		venusMagn       0
		mareFreq        0.633502
		mareDensity     0.00174193
		terraceProb     0.439185
		erosion         0
		montesMagn      0.0597727
		montesFreq      61.3444
		montesSpiky     0.957186
		montesFraction  0.785397
		dunesMagn       0.045632
		dunesFreq       1723.45
		dunesFraction   0.128515
		hillsMagn       0.108037
		hillsFreq       182.152
		hillsFraction   0.413626
		hills2Fraction  0.236814
		riversMagn      52.2574
		riversFreq      2.77092
		riversSin       4.69162
		riversOctaves   0
		canyonsMagn     0.445304
		canyonsFreq     0.465377
		canyonFraction  0
		cracksMagn      0.0409031
		cracksFreq      0.810546
		cracksOctaves   0
		craterMagn      0.6302
		craterFreq      3.21822
		craterDensity   0.871941
		craterOctaves   11
		craterRayedFactor 0.210474
		volcanoMagn     0.181632
		volcanoFreq     0.68479
		volcanoDensity  0.211928
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.149912
		volcanoRadius   0.171293
		volcanoTemp     1460.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.550, 0.547, 0.542, 0.500)
		colorShelf     (0.523, 0.519, 0.515, 0.500)
		colorBeach     (0.385, 0.383, 0.379, 0.750)
		colorDesert    (0.468, 0.465, 0.461, 1.000)
		colorLowland   (0.484, 0.481, 0.477, 1.000)
		colorUpland    (0.512, 0.508, 0.504, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.484, 0.481, 0.477, 1.000)
		colorUpPlants  (0.512, 0.508, 0.504, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.999996
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
		Height          99.1152
		Density         3.89766e-007
		Pressure        4.9796e-008
		Greenhouse      0.00243305
		Bright          0.828249
		Opacity         0
		SkyLight        0.276083
		Hue             -0.00252917
		Saturation      1

		Composition
		{
			Ne    	99.9519
			N2    	0.0481401
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0123244
		Period          0.0965512
		Eccentricity    0.0177896
		Inclination     1.49129
		AscendingNode   -59.9094
		ArgOfPericenter 12.6406
		MeanAnomaly     62.057
	}
}

DwarfMoon	"10.D6"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            4.04216e-008
	Radius          51.047
	InertiaMoment   0.398667

	Obliquity       19.8155
	EqAscendNode    -149.697
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.544 0.465 0.406)

	Surface
	{
		SurfStyle       0.392906
		OceanStyle      0.130442
		Randomize      (0.298, -0.081, -0.780)
		colorDistMagn   0.777279
		colorDistFreq   2.21604
		detailScale     1393.92
		colorConversion true
		snowLevel       2
		tropicLatitude  0.176509
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.304478
		terraceProb     0.197897
		erosion         0
		montesMagn      0.662217
		montesFreq      2.84386
		montesSpiky     0.920151
		montesFraction  0.746371
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.65736
		hillsFraction   0.510751
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262852
		craterFreq      0.215697
		craterDensity   0.941846
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.478116
		volcanoTemp     1516.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.218, 0.186, 0.162, 0.000)
		colorShelf     (0.231, 0.197, 0.172, 0.000)
		colorBeach     (0.245, 0.209, 0.183, 0.000)
		colorDesert    (0.258, 0.221, 0.193, 0.000)
		colorLowland   (0.272, 0.232, 0.203, 0.000)
		colorUpland    (0.286, 0.244, 0.213, 0.000)
		colorRock      (0.299, 0.256, 0.223, 0.000)
		colorSnow      (0.313, 0.267, 0.233, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0524796
		Period          0.848412
		Eccentricity    0.00833372
		Inclination     19.8155
		AscendingNode   -149.697
		ArgOfPericenter 11.6471
		MeanAnomaly     -128.777
	}
}

DwarfMoon	"10.D7"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            5.48893e-008
	Radius          53.9533
	InertiaMoment   0.399634

	Obliquity       35.7647
	EqAscendNode    19.4239
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.530 0.527 0.522)

	Surface
	{
		SurfStyle       0.463613
		OceanStyle      0.818364
		Randomize      (0.917, 0.617, 0.287)
		colorDistMagn   0.97387
		colorDistFreq   2.35436
		detailScale     1473.29
		colorConversion true
		snowLevel       2
		tropicLatitude  0.94177
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.555468
		terraceProb     0.186731
		erosion         0
		montesMagn      0.590753
		montesFreq      3.59534
		montesSpiky     0.711781
		montesFraction  0.730787
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.75869
		hillsFraction   0.585212
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260853
		craterFreq      0.250967
		craterDensity   0.945835
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.566648
		volcanoTemp     1506.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.212, 0.211, 0.209, 0.000)
		colorShelf     (0.225, 0.224, 0.222, 0.000)
		colorBeach     (0.238, 0.237, 0.235, 0.000)
		colorDesert    (0.252, 0.250, 0.248, 0.000)
		colorLowland   (0.265, 0.263, 0.261, 0.000)
		colorUpland    (0.278, 0.276, 0.274, 0.000)
		colorRock      (0.291, 0.290, 0.287, 0.000)
		colorSnow      (0.304, 0.303, 0.300, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0529603
		Period          0.860094
		Eccentricity    0.0499942
		Inclination     35.7647
		AscendingNode   19.4239
		ArgOfPericenter 61.1717
		MeanAnomaly     -21.325
	}
}

DwarfMoon	"10.D8"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            7.46523e-008
	Radius          57.407
	InertiaMoment   0.397464

	RotationPeriod  15229.5
	Obliquity       89.5984
	EqAscendNode    -119.814

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.477 0.438 0.379)

	Surface
	{
		SurfStyle       0.411536
		OceanStyle      0.247188
		Randomize      (0.778, 0.738, 0.639)
		colorDistMagn   0.501951
		colorDistFreq   2.90408
		detailScale     1567.59
		colorConversion true
		snowLevel       2
		tropicLatitude  0.86763
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.35831
		terraceProb     0.258949
		erosion         0
		montesMagn      0.45533
		montesFreq      1.89676
		montesSpiky     0.889738
		montesFraction  0.538584
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.84748
		hillsFraction   0.764345
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226889
		craterFreq      0.254891
		craterDensity   0.734096
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.42121
		volcanoTemp     1854.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.191, 0.175, 0.152, 0.000)
		colorShelf     (0.203, 0.186, 0.161, 0.000)
		colorBeach     (0.215, 0.197, 0.171, 0.000)
		colorDesert    (0.227, 0.208, 0.180, 0.000)
		colorLowland   (0.239, 0.219, 0.190, 0.000)
		colorUpland    (0.251, 0.230, 0.199, 0.000)
		colorRock      (0.263, 0.241, 0.209, 0.000)
		colorSnow      (0.275, 0.252, 0.218, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0533125
		Period          0.868688
		Eccentricity    0.360397
		Inclination     89.5984
		AscendingNode   -119.814
		ArgOfPericenter 91.6991
		MeanAnomaly     -30.8823
	}
}

DwarfMoon	"10.D9"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            1.01782e-007
	Radius          59.2525
	InertiaMoment   0.398819

	RotationPeriod  23208.4
	Obliquity       -81.117
	EqAscendNode    52.3168

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.640 0.472 0.376)

	Surface
	{
		SurfStyle       0.321525
		OceanStyle      0.23021
		Randomize      (0.685, -0.002, -0.528)
		colorDistMagn   0.272956
		colorDistFreq   1.37557
		detailScale     1617.99
		colorConversion true
		snowLevel       2
		tropicLatitude  0.819644
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.258203
		terraceProb     0.303464
		erosion         0
		montesMagn      0.493393
		montesFreq      2.28834
		montesSpiky     0.95923
		montesFraction  0.42876
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.46695
		hillsFraction   0.768548
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.200887
		craterFreq      0.249669
		craterDensity   0.928063
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.453408
		volcanoTemp     1598.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.256, 0.189, 0.151, 0.000)
		colorShelf     (0.272, 0.200, 0.160, 0.000)
		colorBeach     (0.288, 0.212, 0.169, 0.000)
		colorDesert    (0.304, 0.224, 0.179, 0.000)
		colorLowland   (0.320, 0.236, 0.188, 0.000)
		colorUpland    (0.336, 0.248, 0.198, 0.000)
		colorRock      (0.352, 0.259, 0.207, 0.000)
		colorSnow      (0.368, 0.271, 0.216, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0538775
		Period          0.882534
		Eccentricity    0.309409
		Inclination     -81.117
		AscendingNode   52.3168
		ArgOfPericenter 65.9139
		MeanAnomaly     -132.044
	}
}

DwarfMoon	"10.D10"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            1.39249e-007
	Radius          77.7671
	InertiaMoment   0.399761

	Obliquity       -8.73715
	EqAscendNode    -157.389
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.601 0.594 0.589)

	Surface
	{
		SurfStyle       0.626767
		OceanStyle      0.233677
		Randomize      (0.065, 0.353, -0.390)
		colorDistMagn   0.0407214
		colorDistFreq   2.20519
		detailScale     2123.56
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0595299
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.711711
		terraceProb     0.523438
		erosion         0
		montesMagn      0.516975
		montesFreq      2.4717
		montesSpiky     0.826195
		montesFraction  0.764153
		dunesFraction   0
		hillsMagn       0
		hillsFreq       16.8725
		hillsFraction   0.730014
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243776
		craterFreq      0.241372
		craterDensity   0.781346
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.482443
		volcanoTemp     1355.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.234, 0.202, 0.165, 0.000)
		colorShelf     (0.240, 0.208, 0.188, 0.000)
		colorBeach     (0.282, 0.244, 0.224, 0.000)
		colorDesert    (0.306, 0.262, 0.218, 0.000)
		colorLowland   (0.336, 0.279, 0.247, 0.000)
		colorUpland    (0.372, 0.339, 0.300, 0.000)
		colorRock      (0.402, 0.369, 0.324, 0.000)
		colorSnow      (0.438, 0.392, 0.342, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0543305
		Period          0.893688
		Eccentricity    0.164897
		Inclination     -8.73715
		AscendingNode   -157.389
		ArgOfPericenter -61.9771
		MeanAnomaly     0.123623
	}
}

DwarfMoon	"10.D11"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            1.91358e-007
	Radius          82.2853
	InertiaMoment   0.397722

	Obliquity       86.806
	EqAscendNode    -4.9788
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.673 0.528 0.445)

	Surface
	{
		SurfStyle       0.871408
		OceanStyle      0.874267
		Randomize      (-0.862, -0.473, 0.881)
		colorDistMagn   0.972198
		colorDistFreq   4.60353
		detailScale     2246.94
		colorConversion true
		snowLevel       2
		tropicLatitude  0.140858
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.299756
		terraceProb     0.692361
		erosion         0
		montesMagn      0.584756
		montesFreq      3.56126
		montesSpiky     0.827288
		montesFraction  0.637186
		dunesFraction   0
		hillsMagn       0
		hillsFreq       19.8561
		hillsFraction   0.386302
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25763
		craterFreq      0.25413
		craterDensity   1.00367
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.495179
		volcanoTemp     1660.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.229, 0.185, 0.178, 0.050)
		colorShelf     (0.269, 0.217, 0.205, 0.040)
		colorBeach     (0.309, 0.248, 0.231, 0.030)
		colorDesert    (0.350, 0.280, 0.262, 0.020)
		colorLowland   (0.390, 0.312, 0.289, 0.030)
		colorUpland    (0.430, 0.343, 0.316, 0.050)
		colorRock      (0.471, 0.375, 0.351, 0.020)
		colorSnow      (0.471, 0.375, 0.351, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0549958
		Period          0.910153
		Eccentricity    0.0778506
		Inclination     86.806
		AscendingNode   -4.9788
		ArgOfPericenter -82.3518
		MeanAnomaly     -48.2203
	}
}

DwarfMoon	"10.D12"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            2.64442e-007
	Radius          88.0423
	InertiaMoment   0.398964

	RotationPeriod  2879.55
	Obliquity       31.4182
	EqAscendNode    26.4319

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.646 0.514 0.442)

	Surface
	{
		SurfStyle       0.795224
		OceanStyle      0.659724
		Randomize      (-0.007, 0.568, -0.378)
		colorDistMagn   0.586616
		colorDistFreq   4.59629
		detailScale     2404.14
		colorConversion true
		snowLevel       2
		tropicLatitude  0.874801
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.339591
		terraceProb     0.100249
		erosion         0
		montesMagn      0.36996
		montesFreq      3.63352
		montesSpiky     0.986165
		montesFraction  0.404188
		dunesFraction   0
		hillsMagn       0
		hillsFreq       18.4627
		hillsFraction   0.492412
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225027
		craterFreq      0.258354
		craterDensity   0.808386
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.5639
		volcanoTemp     1938.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.252, 0.175, 0.124, 0.000)
		colorShelf     (0.258, 0.180, 0.142, 0.000)
		colorBeach     (0.304, 0.211, 0.168, 0.000)
		colorDesert    (0.329, 0.226, 0.164, 0.000)
		colorLowland   (0.362, 0.241, 0.186, 0.000)
		colorUpland    (0.400, 0.293, 0.226, 0.000)
		colorRock      (0.433, 0.319, 0.243, 0.000)
		colorSnow      (0.472, 0.339, 0.257, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0555467
		Period          0.923864
		Eccentricity    0.339864
		Inclination     31.4496
		AscendingNode   26.4346
		ArgOfPericenter 47.5796
		MeanAnomaly     92.7008
	}
}

DwarfMoon	"10.D13"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            3.67952e-007
	Radius          92.7822
	InertiaMoment   0.399886

	RotationPeriod  1447.82
	Obliquity       -45.7165
	EqAscendNode    -5.30151

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.697 0.662 0.595)

	Surface
	{
		SurfStyle       0.333208
		OceanStyle      0.682428
		Randomize      (-0.962, 0.695, 0.361)
		colorDistMagn   0.557754
		colorDistFreq   2.628
		detailScale     2533.57
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999689
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.7438
		terraceProb     0.20431
		erosion         0
		montesMagn      0.614703
		montesFreq      3.16294
		montesSpiky     0.874352
		montesFraction  0.484609
		dunesFraction   0
		hillsMagn       0
		hillsFreq       13.3407
		hillsFraction   0.726669
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229357
		craterFreq      0.252025
		craterDensity   1.05475
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.452658
		volcanoTemp     1603.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.279, 0.265, 0.238, 0.000)
		colorShelf     (0.296, 0.281, 0.253, 0.000)
		colorBeach     (0.313, 0.298, 0.268, 0.000)
		colorDesert    (0.331, 0.314, 0.283, 0.000)
		colorLowland   (0.348, 0.331, 0.297, 0.000)
		colorUpland    (0.366, 0.347, 0.312, 0.000)
		colorRock      (0.383, 0.364, 0.327, 0.000)
		colorSnow      (0.401, 0.380, 0.342, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.055928
		Period          0.933394
		Eccentricity    0.296904
		Inclination     -45.8394
		AscendingNode   -5.29986
		ArgOfPericenter 91.0188
		MeanAnomaly     137.43
	}
}

DwarfMoon	"10.D14"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            5.16242e-007
	Radius          121.541
	InertiaMoment   0.397946

	RotationPeriod  1876.7
	Obliquity       34.9418
	EqAscendNode    121.015

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.419 0.413 0.411)

	Surface
	{
		SurfStyle       0.140099
		OceanStyle      0.993405
		Randomize      (-0.345, -0.617, 0.650)
		colorDistMagn   0.748461
		colorDistFreq   4.65986
		detailScale     3318.88
		colorConversion true
		snowLevel       2
		tropicLatitude  0.541371
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.523473
		terraceProb     0.428381
		erosion         0
		montesMagn      0.314033
		montesFreq      3.97579
		montesSpiky     0.944868
		montesFraction  0.635719
		dunesFraction   0
		hillsMagn       0
		hillsFreq       42.4414
		hillsFraction   0.445723
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245062
		craterFreq      0.404085
		craterDensity   1.03293
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.450226
		volcanoTemp     1362.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.168, 0.165, 0.164, 0.000)
		colorShelf     (0.178, 0.176, 0.175, 0.000)
		colorBeach     (0.189, 0.186, 0.185, 0.000)
		colorDesert    (0.199, 0.196, 0.195, 0.000)
		colorLowland   (0.209, 0.207, 0.205, 0.000)
		colorUpland    (0.220, 0.217, 0.216, 0.000)
		colorRock      (0.230, 0.227, 0.226, 0.000)
		colorSnow      (0.241, 0.238, 0.236, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0562848
		Period          0.94234
		Eccentricity    0.120017
		Inclination     35.0038
		AscendingNode   121.023
		ArgOfPericenter 11.0784
		MeanAnomaly     17.265
	}
}

DwarfMoon	"10.D15"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            7.31543e-007
	Radius          129.431
	InertiaMoment   0.399105

	RotationPeriod  1132.38
	Obliquity       80.1924
	EqAscendNode    177.19

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.703 0.698 0.696)

	Surface
	{
		SurfStyle       0.0850843
		OceanStyle      0.263887
		Randomize      (0.545, 0.705, -0.290)
		colorDistMagn   0.383484
		colorDistFreq   7.7915
		detailScale     3534.33
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0583681
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.406147
		terraceProb     0.112012
		erosion         0
		montesMagn      0.362056
		montesFreq      2.6302
		montesSpiky     0.938059
		montesFraction  0.705546
		dunesFraction   0
		hillsMagn       0
		hillsFreq       44.8294
		hillsFraction   0.577802
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256547
		craterFreq      0.512765
		craterDensity   0.720469
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.501991
		volcanoTemp     1749.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.281, 0.279, 0.278, 0.000)
		colorShelf     (0.299, 0.297, 0.296, 0.000)
		colorBeach     (0.316, 0.314, 0.313, 0.000)
		colorDesert    (0.334, 0.332, 0.331, 0.000)
		colorLowland   (0.352, 0.349, 0.348, 0.000)
		colorUpland    (0.369, 0.367, 0.365, 0.000)
		colorRock      (0.387, 0.384, 0.383, 0.000)
		colorSnow      (0.404, 0.402, 0.400, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0567436
		Period          0.953886
		Eccentricity    0.228607
		Inclination     78.3472
		AscendingNode   177.159
		ArgOfPericenter -10.2303
		MeanAnomaly     -103.622
	}
}

Comet	"C1"
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
	Color          (0.752 0.749 0.746)

	Surface
	{
		SurfStyle       0.438633
		OceanStyle      0.155297
		Randomize      (-0.544, -0.706, -0.861)
		colorDistMagn   0.838243
		colorDistFreq   0.0112268
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
		mainFreq        0.466134
		terraceProb     0.267794
		erosion         0
		montesMagn      0.630861
		montesFreq      3.37319
		montesSpiky     0.965538
		montesFraction  0.711752
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0620589
		hillsFraction   0.54421
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246502
		craterFreq      0.238371
		craterDensity   0.778119
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.482471
		volcanoTemp     1227.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.301, 0.300, 0.299, 0.000)
		colorShelf     (0.320, 0.318, 0.317, 0.000)
		colorBeach     (0.338, 0.337, 0.336, 0.000)
		colorDesert    (0.357, 0.356, 0.354, 0.000)
		colorLowland   (0.376, 0.374, 0.373, 0.000)
		colorUpland    (0.395, 0.393, 0.392, 0.000)
		colorRock      (0.414, 0.412, 0.410, 0.000)
		colorSnow      (0.432, 0.431, 0.429, 1.000)
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
		SemiMajorAxis   3.64839
		Period          17.9099
		Eccentricity    0.930037
		Inclination     19.116
		AscendingNode   169.479
		ArgOfPericenter -144.441
		MeanAnomaly     -21.4597
	}
}

Comet	"C2"
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
	Color          (0.638 0.636 0.633)

	Surface
	{
		SurfStyle       0.578312
		OceanStyle      0.188436
		Randomize      (-0.654, -0.582, 0.699)
		colorDistMagn   0.549888
		colorDistFreq   0.435989
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
		mainFreq        0.63329
		terraceProb     0.499623
		erosion         0
		montesMagn      0.392279
		montesFreq      3.0388
		montesSpiky     0.894869
		montesFraction  0.396218
		dunesFraction   0
		hillsMagn       0
		hillsFreq       17.3257
		hillsFraction   0.546507
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230673
		craterFreq      0.261323
		craterDensity   1.01622
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.46288
		volcanoTemp     1519.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.249, 0.216, 0.177, 0.000)
		colorShelf     (0.255, 0.222, 0.202, 0.000)
		colorBeach     (0.300, 0.261, 0.240, 0.000)
		colorDesert    (0.326, 0.280, 0.234, 0.000)
		colorLowland   (0.357, 0.299, 0.266, 0.000)
		colorUpland    (0.396, 0.362, 0.323, 0.000)
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
		SemiMajorAxis   2.59225
		Period          10.7265
		Eccentricity    0.886479
		Inclination     101.415
		AscendingNode   95.6062
		ArgOfPericenter -127.271
		MeanAnomaly     167.886
	}
}

Comet	"C3"
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
	Color          (0.728 0.724 0.721)

	Surface
	{
		SurfStyle       0.495901
		OceanStyle      0.336891
		Randomize      (-0.440, 0.325, -0.356)
		colorDistMagn   0.592592
		colorDistFreq   4.22937e-005
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
		mainFreq        0.524329
		terraceProb     0.43395
		erosion         0
		montesMagn      0.697131
		montesFreq      2.36049
		montesSpiky     0.969038
		montesFraction  0.699343
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000190484
		hillsFraction   0.636192
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231118
		craterFreq      0.171545
		craterDensity   1.00232
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.563391
		volcanoTemp     1617.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.291, 0.289, 0.288, 0.000)
		colorShelf     (0.309, 0.308, 0.306, 0.000)
		colorBeach     (0.328, 0.326, 0.324, 0.000)
		colorDesert    (0.346, 0.344, 0.342, 0.000)
		colorLowland   (0.364, 0.362, 0.360, 0.000)
		colorUpland    (0.382, 0.380, 0.378, 0.000)
		colorRock      (0.400, 0.398, 0.396, 0.000)
		colorSnow      (0.419, 0.416, 0.414, 1.000)
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
		SemiMajorAxis   4.09589
		Period          21.3041
		Eccentricity    0.957488
		Inclination     -122.931
		AscendingNode   164.079
		ArgOfPericenter 155.366
		MeanAnomaly     -38.6898
	}
}

Comet	"C4"
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
	Color          (0.706 0.655 0.569)

	Surface
	{
		SurfStyle       0.969962
		OceanStyle      0.499451
		Randomize      (0.977, 0.498, 0.590)
		colorDistMagn   0.516568
		colorDistFreq   0.00482356
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
		mainFreq        0.528103
		terraceProb     0.230026
		erosion         0
		montesMagn      0.617998
		montesFreq      3.73286
		montesSpiky     0.963835
		montesFraction  0.74963
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0664813
		hillsFraction   0.724179
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260662
		craterFreq      0.25106
		craterDensity   0.869083
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.511353
		volcanoTemp     977.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.240, 0.229, 0.228, 0.050)
		colorShelf     (0.282, 0.269, 0.262, 0.040)
		colorBeach     (0.325, 0.308, 0.296, 0.030)
		colorDesert    (0.367, 0.347, 0.336, 0.020)
		colorLowland   (0.409, 0.387, 0.370, 0.030)
		colorUpland    (0.452, 0.426, 0.404, 0.050)
		colorRock      (0.494, 0.465, 0.450, 0.020)
		colorSnow      (0.494, 0.465, 0.450, 1.000)
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
		SemiMajorAxis   2.73649
		Period          11.6341
		Eccentricity    0.917454
		Inclination     -7.72223
		AscendingNode   41.42
		ArgOfPericenter 27.6475
		MeanAnomaly     97.4035
	}
}

Comet	"C5"
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
	Color          (0.531 0.473 0.417)

	Surface
	{
		SurfStyle       0.198389
		OceanStyle      0.785938
		Randomize      (0.882, 0.439, -0.168)
		colorDistMagn   0.680936
		colorDistFreq   8.72351
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
		mainFreq        0.710522
		terraceProb     0.3426
		erosion         0
		montesMagn      0.499608
		montesFreq      2.55698
		montesSpiky     0.930801
		montesFraction  0.726305
		dunesFraction   0
		hillsMagn       0
		hillsFreq       26.8716
		hillsFraction   0.495705
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241107
		craterFreq      0.581497
		craterDensity   0.891012
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.481289
		volcanoTemp     1701.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.212, 0.189, 0.167, 0.000)
		colorShelf     (0.226, 0.201, 0.177, 0.000)
		colorBeach     (0.239, 0.213, 0.188, 0.000)
		colorDesert    (0.252, 0.225, 0.198, 0.000)
		colorLowland   (0.266, 0.237, 0.209, 0.000)
		colorUpland    (0.279, 0.248, 0.219, 0.000)
		colorRock      (0.292, 0.260, 0.230, 0.000)
		colorSnow      (0.305, 0.272, 0.240, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		SemiMajorAxis   2.80751
		Period          12.0899
		Eccentricity    0.896462
		Inclination     -32.7115
		AscendingNode   -115.52
		ArgOfPericenter -111.458
		MeanAnomaly     34.1879
	}
}

Comet	"C6"
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
	Color          (0.415 0.413 0.410)

	Surface
	{
		SurfStyle       0.664417
		OceanStyle      0.37759
		Randomize      (0.568, -0.103, -0.072)
		colorDistMagn   0.657808
		colorDistFreq   4.88166e-005
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
		mainFreq        0.367818
		terraceProb     0.405858
		erosion         0
		montesMagn      0.478685
		montesFreq      3.55622
		montesSpiky     0.853362
		montesFraction  0.677033
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000266243
		hillsFraction   0.434533
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227272
		craterFreq      0.198725
		craterDensity   1.08716
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.563033
		volcanoTemp     1623.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.162, 0.140, 0.115, 0.000)
		colorShelf     (0.166, 0.144, 0.131, 0.000)
		colorBeach     (0.195, 0.169, 0.156, 0.000)
		colorDesert    (0.211, 0.182, 0.152, 0.000)
		colorLowland   (0.232, 0.194, 0.172, 0.000)
		colorUpland    (0.257, 0.235, 0.209, 0.000)
		colorRock      (0.278, 0.256, 0.226, 0.000)
		colorSnow      (0.303, 0.272, 0.238, 1.000)
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
		SemiMajorAxis   4.68508
		Period          26.0625
		Eccentricity    0.939508
		Inclination     27.3523
		AscendingNode   -123.34
		ArgOfPericenter 121.463
		MeanAnomaly     98.3258
	}
}

Comet	"C7"
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
	Color          (0.726 0.724 0.722)

	Surface
	{
		SurfStyle       0.541035
		OceanStyle      0.364038
		Randomize      (0.415, 0.722, -0.525)
		colorDistMagn   0.306228
		colorDistFreq   0.0348924
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
		mainFreq        0.464735
		terraceProb     0.573568
		erosion         0
		montesMagn      0.533988
		montesFreq      2.10534
		montesSpiky     0.790409
		montesFraction  0.501601
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0943429
		hillsFraction   0.723322
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249177
		craterFreq      0.245561
		craterDensity   0.852421
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.481448
		volcanoTemp     1415.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.283, 0.246, 0.202, 0.000)
		colorShelf     (0.291, 0.253, 0.231, 0.000)
		colorBeach     (0.341, 0.297, 0.274, 0.000)
		colorDesert    (0.370, 0.319, 0.267, 0.000)
		colorLowland   (0.407, 0.340, 0.303, 0.000)
		colorUpland    (0.450, 0.413, 0.368, 0.000)
		colorRock      (0.487, 0.449, 0.397, 0.000)
		colorSnow      (0.530, 0.478, 0.419, 1.000)
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
		SemiMajorAxis   3.46225
		Period          16.5569
		Eccentricity    0.951807
		Inclination     51.2242
		AscendingNode   -87.8606
		ArgOfPericenter -51.9784
		MeanAnomaly     -152.348
	}
}

Comet	"C8"
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
	Color          (0.441 0.434 0.429)

	Surface
	{
		SurfStyle       0.33854
		OceanStyle      0.365483
		Randomize      (0.275, -0.226, 0.570)
		colorDistMagn   0.866001
		colorDistFreq   3.59134e-008
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
		mainFreq        0.371025
		terraceProb     0.262748
		erosion         0
		montesMagn      0.6537
		montesFreq      3.66679
		montesSpiky     0.954751
		montesFraction  0.472662
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.98707e-007
		hillsFraction   0.711635
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254844
		craterFreq      0.207601
		craterDensity   0.750734
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.471283
		volcanoTemp     1518.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.177, 0.173, 0.172, 0.000)
		colorShelf     (0.188, 0.184, 0.183, 0.000)
		colorBeach     (0.199, 0.195, 0.193, 0.000)
		colorDesert    (0.210, 0.206, 0.204, 0.000)
		colorLowland   (0.221, 0.217, 0.215, 0.000)
		colorUpland    (0.232, 0.228, 0.225, 0.000)
		colorRock      (0.243, 0.239, 0.236, 0.000)
		colorSnow      (0.254, 0.249, 0.247, 1.000)
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
		SemiMajorAxis   3.66656
		Period          18.0439
		Eccentricity    0.945363
		Inclination     -127.175
		AscendingNode   131.244
		ArgOfPericenter -33.494
		MeanAnomaly     -124.848
	}
}

Comet	"C9"
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
	Color          (0.712 0.711 0.709)

	Surface
	{
		SurfStyle       0.166917
		OceanStyle      0.0733439
		Randomize      (-0.285, 0.781, -0.642)
		colorDistMagn   0.400112
		colorDistFreq   0.000107976
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
		mainFreq        0.690675
		terraceProb     0.228091
		erosion         0
		montesMagn      0.44534
		montesFreq      2.73807
		montesSpiky     0.983919
		montesFraction  0.610026
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000466973
		hillsFraction   0.64884
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253234
		craterFreq      0.228704
		craterDensity   0.933539
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.507209
		volcanoTemp     1572.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.285, 0.284, 0.284, 0.000)
		colorShelf     (0.303, 0.302, 0.301, 0.000)
		colorBeach     (0.321, 0.320, 0.319, 0.000)
		colorDesert    (0.338, 0.338, 0.337, 0.000)
		colorLowland   (0.356, 0.356, 0.355, 0.000)
		colorUpland    (0.374, 0.373, 0.372, 0.000)
		colorRock      (0.392, 0.391, 0.390, 0.000)
		colorSnow      (0.410, 0.409, 0.408, 1.000)
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
		SemiMajorAxis   3.35889
		Period          15.8211
		Eccentricity    0.932462
		Inclination     -138.305
		AscendingNode   -139.934
		ArgOfPericenter -34.2901
		MeanAnomaly     -27.4933
	}
}

Comet	"C10"
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
	Color          (0.649 0.499 0.441)

	Surface
	{
		SurfStyle       0.948188
		OceanStyle      0.0607536
		Randomize      (-0.461, -0.184, -0.444)
		colorDistMagn   0.591347
		colorDistFreq   0.0424714
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
		mainFreq        0.475983
		terraceProb     0.329815
		erosion         0
		montesMagn      0.694874
		montesFreq      3.83975
		montesSpiky     0.888094
		montesFraction  0.626823
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.121816
		hillsFraction   0.792034
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239048
		craterFreq      0.245906
		craterDensity   0.900822
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.509579
		volcanoTemp     1423.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.221, 0.175, 0.176, 0.050)
		colorShelf     (0.259, 0.205, 0.203, 0.040)
		colorBeach     (0.298, 0.235, 0.229, 0.030)
		colorDesert    (0.337, 0.265, 0.260, 0.020)
		colorLowland   (0.376, 0.295, 0.287, 0.030)
		colorUpland    (0.415, 0.325, 0.313, 0.050)
		colorRock      (0.454, 0.355, 0.348, 0.020)
		colorSnow      (0.454, 0.355, 0.348, 1.000)
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
		SemiMajorAxis   2.82023
		Period          12.1722
		Eccentricity    0.954386
		Inclination     77.8547
		AscendingNode   157.466
		ArgOfPericenter -105.259
		MeanAnomaly     -18.6618
	}
}

Comet	"C11"
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
	Color          (0.847 0.776 0.746)

	Surface
	{
		SurfStyle       0.362098
		OceanStyle      0.492475
		Randomize      (-0.182, 0.686, 0.963)
		colorDistMagn   0.434266
		colorDistFreq   3.90799e-007
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
		mainFreq        0.539571
		terraceProb     0.167691
		erosion         0
		montesMagn      0.537255
		montesFreq      4.06678
		montesSpiky     0.997263
		montesFraction  0.332319
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.87623e-006
		hillsFraction   0.770291
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.270103
		craterFreq      0.214168
		craterDensity   0.863972
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48919
		volcanoTemp     1118.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.339, 0.311, 0.298, 0.000)
		colorShelf     (0.360, 0.330, 0.317, 0.000)
		colorBeach     (0.381, 0.349, 0.336, 0.000)
		colorDesert    (0.403, 0.369, 0.354, 0.000)
		colorLowland   (0.424, 0.388, 0.373, 0.000)
		colorUpland    (0.445, 0.408, 0.391, 0.000)
		colorRock      (0.466, 0.427, 0.410, 0.000)
		colorSnow      (0.487, 0.446, 0.429, 1.000)
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
		SemiMajorAxis   3.66343
		Period          18.0208
		Eccentricity    0.946159
		Inclination     -13.2838
		AscendingNode   142.59
		ArgOfPericenter 79.4308
		MeanAnomaly     30.2705
	}
}

Comet	"C12"
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
	Color          (0.545 0.542 0.537)

	Surface
	{
		SurfStyle       0.738153
		OceanStyle      0.502117
		Randomize      (-0.484, -0.083, -0.980)
		colorDistMagn   0.823942
		colorDistFreq   1.08005e-005
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
		mainFreq        0.541657
		terraceProb     0.474842
		erosion         0
		montesMagn      0.624865
		montesFreq      3.57842
		montesSpiky     0.897503
		montesFraction  0.445592
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000643197
		hillsFraction   0.57994
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23463
		craterFreq      0.227398
		craterDensity   0.766896
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.432715
		volcanoTemp     1483.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.213, 0.184, 0.150, 0.000)
		colorShelf     (0.218, 0.190, 0.172, 0.000)
		colorBeach     (0.256, 0.222, 0.204, 0.000)
		colorDesert    (0.278, 0.238, 0.199, 0.000)
		colorLowland   (0.305, 0.255, 0.226, 0.000)
		colorUpland    (0.338, 0.309, 0.274, 0.000)
		colorRock      (0.365, 0.336, 0.296, 0.000)
		colorSnow      (0.398, 0.358, 0.312, 1.000)
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
		SemiMajorAxis   4.22616
		Period          22.3285
		Eccentricity    0.970769
		Inclination     89.6474
		AscendingNode   46.0097
		ArgOfPericenter 105.967
		MeanAnomaly     -174.061
	}
}

Comet	"C13"
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
	Color          (0.582 0.469 0.397)

	Surface
	{
		SurfStyle       0.921765
		OceanStyle      0.718905
		Randomize      (0.867, 0.242, 0.371)
		colorDistMagn   0.803482
		colorDistFreq   0.0927742
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
		mainFreq        0.657451
		terraceProb     0.161978
		erosion         0
		montesMagn      0.632749
		montesFreq      2.65005
		montesSpiky     0.842545
		montesFraction  0.394702
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.229139
		hillsFraction   0.541662
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219621
		craterFreq      0.200094
		craterDensity   0.913036
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.445179
		volcanoTemp     1810.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.198, 0.164, 0.159, 0.050)
		colorShelf     (0.233, 0.192, 0.183, 0.040)
		colorBeach     (0.268, 0.220, 0.207, 0.030)
		colorDesert    (0.303, 0.249, 0.234, 0.020)
		colorLowland   (0.338, 0.277, 0.258, 0.030)
		colorUpland    (0.373, 0.305, 0.282, 0.050)
		colorRock      (0.408, 0.333, 0.314, 0.020)
		colorSnow      (0.408, 0.333, 0.314, 1.000)
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
		SemiMajorAxis   3.80954
		Period          19.1095
		Eccentricity    0.94032
		Inclination     75.8313
		AscendingNode   -102.371
		ArgOfPericenter -157.618
		MeanAnomaly     -3.93172
	}
}

Comet	"C14"
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
	Color          (0.419 0.416 0.410)

	Surface
	{
		SurfStyle       0.966107
		OceanStyle      0.923472
		Randomize      (-0.721, 0.333, -0.394)
		colorDistMagn   0.431017
		colorDistFreq   6.18891e-007
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
		mainFreq        0.672563
		terraceProb     0.371441
		erosion         0
		montesMagn      0.467535
		montesFreq      2.82816
		montesSpiky     0.889538
		montesFraction  0.825079
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.01647e-006
		hillsFraction   0.798896
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258788
		craterFreq      0.223612
		craterDensity   0.983642
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.523405
		volcanoTemp     1440.09
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.143, 0.146, 0.164, 0.050)
		colorShelf     (0.168, 0.171, 0.189, 0.040)
		colorBeach     (0.193, 0.196, 0.213, 0.030)
		colorDesert    (0.218, 0.221, 0.242, 0.020)
		colorLowland   (0.243, 0.245, 0.267, 0.030)
		colorUpland    (0.268, 0.270, 0.291, 0.050)
		colorRock      (0.293, 0.295, 0.324, 0.020)
		colorSnow      (0.293, 0.295, 0.324, 1.000)
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
		SemiMajorAxis   3.21116
		Period          14.7888
		Eccentricity    0.955101
		Inclination     71.038
		AscendingNode   134.467
		ArgOfPericenter 38.5177
		MeanAnomaly     -67.2529
	}
}

Comet	"C15"
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
	Color          (0.434 0.431 0.427)

	Surface
	{
		SurfStyle       0.160238
		OceanStyle      0.0489208
		Randomize      (0.512, -0.066, -0.703)
		colorDistMagn   0.630435
		colorDistFreq   0.000380192
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
		mainFreq        0.477861
		terraceProb     0.15259
		erosion         0
		montesMagn      0.576898
		montesFreq      3.19855
		montesSpiky     0.949541
		montesFraction  0.598905
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000991171
		hillsFraction   0.709848
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242658
		craterFreq      0.197591
		craterDensity   0.818939
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.539574
		volcanoTemp     1501.33
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.174, 0.172, 0.171, 0.000)
		colorShelf     (0.185, 0.183, 0.181, 0.000)
		colorBeach     (0.195, 0.194, 0.192, 0.000)
		colorDesert    (0.206, 0.205, 0.203, 0.000)
		colorLowland   (0.217, 0.215, 0.213, 0.000)
		colorUpland    (0.228, 0.226, 0.224, 0.000)
		colorRock      (0.239, 0.237, 0.235, 0.000)
		colorSnow      (0.250, 0.248, 0.245, 1.000)
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
		SemiMajorAxis   2.6738
		Period          11.2366
		Eccentricity    0.963072
		Inclination     128.936
		AscendingNode   61.453
		ArgOfPericenter 35.0878
		MeanAnomaly     -5.97838
	}
}

Comet	"C16"
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
	Color          (0.600 0.593 0.589)

	Surface
	{
		SurfStyle       0.966169
		OceanStyle      0.946419
		Randomize      (-0.738, 0.941, -0.626)
		colorDistMagn   0.846884
		colorDistFreq   0.0507225
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
		mainFreq        0.42854
		terraceProb     0.378381
		erosion         0
		montesMagn      0.550071
		montesFreq      3.12755
		montesSpiky     0.869761
		montesFraction  0.384976
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.230705
		hillsFraction   0.799687
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.265803
		craterFreq      0.247141
		craterDensity   0.982419
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.47843
		volcanoTemp     1700.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.204, 0.207, 0.236, 0.050)
		colorShelf     (0.240, 0.243, 0.271, 0.040)
		colorBeach     (0.276, 0.279, 0.306, 0.030)
		colorDesert    (0.312, 0.314, 0.348, 0.020)
		colorLowland   (0.348, 0.350, 0.383, 0.030)
		colorUpland    (0.384, 0.385, 0.418, 0.050)
		colorRock      (0.420, 0.421, 0.465, 0.020)
		colorSnow      (0.420, 0.421, 0.465, 1.000)
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
		SemiMajorAxis   3.36529
		Period          15.8663
		Eccentricity    0.926268
		Inclination     40.5667
		AscendingNode   -91.6483
		ArgOfPericenter -77.5293
		MeanAnomaly     171.935
	}
}

Comet	"C17"
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
	Color          (0.661 0.655 0.651)

	Surface
	{
		SurfStyle       0.389198
		OceanStyle      0.799074
		Randomize      (0.660, -0.767, 0.530)
		colorDistMagn   0.822488
		colorDistFreq   2.25172e-007
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
		mainFreq        0.552794
		terraceProb     0.181185
		erosion         0
		montesMagn      0.44733
		montesFreq      2.91677
		montesSpiky     0.969987
		montesFraction  0.913734
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.82226e-006
		hillsFraction   0.750923
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240084
		craterFreq      0.171925
		craterDensity   0.776276
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.461017
		volcanoTemp     1487.82
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.264, 0.262, 0.260, 0.000)
		colorShelf     (0.281, 0.278, 0.277, 0.000)
		colorBeach     (0.297, 0.295, 0.293, 0.000)
		colorDesert    (0.314, 0.311, 0.309, 0.000)
		colorLowland   (0.330, 0.327, 0.325, 0.000)
		colorUpland    (0.347, 0.344, 0.342, 0.000)
		colorRock      (0.363, 0.360, 0.358, 0.000)
		colorSnow      (0.380, 0.377, 0.374, 1.000)
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
		SemiMajorAxis   2.5759
		Period          10.6252
		Eccentricity    0.952444
		Inclination     -172.391
		AscendingNode   75.9484
		ArgOfPericenter 179.852
		MeanAnomaly     25.1392
	}
}

Comet	"C18"
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
	Color          (0.727 0.725 0.722)

	Surface
	{
		SurfStyle       0.881793
		OceanStyle      0.934972
		Randomize      (-0.410, 0.180, -0.382)
		colorDistMagn   0.881453
		colorDistFreq   0.000321195
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
		mainFreq        0.668154
		terraceProb     0.677256
		erosion         0
		montesMagn      0.326009
		montesFreq      3.28523
		montesSpiky     0.991078
		montesFraction  0.688148
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000978044
		hillsFraction   0.448523
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240265
		craterFreq      0.182326
		craterDensity   0.978685
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.543797
		volcanoTemp     1710.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.247, 0.254, 0.289, 0.050)
		colorShelf     (0.291, 0.297, 0.332, 0.040)
		colorBeach     (0.334, 0.341, 0.376, 0.030)
		colorDesert    (0.378, 0.384, 0.426, 0.020)
		colorLowland   (0.422, 0.428, 0.470, 0.030)
		colorUpland    (0.465, 0.471, 0.513, 0.050)
		colorRock      (0.509, 0.515, 0.571, 0.020)
		colorSnow      (0.509, 0.515, 0.571, 1.000)
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
		SemiMajorAxis   3.29236
		Period          15.3533
		Eccentricity    0.966316
		Inclination     -64.9427
		AscendingNode   -105.385
		ArgOfPericenter -164.654
		MeanAnomaly     84.1962
	}
}

Comet	"C19"
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
	Color          (0.615 0.610 0.607)

	Surface
	{
		SurfStyle       0.748043
		OceanStyle      0.447471
		Randomize      (-0.291, 0.678, -0.443)
		colorDistMagn   0.731001
		colorDistFreq   0.197128
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
		mainFreq        0.560136
		terraceProb     0.148351
		erosion         0
		montesMagn      0.442576
		montesFreq      2.84919
		montesSpiky     0.977507
		montesFraction  0.439145
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.731367
		hillsFraction   0.74558
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258862
		craterFreq      0.25726
		craterDensity   0.859812
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.517286
		volcanoTemp     1486.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.240, 0.207, 0.170, 0.000)
		colorShelf     (0.246, 0.213, 0.194, 0.000)
		colorBeach     (0.289, 0.250, 0.231, 0.000)
		colorDesert    (0.314, 0.268, 0.224, 0.000)
		colorLowland   (0.345, 0.287, 0.255, 0.000)
		colorUpland    (0.381, 0.348, 0.309, 0.000)
		colorRock      (0.412, 0.378, 0.334, 0.000)
		colorSnow      (0.449, 0.402, 0.352, 1.000)
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
		SemiMajorAxis   3.93858
		Period          20.0887
		Eccentricity    0.956431
		Inclination     -131.061
		AscendingNode   108.386
		ArgOfPericenter 37.7128
		MeanAnomaly     -12.2925
	}
}

Comet	"C20"
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
	Color          (0.659 0.605 0.571)

	Surface
	{
		SurfStyle       0.953355
		OceanStyle      0.959837
		Randomize      (0.963, -0.224, -0.082)
		colorDistMagn   0.749077
		colorDistFreq   1.00777e-006
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
		mainFreq        0.68524
		terraceProb     0.291084
		erosion         0
		montesMagn      0.469131
		montesFreq      2.70688
		montesSpiky     0.959751
		montesFraction  0.435939
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.88169e-006
		hillsFraction   0.646169
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.208013
		craterFreq      0.201059
		craterDensity   0.960166
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.548894
		volcanoTemp     1369.09
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.224, 0.212, 0.228, 0.050)
		colorShelf     (0.264, 0.248, 0.263, 0.040)
		colorBeach     (0.303, 0.284, 0.297, 0.030)
		colorDesert    (0.343, 0.321, 0.337, 0.020)
		colorLowland   (0.382, 0.357, 0.371, 0.030)
		colorUpland    (0.422, 0.393, 0.405, 0.050)
		colorRock      (0.461, 0.430, 0.451, 0.020)
		colorSnow      (0.461, 0.430, 0.451, 1.000)
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
		SemiMajorAxis   2.93932
		Period          12.9513
		Eccentricity    0.90695
		Inclination     -125.305
		AscendingNode   67.6628
		ArgOfPericenter -139.689
		MeanAnomaly     -142.617
	}
}

Comet	"C21"
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
	Color          (0.502 0.496 0.490)

	Surface
	{
		SurfStyle       0.150161
		OceanStyle      0.211723
		Randomize      (-0.022, 0.883, 0.795)
		colorDistMagn   0.206133
		colorDistFreq   0.000541457
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
		mainFreq        0.273765
		terraceProb     0.275144
		erosion         0
		montesMagn      0.430583
		montesFreq      3.4644
		montesSpiky     0.824414
		montesFraction  0.883753
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00244753
		hillsFraction   0.682722
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241328
		craterFreq      0.231523
		craterDensity   0.930932
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.494023
		volcanoTemp     1521.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.201, 0.198, 0.196, 0.000)
		colorShelf     (0.213, 0.211, 0.208, 0.000)
		colorBeach     (0.226, 0.223, 0.220, 0.000)
		colorDesert    (0.238, 0.236, 0.233, 0.000)
		colorLowland   (0.251, 0.248, 0.245, 0.000)
		colorUpland    (0.263, 0.260, 0.257, 0.000)
		colorRock      (0.276, 0.273, 0.269, 0.000)
		colorSnow      (0.289, 0.285, 0.282, 1.000)
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
		SemiMajorAxis   3.43704
		Period          16.3764
		Eccentricity    0.949
		Inclination     -98.1473
		AscendingNode   143.684
		ArgOfPericenter 47.8921
		MeanAnomaly     -9.81847
	}
}

Comet	"C22"
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
	Color          (0.763 0.761 0.760)

	Surface
	{
		SurfStyle       0.215559
		OceanStyle      0.926101
		Randomize      (0.319, -0.373, 0.841)
		colorDistMagn   0.432431
		colorDistFreq   0.219245
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
		mainFreq        0.480392
		terraceProb     0.195826
		erosion         0
		montesMagn      0.47537
		montesFreq      2.82673
		montesSpiky     0.930916
		montesFraction  0.282915
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.418329
		hillsFraction   0.551338
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239931
		craterFreq      0.251156
		craterDensity   0.7983
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52423
		volcanoTemp     1743.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.305, 0.304, 0.304, 0.000)
		colorShelf     (0.324, 0.324, 0.323, 0.000)
		colorBeach     (0.343, 0.343, 0.342, 0.000)
		colorDesert    (0.362, 0.362, 0.361, 0.000)
		colorLowland   (0.381, 0.381, 0.380, 0.000)
		colorUpland    (0.401, 0.400, 0.399, 0.000)
		colorRock      (0.420, 0.419, 0.418, 0.000)
		colorSnow      (0.439, 0.438, 0.437, 1.000)
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
		SemiMajorAxis   3.99133
		Period          20.4936
		Eccentricity    0.935496
		Inclination     -89.3937
		AscendingNode   167.869
		ArgOfPericenter -93.1182
		MeanAnomaly     155.649
	}
}

Comet	"C23"
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
	Color          (0.480 0.475 0.472)

	Surface
	{
		SurfStyle       0.62162
		OceanStyle      0.34542
		Randomize      (-0.166, 0.030, 0.866)
		colorDistMagn   0.752093
		colorDistFreq   2.08422e-006
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
		mainFreq        0.622936
		terraceProb     0.176138
		erosion         0
		montesMagn      0.521931
		montesFreq      3.13862
		montesSpiky     0.879101
		montesFraction  0.702913
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.03796e-005
		hillsFraction   0.744294
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246613
		craterFreq      0.15394
		craterDensity   0.832665
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.40742
		volcanoTemp     1549.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.187, 0.161, 0.132, 0.000)
		colorShelf     (0.192, 0.166, 0.151, 0.000)
		colorBeach     (0.225, 0.195, 0.179, 0.000)
		colorDesert    (0.245, 0.209, 0.175, 0.000)
		colorLowland   (0.269, 0.223, 0.198, 0.000)
		colorUpland    (0.297, 0.270, 0.241, 0.000)
		colorRock      (0.321, 0.294, 0.260, 0.000)
		colorSnow      (0.350, 0.313, 0.274, 1.000)
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
		SemiMajorAxis   4.02599
		Period          20.7611
		Eccentricity    0.95142
		Inclination     -94.0559
		AscendingNode   -90.8229
		ArgOfPericenter -10.2474
		MeanAnomaly     -123.425
	}
}

Comet	"C24"
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
	Color          (0.656 0.653 0.649)

	Surface
	{
		SurfStyle       0.906023
		OceanStyle      0.719916
		Randomize      (0.199, -0.774, 0.551)
		colorDistMagn   0.858314
		colorDistFreq   0.000638179
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
		mainFreq        0.580609
		terraceProb     0.272901
		erosion         0
		montesMagn      0.478508
		montesFreq      3.35248
		montesSpiky     0.967547
		montesFraction  0.526887
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00333289
		hillsFraction   0.825282
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23593
		craterFreq      0.217007
		craterDensity   0.824802
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.453079
		volcanoTemp     1408.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.223, 0.228, 0.260, 0.050)
		colorShelf     (0.262, 0.268, 0.298, 0.040)
		colorBeach     (0.302, 0.307, 0.337, 0.030)
		colorDesert    (0.341, 0.346, 0.383, 0.020)
		colorLowland   (0.380, 0.385, 0.422, 0.030)
		colorUpland    (0.420, 0.424, 0.461, 0.050)
		colorRock      (0.459, 0.463, 0.513, 0.020)
		colorSnow      (0.459, 0.463, 0.513, 1.000)
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
		SemiMajorAxis   4.14299
		Period          21.6726
		Eccentricity    0.951166
		Inclination     -25.0659
		AscendingNode   132.594
		ArgOfPericenter -85.8697
		MeanAnomaly     81.0927
	}
}

Comet	"C25"
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
	Color          (0.485 0.480 0.474)

	Surface
	{
		SurfStyle       0.266758
		OceanStyle      0.389086
		Randomize      (0.176, 0.027, 0.816)
		colorDistMagn   0.285223
		colorDistFreq   0.280652
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
		mainFreq        0.637381
		terraceProb     0.262401
		erosion         0
		montesMagn      0.613042
		montesFreq      2.71627
		montesSpiky     0.957627
		montesFraction  0.654893
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.31939
		hillsFraction   0.709502
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.186802
		craterFreq      0.272036
		craterDensity   1.06549
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.458674
		volcanoTemp     1216.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.194, 0.192, 0.190, 0.000)
		colorShelf     (0.206, 0.204, 0.201, 0.000)
		colorBeach     (0.218, 0.216, 0.213, 0.000)
		colorDesert    (0.230, 0.228, 0.225, 0.000)
		colorLowland   (0.242, 0.240, 0.237, 0.000)
		colorUpland    (0.255, 0.252, 0.249, 0.000)
		colorRock      (0.267, 0.264, 0.261, 0.000)
		colorSnow      (0.279, 0.276, 0.272, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		SemiMajorAxis   3.86938
		Period          19.5616
		Eccentricity    0.984957
		Inclination     -27.1987
		AscendingNode   -8.12117
		ArgOfPericenter -172.751
		MeanAnomaly     124.353
	}
}

Comet	"C26"
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
	Color          (0.559 0.551 0.547)

	Surface
	{
		SurfStyle       0.371818
		OceanStyle      0.0393411
		Randomize      (0.222, 0.085, 0.781)
		colorDistMagn   0.127668
		colorDistFreq   3.52458e-006
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
		mainFreq        0.372168
		terraceProb     0.16744
		erosion         0
		montesMagn      0.464594
		montesFreq      2.97716
		montesSpiky     0.945453
		montesFraction  0.321272
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.78974e-006
		hillsFraction   0.474048
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254644
		craterFreq      0.232113
		craterDensity   0.955036
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.546847
		volcanoTemp     1870.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.224, 0.220, 0.219, 0.000)
		colorShelf     (0.237, 0.234, 0.233, 0.000)
		colorBeach     (0.251, 0.248, 0.246, 0.000)
		colorDesert    (0.265, 0.262, 0.260, 0.000)
		colorLowland   (0.279, 0.276, 0.274, 0.000)
		colorUpland    (0.293, 0.289, 0.287, 0.000)
		colorRock      (0.307, 0.303, 0.301, 0.000)
		colorSnow      (0.321, 0.317, 0.315, 1.000)
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
		SemiMajorAxis   2.32726
		Period          9.12451
		Eccentricity    0.94138
		Inclination     33.4183
		AscendingNode   -80.304
		ArgOfPericenter 76.3829
		MeanAnomaly     107.891
	}
}

Comet	"C27"
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
	Color          (0.656 0.535 0.444)

	Surface
	{
		SurfStyle       0.811002
		OceanStyle      0.417245
		Randomize      (-0.521, 0.067, -0.804)
		colorDistMagn   0.665906
		colorDistFreq   0.00137899
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
		mainFreq        0.479306
		terraceProb     0.21904
		erosion         0
		montesMagn      0.465026
		montesFreq      2.44626
		montesSpiky     0.906254
		montesFraction  0.492493
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0046668
		hillsFraction   0.574367
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24598
		craterFreq      0.20836
		craterDensity   0.870445
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48584
		volcanoTemp     1489.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.256, 0.182, 0.124, 0.000)
		colorShelf     (0.262, 0.187, 0.142, 0.000)
		colorBeach     (0.308, 0.219, 0.169, 0.000)
		colorDesert    (0.334, 0.235, 0.164, 0.000)
		colorLowland   (0.367, 0.251, 0.187, 0.000)
		colorUpland    (0.406, 0.305, 0.227, 0.000)
		colorRock      (0.439, 0.332, 0.244, 0.000)
		colorSnow      (0.479, 0.353, 0.258, 1.000)
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
		SemiMajorAxis   3.9018
		Period          19.8079
		Eccentricity    0.953512
		Inclination     -70.1648
		AscendingNode   -171.751
		ArgOfPericenter -144.119
		MeanAnomaly     154.818
	}
}

Comet	"C28"
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
	Color          (0.728 0.661 0.627)

	Surface
	{
		SurfStyle       0.847598
		OceanStyle      0.70439
		Randomize      (0.883, 0.662, 0.912)
		colorDistMagn   0.492816
		colorDistFreq   0.42424
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
		mainFreq        0.398747
		terraceProb     0.210187
		erosion         0
		montesMagn      0.561594
		montesFreq      3.22683
		montesSpiky     0.993418
		montesFraction  0.577008
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.97993
		hillsFraction   0.77317
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.281925
		craterFreq      0.251915
		craterDensity   0.832183
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.517427
		volcanoTemp     1545.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.284, 0.225, 0.175, 0.000)
		colorShelf     (0.291, 0.232, 0.200, 0.000)
		colorBeach     (0.342, 0.271, 0.238, 0.000)
		colorDesert    (0.371, 0.291, 0.232, 0.000)
		colorLowland   (0.408, 0.311, 0.263, 0.000)
		colorUpland    (0.452, 0.377, 0.320, 0.000)
		colorRock      (0.488, 0.410, 0.345, 0.000)
		colorSnow      (0.532, 0.437, 0.363, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		SemiMajorAxis   3.75064
		Period          18.6681
		Eccentricity    0.933182
		Inclination     80.4732
		AscendingNode   163.552
		ArgOfPericenter 11.4259
		MeanAnomaly     -91.0529
	}
}

Comet	"C29"
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
	Color          (0.554 0.445 0.367)

	Surface
	{
		SurfStyle       0.957362
		OceanStyle      0.542944
		Randomize      (-0.224, -0.611, 0.669)
		colorDistMagn   0.971715
		colorDistFreq   6.31423e-006
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
		mainFreq        0.473794
		terraceProb     0.21937
		erosion         0
		montesMagn      0.426438
		montesFreq      3.2136
		montesSpiky     0.88008
		montesFraction  0.916351
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.98177e-005
		hillsFraction   0.486297
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259723
		craterFreq      0.212244
		craterDensity   1.09085
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.450494
		volcanoTemp     1575.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.188, 0.156, 0.147, 0.050)
		colorShelf     (0.222, 0.182, 0.169, 0.040)
		colorBeach     (0.255, 0.209, 0.191, 0.030)
		colorDesert    (0.288, 0.236, 0.217, 0.020)
		colorLowland   (0.321, 0.262, 0.239, 0.030)
		colorUpland    (0.355, 0.289, 0.261, 0.050)
		colorRock      (0.388, 0.316, 0.290, 0.020)
		colorSnow      (0.388, 0.316, 0.290, 1.000)
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
		SemiMajorAxis   4.30809
		Period          22.981
		Eccentricity    0.964212
		Inclination     -113.392
		AscendingNode   126.459
		ArgOfPericenter 152.147
		MeanAnomaly     176.005
	}
}

Comet	"C30"
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
	Color          (0.543 0.541 0.538)

	Surface
	{
		SurfStyle       0.729961
		OceanStyle      0.00401622
		Randomize      (0.816, -0.365, -0.245)
		colorDistMagn   0.423213
		colorDistFreq   0.00138976
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
		mainFreq        0.723769
		terraceProb     0.314916
		erosion         0
		montesMagn      0.50128
		montesFreq      2.44935
		montesSpiky     0.889225
		montesFraction  0.744897
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00710533
		hillsFraction   0.565043
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252311
		craterFreq      0.279157
		craterDensity   0.797905
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.454947
		volcanoTemp     1334.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.212, 0.184, 0.151, 0.000)
		colorShelf     (0.217, 0.190, 0.172, 0.000)
		colorBeach     (0.255, 0.222, 0.205, 0.000)
		colorDesert    (0.277, 0.238, 0.199, 0.000)
		colorLowland   (0.304, 0.255, 0.226, 0.000)
		colorUpland    (0.337, 0.309, 0.275, 0.000)
		colorRock      (0.364, 0.336, 0.296, 0.000)
		colorSnow      (0.396, 0.357, 0.312, 1.000)
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
		SemiMajorAxis   3.7112
		Period          18.3744
		Eccentricity    0.943637
		Inclination     -23.2347
		AscendingNode   63.5704
		ArgOfPericenter 111.208
		MeanAnomaly     75.0261
	}
}

Comet	"C31"
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
	Color          (0.640 0.542 0.479)

	Surface
	{
		SurfStyle       0.961994
		OceanStyle      0.637386
		Randomize      (-0.158, 0.218, -0.632)
		colorDistMagn   0.636431
		colorDistFreq   0.538815
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
		mainFreq        0.454207
		terraceProb     0.400957
		erosion         0
		montesMagn      0.515596
		montesFreq      3.26381
		montesSpiky     0.999534
		montesFraction  0.642701
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.60169
		hillsFraction   0.906741
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244942
		craterFreq      0.193881
		craterDensity   1.06949
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.476081
		volcanoTemp     1035.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.218, 0.190, 0.192, 0.050)
		colorShelf     (0.256, 0.222, 0.220, 0.040)
		colorBeach     (0.294, 0.255, 0.249, 0.030)
		colorDesert    (0.333, 0.287, 0.283, 0.020)
		colorLowland   (0.371, 0.320, 0.311, 0.030)
		colorUpland    (0.409, 0.352, 0.340, 0.050)
		colorRock      (0.448, 0.385, 0.379, 0.020)
		colorSnow      (0.448, 0.385, 0.379, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		SemiMajorAxis   3.72684
		Period          18.4907
		Eccentricity    0.951556
		Inclination     -96.3404
		AscendingNode   1.15641
		ArgOfPericenter 45.4975
		MeanAnomaly     78.0721
	}
}

Comet	"C32"
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
	Color          (0.602 0.599 0.598)

	Surface
	{
		SurfStyle       0.950219
		OceanStyle      0.845788
		Randomize      (0.115, -0.040, -0.219)
		colorDistMagn   0.833904
		colorDistFreq   8.71244e-006
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
		mainFreq        0.628114
		terraceProb     0.116333
		erosion         0
		montesMagn      0.685251
		montesFreq      3.37931
		montesSpiky     0.784605
		montesFraction  0.673486
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.14224e-005
		hillsFraction   0.671747
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252594
		craterFreq      0.244735
		craterDensity   0.858604
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.465026
		volcanoTemp     1584.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.205, 0.210, 0.239, 0.050)
		colorShelf     (0.241, 0.246, 0.275, 0.040)
		colorBeach     (0.277, 0.282, 0.311, 0.030)
		colorDesert    (0.313, 0.318, 0.353, 0.020)
		colorLowland   (0.349, 0.354, 0.389, 0.030)
		colorUpland    (0.386, 0.390, 0.425, 0.050)
		colorRock      (0.422, 0.426, 0.472, 0.020)
		colorSnow      (0.422, 0.426, 0.472, 1.000)
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
		SemiMajorAxis   3.05953
		Period          13.7538
		Eccentricity    0.953516
		Inclination     -150.708
		AscendingNode   65.2052
		ArgOfPericenter 35.0444
		MeanAnomaly     166.398
	}
}

Comet	"C33"
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
	Color          (0.410 0.407 0.404)

	Surface
	{
		SurfStyle       0.698484
		OceanStyle      0.957653
		Randomize      (0.466, -0.156, 0.747)
		colorDistMagn   0.0342223
		colorDistFreq   0.00324044
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
		mainFreq        0.544122
		terraceProb     0.15224
		erosion         0
		montesMagn      0.509453
		montesFreq      2.59308
		montesSpiky     0.924023
		montesFraction  0.107285
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0118091
		hillsFraction   0.49367
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239583
		craterFreq      0.276855
		craterDensity   0.910461
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.489298
		volcanoTemp     1190.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.160, 0.138, 0.113, 0.000)
		colorShelf     (0.164, 0.143, 0.129, 0.000)
		colorBeach     (0.193, 0.167, 0.154, 0.000)
		colorDesert    (0.209, 0.179, 0.150, 0.000)
		colorLowland   (0.229, 0.191, 0.170, 0.000)
		colorUpland    (0.254, 0.232, 0.206, 0.000)
		colorRock      (0.275, 0.253, 0.222, 0.000)
		colorSnow      (0.299, 0.269, 0.235, 1.000)
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
		SemiMajorAxis   2.04561
		Period          7.51926
		Eccentricity    0.85297
		Inclination     -136.161
		AscendingNode   -19.2673
		ArgOfPericenter 132.787
		MeanAnomaly     61.1871
	}
}

Comet	"C34"
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
	Color          (0.712 0.707 0.705)

	Surface
	{
		SurfStyle       0.31434
		OceanStyle      0.439819
		Randomize      (-0.865, -0.739, -0.380)
		colorDistMagn   0.282591
		colorDistFreq   0.998724
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
		mainFreq        0.262894
		terraceProb     0.273636
		erosion         0
		montesMagn      0.608848
		montesFreq      2.77103
		montesSpiky     0.995206
		montesFraction  0.380313
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.30318
		hillsFraction   0.68054
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252779
		craterFreq      0.219404
		craterDensity   0.96164
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.467775
		volcanoTemp     1242.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.285, 0.283, 0.282, 0.000)
		colorShelf     (0.303, 0.301, 0.299, 0.000)
		colorBeach     (0.321, 0.318, 0.317, 0.000)
		colorDesert    (0.338, 0.336, 0.335, 0.000)
		colorLowland   (0.356, 0.354, 0.352, 0.000)
		colorUpland    (0.374, 0.371, 0.370, 0.000)
		colorRock      (0.392, 0.389, 0.388, 0.000)
		colorSnow      (0.410, 0.407, 0.405, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		SemiMajorAxis   5.74532
		Period          35.3926
		Eccentricity    0.962414
		Inclination     -26.0417
		AscendingNode   -26.5252
		ArgOfPericenter 105.318
		MeanAnomaly     -63.0211
	}
}

Comet	"C35"
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
	Color          (0.794 0.730 0.677)

	Surface
	{
		SurfStyle       0.35259
		OceanStyle      0.212435
		Randomize      (0.433, -0.864, -0.730)
		colorDistMagn   0.96224
		colorDistFreq   1.23393e-005
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
		mainFreq        0.515643
		terraceProb     0.212706
		erosion         0
		montesMagn      0.411974
		montesFreq      3.45172
		montesSpiky     0.849059
		montesFraction  0.596576
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.41004e-005
		hillsFraction   0.742299
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.273906
		craterFreq      0.173302
		craterDensity   0.943608
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.508596
		volcanoTemp     1603.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.318, 0.292, 0.271, 0.000)
		colorShelf     (0.337, 0.310, 0.288, 0.000)
		colorBeach     (0.357, 0.329, 0.304, 0.000)
		colorDesert    (0.377, 0.347, 0.321, 0.000)
		colorLowland   (0.397, 0.365, 0.338, 0.000)
		colorUpland    (0.417, 0.383, 0.355, 0.000)
		colorRock      (0.437, 0.402, 0.372, 0.000)
		colorSnow      (0.457, 0.420, 0.389, 1.000)
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
		SemiMajorAxis   3.16109
		Period          14.4443
		Eccentricity    0.93881
		Inclination     -93.8711
		AscendingNode   87.0868
		ArgOfPericenter -4.77086
		MeanAnomaly     115.922
	}
}

Comet	"C36"
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
	Color          (0.790 0.788 0.787)

	Surface
	{
		SurfStyle       0.297011
		OceanStyle      0.784661
		Randomize      (-0.186, 0.724, 0.160)
		colorDistMagn   0.44327
		colorDistFreq   0.00209038
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
		mainFreq        0.476637
		terraceProb     0.281757
		erosion         0
		montesMagn      0.541023
		montesFreq      1.96394
		montesSpiky     0.904977
		montesFraction  0.333973
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0143736
		hillsFraction   0.581042
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.215095
		craterFreq      0.21785
		craterDensity   0.880255
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.490875
		volcanoTemp     1678.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.316, 0.315, 0.315, 0.000)
		colorShelf     (0.336, 0.335, 0.334, 0.000)
		colorBeach     (0.355, 0.355, 0.354, 0.000)
		colorDesert    (0.375, 0.374, 0.374, 0.000)
		colorLowland   (0.395, 0.394, 0.393, 0.000)
		colorUpland    (0.415, 0.414, 0.413, 0.000)
		colorRock      (0.434, 0.434, 0.433, 0.000)
		colorSnow      (0.454, 0.453, 0.452, 1.000)
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
		SemiMajorAxis   2.18939
		Period          8.32578
		Eccentricity    0.938469
		Inclination     140.658
		AscendingNode   58.976
		ArgOfPericenter -154.315
		MeanAnomaly     130.969
	}
}

Comet	"C37"
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
	Color          (0.484 0.386 0.324)

	Surface
	{
		SurfStyle       0.581522
		OceanStyle      0.0966487
		Randomize      (-0.543, 0.177, 0.067)
		colorDistMagn   0.909302
		colorDistFreq   0.867395
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
		mainFreq        0.33878
		terraceProb     0.191494
		erosion         0
		montesMagn      0.502707
		montesFreq      2.79814
		montesSpiky     0.933318
		montesFraction  0.725936
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.14564
		hillsFraction   0.911279
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227947
		craterFreq      0.248684
		craterDensity   0.870109
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.47539
		volcanoTemp     1672.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.189, 0.131, 0.091, 0.000)
		colorShelf     (0.194, 0.135, 0.104, 0.000)
		colorBeach     (0.228, 0.158, 0.123, 0.000)
		colorDesert    (0.247, 0.170, 0.120, 0.000)
		colorLowland   (0.271, 0.182, 0.136, 0.000)
		colorUpland    (0.300, 0.220, 0.165, 0.000)
		colorRock      (0.325, 0.240, 0.178, 0.000)
		colorSnow      (0.354, 0.255, 0.188, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		SemiMajorAxis   2.69806
		Period          11.3899
		Eccentricity    0.918465
		Inclination     -18.0239
		AscendingNode   -172.108
		ArgOfPericenter -102.153
		MeanAnomaly     156.142
	}
}

Comet	"C38"
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
	Color          (0.794 0.792 0.791)

	Surface
	{
		SurfStyle       0.30898
		OceanStyle      0.641786
		Randomize      (-0.217, -0.930, -0.686)
		colorDistMagn   0.232792
		colorDistFreq   2.01711e-005
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
		mainFreq        0.670805
		terraceProb     0.402679
		erosion         0
		montesMagn      0.618834
		montesFreq      2.42878
		montesSpiky     0.913771
		montesFraction  0.430202
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.05752e-005
		hillsFraction   0.533625
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242365
		craterFreq      0.171442
		craterDensity   0.759669
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48633
		volcanoTemp     922.712
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.318, 0.317, 0.316, 0.000)
		colorShelf     (0.337, 0.337, 0.336, 0.000)
		colorBeach     (0.357, 0.356, 0.356, 0.000)
		colorDesert    (0.377, 0.376, 0.376, 0.000)
		colorLowland   (0.397, 0.396, 0.395, 0.000)
		colorUpland    (0.417, 0.416, 0.415, 0.000)
		colorRock      (0.437, 0.436, 0.435, 0.000)
		colorSnow      (0.456, 0.455, 0.455, 1.000)
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
		SemiMajorAxis   3.73745
		Period          18.5697
		Eccentricity    0.937646
		Inclination     -59.1522
		AscendingNode   116.4
		ArgOfPericenter 141.775
		MeanAnomaly     -28.005
	}
}

Comet	"C39"
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
	Color          (0.465 0.382 0.353)

	Surface
	{
		SurfStyle       0.797091
		OceanStyle      0.553362
		Randomize      (0.329, -0.305, -0.171)
		colorDistMagn   0.287573
		colorDistFreq   0.00583454
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
		mainFreq        0.407425
		terraceProb     0.562882
		erosion         0
		montesMagn      0.650206
		montesFreq      3.60393
		montesSpiky     0.960084
		montesFraction  0.183383
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0202042
		hillsFraction   0.38005
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231311
		craterFreq      0.23196
		craterDensity   0.834319
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.618074
		volcanoTemp     1662.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.181, 0.130, 0.099, 0.000)
		colorShelf     (0.186, 0.134, 0.113, 0.000)
		colorBeach     (0.219, 0.157, 0.134, 0.000)
		colorDesert    (0.237, 0.168, 0.131, 0.000)
		colorLowland   (0.260, 0.179, 0.148, 0.000)
		colorUpland    (0.288, 0.218, 0.180, 0.000)
		colorRock      (0.312, 0.237, 0.194, 0.000)
		colorSnow      (0.340, 0.252, 0.205, 1.000)
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
		SemiMajorAxis   2.73026
		Period          11.5944
		Eccentricity    0.93483
		Inclination     -25.8813
		AscendingNode   101.361
		ArgOfPericenter -8.57109
		MeanAnomaly     84.3957
	}
}

Comet	"C40"
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
	Color          (0.809 0.772 0.744)

	Surface
	{
		SurfStyle       0.965639
		OceanStyle      0.799584
		Randomize      (-0.197, -0.677, 0.951)
		colorDistMagn   0.855447
		colorDistFreq   2.66329
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
		mainFreq        0.760714
		terraceProb     0.212812
		erosion         0
		montesMagn      0.452414
		montesFreq      2.58085
		montesSpiky     0.983467
		montesFraction  0.315569
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.6245
		hillsFraction   0.632105
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231507
		craterFreq      0.255012
		craterDensity   0.747337
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.467889
		volcanoTemp     1660.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.275, 0.270, 0.298, 0.050)
		colorShelf     (0.324, 0.316, 0.342, 0.040)
		colorBeach     (0.372, 0.363, 0.387, 0.030)
		colorDesert    (0.421, 0.409, 0.439, 0.020)
		colorLowland   (0.469, 0.455, 0.484, 0.030)
		colorUpland    (0.518, 0.502, 0.528, 0.050)
		colorRock      (0.566, 0.548, 0.588, 0.020)
		colorSnow      (0.566, 0.548, 0.588, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		SemiMajorAxis   2.60565
		Period          10.8097
		Eccentricity    0.918628
		Inclination     -22.3711
		AscendingNode   75.5467
		ArgOfPericenter 24.3976
		MeanAnomaly     -15.2485
	}
}

Comet	"C41"
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
	Color          (0.855 0.790 0.735)

	Surface
	{
		SurfStyle       0.00251802
		OceanStyle      0.538057
		Randomize      (-0.291, 0.247, -0.214)
		colorDistMagn   0.627754
		colorDistFreq   1.2957e-005
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
		mainFreq        0.60537
		terraceProb     0.208528
		erosion         0
		montesMagn      0.458582
		montesFreq      2.28712
		montesSpiky     0.965554
		montesFraction  0.246437
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000102849
		hillsFraction   0.537827
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230308
		craterFreq      0.238945
		craterDensity   0.851017
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.513492
		volcanoTemp     1434.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.342, 0.316, 0.294, 0.000)
		colorShelf     (0.363, 0.336, 0.312, 0.000)
		colorBeach     (0.385, 0.356, 0.331, 0.000)
		colorDesert    (0.406, 0.375, 0.349, 0.000)
		colorLowland   (0.427, 0.395, 0.368, 0.000)
		colorUpland    (0.449, 0.415, 0.386, 0.000)
		colorRock      (0.470, 0.435, 0.404, 0.000)
		colorSnow      (0.491, 0.454, 0.423, 1.000)
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
		SemiMajorAxis   2.90765
		Period          12.7425
		Eccentricity    0.962674
		Inclination     17.9144
		AscendingNode   173.511
		ArgOfPericenter -103.02
		MeanAnomaly     149.808
	}
}

Comet	"C42"
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
	Color          (0.511 0.503 0.498)

	Surface
	{
		SurfStyle       0.93264
		OceanStyle      0.549838
		Randomize      (-0.786, 0.281, 0.382)
		colorDistMagn   0.907242
		colorDistFreq   0.00477557
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
		mainFreq        0.441365
		terraceProb     0.253568
		erosion         0
		montesMagn      0.575822
		montesFreq      2.87211
		montesSpiky     0.969224
		montesFraction  0.369248
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0439673
		hillsFraction   0.604276
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.192895
		craterFreq      0.26002
		craterDensity   1.00973
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.463689
		volcanoTemp     1436.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.174, 0.176, 0.199, 0.050)
		colorShelf     (0.205, 0.206, 0.229, 0.040)
		colorBeach     (0.235, 0.237, 0.259, 0.030)
		colorDesert    (0.266, 0.267, 0.294, 0.020)
		colorLowland   (0.297, 0.297, 0.324, 0.030)
		colorUpland    (0.327, 0.327, 0.354, 0.050)
		colorRock      (0.358, 0.357, 0.394, 0.020)
		colorSnow      (0.358, 0.357, 0.394, 1.000)
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
		SemiMajorAxis   3.80639
		Period          19.0858
		Eccentricity    0.932099
		Inclination     38.3229
		AscendingNode   4.84325
		ArgOfPericenter -44.7574
		MeanAnomaly     69.1399
	}
}

Comet	"C43"
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
	Color          (0.681 0.631 0.542)

	Surface
	{
		SurfStyle       0.641036
		OceanStyle      0.928412
		Randomize      (-0.241, -0.708, 0.765)
		colorDistMagn   0.369478
		colorDistFreq   3.0129
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
		mainFreq        0.321985
		terraceProb     0.127821
		erosion         0
		montesMagn      0.638778
		montesFreq      2.10141
		montesSpiky     0.834975
		montesFraction  0.857485
		dunesFraction   0
		hillsMagn       0
		hillsFreq       13.6619
		hillsFraction   0.618765
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.275142
		craterFreq      0.265099
		craterDensity   0.963281
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.519999
		volcanoTemp     1619.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.265, 0.214, 0.152, 0.000)
		colorShelf     (0.272, 0.221, 0.173, 0.000)
		colorBeach     (0.320, 0.259, 0.206, 0.000)
		colorDesert    (0.347, 0.278, 0.201, 0.000)
		colorLowland   (0.381, 0.296, 0.228, 0.000)
		colorUpland    (0.422, 0.360, 0.276, 0.000)
		colorRock      (0.456, 0.391, 0.298, 0.000)
		colorSnow      (0.497, 0.416, 0.314, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		SemiMajorAxis   3.00214
		Period          13.3686
		Eccentricity    0.940391
		Inclination     -54.8314
		AscendingNode   167.931
		ArgOfPericenter 112.677
		MeanAnomaly     158.467
	}
}

Comet	"C44"
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
	Color          (0.741 0.740 0.739)

	Surface
	{
		SurfStyle       0.573782
		OceanStyle      0.242026
		Randomize      (-0.499, 0.774, 0.615)
		colorDistMagn   0.915116
		colorDistFreq   3.29358e-005
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
		mainFreq        0.661778
		terraceProb     0.339754
		erosion         0
		montesMagn      0.560055
		montesFreq      2.55573
		montesSpiky     0.973231
		montesFraction  0.729186
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000166776
		hillsFraction   0.55656
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221025
		craterFreq      0.245024
		craterDensity   0.86479
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.472636
		volcanoTemp     1462.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.289, 0.252, 0.207, 0.000)
		colorShelf     (0.297, 0.259, 0.236, 0.000)
		colorBeach     (0.349, 0.304, 0.281, 0.000)
		colorDesert    (0.378, 0.326, 0.273, 0.000)
		colorLowland   (0.415, 0.348, 0.310, 0.000)
		colorUpland    (0.460, 0.422, 0.377, 0.000)
		colorRock      (0.497, 0.459, 0.406, 0.000)
		colorSnow      (0.541, 0.489, 0.428, 1.000)
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
		SemiMajorAxis   3.03316
		Period          13.5764
		Eccentricity    0.904177
		Inclination     -10.4489
		AscendingNode   -132.643
		ArgOfPericenter 95.0846
		MeanAnomaly     26.9097
	}
}

Comet	"C45"
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
	Color          (0.614 0.610 0.609)

	Surface
	{
		SurfStyle       0.0130522
		OceanStyle      0.00502594
		Randomize      (0.068, -0.051, -0.797)
		colorDistMagn   0.367024
		colorDistFreq   0.0183785
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
		mainFreq        0.466071
		terraceProb     0.289629
		erosion         0
		montesMagn      0.399189
		montesFreq      2.95069
		montesSpiky     0.892109
		montesFraction  0.338277
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0681597
		hillsFraction   0.675075
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226894
		craterFreq      0.254167
		craterDensity   0.972242
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.532431
		volcanoTemp     1395.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.246, 0.244, 0.244, 0.000)
		colorShelf     (0.261, 0.259, 0.259, 0.000)
		colorBeach     (0.276, 0.275, 0.274, 0.000)
		colorDesert    (0.292, 0.290, 0.289, 0.000)
		colorLowland   (0.307, 0.305, 0.305, 0.000)
		colorUpland    (0.322, 0.321, 0.320, 0.000)
		colorRock      (0.338, 0.336, 0.335, 0.000)
		colorSnow      (0.353, 0.351, 0.350, 1.000)
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
		SemiMajorAxis   3.01709
		Period          13.4686
		Eccentricity    0.910118
		Inclination     10.4629
		AscendingNode   68.0469
		ArgOfPericenter -156.683
		MeanAnomaly     56.3188
	}
}

Comet	"C46"
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
	Color          (0.474 0.374 0.338)

	Surface
	{
		SurfStyle       0.439848
		OceanStyle      0.856021
		Randomize      (-0.376, -0.742, 0.136)
		colorDistMagn   0.473593
		colorDistFreq   4.67214
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
		mainFreq        0.27018
		terraceProb     0.407998
		erosion         0
		montesMagn      0.536759
		montesFreq      3.22326
		montesSpiky     0.97127
		montesFraction  0.0952822
		dunesFraction   0
		hillsMagn       0
		hillsFreq       21.4616
		hillsFraction   0.642056
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238681
		craterFreq      0.254371
		craterDensity   0.82075
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.517088
		volcanoTemp     1360.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.190, 0.149, 0.135, 0.000)
		colorShelf     (0.202, 0.159, 0.143, 0.000)
		colorBeach     (0.214, 0.168, 0.152, 0.000)
		colorDesert    (0.225, 0.177, 0.160, 0.000)
		colorLowland   (0.237, 0.187, 0.169, 0.000)
		colorUpland    (0.249, 0.196, 0.177, 0.000)
		colorRock      (0.261, 0.205, 0.186, 0.000)
		colorSnow      (0.273, 0.215, 0.194, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		SemiMajorAxis   3.4368
		Period          16.3747
		Eccentricity    0.958493
		Inclination     154.812
		AscendingNode   109.311
		ArgOfPericenter 34.4859
		MeanAnomaly     20.7994
	}
}

Comet	"C47"
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
	Color          (0.749 0.687 0.600)

	Surface
	{
		SurfStyle       0.300079
		OceanStyle      0.687283
		Randomize      (-0.700, 0.079, 0.658)
		colorDistMagn   0.788368
		colorDistFreq   4.40691e-005
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
		mainFreq        0.430757
		terraceProb     0.238013
		erosion         0
		montesMagn      0.354799
		montesFreq      2.62945
		montesSpiky     0.927359
		montesFraction  0.782547
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000188814
		hillsFraction   0.736203
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232325
		craterFreq      0.205382
		craterDensity   0.973168
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.511715
		volcanoTemp     1297.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.299, 0.275, 0.240, 0.000)
		colorShelf     (0.318, 0.292, 0.255, 0.000)
		colorBeach     (0.337, 0.309, 0.270, 0.000)
		colorDesert    (0.356, 0.326, 0.285, 0.000)
		colorLowland   (0.374, 0.344, 0.300, 0.000)
		colorUpland    (0.393, 0.361, 0.315, 0.000)
		colorRock      (0.412, 0.378, 0.330, 0.000)
		colorSnow      (0.430, 0.395, 0.345, 1.000)
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
		SemiMajorAxis   3.34839
		Period          15.7469
		Eccentricity    0.963123
		Inclination     19.9825
		AscendingNode   -88.1152
		ArgOfPericenter -107.722
		MeanAnomaly     84.5549
	}
}

Comet	"C48"
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
	Color          (0.425 0.421 0.414)

	Surface
	{
		SurfStyle       0.677141
		OceanStyle      0.554232
		Randomize      (-0.133, -0.997, 0.741)
		colorDistMagn   0.2185
		colorDistFreq   0.0227229
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
		mainFreq        0.488367
		terraceProb     0.173601
		erosion         0
		montesMagn      0.635295
		montesFreq      2.08342
		montesSpiky     0.960776
		montesFraction  0.703184
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0828595
		hillsFraction   0.436079
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238642
		craterFreq      0.269033
		craterDensity   0.939042
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.488368
		volcanoTemp     1455.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.166, 0.143, 0.116, 0.000)
		colorShelf     (0.170, 0.147, 0.133, 0.000)
		colorBeach     (0.200, 0.173, 0.157, 0.000)
		colorDesert    (0.217, 0.185, 0.153, 0.000)
		colorLowland   (0.238, 0.198, 0.174, 0.000)
		colorUpland    (0.263, 0.240, 0.211, 0.000)
		colorRock      (0.284, 0.261, 0.228, 0.000)
		colorSnow      (0.310, 0.278, 0.240, 1.000)
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
		SemiMajorAxis   3.06024
		Period          13.7586
		Eccentricity    0.918583
		Inclination     94.5598
		AscendingNode   -158.896
		ArgOfPericenter -13.0006
		MeanAnomaly     -113.823
	}
}

Comet	"C49"
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
	Color          (0.560 0.554 0.548)

	Surface
	{
		SurfStyle       0.91039
		OceanStyle      0.00641383
		Randomize      (-0.156, 0.895, 0.025)
		colorDistMagn   0.31025
		colorDistFreq   4.64082
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
		mainFreq        0.407705
		terraceProb     0.536061
		erosion         0
		montesMagn      0.497857
		montesFreq      3.58913
		montesSpiky     0.995197
		montesFraction  0.67812
		dunesFraction   0
		hillsMagn       0
		hillsFreq       31.7598
		hillsFraction   0.706485
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.274713
		craterFreq      0.584389
		craterDensity   0.923861
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.469506
		volcanoTemp     1007.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.190, 0.194, 0.219, 0.050)
		colorShelf     (0.224, 0.227, 0.252, 0.040)
		colorBeach     (0.258, 0.260, 0.285, 0.030)
		colorDesert    (0.291, 0.293, 0.323, 0.020)
		colorLowland   (0.325, 0.327, 0.356, 0.030)
		colorUpland    (0.358, 0.360, 0.389, 0.050)
		colorRock      (0.392, 0.393, 0.433, 0.020)
		colorSnow      (0.392, 0.393, 0.433, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		SemiMajorAxis   3.38443
		Period          16.0018
		Eccentricity    0.935456
		Inclination     102.845
		AscendingNode   99.3397
		ArgOfPericenter 175.965
		MeanAnomaly     147.504
	}
}

Comet	"C50"
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
	Color          (0.554 0.550 0.548)

	Surface
	{
		SurfStyle       0.263542
		OceanStyle      0.452566
		Randomize      (0.364, 0.380, 0.600)
		colorDistMagn   0.22092
		colorDistFreq   2.42743e-005
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
		mainFreq        0.564841
		terraceProb     0.130173
		erosion         0
		montesMagn      0.656708
		montesFreq      2.56628
		montesSpiky     0.884016
		montesFraction  0.298924
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000201763
		hillsFraction   0.646475
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246824
		craterFreq      0.188146
		craterDensity   1.03355
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48969
		volcanoTemp     1598.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.222, 0.220, 0.219, 0.000)
		colorShelf     (0.235, 0.234, 0.233, 0.000)
		colorBeach     (0.249, 0.247, 0.246, 0.000)
		colorDesert    (0.263, 0.261, 0.260, 0.000)
		colorLowland   (0.277, 0.275, 0.274, 0.000)
		colorUpland    (0.291, 0.289, 0.287, 0.000)
		colorRock      (0.305, 0.302, 0.301, 0.000)
		colorSnow      (0.319, 0.316, 0.315, 1.000)
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
		SemiMajorAxis   1.97057
		Period          7.10934
		Eccentricity    0.90883
		Inclination     108.782
		AscendingNode   170.818
		ArgOfPericenter -155.128
		MeanAnomaly     175.18
	}
}

Comet	"C51"
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
	Color          (0.557 0.549 0.545)

	Surface
	{
		SurfStyle       0.0459464
		OceanStyle      0.197227
		Randomize      (0.466, 0.311, 0.363)
		colorDistMagn   0.452369
		colorDistFreq   0.045357
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
		mainFreq        0.597265
		terraceProb     0.107642
		erosion         0
		montesMagn      0.597624
		montesFreq      3.0452
		montesSpiky     0.960121
		montesFraction  0.679285
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.142348
		hillsFraction   0.533202
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224121
		craterFreq      0.15344
		craterDensity   0.777384
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.542427
		volcanoTemp     1503.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.223, 0.219, 0.218, 0.000)
		colorShelf     (0.237, 0.233, 0.231, 0.000)
		colorBeach     (0.251, 0.247, 0.245, 0.000)
		colorDesert    (0.265, 0.261, 0.259, 0.000)
		colorLowland   (0.279, 0.274, 0.272, 0.000)
		colorUpland    (0.292, 0.288, 0.286, 0.000)
		colorRock      (0.306, 0.302, 0.299, 0.000)
		colorSnow      (0.320, 0.316, 0.313, 1.000)
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
		SemiMajorAxis   3.71914
		Period          18.4334
		Eccentricity    0.934616
		Inclination     -115.072
		AscendingNode   11.9399
		ArgOfPericenter 140.767
		MeanAnomaly     -166.976
	}
}

Comet	"C52"
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
	Color          (0.754 0.682 0.593)

	Surface
	{
		SurfStyle       0.660611
		OceanStyle      0.198243
		Randomize      (-0.236, -0.490, -0.080)
		colorDistMagn   0.117762
		colorDistFreq   3.40528e-007
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
		mainFreq        0.413505
		terraceProb     0.530864
		erosion         0
		montesMagn      0.471628
		montesFreq      3.05605
		montesSpiky     0.990137
		montesFraction  0.638391
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.4299e-007
		hillsFraction   0.556167
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245114
		craterFreq      0.212543
		craterDensity   0.911389
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.471299
		volcanoTemp     1755.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.294, 0.232, 0.166, 0.000)
		colorShelf     (0.302, 0.239, 0.190, 0.000)
		colorBeach     (0.354, 0.280, 0.225, 0.000)
		colorDesert    (0.384, 0.300, 0.219, 0.000)
		colorLowland   (0.422, 0.320, 0.249, 0.000)
		colorUpland    (0.467, 0.389, 0.302, 0.000)
		colorRock      (0.505, 0.423, 0.326, 0.000)
		colorSnow      (0.550, 0.450, 0.344, 1.000)
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
		SemiMajorAxis   3.91766
		Period          19.9288
		Eccentricity    0.962233
		Inclination     62.0796
		AscendingNode   90.2424
		ArgOfPericenter 57.2471
		MeanAnomaly     -106.643
	}
}

Comet	"C53"
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
	Color          (0.477 0.469 0.466)

	Surface
	{
		SurfStyle       0.895014
		OceanStyle      0.85345
		Randomize      (0.857, 0.211, -0.814)
		colorDistMagn   0.952744
		colorDistFreq   0.000106223
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
		mainFreq        0.343925
		terraceProb     0.463393
		erosion         0
		montesMagn      0.556615
		montesFreq      2.47716
		montesSpiky     0.939996
		montesFraction  0.33771
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000492368
		hillsFraction   0.40868
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254898
		craterFreq      0.247248
		craterDensity   0.903769
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.532574
		volcanoTemp     1781.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.162, 0.164, 0.187, 0.050)
		colorShelf     (0.191, 0.192, 0.215, 0.040)
		colorBeach     (0.219, 0.220, 0.243, 0.030)
		colorDesert    (0.248, 0.249, 0.275, 0.020)
		colorLowland   (0.276, 0.277, 0.303, 0.030)
		colorUpland    (0.305, 0.305, 0.331, 0.050)
		colorRock      (0.334, 0.333, 0.368, 0.020)
		colorSnow      (0.334, 0.333, 0.368, 1.000)
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
		SemiMajorAxis   3.14971
		Period          14.3664
		Eccentricity    0.926103
		Inclination     25.1978
		AscendingNode   -14.8878
		ArgOfPericenter -77.4921
		MeanAnomaly     165.389
	}
}

Comet	"C54"
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
	Color          (0.593 0.558 0.495)

	Surface
	{
		SurfStyle       0.564934
		OceanStyle      0.673892
		Randomize      (-0.709, -0.983, -0.087)
		colorDistMagn   0.591597
		colorDistFreq   0.0214874
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
		mainFreq        0.584635
		terraceProb     0.282938
		erosion         0
		montesMagn      0.423892
		montesFreq      2.68471
		montesSpiky     0.909538
		montesFraction  0.726601
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.152711
		hillsFraction   0.776154
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256164
		craterFreq      0.234912
		craterDensity   1.04805
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.542174
		volcanoTemp     1342.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.231, 0.190, 0.139, 0.000)
		colorShelf     (0.237, 0.195, 0.158, 0.000)
		colorBeach     (0.279, 0.229, 0.188, 0.000)
		colorDesert    (0.303, 0.246, 0.183, 0.000)
		colorLowland   (0.332, 0.262, 0.208, 0.000)
		colorUpland    (0.368, 0.318, 0.252, 0.000)
		colorRock      (0.398, 0.346, 0.272, 0.000)
		colorSnow      (0.433, 0.368, 0.287, 1.000)
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
		SemiMajorAxis   2.48186
		Period          10.0487
		Eccentricity    0.973493
		Inclination     -148.759
		AscendingNode   33.3844
		ArgOfPericenter 10.869
		MeanAnomaly     -71.1925
	}
}

Comet	"C55"
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
	Color          (0.650 0.646 0.645)

	Surface
	{
		SurfStyle       0.992574
		OceanStyle      0.88168
		Randomize      (-0.028, 0.454, -0.699)
		colorDistMagn   0.469753
		colorDistFreq   5.52283e-007
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
		mainFreq        0.596966
		terraceProb     0.317409
		erosion         0
		montesMagn      0.578741
		montesFreq      3.21327
		montesSpiky     0.992986
		montesFraction  0.643065
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.54838e-006
		hillsFraction   0.662942
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259622
		craterFreq      0.202562
		craterDensity   0.868837
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.494552
		volcanoTemp     1561.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.221, 0.226, 0.258, 0.050)
		colorShelf     (0.260, 0.265, 0.296, 0.040)
		colorBeach     (0.299, 0.304, 0.335, 0.030)
		colorDesert    (0.338, 0.343, 0.380, 0.020)
		colorLowland   (0.377, 0.381, 0.419, 0.030)
		colorUpland    (0.416, 0.420, 0.458, 0.050)
		colorRock      (0.455, 0.459, 0.509, 0.020)
		colorSnow      (0.455, 0.459, 0.509, 1.000)
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
		SemiMajorAxis   4.00422
		Period          20.5929
		Eccentricity    0.93253
		Inclination     -5.46292
		AscendingNode   152.948
		ArgOfPericenter 88.402
		MeanAnomaly     -109.316
	}
}

Comet	"C56"
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
	Color          (0.615 0.520 0.476)

	Surface
	{
		SurfStyle       0.0132523
		OceanStyle      0.0741702
		Randomize      (-0.600, 0.980, 0.828)
		colorDistMagn   0.0790467
		colorDistFreq   0.000133062
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
		mainFreq        0.376632
		terraceProb     0.317779
		erosion         0
		montesMagn      0.576995
		montesFreq      2.26093
		montesSpiky     0.954492
		montesFraction  0.652441
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000878226
		hillsFraction   0.819965
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249861
		craterFreq      0.268058
		craterDensity   0.651221
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.474233
		volcanoTemp     1532.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.246, 0.208, 0.190, 0.000)
		colorShelf     (0.261, 0.221, 0.202, 0.000)
		colorBeach     (0.277, 0.234, 0.214, 0.000)
		colorDesert    (0.292, 0.247, 0.226, 0.000)
		colorLowland   (0.307, 0.260, 0.238, 0.000)
		colorUpland    (0.323, 0.273, 0.250, 0.000)
		colorRock      (0.338, 0.286, 0.262, 0.000)
		colorSnow      (0.353, 0.299, 0.274, 1.000)
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
		SemiMajorAxis   3.62121
		Period          17.7101
		Eccentricity    0.921983
		Inclination     75.3238
		AscendingNode   147.486
		ArgOfPericenter 33.2844
		MeanAnomaly     -66.1763
	}
}

Comet	"C57"
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
	Color          (0.607 0.603 0.601)

	Surface
	{
		SurfStyle       0.873663
		OceanStyle      0.068002
		Randomize      (0.485, 0.365, 0.996)
		colorDistMagn   0.243462
		colorDistFreq   0.0414738
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
		mainFreq        0.446301
		terraceProb     0.462732
		erosion         0
		montesMagn      0.507021
		montesFreq      3.15872
		montesSpiky     0.874325
		montesFraction  0.505964
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.367502
		hillsFraction   0.647218
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220233
		craterFreq      0.228388
		craterDensity   0.977853
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.510564
		volcanoTemp     1308.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.206, 0.211, 0.240, 0.050)
		colorShelf     (0.243, 0.247, 0.276, 0.040)
		colorBeach     (0.279, 0.283, 0.312, 0.030)
		colorDesert    (0.316, 0.320, 0.354, 0.020)
		colorLowland   (0.352, 0.356, 0.390, 0.030)
		colorUpland    (0.388, 0.392, 0.426, 0.050)
		colorRock      (0.425, 0.428, 0.474, 0.020)
		colorSnow      (0.425, 0.428, 0.474, 1.000)
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
		SemiMajorAxis   2.8121
		Period          12.1196
		Eccentricity    0.949315
		Inclination     17.073
		AscendingNode   125.47
		ArgOfPericenter -38.4947
		MeanAnomaly     -25.3078
	}
}

Comet	"C58"
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
	Color          (0.808 0.721 0.665)

	Surface
	{
		SurfStyle       0.706231
		OceanStyle      0.0356794
		Randomize      (0.960, 0.397, -0.674)
		colorDistMagn   0.396879
		colorDistFreq   1.63784e-006
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
		mainFreq        0.417561
		terraceProb     0.220779
		erosion         0
		montesMagn      0.3139
		montesFreq      2.76357
		montesSpiky     0.991151
		montesFraction  0.414356
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.22591e-006
		hillsFraction   0.630516
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256066
		craterFreq      0.228766
		craterDensity   1.01448
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.487821
		volcanoTemp     1730.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.315, 0.245, 0.186, 0.000)
		colorShelf     (0.323, 0.252, 0.213, 0.000)
		colorBeach     (0.380, 0.295, 0.253, 0.000)
		colorDesert    (0.412, 0.317, 0.246, 0.000)
		colorLowland   (0.452, 0.339, 0.279, 0.000)
		colorUpland    (0.501, 0.411, 0.339, 0.000)
		colorRock      (0.541, 0.447, 0.366, 0.000)
		colorSnow      (0.590, 0.476, 0.385, 1.000)
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
		SemiMajorAxis   4.61731
		Period          25.4991
		Eccentricity    0.947016
		Inclination     28.2325
		AscendingNode   116.54
		ArgOfPericenter 178.547
		MeanAnomaly     179.029
	}
}

Comet	"C59"
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
	Color          (0.691 0.687 0.684)

	Surface
	{
		SurfStyle       0.485576
		OceanStyle      0.0020659
		Randomize      (0.451, 0.197, 0.659)
		colorDistMagn   0.813871
		colorDistFreq   0.000173686
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
		mainFreq        0.43628
		terraceProb     0.180686
		erosion         0
		montesMagn      0.49059
		montesFreq      2.40902
		montesSpiky     0.900445
		montesFraction  0.552186
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00145702
		hillsFraction   0.726513
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229663
		craterFreq      0.241876
		craterDensity   0.99332
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.497137
		volcanoTemp     1312.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.276, 0.275, 0.274, 0.000)
		colorShelf     (0.294, 0.292, 0.291, 0.000)
		colorBeach     (0.311, 0.309, 0.308, 0.000)
		colorDesert    (0.328, 0.326, 0.325, 0.000)
		colorLowland   (0.346, 0.344, 0.342, 0.000)
		colorUpland    (0.363, 0.361, 0.359, 0.000)
		colorRock      (0.380, 0.378, 0.376, 0.000)
		colorSnow      (0.397, 0.395, 0.393, 1.000)
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
		SemiMajorAxis   3.45459
		Period          16.502
		Eccentricity    0.908448
		Inclination     -25.9944
		AscendingNode   -141.605
		ArgOfPericenter -72.3307
		MeanAnomaly     113.289
	}
}

Comet	"C60"
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
	Color          (0.498 0.445 0.342)

	Surface
	{
		SurfStyle       0.127659
		OceanStyle      0.255847
		Randomize      (-0.015, 0.860, -0.069)
		colorDistMagn   0.286402
		colorDistFreq   0.110594
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
		mainFreq        0.578144
		terraceProb     0.185386
		erosion         0
		montesMagn      0.423462
		montesFreq      3.09836
		montesSpiky     0.961835
		montesFraction  0.336466
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.751152
		hillsFraction   0.506758
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220709
		craterFreq      0.18779
		craterDensity   0.934808
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.423566
		volcanoTemp     1155.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.199, 0.178, 0.137, 0.000)
		colorShelf     (0.211, 0.189, 0.145, 0.000)
		colorBeach     (0.224, 0.200, 0.154, 0.000)
		colorDesert    (0.236, 0.211, 0.162, 0.000)
		colorLowland   (0.249, 0.222, 0.171, 0.000)
		colorUpland    (0.261, 0.233, 0.180, 0.000)
		colorRock      (0.274, 0.245, 0.188, 0.000)
		colorSnow      (0.286, 0.256, 0.197, 1.000)
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
		SemiMajorAxis   4.18642
		Period          22.0143
		Eccentricity    0.949805
		Inclination     -146.205
		AscendingNode   177.306
		ArgOfPericenter 115.42
		MeanAnomaly     100.022
	}
}

Comet	"C61"
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
	Color          (0.742 0.738 0.736)

	Surface
	{
		SurfStyle       0.736006
		OceanStyle      0.448061
		Randomize      (-0.253, -0.583, -0.104)
		colorDistMagn   0.547546
		colorDistFreq   1.5012e-006
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
		mainFreq        0.714002
		terraceProb     0.510478
		erosion         0
		montesMagn      0.314414
		montesFreq      3.56612
		montesSpiky     0.986713
		montesFraction  0.328891
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.60319e-006
		hillsFraction   0.442712
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253389
		craterFreq      0.262853
		craterDensity   0.692627
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.538726
		volcanoTemp     1351.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.289, 0.251, 0.206, 0.000)
		colorShelf     (0.297, 0.258, 0.236, 0.000)
		colorBeach     (0.349, 0.303, 0.280, 0.000)
		colorDesert    (0.378, 0.325, 0.272, 0.000)
		colorLowland   (0.416, 0.347, 0.309, 0.000)
		colorUpland    (0.460, 0.421, 0.375, 0.000)
		colorRock      (0.497, 0.458, 0.405, 0.000)
		colorSnow      (0.542, 0.487, 0.427, 1.000)
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
		SemiMajorAxis   2.97364
		Period          13.1787
		Eccentricity    0.92753
		Inclination     -50.0641
		AscendingNode   -84.5988
		ArgOfPericenter 164.994
		MeanAnomaly     -144.671
	}
}

Comet	"C62"
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
	Color          (0.791 0.789 0.786)

	Surface
	{
		SurfStyle       0.411825
		OceanStyle      0.424143
		Randomize      (-0.954, 0.658, -0.537)
		colorDistMagn   0.746402
		colorDistFreq   0.000646124
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
		mainFreq        0.499096
		terraceProb     0.464928
		erosion         0
		montesMagn      0.551875
		montesFreq      2.85332
		montesSpiky     0.817495
		montesFraction  0.55379
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00256192
		hillsFraction   0.64587
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213522
		craterFreq      0.218778
		craterDensity   0.714267
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.444714
		volcanoTemp     1341.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.317, 0.316, 0.314, 0.000)
		colorShelf     (0.336, 0.335, 0.334, 0.000)
		colorBeach     (0.356, 0.355, 0.354, 0.000)
		colorDesert    (0.376, 0.375, 0.373, 0.000)
		colorLowland   (0.396, 0.394, 0.393, 0.000)
		colorUpland    (0.415, 0.414, 0.413, 0.000)
		colorRock      (0.435, 0.434, 0.432, 0.000)
		colorSnow      (0.455, 0.454, 0.452, 1.000)
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
		SemiMajorAxis   3.75556
		Period          18.7048
		Eccentricity    0.951143
		Inclination     23.3422
		AscendingNode   87.8229
		ArgOfPericenter 118.078
		MeanAnomaly     16.5125
	}
}

Comet	"C63"
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
	Color          (0.408 0.404 0.402)

	Surface
	{
		SurfStyle       0.348156
		OceanStyle      0.0733828
		Randomize      (0.907, -0.947, 0.028)
		colorDistMagn   0.718675
		colorDistFreq   0.174439
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
		mainFreq        0.600352
		terraceProb     0.329012
		erosion         0
		montesMagn      0.34471
		montesFreq      3.09715
		montesSpiky     0.941803
		montesFraction  0.592421
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.685813
		hillsFraction   0.505328
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224905
		craterFreq      0.248331
		craterDensity   0.864052
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.562625
		volcanoTemp     1660.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.163, 0.162, 0.161, 0.000)
		colorShelf     (0.174, 0.172, 0.171, 0.000)
		colorBeach     (0.184, 0.182, 0.181, 0.000)
		colorDesert    (0.194, 0.192, 0.191, 0.000)
		colorLowland   (0.204, 0.202, 0.201, 0.000)
		colorUpland    (0.214, 0.212, 0.211, 0.000)
		colorRock      (0.225, 0.222, 0.221, 0.000)
		colorSnow      (0.235, 0.232, 0.231, 1.000)
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
		SemiMajorAxis   2.47296
		Period          9.99464
		Eccentricity    0.912264
		Inclination     -98.3063
		AscendingNode   42.8959
		ArgOfPericenter 115.782
		MeanAnomaly     18.0405
	}
}

Comet	"C64"
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
	Color          (0.756 0.755 0.752)

	Surface
	{
		SurfStyle       0.0143818
		OceanStyle      0.121998
		Randomize      (-0.714, 0.438, -0.282)
		colorDistMagn   0.157633
		colorDistFreq   2.27789e-007
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
		mainFreq        0.5668
		terraceProb     0.550343
		erosion         0
		montesMagn      0.508803
		montesFreq      2.76012
		montesSpiky     0.877115
		montesFraction  0.751995
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.09245e-005
		hillsFraction   0.455866
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218147
		craterFreq      0.232674
		craterDensity   0.867825
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.541643
		volcanoTemp     1608.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.303, 0.302, 0.301, 0.000)
		colorShelf     (0.321, 0.321, 0.320, 0.000)
		colorBeach     (0.340, 0.340, 0.338, 0.000)
		colorDesert    (0.359, 0.358, 0.357, 0.000)
		colorLowland   (0.378, 0.377, 0.376, 0.000)
		colorUpland    (0.397, 0.396, 0.395, 0.000)
		colorRock      (0.416, 0.415, 0.414, 0.000)
		colorSnow      (0.435, 0.434, 0.432, 1.000)
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
		SemiMajorAxis   3.71183
		Period          18.379
		Eccentricity    0.943184
		Inclination     -64.2149
		AscendingNode   8.42976
		ArgOfPericenter -80.6878
		MeanAnomaly     -96.0336
	}
}

Comet	"C65"
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
	Color          (0.748 0.745 0.741)

	Surface
	{
		SurfStyle       0.683072
		OceanStyle      0.306091
		Randomize      (0.951, 0.618, -0.385)
		colorDistMagn   0.458852
		colorDistFreq   0.000673423
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
		mainFreq        0.333175
		terraceProb     0.251991
		erosion         0
		montesMagn      0.687369
		montesFreq      3.06077
		montesSpiky     0.975409
		montesFraction  0.616502
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00262822
		hillsFraction   0.71713
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.208388
		craterFreq      0.253273
		craterDensity   1.02668
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.488129
		volcanoTemp     1419.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.292, 0.253, 0.208, 0.000)
		colorShelf     (0.299, 0.261, 0.237, 0.000)
		colorBeach     (0.352, 0.305, 0.282, 0.000)
		colorDesert    (0.382, 0.328, 0.274, 0.000)
		colorLowland   (0.419, 0.350, 0.311, 0.000)
		colorUpland    (0.464, 0.424, 0.378, 0.000)
		colorRock      (0.501, 0.462, 0.408, 0.000)
		colorSnow      (0.546, 0.491, 0.430, 1.000)
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
		SemiMajorAxis   2.68107
		Period          11.2825
		Eccentricity    0.89271
		Inclination     -110.334
		AscendingNode   17.2774
		ArgOfPericenter 140.988
		MeanAnomaly     74.9112
	}
}

Comet	"C66"
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
	Color          (0.744 0.742 0.739)

	Surface
	{
		SurfStyle       0.63359
		OceanStyle      0.938621
		Randomize      (0.936, 0.838, -0.002)
		colorDistMagn   0.0224516
		colorDistFreq   0.394092
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
		mainFreq        0.412011
		terraceProb     0.217091
		erosion         0
		montesMagn      0.464447
		montesFreq      3.59379
		montesSpiky     0.889728
		montesFraction  0.829979
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.40216
		hillsFraction   0.62585
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252659
		craterFreq      0.225427
		craterDensity   0.922347
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.485674
		volcanoTemp     1452.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.290, 0.252, 0.207, 0.000)
		colorShelf     (0.298, 0.260, 0.237, 0.000)
		colorBeach     (0.350, 0.304, 0.281, 0.000)
		colorDesert    (0.380, 0.326, 0.273, 0.000)
		colorLowland   (0.417, 0.349, 0.310, 0.000)
		colorUpland    (0.461, 0.423, 0.377, 0.000)
		colorRock      (0.499, 0.460, 0.406, 0.000)
		colorSnow      (0.543, 0.490, 0.429, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		SemiMajorAxis   4.35542
		Period          23.3607
		Eccentricity    0.959811
		Inclination     -39.8064
		AscendingNode   55.2772
		ArgOfPericenter 106.234
		MeanAnomaly     -102.256
	}
}

Comet	"C67"
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
	Color          (0.580 0.574 0.568)

	Surface
	{
		SurfStyle       0.686587
		OceanStyle      0.054205
		Randomize      (0.689, -0.328, 0.513)
		colorDistMagn   0.240347
		colorDistFreq   1.85322e-006
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
		mainFreq        0.754081
		terraceProb     0.596438
		erosion         0
		montesMagn      0.615587
		montesFreq      2.84242
		montesSpiky     0.858694
		montesFraction  0.540804
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.24137e-005
		hillsFraction   0.516452
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.272075
		craterFreq      0.203115
		craterDensity   0.78478
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.522952
		volcanoTemp     1550.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.226, 0.195, 0.159, 0.000)
		colorShelf     (0.232, 0.201, 0.182, 0.000)
		colorBeach     (0.273, 0.235, 0.216, 0.000)
		colorDesert    (0.296, 0.253, 0.210, 0.000)
		colorLowland   (0.325, 0.270, 0.239, 0.000)
		colorUpland    (0.359, 0.327, 0.290, 0.000)
		colorRock      (0.388, 0.356, 0.312, 0.000)
		colorSnow      (0.423, 0.379, 0.329, 1.000)
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
		SemiMajorAxis   3.38594
		Period          16.0126
		Eccentricity    0.938259
		Inclination     151.625
		AscendingNode   -115.297
		ArgOfPericenter -42.8223
		MeanAnomaly     156.084
	}
}

Comet	"C68"
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
	Color          (0.803 0.774 0.730)

	Surface
	{
		SurfStyle       0.572005
		OceanStyle      0.211035
		Randomize      (-0.784, -0.541, -0.143)
		colorDistMagn   0.923167
		colorDistFreq   0.00151913
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
		mainFreq        0.685376
		terraceProb     0.381377
		erosion         0
		montesMagn      0.511853
		montesFreq      3.11057
		montesSpiky     0.94812
		montesFraction  0.269025
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0064592
		hillsFraction   0.398317
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238427
		craterFreq      0.165942
		craterDensity   1.04633
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.481595
		volcanoTemp     1230.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.313, 0.263, 0.204, 0.000)
		colorShelf     (0.321, 0.271, 0.234, 0.000)
		colorBeach     (0.378, 0.317, 0.277, 0.000)
		colorDesert    (0.410, 0.340, 0.270, 0.000)
		colorLowland   (0.450, 0.364, 0.307, 0.000)
		colorUpland    (0.498, 0.441, 0.372, 0.000)
		colorRock      (0.538, 0.480, 0.401, 0.000)
		colorSnow      (0.586, 0.511, 0.423, 1.000)
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
		SemiMajorAxis   4.12306
		Period          21.5164
		Eccentricity    0.958282
		Inclination     80.8745
		AscendingNode   -33.6553
		ArgOfPericenter -61.5261
		MeanAnomaly     9.74215
	}
}

Comet	"C69"
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
	Color          (0.430 0.425 0.418)

	Surface
	{
		SurfStyle       0.435561
		OceanStyle      0.64584
		Randomize      (-0.067, 0.741, 0.991)
		colorDistMagn   0.452663
		colorDistFreq   0.500455
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
		mainFreq        0.661994
		terraceProb     0.314497
		erosion         0
		montesMagn      0.447787
		montesFreq      3.07214
		montesSpiky     0.895032
		montesFraction  0.312142
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.81823
		hillsFraction   0.667203
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239812
		craterFreq      0.206141
		craterDensity   0.966661
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.47174
		volcanoTemp     1375.82
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.172, 0.170, 0.167, 0.000)
		colorShelf     (0.183, 0.181, 0.178, 0.000)
		colorBeach     (0.194, 0.191, 0.188, 0.000)
		colorDesert    (0.204, 0.202, 0.199, 0.000)
		colorLowland   (0.215, 0.213, 0.209, 0.000)
		colorUpland    (0.226, 0.223, 0.219, 0.000)
		colorRock      (0.237, 0.234, 0.230, 0.000)
		colorSnow      (0.247, 0.245, 0.240, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		SemiMajorAxis   2.96081
		Period          13.0936
		Eccentricity    0.947268
		Inclination     -60.9431
		AscendingNode   -46.6475
		ArgOfPericenter -24.0237
		MeanAnomaly     101.243
	}
}

Comet	"C70"
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
	Color          (0.723 0.637 0.507)

	Surface
	{
		SurfStyle       0.385903
		OceanStyle      0.84061
		Randomize      (0.858, -0.882, -0.596)
		colorDistMagn   0.103558
		colorDistFreq   6.32276e-006
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
		mainFreq        0.665803
		terraceProb     0.573496
		erosion         0
		montesMagn      0.675305
		montesFreq      3.65317
		montesSpiky     0.968569
		montesFraction  0.875493
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.67264e-005
		hillsFraction   0.581058
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219926
		craterFreq      0.228656
		craterDensity   0.711611
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.47639
		volcanoTemp     1807.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.289, 0.255, 0.203, 0.000)
		colorShelf     (0.307, 0.271, 0.215, 0.000)
		colorBeach     (0.325, 0.287, 0.228, 0.000)
		colorDesert    (0.343, 0.303, 0.241, 0.000)
		colorLowland   (0.361, 0.319, 0.253, 0.000)
		colorUpland    (0.379, 0.335, 0.266, 0.000)
		colorRock      (0.397, 0.350, 0.279, 0.000)
		colorSnow      (0.416, 0.366, 0.291, 1.000)
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
		SemiMajorAxis   3.50514
		Period          16.8655
		Eccentricity    0.936823
		Inclination     -175.051
		AscendingNode   -40.044
		ArgOfPericenter -131.11
		MeanAnomaly     137.532
	}
}

Comet	"C71"
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
	Color          (0.588 0.584 0.577)

	Surface
	{
		SurfStyle       0.208388
		OceanStyle      0.701725
		Randomize      (-0.740, -0.447, -0.155)
		colorDistMagn   0.333507
		colorDistFreq   7.49184e-005
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
		mainFreq        0.422502
		terraceProb     0.100952
		erosion         0
		montesMagn      0.467619
		montesFreq      2.55039
		montesSpiky     0.88991
		montesFraction  0.606532
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00526569
		hillsFraction   0.650062
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231848
		craterFreq      0.192004
		craterDensity   0.960932
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.576103
		volcanoTemp     1473.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.235, 0.234, 0.231, 0.000)
		colorShelf     (0.250, 0.248, 0.245, 0.000)
		colorBeach     (0.265, 0.263, 0.260, 0.000)
		colorDesert    (0.279, 0.277, 0.274, 0.000)
		colorLowland   (0.294, 0.292, 0.288, 0.000)
		colorUpland    (0.309, 0.307, 0.303, 0.000)
		colorRock      (0.324, 0.321, 0.317, 0.000)
		colorSnow      (0.338, 0.336, 0.332, 1.000)
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
		SemiMajorAxis   4.46909
		Period          24.2812
		Eccentricity    0.946829
		Inclination     155.988
		AscendingNode   178.197
		ArgOfPericenter 146.023
		MeanAnomaly     -114.991
	}
}

Comet	"C72"
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
	Color          (0.759 0.757 0.755)

	Surface
	{
		SurfStyle       0.303517
		OceanStyle      0.377612
		Randomize      (0.123, 0.800, 0.203)
		colorDistMagn   0.225173
		colorDistFreq   0.31195
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
		mainFreq        0.487939
		terraceProb     0.218221
		erosion         0
		montesMagn      0.657701
		montesFreq      2.95163
		montesSpiky     0.924576
		montesFraction  0.540544
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.31823
		hillsFraction   0.502362
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251527
		craterFreq      0.225373
		craterDensity   0.773336
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51062
		volcanoTemp     1399.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.304, 0.303, 0.302, 0.000)
		colorShelf     (0.323, 0.322, 0.321, 0.000)
		colorBeach     (0.342, 0.341, 0.340, 0.000)
		colorDesert    (0.361, 0.360, 0.359, 0.000)
		colorLowland   (0.380, 0.378, 0.377, 0.000)
		colorUpland    (0.399, 0.397, 0.396, 0.000)
		colorRock      (0.418, 0.416, 0.415, 0.000)
		colorSnow      (0.437, 0.435, 0.434, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		SemiMajorAxis   2.41613
		Period          9.65212
		Eccentricity    0.91389
		Inclination     -167.567
		AscendingNode   -94.2052
		ArgOfPericenter 126.767
		MeanAnomaly     6.00452
	}
}

Comet	"C73"
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
	Color          (0.764 0.761 0.759)

	Surface
	{
		SurfStyle       0.400166
		OceanStyle      0.293268
		Randomize      (0.430, -0.924, -0.749)
		colorDistMagn   0.920534
		colorDistFreq   1.5381e-006
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
		mainFreq        0.578216
		terraceProb     0.540776
		erosion         0
		montesMagn      0.541316
		montesFreq      3.19992
		montesSpiky     0.975093
		montesFraction  0.353162
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.22358e-005
		hillsFraction   0.72637
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235573
		craterFreq      0.264029
		craterDensity   0.939912
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.481484
		volcanoTemp     1706.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.306, 0.304, 0.304, 0.000)
		colorShelf     (0.325, 0.323, 0.323, 0.000)
		colorBeach     (0.344, 0.342, 0.342, 0.000)
		colorDesert    (0.363, 0.361, 0.361, 0.000)
		colorLowland   (0.382, 0.380, 0.380, 0.000)
		colorUpland    (0.401, 0.399, 0.399, 0.000)
		colorRock      (0.420, 0.418, 0.418, 0.000)
		colorSnow      (0.439, 0.437, 0.437, 1.000)
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
		SemiMajorAxis   3.4482
		Period          16.4562
		Eccentricity    0.928101
		Inclination     80.3163
		AscendingNode   18.2633
		ArgOfPericenter -102.574
		MeanAnomaly     -25.1735
	}
}

Comet	"C74"
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
	Color          (0.676 0.673 0.670)

	Surface
	{
		SurfStyle       0.0660195
		OceanStyle      0.312372
		Randomize      (0.489, -0.929, -0.071)
		colorDistMagn   0.560561
		colorDistFreq   0.00322195
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
		mainFreq        0.38833
		terraceProb     0.443176
		erosion         0
		montesMagn      0.594223
		montesFreq      2.89314
		montesSpiky     0.928486
		montesFraction  0.57725
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0172696
		hillsFraction   0.635012
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214668
		craterFreq      0.224615
		craterDensity   0.89702
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.452294
		volcanoTemp     1425.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.270, 0.269, 0.268, 0.000)
		colorShelf     (0.287, 0.286, 0.285, 0.000)
		colorBeach     (0.304, 0.303, 0.302, 0.000)
		colorDesert    (0.321, 0.320, 0.318, 0.000)
		colorLowland   (0.338, 0.336, 0.335, 0.000)
		colorUpland    (0.355, 0.353, 0.352, 0.000)
		colorRock      (0.372, 0.370, 0.369, 0.000)
		colorSnow      (0.389, 0.387, 0.385, 1.000)
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
		SemiMajorAxis   2.85745
		Period          12.414
		Eccentricity    0.977345
		Inclination     28.8112
		AscendingNode   48.4201
		ArgOfPericenter 43.5227
		MeanAnomaly     121.505
	}
}

Comet	"C75"
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
	Color          (0.464 0.462 0.459)

	Surface
	{
		SurfStyle       0.25632
		OceanStyle      0.73246
		Randomize      (0.551, -0.714, -0.477)
		colorDistMagn   0.189876
		colorDistFreq   0.717455
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
		mainFreq        0.356481
		terraceProb     0.332647
		erosion         0
		montesMagn      0.396679
		montesFreq      2.6418
		montesSpiky     0.878014
		montesFraction  0.690484
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.60073
		hillsFraction   0.608282
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24863
		craterFreq      0.19472
		craterDensity   0.948927
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.525482
		volcanoTemp     1179.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.186, 0.185, 0.184, 0.000)
		colorShelf     (0.197, 0.196, 0.195, 0.000)
		colorBeach     (0.209, 0.208, 0.206, 0.000)
		colorDesert    (0.220, 0.219, 0.218, 0.000)
		colorLowland   (0.232, 0.231, 0.229, 0.000)
		colorUpland    (0.244, 0.243, 0.241, 0.000)
		colorRock      (0.255, 0.254, 0.252, 0.000)
		colorSnow      (0.267, 0.266, 0.264, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		SemiMajorAxis   3.23402
		Period          14.947
		Eccentricity    0.915956
		Inclination     47.6353
		AscendingNode   -153.604
		ArgOfPericenter -91.2891
		MeanAnomaly     -178.646
	}
}

Comet	"C76"
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
	Color          (0.652 0.650 0.647)

	Surface
	{
		SurfStyle       0.619595
		OceanStyle      0.0790608
		Randomize      (0.927, 0.245, -0.967)
		colorDistMagn   0.0643671
		colorDistFreq   1.29772e-005
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
		mainFreq        0.355313
		terraceProb     0.112019
		erosion         0
		montesMagn      0.463886
		montesFreq      2.92888
		montesSpiky     0.905408
		montesFraction  0.603327
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.97378e-005
		hillsFraction   0.592492
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225273
		craterFreq      0.174986
		craterDensity   0.911014
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.459848
		volcanoTemp     1002.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.254, 0.221, 0.181, 0.000)
		colorShelf     (0.261, 0.228, 0.207, 0.000)
		colorBeach     (0.307, 0.267, 0.246, 0.000)
		colorDesert    (0.333, 0.286, 0.239, 0.000)
		colorLowland   (0.365, 0.306, 0.272, 0.000)
		colorUpland    (0.404, 0.371, 0.330, 0.000)
		colorRock      (0.437, 0.403, 0.356, 0.000)
		colorSnow      (0.476, 0.429, 0.375, 1.000)
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
		SemiMajorAxis   4.48185
		Period          24.3853
		Eccentricity    0.946913
		Inclination     160.119
		AscendingNode   43.2821
		ArgOfPericenter -79.0928
		MeanAnomaly     138.479
	}
}

Comet	"C77"
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
	Color          (0.707 0.706 0.703)

	Surface
	{
		SurfStyle       0.122029
		OceanStyle      0.247188
		Randomize      (0.603, -0.530, 0.033)
		colorDistMagn   0.926664
		colorDistFreq   0.00447983
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
		mainFreq        0.49579
		terraceProb     0.179988
		erosion         0
		montesMagn      0.342557
		montesFreq      2.04415
		montesSpiky     0.964203
		montesFraction  0.520603
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.011046
		hillsFraction   0.557627
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224295
		craterFreq      0.237227
		craterDensity   1.01118
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.500194
		volcanoTemp     1601.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.283, 0.282, 0.281, 0.000)
		colorShelf     (0.301, 0.300, 0.299, 0.000)
		colorBeach     (0.318, 0.318, 0.316, 0.000)
		colorDesert    (0.336, 0.335, 0.334, 0.000)
		colorLowland   (0.354, 0.353, 0.352, 0.000)
		colorUpland    (0.371, 0.371, 0.369, 0.000)
		colorRock      (0.389, 0.388, 0.387, 0.000)
		colorSnow      (0.407, 0.406, 0.404, 1.000)
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
		SemiMajorAxis   3.36797
		Period          15.8852
		Eccentricity    0.949113
		Inclination     17.5658
		AscendingNode   -48.4706
		ArgOfPericenter -63.7206
		MeanAnomaly     -118.642
	}
}

Comet	"C78"
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
	Color          (0.593 0.586 0.582)

	Surface
	{
		SurfStyle       0.0254227
		OceanStyle      0.978234
		Randomize      (0.421, 0.213, -0.542)
		colorDistMagn   0.567829
		colorDistFreq   0.228357
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
		mainFreq        0.609719
		terraceProb     0.204318
		erosion         0
		montesMagn      0.517355
		montesFreq      2.12707
		montesSpiky     0.90272
		montesFraction  0.644213
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.349
		hillsFraction   0.552357
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218234
		craterFreq      0.194164
		craterDensity   1.07413
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.558989
		volcanoTemp     1402.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.237, 0.234, 0.233, 0.000)
		colorShelf     (0.252, 0.249, 0.247, 0.000)
		colorBeach     (0.267, 0.264, 0.262, 0.000)
		colorDesert    (0.282, 0.278, 0.276, 0.000)
		colorLowland   (0.297, 0.293, 0.291, 0.000)
		colorUpland    (0.311, 0.308, 0.306, 0.000)
		colorRock      (0.326, 0.322, 0.320, 0.000)
		colorSnow      (0.341, 0.337, 0.335, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		SemiMajorAxis   3.48885
		Period          16.7481
		Eccentricity    0.934355
		Inclination     170.52
		AscendingNode   -94.7622
		ArgOfPericenter 41.7096
		MeanAnomaly     38.6106
	}
}

Comet	"C79"
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
	Color          (0.567 0.562 0.559)

	Surface
	{
		SurfStyle       0.0113284
		OceanStyle      0.679246
		Randomize      (-0.834, 0.002, 0.526)
		colorDistMagn   0.839177
		colorDistFreq   1.16083e-005
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
		mainFreq        0.661059
		terraceProb     0.113423
		erosion         0
		montesMagn      0.507938
		montesFreq      3.32714
		montesSpiky     0.93865
		montesFraction  0.415848
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.86575e-005
		hillsFraction   0.728317
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.216576
		craterFreq      0.227126
		craterDensity   0.879484
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.516404
		volcanoTemp     1088.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.227, 0.225, 0.224, 0.000)
		colorShelf     (0.241, 0.239, 0.238, 0.000)
		colorBeach     (0.255, 0.253, 0.252, 0.000)
		colorDesert    (0.269, 0.267, 0.266, 0.000)
		colorLowland   (0.284, 0.281, 0.280, 0.000)
		colorUpland    (0.298, 0.295, 0.294, 0.000)
		colorRock      (0.312, 0.309, 0.308, 0.000)
		colorSnow      (0.326, 0.323, 0.322, 1.000)
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
		SemiMajorAxis   3.41111
		Period          16.1914
		Eccentricity    0.93548
		Inclination     142.582
		AscendingNode   13.4476
		ArgOfPericenter -93.6411
		MeanAnomaly     -26.9009
	}
}

Comet	"C80"
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
	Color          (0.636 0.631 0.626)

	Surface
	{
		SurfStyle       0.119428
		OceanStyle      0.869843
		Randomize      (0.777, 0.886, 0.446)
		colorDistMagn   0.630573
		colorDistFreq   0.00559564
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
		mainFreq        0.478901
		terraceProb     0.170048
		erosion         0
		montesMagn      0.575939
		montesFreq      2.89683
		montesSpiky     0.963959
		montesFraction  0.224182
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0281499
		hillsFraction   0.767836
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.204506
		craterFreq      0.202773
		craterDensity   0.961285
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.514849
		volcanoTemp     1535.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.254, 0.252, 0.250, 0.000)
		colorShelf     (0.270, 0.268, 0.266, 0.000)
		colorBeach     (0.286, 0.284, 0.282, 0.000)
		colorDesert    (0.302, 0.300, 0.297, 0.000)
		colorLowland   (0.318, 0.315, 0.313, 0.000)
		colorUpland    (0.334, 0.331, 0.328, 0.000)
		colorRock      (0.350, 0.347, 0.344, 0.000)
		colorSnow      (0.366, 0.363, 0.360, 1.000)
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
		SemiMajorAxis   3.65683
		Period          17.9721
		Eccentricity    0.941001
		Inclination     62.3816
		AscendingNode   -10.4335
		ArgOfPericenter 62.9594
		MeanAnomaly     162.462
	}
}

Comet	"C81"
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
	Color          (0.555 0.549 0.542)

	Surface
	{
		SurfStyle       0.601447
		OceanStyle      0.765268
		Randomize      (0.260, 0.333, -0.088)
		colorDistMagn   0.669079
		colorDistFreq   0.467713
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
		mainFreq        0.730325
		terraceProb     0.732465
		erosion         0
		montesMagn      0.502433
		montesFreq      3.068
		montesSpiky     0.880785
		montesFraction  0.703736
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.19158
		hillsFraction   0.862675
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.267021
		craterFreq      0.215894
		craterDensity   1.0315
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.575812
		volcanoTemp     1467.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.216, 0.187, 0.152, 0.000)
		colorShelf     (0.222, 0.192, 0.173, 0.000)
		colorBeach     (0.261, 0.225, 0.206, 0.000)
		colorDesert    (0.283, 0.242, 0.201, 0.000)
		colorLowland   (0.311, 0.258, 0.228, 0.000)
		colorUpland    (0.344, 0.313, 0.276, 0.000)
		colorRock      (0.372, 0.340, 0.298, 0.000)
		colorSnow      (0.405, 0.362, 0.314, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		SemiMajorAxis   3.60272
		Period          17.5747
		Eccentricity    0.950952
		Inclination     99.3412
		AscendingNode   130.053
		ArgOfPericenter -50.5433
		MeanAnomaly     84.2281
	}
}

Comet	"C82"
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
	Color          (0.670 0.625 0.577)

	Surface
	{
		SurfStyle       0.407774
		OceanStyle      0.391713
		Randomize      (0.411, -0.361, 0.418)
		colorDistMagn   0.465804
		colorDistFreq   2.05029e-005
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
		mainFreq        0.667383
		terraceProb     0.440405
		erosion         0
		montesMagn      0.473659
		montesFreq      2.8186
		montesSpiky     0.905246
		montesFraction  0.867809
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.23165e-005
		hillsFraction   0.831843
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238391
		craterFreq      0.237152
		craterDensity   0.931177
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.496016
		volcanoTemp     1614.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.268, 0.250, 0.231, 0.000)
		colorShelf     (0.285, 0.266, 0.245, 0.000)
		colorBeach     (0.301, 0.281, 0.260, 0.000)
		colorDesert    (0.318, 0.297, 0.274, 0.000)
		colorLowland   (0.335, 0.312, 0.288, 0.000)
		colorUpland    (0.352, 0.328, 0.303, 0.000)
		colorRock      (0.368, 0.344, 0.317, 0.000)
		colorSnow      (0.385, 0.359, 0.332, 1.000)
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
		SemiMajorAxis   2.97176
		Period          13.1663
		Eccentricity    0.897093
		Inclination     -41.1441
		AscendingNode   5.48554
		ArgOfPericenter -128.37
		MeanAnomaly     93.6176
	}
}

Comet	"C83"
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
	Color          (0.612 0.609 0.606)

	Surface
	{
		SurfStyle       0.567556
		OceanStyle      0.585143
		Randomize      (0.245, -0.838, 0.618)
		colorDistMagn   0.418348
		colorDistFreq   0.00534021
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
		mainFreq        0.497209
		terraceProb     0.479198
		erosion         0
		montesMagn      0.522964
		montesFreq      2.76705
		montesSpiky     0.972567
		montesFraction  0.818848
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0303806
		hillsFraction   0.698425
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.203287
		craterFreq      0.173214
		craterDensity   0.837709
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.494553
		volcanoTemp     1485.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.239, 0.207, 0.170, 0.000)
		colorShelf     (0.245, 0.213, 0.194, 0.000)
		colorBeach     (0.288, 0.250, 0.230, 0.000)
		colorDesert    (0.312, 0.268, 0.224, 0.000)
		colorLowland   (0.343, 0.286, 0.254, 0.000)
		colorUpland    (0.380, 0.347, 0.309, 0.000)
		colorRock      (0.410, 0.377, 0.333, 0.000)
		colorSnow      (0.447, 0.402, 0.351, 1.000)
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
		SemiMajorAxis   3.75652
		Period          18.712
		Eccentricity    0.929588
		Inclination     62.5096
		AscendingNode   157.133
		ArgOfPericenter 97.3129
		MeanAnomaly     32.1715
	}
}

Comet	"C84"
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
	Color          (0.673 0.667 0.665)

	Surface
	{
		SurfStyle       0.489702
		OceanStyle      0.432123
		Randomize      (0.361, 0.180, -0.688)
		colorDistMagn   0.548522
		colorDistFreq   5.21584
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
		mainFreq        0.277214
		terraceProb     0.452922
		erosion         0
		montesMagn      0.491742
		montesFreq      2.87883
		montesSpiky     0.870011
		montesFraction  0.693826
		dunesFraction   0
		hillsMagn       0
		hillsFreq       16.0826
		hillsFraction   0.496827
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235372
		craterFreq      0.259079
		craterDensity   0.820658
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.428322
		volcanoTemp     1269.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.269, 0.267, 0.266, 0.000)
		colorShelf     (0.286, 0.284, 0.283, 0.000)
		colorBeach     (0.303, 0.300, 0.299, 0.000)
		colorDesert    (0.320, 0.317, 0.316, 0.000)
		colorLowland   (0.336, 0.334, 0.332, 0.000)
		colorUpland    (0.353, 0.350, 0.349, 0.000)
		colorRock      (0.370, 0.367, 0.366, 0.000)
		colorSnow      (0.387, 0.384, 0.382, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		SemiMajorAxis   3.27198
		Period          15.211
		Eccentricity    0.943458
		Inclination     8.95663
		AscendingNode   -57.8342
		ArgOfPericenter 102.842
		MeanAnomaly     -4.67982
	}
}

Comet	"C85"
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
	Color          (0.670 0.668 0.663)

	Surface
	{
		SurfStyle       0.302972
		OceanStyle      0.951005
		Randomize      (-0.212, 0.021, -0.257)
		colorDistMagn   0.33372
		colorDistFreq   3.90585e-005
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
		mainFreq        0.59351
		terraceProb     0.272603
		erosion         0
		montesMagn      0.473296
		montesFreq      3.3343
		montesSpiky     0.942348
		montesFraction  0.583273
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000120376
		hillsFraction   0.615154
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243367
		craterFreq      0.193178
		craterDensity   0.755668
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.486783
		volcanoTemp     1427.92
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.268, 0.267, 0.265, 0.000)
		colorShelf     (0.285, 0.284, 0.282, 0.000)
		colorBeach     (0.302, 0.301, 0.298, 0.000)
		colorDesert    (0.318, 0.317, 0.315, 0.000)
		colorLowland   (0.335, 0.334, 0.331, 0.000)
		colorUpland    (0.352, 0.351, 0.348, 0.000)
		colorRock      (0.369, 0.367, 0.365, 0.000)
		colorSnow      (0.385, 0.384, 0.381, 1.000)
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
		SemiMajorAxis   3.22924
		Period          14.9139
		Eccentricity    0.934129
		Inclination     81.0924
		AscendingNode   -119.379
		ArgOfPericenter 2.35378
		MeanAnomaly     137.025
	}
}

Comet	"C86"
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
	Color          (0.489 0.486 0.482)

	Surface
	{
		SurfStyle       0.519093
		OceanStyle      0.941578
		Randomize      (0.802, 0.013, 0.374)
		colorDistMagn   0.277969
		colorDistFreq   0.00929445
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
		mainFreq        0.564534
		terraceProb     0.129632
		erosion         0
		montesMagn      0.491066
		montesFreq      3.58348
		montesSpiky     0.98449
		montesFraction  0.5834
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0811614
		hillsFraction   0.645561
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.20816
		craterFreq      0.24441
		craterDensity   0.819085
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.567967
		volcanoTemp     1298.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.191, 0.165, 0.135, 0.000)
		colorShelf     (0.196, 0.170, 0.154, 0.000)
		colorBeach     (0.230, 0.199, 0.183, 0.000)
		colorDesert    (0.249, 0.214, 0.178, 0.000)
		colorLowland   (0.274, 0.228, 0.202, 0.000)
		colorUpland    (0.303, 0.277, 0.246, 0.000)
		colorRock      (0.327, 0.301, 0.265, 0.000)
		colorSnow      (0.357, 0.321, 0.280, 1.000)
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
		SemiMajorAxis   4.23813
		Period          22.4235
		Eccentricity    0.93139
		Inclination     135.138
		AscendingNode   27.2474
		ArgOfPericenter 160.565
		MeanAnomaly     79.6151
	}
}

Comet	"C87"
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
	Color          (0.704 0.702 0.699)

	Surface
	{
		SurfStyle       0.832549
		OceanStyle      0.924891
		Randomize      (-0.763, 0.372, 0.776)
		colorDistMagn   0.508097
		colorDistFreq   3.16248
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
		mainFreq        0.438487
		terraceProb     0.239305
		erosion         0
		montesMagn      0.436008
		montesFreq      3.07888
		montesSpiky     0.954888
		montesFraction  0.590096
		dunesFraction   0
		hillsMagn       0
		hillsFreq       18.919
		hillsFraction   0.570933
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262449
		craterFreq      0.279621
		craterDensity   0.855718
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.565739
		volcanoTemp     1389.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.274, 0.239, 0.196, 0.000)
		colorShelf     (0.281, 0.246, 0.224, 0.000)
		colorBeach     (0.331, 0.288, 0.266, 0.000)
		colorDesert    (0.359, 0.309, 0.259, 0.000)
		colorLowland   (0.394, 0.330, 0.294, 0.000)
		colorUpland    (0.436, 0.400, 0.357, 0.000)
		colorRock      (0.471, 0.435, 0.385, 0.000)
		colorSnow      (0.514, 0.463, 0.406, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		SemiMajorAxis   3.50183
		Period          16.8416
		Eccentricity    0.921514
		Inclination     17.2615
		AscendingNode   21.3661
		ArgOfPericenter 119.645
		MeanAnomaly     26.9434
	}
}

Comet	"C88"
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
	Color          (0.602 0.597 0.590)

	Surface
	{
		SurfStyle       0.912375
		OceanStyle      0.720605
		Randomize      (-0.446, 0.201, 0.685)
		colorDistMagn   0.585989
		colorDistFreq   1.95708e-005
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
		mainFreq        0.323451
		terraceProb     0.292432
		erosion         0
		montesMagn      0.601372
		montesFreq      3.69655
		montesSpiky     0.812325
		montesFraction  0.107571
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000229221
		hillsFraction   0.616018
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220456
		craterFreq      0.226376
		craterDensity   0.760757
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.479779
		volcanoTemp     1907.25
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.205, 0.209, 0.236, 0.050)
		colorShelf     (0.241, 0.245, 0.272, 0.040)
		colorBeach     (0.277, 0.280, 0.307, 0.030)
		colorDesert    (0.313, 0.316, 0.348, 0.020)
		colorLowland   (0.349, 0.352, 0.384, 0.030)
		colorUpland    (0.385, 0.388, 0.419, 0.050)
		colorRock      (0.421, 0.424, 0.466, 0.020)
		colorSnow      (0.421, 0.424, 0.466, 1.000)
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
		SemiMajorAxis   4.0231
		Period          20.7388
		Eccentricity    0.970962
		Inclination     -16.6296
		AscendingNode   77.8554
		ArgOfPericenter -139.177
		MeanAnomaly     8.98935
	}
}

Comet	"C89"
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
	Color          (0.524 0.428 0.395)

	Surface
	{
		SurfStyle       0.93501
		OceanStyle      0.857301
		Randomize      (0.345, -0.519, -0.435)
		colorDistMagn   0.925139
		colorDistFreq   0.0160628
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
		mainFreq        0.727228
		terraceProb     0.313071
		erosion         0
		montesMagn      0.666309
		montesFreq      3.14311
		montesSpiky     0.867161
		montesFraction  0.527573
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0685394
		hillsFraction   0.654686
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240294
		craterFreq      0.259461
		craterDensity   0.931317
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.530395
		volcanoTemp     1430.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.178, 0.150, 0.158, 0.050)
		colorShelf     (0.210, 0.175, 0.182, 0.040)
		colorBeach     (0.241, 0.201, 0.205, 0.030)
		colorDesert    (0.272, 0.227, 0.233, 0.020)
		colorLowland   (0.304, 0.252, 0.257, 0.030)
		colorUpland    (0.335, 0.278, 0.280, 0.050)
		colorRock      (0.367, 0.304, 0.312, 0.020)
		colorSnow      (0.367, 0.304, 0.312, 1.000)
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
		SemiMajorAxis   3.57194
		Period          17.3499
		Eccentricity    0.94564
		Inclination     47.6832
		AscendingNode   112.399
		ArgOfPericenter 31.3433
		MeanAnomaly     -103.969
	}
}

Comet	"C90"
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
	Color          (0.759 0.756 0.752)

	Surface
	{
		SurfStyle       0.245785
		OceanStyle      0.879991
		Randomize      (0.046, -0.295, -0.511)
		colorDistMagn   0.375408
		colorDistFreq   7.66429
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
		mainFreq        0.537961
		terraceProb     0.106312
		erosion         0
		montesMagn      0.484307
		montesFreq      2.40758
		montesSpiky     0.86709
		montesFraction  0.323049
		dunesFraction   0
		hillsMagn       0
		hillsFreq       29.3273
		hillsFraction   0.713776
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228263
		craterFreq      0.484427
		craterDensity   0.993356
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.504522
		volcanoTemp     1408.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.304, 0.302, 0.301, 0.000)
		colorShelf     (0.322, 0.321, 0.320, 0.000)
		colorBeach     (0.341, 0.340, 0.339, 0.000)
		colorDesert    (0.360, 0.359, 0.357, 0.000)
		colorLowland   (0.379, 0.378, 0.376, 0.000)
		colorUpland    (0.398, 0.397, 0.395, 0.000)
		colorRock      (0.417, 0.416, 0.414, 0.000)
		colorSnow      (0.436, 0.435, 0.433, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		SemiMajorAxis   2.38075
		Period          9.44086
		Eccentricity    0.910866
		Inclination     155.723
		AscendingNode   44.1152
		ArgOfPericenter 17.3963
		MeanAnomaly     30.5124
	}
}

Comet	"C91"
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
	Color          (0.620 0.612 0.610)

	Surface
	{
		SurfStyle       0.455785
		OceanStyle      0.394513
		Randomize      (0.385, -0.647, 0.786)
		colorDistMagn   0.163769
		colorDistFreq   6.42357e-005
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
		mainFreq        0.339552
		terraceProb     0.154804
		erosion         0
		montesMagn      0.477477
		montesFreq      2.38847
		montesSpiky     0.82486
		montesFraction  0.384284
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000183119
		hillsFraction   0.665859
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237868
		craterFreq      0.17322
		craterDensity   0.989585
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.489418
		volcanoTemp     1182.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.248, 0.245, 0.244, 0.000)
		colorShelf     (0.264, 0.260, 0.259, 0.000)
		colorBeach     (0.279, 0.276, 0.274, 0.000)
		colorDesert    (0.295, 0.291, 0.290, 0.000)
		colorLowland   (0.310, 0.306, 0.305, 0.000)
		colorUpland    (0.326, 0.322, 0.320, 0.000)
		colorRock      (0.341, 0.337, 0.335, 0.000)
		colorSnow      (0.357, 0.352, 0.351, 1.000)
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
		SemiMajorAxis   4.63815
		Period          25.6719
		Eccentricity    0.9554
		Inclination     -72.6534
		AscendingNode   88.6945
		ArgOfPericenter 33.6527
		MeanAnomaly     -105.268
	}
}

Comet	"C92"
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
	Color          (0.648 0.474 0.413)

	Surface
	{
		SurfStyle       0.121871
		OceanStyle      0.0497557
		Randomize      (0.527, 0.102, -0.913)
		colorDistMagn   0.416988
		colorDistFreq   0.0267356
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
		mainFreq        0.694816
		terraceProb     0.220682
		erosion         0
		montesMagn      0.376493
		montesFreq      4.40461
		montesSpiky     0.979604
		montesFraction  0.812883
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.126411
		hillsFraction   0.473629
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.215558
		craterFreq      0.205595
		craterDensity   1.00148
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.5247
		volcanoTemp     1390.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.259, 0.190, 0.165, 0.000)
		colorShelf     (0.275, 0.202, 0.175, 0.000)
		colorBeach     (0.292, 0.213, 0.186, 0.000)
		colorDesert    (0.308, 0.225, 0.196, 0.000)
		colorLowland   (0.324, 0.237, 0.206, 0.000)
		colorUpland    (0.340, 0.249, 0.217, 0.000)
		colorRock      (0.356, 0.261, 0.227, 0.000)
		colorSnow      (0.373, 0.273, 0.237, 1.000)
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
		SemiMajorAxis   3.72014
		Period          18.4408
		Eccentricity    0.937209
		Inclination     45.438
		AscendingNode   -54.8314
		ArgOfPericenter 170.024
		MeanAnomaly     -117.523
	}
}

Comet	"C93"
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
	Color          (0.468 0.464 0.458)

	Surface
	{
		SurfStyle       0.328056
		OceanStyle      0.372269
		Randomize      (-0.667, 0.591, 0.382)
		colorDistMagn   0.570714
		colorDistFreq   9.86871
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
		mainFreq        0.412783
		terraceProb     0.166402
		erosion         0
		montesMagn      0.268041
		montesFreq      3.60525
		montesSpiky     0.983094
		montesFraction  0.713736
		dunesFraction   0
		hillsMagn       0
		hillsFreq       49.2228
		hillsFraction   0.614994
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229454
		craterFreq      0.542126
		craterDensity   1.06576
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.517472
		volcanoTemp     1324.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.187, 0.186, 0.183, 0.000)
		colorShelf     (0.199, 0.197, 0.195, 0.000)
		colorBeach     (0.211, 0.209, 0.206, 0.000)
		colorDesert    (0.222, 0.220, 0.218, 0.000)
		colorLowland   (0.234, 0.232, 0.229, 0.000)
		colorUpland    (0.246, 0.244, 0.241, 0.000)
		colorRock      (0.257, 0.255, 0.252, 0.000)
		colorSnow      (0.269, 0.267, 0.264, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		SemiMajorAxis   3.62119
		Period          17.71
		Eccentricity    0.947085
		Inclination     -104.108
		AscendingNode   -170.561
		ArgOfPericenter -133.725
		MeanAnomaly     172.723
	}
}

Comet	"C94"
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
	Color          (0.813 0.744 0.682)

	Surface
	{
		SurfStyle       0.28615
		OceanStyle      0.425841
		Randomize      (-0.294, -0.650, 0.480)
		colorDistMagn   0.626463
		colorDistFreq   9.08934e-005
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
		mainFreq        0.617594
		terraceProb     0.309847
		erosion         0
		montesMagn      0.518243
		montesFreq      2.94468
		montesSpiky     0.978416
		montesFraction  0.880839
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000467061
		hillsFraction   0.574276
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245649
		craterFreq      0.273794
		craterDensity   0.864012
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.435034
		volcanoTemp     1317.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.325, 0.298, 0.273, 0.000)
		colorShelf     (0.345, 0.316, 0.290, 0.000)
		colorBeach     (0.366, 0.335, 0.307, 0.000)
		colorDesert    (0.386, 0.354, 0.324, 0.000)
		colorLowland   (0.406, 0.372, 0.341, 0.000)
		colorUpland    (0.427, 0.391, 0.358, 0.000)
		colorRock      (0.447, 0.409, 0.375, 0.000)
		colorSnow      (0.467, 0.428, 0.392, 1.000)
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
		SemiMajorAxis   2.85634
		Period          12.4067
		Eccentricity    0.94957
		Inclination     -165.49
		AscendingNode   -82.3111
		ArgOfPericenter -64.8913
		MeanAnomaly     153.539
	}
}

Comet	"C95"
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
	Color          (0.568 0.567 0.564)

	Surface
	{
		SurfStyle       0.238648
		OceanStyle      0.459721
		Randomize      (-0.805, 0.734, 0.516)
		colorDistMagn   0.171836
		colorDistFreq   0.0149301
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
		mainFreq        0.636776
		terraceProb     0.100873
		erosion         0
		montesMagn      0.65599
		montesFreq      3.47064
		montesSpiky     0.904123
		montesFraction  0.315987
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.120307
		hillsFraction   0.592793
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.215388
		craterFreq      0.216833
		craterDensity   0.887233
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.389002
		volcanoTemp     1488.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.227, 0.227, 0.226, 0.000)
		colorShelf     (0.242, 0.241, 0.240, 0.000)
		colorBeach     (0.256, 0.255, 0.254, 0.000)
		colorDesert    (0.270, 0.269, 0.268, 0.000)
		colorLowland   (0.284, 0.283, 0.282, 0.000)
		colorUpland    (0.298, 0.297, 0.296, 0.000)
		colorRock      (0.313, 0.312, 0.310, 0.000)
		colorSnow      (0.327, 0.326, 0.324, 1.000)
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
		SemiMajorAxis   4.0712
		Period          21.1118
		Eccentricity    0.945921
		Inclination     -13.5627
		AscendingNode   -107.202
		ArgOfPericenter -15.6379
		MeanAnomaly     134.301
	}
}

Comet	"C96"
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
	Color          (0.725 0.722 0.721)

	Surface
	{
		SurfStyle       0.502305
		OceanStyle      0.201528
		Randomize      (0.004, 0.344, -0.435)
		colorDistMagn   0.313972
		colorDistFreq   6.5919e-007
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
		mainFreq        0.445654
		terraceProb     0.386839
		erosion         0
		montesMagn      0.503197
		montesFreq      2.53553
		montesSpiky     0.821507
		montesFraction  0.528994
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.88101e-006
		hillsFraction   0.49191
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223761
		craterFreq      0.213031
		craterDensity   0.953458
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.533481
		volcanoTemp     1474.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.283, 0.246, 0.202, 0.000)
		colorShelf     (0.290, 0.253, 0.231, 0.000)
		colorBeach     (0.341, 0.296, 0.274, 0.000)
		colorDesert    (0.370, 0.318, 0.267, 0.000)
		colorLowland   (0.406, 0.339, 0.303, 0.000)
		colorUpland    (0.450, 0.412, 0.368, 0.000)
		colorRock      (0.486, 0.448, 0.397, 0.000)
		colorSnow      (0.529, 0.477, 0.418, 1.000)
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
		SemiMajorAxis   3.39619
		Period          16.0853
		Eccentricity    0.973329
		Inclination     173.763
		AscendingNode   16.8967
		ArgOfPericenter 18.9175
		MeanAnomaly     -25.6401
	}
}

Comet	"C97"
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
	Color          (0.687 0.682 0.680)

	Surface
	{
		SurfStyle       0.989687
		OceanStyle      0.402882
		Randomize      (-0.315, -0.926, 0.577)
		colorDistMagn   0.307322
		colorDistFreq   7.05359e-005
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
		mainFreq        0.549359
		terraceProb     0.102619
		erosion         0
		montesMagn      0.647029
		montesFreq      2.90612
		montesSpiky     0.960126
		montesFraction  0.407187
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000459962
		hillsFraction   0.697826
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258363
		craterFreq      0.247105
		craterDensity   0.808502
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.519728
		volcanoTemp     1903.82
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.234, 0.239, 0.272, 0.050)
		colorShelf     (0.275, 0.280, 0.313, 0.040)
		colorBeach     (0.316, 0.320, 0.354, 0.030)
		colorDesert    (0.357, 0.361, 0.401, 0.020)
		colorLowland   (0.399, 0.402, 0.442, 0.030)
		colorUpland    (0.440, 0.443, 0.483, 0.050)
		colorRock      (0.481, 0.484, 0.537, 0.020)
		colorSnow      (0.481, 0.484, 0.537, 1.000)
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
		SemiMajorAxis   4.08392
		Period          21.2108
		Eccentricity    0.968242
		Inclination     -103.09
		AscendingNode   -156.824
		ArgOfPericenter -27.0267
		MeanAnomaly     146.275
	}
}

Comet	"C98"
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
	Color          (0.762 0.713 0.668)

	Surface
	{
		SurfStyle       0.210989
		OceanStyle      0.146389
		Randomize      (0.873, -0.384, -0.745)
		colorDistMagn   0.765745
		colorDistFreq   0.00274202
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
		mainFreq        0.492264
		terraceProb     0.263222
		erosion         0
		montesMagn      0.324217
		montesFreq      3.23526
		montesSpiky     0.972595
		montesFraction  0.353089
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.386109
		hillsFraction   0.859452
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.208223
		craterFreq      0.239978
		craterDensity   0.765003
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.436181
		volcanoTemp     1984.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.305, 0.285, 0.267, 0.000)
		colorShelf     (0.324, 0.303, 0.284, 0.000)
		colorBeach     (0.343, 0.321, 0.301, 0.000)
		colorDesert    (0.362, 0.339, 0.317, 0.000)
		colorLowland   (0.381, 0.357, 0.334, 0.000)
		colorUpland    (0.400, 0.375, 0.351, 0.000)
		colorRock      (0.419, 0.392, 0.367, 0.000)
		colorSnow      (0.438, 0.410, 0.384, 1.000)
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
		SemiMajorAxis   5.23617
		Period          30.7937
		Eccentricity    0.956474
		Inclination     -94.5666
		AscendingNode   130.076
		ArgOfPericenter 13.2874
		MeanAnomaly     41.7451
	}
}

Comet	"C99"
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
	Color          (0.775 0.774 0.772)

	Surface
	{
		SurfStyle       0.72897
		OceanStyle      0.803729
		Randomize      (0.675, 0.831, -0.081)
		colorDistMagn   0.95822
		colorDistFreq   4.24666e-007
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
		mainFreq        0.671226
		terraceProb     0.261061
		erosion         0
		montesMagn      0.38012
		montesFreq      3.75661
		montesSpiky     0.905921
		montesFraction  0.438086
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.38238e-006
		hillsFraction   0.395799
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243522
		craterFreq      0.253167
		craterDensity   1.0531
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.391407
		volcanoTemp     1380.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.302, 0.263, 0.216, 0.000)
		colorShelf     (0.310, 0.271, 0.247, 0.000)
		colorBeach     (0.364, 0.317, 0.293, 0.000)
		colorDesert    (0.395, 0.340, 0.286, 0.000)
		colorLowland   (0.434, 0.364, 0.324, 0.000)
		colorUpland    (0.480, 0.441, 0.394, 0.000)
		colorRock      (0.519, 0.480, 0.425, 0.000)
		colorSnow      (0.565, 0.511, 0.448, 1.000)
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
		SemiMajorAxis   4.19391
		Period          22.0734
		Eccentricity    0.937497
		Inclination     143.87
		AscendingNode   -69.0116
		ArgOfPericenter -135.976
		MeanAnomaly     -61.6422
	}
}

Comet	"C100"
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
	Color          (0.512 0.385 0.312)

	Surface
	{
		SurfStyle       0.865379
		OceanStyle      0.881723
		Randomize      (0.808, 0.692, 0.933)
		colorDistMagn   0.967423
		colorDistFreq   0.000209785
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
		mainFreq        0.512418
		terraceProb     0.466893
		erosion         0
		montesMagn      0.551406
		montesFreq      3.89513
		montesSpiky     0.975748
		montesFraction  0.159344
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00150801
		hillsFraction   0.419334
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231107
		craterFreq      0.219036
		craterDensity   0.985543
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.538674
		volcanoTemp     1515.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.174, 0.135, 0.125, 0.050)
		colorShelf     (0.205, 0.158, 0.144, 0.040)
		colorBeach     (0.235, 0.181, 0.162, 0.030)
		colorDesert    (0.266, 0.204, 0.184, 0.020)
		colorLowland   (0.297, 0.227, 0.203, 0.030)
		colorUpland    (0.327, 0.250, 0.222, 0.050)
		colorRock      (0.358, 0.273, 0.247, 0.020)
		colorSnow      (0.358, 0.273, 0.247, 1.000)
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
		SemiMajorAxis   2.44837
		Period          9.84594
		Eccentricity    0.878432
		Inclination     108.24
		AscendingNode   2.58847
		ArgOfPericenter 173.827
		MeanAnomaly     175.286
	}
}

Comet	"C101"
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
	Color          (0.709 0.707 0.705)

	Surface
	{
		SurfStyle       0.164437
		OceanStyle      0.12211
		Randomize      (-0.004, -0.579, -0.747)
		colorDistMagn   0.711844
		colorDistFreq   0.007085
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
		mainFreq        0.447067
		terraceProb     0.427411
		erosion         0
		montesMagn      0.516715
		montesFreq      3.24859
		montesSpiky     0.908399
		montesFraction  0.369348
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.316594
		hillsFraction   0.523889
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.271496
		craterFreq      0.222227
		craterDensity   1.08946
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.516471
		volcanoTemp     1309.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.284, 0.283, 0.282, 0.000)
		colorShelf     (0.301, 0.301, 0.300, 0.000)
		colorBeach     (0.319, 0.318, 0.317, 0.000)
		colorDesert    (0.337, 0.336, 0.335, 0.000)
		colorLowland   (0.355, 0.354, 0.352, 0.000)
		colorUpland    (0.372, 0.371, 0.370, 0.000)
		colorRock      (0.390, 0.389, 0.388, 0.000)
		colorSnow      (0.408, 0.407, 0.405, 1.000)
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
		SemiMajorAxis   2.8837
		Period          12.5854
		Eccentricity    0.891683
		Inclination     178.843
		AscendingNode   4.9244
		ArgOfPericenter 35.7419
		MeanAnomaly     176.055
	}
}

Comet	"C102"
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
	Color          (0.449 0.446 0.442)

	Surface
	{
		SurfStyle       0.618939
		OceanStyle      0.0703763
		Randomize      (0.374, -0.551, 0.858)
		colorDistMagn   0.844024
		colorDistFreq   1.4983e-006
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
		mainFreq        0.726131
		terraceProb     0.282315
		erosion         0
		montesMagn      0.397453
		montesFreq      2.88547
		montesSpiky     0.883016
		montesFraction  0.315826
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.56411e-006
		hillsFraction   0.81881
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230213
		craterFreq      0.267916
		craterDensity   0.921527
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.417058
		volcanoTemp     1123.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.175, 0.152, 0.124, 0.000)
		colorShelf     (0.180, 0.156, 0.141, 0.000)
		colorBeach     (0.211, 0.183, 0.168, 0.000)
		colorDesert    (0.229, 0.196, 0.163, 0.000)
		colorLowland   (0.251, 0.210, 0.186, 0.000)
		colorUpland    (0.278, 0.254, 0.225, 0.000)
		colorRock      (0.301, 0.277, 0.243, 0.000)
		colorSnow      (0.328, 0.294, 0.256, 1.000)
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
		SemiMajorAxis   4.44547
		Period          24.0889
		Eccentricity    0.957724
		Inclination     64.9695
		AscendingNode   96.3913
		ArgOfPericenter -19.3803
		MeanAnomaly     46.5008
	}
}

Comet	"C103"
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
	Color          (0.412 0.409 0.407)

	Surface
	{
		SurfStyle       0.953269
		OceanStyle      0.0651086
		Randomize      (-0.378, 0.054, -0.711)
		colorDistMagn   0.732415
		colorDistFreq   0.000367373
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
		mainFreq        0.604653
		terraceProb     0.205275
		erosion         0
		montesMagn      0.511693
		montesFreq      2.64149
		montesSpiky     0.962306
		montesFraction  0.926514
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000946938
		hillsFraction   0.394819
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.275517
		craterFreq      0.216758
		craterDensity   0.995688
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.499945
		volcanoTemp     1417.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.140, 0.143, 0.163, 0.050)
		colorShelf     (0.165, 0.168, 0.187, 0.040)
		colorBeach     (0.190, 0.192, 0.212, 0.030)
		colorDesert    (0.214, 0.217, 0.240, 0.020)
		colorLowland   (0.239, 0.242, 0.265, 0.030)
		colorUpland    (0.264, 0.266, 0.289, 0.050)
		colorRock      (0.288, 0.291, 0.322, 0.020)
		colorSnow      (0.288, 0.291, 0.322, 1.000)
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
		SemiMajorAxis   3.79665
		Period          19.0126
		Eccentricity    0.979661
		Inclination     -52.8543
		AscendingNode   -23.288
		ArgOfPericenter 54.6175
		MeanAnomaly     6.05589
	}
}

Comet	"C104"
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
	Color          (0.564 0.556 0.553)

	Surface
	{
		SurfStyle       0.79956
		OceanStyle      0.103104
		Randomize      (-0.653, 0.541, 0.097)
		colorDistMagn   0.485339
		colorDistFreq   0.0515286
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
		mainFreq        0.490872
		terraceProb     0.581183
		erosion         0
		montesMagn      0.470267
		montesFreq      3.14702
		montesSpiky     0.911445
		montesFraction  0.573772
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.790743
		hillsFraction   0.727219
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251087
		craterFreq      0.228967
		craterDensity   0.873245
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.460527
		volcanoTemp     1719.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.220, 0.189, 0.155, 0.000)
		colorShelf     (0.225, 0.195, 0.177, 0.000)
		colorBeach     (0.265, 0.228, 0.210, 0.000)
		colorDesert    (0.287, 0.245, 0.205, 0.000)
		colorLowland   (0.316, 0.262, 0.232, 0.000)
		colorUpland    (0.349, 0.317, 0.282, 0.000)
		colorRock      (0.378, 0.345, 0.304, 0.000)
		colorSnow      (0.411, 0.367, 0.321, 1.000)
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
		SemiMajorAxis   3.84164
		Period          19.3516
		Eccentricity    0.941935
		Inclination     -87.4498
		AscendingNode   41.0508
		ArgOfPericenter -38.5722
		MeanAnomaly     -159.527
	}
}

Comet	"C105"
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
	Color          (0.452 0.449 0.443)

	Surface
	{
		SurfStyle       0.476683
		OceanStyle      0.295153
		Randomize      (-0.964, -0.297, -0.720)
		colorDistMagn   0.424476
		colorDistFreq   4.31513e-007
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
		mainFreq        0.389312
		terraceProb     0.314292
		erosion         0
		montesMagn      0.462485
		montesFreq      3.11753
		montesSpiky     0.921481
		montesFraction  0.542269
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.92841e-006
		hillsFraction   0.408415
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247104
		craterFreq      0.163488
		craterDensity   0.804288
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.47128
		volcanoTemp     1370.32
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.181, 0.179, 0.177, 0.000)
		colorShelf     (0.192, 0.191, 0.188, 0.000)
		colorBeach     (0.203, 0.202, 0.199, 0.000)
		colorDesert    (0.214, 0.213, 0.210, 0.000)
		colorLowland   (0.226, 0.224, 0.221, 0.000)
		colorUpland    (0.237, 0.236, 0.233, 0.000)
		colorRock      (0.248, 0.247, 0.244, 0.000)
		colorSnow      (0.260, 0.258, 0.255, 1.000)
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
		SemiMajorAxis   3.62024
		Period          17.703
		Eccentricity    0.962989
		Inclination     -150.787
		AscendingNode   38.3848
		ArgOfPericenter 59.8594
		MeanAnomaly     -65.8743
	}
}

Comet	"C106"
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
	Color          (0.830 0.757 0.696)

	Surface
	{
		SurfStyle       0.902158
		OceanStyle      0.235685
		Randomize      (-0.288, 0.596, -0.094)
		colorDistMagn   0.828597
		colorDistFreq   0.000779599
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
		mainFreq        0.507084
		terraceProb     0.204818
		erosion         0
		montesMagn      0.628588
		montesFreq      3.40645
		montesSpiky     0.924518
		montesFraction  0.612164
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00279837
		hillsFraction   0.572859
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.269198
		craterFreq      0.192985
		craterDensity   0.718801
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.514207
		volcanoTemp     1727.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.282, 0.265, 0.279, 0.050)
		colorShelf     (0.332, 0.310, 0.320, 0.040)
		colorBeach     (0.382, 0.356, 0.362, 0.030)
		colorDesert    (0.432, 0.401, 0.411, 0.020)
		colorLowland   (0.481, 0.447, 0.453, 0.030)
		colorUpland    (0.531, 0.492, 0.494, 0.050)
		colorRock      (0.581, 0.537, 0.550, 0.020)
		colorSnow      (0.581, 0.537, 0.550, 1.000)
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
		SemiMajorAxis   3.07708
		Period          13.8723
		Eccentricity    0.942524
		Inclination     -105.368
		AscendingNode   77.2587
		ArgOfPericenter -62.6057
		MeanAnomaly     129.996
	}
}

Comet	"C107"
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
	Color          (0.658 0.657 0.655)

	Surface
	{
		SurfStyle       0.489811
		OceanStyle      0.506305
		Randomize      (-0.265, -0.894, -0.213)
		colorDistMagn   0.94099
		colorDistFreq   0.145353
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
		mainFreq        0.487521
		terraceProb     0.287582
		erosion         0
		montesMagn      0.398678
		montesFreq      3.3554
		montesSpiky     0.859644
		montesFraction  0.635336
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.744723
		hillsFraction   0.346147
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218324
		craterFreq      0.198512
		craterDensity   0.654766
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.526651
		volcanoTemp     1589.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.263, 0.263, 0.262, 0.000)
		colorShelf     (0.280, 0.279, 0.278, 0.000)
		colorBeach     (0.296, 0.295, 0.295, 0.000)
		colorDesert    (0.313, 0.312, 0.311, 0.000)
		colorLowland   (0.329, 0.328, 0.327, 0.000)
		colorUpland    (0.346, 0.345, 0.344, 0.000)
		colorRock      (0.362, 0.361, 0.360, 0.000)
		colorSnow      (0.379, 0.378, 0.376, 1.000)
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
		SemiMajorAxis   2.53368
		Period          10.365
		Eccentricity    0.887223
		Inclination     -175.571
		AscendingNode   -87.9531
		ArgOfPericenter 10.3464
		MeanAnomaly     -44.5058
	}
}

Comet	"C108"
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
	Color          (0.658 0.654 0.652)

	Surface
	{
		SurfStyle       0.731182
		OceanStyle      0.323404
		Randomize      (0.208, 0.576, 0.878)
		colorDistMagn   0.320122
		colorDistFreq   2.91158e-006
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
		mainFreq        0.630405
		terraceProb     0.266689
		erosion         0
		montesMagn      0.380609
		montesFreq      2.67826
		montesSpiky     0.92736
		montesFraction  0.651307
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.01585e-005
		hillsFraction   0.505189
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239121
		craterFreq      0.199242
		craterDensity   0.956339
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.510355
		volcanoTemp     1462.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.257, 0.222, 0.183, 0.000)
		colorShelf     (0.263, 0.229, 0.209, 0.000)
		colorBeach     (0.309, 0.268, 0.248, 0.000)
		colorDesert    (0.336, 0.288, 0.241, 0.000)
		colorLowland   (0.369, 0.307, 0.274, 0.000)
		colorUpland    (0.408, 0.373, 0.333, 0.000)
		colorRock      (0.441, 0.405, 0.359, 0.000)
		colorSnow      (0.481, 0.432, 0.378, 1.000)
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
		SemiMajorAxis   3.57545
		Period          17.3755
		Eccentricity    0.94493
		Inclination     176.665
		AscendingNode   92.8482
		ArgOfPericenter 171.247
		MeanAnomaly     -117.79
	}
}

Comet	"C109"
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
	Color          (0.487 0.482 0.477)

	Surface
	{
		SurfStyle       0.484657
		OceanStyle      0.950395
		Randomize      (0.668, 0.695, -0.672)
		colorDistMagn   0.54896
		colorDistFreq   0.00102177
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
		mainFreq        0.408006
		terraceProb     0.615812
		erosion         0
		montesMagn      0.620363
		montesFreq      2.51734
		montesSpiky     0.903169
		montesFraction  0.472702
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00195574
		hillsFraction   0.480038
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243524
		craterFreq      0.256872
		craterDensity   0.917875
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51456
		volcanoTemp     1471.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.195, 0.193, 0.191, 0.000)
		colorShelf     (0.207, 0.205, 0.203, 0.000)
		colorBeach     (0.219, 0.217, 0.215, 0.000)
		colorDesert    (0.231, 0.229, 0.227, 0.000)
		colorLowland   (0.244, 0.241, 0.239, 0.000)
		colorUpland    (0.256, 0.253, 0.250, 0.000)
		colorRock      (0.268, 0.265, 0.262, 0.000)
		colorSnow      (0.280, 0.277, 0.274, 1.000)
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
		SemiMajorAxis   3.46693
		Period          16.5905
		Eccentricity    0.95606
		Inclination     77.4525
		AscendingNode   12.139
		ArgOfPericenter 34.0811
		MeanAnomaly     137.747
	}
}

Comet	"C110"
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
	Color          (0.586 0.583 0.580)

	Surface
	{
		SurfStyle       0.387991
		OceanStyle      0.624706
		Randomize      (0.102, 0.673, -0.854)
		colorDistMagn   0.174221
		colorDistFreq   0.198265
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
		mainFreq        0.450904
		terraceProb     0.285705
		erosion         0
		montesMagn      0.623943
		montesFreq      2.54768
		montesSpiky     0.837912
		montesFraction  0.734724
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.71356
		hillsFraction   0.70171
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.265774
		craterFreq      0.220797
		craterDensity   1.06439
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.595176
		volcanoTemp     1664.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.234, 0.233, 0.232, 0.000)
		colorShelf     (0.249, 0.248, 0.246, 0.000)
		colorBeach     (0.264, 0.263, 0.261, 0.000)
		colorDesert    (0.278, 0.277, 0.275, 0.000)
		colorLowland   (0.293, 0.292, 0.290, 0.000)
		colorUpland    (0.308, 0.306, 0.304, 0.000)
		colorRock      (0.322, 0.321, 0.319, 0.000)
		colorSnow      (0.337, 0.335, 0.333, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		SemiMajorAxis   4.05399
		Period          20.9781
		Eccentricity    0.933902
		Inclination     143.475
		AscendingNode   -148.691
		ArgOfPericenter 18.0013
		MeanAnomaly     157.743
	}
}

Comet	"C111"
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
	Color          (0.667 0.663 0.660)

	Surface
	{
		SurfStyle       0.335612
		OceanStyle      0.503447
		Randomize      (0.845, -0.372, 0.800)
		colorDistMagn   0.347757
		colorDistFreq   3.16556e-006
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
		mainFreq        0.639604
		terraceProb     0.359317
		erosion         0
		montesMagn      0.466188
		montesFreq      2.95055
		montesSpiky     0.931705
		montesFraction  0.796768
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.1437e-006
		hillsFraction   0.508824
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.216812
		craterFreq      0.262123
		craterDensity   0.910558
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.536763
		volcanoTemp     1658.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.267, 0.265, 0.264, 0.000)
		colorShelf     (0.284, 0.282, 0.280, 0.000)
		colorBeach     (0.300, 0.298, 0.297, 0.000)
		colorDesert    (0.317, 0.315, 0.313, 0.000)
		colorLowland   (0.334, 0.331, 0.330, 0.000)
		colorUpland    (0.350, 0.348, 0.346, 0.000)
		colorRock      (0.367, 0.364, 0.363, 0.000)
		colorSnow      (0.384, 0.381, 0.379, 1.000)
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
		SemiMajorAxis   3.90337
		Period          19.8199
		Eccentricity    0.966075
		Inclination     -152.952
		AscendingNode   -159.796
		ArgOfPericenter 80.1424
		MeanAnomaly     56.2167
	}
}

Comet	"C112"
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
	Color          (0.713 0.681 0.648)

	Surface
	{
		SurfStyle       0.0880769
		OceanStyle      0.416325
		Randomize      (-0.482, -0.689, -0.763)
		colorDistMagn   0.712754
		colorDistFreq   0.000702205
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
		mainFreq        0.498091
		terraceProb     0.619586
		erosion         0
		montesMagn      0.475545
		montesFreq      3.19694
		montesSpiky     0.950637
		montesFraction  0.643678
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00619859
		hillsFraction   0.600098
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260127
		craterFreq      0.269011
		craterDensity   0.709669
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.456047
		volcanoTemp     1953.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.285, 0.272, 0.259, 0.000)
		colorShelf     (0.303, 0.289, 0.275, 0.000)
		colorBeach     (0.321, 0.306, 0.292, 0.000)
		colorDesert    (0.338, 0.323, 0.308, 0.000)
		colorLowland   (0.356, 0.340, 0.324, 0.000)
		colorUpland    (0.374, 0.357, 0.340, 0.000)
		colorRock      (0.392, 0.374, 0.356, 0.000)
		colorSnow      (0.410, 0.391, 0.372, 1.000)
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
		SemiMajorAxis   3.72788
		Period          18.4984
		Eccentricity    0.929688
		Inclination     59.3447
		AscendingNode   52.803
		ArgOfPericenter -161.837
		MeanAnomaly     -177.646
	}
}

Comet	"C113"
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
	Color          (0.675 0.625 0.603)

	Surface
	{
		SurfStyle       0.723722
		OceanStyle      0.910719
		Randomize      (-0.299, 0.210, 0.664)
		colorDistMagn   0.53685
		colorDistFreq   0.532224
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
		mainFreq        0.490909
		terraceProb     0.192384
		erosion         0
		montesMagn      0.411656
		montesFreq      3.44347
		montesSpiky     0.885525
		montesFraction  0.275543
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.55023
		hillsFraction   0.666897
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236483
		craterFreq      0.272448
		craterDensity   0.937702
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.462033
		volcanoTemp     1340.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.263, 0.213, 0.169, 0.000)
		colorShelf     (0.270, 0.219, 0.193, 0.000)
		colorBeach     (0.317, 0.256, 0.229, 0.000)
		colorDesert    (0.344, 0.275, 0.223, 0.000)
		colorLowland   (0.378, 0.294, 0.253, 0.000)
		colorUpland    (0.419, 0.356, 0.307, 0.000)
		colorRock      (0.452, 0.388, 0.332, 0.000)
		colorSnow      (0.493, 0.413, 0.350, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		SemiMajorAxis   3.58724
		Period          17.4615
		Eccentricity    0.956881
		Inclination     -22.5896
		AscendingNode   92.152
		ArgOfPericenter -46.8608
		MeanAnomaly     -38.1272
	}
}

Comet	"C114"
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
	Color          (0.746 0.627 0.530)

	Surface
	{
		SurfStyle       0.872228
		OceanStyle      0.690521
		Randomize      (-0.444, -0.440, 0.321)
		colorDistMagn   0.348989
		colorDistFreq   1.06217e-006
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
		mainFreq        0.464562
		terraceProb     0.270392
		erosion         0
		montesMagn      0.456515
		montesFreq      3.25254
		montesSpiky     0.838711
		montesFraction  0.365925
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.01661e-005
		hillsFraction   0.703824
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238774
		craterFreq      0.277967
		craterDensity   0.966441
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.542072
		volcanoTemp     1498.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.254, 0.220, 0.212, 0.050)
		colorShelf     (0.299, 0.257, 0.244, 0.040)
		colorBeach     (0.343, 0.295, 0.275, 0.030)
		colorDesert    (0.388, 0.333, 0.312, 0.020)
		colorLowland   (0.433, 0.370, 0.344, 0.030)
		colorUpland    (0.478, 0.408, 0.376, 0.050)
		colorRock      (0.522, 0.445, 0.418, 0.020)
		colorSnow      (0.522, 0.445, 0.418, 1.000)
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
		SemiMajorAxis   3.33595
		Period          15.6593
		Eccentricity    0.926873
		Inclination     50.5901
		AscendingNode   -92.3193
		ArgOfPericenter 53.4326
		MeanAnomaly     -168.928
	}
}

Comet	"C115"
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
	Color          (0.528 0.521 0.516)

	Surface
	{
		SurfStyle       0.270514
		OceanStyle      0.998063
		Randomize      (0.035, 0.456, -0.868)
		colorDistMagn   0.763919
		colorDistFreq   0.00212815
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
		mainFreq        0.59623
		terraceProb     0.186555
		erosion         0
		montesMagn      0.525414
		montesFreq      3.43072
		montesSpiky     0.830763
		montesFraction  0.565726
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00756617
		hillsFraction   0.532848
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243187
		craterFreq      0.196099
		craterDensity   0.83824
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.502943
		volcanoTemp     1785.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.211, 0.208, 0.206, 0.000)
		colorShelf     (0.225, 0.221, 0.219, 0.000)
		colorBeach     (0.238, 0.234, 0.232, 0.000)
		colorDesert    (0.251, 0.247, 0.245, 0.000)
		colorLowland   (0.264, 0.260, 0.258, 0.000)
		colorUpland    (0.277, 0.273, 0.271, 0.000)
		colorRock      (0.291, 0.286, 0.284, 0.000)
		colorSnow      (0.304, 0.299, 0.297, 1.000)
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
		SemiMajorAxis   3.6558
		Period          17.9645
		Eccentricity    0.95281
		Inclination     -68.004
		AscendingNode   -161.973
		ArgOfPericenter 90.1632
		MeanAnomaly     81.7128
	}
}

Comet	"C116"
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
	Color          (0.585 0.583 0.579)

	Surface
	{
		SurfStyle       0.206375
		OceanStyle      0.803687
		Randomize      (-0.794, 0.544, -0.702)
		colorDistMagn   0.625751
		colorDistFreq   1.04067
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
		mainFreq        0.433782
		terraceProb     0.385512
		erosion         0
		montesMagn      0.273438
		montesFreq      2.44272
		montesSpiky     0.942724
		montesFraction  0.388125
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.76407
		hillsFraction   0.604833
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255474
		craterFreq      0.215328
		craterDensity   0.785373
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.449821
		volcanoTemp     1248.09
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.234, 0.233, 0.231, 0.000)
		colorShelf     (0.249, 0.248, 0.246, 0.000)
		colorBeach     (0.263, 0.262, 0.260, 0.000)
		colorDesert    (0.278, 0.277, 0.275, 0.000)
		colorLowland   (0.293, 0.291, 0.289, 0.000)
		colorUpland    (0.307, 0.306, 0.304, 0.000)
		colorRock      (0.322, 0.320, 0.318, 0.000)
		colorSnow      (0.337, 0.335, 0.333, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		SemiMajorAxis   5.47691
		Period          32.9416
		Eccentricity    0.956542
		Inclination     10.639
		AscendingNode   -137.504
		ArgOfPericenter -135.094
		MeanAnomaly     -115.165
	}
}

