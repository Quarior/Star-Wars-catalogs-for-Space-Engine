// http://starwars.wikia.com/wiki/Lianna
// Region : Outer Rim
// Sector : Allied Tion Sector
// Grid location : S6
// X : 10569.36, Y : 5566.06, Z : 315.16254876653113


// http://starwars.wikia.com/wiki/Devato
DwarfPlanet	"Devato/Lianna System 1"
{
	ParentBody     "Lianna System"
	Class	       "Selena"

	Mass            0.00245787
	Radius          904.991
	InertiaMoment   0.399375
    
    Oblateness      0.00125699

	RotationPeriod  47.8145
	Obliquity       20.9957
	EqAscendNode    147.894
	Precession      0

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.521 0.442 0.350)

	Surface
	{
		SurfStyle       0.199522
		OceanStyle      0.37034
		Randomize      (0.802, 0.530, -0.688)
		colorDistMagn   0.0505402
		colorDistFreq   1662.09
		detailScale     31235.5
		colorConversion true
		seaLevel        0.673314
		snowLevel       0.701008
		tropicLatitude  0.0649859
		icecapLatitude  10
		icecapHeight    0.274421
		climatePole     0.850917
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        0.583231
		venusFreq       0.920664
		venusMagn       0.511529
		mareFreq        3.28069
		mareDensity     0.061483
		terraceProb     0.355869
		erosion         0.127527
		montesMagn      0.182403
		montesFreq      716.624
		montesSpiky     0.864684
		montesFraction  0.00428625
		dunesMagn       0.0395814
		dunesFreq       114.715
		dunesFraction   0.814654
		hillsMagn       0.146558
		hillsFreq       1366.87
		hillsFraction   0.37018
		hills2Fraction  0.935225
		riversMagn      65.0716
		riversFreq      2.40267
		riversSin       8.11884
		riversOctaves   2
		canyonsMagn     0.0250345
		canyonsFreq     347.238
		canyonFraction  0.978222
		cracksMagn      0.0930031
		cracksFreq      1.21966
		cracksOctaves   0
		craterMagn      0.822284
		craterFreq      38.983
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.687816
		volcanoFreq     0.582668
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.634152
		volcanoRadius   0.487847
		volcanoTemp     1537.73
		lavaCoverTidal  0.0680172
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.83523
		stripeTwist     0.875109
		cycloneMagn     1.65278
		cycloneFreq     0.903733
		cycloneDensity  0.393535
		cycloneOctaves  2
		colorSea       (0.040, 0.100, 0.200, 1.000)
		colorShelf     (0.150, 0.480, 0.460, 1.000)
		colorBeach     (0.820, 0.730, 0.570, 0.000)
		colorDesert    (0.420, 0.360, 0.220, 0.000)
		colorLowland   (0.220, 0.230, 0.220, 0.000)
		colorUpland    (0.570, 0.540, 0.420, 0.000)
		colorRock      (0.100, 0.100, 0.100, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.308)
		colorLowPlants (0.220, 0.230, 0.220, 0.000)
		colorUpPlants  (0.570, 0.540, 0.420, 0.000)
		BumpHeight      14.4118
		BumpOffset      9.70369
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
		Height          5.43066
		Velocity        28.4774
		BumpHeight      5.43091
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.05304
		mainOctaves     10
		Coverage        0.280094
		stripeZones     1.83523
		stripeTwist     0.875109
	}

	Clouds
	{
		Height          10.8613
		Velocity        91.1771
		BumpHeight      5.03662
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.05304
		mainOctaves     10
		Coverage        0.280094
		stripeZones     1.83523
		stripeTwist     0.875109
	}

	Clouds
	{
		Height          16.293
		Velocity        200.518
		BumpHeight      5.43091
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.05304
		mainOctaves     10
		Coverage        0.280094
		stripeZones     1.83523
		stripeTwist     0.875109
	}

	Ocean
	{
		Height          9.70369
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
	}

	NoLava          true

	Atmosphere
	{
		Model          "Venus"
		Height          60.7209
		Density         8.7229
		Pressure        4.12519
		Greenhouse      1.87018
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.00752594
		Saturation      0.794461

		Composition
		{
			CO2   	84.6804
			SO2   	14.0992
			N2    	1.07741
			H2O   	0.138329
			CO    	0.00441249
			Ne    	0.00014618
			Ar    	4.5553e-005
			Kr    	2.92131e-005
			He    	2.45329e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0194942
		Period          0.00798158
		Eccentricity    0.0312483
		Inclination     2.22064
		AscendingNode   96.5424
		ArgOfPericenter 327.761
		MeanAnomaly     230.622
	}
}

// http://starwars.wikia.com/wiki/Geminor
// 1 moon
Planet	"Geminor/Lianna System 2"
{
	ParentBody     "Lianna System"
	Class	       "Terra"

	Mass            6.98182
	Radius          4144.2
	InertiaMoment   0.329039

	RotationPeriod  962.833
	Obliquity       1.87595
	EqAscendNode    13.4555

	AlbedoBond      0.368057
	AlbedoGeom      0.441668
	Brightness      2
	Color          (0.515 0.407 0.267)

	Surface
	{
		SurfStyle       0.393462
		Randomize      (-0.198, 0.564, 0.709)
		detailScale     56769.4
		colorConversion true
		tropicLatitude  0.016366
		icecapLatitude  0.916366
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0.233384
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     6.0984
		stripeFluct     0.41988
		stripeTwist     13.4332
		cycloneMagn     11.8491
		cycloneFreq     0.905668
		cycloneDensity  0.461822
		cycloneOctaves  1
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
		BumpHeight      15.8623
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          97.8047
		Velocity        -1383.59
		BumpHeight      55.0248
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.545543
		mainOctaves     12
		Coverage        0.471212
		stripeZones     6.0984
		stripeFluct     0.41988
		stripeTwist     13.4332
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          220.716
		Density         1226.61
		Pressure        227566
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.00651471
		Saturation      0.626586

		Composition
		{
			H2    	92.9678
			He    	6.62393
			CH4   	0.330289
			N2    	0.0369635
			NH3   	0.0270227
			O2    	0.00687776
			C2H2  	0.00311449
			C2H4  	0.0013552
			Ne    	0.000951859
			Ar    	0.000785484
			C2H6  	0.000610075
			C3H8  	0.000306133
		}
	}

	Aurora
	{
		Height      472.226
		NorthLat    74.7232
		NorthLon    127.667
		NorthRadius 6075.18
		NorthWidth  1372.68
		NorthRings  3
		NorthBright 1
		NorthParticles 10000
		SouthLat    -90
		SouthLon    318.731
		SouthRadius 4655.11
		SouthWidth  1350.88
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
		SemiMajorAxis   0.0330219
		Period          0.0175966
		Eccentricity    0.0441837
		Inclination     -0.960032
		AscendingNode   -121.524
		ArgOfPericenter 43.5681
		MeanAnomaly     38.0244
	}
}

