// http://starwars.wikia.com/wiki/Crait
// Region : Outer Rim
// Sector : Grumani Sector
// Grid location : N17
// X : 3720.76, Y : -11167.14, Z : 29.548364395964313

// TODO surface/atmosphere
Planet	"Crait/Crait System 5"
{
	ParentBody     "Crait System"
	Class	       "Desert"

	Mass            0.8
	Radius          3381.18
	InertiaMoment   0.329844
	
	Oblateness      0.00210191

	RotationPeriod  27 // According to wookieepedia
	Obliquity       -1.61711
	EqAscendNode    154.712
	TidalLocked     false

	Brightness      3.5
	Color         ( 0.745 0.718 0.655 )
	Albedo          0.64
	
	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Terrestrial"
		Panspermia "false"
	}

	Surface
	{
		DiffMap        "Europa/Surface-BJ"
		DiffTileSize    256
		BumpMap        "Europa/Bump-BJ-SE"
		BumpTileSize    256
		GlowTileSize    256
		BumpHeight      2
		BumpOffset      1
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		SpecularPower   30
		Hapke           0.5
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Clouds
	{
		Height          15.5298
		Velocity        95.2383
		BumpHeight      5.52964
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        3
		mainOctaves     16
		Coverage        0.15873
		stripeZones     0
		stripeFluct     1.55556
		stripeTwist     12.6984
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          74.1252
		Density         1e+006
		Pressure        1
		Greenhouse      95.2381
		Bright          14.4444
		Opacity         1
		SkyLight        1.5873
		Hue             -0.0216387
		Saturation      1

		Composition
		{
			N2    	78.951
			O2    	20.7233
			CO2   	0.258892
			H2O   	0.0497247
			Ne    	0.0170738
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.383335
		Period          1.437371 // According to wookieepedia
		Eccentricity    0.0508145
		Inclination     -1.61711
		AscendingNode   154.712
		ArgOfPericenter 57.4058
		MeanAnomaly     99.2423
	}
}

///////////////
// GENERATED //
///////////////

/*Star	"Crait System"
{
	ParentBody     "Crait System"
	Class	       "M0 V"
	Luminosity      0.0539511
	MassSol         0.564937
	RadSol          0.73939
	Teff            3850

	Age             4.22762

	InertiaMoment   0.0439866

	RotationPeriod  375.534
	Obliquity       161.592
	EqAscendNode    299.965

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (1.000 0.610 0.334)

	Surface
	{
		Randomize      (-0.244, -0.954, 0.508)
		colorDistMagn   0.391566
		colorDistFreq   9.30819
		detailScale     1.32362e+006
		colorConversion true
		tropicLatitude  0.518
		icecapLatitude  1.012
		mareFreq        31.4539
		mareDensity     0.0135596
		erosion         1
		montesFreq      537
		dunesMagn       0.515711
		hillsMagn       0.03
		hillsFreq       3311.18
		craterOctaves   0
		BumpHeight      589.305
		BumpOffset      589.305
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
		Height          5146.16
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
		Radius      2.63114e+006
		Period      0.0319207
		Brightness  0.5
		RayDensity  2.81404
		RayCurv     12.5433
	}

	NoCometTail     true

	Orbit
	{
		RefPlane        "Static"
		SemiMajorAxis   0
		Period          0
		Eccentricity    0
		Inclination     161.592
		AscendingNode   299.965
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}*/

Planet	"Crait System 1"
{
	ParentBody     "Crait System"
	Class	       "Desert"

	Mass            3.25869
	Radius          9899.76
	InertiaMoment   0.330619

	RotationPeriod  213.516
	Obliquity       -1.76015
	EqAscendNode    -59.9112

	AlbedoBond      0.388249
	AlbedoGeom      0.465899
	Brightness      2
	Color          (0.659 0.571 0.488)

	Surface
	{
		SurfStyle       0.0148746
		OceanStyle      0.375548
		Randomize      (-0.115, 0.793, 0.090)
		colorDistMagn   0.0520967
		colorDistFreq   1173.07
		detailScale     25462.7
		colorConversion true
		seaLevel        0.0951923
		snowLevel       2
		tropicLatitude  0.053206
		icecapLatitude  10
		icecapHeight    0.127591
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        0.868612
		venusFreq       1.14975
		venusMagn       0
		mareFreq        2.1534
		mareDensity     0.20739
		terraceProb     0.273373
		erosion         0
		montesMagn      0.162814
		montesFreq      486.833
		montesSpiky     0.812039
		montesFraction  0.745865
		dunesMagn       0.0260046
		dunesFreq       93.2088
		dunesFraction   0.782513
		hillsMagn       0.107427
		hillsFreq       1151.37
		hillsFraction   0
		hills2Fraction  0
		riversMagn      62.6539
		riversFreq      2.27481
		riversSin       6.08355
		riversOctaves   0
		canyonsMagn     0.0572787
		canyonsFreq     233.308
		canyonFraction  0
		cracksMagn      0.111142
		cracksFreq      0.607205
		cracksOctaves   0
		craterMagn      0.629852
		craterFreq      27.6906
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.747998
		volcanoFreq     0.712508
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.811684
		volcanoRadius   0.527011
		volcanoTemp     1242.46
		lavaCoverTidal  0.554109
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.75574
		stripeTwist     0.754737
		cycloneMagn     2.87378
		cycloneFreq     0.576423
		cycloneDensity  0.459448
		cycloneOctaves  2
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
		BumpHeight      17.1965
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
		Height          106.585
		Velocity        143.94
		BumpHeight      6.78253
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.955428
		mainOctaves     10
		Coverage        0.376498
		stripeZones     1.75574
		stripeTwist     0.754737
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          333.022
		Density         9.35379
		Pressure        36.4983
		Greenhouse      461.209
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.0292517
		Saturation      0.687008

		Composition
		{
			H2O   	76.35
			CO2   	23.217
			SO2   	0.424801
			N2    	0.00700274
			CO    	0.00115234
			Ne    	1.56474e-005
		}
	}

	Aurora
	{
		Height      167.729
		NorthLat    59.6222
		NorthLon    105.771
		NorthRadius 2109.08
		NorthWidth  694.621
		NorthRings  3
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -24.0711
		SouthLon    284.736
		SouthRadius 2845.26
		SouthWidth  911.44
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
		SemiMajorAxis   0.0437594
		Period          0.0121788
		Eccentricity    0.0933734
		Inclination     -1.76015
		AscendingNode   -59.9112
		ArgOfPericenter 155.943
		MeanAnomaly     8.77833
	}
}

DwarfMoon	"Crait System 1.D1"
{
	ParentBody     "Crait System 1"
	Class	       "Asteroid"

	Mass            6.10413e-006
	Radius          139.979
	InertiaMoment   0.397977

	Oblateness      0.249

	Obliquity       -0.00589184
	EqAscendNode    39.813
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.785 0.718 0.663)

	Surface
	{
		SurfStyle       0.103866
		OceanStyle      0.698966
		Randomize      (-0.491, -0.625, -0.152)
		colorDistMagn   0.362676
		colorDistFreq   4.24138
		detailScale     3822.37
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.610486
		terraceProb     0.419402
		erosion         0
		montesMagn      0.515799
		montesFreq      3.05961
		montesSpiky     0.976892
		montesFraction  0.672701
		dunesFraction   0
		hillsMagn       0
		hillsFreq       48.3453
		hillsFraction   0.805339
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.18834
		craterFreq      0.587096
		craterDensity   0.707757
		craterOctaves   16
		volcanoActivity 0.106246
		volcanoFlows    0
		volcanoRadius   0.518436
		volcanoTemp     1818.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.314, 0.287, 0.265, 0.000)
		colorShelf     (0.334, 0.305, 0.282, 0.000)
		colorBeach     (0.353, 0.323, 0.298, 0.000)
		colorDesert    (0.373, 0.341, 0.315, 0.000)
		colorLowland   (0.392, 0.359, 0.331, 0.000)
		colorUpland    (0.412, 0.377, 0.348, 0.000)
		colorRock      (0.432, 0.395, 0.364, 0.000)
		colorSnow      (0.451, 0.413, 0.381, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000100114
		Period          0.00032092
		Eccentricity    8.69989e-005
		Inclination     -0.00589184
		AscendingNode   39.813
		ArgOfPericenter -103.695
		MeanAnomaly     -46.6169
	}
}

Planet	"Crait System 2"
{
	ParentBody     "Crait System"
	Class	       "GasGiant"

	Mass            2597.09
	Radius          74701.2
	InertiaMoment   0.259916

	Obliquity       -1.80348
	EqAscendNode    -64.3851
	TidalLocked     true

	AlbedoBond      0.497629
	AlbedoGeom      0.597154
	Brightness      2
	Color          (0.668 0.487 0.355)

	Surface
	{
		SurfStyle       0.216452
		Randomize      (-0.394, 0.474, 0.741)
		detailScale     192136
		colorConversion true
		tropicLatitude  0.0532474
		icecapLatitude  0.953247
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0.47534
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     7.58681
		stripeFluct     0.341154
		stripeTwist     8.46358
		cycloneMagn     17.6657
		cycloneFreq     1.02878
		cycloneDensity  0.340916
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
		BumpHeight      4.59642
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          14.1406
		Velocity        697.487
		BumpHeight      9.54036
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.22555
		mainOctaves     12
		Coverage        0.476286
		stripeZones     7.58681
		stripeFluct     0.341154
		stripeTwist     8.46358
	}

	Clouds
	{
		Height          23.6797
		Velocity        660.529
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		ModulateColor  (1.000 1.000 1.000 0.195)
		mainFreq        1.22555
		mainOctaves     12
		Coverage        0.476286
		stripeZones     7.58681
		stripeFluct     0.341154
		stripeTwist     8.46358
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          100
		Density         5382.95
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.0124682
		Saturation      0.580286

		Composition
		{
			H2    	92.7636
			He    	6.8846
			CH4   	0.279573
			N2    	0.0359388
			NH3   	0.0222309
			O2    	0.00675191
			C2H2  	0.00334648
			C2H4  	0.00119801
			Ne    	0.00115101
			Ar    	0.000697307
			C2H6  	0.000541771
			C3H8  	0.000312767
		}
	}

	Aurora
	{
		Height      3068.51
		NorthLat    81.164
		NorthLon    58.4297
		NorthRadius 14080.9
		NorthWidth  8691.02
		NorthRings  4
		NorthBright 1
		NorthParticles 10000
		SouthLat    -80.1516
		SouthLon    245.198
		SouthRadius 20657.5
		SouthWidth  14201.8
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
		SemiMajorAxis   0.0705708
		Period          0.0247727
		Eccentricity    0.0477542
		Inclination     -1.80348
		AscendingNode   -64.3851
		ArgOfPericenter 288.446
		MeanAnomaly     83.9227
	}
}

DwarfMoon	"Crait System 2.D1"
{
	ParentBody     "Crait System 2"
	Class	       "Asteroid"

	Mass            1.13036e-009
	Radius          14.4046
	InertiaMoment   0.396709

	Oblateness      0.249

	Obliquity       -0.00543513
	EqAscendNode    94.1499
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.704 0.583 0.541)

	Surface
	{
		SurfStyle       0.336445
		OceanStyle      0.75356
		Randomize      (0.517, -0.834, 0.089)
		colorDistMagn   0.446232
		colorDistFreq   0.116312
		detailScale     393.342
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.530152
		terraceProb     0.27727
		erosion         0
		montesMagn      0.506706
		montesFreq      3.24825
		montesSpiky     0.91436
		montesFraction  0.93475
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.492575
		hillsFraction   0.637967
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218214
		craterFreq      0.20195
		craterDensity   0.753327
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.577595
		volcanoTemp     1628.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.282, 0.233, 0.217, 0.000)
		colorShelf     (0.299, 0.248, 0.230, 0.000)
		colorBeach     (0.317, 0.262, 0.244, 0.000)
		colorDesert    (0.335, 0.277, 0.257, 0.000)
		colorLowland   (0.352, 0.292, 0.271, 0.000)
		colorUpland    (0.370, 0.306, 0.284, 0.000)
		colorRock      (0.387, 0.321, 0.298, 0.000)
		colorSnow      (0.405, 0.335, 0.311, 1.000)
		BumpHeight      12.9641
		BumpOffset      2.59283
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00190493
		Period          0.00094353
		Eccentricity    2.5246e-005
		Inclination     -0.00543513
		AscendingNode   94.1499
		ArgOfPericenter 61.688
		MeanAnomaly     165.53
	}
}

DwarfMoon	"Crait System 2.D2"
{
	ParentBody     "Crait System 2"
	Class	       "Asteroid"

	Mass            1.61154e-009
	Radius          8.19296
	InertiaMoment   0.398489

	Oblateness      0.0287724

	Obliquity       -0.00757266
	EqAscendNode    56.3229
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.553 0.549 0.547)

	Surface
	{
		SurfStyle       0.0475799
		OceanStyle      0.218161
		Randomize      (-0.458, -0.782, -0.393)
		colorDistMagn   0.302762
		colorDistFreq   0.0401328
		detailScale     223.723
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.424335
		terraceProb     0.573981
		erosion         0
		montesMagn      0.571465
		montesFreq      3.49114
		montesSpiky     0.891494
		montesFraction  0.538931
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.18602
		hillsFraction   0.376366
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246444
		craterFreq      0.258923
		craterDensity   0.781606
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.428021
		volcanoTemp     1131.14
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.221, 0.219, 0.219, 0.000)
		colorShelf     (0.235, 0.233, 0.232, 0.000)
		colorBeach     (0.249, 0.247, 0.246, 0.000)
		colorDesert    (0.263, 0.261, 0.260, 0.000)
		colorLowland   (0.277, 0.274, 0.273, 0.000)
		colorUpland    (0.290, 0.288, 0.287, 0.000)
		colorRock      (0.304, 0.302, 0.301, 0.000)
		colorSnow      (0.318, 0.316, 0.314, 1.000)
		BumpHeight      7.37367
		BumpOffset      1.47473
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00224955
		Period          0.00121082
		Eccentricity    8.65755e-005
		Inclination     -0.00757266
		AscendingNode   56.3229
		ArgOfPericenter 99.3217
		MeanAnomaly     -169.558
	}
}

DwarfMoon	"Crait System 2.D3"
{
	ParentBody     "Crait System 2"
	Class	       "Asteroid"

	Mass            2.2725e-009
	Radius          11.5146
	InertiaMoment   0.399493

	Oblateness      0.0570446

	Obliquity       -15.7748
	EqAscendNode    -123.883
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.414 0.411 0.409)

	Surface
	{
		SurfStyle       0.482124
		OceanStyle      0.87772
		Randomize      (-0.295, 0.836, 0.571)
		colorDistMagn   0.733451
		colorDistFreq   0.0730846
		detailScale     314.426
		colorConversion true
		snowLevel       2
		tropicLatitude  0.253651
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.565041
		terraceProb     0.235153
		erosion         0
		montesMagn      0.669899
		montesFreq      3.63405
		montesSpiky     0.887963
		montesFraction  0.44982
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.341624
		hillsFraction   0.492694
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.202775
		craterFreq      0.141578
		craterDensity   0.98719
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.472763
		volcanoTemp     1767.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.165, 0.164, 0.163, 0.000)
		colorShelf     (0.176, 0.175, 0.174, 0.000)
		colorBeach     (0.186, 0.185, 0.184, 0.000)
		colorDesert    (0.197, 0.195, 0.194, 0.000)
		colorLowland   (0.207, 0.205, 0.204, 0.000)
		colorUpland    (0.217, 0.216, 0.215, 0.000)
		colorRock      (0.228, 0.226, 0.225, 0.000)
		colorSnow      (0.238, 0.236, 0.235, 1.000)
		BumpHeight      10.3631
		BumpOffset      2.07263
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00224706
		Period          0.00120881
		Eccentricity    0.24217
		Inclination     -15.7748
		AscendingNode   -123.883
		ArgOfPericenter -37.8328
		MeanAnomaly     17.4531
	}
}

DwarfMoon	"Crait System 2.D4"
{
	ParentBody     "Crait System 2"
	Class	       "Asteroid"

	Mass            3.17538e-009
	Radius          21.2964
	InertiaMoment   0.397119

	Oblateness      0.16755

	Obliquity       24.8467
	EqAscendNode    161.265
	TidalLocked     false

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.575 0.568 0.563)

	Surface
	{
		SurfStyle       0.441617
		OceanStyle      0.561638
		Randomize      (-0.432, -0.398, 0.030)
		colorDistMagn   0.570655
		colorDistFreq   0.186599
		detailScale     581.534
		colorConversion true
		snowLevel       2
		tropicLatitude  0.136465
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.704306
		terraceProb     0.156707
		erosion         0
		montesMagn      0.441045
		montesFreq      3.16041
		montesSpiky     0.941934
		montesFraction  0.338803
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.92734
		hillsFraction   0.766304
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246732
		craterFreq      0.172299
		craterDensity   0.952973
		craterOctaves   13
		volcanoActivity 0.000365491
		volcanoFlows    0
		volcanoRadius   0.627011
		volcanoTemp     1261.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.230, 0.227, 0.225, 0.000)
		colorShelf     (0.244, 0.241, 0.239, 0.000)
		colorBeach     (0.259, 0.255, 0.253, 0.000)
		colorDesert    (0.273, 0.270, 0.267, 0.000)
		colorLowland   (0.288, 0.284, 0.282, 0.000)
		colorUpland    (0.302, 0.298, 0.296, 0.000)
		colorRock      (0.316, 0.312, 0.310, 0.000)
		colorSnow      (0.331, 0.326, 0.324, 1.000)
		BumpHeight      19.1668
		BumpOffset      3.83335
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00258807
		Period          0.00149417
		Eccentricity    0.150546
		Inclination     24.8467
		AscendingNode   161.265
		ArgOfPericenter 51.4238
		MeanAnomaly     -126.166
	}
}

DwarfMoon	"Crait System 2.D5"
{
	ParentBody     "Crait System 2"
	Class	       "Asteroid"

	Mass            4.40341e-009
	Radius          12.3532
	InertiaMoment   0.39865

	Oblateness      0.00155954

	RotationPeriod  51.0772
	Obliquity       50.2
	EqAscendNode    -148.981

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.557 0.550 0.546)

	Surface
	{
		SurfStyle       0.246335
		OceanStyle      0.30324
		Randomize      (0.478, -0.570, 0.165)
		colorDistMagn   0.728505
		colorDistFreq   0.0573801
		detailScale     337.325
		colorConversion true
		snowLevel       2
		tropicLatitude  0.402114
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.584872
		terraceProb     0.158324
		erosion         0
		montesMagn      0.47051
		montesFreq      2.78415
		montesSpiky     0.942168
		montesFraction  0.671341
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.4071
		hillsFraction   0.758473
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230923
		craterFreq      0.229795
		craterDensity   0.826622
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.525387
		volcanoTemp     1733.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.223, 0.220, 0.219, 0.000)
		colorShelf     (0.237, 0.234, 0.232, 0.000)
		colorBeach     (0.251, 0.248, 0.246, 0.000)
		colorDesert    (0.265, 0.261, 0.260, 0.000)
		colorLowland   (0.279, 0.275, 0.273, 0.000)
		colorUpland    (0.293, 0.289, 0.287, 0.000)
		colorRock      (0.306, 0.303, 0.301, 0.000)
		colorSnow      (0.320, 0.316, 0.314, 1.000)
		BumpHeight      11.1179
		BumpOffset      2.22358
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00308261
		Period          0.00194229
		Eccentricity    0.492917
		Inclination     50.2
		AscendingNode   -148.981
		ArgOfPericenter 6.214
		MeanAnomaly     -101.089
	}
}

DwarfMoon	"Crait System 2.D6"
{
	ParentBody     "Crait System 2"
	Class	       "Asteroid"

	Mass            6.06838e-009
	Radius          24.2347
	InertiaMoment   0.399621

	Oblateness      0.0227128

	RotationPeriod  31.3853
	Obliquity       -70.0864
	EqAscendNode    29.1253

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.616 0.608 0.605)

	Surface
	{
		SurfStyle       0.649966
		OceanStyle      0.355532
		Randomize      (0.732, 0.604, 0.813)
		colorDistMagn   0.905918
		colorDistFreq   0.230188
		detailScale     661.77
		colorConversion true
		snowLevel       2
		tropicLatitude  0.754583
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.39679
		terraceProb     0.381358
		erosion         0
		montesMagn      0.310332
		montesFreq      3.33383
		montesSpiky     0.831371
		montesFraction  0.750273
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.61626
		hillsFraction   0.658659
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248053
		craterFreq      0.273758
		craterDensity   0.794544
		craterOctaves   13
		volcanoActivity 0.00137611
		volcanoFlows    0
		volcanoRadius   0.552867
		volcanoTemp     1841.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.240, 0.207, 0.169, 0.000)
		colorShelf     (0.246, 0.213, 0.193, 0.000)
		colorBeach     (0.290, 0.249, 0.230, 0.000)
		colorDesert    (0.314, 0.267, 0.224, 0.000)
		colorLowland   (0.345, 0.286, 0.254, 0.000)
		colorUpland    (0.382, 0.346, 0.308, 0.000)
		colorRock      (0.413, 0.377, 0.333, 0.000)
		colorSnow      (0.450, 0.401, 0.351, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00353675
		Period          0.00238694
		Eccentricity    0.341168
		Inclination     -70.0864
		AscendingNode   29.1253
		ArgOfPericenter 152.647
		MeanAnomaly     152.239
	}
}

DwarfMoon	"Crait System 2.D7"
{
	ParentBody     "Crait System 2"
	Class	       "Asteroid"

	Mass            8.32076e-009
	Radius          18.0991
	InertiaMoment   0.397434

	Oblateness      0.00273734

	Obliquity       -74.2188
	EqAscendNode    -23.9827
	TidalLocked     false

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.448 0.445 0.441)

	Surface
	{
		SurfStyle       0.215374
		OceanStyle      0.771152
		Randomize      (0.529, 0.670, 0.883)
		colorDistMagn   0.340492
		colorDistFreq   0.133039
		detailScale     494.226
		colorConversion true
		snowLevel       2
		tropicLatitude  0.635472
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.591484
		terraceProb     0.501985
		erosion         0
		montesMagn      0.464545
		montesFreq      2.63399
		montesSpiky     0.952836
		montesFraction  0.474257
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.805672
		hillsFraction   0.723086
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227873
		craterFreq      0.201203
		craterDensity   0.766457
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.503713
		volcanoTemp     1755.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.179, 0.178, 0.177, 0.000)
		colorShelf     (0.190, 0.189, 0.188, 0.000)
		colorBeach     (0.202, 0.200, 0.199, 0.000)
		colorDesert    (0.213, 0.211, 0.210, 0.000)
		colorLowland   (0.224, 0.222, 0.221, 0.000)
		colorUpland    (0.235, 0.233, 0.232, 0.000)
		colorRock      (0.246, 0.245, 0.243, 0.000)
		colorSnow      (0.258, 0.256, 0.254, 1.000)
		BumpHeight      16.2892
		BumpOffset      3.25784
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00396242
		Period          0.00283059
		Eccentricity    0.0679953
		Inclination     -74.2188
		AscendingNode   -23.9827
		ArgOfPericenter 70.1924
		MeanAnomaly     -8.59316
	}
}

DwarfMoon	"Crait System 2.D8"
{
	ParentBody     "Crait System 2"
	Class	       "Asteroid"

	Mass            1.1364e-008
	Radius          18.1931
	InertiaMoment   0.398803

	RotationPeriod  93.6684
	Obliquity       -21.659
	EqAscendNode    135.968

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.537 0.533 0.527)

	Surface
	{
		SurfStyle       0.448872
		OceanStyle      0.267295
		Randomize      (-0.345, 0.217, -0.375)
		colorDistMagn   0.606808
		colorDistFreq   0.230202
		detailScale     496.794
		colorConversion true
		snowLevel       2
		tropicLatitude  0.274051
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.609811
		terraceProb     0.315266
		erosion         0
		montesMagn      0.393228
		montesFreq      3.67273
		montesSpiky     0.833776
		montesFraction  0.715402
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.852663
		hillsFraction   0.641936
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23201
		craterFreq      0.200826
		craterDensity   0.932111
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.478413
		volcanoTemp     1443.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.215, 0.213, 0.211, 0.000)
		colorShelf     (0.228, 0.226, 0.224, 0.000)
		colorBeach     (0.241, 0.240, 0.237, 0.000)
		colorDesert    (0.255, 0.253, 0.250, 0.000)
		colorLowland   (0.268, 0.266, 0.264, 0.000)
		colorUpland    (0.282, 0.280, 0.277, 0.000)
		colorRock      (0.295, 0.293, 0.290, 0.000)
		colorSnow      (0.308, 0.306, 0.303, 1.000)
		BumpHeight      16.3738
		BumpOffset      3.27477
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00461844
		Period          0.00356188
		Eccentricity    0.23411
		Inclination     -21.659
		AscendingNode   135.968
		ArgOfPericenter 111.555
		MeanAnomaly     -115.182
	}
}

DwarfMoon	"Crait System 2.D9"
{
	ParentBody     "Crait System 2"
	Class	       "Asteroid"

	Mass            1.54741e-008
	Radius          34.8504
	InertiaMoment   0.399747

	Oblateness      0.0096353

	RotationPeriod  52.0497
	Obliquity       -26.9017
	EqAscendNode    144.156

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.792 0.791 0.790)

	Surface
	{
		SurfStyle       0.6671
		OceanStyle      0.156222
		Randomize      (0.957, -0.297, -0.773)
		colorDistMagn   0.46372
		colorDistFreq   1.02256
		detailScale     951.648
		colorConversion true
		snowLevel       2
		tropicLatitude  0.275752
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.544963
		terraceProb     0.184314
		erosion         0
		montesMagn      0.449314
		montesFreq      2.7238
		montesSpiky     0.891671
		montesFraction  0.309552
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.41408
		hillsFraction   0.731205
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236162
		craterFreq      0.237759
		craterDensity   0.948281
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.567199
		volcanoTemp     1740.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.309, 0.269, 0.221, 0.000)
		colorShelf     (0.317, 0.277, 0.253, 0.000)
		colorBeach     (0.372, 0.324, 0.300, 0.000)
		colorDesert    (0.404, 0.348, 0.292, 0.000)
		colorLowland   (0.444, 0.372, 0.332, 0.000)
		colorUpland    (0.491, 0.451, 0.403, 0.000)
		colorRock      (0.531, 0.490, 0.434, 0.000)
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
		SemiMajorAxis   0.00495525
		Period          0.00395853
		Eccentricity    0.148497
		Inclination     -26.9017
		AscendingNode   144.156
		ArgOfPericenter 101.904
		MeanAnomaly     -108.41
	}
}

DwarfMoon	"Crait System 2.D10"
{
	ParentBody     "Crait System 2"
	Class	       "Asteroid"

	Mass            2.10279e-008
	Radius          19.722
	InertiaMoment   0.397696

	RotationPeriod  78.65
	Obliquity       -42.0116
	EqAscendNode    85.4954

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.622 0.618 0.611)

	Surface
	{
		SurfStyle       0.793551
		OceanStyle      0.136113
		Randomize      (-0.585, 0.892, -0.567)
		colorDistMagn   0.682684
		colorDistFreq   0.245439
		detailScale     538.542
		colorConversion true
		snowLevel       2
		tropicLatitude  0.856056
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.329117
		terraceProb     0.295804
		erosion         0
		montesMagn      0.422181
		montesFreq      3.49041
		montesSpiky     0.984895
		montesFraction  0.42766
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.71229
		hillsFraction   0.721265
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245259
		craterFreq      0.219867
		craterDensity   1.03938
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.518459
		volcanoTemp     1389.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.243, 0.210, 0.171, 0.000)
		colorShelf     (0.249, 0.216, 0.196, 0.000)
		colorBeach     (0.293, 0.254, 0.232, 0.000)
		colorDesert    (0.317, 0.272, 0.226, 0.000)
		colorLowland   (0.349, 0.291, 0.257, 0.000)
		colorUpland    (0.386, 0.352, 0.312, 0.000)
		colorRock      (0.417, 0.383, 0.336, 0.000)
		colorSnow      (0.454, 0.408, 0.355, 1.000)
		BumpHeight      17.7498
		BumpOffset      3.54996
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00538634
		Period          0.00448618
		Eccentricity    0.0960384
		Inclination     -42.0116
		AscendingNode   85.4954
		ArgOfPericenter -6.83894
		MeanAnomaly     -78.8003
	}
}

DwarfPlanet	"Crait System 3"
{
	ParentBody     "Crait System"
	Class	       "Selena"

	Mass            0.00605411
	Radius          1084.23
	InertiaMoment   0.383451

	Obliquity       0.498136
	EqAscendNode    85.6966
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.767 0.690 0.593)

	Surface
	{
		SurfStyle       0.416235
		OceanStyle      0.417027
		Randomize      (0.860, -0.905, 0.058)
		colorDistMagn   0.0691726
		colorDistFreq   115.466
		detailScale     2788.71
		colorConversion true
		drivenDarkening 0
		seaLevel        0.241182
		snowLevel       2
		tropicLatitude  0.0127466
		icecapLatitude  10
		icecapHeight    0.215858
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.72308
		venusFreq       0.840548
		venusMagn       0
		mareFreq        0.346825
		mareDensity     0.00714053
		terraceProb     0.212017
		erosion         0
		montesMagn      0.066455
		montesFreq      42.9999
		montesSpiky     0.958005
		montesFraction  0.980176
		dunesMagn       0.0398139
		dunesFreq       1413.34
		dunesFraction   0.842713
		hillsMagn       0.102311
		hillsFreq       143.643
		hillsFraction   0.610311
		hills2Fraction  0
		riversMagn      63.603
		riversFreq      1.9277
		riversSin       5.81515
		riversOctaves   0
		canyonsMagn     0.446334
		canyonsFreq     0.361184
		canyonFraction  0.260544
		cracksMagn      0.0460932
		cracksFreq      0.296749
		cracksOctaves   0
		craterMagn      0.602762
		craterFreq      2.39066
		craterDensity   0.966665
		craterOctaves   10
		craterRayedFactor 0.134139
		volcanoMagn     0.158401
		volcanoFreq     0.752297
		volcanoDensity  0.213074
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.355449
		volcanoRadius   0.134221
		volcanoTemp     1206.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.420, 0.420, 0.430, 0.000)
		colorShelf     (0.470, 0.480, 0.480, 0.000)
		colorBeach     (0.422, 0.393, 0.356, 0.000)
		colorDesert    (0.368, 0.317, 0.273, 0.000)
		colorLowland   (0.468, 0.421, 0.332, 0.000)
		colorUpland    (0.499, 0.448, 0.362, 0.000)
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
		SemiMajorAxis   0.137831
		Period          0.0680803
		Eccentricity    0.0112007
		Inclination     2.69499
		AscendingNode   85.0317
		ArgOfPericenter 296.07
		MeanAnomaly     166.915
	}
}

Planet	"Crait System 4"
{
	ParentBody     "Crait System"
	Class	       "IceGiant"

	Mass            46.7745
	Radius          28066.6
	InertiaMoment   0.206629

	RotationPeriod  3507
	Obliquity       0.92954
	EqAscendNode    -71.9551

	AlbedoBond      0.518711
	AlbedoGeom      0.622453
	Brightness      2

	Surface
	{
		SurfStyle       0.463006
		Randomize      (-0.051, -0.268, -0.322)
		detailScale     72188.8
		colorConversion true
		tropicLatitude  0.0262539
		icecapLatitude  0.926254
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     4.10678
		stripeFluct     0.414583
		stripeTwist     9.118
		cycloneMagn     17.0895
		cycloneFreq     0.981794
		cycloneDensity  0.37809
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
		BumpHeight      12.8683
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          119.986
		Velocity        1234.97
		BumpHeight      56.8151
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.917832
		mainOctaves     12
		Coverage        0.593554
		stripeZones     4.10678
		stripeFluct     0.414583
		stripeTwist     9.118
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          280.666
		Density         5437.5
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.049708
		Saturation      0.58042

		Composition
		{
			H2    	92.333
			He    	7.21132
			CH4   	0.367404
			N2    	0.044619
			NH3   	0.0282252
			O2    	0.00741002
			C2H2  	0.00371318
			C2H4  	0.00125069
			Ne    	0.00107626
			Ar    	0.000919666
			C2H6  	0.000685994
			C3H8  	0.000327999
		}
	}

	NoAurora        true

	Rings
	{
		InnerRadius     31379.5
		OuterRadius     61352.6
		RotationPeriod  4.04463
		RotationOffset  0
		FrontBright     0.712237
		BackBright      0.905478
		Density         0.932258
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.24367
		Period          0.160011
		Eccentricity    0.0526722
		Inclination     0.92954
		AscendingNode   -71.9551
		ArgOfPericenter 299.029
		MeanAnomaly     282.89
	}
}

DwarfMoon	"Crait System 4.D1"
{
	ParentBody     "Crait System 4"
	Class	       "Asteroid"

	Mass            3.10188e-011
	Radius          2.27026
	InertiaMoment   0.398573

	Oblateness      0.119198

	Obliquity       -0.0101177
	EqAscendNode    52.9815
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.571 0.567 0.560)

	Surface
	{
		SurfStyle       0.99975
		OceanStyle      0.505479
		Randomize      (-0.914, -0.790, 0.042)
		colorDistMagn   0.45266
		colorDistFreq   0.00173514
		detailScale     61.9932
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.412667
		terraceProb     0.40805
		erosion         0
		montesMagn      0.436273
		montesFreq      2.94126
		montesSpiky     0.984906
		montesFraction  0.658724
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0131118
		hillsFraction   0.741177
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246511
		craterFreq      0.217431
		craterDensity   0.987339
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.538251
		volcanoTemp     1558.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.194, 0.199, 0.224, 0.050)
		colorShelf     (0.228, 0.233, 0.258, 0.040)
		colorBeach     (0.263, 0.267, 0.291, 0.030)
		colorDesert    (0.297, 0.301, 0.331, 0.020)
		colorLowland   (0.331, 0.335, 0.364, 0.030)
		colorUpland    (0.365, 0.369, 0.398, 0.050)
		colorRock      (0.400, 0.403, 0.443, 0.020)
		colorSnow      (0.400, 0.403, 0.443, 1.000)
		BumpHeight      2.04323
		BumpOffset      0.408646
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000379656
		Period          0.000625547
		Eccentricity    4.7303e-005
		Inclination     -0.0101177
		AscendingNode   52.9815
		ArgOfPericenter 13.8887
		MeanAnomaly     -25.8405
	}
}

