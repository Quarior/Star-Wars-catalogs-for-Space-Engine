Planet	"Esyam"
{
	ParentBody     "Y'Toub"
	Class	       "Desert"

	Mass            1.10698
	Radius          7255.44
	InertiaMoment   0.328366

	RotationPeriod  240.58
	Obliquity       2.10153
	EqAscendNode    28.3173

	AlbedoBond      0.8	AlbedoGeom      0.351047
	Brightness      2
	Color          (0.947 0.831 0.682)

	Surface
	{
		SurfStyle       0.0149905
		OceanStyle      0.249539
		Randomize      (-0.667, 0.964, -0.714)
		colorDistMagn   0.0598822
		colorDistFreq   1081.65
		detailScale     18661.4
		colorConversion true
		drivenDarkening -1
		seaLevel        0.0812664
		snowLevel       1
		tropicLatitude  0.0525974
		icecapLatitude  1
		icecapHeight    0.126961
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        0.95343
		venusFreq       0.851032
		venusMagn       0.260579
		mareFreq        2.41335
		mareDensity     0.148588
		terraceProb     0.248019
		erosion         0
		montesMagn      0.214931
		montesFreq      277.246
		montesSpiky     0.883386
		montesFraction  0.897772
		dunesMagn       0.0458218
		dunesFreq       64.4496
		dunesFraction   0.341301
		hillsMagn       0.113354
		hillsFreq       1000
		hillsFraction   0
		hills2Fraction  0
		riversMagn      60.3684
		riversFreq      2.55583
		riversSin       4.99207
		riversOctaves   0
		canyonsMagn     0.00644105
		canyonsFreq     100
		canyonFraction  0
		cracksMagn      0.130932
		cracksFreq      0.545328
		cracksOctaves   0
		craterMagn      0.613038
		craterFreq      24.4183
		craterDensity   0.173567
		craterOctaves   3
		craterRayedFactor 0
		volcanoMagn     0.699095
		volcanoFreq     0.673671
		volcanoDensity  0.301231
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.510997
		volcanoRadius   0.479112
		volcanoTemp     1703.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0.2 stripeZones     1
		stripeFluct     0
		stripeTwist     3.5
		cycloneMagn     0.945559
		cycloneFreq     0.662628
		cycloneDensity  0.333034
		cycloneOctaves  0
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
		Height          34.7134
		Velocity        100.194
		BumpHeight      5.5988
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.01409
		mainOctaves     10
		Coverage        1
		stripeZones     1
		stripeFluct     0
		stripeTwist     3.5
	}

	Clouds
	{
		Height          59.4272
		Velocity        152.241
		BumpHeight      5.76156
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.01409
		mainOctaves     10
		Coverage        1
		stripeZones     1
		stripeFluct     0
		stripeTwist     3.5
	}

	Clouds
	{
		Height          84.1406
		Velocity        75.3379
		BumpHeight      5.11784
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.01409
		mainOctaves     10
		Coverage        1
		stripeZones     1
		stripeFluct     0
		stripeTwist     3.5
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Venus"
		Height          310.303
		Density         159.548
		Pressure        297.438
	   Greenhouse 600	Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0
		Saturation      1

		Composition
		{
			CO2   	83.1859
			H2O   	15.0735
			CH4   	0.658219
			NH3   	0.404547
			SO2   	0.295303
			H2S   	0.238414
			N2    	0.0977617
			C2H6  	0.0194089
			C2H2  	0.017511
			C3H8  	0.00601631
			C2H4  	0.00310776
			CO    	0.000173601
			Ar    	0.000152645
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.220716
		Period          1.54293
		Eccentricity    0.132478
		Inclination     2.10153
		AscendingNode   -88.3173
		ArgOfPericenter 163.009
		MeanAnomaly     296.556
	}
}




Planet	"Nal Koska"
{
	ParentBody     "Y'Toub"
	Class	       "Terra"

	Mass            3.33869
	Radius          8856.81
	InertiaMoment   0.329393

	Oblateness      0.00388837

	RotationPeriod  19.8312
	Obliquity       -20.3967
	EqAscendNode    -94.4433

	AlbedoBond      0.360543
	AlbedoGeom      0.432651
	Brightness      2
	Color          (0.476 0.549 0.727)

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine/Terrestrial"
		Panspermia true	}

	Surface
	{
		SurfStyle       0.841474
		OceanStyle      0.795276
		Randomize      (-0.435, -0.553, -0.562)
		colorDistMagn   0.0640103
		colorDistFreq   953.479
		detailScale     22780.2
		colorConversion true
		drivenDarkening -1
		seaLevel        0.397717
		snowLevel       0.95
		tropicLatitude  0.347939
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.936508
		climateTropic   0.217177
		climateEquator  0.5475
		heightTempGrad  0.520323
		tropicWidth     0.145386
		mainFreq        1.20001
		venusFreq       1
		venusMagn       0.175865
		mareFreq        1.20759
		mareDensity     0.200047
		terraceProb     0.31032
		erosion         0.134976
		montesMagn      0.199593
		montesFreq      370.631
		montesSpiky     0.792987
		montesFraction  0.816836
		dunesMagn       0.02544
		dunesFreq       40.4762
		dunesFraction   0.119048
		hillsMagn       0.148062
		hillsFreq       1000
		hillsFraction   0
		hills2Fraction  0
		riversMagn      60.0269
		riversFreq      3.05542
		riversSin       4.92775
		riversOctaves   0
		canyonsMagn     0.067995
		canyonsFreq     100
		canyonFraction  0.0178001
		cracksMagn      0.0906268
		cracksFreq      0.502859
		cracksOctaves   0
		craterMagn      0.948921
		craterFreq      29.353
		craterDensity   0
		craterOctaves   0
		craterRayedFactor 0
		volcanoMagn     0.750628
		volcanoFreq     0.15873
		volcanoDensity  0.2
		volcanoOctaves  0
		volcanoActivity 0.825397
		volcanoFlows    0.943966
		volcanoRadius   0.447476
		volcanoTemp     1541.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.68087
		stripeFluct     0
		stripeTwist     0
		cycloneMagn     10
		cycloneFreq     0.715513
		cycloneDensity  0.223766
		cycloneOctaves  3
		colorSea       (0.040, 0.200, 0.200, 1.000)
		colorShelf     (0.150, 0.370, 0.370, 1.000)
		colorBeach     (0.480, 0.380, 0.280, 0.000)
		colorDesert    (0.410, 0.280, 0.180, 0.000)
		colorLowland   (0.310, 0.230, 0.170, 0.000)
		colorUpland    (0.510, 0.330, 0.190, 0.000)
		colorRock      (0.220, 0.210, 0.210, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.308)
		colorLowPlants (0.152, 0.176, 0.050, 0.000)
		colorUpPlants  (0.255, 0.255, 0.044, 0.000)
		BumpHeight      12.0198
		BumpOffset      4.78048
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
		Height          9.40332
		Velocity        100.194
		BumpHeight      5.11093
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.02754
		mainOctaves     10
		Coverage        0.3
		stripeZones     1.68087
		stripeFluct     0
		stripeTwist     0
	}

	Ocean
	{
		Height          4.78048
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
	}

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          44.284
		Density         2.44567
		Pressure        1.6194
		Greenhouse      23.1074
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0
		Saturation      1

		Composition
		{
			N2    	84.5169
			O2    	14.8019
			H2O   	0.48213
			CO2   	0.195989
			NH3   	0.00265249
			CO    	0.000234519
			Ne    	9.93228e-005
			Ar    	7.11837e-005
		}
	}

	Aurora
	{
		Height      129.952
		NorthLat    57.9215
		NorthLon    22.1641
		NorthRadius 2068.49
		NorthWidth  623.851
		NorthRings  4
		NorthBright 0.3
		NorthParticles 0
		SouthLat    -52.4401
		SouthLon    171.802
		SouthRadius 2520.93
		SouthWidth  679.269
		SouthRings  4
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
		SemiMajorAxis   1.61310
		Period          2.34376
		Eccentricity    0.120001
		Inclination     -2.75278
		AscendingNode   -94.4433
		ArgOfPericenter 161.339
		MeanAnomaly     108.868
	}
}



DwarfMoon	"Nal Koska.D1"
{
	ParentBody     "Nal Koska"
	Class	       "Asteroid"

	Mass            2.07666e-007
	Radius          39.0927
	InertiaMoment   0.39982

	Oblateness      0.249

	Obliquity       -0.00779176
	EqAscendNode    -92.9719
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.431 0.426 0.423)

	Surface
	{
		SurfStyle       0.755856
		OceanStyle      0.512102
		Randomize      (-0.822, -0.623, 0.821)
		colorDistMagn   0.222428
		colorDistFreq   0.994903
		detailScale     1067.49
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.633734
		terraceProb     0.31631
		erosion         0
		montesMagn      0.349413
		montesFreq      3.79146
		montesSpiky     0.995664
		montesFraction  0.450232
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.08424
		hillsFraction   0.713993
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.200488
		craterFreq      0.262486
		craterDensity   0.86452
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51961
		volcanoTemp     1339.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.168, 0.145, 0.119, 0.000)
		colorShelf     (0.173, 0.149, 0.135, 0.000)
		colorBeach     (0.203, 0.175, 0.161, 0.000)
		colorDesert    (0.220, 0.187, 0.157, 0.000)
		colorLowland   (0.242, 0.200, 0.178, 0.000)
		colorUpland    (0.267, 0.243, 0.216, 0.000)
		colorRock      (0.289, 0.264, 0.233, 0.000)
		colorSnow      (0.315, 0.281, 0.245, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000103172
		Eccentricity    3.57628e-005
		Inclination     -0.00779176
		AscendingNode   -92.9719
		ArgOfPericenter 88.7948
		MeanAnomaly     -92.4752
	}
}



DwarfMoon	"Nal Koska.D2"
{
	ParentBody     "Nal Koska"
	Class	       "Asteroid"

	Mass            2.87444e-007
	Radius          98.4741
	InertiaMoment   0.397832

	Oblateness      0.249

	Obliquity       -0.00456874
	EqAscendNode    -32.0558
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.746 0.624 0.579)

	Surface
	{
		SurfStyle       0.462024
		OceanStyle      0.289656
		Randomize      (-0.023, -0.392, -0.286)
		colorDistMagn   0.219653
		colorDistFreq   6.29995
		detailScale     2689
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.577756
		terraceProb     0.21791
		erosion         0
		montesMagn      0.239338
		montesFreq      2.40609
		montesSpiky     0.934783
		montesFraction  0.527821
		dunesFraction   0
		hillsMagn       0
		hillsFreq       26.3786
		hillsFraction   0.438272
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221342
		craterFreq      0.404361
		craterDensity   0.843519
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53008
		volcanoTemp     1853.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.298, 0.250, 0.232, 0.000)
		colorShelf     (0.317, 0.265, 0.246, 0.000)
		colorBeach     (0.336, 0.281, 0.261, 0.000)
		colorDesert    (0.354, 0.297, 0.275, 0.000)
		colorLowland   (0.373, 0.312, 0.290, 0.000)
		colorUpland    (0.392, 0.328, 0.304, 0.000)
		colorRock      (0.410, 0.343, 0.318, 0.000)
		colorSnow      (0.429, 0.359, 0.333, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000233874
		Eccentricity    7.56469e-005
		Inclination     -0.00456874
		AscendingNode   -32.0558
		ArgOfPericenter -38.3823
		MeanAnomaly     110.87
	}
}




Barycenter	"Nal Hutta-Nar Shaddaa"
{
	ParentBody     "Y'Toub"
	Mass            0.7588	Radius          1333.17
	RotationPeriod  24
	Obliquity       0
	EqAscendNode    0


	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.34287		Eccentricity    0.036874	Period 4.10248	Inclination     2.64444		AscendingNode   94.60601
		ArgOfPericenter 47.91054
		MeanAnomaly     -77.04374
	}
}



Planet	"Nal Hutta/Evocar"
{
	ParentBody     "Nal Hutta-Nar Shaddaa"
	Class	       "Terra"

	Mass            0.70122
	Radius          6075.23
	InertiaMoment   0.329737

	Obliquity       0
	EqAscendNode    86.3075
	TidalLocked     true

	AlbedoBond      0.26
	AlbedoGeom      0.312
	Brightness      2
	Color          (0.579 0.517 0.290)

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine/Terrestrial"
	}

	Surface
	{
		SurfStyle       0.0149905
		OceanStyle      0.95
		Randomize      (-0.667, 0.964, -0.714)
		colorDistMagn   0.0598822
		colorDistFreq   905.702
		detailScale     15625.8
		colorConversion true
		drivenDarkening -1
		seaLevel        0.333315
		snowLevel       0.95
		tropicLatitude  0.207687
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.9375
		climateTropic   0.366195
		climateEquator  0.6875
		heightTempGrad  0.471305
		tropicWidth     0.232519
		mainFreq        1.85612
		venusFreq       0.85
		venusMagn       0.22664
		mareFreq        1.60589
		mareDensity     0.142857
		terraceProb     0.281848
		erosion         0.119827
		montesMagn      0.169278
		montesFreq      244.229
		montesSpiky     0.904195
		montesFraction  0.341301
		dunesMagn       0.0503733
		dunesFreq       44.5014
		dunesFraction   0.545157
		hillsMagn       0.14698
		hillsFreq       476.92
		hillsFraction   0.45645
		hills2Fraction  0.979661
		riversMagn      26.4115
		riversFreq      3.29603
		riversSin       6.83113
		riversOctaves   2
		canyonsMagn     0.055982
		canyonsFreq     29.3651
		canyonFraction  0.893632
		cracksMagn      0.0816836
		cracksFreq      0.564319
		cracksOctaves   0
		craterMagn      0.303167
		craterFreq      17.011
		craterDensity   0.404762
		craterOctaves   2
		craterRayedFactor 0
		volcanoMagn     0.0952381
		volcanoFreq     0.285714
		volcanoDensity  0.233203
		volcanoOctaves  1
		volcanoActivity 0
		volcanoFlows    0.698789
		volcanoRadius   0.559603
		volcanoTemp     1279.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.00911
		stripeFluct     0
		stripeTwist     0.411863
		cycloneMagn     2.14118
		cycloneFreq     0.662628
		cycloneDensity  0.379632
		cycloneOctaves  4
		colorSea       (0.170, 0.150, 0.068, 1.000)
		colorShelf     (0.320, 0.110, 0.000, 1.000)
		colorBeach     (0.820, 0.730, 0.570, 0.000)
		colorDesert    (0.420, 0.360, 0.220, 0.000)
		colorLowland   (0.220, 0.230, 0.220, 0.000)
		colorUpland    (0.570, 0.540, 0.420, 0.000)
		colorRock      (0.100, 0.100, 0.100, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.308)
		colorLowPlants (0.160, 0.158, 0.089, 0.000)
		colorUpPlants  (0.160, 0.158, 0.089, 0.000)
		BumpHeight      8.5748
		BumpOffset      2.85811
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
		Height          7.14697
		Velocity        100.194
		BumpHeight      4.14684
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.80116
		mainOctaves     10
		Coverage        0.35247
		stripeZones     2.00911
		stripeFluct     0
		stripeTwist     0.411863
	}

	Ocean
	{
		Height          2.85811
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
	}

	NoLava          true

	Atmosphere
	{
		Model          "Chlorine"
		Height          61.9352
		Density         2.44411
		Pressure        2.0295
		Greenhouse 58.25 Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.08
		Saturation      0.8

		Composition
		{
			N2    	79.9037
			O2    	16.089
			CH4   	2.28004
			CO2   	1.22505
			H2O   	0.502015
			Ar    	0.000223101
		}
	}

	Aurora
	{
		Height      83.7331
		NorthLat    79.2773
		NorthLon    -103.563
		NorthRadius 1396.97
		NorthWidth  313.522
		NorthRings  3
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -90
		SouthLon    78.4005
		SouthRadius 948.419
		SouthWidth  273.888
		SouthRings  3		SouthBright 0.3
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	Rings
	{
		InnerRadius     12211
		OuterRadius     17243
		RotationPeriod  4.82814
		RotationOffset  0
		FrontBright     0.969287
		BackBright      0.646471
		Density         0.606162
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.61488371639e-05
		Period          0.00993338
		Eccentricity    0.00508

		Inclination     48.22882
		AscendingNode   86.3075
		ArgOfPericenter 21.802
		MeanAnomaly     287.55
	}
}



Moon	"Nar Shaddaa/Vertical City/Smugglers' Moon/Little Coruscant"
{
	ParentBody     "Nal Hutta-Nar Shaddaa"
	Class	       "Desert"

	Mass            0.05758
	Radius          2375.14
	InertiaMoment   0.343304

	Obliquity       48.2288
	EqAscendNode    86.3075
	TidalLocked     true

	AlbedoBond      0.381923
	AlbedoGeom      0.458307
	Brightness      2
	Color          (0.549 0.387 0.239)

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Terrestrial"
		Panspermia true	} Surface
	{
	
		DiffMap        "NarShaddaa.*" 		DiffTileSize    258
		DiffTileBorder  1  
                BumpMap        "NarShaddaa_bump.*" 	BumpTileSize    258
		BumpTileBorder  1  
		GlowMap        "NarShaddaa_night.*"
		GlowMode       "Night"
		GlowColor      (1.00 0.90 0.66)
		GlowBright      1.0
		Exposure		1.7
	SurfStyle       0.133241
		OceanStyle      0.887023
		Randomize      (0.063, -0.291, -0.882)
		colorDistMagn   0.0804392
		colorDistFreq   346.829
		detailScale     6108.99
		colorConversion true
		drivenDarkening -1
		seaLevel        0.18331
		snowLevel       1
		tropicLatitude  0.913007
		icecapLatitude  1
		icecapHeight    0.162618
		climatePole     0.9375
		climateTropic   0.642857
		climateEquator  0.722222
		heightTempGrad  0.574816
		tropicWidth     0.0873265
		mainFreq        0.905967
		venusFreq       1
		venusMagn       0.042879
		mareFreq        1.37391
		mareDensity     0.0357909
		terraceProb     0.241348
		erosion         0
		montesMagn      0		montesFreq      141.79
		montesSpiky     0.928275
		montesFraction  0
		dunesMagn       0.0553081
		dunesFreq       18.5418
		dunesFraction   0.203934
		hillsMagn       0.056502
		hillsFreq       232.257
		hillsFraction   0.293651
		hills2Fraction  0
		riversMagn      56.4628
		riversFreq      3.34181
		riversSin       5.14583
		riversOctaves   0
		canyonsMagn     0.0204863
		canyonsFreq     67.4215
		canyonFraction  0
		cracksMagn      0.133327
		cracksFreq      0.258328
		cracksOctaves   0
		craterMagn      0.291143
		craterFreq      25.7143
		craterDensity   0.642857
		craterOctaves   3
		craterRayedFactor 0
		volcanoMagn     0.514177
		volcanoFreq     0.131971
		volcanoDensity  0.4
		volcanoOctaves  1
		volcanoActivity 0.04542
		volcanoFlows    0.759721
		volcanoRadius   0.31598
		volcanoTemp     1317.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.86836
		stripeFluct     0
		stripeTwist     0.476256
		cycloneMagn     2.67428
		cycloneFreq     0.606345
		cycloneDensity  0.293185
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
		BumpHeight      10		DiffMapAlpha   "Ice"
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
		Height          14.925
		Velocity        100.194
		BumpHeight      4.92505
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.970753
		mainOctaves     10
		Coverage        0.363846
		stripeZones     1.86836
		stripeFluct     0
		stripeTwist     0.476256
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Mars"
		Height          81.757
		Density         1.84848
		Pressure        1.25999
		Greenhouse      51.9611
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0
		Saturation      1

		Composition
		{
			N2    	82.3761
			O2    	15.9183
			CO2   	1.35481
			H2O   	0.3508
			CH4   	5.8641e-006
			H2S   	1.483e-006
			C2H2  	5.4812e-007
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000562009162836		Period          0.00993338
		Eccentricity    0.00508
		Inclination     48.2288
		AscendingNode   86.3075
		ArgOfPericenter 201.802
		MeanAnomaly     287.55
	}
}



DwarfMoon	"Nal Hutta.D1"
{
	ParentBody     "Nal Hutta"
	Class	       "Asteroid"

	Mass            4.76209e-009
	Radius          10.2212
	InertiaMoment   0.398457

	Oblateness      0.171351

	Obliquity       -0.00583579
	EqAscendNode    88.2756
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.436 0.430 0.427)

	Surface
	{
		SurfStyle       0.302678
		OceanStyle      0.795508
		Randomize      (0.653, -0.120, -0.358)
		colorDistMagn   0.337177
		colorDistFreq   0.142225
		detailScale     388.332
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.322679
		terraceProb     0.247219
		erosion         0
		montesMagn      0.441276
		montesFreq      3.62215
		montesSpiky     0.878244
		montesFraction  0.825629
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.398309
		hillsFraction   0.737279
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.204267
		craterFreq      0.246168
		craterDensity   0.988267
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.524217
		volcanoTemp     1515.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.174, 0.172, 0.171, 0.000)
		colorShelf     (0.185, 0.183, 0.181, 0.000)
		colorBeach     (0.196, 0.194, 0.192, 0.000)
		colorDesert    (0.207, 0.204, 0.203, 0.000)
		colorLowland   (0.218, 0.215, 0.213, 0.000)
		colorUpland    (0.229, 0.226, 0.224, 0.000)
		colorRock      (0.240, 0.237, 0.235, 0.000)
		colorSnow      (0.250, 0.247, 0.245, 1.000)
		BumpHeight      9.799
		BumpOffset      2.05981
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000092437
		Eccentricity    9.26285e-005
		Inclination     -0.00583579
		AscendingNode   88.2756
		ArgOfPericenter 44.6642
		MeanAnomaly     88.8275
	}
}



DwarfMoon	"Nal Hutta.D2"
{
	ParentBody     "Nal Hutta"
	Class	       "Asteroid"

	Mass            7.90668e-009
	Radius          27.5379
	InertiaMoment   0.399469

	Oblateness      0.249

	Obliquity       0.00136371
	EqAscendNode    155.226
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.571 0.565 0.561)

	Surface
	{
		SurfStyle       0.57401
		OceanStyle      0.406268
		Randomize      (0.334, -0.561, 0.136)
		colorDistMagn   0.817306
		colorDistFreq   0.557679
		detailScale     751.968
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.575682
		terraceProb     0.315579
		erosion         0
		montesMagn      0.440183
		montesFreq      3.3625
		montesSpiky     0.89669
		montesFraction  0.63532
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.62532
		hillsFraction   0.439857
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237188
		craterFreq      0.194647
		craterDensity   0.996469
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.40854
		volcanoTemp     1435.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.223, 0.192, 0.157, 0.000)
		colorShelf     (0.228, 0.198, 0.179, 0.000)
		colorBeach     (0.268, 0.232, 0.213, 0.000)
		colorDesert    (0.291, 0.249, 0.208, 0.000)
		colorLowland   (0.320, 0.266, 0.236, 0.000)
		colorUpland    (0.354, 0.322, 0.286, 0.000)
		colorRock      (0.383, 0.351, 0.309, 0.000)
		colorSnow      (0.417, 0.373, 0.325, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000121202
		Eccentricity    9.50797e-005
		Inclination     0.00136371
		AscendingNode   155.226
		ArgOfPericenter -118.587
		MeanAnomaly     -122.8
	}
}



DwarfMoon	"Nal Hutta.D3"
{
	ParentBody     "Nal Hutta"
	Class	       "Asteroid"

	Mass            1.08047e-008
	Radius          15.4362
	InertiaMoment   0.397052

	Oblateness      0.0256195

	Obliquity       -0.883858
	EqAscendNode    -8.24965
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.751 0.685 0.619)

	Surface
	{
		SurfStyle       0.51612
		OceanStyle      0.0833811
		Randomize      (0.894, -0.717, 0.697)
		colorDistMagn   0.684224
		colorDistFreq   0.130742
		detailScale     421.511
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0307678
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.613834
		terraceProb     0.600363
		erosion         0
		montesMagn      0.616072
		montesFreq      3.81857
		montesSpiky     0.920218
		montesFraction  0.510111
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.682917
		hillsFraction   0.686816
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247853
		craterFreq      0.213952
		craterDensity   0.807746
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.541612
		volcanoTemp     1328.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.293, 0.233, 0.173, 0.000)
		colorShelf     (0.300, 0.240, 0.198, 0.000)
		colorBeach     (0.353, 0.281, 0.235, 0.000)
		colorDesert    (0.383, 0.301, 0.229, 0.000)
		colorLowland   (0.421, 0.322, 0.260, 0.000)
		colorUpland    (0.466, 0.390, 0.316, 0.000)
		colorRock      (0.503, 0.424, 0.341, 0.000)
		colorSnow      (0.548, 0.452, 0.359, 1.000)
		BumpHeight      13.8926
		BumpOffset      2.77851
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000175513
		Eccentricity    0.0474464
		Inclination     -0.883858
		AscendingNode   -8.24965
		ArgOfPericenter -45.813
		MeanAnomaly     -177.654
	}
}



DwarfMoon	"Nal Hutta.D4"
{
	ParentBody     "Nal Hutta-Nar Shaddaa"
	Class	       "Asteroid"

	Mass            5.63582e-007
	Radius          112.877
	InertiaMoment   0.399946

	Oblateness      0.00105706

	Obliquity       32.6889
	EqAscendNode    161.089
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.596 0.591 0.587)

	Surface
	{
		SurfStyle       0.457205
		OceanStyle      0.990729
		Randomize      (0.230, 0.797, 0.783)
		colorDistMagn   0.788748
		colorDistFreq   1.77174
		detailScale     3082.3
		colorConversion true
		snowLevel       2
		tropicLatitude  0.176751
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.348262
		terraceProb     0.197496
		erosion         0
		montesMagn      0.495393
		montesFreq      3.2332
		montesSpiky     0.992448
		montesFraction  0.484635
		dunesFraction   0
		hillsMagn       0
		hillsFreq       33.236
		hillsFraction   0.727321
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251898
		craterFreq      0.511316
		craterDensity   0.766111
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.471551
		volcanoTemp     1621.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.238, 0.237, 0.235, 0.000)
		colorShelf     (0.253, 0.251, 0.249, 0.000)
		colorBeach     (0.268, 0.266, 0.264, 0.000)
		colorDesert    (0.283, 0.281, 0.279, 0.000)
		colorLowland   (0.298, 0.296, 0.293, 0.000)
		colorUpland    (0.313, 0.310, 0.308, 0.000)
		colorRock      (0.328, 0.325, 0.323, 0.000)
		colorSnow      (0.343, 0.340, 0.337, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00236186
		Period          0.0628736		Eccentricity    0.188946
		Inclination     32.6889
		AscendingNode   61.089
		ArgOfPericenter -62.9528
		MeanAnomaly     -177.887
	}
}




Planet	"Nal Yeshu"
{
	ParentBody     "Y'Toub"
	Class	       "Terra"

	Mass            2.2433
	Radius          9019.52
	InertiaMoment   0.33144

	Oblateness      0.00140522

	RotationPeriod  41.5134
	Obliquity       5.90955
	EqAscendNode    -100.646

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.592 0.581 0.586)

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine/Terrestrial"
		Panspermia true	}

	Surface
	{
		SurfStyle       0.455038
		OceanStyle      0.415556
		Randomize      (0.485, 0.396, 0.251)
		colorDistMagn   0.0845065
		colorDistFreq   1098.07
		detailScale     23198.7
		colorConversion true
		drivenDarkening -1
		seaLevel        0.456134
		snowLevel       0.65
		tropicLatitude  0.110871
		icecapLatitude  0.687685
		icecapHeight    0.461386
		climatePole     0.9375
		climateTropic   0.38198
		climateEquator  0.6875
		heightTempGrad  0.409302
		tropicWidth     0.390096
		mainFreq        0.85586
		venusFreq       2
		venusMagn       0
		mareFreq        2.77146
		mareDensity     0.0603793
		terraceProb     0.224659
		erosion         0.125003
		montesMagn      0.186731
		montesFreq      500
		montesSpiky     0.996047
		montesFraction  0.861677
		dunesMagn       0.040036
		dunesFreq       58.0651
		dunesFraction   0.935985
		hillsMagn       0.131988
		hillsFreq       969.863
		hillsFraction   0.216755
		hills2Fraction  0.999948
		riversMagn      63.4658
		riversFreq      2.18516
		riversSin       6.01613
		riversOctaves   2
		canyonsMagn     0.0335493
		canyonsFreq     100
		canyonFraction  0.545157
		cracksMagn      0.139759
		cracksFreq      0.819895
		cracksOctaves   0
		craterMagn      0.688338
		craterFreq      27.292
		craterDensity   0
		craterOctaves   0
		craterRayedFactor 0
		volcanoMagn     0.664676
		volcanoFreq     0.256918
		volcanoDensity  0.276816
		volcanoOctaves  2
		volcanoActivity 0.028406
		volcanoFlows    0.435484
		volcanoRadius   0.501924
		volcanoTemp     1311.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.80565
		stripeFluct     0
		stripeTwist     0.257268
		cycloneMagn     1.76053
		cycloneFreq     0.884995
		cycloneDensity  0.338838
		cycloneOctaves  2
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
		BumpHeight      18.8832
		BumpOffset      11.3828
		DiffMapAlpha   "Water"
		SpecBrightWater 0.65
		SpecBrightIce   0.85
		SpecularPower   55
		Hapke           0.444813
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Clouds
	{
		Height          8.8291
		Velocity        100.194
		BumpHeight      1.5988
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.972625
		mainOctaves     10
		Coverage        0.28192
		stripeZones     1.80565
		stripeFluct     0
		stripeTwist     0.257268
	}

	Ocean
	{
		Height          8.61327
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
	}

	NoLava          true

	Atmosphere
	{
		Model          "Jupiter"
		Height          109.701
		Density         1.95235
		Pressure        2.7002
		Greenhouse      68.4827
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0
		Saturation      1

		Composition
		{
			He    	72.4537
			Ar    	11.9233
			O2    	9.25223
			N2    	6.01098
			H2O   	0.452403
			H2    	0.00715361
			CO    	0.000134558
			Ne    	5.66521e-005
			Xe    	4.02322e-005
		}
	}

	Aurora
	{
		Height      97.1449
		NorthLat    56.6695
		NorthLon    -158.789
		NorthRadius 2618.93
		NorthWidth  932.879
		NorthRings  3
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -46.1887
		SouthLon    8.53788
		SouthRadius 2906.98
		SouthWidth  660.881
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
		SemiMajorAxis   3.253969		Period          6.71495
		Eccentricity    0.0233113
		Inclination     -1.51531
		AscendingNode   -100.646
		ArgOfPericenter -31.6643
		MeanAnomaly     -155.394
	}
}



Moon	"Nal Yeshu.1"
{
	ParentBody     "Nal Yeshu"
	Class	       "Selena"

	Mass            0.0301967
	Radius          2096
	InertiaMoment   0.35106

	Obliquity       -0.311249
	EqAscendNode    -145.343
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.944 0.840 0.666)

	Surface
	{
		SurfStyle       0.460306
		OceanStyle      0.99811
		Randomize      (-0.592, 0.033, 0.401)
		colorDistMagn   0.0877204
		colorDistFreq   230.519
		detailScale     5391.03
		colorConversion true
		drivenDarkening 0
		seaLevel        0.249806
		snowLevel       2
		tropicLatitude  0.00323889
		icecapLatitude  1.88863
		icecapHeight    0.195232
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.03943
		venusFreq       0.333519
		venusMagn       0
		mareFreq        1.30569
		mareDensity     0.0116985
		terraceProb     0.321817
		erosion         0
		montesMagn      0.144194
		montesFreq      97.767
		montesSpiky     0.961768
		montesFraction  0.574556
		dunesMagn       0.0343253
		dunesFreq       2760.66
		dunesFraction   0.581124
		hillsMagn       0.115206
		hillsFreq       211.722
		hillsFraction   0.166519
		hills2Fraction  0
		riversMagn      55.7095
		riversFreq      3.2429
		riversSin       4.9252
		riversOctaves   0
		canyonsMagn     0.583397
		canyonsFreq     0.91531
		canyonFraction  0.524064
		cracksMagn      0.069254
		cracksFreq      0.860225
		cracksOctaves   0
		craterMagn      0.587833
		craterFreq      4.6563
		craterDensity   0.923668
		craterOctaves   11
		craterRayedFactor 0.0851185
		volcanoMagn     0.343555
		volcanoFreq     0.741184
		volcanoDensity  0.29437
		volcanoOctaves  3
		volcanoActivity 0.646292
		volcanoFlows    0.298398
		volcanoRadius   0.280768
		volcanoTemp     1127.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.420, 0.420, 0.430, 0.000)
		colorShelf     (0.470, 0.480, 0.480, 0.000)
		colorBeach     (0.519, 0.479, 0.399, 0.000)
		colorDesert    (0.453, 0.386, 0.306, 0.000)
		colorLowland   (0.576, 0.512, 0.373, 0.000)
		colorUpland    (0.614, 0.546, 0.406, 0.000)
		colorRock      (0.340, 0.340, 0.340, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.999946
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
		Height          98.2525
		Density         5.44545e-006
		Pressure        1.42311e-006
		Greenhouse      0.00371898
		Bright          1.40348
		Opacity         0
		SkyLight        0.467827
		Hue             0
		Saturation      1

		Composition
		{
			SO2   	99.9988
			Cl2   	0.000689125
			Kr    	0.000448713
			Xe    	3.16421e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00138426
		Period          0.0197542
		Eccentricity    0.0140431
		Inclination     -0.311249
		AscendingNode   -145.343
		ArgOfPericenter 7.09622
		MeanAnomaly     -164.068
	}
}



