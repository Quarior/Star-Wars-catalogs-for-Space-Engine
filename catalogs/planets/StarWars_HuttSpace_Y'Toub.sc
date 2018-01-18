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
		Panspermia true	
	} 
	Surface
	{
	
		DiffMap        "Nar Shaddaa/Diff"
		DiffTileSize    1024
		DiffTileBorder  1  
        BumpMap        "Nar Shaddaa/Bump" 
		BumpTileSize    1024
		BumpTileBorder  1
		BumpHeight 15
		BumpOffset 0
		GlowMap        "Nar Shaddaa/Glow"
		GlowTileSize 1024
		GlowTileBorder 1
		GlowMode       "Permanent" //"Night"
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
		colorLowland   (0.530, 0.480, 0.400, 0.000)
		colorUpland    (0.600, 0.540, 0.420, 0.000)
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
		SemiMajorAxis   5.43817
		Period          14.5078
		Eccentricity    0.130355
		Inclination     -2.23778
		AscendingNode   78.3784
		ArgOfPericenter 93.2705
		MeanAnomaly     284.704
	}
}