DwarfMoon	"Geminor D1"
{
	ParentBody     "Lianna System 2"
	Class	       "Selena"

	Mass            3.97903e-010
	Radius          1436.32643
	InertiaMoment   0.399304

	Oblateness      0.00000072

	Obliquity       -0.00699976
	EqAscendNode    -36.8582
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.694 0.596 0.540)

	Surface
	{
		SurfStyle       0.694262
		OceanStyle      0.194444
		Randomize      (-0.971, -0.067, -0.188)
		colorDistMagn   0.572159
		colorDistFreq   0.0185772
		detailScale     145.447
		colorConversion true
        seaLevel        -1.0
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.536551
		terraceProb     0.325956
		erosion         0
		montesMagn      0.450466
		montesFreq      3.24599
		montesSpiky     0.951961
		montesFraction  0.640832
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0680301
		hillsFraction   0.711309
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2657
		craterFreq      0.220783
		craterDensity   0.868637
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.565091
		volcanoTemp     1505.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.271, 0.203, 0.151, 0.000)
		colorShelf     (0.278, 0.209, 0.173, 0.000)
		colorBeach     (0.326, 0.244, 0.205, 0.000)
		colorDesert    (0.354, 0.262, 0.200, 0.000)
		colorLowland   (0.389, 0.280, 0.227, 0.000)
		colorUpland    (0.430, 0.340, 0.275, 0.000)
		colorRock      (0.465, 0.370, 0.297, 0.000)
		colorSnow      (0.507, 0.393, 0.313, 1.000)
		BumpHeight      4.79379
		BumpOffset      0.958757
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000370713
		Period          0.000946089
		Eccentricity    7.7786e-005
		Inclination     -0.00699976
		AscendingNode   -36.8582
		ArgOfPericenter 171.366
		MeanAnomaly     -114.08
	}
}

// http://starwars.wikia.com/wiki/Aradian
// 3 moons
Planet	"Aradian/Lianna System 3"
{
	ParentBody     "Lianna System"
    Class	       "Desert"

	Mass            0.0372261
	Radius          2713.97
	InertiaMoment   0.352518

	RotationPeriod  1952.35
	Obliquity       0.644257
	EqAscendNode    -136.103
	Precession      0

	AlbedoBond      0.267783
	AlbedoGeom      0.321339
	Brightness      2
	Color          (0.495 0.492 0.486)
    
    Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Terrestrial"
	}

	Surface
	{
		SurfStyle       0.707459
		OceanStyle      0.0458152
		Randomize      (-0.841, 0.946, 0.943)
		colorDistMagn   0.0536509
		colorDistFreq   357.62
		detailScale     6980.5
		colorConversion true
		drivenDarkening -1
		seaLevel        0.0702978
		snowLevel       1
		tropicLatitude  0.00840773
		icecapLatitude  0.873984
		icecapHeight    0.0794953
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.19224
		venusFreq       1.25507
		venusMagn       0.361307
		mareFreq        1.85995
		mareDensity     0.00874746
		terraceProb     0.47788
		erosion         0
		montesMagn      0.164582
		montesFreq      116.723
		montesSpiky     0.940464
		montesFraction  0.149969
		dunesMagn       0.0609898
		dunesFreq       17.0411
		dunesFraction   0.648781
		hillsMagn       0.160808
		hillsFreq       352.385
		hillsFraction   0
		hills2Fraction  0
		riversMagn      56.8339
		riversFreq      2.94335
		riversSin       6.04352
		riversOctaves   0
		canyonsMagn     0.0189917
		canyonsFreq     69.2506
		canyonFraction  0
		cracksMagn      0.0689157
		cracksFreq      0.296597
		cracksOctaves   0
		craterMagn      0.658524
		craterFreq      8.29074
		craterDensity   0.33197
		craterOctaves   5
		craterRayedFactor 0
		volcanoMagn     0.641816
		volcanoFreq     0.696885
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 1.75147
		volcanoFlows    0.385712
		volcanoRadius   0.459349
		volcanoTemp     1603.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.04076
		stripeFluct     0
		stripeTwist     0.747216
		cycloneMagn     2.39142
		cycloneFreq     0.549238
		cycloneDensity  0.46728
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
		Height          14.595
		Velocity        31.6237
		BumpHeight      4.59498
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.987215
		mainOctaves     10
		Coverage        0.135566
		stripeZones     2.04076
		stripeFluct     0
		stripeTwist     0.747216
	}

	Clouds
	{
		Height          19.1899
		Velocity        145.934
		BumpHeight      4.59498
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.987215
		mainOctaves     10
		Coverage        0.135566
		stripeZones     2.04076
		stripeFluct     0
		stripeTwist     0.747216
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Venus"
		Height          135.699
		Density         0.10351
		Pressure        0.0611958
		Greenhouse      73.820064
		Bright          20
		Opacity         0
		SkyLight        8.33333
		Hue             0
		Saturation      1

		Composition
		{
			CO2   	84.6804
			SO2   	14.0992
			N2    	1.07741
			H2O   	0.138329
			CO    	0.00441249
			Ne    	0.00014618
			Ar    	4.5553e-005
			Kr    	2.92131e-005
			He    	2.45329e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0543069
		Period          0.0371206
		Eccentricity    0.0591692
		Inclination     0.644257
		AscendingNode   -136.103
		ArgOfPericenter 341.927
		MeanAnomaly     260.86
	}
}

Moon	"Aradian 1"
{
	ParentBody     "Lianna System 3"
	Class	       "Selena"

	Mass            0.0927186
	Radius          3363.34
	InertiaMoment   0.333463

	Oblateness      0.0171112

	Obliquity       -1.20574
	EqAscendNode    76.6757
	Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.748 0.744 0.742)

	Surface
	{
		SurfStyle       0.0483152
		OceanStyle      0.0277278
		Randomize      (-0.667, 0.121, -0.999)
		colorDistMagn   0.061649
		colorDistFreq   420.111
		detailScale     8650.69
		colorConversion true
		drivenDarkening 0
		seaLevel        0.200734
		snowLevel       2
		tropicLatitude  0.033006
		icecapLatitude  10
		icecapHeight    0.185485
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.70472
		venusFreq       0.787508
		venusMagn       0
		mareFreq        1.62497
		mareDensity     0.0124005
		terraceProb     0.204965
		erosion         0
		montesMagn      0.244224
		montesFreq      177.204
		montesSpiky     0.889089
		montesFraction  0.897633
		dunesMagn       0.0499961
		dunesFreq       4317.31
		dunesFraction   0.73997
		hillsMagn       0.146037
		hillsFreq       421.469
		hillsFraction   0.975096
		hills2Fraction  0
		riversMagn      58.5504
		riversFreq      3.87874
		riversSin       6.09039
		riversOctaves   0
		canyonsMagn     0.531768
		canyonsFreq     1.30006
		canyonFraction  0.792899
		cracksMagn      0.0460009
		cracksFreq      0.767798
		cracksOctaves   0
		craterMagn      0.529706
		craterFreq      9.41944
		craterDensity   0.437132
		craterOctaves   5.66094
		craterRayedFactor 0
		volcanoMagn     0.636204
		volcanoFreq     0.821909
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.328835
		volcanoRadius   0.50818
		volcanoTemp     1336.04
		lavaCoverTidal  0.58695
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.320, 0.320, 0.000)
		colorShelf     (0.370, 0.370, 0.370, 0.000)
		colorBeach     (0.374, 0.372, 0.371, 0.000)
		colorDesert    (0.464, 0.446, 0.423, 0.200)
		colorLowland   (0.501, 0.476, 0.475, 0.500)
		colorUpland    (0.524, 0.498, 0.490, 0.800)
		colorRock      (0.650, 0.610, 0.620, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.996859
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
		Height          252.25
		Density         0.000314085
		Pressure        0.000639142
		Greenhouse      1.70764
		Bright          3.15798
		Opacity         0
		SkyLight        1.05266
		Hue             0.0202595
		Saturation      1

		Composition
		{
			NH3   	61.5504
			H2O   	14.7639
			CH4   	9.08697
			CO2   	8.62277
			C2H2  	2.56462
			H2S   	1.44533
			N2    	0.716386
			C2H4  	0.487399
			C3H8  	0.34607
			SO2   	0.336637
			C2H6  	0.0775683
			CO    	0.00151475
			Ar    	0.000233628
			Ne    	0.000185541
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000961827
		Period          0.00152572
		Eccentricity    0.00953057
		Inclination     -1.20574
		AscendingNode   76.6757
		ArgOfPericenter 159.327
		MeanAnomaly     54.0561
	}
}