DwarfMoon	"Crait System 4.D2"
{
	ParentBody     "Crait System 4"
	Class	       "Asteroid"

	Mass            5.6093e-011
	Radius          6.36471
	InertiaMoment   0.399559

	Oblateness      0.249

	Obliquity       0.00462931
	EqAscendNode    -23.6767
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.769 0.766 0.763)

	Surface
	{
		SurfStyle       0.714442
		OceanStyle      0.123179
		Randomize      (-0.614, -0.058, -0.943)
		colorDistMagn   0.764586
		colorDistFreq   0.0164759
		detailScale     173.799
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.553234
		terraceProb     0.412425
		erosion         0
		montesMagn      0.570808
		montesFreq      3.10334
		montesSpiky     0.787341
		montesFraction  0.144435
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0783831
		hillsFraction   0.435347
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2442
		craterFreq      0.267723
		craterDensity   0.881157
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.514795
		volcanoTemp     1619.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.300, 0.261, 0.214, 0.000)
		colorShelf     (0.308, 0.268, 0.244, 0.000)
		colorBeach     (0.362, 0.314, 0.290, 0.000)
		colorDesert    (0.392, 0.337, 0.282, 0.000)
		colorLowland   (0.431, 0.360, 0.321, 0.000)
		colorUpland    (0.477, 0.437, 0.389, 0.000)
		colorRock      (0.515, 0.475, 0.420, 0.000)
		colorSnow      (0.562, 0.506, 0.443, 1.000)
		BumpHeight      5.72824
		BumpOffset      1.14565
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000575046
		Period          0.00116608
		Eccentricity    2.13767e-005
		Inclination     0.00462931
		AscendingNode   -23.6767
		ArgOfPericenter 40.7438
		MeanAnomaly     -36.7651
	}
}

DwarfMoon	"Crait System 4.D3"
{
	ParentBody     "Crait System 4"
	Class	       "Asteroid"

	Mass            9.54862e-011
	Radius          3.78622
	InertiaMoment   0.39729

	Obliquity       13.0346
	EqAscendNode    -130.424
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.702 0.700 0.697)

	Surface
	{
		SurfStyle       0.815872
		OceanStyle      0.710294
		Randomize      (-0.698, -0.122, 0.918)
		colorDistMagn   0.0979838
		colorDistFreq   0.0110592
		detailScale     103.389
		colorConversion true
		snowLevel       2
		tropicLatitude  0.188273
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.401097
		terraceProb     0.351546
		erosion         0
		montesMagn      0.469775
		montesFreq      2.76714
		montesSpiky     0.950174
		montesFraction  0.400576
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0338744
		hillsFraction   0.599573
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254491
		craterFreq      0.163782
		craterDensity   0.848657
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.549406
		volcanoTemp     1399.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.274, 0.238, 0.195, 0.000)
		colorShelf     (0.281, 0.245, 0.223, 0.000)
		colorBeach     (0.330, 0.287, 0.265, 0.000)
		colorDesert    (0.358, 0.308, 0.258, 0.000)
		colorLowland   (0.393, 0.329, 0.293, 0.000)
		colorUpland    (0.435, 0.399, 0.356, 0.000)
		colorRock      (0.470, 0.434, 0.384, 0.000)
		colorSnow      (0.512, 0.462, 0.405, 1.000)
		BumpHeight      3.4076
		BumpOffset      0.681519
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00200991
		Period          0.00761972
		Eccentricity    0.0547654
		Inclination     13.0346
		AscendingNode   -130.424
		ArgOfPericenter 175.122
		MeanAnomaly     -51.7511
	}
}

DwarfMoon	"Crait System 4.D4"
{
	ParentBody     "Crait System 4"
	Class	       "Asteroid"

	Mass            1.55324e-010
	Radius          7.60935
	InertiaMoment   0.39873

	Oblateness      0.0043144

	Obliquity       -66.93
	EqAscendNode    -41.9815
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.624 0.619 0.612)

	Surface
	{
		SurfStyle       0.120942
		OceanStyle      0.932716
		Randomize      (0.964, 0.075, 0.956)
		colorDistMagn   0.827968
		colorDistFreq   0.0126253
		detailScale     207.786
		colorConversion true
		snowLevel       2
		tropicLatitude  0.879626
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.419491
		terraceProb     0.263184
		erosion         0
		montesMagn      0.622185
		montesFreq      3.60785
		montesSpiky     0.947858
		montesFraction  0.903789
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.115698
		hillsFraction   0.706778
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229756
		craterFreq      0.235395
		craterDensity   0.847686
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.513734
		volcanoTemp     1219.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.250, 0.248, 0.245, 0.000)
		colorShelf     (0.265, 0.263, 0.260, 0.000)
		colorBeach     (0.281, 0.279, 0.276, 0.000)
		colorDesert    (0.296, 0.294, 0.291, 0.000)
		colorLowland   (0.312, 0.310, 0.306, 0.000)
		colorUpland    (0.328, 0.325, 0.322, 0.000)
		colorRock      (0.343, 0.341, 0.337, 0.000)
		colorSnow      (0.359, 0.356, 0.352, 1.000)
		BumpHeight      6.84842
		BumpOffset      1.36968
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00224902
		Period          0.00901913
		Eccentricity    0.456399
		Inclination     -66.93
		AscendingNode   -41.9815
		ArgOfPericenter 38.2421
		MeanAnomaly     79.7566
	}
}

/*DwarfMoon	"Crait System 5.D1"
{
	ParentBody     "Crait System 5"
	Class	       "Asteroid"

	Mass            5.44984e-009
	Radius          24.5014
	InertiaMoment   0.397984

	Oblateness      0.181985

	Obliquity       -0.00795759
	EqAscendNode    -179.474
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.512 0.436 0.356)

	Surface
	{
		SurfStyle       0.341158
		OceanStyle      0.837049
		Randomize      (-0.138, -0.317, 0.489)
		colorDistMagn   0.819904
		colorDistFreq   0.276415
		detailScale     669.052
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.460805
		terraceProb     0.258902
		erosion         0
		montesMagn      0.491236
		montesFreq      3.51022
		montesSpiky     0.915288
		montesFraction  0.394725
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.50657
		hillsFraction   0.827427
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23094
		craterFreq      0.233556
		craterDensity   0.953379
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.507305
		volcanoTemp     1466.92
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.205, 0.174, 0.142, 0.000)
		colorShelf     (0.218, 0.185, 0.151, 0.000)
		colorBeach     (0.230, 0.196, 0.160, 0.000)
		colorDesert    (0.243, 0.207, 0.169, 0.000)
		colorLowland   (0.256, 0.218, 0.178, 0.000)
		colorUpland    (0.269, 0.229, 0.187, 0.000)
		colorRock      (0.282, 0.240, 0.196, 0.000)
		colorSnow      (0.294, 0.251, 0.205, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   9.67942e-005
		Period          0.00135267
		Eccentricity    7.30078e-005
		Inclination     -0.00795759
		AscendingNode   -179.474
		ArgOfPericenter -111.845
		MeanAnomaly     -172.869
	}
}

DwarfMoon	"Crait System 5.D2"
{
	ParentBody     "Crait System 5"
	Class	       "Asteroid"

	Mass            7.48443e-009
	Radius          26.0338
	InertiaMoment   0.399129

	Oblateness      0.00128467

	Obliquity       40.499
	EqAscendNode    -19.6489
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.647 0.518 0.369)

	Surface
	{
		SurfStyle       0.338432
		OceanStyle      0.276731
		Randomize      (0.364, 0.436, -0.877)
		colorDistMagn   0.892941
		colorDistFreq   0.232624
		detailScale     710.897
		colorConversion true
		snowLevel       2
		tropicLatitude  0.983478
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.434021
		terraceProb     0.351865
		erosion         0
		montesMagn      0.253118
		montesFreq      3.07121
		montesSpiky     0.858401
		montesFraction  0.491955
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.45132
		hillsFraction   0.621197
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.206992
		craterFreq      0.235803
		craterDensity   0.946837
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.511828
		volcanoTemp     1484.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.259, 0.207, 0.147, 0.000)
		colorShelf     (0.275, 0.220, 0.157, 0.000)
		colorBeach     (0.291, 0.233, 0.166, 0.000)
		colorDesert    (0.307, 0.246, 0.175, 0.000)
		colorLowland   (0.324, 0.259, 0.184, 0.000)
		colorUpland    (0.340, 0.272, 0.194, 0.000)
		colorRock      (0.356, 0.285, 0.203, 0.000)
		colorSnow      (0.372, 0.298, 0.212, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000483031
		Period          0.0150792
		Eccentricity    0.156741
		Inclination     40.499
		AscendingNode   -19.6489
		ArgOfPericenter 112.658
		MeanAnomaly     -9.90616
	}
}

DwarfMoon	"Crait System 5.D3"
{
	ParentBody     "Crait System 5"
	Class	       "Asteroid"

	Mass            1.02343e-008
	Radius          34.0647
	InertiaMoment   0.395046

	Obliquity       -48.5573
	EqAscendNode    145.395
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.701 0.557 0.452)

	Surface
	{
		SurfStyle       0.886335
		OceanStyle      0.00957769
		Randomize      (0.341, 0.632, -0.874)
		colorDistMagn   0.515109
		colorDistFreq   0.669717
		detailScale     930.194
		colorConversion true
		snowLevel       2
		tropicLatitude  0.434668
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.545957
		terraceProb     0.178754
		erosion         0
		montesMagn      0.427142
		montesFreq      2.29597
		montesSpiky     0.954648
		montesFraction  0.880632
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.358
		hillsFraction   0.512285
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219104
		craterFreq      0.251038
		craterDensity   0.863429
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.550273
		volcanoTemp     1587.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.238, 0.195, 0.181, 0.050)
		colorShelf     (0.280, 0.228, 0.208, 0.040)
		colorBeach     (0.322, 0.262, 0.235, 0.030)
		colorDesert    (0.364, 0.295, 0.266, 0.020)
		colorLowland   (0.406, 0.329, 0.294, 0.030)
		colorUpland    (0.449, 0.362, 0.321, 0.050)
		colorRock      (0.491, 0.396, 0.357, 0.020)
		colorSnow      (0.491, 0.396, 0.357, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00108686
		Period          0.0508956
		Eccentricity    0.0143449
		Inclination     -48.5573
		AscendingNode   145.395
		ArgOfPericenter -175.719
		MeanAnomaly     -152.597
	}
}*/

Planet	"Crait System 6"
{
	ParentBody     "Crait System"
	Class	       "Desert"

	Mass            0.791113
	Radius          6561.75
	InertiaMoment   0.33094

	Oblateness      0.00745463

	RotationPeriod  18.816
	Obliquity       21.3124
	EqAscendNode    -48.331

	AlbedoBond      0.271189
	AlbedoGeom      0.325427
	Brightness      2
	Color          (0.469 0.402 0.348)

	Surface
	{
		SurfStyle       0.583868
		OceanStyle      0.0931194
		Randomize      (-0.131, -0.564, -0.314)
		colorDistMagn   0.0593848
		colorDistFreq   790.12
		detailScale     16877.2
		colorConversion true
		seaLevel        0.138335
		snowLevel       2
		tropicLatitude  0.34078
		icecapLatitude  0.83698
		icecapHeight    0.145536
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.610817
		venusFreq       0.649784
		venusMagn       0.476693
		mareFreq        1.93415
		mareDensity     0.114479
		terraceProb     0.246054
		erosion         0
		montesMagn      0.233012
		montesFreq      254.774
		montesSpiky     0.941065
		montesFraction  0.87763
		dunesMagn       0.0533894
		dunesFreq       47.7418
		dunesFraction   0.230436
		hillsMagn       0.159164
		hillsFreq       987.069
		hillsFraction   0
		hills2Fraction  0
		riversMagn      64.8593
		riversFreq      3.82295
		riversSin       6.30283
		riversOctaves   0
		canyonsMagn     0.0249178
		canyonsFreq     180.656
		canyonFraction  0
		cracksMagn      0.0810726
		cracksFreq      0.398359
		cracksOctaves   0
		craterMagn      0.568245
		craterFreq      18.1256
		craterDensity   0.336346
		craterOctaves   5.16695
		volcanoMagn     0.690384
		volcanoFreq     0.662697
		volcanoDensity  0.267515
		volcanoOctaves  3
		volcanoActivity 0.521465
		volcanoFlows    0.892901
		volcanoRadius   0.446468
		volcanoTemp     1569.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.93975
		stripeTwist     0
		cycloneMagn     2.74606
		cycloneFreq     0.713124
		cycloneDensity  0.303035
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
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Clouds
	{
		Height          15.8779
		Velocity        86.9979
		BumpHeight      5.71395
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.958977
		mainOctaves     10
		Coverage        0.142378
		stripeZones     1.93975
		stripeTwist     0
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Titan"
		Height          32.8087
		Density         0.188372
		Pressure        0.0642136
		Greenhouse      0.675664
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.0128652
		Saturation      1

		Composition
		{
			CO2   	89.4323
			C2H2  	8.16346
			H2S   	1.28313
			CH4   	0.703441
			C2H4  	0.296887
			C2H6  	0.0877036
			N2    	0.0151178
			C3H8  	0.0148446
			NH3   	0.00197283
			SO2   	0.000833496
			Ne    	0.000139032
			CO    	0.00011337
			Ar    	7.45854e-005
		}
	}

	Aurora
	{
		Height      138.922
		NorthLat    55.9561
		NorthLon    -23.5371
		NorthRadius 1767.01
		NorthWidth  536.466
		NorthRings  4
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -52.7059
		SouthLon    157.397
		SouthRadius 1988.76
		SouthWidth  544.416
		SouthRings  3
		SouthBright 0.3
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	Rings
	{
		InnerRadius     8052.08
		OuterRadius     10343.5
		RotationPeriod  2.74783
		RotationOffset  0
		FrontBright     0.920251
		BackBright      0.797385
		Density         0.529728
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.629382
		Period          0.664311
		Eccentricity    0.0170141
		Inclination     -2.22926
		AscendingNode   -49.213
		ArgOfPericenter 311.822
		MeanAnomaly     351.532
	}
}

DwarfMoon	"Crait System 6.D1"
{
	ParentBody     "Crait System 6"
	Class	       "Asteroid"

	Mass            1.96339e-007
	Radius          87.7425
	InertiaMoment   0.399497

	Oblateness      0.249

	Obliquity       0.00107543
	EqAscendNode    -13.1442
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.735 0.732 0.729)

	Surface
	{
		SurfStyle       0.85382
		OceanStyle      0.698859
		Randomize      (-0.892, 0.745, -0.180)
		colorDistMagn   0.603526
		colorDistFreq   5.81208
		detailScale     2395.96
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.333429
		terraceProb     0.179755
		erosion         0
		montesMagn      0.215901
		montesFreq      2.62279
		montesSpiky     0.944883
		montesFraction  0.111062
		dunesFraction   0
		hillsMagn       0
		hillsFreq       16.6214
		hillsFraction   0.689855
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229803
		craterFreq      0.297115
		craterDensity   0.997056
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.56123
		volcanoTemp     1465.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.250, 0.256, 0.292, 0.050)
		colorShelf     (0.294, 0.300, 0.335, 0.040)
		colorBeach     (0.338, 0.344, 0.379, 0.030)
		colorDesert    (0.382, 0.388, 0.430, 0.020)
		colorLowland   (0.426, 0.432, 0.474, 0.030)
		colorUpland    (0.470, 0.476, 0.518, 0.050)
		colorRock      (0.514, 0.520, 0.576, 0.020)
		colorSnow      (0.514, 0.520, 0.576, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000128626
		Period          0.000948537
		Eccentricity    2.81166e-005
		Inclination     0.00107543
		AscendingNode   -13.1442
		ArgOfPericenter 27.4266
		MeanAnomaly     -53.7488
	}
}

DwarfMoon	"Crait System 6.D2"
{
	ParentBody     "Crait System 6"
	Class	       "Asteroid"

	Mass            2.71462e-007
	Radius          92.8121
	InertiaMoment   0.39713

	Oblateness      0.249

	Obliquity       0.00186506
	EqAscendNode    -62.6784
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.703 0.676 0.625)

	Surface
	{
		SurfStyle       0.158854
		OceanStyle      0.518795
		Randomize      (-0.312, -0.757, -0.611)
		colorDistMagn   0.642555
		colorDistFreq   4.26241
		detailScale     2534.39
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.299706
		terraceProb     0.165888
		erosion         0
		montesMagn      0.48986
		montesFreq      2.37015
		montesSpiky     0.891586
		montesFraction  0.579858
		dunesFraction   0
		hillsMagn       0
		hillsFreq       23.7676
		hillsFraction   0.658457
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225066
		craterFreq      0.328455
		craterDensity   0.655263
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.508052
		volcanoTemp     1394.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.281, 0.270, 0.250, 0.000)
		colorShelf     (0.299, 0.287, 0.266, 0.000)
		colorBeach     (0.316, 0.304, 0.281, 0.000)
		colorDesert    (0.334, 0.321, 0.297, 0.000)
		colorLowland   (0.351, 0.338, 0.313, 0.000)
		colorUpland    (0.369, 0.355, 0.328, 0.000)
		colorRock      (0.386, 0.372, 0.344, 0.000)
		colorSnow      (0.404, 0.389, 0.360, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000146328
		Period          0.00115093
		Eccentricity    1.73854e-005
		Inclination     0.00186506
		AscendingNode   -62.6784
		ArgOfPericenter -4.6841
		MeanAnomaly     63.5123
	}
}

Moon	"Crait System 6.1"
{
	ParentBody     "Crait System 6"
	Class	       "Selena"

	Mass            0.0158806
	Radius          2056.89
	InertiaMoment   0.369

	Oblateness      0.00379994

	Obliquity       -0.640842
	EqAscendNode    164.818
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.594 0.590 0.589)

	Surface
	{
		SurfStyle       0.558281
		OceanStyle      0.94783
		Randomize      (0.324, -0.414, 0.399)
		colorDistMagn   0.068028
		colorDistFreq   234.275
		detailScale     5290.44
		colorConversion true
		drivenDarkening 0
		seaLevel        0.127456
		snowLevel       2
		tropicLatitude  0.00294996
		icecapLatitude  6.75867
		icecapHeight    0.119065
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.69666
		venusFreq       1.0674
		venusMagn       0
		mareFreq        1.21728
		mareDensity     0.00389365
		terraceProb     0.322247
		erosion         0
		montesMagn      0.116426
		montesFreq      80.3101
		montesSpiky     0.826636
		montesFraction  0.832545
		dunesMagn       0.0493659
		dunesFreq       2709.07
		dunesFraction   0.385719
		hillsMagn       0.108536
		hillsFreq       262.741
		hillsFraction   0.280712
		hills2Fraction  0
		riversMagn      62.4852
		riversFreq      3.26992
		riversSin       3.54267
		riversOctaves   0
		canyonsMagn     0.454998
		canyonsFreq     0.817171
		canyonFraction  0.850451
		cracksMagn      0.0206724
		cracksFreq      1.20108
		cracksOctaves   0
		craterMagn      0.565333
		craterFreq      5.18285
		craterDensity   0.641253
		craterOctaves   7.76507
		craterRayedFactor 0.111155
		volcanoMagn     0.304347
		volcanoFreq     0.827612
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.243862
		volcanoRadius   0.275412
		volcanoTemp     1681.81
		lavaCoverTidal  0.326761
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.430, 0.400, 0.370, 0.000)
		colorShelf     (0.620, 0.600, 0.530, 0.000)
		colorBeach     (0.368, 0.360, 0.318, 0.000)
		colorDesert    (0.386, 0.366, 0.324, 0.000)
		colorLowland   (0.303, 0.272, 0.247, 0.000)
		colorUpland    (0.446, 0.419, 0.365, 0.000)
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
		SemiMajorAxis   0.00033771
		Period          0.0039954
		Eccentricity    0.0379551
		Inclination     -0.640842
		AscendingNode   164.818
		ArgOfPericenter 8.19709
		MeanAnomaly     -34.3279
	}
}

DwarfMoon	"Crait System 6.D3"
{
	ParentBody     "Crait System 6"
	Class	       "Asteroid"

	Mass            5.30656e-007
	Radius          105.731
	InertiaMoment   0.399625

	RotationPeriod  732.673
	Obliquity       -66.5541
	EqAscendNode    38.7228

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.687 0.685 0.683)

	Surface
	{
		SurfStyle       0.368304
		OceanStyle      0.568714
		Randomize      (-0.276, -0.216, -0.403)
		colorDistMagn   0.800356
		colorDistFreq   2.41109
		detailScale     2887.17
		colorConversion true
		snowLevel       2
		tropicLatitude  0.86697
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.54903
		terraceProb     0.239715
		erosion         0
		montesMagn      0.416457
		montesFreq      3.08109
		montesSpiky     0.898594
		montesFraction  0.388967
		dunesFraction   0
		hillsMagn       0
		hillsFreq       23.7625
		hillsFraction   0.563352
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250452
		craterFreq      0.359336
		craterDensity   0.778305
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.570109
		volcanoTemp     1429.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.275, 0.274, 0.273, 0.000)
		colorShelf     (0.292, 0.291, 0.290, 0.000)
		colorBeach     (0.309, 0.308, 0.307, 0.000)
		colorDesert    (0.326, 0.325, 0.324, 0.000)
		colorLowland   (0.344, 0.342, 0.341, 0.000)
		colorUpland    (0.361, 0.360, 0.359, 0.000)
		colorRock      (0.378, 0.377, 0.376, 0.000)
		colorSnow      (0.395, 0.394, 0.393, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00138275
		Period          0.0334332
		Eccentricity    0.445948
		Inclination     -66.5541
		AscendingNode   38.7228
		ArgOfPericenter -7.47549
		MeanAnomaly     19.2958
	}
}

DwarfMoon	"Crait System 6.D4"
{
	ParentBody     "Crait System 6"
	Class	       "Asteroid"

	Mass            7.52629e-007
	Radius          138.798
	InertiaMoment   0.397443

	Obliquity       -36.2679
	EqAscendNode    128.709
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.760 0.718 0.693)

	Surface
	{
		SurfStyle       0.112623
		OceanStyle      0.277952
		Randomize      (-0.080, 0.692, -0.732)
		colorDistMagn   0.313165
		colorDistFreq   7.85608
		detailScale     3790.1
		colorConversion true
		snowLevel       2
		tropicLatitude  0.494987
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.604866
		terraceProb     0.328422
		erosion         0
		montesMagn      0.484326
		montesFreq      2.08815
		montesSpiky     0.849975
		montesFraction  0.771496
		dunesFraction   0
		hillsMagn       0
		hillsFreq       43.6086
		hillsFraction   0.727922
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233942
		craterFreq      0.79715
		craterDensity   0.797351
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.546951
		volcanoTemp     1443.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.304, 0.287, 0.277, 0.000)
		colorShelf     (0.323, 0.305, 0.294, 0.000)
		colorBeach     (0.342, 0.323, 0.312, 0.000)
		colorDesert    (0.361, 0.341, 0.329, 0.000)
		colorLowland   (0.380, 0.359, 0.346, 0.000)
		colorUpland    (0.399, 0.377, 0.364, 0.000)
		colorRock      (0.418, 0.395, 0.381, 0.000)
		colorSnow      (0.437, 0.413, 0.398, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00183579
		Period          0.0511442
		Eccentricity    0.0759233
		Inclination     -36.2679
		AscendingNode   128.709
		ArgOfPericenter -175.816
		MeanAnomaly     -175.454
	}
}

DwarfMoon	"Crait System 6.D5"
{
	ParentBody     "Crait System 6"
	Class	       "Asteroid"

	Mass            1.08045e-006
	Radius          147.982
	InertiaMoment   0.398808

	RotationPeriod  955.223
	Obliquity       -13.6091
	EqAscendNode    -46.9116

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.605 0.601 0.596)

	Surface
	{
		SurfStyle       0.982046
		OceanStyle      0.899052
		Randomize      (0.603, -0.959, -0.249)
		colorDistMagn   0.63203
		colorDistFreq   6.16341
		detailScale     4040.91
		colorConversion true
		snowLevel       2
		tropicLatitude  0.42153
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.542628
		terraceProb     0.480838
		erosion         0
		montesMagn      0.527875
		montesFreq      3.20193
		montesSpiky     0.83356
		montesFraction  0.638188
		dunesFraction   0
		hillsMagn       0
		hillsFreq       40.6784
		hillsFraction   0.529577
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.278089
		craterFreq      0.597137
		craterDensity   0.873758
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.442062
		volcanoTemp     1673.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.206, 0.211, 0.238, 0.050)
		colorShelf     (0.242, 0.247, 0.274, 0.040)
		colorBeach     (0.278, 0.283, 0.310, 0.030)
		colorDesert    (0.314, 0.319, 0.352, 0.020)
		colorLowland   (0.351, 0.355, 0.387, 0.030)
		colorUpland    (0.387, 0.391, 0.423, 0.050)
		colorRock      (0.423, 0.427, 0.471, 0.020)
		colorSnow      (0.423, 0.427, 0.471, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00231975
		Period          0.0726476
		Eccentricity    0.180713
		Inclination     -13.6091
		AscendingNode   -46.9116
		ArgOfPericenter 15.7967
		MeanAnomaly     -62.8815
	}
}

DwarfMoon	"Crait System 6.D6"
{
	ParentBody     "Crait System 6"
	Class	       "Asteroid"

	Mass            1.57371e-006
	Radius          161.08
	InertiaMoment   0.399751

	Obliquity       -75.5895
	EqAscendNode    -112.602
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.703 0.583 0.510)

	Surface
	{
		SurfStyle       0.261593
		OceanStyle      0.139196
		Randomize      (0.822, -0.157, -0.204)
		colorDistMagn   0.61444
		colorDistFreq   7.63348
		detailScale     4398.55
		colorConversion true
		snowLevel       2
		tropicLatitude  0.906381
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.624601
		terraceProb     0.211142
		erosion         0
		montesMagn      0.489382
		montesFreq      2.15456
		montesSpiky     0.813936
		montesFraction  0.424155
		dunesFraction   0
		hillsMagn       0
		hillsFreq       45.8735
		hillsFraction   0.725926
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252954
		craterFreq      1.07915
		craterDensity   0.821246
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.606656
		volcanoTemp     1556.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.281, 0.233, 0.204, 0.000)
		colorShelf     (0.299, 0.248, 0.217, 0.000)
		colorBeach     (0.316, 0.262, 0.230, 0.000)
		colorDesert    (0.334, 0.277, 0.242, 0.000)
		colorLowland   (0.351, 0.292, 0.255, 0.000)
		colorUpland    (0.369, 0.306, 0.268, 0.000)
		colorRock      (0.386, 0.321, 0.281, 0.000)
		colorSnow      (0.404, 0.335, 0.293, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00253734
		Period          0.0831049
		Eccentricity    0.0444761
		Inclination     -75.5895
		AscendingNode   -112.602
		ArgOfPericenter 153.686
		MeanAnomaly     -51.2598
	}
}

DwarfMoon	"Crait System 6.D7"
{
	ParentBody     "Crait System 6"
	Class	       "Asteroid"

	Mass            2.33258e-006
	Radius          175.042
	InertiaMoment   0.397704

	Obliquity       -18.6765
	EqAscendNode    -10.543
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.709 0.677 0.635)

	Surface
	{
		SurfStyle       0.645451
		OceanStyle      0.255108
		Randomize      (0.953, -0.822, -0.060)
		colorDistMagn   0.846967
		colorDistFreq   9.37034
		detailScale     4779.82
		colorConversion true
		snowLevel       2
		tropicLatitude  0.604448
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.714346
		terraceProb     0.566884
		erosion         0
		montesMagn      0.602773
		montesFreq      2.65221
		montesSpiky     0.892369
		montesFraction  0.839363
		dunesFraction   0
		hillsMagn       0
		hillsFreq       61.548
		hillsFraction   0.615764
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.277641
		craterFreq      1.10669
		craterDensity   0.963414
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.457172
		volcanoTemp     1576.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.277, 0.230, 0.178, 0.000)
		colorShelf     (0.284, 0.237, 0.203, 0.000)
		colorBeach     (0.333, 0.278, 0.241, 0.000)
		colorDesert    (0.362, 0.298, 0.235, 0.000)
		colorLowland   (0.397, 0.318, 0.267, 0.000)
		colorUpland    (0.440, 0.386, 0.324, 0.000)
		colorRock      (0.475, 0.420, 0.349, 0.000)
		colorSnow      (0.518, 0.447, 0.368, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00288674
		Period          0.100849
		Eccentricity    0.429963
		Inclination     -18.6765
		AscendingNode   -10.543
		ArgOfPericenter 154.253
		MeanAnomaly     -114.675
	}
}

DwarfMoon	"Crait System 6.D8"
{
	ParentBody     "Crait System 6"
	Class	       "Asteroid"

	Mass            3.53151e-006
	Radius          235.346
	InertiaMoment   0.398954

	RotationPeriod  6022.55
	Obliquity       -7.01605
	EqAscendNode    -85.4503

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.781 0.779 0.778)

	Surface
	{
		SurfStyle       0.459729
		OceanStyle      0.462209
		Randomize      (0.524, -0.138, -0.425)
		colorDistMagn   0.536597
		colorDistFreq   25.4261
		detailScale     6426.52
		colorConversion true
		snowLevel       2
		tropicLatitude  0.178739
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.502225
		terraceProb     0.276875
		erosion         0
		montesMagn      0.473445
		montesFreq      2.78548
		montesSpiky     0.90687
		montesFraction  0.516632
		dunesFraction   0
		hillsMagn       0
		hillsFreq       74.746
		hillsFraction   0.516617
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222641
		craterFreq      1.44402
		craterDensity   0.858065
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.565866
		volcanoTemp     1869.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.312, 0.312, 0.311, 0.000)
		colorShelf     (0.332, 0.331, 0.331, 0.000)
		colorBeach     (0.352, 0.351, 0.350, 0.000)
		colorDesert    (0.371, 0.370, 0.370, 0.000)
		colorLowland   (0.391, 0.390, 0.389, 0.000)
		colorUpland    (0.410, 0.409, 0.409, 0.000)
		colorRock      (0.430, 0.429, 0.428, 0.000)
		colorSnow      (0.449, 0.448, 0.448, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00354791
		Period          0.13741
		Eccentricity    0.404705
		Inclination     -7.01605
		AscendingNode   -85.4503
		ArgOfPericenter 139.707
		MeanAnomaly     128.661
	}
}

Planet	"Crait System 7"
{
	ParentBody     "Crait System"
	Class	       "IceWorld"

	Mass            3.7895
	Radius          11209.1
	InertiaMoment   0.332481

	Oblateness      0.0142771

	RotationPeriod  13.9091
	Obliquity       68.0706
	EqAscendNode    -111.896

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.554 0.544 0.537)

	Surface
	{
		SurfStyle       0.0179057
		OceanStyle      0.733796
		Randomize      (0.586, 0.534, -0.714)
		colorDistMagn   0.0600146
		colorDistFreq   1458.43
		detailScale     28830.5
		colorConversion true
		drivenDarkening 0
		seaLevel        0.230477
		snowLevel       2
		tropicLatitude  0.930679
		icecapLatitude  1
		icecapHeight    0.230477
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.67868
		venusFreq       1.24234
		venusMagn       0
		mareFreq        2.05377
		mareDensity     0.105713
		terraceProb     0.302773
		erosion         0
		montesMagn      0.205486
		montesFreq      435.284
		montesSpiky     0.984733
		montesFraction  0.850692
		dunesMagn       0.0373201
		dunesFreq       14831
		dunesFraction   0.11481
		hillsMagn       0.115175
		hillsFreq       1355.44
		hillsFraction   0.719007
		hills2Fraction  0.0493419
		riversMagn      67.4989
		riversFreq      2.16858
		riversSin       7.13071
		riversOctaves   0
		canyonsMagn     0.635683
		canyonsFreq     4.30998
		canyonFraction  0
		cracksMagn      0.0307778
		cracksFreq      4.83172
		cracksOctaves   7
		craterMagn      0.661857
		craterFreq      28.8728
		craterDensity   0.576098
		craterOctaves   8.64179
		craterRayedFactor 0.0649821
		volcanoMagn     0.647732
		volcanoFreq     0.463822
		volcanoDensity  0.197308
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.126945
		volcanoRadius   0.466926
		volcanoTemp     1201.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.554, 0.544, 0.537, 0.500)
		colorShelf     (0.526, 0.517, 0.510, 0.500)
		colorBeach     (0.388, 0.381, 0.376, 0.750)
		colorDesert    (0.471, 0.462, 0.456, 1.000)
		colorLowland   (0.487, 0.479, 0.472, 1.000)
		colorUpland    (0.515, 0.506, 0.499, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.487, 0.479, 0.472, 1.000)
		colorUpPlants  (0.515, 0.506, 0.499, 1.000)
		BumpHeight      18.0558
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.717661
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
		Height          56.0455
		Density         0.0282339
		Pressure        0.0140666
		Greenhouse      1.61778
		Bright          7.76523
		Opacity         1
		SkyLight        2.58841
		Hue             0
		Saturation      1

		Composition
		{
			CH4   	70.3548
			CO2   	21.7045
			C2H4  	4.84719
			C2H2  	2.37664
			C2H6  	0.499335
			H2    	0.170683
			N2    	0.0426814
			CO    	0.00359548
			H2S   	0.00035817
			Ar    	0.000160463
			Ne    	2.4894e-005
			C3H8  	1.66504e-005
			He    	1.34732e-005
			Kr    	1.02919e-005
		}
	}

	Aurora
	{
		Height      248.832
		NorthLat    47.382
		NorthLon    118.117
		NorthRadius 2003.79
		NorthWidth  661.32
		NorthRings  5
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -47.2051
		SouthLon    281.666
		SouthRadius 1864.43
		SouthWidth  423.068
		SouthRings  4
		SouthBright 0.3
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	Rings
	{
		InnerRadius     13412.3
		OuterRadius     17662.3
		RotationPeriod  2.75649
		RotationOffset  0
		FrontBright     0.968788
		BackBright      0.871842
		Density         0.978841
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.99143
		Period          1.31338
		Eccentricity    0.00073592
		Inclination     -1.34161
		AscendingNode   -110.271
		ArgOfPericenter 126.014
		MeanAnomaly     290.577
	}
}