Moon	"Nal Yeshu.2"
{
	ParentBody     "Nal Yeshu"
	Class	       "IceWorld"

	Mass            0.0400745
	Radius          2447.66
	InertiaMoment   0.346652

	Obliquity       2.7964
	EqAscendNode    37.1235
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.654 0.461 0.246)

	Surface
	{
		SurfStyle       0.581124
		OceanStyle      0.166519
		Randomize      (-0.079, 0.996, 0.149)
		colorDistMagn   0.0516643
		colorDistFreq   311.787
		detailScale     6295.52
		colorConversion true
		drivenDarkening 0
		seaLevel        0.272532
		snowLevel       1
		tropicLatitude  0.0923991
		icecapLatitude  1
		icecapHeight    0.140772
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.53133
		venusFreq       1.3737
		venusMagn       0
		mareFreq        1.38285
		mareDensity     0.0136552
		terraceProb     0.470523
		erosion         0
		montesMagn      0.147669
		montesFreq      129.595
		montesSpiky     0.890829
		montesFraction  0.383936
		dunesMagn       0.0407203
		dunesFreq       100
		dunesFraction   0.413914
		hillsMagn       0.110127
		hillsFreq       305.617
		hillsFraction   0.684426
		hills2Fraction  0.0243909
		riversMagn      61.7313
		riversFreq      2.24941
		riversSin       7.28816
		riversOctaves   0
		canyonsMagn     0.663055
		canyonsFreq     1.01239
		canyonFraction  0
		cracksMagn      0.0467871
		cracksFreq      0.978855
		cracksOctaves   3
		craterMagn      0.544377
		craterFreq      7.50325
		craterDensity   0.60626
		craterOctaves   9
		craterRayedFactor 0.0951891
		volcanoMagn     0.460584
		volcanoFreq     0.62969
		volcanoDensity  0.249742
		volcanoOctaves  3
		volcanoActivity 0.163121
		volcanoFlows    0.165646
		volcanoRadius   0.411135
		volcanoTemp     1012.26
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
		colorSea       (0.196, 0.115, 0.054, 0.000)
		colorShelf     (0.242, 0.143, 0.069, 0.000)
		colorBeach     (0.366, 0.217, 0.103, 0.200)
		colorDesert    (0.333, 0.203, 0.091, 0.500)
		colorLowland   (0.255, 0.157, 0.069, 0.800)
		colorUpland    (0.431, 0.277, 0.128, 1.000)
		colorRock      (0.670, 0.620, 0.550, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.255, 0.157, 0.069, 0.800)
		colorUpPlants  (0.431, 0.277, 0.128, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.762316
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
		Height          46.6461
		Density         0.0237684
		Pressure        0.00622337
		Greenhouse      0.106331
		Bright          7.5024
		Opacity         1
		SkyLight        2.5008
		Hue             0
		Saturation      1

		Composition
		{
			SO2   	99.9966
			Kr    	0.00341183
			Xe    	2.86541e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00305669
		Period          0.0646797
		Eccentricity    0.0448555
		Inclination     2.7964
		AscendingNode   37.1235
		ArgOfPericenter 157.276
		MeanAnomaly     -177.279
	}
}




Planet	"Kiskua"
{
	ParentBody     "Y'Toub"
	Class	       "GasGiant"

	Mass            166.567
	Radius          65650.9
	InertiaMoment   0.207421

	Oblateness      0.0872469

	RotationPeriod  9.68466
	Obliquity       12.5044
	EqAscendNode    84.8067

	AlbedoBond      0.501159
	AlbedoGeom      0.60139
	Brightness      2

	Surface
	{
		SurfStyle       0.670662
		Randomize      (-0.657, 0.393, -0.814)
		detailScale     168858
		colorConversion true
		tropicLatitude  0.212177
		icecapLatitude  1
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     5.26087
		stripeFluct     0.473071
		stripeTwist     12.6754
		cycloneMagn     13.3145
		cycloneFreq     0.905566
		cycloneDensity  0.368201
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
		BumpHeight      15.9508
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          272.172
		Velocity        608.291
		BumpHeight      65.8103
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.08831
		mainOctaves     12
		Coverage        0.511586
		stripeZones     5.26087
		stripeFluct     0.473071
		stripeTwist     12.6754
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          656.508
		Density         5336.62
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0421939
		Saturation      0.981179

		Composition
		{
			H2    	93.2528
			He    	6.46006
			CH4   	0.24795
			N2    	0.0297227
			O2    	0.0061826
			Ne    	0.00111898
			C2H4  	0.00107413
			Ar    	0.00081087
			C2H2  	0.00015899
			C2H6  	0.000100257
		}
	}

	Aurora
	{
		Height      2305.2
		NorthLat    82.1499
		NorthLon    122.281
		NorthRadius 16844.9
		NorthWidth  8933.49
		NorthRings  5
		NorthBright 1
		NorthParticles 10000
		SouthLat    -81.7445
		SouthLon    299.906
		SouthRadius 14726.1
		SouthWidth  6670.24
		SouthRings  4
		SouthBright 1
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	NoRings true	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.71560		Period          11.7108
		Eccentricity    0.1324247
		Inclination     -2.48449
		AscendingNode   78.5108
		ArgOfPericenter 92.074
		MeanAnomaly     341.105
	}
}


Moon	"Kiskua.1"
{
	ParentBody     "Kiskua"
	Class	       "Oceania"

	Mass            0.534391
	Radius          6723.16
	InertiaMoment   0.329902

	Oblateness      0.00577825

	Obliquity       1.15648
	EqAscendNode    54.4842
	TidalLocked     true

	AlbedoBond      0.5
	AlbedoGeom      0.389919
	Brightness      2
	Color          (0.443 0.504 0.573)

	Life
	{
		Class   "Organic"
		Type    "Unicellular"
		Biome   "Marine"
	}

	Surface
	{
		SurfStyle       0.141343
		OceanStyle      0.531746
		Randomize      (0.425, -0.912, 0.894)
		colorDistMagn   0.0622768
		colorDistFreq   1024.8
		detailScale     17292.3
		colorConversion true
		drivenDarkening -1
		seaLevel        0.999998
		snowLevel       1
		tropicLatitude  0.0358821
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.73534
		venusFreq       1
		venusMagn       0.207246
		mareFreq        0.001
		mareDensity     0
		terraceProb     0.204961
		erosion         0
		montesMagn      0.243984
		montesFreq      382.928
		montesSpiky     0.949272
		montesFraction  0.438287
		dunesMagn       0.0522707
		dunesFreq       58.3009
		dunesFraction   0.0681886
		hillsMagn       0.10086
		hillsFreq       1000
		hillsFraction   0.827131
		hills2Fraction  0.088883
		riversMagn      62.6988
		riversFreq      2.2624
		riversSin       6.3711
		riversOctaves   0
		canyonsMagn     0.0239518
		canyonsFreq     100
		canyonFraction  0.712717
		cracksMagn      0.0797651
		cracksFreq      0.703586
		cracksOctaves   0
		craterMagn      0
		craterFreq      60
		craterDensity   0
		craterOctaves   0
		craterRayedFactor 0
		volcanoMagn     0
		volcanoFreq     0
		volcanoDensity  0
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0
		volcanoTemp     0
		lavaCoverTidal  0.522076
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.88918
		stripeFluct     0.3
		stripeTwist     0.146763
		cycloneMagn     12.9279
		cycloneFreq     1.51885
		cycloneDensity  0.411134
		cycloneOctaves  3
		colorSea       (0.040, 0.100, 0.200, 1.000)
		colorShelf     (0.150, 0.480, 0.460, 1.000)
		colorBeach     (0.950, 0.950, 0.950, 1.308)
		colorDesert    (0.770, 0.770, 0.470, 1.308)
		colorLowland   (0.880, 0.880, 0.880, 1.308)
		colorUpland    (1.000, 1.000, 1.000, 1.308)
		colorRock      (1.000, 1.000, 1.000, 1.308)
		colorSnow      (1.000, 1.000, 1.000, 1.308)
		BumpHeight      82.5661
		BumpOffset      79.2559
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
		Height          6.18457
		Velocity        107.551
		BumpHeight      2.453
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.936539
		mainOctaves     10
		Coverage        0.597324
		stripeZones     1.88918
		stripeFluct     0.3
		stripeTwist     0.146763
	}

	Ocean
	{
		Height          82.566
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
	}

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          92.8339
		Density         1.55346
		Pressure        0.872726
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0
		Saturation      1

		Composition
		{
			CO2   	98.5288
			H2O   	1.31701
			NH3   	0.0963309
			CH4   	0.0147012
			C2H4  	0.0113379
			O2    	0.0105217
			N2    	0.0101695
			H2S   	0.00706804
			SO2   	0.00155713
			C2H2  	0.0014844
			CO    	0.000499183
			C2H6  	0.000388621
			Ne    	0.00015059
			Ar    	2.68155e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00167472
		Period          0.00307078
		Eccentricity    0.0067632
		Inclination     1.15648
		AscendingNode   54.4842
		ArgOfPericenter 64.246
		MeanAnomaly     -99.0895
	}
}



Moon	"Kiskua.2"
{
	ParentBody     "Kiskua"
	Class	       "Selena"

	Mass            0.0445272
	Radius          2657
	InertiaMoment   0.347238

	Obliquity       -0.373431
	EqAscendNode    43.6691
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.740 0.704 0.664)

	Surface
	{
		SurfStyle       0.151902
		OceanStyle      0.550955
		Randomize      (0.952, -0.719, 0.938)
		colorDistMagn   0.0924599
		colorDistFreq   313.081
		detailScale     6833.96
		colorConversion true
		drivenDarkening 0
		seaLevel        0.26313
		snowLevel       2
		tropicLatitude  0.0120989
		icecapLatitude  0.932669
		icecapHeight    0.266275
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.73006
		venusFreq       0.991161
		venusMagn       0
		mareFreq        1.48339
		mareDensity     0.00846505
		terraceProb     0.222219
		erosion         0
		montesMagn      0.153899
		montesFreq      144.622
		montesSpiky     0.983456
		montesFraction  0.962996
		dunesMagn       0.0459205
		dunesFreq       3471.99
		dunesFraction   0.311408
		hillsMagn       0.104301
		hillsFreq       284.052
		hillsFraction   0.996368
		hills2Fraction  0
		riversMagn      59.3746
		riversFreq      1.23358
		riversSin       5.25061
		riversOctaves   0
		canyonsMagn     0.512169
		canyonsFreq     0.942191
		canyonFraction  0.975232
		cracksMagn      0.050956
		cracksFreq      0.794304
		cracksOctaves   0
		craterMagn      0.502641
		craterFreq      5.62116
		craterDensity   0.803933
		craterOctaves   10.2019
		craterRayedFactor 0
		volcanoMagn     0.561903
		volcanoFreq     0.628754
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.251544
		volcanoRadius   0.420027
		volcanoTemp     1863.74
		lavaCoverTidal  0.166488
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.320, 0.320, 0.000)
		colorShelf     (0.370, 0.370, 0.370, 0.000)
		colorBeach     (0.370, 0.352, 0.332, 0.000)
		colorDesert    (0.459, 0.422, 0.378, 0.200)
		colorLowland   (0.496, 0.451, 0.425, 0.500)
		colorUpland    (0.518, 0.472, 0.438, 0.800)
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
		Height          83.959
		Density         1.73287e-008
		Pressure        3.03447e-009
		Greenhouse      0.000214544
		Bright          0.5
		Opacity         0
		SkyLight        0.166667
		Hue             0.0346444
		Saturation      1

		Composition
		{
			SO2   	92.3402
			Kr    	3.42607
			CO2   	3.39639
			Xe    	0.769305
			Cl2   	0.0415565
			C3H8  	0.026444
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00277871
		Period          0.00656282
		Eccentricity    0.0148466
		Inclination     -0.373431
		AscendingNode   43.6691
		ArgOfPericenter -45.9301
		MeanAnomaly     24.4793
	}
}




Moon	"Kiskua.3"
{
	ParentBody     "Kiskua"
	Class	       "Selena"

	Mass            0.0374249
	Radius          2718.66
	InertiaMoment   0.351952

	Oblateness      0.00591614

	Obliquity       1.15648
	EqAscendNode    54.4842
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.725 0.662 0.567)

	Surface
	{
		SurfStyle       0.97835
		OceanStyle      0.491984
		Randomize      (0.461, -0.163, -0.944)
		colorDistMagn   0.0555077
		colorDistFreq   263.731
		detailScale     6992.55
		colorConversion true
		drivenDarkening 0
		seaLevel        0.146836
		snowLevel       2
		tropicLatitude  0.0358821
		icecapLatitude  0.961088
		icecapHeight    0.149056
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.79377
		venusFreq       1.08398
		venusMagn       0
		mareFreq        1.1895
		mareDensity     0.0066701
		terraceProb     0.132722
		erosion         0
		montesMagn      0.205784
		montesFreq      110.758
		montesSpiky     0.971568
		montesFraction  0.119087
		dunesMagn       0.0555046
		dunesFreq       3599.72
		dunesFraction   0.440497
		hillsMagn       0.113307
		hillsFreq       252.618
		hillsFraction   0.0208306
		hills2Fraction  0
		riversMagn      58.7275
		riversFreq      4.20364
		riversSin       7.63331
		riversOctaves   0
		canyonsMagn     0.513842
		canyonsFreq     0.93601
		canyonFraction  0.349923
		cracksMagn      0.0348739
		cracksFreq      1.68422
		cracksOctaves   0
		craterMagn      0.63546
		craterFreq      7.92248
		craterDensity   0.633366
		craterOctaves   8.21277
		craterRayedFactor 0.0516827
		volcanoMagn     0.483724
		volcanoFreq     0.597869
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.275404
		volcanoRadius   0.448444
		volcanoTemp     1257.54
		lavaCoverTidal  0.350669
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.390, 0.400, 0.160, 0.000)
		colorShelf     (0.580, 0.550, 0.240, 0.000)
		colorBeach     (0.515, 0.450, 0.238, 0.000)
		colorDesert    (0.594, 0.503, 0.244, 0.000)
		colorLowland   (0.457, 0.364, 0.176, 0.000)
		colorUpland    (0.428, 0.338, 0.164, 0.000)
		colorRock      (0.330, 0.240, 0.130, 0.000)
		colorSnow      (0.900, 0.890, 0.760, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.999945
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
		Height          169.349
		Density         5.53822e-006
		Pressure        1.4078e-006
		Greenhouse      0.00360175
		Bright          1.40823
		Opacity         0
		SkyLight        0.46941
		Hue             0.026893
		Saturation      1

		Composition
		{
			SO2   	99.9975
			Cl2   	0.00130478
			Kr    	0.00116938
			Xe    	5.95201e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00461044
		Period          0.0140056
		Eccentricity    0.0245501
		Inclination     1.28699
		AscendingNode   -36.1094
		ArgOfPericenter -19.5822
		MeanAnomaly     6.05269
	}
}



DwarfMoon	"Kiskua.D1"
{
	ParentBody     "Kiskua"
	Class	       "Asteroid"

	Mass            1.24676e-006
	Radius          157.23
	InertiaMoment   0.395622

	Obliquity       -24.2283
	EqAscendNode    -74.5285
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.437 0.429 0.425)

	Surface
	{
		SurfStyle       0.328601
		OceanStyle      0.377491
		Randomize      (0.399, 0.309, -0.264)
		colorDistMagn   0.921839
		colorDistFreq   7.73442
		detailScale     4293.44
		colorConversion true
		snowLevel       2
		tropicLatitude  0.617374
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.534843
		terraceProb     0.664516
		erosion         0
		montesMagn      0.666964
		montesFreq      2.66752
		montesSpiky     0.852964
		montesFraction  0.58962
		dunesFraction   0
		hillsMagn       0
		hillsFreq       54.0968
		hillsFraction   0.790474
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214684
		craterFreq      0.893071
		craterDensity   1.01089
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.503722
		volcanoTemp     1438.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.175, 0.172, 0.170, 0.000)
		colorShelf     (0.186, 0.182, 0.181, 0.000)
		colorBeach     (0.197, 0.193, 0.191, 0.000)
		colorDesert    (0.208, 0.204, 0.202, 0.000)
		colorLowland   (0.219, 0.215, 0.212, 0.000)
		colorUpland    (0.230, 0.225, 0.223, 0.000)
		colorRock      (0.240, 0.236, 0.234, 0.000)
		colorSnow      (0.251, 0.247, 0.244, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0232397
		Period          0.158756
		Eccentricity    0.0368539
		Inclination     -24.2283
		AscendingNode   -74.5285
		ArgOfPericenter -132.357
		MeanAnomaly     101.924
	}
}



DwarfMoon	"Kiskua.D2"
{
	ParentBody     "Kiskua"
	Class	       "Asteroid"

	Mass            1.82752e-006
	Radius          171.219
	InertiaMoment   0.398239

	Obliquity       -37.7276
	EqAscendNode    -57.7061
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.774 0.721 0.685)

	Surface
	{
		SurfStyle       0.678918
		OceanStyle      0.548132
		Randomize      (-0.002, -0.509, 0.990)
		colorDistMagn   0.789267
		colorDistFreq   18.4905
		detailScale     4675.42
		colorConversion true
		snowLevel       2
		tropicLatitude  0.904947
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.583225
		terraceProb     0.440595
		erosion         0
		montesMagn      0.463075
		montesFreq      3.11033
		montesSpiky     0.968666
		montesFraction  0.573278
		dunesFraction   0
		hillsMagn       0
		hillsFreq       95.9546
		hillsFraction   0.570022
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251022
		craterFreq      0.98677
		craterDensity   0.728776
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.367056
		volcanoTemp     1630.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.302, 0.245, 0.192, 0.000)
		colorShelf     (0.310, 0.252, 0.219, 0.000)
		colorBeach     (0.364, 0.296, 0.260, 0.000)
		colorDesert    (0.395, 0.317, 0.254, 0.000)
		colorLowland   (0.433, 0.339, 0.288, 0.000)
		colorUpland    (0.480, 0.411, 0.349, 0.000)
		colorRock      (0.519, 0.447, 0.377, 0.000)
		colorSnow      (0.565, 0.476, 0.397, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0237176
		Period          0.163678
		Eccentricity    0.164758
		Inclination     -37.7276
		AscendingNode   -57.7061
		ArgOfPericenter 87.4983
		MeanAnomaly     -126.327
	}
}



DwarfMoon	"Kiskua.D3"
{
	ParentBody     "Kiskua"
	Class	       "Asteroid"

	Mass            2.72968e-006
	Radius          187.501
	InertiaMoment   0.399306

	Obliquity       25.4962
	EqAscendNode    162.307
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.788 0.686 0.651)

	Surface
	{
		SurfStyle       0.166184
		OceanStyle      0.633431
		Randomize      (0.230, -0.808, 0.987)
		colorDistMagn   0.82708
		colorDistFreq   28.7799
		detailScale     5120.02
		colorConversion true
		snowLevel       2
		tropicLatitude  0.132108
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.642504
		terraceProb     0.345192
		erosion         0
		montesMagn      0.543756
		montesFreq      4.17894
		montesSpiky     0.900523
		montesFraction  0.359076
		dunesFraction   0
		hillsMagn       0
		hillsFreq       107.355
		hillsFraction   0.445304
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23402
		craterFreq      1.28938
		craterDensity   0.874581
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.473667
		volcanoTemp     1571.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.315, 0.274, 0.260, 0.000)
		colorShelf     (0.335, 0.291, 0.277, 0.000)
		colorBeach     (0.354, 0.309, 0.293, 0.000)
		colorDesert    (0.374, 0.326, 0.309, 0.000)
		colorLowland   (0.394, 0.343, 0.325, 0.000)
		colorUpland    (0.413, 0.360, 0.342, 0.000)
		colorRock      (0.433, 0.377, 0.358, 0.000)
		colorSnow      (0.453, 0.394, 0.374, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0242409
		Period          0.169125
		Eccentricity    0.146065
		Inclination     25.4962
		AscendingNode   162.307
		ArgOfPericenter 129.255
		MeanAnomaly     -10.4789
	}
}


DwarfMoon	"Kiskua.D4"
{
	ParentBody     "Kiskua"
	Class	       "Asteroid"

	Mass            1.06916e-011
	Radius          3.24109
	InertiaMoment   0.398416

	Obliquity       -10.0485
	EqAscendNode    -138.941
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.835 0.786 0.754)

	Surface
	{
		SurfStyle       0.65029
		OceanStyle      0.356472
		Randomize      (-0.176, -0.895, -0.140)
		colorDistMagn   0.457146
		colorDistFreq   0.00439793
		detailScale     88.5034
		colorConversion true
		snowLevel       2
		tropicLatitude  0.122146
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.351643
		terraceProb     0.279674
		erosion         0
		montesMagn      0.511671
		montesFreq      2.9601
		montesSpiky     0.884599
		montesFraction  0.703035
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0209969
		hillsFraction   0.501939
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231833
		craterFreq      0.219771
		craterDensity   0.875764
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.526446
		volcanoTemp     1461.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.326, 0.267, 0.211, 0.000)
		colorShelf     (0.334, 0.275, 0.241, 0.000)
		colorBeach     (0.393, 0.322, 0.286, 0.000)
		colorDesert    (0.426, 0.346, 0.279, 0.000)
		colorLowland   (0.468, 0.369, 0.317, 0.000)
		colorUpland    (0.518, 0.448, 0.384, 0.000)
		colorRock      (0.560, 0.487, 0.415, 0.000)
		colorSnow      (0.610, 0.519, 0.437, 1.000)
		BumpHeight      2.91698
		BumpOffset      0.583396
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0249847
		Period          0.176968
		Eccentricity    0.043073
		Inclination     -10.0485
		AscendingNode   -138.941
		ArgOfPericenter 179.019
		MeanAnomaly     39.7662
	}
}



DwarfMoon	"Kiskua.D5"
{
	ParentBody     "Kiskua"
	Class	       "Asteroid"

	Mass            2.22632e-011
	Radius          3.96186
	InertiaMoment   0.399437

	RotationPeriod  4740.95
	Obliquity       -84.6856
	EqAscendNode    73.3938

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.725 0.723 0.721)

	Surface
	{
		SurfStyle       0.066056
		OceanStyle      0.101908
		Randomize      (0.160, -0.239, 0.980)
		colorDistMagn   0.58028
		colorDistFreq   0.003074
		detailScale     108.185
		colorConversion true
		snowLevel       2
		tropicLatitude  0.961512
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.285572
		terraceProb     0.239454
		erosion         0
		montesMagn      0.437681
		montesFreq      3.2833
		montesSpiky     0.991038
		montesFraction  0.433895
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0302711
		hillsFraction   0.535729
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240787
		craterFreq      0.160378
		craterDensity   0.868682
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.536269
		volcanoTemp     1726.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.290, 0.289, 0.288, 0.000)
		colorShelf     (0.308, 0.307, 0.306, 0.000)
		colorBeach     (0.326, 0.325, 0.324, 0.000)
		colorDesert    (0.344, 0.343, 0.342, 0.000)
		colorLowland   (0.362, 0.362, 0.360, 0.000)
		colorUpland    (0.380, 0.380, 0.379, 0.000)
		colorRock      (0.399, 0.398, 0.397, 0.000)
		colorSnow      (0.417, 0.416, 0.415, 1.000)
		BumpHeight      3.56567
		BumpOffset      0.713135
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0252956
		Period          0.180282
		Eccentricity    0.172974
		Inclination     -84.6856
		AscendingNode   73.3938
		ArgOfPericenter 154.499
		MeanAnomaly     -169.12
	}
}



DwarfMoon	"Kiskua.D6"
{
	ParentBody     "Kiskua"
	Class	       "Asteroid"

	Mass            4.18632e-011
	Radius          4.69114
	InertiaMoment   0.396958

	RotationPeriod  2461.21
	Obliquity       4.67449
	EqAscendNode    -59.9888

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.549 0.540 0.536)

	Surface
	{
		SurfStyle       0.768572
		OceanStyle      0.815916
		Randomize      (0.927, -0.086, -0.132)
		colorDistMagn   0.775467
		colorDistFreq   0.0164398
		detailScale     128.099
		colorConversion true
		snowLevel       2
		tropicLatitude  0.140809
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.398007
		terraceProb     0.243836
		erosion         0
		montesMagn      0.671804
		montesFreq      3.26415
		montesSpiky     0.99045
		montesFraction  0.568853
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0404217
		hillsFraction   0.774196
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.206234
		craterFreq      0.21207
		craterDensity   0.966093
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.44575
		volcanoTemp     1348.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.214, 0.184, 0.150, 0.000)
		colorShelf     (0.220, 0.189, 0.171, 0.000)
		colorBeach     (0.258, 0.222, 0.204, 0.000)
		colorDesert    (0.280, 0.238, 0.198, 0.000)
		colorLowland   (0.307, 0.254, 0.225, 0.000)
		colorUpland    (0.340, 0.308, 0.273, 0.000)
		colorRock      (0.368, 0.335, 0.295, 0.000)
		colorSnow      (0.401, 0.357, 0.311, 1.000)
		BumpHeight      4.22203
		BumpOffset      0.844406
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.025937
		Period          0.187182
		Eccentricity    0.237099
		Inclination     4.67449
		AscendingNode   -59.9888
		ArgOfPericenter -160.8
		MeanAnomaly     6.89869
	}
}

DwarfMoon	"Kiskua.D7"
{
	ParentBody     "Kiskua"
	Class	       "Asteroid"

	Mass            1.21871e-010
	Radius          7.34988
	InertiaMoment   0.399566

	Obliquity       -56.1383
	EqAscendNode    159.218
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.625 0.545 0.399)

	Surface
	{
		SurfStyle       0.557898
		OceanStyle      0.824157
		Randomize      (0.565, 0.309, 0.589)
		colorDistMagn   0.570973
		colorDistFreq   0.0189017
		detailScale     200.701
		colorConversion true
		snowLevel       2
		tropicLatitude  0.296161
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.65855
		terraceProb     0.34141
		erosion         0
		montesMagn      0.55707
		montesFreq      2.42975
		montesSpiky     0.957924
		montesFraction  0.556528
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.139893
		hillsFraction   0.461708
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231423
		craterFreq      0.205573
		craterDensity   0.885941
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.409812
		volcanoTemp     1872.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.244, 0.185, 0.112, 0.000)
		colorShelf     (0.250, 0.191, 0.128, 0.000)
		colorBeach     (0.294, 0.224, 0.152, 0.000)
		colorDesert    (0.319, 0.240, 0.148, 0.000)
		colorLowland   (0.350, 0.256, 0.168, 0.000)
		colorUpland    (0.387, 0.311, 0.204, 0.000)
		colorRock      (0.418, 0.338, 0.220, 0.000)
		colorSnow      (0.456, 0.360, 0.232, 1.000)
		BumpHeight      6.61489
		BumpOffset      1.32298
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.027022
		Period          0.19905
		Eccentricity    0.396888
		Inclination     -56.1383
		AscendingNode   159.218
		ArgOfPericenter -91.0731
		MeanAnomaly     -16.2398
	}
}



DwarfMoon	"Kiskua.D8"
{
	ParentBody     "Kiskua"
	Class	       "Asteroid"

	Mass            1.9463e-010
	Radius          8.20788
	InertiaMoment   0.397307

	Obliquity       -24.3952
	EqAscendNode    -152.833
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.495 0.431 0.351)

	Surface
	{
		SurfStyle       0.827107
		OceanStyle      0.891558
		Randomize      (-0.839, -0.411, -0.351)
		colorDistMagn   0.822587
		colorDistFreq   0.0256439
		detailScale     224.13
		colorConversion true
		snowLevel       2
		tropicLatitude  0.193091
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.414571
		terraceProb     0.395734
		erosion         0
		montesMagn      0.406761
		montesFreq      2.60546
		montesSpiky     0.70579
		montesFraction  0.442711
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.156576
		hillsFraction   0.453265
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247054
		craterFreq      0.200368
		craterDensity   0.763929
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.489025
		volcanoTemp     1402.24
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.193, 0.146, 0.098, 0.000)
		colorShelf     (0.198, 0.151, 0.112, 0.000)
		colorBeach     (0.233, 0.177, 0.133, 0.000)
		colorDesert    (0.252, 0.190, 0.130, 0.000)
		colorLowland   (0.277, 0.202, 0.147, 0.000)
		colorUpland    (0.307, 0.246, 0.179, 0.000)
		colorRock      (0.332, 0.267, 0.193, 0.000)
		colorSnow      (0.361, 0.284, 0.204, 1.000)
		BumpHeight      7.38709
		BumpOffset      1.47742
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0272564
		Period          0.201645
		Eccentricity    0.467834
		Inclination     -24.3952
		AscendingNode   -152.833
		ArgOfPericenter -140.012
		MeanAnomaly     92.5601
	}
}



DwarfMoon	"Kiskua.D9"
{
	ParentBody     "Kiskua"
	Class	       "Asteroid"

	Mass            3.01199e-010
	Radius          9.11543
	InertiaMoment   0.398738

	RotationPeriod  5444.32
	Obliquity       -68.0812
	EqAscendNode    -123.12

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.556 0.552 0.549)

	Surface
	{
		SurfStyle       0.773369
		OceanStyle      0.873265
		Randomize      (0.463, -0.713, -0.290)
		colorDistMagn   0.402142
		colorDistFreq   0.0363009
		detailScale     248.912
		colorConversion true
		snowLevel       2
		tropicLatitude  0.792709
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.291419
		terraceProb     0.199873
		erosion         0
		montesMagn      0.293784
		montesFreq      3.20229
		montesSpiky     0.861133
		montesFraction  0.578326
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.209817
		hillsFraction   0.713249
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24358
		craterFreq      0.144636
		craterDensity   0.88961
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.431749
		volcanoTemp     1520.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.217, 0.188, 0.154, 0.000)
		colorShelf     (0.222, 0.193, 0.176, 0.000)
		colorBeach     (0.261, 0.226, 0.209, 0.000)
		colorDesert    (0.284, 0.243, 0.203, 0.000)
		colorLowland   (0.311, 0.259, 0.231, 0.000)
		colorUpland    (0.345, 0.314, 0.280, 0.000)
		colorRock      (0.373, 0.342, 0.302, 0.000)
		colorSnow      (0.406, 0.364, 0.318, 1.000)
		BumpHeight      8.20389
		BumpOffset      1.64078
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0277394
		Period          0.207028
		Eccentricity    0.118867
		Inclination     -68.0812
		AscendingNode   -123.12
		ArgOfPericenter -133.387
		MeanAnomaly     -92.3757
	}
}



DwarfMoon	"Kiskua.D10"
{
	ParentBody     "Kiskua"
	Class	       "Asteroid"

	Mass            4.54487e-010
	Radius          9.59645
	InertiaMoment   0.399693

	RotationPeriod  3722.46
	Obliquity       7.17531
	EqAscendNode    -41.9189

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.581 0.574 0.569)

	Surface
	{
		SurfStyle       0.834912
		OceanStyle      0.466536
		Randomize      (-0.439, 0.934, -0.183)
		colorDistMagn   0.375238
		colorDistFreq   0.0280762
		detailScale     262.047
		colorConversion true
		snowLevel       2
		tropicLatitude  0.23169
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.611087
		terraceProb     0.183864
		erosion         0
		montesMagn      0.333618
		montesFreq      3.28128
		montesSpiky     0.951331
		montesFraction  0.455128
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.259033
		hillsFraction   0.547251
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252522
		craterFreq      0.186477
		craterDensity   1.08522
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.483754
		volcanoTemp     1499.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.227, 0.195, 0.159, 0.000)
		colorShelf     (0.232, 0.201, 0.182, 0.000)
		colorBeach     (0.273, 0.235, 0.216, 0.000)
		colorDesert    (0.296, 0.253, 0.210, 0.000)
		colorLowland   (0.325, 0.270, 0.239, 0.000)
		colorUpland    (0.360, 0.327, 0.290, 0.000)
		colorRock      (0.389, 0.356, 0.313, 0.000)
		colorSnow      (0.424, 0.379, 0.330, 1.000)
		BumpHeight      8.63681
		BumpOffset      1.72736
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0282108
		Period          0.212328
		Eccentricity    0.219342
		Inclination     7.17531
		AscendingNode   -41.9189
		ArgOfPericenter 43.1703
		MeanAnomaly     179.295
	}
}