Moon	"Aradian 2"
{
	ParentBody     "Lianna System 3"
	Class	       "IceWorld"

	Mass            5.91113e-006
	Radius          276.687
	InertiaMoment   0.3985

	Oblateness      0.00908561

	Obliquity       7.37773
	EqAscendNode    24.8892
	Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.700 0.635 0.542)

	Surface
	{
		SurfStyle       0.85278
		OceanStyle      0.217201
		Randomize      (-0.889, 0.243, -0.904)
		colorDistMagn   0.0642333
		colorDistFreq   37.8065
		detailScale     711.654
		colorConversion true
		drivenDarkening -0.7
		seaLevel        0.226412
		snowLevel       2
		tropicLatitude  0.248807
		icecapLatitude  0.7786
		icecapHeight    0.241529
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.90428
		venusFreq       1.16201
		venusMagn       0
		mareFreq        0
		mareDensity     1.39643e-006
		terraceProb     0.282732
		erosion         0
		montesMagn      0.0696061
		montesFreq      13.7837
		montesSpiky     0.935574
		montesFraction  0.507931
		dunesMagn       0.0396146
		dunesFreq       366.553
		dunesFraction   0.848629
		hillsMagn       0.129256
		hillsFreq       35.9349
		hillsFraction   0.101503
		hills2Fraction  0.128117
		riversMagn      56.5346
		riversFreq      1.78731
		riversSin       6.39633
		riversOctaves   0
		canyonsMagn     0.51413
		canyonsFreq     0.0798877
		canyonFraction  0
		cracksMagn      0.0407135
		cracksFreq      0.157355
		cracksOctaves   0
		craterMagn      0.885779
		craterFreq      0.90423
		craterDensity   0.764277
		craterOctaves   8
		craterRayedFactor 0.165336
		volcanoMagn     0.171719
		volcanoFreq     0.767223
		volcanoDensity  0.23222
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.190621
		volcanoRadius   0.160407
		volcanoTemp     1374.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.700, 0.476, 0.311, 0.000)
		colorShelf     (0.665, 0.452, 0.295, 0.000)
		colorBeach     (0.350, 0.238, 0.155, 0.000)
		colorDesert    (0.595, 0.405, 0.264, 0.000)
		colorLowland   (0.567, 0.419, 0.295, 0.000)
		colorUpland    (0.651, 0.443, 0.289, 0.000)
		colorRock      (1.000, 1.000, 1.000, 0.500)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.567, 0.419, 0.295, 0.000)
		colorUpPlants  (0.651, 0.443, 0.289, 0.000)
		BumpHeight      13.8343
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
		SemiMajorAxis   0.00265061
		Period          0.00698241
		Eccentricity    0.125124
		Inclination     7.37773
		AscendingNode   24.8892
		ArgOfPericenter -175.414
		MeanAnomaly     64.2856
	}
}

DwarfMoon	"Aradian D1"
{
	ParentBody     "Lianna System 3"
	Class	       "Asteroid"

	Mass            1.90912e-011
	Radius          3.86018
	InertiaMoment   0.399502

	Oblateness      0.00544216

	Obliquity       46.323
	EqAscendNode    10.9656
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.675 0.672 0.671)

	Surface
	{
		SurfStyle       0.872027
		OceanStyle      0.402912
		Randomize      (0.277, -0.210, 0.296)
		colorDistMagn   0.129858
		colorDistFreq   0.00956827
		detailScale     105.409
		colorConversion true
		snowLevel       2
		tropicLatitude  0.99933
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.591306
		terraceProb     0.447958
		erosion         0
		montesMagn      0.629519
		montesFreq      2.87609
		montesSpiky     0.893028
		montesFraction  0.642992
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.032838
		hillsFraction   0.525911
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.270271
		craterFreq      0.216508
		craterDensity   0.889237
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.550537
		volcanoTemp     1441.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.229, 0.235, 0.268, 0.050)
		colorShelf     (0.270, 0.276, 0.309, 0.040)
		colorBeach     (0.310, 0.316, 0.349, 0.030)
		colorDesert    (0.351, 0.356, 0.396, 0.020)
		colorLowland   (0.391, 0.397, 0.436, 0.030)
		colorUpland    (0.432, 0.437, 0.476, 0.050)
		colorRock      (0.472, 0.477, 0.530, 0.020)
		colorSnow      (0.472, 0.477, 0.530, 1.000)
		BumpHeight      3.47416
		BumpOffset      0.694833
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00297155
		Period          0.0082882
		Eccentricity    0.00117763
		Inclination     46.323
		AscendingNode   10.9656
		ArgOfPericenter -30.213
		MeanAnomaly     -88.2609
	}
}