Barycenter	"Crait System 8-8.1"
{
	ParentBody     "Crait System"
	Mass            26.6243
	Radius          8466.96
	RotationPeriod  24
	Obliquity       0
	EqAscendNode    0


	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.59209
		Period          2.67259
		Eccentricity    0.0962202
		Inclination     2.45318
		AscendingNode   -71.5261
		ArgOfPericenter 94.1444
		MeanAnomaly     252.977
	}
}

Planet	"Crait System 8"
{
	ParentBody     "Crait System 8-8.1"
	Class	       "IceGiant"

	Mass            19.1024
	Radius          21538.6
	InertiaMoment   0.192282

	Obliquity       -0.135448
	EqAscendNode    63.6086
	TidalLocked     true

	AlbedoBond      0.494145
	AlbedoGeom      0.592974
	Brightness      2

	Surface
	{
		SurfStyle       0.737197
		Randomize      (-0.428, 0.447, -0.350)
		detailScale     55398.6
		colorConversion true
		tropicLatitude  0.00401163
		icecapLatitude  0.904012
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0.172106
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     6.02166
		stripeFluct     0.324698
		stripeTwist     9.97935
		cycloneMagn     7.36805
		cycloneFreq     0.518869
		cycloneDensity  0.470004
		cycloneOctaves  0
		colorLayer0    (0.840, 0.730, 0.570, 1.000)
		colorLayer1    (0.850, 0.750, 0.600, 1.000)
		colorLayer2    (0.340, 0.290, 0.200, 1.000)
		colorLayer3    (0.460, 0.380, 0.270, 1.000)
		colorLayer4    (0.560, 0.470, 0.320, 1.000)
		colorLayer5    (0.580, 0.500, 0.360, 1.000)
		colorLayer6    (0.730, 0.630, 0.480, 1.000)
		colorLayer7    (0.690, 0.660, 0.620, 1.000)
		colorLowPlants (0.560, 0.470, 0.320, 1.000)
		colorUpPlants  (0.580, 0.500, 0.360, 1.000)
		BumpHeight      15.4529
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          55.4395
		Velocity        929.95
		BumpHeight      39.9867
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.37252
		mainOctaves     12
		Coverage        0.470727
		stripeZones     6.02166
		stripeFluct     0.324698
		stripeTwist     9.97935
	}

	Clouds
	{
		Height          95.4258
		Velocity        -491.504
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		ModulateColor  (1.000 1.000 1.000 0.087)
		mainFreq        1.37252
		mainOctaves     12
		Coverage        0.470727
		stripeZones     6.02166
		stripeFluct     0.324698
		stripeTwist     9.97935
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Jupiter"
		Height          215.386
		Density         1804.95
		Pressure        246426
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.0172244
		Saturation      0.931346

		Composition
		{
			H2    	91.8449
			He    	7.78687
			CH4   	0.324814
			N2    	0.0342296
			O2    	0.00711615
			Ne    	0.00122826
			Ar    	0.000795562
			C2H4  	2.80977e-005
		}
	}

	Aurora
	{
		Height      561.618
		NorthLat    80.2776
		NorthLon    108.75
		NorthRadius 6354.08
		NorthWidth  1579.94
		NorthRings  3
		NorthBright 1
		NorthParticles 10000
		SouthLat    -90
		SouthLon    285.847
		SouthRadius 5742.06
		SouthWidth  2246.04
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
		SemiMajorAxis   0.000454023
		Period          0.00722081
		Eccentricity    0.0182728
		Inclination     -0.135448
		AscendingNode   63.6086
		ArgOfPericenter 312.635
		MeanAnomaly     93.7122
	}
}

Moon	"Crait System 8.1"
{
	ParentBody     "Crait System 8-8.1"
	Class	       "Oceania"

	Mass            7.52185
	Radius          12378.7
	InertiaMoment   0.330445

	Obliquity       -0.135448
	EqAscendNode    63.6086
	TidalLocked     true

	AlbedoBond      0.394696
	AlbedoGeom      0.473635
	Brightness      2
	Color          (0.790 0.751 0.696)

	Surface
	{
		SurfStyle       0.478143
		OceanStyle      0.539148
		Randomize      (-0.557, -0.130, -0.367)
		colorDistMagn   0.0518688
		colorDistFreq   1610.3
		detailScale     31838.8
		colorConversion true
		seaLevel        0.90883
		snowLevel       2
		tropicLatitude  0.00401163
		icecapLatitude  10
		icecapHeight    1.03821
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        0.856985
		venusFreq       1.43077
		venusMagn       0.280865
		mareFreq        0
		mareDensity     0
		terraceProb     0.333818
		erosion         0
		montesMagn      0.183607
		montesFreq      491.647
		montesSpiky     0.895442
		montesFraction  0.787627
		dunesMagn       0.0529232
		dunesFreq       122.908
		dunesFraction   0.527822
		hillsMagn       0.124907
		hillsFreq       1223.9
		hillsFraction   0.837046
		hills2Fraction  0.721816
		riversMagn      65.2193
		riversFreq      3.62444
		riversSin       5.54222
		riversOctaves   0
		canyonsMagn     0.0166726
		canyonsFreq     309.208
		canyonFraction  0.816309
		cracksMagn      0.111277
		cracksFreq      1.05151
		cracksOctaves   3
		craterMagn      0.0618996
		craterFreq      95.6416
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.614083
		volcanoFreq     0.703882
		volcanoDensity  0
		volcanoOctaves  0
		volcanoActivity 2
		volcanoFlows    0
		volcanoRadius   0.461658
		volcanoTemp     1451.84
		lavaCoverTidal  0.519825
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.36851
		stripeTwist     0.718073
		cycloneMagn     2.12932
		cycloneFreq     0.806806
		cycloneDensity  0.338876
		cycloneOctaves  2
		colorSea       (0.040, 0.100, 0.200, 1.000)
		colorShelf     (0.150, 0.480, 0.460, 1.000)
		colorBeach     (0.950, 0.950, 0.950, 1.308)
		colorDesert    (0.770, 0.770, 0.470, 1.308)
		colorLowland   (0.880, 0.880, 0.880, 1.308)
		colorUpland    (1.000, 1.000, 1.000, 1.308)
		colorRock      (1.000, 1.000, 1.000, 1.308)
		colorSnow      (1.000, 1.000, 1.000, 1.308)
		BumpHeight      32.7247
		BumpOffset      29.7412
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
		Height          26.2988
		Velocity        74.8235
		BumpHeight      6.64825
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.02478
		mainOctaves     10
		Coverage        0.324493
		stripeZones     1.36851
		stripeTwist     0.718073
	}

	Clouds
	{
		Height          52.5977
		Velocity        112.496
		BumpHeight      5.25961
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.02478
		mainOctaves     10
		Coverage        0.324493
		stripeZones     1.36851
		stripeTwist     0.718073
	}

	Ocean
	{
		Height          29.7412
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
	}

	NoLava          true

	Atmosphere
	{
		Model          "Venus"
		Height          260.373
		Density         648.855
		Pressure        1961.97
		Greenhouse      459.737
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.489816
		Saturation      0.579633

		Composition
		{
			H2O   	96.7003
			CO2   	3.01937
			SO2   	0.264939
			N2    	0.0151105
			CO    	0.00015453
			Ar    	0.00011782
			Ne    	1.05215e-005
		}
	}

	Aurora
	{
		Height      102.923
		NorthLat    53.9772
		NorthLon    -116.639
		NorthRadius 3994.6
		NorthWidth  1031.51
		NorthRings  2
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -28.0302
		SouthLon    89.1847
		SouthRadius 3097.74
		SouthWidth  790.763
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
		SemiMajorAxis   0.00115303
		Period          0.00722081
		Eccentricity    0.0182728
		Inclination     -0.135448
		AscendingNode   63.6086
		ArgOfPericenter 132.635
		MeanAnomaly     93.7122
	}
}

Planet	"Crait System 9"
{
	ParentBody     "Crait System"
	Class	       "IceGiant"

	Mass            19.6721
	Radius          21642.5
	InertiaMoment   0.211678

	Oblateness      0.0285704

	RotationPeriod  9.38618
	Obliquity       -208.817
	EqAscendNode    -5.35626

	AlbedoBond      0.423725
	AlbedoGeom      0.50847
	Brightness      2

	Surface
	{
		SurfStyle       0.8675
		Randomize      (0.716, -0.765, -0.497)
		detailScale     55665.7
		colorConversion true
		tropicLatitude  0.47936
		icecapLatitude  1
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     4.81779
		stripeFluct     0.42866
		stripeTwist     14.1284
		cycloneMagn     10.3374
		cycloneFreq     1.05614
		cycloneDensity  0.362474
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
		BumpHeight      15.3009
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          35.4141
		Velocity        -881.049
		BumpHeight      20.1124
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.2169
		mainOctaves     12
		Coverage        0.118624
		stripeZones     4.81779
		stripeFluct     0.42866
		stripeTwist     14.1284
	}

	Clouds
	{
		Height          55.5254
		Velocity        1359.11
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		ModulateColor  (1.000 1.000 1.000 0.656)
		mainFreq        1.2169
		mainOctaves     12
		Coverage        0.118624
		stripeZones     4.81779
		stripeFluct     0.42866
		stripeTwist     14.1284
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          216.425
		Density         2621.33
		Pressure        253314
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0153162
		Saturation      0.989856

		Composition
		{
			H2    	93.2185
			He    	6.70678
			CH4   	0.032997
			N2    	0.0329466
			O2    	0.006966
			Ne    	0.000999991
			Ar    	0.000753214
		}
	}

	Aurora
	{
		Height      415.526
		NorthLat    58.2036
		NorthLon    150.015
		NorthRadius 5249.9
		NorthWidth  1479.9
		NorthRings  2
		NorthBright 1
		NorthParticles 10000
		SouthLat    -62.4333
		SouthLon    323.901
		SouthRadius 3469.83
		SouthWidth  773.479
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
		SemiMajorAxis   3.28803
		Period          7.93198
		Eccentricity    0.0429097
		Inclination     0.177756
		AscendingNode   -13.3108
		ArgOfPericenter 229.434
		MeanAnomaly     33.7282
	}
}

DwarfMoon	"Crait System 9.D1"
{
	ParentBody     "Crait System 9"
	Class	       "Asteroid"

	Mass            3.37756e-007
	Radius          99.9465
	InertiaMoment   0.399912

	Oblateness      0.249

	Obliquity       0.0032993
	EqAscendNode    164.2
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.512 0.508 0.505)

	Surface
	{
		SurfStyle       0.828268
		OceanStyle      0.160023
		Randomize      (0.329, -0.571, -0.966)
		colorDistMagn   0.855303
		colorDistFreq   4.9702
		detailScale     2729.21
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.529652
		terraceProb     0.145596
		erosion         0
		montesMagn      0.522724
		montesFreq      2.88965
		montesSpiky     0.935566
		montesFraction  0.725471
		dunesFraction   0
		hillsMagn       0
		hillsFreq       29.5511
		hillsFraction   0.920402
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234474
		craterFreq      0.363362
		craterDensity   0.959723
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.429071
		volcanoTemp     1369.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.200, 0.173, 0.141, 0.000)
		colorShelf     (0.205, 0.178, 0.162, 0.000)
		colorBeach     (0.241, 0.208, 0.192, 0.000)
		colorDesert    (0.261, 0.223, 0.187, 0.000)
		colorLowland   (0.287, 0.239, 0.212, 0.000)
		colorUpland    (0.318, 0.289, 0.257, 0.000)
		colorRock      (0.343, 0.315, 0.278, 0.000)
		colorSnow      (0.374, 0.335, 0.293, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000343414
		Period          0.000829816
		Eccentricity    4.75211e-005
		Inclination     0.0032993
		AscendingNode   164.2
		ArgOfPericenter 33.7736
		MeanAnomaly     -170.366
	}
}

DwarfMoon	"Crait System 9.D2"
{
	ParentBody     "Crait System 9"
	Class	       "Asteroid"

	Mass            4.72796e-007
	Radius          107.392
	InertiaMoment   0.39799

	Oblateness      0.249

	Obliquity       -0.00372374
	EqAscendNode    19.3178
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.406 0.402 0.399)

	Surface
	{
		SurfStyle       0.888474
		OceanStyle      0.22573
		Randomize      (-0.281, -0.139, -0.260)
		colorDistMagn   0.489297
		colorDistFreq   6.2961
		detailScale     2932.52
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.515313
		terraceProb     0.222348
		erosion         0
		montesMagn      0.615896
		montesFreq      3.76295
		montesSpiky     0.990424
		montesFraction  0.496276
		dunesFraction   0
		hillsMagn       0
		hillsFreq       28.1991
		hillsFraction   0.626787
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213506
		craterFreq      0.489322
		craterDensity   0.780899
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.516595
		volcanoTemp     1790.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.138, 0.141, 0.159, 0.050)
		colorShelf     (0.163, 0.165, 0.183, 0.040)
		colorBeach     (0.187, 0.189, 0.207, 0.030)
		colorDesert    (0.211, 0.213, 0.235, 0.020)
		colorLowland   (0.236, 0.237, 0.259, 0.030)
		colorUpland    (0.260, 0.261, 0.283, 0.050)
		colorRock      (0.284, 0.285, 0.315, 0.020)
		colorSnow      (0.284, 0.285, 0.315, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000380862
		Period          0.000969182
		Eccentricity    2.81453e-005
		Inclination     -0.00372374
		AscendingNode   19.3178
		ArgOfPericenter -35.2396
		MeanAnomaly     -171.159
	}
}

DwarfMoon	"Crait System 9.D3"
{
	ParentBody     "Crait System 9"
	Class	       "Asteroid"

	Mass            6.68149e-007
	Radius          114.442
	InertiaMoment   0.399134

	Oblateness      0.241266

	Obliquity       -0.00704992
	EqAscendNode    -114.093
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.770 0.768 0.766)

	Surface
	{
		SurfStyle       0.145054
		OceanStyle      0.446498
		Randomize      (-0.540, 0.428, 0.293)
		colorDistMagn   0.57005
		colorDistFreq   5.2103
		detailScale     3125.04
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.614657
		terraceProb     0.105154
		erosion         0
		montesMagn      0.486911
		montesFreq      3.36435
		montesSpiky     0.946303
		montesFraction  0.526594
		dunesFraction   0
		hillsMagn       0
		hillsFreq       29.6274
		hillsFraction   0.67271
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213906
		craterFreq      0.490901
		craterDensity   0.704768
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.470448
		volcanoTemp     1558.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.308, 0.307, 0.306, 0.000)
		colorShelf     (0.327, 0.327, 0.326, 0.000)
		colorBeach     (0.347, 0.346, 0.345, 0.000)
		colorDesert    (0.366, 0.365, 0.364, 0.000)
		colorLowland   (0.385, 0.384, 0.383, 0.000)
		colorUpland    (0.404, 0.403, 0.402, 0.000)
		colorRock      (0.424, 0.423, 0.421, 0.000)
		colorSnow      (0.443, 0.442, 0.440, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000407687
		Period          0.00107336
		Eccentricity    7.18537e-005
		Inclination     -0.00704992
		AscendingNode   -114.093
		ArgOfPericenter 108.876
		MeanAnomaly     -61.7047
	}
}

DwarfMoon	"Crait System 9.D4"
{
	ParentBody     "Crait System 9"
	Class	       "Asteroid"

	Mass            9.5503e-007
	Radius          150.628
	InertiaMoment   0.395125

	Oblateness      0.249

	Obliquity       0.00356413
	EqAscendNode    -20.9147
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.707 0.703 0.700)

	Surface
	{
		SurfStyle       0.700092
		OceanStyle      0.461374
		Randomize      (-0.251, -0.183, -0.948)
		colorDistMagn   0.00304788
		colorDistFreq   14.2959
		detailScale     4113.15
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.380695
		terraceProb     0.321599
		erosion         0
		montesMagn      0.557592
		montesFreq      2.20586
		montesSpiky     0.890942
		montesFraction  0.365864
		dunesFraction   0
		hillsMagn       0
		hillsFreq       42.0251
		hillsFraction   0.711539
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256416
		craterFreq      0.802632
		craterDensity   0.816805
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.573469
		volcanoTemp     1473.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.276, 0.239, 0.196, 0.000)
		colorShelf     (0.283, 0.246, 0.224, 0.000)
		colorBeach     (0.332, 0.288, 0.266, 0.000)
		colorDesert    (0.361, 0.309, 0.259, 0.000)
		colorLowland   (0.396, 0.330, 0.294, 0.000)
		colorUpland    (0.438, 0.401, 0.357, 0.000)
		colorRock      (0.474, 0.436, 0.385, 0.000)
		colorSnow      (0.516, 0.464, 0.406, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000450078
		Period          0.00124505
		Eccentricity    3.39461e-005
		Inclination     0.00356413
		AscendingNode   -20.9147
		ArgOfPericenter 127.179
		MeanAnomaly     98.0574
	}
}

Moon	"Crait System 9.1"
{
	ParentBody     "Crait System 9"
	Class	       "Selena"

	Mass            0.00809736
	Radius          1753.31
	InertiaMoment   0.381804

	Oblateness      0.00191158

	Obliquity       -0.0672214
	EqAscendNode    88.3216
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.471 0.461 0.458)

	Surface
	{
		SurfStyle       0.52471
		OceanStyle      0.617414
		Randomize      (0.843, -0.973, -0.516)
		colorDistMagn   0.0490597
		colorDistFreq   213.364
		detailScale     4509.62
		colorConversion true
		drivenDarkening 0
		seaLevel        0.184763
		snowLevel       2
		tropicLatitude  0.00169146
		icecapLatitude  0.423754
		icecapHeight    0.214558
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.58953
		venusFreq       1.16106
		venusMagn       0
		mareFreq        0.838293
		mareDensity     0.00192656
		terraceProb     0.33851
		erosion         0
		montesMagn      0.0825282
		montesFreq      84.5461
		montesSpiky     0.887094
		montesFraction  0.860476
		dunesMagn       0.0326158
		dunesFreq       2277.96
		dunesFraction   0.241422
		hillsMagn       0.124523
		hillsFreq       228.825
		hillsFraction   0.566451
		hills2Fraction  0
		riversMagn      48.9015
		riversFreq      3.5696
		riversSin       6.25386
		riversOctaves   0
		canyonsMagn     0.347355
		canyonsFreq     0.61611
		canyonFraction  0.517496
		cracksMagn      0.0465064
		cracksFreq      0.597221
		cracksOctaves   0
		craterMagn      0.68387
		craterFreq      3.35605
		craterDensity   0.707138
		craterOctaves   9.62095
		craterRayedFactor 0.192565
		volcanoMagn     0.304962
		volcanoFreq     0.720693
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.178145
		volcanoRadius   0.231473
		volcanoTemp     1390.12
		lavaCoverTidal  0.139298
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.430, 0.400, 0.370, 0.000)
		colorShelf     (0.620, 0.600, 0.530, 0.000)
		colorBeach     (0.292, 0.281, 0.247, 0.000)
		colorDesert    (0.306, 0.286, 0.252, 0.000)
		colorLowland   (0.240, 0.212, 0.192, 0.000)
		colorUpland    (0.353, 0.328, 0.284, 0.000)
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
		SemiMajorAxis   0.00133497
		Period          0.00635875
		Eccentricity    0.0304623
		Inclination     -0.0672213
		AscendingNode   88.3216
		ArgOfPericenter -131.705
		MeanAnomaly     31.0582
	}
}

Moon	"Crait System 9.2"
{
	ParentBody     "Crait System 9"
	Class	       "IceWorld"

	Mass            0.0100057
	Radius          1768.32
	InertiaMoment   0.376574

	Obliquity       1.29532
	EqAscendNode    164.019
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.641 0.556 0.414)

	Surface
	{
		SurfStyle       0.85519
		OceanStyle      0.975064
		Randomize      (0.501, 0.553, 0.454)
		colorDistMagn   0.0883299
		colorDistFreq   228.773
		detailScale     4548.23
		colorConversion true
		drivenDarkening 0.7
		seaLevel        0.240376
		snowLevel       2
		tropicLatitude  0.00628155
		icecapLatitude  0.809336
		icecapHeight    0.248029
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.847
		venusFreq       0.626165
		venusMagn       0
		mareFreq        0.819944
		mareDensity     0.00329642
		terraceProb     0.197082
		erosion         0
		montesMagn      0.086215
		montesFreq      88.9831
		montesSpiky     0.868052
		montesFraction  0.937347
		dunesMagn       0.0304514
		dunesFreq       2338.66
		dunesFraction   0.611723
		hillsMagn       0.143993
		hillsFreq       200.52
		hillsFraction   0.89751
		hills2Fraction  0.199516
		riversMagn      58.1374
		riversFreq      1.79313
		riversSin       6.22643
		riversOctaves   0
		canyonsMagn     0.471757
		canyonsFreq     0.668323
		canyonFraction  0
		cracksMagn      0.0608124
		cracksFreq      1.18011
		cracksOctaves   2
		craterMagn      0.583162
		craterFreq      4.28816
		craterDensity   0.863127
		craterOctaves   11
		craterRayedFactor 0.0700537
		volcanoMagn     0.239436
		volcanoFreq     0.613541
		volcanoDensity  0.167557
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.221364
		volcanoRadius   0.178839
		volcanoTemp     1568.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.641, 0.417, 0.238, 0.000)
		colorShelf     (0.609, 0.396, 0.226, 0.000)
		colorBeach     (0.320, 0.209, 0.119, 0.000)
		colorDesert    (0.545, 0.355, 0.202, 0.000)
		colorLowland   (0.519, 0.367, 0.226, 0.000)
		colorUpland    (0.596, 0.388, 0.221, 0.000)
		colorRock      (1.000, 1.000, 1.000, 0.500)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.519, 0.367, 0.226, 0.000)
		colorUpPlants  (0.596, 0.388, 0.221, 0.000)
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
		SemiMajorAxis   0.00226505
		Period          0.0140528
		Eccentricity    0.0257284
		Inclination     1.29532
		AscendingNode   164.019
		ArgOfPericenter 108.725
		MeanAnomaly     -72.1724
	}
}

Moon	"Crait System 9.3"
{
	ParentBody     "Crait System 9"
	Class	       "IceWorld"

	Mass            0.0126053
	Radius          2027.21
	InertiaMoment   0.370933

	Obliquity       0.400944
	EqAscendNode    98.9558
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.582 0.471 0.351)

	Surface
	{
		SurfStyle       0.3061
		OceanStyle      0.753906
		Randomize      (-0.581, -0.185, 0.043)
		colorDistMagn   0.0561314
		colorDistFreq   249.715
		detailScale     5214.09
		colorConversion true
		drivenDarkening 0.527016
		seaLevel        0.253058
		snowLevel       2
		tropicLatitude  0.00909558
		icecapLatitude  0.967656
		icecapHeight    0.25522
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.96978
		venusFreq       1.3073
		venusMagn       0.262009
		mareFreq        0.98751
		mareDensity     0.0025508
		terraceProb     0.696839
		erosion         0
		montesMagn      0.0820919
		montesFreq      93.1013
		montesSpiky     0.780927
		montesFraction  0.503255
		dunesMagn       0.0453414
		dunesFreq       2637.67
		dunesFraction   0.532199
		hillsMagn       0.133994
		hillsFreq       276.274
		hillsFraction   0.696334
		hills2Fraction  0.281237
		riversMagn      60.5433
		riversFreq      3.20517
		riversSin       4.98667
		riversOctaves   0
		canyonsMagn     0.366613
		canyonsFreq     0.82406
		canyonFraction  0
		cracksMagn      0.0454355
		cracksFreq      0.735047
		cracksOctaves   1
		craterMagn      0.568722
		craterFreq      5.17388
		craterDensity   0.990188
		craterOctaves   11
		craterRayedFactor 0.111498
		volcanoMagn     0.376728
		volcanoFreq     0.671558
		volcanoDensity  0.250541
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.25046
		volcanoRadius   0.284592
		volcanoTemp     1318.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.582, 0.471, 0.351, 0.500)
		colorShelf     (0.553, 0.448, 0.333, 0.500)
		colorBeach     (0.408, 0.330, 0.246, 0.750)
		colorDesert    (0.495, 0.401, 0.298, 1.000)
		colorLowland   (0.512, 0.415, 0.309, 1.000)
		colorUpland    (0.542, 0.438, 0.326, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.512, 0.415, 0.309, 1.000)
		colorUpPlants  (0.542, 0.438, 0.326, 1.000)
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
		SemiMajorAxis   0.00384314
		Period          0.0310559
		Eccentricity    0.04617
		Inclination     0.400944
		AscendingNode   98.9558
		ArgOfPericenter -47.5305
		MeanAnomaly     134.459
	}
}

Moon	"Crait System 9.4"
{
	ParentBody     "Crait System 9"
	Class	       "IceWorld"

	Mass            4.71453e-006
	Radius          259.905
	InertiaMoment   0.398368

	RotationPeriod  13448.4
	Obliquity       -28.816
	EqAscendNode    -161.718

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.857 0.787 0.711)

	Surface
	{
		SurfStyle       0.370892
		OceanStyle      0.973545
		Randomize      (-0.337, -0.670, -0.417)
		colorDistMagn   0.0702671
		colorDistFreq   33.4629
		detailScale     668.49
		colorConversion true
		drivenDarkening 0.0986584
		seaLevel        0.151077
		snowLevel       2
		tropicLatitude  0.152699
		icecapLatitude  1
		icecapHeight    0.151077
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.77193
		venusFreq       1.23568
		venusMagn       0
		mareFreq        0
		mareDensity     1.13465e-006
		terraceProb     0.221143
		erosion         0
		montesMagn      0.0559708
		montesFreq      8.80266
		montesSpiky     0.837808
		montesFraction  0.591947
		dunesMagn       0.0468117
		dunesFreq       346.237
		dunesFraction   0.275118
		hillsMagn       0.104336
		hillsFreq       26.8348
		hillsFraction   0.840606
		hills2Fraction  0.0783355
		riversMagn      64.4055
		riversFreq      3.61886
		riversSin       6.95362
		riversOctaves   0
		canyonsMagn     0.576785
		canyonsFreq     0.0663862
		canyonFraction  0
		cracksMagn      0.0766774
		cracksFreq      0.135141
		cracksOctaves   0
		craterMagn      0.954003
		craterFreq      0.946303
		craterDensity   0.809219
		craterOctaves   8
		craterRayedFactor 0.0651168
		volcanoMagn     0.197305
		volcanoFreq     0.665221
		volcanoDensity  0.192356
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.310351
		volcanoRadius   0.125019
		volcanoTemp     1420.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.857, 0.787, 0.711, 0.500)
		colorShelf     (0.814, 0.748, 0.675, 0.500)
		colorBeach     (0.600, 0.551, 0.498, 0.750)
		colorDesert    (0.729, 0.669, 0.604, 1.000)
		colorLowland   (0.754, 0.693, 0.626, 1.000)
		colorUpland    (0.797, 0.732, 0.661, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.754, 0.693, 0.626, 1.000)
		colorUpPlants  (0.797, 0.732, 0.661, 1.000)
		BumpHeight      12.9952
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
		SemiMajorAxis   0.0205294
		Period          0.383546
		Eccentricity    0.352372
		Inclination     -28.816
		AscendingNode   -161.718
		ArgOfPericenter -43.2515
		MeanAnomaly     -84.6043
	}
}

DwarfMoon	"Crait System 9.D5"
{
	ParentBody     "Crait System 9"
	Class	       "Asteroid"

	Mass            1.32705e-011
	Radius          3.44058
	InertiaMoment   0.399401

	RotationPeriod  2301.13
	Obliquity       50.9034
	EqAscendNode    161.834

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.807 0.752 0.660)

	Surface
	{
		SurfStyle       0.984763
		OceanStyle      0.627465
		Randomize      (0.613, -0.992, -0.273)
		colorDistMagn   0.909963
		colorDistFreq   0.00408916
		detailScale     93.9509
		colorConversion true
		snowLevel       2
		tropicLatitude  0.24319
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.645806
		terraceProb     0.80113
		erosion         0
		montesMagn      0.511841
		montesFreq      2.82462
		montesSpiky     0.93013
		montesFraction  0.336066
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0333374
		hillsFraction   0.920071
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220954
		craterFreq      0.186643
		craterDensity   0.944327
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.507929
		volcanoTemp     1816.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.274, 0.263, 0.264, 0.050)
		colorShelf     (0.323, 0.308, 0.303, 0.040)
		colorBeach     (0.371, 0.353, 0.343, 0.030)
		colorDesert    (0.420, 0.399, 0.389, 0.020)
		colorLowland   (0.468, 0.444, 0.429, 0.030)
		colorUpland    (0.517, 0.489, 0.468, 0.050)
		colorRock      (0.565, 0.534, 0.521, 0.020)
		colorSnow      (0.565, 0.534, 0.521, 1.000)
		BumpHeight      3.09653
		BumpOffset      0.619305
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0208925
		Period          0.393769
		Eccentricity    0.261839
		Inclination     50.9034
		AscendingNode   161.834
		ArgOfPericenter 151.276
		MeanAnomaly     -25.6196
	}
}

DwarfMoon	"Crait System 9.D6"
{
	ParentBody     "Crait System 9"
	Class	       "Asteroid"

	Mass            2.67504e-011
	Radius          4.16998
	InertiaMoment   0.396843

	RotationPeriod  7148.67
	Obliquity       -2.2456
	EqAscendNode    -160.517

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.585 0.443 0.367)

	Surface
	{
		SurfStyle       0.191775
		OceanStyle      0.57794
		Randomize      (-0.627, -0.940, 0.264)
		colorDistMagn   0.401843
		colorDistFreq   0.00400828
		detailScale     113.868
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0132599
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.674453
		terraceProb     0.187971
		erosion         0
		montesMagn      0.361978
		montesFreq      3.33463
		montesSpiky     0.929733
		montesFraction  0.559487
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0310936
		hillsFraction   0.38505
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22844
		craterFreq      0.248645
		craterDensity   0.793105
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.554248
		volcanoTemp     1437.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.234, 0.177, 0.147, 0.000)
		colorShelf     (0.249, 0.188, 0.156, 0.000)
		colorBeach     (0.263, 0.199, 0.165, 0.000)
		colorDesert    (0.278, 0.210, 0.174, 0.000)
		colorLowland   (0.293, 0.221, 0.183, 0.000)
		colorUpland    (0.307, 0.233, 0.192, 0.000)
		colorRock      (0.322, 0.244, 0.202, 0.000)
		colorSnow      (0.337, 0.255, 0.211, 1.000)
		BumpHeight      3.75298
		BumpOffset      0.750596
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0213845
		Period          0.407758
		Eccentricity    0.415692
		Inclination     -2.2456
		AscendingNode   -160.517
		ArgOfPericenter 22.8624
		MeanAnomaly     4.57251
	}
}

DwarfMoon	"Crait System 9.D7"
{
	ParentBody     "Crait System 9"
	Class	       "Asteroid"

	Mass            4.92004e-011
	Radius          4.88697
	InertiaMoment   0.398537

	RotationPeriod  5459.3
	Obliquity       -84.7777
	EqAscendNode    -72.7368

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.667 0.608 0.558)

	Surface
	{
		SurfStyle       0.730039
		OceanStyle      0.102151
		Randomize      (-0.561, 0.152, 0.241)
		colorDistMagn   0.468392
		colorDistFreq   0.0138531
		detailScale     133.447
		colorConversion true
		snowLevel       2
		tropicLatitude  0.958224
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.419834
		terraceProb     0.594052
		erosion         0
		montesMagn      0.4582
		montesFreq      2.46188
		montesSpiky     0.942368
		montesFraction  0.482939
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0448108
		hillsFraction   0.710332
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239694
		craterFreq      0.23703
		craterDensity   1.0265
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.36026
		volcanoTemp     1590.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.260, 0.207, 0.156, 0.000)
		colorShelf     (0.267, 0.213, 0.179, 0.000)
		colorBeach     (0.314, 0.249, 0.212, 0.000)
		colorDesert    (0.340, 0.268, 0.207, 0.000)
		colorLowland   (0.374, 0.286, 0.234, 0.000)
		colorUpland    (0.414, 0.347, 0.285, 0.000)
		colorRock      (0.447, 0.377, 0.307, 0.000)
		colorSnow      (0.487, 0.401, 0.324, 1.000)
		BumpHeight      4.39827
		BumpOffset      0.879654
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0216438
		Period          0.415196
		Eccentricity    0.460972
		Inclination     -84.7777
		AscendingNode   -72.7368
		ArgOfPericenter 136.566
		MeanAnomaly     112.87
	}
}

