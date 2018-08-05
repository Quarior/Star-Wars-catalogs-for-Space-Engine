// http://starwars.wikia.com/wiki/Ciutric
// Region : Outer Rim
// Sector : Ciutric Sector
// Grid location : N5
// X : 3775.51, Y : 7128.16, Z : -505.8454869309793


// Ciutric IV (2 moons)
// http://starwars.wikia.com/wiki/Ciutric_IV

Planet	"Ciutric IV"
{
	ParentBody     "Ciutric System"
	Class	       "Terra"

	Mass            0.102194
	Radius          3469.48
	InertiaMoment   0.332231

	RotationPeriod  11439.1
	Obliquity       -1.29821
	EqAscendNode    27.7752
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (1.042 1.042 1.041)
    
    Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine/Terrestrial"
		Panspermia "false"
	}

	Surface
	{
		SurfStyle       0.240476
		OceanStyle      0
		Randomize      (-0.190, 0.762, -0.355)
		colorDistMagn   0.0555656
		colorDistFreq   413.578
		detailScale     8923.7
		colorConversion true
		drivenDarkening -1
		seaLevel        0.650794
		snowLevel       0.85
		tropicLatitude  0.0124868
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.18254
		venusFreq       0.657857
		venusMagn       0.47619
		mareFreq        5.4743
		mareDensity     0.00717924
		terraceProb     0.416966
		erosion         0.111988
		montesMagn      0.172922
		montesFreq      115.025
		montesSpiky     0.984327
		montesFraction  0.145232
		dunesMagn       0.0516218
		dunesFreq       39.3146
		dunesFraction   0.0419207
		hillsMagn       0.14048
		hillsFreq       326.676
		hillsFraction   0.283219
		hills2Fraction  0.602746
		riversMagn      70.4579
		riversFreq      2.73641
		riversSin       5.52927
		riversOctaves   2
		canyonsMagn     0.0666182
		canyonsFreq     96.4143
		canyonFraction  0.531931
		cracksMagn      0.124382
		cracksFreq      0.331901
		cracksOctaves   0
		craterMagn      0.644687
		craterFreq      9.05404
		craterDensity   0
		craterOctaves   0
		craterRayedFactor 0
		volcanoMagn     0.639498
		volcanoFreq     0.686099
		volcanoDensity  0.326196
		volcanoOctaves  3
		volcanoActivity 0.989491
		volcanoFlows    0.651059
		volcanoRadius   0.459801
		volcanoTemp     1220.32
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.98312
		stripeFluct     0
		stripeTwist     0.849191
		cycloneMagn     2.71087
		cycloneFreq     0.909064
		cycloneDensity  0.341299
		cycloneOctaves  2
		colorSea       (0.040, 0.100, 0.200, 1.000)
		colorShelf     (0.150, 0.480, 0.460, 1.000)
		colorBeach     (0.740, 0.730, 0.610, 0.000)
		colorDesert    (0.450, 0.420, 0.380, 0.000)
		colorLowland   (0.480, 0.380, 0.280, 0.000)
		colorUpland    (0.600, 0.540, 0.420, 0.000)
		colorRock      (0.170, 0.160, 0.160, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.308)
		colorLowPlants (0.196, 0.287, 0.268, 0.000)
		colorUpPlants  (0.265, 0.329, 0.238, 0.000)
		BumpHeight      20
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
        Height          61.054
		Velocity        5.43792
		BumpHeight      5.9792
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.04962
		mainOctaves     10
		Coverage        0.1
		stripeZones     1.98312
		stripeFluct     0
		stripeTwist     0.849191
    }
    
    Clouds
	{
        Height          43.9397
		Velocity        31.4939
		BumpHeight      5.07515
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.04962
		mainOctaves     10
		Coverage        0.1
		stripeZones     1.98312
		stripeFluct     0
		stripeTwist     0.849191
    }

	Ocean
	{
        Height          13.0159
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
    }
    
	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          89.463
		Density         1
		Pressure        1
		Greenhouse      11.23658
		Bright          20
		Opacity         0.928571
		SkyLight        0.873016
		Hue             0.015873
		Saturation      2

		Composition
		{
			N2    	77.7729
			O2    	20.8625
			Ar    	0.9303
			H2O   	0.4
			CO2   	0.0398
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.67055
		Period          3.18712
		Eccentricity    0.0984054
		Inclination     -1.54745
		AscendingNode   -152.632
		ArgOfPericenter 90.2729
		MeanAnomaly     329.319
	}
}

Moon	"Ciutric IV.1"
{
	ParentBody     "Ciutric IV"
	Class	       "Selena"

	Mass            1.93634e-007
	Radius          760.7449
	InertiaMoment   0.398402

	Oblateness      0.0002

	Obliquity       0.00961378
	EqAscendNode    -8.35639
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.622 0.623 0.623)

	Surface
	{
		SurfStyle       0.580688
		OceanStyle      0.576913
		Randomize      (-0.770, -0.741, -0.464)
		colorDistMagn   0.661727
		colorDistFreq   2.88326
		detailScale     2095.65
		colorConversion true
        seaLevel        -1
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.330296
		terraceProb     0.381162
		erosion         0
		montesMagn      0.565737
		montesFreq      3.34967
		montesSpiky     0.913793
		montesFraction  0.579184
		dunesFraction   0
		hillsMagn       0
		hillsFreq       14.6897
		hillsFraction   0.497368
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224734
		craterFreq      0.18756
		craterDensity   1.03049
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.534762
		volcanoTemp     1482.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.262, 0.227, 0.186, 0.000)
		colorShelf     (0.269, 0.234, 0.213, 0.000)
		colorBeach     (0.316, 0.274, 0.253, 0.000)
		colorDesert    (0.343, 0.294, 0.246, 0.000)
		colorLowland   (0.376, 0.314, 0.279, 0.000)
		colorUpland    (0.417, 0.381, 0.339, 0.000)
		colorRock      (0.450, 0.414, 0.366, 0.000)
		colorSnow      (0.491, 0.441, 0.386, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   15.451e-005
		Period          0.00093736
		Eccentricity    1.05829e-005
		Inclination     0.00961378
		AscendingNode   -8.35639
		ArgOfPericenter -39.282
		MeanAnomaly     -8.38236
	}
}

Moon	"Ciutric IV.2"
{
	ParentBody     "Ciutric IV"
	Class	       "Selena"

	Mass            2.67649e-007
	Radius          570.3349
	InertiaMoment   0.399426

    Oblateness      0.0035
    
	Obliquity       -89.9027
	EqAscendNode    3.7451
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.422 0.417 0.411)

	Surface
	{
		SurfStyle       0.7987
		OceanStyle      0.638684
		Randomize      (0.757, -0.992, 0.309)
		colorDistMagn   0.833609
		colorDistFreq   0.750747
		detailScale     1565.63
		colorConversion true
        seaLevel        -1
		snowLevel       2
		tropicLatitude  0.0654055
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.5803
		terraceProb     0.164952
		erosion         0
		montesMagn      0.328219
		montesFreq      3.17635
		montesSpiky     0.948636
		montesFraction  0.373526
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.36538
		hillsFraction   0.765848
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242698
		craterFreq      0.168975
		craterDensity   0.977091
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.488746
		volcanoTemp     1488.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.165, 0.142, 0.115, 0.000)
		colorShelf     (0.169, 0.146, 0.131, 0.000)
		colorBeach     (0.198, 0.171, 0.156, 0.000)
		colorDesert    (0.215, 0.183, 0.152, 0.000)
		colorLowland   (0.236, 0.196, 0.172, 0.000)
		colorUpland    (0.262, 0.238, 0.209, 0.000)
		colorRock      (0.283, 0.258, 0.226, 0.000)
		colorSnow      (0.308, 0.275, 0.238, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   23.451e-005
		Period          0.0103549
		Eccentricity    0.0780285
		Inclination     -89.9027
		AscendingNode   3.7451
		ArgOfPericenter -171.868
		MeanAnomaly     140.577
	}
}

// Generated

Planet	"Ciutric II"
{
	ParentBody     "Ciutric System"
	Class	       "Desert"

	Mass            0.491558
	Radius          4441.92
	InertiaMoment   0.327184

	Oblateness      0.00507504

	RotationPeriod  16.0031
	Obliquity       -9.18175
	EqAscendNode    169.507
	Precession      0

	AlbedoBond      0.309104
	AlbedoGeom      0.370925
	Brightness      2
	Color          (0.712 0.708 0.706)

	Surface
	{
		SurfStyle       0.404536
		OceanStyle      0.973835
		Randomize      (-0.147, -0.953, -0.805)
		colorDistMagn   0.0624717
		colorDistFreq   636.66
		detailScale     11424.9
		colorConversion true
		seaLevel        0.0871487
		snowLevel       0.976855
		tropicLatitude  0.122815
		icecapLatitude  10
		icecapHeight    0.126967
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        0.819519
		venusFreq       1.07957
		venusMagn       0.284013
		mareFreq        1.76782
		mareDensity     0.20127
		terraceProb     0.237475
		erosion         0
		montesMagn      0.16688
		montesFreq      252.955
		montesSpiky     0.872802
		montesFraction  0.773445
		dunesMagn       0.0613807
		dunesFreq       40.6792
		dunesFraction   0.383941
		hillsMagn       0.108769
		hillsFreq       439.846
		hillsFraction   0
		hills2Fraction  0
		riversMagn      62.4532
		riversFreq      4.53843
		riversSin       7.09325
		riversOctaves   0
		canyonsMagn     0.0108541
		canyonsFreq     104.254
		canyonFraction  0
		cracksMagn      0.126127
		cracksFreq      0.388543
		cracksOctaves   0
		craterMagn      0.583038
		craterFreq      12.9239
		craterDensity   0
		craterOctaves   0.819337
		volcanoMagn     0.753391
		volcanoFreq     0.787107
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 1.29763
		volcanoFlows    0.253631
		volcanoRadius   0.509598
		volcanoTemp     1773.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.22495
		stripeTwist     0
		cycloneMagn     1.98903
		cycloneFreq     0.617049
		cycloneDensity  0.214476
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
		BumpHeight      19.8664
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
		Height          15.272
		Velocity        5.43792
		BumpHeight      5.33873
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.01455
		mainOctaves     10
		Coverage        0.218208
		stripeZones     2.22495
		stripeTwist     0
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Titan"
		Height          129.729
		Density         0.379575
		Pressure        0.647027
		Greenhouse      30.2476
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0
		Saturation      1

		Composition
		{
			H2O   	56.9761
			CO2   	38.7686
			CH4   	1.5177
			NH3   	1.17967
			H2S   	0.755911
			C2H2  	0.502031
			C3H8  	0.148483
			SO2   	0.0802489
			C2H4  	0.0409193
			N2    	0.0168523
			C2H6  	0.0133852
			CO    	7.00267e-005
		}
	}

	Aurora
	{
		Height      111.388
		NorthLat    62.9005
		NorthLon    -68.3126
		NorthRadius 972.743
		NorthWidth  226.179
		NorthRings  3
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -57.1795
		SouthLon    103.996
		SouthRadius 1088.79
		SouthWidth  316.109
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
		SemiMajorAxis   0.703241
		Period          0.430682
		Eccentricity    0.0516753
		Inclination     -2.22851
		AscendingNode   164.848
		ArgOfPericenter 26.1367
		MeanAnomaly     163.851
	}
}

Planet	"Ciutric III"
{
	ParentBody     "Ciutric System"
	Class	       "GasGiant"

	Mass            679.067
	Radius          77897.9
	InertiaMoment   0.209575

	Oblateness      0.048302

	RotationPeriod  8.36119
	Obliquity       -21.3382
	EqAscendNode    -54.9304
	Precession      0

	AlbedoBond      0.460405
	AlbedoGeom      0.552486
	Brightness      2
	Color          (0.901 0.907 0.908)

	Surface
	{
		SurfStyle       0.284705
		Randomize      (0.397, 0.750, 0.454)
		detailScale     200358
		colorConversion true
		tropicLatitude  0.381707
		icecapLatitude  1
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     6.89271
		stripeFluct     0.391618
		stripeTwist     11.0883
		cycloneMagn     12.5138
		cycloneFreq     0.921877
		cycloneDensity  0.501383
		cycloneOctaves  5
		colorLayer0    (0.120, 0.200, 0.480, 1.100)
		colorLayer1    (0.330, 0.400, 0.720, 0.600)
		colorLayer2    (0.330, 0.400, 0.720, 0.200)
		colorLayer3    (0.600, 0.600, 0.600, 0.000)
		colorLayer4    (0.350, 0.430, 0.770, 0.000)
		colorLayer5    (0.470, 0.540, 0.850, 0.000)
		colorLayer6    (0.600, 0.650, 0.910, 0.000)
		colorLayer7    (0.990, 0.990, 1.000, 1.000)
		colorLowPlants (0.350, 0.430, 0.770, 0.000)
		colorUpPlants  (0.470, 0.540, 0.850, 0.000)
		BumpHeight      9.37358
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          52.2891
		Velocity        -1039.24
		BumpHeight      42.9172
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.28085
		mainOctaves     12
		Coverage        0.104047
		stripeZones     6.89271
		stripeFluct     0.391618
		stripeTwist     11.0883
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          223.96
		Density         5462.53
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0319221
		Saturation      0.84313

		Composition
		{
			H2    	91.5632
			He    	8.02294
			CH4   	0.321491
			N2    	0.0414153
			NH3   	0.0331445
			O2    	0.00942413
			C2H2  	0.0035595
			C2H4  	0.00150641
			Ne    	0.00137994
			Ar    	0.000825815
			C2H6  	0.000658458
			C3H8  	0.000411009
		}
	}

	Aurora
	{
		Height      2550.44
		NorthLat    83.5641
		NorthLon    -93.7058
		NorthRadius 25561.2
		NorthWidth  13423.9
		NorthRings  5
		NorthBright 1
		NorthParticles 10000
		SouthLat    -82.4858
		SouthLon    87.1483
		SouthRadius 21919.3
		SouthWidth  10256.4
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
		SemiMajorAxis   1.47113
		Period          1.30239
		Eccentricity    0.0583463
		Inclination     -1.75249
		AscendingNode   -52.7885
		ArgOfPericenter 30.3645
		MeanAnomaly     265.758
	}
}

DwarfMoon	"Ciutric III.D1"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            1.251e-009
	Radius          9.8472
	InertiaMoment   0.392676

	Oblateness      0.220552

	Obliquity       -0.00783122
	EqAscendNode    46.6568
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.563 0.557 0.553)

	Surface
	{
		SurfStyle       0.242469
		OceanStyle      0.424481
		Randomize      (0.328, -0.786, 0.456)
		colorDistMagn   0.709145
		colorDistFreq   0.0337638
		detailScale     268.894
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.56472
		terraceProb     0.379808
		erosion         0
		montesMagn      0.463288
		montesFreq      3.14705
		montesSpiky     0.917201
		montesFraction  0.724843
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.231215
		hillsFraction   0.481088
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237523
		craterFreq      0.159448
		craterDensity   0.852138
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.458979
		volcanoTemp     1396.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.225, 0.223, 0.221, 0.000)
		colorShelf     (0.239, 0.237, 0.235, 0.000)
		colorBeach     (0.253, 0.251, 0.249, 0.000)
		colorDesert    (0.267, 0.265, 0.263, 0.000)
		colorLowland   (0.281, 0.279, 0.277, 0.000)
		colorUpland    (0.296, 0.292, 0.290, 0.000)
		colorRock      (0.310, 0.306, 0.304, 0.000)
		colorSnow      (0.324, 0.320, 0.318, 1.000)
		BumpHeight      8.86248
		BumpOffset      1.7725
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000947189
		Period          0.000646961
		Eccentricity    9.89868e-005
		Inclination     -0.00783122
		AscendingNode   46.6568
		ArgOfPericenter -95.9961
		MeanAnomaly     93.4371
	}
}

DwarfMoon	"Ciutric III.D2"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            1.77766e-009
	Radius          9.9021
	InertiaMoment   0.398132

	Oblateness      0.127209

	Obliquity       -0.00337212
	EqAscendNode    -170.683
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.518 0.514 0.511)

	Surface
	{
		SurfStyle       0.00101335
		OceanStyle      0.990185
		Randomize      (-0.048, 0.091, 0.496)
		colorDistMagn   0.770174
		colorDistFreq   0.0454841
		detailScale     270.393
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.622485
		terraceProb     0.312879
		erosion         0
		montesMagn      0.560789
		montesFreq      3.18401
		montesSpiky     0.996982
		montesFraction  0.727914
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.222998
		hillsFraction   0.625753
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241828
		craterFreq      0.272945
		craterDensity   0.917979
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.483242
		volcanoTemp     1458.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.207, 0.206, 0.204, 0.000)
		colorShelf     (0.220, 0.219, 0.217, 0.000)
		colorBeach     (0.233, 0.231, 0.230, 0.000)
		colorDesert    (0.246, 0.244, 0.242, 0.000)
		colorLowland   (0.259, 0.257, 0.255, 0.000)
		colorUpland    (0.272, 0.270, 0.268, 0.000)
		colorRock      (0.285, 0.283, 0.281, 0.000)
		colorSnow      (0.298, 0.296, 0.294, 1.000)
		BumpHeight      8.91189
		BumpOffset      1.78238
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00102474
		Period          0.00072802
		Eccentricity    3.35014e-005
		Inclination     -0.00337212
		AscendingNode   -170.683
		ArgOfPericenter 57.0102
		MeanAnomaly     118.185
	}
}

DwarfMoon	"Ciutric III.D3"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            2.49986e-009
	Radius          19.0837
	InertiaMoment   0.39923

	Oblateness      0.249

	Obliquity       0.00889567
	EqAscendNode    -17.3128
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.827 0.766 0.711)

	Surface
	{
		SurfStyle       0.100821
		OceanStyle      0.0964858
		Randomize      (-0.357, 0.190, -0.841)
		colorDistMagn   0.942025
		colorDistFreq   0.254844
		detailScale     521.113
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.504056
		terraceProb     0.126621
		erosion         0
		montesMagn      0.592385
		montesFreq      3.24091
		montesSpiky     0.961546
		montesFraction  0.469281
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.901377
		hillsFraction   0.677163
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.211344
		craterFreq      0.180489
		craterDensity   0.820305
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.478701
		volcanoTemp     1684.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.331, 0.307, 0.285, 0.000)
		colorShelf     (0.351, 0.326, 0.302, 0.000)
		colorBeach     (0.372, 0.345, 0.320, 0.000)
		colorDesert    (0.393, 0.364, 0.338, 0.000)
		colorLowland   (0.413, 0.383, 0.356, 0.000)
		colorUpland    (0.434, 0.402, 0.373, 0.000)
		colorRock      (0.455, 0.421, 0.391, 0.000)
		colorSnow      (0.475, 0.441, 0.409, 1.000)
		BumpHeight      17.1753
		BumpOffset      3.43507
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0012343
		Period          0.000962403
		Eccentricity    6.45354e-005
		Inclination     0.00889567
		AscendingNode   -17.3128
		ArgOfPericenter -175.057
		MeanAnomaly     87.6562
	}
}

Moon	"Ciutric III.1"
{
	ParentBody     "Ciutric III"
	Class	       "Selena"

	Mass            0.0147949
	Radius          1632.18
	InertiaMoment   0.367744

	Oblateness      0.0056584

	Obliquity       -0.724761
	EqAscendNode    -91.1397
	Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.993 0.993 0.994)

	Surface
	{
		SurfStyle       0.00764583
		OceanStyle      0.917914
		Randomize      (0.844, -0.177, 0.229)
		colorDistMagn   0.0635088
		colorDistFreq   181.811
		detailScale     4198.06
		colorConversion true
		drivenDarkening 0
		seaLevel        0.149378
		snowLevel       2
		tropicLatitude  0.0177092
		icecapLatitude  10
		icecapHeight    0.148556
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.95113
		venusFreq       1.76692
		venusMagn       0
		mareFreq        0.874238
		mareDensity     0.0073064
		terraceProb     0.283112
		erosion         0
		montesMagn      0.0545953
		montesFreq      62.496
		montesSpiky     0.98073
		montesFraction  0.576181
		dunesMagn       0.0533392
		dunesFreq       2124.97
		dunesFraction   0.684549
		hillsMagn       0.112657
		hillsFreq       196.512
		hillsFraction   0.560552
		hills2Fraction  0
		riversMagn      63.7712
		riversFreq      3.58278
		riversSin       6.84829
		riversOctaves   0
		canyonsMagn     0.469332
		canyonsFreq     0.589521
		canyonFraction  0.901673
		cracksMagn      0.0637072
		cracksFreq      0.842699
		cracksOctaves   0
		craterMagn      0.641468
		craterFreq      4.4072
		craterDensity   0.554618
		craterOctaves   6.80229
		craterRayedFactor 0.099223
		volcanoMagn     0.223621
		volcanoFreq     0.641517
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.305009
		volcanoRadius   0.174491
		volcanoTemp     1461.49
		lavaCoverTidal  0.424011
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.320, 0.320, 0.000)
		colorShelf     (0.370, 0.370, 0.370, 0.000)
		colorBeach     (0.243, 0.239, 0.237, 0.000)
		colorDesert    (0.302, 0.287, 0.270, 0.200)
		colorLowland   (0.326, 0.306, 0.303, 0.500)
		colorUpland    (0.341, 0.321, 0.313, 0.800)
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
		SemiMajorAxis   0.00226492
		Period          0.0023922
		Eccentricity    0.0382007
		Inclination     -0.724761
		AscendingNode   -91.1397
		ArgOfPericenter 120.677
		MeanAnomaly     -167.146
	}
}

Moon	"Ciutric III.2"
{
	ParentBody     "Ciutric III"
	Class	       "Selena"

	Mass            0.0173561
	Radius          1530.85
	InertiaMoment   0.363228

	Oblateness      0.0010983

	Obliquity       1.32244
	EqAscendNode    -81.5786
	Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.992 0.991 0.990)

	Surface
	{
		SurfStyle       0.730701
		OceanStyle      0.100501
		Randomize      (-0.903, -0.102, 0.790)
		colorDistMagn   0.0757799
		colorDistFreq   150.947
		detailScale     3937.43
		colorConversion true
		drivenDarkening 0
		seaLevel        0.171645
		snowLevel       2
		tropicLatitude  0.0349418
		icecapLatitude  10
		icecapHeight    0.170055
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.72159
		venusFreq       1.44556
		venusMagn       0
		mareFreq        0.749672
		mareDensity     0.014927
		terraceProb     0.298732
		erosion         0
		montesMagn      0.0789939
		montesFreq      54.848
		montesSpiky     0.863235
		montesFraction  0.40866
		dunesMagn       0.0364324
		dunesFreq       2054.18
		dunesFraction   0.695288
		hillsMagn       0.120943
		hillsFreq       137.812
		hillsFraction   0.368972
		hills2Fraction  0
		riversMagn      61.2459
		riversFreq      3.37888
		riversSin       5.60819
		riversOctaves   0
		canyonsMagn     0.504169
		canyonsFreq     0.561792
		canyonFraction  0.00396643
		cracksMagn      0.0643737
		cracksFreq      0.939524
		cracksOctaves   0
		craterMagn      0.596053
		craterFreq      3.36258
		craterDensity   0.971021
		craterOctaves   10.8075
		craterRayedFactor 0.173055
		volcanoMagn     0.176385
		volcanoFreq     0.818795
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.266261
		volcanoRadius   0.130144
		volcanoTemp     1512.6
		lavaCoverTidal  0.0194429
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.470, 0.400, 0.340, 0.000)
		colorShelf     (0.640, 0.600, 0.470, 0.000)
		colorBeach     (0.505, 0.434, 0.325, 0.000)
		colorDesert    (0.538, 0.441, 0.332, 0.000)
		colorLowland   (0.441, 0.327, 0.264, 0.000)
		colorUpland    (0.626, 0.505, 0.352, 0.000)
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
		SemiMajorAxis   0.00345934
		Period          0.00451552
		Eccentricity    0.00607185
		Inclination     1.32244
		AscendingNode   -81.5786
		ArgOfPericenter -58.5967
		MeanAnomaly     -23.0006
	}
}

DwarfMoon	"Ciutric III.D4"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            6.63739e-009
	Radius          27.7993
	InertiaMoment   0.399363

	RotationPeriod  359.334
	Obliquity       17.4507
	EqAscendNode    -70.3138
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.554 0.548 0.544)

	Surface
	{
		SurfStyle       0.906105
		OceanStyle      0.88336
		Randomize      (0.280, 0.829, 0.302)
		colorDistMagn   0.661575
		colorDistFreq   0.229435
		detailScale     759.107
		colorConversion true
		snowLevel       2
		tropicLatitude  0.475392
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.642705
		terraceProb     0.198477
		erosion         0
		montesMagn      0.545901
		montesFreq      2.14523
		montesSpiky     0.955395
		montesFraction  0.489071
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.79822
		hillsFraction   0.685214
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230688
		craterFreq      0.257342
		craterDensity   1.01461
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.473799
		volcanoTemp     1267.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.188, 0.192, 0.218, 0.050)
		colorShelf     (0.221, 0.225, 0.250, 0.040)
		colorBeach     (0.255, 0.258, 0.283, 0.030)
		colorDesert    (0.288, 0.291, 0.321, 0.020)
		colorLowland   (0.321, 0.323, 0.354, 0.030)
		colorUpland    (0.354, 0.356, 0.387, 0.050)
		colorRock      (0.388, 0.389, 0.430, 0.020)
		colorSnow      (0.388, 0.389, 0.430, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0197265
		Period          0.061489
		Eccentricity    0.321959
		Inclination     17.4507
		AscendingNode   -70.3138
		ArgOfPericenter 52.9589
		MeanAnomaly     -88.879
	}
}

DwarfMoon	"Ciutric III.D5"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            9.08982e-009
	Radius          16.1219
	InertiaMoment   0.39671

	Obliquity       28.2147
	EqAscendNode    -124.238
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.644 0.642 0.638)

	Surface
	{
		SurfStyle       0.259162
		OceanStyle      0.457706
		Randomize      (0.639, 0.853, 0.844)
		colorDistMagn   0.578277
		colorDistFreq   0.0779893
		detailScale     440.237
		colorConversion true
		snowLevel       2
		tropicLatitude  0.431233
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.343222
		terraceProb     0.133757
		erosion         0
		montesMagn      0.569853
		montesFreq      3.08233
		montesSpiky     0.914994
		montesFraction  0.326153
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.512684
		hillsFraction   0.612177
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217688
		craterFreq      0.22979
		craterDensity   0.946986
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.379903
		volcanoTemp     1435.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.258, 0.257, 0.255, 0.000)
		colorShelf     (0.274, 0.273, 0.271, 0.000)
		colorBeach     (0.290, 0.289, 0.287, 0.000)
		colorDesert    (0.306, 0.305, 0.303, 0.000)
		colorLowland   (0.322, 0.321, 0.319, 0.000)
		colorUpland    (0.338, 0.337, 0.335, 0.000)
		colorRock      (0.354, 0.353, 0.351, 0.000)
		colorSnow      (0.370, 0.369, 0.367, 1.000)
		BumpHeight      14.5097
		BumpOffset      2.90195
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0201558
		Period          0.0635074
		Eccentricity    0.0273572
		Inclination     28.2147
		AscendingNode   -124.238
		ArgOfPericenter 28.4265
		MeanAnomaly     73.082
	}
}

DwarfMoon	"Ciutric III.D6"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            1.24027e-008
	Radius          31.4218
	InertiaMoment   0.398489

	Obliquity       57.0571
	EqAscendNode    142.698
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.707 0.705 0.704)

	Surface
	{
		SurfStyle       0.879679
		OceanStyle      0.213828
		Randomize      (-0.274, -0.258, -0.205)
		colorDistMagn   0.0187421
		colorDistFreq   0.488987
		detailScale     858.024
		colorConversion true
		snowLevel       2
		tropicLatitude  0.517067
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.734123
		terraceProb     0.323559
		erosion         0
		montesMagn      0.476138
		montesFreq      2.81107
		montesSpiky     0.947096
		montesFraction  0.463692
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.6794
		hillsFraction   0.72215
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227953
		craterFreq      0.230099
		craterDensity   0.88497
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.559601
		volcanoTemp     1391.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.240, 0.247, 0.281, 0.050)
		colorShelf     (0.283, 0.289, 0.324, 0.040)
		colorBeach     (0.325, 0.331, 0.366, 0.030)
		colorDesert    (0.368, 0.373, 0.415, 0.020)
		colorLowland   (0.410, 0.416, 0.457, 0.030)
		colorUpland    (0.453, 0.458, 0.500, 0.050)
		colorRock      (0.495, 0.500, 0.556, 0.020)
		colorSnow      (0.495, 0.500, 0.556, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.020701
		Period          0.0661011
		Eccentricity    0.121258
		Inclination     57.0571
		AscendingNode   142.698
		ArgOfPericenter -122.504
		MeanAnomaly     96.6032
	}
}

DwarfMoon	"Ciutric III.D7"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            1.68772e-008
	Radius          16.8905
	InertiaMoment   0.399493

	RotationPeriod  2956.81
	Obliquity       -35.011
	EqAscendNode    -32.4262
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.774 0.721 0.653)

	Surface
	{
		SurfStyle       0.556232
		OceanStyle      0.144263
		Randomize      (0.539, -0.432, 0.778)
		colorDistMagn   0.58775
		colorDistFreq   0.154118
		detailScale     461.223
		colorConversion true
		snowLevel       2
		tropicLatitude  0.919546
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.695192
		terraceProb     0.154626
		erosion         0
		montesMagn      0.512101
		montesFreq      3.03349
		montesSpiky     0.935499
		montesFraction  0.340764
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.707491
		hillsFraction   0.792835
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237727
		craterFreq      0.241916
		craterDensity   0.859239
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.499538
		volcanoTemp     1472.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.302, 0.245, 0.183, 0.000)
		colorShelf     (0.310, 0.252, 0.209, 0.000)
		colorBeach     (0.364, 0.296, 0.248, 0.000)
		colorDesert    (0.395, 0.317, 0.242, 0.000)
		colorLowland   (0.434, 0.339, 0.274, 0.000)
		colorUpland    (0.480, 0.411, 0.333, 0.000)
		colorRock      (0.519, 0.447, 0.359, 0.000)
		colorSnow      (0.565, 0.476, 0.379, 1.000)
		BumpHeight      15.2014
		BumpOffset      3.04029
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0209842
		Period          0.0674623
		Eccentricity    0.475492
		Inclination     -35.011
		AscendingNode   -32.4262
		ArgOfPericenter -167.908
		MeanAnomaly     -63.6884
	}
}

DwarfMoon	"Ciutric III.D8"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            2.2925e-008
	Radius          23.7653
	InertiaMoment   0.397119

	Obliquity       -18.5148
	EqAscendNode    -82.2283
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.740 0.631 0.520)

	Surface
	{
		SurfStyle       0.343082
		OceanStyle      0.123459
		Randomize      (-0.892, 0.936, -0.751)
		colorDistMagn   0.917932
		colorDistFreq   0.463015
		detailScale     648.95
		colorConversion true
		snowLevel       2
		tropicLatitude  0.464589
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.566158
		terraceProb     0.625078
		erosion         0
		montesMagn      0.365087
		montesFreq      3.98394
		montesSpiky     0.879847
		montesFraction  0.560565
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.46562
		hillsFraction   0.548893
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249534
		craterFreq      0.263088
		craterDensity   0.873308
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.451436
		volcanoTemp     1544.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.296, 0.252, 0.208, 0.000)
		colorShelf     (0.315, 0.268, 0.221, 0.000)
		colorBeach     (0.333, 0.284, 0.234, 0.000)
		colorDesert    (0.352, 0.300, 0.247, 0.000)
		colorLowland   (0.370, 0.315, 0.260, 0.000)
		colorUpland    (0.389, 0.331, 0.273, 0.000)
		colorRock      (0.407, 0.347, 0.286, 0.000)
		colorSnow      (0.426, 0.363, 0.299, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0215375
		Period          0.0701479
		Eccentricity    0.335095
		Inclination     -18.5148
		AscendingNode   -82.2283
		ArgOfPericenter 22.4006
		MeanAnomaly     -5.9293
	}
}

DwarfMoon	"Ciutric III.D9"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            3.11117e-008
	Radius          44.7301
	InertiaMoment   0.39865

	RotationPeriod  1901.05
	Obliquity       29.2115
	EqAscendNode    178.486
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.738 0.734 0.732)

	Surface
	{
		SurfStyle       0.652429
		OceanStyle      0.389312
		Randomize      (-0.646, 0.534, 0.627)
		colorDistMagn   0.297608
		colorDistFreq   1.45271
		detailScale     1221.43
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0129
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.406688
		terraceProb     0.202184
		erosion         0
		montesMagn      0.487782
		montesFreq      3.10386
		montesSpiky     0.876449
		montesFraction  0.610675
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.29917
		hillsFraction   0.596282
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.211405
		craterFreq      0.201915
		craterDensity   0.996367
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.384364
		volcanoTemp     1733.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.288, 0.249, 0.205, 0.000)
		colorShelf     (0.295, 0.257, 0.234, 0.000)
		colorBeach     (0.347, 0.301, 0.278, 0.000)
		colorDesert    (0.376, 0.323, 0.271, 0.000)
		colorLowland   (0.413, 0.345, 0.308, 0.000)
		colorUpland    (0.458, 0.418, 0.373, 0.000)
		colorRock      (0.494, 0.455, 0.403, 0.000)
		colorSnow      (0.539, 0.484, 0.425, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0219738
		Period          0.0722903
		Eccentricity    0.475801
		Inclination     29.2115
		AscendingNode   178.486
		ArgOfPericenter 134.187
		MeanAnomaly     -44.789
	}
}

DwarfMoon	"Ciutric III.D10"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            4.222e-008
	Radius          25.5725
	InertiaMoment   0.399621

	RotationPeriod  1325.33
	Obliquity       -12.4393
	EqAscendNode    -132.759
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.558 0.554 0.553)

	Surface
	{
		SurfStyle       0.735032
		OceanStyle      0.67641
		Randomize      (-0.823, -0.317, 0.773)
		colorDistMagn   0.37512
		colorDistFreq   0.287009
		detailScale     698.299
		colorConversion true
		snowLevel       2
		tropicLatitude  0.171973
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.49664
		terraceProb     0.157536
		erosion         0
		montesMagn      0.537695
		montesFreq      3.39816
		montesSpiky     0.930342
		montesFraction  0.798104
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.64263
		hillsFraction   0.781072
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258098
		craterFreq      0.239464
		craterDensity   1.0018
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49834
		volcanoTemp     1310.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.218, 0.188, 0.155, 0.000)
		colorShelf     (0.223, 0.194, 0.177, 0.000)
		colorBeach     (0.262, 0.227, 0.210, 0.000)
		colorDesert    (0.285, 0.244, 0.204, 0.000)
		colorLowland   (0.313, 0.260, 0.232, 0.000)
		colorUpland    (0.346, 0.316, 0.282, 0.000)
		colorRock      (0.374, 0.344, 0.304, 0.000)
		colorSnow      (0.408, 0.366, 0.320, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0226388
		Period          0.0755966
		Eccentricity    0.399591
		Inclination     -12.4393
		AscendingNode   -132.759
		ArgOfPericenter 69.1973
		MeanAnomaly     -94.4101
	}
}

DwarfMoon	"Ciutric III.D11"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            5.73411e-008
	Radius          49.316
	InertiaMoment   0.397435

	RotationPeriod  921.441
	Obliquity       -30.2609
	EqAscendNode    -29.031
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.564 0.557 0.555)

	Surface
	{
		SurfStyle       0.120063
		OceanStyle      0.528162
		Randomize      (0.991, -0.438, 0.647)
		colorDistMagn   0.494534
		colorDistFreq   1.60736
		detailScale     1346.66
		colorConversion true
		snowLevel       2
		tropicLatitude  0.851719
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.452189
		terraceProb     0.236143
		erosion         0
		montesMagn      0.542242
		montesFreq      2.40271
		montesSpiky     0.987045
		montesFraction  0.668313
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.99106
		hillsFraction   0.540169
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219689
		craterFreq      0.184107
		craterDensity   1.04948
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.464156
		volcanoTemp     1647.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.226, 0.223, 0.222, 0.000)
		colorShelf     (0.240, 0.237, 0.236, 0.000)
		colorBeach     (0.254, 0.251, 0.250, 0.000)
		colorDesert    (0.268, 0.265, 0.264, 0.000)
		colorLowland   (0.282, 0.279, 0.277, 0.000)
		colorUpland    (0.296, 0.293, 0.291, 0.000)
		colorRock      (0.310, 0.307, 0.305, 0.000)
		colorSnow      (0.325, 0.320, 0.319, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0232814
		Period          0.0788382
		Eccentricity    0.427543
		Inclination     -30.2609
		AscendingNode   -29.031
		ArgOfPericenter -66.0189
		MeanAnomaly     -9.76698
	}
}

DwarfMoon	"Ciutric III.D12"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            7.80098e-008
	Radius          36.2189
	InertiaMoment   0.398803

	Obliquity       -83.2232
	EqAscendNode    -102.947
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.719 0.666 0.608)

	Surface
	{
		SurfStyle       0.349224
		OceanStyle      0.348781
		Randomize      (-0.028, -0.640, 0.173)
		colorDistMagn   0.766642
		colorDistFreq   0.68587
		detailScale     989.019
		colorConversion true
		snowLevel       2
		tropicLatitude  0.972031
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.351092
		terraceProb     0.388441
		erosion         0
		montesMagn      0.558403
		montesFreq      3.63708
		montesSpiky     0.877193
		montesFraction  0.805913
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.33142
		hillsFraction   0.626593
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23978
		craterFreq      0.193089
		craterDensity   0.964004
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53781
		volcanoTemp     1381.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.287, 0.267, 0.243, 0.000)
		colorShelf     (0.305, 0.283, 0.258, 0.000)
		colorBeach     (0.323, 0.300, 0.273, 0.000)
		colorDesert    (0.341, 0.316, 0.289, 0.000)
		colorLowland   (0.359, 0.333, 0.304, 0.000)
		colorUpland    (0.377, 0.350, 0.319, 0.000)
		colorRock      (0.395, 0.366, 0.334, 0.000)
		colorSnow      (0.413, 0.383, 0.349, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0238303
		Period          0.0816425
		Eccentricity    0.383106
		Inclination     -83.2232
		AscendingNode   -102.947
		ArgOfPericenter 99.0973
		MeanAnomaly     160.303
	}
}

DwarfMoon	"Ciutric III.D13"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            1.06406e-007
	Radius          37.2453
	InertiaMoment   0.399747

	Obliquity       1.09581
	EqAscendNode    120.868
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.655 0.653 0.648)

	Surface
	{
		SurfStyle       0.703611
		OceanStyle      0.213335
		Randomize      (-0.482, -0.545, -0.695)
		colorDistMagn   0.668611
		colorDistFreq   0.803523
		detailScale     1017.04
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0188724
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.379098
		terraceProb     0.329877
		erosion         0
		montesMagn      0.558231
		montesFreq      2.67688
		montesSpiky     0.809457
		montesFraction  0.350102
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.78655
		hillsFraction   0.596101
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255741
		craterFreq      0.171422
		craterDensity   0.868991
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.518569
		volcanoTemp     1909.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.256, 0.222, 0.181, 0.000)
		colorShelf     (0.262, 0.228, 0.207, 0.000)
		colorBeach     (0.308, 0.268, 0.246, 0.000)
		colorDesert    (0.334, 0.287, 0.240, 0.000)
		colorLowland   (0.367, 0.307, 0.272, 0.000)
		colorUpland    (0.406, 0.372, 0.331, 0.000)
		colorRock      (0.439, 0.405, 0.356, 0.000)
		colorSnow      (0.478, 0.431, 0.376, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.024473
		Period          0.0849679
		Eccentricity    0.212617
		Inclination     1.09581
		AscendingNode   120.868
		ArgOfPericenter -72.9839
		MeanAnomaly     -37.6673
	}
}

DwarfMoon	"Ciutric III.D14"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            1.45657e-007
	Radius          72.3017
	InertiaMoment   0.397697

	Obliquity       -74.6055
	EqAscendNode    -103.917
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.593 0.444 0.353)

	Surface
	{
		SurfStyle       0.963016
		OceanStyle      0.0990033
		Randomize      (0.385, -0.950, 0.776)
		colorDistMagn   0.181827
		colorDistFreq   0.167571
		detailScale     1974.32
		colorConversion true
		snowLevel       2
		tropicLatitude  0.955793
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.745536
		terraceProb     0.121114
		erosion         0
		montesMagn      0.565098
		montesFreq      3.02695
		montesSpiky     0.849394
		montesFraction  0.735395
		dunesFraction   0
		hillsMagn       0
		hillsFreq       14.1359
		hillsFraction   0.908229
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221488
		craterFreq      0.195492
		craterDensity   0.935261
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.585351
		volcanoTemp     1436.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.202, 0.156, 0.141, 0.050)
		colorShelf     (0.237, 0.182, 0.162, 0.040)
		colorBeach     (0.273, 0.209, 0.184, 0.030)
		colorDesert    (0.309, 0.236, 0.208, 0.020)
		colorLowland   (0.344, 0.262, 0.230, 0.030)
		colorUpland    (0.380, 0.289, 0.251, 0.050)
		colorRock      (0.415, 0.316, 0.279, 0.020)
		colorSnow      (0.415, 0.316, 0.279, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0249972
		Period          0.0877123
		Eccentricity    0.0770453
		Inclination     -74.6055
		AscendingNode   -103.917
		ArgOfPericenter -100.922
		MeanAnomaly     -157.546
	}
}

DwarfMoon	"Ciutric III.D15"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            2.0031e-007
	Radius          40.2853
	InertiaMoment   0.398949

	RotationPeriod  1599.29
	Obliquity       -75.6667
	EqAscendNode    -141.711
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.470 0.418 0.353)

	Surface
	{
		SurfStyle       0.767619
		OceanStyle      0.747919
		Randomize      (0.958, 0.325, 0.019)
		colorDistMagn   0.514496
		colorDistFreq   0.569304
		detailScale     1100.06
		colorConversion true
		snowLevel       2
		tropicLatitude  0.602552
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.411511
		terraceProb     0.411178
		erosion         0
		montesMagn      0.458783
		montesFreq      2.79151
		montesSpiky     0.981134
		montesFraction  0.624152
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.88485
		hillsFraction   0.617219
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236773
		craterFreq      0.207589
		craterDensity   0.858891
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.453224
		volcanoTemp     1857.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.183, 0.142, 0.099, 0.000)
		colorShelf     (0.188, 0.146, 0.113, 0.000)
		colorBeach     (0.221, 0.171, 0.134, 0.000)
		colorDesert    (0.240, 0.184, 0.131, 0.000)
		colorLowland   (0.263, 0.196, 0.148, 0.000)
		colorUpland    (0.291, 0.238, 0.180, 0.000)
		colorRock      (0.315, 0.259, 0.194, 0.000)
		colorSnow      (0.343, 0.276, 0.205, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0256598
		Period          0.0912229
		Eccentricity    0.287586
		Inclination     -75.6667
		AscendingNode   -141.711
		ArgOfPericenter -73.8336
		MeanAnomaly     145.008
	}
}

DwarfMoon	"Ciutric III.D16"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            2.77061e-007
	Radius          99.0968
	InertiaMoment   0.399873

	RotationPeriod  2478.6
	Obliquity       70.1084
	EqAscendNode    -62.3826
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.720 0.716 0.713)

	Surface
	{
		SurfStyle       0.463082
		OceanStyle      0.109693
		Randomize      (0.457, -0.684, -0.759)
		colorDistMagn   0.846524
		colorDistFreq   2.40089
		detailScale     2706
		colorConversion true
		snowLevel       2
		tropicLatitude  0.955763
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.642971
		terraceProb     0.35455
		erosion         0
		montesMagn      0.51404
		montesFreq      2.97112
		montesSpiky     0.952546
		montesFraction  0.50617
		dunesFraction   0
		hillsMagn       0
		hillsFreq       27.5407
		hillsFraction   0.522215
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2679
		craterFreq      0.306329
		craterDensity   0.700218
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.444845
		volcanoTemp     1628.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.288, 0.287, 0.285, 0.000)
		colorShelf     (0.306, 0.304, 0.303, 0.000)
		colorBeach     (0.324, 0.322, 0.321, 0.000)
		colorDesert    (0.342, 0.340, 0.339, 0.000)
		colorLowland   (0.360, 0.358, 0.356, 0.000)
		colorUpland    (0.378, 0.376, 0.374, 0.000)
		colorRock      (0.396, 0.394, 0.392, 0.000)
		colorSnow      (0.414, 0.412, 0.410, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0262249
		Period          0.0942526
		Eccentricity    0.29309
		Inclination     70.1084
		AscendingNode   -62.3826
		ArgOfPericenter -15.0794
		MeanAnomaly     55.4192
	}
}

DwarfMoon	"Ciutric III.D17"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            3.85931e-007
	Radius          57.7448
	InertiaMoment   0.397924

	RotationPeriod  4190.07
	Obliquity       -16.8141
	EqAscendNode    -38.5904
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.503 0.496 0.491)

	Surface
	{
		SurfStyle       0.902868
		OceanStyle      0.468742
		Randomize      (-0.723, -0.407, -0.297)
		colorDistMagn   0.255989
		colorDistFreq   2.15751
		detailScale     1576.82
		colorConversion true
		snowLevel       2
		tropicLatitude  0.525294
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.626256
		terraceProb     0.442527
		erosion         0
		montesMagn      0.607535
		montesFreq      3.13234
		montesSpiky     0.923392
		montesFraction  0.201647
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.5046
		hillsFraction   0.588652
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244384
		craterFreq      0.228641
		craterDensity   0.848882
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.492503
		volcanoTemp     1541.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.171, 0.174, 0.196, 0.050)
		colorShelf     (0.201, 0.203, 0.226, 0.040)
		colorBeach     (0.232, 0.233, 0.255, 0.030)
		colorDesert    (0.262, 0.263, 0.290, 0.020)
		colorLowland   (0.292, 0.293, 0.319, 0.030)
		colorUpland    (0.322, 0.322, 0.349, 0.050)
		colorRock      (0.352, 0.352, 0.388, 0.020)
		colorSnow      (0.352, 0.352, 0.388, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0264743
		Period          0.0956003
		Eccentricity    0.121334
		Inclination     -16.8141
		AscendingNode   -38.5904
		ArgOfPericenter 121.923
		MeanAnomaly     -85.1813
	}
}

DwarfMoon	"Ciutric III.D18"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            5.42176e-007
	Radius          60.9073
	InertiaMoment   0.39909

	Obliquity       -78.8541
	EqAscendNode    -62.71
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.834 0.782 0.742)

	Surface
	{
		SurfStyle       0.115117
		OceanStyle      0.550698
		Randomize      (-0.003, -0.629, -0.187)
		colorDistMagn   0.996593
		colorDistFreq   2.29653
		detailScale     1663.18
		colorConversion true
		snowLevel       2
		tropicLatitude  0.914762
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.381817
		terraceProb     0.30803
		erosion         0
		montesMagn      0.598064
		montesFreq      3.22644
		montesSpiky     0.795688
		montesFraction  0.36375
		dunesFraction   0
		hillsMagn       0
		hillsFreq       10.3588
		hillsFraction   0.654683
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258717
		craterFreq      0.174723
		craterDensity   0.948482
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.519671
		volcanoTemp     1251.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.334, 0.313, 0.297, 0.000)
		colorShelf     (0.355, 0.332, 0.315, 0.000)
		colorBeach     (0.375, 0.352, 0.334, 0.000)
		colorDesert    (0.396, 0.371, 0.353, 0.000)
		colorLowland   (0.417, 0.391, 0.371, 0.000)
		colorUpland    (0.438, 0.410, 0.390, 0.000)
		colorRock      (0.459, 0.430, 0.408, 0.000)
		colorSnow      (0.480, 0.449, 0.427, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0269651
		Period          0.0982713
		Eccentricity    0.272338
		Inclination     -78.8541
		AscendingNode   -62.71
		ArgOfPericenter -88.4054
		MeanAnomaly     151.161
	}
}

DwarfMoon	"Ciutric III.D19"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            7.695e-007
	Radius          120.547
	InertiaMoment   0.399998

	RotationPeriod  1487.86
	Obliquity       -82.097
	EqAscendNode    17.9978
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.629 0.508 0.401)

	Surface
	{
		SurfStyle       0.231968
		OceanStyle      0.401652
		Randomize      (0.137, 0.742, -0.179)
		colorDistMagn   0.300353
		colorDistFreq   4.30515
		detailScale     3291.74
		colorConversion true
		snowLevel       2
		tropicLatitude  0.405301
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.632965
		terraceProb     0.219234
		erosion         0
		montesMagn      0.338918
		montesFreq      2.83922
		montesSpiky     0.89096
		montesFraction  0.738014
		dunesFraction   0
		hillsMagn       0
		hillsFreq       43.2832
		hillsFraction   0.752091
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225748
		craterFreq      0.368773
		craterDensity   0.675695
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.520357
		volcanoTemp     1374.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.252, 0.203, 0.160, 0.000)
		colorShelf     (0.267, 0.216, 0.170, 0.000)
		colorBeach     (0.283, 0.229, 0.180, 0.000)
		colorDesert    (0.299, 0.241, 0.190, 0.000)
		colorLowland   (0.315, 0.254, 0.200, 0.000)
		colorUpland    (0.330, 0.267, 0.210, 0.000)
		colorRock      (0.346, 0.279, 0.220, 0.000)
		colorSnow      (0.362, 0.292, 0.230, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0276142
		Period          0.101841
		Eccentricity    0.479966
		Inclination     -82.097
		AscendingNode   17.9978
		ArgOfPericenter -139.13
		MeanAnomaly     85.0172
	}
}

DwarfMoon	"Ciutric III.D20"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            1.10558e-006
	Radius          90.429
	InertiaMoment   0.398127

	RotationPeriod  4578.91
	Obliquity       -25.2481
	EqAscendNode    -71.4517
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.671 0.664 0.661)

	Surface
	{
		SurfStyle       0.813178
		OceanStyle      0.163273
		Randomize      (-0.622, -0.998, 0.743)
		colorDistMagn   0.87007
		colorDistFreq   1.43735
		detailScale     2469.31
		colorConversion true
		snowLevel       2
		tropicLatitude  0.6497
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.619126
		terraceProb     0.543513
		erosion         0
		montesMagn      0.505104
		montesFreq      3.17541
		montesSpiky     0.965058
		montesFraction  0.446317
		dunesFraction   0
		hillsMagn       0
		hillsFreq       19.0072
		hillsFraction   0.8359
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221042
		craterFreq      0.259274
		craterDensity   0.910169
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.442608
		volcanoTemp     1474.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.262, 0.226, 0.185, 0.000)
		colorShelf     (0.269, 0.233, 0.212, 0.000)
		colorBeach     (0.316, 0.272, 0.251, 0.000)
		colorDesert    (0.342, 0.292, 0.245, 0.000)
		colorLowland   (0.376, 0.312, 0.278, 0.000)
		colorUpland    (0.416, 0.379, 0.337, 0.000)
		colorRock      (0.450, 0.412, 0.364, 0.000)
		colorSnow      (0.490, 0.438, 0.384, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0280878
		Period          0.104472
		Eccentricity    0.330836
		Inclination     -25.2481
		AscendingNode   -71.4517
		ArgOfPericenter 83.9464
		MeanAnomaly     -139.586
	}
}

DwarfMoon	"Ciutric III.D21"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            1.61193e-006
	Radius          169.797
	InertiaMoment   0.399227

	RotationPeriod  1414.17
	Obliquity       11.0744
	EqAscendNode    146.587
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.478 0.475 0.470)

	Surface
	{
		SurfStyle       0.811944
		OceanStyle      0.0449946
		Randomize      (-0.321, -0.617, 0.086)
		colorDistMagn   0.383239
		colorDistFreq   17.4155
		detailScale     4636.58
		colorConversion true
		snowLevel       2
		tropicLatitude  0.110269
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.553167
		terraceProb     0.229677
		erosion         0
		montesMagn      0.46142
		montesFreq      1.76444
		montesSpiky     0.913375
		montesFraction  0.491814
		dunesFraction   0
		hillsMagn       0
		hillsFreq       60.9426
		hillsFraction   0.382591
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261501
		craterFreq      1.13585
		craterDensity   0.78155
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.488558
		volcanoTemp     1657.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.186, 0.162, 0.132, 0.000)
		colorShelf     (0.191, 0.166, 0.150, 0.000)
		colorBeach     (0.225, 0.195, 0.179, 0.000)
		colorDesert    (0.244, 0.209, 0.174, 0.000)
		colorLowland   (0.268, 0.223, 0.198, 0.000)
		colorUpland    (0.296, 0.271, 0.240, 0.000)
		colorRock      (0.320, 0.295, 0.259, 0.000)
		colorSnow      (0.349, 0.314, 0.273, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0286372
		Period          0.107552
		Eccentricity    0.497672
		Inclination     11.0744
		AscendingNode   146.587
		ArgOfPericenter -93.2935
		MeanAnomaly     -46.7568
	}
}

DwarfMoon	"Ciutric III.D22"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            2.3921e-006
	Radius          100.728
	InertiaMoment   0.396063

	RotationPeriod  1434.08
	Obliquity       -29.8759
	EqAscendNode    -26.4207
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.534 0.530 0.525)

	Surface
	{
		SurfStyle       0.55926
		OceanStyle      0.860796
		Randomize      (0.243, 0.128, -0.887)
		colorDistMagn   0.869666
		colorDistFreq   5.8303
		detailScale     2750.54
		colorConversion true
		snowLevel       2
		tropicLatitude  0.848208
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.750709
		terraceProb     0.125253
		erosion         0
		montesMagn      0.49573
		montesFreq      2.60595
		montesSpiky     0.952231
		montesFraction  0.462219
		dunesFraction   0
		hillsMagn       0
		hillsFreq       17.787
		hillsFraction   0.555939
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228917
		craterFreq      0.329622
		craterDensity   0.927635
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.475186
		volcanoTemp     1500.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.208, 0.180, 0.147, 0.000)
		colorShelf     (0.213, 0.186, 0.168, 0.000)
		colorBeach     (0.251, 0.217, 0.199, 0.000)
		colorDesert    (0.272, 0.233, 0.194, 0.000)
		colorLowland   (0.299, 0.249, 0.220, 0.000)
		colorUpland    (0.331, 0.302, 0.268, 0.000)
		colorRock      (0.358, 0.329, 0.289, 0.000)
		colorSnow      (0.390, 0.350, 0.304, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0289053
		Period          0.109066
		Eccentricity    0.233135
		Inclination     -29.8759
		AscendingNode   -26.4207
		ArgOfPericenter -153.474
		MeanAnomaly     100.994
	}
}

DwarfMoon	"Ciutric III.D23"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            3.62694e-006
	Radius          108.534
	InertiaMoment   0.398313

	Obliquity       -67.5445
	EqAscendNode    160.789
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.585 0.583 0.579)

	Surface
	{
		SurfStyle       0.583172
		OceanStyle      0.3102
		Randomize      (-0.794, 0.602, -0.631)
		colorDistMagn   0.0617469
		colorDistFreq   10.0142
		detailScale     2963.71
		colorConversion true
		snowLevel       2
		tropicLatitude  0.304737
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.343445
		terraceProb     0.211383
		erosion         0
		montesMagn      0.412032
		montesFreq      2.22478
		montesSpiky     0.946475
		montesFraction  0.195704
		dunesFraction   0
		hillsMagn       0
		hillsFreq       35.1553
		hillsFraction   0.463654
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241847
		craterFreq      0.409512
		craterDensity   0.828869
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.490948
		volcanoTemp     1437.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.228, 0.198, 0.162, 0.000)
		colorShelf     (0.234, 0.204, 0.185, 0.000)
		colorBeach     (0.275, 0.239, 0.220, 0.000)
		colorDesert    (0.299, 0.257, 0.214, 0.000)
		colorLowland   (0.328, 0.274, 0.243, 0.000)
		colorUpland    (0.363, 0.332, 0.296, 0.000)
		colorRock      (0.392, 0.362, 0.319, 0.000)
		colorSnow      (0.427, 0.385, 0.336, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0292595
		Period          0.111077
		Eccentricity    0.161898
		Inclination     -67.5445
		AscendingNode   160.789
		ArgOfPericenter -4.4824
		MeanAnomaly     20.9173
	}
}

DwarfMoon	"Ciutric III.D24"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            5.64642e-006
	Radius          278.001
	InertiaMoment   0.39936

	Obliquity       -18.0819
	EqAscendNode    -72.5598
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.634 0.631 0.629)

	Surface
	{
		SurfStyle       0.127829
		OceanStyle      0.194812
		Randomize      (-0.011, -0.177, -0.290)
		colorDistMagn   0.886454
		colorDistFreq   55.1829
		detailScale     7591.27
		colorConversion true
		snowLevel       2
		tropicLatitude  0.484495
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.560109
		terraceProb     0.161492
		erosion         0
		montesMagn      0.536078
		montesFreq      3.08701
		montesSpiky     0.967572
		montesFraction  0.440252
		dunesFraction   0
		hillsMagn       0
		hillsFreq       161.8
		hillsFraction   0.813094
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262582
		craterFreq      3.01317
		craterDensity   0.986973
		craterOctaves   17
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.487613
		volcanoTemp     1340.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.254, 0.252, 0.252, 0.000)
		colorShelf     (0.269, 0.268, 0.267, 0.000)
		colorBeach     (0.285, 0.284, 0.283, 0.000)
		colorDesert    (0.301, 0.300, 0.299, 0.000)
		colorLowland   (0.317, 0.315, 0.314, 0.000)
		colorUpland    (0.333, 0.331, 0.330, 0.000)
		colorRock      (0.349, 0.347, 0.346, 0.000)
		colorSnow      (0.364, 0.363, 0.362, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0295367
		Period          0.112659
		Eccentricity    0.0186245
		Inclination     -18.0819
		AscendingNode   -72.5598
		ArgOfPericenter 77.1323
		MeanAnomaly     -82.5221
	}
}

DwarfMoon	"Ciutric III.D25"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            1.77957e-011
	Radius          2.11094
	InertiaMoment   0.396699

	RotationPeriod  4989.61
	Obliquity       -87.0343
	EqAscendNode    -7.76389
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.643 0.637 0.634)

	Surface
	{
		SurfStyle       0.42284
		OceanStyle      0.682281
		Randomize      (0.230, 0.803, 0.747)
		colorDistMagn   0.97723
		colorDistFreq   0.000912959
		detailScale     57.6427
		colorConversion true
		snowLevel       2
		tropicLatitude  0.169652
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.712724
		terraceProb     0.444717
		erosion         0
		montesMagn      0.415223
		montesFreq      2.81395
		montesSpiky     0.975872
		montesFraction  0.478409
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0111565
		hillsFraction   0.790056
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.215925
		craterFreq      0.203581
		craterDensity   0.899863
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.489633
		volcanoTemp     1669.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.257, 0.255, 0.254, 0.000)
		colorShelf     (0.273, 0.271, 0.269, 0.000)
		colorBeach     (0.289, 0.287, 0.285, 0.000)
		colorDesert    (0.305, 0.303, 0.301, 0.000)
		colorLowland   (0.321, 0.319, 0.317, 0.000)
		colorUpland    (0.337, 0.335, 0.333, 0.000)
		colorRock      (0.354, 0.351, 0.349, 0.000)
		colorSnow      (0.370, 0.366, 0.364, 1.000)
		BumpHeight      1.89984
		BumpOffset      0.379969
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0297432
		Period          0.113843
		Eccentricity    0.478052
		Inclination     -87.0343
		AscendingNode   -7.76389
		ArgOfPericenter -179.017
		MeanAnomaly     170.076
	}
}

DwarfMoon	"Ciutric III.D26"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            3.44384e-011
	Radius          4.548
	InertiaMoment   0.398485

	RotationPeriod  1686.91
	Obliquity       -61.6499
	EqAscendNode    -145.269
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.553 0.544 0.541)

	Surface
	{
		SurfStyle       0.258763
		OceanStyle      0.720807
		Randomize      (0.158, 0.553, -0.149)
		colorDistMagn   0.736718
		colorDistFreq   0.00227987
		detailScale     124.191
		colorConversion true
		snowLevel       2
		tropicLatitude  0.506895
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.64326
		terraceProb     0.364027
		erosion         0
		montesMagn      0.514406
		montesFreq      2.80307
		montesSpiky     0.94896
		montesFraction  0.777344
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0461496
		hillsFraction   0.543469
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230579
		craterFreq      0.204223
		craterDensity   0.749777
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.584299
		volcanoTemp     1531.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.221, 0.217, 0.216, 0.000)
		colorShelf     (0.235, 0.231, 0.230, 0.000)
		colorBeach     (0.249, 0.245, 0.243, 0.000)
		colorDesert    (0.263, 0.258, 0.257, 0.000)
		colorLowland   (0.276, 0.272, 0.270, 0.000)
		colorUpland    (0.290, 0.285, 0.284, 0.000)
		colorRock      (0.304, 0.299, 0.297, 0.000)
		colorSnow      (0.318, 0.313, 0.311, 1.000)
		BumpHeight      4.0932
		BumpOffset      0.81864
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0300252
		Period          0.115465
		Eccentricity    0.291223
		Inclination     -61.6499
		AscendingNode   -145.269
		ArgOfPericenter 164.222
		MeanAnomaly     47.8831
	}
}

DwarfMoon	"Ciutric III.D27"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            6.15647e-011
	Radius          2.81905
	InertiaMoment   0.39949

	RotationPeriod  1728.73
	Obliquity       -16.9864
	EqAscendNode    -86.2197
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.653 0.650 0.648)

	Surface
	{
		SurfStyle       0.525972
		OceanStyle      0.523619
		Randomize      (-0.550, 0.789, -0.306)
		colorDistMagn   0.820961
		colorDistFreq   0.0029648
		detailScale     76.979
		colorConversion true
		snowLevel       2
		tropicLatitude  0.416742
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.592371
		terraceProb     0.476766
		erosion         0
		montesMagn      0.620513
		montesFreq      3.49401
		montesSpiky     0.808069
		montesFraction  0.517639
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.015017
		hillsFraction   0.753485
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217642
		craterFreq      0.228663
		craterDensity   0.885029
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.504985
		volcanoTemp     1211.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.255, 0.221, 0.182, 0.000)
		colorShelf     (0.261, 0.228, 0.207, 0.000)
		colorBeach     (0.307, 0.267, 0.246, 0.000)
		colorDesert    (0.333, 0.286, 0.240, 0.000)
		colorLowland   (0.366, 0.306, 0.272, 0.000)
		colorUpland    (0.405, 0.371, 0.331, 0.000)
		colorRock      (0.437, 0.403, 0.357, 0.000)
		colorSnow      (0.476, 0.429, 0.376, 1.000)
		BumpHeight      2.53715
		BumpOffset      0.50743
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0305193
		Period          0.118328
		Eccentricity    0.292752
		Inclination     -16.9864
		AscendingNode   -86.2197
		ArgOfPericenter 92.8037
		MeanAnomaly     2.96517
	}
}

DwarfMoon	"Ciutric III.D28"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            1.03912e-010
	Radius          4.29117
	InertiaMoment   0.397112

	RotationPeriod  2621.59
	Obliquity       -43.2983
	EqAscendNode    -141.665
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.725 0.722 0.720)

	Surface
	{
		SurfStyle       0.708254
		OceanStyle      0.127984
		Randomize      (0.478, -0.269, -0.946)
		colorDistMagn   0.863002
		colorDistFreq   0.00995828
		detailScale     117.178
		colorConversion true
		snowLevel       2
		tropicLatitude  0.438773
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.639911
		terraceProb     0.254358
		erosion         0
		montesMagn      0.479497
		montesFreq      2.80909
		montesSpiky     0.931828
		montesFraction  0.388268
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0327927
		hillsFraction   0.565812
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245183
		craterFreq      0.177498
		craterDensity   0.993595
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.479284
		volcanoTemp     1488.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.283, 0.245, 0.202, 0.000)
		colorShelf     (0.290, 0.253, 0.230, 0.000)
		colorBeach     (0.341, 0.296, 0.273, 0.000)
		colorDesert    (0.370, 0.318, 0.266, 0.000)
		colorLowland   (0.406, 0.339, 0.302, 0.000)
		colorUpland    (0.449, 0.411, 0.367, 0.000)
		colorRock      (0.486, 0.447, 0.396, 0.000)
		colorSnow      (0.529, 0.476, 0.417, 1.000)
		BumpHeight      3.86205
		BumpOffset      0.772411
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0307426
		Period          0.119628
		Eccentricity    0.22157
		Inclination     -43.2983
		AscendingNode   -141.665
		ArgOfPericenter -55.5193
		MeanAnomaly     -84.2713
	}
}

DwarfMoon	"Ciutric III.D29"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            1.67928e-010
	Radius          8.09776
	InertiaMoment   0.398647

	Obliquity       43.393
	EqAscendNode    -19.7441
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.626 0.557 0.513)

	Surface
	{
		SurfStyle       0.892627
		OceanStyle      0.971632
		Randomize      (0.542, -0.433, 0.592)
		colorDistMagn   0.340383
		colorDistFreq   0.0427663
		detailScale     221.123
		colorConversion true
		snowLevel       2
		tropicLatitude  0.996482
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.553393
		terraceProb     0.248149
		erosion         0
		montesMagn      0.276062
		montesFreq      3.63483
		montesSpiky     0.990146
		montesFraction  0.522125
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.158262
		hillsFraction   0.516207
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259309
		craterFreq      0.228338
		craterDensity   0.807295
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.457217
		volcanoTemp     1568.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.213, 0.195, 0.205, 0.050)
		colorShelf     (0.250, 0.228, 0.236, 0.040)
		colorBeach     (0.288, 0.262, 0.267, 0.030)
		colorDesert    (0.325, 0.295, 0.302, 0.020)
		colorLowland   (0.363, 0.329, 0.333, 0.030)
		colorUpland    (0.400, 0.362, 0.364, 0.050)
		colorRock      (0.438, 0.395, 0.405, 0.020)
		colorSnow      (0.438, 0.395, 0.405, 1.000)
		BumpHeight      7.28798
		BumpOffset      1.4576
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.031096
		Period          0.121697
		Eccentricity    0.307866
		Inclination     43.393
		AscendingNode   -19.7441
		ArgOfPericenter 51.8259
		MeanAnomaly     -127.484
	}
}

DwarfMoon	"Ciutric III.D30"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            2.62331e-010
	Radius          4.90191
	InertiaMoment   0.399618

	Obliquity       82.6367
	EqAscendNode    -114.9
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.622 0.507 0.406)

	Surface
	{
		SurfStyle       0.878443
		OceanStyle      0.261996
		Randomize      (-0.251, 0.034, 0.623)
		colorDistMagn   0.796585
		colorDistFreq   0.0199649
		detailScale     133.855
		colorConversion true
		snowLevel       2
		tropicLatitude  0.902571
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.330696
		terraceProb     0.494241
		erosion         0
		montesMagn      0.646188
		montesFreq      3.60208
		montesSpiky     0.862752
		montesFraction  0.688286
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0523517
		hillsFraction   0.787305
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236407
		craterFreq      0.235886
		craterDensity   0.896275
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.487339
		volcanoTemp     1133.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.212, 0.177, 0.162, 0.050)
		colorShelf     (0.249, 0.208, 0.187, 0.040)
		colorBeach     (0.286, 0.238, 0.211, 0.030)
		colorDesert    (0.324, 0.269, 0.239, 0.020)
		colorLowland   (0.361, 0.299, 0.264, 0.030)
		colorUpland    (0.398, 0.329, 0.288, 0.050)
		colorRock      (0.436, 0.360, 0.321, 0.020)
		colorSnow      (0.436, 0.360, 0.321, 1.000)
		BumpHeight      4.41172
		BumpOffset      0.882344
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0316699
		Period          0.125082
		Eccentricity    0.252299
		Inclination     82.6367
		AscendingNode   -114.9
		ArgOfPericenter 86.807
		MeanAnomaly     -118.923
	}
}

DwarfMoon	"Ciutric III.D31"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            3.98858e-010
	Radius          9.9231
	InertiaMoment   0.397428

	Obliquity       68.4333
	EqAscendNode    -55.5569
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.556 0.493 0.447)

	Surface
	{
		SurfStyle       0.608404
		OceanStyle      0.462453
		Randomize      (0.202, 0.525, -0.715)
		colorDistMagn   0.384191
		colorDistFreq   0.00826624
		detailScale     270.967
		colorConversion true
		snowLevel       2
		tropicLatitude  0.935227
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.36073
		terraceProb     0.261268
		erosion         0
		montesMagn      0.599902
		montesFreq      2.868
		montesSpiky     0.91466
		montesFraction  0.26957
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.193786
		hillsFraction   0.545747
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242108
		craterFreq      0.229658
		craterDensity   0.89192
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.450946
		volcanoTemp     1464.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.217, 0.168, 0.125, 0.000)
		colorShelf     (0.222, 0.173, 0.143, 0.000)
		colorBeach     (0.261, 0.202, 0.170, 0.000)
		colorDesert    (0.283, 0.217, 0.166, 0.000)
		colorLowland   (0.311, 0.232, 0.188, 0.000)
		colorUpland    (0.345, 0.281, 0.228, 0.000)
		colorRock      (0.372, 0.306, 0.246, 0.000)
		colorSnow      (0.406, 0.325, 0.260, 1.000)
		BumpHeight      8.93079
		BumpOffset      1.78616
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0321741
		Period          0.12808
		Eccentricity    0.460429
		Inclination     68.4333
		AscendingNode   -55.5569
		ArgOfPericenter 8.98032
		MeanAnomaly     -100.506
	}
}

DwarfMoon	"Ciutric III.D32"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            5.93252e-010
	Radius          7.90328
	InertiaMoment   0.3988

	RotationPeriod  4631.13
	Obliquity       24.5518
	EqAscendNode    148.098
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.524 0.518 0.512)

	Surface
	{
		SurfStyle       0.788708
		OceanStyle      0.63056
		Randomize      (0.691, -0.869, -0.774)
		colorDistMagn   0.260754
		colorDistFreq   0.0315059
		detailScale     215.812
		colorConversion true
		snowLevel       2
		tropicLatitude  0.226884
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.286613
		terraceProb     0.314463
		erosion         0
		montesMagn      0.493333
		montesFreq      4.62632
		montesSpiky     0.905428
		montesFraction  0.615257
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.17226
		hillsFraction   0.713578
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256842
		craterFreq      0.174034
		craterDensity   0.910471
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.55823
		volcanoTemp     1382.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.204, 0.176, 0.143, 0.000)
		colorShelf     (0.210, 0.181, 0.164, 0.000)
		colorBeach     (0.246, 0.213, 0.195, 0.000)
		colorDesert    (0.267, 0.228, 0.189, 0.000)
		colorLowland   (0.294, 0.244, 0.215, 0.000)
		colorUpland    (0.325, 0.296, 0.261, 0.000)
		colorRock      (0.351, 0.321, 0.282, 0.000)
		colorSnow      (0.383, 0.342, 0.297, 1.000)
		BumpHeight      7.11295
		BumpOffset      1.42259
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0328403
		Period          0.132079
		Eccentricity    0.464344
		Inclination     24.5518
		AscendingNode   148.098
		ArgOfPericenter -31.2135
		MeanAnomaly     -4.26572
	}
}

DwarfMoon	"Ciutric III.D33"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            8.66583e-010
	Radius          7.8762
	InertiaMoment   0.399745

	Obliquity       -85.5762
	EqAscendNode    57.1282
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.547 0.543 0.540)

	Surface
	{
		SurfStyle       0.390799
		OceanStyle      0.312311
		Randomize      (-0.582, -0.614, 0.432)
		colorDistMagn   0.755506
		colorDistFreq   0.00479846
		detailScale     215.073
		colorConversion true
		snowLevel       2
		tropicLatitude  0.845748
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.377845
		terraceProb     0.396992
		erosion         0
		montesMagn      0.566675
		montesFreq      2.29179
		montesSpiky     0.848322
		montesFraction  0.915073
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.136392
		hillsFraction   0.688268
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261229
		craterFreq      0.149542
		craterDensity   0.729594
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.504941
		volcanoTemp     1562.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.219, 0.217, 0.216, 0.000)
		colorShelf     (0.233, 0.231, 0.229, 0.000)
		colorBeach     (0.246, 0.244, 0.243, 0.000)
		colorDesert    (0.260, 0.258, 0.256, 0.000)
		colorLowland   (0.274, 0.272, 0.270, 0.000)
		colorUpland    (0.287, 0.285, 0.283, 0.000)
		colorRock      (0.301, 0.299, 0.297, 0.000)
		colorSnow      (0.315, 0.312, 0.310, 1.000)
		BumpHeight      7.08858
		BumpOffset      1.41772
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0331762
		Period          0.134111
		Eccentricity    0.30752
		Inclination     -85.5762
		AscendingNode   57.1282
		ArgOfPericenter -152.404
		MeanAnomaly     -123.688
	}
}

DwarfMoon	"Ciutric III.D34"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            1.24701e-009
	Radius          15.2165
	InertiaMoment   0.397691

	RotationPeriod  2986.48
	Obliquity       -22.7116
	EqAscendNode    150.496
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.782 0.780 0.779)

	Surface
	{
		SurfStyle       0.95465
		OceanStyle      0.713624
		Randomize      (0.446, 0.237, -0.230)
		colorDistMagn   0.883677
		colorDistFreq   0.0760498
		detailScale     415.513
		colorConversion true
		snowLevel       2
		tropicLatitude  0.195673
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.269688
		terraceProb     0.763127
		erosion         0
		montesMagn      0.592988
		montesFreq      2.1994
		montesSpiky     0.908952
		montesFraction  0.464243
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.374485
		hillsFraction   0.745064
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.204731
		craterFreq      0.25458
		craterDensity   0.967947
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.472622
		volcanoTemp     1426.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.266, 0.273, 0.312, 0.050)
		colorShelf     (0.313, 0.320, 0.358, 0.040)
		colorBeach     (0.360, 0.367, 0.405, 0.030)
		colorDesert    (0.407, 0.414, 0.460, 0.020)
		colorLowland   (0.454, 0.460, 0.506, 0.030)
		colorUpland    (0.501, 0.507, 0.553, 0.050)
		colorRock      (0.548, 0.554, 0.616, 0.020)
		colorSnow      (0.548, 0.554, 0.616, 1.000)
		BumpHeight      13.6949
		BumpOffset      2.73898
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0335328
		Period          0.136279
		Eccentricity    0.272057
		Inclination     -22.7116
		AscendingNode   150.496
		ArgOfPericenter 70.0125
		MeanAnomaly     -142.124
	}
}

DwarfMoon	"Ciutric III.D35"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            1.77217e-009
	Radius          8.8055
	InertiaMoment   0.398946

	Obliquity       -45.7361
	EqAscendNode    -161.199
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.464 0.459 0.452)

	Surface
	{
		SurfStyle       0.431628
		OceanStyle      0.480468
		Randomize      (-0.048, -0.788, -0.654)
		colorDistMagn   0.521224
		colorDistFreq   0.0242968
		detailScale     240.449
		colorConversion true
		snowLevel       2
		tropicLatitude  0.232331
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.365628
		terraceProb     0.548529
		erosion         0
		montesMagn      0.565025
		montesFreq      2.83937
		montesSpiky     0.936522
		montesFraction  0.440512
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.174313
		hillsFraction   0.552253
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237709
		craterFreq      0.270257
		craterDensity   0.9397
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.492954
		volcanoTemp     1056.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.186, 0.184, 0.181, 0.000)
		colorShelf     (0.197, 0.195, 0.192, 0.000)
		colorBeach     (0.209, 0.207, 0.204, 0.000)
		colorDesert    (0.221, 0.218, 0.215, 0.000)
		colorLowland   (0.232, 0.230, 0.226, 0.000)
		colorUpland    (0.244, 0.241, 0.237, 0.000)
		colorRock      (0.255, 0.253, 0.249, 0.000)
		colorSnow      (0.267, 0.264, 0.260, 1.000)
		BumpHeight      7.92495
		BumpOffset      1.58499
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0340607
		Period          0.139509
		Eccentricity    0.403845
		Inclination     -45.7361
		AscendingNode   -161.199
		ArgOfPericenter 142.56
		MeanAnomaly     42.267
	}
}

DwarfMoon	"Ciutric III.D36"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            2.49236e-009
	Radius          25.2174
	InertiaMoment   0.39987

	Obliquity       -63.0198
	EqAscendNode    147.384
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.801 0.770 0.745)

	Surface
	{
		SurfStyle       0.690156
		OceanStyle      0.533768
		Randomize      (0.864, -0.851, 0.246)
		colorDistMagn   0.597674
		colorDistFreq   0.208024
		detailScale     688.604
		colorConversion true
		snowLevel       2
		tropicLatitude  0.484557
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.576011
		terraceProb     0.202544
		erosion         0
		montesMagn      0.586021
		montesFreq      4.08003
		montesSpiky     0.950766
		montesFraction  0.390293
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.28434
		hillsFraction   0.745307
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230948
		craterFreq      0.246204
		craterDensity   0.917965
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.485492
		volcanoTemp     1237.33
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.312, 0.262, 0.209, 0.000)
		colorShelf     (0.320, 0.269, 0.238, 0.000)
		colorBeach     (0.376, 0.316, 0.283, 0.000)
		colorDesert    (0.408, 0.339, 0.276, 0.000)
		colorLowland   (0.448, 0.362, 0.313, 0.000)
		colorUpland    (0.496, 0.439, 0.380, 0.000)
		colorRock      (0.537, 0.477, 0.410, 0.000)
		colorSnow      (0.585, 0.508, 0.432, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0342795
		Period          0.140856
		Eccentricity    0.392227
		Inclination     -63.0198
		AscendingNode   147.384
		ArgOfPericenter -58.7101
		MeanAnomaly     53.5196
	}
}

DwarfMoon	"Ciutric III.D37"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            3.47487e-009
	Radius          12.6637
	InertiaMoment   0.397919

	Obliquity       33.9686
	EqAscendNode    -139.094
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.417 0.413 0.406)

	Surface
	{
		SurfStyle       0.845164
		OceanStyle      0.980068
		Randomize      (0.660, -0.313, 0.186)
		colorDistMagn   0.461302
		colorDistFreq   0.0854175
		detailScale     345.805
		colorConversion true
		snowLevel       2
		tropicLatitude  0.382973
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.270568
		terraceProb     0.596133
		erosion         0
		montesMagn      0.599171
		montesFreq      3.4648
		montesSpiky     0.907145
		montesFraction  0.297945
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.393014
		hillsFraction   0.723951
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232627
		craterFreq      0.197233
		craterDensity   1.03865
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.499103
		volcanoTemp     1334.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.163, 0.140, 0.114, 0.000)
		colorShelf     (0.167, 0.144, 0.130, 0.000)
		colorBeach     (0.196, 0.169, 0.154, 0.000)
		colorDesert    (0.213, 0.182, 0.150, 0.000)
		colorLowland   (0.234, 0.194, 0.170, 0.000)
		colorUpland    (0.259, 0.235, 0.207, 0.000)
		colorRock      (0.279, 0.256, 0.223, 0.000)
		colorSnow      (0.304, 0.272, 0.235, 1.000)
		BumpHeight      11.3974
		BumpOffset      2.27947
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0345046
		Period          0.142246
		Eccentricity    0.000819172
		Inclination     33.9686
		AscendingNode   -139.094
		ArgOfPericenter -130.061
		MeanAnomaly     32.3741
	}
}

DwarfMoon	"Ciutric III.D38"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            4.80989e-009
	Radius          13.1466
	InertiaMoment   0.399087

	Obliquity       -7.89011
	EqAscendNode    -45.0131
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.633 0.631 0.629)

	Surface
	{
		SurfStyle       0.790274
		OceanStyle      0.981866
		Randomize      (0.122, 0.645, 0.559)
		colorDistMagn   0.751511
		colorDistFreq   0.0253683
		detailScale     358.989
		colorConversion true
		snowLevel       2
		tropicLatitude  0.251589
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.494041
		terraceProb     0.738728
		erosion         0
		montesMagn      0.445872
		montesFreq      2.82392
		montesSpiky     0.849285
		montesFraction  0.316547
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.318479
		hillsFraction   0.788116
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249922
		craterFreq      0.18672
		craterDensity   0.952065
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.575292
		volcanoTemp     1526.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.247, 0.215, 0.176, 0.000)
		colorShelf     (0.253, 0.221, 0.201, 0.000)
		colorBeach     (0.298, 0.259, 0.239, 0.000)
		colorDesert    (0.323, 0.278, 0.233, 0.000)
		colorLowland   (0.355, 0.297, 0.264, 0.000)
		colorUpland    (0.393, 0.360, 0.321, 0.000)
		colorRock      (0.424, 0.391, 0.346, 0.000)
		colorSnow      (0.462, 0.416, 0.365, 1.000)
		BumpHeight      11.8319
		BumpOffset      2.36638
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0348451
		Period          0.144356
		Eccentricity    0.0277603
		Inclination     -7.89011
		AscendingNode   -45.0131
		ArgOfPericenter 34.426
		MeanAnomaly     -69.9688
	}
}

DwarfMoon	"Ciutric III.D39"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            6.61865e-009
	Radius          25.6391
	InertiaMoment   0.399995

	RotationPeriod  3881.06
	Obliquity       -23.5622
	EqAscendNode    -79.2204
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.621 0.512 0.394)

	Surface
	{
		SurfStyle       0.0400098
		OceanStyle      0.508294
		Randomize      (0.857, -0.322, -0.728)
		colorDistMagn   0.557138
		colorDistFreq   0.33743
		detailScale     700.119
		colorConversion true
		snowLevel       2
		tropicLatitude  0.585992
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.428108
		terraceProb     0.150013
		erosion         0
		montesMagn      0.532159
		montesFreq      3.32298
		montesSpiky     0.90019
		montesFraction  0.584067
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.01896
		hillsFraction   0.60456
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233452
		craterFreq      0.257635
		craterDensity   0.774174
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.549232
		volcanoTemp     1125.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.248, 0.205, 0.157, 0.000)
		colorShelf     (0.264, 0.218, 0.167, 0.000)
		colorBeach     (0.279, 0.231, 0.177, 0.000)
		colorDesert    (0.295, 0.243, 0.187, 0.000)
		colorLowland   (0.310, 0.256, 0.197, 0.000)
		colorUpland    (0.326, 0.269, 0.207, 0.000)
		colorRock      (0.341, 0.282, 0.217, 0.000)
		colorSnow      (0.357, 0.295, 0.226, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0353625
		Period          0.147583
		Eccentricity    0.0763026
		Inclination     -23.5622
		AscendingNode   -79.2204
		ArgOfPericenter 6.46329
		MeanAnomaly     -175.246
	}
}

DwarfMoon	"Ciutric III.D40"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            9.0645e-009
	Radius          14.0927
	InertiaMoment   0.398123

	RotationPeriod  6553.49
	Obliquity       -15.5797
	EqAscendNode    32.5332
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.451 0.449 0.445)

	Surface
	{
		SurfStyle       0.451479
		OceanStyle      0.720888
		Randomize      (0.435, 0.289, 0.322)
		colorDistMagn   0.680496
		colorDistFreq   0.125362
		detailScale     384.825
		colorConversion true
		snowLevel       2
		tropicLatitude  0.498221
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.5759
		terraceProb     0.642981
		erosion         0
		montesMagn      0.339556
		montesFreq      3.02283
		montesSpiky     0.9438
		montesFraction  0.454969
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.583689
		hillsFraction   0.528917
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231007
		craterFreq      0.22307
		craterDensity   0.846696
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.561381
		volcanoTemp     1390.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.181, 0.179, 0.178, 0.000)
		colorShelf     (0.192, 0.191, 0.189, 0.000)
		colorBeach     (0.203, 0.202, 0.200, 0.000)
		colorDesert    (0.214, 0.213, 0.211, 0.000)
		colorLowland   (0.226, 0.224, 0.222, 0.000)
		colorUpland    (0.237, 0.236, 0.233, 0.000)
		colorRock      (0.248, 0.247, 0.245, 0.000)
		colorSnow      (0.260, 0.258, 0.256, 1.000)
		BumpHeight      12.6834
		BumpOffset      2.53669
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0356718
		Period          0.149524
		Eccentricity    0.149721
		Inclination     -15.5797
		AscendingNode   32.5332
		ArgOfPericenter 41.8821
		MeanAnomaly     61.4145
	}
}

DwarfMoon	"Ciutric III.D41"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            1.23685e-008
	Radius          19.5903
	InertiaMoment   0.399224

	RotationPeriod  4028.98
	Obliquity       63.0512
	EqAscendNode    69.7894
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.407 0.400 0.395)

	Surface
	{
		SurfStyle       0.169588
		OceanStyle      0.247134
		Randomize      (0.271, -0.341, 0.076)
		colorDistMagn   0.182971
		colorDistFreq   0.210716
		detailScale     534.947
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997607
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.431728
		terraceProb     0.287844
		erosion         0
		montesMagn      0.33463
		montesFreq      2.06414
		montesSpiky     0.981873
		montesFraction  0.618424
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.940244
		hillsFraction   0.503382
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251138
		craterFreq      0.225733
		craterDensity   0.932263
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.508696
		volcanoTemp     1525.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.163, 0.160, 0.158, 0.000)
		colorShelf     (0.173, 0.170, 0.168, 0.000)
		colorBeach     (0.183, 0.180, 0.178, 0.000)
		colorDesert    (0.193, 0.190, 0.188, 0.000)
		colorLowland   (0.204, 0.200, 0.198, 0.000)
		colorUpland    (0.214, 0.210, 0.208, 0.000)
		colorRock      (0.224, 0.220, 0.217, 0.000)
		colorSnow      (0.234, 0.230, 0.227, 1.000)
		BumpHeight      17.6313
		BumpOffset      3.52626
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0362554
		Period          0.153208
		Eccentricity    0.480093
		Inclination     63.0512
		AscendingNode   69.7894
		ArgOfPericenter -62.2161
		MeanAnomaly     13.6637
	}
}

DwarfMoon	"Ciutric III.D42"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            1.6831e-008
	Radius          20.1343
	InertiaMoment   0.396044

	Obliquity       56.5157
	EqAscendNode    21.9156
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.494 0.407 0.375)

	Surface
	{
		SurfStyle       0.82201
		OceanStyle      0.960448
		Randomize      (-0.676, -0.741, -0.164)
		colorDistMagn   0.59816
		colorDistFreq   0.207694
		detailScale     549.802
		colorConversion true
		snowLevel       2
		tropicLatitude  0.940075
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.61133
		terraceProb     0.231574
		erosion         0
		montesMagn      0.483535
		montesFreq      2.99085
		montesSpiky     0.980487
		montesFraction  0.339223
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.06094
		hillsFraction   0.665721
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213294
		craterFreq      0.155492
		craterDensity   0.911842
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.485988
		volcanoTemp     1740.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.193, 0.138, 0.105, 0.000)
		colorShelf     (0.198, 0.142, 0.120, 0.000)
		colorBeach     (0.232, 0.167, 0.142, 0.000)
		colorDesert    (0.252, 0.179, 0.139, 0.000)
		colorLowland   (0.277, 0.191, 0.157, 0.000)
		colorUpland    (0.306, 0.232, 0.191, 0.000)
		colorRock      (0.331, 0.252, 0.206, 0.000)
		colorSnow      (0.361, 0.269, 0.217, 1.000)
		BumpHeight      18.1209
		BumpOffset      3.62418
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0367492
		Period          0.156349
		Eccentricity    0.0718583
		Inclination     56.5157
		AscendingNode   21.9156
		ArgOfPericenter 138.581
		MeanAnomaly     -58.5605
	}
}

DwarfMoon	"Ciutric III.D43"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            2.28625e-008
	Radius          21.0144
	InertiaMoment   0.398309

	Obliquity       -72.7695
	EqAscendNode    -87.2968
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.538 0.422 0.355)

	Surface
	{
		SurfStyle       0.317152
		OceanStyle      0.798752
		Randomize      (0.527, -0.612, -0.208)
		colorDistMagn   0.989764
		colorDistFreq   0.17565
		detailScale     573.832
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.64747
		terraceProb     0.326754
		erosion         0
		montesMagn      0.430935
		montesFreq      3.25322
		montesSpiky     0.952649
		montesFraction  0.630185
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.0394
		hillsFraction   0.357341
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235047
		craterFreq      0.211442
		craterDensity   0.830594
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.512178
		volcanoTemp     1257.25
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.215, 0.169, 0.142, 0.000)
		colorShelf     (0.228, 0.180, 0.151, 0.000)
		colorBeach     (0.242, 0.190, 0.160, 0.000)
		colorDesert    (0.255, 0.201, 0.169, 0.000)
		colorLowland   (0.269, 0.211, 0.178, 0.000)
		colorUpland    (0.282, 0.222, 0.187, 0.000)
		colorRock      (0.296, 0.232, 0.196, 0.000)
		colorSnow      (0.309, 0.243, 0.204, 1.000)
		BumpHeight      18.9129
		BumpOffset      3.78259
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0373987
		Period          0.160512
		Eccentricity    0.00448131
		Inclination     -72.7695
		AscendingNode   -87.2968
		ArgOfPericenter -157.826
		MeanAnomaly     -171.94
	}
}

DwarfMoon	"Ciutric III.D44"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            3.1027e-008
	Radius          40.837
	InertiaMoment   0.399357

	Obliquity       -53.2173
	EqAscendNode    -79.2087
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.538 0.533 0.526)

	Surface
	{
		SurfStyle       0.993935
		OceanStyle      0.340981
		Randomize      (0.223, -0.513, -0.446)
		colorDistMagn   0.676015
		colorDistFreq   1.00303
		detailScale     1115.12
		colorConversion true
		snowLevel       2
		tropicLatitude  0.971158
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.307028
		terraceProb     0.370489
		erosion         0
		montesMagn      0.468472
		montesFreq      2.48209
		montesSpiky     0.893572
		montesFraction  0.516255
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.49755
		hillsFraction   0.508059
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227363
		craterFreq      0.259059
		craterDensity   1.06025
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.47251
		volcanoTemp     1542.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.183, 0.187, 0.211, 0.050)
		colorShelf     (0.215, 0.219, 0.242, 0.040)
		colorBeach     (0.248, 0.251, 0.274, 0.030)
		colorDesert    (0.280, 0.283, 0.311, 0.020)
		colorLowland   (0.312, 0.315, 0.342, 0.030)
		colorUpland    (0.344, 0.347, 0.374, 0.050)
		colorRock      (0.377, 0.378, 0.416, 0.020)
		colorSnow      (0.377, 0.378, 0.416, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0379435
		Period          0.164032
		Eccentricity    0.254659
		Inclination     -53.2173
		AscendingNode   -79.2087
		ArgOfPericenter -42.2328
		MeanAnomaly     -126.692
	}
}

DwarfMoon	"Ciutric III.D45"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            4.21049e-008
	Radius          29.9018
	InertiaMoment   0.396688

	Obliquity       -31.7232
	EqAscendNode    109.38
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.446 0.441 0.438)

	Surface
	{
		SurfStyle       0.298725
		OceanStyle      0.677443
		Randomize      (-0.921, -0.649, -0.937)
		colorDistMagn   0.75973
		colorDistFreq   0.375416
		detailScale     816.519
		colorConversion true
		snowLevel       2
		tropicLatitude  0.579091
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.301942
		terraceProb     0.177277
		erosion         0
		montesMagn      0.417476
		montesFreq      2.6221
		montesSpiky     0.99319
		montesFraction  0.862573
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.71968
		hillsFraction   0.760398
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25801
		craterFreq      0.190515
		craterDensity   0.977603
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.472974
		volcanoTemp     1620.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.178, 0.176, 0.175, 0.000)
		colorShelf     (0.190, 0.187, 0.186, 0.000)
		colorBeach     (0.201, 0.198, 0.197, 0.000)
		colorDesert    (0.212, 0.209, 0.208, 0.000)
		colorLowland   (0.223, 0.220, 0.219, 0.000)
		colorUpland    (0.234, 0.231, 0.230, 0.000)
		colorRock      (0.245, 0.242, 0.241, 0.000)
		colorSnow      (0.256, 0.253, 0.252, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0382029
		Period          0.165717
		Eccentricity    0.332069
		Inclination     -31.7232
		AscendingNode   109.38
		ArgOfPericenter 0.531888
		MeanAnomaly     170.538
	}
}

DwarfMoon	"Ciutric III.D46"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            5.71842e-008
	Radius          30.5431
	InertiaMoment   0.398481

	RotationPeriod  5905.06
	Obliquity       62.5585
	EqAscendNode    -165.823
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.756 0.753 0.749)

	Surface
	{
		SurfStyle       0.362855
		OceanStyle      0.151803
		Randomize      (-0.568, 0.885, 0.321)
		colorDistMagn   0.437517
		colorDistFreq   0.521484
		detailScale     834.031
		colorConversion true
		snowLevel       2
		tropicLatitude  0.217715
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.510569
		terraceProb     0.201412
		erosion         0
		montesMagn      0.44257
		montesFreq      2.83953
		montesSpiky     0.907669
		montesFraction  0.32451
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.41955
		hillsFraction   0.437592
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.272171
		craterFreq      0.249113
		craterDensity   0.99887
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.511038
		volcanoTemp     1403.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.302, 0.301, 0.299, 0.000)
		colorShelf     (0.321, 0.320, 0.318, 0.000)
		colorBeach     (0.340, 0.339, 0.337, 0.000)
		colorDesert    (0.359, 0.357, 0.356, 0.000)
		colorLowland   (0.378, 0.376, 0.374, 0.000)
		colorUpland    (0.397, 0.395, 0.393, 0.000)
		colorRock      (0.416, 0.414, 0.412, 0.000)
		colorSnow      (0.435, 0.433, 0.430, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0386159
		Period          0.168412
		Eccentricity    0.244236
		Inclination     62.5585
		AscendingNode   -165.823
		ArgOfPericenter 135.776
		MeanAnomaly     -28.3685
	}
}

DwarfMoon	"Ciutric III.D47"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            7.7795e-008
	Radius          31.8739
	InertiaMoment   0.399487

	Obliquity       0.900124
	EqAscendNode    175.635
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.659 0.573 0.481)

	Surface
	{
		SurfStyle       0.484002
		OceanStyle      0.996011
		Randomize      (-0.194, 0.076, -0.030)
		colorDistMagn   0.381379
		colorDistFreq   0.788931
		detailScale     870.371
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00119604
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.568024
		terraceProb     0.11913
		erosion         0
		montesMagn      0.327825
		montesFreq      2.57759
		montesSpiky     0.859221
		montesFraction  0.542275
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.99018
		hillsFraction   0.703282
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23245
		craterFreq      0.274398
		craterDensity   1.02359
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.477288
		volcanoTemp     1329.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.264, 0.229, 0.193, 0.000)
		colorShelf     (0.280, 0.244, 0.205, 0.000)
		colorBeach     (0.296, 0.258, 0.217, 0.000)
		colorDesert    (0.313, 0.272, 0.229, 0.000)
		colorLowland   (0.329, 0.286, 0.241, 0.000)
		colorUpland    (0.346, 0.301, 0.253, 0.000)
		colorRock      (0.362, 0.315, 0.265, 0.000)
		colorSnow      (0.379, 0.329, 0.277, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0389509
		Period          0.170608
		Eccentricity    0.481274
		Inclination     0.900124
		AscendingNode   175.635
		ArgOfPericenter 141.478
		MeanAnomaly     -156.915
	}
}

DwarfMoon	"Ciutric III.D48"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            1.0611e-007
	Radius          33.0297
	InertiaMoment   0.397104

	Obliquity       -12.0046
	EqAscendNode    125.84
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.648 0.547 0.508)

	Surface
	{
		SurfStyle       0.403197
		OceanStyle      0.194204
		Randomize      (0.540, -0.737, 0.805)
		colorDistMagn   0.314045
		colorDistFreq   0.670494
		detailScale     901.931
		colorConversion true
		snowLevel       2
		tropicLatitude  0.188518
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.393615
		terraceProb     0.269867
		erosion         0
		montesMagn      0.461869
		montesFreq      2.97195
		montesSpiky     0.890362
		montesFraction  0.480129
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.10884
		hillsFraction   0.713341
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222351
		craterFreq      0.264888
		craterDensity   0.889497
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.489489
		volcanoTemp     1290.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.259, 0.219, 0.203, 0.000)
		colorShelf     (0.275, 0.233, 0.216, 0.000)
		colorBeach     (0.292, 0.246, 0.228, 0.000)
		colorDesert    (0.308, 0.260, 0.241, 0.000)
		colorLowland   (0.324, 0.274, 0.254, 0.000)
		colorUpland    (0.340, 0.287, 0.267, 0.000)
		colorRock      (0.356, 0.301, 0.279, 0.000)
		colorSnow      (0.373, 0.315, 0.292, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0393626
		Period          0.17332
		Eccentricity    0.209002
		Inclination     -12.0046
		AscendingNode   125.84
		ArgOfPericenter -177.397
		MeanAnomaly     90.3845
	}
}

DwarfMoon	"Ciutric III.D49"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            1.45246e-007
	Radius          80.8147
	InertiaMoment   0.398643

	Obliquity       -61.5942
	EqAscendNode    85.2922
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.586 0.447 0.398)

	Surface
	{
		SurfStyle       0.903405
		OceanStyle      0.770498
		Randomize      (0.655, 0.550, -0.545)
		colorDistMagn   0.516868
		colorDistFreq   4.44187
		detailScale     2206.78
		colorConversion true
		snowLevel       2
		tropicLatitude  0.986659
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.586641
		terraceProb     0.304685
		erosion         0
		montesMagn      0.359426
		montesFreq      3.17071
		montesSpiky     0.858002
		montesFraction  0.522393
		dunesFraction   0
		hillsMagn       0
		hillsFreq       18.803
		hillsFraction   0.663338
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246329
		craterFreq      0.256088
		craterDensity   0.753866
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.516849
		volcanoTemp     1617.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.199, 0.156, 0.159, 0.050)
		colorShelf     (0.234, 0.183, 0.183, 0.040)
		colorBeach     (0.269, 0.210, 0.207, 0.030)
		colorDesert    (0.305, 0.237, 0.235, 0.020)
		colorLowland   (0.340, 0.264, 0.259, 0.030)
		colorUpland    (0.375, 0.290, 0.282, 0.050)
		colorRock      (0.410, 0.317, 0.314, 0.020)
		colorSnow      (0.410, 0.317, 0.314, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0399473
		Period          0.177196
		Eccentricity    0.0936625
		Inclination     -61.5942
		AscendingNode   85.2922
		ArgOfPericenter -129.232
		MeanAnomaly     37.5996
	}
}

DwarfMoon	"Ciutric III.D50"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            1.99736e-007
	Radius          46.7787
	InertiaMoment   0.399615

	Obliquity       -23.3613
	EqAscendNode    55.8158
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.430 0.424 0.422)

	Surface
	{
		SurfStyle       0.849483
		OceanStyle      0.351706
		Randomize      (-0.328, -0.565, -0.183)
		colorDistMagn   0.665581
		colorDistFreq   1.41049
		detailScale     1277.37
		colorConversion true
		snowLevel       2
		tropicLatitude  0.65639
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.599628
		terraceProb     0.386608
		erosion         0
		montesMagn      0.434019
		montesFreq      3.52182
		montesSpiky     0.986353
		montesFraction  0.909601
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.86209
		hillsFraction   0.617348
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260472
		craterFreq      0.147502
		craterDensity   0.850594
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.489166
		volcanoTemp     1326.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.168, 0.144, 0.118, 0.000)
		colorShelf     (0.172, 0.148, 0.135, 0.000)
		colorBeach     (0.202, 0.174, 0.160, 0.000)
		colorDesert    (0.219, 0.187, 0.156, 0.000)
		colorLowland   (0.241, 0.199, 0.177, 0.000)
		colorUpland    (0.267, 0.242, 0.215, 0.000)
		colorRock      (0.288, 0.263, 0.232, 0.000)
		colorSnow      (0.314, 0.280, 0.244, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0402554
		Period          0.17925
		Eccentricity    0.0278438
		Inclination     -23.3613
		AscendingNode   55.8158
		ArgOfPericenter 97.098
		MeanAnomaly     -89.8574
	}
}

DwarfMoon	"Ciutric III.D51"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            2.76252e-007
	Radius          49.033
	InertiaMoment   0.397422

	Obliquity       -54.4166
	EqAscendNode    161.307
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.735 0.733 0.732)

	Surface
	{
		SurfStyle       0.691687
		OceanStyle      0.936183
		Randomize      (0.366, -0.122, -0.468)
		colorDistMagn   0.724334
		colorDistFreq   0.909041
		detailScale     1338.93
		colorConversion true
		snowLevel       2
		tropicLatitude  0.261843
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.35114
		terraceProb     0.362993
		erosion         0
		montesMagn      0.523374
		montesFreq      3.0372
		montesSpiky     0.962685
		montesFraction  0.569332
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.23193
		hillsFraction   0.439902
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242448
		craterFreq      0.243727
		craterDensity   0.842134
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.538863
		volcanoTemp     1315.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.287, 0.249, 0.205, 0.000)
		colorShelf     (0.294, 0.257, 0.234, 0.000)
		colorBeach     (0.346, 0.301, 0.278, 0.000)
		colorDesert    (0.375, 0.323, 0.271, 0.000)
		colorLowland   (0.412, 0.345, 0.307, 0.000)
		colorUpland    (0.456, 0.418, 0.373, 0.000)
		colorRock      (0.493, 0.455, 0.403, 0.000)
		colorSnow      (0.537, 0.484, 0.425, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0407556
		Period          0.182602
		Eccentricity    0.35454
		Inclination     -54.4166
		AscendingNode   161.307
		ArgOfPericenter 173.103
		MeanAnomaly     90.9062
	}
}

DwarfMoon	"Ciutric III.D52"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            3.84777e-007
	Radius          51.3524
	InertiaMoment   0.398797

	Obliquity       -0.449806
	EqAscendNode    9.38485
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.632 0.627 0.622)

	Surface
	{
		SurfStyle       0.349095
		OceanStyle      0.407167
		Randomize      (-0.648, 0.505, 0.832)
		colorDistMagn   0.845365
		colorDistFreq   0.864178
		detailScale     1402.26
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0156474
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.455348
		terraceProb     0.236982
		erosion         0
		montesMagn      0.514143
		montesFreq      1.85695
		montesSpiky     0.949869
		montesFraction  0.143463
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.23543
		hillsFraction   0.641284
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247633
		craterFreq      0.225682
		craterDensity   1.055
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.403813
		volcanoTemp     1609.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.253, 0.251, 0.249, 0.000)
		colorShelf     (0.268, 0.267, 0.265, 0.000)
		colorBeach     (0.284, 0.282, 0.280, 0.000)
		colorDesert    (0.300, 0.298, 0.296, 0.000)
		colorLowland   (0.316, 0.314, 0.311, 0.000)
		colorUpland    (0.332, 0.329, 0.327, 0.000)
		colorRock      (0.347, 0.345, 0.342, 0.000)
		colorSnow      (0.363, 0.361, 0.358, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0414101
		Period          0.187018
		Eccentricity    0.128604
		Inclination     -0.449806
		AscendingNode   9.38485
		ArgOfPericenter -82.9505
		MeanAnomaly     -82.1377
	}
}

DwarfMoon	"Ciutric III.D53"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            5.4051e-007
	Radius          72.5577
	InertiaMoment   0.399742

	Obliquity       -68.3308
	EqAscendNode    92.9261
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.751 0.748 0.746)

	Surface
	{
		SurfStyle       0.677322
		OceanStyle      0.531982
		Randomize      (-0.816, -0.028, 0.620)
		colorDistMagn   0.915488
		colorDistFreq   2.83386
		detailScale     1981.31
		colorConversion true
		snowLevel       2
		tropicLatitude  0.983588
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.578083
		terraceProb     0.146981
		erosion         0
		montesMagn      0.484584
		montesFreq      2.48663
		montesSpiky     0.970724
		montesFraction  0.451264
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.6372
		hillsFraction   0.78159
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.278839
		craterFreq      0.212891
		craterDensity   0.919111
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.428543
		volcanoTemp     1289.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.293, 0.254, 0.209, 0.000)
		colorShelf     (0.300, 0.262, 0.239, 0.000)
		colorBeach     (0.353, 0.307, 0.284, 0.000)
		colorDesert    (0.383, 0.329, 0.276, 0.000)
		colorLowland   (0.421, 0.352, 0.313, 0.000)
		colorUpland    (0.466, 0.427, 0.381, 0.000)
		colorRock      (0.503, 0.464, 0.410, 0.000)
		colorSnow      (0.548, 0.494, 0.433, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0419787
		Period          0.190883
		Eccentricity    0.276931
		Inclination     -68.3308
		AscendingNode   92.9261
		ArgOfPericenter 170.374
		MeanAnomaly     -115.726
	}
}

DwarfMoon	"Ciutric III.D54"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            7.67059e-007
	Radius          133.39
	InertiaMoment   0.397686

	Obliquity       52.8888
	EqAscendNode    56.3234
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.499 0.496 0.494)

	Surface
	{
		SurfStyle       0.672626
		OceanStyle      0.413
		Randomize      (0.496, 0.109, 0.142)
		colorDistMagn   0.122919
		colorDistFreq   12.7956
		detailScale     3642.45
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999935
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.2836
		terraceProb     0.282544
		erosion         0
		montesMagn      0.569978
		montesFreq      3.17062
		montesSpiky     0.900898
		montesFraction  0.510131
		dunesFraction   0
		hillsMagn       0
		hillsFreq       41.7382
		hillsFraction   0.687383
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248055
		craterFreq      0.662543
		craterDensity   0.937284
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.408708
		volcanoTemp     1363.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.195, 0.169, 0.138, 0.000)
		colorShelf     (0.200, 0.173, 0.158, 0.000)
		colorBeach     (0.235, 0.203, 0.188, 0.000)
		colorDesert    (0.255, 0.218, 0.183, 0.000)
		colorLowland   (0.280, 0.233, 0.207, 0.000)
		colorUpland    (0.310, 0.283, 0.252, 0.000)
		colorRock      (0.335, 0.307, 0.272, 0.000)
		colorSnow      (0.364, 0.327, 0.287, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0424128
		Period          0.193851
		Eccentricity    0.323726
		Inclination     52.8888
		AscendingNode   56.3234
		ArgOfPericenter -70.3891
		MeanAnomaly     -75.0472
	}
}

DwarfMoon	"Ciutric III.D55"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            1.10194e-006
	Radius          78.4083
	InertiaMoment   0.398943

	RotationPeriod  3430.23
	Obliquity       -30.5067
	EqAscendNode    47.5577
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.782 0.736 0.689)

	Surface
	{
		SurfStyle       0.2247
		OceanStyle      0.882492
		Randomize      (-0.992, -0.280, -0.326)
		colorDistMagn   0.670603
		colorDistFreq   2.8493
		detailScale     2141.07
		colorConversion true
		snowLevel       2
		tropicLatitude  0.822755
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.469863
		terraceProb     0.303136
		erosion         0
		montesMagn      0.510306
		montesFreq      2.88343
		montesSpiky     0.811238
		montesFraction  0.635412
		dunesFraction   0
		hillsMagn       0
		hillsFreq       16.4149
		hillsFraction   0.518054
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.208009
		craterFreq      0.25129
		craterDensity   0.88954
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.479699
		volcanoTemp     1337.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.313, 0.294, 0.275, 0.000)
		colorShelf     (0.332, 0.313, 0.293, 0.000)
		colorBeach     (0.352, 0.331, 0.310, 0.000)
		colorDesert    (0.372, 0.350, 0.327, 0.000)
		colorLowland   (0.391, 0.368, 0.344, 0.000)
		colorUpland    (0.411, 0.386, 0.361, 0.000)
		colorRock      (0.430, 0.405, 0.379, 0.000)
		colorSnow      (0.450, 0.423, 0.396, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0426762
		Period          0.19566
		Eccentricity    0.265478
		Inclination     -30.5067
		AscendingNode   47.5577
		ArgOfPericenter -47.5566
		MeanAnomaly     22.3693
	}
}

DwarfMoon	"Ciutric III.D56"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            1.60639e-006
	Radius          83.5734
	InertiaMoment   0.399867

	Obliquity       1.65605
	EqAscendNode    -16.7216
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.445 0.442 0.438)

	Surface
	{
		SurfStyle       0.846173
		OceanStyle      0.0389447
		Randomize      (-0.725, -0.958, -0.308)
		colorDistMagn   0.382863
		colorDistFreq   2.56131
		detailScale     2282.11
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0571608
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.358042
		terraceProb     0.14389
		erosion         0
		montesMagn      0.583241
		montesFreq      2.9927
		montesSpiky     0.983543
		montesFraction  0.592219
		dunesFraction   0
		hillsMagn       0
		hillsFreq       12.0584
		hillsFraction   0.342165
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258626
		craterFreq      0.19988
		craterDensity   0.863425
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.443643
		volcanoTemp     1700.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.174, 0.150, 0.123, 0.000)
		colorShelf     (0.178, 0.155, 0.140, 0.000)
		colorBeach     (0.209, 0.181, 0.166, 0.000)
		colorDesert    (0.227, 0.194, 0.162, 0.000)
		colorLowland   (0.249, 0.208, 0.184, 0.000)
		colorUpland    (0.276, 0.252, 0.223, 0.000)
		colorRock      (0.298, 0.274, 0.241, 0.000)
		colorSnow      (0.325, 0.292, 0.254, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0429563
		Period          0.197589
		Eccentricity    0.400233
		Inclination     1.65605
		AscendingNode   -16.7216
		ArgOfPericenter -145.496
		MeanAnomaly     -106.613
	}
}

DwarfMoon	"Ciutric III.D57"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            2.38347e-006
	Radius          212.467
	InertiaMoment   0.397915

	RotationPeriod  5294.96
	Obliquity       -21.6861
	EqAscendNode    -30.0214
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.785 0.740 0.683)

	Surface
	{
		SurfStyle       0.335628
		OceanStyle      0.799266
		Randomize      (0.427, -0.194, -0.829)
		colorDistMagn   0.803869
		colorDistFreq   10.9263
		detailScale     5801.77
		colorConversion true
		snowLevel       2
		tropicLatitude  0.66681
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.408237
		terraceProb     0.426154
		erosion         0
		montesMagn      0.469469
		montesFreq      3.78489
		montesSpiky     0.97406
		montesFraction  0.861267
		dunesFraction   0
		hillsMagn       0
		hillsFreq       112.782
		hillsFraction   0.461695
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.299042
		craterFreq      1.90776
		craterDensity   0.901779
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.496222
		volcanoTemp     1599.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.314, 0.296, 0.273, 0.000)
		colorShelf     (0.334, 0.314, 0.290, 0.000)
		colorBeach     (0.353, 0.333, 0.308, 0.000)
		colorDesert    (0.373, 0.351, 0.325, 0.000)
		colorLowland   (0.393, 0.370, 0.342, 0.000)
		colorUpland    (0.412, 0.388, 0.359, 0.000)
		colorRock      (0.432, 0.407, 0.376, 0.000)
		colorSnow      (0.451, 0.425, 0.393, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0434995
		Period          0.201349
		Eccentricity    0.42962
		Inclination     -21.6861
		AscendingNode   -30.0214
		ArgOfPericenter 145.467
		MeanAnomaly     -127.43
	}
}

DwarfMoon	"Ciutric III.D58"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            3.6131e-006
	Radius          125.304
	InertiaMoment   0.399084

	Obliquity       47.8276
	EqAscendNode    -60.3362
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.522 0.520 0.516)

	Surface
	{
		SurfStyle       0.918594
		OceanStyle      0.354061
		Randomize      (-0.622, -0.102, -0.974)
		colorDistMagn   0.09728
		colorDistFreq   8.4326
		detailScale     3421.63
		colorConversion true
		snowLevel       2
		tropicLatitude  0.983869
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.548928
		terraceProb     0.370802
		erosion         0
		montesMagn      0.495996
		montesFreq      2.91653
		montesSpiky     0.947104
		montesFraction  0.585941
		dunesFraction   0
		hillsMagn       0
		hillsFreq       44.4203
		hillsFraction   0.627911
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220682
		craterFreq      0.516215
		craterDensity   0.873461
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.567839
		volcanoTemp     2253.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.178, 0.182, 0.206, 0.050)
		colorShelf     (0.209, 0.213, 0.237, 0.040)
		colorBeach     (0.240, 0.244, 0.268, 0.030)
		colorDesert    (0.272, 0.276, 0.304, 0.020)
		colorLowland   (0.303, 0.307, 0.335, 0.030)
		colorUpland    (0.334, 0.338, 0.366, 0.050)
		colorRock      (0.366, 0.369, 0.408, 0.020)
		colorSnow      (0.366, 0.369, 0.408, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.043742
		Period          0.203035
		Eccentricity    0.0420938
		Inclination     47.8276
		AscendingNode   -60.3362
		ArgOfPericenter 118.543
		MeanAnomaly     -59.0283
	}
}

DwarfMoon	"Ciutric III.D59"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            5.62339e-006
	Radius          249.916
	InertiaMoment   0.399992

	RotationPeriod  5415.07
	Obliquity       -80.9074
	EqAscendNode    94.5294
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.693 0.655 0.594)

	Surface
	{
		SurfStyle       0.0800612
		OceanStyle      0.148141
		Randomize      (0.088, 0.264, -0.003)
		colorDistMagn   0.633399
		colorDistFreq   42.1952
		detailScale     6824.36
		colorConversion true
		snowLevel       2
		tropicLatitude  0.994787
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.472239
		terraceProb     0.264742
		erosion         0
		montesMagn      0.408472
		montesFreq      3.14628
		montesSpiky     0.928159
		montesFraction  0.49635
		dunesFraction   0
		hillsMagn       0
		hillsFreq       136.815
		hillsFraction   0.576866
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224098
		craterFreq      1.44863
		craterDensity   0.941081
		craterOctaves   17
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.542706
		volcanoTemp     1050.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.277, 0.262, 0.238, 0.000)
		colorShelf     (0.295, 0.279, 0.253, 0.000)
		colorBeach     (0.312, 0.295, 0.268, 0.000)
		colorDesert    (0.329, 0.311, 0.282, 0.000)
		colorLowland   (0.347, 0.328, 0.297, 0.000)
		colorUpland    (0.364, 0.344, 0.312, 0.000)
		colorRock      (0.381, 0.361, 0.327, 0.000)
		colorSnow      (0.399, 0.377, 0.342, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0441549
		Period          0.205916
		Eccentricity    0.402662
		Inclination     -80.9074
		AscendingNode   94.5294
		ArgOfPericenter 90.8947
		MeanAnomaly     -1.55482
	}
}

DwarfMoon	"Ciutric III.D60"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            1.76831e-011
	Radius          1.87745
	InertiaMoment   0.398119

	Obliquity       21.5733
	EqAscendNode    -30.1286
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.564 0.421 0.312)

	Surface
	{
		SurfStyle       0.808195
		OceanStyle      0.50839
		Randomize      (0.668, 0.666, 0.969)
		colorDistMagn   0.900499
		colorDistFreq   0.00137878
		detailScale     51.267
		colorConversion true
		snowLevel       2
		tropicLatitude  0.663844
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.372548
		terraceProb     0.179802
		erosion         0
		montesMagn      0.490631
		montesFreq      2.62164
		montesSpiky     0.840604
		montesFraction  0.457808
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00938063
		hillsFraction   0.782927
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253695
		craterFreq      0.263634
		craterDensity   0.904098
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.460069
		volcanoTemp     1658.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.220, 0.143, 0.087, 0.000)
		colorShelf     (0.226, 0.147, 0.100, 0.000)
		colorBeach     (0.265, 0.173, 0.118, 0.000)
		colorDesert    (0.288, 0.185, 0.115, 0.000)
		colorLowland   (0.316, 0.198, 0.131, 0.000)
		colorUpland    (0.350, 0.240, 0.159, 0.000)
		colorRock      (0.378, 0.261, 0.171, 0.000)
		colorSnow      (0.412, 0.278, 0.181, 1.000)
		BumpHeight      1.68971
		BumpOffset      0.337942
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0446764
		Period          0.209575
		Eccentricity    0.0239476
		Inclination     21.5733
		AscendingNode   -30.1286
		ArgOfPericenter 116.421
		MeanAnomaly     149.493
	}
}

DwarfMoon	"Ciutric III.D61"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            3.42495e-011
	Radius          3.04956
	InertiaMoment   0.399221

	RotationPeriod  3747.96
	Obliquity       41.6119
	EqAscendNode    0.46733
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.725 0.723 0.722)

	Surface
	{
		SurfStyle       0.716066
		OceanStyle      0.399911
		Randomize      (-0.543, -0.875, -0.424)
		colorDistMagn   0.736328
		colorDistFreq   0.00176791
		detailScale     83.2734
		colorConversion true
		snowLevel       2
		tropicLatitude  0.993013
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.489304
		terraceProb     0.113788
		erosion         0
		montesMagn      0.505799
		montesFreq      3.17919
		montesSpiky     0.967673
		montesFraction  0.817089
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0217004
		hillsFraction   0.577805
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24791
		craterFreq      0.2268
		craterDensity   0.866163
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.548263
		volcanoTemp     1678.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.283, 0.246, 0.202, 0.000)
		colorShelf     (0.290, 0.253, 0.231, 0.000)
		colorBeach     (0.341, 0.297, 0.274, 0.000)
		colorDesert    (0.370, 0.318, 0.267, 0.000)
		colorLowland   (0.406, 0.340, 0.303, 0.000)
		colorUpland    (0.449, 0.412, 0.368, 0.000)
		colorRock      (0.486, 0.448, 0.397, 0.000)
		colorSnow      (0.529, 0.477, 0.419, 1.000)
		BumpHeight      2.74461
		BumpOffset      0.548921
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0452724
		Period          0.213783
		Eccentricity    0.318402
		Inclination     41.6119
		AscendingNode   0.46733
		ArgOfPericenter -51.8764
		MeanAnomaly     7.44247
	}
}

DwarfMoon	"Ciutric III.D62"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            6.12634e-011
	Radius          5.8271
	InertiaMoment   0.396024

	Obliquity       89.453
	EqAscendNode    -66.6173
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.724 0.720 0.717)

	Surface
	{
		SurfStyle       0.600045
		OceanStyle      0.327606
		Randomize      (-0.453, -0.706, 0.791)
		colorDistMagn   0.693391
		colorDistFreq   0.0284428
		detailScale     159.119
		colorConversion true
		snowLevel       2
		tropicLatitude  0.917929
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.343838
		terraceProb     0.349197
		erosion         0
		montesMagn      0.368242
		montesFreq      2.9787
		montesSpiky     0.917049
		montesFraction  0.819395
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0798905
		hillsFraction   0.679502
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.285165
		craterFreq      0.152912
		craterDensity   0.819831
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.471886
		volcanoTemp     1472.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.282, 0.245, 0.201, 0.000)
		colorShelf     (0.290, 0.252, 0.229, 0.000)
		colorBeach     (0.340, 0.295, 0.272, 0.000)
		colorDesert    (0.369, 0.317, 0.265, 0.000)
		colorLowland   (0.406, 0.338, 0.301, 0.000)
		colorUpland    (0.449, 0.410, 0.366, 0.000)
		colorRock      (0.485, 0.446, 0.394, 0.000)
		colorSnow      (0.529, 0.475, 0.416, 1.000)
		BumpHeight      5.24439
		BumpOffset      1.04888
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0457524
		Period          0.217192
		Eccentricity    0.460196
		Inclination     89.453
		AscendingNode   -66.6173
		ArgOfPericenter 100.106
		MeanAnomaly     121.246
	}
}

Moon	"Ciutric III.3"
{
	ParentBody     "Ciutric III"
	Class	       "Selena"

	Mass            0.0208554
	Radius          2077.4
	InertiaMoment   0.35994

	Obliquity       -15.5966
	EqAscendNode    166.194
	Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.606 0.601 0.594)

	Surface
	{
		SurfStyle       0.938084
		OceanStyle      0.30999
		Randomize      (-0.034, 0.179, -0.256)
		colorDistMagn   0.0874979
		colorDistFreq   251.058
		detailScale     5343.2
		colorConversion true
		drivenDarkening 0
		seaLevel        0.186403
		snowLevel       2
		tropicLatitude  0.0645948
		icecapLatitude  10
		icecapHeight    0.125508
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.90905
		venusFreq       0.797397
		venusMagn       0
		mareFreq        0.97217
		mareDensity     0.00565643
		terraceProb     0.164984
		erosion         0
		montesMagn      0.0976782
		montesFreq      119.925
		montesSpiky     0.959198
		montesFraction  0.552388
		dunesMagn       0.0436929
		dunesFreq       2774.27
		dunesFraction   0.647878
		hillsMagn       0.146841
		hillsFreq       232.881
		hillsFraction   0.0842834
		hills2Fraction  0
		riversMagn      63.1328
		riversFreq      3.98302
		riversSin       7.65456
		riversOctaves   0
		canyonsMagn     0.711367
		canyonsFreq     0.753644
		canyonFraction  0.144771
		cracksMagn      0.0467131
		cracksFreq      0.982298
		cracksOctaves   0
		craterMagn      0.598743
		craterFreq      6.70355
		craterDensity   0.885528
		craterOctaves   11
		craterRayedFactor 0.224009
		volcanoMagn     0.367443
		volcanoFreq     0.608643
		volcanoDensity  0.227402
		volcanoOctaves  3
		volcanoActivity 0.190738
		volcanoFlows    0.12257
		volcanoRadius   0.225133
		volcanoTemp     1473.25
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.440, 0.450, 0.370, 0.000)
		colorShelf     (0.580, 0.550, 0.430, 0.000)
		colorBeach     (0.430, 0.397, 0.344, 0.000)
		colorDesert    (0.503, 0.463, 0.380, 0.000)
		colorLowland   (0.400, 0.349, 0.285, 0.000)
		colorUpland    (0.357, 0.313, 0.267, 0.000)
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
		SemiMajorAxis   0.0459947
		Period          0.218917
		Eccentricity    0.0844545
		Inclination     -15.5966
		AscendingNode   166.194
		ArgOfPericenter -172.679
		MeanAnomaly     -127.305
	}
}

DwarfMoon	"Ciutric III.D63"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            1.67237e-010
	Radius          7.47432
	InertiaMoment   0.399354

	Obliquity       -63.0422
	EqAscendNode    -8.98491
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.444 0.439 0.436)

	Surface
	{
		SurfStyle       0.414349
		OceanStyle      0.149082
		Randomize      (0.719, 0.266, 0.513)
		colorDistMagn   0.53282
		colorDistFreq   0.0340397
		detailScale     204.099
		colorConversion true
		snowLevel       2
		tropicLatitude  0.815165
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.335172
		terraceProb     0.222046
		erosion         0
		montesMagn      0.478542
		montesFreq      3.38814
		montesSpiky     0.875038
		montesFraction  0.371206
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.121554
		hillsFraction   0.651217
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252486
		craterFreq      0.232572
		craterDensity   0.872525
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.503123
		volcanoTemp     1478.95
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.178, 0.176, 0.174, 0.000)
		colorShelf     (0.189, 0.187, 0.185, 0.000)
		colorBeach     (0.200, 0.198, 0.196, 0.000)
		colorDesert    (0.211, 0.209, 0.207, 0.000)
		colorLowland   (0.222, 0.220, 0.218, 0.000)
		colorUpland    (0.233, 0.231, 0.229, 0.000)
		colorRock      (0.244, 0.242, 0.240, 0.000)
		colorSnow      (0.255, 0.253, 0.251, 1.000)
		BumpHeight      6.72689
		BumpOffset      1.34538
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.046489
		Period          0.222458
		Eccentricity    0.187849
		Inclination     -63.0422
		AscendingNode   -8.98491
		ArgOfPericenter 32.7418
		MeanAnomaly     -43.9116
	}
}

DwarfMoon	"Ciutric III.D64"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            2.61322e-010
	Radius          6.25837
	InertiaMoment   0.396678

	RotationPeriod  1319.75
	Obliquity       10.5253
	EqAscendNode    -152.688
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.652 0.649 0.647)

	Surface
	{
		SurfStyle       0.672772
		OceanStyle      0.844095
		Randomize      (-0.439, 0.115, 0.816)
		colorDistMagn   0.444883
		colorDistFreq   0.00306828
		detailScale     170.895
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0861729
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.599677
		terraceProb     0.475173
		erosion         0
		montesMagn      0.486598
		montesFreq      3.59734
		montesSpiky     0.956488
		montesFraction  0.744328
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.103336
		hillsFraction   0.71403
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.205739
		craterFreq      0.205901
		craterDensity   0.735862
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.524267
		volcanoTemp     1230.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.254, 0.221, 0.181, 0.000)
		colorShelf     (0.261, 0.227, 0.207, 0.000)
		colorBeach     (0.306, 0.266, 0.246, 0.000)
		colorDesert    (0.333, 0.286, 0.239, 0.000)
		colorLowland   (0.365, 0.305, 0.272, 0.000)
		colorUpland    (0.404, 0.370, 0.330, 0.000)
		colorRock      (0.437, 0.403, 0.356, 0.000)
		colorSnow      (0.476, 0.429, 0.375, 1.000)
		BumpHeight      5.63253
		BumpOffset      1.12651
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0469583
		Period          0.225835
		Eccentricity    0.473327
		Inclination     10.5253
		AscendingNode   -152.688
		ArgOfPericenter -111.346
		MeanAnomaly     144.049
	}
}

DwarfMoon	"Ciutric III.D65"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            3.97411e-010
	Radius          6.14337
	InertiaMoment   0.398478

	Obliquity       20.1844
	EqAscendNode    -88.4721
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.582 0.499 0.382)

	Surface
	{
		SurfStyle       0.924117
		OceanStyle      0.442941
		Randomize      (-0.899, 0.979, -0.349)
		colorDistMagn   0.00408268
		colorDistFreq   0.0173631
		detailScale     167.755
		colorConversion true
		snowLevel       2
		tropicLatitude  0.47908
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.511127
		terraceProb     0.402817
		erosion         0
		montesMagn      0.414494
		montesFreq      2.94544
		montesSpiky     0.925608
		montesFraction  0.359274
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0802941
		hillsFraction   0.729346
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218749
		craterFreq      0.260937
		craterDensity   0.852315
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.424138
		volcanoTemp     1563.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.198, 0.175, 0.153, 0.050)
		colorShelf     (0.233, 0.205, 0.176, 0.040)
		colorBeach     (0.268, 0.235, 0.198, 0.030)
		colorDesert    (0.302, 0.264, 0.225, 0.020)
		colorLowland   (0.337, 0.294, 0.248, 0.030)
		colorUpland    (0.372, 0.324, 0.271, 0.050)
		colorRock      (0.407, 0.354, 0.302, 0.020)
		colorSnow      (0.407, 0.354, 0.302, 1.000)
		BumpHeight      5.52904
		BumpOffset      1.10581
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0472625
		Period          0.228033
		Eccentricity    0.0688202
		Inclination     20.1844
		AscendingNode   -88.4721
		ArgOfPericenter 153.461
		MeanAnomaly     -120.907
	}
}

DwarfMoon	"Ciutric III.D66"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            5.91204e-010
	Radius          11.9298
	InertiaMoment   0.399484

	RotationPeriod  12089.4
	Obliquity       -70.7036
	EqAscendNode    -149.429
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.719 0.715 0.713)

	Surface
	{
		SurfStyle       0.309862
		OceanStyle      0.601745
		Randomize      (0.043, -0.816, -0.911)
		colorDistMagn   0.695366
		colorDistFreq   0.0168834
		detailScale     325.764
		colorConversion true
		snowLevel       2
		tropicLatitude  0.481988
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.568798
		terraceProb     0.433136
		erosion         0
		montesMagn      0.549081
		montesFreq      2.19076
		montesSpiky     0.943947
		montesFraction  0.447789
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.362876
		hillsFraction   0.957135
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230093
		craterFreq      0.24735
		craterDensity   0.905934
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.606307
		volcanoTemp     1451.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.288, 0.286, 0.285, 0.000)
		colorShelf     (0.306, 0.304, 0.303, 0.000)
		colorBeach     (0.324, 0.322, 0.321, 0.000)
		colorDesert    (0.342, 0.340, 0.339, 0.000)
		colorLowland   (0.359, 0.357, 0.357, 0.000)
		colorUpland    (0.377, 0.375, 0.375, 0.000)
		colorRock      (0.395, 0.393, 0.392, 0.000)
		colorSnow      (0.413, 0.411, 0.410, 1.000)
		BumpHeight      10.7368
		BumpOffset      2.14737
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0475144
		Period          0.229859
		Eccentricity    0.422341
		Inclination     -70.7036
		AscendingNode   -149.429
		ArgOfPericenter -109.759
		MeanAnomaly     -115.12
	}
}

DwarfMoon	"Ciutric III.D67"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            8.63716e-010
	Radius          6.98823
	InertiaMoment   0.397096

	RotationPeriod  1361.74
	Obliquity       -68.3235
	EqAscendNode    -108.399
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.521 0.370 0.309)

	Surface
	{
		SurfStyle       0.74166
		OceanStyle      0.0741097
		Randomize      (-0.782, 0.686, -0.280)
		colorDistMagn   0.621964
		colorDistFreq   0.0271556
		detailScale     190.825
		colorConversion true
		snowLevel       2
		tropicLatitude  0.912534
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.611307
		terraceProb     0.207838
		erosion         0
		montesMagn      0.513077
		montesFreq      2.44463
		montesSpiky     0.914732
		montesFraction  0.595175
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.146204
		hillsFraction   0.576967
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.197648
		craterFreq      0.14372
		craterDensity   1.04201
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.415306
		volcanoTemp     1233.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.203, 0.126, 0.087, 0.000)
		colorShelf     (0.208, 0.130, 0.099, 0.000)
		colorBeach     (0.245, 0.152, 0.118, 0.000)
		colorDesert    (0.266, 0.163, 0.114, 0.000)
		colorLowland   (0.292, 0.174, 0.130, 0.000)
		colorUpland    (0.323, 0.211, 0.158, 0.000)
		colorRock      (0.349, 0.230, 0.170, 0.000)
		colorSnow      (0.380, 0.244, 0.179, 1.000)
		BumpHeight      6.28941
		BumpOffset      1.25788
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0479491
		Period          0.233021
		Eccentricity    0.224062
		Inclination     -68.3235
		AscendingNode   -108.399
		ArgOfPericenter 77.2617
		MeanAnomaly     -13.5327
	}
}

DwarfMoon	"Ciutric III.D68"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            1.24304e-009
	Radius          13.7213
	InertiaMoment   0.39864

	Obliquity       -25.6995
	EqAscendNode    67.9917
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.526 0.523 0.520)

	Surface
	{
		SurfStyle       0.0481187
		OceanStyle      0.0745484
		Randomize      (-0.013, 0.219, 0.843)
		colorDistMagn   0.891908
		colorDistFreq   0.0835005
		detailScale     374.683
		colorConversion true
		snowLevel       2
		tropicLatitude  0.67098
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.413948
		terraceProb     0.612354
		erosion         0
		montesMagn      0.497634
		montesFreq      3.05146
		montesSpiky     0.932416
		montesFraction  0.684532
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.422695
		hillsFraction   0.872551
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255165
		craterFreq      0.194595
		craterDensity   0.919948
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.462226
		volcanoTemp     1195.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.210, 0.209, 0.208, 0.000)
		colorShelf     (0.223, 0.222, 0.221, 0.000)
		colorBeach     (0.237, 0.235, 0.234, 0.000)
		colorDesert    (0.250, 0.248, 0.247, 0.000)
		colorLowland   (0.263, 0.261, 0.260, 0.000)
		colorUpland    (0.276, 0.275, 0.273, 0.000)
		colorRock      (0.289, 0.288, 0.286, 0.000)
		colorSnow      (0.302, 0.301, 0.299, 1.000)
		BumpHeight      12.3492
		BumpOffset      2.46983
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0484323
		Period          0.236552
		Eccentricity    0.0153194
		Inclination     -25.6995
		AscendingNode   67.9917
		ArgOfPericenter -121.96
		MeanAnomaly     113.118
	}
}

DwarfMoon	"Ciutric III.D69"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            1.76671e-009
	Radius          10.2339
	InertiaMoment   0.399613

	Obliquity       -43.8893
	EqAscendNode    93.326
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.657 0.655 0.652)

	Surface
	{
		SurfStyle       0.151693
		OceanStyle      0.59631
		Randomize      (-0.611, -0.157, 0.486)
		colorDistMagn   0.596967
		colorDistFreq   0.018777
		detailScale     279.455
		colorConversion true
		snowLevel       2
		tropicLatitude  0.83696
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.304415
		terraceProb     0.355743
		erosion         0
		montesMagn      0.479563
		montesFreq      2.26907
		montesSpiky     0.842926
		montesFraction  0.546719
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.273064
		hillsFraction   0.611131
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.284454
		craterFreq      0.224715
		craterDensity   0.782803
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.526222
		volcanoTemp     1433.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.263, 0.262, 0.261, 0.000)
		colorShelf     (0.279, 0.278, 0.277, 0.000)
		colorBeach     (0.296, 0.295, 0.293, 0.000)
		colorDesert    (0.312, 0.311, 0.310, 0.000)
		colorLowland   (0.328, 0.328, 0.326, 0.000)
		colorUpland    (0.345, 0.344, 0.342, 0.000)
		colorRock      (0.361, 0.360, 0.359, 0.000)
		colorSnow      (0.378, 0.377, 0.375, 1.000)
		BumpHeight      9.21055
		BumpOffset      1.84211
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0488103
		Period          0.239326
		Eccentricity    0.365537
		Inclination     -43.8893
		AscendingNode   93.326
		ArgOfPericenter 141.536
		MeanAnomaly     -100.018
	}
}

DwarfMoon	"Ciutric III.D70"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            2.48489e-009
	Radius          10.637
	InertiaMoment   0.397416

	Obliquity       -61.6382
	EqAscendNode    -88.1315
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.752 0.704 0.640)

	Surface
	{
		SurfStyle       0.318594
		OceanStyle      0.710568
		Randomize      (0.221, 0.790, -0.798)
		colorDistMagn   0.474616
		colorDistFreq   0.0490923
		detailScale     290.462
		colorConversion true
		snowLevel       2
		tropicLatitude  0.979711
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.493703
		terraceProb     0.23498
		erosion         0
		montesMagn      0.509762
		montesFreq      2.65332
		montesSpiky     0.880613
		montesFraction  0.579489
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.183496
		hillsFraction   0.490214
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236433
		craterFreq      0.21347
		craterDensity   0.849174
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.541068
		volcanoTemp     1395.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.301, 0.282, 0.256, 0.000)
		colorShelf     (0.320, 0.299, 0.272, 0.000)
		colorBeach     (0.339, 0.317, 0.288, 0.000)
		colorDesert    (0.357, 0.334, 0.304, 0.000)
		colorLowland   (0.376, 0.352, 0.320, 0.000)
		colorUpland    (0.395, 0.370, 0.336, 0.000)
		colorRock      (0.414, 0.387, 0.352, 0.000)
		colorSnow      (0.433, 0.405, 0.368, 1.000)
		BumpHeight      9.57333
		BumpOffset      1.91467
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0490498
		Period          0.24109
		Eccentricity    0.405707
		Inclination     -61.6382
		AscendingNode   -88.1315
		ArgOfPericenter 61.4817
		MeanAnomaly     54.0504
	}
}

DwarfMoon	"Ciutric III.D71"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            3.46469e-009
	Radius          20.7819
	InertiaMoment   0.398793

	RotationPeriod  5331.5
	Obliquity       -59.5594
	EqAscendNode    -121.281
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.621 0.618 0.617)

	Surface
	{
		SurfStyle       0.809454
		OceanStyle      0.160662
		Randomize      (-0.110, 0.477, 0.837)
		colorDistMagn   0.878405
		colorDistFreq   0.0598251
		detailScale     567.483
		colorConversion true
		snowLevel       2
		tropicLatitude  0.766165
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.391539
		terraceProb     0.45695
		erosion         0
		montesMagn      0.291441
		montesFreq      2.54644
		montesSpiky     0.99245
		montesFraction  0.49751
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.19622
		hillsFraction   0.606524
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260817
		craterFreq      0.240237
		craterDensity   0.969864
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.448744
		volcanoTemp     1321.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.242, 0.210, 0.173, 0.000)
		colorShelf     (0.249, 0.216, 0.197, 0.000)
		colorBeach     (0.292, 0.254, 0.234, 0.000)
		colorDesert    (0.317, 0.272, 0.228, 0.000)
		colorLowland   (0.348, 0.291, 0.259, 0.000)
		colorUpland    (0.385, 0.352, 0.315, 0.000)
		colorRock      (0.416, 0.383, 0.339, 0.000)
		colorSnow      (0.454, 0.408, 0.358, 1.000)
		BumpHeight      18.7037
		BumpOffset      3.74074
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0493472
		Period          0.243286
		Eccentricity    0.267269
		Inclination     -59.5594
		AscendingNode   -121.281
		ArgOfPericenter 111.172
		MeanAnomaly     48.8468
	}
}

DwarfMoon	"Ciutric III.D72"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            4.79609e-009
	Radius          11.5942
	InertiaMoment   0.399739

	Obliquity       -48.6452
	EqAscendNode    58.2334
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.722 0.682 0.649)

	Surface
	{
		SurfStyle       0.969598
		OceanStyle      0.339163
		Randomize      (-0.760, 0.857, 0.774)
		colorDistMagn   0.891544
		colorDistFreq   0.0383691
		detailScale     316.6
		colorConversion true
		snowLevel       2
		tropicLatitude  0.990163
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.409078
		terraceProb     0.265521
		erosion         0
		montesMagn      0.623053
		montesFreq      1.81073
		montesSpiky     0.972057
		montesFraction  0.698131
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.436513
		hillsFraction   0.750185
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244895
		craterFreq      0.239931
		craterDensity   0.942846
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.503816
		volcanoTemp     1623.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.245, 0.239, 0.260, 0.050)
		colorShelf     (0.289, 0.280, 0.299, 0.040)
		colorBeach     (0.332, 0.320, 0.338, 0.030)
		colorDesert    (0.375, 0.361, 0.383, 0.020)
		colorLowland   (0.419, 0.402, 0.422, 0.030)
		colorUpland    (0.462, 0.443, 0.461, 0.050)
		colorRock      (0.505, 0.484, 0.513, 0.020)
		colorSnow      (0.505, 0.484, 0.513, 1.000)
		BumpHeight      10.4348
		BumpOffset      2.08696
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0498884
		Period          0.2473
		Eccentricity    0.0276183
		Inclination     -48.6452
		AscendingNode   58.2334
		ArgOfPericenter -104.487
		MeanAnomaly     -36.6082
	}
}

DwarfMoon	"Ciutric III.D73"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            6.59997e-009
	Radius          28.4841
	InertiaMoment   0.397681

	RotationPeriod  3275.38
	Obliquity       2.82438
	EqAscendNode    39.7025
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.798 0.743 0.712)

	Surface
	{
		SurfStyle       0.593522
		OceanStyle      0.148286
		Randomize      (0.124, -0.330, -0.391)
		colorDistMagn   0.937459
		colorDistFreq   0.470959
		detailScale     777.806
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0925941
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.596277
		terraceProb     0.2962
		erosion         0
		montesMagn      0.514726
		montesFreq      3.02088
		montesSpiky     0.720423
		montesFraction  0.381565
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.88384
		hillsFraction   0.636177
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233977
		craterFreq      0.187651
		craterDensity   0.734375
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52945
		volcanoTemp     1500.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.311, 0.253, 0.199, 0.000)
		colorShelf     (0.319, 0.260, 0.228, 0.000)
		colorBeach     (0.375, 0.305, 0.270, 0.000)
		colorDesert    (0.407, 0.327, 0.263, 0.000)
		colorLowland   (0.447, 0.349, 0.299, 0.000)
		colorUpland    (0.495, 0.423, 0.363, 0.000)
		colorRock      (0.535, 0.461, 0.391, 0.000)
		colorSnow      (0.582, 0.490, 0.413, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0501306
		Period          0.249103
		Eccentricity    0.328202
		Inclination     2.82438
		AscendingNode   39.7025
		ArgOfPericenter 149.885
		MeanAnomaly     -92.0602
	}
}

DwarfMoon	"Ciutric III.D74"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            9.03924e-009
	Radius          16.5073
	InertiaMoment   0.39894

	RotationPeriod  6622.36
	Obliquity       71.1244
	EqAscendNode    -45.7108
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.702 0.698 0.694)

	Surface
	{
		SurfStyle       0.267528
		OceanStyle      0.872152
		Randomize      (-0.621, -0.014, -0.808)
		colorDistMagn   0.0639548
		colorDistFreq   0.143305
		detailScale     450.76
		colorConversion true
		snowLevel       2
		tropicLatitude  0.85384
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.362184
		terraceProb     0.4163
		erosion         0
		montesMagn      0.443081
		montesFreq      3.00989
		montesSpiky     0.834255
		montesFraction  0.396155
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.831461
		hillsFraction   0.552029
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.203557
		craterFreq      0.26083
		craterDensity   0.918357
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.465406
		volcanoTemp     1915.53
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.281, 0.279, 0.277, 0.000)
		colorShelf     (0.298, 0.297, 0.295, 0.000)
		colorBeach     (0.316, 0.314, 0.312, 0.000)
		colorDesert    (0.333, 0.332, 0.329, 0.000)
		colorLowland   (0.351, 0.349, 0.347, 0.000)
		colorUpland    (0.368, 0.367, 0.364, 0.000)
		colorRock      (0.386, 0.384, 0.381, 0.000)
		colorSnow      (0.403, 0.401, 0.399, 1.000)
		BumpHeight      14.8566
		BumpOffset      2.97132
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0504953
		Period          0.251825
		Eccentricity    0.317222
		Inclination     71.1244
		AscendingNode   -45.7108
		ArgOfPericenter -8.0222
		MeanAnomaly     42.6346
	}
}

DwarfMoon	"Ciutric III.D75"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            1.23344e-008
	Radius          17.2446
	InertiaMoment   0.399865

	Obliquity       -36.6963
	EqAscendNode    148.239
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.575 0.570 0.563)

	Surface
	{
		SurfStyle       0.369305
		OceanStyle      0.789917
		Randomize      (0.888, -0.490, -0.109)
		colorDistMagn   0.28624
		colorDistFreq   0.174097
		detailScale     470.893
		colorConversion true
		snowLevel       2
		tropicLatitude  0.322625
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.453779
		terraceProb     0.320381
		erosion         0
		montesMagn      0.446328
		montesFreq      2.97074
		montesSpiky     0.968404
		montesFraction  0.211955
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.667953
		hillsFraction   0.816675
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.21973
		craterFreq      0.187597
		craterDensity   0.930986
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.540911
		volcanoTemp     1492.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.230, 0.228, 0.225, 0.000)
		colorShelf     (0.244, 0.242, 0.239, 0.000)
		colorBeach     (0.259, 0.257, 0.253, 0.000)
		colorDesert    (0.273, 0.271, 0.268, 0.000)
		colorLowland   (0.287, 0.285, 0.282, 0.000)
		colorUpland    (0.302, 0.299, 0.296, 0.000)
		colorRock      (0.316, 0.314, 0.310, 0.000)
		colorSnow      (0.330, 0.328, 0.324, 1.000)
		BumpHeight      15.5202
		BumpOffset      3.10403
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0508473
		Period          0.254463
		Eccentricity    0.485369
		Inclination     -36.6963
		AscendingNode   148.239
		ArgOfPericenter -157.805
		MeanAnomaly     178.681
	}
}

DwarfMoon	"Ciutric III.D76"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            1.6785e-008
	Radius          33.6491
	InertiaMoment   0.39791

	RotationPeriod  9050.26
	Obliquity       -70.1665
	EqAscendNode    31.1445
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.765 0.763 0.760)

	Surface
	{
		SurfStyle       0.469182
		OceanStyle      0.114003
		Randomize      (0.381, -0.351, 0.746)
		colorDistMagn   0.274676
		colorDistFreq   0.884784
		detailScale     918.844
		colorConversion true
		snowLevel       2
		tropicLatitude  0.766515
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.510921
		terraceProb     0.314703
		erosion         0
		montesMagn      0.475505
		montesFreq      3.42266
		montesSpiky     0.910186
		montesFraction  0.345119
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.58064
		hillsFraction   0.624188
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240487
		craterFreq      0.186703
		craterDensity   0.83825
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.536994
		volcanoTemp     1532.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.306, 0.305, 0.304, 0.000)
		colorShelf     (0.325, 0.324, 0.323, 0.000)
		colorBeach     (0.344, 0.344, 0.342, 0.000)
		colorDesert    (0.363, 0.363, 0.361, 0.000)
		colorLowland   (0.383, 0.382, 0.380, 0.000)
		colorUpland    (0.402, 0.401, 0.399, 0.000)
		colorRock      (0.421, 0.420, 0.418, 0.000)
		colorSnow      (0.440, 0.439, 0.437, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0513323
		Period          0.258112
		Eccentricity    0.243191
		Inclination     -70.1665
		AscendingNode   31.1445
		ArgOfPericenter 134.535
		MeanAnomaly     157.681
	}
}

DwarfMoon	"Ciutric III.D77"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            2.28002e-008
	Radius          24.757
	InertiaMoment   0.399081

	RotationPeriod  11391.1
	Obliquity       2.98525
	EqAscendNode    -10.4428
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.405 0.401 0.396)

	Surface
	{
		SurfStyle       0.350311
		OceanStyle      0.14277
		Randomize      (0.481, 0.453, -0.961)
		colorDistMagn   0.621936
		colorDistFreq   0.276042
		detailScale     676.031
		colorConversion true
		snowLevel       2
		tropicLatitude  0.103586
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.592586
		terraceProb     0.551843
		erosion         0
		montesMagn      0.449047
		montesFreq      3.55454
		montesSpiky     0.941918
		montesFraction  0.164143
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.30947
		hillsFraction   0.560628
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24576
		craterFreq      0.196495
		craterDensity   0.969873
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.55573
		volcanoTemp     1250.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.162, 0.160, 0.158, 0.000)
		colorShelf     (0.172, 0.170, 0.168, 0.000)
		colorBeach     (0.182, 0.180, 0.178, 0.000)
		colorDesert    (0.193, 0.190, 0.188, 0.000)
		colorLowland   (0.203, 0.200, 0.198, 0.000)
		colorUpland    (0.213, 0.210, 0.208, 0.000)
		colorRock      (0.223, 0.220, 0.218, 0.000)
		colorSnow      (0.233, 0.230, 0.228, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0515687
		Period          0.259898
		Eccentricity    0.218637
		Inclination     2.98525
		AscendingNode   -10.4428
		ArgOfPericenter -90.6791
		MeanAnomaly     21.6242
	}
}

DwarfMoon	"Ciutric III.D78"
{
	ParentBody     "Ciutric III"
	Class	       "Asteroid"

	Mass            3.09426e-008
	Radius          45.4365
	InertiaMoment   0.39999

	Obliquity       15.4094
	EqAscendNode    -126.365
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.525 0.521 0.516)

	Surface
	{
		SurfStyle       0.183451
		OceanStyle      0.201194
		Randomize      (-0.274, 0.219, -0.513)
		colorDistMagn   0.925584
		colorDistFreq   0.920164
		detailScale     1240.72
		colorConversion true
		snowLevel       2
		tropicLatitude  0.238024
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.366707
		terraceProb     0.381151
		erosion         0
		montesMagn      0.477786
		montesFreq      3.11108
		montesSpiky     0.916813
		montesFraction  0.416254
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.39382
		hillsFraction   0.540839
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238089
		craterFreq      0.24928
		craterDensity   0.938325
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.510169
		volcanoTemp     1390.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.210, 0.208, 0.206, 0.000)
		colorShelf     (0.223, 0.221, 0.219, 0.000)
		colorBeach     (0.236, 0.234, 0.232, 0.000)
		colorDesert    (0.249, 0.247, 0.245, 0.000)
		colorLowland   (0.262, 0.260, 0.258, 0.000)
		colorUpland    (0.275, 0.273, 0.271, 0.000)
		colorRock      (0.289, 0.286, 0.284, 0.000)
		colorSnow      (0.302, 0.299, 0.297, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.052224
		Period          0.264867
		Eccentricity    0.0467696
		Inclination     15.4094
		AscendingNode   -126.365
		ArgOfPericenter 156.41
		MeanAnomaly     -83.7335
	}
}

Planet	"Ciutric I"
{
	ParentBody     "Ciutric System"
	Class	       "GasGiant"

	Mass            11.5531
	Radius          9292.2
	InertiaMoment   0.227117

	Oblateness      0.0249897

	RotationPeriod  11.3061
	Obliquity       -32.1958
	EqAscendNode    -152.478
	Precession      0

	AlbedoBond      0.490863
	AlbedoGeom      0.589036
	Brightness      2
	Color          (0.812 0.811 0.827)

	Surface
	{
		SurfStyle       0.480505
		Randomize      (0.601, -0.481, 0.331)
		detailScale     49620.8
		colorConversion true
		tropicLatitude  0.512475
		icecapLatitude  1
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     3.56482
		stripeFluct     0.312702
		stripeTwist     10.9362
		cycloneMagn     4.72242
		cycloneFreq     0.735132
		cycloneDensity  0.458811
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
		BumpHeight      17.7979
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          87.8477
		Velocity        1632.91
		BumpHeight      50.5749
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.741411
		mainOctaves     12
		Coverage        0.454316
		stripeZones     3.56482
		stripeFluct     0.312702
		stripeTwist     10.9362
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          192.922
		Density         1147.4
		Pressure        99661
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.0355373
		Saturation      0.90164

		Composition
		{
			He    	94.8527
			CH4   	4.00001
			N2    	0.547185
			NH3   	0.366556
			O2    	0.126632
			C2H2  	0.0458196
			C2H4  	0.0167902
			Ne    	0.0154216
			Ar    	0.0107323
			C2H6  	0.00910469
			C3H8  	0.00531684
			H2    	0.00367265
			H2S   	2.44422e-005
			CO2   	2.23982e-005
			H2O   	1.90611e-005
		}
	}

	Aurora
	{
		Height      138.594
		NorthLat    75.9408
		NorthLon    53.7888
		NorthRadius 5103.68
		NorthWidth  1686.8
		NorthRings  3
		NorthBright 1
		NorthParticles 10000
		SouthLat    -90
		SouthLon    233.275
		SouthRadius 4021.18
		SouthWidth  1145.48
		SouthRings  2
		SouthBright 1
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	Rings
	{
		InnerRadius     23357
		OuterRadius     32090.6
		RotationPeriod  3.76281
		RotationOffset  0
		FrontBright     0.358776
		BackBright      0.592594
		Density         0.348747
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.445963
		Period          0.217495
		Eccentricity    0.0527298
		Inclination     -1.29821
		AscendingNode   27.7752
		ArgOfPericenter 214.05
		MeanAnomaly     255.178
	}
}

DwarfMoon	"Ciutric I.D1"
{
	ParentBody     "Ciutric I"
	Class	       "Asteroid"

	Mass            6.53978e-007
	Radius          67.6042
	InertiaMoment   0.399452

	Oblateness      0.249

	Obliquity       -0.00978719
	EqAscendNode    -134.591
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.653 0.555 0.465)

	Surface
	{
		SurfStyle       0.221894
		OceanStyle      0.50292
		Randomize      (-0.099, 0.684, 0.807)
		colorDistMagn   0.417871
		colorDistFreq   2.80827
		detailScale     1846.05
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.540866
		terraceProb     0.246756
		erosion         0
		montesMagn      0.439573
		montesFreq      2.83484
		montesSpiky     0.951206
		montesFraction  0.688238
		dunesFraction   0
		hillsMagn       0
		hillsFreq       10.3547
		hillsFraction   0.703055
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25193
		craterFreq      0.184584
		craterDensity   0.939298
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.5245
		volcanoTemp     1372.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.261, 0.222, 0.186, 0.000)
		colorShelf     (0.277, 0.236, 0.198, 0.000)
		colorBeach     (0.294, 0.250, 0.209, 0.000)
		colorDesert    (0.310, 0.263, 0.221, 0.000)
		colorLowland   (0.326, 0.277, 0.232, 0.000)
		colorUpland    (0.343, 0.291, 0.244, 0.000)
		colorRock      (0.359, 0.305, 0.256, 0.000)
		colorSnow      (0.375, 0.319, 0.267, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000177417
		Period          0.000402088
		Eccentricity    4.21212e-005
		Inclination     -0.00978719
		AscendingNode   -134.591
		ArgOfPericenter -51.8655
		MeanAnomaly     -87.8656
	}
}

DwarfMoon	"Ciutric I.D2"
{
	ParentBody     "Ciutric I"
	Class	       "Asteroid"

	Mass            9.34068e-007
	Radius          133.491
	InertiaMoment   0.397002

	Oblateness      0.249

	Obliquity       0.00846252
	EqAscendNode    -159.655
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.695 0.694 0.695)

	Surface
	{
		SurfStyle       0.104557
		OceanStyle      0.426221
		Randomize      (0.782, -0.751, 0.634)
		colorDistMagn   0.428381
		colorDistFreq   12.8967
		detailScale     3645.2
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.446597
		terraceProb     0.333723
		erosion         0
		montesMagn      0.434114
		montesFreq      2.90412
		montesSpiky     0.930876
		montesFraction  0.881595
		dunesFraction   0
		hillsMagn       0
		hillsFreq       51.7868
		hillsFraction   0.827971
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23107
		craterFreq      0.676373
		craterDensity   0.903097
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.502506
		volcanoTemp     1783.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.263, 0.178, 0.148, 0.000)
		colorShelf     (0.279, 0.190, 0.158, 0.000)
		colorBeach     (0.296, 0.201, 0.167, 0.000)
		colorDesert    (0.312, 0.212, 0.176, 0.000)
		colorLowland   (0.329, 0.223, 0.186, 0.000)
		colorUpland    (0.345, 0.234, 0.195, 0.000)
		colorRock      (0.361, 0.245, 0.204, 0.000)
		colorSnow      (0.378, 0.256, 0.213, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000261161
		Period          0.000718112
		Eccentricity    8.58571e-005
		Inclination     0.00846252
		AscendingNode   -159.655
		ArgOfPericenter -163.95
		MeanAnomaly     100.983
	}
}

DwarfMoon	"Ciutric I.D3"
{
	ParentBody     "Ciutric I"
	Class	       "Asteroid"

	Mass            1.35223e-006
	Radius          74.7498
	InertiaMoment   0.3986

	Oblateness      0.0523205

	Obliquity       -0.000543956
	EqAscendNode    169.783
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.521 0.455 0.423)

	Surface
	{
		SurfStyle       0.95874
		OceanStyle      0.797232
		Randomize      (0.152, 0.134, -0.013)
		colorDistMagn   0.907713
		colorDistFreq   3.34358
		detailScale     2041.17
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.468163
		terraceProb     0.460649
		erosion         0
		montesMagn      0.358062
		montesFreq      3.44342
		montesSpiky     0.953622
		montesFraction  0.591954
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.9348
		hillsFraction   0.660044
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.298655
		craterFreq      0.199683
		craterDensity   0.763169
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.532374
		volcanoTemp     1232.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.177, 0.159, 0.169, 0.050)
		colorShelf     (0.209, 0.186, 0.194, 0.040)
		colorBeach     (0.240, 0.214, 0.220, 0.030)
		colorDesert    (0.271, 0.241, 0.249, 0.020)
		colorLowland   (0.302, 0.268, 0.275, 0.030)
		colorUpland    (0.334, 0.296, 0.300, 0.050)
		colorRock      (0.365, 0.323, 0.334, 0.020)
		colorSnow      (0.365, 0.323, 0.334, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000293242
		Period          0.000854415
		Eccentricity    7.97816e-005
		Inclination     -0.000543956
		AscendingNode   169.783
		ArgOfPericenter -103.708
		MeanAnomaly     67.7725
	}
}

DwarfMoon	"Ciutric I.D4"
{
	ParentBody     "Ciutric I"
	Class	       "Asteroid"

	Mass            1.98961e-006
	Radius          189.174
	InertiaMoment   0.39958

	Oblateness      0.249

	Obliquity       -0.0126589
	EqAscendNode    -34.4151
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.714 0.714 0.714)

	Surface
	{
		SurfStyle       0.0710421
		OceanStyle      0.538685
		Randomize      (0.459, 0.945, -0.211)
		colorDistMagn   0.806519
		colorDistFreq   23.1915
		detailScale     5165.72
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.740147
		terraceProb     0.551392
		erosion         0
		montesMagn      0.65664
		montesFreq      3.30337
		montesSpiky     0.877854
		montesFraction  0.534102
		dunesFraction   0
		hillsMagn       0
		hillsFreq       80.3067
		hillsFraction   0.832151
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244501
		craterFreq      1.1573
		craterDensity   0.868689
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.492154
		volcanoTemp     1910.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.220, 0.218, 0.218, 0.000)
		colorShelf     (0.234, 0.232, 0.231, 0.000)
		colorBeach     (0.248, 0.246, 0.245, 0.000)
		colorDesert    (0.261, 0.259, 0.259, 0.000)
		colorLowland   (0.275, 0.273, 0.272, 0.000)
		colorUpland    (0.289, 0.287, 0.286, 0.000)
		colorRock      (0.303, 0.300, 0.299, 0.000)
		colorSnow      (0.316, 0.314, 0.313, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000324176
		Period          0.000993117
		Eccentricity    9.10604e-006
		Inclination     -0.0126589
		AscendingNode   -34.4151
		ArgOfPericenter -30.5153
		MeanAnomaly     -102.398
	}
}

DwarfMoon	"Ciutric I.D5"
{
	ParentBody     "Ciutric I"
	Class	       "Asteroid"

	Mass            2.98539e-006
	Radius          113.132
	InertiaMoment   0.397341

	Oblateness      0.0434655

	Obliquity       0.00899712
	EqAscendNode    82.9342
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.794 0.792 0.790)

	Surface
	{
		SurfStyle       0.385526
		OceanStyle      0.535075
		Randomize      (-0.654, -0.545, 0.551)
		colorDistMagn   0.0512117
		colorDistFreq   10.5588
		detailScale     3089.27
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.379058
		terraceProb     0.330003
		erosion         0
		montesMagn      0.514368
		montesFreq      3.9444
		montesSpiky     0.806634
		montesFraction  0.772424
		dunesFraction   0
		hillsMagn       0
		hillsFreq       31.1611
		hillsFraction   0.579123
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229398
		craterFreq      0.463946
		craterDensity   0.937981
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.378198
		volcanoTemp     1259.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.317, 0.317, 0.316, 0.000)
		colorShelf     (0.337, 0.337, 0.336, 0.000)
		colorBeach     (0.357, 0.356, 0.356, 0.000)
		colorDesert    (0.377, 0.376, 0.375, 0.000)
		colorLowland   (0.397, 0.396, 0.395, 0.000)
		colorUpland    (0.417, 0.416, 0.415, 0.000)
		colorRock      (0.436, 0.436, 0.435, 0.000)
		colorSnow      (0.456, 0.455, 0.454, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000362004
		Period          0.00117192
		Eccentricity    7.14528e-005
		Inclination     0.00899712
		AscendingNode   82.9342
		ArgOfPericenter -129.02
		MeanAnomaly     -159.174
	}
}

DwarfMoon	"Ciutric I.D6"
{
	ParentBody     "Ciutric I"
	Class	       "Asteroid"

	Mass            4.58823e-006
	Radius          228.286
	InertiaMoment   0.398755

	Oblateness      0.186024

	Obliquity       -0.0132535
	EqAscendNode    53.0318
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.764 0.764 0.764)

	Surface
	{
		SurfStyle       0.597127
		OceanStyle      0.616817
		Randomize      (0.797, -0.839, -0.822)
		colorDistMagn   0.130692
		colorDistFreq   30.4623
		detailScale     6233.72
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.505148
		terraceProb     0.117037
		erosion         0
		montesMagn      0.535595
		montesFreq      3.5045
		montesSpiky     0.961816
		montesFraction  0.483875
		dunesFraction   0
		hillsMagn       0
		hillsFreq       115.503
		hillsFraction   0.344154
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245568
		craterFreq      1.43133
		craterDensity   0.843292
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53474
		volcanoTemp     1555.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.237, 0.205, 0.167, 0.000)
		colorShelf     (0.243, 0.211, 0.191, 0.000)
		colorBeach     (0.286, 0.247, 0.227, 0.000)
		colorDesert    (0.310, 0.266, 0.221, 0.000)
		colorLowland   (0.341, 0.284, 0.251, 0.000)
		colorUpland    (0.377, 0.344, 0.305, 0.000)
		colorRock      (0.408, 0.374, 0.329, 0.000)
		colorSnow      (0.444, 0.398, 0.347, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000390556
		Period          0.00131327
		Eccentricity    5.83966e-005
		Inclination     -0.0132535
		AscendingNode   53.0318
		ArgOfPericenter -67.6158
		MeanAnomaly     124.744
	}
}

DwarfMoon	"Ciutric I.D7"
{
	ParentBody     "Ciutric I"
	Class	       "Asteroid"

	Mass            2.76569e-006
	Radius          107.948
	InertiaMoment   0.396259

	Oblateness      0.0112243

	Obliquity       -0.46114
	EqAscendNode    -19.6947
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.492 0.441 0.372)

	Surface
	{
		SurfStyle       0.56243
		OceanStyle      0.81894
		Randomize      (-0.530, -0.355, 0.973)
		colorDistMagn   0.680252
		colorDistFreq   10.2354
		detailScale     2947.71
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0158592
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.718675
		terraceProb     0.179406
		erosion         0
		montesMagn      0.531831
		montesFreq      3.16196
		montesSpiky     0.94114
		montesFraction  0.59687
		dunesFraction   0
		hillsMagn       0
		hillsFreq       22.6413
		hillsFraction   0.478332
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236752
		craterFreq      0.329031
		craterDensity   0.869403
		craterOctaves   15
		volcanoActivity 0.0056649
		volcanoFlows    0
		volcanoRadius   0.449357
		volcanoTemp     1870.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.192, 0.150, 0.104, 0.000)
		colorShelf     (0.197, 0.154, 0.119, 0.000)
		colorBeach     (0.231, 0.181, 0.141, 0.000)
		colorDesert    (0.251, 0.194, 0.138, 0.000)
		colorLowland   (0.275, 0.207, 0.156, 0.000)
		colorUpland    (0.305, 0.252, 0.190, 0.000)
		colorRock      (0.329, 0.274, 0.205, 0.000)
		colorSnow      (0.359, 0.291, 0.216, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000555668
		Period          0.0022287
		Eccentricity    0.00940533
		Inclination     -0.46114
		AscendingNode   -19.6947
		ArgOfPericenter -177.229
		MeanAnomaly     11.9654
	}
}

DwarfMoon	"Ciutric I.D8"
{
	ParentBody     "Ciutric I"
	Class	       "Asteroid"

	Mass            1.05409e-005
	Radius          148.121
	InertiaMoment   0.399695

	Oblateness      0.00297206

	Obliquity       -0.537439
	EqAscendNode    11.1586
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.490 0.408 0.319)

	Surface
	{
		SurfStyle       0.348239
		OceanStyle      0.330386
		Randomize      (-0.171, -0.810, 0.358)
		colorDistMagn   0.709511
		colorDistFreq   5.04367
		detailScale     4044.7
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0186692
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.541384
		terraceProb     0.594813
		erosion         0
		montesMagn      0.281058
		montesFreq      3.37943
		montesSpiky     0.891767
		montesFraction  0.621851
		dunesFraction   0
		hillsMagn       0
		hillsFreq       52.6023
		hillsFraction   0.724047
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260354
		craterFreq      0.68398
		craterDensity   0.995347
		craterOctaves   16
		volcanoActivity 0.119322
		volcanoFlows    0
		volcanoRadius   0.437936
		volcanoTemp     1186.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.196, 0.163, 0.128, 0.000)
		colorShelf     (0.208, 0.173, 0.136, 0.000)
		colorBeach     (0.221, 0.183, 0.144, 0.000)
		colorDesert    (0.233, 0.194, 0.152, 0.000)
		colorLowland   (0.245, 0.204, 0.160, 0.000)
		colorUpland    (0.257, 0.214, 0.168, 0.000)
		colorRock      (0.270, 0.224, 0.176, 0.000)
		colorSnow      (0.282, 0.234, 0.184, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000763412
		Period          0.00358896
		Eccentricity    0.0289599
		Inclination     -0.537439
		AscendingNode   11.1586
		ArgOfPericenter 141.741
		MeanAnomaly     -67.4843
	}
}

Moon	"Ciutric I.1"
{
	ParentBody     "Ciutric I"
	Class	       "Selena"

	Mass            0.000195681
	Radius          445.359
	InertiaMoment   0.39922

	Oblateness      0.00167519

	Obliquity       1.14445
	EqAscendNode    -39.3129
	Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.643 0.525 0.358)

	Surface
	{
		SurfStyle       0.085937
		OceanStyle      0.527381
		Randomize      (0.017, 0.188, -0.138)
		colorDistMagn   0.0904035
		colorDistFreq   62.7938
		detailScale     1145.49
		colorConversion true
		drivenDarkening 0
		seaLevel        0.158989
		snowLevel       2
		tropicLatitude  0.0376116
		icecapLatitude  10
		icecapHeight    0.157313
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.91172
		venusFreq       1.088
		venusMagn       0
		mareFreq        0
		mareDensity     0.000228154
		terraceProb     0.164565
		erosion         0
		montesMagn      0.0514187
		montesFreq      18.0403
		montesSpiky     0.804894
		montesFraction  0.512281
		dunesMagn       0.0284691
		dunesFreq       576.453
		dunesFraction   0.510893
		hillsMagn       0.113582
		hillsFreq       50.9535
		hillsFraction   0.246929
		hills2Fraction  0
		riversMagn      61.5668
		riversFreq      2.66477
		riversSin       7.92239
		riversOctaves   0
		canyonsMagn     0.602742
		canyonsFreq     0.172503
		canyonFraction  0.13667
		cracksMagn      0.0353434
		cracksFreq      0.15718
		cracksOctaves   0
		craterMagn      0.598853
		craterFreq      1.31618
		craterDensity   0.860224
		craterOctaves   9
		craterRayedFactor 0.129999
		volcanoMagn     0.194546
		volcanoFreq     0.718556
		volcanoDensity  0.362505
		volcanoOctaves  3
		volcanoActivity 0.878454
		volcanoFlows    0.227059
		volcanoRadius   0.175743
		volcanoTemp     1459.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.320, 0.320, 0.000)
		colorShelf     (0.370, 0.370, 0.370, 0.000)
		colorBeach     (0.322, 0.263, 0.179, 0.000)
		colorDesert    (0.399, 0.315, 0.204, 0.200)
		colorLowland   (0.431, 0.336, 0.229, 0.500)
		colorUpland    (0.450, 0.352, 0.236, 0.800)
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
		SemiMajorAxis   0.00104883
		Period          0.00577937
		Eccentricity    0.0453292
		Inclination     1.14445
		AscendingNode   -39.3129
		ArgOfPericenter 171.676
		MeanAnomaly     -10.7996
	}
}

DwarfMoon	"Ciutric I.D9"
{
	ParentBody     "Ciutric I"
	Class	       "Asteroid"

	Mass            3.01471e-005
	Radius          210.147
	InertiaMoment   0.398695

	Obliquity       -0.0787087
	EqAscendNode    -38.5897
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.524 0.521 0.518)

	Surface
	{
		SurfStyle       0.2102
		OceanStyle      0.872283
		Randomize      (-0.076, 0.228, 0.329)
		colorDistMagn   0.822737
		colorDistFreq   34.8617
		detailScale     5738.42
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00258374
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.711652
		terraceProb     0.294708
		erosion         0
		montesMagn      0.435634
		montesFreq      3.42887
		montesSpiky     0.934299
		montesFraction  0.380369
		dunesFraction   0
		hillsMagn       0
		hillsFreq       66.1006
		hillsFraction   0.426987
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238373
		craterFreq      1.69627
		craterDensity   0.986958
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.546109
		volcanoTemp     1307.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.210, 0.208, 0.207, 0.000)
		colorShelf     (0.223, 0.221, 0.220, 0.000)
		colorBeach     (0.236, 0.234, 0.233, 0.000)
		colorDesert    (0.249, 0.247, 0.246, 0.000)
		colorLowland   (0.262, 0.260, 0.259, 0.000)
		colorUpland    (0.275, 0.273, 0.272, 0.000)
		colorRock      (0.288, 0.286, 0.285, 0.000)
		colorSnow      (0.301, 0.300, 0.298, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00144094
		Period          0.00930678
		Eccentricity    0.000563379
		Inclination     -0.0787087
		AscendingNode   -38.5897
		ArgOfPericenter -166.37
		MeanAnomaly     -65.0749
	}
}

DwarfMoon	"Ciutric I.D10"
{
	ParentBody     "Ciutric I"
	Class	       "Asteroid"

	Mass            4.24567e-005
	Radius          267.987
	InertiaMoment   0.398058

	Obliquity       -1.02655
	EqAscendNode    -157.398
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.781 0.778 0.774)

	Surface
	{
		SurfStyle       0.314133
		OceanStyle      0.770341
		Randomize      (0.752, -0.379, 0.104)
		colorDistMagn   0.155595
		colorDistFreq   54.7958
		detailScale     7317.84
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0070251
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.267268
		terraceProb     0.16044
		erosion         0
		montesMagn      0.368483
		montesFreq      3.11629
		montesSpiky     0.991988
		montesFraction  0.773843
		dunesFraction   0
		hillsMagn       0
		hillsFreq       108.584
		hillsFraction   0.714798
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237482
		craterFreq      2.78635
		craterDensity   0.778142
		craterOctaves   17
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.493637
		volcanoTemp     1324.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.312, 0.311, 0.310, 0.000)
		colorShelf     (0.332, 0.331, 0.329, 0.000)
		colorBeach     (0.351, 0.350, 0.348, 0.000)
		colorDesert    (0.371, 0.370, 0.368, 0.000)
		colorLowland   (0.390, 0.389, 0.387, 0.000)
		colorUpland    (0.410, 0.408, 0.406, 0.000)
		colorRock      (0.429, 0.428, 0.426, 0.000)
		colorSnow      (0.449, 0.447, 0.445, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00197966
		Period          0.014987
		Eccentricity    0.0422752
		Inclination     -1.02655
		AscendingNode   -157.398
		ArgOfPericenter 94.8608
		MeanAnomaly     154.089
	}
}

DwarfMoon	"Ciutric I.D11"
{
	ParentBody     "Ciutric I"
	Class	       "Asteroid"

	Mass            2.14407e-010
	Radius          9.20231
	InertiaMoment   0.399046

	Obliquity       -29.4933
	EqAscendNode    -127.525
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.679 0.674 0.670)

	Surface
	{
		SurfStyle       0.669258
		OceanStyle      0.67797
		Randomize      (0.579, -0.822, 0.085)
		colorDistMagn   0.373036
		colorDistFreq   0.0513827
		detailScale     251.284
		colorConversion true
		snowLevel       2
		tropicLatitude  0.424868
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.341599
		terraceProb     0.274387
		erosion         0
		montesMagn      0.403883
		montesFreq      2.75757
		montesSpiky     0.995918
		montesFraction  0.94802
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.125887
		hillsFraction   0.612766
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230386
		craterFreq      0.186892
		craterDensity   0.872028
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.522943
		volcanoTemp     1537.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.265, 0.229, 0.188, 0.000)
		colorShelf     (0.272, 0.236, 0.214, 0.000)
		colorBeach     (0.319, 0.276, 0.255, 0.000)
		colorDesert    (0.346, 0.297, 0.248, 0.000)
		colorLowland   (0.380, 0.317, 0.281, 0.000)
		colorUpland    (0.421, 0.384, 0.342, 0.000)
		colorRock      (0.455, 0.418, 0.368, 0.000)
		colorSnow      (0.496, 0.445, 0.389, 1.000)
		BumpHeight      8.28208
		BumpOffset      1.65642
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00881826
		Period          0.140898
		Eccentricity    0.402645
		Inclination     -29.4933
		AscendingNode   -127.525
		ArgOfPericenter -174.52
		MeanAnomaly     92.1249
	}
}

DwarfMoon	"Ciutric I.D12"
{
	ParentBody     "Ciutric I"
	Class	       "Asteroid"

	Mass            3.29845e-010
	Radius          5.52952
	InertiaMoment   0.399958

	Obliquity       54.795
	EqAscendNode    15.2208
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.503 0.499 0.491)

	Surface
	{
		SurfStyle       0.560877
		OceanStyle      0.675278
		Randomize      (-0.868, -0.655, -0.736)
		colorDistMagn   0.366658
		colorDistFreq   0.0258815
		detailScale     150.993
		colorConversion true
		snowLevel       2
		tropicLatitude  0.950126
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.366293
		terraceProb     0.236068
		erosion         0
		montesMagn      0.587308
		montesFreq      3.57607
		montesSpiky     0.992398
		montesFraction  0.575006
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0501438
		hillsFraction   0.682067
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253281
		craterFreq      0.232172
		craterDensity   0.828659
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.530518
		volcanoTemp     1512.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.196, 0.170, 0.137, 0.000)
		colorShelf     (0.201, 0.175, 0.157, 0.000)
		colorBeach     (0.236, 0.205, 0.187, 0.000)
		colorDesert    (0.257, 0.220, 0.182, 0.000)
		colorLowland   (0.282, 0.235, 0.206, 0.000)
		colorUpland    (0.312, 0.284, 0.250, 0.000)
		colorRock      (0.337, 0.309, 0.270, 0.000)
		colorSnow      (0.367, 0.329, 0.285, 1.000)
		BumpHeight      4.97657
		BumpOffset      0.995313
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00933739
		Period          0.153521
		Eccentricity    0.227688
		Inclination     54.795
		AscendingNode   15.2208
		ArgOfPericenter 142.864
		MeanAnomaly     116.323
	}
}

DwarfMoon	"Ciutric I.D13"
{
	ParentBody     "Ciutric I"
	Class	       "Asteroid"

	Mass            4.95326e-010
	Radius          10.9957
	InertiaMoment   0.398065

	RotationPeriod  2885.84
	Obliquity       65.9556
	EqAscendNode    -172.815
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.689 0.686 0.681)

	Surface
	{
		SurfStyle       0.608559
		OceanStyle      0.830867
		Randomize      (0.858, -0.684, 0.962)
		colorDistMagn   0.728788
		colorDistFreq   0.0797636
		detailScale     300.256
		colorConversion true
		snowLevel       2
		tropicLatitude  0.114252
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.512015
		terraceProb     0.490482
		erosion         0
		montesMagn      0.549021
		montesFreq      2.73459
		montesSpiky     0.988561
		montesFraction  0.407204
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.253536
		hillsFraction   0.454496
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258026
		craterFreq      0.241852
		craterDensity   0.970013
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.506118
		volcanoTemp     1420.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.269, 0.233, 0.191, 0.000)
		colorShelf     (0.276, 0.240, 0.218, 0.000)
		colorBeach     (0.324, 0.281, 0.259, 0.000)
		colorDesert    (0.351, 0.302, 0.252, 0.000)
		colorLowland   (0.386, 0.323, 0.286, 0.000)
		colorUpland    (0.427, 0.391, 0.347, 0.000)
		colorRock      (0.462, 0.425, 0.374, 0.000)
		colorSnow      (0.503, 0.453, 0.395, 1.000)
		BumpHeight      9.89613
		BumpOffset      1.97923
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00978168
		Period          0.164608
		Eccentricity    0.458676
		Inclination     65.9556
		AscendingNode   -172.815
		ArgOfPericenter -170.276
		MeanAnomaly     6.03076
	}
}

DwarfMoon	"Ciutric I.D14"
{
	ParentBody     "Ciutric I"
	Class	       "Asteroid"

	Mass            7.29276e-010
	Radius          6.35545
	InertiaMoment   0.399184

	RotationPeriod  4743.09
	Obliquity       -51.8401
	EqAscendNode    -17.3505
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.756 0.754 0.752)

	Surface
	{
		SurfStyle       0.380557
		OceanStyle      0.645409
		Randomize      (-0.988, -0.539, -0.880)
		colorDistMagn   0.555886
		colorDistFreq   0.0191899
		detailScale     173.546
		colorConversion true
		snowLevel       2
		tropicLatitude  0.97805
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.331833
		terraceProb     0.231591
		erosion         0
		montesMagn      0.568419
		montesFreq      2.75915
		montesSpiky     0.944896
		montesFraction  0.514534
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.148233
		hillsFraction   0.711798
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23937
		craterFreq      0.165526
		craterDensity   0.954612
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.564661
		volcanoTemp     1296.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.302, 0.302, 0.301, 0.000)
		colorShelf     (0.321, 0.321, 0.320, 0.000)
		colorBeach     (0.340, 0.339, 0.338, 0.000)
		colorDesert    (0.359, 0.358, 0.357, 0.000)
		colorLowland   (0.378, 0.377, 0.376, 0.000)
		colorUpland    (0.397, 0.396, 0.395, 0.000)
		colorRock      (0.416, 0.415, 0.414, 0.000)
		colorSnow      (0.434, 0.434, 0.432, 1.000)
		BumpHeight      5.7199
		BumpOffset      1.14398
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0103963
		Period          0.180363
		Eccentricity    0.357276
		Inclination     -51.8401
		AscendingNode   -17.3505
		ArgOfPericenter -103.358
		MeanAnomaly     -45.2336
	}
}

DwarfMoon	"Ciutric I.D15"
{
	ParentBody     "Ciutric I"
	Class	       "Asteroid"

	Mass            1.05634e-009
	Radius          15.8886
	InertiaMoment   0.395739

	RotationPeriod  6711.22
	Obliquity       78.6825
	EqAscendNode    -108.07
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.606 0.603 0.602)

	Surface
	{
		SurfStyle       0.9369
		OceanStyle      0.553693
		Randomize      (-0.857, -0.004, 0.150)
		colorDistMagn   0.519573
		colorDistFreq   0.143727
		detailScale     433.864
		colorConversion true
		snowLevel       2
		tropicLatitude  0.941598
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.616206
		terraceProb     0.709431
		erosion         0
		montesMagn      0.620938
		montesFreq      2.39463
		montesSpiky     0.991881
		montesFraction  0.356001
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.531417
		hillsFraction   0.561
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236615
		craterFreq      0.244086
		craterDensity   0.737321
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.474395
		volcanoTemp     1482.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.206, 0.211, 0.241, 0.050)
		colorShelf     (0.242, 0.247, 0.277, 0.040)
		colorBeach     (0.279, 0.284, 0.313, 0.030)
		colorDesert    (0.315, 0.320, 0.355, 0.020)
		colorLowland   (0.351, 0.356, 0.391, 0.030)
		colorUpland    (0.388, 0.392, 0.427, 0.050)
		colorRock      (0.424, 0.428, 0.475, 0.020)
		colorSnow      (0.424, 0.428, 0.475, 1.000)
		BumpHeight      14.2997
		BumpOffset      2.85994
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0108163
		Period          0.191403
		Eccentricity    0.0907996
		Inclination     78.6825
		AscendingNode   -108.07
		ArgOfPericenter -18.5519
		MeanAnomaly     58.613
	}
}

DwarfMoon	"Ciutric I.D16"
{
	ParentBody     "Ciutric I"
	Class	       "Asteroid"

	Mass            1.50944e-009
	Radius          9.27096
	InertiaMoment   0.398255

	Obliquity       -30.9874
	EqAscendNode    -95.6293
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.548 0.546 0.543)

	Surface
	{
		SurfStyle       0.484716
		OceanStyle      0.420993
		Randomize      (-0.951, 0.610, -0.486)
		colorDistMagn   0.731994
		colorDistFreq   0.0254556
		detailScale     253.159
		colorConversion true
		snowLevel       2
		tropicLatitude  0.648832
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.58778
		terraceProb     0.163334
		erosion         0
		montesMagn      0.410718
		montesFreq      2.85897
		montesSpiky     0.972735
		montesFraction  0.676321
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.159402
		hillsFraction   0.628316
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261824
		craterFreq      0.225964
		craterDensity   0.996707
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.539859
		volcanoTemp     1685.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.219, 0.218, 0.217, 0.000)
		colorShelf     (0.233, 0.232, 0.231, 0.000)
		colorBeach     (0.247, 0.246, 0.244, 0.000)
		colorDesert    (0.260, 0.259, 0.258, 0.000)
		colorLowland   (0.274, 0.273, 0.271, 0.000)
		colorUpland    (0.288, 0.287, 0.285, 0.000)
		colorRock      (0.302, 0.300, 0.299, 0.000)
		colorSnow      (0.315, 0.314, 0.312, 1.000)
		BumpHeight      8.34386
		BumpOffset      1.66877
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0112687
		Period          0.203536
		Eccentricity    0.0946115
		Inclination     -30.9874
		AscendingNode   -95.6293
		ArgOfPericenter 71.6266
		MeanAnomaly     22.8601
	}
}

DwarfMoon	"Ciutric I.D17"
{
	ParentBody     "Ciutric I"
	Class	       "Asteroid"

	Mass            2.13259e-009
	Radius          17.9889
	InertiaMoment   0.399318

	RotationPeriod  11434.2
	Obliquity       82.2318
	EqAscendNode    40.0445
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.478 0.472 0.469)

	Surface
	{
		SurfStyle       0.77019
		OceanStyle      0.0931788
		Randomize      (-0.846, 0.886, -0.417)
		colorDistMagn   0.295185
		colorDistFreq   0.128615
		detailScale     491.218
		colorConversion true
		snowLevel       2
		tropicLatitude  0.679917
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.569715
		terraceProb     0.108233
		erosion         0
		montesMagn      0.684125
		montesFreq      3.40515
		montesSpiky     0.966033
		montesFraction  0.211816
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.708084
		hillsFraction   0.724205
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.271011
		craterFreq      0.252138
		craterDensity   0.80431
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.511639
		volcanoTemp     1757.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.187, 0.160, 0.131, 0.000)
		colorShelf     (0.191, 0.165, 0.150, 0.000)
		colorBeach     (0.225, 0.193, 0.178, 0.000)
		colorDesert    (0.244, 0.208, 0.174, 0.000)
		colorLowland   (0.268, 0.222, 0.197, 0.000)
		colorUpland    (0.297, 0.269, 0.239, 0.000)
		colorRock      (0.321, 0.292, 0.258, 0.000)
		colorSnow      (0.349, 0.311, 0.272, 1.000)
		BumpHeight      16.19
		BumpOffset      3.23801
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0117748
		Period          0.217401
		Eccentricity    0.494662
		Inclination     82.2318
		AscendingNode   40.0445
		ArgOfPericenter 90.0581
		MeanAnomaly     34.8926
	}
}

DwarfMoon	"Ciutric I.D18"
{
	ParentBody     "Ciutric I"
	Class	       "Asteroid"

	Mass            2.98461e-009
	Radius          10.2747
	InertiaMoment   0.396532

	Obliquity       -83.1561
	EqAscendNode    -17.2595
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.483 0.477 0.469)

	Surface
	{
		SurfStyle       0.259568
		OceanStyle      0.328714
		Randomize      (0.535, 0.323, 0.288)
		colorDistMagn   0.941085
		colorDistFreq   0.0519844
		detailScale     280.568
		colorConversion true
		snowLevel       2
		tropicLatitude  0.374542
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.593183
		terraceProb     0.353589
		erosion         0
		montesMagn      0.230817
		montesFreq      4.01957
		montesSpiky     0.981329
		montesFraction  0.34342
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.270948
		hillsFraction   0.534571
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239118
		craterFreq      0.188915
		craterDensity   0.974146
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.480144
		volcanoTemp     1366.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.193, 0.191, 0.188, 0.000)
		colorShelf     (0.205, 0.203, 0.200, 0.000)
		colorBeach     (0.217, 0.215, 0.211, 0.000)
		colorDesert    (0.230, 0.226, 0.223, 0.000)
		colorLowland   (0.242, 0.238, 0.235, 0.000)
		colorUpland    (0.254, 0.250, 0.246, 0.000)
		colorRock      (0.266, 0.262, 0.258, 0.000)
		colorSnow      (0.278, 0.274, 0.270, 1.000)
		BumpHeight      9.24723
		BumpOffset      1.84945
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0122933
		Period          0.231916
		Eccentricity    0.249399
		Inclination     -83.1561
		AscendingNode   -17.2595
		ArgOfPericenter -164.093
		MeanAnomaly     -23.837
	}
}

Planet	"Ciutric V"
{
	ParentBody     "Ciutric System"
	Class	       "IceGiant"

	Mass            14.6668
	Radius          20293.6
	InertiaMoment   0.246233

	Oblateness      0.0258433

	RotationPeriod  10.9929
	Obliquity       -193.652
	EqAscendNode    185.07
	Precession      0

	AlbedoBond      0.485919
	AlbedoGeom      0.583103
	Brightness      2
	Color          (0.989 0.988 0.989)

	Surface
	{
		SurfStyle       0.535808
		Randomize      (-0.524, 0.159, 0.647)
		detailScale     52196.4
		colorConversion true
		tropicLatitude  0.270102
		icecapLatitude  1
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     5.57386
		stripeFluct     0.324985
		stripeTwist     10.3031
		cycloneMagn     15.7469
		cycloneFreq     1.06588
		cycloneDensity  0.218745
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
		BumpHeight      16.6161
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          91.1445
		Velocity        2413.45
		BumpHeight      68.1194
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.01443
		mainOctaves     12
		Coverage        0.429596
		stripeZones     5.57386
		stripeFluct     0.324985
		stripeTwist     10.3031
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Jupiter"
		Height          202.936
		Density         789.29
		Pressure        145711
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.00299669
		Saturation      0.96015

		Composition
		{
			H2    	91.9853
			He    	7.67799
			CH4   	0.257655
			N2    	0.0374277
			NH3   	0.0277556
			O2    	0.00666098
			C2H2  	0.00305351
			C2H4  	0.0012813
			Ne    	0.00118
			Ar    	0.000722083
			C2H6  	0.000651761
			C3H8  	0.000356075
		}
	}

	Aurora
	{
		Height      445.174
		NorthLat    55.2854
		NorthLon    -5.93083
		NorthRadius 4154.87
		NorthWidth  761.208
		NorthRings  2
		NorthBright 1
		NorthParticles 10000
		SouthLat    -63.0577
		SouthLon    170.458
		SouthRadius 5662.96
		SouthWidth  1760.77
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
		SemiMajorAxis   4.46544
		Period          6.89116
		Eccentricity    0.0855345
		Inclination     2.01993
		AscendingNode   177.619
		ArgOfPericenter 92.1374
		MeanAnomaly     247.348
	}
}

DwarfMoon	"Ciutric V.D1"
{
	ParentBody     "Ciutric V"
	Class	       "Asteroid"

	Mass            5.8906e-008
	Radius          50.6051
	InertiaMoment   0.399675

	Oblateness      0.249

	Obliquity       0.013642
	EqAscendNode    26.9907
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.739 0.737 0.734)

	Surface
	{
		SurfStyle       0.62541
		OceanStyle      0.124695
		Randomize      (-0.215, -0.931, 0.864)
		colorDistMagn   0.305958
		colorDistFreq   1.96194
		detailScale     1381.86
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000488281
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.691301
		terraceProb     0.217198
		erosion         0
		montesMagn      0.490139
		montesFreq      3.08844
		montesSpiky     0.970848
		montesFraction  0.462105
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.44995
		hillsFraction   0.802185
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229266
		craterFreq      0.185031
		craterDensity   0.791728
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.440195
		volcanoTemp     1703.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.288, 0.250, 0.206, 0.000)
		colorShelf     (0.296, 0.258, 0.235, 0.000)
		colorBeach     (0.347, 0.302, 0.279, 0.000)
		colorDesert    (0.377, 0.324, 0.272, 0.000)
		colorLowland   (0.414, 0.346, 0.308, 0.000)
		colorUpland    (0.458, 0.420, 0.374, 0.000)
		colorRock      (0.495, 0.457, 0.404, 0.000)
		colorSnow      (0.540, 0.486, 0.426, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00028597
		Period          0.000730285
		Eccentricity    5.642e-005
		Inclination     0.013642
		AscendingNode   26.9907
		ArgOfPericenter 153.302
		MeanAnomaly     -115.247
	}
}

DwarfMoon	"Ciutric V.D2"
{
	ParentBody     "Ciutric V"
	Class	       "Asteroid"

	Mass            8.01543e-008
	Radius          65.5479
	InertiaMoment   0.397552

	Oblateness      0.249

	Obliquity       0.00186393
	EqAscendNode    2.69948
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.687 0.683 0.678)

	Surface
	{
		SurfStyle       0.877156
		OceanStyle      0.839122
		Randomize      (-0.372, -0.748, 0.160)
		colorDistMagn   0.631938
		colorDistFreq   2.19649
		detailScale     1789.89
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.272798
		terraceProb     0.350938
		erosion         0
		montesMagn      0.599331
		montesFreq      3.72275
		montesSpiky     0.82561
		montesFraction  0.494644
		dunesFraction   0
		hillsMagn       0
		hillsFreq       10.7815
		hillsFraction   0.487805
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25498
		craterFreq      0.207421
		craterDensity   0.923382
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.540529
		volcanoTemp     1707.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.234, 0.239, 0.271, 0.050)
		colorShelf     (0.275, 0.280, 0.312, 0.040)
		colorBeach     (0.316, 0.321, 0.353, 0.030)
		colorDesert    (0.357, 0.362, 0.400, 0.020)
		colorLowland   (0.399, 0.403, 0.441, 0.030)
		colorUpland    (0.440, 0.444, 0.482, 0.050)
		colorRock      (0.481, 0.485, 0.536, 0.020)
		colorSnow      (0.481, 0.485, 0.536, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000330568
		Period          0.000907618
		Eccentricity    2.88435e-005
		Inclination     0.00186393
		AscendingNode   2.69948
		ArgOfPericenter 62.1376
		MeanAnomaly     -75.6571
	}
}

DwarfMoon	"Ciutric V.D3"
{
	ParentBody     "Ciutric V"
	Class	       "Asteroid"

	Mass            1.09361e-007
	Radius          68.8259
	InertiaMoment   0.398867

	Oblateness      0.249

	Obliquity       -0.0105549
	EqAscendNode    -155.116
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.643 0.641 0.642)

	Surface
	{
		SurfStyle       0.595141
		OceanStyle      0.524102
		Randomize      (-0.067, -0.029, -0.257)
		colorDistMagn   0.691154
		colorDistFreq   1.59912
		detailScale     1879.41
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.308316
		terraceProb     0.361487
		erosion         0
		montesMagn      0.483334
		montesFreq      3.97133
		montesSpiky     0.945101
		montesFraction  0.343374
		dunesFraction   0
		hillsMagn       0
		hillsFreq       13.303
		hillsFraction   0.520498
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244492
		craterFreq      0.194779
		craterDensity   0.906877
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.530994
		volcanoTemp     1694.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.179, 0.155, 0.127, 0.000)
		colorShelf     (0.183, 0.159, 0.145, 0.000)
		colorBeach     (0.215, 0.187, 0.172, 0.000)
		colorDesert    (0.234, 0.200, 0.168, 0.000)
		colorLowland   (0.257, 0.214, 0.190, 0.000)
		colorUpland    (0.284, 0.259, 0.231, 0.000)
		colorRock      (0.307, 0.282, 0.249, 0.000)
		colorSnow      (0.334, 0.300, 0.263, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000344473
		Period          0.000965482
		Eccentricity    9.80648e-006
		Inclination     -0.0105549
		AscendingNode   -155.116
		ArgOfPericenter 74.5886
		MeanAnomaly     -60.0729
	}
}

DwarfMoon	"Ciutric V.D4"
{
	ParentBody     "Ciutric V"
	Class	       "Asteroid"

	Mass            1.49756e-007
	Radius          73.4028
	InertiaMoment   0.399801

	Oblateness      0.249

	Obliquity       2.7981e-005
	EqAscendNode    -109.024
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.639 0.639 0.639)

	Surface
	{
		SurfStyle       0.391232
		OceanStyle      0.069913
		Randomize      (0.273, 0.147, 0.495)
		colorDistMagn   0.452828
		colorDistFreq   1.84726
		detailScale     2004.39
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.399631
		terraceProb     0.352057
		erosion         0
		montesMagn      0.446954
		montesFreq      3.32915
		montesSpiky     0.967517
		montesFraction  0.863542
		dunesFraction   0
		hillsMagn       0
		hillsFreq       13.9682
		hillsFraction   0.670987
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.187637
		craterFreq      0.220306
		craterDensity   0.903772
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.570748
		volcanoTemp     1630.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.264, 0.262, 0.261, 0.000)
		colorShelf     (0.281, 0.279, 0.277, 0.000)
		colorBeach     (0.297, 0.295, 0.294, 0.000)
		colorDesert    (0.314, 0.311, 0.310, 0.000)
		colorLowland   (0.330, 0.328, 0.326, 0.000)
		colorUpland    (0.347, 0.344, 0.343, 0.000)
		colorRock      (0.363, 0.361, 0.359, 0.000)
		colorSnow      (0.380, 0.377, 0.375, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000363894
		Period          0.00104827
		Eccentricity    2.39699e-005
		Inclination     2.7981e-005
		AscendingNode   -109.024
		ArgOfPericenter 82.4141
		MeanAnomaly     83.2955
	}
}

DwarfMoon	"Ciutric V.D5"
{
	ParentBody     "Ciutric V"
	Class	       "Asteroid"

	Mass            2.06041e-007
	Radius          77.7053
	InertiaMoment   0.397797

	Oblateness      0.206915

	Obliquity       -0.00627674
	EqAscendNode    45.4734
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.677 0.676 0.677)

	Surface
	{
		SurfStyle       0.0808924
		OceanStyle      0.583576
		Randomize      (-0.067, -0.004, -0.307)
		colorDistMagn   0.29071
		colorDistFreq   0.392335
		detailScale     2121.87
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.526441
		terraceProb     0.474781
		erosion         0
		montesMagn      0.52189
		montesFreq      2.65188
		montesSpiky     0.870914
		montesFraction  0.502117
		dunesFraction   0
		hillsMagn       0
		hillsFreq       15.6838
		hillsFraction   0.530268
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246006
		craterFreq      0.145824
		craterDensity   0.963815
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.485212
		volcanoTemp     1613.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.290, 0.288, 0.287, 0.000)
		colorShelf     (0.308, 0.306, 0.305, 0.000)
		colorBeach     (0.326, 0.324, 0.323, 0.000)
		colorDesert    (0.345, 0.342, 0.341, 0.000)
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
		SemiMajorAxis   0.000390393
		Period          0.00116484
		Eccentricity    2.81033e-005
		Inclination     -0.00627674
		AscendingNode   45.4734
		ArgOfPericenter -2.80089
		MeanAnomaly     -146.293
	}
}

DwarfMoon	"Ciutric V.D6"
{
	ParentBody     "Ciutric V"
	Class	       "Asteroid"

	Mass            2.85149e-007
	Radius          101.268
	InertiaMoment   0.39901

	Oblateness      0.249

	Obliquity       -0.00540546
	EqAscendNode    68.4453
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.660 0.660 0.659)

	Surface
	{
		SurfStyle       0.48464
		OceanStyle      0.844705
		Randomize      (-0.744, -0.822, -0.048)
		colorDistMagn   0.524579
		colorDistFreq   4.58358
		detailScale     2765.29
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.703703
		terraceProb     0.179672
		erosion         0
		montesMagn      0.274615
		montesFreq      3.64652
		montesSpiky     0.911882
		montesFraction  0.724365
		dunesFraction   0
		hillsMagn       0
		hillsFreq       16.1794
		hillsFraction   0.639029
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.265402
		craterFreq      0.412015
		craterDensity   0.969858
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.430625
		volcanoTemp     1244.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.228, 0.226, 0.225, 0.000)
		colorShelf     (0.243, 0.240, 0.239, 0.000)
		colorBeach     (0.257, 0.254, 0.253, 0.000)
		colorDesert    (0.271, 0.268, 0.267, 0.000)
		colorLowland   (0.286, 0.283, 0.281, 0.000)
		colorUpland    (0.300, 0.297, 0.295, 0.000)
		colorRock      (0.314, 0.311, 0.309, 0.000)
		colorSnow      (0.328, 0.325, 0.323, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000416306
		Period          0.00128272
		Eccentricity    1.0662e-005
		Inclination     -0.00540546
		AscendingNode   68.4453
		ArgOfPericenter 27.593
		MeanAnomaly     82.5861
	}
}

Moon	"Ciutric V.1"
{
	ParentBody     "Ciutric V"
	Class	       "Selena"

	Mass            0.00316659
	Radius          1119.58
	InertiaMoment   0.399148

	Oblateness      0.00811745

	Obliquity       -0.922112
	EqAscendNode    35.7552
	Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.993 0.993 0.994)

	Surface
	{
		SurfStyle       0.8578
		OceanStyle      0.402505
		Randomize      (0.622, 0.200, 0.489)
		colorDistMagn   0.0841882
		colorDistFreq   126.694
		detailScale     2879.63
		colorConversion true
		drivenDarkening 0
		seaLevel        0.21566
		snowLevel       2
		tropicLatitude  0.030628
		icecapLatitude  8.89869
		icecapHeight    0.157655
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.82576
		venusFreq       1.15091
		venusMagn       0
		mareFreq        0.330244
		mareDensity     0.00154919
		terraceProb     0.192444
		erosion         0
		montesMagn      0.0560438
		montesFreq      43.884
		montesSpiky     0.944899
		montesFraction  0.670256
		dunesMagn       0.0491166
		dunesFreq       1471.64
		dunesFraction   0.361823
		hillsMagn       0.129671
		hillsFreq       117.217
		hillsFraction   0.705084
		hills2Fraction  0
		riversMagn      68.5689
		riversFreq      2.9201
		riversSin       4.43476
		riversOctaves   0
		canyonsMagn     0.778952
		canyonsFreq     0.411224
		canyonFraction  0.998657
		cracksMagn      0.0729762
		cracksFreq      0.401982
		cracksOctaves   0
		craterMagn      0.629045
		craterFreq      4.00374
		craterDensity   0.744276
		craterOctaves   9.25595
		craterRayedFactor 0.161962
		volcanoMagn     0.185192
		volcanoFreq     0.700621
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.264316
		volcanoRadius   0.128556
		volcanoTemp     1482.89
		lavaCoverTidal  0.0826716
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.400, 0.350, 0.320, 0.000)
		colorShelf     (0.470, 0.410, 0.380, 0.000)
		colorBeach     (0.448, 0.375, 0.334, 0.000)
		colorDesert    (0.408, 0.351, 0.294, 0.000)
		colorLowland   (0.312, 0.271, 0.223, 0.000)
		colorUpland    (0.528, 0.479, 0.413, 0.000)
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
		SemiMajorAxis   0.000666988
		Period          0.00260101
		Eccentricity    0.00701363
		Inclination     -0.922111
		AscendingNode   35.7552
		ArgOfPericenter 153.15
		MeanAnomaly     -72.1989
	}
}

Moon	"Ciutric V.2"
{
	ParentBody     "Ciutric V"
	Class	       "Selena"

	Mass            0.00376082
	Radius          1281.94
	InertiaMoment   0.396341

	Oblateness      0.00258186

	Obliquity       -0.30529
	EqAscendNode    -157.399
	Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.992 0.991 0.992)

	Surface
	{
		SurfStyle       0.342098
		OceanStyle      0.82037
		Randomize      (-0.209, 0.375, 0.581)
		colorDistMagn   0.055027
		colorDistFreq   115.204
		detailScale     3297.22
		colorConversion true
		drivenDarkening 0
		seaLevel        0.15257
		snowLevel       2
		tropicLatitude  0.00210018
		icecapLatitude  8.81641
		icecapHeight    0.149715
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.71658
		venusFreq       1.10742
		venusMagn       0
		mareFreq        0.464919
		mareDensity     0.00100624
		terraceProb     0.112886
		erosion         0
		montesMagn      0.0608583
		montesFreq      44.4034
		montesSpiky     0.943949
		montesFraction  0.355341
		dunesMagn       0.0541365
		dunesFreq       1680.04
		dunesFraction   0.536565
		hillsMagn       0.135606
		hillsFreq       172.901
		hillsFraction   0.295041
		hills2Fraction  0
		riversMagn      63.934
		riversFreq      2.74938
		riversSin       3.96617
		riversOctaves   0
		canyonsMagn     0.529011
		canyonsFreq     0.500782
		canyonFraction  0.357376
		cracksMagn      0.0752085
		cracksFreq      0.608137
		cracksOctaves   0
		craterMagn      0.66401
		craterFreq      4.72207
		craterDensity   0.897436
		craterOctaves   10.1794
		craterRayedFactor 0.192852
		volcanoMagn     0.189819
		volcanoFreq     0.634473
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.129758
		volcanoRadius   0.152208
		volcanoTemp     1435.4
		lavaCoverTidal  0.0828855
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.420, 0.420, 0.430, 0.000)
		colorShelf     (0.470, 0.480, 0.480, 0.000)
		colorBeach     (0.439, 0.455, 0.478, 0.000)
		colorDesert    (0.383, 0.367, 0.366, 0.000)
		colorLowland   (0.487, 0.487, 0.446, 0.000)
		colorUpland    (0.519, 0.518, 0.486, 0.000)
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
		SemiMajorAxis   0.00105279
		Period          0.00515785
		Eccentricity    0.0232322
		Inclination     -0.30529
		AscendingNode   -157.399
		ArgOfPericenter 87.1967
		MeanAnomaly     -131.718
	}
}

Planet	"Ciutric VI"
{
	ParentBody     "Ciutric System"
	Class	       "IceWorld"

	Mass            0.0235092
	Radius          2160
	InertiaMoment   0.362249

	Oblateness      0.00283021

	RotationPeriod  35.4449
	Obliquity       -53.8706
	EqAscendNode    129.376
	Precession      0

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.986 0.986 0.986)

	Surface
	{
		SurfStyle       0.875313
		OceanStyle      0.824514
		Randomize      (0.783, 0.191, -0.001)
		colorDistMagn   0.0579361
		colorDistFreq   240.124
		detailScale     5555.65
		colorConversion true
		drivenDarkening 0
		seaLevel        0.290092
		snowLevel       2
		tropicLatitude  0.823127
		icecapLatitude  1
		icecapHeight    0.290092
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.81673
		venusFreq       0.427519
		venusMagn       0
		mareFreq        1.11579
		mareDensity     0.00559076
		terraceProb     0.165195
		erosion         0
		montesMagn      0.104987
		montesFreq      95.1853
		montesSpiky     0.956218
		montesFraction  0.0793794
		dunesMagn       0.0292813
		dunesFreq       2778.87
		dunesFraction   0.298134
		hillsMagn       0.146673
		hillsFreq       202.357
		hillsFraction   0.232155
		hills2Fraction  0.187887
		riversMagn      62.9226
		riversFreq      2.84418
		riversSin       4.67602
		riversOctaves   0
		canyonsMagn     0.300089
		canyonsFreq     0.902295
		canyonFraction  0
		cracksMagn      0.0410767
		cracksFreq      1.3396
		cracksOctaves   3
		craterMagn      0.53607
		craterFreq      4.15101
		craterDensity   0.924905
		craterOctaves   11
		craterRayedFactor 0.169087
		volcanoMagn     0.392595
		volcanoFreq     0.658401
		volcanoDensity  0.219096
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.254484
		volcanoRadius   0.3078
		volcanoTemp     1512.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.660, 0.491, 0.373, 0.000)
		colorShelf     (0.627, 0.466, 0.355, 0.000)
		colorBeach     (0.330, 0.245, 0.187, 0.000)
		colorDesert    (0.561, 0.418, 0.317, 0.000)
		colorLowland   (0.535, 0.432, 0.355, 0.000)
		colorUpland    (0.614, 0.456, 0.347, 0.000)
		colorRock      (1.000, 1.000, 1.000, 0.500)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.535, 0.432, 0.355, 0.000)
		colorUpPlants  (0.614, 0.456, 0.347, 0.000)
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
		SemiMajorAxis   7.71483
		Period          15.6491
		Eccentricity    0.0627867
		Inclination     2.36431
		AscendingNode   129.627
		ArgOfPericenter 354.483
		MeanAnomaly     353.006
	}
}

Planet	"Ciutric VII"
{
	ParentBody     "Ciutric System"
	Class	       "GasGiant"

	Mass            100.102
	Radius          59429.8
	InertiaMoment   0.195763

	Oblateness      0.0805485

	RotationPeriod  10.989
	Obliquity       -64.7074
	EqAscendNode    87.7175
	Precession      0

	AlbedoBond      0.490292
	AlbedoGeom      0.58835
	Brightness      2
	Color          (0.881 0.880 0.882)

	Surface
	{
		SurfStyle       0.653436
		Randomize      (-0.530, -0.852, 0.981)
		detailScale     152857
		colorConversion true
		tropicLatitude  0.902575
		icecapLatitude  1
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     3.9617
		stripeFluct     0.401696
		stripeTwist     9.97464
		cycloneMagn     8.83765
		cycloneFreq     0.621788
		cycloneDensity  0.344253
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
		BumpHeight      18.626
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          248.895
		Velocity        1229.42
		BumpHeight      63.2084
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.04438
		mainOctaves     12
		Coverage        0.40292
		stripeZones     3.9617
		stripeFluct     0.401696
		stripeTwist     9.97464
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Jupiter"
		Height          594.297
		Density         5428.68
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.0379154
		Saturation      0.57717

		Composition
		{
			H2    	92.2512
			He    	7.33148
			CH4   	0.360354
			N2    	0.0446325
			O2    	0.00821592
			C2H4  	0.00143808
			Ne    	0.00133147
			Ar    	0.000833138
			C2H2  	0.000349405
			C2H6  	0.000183029
		}
	}

	Aurora
	{
		Height      1792.1
		NorthLat    82.1325
		NorthLon    -114.256
		NorthRadius 14414.3
		NorthWidth  7245.8
		NorthRings  2
		NorthBright 1
		NorthParticles 10000
		SouthLat    -81.4838
		SouthLon    62.2431
		SouthRadius 16337.8
		SouthWidth  5165.54
		SouthRings  5
		SouthBright 1
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	Rings
	{
		InnerRadius     65604.5
		OuterRadius     73204.4
		RotationPeriod  5.06341
		RotationOffset  0
		FrontBright     0.681784
		BackBright      0.736461
		Density         0.660931
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   12.1632
		Period          30.977
		Eccentricity    0.0738209
		Inclination     -2.33979
		AscendingNode   95.6712
		ArgOfPericenter 187.193
		MeanAnomaly     185.669
	}
}

DwarfMoon	"Ciutric VII.D1"
{
	ParentBody     "Ciutric VII"
	Class	       "Asteroid"

	Mass            2.66738e-009
	Radius          19.4042
	InertiaMoment   0.398795

	Oblateness      0.188944

	Obliquity       0.0143449
	EqAscendNode    41.6668
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.648 0.645 0.638)

	Surface
	{
		SurfStyle       0.308334
		OceanStyle      0.118304
		Randomize      (-0.164, 0.748, -0.920)
		colorDistMagn   0.89387
		colorDistFreq   0.24034
		detailScale     529.864
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000488281
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.761622
		terraceProb     0.238279
		erosion         0
		montesMagn      0.503803
		montesFreq      3.17166
		montesSpiky     0.969973
		montesFraction  0.422345
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.950514
		hillsFraction   0.562118
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.273619
		craterFreq      0.261899
		craterDensity   0.930413
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.513562
		volcanoTemp     1521.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.259, 0.258, 0.255, 0.000)
		colorShelf     (0.276, 0.274, 0.271, 0.000)
		colorBeach     (0.292, 0.290, 0.287, 0.000)
		colorDesert    (0.308, 0.306, 0.303, 0.000)
		colorLowland   (0.324, 0.322, 0.319, 0.000)
		colorUpland    (0.340, 0.338, 0.335, 0.000)
		colorRock      (0.357, 0.354, 0.351, 0.000)
		colorSnow      (0.373, 0.371, 0.367, 1.000)
		BumpHeight      17.4638
		BumpOffset      3.49276
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000812769
		Period          0.0013394
		Eccentricity    7.15243e-005
		Inclination     0.0143449
		AscendingNode   41.6668
		ArgOfPericenter 80.5263
		MeanAnomaly     88.2262
	}
}

DwarfMoon	"Ciutric VII.D2"
{
	ParentBody     "Ciutric VII"
	Class	       "Asteroid"

	Mass            3.71304e-009
	Radius          20.7502
	InertiaMoment   0.39974

	Oblateness      0.161245

	Obliquity       0.00065608
	EqAscendNode    -135.336
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.543 0.541 0.538)

	Surface
	{
		SurfStyle       0.329006
		OceanStyle      0.274967
		Randomize      (0.290, 0.476, -0.768)
		colorDistMagn   0.0183524
		colorDistFreq   0.19916
		detailScale     566.618
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.631337
		terraceProb     0.116584
		erosion         0
		montesMagn      0.643741
		montesFreq      2.79083
		montesSpiky     0.978765
		montesFraction  0.606994
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.874583
		hillsFraction   0.763453
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236982
		craterFreq      0.173966
		craterDensity   0.896161
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.520415
		volcanoTemp     1656.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.217, 0.216, 0.215, 0.000)
		colorShelf     (0.231, 0.230, 0.229, 0.000)
		colorBeach     (0.244, 0.243, 0.242, 0.000)
		colorDesert    (0.258, 0.257, 0.256, 0.000)
		colorLowland   (0.271, 0.270, 0.269, 0.000)
		colorUpland    (0.285, 0.284, 0.283, 0.000)
		colorRock      (0.299, 0.298, 0.296, 0.000)
		colorSnow      (0.312, 0.311, 0.310, 1.000)
		BumpHeight      18.6751
		BumpOffset      3.73503
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000821625
		Period          0.00136135
		Eccentricity    7.93385e-005
		Inclination     0.00065608
		AscendingNode   -135.336
		ArgOfPericenter -110.405
		MeanAnomaly     11.3212
	}
}

DwarfMoon	"Ciutric VII.D3"
{
	ParentBody     "Ciutric VII"
	Class	       "Asteroid"

	Mass            5.13293e-009
	Radius          27.5779
	InertiaMoment   0.397683

	Oblateness      0.243124

	Obliquity       -0.0149723
	EqAscendNode    -71.9932
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.824 0.742 0.710)

	Surface
	{
		SurfStyle       0.532233
		OceanStyle      0.148383
		Randomize      (-0.442, -0.712, -0.693)
		colorDistMagn   0.396109
		colorDistFreq   0.56769
		detailScale     753.059
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.359592
		terraceProb     0.10068
		erosion         0
		montesMagn      0.543988
		montesFreq      2.23363
		montesSpiky     0.940897
		montesFraction  0.779463
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.43193
		hillsFraction   0.410949
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22983
		craterFreq      0.195653
		craterDensity   0.743354
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.597609
		volcanoTemp     1496.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.321, 0.252, 0.199, 0.000)
		colorShelf     (0.330, 0.260, 0.227, 0.000)
		colorBeach     (0.387, 0.304, 0.270, 0.000)
		colorDesert    (0.420, 0.326, 0.263, 0.000)
		colorLowland   (0.461, 0.349, 0.298, 0.000)
		colorUpland    (0.511, 0.423, 0.362, 0.000)
		colorRock      (0.552, 0.460, 0.390, 0.000)
		colorSnow      (0.601, 0.490, 0.412, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000852648
		Period          0.00143917
		Eccentricity    8.49706e-005
		Inclination     -0.0149723
		AscendingNode   -71.9932
		ArgOfPericenter 22.0301
		MeanAnomaly     -155.863
	}
}

DwarfMoon	"Ciutric VII.D4"
{
	ParentBody     "Ciutric VII"
	Class	       "Asteroid"

	Mass            7.05577e-009
	Radius          28.1845
	InertiaMoment   0.398941

	Oblateness      0.177649

	Obliquity       0.0128201
	EqAscendNode    -86.0481
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.805 0.711 0.671)

	Surface
	{
		SurfStyle       0.303926
		OceanStyle      0.284748
		Randomize      (0.206, -0.785, 0.922)
		colorDistMagn   0.0332539
		colorDistFreq   0.100487
		detailScale     769.626
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.388581
		terraceProb     0.346064
		erosion         0
		montesMagn      0.491048
		montesFreq      3.24023
		montesSpiky     0.953879
		montesFraction  0.243512
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.74127
		hillsFraction   0.773141
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.265981
		craterFreq      0.227165
		craterDensity   1.01906
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.551794
		volcanoTemp     1329.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.322, 0.285, 0.268, 0.000)
		colorShelf     (0.342, 0.302, 0.285, 0.000)
		colorBeach     (0.362, 0.320, 0.302, 0.000)
		colorDesert    (0.383, 0.338, 0.319, 0.000)
		colorLowland   (0.403, 0.356, 0.336, 0.000)
		colorUpland    (0.423, 0.374, 0.352, 0.000)
		colorRock      (0.443, 0.391, 0.369, 0.000)
		colorSnow      (0.463, 0.409, 0.386, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000871495
		Period          0.00148716
		Eccentricity    4.89339e-005
		Inclination     0.0128201
		AscendingNode   -86.0481
		ArgOfPericenter -152.224
		MeanAnomaly     128.424
	}
}

DwarfMoon	"Ciutric VII.D5"
{
	ParentBody     "Ciutric VII"
	Class	       "Asteroid"

	Mass            9.65516e-009
	Radius          29.9611
	InertiaMoment   0.399866

	Oblateness      0.137448

	Obliquity       0.0140116
	EqAscendNode    -163.884
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.657 0.593 0.552)

	Surface
	{
		SurfStyle       0.3841
		OceanStyle      0.964422
		Randomize      (-0.318, -0.792, 0.485)
		colorDistMagn   0.769949
		colorDistFreq   0.292819
		detailScale     818.138
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.647771
		terraceProb     0.724573
		erosion         0
		montesMagn      0.384379
		montesFreq      3.59115
		montesSpiky     0.885053
		montesFraction  0.589794
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.19768
		hillsFraction   0.450366
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248392
		craterFreq      0.175749
		craterDensity   0.906433
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.501707
		volcanoTemp     1455.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.263, 0.237, 0.221, 0.000)
		colorShelf     (0.279, 0.252, 0.235, 0.000)
		colorBeach     (0.296, 0.267, 0.248, 0.000)
		colorDesert    (0.312, 0.282, 0.262, 0.000)
		colorLowland   (0.329, 0.296, 0.276, 0.000)
		colorUpland    (0.345, 0.311, 0.290, 0.000)
		colorRock      (0.362, 0.326, 0.304, 0.000)
		colorSnow      (0.378, 0.341, 0.317, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000910018
		Period          0.00158684
		Eccentricity    2.01851e-005
		Inclination     0.0140116
		AscendingNode   -163.884
		ArgOfPericenter -119.683
		MeanAnomaly     144.809
	}
}

Moon	"Ciutric VII.1"
{
	ParentBody     "Ciutric VII"
	Class	       "Selena"

	Mass            0.004159
	Radius          1325.16
	InertiaMoment   0.394702

	Oblateness      0.00619261

	Obliquity       -1.33236
	EqAscendNode    -40.5032
	Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.991 0.993 0.992)

	Surface
	{
		SurfStyle       0.131796
		OceanStyle      0.456345
		Randomize      (-0.045, -0.378, 0.065)
		colorDistMagn   0.0551848
		colorDistFreq   156.005
		detailScale     3408.38
		colorConversion true
		drivenDarkening 0
		seaLevel        0.226283
		snowLevel       2
		tropicLatitude  0.0436191
		icecapLatitude  0.480745
		icecapHeight    0.276925
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.71632
		venusFreq       1.45794
		venusMagn       0
		mareFreq        0.484623
		mareDensity     0.00144881
		terraceProb     0.368272
		erosion         0
		montesMagn      0.055615
		montesFreq      65.3468
		montesSpiky     0.867359
		montesFraction  0.249597
		dunesMagn       0.0553295
		dunesFreq       1737.03
		dunesFraction   0.78435
		hillsMagn       0.120112
		hillsFreq       158.373
		hillsFraction   0.776242
		hills2Fraction  0
		riversMagn      61.2815
		riversFreq      3.51838
		riversSin       4.96303
		riversOctaves   0
		canyonsMagn     0.304346
		canyonsFreq     0.577606
		canyonFraction  0.771048
		cracksMagn      0.0758485
		cracksFreq      0.682608
		cracksOctaves   0
		craterMagn      0.680198
		craterFreq      3.53863
		craterDensity   0.634045
		craterOctaves   8.4275
		craterRayedFactor 0.0928734
		volcanoMagn     0.196972
		volcanoFreq     0.686724
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.440376
		volcanoRadius   0.143115
		volcanoTemp     1423.06
		lavaCoverTidal  0.259849
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.320, 0.320, 0.000)
		colorShelf     (0.370, 0.370, 0.370, 0.000)
		colorBeach     (0.247, 0.243, 0.241, 0.000)
		colorDesert    (0.306, 0.291, 0.275, 0.200)
		colorLowland   (0.331, 0.311, 0.308, 0.500)
		colorUpland    (0.346, 0.325, 0.318, 0.800)
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
		SemiMajorAxis   0.00148813
		Period          0.00331827
		Eccentricity    0.0359934
		Inclination     -1.33236
		AscendingNode   -40.5032
		ArgOfPericenter 80.7221
		MeanAnomaly     178.458
	}
}

Moon	"Ciutric VII.2"
{
	ParentBody     "Ciutric VII"
	Class	       "IceWorld"

	Mass            0.00481986
	Radius          1285.73
	InertiaMoment   0.390793

	Oblateness      0.0011133

	Obliquity       -1.11859
	EqAscendNode    154.618
	Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.986 0.965 0.945)

	Surface
	{
		SurfStyle       0.883278
		OceanStyle      0.0139738
		Randomize      (0.539, 0.904, -0.288)
		colorDistMagn   0.0626199
		colorDistFreq   197.593
		detailScale     3306.98
		colorConversion true
		drivenDarkening 0.7
		seaLevel        0.134974
		snowLevel       2
		tropicLatitude  0.00857618
		icecapLatitude  0.520158
		icecapHeight    0.161642
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.72769
		venusFreq       0.387623
		venusMagn       0
		mareFreq        0.41674
		mareDensity     0.00214618
		terraceProb     0.171142
		erosion         0
		montesMagn      0.0634028
		montesFreq      55.3726
		montesSpiky     0.941181
		montesFraction  0.0503699
		dunesMagn       0.0513553
		dunesFreq       1675.51
		dunesFraction   0.174797
		hillsMagn       0.122061
		hillsFreq       148.329
		hillsFraction   0.899568
		hills2Fraction  0.229711
		riversMagn      63.7969
		riversFreq      2.36432
		riversSin       5.37496
		riversOctaves   0
		canyonsMagn     0.546467
		canyonsFreq     0.425451
		canyonFraction  0
		cracksMagn      0.0292643
		cracksFreq      0.669167
		cracksOctaves   0
		craterMagn      0.607894
		craterFreq      3.73026
		craterDensity   0.804377
		craterOctaves   11
		craterRayedFactor 0.225929
		volcanoMagn     0.189895
		volcanoFreq     0.639403
		volcanoDensity  0.188228
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.0704384
		volcanoRadius   0.132338
		volcanoTemp     1513.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.540, 0.262, 0.161, 0.000)
		colorShelf     (0.513, 0.249, 0.153, 0.000)
		colorBeach     (0.270, 0.131, 0.081, 0.000)
		colorDesert    (0.459, 0.223, 0.137, 0.000)
		colorLowland   (0.437, 0.231, 0.153, 0.000)
		colorUpland    (0.502, 0.244, 0.150, 0.000)
		colorRock      (1.000, 1.000, 1.000, 0.500)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.437, 0.231, 0.153, 0.000)
		colorUpPlants  (0.502, 0.244, 0.150, 0.000)
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
		SemiMajorAxis   0.00242368
		Period          0.00689704
		Eccentricity    0.0153048
		Inclination     -1.11859
		AscendingNode   154.618
		ArgOfPericenter -8.8966
		MeanAnomaly     173.946
	}
}

Moon	"Ciutric VII.3"
{
	ParentBody     "Ciutric VII"
	Class	       "IceWorld"

	Mass            0.00557969
	Radius          1551.27
	InertiaMoment   0.386715

	Obliquity       1.176
	EqAscendNode    -38.3651
	Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.987 0.987 0.988)

	Surface
	{
		SurfStyle       0.656353
		OceanStyle      0.758047
		Randomize      (0.419, -0.456, 0.083)
		colorDistMagn   0.057037
		colorDistFreq   200.356
		detailScale     3989.95
		colorConversion true
		drivenDarkening 0.7
		seaLevel        0.124915
		snowLevel       2
		tropicLatitude  0.0387611
		icecapLatitude  0.481204
		icecapHeight    0.144911
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.93017
		venusFreq       0.443958
		venusMagn       0
		mareFreq        0.562671
		mareDensity     0.00109755
		terraceProb     0.216057
		erosion         0
		montesMagn      0.0758008
		montesFreq      55.7287
		montesSpiky     0.847833
		montesFraction  0.230841
		dunesMagn       0.0382548
		dunesFreq       2073.16
		dunesFraction   0.206095
		hillsMagn       0.128867
		hillsFreq       159.11
		hillsFraction   0.476463
		hills2Fraction  0.117189
		riversMagn      58.706
		riversFreq      3.62754
		riversSin       8.23648
		riversOctaves   0
		canyonsMagn     0.507712
		canyonsFreq     0.554307
		canyonFraction  0
		cracksMagn      0.0590906
		cracksFreq      0.521864
		cracksOctaves   1
		craterMagn      0.627824
		craterFreq      4.86932
		craterDensity   0.933532
		craterOctaves   11
		craterRayedFactor 0.230674
		volcanoMagn     0.187905
		volcanoFreq     0.600884
		volcanoDensity  0.255755
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.0733275
		volcanoRadius   0.139758
		volcanoTemp     1504.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.493, 0.492, 0.514, 0.250)
		colorShelf     (0.539, 0.561, 0.583, 0.250)
		colorBeach     (0.439, 0.415, 0.445, 0.200)
		colorDesert    (0.408, 0.376, 0.391, 0.200)
		colorLowland   (0.300, 0.292, 0.322, 0.200)
		colorUpland    (0.570, 0.569, 0.583, 0.250)
		colorRock      (0.640, 0.630, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.300, 0.292, 0.322, 0.200)
		colorUpPlants  (0.570, 0.569, 0.583, 0.250)
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
		SemiMajorAxis   0.0039474
		Period          0.0143355
		Eccentricity    0.0495149
		Inclination     1.176
		AscendingNode   -38.3651
		ArgOfPericenter -113.543
		MeanAnomaly     65.6112
	}
}

Moon	"Ciutric VII.4"
{
	ParentBody     "Ciutric VII"
	Class	       "IceWorld"

	Mass            0.064562
	Radius          2994.93
	InertiaMoment   0.333679

	Obliquity       0.0442073
	EqAscendNode    67.2389
	Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.454 0.447 0.444)

	Surface
	{
		SurfStyle       0.172287
		OceanStyle      0.0873893
		Randomize      (0.926, 0.157, 0.400)
		colorDistMagn   0.0479671
		colorDistFreq   374.156
		detailScale     7703.14
		colorConversion true
		drivenDarkening 0
		seaLevel        0.291323
		snowLevel       2
		tropicLatitude  0.00129187
		icecapLatitude  0.767581
		icecapHeight    0.301952
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.55354
		venusFreq       1.41657
		venusMagn       0
		mareFreq        1.69184
		mareDensity     0.0143059
		terraceProb     0.153363
		erosion         0
		montesMagn      0.20161
		montesFreq      142.283
		montesSpiky     0.850167
		montesFraction  0.957306
		dunesMagn       0.0207482
		dunesFreq       4017.36
		dunesFraction   0.559815
		hillsMagn       0.127145
		hillsFreq       341.069
		hillsFraction   0.975683
		hills2Fraction  0.0207383
		riversMagn      61.7153
		riversFreq      2.50498
		riversSin       5.75402
		riversOctaves   0
		canyonsMagn     0.47767
		canyonsFreq     1.09539
		canyonFraction  0
		cracksMagn      0.0487245
		cracksFreq      0.610229
		cracksOctaves   2
		craterMagn      0.602411
		craterFreq      6.84029
		craterDensity   0.881626
		craterOctaves   12
		craterRayedFactor 0.154589
		volcanoMagn     0.616549
		volcanoFreq     0.747281
		volcanoDensity  0.175679
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.118919
		volcanoRadius   0.468077
		volcanoTemp     1681.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.454, 0.447, 0.444, 0.500)
		colorShelf     (0.431, 0.425, 0.422, 0.500)
		colorBeach     (0.318, 0.313, 0.311, 0.750)
		colorDesert    (0.386, 0.380, 0.377, 1.000)
		colorLowland   (0.399, 0.393, 0.391, 1.000)
		colorUpland    (0.422, 0.416, 0.413, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.399, 0.393, 0.391, 1.000)
		colorUpPlants  (0.422, 0.416, 0.413, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.987551
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
		Height          95.0115
		Density         0.00124486
		Pressure        0.000318578
		Greenhouse      0.062936
		Bright          4.15933
		Opacity         0
		SkyLight        1.38644
		Hue             -0.00964242
		Saturation      1

		Composition
		{
			CO2   	99.9893
			Kr    	0.0104894
			Xe    	0.000204617
			C3H8  	1.56185e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00642904
		Period          0.0297878
		Eccentricity    0.0304157
		Inclination     0.0442073
		AscendingNode   67.2389
		ArgOfPericenter -150.833
		MeanAnomaly     144.032
	}
}

Moon	"Ciutric VII.5"
{
	ParentBody     "Ciutric VII"
	Class	       "IceWorld"

	Mass            0.00747122
	Radius          1707.57
	InertiaMoment   0.384423

	Obliquity       0.967633
	EqAscendNode    -33.0753
	Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.521 0.516 0.514)

	Surface
	{
		SurfStyle       0.943059
		OceanStyle      0.431154
		Randomize      (0.463, 0.337, 0.072)
		colorDistMagn   0.0968868
		colorDistFreq   165.326
		detailScale     4391.96
		colorConversion true
		drivenDarkening 0.531159
		seaLevel        0.18152
		snowLevel       2
		tropicLatitude  0.0323736
		icecapLatitude  0.852662
		icecapHeight    0.192993
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.63504
		venusFreq       1.59089
		venusMagn       0
		mareFreq        1.03291
		mareDensity     0.00131042
		terraceProb     0.383131
		erosion         0
		montesMagn      0.0841218
		montesFreq      77.7413
		montesSpiky     0.975261
		montesFraction  0.178574
		dunesMagn       0.0305631
		dunesFreq       2233.2
		dunesFraction   0.812634
		hillsMagn       0.125547
		hillsFreq       197.48
		hillsFraction   0.0424451
		hills2Fraction  0.0356156
		riversMagn      57.2444
		riversFreq      3.24185
		riversSin       6.57407
		riversOctaves   0
		canyonsMagn     0.518793
		canyonsFreq     0.587439
		canyonFraction  0
		cracksMagn      0.0489555
		cracksFreq      1.0397
		cracksOctaves   1
		craterMagn      0.62463
		craterFreq      5.04566
		craterDensity   0.886083
		craterOctaves   11
		craterRayedFactor 0.177484
		volcanoMagn     0.252999
		volcanoFreq     0.608644
		volcanoDensity  0.176351
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.251778
		volcanoRadius   0.205824
		volcanoTemp     954.219
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.396, 0.366, 0.298, 1.000)
		colorShelf     (0.396, 0.366, 0.298, 1.000)
		colorBeach     (0.365, 0.320, 0.257, 1.000)
		colorDesert    (0.365, 0.320, 0.257, 1.000)
		colorLowland   (0.443, 0.418, 0.391, 1.000)
		colorUpland    (0.464, 0.459, 0.442, 1.000)
		colorRock      (0.930, 0.910, 0.860, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.443, 0.418, 0.391, 1.000)
		colorUpPlants  (0.464, 0.459, 0.442, 1.000)
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
		SemiMajorAxis   0.0104708
		Period          0.061932
		Eccentricity    0.0244948
		Inclination     0.967633
		AscendingNode   -33.0753
		ArgOfPericenter -96.2182
		MeanAnomaly     -120.686
	}
}

Moon	"Ciutric VII.6"
{
	ParentBody     "Ciutric VII"
	Class	       "IceWorld"

	Mass            0.00865187
	Radius          1686
	InertiaMoment   0.380317

	Obliquity       -1.40588
	EqAscendNode    -142.372
	Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.703 0.698 0.695)

	Surface
	{
		SurfStyle       0.512872
		OceanStyle      0.137441
		Randomize      (-0.386, -0.960, -0.798)
		colorDistMagn   0.0910451
		colorDistFreq   241.602
		detailScale     4336.48
		colorConversion true
		drivenDarkening 0.326129
		seaLevel        0.15892
		snowLevel       2
		tropicLatitude  0.0158254
		icecapLatitude  0.595519
		icecapHeight    0.184806
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.79734
		venusFreq       0.896073
		venusMagn       0
		mareFreq        0.778668
		mareDensity     0.00248338
		terraceProb     0.330141
		erosion         0
		montesMagn      0.0703875
		montesFreq      80.5694
		montesSpiky     0.849269
		montesFraction  0.145208
		dunesMagn       0.0510344
		dunesFreq       2203.12
		dunesFraction   0.964076
		hillsMagn       0.110364
		hillsFreq       154.812
		hillsFraction   0.319038
		hills2Fraction  0.0956507
		riversMagn      57.3789
		riversFreq      3.07898
		riversSin       5.44634
		riversOctaves   0
		canyonsMagn     0.572766
		canyonsFreq     0.597207
		canyonFraction  0
		cracksMagn      0.0607931
		cracksFreq      0.363556
		cracksOctaves   1
		craterMagn      0.59647
		craterFreq      5.28438
		craterDensity   0.894397
		craterOctaves   11
		craterRayedFactor 0.235837
		volcanoMagn     0.229544
		volcanoFreq     0.733682
		volcanoDensity  0.202026
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.247518
		volcanoRadius   0.149603
		volcanoTemp     1509.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.211, 0.175, 0.153, 0.000)
		colorShelf     (0.260, 0.216, 0.195, 0.000)
		colorBeach     (0.393, 0.328, 0.292, 0.200)
		colorDesert    (0.358, 0.307, 0.257, 0.500)
		colorLowland   (0.274, 0.237, 0.195, 0.800)
		colorUpland    (0.464, 0.419, 0.362, 1.000)
		colorRock      (0.670, 0.620, 0.550, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.274, 0.237, 0.195, 0.800)
		colorUpPlants  (0.464, 0.419, 0.362, 1.000)
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
		SemiMajorAxis   0.0170536
		Period          0.128726
		Eccentricity    0.0320854
		Inclination     -1.40588
		AscendingNode   -142.372
		ArgOfPericenter -90.3666
		MeanAnomaly     91.3001
	}
}

DwarfMoon	"Ciutric VII.D6"
{
	ParentBody     "Ciutric VII"
	Class	       "Asteroid"

	Mass            8.28157e-008
	Radius          65.065
	InertiaMoment   0.398303

	RotationPeriod  563.929
	Obliquity       -22.4556
	EqAscendNode    63.6748
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.782 0.685 0.619)

	Surface
	{
		SurfStyle       0.520659
		OceanStyle      0.285793
		Randomize      (0.770, -0.291, -0.784)
		colorDistMagn   0.772358
		colorDistFreq   2.93669
		detailScale     1776.71
		colorConversion true
		snowLevel       2
		tropicLatitude  0.812531
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.299509
		terraceProb     0.287796
		erosion         0
		montesMagn      0.393602
		montesFreq      3.18606
		montesSpiky     0.975247
		montesFraction  0.300466
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.16904
		hillsFraction   0.824359
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224896
		craterFreq      0.185797
		craterDensity   0.986686
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.400189
		volcanoTemp     1825.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.305, 0.233, 0.173, 0.000)
		colorShelf     (0.313, 0.240, 0.198, 0.000)
		colorBeach     (0.368, 0.281, 0.235, 0.000)
		colorDesert    (0.399, 0.301, 0.229, 0.000)
		colorLowland   (0.438, 0.322, 0.260, 0.000)
		colorUpland    (0.485, 0.391, 0.316, 0.000)
		colorRock      (0.524, 0.425, 0.340, 0.000)
		colorSnow      (0.571, 0.452, 0.359, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0847412
		Period          1.42594
		Eccentricity    0.14539
		Inclination     -40.8879
		AscendingNode   62.4221
		ArgOfPericenter -79.0795
		MeanAnomaly     22.8609
	}
}

DwarfMoon	"Ciutric VII.D7"
{
	ParentBody     "Ciutric VII"
	Class	       "Asteroid"

	Mass            1.1303e-007
	Radius          68.8089
	InertiaMoment   0.399352

	RotationPeriod  513.614
	Obliquity       -110.792
	EqAscendNode    145.585
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.697 0.568 0.502)

	Surface
	{
		SurfStyle       0.809931
		OceanStyle      0.303915
		Randomize      (-0.053, -0.702, -0.016)
		colorDistMagn   0.768581
		colorDistFreq   1.68989
		detailScale     1878.94
		colorConversion true
		snowLevel       2
		tropicLatitude  0.82779
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.735425
		terraceProb     0.202699
		erosion         0
		montesMagn      0.470978
		montesFreq      2.73819
		montesSpiky     0.994329
		montesFraction  0.731269
		dunesFraction   0
		hillsMagn       0
		hillsFreq       13.0731
		hillsFraction   0.373469
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243892
		craterFreq      0.215179
		craterDensity   0.901263
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.493537
		volcanoTemp     1669.82
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.272, 0.193, 0.140, 0.000)
		colorShelf     (0.279, 0.199, 0.161, 0.000)
		colorBeach     (0.328, 0.233, 0.191, 0.000)
		colorDesert    (0.356, 0.250, 0.186, 0.000)
		colorLowland   (0.391, 0.267, 0.211, 0.000)
		colorUpland    (0.432, 0.324, 0.256, 0.000)
		colorRock      (0.467, 0.352, 0.276, 0.000)
		colorSnow      (0.509, 0.375, 0.291, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0851767
		Period          1.43694
		Eccentricity    0.385766
		Inclination     -69.6488
		AscendingNode   141.345
		ArgOfPericenter 48.0498
		MeanAnomaly     101.072
	}
}

DwarfMoon	"Ciutric VII.D8"
{
	ParentBody     "Ciutric VII"
	Class	       "Asteroid"

	Mass            1.5485e-007
	Radius          73.4028
	InertiaMoment   0.396671

	RotationPeriod  468.547
	Obliquity       27.0595
	EqAscendNode    127.281
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.637 0.568 0.464)

	Surface
	{
		SurfStyle       0.352402
		OceanStyle      0.700622
		Randomize      (-0.510, 0.525, -0.001)
		colorDistMagn   0.942024
		colorDistFreq   1.82204
		detailScale     2004.39
		colorConversion true
		snowLevel       2
		tropicLatitude  0.353373
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.346751
		terraceProb     0.441038
		erosion         0
		montesMagn      0.607016
		montesFreq      3.23283
		montesSpiky     0.91832
		montesFraction  0.90337
		dunesFraction   0
		hillsMagn       0
		hillsFreq       12.3215
		hillsFraction   0.632462
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234389
		craterFreq      0.191762
		craterDensity   0.949176
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.479923
		volcanoTemp     1625.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.255, 0.227, 0.186, 0.000)
		colorShelf     (0.271, 0.242, 0.197, 0.000)
		colorBeach     (0.287, 0.256, 0.209, 0.000)
		colorDesert    (0.303, 0.270, 0.220, 0.000)
		colorLowland   (0.319, 0.284, 0.232, 0.000)
		colorUpland    (0.335, 0.298, 0.244, 0.000)
		colorRock      (0.351, 0.313, 0.255, 0.000)
		colorSnow      (0.366, 0.327, 0.267, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0856512
		Period          1.44897
		Eccentricity    0.267457
		Inclination     19.1635
		AscendingNode   129.157
		ArgOfPericenter 106.874
		MeanAnomaly     -126.739
	}
}

DwarfMoon	"Ciutric VII.D9"
{
	ParentBody     "Ciutric VII"
	Class	       "Asteroid"

	Mass            2.1317e-007
	Radius          76.5814
	InertiaMoment   0.398476

	RotationPeriod  419.622
	Obliquity       -74.7228
	EqAscendNode    139.129
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.850 0.782 0.729)

	Surface
	{
		SurfStyle       0.148733
		OceanStyle      0.870572
		Randomize      (0.104, -0.525, 0.136)
		colorDistMagn   0.310946
		colorDistFreq   3.31497
		detailScale     2091.18
		colorConversion true
		snowLevel       2
		tropicLatitude  0.662543
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.456865
		terraceProb     0.171307
		erosion         0
		montesMagn      0.431912
		montesFreq      2.95667
		montesSpiky     0.988492
		montesFraction  0.30862
		dunesFraction   0
		hillsMagn       0
		hillsFreq       13.9972
		hillsFraction   0.849499
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25207
		craterFreq      0.267256
		craterDensity   0.890834
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.372933
		volcanoTemp     1565.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.340, 0.313, 0.292, 0.000)
		colorShelf     (0.361, 0.332, 0.310, 0.000)
		colorBeach     (0.382, 0.352, 0.328, 0.000)
		colorDesert    (0.404, 0.371, 0.346, 0.000)
		colorLowland   (0.425, 0.391, 0.364, 0.000)
		colorUpland    (0.446, 0.410, 0.383, 0.000)
		colorRock      (0.467, 0.430, 0.401, 0.000)
		colorSnow      (0.488, 0.449, 0.419, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0859486
		Period          1.45652
		Eccentricity    0.189505
		Inclination     -58.5913
		AscendingNode   137.986
		ArgOfPericenter -174.445
		MeanAnomaly     106.26
	}
}

DwarfMoon	"Ciutric VII.D10"
{
	ParentBody     "Ciutric VII"
	Class	       "Asteroid"

	Mass            2.9522e-007
	Radius          100.301
	InertiaMoment   0.399483

	RotationPeriod  465.29
	Obliquity       -67.0392
	EqAscendNode    -52.0319
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.671 0.569 0.516)

	Surface
	{
		SurfStyle       0.460696
		OceanStyle      0.849235
		Randomize      (0.518, 0.969, -0.776)
		colorDistMagn   0.275311
		colorDistFreq   4.6048
		detailScale     2738.89
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998093
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.497054
		terraceProb     0.247623
		erosion         0
		montesMagn      0.343371
		montesFreq      2.92954
		montesSpiky     0.942689
		montesFraction  0.534527
		dunesFraction   0
		hillsMagn       0
		hillsFreq       26.2793
		hillsFraction   0.829875
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244912
		craterFreq      0.260608
		craterDensity   0.958425
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.543528
		volcanoTemp     1545.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.268, 0.228, 0.206, 0.000)
		colorShelf     (0.285, 0.242, 0.219, 0.000)
		colorBeach     (0.302, 0.256, 0.232, 0.000)
		colorDesert    (0.319, 0.270, 0.245, 0.000)
		colorLowland   (0.335, 0.285, 0.258, 0.000)
		colorUpland    (0.352, 0.299, 0.271, 0.000)
		colorRock      (0.369, 0.313, 0.284, 0.000)
		colorSnow      (0.386, 0.327, 0.297, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0863334
		Period          1.46631
		Eccentricity    0.382768
		Inclination     -27.0477
		AscendingNode   -46.9715
		ArgOfPericenter -1.61264
		MeanAnomaly     50.5484
	}
}

DwarfMoon	"Ciutric VII.D11"
{
	ParentBody     "Ciutric VII"
	Class	       "Asteroid"

	Mass            4.11852e-007
	Radius          106.505
	InertiaMoment   0.397091

	RotationPeriod  418.96
	Obliquity       -20.2609
	EqAscendNode    88.6885
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.404 0.400 0.398)

	Surface
	{
		SurfStyle       0.201691
		OceanStyle      0.929668
		Randomize      (0.707, 0.365, 0.251)
		colorDistMagn   0.416367
		colorDistFreq   5.39115
		detailScale     2908.3
		colorConversion true
		snowLevel       2
		tropicLatitude  0.581446
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.486356
		terraceProb     0.118712
		erosion         0
		montesMagn      0.473099
		montesFreq      3.43569
		montesSpiky     0.868766
		montesFraction  0.57612
		dunesFraction   0
		hillsMagn       0
		hillsFreq       23.9979
		hillsFraction   0.651705
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235191
		craterFreq      0.335798
		craterDensity   1.04292
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.481114
		volcanoTemp     1550.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.162, 0.160, 0.159, 0.000)
		colorShelf     (0.172, 0.170, 0.169, 0.000)
		colorBeach     (0.182, 0.180, 0.179, 0.000)
		colorDesert    (0.192, 0.190, 0.189, 0.000)
		colorLowland   (0.202, 0.200, 0.199, 0.000)
		colorUpland    (0.212, 0.210, 0.209, 0.000)
		colorRock      (0.222, 0.220, 0.219, 0.000)
		colorSnow      (0.233, 0.230, 0.229, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0868344
		Period          1.4791
		Eccentricity    0.0280866
		Inclination     -30.1385
		AscendingNode   90.7515
		ArgOfPericenter -117.87
		MeanAnomaly     36.8885
	}
}

DwarfMoon	"Ciutric VII.D12"
{
	ParentBody     "Ciutric VII"
	Class	       "Asteroid"

	Mass            5.79654e-007
	Radius          114.653
	InertiaMoment   0.398638

	RotationPeriod  382.266
	Obliquity       -39.6322
	EqAscendNode    -4.10422
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.489 0.484 0.481)

	Surface
	{
		SurfStyle       0.880243
		OceanStyle      0.414696
		Randomize      (0.076, 0.693, 0.534)
		colorDistMagn   0.586753
		colorDistFreq   9.79732
		detailScale     3130.8
		colorConversion true
		snowLevel       2
		tropicLatitude  0.904691
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.541069
		terraceProb     0.171667
		erosion         0
		montesMagn      0.539183
		montesFreq      2.51018
		montesSpiky     0.734075
		montesFraction  0.490201
		dunesFraction   0
		hillsMagn       0
		hillsFreq       22.63
		hillsFraction   0.540422
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247077
		craterFreq      0.376
		craterDensity   0.975337
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.460444
		volcanoTemp     1406.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.166, 0.170, 0.193, 0.050)
		colorShelf     (0.196, 0.199, 0.221, 0.040)
		colorBeach     (0.225, 0.228, 0.250, 0.030)
		colorDesert    (0.254, 0.257, 0.284, 0.020)
		colorLowland   (0.284, 0.286, 0.313, 0.030)
		colorUpland    (0.313, 0.315, 0.342, 0.050)
		colorRock      (0.342, 0.344, 0.380, 0.020)
		colorSnow      (0.342, 0.344, 0.380, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0875
		Period          1.49614
		Eccentricity    0.155697
		Inclination     -25.1499
		AscendingNode   -0.401652
		ArgOfPericenter -165.165
		MeanAnomaly     45.4699
	}
}

DwarfMoon	"Ciutric VII.D13"
{
	ParentBody     "Ciutric VII"
	Class	       "Asteroid"

	Mass            8.24501e-007
	Radius          122.122
	InertiaMoment   0.399611

	RotationPeriod  343.172
	Obliquity       68.6448
	EqAscendNode    -122.175
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.541 0.535 0.527)

	Surface
	{
		SurfStyle       0.464949
		OceanStyle      0.525594
		Randomize      (-0.692, -0.502, 0.921)
		colorDistMagn   0.640767
		colorDistFreq   9.05084
		detailScale     3334.76
		colorConversion true
		snowLevel       2
		tropicLatitude  0.854553
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.756495
		terraceProb     0.346309
		erosion         0
		montesMagn      0.462807
		montesFreq      3.29941
		montesSpiky     0.894776
		montesFraction  0.481714
		dunesFraction   0
		hillsMagn       0
		hillsFreq       29.3746
		hillsFraction   0.532742
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.265929
		craterFreq      0.331763
		craterDensity   0.909256
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.534909
		volcanoTemp     1627.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.216, 0.214, 0.211, 0.000)
		colorShelf     (0.230, 0.227, 0.224, 0.000)
		colorBeach     (0.243, 0.241, 0.237, 0.000)
		colorDesert    (0.257, 0.254, 0.250, 0.000)
		colorLowland   (0.271, 0.267, 0.264, 0.000)
		colorUpland    (0.284, 0.281, 0.277, 0.000)
		colorRock      (0.298, 0.294, 0.290, 0.000)
		colorSnow      (0.311, 0.307, 0.303, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0878957
		Period          1.5063
		Eccentricity    0.325896
		Inclination     69.9739
		AscendingNode   -116.81
		ArgOfPericenter -162.829
		MeanAnomaly     7.54925
	}
}

DwarfMoon	"Ciutric VII.D14"
{
	ParentBody     "Ciutric VII"
	Class	       "Asteroid"

	Mass            1.18773e-006
	Radius          161.185
	InertiaMoment   0.397412

	RotationPeriod  375.032
	Obliquity       65.2621
	EqAscendNode    19.0555
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.577 0.573 0.564)

	Surface
	{
		SurfStyle       0.804496
		OceanStyle      0.534792
		Randomize      (-0.001, -0.867, -0.289)
		colorDistMagn   0.70688
		colorDistFreq   13.6722
		detailScale     4401.42
		colorConversion true
		snowLevel       2
		tropicLatitude  0.982934
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.486145
		terraceProb     0.183364
		erosion         0
		montesMagn      0.685837
		montesFreq      3.09232
		montesSpiky     0.955672
		montesFraction  0.621094
		dunesFraction   0
		hillsMagn       0
		hillsFreq       71.5108
		hillsFraction   0.329907
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239926
		craterFreq      0.724234
		craterDensity   0.802162
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.441257
		volcanoTemp     1352.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.225, 0.195, 0.158, 0.000)
		colorShelf     (0.231, 0.200, 0.181, 0.000)
		colorBeach     (0.271, 0.235, 0.214, 0.000)
		colorDesert    (0.294, 0.252, 0.209, 0.000)
		colorLowland   (0.323, 0.269, 0.237, 0.000)
		colorUpland    (0.358, 0.326, 0.288, 0.000)
		colorRock      (0.387, 0.355, 0.310, 0.000)
		colorSnow      (0.421, 0.378, 0.327, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.088333
		Period          1.51755
		Eccentricity    0.0909528
		Inclination     15.5762
		AscendingNode   26.0303
		ArgOfPericenter 16.2564
		MeanAnomaly     39.5905
	}
}

DwarfMoon	"Ciutric VII.D15"
{
	ParentBody     "Ciutric VII"
	Class	       "Asteroid"

	Mass            1.73718e-006
	Radius          173.124
	InertiaMoment   0.398791

	RotationPeriod  335.021
	Obliquity       -39.2001
	EqAscendNode    133.036
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.584 0.473 0.334)

	Surface
	{
		SurfStyle       0.0187485
		OceanStyle      0.593747
		Randomize      (0.831, -0.206, 0.995)
		colorDistMagn   0.984982
		colorDistFreq   23.0895
		detailScale     4727.45
		colorConversion true
		snowLevel       2
		tropicLatitude  0.62429
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.440824
		terraceProb     0.26532
		erosion         0
		montesMagn      0.507282
		montesFreq      2.81065
		montesSpiky     0.902196
		montesFraction  0.485824
		dunesFraction   0
		hillsMagn       0
		hillsFreq       82.4581
		hillsFraction   0.61385
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248666
		craterFreq      1.27666
		craterDensity   0.816041
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.471328
		volcanoTemp     1536.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.234, 0.189, 0.134, 0.000)
		colorShelf     (0.248, 0.201, 0.142, 0.000)
		colorBeach     (0.263, 0.213, 0.151, 0.000)
		colorDesert    (0.278, 0.225, 0.159, 0.000)
		colorLowland   (0.292, 0.236, 0.167, 0.000)
		colorUpland    (0.307, 0.248, 0.176, 0.000)
		colorRock      (0.321, 0.260, 0.184, 0.000)
		colorSnow      (0.336, 0.272, 0.192, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0887628
		Period          1.52864
		Eccentricity    0.238275
		Inclination     -64.5172
		AscendingNode   141.705
		ArgOfPericenter -68.0145
		MeanAnomaly     -110.094
	}
}

DwarfMoon	"Ciutric VII.D16"
{
	ParentBody     "Ciutric VII"
	Class	       "Asteroid"

	Mass            2.58786e-006
	Radius          189.885
	InertiaMoment   0.399738

	RotationPeriod  302.427
	Obliquity       -106.2
	EqAscendNode    -172.415
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.770 0.681 0.617)

	Surface
	{
		SurfStyle       0.84569
		OceanStyle      0.829951
		Randomize      (-0.050, -0.958, -0.758)
		colorDistMagn   0.973177
		colorDistFreq   29.3491
		detailScale     5185.13
		colorConversion true
		snowLevel       2
		tropicLatitude  0.614504
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.439992
		terraceProb     0.171652
		erosion         0
		montesMagn      0.337606
		montesFreq      2.5725
		montesSpiky     0.978223
		montesFraction  0.553281
		dunesFraction   0
		hillsMagn       0
		hillsFreq       65.0854
		hillsFraction   0.542253
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220741
		craterFreq      0.958346
		craterDensity   0.829029
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.450139
		volcanoTemp     1550.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.300, 0.232, 0.173, 0.000)
		colorShelf     (0.308, 0.238, 0.198, 0.000)
		colorBeach     (0.362, 0.279, 0.235, 0.000)
		colorDesert    (0.393, 0.300, 0.228, 0.000)
		colorLowland   (0.431, 0.320, 0.259, 0.000)
		colorUpland    (0.477, 0.388, 0.315, 0.000)
		colorRock      (0.516, 0.422, 0.339, 0.000)
		colorSnow      (0.562, 0.449, 0.358, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.089223
		Period          1.54054
		Eccentricity    0.314824
		Inclination     -68.4475
		AscendingNode   -176.41
		ArgOfPericenter -134.144
		MeanAnomaly     117.796
	}
}

Moon	"Ciutric VII.7"
{
	ParentBody     "Ciutric VII"
	Class	       "IceWorld"

	Mass            3.94216e-006
	Radius          208.049
	InertiaMoment   0.397677

	RotationPeriod  268.711
	Obliquity       -40.0918
	EqAscendNode    95.5896
	Precession      0

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.721 0.715 0.710)

	Surface
	{
		SurfStyle       0.573467
		OceanStyle      0.81976
		Randomize      (-0.539, 0.652, -0.004)
		colorDistMagn   0.0520102
		colorDistFreq   20.7406
		detailScale     535.115
		colorConversion true
		drivenDarkening 0.062039
		seaLevel        0.167314
		snowLevel       2
		tropicLatitude  0.853488
		icecapLatitude  1
		icecapHeight    0.167314
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.0441
		venusFreq       1.44905
		venusMagn       0
		mareFreq        0
		mareDensity     1.71258e-006
		terraceProb     0.319982
		erosion         0
		montesMagn      0.0595922
		montesFreq      10.5444
		montesSpiky     0.981759
		montesFraction  0.283817
		dunesMagn       0.0259997
		dunesFreq       273.748
		dunesFraction   0.776031
		hillsMagn       0.129315
		hillsFreq       25.6478
		hillsFraction   0.48539
		hills2Fraction  0.0793059
		riversMagn      68.5897
		riversFreq      2.15448
		riversSin       7.22359
		riversOctaves   0
		canyonsMagn     0.579549
		canyonsFreq     0.0508903
		canyonFraction  0
		cracksMagn      0.0536537
		cracksFreq      0.0712534
		cracksOctaves   0
		craterMagn      1.20015
		craterFreq      0.491345
		craterDensity   0.853472
		craterOctaves   8
		craterRayedFactor 0
		volcanoMagn     0.195761
		volcanoFreq     0.752598
		volcanoDensity  0.21669
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.0857712
		volcanoRadius   0.158879
		volcanoTemp     1681.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.216, 0.179, 0.156, 0.000)
		colorShelf     (0.267, 0.222, 0.199, 0.000)
		colorBeach     (0.404, 0.336, 0.298, 0.200)
		colorDesert    (0.368, 0.315, 0.263, 0.500)
		colorLowland   (0.281, 0.243, 0.199, 0.800)
		colorUpland    (0.476, 0.429, 0.369, 1.000)
		colorRock      (0.670, 0.620, 0.550, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.281, 0.243, 0.199, 0.800)
		colorUpPlants  (0.476, 0.429, 0.369, 1.000)
		BumpHeight      10.4025
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
		SemiMajorAxis   0.0896481
		Period          1.55157
		Eccentricity    0.432773
		Inclination     -54.1524
		AscendingNode   98.0493
		ArgOfPericenter 152.298
		MeanAnomaly     -34.8084
	}
}

Moon	"Ciutric VII.8"
{
	ParentBody     "Ciutric VII"
	Class	       "IceWorld"

	Mass            6.17287e-006
	Radius          282.627
	InertiaMoment   0.398938

	RotationPeriod  291.456
	Obliquity       44.6522
	EqAscendNode    -34.3505
	Precession      0

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.704 0.698 0.697)

	Surface
	{
		SurfStyle       0.859293
		OceanStyle      0.510359
		Randomize      (-0.448, -0.275, 0.116)
		colorDistMagn   0.0442748
		colorDistFreq   38.8685
		detailScale     726.932
		colorConversion true
		drivenDarkening 0.0617132
		seaLevel        0.203175
		snowLevel       2
		tropicLatitude  0.999045
		icecapLatitude  1
		icecapHeight    0.203175
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.61394
		venusFreq       0.985742
		venusMagn       0
		mareFreq        0
		mareDensity     1.62787e-006
		terraceProb     0.358278
		erosion         0
		montesMagn      0.0637147
		montesFreq      15.8403
		montesSpiky     0.947058
		montesFraction  0.802463
		dunesMagn       0.0340828
		dunesFreq       372.19
		dunesFraction   0.266437
		hillsMagn       0.101375
		hillsFreq       29.3362
		hillsFraction   0.913869
		hills2Fraction  0.091312
		riversMagn      51.9834
		riversFreq      3.49013
		riversSin       6.55502
		riversOctaves   0
		canyonsMagn     0.451596
		canyonsFreq     0.107042
		canyonFraction  0
		cracksMagn      0.034212
		cracksFreq      0.133305
		cracksOctaves   0
		craterMagn      0.895609
		craterFreq      0.510889
		craterDensity   0.979211
		craterOctaves   8
		craterRayedFactor 0.224817
		volcanoMagn     0.157736
		volcanoFreq     0.730952
		volcanoDensity  0.165099
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.21489
		volcanoRadius   0.156953
		volcanoTemp     1174.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.704, 0.524, 0.400, 0.000)
		colorShelf     (0.669, 0.497, 0.380, 0.000)
		colorBeach     (0.352, 0.262, 0.200, 0.000)
		colorDesert    (0.599, 0.446, 0.340, 0.000)
		colorLowland   (0.571, 0.461, 0.380, 0.000)
		colorUpland    (0.655, 0.487, 0.372, 0.000)
		colorRock      (1.000, 1.000, 1.000, 0.500)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.571, 0.461, 0.380, 0.000)
		colorUpPlants  (0.655, 0.487, 0.372, 0.000)
		BumpHeight      14.1313
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
		SemiMajorAxis   0.0901214
		Period          1.56387
		Eccentricity    0.356431
		Inclination     55.6287
		AscendingNode   -39.8567
		ArgOfPericenter -7.4986
		MeanAnomaly     -159.207
	}
}

DwarfMoon	"Ciutric VII.D17"
{
	ParentBody     "Ciutric VII"
	Class	       "Asteroid"

	Mass            2.03732e-011
	Radius          3.95809
	InertiaMoment   0.399863

	RotationPeriod  1872.38
	Obliquity       -80.783
	EqAscendNode    123.514
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.693 0.688 0.685)

	Surface
	{
		SurfStyle       0.287169
		OceanStyle      0.436146
		Randomize      (0.563, 0.618, -0.633)
		colorDistMagn   0.868134
		colorDistFreq   0.0107162
		detailScale     108.082
		colorConversion true
		snowLevel       2
		tropicLatitude  0.784789
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.462737
		terraceProb     0.694088
		erosion         0
		montesMagn      0.366644
		montesFreq      2.84512
		montesSpiky     0.892254
		montesFraction  0.385999
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0514196
		hillsFraction   0.682477
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25321
		craterFreq      0.188038
		craterDensity   0.796855
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.497907
		volcanoTemp     1940.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.277, 0.275, 0.274, 0.000)
		colorShelf     (0.294, 0.292, 0.291, 0.000)
		colorBeach     (0.312, 0.309, 0.308, 0.000)
		colorDesert    (0.329, 0.327, 0.326, 0.000)
		colorLowland   (0.346, 0.344, 0.343, 0.000)
		colorUpland    (0.364, 0.361, 0.360, 0.000)
		colorRock      (0.381, 0.378, 0.377, 0.000)
		colorSnow      (0.398, 0.395, 0.394, 1.000)
		BumpHeight      3.56228
		BumpOffset      0.712456
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0907809
		Period          1.58107
		Eccentricity    0.370397
		Inclination     -52.5006
		AscendingNode   131.828
		ArgOfPericenter 70.7452
		MeanAnomaly     136.711
	}
}

DwarfMoon	"Ciutric VII.D18"
{
	ParentBody     "Ciutric VII"
	Class	       "Asteroid"

	Mass            3.87386e-011
	Radius          4.70644
	InertiaMoment   0.397907

	RotationPeriod  1654.9
	Obliquity       39.0188
	EqAscendNode    0.512735
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.511 0.508 0.506)

	Surface
	{
		SurfStyle       0.468982
		OceanStyle      0.291342
		Randomize      (-0.565, -0.835, -0.462)
		colorDistMagn   0.629779
		colorDistFreq   0.00155007
		detailScale     128.517
		colorConversion true
		snowLevel       2
		tropicLatitude  0.550594
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.698967
		terraceProb     0.192106
		erosion         0
		montesMagn      0.547936
		montesFreq      3.44324
		montesSpiky     0.856385
		montesFraction  0.465217
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0679117
		hillsFraction   0.483721
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.265935
		craterFreq      0.265657
		craterDensity   0.816555
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.502509
		volcanoTemp     1636.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.205, 0.203, 0.202, 0.000)
		colorShelf     (0.217, 0.216, 0.215, 0.000)
		colorBeach     (0.230, 0.229, 0.228, 0.000)
		colorDesert    (0.243, 0.241, 0.240, 0.000)
		colorLowland   (0.256, 0.254, 0.253, 0.000)
		colorUpland    (0.268, 0.267, 0.265, 0.000)
		colorRock      (0.281, 0.279, 0.278, 0.000)
		colorSnow      (0.294, 0.292, 0.291, 1.000)
		BumpHeight      4.23579
		BumpOffset      0.847159
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0910573
		Period          1.58829
		Eccentricity    0.428979
		Inclination     -5.61791
		AscendingNode   2.65951
		ArgOfPericenter -26.7756
		MeanAnomaly     -22.3928
	}
}

DwarfMoon	"Ciutric VII.D19"
{
	ParentBody     "Ciutric VII"
	Class	       "Asteroid"

	Mass            6.83919e-011
	Radius          5.43504
	InertiaMoment   0.399079

	RotationPeriod  1472.56
	Obliquity       -82.623
	EqAscendNode    -14.7436
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.423 0.421 0.417)

	Surface
	{
		SurfStyle       0.459321
		OceanStyle      0.468031
		Randomize      (0.709, -0.375, -0.475)
		colorDistMagn   0.83146
		colorDistFreq   0.0153456
		detailScale     148.413
		colorConversion true
		snowLevel       2
		tropicLatitude  0.399085
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.405396
		terraceProb     0.329536
		erosion         0
		montesMagn      0.383944
		montesFreq      2.98928
		montesSpiky     0.836699
		montesFraction  0.838604
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0658728
		hillsFraction   0.750096
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229937
		craterFreq      0.183967
		craterDensity   0.943046
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.527393
		volcanoTemp     1352.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.169, 0.168, 0.167, 0.000)
		colorShelf     (0.180, 0.179, 0.177, 0.000)
		colorBeach     (0.190, 0.189, 0.188, 0.000)
		colorDesert    (0.201, 0.200, 0.198, 0.000)
		colorLowland   (0.212, 0.210, 0.209, 0.000)
		colorUpland    (0.222, 0.221, 0.219, 0.000)
		colorRock      (0.233, 0.232, 0.229, 0.000)
		colorSnow      (0.243, 0.242, 0.240, 1.000)
		BumpHeight      4.89154
		BumpOffset      0.978307
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0916655
		Period          1.60424
		Eccentricity    0.0868581
		Inclination     -74.9034
		AscendingNode   -7.00235
		ArgOfPericenter 129.379
		MeanAnomaly     -137.663
	}
}

DwarfMoon	"Ciutric VII.D20"
{
	ParentBody     "Ciutric VII"
	Class	       "Asteroid"

	Mass            1.14364e-010
	Radius          7.59272
	InertiaMoment   0.399988

	RotationPeriod  1573
	Obliquity       -0.539583
	EqAscendNode    -21.2382
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.677 0.585 0.467)

	Surface
	{
		SurfStyle       0.444697
		OceanStyle      0.752357
		Randomize      (0.498, 0.774, -0.369)
		colorDistMagn   0.109035
		colorDistFreq   0.0186792
		detailScale     207.332
		colorConversion true
		snowLevel       2
		tropicLatitude  0.604446
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.67276
		terraceProb     0.290799
		erosion         0
		montesMagn      0.45228
		montesFreq      3.41886
		montesSpiky     0.977496
		montesFraction  0.507953
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.110823
		hillsFraction   0.477345
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230023
		craterFreq      0.226105
		craterDensity   0.87022
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.477732
		volcanoTemp     1532.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.271, 0.234, 0.187, 0.000)
		colorShelf     (0.288, 0.248, 0.199, 0.000)
		colorBeach     (0.304, 0.263, 0.210, 0.000)
		colorDesert    (0.321, 0.278, 0.222, 0.000)
		colorLowland   (0.338, 0.292, 0.234, 0.000)
		colorUpland    (0.355, 0.307, 0.245, 0.000)
		colorRock      (0.372, 0.322, 0.257, 0.000)
		colorSnow      (0.389, 0.336, 0.269, 1.000)
		BumpHeight      6.83345
		BumpOffset      1.36669
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0920096
		Period          1.61328
		Eccentricity    0.211002
		Inclination     -36.6825
		AscendingNode   -20.2917
		ArgOfPericenter -4.27911
		MeanAnomaly     -81.914
	}
}

DwarfMoon	"Ciutric VII.D21"
{
	ParentBody     "Ciutric VII"
	Class	       "Asteroid"

	Mass            1.83493e-010
	Radius          8.28949
	InertiaMoment   0.398112

	RotationPeriod  1383.92
	Obliquity       -53.7863
	EqAscendNode    -98.0591
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.719 0.656 0.629)

	Surface
	{
		SurfStyle       0.585428
		OceanStyle      0.914898
		Randomize      (0.532, 0.819, 0.873)
		colorDistMagn   0.615272
		colorDistFreq   0.0444957
		detailScale     226.358
		colorConversion true
		snowLevel       2
		tropicLatitude  0.804878
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.432029
		terraceProb     0.187142
		erosion         0
		montesMagn      0.344823
		montesFreq      3.60542
		montesSpiky     0.971569
		montesFraction  0.82982
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.13115
		hillsFraction   0.710595
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262143
		craterFreq      0.200655
		craterDensity   1.07211
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.525672
		volcanoTemp     1589
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.280, 0.223, 0.176, 0.000)
		colorShelf     (0.288, 0.229, 0.201, 0.000)
		colorBeach     (0.338, 0.269, 0.239, 0.000)
		colorDesert    (0.367, 0.288, 0.233, 0.000)
		colorLowland   (0.403, 0.308, 0.264, 0.000)
		colorUpland    (0.446, 0.374, 0.321, 0.000)
		colorRock      (0.482, 0.406, 0.346, 0.000)
		colorSnow      (0.525, 0.433, 0.365, 1.000)
		BumpHeight      7.46054
		BumpOffset      1.49211
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0925047
		Period          1.62631
		Eccentricity    0.473828
		Inclination     -2.23683
		AscendingNode   -95.6332
		ArgOfPericenter 42.1641
		MeanAnomaly     -112.985
	}
}

DwarfMoon	"Ciutric VII.D22"
{
	ParentBody     "Ciutric VII"
	Class	       "Asteroid"

	Mass            2.85017e-010
	Radius          9.20539
	InertiaMoment   0.399216

	RotationPeriod  1254.02
	Obliquity       -6.23826
	EqAscendNode    44.2935
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.673 0.539 0.397)

	Surface
	{
		SurfStyle       0.755681
		OceanStyle      0.957846
		Randomize      (-0.025, 0.615, 0.188)
		colorDistMagn   0.742229
		colorDistFreq   0.0552468
		detailScale     251.369
		colorConversion true
		snowLevel       2
		tropicLatitude  0.957274
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.505636
		terraceProb     0.149688
		erosion         0
		montesMagn      0.472977
		montesFreq      3.0594
		montesSpiky     0.837821
		montesFraction  0.596837
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.248061
		hillsFraction   0.571902
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263666
		craterFreq      0.196206
		craterDensity   0.959997
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.475194
		volcanoTemp     944.415
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.262, 0.183, 0.111, 0.000)
		colorShelf     (0.269, 0.188, 0.127, 0.000)
		colorBeach     (0.316, 0.221, 0.151, 0.000)
		colorDesert    (0.343, 0.237, 0.147, 0.000)
		colorLowland   (0.377, 0.253, 0.167, 0.000)
		colorUpland    (0.417, 0.307, 0.202, 0.000)
		colorRock      (0.451, 0.334, 0.218, 0.000)
		colorSnow      (0.491, 0.355, 0.230, 1.000)
		BumpHeight      8.28485
		BumpOffset      1.65697
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0930732
		Period          1.64133
		Eccentricity    0.127619
		Inclination     -68.6426
		AscendingNode   43.9611
		ArgOfPericenter -19.1491
		MeanAnomaly     125.396
	}
}

DwarfMoon	"Ciutric VII.D23"
{
	ParentBody     "Ciutric VII"
	Class	       "Asteroid"

	Mass            4.31359e-010
	Radius          10.1214
	InertiaMoment   0.395992

	RotationPeriod  1132.33
	Obliquity       -33.9891
	EqAscendNode    -137.078
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.761 0.759 0.754)

	Surface
	{
		SurfStyle       0.587061
		OceanStyle      0.234866
		Randomize      (0.376, 0.889, 0.646)
		colorDistMagn   0.214291
		colorDistFreq   0.071444
		detailScale     276.381
		colorConversion true
		snowLevel       2
		tropicLatitude  0.512041
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.665734
		terraceProb     0.759755
		erosion         0
		montesMagn      0.285324
		montesFreq      3.78466
		montesSpiky     0.857701
		montesFraction  0.418879
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.292064
		hillsFraction   0.679482
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241812
		craterFreq      0.262095
		craterDensity   1.09819
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.528444
		volcanoTemp     918.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.297, 0.258, 0.211, 0.000)
		colorShelf     (0.305, 0.266, 0.241, 0.000)
		colorBeach     (0.358, 0.311, 0.287, 0.000)
		colorDesert    (0.388, 0.334, 0.279, 0.000)
		colorLowland   (0.426, 0.357, 0.317, 0.000)
		colorUpland    (0.472, 0.433, 0.385, 0.000)
		colorRock      (0.510, 0.471, 0.415, 0.000)
		colorSnow      (0.556, 0.501, 0.437, 1.000)
		BumpHeight      9.10922
		BumpOffset      1.82184
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0935752
		Period          1.65463
		Eccentricity    0.0601839
		Inclination     -4.64961
		AscendingNode   -135.905
		ArgOfPericenter 77.4808
		MeanAnomaly     15.2591
	}
}

DwarfMoon	"Ciutric VII.D24"
{
	ParentBody     "Ciutric VII"
	Class	       "Asteroid"

	Mass            6.39178e-010
	Radius          13.755
	InertiaMoment   0.398299

	RotationPeriod  1250.35
	Obliquity       102.972
	EqAscendNode    136.375
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.490 0.485 0.483)

	Surface
	{
		SurfStyle       0.826473
		OceanStyle      0.495884
		Randomize      (0.510, 0.298, 0.848)
		colorDistMagn   0.587572
		colorDistFreq   0.0865118
		detailScale     375.603
		colorConversion true
		snowLevel       2
		tropicLatitude  0.92287
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.322391
		terraceProb     0.192672
		erosion         0
		montesMagn      0.254333
		montesFreq      2.27561
		montesSpiky     0.87057
		montesFraction  0.469241
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.603188
		hillsFraction   0.595387
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219461
		craterFreq      0.229321
		craterDensity   1.03622
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.489885
		volcanoTemp     1357
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.191, 0.165, 0.135, 0.000)
		colorShelf     (0.196, 0.170, 0.155, 0.000)
		colorBeach     (0.230, 0.199, 0.184, 0.000)
		colorDesert    (0.250, 0.214, 0.179, 0.000)
		colorLowland   (0.274, 0.228, 0.203, 0.000)
		colorUpland    (0.304, 0.277, 0.247, 0.000)
		colorRock      (0.328, 0.301, 0.266, 0.000)
		colorSnow      (0.358, 0.320, 0.280, 1.000)
		BumpHeight      12.3795
		BumpOffset      2.4759
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0939806
		Period          1.66539
		Eccentricity    0.131778
		Inclination     50.4125
		AscendingNode   134.691
		ArgOfPericenter 145.139
		MeanAnomaly     -91.4743
	}
}

DwarfMoon	"Ciutric VII.D25"
{
	ParentBody     "Ciutric VII"
	Class	       "Asteroid"

	Mass            9.30764e-010
	Radius          14.3426
	InertiaMoment   0.399349

	RotationPeriod  1101.03
	Obliquity       15.5013
	EqAscendNode    19.5144
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.682 0.678 0.674)

	Surface
	{
		SurfStyle       0.419496
		OceanStyle      0.456944
		Randomize      (0.835, 0.897, -0.898)
		colorDistMagn   0.696972
		colorDistFreq   0.135392
		detailScale     391.649
		colorConversion true
		snowLevel       2
		tropicLatitude  0.569677
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.513557
		terraceProb     0.10849
		erosion         0
		montesMagn      0.47055
		montesFreq      2.80462
		montesSpiky     0.980531
		montesFraction  0.479331
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.37412
		hillsFraction   0.527332
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245209
		craterFreq      0.202481
		craterDensity   1.0088
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.401844
		volcanoTemp     1827.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.273, 0.271, 0.270, 0.000)
		colorShelf     (0.290, 0.288, 0.286, 0.000)
		colorBeach     (0.307, 0.305, 0.303, 0.000)
		colorDesert    (0.324, 0.322, 0.320, 0.000)
		colorLowland   (0.341, 0.339, 0.337, 0.000)
		colorUpland    (0.358, 0.356, 0.354, 0.000)
		colorRock      (0.375, 0.373, 0.371, 0.000)
		colorSnow      (0.392, 0.390, 0.388, 1.000)
		BumpHeight      12.9083
		BumpOffset      2.58167
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0944283
		Period          1.67731
		Eccentricity    0.29326
		Inclination     20.3189
		AscendingNode   28.1938
		ArgOfPericenter -179.378
		MeanAnomaly     123.655
	}
}

DwarfMoon	"Ciutric VII.D26"
{
	ParentBody     "Ciutric VII"
	Class	       "Asteroid"

	Mass            1.3359e-009
	Radius          15.4922
	InertiaMoment   0.39666

	RotationPeriod  1000.93
	Obliquity       -95.5423
	EqAscendNode    3.41952
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.841 0.783 0.744)

	Surface
	{
		SurfStyle       0.0616904
		OceanStyle      0.432278
		Randomize      (0.231, 0.193, 0.883)
		colorDistMagn   0.910801
		colorDistFreq   0.0748876
		detailScale     423.041
		colorConversion true
		snowLevel       2
		tropicLatitude  0.801132
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.413673
		terraceProb     0.381224
		erosion         0
		montesMagn      0.462814
		montesFreq      3.44187
		montesSpiky     0.913737
		montesFraction  0.613964
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.589053
		hillsFraction   0.752455
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251546
		craterFreq      0.257241
		craterDensity   0.862928
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.386064
		volcanoTemp     1651.14
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.336, 0.313, 0.297, 0.000)
		colorShelf     (0.357, 0.333, 0.316, 0.000)
		colorBeach     (0.378, 0.352, 0.335, 0.000)
		colorDesert    (0.399, 0.372, 0.353, 0.000)
		colorLowland   (0.420, 0.392, 0.372, 0.000)
		colorUpland    (0.441, 0.411, 0.390, 0.000)
		colorRock      (0.462, 0.431, 0.409, 0.000)
		colorSnow      (0.483, 0.450, 0.428, 1.000)
		BumpHeight      13.943
		BumpOffset      2.7886
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0948522
		Period          1.68861
		Eccentricity    0.485511
		Inclination     -31.2198
		AscendingNode   0.272816
		ArgOfPericenter 123.272
		MeanAnomaly     -125.218
	}
}

DwarfMoon	"Ciutric VII.D27"
{
	ParentBody     "Ciutric VII"
	Class	       "Asteroid"

	Mass            1.89439e-009
	Radius          16.6932
	InertiaMoment   0.398472

	RotationPeriod  916.624
	Obliquity       49.274
	EqAscendNode    0.970241
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.749 0.614 0.538)

	Surface
	{
		SurfStyle       0.131324
		OceanStyle      0.427551
		Randomize      (-0.361, 0.134, 0.465)
		colorDistMagn   0.247548
		colorDistFreq   0.186139
		detailScale     455.835
		colorConversion true
		snowLevel       2
		tropicLatitude  0.186342
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.331167
		terraceProb     0.361029
		erosion         0
		montesMagn      0.646606
		montesFreq      1.90162
		montesSpiky     0.943006
		montesFraction  0.386745
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.853994
		hillsFraction   0.583722
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254086
		craterFreq      0.275734
		craterDensity   1.06405
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.46002
		volcanoTemp     1442.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.300, 0.246, 0.215, 0.000)
		colorShelf     (0.318, 0.261, 0.229, 0.000)
		colorBeach     (0.337, 0.276, 0.242, 0.000)
		colorDesert    (0.356, 0.292, 0.256, 0.000)
		colorLowland   (0.374, 0.307, 0.269, 0.000)
		colorUpland    (0.393, 0.322, 0.283, 0.000)
		colorRock      (0.412, 0.338, 0.296, 0.000)
		colorSnow      (0.431, 0.353, 0.310, 1.000)
		BumpHeight      15.0239
		BumpOffset      3.00477
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0952541
		Period          1.69936
		Eccentricity    0.320097
		Inclination     -44.1992
		AscendingNode   13.026
		ArgOfPericenter 176.296
		MeanAnomaly     93.3579
	}
}

DwarfMoon	"Ciutric VII.D28"
{
	ParentBody     "Ciutric VII"
	Class	       "Asteroid"

	Mass            2.65942e-009
	Radius          22.8932
	InertiaMoment   0.39948

	RotationPeriod  1046.69
	Obliquity       -12.852
	EqAscendNode    -59.2738
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.669 0.664 0.663)

	Surface
	{
		SurfStyle       0.606035
		OceanStyle      0.041207
		Randomize      (0.203, -0.150, -0.623)
		colorDistMagn   0.732294
		colorDistFreq   0.401652
		detailScale     625.137
		colorConversion true
		snowLevel       2
		tropicLatitude  0.336662
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.727472
		terraceProb     0.624949
		erosion         0
		montesMagn      0.465745
		montesFreq      3.28629
		montesSpiky     0.755949
		montesFraction  0.730559
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.994849
		hillsFraction   0.908691
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241683
		craterFreq      0.186722
		craterDensity   0.95046
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.478635
		volcanoTemp     1102.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.261, 0.226, 0.186, 0.000)
		colorShelf     (0.267, 0.233, 0.212, 0.000)
		colorBeach     (0.314, 0.272, 0.252, 0.000)
		colorDesert    (0.341, 0.292, 0.245, 0.000)
		colorLowland   (0.374, 0.312, 0.278, 0.000)
		colorUpland    (0.414, 0.379, 0.338, 0.000)
		colorRock      (0.448, 0.412, 0.365, 0.000)
		colorSnow      (0.488, 0.438, 0.384, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0958358
		Period          1.71495
		Eccentricity    0.0411821
		Inclination     -9.75377
		AscendingNode   -59.3175
		ArgOfPericenter -109.397
		MeanAnomaly     62.2927
	}
}

DwarfMoon	"Ciutric VII.D29"
{
	ParentBody     "Ciutric VII"
	Class	       "Asteroid"

	Mass            3.70221e-009
	Radius          22.8955
	InertiaMoment   0.397083

	RotationPeriod  899.636
	Obliquity       64.6376
	EqAscendNode    -8.32035
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.443 0.436 0.431)

	Surface
	{
		SurfStyle       0.100513
		OceanStyle      0.280799
		Randomize      (0.622, 0.433, 0.336)
		colorDistMagn   0.514121
		colorDistFreq   0.294476
		detailScale     625.2
		colorConversion true
		snowLevel       2
		tropicLatitude  0.992231
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.620899
		terraceProb     0.125016
		erosion         0
		montesMagn      0.533541
		montesFreq      2.95477
		montesSpiky     0.949637
		montesFraction  0.332773
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.891902
		hillsFraction   0.697958
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.201252
		craterFreq      0.212904
		craterDensity   0.701417
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.471267
		volcanoTemp     1479.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.177, 0.174, 0.173, 0.000)
		colorShelf     (0.188, 0.185, 0.183, 0.000)
		colorBeach     (0.199, 0.196, 0.194, 0.000)
		colorDesert    (0.210, 0.207, 0.205, 0.000)
		colorLowland   (0.221, 0.218, 0.216, 0.000)
		colorUpland    (0.233, 0.229, 0.226, 0.000)
		colorRock      (0.244, 0.240, 0.237, 0.000)
		colorSnow      (0.255, 0.251, 0.248, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.096199
		Period          1.72471
		Eccentricity    0.268694
		Inclination     18.2276
		AscendingNode   -2.19391
		ArgOfPericenter -28.8754
		MeanAnomaly     102.594
	}
}

DwarfMoon	"Ciutric VII.D30"
{
	ParentBody     "Ciutric VII"
	Class	       "Asteroid"

	Mass            5.11825e-009
	Radius          24.379
	InertiaMoment   0.398634

	RotationPeriod  823.426
	Obliquity       -20.3999
	EqAscendNode    116.117
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.504 0.424 0.340)

	Surface
	{
		SurfStyle       0.488712
		OceanStyle      0.369187
		Randomize      (-0.934, -0.221, -0.936)
		colorDistMagn   0.449318
		colorDistFreq   0.368077
		detailScale     665.709
		colorConversion true
		snowLevel       2
		tropicLatitude  0.328108
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.578481
		terraceProb     0.350126
		erosion         0
		montesMagn      0.575408
		montesFreq      2.65397
		montesSpiky     0.996975
		montesFraction  0.732699
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.23769
		hillsFraction   0.712348
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249716
		craterFreq      0.233305
		craterDensity   0.961368
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49316
		volcanoTemp     1881.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.202, 0.169, 0.136, 0.000)
		colorShelf     (0.214, 0.180, 0.145, 0.000)
		colorBeach     (0.227, 0.191, 0.153, 0.000)
		colorDesert    (0.239, 0.201, 0.162, 0.000)
		colorLowland   (0.252, 0.212, 0.170, 0.000)
		colorUpland    (0.265, 0.222, 0.179, 0.000)
		colorRock      (0.277, 0.233, 0.187, 0.000)
		colorSnow      (0.290, 0.244, 0.196, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0965693
		Period          1.73467
		Eccentricity    0.0227366
		Inclination     -6.09122
		AscendingNode   109.998
		ArgOfPericenter -34.3518
		MeanAnomaly     -127.493
	}
}

DwarfMoon	"Ciutric VII.D31"
{
	ParentBody     "Ciutric VII"
	Class	       "Asteroid"

	Mass            7.0359e-009
	Radius          26.0227
	InertiaMoment   0.399608

	RotationPeriod  756.306
	Obliquity       -6.76409
	EqAscendNode    45.678
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.626 0.559 0.528)

	Surface
	{
		SurfStyle       0.770318
		OceanStyle      0.0237835
		Randomize      (0.006, 0.833, 0.475)
		colorDistMagn   0.897704
		colorDistFreq   0.180578
		detailScale     710.594
		colorConversion true
		snowLevel       2
		tropicLatitude  0.753531
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.328272
		terraceProb     0.318406
		erosion         0
		montesMagn      0.527566
		montesFreq      3.31245
		montesSpiky     0.888606
		montesFraction  0.675671
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.96936
		hillsFraction   0.71405
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249378
		craterFreq      0.222993
		craterDensity   0.955299
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.516902
		volcanoTemp     1467.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.244, 0.190, 0.148, 0.000)
		colorShelf     (0.250, 0.196, 0.169, 0.000)
		colorBeach     (0.294, 0.229, 0.201, 0.000)
		colorDesert    (0.319, 0.246, 0.195, 0.000)
		colorLowland   (0.351, 0.263, 0.222, 0.000)
		colorUpland    (0.388, 0.319, 0.269, 0.000)
		colorRock      (0.420, 0.346, 0.290, 0.000)
		colorSnow      (0.457, 0.369, 0.306, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0969753
		Period          1.74562
		Eccentricity    0.0292558
		Inclination     -42.7978
		AscendingNode   27.1001
		ArgOfPericenter 116.143
		MeanAnomaly     -160.842
	}
}

DwarfMoon	"Ciutric VII.D32"
{
	ParentBody     "Ciutric VII"
	Class	       "Asteroid"

	Mass            9.62831e-009
	Radius          26.019
	InertiaMoment   0.397406

	RotationPeriod  652.174
	Obliquity       51.7786
	EqAscendNode    181.881
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.778 0.746 0.718)

	Surface
	{
		SurfStyle       0.563029
		OceanStyle      0.909834
		Randomize      (-0.874, 0.504, -0.862)
		colorDistMagn   0.218319
		colorDistFreq   0.296384
		detailScale     710.491
		colorConversion true
		snowLevel       2
		tropicLatitude  0.437645
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.572863
		terraceProb     0.231083
		erosion         0
		montesMagn      0.567334
		montesFreq      4.11713
		montesSpiky     0.932596
		montesFraction  0.268476
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.95592
		hillsFraction   0.616647
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233397
		craterFreq      0.165785
		craterDensity   0.622106
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.457955
		volcanoTemp     1524.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.304, 0.254, 0.201, 0.000)
		colorShelf     (0.311, 0.261, 0.230, 0.000)
		colorBeach     (0.366, 0.306, 0.273, 0.000)
		colorDesert    (0.397, 0.328, 0.266, 0.000)
		colorLowland   (0.436, 0.350, 0.302, 0.000)
		colorUpland    (0.483, 0.425, 0.366, 0.000)
		colorRock      (0.522, 0.462, 0.395, 0.000)
		colorSnow      (0.568, 0.492, 0.417, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0973412
		Period          1.75551
		Eccentricity    0.306952
		Inclination     77.7137
		AscendingNode   178.898
		ArgOfPericenter 172.588
		MeanAnomaly     162.693
	}
}

DwarfMoon	"Ciutric VII.D33"
{
	ParentBody     "Ciutric VII"
	Class	       "Asteroid"

	Mass            1.31299e-008
	Radius          35.201
	InertiaMoment   0.398788

	RotationPeriod  748.896
	Obliquity       42.4503
	EqAscendNode    39.3599
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.802 0.729 0.678)

	Surface
	{
		SurfStyle       0.0413831
		OceanStyle      0.457219
		Randomize      (0.100, 0.874, 0.064)
		colorDistMagn   0.900923
		colorDistFreq   0.549415
		detailScale     961.222
		colorConversion true
		snowLevel       2
		tropicLatitude  0.99921
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.38513
		terraceProb     0.247687
		erosion         0
		montesMagn      0.394592
		montesFreq      2.22797
		montesSpiky     0.792031
		montesFraction  0.103681
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.49058
		hillsFraction   0.633423
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245571
		craterFreq      0.207258
		craterDensity   1.02434
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.597117
		volcanoTemp     1677.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.321, 0.292, 0.271, 0.000)
		colorShelf     (0.341, 0.310, 0.288, 0.000)
		colorBeach     (0.361, 0.328, 0.305, 0.000)
		colorDesert    (0.381, 0.346, 0.322, 0.000)
		colorLowland   (0.401, 0.365, 0.339, 0.000)
		colorUpland    (0.421, 0.383, 0.356, 0.000)
		colorRock      (0.441, 0.401, 0.373, 0.000)
		colorSnow      (0.461, 0.419, 0.390, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0976992
		Period          1.76521
		Eccentricity    0.0354454
		Inclination     55.0618
		AscendingNode   33.3257
		ArgOfPericenter -150.699
		MeanAnomaly     -127.083
	}
}

DwarfMoon	"Ciutric VII.D34"
{
	ParentBody     "Ciutric VII"
	Class	       "Asteroid"

	Mass            1.78598e-008
	Radius          37.1894
	InertiaMoment   0.399735

	RotationPeriod  684.17
	Obliquity       60.8395
	EqAscendNode    72.1653
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.556 0.550 0.546)

	Surface
	{
		SurfStyle       0.512296
		OceanStyle      0.351453
		Randomize      (-0.622, -0.497, -0.611)
		colorDistMagn   0.848371
		colorDistFreq   0.635785
		detailScale     1015.52
		colorConversion true
		snowLevel       2
		tropicLatitude  0.853452
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.464396
		terraceProb     0.418323
		erosion         0
		montesMagn      0.406855
		montesFreq      3.07057
		montesSpiky     0.989056
		montesFraction  0.703536
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.06632
		hillsFraction   0.849461
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245966
		craterFreq      0.275486
		craterDensity   0.818106
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.445081
		volcanoTemp     1984.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.217, 0.187, 0.153, 0.000)
		colorShelf     (0.223, 0.192, 0.175, 0.000)
		colorBeach     (0.261, 0.225, 0.208, 0.000)
		colorDesert    (0.284, 0.242, 0.202, 0.000)
		colorLowland   (0.312, 0.258, 0.229, 0.000)
		colorUpland    (0.345, 0.313, 0.278, 0.000)
		colorRock      (0.373, 0.341, 0.300, 0.000)
		colorSnow      (0.406, 0.363, 0.317, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0982029
		Period          1.77887
		Eccentricity    0.204688
		Inclination     -15.2954
		AscendingNode   77.1648
		ArgOfPericenter -156.234
		MeanAnomaly     -61.5608
	}
}

DwarfMoon	"Ciutric VII.D35"
{
	ParentBody     "Ciutric VII"
	Class	       "Asteroid"

	Mass            2.4254e-008
	Radius          39.556
	InertiaMoment   0.397672

	RotationPeriod  626.841
	Obliquity       13.9227
	EqAscendNode    -133.151
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.742 0.714 0.658)

	Surface
	{
		SurfStyle       0.0672478
		OceanStyle      0.832412
		Randomize      (-0.141, -0.895, -0.655)
		colorDistMagn   0.577185
		colorDistFreq   1.14584
		detailScale     1080.14
		colorConversion true
		snowLevel       2
		tropicLatitude  0.477633
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.483449
		terraceProb     0.296063
		erosion         0
		montesMagn      0.511454
		montesFreq      2.90682
		montesSpiky     0.932591
		montesFraction  0.540964
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.41987
		hillsFraction   0.73083
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233998
		craterFreq      0.231468
		craterDensity   0.917733
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.35414
		volcanoTemp     1579.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.297, 0.285, 0.263, 0.000)
		colorShelf     (0.315, 0.303, 0.280, 0.000)
		colorBeach     (0.334, 0.321, 0.296, 0.000)
		colorDesert    (0.352, 0.339, 0.312, 0.000)
		colorLowland   (0.371, 0.357, 0.329, 0.000)
		colorUpland    (0.389, 0.375, 0.345, 0.000)
		colorRock      (0.408, 0.392, 0.362, 0.000)
		colorSnow      (0.426, 0.410, 0.378, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0986179
		Period          1.79016
		Eccentricity    0.0456319
		Inclination     38.1285
		AscendingNode   -140.748
		ArgOfPericenter 177.963
		MeanAnomaly     148.308
	}
}

DwarfMoon	"Ciutric VII.D36"
{
	ParentBody     "Ciutric VII"
	Class	       "Asteroid"

	Mass            3.29128e-008
	Radius          41.0439
	InertiaMoment   0.398935

	RotationPeriod  563.151
	Obliquity       -41.6845
	EqAscendNode    17.3894
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.712 0.708 0.704)

	Surface
	{
		SurfStyle       0.155054
		OceanStyle      0.364381
		Randomize      (0.560, 0.565, 0.956)
		colorDistMagn   0.544686
		colorDistFreq   0.773482
		detailScale     1120.77
		colorConversion true
		snowLevel       2
		tropicLatitude  0.948883
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.383142
		terraceProb     0.234669
		erosion         0
		montesMagn      0.348637
		montesFreq      2.10257
		montesSpiky     0.929298
		montesFraction  0.373246
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.08553
		hillsFraction   0.723411
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256101
		craterFreq      0.19345
		craterDensity   0.722576
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.386324
		volcanoTemp     1298.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.285, 0.283, 0.282, 0.000)
		colorShelf     (0.303, 0.301, 0.299, 0.000)
		colorBeach     (0.321, 0.319, 0.317, 0.000)
		colorDesert    (0.338, 0.336, 0.334, 0.000)
		colorLowland   (0.356, 0.354, 0.352, 0.000)
		colorUpland    (0.374, 0.372, 0.370, 0.000)
		colorRock      (0.392, 0.390, 0.387, 0.000)
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

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0988416
		Period          1.79626
		Eccentricity    0.242137
		Inclination     -30.7275
		AscendingNode   16.1796
		ArgOfPericenter -177.808
		MeanAnomaly     -113.844
	}
}

DwarfMoon	"Ciutric VII.D37"
{
	ParentBody     "Ciutric VII"
	Class	       "Asteroid"

	Mass            4.46679e-008
	Radius          53.4226
	InertiaMoment   0.39986

	RotationPeriod  625.718
	Obliquity       -16.5485
	EqAscendNode    9.5912
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.741 0.739 0.737)

	Surface
	{
		SurfStyle       0.361572
		OceanStyle      0.240313
		Randomize      (0.652, 0.194, -0.981)
		colorDistMagn   0.17359
		colorDistFreq   1.55464
		detailScale     1458.79
		colorConversion true
		snowLevel       2
		tropicLatitude  0.959496
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.280093
		terraceProb     0.330963
		erosion         0
		montesMagn      0.606546
		montesFreq      3.05381
		montesSpiky     0.782537
		montesFraction  0.330602
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.97657
		hillsFraction   0.68494
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226205
		craterFreq      0.209638
		craterDensity   0.87466
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.423644
		volcanoTemp     1730.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.296, 0.296, 0.295, 0.000)
		colorShelf     (0.315, 0.314, 0.313, 0.000)
		colorBeach     (0.333, 0.333, 0.332, 0.000)
		colorDesert    (0.352, 0.351, 0.350, 0.000)
		colorLowland   (0.370, 0.370, 0.369, 0.000)
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
		SemiMajorAxis   0.0991926
		Period          1.80583
		Eccentricity    0.424142
		Inclination     -57.0889
		AscendingNode   0.499717
		ArgOfPericenter 121.406
		MeanAnomaly     -83.1623
	}
}

DwarfMoon	"Ciutric VII.D38"
{
	ParentBody     "Ciutric VII"
	Class	       "Asteroid"

	Mass            6.06808e-008
	Radius          56.2365
	InertiaMoment   0.397902

	RotationPeriod  567.396
	Obliquity       -55.7651
	EqAscendNode    154.128
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.692 0.687 0.684)

	Surface
	{
		SurfStyle       0.908651
		OceanStyle      0.0326868
		Randomize      (-0.070, -0.923, -0.350)
		colorDistMagn   0.00453633
		colorDistFreq   1.09959
		detailScale     1535.63
		colorConversion true
		snowLevel       2
		tropicLatitude  0.995924
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.653505
		terraceProb     0.284059
		erosion         0
		montesMagn      0.427089
		montesFreq      3.08526
		montesSpiky     0.980222
		montesFraction  0.46918
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.75574
		hillsFraction   0.767162
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.27658
		craterFreq      0.164749
		craterDensity   0.83938
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.559995
		volcanoTemp     1371.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.235, 0.241, 0.274, 0.050)
		colorShelf     (0.277, 0.282, 0.315, 0.040)
		colorBeach     (0.318, 0.323, 0.356, 0.030)
		colorDesert    (0.360, 0.364, 0.404, 0.020)
		colorLowland   (0.401, 0.406, 0.445, 0.030)
		colorUpland    (0.443, 0.447, 0.486, 0.050)
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

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0996817
		Period          1.81921
		Eccentricity    0.442072
		Inclination     43.4063
		AscendingNode   151.427
		ArgOfPericenter 144.037
		MeanAnomaly     145.572
	}
}

DwarfMoon	"Ciutric VII.D39"
{
	ParentBody     "Ciutric VII"
	Class	       "Asteroid"

	Mass            8.25873e-008
	Radius          59.8662
	InertiaMoment   0.399076

	RotationPeriod  521.18
	Obliquity       67.2006
	EqAscendNode    -166.087
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.784 0.662 0.603)

	Surface
	{
		SurfStyle       0.169352
		OceanStyle      0.799647
		Randomize      (0.189, 0.959, 0.086)
		colorDistMagn   0.112443
		colorDistFreq   2.56968
		detailScale     1634.75
		colorConversion true
		snowLevel       2
		tropicLatitude  0.205885
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.31182
		terraceProb     0.401798
		erosion         0
		montesMagn      0.596124
		montesFreq      1.95721
		montesSpiky     0.931141
		montesFraction  0.703856
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.79341
		hillsFraction   0.473144
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243887
		craterFreq      0.169044
		craterDensity   1.00894
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.611579
		volcanoTemp     1459.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.314, 0.265, 0.241, 0.000)
		colorShelf     (0.333, 0.281, 0.256, 0.000)
		colorBeach     (0.353, 0.298, 0.272, 0.000)
		colorDesert    (0.373, 0.314, 0.287, 0.000)
		colorLowland   (0.392, 0.331, 0.302, 0.000)
		colorUpland    (0.412, 0.347, 0.317, 0.000)
		colorRock      (0.431, 0.364, 0.332, 0.000)
		colorSnow      (0.451, 0.381, 0.347, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.100282
		Period          1.83566
		Eccentricity    0.422509
		Inclination     76.3118
		AscendingNode   -171.959
		ArgOfPericenter 153.323
		MeanAnomaly     -170.417
	}
}

DwarfMoon	"Ciutric VII.D40"
{
	ParentBody     "Ciutric VII"
	Class	       "Asteroid"

	Mass            1.12715e-007
	Radius          62.8726
	InertiaMoment   0.399985

	RotationPeriod  471.627
	Obliquity       61.4534
	EqAscendNode    -110.775
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.670 0.666 0.661)

	Surface
	{
		SurfStyle       0.6227
		OceanStyle      0.617863
		Randomize      (0.730, 0.185, 0.707)
		colorDistMagn   0.980417
		colorDistFreq   1.92657
		detailScale     1716.84
		colorConversion true
		snowLevel       2
		tropicLatitude  0.820594
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.580932
		terraceProb     0.172239
		erosion         0
		montesMagn      0.448699
		montesFreq      2.85302
		montesSpiky     0.969891
		montesFraction  0.665542
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.75587
		hillsFraction   0.559274
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.216136
		craterFreq      0.264099
		craterDensity   0.893009
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.525087
		volcanoTemp     1642.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.261, 0.226, 0.185, 0.000)
		colorShelf     (0.268, 0.233, 0.212, 0.000)
		colorBeach     (0.315, 0.273, 0.251, 0.000)
		colorDesert    (0.342, 0.293, 0.245, 0.000)
		colorLowland   (0.375, 0.313, 0.278, 0.000)
		colorUpland    (0.415, 0.379, 0.337, 0.000)
		colorRock      (0.449, 0.413, 0.364, 0.000)
		colorSnow      (0.489, 0.439, 0.384, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.100939
		Period          1.85373
		Eccentricity    0.105099
		Inclination     57.0574
		AscendingNode   -115.008
		ArgOfPericenter -118.862
		MeanAnomaly     -117.762
	}
}

DwarfMoon	"Ciutric VII.D41"
{
	ParentBody     "Ciutric VII"
	Class	       "Asteroid"

	Mass            1.54413e-007
	Radius          81.6115
	InertiaMoment   0.398108

	RotationPeriod  519.257
	Obliquity       -13.9244
	EqAscendNode    133.259
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.740 0.735 0.734)

	Surface
	{
		SurfStyle       0.793662
		OceanStyle      0.821509
		Randomize      (-0.986, -0.610, 0.110)
		colorDistMagn   0.303889
		colorDistFreq   5.07051
		detailScale     2228.54
		colorConversion true
		snowLevel       2
		tropicLatitude  0.32657
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.58031
		terraceProb     0.196016
		erosion         0
		montesMagn      0.394258
		montesFreq      2.89457
		montesSpiky     0.897268
		montesFraction  0.740994
		dunesFraction   0
		hillsMagn       0
		hillsFreq       15.9323
		hillsFraction   0.703937
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225759
		craterFreq      0.233712
		craterDensity   1.00791
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.500791
		volcanoTemp     1602.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.289, 0.250, 0.205, 0.000)
		colorShelf     (0.296, 0.257, 0.235, 0.000)
		colorBeach     (0.348, 0.302, 0.279, 0.000)
		colorDesert    (0.377, 0.324, 0.272, 0.000)
		colorLowland   (0.414, 0.346, 0.308, 0.000)
		colorUpland    (0.459, 0.419, 0.374, 0.000)
		colorRock      (0.496, 0.456, 0.404, 0.000)
		colorSnow      (0.540, 0.485, 0.426, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.10147
		Period          1.86839
		Eccentricity    0.460723
		Inclination     6.80693
		AscendingNode   130.7
		ArgOfPericenter -115.68
		MeanAnomaly     69.6922
	}
}

DwarfMoon	"Ciutric VII.D42"
{
	ParentBody     "Ciutric VII"
	Class	       "Asteroid"

	Mass            2.12557e-007
	Radius          85.923
	InertiaMoment   0.399213

	RotationPeriod  469.152
	Obliquity       -39.8651
	EqAscendNode    44.1098
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.632 0.485 0.411)

	Surface
	{
		SurfStyle       0.635574
		OceanStyle      0.182941
		Randomize      (-0.155, 0.571, 0.603)
		colorDistMagn   0.664271
		colorDistFreq   5.05917
		detailScale     2346.27
		colorConversion true
		snowLevel       2
		tropicLatitude  0.587479
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.586925
		terraceProb     0.21913
		erosion         0
		montesMagn      0.507524
		montesFreq      3.06117
		montesSpiky     0.984123
		montesFraction  0.920133
		dunesFraction   0
		hillsMagn       0
		hillsFreq       18.4709
		hillsFraction   0.629575
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244442
		craterFreq      0.286456
		craterDensity   1.0221
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.516485
		volcanoTemp     1408.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.247, 0.165, 0.115, 0.000)
		colorShelf     (0.253, 0.170, 0.132, 0.000)
		colorBeach     (0.297, 0.199, 0.156, 0.000)
		colorDesert    (0.323, 0.214, 0.152, 0.000)
		colorLowland   (0.354, 0.228, 0.173, 0.000)
		colorUpland    (0.392, 0.277, 0.210, 0.000)
		colorRock      (0.424, 0.301, 0.226, 0.000)
		colorSnow      (0.462, 0.320, 0.238, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.101966
		Period          1.88211
		Eccentricity    0.0909059
		Inclination     6.18464
		AscendingNode   48.0622
		ArgOfPericenter -136.503
		MeanAnomaly     100.025
	}
}

DwarfMoon	"Ciutric VII.D43"
{
	ParentBody     "Ciutric VII"
	Class	       "Asteroid"

	Mass            2.94354e-007
	Radius          91.978
	InertiaMoment   0.395972

	RotationPeriod  426.974
	Obliquity       52.3503
	EqAscendNode    -98.2552
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.524 0.520 0.517)

	Surface
	{
		SurfStyle       0.31651
		OceanStyle      0.339691
		Randomize      (0.348, 0.775, 0.193)
		colorDistMagn   0.899477
		colorDistFreq   6.30168
		detailScale     2511.61
		colorConversion true
		snowLevel       2
		tropicLatitude  0.903277
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.505067
		terraceProb     0.273037
		erosion         0
		montesMagn      0.516296
		montesFreq      3.25788
		montesSpiky     0.995346
		montesFraction  0.865144
		dunesFraction   0
		hillsMagn       0
		hillsFreq       19.1535
		hillsFraction   0.753969
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22863
		craterFreq      0.263716
		craterDensity   0.856806
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.385919
		volcanoTemp     1470.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.210, 0.208, 0.207, 0.000)
		colorShelf     (0.223, 0.221, 0.220, 0.000)
		colorBeach     (0.236, 0.234, 0.233, 0.000)
		colorDesert    (0.249, 0.247, 0.246, 0.000)
		colorLowland   (0.262, 0.260, 0.258, 0.000)
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

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.102434
		Period          1.89506
		Eccentricity    0.408483
		Inclination     -31.906
		AscendingNode   -102.348
		ArgOfPericenter 64.4167
		MeanAnomaly     -75.1174
	}
}

DwarfMoon	"Ciutric VII.D44"
{
	ParentBody     "Ciutric VII"
	Class	       "Asteroid"

	Mass            4.10615e-007
	Radius          97.8427
	InertiaMoment   0.398295

	RotationPeriod  387.319
	Obliquity       -20.706
	EqAscendNode    36.0822
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.825 0.769 0.688)

	Surface
	{
		SurfStyle       0.900257
		OceanStyle      0.0166122
		Randomize      (0.544, 0.002, 0.879)
		colorDistMagn   0.445549
		colorDistFreq   5.10034
		detailScale     2671.76
		colorConversion true
		snowLevel       2
		tropicLatitude  0.374048
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.501242
		terraceProb     0.227079
		erosion         0
		montesMagn      0.487915
		montesFreq      3.2511
		montesSpiky     0.938792
		montesFraction  0.5495
		dunesFraction   0
		hillsMagn       0
		hillsFreq       24.1976
		hillsFraction   0.876225
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258759
		craterFreq      0.349105
		craterDensity   0.873602
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.430793
		volcanoTemp     1483.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.281, 0.269, 0.275, 0.050)
		colorShelf     (0.330, 0.315, 0.317, 0.040)
		colorBeach     (0.380, 0.361, 0.358, 0.030)
		colorDesert    (0.429, 0.407, 0.406, 0.020)
		colorLowland   (0.479, 0.454, 0.447, 0.030)
		colorUpland    (0.528, 0.500, 0.489, 0.050)
		colorRock      (0.578, 0.546, 0.544, 0.020)
		colorSnow      (0.578, 0.546, 0.544, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.102766
		Period          1.9043
		Eccentricity    0.0995122
		Inclination     -1.69351
		AscendingNode   43.4262
		ArgOfPericenter 1.7763
		MeanAnomaly     -26.379
	}
}

DwarfMoon	"Ciutric VII.D45"
{
	ParentBody     "Ciutric VII"
	Class	       "Asteroid"

	Mass            5.77863e-007
	Radius          128.248
	InertiaMoment   0.399347

	RotationPeriod  426.806
	Obliquity       -23.4904
	EqAscendNode    -48.5895
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.408 0.403 0.397)

	Surface
	{
		SurfStyle       0.719793
		OceanStyle      0.272003
		Randomize      (0.545, 0.233, 0.533)
		colorDistMagn   0.880331
		colorDistFreq   11.2308
		detailScale     3502.03
		colorConversion true
		snowLevel       2
		tropicLatitude  0.945581
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.706859
		terraceProb     0.303559
		erosion         0
		montesMagn      0.628139
		montesFreq      2.67481
		montesSpiky     0.955184
		montesFraction  0.584028
		dunesFraction   0
		hillsMagn       0
		hillsFreq       28.8814
		hillsFraction   0.521622
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252355
		craterFreq      0.680271
		craterDensity   0.823331
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.527505
		volcanoTemp     1511.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.159, 0.137, 0.111, 0.000)
		colorShelf     (0.163, 0.141, 0.127, 0.000)
		colorBeach     (0.192, 0.165, 0.151, 0.000)
		colorDesert    (0.208, 0.177, 0.147, 0.000)
		colorLowland   (0.228, 0.189, 0.167, 0.000)
		colorUpland    (0.253, 0.229, 0.203, 0.000)
		colorRock      (0.273, 0.250, 0.218, 0.000)
		colorSnow      (0.298, 0.266, 0.230, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.10319
		Period          1.91609
		Eccentricity    0.366442
		Inclination     -57.1511
		AscendingNode   -59.0758
		ArgOfPericenter -94.4525
		MeanAnomaly     -120.057
	}
}

DwarfMoon	"Ciutric VII.D46"
{
	ParentBody     "Ciutric VII"
	Class	       "Asteroid"

	Mass            8.21868e-007
	Radius          135.707
	InertiaMoment   0.396649

	RotationPeriod  379.309
	Obliquity       -70.3637
	EqAscendNode    31.9197
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.758 0.754 0.751)

	Surface
	{
		SurfStyle       0.933087
		OceanStyle      0.0908721
		Randomize      (0.148, -0.068, 0.376)
		colorDistMagn   0.869867
		colorDistFreq   10.6392
		detailScale     3705.7
		colorConversion true
		snowLevel       2
		tropicLatitude  0.66159
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.437609
		terraceProb     0.10686
		erosion         0
		montesMagn      0.347567
		montesFreq      3.63864
		montesSpiky     0.961174
		montesFraction  0.43741
		dunesFraction   0
		hillsMagn       0
		hillsFreq       48.9819
		hillsFraction   0.751453
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243002
		craterFreq      0.776189
		craterDensity   0.939022
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.523839
		volcanoTemp     1396.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.258, 0.264, 0.300, 0.050)
		colorShelf     (0.303, 0.309, 0.345, 0.040)
		colorBeach     (0.348, 0.354, 0.390, 0.030)
		colorDesert    (0.394, 0.400, 0.443, 0.020)
		colorLowland   (0.439, 0.445, 0.488, 0.030)
		colorUpland    (0.485, 0.490, 0.533, 0.050)
		colorRock      (0.530, 0.535, 0.593, 0.020)
		colorSnow      (0.530, 0.535, 0.593, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.103452
		Period          1.9234
		Eccentricity    0.45252
		Inclination     -78.7046
		AscendingNode   27.9742
		ArgOfPericenter -150.194
		MeanAnomaly     21.0387
	}
}

DwarfMoon	"Ciutric VII.D47"
{
	ParentBody     "Ciutric VII"
	Class	       "Asteroid"

	Mass            1.18379e-006
	Radius          147.102
	InertiaMoment   0.398468

	RotationPeriod  344.629
	Obliquity       93.3913
	EqAscendNode    40.1605
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.604 0.598 0.595)

	Surface
	{
		SurfStyle       0.112541
		OceanStyle      0.0804023
		Randomize      (0.100, 0.661, 0.289)
		colorDistMagn   0.394002
		colorDistFreq   15.8599
		detailScale     4016.87
		colorConversion true
		snowLevel       2
		tropicLatitude  0.883382
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.554483
		terraceProb     0.299521
		erosion         0
		montesMagn      0.448313
		montesFreq      2.86251
		montesSpiky     0.928155
		montesFraction  0.646046
		dunesFraction   0
		hillsMagn       0
		hillsFreq       59.8638
		hillsFraction   0.790634
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.277388
		craterFreq      0.760448
		craterDensity   0.720179
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.462456
		volcanoTemp     1778.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.242, 0.239, 0.238, 0.000)
		colorShelf     (0.257, 0.254, 0.253, 0.000)
		colorBeach     (0.272, 0.269, 0.268, 0.000)
		colorDesert    (0.287, 0.284, 0.283, 0.000)
		colorLowland   (0.302, 0.299, 0.298, 0.000)
		colorUpland    (0.317, 0.314, 0.313, 0.000)
		colorRock      (0.332, 0.329, 0.327, 0.000)
		colorSnow      (0.347, 0.344, 0.342, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.103713
		Period          1.93067
		Eccentricity    0.447462
		Inclination     32.0935
		AscendingNode   37.8947
		ArgOfPericenter 164.061
		MeanAnomaly     109.231
	}
}

DwarfMoon	"Ciutric VII.D48"
{
	ParentBody     "Ciutric VII"
	Class	       "Asteroid"

	Mass            1.73116e-006
	Radius          159.517
	InertiaMoment   0.399477

	RotationPeriod  310.532
	Obliquity       -0.619455
	EqAscendNode    -139.311
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.791 0.751 0.681)

	Surface
	{
		SurfStyle       0.22271
		OceanStyle      0.774964
		Randomize      (0.543, 0.353, 0.481)
		colorDistMagn   0.258594
		colorDistFreq   16.9798
		detailScale     4355.88
		colorConversion true
		snowLevel       2
		tropicLatitude  0.58785
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.57342
		terraceProb     0.37769
		erosion         0
		montesMagn      0.536233
		montesFreq      2.9903
		montesSpiky     0.903688
		montesFraction  0.460103
		dunesFraction   0
		hillsMagn       0
		hillsFreq       58.7696
		hillsFraction   0.547504
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.277575
		craterFreq      1.02997
		craterDensity   0.990811
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.433941
		volcanoTemp     1309.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.316, 0.300, 0.272, 0.000)
		colorShelf     (0.336, 0.319, 0.289, 0.000)
		colorBeach     (0.356, 0.338, 0.306, 0.000)
		colorDesert    (0.376, 0.357, 0.323, 0.000)
		colorLowland   (0.395, 0.375, 0.340, 0.000)
		colorUpland    (0.415, 0.394, 0.357, 0.000)
		colorRock      (0.435, 0.413, 0.374, 0.000)
		colorSnow      (0.455, 0.432, 0.391, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.104007
		Period          1.93888
		Eccentricity    0.374363
		Inclination     -36.5092
		AscendingNode   -144.802
		ArgOfPericenter -112.921
		MeanAnomaly     -123.891
	}
}

Moon	"Ciutric VII.9"
{
	ParentBody     "Ciutric VII"
	Class	       "IceWorld"

	Mass            2.57842e-006
	Radius          214.322
	InertiaMoment   0.397076

	RotationPeriod  339.836
	Obliquity       -156.999
	EqAscendNode    27.7739
	Precession      0

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.472 0.468 0.465)

	Surface
	{
		SurfStyle       0.416105
		OceanStyle      0.689298
		Randomize      (-0.868, 0.154, -0.174)
		colorDistMagn   0.0690674
		colorDistFreq   28.8272
		detailScale     551.249
		colorConversion true
		drivenDarkening 0.0533253
		seaLevel        0.228306
		snowLevel       2
		tropicLatitude  0.939123
		icecapLatitude  1
		icecapHeight    0.228306
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.87942
		venusFreq       1.43522
		venusMagn       0
		mareFreq        0
		mareDensity     8.39578e-007
		terraceProb     0.371155
		erosion         0
		montesMagn      0.0559473
		montesFreq      8.48697
		montesSpiky     0.875096
		montesFraction  0.365896
		dunesMagn       0.0389001
		dunesFreq       284.963
		dunesFraction   0.74191
		hillsMagn       0.127058
		hillsFreq       23.2818
		hillsFraction   0.183998
		hills2Fraction  0.0407775
		riversMagn      57.2493
		riversFreq      3.15987
		riversSin       6.35528
		riversOctaves   0
		canyonsMagn     0.384628
		canyonsFreq     0.0850488
		canyonFraction  0
		cracksMagn      0.0670781
		cracksFreq      0.0798937
		cracksOctaves   0
		craterMagn      1.12508
		craterFreq      0.507494
		craterDensity   0.871521
		craterOctaves   8
		craterRayedFactor 0.129395
		volcanoMagn     0.184158
		volcanoFreq     0.643698
		volcanoDensity  0.228524
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.286661
		volcanoRadius   0.131639
		volcanoTemp     1459.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.472, 0.468, 0.465, 0.500)
		colorShelf     (0.449, 0.445, 0.442, 0.500)
		colorBeach     (0.331, 0.328, 0.326, 0.750)
		colorDesert    (0.401, 0.398, 0.395, 1.000)
		colorLowland   (0.416, 0.412, 0.409, 1.000)
		colorUpland    (0.439, 0.436, 0.432, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.416, 0.412, 0.409, 1.000)
		colorUpPlants  (0.439, 0.436, 0.432, 1.000)
		BumpHeight      10.7161
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
		SemiMajorAxis   0.104297
		Period          1.94701
		Eccentricity    0.0578626
		Inclination     -88.8226
		AscendingNode   33.7938
		ArgOfPericenter 103.219
		MeanAnomaly     49.1756
	}
}

Moon	"Ciutric VII.10"
{
	ParentBody     "Ciutric VII"
	Class	       "IceWorld"

	Mass            3.92693e-006
	Radius          230.074
	InertiaMoment   0.398631

	RotationPeriod  297.505
	Obliquity       -22.4606
	EqAscendNode    184.72
	Precession      0

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.658 0.599 0.576)

	Surface
	{
		SurfStyle       0.931432
		OceanStyle      0.150028
		Randomize      (-0.283, 0.985, 0.757)
		colorDistMagn   0.0584795
		colorDistFreq   31.6357
		detailScale     591.763
		colorConversion true
		drivenDarkening 0.0530718
		seaLevel        0.210646
		snowLevel       2
		tropicLatitude  0.262893
		icecapLatitude  1
		icecapHeight    0.210646
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.86967
		venusFreq       1.06336
		venusMagn       0
		mareFreq        0
		mareDensity     1.50515e-006
		terraceProb     0.207588
		erosion         0
		montesMagn      0.0474686
		montesFreq      8.05607
		montesSpiky     0.943234
		montesFraction  0.664629
		dunesMagn       0.0440789
		dunesFreq       299.856
		dunesFraction   0.329997
		hillsMagn       0.140154
		hillsFreq       25.5014
		hillsFraction   0.567377
		hills2Fraction  0.223621
		riversMagn      59.5828
		riversFreq      3.281
		riversSin       5.0994
		riversOctaves   0
		canyonsMagn     0.595816
		canyonsFreq     0.0798595
		canyonFraction  0
		cracksMagn      0.0552875
		cracksFreq      0.111408
		cracksOctaves   0
		craterMagn      1.02835
		craterFreq      0.6333
		craterDensity   0.985922
		craterOctaves   8
		craterRayedFactor 0.0653648
		volcanoMagn     0.176885
		volcanoFreq     0.673948
		volcanoDensity  0.16887
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.103691
		volcanoRadius   0.167033
		volcanoTemp     1670.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.500, 0.425, 0.334, 1.000)
		colorShelf     (0.500, 0.425, 0.334, 1.000)
		colorBeach     (0.461, 0.371, 0.288, 1.000)
		colorDesert    (0.461, 0.371, 0.288, 1.000)
		colorLowland   (0.560, 0.485, 0.438, 1.000)
		colorUpland    (0.586, 0.533, 0.495, 1.000)
		colorRock      (0.930, 0.910, 0.860, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.560, 0.485, 0.438, 1.000)
		colorUpPlants  (0.586, 0.533, 0.495, 1.000)
		BumpHeight      11.5037
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
		SemiMajorAxis   0.104795
		Period          1.96098
		Eccentricity    0.273558
		Inclination     -7.22727
		AscendingNode   177.691
		ArgOfPericenter -78.748
		MeanAnomaly     20.9832
	}
}

Moon	"Ciutric VII.11"
{
	ParentBody     "Ciutric VII"
	Class	       "IceWorld"

	Mass            6.14733e-006
	Radius          256.173
	InertiaMoment   0.399605

	RotationPeriod  265.953
	Obliquity       42.7924
	EqAscendNode    -140.314
	Precession      0

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.759 0.620 0.496)

	Surface
	{
		SurfStyle       0.410647
		OceanStyle      0.373595
		Randomize      (-0.624, 0.588, -0.628)
		colorDistMagn   0.0765201
		colorDistFreq   32.0253
		detailScale     658.891
		colorConversion true
		drivenDarkening 0.0528225
		seaLevel        0.173413
		snowLevel       2
		tropicLatitude  0.500991
		icecapLatitude  0.995461
		icecapHeight    0.173497
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.7228
		venusFreq       0.531431
		venusMagn       0
		mareFreq        0
		mareDensity     2.17185e-006
		terraceProb     0.166193
		erosion         0
		montesMagn      0.0458623
		montesFreq      10.6515
		montesSpiky     0.864947
		montesFraction  0.0875983
		dunesMagn       0.0345583
		dunesFreq       340.44
		dunesFraction   0.833315
		hillsMagn       0.125411
		hillsFreq       27.4987
		hillsFraction   0.81348
		hills2Fraction  0.277256
		riversMagn      51.848
		riversFreq      2.65258
		riversSin       7.7289
		riversOctaves   0
		canyonsMagn     0.546154
		canyonsFreq     0.0836855
		canyonFraction  0
		cracksMagn      0.0577268
		cracksFreq      0.055659
		cracksOctaves   0
		craterMagn      0.960709
		craterFreq      0.802459
		craterDensity   0.78043
		craterOctaves   8
		craterRayedFactor 0.158527
		volcanoMagn     0.183039
		volcanoFreq     0.765008
		volcanoDensity  0.194511
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.246578
		volcanoRadius   0.148204
		volcanoTemp     1524.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.759, 0.620, 0.496, 0.500)
		colorShelf     (0.721, 0.589, 0.472, 0.500)
		colorBeach     (0.532, 0.434, 0.347, 0.750)
		colorDesert    (0.645, 0.527, 0.422, 1.000)
		colorLowland   (0.668, 0.545, 0.437, 1.000)
		colorUpland    (0.706, 0.576, 0.462, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.668, 0.545, 0.437, 1.000)
		colorUpPlants  (0.706, 0.576, 0.462, 1.000)
		BumpHeight      12.8086
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
		SemiMajorAxis   0.10529
		Period          1.97488
		Eccentricity    0.178669
		Inclination     44.2534
		AscendingNode   -135.797
		ArgOfPericenter -144.302
		MeanAnomaly     130.777
	}
}

DwarfMoon	"Ciutric VII.D49"
{
	ParentBody     "Ciutric VII"
	Class	       "Asteroid"

	Mass            2.02481e-011
	Radius          3.64979
	InertiaMoment   0.3974

	RotationPeriod  1766.63
	Obliquity       51.5409
	EqAscendNode    -51.5267
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.688 0.684 0.682)

	Surface
	{
		SurfStyle       0.469548
		OceanStyle      0.107572
		Randomize      (-0.744, 0.421, -0.266)
		colorDistMagn   0.00936443
		colorDistFreq   0.0059242
		detailScale     99.6635
		colorConversion true
		snowLevel       2
		tropicLatitude  0.988419
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.669937
		terraceProb     0.487443
		erosion         0
		montesMagn      0.660383
		montesFreq      2.8307
		montesSpiky     0.913679
		montesFraction  0.732213
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0230949
		hillsFraction   0.759394
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245279
		craterFreq      0.25565
		craterDensity   0.831871
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.428259
		volcanoTemp     1769.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.275, 0.274, 0.273, 0.000)
		colorShelf     (0.292, 0.291, 0.290, 0.000)
		colorBeach     (0.309, 0.308, 0.307, 0.000)
		colorDesert    (0.327, 0.325, 0.324, 0.000)
		colorLowland   (0.344, 0.342, 0.341, 0.000)
		colorUpland    (0.361, 0.359, 0.358, 0.000)
		colorRock      (0.378, 0.376, 0.375, 0.000)
		colorSnow      (0.395, 0.393, 0.392, 1.000)
		BumpHeight      3.28481
		BumpOffset      0.656961
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.105507
		Period          1.98097
		Eccentricity    0.0239515
		Inclination     40.2583
		AscendingNode   -50.3513
		ArgOfPericenter 10.6457
		MeanAnomaly     -81.3668
	}
}

DwarfMoon	"Ciutric VII.D50"
{
	ParentBody     "Ciutric VII"
	Class	       "Asteroid"

	Mass            3.85311e-011
	Radius          5.38702
	InertiaMoment   0.398785

	RotationPeriod  1871.78
	Obliquity       -30.2483
	EqAscendNode    -65.1641
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.577 0.569 0.566)

	Surface
	{
		SurfStyle       0.656562
		OceanStyle      0.00347145
		Randomize      (0.456, -0.004, 0.599)
		colorDistMagn   0.973782
		colorDistFreq   0.0215246
		detailScale     147.102
		colorConversion true
		snowLevel       2
		tropicLatitude  0.948053
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.730442
		terraceProb     0.210934
		erosion         0
		montesMagn      0.411374
		montesFreq      3.53641
		montesSpiky     0.999487
		montesFraction  0.64406
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0538527
		hillsFraction   0.658083
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240437
		craterFreq      0.263806
		craterDensity   0.772303
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.549345
		volcanoTemp     1584.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.225, 0.194, 0.158, 0.000)
		colorShelf     (0.231, 0.199, 0.181, 0.000)
		colorBeach     (0.271, 0.233, 0.215, 0.000)
		colorDesert    (0.295, 0.250, 0.209, 0.000)
		colorLowland   (0.323, 0.268, 0.238, 0.000)
		colorUpland    (0.358, 0.324, 0.289, 0.000)
		colorRock      (0.387, 0.353, 0.311, 0.000)
		colorSnow      (0.422, 0.376, 0.328, 1.000)
		BumpHeight      4.84832
		BumpOffset      0.969664
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.106171
		Period          1.99972
		Eccentricity    0.146863
		Inclination     -54.0761
		AscendingNode   -62.4439
		ArgOfPericenter -93.912
		MeanAnomaly     -87.8968
	}
}

DwarfMoon	"Ciutric VII.D51"
{
	ParentBody     "Ciutric VII"
	Class	       "Asteroid"

	Mass            6.80635e-011
	Radius          5.99568
	InertiaMoment   0.399732

	RotationPeriod  1618.19
	Obliquity       -119.446
	EqAscendNode    45.0143
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.691 0.689 0.687)

	Surface
	{
		SurfStyle       0.926621
		OceanStyle      0.00308091
		Randomize      (-0.327, 0.426, -0.080)
		colorDistMagn   0.919176
		colorDistFreq   0.0167049
		detailScale     163.722
		colorConversion true
		snowLevel       2
		tropicLatitude  0.783939
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.440831
		terraceProb     0.233702
		erosion         0
		montesMagn      0.366945
		montesFreq      3.05367
		montesSpiky     0.965731
		montesFraction  0.596366
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0986748
		hillsFraction   0.619477
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.210613
		craterFreq      0.217851
		craterDensity   0.836921
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.493371
		volcanoTemp     1365.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.235, 0.241, 0.275, 0.050)
		colorShelf     (0.276, 0.282, 0.316, 0.040)
		colorBeach     (0.318, 0.324, 0.357, 0.030)
		colorDesert    (0.359, 0.365, 0.405, 0.020)
		colorLowland   (0.401, 0.406, 0.446, 0.030)
		colorUpland    (0.442, 0.448, 0.488, 0.050)
		colorRock      (0.483, 0.489, 0.543, 0.020)
		colorSnow      (0.483, 0.489, 0.543, 1.000)
		BumpHeight      5.39612
		BumpOffset      1.07922
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.106718
		Period          2.0152
		Eccentricity    0.245975
		Inclination     -83.2639
		AscendingNode   49.3667
		ArgOfPericenter -53.2549
		MeanAnomaly     105.351
	}
}

DwarfMoon	"Ciutric VII.D52"
{
	ParentBody     "Ciutric VII"
	Class	       "Asteroid"

	Mass            1.13863e-010
	Radius          6.81608
	InertiaMoment   0.397667

	RotationPeriod  1447.59
	Obliquity       -98.9537
	EqAscendNode    71.6297
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.693 0.690 0.687)

	Surface
	{
		SurfStyle       0.336936
		OceanStyle      0.217622
		Randomize      (-0.017, 0.258, 0.298)
		colorDistMagn   0.647648
		colorDistFreq   0.00492049
		detailScale     186.124
		colorConversion true
		snowLevel       2
		tropicLatitude  0.969758
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.609223
		terraceProb     0.284127
		erosion         0
		montesMagn      0.40159
		montesFreq      2.82284
		montesSpiky     0.984697
		montesFraction  0.472704
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.14123
		hillsFraction   0.669217
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225716
		craterFreq      0.203134
		craterDensity   0.919171
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.551241
		volcanoTemp     1649.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.277, 0.276, 0.275, 0.000)
		colorShelf     (0.295, 0.293, 0.292, 0.000)
		colorBeach     (0.312, 0.310, 0.309, 0.000)
		colorDesert    (0.329, 0.328, 0.326, 0.000)
		colorLowland   (0.347, 0.345, 0.343, 0.000)
		colorUpland    (0.364, 0.362, 0.360, 0.000)
		colorRock      (0.381, 0.379, 0.378, 0.000)
		colorSnow      (0.399, 0.397, 0.395, 1.000)
		BumpHeight      6.13447
		BumpOffset      1.22689
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.10727
		Period          2.03084
		Eccentricity    0.436636
		Inclination     -75.2967
		AscendingNode   77.6373
		ArgOfPericenter -146.605
		MeanAnomaly     170.795
	}
}

DwarfMoon	"Ciutric VII.D53"
{
	ParentBody     "Ciutric VII"
	Class	       "Asteroid"

	Mass            1.82748e-010
	Radius          7.65351
	InertiaMoment   0.398932

	RotationPeriod  1306.02
	Obliquity       100.527
	EqAscendNode    58.75
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.637 0.580 0.528)

	Surface
	{
		SurfStyle       0.884734
		OceanStyle      0.0510437
		Randomize      (0.923, -0.971, -0.690)
		colorDistMagn   0.675547
		colorDistFreq   0.0326431
		detailScale     208.992
		colorConversion true
		snowLevel       2
		tropicLatitude  0.867222
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.338466
		terraceProb     0.321432
		erosion         0
		montesMagn      0.564384
		montesFreq      2.2127
		montesSpiky     0.867073
		montesFraction  0.600047
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0923269
		hillsFraction   0.749519
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.268576
		craterFreq      0.181394
		craterDensity   1.03616
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.631704
		volcanoTemp     1717.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.216, 0.203, 0.211, 0.050)
		colorShelf     (0.255, 0.238, 0.243, 0.040)
		colorBeach     (0.293, 0.273, 0.275, 0.030)
		colorDesert    (0.331, 0.307, 0.312, 0.020)
		colorLowland   (0.369, 0.342, 0.343, 0.030)
		colorUpland    (0.407, 0.377, 0.375, 0.050)
		colorRock      (0.446, 0.412, 0.417, 0.020)
		colorSnow      (0.446, 0.412, 0.417, 1.000)
		BumpHeight      6.88815
		BumpOffset      1.37763
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.107551
		Period          2.03882
		Eccentricity    0.0878888
		Inclination     73.8238
		AscendingNode   61.7436
		ArgOfPericenter 176.699
		MeanAnomaly     -36.7508
	}
}

DwarfMoon	"Ciutric VII.D54"
{
	ParentBody     "Ciutric VII"
	Class	       "Asteroid"

	Mass            2.83933e-010
	Radius          10.8359
	InertiaMoment   0.399858

	RotationPeriod  1460.57
	Obliquity       22.8119
	EqAscendNode    -98.4933
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.470 0.464 0.457)

	Surface
	{
		SurfStyle       0.267274
		OceanStyle      0.911887
		Randomize      (0.013, 0.165, 0.349)
		colorDistMagn   0.510032
		colorDistFreq   0.0537357
		detailScale     295.893
		colorConversion true
		snowLevel       2
		tropicLatitude  0.488099
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.445237
		terraceProb     0.319681
		erosion         0
		montesMagn      0.528801
		montesFreq      2.57774
		montesSpiky     0.980386
		montesFraction  0.475732
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.241857
		hillsFraction   0.738545
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.208977
		craterFreq      0.210247
		craterDensity   0.765733
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.441314
		volcanoTemp     1707.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.188, 0.186, 0.183, 0.000)
		colorShelf     (0.200, 0.197, 0.194, 0.000)
		colorBeach     (0.211, 0.209, 0.205, 0.000)
		colorDesert    (0.223, 0.221, 0.217, 0.000)
		colorLowland   (0.235, 0.232, 0.228, 0.000)
		colorUpland    (0.247, 0.244, 0.240, 0.000)
		colorRock      (0.258, 0.255, 0.251, 0.000)
		colorSnow      (0.270, 0.267, 0.263, 1.000)
		BumpHeight      9.75235
		BumpOffset      1.95047
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.108029
		Period          2.05243
		Eccentricity    0.440633
		Inclination     20.4798
		AscendingNode   -93.9168
		ArgOfPericenter 53.5358
		MeanAnomaly     -43.4375
	}
}

DwarfMoon	"Ciutric VII.D55"
{
	ParentBody     "Ciutric VII"
	Class	       "Asteroid"

	Mass            4.29809e-010
	Radius          11.1651
	InertiaMoment   0.397898

	RotationPeriod  1249.46
	Obliquity       -45.3697
	EqAscendNode    99.2321
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.656 0.649 0.646)

	Surface
	{
		SurfStyle       0.0101111
		OceanStyle      0.412537
		Randomize      (0.750, -0.378, -0.348)
		colorDistMagn   0.808506
		colorDistFreq   0.0544959
		detailScale     304.881
		colorConversion true
		snowLevel       2
		tropicLatitude  0.716047
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.412856
		terraceProb     0.168909
		erosion         0
		montesMagn      0.622026
		montesFreq      2.68601
		montesSpiky     0.995084
		montesFraction  0.491622
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.409815
		hillsFraction   0.492307
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.269971
		craterFreq      0.248488
		craterDensity   0.82661
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.486592
		volcanoTemp     1507.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.263, 0.260, 0.258, 0.000)
		colorShelf     (0.279, 0.276, 0.275, 0.000)
		colorBeach     (0.295, 0.292, 0.291, 0.000)
		colorDesert    (0.312, 0.308, 0.307, 0.000)
		colorLowland   (0.328, 0.324, 0.323, 0.000)
		colorUpland    (0.345, 0.341, 0.339, 0.000)
		colorRock      (0.361, 0.357, 0.355, 0.000)
		colorSnow      (0.377, 0.373, 0.371, 1.000)
		BumpHeight      10.0486
		BumpOffset      2.00972
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.108286
		Period          2.05975
		Eccentricity    0.0070385
		Inclination     -23.2368
		AscendingNode   100.779
		ArgOfPericenter -154.178
		MeanAnomaly     172.76
	}
}

DwarfMoon	"Ciutric VII.D56"
{
	ParentBody     "Ciutric VII"
	Class	       "Asteroid"

	Mass            6.36991e-010
	Radius          12.1685
	InertiaMoment   0.399073

	RotationPeriod  1134.89
	Obliquity       45.8499
	EqAscendNode    -63.0588
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.560 0.558 0.555)

	Surface
	{
		SurfStyle       0.194763
		OceanStyle      0.00452008
		Randomize      (-0.365, 0.433, 0.789)
		colorDistMagn   0.481904
		colorDistFreq   0.0482187
		detailScale     332.281
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997866
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.661094
		terraceProb     0.288998
		erosion         0
		montesMagn      0.437482
		montesFreq      3.75513
		montesSpiky     0.977596
		montesFraction  0.399927
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.48233
		hillsFraction   0.708708
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249552
		craterFreq      0.252414
		craterDensity   0.98894
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.555282
		volcanoTemp     1511.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.224, 0.223, 0.222, 0.000)
		colorShelf     (0.238, 0.237, 0.236, 0.000)
		colorBeach     (0.252, 0.251, 0.250, 0.000)
		colorDesert    (0.266, 0.265, 0.264, 0.000)
		colorLowland   (0.280, 0.279, 0.278, 0.000)
		colorUpland    (0.294, 0.293, 0.291, 0.000)
		colorRock      (0.308, 0.307, 0.305, 0.000)
		colorSnow      (0.322, 0.321, 0.319, 1.000)
		BumpHeight      10.9516
		BumpOffset      2.19033
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.108837
		Period          2.0755
		Eccentricity    0.251209
		Inclination     54.8651
		AscendingNode   -55.1184
		ArgOfPericenter 21.8442
		MeanAnomaly     123.686
	}
}

DwarfMoon	"Ciutric VII.D57"
{
	ParentBody     "Ciutric VII"
	Class	       "Asteroid"

	Mass            9.27709e-010
	Radius          13.2409
	InertiaMoment   0.399983

	RotationPeriod  1035.61
	Obliquity       -72.6657
	EqAscendNode    111.99
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.541 0.531 0.528)

	Surface
	{
		SurfStyle       0.778944
		OceanStyle      0.621854
		Randomize      (0.452, -0.378, 0.747)
		colorDistMagn   0.337083
		colorDistFreq   0.134719
		detailScale     361.566
		colorConversion true
		snowLevel       2
		tropicLatitude  0.909044
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.424437
		terraceProb     0.247571
		erosion         0
		montesMagn      0.503384
		montesFreq      2.62581
		montesSpiky     0.986658
		montesFraction  0.50901
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.435471
		hillsFraction   0.765319
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258165
		craterFreq      0.274509
		craterDensity   0.965515
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.546906
		volcanoTemp     1415.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.211, 0.181, 0.148, 0.000)
		colorShelf     (0.216, 0.186, 0.169, 0.000)
		colorBeach     (0.254, 0.218, 0.201, 0.000)
		colorDesert    (0.276, 0.234, 0.195, 0.000)
		colorLowland   (0.303, 0.250, 0.222, 0.000)
		colorUpland    (0.335, 0.303, 0.269, 0.000)
		colorRock      (0.362, 0.329, 0.290, 0.000)
		colorSnow      (0.395, 0.350, 0.306, 1.000)
		BumpHeight      11.9169
		BumpOffset      2.38337
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.109072
		Period          2.08223
		Eccentricity    0.0510996
		Inclination     -76.9618
		AscendingNode   112.074
		ArgOfPericenter -119.911
		MeanAnomaly     125.138
	}
}

DwarfMoon	"Ciutric VII.D58"
{
	ParentBody     "Ciutric VII"
	Class	       "Asteroid"

	Mass            1.33167e-009
	Radius          13.2857
	InertiaMoment   0.398104

	RotationPeriod  879.803
	Obliquity       15.4316
	EqAscendNode    -158.059
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.513 0.511 0.508)

	Surface
	{
		SurfStyle       0.32331
		OceanStyle      0.0799992
		Randomize      (-0.032, 0.661, 0.521)
		colorDistMagn   0.702195
		colorDistFreq   0.142945
		detailScale     362.788
		colorConversion true
		snowLevel       2
		tropicLatitude  0.303907
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.296236
		terraceProb     0.132078
		erosion         0
		montesMagn      0.620554
		montesFreq      3.68048
		montesSpiky     0.929888
		montesFraction  0.645624
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.432571
		hillsFraction   0.573971
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.205785
		craterFreq      0.191046
		craterDensity   1.02254
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.463961
		volcanoTemp     1236.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.205, 0.204, 0.203, 0.000)
		colorShelf     (0.218, 0.217, 0.216, 0.000)
		colorBeach     (0.231, 0.230, 0.229, 0.000)
		colorDesert    (0.244, 0.243, 0.241, 0.000)
		colorLowland   (0.257, 0.255, 0.254, 0.000)
		colorUpland    (0.269, 0.268, 0.267, 0.000)
		colorRock      (0.282, 0.281, 0.279, 0.000)
		colorSnow      (0.295, 0.294, 0.292, 1.000)
		BumpHeight      11.9571
		BumpOffset      2.39142
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.109409
		Period          2.0919
		Eccentricity    0.441675
		Inclination     -2.37201
		AscendingNode   -161.128
		ArgOfPericenter 75.5667
		MeanAnomaly     23.5152
	}
}

DwarfMoon	"Ciutric VII.D59"
{
	ParentBody     "Ciutric VII"
	Class	       "Asteroid"

	Mass            1.88858e-009
	Radius          18.4362
	InertiaMoment   0.39921

	RotationPeriod  1012.76
	Obliquity       -3.29543
	EqAscendNode    -103.265
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.727 0.724 0.719)

	Surface
	{
		SurfStyle       0.980967
		OceanStyle      0.542122
		Randomize      (0.581, -0.628, -0.176)
		colorDistMagn   0.949569
		colorDistFreq   0.179964
		detailScale     503.43
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0992679
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.276095
		terraceProb     0.164611
		erosion         0
		montesMagn      0.538206
		montesFreq      2.82629
		montesSpiky     0.862127
		montesFraction  0.655641
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.763122
		hillsFraction   0.647123
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254764
		craterFreq      0.263393
		craterDensity   1.017
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.518196
		volcanoTemp     1475.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.247, 0.253, 0.287, 0.050)
		colorShelf     (0.291, 0.297, 0.331, 0.040)
		colorBeach     (0.334, 0.340, 0.374, 0.030)
		colorDesert    (0.378, 0.383, 0.424, 0.020)
		colorLowland   (0.422, 0.427, 0.467, 0.030)
		colorUpland    (0.465, 0.470, 0.510, 0.050)
		colorRock      (0.509, 0.514, 0.568, 0.020)
		colorSnow      (0.509, 0.514, 0.568, 1.000)
		BumpHeight      16.5925
		BumpOffset      3.31851
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.109856
		Period          2.10473
		Eccentricity    0.13933
		Inclination     3.88863
		AscendingNode   -104.669
		ArgOfPericenter -51.3574
		MeanAnomaly     14.9547
	}
}

DwarfMoon	"Ciutric VII.D60"
{
	ParentBody     "Ciutric VII"
	Class	       "Asteroid"

	Mass            2.65148e-009
	Radius          19.6867
	InertiaMoment   0.395951

	RotationPeriod  918.31
	Obliquity       53.5536
	EqAscendNode    182.811
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.498 0.493 0.490)

	Surface
	{
		SurfStyle       0.474055
		OceanStyle      0.513831
		Randomize      (0.005, -0.253, 0.794)
		colorDistMagn   0.289019
		colorDistFreq   0.201845
		detailScale     537.577
		colorConversion true
		snowLevel       2
		tropicLatitude  0.704084
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.600238
		terraceProb     0.186872
		erosion         0
		montesMagn      0.471864
		montesFreq      3.34853
		montesSpiky     0.991174
		montesFraction  0.399597
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.04807
		hillsFraction   0.591756
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221688
		craterFreq      0.253474
		craterDensity   1.0236
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.531156
		volcanoTemp     1511.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.199, 0.197, 0.196, 0.000)
		colorShelf     (0.212, 0.210, 0.208, 0.000)
		colorBeach     (0.224, 0.222, 0.221, 0.000)
		colorDesert    (0.236, 0.234, 0.233, 0.000)
		colorLowland   (0.249, 0.246, 0.245, 0.000)
		colorUpland    (0.261, 0.259, 0.257, 0.000)
		colorRock      (0.274, 0.271, 0.270, 0.000)
		colorSnow      (0.286, 0.283, 0.282, 1.000)
		BumpHeight      17.718
		BumpOffset      3.5436
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.110272
		Period          2.11669
		Eccentricity    0.347549
		Inclination     8.80272
		AscendingNode   178.246
		ArgOfPericenter 96.3639
		MeanAnomaly     -43.0276
	}
}

DwarfMoon	"Ciutric VII.D61"
{
	ParentBody     "Ciutric VII"
	Class	       "Asteroid"

	Mass            3.69142e-009
	Radius          21.1133
	InertiaMoment   0.398291

	RotationPeriod  843.825
	Obliquity       -23.5534
	EqAscendNode    -155.059
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.736 0.635 0.558)

	Surface
	{
		SurfStyle       0.962968
		OceanStyle      0.369895
		Randomize      (-0.266, -0.584, -0.622)
		colorDistMagn   0.0149083
		colorDistFreq   0.228288
		detailScale     576.535
		colorConversion true
		snowLevel       2
		tropicLatitude  0.333261
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.336796
		terraceProb     0.233122
		erosion         0
		montesMagn      0.432221
		montesFreq      2.6541
		montesSpiky     0.913203
		montesFraction  0.518519
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.3597
		hillsFraction   0.58743
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260609
		craterFreq      0.19548
		craterDensity   0.783768
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.352899
		volcanoTemp     1885.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.250, 0.222, 0.223, 0.050)
		colorShelf     (0.295, 0.260, 0.257, 0.040)
		colorBeach     (0.339, 0.299, 0.290, 0.030)
		colorDesert    (0.383, 0.337, 0.329, 0.020)
		colorLowland   (0.427, 0.375, 0.363, 0.030)
		colorUpland    (0.471, 0.413, 0.396, 0.050)
		colorRock      (0.516, 0.451, 0.441, 0.020)
		colorSnow      (0.516, 0.451, 0.441, 1.000)
		BumpHeight      19.002
		BumpOffset      3.8004
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.110606
		Period          2.12632
		Eccentricity    0.343821
		Inclination     -4.70351
		AscendingNode   -153.145
		ArgOfPericenter 106.288
		MeanAnomaly     52.6046
	}
}

Planet	"Ciutric VIII"
{
	ParentBody     "Ciutric System"
	Class	       "IceWorld"

	Mass            0.570343
	Radius          6859.08
	InertiaMoment   0.329233

	Oblateness      0.00875181

	RotationPeriod  21.7902
	Obliquity       4.45585
	EqAscendNode    -158.386
	Precession      0

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.717 0.721 0.738)

	Surface
	{
		SurfStyle       0.418967
		OceanStyle      0.477417
		Randomize      (0.715, -0.624, 0.238)
		colorDistMagn   0.0718644
		colorDistFreq   776.956
		detailScale     17642
		colorConversion true
		drivenDarkening 0
		seaLevel        0.229777
		snowLevel       2
		tropicLatitude  0.0594128
		icecapLatitude  0.472858
		icecapHeight    0.252784
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.69515
		venusFreq       1.39991
		venusMagn       0
		mareFreq        1.49023
		mareDensity     0.0296218
		terraceProb     0.13174
		erosion         0
		montesMagn      0.260566
		montesFreq      337.468
		montesSpiky     0.885838
		montesFraction  0.0415065
		dunesMagn       0.0404346
		dunesFreq       9360.55
		dunesFraction   0.821637
		hillsMagn       0.140301
		hillsFreq       843.281
		hillsFraction   0.243964
		hills2Fraction  0.0734444
		riversMagn      57.1165
		riversFreq      3.0369
		riversSin       4.05769
		riversOctaves   0
		canyonsMagn     0.419097
		canyonsFreq     2.2196
		canyonFraction  0
		cracksMagn      0.0675349
		cracksFreq      2.47321
		cracksOctaves   4
		craterMagn      0.531298
		craterFreq      18.0296
		craterDensity   0.846035
		craterOctaves   13
		craterRayedFactor 0.194385
		volcanoMagn     0.618337
		volcanoFreq     0.589262
		volcanoDensity  0.216071
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.0229716
		volcanoRadius   0.551183
		volcanoTemp     1359.82
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.749, 0.744, 0.743, 0.500)
		colorShelf     (0.712, 0.707, 0.706, 0.500)
		colorBeach     (0.525, 0.521, 0.520, 0.750)
		colorDesert    (0.637, 0.633, 0.632, 1.000)
		colorLowland   (0.659, 0.655, 0.654, 1.000)
		colorUpland    (0.697, 0.692, 0.691, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.659, 0.655, 0.654, 1.000)
		colorUpPlants  (0.697, 0.692, 0.691, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.994299
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
		Height          159.945
		Density         0.000570063
		Pressure        0.000309475
		Greenhouse      0.516882
		Bright          3.55782
		Opacity         0
		SkyLight        1.18594
		Hue             -0.0228639
		Saturation      1

		Composition
		{
			CH4   	99.9699
			N2    	0.020101
			C2H4  	0.00810256
			C2H6  	0.0013419
			C2H2  	0.000221865
			CO    	0.000167834
			Ar    	0.000118514
			O2    	3.35887e-005
			Ne    	2.24973e-005
			Kr    	1.04165e-005
		}
	}

	Aurora
	{
		Height      68.6723
		NorthLat    46.7157
		NorthLon    30.0935
		NorthRadius 1334.32
		NorthWidth  311.456
		NorthRings  2
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -61.501
		SouthLon    237.323
		SouthRadius 2029.56
		SouthWidth  786.732
		SouthRings  5
		SouthBright 0.3
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	Rings
	{
		InnerRadius     8562.85
		OuterRadius     14937.3
		RotationPeriod  6.68198
		RotationOffset  0
		FrontBright     0.652728
		BackBright      0.905647
		Density         0.513512
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   20.4173
		Period          67.3747
		Eccentricity    0.0877239
		Inclination     1.23408
		AscendingNode   -152.73
		ArgOfPericenter 203.391
		MeanAnomaly     294.989
	}
}

DwarfMoon	"Ciutric VIII.D1"
{
	ParentBody     "Ciutric VIII"
	Class	       "Asteroid"

	Mass            7.18334e-008
	Radius          55.6866
	InertiaMoment   0.397324

	Oblateness      0.249

	Obliquity       -0.00593923
	EqAscendNode    94.3367
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.536 0.534 0.531)

	Surface
	{
		SurfStyle       0.861753
		OceanStyle      0.93947
		Randomize      (-0.867, -0.013, -0.467)
		colorDistMagn   0.921735
		colorDistFreq   1.44355
		detailScale     1520.62
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.689057
		terraceProb     0.17729
		erosion         0
		montesMagn      0.506798
		montesFreq      2.583
		montesSpiky     0.901546
		montesFraction  0.431591
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.70596
		hillsFraction   0.813156
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.269948
		craterFreq      0.146662
		craterDensity   0.930874
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.492979
		volcanoTemp     1366.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.182, 0.187, 0.212, 0.050)
		colorShelf     (0.215, 0.219, 0.244, 0.040)
		colorBeach     (0.247, 0.251, 0.276, 0.030)
		colorDesert    (0.279, 0.283, 0.313, 0.020)
		colorLowland   (0.311, 0.315, 0.345, 0.030)
		colorUpland    (0.343, 0.347, 0.377, 0.050)
		colorRock      (0.375, 0.379, 0.420, 0.020)
		colorSnow      (0.375, 0.379, 0.420, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000100835
		Period          0.0007754
		Eccentricity    4.00793e-005
		Inclination     -0.00593923
		AscendingNode   94.3367
		ArgOfPericenter 161.302
		MeanAnomaly     -36.7432
	}
}

DwarfMoon	"Ciutric VIII.D2"
{
	ParentBody     "Ciutric VIII"
	Class	       "Asteroid"

	Mass            9.79039e-008
	Radius          73.6051
	InertiaMoment   0.398747

	Oblateness      0.249

	Obliquity       0.00329816
	EqAscendNode    -130.422
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.638 0.638 0.639)

	Surface
	{
		SurfStyle       0.162185
		OceanStyle      0.525249
		Randomize      (-0.721, -0.615, -0.335)
		colorDistMagn   0.604441
		colorDistFreq   2.78019
		detailScale     2009.91
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.547801
		terraceProb     0.33599
		erosion         0
		montesMagn      0.564175
		montesFreq      3.51189
		montesSpiky     0.886601
		montesFraction  0.254543
		dunesFraction   0
		hillsMagn       0
		hillsFreq       10.3798
		hillsFraction   0.656267
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247766
		craterFreq      0.25549
		craterDensity   0.816392
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.563028
		volcanoTemp     1751.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.309, 0.266, 0.238, 0.000)
		colorShelf     (0.329, 0.283, 0.253, 0.000)
		colorBeach     (0.348, 0.300, 0.268, 0.000)
		colorDesert    (0.367, 0.316, 0.283, 0.000)
		colorLowland   (0.387, 0.333, 0.297, 0.000)
		colorUpland    (0.406, 0.350, 0.312, 0.000)
		colorRock      (0.425, 0.366, 0.327, 0.000)
		colorSnow      (0.445, 0.383, 0.342, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000130042
		Period          0.00113563
		Eccentricity    5.89792e-005
		Inclination     0.00329816
		AscendingNode   -130.422
		ArgOfPericenter 100.595
		MeanAnomaly     50.4648
	}
}

Moon	"Ciutric VIII.1"
{
	ParentBody     "Ciutric VIII"
	Class	       "Selena"

	Mass            0.00687303
	Radius          1661.37
	InertiaMoment   0.380754

	Oblateness      0.00450067

	Obliquity       -0.492855
	EqAscendNode    120.12
	Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.989 0.989 0.989)

	Surface
	{
		SurfStyle       0.093084
		OceanStyle      0.873889
		Randomize      (0.417, 0.529, 0.786)
		colorDistMagn   0.0657467
		colorDistFreq   209.811
		detailScale     4273.14
		colorConversion true
		drivenDarkening 0
		seaLevel        0.143098
		snowLevel       2
		tropicLatitude  0.00858312
		icecapLatitude  0.831412
		icecapHeight    0.154115
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.89106
		venusFreq       1.66588
		venusMagn       0
		mareFreq        0.964038
		mareDensity     0.00195298
		terraceProb     0.152504
		erosion         0
		montesMagn      0.0629133
		montesFreq      100.894
		montesSpiky     0.869644
		montesFraction  0.995292
		dunesMagn       0.0343304
		dunesFreq       2198.36
		dunesFraction   0.370629
		hillsMagn       0.126529
		hillsFreq       186.081
		hillsFraction   0.168472
		hills2Fraction  0
		riversMagn      61.8135
		riversFreq      3.92975
		riversSin       4.07031
		riversOctaves   0
		canyonsMagn     0.375426
		canyonsFreq     0.69219
		canyonFraction  0.365869
		cracksMagn      0.0353435
		cracksFreq      0.427659
		cracksOctaves   0
		craterMagn      0.661441
		craterFreq      5.75849
		craterDensity   0.59123
		craterOctaves   8.41792
		craterRayedFactor 0.0804215
		volcanoMagn     0.223635
		volcanoFreq     0.692865
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.156684
		volcanoRadius   0.171933
		volcanoTemp     1797.11
		lavaCoverTidal  0.260816
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.320, 0.320, 0.000)
		colorShelf     (0.370, 0.370, 0.370, 0.000)
		colorBeach     (0.300, 0.233, 0.172, 0.000)
		colorDesert    (0.373, 0.280, 0.197, 0.200)
		colorLowland   (0.403, 0.298, 0.221, 0.500)
		colorUpland    (0.421, 0.312, 0.228, 0.800)
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
		SemiMajorAxis   0.000309302
		Period          0.0041408
		Eccentricity    0.0417563
		Inclination     -0.492855
		AscendingNode   120.12
		ArgOfPericenter -88.7594
		MeanAnomaly     -168.108
	}
}

Planet	"Ciutric IX"
{
	ParentBody     "Ciutric System"
	Class	       "IceWorld"

	Mass            2.71961
	Radius          10908.9
	InertiaMoment   0.330315

	Oblateness      0.0139276

	RotationPeriod  15.8969
	Obliquity       33.6191
	EqAscendNode    -64.1762
	Precession      0

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.709 0.711 0.721)

	Surface
	{
		SurfStyle       0.496138
		OceanStyle      0.414811
		Randomize      (-0.269, 0.340, 0.703)
		colorDistMagn   0.0645033
		colorDistFreq   1375.95
		detailScale     28058.2
		colorConversion true
		drivenDarkening 0
		seaLevel        0.157768
		snowLevel       2
		tropicLatitude  0.564149
		icecapLatitude  1
		icecapHeight    0.157768
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.00959
		venusFreq       1.16789
		venusMagn       0
		mareFreq        2.27927
		mareDensity     0.154344
		terraceProb     0.20077
		erosion         0
		montesMagn      0.15625
		montesFreq      495.855
		montesSpiky     0.943036
		montesFraction  0.378066
		dunesMagn       0.0401434
		dunesFreq       14317.7
		dunesFraction   0.742977
		hillsMagn       0.12534
		hillsFreq       1060.47
		hillsFraction   0.727539
		hills2Fraction  0.271605
		riversMagn      62.7815
		riversFreq      2.90142
		riversSin       6.45704
		riversOctaves   0
		canyonsMagn     0.483248
		canyonsFreq     3.33916
		canyonFraction  0
		cracksMagn      0.051391
		cracksFreq      7.28301
		cracksOctaves   6
		craterMagn      0.532125
		craterFreq      23.5744
		craterDensity   0.492744
		craterOctaves   7.16961
		craterRayedFactor 0
		volcanoMagn     0.60599
		volcanoFreq     0.595309
		volcanoDensity  0.230026
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.250539
		volcanoRadius   0.48171
		volcanoTemp     1777
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.206, 0.161, 0.124, 0.000)
		colorShelf     (0.254, 0.200, 0.158, 0.000)
		colorBeach     (0.385, 0.304, 0.238, 0.200)
		colorDesert    (0.350, 0.284, 0.209, 0.500)
		colorLowland   (0.268, 0.220, 0.158, 0.800)
		colorUpland    (0.453, 0.387, 0.294, 1.000)
		colorRock      (0.670, 0.620, 0.550, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.268, 0.220, 0.158, 0.800)
		colorUpPlants  (0.453, 0.387, 0.294, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0
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
		Height          54.5443
		Density         0.136504
		Pressure        0.0290841
		Greenhouse      1.13308
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0111619
		Saturation      1

		Composition
		{
			N2    	87.1557
			CO    	8.17461
			Ar    	3.52072
			Ne    	0.61864
			He    	0.530281
		}
	}

	Aurora
	{
		Height      119.523
		NorthLat    77.1208
		NorthLon    152.151
		NorthRadius 2939.32
		NorthWidth  773.565
		NorthRings  3
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -90
		SouthLon    335.057
		SouthRadius 3777.82
		SouthWidth  1194.79
		SouthRings  2
		SouthBright 0.3
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	Rings
	{
		InnerRadius     15168.3
		OuterRadius     39878
		RotationPeriod  7.67143
		RotationOffset  0
		FrontBright     0.568996
		BackBright      0.650363
		Density         0.935713
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   43.187
		Period          207.267
		Eccentricity    0.0600293
		Inclination     2.0563
		AscendingNode   -70.8179
		ArgOfPericenter 159.873
		MeanAnomaly     111.803
	}
}

Comet	"Ciutric 1"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            7.30466e-015
	Radius          0.295952
	InertiaMoment   0.399029

	Oblateness      0.0599562

	RotationPeriod  23.7341
	Obliquity       237.697
	EqAscendNode    343.572
	Precession      0

	AbsMagn         3.09595
	SlopeParam      8.79779
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.752 0.750 0.748)

	Surface
	{
		SurfStyle       0.329283
		OceanStyle      0.543741
		Randomize      (0.043, 0.437, 0.997)
		colorDistMagn   0.999065
		colorDistFreq   5.25939e-005
		detailScale     8.08147
		colorConversion true
		snowLevel       2
		tropicLatitude  0.896188
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.492361
		terraceProb     0.322544
		erosion         0
		montesMagn      0.54278
		montesFreq      3.49177
		montesSpiky     0.899311
		montesFraction  0.768963
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000212698
		hillsFraction   0.565566
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231661
		craterFreq      0.236504
		craterDensity   0.598197
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.417492
		volcanoTemp     1744.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.301, 0.300, 0.299, 0.000)
		colorShelf     (0.320, 0.319, 0.318, 0.000)
		colorBeach     (0.339, 0.338, 0.336, 0.000)
		colorDesert    (0.357, 0.356, 0.355, 0.000)
		colorLowland   (0.376, 0.375, 0.374, 0.000)
		colorUpland    (0.395, 0.394, 0.393, 0.000)
		colorRock      (0.414, 0.413, 0.411, 0.000)
		colorSnow      (0.433, 0.431, 0.430, 1.000)
		BumpHeight      0.266357
		BumpOffset      0.0532714
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.11687
		GasToDust   0.25
		Particles   1215
		GasBright   0.0128904
		DustBright  0.206372
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   32.4075
		Period          134.732
		Eccentricity    0.890853
		Inclination     -172.668
		AscendingNode   36.8199
		ArgOfPericenter 176.257
		MeanAnomaly     168.88
	}
}

Comet	"Ciutric 2"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            5.64963e-011
	Radius          5.29579
	InertiaMoment   0.397498

	Oblateness      0.0542586

	RotationPeriod  21.4122
	Obliquity       190.903
	EqAscendNode    328.149
	Precession      0

	AbsMagn         10.8872
	SlopeParam      2.72874
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.546 0.466 0.386)

	Surface
	{
		SurfStyle       0.371175
		OceanStyle      0.91989
		Randomize      (-0.540, 0.461, 0.140)
		colorDistMagn   0.663948
		colorDistFreq   0.0128438
		detailScale     144.61
		colorConversion true
		snowLevel       2
		tropicLatitude  0.253545
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.699621
		terraceProb     0.222312
		erosion         0
		montesMagn      0.342545
		montesFreq      2.68685
		montesSpiky     0.935257
		montesFraction  0.206201
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0689142
		hillsFraction   0.654222
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.210815
		craterFreq      0.167138
		craterDensity   1.01242
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.43722
		volcanoTemp     1670.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.218, 0.187, 0.155, 0.000)
		colorShelf     (0.232, 0.198, 0.164, 0.000)
		colorBeach     (0.246, 0.210, 0.174, 0.000)
		colorDesert    (0.259, 0.222, 0.184, 0.000)
		colorLowland   (0.273, 0.233, 0.193, 0.000)
		colorUpland    (0.287, 0.245, 0.203, 0.000)
		colorRock      (0.300, 0.257, 0.213, 0.000)
		colorSnow      (0.314, 0.268, 0.222, 1.000)
		BumpHeight      4.76621
		BumpOffset      0.953241
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.598062
		GasToDust   0.25
		Particles   2188
		GasBright   0.0829264
		DustBright  0.620822
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   85.4544
		Period          576.902
		Eccentricity    0.956888
		Inclination     -166.474
		AscendingNode   -106.563
		ArgOfPericenter 179.249
		MeanAnomaly     -34.9363
	}
}

Comet	"Ciutric 3"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            4.36959e-007
	Radius          115.588
	InertiaMoment   0.399479

	Oblateness      0.0935892

	RotationPeriod  18.9741
	Obliquity       144.109
	EqAscendNode    312.726
	Precession      0

	AbsMagn         7.26432
	SlopeParam      3.36054
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.745 0.744 0.742)

	Surface
	{
		SurfStyle       0.866737
		OceanStyle      0.200643
		Randomize      (-0.399, -0.392, 0.272)
		colorDistMagn   0.738182
		colorDistFreq   10.3514
		detailScale     3156.32
		colorConversion true
		snowLevel       2
		tropicLatitude  0.762699
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.333104
		terraceProb     0.131977
		erosion         0
		montesMagn      0.48408
		montesFreq      3.11759
		montesSpiky     0.924541
		montesFraction  0.479349
		dunesFraction   0
		hillsMagn       0
		hillsFreq       20.0223
		hillsFraction   0.459756
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24506
		craterFreq      0.547032
		craterDensity   0.914269
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.565025
		volcanoTemp     1564.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.253, 0.260, 0.297, 0.050)
		colorShelf     (0.298, 0.305, 0.342, 0.040)
		colorBeach     (0.343, 0.350, 0.386, 0.030)
		colorDesert    (0.388, 0.394, 0.438, 0.020)
		colorLowland   (0.432, 0.439, 0.483, 0.030)
		colorUpland    (0.477, 0.484, 0.527, 0.050)
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

	CometTail
	{
		MaxLength   1
		GasToDust   0.25
		Particles   3000
		GasBright   0.0686712
		DustBright  0.319564
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   36.5182
		Period          161.163
		Eccentricity    0.851312
		Inclination     30.4938
		AscendingNode   -99.9348
		ArgOfPericenter -54.2063
		MeanAnomaly     -107.465
	}
}

Comet	"Ciutric 4"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            1.34543e-014
	Radius          0.328029
	InertiaMoment   0.398237

	Oblateness      0.092616

	RotationPeriod  16.3948
	Obliquity       97.3145
	EqAscendNode    297.304
	Precession      0

	AbsMagn         2.6194
	SlopeParam      3.93313
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.414 0.409 0.404)

	Surface
	{
		SurfStyle       0.367336
		OceanStyle      0.511452
		Randomize      (0.213, -0.909, 0.433)
		colorDistMagn   0.904697
		colorDistFreq   3.12079e-005
		detailScale     8.95737
		colorConversion true
		snowLevel       2
		tropicLatitude  0.937427
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.450398
		terraceProb     0.238828
		erosion         0
		montesMagn      0.426412
		montesFreq      3.05135
		montesSpiky     0.787499
		montesFraction  0.430578
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000310427
		hillsFraction   0.812603
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231962
		craterFreq      0.205314
		craterDensity   0.809717
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.411133
		volcanoTemp     1351.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.166, 0.164, 0.161, 0.000)
		colorShelf     (0.176, 0.174, 0.172, 0.000)
		colorBeach     (0.186, 0.184, 0.182, 0.000)
		colorDesert    (0.197, 0.194, 0.192, 0.000)
		colorLowland   (0.207, 0.205, 0.202, 0.000)
		colorUpland    (0.217, 0.215, 0.212, 0.000)
		colorRock      (0.228, 0.225, 0.222, 0.000)
		colorSnow      (0.238, 0.235, 0.232, 1.000)
		BumpHeight      0.295226
		BumpOffset      0.0590452
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.149696
		GasToDust   0.25
		Particles   1282
		GasBright   0.205898
		DustBright  0.666824
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   90.2659
		Period          626.305
		Eccentricity    0.972349
		Inclination     120.854
		AscendingNode   109.404
		ArgOfPericenter -174.096
		MeanAnomaly     -102.102
	}
}

Comet	"Ciutric 5"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            1.04059e-010
	Radius          7.1551
	InertiaMoment   0.399903

	Oblateness      0.180609

	RotationPeriod  13.6422
	Obliquity       50.5202
	EqAscendNode    281.881
	Precession      0

	AbsMagn         10.6226
	SlopeParam      4.50017
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.557 0.407 0.319)

	Surface
	{
		SurfStyle       0.274394
		OceanStyle      0.38591
		Randomize      (0.106, 0.344, -0.967)
		colorDistMagn   0.249986
		colorDistFreq   0.0137889
		detailScale     195.382
		colorConversion true
		snowLevel       2
		tropicLatitude  0.451193
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.481913
		terraceProb     0.183004
		erosion         0
		montesMagn      0.421626
		montesFreq      3.70185
		montesSpiky     0.98219
		montesFraction  0.366883
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.146047
		hillsFraction   0.531206
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24542
		craterFreq      0.185027
		craterDensity   0.939641
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.577619
		volcanoTemp     1832.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.223, 0.163, 0.128, 0.000)
		colorShelf     (0.237, 0.173, 0.136, 0.000)
		colorBeach     (0.251, 0.183, 0.144, 0.000)
		colorDesert    (0.265, 0.193, 0.152, 0.000)
		colorLowland   (0.279, 0.203, 0.160, 0.000)
		colorUpland    (0.293, 0.213, 0.168, 0.000)
		colorRock      (0.306, 0.224, 0.176, 0.000)
		colorSnow      (0.320, 0.234, 0.184, 1.000)
		BumpHeight      6.43959
		BumpOffset      1.28792
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.630888
		GasToDust   0.25
		Particles   2254
		GasBright   0.16436
		DustBright  0.392848
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   59.8107
		Period          337.807
		Eccentricity    0.94764
		Inclination     66.4493
		AscendingNode   -154.453
		ArgOfPericenter 57.0077
		MeanAnomaly     -105.006
	}
}

Comet	"Ciutric 6"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            3.20407e-018
	Radius          0.0203186
	InertiaMoment   0.398789

	Oblateness      0.218566

	RotationPeriod  10.6723
	Obliquity       3.72592
	EqAscendNode    266.459
	Precession      0

	AbsMagn         7.05098
	SlopeParam      5.11154
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.518 0.457 0.401)

	Surface
	{
		SurfStyle       0.994124
		OceanStyle      0.486327
		Randomize      (0.141, -0.366, -0.177)
		colorDistMagn   0.942896
		colorDistFreq   2.76236e-007
		detailScale     0.554832
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0768509
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.492038
		terraceProb     0.129381
		erosion         0
		montesMagn      0.476884
		montesFreq      2.68506
		montesSpiky     0.997241
		montesFraction  0.659955
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.21739e-006
		hillsFraction   0.759674
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227983
		craterFreq      0.259522
		craterDensity   0.891892
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.452648
		volcanoTemp     1388.95
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.176, 0.160, 0.160, 0.050)
		colorShelf     (0.207, 0.187, 0.184, 0.040)
		colorBeach     (0.238, 0.215, 0.208, 0.030)
		colorDesert    (0.270, 0.242, 0.236, 0.020)
		colorLowland   (0.301, 0.270, 0.260, 0.030)
		colorUpland    (0.332, 0.297, 0.284, 0.050)
		colorRock      (0.363, 0.324, 0.317, 0.020)
		colorSnow      (0.363, 0.324, 0.317, 1.000)
		BumpHeight      0.0182867
		BumpOffset      0.00365734
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0855639
		DustBright  0.156131
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   52.1237
		Period          274.823
		Eccentricity    0.950788
		Inclination     4.34598
		AscendingNode   -114.288
		ArgOfPericenter 45.1986
		MeanAnomaly     84.9297
	}
}

Comet	"Ciutric 7"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            2.47812e-014
	Radius          0.442924
	InertiaMoment   0.39696

	Oblateness      0.249

	RotationPeriod  7.42395
	Obliquity       316.932
	EqAscendNode    251.036
	Precession      0

	AbsMagn         2.05117
	SlopeParam      5.85289
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.556 0.442 0.346)

	Surface
	{
		SurfStyle       0.68129
		OceanStyle      0.736933
		Randomize      (-0.009, 0.243, 0.257)
		colorDistMagn   0.773488
		colorDistFreq   7.72683e-005
		detailScale     12.0948
		colorConversion true
		snowLevel       2
		tropicLatitude  0.990021
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.267172
		terraceProb     0.173682
		erosion         0
		montesMagn      0.530686
		montesFreq      3.14366
		montesSpiky     0.971135
		montesFraction  0.520395
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000467456
		hillsFraction   0.837399
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.272374
		craterFreq      0.155634
		craterDensity   0.940372
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.522665
		volcanoTemp     1362.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.217, 0.150, 0.097, 0.000)
		colorShelf     (0.223, 0.155, 0.111, 0.000)
		colorBeach     (0.261, 0.181, 0.131, 0.000)
		colorDesert    (0.284, 0.194, 0.128, 0.000)
		colorLowland   (0.312, 0.208, 0.145, 0.000)
		colorUpland    (0.345, 0.252, 0.176, 0.000)
		colorRock      (0.373, 0.274, 0.190, 0.000)
		colorSnow      (0.406, 0.292, 0.201, 1.000)
		BumpHeight      0.398632
		BumpOffset      0.0797264
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.182523
		GasToDust   0.25
		Particles   1348
		GasBright   0.299958
		DustBright  0.426224
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   68.8789
		Period          417.474
		Eccentricity    0.963904
		Inclination     75.9942
		AscendingNode   93.1045
		ArgOfPericenter -108.785
		MeanAnomaly     37.5546
	}
}

Comet	"Ciutric 8"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            1.91664e-010
	Radius          7.94095
	InertiaMoment   0.399262

	Oblateness      0.249

	RotationPeriod  3.80645
	Obliquity       270.137
	EqAscendNode    235.613
	Precession      0

	AbsMagn         10.3691
	SlopeParam      7.02773
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.754 0.750 0.749)

	Surface
	{
		SurfStyle       0.552994
		OceanStyle      0.931674
		Randomize      (-0.835, -0.723, 0.254)
		colorDistMagn   0.209934
		colorDistFreq   0.00962631
		detailScale     216.841
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998151
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.380861
		terraceProb     0.42152
		erosion         0
		montesMagn      0.408302
		montesFreq      2.96857
		montesSpiky     0.906102
		montesFraction  0.463334
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.220099
		hillsFraction   0.701537
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255031
		craterFreq      0.183817
		craterDensity   1.02683
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.508404
		volcanoTemp     2022.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.294, 0.255, 0.210, 0.000)
		colorShelf     (0.301, 0.263, 0.240, 0.000)
		colorBeach     (0.354, 0.308, 0.284, 0.000)
		colorDesert    (0.384, 0.330, 0.277, 0.000)
		colorLowland   (0.422, 0.353, 0.314, 0.000)
		colorUpland    (0.467, 0.428, 0.382, 0.000)
		colorRock      (0.505, 0.465, 0.412, 0.000)
		colorSnow      (0.550, 0.495, 0.434, 1.000)
		BumpHeight      7.14685
		BumpOffset      1.42937
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.663714
		GasToDust   0.25
		Particles   2320
		GasBright   0.193879
		DustBright  0.216789
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   31.7808
		Period          130.842
		Eccentricity    0.863572
		Inclination     175.181
		AscendingNode   134.042
		ArgOfPericenter 71.7715
		MeanAnomaly     -107.491
	}
}

Comet	"Ciutric 9"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            5.90147e-018
	Radius          0.0274191
	InertiaMoment   0.397908

	Oblateness      0.00201219

	RotationPeriod  128.266
	Obliquity       223.343
	EqAscendNode    220.191
	Precession      0

	AbsMagn         6.83491
	SlopeParam      2.35715
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.693 0.690 0.688)

	Surface
	{
		SurfStyle       0.754577
		OceanStyle      0.930002
		Randomize      (-0.608, 0.444, -0.500)
		colorDistMagn   0.119916
		colorDistFreq   5.3184e-007
		detailScale     0.748724
		colorConversion true
		snowLevel       2
		tropicLatitude  0.540146
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.530701
		terraceProb     0.480293
		erosion         0
		montesMagn      0.478001
		montesFreq      3.4546
		montesSpiky     0.992178
		montesFraction  0.686858
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.57705e-006
		hillsFraction   0.664303
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.272952
		craterFreq      0.191971
		craterDensity   0.991211
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.564234
		volcanoTemp     1811.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.270, 0.235, 0.193, 0.000)
		colorShelf     (0.277, 0.242, 0.220, 0.000)
		colorBeach     (0.326, 0.283, 0.261, 0.000)
		colorDesert    (0.354, 0.304, 0.255, 0.000)
		colorLowland   (0.388, 0.324, 0.289, 0.000)
		colorUpland    (0.430, 0.394, 0.351, 0.000)
		colorRock      (0.465, 0.428, 0.378, 0.000)
		colorSnow      (0.506, 0.456, 0.399, 1.000)
		BumpHeight      0.0246772
		BumpOffset      0.00493544
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0278859
		DustBright  0.867269
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   62.8007
		Period          363.452
		Eccentricity    0.959509
		Inclination     70.3957
		AscendingNode   -157.546
		ArgOfPericenter -43.1359
		MeanAnomaly     -72.0314
	}
}

Comet	"Ciutric 10"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            4.56436e-014
	Radius          0.491871
	InertiaMoment   0.399696

	Oblateness      0.0019069

	RotationPeriod  114.215
	Obliquity       176.549
	EqAscendNode    204.768
	Precession      0

	AbsMagn         1.32856
	SlopeParam      3.05216
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.405 0.401 0.399)

	Surface
	{
		SurfStyle       0.707277
		OceanStyle      0.792242
		Randomize      (-0.484, 0.154, -0.036)
		colorDistMagn   0.844741
		colorDistFreq   0.000185327
		detailScale     13.4314
		colorConversion true
		snowLevel       2
		tropicLatitude  0.99998
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.55955
		terraceProb     0.102431
		erosion         0
		montesMagn      0.463717
		montesFreq      3.00147
		montesSpiky     0.972393
		montesFraction  0.50201
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00060808
		hillsFraction   0.420812
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262616
		craterFreq      0.17871
		craterDensity   1.04726
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.476954
		volcanoTemp     1451.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.158, 0.136, 0.112, 0.000)
		colorShelf     (0.162, 0.140, 0.128, 0.000)
		colorBeach     (0.190, 0.164, 0.152, 0.000)
		colorDesert    (0.206, 0.176, 0.148, 0.000)
		colorLowland   (0.227, 0.188, 0.168, 0.000)
		colorUpland    (0.251, 0.229, 0.203, 0.000)
		colorRock      (0.271, 0.249, 0.219, 0.000)
		colorSnow      (0.295, 0.265, 0.231, 1.000)
		BumpHeight      0.442684
		BumpOffset      0.0885368
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.215348
		GasToDust   0.25
		Particles   1414
		GasBright   0.0522821
		DustBright  0.527359
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   61.5348
		Period          352.518
		Eccentricity    0.970768
		Inclination     87.2347
		AscendingNode   -155.103
		ArgOfPericenter -106.319
		MeanAnomaly     -124.797
	}
}

Comet	"Ciutric 11"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            3.53022e-010
	Radius          10.71
	InertiaMoment   0.398531

	Oblateness      0.00293117

	RotationPeriod  106.197
	Obliquity       129.754
	EqAscendNode    189.346
	Precession      0

	AbsMagn         10.1248
	SlopeParam      3.64651
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.567 0.562 0.557)

	Surface
	{
		SurfStyle       0.977695
		OceanStyle      0.287629
		Randomize      (0.717, -0.326, -0.640)
		colorDistMagn   0.776548
		colorDistFreq   0.0529426
		detailScale     292.453
		colorConversion true
		snowLevel       2
		tropicLatitude  0.981474
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.272892
		terraceProb     0.234675
		erosion         0
		montesMagn      0.525297
		montesFreq      2.92624
		montesSpiky     0.958327
		montesFraction  0.605485
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.334722
		hillsFraction   0.649385
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254383
		craterFreq      0.191576
		craterDensity   0.909353
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.531861
		volcanoTemp     1394.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.193, 0.197, 0.223, 0.050)
		colorShelf     (0.227, 0.230, 0.256, 0.040)
		colorBeach     (0.261, 0.264, 0.290, 0.030)
		colorDesert    (0.295, 0.298, 0.329, 0.020)
		colorLowland   (0.329, 0.332, 0.362, 0.030)
		colorUpland    (0.363, 0.365, 0.396, 0.050)
		colorRock      (0.397, 0.399, 0.440, 0.020)
		colorSnow      (0.397, 0.399, 0.440, 1.000)
		BumpHeight      9.63896
		BumpOffset      1.92779
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.69654
		GasToDust   0.25
		Particles   2386
		GasBright   0.0394191
		DustBright  0.224709
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   57.2375
		Period          316.243
		Eccentricity    0.956104
		Inclination     106.47
		AscendingNode   -90.7995
		ArgOfPericenter 157.737
		MeanAnomaly     167.088
	}
}

Comet	"Ciutric 12"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            1.08698e-017
	Radius          0.030467
	InertiaMoment   0.39601

	Oblateness      0.00243229

	RotationPeriod  100.329
	Obliquity       82.9601
	EqAscendNode    173.923
	Precession      0

	AbsMagn         6.61538
	SlopeParam      4.2106
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.459 0.455 0.447)

	Surface
	{
		SurfStyle       0.648638
		OceanStyle      0.763851
		Randomize      (0.641, 0.884, -0.902)
		colorDistMagn   0.967983
		colorDistFreq   4.05992e-007
		detailScale     0.831951
		colorConversion true
		snowLevel       2
		tropicLatitude  0.886059
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.42238
		terraceProb     0.69844
		erosion         0
		montesMagn      0.378825
		montesFreq      3.02011
		montesSpiky     0.825166
		montesFraction  0.805491
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.17907e-006
		hillsFraction   0.751686
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259299
		craterFreq      0.22271
		craterDensity   0.91226
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.508518
		volcanoTemp     1566.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.179, 0.155, 0.125, 0.000)
		colorShelf     (0.184, 0.159, 0.143, 0.000)
		colorBeach     (0.216, 0.186, 0.170, 0.000)
		colorDesert    (0.234, 0.200, 0.165, 0.000)
		colorLowland   (0.257, 0.214, 0.188, 0.000)
		colorUpland    (0.285, 0.259, 0.228, 0.000)
		colorRock      (0.308, 0.282, 0.246, 0.000)
		colorSnow      (0.335, 0.300, 0.259, 1.000)
		BumpHeight      0.0274203
		BumpOffset      0.00548405
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.155927
		DustBright  0.592687
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   60.758
		Period          345.864
		Eccentricity    0.960326
		Inclination     123.409
		AscendingNode   129.867
		ArgOfPericenter -118.14
		MeanAnomaly     -161.318
	}
}

Comet	"Ciutric 13"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            8.407e-014
	Radius          0.663027
	InertiaMoment   0.399035

	Oblateness      0.00361101

	RotationPeriod  95.5926
	Obliquity       36.1658
	EqAscendNode    158.501
	Precession      0

	AbsMagn         0.28387
	SlopeParam      4.79233
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.589 0.584 0.582)

	Surface
	{
		SurfStyle       0.759959
		OceanStyle      0.655466
		Randomize      (-0.629, 0.585, 0.709)
		colorDistMagn   0.25155
		colorDistFreq   0.000245428
		detailScale     18.1051
		colorConversion true
		snowLevel       2
		tropicLatitude  0.805076
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.451737
		terraceProb     0.454853
		erosion         0
		montesMagn      0.644304
		montesFreq      3.14254
		montesSpiky     0.855807
		montesFraction  0.617705
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00095679
		hillsFraction   0.625294
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214585
		craterFreq      0.180688
		craterDensity   0.873106
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.468791
		volcanoTemp     1574.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.230, 0.199, 0.163, 0.000)
		colorShelf     (0.235, 0.204, 0.186, 0.000)
		colorBeach     (0.277, 0.239, 0.221, 0.000)
		colorDesert    (0.300, 0.257, 0.215, 0.000)
		colorLowland   (0.330, 0.275, 0.245, 0.000)
		colorUpland    (0.365, 0.333, 0.297, 0.000)
		colorRock      (0.394, 0.362, 0.320, 0.000)
		colorSnow      (0.430, 0.385, 0.338, 1.000)
		BumpHeight      0.596724
		BumpOffset      0.119345
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.248174
		GasToDust   0.25
		Particles   1481
		GasBright   0.115782
		DustBright  0.317319
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   64.5108
		Period          378.398
		Eccentricity    0.936595
		Inclination     -55.8382
		AscendingNode   73.3585
		ArgOfPericenter -116.346
		MeanAnomaly     -71.9983
	}
}

Comet	"Ciutric 14"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            6.50221e-010
	Radius          11.9071
	InertiaMoment   0.39751

	Oblateness      0.00293068

	RotationPeriod  91.5618
	Obliquity       349.372
	EqAscendNode    143.078
	Precession      0

	AbsMagn         9.8882
	SlopeParam      5.45203
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.562 0.554 0.550)

	Surface
	{
		SurfStyle       0.160592
		OceanStyle      0.590687
		Randomize      (-0.428, -0.389, 0.191)
		colorDistMagn   0.886403
		colorDistFreq   0.0761642
		detailScale     325.143
		colorConversion true
		snowLevel       2
		tropicLatitude  0.207319
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.37407
		terraceProb     0.245961
		erosion         0
		montesMagn      0.664788
		montesFreq      3.40502
		montesSpiky     0.929856
		montesFraction  0.447219
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.324528
		hillsFraction   0.841086
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240517
		craterFreq      0.189308
		craterDensity   0.923405
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.521821
		volcanoTemp     1109.09
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.225, 0.222, 0.220, 0.000)
		colorShelf     (0.239, 0.236, 0.234, 0.000)
		colorBeach     (0.253, 0.250, 0.247, 0.000)
		colorDesert    (0.267, 0.263, 0.261, 0.000)
		colorLowland   (0.281, 0.277, 0.275, 0.000)
		colorUpland    (0.295, 0.291, 0.289, 0.000)
		colorRock      (0.309, 0.305, 0.302, 0.000)
		colorSnow      (0.323, 0.319, 0.316, 1.000)
		BumpHeight      10.7164
		BumpOffset      2.14328
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.729366
		GasToDust   0.25
		Particles   2453
		GasBright   0.299481
		DustBright  0.618107
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   47.2317
		Period          237.056
		Eccentricity    0.911755
		Inclination     4.45858
		AscendingNode   96.392
		ArgOfPericenter 82.0656
		MeanAnomaly     75.1148
	}
}

Comet	"Ciutric 15"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            2.00208e-017
	Radius          0.0410472
	InertiaMoment   0.399484

	Oblateness      0.00425135

	RotationPeriod  88.0137
	Obliquity       302.577
	EqAscendNode    127.655
	Precession      0

	AbsMagn         6.39159
	SlopeParam      6.33169
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.817 0.782 0.770)

	Surface
	{
		SurfStyle       0.872356
		OceanStyle      0.918105
		Randomize      (0.652, 0.961, -0.863)
		colorDistMagn   0.494963
		colorDistFreq   9.63021e-007
		detailScale     1.12086
		colorConversion true
		snowLevel       2
		tropicLatitude  0.738737
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.601488
		terraceProb     0.25883
		erosion         0
		montesMagn      0.556416
		montesFreq      2.78359
		montesSpiky     0.906676
		montesFraction  0.416323
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.78311e-006
		hillsFraction   0.700441
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222792
		craterFreq      0.248681
		craterDensity   0.867834
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.581932
		volcanoTemp     1257.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.278, 0.274, 0.308, 0.050)
		colorShelf     (0.327, 0.321, 0.354, 0.040)
		colorBeach     (0.376, 0.368, 0.400, 0.030)
		colorDesert    (0.425, 0.414, 0.454, 0.020)
		colorLowland   (0.474, 0.461, 0.501, 0.030)
		colorUpland    (0.523, 0.508, 0.547, 0.050)
		colorRock      (0.572, 0.555, 0.608, 0.020)
		colorSnow      (0.572, 0.555, 0.608, 1.000)
		BumpHeight      0.0369425
		BumpOffset      0.0073885
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.232054
		DustBright  0.370021
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   84.3687
		Period          565.943
		Eccentricity    0.956265
		Inclination     -13.3802
		AscendingNode   140.363
		ArgOfPericenter -76.325
		MeanAnomaly     -132.32
	}
}

Comet	"Ciutric 16"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            1.54846e-013
	Radius          0.737533
	InertiaMoment   0.398244

	Oblateness      0.00341757

	RotationPeriod  84.8168
	Obliquity       255.783
	EqAscendNode    112.233
	Precession      0

	AbsMagn         19.8673
	SlopeParam      8.67078
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.809 0.737 0.660)

	Surface
	{
		SurfStyle       0.764723
		OceanStyle      0.367616
		Randomize      (-0.069, 0.835, 0.179)
		colorDistMagn   0.415511
		colorDistFreq   0.000279937
		detailScale     20.1396
		colorConversion true
		snowLevel       2
		tropicLatitude  0.565255
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.738472
		terraceProb     0.162343
		erosion         0
		montesMagn      0.611008
		montesFreq      3.06508
		montesSpiky     0.967776
		montesFraction  0.561195
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00126206
		hillsFraction   0.431212
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240145
		craterFreq      0.179879
		craterDensity   0.978694
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.508029
		volcanoTemp     1548.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.316, 0.251, 0.185, 0.000)
		colorShelf     (0.324, 0.258, 0.211, 0.000)
		colorBeach     (0.380, 0.302, 0.251, 0.000)
		colorDesert    (0.413, 0.324, 0.244, 0.000)
		colorLowland   (0.453, 0.346, 0.277, 0.000)
		colorUpland    (0.502, 0.420, 0.337, 0.000)
		colorRock      (0.542, 0.457, 0.363, 0.000)
		colorSnow      (0.591, 0.486, 0.383, 1.000)
		BumpHeight      0.66378
		BumpOffset      0.132756
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.281
		GasToDust   0.25
		Particles   1547
		GasBright   0.127367
		DustBright  0.159193
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   64.3683
		Period          377.146
		Eccentricity    0.927868
		Inclination     -79.6777
		AscendingNode   35.0317
		ArgOfPericenter -110.662
		MeanAnomaly     11.0571
	}
}

Comet	"Ciutric 17"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            1.19762e-009
	Radius          16.0341
	InertiaMoment   0.399909

	Oblateness      0.00490156

	RotationPeriod  81.8868
	Obliquity       208.989
	EqAscendNode    96.8102
	Precession      0

	AbsMagn         9.658
	SlopeParam      2.71929
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.578 0.575 0.572)

	Surface
	{
		SurfStyle       0.0489829
		OceanStyle      0.504448
		Randomize      (-0.848, -0.644, 0.855)
		colorDistMagn   0.508813
		colorDistFreq   0.111353
		detailScale     437.838
		colorConversion true
		snowLevel       2
		tropicLatitude  0.958277
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.418373
		terraceProb     0.522527
		erosion         0
		montesMagn      0.293076
		montesFreq      2.41124
		montesSpiky     0.971228
		montesFraction  0.533373
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.697701
		hillsFraction   0.614152
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241598
		craterFreq      0.195406
		craterDensity   0.909142
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.578429
		volcanoTemp     1571.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.231, 0.230, 0.229, 0.000)
		colorShelf     (0.246, 0.244, 0.243, 0.000)
		colorBeach     (0.260, 0.259, 0.257, 0.000)
		colorDesert    (0.275, 0.273, 0.272, 0.000)
		colorLowland   (0.289, 0.287, 0.286, 0.000)
		colorUpland    (0.304, 0.302, 0.300, 0.000)
		colorRock      (0.318, 0.316, 0.314, 0.000)
		colorSnow      (0.333, 0.331, 0.329, 1.000)
		BumpHeight      14.4307
		BumpOffset      2.88614
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.762192
		GasToDust   0.25
		Particles   2519
		GasBright   0.00270951
		DustBright  0.768338
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   63.155
		Period          366.532
		Eccentricity    0.960637
		Inclination     -97.2226
		AscendingNode   34.588
		ArgOfPericenter 81.8055
		MeanAnomaly     -68.888
	}
}

Comet	"Ciutric 18"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            3.68757e-017
	Radius          0.0456831
	InertiaMoment   0.398796

	Oblateness      0.00392274

	RotationPeriod  79.1656
	Obliquity       162.194
	EqAscendNode    81.3876
	Precession      0

	AbsMagn         6.16265
	SlopeParam      3.35241
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.665 0.662 0.659)

	Surface
	{
		SurfStyle       0.523
		OceanStyle      0.988756
		Randomize      (-0.688, 0.389, -0.656)
		colorDistMagn   0.84446
		colorDistFreq   9.8584e-007
		detailScale     1.24745
		colorConversion true
		snowLevel       2
		tropicLatitude  0.775817
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.577659
		terraceProb     0.238765
		erosion         0
		montesMagn      0.419961
		montesFreq      2.85788
		montesSpiky     0.970662
		montesFraction  0.455407
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.73346e-006
		hillsFraction   0.91871
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243792
		craterFreq      0.261968
		craterDensity   0.891824
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.548232
		volcanoTemp     1813.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.259, 0.225, 0.185, 0.000)
		colorShelf     (0.266, 0.232, 0.211, 0.000)
		colorBeach     (0.312, 0.271, 0.250, 0.000)
		colorDesert    (0.339, 0.291, 0.244, 0.000)
		colorLowland   (0.372, 0.311, 0.277, 0.000)
		colorUpland    (0.412, 0.377, 0.336, 0.000)
		colorRock      (0.445, 0.411, 0.363, 0.000)
		colorSnow      (0.485, 0.437, 0.382, 1.000)
		BumpHeight      0.0411148
		BumpOffset      0.00822297
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0284979
		DustBright  0.427036
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   52.7131
		Period          279.498
		Eccentricity    0.967238
		Inclination     63.9479
		AscendingNode   39.2279
		ArgOfPericenter -95.0527
		MeanAnomaly     27.8423
	}
}

Comet	"Ciutric 19"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            2.85207e-013
	Radius          0.992692
	InertiaMoment   0.396976

	Oblateness      0.00551904

	RotationPeriod  76.6118
	Obliquity       115.4
	EqAscendNode    65.965
	Precession      0

	AbsMagn         16.0327
	SlopeParam      3.9254
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.598 0.596 0.593)

	Surface
	{
		SurfStyle       0.414938
		OceanStyle      0.410124
		Randomize      (-0.588, -0.446, -0.107)
		colorDistMagn   0.62183
		colorDistFreq   0.000656961
		detailScale     27.1071
		colorConversion true
		snowLevel       2
		tropicLatitude  0.99935
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.507461
		terraceProb     0.385654
		erosion         0
		montesMagn      0.484185
		montesFreq      1.94934
		montesSpiky     0.939415
		montesFraction  0.633597
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00281719
		hillsFraction   0.52172
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246576
		craterFreq      0.140403
		craterDensity   0.847838
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.463012
		volcanoTemp     1883.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.239, 0.238, 0.237, 0.000)
		colorShelf     (0.254, 0.253, 0.252, 0.000)
		colorBeach     (0.269, 0.268, 0.267, 0.000)
		colorDesert    (0.284, 0.283, 0.282, 0.000)
		colorLowland   (0.299, 0.298, 0.297, 0.000)
		colorUpland    (0.314, 0.313, 0.311, 0.000)
		colorRock      (0.329, 0.328, 0.326, 0.000)
		colorSnow      (0.344, 0.342, 0.341, 1.000)
		BumpHeight      0.893423
		BumpOffset      0.178685
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.313826
		GasToDust   0.25
		Particles   1613
		GasBright   0.114311
		DustBright  0.82571
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   65.0352
		Period          383.022
		Eccentricity    0.956536
		Inclination     -27.5703
		AscendingNode   5.36021
		ArgOfPericenter 55.1969
		MeanAnomaly     -32.0522
	}
}

Comet	"Ciutric 20"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            2.20587e-009
	Radius          17.8538
	InertiaMoment   0.399267

	Oblateness      0.00446444

	RotationPeriod  74.1945
	Obliquity       68.6058
	EqAscendNode    50.5424
	Precession      0

	AbsMagn         9.43317
	SlopeParam      4.49222
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.797 0.795 0.794)

	Surface
	{
		SurfStyle       0.902533
		OceanStyle      0.212647
		Randomize      (-0.351, -0.630, 0.806)
		colorDistMagn   0.686391
		colorDistFreq   0.128124
		detailScale     487.526
		colorConversion true
		snowLevel       2
		tropicLatitude  0.874545
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.737232
		terraceProb     0.129599
		erosion         0
		montesMagn      0.591465
		montesFreq      3.24147
		montesSpiky     0.862959
		montesFraction  0.670571
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.764014
		hillsFraction   0.646077
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236284
		craterFreq      0.254036
		craterDensity   0.797285
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.507468
		volcanoTemp     1447.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.271, 0.278, 0.318, 0.050)
		colorShelf     (0.319, 0.326, 0.365, 0.040)
		colorBeach     (0.367, 0.374, 0.413, 0.030)
		colorDesert    (0.415, 0.422, 0.468, 0.020)
		colorLowland   (0.462, 0.469, 0.516, 0.030)
		colorUpland    (0.510, 0.517, 0.564, 0.050)
		colorRock      (0.558, 0.565, 0.627, 0.020)
		colorSnow      (0.558, 0.565, 0.627, 1.000)
		BumpHeight      16.0684
		BumpOffset      3.21368
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.795018
		GasToDust   0.25
		Particles   2585
		GasBright   0.112817
		DustBright  0.51169
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   46.3395
		Period          230.371
		Eccentricity    0.961496
		Inclination     7.62191
		AscendingNode   177.572
		ArgOfPericenter -144.148
		MeanAnomaly     -25.5279
	}
}

Comet	"Ciutric 21"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            6.79205e-017
	Radius          0.0614599
	InertiaMoment   0.397917

	Oblateness      0.0062682

	RotationPeriod  71.8899
	Obliquity       21.8115
	EqAscendNode    35.1198
	Precession      0

	AbsMagn         5.92753
	SlopeParam      5.10255
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.563 0.474 0.360)

	Surface
	{
		SurfStyle       0.261747
		OceanStyle      0.948989
		Randomize      (-0.167, 0.992, -0.572)
		colorDistMagn   0.728357
		colorDistFreq   3.34211e-006
		detailScale     1.67827
		colorConversion true
		snowLevel       2
		tropicLatitude  0.990644
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.714118
		terraceProb     0.626994
		erosion         0
		montesMagn      0.534904
		montesFreq      3.49132
		montesSpiky     0.985274
		montesFraction  0.594095
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.22002e-005
		hillsFraction   0.535777
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224526
		craterFreq      0.214044
		craterDensity   0.734151
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.471941
		volcanoTemp     1490.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.225, 0.189, 0.144, 0.000)
		colorShelf     (0.239, 0.201, 0.153, 0.000)
		colorBeach     (0.253, 0.213, 0.162, 0.000)
		colorDesert    (0.268, 0.225, 0.171, 0.000)
		colorLowland   (0.282, 0.237, 0.180, 0.000)
		colorUpland    (0.296, 0.249, 0.189, 0.000)
		colorRock      (0.310, 0.260, 0.198, 0.000)
		colorSnow      (0.324, 0.272, 0.207, 1.000)
		BumpHeight      0.0553139
		BumpOffset      0.0110628
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0740642
		DustBright  0.234929
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   66.9291
		Period          399.874
		Eccentricity    0.965881
		Inclination     113.812
		AscendingNode   -134.524
		ArgOfPericenter -25.1493
		MeanAnomaly     -78.3614
	}
}

Comet	"Ciutric 22"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            5.25317e-013
	Radius          1.10586
	InertiaMoment   0.399701

	Oblateness      0.00505923

	RotationPeriod  69.6794
	Obliquity       335.017
	EqAscendNode    19.6972
	Precession      0

	AbsMagn         14.8622
	SlopeParam      5.84107
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.781 0.745 0.729)

	Surface
	{
		SurfStyle       0.699989
		OceanStyle      0.995003
		Randomize      (0.500, 0.095, 0.950)
		colorDistMagn   0.999855
		colorDistFreq   6.95514e-005
		detailScale     30.1975
		colorConversion true
		snowLevel       2
		tropicLatitude  0.937748
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.32649
		terraceProb     0.45085
		erosion         0
		montesMagn      0.583078
		montesFreq      3.47536
		montesSpiky     0.949592
		montesFraction  0.519424
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00316206
		hillsFraction   0.896211
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241449
		craterFreq      0.231371
		craterDensity   1.01275
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.472987
		volcanoTemp     1393.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.305, 0.253, 0.204, 0.000)
		colorShelf     (0.312, 0.261, 0.233, 0.000)
		colorBeach     (0.367, 0.306, 0.277, 0.000)
		colorDesert    (0.398, 0.328, 0.270, 0.000)
		colorLowland   (0.437, 0.350, 0.306, 0.000)
		colorUpland    (0.484, 0.425, 0.372, 0.000)
		colorRock      (0.523, 0.462, 0.401, 0.000)
		colorSnow      (0.570, 0.492, 0.423, 1.000)
		BumpHeight      0.995278
		BumpOffset      0.199056
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.346652
		GasToDust   0.25
		Particles   1680
		GasBright   0.237044
		DustBright  0.556436
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   75.8411
		Period          482.345
		Eccentricity    0.964989
		Inclination     81.7972
		AscendingNode   58.569
		ArgOfPericenter 136.648
		MeanAnomaly     133.008
	}
}

Comet	"Ciutric 23"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            4.06294e-009
	Radius          24.0092
	InertiaMoment   0.398537

	Oblateness      0.00709225

	RotationPeriod  67.5477
	Obliquity       288.223
	EqAscendNode    4.27464
	Precession      0

	AbsMagn         9.21278
	SlopeParam      7.00368
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.806 0.746 0.684)

	Surface
	{
		SurfStyle       0.653373
		OceanStyle      0.450619
		Randomize      (-0.576, 0.151, -0.955)
		colorDistMagn   0.919446
		colorDistFreq   0.461377
		detailScale     655.61
		colorConversion true
		snowLevel       2
		tropicLatitude  0.991985
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.427719
		terraceProb     0.658221
		erosion         0
		montesMagn      0.580804
		montesFreq      2.93379
		montesSpiky     0.990813
		montesFraction  0.482201
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.31812
		hillsFraction   0.477618
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220656
		craterFreq      0.217852
		craterDensity   1.06307
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.538923
		volcanoTemp     1740.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.314, 0.254, 0.192, 0.000)
		colorShelf     (0.322, 0.261, 0.219, 0.000)
		colorBeach     (0.379, 0.306, 0.260, 0.000)
		colorDesert    (0.411, 0.328, 0.253, 0.000)
		colorLowland   (0.451, 0.350, 0.287, 0.000)
		colorUpland    (0.500, 0.425, 0.349, 0.000)
		colorRock      (0.540, 0.462, 0.376, 0.000)
		colorSnow      (0.588, 0.492, 0.397, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.827844
		GasToDust   0.25
		Particles   2652
		GasBright   0.17101
		DustBright  0.306957
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   70.6721
		Period          433.883
		Eccentricity    0.924176
		Inclination     -166.324
		AscendingNode   142.217
		ArgOfPericenter -111.178
		MeanAnomaly     -48.9223
	}
}

Comet	"Ciutric 24"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            1.25101e-016
	Radius          0.0684972
	InertiaMoment   0.396048

	Oblateness      0.00563851

	RotationPeriod  65.4826
	Obliquity       241.429
	EqAscendNode    348.852
	Precession      0

	AbsMagn         5.68501
	SlopeParam      2.34631
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.801 0.769 0.752)

	Surface
	{
		SurfStyle       0.183973
		OceanStyle      0.334793
		Randomize      (0.101, -0.039, 0.673)
		colorDistMagn   0.699872
		colorDistFreq   1.57139e-006
		detailScale     1.87043
		colorConversion true
		snowLevel       2
		tropicLatitude  0.911105
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.452062
		terraceProb     0.121122
		erosion         0
		montesMagn      0.596891
		montesFreq      3.43289
		montesSpiky     0.999568
		montesFraction  0.684465
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.75767e-005
		hillsFraction   0.731787
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261573
		craterFreq      0.21781
		craterDensity   1.05291
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.414132
		volcanoTemp     1320.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.321, 0.307, 0.301, 0.000)
		colorShelf     (0.341, 0.327, 0.320, 0.000)
		colorBeach     (0.361, 0.346, 0.338, 0.000)
		colorDesert    (0.381, 0.365, 0.357, 0.000)
		colorLowland   (0.401, 0.384, 0.376, 0.000)
		colorUpland    (0.421, 0.403, 0.395, 0.000)
		colorRock      (0.441, 0.423, 0.414, 0.000)
		colorSnow      (0.461, 0.442, 0.432, 1.000)
		BumpHeight      0.0616475
		BumpOffset      0.0123295
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.40118
		DustBright  0.561273
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   46.2415
		Period          229.641
		Eccentricity    0.90086
		Inclination     76.4213
		AscendingNode   -52.0948
		ArgOfPericenter 134.025
		MeanAnomaly     -43.5408
	}
}

Comet	"Ciutric 25"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            9.67567e-013
	Radius          1.48652
	InertiaMoment   0.399041

	Oblateness      0.0080201

	RotationPeriod  63.4734
	Obliquity       194.634
	EqAscendNode    333.429
	Precession      0

	AbsMagn         14.0904
	SlopeParam      3.04352
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.525 0.459 0.365)

	Surface
	{
		SurfStyle       0.971825
		OceanStyle      0.758421
		Randomize      (-0.418, 0.947, 0.382)
		colorDistMagn   0.217953
		colorDistFreq   0.0017529
		detailScale     40.5918
		colorConversion true
		snowLevel       2
		tropicLatitude  0.253064
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.545627
		terraceProb     0.520344
		erosion         0
		montesMagn      0.538252
		montesFreq      2.99819
		montesSpiky     0.990381
		montesFraction  0.576789
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00541887
		hillsFraction   0.685074
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264878
		craterFreq      0.223058
		craterDensity   1.01006
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.525821
		volcanoTemp     1141.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.179, 0.161, 0.146, 0.050)
		colorShelf     (0.210, 0.188, 0.168, 0.040)
		colorBeach     (0.242, 0.216, 0.190, 0.030)
		colorDesert    (0.273, 0.243, 0.216, 0.020)
		colorLowland   (0.305, 0.271, 0.238, 0.030)
		colorUpland    (0.336, 0.298, 0.259, 0.050)
		colorRock      (0.368, 0.326, 0.289, 0.020)
		colorSnow      (0.368, 0.326, 0.289, 1.000)
		BumpHeight      1.33787
		BumpOffset      0.267573
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.379478
		GasToDust   0.25
		Particles   1746
		GasBright   0.307863
		DustBright  0.339077
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   51.5042
		Period          269.938
		Eccentricity    0.968382
		Inclination     179.872
		AscendingNode   100.865
		ArgOfPericenter -12.0784
		MeanAnomaly     124.741
	}
}

Comet	"Ciutric 26"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            7.48342e-009
	Radius          26.7696
	InertiaMoment   0.397521

	Oblateness      0.0064117

	RotationPeriod  61.5113
	Obliquity       147.84
	EqAscendNode    318.007
	Precession      0

	AbsMagn         8.99601
	SlopeParam      3.63867
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.790 0.687 0.641)

	Surface
	{
		SurfStyle       0.657648
		OceanStyle      0.950659
		Randomize      (-0.349, 0.057, 0.646)
		colorDistMagn   0.339434
		colorDistFreq   0.230198
		detailScale     730.988
		colorConversion true
		snowLevel       2
		tropicLatitude  0.439821
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.404827
		terraceProb     0.268616
		erosion         0
		montesMagn      0.528947
		montesFreq      3.12984
		montesSpiky     0.984703
		montesFraction  0.471729
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.56494
		hillsFraction   0.553824
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.288203
		craterFreq      0.241818
		craterDensity   0.875723
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.466393
		volcanoTemp     1448.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.308, 0.234, 0.179, 0.000)
		colorShelf     (0.316, 0.241, 0.205, 0.000)
		colorBeach     (0.371, 0.282, 0.243, 0.000)
		colorDesert    (0.403, 0.302, 0.237, 0.000)
		colorLowland   (0.442, 0.323, 0.269, 0.000)
		colorUpland    (0.490, 0.392, 0.327, 0.000)
		colorRock      (0.529, 0.426, 0.352, 0.000)
		colorSnow      (0.577, 0.454, 0.372, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.86067
		GasToDust   0.25
		Particles   2718
		GasBright   0.0115739
		DustBright  0.319852
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   46.1804
		Period          229.185
		Eccentricity    0.913688
		Inclination     -55.2354
		AscendingNode   -161.788
		ArgOfPericenter 173.717
		MeanAnomaly     -20.8219
	}
}

Comet	"Ciutric 27"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            2.3042e-016
	Radius          0.0920385
	InertiaMoment   0.39949

	Oblateness      0.00908503

	RotationPeriod  59.5886
	Obliquity       101.046
	EqAscendNode    302.584
	Precession      0

	AbsMagn         5.43366
	SlopeParam      4.20285
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.611 0.603 0.599)

	Surface
	{
		SurfStyle       0.863895
		OceanStyle      0.465981
		Randomize      (0.385, -0.442, 0.513)
		colorDistMagn   0.55835
		colorDistFreq   9.00635e-007
		detailScale     2.51326
		colorConversion true
		snowLevel       2
		tropicLatitude  0.636106
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.334395
		terraceProb     0.16199
		erosion         0
		montesMagn      0.456717
		montesFreq      3.10271
		montesSpiky     0.936561
		montesFraction  0.437706
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.74903e-005
		hillsFraction   0.916799
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241114
		craterFreq      0.2648
		craterDensity   1.08262
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.478921
		volcanoTemp     1289.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.208, 0.211, 0.240, 0.050)
		colorShelf     (0.244, 0.247, 0.276, 0.040)
		colorBeach     (0.281, 0.283, 0.312, 0.030)
		colorDesert    (0.317, 0.320, 0.354, 0.020)
		colorLowland   (0.354, 0.356, 0.390, 0.030)
		colorUpland    (0.391, 0.392, 0.426, 0.050)
		colorRock      (0.427, 0.428, 0.474, 0.020)
		colorSnow      (0.427, 0.428, 0.474, 1.000)
		BumpHeight      0.0828346
		BumpOffset      0.0165669
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0766686
		DustBright  0.739244
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   57.4044
		Period          317.628
		Eccentricity    0.950753
		Inclination     136.424
		AscendingNode   -159.283
		ArgOfPericenter 133.921
		MeanAnomaly     47.3267
	}
}

Comet	"Ciutric 28"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            1.78214e-012
	Radius          1.6581
	InertiaMoment   0.398252

	Oblateness      0.00729139

	RotationPeriod  57.6985
	Obliquity       54.2514
	EqAscendNode    287.162
	Precession      0

	AbsMagn         13.4956
	SlopeParam      4.78399
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.601 0.598 0.596)

	Surface
	{
		SurfStyle       0.383133
		OceanStyle      0.215034
		Randomize      (-0.288, -0.945, -0.955)
		colorDistMagn   0.577174
		colorDistFreq   0.00223644
		detailScale     45.2771
		colorConversion true
		snowLevel       2
		tropicLatitude  0.783704
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.513946
		terraceProb     0.599471
		erosion         0
		montesMagn      0.594273
		montesFreq      2.68
		montesSpiky     0.985163
		montesFraction  0.718053
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00513791
		hillsFraction   0.745547
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256986
		craterFreq      0.232527
		craterDensity   0.797945
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.542905
		volcanoTemp     1401.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.240, 0.239, 0.239, 0.000)
		colorShelf     (0.255, 0.254, 0.253, 0.000)
		colorBeach     (0.270, 0.269, 0.268, 0.000)
		colorDesert    (0.285, 0.284, 0.283, 0.000)
		colorLowland   (0.300, 0.299, 0.298, 0.000)
		colorUpland    (0.316, 0.314, 0.313, 0.000)
		colorRock      (0.331, 0.329, 0.328, 0.000)
		colorSnow      (0.346, 0.344, 0.343, 1.000)
		BumpHeight      1.49229
		BumpOffset      0.298457
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.412304
		GasToDust   0.25
		Particles   1812
		GasBright   0.0765671
		DustBright  0.423832
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   65.1822
		Period          384.321
		Eccentricity    0.935561
		Inclination     -10.2516
		AscendingNode   71.3327
		ArgOfPericenter -110.044
		MeanAnomaly     59.7461
	}
}

Comet	"Ciutric 29"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            1.37835e-008
	Radius          35.9564
	InertiaMoment   0.399914

	Oblateness      0.0103304

	RotationPeriod  55.8347
	Obliquity       7.45709
	EqAscendNode    271.739
	Precession      0

	AbsMagn         8.78214
	SlopeParam      5.442
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.776 0.772 0.770)

	Surface
	{
		SurfStyle       0.692188
		OceanStyle      0.670083
		Randomize      (-0.623, 0.925, -0.788)
		colorDistMagn   0.576807
		colorDistFreq   0.521245
		detailScale     981.849
		colorConversion true
		snowLevel       2
		tropicLatitude  0.928997
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.280622
		terraceProb     0.27306
		erosion         0
		montesMagn      0.516922
		montesFreq      3.22214
		montesSpiky     0.813055
		montesFraction  0.633223
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.61799
		hillsFraction   0.51915
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.196357
		craterFreq      0.237009
		craterDensity   0.911534
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.552441
		volcanoTemp     1888.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.303, 0.262, 0.215, 0.000)
		colorShelf     (0.310, 0.270, 0.246, 0.000)
		colorBeach     (0.365, 0.316, 0.292, 0.000)
		colorDesert    (0.396, 0.340, 0.285, 0.000)
		colorLowland   (0.434, 0.363, 0.323, 0.000)
		colorUpland    (0.481, 0.440, 0.392, 0.000)
		colorRock      (0.520, 0.478, 0.423, 0.000)
		colorSnow      (0.566, 0.509, 0.446, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.893496
		GasToDust   0.25
		Particles   2784
		GasBright   0.208852
		DustBright  0.776034
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   56.4591
		Period          309.815
		Eccentricity    0.929128
		Inclination     61.1067
		AscendingNode   -16.3962
		ArgOfPericenter 130.252
		MeanAnomaly     -141.102
	}
}

Comet	"Ciutric 30"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            4.24406e-016
	Radius          0.102701
	InertiaMoment   0.398802

	Oblateness      0.00832608

	RotationPeriod  53.9916
	Obliquity       320.663
	EqAscendNode    256.316
	Precession      0

	AbsMagn         5.17174
	SlopeParam      6.31654
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.656 0.654 0.650)

	Surface
	{
		SurfStyle       0.556265
		OceanStyle      0.985257
		Randomize      (0.033, -0.952, 0.570)
		colorDistMagn   0.964392
		colorDistFreq   7.0029e-006
		detailScale     2.80443
		colorConversion true
		snowLevel       2
		tropicLatitude  0.646411
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.381733
		terraceProb     0.356215
		erosion         0
		montesMagn      0.472802
		montesFreq      1.50777
		montesSpiky     0.838378
		montesFraction  0.777292
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.59092e-005
		hillsFraction   0.558253
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.288699
		craterFreq      0.220628
		craterDensity   1.03443
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.448634
		volcanoTemp     1658.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.256, 0.222, 0.182, 0.000)
		colorShelf     (0.263, 0.229, 0.208, 0.000)
		colorBeach     (0.309, 0.268, 0.247, 0.000)
		colorDesert    (0.335, 0.288, 0.241, 0.000)
		colorLowland   (0.368, 0.307, 0.273, 0.000)
		colorUpland    (0.407, 0.373, 0.332, 0.000)
		colorRock      (0.440, 0.405, 0.358, 0.000)
		colorSnow      (0.479, 0.431, 0.377, 1.000)
		BumpHeight      0.0924313
		BumpOffset      0.0184863
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.181469
		DustBright  0.487904
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   51.0874
		Period          266.668
		Eccentricity    0.907234
		Inclination     172.773
		AscendingNode   -86.9129
		ArgOfPericenter -142.572
		MeanAnomaly     76.3668
	}
}

Comet	"Ciutric 31"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            3.28247e-012
	Radius          2.22633
	InertiaMoment   0.396993

	Oblateness      0.0116686

	RotationPeriod  52.1642
	Obliquity       273.868
	EqAscendNode    240.894
	Precession      0

	AbsMagn         13.0023
	SlopeParam      8.56021
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.703 0.652 0.587)

	Surface
	{
		SurfStyle       0.586751
		OceanStyle      0.429987
		Randomize      (0.256, -0.411, -0.469)
		colorDistMagn   0.883085
		colorDistFreq   0.00238361
		detailScale     60.7935
		colorConversion true
		snowLevel       2
		tropicLatitude  0.63763
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.40077
		terraceProb     0.402008
		erosion         0
		montesMagn      0.521091
		montesFreq      2.70196
		montesSpiky     0.866553
		montesFraction  0.766516
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0133653
		hillsFraction   0.614322
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253576
		craterFreq      0.263869
		craterDensity   0.922422
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50461
		volcanoTemp     1524.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.274, 0.222, 0.164, 0.000)
		colorShelf     (0.281, 0.228, 0.188, 0.000)
		colorBeach     (0.331, 0.267, 0.223, 0.000)
		colorDesert    (0.359, 0.287, 0.217, 0.000)
		colorLowland   (0.394, 0.306, 0.247, 0.000)
		colorUpland    (0.436, 0.372, 0.299, 0.000)
		colorRock      (0.471, 0.404, 0.323, 0.000)
		colorSnow      (0.514, 0.430, 0.340, 1.000)
		BumpHeight      2.00369
		BumpOffset      0.400739
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.44513
		GasToDust   0.25
		Particles   1879
		GasBright   0.116826
		DustBright  0.237033
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   49.4704
		Period          254.108
		Eccentricity    0.955881
		Inclination     -74.4727
		AscendingNode   34.9016
		ArgOfPericenter 15.2154
		MeanAnomaly     86.5221
	}
}

Comet	"Ciutric 32"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            2.53875e-008
	Radius          40.1367
	InertiaMoment   0.399273

	Oblateness      0.00957107

	RotationPeriod  50.3474
	Obliquity       227.074
	EqAscendNode    225.471
	Precession      0

	AbsMagn         8.57047
	SlopeParam      2.7098
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.630 0.627 0.621)

	Surface
	{
		SurfStyle       0.587716
		OceanStyle      0.846926
		Randomize      (0.545, -0.924, -0.893)
		colorDistMagn   0.971346
		colorDistFreq   0.835144
		detailScale     1096
		colorConversion true
		snowLevel       2
		tropicLatitude  0.876701
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.59507
		terraceProb     0.13364
		erosion         0
		montesMagn      0.378605
		montesFreq      2.36559
		montesSpiky     0.874408
		montesFraction  0.571139
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.34324
		hillsFraction   0.628584
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23169
		craterFreq      0.232856
		craterDensity   1.05024
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.482517
		volcanoTemp     1240.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.246, 0.213, 0.174, 0.000)
		colorShelf     (0.252, 0.219, 0.199, 0.000)
		colorBeach     (0.296, 0.257, 0.236, 0.000)
		colorDesert    (0.321, 0.276, 0.230, 0.000)
		colorLowland   (0.353, 0.295, 0.261, 0.000)
		colorUpland    (0.391, 0.357, 0.317, 0.000)
		colorRock      (0.422, 0.389, 0.342, 0.000)
		colorSnow      (0.460, 0.414, 0.360, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.926322
		GasToDust   0.25
		Particles   2851
		GasBright   0.326278
		DustBright  0.512068
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   46.7503
		Period          233.441
		Eccentricity    0.921497
		Inclination     -14.9547
		AscendingNode   -159.462
		ArgOfPericenter 5.7217
		MeanAnomaly     -165.244
	}
}

Comet	"Ciutric 33"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            7.817e-016
	Radius          0.13785
	InertiaMoment   0.397926

	Oblateness      0.0134822

	RotationPeriod  48.5366
	Obliquity       180.28
	EqAscendNode    210.049
	Precession      0

	AbsMagn         4.89709
	SlopeParam      3.34428
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.421 0.419 0.416)

	Surface
	{
		SurfStyle       0.100848
		OceanStyle      0.416479
		Randomize      (-0.197, 0.647, 0.612)
		colorDistMagn   0.991512
		colorDistFreq   1.55755e-005
		detailScale     3.76423
		colorConversion true
		snowLevel       2
		tropicLatitude  0.991062
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.63468
		terraceProb     0.352761
		erosion         0
		montesMagn      0.569148
		montesFreq      2.25503
		montesSpiky     0.980546
		montesFraction  0.446035
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.51773e-005
		hillsFraction   0.588059
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.27234
		craterFreq      0.252242
		craterDensity   0.837162
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.561047
		volcanoTemp     1361.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.168, 0.168, 0.166, 0.000)
		colorShelf     (0.179, 0.178, 0.177, 0.000)
		colorBeach     (0.189, 0.189, 0.187, 0.000)
		colorDesert    (0.200, 0.199, 0.198, 0.000)
		colorLowland   (0.210, 0.209, 0.208, 0.000)
		colorUpland    (0.221, 0.220, 0.218, 0.000)
		colorRock      (0.232, 0.230, 0.229, 0.000)
		colorSnow      (0.242, 0.241, 0.239, 1.000)
		BumpHeight      0.124065
		BumpOffset      0.024813
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.234353
		DustBright  0.288479
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   48.2475
		Period          244.745
		Eccentricity    0.927773
		Inclination     -82.2991
		AscendingNode   97.0506
		ArgOfPericenter 17.6781
		MeanAnomaly     -11.5893
	}
}

Comet	"Ciutric 34"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            6.0459e-012
	Radius          2.48602
	InertiaMoment   0.399706

	Oblateness      0.0111053

	RotationPeriod  46.7272
	Obliquity       133.486
	EqAscendNode    194.626
	Precession      0

	AbsMagn         12.5752
	SlopeParam      3.91768
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.747 0.741 0.739)

	Surface
	{
		SurfStyle       0.646632
		OceanStyle      0.887302
		Randomize      (-0.034, -0.098, 0.252)
		colorDistMagn   0.264827
		colorDistFreq   0.000584178
		detailScale     67.8849
		colorConversion true
		snowLevel       2
		tropicLatitude  0.994144
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.742369
		terraceProb     0.461955
		erosion         0
		montesMagn      0.638817
		montesFreq      3.3723
		montesSpiky     0.932243
		montesFraction  0.508297
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0135422
		hillsFraction   0.513723
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.206318
		craterFreq      0.223207
		craterDensity   0.837459
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.479999
		volcanoTemp     1687.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.291, 0.252, 0.207, 0.000)
		colorShelf     (0.299, 0.259, 0.237, 0.000)
		colorBeach     (0.351, 0.304, 0.281, 0.000)
		colorDesert    (0.381, 0.326, 0.273, 0.000)
		colorLowland   (0.418, 0.348, 0.310, 0.000)
		colorUpland    (0.463, 0.423, 0.377, 0.000)
		colorRock      (0.500, 0.460, 0.407, 0.000)
		colorSnow      (0.545, 0.489, 0.429, 1.000)
		BumpHeight      2.23742
		BumpOffset      0.447484
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.477956
		GasToDust   0.25
		Particles   1945
		GasBright   0.00150998
		DustBright  0.205809
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   64.8885
		Period          381.727
		Eccentricity    0.943495
		Inclination     -38.5916
		AscendingNode   -18.2434
		ArgOfPericenter -143.716
		MeanAnomaly     -11.4683
	}
}

Comet	"Ciutric 35"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            4.67606e-008
	Radius          53.8559
	InertiaMoment   0.398544

	Oblateness      0.0157315

	RotationPeriod  44.9145
	Obliquity       86.6913
	EqAscendNode    179.204
	Precession      0

	AbsMagn         8.3604
	SlopeParam      4.48427
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.699 0.695 0.690)

	Surface
	{
		SurfStyle       0.358196
		OceanStyle      0.223473
		Randomize      (-0.541, 0.517, -0.191)
		colorDistMagn   0.300571
		colorDistFreq   1.59636
		detailScale     1470.62
		colorConversion true
		snowLevel       2
		tropicLatitude  0.986219
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.431732
		terraceProb     0.316256
		erosion         0
		montesMagn      0.60524
		montesFreq      3.07271
		montesSpiky     0.865802
		montesFraction  0.665006
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.37146
		hillsFraction   0.480616
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234304
		craterFreq      0.2321
		craterDensity   0.902606
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.545246
		volcanoTemp     1637.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.280, 0.278, 0.276, 0.000)
		colorShelf     (0.297, 0.296, 0.293, 0.000)
		colorBeach     (0.315, 0.313, 0.311, 0.000)
		colorDesert    (0.332, 0.330, 0.328, 0.000)
		colorLowland   (0.350, 0.348, 0.345, 0.000)
		colorUpland    (0.367, 0.365, 0.362, 0.000)
		colorRock      (0.385, 0.383, 0.380, 0.000)
		colorSnow      (0.402, 0.400, 0.397, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.959148
		GasToDust   0.25
		Particles   2917
		GasBright   0.0458865
		DustBright  0.645919
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   62.7166
		Period          362.722
		Eccentricity    0.954494
		Inclination     167.129
		AscendingNode   175.569
		ArgOfPericenter 175.28
		MeanAnomaly     150.561
	}
}

Comet	"Ciutric 36"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            1.4398e-015
	Radius          0.153981
	InertiaMoment   0.396084

	Oblateness      0.0128524

	RotationPeriod  43.094
	Obliquity       39.897
	EqAscendNode    163.781
	Precession      0

	AbsMagn         4.60696
	SlopeParam      5.09358
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.689 0.596 0.540)

	Surface
	{
		SurfStyle       0.0684909
		OceanStyle      0.00814985
		Randomize      (0.456, 0.562, 0.284)
		colorDistMagn   0.881875
		colorDistFreq   4.30492e-006
		detailScale     4.2047
		colorConversion true
		snowLevel       2
		tropicLatitude  0.780152
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.354788
		terraceProb     0.206297
		erosion         0
		montesMagn      0.413945
		montesFreq      3.20869
		montesSpiky     0.922394
		montesFraction  0.323364
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.63364e-005
		hillsFraction   0.66511
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240193
		craterFreq      0.251
		craterDensity   0.798592
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.41853
		volcanoTemp     1745.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.276, 0.238, 0.216, 0.000)
		colorShelf     (0.293, 0.253, 0.229, 0.000)
		colorBeach     (0.310, 0.268, 0.243, 0.000)
		colorDesert    (0.327, 0.283, 0.256, 0.000)
		colorLowland   (0.345, 0.298, 0.270, 0.000)
		colorUpland    (0.362, 0.313, 0.283, 0.000)
		colorRock      (0.379, 0.328, 0.297, 0.000)
		colorSnow      (0.396, 0.343, 0.310, 1.000)
		BumpHeight      0.138583
		BumpOffset      0.0277165
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0295897
		GasToDust   0.25
		Particles   1039
		GasBright   0.0471772
		DustBright  0.329115
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   48.5992
		Period          247.425
		Eccentricity    0.923803
		Inclination     156.668
		AscendingNode   108.088
		ArgOfPericenter -138.127
		MeanAnomaly     12.1065
	}
}

Comet	"Ciutric 37"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            1.11358e-011
	Radius          3.33476
	InertiaMoment   0.399047

	Oblateness      0.0186183

	RotationPeriod  41.2608
	Obliquity       353.103
	EqAscendNode    148.358
	Precession      0

	AbsMagn         12.1947
	SlopeParam      5.82932
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.606 0.549 0.459)

	Surface
	{
		SurfStyle       0.00186094
		OceanStyle      0.812013
		Randomize      (-0.195, 0.135, -0.139)
		colorDistMagn   0.165078
		colorDistFreq   0.00796506
		detailScale     91.0611
		colorConversion true
		snowLevel       2
		tropicLatitude  0.797219
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.465294
		terraceProb     0.100896
		erosion         0
		montesMagn      0.48956
		montesFreq      2.98454
		montesSpiky     0.997108
		montesFraction  0.827104
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0216063
		hillsFraction   0.84623
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214141
		craterFreq      0.277918
		craterDensity   0.984829
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.584348
		volcanoTemp     1387.32
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.242, 0.219, 0.184, 0.000)
		colorShelf     (0.257, 0.233, 0.195, 0.000)
		colorBeach     (0.273, 0.247, 0.207, 0.000)
		colorDesert    (0.288, 0.261, 0.218, 0.000)
		colorLowland   (0.303, 0.274, 0.230, 0.000)
		colorUpland    (0.318, 0.288, 0.241, 0.000)
		colorRock      (0.333, 0.302, 0.253, 0.000)
		colorSnow      (0.348, 0.316, 0.264, 1.000)
		BumpHeight      3.00128
		BumpOffset      0.600256
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.510782
		GasToDust   0.25
		Particles   2011
		GasBright   0.158744
		DustBright  0.702035
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   55.0348
		Period          298.165
		Eccentricity    0.934334
		Inclination     -47.6199
		AscendingNode   -42.4295
		ArgOfPericenter -24.8636
		MeanAnomaly     -24.1015
	}
}

Comet	"Ciutric 38"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            8.61273e-008
	Radius          60.1764
	InertiaMoment   0.397532

	Oblateness      0.0154171

	RotationPeriod  39.41
	Obliquity       306.308
	EqAscendNode    132.936
	Precession      0

	AbsMagn         8.15131
	SlopeParam      6.98005
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.406 0.403 0.399)

	Surface
	{
		SurfStyle       0.132169
		OceanStyle      0.0305972
		Randomize      (0.208, -0.834, 0.040)
		colorDistMagn   0.622053
		colorDistFreq   0.422932
		detailScale     1643.22
		colorConversion true
		snowLevel       2
		tropicLatitude  0.99777
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.329143
		terraceProb     0.177858
		erosion         0
		montesMagn      0.658291
		montesFreq      2.88929
		montesSpiky     0.895579
		montesFraction  0.321967
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.86031
		hillsFraction   0.72329
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.290325
		craterFreq      0.211176
		craterDensity   0.920801
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.498038
		volcanoTemp     1573.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.162, 0.161, 0.160, 0.000)
		colorShelf     (0.172, 0.171, 0.170, 0.000)
		colorBeach     (0.183, 0.181, 0.180, 0.000)
		colorDesert    (0.193, 0.192, 0.190, 0.000)
		colorLowland   (0.203, 0.202, 0.200, 0.000)
		colorUpland    (0.213, 0.212, 0.210, 0.000)
		colorRock      (0.223, 0.222, 0.220, 0.000)
		colorSnow      (0.233, 0.232, 0.230, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.991974
		GasToDust   0.25
		Particles   2983
		GasBright   0.132753
		DustBright  0.412513
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   62.1877
		Period          358.144
		Eccentricity    0.944662
		Inclination     -95.5782
		AscendingNode   98.9161
		ArgOfPericenter -111.488
		MeanAnomaly     66.0763
	}
}

Comet	"Ciutric 39"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            2.65193e-015
	Radius          0.206491
	InertiaMoment   0.399495

	Oblateness      0.0224654

	RotationPeriod  37.5362
	Obliquity       259.514
	EqAscendNode    117.513
	Precession      0

	AbsMagn         4.29777
	SlopeParam      2.33542
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.520 0.516 0.509)

	Surface
	{
		SurfStyle       0.279396
		OceanStyle      0.373904
		Randomize      (-0.581, 0.136, 0.427)
		colorDistMagn   0.311064
		colorDistFreq   3.23969e-005
		detailScale     5.63858
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998226
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.738693
		terraceProb     0.50787
		erosion         0
		montesMagn      0.571621
		montesFreq      3.5056
		montesSpiky     0.929527
		montesFraction  0.792296
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000114088
		hillsFraction   0.776296
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261531
		craterFreq      0.235704
		craterDensity   0.958979
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.486451
		volcanoTemp     1456.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.208, 0.206, 0.203, 0.000)
		colorShelf     (0.221, 0.219, 0.216, 0.000)
		colorBeach     (0.234, 0.232, 0.229, 0.000)
		colorDesert    (0.247, 0.245, 0.242, 0.000)
		colorLowland   (0.260, 0.258, 0.254, 0.000)
		colorUpland    (0.273, 0.271, 0.267, 0.000)
		colorRock      (0.286, 0.284, 0.280, 0.000)
		colorSnow      (0.299, 0.297, 0.292, 1.000)
		BumpHeight      0.185842
		BumpOffset      0.0371684
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0624157
		GasToDust   0.25
		Particles   1105
		GasBright   0.0695021
		DustBright  0.16025
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   57.8397
		Period          321.248
		Eccentricity    0.945465
		Inclination     -8.8373
		AscendingNode   142.777
		ArgOfPericenter 177.04
		MeanAnomaly     145.913
	}
}

Comet	"Ciutric 40"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            2.05107e-011
	Radius          3.72721
	InertiaMoment   0.39826

	Oblateness      0.0188676

	RotationPeriod  35.6336
	Obliquity       212.72
	EqAscendNode    102.091
	Precession      0

	AbsMagn         11.8489
	SlopeParam      3.03486
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.710 0.704 0.702)

	Surface
	{
		SurfStyle       0.684869
		OceanStyle      0.00177923
		Randomize      (-0.097, -0.131, -0.216)
		colorDistMagn   0.779227
		colorDistFreq   0.0016163
		detailScale     101.778
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999042
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.542641
		terraceProb     0.161385
		erosion         0
		montesMagn      0.415701
		montesFreq      2.90015
		montesSpiky     0.925283
		montesFraction  0.638126
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0424939
		hillsFraction   0.66058
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223912
		craterFreq      0.163762
		craterDensity   0.975897
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.419826
		volcanoTemp     1141.95
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.277, 0.239, 0.196, 0.000)
		colorShelf     (0.284, 0.246, 0.224, 0.000)
		colorBeach     (0.334, 0.289, 0.267, 0.000)
		colorDesert    (0.362, 0.310, 0.260, 0.000)
		colorLowland   (0.397, 0.331, 0.295, 0.000)
		colorUpland    (0.440, 0.401, 0.358, 0.000)
		colorRock      (0.476, 0.437, 0.386, 0.000)
		colorSnow      (0.518, 0.465, 0.407, 1.000)
		BumpHeight      3.35449
		BumpOffset      0.670898
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.543608
		GasToDust   0.25
		Particles   2077
		GasBright   0.258236
		DustBright  0.456002
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   42.8382
		Period          204.761
		Eccentricity    0.859026
		Inclination     -61.6132
		AscendingNode   158.931
		ArgOfPericenter -120.06
		MeanAnomaly     -84.8881
	}
}

Comet	"Ciutric 41"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            1.58636e-007
	Radius          80.6757
	InertiaMoment   0.399919

	Oblateness      0.0278383

	RotationPeriod  33.6957
	Obliquity       165.926
	EqAscendNode    86.668
	Precession      0

	AbsMagn         7.94264
	SlopeParam      3.63083
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.487 0.483 0.477)

	Surface
	{
		SurfStyle       0.787297
		OceanStyle      0.852411
		Randomize      (0.820, 0.794, -0.416)
		colorDistMagn   0.701406
		colorDistFreq   5.2112
		detailScale     2202.98
		colorConversion true
		snowLevel       2
		tropicLatitude  0.935556
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.504072
		terraceProb     0.334428
		erosion         0
		montesMagn      0.488729
		montesFreq      3.08394
		montesSpiky     0.881807
		montesFraction  0.379992
		dunesFraction   0
		hillsMagn       0
		hillsFreq       16.4462
		hillsFraction   0.729154
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.273012
		craterFreq      0.180078
		craterDensity   1.01185
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.564745
		volcanoTemp     1482.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.190, 0.164, 0.134, 0.000)
		colorShelf     (0.195, 0.169, 0.153, 0.000)
		colorBeach     (0.229, 0.198, 0.181, 0.000)
		colorDesert    (0.248, 0.213, 0.177, 0.000)
		colorLowland   (0.273, 0.227, 0.201, 0.000)
		colorUpland    (0.302, 0.275, 0.243, 0.000)
		colorRock      (0.326, 0.300, 0.263, 0.000)
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

	CometTail
	{
		MaxLength   1
		GasToDust   0.25
		Particles   3000
		GasBright   0.167704
		DustBright  0.231021
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   68.3023
		Period          412.243
		Eccentricity    0.953076
		Inclination     -107.091
		AscendingNode   -72.9632
		ArgOfPericenter -20.8341
		MeanAnomaly     -25.1977
	}
}

Comet	"Ciutric 42"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            4.8845e-015
	Radius          0.230855
	InertiaMoment   0.398808

	Oblateness      0.0238129

	RotationPeriod  31.7155
	Obliquity       119.131
	EqAscendNode    71.2454
	Precession      0

	AbsMagn         3.9647
	SlopeParam      4.19509
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.511 0.422 0.354)

	Surface
	{
		SurfStyle       0.449984
		OceanStyle      0.246868
		Randomize      (-0.305, 0.449, -0.407)
		colorDistMagn   0.995087
		colorDistFreq   3.19746e-005
		detailScale     6.30389
		colorConversion true
		snowLevel       2
		tropicLatitude  0.809607
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.554234
		terraceProb     0.150013
		erosion         0
		montesMagn      0.429444
		montesFreq      2.64481
		montesSpiky     0.814614
		montesFraction  0.659705
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000140272
		hillsFraction   0.754539
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256052
		craterFreq      0.164512
		craterDensity   0.899831
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.519214
		volcanoTemp     1289.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.204, 0.169, 0.142, 0.000)
		colorShelf     (0.217, 0.179, 0.150, 0.000)
		colorBeach     (0.230, 0.190, 0.159, 0.000)
		colorDesert    (0.243, 0.200, 0.168, 0.000)
		colorLowland   (0.256, 0.211, 0.177, 0.000)
		colorUpland    (0.268, 0.221, 0.186, 0.000)
		colorRock      (0.281, 0.232, 0.195, 0.000)
		colorSnow      (0.294, 0.242, 0.204, 1.000)
		BumpHeight      0.20777
		BumpOffset      0.041554
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0952415
		GasToDust   0.25
		Particles   1172
		GasBright   0.423628
		DustBright  0.459583
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   54.5146
		Period          293.947
		Eccentricity    0.960543
		Inclination     36.2278
		AscendingNode   67.8938
		ArgOfPericenter -175.433
		MeanAnomaly     -61.6506
	}
}

Comet	"Ciutric 43"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            3.77782e-011
	Radius          4.99563
	InertiaMoment   0.397009

	Oblateness      0.0353744

	RotationPeriod  29.6847
	Obliquity       72.3369
	EqAscendNode    55.8228
	Precession      0

	AbsMagn         11.5296
	SlopeParam      4.77567
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.663 0.550 0.470)

	Surface
	{
		SurfStyle       0.812883
		OceanStyle      0.252939
		Randomize      (-0.872, -0.061, 0.392)
		colorDistMagn   0.794595
		colorDistFreq   0.0197211
		detailScale     136.414
		colorConversion true
		snowLevel       2
		tropicLatitude  0.441861
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.523869
		terraceProb     0.53316
		erosion         0
		montesMagn      0.545717
		montesFreq      3.61042
		montesSpiky     0.881492
		montesFraction  0.458783
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0727617
		hillsFraction   0.851274
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22944
		craterFreq      0.213965
		craterDensity   0.983038
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.460099
		volcanoTemp     1670.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.258, 0.187, 0.131, 0.000)
		colorShelf     (0.265, 0.192, 0.150, 0.000)
		colorBeach     (0.311, 0.225, 0.178, 0.000)
		colorDesert    (0.338, 0.242, 0.174, 0.000)
		colorLowland   (0.371, 0.258, 0.197, 0.000)
		colorUpland    (0.411, 0.313, 0.239, 0.000)
		colorRock      (0.444, 0.341, 0.258, 0.000)
		colorSnow      (0.484, 0.363, 0.272, 1.000)
		BumpHeight      4.49607
		BumpOffset      0.899213
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.576434
		GasToDust   0.25
		Particles   2144
		GasBright   0.0219646
		DustBright  0.545733
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   64.4397
		Period          377.773
		Eccentricity    0.957004
		Inclination     133.848
		AscendingNode   -1.66065
		ArgOfPericenter -33.7275
		MeanAnomaly     96.1139
	}
}

Comet	"Ciutric 44"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            2.92187e-007
	Radius          90.2182
	InertiaMoment   0.399279

	Oblateness      0.0314427

	RotationPeriod  27.5938
	Obliquity       25.5426
	EqAscendNode    40.4002
	Precession      0

	AbsMagn         7.73381
	SlopeParam      5.43202
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.713 0.709 0.708)

	Surface
	{
		SurfStyle       0.404738
		OceanStyle      0.382906
		Randomize      (-0.059, -0.663, -0.833)
		colorDistMagn   0.524215
		colorDistFreq   2.88362
		detailScale     2463.56
		colorConversion true
		snowLevel       2
		tropicLatitude  0.765571
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.439884
		terraceProb     0.473958
		erosion         0
		montesMagn      0.555565
		montesFreq      2.89597
		montesSpiky     0.937413
		montesFraction  0.451147
		dunesFraction   0
		hillsMagn       0
		hillsFreq       15.6026
		hillsFraction   0.663478
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.203467
		craterFreq      0.224414
		craterDensity   0.852336
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.581582
		volcanoTemp     1410.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.285, 0.284, 0.283, 0.000)
		colorShelf     (0.303, 0.301, 0.301, 0.000)
		colorBeach     (0.321, 0.319, 0.319, 0.000)
		colorDesert    (0.339, 0.337, 0.336, 0.000)
		colorLowland   (0.357, 0.355, 0.354, 0.000)
		colorUpland    (0.374, 0.372, 0.372, 0.000)
		colorRock      (0.392, 0.390, 0.389, 0.000)
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
		MaxLength   1
		GasToDust   0.25
		Particles   3000
		GasBright   0.0246475
		DustBright  0.227537
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   71.9689
		Period          445.88
		Eccentricity    0.94637
		Inclination     105.886
		AscendingNode   -17.0994
		ArgOfPericenter 104.927
		MeanAnomaly     -87.7192
	}
}

Comet	"Ciutric 45"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            8.99665e-015
	Radius          0.309344
	InertiaMoment   0.397935

	Oblateness      0.0482199

	RotationPeriod  25.4317
	Obliquity       338.748
	EqAscendNode    24.9777
	Precession      0

	AbsMagn         3.60101
	SlopeParam      6.30151
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.428 0.420 0.415)

	Surface
	{
		SurfStyle       0.415821
		OceanStyle      0.0299706
		Randomize      (0.173, 0.080, 0.070)
		colorDistMagn   0.90673
		colorDistFreq   2.57793e-005
		detailScale     8.44716
		colorConversion true
		snowLevel       2
		tropicLatitude  0.974271
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.67578
		terraceProb     0.181148
		erosion         0
		montesMagn      0.541571
		montesFreq      3.34533
		montesSpiky     0.983947
		montesFraction  0.45289
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000129462
		hillsFraction   0.831945
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229215
		craterFreq      0.218252
		craterDensity   0.765323
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.43509
		volcanoTemp     1834.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.171, 0.168, 0.166, 0.000)
		colorShelf     (0.182, 0.179, 0.177, 0.000)
		colorBeach     (0.193, 0.189, 0.187, 0.000)
		colorDesert    (0.203, 0.200, 0.197, 0.000)
		colorLowland   (0.214, 0.210, 0.208, 0.000)
		colorUpland    (0.225, 0.221, 0.218, 0.000)
		colorRock      (0.235, 0.231, 0.228, 0.000)
		colorSnow      (0.246, 0.242, 0.239, 1.000)
		BumpHeight      0.27841
		BumpOffset      0.055682
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.128067
		GasToDust   0.25
		Particles   1238
		GasBright   0.115496
		DustBright  0.621175
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   36.1781
		Period          158.916
		Eccentricity    0.872073
		Inclination     -85.4102
		AscendingNode   -114.669
		ArgOfPericenter 40.4067
		MeanAnomaly     41.8828
	}
}

Comet	"Ciutric 46"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            6.95827e-011
	Radius          5.58787
	InertiaMoment   0.399712

	Oblateness      0.0445095

	RotationPeriod  23.1849
	Obliquity       291.954
	EqAscendNode    9.55507
	Precession      0

	AbsMagn         11.2314
	SlopeParam      8.46204
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.692 0.582 0.544)

	Surface
	{
		SurfStyle       0.674017
		OceanStyle      0.785293
		Randomize      (-0.571, 0.624, 0.463)
		colorDistMagn   0.246579
		colorDistFreq   0.0237557
		detailScale     152.586
		colorConversion true
		snowLevel       2
		tropicLatitude  0.94141
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.722699
		terraceProb     0.627772
		erosion         0
		montesMagn      0.561385
		montesFreq      3.08597
		montesSpiky     0.946579
		montesFraction  0.45234
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0756933
		hillsFraction   0.850751
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245347
		craterFreq      0.188975
		craterDensity   0.922247
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.47663
		volcanoTemp     1368.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.270, 0.198, 0.152, 0.000)
		colorShelf     (0.277, 0.204, 0.174, 0.000)
		colorBeach     (0.325, 0.239, 0.207, 0.000)
		colorDesert    (0.353, 0.256, 0.201, 0.000)
		colorLowland   (0.388, 0.274, 0.228, 0.000)
		colorUpland    (0.429, 0.332, 0.277, 0.000)
		colorRock      (0.464, 0.361, 0.299, 0.000)
		colorSnow      (0.505, 0.384, 0.315, 1.000)
		BumpHeight      5.02908
		BumpOffset      1.00582
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.609259
		GasToDust   0.25
		Particles   2210
		GasBright   0.090897
		DustBright  0.330261
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   47.2355
		Period          237.085
		Eccentricity    0.899029
		Inclination     34.4052
		AscendingNode   -86.8492
		ArgOfPericenter 69.6308
		MeanAnomaly     -113.855
	}
}

Comet	"Ciutric 47"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            5.38172e-007
	Radius          120.865
	InertiaMoment   0.398551

	Oblateness      0.0717864

	RotationPeriod  20.837
	Obliquity       245.16
	EqAscendNode    354.132
	Precession      0

	AbsMagn         7.52425
	SlopeParam      2.70028
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.654 0.544 0.479)

	Surface
	{
		SurfStyle       0.44716
		OceanStyle      0.0601363
		Randomize      (-0.136, 0.460, -0.761)
		colorDistMagn   0.992649
		colorDistFreq   12.3775
		detailScale     3300.41
		colorConversion true
		snowLevel       2
		tropicLatitude  0.979579
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.687382
		terraceProb     0.34235
		erosion         0
		montesMagn      0.442251
		montesFreq      3.02384
		montesSpiky     0.930494
		montesFraction  0.735088
		dunesFraction   0
		hillsMagn       0
		hillsFreq       40.62
		hillsFraction   0.666173
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213226
		craterFreq      0.556496
		craterDensity   1.02784
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.607054
		volcanoTemp     1702.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.262, 0.217, 0.191, 0.000)
		colorShelf     (0.278, 0.231, 0.203, 0.000)
		colorBeach     (0.294, 0.245, 0.215, 0.000)
		colorDesert    (0.311, 0.258, 0.227, 0.000)
		colorLowland   (0.327, 0.272, 0.239, 0.000)
		colorUpland    (0.344, 0.285, 0.251, 0.000)
		colorRock      (0.360, 0.299, 0.263, 0.000)
		colorSnow      (0.376, 0.313, 0.275, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.248936
		DustBright  0.656708
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   64.0186
		Period          374.076
		Eccentricity    0.95282
		Inclination     -99.8034
		AscendingNode   98.3287
		ArgOfPericenter -105.894
		MeanAnomaly     74.2737
	}
}

Comet	"Ciutric 48"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            1.65707e-014
	Radius          0.346096
	InertiaMoment   0.396119

	Oblateness      0.0698116

	RotationPeriod  18.3674
	Obliquity       198.365
	EqAscendNode    338.71
	Precession      0

	AbsMagn         3.19677
	SlopeParam      3.33613
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.456 0.453 0.450)

	Surface
	{
		SurfStyle       0.766685
		OceanStyle      0.436241
		Randomize      (0.443, -0.681, 0.203)
		colorDistMagn   0.269688
		colorDistFreq   3.26012e-005
		detailScale     9.45072
		colorConversion true
		snowLevel       2
		tropicLatitude  0.903151
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.57845
		terraceProb     0.602949
		erosion         0
		montesMagn      0.590055
		montesFreq      3.22756
		montesSpiky     0.967171
		montesFraction  0.686636
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000323484
		hillsFraction   0.586858
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.266276
		craterFreq      0.175129
		craterDensity   0.908331
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.505136
		volcanoTemp     1013.09
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.178, 0.154, 0.126, 0.000)
		colorShelf     (0.182, 0.159, 0.144, 0.000)
		colorBeach     (0.214, 0.186, 0.171, 0.000)
		colorDesert    (0.233, 0.199, 0.166, 0.000)
		colorLowland   (0.255, 0.213, 0.189, 0.000)
		colorUpland    (0.283, 0.258, 0.229, 0.000)
		colorRock      (0.306, 0.281, 0.247, 0.000)
		colorSnow      (0.333, 0.299, 0.261, 1.000)
		BumpHeight      0.311486
		BumpOffset      0.0622972
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.160893
		GasToDust   0.25
		Particles   1304
		GasBright   0.197055
		DustBright  0.393076
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   71.1003
		Period          437.832
		Eccentricity    0.957882
		Inclination     99.2631
		AscendingNode   27.2109
		ArgOfPericenter -132.182
		MeanAnomaly     -90.1825
	}
}

Comet	"Ciutric 49"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            1.28162e-010
	Radius          7.48447
	InertiaMoment   0.399053

	Oblateness      0.125524

	RotationPeriod  15.7498
	Obliquity       151.571
	EqAscendNode    323.287
	Precession      0

	AbsMagn         10.9502
	SlopeParam      3.90996
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.479 0.420 0.359)

	Surface
	{
		SurfStyle       0.173492
		OceanStyle      0.317752
		Randomize      (0.165, -0.983, -0.230)
		colorDistMagn   0.49362
		colorDistFreq   0.00853131
		detailScale     204.376
		colorConversion true
		snowLevel       2
		tropicLatitude  0.956048
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.448673
		terraceProb     0.65848
		erosion         0
		montesMagn      0.599506
		montesFreq      2.56618
		montesSpiky     0.996935
		montesFraction  0.717733
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.110914
		hillsFraction   0.705828
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.210425
		craterFreq      0.269027
		craterDensity   1.03935
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.508317
		volcanoTemp     1517
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.192, 0.168, 0.144, 0.000)
		colorShelf     (0.204, 0.179, 0.153, 0.000)
		colorBeach     (0.216, 0.189, 0.162, 0.000)
		colorDesert    (0.228, 0.200, 0.170, 0.000)
		colorLowland   (0.240, 0.210, 0.179, 0.000)
		colorUpland    (0.252, 0.221, 0.188, 0.000)
		colorRock      (0.264, 0.231, 0.197, 0.000)
		colorSnow      (0.276, 0.242, 0.206, 1.000)
		BumpHeight      6.73602
		BumpOffset      1.3472
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.642085
		GasToDust   0.25
		Particles   2276
		GasBright   0.107914
		DustBright  0.166703
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   93.3272
		Period          658.435
		Eccentricity    0.967173
		Inclination     122.766
		AscendingNode   62.8403
		ArgOfPericenter -133.899
		MeanAnomaly     69.7213
	}
}

Comet	"Ciutric 50"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            3.94621e-018
	Radius          0.021436
	InertiaMoment   0.397543

	Oblateness      0.140879

	RotationPeriod  12.9494
	Obliquity       104.777
	EqAscendNode    307.865
	Precession      0

	AbsMagn         7.31338
	SlopeParam      4.47632
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.703 0.561 0.492)

	Surface
	{
		SurfStyle       0.993371
		OceanStyle      0.749575
		Randomize      (0.788, 0.547, 0.312)
		colorDistMagn   0.952466
		colorDistFreq   2.52643e-007
		detailScale     0.585345
		colorConversion true
		snowLevel       2
		tropicLatitude  0.922307
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.551129
		terraceProb     0.270855
		erosion         0
		montesMagn      0.620811
		montesFreq      3.17576
		montesSpiky     0.92141
		montesFraction  0.377171
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.3639e-006
		hillsFraction   0.488831
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.294902
		craterFreq      0.219977
		craterDensity   0.990302
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51883
		volcanoTemp     1472.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.239, 0.196, 0.197, 0.050)
		colorShelf     (0.281, 0.230, 0.226, 0.040)
		colorBeach     (0.324, 0.264, 0.256, 0.030)
		colorDesert    (0.366, 0.297, 0.290, 0.020)
		colorLowland   (0.408, 0.331, 0.320, 0.030)
		colorUpland    (0.450, 0.365, 0.349, 0.050)
		colorRock      (0.492, 0.398, 0.389, 0.020)
		colorSnow      (0.492, 0.398, 0.389, 1.000)
		BumpHeight      0.0192924
		BumpOffset      0.00385848
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.343121
		DustBright  0.415983
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   56.6933
		Period          311.744
		Eccentricity    0.925116
		Inclination     142.197
		AscendingNode   -7.2191
		ArgOfPericenter 146.111
		MeanAnomaly     54.2024
	}
}

Comet	"Ciutric 51"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            3.05211e-014
	Radius          0.463476
	InertiaMoment   0.399501

	Oblateness      0.249

	RotationPeriod  9.91899
	Obliquity       57.9825
	EqAscendNode    292.442
	Precession      0

	AbsMagn         2.73642
	SlopeParam      5.08463
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.698 0.696 0.694)

	Surface
	{
		SurfStyle       0.120109
		OceanStyle      0.170918
		Randomize      (0.736, 0.299, 0.606)
		colorDistMagn   0.666843
		colorDistFreq   0.000173974
		detailScale     12.656
		colorConversion true
		snowLevel       2
		tropicLatitude  0.747967
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.605871
		terraceProb     0.316971
		erosion         0
		montesMagn      0.543606
		montesFreq      2.93072
		montesSpiky     0.883116
		montesFraction  0.712715
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000511598
		hillsFraction   0.668945
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255602
		craterFreq      0.223263
		craterDensity   0.928662
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.517992
		volcanoTemp     1456.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.279, 0.278, 0.278, 0.000)
		colorShelf     (0.297, 0.296, 0.295, 0.000)
		colorBeach     (0.314, 0.313, 0.312, 0.000)
		colorDesert    (0.332, 0.331, 0.330, 0.000)
		colorLowland   (0.349, 0.348, 0.347, 0.000)
		colorUpland    (0.366, 0.365, 0.364, 0.000)
		colorRock      (0.384, 0.383, 0.382, 0.000)
		colorSnow      (0.401, 0.400, 0.399, 1.000)
		BumpHeight      0.417128
		BumpOffset      0.0834257
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.193719
		GasToDust   0.25
		Particles   1371
		GasBright   0.00490288
		DustBright  0.438688
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   53.0042
		Period          281.817
		Eccentricity    0.914786
		Inclination     -113.493
		AscendingNode   125.575
		ArgOfPericenter 19.52
		MeanAnomaly     135.571
	}
}

Comet	"Ciutric 52"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            2.36059e-010
	Radius          8.377
	InertiaMoment   0.398268

	Oblateness      0.249

	RotationPeriod  6.59151
	Obliquity       11.1883
	EqAscendNode    277.02
	Precession      0

	AbsMagn         10.6828
	SlopeParam      5.81763
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.540 0.394 0.301)

	Surface
	{
		SurfStyle       0.362723
		OceanStyle      0.420314
		Randomize      (0.069, -0.011, 0.825)
		colorDistMagn   0.378136
		colorDistFreq   0.0453715
		detailScale     228.748
		colorConversion true
		snowLevel       2
		tropicLatitude  0.340869
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.450041
		terraceProb     0.233342
		erosion         0
		montesMagn      0.560552
		montesFreq      2.8556
		montesSpiky     0.995817
		montesFraction  0.548756
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.134706
		hillsFraction   0.543578
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.198112
		craterFreq      0.19561
		craterDensity   1.08681
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.417653
		volcanoTemp     1483.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.216, 0.158, 0.121, 0.000)
		colorShelf     (0.229, 0.168, 0.128, 0.000)
		colorBeach     (0.243, 0.177, 0.136, 0.000)
		colorDesert    (0.256, 0.187, 0.143, 0.000)
		colorLowland   (0.270, 0.197, 0.151, 0.000)
		colorUpland    (0.283, 0.207, 0.158, 0.000)
		colorRock      (0.297, 0.217, 0.166, 0.000)
		colorSnow      (0.310, 0.227, 0.173, 1.000)
		BumpHeight      7.5393
		BumpOffset      1.50786
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.674911
		GasToDust   0.25
		Particles   2343
		GasBright   0.0650563
		DustBright  0.863021
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   82.1211
		Period          543.479
		Eccentricity    0.980333
		Inclination     25.5313
		AscendingNode   -131.04
		ArgOfPericenter -31.9309
		MeanAnomaly     4.12158
	}
}

Comet	"Ciutric 53"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            7.26844e-018
	Radius          0.0287011
	InertiaMoment   0.399924

	Oblateness      0.249

	RotationPeriod  2.86665
	Obliquity       324.394
	EqAscendNode    261.597
	Precession      0

	AbsMagn         7.10058
	SlopeParam      6.95684
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.678 0.672 0.670)

	Surface
	{
		SurfStyle       0.732424
		OceanStyle      0.525839
		Randomize      (-0.257, 0.371, -0.835)
		colorDistMagn   0.0725861
		colorDistFreq   1.46752e-007
		detailScale     0.78373
		colorConversion true
		snowLevel       2
		tropicLatitude  0.647558
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.511484
		terraceProb     0.198877
		erosion         0
		montesMagn      0.390738
		montesFreq      2.88193
		montesSpiky     0.957099
		montesFraction  0.471219
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.8281e-006
		hillsFraction   0.72473
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245546
		craterFreq      0.248678
		craterDensity   0.922354
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.6118
		volcanoTemp     1475.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.264, 0.229, 0.188, 0.000)
		colorShelf     (0.271, 0.235, 0.214, 0.000)
		colorBeach     (0.318, 0.276, 0.255, 0.000)
		colorDesert    (0.346, 0.296, 0.248, 0.000)
		colorLowland   (0.379, 0.316, 0.281, 0.000)
		colorUpland    (0.420, 0.383, 0.342, 0.000)
		colorRock      (0.454, 0.417, 0.369, 0.000)
		colorSnow      (0.495, 0.444, 0.389, 1.000)
		BumpHeight      0.025831
		BumpOffset      0.00516619
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0791085
		DustBright  0.533455
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   71.6217
		Period          442.657
		Eccentricity    0.954744
		Inclination     35.3188
		AscendingNode   72.9628
		ArgOfPericenter -37.4085
		MeanAnomaly     79.2193
	}
}

Comet	"Ciutric 54"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            5.62162e-014
	Radius          0.518838
	InertiaMoment   0.398815

	Oblateness      0.0015434

	RotationPeriod  123.726
	Obliquity       277.6
	EqAscendNode    246.174
	Precession      0

	AbsMagn         2.19331
	SlopeParam      2.32449
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.787 0.733 0.634)

	Surface
	{
		SurfStyle       0.46896
		OceanStyle      0.653184
		Randomize      (-0.963, 0.432, 0.781)
		colorDistMagn   0.0235588
		colorDistFreq   0.000119523
		detailScale     14.1677
		colorConversion true
		snowLevel       2
		tropicLatitude  0.666334
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.460278
		terraceProb     0.22014
		erosion         0
		montesMagn      0.439429
		montesFreq      2.38496
		montesSpiky     0.885902
		montesFraction  0.740804
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000529334
		hillsFraction   0.685978
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.288907
		craterFreq      0.231814
		craterDensity   0.73061
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.523876
		volcanoTemp     1798.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.315, 0.293, 0.254, 0.000)
		colorShelf     (0.335, 0.312, 0.270, 0.000)
		colorBeach     (0.354, 0.330, 0.285, 0.000)
		colorDesert    (0.374, 0.348, 0.301, 0.000)
		colorLowland   (0.394, 0.367, 0.317, 0.000)
		colorUpland    (0.413, 0.385, 0.333, 0.000)
		colorRock      (0.433, 0.403, 0.349, 0.000)
		colorSnow      (0.453, 0.422, 0.365, 1.000)
		BumpHeight      0.466954
		BumpOffset      0.0933908
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.226545
		GasToDust   0.25
		Particles   1437
		GasBright   0.0559015
		DustBright  0.241149
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   70.4276
		Period          431.633
		Eccentricity    0.976098
		Inclination     -68.991
		AscendingNode   31.0108
		ArgOfPericenter 156.141
		MeanAnomaly     23.7064
	}
}

Comet	"Ciutric 55"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            4.34792e-010
	Radius          11.2143
	InertiaMoment   0.397025

	Oblateness      0.00244336

	RotationPeriod  111.983
	Obliquity       230.805
	EqAscendNode    230.752
	Precession      0

	AbsMagn         10.4269
	SlopeParam      3.02618
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.545 0.415 0.365)

	Surface
	{
		SurfStyle       0.541797
		OceanStyle      0.67691
		Randomize      (0.213, -0.119, 0.170)
		colorDistMagn   0.331423
		colorDistFreq   0.0534739
		detailScale     306.226
		colorConversion true
		snowLevel       2
		tropicLatitude  0.85489
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.597465
		terraceProb     0.107513
		erosion         0
		montesMagn      0.606264
		montesFreq      3.26136
		montesSpiky     0.904625
		montesFraction  0.463861
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.238959
		hillsFraction   0.71722
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22424
		craterFreq      0.260244
		craterDensity   0.825898
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.550971
		volcanoTemp     1372.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.212, 0.141, 0.102, 0.000)
		colorShelf     (0.218, 0.145, 0.117, 0.000)
		colorBeach     (0.256, 0.170, 0.139, 0.000)
		colorDesert    (0.278, 0.183, 0.135, 0.000)
		colorLowland   (0.305, 0.195, 0.153, 0.000)
		colorUpland    (0.338, 0.237, 0.186, 0.000)
		colorRock      (0.365, 0.258, 0.201, 0.000)
		colorSnow      (0.397, 0.274, 0.211, 1.000)
		BumpHeight      10.0929
		BumpOffset      2.01858
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.707737
		GasToDust   0.25
		Particles   2409
		GasBright   0.193222
		DustBright  0.588315
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   56.6117
		Period          311.071
		Eccentricity    0.933446
		Inclination     22.8683
		AscendingNode   -77.833
		ArgOfPericenter 131.847
		MeanAnomaly     -110.245
	}
}

Comet	"Ciutric 56"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            1.33876e-017
	Radius          0.0321345
	InertiaMoment   0.399284

	Oblateness      0.00215634

	RotationPeriod  104.644
	Obliquity       184.011
	EqAscendNode    215.329
	Precession      0

	AbsMagn         6.8852
	SlopeParam      3.62298
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.485 0.480 0.476)

	Surface
	{
		SurfStyle       0.669648
		OceanStyle      0.843902
		Randomize      (0.025, -0.663, 0.428)
		colorDistMagn   0.641411
		colorDistFreq   8.80281e-007
		detailScale     0.877487
		colorConversion true
		snowLevel       2
		tropicLatitude  0.661766
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.530541
		terraceProb     0.20389
		erosion         0
		montesMagn      0.392205
		montesFreq      3.48228
		montesSpiky     0.976568
		montesFraction  0.726397
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.54477e-006
		hillsFraction   0.547969
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238036
		craterFreq      0.25382
		craterDensity   0.87747
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.573656
		volcanoTemp     1669.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.189, 0.163, 0.133, 0.000)
		colorShelf     (0.194, 0.168, 0.152, 0.000)
		colorBeach     (0.228, 0.197, 0.181, 0.000)
		colorDesert    (0.247, 0.211, 0.176, 0.000)
		colorLowland   (0.272, 0.226, 0.200, 0.000)
		colorUpland    (0.301, 0.274, 0.243, 0.000)
		colorRock      (0.325, 0.298, 0.262, 0.000)
		colorSnow      (0.354, 0.317, 0.276, 1.000)
		BumpHeight      0.0289211
		BumpOffset      0.00578421
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.142733
		DustBright  0.32329
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   46.9764
		Period          235.137
		Eccentricity    0.915528
		Inclination     141.117
		AscendingNode   127.628
		ArgOfPericenter 176.117
		MeanAnomaly     54.2878
	}
}

Comet	"Ciutric 57"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            1.03543e-013
	Radius          0.694467
	InertiaMoment   0.397944

	Oblateness      0.00312158

	RotationPeriod  99.1069
	Obliquity       137.217
	EqAscendNode    199.907
	Precession      0

	AbsMagn         1.51522
	SlopeParam      4.18734
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.658 0.653 0.649)

	Surface
	{
		SurfStyle       0.272909
		OceanStyle      0.9828
		Randomize      (0.166, -0.265, -0.371)
		colorDistMagn   0.537727
		colorDistFreq   0.000131995
		detailScale     18.9636
		colorConversion true
		snowLevel       2
		tropicLatitude  0.918253
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.658762
		terraceProb     0.423525
		erosion         0
		montesMagn      0.408004
		montesFreq      1.52066
		montesSpiky     0.846797
		montesFraction  0.866995
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0012873
		hillsFraction   0.643173
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226271
		craterFreq      0.233885
		craterDensity   0.772795
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.465291
		volcanoTemp     1021.53
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.263, 0.261, 0.259, 0.000)
		colorShelf     (0.280, 0.277, 0.276, 0.000)
		colorBeach     (0.296, 0.294, 0.292, 0.000)
		colorDesert    (0.313, 0.310, 0.308, 0.000)
		colorLowland   (0.329, 0.326, 0.324, 0.000)
		colorUpland    (0.346, 0.343, 0.341, 0.000)
		colorRock      (0.362, 0.359, 0.357, 0.000)
		colorSnow      (0.379, 0.375, 0.373, 1.000)
		BumpHeight      0.625021
		BumpOffset      0.125004
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.259371
		GasToDust   0.25
		Particles   1503
		GasBright   0.347244
		DustBright  0.603266
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   62.9547
		Period          364.79
		Eccentricity    0.938535
		Inclination     -134.831
		AscendingNode   104.602
		ArgOfPericenter -142.176
		MeanAnomaly     152.098
	}
}

Comet	"Ciutric 58"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            8.00831e-010
	Radius          12.5577
	InertiaMoment   0.399717

	Oblateness      0.00263831

	RotationPeriod  94.5688
	Obliquity       90.4225
	EqAscendNode    184.484
	Precession      0

	AbsMagn         10.1806
	SlopeParam      4.76735
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.429 0.425 0.418)

	Surface
	{
		SurfStyle       0.521615
		OceanStyle      0.983376
		Randomize      (-0.666, 0.553, -0.450)
		colorDistMagn   0.636321
		colorDistFreq   0.0875458
		detailScale     342.908
		colorConversion true
		snowLevel       2
		tropicLatitude  0.839466
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.668269
		terraceProb     0.347984
		erosion         0
		montesMagn      0.38181
		montesFreq      2.71128
		montesSpiky     0.942484
		montesFraction  0.587422
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.364624
		hillsFraction   0.663645
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230005
		craterFreq      0.204022
		craterDensity   0.883505
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.500314
		volcanoTemp     1605.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.167, 0.144, 0.117, 0.000)
		colorShelf     (0.171, 0.149, 0.134, 0.000)
		colorBeach     (0.202, 0.174, 0.159, 0.000)
		colorDesert    (0.219, 0.187, 0.155, 0.000)
		colorLowland   (0.240, 0.200, 0.175, 0.000)
		colorUpland    (0.266, 0.242, 0.213, 0.000)
		colorRock      (0.287, 0.263, 0.230, 0.000)
		colorSnow      (0.313, 0.280, 0.242, 1.000)
		BumpHeight      11.3019
		BumpOffset      2.26038
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.740563
		GasToDust   0.25
		Particles   2475
		GasBright   0.269473
		DustBright  0.365523
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   70.6423
		Period          433.608
		Eccentricity    0.953635
		Inclination     -57.0866
		AscendingNode   -49.2999
		ArgOfPericenter 84.0833
		MeanAnomaly     -175.213
	}
}

Comet	"Ciutric 59"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            2.46582e-017
	Radius          0.0430066
	InertiaMoment   0.398558

	Oblateness      0.0037279

	RotationPeriod  90.67
	Obliquity       43.6282
	EqAscendNode    169.061
	Precession      0

	AbsMagn         6.66654
	SlopeParam      5.42206
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.714 0.616 0.568)

	Surface
	{
		SurfStyle       0.807341
		OceanStyle      0.196796
		Randomize      (-0.725, -0.553, -0.140)
		colorDistMagn   0.755606
		colorDistFreq   7.63728e-007
		detailScale     1.17437
		colorConversion true
		snowLevel       2
		tropicLatitude  0.441158
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.332346
		terraceProb     0.333769
		erosion         0
		montesMagn      0.493586
		montesFreq      2.99839
		montesSpiky     0.971151
		montesFraction  0.542886
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.57185e-006
		hillsFraction   0.837579
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.275545
		craterFreq      0.250586
		craterDensity   0.787622
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.487956
		volcanoTemp     1642.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.278, 0.210, 0.159, 0.000)
		colorShelf     (0.285, 0.216, 0.182, 0.000)
		colorBeach     (0.335, 0.253, 0.216, 0.000)
		colorDesert    (0.364, 0.271, 0.210, 0.000)
		colorLowland   (0.400, 0.290, 0.238, 0.000)
		colorUpland    (0.443, 0.351, 0.289, 0.000)
		colorRock      (0.478, 0.382, 0.312, 0.000)
		colorSnow      (0.521, 0.407, 0.329, 1.000)
		BumpHeight      0.0387059
		BumpOffset      0.00774118
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.154443
		DustBright  0.16504
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   81.672
		Period          539.027
		Eccentricity    0.974901
		Inclination     135.658
		AscendingNode   -38.0502
		ArgOfPericenter 133.269
		MeanAnomaly     -126.355
	}
}

Comet	"Ciutric 60"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            1.90713e-013
	Radius          0.777756
	InertiaMoment   0.396153

	Oblateness      0.00305343

	RotationPeriod  87.2161
	Obliquity       356.834
	EqAscendNode    153.639
	Precession      0

	AbsMagn         0.573347
	SlopeParam      6.28661
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.527 0.518 0.513)

	Surface
	{
		SurfStyle       0.807158
		OceanStyle      0.290312
		Randomize      (0.124, 0.239, 0.321)
		colorDistMagn   0.257282
		colorDistFreq   0.000337988
		detailScale     21.2379
		colorConversion true
		snowLevel       2
		tropicLatitude  0.46112
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.515061
		terraceProb     0.401931
		erosion         0
		montesMagn      0.449395
		montesFreq      2.71345
		montesSpiky     0.839178
		montesFraction  0.377152
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00103717
		hillsFraction   0.827783
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23655
		craterFreq      0.248132
		craterDensity   0.952273
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.559566
		volcanoTemp     1615.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.206, 0.176, 0.144, 0.000)
		colorShelf     (0.211, 0.181, 0.164, 0.000)
		colorBeach     (0.248, 0.212, 0.195, 0.000)
		colorDesert    (0.269, 0.228, 0.190, 0.000)
		colorLowland   (0.295, 0.243, 0.216, 0.000)
		colorUpland    (0.327, 0.295, 0.262, 0.000)
		colorRock      (0.353, 0.321, 0.282, 0.000)
		colorSnow      (0.385, 0.342, 0.298, 1.000)
		BumpHeight      0.699981
		BumpOffset      0.139996
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.292197
		GasToDust   0.25
		Particles   1570
		GasBright   0.0341366
		DustBright  0.769833
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   41.466
		Period          195.002
		Eccentricity    0.935075
		Inclination     -25.6404
		AscendingNode   57.5785
		ArgOfPericenter -24.1263
		MeanAnomaly     -25.3937
	}
}

Comet	"Ciutric 61"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            1.47503e-009
	Radius          16.8043
	InertiaMoment   0.399059

	Oblateness      0.00433051

	RotationPeriod  84.09
	Obliquity       310.04
	EqAscendNode    138.216
	Precession      0

	AbsMagn         9.94235
	SlopeParam      8.37358
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.743 0.662 0.626)

	Surface
	{
		SurfStyle       0.684658
		OceanStyle      0.74546
		Randomize      (0.570, 0.331, -0.532)
		colorDistMagn   0.722726
		colorDistFreq   0.0230784
		detailScale     458.871
		colorConversion true
		snowLevel       2
		tropicLatitude  0.743602
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.340019
		terraceProb     0.162534
		erosion         0
		montesMagn      0.388412
		montesFreq      3.36234
		montesSpiky     0.967674
		montesFraction  0.4166
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.772598
		hillsFraction   0.560161
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240241
		craterFreq      0.245666
		craterDensity   0.862133
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.503611
		volcanoTemp     1767.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.290, 0.225, 0.175, 0.000)
		colorShelf     (0.297, 0.232, 0.200, 0.000)
		colorBeach     (0.349, 0.271, 0.238, 0.000)
		colorDesert    (0.379, 0.291, 0.232, 0.000)
		colorLowland   (0.416, 0.311, 0.263, 0.000)
		colorUpland    (0.461, 0.377, 0.320, 0.000)
		colorRock      (0.498, 0.410, 0.345, 0.000)
		colorSnow      (0.542, 0.437, 0.363, 1.000)
		BumpHeight      15.1239
		BumpOffset      3.02478
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.773389
		GasToDust   0.25
		Particles   2542
		GasBright   0.0495809
		DustBright  0.438875
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   50.9089
		Period          265.272
		Eccentricity    0.921183
		Inclination     2.7752
		AscendingNode   -45.3285
		ArgOfPericenter -76.156
		MeanAnomaly     3.40098
	}
}

Comet	"Ciutric 62"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            4.54173e-017
	Radius          0.0481699
	InertiaMoment   0.397555

	Oblateness      0.00353142

	RotationPeriod  81.2147
	Obliquity       263.245
	EqAscendNode    122.794
	Precession      0

	AbsMagn         6.44381
	SlopeParam      2.69074
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.447 0.445 0.441)

	Surface
	{
		SurfStyle       0.854746
		OceanStyle      0.914638
		Randomize      (0.996, 0.428, -0.379)
		colorDistMagn   0.386809
		colorDistFreq   1.4213e-006
		detailScale     1.31536
		colorConversion true
		snowLevel       2
		tropicLatitude  0.251365
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.48054
		terraceProb     0.219641
		erosion         0
		montesMagn      0.556331
		montesFreq      2.81391
		montesSpiky     0.928895
		montesFraction  0.49752
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.32897e-006
		hillsFraction   0.5776
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214402
		craterFreq      0.155551
		craterDensity   1.00275
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48279
		volcanoTemp     1753.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.152, 0.156, 0.176, 0.050)
		colorShelf     (0.179, 0.182, 0.203, 0.040)
		colorBeach     (0.205, 0.209, 0.229, 0.030)
		colorDesert    (0.232, 0.236, 0.260, 0.020)
		colorLowland   (0.259, 0.262, 0.287, 0.030)
		colorUpland    (0.286, 0.289, 0.313, 0.050)
		colorRock      (0.313, 0.316, 0.348, 0.020)
		colorSnow      (0.313, 0.316, 0.348, 1.000)
		BumpHeight      0.0433529
		BumpOffset      0.00867058
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.156207
		DustBright  0.816736
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   58.7508
		Period          328.868
		Eccentricity    0.93755
		Inclination     93.1446
		AscendingNode   -14.159
		ArgOfPericenter 179.025
		MeanAnomaly     -130.98
	}
}

Comet	"Ciutric 63"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            3.5127e-013
	Radius          1.04067
	InertiaMoment   0.399506

	Oblateness      0.0049595

	RotationPeriod  78.5371
	Obliquity       216.451
	EqAscendNode    107.371
	Precession      0

	AbsMagn         -1.17935
	SlopeParam      3.32797
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.437 0.433 0.431)

	Surface
	{
		SurfStyle       0.940415
		OceanStyle      0.285803
		Randomize      (0.372, -0.652, 0.760)
		colorDistMagn   0.853999
		colorDistFreq   0.000508427
		detailScale     28.4172
		colorConversion true
		snowLevel       2
		tropicLatitude  0.243324
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.361799
		terraceProb     0.505774
		erosion         0
		montesMagn      0.326006
		montesFreq      3.09186
		montesSpiky     0.915386
		montesFraction  0.342658
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00243119
		hillsFraction   0.651932
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238804
		craterFreq      0.207847
		craterDensity   0.891688
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.524097
		volcanoTemp     1603.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.148, 0.151, 0.172, 0.050)
		colorShelf     (0.175, 0.177, 0.198, 0.040)
		colorBeach     (0.201, 0.203, 0.224, 0.030)
		colorDesert    (0.227, 0.229, 0.254, 0.020)
		colorLowland   (0.253, 0.255, 0.280, 0.030)
		colorUpland    (0.279, 0.281, 0.306, 0.050)
		colorRock      (0.306, 0.307, 0.341, 0.020)
		colorSnow      (0.306, 0.307, 0.341, 1.000)
		BumpHeight      0.936602
		BumpOffset      0.18732
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.325023
		GasToDust   0.25
		Particles   1636
		GasBright   0.144369
		DustBright  0.513061
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   56.3752
		Period          309.124
		Eccentricity    0.927182
		Inclination     150.042
		AscendingNode   23.0273
		ArgOfPericenter 61.3228
		MeanAnomaly     43.6301
	}
}

Comet	"Ciutric 64"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            2.71682e-009
	Radius          18.8237
	InertiaMoment   0.398275

	Oblateness      0.00403179

	RotationPeriod  76.0187
	Obliquity       169.657
	EqAscendNode    91.9484
	Precession      0

	AbsMagn         9.71076
	SlopeParam      3.90223
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.641 0.527 0.488)

	Surface
	{
		SurfStyle       0.0508543
		OceanStyle      0.555132
		Randomize      (0.205, 0.036, -0.402)
		colorDistMagn   0.191779
		colorDistFreq   0.276055
		detailScale     514.011
		colorConversion true
		snowLevel       2
		tropicLatitude  0.368817
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.653955
		terraceProb     0.162384
		erosion         0
		montesMagn      0.493135
		montesFreq      2.80439
		montesSpiky     0.968746
		montesFraction  0.863248
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.774803
		hillsFraction   0.653169
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.198285
		craterFreq      0.222809
		craterDensity   0.839734
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.553848
		volcanoTemp     1478.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.257, 0.211, 0.195, 0.000)
		colorShelf     (0.273, 0.224, 0.207, 0.000)
		colorBeach     (0.289, 0.237, 0.219, 0.000)
		colorDesert    (0.305, 0.250, 0.232, 0.000)
		colorLowland   (0.321, 0.263, 0.244, 0.000)
		colorUpland    (0.337, 0.277, 0.256, 0.000)
		colorRock      (0.353, 0.290, 0.268, 0.000)
		colorSnow      (0.369, 0.303, 0.280, 1.000)
		BumpHeight      16.9413
		BumpOffset      3.38826
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.806215
		GasToDust   0.25
		Particles   2608
		GasBright   0.0952719
		DustBright  0.246644
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   56.9387
		Period          313.77
		Eccentricity    0.970518
		Inclination     -31.9853
		AscendingNode   -179.442
		ArgOfPericenter 27.2268
		MeanAnomaly     27.0627
	}
}

Comet	"Ciutric 65"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            8.36531e-017
	Radius          0.0644476
	InertiaMoment   0.39993

	Oblateness      0.00563644

	RotationPeriod  73.6305
	Obliquity       122.862
	EqAscendNode    76.5259
	Precession      0

	AbsMagn         6.21615
	SlopeParam      4.46839
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.428 0.423 0.421)

	Surface
	{
		SurfStyle       0.112756
		OceanStyle      0.79013
		Randomize      (-0.158, 0.787, -0.222)
		colorDistMagn   0.82845
		colorDistFreq   3.1956e-006
		detailScale     1.75985
		colorConversion true
		snowLevel       2
		tropicLatitude  0.559577
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.590514
		terraceProb     0.2194
		erosion         0
		montesMagn      0.54374
		montesFreq      3.54793
		montesSpiky     0.732025
		montesFraction  0.336647
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.32114e-005
		hillsFraction   0.689415
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234533
		craterFreq      0.257403
		craterDensity   0.807361
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.464433
		volcanoTemp     1545.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.171, 0.169, 0.168, 0.000)
		colorShelf     (0.182, 0.180, 0.179, 0.000)
		colorBeach     (0.192, 0.190, 0.189, 0.000)
		colorDesert    (0.203, 0.201, 0.200, 0.000)
		colorLowland   (0.214, 0.212, 0.211, 0.000)
		colorUpland    (0.224, 0.222, 0.221, 0.000)
		colorRock      (0.235, 0.233, 0.232, 0.000)
		colorSnow      (0.246, 0.243, 0.242, 1.000)
		BumpHeight      0.0580028
		BumpOffset      0.0116006
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.279065
		DustBright  0.547338
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   48.8643
		Period          249.453
		Eccentricity    0.969142
		Inclination     138.637
		AscendingNode   -139.41
		ArgOfPericenter -40.6997
		MeanAnomaly     -6.01071
	}
}

Comet	"Ciutric 66"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            6.46995e-013
	Radius          1.16581
	InertiaMoment   0.398821

	Oblateness      0.00457483

	RotationPeriod  71.3501
	Obliquity       76.0681
	EqAscendNode    61.1033
	Precession      0

	AbsMagn         16.4337
	SlopeParam      5.0757
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.735 0.733 0.732)

	Surface
	{
		SurfStyle       0.764707
		OceanStyle      0.562164
		Randomize      (0.317, 0.128, -0.649)
		colorDistMagn   0.926002
		colorDistFreq   0.000908845
		detailScale     31.8345
		colorConversion true
		snowLevel       2
		tropicLatitude  0.99785
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.533326
		terraceProb     0.224748
		erosion         0
		montesMagn      0.507952
		montesFreq      2.83028
		montesSpiky     0.937269
		montesFraction  0.265864
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00221285
		hillsFraction   0.430138
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.269819
		craterFreq      0.23193
		craterDensity   0.817642
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.483624
		volcanoTemp     1738.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.287, 0.249, 0.205, 0.000)
		colorShelf     (0.294, 0.257, 0.234, 0.000)
		colorBeach     (0.346, 0.300, 0.278, 0.000)
		colorDesert    (0.375, 0.322, 0.271, 0.000)
		colorLowland   (0.412, 0.344, 0.307, 0.000)
		colorUpland    (0.456, 0.418, 0.373, 0.000)
		colorRock      (0.493, 0.454, 0.402, 0.000)
		colorSnow      (0.537, 0.484, 0.424, 1.000)
		BumpHeight      1.04923
		BumpOffset      0.209847
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.357849
		GasToDust   0.25
		Particles   1702
		GasBright   0.202686
		DustBright  0.308203
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   59.2325
		Period          332.92
		Eccentricity    0.928978
		Inclination     -127.398
		AscendingNode   74.0586
		ArgOfPericenter -102.721
		MeanAnomaly     161.925
	}
}

Comet	"Ciutric 67"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            5.00403e-009
	Radius          25.1828
	InertiaMoment   0.397041

	Oblateness      0.0063032

	RotationPeriod  69.1598
	Obliquity       29.2738
	EqAscendNode    45.6807
	Precession      0

	AbsMagn         9.48478
	SlopeParam      5.80599
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.471 0.467 0.460)

	Surface
	{
		SurfStyle       0.258065
		OceanStyle      0.0219433
		Randomize      (0.813, -0.859, -0.417)
		colorDistMagn   0.837463
		colorDistFreq   0.192641
		detailScale     687.658
		colorConversion true
		snowLevel       2
		tropicLatitude  0.652992
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.361099
		terraceProb     0.243255
		erosion         0
		montesMagn      0.441541
		montesFreq      2.68361
		montesSpiky     0.871651
		montesFraction  0.421173
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.5615
		hillsFraction   0.551483
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240326
		craterFreq      0.188446
		craterDensity   0.807025
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.489056
		volcanoTemp     1161.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.189, 0.187, 0.184, 0.000)
		colorShelf     (0.200, 0.198, 0.195, 0.000)
		colorBeach     (0.212, 0.210, 0.207, 0.000)
		colorDesert    (0.224, 0.222, 0.218, 0.000)
		colorLowland   (0.236, 0.233, 0.230, 0.000)
		colorUpland    (0.247, 0.245, 0.241, 0.000)
		colorRock      (0.259, 0.257, 0.253, 0.000)
		colorSnow      (0.271, 0.268, 0.264, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.839041
		GasToDust   0.25
		Particles   2674
		GasBright   0.453669
		DustBright  0.541707
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   53.9121
		Period          289.088
		Eccentricity    0.938564
		Inclination     -67.5233
		AscendingNode   20.2609
		ArgOfPericenter 111.393
		MeanAnomaly     68.1715
	}
}

Comet	"Ciutric 68"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            1.54078e-016
	Radius          0.0722024
	InertiaMoment   0.39929

	Oblateness      0.00517748

	RotationPeriod  67.0452
	Obliquity       342.479
	EqAscendNode    30.2581
	Precession      0

	AbsMagn         5.98256
	SlopeParam      6.93402
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.433 0.427 0.423)

	Surface
	{
		SurfStyle       0.178251
		OceanStyle      0.113095
		Randomize      (0.425, 0.504, -0.785)
		colorDistMagn   0.291175
		colorDistFreq   3.30771e-006
		detailScale     1.97161
		colorConversion true
		snowLevel       2
		tropicLatitude  0.950216
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.66927
		terraceProb     0.360848
		erosion         0
		montesMagn      0.359098
		montesFreq      3.02828
		montesSpiky     0.853809
		montesFraction  0.360621
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.46178e-005
		hillsFraction   0.689278
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263995
		craterFreq      0.258635
		craterDensity   0.960609
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.430538
		volcanoTemp     1259.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.173, 0.171, 0.169, 0.000)
		colorShelf     (0.184, 0.182, 0.180, 0.000)
		colorBeach     (0.195, 0.192, 0.191, 0.000)
		colorDesert    (0.206, 0.203, 0.201, 0.000)
		colorLowland   (0.216, 0.214, 0.212, 0.000)
		colorUpland    (0.227, 0.224, 0.222, 0.000)
		colorRock      (0.238, 0.235, 0.233, 0.000)
		colorSnow      (0.249, 0.246, 0.243, 1.000)
		BumpHeight      0.0649822
		BumpOffset      0.0129964
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.010077
		DustBright  0.669785
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   41.5327
		Period          195.473
		Eccentricity    0.92148
		Inclination     -118.249
		AscendingNode   -121.805
		ArgOfPericenter 28.5413
		MeanAnomaly     33.8376
	}
}

Comet	"Ciutric 69"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            1.19168e-012
	Radius          1.55957
	InertiaMoment   0.397953

	Oblateness      0.00714274

	RotationPeriod  64.9944
	Obliquity       295.685
	EqAscendNode    14.8355
	Precession      0

	AbsMagn         15.0828
	SlopeParam      2.3135
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.750 0.748 0.746)

	Surface
	{
		SurfStyle       0.363972
		OceanStyle      0.888396
		Randomize      (-0.295, -0.308, -0.719)
		colorDistMagn   0.92811
		colorDistFreq   0.00149593
		detailScale     42.5867
		colorConversion true
		snowLevel       2
		tropicLatitude  0.914627
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.315946
		terraceProb     0.212905
		erosion         0
		montesMagn      0.597028
		montesFreq      2.10379
		montesSpiky     0.975241
		montesFraction  0.434349
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00430651
		hillsFraction   0.535922
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239723
		craterFreq      0.174036
		craterDensity   0.788289
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.444596
		volcanoTemp     1447.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.300, 0.299, 0.298, 0.000)
		colorShelf     (0.319, 0.318, 0.317, 0.000)
		colorBeach     (0.338, 0.336, 0.336, 0.000)
		colorDesert    (0.356, 0.355, 0.354, 0.000)
		colorLowland   (0.375, 0.374, 0.373, 0.000)
		colorUpland    (0.394, 0.393, 0.391, 0.000)
		colorRock      (0.413, 0.411, 0.410, 0.000)
		colorSnow      (0.431, 0.430, 0.429, 1.000)
		BumpHeight      1.40361
		BumpOffset      0.280723
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.390675
		GasToDust   0.25
		Particles   1769
		GasBright   0.0269135
		DustBright  0.337435
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   79.3419
		Period          516.125
		Eccentricity    0.958243
		Inclination     -174.208
		AscendingNode   -107.214
		ArgOfPericenter -68.0575
		MeanAnomaly     -16.9539
	}
}

Comet	"Ciutric 70"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            9.21682e-009
	Radius          28.2144
	InertiaMoment   0.399722

	Oblateness      0.00585909

	RotationPeriod  62.9973
	Obliquity       248.891
	EqAscendNode    359.413
	Precession      0

	AbsMagn         9.26344
	SlopeParam      3.01748
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.717 0.714 0.713)

	Surface
	{
		SurfStyle       0.0419845
		OceanStyle      0.416001
		Randomize      (0.715, -0.110, -0.731)
		colorDistMagn   0.975336
		colorDistFreq   0.444644
		detailScale     770.44
		colorConversion true
		snowLevel       2
		tropicLatitude  0.872129
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.597535
		terraceProb     0.485897
		erosion         0
		montesMagn      0.453736
		montesFreq      3.20712
		montesSpiky     0.975552
		montesFraction  0.593991
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.77021
		hillsFraction   0.655376
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263403
		craterFreq      0.227635
		craterDensity   0.829547
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.467375
		volcanoTemp     1317.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.287, 0.286, 0.285, 0.000)
		colorShelf     (0.305, 0.303, 0.303, 0.000)
		colorBeach     (0.323, 0.321, 0.321, 0.000)
		colorDesert    (0.341, 0.339, 0.338, 0.000)
		colorLowland   (0.358, 0.357, 0.356, 0.000)
		colorUpland    (0.376, 0.375, 0.374, 0.000)
		colorRock      (0.394, 0.393, 0.392, 0.000)
		colorSnow      (0.412, 0.411, 0.410, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.871867
		GasToDust   0.25
		Particles   2741
		GasBright   0.112821
		DustBright  0.736015
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   85.5268
		Period          577.636
		Eccentricity    0.931923
		Inclination     -9.65212
		AscendingNode   -30.889
		ArgOfPericenter 84.8874
		MeanAnomaly     -124.532
	}
}

Comet	"Ciutric 71"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            2.83793e-016
	Radius          0.0965849
	InertiaMoment   0.398565

	Oblateness      0.00809432

	RotationPeriod  61.0454
	Obliquity       202.097
	EqAscendNode    343.99
	Precession      0

	AbsMagn         5.74187
	SlopeParam      3.61512
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.460 0.453 0.450)

	Surface
	{
		SurfStyle       0.697427
		OceanStyle      0.597138
		Randomize      (-0.230, 0.535, 0.160)
		colorDistMagn   0.634529
		colorDistFreq   2.07913e-006
		detailScale     2.63741
		colorConversion true
		snowLevel       2
		tropicLatitude  0.490873
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.70104
		terraceProb     0.440663
		erosion         0
		montesMagn      0.42456
		montesFreq      3.75313
		montesSpiky     0.938008
		montesFraction  0.682024
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.21544e-005
		hillsFraction   0.636182
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249887
		craterFreq      0.214369
		craterDensity   1.097
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49385
		volcanoTemp     1684.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.179, 0.154, 0.126, 0.000)
		colorShelf     (0.184, 0.159, 0.144, 0.000)
		colorBeach     (0.216, 0.186, 0.171, 0.000)
		colorDesert    (0.235, 0.199, 0.166, 0.000)
		colorLowland   (0.258, 0.213, 0.189, 0.000)
		colorUpland    (0.285, 0.258, 0.229, 0.000)
		colorRock      (0.308, 0.281, 0.247, 0.000)
		colorSnow      (0.336, 0.299, 0.261, 1.000)
		BumpHeight      0.0869264
		BumpOffset      0.0173853
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.102375
		DustBright  0.430947
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   76.6834
		Period          490.402
		Eccentricity    0.935832
		Inclination     -146.793
		AscendingNode   117.77
		ArgOfPericenter -60.7817
		MeanAnomaly     -19.7008
	}
}

Comet	"Ciutric 72"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            2.19493e-012
	Radius          1.74737
	InertiaMoment   0.396186

	Oblateness      0.00654619

	RotationPeriod  59.1311
	Obliquity       155.302
	EqAscendNode    328.568
	Precession      0

	AbsMagn         14.249
	SlopeParam      4.17959
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.729 0.682 0.590)

	Surface
	{
		SurfStyle       0.975912
		OceanStyle      0.179659
		Randomize      (0.455, 0.630, -0.445)
		colorDistMagn   0.843022
		colorDistFreq   0.00223145
		detailScale     47.7149
		colorConversion true
		snowLevel       2
		tropicLatitude  0.794594
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.758212
		terraceProb     0.456544
		erosion         0
		montesMagn      0.577991
		montesFreq      3.68198
		montesSpiky     0.91707
		montesFraction  0.262898
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00678572
		hillsFraction   0.593763
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234829
		craterFreq      0.180137
		craterDensity   0.917365
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.488916
		volcanoTemp     1333.25
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.248, 0.239, 0.236, 0.050)
		colorShelf     (0.292, 0.280, 0.271, 0.040)
		colorBeach     (0.335, 0.321, 0.307, 0.030)
		colorDesert    (0.379, 0.361, 0.348, 0.020)
		colorLowland   (0.423, 0.402, 0.383, 0.030)
		colorUpland    (0.467, 0.443, 0.419, 0.050)
		colorRock      (0.510, 0.484, 0.466, 0.020)
		colorSnow      (0.510, 0.484, 0.466, 1.000)
		BumpHeight      1.57264
		BumpOffset      0.314527
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.423501
		GasToDust   0.25
		Particles   1835
		GasBright   0.0546706
		DustBright  0.163138
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   43.0842
		Period          206.528
		Eccentricity    0.899697
		Inclination     74.6498
		AscendingNode   24.5026
		ArgOfPericenter 179.159
		MeanAnomaly     29.8072
	}
}

Comet	"Ciutric 73"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            1.69762e-008
	Radius          37.7413
	InertiaMoment   0.399065

	Oblateness      0.0091974

	RotationPeriod  57.2478
	Obliquity       108.508
	EqAscendNode    313.145
	Precession      0

	AbsMagn         9.0459
	SlopeParam      4.75905
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.488 0.481 0.477)

	Surface
	{
		SurfStyle       0.939052
		OceanStyle      0.120611
		Randomize      (0.422, -0.810, -0.202)
		colorDistMagn   0.729467
		colorDistFreq   0.696274
		detailScale     1030.59
		colorConversion true
		snowLevel       2
		tropicLatitude  0.99002
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.314396
		terraceProb     0.170181
		erosion         0
		montesMagn      0.466901
		montesFreq      4.09912
		montesSpiky     0.902112
		montesFraction  0.452456
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.17111
		hillsFraction   0.748252
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263638
		craterFreq      0.276204
		craterDensity   1.028
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.501129
		volcanoTemp     1720.25
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.166, 0.168, 0.191, 0.050)
		colorShelf     (0.195, 0.197, 0.219, 0.040)
		colorBeach     (0.224, 0.226, 0.248, 0.030)
		colorDesert    (0.254, 0.255, 0.281, 0.020)
		colorLowland   (0.283, 0.284, 0.310, 0.030)
		colorUpland    (0.312, 0.313, 0.339, 0.050)
		colorRock      (0.342, 0.342, 0.377, 0.020)
		colorSnow      (0.342, 0.342, 0.377, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.904693
		GasToDust   0.25
		Particles   2807
		GasBright   0.217745
		DustBright  0.48455
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   53.1909
		Period          283.307
		Eccentricity    0.934334
		Inclination     122.317
		AscendingNode   67.1945
		ArgOfPericenter 1.12155
		MeanAnomaly     -19.4255
	}
}

Comet	"Ciutric 74"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            5.22712e-016
	Radius          0.108217
	InertiaMoment   0.397566

	Oblateness      0.00748007

	RotationPeriod  55.3895
	Obliquity       61.7137
	EqAscendNode    297.723
	Precession      0

	AbsMagn         5.49271
	SlopeParam      5.41214
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.494 0.489 0.483)

	Surface
	{
		SurfStyle       0.916321
		OceanStyle      0.846477
		Randomize      (-0.508, 0.664, 0.203)
		colorDistMagn   0.680274
		colorDistFreq   2.48098e-006
		detailScale     2.95506
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998472
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.709805
		terraceProb     0.325436
		erosion         0
		montesMagn      0.689801
		montesFreq      4.06466
		montesSpiky     0.975899
		montesFraction  0.514493
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.6478e-005
		hillsFraction   0.519946
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.268883
		craterFreq      0.219874
		craterDensity   0.976932
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.468228
		volcanoTemp     1394.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.168, 0.171, 0.193, 0.050)
		colorShelf     (0.198, 0.201, 0.222, 0.040)
		colorBeach     (0.227, 0.230, 0.251, 0.030)
		colorDesert    (0.257, 0.259, 0.285, 0.020)
		colorLowland   (0.286, 0.289, 0.314, 0.030)
		colorUpland    (0.316, 0.318, 0.343, 0.050)
		colorRock      (0.346, 0.347, 0.381, 0.020)
		colorSnow      (0.346, 0.347, 0.381, 1.000)
		BumpHeight      0.0973956
		BumpOffset      0.0194791
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.142759
		DustBright  0.244023
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   55.0002
		Period          297.884
		Eccentricity    0.944137
		Inclination     56.1103
		AscendingNode   73.3887
		ArgOfPericenter 120.117
		MeanAnomaly     160.561
	}
}

Comet	"Ciutric 75"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            4.04279e-012
	Radius          2.33737
	InertiaMoment   0.399511

	Oblateness      0.010502

	RotationPeriod  53.5507
	Obliquity       14.9194
	EqAscendNode    282.3
	Precession      0

	AbsMagn         13.6224
	SlopeParam      6.27184
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.568 0.463 0.427)

	Surface
	{
		SurfStyle       0.494989
		OceanStyle      0.991355
		Randomize      (0.540, -0.287, -0.192)
		colorDistMagn   0.676817
		colorDistFreq   0.00237994
		detailScale     63.8258
		colorConversion true
		snowLevel       2
		tropicLatitude  0.987908
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.373667
		terraceProb     0.409074
		erosion         0
		montesMagn      0.648653
		montesFreq      2.98958
		montesSpiky     0.776246
		montesFraction  0.470467
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0149545
		hillsFraction   0.61922
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234429
		craterFreq      0.233065
		craterDensity   0.821535
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.488806
		volcanoTemp     1583.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.227, 0.185, 0.171, 0.000)
		colorShelf     (0.241, 0.197, 0.182, 0.000)
		colorBeach     (0.256, 0.208, 0.192, 0.000)
		colorDesert    (0.270, 0.220, 0.203, 0.000)
		colorLowland   (0.284, 0.232, 0.214, 0.000)
		colorUpland    (0.298, 0.243, 0.224, 0.000)
		colorRock      (0.312, 0.255, 0.235, 0.000)
		colorSnow      (0.326, 0.266, 0.246, 1.000)
		BumpHeight      2.10363
		BumpOffset      0.420727
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.456327
		GasToDust   0.25
		Particles   1901
		GasBright   0.373024
		DustBright  0.498245
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   48.2972
		Period          245.123
		Eccentricity    0.933411
		Inclination     -91.234
		AscendingNode   121.431
		ArgOfPericenter 123.388
		MeanAnomaly     110.114
	}
}

Comet	"Ciutric 76"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            3.12681e-008
	Radius          42.2867
	InertiaMoment   0.398283

	Oblateness      0.00857805

	RotationPeriod  51.7263
	Obliquity       328.125
	EqAscendNode    266.877
	Precession      0

	AbsMagn         8.83142
	SlopeParam      8.29292
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.696 0.622 0.566)

	Surface
	{
		SurfStyle       0.485854
		OceanStyle      0.882944
		Randomize      (0.120, -0.893, -0.743)
		colorDistMagn   0.750914
		colorDistFreq   0.285521
		detailScale     1154.71
		colorConversion true
		snowLevel       2
		tropicLatitude  0.925104
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.516659
		terraceProb     0.273313
		erosion         0
		montesMagn      0.54144
		montesFreq      2.83632
		montesSpiky     0.860882
		montesFraction  0.56834
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.77535
		hillsFraction   0.714286
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.278836
		craterFreq      0.254188
		craterDensity   1.03801
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.509942
		volcanoTemp     1576.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.278, 0.249, 0.227, 0.000)
		colorShelf     (0.296, 0.264, 0.241, 0.000)
		colorBeach     (0.313, 0.280, 0.255, 0.000)
		colorDesert    (0.331, 0.295, 0.269, 0.000)
		colorLowland   (0.348, 0.311, 0.283, 0.000)
		colorUpland    (0.366, 0.327, 0.297, 0.000)
		colorRock      (0.383, 0.342, 0.311, 0.000)
		colorSnow      (0.400, 0.358, 0.326, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.937519
		GasToDust   0.25
		Particles   2873
		GasBright   0.270755
		DustBright  0.285
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   46.9247
		Period          234.748
		Eccentricity    0.90995
		Inclination     -92.2909
		AscendingNode   -141.626
		ArgOfPericenter 121.897
		MeanAnomaly     -164.957
	}
}

Comet	"Ciutric 77"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            9.62766e-016
	Radius          0.144757
	InertiaMoment   0.399935

	Oblateness      0.0120779

	RotationPeriod  49.9114
	Obliquity       281.331
	EqAscendNode    251.455
	Precession      0

	AbsMagn         5.23341
	SlopeParam      2.68116
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.800 0.733 0.630)

	Surface
	{
		SurfStyle       0.706601
		OceanStyle      0.230201
		Randomize      (-0.971, 0.411, 0.506)
		colorDistMagn   0.366464
		colorDistFreq   1.54723e-005
		detailScale     3.95284
		colorConversion true
		snowLevel       2
		tropicLatitude  0.987256
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.577197
		terraceProb     0.126808
		erosion         0
		montesMagn      0.576053
		montesFreq      2.81695
		montesSpiky     0.96987
		montesFraction  0.511956
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.85425e-005
		hillsFraction   0.567913
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.206592
		craterFreq      0.184485
		craterDensity   0.929119
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.480301
		volcanoTemp     1653.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.312, 0.249, 0.177, 0.000)
		colorShelf     (0.320, 0.257, 0.202, 0.000)
		colorBeach     (0.376, 0.301, 0.240, 0.000)
		colorDesert    (0.408, 0.323, 0.233, 0.000)
		colorLowland   (0.448, 0.345, 0.265, 0.000)
		colorUpland    (0.496, 0.418, 0.322, 0.000)
		colorRock      (0.536, 0.455, 0.347, 0.000)
		colorSnow      (0.584, 0.484, 0.366, 1.000)
		BumpHeight      0.130282
		BumpOffset      0.0260563
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0111062
		DustBright  0.229135
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   56.8109
		Period          312.715
		Eccentricity    0.930948
		Inclination     -166.173
		AscendingNode   97.7596
		ArgOfPericenter -179.71
		MeanAnomaly     79.8979
	}
}

Comet	"Ciutric 78"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            7.44631e-012
	Radius          2.61883
	InertiaMoment   0.398827

	Oblateness      0.00991408

	RotationPeriod  48.1013
	Obliquity       234.537
	EqAscendNode    236.032
	Precession      0

	AbsMagn         13.1096
	SlopeParam      3.3198
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.765 0.761 0.760)

	Surface
	{
		SurfStyle       0.748917
		OceanStyle      0.821551
		Randomize      (0.985, 0.774, -0.235)
		colorDistMagn   0.649279
		colorDistFreq   0.00412835
		detailScale     71.5115
		colorConversion true
		snowLevel       2
		tropicLatitude  0.785548
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.528115
		terraceProb     0.204587
		erosion         0
		montesMagn      0.587372
		montesFreq      3.1122
		montesSpiky     0.981058
		montesFraction  0.388887
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0125099
		hillsFraction   0.515647
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214913
		craterFreq      0.230499
		craterDensity   1.0403
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.465823
		volcanoTemp     1282.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.298, 0.259, 0.213, 0.000)
		colorShelf     (0.306, 0.266, 0.243, 0.000)
		colorBeach     (0.360, 0.312, 0.289, 0.000)
		colorDesert    (0.390, 0.335, 0.281, 0.000)
		colorLowland   (0.428, 0.358, 0.319, 0.000)
		colorUpland    (0.474, 0.434, 0.388, 0.000)
		colorRock      (0.513, 0.472, 0.418, 0.000)
		colorSnow      (0.559, 0.503, 0.441, 1.000)
		BumpHeight      2.35695
		BumpOffset      0.471389
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.489153
		GasToDust   0.25
		Particles   1967
		GasBright   0.0762955
		DustBright  0.648433
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   86.9584
		Period          592.199
		Eccentricity    0.945045
		Inclination     -137.22
		AscendingNode   110.416
		ArgOfPericenter 95.9612
		MeanAnomaly     119.561
	}
}

Comet	"Ciutric 79"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            5.75919e-008
	Radius          56.5662
	InertiaMoment   0.397056

	Oblateness      0.0138551

	RotationPeriod  46.2915
	Obliquity       187.742
	EqAscendNode    220.61
	Precession      0

	AbsMagn         8.6193
	SlopeParam      3.89451
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.781 0.780 0.778)

	Surface
	{
		SurfStyle       0.85901
		OceanStyle      0.0578697
		Randomize      (0.220, -0.937, -0.977)
		colorDistMagn   0.144222
		colorDistFreq   1.19998
		detailScale     1544.64
		colorConversion true
		snowLevel       2
		tropicLatitude  0.942593
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.323073
		terraceProb     0.167578
		erosion         0
		montesMagn      0.465468
		montesFreq      2.24404
		montesSpiky     0.756853
		montesFraction  0.741767
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.23349
		hillsFraction   0.65147
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220761
		craterFreq      0.192339
		craterDensity   0.824758
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.462562
		volcanoTemp     1442.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.266, 0.273, 0.311, 0.050)
		colorShelf     (0.312, 0.320, 0.358, 0.040)
		colorBeach     (0.359, 0.366, 0.404, 0.030)
		colorDesert    (0.406, 0.413, 0.459, 0.020)
		colorLowland   (0.453, 0.460, 0.505, 0.030)
		colorUpland    (0.500, 0.507, 0.552, 0.050)
		colorRock      (0.547, 0.554, 0.614, 0.020)
		colorSnow      (0.547, 0.554, 0.614, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.970345
		GasToDust   0.25
		Particles   2940
		GasBright   0.0672421
		DustBright  0.341973
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   52.5652
		Period          278.322
		Eccentricity    0.908056
		Inclination     -75.5228
		AscendingNode   -48.6197
		ArgOfPericenter 27.8429
		MeanAnomaly     -62.7134
	}
}

Comet	"Ciutric 80"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            1.7733e-015
	Radius          0.162183
	InertiaMoment   0.399295

	Oblateness      0.0115853

	RotationPeriod  44.4774
	Obliquity       140.948
	EqAscendNode    205.187
	Precession      0

	AbsMagn         4.96192
	SlopeParam      4.46046
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.538 0.536 0.533)

	Surface
	{
		SurfStyle       0.819327
		OceanStyle      0.311646
		Randomize      (0.510, -0.055, -0.403)
		colorDistMagn   0.961142
		colorDistFreq   1.71806e-005
		detailScale     4.42868
		colorConversion true
		snowLevel       2
		tropicLatitude  0.942496
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.559371
		terraceProb     0.301684
		erosion         0
		montesMagn      0.510697
		montesFreq      3.02594
		montesSpiky     0.948949
		montesFraction  0.616558
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.83247e-005
		hillsFraction   0.774451
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252223
		craterFreq      0.218707
		craterDensity   0.967878
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.432892
		volcanoTemp     1672.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.210, 0.182, 0.149, 0.000)
		colorShelf     (0.215, 0.188, 0.170, 0.000)
		colorBeach     (0.253, 0.220, 0.202, 0.000)
		colorDesert    (0.274, 0.236, 0.197, 0.000)
		colorLowland   (0.301, 0.252, 0.224, 0.000)
		colorUpland    (0.334, 0.305, 0.272, 0.000)
		colorRock      (0.361, 0.332, 0.293, 0.000)
		colorSnow      (0.393, 0.354, 0.309, 1.000)
		BumpHeight      0.145965
		BumpOffset      0.029193
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0407867
		GasToDust   0.25
		Particles   1062
		GasBright   0.199622
		DustBright  0.69408
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   46.244
		Period          229.659
		Eccentricity    0.88953
		Inclination     106.339
		AscendingNode   -23.9126
		ArgOfPericenter 45.5509
		MeanAnomaly     67.3115
	}
}

Comet	"Ciutric 81"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            1.37152e-011
	Radius          3.50329
	InertiaMoment   0.397961

	Oblateness      0.0163335

	RotationPeriod  42.6543
	Obliquity       94.1536
	EqAscendNode    189.764
	Precession      0

	AbsMagn         12.6693
	SlopeParam      5.06679
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.757 0.706 0.671)

	Surface
	{
		SurfStyle       0.484205
		OceanStyle      0.271922
		Randomize      (0.492, 0.012, -0.344)
		colorDistMagn   0.594881
		colorDistFreq   0.00439149
		detailScale     95.6632
		colorConversion true
		snowLevel       2
		tropicLatitude  0.945262
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.583582
		terraceProb     0.409828
		erosion         0
		montesMagn      0.516673
		montesFreq      4.42559
		montesSpiky     0.910824
		montesFraction  0.184489
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0149577
		hillsFraction   0.654723
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233023
		craterFreq      0.236491
		craterDensity   0.723019
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.526201
		volcanoTemp     1202.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.303, 0.282, 0.268, 0.000)
		colorShelf     (0.322, 0.300, 0.285, 0.000)
		colorBeach     (0.341, 0.318, 0.302, 0.000)
		colorDesert    (0.359, 0.335, 0.319, 0.000)
		colorLowland   (0.378, 0.353, 0.336, 0.000)
		colorUpland    (0.397, 0.371, 0.352, 0.000)
		colorRock      (0.416, 0.388, 0.369, 0.000)
		colorSnow      (0.435, 0.406, 0.386, 1.000)
		BumpHeight      3.15296
		BumpOffset      0.630593
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.521979
		GasToDust   0.25
		Particles   2034
		GasBright   0.163286
		DustBright  0.414902
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   46.7097
		Period          233.137
		Eccentricity    0.941959
		Inclination     35.9779
		AscendingNode   -131.067
		ArgOfPericenter -0.496823
		MeanAnomaly     30.1599
	}
}

Comet	"Ciutric 82"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            1.06077e-007
	Radius          63.3724
	InertiaMoment   0.399727

	Oblateness      0.0137418

	RotationPeriod  40.8173
	Obliquity       47.3593
	EqAscendNode    174.342
	Precession      0

	AbsMagn         8.40891
	SlopeParam      5.79443
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.506 0.500 0.497)

	Surface
	{
		SurfStyle       0.424829
		OceanStyle      0.226696
		Randomize      (0.391, 0.335, 0.695)
		colorDistMagn   0.776
		colorDistFreq   2.20874
		detailScale     1730.49
		colorConversion true
		snowLevel       2
		tropicLatitude  0.532428
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.412038
		terraceProb     0.535328
		erosion         0
		montesMagn      0.415189
		montesFreq      3.78429
		montesSpiky     0.990228
		montesFraction  0.700339
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.59916
		hillsFraction   0.701428
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.200659
		craterFreq      0.27788
		craterDensity   0.954259
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.495607
		volcanoTemp     1399
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.202, 0.200, 0.199, 0.000)
		colorShelf     (0.215, 0.212, 0.211, 0.000)
		colorBeach     (0.227, 0.225, 0.224, 0.000)
		colorDesert    (0.240, 0.237, 0.236, 0.000)
		colorLowland   (0.253, 0.250, 0.249, 0.000)
		colorUpland    (0.265, 0.262, 0.261, 0.000)
		colorRock      (0.278, 0.275, 0.274, 0.000)
		colorSnow      (0.291, 0.287, 0.286, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0896916
		DustBright  0.172983
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   55.2235
		Period          299.7
		Eccentricity    0.948961
		Inclination     -51.0873
		AscendingNode   -42.6524
		ArgOfPericenter 122.641
		MeanAnomaly     -21.2313
	}
}

Comet	"Ciutric 83"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            3.2662e-015
	Radius          0.21697
	InertiaMoment   0.398572

	Oblateness      0.0195728

	RotationPeriod  38.9614
	Obliquity       0.56504
	EqAscendNode    158.919
	Precession      0

	AbsMagn         4.67565
	SlopeParam      6.91157
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.655 0.596 0.556)

	Surface
	{
		SurfStyle       0.525742
		OceanStyle      0.597793
		Randomize      (-0.547, 0.847, -0.624)
		colorDistMagn   0.241792
		colorDistFreq   2.68812e-005
		detailScale     5.92471
		colorConversion true
		snowLevel       2
		tropicLatitude  0.89324
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.703291
		terraceProb     0.113606
		erosion         0
		montesMagn      0.490458
		montesFreq      2.45501
		montesSpiky     0.972442
		montesFraction  0.863647
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000149362
		hillsFraction   0.710037
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238766
		craterFreq      0.221887
		craterDensity   1.04368
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.403184
		volcanoTemp     1521.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.256, 0.203, 0.156, 0.000)
		colorShelf     (0.262, 0.209, 0.178, 0.000)
		colorBeach     (0.308, 0.244, 0.211, 0.000)
		colorDesert    (0.334, 0.262, 0.206, 0.000)
		colorLowland   (0.367, 0.280, 0.234, 0.000)
		colorUpland    (0.406, 0.340, 0.284, 0.000)
		colorRock      (0.439, 0.370, 0.306, 0.000)
		colorSnow      (0.478, 0.393, 0.323, 1.000)
		BumpHeight      0.195273
		BumpOffset      0.0390545
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0736127
		GasToDust   0.25
		Particles   1128
		GasBright   0.299239
		DustBright  0.447922
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   60.3543
		Period          342.423
		Eccentricity    0.946854
		Inclination     116.952
		AscendingNode   114.509
		ArgOfPericenter -15.6241
		MeanAnomaly     -176.441
	}
}

Comet	"Ciutric 84"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            2.52616e-011
	Radius          3.92455
	InertiaMoment   0.396218

	Oblateness      0.0163883

	RotationPeriod  37.0812
	Obliquity       313.771
	EqAscendNode    143.497
	Precession      0

	AbsMagn         12.2793
	SlopeParam      2.30247
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.539 0.536 0.533)

	Surface
	{
		SurfStyle       0.616101
		OceanStyle      0.45455
		Randomize      (-0.912, -0.894, -0.801)
		colorDistMagn   0.634384
		colorDistFreq   0.011272
		detailScale     107.166
		colorConversion true
		snowLevel       2
		tropicLatitude  0.966445
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.497204
		terraceProb     0.151152
		erosion         0
		montesMagn      0.539757
		montesFreq      2.89698
		montesSpiky     0.802231
		montesFraction  0.711851
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.037073
		hillsFraction   0.466474
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249965
		craterFreq      0.220315
		craterDensity   0.779559
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.553686
		volcanoTemp     1380.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.210, 0.182, 0.149, 0.000)
		colorShelf     (0.216, 0.188, 0.171, 0.000)
		colorBeach     (0.254, 0.220, 0.203, 0.000)
		colorDesert    (0.275, 0.236, 0.197, 0.000)
		colorLowland   (0.302, 0.252, 0.224, 0.000)
		colorUpland    (0.334, 0.305, 0.272, 0.000)
		colorRock      (0.361, 0.332, 0.293, 0.000)
		colorSnow      (0.394, 0.354, 0.309, 1.000)
		BumpHeight      3.53209
		BumpOffset      0.706418
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.554805
		GasToDust   0.25
		Particles   2100
		GasBright   0.198362
		DustBright  0.233286
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   30.4255
		Period          122.563
		Eccentricity    0.870554
		Inclination     82.8651
		AscendingNode   -76.1972
		ArgOfPericenter -12.6087
		MeanAnomaly     -85.4251
	}
}

Comet	"Ciutric 85"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            1.95381e-007
	Radius          84.7858
	InertiaMoment   0.399071

	Oblateness      0.0240053

	RotationPeriod  35.1707
	Obliquity       266.976
	EqAscendNode    128.074
	Precession      0

	AbsMagn         8.19965
	SlopeParam      3.00877
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.816 0.772 0.748)

	Surface
	{
		SurfStyle       0.0423959
		OceanStyle      0.257182
		Randomize      (0.711, -0.392, 0.877)
		colorDistMagn   0.674421
		colorDistFreq   5.90868
		detailScale     2315.22
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999859
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.445273
		terraceProb     0.239591
		erosion         0
		montesMagn      0.654878
		montesFreq      2.89189
		montesSpiky     0.967328
		montesFraction  0.503906
		dunesFraction   0
		hillsMagn       0
		hillsFreq       24.879
		hillsFraction   0.809579
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256944
		craterFreq      0.2743
		craterDensity   0.992743
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.5384
		volcanoTemp     1484.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.326, 0.309, 0.299, 0.000)
		colorShelf     (0.347, 0.328, 0.318, 0.000)
		colorBeach     (0.367, 0.348, 0.337, 0.000)
		colorDesert    (0.387, 0.367, 0.355, 0.000)
		colorLowland   (0.408, 0.386, 0.374, 0.000)
		colorUpland    (0.428, 0.406, 0.393, 0.000)
		colorRock      (0.449, 0.425, 0.411, 0.000)
		colorSnow      (0.469, 0.444, 0.430, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0170322
		DustBright  0.899102
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   71.0319
		Period          437.201
		Eccentricity    0.958954
		Inclination     -43.0366
		AscendingNode   -91.8278
		ArgOfPericenter -32.0841
		MeanAnomaly     -111.176
	}
}

Comet	"Ciutric 86"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            6.01591e-015
	Radius          0.243038
	InertiaMoment   0.397577

	Oblateness      0.0204635

	RotationPeriod  33.2234
	Obliquity       220.182
	EqAscendNode    112.651
	Precession      0

	AbsMagn         4.37125
	SlopeParam      3.60725
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.605 0.598 0.594)

	Surface
	{
		SurfStyle       0.64868
		OceanStyle      0.42795
		Randomize      (-0.952, -0.420, -0.869)
		colorDistMagn   0.719935
		colorDistFreq   4.46104e-005
		detailScale     6.63655
		colorConversion true
		snowLevel       2
		tropicLatitude  0.637805
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.288975
		terraceProb     0.101186
		erosion         0
		montesMagn      0.331116
		montesFreq      3.61353
		montesSpiky     0.897175
		montesFraction  0.821949
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000113164
		hillsFraction   0.496147
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252076
		craterFreq      0.213851
		craterDensity   0.913606
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.523425
		volcanoTemp     1507
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.236, 0.203, 0.166, 0.000)
		colorShelf     (0.242, 0.209, 0.190, 0.000)
		colorBeach     (0.284, 0.245, 0.226, 0.000)
		colorDesert    (0.308, 0.263, 0.220, 0.000)
		colorLowland   (0.339, 0.281, 0.250, 0.000)
		colorUpland    (0.375, 0.341, 0.303, 0.000)
		colorRock      (0.405, 0.370, 0.327, 0.000)
		colorSnow      (0.441, 0.394, 0.345, 1.000)
		BumpHeight      0.218734
		BumpOffset      0.0437468
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.106438
		GasToDust   0.25
		Particles   1194
		GasBright   0.0466302
		DustBright  0.55399
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   54.381
		Period          292.868
		Eccentricity    0.937702
		Inclination     1.2274
		AscendingNode   117.474
		ArgOfPericenter -9.89761
		MeanAnomaly     -59.0682
	}
}

Comet	"Ciutric 87"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            4.65287e-011
	Radius          5.2511
	InertiaMoment   0.399517

	Oblateness      0.030419

	RotationPeriod  31.2318
	Obliquity       173.388
	EqAscendNode    97.2289
	Precession      0

	AbsMagn         11.9263
	SlopeParam      4.17184
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.525 0.521 0.518)

	Surface
	{
		SurfStyle       0.340051
		OceanStyle      0.251976
		Randomize      (-0.591, -0.154, -0.972)
		colorDistMagn   0.0412259
		colorDistFreq   0.00141499
		detailScale     143.39
		colorConversion true
		snowLevel       2
		tropicLatitude  0.504845
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.563185
		terraceProb     0.120477
		erosion         0
		montesMagn      0.554675
		montesFreq      3.23428
		montesSpiky     0.988766
		montesFraction  0.563137
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0732652
		hillsFraction   0.607299
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237462
		craterFreq      0.203035
		craterDensity   1.02647
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.573878
		volcanoTemp     1268.14
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.210, 0.208, 0.207, 0.000)
		colorShelf     (0.223, 0.221, 0.220, 0.000)
		colorBeach     (0.236, 0.234, 0.233, 0.000)
		colorDesert    (0.250, 0.247, 0.246, 0.000)
		colorLowland   (0.263, 0.260, 0.259, 0.000)
		colorUpland    (0.276, 0.273, 0.272, 0.000)
		colorRock      (0.289, 0.286, 0.285, 0.000)
		colorSnow      (0.302, 0.299, 0.298, 1.000)
		BumpHeight      4.72599
		BumpOffset      0.945198
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.58763
		GasToDust   0.25
		Particles   2166
		GasBright   0.038969
		DustBright  0.246138
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   67.8159
		Period          407.847
		Eccentricity    0.938104
		Inclination     -143.408
		AscendingNode   16.9686
		ArgOfPericenter -124.869
		MeanAnomaly     -134.759
	}
}

Comet	"Ciutric 88"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            3.59866e-007
	Radius          94.9626
	InertiaMoment   0.39829

	Oblateness      0.0265116

	RotationPeriod  29.1875
	Obliquity       126.594
	EqAscendNode    81.8063
	Precession      0

	AbsMagn         7.99093
	SlopeParam      4.75077
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.447 0.441 0.437)

	Surface
	{
		SurfStyle       0.477394
		OceanStyle      0.297272
		Randomize      (0.840, 0.573, 0.356)
		colorDistMagn   0.690633
		colorDistFreq   7.99084
		detailScale     2593.11
		colorConversion true
		snowLevel       2
		tropicLatitude  0.847943
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.478105
		terraceProb     0.110618
		erosion         0
		montesMagn      0.418795
		montesFreq      3.4766
		montesSpiky     0.882336
		montesFraction  0.596778
		dunesFraction   0
		hillsMagn       0
		hillsFreq       13.1348
		hillsFraction   0.797967
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218791
		craterFreq      0.26813
		craterDensity   0.761833
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.551476
		volcanoTemp     1360.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.179, 0.176, 0.175, 0.000)
		colorShelf     (0.190, 0.187, 0.186, 0.000)
		colorBeach     (0.201, 0.198, 0.197, 0.000)
		colorDesert    (0.212, 0.209, 0.207, 0.000)
		colorLowland   (0.223, 0.220, 0.218, 0.000)
		colorUpland    (0.235, 0.231, 0.229, 0.000)
		colorRock      (0.246, 0.242, 0.240, 0.000)
		colorSnow      (0.257, 0.253, 0.251, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.15063
		DustBright  0.618963
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   67.2376
		Period          402.642
		Eccentricity    0.951367
		Inclination     -60.9746
		AscendingNode   110.063
		ArgOfPericenter -144.334
		MeanAnomaly     -52.5095
	}
}

Comet	"Ciutric 89"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            1.10806e-014
	Radius          0.325222
	InertiaMoment   0.39994

	Oblateness      0.0404261

	RotationPeriod  27.0806
	Obliquity       79.7993
	EqAscendNode    66.3837
	Precession      0

	AbsMagn         4.04423
	SlopeParam      5.40226
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.764 0.674 0.611)

	Surface
	{
		SurfStyle       0.297093
		OceanStyle      0.749564
		Randomize      (0.761, 0.381, -0.243)
		colorDistMagn   0.579854
		colorDistFreq   3.68023e-005
		detailScale     8.88073
		colorConversion true
		snowLevel       2
		tropicLatitude  0.933874
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.597884
		terraceProb     0.364191
		erosion         0
		montesMagn      0.435118
		montesFreq      3.11987
		montesSpiky     0.888231
		montesFraction  0.698514
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000238916
		hillsFraction   0.669806
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.26368
		craterFreq      0.218313
		craterDensity   0.878968
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.497813
		volcanoTemp     1667.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.305, 0.270, 0.245, 0.000)
		colorShelf     (0.325, 0.286, 0.260, 0.000)
		colorBeach     (0.344, 0.303, 0.275, 0.000)
		colorDesert    (0.363, 0.320, 0.290, 0.000)
		colorLowland   (0.382, 0.337, 0.306, 0.000)
		colorUpland    (0.401, 0.354, 0.321, 0.000)
		colorRock      (0.420, 0.371, 0.336, 0.000)
		colorSnow      (0.439, 0.388, 0.352, 1.000)
		BumpHeight      0.2927
		BumpOffset      0.05854
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.139264
		GasToDust   0.25
		Particles   1261
		GasBright   0.115687
		DustBright  0.338393
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   49.1292
		Period          251.484
		Eccentricity    0.945357
		Inclination     60.0165
		AscendingNode   58.4457
		ArgOfPericenter 156.286
		MeanAnomaly     -45.8241
	}
}

Comet	"Ciutric 90"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            8.57002e-011
	Radius          5.88066
	InertiaMoment   0.398833

	Oblateness      0.0364011

	RotationPeriod  24.8994
	Obliquity       33.005
	EqAscendNode    50.9611
	Precession      0

	AbsMagn         11.6015
	SlopeParam      6.25719
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.818 0.795 0.754)

	Surface
	{
		SurfStyle       0.596822
		OceanStyle      0.968754
		Randomize      (0.452, -0.228, -0.697)
		colorDistMagn   0.516418
		colorDistFreq   0.0253218
		detailScale     160.581
		colorConversion true
		snowLevel       2
		tropicLatitude  0.376721
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.614008
		terraceProb     0.219687
		erosion         0
		montesMagn      0.529506
		montesFreq      2.88953
		montesSpiky     0.908735
		montesFraction  0.785797
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0909309
		hillsFraction   0.650248
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2041
		craterFreq      0.192105
		craterDensity   0.858297
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.505046
		volcanoTemp     1571.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.319, 0.270, 0.211, 0.000)
		colorShelf     (0.327, 0.278, 0.241, 0.000)
		colorBeach     (0.384, 0.326, 0.286, 0.000)
		colorDesert    (0.417, 0.350, 0.279, 0.000)
		colorLowland   (0.458, 0.374, 0.317, 0.000)
		colorUpland    (0.507, 0.453, 0.384, 0.000)
		colorRock      (0.548, 0.493, 0.415, 0.000)
		colorSnow      (0.597, 0.525, 0.437, 1.000)
		BumpHeight      5.2926
		BumpOffset      1.05852
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.620456
		GasToDust   0.25
		Particles   2233
		GasBright   0.294539
		DustBright  0.644028
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   60.3254
		Period          342.177
		Eccentricity    0.960114
		Inclination     137.108
		AscendingNode   32.7176
		ArgOfPericenter -89.4804
		MeanAnomaly     117.743
	}
}

Comet	"Ciutric 91"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            6.62828e-007
	Radius          127.09
	InertiaMoment   0.397072

	Oblateness      0.0571341

	RotationPeriod  22.6299
	Obliquity       346.211
	EqAscendNode    35.5385
	Precession      0

	AbsMagn         7.78219
	SlopeParam      8.21869
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.609 0.604 0.600)

	Surface
	{
		SurfStyle       0.251085
		OceanStyle      0.288425
		Randomize      (-0.354, 0.496, -0.226)
		colorDistMagn   0.211916
		colorDistFreq   7.7515
		detailScale     3470.41
		colorConversion true
		snowLevel       2
		tropicLatitude  0.632374
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.571706
		terraceProb     0.139207
		erosion         0
		montesMagn      0.544445
		montesFreq      2.30622
		montesSpiky     0.931233
		montesFraction  0.643355
		dunesFraction   0
		hillsMagn       0
		hillsFreq       33.2663
		hillsFraction   0.444066
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.265286
		craterFreq      0.622241
		craterDensity   0.920375
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.515967
		volcanoTemp     1487.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.244, 0.242, 0.240, 0.000)
		colorShelf     (0.259, 0.257, 0.255, 0.000)
		colorBeach     (0.274, 0.272, 0.270, 0.000)
		colorDesert    (0.289, 0.287, 0.285, 0.000)
		colorLowland   (0.305, 0.302, 0.300, 0.000)
		colorUpland    (0.320, 0.317, 0.315, 0.000)
		colorRock      (0.335, 0.332, 0.330, 0.000)
		colorSnow      (0.350, 0.347, 0.345, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.232314
		DustBright  0.39074
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   60.4513
		Period          343.249
		Eccentricity    0.938394
		Inclination     30.0874
		AscendingNode   -123.333
		ArgOfPericenter -124.896
		MeanAnomaly     -174.283
	}
}

Comet	"Ciutric 92"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            2.04089e-014
	Radius          0.364161
	InertiaMoment   0.399301

	Oblateness      0.0549492

	RotationPeriod  20.2548
	Obliquity       299.416
	EqAscendNode    20.1159
	Precession      0

	AbsMagn         3.68837
	SlopeParam      2.67156
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.548 0.544 0.542)

	Surface
	{
		SurfStyle       0.950548
		OceanStyle      0.591848
		Randomize      (-0.021, 0.753, 0.742)
		colorDistMagn   0.72234
		colorDistFreq   9.3235e-005
		detailScale     9.94402
		colorConversion true
		snowLevel       2
		tropicLatitude  0.777543
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.31554
		terraceProb     0.114941
		erosion         0
		montesMagn      0.367058
		montesFreq      2.80692
		montesSpiky     0.86104
		montesFraction  0.851591
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000319764
		hillsFraction   0.728945
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.265444
		craterFreq      0.206544
		craterDensity   0.999644
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.470876
		volcanoTemp     1338.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.186, 0.190, 0.217, 0.050)
		colorShelf     (0.219, 0.223, 0.249, 0.040)
		colorBeach     (0.252, 0.256, 0.282, 0.030)
		colorDesert    (0.285, 0.288, 0.319, 0.020)
		colorLowland   (0.318, 0.321, 0.352, 0.030)
		colorUpland    (0.351, 0.353, 0.384, 0.050)
		colorRock      (0.384, 0.386, 0.428, 0.020)
		colorSnow      (0.384, 0.386, 0.428, 1.000)
		BumpHeight      0.327745
		BumpOffset      0.0655489
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.17209
		GasToDust   0.25
		Particles   1327
		GasBright   0.132829
		DustBright  0.174711
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   63.1837
		Period          366.782
		Eccentricity    0.957382
		Inclination     -51.5267
		AscendingNode   118.295
		ArgOfPericenter 172.099
		MeanAnomaly     -108.089
	}
}

Comet	"Ciutric 93"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            1.57849e-010
	Radius          7.87129
	InertiaMoment   0.39797

	Oblateness      0.0929356

	RotationPeriod  17.7522
	Obliquity       252.622
	EqAscendNode    4.69333
	Precession      0

	AbsMagn         11.2988
	SlopeParam      3.31162
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.797 0.795 0.793)

	Surface
	{
		SurfStyle       0.706152
		OceanStyle      0.613666
		Randomize      (0.288, -0.363, 0.827)
		colorDistMagn   0.898163
		colorDistFreq   0.0283614
		detailScale     214.939
		colorConversion true
		snowLevel       2
		tropicLatitude  0.800158
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.581992
		terraceProb     0.282769
		erosion         0
		montesMagn      0.606872
		montesFreq      3.15512
		montesSpiky     0.837696
		montesFraction  0.930924
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.117893
		hillsFraction   0.630531
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214553
		craterFreq      0.272919
		craterDensity   0.927119
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.481594
		volcanoTemp     1423.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.311, 0.270, 0.222, 0.000)
		colorShelf     (0.319, 0.278, 0.254, 0.000)
		colorBeach     (0.375, 0.326, 0.301, 0.000)
		colorDesert    (0.407, 0.350, 0.293, 0.000)
		colorLowland   (0.446, 0.374, 0.333, 0.000)
		colorUpland    (0.494, 0.453, 0.404, 0.000)
		colorRock      (0.534, 0.493, 0.436, 0.000)
		colorSnow      (0.582, 0.525, 0.460, 1.000)
		BumpHeight      7.08416
		BumpOffset      1.41683
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.653282
		GasToDust   0.25
		Particles   2299
		GasBright   0.388848
		DustBright  0.403178
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   47.4198
		Period          238.473
		Eccentricity    0.949063
		Inclination     85.9092
		AscendingNode   -49.2724
		ArgOfPericenter -140.528
		MeanAnomaly     -22.1811
	}
}

Comet	"Ciutric 94"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            4.86028e-018
	Radius          0.0225504
	InertiaMoment   0.399733

	Oblateness      0.0988201

	RotationPeriod  15.0942
	Obliquity       205.828
	EqAscendNode    349.271
	Precession      0

	AbsMagn         7.57285
	SlopeParam      3.88678
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.670 0.668 0.667)

	Surface
	{
		SurfStyle       0.629069
		OceanStyle      0.541202
		Randomize      (0.789, -0.165, -0.288)
		colorDistMagn   0.232774
		colorDistFreq   4.05441e-007
		detailScale     0.615777
		colorConversion true
		snowLevel       2
		tropicLatitude  0.797544
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.494352
		terraceProb     0.417152
		erosion         0
		montesMagn      0.488788
		montesFreq      2.73673
		montesSpiky     0.896474
		montesFraction  0.659316
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.13782e-006
		hillsFraction   0.591952
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257616
		craterFreq      0.207831
		craterDensity   0.97985
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.484571
		volcanoTemp     1328.92
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.261, 0.227, 0.187, 0.000)
		colorShelf     (0.268, 0.234, 0.213, 0.000)
		colorBeach     (0.315, 0.274, 0.253, 0.000)
		colorDesert    (0.342, 0.294, 0.247, 0.000)
		colorLowland   (0.375, 0.314, 0.280, 0.000)
		colorUpland    (0.416, 0.381, 0.340, 0.000)
		colorRock      (0.449, 0.414, 0.367, 0.000)
		colorSnow      (0.489, 0.441, 0.387, 1.000)
		BumpHeight      0.0202954
		BumpOffset      0.00405908
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.023825
		DustBright  0.452688
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   47.6082
		Period          239.896
		Eccentricity    0.911367
		Inclination     27.1009
		AscendingNode   -3.86786
		ArgOfPericenter -179.208
		MeanAnomaly     102.339
	}
}

Comet	"Ciutric 95"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            3.75908e-014
	Radius          0.487509
	InertiaMoment   0.398578

	Oblateness      0.195365

	RotationPeriod  12.2434
	Obliquity       159.033
	EqAscendNode    333.848
	Precession      0

	AbsMagn         3.29463
	SlopeParam      4.45254
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.519 0.514 0.511)

	Surface
	{
		SurfStyle       0.363606
		OceanStyle      0.61335
		Randomize      (-0.988, 0.570, 0.018)
		colorDistMagn   0.282557
		colorDistFreq   0.000170387
		detailScale     13.3122
		colorConversion true
		snowLevel       2
		tropicLatitude  0.380782
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.491416
		terraceProb     0.338581
		erosion         0
		montesMagn      0.287088
		montesFreq      3.73751
		montesSpiky     0.834801
		montesFraction  0.529837
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000507967
		hillsFraction   0.799704
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260495
		craterFreq      0.250953
		craterDensity   0.682682
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.546951
		volcanoTemp     1195.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.207, 0.206, 0.204, 0.000)
		colorShelf     (0.220, 0.218, 0.217, 0.000)
		colorBeach     (0.233, 0.231, 0.230, 0.000)
		colorDesert    (0.246, 0.244, 0.243, 0.000)
		colorLowland   (0.259, 0.257, 0.255, 0.000)
		colorUpland    (0.272, 0.270, 0.268, 0.000)
		colorRock      (0.285, 0.283, 0.281, 0.000)
		colorSnow      (0.298, 0.296, 0.294, 1.000)
		BumpHeight      0.438758
		BumpOffset      0.0877516
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.204916
		GasToDust   0.25
		Particles   1393
		GasBright   0.104791
		DustBright  0.856209
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   66.9396
		Period          399.968
		Eccentricity    0.940335
		Inclination     2.91653
		AscendingNode   115.77
		ArgOfPericenter 114.643
		MeanAnomaly     147.938
	}
}

Comet	"Ciutric 96"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            2.90738e-010
	Radius          8.81069
	InertiaMoment   0.396249

	Oblateness      0.249

	RotationPeriod  9.14858
	Obliquity       112.239
	EqAscendNode    318.426
	Precession      0

	AbsMagn         11.0139
	SlopeParam      5.05791
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.838 0.805 0.753)

	Surface
	{
		SurfStyle       0.893591
		OceanStyle      0.0648067
		Randomize      (-0.747, 0.632, 0.803)
		colorDistMagn   0.838588
		colorDistFreq   0.0254656
		detailScale     240.59
		colorConversion true
		snowLevel       2
		tropicLatitude  0.982879
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.530917
		terraceProb     0.554383
		erosion         0
		montesMagn      0.445156
		montesFreq      3.53627
		montesSpiky     0.817577
		montesFraction  0.402732
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.132788
		hillsFraction   0.805101
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24142
		craterFreq      0.238214
		craterDensity   0.992652
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.457938
		volcanoTemp     1602.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.285, 0.282, 0.301, 0.050)
		colorShelf     (0.335, 0.330, 0.346, 0.040)
		colorBeach     (0.385, 0.378, 0.391, 0.030)
		colorDesert    (0.436, 0.427, 0.444, 0.020)
		colorLowland   (0.486, 0.475, 0.489, 0.030)
		colorUpland    (0.536, 0.523, 0.534, 0.050)
		colorRock      (0.586, 0.571, 0.595, 0.020)
		colorSnow      (0.586, 0.571, 0.595, 1.000)
		BumpHeight      7.92962
		BumpOffset      1.58592
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.686108
		GasToDust   0.25
		Particles   2365
		GasBright   0.108499
		DustBright  0.536987
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   43.7143
		Period          211.075
		Eccentricity    0.917441
		Inclination     39.2757
		AscendingNode   -100.693
		ArgOfPericenter -65.6084
		MeanAnomaly     1.38433
	}
}

Comet	"Ciutric 97"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            8.95204e-018
	Radius          0.0301941
	InertiaMoment   0.399076

	Oblateness      0.249

	RotationPeriod  5.73632
	Obliquity       65.4449
	EqAscendNode    303.003
	Precession      0

	AbsMagn         7.36233
	SlopeParam      5.78291
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.730 0.727 0.724)

	Surface
	{
		SurfStyle       0.135635
		OceanStyle      0.370382
		Randomize      (0.458, 0.609, -0.378)
		colorDistMagn   0.74148
		colorDistFreq   3.91198e-007
		detailScale     0.824499
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999877
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.509389
		terraceProb     0.162774
		erosion         0
		montesMagn      0.427785
		montesFreq      3.33582
		montesSpiky     0.891234
		montesFraction  0.699999
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.70195e-006
		hillsFraction   0.673247
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230489
		craterFreq      0.220391
		craterDensity   0.906139
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.459686
		volcanoTemp     1247.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.292, 0.291, 0.290, 0.000)
		colorShelf     (0.310, 0.309, 0.308, 0.000)
		colorBeach     (0.328, 0.327, 0.326, 0.000)
		colorDesert    (0.347, 0.345, 0.344, 0.000)
		colorLowland   (0.365, 0.363, 0.362, 0.000)
		colorUpland    (0.383, 0.381, 0.380, 0.000)
		colorRock      (0.401, 0.400, 0.398, 0.000)
		colorSnow      (0.420, 0.418, 0.416, 1.000)
		BumpHeight      0.0271747
		BumpOffset      0.00543493
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0749482
		DustBright  0.255025
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   69.2327
		Period          420.695
		Eccentricity    0.961561
		Inclination     -24.5473
		AscendingNode   -163.499
		ArgOfPericenter 138.936
		MeanAnomaly     177.178
	}
}

Comet	"Ciutric 98"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            6.92376e-014
	Radius          0.545579
	InertiaMoment   0.397587

	RotationPeriod  149.116
	Obliquity       18.6506
	EqAscendNode    287.58
	Precession      0

	AbsMagn         2.8491
	SlopeParam      6.88948
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.726 0.721 0.719)

	Surface
	{
		SurfStyle       0.0131199
		OceanStyle      0.622336
		Randomize      (0.272, 0.367, 0.300)
		colorDistMagn   0.501862
		colorDistFreq   0.000187014
		detailScale     14.8979
		colorConversion true
		snowLevel       2
		tropicLatitude  0.362034
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.591766
		terraceProb     0.594708
		erosion         0
		montesMagn      0.460514
		montesFreq      2.84431
		montesSpiky     0.980066
		montesFraction  0.209624
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000907995
		hillsFraction   0.731072
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257212
		craterFreq      0.257013
		craterDensity   0.97898
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.557196
		volcanoTemp     1257.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.290, 0.288, 0.287, 0.000)
		colorShelf     (0.308, 0.306, 0.305, 0.000)
		colorBeach     (0.327, 0.324, 0.323, 0.000)
		colorDesert    (0.345, 0.342, 0.341, 0.000)
		colorLowland   (0.363, 0.360, 0.359, 0.000)
		colorUpland    (0.381, 0.378, 0.377, 0.000)
		colorRock      (0.399, 0.396, 0.395, 0.000)
		colorSnow      (0.417, 0.414, 0.413, 1.000)
		BumpHeight      0.491021
		BumpOffset      0.0982042
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.237742
		GasToDust   0.25
		Particles   1460
		GasBright   0.233082
		DustBright  0.581378
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   43.5818
		Period          210.116
		Eccentricity    0.910618
		Inclination     177.419
		AscendingNode   -175.594
		ArgOfPericenter 125.047
		MeanAnomaly     -18.1951
	}
}

Comet	"Ciutric 99"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            5.35502e-010
	Radius          11.7995
	InertiaMoment   0.399522

	Oblateness      0.00202647

	RotationPeriod  120.144
	Obliquity       331.856
	EqAscendNode    272.158
	Precession      0

	AbsMagn         10.7436
	SlopeParam      2.29138
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.705 0.547 0.457)

	Surface
	{
		SurfStyle       0.935607
		OceanStyle      0.583968
		Randomize      (0.244, -0.088, 0.585)
		colorDistMagn   0.492402
		colorDistFreq   0.00797889
		detailScale     322.204
		colorConversion true
		snowLevel       2
		tropicLatitude  0.699199
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.496043
		terraceProb     0.314438
		erosion         0
		montesMagn      0.463556
		montesFreq      3.70296
		montesSpiky     0.958745
		montesFraction  0.674874
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.346073
		hillsFraction   0.798683
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227562
		craterFreq      0.217163
		craterDensity   1.05166
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.607814
		volcanoTemp     1397.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.240, 0.192, 0.183, 0.050)
		colorShelf     (0.282, 0.224, 0.210, 0.040)
		colorBeach     (0.324, 0.257, 0.238, 0.030)
		colorDesert    (0.367, 0.290, 0.270, 0.020)
		colorLowland   (0.409, 0.323, 0.297, 0.030)
		colorUpland    (0.451, 0.356, 0.324, 0.050)
		colorRock      (0.494, 0.389, 0.361, 0.020)
		colorSnow      (0.494, 0.389, 0.361, 1.000)
		BumpHeight      10.6195
		BumpOffset      2.1239
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.718934
		GasToDust   0.25
		Particles   2432
		GasBright   0.172249
		DustBright  0.326697
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   73.0033
		Period          455.527
		Eccentricity    0.945835
		Inclination     -18.152
		AscendingNode   33.2027
		ArgOfPericenter -18.0549
		MeanAnomaly     86.9272
	}
}

Comet	"Ciutric 100"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            1.64885e-017
	Radius          0.033783
	InertiaMoment   0.398298

	Oblateness      0.00183514

	RotationPeriod  109.973
	Obliquity       285.062
	EqAscendNode    256.735
	Precession      0

	AbsMagn         7.15004
	SlopeParam      3.00003
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.757 0.753 0.752)

	Surface
	{
		SurfStyle       0.297812
		OceanStyle      0.0793384
		Randomize      (0.373, -0.428, -0.402)
		colorDistMagn   0.897919
		colorDistFreq   6.39459e-007
		detailScale     0.9225
		colorConversion true
		snowLevel       2
		tropicLatitude  0.95822
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.286989
		terraceProb     0.279101
		erosion         0
		montesMagn      0.503101
		montesFreq      2.14661
		montesSpiky     0.98591
		montesFraction  0.643235
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.34788e-006
		hillsFraction   0.698819
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262529
		craterFreq      0.226305
		craterDensity   0.955742
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.494424
		volcanoTemp     1615.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.303, 0.301, 0.301, 0.000)
		colorShelf     (0.322, 0.320, 0.320, 0.000)
		colorBeach     (0.341, 0.339, 0.338, 0.000)
		colorDesert    (0.359, 0.358, 0.357, 0.000)
		colorLowland   (0.378, 0.377, 0.376, 0.000)
		colorUpland    (0.397, 0.396, 0.395, 0.000)
		colorRock      (0.416, 0.414, 0.414, 0.000)
		colorSnow      (0.435, 0.433, 0.432, 1.000)
		BumpHeight      0.0304047
		BumpOffset      0.00608093
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.397573
		DustBright  0.58586
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   73.4593
		Period          459.802
		Eccentricity    0.954458
		Inclination     -3.58623
		AscendingNode   -116.21
		ArgOfPericenter -121.279
		MeanAnomaly     -90.3462
	}
}

Comet	"Ciutric 101"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            1.27527e-013
	Radius          0.730812
	InertiaMoment   0.399945

	Oblateness      0.00274505

	RotationPeriod  103.19
	Obliquity       238.268
	EqAscendNode    241.313
	Precession      0

	AbsMagn         2.32847
	SlopeParam      3.59939
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.499 0.488 0.484)

	Surface
	{
		SurfStyle       0.711436
		OceanStyle      0.861765
		Randomize      (-0.628, -0.729, 0.974)
		colorDistMagn   0.215219
		colorDistFreq   0.000308559
		detailScale     19.956
		colorConversion true
		snowLevel       2
		tropicLatitude  0.800924
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.472804
		terraceProb     0.363011
		erosion         0
		montesMagn      0.475611
		montesFreq      3.53947
		montesSpiky     0.938693
		montesFraction  0.59062
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0010829
		hillsFraction   0.504698
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258899
		craterFreq      0.192009
		craterDensity   0.870321
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.55925
		volcanoTemp     1403.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.194, 0.166, 0.136, 0.000)
		colorShelf     (0.199, 0.171, 0.155, 0.000)
		colorBeach     (0.234, 0.200, 0.184, 0.000)
		colorDesert    (0.254, 0.215, 0.179, 0.000)
		colorLowland   (0.279, 0.229, 0.203, 0.000)
		colorUpland    (0.309, 0.278, 0.247, 0.000)
		colorRock      (0.334, 0.303, 0.266, 0.000)
		colorSnow      (0.364, 0.322, 0.281, 1.000)
		BumpHeight      0.65773
		BumpOffset      0.131546
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.270568
		GasToDust   0.25
		Particles   1526
		GasBright   0.309457
		DustBright  0.358462
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   46.4694
		Period          231.34
		Eccentricity    0.917718
		Inclination     71.9973
		AscendingNode   -19.745
		ArgOfPericenter -114.762
		MeanAnomaly     87.9995
	}
}

Comet	"Ciutric 102"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            9.86327e-010
	Radius          13.1987
	InertiaMoment   0.39884

	Oblateness      0.00231124

	RotationPeriod  97.9414
	Obliquity       191.473
	EqAscendNode    225.89
	Precession      0

	AbsMagn         10.4853
	SlopeParam      4.1641
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.727 0.725 0.723)

	Surface
	{
		SurfStyle       0.864807
		OceanStyle      0.416098
		Randomize      (0.050, -0.791, 0.655)
		colorDistMagn   0.502923
		colorDistFreq   0.137904
		detailScale     360.412
		colorConversion true
		snowLevel       2
		tropicLatitude  0.373807
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.507946
		terraceProb     0.169497
		erosion         0
		montesMagn      0.615816
		montesFreq      2.46412
		montesSpiky     0.811258
		montesFraction  0.637103
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.277253
		hillsFraction   0.558624
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.198475
		craterFreq      0.179338
		craterDensity   0.911547
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.462488
		volcanoTemp     1424.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.247, 0.254, 0.289, 0.050)
		colorShelf     (0.291, 0.297, 0.333, 0.040)
		colorBeach     (0.334, 0.341, 0.376, 0.030)
		colorDesert    (0.378, 0.384, 0.427, 0.020)
		colorLowland   (0.422, 0.428, 0.470, 0.030)
		colorUpland    (0.465, 0.471, 0.514, 0.050)
		colorRock      (0.509, 0.515, 0.572, 0.020)
		colorSnow      (0.509, 0.515, 0.572, 1.000)
		BumpHeight      11.8788
		BumpOffset      2.37576
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.75176
		GasToDust   0.25
		Particles   2498
		GasBright   0.00788005
		DustBright  0.344526
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   59.5522
		Period          335.619
		Eccentricity    0.923975
		Inclination     -27.5633
		AscendingNode   50.3587
		ArgOfPericenter -82.8624
		MeanAnomaly     -90.3323
	}
}

Comet	"Ciutric 103"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            3.03698e-017
	Radius          0.0452638
	InertiaMoment   0.397087

	Oblateness      0.00329446

	RotationPeriod  93.5814
	Obliquity       144.679
	EqAscendNode    210.467
	Precession      0

	AbsMagn         6.93531
	SlopeParam      4.7425
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.581 0.485 0.425)

	Surface
	{
		SurfStyle       0.462849
		OceanStyle      0.451191
		Randomize      (-0.573, -0.718, 0.775)
		colorDistMagn   0.793402
		colorDistFreq   9.91211e-007
		detailScale     1.236
		colorConversion true
		snowLevel       2
		tropicLatitude  0.857802
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.52127
		terraceProb     0.184852
		erosion         0
		montesMagn      0.630816
		montesFreq      2.96266
		montesSpiky     0.976113
		montesFraction  0.650828
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.51321e-006
		hillsFraction   0.603628
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257172
		craterFreq      0.268311
		craterDensity   0.842861
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.552714
		volcanoTemp     1432.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.232, 0.194, 0.170, 0.000)
		colorShelf     (0.247, 0.206, 0.181, 0.000)
		colorBeach     (0.261, 0.218, 0.191, 0.000)
		colorDesert    (0.276, 0.230, 0.202, 0.000)
		colorLowland   (0.290, 0.242, 0.213, 0.000)
		colorUpland    (0.305, 0.254, 0.223, 0.000)
		colorRock      (0.319, 0.267, 0.234, 0.000)
		colorSnow      (0.334, 0.279, 0.244, 1.000)
		BumpHeight      0.0407374
		BumpOffset      0.00814748
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.068128
		DustBright  0.768764
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   60.1434
		Period          340.63
		Eccentricity    0.922429
		Inclination     137.439
		AscendingNode   77.1458
		ArgOfPericenter -54.438
		MeanAnomaly     162.277
	}
}

Comet	"Ciutric 104"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            2.34888e-013
	Radius          0.817251
	InertiaMoment   0.399306

	Oblateness      0.00274527

	RotationPeriod  89.8036
	Obliquity       97.8848
	EqAscendNode    195.045
	Precession      0

	AbsMagn         1.68874
	SlopeParam      5.39241
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.497 0.493 0.489)

	Surface
	{
		SurfStyle       0.896462
		OceanStyle      0.0171915
		Randomize      (-0.391, -0.830, 0.379)
		colorDistMagn   0.637492
		colorDistFreq   0.000373351
		detailScale     22.3164
		colorConversion true
		snowLevel       2
		tropicLatitude  0.854867
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.622054
		terraceProb     0.145893
		erosion         0
		montesMagn      0.26895
		montesFreq      4.00538
		montesSpiky     0.921765
		montesFraction  0.324214
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00128109
		hillsFraction   0.491427
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232108
		craterFreq      0.229003
		craterDensity   0.776244
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.483956
		volcanoTemp     1326.32
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.169, 0.173, 0.196, 0.050)
		colorShelf     (0.199, 0.202, 0.225, 0.040)
		colorBeach     (0.229, 0.232, 0.254, 0.030)
		colorDesert    (0.258, 0.262, 0.289, 0.020)
		colorLowland   (0.288, 0.291, 0.318, 0.030)
		colorUpland    (0.318, 0.321, 0.347, 0.050)
		colorRock      (0.348, 0.350, 0.386, 0.020)
		colorSnow      (0.348, 0.350, 0.386, 1.000)
		BumpHeight      0.735526
		BumpOffset      0.147105
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.303394
		GasToDust   0.25
		Particles   1592
		GasBright   0.0732283
		DustBright  0.448151
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   53.9456
		Period          289.358
		Eccentricity    0.959209
		Inclination     24.2826
		AscendingNode   14.8182
		ArgOfPericenter -17.7595
		MeanAnomaly     3.15797
	}
}

Comet	"Ciutric 105"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            1.81669e-009
	Radius          17.6888
	InertiaMoment   0.397979

	Oblateness      0.00386557

	RotationPeriod  86.4374
	Obliquity       51.0905
	EqAscendNode    179.622
	Precession      0

	AbsMagn         10.2369
	SlopeParam      6.24266
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.794 0.726 0.623)

	Surface
	{
		SurfStyle       0.421877
		OceanStyle      0.178573
		Randomize      (-0.651, 0.451, -0.816)
		colorDistMagn   0.773206
		colorDistFreq   0.132832
		detailScale     483.021
		colorConversion true
		snowLevel       2
		tropicLatitude  0.988002
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.760385
		terraceProb     0.324714
		erosion         0
		montesMagn      0.38637
		montesFreq      2.97643
		montesSpiky     0.877863
		montesFraction  0.840784
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.721772
		hillsFraction   0.65362
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217199
		craterFreq      0.173381
		craterDensity   1.06237
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.559639
		volcanoTemp     1627.09
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.317, 0.290, 0.249, 0.000)
		colorShelf     (0.337, 0.309, 0.265, 0.000)
		colorBeach     (0.357, 0.327, 0.280, 0.000)
		colorDesert    (0.377, 0.345, 0.296, 0.000)
		colorLowland   (0.397, 0.363, 0.311, 0.000)
		colorUpland    (0.417, 0.381, 0.327, 0.000)
		colorRock      (0.437, 0.399, 0.343, 0.000)
		colorSnow      (0.456, 0.417, 0.358, 1.000)
		BumpHeight      15.9199
		BumpOffset      3.18398
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.784586
		GasToDust   0.25
		Particles   2564
		GasBright   0.0410694
		DustBright  0.164796
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   60.386
		Period          342.693
		Eccentricity    0.943167
		Inclination     -116.068
		AscendingNode   51.9889
		ArgOfPericenter 160.544
		MeanAnomaly     -63.1521
	}
}

Comet	"Ciutric 106"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            5.59374e-017
	Radius          0.0506025
	InertiaMoment   0.399738

	Oblateness      0.00317969

	RotationPeriod  83.3775
	Obliquity       4.29621
	EqAscendNode    164.2
	Precession      0

	AbsMagn         6.71748
	SlopeParam      8.14986
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.458 0.456 0.451)

	Surface
	{
		SurfStyle       0.757289
		OceanStyle      0.99158
		Randomize      (-0.015, -0.807, -0.210)
		colorDistMagn   0.40056
		colorDistFreq   1.5086e-006
		detailScale     1.38178
		colorConversion true
		snowLevel       2
		tropicLatitude  0.572311
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.501809
		terraceProb     0.519598
		erosion         0
		montesMagn      0.24852
		montesFreq      3.62205
		montesSpiky     0.982435
		montesFraction  0.505131
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.39764e-006
		hillsFraction   0.572063
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252466
		craterFreq      0.257178
		craterDensity   1.00599
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.54041
		volcanoTemp     1116.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.179, 0.155, 0.126, 0.000)
		colorShelf     (0.183, 0.160, 0.144, 0.000)
		colorBeach     (0.215, 0.187, 0.171, 0.000)
		colorDesert    (0.234, 0.201, 0.167, 0.000)
		colorLowland   (0.257, 0.214, 0.189, 0.000)
		colorUpland    (0.284, 0.260, 0.230, 0.000)
		colorRock      (0.307, 0.283, 0.248, 0.000)
		colorSnow      (0.335, 0.301, 0.262, 1.000)
		BumpHeight      0.0455422
		BumpOffset      0.00910844
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.178485
		DustBright  0.511867
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   54.3525
		Period          292.637
		Eccentricity    0.926729
		Inclination     37.1945
		AscendingNode   -124.556
		ArgOfPericenter -116.857
		MeanAnomaly     38.4014
	}
}

Comet	"Ciutric 107"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            4.32635e-013
	Radius          1.09559
	InertiaMoment   0.398585

	Oblateness      0.00445078

	RotationPeriod  80.554
	Obliquity       317.502
	EqAscendNode    148.777
	Precession      0

	AbsMagn         0.828462
	SlopeParam      2.66192
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.756 0.753 0.749)

	Surface
	{
		SurfStyle       0.24093
		OceanStyle      0.510324
		Randomize      (-0.050, 0.809, 0.574)
		colorDistMagn   0.53985
		colorDistFreq   0.000739649
		detailScale     29.9168
		colorConversion true
		snowLevel       2
		tropicLatitude  0.815592
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.701577
		terraceProb     0.180262
		erosion         0
		montesMagn      0.514623
		montesFreq      3.4345
		montesSpiky     0.996097
		montesFraction  0.078312
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0023396
		hillsFraction   0.736833
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249443
		craterFreq      0.279122
		craterDensity   0.749413
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53734
		volcanoTemp     1721.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.302, 0.301, 0.299, 0.000)
		colorShelf     (0.321, 0.320, 0.318, 0.000)
		colorBeach     (0.340, 0.339, 0.337, 0.000)
		colorDesert    (0.359, 0.358, 0.356, 0.000)
		colorLowland   (0.378, 0.376, 0.374, 0.000)
		colorUpland    (0.397, 0.395, 0.393, 0.000)
		colorRock      (0.416, 0.414, 0.412, 0.000)
		colorSnow      (0.435, 0.433, 0.431, 1.000)
		BumpHeight      0.986028
		BumpOffset      0.197206
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.33622
		GasToDust   0.25
		Particles   1659
		GasBright   0.119044
		DustBright  0.255795
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   51.4605
		Period          269.595
		Eccentricity    0.921531
		Inclination     86.5359
		AscendingNode   157.539
		ArgOfPericenter 136.895
		MeanAnomaly     -69.3499
	}
}

Comet	"Ciutric 108"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            3.34612e-009
	Radius          19.7687
	InertiaMoment   0.396279

	Oblateness      0.00358224

	RotationPeriod  77.9178
	Obliquity       270.708
	EqAscendNode    133.354
	Precession      0

	AbsMagn         9.99687
	SlopeParam      3.30342
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.687 0.684 0.682)

	Surface
	{
		SurfStyle       0.137715
		OceanStyle      0.895921
		Randomize      (-0.936, 0.073, -0.315)
		colorDistMagn   0.266354
		colorDistFreq   0.0735225
		detailScale     539.817
		colorConversion true
		snowLevel       2
		tropicLatitude  0.82253
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.707051
		terraceProb     0.14385
		erosion         0
		montesMagn      0.557057
		montesFreq      3.97912
		montesSpiky     0.990203
		montesFraction  0.639058
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.741618
		hillsFraction   0.741303
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264156
		craterFreq      0.241973
		craterDensity   1.03375
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.525343
		volcanoTemp     1379.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.275, 0.274, 0.273, 0.000)
		colorShelf     (0.292, 0.291, 0.290, 0.000)
		colorBeach     (0.309, 0.308, 0.307, 0.000)
		colorDesert    (0.326, 0.325, 0.324, 0.000)
		colorLowland   (0.343, 0.342, 0.341, 0.000)
		colorUpland    (0.361, 0.359, 0.358, 0.000)
		colorRock      (0.378, 0.376, 0.375, 0.000)
		colorSnow      (0.395, 0.393, 0.392, 1.000)
		BumpHeight      17.7918
		BumpOffset      3.55836
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.817412
		GasToDust   0.25
		Particles   2631
		GasBright   0.32365
		DustBright  0.535676
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   75.9029
		Period          482.935
		Eccentricity    0.952063
		Inclination     -130.809
		AscendingNode   -139.65
		ArgOfPericenter -154.419
		MeanAnomaly     -86.4692
	}
}

Comet	"Ciutric 109"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            1.03029e-016
	Radius          0.0678574
	InertiaMoment   0.399082

	Oblateness      0.00507351

	RotationPeriod  75.4331
	Obliquity       223.913
	EqAscendNode    117.932
	Precession      0

	AbsMagn         6.49577
	SlopeParam      3.87905
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.661 0.656 0.651)

	Surface
	{
		SurfStyle       0.486915
		OceanStyle      0.053644
		Randomize      (-0.016, 0.027, 0.237)
		colorDistMagn   0.358524
		colorDistFreq   1.52594e-006
		detailScale     1.85296
		colorConversion true
		snowLevel       2
		tropicLatitude  0.870016
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.67911
		terraceProb     0.135327
		erosion         0
		montesMagn      0.477699
		montesFreq      3.38274
		montesSpiky     0.883191
		montesFraction  0.39989
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.54868e-006
		hillsFraction   0.576881
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243218
		craterFreq      0.190352
		craterDensity   0.763957
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.566063
		volcanoTemp     1121.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.265, 0.262, 0.261, 0.000)
		colorShelf     (0.281, 0.279, 0.277, 0.000)
		colorBeach     (0.298, 0.295, 0.293, 0.000)
		colorDesert    (0.314, 0.312, 0.309, 0.000)
		colorLowland   (0.331, 0.328, 0.326, 0.000)
		colorUpland    (0.347, 0.344, 0.342, 0.000)
		colorRock      (0.364, 0.361, 0.358, 0.000)
		colorSnow      (0.380, 0.377, 0.375, 1.000)
		BumpHeight      0.0610717
		BumpOffset      0.0122143
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.236927
		DustBright  0.306885
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   59.3699
		Period          334.079
		Eccentricity    0.939668
		Inclination     87.1859
		AscendingNode   -40.2916
		ArgOfPericenter -98.883
		MeanAnomaly     -146.391
	}
}

Comet	"Ciutric 110"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            7.96858e-013
	Radius          1.22398
	InertiaMoment   0.397598

	Oblateness      0.0040796

	RotationPeriod  73.0726
	Obliquity       177.119
	EqAscendNode    102.509
	Precession      0

	AbsMagn         -0.609151
	SlopeParam      4.44463
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.792 0.758 0.697)

	Surface
	{
		SurfStyle       0.702309
		OceanStyle      0.758177
		Randomize      (-0.929, -0.744, 0.501)
		colorDistMagn   0.433414
		colorDistFreq   0.00107446
		detailScale     33.4228
		colorConversion true
		snowLevel       2
		tropicLatitude  0.97577
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.570477
		terraceProb     0.162794
		erosion         0
		montesMagn      0.415102
		montesFreq      3.34487
		montesSpiky     0.981495
		montesFraction  0.561085
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00307239
		hillsFraction   0.518786
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248418
		craterFreq      0.222275
		craterDensity   0.71293
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.475971
		volcanoTemp     1720.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.309, 0.258, 0.195, 0.000)
		colorShelf     (0.317, 0.265, 0.223, 0.000)
		colorBeach     (0.372, 0.311, 0.265, 0.000)
		colorDesert    (0.404, 0.333, 0.258, 0.000)
		colorLowland   (0.443, 0.356, 0.293, 0.000)
		colorUpland    (0.491, 0.432, 0.355, 0.000)
		colorRock      (0.530, 0.470, 0.383, 0.000)
		colorSnow      (0.578, 0.500, 0.404, 1.000)
		BumpHeight      1.10158
		BumpOffset      0.220316
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.369046
		GasToDust   0.25
		Particles   1725
		GasBright   0.112944
		DustBright  0.115354
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   70.6413
		Period          433.599
		Eccentricity    0.960712
		Inclination     -80.1041
		AscendingNode   162.249
		ArgOfPericenter 163.869
		MeanAnomaly     91.9253
	}
}

Comet	"Ciutric 111"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            6.16313e-009
	Radius          26.5186
	InertiaMoment   0.399528

	Oblateness      0.00575334

	RotationPeriod  70.8154
	Obliquity       130.325
	EqAscendNode    87.0867
	Precession      0

	AbsMagn         9.76383
	SlopeParam      5.04904
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.708 0.654 0.606)

	Surface
	{
		SurfStyle       0.0455265
		OceanStyle      0.287892
		Randomize      (-0.857, 0.119, -0.587)
		colorDistMagn   0.65874
		colorDistFreq   0.405587
		detailScale     724.133
		colorConversion true
		snowLevel       2
		tropicLatitude  0.735385
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.534435
		terraceProb     0.348243
		erosion         0
		montesMagn      0.597887
		montesFreq      3.1186
		montesSpiky     0.968338
		montesFraction  0.513347
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.87317
		hillsFraction   0.536536
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.209715
		craterFreq      0.204139
		craterDensity   0.923067
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.536362
		volcanoTemp     1742.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.283, 0.262, 0.242, 0.000)
		colorShelf     (0.301, 0.278, 0.257, 0.000)
		colorBeach     (0.319, 0.294, 0.273, 0.000)
		colorDesert    (0.336, 0.311, 0.288, 0.000)
		colorLowland   (0.354, 0.327, 0.303, 0.000)
		colorUpland    (0.372, 0.343, 0.318, 0.000)
		colorRock      (0.389, 0.360, 0.333, 0.000)
		colorSnow      (0.407, 0.376, 0.348, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.850238
		GasToDust   0.25
		Particles   2697
		GasBright   0.038325
		DustBright  0.67446
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   72.0544
		Period          446.674
		Eccentricity    0.965916
		Inclination     174.774
		AscendingNode   118.58
		ArgOfPericenter 12.6988
		MeanAnomaly     78.2809
	}
}

Comet	"Ciutric 112"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            1.89767e-016
	Radius          0.0757811
	InertiaMoment   0.398305

	Oblateness      0.0046194

	RotationPeriod  68.6445
	Obliquity       83.5304
	EqAscendNode    71.6641
	Precession      0

	AbsMagn         6.26933
	SlopeParam      5.77146
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.655 0.650 0.648)

	Surface
	{
		SurfStyle       0.350016
		OceanStyle      0.987115
		Randomize      (0.677, -0.824, 0.244)
		colorDistMagn   0.72219
		colorDistFreq   3.8371e-006
		detailScale     2.06933
		colorConversion true
		snowLevel       2
		tropicLatitude  0.393754
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.714133
		terraceProb     0.286282
		erosion         0
		montesMagn      0.471934
		montesFreq      2.62221
		montesSpiky     0.964575
		montesFraction  0.417078
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.61416e-006
		hillsFraction   0.470226
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240913
		craterFreq      0.209634
		craterDensity   0.999102
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.505244
		volcanoTemp     1598.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.262, 0.260, 0.259, 0.000)
		colorShelf     (0.279, 0.276, 0.275, 0.000)
		colorBeach     (0.295, 0.293, 0.291, 0.000)
		colorDesert    (0.311, 0.309, 0.308, 0.000)
		colorLowland   (0.328, 0.325, 0.324, 0.000)
		colorUpland    (0.344, 0.341, 0.340, 0.000)
		colorRock      (0.360, 0.358, 0.356, 0.000)
		colorSnow      (0.377, 0.374, 0.372, 1.000)
		BumpHeight      0.068203
		BumpOffset      0.0136406
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0448175
		DustBright  0.352454
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   85.7358
		Period          579.754
		Eccentricity    0.94688
		Inclination     101.863
		AscendingNode   165.724
		ArgOfPericenter 155.35
		MeanAnomaly     -109.899
	}
}

Comet	"Ciutric 113"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            1.46771e-012
	Radius          1.6425
	InertiaMoment   0.399951

	Oblateness      0.00651088

	RotationPeriod  66.5463
	Obliquity       36.7361
	EqAscendNode    56.2415
	Precession      0

	AbsMagn         16.9434
	SlopeParam      6.86774
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.636 0.575 0.533)

	Surface
	{
		SurfStyle       0.759565
		OceanStyle      0.174209
		Randomize      (-0.614, 0.481, 0.717)
		colorDistMagn   0.0751167
		colorDistFreq   0.0020423
		detailScale     44.8511
		colorConversion true
		snowLevel       2
		tropicLatitude  0.871541
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.381225
		terraceProb     0.190522
		erosion         0
		montesMagn      0.401289
		montesFreq      2.56694
		montesSpiky     0.985877
		montesFraction  0.404316
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00533445
		hillsFraction   0.675309
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235559
		craterFreq      0.24042
		craterDensity   0.827119
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.491416
		volcanoTemp     1586.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.248, 0.195, 0.149, 0.000)
		colorShelf     (0.254, 0.201, 0.170, 0.000)
		colorBeach     (0.299, 0.236, 0.202, 0.000)
		colorDesert    (0.324, 0.253, 0.197, 0.000)
		colorLowland   (0.356, 0.270, 0.224, 0.000)
		colorUpland    (0.394, 0.328, 0.272, 0.000)
		colorRock      (0.426, 0.356, 0.293, 0.000)
		colorSnow      (0.464, 0.379, 0.309, 1.000)
		BumpHeight      1.47825
		BumpOffset      0.295649
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.401872
		GasToDust   0.25
		Particles   1791
		GasBright   0.151538
		DustBright  0.73022
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   43.3936
		Period          208.756
		Eccentricity    0.911869
		Inclination     -152.274
		AscendingNode   -38.0728
		ArgOfPericenter -100.175
		MeanAnomaly     163.99
	}
}

Comet	"Ciutric 114"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            1.13517e-008
	Radius          29.603
	InertiaMoment   0.398846

	Oblateness      0.00522297

	RotationPeriod  64.5093
	Obliquity       349.942
	EqAscendNode    40.8189
	Precession      0

	AbsMagn         9.53664
	SlopeParam      2.28024
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.774 0.720 0.646)

	Surface
	{
		SurfStyle       0.456657
		OceanStyle      0.668288
		Randomize      (0.770, 0.560, -0.130)
		colorDistMagn   0.728349
		colorDistFreq   0.417606
		detailScale     808.358
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999577
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.599904
		terraceProb     0.241993
		erosion         0
		montesMagn      0.570443
		montesFreq      2.51484
		montesSpiky     0.943033
		montesFraction  0.362053
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.61352
		hillsFraction   0.618323
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261529
		craterFreq      0.231062
		craterDensity   0.975897
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.463551
		volcanoTemp     1758.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.310, 0.288, 0.258, 0.000)
		colorShelf     (0.329, 0.306, 0.274, 0.000)
		colorBeach     (0.348, 0.324, 0.291, 0.000)
		colorDesert    (0.368, 0.342, 0.307, 0.000)
		colorLowland   (0.387, 0.360, 0.323, 0.000)
		colorUpland    (0.407, 0.378, 0.339, 0.000)
		colorRock      (0.426, 0.396, 0.355, 0.000)
		colorSnow      (0.445, 0.414, 0.371, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.883064
		GasToDust   0.25
		Particles   2763
		GasBright   0.130748
		DustBright  0.435497
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   42.3362
		Period          201.173
		Eccentricity    0.898805
		Inclination     94.4087
		AscendingNode   -53.0093
		ArgOfPericenter 17.3502
		MeanAnomaly     18.1036
	}
}

Comet	"Ciutric 115"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            3.49528e-016
	Radius          0.101733
	InertiaMoment   0.397102

	Oblateness      0.00728091

	RotationPeriod  62.5238
	Obliquity       303.148
	EqAscendNode    25.3963
	Precession      0

	AbsMagn         6.03721
	SlopeParam      2.99128
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.554 0.467 0.329)

	Surface
	{
		SurfStyle       0.821415
		OceanStyle      0.342727
		Randomize      (0.221, 0.645, 0.396)
		colorDistMagn   0.993256
		colorDistFreq   3.7087e-006
		detailScale     2.77798
		colorConversion true
		snowLevel       2
		tropicLatitude  0.942845
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.324049
		terraceProb     0.502909
		erosion         0
		montesMagn      0.45887
		montesFreq      2.84372
		montesSpiky     0.877062
		montesFraction  0.740678
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.31473e-005
		hillsFraction   0.499954
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242836
		craterFreq      0.251331
		craterDensity   0.916044
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.550601
		volcanoTemp     1495.32
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.216, 0.159, 0.092, 0.000)
		colorShelf     (0.222, 0.163, 0.105, 0.000)
		colorBeach     (0.260, 0.191, 0.125, 0.000)
		colorDesert    (0.283, 0.205, 0.122, 0.000)
		colorLowland   (0.310, 0.219, 0.138, 0.000)
		colorUpland    (0.344, 0.266, 0.168, 0.000)
		colorRock      (0.371, 0.289, 0.181, 0.000)
		colorSnow      (0.405, 0.308, 0.191, 1.000)
		BumpHeight      0.0915594
		BumpOffset      0.0183119
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0726993
		DustBright  0.178032
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   53.0497
		Period          282.179
		Eccentricity    0.906657
		Inclination     -120.922
		AscendingNode   -148.776
		ArgOfPericenter 177.577
		MeanAnomaly     -166.527
	}
}

Comet	"Ciutric 116"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            2.70334e-012
	Radius          1.83273
	InertiaMoment   0.399312

	Oblateness      0.00591135

	RotationPeriod  60.5816
	Obliquity       256.353
	EqAscendNode    9.97376
	Precession      0

	AbsMagn         15.3273
	SlopeParam      3.59151
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.431 0.426 0.421)

	Surface
	{
		SurfStyle       0.177925
		OceanStyle      0.45122
		Randomize      (0.473, -0.922, 0.441)
		colorDistMagn   0.205949
		colorDistFreq   0.000362692
		detailScale     50.0457
		colorConversion true
		snowLevel       2
		tropicLatitude  0.969795
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.447452
		terraceProb     0.556746
		erosion         0
		montesMagn      0.612524
		montesFreq      3.73348
		montesSpiky     0.922751
		montesFraction  0.763257
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00920405
		hillsFraction   0.638494
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.265529
		craterFreq      0.221332
		craterDensity   0.880168
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.500819
		volcanoTemp     1742.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.172, 0.170, 0.168, 0.000)
		colorShelf     (0.183, 0.181, 0.179, 0.000)
		colorBeach     (0.194, 0.192, 0.190, 0.000)
		colorDesert    (0.205, 0.202, 0.200, 0.000)
		colorLowland   (0.215, 0.213, 0.211, 0.000)
		colorUpland    (0.226, 0.224, 0.221, 0.000)
		colorRock      (0.237, 0.234, 0.232, 0.000)
		colorSnow      (0.248, 0.245, 0.242, 1.000)
		BumpHeight      1.64945
		BumpOffset      0.329891
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.434698
		GasToDust   0.25
		Particles   1857
		GasBright   0.256587
		DustBright  0.478631
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   64.7996
		Period          380.943
		Eccentricity    0.953436
		Inclination     159.936
		AscendingNode   86.1637
		ArgOfPericenter -173.369
		MeanAnomaly     12.3946
	}
}

Comet	"Ciutric 117"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            2.09084e-008
	Radius          39.7574
	InertiaMoment   0.397988

	Oblateness      0.00827638

	RotationPeriod  58.6753
	Obliquity       209.559
	EqAscendNode    354.551
	Precession      0

	AbsMagn         9.3143
	SlopeParam      4.15636
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.472 0.404 0.344)

	Surface
	{
		SurfStyle       0.675184
		OceanStyle      0.116284
		Randomize      (0.509, -0.400, 0.572)
		colorDistMagn   0.401827
		colorDistFreq   0.884307
		detailScale     1085.64
		colorConversion true
		snowLevel       2
		tropicLatitude  0.988064
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.607393
		terraceProb     0.301767
		erosion         0
		montesMagn      0.411839
		montesFreq      3.20829
		montesSpiky     0.848485
		montesFraction  0.685802
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.63728
		hillsFraction   0.645376
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.207907
		craterFreq      0.271634
		craterDensity   0.834022
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.56905
		volcanoTemp     1611.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.184, 0.137, 0.096, 0.000)
		colorShelf     (0.189, 0.141, 0.110, 0.000)
		colorBeach     (0.222, 0.166, 0.131, 0.000)
		colorDesert    (0.241, 0.178, 0.127, 0.000)
		colorLowland   (0.264, 0.190, 0.145, 0.000)
		colorUpland    (0.293, 0.230, 0.176, 0.000)
		colorRock      (0.316, 0.251, 0.189, 0.000)
		colorSnow      (0.344, 0.267, 0.200, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.91589
		GasToDust   0.25
		Particles   2830
		GasBright   0.171256
		DustBright  0.248448
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   70.3766
		Period          431.165
		Eccentricity    0.985667
		Inclination     -95.9422
		AscendingNode   60.1669
		ArgOfPericenter -51.3635
		MeanAnomaly     -117.983
	}
}

Comet	"Ciutric 118"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            6.43785e-016
	Radius          0.113461
	InertiaMoment   0.399743

	Oblateness      0.00671126

	RotationPeriod  56.7986
	Obliquity       162.765
	EqAscendNode    339.129
	Precession      0

	AbsMagn         5.79828
	SlopeParam      4.73423
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.658 0.652 0.648)

	Surface
	{
		SurfStyle       0.356946
		OceanStyle      0.788175
		Randomize      (0.061, -0.226, -0.088)
		colorDistMagn   0.992038
		colorDistFreq   5.79874e-006
		detailScale     3.09825
		colorConversion true
		snowLevel       2
		tropicLatitude  0.337397
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.593315
		terraceProb     0.203552
		erosion         0
		montesMagn      0.358166
		montesFreq      3.28884
		montesSpiky     0.894257
		montesFraction  0.606431
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.44566e-005
		hillsFraction   0.638514
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231139
		craterFreq      0.208973
		craterDensity   0.965842
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.519856
		volcanoTemp     1754.92
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.263, 0.261, 0.259, 0.000)
		colorShelf     (0.279, 0.277, 0.275, 0.000)
		colorBeach     (0.296, 0.293, 0.292, 0.000)
		colorDesert    (0.312, 0.310, 0.308, 0.000)
		colorLowland   (0.329, 0.326, 0.324, 0.000)
		colorUpland    (0.345, 0.342, 0.340, 0.000)
		colorRock      (0.362, 0.359, 0.356, 0.000)
		colorSnow      (0.378, 0.375, 0.372, 1.000)
		BumpHeight      0.102115
		BumpOffset      0.020423
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.422334
		DustBright  0.481857
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   71.0341
		Period          437.221
		Eccentricity    0.956258
		Inclination     2.76472
		AscendingNode   152.022
		ArgOfPericenter 1.3445
		MeanAnomaly     -78.7539
	}
}

Comet	"Ciutric 119"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            4.97922e-012
	Radius          2.4625
	InertiaMoment   0.398592

	Oblateness      0.00943863

	RotationPeriod  54.9455
	Obliquity       115.97
	EqAscendNode    323.706
	Precession      0

	AbsMagn         14.4182
	SlopeParam      5.3826
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.619 0.616 0.612)

	Surface
	{
		SurfStyle       0.520913
		OceanStyle      0.509435
		Randomize      (0.723, -0.845, -0.604)
		colorDistMagn   0.622054
		colorDistFreq   0.00358418
		detailScale     67.2428
		colorConversion true
		snowLevel       2
		tropicLatitude  0.853508
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.63602
		terraceProb     0.271692
		erosion         0
		montesMagn      0.302749
		montesFreq      2.90237
		montesSpiky     0.970894
		montesFraction  0.523305
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0140569
		hillsFraction   0.548538
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24774
		craterFreq      0.245247
		craterDensity   1.0101
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.429544
		volcanoTemp     1469.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.241, 0.210, 0.171, 0.000)
		colorShelf     (0.247, 0.216, 0.196, 0.000)
		colorBeach     (0.291, 0.253, 0.233, 0.000)
		colorDesert    (0.315, 0.271, 0.227, 0.000)
		colorLowland   (0.346, 0.290, 0.257, 0.000)
		colorUpland    (0.383, 0.351, 0.312, 0.000)
		colorRock      (0.414, 0.382, 0.337, 0.000)
		colorSnow      (0.452, 0.407, 0.355, 1.000)
		BumpHeight      2.21625
		BumpOffset      0.443251
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.467524
		GasToDust   0.25
		Particles   1924
		GasBright   0.0153822
		DustBright  0.573295
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   54.528
		Period          294.056
		Eccentricity    0.958491
		Inclination     170.161
		AscendingNode   125.684
		ArgOfPericenter -113.513
		MeanAnomaly     139.1
	}
}

Comet	"Ciutric 120"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            3.85107e-008
	Radius          44.3182
	InertiaMoment   0.396308

	Oblateness      0.00754898

	RotationPeriod  53.1106
	Obliquity       69.176
	EqAscendNode    308.283
	Precession      0

	AbsMagn         9.09595
	SlopeParam      6.22825
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.573 0.569 0.565)

	Surface
	{
		SurfStyle       0.616613
		OceanStyle      0.254594
		Randomize      (-0.900, 0.232, -0.339)
		colorDistMagn   0.596046
		colorDistFreq   1.10644
		detailScale     1210.18
		colorConversion true
		snowLevel       2
		tropicLatitude  0.980666
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.376109
		terraceProb     0.122896
		erosion         0
		montesMagn      0.3739
		montesFreq      3.71609
		montesSpiky     0.956665
		montesFraction  0.207671
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.88898
		hillsFraction   0.65192
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233056
		craterFreq      0.227933
		craterDensity   0.902965
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.436838
		volcanoTemp     1304.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.223, 0.193, 0.158, 0.000)
		colorShelf     (0.229, 0.199, 0.181, 0.000)
		colorBeach     (0.269, 0.233, 0.215, 0.000)
		colorDesert    (0.292, 0.250, 0.209, 0.000)
		colorLowland   (0.321, 0.267, 0.238, 0.000)
		colorUpland    (0.355, 0.324, 0.288, 0.000)
		colorRock      (0.384, 0.353, 0.311, 0.000)
		colorSnow      (0.418, 0.376, 0.328, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.948716
		GasToDust   0.25
		Particles   2896
		GasBright   0.0232668
		DustBright  0.249897
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   55.4539
		Period          301.578
		Eccentricity    0.930547
		Inclination     -9.53975
		AscendingNode   179.275
		ArgOfPericenter -14.5161
		MeanAnomaly     122.63
	}
}

Comet	"Ciutric 121"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            1.18577e-015
	Radius          0.152524
	InertiaMoment   0.399088

	Oblateness      0.0108287

	RotationPeriod  51.2889
	Obliquity       22.3817
	EqAscendNode    292.861
	Precession      0

	AbsMagn         5.55121
	SlopeParam      8.08562
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.689 0.635 0.571)

	Surface
	{
		SurfStyle       0.514225
		OceanStyle      0.854247
		Randomize      (-0.029, 0.596, -0.612)
		colorDistMagn   0.670206
		colorDistFreq   2.07022e-005
		detailScale     4.16492
		colorConversion true
		snowLevel       2
		tropicLatitude  0.892506
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.370247
		terraceProb     0.383289
		erosion         0
		montesMagn      0.574801
		montesFreq      3.08266
		montesSpiky     0.939668
		montesFraction  0.460426
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.10925e-005
		hillsFraction   0.717036
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228849
		craterFreq      0.23466
		craterDensity   0.954313
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.474226
		volcanoTemp     1789.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.269, 0.216, 0.160, 0.000)
		colorShelf     (0.276, 0.222, 0.183, 0.000)
		colorBeach     (0.324, 0.260, 0.217, 0.000)
		colorDesert    (0.351, 0.279, 0.211, 0.000)
		colorLowland   (0.386, 0.298, 0.240, 0.000)
		colorUpland    (0.427, 0.362, 0.291, 0.000)
		colorRock      (0.462, 0.394, 0.314, 0.000)
		colorSnow      (0.503, 0.419, 0.331, 1.000)
		BumpHeight      0.137271
		BumpOffset      0.0274543
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0191577
		GasToDust   0.25
		Particles   1018
		GasBright   0.109269
		DustBright  0.648382
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   57.4494
		Period          318.002
		Eccentricity    0.944194
		Inclination     -110.272
		AscendingNode   111.457
		ArgOfPericenter -58.879
		MeanAnomaly     -117.464
	}
}

Comet	"Ciutric 122"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            9.17111e-012
	Radius          2.74349
	InertiaMoment   0.397609

	Oblateness      0.00870778

	RotationPeriod  49.4756
	Obliquity       335.587
	EqAscendNode    277.438
	Precession      0

	AbsMagn         13.7551
	SlopeParam      2.65226
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.745 0.620 0.538)

	Surface
	{
		SurfStyle       0.135833
		OceanStyle      0.127618
		Randomize      (-0.526, 0.187, 0.916)
		colorDistMagn   0.103217
		colorDistFreq   0.00127079
		detailScale     74.9155
		colorConversion true
		snowLevel       2
		tropicLatitude  0.899682
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.554688
		terraceProb     0.160069
		erosion         0
		montesMagn      0.495849
		montesFreq      2.92689
		montesSpiky     0.994912
		montesFraction  0.810629
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0171735
		hillsFraction   0.550369
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240452
		craterFreq      0.202419
		craterDensity   1.08188
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.344088
		volcanoTemp     1627.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.298, 0.248, 0.215, 0.000)
		colorShelf     (0.316, 0.264, 0.229, 0.000)
		colorBeach     (0.335, 0.279, 0.242, 0.000)
		colorDesert    (0.354, 0.295, 0.256, 0.000)
		colorLowland   (0.372, 0.310, 0.269, 0.000)
		colorUpland    (0.391, 0.326, 0.283, 0.000)
		colorRock      (0.410, 0.341, 0.296, 0.000)
		colorSnow      (0.428, 0.357, 0.309, 1.000)
		BumpHeight      2.46914
		BumpOffset      0.493827
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.50035
		GasToDust   0.25
		Particles   1990
		GasBright   0.0898714
		DustBright  0.352266
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   50.2593
		Period          260.211
		Eccentricity    0.939328
		Inclination     57.6599
		AscendingNode   98.3269
		ArgOfPericenter -164.162
		MeanAnomaly     -5.39222
	}
}

Comet	"Ciutric 123"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            7.09318e-008
	Radius          59.6073
	InertiaMoment   0.399533

	Oblateness      0.0125308

	RotationPeriod  47.666
	Obliquity       288.793
	EqAscendNode    262.016
	Precession      0

	AbsMagn         8.88083
	SlopeParam      3.29522
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.677 0.561 0.488)

	Surface
	{
		SurfStyle       0.48236
		OceanStyle      0.662377
		Randomize      (-0.930, 0.037, 0.924)
		colorDistMagn   0.620284
		colorDistFreq   1.55778
		detailScale     1627.68
		colorConversion true
		snowLevel       2
		tropicLatitude  0.125674
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.606289
		terraceProb     0.228331
		erosion         0
		montesMagn      0.553577
		montesFreq      3.27875
		montesSpiky     0.882228
		montesFraction  0.757055
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.87906
		hillsFraction   0.472097
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227005
		craterFreq      0.242323
		craterDensity   0.984277
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.480658
		volcanoTemp     1369.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.271, 0.224, 0.195, 0.000)
		colorShelf     (0.288, 0.238, 0.207, 0.000)
		colorBeach     (0.305, 0.252, 0.219, 0.000)
		colorDesert    (0.321, 0.266, 0.232, 0.000)
		colorLowland   (0.338, 0.280, 0.244, 0.000)
		colorUpland    (0.355, 0.294, 0.256, 0.000)
		colorRock      (0.372, 0.308, 0.268, 0.000)
		colorSnow      (0.389, 0.322, 0.280, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.981542
		GasToDust   0.25
		Particles   2962
		GasBright   0.243064
		DustBright  0.68356
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   65.9716
		Period          391.324
		Eccentricity    0.948063
		Inclination     115.026
		AscendingNode   -176.069
		ArgOfPericenter -52.7624
		MeanAnomaly     -14.8924
	}
}

Comet	"Ciutric 124"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            2.18404e-015
	Radius          0.169827
	InertiaMoment   0.398313

	Oblateness      0.0101233

	RotationPeriod  45.8556
	Obliquity       241.999
	EqAscendNode    246.593
	Precession      0

	AbsMagn         5.29442
	SlopeParam      3.87132
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.426 0.420 0.413)

	Surface
	{
		SurfStyle       0.223093
		OceanStyle      0.884413
		Randomize      (-0.821, 0.680, -0.735)
		colorDistMagn   0.793623
		colorDistFreq   1.46783e-005
		detailScale     4.6374
		colorConversion true
		snowLevel       2
		tropicLatitude  0.715216
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.517278
		terraceProb     0.271876
		erosion         0
		montesMagn      0.457209
		montesFreq      2.08354
		montesSpiky     0.789098
		montesFraction  0.756373
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.32416e-005
		hillsFraction   0.610892
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22685
		craterFreq      0.164592
		craterDensity   0.893831
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.453509
		volcanoTemp     1364.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.170, 0.168, 0.165, 0.000)
		colorShelf     (0.181, 0.178, 0.176, 0.000)
		colorBeach     (0.192, 0.189, 0.186, 0.000)
		colorDesert    (0.202, 0.199, 0.196, 0.000)
		colorLowland   (0.213, 0.210, 0.207, 0.000)
		colorUpland    (0.224, 0.220, 0.217, 0.000)
		colorRock      (0.234, 0.231, 0.227, 0.000)
		colorSnow      (0.245, 0.241, 0.238, 1.000)
		BumpHeight      0.152844
		BumpOffset      0.0305688
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0519834
		GasToDust   0.25
		Particles   1084
		GasBright   0.196384
		DustBright  0.414726
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   89.9731
		Period          623.261
		Eccentricity    0.963406
		Inclination     -107.598
		AscendingNode   -2.45479
		ArgOfPericenter 31.4453
		MeanAnomaly     118.223
	}
}

Comet	"Ciutric 125"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            1.6892e-011
	Radius          3.69202
	InertiaMoment   0.399956

	Oblateness      0.0146705

	RotationPeriod  44.0397
	Obliquity       195.205
	EqAscendNode    231.17
	Precession      0

	AbsMagn         13.2208
	SlopeParam      4.43672
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.675 0.589 0.544)

	Surface
	{
		SurfStyle       0.994096
		OceanStyle      0.0487477
		Randomize      (-0.721, 0.433, 0.335)
		colorDistMagn   0.359039
		colorDistFreq   0.00802688
		detailScale     100.817
		colorConversion true
		snowLevel       2
		tropicLatitude  0.353598
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.314911
		terraceProb     0.33724
		erosion         0
		montesMagn      0.552779
		montesFreq      3.53462
		montesSpiky     0.847549
		montesFraction  0.53967
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0403648
		hillsFraction   0.914291
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.283169
		craterFreq      0.274458
		craterDensity   0.865354
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.547454
		volcanoTemp     1456
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.229, 0.206, 0.218, 0.050)
		colorShelf     (0.270, 0.242, 0.250, 0.040)
		colorBeach     (0.310, 0.277, 0.283, 0.030)
		colorDesert    (0.351, 0.312, 0.321, 0.020)
		colorLowland   (0.391, 0.348, 0.354, 0.030)
		colorUpland    (0.432, 0.383, 0.386, 0.050)
		colorRock      (0.472, 0.418, 0.430, 0.020)
		colorSnow      (0.472, 0.418, 0.430, 1.000)
		BumpHeight      3.32281
		BumpOffset      0.664563
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.533176
		GasToDust   0.25
		Particles   2056
		GasBright   0.112446
		DustBright  0.183151
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   73.7182
		Period          462.235
		Eccentricity    0.970139
		Inclination     -24.1789
		AscendingNode   -59.1653
		ArgOfPericenter -105.05
		MeanAnomaly     -46.2854
	}
}

Comet	"Ciutric 126"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            1.30648e-007
	Radius          66.3271
	InertiaMoment   0.398852

	Oblateness      0.0119204

	RotationPeriod  42.2137
	Obliquity       148.41
	EqAscendNode    215.748
	Precession      0

	AbsMagn         8.66822
	SlopeParam      5.0402
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.489 0.484 0.481)

	Surface
	{
		SurfStyle       0.422814
		OceanStyle      0.868977
		Randomize      (-0.115, -0.209, 0.515)
		colorDistMagn   0.35046
		colorDistFreq   2.4602
		detailScale     1811.17
		colorConversion true
		snowLevel       2
		tropicLatitude  0.944794
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.38359
		terraceProb     0.102308
		erosion         0
		montesMagn      0.625473
		montesFreq      3.64308
		montesSpiky     0.987883
		montesFraction  0.559121
		dunesFraction   0
		hillsMagn       0
		hillsFreq       10.3565
		hillsFraction   0.735132
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.205582
		craterFreq      0.272599
		craterDensity   0.917698
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.492573
		volcanoTemp     1487.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.196, 0.193, 0.193, 0.000)
		colorShelf     (0.208, 0.206, 0.205, 0.000)
		colorBeach     (0.220, 0.218, 0.217, 0.000)
		colorDesert    (0.232, 0.230, 0.229, 0.000)
		colorLowland   (0.245, 0.242, 0.241, 0.000)
		colorUpland    (0.257, 0.254, 0.253, 0.000)
		colorRock      (0.269, 0.266, 0.265, 0.000)
		colorSnow      (0.281, 0.278, 0.277, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.342805
		DustBright  0.437278
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   62.8287
		Period          363.695
		Eccentricity    0.943073
		Inclination     44.9543
		AscendingNode   138.023
		ArgOfPericenter -134.456
		MeanAnomaly     92.8889
	}
}

Comet	"Ciutric 127"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            4.02273e-015
	Radius          0.22868
	InertiaMoment   0.397117

	Oblateness      0.0172342

	RotationPeriod  40.3727
	Obliquity       101.616
	EqAscendNode    200.325
	Precession      0

	AbsMagn         5.02597
	SlopeParam      5.76007
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.538 0.472 0.368)

	Surface
	{
		SurfStyle       0.989259
		OceanStyle      0.328277
		Randomize      (-0.576, 0.369, -0.816)
		colorDistMagn   0.927251
		colorDistFreq   3.41807e-005
		detailScale     6.24449
		colorConversion true
		snowLevel       2
		tropicLatitude  0.883075
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.413012
		terraceProb     0.2833
		erosion         0
		montesMagn      0.603125
		montesFreq      2.51171
		montesSpiky     0.840099
		montesFraction  0.560696
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000142808
		hillsFraction   0.634675
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24863
		craterFreq      0.21554
		craterDensity   0.970855
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.54906
		volcanoTemp     1622.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.183, 0.165, 0.147, 0.050)
		colorShelf     (0.215, 0.194, 0.169, 0.040)
		colorBeach     (0.247, 0.222, 0.191, 0.030)
		colorDesert    (0.280, 0.250, 0.217, 0.020)
		colorLowland   (0.312, 0.278, 0.239, 0.030)
		colorUpland    (0.344, 0.307, 0.261, 0.050)
		colorRock      (0.376, 0.335, 0.291, 0.020)
		colorSnow      (0.376, 0.335, 0.291, 1.000)
		BumpHeight      0.205812
		BumpOffset      0.0411624
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0848094
		GasToDust   0.25
		Particles   1151
		GasBright   0.231585
		DustBright  0.232986
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   54.7097
		Period          295.527
		Eccentricity    0.931674
		Inclination     -40.5364
		AscendingNode   12.1932
		ArgOfPericenter -137.012
		MeanAnomaly     -58.9905
	}
}

Comet	"Ciutric 128"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            3.1113e-011
	Radius          4.10541
	InertiaMoment   0.399318

	Oblateness      0.0142867

	RotationPeriod  38.5115
	Obliquity       54.8217
	EqAscendNode    184.903
	Precession      0

	AbsMagn         12.7661
	SlopeParam      6.84634
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.757 0.724 0.674)

	Surface
	{
		SurfStyle       0.332355
		OceanStyle      0.627049
		Randomize      (0.497, 0.778, -0.504)
		colorDistMagn   0.423692
		colorDistFreq   0.012166
		detailScale     112.105
		colorConversion true
		snowLevel       2
		tropicLatitude  0.808634
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.547046
		terraceProb     0.202887
		erosion         0
		montesMagn      0.539223
		montesFreq      3.15635
		montesSpiky     0.922535
		montesFraction  0.559376
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.044887
		hillsFraction   0.644748
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245565
		craterFreq      0.249641
		craterDensity   0.69543
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.411006
		volcanoTemp     1264.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.303, 0.289, 0.270, 0.000)
		colorShelf     (0.322, 0.307, 0.286, 0.000)
		colorBeach     (0.341, 0.326, 0.303, 0.000)
		colorDesert    (0.360, 0.344, 0.320, 0.000)
		colorLowland   (0.378, 0.362, 0.337, 0.000)
		colorUpland    (0.397, 0.380, 0.354, 0.000)
		colorRock      (0.416, 0.398, 0.371, 0.000)
		colorSnow      (0.435, 0.416, 0.388, 1.000)
		BumpHeight      3.69487
		BumpOffset      0.738974
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.566001
		GasToDust   0.25
		Particles   2123
		GasBright   0.0546062
		DustBright  0.894451
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   58.1455
		Period          323.799
		Eccentricity    0.993573
		Inclination     -0.859106
		AscendingNode   0.846569
		ArgOfPericenter -179.971
		MeanAnomaly     -115.717
	}
}

Comet	"Ciutric 129"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            2.40636e-007
	Radius          89.3706
	InertiaMoment   0.397996

	Oblateness      0.0209658

	RotationPeriod  36.6245
	Obliquity       8.02737
	EqAscendNode    169.48
	Precession      0

	AbsMagn         8.45748
	SlopeParam      2.26904
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.680 0.626 0.553)

	Surface
	{
		SurfStyle       0.455742
		OceanStyle      0.566048
		Randomize      (0.856, -0.357, 0.429)
		colorDistMagn   0.529705
		colorDistFreq   5.99773
		detailScale     2440.41
		colorConversion true
		snowLevel       2
		tropicLatitude  0.251158
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.333628
		terraceProb     0.529279
		erosion         0
		montesMagn      0.365868
		montesFreq      1.93374
		montesSpiky     0.936036
		montesFraction  0.595933
		dunesFraction   0
		hillsMagn       0
		hillsFreq       18.2523
		hillsFraction   0.672628
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243554
		craterFreq      0.209379
		craterDensity   0.982581
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.483286
		volcanoTemp     1629.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.272, 0.251, 0.221, 0.000)
		colorShelf     (0.289, 0.266, 0.235, 0.000)
		colorBeach     (0.306, 0.282, 0.249, 0.000)
		colorDesert    (0.323, 0.298, 0.263, 0.000)
		colorLowland   (0.340, 0.313, 0.276, 0.000)
		colorUpland    (0.357, 0.329, 0.290, 0.000)
		colorRock      (0.374, 0.345, 0.304, 0.000)
		colorSnow      (0.391, 0.360, 0.318, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0738601
		DustBright  0.559683
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   72.186
		Period          447.899
		Eccentricity    0.95002
		Inclination     -6.53954
		AscendingNode   173.845
		ArgOfPericenter -25.6027
		MeanAnomaly     169.54
	}
}

Comet	"Ciutric 130"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            7.40938e-015
	Radius          0.254097
	InertiaMoment   0.399749

	Oblateness      0.0175429

	RotationPeriod  34.7058
	Obliquity       321.233
	EqAscendNode    154.057
	Precession      0

	AbsMagn         4.74339
	SlopeParam      2.98251
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.502 0.498 0.496)

	Surface
	{
		SurfStyle       0.882715
		OceanStyle      0.386296
		Randomize      (0.370, 0.006, -0.010)
		colorDistMagn   0.606925
		colorDistFreq   2.21426e-005
		detailScale     6.93855
		colorConversion true
		snowLevel       2
		tropicLatitude  0.396155
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.330524
		terraceProb     0.219525
		erosion         0
		montesMagn      0.559858
		montesFreq      3.27345
		montesSpiky     0.909075
		montesFraction  0.773232
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000143753
		hillsFraction   0.707771
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240149
		craterFreq      0.239219
		craterDensity   0.965918
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.506815
		volcanoTemp     1339.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.171, 0.174, 0.198, 0.050)
		colorShelf     (0.201, 0.204, 0.228, 0.040)
		colorBeach     (0.231, 0.234, 0.258, 0.030)
		colorDesert    (0.261, 0.264, 0.293, 0.020)
		colorLowland   (0.291, 0.294, 0.322, 0.030)
		colorUpland    (0.321, 0.324, 0.352, 0.050)
		colorRock      (0.351, 0.353, 0.392, 0.020)
		colorSnow      (0.351, 0.353, 0.392, 1.000)
		BumpHeight      0.228688
		BumpOffset      0.0457375
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.117635
		GasToDust   0.25
		Particles   1217
		GasBright   0.0558549
		DustBright  0.262175
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   53.1064
		Period          282.632
		Eccentricity    0.960891
		Inclination     46.1718
		AscendingNode   -33.1397
		ArgOfPericenter 2.40108
		MeanAnomaly     24.7352
	}
}

Comet	"Ciutric 131"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            5.73062e-011
	Radius          5.53557
	InertiaMoment   0.398599

	Oblateness      0.0262251

	RotationPeriod  32.7485
	Obliquity       274.439
	EqAscendNode    138.635
	Precession      0

	AbsMagn         12.3659
	SlopeParam      3.58363
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.620 0.524 0.476)

	Surface
	{
		SurfStyle       0.90071
		OceanStyle      0.725587
		Randomize      (-0.509, 0.294, -0.790)
		colorDistMagn   0.299124
		colorDistFreq   0.014449
		detailScale     151.158
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999522
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.765785
		terraceProb     0.195433
		erosion         0
		montesMagn      0.226671
		montesFreq      2.84582
		montesSpiky     0.809951
		montesFraction  0.455753
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0953975
		hillsFraction   0.596016
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242856
		craterFreq      0.248824
		craterDensity   0.912525
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.519478
		volcanoTemp     1316.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.211, 0.184, 0.190, 0.050)
		colorShelf     (0.248, 0.215, 0.219, 0.040)
		colorBeach     (0.285, 0.246, 0.248, 0.030)
		colorDesert    (0.323, 0.278, 0.281, 0.020)
		colorLowland   (0.360, 0.309, 0.310, 0.030)
		colorUpland    (0.397, 0.341, 0.338, 0.050)
		colorRock      (0.434, 0.372, 0.376, 0.020)
		colorSnow      (0.434, 0.372, 0.376, 1.000)
		BumpHeight      4.98202
		BumpOffset      0.996403
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.598827
		GasToDust   0.25
		Particles   2189
		GasBright   0.188329
		DustBright  0.614187
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   44.3217
		Period          215.489
		Eccentricity    0.92431
		Inclination     -109.444
		AscendingNode   93.4571
		ArgOfPericenter 14.7488
		MeanAnomaly     -71.6089
	}
}

Comet	"Ciutric 132"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            4.43223e-007
	Radius          99.2247
	InertiaMoment   0.396336

	Oblateness      0.0219693

	RotationPeriod  30.7451
	Obliquity       227.644
	EqAscendNode    123.212
	Precession      0

	AbsMagn         8.24801
	SlopeParam      4.14862
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.658 0.654 0.651)

	Surface
	{
		SurfStyle       0.356495
		OceanStyle      0.425557
		Randomize      (0.582, 0.826, -0.915)
		colorDistMagn   0.715633
		colorDistFreq   4.27247
		detailScale     2709.5
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997578
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.56915
		terraceProb     0.259066
		erosion         0
		montesMagn      0.638143
		montesFreq      2.3587
		montesSpiky     0.930106
		montesFraction  0.47993
		dunesFraction   0
		hillsMagn       0
		hillsFreq       23.4165
		hillsFraction   0.61069
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2391
		craterFreq      0.298577
		craterDensity   0.928328
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.485707
		volcanoTemp     1698.95
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.263, 0.262, 0.260, 0.000)
		colorShelf     (0.279, 0.278, 0.277, 0.000)
		colorBeach     (0.296, 0.294, 0.293, 0.000)
		colorDesert    (0.312, 0.311, 0.309, 0.000)
		colorLowland   (0.329, 0.327, 0.326, 0.000)
		colorUpland    (0.345, 0.344, 0.342, 0.000)
		colorRock      (0.362, 0.360, 0.358, 0.000)
		colorSnow      (0.378, 0.376, 0.374, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.143042
		DustBright  0.343961
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   47.8703
		Period          241.88
		Eccentricity    0.916607
		Inclination     120.97
		AscendingNode   -131.067
		ArgOfPericenter 45.2241
		MeanAnomaly     -53.8825
	}
}

Comet	"Ciutric 133"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            1.36471e-014
	Radius          0.342871
	InertiaMoment   0.399094

	Oblateness      0.0341676

	RotationPeriod  28.6866
	Obliquity       180.85
	EqAscendNode    107.79
	Precession      0

	AbsMagn         4.44353
	SlopeParam      4.72599
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.669 0.570 0.534)

	Surface
	{
		SurfStyle       0.160585
		OceanStyle      0.931948
		Randomize      (-0.219, -0.593, 0.274)
		colorDistMagn   0.56142
		colorDistFreq   9.07578e-006
		detailScale     9.36267
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0790283
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.544279
		terraceProb     0.313186
		erosion         0
		montesMagn      0.5654
		montesFreq      3.36314
		montesSpiky     0.936019
		montesFraction  0.83032
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000200989
		hillsFraction   0.712308
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.212189
		craterFreq      0.215163
		craterDensity   0.843714
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.54295
		volcanoTemp     1455.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.267, 0.228, 0.214, 0.000)
		colorShelf     (0.284, 0.242, 0.227, 0.000)
		colorBeach     (0.301, 0.257, 0.240, 0.000)
		colorDesert    (0.318, 0.271, 0.254, 0.000)
		colorLowland   (0.334, 0.285, 0.267, 0.000)
		colorUpland    (0.351, 0.299, 0.280, 0.000)
		colorRock      (0.368, 0.314, 0.294, 0.000)
		colorSnow      (0.384, 0.328, 0.307, 1.000)
		BumpHeight      0.308584
		BumpOffset      0.0617168
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.150461
		GasToDust   0.25
		Particles   1283
		GasBright   0.342706
		DustBright  0.628783
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   52.1786
		Period          275.257
		Eccentricity    0.900538
		Inclination     -3.69115
		AscendingNode   -170.959
		ArgOfPericenter 152.837
		MeanAnomaly     102.321
	}
}

Comet	"Ciutric 134"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            1.05551e-010
	Radius          6.14062
	InertiaMoment   0.39762

	Oblateness      0.0294334

	RotationPeriod  26.563
	Obliquity       134.056
	EqAscendNode    92.3671
	Precession      0

	AbsMagn         12.0052
	SlopeParam      5.37281
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.575 0.567 0.562)

	Surface
	{
		SurfStyle       0.194997
		OceanStyle      0.695074
		Randomize      (-0.120, -0.813, -0.122)
		colorDistMagn   0.249251
		colorDistFreq   0.0237521
		detailScale     167.68
		colorConversion true
		snowLevel       2
		tropicLatitude  0.547217
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.735811
		terraceProb     0.242432
		erosion         0
		montesMagn      0.548385
		montesFreq      2.76186
		montesSpiky     0.808833
		montesFraction  0.366919
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0874988
		hillsFraction   0.633069
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.197816
		craterFreq      0.222153
		craterDensity   0.902644
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.562733
		volcanoTemp     1362.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.230, 0.227, 0.225, 0.000)
		colorShelf     (0.244, 0.241, 0.239, 0.000)
		colorBeach     (0.259, 0.255, 0.253, 0.000)
		colorDesert    (0.273, 0.269, 0.267, 0.000)
		colorLowland   (0.287, 0.283, 0.281, 0.000)
		colorUpland    (0.302, 0.298, 0.295, 0.000)
		colorRock      (0.316, 0.312, 0.309, 0.000)
		colorSnow      (0.330, 0.326, 0.323, 1.000)
		BumpHeight      5.52656
		BumpOffset      1.10531
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.631653
		GasToDust   0.25
		Particles   2255
		GasBright   0.270137
		DustBright  0.385839
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   68.1704
		Period          411.049
		Eccentricity    0.947846
		Inclination     -78.9993
		AscendingNode   176.722
		ArgOfPericenter 108.075
		MeanAnomaly     -154.763
	}
}

Comet	"Ciutric 135"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            3.24998e-018
	Radius          0.0212374
	InertiaMoment   0.399538

	Oblateness      0.0473524

	RotationPeriod  24.362
	Obliquity       87.2616
	EqAscendNode    76.9445
	Precession      0

	AbsMagn         8.03922
	SlopeParam      6.21396
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.771 0.767 0.765)

	Surface
	{
		SurfStyle       0.493751
		OceanStyle      0.0587424
		Randomize      (0.428, -0.251, -0.498)
		colorDistMagn   0.905497
		colorDistFreq   1.53123e-007
		detailScale     0.579923
		colorConversion true
		snowLevel       2
		tropicLatitude  0.992164
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.36614
		terraceProb     0.149383
		erosion         0
		montesMagn      0.567116
		montesFreq      2.9126
		montesSpiky     0.871747
		montesFraction  0.555737
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.13317e-006
		hillsFraction   0.729032
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.26569
		craterFreq      0.150308
		craterDensity   0.629356
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.455422
		volcanoTemp     1601.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.308, 0.307, 0.306, 0.000)
		colorShelf     (0.328, 0.326, 0.325, 0.000)
		colorBeach     (0.347, 0.345, 0.344, 0.000)
		colorDesert    (0.366, 0.364, 0.364, 0.000)
		colorLowland   (0.386, 0.384, 0.383, 0.000)
		colorUpland    (0.405, 0.403, 0.402, 0.000)
		colorRock      (0.424, 0.422, 0.421, 0.000)
		colorSnow      (0.443, 0.441, 0.440, 1.000)
		BumpHeight      0.0191137
		BumpOffset      0.00382273
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.160308
		DustBright  0.180154
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   45.9051
		Period          227.139
		Eccentricity    0.914153
		Inclination     -120.828
		AscendingNode   79.9671
		ArgOfPericenter -116.116
		MeanAnomaly     -126.592
	}
}

Comet	"Ciutric 136"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            2.51363e-014
	Radius          0.379993
	InertiaMoment   0.39832

	Oblateness      0.0425429

	RotationPeriod  22.0688
	Obliquity       40.4673
	EqAscendNode    61.522
	Precession      0

	AbsMagn         4.12222
	SlopeParam      8.02533
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.745 0.743 0.741)

	Surface
	{
		SurfStyle       0.494979
		OceanStyle      0.581883
		Randomize      (0.684, 0.005, 0.849)
		colorDistMagn   0.707657
		colorDistFreq   4.54815e-005
		detailScale     10.3763
		colorConversion true
		snowLevel       2
		tropicLatitude  0.641835
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.5306
		terraceProb     0.413369
		erosion         0
		montesMagn      0.467802
		montesFreq      2.79462
		montesSpiky     0.94679
		montesFraction  0.604588
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00041144
		hillsFraction   0.772559
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237766
		craterFreq      0.236557
		craterDensity   0.810997
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.475829
		volcanoTemp     1614.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.298, 0.297, 0.296, 0.000)
		colorShelf     (0.317, 0.316, 0.315, 0.000)
		colorBeach     (0.335, 0.334, 0.333, 0.000)
		colorDesert    (0.354, 0.353, 0.352, 0.000)
		colorLowland   (0.373, 0.371, 0.370, 0.000)
		colorUpland    (0.391, 0.390, 0.389, 0.000)
		colorRock      (0.410, 0.409, 0.407, 0.000)
		colorSnow      (0.428, 0.427, 0.426, 1.000)
		BumpHeight      0.341993
		BumpOffset      0.0683987
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.183287
		GasToDust   0.25
		Particles   1350
		GasBright   0.0246655
		DustBright  0.800284
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   59.2342
		Period          332.935
		Eccentricity    0.960814
		Inclination     -52.4024
		AscendingNode   53.9406
		ArgOfPericenter 101.998
		MeanAnomaly     -38.2734
	}
}

Comet	"Ciutric 137"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            1.94411e-010
	Radius          8.2999
	InertiaMoment   0.399961

	Oblateness      0.0726329

	RotationPeriod  19.6652
	Obliquity       353.673
	EqAscendNode    46.0994
	Precession      0

	AbsMagn         11.6745
	SlopeParam      2.64256
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.712 0.709 0.705)

	Surface
	{
		SurfStyle       0.463435
		OceanStyle      0.673392
		Randomize      (0.657, 0.180, 0.941)
		colorDistMagn   0.491587
		colorDistFreq   0.0478799
		detailScale     226.643
		colorConversion true
		snowLevel       2
		tropicLatitude  0.99122
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.25747
		terraceProb     0.326184
		erosion         0
		montesMagn      0.289155
		montesFreq      3.29499
		montesSpiky     0.977738
		montesFraction  0.481635
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.175257
		hillsFraction   0.581676
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254898
		craterFreq      0.266398
		craterDensity   0.828638
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.446435
		volcanoTemp     1719.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.285, 0.284, 0.282, 0.000)
		colorShelf     (0.302, 0.301, 0.300, 0.000)
		colorBeach     (0.320, 0.319, 0.317, 0.000)
		colorDesert    (0.338, 0.337, 0.335, 0.000)
		colorLowland   (0.356, 0.355, 0.352, 0.000)
		colorUpland    (0.374, 0.372, 0.370, 0.000)
		colorRock      (0.391, 0.390, 0.388, 0.000)
		colorSnow      (0.409, 0.408, 0.405, 1.000)
		BumpHeight      7.46991
		BumpOffset      1.49398
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.664479
		GasToDust   0.25
		Particles   2322
		GasBright   0.0453116
		DustBright  0.464124
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   31.3547
		Period          128.22
		Eccentricity    0.88325
		Inclination     103.068
		AscendingNode   30.4827
		ArgOfPericenter -124.755
		MeanAnomaly     -164.815
	}
}

Comet	"Ciutric 138"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            5.98607e-018
	Radius          0.0235128
	InertiaMoment   0.398858

	Oblateness      0.070403

	RotationPeriod  17.1281
	Obliquity       306.879
	EqAscendNode    30.6768
	Precession      0

	AbsMagn         7.83053
	SlopeParam      3.287
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.725 0.723 0.722)

	Surface
	{
		SurfStyle       0.327013
		OceanStyle      0.223317
		Randomize      (0.035, -0.413, -0.623)
		colorDistMagn   0.518115
		colorDistFreq   2.4686e-007
		detailScale     0.642057
		colorConversion true
		snowLevel       2
		tropicLatitude  0.988478
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.417587
		terraceProb     0.267203
		erosion         0
		montesMagn      0.344665
		montesFreq      2.58731
		montesSpiky     0.88751
		montesFraction  0.570084
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.1291e-006
		hillsFraction   0.715543
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.269299
		craterFreq      0.160075
		craterDensity   1.02733
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.484515
		volcanoTemp     1268.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.290, 0.289, 0.289, 0.000)
		colorShelf     (0.308, 0.307, 0.307, 0.000)
		colorBeach     (0.326, 0.325, 0.325, 0.000)
		colorDesert    (0.345, 0.343, 0.343, 0.000)
		colorLowland   (0.363, 0.362, 0.361, 0.000)
		colorUpland    (0.381, 0.380, 0.379, 0.000)
		colorRock      (0.399, 0.398, 0.397, 0.000)
		colorSnow      (0.417, 0.416, 0.415, 1.000)
		BumpHeight      0.0211615
		BumpOffset      0.00423231
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.14709
		DustBright  0.846832
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   50.7765
		Period          264.237
		Eccentricity    0.950982
		Inclination     -130.207
		AscendingNode   -151.877
		ArgOfPericenter 16.4575
		MeanAnomaly     148.432
	}
}

Comet	"Ciutric 139"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            4.6298e-014
	Radius          0.514098
	InertiaMoment   0.397132

	Oblateness      0.133235

	RotationPeriod  14.4275
	Obliquity       260.084
	EqAscendNode    15.2542
	Precession      0

	AbsMagn         3.77371
	SlopeParam      3.86359
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.511 0.508 0.504)

	Surface
	{
		SurfStyle       0.908252
		OceanStyle      0.145417
		Randomize      (0.509, -0.927, 0.064)
		colorDistMagn   0.40434
		colorDistFreq   0.000121122
		detailScale     14.0383
		colorConversion true
		snowLevel       2
		tropicLatitude  0.641689
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.398533
		terraceProb     0.110089
		erosion         0
		montesMagn      0.477522
		montesFreq      3.04422
		montesSpiky     0.969012
		montesFraction  0.513017
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000656122
		hillsFraction   0.530797
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264912
		craterFreq      0.23891
		craterDensity   0.885054
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.422639
		volcanoTemp     1586.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.174, 0.178, 0.201, 0.050)
		colorShelf     (0.205, 0.208, 0.232, 0.040)
		colorBeach     (0.235, 0.239, 0.262, 0.030)
		colorDesert    (0.266, 0.269, 0.297, 0.020)
		colorLowland   (0.297, 0.300, 0.327, 0.030)
		colorUpland    (0.327, 0.330, 0.358, 0.050)
		colorRock      (0.358, 0.361, 0.398, 0.020)
		colorSnow      (0.358, 0.361, 0.398, 1.000)
		BumpHeight      0.462688
		BumpOffset      0.0925376
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.216113
		GasToDust   0.25
		Particles   1416
		GasBright   0.140455
		DustBright  0.537955
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   56.4149
		Period          309.451
		Eccentricity    0.942018
		Inclination     -117.53
		AscendingNode   -14.2747
		ArgOfPericenter -125.392
		MeanAnomaly     -0.714867
	}
}

Comet	"Ciutric 140"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            3.58081e-010
	Radius          9.17901
	InertiaMoment   0.399323

	Oblateness      0.15497

	RotationPeriod  11.5233
	Obliquity       213.29
	EqAscendNode    359.832
	Precession      0

	AbsMagn         11.3671
	SlopeParam      4.42882
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.498 0.493 0.490)

	Surface
	{
		SurfStyle       0.434173
		OceanStyle      0.819422
		Randomize      (-0.310, -0.478, -0.950)
		colorDistMagn   0.494503
		colorDistFreq   0.0256739
		detailScale     250.648
		colorConversion true
		snowLevel       2
		tropicLatitude  0.699119
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.565603
		terraceProb     0.246205
		erosion         0
		montesMagn      0.635813
		montesFreq      2.70402
		montesSpiky     0.901802
		montesFraction  0.641518
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.156143
		hillsFraction   0.368518
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.21852
		craterFreq      0.236042
		craterDensity   0.748795
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.570311
		volcanoTemp     1693.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.199, 0.197, 0.196, 0.000)
		colorShelf     (0.212, 0.209, 0.208, 0.000)
		colorBeach     (0.224, 0.222, 0.220, 0.000)
		colorDesert    (0.237, 0.234, 0.233, 0.000)
		colorLowland   (0.249, 0.246, 0.245, 0.000)
		colorUpland    (0.262, 0.259, 0.257, 0.000)
		colorRock      (0.274, 0.271, 0.269, 0.000)
		colorSnow      (0.287, 0.283, 0.282, 1.000)
		BumpHeight      8.26111
		BumpOffset      1.65222
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.697305
		GasToDust   0.25
		Particles   2388
		GasBright   0.0965594
		DustBright  0.266336
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   64.9566
		Period          382.327
		Eccentricity    0.9513
		Inclination     -29.3552
		AscendingNode   92.8897
		ArgOfPericenter -91.2074
		MeanAnomaly     94.3068
	}
}

Comet	"Ciutric 141"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            1.10256e-017
	Radius          0.0318433
	InertiaMoment   0.398005

	Oblateness      0.249

	RotationPeriod  8.35995
	Obliquity       166.496
	EqAscendNode    344.409
	Precession      0

	AbsMagn         7.62138
	SlopeParam      5.03138
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.670 0.664 0.661)

	Surface
	{
		SurfStyle       0.877001
		OceanStyle      0.750909
		Randomize      (-0.513, 0.659, 0.136)
		colorDistMagn   0.688116
		colorDistFreq   6.06804e-007
		detailScale     0.869535
		colorConversion true
		snowLevel       2
		tropicLatitude  0.149043
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.519521
		terraceProb     0.235701
		erosion         0
		montesMagn      0.562858
		montesFreq      2.8644
		montesSpiky     0.91093
		montesFraction  0.341662
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.12491e-006
		hillsFraction   0.477254
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240261
		craterFreq      0.219131
		craterDensity   1.05837
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.483639
		volcanoTemp     1946.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.228, 0.232, 0.264, 0.050)
		colorShelf     (0.268, 0.272, 0.304, 0.040)
		colorBeach     (0.308, 0.312, 0.344, 0.030)
		colorDesert    (0.349, 0.352, 0.390, 0.020)
		colorLowland   (0.389, 0.392, 0.429, 0.030)
		colorUpland    (0.429, 0.431, 0.469, 0.050)
		colorRock      (0.469, 0.471, 0.522, 0.020)
		colorSnow      (0.469, 0.471, 0.522, 1.000)
		BumpHeight      0.028659
		BumpOffset      0.0057318
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.275506
		DustBright  0.571876
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   40.4344
		Period          187.77
		Eccentricity    0.943441
		Inclination     -20.021
		AscendingNode   160.239
		ArgOfPericenter -119.301
		MeanAnomaly     -105.42
	}
}

Comet	"Ciutric 142"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            8.5275e-014
	Radius          0.567863
	InertiaMoment   0.399754

	Oblateness      0.249

	RotationPeriod  4.85659
	Obliquity       119.702
	EqAscendNode    328.986
	Precession      0

	AbsMagn         3.38975
	SlopeParam      5.74873
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.638 0.532 0.411)

	Surface
	{
		SurfStyle       0.804333
		OceanStyle      0.0445138
		Randomize      (0.802, 0.921, 0.607)
		colorDistMagn   0.236033
		colorDistFreq   0.000271423
		detailScale     15.5065
		colorConversion true
		snowLevel       2
		tropicLatitude  0.986805
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.669445
		terraceProb     0.15245
		erosion         0
		montesMagn      0.695305
		montesFreq      3.41505
		montesSpiky     0.858502
		montesFraction  0.587978
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00074641
		hillsFraction   0.690765
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.273719
		craterFreq      0.193768
		craterDensity   0.931661
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.520101
		volcanoTemp     1416.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.249, 0.181, 0.115, 0.000)
		colorShelf     (0.255, 0.186, 0.132, 0.000)
		colorBeach     (0.300, 0.218, 0.156, 0.000)
		colorDesert    (0.326, 0.234, 0.152, 0.000)
		colorLowland   (0.358, 0.250, 0.173, 0.000)
		colorUpland    (0.396, 0.303, 0.210, 0.000)
		colorRock      (0.428, 0.330, 0.226, 0.000)
		colorSnow      (0.466, 0.351, 0.239, 1.000)
		BumpHeight      0.511077
		BumpOffset      0.102215
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.248939
		GasToDust   0.25
		Particles   1482
		GasBright   0.204329
		DustBright  0.32754
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   52.4427
		Period          277.35
		Eccentricity    0.915507
		Inclination     -83.935
		AscendingNode   -97.2871
		ArgOfPericenter -83.8321
		MeanAnomaly     -160.199
	}
}

Comet	"Ciutric 143"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            6.5954e-010
	Radius          12.445
	InertiaMoment   0.398605

	Oblateness      0.00150361

	RotationPeriod  135.899
	Obliquity       72.9072
	EqAscendNode    313.564
	Precession      0

	AbsMagn         11.0785
	SlopeParam      6.82525
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.706 0.704 0.703)

	Surface
	{
		SurfStyle       0.834957
		OceanStyle      0.704916
		Randomize      (0.709, -0.489, 0.237)
		colorDistMagn   0.192731
		colorDistFreq   0.0760963
		detailScale     339.83
		colorConversion true
		snowLevel       2
		tropicLatitude  0.991144
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.639623
		terraceProb     0.105472
		erosion         0
		montesMagn      0.343749
		montesFreq      3.14951
		montesSpiky     0.781518
		montesFraction  0.457618
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.417836
		hillsFraction   0.605083
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22621
		craterFreq      0.264065
		craterDensity   0.866895
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.536647
		volcanoTemp     1780.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.275, 0.239, 0.197, 0.000)
		colorShelf     (0.283, 0.247, 0.225, 0.000)
		colorBeach     (0.332, 0.289, 0.267, 0.000)
		colorDesert    (0.360, 0.310, 0.260, 0.000)
		colorLowland   (0.396, 0.331, 0.295, 0.000)
		colorUpland    (0.438, 0.401, 0.358, 0.000)
		colorRock      (0.473, 0.437, 0.386, 0.000)
		colorSnow      (0.516, 0.465, 0.407, 1.000)
		BumpHeight      11.2005
		BumpOffset      2.24009
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.730131
		GasToDust   0.25
		Particles   2454
		GasBright   0.0958922
		DustBright  0.120463
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   63.9564
		Period          373.531
		Eccentricity    0.949185
		Inclination     46.3995
		AscendingNode   -61.0084
		ArgOfPericenter -103.514
		MeanAnomaly     38.8194
	}
}

Comet	"Ciutric 144"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            2.03077e-017
	Radius          0.035127
	InertiaMoment   0.396364

	Oblateness      0.00146515

	RotationPeriod  117.16
	Obliquity       26.1129
	EqAscendNode    298.141
	Precession      0

	AbsMagn         7.41119
	SlopeParam      2.2578
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.532 0.528 0.522)

	Surface
	{
		SurfStyle       0.864245
		OceanStyle      0.471561
		Randomize      (-0.979, -0.620, 0.808)
		colorDistMagn   0.399852
		colorDistFreq   2.85382e-007
		detailScale     0.959202
		colorConversion true
		snowLevel       2
		tropicLatitude  0.670605
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.508458
		terraceProb     0.282005
		erosion         0
		montesMagn      0.556942
		montesFreq      2.43436
		montesSpiky     0.972858
		montesFraction  0.468184
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.02261e-006
		hillsFraction   0.853662
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250842
		craterFreq      0.224652
		craterDensity   0.944067
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.483271
		volcanoTemp     1624.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.181, 0.185, 0.209, 0.050)
		colorShelf     (0.213, 0.216, 0.240, 0.040)
		colorBeach     (0.245, 0.248, 0.272, 0.030)
		colorDesert    (0.277, 0.280, 0.308, 0.020)
		colorLowland   (0.308, 0.312, 0.339, 0.030)
		colorUpland    (0.340, 0.343, 0.371, 0.050)
		colorRock      (0.372, 0.375, 0.413, 0.020)
		colorSnow      (0.372, 0.375, 0.413, 1.000)
		BumpHeight      0.0316143
		BumpOffset      0.00632286
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0015849
		DustBright  0.699257
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   90.5209
		Period          628.961
		Eccentricity    0.960362
		Inclination     -113.852
		AscendingNode   160.183
		ArgOfPericenter -69.9717
		MeanAnomaly     -135.25
	}
}

Comet	"Ciutric 145"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            1.57066e-013
	Radius          0.770849
	InertiaMoment   0.3991

	Oblateness      0.00237406

	RotationPeriod  108.139
	Obliquity       339.319
	EqAscendNode    282.719
	Precession      0

	AbsMagn         2.95783
	SlopeParam      2.97372
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.490 0.486 0.483)

	Surface
	{
		SurfStyle       0.293638
		OceanStyle      0.53499
		Randomize      (-0.997, 0.347, 0.318)
		colorDistMagn   0.767067
		colorDistFreq   0.000357889
		detailScale     21.0493
		colorConversion true
		snowLevel       2
		tropicLatitude  0.707108
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.433167
		terraceProb     0.253291
		erosion         0
		montesMagn      0.480708
		montesFreq      2.58467
		montesSpiky     0.979156
		montesFraction  0.55052
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00202102
		hillsFraction   0.657288
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235706
		craterFreq      0.274838
		craterDensity   0.921798
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.47433
		volcanoTemp     1435.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.196, 0.194, 0.193, 0.000)
		colorShelf     (0.208, 0.206, 0.205, 0.000)
		colorBeach     (0.220, 0.219, 0.217, 0.000)
		colorDesert    (0.233, 0.231, 0.229, 0.000)
		colorLowland   (0.245, 0.243, 0.241, 0.000)
		colorUpland    (0.257, 0.255, 0.253, 0.000)
		colorRock      (0.269, 0.267, 0.265, 0.000)
		colorSnow      (0.282, 0.279, 0.278, 1.000)
		BumpHeight      0.693764
		BumpOffset      0.138753
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.281765
		GasToDust   0.25
		Particles   1549
		GasBright   0.0236232
		DustBright  0.361705
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   69.6535
		Period          424.537
		Eccentricity    0.947897
		Inclination     123.321
		AscendingNode   130.887
		ArgOfPericenter 64.8791
		MeanAnomaly     102.775
	}
}

Comet	"Ciutric 146"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            1.21479e-009
	Radius          13.7082
	InertiaMoment   0.39763

	Oblateness      0.00193646

	RotationPeriod  101.82
	Obliquity       292.524
	EqAscendNode    267.296
	Precession      0

	AbsMagn         10.805
	SlopeParam      3.57574
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.670 0.668 0.664)

	Surface
	{
		SurfStyle       0.931262
		OceanStyle      0.963144
		Randomize      (-0.646, 0.186, -0.755)
		colorDistMagn   0.641897
		colorDistFreq   0.0911247
		detailScale     374.325
		colorConversion true
		snowLevel       2
		tropicLatitude  0.74075
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.619784
		terraceProb     0.602563
		erosion         0
		montesMagn      0.4146
		montesFreq      3.34279
		montesSpiky     0.916597
		montesFraction  0.798702
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.503733
		hillsFraction   0.80075
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238785
		craterFreq      0.225333
		craterDensity   0.849589
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.567679
		volcanoTemp     1579.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.228, 0.234, 0.266, 0.050)
		colorShelf     (0.268, 0.274, 0.305, 0.040)
		colorBeach     (0.308, 0.314, 0.345, 0.030)
		colorDesert    (0.348, 0.354, 0.392, 0.020)
		colorLowland   (0.388, 0.394, 0.432, 0.030)
		colorUpland    (0.429, 0.434, 0.471, 0.050)
		colorRock      (0.469, 0.474, 0.525, 0.020)
		colorSnow      (0.469, 0.474, 0.525, 1.000)
		BumpHeight      12.3374
		BumpOffset      2.46747
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.762957
		GasToDust   0.25
		Particles   2521
		GasBright   0.104684
		DustBright  0.765131
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   57.6707
		Period          319.841
		Eccentricity    0.931812
		Inclination     108.997
		AscendingNode   -24.2275
		ArgOfPericenter 13.0515
		MeanAnomaly     28.7698
	}
}

Comet	"Ciutric 147"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            3.74044e-017
	Radius          0.047747
	InertiaMoment   0.399544

	Oblateness      0.00295995

	RotationPeriod  96.8261
	Obliquity       245.73
	EqAscendNode    251.873
	Precession      0

	AbsMagn         7.19936
	SlopeParam      4.14088
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.503 0.501 0.496)

	Surface
	{
		SurfStyle       0.337325
		OceanStyle      0.885822
		Randomize      (0.857, 0.171, -0.736)
		colorDistMagn   0.423257
		colorDistFreq   1.2059e-006
		detailScale     1.30381
		colorConversion true
		snowLevel       2
		tropicLatitude  0.935865
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.394505
		terraceProb     0.126128
		erosion         0
		montesMagn      0.334863
		montesFreq      2.31238
		montesSpiky     0.983554
		montesFraction  0.547253
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.55248e-006
		hillsFraction   0.589931
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237673
		craterFreq      0.248911
		craterDensity   0.784878
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.484609
		volcanoTemp     1507.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.201, 0.200, 0.198, 0.000)
		colorShelf     (0.214, 0.213, 0.211, 0.000)
		colorBeach     (0.227, 0.225, 0.223, 0.000)
		colorDesert    (0.239, 0.238, 0.236, 0.000)
		colorLowland   (0.252, 0.250, 0.248, 0.000)
		colorUpland    (0.264, 0.263, 0.260, 0.000)
		colorRock      (0.277, 0.275, 0.273, 0.000)
		colorSnow      (0.289, 0.288, 0.285, 1.000)
		BumpHeight      0.0429723
		BumpOffset      0.00859445
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0994401
		DustBright  0.454861
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   62.1779
		Period          358.059
		Eccentricity    0.947697
		Inclination     -171.804
		AscendingNode   -65.2164
		ArgOfPericenter 106.936
		MeanAnomaly     -113.123
	}
}

Comet	"Ciutric 148"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            2.89296e-013
	Radius          0.847714
	InertiaMoment   0.398328

	Oblateness      0.00232971

	RotationPeriod  92.6272
	Obliquity       198.936
	EqAscendNode    236.451
	Precession      0

	AbsMagn         2.45744
	SlopeParam      4.71775
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.732 0.728 0.725)

	Surface
	{
		SurfStyle       0.891579
		OceanStyle      0.811813
		Randomize      (0.023, 0.667, 0.344)
		colorDistMagn   0.367904
		colorDistFreq   0.000487921
		detailScale     23.1482
		colorConversion true
		snowLevel       2
		tropicLatitude  0.827022
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.503824
		terraceProb     0.173728
		erosion         0
		montesMagn      0.484333
		montesFreq      1.95347
		montesSpiky     0.883892
		montesFraction  0.459362
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00122007
		hillsFraction   0.445858
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252615
		craterFreq      0.226168
		craterDensity   0.91413
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.488014
		volcanoTemp     1534.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.249, 0.255, 0.290, 0.050)
		colorShelf     (0.293, 0.298, 0.333, 0.040)
		colorBeach     (0.337, 0.342, 0.377, 0.030)
		colorDesert    (0.380, 0.386, 0.428, 0.020)
		colorLowland   (0.424, 0.429, 0.471, 0.030)
		colorUpland    (0.468, 0.473, 0.515, 0.050)
		colorRock      (0.512, 0.517, 0.573, 0.020)
		colorSnow      (0.512, 0.517, 0.573, 1.000)
		BumpHeight      0.762943
		BumpOffset      0.152589
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.314591
		GasToDust   0.25
		Particles   1615
		GasBright   0.0569372
		DustBright  0.181851
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   69.5277
		Period          423.387
		Eccentricity    0.942668
		Inclination     -122.944
		AscendingNode   100.105
		ArgOfPericenter 118.601
		MeanAnomaly     -115.857
	}
}

Comet	"Ciutric 149"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            2.23749e-009
	Radius          18.6605
	InertiaMoment   0.399966

	Oblateness      0.00350472

	RotationPeriod  88.9608
	Obliquity       152.141
	EqAscendNode    221.028
	Precession      0

	AbsMagn         10.5441
	SlopeParam      5.36306
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.610 0.607 0.603)

	Surface
	{
		SurfStyle       0.879934
		OceanStyle      0.029536
		Randomize      (0.312, -0.478, -0.088)
		colorDistMagn   0.325712
		colorDistFreq   0.137082
		detailScale     509.556
		colorConversion true
		snowLevel       2
		tropicLatitude  0.975609
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.462571
		terraceProb     0.496261
		erosion         0
		montesMagn      0.494138
		montesFreq      2.95577
		montesSpiky     0.998123
		montesFraction  0.28585
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.938718
		hillsFraction   0.510072
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243744
		craterFreq      0.216794
		craterDensity   0.836633
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.553577
		volcanoTemp     1367.09
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.207, 0.212, 0.241, 0.050)
		colorShelf     (0.244, 0.249, 0.277, 0.040)
		colorBeach     (0.281, 0.285, 0.313, 0.030)
		colorDesert    (0.317, 0.322, 0.356, 0.020)
		colorLowland   (0.354, 0.358, 0.392, 0.030)
		colorUpland    (0.390, 0.395, 0.428, 0.050)
		colorRock      (0.427, 0.431, 0.476, 0.020)
		colorSnow      (0.427, 0.431, 0.476, 1.000)
		BumpHeight      16.7944
		BumpOffset      3.35889
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.795783
		GasToDust   0.25
		Particles   2587
		GasBright   0.215165
		DustBright  0.508109
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   49.7421
		Period          256.205
		Eccentricity    0.896434
		Inclination     -98.0855
		AscendingNode   138.009
		ArgOfPericenter -137.434
		MeanAnomaly     -129.642
	}
}

Comet	"Ciutric 150"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            6.88939e-017
	Radius          0.0524123
	InertiaMoment   0.398864

	Oblateness      0.00270798

	RotationPeriod  85.6762
	Obliquity       105.347
	EqAscendNode    205.606
	Precession      0

	AbsMagn         6.98526
	SlopeParam      6.19977
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.713 0.709 0.704)

	Surface
	{
		SurfStyle       0.164681
		OceanStyle      0.093354
		Randomize      (0.884, -0.098, -0.433)
		colorDistMagn   0.0818373
		colorDistFreq   1.79178e-006
		detailScale     1.43121
		colorConversion true
		snowLevel       2
		tropicLatitude  0.93733
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.466084
		terraceProb     0.433883
		erosion         0
		montesMagn      0.670697
		montesFreq      2.96068
		montesSpiky     0.869735
		montesFraction  0.298869
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.60644e-006
		hillsFraction   0.604325
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.266869
		craterFreq      0.221508
		craterDensity   0.977942
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.532299
		volcanoTemp     1640.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.285, 0.283, 0.282, 0.000)
		colorShelf     (0.303, 0.301, 0.299, 0.000)
		colorBeach     (0.321, 0.319, 0.317, 0.000)
		colorDesert    (0.339, 0.337, 0.334, 0.000)
		colorLowland   (0.356, 0.354, 0.352, 0.000)
		colorUpland    (0.374, 0.372, 0.370, 0.000)
		colorRock      (0.392, 0.390, 0.387, 0.000)
		colorSnow      (0.410, 0.407, 0.405, 1.000)
		BumpHeight      0.0471711
		BumpOffset      0.00943422
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.14538
		DustBright  0.262381
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   70.2275
		Period          429.795
		Eccentricity    0.936275
		Inclination     5.93351
		AscendingNode   -31.2839
		ArgOfPericenter -167.32
		MeanAnomaly     1.21197
	}
}

Comet	"Ciutric 151"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            5.32845e-013
	Radius          1.15585
	InertiaMoment   0.397146

	Oblateness      0.0040065

	RotationPeriod  82.6787
	Obliquity       58.5528
	EqAscendNode    190.183
	Precession      0

	AbsMagn         1.85113
	SlopeParam      7.9685
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.689 0.687 0.686)

	Surface
	{
		SurfStyle       0.947785
		OceanStyle      0.86103
		Randomize      (-0.478, 0.445, 0.953)
		colorDistMagn   0.350732
		colorDistFreq   0.000808346
		detailScale     31.5624
		colorConversion true
		snowLevel       2
		tropicLatitude  0.846944
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.58764
		terraceProb     0.263055
		erosion         0
		montesMagn      0.472183
		montesFreq      2.80663
		montesSpiky     0.819044
		montesFraction  0.623569
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0037948
		hillsFraction   0.369505
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.269192
		craterFreq      0.212728
		craterDensity   0.908504
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.569038
		volcanoTemp     1133.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.234, 0.241, 0.274, 0.050)
		colorShelf     (0.276, 0.282, 0.316, 0.040)
		colorBeach     (0.317, 0.323, 0.357, 0.030)
		colorDesert    (0.358, 0.364, 0.405, 0.020)
		colorLowland   (0.400, 0.406, 0.446, 0.030)
		colorUpland    (0.441, 0.447, 0.487, 0.050)
		colorRock      (0.483, 0.488, 0.542, 0.020)
		colorSnow      (0.483, 0.488, 0.542, 1.000)
		BumpHeight      1.04026
		BumpOffset      0.208053
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.347417
		GasToDust   0.25
		Particles   1681
		GasBright   0.370799
		DustBright  0.521449
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   49.2232
		Period          252.206
		Eccentricity    0.911757
		Inclination     -1.11391
		AscendingNode   -52.6231
		ArgOfPericenter -146.272
		MeanAnomaly     -107.106
	}
}

Comet	"Ciutric 152"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            4.12118e-009
	Radius          20.4416
	InertiaMoment   0.399329

	Oblateness      0.00309304

	RotationPeriod  79.9041
	Obliquity       11.7585
	EqAscendNode    174.761
	Precession      0

	AbsMagn         10.2936
	SlopeParam      2.63283
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.710 0.643 0.546)

	Surface
	{
		SurfStyle       0.674827
		OceanStyle      0.791187
		Randomize      (-0.111, -0.214, -0.673)
		colorDistMagn   0.467887
		colorDistFreq   0.312551
		detailScale     558.191
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998184
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.451264
		terraceProb     0.388927
		erosion         0
		montesMagn      0.467301
		montesFreq      3.79553
		montesSpiky     0.899217
		montesFraction  0.396804
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.20645
		hillsFraction   0.793554
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.276353
		craterFreq      0.27708
		craterDensity   0.842607
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.517774
		volcanoTemp     1574.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.277, 0.218, 0.153, 0.000)
		colorShelf     (0.284, 0.225, 0.175, 0.000)
		colorBeach     (0.334, 0.263, 0.207, 0.000)
		colorDesert    (0.362, 0.283, 0.202, 0.000)
		colorLowland   (0.397, 0.302, 0.229, 0.000)
		colorUpland    (0.440, 0.366, 0.278, 0.000)
		colorRock      (0.476, 0.398, 0.300, 0.000)
		colorSnow      (0.518, 0.424, 0.316, 1.000)
		BumpHeight      18.3974
		BumpOffset      3.67948
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.828609
		GasToDust   0.25
		Particles   2653
		GasBright   0.273732
		DustBright  0.303003
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   68.801
		Period          416.766
		Eccentricity    0.97033
		Inclination     95.7336
		AscendingNode   -100.676
		ArgOfPericenter -61.6166
		MeanAnomaly     -13.7316
	}
}

Comet	"Ciutric 153"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            1.26894e-016
	Radius          0.0715947
	InertiaMoment   0.398014

	Oblateness      0.00458799

	RotationPeriod  77.3073
	Obliquity       324.964
	EqAscendNode    159.338
	Precession      0

	AbsMagn         6.76821
	SlopeParam      3.27878
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.498 0.493 0.491)

	Surface
	{
		SurfStyle       0.409779
		OceanStyle      0.295506
		Randomize      (0.304, 0.872, -0.702)
		colorDistMagn   0.209495
		colorDistFreq   2.72443e-006
		detailScale     1.95501
		colorConversion true
		snowLevel       2
		tropicLatitude  0.978503
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.400073
		terraceProb     0.364653
		erosion         0
		montesMagn      0.666722
		montesFreq      2.95907
		montesSpiky     0.820277
		montesFraction  0.468874
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.59637e-005
		hillsFraction   0.564103
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247813
		craterFreq      0.266369
		craterDensity   0.719944
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.506038
		volcanoTemp     1709.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.199, 0.197, 0.196, 0.000)
		colorShelf     (0.212, 0.209, 0.209, 0.000)
		colorBeach     (0.224, 0.222, 0.221, 0.000)
		colorDesert    (0.237, 0.234, 0.233, 0.000)
		colorLowland   (0.249, 0.246, 0.245, 0.000)
		colorUpland    (0.262, 0.259, 0.258, 0.000)
		colorRock      (0.274, 0.271, 0.270, 0.000)
		colorSnow      (0.287, 0.283, 0.282, 1.000)
		BumpHeight      0.0644352
		BumpOffset      0.012887
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.00879498
		DustBright  0.252426
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   34.6834
		Period          149.17
		Eccentricity    0.956248
		Inclination     -80.3838
		AscendingNode   52.6989
		ArgOfPericenter 70.1412
		MeanAnomaly     -71.2595
	}
}

Comet	"Ciutric 154"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            9.81435e-013
	Radius          1.26317
	InertiaMoment   0.399759

	Oblateness      0.00349778

	RotationPeriod  74.8546
	Obliquity       278.17
	EqAscendNode    143.915
	Precession      0

	AbsMagn         1.05735
	SlopeParam      3.85585
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.586 0.515 0.485)

	Surface
	{
		SurfStyle       0.0943348
		OceanStyle      0.821418
		Randomize      (0.649, -0.576, 0.430)
		colorDistMagn   0.600122
		colorDistFreq   0.00137169
		detailScale     34.493
		colorConversion true
		snowLevel       2
		tropicLatitude  0.643138
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.425719
		terraceProb     0.418706
		erosion         0
		montesMagn      0.482681
		montesFreq      3.6267
		montesSpiky     0.886062
		montesFraction  0.441895
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00388773
		hillsFraction   0.503367
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231122
		craterFreq      0.272866
		craterDensity   0.8591
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.410875
		volcanoTemp     1518.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.234, 0.206, 0.194, 0.000)
		colorShelf     (0.249, 0.219, 0.206, 0.000)
		colorBeach     (0.264, 0.232, 0.218, 0.000)
		colorDesert    (0.278, 0.244, 0.230, 0.000)
		colorLowland   (0.293, 0.257, 0.242, 0.000)
		colorUpland    (0.308, 0.270, 0.255, 0.000)
		colorRock      (0.322, 0.283, 0.267, 0.000)
		colorSnow      (0.337, 0.296, 0.279, 1.000)
		BumpHeight      1.13685
		BumpOffset      0.227371
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.380243
		GasToDust   0.25
		Particles   1747
		GasBright   0.0691375
		DustBright  0.67657
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   22.4393
		Period          77.6271
		Eccentricity    0.812208
		Inclination     -45.1173
		AscendingNode   161.591
		ArgOfPericenter 42.852
		MeanAnomaly     31.9446
	}
}

Comet	"Ciutric 155"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            7.5907e-009
	Radius          27.9809
	InertiaMoment   0.398612

	Oblateness      0.0052145

	RotationPeriod  72.5208
	Obliquity       231.376
	EqAscendNode    128.493
	Precession      0

	AbsMagn         10.0518
	SlopeParam      4.42093
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.644 0.641 0.639)

	Surface
	{
		SurfStyle       0.429021
		OceanStyle      0.568286
		Randomize      (-0.722, -0.568, 0.385)
		colorDistMagn   0.753779
		colorDistFreq   0.492036
		detailScale     764.064
		colorConversion true
		snowLevel       2
		tropicLatitude  0.544925
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.617202
		terraceProb     0.362841
		erosion         0
		montesMagn      0.345634
		montesFreq      3.6523
		montesSpiky     0.904058
		montesFraction  0.725586
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.09196
		hillsFraction   0.529808
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.207764
		craterFreq      0.231885
		craterDensity   0.737214
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.467351
		volcanoTemp     1545.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.258, 0.256, 0.255, 0.000)
		colorShelf     (0.274, 0.272, 0.271, 0.000)
		colorBeach     (0.290, 0.288, 0.287, 0.000)
		colorDesert    (0.306, 0.304, 0.303, 0.000)
		colorLowland   (0.322, 0.320, 0.319, 0.000)
		colorUpland    (0.338, 0.336, 0.335, 0.000)
		colorRock      (0.354, 0.353, 0.351, 0.000)
		colorSnow      (0.370, 0.369, 0.367, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.861435
		GasToDust   0.25
		Particles   2720
		GasBright   0.0652859
		DustBright  0.364908
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   43.1021
		Period          206.656
		Eccentricity    0.906172
		Inclination     -34.2154
		AscendingNode   42.8047
		ArgOfPericenter -142.518
		MeanAnomaly     73.3779
	}
}

Comet	"Ciutric 156"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            2.33723e-016
	Radius          0.0780257
	InertiaMoment   0.396391

	Oblateness      0.00387699

	RotationPeriod  70.2857
	Obliquity       184.581
	EqAscendNode    113.07
	Precession      0

	AbsMagn         6.54747
	SlopeParam      5.02257
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.652 0.647 0.643)

	Surface
	{
		SurfStyle       0.862708
		OceanStyle      0.698402
		Randomize      (0.654, -0.489, -0.872)
		colorDistMagn   0.459167
		colorDistFreq   8.3297e-007
		detailScale     2.13062
		colorConversion true
		snowLevel       2
		tropicLatitude  0.613734
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.375856
		terraceProb     0.153581
		erosion         0
		montesMagn      0.492016
		montesFreq      2.82166
		montesSpiky     0.891763
		montesFraction  0.586614
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.87756e-005
		hillsFraction   0.713114
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249951
		craterFreq      0.215251
		craterDensity   0.955027
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.446704
		volcanoTemp     1250.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.222, 0.226, 0.257, 0.050)
		colorShelf     (0.261, 0.265, 0.296, 0.040)
		colorBeach     (0.300, 0.304, 0.334, 0.030)
		colorDesert    (0.339, 0.343, 0.379, 0.020)
		colorLowland   (0.378, 0.381, 0.418, 0.030)
		colorUpland    (0.417, 0.420, 0.457, 0.050)
		colorRock      (0.456, 0.459, 0.508, 0.020)
		colorSnow      (0.456, 0.459, 0.508, 1.000)
		BumpHeight      0.0702231
		BumpOffset      0.0140446
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.192819
		DustBright  0.721862
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   66.7435
		Period          398.211
		Eccentricity    0.934871
		Inclination     146.458
		AscendingNode   159.391
		ArgOfPericenter -173.275
		MeanAnomaly     -119.896
	}
}

Comet	"Ciutric 157"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            1.80768e-012
	Radius          1.73317
	InertiaMoment   0.399105

	Oblateness      0.0059064

	RotationPeriod  68.1335
	Obliquity       137.787
	EqAscendNode    97.6476
	Precession      0

	AbsMagn         -0.173839
	SlopeParam      5.73745
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.468 0.464 0.460)

	Surface
	{
		SurfStyle       0.0515409
		OceanStyle      0.277879
		Randomize      (0.697, -0.409, -0.304)
		colorDistMagn   0.724809
		colorDistFreq   0.00228274
		detailScale     47.3272
		colorConversion true
		snowLevel       2
		tropicLatitude  0.971218
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.489094
		terraceProb     0.140016
		erosion         0
		montesMagn      0.532128
		montesFreq      2.37602
		montesSpiky     0.923975
		montesFraction  0.558884
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00624135
		hillsFraction   0.570237
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256296
		craterFreq      0.206991
		craterDensity   0.752538
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.446424
		volcanoTemp     1476.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.187, 0.186, 0.184, 0.000)
		colorShelf     (0.199, 0.197, 0.195, 0.000)
		colorBeach     (0.210, 0.209, 0.207, 0.000)
		colorDesert    (0.222, 0.220, 0.218, 0.000)
		colorLowland   (0.234, 0.232, 0.230, 0.000)
		colorUpland    (0.246, 0.244, 0.241, 0.000)
		colorRock      (0.257, 0.255, 0.253, 0.000)
		colorSnow      (0.269, 0.267, 0.264, 1.000)
		BumpHeight      1.55986
		BumpOffset      0.311971
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.413069
		GasToDust   0.25
		Particles   1814
		GasBright   0.161685
		DustBright  0.437482
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   51.0242
		Period          266.174
		Eccentricity    0.912739
		Inclination     57.8235
		AscendingNode   -105.945
		ArgOfPericenter -11.9102
		MeanAnomaly     102.65
	}
}

Comet	"Ciutric 158"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            1.39811e-008
	Radius          30.3929
	InertiaMoment   0.397641

	Oblateness      0.00435785

	RotationPeriod  66.0509
	Obliquity       90.9928
	EqAscendNode    82.225
	Precession      0

	AbsMagn         9.81721
	SlopeParam      6.80448
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.573 0.496 0.345)

	Surface
	{
		SurfStyle       0.732685
		OceanStyle      0.292616
		Randomize      (-0.963, 0.477, -0.771)
		colorDistMagn   0.895746
		colorDistFreq   0.241071
		detailScale     829.929
		colorConversion true
		snowLevel       2
		tropicLatitude  0.971979
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.477887
		terraceProb     0.310048
		erosion         0
		montesMagn      0.504746
		montesFreq      2.19641
		montesSpiky     0.94264
		montesFraction  0.418326
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.81839
		hillsFraction   0.435923
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251772
		craterFreq      0.217346
		craterDensity   0.871274
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.424617
		volcanoTemp     1593.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.224, 0.169, 0.097, 0.000)
		colorShelf     (0.229, 0.174, 0.110, 0.000)
		colorBeach     (0.269, 0.203, 0.131, 0.000)
		colorDesert    (0.292, 0.218, 0.128, 0.000)
		colorLowland   (0.321, 0.233, 0.145, 0.000)
		colorUpland    (0.355, 0.283, 0.176, 0.000)
		colorRock      (0.384, 0.308, 0.190, 0.000)
		colorSnow      (0.419, 0.327, 0.200, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.894261
		GasToDust   0.25
		Particles   2786
		GasBright   0.0932923
		DustBright  0.190362
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   59.524
		Period          335.381
		Eccentricity    0.949217
		Inclination     -142.983
		AscendingNode   -114.424
		ArgOfPericenter -43.9076
		MeanAnomaly     -122.769
	}
}

Comet	"Ciutric 159"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            4.30488e-016
	Radius          0.107355
	InertiaMoment   0.399549

	Oblateness      0.00668564

	RotationPeriod  64.0271
	Obliquity       44.1985
	EqAscendNode    66.8024
	Precession      0

	AbsMagn         6.32221
	SlopeParam      2.24649
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.696 0.695 0.693)

	Surface
	{
		SurfStyle       0.840935
		OceanStyle      0.924357
		Randomize      (-0.485, 0.393, -0.962)
		colorDistMagn   0.723718
		colorDistFreq   6.03726e-006
		detailScale     2.93151
		colorConversion true
		snowLevel       2
		tropicLatitude  0.983455
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.688702
		terraceProb     0.203456
		erosion         0
		montesMagn      0.472105
		montesFreq      4.08044
		montesSpiky     0.970962
		montesFraction  0.599567
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.15893e-005
		hillsFraction   0.61158
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243179
		craterFreq      0.197834
		craterDensity   0.866611
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.522255
		volcanoTemp     1118.24
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.271, 0.236, 0.194, 0.000)
		colorShelf     (0.278, 0.243, 0.222, 0.000)
		colorBeach     (0.327, 0.285, 0.263, 0.000)
		colorDesert    (0.355, 0.306, 0.256, 0.000)
		colorLowland   (0.390, 0.326, 0.291, 0.000)
		colorUpland    (0.431, 0.396, 0.353, 0.000)
		colorRock      (0.466, 0.431, 0.381, 0.000)
		colorSnow      (0.508, 0.458, 0.402, 1.000)
		BumpHeight      0.0966198
		BumpOffset      0.019324
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.297993
		DustBright  0.470148
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   67.2249
		Period          402.528
		Eccentricity    0.956763
		Inclination     134.996
		AscendingNode   131.358
		ArgOfPericenter 74.1701
		MeanAnomaly     44.4059
	}
}

Comet	"Ciutric 160"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            3.32952e-012
	Radius          1.87479
	InertiaMoment   0.398335

	Oblateness      0.00487909

	RotationPeriod  62.0528
	Obliquity       357.404
	EqAscendNode    51.3798
	Precession      0

	AbsMagn         17.6606
	SlopeParam      2.9649
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.583 0.580 0.576)

	Surface
	{
		SurfStyle       0.661704
		OceanStyle      0.508582
		Randomize      (0.280, 0.295, -0.769)
		colorDistMagn   0.84385
		colorDistFreq   0.00209762
		detailScale     51.1943
		colorConversion true
		snowLevel       2
		tropicLatitude  0.113706
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.501879
		terraceProb     0.151198
		erosion         0
		montesMagn      0.552921
		montesFreq      3.48404
		montesSpiky     0.929849
		montesFraction  0.627849
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0068544
		hillsFraction   0.735658
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264723
		craterFreq      0.174546
		craterDensity   0.942204
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.451079
		volcanoTemp     1677.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.227, 0.197, 0.161, 0.000)
		colorShelf     (0.233, 0.203, 0.184, 0.000)
		colorBeach     (0.274, 0.238, 0.219, 0.000)
		colorDesert    (0.297, 0.255, 0.213, 0.000)
		colorLowland   (0.326, 0.272, 0.242, 0.000)
		colorUpland    (0.361, 0.330, 0.294, 0.000)
		colorRock      (0.390, 0.359, 0.317, 0.000)
		colorSnow      (0.425, 0.383, 0.334, 1.000)
		BumpHeight      1.68731
		BumpOffset      0.337462
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.445895
		GasToDust   0.25
		Particles   1880
		GasBright   0.202318
		DustBright  0.250309
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   61.1933
		Period          349.588
		Eccentricity    0.947421
		Inclination     7.92267
		AscendingNode   49.24
		ArgOfPericenter 136.951
		MeanAnomaly     162.322
	}
}

Comet	"Ciutric 161"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            2.57514e-008
	Radius          41.9572
	InertiaMoment   0.399972

	Oblateness      0.00757933

	RotationPeriod  60.1199
	Obliquity       310.61
	EqAscendNode    35.9572
	Precession      0

	AbsMagn         9.58876
	SlopeParam      3.56784
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.718 0.714 0.712)

	Surface
	{
		SurfStyle       0.874955
		OceanStyle      0.489068
		Randomize      (-0.855, -0.797, -0.360)
		colorDistMagn   0.418144
		colorDistFreq   1.17151
		detailScale     1145.71
		colorConversion true
		snowLevel       2
		tropicLatitude  0.651721
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.269286
		terraceProb     0.273613
		erosion         0
		montesMagn      0.553097
		montesFreq      3.2952
		montesSpiky     0.708153
		montesFraction  0.767175
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.66012
		hillsFraction   0.454917
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223532
		craterFreq      0.227387
		craterDensity   0.799849
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.531248
		volcanoTemp     1866.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.244, 0.250, 0.285, 0.050)
		colorShelf     (0.287, 0.293, 0.328, 0.040)
		colorBeach     (0.330, 0.335, 0.370, 0.030)
		colorDesert    (0.373, 0.378, 0.420, 0.020)
		colorLowland   (0.416, 0.421, 0.463, 0.030)
		colorUpland    (0.459, 0.464, 0.506, 0.050)
		colorRock      (0.502, 0.507, 0.562, 0.020)
		colorSnow      (0.502, 0.507, 0.562, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.927087
		GasToDust   0.25
		Particles   2852
		GasBright   0.0056515
		DustBright  0.931462
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   60.6951
		Period          345.327
		Eccentricity    0.935193
		Inclination     37.9727
		AscendingNode   -58.3144
		ArgOfPericenter -36.503
		MeanAnomaly     -37.362
	}
}

Comet	"Ciutric 162"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            7.92906e-016
	Radius          0.115491
	InertiaMoment   0.39887

	Oblateness      0.00545144

	RotationPeriod  58.2213
	Obliquity       263.816
	EqAscendNode    20.5346
	Precession      0

	AbsMagn         6.0915
	SlopeParam      4.13315
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.565 0.560 0.557)

	Surface
	{
		SurfStyle       0.0674622
		OceanStyle      0.813153
		Randomize      (-0.069, 0.587, -0.653)
		colorDistMagn   0.587547
		colorDistFreq   1.18708e-005
		detailScale     3.15366
		colorConversion true
		snowLevel       2
		tropicLatitude  0.423241
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.297944
		terraceProb     0.289069
		erosion         0
		montesMagn      0.663435
		montesFreq      3.49622
		montesSpiky     0.965192
		montesFraction  0.646875
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.68384e-005
		hillsFraction   0.462732
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246541
		craterFreq      0.225363
		craterDensity   0.873782
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.44423
		volcanoTemp     1545.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.226, 0.224, 0.223, 0.000)
		colorShelf     (0.240, 0.238, 0.237, 0.000)
		colorBeach     (0.254, 0.252, 0.251, 0.000)
		colorDesert    (0.268, 0.266, 0.264, 0.000)
		colorLowland   (0.282, 0.280, 0.278, 0.000)
		colorUpland    (0.296, 0.294, 0.292, 0.000)
		colorRock      (0.311, 0.308, 0.306, 0.000)
		colorSnow      (0.325, 0.322, 0.320, 1.000)
		BumpHeight      0.103942
		BumpOffset      0.0207883
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0404513
		DustBright  0.581149
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   56.6657
		Period          311.516
		Eccentricity    0.961174
		Inclination     89.1736
		AscendingNode   155.485
		ArgOfPericenter 72.1529
		MeanAnomaly     147.278
	}
}

Comet	"Ciutric 163"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            6.13256e-012
	Radius          2.5989
	InertiaMoment   0.397161

	Oblateness      0.00851921

	RotationPeriod  56.3507
	Obliquity       217.021
	EqAscendNode    5.11202
	Precession      0

	AbsMagn         15.6027
	SlopeParam      4.70953
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.562 0.433 0.348)

	Surface
	{
		SurfStyle       0.803885
		OceanStyle      0.0909655
		Randomize      (-0.554, 0.780, -0.741)
		colorDistMagn   0.878459
		colorDistFreq   0.0045897
		detailScale     70.9673
		colorConversion true
		snowLevel       2
		tropicLatitude  0.777871
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.505371
		terraceProb     0.294542
		erosion         0
		montesMagn      0.441697
		montesFreq      2.43986
		montesSpiky     0.786975
		montesFraction  0.512408
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0139657
		hillsFraction   0.758014
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260154
		craterFreq      0.161342
		craterDensity   0.633398
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.482576
		volcanoTemp     1206.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.219, 0.147, 0.097, 0.000)
		colorShelf     (0.225, 0.151, 0.111, 0.000)
		colorBeach     (0.264, 0.177, 0.132, 0.000)
		colorDesert    (0.287, 0.190, 0.129, 0.000)
		colorLowland   (0.315, 0.203, 0.146, 0.000)
		colorUpland    (0.348, 0.247, 0.177, 0.000)
		colorRock      (0.376, 0.268, 0.191, 0.000)
		colorSnow      (0.410, 0.286, 0.202, 1.000)
		BumpHeight      2.33901
		BumpOffset      0.467802
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.478721
		GasToDust   0.25
		Particles   1946
		GasBright   0.0379919
		DustBright  0.268095
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   52.9442
		Period          281.338
		Eccentricity    0.931401
		Inclination     -46.0873
		AscendingNode   80.0866
		ArgOfPericenter 77.6165
		MeanAnomaly     34.1255
	}
}

Comet	"Ciutric 164"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            4.7431e-008
	Radius          44.7666
	InertiaMoment   0.399334

	Oblateness      0.00606706

	RotationPeriod  54.5025
	Obliquity       170.227
	EqAscendNode    349.689
	Precession      0

	AbsMagn         9.36538
	SlopeParam      5.35335
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.551 0.545 0.540)

	Surface
	{
		SurfStyle       0.611746
		OceanStyle      0.936053
		Randomize      (-0.632, -0.269, 0.610)
		colorDistMagn   0.962455
		colorDistFreq   1.47798
		detailScale     1222.43
		colorConversion true
		snowLevel       2
		tropicLatitude  0.784546
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.406307
		terraceProb     0.137103
		erosion         0
		montesMagn      0.496412
		montesFreq      3.02161
		montesSpiky     0.978035
		montesFraction  0.418624
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.96294
		hillsFraction   0.74113
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234075
		craterFreq      0.229608
		craterDensity   0.945112
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.608288
		volcanoTemp     1357.09
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.215, 0.185, 0.151, 0.000)
		colorShelf     (0.220, 0.191, 0.173, 0.000)
		colorBeach     (0.259, 0.224, 0.205, 0.000)
		colorDesert    (0.281, 0.240, 0.200, 0.000)
		colorLowland   (0.308, 0.256, 0.227, 0.000)
		colorUpland    (0.341, 0.311, 0.275, 0.000)
		colorRock      (0.369, 0.338, 0.297, 0.000)
		colorSnow      (0.402, 0.360, 0.313, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.959913
		GasToDust   0.25
		Particles   2919
		GasBright   0.144807
		DustBright  0.645767
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   69.4198
		Period          422.401
		Eccentricity    0.955766
		Inclination     -124.268
		AscendingNode   -62.3127
		ArgOfPericenter 80.8637
		MeanAnomaly     89.7914
	}
}

Comet	"Ciutric 165"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            1.46044e-015
	Radius          0.16098
	InertiaMoment   0.398022

	Oblateness      0.00976261

	RotationPeriod  52.6712
	Obliquity       123.433
	EqAscendNode    334.267
	Precession      0

	AbsMagn         5.85425
	SlopeParam      6.1857
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.549 0.546 0.544)

	Surface
	{
		SurfStyle       0.593378
		OceanStyle      0.251899
		Randomize      (-0.688, 0.916, 0.172)
		colorDistMagn   0.990048
		colorDistFreq   1.77996e-005
		detailScale     4.39584
		colorConversion true
		snowLevel       2
		tropicLatitude  0.74087
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.381871
		terraceProb     0.205428
		erosion         0
		montesMagn      0.366042
		montesFreq      2.29928
		montesSpiky     0.880403
		montesFraction  0.310906
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.79767e-005
		hillsFraction   0.689696
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222578
		craterFreq      0.194615
		craterDensity   0.887763
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52794
		volcanoTemp     1618.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.214, 0.186, 0.152, 0.000)
		colorShelf     (0.220, 0.191, 0.174, 0.000)
		colorBeach     (0.258, 0.224, 0.207, 0.000)
		colorDesert    (0.280, 0.240, 0.201, 0.000)
		colorLowland   (0.308, 0.257, 0.229, 0.000)
		colorUpland    (0.341, 0.311, 0.278, 0.000)
		colorRock      (0.368, 0.339, 0.299, 0.000)
		colorSnow      (0.401, 0.361, 0.316, 1.000)
		BumpHeight      0.144882
		BumpOffset      0.0289765
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0303547
		GasToDust   0.25
		Particles   1041
		GasBright   0.115065
		DustBright  0.359995
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   68.7281
		Period          416.104
		Eccentricity    0.952884
		Inclination     -15.9611
		AscendingNode   128.206
		ArgOfPericenter -27.4501
		MeanAnomaly     -162.426
	}
}

Comet	"Ciutric 166"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            1.12954e-011
	Radius          2.72347
	InertiaMoment   0.399764

	Oblateness      0.00660028

	RotationPeriod  50.852
	Obliquity       76.6384
	EqAscendNode    318.844
	Precession      0

	AbsMagn         14.5996
	SlopeParam      7.9147
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.787 0.785 0.784)

	Surface
	{
		SurfStyle       0.0800394
		OceanStyle      0.807737
		Randomize      (-0.844, 0.540, -0.853)
		colorDistMagn   0.647096
		colorDistFreq   0.00381893
		detailScale     74.3688
		colorConversion true
		snowLevel       2
		tropicLatitude  0.173094
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.329362
		terraceProb     0.102395
		erosion         0
		montesMagn      0.475791
		montesFreq      3.97718
		montesSpiky     0.885748
		montesFraction  0.350757
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.022233
		hillsFraction   0.602057
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.292887
		craterFreq      0.257837
		craterDensity   1.07897
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.503886
		volcanoTemp     1661.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.315, 0.314, 0.314, 0.000)
		colorShelf     (0.334, 0.334, 0.333, 0.000)
		colorBeach     (0.354, 0.353, 0.353, 0.000)
		colorDesert    (0.374, 0.373, 0.372, 0.000)
		colorLowland   (0.393, 0.393, 0.392, 0.000)
		colorUpland    (0.413, 0.412, 0.412, 0.000)
		colorRock      (0.433, 0.432, 0.431, 0.000)
		colorSnow      (0.452, 0.452, 0.451, 1.000)
		BumpHeight      2.45112
		BumpOffset      0.490224
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.511547
		GasToDust   0.25
		Particles   2013
		GasBright   0.28907
		DustBright  0.670476
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   56.4614
		Period          309.833
		Eccentricity    0.922194
		Inclination     -93.6476
		AscendingNode   -177.737
		ArgOfPericenter -59.4883
		MeanAnomaly     78.74
	}
}

Comet	"Ciutric 167"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            8.73618e-008
	Radius          62.9155
	InertiaMoment   0.398619

	Oblateness      0.0112641

	RotationPeriod  49.04
	Obliquity       29.8441
	EqAscendNode    303.422
	Precession      0

	AbsMagn         9.14618
	SlopeParam      2.62306
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.534 0.415 0.351)

	Surface
	{
		SurfStyle       0.0988501
		OceanStyle      0.620599
		Randomize      (0.467, 0.843, -0.525)
		colorDistMagn   0.300805
		colorDistFreq   2.27258
		detailScale     1718.01
		colorConversion true
		snowLevel       2
		tropicLatitude  0.898862
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.678118
		terraceProb     0.216157
		erosion         0
		montesMagn      0.522323
		montesFreq      2.54934
		montesSpiky     0.948605
		montesFraction  0.236708
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.20255
		hillsFraction   0.624277
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.180688
		craterFreq      0.24923
		craterDensity   0.752688
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.513907
		volcanoTemp     1402.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.214, 0.166, 0.141, 0.000)
		colorShelf     (0.227, 0.177, 0.149, 0.000)
		colorBeach     (0.240, 0.187, 0.158, 0.000)
		colorDesert    (0.254, 0.197, 0.167, 0.000)
		colorLowland   (0.267, 0.208, 0.176, 0.000)
		colorUpland    (0.280, 0.218, 0.185, 0.000)
		colorRock      (0.294, 0.228, 0.193, 0.000)
		colorSnow      (0.307, 0.239, 0.202, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.992739
		GasToDust   0.25
		Particles   2985
		GasBright   0.232047
		DustBright  0.411987
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   63.6125
		Period          370.523
		Eccentricity    0.985916
		Inclination     -86.2823
		AscendingNode   -174.704
		ArgOfPericenter 161.996
		MeanAnomaly     95.2546
	}
}

Comet	"Ciutric 168"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            2.68993e-015
	Radius          0.25389
	InertiaMoment   0.396418

	Oblateness      0.0257047

	RotationPeriod  47.2306
	Obliquity       343.05
	EqAscendNode    287.999
	Precession      0

	AbsMagn         5.6092
	SlopeParam      3.27053
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.608 0.601 0.597)

	Surface
	{
		SurfStyle       0.398052
		OceanStyle      0.456863
		Randomize      (-0.472, 0.559, -0.659)
		colorDistMagn   0.301186
		colorDistFreq   3.63284e-005
		detailScale     6.9329
		colorConversion true
		snowLevel       2
		tropicLatitude  0.268704
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.393372
		terraceProb     0.198087
		erosion         0
		montesMagn      0.676782
		montesFreq      2.91514
		montesSpiky     0.971478
		montesFraction  0.52535
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000173785
		hillsFraction   0.648007
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240782
		craterFreq      0.241067
		craterDensity   0.927002
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.465967
		volcanoTemp     1651.82
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.243, 0.240, 0.239, 0.000)
		colorShelf     (0.259, 0.256, 0.254, 0.000)
		colorBeach     (0.274, 0.271, 0.269, 0.000)
		colorDesert    (0.289, 0.286, 0.284, 0.000)
		colorLowland   (0.304, 0.301, 0.299, 0.000)
		colorUpland    (0.319, 0.316, 0.313, 0.000)
		colorRock      (0.335, 0.331, 0.328, 0.000)
		colorSnow      (0.350, 0.346, 0.343, 1.000)
		BumpHeight      0.228501
		BumpOffset      0.0457002
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0631804
		GasToDust   0.25
		Particles   1107
		GasBright   0.137764
		DustBright  0.190756
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   55.9199
		Period          305.387
		Eccentricity    0.950108
		Inclination     4.90733
		AscendingNode   65.9322
		ArgOfPericenter -88.7572
		MeanAnomaly     32.0756
	}
}

Comet	"Ciutric 169"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            2.08047e-011
	Radius          3.89711
	InertiaMoment   0.399111

	Oblateness      0.0131291

	RotationPeriod  45.4193
	Obliquity       296.255
	EqAscendNode    272.576
	Precession      0

	AbsMagn         13.8946
	SlopeParam      3.84811
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.763 0.762 0.760)

	Surface
	{
		SurfStyle       0.30701
		OceanStyle      0.455286
		Randomize      (-0.694, 0.760, 0.424)
		colorDistMagn   0.366427
		colorDistFreq   0.00497475
		detailScale     106.417
		colorConversion true
		snowLevel       2
		tropicLatitude  0.662924
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.705915
		terraceProb     0.299522
		erosion         0
		montesMagn      0.538231
		montesFreq      3.18671
		montesSpiky     0.990915
		montesFraction  0.450739
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0334558
		hillsFraction   0.352443
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245502
		craterFreq      0.156017
		craterDensity   0.781081
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.481225
		volcanoTemp     1525.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.305, 0.305, 0.304, 0.000)
		colorShelf     (0.324, 0.324, 0.323, 0.000)
		colorBeach     (0.344, 0.343, 0.342, 0.000)
		colorDesert    (0.363, 0.362, 0.361, 0.000)
		colorLowland   (0.382, 0.381, 0.380, 0.000)
		colorUpland    (0.401, 0.400, 0.399, 0.000)
		colorRock      (0.420, 0.419, 0.418, 0.000)
		colorSnow      (0.439, 0.438, 0.437, 1.000)
		BumpHeight      3.5074
		BumpOffset      0.701479
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.544372
		GasToDust   0.25
		Particles   2079
		GasBright   0.388936
		DustBright  0.42407
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   53.2115
		Period          283.472
		Eccentricity    0.949145
		Inclination     -94.9635
		AscendingNode   151.738
		ArgOfPericenter 3.03716
		MeanAnomaly     27.1479
	}
}

Comet	"Ciutric 170"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            1.60909e-007
	Radius          96.0198
	InertiaMoment   0.397651

	Oblateness      0.0274012

	RotationPeriod  43.6014
	Obliquity       249.461
	EqAscendNode    257.154
	Precession      0

	AbsMagn         8.93037
	SlopeParam      4.41305
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.596 0.593 0.590)

	Surface
	{
		SurfStyle       0.682746
		OceanStyle      0.223449
		Randomize      (0.281, 0.551, -0.977)
		colorDistMagn   0.351737
		colorDistFreq   3.40248
		detailScale     2621.98
		colorConversion true
		snowLevel       2
		tropicLatitude  0.806573
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.499577
		terraceProb     0.331435
		erosion         0
		montesMagn      0.455163
		montesFreq      2.63322
		montesSpiky     0.886576
		montesFraction  0.665104
		dunesFraction   0
		hillsMagn       0
		hillsFreq       25.1703
		hillsFraction   0.580698
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23975
		craterFreq      0.302523
		craterDensity   0.818913
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.524325
		volcanoTemp     1724.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.232, 0.202, 0.165, 0.000)
		colorShelf     (0.238, 0.208, 0.189, 0.000)
		colorBeach     (0.280, 0.243, 0.224, 0.000)
		colorDesert    (0.304, 0.261, 0.218, 0.000)
		colorLowland   (0.334, 0.279, 0.248, 0.000)
		colorUpland    (0.370, 0.338, 0.301, 0.000)
		colorRock      (0.399, 0.368, 0.324, 0.000)
		colorSnow      (0.435, 0.392, 0.342, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0186252
		DustBright  0.478868
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   54.1546
		Period          291.041
		Eccentricity    0.951151
		Inclination     164.218
		AscendingNode   5.48756
		ArgOfPericenter -17.1267
		MeanAnomaly     -12.7843
	}
}

Comet	"Ciutric 171"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            4.95452e-015
	Radius          0.241395
	InertiaMoment   0.399555

	Oblateness      0.0155159

	RotationPeriod  41.7723
	Obliquity       202.667
	EqAscendNode    241.731
	Precession      0

	AbsMagn         5.35482
	SlopeParam      5.01379
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.587 0.504 0.455)

	Surface
	{
		SurfStyle       0.995123
		OceanStyle      0.560331
		Randomize      (-0.476, 0.383, 0.055)
		colorDistMagn   0.166204
		colorDistFreq   3.51252e-005
		detailScale     6.59169
		colorConversion true
		snowLevel       2
		tropicLatitude  0.934444
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.737137
		terraceProb     0.284223
		erosion         0
		montesMagn      0.359084
		montesFreq      3.01741
		montesSpiky     0.98033
		montesFraction  0.600742
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000139051
		hillsFraction   0.563556
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258705
		craterFreq      0.266644
		craterDensity   0.835308
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.483472
		volcanoTemp     1591.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.200, 0.177, 0.182, 0.050)
		colorShelf     (0.235, 0.207, 0.209, 0.040)
		colorBeach     (0.270, 0.237, 0.236, 0.030)
		colorDesert    (0.305, 0.267, 0.268, 0.020)
		colorLowland   (0.341, 0.298, 0.296, 0.030)
		colorUpland    (0.376, 0.328, 0.323, 0.050)
		colorRock      (0.411, 0.358, 0.359, 0.020)
		colorSnow      (0.411, 0.358, 0.359, 1.000)
		BumpHeight      0.217255
		BumpOffset      0.0434511
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0960064
		GasToDust   0.25
		Particles   1173
		GasBright   0.0947446
		DustBright  0.887235
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   56.9364
		Period          313.751
		Eccentricity    0.957047
		Inclination     -48.1179
		AscendingNode   -154.948
		ArgOfPericenter -75.6629
		MeanAnomaly     37.5814
	}
}

Comet	"Ciutric 172"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            3.83197e-011
	Radius          5.83852
	InertiaMoment   0.398343

	Oblateness      0.0309281

	RotationPeriod  39.9269
	Obliquity       155.873
	EqAscendNode    226.309
	Precession      0

	AbsMagn         13.3361
	SlopeParam      5.72622
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.487 0.441 0.398)

	Surface
	{
		SurfStyle       0.277206
		OceanStyle      0.816655
		Randomize      (-0.056, 0.146, 0.230)
		colorDistMagn   0.280054
		colorDistFreq   0.026136
		detailScale     159.431
		colorConversion true
		snowLevel       2
		tropicLatitude  0.353825
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.608182
		terraceProb     0.215159
		erosion         0
		montesMagn      0.517995
		montesFreq      3.38701
		montesSpiky     0.928746
		montesFraction  0.500985
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0576845
		hillsFraction   0.582761
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226378
		craterFreq      0.207331
		craterDensity   0.857592
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.470068
		volcanoTemp     1556.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.195, 0.176, 0.159, 0.000)
		colorShelf     (0.207, 0.187, 0.169, 0.000)
		colorBeach     (0.219, 0.198, 0.179, 0.000)
		colorDesert    (0.231, 0.210, 0.189, 0.000)
		colorLowland   (0.244, 0.221, 0.199, 0.000)
		colorUpland    (0.256, 0.232, 0.209, 0.000)
		colorRock      (0.268, 0.243, 0.219, 0.000)
		colorSnow      (0.280, 0.254, 0.229, 1.000)
		BumpHeight      5.25467
		BumpOffset      1.05093
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.577198
		GasToDust   0.25
		Particles   2145
		GasBright   0.103654
		DustBright  0.562811
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   56.972
		Period          314.046
		Eccentricity    0.922286
		Inclination     -167.618
		AscendingNode   -59.9431
		ArgOfPericenter -135.657
		MeanAnomaly     -36.0664
	}
}

Comet	"Ciutric 173"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            2.96375e-007
	Radius          94.344
	InertiaMoment   0.399977

	Oblateness      0.0186819

	RotationPeriod  38.06
	Obliquity       109.078
	EqAscendNode    210.886
	Precession      0

	AbsMagn         8.71724
	SlopeParam      6.784
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.797 0.795 0.793)

	Surface
	{
		SurfStyle       0.262725
		OceanStyle      0.0257312
		Randomize      (0.396, -0.682, -0.265)
		colorDistMagn   0.928383
		colorDistFreq   4.85585
		detailScale     2576.22
		colorConversion true
		snowLevel       2
		tropicLatitude  0.765038
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.474315
		terraceProb     0.24504
		erosion         0
		montesMagn      0.347502
		montesFreq      3.11818
		montesSpiky     0.981939
		montesFraction  0.731714
		dunesFraction   0
		hillsMagn       0
		hillsFreq       23.2859
		hillsFraction   0.950254
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.281919
		craterFreq      0.34172
		craterDensity   0.804783
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.412095
		volcanoTemp     1243.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.319, 0.318, 0.317, 0.000)
		colorShelf     (0.339, 0.338, 0.337, 0.000)
		colorBeach     (0.359, 0.358, 0.357, 0.000)
		colorDesert    (0.378, 0.378, 0.377, 0.000)
		colorLowland   (0.398, 0.397, 0.397, 0.000)
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

	CometTail
	{
		MaxLength   1
		GasToDust   0.25
		Particles   3000
		GasBright   0.0753052
		DustBright  0.275647
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   41.4299
		Period          194.747
		Eccentricity    0.929106
		Inclination     -102.481
		AscendingNode   -51.5851
		ArgOfPericenter 76.8491
		MeanAnomaly     14.3716
	}
}

Comet	"Ciutric 174"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            9.12563e-015
	Radius          0.35703
	InertiaMoment   0.398877

	Oblateness      0.0362675

	RotationPeriod  36.166
	Obliquity       62.284
	EqAscendNode    195.464
	Precession      0

	AbsMagn         5.08926
	SlopeParam      2.23513
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.676 0.671 0.668)

	Surface
	{
		SurfStyle       0.278257
		OceanStyle      0.520525
		Randomize      (-0.429, 0.274, -0.450)
		colorDistMagn   0.450926
		colorDistFreq   3.2174e-005
		detailScale     9.7493
		colorConversion true
		snowLevel       2
		tropicLatitude  0.965343
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.578073
		terraceProb     0.253717
		erosion         0
		montesMagn      0.493363
		montesFreq      2.69822
		montesSpiky     0.889259
		montesFraction  0.520001
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000323667
		hillsFraction   0.603492
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248589
		craterFreq      0.197668
		craterDensity   1.01199
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.521481
		volcanoTemp     1164.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.270, 0.268, 0.267, 0.000)
		colorShelf     (0.287, 0.285, 0.284, 0.000)
		colorBeach     (0.304, 0.302, 0.301, 0.000)
		colorDesert    (0.321, 0.319, 0.317, 0.000)
		colorLowland   (0.338, 0.336, 0.334, 0.000)
		colorUpland    (0.355, 0.352, 0.351, 0.000)
		colorRock      (0.372, 0.369, 0.367, 0.000)
		colorSnow      (0.389, 0.386, 0.384, 1.000)
		BumpHeight      0.321327
		BumpOffset      0.0642654
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.128832
		GasToDust   0.25
		Particles   1240
		GasBright   0.228592
		DustBright  0.606847
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   44.7799
		Period          218.839
		Eccentricity    0.921169
		Inclination     -78.4
		AscendingNode   -114.129
		ArgOfPericenter 75.6692
		MeanAnomaly     119.749
	}
}

Comet	"Ciutric 175"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            7.05799e-011
	Radius          5.84387
	InertiaMoment   0.397175

	Oblateness      0.0227973

	RotationPeriod  34.2386
	Obliquity       15.4897
	EqAscendNode    180.041
	Precession      0

	AbsMagn         12.8658
	SlopeParam      2.95607
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.713 0.710 0.705)

	Surface
	{
		SurfStyle       0.946173
		OceanStyle      0.841778
		Randomize      (-0.348, -0.350, 0.232)
		colorDistMagn   0.856611
		colorDistFreq   0.0198901
		detailScale     159.577
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0547975
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.518591
		terraceProb     0.239746
		erosion         0
		montesMagn      0.565258
		montesFreq      3.05062
		montesSpiky     0.960814
		montesFraction  0.730758
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0892792
		hillsFraction   0.414122
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.184305
		craterFreq      0.227971
		craterDensity   1.03758
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49702
		volcanoTemp     1245.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.242, 0.248, 0.282, 0.050)
		colorShelf     (0.285, 0.291, 0.325, 0.040)
		colorBeach     (0.328, 0.334, 0.367, 0.030)
		colorDesert    (0.371, 0.376, 0.416, 0.020)
		colorLowland   (0.414, 0.419, 0.459, 0.030)
		colorUpland    (0.456, 0.461, 0.501, 0.050)
		colorRock      (0.499, 0.504, 0.557, 0.020)
		colorSnow      (0.499, 0.504, 0.557, 1.000)
		BumpHeight      5.25948
		BumpOffset      1.0519
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.610024
		GasToDust   0.25
		Particles   2212
		GasBright   0.172961
		DustBright  0.346965
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   51.2828
		Period          268.2
		Eccentricity    0.958123
		Inclination     14.6663
		AscendingNode   -168.324
		ArgOfPericenter 87.0168
		MeanAnomaly     80.4644
	}
}

Comet	"Ciutric 176"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            5.45886e-007
	Radius          138.175
	InertiaMoment   0.39934

	Oblateness      0.0442168

	RotationPeriod  32.271
	Obliquity       328.695
	EqAscendNode    164.618
	Precession      0

	AbsMagn         8.50612
	SlopeParam      3.55994
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.746 0.743 0.742)

	Surface
	{
		SurfStyle       0.945633
		OceanStyle      0.789519
		Randomize      (-0.850, 0.830, 0.735)
		colorDistMagn   0.778682
		colorDistFreq   3.41254
		detailScale     3773.11
		colorConversion true
		snowLevel       2
		tropicLatitude  0.47231
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.706362
		terraceProb     0.194283
		erosion         0
		montesMagn      0.639552
		montesFreq      3.38028
		montesSpiky     0.978475
		montesFraction  0.442071
		dunesFraction   0
		hillsMagn       0
		hillsFreq       41.0301
		hillsFraction   0.773565
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246093
		craterFreq      0.581799
		craterDensity   0.923195
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.454998
		volcanoTemp     1545.24
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.254, 0.260, 0.297, 0.050)
		colorShelf     (0.298, 0.305, 0.341, 0.040)
		colorBeach     (0.343, 0.349, 0.386, 0.030)
		colorDesert    (0.388, 0.394, 0.438, 0.020)
		colorLowland   (0.433, 0.439, 0.483, 0.030)
		colorUpland    (0.477, 0.483, 0.527, 0.050)
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

	CometTail
	{
		MaxLength   1
		GasToDust   0.25
		Particles   3000
		GasBright   0.0800702
		DustBright  0.124342
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   41.954
		Period          198.455
		Eccentricity    0.896481
		Inclination     -20.495
		AscendingNode   -116.474
		ArgOfPericenter -177.603
		MeanAnomaly     117.819
	}
}

Comet	"Ciutric 177"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            1.68082e-014
	Radius          0.361982
	InertiaMoment   0.398031

	Oblateness      0.0292302

	RotationPeriod  30.2551
	Obliquity       281.901
	EqAscendNode    149.196
	Precession      0

	AbsMagn         4.8102
	SlopeParam      4.12542
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.611 0.607 0.603)

	Surface
	{
		SurfStyle       0.896118
		OceanStyle      0.567764
		Randomize      (0.407, -0.688, 0.975)
		colorDistMagn   0.90478
		colorDistFreq   0.000102516
		detailScale     9.88453
		colorConversion true
		snowLevel       2
		tropicLatitude  0.917858
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.311313
		terraceProb     0.288368
		erosion         0
		montesMagn      0.30958
		montesFreq      2.60929
		montesSpiky     0.98978
		montesFraction  0.772149
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000314181
		hillsFraction   0.446159
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2551
		craterFreq      0.150647
		craterDensity   0.998863
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.475327
		volcanoTemp     1733.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.208, 0.212, 0.241, 0.050)
		colorShelf     (0.244, 0.249, 0.277, 0.040)
		colorBeach     (0.281, 0.285, 0.313, 0.030)
		colorDesert    (0.318, 0.322, 0.356, 0.020)
		colorLowland   (0.354, 0.358, 0.392, 0.030)
		colorUpland    (0.391, 0.395, 0.428, 0.050)
		colorRock      (0.428, 0.431, 0.476, 0.020)
		colorSnow      (0.428, 0.431, 0.476, 1.000)
		BumpHeight      0.325784
		BumpOffset      0.0651568
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.161658
		GasToDust   0.25
		Particles   1306
		GasBright   0.310524
		DustBright  0.378374
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   62.4128
		Period          360.09
		Eccentricity    0.952074
		Inclination     -11.9218
		AscendingNode   164.874
		ArgOfPericenter -87.5224
		MeanAnomaly     -161.924
	}
}

Comet	"Ciutric 178"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            1.29999e-010
	Radius          8.49152
	InertiaMoment   0.39977

	Oblateness      0.0565967

	RotationPeriod  28.182
	Obliquity       235.107
	EqAscendNode    133.773
	Precession      0

	AbsMagn         12.4546
	SlopeParam      4.70132
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.656 0.490 0.387)

	Surface
	{
		SurfStyle       0.894175
		OceanStyle      0.640685
		Randomize      (0.355, 0.333, 0.260)
		colorDistMagn   0.62376
		colorDistFreq   0.018914
		detailScale     231.875
		colorConversion true
		snowLevel       2
		tropicLatitude  0.991502
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.623513
		terraceProb     0.171484
		erosion         0
		montesMagn      0.63329
		montesFreq      3.30001
		montesSpiky     0.860651
		montesFraction  0.301266
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.227698
		hillsFraction   0.630765
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245528
		craterFreq      0.269663
		craterDensity   0.79769
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.497388
		volcanoTemp     1351.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.223, 0.171, 0.155, 0.050)
		colorShelf     (0.262, 0.201, 0.178, 0.040)
		colorBeach     (0.302, 0.230, 0.201, 0.030)
		colorDesert    (0.341, 0.260, 0.228, 0.020)
		colorLowland   (0.381, 0.289, 0.251, 0.030)
		colorUpland    (0.420, 0.318, 0.275, 0.050)
		colorRock      (0.459, 0.348, 0.306, 0.020)
		colorSnow      (0.459, 0.348, 0.306, 1.000)
		BumpHeight      7.64237
		BumpOffset      1.52847
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.64285
		GasToDust   0.25
		Particles   2278
		GasBright   0.00365921
		DustBright  0.369726
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   76.0511
		Period          484.349
		Eccentricity    0.949262
		Inclination     -117.01
		AscendingNode   57.7556
		ArgOfPericenter -67.4429
		MeanAnomaly     -132.67
	}
}

Comet	"Ciutric 179"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            4.00278e-018
	Radius          0.022422
	InertiaMoment   0.398625

	Oblateness      0.0394645

	RotationPeriod  26.041
	Obliquity       188.313
	EqAscendNode    118.351
	Precession      0

	AbsMagn         8.29641
	SlopeParam      5.34366
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.579 0.475 0.339)

	Surface
	{
		SurfStyle       0.5443
		OceanStyle      0.535307
		Randomize      (0.332, 0.936, 0.985)
		colorDistMagn   0.768756
		colorDistFreq   1.16802e-007
		detailScale     0.612271
		colorConversion true
		snowLevel       2
		tropicLatitude  0.970755
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.412668
		terraceProb     0.242232
		erosion         0
		montesMagn      0.50207
		montesFreq      3.46029
		montesSpiky     0.900253
		montesFraction  0.440589
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.25469e-006
		hillsFraction   0.717846
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221152
		craterFreq      0.204716
		craterDensity   0.898155
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.532805
		volcanoTemp     1399.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.226, 0.162, 0.095, 0.000)
		colorShelf     (0.232, 0.166, 0.109, 0.000)
		colorBeach     (0.272, 0.195, 0.129, 0.000)
		colorDesert    (0.295, 0.209, 0.125, 0.000)
		colorLowland   (0.324, 0.223, 0.142, 0.000)
		colorUpland    (0.359, 0.271, 0.173, 0.000)
		colorRock      (0.388, 0.295, 0.186, 0.000)
		colorSnow      (0.423, 0.314, 0.197, 1.000)
		BumpHeight      0.0201798
		BumpOffset      0.00403597
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0590605
		DustBright  0.798811
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   71.64
		Period          442.827
		Eccentricity    0.957491
		Inclination     -100.38
		AscendingNode   -115.751
		ArgOfPericenter 0.265794
		MeanAnomaly     65.3325
	}
}

Comet	"Ciutric 180"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            3.09587e-014
	Radius          0.522526
	InertiaMoment   0.396443

	Oblateness      0.0765581

	RotationPeriod  23.8192
	Obliquity       141.518
	EqAscendNode    102.928
	Precession      0

	AbsMagn         4.51467
	SlopeParam      6.17173
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.675 0.641 0.602)

	Surface
	{
		SurfStyle       0.928571
		OceanStyle      0.203444
		Randomize      (-0.432, -0.956, -0.019)
		colorDistMagn   0.0407543
		colorDistFreq   0.000170423
		detailScale     14.2685
		colorConversion true
		snowLevel       2
		tropicLatitude  0.991696
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.709296
		terraceProb     0.149635
		erosion         0
		montesMagn      0.39466
		montesFreq      3.32162
		montesSpiky     0.954183
		montesFraction  0.363707
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000662127
		hillsFraction   0.664189
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.270128
		craterFreq      0.195624
		craterDensity   1.01697
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.553314
		volcanoTemp     1686.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.230, 0.225, 0.241, 0.050)
		colorShelf     (0.270, 0.263, 0.277, 0.040)
		colorBeach     (0.311, 0.301, 0.313, 0.030)
		colorDesert    (0.351, 0.340, 0.355, 0.020)
		colorLowland   (0.392, 0.378, 0.391, 0.030)
		colorUpland    (0.432, 0.417, 0.428, 0.050)
		colorRock      (0.473, 0.455, 0.476, 0.020)
		colorSnow      (0.473, 0.455, 0.476, 1.000)
		BumpHeight      0.470274
		BumpOffset      0.0940548
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.194484
		GasToDust   0.25
		Particles   1372
		GasBright   0.0693626
		DustBright  0.472996
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   49.1813
		Period          251.884
		Eccentricity    0.925746
		Inclination     -65.4619
		AscendingNode   69.6884
		ArgOfPericenter 56.1136
		MeanAnomaly     -163.617
	}
}

Comet	"Ciutric 181"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            2.39443e-010
	Radius          8.76321
	InertiaMoment   0.399117

	Oblateness      0.0578782

	RotationPeriod  21.5013
	Obliquity       94.7239
	EqAscendNode    87.5054
	Precession      0

	AbsMagn         12.0858
	SlopeParam      7.86359
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.714 0.660 0.610)

	Surface
	{
		SurfStyle       0.671415
		OceanStyle      0.876455
		Randomize      (0.705, 0.830, 0.218)
		colorDistMagn   0.820674
		colorDistFreq   0.0623037
		detailScale     239.294
		colorConversion true
		snowLevel       2
		tropicLatitude  0.975566
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.38594
		terraceProb     0.25304
		erosion         0
		montesMagn      0.357498
		montesFreq      3.20148
		montesSpiky     0.948982
		montesFraction  0.684315
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.124274
		hillsFraction   0.518744
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24135
		craterFreq      0.238327
		craterDensity   0.815041
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.468571
		volcanoTemp     1670.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.278, 0.224, 0.171, 0.000)
		colorShelf     (0.286, 0.231, 0.195, 0.000)
		colorBeach     (0.335, 0.271, 0.232, 0.000)
		colorDesert    (0.364, 0.290, 0.226, 0.000)
		colorLowland   (0.400, 0.310, 0.256, 0.000)
		colorUpland    (0.443, 0.376, 0.311, 0.000)
		colorRock      (0.478, 0.409, 0.335, 0.000)
		colorSnow      (0.521, 0.435, 0.354, 1.000)
		BumpHeight      7.88689
		BumpOffset      1.57738
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.675676
		GasToDust   0.25
		Particles   2344
		GasBright   0.0424055
		DustBright  0.18444
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   60.4245
		Period          343.021
		Eccentricity    0.926674
		Inclination     -24.1539
		AscendingNode   110.762
		ArgOfPericenter 27.5159
		MeanAnomaly     25.4122
	}
}

Comet	"Ciutric 182"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            7.37264e-018
	Radius          0.0321843
	InertiaMoment   0.397662

	Oblateness      0.117759

	RotationPeriod  19.0679
	Obliquity       47.9296
	EqAscendNode    72.0828
	Precession      0

	AbsMagn         8.08751
	SlopeParam      2.61327
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.613 0.610 0.609)

	Surface
	{
		SurfStyle       0.0959333
		OceanStyle      0.59361
		Randomize      (-0.392, -0.488, -0.929)
		colorDistMagn   0.985637
		colorDistFreq   7.16648e-007
		detailScale     0.878847
		colorConversion true
		snowLevel       2
		tropicLatitude  0.87244
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.492704
		terraceProb     0.263433
		erosion         0
		montesMagn      0.679534
		montesFreq      2.79961
		montesSpiky     0.923365
		montesFraction  0.720583
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.88835e-006
		hillsFraction   0.397566
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214843
		craterFreq      0.226647
		craterDensity   0.950505
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.549831
		volcanoTemp     1324.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.245, 0.244, 0.244, 0.000)
		colorShelf     (0.261, 0.259, 0.259, 0.000)
		colorBeach     (0.276, 0.275, 0.274, 0.000)
		colorDesert    (0.291, 0.290, 0.289, 0.000)
		colorLowland   (0.307, 0.305, 0.304, 0.000)
		colorUpland    (0.322, 0.320, 0.320, 0.000)
		colorRock      (0.337, 0.336, 0.335, 0.000)
		colorSnow      (0.353, 0.351, 0.350, 1.000)
		BumpHeight      0.0289659
		BumpOffset      0.00579318
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.174974
		DustBright  0.536357
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   44.1621
		Period          214.326
		Eccentricity    0.947872
		Inclination     81.0463
		AscendingNode   121.619
		ArgOfPericenter -153.079
		MeanAnomaly     -142.608
	}
}

Comet	"Ciutric 183"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            5.70219e-014
	Radius          0.542814
	InertiaMoment   0.39956

	Oblateness      0.0983133

	RotationPeriod  16.4945
	Obliquity       1.13532
	EqAscendNode    56.6602
	Precession      0

	AbsMagn         4.19877
	SlopeParam      3.26228
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.575 0.569 0.565)

	Surface
	{
		SurfStyle       0.874696
		OceanStyle      0.79663
		Randomize      (0.827, -0.112, -0.712)
		colorDistMagn   0.714788
		colorDistFreq   0.000137454
		detailScale     14.8224
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0414576
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.504183
		terraceProb     0.503842
		erosion         0
		montesMagn      0.479181
		montesFreq      2.70082
		montesSpiky     0.996624
		montesFraction  0.696972
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00071954
		hillsFraction   0.505695
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251609
		craterFreq      0.250826
		craterDensity   0.999975
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.518211
		volcanoTemp     1327.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.196, 0.199, 0.226, 0.050)
		colorShelf     (0.230, 0.233, 0.260, 0.040)
		colorBeach     (0.265, 0.267, 0.294, 0.030)
		colorDesert    (0.299, 0.301, 0.333, 0.020)
		colorLowland   (0.334, 0.336, 0.367, 0.030)
		colorUpland    (0.368, 0.370, 0.401, 0.050)
		colorRock      (0.403, 0.404, 0.446, 0.020)
		colorSnow      (0.403, 0.404, 0.446, 1.000)
		BumpHeight      0.488533
		BumpOffset      0.0977066
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.22731
		GasToDust   0.25
		Particles   1439
		GasBright   0.120735
		DustBright  0.275083
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   51.6278
		Period          270.911
		Eccentricity    0.979085
		Inclination     178.081
		AscendingNode   -98.8915
		ArgOfPericenter -175.334
		MeanAnomaly     108.185
	}
}

Comet	"Ciutric 184"
{
	ParentBody     "Ciutric System"
	Class	       "Asteroid"

	Mass            4.41023e-010
	Radius          12.5168
	InertiaMoment   0.39835

	Oblateness      0.223299

	RotationPeriod  13.7491
	Obliquity       314.341
	EqAscendNode    41.2376
	Precession      0

	AbsMagn         11.7487
	SlopeParam      3.84037
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.642 0.637 0.635)

	Surface
	{
		SurfStyle       0.817686
		OceanStyle      0.497993
		Randomize      (0.822, -0.390, 0.122)
		colorDistMagn   0.811303
		colorDistFreq   0.128567
		detailScale     341.793
		colorConversion true
		snowLevel       2
		tropicLatitude  0.896497
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.58659
		terraceProb     0.116586
		erosion         0
		montesMagn      0.377251
		montesFreq      2.9024
		montesSpiky     0.881577
		montesFraction  0.488755
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.363199
		hillsFraction   0.685001
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222163
		craterFreq      0.225694
		craterDensity   1.02856
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.412867
		volcanoTemp     1409.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.250, 0.216, 0.178, 0.000)
		colorShelf     (0.257, 0.223, 0.203, 0.000)
		colorBeach     (0.302, 0.261, 0.241, 0.000)
		colorDesert    (0.327, 0.280, 0.235, 0.000)
		colorLowland   (0.360, 0.299, 0.267, 0.000)
		colorUpland    (0.398, 0.363, 0.324, 0.000)
		colorRock      (0.430, 0.395, 0.349, 0.000)
		colorSnow      (0.469, 0.420, 0.368, 1.000)
		BumpHeight      11.2652
		BumpOffset      2.25303
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.708502
		GasToDust   0.25
		Particles   2411
		GasBright   0.320494
		DustBright  0.559811
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   82.4311
		Period          546.56
		Eccentricity    0.94617
		Inclination     55.1579
		AscendingNode   -85.7265
		ArgOfPericenter 167.177
		MeanAnomaly     24.9686
	}
}