Planet	"Lianna/Lianna System 4"
{
	ParentBody     "Lianna System"
	Class	       "Terra"

	Mass            127.758
	Radius          6559.8
	InertiaMoment   0.192375

    RotationPeriod  22
	Obliquity       2.17559
	EqAscendNode    173.89
	Precession      0
	TidalLocked     false

	AlbedoBond      0.498017
	AlbedoGeom      0.59762
	Brightness      2
	Color          (1.036 0.994 0.779)

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine/Terrestrial"
	}

	Surface
	{
		SurfStyle       0.712203
		OceanStyle      0.446283
		Randomize      (0.175, 0.328, 0.958)
		colorDistMagn   0.0546008
		colorDistFreq   541.261
		detailScale     11223.5
		colorConversion true
		seaLevel        0.292074
		snowLevel       0.85
		tropicLatitude  0.0240483
		icecapLatitude  0.919173
		icecapHeight    0.295445
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.220584
		venusFreq       1.14835
		venusMagn       0
		mareFreq        2.71846
		mareDensity     0.0607684
		terraceProb     0.304862
		erosion         0.118428
		montesMagn      0.175816
		montesFreq      249.766
		montesSpiky     0.917811
		montesFraction  0.463503
		dunesMagn       0.0684566
		dunesFreq       42.8512
		dunesFraction   0.141766
		hillsMagn       0.13556
		hillsFreq       605.017
		hillsFraction   0.698921
		hills2Fraction  0.433591
		riversMagn      57.6461
		riversFreq      3.78306
		riversSin       6.24639
		riversOctaves   2
		canyonsMagn     0.0304719
		canyonsFreq     102.647
		canyonFraction  0.534525
		cracksMagn      0.0925091
		cracksFreq      0.466271
		cracksOctaves   0
		craterMagn      0.624997
		craterFreq      10.8154
		craterDensity   0.025272
		craterOctaves   1.81394
		volcanoMagn     0.745146
		volcanoFreq     0.672142
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 0.87281
		volcanoFlows    0.678806
		volcanoRadius   0.558467
		volcanoTemp     1632.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1
		stripeTwist     3.5
		cycloneMagn     1.03124
		cycloneDensity  0.32555
		cycloneOctaves  0
		colorSea       (0.040, 0.100, 0.200, 1.000)
		colorShelf     (0.150, 0.480, 0.460, 1.000)
		colorBeach     (0.780, 0.750, 0.740, 0.000)
		colorDesert    (0.470, 0.420, 0.390, 0.000)
		colorLowland   (0.270, 0.250, 0.230, 0.000)
		colorUpland    (0.490, 0.480, 0.460, 0.000)
		colorRock      (0.260, 0.240, 0.230, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.308)
		colorLowPlants (0.091, 0.080, 0.014, 0.000)
		colorUpPlants  (0.196, 0.191, 0.069, 0.000)
		BumpHeight      20
		BumpOffset      5.84148
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
		Height          5.02393
		Velocity        138.104
		BumpHeight      5.02408
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.01489
		mainOctaves     10
		Coverage        0.137682
		stripeZones     1
		stripeTwist     3.5
	}

	Clouds
	{
		Height          10.0483
		Velocity        137.42
		BumpHeight      5.02408
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.01489
		mainOctaves     10
		Coverage        0.137682
		stripeZones     1
		stripeTwist     3.5
	}

	Ocean
	{
		Height          5.84148
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
	}

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          719.686
		Density         1.2929
		Pressure        1
		Greenhouse      147.619
		Bright          10
		Opacity         1
		SkyLight        4.36508
		Hue             -0.031746
		Saturation      1.15873

		Composition // values in percent
		{
			N2  77.7729
			O2  20.8625
			Ar  0.9303
			H2O 0.4000
			CO2 0.0398
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.10789
		Period          1.0130047912388774811772758384668
		Eccentricity    0.0469201
		Inclination     2.17559
		AscendingNode   173.89
		ArgOfPericenter 337.02
		MeanAnomaly     148.684
	}
}

Moon	"Lianna 1"
{
	ParentBody     "Lianna System 4"
	Class	       "Selena"

	Mass            0.0927186
	Radius          3363.34
	InertiaMoment   0.333463

	Oblateness      0.0171112

	Obliquity       -1.20574
	EqAscendNode    76.6757
	Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.748 0.744 0.742)

	Surface
	{
		SurfStyle       0.0483152
		OceanStyle      0.0277278
		Randomize      (-0.667, 0.121, -0.999)
		colorDistMagn   0.061649
		colorDistFreq   420.111
		detailScale     8650.69
		colorConversion true
		drivenDarkening 0
		seaLevel        0.200734
		snowLevel       2
		tropicLatitude  0.033006
		icecapLatitude  10
		icecapHeight    0.185485
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.70472
		venusFreq       0.787508
		venusMagn       0
		mareFreq        1.62497
		mareDensity     0.0124005
		terraceProb     0.204965
		erosion         0
		montesMagn      0.244224
		montesFreq      177.204
		montesSpiky     0.889089
		montesFraction  0.897633
		dunesMagn       0.0499961
		dunesFreq       4317.31
		dunesFraction   0.73997
		hillsMagn       0.146037
		hillsFreq       421.469
		hillsFraction   0.975096
		hills2Fraction  0
		riversMagn      58.5504
		riversFreq      3.87874
		riversSin       6.09039
		riversOctaves   0
		canyonsMagn     0.531768
		canyonsFreq     1.30006
		canyonFraction  0.792899
		cracksMagn      0.0460009
		cracksFreq      0.767798
		cracksOctaves   0
		craterMagn      0.529706
		craterFreq      9.41944
		craterDensity   0.437132
		craterOctaves   5.66094
		craterRayedFactor 0
		volcanoMagn     0.636204
		volcanoFreq     0.821909
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.328835
		volcanoRadius   0.50818
		volcanoTemp     1336.04
		lavaCoverTidal  0.58695
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.320, 0.320, 0.000)
		colorShelf     (0.370, 0.370, 0.370, 0.000)
		colorBeach     (0.374, 0.372, 0.371, 0.000)
		colorDesert    (0.464, 0.446, 0.423, 0.200)
		colorLowland   (0.501, 0.476, 0.475, 0.500)
		colorUpland    (0.524, 0.498, 0.490, 0.800)
		colorRock      (0.650, 0.610, 0.620, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.996859
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
		Height          252.25
		Density         0.000314085
		Pressure        0.000639142
		Greenhouse      1.70764
		Bright          3.15798
		Opacity         0
		SkyLight        1.05266
		Hue             0.0202595
		Saturation      1

		Composition
		{
			NH3   	61.5504
			H2O   	14.7639
			CH4   	9.08697
			CO2   	8.62277
			C2H2  	2.56462
			H2S   	1.44533
			N2    	0.716386
			C2H4  	0.487399
			C3H8  	0.34607
			SO2   	0.336637
			C2H6  	0.0775683
			CO    	0.00151475
			Ar    	0.000233628
			Ne    	0.000185541
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000961827
		Period          0.00152572
		Eccentricity    0.00953057
		Inclination     -1.20574
		AscendingNode   76.6757
		ArgOfPericenter 159.327
		MeanAnomaly     54.0561
	}
}