DwarfMoon	"Crait System 9.D8"
{
	ParentBody     "Crait System 9"
	Class	       "Asteroid"

	Mass            8.48003e-011
	Radius          6.92681
	InertiaMoment   0.39953

	RotationPeriod  7495.13
	Obliquity       63.4054
	EqAscendNode    -17.6667

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.821 0.805 0.778)

	Surface
	{
		SurfStyle       0.0476043
		OceanStyle      0.854196
		Randomize      (-0.858, -0.264, -0.843)
		colorDistMagn   0.531942
		colorDistFreq   0.0263833
		detailScale     189.148
		colorConversion true
		snowLevel       2
		tropicLatitude  0.8275
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.561291
		terraceProb     0.169595
		erosion         0
		montesMagn      0.463875
		montesFreq      3.40778
		montesSpiky     0.777588
		montesFraction  0.454958
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.093794
		hillsFraction   0.657369
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241972
		craterFreq      0.163961
		craterDensity   0.828064
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.480814
		volcanoTemp     1677.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.329, 0.322, 0.311, 0.000)
		colorShelf     (0.349, 0.342, 0.330, 0.000)
		colorBeach     (0.370, 0.362, 0.350, 0.000)
		colorDesert    (0.390, 0.382, 0.369, 0.000)
		colorLowland   (0.411, 0.402, 0.389, 0.000)
		colorUpland    (0.431, 0.422, 0.408, 0.000)
		colorRock      (0.452, 0.443, 0.428, 0.000)
		colorSnow      (0.472, 0.463, 0.447, 1.000)
		BumpHeight      6.23413
		BumpOffset      1.24683
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.02207
		Period          0.427521
		Eccentricity    0.406674
		Inclination     63.4054
		AscendingNode   -17.6667
		ArgOfPericenter -58.7918
		MeanAnomaly     72.2186
	}
}

DwarfMoon	"Crait System 9.D9"
{
	ParentBody     "Crait System 9"
	Class	       "Asteroid"

	Mass            1.39255e-010
	Radius          7.58339
	InertiaMoment   0.397218

	Obliquity       -10.1337
	EqAscendNode    99.743
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.528 0.524 0.516)

	Surface
	{
		SurfStyle       0.790008
		OceanStyle      0.524614
		Randomize      (-0.839, -0.112, -0.656)
		colorDistMagn   0.394517
		colorDistFreq   0.024022
		detailScale     207.077
		colorConversion true
		snowLevel       2
		tropicLatitude  0.225332
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.290751
		terraceProb     0.122254
		erosion         0
		montesMagn      0.561229
		montesFreq      2.6191
		montesSpiky     0.962348
		montesFraction  0.408699
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.091066
		hillsFraction   0.627234
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232924
		craterFreq      0.204201
		craterDensity   0.800467
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.423515
		volcanoTemp     1138.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.206, 0.178, 0.144, 0.000)
		colorShelf     (0.211, 0.183, 0.165, 0.000)
		colorBeach     (0.248, 0.215, 0.196, 0.000)
		colorDesert    (0.269, 0.230, 0.191, 0.000)
		colorLowland   (0.296, 0.246, 0.217, 0.000)
		colorUpland    (0.328, 0.299, 0.263, 0.000)
		colorRock      (0.354, 0.325, 0.284, 0.000)
		colorSnow      (0.386, 0.346, 0.299, 1.000)
		BumpHeight      6.82505
		BumpOffset      1.36501
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0226038
		Period          0.443125
		Eccentricity    0.0557253
		Inclination     -10.1337
		AscendingNode   99.743
		ArgOfPericenter -10.7092
		MeanAnomaly     50.0986
	}
}

DwarfMoon	"Crait System 9.D10"
{
	ParentBody     "Crait System 9"
	Class	       "Asteroid"

	Mass            2.203e-010
	Radius          8.46835
	InertiaMoment   0.398695

	RotationPeriod  2673.93
	Obliquity       -74.5469
	EqAscendNode    25.4196

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.507 0.502 0.497)

	Surface
	{
		SurfStyle       0.239884
		OceanStyle      0.0121011
		Randomize      (-0.958, 0.568, -0.613)
		colorDistMagn   0.583585
		colorDistFreq   0.0466699
		detailScale     231.242
		colorConversion true
		snowLevel       2
		tropicLatitude  0.640364
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.560794
		terraceProb     0.163251
		erosion         0
		montesMagn      0.374259
		montesFreq      2.40079
		montesSpiky     0.950962
		montesFraction  0.758392
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.173661
		hillsFraction   0.594925
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218935
		craterFreq      0.268143
		craterDensity   1.00953
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.453988
		volcanoTemp     1113.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.203, 0.201, 0.199, 0.000)
		colorShelf     (0.215, 0.214, 0.211, 0.000)
		colorBeach     (0.228, 0.226, 0.223, 0.000)
		colorDesert    (0.241, 0.239, 0.236, 0.000)
		colorLowland   (0.253, 0.251, 0.248, 0.000)
		colorUpland    (0.266, 0.264, 0.261, 0.000)
		colorRock      (0.279, 0.276, 0.273, 0.000)
		colorSnow      (0.291, 0.289, 0.286, 1.000)
		BumpHeight      7.62152
		BumpOffset      1.5243
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0230921
		Period          0.457561
		Eccentricity    0.224089
		Inclination     -74.5469
		AscendingNode   25.4196
		ArgOfPericenter 171.15
		MeanAnomaly     102.104
	}
}

DwarfMoon	"Crait System 9.D11"
{
	ParentBody     "Crait System 9"
	Class	       "Asteroid"

	Mass            3.3836e-010
	Radius          9.36356
	InertiaMoment   0.399658

	Obliquity       46.9894
	EqAscendNode    118.11
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.671 0.669 0.666)

	Surface
	{
		SurfStyle       0.479787
		OceanStyle      0.436828
		Randomize      (0.373, 0.436, 0.601)
		colorDistMagn   0.876282
		colorDistFreq   0.0483397
		detailScale     255.688
		colorConversion true
		snowLevel       2
		tropicLatitude  0.696831
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.637879
		terraceProb     0.360412
		erosion         0
		montesMagn      0.403188
		montesFreq      3.86361
		montesSpiky     0.96241
		montesFraction  0.400277
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.191825
		hillsFraction   0.565927
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242349
		craterFreq      0.24381
		craterDensity   0.604026
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.479468
		volcanoTemp     1412.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.268, 0.268, 0.266, 0.000)
		colorShelf     (0.285, 0.284, 0.283, 0.000)
		colorBeach     (0.302, 0.301, 0.300, 0.000)
		colorDesert    (0.319, 0.318, 0.316, 0.000)
		colorLowland   (0.336, 0.335, 0.333, 0.000)
		colorUpland    (0.352, 0.351, 0.350, 0.000)
		colorRock      (0.369, 0.368, 0.366, 0.000)
		colorSnow      (0.386, 0.385, 0.383, 1.000)
		BumpHeight      8.4272
		BumpOffset      1.68544
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0236883
		Period          0.475396
		Eccentricity    0.023928
		Inclination     46.9894
		AscendingNode   118.11
		ArgOfPericenter -169.729
		MeanAnomaly     17.1531
	}
}

DwarfMoon	"Crait System 9.D12"
{
	ParentBody     "Crait System 9"
	Class	       "Asteroid"

	Mass            5.07442e-010
	Radius          12.8898
	InertiaMoment   0.397515

	Obliquity       -26.7688
	EqAscendNode    -49.1136
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.656 0.616 0.579)

	Surface
	{
		SurfStyle       0.655736
		OceanStyle      0.708187
		Randomize      (-0.873, 0.739, 0.520)
		colorDistMagn   0.775807
		colorDistFreq   0.0579185
		detailScale     351.977
		colorConversion true
		snowLevel       2
		tropicLatitude  0.747404
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.660844
		terraceProb     0.278399
		erosion         0
		montesMagn      0.638654
		montesFreq      2.82748
		montesSpiky     0.986492
		montesFraction  0.370439
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.506516
		hillsFraction   0.570557
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24576
		craterFreq      0.155103
		craterDensity   0.977732
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.539719
		volcanoTemp     1894.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.256, 0.209, 0.162, 0.000)
		colorShelf     (0.262, 0.216, 0.185, 0.000)
		colorBeach     (0.308, 0.252, 0.220, 0.000)
		colorDesert    (0.334, 0.271, 0.214, 0.000)
		colorLowland   (0.367, 0.289, 0.243, 0.000)
		colorUpland    (0.407, 0.351, 0.295, 0.000)
		colorRock      (0.439, 0.382, 0.318, 0.000)
		colorSnow      (0.479, 0.406, 0.336, 1.000)
		BumpHeight      11.6008
		BumpOffset      2.32016
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0243067
		Period          0.494131
		Eccentricity    0.0325101
		Inclination     -26.7688
		AscendingNode   -49.1136
		ArgOfPericenter 27.1788
		MeanAnomaly     150.089
	}
}

DwarfMoon	"Crait System 9.D13"
{
	ParentBody     "Crait System 9"
	Class	       "Asteroid"

	Mass            7.46302e-010
	Radius          13.3663
	InertiaMoment   0.398846

	RotationPeriod  6011.05
	Obliquity       67.1956
	EqAscendNode    -5.20329

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.758 0.757 0.755)

	Surface
	{
		SurfStyle       0.302838
		OceanStyle      0.314925
		Randomize      (0.923, 0.918, 0.690)
		colorDistMagn   0.643063
		colorDistFreq   0.137553
		detailScale     364.99
		colorConversion true
		snowLevel       2
		tropicLatitude  0.717992
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.647995
		terraceProb     0.272726
		erosion         0
		montesMagn      0.60693
		montesFreq      2.82916
		montesSpiky     0.958389
		montesFraction  0.661823
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.467402
		hillsFraction   0.619424
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254941
		craterFreq      0.198583
		craterDensity   0.971368
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.571211
		volcanoTemp     1778.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.303, 0.303, 0.302, 0.000)
		colorShelf     (0.322, 0.322, 0.321, 0.000)
		colorBeach     (0.341, 0.341, 0.340, 0.000)
		colorDesert    (0.360, 0.360, 0.359, 0.000)
		colorLowland   (0.379, 0.379, 0.378, 0.000)
		colorUpland    (0.398, 0.397, 0.397, 0.000)
		colorRock      (0.417, 0.416, 0.415, 0.000)
		colorSnow      (0.436, 0.435, 0.434, 1.000)
		BumpHeight      12.0297
		BumpOffset      2.40594
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0249638
		Period          0.514303
		Eccentricity    0.224226
		Inclination     67.1956
		AscendingNode   -5.20329
		ArgOfPericenter -112.836
		MeanAnomaly     -35.7602
	}
}

DwarfMoon	"Crait System 9.D14"
{
	ParentBody     "Crait System 9"
	Class	       "Asteroid"

	Mass            1.08003e-009
	Radius          14.4671
	InertiaMoment   0.399784

	Obliquity       -20.295
	EqAscendNode    -77.5154
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.619 0.612 0.608)

	Surface
	{
		SurfStyle       0.462545
		OceanStyle      0.677834
		Randomize      (0.365, 0.911, -0.913)
		colorDistMagn   0.933586
		colorDistFreq   0.146288
		detailScale     395.047
		colorConversion true
		snowLevel       2
		tropicLatitude  0.520791
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.679074
		terraceProb     0.197137
		erosion         0
		montesMagn      0.382472
		montesFreq      3.01286
		montesSpiky     0.896423
		montesFraction  0.67147
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.633271
		hillsFraction   0.688612
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.212091
		craterFreq      0.173761
		craterDensity   0.757433
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.522159
		volcanoTemp     1963.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.247, 0.245, 0.243, 0.000)
		colorShelf     (0.263, 0.260, 0.258, 0.000)
		colorBeach     (0.278, 0.275, 0.274, 0.000)
		colorDesert    (0.294, 0.291, 0.289, 0.000)
		colorLowland   (0.309, 0.306, 0.304, 0.000)
		colorUpland    (0.325, 0.321, 0.319, 0.000)
		colorRock      (0.340, 0.337, 0.334, 0.000)
		colorSnow      (0.356, 0.352, 0.350, 1.000)
		BumpHeight      13.0204
		BumpOffset      2.60407
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.025289
		Period          0.524387
		Eccentricity    0.0988191
		Inclination     -20.295
		AscendingNode   -77.5154
		ArgOfPericenter 31.4038
		MeanAnomaly     -139.086
	}
}

DwarfMoon	"Crait System 9.D15"
{
	ParentBody     "Crait System 9"
	Class	       "Asteroid"

	Mass            1.54213e-009
	Radius          15.6316
	InertiaMoment   0.397766

	Obliquity       88.3796
	EqAscendNode    -179.529
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.551 0.465 0.417)

	Surface
	{
		SurfStyle       0.755173
		OceanStyle      0.147927
		Randomize      (0.952, -0.278, 0.695)
		colorDistMagn   0.872547
		colorDistFreq   0.148459
		detailScale     426.848
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00821409
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.556117
		terraceProb     0.374284
		erosion         0
		montesMagn      0.451812
		montesFreq      2.96942
		montesSpiky     0.929772
		montesFraction  0.75473
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.698396
		hillsFraction   0.53486
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258866
		craterFreq      0.155095
		craterDensity   1.03314
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.499983
		volcanoTemp     1727.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.215, 0.158, 0.117, 0.000)
		colorShelf     (0.220, 0.163, 0.133, 0.000)
		colorBeach     (0.259, 0.191, 0.158, 0.000)
		colorDesert    (0.281, 0.205, 0.154, 0.000)
		colorLowland   (0.308, 0.219, 0.175, 0.000)
		colorUpland    (0.341, 0.265, 0.213, 0.000)
		colorRock      (0.369, 0.288, 0.229, 0.000)
		colorSnow      (0.402, 0.307, 0.242, 1.000)
		BumpHeight      14.0685
		BumpOffset      2.81369
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0258967
		Period          0.5434
		Eccentricity    0.262868
		Inclination     88.3796
		AscendingNode   -179.529
		ArgOfPericenter 129.102
		MeanAnomaly     -76.6301
	}
}

DwarfMoon	"Crait System 9.D16"
{
	ParentBody     "Crait System 9"
	Class	       "Asteroid"

	Mass            2.17739e-009
	Radius          22.0146
	InertiaMoment   0.398991

	RotationPeriod  3229.49
	Obliquity       16.9977
	EqAscendNode    171.249

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.796 0.754 0.722)

	Surface
	{
		SurfStyle       0.331289
		OceanStyle      0.344603
		Randomize      (0.167, -0.032, 0.906)
		colorDistMagn   0.287203
		colorDistFreq   0.251382
		detailScale     601.146
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0445952
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.580472
		terraceProb     0.104202
		erosion         0
		montesMagn      0.479265
		montesFreq      3.41268
		montesSpiky     0.979254
		montesFraction  0.445732
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.2174
		hillsFraction   0.703025
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242615
		craterFreq      0.251505
		craterDensity   0.814767
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.615396
		volcanoTemp     1696.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.318, 0.302, 0.289, 0.000)
		colorShelf     (0.338, 0.321, 0.307, 0.000)
		colorBeach     (0.358, 0.339, 0.325, 0.000)
		colorDesert    (0.378, 0.358, 0.343, 0.000)
		colorLowland   (0.398, 0.377, 0.361, 0.000)
		colorUpland    (0.418, 0.396, 0.379, 0.000)
		colorRock      (0.438, 0.415, 0.397, 0.000)
		colorSnow      (0.458, 0.434, 0.415, 1.000)
		BumpHeight      19.8132
		BumpOffset      3.96264
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.026189
		Period          0.552629
		Eccentricity    0.363464
		Inclination     16.9977
		AscendingNode   171.249
		ArgOfPericenter 106.543
		MeanAnomaly     -15.1968
	}
}

DwarfMoon	"Crait System 9.D17"
{
	ParentBody     "Crait System 9"
	Class	       "Asteroid"

	Mass            3.04572e-009
	Radius          21.5261
	InertiaMoment   0.399909

	RotationPeriod  12446.1
	Obliquity       -43.6792
	EqAscendNode    -30.5262

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.477 0.469 0.465)

	Surface
	{
		SurfStyle       0.0585321
		OceanStyle      0.366541
		Randomize      (-0.047, 0.575, -0.910)
		colorDistMagn   0.699122
		colorDistFreq   0.285823
		detailScale     587.807
		colorConversion true
		snowLevel       2
		tropicLatitude  0.993686
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.632072
		terraceProb     0.265315
		erosion         0
		montesMagn      0.493563
		montesFreq      2.5281
		montesSpiky     0.854607
		montesFraction  0.604799
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.04891
		hillsFraction   0.612886
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227252
		craterFreq      0.254889
		craterDensity   0.936141
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.388035
		volcanoTemp     1554.95
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.191, 0.187, 0.186, 0.000)
		colorShelf     (0.203, 0.199, 0.198, 0.000)
		colorBeach     (0.214, 0.211, 0.209, 0.000)
		colorDesert    (0.226, 0.223, 0.221, 0.000)
		colorLowland   (0.238, 0.234, 0.233, 0.000)
		colorUpland    (0.250, 0.246, 0.244, 0.000)
		colorRock      (0.262, 0.258, 0.256, 0.000)
		colorSnow      (0.274, 0.270, 0.267, 1.000)
		BumpHeight      19.3735
		BumpOffset      3.87471
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0266706
		Period          0.56794
		Eccentricity    0.367671
		Inclination     -43.6792
		AscendingNode   -30.5262
		ArgOfPericenter -72.8308
		MeanAnomaly     -17.0709
	}
}

Planet	"Crait System 10"
{
	ParentBody     "Crait System"
	Class	       "IceWorld"

	Mass            0.0389234
	Radius          2753.46
	InertiaMoment   0.349265

	Oblateness      0.00356552

	RotationPeriod  34.4827
	Obliquity       22.7593
	EqAscendNode    124.731

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.756 0.572 0.505)

	Surface
	{
		SurfStyle       0.208158
		OceanStyle      0.94681
		Randomize      (-0.431, 0.528, -0.344)
		colorDistMagn   0.0742569
		colorDistFreq   310.073
		detailScale     7082.04
		colorConversion true
		drivenDarkening 0
		seaLevel        0.193237
		snowLevel       2
		tropicLatitude  0.40447
		icecapLatitude  1
		icecapHeight    0.193237
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.02213
		venusFreq       1.38743
		venusMagn       0
		mareFreq        2.00832
		mareDensity     0.0069248
		terraceProb     0.224382
		erosion         0
		montesMagn      0.203402
		montesFreq      134.97
		montesSpiky     0.913717
		montesFraction  0.183138
		dunesMagn       0.0400235
		dunesFreq       3583.91
		dunesFraction   0.752389
		hillsMagn       0.104644
		hillsFreq       261.922
		hillsFraction   0.372021
		hills2Fraction  0.182158
		riversMagn      63.7904
		riversFreq      3.78956
		riversSin       6.3068
		riversOctaves   0
		canyonsMagn     0.470637
		canyonsFreq     0.798441
		canyonFraction  0
		cracksMagn      0.0335419
		cracksFreq      1.91702
		cracksOctaves   3
		craterMagn      0.618689
		craterFreq      9.28578
		craterDensity   0.858987
		craterOctaves   12
		craterRayedFactor 0.152466
		volcanoMagn     0.610561
		volcanoFreq     0.535497
		volcanoDensity  0.246359
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.157322
		volcanoRadius   0.397004
		volcanoTemp     1587.09
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.756, 0.572, 0.505, 0.500)
		colorShelf     (0.718, 0.543, 0.480, 0.500)
		colorBeach     (0.529, 0.400, 0.354, 0.750)
		colorDesert    (0.643, 0.486, 0.430, 1.000)
		colorLowland   (0.665, 0.503, 0.445, 1.000)
		colorUpland    (0.703, 0.532, 0.470, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.665, 0.503, 0.445, 1.000)
		colorUpPlants  (0.703, 0.532, 0.470, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.999998
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
		Height          111.641
		Density         1.95483e-007
		Pressure        2.18963e-008
		Greenhouse      0.000545032
		Bright          0.721476
		Opacity         0
		SkyLight        0.240492
		Hue             -0.0403268
		Saturation      1

		Composition
		{
			Ar    	98.4224
			O2    	1.57758
			Kr    	2.54631e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   6.59892
		Period          22.5533
		Eccentricity    0.0208304
		Inclination     -2.09782
		AscendingNode   119.478
		ArgOfPericenter 222.646
		MeanAnomaly     97.177
	}
}

DwarfMoon	"Crait System 10.D1"
{
	ParentBody     "Crait System 10"
	Class	       "Asteroid"

	Mass            6.00216e-008
	Radius          56.9186
	InertiaMoment   0.399368

	Oblateness      0.249

	Obliquity       -0.00622262
	EqAscendNode    119.826
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.616 0.609 0.606)

	Surface
	{
		SurfStyle       0.211581
		OceanStyle      0.906528
		Randomize      (-0.165, -0.068, 0.725)
		colorDistMagn   0.975556
		colorDistFreq   2.7397
		detailScale     1554.26
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.367955
		terraceProb     0.281805
		erosion         0
		montesMagn      0.375452
		montesFreq      3.09848
		montesSpiky     0.8182
		montesFraction  0.224531
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.06765
		hillsFraction   0.506713
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249479
		craterFreq      0.164923
		craterDensity   0.983194
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.442267
		volcanoTemp     1565.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.246, 0.243, 0.242, 0.000)
		colorShelf     (0.262, 0.259, 0.257, 0.000)
		colorBeach     (0.277, 0.274, 0.273, 0.000)
		colorDesert    (0.293, 0.289, 0.288, 0.000)
		colorLowland   (0.308, 0.304, 0.303, 0.000)
		colorUpland    (0.323, 0.320, 0.318, 0.000)
		colorRock      (0.339, 0.335, 0.333, 0.000)
		colorSnow      (0.354, 0.350, 0.348, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.27553e-005
		Period          0.000819519
		Eccentricity    5.75663e-005
		Inclination     -0.00622262
		AscendingNode   119.826
		ArgOfPericenter -73.4071
		MeanAnomaly     111.675
	}
}

DwarfMoon	"Crait System 10.D2"
{
	ParentBody     "Crait System 10"
	Class	       "Asteroid"

	Mass            8.16834e-008
	Radius          60.515
	InertiaMoment   0.396728

	Oblateness      0.0157825

	Obliquity       -1.01877
	EqAscendNode    93.5176
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.518 0.421 0.300)

	Surface
	{
		SurfStyle       0.632714
		OceanStyle      0.0918426
		Randomize      (-0.886, -0.096, -0.852)
		colorDistMagn   0.500271
		colorDistFreq   1.33921
		detailScale     1652.46
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0243585
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.308057
		terraceProb     0.426542
		erosion         0
		montesMagn      0.547462
		montesFreq      2.62137
		montesSpiky     0.977882
		montesFraction  0.406362
		dunesFraction   0
		hillsMagn       0
		hillsFreq       10.3326
		hillsFraction   0.585053
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.270573
		craterFreq      0.209018
		craterDensity   0.810988
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50911
		volcanoTemp     1254.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.202, 0.143, 0.084, 0.000)
		colorShelf     (0.207, 0.147, 0.096, 0.000)
		colorBeach     (0.243, 0.172, 0.114, 0.000)
		colorDesert    (0.264, 0.185, 0.111, 0.000)
		colorLowland   (0.290, 0.198, 0.126, 0.000)
		colorUpland    (0.321, 0.240, 0.153, 0.000)
		colorRock      (0.347, 0.261, 0.165, 0.000)
		colorSnow      (0.378, 0.278, 0.174, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000134929
		Period          0.00459442
		Eccentricity    0.0109
		Inclination     -1.01877
		AscendingNode   93.5176
		ArgOfPericenter 54.227
		MeanAnomaly     -86.1089
	}
}

Moon	"Crait System 10.1"
{
	ParentBody     "Crait System 10"
	Class	       "IceWorld"

	Mass            0.000429245
	Radius          625.274
	InertiaMoment   0.397829

	Obliquity       -1.29545
	EqAscendNode    100.139
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.552 0.544 0.537)

	Surface
	{
		SurfStyle       0.663425
		OceanStyle      0.651897
		Randomize      (0.829, 0.504, 0.645)
		colorDistMagn   0.068638
		colorDistFreq   77.8218
		detailScale     1608.24
		colorConversion true
		drivenDarkening 0
		seaLevel        0.141168
		snowLevel       2
		tropicLatitude  0.0290199
		icecapLatitude  0.454147
		icecapHeight    0.182204
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.97698
		venusFreq       0.799967
		venusMagn       0
		mareFreq        0.0173162
		mareDensity     0.000293697
		terraceProb     0.852502
		erosion         0
		montesMagn      0.0574301
		montesFreq      37.9883
		montesSpiky     0.897433
		montesFraction  0.599279
		dunesMagn       0.0293766
		dunesFreq       830.936
		dunesFraction   0.744911
		hillsMagn       0.132927
		hillsFreq       57.19
		hillsFraction   0.245692
		hills2Fraction  0.0602181
		riversMagn      62.9771
		riversFreq      2.92671
		riversSin       4.45865
		riversOctaves   0
		canyonsMagn     0.62233
		canyonsFreq     0.163341
		canyonFraction  0
		cracksMagn      0.0463668
		cracksFreq      0.168548
		cracksOctaves   0
		craterMagn      0.570956
		craterFreq      2.38044
		craterDensity   0.995115
		craterOctaves   9
		craterRayedFactor 0.223199
		volcanoMagn     0.191605
		volcanoFreq     0.581601
		volcanoDensity  0.26536
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.319435
		volcanoRadius   0.138954
		volcanoTemp     1607.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.353, 0.348, 0.360, 0.250)
		colorShelf     (0.387, 0.397, 0.408, 0.250)
		colorBeach     (0.315, 0.294, 0.312, 0.200)
		colorDesert    (0.293, 0.267, 0.274, 0.200)
		colorLowland   (0.215, 0.207, 0.226, 0.200)
		colorUpland    (0.409, 0.403, 0.408, 0.250)
		colorRock      (0.640, 0.630, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.215, 0.207, 0.226, 0.200)
		colorUpPlants  (0.409, 0.403, 0.408, 0.250)
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
		SemiMajorAxis   0.000209363
		Period          0.00883166
		Eccentricity    0.00728774
		Inclination     -1.29545
		AscendingNode   100.139
		ArgOfPericenter -122.673
		MeanAnomaly     31.252
	}
}

Planet	"Crait System 11"
{
	ParentBody     "Crait System"
	Class	       "GasGiant"

	Mass            134.799
	Radius          62754.7
	InertiaMoment   0.248826

	Oblateness      0.0797583

	RotationPeriod  11.2737
	Obliquity       -68.0774
	EqAscendNode    12.9773

	AlbedoBond      0.459101
	AlbedoGeom      0.550921
	Brightness      2

	Surface
	{
		SurfStyle       0.820581
		Randomize      (0.109, -0.922, -0.805)
		detailScale     161409
		colorConversion true
		tropicLatitude  0.940792
		icecapLatitude  1
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     5.70212
		stripeFluct     0.439085
		stripeTwist     9.62664
		cycloneMagn     12.9562
		cycloneFreq     0.7681
		cycloneDensity  0.404736
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
		BumpHeight      16.9488
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          49.1563
		Velocity        -666.941
		BumpHeight      32.2072
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.25067
		mainOctaves     12
		Coverage        0.0910085
		stripeZones     5.70212
		stripeFluct     0.439085
		stripeTwist     9.62664
	}

	Clouds
	{
		Height          81.3633
		Velocity        1271.25
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		ModulateColor  (1.000 1.000 1.000 0.800)
		mainFreq        1.25067
		mainOctaves     12
		Coverage        0.0910085
		stripeZones     5.70212
		stripeFluct     0.439085
		stripeTwist     9.62664
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          339.021
		Density         11797.9
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.0196025
		Saturation      0.606876

		Composition
		{
			H2    	93.5863
			He    	6.4125
			Ne    	0.00112984
			N2    	3.76542e-005
		}
	}

	Aurora
	{
		Height      1463.4
		NorthLat    82.9474
		NorthLon    -59.2949
		NorthRadius 16953.5
		NorthWidth  11364.8
		NorthRings  2
		NorthBright 1
		NorthParticles 10000
		SouthLat    -81.9963
		SouthLon    116.106
		SouthRadius 24107.9
		SouthWidth  12176.5
		SouthRings  5
		SouthBright 1
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	Rings
	{
		InnerRadius     82867
		OuterRadius     119854
		RotationPeriod  8.55892
		RotationOffset  0
		FrontBright     0.579613
		BackBright      0.633859
		Density         0.850707
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   10.9931
		Period          48.4762
		Eccentricity    0.0627044
		Inclination     -2.18521
		AscendingNode   15.4274
		ArgOfPericenter 288.517
		MeanAnomaly     123.959
	}
}

DwarfMoon	"Crait System 11.D1"
{
	ParentBody     "Crait System 11"
	Class	       "Asteroid"

	Mass            3.20134e-006
	Radius          190.7
	InertiaMoment   0.397649

	Oblateness      0.205683

	Obliquity       0.00619045
	EqAscendNode    -135.751
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.771 0.767 0.766)

	Surface
	{
		SurfStyle       0.566614
		OceanStyle      0.706145
		Randomize      (-0.140, 0.148, 0.768)
		colorDistMagn   0.839629
		colorDistFreq   27.4246
		detailScale     5207.39
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.758032
		terraceProb     0.177918
		erosion         0
		montesMagn      0.467653
		montesFreq      3.45661
		montesSpiky     0.96892
		montesFraction  0.691894
		dunesFraction   0
		hillsMagn       0
		hillsFreq       82.0574
		hillsFraction   0.656981
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220056
		craterFreq      1.57906
		craterDensity   0.833829
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.474065
		volcanoTemp     1201.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.301, 0.261, 0.214, 0.000)
		colorShelf     (0.308, 0.269, 0.245, 0.000)
		colorBeach     (0.362, 0.315, 0.291, 0.000)
		colorDesert    (0.393, 0.338, 0.283, 0.000)
		colorLowland   (0.431, 0.361, 0.322, 0.000)
		colorUpland    (0.478, 0.437, 0.391, 0.000)
		colorRock      (0.516, 0.476, 0.421, 0.000)
		colorSnow      (0.562, 0.506, 0.444, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00080571
		Period          0.00113921
		Eccentricity    4.92435e-005
		Inclination     0.00619045
		AscendingNode   -135.751
		ArgOfPericenter -37.1971
		MeanAnomaly     145.04
	}
}

Moon	"Crait System 11.1"
{
	ParentBody     "Crait System 11"
	Class	       "Desert"

	Mass            0.114989
	Radius          3900.51
	InertiaMoment   0.334738

	Oblateness      0.00824687

	Obliquity       -0.611647
	EqAscendNode    71.1742
	TidalLocked     true

	AlbedoBond      0.397817
	AlbedoGeom      0.47738
	Brightness      2
	Color          (0.692 0.631 0.555)

	Surface
	{
		SurfStyle       0.615677
		OceanStyle      0.266206
		Randomize      (0.157, 0.241, -0.874)
		colorDistMagn   0.071868
		colorDistFreq   451.138
		detailScale     10032.3
		colorConversion true
		seaLevel        0.105165
		snowLevel       2
		tropicLatitude  0.0173625
		icecapLatitude  10
		icecapHeight    0.135055
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        0.788797
		venusFreq       0.582739
		venusMagn       0.367981
		mareFreq        1.78999
		mareDensity     0.0189649
		terraceProb     0.203234
		erosion         0
		montesMagn      0.183818
		montesFreq      236.334
		montesSpiky     0.840514
		montesFraction  0.137713
		dunesMagn       0.0571286
		dunesFreq       25.9606
		dunesFraction   0.806468
		hillsMagn       0.144407
		hillsFreq       443.441
		hillsFraction   0
		hills2Fraction  0
		riversMagn      61.8842
		riversFreq      3.20673
		riversSin       3.68582
		riversOctaves   0
		canyonsMagn     0.022357
		canyonsFreq     93.2216
		canyonFraction  0
		cracksMagn      0.133054
		cracksFreq      0.220035
		cracksOctaves   0
		craterMagn      0.535321
		craterFreq      10.0589
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.680922
		volcanoFreq     0.676676
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.712309
		volcanoRadius   0.565074
		volcanoTemp     1659.17
		lavaCoverTidal  0.656452
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.54219
		stripeTwist     0
		cycloneMagn     2.77427
		cycloneFreq     1.03329
		cycloneDensity  0.282294
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
		Height          36.9819
		Velocity        138.009
		BumpHeight      6.01939
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.01966
		mainOctaves     10
		Coverage        0.395634
		stripeZones     2.54219
		stripeTwist     0
	}

	Clouds
	{
		Height          63.9639
		Velocity        104.999
		BumpHeight      5.06029
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.01966
		mainOctaves     10
		Coverage        0.395634
		stripeZones     2.54219
		stripeTwist     0
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Venus"
		Height          195.026
		Density         7.81765
		Pressure        24.7058
		Greenhouse      255.436
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.043339
		Saturation      0.652381

		Composition
		{
			H2O   	80.589
			CO2   	18.4774
			SO2   	0.923852
			N2    	0.00911467
			CO    	0.000423632
			Ar    	0.000247606
		}
	}

	Aurora
	{
		Height      62.9347
		NorthLat    88.9222
		NorthLon    -8.03947
		NorthRadius 1302.06
		NorthWidth  497.802
		NorthRings  3
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -90
		SouthLon    179.657
		SouthRadius 917.033
		SouthWidth  335.668
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
		SemiMajorAxis   0.00135024
		Period          0.00247039
		Eccentricity    0.0477419
		Inclination     -0.611647
		AscendingNode   71.1742
		ArgOfPericenter 164.545
		MeanAnomaly     -73.9067
	}
}