DwarfMoon	"Kiskua.D11"
{
	ParentBody     "Kiskua"
	Class	       "Asteroid"

	Mass            6.71797e-010
	Radius          13.0919
	InertiaMoment   0.397589

	Obliquity       49.1441
	EqAscendNode    -175.914
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.634 0.631 0.624)

	Surface
	{
		SurfStyle       0.919433
		OceanStyle      0.810482
		Randomize      (0.520, -0.942, -0.218)
		colorDistMagn   0.961979
		colorDistFreq   0.134613
		detailScale     357.496
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0539062
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.415114
		terraceProb     0.291973
		erosion         0
		montesMagn      0.486882
		montesFreq      2.8492
		montesSpiky     0.832388
		montesFraction  0.923655
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.276273
		hillsFraction   0.740884
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227179
		craterFreq      0.229609
		craterDensity   0.947739
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.529354
		volcanoTemp     1671.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.216, 0.221, 0.250, 0.050)
		colorShelf     (0.254, 0.259, 0.287, 0.040)
		colorBeach     (0.292, 0.296, 0.325, 0.030)
		colorDesert    (0.330, 0.334, 0.368, 0.020)
		colorLowland   (0.368, 0.372, 0.406, 0.030)
		colorUpland    (0.406, 0.410, 0.443, 0.050)
		colorRock      (0.444, 0.448, 0.493, 0.020)
		colorSnow      (0.444, 0.448, 0.493, 1.000)
		BumpHeight      11.7827
		BumpOffset      2.35654
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0287261
		Period          0.218172
		Eccentricity    0.269119
		Inclination     49.1441
		AscendingNode   -175.914
		ArgOfPericenter 124.235
		MeanAnomaly     124.052
	}
}

DwarfMoon	"Kiskua.D12"
{
	ParentBody     "Kiskua"
	Class	       "Asteroid"

	Mass            9.76274e-010
	Radius          14.1313
	InertiaMoment   0.398887

	Obliquity       -35.0077
	EqAscendNode    -40.1005
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.647 0.641 0.639)

	Surface
	{
		SurfStyle       0.567559
		OceanStyle      0.638942
		Randomize      (-0.145, 0.741, 0.795)
		colorDistMagn   0.63164
		colorDistFreq   0.0773347
		detailScale     385.877
		colorConversion true
		snowLevel       2
		tropicLatitude  0.907922
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.403629
		terraceProb     0.293368
		erosion         0
		montesMagn      0.367948
		montesFreq      3.15953
		montesSpiky     0.969624
		montesFraction  0.581427
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.480034
		hillsFraction   0.708833
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226983
		craterFreq      0.170578
		craterDensity   1.00328
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.487261
		volcanoTemp     1631.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.252, 0.218, 0.179, 0.000)
		colorShelf     (0.259, 0.224, 0.204, 0.000)
		colorBeach     (0.304, 0.263, 0.243, 0.000)
		colorDesert    (0.330, 0.282, 0.236, 0.000)
		colorLowland   (0.362, 0.301, 0.268, 0.000)
		colorUpland    (0.401, 0.366, 0.326, 0.000)
		colorRock      (0.433, 0.398, 0.351, 0.000)
		colorSnow      (0.472, 0.423, 0.370, 1.000)
		BumpHeight      12.7181
		BumpOffset      2.54363
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0291589
		Period          0.223122
		Eccentricity    0.202245
		Inclination     -35.0077
		AscendingNode   -40.1005
		ArgOfPericenter 118.662
		MeanAnomaly     82.8515
	}
}



DwarfMoon	"Kiskua.D13"
{
	ParentBody     "Kiskua"
	Class	       "Asteroid"

	Mass            1.39885e-009
	Radius          15.3024
	InertiaMoment   0.399819

	RotationPeriod  3338.71
	Obliquity       17.8231
	EqAscendNode    165.02

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.749 0.746 0.742)

	Surface
	{
		SurfStyle       0.649998
		OceanStyle      0.343365
		Randomize      (0.473, -0.525, -0.768)
		colorDistMagn   0.310442
		colorDistFreq   0.147123
		detailScale     417.859
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0797327
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.638914
		terraceProb     0.148654
		erosion         0
		montesMagn      0.371165
		montesFreq      2.73136
		montesSpiky     0.988196
		montesFraction  0.469509
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.492041
		hillsFraction   0.795895
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249208
		craterFreq      0.226522
		craterDensity   0.739812
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.437016
		volcanoTemp     1825.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.292, 0.254, 0.208, 0.000)
		colorShelf     (0.299, 0.261, 0.237, 0.000)
		colorBeach     (0.352, 0.306, 0.282, 0.000)
		colorDesert    (0.382, 0.328, 0.275, 0.000)
		colorLowland   (0.419, 0.351, 0.312, 0.000)
		colorUpland    (0.464, 0.425, 0.378, 0.000)
		colorRock      (0.502, 0.463, 0.408, 0.000)
		colorSnow      (0.546, 0.493, 0.430, 1.000)
		BumpHeight      13.7722
		BumpOffset      2.75444
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.029628
		Period          0.228527
		Eccentricity    0.229891
		Inclination     17.8231
		AscendingNode   165.02
		ArgOfPericenter -35.0124
		MeanAnomaly     -178.926
	}
}



DwarfMoon	"Kiskua.D14"
{
	ParentBody     "Kiskua"
	Class	       "Asteroid"

	Mass            1.98084e-009
	Radius          16.1507
	InertiaMoment   0.397829

	Obliquity       -20.4368
	EqAscendNode    72.6327
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.658 0.655 0.650)

	Surface
	{
		SurfStyle       0.298231
		OceanStyle      0.141871
		Randomize      (0.383, 0.733, -0.271)
		colorDistMagn   0.931369
		colorDistFreq   0.0838782
		detailScale     441.021
		colorConversion true
		snowLevel       2
		tropicLatitude  0.539971
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.501745
		terraceProb     0.167987
		erosion         0
		montesMagn      0.520275
		montesFreq      2.53836
		montesSpiky     0.849656
		montesFraction  0.632772
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.547329
		hillsFraction   0.580757
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220971
		craterFreq      0.184777
		craterDensity   0.827322
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.514486
		volcanoTemp     1487.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.263, 0.262, 0.260, 0.000)
		colorShelf     (0.280, 0.279, 0.276, 0.000)
		colorBeach     (0.296, 0.295, 0.292, 0.000)
		colorDesert    (0.313, 0.311, 0.309, 0.000)
		colorLowland   (0.329, 0.328, 0.325, 0.000)
		colorUpland    (0.346, 0.344, 0.341, 0.000)
		colorRock      (0.362, 0.360, 0.357, 0.000)
		colorSnow      (0.379, 0.377, 0.374, 1.000)
		BumpHeight      14.5356
		BumpOffset      2.90712
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0299586
		Period          0.232363
		Eccentricity    0.46262
		Inclination     -20.4368
		AscendingNode   72.6327
		ArgOfPericenter -60.625
		MeanAnomaly     -67.2956
	}
}


DwarfMoon	"Kiskua.D15"
{
	ParentBody     "Kiskua"
	Class	       "Asteroid"

	Mass            2.77751e-009
	Radius          21.208
	InertiaMoment   0.39903

	RotationPeriod  5180.61
	Obliquity       -73.8315
	EqAscendNode    138.418

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.689 0.539 0.434)

	Surface
	{
		SurfStyle       0.479465
		OceanStyle      0.547934
		Randomize      (0.963, -0.027, -0.938)
		colorDistMagn   0.627083
		colorDistFreq   0.370701
		detailScale     579.119
		colorConversion true
		snowLevel       2
		tropicLatitude  0.640992
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.52351
		terraceProb     0.199495
		erosion         0
		montesMagn      0.591274
		montesFreq      2.75727
		montesSpiky     0.939741
		montesFraction  0.415251
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.904624
		hillsFraction   0.539107
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261846
		craterFreq      0.19451
		craterDensity   0.926085
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.543561
		volcanoTemp     1725.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.276, 0.216, 0.173, 0.000)
		colorShelf     (0.293, 0.229, 0.184, 0.000)
		colorBeach     (0.310, 0.243, 0.195, 0.000)
		colorDesert    (0.327, 0.256, 0.206, 0.000)
		colorLowland   (0.345, 0.270, 0.217, 0.000)
		colorUpland    (0.362, 0.283, 0.228, 0.000)
		colorRock      (0.379, 0.297, 0.238, 0.000)
		colorSnow      (0.396, 0.310, 0.249, 1.000)
		BumpHeight      19.0872
		BumpOffset      3.81744
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0303047
		Period          0.236401
		Eccentricity    0.106909
		Inclination     -73.8315
		AscendingNode   138.418
		ArgOfPericenter 12.6435
		MeanAnomaly     42.5096
	}
}




Planet	"Nar Hekka"
{
	ParentBody     "Y'Toub"
	Class	       "Desert"

	Mass            1.28465
	Radius          7222.99
	InertiaMoment   0.328109

	Oblateness      0.00484891

	RotationPeriod  21.0353
	Obliquity       17.7015
	EqAscendNode    -50.3792

	AlbedoBond      0.299674
	AlbedoGeom      0.359609
	Brightness      2
	Color          (0.617 0.555 0.623)

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Terrestrial"
		Panspermia "true"
	}

	Surface
	{
		SurfStyle       0.572222
		OceanStyle      0.841474
		Randomize      (-0.246, -0.435, -0.553)
		colorDistMagn   0.0498184
		colorDistFreq   803.636
		detailScale     18577.9
		colorConversion true
		drivenDarkening -1
		seaLevel        0.184539
		snowLevel       0.65
		tropicLatitude  0.298791
		icecapLatitude  0.893277
		icecapHeight    0.0920729
		climatePole     0.9375
		climateTropic   0.1125
		climateEquator  0.3475
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.919593
		venusFreq       0.993092
		venusMagn       0.374694
		mareFreq        1.71786
		mareDensity     0.200856
		terraceProb     0.221229
		erosion         0
		montesMagn      0.253709
		montesFreq      236.259
		montesSpiky     0.979861
		montesFraction  0.816836
		dunesMagn       0.0645062
		dunesFreq       54.2889
		dunesFraction   0.531565
		hillsMagn       0.141905
		hillsFreq       1000
		hillsFraction   0
		hills2Fraction  0
		riversMagn      59.0642
		riversFreq      2.82215
		riversSin       4.8074
		riversOctaves   0
		canyonsMagn     0.0386421
		canyonsFreq     100
		canyonFraction  0
		cracksMagn      0.0983526
		cracksFreq      0.703
		cracksOctaves   0
		craterMagn      0.572113
		craterFreq      20.5489
		craterDensity   0.175672
		craterOctaves   3
		craterRayedFactor 0
		volcanoMagn     0.649414
		volcanoFreq     0.783495
		volcanoDensity  0.327872
		volcanoOctaves  3
		volcanoActivity 0.317192
		volcanoFlows    0.886983
		volcanoRadius   0.465828
		volcanoTemp     1435.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.80565
		stripeFluct     0
		stripeTwist     0
		cycloneMagn     1.76053
		cycloneFreq     0.884995
		cycloneDensity  0.338838
		cycloneOctaves  3
		colorSea       (0.640, 0.620, 0.420, 0.000)
		colorShelf     (0.680, 0.673, 0.343, 0.000)
		colorBeach     (0.370, 0.366, 0.187, 0.000)
		colorDesert    (0.450, 0.420, 0.380, 0.000)
		colorLowland   (0.530, 0.480, 0.400, 0.000)		colorUpland    (0.600, 0.540, 0.420, 0.000)
		colorRock      (0.170, 0.109, 0.058, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 0.769)
		colorLowPlants (0.250, 0.225, 0.049, 0.000)
		colorUpPlants  (0.180, 0.142, 0.038, 0.000)
		BumpHeight      11.983
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
		Height          14.1812
		Velocity        100.194
		BumpHeight      4.18981
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.11759
		mainOctaves     10
		Coverage        0.199349
		stripeZones     1.80565
		stripeFluct     0
		stripeTwist     0
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          46.115
		Density         1.084724
		Pressure        0.461121
		Greenhouse      2.06944
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.269841
		Saturation      0.9

		Composition
		{
			O2    	99.9403
			N2    	0.042484
			CH4   	0.00934146
			Ne    	0.00637484
			Ar    	0.00129962
			C2H6  	0.000165416
			Kr    	3.85896e-005
			H2    	2.19773e-005
		}
	}

	Aurora
	{
		Height      117.394
		NorthLat    59.318
		NorthLon    71.7835
		NorthRadius 1760.3
		NorthWidth  497.47
		NorthRings  5
		NorthBright 0.3
		NorthParticles 0
		SouthLat    -47.6773
		SouthLon    243.345
		SouthRadius 1724.89
		SouthWidth  637.596
		SouthRings  4
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
		SemiMajorAxis   5.43817		Period          14.5078		Eccentricity    0.130355
		Inclination     -2.23778
		AscendingNode   78.3784
		ArgOfPericenter 93.2705
		MeanAnomaly     284.704
	}
}







Comet	"C1"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            6.29095e-017
	Radius          0.0565968
	InertiaMoment   0.398579

	Oblateness      0.0092262

	RotationPeriod  54.4765
	Obliquity       138.653
	EqAscendNode    72.3493

	AbsMagn         6.92446
	SlopeParam      4.48579
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.458 0.454 0.450)

	Surface
	{
		SurfStyle       0.00908532
		OceanStyle      0.984823
		Randomize      (-0.921, 0.767, 0.730)
		colorDistMagn   0.648801
		colorDistFreq   1.33605e-006
		detailScale     1.54547
		colorConversion true
		snowLevel       2
		tropicLatitude  0.956672
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.653251
		terraceProb     0.245214
		erosion         0
		montesMagn      0.452062
		montesFreq      3.63312
		montesSpiky     0.901336
		montesFraction  0.86206
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.83626e-006
		hillsFraction   0.668766
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244528
		craterFreq      0.210966
		craterDensity   1.07965
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.463594
		volcanoTemp     1432.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.183, 0.182, 0.180, 0.000)
		colorShelf     (0.195, 0.193, 0.191, 0.000)
		colorBeach     (0.206, 0.204, 0.202, 0.000)
		colorDesert    (0.218, 0.216, 0.214, 0.000)
		colorLowland   (0.229, 0.227, 0.225, 0.000)
		colorUpland    (0.241, 0.238, 0.236, 0.000)
		colorRock      (0.252, 0.250, 0.247, 0.000)
		colorSnow      (0.264, 0.261, 0.259, 1.000)
		BumpHeight      0.0509371
		BumpOffset      0.0101874
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.43759
		DustBright  0.517762
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   19.2931
		Period          96.9623
		Eccentricity    0.962183
		Inclination     38.6753
		AscendingNode   -135.593
		ArgOfPericenter -14.0695
		MeanAnomaly     -153.569
	}
}

Comet	"C2"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            4.8656e-013
	Radius          0.993488
	InertiaMoment   0.396253

	Oblateness      0.00684895

	RotationPeriod  52.6454
	Obliquity       91.8584
	EqAscendNode    56.9267

	AbsMagn         1.65212
	SlopeParam      5.0953
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.617 0.614 0.613)

	Surface
	{
		SurfStyle       0.701643
		OceanStyle      0.957392
		Randomize      (0.459, -0.549, -0.617)
		colorDistMagn   0.92153
		colorDistFreq   0.000525007
		detailScale     27.1288
		colorConversion true
		snowLevel       2
		tropicLatitude  0.917216
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.423207
		terraceProb     0.479325
		erosion         0
		montesMagn      0.613905
		montesFreq      3.20805
		montesSpiky     0.985846
		montesFraction  0.830457
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0035093
		hillsFraction   0.480631
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254432
		craterFreq      0.213519
		craterDensity   0.924923
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.5029
		volcanoTemp     1349.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.241, 0.209, 0.172, 0.000)
		colorShelf     (0.247, 0.215, 0.196, 0.000)
		colorBeach     (0.290, 0.252, 0.233, 0.000)
		colorDesert    (0.315, 0.270, 0.227, 0.000)
		colorLowland   (0.346, 0.289, 0.257, 0.000)
		colorUpland    (0.383, 0.350, 0.313, 0.000)
		colorRock      (0.413, 0.381, 0.337, 0.000)
		colorSnow      (0.451, 0.406, 0.356, 1.000)
		BumpHeight      0.894139
		BumpOffset      0.178828
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.342533
		GasToDust   0.25
		Particles   1671
		GasBright   0.0109321
		DustBright  0.628906
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   17.6564
		Period          84.8896
		Eccentricity    0.977943
		Inclination     27.4725
		AscendingNode   157.886
		ArgOfPericenter -74.5412
		MeanAnomaly     -103.563
	}
}

Comet	"C3"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            3.76319e-009
	Radius          22.1194
	InertiaMoment   0.399077

	Oblateness      0.0105969

	RotationPeriod  50.8263
	Obliquity       45.0641
	EqAscendNode    41.5041

	AbsMagn         10.2247
	SlopeParam      5.83157
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.480 0.398 0.370)

	Surface
	{
		SurfStyle       0.237554
		OceanStyle      0.411711
		Randomize      (0.905, -0.939, -0.783)
		colorDistMagn   0.84881
		colorDistFreq   0.408071
		detailScale     604.007
		colorConversion true
		snowLevel       2
		tropicLatitude  0.656114
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.581975
		terraceProb     0.271683
		erosion         0
		montesMagn      0.488915
		montesFreq      2.54776
		montesSpiky     0.996401
		montesFraction  0.227158
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.875902
		hillsFraction   0.654031
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222791
		craterFreq      0.214098
		craterDensity   0.880398
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.464131
		volcanoTemp     1558.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.192, 0.159, 0.148, 0.000)
		colorShelf     (0.204, 0.169, 0.157, 0.000)
		colorBeach     (0.216, 0.179, 0.167, 0.000)
		colorDesert    (0.228, 0.189, 0.176, 0.000)
		colorLowland   (0.240, 0.199, 0.185, 0.000)
		colorUpland    (0.252, 0.209, 0.194, 0.000)
		colorRock      (0.264, 0.219, 0.204, 0.000)
		colorSnow      (0.276, 0.229, 0.213, 1.000)
		BumpHeight      19.9075
		BumpOffset      3.98149
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.823725
		GasToDust   0.25
		Particles   2643
		GasBright   0.0246912
		DustBright  0.299633
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   18.7769
		Period          93.097
		Eccentricity    0.982355
		Inclination     -153.967
		AscendingNode   -112.722
		ArgOfPericenter 20.1192
		MeanAnomaly     59.062
	}
}

Comet	"C4"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            1.15871e-016
	Radius          0.0613
	InertiaMoment   0.397589

	Oblateness      0.00783297

	RotationPeriod  49.0144
	Obliquity       358.27
	EqAscendNode    26.0816

	AbsMagn         6.70645
	SlopeParam      6.98455
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.690 0.686 0.683)

	Surface
	{
		SurfStyle       0.958662
		OceanStyle      0.749752
		Randomize      (0.057, -0.340, -0.298)
		colorDistMagn   0.76763
		colorDistFreq   2.17633e-006
		detailScale     1.6739
		colorConversion true
		snowLevel       2
		tropicLatitude  0.967632
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.595599
		terraceProb     0.486822
		erosion         0
		montesMagn      0.627926
		montesFreq      4.26663
		montesSpiky     0.905226
		montesFraction  0.646585
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.86542e-006
		hillsFraction   0.823482
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255926
		craterFreq      0.279202
		craterDensity   0.78791
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.54842
		volcanoTemp     1729.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.234, 0.240, 0.273, 0.050)
		colorShelf     (0.276, 0.281, 0.314, 0.040)
		colorBeach     (0.317, 0.322, 0.355, 0.030)
		colorDesert    (0.359, 0.363, 0.403, 0.020)
		colorLowland   (0.400, 0.404, 0.444, 0.030)
		colorUpland    (0.441, 0.446, 0.485, 0.050)
		colorRock      (0.483, 0.487, 0.540, 0.020)
		colorSnow      (0.483, 0.487, 0.540, 1.000)
		BumpHeight      0.05517
		BumpOffset      0.011034
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.109332
		DustBright  0.699479
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   16.16
		Period          74.3298
		Eccentricity    0.942478
		Inclination     103.023
		AscendingNode   -157.286
		ArgOfPericenter -128.667
		MeanAnomaly     -168.848
	}
}

Comet	"C5"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            8.96183e-013
	Radius          1.37011
	InertiaMoment   0.399523

	Oblateness      0.0122804

	RotationPeriod  47.2051
	Obliquity       311.475
	EqAscendNode    10.659

	AbsMagn         0.775603
	SlopeParam      2.33752
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.454 0.447 0.442)

	Surface
	{
		SurfStyle       0.112158
		OceanStyle      0.0647409
		Randomize      (-0.754, 0.510, -0.619)
		colorDistMagn   0.954054
		colorDistFreq   0.000940078
		detailScale     37.4132
		colorConversion true
		snowLevel       2
		tropicLatitude  0.746849
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.572721
		terraceProb     0.32577
		erosion         0
		montesMagn      0.500714
		montesFreq      3.38241
		montesSpiky     0.906728
		montesFraction  0.382625
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00510051
		hillsFraction   0.438444
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.27829
		craterFreq      0.247078
		craterDensity   1.01699
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.480312
		volcanoTemp     1414.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.181, 0.179, 0.177, 0.000)
		colorShelf     (0.193, 0.190, 0.188, 0.000)
		colorBeach     (0.204, 0.201, 0.199, 0.000)
		colorDesert    (0.215, 0.212, 0.210, 0.000)
		colorLowland   (0.227, 0.224, 0.221, 0.000)
		colorUpland    (0.238, 0.235, 0.232, 0.000)
		colorRock      (0.249, 0.246, 0.243, 0.000)
		colorSnow      (0.261, 0.257, 0.254, 1.000)
		BumpHeight      1.2331
		BumpOffset      0.24662
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.375359
		GasToDust   0.25
		Particles   1738
		GasBright   0.095809
		DustBright  0.397489
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   12.3272
		Period          49.5218
		Eccentricity    0.962574
		Inclination     18.7994
		AscendingNode   -80.9387
		ArgOfPericenter -172.43
		MeanAnomaly     -126.691
	}
}

Comet	"C6"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            6.93132e-009
	Radius          23.8373
	InertiaMoment   0.398299

	Oblateness      0.00900098

	RotationPeriod  45.3937
	Obliquity       264.681
	EqAscendNode    355.236

	AbsMagn         9.98501
	SlopeParam      3.03652
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.628 0.559 0.529)

	Surface
	{
		SurfStyle       0.753781
		OceanStyle      0.31805
		Randomize      (0.288, 0.695, -0.611)
		colorDistMagn   0.97614
		colorDistFreq   0.393886
		detailScale     650.917
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997034
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.708938
		terraceProb     0.11738
		erosion         0
		montesMagn      0.519438
		montesFreq      2.84577
		montesSpiky     0.825053
		montesFraction  0.861015
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.23998
		hillsFraction   0.682681
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230732
		craterFreq      0.156675
		craterDensity   1.04287
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.548072
		volcanoTemp     1672.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.245, 0.190, 0.148, 0.000)
		colorShelf     (0.251, 0.196, 0.169, 0.000)
		colorBeach     (0.295, 0.229, 0.201, 0.000)
		colorDesert    (0.320, 0.246, 0.196, 0.000)
		colorLowland   (0.352, 0.263, 0.222, 0.000)
		colorUpland    (0.389, 0.319, 0.270, 0.000)
		colorRock      (0.421, 0.347, 0.291, 0.000)
		colorSnow      (0.458, 0.369, 0.307, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.856551
		GasToDust   0.25
		Particles   2710
		GasBright   0.24764
		DustBright  0.730144
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   18.6274
		Period          91.9876
		Eccentricity    0.97621
		Inclination     19.9669
		AscendingNode   -61.1439
		ArgOfPericenter 61.3454
		MeanAnomaly     -145.43
	}
}

Comet	"C7"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            2.1342e-016
	Radius          0.0848669
	InertiaMoment   0.399946

	Oblateness      0.0144045

	RotationPeriod  43.5757
	Obliquity       217.887
	EqAscendNode    339.814

	AbsMagn         6.48453
	SlopeParam      3.63233
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.447 0.440 0.434)

	Surface
	{
		SurfStyle       0.831212
		OceanStyle      0.103175
		Randomize      (-0.970, 0.968, 0.038)
		colorDistMagn   0.713728
		colorDistFreq   4.67878e-006
		detailScale     2.31743
		colorConversion true
		snowLevel       2
		tropicLatitude  0.740482
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.681269
		terraceProb     0.217116
		erosion         0
		montesMagn      0.384968
		montesFreq      2.77725
		montesSpiky     0.880521
		montesFraction  0.694135
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.59646e-005
		hillsFraction   0.552585
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260331
		craterFreq      0.19151
		craterDensity   0.90084
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.619051
		volcanoTemp     1338.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.174, 0.150, 0.121, 0.000)
		colorShelf     (0.179, 0.154, 0.139, 0.000)
		colorBeach     (0.210, 0.181, 0.165, 0.000)
		colorDesert    (0.228, 0.194, 0.161, 0.000)
		colorLowland   (0.250, 0.207, 0.182, 0.000)
		colorUpland    (0.277, 0.251, 0.221, 0.000)
		colorRock      (0.299, 0.273, 0.239, 0.000)
		colorSnow      (0.326, 0.291, 0.252, 1.000)
		BumpHeight      0.0763802
		BumpOffset      0.015276
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.206835
		DustBright  0.455436
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   21.3389
		Period          112.786
		Eccentricity    0.966904
		Inclination     168.966
		AscendingNode   150.759
		ArgOfPericenter -72.1849
		MeanAnomaly     137.908
	}
}

Comet	"C8"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            1.65066e-012
	Radius          1.46593
	InertiaMoment   0.39884

	Oblateness      0.0104148

	RotationPeriod  41.7463
	Obliquity       171.093
	EqAscendNode    324.391

	AbsMagn         -0.718451
	SlopeParam      4.19658
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.544 0.475 0.395)

	Surface
	{
		SurfStyle       0.969648
		OceanStyle      0.99402
		Randomize      (-0.688, 0.329, 0.553)
		colorDistMagn   0.538265
		colorDistFreq   0.00181376
		detailScale     40.0295
		colorConversion true
		snowLevel       2
		tropicLatitude  0.987911
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.743493
		terraceProb     0.220612
		erosion         0
		montesMagn      0.49979
		montesFreq      2.93795
		montesSpiky     0.861685
		montesFraction  0.279091
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00411964
		hillsFraction   0.845369
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23452
		craterFreq      0.154443
		craterDensity   0.819212
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.486196
		volcanoTemp     1126.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.185, 0.166, 0.158, 0.050)
		colorShelf     (0.217, 0.195, 0.182, 0.040)
		colorBeach     (0.250, 0.223, 0.205, 0.030)
		colorDesert    (0.283, 0.252, 0.233, 0.020)
		colorLowland   (0.315, 0.280, 0.257, 0.030)
		colorUpland    (0.348, 0.309, 0.280, 0.050)
		colorRock      (0.381, 0.337, 0.312, 0.020)
		colorSnow      (0.381, 0.337, 0.312, 1.000)
		BumpHeight      1.31933
		BumpOffset      0.263867
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.408185
		GasToDust   0.25
		Particles   1804
		GasBright   0.128771
		DustBright  0.217987
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   13.7854
		Period          58.5635
		Eccentricity    0.977093
		Inclination     104.331
		AscendingNode   -53.3652
		ArgOfPericenter -94.4023
		MeanAnomaly     134.679
	}
}

Comet	"C9"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            1.27666e-008
	Radius          33.1682
	InertiaMoment   0.397089

	Oblateness      0.0169623

	RotationPeriod  39.9007
	Obliquity       124.298
	EqAscendNode    308.969

	AbsMagn         9.7523
	SlopeParam      4.77726
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.713 0.555 0.500)

	Surface
	{
		SurfStyle       0.304886
		OceanStyle      0.4183
		Randomize      (0.699, -0.346, 0.823)
		colorDistMagn   0.391152
		colorDistFreq   0.917942
		detailScale     905.713
		colorConversion true
		snowLevel       2
		tropicLatitude  0.912159
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.625408
		terraceProb     0.331101
		erosion         0
		montesMagn      0.46774
		montesFreq      2.75851
		montesSpiky     0.968732
		montesFraction  0.519946
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.68718
		hillsFraction   0.547051
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248917
		craterFreq      0.189375
		craterDensity   0.784402
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.508376
		volcanoTemp     1605.32
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.285, 0.222, 0.200, 0.000)
		colorShelf     (0.303, 0.236, 0.212, 0.000)
		colorBeach     (0.321, 0.250, 0.225, 0.000)
		colorDesert    (0.338, 0.264, 0.237, 0.000)
		colorLowland   (0.356, 0.278, 0.250, 0.000)
		colorUpland    (0.374, 0.291, 0.262, 0.000)
		colorRock      (0.392, 0.305, 0.275, 0.000)
		colorSnow      (0.410, 0.319, 0.287, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.889377
		GasToDust   0.25
		Particles   2776
		GasBright   0.35777
		DustBright  0.473474
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   18.494
		Period          91.001
		Eccentricity    0.986501
		Inclination     137.237
		AscendingNode   -89.6051
		ArgOfPericenter -129.55
		MeanAnomaly     -73.8624
	}
}

Comet	"C10"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            3.93094e-016
	Radius          0.0896093
	InertiaMoment   0.399307

	Oblateness      0.0120559

	RotationPeriod  38.0335
	Obliquity       77.504
	EqAscendNode    293.546

	AbsMagn         6.25783
	SlopeParam      5.43393
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.742 0.739 0.737)

	Surface
	{
		SurfStyle       0.0987741
		OceanStyle      0.121549
		Randomize      (-0.332, -0.028, 0.815)
		colorDistMagn   0.937238
		colorDistFreq   4.74542e-006
		detailScale     2.44693
		colorConversion true
		snowLevel       2
		tropicLatitude  0.97647
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.767573
		terraceProb     0.289627
		erosion         0
		montesMagn      0.584307
		montesFreq      2.88529
		montesSpiky     0.855761
		montesFraction  0.915847
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.65149e-005
		hillsFraction   0.408995
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25923
		craterFreq      0.232937
		craterDensity   0.852899
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.499983
		volcanoTemp     1413.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.297, 0.296, 0.295, 0.000)
		colorShelf     (0.315, 0.314, 0.313, 0.000)
		colorBeach     (0.334, 0.333, 0.331, 0.000)
		colorDesert    (0.352, 0.351, 0.350, 0.000)
		colorLowland   (0.371, 0.370, 0.368, 0.000)
		colorUpland    (0.389, 0.388, 0.387, 0.000)
		colorRock      (0.408, 0.407, 0.405, 0.000)
		colorSnow      (0.426, 0.425, 0.424, 1.000)
		BumpHeight      0.0806483
		BumpOffset      0.0161297
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.252423
		DustBright  0.263307
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   10.1356
		Period          36.9208
		Eccentricity    0.950508
		Inclination     -0.0445072
		AscendingNode   161.718
		ArgOfPericenter 142.416
		MeanAnomaly     -39.8535
	}
}

Comet	"C11"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            3.0403e-012
	Radius          2.0545
	InertiaMoment   0.39798

	Oblateness      0.0207041

	RotationPeriod  36.139
	Obliquity       30.7097
	EqAscendNode    278.123

	AbsMagn         16.8203
	SlopeParam      6.30438
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.478 0.470 0.466)

	Surface
	{
		SurfStyle       0.234929
		OceanStyle      0.981326
		Randomize      (0.397, -0.726, -0.474)
		colorDistMagn   0.97777
		colorDistFreq   0.00232136
		detailScale     56.1016
		colorConversion true
		snowLevel       2
		tropicLatitude  0.885386
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.610095
		terraceProb     0.244553
		erosion         0
		montesMagn      0.467153
		montesFreq      2.87912
		montesSpiky     0.991916
		montesFraction  0.355658
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00830291
		hillsFraction   0.71128
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257466
		craterFreq      0.197639
		craterDensity   0.870716
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.509805
		volcanoTemp     1526.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.191, 0.188, 0.186, 0.000)
		colorShelf     (0.203, 0.200, 0.198, 0.000)
		colorBeach     (0.215, 0.211, 0.210, 0.000)
		colorDesert    (0.227, 0.223, 0.221, 0.000)
		colorLowland   (0.239, 0.235, 0.233, 0.000)
		colorUpland    (0.251, 0.247, 0.245, 0.000)
		colorRock      (0.263, 0.258, 0.256, 0.000)
		colorSnow      (0.275, 0.270, 0.268, 1.000)
		BumpHeight      1.84905
		BumpOffset      0.36981
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.441011
		GasToDust   0.25
		Particles   1870
		GasBright   0.00970914
		DustBright  0.190508
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   18.6077
		Period          91.8414
		Eccentricity    0.977852
		Inclination     111.858
		AscendingNode   -72.2164
		ArgOfPericenter -42.9183
		MeanAnomaly     -158.789
	}
}