// http://starwars.wikia.com/wiki/Indinor
Planet	"Indinor/Lianna System 5"
{
	ParentBody     "Lianna System"
	Class	       "Selena"

	Mass            0.879744
	Radius          6774.63
	InertiaMoment   0.329049

	RotationPeriod  2341.29
	Obliquity       2.28836
	EqAscendNode    57.7098
	Precession      0

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.721 0.717 0.714)

	Surface
	{
		SurfStyle       0.771827
		OceanStyle      0.774432
		Randomize      (0.539, 0.298, -0.734)
		colorDistMagn   0.0440432
		colorDistFreq   761.448
		detailScale     17424.7
		colorConversion true
		drivenDarkening 0
		seaLevel        0.258762
		snowLevel       2
		tropicLatitude  0.0699
		icecapLatitude  0.895101
		icecapHeight    0.262464
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.79197
		venusFreq       1.18162
		venusMagn       0.252097
		mareFreq        1.61842
		mareDensity     0.109575
		terraceProb     0.184312
		erosion         0
		montesMagn      0.156658
		montesFreq      327.399
		montesSpiky     0.942125
		montesFraction  0.946325
		dunesMagn       0.0288719
		dunesFreq       8805.26
		dunesFraction   0.656839
		hillsMagn       0.118929
		hillsFreq       772.331
		hillsFraction   0.630847
		hills2Fraction  0.288307
		riversMagn      56.6502
		riversFreq      2.12016
		riversSin       7.47225
		riversOctaves   0
		canyonsMagn     0.646831
		canyonsFreq     2.966
		canyonFraction  0
		cracksMagn      0.0424889
		cracksFreq      1.46652
		cracksOctaves   5
		craterMagn      0.572681
		craterFreq      20.2102
		craterDensity   0.977832
		craterOctaves   12.8077
		craterRayedFactor 0.16358
		volcanoMagn     0.538694
		volcanoFreq     0.780041
		volcanoDensity  0.0749206
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.155154
		volcanoRadius   0.554443
		volcanoTemp     1328.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.462, 0.459, 0.478, 0.250)
		colorShelf     (0.505, 0.523, 0.543, 0.250)
		colorBeach     (0.411, 0.387, 0.414, 0.200)
		colorDesert    (0.382, 0.351, 0.364, 0.200)
		colorLowland   (0.281, 0.272, 0.300, 0.200)
		colorUpland    (0.534, 0.531, 0.543, 0.250)
		colorRock      (0.640, 0.630, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.281, 0.272, 0.300, 0.200)
		colorUpPlants  (0.534, 0.531, 0.543, 0.250)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.986461
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          42.7938
		Density         0.00135393
		Pressure        0.00110757
		Greenhouse      1.01398
		Bright          4.22979
		Opacity         1
		SkyLight        1.40993
		Hue             0
		Saturation      1

		Composition
		{
			CH4   	61.0798
			H2    	31.2279
			C2H4  	5.42298
			N2    	1.51517
			C2H2  	0.490227
			C2H6  	0.208818
			CO2   	0.0258191
			CO    	0.0237164
			H2S   	0.00221795
			Ar    	0.00220181
			Ne    	0.00080159
			O2    	0.000179398
			Kr    	8.36888e-005
			He    	3.37825e-005
		}
	}

	NoAurora        true

	Rings
	{
		InnerRadius     7688.61
		OuterRadius     12484.9
		RotationPeriod  2.99249
		RotationOffset  0
		FrontBright     0.227358
		BackBright      0.510426
		Density         0.378459
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.167082
		Period          0.200318
		Eccentricity    0.0783661
		Inclination     2.28836
		AscendingNode   57.7098
		ArgOfPericenter 64.1681
		MeanAnomaly     44.3971
	}
}

DwarfMoon	"Indinor D1"
{
	ParentBody     "Lianna System 5"
	Class	       "Asteroid"

	Mass            8.14136e-009
	Radius          27.5842
	InertiaMoment   0.398096

	Oblateness      0.198482

	Obliquity       0.00034262
	EqAscendNode    174.482
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.546 0.542 0.537)

	Surface
	{
		SurfStyle       0.0376068
		OceanStyle      0.71805
		Randomize      (0.962, -0.690, 0.834)
		colorDistMagn   0.830917
		colorDistFreq   0.612253
		detailScale     753.232
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.39131
		terraceProb     0.342451
		erosion         0
		montesMagn      0.531422
		montesFreq      2.85438
		montesSpiky     0.907627
		montesFraction  0.490692
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.99735
		hillsFraction   0.400479
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239502
		craterFreq      0.240691
		craterDensity   0.811218
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.516124
		volcanoTemp     1705.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.218, 0.217, 0.215, 0.000)
		colorShelf     (0.232, 0.231, 0.228, 0.000)
		colorBeach     (0.246, 0.244, 0.242, 0.000)
		colorDesert    (0.259, 0.258, 0.255, 0.000)
		colorLowland   (0.273, 0.271, 0.268, 0.000)
		colorUpland    (0.287, 0.285, 0.282, 0.000)
		colorRock      (0.300, 0.298, 0.295, 0.000)
		colorSnow      (0.314, 0.312, 0.309, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000161556
		Period          0.00126616
		Eccentricity    7.24804e-005
		Inclination     0.00034262
		AscendingNode   174.482
		ArgOfPericenter -103.003
		MeanAnomaly     72.5925
	}
}

DwarfMoon	"Indinor D2"
{
	ParentBody     "Lianna System 5"
	Class	       "Asteroid"

	Mass            1.11217e-008
	Radius          28.8759
	InertiaMoment   0.399205

	RotationPeriod  240.692
	Obliquity       11.2169
	EqAscendNode    -50.9468
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.665 0.576 0.473)

	Surface
	{
		SurfStyle       0.1708
		OceanStyle      0.328075
		Randomize      (0.582, -0.371, -0.982)
		colorDistMagn   0.5885
		colorDistFreq   0.368059
		detailScale     788.505
		colorConversion true
		snowLevel       2
		tropicLatitude  0.345769
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.409745
		terraceProb     0.300046
		erosion         0
		montesMagn      0.609569
		montesFreq      3.22614
		montesSpiky     0.875869
		montesFraction  0.429778
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.46767
		hillsFraction   0.802171
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239302
		craterFreq      0.208329
		craterDensity   0.805228
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.489312
		volcanoTemp     1718.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.266, 0.231, 0.189, 0.000)
		colorShelf     (0.283, 0.245, 0.201, 0.000)
		colorBeach     (0.299, 0.259, 0.213, 0.000)
		colorDesert    (0.316, 0.274, 0.224, 0.000)
		colorLowland   (0.333, 0.288, 0.236, 0.000)
		colorUpland    (0.349, 0.303, 0.248, 0.000)
		colorRock      (0.366, 0.317, 0.260, 0.000)
		colorSnow      (0.383, 0.331, 0.272, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000603991
		Period          0.00915266
		Eccentricity    0.415856
		Inclination     11.2169
		AscendingNode   -50.9468
		ArgOfPericenter -16.6321
		MeanAnomaly     -93.4983
	}
}