Moon	"Crait System 11.2"
{
	ParentBody     "Crait System 11"
	Class	       "Selena"

	Mass            2.54458
	Radius          10703.7
	InertiaMoment   0.331746

	Oblateness      0.00103228

	Obliquity       0.38099
	EqAscendNode    -58.3927
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.422 0.420 0.417)

	Surface
	{
		SurfStyle       0.85714
		OceanStyle      0.224761
		Randomize      (-0.578, -0.255, 0.050)
		colorDistMagn   0.0526963
		colorDistFreq   1293
		detailScale     27530.6
		colorConversion true
		drivenDarkening 0
		seaLevel        0.167425
		snowLevel       2
		tropicLatitude  0.0116113
		icecapLatitude  0.946409
		icecapHeight    0.171655
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.79365
		venusFreq       1.16555
		venusMagn       0
		mareFreq        1.92814
		mareDensity     0.137848
		terraceProb     0.147126
		erosion         0
		montesMagn      0.192852
		montesFreq      367.37
		montesSpiky     0.822517
		montesFraction  0.288685
		dunesMagn       0.0306173
		dunesFreq       14300.1
		dunesFraction   0.0209799
		hillsMagn       0.130295
		hillsFreq       1361.15
		hillsFraction   0.740025
		hills2Fraction  0
		riversMagn      58.0864
		riversFreq      3.84393
		riversSin       6.50769
		riversOctaves   0
		canyonsMagn     0.543861
		canyonsFreq     4.58715
		canyonFraction  0.732511
		cracksMagn      0.0257498
		cracksFreq      2.34073
		cracksOctaves   0
		craterMagn      0.563935
		craterFreq      31.2437
		craterDensity   0.518099
		craterOctaves   7.9334
		craterRayedFactor 0.0804327
		volcanoMagn     0.629003
		volcanoFreq     0.610627
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.249801
		volcanoRadius   0.514534
		volcanoTemp     1643.48
		lavaCoverTidal  0.481477
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.400, 0.350, 0.320, 0.000)
		colorShelf     (0.470, 0.410, 0.380, 0.000)
		colorBeach     (0.236, 0.197, 0.175, 0.000)
		colorDesert    (0.215, 0.185, 0.154, 0.000)
		colorLowland   (0.164, 0.143, 0.117, 0.000)
		colorUpland    (0.278, 0.252, 0.217, 0.000)
		colorRock      (0.670, 0.620, 0.550, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.985988
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
		Height          122.912
		Density         0.00140123
		Pressure        0.000822998
		Greenhouse      0.651017
		Bright          4.25894
		Opacity         0
		SkyLight        1.41965
		Hue             0.00578301
		Saturation      1

		Composition
		{
			CH4   	50.4623
			CO2   	19.4221
			H2S   	13.2454
			C2H2  	7.3081
			H2    	4.93794
			NH3   	2.55521
			C2H6  	1.67383
			C2H4  	0.209537
			N2    	0.0849525
			C3H8  	0.0724091
			SO2   	0.0171825
			H2O   	0.00694537
			CO    	0.00371854
			Cl2   	0.000137267
			Ne    	8.29578e-005
			Ar    	4.77253e-005
			He    	4.58049e-005
		}
	}

	Aurora
	{
		Height      272.213
		NorthLat    79.2118
		NorthLon    -36.7009
		NorthRadius 2789.72
		NorthWidth  789.88
		NorthRings  2
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -90
		SouthLon    136.763
		SouthRadius 2624.67
		SouthWidth  812.026
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
		SemiMajorAxis   0.00264444
		Period          0.00671081
		Eccentricity    0.010461
		Inclination     0.38099
		AscendingNode   -58.3927
		ArgOfPericenter -68.1658
		MeanAnomaly     -60.6157
	}
}

Moon	"Crait System 11.3"
{
	ParentBody     "Crait System 11"
	Class	       "IceWorld"

	Mass            0.00139387
	Radius          923.695
	InertiaMoment   0.399026

	Obliquity       0.786645
	EqAscendNode    -59.4201
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.524 0.445 0.354)

	Surface
	{
		SurfStyle       0.393493
		OceanStyle      0.778835
		Randomize      (0.794, 0.344, -0.919)
		colorDistMagn   0.0843287
		colorDistFreq   108.431
		detailScale     2375.8
		colorConversion true
		drivenDarkening 0.7
		seaLevel        0.204732
		snowLevel       2
		tropicLatitude  0.0238467
		icecapLatitude  0.775221
		icecapHeight    0.224118
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.56704
		venusFreq       0.997873
		venusMagn       0
		mareFreq        0.239014
		mareDensity     0.000727263
		terraceProb     0.574459
		erosion         0
		montesMagn      0.0679771
		montesFreq      40.8311
		montesSpiky     0.901377
		montesFraction  0.947071
		dunesMagn       0.0439205
		dunesFreq       1225.42
		dunesFraction   0.110619
		hillsMagn       0.12847
		hillsFreq       96.2078
		hillsFraction   0.618747
		hills2Fraction  0.224164
		riversMagn      48.8091
		riversFreq      2.21775
		riversSin       6.95785
		riversOctaves   0
		canyonsMagn     0.494465
		canyonsFreq     0.280826
		canyonFraction  0
		cracksMagn      0.0506368
		cracksFreq      0.248956
		cracksOctaves   0
		craterMagn      0.591285
		craterFreq      2.60591
		craterDensity   0.795816
		craterOctaves   10
		craterRayedFactor 0
		volcanoMagn     0.18358
		volcanoFreq     0.770271
		volcanoDensity  0.194355
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.121423
		volcanoRadius   0.121619
		volcanoTemp     1226.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.524, 0.445, 0.354, 0.500)
		colorShelf     (0.497, 0.422, 0.337, 0.500)
		colorBeach     (0.367, 0.311, 0.248, 0.750)
		colorDesert    (0.445, 0.378, 0.301, 1.000)
		colorLowland   (0.461, 0.391, 0.312, 1.000)
		colorUpland    (0.487, 0.414, 0.330, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.461, 0.391, 0.312, 1.000)
		colorUpPlants  (0.487, 0.414, 0.330, 1.000)
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
		SemiMajorAxis   0.00370079
		Period          0.0112144
		Eccentricity    0.0254319
		Inclination     0.786645
		AscendingNode   -59.4201
		ArgOfPericenter 68.1693
		MeanAnomaly     172.6
	}
}

Moon	"Crait System 11.4"
{
	ParentBody     "Crait System 11"
	Class	       "IceWorld"

	Mass            0.000247577
	Radius          553.382
	InertiaMoment   0.398468

	Obliquity       0.0153047
	EqAscendNode    55.312
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.702 0.645 0.523)

	Surface
	{
		SurfStyle       0.409962
		OceanStyle      0.867145
		Randomize      (-0.163, 0.243, 0.422)
		colorDistMagn   0.0514632
		colorDistFreq   62.523
		detailScale     1423.33
		colorConversion true
		drivenDarkening 0.7
		seaLevel        0.24937
		snowLevel       2
		tropicLatitude  0.000488281
		icecapLatitude  0.75174
		icecapHeight    0.264007
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.07348
		venusFreq       1.03737
		venusMagn       0
		mareFreq        0
		mareDensity     0.000111158
		terraceProb     0.606631
		erosion         0
		montesMagn      0.066337
		montesFreq      22.4276
		montesSpiky     0.8617
		montesFraction  0.00393548
		dunesMagn       0.0217388
		dunesFreq       732.795
		dunesFraction   0.945219
		hillsMagn       0.112635
		hillsFreq       72.4581
		hillsFraction   0.0685507
		hills2Fraction  0.173785
		riversMagn      57.4479
		riversFreq      3.09464
		riversSin       4.95496
		riversOctaves   0
		canyonsMagn     0.428992
		canyonsFreq     0.173204
		canyonFraction  0
		cracksMagn      0.0305793
		cracksFreq      0.219686
		cracksOctaves   0
		craterMagn      0.637188
		craterFreq      1.23959
		craterDensity   0.97832
		craterOctaves   9
		craterRayedFactor 0.0644035
		volcanoMagn     0.162485
		volcanoFreq     0.799999
		volcanoDensity  0.208265
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.284241
		volcanoRadius   0.137795
		volcanoTemp     1426.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.702, 0.645, 0.523, 0.500)
		colorShelf     (0.667, 0.613, 0.497, 0.500)
		colorBeach     (0.491, 0.452, 0.366, 0.750)
		colorDesert    (0.597, 0.549, 0.445, 1.000)
		colorLowland   (0.618, 0.568, 0.461, 1.000)
		colorUpland    (0.653, 0.600, 0.487, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.618, 0.568, 0.461, 1.000)
		colorUpPlants  (0.653, 0.600, 0.487, 1.000)
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
		SemiMajorAxis   0.00517912
		Period          0.0185661
		Eccentricity    0.0440918
		Inclination     0.0153047
		AscendingNode   55.312
		ArgOfPericenter -160.626
		MeanAnomaly     13.9188
	}
}

Moon	"Crait System 11.5"
{
	ParentBody     "Crait System 11"
	Class	       "IceWorld"

	Mass            0.000374232
	Radius          597.46
	InertiaMoment   0.397753

	Obliquity       -0.570743
	EqAscendNode    -97.0628
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.615 0.609 0.602)

	Surface
	{
		SurfStyle       0.461097
		OceanStyle      0.290748
		Randomize      (-0.605, 0.240, 0.303)
		colorDistMagn   0.0526696
		colorDistFreq   73.0615
		detailScale     1536.7
		colorConversion true
		drivenDarkening 0.7
		seaLevel        0.284088
		snowLevel       2
		tropicLatitude  0.0131923
		icecapLatitude  0.522571
		icecapHeight    0.303437
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.8255
		venusFreq       1.55604
		venusMagn       0.213216
		mareFreq        0
		mareDensity     0.000308428
		terraceProb     0.185434
		erosion         0
		montesMagn      0.0579244
		montesFreq      27.3582
		montesSpiky     0.91373
		montesFraction  0.422348
		dunesMagn       0.0423214
		dunesFreq       792.22
		dunesFraction   0.979329
		hillsMagn       0.123919
		hillsFreq       63.447
		hillsFraction   0.666548
		hills2Fraction  0.107915
		riversMagn      67.1213
		riversFreq      3.65119
		riversSin       6.08927
		riversOctaves   0
		canyonsMagn     0.561355
		canyonsFreq     0.213161
		canyonFraction  0
		cracksMagn      0.0205371
		cracksFreq      0.222716
		cracksOctaves   0
		craterMagn      0.635066
		craterFreq      1.90772
		craterDensity   0.910993
		craterOctaves   9
		craterRayedFactor 0.244691
		volcanoMagn     0.183184
		volcanoFreq     0.637695
		volcanoDensity  0.201162
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.189663
		volcanoRadius   0.153114
		volcanoTemp     1747.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.184, 0.152, 0.133, 0.000)
		colorShelf     (0.228, 0.189, 0.169, 0.000)
		colorBeach     (0.344, 0.286, 0.253, 0.200)
		colorDesert    (0.314, 0.268, 0.223, 0.500)
		colorLowland   (0.240, 0.207, 0.169, 0.800)
		colorUpland    (0.406, 0.366, 0.313, 1.000)
		colorRock      (0.670, 0.620, 0.550, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.240, 0.207, 0.169, 0.800)
		colorUpPlants  (0.406, 0.366, 0.313, 1.000)
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
		SemiMajorAxis   0.007248
		Period          0.030737
		Eccentricity    0.0489532
		Inclination     -0.570743
		AscendingNode   -97.0628
		ArgOfPericenter -154.757
		MeanAnomaly     2.10986
	}
}

Moon	"Crait System 11.6"
{
	ParentBody     "Crait System 11"
	Class	       "IceWorld"

	Mass            0.000521431
	Radius          708.576
	InertiaMoment   0.396483

	Obliquity       -0.591074
	EqAscendNode    -47.0507
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.855 0.766 0.712)

	Surface
	{
		SurfStyle       0.169044
		OceanStyle      0.629737
		Randomize      (-0.984, 0.486, -0.713)
		colorDistMagn   0.060569
		colorDistFreq   102.261
		detailScale     1822.5
		colorConversion true
		drivenDarkening 0.578988
		seaLevel        0.270787
		snowLevel       2
		tropicLatitude  0.0189165
		icecapLatitude  0.963173
		icecapHeight    0.273857
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.76218
		venusFreq       0.620944
		venusMagn       0.145448
		mareFreq        0.0752393
		mareDensity     0.000305146
		terraceProb     0.335833
		erosion         0
		montesMagn      0.0594692
		montesFreq      29.3179
		montesSpiky     0.958965
		montesFraction  0.597465
		dunesMagn       0.038769
		dunesFreq       926.028
		dunesFraction   0.685925
		hillsMagn       0.125044
		hillsFreq       82.693
		hillsFraction   0.928622
		hills2Fraction  0.170536
		riversMagn      50.7939
		riversFreq      3.39787
		riversSin       5.64978
		riversOctaves   0
		canyonsMagn     0.594948
		canyonsFreq     0.209412
		canyonFraction  0
		cracksMagn      0.0713236
		cracksFreq      0.355405
		cracksOctaves   0
		craterMagn      0.62323
		craterFreq      1.42683
		craterDensity   0.926206
		craterOctaves   10
		craterRayedFactor 0.218497
		volcanoMagn     0.173164
		volcanoFreq     0.661155
		volcanoDensity  0.226073
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.314539
		volcanoRadius   0.130469
		volcanoTemp     1775.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.855, 0.766, 0.712, 0.500)
		colorShelf     (0.812, 0.728, 0.676, 0.500)
		colorBeach     (0.599, 0.537, 0.498, 0.750)
		colorDesert    (0.727, 0.651, 0.605, 1.000)
		colorLowland   (0.752, 0.674, 0.626, 1.000)
		colorUpland    (0.795, 0.713, 0.662, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.752, 0.674, 0.626, 1.000)
		colorUpPlants  (0.795, 0.713, 0.662, 1.000)
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
		SemiMajorAxis   0.0101433
		Period          0.0508867
		Eccentricity    0.0130708
		Inclination     -0.591074
		AscendingNode   -47.0507
		ArgOfPericenter 122.598
		MeanAnomaly     -123.382
	}
}

Moon	"Crait System 11.7"
{
	ParentBody     "Crait System 11"
	Class	       "IceWorld"

	Mass            0.000691424
	Radius          732.347
	InertiaMoment   0.399739

	Obliquity       -0.136634
	EqAscendNode    -75.664
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.819 0.722 0.687)

	Surface
	{
		SurfStyle       0.0514575
		OceanStyle      0.605807
		Randomize      (0.747, 0.655, 0.768)
		colorDistMagn   0.0627785
		colorDistFreq   91.3252
		detailScale     1883.64
		colorConversion true
		drivenDarkening 0.413721
		seaLevel        0.232459
		snowLevel       2
		tropicLatitude  0.00376641
		icecapLatitude  0.909211
		icecapHeight    0.237758
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.86874
		venusFreq       1.10858
		venusMagn       0
		mareFreq        0.095721
		mareDensity     0.000368289
		terraceProb     0.146691
		erosion         0
		montesMagn      0.0620265
		montesFreq      36.5581
		montesSpiky     0.983745
		montesFraction  0.855108
		dunesMagn       0.0311269
		dunesFreq       998.467
		dunesFraction   0.136618
		hillsMagn       0.105152
		hillsFreq       69.8465
		hillsFraction   0.652886
		hills2Fraction  0.256312
		riversMagn      63.6727
		riversFreq      2.38057
		riversSin       3.68532
		riversOctaves   0
		canyonsMagn     0.646531
		canyonsFreq     0.178867
		canyonFraction  0
		cracksMagn      0.072124
		cracksFreq      0.426484
		cracksOctaves   0
		craterMagn      0.531884
		craterFreq      2.12232
		craterDensity   0.951965
		craterOctaves   10
		craterRayedFactor 0
		volcanoMagn     0.204245
		volcanoFreq     0.645617
		volcanoDensity  0.181743
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.189304
		volcanoRadius   0.151683
		volcanoTemp     1385.33
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.819, 0.722, 0.687, 0.500)
		colorShelf     (0.778, 0.686, 0.652, 0.500)
		colorBeach     (0.573, 0.506, 0.481, 0.750)
		colorDesert    (0.696, 0.614, 0.584, 1.000)
		colorLowland   (0.721, 0.636, 0.604, 1.000)
		colorUpland    (0.762, 0.672, 0.638, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.721, 0.636, 0.604, 1.000)
		colorUpPlants  (0.762, 0.672, 0.638, 1.000)
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
		SemiMajorAxis   0.0141952
		Period          0.0842454
		Eccentricity    0.0245188
		Inclination     -0.136634
		AscendingNode   -75.664
		ArgOfPericenter 96.221
		MeanAnomaly     -19.4148
	}
}

Moon	"Crait System 11.8"
{
	ParentBody     "Crait System 11"
	Class	       "IceWorld"

	Mass            0.00886788
	Radius          1806.43
	InertiaMoment   0.38023

	Obliquity       -0.193963
	EqAscendNode    -88.629
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.422 0.419 0.414)

	Surface
	{
		SurfStyle       0.833999
		OceanStyle      0.144756
		Randomize      (-0.736, -0.425, 0.093)
		colorDistMagn   0.0773689
		colorDistFreq   253.369
		detailScale     4646.24
		colorConversion true
		drivenDarkening 0.295628
		seaLevel        0.278889
		snowLevel       2
		tropicLatitude  0.00484604
		icecapLatitude  0.965899
		icecapHeight    0.280162
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.92007
		venusFreq       1.78971
		venusMagn       0
		mareFreq        0.994888
		mareDensity     0.0018443
		terraceProb     0.471222
		erosion         0
		montesMagn      0.0666935
		montesFreq      93.738
		montesSpiky     0.864737
		montesFraction  0.0142606
		dunesMagn       0.02641
		dunesFreq       2378.7
		dunesFraction   0.314148
		hillsMagn       0.113928
		hillsFreq       200.23
		hillsFraction   0.982177
		hills2Fraction  0.25434
		riversMagn      58.0374
		riversFreq      3.48941
		riversSin       5.26171
		riversOctaves   0
		canyonsMagn     0.587018
		canyonsFreq     0.55117
		canyonFraction  0
		cracksMagn      0.063989
		cracksFreq      0.657137
		cracksOctaves   1
		craterMagn      0.617501
		craterFreq      4.56333
		craterDensity   0.884146
		craterOctaves   11
		craterRayedFactor 0.18667
		volcanoMagn     0.272332
		volcanoFreq     0.748043
		volcanoDensity  0.206769
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.348461
		volcanoRadius   0.195614
		volcanoTemp     1648.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.422, 0.314, 0.237, 0.000)
		colorShelf     (0.401, 0.298, 0.225, 0.000)
		colorBeach     (0.211, 0.157, 0.119, 0.000)
		colorDesert    (0.359, 0.267, 0.202, 0.000)
		colorLowland   (0.342, 0.276, 0.225, 0.000)
		colorUpland    (0.393, 0.292, 0.221, 0.000)
		colorRock      (1.000, 1.000, 1.000, 0.500)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.342, 0.276, 0.225, 0.000)
		colorUpPlants  (0.393, 0.292, 0.221, 0.000)
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
		SemiMajorAxis   0.0198656
		Period          0.139468
		Eccentricity    0.00918445
		Inclination     -0.193963
		AscendingNode   -88.629
		ArgOfPericenter 14.9383
		MeanAnomaly     78.3174
	}
}

Moon	"Crait System 11.9"
{
	ParentBody     "Crait System 11"
	Class	       "IceWorld"

	Mass            0.00111049
	Radius          856.777
	InertiaMoment   0.398748

	Obliquity       -1.21622
	EqAscendNode    125.346
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.690 0.627 0.489)

	Surface
	{
		SurfStyle       0.76284
		OceanStyle      0.43898
		Randomize      (-0.007, 0.847, -0.307)
		colorDistMagn   0.0522239
		colorDistFreq   91.6263
		detailScale     2203.68
		colorConversion true
		drivenDarkening 0.211244
		seaLevel        0.226368
		snowLevel       2
		tropicLatitude  0.0194876
		icecapLatitude  0.604737
		icecapHeight    0.248988
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.87111
		venusFreq       1.16094
		venusMagn       0
		mareFreq        0.16218
		mareDensity     0.000514909
		terraceProb     0.420893
		erosion         0
		montesMagn      0.0455318
		montesFreq      52.9778
		montesSpiky     0.97449
		montesFraction  0.949573
		dunesMagn       0.0463967
		dunesFreq       1121.94
		dunesFraction   0.424893
		hillsMagn       0.141151
		hillsFreq       90.7172
		hillsFraction   0.466558
		hills2Fraction  0.291901
		riversMagn      51.3479
		riversFreq      3.92232
		riversSin       6.3532
		riversOctaves   0
		canyonsMagn     0.431593
		canyonsFreq     0.262599
		canyonFraction  0
		cracksMagn      0.0464155
		cracksFreq      0.399229
		cracksOctaves   0
		craterMagn      0.673755
		craterFreq      2.10833
		craterDensity   0.91642
		craterOctaves   10
		craterRayedFactor 0.154278
		volcanoMagn     0.232848
		volcanoFreq     0.657931
		volcanoDensity  0.205883
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.190547
		volcanoRadius   0.142722
		volcanoTemp     1552.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.441, 0.402, 0.327, 0.250)
		colorShelf     (0.483, 0.458, 0.371, 0.250)
		colorBeach     (0.393, 0.339, 0.283, 0.200)
		colorDesert    (0.365, 0.307, 0.249, 0.200)
		colorLowland   (0.269, 0.238, 0.205, 0.200)
		colorUpland    (0.510, 0.464, 0.371, 0.250)
		colorRock      (0.640, 0.630, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.269, 0.238, 0.205, 0.200)
		colorUpPlants  (0.510, 0.464, 0.371, 0.250)
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
		SemiMajorAxis   0.0278012
		Period          0.230903
		Eccentricity    0.0404781
		Inclination     -1.21622
		AscendingNode   125.346
		ArgOfPericenter -174.86
		MeanAnomaly     -178.441
	}
}

DwarfMoon	"Crait System 11.D2"
{
	ParentBody     "Crait System 11"
	Class	       "Asteroid"

	Mass            7.76556e-010
	Radius          13.3667
	InertiaMoment   0.399334

	RotationPeriod  1190.38
	Obliquity       -87.896
	EqAscendNode    -109.304

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.414 0.413 0.409)

	Surface
	{
		SurfStyle       0.917157
		OceanStyle      0.0099802
		Randomize      (-0.760, 0.472, 0.199)
		colorDistMagn   0.758767
		colorDistFreq   0.128744
		detailScale     365.001
		colorConversion true
		snowLevel       2
		tropicLatitude  0.975603
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.587222
		terraceProb     0.30388
		erosion         0
		montesMagn      0.472884
		montesFreq      2.32379
		montesSpiky     0.977201
		montesFraction  0.280869
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.573602
		hillsFraction   0.587738
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.274517
		craterFreq      0.192734
		craterDensity   0.763505
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.588641
		volcanoTemp     1525.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.141, 0.144, 0.164, 0.050)
		colorShelf     (0.166, 0.169, 0.188, 0.040)
		colorBeach     (0.191, 0.194, 0.213, 0.030)
		colorDesert    (0.216, 0.219, 0.242, 0.020)
		colorLowland   (0.240, 0.243, 0.266, 0.030)
		colorUpland    (0.265, 0.268, 0.291, 0.050)
		colorRock      (0.290, 0.293, 0.323, 0.020)
		colorSnow      (0.290, 0.293, 0.323, 1.000)
		BumpHeight      12.0301
		BumpOffset      2.40601
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.127673
		Period          2.27239
		Eccentricity    0.477586
		Inclination     -86.2938
		AscendingNode   -102.578
		ArgOfPericenter 109.635
		MeanAnomaly     -122.093
	}
}

DwarfMoon	"Crait System 11.D3"
{
	ParentBody     "Crait System 11"
	Class	       "Asteroid"

	Mass            1.12208e-009
	Radius          14.4973
	InertiaMoment   0.396601

	RotationPeriod  1076.43
	Obliquity       -36.3241
	EqAscendNode    106.628

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.548 0.481 0.421)

	Surface
	{
		SurfStyle       0.944953
		OceanStyle      0.125193
		Randomize      (-0.479, 0.995, 0.153)
		colorDistMagn   0.88649
		colorDistFreq   0.0538645
		detailScale     395.873
		colorConversion true
		snowLevel       2
		tropicLatitude  0.723932
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.594865
		terraceProb     0.260461
		erosion         0
		montesMagn      0.674175
		montesFreq      2.34399
		montesSpiky     0.952804
		montesFraction  0.524055
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.456214
		hillsFraction   0.74726
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262693
		craterFreq      0.179573
		craterDensity   0.879885
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.508403
		volcanoTemp     1507.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.186, 0.168, 0.168, 0.050)
		colorShelf     (0.219, 0.197, 0.194, 0.040)
		colorBeach     (0.252, 0.226, 0.219, 0.030)
		colorDesert    (0.285, 0.255, 0.248, 0.020)
		colorLowland   (0.318, 0.284, 0.274, 0.030)
		colorUpland    (0.351, 0.313, 0.299, 0.050)
		colorRock      (0.384, 0.342, 0.333, 0.020)
		colorSnow      (0.384, 0.342, 0.333, 1.000)
		BumpHeight      13.0476
		BumpOffset      2.60952
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.128088
		Period          2.28349
		Eccentricity    0.271023
		Inclination     21.2622
		AscendingNode   106.488
		ArgOfPericenter 116.204
		MeanAnomaly     -117.946
	}
}

DwarfMoon	"Crait System 11.D4"
{
	ParentBody     "Crait System 11"
	Class	       "Asteroid"

	Mass            1.60013e-009
	Radius          15.6121
	InertiaMoment   0.398453

	RotationPeriod  977.524
	Obliquity       48.8158
	EqAscendNode    32.5372

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.666 0.663 0.659)

	Surface
	{
		SurfStyle       0.953806
		OceanStyle      0.300593
		Randomize      (-0.424, 0.043, 0.542)
		colorDistMagn   0.843214
		colorDistFreq   0.176937
		detailScale     426.313
		colorConversion true
		snowLevel       2
		tropicLatitude  0.949414
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.58493
		terraceProb     0.253067
		erosion         0
		montesMagn      0.44311
		montesFreq      3.37468
		montesSpiky     0.824653
		montesFraction  0.507514
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.79663
		hillsFraction   0.465195
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242891
		craterFreq      0.260408
		craterDensity   0.888495
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.521943
		volcanoTemp     1392.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.226, 0.232, 0.263, 0.050)
		colorShelf     (0.266, 0.272, 0.303, 0.040)
		colorBeach     (0.306, 0.312, 0.342, 0.030)
		colorDesert    (0.346, 0.352, 0.389, 0.020)
		colorLowland   (0.386, 0.391, 0.428, 0.030)
		colorUpland    (0.426, 0.431, 0.468, 0.050)
		colorRock      (0.466, 0.471, 0.520, 0.020)
		colorSnow      (0.466, 0.471, 0.520, 1.000)
		BumpHeight      14.0508
		BumpOffset      2.81017
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.128751
		Period          2.30123
		Eccentricity    0.433031
		Inclination     26.2648
		AscendingNode   33.8857
		ArgOfPericenter -24.847
		MeanAnomaly     -6.88657
	}
}

DwarfMoon	"Crait System 11.D5"
{
	ParentBody     "Crait System 11"
	Class	       "Asteroid"

	Mass            2.25687e-009
	Radius          20.7247
	InertiaMoment   0.399465

	RotationPeriod  1087.15
	Obliquity       14.001
	EqAscendNode    130.332

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.469 0.463 0.460)

	Surface
	{
		SurfStyle       0.543638
		OceanStyle      0.0804194
		Randomize      (-0.696, -0.810, 0.777)
		colorDistMagn   0.614849
		colorDistFreq   0.290628
		detailScale     565.923
		colorConversion true
		snowLevel       2
		tropicLatitude  0.647798
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.615683
		terraceProb     0.32634
		erosion         0
		montesMagn      0.426955
		montesFreq      3.02612
		montesSpiky     0.999139
		montesFraction  0.675139
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.09843
		hillsFraction   0.737265
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.197271
		craterFreq      0.223795
		craterDensity   0.875082
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.613432
		volcanoTemp     1081.25
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.183, 0.157, 0.129, 0.000)
		colorShelf     (0.188, 0.162, 0.147, 0.000)
		colorBeach     (0.220, 0.190, 0.175, 0.000)
		colorDesert    (0.239, 0.204, 0.170, 0.000)
		colorLowland   (0.263, 0.218, 0.193, 0.000)
		colorUpland    (0.291, 0.264, 0.234, 0.000)
		colorRock      (0.314, 0.287, 0.253, 0.000)
		colorSnow      (0.342, 0.306, 0.267, 1.000)
		BumpHeight      18.6522
		BumpOffset      3.73045
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.128973
		Period          2.30719
		Eccentricity    0.0723382
		Inclination     48.0247
		AscendingNode   128.868
		ArgOfPericenter 71.5135
		MeanAnomaly     -73.188
	}
}

DwarfMoon	"Crait System 11.D6"
{
	ParentBody     "Crait System 11"
	Class	       "Asteroid"

	Mass            3.15408e-009
	Radius          21.4717
	InertiaMoment   0.397041

	RotationPeriod  956.254
	Obliquity       -61.2439
	EqAscendNode    137.438

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.738 0.628 0.559)

	Surface
	{
		SurfStyle       0.337149
		OceanStyle      0.771783
		Randomize      (-0.822, -0.565, 0.613)
		colorDistMagn   0.531841
		colorDistFreq   0.29216
		detailScale     586.321
		colorConversion true
		snowLevel       2
		tropicLatitude  0.8513
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.496351
		terraceProb     0.605067
		erosion         0
		montesMagn      0.465285
		montesFreq      3.16612
		montesSpiky     0.926274
		montesFraction  0.277092
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.10295
		hillsFraction   0.586593
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252064
		craterFreq      0.278256
		craterDensity   0.854029
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.436976
		volcanoTemp     1620.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.295, 0.251, 0.224, 0.000)
		colorShelf     (0.314, 0.267, 0.238, 0.000)
		colorBeach     (0.332, 0.282, 0.252, 0.000)
		colorDesert    (0.351, 0.298, 0.266, 0.000)
		colorLowland   (0.369, 0.314, 0.280, 0.000)
		colorUpland    (0.387, 0.329, 0.294, 0.000)
		colorRock      (0.406, 0.345, 0.308, 0.000)
		colorSnow      (0.424, 0.361, 0.321, 1.000)
		BumpHeight      19.3245
		BumpOffset      3.86491
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.129533
		Period          2.32223
		Eccentricity    0.33945
		Inclination     -3.71198
		AscendingNode   141.804
		ArgOfPericenter -163.624
		MeanAnomaly     -112.869
	}
}

DwarfMoon	"Crait System 11.D7"
{
	ParentBody     "Crait System 11"
	Class	       "Asteroid"

	Mass            4.3745e-009
	Radius          22.9452
	InertiaMoment   0.398616

	RotationPeriod  873.225
	Obliquity       90.01
	EqAscendNode    153.93

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.630 0.625 0.623)

	Surface
	{
		SurfStyle       0.953159
		OceanStyle      0.309723
		Randomize      (-0.839, -0.051, 0.895)
		colorDistMagn   0.551476
		colorDistFreq   0.345806
		detailScale     626.557
		colorConversion true
		snowLevel       2
		tropicLatitude  0.523213
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.464202
		terraceProb     0.291227
		erosion         0
		montesMagn      0.441435
		montesFreq      3.16256
		montesSpiky     0.941899
		montesFraction  0.563074
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.47949
		hillsFraction   0.880464
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253498
		craterFreq      0.20583
		craterDensity   0.941644
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.541147
		volcanoTemp     1719.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.214, 0.219, 0.249, 0.050)
		colorShelf     (0.252, 0.256, 0.286, 0.040)
		colorBeach     (0.290, 0.294, 0.324, 0.030)
		colorDesert    (0.328, 0.332, 0.367, 0.020)
		colorLowland   (0.365, 0.369, 0.405, 0.030)
		colorUpland    (0.403, 0.407, 0.442, 0.050)
		colorRock      (0.441, 0.444, 0.492, 0.020)
		colorSnow      (0.441, 0.444, 0.492, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.129836
		Period          2.33039
		Eccentricity    0.263564
		Inclination     65.1823
		AscendingNode   159.883
		ArgOfPericenter -19.2836
		MeanAnomaly     -9.55436
	}
}

DwarfMoon	"Crait System 11.D8"
{
	ParentBody     "Crait System 11"
	Class	       "Asteroid"

	Mass            6.02921e-009
	Radius          24.4751
	InertiaMoment   0.399594

	RotationPeriod  797.569
	Obliquity       -64.7472
	EqAscendNode    -146.737

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.742 0.739 0.736)

	Surface
	{
		SurfStyle       0.565101
		OceanStyle      0.519141
		Randomize      (-0.213, 0.309, 0.418)
		colorDistMagn   0.449485
		colorDistFreq   0.171573
		detailScale     668.334
		colorConversion true
		snowLevel       2
		tropicLatitude  0.657838
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.53573
		terraceProb     0.324497
		erosion         0
		montesMagn      0.474393
		montesFreq      3.56839
		montesSpiky     0.917756
		montesFraction  0.579463
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.926097
		hillsFraction   0.488464
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229442
		craterFreq      0.185075
		craterDensity   0.759257
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.4102
		volcanoTemp     1815.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.289, 0.251, 0.206, 0.000)
		colorShelf     (0.297, 0.259, 0.236, 0.000)
		colorBeach     (0.349, 0.303, 0.280, 0.000)
		colorDesert    (0.378, 0.325, 0.272, 0.000)
		colorLowland   (0.415, 0.347, 0.309, 0.000)
		colorUpland    (0.460, 0.421, 0.375, 0.000)
		colorRock      (0.497, 0.458, 0.405, 0.000)
		colorSnow      (0.542, 0.488, 0.427, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.130109
		Period          2.33775
		Eccentricity    0.370738
		Inclination     -66.5888
		AscendingNode   -134.686
		ArgOfPericenter -108.277
		MeanAnomaly     -17.8314
	}
}