Comet	"C12"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            2.35145e-008
	Radius          53.1825
	InertiaMoment   0.399739

	Oblateness      0.052156

	RotationPeriod  34.2112
	Obliquity       343.915
	EqAscendNode    262.701

	AbsMagn         9.52537
	SlopeParam      8.48005
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.607 0.605 0.602)

	Surface
	{
		SurfStyle       0.849319
		OceanStyle      0.0753127
		Randomize      (-0.633, -0.863, -0.178)
		colorDistMagn   0.156782
		colorDistFreq   1.87174
		detailScale     1452.24
		colorConversion true
		snowLevel       2
		tropicLatitude  0.932339
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.380628
		terraceProb     0.15417
		erosion         0
		montesMagn      0.411379
		montesFreq      2.59955
		montesSpiky     0.947508
		montesFraction  0.44738
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.40921
		hillsFraction   0.945574
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.27936
		craterFreq      0.196452
		craterDensity   0.825232
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.481055
		volcanoTemp     1380.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.237, 0.206, 0.169, 0.000)
		colorShelf     (0.243, 0.212, 0.193, 0.000)
		colorBeach     (0.285, 0.248, 0.229, 0.000)
		colorDesert    (0.310, 0.266, 0.223, 0.000)
		colorLowland   (0.340, 0.284, 0.253, 0.000)
		colorUpland    (0.377, 0.345, 0.307, 0.000)
		colorRock      (0.407, 0.375, 0.331, 0.000)
		colorSnow      (0.443, 0.399, 0.349, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.922203
		GasToDust   0.25
		Particles   2842
		GasBright   0.0736319
		DustBright  0.611072
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   19.8609
		Period          101.274
		Eccentricity    0.973152
		Inclination     -121.426
		AscendingNode   126.133
		ArgOfPericenter -18.4467
		MeanAnomaly     -158.045
	}
}

Comet	"C13"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            7.2403e-016
	Radius          0.12726
	InertiaMoment   0.398586

	Oblateness      0.0260162

	RotationPeriod  32.2429
	Obliquity       297.121
	EqAscendNode    247.278

	AbsMagn         6.02539
	SlopeParam      2.70211
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.537 0.533 0.532)

	Surface
	{
		SurfStyle       0.354801
		OceanStyle      0.050132
		Randomize      (-0.343, 0.145, 0.327)
		colorDistMagn   0.969993
		colorDistFreq   9.99117e-006
		detailScale     3.47504
		colorConversion true
		snowLevel       2
		tropicLatitude  0.488794
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.766873
		terraceProb     0.156907
		erosion         0
		montesMagn      0.355717
		montesFreq      3.65474
		montesSpiky     0.815359
		montesFraction  0.447078
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.01639e-005
		hillsFraction   0.665553
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.188106
		craterFreq      0.275129
		craterDensity   0.905445
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.570894
		volcanoTemp     1491.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.215, 0.213, 0.213, 0.000)
		colorShelf     (0.228, 0.227, 0.226, 0.000)
		colorBeach     (0.241, 0.240, 0.239, 0.000)
		colorDesert    (0.255, 0.253, 0.253, 0.000)
		colorLowland   (0.268, 0.267, 0.266, 0.000)
		colorUpland    (0.282, 0.280, 0.279, 0.000)
		colorRock      (0.295, 0.293, 0.293, 0.000)
		colorSnow      (0.309, 0.307, 0.306, 1.000)
		BumpHeight      0.114534
		BumpOffset      0.0229068
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.061501
		DustBright  0.307689
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   25.3815
		Period          146.311
		Eccentricity    0.985803
		Inclination     -130.055
		AscendingNode   31.7946
		ArgOfPericenter 105.787
		MeanAnomaly     -145.834
	}
}

Comet	"C14"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            5.59984e-012
	Radius          3.15794
	InertiaMoment   0.396283

	Oblateness      0.0579841

	RotationPeriod  30.2263
	Obliquity       250.327
	EqAscendNode    231.856

	AbsMagn         15.2719
	SlopeParam      3.33769
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.602 0.597 0.595)

	Surface
	{
		SurfStyle       0.0926098
		OceanStyle      0.526871
		Randomize      (-0.457, -0.675, 0.348)
		colorDistMagn   0.331848
		colorDistFreq   0.00201725
		detailScale     86.2328
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999615
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.631286
		terraceProb     0.394692
		erosion         0
		montesMagn      0.482596
		montesFreq      2.48843
		montesSpiky     0.770808
		montesFraction  0.498464
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.019549
		hillsFraction   0.675464
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226244
		craterFreq      0.162501
		craterDensity   0.828059
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.514945
		volcanoTemp     1648.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.241, 0.239, 0.238, 0.000)
		colorShelf     (0.256, 0.254, 0.253, 0.000)
		colorBeach     (0.271, 0.269, 0.268, 0.000)
		colorDesert    (0.286, 0.284, 0.282, 0.000)
		colorLowland   (0.301, 0.299, 0.297, 0.000)
		colorUpland    (0.316, 0.313, 0.312, 0.000)
		colorRock      (0.331, 0.328, 0.327, 0.000)
		colorSnow      (0.346, 0.343, 0.342, 1.000)
		BumpHeight      2.84214
		BumpOffset      0.568429
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.473837
		GasToDust   0.25
		Particles   1937
		GasBright   0.192614
		DustBright  0.661063
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   16.2204
		Period          74.7467
		Eccentricity    0.944474
		Inclination     52.3901
		AscendingNode   71.7835
		ArgOfPericenter 29.896
		MeanAnomaly     -52.4559
	}
}

Comet	"C15"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            4.33108e-008
	Radius          49.7366
	InertiaMoment   0.399083

	Oblateness      0.03412

	RotationPeriod  28.1523
	Obliquity       203.533
	EqAscendNode    216.433

	AbsMagn         9.30325
	SlopeParam      3.91144
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.453 0.447 0.444)

	Surface
	{
		SurfStyle       0.835723
		OceanStyle      0.743761
		Randomize      (-0.312, -0.277, 0.582)
		colorDistMagn   0.558263
		colorDistFreq   0.404578
		detailScale     1358.14
		colorConversion true
		snowLevel       2
		tropicLatitude  0.138267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.500524
		terraceProb     0.108843
		erosion         0
		montesMagn      0.468386
		montesFreq      2.78053
		montesSpiky     0.85833
		montesFraction  0.201955
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.3546
		hillsFraction   0.534735
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225105
		craterFreq      0.246223
		craterDensity   1.05142
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.474128
		volcanoTemp     1067.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.177, 0.152, 0.124, 0.000)
		colorShelf     (0.181, 0.157, 0.142, 0.000)
		colorBeach     (0.213, 0.183, 0.169, 0.000)
		colorDesert    (0.231, 0.197, 0.164, 0.000)
		colorLowland   (0.254, 0.210, 0.187, 0.000)
		colorUpland    (0.281, 0.255, 0.227, 0.000)
		colorRock      (0.304, 0.277, 0.244, 0.000)
		colorSnow      (0.331, 0.295, 0.258, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.955029
		GasToDust   0.25
		Particles   2909
		GasBright   0.153201
		DustBright  0.384962
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   21.4651
		Period          113.788
		Eccentricity    0.959953
		Inclination     21.3108
		AscendingNode   -159.882
		ArgOfPericenter 178.061
		MeanAnomaly     -45.743
	}
}

Comet	"C16"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            1.33357e-015
	Radius          0.191516
	InertiaMoment   0.3976

	Oblateness      0.073706

	RotationPeriod  26.0102
	Obliquity       156.738
	EqAscendNode    201.01

	AbsMagn         5.78608
	SlopeParam      4.47785
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.742 0.739 0.738)

	Surface
	{
		SurfStyle       0.946493
		OceanStyle      0.968586
		Randomize      (-0.185, 0.238, 0.335)
		colorDistMagn   0.663012
		colorDistFreq   2.45794e-005
		detailScale     5.22968
		colorConversion true
		snowLevel       2
		tropicLatitude  0.804155
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.635464
		terraceProb     0.401952
		erosion         0
		montesMagn      0.508237
		montesFreq      2.61692
		montesSpiky     0.827637
		montesFraction  0.591599
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.39118e-005
		hillsFraction   0.480982
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.209804
		craterFreq      0.259442
		craterDensity   0.966916
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.539747
		volcanoTemp     1403.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.252, 0.259, 0.295, 0.050)
		colorShelf     (0.297, 0.303, 0.339, 0.040)
		colorBeach     (0.341, 0.347, 0.384, 0.030)
		colorDesert    (0.386, 0.392, 0.435, 0.020)
		colorLowland   (0.430, 0.436, 0.480, 0.030)
		colorUpland    (0.475, 0.480, 0.524, 0.050)
		colorRock      (0.519, 0.525, 0.583, 0.020)
		colorSnow      (0.519, 0.525, 0.583, 1.000)
		BumpHeight      0.172365
		BumpOffset      0.034473
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0254706
		GasToDust   0.25
		Particles   1031
		GasBright   0.0765291
		DustBright  0.146121
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   15.3013
		Period          68.4845
		Eccentricity    0.96438
		Inclination     69.1589
		AscendingNode   -43.5378
		ArgOfPericenter -160.336
		MeanAnomaly     -92.5461
	}
}

Comet	"C17"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            1.03142e-011
	Radius          3.08079
	InertiaMoment   0.399528

	Oblateness      0.047774

	RotationPeriod  23.7872
	Obliquity       109.944
	EqAscendNode    185.588

	AbsMagn         14.3805
	SlopeParam      5.08634
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.601 0.599 0.597)

	Surface
	{
		SurfStyle       0.201038
		OceanStyle      0.373458
		Randomize      (0.673, -0.535, 0.571)
		colorDistMagn   0.0979596
		colorDistFreq   0.00617142
		detailScale     84.1262
		colorConversion true
		snowLevel       2
		tropicLatitude  0.92194
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.759566
		terraceProb     0.208144
		erosion         0
		montesMagn      0.566763
		montesFreq      3.04509
		montesSpiky     0.915139
		montesFraction  0.493741
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0273334
		hillsFraction   0.466122
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222154
		craterFreq      0.260049
		craterDensity   0.762822
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.417444
		volcanoTemp     1514.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.241, 0.240, 0.239, 0.000)
		colorShelf     (0.256, 0.255, 0.254, 0.000)
		colorBeach     (0.271, 0.270, 0.269, 0.000)
		colorDesert    (0.286, 0.285, 0.284, 0.000)
		colorLowland   (0.301, 0.300, 0.299, 0.000)
		colorUpland    (0.316, 0.315, 0.314, 0.000)
		colorRock      (0.331, 0.330, 0.329, 0.000)
		colorSnow      (0.346, 0.345, 0.344, 1.000)
		BumpHeight      2.77271
		BumpOffset      0.554543
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.506663
		GasToDust   0.25
		Particles   2003
		GasBright   0.28481
		DustBright  0.422327
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   22.9396
		Period          125.713
		Eccentricity    0.962914
		Inclination     -145.205
		AscendingNode   -78.4698
		ArgOfPericenter -31.7259
		MeanAnomaly     11.8421
	}
}

Comet	"C18"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            7.9773e-008
	Radius          73.8029
	InertiaMoment   0.398306

	Oblateness      0.103783

	RotationPeriod  21.4678
	Obliquity       63.1496
	EqAscendNode    170.165

	AbsMagn         9.08509
	SlopeParam      5.81986
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.507 0.504 0.499)

	Surface
	{
		SurfStyle       0.824695
		OceanStyle      0.475472
		Randomize      (0.184, -0.202, 0.502)
		colorDistMagn   0.645921
		colorDistFreq   1.08833
		detailScale     2015.31
		colorConversion true
		snowLevel       2
		tropicLatitude  0.840834
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.560553
		terraceProb     0.209018
		erosion         0
		montesMagn      0.624033
		montesFreq      3.55381
		montesSpiky     0.984877
		montesFraction  0.644201
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.5732
		hillsFraction   0.703234
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245084
		craterFreq      0.213416
		craterDensity   0.806679
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.406192
		volcanoTemp     1834.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.198, 0.171, 0.140, 0.000)
		colorShelf     (0.203, 0.176, 0.160, 0.000)
		colorBeach     (0.238, 0.207, 0.190, 0.000)
		colorDesert    (0.259, 0.222, 0.185, 0.000)
		colorLowland   (0.284, 0.237, 0.210, 0.000)
		colorUpland    (0.314, 0.287, 0.255, 0.000)
		colorRock      (0.340, 0.313, 0.274, 0.000)
		colorSnow      (0.370, 0.333, 0.289, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.987855
		GasToDust   0.25
		Particles   2975
		GasBright   0.180855
		DustBright  0.210768
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   13.8278
		Period          58.834
		Eccentricity    0.964792
		Inclination     169.761
		AscendingNode   52.3704
		ArgOfPericenter 159.114
		MeanAnomaly     -5.53867
	}
}

Comet	"C19"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            2.45627e-015
	Radius          0.190831
	InertiaMoment   0.399951

	Oblateness      0.0745917

	RotationPeriod  19.0326
	Obliquity       16.3553
	EqAscendNode    154.743

	AbsMagn         5.53857
	SlopeParam      6.96126
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.692 0.688 0.686)

	Surface
	{
		SurfStyle       0.0922697
		OceanStyle      0.431754
		Randomize      (0.889, 0.814, -0.988)
		colorDistMagn   0.591245
		colorDistFreq   1.83826e-005
		detailScale     5.21096
		colorConversion true
		snowLevel       2
		tropicLatitude  0.777874
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.456239
		terraceProb     0.27089
		erosion         0
		montesMagn      0.584072
		montesFreq      3.18401
		montesSpiky     0.804681
		montesFraction  0.345176
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000105668
		hillsFraction   0.461704
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246937
		craterFreq      0.239226
		craterDensity   0.982847
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.393221
		volcanoTemp     1622.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.277, 0.275, 0.275, 0.000)
		colorShelf     (0.294, 0.292, 0.292, 0.000)
		colorBeach     (0.311, 0.310, 0.309, 0.000)
		colorDesert    (0.329, 0.327, 0.326, 0.000)
		colorLowland   (0.346, 0.344, 0.343, 0.000)
		colorUpland    (0.363, 0.361, 0.360, 0.000)
		colorRock      (0.381, 0.378, 0.377, 0.000)
		colorSnow      (0.398, 0.396, 0.395, 1.000)
		BumpHeight      0.171748
		BumpOffset      0.0343496
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0582966
		GasToDust   0.25
		Particles   1097
		GasBright   0.0182713
		DustBright  0.857838
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   18.1053
		Period          88.1468
		Eccentricity    0.971653
		Inclination     67.0912
		AscendingNode   -169.34
		ArgOfPericenter -64.3778
		MeanAnomaly     -66.2224
	}
}

Comet	"C20"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            1.89975e-011
	Radius          4.52366
	InertiaMoment   0.398847

	Oblateness      0.171115

	RotationPeriod  16.457
	Obliquity       329.561
	EqAscendNode    139.32

	AbsMagn         13.7258
	SlopeParam      2.32659
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.734 0.651 0.527)

	Surface
	{
		SurfStyle       0.201349
		OceanStyle      0.131372
		Randomize      (-0.371, 0.171, 0.145)
		colorDistMagn   0.0444033
		colorDistFreq   0.00566483
		detailScale     123.526
		colorConversion true
		snowLevel       2
		tropicLatitude  0.994999
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.446743
		terraceProb     0.364152
		erosion         0
		montesMagn      0.550603
		montesFreq      2.85128
		montesSpiky     0.8495
		montesFraction  0.822222
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0556595
		hillsFraction   0.683543
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224835
		craterFreq      0.186926
		craterDensity   0.965477
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.461168
		volcanoTemp     1435.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.294, 0.260, 0.211, 0.000)
		colorShelf     (0.312, 0.277, 0.224, 0.000)
		colorBeach     (0.330, 0.293, 0.237, 0.000)
		colorDesert    (0.349, 0.309, 0.250, 0.000)
		colorLowland   (0.367, 0.325, 0.263, 0.000)
		colorUpland    (0.385, 0.342, 0.276, 0.000)
		colorRock      (0.404, 0.358, 0.290, 0.000)
		colorSnow      (0.422, 0.374, 0.303, 1.000)
		BumpHeight      4.07129
		BumpOffset      0.814258
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.539489
		GasToDust   0.25
		Particles   2069
		GasBright   0.0447918
		DustBright  0.515804
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   23.2862
		Period          128.572
		Eccentricity    0.959282
		Inclination     68.2849
		AscendingNode   -152.869
		ArgOfPericenter 165.745
		MeanAnomaly     75.2233
	}
}

Comet	"C21"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            1.46932e-007
	Radius          74.5823
	InertiaMoment   0.397104

	Oblateness      0.141961

	RotationPeriod  13.7089
	Obliquity       282.767
	EqAscendNode    123.898

	AbsMagn         8.8701
	SlopeParam      3.02784
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.596 0.590 0.585)

	Surface
	{
		SurfStyle       0.957813
		OceanStyle      0.0990648
		Randomize      (-0.549, 0.175, -0.236)
		colorDistMagn   0.0132138
		colorDistFreq   4.60795
		detailScale     2036.59
		colorConversion true
		snowLevel       2
		tropicLatitude  0.576238
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.355913
		terraceProb     0.655847
		erosion         0
		montesMagn      0.496093
		montesFreq      2.89998
		montesSpiky     0.922607
		montesFraction  0.550447
		dunesFraction   0
		hillsMagn       0
		hillsFreq       14.9707
		hillsFraction   0.444517
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231237
		craterFreq      0.213229
		craterDensity   0.93837
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.543028
		volcanoTemp     1417
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.203, 0.206, 0.234, 0.050)
		colorShelf     (0.239, 0.242, 0.269, 0.040)
		colorBeach     (0.274, 0.277, 0.304, 0.030)
		colorDesert    (0.310, 0.313, 0.345, 0.020)
		colorLowland   (0.346, 0.348, 0.380, 0.030)
		colorUpland    (0.382, 0.383, 0.416, 0.050)
		colorRock      (0.418, 0.419, 0.462, 0.020)
		colorSnow      (0.418, 0.419, 0.462, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0340532
		DustBright  0.21103
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   21.6129
		Period          114.966
		Eccentricity    0.97386
		Inclination     -65.926
		AscendingNode   -144.746
		ArgOfPericenter 158.581
		MeanAnomaly     111.307
	}
}

Comet	"C22"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            4.52415e-015
	Radius          0.277871
	InertiaMoment   0.399313

	Oblateness      0.249

	RotationPeriod  10.7447
	Obliquity       235.972
	EqAscendNode    108.475

	AbsMagn         5.28125
	SlopeParam      3.62448
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.545 0.541 0.540)

	Surface
	{
		SurfStyle       0.454096
		OceanStyle      0.0311885
		Randomize      (-0.214, -0.594, -0.152)
		colorDistMagn   0.888276
		colorDistFreq   5.65308e-005
		detailScale     7.58772
		colorConversion true
		snowLevel       2
		tropicLatitude  0.90574
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.709498
		terraceProb     0.489227
		erosion         0
		montesMagn      0.613338
		montesFreq      3.08129
		montesSpiky     0.822174
		montesFraction  0.42385
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000191216
		hillsFraction   0.804951
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248092
		craterFreq      0.19311
		craterDensity   1.05421
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.39805
		volcanoTemp     1436.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.218, 0.216, 0.216, 0.000)
		colorShelf     (0.232, 0.230, 0.229, 0.000)
		colorBeach     (0.245, 0.244, 0.243, 0.000)
		colorDesert    (0.259, 0.257, 0.256, 0.000)
		colorLowland   (0.273, 0.271, 0.270, 0.000)
		colorUpland    (0.286, 0.284, 0.283, 0.000)
		colorRock      (0.300, 0.298, 0.297, 0.000)
		colorSnow      (0.313, 0.311, 0.310, 1.000)
		BumpHeight      0.250083
		BumpOffset      0.0500167
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0911227
		GasToDust   0.25
		Particles   1163
		GasBright   0.144448
		DustBright  0.585121
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   16.9076
		Period          79.5466
		Eccentricity    0.969489
		Inclination     94.5997
		AscendingNode   -62.6946
		ArgOfPericenter 121.999
		MeanAnomaly     -65.5833
	}
}

Comet	"C23"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            3.4991e-011
	Radius          4.6198
	InertiaMoment   0.397989

	Oblateness      0.249

	RotationPeriod  7.50375
	Obliquity       189.178
	EqAscendNode    93.0523

	AbsMagn         13.1963
	SlopeParam      4.18883
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.626 0.620 0.617)

	Surface
	{
		SurfStyle       0.751761
		OceanStyle      0.84316
		Randomize      (0.766, -0.624, -0.278)
		colorDistMagn   0.311496
		colorDistFreq   0.0118324
		detailScale     126.151
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997819
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.482925
		terraceProb     0.204804
		erosion         0
		montesMagn      0.473376
		montesFreq      3.19809
		montesSpiky     0.943215
		montesFraction  0.71532
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0321918
		hillsFraction   0.592446
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.272736
		craterFreq      0.251481
		craterDensity   0.999697
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.561477
		volcanoTemp     1529.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.244, 0.211, 0.173, 0.000)
		colorShelf     (0.250, 0.217, 0.197, 0.000)
		colorBeach     (0.294, 0.254, 0.234, 0.000)
		colorDesert    (0.319, 0.273, 0.228, 0.000)
		colorLowland   (0.350, 0.291, 0.259, 0.000)
		colorUpland    (0.388, 0.353, 0.314, 0.000)
		colorRock      (0.419, 0.384, 0.339, 0.000)
		colorSnow      (0.457, 0.409, 0.358, 1.000)
		BumpHeight      4.15782
		BumpOffset      0.831564
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.572315
		GasToDust   0.25
		Particles   2135
		GasBright   0.106427
		DustBright  0.307629
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   14.1182
		Period          60.6972
		Eccentricity    0.978117
		Inclination     84.6293
		AscendingNode   -4.05827
		ArgOfPericenter 31.8603
		MeanAnomaly     0.449819
	}
}

Comet	"C24"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            2.7063e-007
	Radius          107.851
	InertiaMoment   0.399744

	Oblateness      0.249

	RotationPeriod  3.89624
	Obliquity       142.384
	EqAscendNode    77.6297

	AbsMagn         8.6576
	SlopeParam      4.76895
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.810 0.753 0.716)

	Surface
	{
		SurfStyle       0.771215
		OceanStyle      0.357848
		Randomize      (-0.796, 0.197, 0.849)
		colorDistMagn   0.358461
		colorDistFreq   5.25222
		detailScale     2945.04
		colorConversion true
		snowLevel       2
		tropicLatitude  0.597908
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.48771
		terraceProb     0.306633
		erosion         0
		montesMagn      0.527437
		montesFreq      3.12126
		montesSpiky     0.946914
		montesFraction  0.496196
		dunesFraction   0
		hillsMagn       0
		hillsFreq       27.7572
		hillsFraction   0.673578
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227447
		craterFreq      0.500718
		craterDensity   0.916296
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.430811
		volcanoTemp     1500.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.316, 0.256, 0.200, 0.000)
		colorShelf     (0.324, 0.264, 0.229, 0.000)
		colorBeach     (0.381, 0.309, 0.272, 0.000)
		colorDesert    (0.413, 0.331, 0.265, 0.000)
		colorLowland   (0.454, 0.354, 0.301, 0.000)
		colorUpland    (0.502, 0.429, 0.365, 0.000)
		colorRock      (0.543, 0.467, 0.394, 0.000)
		colorSnow      (0.592, 0.497, 0.415, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.284013
		DustBright  0.61453
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   17.755
		Period          85.6011
		Eccentricity    0.953298
		Inclination     19.4384
		AscendingNode   74.4078
		ArgOfPericenter 93.4652
		MeanAnomaly     -108.621
	}
}

Comet	"C25"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            8.33289e-015
	Radius          0.286161
	InertiaMoment   0.398593

	Oblateness      0.00161113

	RotationPeriod  128.782
	Obliquity       95.5895
	EqAscendNode    62.2072

	AbsMagn         5.01214
	SlopeParam      5.42397
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.786 0.784 0.783)

	Surface
	{
		SurfStyle       0.0985721
		OceanStyle      0.972913
		Randomize      (-0.050, 0.220, 0.944)
		colorDistMagn   0.905093
		colorDistFreq   3.98452e-005
		detailScale     7.81411
		colorConversion true
		snowLevel       2
		tropicLatitude  0.709892
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.447274
		terraceProb     0.591925
		erosion         0
		montesMagn      0.632761
		montesFreq      3.29766
		montesSpiky     0.974903
		montesFraction  0.53608
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00016236
		hillsFraction   0.802965
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264087
		craterFreq      0.201546
		craterDensity   0.883784
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.479594
		volcanoTemp     1419.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.314, 0.314, 0.313, 0.000)
		colorShelf     (0.334, 0.333, 0.333, 0.000)
		colorBeach     (0.354, 0.353, 0.352, 0.000)
		colorDesert    (0.373, 0.372, 0.372, 0.000)
		colorLowland   (0.393, 0.392, 0.391, 0.000)
		colorUpland    (0.412, 0.411, 0.411, 0.000)
		colorRock      (0.432, 0.431, 0.431, 0.000)
		colorSnow      (0.452, 0.451, 0.450, 1.000)
		BumpHeight      0.257545
		BumpOffset      0.051509
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.123948
		GasToDust   0.25
		Particles   1230
		GasBright   0.21871
		DustBright  0.364319
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   13.7157
		Period          58.1199
		Eccentricity    0.977225
		Inclination     76.9809
		AscendingNode   138.502
		ArgOfPericenter 145.854
		MeanAnomaly     -125.103
	}
}

Comet	"C26"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            6.4449e-011
	Radius          6.6413
	InertiaMoment   0.396312

	Oblateness      0.00326914

	RotationPeriod  114.446
	Obliquity       48.7952
	EqAscendNode    46.7846

	AbsMagn         12.7449
	SlopeParam      6.28946
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.624 0.620 0.619)

	Surface
	{
		SurfStyle       0.550665
		OceanStyle      0.283615
		Randomize      (0.915, 0.127, -0.837)
		colorDistMagn   0.656297
		colorDistFreq   0.0146161
		detailScale     181.352
		colorConversion true
		snowLevel       2
		tropicLatitude  0.394396
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.727408
		terraceProb     0.296201
		erosion         0
		montesMagn      0.531333
		montesFreq      2.21599
		montesSpiky     0.90447
		montesFraction  0.485976
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0988405
		hillsFraction   0.650967
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225891
		craterFreq      0.189179
		craterDensity   0.764404
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.504205
		volcanoTemp     1660.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.243, 0.211, 0.173, 0.000)
		colorShelf     (0.249, 0.217, 0.198, 0.000)
		colorBeach     (0.293, 0.254, 0.235, 0.000)
		colorDesert    (0.318, 0.273, 0.229, 0.000)
		colorLowland   (0.349, 0.292, 0.260, 0.000)
		colorUpland    (0.387, 0.354, 0.316, 0.000)
		colorRock      (0.418, 0.385, 0.341, 0.000)
		colorSnow      (0.455, 0.409, 0.359, 1.000)
		BumpHeight      5.97717
		BumpOffset      1.19543
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.60514
		GasToDust   0.25
		Particles   2202
		GasBright   0.116148
		DustBright  0.151368
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   21.424
		Period          113.462
		Eccentricity    0.96891
		Inclination     -118.026
		AscendingNode   -156.578
		ArgOfPericenter 129.582
		MeanAnomaly     -90.7506
	}
}

Comet	"C27"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            4.98468e-007
	Radius          111.841
	InertiaMoment   0.399089

	Oblateness      0.00236193

	RotationPeriod  106.354
	Obliquity       2.00095
	EqAscendNode    31.362

	AbsMagn         8.44695
	SlopeParam      8.38988
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.492 0.488 0.483)

	Surface
	{
		SurfStyle       0.661491
		OceanStyle      0.176762
		Randomize      (-0.860, -0.367, -0.772)
		colorDistMagn   0.890151
		colorDistFreq   8.77537
		detailScale     3053.99
		colorConversion true
		snowLevel       2
		tropicLatitude  0.651073
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.48547
		terraceProb     0.42406
		erosion         0
		montesMagn      0.514005
		montesFreq      3.48583
		montesSpiky     0.949434
		montesFraction  0.310297
		dunesFraction   0
		hillsMagn       0
		hillsFreq       36.5568
		hillsFraction   0.692541
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251153
		craterFreq      0.389634
		craterDensity   0.875092
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.478559
		volcanoTemp     1622.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.192, 0.166, 0.135, 0.000)
		colorShelf     (0.197, 0.171, 0.154, 0.000)
		colorBeach     (0.231, 0.200, 0.183, 0.000)
		colorDesert    (0.251, 0.215, 0.179, 0.000)
		colorLowland   (0.275, 0.229, 0.203, 0.000)
		colorUpland    (0.305, 0.278, 0.246, 0.000)
		colorRock      (0.329, 0.302, 0.265, 0.000)
		colorSnow      (0.359, 0.322, 0.280, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.3709
		DustBright  0.381102
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   19.5059
		Period          98.5705
		Eccentricity    0.981593
		Inclination     137.519
		AscendingNode   -21.3731
		ArgOfPericenter -131.403
		MeanAnomaly     -8.60427
	}
}

Comet	"C28"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            1.53482e-014
	Radius          0.409282
	InertiaMoment   0.397611

	Oblateness      0.00419094

	RotationPeriod  100.451
	Obliquity       315.207
	EqAscendNode    15.9394

	AbsMagn         4.72878
	SlopeParam      2.69257
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.576 0.570 0.566)

	Surface
	{
		SurfStyle       0.294061
		OceanStyle      0.422937
		Randomize      (-0.533, -0.735, -0.852)
		colorDistMagn   0.929291
		colorDistFreq   8.79197e-005
		detailScale     11.1761
		colorConversion true
		snowLevel       2
		tropicLatitude  0.276708
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.553778
		terraceProb     0.284134
		erosion         0
		montesMagn      0.475288
		montesFreq      2.72818
		montesSpiky     0.894256
		montesFraction  0.480222
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00027958
		hillsFraction   0.54284
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230546
		craterFreq      0.228754
		craterDensity   1.06289
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.466009
		volcanoTemp     1575.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.230, 0.228, 0.226, 0.000)
		colorShelf     (0.245, 0.242, 0.240, 0.000)
		colorBeach     (0.259, 0.256, 0.255, 0.000)
		colorDesert    (0.274, 0.271, 0.269, 0.000)
		colorLowland   (0.288, 0.285, 0.283, 0.000)
		colorUpland    (0.302, 0.299, 0.297, 0.000)
		colorRock      (0.317, 0.313, 0.311, 0.000)
		colorSnow      (0.331, 0.328, 0.325, 1.000)
		BumpHeight      0.368354
		BumpOffset      0.0736707
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.156774
		GasToDust   0.25
		Particles   1296
		GasBright   0.0228119
		DustBright  0.413677
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   19.0424
		Period          95.0785
		Eccentricity    0.96187
		Inclination     -60.1044
		AscendingNode   173.818
		ArgOfPericenter 106.843
		MeanAnomaly     76.6081
	}
}

Comet	"C29"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            1.18707e-010
	Radius          6.92767
	InertiaMoment   0.399534

	Oblateness      0.00291643

	RotationPeriod  95.6942
	Obliquity       268.412
	EqAscendNode    0.516798

	AbsMagn         12.347
	SlopeParam      3.32953
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.763 0.697 0.623)

	Surface
	{
		SurfStyle       0.711417
		OceanStyle      0.940507
		Randomize      (0.441, 0.572, -0.626)
		colorDistMagn   0.548889
		colorDistFreq   0.03663
		detailScale     189.172
		colorConversion true
		snowLevel       2
		tropicLatitude  0.849192
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.56081
		terraceProb     0.19893
		erosion         0
		montesMagn      0.505658
		montesFreq      2.98761
		montesSpiky     0.867461
		montesFraction  0.317636
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0780593
		hillsFraction   0.672141
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250141
		craterFreq      0.218412
		craterDensity   0.988345
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.508161
		volcanoTemp     1727.92
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.298, 0.237, 0.174, 0.000)
		colorShelf     (0.305, 0.244, 0.199, 0.000)
		colorBeach     (0.359, 0.286, 0.237, 0.000)
		colorDesert    (0.389, 0.307, 0.230, 0.000)
		colorLowland   (0.427, 0.328, 0.262, 0.000)
		colorUpland    (0.473, 0.397, 0.318, 0.000)
		colorRock      (0.511, 0.432, 0.343, 0.000)
		colorSnow      (0.557, 0.460, 0.361, 1.000)
		BumpHeight      6.23491
		BumpOffset      1.24698
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.637966
		GasToDust   0.25
		Particles   2268
		GasBright   0.102512
		DustBright  0.818464
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   18.7122
		Period          92.6164
		Eccentricity    0.9708
		Inclination     -137.87
		AscendingNode   139.191
		ArgOfPericenter -9.78422
		MeanAnomaly     47.645
	}
}