// http://starwars.wikia.com/wiki/Adinai
Planet	"Adinai/Lianna System 6"
{
	ParentBody     "Lianna System"
	Class	       "GasGiant"

	Mass            21.3988
	Radius          22141.5
	InertiaMoment   0.248921

	Oblateness      0.0281547

	RotationPeriod  9.98245
	Obliquity       2.20651
	EqAscendNode    127.374
	Precession      0

	AlbedoBond      0.423568
	AlbedoGeom      0.508281
	Brightness      2

	Surface
	{
		SurfStyle       0.866421
		Randomize      (-0.069, 0.095, 0.326)
		detailScale     56949.1
		colorConversion true
		tropicLatitude  0.0256919
		icecapLatitude  0.925692
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     9.45109
		stripeFluct     0.409523
		stripeTwist     9.37273
		cycloneMagn     10.4321
		cycloneFreq     0.912123
		cycloneDensity  0.295294
		cycloneOctaves  0
		colorLayer0    (0.200, 0.260, 0.330, 1.000)
		colorLayer1    (0.250, 0.330, 0.450, 1.000)
		colorLayer2    (0.220, 0.380, 0.560, 1.000)
		colorLayer3    (0.260, 0.430, 0.530, 1.000)
		colorLayer4    (0.240, 0.430, 0.630, 1.000)
		colorLayer5    (0.240, 0.510, 0.780, 1.000)
		colorLayer6    (0.340, 0.580, 0.750, 1.000)
		colorLayer7    (1.000, 1.000, 1.000, 1.000)
		colorLowPlants (0.240, 0.430, 0.630, 1.000)
		colorUpPlants  (0.240, 0.510, 0.780, 1.000)
		BumpHeight      15.0089
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          35.6504
		Velocity        1971.67
		BumpHeight      20.6406
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.08913
		mainOctaves     12
		Coverage        0.117838
		stripeZones     9.45109
		stripeFluct     0.409523
		stripeTwist     9.37273
	}

	Clouds
	{
		Height          56.291
		Velocity        858.549
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		ModulateColor  (1.000 1.000 1.000 0.800)
		mainFreq        1.08913
		mainOctaves     12
		Coverage        0.117838
		stripeZones     9.45109
		stripeFluct     0.409523
		stripeTwist     9.37273
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          221.415
		Density         4007.93
		Pressure        318576
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.0307822
		Saturation      0.919136

		Composition
		{
			H2    	91.2129
			He    	8.74867
			N2    	0.0367873
			Ne    	0.00125478
			O2    	0.000301792
			Ar    	0.000111699
			CH4   	1.65798e-005
		}
	}

	Aurora
	{
		Height      340.701
		NorthLat    48.3427
		NorthLon    102.393
		NorthRadius 6251.35
		NorthWidth  1594.31
		NorthRings  2
		NorthBright 1
		NorthParticles 10000
		SouthLat    -64.0814
		SouthLon    277.107
		SouthRadius 6028.71
		SouthWidth  1620.2
		SouthRings  5
		SouthBright 1
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	Rings
	{
		InnerRadius     26185.8
		OuterRadius     37350.7
		RotationPeriod  3.39139
		RotationOffset  0
		FrontBright     0.777004
		BackBright      0.867448
		Density         0.62761
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.709585
		Period          1.75275
		Eccentricity    0.0442991
		Inclination     1.42602
		AscendingNode   138.792
		ArgOfPericenter 34.2655
		MeanAnomaly     41.4109
	}
}

Moon	"Adinai 1"
{
	ParentBody     "Lianna System 6"
	Class	       "Desert"

	Mass            0.18543
	Radius          4830.2
	InertiaMoment   0.328608

	Oblateness      0.0077586

	Obliquity       -1.38502
	EqAscendNode    86.9986
	Precession      0
	TidalLocked     true

	AlbedoBond      0.276105
	AlbedoGeom      0.331326
	Brightness      2
	Color          (0.764 0.763 0.762)

	Surface
	{
		SurfStyle       0.180583
		OceanStyle      0.181576
		Randomize      (-0.021, 0.832, 0.178)
		colorDistMagn   0.0546271
		colorDistFreq   640.959
		detailScale     12423.5
		colorConversion true
		seaLevel        0.0610511
		snowLevel       2
		tropicLatitude  0.0350609
		icecapLatitude  10
		icecapHeight    0.172192
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        0.796042
		venusFreq       1.11688
		venusMagn       0.381933
		mareFreq        2.45774
		mareDensity     0.020987
		terraceProb     0.435674
		erosion         0
		montesMagn      0.196266
		montesFreq      237.727
		montesSpiky     0.989598
		montesFraction  0.946169
		dunesMagn       0.0464633
		dunesFreq       45.0759
		dunesFraction   0.868935
		hillsMagn       0.115334
		hillsFreq       624.776
		hillsFraction   0
		hills2Fraction  0
		riversMagn      61.9126
		riversFreq      3.3681
		riversSin       5.81004
		riversOctaves   0
		canyonsMagn     0.0097428
		canyonsFreq     113.361
		canyonFraction  0
		cracksMagn      0.0680438
		cracksFreq      0.439117
		cracksOctaves   0
		craterMagn      0.667349
		craterFreq      16.237
		craterDensity   0.0688446
		craterOctaves   1.044
		volcanoMagn     0.634578
		volcanoFreq     0.817446
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.75762
		volcanoRadius   0.476947
		volcanoTemp     1677.79
		lavaCoverTidal  0.619447
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.56128
		stripeTwist     0
		cycloneMagn     1.5656
		cycloneFreq     0.740913
		cycloneDensity  0.392916
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
		Height          15.2925
		Velocity        117.899
		BumpHeight      5.29226
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.08789
		mainOctaves     10
		Coverage        0.15221
		stripeZones     1.56128
		stripeTwist     0
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          241.51
		Density         0.130272
		Pressure        0.285455
		Greenhouse      36.409
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0
		Saturation      1

		Composition
		{
			CH4   	51.8697
			H2O   	35.6189
			CO2   	7.08929
			SO2   	1.52804
			H2    	1.37941
			C2H4  	1.19616
			NH3   	0.583039
			C2H6  	0.243939
			H2S   	0.237579
			C2H2  	0.222545
			N2    	0.0217905
			C3H8  	0.00898515
			CO    	0.000405079
			Ar    	8.36867e-005
			He    	5.77973e-005
		}
	}

	Aurora
	{
		Height      121.223
		NorthLat    52.076
		NorthLon    -86.5143
		NorthRadius 563.963
		NorthWidth  107.889
		NorthRings  3
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -30.2138
		SouthLon    75.7487
		SouthRadius 1213.22
		SouthWidth  277.216
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
		SemiMajorAxis   0.000784085
		Period          0.00273311
		Eccentricity    0.0281695
		Inclination     -1.38502
		AscendingNode   86.9986
		ArgOfPericenter -48.4299
		MeanAnomaly     42.776
	}
}

DwarfMoon	"Adinai D1"
{
	ParentBody     "Lianna System 6"
	Class	       "Asteroid"

	Mass            8.2143e-006
	Radius          167.787
	InertiaMoment   0.39625

	Oblateness      0.00186654

	Obliquity       1.20003
	EqAscendNode    -15.6876
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.825 0.777 0.694)

	Surface
	{
		SurfStyle       0.176223
		OceanStyle      0.171304
		Randomize      (0.394, -0.113, -0.714)
		colorDistMagn   0.703167
		colorDistFreq   14.4354
		detailScale     4581.7
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0414849
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.622741
		terraceProb     0.170653
		erosion         0
		montesMagn      0.346414
		montesFreq      3.00642
		montesSpiky     0.877946
		montesFraction  0.555449
		dunesFraction   0
		hillsMagn       0
		hillsFreq       43.6708
		hillsFraction   0.684511
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.212979
		craterFreq      0.975442
		craterDensity   0.96294
		craterOctaves   16
		volcanoActivity 0.0363949
		volcanoFlows    0
		volcanoRadius   0.557642
		volcanoTemp     1702.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.330, 0.311, 0.278, 0.000)
		colorShelf     (0.351, 0.330, 0.295, 0.000)
		colorBeach     (0.371, 0.350, 0.312, 0.000)
		colorDesert    (0.392, 0.369, 0.330, 0.000)
		colorLowland   (0.413, 0.388, 0.347, 0.000)
		colorUpland    (0.433, 0.408, 0.364, 0.000)
		colorRock      (0.454, 0.427, 0.382, 0.000)
		colorSnow      (0.474, 0.447, 0.399, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00134184
		Period          0.0061452
		Eccentricity    0.0496532
		Inclination     1.20003
		AscendingNode   -15.6876
		ArgOfPericenter -95.2083
		MeanAnomaly     -64.123
	}
}