DwarfMoon	"Crait System 11.D9"
{
	ParentBody     "Crait System 11"
	Class	       "Asteroid"

	Mass            8.26782e-009
	Radius          32.7887
	InertiaMoment   0.397372

	RotationPeriod  904.276
	Obliquity       -75.1168
	EqAscendNode    -24.1201

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.604 0.601 0.597)

	Surface
	{
		SurfStyle       0.572167
		OceanStyle      0.0280208
		Randomize      (0.208, -0.821, -0.439)
		colorDistMagn   0.556272
		colorDistFreq   0.428646
		detailScale     895.351
		colorConversion true
		snowLevel       2
		tropicLatitude  0.475121
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.611377
		terraceProb     0.127436
		erosion         0
		montesMagn      0.683953
		montesFreq      2.45765
		montesSpiky     0.836544
		montesFraction  0.448589
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.2013
		hillsFraction   0.724078
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230266
		craterFreq      0.164387
		craterDensity   0.794704
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.546671
		volcanoTemp     1908.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.236, 0.204, 0.167, 0.000)
		colorShelf     (0.242, 0.210, 0.191, 0.000)
		colorBeach     (0.284, 0.247, 0.227, 0.000)
		colorDesert    (0.308, 0.265, 0.221, 0.000)
		colorLowland   (0.338, 0.283, 0.251, 0.000)
		colorUpland    (0.375, 0.343, 0.305, 0.000)
		colorRock      (0.405, 0.373, 0.329, 0.000)
		colorSnow      (0.441, 0.397, 0.346, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.130351
		Period          2.34428
		Eccentricity    0.0832954
		Inclination     -89.2997
		AscendingNode   -23.9667
		ArgOfPericenter -88.3737
		MeanAnomaly     -34.1123
	}
}

DwarfMoon	"Crait System 11.D10"
{
	ParentBody     "Crait System 11"
	Class	       "Asteroid"

	Mass            1.12925e-008
	Radius          33.0859
	InertiaMoment   0.398771

	RotationPeriod  787.031
	Obliquity       25.5048
	EqAscendNode    102.692

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.753 0.654 0.569)

	Surface
	{
		SurfStyle       0.46621
		OceanStyle      0.96375
		Randomize      (0.696, -0.247, 0.383)
		colorDistMagn   0.60163
		colorDistFreq   0.799178
		detailScale     903.465
		colorConversion true
		snowLevel       2
		tropicLatitude  0.90145
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.552718
		terraceProb     0.294849
		erosion         0
		montesMagn      0.398133
		montesFreq      2.4101
		montesSpiky     0.949509
		montesFraction  0.285949
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.34551
		hillsFraction   0.545974
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239269
		craterFreq      0.157992
		craterDensity   0.954934
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.445001
		volcanoTemp     1433.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.301, 0.262, 0.228, 0.000)
		colorShelf     (0.320, 0.278, 0.242, 0.000)
		colorBeach     (0.339, 0.294, 0.256, 0.000)
		colorDesert    (0.358, 0.311, 0.270, 0.000)
		colorLowland   (0.377, 0.327, 0.285, 0.000)
		colorUpland    (0.395, 0.343, 0.299, 0.000)
		colorRock      (0.414, 0.360, 0.313, 0.000)
		colorSnow      (0.433, 0.376, 0.327, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.130873
		Period          2.35837
		Eccentricity    0.400499
		Inclination     70.4922
		AscendingNode   108.903
		ArgOfPericenter -140.974
		MeanAnomaly     -14.9923
	}
}

DwarfMoon	"Crait System 11.D11"
{
	ParentBody     "Crait System 11"
	Class	       "Asteroid"

	Mass            1.53776e-008
	Radius          35.085
	InertiaMoment   0.39972

	RotationPeriod  718.633
	Obliquity       145.447
	EqAscendNode    -93.3232

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.657 0.598 0.501)

	Surface
	{
		SurfStyle       0.181211
		OceanStyle      0.905492
		Randomize      (0.745, 0.617, 0.055)
		colorDistMagn   0.629014
		colorDistFreq   0.601546
		detailScale     958.054
		colorConversion true
		snowLevel       2
		tropicLatitude  0.967112
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.745736
		terraceProb     0.323325
		erosion         0
		montesMagn      0.398396
		montesFreq      3.06546
		montesSpiky     0.889191
		montesFraction  0.71975
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.66675
		hillsFraction   0.474883
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223097
		craterFreq      0.194313
		craterDensity   0.950728
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.564703
		volcanoTemp     1774.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.263, 0.239, 0.200, 0.000)
		colorShelf     (0.279, 0.254, 0.213, 0.000)
		colorBeach     (0.296, 0.269, 0.225, 0.000)
		colorDesert    (0.312, 0.284, 0.238, 0.000)
		colorLowland   (0.329, 0.299, 0.251, 0.000)
		colorUpland    (0.345, 0.314, 0.263, 0.000)
		colorRock      (0.361, 0.329, 0.276, 0.000)
		colorSnow      (0.378, 0.344, 0.288, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.131286
		Period          2.36953
		Eccentricity    0.360457
		Inclination     68.8919
		AscendingNode   -94.5804
		ArgOfPericenter -87.2795
		MeanAnomaly     -103.109
	}
}

DwarfMoon	"Crait System 11.D12"
{
	ParentBody     "Crait System 11"
	Class	       "Asteroid"

	Mass            2.08973e-008
	Radius          37.293
	InertiaMoment   0.397644

	RotationPeriod  655.696
	Obliquity       -10.3459
	EqAscendNode    184.198

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.652 0.598 0.543)

	Surface
	{
		SurfStyle       0.720873
		OceanStyle      0.630871
		Randomize      (0.620, -0.210, 0.416)
		colorDistMagn   0.397646
		colorDistFreq   0.536804
		detailScale     1018.35
		colorConversion true
		snowLevel       2
		tropicLatitude  0.345424
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.756577
		terraceProb     0.522252
		erosion         0
		montesMagn      0.3274
		montesFreq      2.72335
		montesSpiky     0.889728
		montesFraction  0.822677
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.85777
		hillsFraction   0.520379
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24043
		craterFreq      0.193744
		craterDensity   0.913287
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52452
		volcanoTemp     1120.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.254, 0.203, 0.152, 0.000)
		colorShelf     (0.261, 0.209, 0.174, 0.000)
		colorBeach     (0.306, 0.245, 0.207, 0.000)
		colorDesert    (0.332, 0.263, 0.201, 0.000)
		colorLowland   (0.365, 0.281, 0.228, 0.000)
		colorUpland    (0.404, 0.341, 0.277, 0.000)
		colorRock      (0.437, 0.371, 0.299, 0.000)
		colorSnow      (0.476, 0.395, 0.315, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.131838
		Period          2.38449
		Eccentricity    0.283294
		Inclination     9.86182
		AscendingNode   179.911
		ArgOfPericenter -101.967
		MeanAnomaly     -100.501
	}
}

DwarfMoon	"Crait System 11.D13"
{
	ParentBody     "Crait System 11"
	Class	       "Asteroid"

	Mass            2.83651e-008
	Radius          52.3274
	InertiaMoment   0.398918

	RotationPeriod  784.997
	Obliquity       9.46071
	EqAscendNode    132.903

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.661 0.494 0.420)

	Surface
	{
		SurfStyle       0.264201
		OceanStyle      0.00348001
		Randomize      (0.442, 0.338, 0.539)
		colorDistMagn   0.511776
		colorDistFreq   2.26243
		detailScale     1428.89
		colorConversion true
		snowLevel       2
		tropicLatitude  0.220386
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.575556
		terraceProb     0.502391
		erosion         0
		montesMagn      0.498603
		montesFreq      3.17813
		montesSpiky     0.909136
		montesFraction  0.47326
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.08292
		hillsFraction   0.481611
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233433
		craterFreq      0.235977
		craterDensity   0.827323
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.438718
		volcanoTemp     1169.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.264, 0.197, 0.168, 0.000)
		colorShelf     (0.281, 0.210, 0.179, 0.000)
		colorBeach     (0.297, 0.222, 0.189, 0.000)
		colorDesert    (0.314, 0.234, 0.200, 0.000)
		colorLowland   (0.330, 0.247, 0.210, 0.000)
		colorUpland    (0.347, 0.259, 0.221, 0.000)
		colorRock      (0.363, 0.271, 0.231, 0.000)
		colorSnow      (0.380, 0.284, 0.242, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.132093
		Period          2.39142
		Eccentricity    0.295558
		Inclination     16.6677
		AscendingNode   130.245
		ArgOfPericenter -144.36
		MeanAnomaly     -89.4706
	}
}

DwarfMoon	"Crait System 11.D14"
{
	ParentBody     "Crait System 11"
	Class	       "Asteroid"

	Mass            3.84897e-008
	Radius          50.1826
	InertiaMoment   0.399846

	RotationPeriod  651.793
	Obliquity       -118.758
	EqAscendNode    -27.8524

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.581 0.579 0.575)

	Surface
	{
		SurfStyle       0.871026
		OceanStyle      0.458537
		Randomize      (-0.398, -0.916, 0.383)
		colorDistMagn   0.588899
		colorDistFreq   0.896803
		detailScale     1370.32
		colorConversion true
		snowLevel       2
		tropicLatitude  0.440655
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.548597
		terraceProb     0.131844
		erosion         0
		montesMagn      0.623958
		montesFreq      2.51034
		montesSpiky     0.828292
		montesFraction  0.433505
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.57825
		hillsFraction   0.616808
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224301
		craterFreq      0.209522
		craterDensity   0.920481
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.522477
		volcanoTemp     1544.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.198, 0.202, 0.230, 0.050)
		colorShelf     (0.233, 0.237, 0.264, 0.040)
		colorBeach     (0.267, 0.272, 0.299, 0.030)
		colorDesert    (0.302, 0.307, 0.339, 0.020)
		colorLowland   (0.337, 0.341, 0.374, 0.030)
		colorUpland    (0.372, 0.376, 0.408, 0.050)
		colorRock      (0.407, 0.411, 0.454, 0.020)
		colorSnow      (0.407, 0.411, 0.454, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.132714
		Period          2.4083
		Eccentricity    0.135891
		Inclination     -50.4268
		AscendingNode   -28.9716
		ArgOfPericenter 92.9026
		MeanAnomaly     -40.9377
	}
}

DwarfMoon	"Crait System 11.D15"
{
	ParentBody     "Crait System 11"
	Class	       "Asteroid"

	Mass            5.22571e-008
	Radius          53.0488
	InertiaMoment   0.397877

	RotationPeriod  591.843
	Obliquity       45.7318
	EqAscendNode    -15.8225

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.510 0.508 0.504)

	Surface
	{
		SurfStyle       0.817321
		OceanStyle      0.133078
		Randomize      (0.651, -0.598, 0.941)
		colorDistMagn   0.211559
		colorDistFreq   1.3109
		detailScale     1448.58
		colorConversion true
		snowLevel       2
		tropicLatitude  0.58403
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.588975
		terraceProb     0.120776
		erosion         0
		montesMagn      0.538285
		montesFreq      2.69965
		montesSpiky     0.876726
		montesFraction  0.643499
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.87065
		hillsFraction   0.560432
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.197132
		craterFreq      0.192629
		craterDensity   0.959557
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.452802
		volcanoTemp     1255.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.199, 0.173, 0.141, 0.000)
		colorShelf     (0.204, 0.178, 0.161, 0.000)
		colorBeach     (0.240, 0.208, 0.192, 0.000)
		colorDesert    (0.260, 0.224, 0.187, 0.000)
		colorLowland   (0.286, 0.239, 0.212, 0.000)
		colorUpland    (0.316, 0.290, 0.257, 0.000)
		colorRock      (0.342, 0.315, 0.277, 0.000)
		colorSnow      (0.372, 0.335, 0.293, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.133009
		Period          2.41634
		Eccentricity    0.241939
		Inclination     -10.214
		AscendingNode   -10.6867
		ArgOfPericenter -2.30976
		MeanAnomaly     149.696
	}
}

DwarfMoon	"Crait System 11.D16"
{
	ParentBody     "Crait System 11"
	Class	       "Asteroid"

	Mass            7.10502e-008
	Radius          56.4362
	InertiaMoment   0.39906

	RotationPeriod  542.277
	Obliquity       64.7554
	EqAscendNode    -14.6077

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.726 0.686 0.654)

	Surface
	{
		SurfStyle       0.278397
		OceanStyle      0.304666
		Randomize      (-0.165, 0.540, 0.739)
		colorDistMagn   0.202919
		colorDistFreq   0.335222
		detailScale     1541.08
		colorConversion true
		snowLevel       2
		tropicLatitude  0.742114
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.413663
		terraceProb     0.167063
		erosion         0
		montesMagn      0.462502
		montesFreq      2.99732
		montesSpiky     0.884924
		montesFraction  0.771666
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.18852
		hillsFraction   0.710987
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246448
		craterFreq      0.218713
		craterDensity   0.970677
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.527912
		volcanoTemp     1678.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.290, 0.275, 0.262, 0.000)
		colorShelf     (0.308, 0.292, 0.278, 0.000)
		colorBeach     (0.326, 0.309, 0.294, 0.000)
		colorDesert    (0.345, 0.326, 0.311, 0.000)
		colorLowland   (0.363, 0.343, 0.327, 0.000)
		colorUpland    (0.381, 0.360, 0.343, 0.000)
		colorRock      (0.399, 0.377, 0.360, 0.000)
		colorSnow      (0.417, 0.395, 0.376, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.13328
		Period          2.42373
		Eccentricity    0.118516
		Inclination     70.3476
		AscendingNode   -17.202
		ArgOfPericenter -65.2887
		MeanAnomaly     -160.81
	}
}

DwarfMoon	"Crait System 11.D17"
{
	ParentBody     "Crait System 11"
	Class	       "Asteroid"

	Mass            9.68267e-008
	Radius          58.1109
	InertiaMoment   0.399971

	RotationPeriod  480.498
	Obliquity       94.5568
	EqAscendNode    156.786

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.736 0.675 0.646)

	Surface
	{
		SurfStyle       0.708489
		OceanStyle      0.394326
		Randomize      (-0.292, 0.161, 0.450)
		colorDistMagn   0.704445
		colorDistFreq   1.68294
		detailScale     1586.82
		colorConversion true
		snowLevel       2
		tropicLatitude  0.752667
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.53687
		terraceProb     0.207621
		erosion         0
		montesMagn      0.234038
		montesFreq      2.71787
		montesSpiky     0.932454
		montesFraction  0.092504
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.14896
		hillsFraction   0.726057
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23808
		craterFreq      0.245348
		craterDensity   0.801475
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.56387
		volcanoTemp     1415.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.287, 0.229, 0.181, 0.000)
		colorShelf     (0.294, 0.236, 0.207, 0.000)
		colorBeach     (0.346, 0.277, 0.246, 0.000)
		colorDesert    (0.375, 0.297, 0.239, 0.000)
		colorLowland   (0.412, 0.317, 0.271, 0.000)
		colorUpland    (0.456, 0.385, 0.330, 0.000)
		colorRock      (0.493, 0.418, 0.355, 0.000)
		colorSnow      (0.537, 0.445, 0.375, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.133696
		Period          2.43507
		Eccentricity    0.48702
		Inclination     49.103
		AscendingNode   160.531
		ArgOfPericenter 104.341
		MeanAnomaly     -14.3948
	}
}

DwarfMoon	"Crait System 11.D18"
{
	ParentBody     "Crait System 11"
	Class	       "Asteroid"

	Mass            1.32387e-007
	Radius          76.4041
	InertiaMoment   0.398085

	RotationPeriod  537.181
	Obliquity       4.75131
	EqAscendNode    -89.8226

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.724 0.579 0.490)

	Surface
	{
		SurfStyle       0.0431665
		OceanStyle      0.994095
		Randomize      (0.903, 0.888, -0.497)
		colorDistMagn   0.373169
		colorDistFreq   3.16566
		detailScale     2086.34
		colorConversion true
		snowLevel       2
		tropicLatitude  0.371785
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.493213
		terraceProb     0.232314
		erosion         0
		montesMagn      0.549389
		montesFreq      3.64846
		montesSpiky     0.765967
		montesFraction  0.517702
		dunesFraction   0
		hillsMagn       0
		hillsFreq       16.912
		hillsFraction   0.653882
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.203009
		craterFreq      0.177945
		craterDensity   0.773034
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52198
		volcanoTemp     1342.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.289, 0.232, 0.196, 0.000)
		colorShelf     (0.308, 0.246, 0.208, 0.000)
		colorBeach     (0.326, 0.261, 0.220, 0.000)
		colorDesert    (0.344, 0.275, 0.233, 0.000)
		colorLowland   (0.362, 0.290, 0.245, 0.000)
		colorUpland    (0.380, 0.304, 0.257, 0.000)
		colorRock      (0.398, 0.319, 0.269, 0.000)
		colorSnow      (0.416, 0.333, 0.281, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.134045
		Period          2.44462
		Eccentricity    0.216099
		Inclination     21.652
		AscendingNode   -93.8861
		ArgOfPericenter -36.0525
		MeanAnomaly     29.9438
	}
}

DwarfMoon	"Crait System 11.D19"
{
	ParentBody     "Crait System 11"
	Class	       "Asteroid"

	Mass            1.81786e-007
	Radius          80.8461
	InertiaMoment   0.399198

	RotationPeriod  487.099
	Obliquity       5.16877
	EqAscendNode    161.128

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.762 0.698 0.666)

	Surface
	{
		SurfStyle       0.854579
		OceanStyle      0.807289
		Randomize      (-0.783, -0.336, 0.401)
		colorDistMagn   0.565232
		colorDistFreq   4.44744
		detailScale     2207.64
		colorConversion true
		snowLevel       2
		tropicLatitude  0.667688
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.594596
		terraceProb     0.296662
		erosion         0
		montesMagn      0.567371
		montesFreq      2.87777
		montesSpiky     0.96725
		montesFraction  0.90845
		dunesFraction   0
		hillsMagn       0
		hillsFreq       13.3828
		hillsFraction   0.493794
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23145
		craterFreq      0.229032
		craterDensity   0.753555
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.527962
		volcanoTemp     1465.24
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.259, 0.244, 0.266, 0.050)
		colorShelf     (0.305, 0.286, 0.306, 0.040)
		colorBeach     (0.350, 0.328, 0.346, 0.030)
		colorDesert    (0.396, 0.370, 0.393, 0.020)
		colorLowland   (0.442, 0.412, 0.433, 0.030)
		colorUpland    (0.487, 0.454, 0.473, 0.050)
		colorRock      (0.533, 0.496, 0.526, 0.020)
		colorSnow      (0.533, 0.496, 0.526, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.134519
		Period          2.4576
		Eccentricity    0.0335576
		Inclination     46.8223
		AscendingNode   163.405
		ArgOfPericenter 11.7244
		MeanAnomaly     110.291
	}
}

DwarfMoon	"Crait System 11.D20"
{
	ParentBody     "Crait System 11"
	Class	       "Asteroid"

	Mass            2.50968e-007
	Radius          86.4734
	InertiaMoment   0.395856

	RotationPeriod  442.663
	Obliquity       49.8244
	EqAscendNode    90.3186

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.676 0.670 0.668)

	Surface
	{
		SurfStyle       0.954435
		OceanStyle      0.521394
		Randomize      (-0.581, 0.012, -0.790)
		colorDistMagn   0.294101
		colorDistFreq   4.33184
		detailScale     2361.3
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998133
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.564119
		terraceProb     0.281606
		erosion         0
		montesMagn      0.625117
		montesFreq      3.81777
		montesSpiky     0.939747
		montesFraction  0.666272
		dunesFraction   0
		hillsMagn       0
		hillsFreq       17.8306
		hillsFraction   0.58957
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226638
		craterFreq      0.308708
		craterDensity   0.952344
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.519474
		volcanoTemp     1575.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.230, 0.235, 0.267, 0.050)
		colorShelf     (0.270, 0.275, 0.307, 0.040)
		colorBeach     (0.311, 0.315, 0.347, 0.030)
		colorDesert    (0.351, 0.355, 0.394, 0.020)
		colorLowland   (0.392, 0.396, 0.434, 0.030)
		colorUpland    (0.433, 0.436, 0.474, 0.050)
		colorRock      (0.473, 0.476, 0.528, 0.020)
		colorSnow      (0.473, 0.476, 0.528, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.134862
		Period          2.46702
		Eccentricity    0.0195297
		Inclination     78.3811
		AscendingNode   84.722
		ArgOfPericenter 173.014
		MeanAnomaly     -31.5447
	}
}

DwarfMoon	"Crait System 11.D21"
{
	ParentBody     "Crait System 11"
	Class	       "Asteroid"

	Mass            3.48789e-007
	Radius          91.015
	InertiaMoment   0.398274

	RotationPeriod  397.429
	Obliquity       -24.2221
	EqAscendNode    -179.27

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.431 0.426 0.421)

	Surface
	{
		SurfStyle       0.53929
		OceanStyle      0.169893
		Randomize      (0.377, 0.154, -0.745)
		colorDistMagn   0.978393
		colorDistFreq   6.07594
		detailScale     2485.32
		colorConversion true
		snowLevel       2
		tropicLatitude  0.391516
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.555456
		terraceProb     0.374289
		erosion         0
		montesMagn      0.524482
		montesFreq      3.37037
		montesSpiky     0.972405
		montesFraction  0.647912
		dunesFraction   0
		hillsMagn       0
		hillsFreq       24.9608
		hillsFraction   0.666742
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234405
		craterFreq      0.299181
		craterDensity   0.793833
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.458105
		volcanoTemp     1265.14
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.168, 0.145, 0.118, 0.000)
		colorShelf     (0.173, 0.149, 0.135, 0.000)
		colorBeach     (0.203, 0.175, 0.160, 0.000)
		colorDesert    (0.220, 0.187, 0.156, 0.000)
		colorLowland   (0.242, 0.200, 0.177, 0.000)
		colorUpland    (0.267, 0.243, 0.215, 0.000)
		colorRock      (0.289, 0.264, 0.232, 0.000)
		colorSnow      (0.315, 0.281, 0.244, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.135309
		Period          2.47929
		Eccentricity    0.380887
		Inclination     -47.2549
		AscendingNode   -178.455
		ArgOfPericenter -170.861
		MeanAnomaly     -50.8916
	}
}

DwarfMoon	"Crait System 11.D22"
{
	ParentBody     "Crait System 11"
	Class	       "Asteroid"

	Mass            4.88654e-007
	Radius          119.222
	InertiaMoment   0.399331

	RotationPeriod  439.292
	Obliquity       -48.6877
	EqAscendNode    100.037

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.704 0.698 0.695)

	Surface
	{
		SurfStyle       0.923807
		OceanStyle      0.463778
		Randomize      (0.650, -0.415, -0.865)
		colorDistMagn   0.404076
		colorDistFreq   8.93774
		detailScale     3255.56
		colorConversion true
		snowLevel       2
		tropicLatitude  0.850836
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.563208
		terraceProb     0.678952
		erosion         0
		montesMagn      0.534818
		montesFreq      2.79263
		montesSpiky     0.979754
		montesFraction  0.595326
		dunesFraction   0
		hillsMagn       0
		hillsFreq       35.8162
		hillsFraction   0.444878
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251604
		craterFreq      0.524436
		craterDensity   0.863697
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.496545
		volcanoTemp     1479.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.239, 0.244, 0.278, 0.050)
		colorShelf     (0.281, 0.286, 0.320, 0.040)
		colorBeach     (0.324, 0.328, 0.361, 0.030)
		colorDesert    (0.366, 0.370, 0.410, 0.020)
		colorLowland   (0.408, 0.412, 0.452, 0.030)
		colorUpland    (0.450, 0.454, 0.493, 0.050)
		colorRock      (0.493, 0.495, 0.549, 0.020)
		colorSnow      (0.493, 0.495, 0.549, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.135713
		Period          2.49038
		Eccentricity    0.00690454
		Inclination     -46.8042
		AscendingNode   97.7196
		ArgOfPericenter -151.272
		MeanAnomaly     131.427
	}
}

DwarfMoon	"Crait System 11.D23"
{
	ParentBody     "Crait System 11"
	Class	       "Asteroid"

	Mass            6.91258e-007
	Radius          126.94
	InertiaMoment   0.396589

	RotationPeriod  392.928
	Obliquity       11.0324
	EqAscendNode    -3.7696

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.823 0.800 0.759)

	Surface
	{
		SurfStyle       0.66425
		OceanStyle      0.883852
		Randomize      (0.950, -0.122, -0.539)
		colorDistMagn   0.57047
		colorDistFreq   10.983
		detailScale     3466.3
		colorConversion true
		snowLevel       2
		tropicLatitude  0.182476
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.38872
		terraceProb     0.208381
		erosion         0
		montesMagn      0.553477
		montesFreq      2.83861
		montesSpiky     0.819236
		montesFraction  0.791274
		dunesFraction   0
		hillsMagn       0
		hillsFreq       27.6288
		hillsFraction   0.669592
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.28169
		craterFreq      0.467379
		craterDensity   0.810387
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.502703
		volcanoTemp     1326.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.321, 0.272, 0.213, 0.000)
		colorShelf     (0.329, 0.280, 0.243, 0.000)
		colorBeach     (0.387, 0.328, 0.288, 0.000)
		colorDesert    (0.420, 0.352, 0.281, 0.000)
		colorLowland   (0.461, 0.376, 0.319, 0.000)
		colorUpland    (0.511, 0.456, 0.387, 0.000)
		colorRock      (0.552, 0.496, 0.417, 0.000)
		colorSnow      (0.601, 0.528, 0.440, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.136288
		Period          2.50623
		Eccentricity    0.306176
		Inclination     -0.520568
		AscendingNode   5.16084
		ArgOfPericenter 141.547
		MeanAnomaly     113.232
	}
}

DwarfMoon	"Crait System 11.D24"
{
	ParentBody     "Crait System 11"
	Class	       "Asteroid"

	Mass            9.89261e-007
	Radius          137.403
	InertiaMoment   0.398449

	RotationPeriod  357.085
	Obliquity       -118.885
	EqAscendNode    -134.102

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.659 0.585 0.541)

	Surface
	{
		SurfStyle       0.366067
		OceanStyle      0.32348
		Randomize      (0.526, -0.101, -0.883)
		colorDistMagn   0.83581
		colorDistFreq   7.60421
		detailScale     3752.01
		colorConversion true
		snowLevel       2
		tropicLatitude  0.913358
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.346123
		terraceProb     0.168543
		erosion         0
		montesMagn      0.355
		montesFreq      3.73182
		montesSpiky     0.897976
		montesFraction  0.714404
		dunesFraction   0
		hillsMagn       0
		hillsFreq       50.3136
		hillsFraction   0.614143
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240186
		craterFreq      0.720199
		craterDensity   0.746826
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.562133
		volcanoTemp     1461.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.263, 0.234, 0.217, 0.000)
		colorShelf     (0.280, 0.249, 0.230, 0.000)
		colorBeach     (0.296, 0.263, 0.244, 0.000)
		colorDesert    (0.313, 0.278, 0.257, 0.000)
		colorLowland   (0.329, 0.292, 0.271, 0.000)
		colorUpland    (0.346, 0.307, 0.284, 0.000)
		colorRock      (0.362, 0.322, 0.298, 0.000)
		colorSnow      (0.379, 0.336, 0.311, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.136837
		Period          2.52139
		Eccentricity    0.324776
		Inclination     -66.7915
		AscendingNode   -137.945
		ArgOfPericenter -65.1787
		MeanAnomaly     167.631
	}
}

DwarfMoon	"Crait System 11.D25"
{
	ParentBody     "Crait System 11"
	Class	       "Asteroid"

	Mass            1.43552e-006
	Radius          147.767
	InertiaMoment   0.399462

	RotationPeriod  319.873
	Obliquity       -66.0837
	EqAscendNode    140.602

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.727 0.725 0.723)

	Surface
	{
		SurfStyle       0.672265
		OceanStyle      0.291784
		Randomize      (-0.837, 0.498, 0.837)
		colorDistMagn   0.594871
		colorDistFreq   17.101
		detailScale     4035.03
		colorConversion true
		snowLevel       2
		tropicLatitude  0.672365
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.552443
		terraceProb     0.391648
		erosion         0
		montesMagn      0.468504
		montesFreq      3.31027
		montesSpiky     0.974355
		montesFraction  0.641912
		dunesFraction   0
		hillsMagn       0
		hillsFreq       41.5584
		hillsFraction   0.667163
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221627
		craterFreq      0.688787
		craterDensity   0.900436
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.540653
		volcanoTemp     1441.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.284, 0.246, 0.202, 0.000)
		colorShelf     (0.291, 0.254, 0.231, 0.000)
		colorBeach     (0.342, 0.297, 0.275, 0.000)
		colorDesert    (0.371, 0.319, 0.267, 0.000)
		colorLowland   (0.407, 0.341, 0.303, 0.000)
		colorUpland    (0.451, 0.413, 0.368, 0.000)
		colorRock      (0.487, 0.449, 0.397, 0.000)
		colorSnow      (0.531, 0.478, 0.419, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.137413
		Period          2.53734
		Eccentricity    0.145676
		Inclination     -66.1047
		AscendingNode   133.565
		ArgOfPericenter 52.072
		MeanAnomaly     172.157
	}
}

DwarfMoon	"Crait System 11.D26"
{
	ParentBody     "Crait System 11"
	Class	       "Asteroid"

	Mass            2.11818e-006
	Radius          196.572
	InertiaMoment   0.397033

	RotationPeriod  348.624
	Obliquity       35.6194
	EqAscendNode    20.3838

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.642 0.531 0.418)

	Surface
	{
		SurfStyle       0.448954
		OceanStyle      0.97304
		Randomize      (-0.465, -0.512, -0.257)
		colorDistMagn   0.186939
		colorDistFreq   10.5742
		detailScale     5367.72
		colorConversion true
		snowLevel       2
		tropicLatitude  0.840275
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.291539
		terraceProb     0.489007
		erosion         0
		montesMagn      0.502495
		montesFreq      2.05006
		montesSpiky     0.973183
		montesFraction  0.678328
		dunesFraction   0
		hillsMagn       0
		hillsFreq       90.7089
		hillsFraction   0.778386
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.210534
		craterFreq      1.41544
		craterDensity   0.9444
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.515393
		volcanoTemp     1730.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.257, 0.213, 0.167, 0.000)
		colorShelf     (0.273, 0.226, 0.177, 0.000)
		colorBeach     (0.289, 0.239, 0.188, 0.000)
		colorDesert    (0.305, 0.252, 0.198, 0.000)
		colorLowland   (0.321, 0.266, 0.209, 0.000)
		colorUpland    (0.337, 0.279, 0.219, 0.000)
		colorRock      (0.353, 0.292, 0.230, 0.000)
		colorSnow      (0.369, 0.306, 0.240, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.137762
		Period          2.54701
		Eccentricity    0.069405
		Inclination     22.0586
		AscendingNode   15.0299
		ArgOfPericenter -5.56219
		MeanAnomaly     -89.5895
	}
}

Moon	"Crait System 11.10"
{
	ParentBody     "Crait System 11"
	Class	       "IceWorld"

	Mass            3.18934e-006
	Radius          212.626
	InertiaMoment   0.398613

	RotationPeriod  308.649
	Obliquity       -25.7486
	EqAscendNode    1.37412

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.723 0.652 0.610)

	Surface
	{
		SurfStyle       0.866931
		OceanStyle      0.378172
		Randomize      (-0.673, 0.419, -0.698)
		colorDistMagn   0.0564548
		colorDistFreq   27.2812
		detailScale     546.886
		colorConversion true
		drivenDarkening 0.0425505
		seaLevel        0.295851
		snowLevel       2
		tropicLatitude  0.980599
		icecapLatitude  1
		icecapHeight    0.295851
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.63033
		venusFreq       0.933515
		venusMagn       0
		mareFreq        0
		mareDensity     1.28963e-006
		terraceProb     0.420821
		erosion         0
		montesMagn      0.0601147
		montesFreq      11.4527
		montesSpiky     0.899659
		montesFraction  0.473161
		dunesMagn       0.0415021
		dunesFreq       283.861
		dunesFraction   0.25
		hillsMagn       0.12741
		hillsFreq       24.6907
		hillsFraction   0.391118
		hills2Fraction  0.0918433
		riversMagn      54.6455
		riversFreq      4.39969
		riversSin       6.85999
		riversOctaves   0
		canyonsMagn     0.641408
		canyonsFreq     0.0712479
		canyonFraction  0
		cracksMagn      0.0502984
		cracksFreq      0.0650243
		cracksOctaves   0
		craterMagn      1.23404
		craterFreq      0.589333
		craterDensity   0.883688
		craterOctaves   8
		craterRayedFactor 0.240414
		volcanoMagn     0.205971
		volcanoFreq     0.780582
		volcanoDensity  0.212349
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.258711
		volcanoRadius   0.136768
		volcanoTemp     1694
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.723, 0.489, 0.350, 0.000)
		colorShelf     (0.686, 0.464, 0.332, 0.000)
		colorBeach     (0.361, 0.244, 0.175, 0.000)
		colorDesert    (0.614, 0.416, 0.298, 0.000)
		colorLowland   (0.585, 0.430, 0.332, 0.000)
		colorUpland    (0.672, 0.454, 0.326, 0.000)
		colorRock      (1.000, 1.000, 1.000, 0.500)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.585, 0.430, 0.332, 0.000)
		colorUpPlants  (0.672, 0.454, 0.326, 0.000)
		BumpHeight      10.6313
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
		SemiMajorAxis   0.138021
		Period          2.55419
		Eccentricity    0.0759683
		Inclination     -52.9635
		AscendingNode   -2.3287
		ArgOfPericenter -95.4947
		MeanAnomaly     26.1992
	}
}