Comet	"C30"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            3.65508e-018
	Radius          0.0252381
	InertiaMoment   0.398314

	Oblateness      0.00497001

	RotationPeriod  91.6499
	Obliquity       221.618
	EqAscendNode    345.094

	AbsMagn         8.23752
	SlopeParam      3.90372
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.697 0.568 0.443)

	Surface
	{
		SurfStyle       0.519172
		OceanStyle      0.830592
		Randomize      (0.331, -0.232, 0.295)
		colorDistMagn   0.775693
		colorDistFreq   2.51326e-007
		detailScale     0.689167
		colorConversion true
		snowLevel       2
		tropicLatitude  0.953256
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.44528
		terraceProb     0.308419
		erosion         0
		montesMagn      0.426123
		montesFreq      3.65479
		montesSpiky     0.993758
		montesFraction  0.597015
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.81938e-006
		hillsFraction   0.60787
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235194
		craterFreq      0.210183
		craterDensity   0.935599
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.542926
		volcanoTemp     1135.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.272, 0.193, 0.124, 0.000)
		colorShelf     (0.279, 0.199, 0.142, 0.000)
		colorBeach     (0.328, 0.233, 0.168, 0.000)
		colorDesert    (0.355, 0.250, 0.164, 0.000)
		colorLowland   (0.390, 0.267, 0.186, 0.000)
		colorUpland    (0.432, 0.324, 0.226, 0.000)
		colorRock      (0.467, 0.352, 0.244, 0.000)
		colorSnow      (0.509, 0.375, 0.257, 1.000)
		BumpHeight      0.0227143
		BumpOffset      0.00454285
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.103142
		DustBright  0.50232
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   27.8066
		Period          167.773
		Eccentricity    0.989077
		Inclination     101.991
		AscendingNode   -76.9366
		ArgOfPericenter -45.5041
		MeanAnomaly     -58.3815
	}
}

Comet	"C31"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            2.82694e-014
	Radius          0.429118
	InertiaMoment   0.399957

	Oblateness      0.00344003

	RotationPeriod  88.0923
	Obliquity       174.824
	EqAscendNode    329.672

	AbsMagn         4.42796
	SlopeParam      4.46991
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.569 0.561 0.557)

	Surface
	{
		SurfStyle       0.690791
		OceanStyle      0.61119
		Randomize      (0.882, -0.465, -0.349)
		colorDistMagn   0.310064
		colorDistFreq   3.32284e-005
		detailScale     11.7178
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0905451
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.577442
		terraceProb     0.107141
		erosion         0
		montesMagn      0.476329
		montesFreq      3.24091
		montesSpiky     0.8771
		montesFraction  0.722996
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000345975
		hillsFraction   0.68499
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233901
		craterFreq      0.224686
		craterDensity   0.836482
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.512607
		volcanoTemp     1495.25
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.222, 0.191, 0.156, 0.000)
		colorShelf     (0.227, 0.197, 0.178, 0.000)
		colorBeach     (0.267, 0.230, 0.212, 0.000)
		colorDesert    (0.290, 0.247, 0.206, 0.000)
		colorLowland   (0.318, 0.264, 0.234, 0.000)
		colorUpland    (0.352, 0.320, 0.284, 0.000)
		colorRock      (0.381, 0.348, 0.306, 0.000)
		colorSnow      (0.415, 0.371, 0.323, 1.000)
		BumpHeight      0.386206
		BumpOffset      0.0772412
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.1896
		GasToDust   0.25
		Particles   1362
		GasBright   0.0665137
		DustBright  0.223435
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   20.1128
		Period          103.207
		Eccentricity    0.972338
		Inclination     0.0199426
		AscendingNode   160.013
		ArgOfPericenter -10.1184
		MeanAnomaly     12.6829
	}
}

Comet	"C32"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            2.18643e-010
	Radius          9.82428
	InertiaMoment   0.398853

	Oblateness      0.00572398

	RotationPeriod  84.8883
	Obliquity       128.029
	EqAscendNode    314.249

	AbsMagn         11.988
	SlopeParam      5.07741
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.614 0.519 0.482)

	Surface
	{
		SurfStyle       0.992804
		OceanStyle      0.157078
		Randomize      (0.794, -0.220, -0.300)
		colorDistMagn   0.805953
		colorDistFreq   0.0408248
		detailScale     268.268
		colorConversion true
		snowLevel       2
		tropicLatitude  0.750932
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.636019
		terraceProb     0.188201
		erosion         0
		montesMagn      0.340984
		montesFreq      3.61651
		montesSpiky     0.88661
		montesFraction  0.345445
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.203325
		hillsFraction   0.788117
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.177914
		craterFreq      0.246042
		craterDensity   0.872559
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.511365
		volcanoTemp     1406.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.209, 0.182, 0.193, 0.050)
		colorShelf     (0.246, 0.213, 0.222, 0.040)
		colorBeach     (0.283, 0.244, 0.251, 0.030)
		colorDesert    (0.320, 0.275, 0.284, 0.020)
		colorLowland   (0.356, 0.306, 0.313, 0.030)
		colorUpland    (0.393, 0.338, 0.342, 0.050)
		colorRock      (0.430, 0.369, 0.381, 0.020)
		colorSnow      (0.430, 0.369, 0.381, 1.000)
		BumpHeight      8.84185
		BumpOffset      1.76837
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.670792
		GasToDust   0.25
		Particles   2334
		GasBright   0.223381
		DustBright  0.551054
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   11.8194
		Period          46.4937
		Eccentricity    0.952655
		Inclination     -76.7786
		AscendingNode   132.644
		ArgOfPericenter -97.2507
		MeanAnomaly     -61.3329
	}
}

Comet	"C33"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            6.73218e-018
	Radius          0.0265806
	InertiaMoment   0.397119

	Oblateness      0.00392479

	RotationPeriod  81.9528
	Obliquity       81.2352
	EqAscendNode    298.826

	AbsMagn         8.02875
	SlopeParam      5.80822
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.490 0.488 0.484)

	Surface
	{
		SurfStyle       0.966456
		OceanStyle      0.566145
		Randomize      (-0.340, -0.805, -0.577)
		colorDistMagn   0.73259
		colorDistFreq   4.96521e-007
		detailScale     0.725828
		colorConversion true
		snowLevel       2
		tropicLatitude  0.686668
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.575832
		terraceProb     0.103206
		erosion         0
		montesMagn      0.224967
		montesFreq      2.43053
		montesSpiky     0.845574
		montesFraction  0.852056
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.54235e-006
		hillsFraction   0.489342
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.212706
		craterFreq      0.184096
		craterDensity   0.919645
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.448398
		volcanoTemp     1041.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.166, 0.171, 0.194, 0.050)
		colorShelf     (0.196, 0.200, 0.223, 0.040)
		colorBeach     (0.225, 0.229, 0.252, 0.030)
		colorDesert    (0.255, 0.258, 0.285, 0.020)
		colorLowland   (0.284, 0.288, 0.315, 0.030)
		colorUpland    (0.313, 0.317, 0.344, 0.050)
		colorRock      (0.343, 0.346, 0.382, 0.020)
		colorSnow      (0.343, 0.346, 0.382, 1.000)
		BumpHeight      0.0239226
		BumpOffset      0.00478451
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.15947
		DustBright  0.299452
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   12.9558
		Period          53.3576
		Eccentricity    0.962822
		Inclination     120.049
		AscendingNode   -159.877
		ArgOfPericenter 5.26512
		MeanAnomaly     169.779
	}
}

Comet	"C34"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            5.20686e-014
	Radius          0.606345
	InertiaMoment   0.399318

	Oblateness      0.0064986

	RotationPeriod  79.2272
	Obliquity       34.4409
	EqAscendNode    283.404

	AbsMagn         4.10544
	SlopeParam      6.93836
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.562 0.455 0.323)

	Surface
	{
		SurfStyle       0.434576
		OceanStyle      0.105412
		Randomize      (0.217, -0.841, -1.000)
		colorDistMagn   0.670284
		colorDistFreq   0.000195015
		detailScale     16.5572
		colorConversion true
		snowLevel       2
		tropicLatitude  0.794394
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.727268
		terraceProb     0.394864
		erosion         0
		montesMagn      0.593189
		montesFreq      2.78466
		montesSpiky     0.972895
		montesFraction  0.47753
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000811193
		hillsFraction   0.49434
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25647
		craterFreq      0.188707
		craterDensity   0.703571
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.500386
		volcanoTemp     1392.25
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.225, 0.182, 0.129, 0.000)
		colorShelf     (0.239, 0.193, 0.137, 0.000)
		colorBeach     (0.253, 0.205, 0.145, 0.000)
		colorDesert    (0.267, 0.216, 0.153, 0.000)
		colorLowland   (0.281, 0.227, 0.161, 0.000)
		colorUpland    (0.295, 0.239, 0.169, 0.000)
		colorRock      (0.309, 0.250, 0.177, 0.000)
		colorSnow      (0.323, 0.261, 0.185, 1.000)
		BumpHeight      0.54571
		BumpOffset      0.109142
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.222426
		GasToDust   0.25
		Particles   1429
		GasBright   0.383527
		DustBright  0.559881
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   17.2217
		Period          81.7735
		Eccentricity    0.970635
		Inclination     -117.7
		AscendingNode   116.578
		ArgOfPericenter 33.4739
		MeanAnomaly     -132.496
	}
}

Comet	"C35"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            4.02713e-010
	Radius          10.3885
	InertiaMoment   0.397998

	Oblateness      0.00449007

	RotationPeriod  76.6699
	Obliquity       347.647
	EqAscendNode    267.981

	AbsMagn         11.6585
	SlopeParam      2.31562
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.568 0.518 0.471)

	Surface
	{
		SurfStyle       0.528944
		OceanStyle      0.771535
		Randomize      (-0.976, 0.637, -0.155)
		colorDistMagn   0.995108
		colorDistFreq   0.0463103
		detailScale     283.676
		colorConversion true
		snowLevel       2
		tropicLatitude  0.93148
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.402594
		terraceProb     0.349905
		erosion         0
		montesMagn      0.477037
		montesFreq      3.07107
		montesSpiky     0.956828
		montesFraction  0.420152
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.205467
		hillsFraction   0.917072
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251316
		craterFreq      0.249091
		craterDensity   0.967296
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.557626
		volcanoTemp     1582.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.222, 0.176, 0.132, 0.000)
		colorShelf     (0.227, 0.181, 0.151, 0.000)
		colorBeach     (0.267, 0.212, 0.179, 0.000)
		colorDesert    (0.290, 0.228, 0.174, 0.000)
		colorLowland   (0.318, 0.243, 0.198, 0.000)
		colorUpland    (0.352, 0.295, 0.240, 0.000)
		colorRock      (0.381, 0.321, 0.259, 0.000)
		colorSnow      (0.415, 0.342, 0.273, 1.000)
		BumpHeight      9.34968
		BumpOffset      1.86994
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.703618
		GasToDust   0.25
		Particles   2401
		GasBright   0.292335
		DustBright  0.33556
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   25.646
		Period          148.604
		Eccentricity    0.975128
		Inclination     79.5534
		AscendingNode   -27.4715
		ArgOfPericenter -55.5117
		MeanAnomaly     11.8241
	}
}

Comet	"C36"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            1.23999e-017
	Radius          0.0374355
	InertiaMoment   0.399749

	Oblateness      0.00732372

	RotationPeriod  74.2497
	Obliquity       300.852
	EqAscendNode    252.559

	AbsMagn         7.82005
	SlopeParam      3.01915
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.719 0.686 0.631)

	Surface
	{
		SurfStyle       0.0735679
		OceanStyle      0.842283
		Randomize      (-0.940, 0.809, -0.221)
		colorDistMagn   0.791378
		colorDistFreq   7.72854e-007
		detailScale     1.02224
		colorConversion true
		snowLevel       2
		tropicLatitude  0.714192
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.545134
		terraceProb     0.35855
		erosion         0
		montesMagn      0.538465
		montesFreq      3.46477
		montesSpiky     0.874442
		montesFraction  0.672854
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.9e-006
		hillsFraction   0.393177
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220803
		craterFreq      0.229163
		craterDensity   0.986552
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.552376
		volcanoTemp     1095.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.288, 0.275, 0.252, 0.000)
		colorShelf     (0.306, 0.292, 0.268, 0.000)
		colorBeach     (0.324, 0.309, 0.284, 0.000)
		colorDesert    (0.342, 0.326, 0.300, 0.000)
		colorLowland   (0.360, 0.343, 0.315, 0.000)
		colorUpland    (0.378, 0.360, 0.331, 0.000)
		colorRock      (0.396, 0.378, 0.347, 0.000)
		colorSnow      (0.414, 0.395, 0.363, 1.000)
		BumpHeight      0.0336919
		BumpOffset      0.00673838
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.00769221
		DustBright  0.304689
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   24.3916
		Period          137.835
		Eccentricity    0.97146
		Inclination     -18.23
		AscendingNode   142.429
		ArgOfPericenter -146.594
		MeanAnomaly     -175.117
	}
}

Comet	"C37"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            9.5904e-014
	Radius          0.643493
	InertiaMoment   0.3986

	Oblateness      0.00510079

	RotationPeriod  71.9427
	Obliquity       254.058
	EqAscendNode    237.136

	AbsMagn         3.75537
	SlopeParam      3.61663
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.566 0.560 0.553)

	Surface
	{
		SurfStyle       0.185684
		OceanStyle      0.785177
		Randomize      (0.725, 0.909, 0.852)
		colorDistMagn   0.723862
		colorDistFreq   0.000235676
		detailScale     17.5717
		colorConversion true
		snowLevel       2
		tropicLatitude  0.835715
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.435587
		terraceProb     0.368716
		erosion         0
		montesMagn      0.645091
		montesFreq      2.24313
		montesSpiky     0.890894
		montesFraction  0.621087
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000918794
		hillsFraction   0.429851
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250035
		craterFreq      0.239913
		craterDensity   0.951642
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.504771
		volcanoTemp     1368.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.226, 0.224, 0.221, 0.000)
		colorShelf     (0.240, 0.238, 0.235, 0.000)
		colorBeach     (0.255, 0.252, 0.249, 0.000)
		colorDesert    (0.269, 0.266, 0.263, 0.000)
		colorLowland   (0.283, 0.280, 0.276, 0.000)
		colorUpland    (0.297, 0.294, 0.290, 0.000)
		colorRock      (0.311, 0.308, 0.304, 0.000)
		colorSnow      (0.325, 0.322, 0.318, 1.000)
		BumpHeight      0.579144
		BumpOffset      0.115829
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.255252
		GasToDust   0.25
		Particles   1495
		GasBright   0.0666737
		DustBright  0.730194
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   20.0771
		Period          102.932
		Eccentricity    0.969438
		Inclination     -104.321
		AscendingNode   -48.5194
		ArgOfPericenter 60.5781
		MeanAnomaly     -50.7784
	}
}

Comet	"C38"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            7.41749e-010
	Radius          14.5871
	InertiaMoment   0.39634

	Oblateness      0.00810862

	RotationPeriod  69.7302
	Obliquity       207.264
	EqAscendNode    221.713

	AbsMagn         11.3522
	SlopeParam      4.18108
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.560 0.450 0.370)

	Surface
	{
		SurfStyle       0.866539
		OceanStyle      0.0643808
		Randomize      (-0.651, -0.451, -0.437)
		colorDistMagn   0.935145
		colorDistFreq   0.173961
		detailScale     398.326
		colorConversion true
		snowLevel       2
		tropicLatitude  0.492745
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.740584
		terraceProb     0.11089
		erosion         0
		montesMagn      0.489991
		montesFreq      2.9204
		montesSpiky     0.921989
		montesFraction  0.519914
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.464735
		hillsFraction   0.740173
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255939
		craterFreq      0.186568
		craterDensity   0.869091
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.532746
		volcanoTemp     1755.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.191, 0.157, 0.148, 0.050)
		colorShelf     (0.224, 0.184, 0.170, 0.040)
		colorBeach     (0.258, 0.211, 0.192, 0.030)
		colorDesert    (0.291, 0.238, 0.218, 0.020)
		colorLowland   (0.325, 0.265, 0.241, 0.030)
		colorUpland    (0.359, 0.292, 0.263, 0.050)
		colorRock      (0.392, 0.319, 0.292, 0.020)
		colorSnow      (0.392, 0.319, 0.292, 1.000)
		BumpHeight      13.1284
		BumpOffset      2.62568
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.736444
		GasToDust   0.25
		Particles   2467
		GasBright   0.0686965
		DustBright  0.412658
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   16.1359
		Period          74.1635
		Eccentricity    0.984767
		Inclination     -9.4149
		AscendingNode   -95.1759
		ArgOfPericenter 49.8518
		MeanAnomaly     -11.2948
	}
}

Comet	"C39"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            2.2839e-017
	Radius          0.0398597
	InertiaMoment   0.399095

	Oblateness      0.00577689

	RotationPeriod  67.5968
	Obliquity       160.469
	EqAscendNode    206.291

	AbsMagn         7.61087
	SlopeParam      4.76064
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.472 0.468 0.464)

	Surface
	{
		SurfStyle       0.374695
		OceanStyle      0.286783
		Randomize      (0.892, 0.312, -0.187)
		colorDistMagn   0.384144
		colorDistFreq   6.75319e-007
		detailScale     1.08844
		colorConversion true
		snowLevel       2
		tropicLatitude  0.32135
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.570747
		terraceProb     0.146415
		erosion         0
		montesMagn      0.500976
		montesFreq      2.51248
		montesSpiky     0.944715
		montesFraction  0.603666
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.1949e-006
		hillsFraction   0.701786
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242698
		craterFreq      0.182211
		craterDensity   0.931735
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.566812
		volcanoTemp     1670.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.189, 0.187, 0.186, 0.000)
		colorShelf     (0.201, 0.199, 0.197, 0.000)
		colorBeach     (0.212, 0.211, 0.209, 0.000)
		colorDesert    (0.224, 0.223, 0.221, 0.000)
		colorLowland   (0.236, 0.234, 0.232, 0.000)
		colorUpland    (0.248, 0.246, 0.244, 0.000)
		colorRock      (0.260, 0.258, 0.255, 0.000)
		colorSnow      (0.271, 0.269, 0.267, 1.000)
		BumpHeight      0.0358737
		BumpOffset      0.00717475
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.194868
		DustBright  0.770973
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   20.0701
		Period          102.878
		Eccentricity    0.973824
		Inclination     179.206
		AscendingNode   172.237
		ArgOfPericenter 108.419
		MeanAnomaly     70.2774
	}
}

Comet	"C40"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            1.76643e-013
	Radius          0.901075
	InertiaMoment   0.397621

	Oblateness      0.00913116

	RotationPeriod  65.5302
	Obliquity       113.675
	EqAscendNode    190.868

	AbsMagn         3.36935
	SlopeParam      5.41404
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.454 0.451 0.449)

	Surface
	{
		SurfStyle       0.121004
		OceanStyle      0.0701052
		Randomize      (0.565, -0.106, 0.783)
		colorDistMagn   0.781992
		colorDistFreq   0.000722604
		detailScale     24.6054
		colorConversion true
		snowLevel       2
		tropicLatitude  0.145996
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.599258
		terraceProb     0.183482
		erosion         0
		montesMagn      0.677058
		montesFreq      2.32569
		montesSpiky     0.996371
		montesFraction  0.647452
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00200799
		hillsFraction   0.632762
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.284202
		craterFreq      0.167628
		craterDensity   0.992026
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.470978
		volcanoTemp     1619.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.182, 0.180, 0.180, 0.000)
		colorShelf     (0.193, 0.191, 0.191, 0.000)
		colorBeach     (0.204, 0.203, 0.202, 0.000)
		colorDesert    (0.216, 0.214, 0.213, 0.000)
		colorLowland   (0.227, 0.225, 0.224, 0.000)
		colorUpland    (0.239, 0.237, 0.236, 0.000)
		colorRock      (0.250, 0.248, 0.247, 0.000)
		colorSnow      (0.261, 0.259, 0.258, 1.000)
		BumpHeight      0.810968
		BumpOffset      0.162194
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.288078
		GasToDust   0.25
		Particles   1561
		GasBright   0.169609
		DustBright  0.480719
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   24.9229
		Period          142.363
		Eccentricity    0.986596
		Inclination     -110.815
		AscendingNode   -8.53008
		ArgOfPericenter -51.1122
		MeanAnomaly     -25.3455
	}
}

Comet	"C41"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            1.36621e-009
	Radius          15.5784
	InertiaMoment   0.399539

	Oblateness      0.00654006

	RotationPeriod  63.5198
	Obliquity       66.8808
	EqAscendNode    175.446

	AbsMagn         11.0644
	SlopeParam      6.27466
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.430 0.425 0.422)

	Surface
	{
		SurfStyle       0.156039
		OceanStyle      0.317395
		Randomize      (0.971, -0.856, 0.903)
		colorDistMagn   0.049061
		colorDistFreq   0.195257
		detailScale     425.395
		colorConversion true
		snowLevel       2
		tropicLatitude  0.649117
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.696843
		terraceProb     0.451825
		erosion         0
		montesMagn      0.413233
		montesFreq      2.91958
		montesSpiky     0.934224
		montesFraction  0.443013
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.509135
		hillsFraction   0.493841
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264484
		craterFreq      0.166019
		craterDensity   0.782488
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.508475
		volcanoTemp     1619.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.172, 0.170, 0.169, 0.000)
		colorShelf     (0.183, 0.180, 0.179, 0.000)
		colorBeach     (0.193, 0.191, 0.190, 0.000)
		colorDesert    (0.204, 0.202, 0.201, 0.000)
		colorLowland   (0.215, 0.212, 0.211, 0.000)
		colorUpland    (0.226, 0.223, 0.222, 0.000)
		colorRock      (0.236, 0.234, 0.232, 0.000)
		colorSnow      (0.247, 0.244, 0.243, 1.000)
		BumpHeight      14.0206
		BumpOffset      2.80412
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.76927
		GasToDust   0.25
		Particles   2533
		GasBright   0.107091
		DustBright  0.227724
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   16.3312
		Period          75.5142
		Eccentricity    0.9552
		Inclination     -109.122
		AscendingNode   -136.668
		ArgOfPericenter -35.793
		MeanAnomaly     -85.9088
	}
}

Comet	"C42"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            4.20665e-017
	Radius          0.0556729
	InertiaMoment   0.398321

	Oblateness      0.0102756

	RotationPeriod  61.5568
	Obliquity       20.0865
	EqAscendNode    160.023

	AbsMagn         7.40061
	SlopeParam      8.30785
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.591 0.586 0.582)

	Surface
	{
		SurfStyle       0.521344
		OceanStyle      0.00035788
		Randomize      (-0.760, -0.381, -0.547)
		colorDistMagn   0.25508
		colorDistFreq   1.45741e-006
		detailScale     1.52024
		colorConversion true
		snowLevel       2
		tropicLatitude  0.643987
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.616928
		terraceProb     0.226017
		erosion         0
		montesMagn      0.690945
		montesFreq      2.53425
		montesSpiky     0.97203
		montesFraction  0.599268
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.53465e-006
		hillsFraction   0.574217
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229122
		craterFreq      0.259833
		craterDensity   0.996409
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.510515
		volcanoTemp     1111.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.230, 0.199, 0.163, 0.000)
		colorShelf     (0.236, 0.205, 0.186, 0.000)
		colorBeach     (0.278, 0.240, 0.221, 0.000)
		colorDesert    (0.301, 0.258, 0.215, 0.000)
		colorLowland   (0.331, 0.275, 0.245, 0.000)
		colorUpland    (0.366, 0.334, 0.297, 0.000)
		colorRock      (0.396, 0.363, 0.320, 0.000)
		colorSnow      (0.431, 0.387, 0.338, 1.000)
		BumpHeight      0.0501056
		BumpOffset      0.0100211
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.31043
		DustBright  0.508871
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   24.1756
		Period          136.009
		Eccentricity    0.985003
		Inclination     157.073
		AscendingNode   -138.333
		ArgOfPericenter 36.0668
		MeanAnomaly     -74.6572
	}
}

Comet	"C43"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            3.25354e-013
	Radius          0.964969
	InertiaMoment   0.399962

	Oblateness      0.00741724

	RotationPeriod  59.6332
	Obliquity       333.292
	EqAscendNode    144.601

	AbsMagn         2.93457
	SlopeParam      2.683
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.511 0.507 0.501)

	Surface
	{
		SurfStyle       0.782995
		OceanStyle      0.891194
		Randomize      (-0.322, -0.431, -0.923)
		colorDistMagn   0.41925
		colorDistFreq   0.00080537
		detailScale     26.3501
		colorConversion true
		snowLevel       2
		tropicLatitude  0.822748
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.347892
		terraceProb     0.257142
		erosion         0
		montesMagn      0.503692
		montesFreq      3.39096
		montesSpiky     0.91938
		montesFraction  0.612991
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00196237
		hillsFraction   0.435041
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24152
		craterFreq      0.221452
		craterDensity   0.840942
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.495041
		volcanoTemp     1404.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.199, 0.172, 0.140, 0.000)
		colorShelf     (0.204, 0.178, 0.160, 0.000)
		colorBeach     (0.240, 0.208, 0.190, 0.000)
		colorDesert    (0.261, 0.223, 0.185, 0.000)
		colorLowland   (0.286, 0.238, 0.210, 0.000)
		colorUpland    (0.317, 0.289, 0.256, 0.000)
		colorRock      (0.342, 0.315, 0.276, 0.000)
		colorSnow      (0.373, 0.335, 0.291, 1.000)
		BumpHeight      0.868472
		BumpOffset      0.173694
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.320904
		GasToDust   0.25
		Particles   1628
		GasBright   0.220629
		DustBright  0.283158
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   21.0763
		Period          110.711
		Eccentricity    0.962204
		Inclination     60.2295
		AscendingNode   71.3348
		ArgOfPericenter -92.5982
		MeanAnomaly     -24.0536
	}
}

Comet	"C44"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            2.51638e-009
	Radius          21.7074
	InertiaMoment   0.398859

	Oblateness      0.0115956

	RotationPeriod  57.7424
	Obliquity       286.498
	EqAscendNode    129.178

	AbsMagn         10.7916
	SlopeParam      3.32137
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.756 0.753 0.750)

	Surface
	{
		SurfStyle       0.443811
		OceanStyle      0.452155
		Randomize      (0.144, -0.872, 0.121)
		colorDistMagn   0.580529
		colorDistFreq   0.274848
		detailScale     592.756
		colorConversion true
		snowLevel       2
		tropicLatitude  0.963287
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.401013
		terraceProb     0.416037
		erosion         0
		montesMagn      0.240906
		montesFreq      2.96701
		montesSpiky     0.992776
		montesFraction  0.463254
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.16892
		hillsFraction   0.575518
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229731
		craterFreq      0.173233
		craterDensity   0.989723
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.534539
		volcanoTemp     1397.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.302, 0.301, 0.300, 0.000)
		colorShelf     (0.321, 0.320, 0.319, 0.000)
		colorBeach     (0.340, 0.339, 0.337, 0.000)
		colorDesert    (0.359, 0.358, 0.356, 0.000)
		colorLowland   (0.378, 0.376, 0.375, 0.000)
		colorUpland    (0.397, 0.395, 0.394, 0.000)
		colorRock      (0.416, 0.414, 0.412, 0.000)
		colorSnow      (0.435, 0.433, 0.431, 1.000)
		BumpHeight      19.5366
		BumpOffset      3.90732
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.802096
		GasToDust   0.25
		Particles   2600
		GasBright   0.491159
		DustBright  0.497115
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   22.027
		Period          118.286
		Eccentricity    0.9759
		Inclination     102.897
		AscendingNode   -102.676
		ArgOfPericenter 179.619
		MeanAnomaly     91.9484
	}
}

Comet	"C45"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            7.74813e-017
	Radius          0.0597728
	InertiaMoment   0.397134

	Oblateness      0.00834183

	RotationPeriod  55.878
	Obliquity       239.704
	EqAscendNode    113.755

	AbsMagn         7.18868
	SlopeParam      3.89599
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.686 0.610 0.579)

	Surface
	{
		SurfStyle       0.576233
		OceanStyle      0.319683
		Randomize      (0.355, 0.146, -0.892)
		colorDistMagn   0.957701
		colorDistFreq   1.51483e-006
		detailScale     1.6322
		colorConversion true
		snowLevel       2
		tropicLatitude  0.872121
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.353032
		terraceProb     0.13682
		erosion         0
		montesMagn      0.408037
		montesFreq      3.63672
		montesSpiky     0.885669
		montesFraction  0.0618462
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.9174e-006
		hillsFraction   0.61839
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.206769
		craterFreq      0.210916
		craterDensity   0.833155
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.525801
		volcanoTemp     1277.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.267, 0.207, 0.162, 0.000)
		colorShelf     (0.274, 0.213, 0.185, 0.000)
		colorBeach     (0.322, 0.250, 0.220, 0.000)
		colorDesert    (0.350, 0.268, 0.214, 0.000)
		colorLowland   (0.384, 0.287, 0.243, 0.000)
		colorUpland    (0.425, 0.348, 0.295, 0.000)
		colorRock      (0.459, 0.378, 0.318, 0.000)
		colorSnow      (0.500, 0.403, 0.336, 1.000)
		BumpHeight      0.0537955
		BumpOffset      0.0107591
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0376959
		DustBright  0.635065
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   20.5974
		Period          106.959
		Eccentricity    0.974446
		Inclination     146.915
		AscendingNode   -81.8754
		ArgOfPericenter -154.819
		MeanAnomaly     -94.7986
	}
}

Comet	"C46"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            5.99262e-013
	Radius          1.34166
	InertiaMoment   0.399324

	Oblateness      0.013151

	RotationPeriod  54.0346
	Obliquity       192.909
	EqAscendNode    98.3328

	AbsMagn         2.42997
	SlopeParam      4.46198
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.613 0.512 0.363)

	Surface
	{
		SurfStyle       0.779301
		OceanStyle      0.497892
		Randomize      (0.776, 0.032, 0.815)
		colorDistMagn   0.115739
		colorDistFreq   0.00154282
		detailScale     36.6361
		colorConversion true
		snowLevel       2
		tropicLatitude  0.183214
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.412832
		terraceProb     0.416946
		erosion         0
		montesMagn      0.481457
		montesFreq      4.25554
		montesSpiky     0.965838
		montesFraction  0.587942
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00608527
		hillsFraction   0.396422
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230665
		craterFreq      0.154929
		craterDensity   0.942014
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.553026
		volcanoTemp     1168.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.239, 0.174, 0.102, 0.000)
		colorShelf     (0.245, 0.179, 0.116, 0.000)
		colorBeach     (0.288, 0.210, 0.138, 0.000)
		colorDesert    (0.313, 0.225, 0.134, 0.000)
		colorLowland   (0.343, 0.240, 0.152, 0.000)
		colorUpland    (0.380, 0.292, 0.185, 0.000)
		colorRock      (0.411, 0.317, 0.200, 0.000)
		colorSnow      (0.447, 0.338, 0.211, 1.000)
		BumpHeight      1.20749
		BumpOffset      0.241498
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.35373
		GasToDust   0.25
		Particles   1694
		GasBright   0.0411109
		DustBright  0.316136
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   19.0426
		Period          95.0797
		Eccentricity    0.967669
		Inclination     -2.97303
		AscendingNode   -33.5209
		ArgOfPericenter 36.1577
		MeanAnomaly     -11.6427
	}
}