DwarfMoon	"Adinai D2"
{
	ParentBody     "Lianna System 6"
	Class	       "Asteroid"

	Mass            2.96851e-011
	Radius          4.47783
	InertiaMoment   0.399

	Obliquity       53.935
	EqAscendNode    131.087
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.580 0.574 0.569)

	Surface
	{
		SurfStyle       0.440608
		OceanStyle      0.357042
		Randomize      (-0.659, -0.126, -0.176)
		colorDistMagn   0.736237
		colorDistFreq   0.0152385
		detailScale     122.275
		colorConversion true
		snowLevel       2
		tropicLatitude  0.630723
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.377158
		terraceProb     0.570266
		erosion         0
		montesMagn      0.362488
		montesFreq      3.34713
		montesSpiky     0.970956
		montesFraction  0.568388
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0336476
		hillsFraction   0.531847
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.216178
		craterFreq      0.212467
		craterDensity   0.795102
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.494695
		volcanoTemp     1268.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.232, 0.230, 0.228, 0.000)
		colorShelf     (0.247, 0.244, 0.242, 0.000)
		colorBeach     (0.261, 0.258, 0.256, 0.000)
		colorDesert    (0.276, 0.273, 0.270, 0.000)
		colorLowland   (0.290, 0.287, 0.285, 0.000)
		colorUpland    (0.305, 0.301, 0.299, 0.000)
		colorRock      (0.319, 0.316, 0.313, 0.000)
		colorSnow      (0.334, 0.330, 0.327, 1.000)
		BumpHeight      4.03004
		BumpOffset      0.806009
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00770692
		Period          0.0845876
		Eccentricity    0.294977
		Inclination     53.935
		AscendingNode   131.087
		ArgOfPericenter 151.236
		MeanAnomaly     124.433
	}
}

DwarfMoon	"Adinai D3"
{
	ParentBody     "Lianna System 6"
	Class	       "Asteroid"

	Mass            5.39474e-011
	Radius          5.24595
	InertiaMoment   0.399917

	RotationPeriod  1612.87
	Obliquity       -43.1981
	EqAscendNode    -146.838
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.488 0.483 0.475)

	Surface
	{
		SurfStyle       0.424091
		OceanStyle      0.885206
		Randomize      (-0.106, 0.129, 0.606)
		colorDistMagn   0.268203
		colorDistFreq   0.0181099
		detailScale     143.249
		colorConversion true
		snowLevel       2
		tropicLatitude  0.383161
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.507888
		terraceProb     0.298125
		erosion         0
		montesMagn      0.641727
		montesFreq      2.65311
		montesSpiky     0.902748
		montesFraction  0.23831
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0665239
		hillsFraction   0.435835
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.265128
		craterFreq      0.230997
		craterDensity   0.984679
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.504281
		volcanoTemp     1707.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.195, 0.193, 0.190, 0.000)
		colorShelf     (0.207, 0.205, 0.202, 0.000)
		colorBeach     (0.220, 0.217, 0.214, 0.000)
		colorDesert    (0.232, 0.229, 0.226, 0.000)
		colorLowland   (0.244, 0.241, 0.237, 0.000)
		colorUpland    (0.256, 0.254, 0.249, 0.000)
		colorRock      (0.268, 0.266, 0.261, 0.000)
		colorSnow      (0.281, 0.278, 0.273, 1.000)
		BumpHeight      4.72136
		BumpOffset      0.944271
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00815068
		Period          0.0919975
		Eccentricity    0.278647
		Inclination     -43.1981
		AscendingNode   -146.838
		ArgOfPericenter -88.152
		MeanAnomaly     140.37
	}
}

DwarfMoon	"Adinai D4"
{
	ParentBody     "Lianna System 6"
	Class	       "Asteroid"

	Mass            9.21689e-011
	Radius          5.98638
	InertiaMoment   0.397998

	Obliquity       -18.8842
	EqAscendNode    -120.691
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.485 0.476 0.471)

	Surface
	{
		SurfStyle       0.0560646
		OceanStyle      0.242101
		Randomize      (0.510, -0.120, -0.113)
		colorDistMagn   0.956473
		colorDistFreq   0.0257777
		detailScale     163.468
		colorConversion true
		snowLevel       2
		tropicLatitude  0.316138
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.721031
		terraceProb     0.122182
		erosion         0
		montesMagn      0.463819
		montesFreq      3.31423
		montesSpiky     0.962669
		montesFraction  0.631646
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0842614
		hillsFraction   0.776205
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.207128
		craterFreq      0.230518
		craterDensity   0.974965
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.466152
		volcanoTemp     1640.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.194, 0.190, 0.189, 0.000)
		colorShelf     (0.206, 0.202, 0.200, 0.000)
		colorBeach     (0.218, 0.214, 0.212, 0.000)
		colorDesert    (0.231, 0.226, 0.224, 0.000)
		colorLowland   (0.243, 0.238, 0.236, 0.000)
		colorUpland    (0.255, 0.250, 0.247, 0.000)
		colorRock      (0.267, 0.262, 0.259, 0.000)
		colorSnow      (0.279, 0.273, 0.271, 1.000)
		BumpHeight      5.38774
		BumpOffset      1.07755
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00858711
		Period          0.0994846
		Eccentricity    0.073886
		Inclination     -18.8842
		AscendingNode   -120.691
		ArgOfPericenter -123.773
		MeanAnomaly     125.967
	}
}

DwarfMoon	"Adinai D5"
{
	ParentBody     "Lianna System 6"
	Class	       "Asteroid"

	Mass            1.50346e-010
	Radius          8.2725
	InertiaMoment   0.399139

	Obliquity       -13.4157
	EqAscendNode    -30.9877
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.838 0.785 0.761)

	Surface
	{
		SurfStyle       0.239842
		OceanStyle      0.923632
		Randomize      (0.951, 0.411, 0.966)
		colorDistMagn   0.496027
		colorDistFreq   0.0200602
		detailScale     225.894
		colorConversion true
		snowLevel       2
		tropicLatitude  0.435847
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.422977
		terraceProb     0.214422
		erosion         0
		montesMagn      0.47124
		montesFreq      2.41993
		montesSpiky     0.903684
		montesFraction  0.446376
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.158553
		hillsFraction   0.482074
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218647
		craterFreq      0.218308
		craterDensity   0.865562
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.494133
		volcanoTemp     1834.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.335, 0.314, 0.304, 0.000)
		colorShelf     (0.356, 0.334, 0.323, 0.000)
		colorBeach     (0.377, 0.353, 0.342, 0.000)
		colorDesert    (0.398, 0.373, 0.362, 0.000)
		colorLowland   (0.419, 0.393, 0.381, 0.000)
		colorUpland    (0.440, 0.412, 0.400, 0.000)
		colorRock      (0.461, 0.432, 0.419, 0.000)
		colorSnow      (0.482, 0.451, 0.438, 1.000)
		BumpHeight      7.44525
		BumpOffset      1.48905
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00905907
		Period          0.107798
		Eccentricity    0.293616
		Inclination     -13.4157
		AscendingNode   -30.9877
		ArgOfPericenter -122.367
		MeanAnomaly     -12.9149
	}
}