Moon	"Crait System 11.11"
{
	ParentBody     "Crait System 11"
	Class	       "IceWorld"

	Mass            4.92261e-006
	Radius          235.927
	InertiaMoment   0.399591

	RotationPeriod  276.515
	Obliquity       44.8228
	EqAscendNode    138.832

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.858 0.780 0.734)

	Surface
	{
		SurfStyle       0.208584
		OceanStyle      0.532826
		Randomize      (-0.755, 0.514, 0.768)
		colorDistMagn   0.0764611
		colorDistFreq   31.2646
		detailScale     606.817
		colorConversion true
		drivenDarkening 0.0424059
		seaLevel        0.140708
		snowLevel       2
		tropicLatitude  0.494052
		icecapLatitude  1
		icecapHeight    0.140708
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.83694
		venusFreq       1.01999
		venusMagn       0
		mareFreq        0
		mareDensity     1.40279e-006
		terraceProb     0.47023
		erosion         0
		montesMagn      0.0483464
		montesFreq      9.28781
		montesSpiky     0.918738
		montesFraction  0.316713
		dunesMagn       0.0458524
		dunesFreq       311.814
		dunesFraction   0.571421
		hillsMagn       0.121541
		hillsFreq       26.8599
		hillsFraction   0.434951
		hills2Fraction  0.25128
		riversMagn      57.9883
		riversFreq      3.91807
		riversSin       5.26885
		riversOctaves   0
		canyonsMagn     0.649989
		canyonsFreq     0.0793755
		canyonFraction  0
		cracksMagn      0.040631
		cracksFreq      0.0994738
		cracksOctaves   0
		craterMagn      0.977413
		craterFreq      0.756504
		craterDensity   0.900552
		craterOctaves   8
		craterRayedFactor 0.110028
		volcanoMagn     0.197808
		volcanoFreq     0.688124
		volcanoDensity  0.177854
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.348036
		volcanoRadius   0.141191
		volcanoTemp     1657.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.858, 0.780, 0.734, 0.500)
		colorShelf     (0.815, 0.741, 0.697, 0.500)
		colorBeach     (0.601, 0.546, 0.514, 0.750)
		colorDesert    (0.729, 0.663, 0.624, 1.000)
		colorLowland   (0.755, 0.687, 0.646, 1.000)
		colorUpland    (0.798, 0.726, 0.682, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.755, 0.687, 0.646, 1.000)
		colorUpPlants  (0.798, 0.726, 0.682, 1.000)
		BumpHeight      11.7963
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
		SemiMajorAxis   0.138491
		Period          2.56726
		Eccentricity    0.0680079
		Inclination     42.8578
		AscendingNode   136.795
		ArgOfPericenter -147.363
		MeanAnomaly     30.1788
	}
}

DwarfMoon	"Crait System 11.D27"
{
	ParentBody     "Crait System 11"
	Class	       "Asteroid"

	Mass            1.42733e-011
	Radius          3.20942
	InertiaMoment   0.397366

	RotationPeriod  1978.65
	Obliquity       -66.4084
	EqAscendNode    151.023

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.583 0.577 0.571)

	Surface
	{
		SurfStyle       0.928819
		OceanStyle      0.289102
		Randomize      (-0.000, -0.457, -0.203)
		colorDistMagn   0.326523
		colorDistFreq   0.00244644
		detailScale     87.6386
		colorConversion true
		snowLevel       2
		tropicLatitude  0.616472
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.542841
		terraceProb     0.270829
		erosion         0
		montesMagn      0.630484
		montesFreq      3.64942
		montesSpiky     0.95015
		montesFraction  0.803508
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0299282
		hillsFraction   0.523917
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235305
		craterFreq      0.192612
		craterDensity   1.09371
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.429563
		volcanoTemp     1376.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.198, 0.202, 0.229, 0.050)
		colorShelf     (0.233, 0.236, 0.263, 0.040)
		colorBeach     (0.268, 0.271, 0.297, 0.030)
		colorDesert    (0.303, 0.306, 0.337, 0.020)
		colorLowland   (0.338, 0.340, 0.371, 0.030)
		colorUpland    (0.373, 0.375, 0.406, 0.050)
		colorRock      (0.408, 0.409, 0.451, 0.020)
		colorSnow      (0.408, 0.409, 0.451, 1.000)
		BumpHeight      2.88848
		BumpOffset      0.577696
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.139093
		Period          2.584
		Eccentricity    0.395218
		Inclination     -79.5828
		AscendingNode   142.495
		ArgOfPericenter 45.8002
		MeanAnomaly     -161.006
	}
}

DwarfMoon	"Crait System 11.D28"
{
	ParentBody     "Crait System 11"
	Class	       "Asteroid"

	Mass            2.84719e-011
	Radius          4.73709
	InertiaMoment   0.398768

	RotationPeriod  2059.56
	Obliquity       -43.7381
	EqAscendNode    -140.068

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.512 0.505 0.501)

	Surface
	{
		SurfStyle       0.998922
		OceanStyle      0.0319922
		Randomize      (-0.879, 0.769, 0.604)
		colorDistMagn   0.326752
		colorDistFreq   0.00131547
		detailScale     129.354
		colorConversion true
		snowLevel       2
		tropicLatitude  0.378698
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.474491
		terraceProb     0.174939
		erosion         0
		montesMagn      0.529416
		montesFreq      2.80445
		montesSpiky     0.882314
		montesFraction  0.167038
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0496305
		hillsFraction   0.363146
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.268875
		craterFreq      0.190566
		craterDensity   1.01192
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.571028
		volcanoTemp     1505.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.174, 0.177, 0.201, 0.050)
		colorShelf     (0.205, 0.207, 0.231, 0.040)
		colorBeach     (0.236, 0.237, 0.261, 0.030)
		colorDesert    (0.266, 0.268, 0.296, 0.020)
		colorLowland   (0.297, 0.298, 0.326, 0.030)
		colorUpland    (0.328, 0.328, 0.356, 0.050)
		colorRock      (0.359, 0.358, 0.396, 0.020)
		colorSnow      (0.359, 0.358, 0.396, 1.000)
		BumpHeight      4.26338
		BumpOffset      0.852677
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.13958
		Period          2.59759
		Eccentricity    0.160009
		Inclination     -35.5593
		AscendingNode   -147.145
		ArgOfPericenter 158.893
		MeanAnomaly     166.919
	}
}

DwarfMoon	"Crait System 11.D29"
{
	ParentBody     "Crait System 11"
	Class	       "Asteroid"

	Mass            5.19895e-011
	Radius          5.42589
	InertiaMoment   0.399718

	RotationPeriod  1780
	Obliquity       -48.8055
	EqAscendNode    91.2796

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.411 0.403 0.399)

	Surface
	{
		SurfStyle       0.632806
		OceanStyle      0.0828138
		Randomize      (0.494, 0.413, -0.262)
		colorDistMagn   0.854713
		colorDistFreq   0.0204749
		detailScale     148.163
		colorConversion true
		snowLevel       2
		tropicLatitude  0.916503
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.296207
		terraceProb     0.224452
		erosion         0
		montesMagn      0.455634
		montesFreq      3.25438
		montesSpiky     0.945122
		montesFraction  0.623495
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0798025
		hillsFraction   0.547034
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228526
		craterFreq      0.159143
		craterDensity   1.04738
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.591231
		volcanoTemp     1474.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.160, 0.137, 0.112, 0.000)
		colorShelf     (0.164, 0.141, 0.128, 0.000)
		colorBeach     (0.193, 0.165, 0.152, 0.000)
		colorDesert    (0.209, 0.177, 0.148, 0.000)
		colorLowland   (0.230, 0.189, 0.168, 0.000)
		colorUpland    (0.255, 0.229, 0.204, 0.000)
		colorRock      (0.275, 0.250, 0.220, 0.000)
		colorSnow      (0.300, 0.266, 0.232, 1.000)
		BumpHeight      4.8833
		BumpOffset      0.976661
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.140207
		Period          2.61511
		Eccentricity    0.304421
		Inclination     -52.204
		AscendingNode   89.6523
		ArgOfPericenter -51.4256
		MeanAnomaly     -30.0015
	}
}

DwarfMoon	"Crait System 11.D30"
{
	ParentBody     "Crait System 11"
	Class	       "Asteroid"

	Mass            8.91348e-011
	Radius          6.23036
	InertiaMoment   0.397638

	RotationPeriod  1577.44
	Obliquity       97.9305
	EqAscendNode    -63.2659

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.493 0.429 0.320)

	Surface
	{
		SurfStyle       0.0669223
		OceanStyle      0.134107
		Randomize      (0.504, 0.586, -0.604)
		colorDistMagn   0.377027
		colorDistFreq   0.0122418
		detailScale     170.13
		colorConversion true
		snowLevel       2
		tropicLatitude  0.907453
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.401907
		terraceProb     0.160055
		erosion         0
		montesMagn      0.48957
		montesFreq      3.30089
		montesSpiky     0.95748
		montesFraction  0.643691
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.113104
		hillsFraction   0.693774
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.204201
		craterFreq      0.196893
		craterDensity   0.837342
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.467084
		volcanoTemp     1440.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.197, 0.171, 0.128, 0.000)
		colorShelf     (0.210, 0.182, 0.136, 0.000)
		colorBeach     (0.222, 0.193, 0.144, 0.000)
		colorDesert    (0.234, 0.204, 0.152, 0.000)
		colorLowland   (0.247, 0.214, 0.160, 0.000)
		colorUpland    (0.259, 0.225, 0.168, 0.000)
		colorRock      (0.271, 0.236, 0.176, 0.000)
		colorSnow      (0.284, 0.246, 0.184, 1.000)
		BumpHeight      5.60732
		BumpOffset      1.12146
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.140636
		Period          2.62712
		Eccentricity    0.478289
		Inclination     47.6146
		AscendingNode   -63.4368
		ArgOfPericenter 69.5921
		MeanAnomaly     -57.3139
	}
}

DwarfMoon	"Crait System 11.D31"
{
	ParentBody     "Crait System 11"
	Class	       "Asteroid"

	Mass            1.45785e-010
	Radius          7.02239
	InertiaMoment   0.398915

	RotationPeriod  1407.73
	Obliquity       -120.666
	EqAscendNode    158.514

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.580 0.575 0.572)

	Surface
	{
		SurfStyle       0.647043
		OceanStyle      0.19211
		Randomize      (0.795, -0.562, 0.010)
		colorDistMagn   0.874257
		colorDistFreq   0.0409508
		detailScale     191.758
		colorConversion true
		snowLevel       2
		tropicLatitude  0.726722
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.75088
		terraceProb     0.29542
		erosion         0
		montesMagn      0.348603
		montesFreq      3.78299
		montesSpiky     0.859186
		montesFraction  0.711095
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0845115
		hillsFraction   0.447954
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222653
		craterFreq      0.226065
		craterDensity   0.915629
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51349
		volcanoTemp     1226.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.226, 0.196, 0.160, 0.000)
		colorShelf     (0.232, 0.201, 0.183, 0.000)
		colorBeach     (0.273, 0.236, 0.218, 0.000)
		colorDesert    (0.296, 0.253, 0.212, 0.000)
		colorLowland   (0.325, 0.270, 0.240, 0.000)
		colorUpland    (0.360, 0.328, 0.292, 0.000)
		colorRock      (0.389, 0.357, 0.315, 0.000)
		colorSnow      (0.424, 0.380, 0.332, 1.000)
		BumpHeight      6.32015
		BumpOffset      1.26403
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.14099
		Period          2.63705
		Eccentricity    0.188656
		Inclination     -78.2628
		AscendingNode   159.862
		ArgOfPericenter -146.39
		MeanAnomaly     -173.012
	}
}

DwarfMoon	"Crait System 11.D32"
{
	ParentBody     "Crait System 11"
	Class	       "Asteroid"

	Mass            2.29902e-010
	Radius          9.66974
	InertiaMoment   0.399843

	RotationPeriod  1532.63
	Obliquity       -48.3227
	EqAscendNode    173.161

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.749 0.746 0.744)

	Surface
	{
		SurfStyle       0.247704
		OceanStyle      0.54557
		Randomize      (-0.927, 0.452, 0.869)
		colorDistMagn   0.288664
		colorDistFreq   0.0552736
		detailScale     264.048
		colorConversion true
		snowLevel       2
		tropicLatitude  0.655643
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.410774
		terraceProb     0.135174
		erosion         0
		montesMagn      0.458527
		montesFreq      3.32303
		montesSpiky     0.995275
		montesFraction  0.682755
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.274652
		hillsFraction   0.562607
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236637
		craterFreq      0.155977
		craterDensity   0.794139
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.466556
		volcanoTemp     1280.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.300, 0.298, 0.298, 0.000)
		colorShelf     (0.319, 0.317, 0.316, 0.000)
		colorBeach     (0.337, 0.336, 0.335, 0.000)
		colorDesert    (0.356, 0.354, 0.354, 0.000)
		colorLowland   (0.375, 0.373, 0.372, 0.000)
		colorUpland    (0.393, 0.392, 0.391, 0.000)
		colorRock      (0.412, 0.410, 0.409, 0.000)
		colorSnow      (0.431, 0.429, 0.428, 1.000)
		BumpHeight      8.70277
		BumpOffset      1.74055
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.141448
		Period          2.64989
		Eccentricity    0.230437
		Inclination     -88.5908
		AscendingNode   171.628
		ArgOfPericenter -29.4638
		MeanAnomaly     -25.897
	}
}

DwarfMoon	"Crait System 11.D33"
{
	ParentBody     "Crait System 11"
	Class	       "Asteroid"

	Mass            3.52218e-010
	Radius          10.3364
	InertiaMoment   0.397873

	RotationPeriod  1337.03
	Obliquity       32.357
	EqAscendNode    59.9373

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.582 0.499 0.391)

	Surface
	{
		SurfStyle       0.395399
		OceanStyle      0.839917
		Randomize      (-0.598, -0.374, -0.174)
		colorDistMagn   0.882613
		colorDistFreq   0.0649379
		detailScale     282.253
		colorConversion true
		snowLevel       2
		tropicLatitude  0.951671
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.719546
		terraceProb     0.15169
		erosion         0
		montesMagn      0.459753
		montesFreq      3.05231
		montesSpiky     0.956025
		montesFraction  0.631806
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.250008
		hillsFraction   0.817495
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240981
		craterFreq      0.256894
		craterDensity   0.843669
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.521355
		volcanoTemp     1762.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.233, 0.200, 0.156, 0.000)
		colorShelf     (0.247, 0.212, 0.166, 0.000)
		colorBeach     (0.262, 0.225, 0.176, 0.000)
		colorDesert    (0.276, 0.237, 0.186, 0.000)
		colorLowland   (0.291, 0.250, 0.195, 0.000)
		colorUpland    (0.305, 0.262, 0.205, 0.000)
		colorRock      (0.320, 0.274, 0.215, 0.000)
		colorSnow      (0.334, 0.287, 0.225, 1.000)
		BumpHeight      9.30277
		BumpOffset      1.86055
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.141925
		Period          2.66333
		Eccentricity    0.398334
		Inclination     50.2257
		AscendingNode   55.4447
		ArgOfPericenter -107.648
		MeanAnomaly     -41.4394
	}
}

DwarfMoon	"Crait System 11.D34"
{
	ParentBody     "Crait System 11"
	Class	       "Asteroid"

	Mass            5.27137e-010
	Radius          11.3303
	InertiaMoment   0.399057

	RotationPeriod  1209.52
	Obliquity       -66.1085
	EqAscendNode    97.6008

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.636 0.508 0.383)

	Surface
	{
		SurfStyle       0.0716421
		OceanStyle      0.356628
		Randomize      (-0.269, 0.560, -0.515)
		colorDistMagn   0.860125
		colorDistFreq   0.0556642
		detailScale     309.393
		colorConversion true
		snowLevel       2
		tropicLatitude  0.964961
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.471131
		terraceProb     0.154462
		erosion         0
		montesMagn      0.582579
		montesFreq      2.58715
		montesSpiky     0.844128
		montesFraction  0.649279
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.346557
		hillsFraction   0.416604
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24331
		craterFreq      0.217798
		craterDensity   0.797936
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.526317
		volcanoTemp     1614.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.255, 0.203, 0.153, 0.000)
		colorShelf     (0.270, 0.216, 0.163, 0.000)
		colorBeach     (0.286, 0.228, 0.172, 0.000)
		colorDesert    (0.302, 0.241, 0.182, 0.000)
		colorLowland   (0.318, 0.254, 0.192, 0.000)
		colorUpland    (0.334, 0.266, 0.201, 0.000)
		colorRock      (0.350, 0.279, 0.211, 0.000)
		colorSnow      (0.366, 0.292, 0.220, 1.000)
		BumpHeight      10.1973
		BumpOffset      2.03946
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.142473
		Period          2.67877
		Eccentricity    0.479998
		Inclination     -60.673
		AscendingNode   94.6068
		ArgOfPericenter -120.559
		MeanAnomaly     4.86462
	}
}

DwarfMoon	"Crait System 11.D35"
{
	ParentBody     "Crait System 11"
	Class	       "Asteroid"

	Mass            7.73957e-010
	Radius          12.3424
	InertiaMoment   0.399968

	RotationPeriod  1096.37
	Obliquity       -0.502049
	EqAscendNode    -35.7284

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.512 0.505 0.497)

	Surface
	{
		SurfStyle       0.42826
		OceanStyle      0.435282
		Randomize      (-0.972, 0.389, -0.337)
		colorDistMagn   0.47933
		colorDistFreq   0.0624553
		detailScale     337.029
		colorConversion true
		snowLevel       2
		tropicLatitude  0.476323
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.459187
		terraceProb     0.349057
		erosion         0
		montesMagn      0.429443
		montesFreq      1.88321
		montesSpiky     0.940538
		montesFraction  0.649578
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.376387
		hillsFraction   0.511491
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260184
		craterFreq      0.174783
		craterDensity   0.913901
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49351
		volcanoTemp     1522.25
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.205, 0.202, 0.199, 0.000)
		colorShelf     (0.217, 0.215, 0.211, 0.000)
		colorBeach     (0.230, 0.227, 0.224, 0.000)
		colorDesert    (0.243, 0.240, 0.236, 0.000)
		colorLowland   (0.256, 0.252, 0.248, 0.000)
		colorUpland    (0.269, 0.265, 0.261, 0.000)
		colorRock      (0.281, 0.278, 0.273, 0.000)
		colorSnow      (0.294, 0.290, 0.286, 1.000)
		BumpHeight      11.1081
		BumpOffset      2.22162
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.143114
		Period          2.69687
		Eccentricity    0.0304464
		Inclination     28.844
		AscendingNode   -37.179
		ArgOfPericenter -70.588
		MeanAnomaly     -173.368
	}
}

DwarfMoon	"Crait System 11.D36"
{
	ParentBody     "Crait System 11"
	Class	       "Asteroid"

	Mass            1.11847e-009
	Radius          16.8057
	InertiaMoment   0.398081

	RotationPeriod  1228.3
	Obliquity       70.7727
	EqAscendNode    97.2814

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.494 0.489 0.487)

	Surface
	{
		SurfStyle       0.53927
		OceanStyle      0.584872
		Randomize      (0.839, -0.734, -0.660)
		colorDistMagn   0.870703
		colorDistFreq   0.179402
		detailScale     458.908
		colorConversion true
		snowLevel       2
		tropicLatitude  0.937027
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.517421
		terraceProb     0.206382
		erosion         0
		montesMagn      0.614283
		montesFreq      3.3454
		montesSpiky     0.965387
		montesFraction  0.308692
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.722239
		hillsFraction   0.712875
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24967
		craterFreq      0.252388
		craterDensity   0.910986
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.433125
		volcanoTemp     1720.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.193, 0.166, 0.136, 0.000)
		colorShelf     (0.197, 0.171, 0.156, 0.000)
		colorBeach     (0.232, 0.201, 0.185, 0.000)
		colorDesert    (0.252, 0.215, 0.180, 0.000)
		colorLowland   (0.276, 0.230, 0.204, 0.000)
		colorUpland    (0.306, 0.279, 0.248, 0.000)
		colorRock      (0.331, 0.303, 0.268, 0.000)
		colorSnow      (0.360, 0.323, 0.282, 1.000)
		BumpHeight      15.1251
		BumpOffset      3.02503
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.143748
		Period          2.71481
		Eccentricity    0.427724
		Inclination     14.4067
		AscendingNode   97.4097
		ArgOfPericenter 8.43494
		MeanAnomaly     -81.7643
	}
}

DwarfMoon	"Crait System 11.D37"
{
	ParentBody     "Crait System 11"
	Class	       "Asteroid"

	Mass            1.59515e-009
	Radius          17.225
	InertiaMoment   0.399195

	RotationPeriod  1066.61
	Obliquity       46.4072
	EqAscendNode    -146.706

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.583 0.581 0.576)

	Surface
	{
		SurfStyle       0.664105
		OceanStyle      0.251889
		Randomize      (-0.914, -0.740, 0.685)
		colorDistMagn   0.629604
		colorDistFreq   0.0382636
		detailScale     470.358
		colorConversion true
		snowLevel       2
		tropicLatitude  0.77806
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.684744
		terraceProb     0.107128
		erosion         0
		montesMagn      0.466937
		montesFreq      3.1666
		montesSpiky     0.923868
		montesFraction  0.827444
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.00228
		hillsFraction   0.651226
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256656
		craterFreq      0.218731
		craterDensity   1.01362
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.560905
		volcanoTemp     1185.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.227, 0.197, 0.161, 0.000)
		colorShelf     (0.233, 0.203, 0.184, 0.000)
		colorBeach     (0.274, 0.238, 0.219, 0.000)
		colorDesert    (0.297, 0.255, 0.213, 0.000)
		colorLowland   (0.327, 0.273, 0.242, 0.000)
		colorUpland    (0.362, 0.331, 0.294, 0.000)
		colorRock      (0.391, 0.360, 0.317, 0.000)
		colorSnow      (0.426, 0.383, 0.334, 1.000)
		BumpHeight      15.5025
		BumpOffset      3.1005
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.144267
		Period          2.72951
		Eccentricity    0.209818
		Inclination     87.0225
		AscendingNode   -144.986
		ArgOfPericenter 125.063
		MeanAnomaly     -101.059
	}
}

DwarfMoon	"Crait System 11.D38"
{
	ParentBody     "Crait System 11"
	Class	       "Asteroid"

	Mass            2.25005e-009
	Radius          18.483
	InertiaMoment   0.395833

	RotationPeriod  965.756
	Obliquity       -52.1019
	EqAscendNode    1.80219

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.591 0.582 0.579)

	Surface
	{
		SurfStyle       0.637255
		OceanStyle      0.221825
		Randomize      (-0.008, 0.237, -0.645)
		colorDistMagn   0.202528
		colorDistFreq   0.0825144
		detailScale     504.71
		colorConversion true
		snowLevel       2
		tropicLatitude  0.921336
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.380724
		terraceProb     0.13415
		erosion         0
		montesMagn      0.350598
		montesFreq      2.58076
		montesSpiky     0.922052
		montesFraction  0.27472
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.8602
		hillsFraction   0.560987
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.194115
		craterFreq      0.214844
		craterDensity   0.822304
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.646016
		volcanoTemp     1473.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.230, 0.198, 0.162, 0.000)
		colorShelf     (0.236, 0.204, 0.185, 0.000)
		colorBeach     (0.278, 0.239, 0.220, 0.000)
		colorDesert    (0.301, 0.256, 0.214, 0.000)
		colorLowland   (0.331, 0.274, 0.243, 0.000)
		colorUpland    (0.366, 0.332, 0.295, 0.000)
		colorRock      (0.396, 0.361, 0.318, 0.000)
		colorSnow      (0.431, 0.384, 0.336, 1.000)
		BumpHeight      16.6347
		BumpOffset      3.32695
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.144552
		Period          2.73763
		Eccentricity    0.192824
		Inclination     -61.4058
		AscendingNode   9.79801
		ArgOfPericenter -113.437
		MeanAnomaly     29.5512
	}
}

DwarfMoon	"Crait System 11.D39"
{
	ParentBody     "Crait System 11"
	Class	       "Asteroid"

	Mass            3.14478e-009
	Radius          19.8301
	InertiaMoment   0.39827

	RotationPeriod  883.685
	Obliquity       39.2692
	EqAscendNode    -126.142

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.569 0.566 0.562)

	Surface
	{
		SurfStyle       0.551618
		OceanStyle      0.40963
		Randomize      (0.014, 0.533, -0.952)
		colorDistMagn   0.458521
		colorDistFreq   0.210573
		detailScale     541.495
		colorConversion true
		snowLevel       2
		tropicLatitude  0.658141
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.515373
		terraceProb     0.483025
		erosion         0
		montesMagn      0.50438
		montesFreq      1.98992
		montesSpiky     0.89993
		montesFraction  0.695207
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.837778
		hillsFraction   0.889319
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246896
		craterFreq      0.165221
		craterDensity   0.794548
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53861
		volcanoTemp     1486.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.222, 0.192, 0.157, 0.000)
		colorShelf     (0.228, 0.198, 0.180, 0.000)
		colorBeach     (0.268, 0.232, 0.214, 0.000)
		colorDesert    (0.290, 0.249, 0.208, 0.000)
		colorLowland   (0.319, 0.266, 0.236, 0.000)
		colorUpland    (0.353, 0.323, 0.287, 0.000)
		colorRock      (0.381, 0.351, 0.309, 0.000)
		colorSnow      (0.416, 0.373, 0.326, 1.000)
		BumpHeight      17.8471
		BumpOffset      3.56943
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.144984
		Period          2.74989
		Eccentricity    0.370356
		Inclination     54.289
		AscendingNode   -125.851
		ArgOfPericenter 57.743
		MeanAnomaly     141.545
	}
}

DwarfMoon	"Crait System 11.D40"
{
	ParentBody     "Crait System 11"
	Class	       "Asteroid"

	Mass            4.36187e-009
	Radius          27.8988
	InertiaMoment   0.399329

	RotationPeriod  1046.14
	Obliquity       -60.6808
	EqAscendNode    -164.638

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.730 0.680 0.611)

	Surface
	{
		SurfStyle       0.855186
		OceanStyle      0.407213
		Randomize      (0.474, 0.756, -0.777)
		colorDistMagn   0.361594
		colorDistFreq   0.436655
		detailScale     761.824
		colorConversion true
		snowLevel       2
		tropicLatitude  0.324992
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.65987
		terraceProb     0.589677
		erosion         0
		montesMagn      0.689407
		montesFreq      3.31482
		montesSpiky     0.984819
		montesFraction  0.558654
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.29501
		hillsFraction   0.798388
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249828
		craterFreq      0.231983
		craterDensity   0.945728
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.509002
		volcanoTemp     1732.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.248, 0.238, 0.244, 0.050)
		colorShelf     (0.292, 0.279, 0.281, 0.040)
		colorBeach     (0.336, 0.320, 0.318, 0.030)
		colorDesert    (0.379, 0.360, 0.360, 0.020)
		colorLowland   (0.423, 0.401, 0.397, 0.030)
		colorUpland    (0.467, 0.442, 0.434, 0.050)
		colorRock      (0.511, 0.483, 0.483, 0.020)
		colorSnow      (0.511, 0.483, 0.483, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.145244
		Period          2.7573
		Eccentricity    0.094215
		Inclination     -58.815
		AscendingNode   -158.115
		ArgOfPericenter 2.28163
		MeanAnomaly     -61.2833
	}
}

DwarfMoon	"Crait System 11.D41"
{
	ParentBody     "Crait System 11"
	Class	       "Asteroid"

	Mass            6.01211e-009
	Radius          27.0155
	InertiaMoment   0.396578

	RotationPeriod  869.569
	Obliquity       95.444
	EqAscendNode    -9.5831

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.584 0.516 0.452)

	Surface
	{
		SurfStyle       0.445941
		OceanStyle      0.913253
		Randomize      (-0.582, 0.861, 0.255)
		colorDistMagn   0.791009
		colorDistFreq   0.339589
		detailScale     737.704
		colorConversion true
		snowLevel       2
		tropicLatitude  0.621275
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.499311
		terraceProb     0.369694
		erosion         0
		montesMagn      0.582004
		montesFreq      2.41098
		montesSpiky     0.948657
		montesFraction  0.305817
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.13572
		hillsFraction   0.496613
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.203289
		craterFreq      0.213192
		craterDensity   0.881704
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.481402
		volcanoTemp     1495.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.234, 0.206, 0.181, 0.000)
		colorShelf     (0.248, 0.219, 0.192, 0.000)
		colorBeach     (0.263, 0.232, 0.203, 0.000)
		colorDesert    (0.278, 0.245, 0.215, 0.000)
		colorLowland   (0.292, 0.258, 0.226, 0.000)
		colorUpland    (0.307, 0.271, 0.237, 0.000)
		colorRock      (0.321, 0.284, 0.249, 0.000)
		colorSnow      (0.336, 0.297, 0.260, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.1458
		Period          2.77315
		Eccentricity    0.0362989
		Inclination     46.519
		AscendingNode   -6.04808
		ArgOfPericenter 6.55453
		MeanAnomaly     -48.6792
	}
}

DwarfMoon	"Crait System 11.D42"
{
	ParentBody     "Crait System 11"
	Class	       "Asteroid"

	Mass            8.2447e-009
	Radius          28.6572
	InertiaMoment   0.398445

	RotationPeriod  793.334
	Obliquity       15.5508
	EqAscendNode    166.18

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.539 0.537 0.534)

	Surface
	{
		SurfStyle       0.586104
		OceanStyle      0.396601
		Randomize      (-0.861, -0.219, -0.501)
		colorDistMagn   0.776402
		colorDistFreq   0.213618
		detailScale     782.534
		colorConversion true
		snowLevel       2
		tropicLatitude  0.243961
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.47634
		terraceProb     0.158322
		erosion         0
		montesMagn      0.615799
		montesFreq      4.07588
		montesSpiky     0.845706
		montesFraction  0.351262
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.57834
		hillsFraction   0.45491
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2355
		craterFreq      0.196338
		craterDensity   0.962601
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.480722
		volcanoTemp     1026.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.210, 0.183, 0.150, 0.000)
		colorShelf     (0.216, 0.188, 0.171, 0.000)
		colorBeach     (0.254, 0.220, 0.203, 0.000)
		colorDesert    (0.275, 0.236, 0.198, 0.000)
		colorLowland   (0.302, 0.253, 0.224, 0.000)
		colorUpland    (0.334, 0.306, 0.272, 0.000)
		colorRock      (0.361, 0.333, 0.294, 0.000)
		colorSnow      (0.394, 0.355, 0.310, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.146108
		Period          2.78193
		Eccentricity    0.43177
		Inclination     28.824
		AscendingNode   166.634
		ArgOfPericenter -154.037
		MeanAnomaly     -97.2921
	}
}

DwarfMoon	"Crait System 11.D43"
{
	ParentBody     "Crait System 11"
	Class	       "Asteroid"

	Mass            1.12613e-008
	Radius          30.5331
	InertiaMoment   0.399459

	RotationPeriod  727.171
	Obliquity       -110.309
	EqAscendNode    35.389

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.675 0.670 0.666)

	Surface
	{
		SurfStyle       0.16547
		OceanStyle      0.7492
		Randomize      (0.343, -0.784, -0.155)
		colorDistMagn   0.700018
		colorDistFreq   0.539257
		detailScale     833.757
		colorConversion true
		snowLevel       2
		tropicLatitude  0.641529
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.413727
		terraceProb     0.229633
		erosion         0
		montesMagn      0.601892
		montesFreq      2.40723
		montesSpiky     0.870178
		montesFraction  0.51091
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.86598
		hillsFraction   0.476
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.271436
		craterFreq      0.237899
		craterDensity   0.779185
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.463816
		volcanoTemp     1408.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.270, 0.268, 0.267, 0.000)
		colorShelf     (0.287, 0.285, 0.283, 0.000)
		colorBeach     (0.304, 0.301, 0.300, 0.000)
		colorDesert    (0.321, 0.318, 0.317, 0.000)
		colorLowland   (0.338, 0.335, 0.333, 0.000)
		colorUpland    (0.355, 0.352, 0.350, 0.000)
		colorRock      (0.371, 0.368, 0.367, 0.000)
		colorSnow      (0.388, 0.385, 0.383, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.146712
		Period          2.7992
		Eccentricity    0.103467
		Inclination     -72.1858
		AscendingNode   42.2502
		ArgOfPericenter 73.7638
		MeanAnomaly     -111.532
	}
}

DwarfMoon	"Crait System 11.D44"
{
	ParentBody     "Crait System 11"
	Class	       "Asteroid"

	Mass            1.53354e-008
	Radius          31.391
	InertiaMoment   0.397025

	RotationPeriod  642.1
	Obliquity       115.688
	EqAscendNode    -11.8144

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.473 0.469 0.463)

	Surface
	{
		SurfStyle       0.447028
		OceanStyle      0.481184
		Randomize      (0.436, 0.798, -0.410)
		colorDistMagn   0.39026
		colorDistFreq   0.430669
		detailScale     857.184
		colorConversion true
		snowLevel       2
		tropicLatitude  0.273326
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.503503
		terraceProb     0.238079
		erosion         0
		montesMagn      0.378834
		montesFreq      1.41663
		montesSpiky     0.925076
		montesFraction  0.573039
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.8688
		hillsFraction   0.613158
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25938
		craterFreq      0.202267
		craterDensity   0.826013
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.597535
		volcanoTemp     1618.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.189, 0.188, 0.185, 0.000)
		colorShelf     (0.201, 0.199, 0.197, 0.000)
		colorBeach     (0.213, 0.211, 0.208, 0.000)
		colorDesert    (0.225, 0.223, 0.220, 0.000)
		colorLowland   (0.237, 0.234, 0.232, 0.000)
		colorUpland    (0.248, 0.246, 0.243, 0.000)
		colorRock      (0.260, 0.258, 0.255, 0.000)
		colorSnow      (0.272, 0.270, 0.266, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.146965
		Period          2.80644
		Eccentricity    0.267569
		Inclination     63.9387
		AscendingNode   -17.6381
		ArgOfPericenter -87.6064
		MeanAnomaly     48.0707
	}
}