Comet	"C47"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            4.63485e-009
	Radius          23.3611
	InertiaMoment   0.398006

	Oblateness      0.00956842

	RotationPeriod  52.2068
	Obliquity       146.115
	EqAscendNode    82.9102

	AbsMagn         10.5313
	SlopeParam      5.0685
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.512 0.508 0.502)

	Surface
	{
		SurfStyle       0.184592
		OceanStyle      0.772751
		Randomize      (0.343, 0.268, 0.143)
		colorDistMagn   0.699637
		colorDistFreq   0.165353
		detailScale     637.914
		colorConversion true
		snowLevel       2
		tropicLatitude  0.620714
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.572058
		terraceProb     0.346615
		erosion         0
		montesMagn      0.345859
		montesFreq      2.79937
		montesSpiky     0.992217
		montesFraction  0.587459
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.6244
		hillsFraction   0.702207
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241104
		craterFreq      0.209368
		craterDensity   0.964154
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.443544
		volcanoTemp     1189.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.205, 0.203, 0.201, 0.000)
		colorShelf     (0.218, 0.216, 0.213, 0.000)
		colorBeach     (0.230, 0.229, 0.226, 0.000)
		colorDesert    (0.243, 0.241, 0.238, 0.000)
		colorLowland   (0.256, 0.254, 0.251, 0.000)
		colorUpland    (0.269, 0.267, 0.263, 0.000)
		colorRock      (0.282, 0.280, 0.276, 0.000)
		colorSnow      (0.294, 0.292, 0.288, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.834922
		GasToDust   0.25
		Particles   2666
		GasBright   0.146565
		DustBright  0.695169
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   18.6979
		Period          92.5101
		Eccentricity    0.966737
		Inclination     4.53735
		AscendingNode   170.649
		ArgOfPericenter -0.608516
		MeanAnomaly     -124.32
	}
}

Comet	"C48"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            1.42711e-016
	Radius          0.082935
	InertiaMoment   0.399755

	Oblateness      0.0150233

	RotationPeriod  50.3899
	Obliquity       99.3207
	EqAscendNode    67.4876

	AbsMagn         6.97445
	SlopeParam      5.79664
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.614 0.607 0.604)

	Surface
	{
		SurfStyle       0.57358
		OceanStyle      0.823768
		Randomize      (-0.772, -0.358, -0.498)
		colorDistMagn   0.515311
		colorDistFreq   4.18359e-006
		detailScale     2.26468
		colorConversion true
		snowLevel       2
		tropicLatitude  0.979814
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.450018
		terraceProb     0.263834
		erosion         0
		montesMagn      0.563586
		montesFreq      3.59725
		montesSpiky     0.987038
		montesFraction  0.698256
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.31985e-005
		hillsFraction   0.538118
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242618
		craterFreq      0.264822
		craterDensity   0.90459
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.489618
		volcanoTemp     1657.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.239, 0.206, 0.169, 0.000)
		colorShelf     (0.246, 0.213, 0.193, 0.000)
		colorBeach     (0.289, 0.249, 0.230, 0.000)
		colorDesert    (0.313, 0.267, 0.224, 0.000)
		colorLowland   (0.344, 0.285, 0.254, 0.000)
		colorUpland    (0.381, 0.346, 0.308, 0.000)
		colorRock      (0.411, 0.377, 0.332, 0.000)
		colorSnow      (0.448, 0.401, 0.351, 1.000)
		BumpHeight      0.0746415
		BumpOffset      0.0149283
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.122697
		DustBright  0.403523
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   21.003
		Period          110.134
		Eccentricity    0.965228
		Inclination     166.63
		AscendingNode   -100.693
		ArgOfPericenter -161.122
		MeanAnomaly     -2.19664
	}
}

Comet	"C49"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            1.10376e-012
	Radius          1.44705
	InertiaMoment   0.398606

	Oblateness      0.0110536

	RotationPeriod  48.579
	Obliquity       52.5264
	EqAscendNode    52.065

	AbsMagn         1.81678
	SlopeParam      6.91584
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.715 0.664 0.595)

	Surface
	{
		SurfStyle       0.77801
		OceanStyle      0.10605
		Randomize      (-0.416, 0.648, 0.206)
		colorDistMagn   0.924745
		colorDistFreq   0.00105527
		detailScale     39.5142
		colorConversion true
		snowLevel       2
		tropicLatitude  0.988475
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.390149
		terraceProb     0.253932
		erosion         0
		montesMagn      0.441396
		montesFreq      3.84127
		montesSpiky     0.979484
		montesFraction  0.505187
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00507982
		hillsFraction   0.626296
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.187764
		craterFreq      0.277458
		craterDensity   0.809581
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.586664
		volcanoTemp     1225.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.279, 0.226, 0.166, 0.000)
		colorShelf     (0.286, 0.232, 0.190, 0.000)
		colorBeach     (0.336, 0.272, 0.226, 0.000)
		colorDesert    (0.365, 0.292, 0.220, 0.000)
		colorLowland   (0.401, 0.312, 0.250, 0.000)
		colorUpland    (0.443, 0.379, 0.303, 0.000)
		colorRock      (0.479, 0.412, 0.327, 0.000)
		colorSnow      (0.522, 0.438, 0.345, 1.000)
		BumpHeight      1.30235
		BumpOffset      0.260469
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.386556
		GasToDust   0.25
		Particles   1760
		GasBright   0.0615712
		DustBright  0.149136
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   20.3086
		Period          104.717
		Eccentricity    0.977769
		Inclination     -113.026
		AscendingNode   83.192
		ArgOfPericenter 176.005
		MeanAnomaly     88.5612
	}
}

Comet	"C50"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            8.53683e-009
	Radius          32.3512
	InertiaMoment   0.396368

	Oblateness      0.0170856

	RotationPeriod  46.7696
	Obliquity       5.73211
	EqAscendNode    36.6424

	AbsMagn         10.2812
	SlopeParam      2.30459
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.612 0.610 0.607)

	Surface
	{
		SurfStyle       0.4558
		OceanStyle      0.795589
		Randomize      (-0.600, -0.102, 0.075)
		colorDistMagn   0.742978
		colorDistFreq   0.635174
		detailScale     883.403
		colorConversion true
		snowLevel       2
		tropicLatitude  0.910283
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.753765
		terraceProb     0.467286
		erosion         0
		montesMagn      0.545736
		montesFreq      2.32936
		montesSpiky     0.799225
		montesFraction  0.361409
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.74777
		hillsFraction   0.613971
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248295
		craterFreq      0.262604
		craterDensity   1.00144
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.494701
		volcanoTemp     1659.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.245, 0.244, 0.243, 0.000)
		colorShelf     (0.260, 0.259, 0.258, 0.000)
		colorBeach     (0.275, 0.274, 0.273, 0.000)
		colorDesert    (0.291, 0.290, 0.288, 0.000)
		colorLowland   (0.306, 0.305, 0.303, 0.000)
		colorUpland    (0.321, 0.320, 0.319, 0.000)
		colorRock      (0.337, 0.335, 0.334, 0.000)
		colorSnow      (0.352, 0.351, 0.349, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.867748
		GasToDust   0.25
		Particles   2732
		GasBright   0.244192
		DustBright  0.451001
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   23.4571
		Period          129.99
		Eccentricity    0.963282
		Inclination     -66.749
		AscendingNode   76.6422
		ArgOfPericenter 128.265
		MeanAnomaly     32.0095
	}
}

Comet	"C51"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            2.62855e-016
	Radius          0.0896343
	InertiaMoment   0.3991

	Oblateness      0.0129045

	RotationPeriod  44.957
	Obliquity       318.938
	EqAscendNode    21.2198

	AbsMagn         6.75723
	SlopeParam      3.01044
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.818 0.790 0.742)

	Surface
	{
		SurfStyle       0.844101
		OceanStyle      0.121807
		Randomize      (-0.730, 0.010, 0.733)
		colorDistMagn   0.278161
		colorDistFreq   2.41438e-006
		detailScale     2.44761
		colorConversion true
		snowLevel       2
		tropicLatitude  0.825144
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.704104
		terraceProb     0.229094
		erosion         0
		montesMagn      0.458935
		montesFreq      3.77876
		montesSpiky     0.930356
		montesFraction  0.790185
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.91983e-005
		hillsFraction   0.658922
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263925
		craterFreq      0.220768
		craterDensity   0.912822
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.481911
		volcanoTemp     1867.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.319, 0.269, 0.208, 0.000)
		colorShelf     (0.327, 0.277, 0.238, 0.000)
		colorBeach     (0.384, 0.324, 0.282, 0.000)
		colorDesert    (0.417, 0.348, 0.275, 0.000)
		colorLowland   (0.458, 0.371, 0.312, 0.000)
		colorUpland    (0.507, 0.450, 0.379, 0.000)
		colorRock      (0.548, 0.490, 0.408, 0.000)
		colorSnow      (0.597, 0.521, 0.431, 1.000)
		BumpHeight      0.0806708
		BumpOffset      0.0161342
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.155784
		DustBright  0.223896
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   14.3203
		Period          62.005
		Eccentricity    0.970957
		Inclination     -62.7913
		AscendingNode   112.141
		ArgOfPericenter 137.069
		MeanAnomaly     -152.228
	}
}

Comet	"C52"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            2.033e-012
	Radius          2.00029
	InertiaMoment   0.397632

	Oblateness      0.0200304

	RotationPeriod  43.1367
	Obliquity       272.144
	EqAscendNode    5.79723

	AbsMagn         1.00964
	SlopeParam      3.60876
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.630 0.494 0.406)

	Surface
	{
		SurfStyle       0.370072
		OceanStyle      0.831474
		Randomize      (-0.858, -0.834, 0.173)
		colorDistMagn   0.177592
		colorDistFreq   0.00200651
		detailScale     54.6214
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997475
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.723688
		terraceProb     0.17056
		erosion         0
		montesMagn      0.540576
		montesFreq      2.93087
		montesSpiky     0.955158
		montesFraction  0.609163
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00836102
		hillsFraction   0.391373
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24957
		craterFreq      0.203968
		craterDensity   0.748351
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.398621
		volcanoTemp     1534.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.252, 0.198, 0.162, 0.000)
		colorShelf     (0.268, 0.210, 0.173, 0.000)
		colorBeach     (0.283, 0.222, 0.183, 0.000)
		colorDesert    (0.299, 0.235, 0.193, 0.000)
		colorLowland   (0.315, 0.247, 0.203, 0.000)
		colorUpland    (0.331, 0.260, 0.213, 0.000)
		colorRock      (0.346, 0.272, 0.223, 0.000)
		colorSnow      (0.362, 0.284, 0.234, 1.000)
		BumpHeight      1.80026
		BumpOffset      0.360053
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.419382
		GasToDust   0.25
		Particles   1827
		GasBright   0.405595
		DustBright  0.458571
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   22.2764
		Period          120.3
		Eccentricity    0.985685
		Inclination     -7.10804
		AscendingNode   -29.0098
		ArgOfPericenter 65.2923
		MeanAnomaly     -77.1722
	}
}

Comet	"C53"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            1.57238e-008
	Radius          35.0319
	InertiaMoment   0.399545

	Oblateness      0.015283

	RotationPeriod  41.3039
	Obliquity       225.349
	EqAscendNode    350.375

	AbsMagn         10.0398
	SlopeParam      4.17333
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.712 0.663 0.646)

	Surface
	{
		SurfStyle       0.112436
		OceanStyle      0.0131674
		Randomize      (-0.357, 0.541, -0.900)
		colorDistMagn   0.522026
		colorDistFreq   0.798699
		detailScale     956.606
		colorConversion true
		snowLevel       2
		tropicLatitude  0.995749
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.336069
		terraceProb     0.190676
		erosion         0
		montesMagn      0.384298
		montesFreq      2.83558
		montesSpiky     0.981789
		montesFraction  0.374073
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.08279
		hillsFraction   0.575054
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237147
		craterFreq      0.214366
		craterDensity   0.955261
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.428684
		volcanoTemp     1425.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.285, 0.265, 0.258, 0.000)
		colorShelf     (0.303, 0.282, 0.275, 0.000)
		colorBeach     (0.320, 0.299, 0.291, 0.000)
		colorDesert    (0.338, 0.315, 0.307, 0.000)
		colorLowland   (0.356, 0.332, 0.323, 0.000)
		colorUpland    (0.374, 0.348, 0.339, 0.000)
		colorRock      (0.392, 0.365, 0.355, 0.000)
		colorSnow      (0.409, 0.381, 0.372, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.900574
		GasToDust   0.25
		Particles   2799
		GasBright   0.0155783
		DustBright  0.533075
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   22.7723
		Period          124.34
		Eccentricity    0.978709
		Inclination     -121.346
		AscendingNode   63.2487
		ArgOfPericenter -4.8383
		MeanAnomaly     167.875
	}
}

Comet	"C54"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            4.84147e-016
	Radius          0.123693
	InertiaMoment   0.398329

	Oblateness      0.0238372

	RotationPeriod  39.4536
	Obliquity       178.555
	EqAscendNode    334.952

	AbsMagn         6.53628
	SlopeParam      4.75236
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.516 0.460 0.382)

	Surface
	{
		SurfStyle       0.364112
		OceanStyle      0.0713283
		Randomize      (-0.652, 0.097, -0.563)
		colorDistMagn   0.663864
		colorDistFreq   6.62999e-006
		detailScale     3.37763
		colorConversion true
		snowLevel       2
		tropicLatitude  0.675942
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.586343
		terraceProb     0.303829
		erosion         0
		montesMagn      0.427193
		montesFreq      3.18358
		montesSpiky     0.907267
		montesFraction  0.372015
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.99457e-005
		hillsFraction   0.759153
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229994
		craterFreq      0.230534
		craterDensity   0.782677
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.493244
		volcanoTemp     1516.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.207, 0.184, 0.153, 0.000)
		colorShelf     (0.219, 0.195, 0.163, 0.000)
		colorBeach     (0.232, 0.207, 0.172, 0.000)
		colorDesert    (0.245, 0.218, 0.182, 0.000)
		colorLowland   (0.258, 0.230, 0.191, 0.000)
		colorUpland    (0.271, 0.241, 0.201, 0.000)
		colorRock      (0.284, 0.253, 0.210, 0.000)
		colorSnow      (0.297, 0.264, 0.220, 1.000)
		BumpHeight      0.111323
		BumpOffset      0.0222647
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0203855
		DustBright  0.212754
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   13.7879
		Period          58.5799
		Eccentricity    0.957109
		Inclination     -41.4127
		AscendingNode   40.0449
		ArgOfPericenter 87.1295
		MeanAnomaly     106.381
	}
}

Comet	"C55"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            3.74453e-012
	Radius          2.16997
	InertiaMoment   0.399967

	Oblateness      0.0184539

	RotationPeriod  37.5803
	Obliquity       131.761
	EqAscendNode    319.529

	AbsMagn         -0.260192
	SlopeParam      5.40415
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.734 0.733 0.730)

	Surface
	{
		SurfStyle       0.272173
		OceanStyle      0.0830484
		Randomize      (-0.441, -0.525, 0.929)
		colorDistMagn   0.285473
		colorDistFreq   0.00290634
		detailScale     59.2548
		colorConversion true
		snowLevel       2
		tropicLatitude  0.669678
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.572552
		terraceProb     0.391321
		erosion         0
		montesMagn      0.531075
		montesFreq      2.93768
		montesSpiky     0.890015
		montesFraction  0.189674
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0131895
		hillsFraction   0.665325
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254394
		craterFreq      0.261479
		craterDensity   0.764444
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.519952
		volcanoTemp     1365.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.294, 0.293, 0.292, 0.000)
		colorShelf     (0.312, 0.311, 0.310, 0.000)
		colorBeach     (0.330, 0.330, 0.329, 0.000)
		colorDesert    (0.349, 0.348, 0.347, 0.000)
		colorLowland   (0.367, 0.366, 0.365, 0.000)
		colorUpland    (0.386, 0.385, 0.383, 0.000)
		colorRock      (0.404, 0.403, 0.402, 0.000)
		colorSnow      (0.422, 0.421, 0.420, 1.000)
		BumpHeight      1.95298
		BumpOffset      0.390595
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.452208
		GasToDust   0.25
		Particles   1893
		GasBright   0.105121
		DustBright  0.612505
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   16.4477
		Period          76.3236
		Eccentricity    0.962955
		Inclination     -11.0136
		AscendingNode   -128.596
		ArgOfPericenter -89.6571
		MeanAnomaly     -165.539
	}
}

Comet	"C56"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            2.89612e-008
	Radius          48.2653
	InertiaMoment   0.398865

	Oblateness      0.0290084

	RotationPeriod  35.6785
	Obliquity       84.9663
	EqAscendNode    304.107

	AbsMagn         9.80561
	SlopeParam      6.25999
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.795 0.793 0.792)

	Surface
	{
		SurfStyle       0.436082
		OceanStyle      0.0448692
		Randomize      (-0.580, -0.184, 0.119)
		colorDistMagn   0.788729
		colorDistFreq   1.44864
		detailScale     1317.96
		colorConversion true
		snowLevel       2
		tropicLatitude  0.758998
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.45949
		terraceProb     0.631743
		erosion         0
		montesMagn      0.38537
		montesFreq      2.74129
		montesSpiky     0.920053
		montesFraction  0.199775
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.10676
		hillsFraction   0.783771
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260704
		craterFreq      0.19746
		craterDensity   0.896042
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.498258
		volcanoTemp     1431.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.318, 0.317, 0.317, 0.000)
		colorShelf     (0.338, 0.337, 0.337, 0.000)
		colorBeach     (0.358, 0.357, 0.357, 0.000)
		colorDesert    (0.378, 0.377, 0.376, 0.000)
		colorLowland   (0.397, 0.397, 0.396, 0.000)
		colorUpland    (0.417, 0.416, 0.416, 0.000)
		colorRock      (0.437, 0.436, 0.436, 0.000)
		colorSnow      (0.457, 0.456, 0.456, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.9334
		GasToDust   0.25
		Particles   2865
		GasBright   0.0826461
		DustBright  0.319467
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   21.6521
		Period          115.279
		Eccentricity    0.951933
		Inclination     65.4836
		AscendingNode   132.704
		ArgOfPericenter -94.6579
		MeanAnomaly     79.7006
	}
}

Comet	"C57"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            8.91739e-016
	Radius          0.134414
	InertiaMoment   0.397148

	Oblateness      0.0226058

	RotationPeriod  33.7415
	Obliquity       38.172
	EqAscendNode    288.684

	AbsMagn         6.31077
	SlopeParam      8.23248
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.430 0.425 0.422)

	Surface
	{
		SurfStyle       0.641852
		OceanStyle      0.739541
		Randomize      (0.843, 0.587, 0.228)
		colorDistMagn   0.433759
		colorDistFreq   6.89895e-006
		detailScale     3.6704
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999657
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.304522
		terraceProb     0.11174
		erosion         0
		montesMagn      0.388707
		montesFreq      3.09929
		montesSpiky     0.964389
		montesFraction  0.508732
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.59554e-005
		hillsFraction   0.716259
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.21373
		craterFreq      0.147576
		craterDensity   0.96382
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.491181
		volcanoTemp     1524.92
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.168, 0.144, 0.118, 0.000)
		colorShelf     (0.172, 0.149, 0.135, 0.000)
		colorBeach     (0.202, 0.174, 0.161, 0.000)
		colorDesert    (0.220, 0.187, 0.156, 0.000)
		colorLowland   (0.241, 0.200, 0.177, 0.000)
		colorUpland    (0.267, 0.242, 0.215, 0.000)
		colorRock      (0.288, 0.263, 0.232, 0.000)
		colorSnow      (0.314, 0.280, 0.245, 1.000)
		BumpHeight      0.120973
		BumpOffset      0.0241945
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.234572
		DustBright  0.652028
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   13.5174
		Period          56.8643
		Eccentricity    0.945708
		Inclination     116.467
		AscendingNode   132.892
		ArgOfPericenter 169.609
		MeanAnomaly     37.0413
	}
}

Comet	"C58"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            6.89695e-012
	Radius          2.98514
	InertiaMoment   0.39933

	Oblateness      0.0364262

	RotationPeriod  31.7624
	Obliquity       351.378
	EqAscendNode    273.262

	AbsMagn         17.4776
	SlopeParam      2.6734
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.496 0.490 0.485)

	Surface
	{
		SurfStyle       0.50808
		OceanStyle      0.415957
		Randomize      (-0.017, 0.825, 0.544)
		colorDistMagn   0.746294
		colorDistFreq   0.00539764
		detailScale     81.5141
		colorConversion true
		snowLevel       2
		tropicLatitude  0.452429
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.450937
		terraceProb     0.458394
		erosion         0
		montesMagn      0.501171
		montesFreq      3.0531
		montesSpiky     0.987466
		montesFraction  0.527373
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0185903
		hillsFraction   0.676986
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238079
		craterFreq      0.232422
		craterDensity   0.661866
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.506383
		volcanoTemp     1264.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.194, 0.167, 0.136, 0.000)
		colorShelf     (0.199, 0.172, 0.155, 0.000)
		colorBeach     (0.233, 0.201, 0.184, 0.000)
		colorDesert    (0.253, 0.216, 0.179, 0.000)
		colorLowland   (0.278, 0.230, 0.204, 0.000)
		colorUpland    (0.308, 0.279, 0.247, 0.000)
		colorRock      (0.333, 0.304, 0.267, 0.000)
		colorSnow      (0.362, 0.323, 0.281, 1.000)
		BumpHeight      2.68662
		BumpOffset      0.537324
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.485034
		GasToDust   0.25
		Particles   1959
		GasBright   0.184815
		DustBright  0.386271
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   18.0118
		Period          87.4652
		Eccentricity    0.952072
		Inclination     -161.583
		AscendingNode   167.584
		ArgOfPericenter 126.596
		MeanAnomaly     29.872
	}
}

Comet	"C59"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            5.33429e-008
	Radius          52.5332
	InertiaMoment   0.398015

	Oblateness      0.0291485

	RotationPeriod  29.7329
	Obliquity       304.583
	EqAscendNode    257.839

	AbsMagn         9.57743
	SlopeParam      3.31319
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.763 0.762 0.761)

	Surface
	{
		SurfStyle       0.357392
		OceanStyle      0.563908
		Randomize      (0.392, -0.493, -0.109)
		colorDistMagn   0.527261
		colorDistFreq   1.23092
		detailScale     1434.51
		colorConversion true
		snowLevel       2
		tropicLatitude  0.693952
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.629041
		terraceProb     0.148746
		erosion         0
		montesMagn      0.384269
		montesFreq      2.71264
		montesSpiky     0.989851
		montesFraction  0.382035
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.02529
		hillsFraction   0.664792
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.204189
		craterFreq      0.229631
		craterDensity   0.8252
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.477551
		volcanoTemp     1293.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.305, 0.305, 0.304, 0.000)
		colorShelf     (0.324, 0.324, 0.323, 0.000)
		colorBeach     (0.343, 0.343, 0.342, 0.000)
		colorDesert    (0.363, 0.362, 0.361, 0.000)
		colorLowland   (0.382, 0.381, 0.380, 0.000)
		colorUpland    (0.401, 0.400, 0.399, 0.000)
		colorRock      (0.420, 0.419, 0.418, 0.000)
		colorSnow      (0.439, 0.438, 0.437, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.966226
		GasToDust   0.25
		Particles   2931
		GasBright   0.0977988
		DustBright  0.157774
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   21.2916
		Period          112.412
		Eccentricity    0.967635
		Inclination     -21.2228
		AscendingNode   -129.835
		ArgOfPericenter -151.153
		MeanAnomaly     -65.5665
	}
}

Comet	"C60"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            1.64247e-015
	Radius          0.184641
	InertiaMoment   0.39976

	Oblateness      0.0478638

	RotationPeriod  27.6435
	Obliquity       257.789
	EqAscendNode    242.417

	AbsMagn         6.07976
	SlopeParam      3.88826
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.763 0.761 0.757)

	Surface
	{
		SurfStyle       0.794985
		OceanStyle      0.983537
		Randomize      (-0.582, -0.224, 0.766)
		colorDistMagn   0.118225
		colorDistFreq   1.90017e-005
		detailScale     5.04193
		colorConversion true
		snowLevel       2
		tropicLatitude  0.847747
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.525343
		terraceProb     0.258481
		erosion         0
		montesMagn      0.675642
		montesFreq      2.72054
		montesSpiky     0.9842
		montesFraction  0.669937
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.27007e-005
		hillsFraction   0.417028
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25851
		craterFreq      0.212203
		craterDensity   0.861201
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.487288
		volcanoTemp     1601.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.297, 0.259, 0.212, 0.000)
		colorShelf     (0.305, 0.266, 0.242, 0.000)
		colorBeach     (0.358, 0.312, 0.288, 0.000)
		colorDesert    (0.389, 0.335, 0.280, 0.000)
		colorLowland   (0.427, 0.358, 0.318, 0.000)
		colorUpland    (0.473, 0.434, 0.386, 0.000)
		colorRock      (0.511, 0.472, 0.417, 0.000)
		colorSnow      (0.557, 0.502, 0.439, 1.000)
		BumpHeight      0.166177
		BumpOffset      0.0332354
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0366676
		GasToDust   0.25
		Particles   1053
		GasBright   0.326892
		DustBright  0.413167
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   16.829
		Period          78.9926
		Eccentricity    0.9698
		Inclination     -158.007
		AscendingNode   -155.964
		ArgOfPericenter -64.1408
		MeanAnomaly     -124.329
	}
}

Comet	"C61"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            1.27033e-011
	Radius          3.25405
	InertiaMoment   0.398613

	Oblateness      0.0396902

	RotationPeriod  25.4832
	Obliquity       210.995
	EqAscendNode    226.994

	AbsMagn         15.5399
	SlopeParam      4.45406
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.726 0.724 0.721)

	Surface
	{
		SurfStyle       0.0281212
		OceanStyle      0.736443
		Randomize      (0.086, -0.317, 0.292)
		colorDistMagn   0.790763
		colorDistFreq   0.00455985
		detailScale     88.8571
		colorConversion true
		snowLevel       2
		tropicLatitude  0.144975
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.402203
		terraceProb     0.180596
		erosion         0
		montesMagn      0.634178
		montesFreq      2.43444
		montesSpiky     0.993753
		montesFraction  0.625638
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0254226
		hillsFraction   0.748866
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.267802
		craterFreq      0.212
		craterDensity   0.946466
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.536123
		volcanoTemp     1497.92
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.291, 0.290, 0.288, 0.000)
		colorShelf     (0.309, 0.308, 0.306, 0.000)
		colorBeach     (0.327, 0.326, 0.324, 0.000)
		colorDesert    (0.345, 0.344, 0.342, 0.000)
		colorLowland   (0.363, 0.362, 0.360, 0.000)
		colorUpland    (0.381, 0.380, 0.378, 0.000)
		colorRock      (0.400, 0.398, 0.396, 0.000)
		colorSnow      (0.418, 0.416, 0.414, 1.000)
		BumpHeight      2.92864
		BumpOffset      0.585728
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.51786
		GasToDust   0.25
		Particles   2025
		GasBright   0.000320865
		DustBright  0.424225
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   18.1192
		Period          88.2483
		Eccentricity    0.970338
		Inclination     24.3398
		AscendingNode   169.104
		ArgOfPericenter 177.283
		MeanAnomaly     72.6562
	}
}

Comet	"C62"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            9.82509e-008
	Radius          72.0651
	InertiaMoment   0.396395

	Oblateness      0.0664729

	RotationPeriod  23.2386
	Obliquity       164.201
	EqAscendNode    211.571

	AbsMagn         9.35428
	SlopeParam      5.05961
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.617 0.614 0.609)

	Surface
	{
		SurfStyle       0.982813
		OceanStyle      0.511086
		Randomize      (-0.237, -0.693, -0.888)
		colorDistMagn   0.345086
		colorDistFreq   3.42409
		detailScale     1967.86
		colorConversion true
		snowLevel       2
		tropicLatitude  0.6076
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.729453
		terraceProb     0.276265
		erosion         0
		montesMagn      0.224416
		montesFreq      2.88466
		montesSpiky     0.944501
		montesFraction  0.384475
		dunesFraction   0
		hillsMagn       0
		hillsFreq       12.9448
		hillsFraction   0.557787
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225754
		craterFreq      0.262922
		craterDensity   0.951408
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.592443
		volcanoTemp     1461.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.210, 0.215, 0.244, 0.050)
		colorShelf     (0.247, 0.252, 0.280, 0.040)
		colorBeach     (0.284, 0.288, 0.317, 0.030)
		colorDesert    (0.321, 0.325, 0.359, 0.020)
		colorLowland   (0.358, 0.362, 0.396, 0.030)
		colorUpland    (0.395, 0.399, 0.432, 0.050)
		colorRock      (0.432, 0.436, 0.481, 0.020)
		colorSnow      (0.432, 0.436, 0.481, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.999052
		GasToDust   0.25
		Particles   2998
		GasBright   0.0543611
		DustBright  0.854671
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   18.0407
		Period          87.6759
		Eccentricity    0.94792
		Inclination     33.1616
		AscendingNode   -94.3367
		ArgOfPericenter -157.892
		MeanAnomaly     41.7057
	}
}

Comet	"C63"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            3.02522e-015
	Radius          0.201564
	InertiaMoment   0.399106

	Oblateness      0.0590352

	RotationPeriod  20.8933
	Obliquity       117.406
	EqAscendNode    196.149

	AbsMagn         5.84215
	SlopeParam      5.78512
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.720 0.719 0.716)

	Surface
	{
		SurfStyle       0.733524
		OceanStyle      0.602543
		Randomize      (-0.655, -0.291, -0.697)
		colorDistMagn   0.0135375
		colorDistFreq   2.09877e-005
		detailScale     5.50404
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997801
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.615903
		terraceProb     0.207907
		erosion         0
		montesMagn      0.512369
		montesFreq      2.95811
		montesSpiky     0.994611
		montesFraction  0.443694
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00011048
		hillsFraction   0.653016
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24843
		craterFreq      0.212482
		craterDensity   0.916772
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.471638
		volcanoTemp     1288.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.281, 0.244, 0.201, 0.000)
		colorShelf     (0.288, 0.251, 0.229, 0.000)
		colorBeach     (0.338, 0.295, 0.272, 0.000)
		colorDesert    (0.367, 0.316, 0.265, 0.000)
		colorLowland   (0.403, 0.338, 0.301, 0.000)
		colorUpland    (0.446, 0.410, 0.365, 0.000)
		colorRock      (0.482, 0.445, 0.394, 0.000)
		colorSnow      (0.525, 0.474, 0.416, 1.000)
		BumpHeight      0.181408
		BumpOffset      0.0362815
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0694937
		GasToDust   0.25
		Particles   1120
		GasBright   0.0705375
		DustBright  0.522981
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   15.943
		Period          72.8374
		Eccentricity    0.959916
		Inclination     -23.8479
		AscendingNode   8.78473
		ArgOfPericenter 4.44228
		MeanAnomaly     -24.6818
	}
}

Comet	"C64"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            2.33979e-011
	Radius          4.45812
	InertiaMoment   0.397642

	Oblateness      0.105593

	RotationPeriod  18.4268
	Obliquity       70.612
	EqAscendNode    180.726

	AbsMagn         14.5591
	SlopeParam      6.89369
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.700 0.697 0.693)

	Surface
	{
		SurfStyle       0.0341115
		OceanStyle      0.699628
		Randomize      (0.013, -0.994, -0.776)
		colorDistMagn   0.981965
		colorDistFreq   0.00676487
		detailScale     121.736
		colorConversion true
		snowLevel       2
		tropicLatitude  0.970684
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.332066
		terraceProb     0.340564
		erosion         0
		montesMagn      0.443075
		montesFreq      3.58245
		montesSpiky     0.874742
		montesFraction  0.422911
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0416235
		hillsFraction   0.645687
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234591
		craterFreq      0.278247
		craterDensity   0.947773
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.492792
		volcanoTemp     1657.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.280, 0.279, 0.277, 0.000)
		colorShelf     (0.298, 0.296, 0.294, 0.000)
		colorBeach     (0.315, 0.314, 0.312, 0.000)
		colorDesert    (0.333, 0.331, 0.329, 0.000)
		colorLowland   (0.350, 0.349, 0.346, 0.000)
		colorUpland    (0.368, 0.366, 0.364, 0.000)
		colorRock      (0.385, 0.383, 0.381, 0.000)
		colorSnow      (0.403, 0.401, 0.398, 1.000)
		BumpHeight      4.01231
		BumpOffset      0.802461
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.550686
		GasToDust   0.25
		Particles   2092
		GasBright   0.0494548
		DustBright  0.228551
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   15.3495
		Period          68.8084
		Eccentricity    0.944925
		Inclination     116.298
		AscendingNode   -83.6669
		ArgOfPericenter 126.527
		MeanAnomaly     5.0581
	}
}