DwarfMoon	"Adinai D6"
{
	ParentBody     "Lianna System 6"
	Class	       "Asteroid"

	Mass            2.36599e-010
	Radius          9.00257
	InertiaMoment   0.395217

	RotationPeriod  2102.24
	Obliquity       3.94543
	EqAscendNode    11.3943
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.524 0.518 0.515)

	Surface
	{
		SurfStyle       0.856624
		OceanStyle      0.934218
		Randomize      (0.847, -0.796, -0.093)
		colorDistMagn   0.26281
		colorDistFreq   0.0624374
		detailScale     245.83
		colorConversion true
		snowLevel       2
		tropicLatitude  0.136612
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.278937
		terraceProb     0.306002
		erosion         0
		montesMagn      0.558437
		montesFreq      3.02135
		montesSpiky     0.987425
		montesFraction  0.683758
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.156467
		hillsFraction   0.707128
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249065
		craterFreq      0.24313
		craterDensity   0.876086
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.447924
		volcanoTemp     1544.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.178, 0.181, 0.206, 0.050)
		colorShelf     (0.210, 0.212, 0.237, 0.040)
		colorBeach     (0.241, 0.243, 0.268, 0.030)
		colorDesert    (0.273, 0.275, 0.304, 0.020)
		colorLowland   (0.304, 0.306, 0.335, 0.030)
		colorUpland    (0.335, 0.337, 0.366, 0.050)
		colorRock      (0.367, 0.368, 0.407, 0.020)
		colorSnow      (0.367, 0.368, 0.407, 1.000)
		BumpHeight      8.10231
		BumpOffset      1.62046
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0097256
		Period          0.119911
		Eccentricity    0.456333
		Inclination     3.94543
		AscendingNode   11.3943
		ArgOfPericenter -45.2301
		MeanAnomaly     18.7798
	}
}

Moon	"Adinai 2"
{
	ParentBody     "Lianna System 6"
	Class	       "IceWorld"

	Mass            0.000142654
	Radius          433.731
	InertiaMoment   0.399915

	RotationPeriod  5429.58
	Obliquity       77.2326
	EqAscendNode    71.2353
	Precession      0

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.471 0.467 0.461)

	Surface
	{
		SurfStyle       0.694592
		OceanStyle      0.05189
		Randomize      (-0.176, -0.971, 0.948)
		colorDistMagn   0.049203
		colorDistFreq   46.7441
		detailScale     1115.58
		colorConversion true
		drivenDarkening 0.208479
		seaLevel        0.239572
		snowLevel       2
		tropicLatitude  0.966376
		icecapLatitude  1
		icecapHeight    0.239572
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.87586
		venusFreq       0.386463
		venusMagn       0
		mareFreq        0
		mareDensity     0.000182406
		terraceProb     0.401504
		erosion         0
		montesMagn      0.0481791
		montesFreq      24.2069
		montesSpiky     0.890159
		montesFraction  0.693873
		dunesMagn       0.0532231
		dunesFreq       555.854
		dunesFraction   0.85931
		hillsMagn       0.125925
		hillsFreq       45.3977
		hillsFraction   0.51695
		hills2Fraction  0.115602
		riversMagn      52.8813
		riversFreq      2.80888
		riversSin       6.11603
		riversOctaves   0
		canyonsMagn     0.551678
		canyonsFreq     0.145738
		canyonFraction  0
		cracksMagn      0.0527093
		cracksFreq      0.215918
		cracksOctaves   0
		craterMagn      0.599311
		craterFreq      1.2302
		craterDensity   0.944177
		craterOctaves   9
		craterRayedFactor 0
		volcanoMagn     0.20214
		volcanoFreq     0.852592
		volcanoDensity  0.169644
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.1277
		volcanoRadius   0.139542
		volcanoTemp     1160.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.302, 0.299, 0.309, 0.250)
		colorShelf     (0.330, 0.341, 0.350, 0.250)
		colorBeach     (0.269, 0.252, 0.267, 0.200)
		colorDesert    (0.250, 0.229, 0.235, 0.200)
		colorLowland   (0.184, 0.177, 0.194, 0.200)
		colorUpland    (0.349, 0.345, 0.350, 0.250)
		colorRock      (0.640, 0.630, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.184, 0.177, 0.194, 0.200)
		colorUpPlants  (0.349, 0.345, 0.350, 0.250)
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
		SemiMajorAxis   0.0099391
		Period          0.123881
		Eccentricity    0.188005
		Inclination     77.2326
		AscendingNode   71.2353
		ArgOfPericenter -32.1911
		MeanAnomaly     -151.728
	}
}

// http://starwars.wikia.com/wiki/Niddion
DwarfPlanet	"Niddion/Lianna System 7"
{
	ParentBody     "Lianna System"
	Class	       "IceWorld"

	Mass            0.00807953
	Radius          1648.55
	InertiaMoment   0.384333

	Obliquity       -1.00691
	EqAscendNode    -127.405
	Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.433 0.428 0.425)

	Surface
	{
		SurfStyle       0.885154
		OceanStyle      0.649173
		Randomize      (0.878, 0.818, -0.691)
		colorDistMagn   0.0669321
		colorDistFreq   203.924
		detailScale     4240.17
		colorConversion true
		drivenDarkening 0
		seaLevel        0.152605
		snowLevel       2
		tropicLatitude  0.015571
		icecapLatitude  0.920673
		icecapHeight    0.156822
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.91652
		venusFreq       0.869855
		venusMagn       0
		mareFreq        0.778062
		mareDensity     0.00257855
		terraceProb     0.109992
		erosion         0
		montesMagn      0.0706104
		montesFreq      63.7018
		montesSpiky     0.923533
		montesFraction  0.214041
		dunesMagn       0.0311959
		dunesFreq       2167.48
		dunesFraction   0.488995
		hillsMagn       0.125289
		hillsFreq       216.663
		hillsFraction   0.324059
		hills2Fraction  0.191517
		riversMagn      62.6432
		riversFreq      3.85136
		riversSin       4.16012
		riversOctaves   0
		canyonsMagn     0.504692
		canyonsFreq     0.575304
		canyonFraction  0
		cracksMagn      0.0214069
		cracksFreq      0.906851
		cracksOctaves   1
		craterMagn      0.582369
		craterFreq      3.68488
		craterDensity   0.927533
		craterOctaves   11
		craterRayedFactor 0.230386
		volcanoMagn     0.206546
		volcanoFreq     0.835467
		volcanoDensity  0.166545
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.208816
		volcanoRadius   0.160135
		volcanoTemp     1429.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.433, 0.321, 0.244, 0.000)
		colorShelf     (0.411, 0.305, 0.231, 0.000)
		colorBeach     (0.216, 0.160, 0.122, 0.000)
		colorDesert    (0.368, 0.273, 0.207, 0.000)
		colorLowland   (0.350, 0.282, 0.231, 0.000)
		colorUpland    (0.402, 0.298, 0.227, 0.000)
		colorRock      (1.000, 1.000, 1.000, 0.500)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.350, 0.282, 0.231, 0.000)
		colorUpPlants  (0.402, 0.298, 0.227, 0.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.999992
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
		Height          123.641
		Density         7.95297e-007
		Pressure        9.84445e-008
		Greenhouse      0.0042599
		Bright          0.955225
		Opacity         0
		SkyLight        0.318408
		Hue             -0.0469916
		Saturation      1

		Composition
		{
			N2    	97.1503
			Ne    	2.84562
			CO    	0.00231304
			Ar    	0.00176334
			O2    	3.22349e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.43162
		Period          5.02427
		Eccentricity    0.0315289
		Inclination     -2.62262
		AscendingNode   -120.09
		ArgOfPericenter 139.609
		MeanAnomaly     356.205
	}
}