DwarfMoon	"Crait System 11.D45"
{
	ParentBody     "Crait System 11"
	Class	       "Asteroid"

	Mass            2.08403e-008
	Radius          41.2367
	InertiaMoment   0.398609

	RotationPeriod  721.404
	Obliquity       25.3098
	EqAscendNode    78.0832

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.811 0.780 0.737)

	Surface
	{
		SurfStyle       0.970066
		OceanStyle      0.109101
		Randomize      (-0.296, 0.106, 0.796)
		colorDistMagn   0.76639
		colorDistFreq   0.527402
		detailScale     1126.04
		colorConversion true
		snowLevel       2
		tropicLatitude  0.425577
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.62438
		terraceProb     0.289458
		erosion         0
		montesMagn      0.608891
		montesFreq      3.56479
		montesSpiky     0.99732
		montesFraction  0.195618
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.29017
		hillsFraction   0.740922
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245109
		craterFreq      0.209267
		craterDensity   0.982232
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.512408
		volcanoTemp     1501.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.276, 0.273, 0.295, 0.050)
		colorShelf     (0.324, 0.320, 0.339, 0.040)
		colorBeach     (0.373, 0.367, 0.383, 0.030)
		colorDesert    (0.422, 0.414, 0.435, 0.020)
		colorLowland   (0.470, 0.460, 0.479, 0.030)
		colorUpland    (0.519, 0.507, 0.523, 0.050)
		colorRock      (0.568, 0.554, 0.582, 0.020)
		colorSnow      (0.568, 0.554, 0.582, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.1474
		Period          2.81891
		Eccentricity    0.120512
		Inclination     -1.38975
		AscendingNode   83.4734
		ArgOfPericenter 27.301
		MeanAnomaly     169.005
	}
}

DwarfMoon	"Crait System 11.D46"
{
	ParentBody     "Crait System 11"
	Class	       "Asteroid"

	Mass            2.82879e-008
	Radius          43.473
	InertiaMoment   0.399588

	RotationPeriod  656.25
	Obliquity       -9.98664
	EqAscendNode    -22.2415

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.675 0.673 0.671)

	Surface
	{
		SurfStyle       0.77937
		OceanStyle      0.425789
		Randomize      (-0.204, 0.434, -0.426)
		colorDistMagn   0.319691
		colorDistFreq   1.44426
		detailScale     1187.1
		colorConversion true
		snowLevel       2
		tropicLatitude  0.364203
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.404737
		terraceProb     0.3444
		erosion         0
		montesMagn      0.504856
		montesFreq      3.07405
		montesSpiky     0.947539
		montesFraction  0.285646
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.81014
		hillsFraction   0.604393
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237464
		craterFreq      0.180081
		craterDensity   0.79978
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.433638
		volcanoTemp     1789.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.263, 0.229, 0.188, 0.000)
		colorShelf     (0.270, 0.236, 0.215, 0.000)
		colorBeach     (0.317, 0.276, 0.255, 0.000)
		colorDesert    (0.344, 0.296, 0.248, 0.000)
		colorLowland   (0.378, 0.316, 0.282, 0.000)
		colorUpland    (0.419, 0.384, 0.342, 0.000)
		colorRock      (0.453, 0.417, 0.369, 0.000)
		colorSnow      (0.493, 0.444, 0.389, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.148012
		Period          2.83649
		Eccentricity    0.20715
		Inclination     -11.8827
		AscendingNode   -24.7637
		ArgOfPericenter 103.272
		MeanAnomaly     -56.5785
	}
}

DwarfMoon	"Crait System 11.D47"
{
	ParentBody     "Crait System 11"
	Class	       "Asteroid"

	Mass            3.83849e-008
	Radius          46.2318
	InertiaMoment   0.397359

	RotationPeriod  599.562
	Obliquity       73.599
	EqAscendNode    77.2082

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.641 0.583 0.476)

	Surface
	{
		SurfStyle       0.639976
		OceanStyle      0.00861588
		Randomize      (0.668, 0.608, 0.800)
		colorDistMagn   0.621236
		colorDistFreq   1.20464
		detailScale     1262.44
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999728
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.599184
		terraceProb     0.236836
		erosion         0
		montesMagn      0.453548
		montesFreq      2.85369
		montesSpiky     0.80377
		montesFraction  0.304356
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.28632
		hillsFraction   0.422764
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218885
		craterFreq      0.195124
		craterDensity   1.00657
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.446178
		volcanoTemp     1308.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.250, 0.198, 0.133, 0.000)
		colorShelf     (0.256, 0.204, 0.152, 0.000)
		colorBeach     (0.301, 0.239, 0.181, 0.000)
		colorDesert    (0.327, 0.256, 0.176, 0.000)
		colorLowland   (0.359, 0.274, 0.200, 0.000)
		colorUpland    (0.398, 0.332, 0.243, 0.000)
		colorRock      (0.430, 0.361, 0.262, 0.000)
		colorSnow      (0.468, 0.384, 0.276, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.148215
		Period          2.84232
		Eccentricity    0.0701705
		Inclination     58.2108
		AscendingNode   81.1523
		ArgOfPericenter -136.739
		MeanAnomaly     -122.729
	}
}

DwarfMoon	"Crait System 11.D48"
{
	ParentBody     "Crait System 11"
	Class	       "Asteroid"

	Mass            5.21144e-008
	Radius          48.2602
	InertiaMoment   0.398764

	RotationPeriod  540.081
	Obliquity       -98.531
	EqAscendNode    25.8231

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.710 0.708 0.705)

	Surface
	{
		SurfStyle       0.195569
		OceanStyle      0.3749
		Randomize      (0.869, 0.855, 0.653)
		colorDistMagn   0.39083
		colorDistFreq   1.28898
		detailScale     1317.83
		colorConversion true
		snowLevel       2
		tropicLatitude  0.389078
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.48768
		terraceProb     0.300319
		erosion         0
		montesMagn      0.507607
		montesFreq      3.69994
		montesSpiky     0.97843
		montesFraction  0.743103
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.70245
		hillsFraction   0.609631
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231436
		craterFreq      0.173599
		craterDensity   0.929937
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.474436
		volcanoTemp     1415.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.284, 0.283, 0.282, 0.000)
		colorShelf     (0.302, 0.301, 0.300, 0.000)
		colorBeach     (0.320, 0.318, 0.317, 0.000)
		colorDesert    (0.337, 0.336, 0.335, 0.000)
		colorLowland   (0.355, 0.354, 0.353, 0.000)
		colorUpland    (0.373, 0.371, 0.370, 0.000)
		colorRock      (0.391, 0.389, 0.388, 0.000)
		colorSnow      (0.408, 0.407, 0.405, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.148611
		Period          2.85372
		Eccentricity    0.180758
		Inclination     -88.8288
		AscendingNode   21.7763
		ArgOfPericenter -70.2867
		MeanAnomaly     -28.0531
	}
}

DwarfMoon	"Crait System 11.D49"
{
	ParentBody     "Crait System 11"
	Class	       "Asteroid"

	Mass            7.0855e-008
	Radius          62.6042
	InertiaMoment   0.399715

	RotationPeriod  599.353
	Obliquity       -81.4166
	EqAscendNode    -77.2079

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.567 0.562 0.555)

	Surface
	{
		SurfStyle       0.999852
		OceanStyle      0.715792
		Randomize      (0.153, 0.767, 0.595)
		colorDistMagn   0.428148
		colorDistFreq   1.4283
		detailScale     1709.51
		colorConversion true
		snowLevel       2
		tropicLatitude  0.986152
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.481109
		terraceProb     0.448445
		erosion         0
		montesMagn      0.550616
		montesFreq      2.97953
		montesSpiky     0.854198
		montesFraction  0.738031
		dunesFraction   0
		hillsMagn       0
		hillsFreq       12.0392
		hillsFraction   0.607139
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226836
		craterFreq      0.179675
		craterDensity   0.81172
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.516401
		volcanoTemp     1416.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.193, 0.197, 0.222, 0.050)
		colorShelf     (0.227, 0.231, 0.255, 0.040)
		colorBeach     (0.261, 0.264, 0.289, 0.030)
		colorDesert    (0.295, 0.298, 0.328, 0.020)
		colorLowland   (0.329, 0.332, 0.361, 0.030)
		colorUpland    (0.363, 0.366, 0.394, 0.050)
		colorRock      (0.397, 0.399, 0.439, 0.020)
		colorSnow      (0.397, 0.399, 0.439, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.149114
		Period          2.86823
		Eccentricity    0.150508
		Inclination     -85.2463
		AscendingNode   -79.5805
		ArgOfPericenter 8.40088
		MeanAnomaly     138.425
	}
}

DwarfMoon	"Crait System 11.D50"
{
	ParentBody     "Crait System 11"
	Class	       "Asteroid"

	Mass            9.65582e-008
	Radius          65.845
	InertiaMoment   0.397633

	RotationPeriod  540.569
	Obliquity       94.7914
	EqAscendNode    -67.9338

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.633 0.440 0.363)

	Surface
	{
		SurfStyle       0.840032
		OceanStyle      0.0994065
		Randomize      (0.144, 0.836, 0.993)
		colorDistMagn   0.190066
		colorDistFreq   1.35541
		detailScale     1798.01
		colorConversion true
		snowLevel       2
		tropicLatitude  0.928105
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.565787
		terraceProb     0.566943
		erosion         0
		montesMagn      0.635078
		montesFreq      3.36233
		montesSpiky     0.962905
		montesFraction  0.833236
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.97112
		hillsFraction   0.904727
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228675
		craterFreq      0.269084
		craterDensity   0.883167
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.442851
		volcanoTemp     1869.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.247, 0.149, 0.102, 0.000)
		colorShelf     (0.253, 0.154, 0.116, 0.000)
		colorBeach     (0.298, 0.180, 0.138, 0.000)
		colorDesert    (0.323, 0.193, 0.134, 0.000)
		colorLowland   (0.355, 0.207, 0.152, 0.000)
		colorUpland    (0.393, 0.251, 0.185, 0.000)
		colorRock      (0.424, 0.273, 0.199, 0.000)
		colorSnow      (0.462, 0.290, 0.210, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.149648
		Period          2.88365
		Eccentricity    0.224593
		Inclination     77.3839
		AscendingNode   -68.6474
		ArgOfPericenter 154.745
		MeanAnomaly     -176.096
	}
}

DwarfMoon	"Crait System 11.D51"
{
	ParentBody     "Crait System 11"
	Class	       "Asteroid"

	Mass            1.32016e-007
	Radius          70.1964
	InertiaMoment   0.398912

	RotationPeriod  495.056
	Obliquity       61.7924
	EqAscendNode    144.689

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.679 0.568 0.415)

	Surface
	{
		SurfStyle       0.686303
		OceanStyle      0.806458
		Randomize      (0.261, -0.602, -0.566)
		colorDistMagn   0.0348372
		colorDistFreq   3.97027
		detailScale     1916.83
		colorConversion true
		snowLevel       2
		tropicLatitude  0.46805
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.395743
		terraceProb     0.384739
		erosion         0
		montesMagn      0.473852
		montesFreq      3.19324
		montesSpiky     0.917517
		montesFraction  0.441323
		dunesFraction   0
		hillsMagn       0
		hillsFreq       16.3687
		hillsFraction   0.726356
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262717
		craterFreq      0.174141
		craterDensity   0.997585
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.516239
		volcanoTemp     1657.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.265, 0.193, 0.116, 0.000)
		colorShelf     (0.271, 0.199, 0.133, 0.000)
		colorBeach     (0.319, 0.233, 0.158, 0.000)
		colorDesert    (0.346, 0.250, 0.153, 0.000)
		colorLowland   (0.380, 0.267, 0.174, 0.000)
		colorUpland    (0.421, 0.324, 0.212, 0.000)
		colorRock      (0.455, 0.352, 0.228, 0.000)
		colorSnow      (0.495, 0.375, 0.241, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.150295
		Period          2.90237
		Eccentricity    0.0561734
		Inclination     69.6027
		AscendingNode   150.509
		ArgOfPericenter 82.6445
		MeanAnomaly     90.9466
	}
}

DwarfMoon	"Crait System 11.D52"
{
	ParentBody     "Crait System 11"
	Class	       "Asteroid"

	Mass            1.81268e-007
	Radius          74.0944
	InertiaMoment   0.399841

	RotationPeriod  447.77
	Obliquity       -23.417
	EqAscendNode    -173.955

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.417 0.413 0.408)

	Surface
	{
		SurfStyle       0.342048
		OceanStyle      0.981154
		Randomize      (-0.488, 0.590, -0.370)
		colorDistMagn   0.432645
		colorDistFreq   2.80271
		detailScale     2023.27
		colorConversion true
		snowLevel       2
		tropicLatitude  0.709131
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.3849
		terraceProb     0.155307
		erosion         0
		montesMagn      0.509598
		montesFreq      3.36489
		montesSpiky     0.940036
		montesFraction  0.747476
		dunesFraction   0
		hillsMagn       0
		hillsFreq       12.3952
		hillsFraction   0.505151
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234761
		craterFreq      0.19429
		craterDensity   0.898886
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.579926
		volcanoTemp     1465.14
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.167, 0.165, 0.163, 0.000)
		colorShelf     (0.177, 0.175, 0.173, 0.000)
		colorBeach     (0.188, 0.186, 0.184, 0.000)
		colorDesert    (0.198, 0.196, 0.194, 0.000)
		colorLowland   (0.208, 0.206, 0.204, 0.000)
		colorUpland    (0.219, 0.217, 0.214, 0.000)
		colorRock      (0.229, 0.227, 0.224, 0.000)
		colorSnow      (0.240, 0.237, 0.235, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.150571
		Period          2.91036
		Eccentricity    0.262064
		Inclination     -68.2381
		AscendingNode   -171.313
		ArgOfPericenter 115.808
		MeanAnomaly     -130.88
	}
}

DwarfMoon	"Crait System 11.D53"
{
	ParentBody     "Crait System 11"
	Class	       "Asteroid"

	Mass            2.5024e-007
	Radius          96.3988
	InertiaMoment   0.397868

	RotationPeriod  493.21
	Obliquity       8.4765
	EqAscendNode    -157.056

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.622 0.617 0.614)

	Surface
	{
		SurfStyle       0.263124
		OceanStyle      0.137781
		Randomize      (0.006, 0.324, 0.230)
		colorDistMagn   0.777263
		colorDistFreq   3.07773
		detailScale     2632.33
		colorConversion true
		snowLevel       2
		tropicLatitude  0.354629
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.389169
		terraceProb     0.295334
		erosion         0
		montesMagn      0.474425
		montesFreq      2.80402
		montesSpiky     0.930823
		montesFraction  0.707598
		dunesFraction   0
		hillsMagn       0
		hillsFreq       24.3956
		hillsFraction   0.472196
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.270938
		craterFreq      0.350586
		craterDensity   0.981522
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.563581
		volcanoTemp     1476.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.249, 0.247, 0.245, 0.000)
		colorShelf     (0.264, 0.262, 0.261, 0.000)
		colorBeach     (0.280, 0.278, 0.276, 0.000)
		colorDesert    (0.295, 0.293, 0.291, 0.000)
		colorLowland   (0.311, 0.309, 0.307, 0.000)
		colorUpland    (0.327, 0.324, 0.322, 0.000)
		colorRock      (0.342, 0.339, 0.338, 0.000)
		colorSnow      (0.358, 0.355, 0.353, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.150781
		Period          2.91646
		Eccentricity    0.259648
		Inclination     27.9694
		AscendingNode   -152.744
		ArgOfPericenter -178.422
		MeanAnomaly     59.1358
	}
}

DwarfMoon	"Crait System 11.D54"
{
	ParentBody     "Crait System 11"
	Class	       "Asteroid"

	Mass            3.47754e-007
	Radius          101.55
	InertiaMoment   0.399054

	RotationPeriod  442.78
	Obliquity       99.4361
	EqAscendNode    180.108

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.663 0.660 0.656)

	Surface
	{
		SurfStyle       0.0682132
		OceanStyle      0.820876
		Randomize      (-0.585, -0.285, -0.676)
		colorDistMagn   0.143099
		colorDistFreq   5.9249
		detailScale     2772.99
		colorConversion true
		snowLevel       2
		tropicLatitude  0.549647
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.724518
		terraceProb     0.356385
		erosion         0
		montesMagn      0.39616
		montesFreq      2.71459
		montesSpiky     0.880558
		montesFraction  0.0751005
		dunesFraction   0
		hillsMagn       0
		hillsFreq       23.2127
		hillsFraction   0.526317
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.204675
		craterFreq      0.374075
		craterDensity   0.894134
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.525886
		volcanoTemp     1477.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.265, 0.264, 0.262, 0.000)
		colorShelf     (0.282, 0.281, 0.279, 0.000)
		colorBeach     (0.298, 0.297, 0.295, 0.000)
		colorDesert    (0.315, 0.314, 0.312, 0.000)
		colorLowland   (0.331, 0.330, 0.328, 0.000)
		colorUpland    (0.348, 0.347, 0.344, 0.000)
		colorRock      (0.364, 0.363, 0.361, 0.000)
		colorSnow      (0.381, 0.380, 0.377, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.151394
		Period          2.93427
		Eccentricity    0.385037
		Inclination     66.2843
		AscendingNode   176.355
		ArgOfPericenter 87.2599
		MeanAnomaly     9.49222
	}
}

DwarfMoon	"Crait System 11.D55"
{
	ParentBody     "Crait System 11"
	Class	       "Asteroid"

	Mass            4.87165e-007
	Radius          109.099
	InertiaMoment   0.399966

	RotationPeriod  403.354
	Obliquity       -5.35354
	EqAscendNode    -127.219

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.548 0.540 0.535)

	Surface
	{
		SurfStyle       0.508052
		OceanStyle      0.887575
		Randomize      (-0.246, -0.153, 0.462)
		colorDistMagn   0.761737
		colorDistFreq   4.72948
		detailScale     2979.13
		colorConversion true
		snowLevel       2
		tropicLatitude  0.928884
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.320926
		terraceProb     0.419634
		erosion         0
		montesMagn      0.469784
		montesFreq      2.04731
		montesSpiky     0.948743
		montesFraction  0.518556
		dunesFraction   0
		hillsMagn       0
		hillsFreq       26.6343
		hillsFraction   0.745113
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228426
		craterFreq      0.409938
		craterDensity   0.968758
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.394487
		volcanoTemp     1451.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.214, 0.184, 0.150, 0.000)
		colorShelf     (0.219, 0.189, 0.171, 0.000)
		colorBeach     (0.257, 0.221, 0.203, 0.000)
		colorDesert    (0.279, 0.238, 0.198, 0.000)
		colorLowland   (0.307, 0.254, 0.225, 0.000)
		colorUpland    (0.340, 0.308, 0.273, 0.000)
		colorRock      (0.367, 0.335, 0.294, 0.000)
		colorSnow      (0.400, 0.357, 0.310, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.151979
		Period          2.95129
		Eccentricity    0.292493
		Inclination     65.1628
		AscendingNode   -124.402
		ArgOfPericenter -1.04838
		MeanAnomaly     45.613
	}
}

DwarfMoon	"Crait System 11.D56"
{
	ParentBody     "Crait System 11"
	Class	       "Asteroid"

	Mass            6.89088e-007
	Radius          116.813
	InertiaMoment   0.398077

	RotationPeriod  363.163
	Obliquity       -43.8558
	EqAscendNode    -2.32917

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.736 0.733 0.728)

	Surface
	{
		SurfStyle       0.544619
		OceanStyle      0.470118
		Randomize      (0.545, -0.519, 0.739)
		colorDistMagn   0.71359
		colorDistFreq   8.11108
		detailScale     3189.76
		colorConversion true
		snowLevel       2
		tropicLatitude  0.939619
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.472639
		terraceProb     0.237581
		erosion         0
		montesMagn      0.395891
		montesFreq      3.21448
		montesSpiky     0.935605
		montesFraction  0.169243
		dunesFraction   0
		hillsMagn       0
		hillsFreq       38.6241
		hillsFraction   0.797922
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254155
		craterFreq      0.556986
		craterDensity   0.989274
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.532993
		volcanoTemp     1653.32
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.287, 0.249, 0.204, 0.000)
		colorShelf     (0.295, 0.257, 0.233, 0.000)
		colorBeach     (0.346, 0.301, 0.277, 0.000)
		colorDesert    (0.376, 0.323, 0.270, 0.000)
		colorLowland   (0.412, 0.345, 0.306, 0.000)
		colorUpland    (0.457, 0.418, 0.372, 0.000)
		colorRock      (0.493, 0.454, 0.401, 0.000)
		colorSnow      (0.538, 0.484, 0.422, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.152196
		Period          2.9576
		Eccentricity    0.135085
		Inclination     -26.1528
		AscendingNode   -2.7202
		ArgOfPericenter 42.8702
		MeanAnomaly     -28.5111
	}
}

DwarfMoon	"Crait System 11.D57"
{
	ParentBody     "Crait System 11"
	Class	       "Asteroid"

	Mass            9.86043e-007
	Radius          154.3
	InertiaMoment   0.399192

	RotationPeriod  400.665
	Obliquity       -31.9428
	EqAscendNode    25.8791

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.779 0.734 0.717)

	Surface
	{
		SurfStyle       0.891181
		OceanStyle      0.858703
		Randomize      (0.986, -0.212, 0.295)
		colorDistMagn   0.819134
		colorDistFreq   10.2633
		detailScale     4213.42
		colorConversion true
		snowLevel       2
		tropicLatitude  0.996484
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.537298
		terraceProb     0.327287
		erosion         0
		montesMagn      0.612308
		montesFreq      2.93654
		montesSpiky     0.976406
		montesFraction  0.521493
		dunesFraction   0
		hillsMagn       0
		hillsFreq       47.3969
		hillsFraction   0.836063
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258057
		craterFreq      0.908936
		craterDensity   0.827187
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.513525
		volcanoTemp     1631.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.265, 0.257, 0.287, 0.050)
		colorShelf     (0.312, 0.301, 0.330, 0.040)
		colorBeach     (0.358, 0.345, 0.373, 0.030)
		colorDesert    (0.405, 0.389, 0.423, 0.020)
		colorLowland   (0.452, 0.433, 0.466, 0.030)
		colorUpland    (0.499, 0.477, 0.509, 0.050)
		colorRock      (0.545, 0.521, 0.567, 0.020)
		colorSnow      (0.545, 0.521, 0.567, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.152641
		Period          2.9706
		Eccentricity    0.0266055
		Inclination     -67.1602
		AscendingNode   32.074
		ArgOfPericenter 109.18
		MeanAnomaly     23.8185
	}
}

DwarfMoon	"Crait System 11.D58"
{
	ParentBody     "Crait System 11"
	Class	       "Asteroid"

	Mass            1.43066e-006
	Radius          163.761
	InertiaMoment   0.395809

	RotationPeriod  352.568
	Obliquity       -66.267
	EqAscendNode    139.157

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.513 0.507 0.501)

	Surface
	{
		SurfStyle       0.62703
		OceanStyle      0.991856
		Randomize      (-0.349, 0.847, -0.736)
		colorDistMagn   0.991639
		colorDistFreq   8.00082
		detailScale     4471.77
		colorConversion true
		snowLevel       2
		tropicLatitude  0.662178
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.461119
		terraceProb     0.270391
		erosion         0
		montesMagn      0.490206
		montesFreq      2.94218
		montesSpiky     0.866297
		montesFraction  0.409338
		dunesFraction   0
		hillsMagn       0
		hillsFreq       67.3196
		hillsFraction   0.622483
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247717
		craterFreq      0.731669
		craterDensity   0.823157
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.373894
		volcanoTemp     1416.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.200, 0.172, 0.140, 0.000)
		colorShelf     (0.205, 0.177, 0.160, 0.000)
		colorBeach     (0.241, 0.208, 0.190, 0.000)
		colorDesert    (0.262, 0.223, 0.185, 0.000)
		colorLowland   (0.287, 0.238, 0.210, 0.000)
		colorUpland    (0.318, 0.289, 0.255, 0.000)
		colorRock      (0.344, 0.314, 0.276, 0.000)
		colorSnow      (0.374, 0.335, 0.291, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.152898
		Period          2.97811
		Eccentricity    0.284736
		Inclination     -76.0418
		AscendingNode   137.24
		ArgOfPericenter -141.677
		MeanAnomaly     -41.3518
	}
}

DwarfMoon	"Crait System 11.D59"
{
	ParentBody     "Crait System 11"
	Class	       "Asteroid"

	Mass            2.11066e-006
	Radius          178.863
	InertiaMoment   0.398266

	RotationPeriod  318.687
	Obliquity       148.198
	EqAscendNode    142.628

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.640 0.634 0.630)

	Surface
	{
		SurfStyle       0.500541
		OceanStyle      0.807475
		Randomize      (0.965, -0.010, 0.057)
		colorDistMagn   0.311276
		colorDistFreq   21.2302
		detailScale     4884.16
		colorConversion true
		snowLevel       2
		tropicLatitude  0.92833
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.295219
		terraceProb     0.358783
		erosion         0
		montesMagn      0.395176
		montesFreq      2.18453
		montesSpiky     0.973018
		montesFraction  0.296958
		dunesFraction   0
		hillsMagn       0
		hillsFreq       73.5093
		hillsFraction   0.926416
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228014
		craterFreq      0.970097
		craterDensity   0.621064
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.455318
		volcanoTemp     1514.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.249, 0.216, 0.176, 0.000)
		colorShelf     (0.256, 0.222, 0.202, 0.000)
		colorBeach     (0.301, 0.260, 0.239, 0.000)
		colorDesert    (0.326, 0.279, 0.233, 0.000)
		colorLowland   (0.358, 0.298, 0.265, 0.000)
		colorUpland    (0.397, 0.361, 0.321, 0.000)
		colorRock      (0.429, 0.393, 0.346, 0.000)
		colorSnow      (0.467, 0.418, 0.365, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.153473
		Period          2.9949
		Eccentricity    0.455461
		Inclination     85.2548
		AscendingNode   147.324
		ArgOfPericenter 9.84317
		MeanAnomaly     -129.487
	}
}

Moon	"Crait System 11.12"
{
	ParentBody     "Crait System 11"
	Class	       "IceWorld"

	Mass            3.17738e-006
	Radius          196.084
	InertiaMoment   0.399326

	RotationPeriod  285.702
	Obliquity       123.768
	EqAscendNode    45.8903

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.630 0.567 0.463)

	Surface
	{
		SurfStyle       0.463138
		OceanStyle      0.610204
		Randomize      (-0.866, -0.388, -0.646)
		colorDistMagn   0.0584841
		colorDistFreq   20.9608
		detailScale     504.338
		colorConversion true
		drivenDarkening 0.0381805
		seaLevel        0.183947
		snowLevel       2
		tropicLatitude  0.801992
		icecapLatitude  1
		icecapHeight    0.183947
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.91889
		venusFreq       0.600317
		venusMagn       0
		mareFreq        0
		mareDensity     1.13638e-006
		terraceProb     0.15387
		erosion         0
		montesMagn      0.065997
		montesFreq      8.18588
		montesSpiky     0.924006
		montesFraction  0.761423
		dunesMagn       0.0336286
		dunesFreq       256.874
		dunesFraction   0.774368
		hillsMagn       0.118332
		hillsFreq       19.7763
		hillsFraction   0.864103
		hills2Fraction  0.0343724
		riversMagn      66.0863
		riversFreq      1.30703
		riversSin       5.60917
		riversOctaves   0
		canyonsMagn     0.554994
		canyonsFreq     0.0784355
		canyonFraction  0
		cracksMagn      0.0522326
		cracksFreq      0.0814746
		cracksOctaves   0
		craterMagn      1.34625
		craterFreq      0.626512
		craterDensity   0.87101
		craterOctaves   7
		craterRayedFactor 0.19531
		volcanoMagn     0.194462
		volcanoFreq     0.823079
		volcanoDensity  0.143598
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.16245
		volcanoRadius   0.142642
		volcanoTemp     1427.24
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.189, 0.142, 0.102, 0.000)
		colorShelf     (0.233, 0.176, 0.130, 0.000)
		colorBeach     (0.353, 0.266, 0.195, 0.200)
		colorDesert    (0.321, 0.249, 0.171, 0.500)
		colorLowland   (0.246, 0.193, 0.130, 0.800)
		colorUpland    (0.416, 0.340, 0.241, 1.000)
		colorRock      (0.670, 0.620, 0.550, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.246, 0.193, 0.130, 0.800)
		colorUpPlants  (0.416, 0.340, 0.241, 1.000)
		BumpHeight      9.80418
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
		SemiMajorAxis   0.153818
		Period          3.00502
		Eccentricity    0.118728
		Inclination     86.3483
		AscendingNode   47.363
		ArgOfPericenter -126.283
		MeanAnomaly     -135.921
	}
}

Moon	"Crait System 11.13"
{
	ParentBody     "Crait System 11"
	Class	       "IceWorld"

	Mass            4.90295e-006
	Radius          267.901
	InertiaMoment   0.396566

	RotationPeriod  312.635
	Obliquity       -2.12036
	EqAscendNode    110.346

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.734 0.729 0.728)

	Surface
	{
		SurfStyle       0.85344
		OceanStyle      0.238489
		Randomize      (0.072, 0.373, -0.270)
		colorDistMagn   0.0508366
		colorDistFreq   40.3706
		detailScale     689.057
		colorConversion true
		drivenDarkening 0.0381151
		seaLevel        0.193639
		snowLevel       2
		tropicLatitude  0.44241
		icecapLatitude  0.908837
		icecapHeight    0.2048
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.84314
		venusFreq       0.968422
		venusMagn       0
		mareFreq        0
		mareDensity     1.10742e-006
		terraceProb     0.763563
		erosion         0
		montesMagn      0.072629
		montesFreq      15.9901
		montesSpiky     0.93992
		montesFraction  0.67929
		dunesMagn       0.0402308
		dunesFreq       356.737
		dunesFraction   0.356853
		hillsMagn       0.115257
		hillsFreq       27.7122
		hillsFraction   0.632336
		hills2Fraction  0.242971
		riversMagn      52.477
		riversFreq      1.88438
		riversSin       5.92357
		riversOctaves   0
		canyonsMagn     0.36692
		canyonsFreq     0.0823655
		canyonFraction  0
		cracksMagn      0.0758893
		cracksFreq      0.0656977
		cracksOctaves   0
		craterMagn      0.938047
		craterFreq      0.595411
		craterDensity   0.858822
		craterOctaves   8
		craterRayedFactor 0.197415
		volcanoMagn     0.192923
		volcanoFreq     0.67108
		volcanoDensity  0.137219
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.31367
		volcanoRadius   0.156125
		volcanoTemp     1722.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.734, 0.547, 0.418, 0.000)
		colorShelf     (0.697, 0.519, 0.397, 0.000)
		colorBeach     (0.367, 0.273, 0.209, 0.000)
		colorDesert    (0.624, 0.465, 0.355, 0.000)
		colorLowland   (0.595, 0.481, 0.397, 0.000)
		colorUpland    (0.683, 0.508, 0.389, 0.000)
		colorRock      (1.000, 1.000, 1.000, 0.500)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.595, 0.481, 0.397, 0.000)
		colorUpPlants  (0.683, 0.508, 0.389, 0.000)
		BumpHeight      13.3951
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
		SemiMajorAxis   0.154082
		Period          3.01275
		Eccentricity    0.475368
		Inclination     25.51
		AscendingNode   108.589
		ArgOfPericenter 124.182
		MeanAnomaly     18.2785
	}
}

DwarfMoon	"Crait System 11.D60"
{
	ParentBody     "Crait System 11"
	Class	       "Asteroid"

	Mass            1.41783e-011
	Radius          3.54132
	InertiaMoment   0.398442

	RotationPeriod  2161.93
	Obliquity       -87.7013
	EqAscendNode    -42.244

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.586 0.474 0.425)

	Surface
	{
		SurfStyle       0.183293
		OceanStyle      0.980236
		Randomize      (-0.131, -0.760, -0.275)
		colorDistMagn   0.930384
		colorDistFreq   0.00538581
		detailScale     96.7015
		colorConversion true
		snowLevel       2
		tropicLatitude  0.866512
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.400479
		terraceProb     0.445953
		erosion         0
		montesMagn      0.471676
		montesFreq      2.08766
		montesSpiky     0.974507
		montesFraction  0.609316
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0293596
		hillsFraction   0.485676
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.216418
		craterFreq      0.239357
		craterDensity   0.959978
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.509307
		volcanoTemp     1676.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.234, 0.190, 0.170, 0.000)
		colorShelf     (0.249, 0.201, 0.181, 0.000)
		colorBeach     (0.264, 0.213, 0.191, 0.000)
		colorDesert    (0.278, 0.225, 0.202, 0.000)
		colorLowland   (0.293, 0.237, 0.213, 0.000)
		colorUpland    (0.307, 0.249, 0.223, 0.000)
		colorRock      (0.322, 0.261, 0.234, 0.000)
		colorSnow      (0.337, 0.272, 0.244, 1.000)
		BumpHeight      3.18718
		BumpOffset      0.637437
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.154629
		Period          3.02881
		Eccentricity    0.215255
		Inclination     -39.4419
		AscendingNode   -33.3703
		ArgOfPericenter 16.0645
		MeanAnomaly     -77.0413
	}
}