Comet	"C65"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            1.80966e-007
	Radius          78.7775
	InertiaMoment   0.39955

	Oblateness      0.103026

	RotationPeriod  15.8129
	Obliquity       23.8177
	EqAscendNode    165.304

	AbsMagn         9.13527
	SlopeParam      2.29351
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.787 0.786 0.784)

	Surface
	{
		SurfStyle       0.757788
		OceanStyle      0.478725
		Randomize      (-0.530, 0.737, -0.291)
		colorDistMagn   0.58067
		colorDistFreq   3.7652
		detailScale     2151.15
		colorConversion true
		snowLevel       2
		tropicLatitude  0.995666
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.564666
		terraceProb     0.238619
		erosion         0
		montesMagn      0.449049
		montesFreq      3.12562
		montesSpiky     0.983921
		montesFraction  0.877825
		dunesFraction   0
		hillsMagn       0
		hillsFreq       14.2534
		hillsFraction   0.601803
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251534
		craterFreq      0.211163
		craterDensity   0.990079
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.550986
		volcanoTemp     1784.53
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.307, 0.267, 0.219, 0.000)
		colorShelf     (0.315, 0.275, 0.251, 0.000)
		colorBeach     (0.370, 0.322, 0.298, 0.000)
		colorDesert    (0.401, 0.346, 0.290, 0.000)
		colorLowland   (0.441, 0.369, 0.329, 0.000)
		colorUpland    (0.488, 0.448, 0.400, 0.000)
		colorRock      (0.527, 0.487, 0.431, 0.000)
		colorSnow      (0.575, 0.519, 0.455, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.180662
		DustBright  0.58183
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   21.9416
		Period          117.599
		Eccentricity    0.975711
		Inclination     98.1119
		AscendingNode   123.746
		ArgOfPericenter -70.4046
		MeanAnomaly     -13.4908
	}
}

Comet	"C66"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            5.57206e-015
	Radius          0.275807
	InertiaMoment   0.398336

	Oblateness      0.210932

	RotationPeriod  13.0173
	Obliquity       337.023
	EqAscendNode    149.881

	AbsMagn         5.59667
	SlopeParam      3.00171
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.750 0.745 0.742)

	Surface
	{
		SurfStyle       0.911516
		OceanStyle      0.27661
		Randomize      (-0.141, 0.059, -0.216)
		colorDistMagn   0.856488
		colorDistFreq   4.32273e-005
		detailScale     7.53136
		colorConversion true
		snowLevel       2
		tropicLatitude  0.955463
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.542678
		terraceProb     0.191465
		erosion         0
		montesMagn      0.408332
		montesFreq      3.92512
		montesSpiky     0.884847
		montesFraction  0.456274
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000210292
		hillsFraction   0.521386
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236785
		craterFreq      0.19208
		craterDensity   0.974348
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.505108
		volcanoTemp     1227.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.255, 0.261, 0.297, 0.050)
		colorShelf     (0.300, 0.305, 0.341, 0.040)
		colorBeach     (0.345, 0.350, 0.386, 0.030)
		colorDesert    (0.390, 0.395, 0.438, 0.020)
		colorLowland   (0.435, 0.439, 0.482, 0.030)
		colorUpland    (0.480, 0.484, 0.527, 0.050)
		colorRock      (0.525, 0.529, 0.586, 0.020)
		colorSnow      (0.525, 0.529, 0.586, 1.000)
		BumpHeight      0.248226
		BumpOffset      0.0496452
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.102319
		GasToDust   0.25
		Particles   1186
		GasBright   0.132298
		DustBright  0.314681
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   18.1468
		Period          88.4505
		Eccentricity    0.983261
		Inclination     100.78
		AscendingNode   108.696
		ArgOfPericenter 33.2131
		MeanAnomaly     14.4236
	}
}

Comet	"C67"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            4.30959e-011
	Radius          4.87967
	InertiaMoment   0.399972

	Oblateness      0.249

	RotationPeriod  9.99298
	Obliquity       290.229
	EqAscendNode    134.458

	AbsMagn         13.8637
	SlopeParam      3.60089
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.790 0.745 0.722)

	Surface
	{
		SurfStyle       0.147742
		OceanStyle      0.248513
		Randomize      (-0.917, 0.833, -0.797)
		colorDistMagn   0.523053
		colorDistFreq   0.0149708
		detailScale     133.248
		colorConversion true
		snowLevel       2
		tropicLatitude  0.718613
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.57803
		terraceProb     0.201639
		erosion         0
		montesMagn      0.640292
		montesFreq      3.09635
		montesSpiky     0.822774
		montesFraction  0.200122
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0609296
		hillsFraction   0.606521
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24157
		craterFreq      0.191243
		craterDensity   0.8137
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.527284
		volcanoTemp     1478.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.316, 0.298, 0.289, 0.000)
		colorShelf     (0.336, 0.317, 0.307, 0.000)
		colorBeach     (0.355, 0.335, 0.325, 0.000)
		colorDesert    (0.375, 0.354, 0.343, 0.000)
		colorLowland   (0.395, 0.373, 0.361, 0.000)
		colorUpland    (0.415, 0.391, 0.379, 0.000)
		colorRock      (0.434, 0.410, 0.397, 0.000)
		colorSnow      (0.454, 0.428, 0.415, 1.000)
		BumpHeight      4.39171
		BumpOffset      0.878341
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.583511
		GasToDust   0.25
		Particles   2158
		GasBright   0.330696
		DustBright  0.60077
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   14.6265
		Period          64.0046
		Eccentricity    0.931601
		Inclination     143.846
		AscendingNode   138.754
		ArgOfPericenter -26.2836
		MeanAnomaly     166.191
	}
}

Comet	"C68"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            3.33317e-007
	Radius          107.667
	InertiaMoment   0.398871

	Oblateness      0.249

	RotationPeriod  6.67343
	Obliquity       243.435
	EqAscendNode    119.036

	AbsMagn         8.91961
	SlopeParam      4.16559
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.541 0.537 0.533)

	Surface
	{
		SurfStyle       0.36706
		OceanStyle      0.806724
		Randomize      (0.654, -0.343, 0.589)
		colorDistMagn   0.612154
		colorDistFreq   6.04511
		detailScale     2940.04
		colorConversion true
		snowLevel       2
		tropicLatitude  0.937892
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.639493
		terraceProb     0.419437
		erosion         0
		montesMagn      0.493455
		montesFreq      2.38955
		montesSpiky     0.977276
		montesFraction  0.331026
		dunesFraction   0
		hillsMagn       0
		hillsFreq       35.0345
		hillsFraction   0.833674
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224781
		craterFreq      0.295133
		craterDensity   0.948356
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.599407
		volcanoTemp     1578.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.216, 0.215, 0.213, 0.000)
		colorShelf     (0.230, 0.228, 0.227, 0.000)
		colorBeach     (0.243, 0.242, 0.240, 0.000)
		colorDesert    (0.257, 0.255, 0.253, 0.000)
		colorLowland   (0.271, 0.268, 0.267, 0.000)
		colorUpland    (0.284, 0.282, 0.280, 0.000)
		colorRock      (0.298, 0.295, 0.293, 0.000)
		colorSnow      (0.311, 0.309, 0.307, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.255049
		DustBright  0.360903
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   19.1842
		Period          96.1423
		Eccentricity    0.957901
		Inclination     -18.9351
		AscendingNode   105.198
		ArgOfPericenter -137.62
		MeanAnomaly     -138.248
	}
}

Comet	"C69"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            1.02631e-014
	Radius          0.302259
	InertiaMoment   0.397163

	Oblateness      0.249

	RotationPeriod  2.95939
	Obliquity       196.64
	EqAscendNode    103.613

	AbsMagn         5.34177
	SlopeParam      4.74408
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.701 0.699 0.697)

	Surface
	{
		SurfStyle       0.0947745
		OceanStyle      0.693636
		Randomize      (-0.086, 0.654, 0.735)
		colorDistMagn   0.632944
		colorDistFreq   1.80407e-005
		detailScale     8.25369
		colorConversion true
		snowLevel       2
		tropicLatitude  0.903796
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.538347
		terraceProb     0.434914
		erosion         0
		montesMagn      0.615832
		montesFreq      3.04461
		montesSpiky     0.972314
		montesFraction  0.346367
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000263446
		hillsFraction   0.676826
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258886
		craterFreq      0.176811
		craterDensity   1.07642
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.494301
		volcanoTemp     1434.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.280, 0.280, 0.279, 0.000)
		colorShelf     (0.298, 0.297, 0.296, 0.000)
		colorBeach     (0.315, 0.315, 0.313, 0.000)
		colorDesert    (0.333, 0.332, 0.331, 0.000)
		colorLowland   (0.351, 0.350, 0.348, 0.000)
		colorUpland    (0.368, 0.367, 0.366, 0.000)
		colorRock      (0.386, 0.385, 0.383, 0.000)
		colorSnow      (0.403, 0.402, 0.400, 1.000)
		BumpHeight      0.272033
		BumpOffset      0.0544067
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.135145
		GasToDust   0.25
		Particles   1252
		GasBright   0.142143
		DustBright  0.158296
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   20.3652
		Period          105.155
		Eccentricity    0.980473
		Inclination     -51.9616
		AscendingNode   136.066
		ArgOfPericenter 153.934
		MeanAnomaly     -161.914
	}
}

Comet	"C70"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            7.93774e-011
	Radius          6.66174
	InertiaMoment   0.399335

	Oblateness      0.00230364

	RotationPeriod  124.117
	Obliquity       149.846
	EqAscendNode    88.1906

	AbsMagn         13.3107
	SlopeParam      5.3943
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.424 0.420 0.415)

	Surface
	{
		SurfStyle       0.996574
		OceanStyle      0.00358415
		Randomize      (-0.035, 0.613, -0.990)
		colorDistMagn   0.433479
		colorDistFreq   0.0185276
		detailScale     181.91
		colorConversion true
		snowLevel       2
		tropicLatitude  0.594989
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.399919
		terraceProb     0.164671
		erosion         0
		montesMagn      0.634418
		montesFreq      2.22059
		montesSpiky     0.929111
		montesFraction  0.605305
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0827538
		hillsFraction   0.584009
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.279317
		craterFreq      0.25277
		craterDensity   0.989241
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.524478
		volcanoTemp     1698.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.144, 0.147, 0.166, 0.050)
		colorShelf     (0.170, 0.172, 0.191, 0.040)
		colorBeach     (0.195, 0.197, 0.216, 0.030)
		colorDesert    (0.221, 0.222, 0.245, 0.020)
		colorLowland   (0.246, 0.248, 0.270, 0.030)
		colorUpland    (0.271, 0.273, 0.295, 0.050)
		colorRock      (0.297, 0.298, 0.328, 0.020)
		colorSnow      (0.297, 0.298, 0.328, 1.000)
		BumpHeight      5.99556
		BumpOffset      1.19911
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.616337
		GasToDust   0.25
		Particles   2224
		GasBright   0.0252456
		DustBright  0.759679
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   16.5722
		Period          77.1918
		Eccentricity    0.964836
		Inclination     -20.7297
		AscendingNode   -88.3992
		ArgOfPericenter -153.941
		MeanAnomaly     106.388
	}
}

Comet	"C71"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            6.13927e-007
	Radius          118.132
	InertiaMoment   0.398024

	Oblateness      0.00202285

	RotationPeriod  112.189
	Obliquity       103.052
	EqAscendNode    72.768

	AbsMagn         8.7066
	SlopeParam      6.24544
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.521 0.516 0.513)

	Surface
	{
		SurfStyle       0.845456
		OceanStyle      0.159277
		Randomize      (0.320, -0.234, 0.354)
		colorDistMagn   0.390734
		colorDistFreq   4.91353
		detailScale     3225.79
		colorConversion true
		snowLevel       2
		tropicLatitude  0.890499
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.3793
		terraceProb     0.294216
		erosion         0
		montesMagn      0.683116
		montesFreq      2.6193
		montesSpiky     0.892335
		montesFraction  0.886249
		dunesFraction   0
		hillsMagn       0
		hillsFreq       30.3075
		hillsFraction   0.750945
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.205469
		craterFreq      0.534955
		craterDensity   1.00409
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.513149
		volcanoTemp     1274.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.203, 0.175, 0.144, 0.000)
		colorShelf     (0.208, 0.181, 0.164, 0.000)
		colorBeach     (0.245, 0.211, 0.195, 0.000)
		colorDesert    (0.266, 0.227, 0.190, 0.000)
		colorLowland   (0.292, 0.242, 0.216, 0.000)
		colorUpland    (0.323, 0.294, 0.262, 0.000)
		colorRock      (0.349, 0.320, 0.282, 0.000)
		colorSnow      (0.380, 0.340, 0.298, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0428142
		DustBright  0.426597
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   17.6653
		Period          84.9536
		Eccentricity    0.963892
		Inclination     -139.742
		AscendingNode   175.199
		ArgOfPericenter 0.483516
		MeanAnomaly     -49.9283
	}
}

Comet	"C72"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            1.89033e-014
	Radius          0.412205
	InertiaMoment   0.399765

	Oblateness      0.00322013

	RotationPeriod  104.79
	Obliquity       56.2576
	EqAscendNode    57.3454

	AbsMagn         5.0756
	SlopeParam      8.16268
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.639 0.634 0.632)

	Surface
	{
		SurfStyle       0.318088
		OceanStyle      0.0956317
		Randomize      (-0.436, 0.339, -0.661)
		colorDistMagn   0.782717
		colorDistFreq   2.72418e-005
		detailScale     11.2559
		colorConversion true
		snowLevel       2
		tropicLatitude  0.890381
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.432765
		terraceProb     0.509104
		erosion         0
		montesMagn      0.542978
		montesFreq      2.86329
		montesSpiky     0.892301
		montesFraction  0.312752
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000461922
		hillsFraction   0.563984
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264739
		craterFreq      0.242576
		craterDensity   0.971873
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.470317
		volcanoTemp     1326.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.256, 0.254, 0.253, 0.000)
		colorShelf     (0.272, 0.269, 0.269, 0.000)
		colorBeach     (0.288, 0.285, 0.284, 0.000)
		colorDesert    (0.304, 0.301, 0.300, 0.000)
		colorLowland   (0.320, 0.317, 0.316, 0.000)
		colorUpland    (0.335, 0.333, 0.332, 0.000)
		colorRock      (0.351, 0.349, 0.347, 0.000)
		colorSnow      (0.367, 0.364, 0.363, 1.000)
		BumpHeight      0.370984
		BumpOffset      0.0741969
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.167971
		GasToDust   0.25
		Particles   1319
		GasBright   0.143327
		DustBright  0.810571
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   13.0617
		Period          54.0128
		Eccentricity    0.933173
		Inclination     -89.7505
		AscendingNode   -57.0074
		ArgOfPericenter 126.305
		MeanAnomaly     -8.28721
	}
}

Comet	"C73"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            1.46203e-010
	Radius          7.31739
	InertiaMoment   0.39862

	Oblateness      0.00258662

	RotationPeriod  99.2231
	Obliquity       9.46328
	EqAscendNode    41.9228

	AbsMagn         12.8439
	SlopeParam      2.66377
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.687 0.685 0.683)

	Surface
	{
		SurfStyle       0.401242
		OceanStyle      0.875781
		Randomize      (-0.063, 0.494, 0.627)
		colorDistMagn   0.110475
		colorDistFreq   0.0158732
		detailScale     199.813
		colorConversion true
		snowLevel       2
		tropicLatitude  0.835763
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.321171
		terraceProb     0.150962
		erosion         0
		montesMagn      0.558261
		montesFreq      2.7391
		montesSpiky     0.967018
		montesFraction  0.339286
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.139832
		hillsFraction   0.56774
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257923
		craterFreq      0.272675
		craterDensity   0.926985
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.489117
		volcanoTemp     1736.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.275, 0.274, 0.273, 0.000)
		colorShelf     (0.292, 0.291, 0.290, 0.000)
		colorBeach     (0.309, 0.308, 0.307, 0.000)
		colorDesert    (0.326, 0.325, 0.324, 0.000)
		colorLowland   (0.344, 0.342, 0.342, 0.000)
		colorUpland    (0.361, 0.360, 0.359, 0.000)
		colorRock      (0.378, 0.377, 0.376, 0.000)
		colorSnow      (0.395, 0.394, 0.393, 1.000)
		BumpHeight      6.58565
		BumpOffset      1.31713
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.649163
		GasToDust   0.25
		Particles   2291
		GasBright   0.133613
		DustBright  0.504772
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   14.7571
		Period          64.8635
		Eccentricity    0.987504
		Inclination     -58.7122
		AscendingNode   -74.8078
		ArgOfPericenter -103.837
		MeanAnomaly     -32.9326
	}
}

Comet	"C74"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            4.50171e-018
	Radius          0.025507
	InertiaMoment   0.396421

	Oblateness      0.0038768

	RotationPeriod  94.6667
	Obliquity       322.669
	EqAscendNode    26.5002

	AbsMagn         8.49557
	SlopeParam      3.305
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.769 0.768 0.766)

	Surface
	{
		SurfStyle       0.513025
		OceanStyle      0.73807
		Randomize      (-0.666, 0.112, 0.223)
		colorDistMagn   0.270622
		colorDistFreq   2.67025e-007
		detailScale     0.696511
		colorConversion true
		snowLevel       2
		tropicLatitude  0.602764
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.604117
		terraceProb     0.218893
		erosion         0
		montesMagn      0.270103
		montesFreq      3.49367
		montesSpiky     0.84948
		montesFraction  0.802292
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.61321e-006
		hillsFraction   0.82132
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.26172
		craterFreq      0.20082
		craterDensity   1.00172
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.524262
		volcanoTemp     1446.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.300, 0.261, 0.214, 0.000)
		colorShelf     (0.308, 0.269, 0.245, 0.000)
		colorBeach     (0.361, 0.315, 0.291, 0.000)
		colorDesert    (0.392, 0.338, 0.283, 0.000)
		colorLowland   (0.431, 0.361, 0.322, 0.000)
		colorUpland    (0.477, 0.438, 0.390, 0.000)
		colorRock      (0.515, 0.476, 0.421, 0.000)
		colorSnow      (0.561, 0.507, 0.444, 1.000)
		BumpHeight      0.0229563
		BumpOffset      0.00459126
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0866406
		DustBright  0.236231
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   19.8471
		Period          101.169
		Eccentricity    0.972174
		Inclination     -170.829
		AscendingNode   82.3067
		ArgOfPericenter 35.8954
		MeanAnomaly     -25.7176
	}
}

Comet	"C75"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            3.48174e-014
	Radius          0.453255
	InertiaMoment   0.399112

	Oblateness      0.00309127

	RotationPeriod  90.7555
	Obliquity       275.875
	EqAscendNode    11.0777

	AbsMagn         4.79579
	SlopeParam      3.88053
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.677 0.671 0.668)

	Surface
	{
		SurfStyle       0.237357
		OceanStyle      0.365634
		Randomize      (-0.531, 0.359, -0.186)
		colorDistMagn   0.386885
		colorDistFreq   0.000102618
		detailScale     12.3769
		colorConversion true
		snowLevel       2
		tropicLatitude  0.53639
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.452762
		terraceProb     0.236889
		erosion         0
		montesMagn      0.454841
		montesFreq      2.35422
		montesSpiky     0.89351
		montesFraction  0.432178
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000474087
		hillsFraction   0.728067
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.200856
		craterFreq      0.153404
		craterDensity   0.85962
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.511669
		volcanoTemp     1058.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.271, 0.268, 0.267, 0.000)
		colorShelf     (0.288, 0.285, 0.284, 0.000)
		colorBeach     (0.304, 0.302, 0.301, 0.000)
		colorDesert    (0.321, 0.319, 0.317, 0.000)
		colorLowland   (0.338, 0.335, 0.334, 0.000)
		colorUpland    (0.355, 0.352, 0.351, 0.000)
		colorRock      (0.372, 0.369, 0.367, 0.000)
		colorSnow      (0.389, 0.386, 0.384, 1.000)
		BumpHeight      0.40793
		BumpOffset      0.0815859
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.200797
		GasToDust   0.25
		Particles   1385
		GasBright   0.26432
		DustBright  0.543037
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   17.8648
		Period          86.3967
		Eccentricity    0.969275
		Inclination     81.9515
		AscendingNode   -150.624
		ArgOfPericenter -81.7158
		MeanAnomaly     96.4271
	}
}

Comet	"C76"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            2.69288e-010
	Radius          9.9592
	InertiaMoment   0.397653

	Oblateness      0.00455799

	RotationPeriod  87.2928
	Obliquity       229.08
	EqAscendNode    355.655

	AbsMagn         12.4352
	SlopeParam      4.44615
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.821 0.795 0.771)

	Surface
	{
		SurfStyle       0.981691
		OceanStyle      0.127696
		Randomize      (-0.643, -0.104, -0.640)
		colorDistMagn   0.0610068
		colorDistFreq   0.0715326
		detailScale     271.953
		colorConversion true
		snowLevel       2
		tropicLatitude  0.705915
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.372388
		terraceProb     0.385958
		erosion         0
		montesMagn      0.643662
		montesFreq      2.80885
		montesSpiky     0.971175
		montesFraction  0.616612
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.132979
		hillsFraction   0.612853
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.216874
		craterFreq      0.197244
		craterDensity   0.989363
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.446672
		volcanoTemp     1421.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.279, 0.278, 0.309, 0.050)
		colorShelf     (0.329, 0.326, 0.355, 0.040)
		colorBeach     (0.378, 0.374, 0.401, 0.030)
		colorDesert    (0.427, 0.422, 0.455, 0.020)
		colorLowland   (0.476, 0.469, 0.501, 0.030)
		colorUpland    (0.526, 0.517, 0.548, 0.050)
		colorRock      (0.575, 0.565, 0.609, 0.020)
		colorSnow      (0.575, 0.565, 0.609, 1.000)
		BumpHeight      8.96328
		BumpOffset      1.79266
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.681989
		GasToDust   0.25
		Particles   2357
		GasBright   0.190066
		DustBright  0.301779
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   19.4901
		Period          98.4514
		Eccentricity    0.975528
		Inclination     161.597
		AscendingNode   -68.664
		ArgOfPericenter -78.4612
		MeanAnomaly     -134.529
	}
}

Comet	"C77"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            8.29157e-018
	Radius          0.0280757
	InertiaMoment   0.399555

	Oblateness      0.00359347

	RotationPeriod  84.16
	Obliquity       182.286
	EqAscendNode    340.232

	AbsMagn         8.28592
	SlopeParam      5.05074
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.502 0.430 0.349)

	Surface
	{
		SurfStyle       0.717244
		OceanStyle      0.666326
		Randomize      (0.270, 0.312, 0.777)
		colorDistMagn   0.79116
		colorDistFreq   6.24248e-007
		detailScale     0.766653
		colorConversion true
		snowLevel       2
		tropicLatitude  0.550209
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.446706
		terraceProb     0.274557
		erosion         0
		montesMagn      0.474235
		montesFreq      3.75693
		montesSpiky     0.93778
		montesFraction  0.318889
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.26093e-006
		hillsFraction   0.692728
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233053
		craterFreq      0.204344
		craterDensity   0.903716
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.507504
		volcanoTemp     1613.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.196, 0.146, 0.098, 0.000)
		colorShelf     (0.201, 0.150, 0.112, 0.000)
		colorBeach     (0.236, 0.176, 0.133, 0.000)
		colorDesert    (0.256, 0.189, 0.129, 0.000)
		colorLowland   (0.281, 0.202, 0.147, 0.000)
		colorUpland    (0.311, 0.245, 0.178, 0.000)
		colorRock      (0.336, 0.266, 0.192, 0.000)
		colorSnow      (0.366, 0.284, 0.203, 1.000)
		BumpHeight      0.0252681
		BumpOffset      0.00505362
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.434936
		DustBright  0.541395
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   28.8319
		Period          177.137
		Eccentricity    0.978997
		Inclination     -35.5572
		AscendingNode   -17.3636
		ArgOfPericenter 143.125
		MeanAnomaly     -154.171
	}
}

Comet	"C78"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            6.41293e-014
	Radius          0.616323
	InertiaMoment   0.398344

	Oblateness      0.00524572

	RotationPeriod  81.2795
	Obliquity       135.492
	EqAscendNode    324.81

	AbsMagn         4.49934
	SlopeParam      5.77365
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.643 0.639 0.637)

	Surface
	{
		SurfStyle       0.822534
		OceanStyle      0.931591
		Randomize      (0.555, 0.685, 0.099)
		colorDistMagn   0.491925
		colorDistFreq   0.000168549
		detailScale     16.8297
		colorConversion true
		snowLevel       2
		tropicLatitude  0.970697
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.638307
		terraceProb     0.144583
		erosion         0
		montesMagn      0.543668
		montesFreq      3.86771
		montesSpiky     0.932021
		montesFraction  0.540181
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000980504
		hillsFraction   0.713109
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255735
		craterFreq      0.209256
		craterDensity   1.05022
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.452709
		volcanoTemp     1699.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.251, 0.217, 0.178, 0.000)
		colorShelf     (0.257, 0.224, 0.204, 0.000)
		colorBeach     (0.302, 0.262, 0.242, 0.000)
		colorDesert    (0.328, 0.281, 0.236, 0.000)
		colorLowland   (0.360, 0.300, 0.267, 0.000)
		colorUpland    (0.399, 0.364, 0.325, 0.000)
		colorRock      (0.431, 0.396, 0.350, 0.000)
		colorSnow      (0.469, 0.422, 0.369, 1.000)
		BumpHeight      0.554691
		BumpOffset      0.110938
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.233623
		GasToDust   0.25
		Particles   1451
		GasBright   0.00299028
		DustBright  0.657827
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   21.7048
		Period          115.7
		Eccentricity    0.952867
		Inclination     -123.941
		AscendingNode   -105.751
		ArgOfPericenter 109.573
		MeanAnomaly     145.609
	}
}

Comet	"C79"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            4.95995e-010
	Radius          10.9728
	InertiaMoment   0.399978

	Oblateness      0.00411824

	RotationPeriod  78.5978
	Obliquity       88.6975
	EqAscendNode    309.387

	AbsMagn         12.0682
	SlopeParam      6.87189
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.551 0.548 0.544)

	Surface
	{
		SurfStyle       0.364334
		OceanStyle      0.909236
		Randomize      (-0.127, -0.092, 0.860)
		colorDistMagn   0.588755
		colorDistFreq   0.085273
		detailScale     299.63
		colorConversion true
		snowLevel       2
		tropicLatitude  0.993888
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.63941
		terraceProb     0.24505
		erosion         0
		montesMagn      0.507907
		montesFreq      3.4251
		montesSpiky     0.970589
		montesFraction  0.328256
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.228033
		hillsFraction   0.748079
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254134
		craterFreq      0.227574
		craterDensity   1.06702
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.490194
		volcanoTemp     1364.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.221, 0.219, 0.218, 0.000)
		colorShelf     (0.234, 0.233, 0.231, 0.000)
		colorBeach     (0.248, 0.247, 0.245, 0.000)
		colorDesert    (0.262, 0.260, 0.258, 0.000)
		colorLowland   (0.276, 0.274, 0.272, 0.000)
		colorUpland    (0.289, 0.288, 0.285, 0.000)
		colorRock      (0.303, 0.301, 0.299, 0.000)
		colorSnow      (0.317, 0.315, 0.313, 1.000)
		BumpHeight      9.8755
		BumpOffset      1.9751
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.714815
		GasToDust   0.25
		Particles   2423
		GasBright   0.0219511
		DustBright  0.323353
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   14.7732
		Period          64.9699
		Eccentricity    0.951013
		Inclination     -53.8468
		AscendingNode   -98.822
		ArgOfPericenter -107.114
		MeanAnomaly     113.668
	}
}

Comet	"C80"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            1.52721e-017
	Radius          0.0381425
	InertiaMoment   0.398877

	Oblateness      0.00597179

	RotationPeriod  76.076
	Obliquity       41.9032
	EqAscendNode    293.965

	AbsMagn         8.07704
	SlopeParam      2.28238
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.689 0.686 0.682)

	Surface
	{
		SurfStyle       0.0605111
		OceanStyle      0.446293
		Randomize      (0.874, 0.845, 0.632)
		colorDistMagn   0.878648
		colorDistFreq   1.05911e-006
		detailScale     1.04155
		colorConversion true
		snowLevel       2
		tropicLatitude  0.727114
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.66719
		terraceProb     0.310251
		erosion         0
		montesMagn      0.52978
		montesFreq      2.53814
		montesSpiky     0.869777
		montesFraction  0.899388
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.1179e-006
		hillsFraction   0.726775
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235568
		craterFreq      0.271509
		craterDensity   1.07291
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.559026
		volcanoTemp     1418.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.276, 0.274, 0.273, 0.000)
		colorShelf     (0.293, 0.291, 0.290, 0.000)
		colorBeach     (0.310, 0.309, 0.307, 0.000)
		colorDesert    (0.327, 0.326, 0.324, 0.000)
		colorLowland   (0.344, 0.343, 0.341, 0.000)
		colorUpland    (0.362, 0.360, 0.358, 0.000)
		colorRock      (0.379, 0.377, 0.375, 0.000)
		colorSnow      (0.396, 0.394, 0.392, 1.000)
		BumpHeight      0.0343283
		BumpOffset      0.00686566
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.101745
		DustBright  0.728045
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   16.7158
		Period          78.1969
		Eccentricity    0.963543
		Inclination     -100.86
		AscendingNode   -146.395
		ArgOfPericenter -105.828
		MeanAnomaly     -29.3734
	}
}

Comet	"C81"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            1.18118e-013
	Radius          0.679677
	InertiaMoment   0.397177

	Oblateness      0.00462734

	RotationPeriod  73.685
	Obliquity       355.109
	EqAscendNode    278.542

	AbsMagn         4.18229
	SlopeParam      2.99296
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.631 0.629 0.624)

	Surface
	{
		SurfStyle       0.739788
		OceanStyle      0.9246
		Randomize      (-0.556, -0.280, -0.784)
		colorDistMagn   0.996894
		colorDistFreq   0.000406717
		detailScale     18.5597
		colorConversion true
		snowLevel       2
		tropicLatitude  0.219791
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.667704
		terraceProb     0.300692
		erosion         0
		montesMagn      0.476151
		montesFreq      2.85617
		montesSpiky     0.931436
		montesFraction  0.807818
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00117045
		hillsFraction   0.481943
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253953
		craterFreq      0.242646
		craterDensity   0.917
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.547647
		volcanoTemp     1488.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.246, 0.214, 0.175, 0.000)
		colorShelf     (0.252, 0.220, 0.200, 0.000)
		colorBeach     (0.297, 0.258, 0.237, 0.000)
		colorDesert    (0.322, 0.277, 0.231, 0.000)
		colorLowland   (0.353, 0.296, 0.262, 0.000)
		colorUpland    (0.391, 0.358, 0.318, 0.000)
		colorRock      (0.423, 0.390, 0.343, 0.000)
		colorSnow      (0.461, 0.415, 0.362, 1.000)
		BumpHeight      0.611709
		BumpOffset      0.122342
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.266449
		GasToDust   0.25
		Particles   1518
		GasBright   0.0934241
		DustBright  0.420853
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   14.7717
		Period          64.9597
		Eccentricity    0.960346
		Inclination     -14
		AscendingNode   -115.207
		ArgOfPericenter -114.862
		MeanAnomaly     171.943
	}
}

Comet	"C82"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            9.13559e-010
	Radius          14.8945
	InertiaMoment   0.399341

	Oblateness      0.00675992

	RotationPeriod  71.4023
	Obliquity       308.315
	EqAscendNode    263.12

	AbsMagn         11.7325
	SlopeParam      3.59302
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.589 0.583 0.580)

	Surface
	{
		SurfStyle       0.736004
		OceanStyle      0.623809
		Randomize      (0.125, -0.008, -0.829)
		colorDistMagn   0.569701
		colorDistFreq   0.055315
		detailScale     406.72
		colorConversion true
		snowLevel       2
		tropicLatitude  0.983365
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.580187
		terraceProb     0.188281
		erosion         0
		montesMagn      0.546484
		montesFreq      3.40777
		montesSpiky     0.979859
		montesFraction  0.511025
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.524957
		hillsFraction   0.721187
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251804
		craterFreq      0.175114
		craterDensity   0.854697
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.590813
		volcanoTemp     1397.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.230, 0.198, 0.163, 0.000)
		colorShelf     (0.236, 0.204, 0.186, 0.000)
		colorBeach     (0.277, 0.239, 0.221, 0.000)
		colorDesert    (0.300, 0.256, 0.215, 0.000)
		colorLowland   (0.330, 0.274, 0.244, 0.000)
		colorUpland    (0.365, 0.332, 0.296, 0.000)
		colorRock      (0.395, 0.361, 0.319, 0.000)
		colorSnow      (0.430, 0.385, 0.337, 1.000)
		BumpHeight      13.4051
		BumpOffset      2.68102
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.747641
		GasToDust   0.25
		Particles   2490
		GasBright   0.240409
		DustBright  0.758355
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   17.0469
		Period          80.5315
		Eccentricity    0.977327
		Inclination     -106.95
		AscendingNode   118.871
		ArgOfPericenter 148.046
		MeanAnomaly     151.192
	}
}

Comet	"C83"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            2.81291e-017
	Radius          0.0421005
	InertiaMoment   0.398032

	Oblateness      0.0052512

	RotationPeriod  69.2101
	Obliquity       261.52
	EqAscendNode    247.697

	AbsMagn         7.86838
	SlopeParam      4.15784
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.572 0.472 0.382)

	Surface
	{
		SurfStyle       0.925844
		OceanStyle      0.305295
		Randomize      (0.037, -0.440, 0.918)
		colorDistMagn   0.55553
		colorDistFreq   1.50243e-006
		detailScale     1.14962
		colorConversion true
		snowLevel       2
		tropicLatitude  0.940966
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.256892
		terraceProb     0.120787
		erosion         0
		montesMagn      0.489931
		montesFreq      3.80474
		montesSpiky     0.903485
		montesFraction  0.380609
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.15176e-006
		hillsFraction   0.604855
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.21994
		craterFreq      0.207238
		craterDensity   0.946424
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.41587
		volcanoTemp     1339.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.194, 0.165, 0.153, 0.050)
		colorShelf     (0.229, 0.194, 0.176, 0.040)
		colorBeach     (0.263, 0.222, 0.199, 0.030)
		colorDesert    (0.297, 0.250, 0.225, 0.020)
		colorLowland   (0.331, 0.279, 0.248, 0.030)
		colorUpland    (0.366, 0.307, 0.271, 0.050)
		colorRock      (0.400, 0.335, 0.302, 0.020)
		colorSnow      (0.400, 0.335, 0.302, 1.000)
		BumpHeight      0.0378905
		BumpOffset      0.00757809
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.204805
		DustBright  0.478445
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   24.1066
		Period          135.427
		Eccentricity    0.979539
		Inclination     -146.745
		AscendingNode   31.627
		ArgOfPericenter 84.7815
		MeanAnomaly     -18.3485
	}
}

Comet	"C84"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            2.17559e-013
	Radius          0.921849
	InertiaMoment   0.39977

	Oblateness      0.00763411

	RotationPeriod  67.0939
	Obliquity       214.726
	EqAscendNode    232.274

	AbsMagn         3.83923
	SlopeParam      4.73582
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.423 0.416 0.413)

	Surface
	{
		SurfStyle       0.134677
		OceanStyle      0.297102
		Randomize      (0.486, -0.854, -0.899)
		colorDistMagn   0.660727
		colorDistFreq   0.000275839
		detailScale     25.1726
		colorConversion true
		snowLevel       2
		tropicLatitude  0.828906
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.687639
		terraceProb     0.304223
		erosion         0
		montesMagn      0.39649
		montesFreq      2.38334
		montesSpiky     0.936361
		montesFraction  0.716304
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00273494
		hillsFraction   0.51147
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243077
		craterFreq      0.181777
		craterDensity   1.08719
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.557201
		volcanoTemp     1605.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.169, 0.166, 0.165, 0.000)
		colorShelf     (0.180, 0.177, 0.175, 0.000)
		colorBeach     (0.190, 0.187, 0.186, 0.000)
		colorDesert    (0.201, 0.198, 0.196, 0.000)
		colorLowland   (0.211, 0.208, 0.206, 0.000)
		colorUpland    (0.222, 0.218, 0.217, 0.000)
		colorRock      (0.233, 0.229, 0.227, 0.000)
		colorSnow      (0.243, 0.239, 0.237, 1.000)
		BumpHeight      0.829664
		BumpOffset      0.165933
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.299275
		GasToDust   0.25
		Particles   1584
		GasBright   0.131943
		DustBright  0.235794
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   19.0449
		Period          95.0969
		Eccentricity    0.97995
		Inclination     -84.2972
		AscendingNode   -32.5647
		ArgOfPericenter -164.354
		MeanAnomaly     -55.6486
	}
}

Comet	"C85"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            1.68266e-009
	Radius          16.454
	InertiaMoment   0.398626

	Oblateness      0.00594698

	RotationPeriod  65.0417
	Obliquity       167.932
	EqAscendNode    216.852

	AbsMagn         11.4213
	SlopeParam      5.38448
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.720 0.716 0.713)

	Surface
	{
		SurfStyle       0.591943
		OceanStyle      0.570189
		Randomize      (0.008, -0.296, 0.389)
		colorDistMagn   0.696021
		colorDistFreq   0.120871
		detailScale     449.305
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999994
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.290163
		terraceProb     0.237291
		erosion         0
		montesMagn      0.638885
		montesFreq      3.30401
		montesSpiky     0.87199
		montesFraction  0.664346
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.414593
		hillsFraction   0.700867
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247122
		craterFreq      0.260801
		craterDensity   0.806504
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.561992
		volcanoTemp     1687.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.281, 0.243, 0.200, 0.000)
		colorShelf     (0.288, 0.250, 0.228, 0.000)
		colorBeach     (0.339, 0.293, 0.271, 0.000)
		colorDesert    (0.367, 0.315, 0.264, 0.000)
		colorLowland   (0.403, 0.336, 0.300, 0.000)
		colorUpland    (0.447, 0.408, 0.364, 0.000)
		colorRock      (0.483, 0.444, 0.392, 0.000)
		colorSnow      (0.526, 0.472, 0.414, 1.000)
		BumpHeight      14.8086
		BumpOffset      2.96173
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.780467
		GasToDust   0.25
		Particles   2556
		GasBright   0.356095
		DustBright  0.496129
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   19.8164
		Period          100.934
		Eccentricity    0.974166
		Inclination     -101.13
		AscendingNode   -154.559
		ArgOfPericenter 98.4957
		MeanAnomaly     -79.3238
	}
}

Comet	"C86"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            5.18104e-017
	Radius          0.0570567
	InertiaMoment   0.396447

	Oblateness      0.00850223

	RotationPeriod  63.0435
	Obliquity       121.137
	EqAscendNode    201.429

	AbsMagn         7.65936
	SlopeParam      6.23101
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.553 0.548 0.543)

	Surface
	{
		SurfStyle       0.302942
		OceanStyle      0.673053
		Randomize      (0.325, -0.129, 0.593)
		colorDistMagn   0.742896
		colorDistFreq   1.84181e-006
		detailScale     1.55803
		colorConversion true
		snowLevel       2
		tropicLatitude  0.902303
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.359318
		terraceProb     0.412255
		erosion         0
		montesMagn      0.337707
		montesFreq      3.98812
		montesSpiky     0.947359
		montesFraction  0.696716
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.65689e-006
		hillsFraction   0.645477
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219034
		craterFreq      0.21413
		craterDensity   0.676833
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51005
		volcanoTemp     1726.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.221, 0.219, 0.217, 0.000)
		colorShelf     (0.235, 0.233, 0.231, 0.000)
		colorBeach     (0.249, 0.247, 0.244, 0.000)
		colorDesert    (0.263, 0.260, 0.258, 0.000)
		colorLowland   (0.276, 0.274, 0.272, 0.000)
		colorUpland    (0.290, 0.288, 0.285, 0.000)
		colorRock      (0.304, 0.301, 0.299, 0.000)
		colorSnow      (0.318, 0.315, 0.312, 1.000)
		BumpHeight      0.051351
		BumpOffset      0.0102702
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.25595
		DustBright  0.28076
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   15.4551
		Period          69.5197
		Eccentricity    0.953066
		Inclination     123.298
		AscendingNode   -101.876
		ArgOfPericenter 108.867
		MeanAnomaly     -102.326
	}
}

Comet	"C87"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            4.00716e-013
	Radius          1.01919
	InertiaMoment   0.399118

	Oblateness      0.00673975

	RotationPeriod  61.0906
	Obliquity       74.3431
	EqAscendNode    186.007

	AbsMagn         3.46247
	SlopeParam      8.09761
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.407 0.402 0.398)

	Surface
	{
		SurfStyle       0.887404
		OceanStyle      0.0336124
		Randomize      (0.750, -0.580, -0.338)
		colorDistMagn   0.928041
		colorDistFreq   0.000872915
		detailScale     27.8308
		colorConversion true
		snowLevel       2
		tropicLatitude  0.969674
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.4388
		terraceProb     0.360936
		erosion         0
		montesMagn      0.505062
		montesFreq      2.67059
		montesSpiky     0.899911
		montesFraction  0.620821
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00269005
		hillsFraction   0.656509
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234117
		craterFreq      0.14014
		craterDensity   0.865875
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.471839
		volcanoTemp     1670.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.138, 0.141, 0.159, 0.050)
		colorShelf     (0.163, 0.165, 0.183, 0.040)
		colorBeach     (0.187, 0.189, 0.207, 0.030)
		colorDesert    (0.212, 0.213, 0.235, 0.020)
		colorLowland   (0.236, 0.237, 0.259, 0.030)
		colorUpland    (0.261, 0.261, 0.283, 0.050)
		colorRock      (0.285, 0.286, 0.315, 0.020)
		colorSnow      (0.285, 0.286, 0.315, 1.000)
		BumpHeight      0.917274
		BumpOffset      0.183455
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.332101
		GasToDust   0.25
		Particles   1650
		GasBright   0.00794813
		DustBright  0.213249
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   21.2749
		Period          112.279
		Eccentricity    0.972381
		Inclination     -130.689
		AscendingNode   95.3798
		ArgOfPericenter -48.3076
		MeanAnomaly     84.179
	}
}

Comet	"C88"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            3.09925e-009
	Radius          22.2827
	InertiaMoment   0.397663

	Oblateness      0.00965278

	RotationPeriod  59.1755
	Obliquity       27.5488
	EqAscendNode    170.584

	AbsMagn         11.1296
	SlopeParam      2.65411
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.639 0.637 0.634)

	Surface
	{
		SurfStyle       0.865731
		OceanStyle      0.997799
		Randomize      (0.684, -0.559, 0.772)
		colorDistMagn   0.600013
		colorDistFreq   0.285831
		detailScale     608.465
		colorConversion true
		snowLevel       2
		tropicLatitude  0.456194
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.428809
		terraceProb     0.385968
		erosion         0
		montesMagn      0.58156
		montesFreq      4.06297
		montesSpiky     0.886006
		montesFraction  0.421911
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.46683
		hillsFraction   0.3782
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259605
		craterFreq      0.14952
		craterDensity   0.829195
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.464933
		volcanoTemp     1277.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.217, 0.223, 0.254, 0.050)
		colorShelf     (0.256, 0.261, 0.292, 0.040)
		colorBeach     (0.294, 0.300, 0.330, 0.030)
		colorDesert    (0.332, 0.338, 0.374, 0.020)
		colorLowland   (0.371, 0.376, 0.412, 0.030)
		colorUpland    (0.409, 0.414, 0.450, 0.050)
		colorRock      (0.447, 0.452, 0.501, 0.020)
		colorSnow      (0.447, 0.452, 0.501, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.813293
		GasToDust   0.25
		Particles   2622
		GasBright   0.0670241
		DustBright  0.638659
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   29.2658
		Period          181.151
		Eccentricity    0.984178
		Inclination     -44.6035
		AscendingNode   37.2189
		ArgOfPericenter 145.252
		MeanAnomaly     -54.1136
	}
}

Comet	"C89"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            9.54284e-017
	Radius          0.0631306
	InertiaMoment   0.399561

	Oblateness      0.00766025

	RotationPeriod  57.2916
	Obliquity       340.755
	EqAscendNode    155.161

	AbsMagn         7.4494
	SlopeParam      3.29679
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.730 0.655 0.533)

	Surface
	{
		SurfStyle       0.0226036
		OceanStyle      0.523676
		Randomize      (-0.458, -0.281, 0.613)
		colorDistMagn   0.518699
		colorDistFreq   3.02759e-006
		detailScale     1.72389
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999892
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.416242
		terraceProb     0.329254
		erosion         0
		montesMagn      0.42143
		montesFreq      2.5961
		montesSpiky     0.891936
		montesFraction  0.381466
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.78728e-006
		hillsFraction   0.645364
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.276437
		craterFreq      0.274617
		craterDensity   0.89354
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.613435
		volcanoTemp     1483.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.292, 0.262, 0.213, 0.000)
		colorShelf     (0.310, 0.279, 0.227, 0.000)
		colorBeach     (0.329, 0.295, 0.240, 0.000)
		colorDesert    (0.347, 0.311, 0.253, 0.000)
		colorLowland   (0.365, 0.328, 0.267, 0.000)
		colorUpland    (0.383, 0.344, 0.280, 0.000)
		colorRock      (0.402, 0.361, 0.293, 0.000)
		colorSnow      (0.420, 0.377, 0.307, 1.000)
		BumpHeight      0.0568176
		BumpOffset      0.0113635
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0600951
		DustBright  0.330075
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   23.4756
		Period          130.144
		Eccentricity    0.967629
		Inclination     82.8784
		AscendingNode   108.238
		ArgOfPericenter 167.97
		MeanAnomaly     -122.51
	}
}

Comet	"C90"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            7.38069e-013
	Radius          1.37924
	InertiaMoment   0.398351

	Oblateness      0.0109826

	RotationPeriod  55.4327
	Obliquity       293.96
	EqAscendNode    139.739

	AbsMagn         3.04045
	SlopeParam      3.8728
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.457 0.454 0.452)

	Surface
	{
		SurfStyle       0.855714
		OceanStyle      0.80033
		Randomize      (-0.548, 0.470, -0.677)
		colorDistMagn   0.659239
		colorDistFreq   0.000672942
		detailScale     37.6626
		colorConversion true
		snowLevel       2
		tropicLatitude  0.974469
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.260906
		terraceProb     0.133237
		erosion         0
		montesMagn      0.474334
		montesFreq      3.47903
		montesSpiky     0.946902
		montesFraction  0.584863
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00296293
		hillsFraction   0.423891
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250009
		craterFreq      0.204551
		craterDensity   0.947209
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.402885
		volcanoTemp     1566.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.155, 0.159, 0.181, 0.050)
		colorShelf     (0.183, 0.186, 0.208, 0.040)
		colorBeach     (0.210, 0.213, 0.235, 0.030)
		colorDesert    (0.238, 0.241, 0.267, 0.020)
		colorLowland   (0.265, 0.268, 0.294, 0.030)
		colorUpland    (0.293, 0.295, 0.321, 0.050)
		colorRock      (0.320, 0.322, 0.357, 0.020)
		colorSnow      (0.320, 0.322, 0.357, 1.000)
		BumpHeight      1.24132
		BumpOffset      0.248264
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.364927
		GasToDust   0.25
		Particles   1717
		GasBright   0.186361
		DustBright  0.688295
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   12.2785
		Period          49.2286
		Eccentricity    0.959274
		Inclination     42.4984
		AscendingNode   96.9681
		ArgOfPericenter -151.307
		MeanAnomaly     -39.9808
	}
}

Comet	"C91"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            5.70843e-009
	Radius          24.673
	InertiaMoment   0.399983

	Oblateness      0.00874973

	RotationPeriod  53.5935
	Obliquity       247.166
	EqAscendNode    124.316

	AbsMagn         10.8536
	SlopeParam      4.43824
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.764 0.762 0.759)

	Surface
	{
		SurfStyle       0.932795
		OceanStyle      0.511049
		Randomize      (-0.474, -0.354, -0.066)
		colorDistMagn   0.777017
		colorDistFreq   0.198567
		detailScale     673.738
		colorConversion true
		snowLevel       2
		tropicLatitude  0.794285
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.459763
		terraceProb     0.413661
		erosion         0
		montesMagn      0.615749
		montesFreq      3.20979
		montesSpiky     0.96839
		montesFraction  0.568137
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.17638
		hillsFraction   0.767882
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240161
		craterFreq      0.222741
		craterDensity   1.02791
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.486592
		volcanoTemp     1566.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.260, 0.267, 0.304, 0.050)
		colorShelf     (0.306, 0.313, 0.349, 0.040)
		colorBeach     (0.352, 0.358, 0.395, 0.030)
		colorDesert    (0.397, 0.404, 0.448, 0.020)
		colorLowland   (0.443, 0.450, 0.494, 0.030)
		colorUpland    (0.489, 0.496, 0.539, 0.050)
		colorRock      (0.535, 0.541, 0.600, 0.020)
		colorSnow      (0.535, 0.541, 0.600, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.846119
		GasToDust   0.25
		Particles   2689
		GasBright   0.15215
		DustBright  0.406993
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   18.0068
		Period          87.4288
		Eccentricity    0.973475
		Inclination     -71.4586
		AscendingNode   -146.774
		ArgOfPericenter 71.065
		MeanAnomaly     61.4977
	}
}

Comet	"C92"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            1.75767e-016
	Radius          0.0853743
	InertiaMoment   0.398884

	Oblateness      0.0125657

	RotationPeriod  51.7688
	Obliquity       200.372
	EqAscendNode    108.894

	AbsMagn         7.23791
	SlopeParam      5.04189
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.756 0.696 0.614)

	Surface
	{
		SurfStyle       0.0882348
		OceanStyle      0.347781
		Randomize      (0.204, -0.568, -0.444)
		colorDistMagn   0.742994
		colorDistFreq   4.91079e-006
		detailScale     2.33129
		colorConversion true
		snowLevel       2
		tropicLatitude  0.409282
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.441617
		terraceProb     0.114903
		erosion         0
		montesMagn      0.499962
		montesFreq      2.14642
		montesSpiky     0.985011
		montesFraction  0.578534
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.44122e-005
		hillsFraction   0.593331
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253139
		craterFreq      0.243291
		craterDensity   1.00785
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.476447
		volcanoTemp     1716.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.302, 0.279, 0.245, 0.000)
		colorShelf     (0.321, 0.296, 0.261, 0.000)
		colorBeach     (0.340, 0.313, 0.276, 0.000)
		colorDesert    (0.359, 0.331, 0.291, 0.000)
		colorLowland   (0.378, 0.348, 0.307, 0.000)
		colorUpland    (0.397, 0.366, 0.322, 0.000)
		colorRock      (0.416, 0.383, 0.337, 0.000)
		colorSnow      (0.434, 0.400, 0.353, 1.000)
		BumpHeight      0.0768369
		BumpOffset      0.0153674
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.08068
		DustBright  0.16295
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   19.1436
		Period          95.8372
		Eccentricity    0.970011
		Inclination     -3.8776
		AscendingNode   166.606
		ArgOfPericenter 52.6348
		MeanAnomaly     -130.957
	}
}

Comet	"C93"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            1.35943e-012
	Radius          1.52828
	InertiaMoment   0.397191

	Oblateness      0.00994586

	RotationPeriod  49.9538
	Obliquity       153.577
	EqAscendNode    93.471

	AbsMagn         2.55457
	SlopeParam      5.76225
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.461 0.394 0.353)

	Surface
	{
		SurfStyle       0.927552
		OceanStyle      0.324132
		Randomize      (-0.882, 0.601, 0.127)
		colorDistMagn   0.84161
		colorDistFreq   0.00110545
		detailScale     41.7324
		colorConversion true
		snowLevel       2
		tropicLatitude  0.62357
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.607077
		terraceProb     0.52358
		erosion         0
		montesMagn      0.38772
		montesFreq      2.68233
		montesSpiky     0.97121
		montesFraction  0.50107
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00569265
		hillsFraction   0.666543
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231446
		craterFreq      0.169805
		craterDensity   0.887056
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.565321
		volcanoTemp     1466.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.157, 0.138, 0.141, 0.050)
		colorShelf     (0.185, 0.161, 0.162, 0.040)
		colorBeach     (0.212, 0.185, 0.184, 0.030)
		colorDesert    (0.240, 0.209, 0.208, 0.020)
		colorLowland   (0.268, 0.232, 0.229, 0.030)
		colorUpland    (0.295, 0.256, 0.251, 0.050)
		colorRock      (0.323, 0.279, 0.279, 0.020)
		colorSnow      (0.323, 0.279, 0.279, 1.000)
		BumpHeight      1.37546
		BumpOffset      0.275091
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.397753
		GasToDust   0.25
		Particles   1783
		GasBright   0.284114
		DustBright  0.444002
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   18.2774
		Period          89.407
		Eccentricity    0.966896
		Inclination     167.263
		AscendingNode   -20.77
		ArgOfPericenter 69.3078
		MeanAnomaly     50.5415
	}
}

Comet	"C94"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            1.05142e-008
	Radius          33.3446
	InertiaMoment   0.399346

	Oblateness      0.0144961

	RotationPeriod  48.1436
	Obliquity       106.783
	EqAscendNode    78.0484

	AbsMagn         10.5906
	SlopeParam      6.85042
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.633 0.521 0.414)

	Surface
	{
		SurfStyle       0.386797
		OceanStyle      0.462425
		Randomize      (-0.082, -0.220, 0.515)
		colorDistMagn   0.889996
		colorDistFreq   0.472557
		detailScale     910.529
		colorConversion true
		snowLevel       2
		tropicLatitude  0.96408
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.310208
		terraceProb     0.187763
		erosion         0
		montesMagn      0.658684
		montesFreq      2.95229
		montesSpiky     0.997344
		montesFraction  0.281101
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.35227
		hillsFraction   0.431764
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235191
		craterFreq      0.274238
		craterDensity   0.888917
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.536911
		volcanoTemp     1684.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.253, 0.208, 0.166, 0.000)
		colorShelf     (0.269, 0.221, 0.176, 0.000)
		colorBeach     (0.285, 0.234, 0.187, 0.000)
		colorDesert    (0.301, 0.247, 0.197, 0.000)
		colorLowland   (0.317, 0.260, 0.207, 0.000)
		colorUpland    (0.333, 0.273, 0.218, 0.000)
		colorRock      (0.348, 0.286, 0.228, 0.000)
		colorSnow      (0.364, 0.299, 0.238, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.878945
		GasToDust   0.25
		Particles   2755
		GasBright   0.185361
		DustBright  0.227241
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   18.3371
		Period          89.845
		Eccentricity    0.945036
		Inclination     1.38337
		AscendingNode   175.869
		ArgOfPericenter -134.22
		MeanAnomaly     74.0126
	}
}

Comet	"C95"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            3.2374e-016
	Radius          0.0946641
	InertiaMoment   0.398041

	Oblateness      0.0115736

	RotationPeriod  46.3339
	Obliquity       59.9887
	EqAscendNode    62.6258

	AbsMagn         7.02427
	SlopeParam      2.2712
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.673 0.596 0.498)

	Surface
	{
		SurfStyle       0.276623
		OceanStyle      0.248571
		Randomize      (-0.748, -0.689, 0.643)
		colorDistMagn   0.448611
		colorDistFreq   6.11804e-006
		detailScale     2.58496
		colorConversion true
		snowLevel       2
		tropicLatitude  0.447705
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.646776
		terraceProb     0.118816
		erosion         0
		montesMagn      0.552356
		montesFreq      3.16547
		montesSpiky     0.856564
		montesFraction  0.599694
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.25685e-005
		hillsFraction   0.622496
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.265873
		craterFreq      0.158162
		craterDensity   0.913776
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.415205
		volcanoTemp     1376.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.269, 0.239, 0.199, 0.000)
		colorShelf     (0.286, 0.253, 0.212, 0.000)
		colorBeach     (0.303, 0.268, 0.224, 0.000)
		colorDesert    (0.320, 0.283, 0.237, 0.000)
		colorLowland   (0.337, 0.298, 0.249, 0.000)
		colorUpland    (0.353, 0.313, 0.262, 0.000)
		colorRock      (0.370, 0.328, 0.274, 0.000)
		colorSnow      (0.387, 0.343, 0.287, 1.000)
		BumpHeight      0.0851977
		BumpOffset      0.0170395
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.00744086
		DustBright  0.889648
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   25.0785
		Period          143.698
		Eccentricity    0.983343
		Inclination     35.8297
		AscendingNode   164.586
		ArgOfPericenter 2.5729
		MeanAnomaly     -177.2
	}
}

Comet	"C96"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            2.5039e-012
	Radius          2.06412
	InertiaMoment   0.399776

	Oblateness      0.0169125

	RotationPeriod  44.5199
	Obliquity       13.1944
	EqAscendNode    47.2033

	AbsMagn         1.97159
	SlopeParam      2.98419
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.778 0.776 0.775)

	Surface
	{
		SurfStyle       0.99221
		OceanStyle      0.718565
		Randomize      (0.490, -0.452, 0.898)
		colorDistMagn   0.270952
		colorDistFreq   0.00242742
		detailScale     56.3642
		colorConversion true
		snowLevel       2
		tropicLatitude  0.982028
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.753377
		terraceProb     0.368433
		erosion         0
		montesMagn      0.49704
		montesFreq      2.87471
		montesSpiky     0.976907
		montesFraction  0.802236
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00866233
		hillsFraction   0.456046
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247737
		craterFreq      0.197258
		craterDensity   0.905493
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.574126
		volcanoTemp     1617.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.264, 0.272, 0.310, 0.050)
		colorShelf     (0.311, 0.318, 0.356, 0.040)
		colorBeach     (0.358, 0.365, 0.403, 0.030)
		colorDesert    (0.404, 0.411, 0.457, 0.020)
		colorLowland   (0.451, 0.458, 0.503, 0.030)
		colorUpland    (0.498, 0.504, 0.550, 0.050)
		colorRock      (0.544, 0.551, 0.612, 0.020)
		colorSnow      (0.544, 0.551, 0.612, 1.000)
		BumpHeight      1.85771
		BumpOffset      0.371541
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.430579
		GasToDust   0.25
		Particles   1849
		GasBright   0.0391631
		DustBright  0.542413
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   11.6951
		Period          45.7621
		Eccentricity    0.960086
		Inclination     92.0704
		AscendingNode   -168.994
		ArgOfPericenter 160.29
		MeanAnomaly     -5.29586
	}
}

Comet	"C97"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            1.93658e-008
	Radius          36.9969
	InertiaMoment   0.398633

	Oblateness      0.0136312

	RotationPeriod  42.697
	Obliquity       326.4
	EqAscendNode    31.7807

	AbsMagn         10.3383
	SlopeParam      3.58514
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.599 0.500 0.448)

	Surface
	{
		SurfStyle       0.332424
		OceanStyle      0.251493
		Randomize      (0.362, 0.328, -0.872)
		colorDistMagn   0.266047
		colorDistFreq   0.773109
		detailScale     1010.26
		colorConversion true
		snowLevel       2
		tropicLatitude  0.772151
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.653177
		terraceProb     0.244696
		erosion         0
		montesMagn      0.561322
		montesFreq      3.45123
		montesSpiky     0.979496
		montesFraction  0.481247
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.40647
		hillsFraction   0.542317
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213183
		craterFreq      0.220018
		craterDensity   0.863739
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.46696
		volcanoTemp     1512.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.240, 0.200, 0.179, 0.000)
		colorShelf     (0.255, 0.212, 0.190, 0.000)
		colorBeach     (0.270, 0.225, 0.201, 0.000)
		colorDesert    (0.285, 0.237, 0.213, 0.000)
		colorLowland   (0.300, 0.250, 0.224, 0.000)
		colorUpland    (0.314, 0.262, 0.235, 0.000)
		colorRock      (0.329, 0.275, 0.246, 0.000)
		colorSnow      (0.344, 0.287, 0.257, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.911771
		GasToDust   0.25
		Particles   2821
		GasBright   0.0336263
		DustBright  0.232436
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   14.631
		Period          64.0339
		Eccentricity    0.957743
		Inclination     -46.8222
		AscendingNode   99.341
		ArgOfPericenter 31.734
		MeanAnomaly     -36.816
	}
}

Comet	"C98"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            5.9629e-016
	Radius          0.127777
	InertiaMoment   0.396472

	Oblateness      0.0197537

	RotationPeriod  40.8605
	Obliquity       279.606
	EqAscendNode    16.3581

	AbsMagn         6.80781
	SlopeParam      4.1501
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.676 0.675 0.673)

	Surface
	{
		SurfStyle       0.587176
		OceanStyle      0.819743
		Randomize      (0.265, 0.979, 0.391)
		colorDistMagn   0.809059
		colorDistFreq   5.49316e-006
		detailScale     3.48918
		colorConversion true
		snowLevel       2
		tropicLatitude  0.977776
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.397992
		terraceProb     0.304136
		erosion         0
		montesMagn      0.412881
		montesFreq      3.08842
		montesSpiky     0.973239
		montesFraction  0.845007
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.84803e-005
		hillsFraction   0.614248
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.268784
		craterFreq      0.212296
		craterDensity   0.904655
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.582373
		volcanoTemp     1325.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.264, 0.229, 0.188, 0.000)
		colorShelf     (0.271, 0.236, 0.215, 0.000)
		colorBeach     (0.318, 0.277, 0.256, 0.000)
		colorDesert    (0.345, 0.297, 0.249, 0.000)
		colorLowland   (0.379, 0.317, 0.283, 0.000)
		colorUpland    (0.419, 0.385, 0.343, 0.000)
		colorRock      (0.453, 0.418, 0.370, 0.000)
		colorSnow      (0.494, 0.445, 0.390, 1.000)
		BumpHeight      0.115
		BumpOffset      0.0229999
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.139174
		DustBright  0.611374
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   27.1233
		Period          161.627
		Eccentricity    0.97254
		Inclination     -11.7748
		AscendingNode   103.302
		ArgOfPericenter -117.511
		MeanAnomaly     148.759
	}
}

Comet	"C99"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            4.61187e-012
	Radius          2.29163
	InertiaMoment   0.399124

	Oblateness      0.0163299

	RotationPeriod  39.0051
	Obliquity       232.812
	EqAscendNode    0.935491

	AbsMagn         1.22194
	SlopeParam      4.72757
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.648 0.643 0.641)

	Surface
	{
		SurfStyle       0.602861
		OceanStyle      0.14599
		Randomize      (0.450, -0.686, -0.699)
		colorDistMagn   0.430407
		colorDistFreq   0.00311725
		detailScale     62.5768
		colorConversion true
		snowLevel       2
		tropicLatitude  0.926177
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.486294
		terraceProb     0.324669
		erosion         0
		montesMagn      0.589113
		montesFreq      2.52126
		montesSpiky     0.991084
		montesFraction  0.665808
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0152707
		hillsFraction   0.689212
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243619
		craterFreq      0.253581
		craterDensity   0.876855
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.509011
		volcanoTemp     1447.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.253, 0.219, 0.179, 0.000)
		colorShelf     (0.259, 0.225, 0.205, 0.000)
		colorBeach     (0.305, 0.264, 0.244, 0.000)
		colorDesert    (0.331, 0.283, 0.237, 0.000)
		colorLowland   (0.363, 0.302, 0.269, 0.000)
		colorUpland    (0.402, 0.367, 0.327, 0.000)
		colorRock      (0.434, 0.399, 0.352, 0.000)
		colorSnow      (0.473, 0.425, 0.372, 1.000)
		BumpHeight      2.06247
		BumpOffset      0.412494
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.463405
		GasToDust   0.25
		Particles   1915
		GasBright   0.106356
		DustBright  0.32868
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   16.317
		Period          75.4154
		Eccentricity    0.953791
		Inclination     109.223
		AscendingNode   -139.983
		ArgOfPericenter 110.616
		MeanAnomaly     -161.276
	}
}

Comet	"C100"
{
	ParentBody     "Y'Toub"
	Class	       "Asteroid"

	Mass            3.56695e-008
	Radius          49.9096
	InertiaMoment   0.397674

	Oblateness      0.0239451

	RotationPeriod  37.1256
	Obliquity       186.017
	EqAscendNode    345.513

	AbsMagn         10.095
	SlopeParam      5.37469
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.582 0.578 0.572)

	Surface
	{
		SurfStyle       0.849514
		OceanStyle      0.715464
		Randomize      (-0.238, 0.568, -0.278)
		colorDistMagn   0.601738
		colorDistFreq   2.0512
		detailScale     1362.86
		colorConversion true
		snowLevel       2
		tropicLatitude  0.516976
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.605999
		terraceProb     0.156599
		erosion         0
		montesMagn      0.489865
		montesFreq      3.48759
		montesSpiky     0.88053
		montesFraction  0.346959
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.15293
		hillsFraction   0.738075
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252724
		craterFreq      0.264758
		craterDensity   0.978494
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.527451
		volcanoTemp     1492.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.227, 0.197, 0.160, 0.000)
		colorShelf     (0.233, 0.202, 0.183, 0.000)
		colorBeach     (0.273, 0.237, 0.217, 0.000)
		colorDesert    (0.297, 0.254, 0.212, 0.000)
		colorLowland   (0.326, 0.272, 0.240, 0.000)
		colorUpland    (0.361, 0.329, 0.292, 0.000)
		colorRock      (0.390, 0.358, 0.315, 0.000)
		colorSnow      (0.425, 0.381, 0.332, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.944597
		GasToDust   0.25
		Particles   2888
		GasBright   0.279094
		DustBright  0.640428
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   22.4198
		Period          121.464
		Eccentricity    0.967263
		Inclination     -143.78
		AscendingNode   150.085
		ArgOfPericenter -53.934
		MeanAnomaly     -156.679
	}
}

