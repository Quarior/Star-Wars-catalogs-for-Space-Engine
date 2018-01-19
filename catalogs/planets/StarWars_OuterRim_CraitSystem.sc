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
		DiffMap        "Europa/Surface-JVV"
		DiffTileSize    258
		DiffTileBorder  1
		BumpMap        "Europa/Bump-fake-SE"
		BumpTileSize    258
		BumpTileBorder  1
		GlowTileSize    256
		GlowTileBorder  2
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

Asteroid	"Crait System S1"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            7.58034e-014
	Radius          0.254784
	InertiaMoment   0.398421

	Obliquity       -3.71492
	EqAscendNode    -116.413
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.664 0.534 0.397)

	Surface
	{
		SurfStyle       0.00785986
		OceanStyle      0.175483
		Randomize      (-0.595, 0.324, 0.611)
		colorDistMagn   0.519125
		colorDistFreq   4.3638e-005
		detailScale     6.9573
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0682332
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.307599
		terraceProb     0.43766
		erosion         0
		montesMagn      0.489276
		montesFreq      2.73572
		montesSpiky     0.884413
		montesFraction  0.751245
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000177076
		hillsFraction   0.565248
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.201919
		craterFreq      0.187324
		craterDensity   0.997628
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.577431
		volcanoTemp     1625.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.265, 0.214, 0.159, 0.000)
		colorShelf     (0.282, 0.227, 0.169, 0.000)
		colorBeach     (0.299, 0.240, 0.178, 0.000)
		colorDesert    (0.315, 0.254, 0.188, 0.000)
		colorLowland   (0.332, 0.267, 0.198, 0.000)
		colorUpland    (0.348, 0.281, 0.208, 0.000)
		colorRock      (0.365, 0.294, 0.218, 0.000)
		colorSnow      (0.382, 0.307, 0.228, 1.000)
		BumpHeight      0.229305
		BumpOffset      0.0458611
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.166119
		Period          0.0900806
		Eccentricity    0.0609943
		Inclination     -3.71492
		AscendingNode   -116.413
		ArgOfPericenter -40.5739
		MeanAnomaly     -136.003
	}
}

Asteroid	"Crait System S2"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.11549e-010
	Radius          3.25511
	InertiaMoment   0.399458

	RotationPeriod  1135.58
	Obliquity       -2.46367
	EqAscendNode    34.5346

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.807 0.710 0.677)

	Surface
	{
		SurfStyle       0.235356
		OceanStyle      0.61191
		Randomize      (-0.699, 0.682, -0.372)
		colorDistMagn   0.969827
		colorDistFreq   0.00758759
		detailScale     88.8862
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0820282
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.546933
		terraceProb     0.128094
		erosion         0
		montesMagn      0.560702
		montesFreq      3.66021
		montesSpiky     0.969292
		montesFraction  0.438728
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0156198
		hillsFraction   0.631895
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249131
		craterFreq      0.250798
		craterDensity   0.982351
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.465187
		volcanoTemp     1472.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.323, 0.284, 0.271, 0.000)
		colorShelf     (0.343, 0.302, 0.288, 0.000)
		colorBeach     (0.363, 0.320, 0.305, 0.000)
		colorDesert    (0.383, 0.337, 0.321, 0.000)
		colorLowland   (0.404, 0.355, 0.338, 0.000)
		colorUpland    (0.424, 0.373, 0.355, 0.000)
		colorRock      (0.444, 0.391, 0.372, 0.000)
		colorSnow      (0.464, 0.408, 0.389, 1.000)
		BumpHeight      2.9296
		BumpOffset      0.58592
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.174713
		Period          0.0971599
		Eccentricity    0.107179
		Inclination     -2.46367
		AscendingNode   34.5346
		ArgOfPericenter -27.1035
		MeanAnomaly     -127.403
	}
}

Asteroid	"Crait System S3"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.6415e-007
	Radius          42.124
	InertiaMoment   0.397073

	Obliquity       0.656096
	EqAscendNode    75.7962
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.674 0.627 0.596)

	Surface
	{
		SurfStyle       0.255365
		OceanStyle      0.541566
		Randomize      (-0.199, -0.113, 0.410)
		colorDistMagn   0.981539
		colorDistFreq   1.17216
		detailScale     1150.27
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0180723
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.578781
		terraceProb     0.208617
		erosion         0
		montesMagn      0.624219
		montesFreq      1.74062
		montesSpiky     0.790523
		montesFraction  0.527071
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.01502
		hillsFraction   0.543864
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.26797
		craterFreq      0.215737
		craterDensity   0.858897
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.490914
		volcanoTemp     1592.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.270, 0.251, 0.238, 0.000)
		colorShelf     (0.287, 0.266, 0.253, 0.000)
		colorBeach     (0.303, 0.282, 0.268, 0.000)
		colorDesert    (0.320, 0.298, 0.283, 0.000)
		colorLowland   (0.337, 0.313, 0.298, 0.000)
		colorUpland    (0.354, 0.329, 0.313, 0.000)
		colorRock      (0.371, 0.345, 0.328, 0.000)
		colorSnow      (0.388, 0.360, 0.343, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.177208
		Period          0.0992489
		Eccentricity    0.119752
		Inclination     0.656096
		AscendingNode   75.7962
		ArgOfPericenter -104.763
		MeanAnomaly     -6.77134
	}
}

Asteroid	"Crait System S4"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            9.61651e-016
	Radius          0.0759515
	InertiaMoment   0.398651

	Obliquity       2.58147
	EqAscendNode    169.519
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.779 0.777 0.776)

	Surface
	{
		SurfStyle       0.991669
		OceanStyle      0.763036
		Randomize      (-0.014, -0.009, 0.512)
		colorDistMagn   0.939281
		colorDistFreq   2.37842e-006
		detailScale     2.07398
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00822859
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.604753
		terraceProb     0.542587
		erosion         0
		montesMagn      0.493206
		montesFreq      3.34689
		montesSpiky     0.949106
		montesFraction  0.754334
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.46772e-005
		hillsFraction   0.753539
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239102
		craterFreq      0.241893
		craterDensity   1.09706
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.47239
		volcanoTemp     1396.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.265, 0.272, 0.310, 0.050)
		colorShelf     (0.311, 0.319, 0.357, 0.040)
		colorBeach     (0.358, 0.365, 0.403, 0.030)
		colorDesert    (0.405, 0.412, 0.458, 0.020)
		colorLowland   (0.452, 0.459, 0.504, 0.030)
		colorUpland    (0.498, 0.505, 0.551, 0.050)
		colorRock      (0.545, 0.552, 0.613, 0.020)
		colorSnow      (0.545, 0.552, 0.613, 1.000)
		BumpHeight      0.0683564
		BumpOffset      0.0136713
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.178551
		Period          0.100379
		Eccentricity    0.126372
		Inclination     2.58147
		AscendingNode   169.519
		ArgOfPericenter -147.445
		MeanAnomaly     -53.2657
	}
}

Asteroid	"Crait System S5"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.41512e-012
	Radius          0.675885
	InertiaMoment   0.399639

	Obliquity       1.2471
	EqAscendNode    63.7523
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.474 0.470 0.468)

	Surface
	{
		SurfStyle       0.982889
		OceanStyle      0.900186
		Randomize      (-0.397, -0.836, 0.914)
		colorDistMagn   0.510777
		colorDistFreq   0.000304392
		detailScale     18.4562
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0369582
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.471007
		terraceProb     0.243627
		erosion         0
		montesMagn      0.619218
		montesFreq      2.75236
		montesSpiky     0.973553
		montesFraction  0.257984
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00113393
		hillsFraction   0.447745
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.274799
		craterFreq      0.266901
		craterDensity   0.989363
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.448763
		volcanoTemp     1435.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.161, 0.165, 0.187, 0.050)
		colorShelf     (0.190, 0.193, 0.216, 0.040)
		colorBeach     (0.218, 0.221, 0.244, 0.030)
		colorDesert    (0.246, 0.249, 0.276, 0.020)
		colorLowland   (0.275, 0.278, 0.305, 0.030)
		colorUpland    (0.303, 0.306, 0.333, 0.050)
		colorRock      (0.332, 0.334, 0.370, 0.020)
		colorSnow      (0.332, 0.334, 0.370, 1.000)
		BumpHeight      0.608296
		BumpOffset      0.121659
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.174371
		Period          0.0968753
		Eccentricity    0.153471
		Inclination     1.2471
		AscendingNode   63.7523
		ArgOfPericenter -92.8204
		MeanAnomaly     32.4026
	}
}

Asteroid	"Crait System S6"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            2.08242e-009
	Radius          8.63489
	InertiaMoment   0.397512

	Obliquity       -2.39333
	EqAscendNode    87.4587
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.447 0.442 0.439)

	Surface
	{
		SurfStyle       0.936504
		OceanStyle      0.545594
		Randomize      (-0.411, 0.013, -0.606)
		colorDistMagn   0.79347
		colorDistFreq   0.0239374
		detailScale     235.79
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0603242
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.447415
		terraceProb     0.323675
		erosion         0
		montesMagn      0.652897
		montesFreq      2.63654
		montesSpiky     0.9505
		montesFraction  0.531341
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.159682
		hillsFraction   0.568749
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248732
		craterFreq      0.217111
		craterDensity   1.00756
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.632515
		volcanoTemp     1843.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.152, 0.155, 0.176, 0.050)
		colorShelf     (0.179, 0.181, 0.202, 0.040)
		colorBeach     (0.205, 0.208, 0.228, 0.030)
		colorDesert    (0.232, 0.234, 0.259, 0.020)
		colorLowland   (0.259, 0.261, 0.286, 0.030)
		colorUpland    (0.286, 0.287, 0.312, 0.050)
		colorRock      (0.313, 0.314, 0.347, 0.020)
		colorSnow      (0.313, 0.314, 0.347, 1.000)
		BumpHeight      7.7714
		BumpOffset      1.55428
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.163729
		Period          0.088143
		Eccentricity    0.0472834
		Inclination     -2.39333
		AscendingNode   87.4587
		ArgOfPericenter -152.371
		MeanAnomaly     -140.244
	}
}

Asteroid	"Crait System S7"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.21996e-017
	Radius          0.0177138
	InertiaMoment   0.398865

	Obliquity       2.4149
	EqAscendNode    72.4011
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.566 0.562 0.557)

	Surface
	{
		SurfStyle       0.958111
		OceanStyle      0.934415
		Randomize      (0.097, 0.836, 0.558)
		colorDistMagn   0.23508
		colorDistFreq   1.76899e-007
		detailScale     0.483706
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0679634
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.306017
		terraceProb     0.461244
		erosion         0
		montesMagn      0.514206
		montesFreq      2.92014
		montesSpiky     0.938764
		montesFraction  0.591448
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.26868e-007
		hillsFraction   0.786218
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263145
		craterFreq      0.23641
		craterDensity   0.787322
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.44264
		volcanoTemp     1202.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.192, 0.197, 0.223, 0.050)
		colorShelf     (0.226, 0.230, 0.256, 0.040)
		colorBeach     (0.260, 0.264, 0.290, 0.030)
		colorDesert    (0.294, 0.298, 0.329, 0.020)
		colorLowland   (0.328, 0.331, 0.362, 0.030)
		colorUpland    (0.362, 0.365, 0.395, 0.050)
		colorRock      (0.396, 0.399, 0.440, 0.020)
		colorSnow      (0.396, 0.399, 0.440, 1.000)
		BumpHeight      0.0159424
		BumpOffset      0.00318849
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.161476
		Period          0.0863305
		Eccentricity    0.0339948
		Inclination     2.4149
		AscendingNode   72.4011
		ArgOfPericenter -92.1571
		MeanAnomaly     140.2
	}
}

Asteroid	"Crait System S8"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.79523e-014
	Radius          0.157634
	InertiaMoment   0.399817

	RotationPeriod  2079.64
	Obliquity       -3.27195
	EqAscendNode    169.189

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.471 0.468 0.464)

	Surface
	{
		SurfStyle       0.613218
		OceanStyle      0.748733
		Randomize      (-0.657, 0.689, -0.289)
		colorDistMagn   0.966168
		colorDistFreq   2.00818e-005
		detailScale     4.30446
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0107531
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.341155
		terraceProb     0.307288
		erosion         0
		montesMagn      0.645237
		montesFreq      2.38526
		montesSpiky     0.881873
		montesFraction  0.68819
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.83336e-005
		hillsFraction   0.731858
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23912
		craterFreq      0.208707
		craterDensity   0.892816
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.44262
		volcanoTemp     1674.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.184, 0.159, 0.130, 0.000)
		colorShelf     (0.188, 0.164, 0.149, 0.000)
		colorBeach     (0.221, 0.192, 0.176, 0.000)
		colorDesert    (0.240, 0.206, 0.172, 0.000)
		colorLowland   (0.264, 0.220, 0.195, 0.000)
		colorUpland    (0.292, 0.267, 0.237, 0.000)
		colorRock      (0.315, 0.290, 0.255, 0.000)
		colorSnow      (0.344, 0.309, 0.269, 1.000)
		BumpHeight      0.14187
		BumpOffset      0.0283741
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.17199
		Period          0.0948978
		Eccentricity    0.169441
		Inclination     -3.27195
		AscendingNode   169.189
		ArgOfPericenter 159.71
		MeanAnomaly     -76.2139
	}
}

Asteroid	"Crait System S9"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            2.64178e-011
	Radius          2.01393
	InertiaMoment   0.397856

	Obliquity       2.459
	EqAscendNode    -0.623238
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.713 0.710 0.706)

	Surface
	{
		SurfStyle       0.0607596
		OceanStyle      0.0821611
		Randomize      (-0.014, -0.300, -0.667)
		colorDistMagn   0.101089
		colorDistFreq   0.000253535
		detailScale     54.9937
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0857287
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.603771
		terraceProb     0.431987
		erosion         0
		montesMagn      0.561198
		montesFreq      3.07742
		montesSpiky     0.954018
		montesFraction  0.699486
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00468896
		hillsFraction   0.41259
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242903
		craterFreq      0.186826
		craterDensity   0.860245
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.433087
		volcanoTemp     1542.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.285, 0.284, 0.282, 0.000)
		colorShelf     (0.303, 0.302, 0.300, 0.000)
		colorBeach     (0.321, 0.320, 0.318, 0.000)
		colorDesert    (0.339, 0.337, 0.335, 0.000)
		colorLowland   (0.357, 0.355, 0.353, 0.000)
		colorUpland    (0.374, 0.373, 0.371, 0.000)
		colorRock      (0.392, 0.391, 0.388, 0.000)
		colorSnow      (0.410, 0.408, 0.406, 1.000)
		BumpHeight      1.81254
		BumpOffset      0.362507
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.170184
		Period          0.093407
		Eccentricity    0.083422
		Inclination     2.459
		AscendingNode   -0.623238
		ArgOfPericenter 156.702
		MeanAnomaly     19.4956
	}
}

Asteroid	"Crait System S10"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            3.88752e-008
	Radius          26.0641
	InertiaMoment   0.399066

	RotationPeriod  2462.05
	Obliquity       3.69795
	EqAscendNode    29.4039

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.606 0.480 0.392)

	Surface
	{
		SurfStyle       0.927828
		OceanStyle      0.874111
		Randomize      (-0.452, -0.044, 0.825)
		colorDistMagn   0.54028
		colorDistFreq   0.349815
		detailScale     711.723
		colorConversion true
		snowLevel       2
		tropicLatitude  0.124527
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.366309
		terraceProb     0.238694
		erosion         0
		montesMagn      0.369511
		montesFreq      2.87924
		montesSpiky     0.788901
		montesFraction  0.3833
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.33983
		hillsFraction   0.729119
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255006
		craterFreq      0.222656
		craterDensity   0.900258
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.513714
		volcanoTemp     1340.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.206, 0.168, 0.157, 0.050)
		colorShelf     (0.242, 0.197, 0.180, 0.040)
		colorBeach     (0.279, 0.226, 0.204, 0.030)
		colorDesert    (0.315, 0.254, 0.231, 0.020)
		colorLowland   (0.351, 0.283, 0.255, 0.030)
		colorUpland    (0.388, 0.312, 0.278, 0.050)
		colorRock      (0.424, 0.341, 0.310, 0.020)
		colorSnow      (0.424, 0.341, 0.310, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.170447
		Period          0.0936234
		Eccentricity    0.180029
		Inclination     3.69795
		AscendingNode   29.4039
		ArgOfPericenter -169.95
		MeanAnomaly     -150.531
	}
}

Asteroid	"Crait System S11"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            2.27745e-016
	Radius          0.0367642
	InertiaMoment   0.399993

	Obliquity       -0.366858
	EqAscendNode    -83.6431
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.654 0.575 0.459)

	Surface
	{
		SurfStyle       0.0741228
		OceanStyle      0.449863
		Randomize      (-0.375, -0.346, -0.929)
		colorDistMagn   0.0832902
		colorDistFreq   5.99062e-007
		detailScale     1.00391
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00954326
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.263084
		terraceProb     0.580277
		erosion         0
		montesMagn      0.56502
		montesFreq      2.96611
		montesSpiky     0.954576
		montesFraction  0.49454
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.09135e-006
		hillsFraction   0.625178
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24179
		craterFreq      0.271758
		craterDensity   0.853833
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.468349
		volcanoTemp     1939.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.262, 0.230, 0.183, 0.000)
		colorShelf     (0.278, 0.244, 0.195, 0.000)
		colorBeach     (0.294, 0.259, 0.206, 0.000)
		colorDesert    (0.311, 0.273, 0.218, 0.000)
		colorLowland   (0.327, 0.287, 0.229, 0.000)
		colorUpland    (0.343, 0.302, 0.241, 0.000)
		colorRock      (0.360, 0.316, 0.252, 0.000)
		colorSnow      (0.376, 0.330, 0.264, 1.000)
		BumpHeight      0.0330878
		BumpOffset      0.00661756
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.169726
		Period          0.0930301
		Eccentricity    0.0809479
		Inclination     -0.366858
		AscendingNode   -83.6431
		ArgOfPericenter -169.685
		MeanAnomaly     -107.352
	}
}

Asteroid	"Crait System S12"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            3.35139e-013
	Radius          0.469702
	InertiaMoment   0.398147

	Obliquity       -0.976804
	EqAscendNode    162.09
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.445 0.438 0.434)

	Surface
	{
		SurfStyle       0.426052
		OceanStyle      0.943483
		Randomize      (-0.611, -0.560, -0.485)
		colorDistMagn   0.0960497
		colorDistFreq   6.46943e-005
		detailScale     12.826
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00530407
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.673716
		terraceProb     0.114779
		erosion         0
		montesMagn      0.601961
		montesFreq      3.56394
		montesSpiky     0.824398
		montesFraction  0.563015
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000524046
		hillsFraction   0.787233
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243806
		craterFreq      0.254397
		craterDensity   0.936525
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.540981
		volcanoTemp     1743.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.178, 0.175, 0.174, 0.000)
		colorShelf     (0.189, 0.186, 0.184, 0.000)
		colorBeach     (0.200, 0.197, 0.195, 0.000)
		colorDesert    (0.211, 0.208, 0.206, 0.000)
		colorLowland   (0.222, 0.219, 0.217, 0.000)
		colorUpland    (0.233, 0.230, 0.228, 0.000)
		colorRock      (0.245, 0.241, 0.239, 0.000)
		colorSnow      (0.256, 0.252, 0.250, 1.000)
		BumpHeight      0.422732
		BumpOffset      0.0845464
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.17411
		Period          0.0966576
		Eccentricity    0.104089
		Inclination     -0.976804
		AscendingNode   162.09
		ArgOfPericenter 19.2496
		MeanAnomaly     157.84
	}
}

Asteroid	"Crait System S13"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            4.93174e-010
	Radius          6.07934
	InertiaMoment   0.399259

	RotationPeriod  1683.31
	Obliquity       1.97807
	EqAscendNode    168.587

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.653 0.538 0.390)

	Surface
	{
		SurfStyle       0.960221
		OceanStyle      0.287183
		Randomize      (0.958, 0.114, -0.019)
		colorDistMagn   0.496486
		colorDistFreq   0.0312984
		detailScale     166.006
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00686201
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.387038
		terraceProb     0.14776
		erosion         0
		montesMagn      0.371344
		montesFreq      3.05544
		montesSpiky     0.864126
		montesFraction  0.367502
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0600281
		hillsFraction   0.583236
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217172
		craterFreq      0.181981
		craterDensity   0.790711
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.501195
		volcanoTemp     1543.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.222, 0.188, 0.156, 0.050)
		colorShelf     (0.261, 0.221, 0.180, 0.040)
		colorBeach     (0.300, 0.253, 0.203, 0.030)
		colorDesert    (0.340, 0.285, 0.230, 0.020)
		colorLowland   (0.379, 0.318, 0.254, 0.030)
		colorUpland    (0.418, 0.350, 0.277, 0.050)
		colorRock      (0.457, 0.382, 0.308, 0.020)
		colorSnow      (0.457, 0.382, 0.308, 1.000)
		BumpHeight      5.4714
		BumpOffset      1.09428
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.173339
		Period          0.096016
		Eccentricity    0.100102
		Inclination     1.97807
		AscendingNode   168.587
		ArgOfPericenter 75.6772
		MeanAnomaly     36.5728
	}
}

Asteroid	"Crait System S14"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            7.25732e-007
	Radius          54.0822
	InertiaMoment   0.396345

	RotationPeriod  1995.41
	Obliquity       -2.87933
	EqAscendNode    67.2881

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.470 0.465 0.459)

	Surface
	{
		SurfStyle       0.0830009
		OceanStyle      0.275408
		Randomize      (-0.068, 0.349, -0.611)
		colorDistMagn   0.740136
		colorDistFreq   1.37415
		detailScale     1476.81
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0835634
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.539788
		terraceProb     0.249177
		erosion         0
		montesMagn      0.552581
		montesFreq      3.38043
		montesSpiky     0.915242
		montesFraction  0.606649
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.78764
		hillsFraction   0.833589
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.273263
		craterFreq      0.239842
		craterDensity   0.77516
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.460266
		volcanoTemp     1736.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.188, 0.186, 0.184, 0.000)
		colorShelf     (0.200, 0.198, 0.195, 0.000)
		colorBeach     (0.211, 0.209, 0.207, 0.000)
		colorDesert    (0.223, 0.221, 0.218, 0.000)
		colorLowland   (0.235, 0.233, 0.230, 0.000)
		colorUpland    (0.247, 0.244, 0.241, 0.000)
		colorRock      (0.258, 0.256, 0.253, 0.000)
		colorSnow      (0.270, 0.267, 0.264, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.167314
		Period          0.0910542
		Eccentricity    0.0676999
		Inclination     -2.87933
		AscendingNode   67.288
		ArgOfPericenter -13.0327
		MeanAnomaly     131.84
	}
}

Asteroid	"Crait System S15"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            4.25161e-015
	Radius          0.109547
	InertiaMoment   0.398402

	RotationPeriod  2601.74
	Obliquity       -4.72607
	EqAscendNode    27.3356

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.508 0.501 0.495)

	Surface
	{
		SurfStyle       0.116317
		OceanStyle      0.930024
		Randomize      (0.279, -0.162, -0.983)
		colorDistMagn   0.40269
		colorDistFreq   9.04883e-006
		detailScale     2.99136
		colorConversion true
		snowLevel       2
		tropicLatitude  0.159604
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.525189
		terraceProb     0.41409
		erosion         0
		montesMagn      0.480254
		montesFreq      2.39805
		montesSpiky     0.824024
		montesFraction  0.607746
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.73393e-005
		hillsFraction   0.697175
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241517
		craterFreq      0.167214
		craterDensity   0.843215
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.419901
		volcanoTemp     1457.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.203, 0.201, 0.198, 0.000)
		colorShelf     (0.216, 0.213, 0.211, 0.000)
		colorBeach     (0.229, 0.226, 0.223, 0.000)
		colorDesert    (0.242, 0.238, 0.235, 0.000)
		colorLowland   (0.254, 0.251, 0.248, 0.000)
		colorUpland    (0.267, 0.263, 0.260, 0.000)
		colorRock      (0.280, 0.276, 0.272, 0.000)
		colorSnow      (0.292, 0.288, 0.285, 1.000)
		BumpHeight      0.0985922
		BumpOffset      0.0197184
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.176835
		Period          0.0989354
		Eccentricity    0.137403
		Inclination     -4.72607
		AscendingNode   27.3356
		ArgOfPericenter 124.583
		MeanAnomaly     -112.753
	}
}

Asteroid	"Crait System S16"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            6.25646e-012
	Radius          1.41788
	InertiaMoment   0.399444

	Obliquity       0.466733
	EqAscendNode    -93.9657
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.543 0.536 0.532)

	Surface
	{
		SurfStyle       0.548019
		OceanStyle      0.171163
		Randomize      (-0.467, -0.082, -0.941)
		colorDistMagn   0.605771
		colorDistFreq   0.00107707
		detailScale     38.7175
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0111129
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.619787
		terraceProb     0.256925
		erosion         0
		montesMagn      0.378436
		montesFreq      3.13343
		montesSpiky     0.899435
		montesFraction  0.748262
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00556419
		hillsFraction   0.567719
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227769
		craterFreq      0.201782
		craterDensity   0.80476
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.449238
		volcanoTemp     1341.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.212, 0.182, 0.149, 0.000)
		colorShelf     (0.217, 0.188, 0.170, 0.000)
		colorBeach     (0.255, 0.220, 0.202, 0.000)
		colorDesert    (0.277, 0.236, 0.197, 0.000)
		colorLowland   (0.304, 0.252, 0.224, 0.000)
		colorUpland    (0.337, 0.306, 0.271, 0.000)
		colorRock      (0.364, 0.333, 0.293, 0.000)
		colorSnow      (0.397, 0.354, 0.309, 1.000)
		BumpHeight      1.27609
		BumpOffset      0.255218
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.176284
		Period          0.0984737
		Eccentricity    0.115138
		Inclination     0.466733
		AscendingNode   -93.9657
		ArgOfPericenter -28.7729
		MeanAnomaly     71.8598
	}
}

Asteroid	"Crait System S17"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            9.20672e-009
	Radius          12.6169
	InertiaMoment   0.397032

	Obliquity       -3.93715
	EqAscendNode    133.515
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.572 0.569 0.563)

	Surface
	{
		SurfStyle       0.634858
		OceanStyle      0.436634
		Randomize      (-0.841, 0.101, 0.291)
		colorDistMagn   0.755565
		colorDistFreq   0.11446
		detailScale     344.525
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0541705
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.443038
		terraceProb     0.173827
		erosion         0
		montesMagn      0.230817
		montesFreq      1.98868
		montesSpiky     0.930186
		montesFraction  0.201741
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.416006
		hillsFraction   0.768283
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.282035
		craterFreq      0.186619
		craterDensity   1.03222
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.513643
		volcanoTemp     1816.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.223, 0.193, 0.158, 0.000)
		colorShelf     (0.229, 0.199, 0.180, 0.000)
		colorBeach     (0.269, 0.233, 0.214, 0.000)
		colorDesert    (0.292, 0.250, 0.208, 0.000)
		colorLowland   (0.320, 0.267, 0.237, 0.000)
		colorUpland    (0.355, 0.324, 0.287, 0.000)
		colorRock      (0.383, 0.353, 0.310, 0.000)
		colorSnow      (0.418, 0.376, 0.327, 1.000)
		BumpHeight      11.3552
		BumpOffset      2.27104
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.166103
		Period          0.0900673
		Eccentricity    0.0609018
		Inclination     -3.93715
		AscendingNode   133.515
		ArgOfPericenter 51.7681
		MeanAnomaly     -34.8
	}
}

Asteroid	"Crait System S18"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            5.39362e-017
	Radius          0.0255491
	InertiaMoment   0.398634

	Obliquity       0.302446
	EqAscendNode    -171.669
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.535 0.531 0.529)

	Surface
	{
		SurfStyle       0.260823
		OceanStyle      0.107126
		Randomize      (-0.031, -0.823, 0.554)
		colorDistMagn   0.0501618
		colorDistFreq   4.09615e-007
		detailScale     0.69766
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00077204
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.730245
		terraceProb     0.273351
		erosion         0
		montesMagn      0.577049
		montesFreq      2.54499
		montesSpiky     0.810188
		montesFraction  0.598707
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.42954e-006
		hillsFraction   0.750918
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229327
		craterFreq      0.197302
		craterDensity   0.987815
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.497791
		volcanoTemp     1366.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.214, 0.212, 0.212, 0.000)
		colorShelf     (0.227, 0.226, 0.225, 0.000)
		colorBeach     (0.241, 0.239, 0.238, 0.000)
		colorDesert    (0.254, 0.252, 0.252, 0.000)
		colorLowland   (0.268, 0.266, 0.265, 0.000)
		colorUpland    (0.281, 0.279, 0.278, 0.000)
		colorRock      (0.294, 0.292, 0.291, 0.000)
		colorSnow      (0.308, 0.305, 0.304, 1.000)
		BumpHeight      0.0229942
		BumpOffset      0.00459883
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.176734
		Period          0.0988509
		Eccentricity    0.138051
		Inclination     0.302446
		AscendingNode   -171.669
		ArgOfPericenter -125.574
		MeanAnomaly     -75.0987
	}
}

Asteroid	"Crait System S19"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            7.93701e-014
	Radius          0.330686
	InertiaMoment   0.399625

	Obliquity       -1.81143
	EqAscendNode    113.876
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.497 0.492 0.487)

	Surface
	{
		SurfStyle       0.277424
		OceanStyle      0.591693
		Randomize      (-0.855, -0.643, 0.984)
		colorDistMagn   0.60153
		colorDistFreq   3.60302e-005
		detailScale     9.02993
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0344853
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.55522
		terraceProb     0.163511
		erosion         0
		montesMagn      0.34239
		montesFreq      2.78661
		montesSpiky     0.893048
		montesFraction  0.389544
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000208127
		hillsFraction   0.612099
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213838
		craterFreq      0.260876
		craterDensity   0.950285
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.529647
		volcanoTemp     1302.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.199, 0.197, 0.195, 0.000)
		colorShelf     (0.211, 0.209, 0.207, 0.000)
		colorBeach     (0.224, 0.222, 0.219, 0.000)
		colorDesert    (0.236, 0.234, 0.231, 0.000)
		colorLowland   (0.249, 0.246, 0.243, 0.000)
		colorUpland    (0.261, 0.259, 0.255, 0.000)
		colorRock      (0.273, 0.271, 0.268, 0.000)
		colorSnow      (0.286, 0.283, 0.280, 1.000)
		BumpHeight      0.297617
		BumpOffset      0.0595235
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.167367
		Period          0.0910973
		Eccentricity    0.0679945
		Inclination     -1.81143
		AscendingNode   113.876
		ArgOfPericenter 82.8788
		MeanAnomaly     7.64867
	}
}

Asteroid	"Crait System S20"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.16797e-010
	Radius          2.94272
	InertiaMoment   0.397482

	RotationPeriod  2038.74
	Obliquity       9.03094
	EqAscendNode    -129.539

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.716 0.714 0.712)

	Surface
	{
		SurfStyle       0.711516
		OceanStyle      0.664743
		Randomize      (-0.667, 0.402, 0.844)
		colorDistMagn   0.87063
		colorDistFreq   0.00168478
		detailScale     80.3559
		colorConversion true
		snowLevel       2
		tropicLatitude  0.133519
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.622093
		terraceProb     0.557987
		erosion         0
		montesMagn      0.499906
		montesFreq      3.10663
		montesSpiky     0.852164
		montesFraction  0.751643
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0184486
		hillsFraction   0.730539
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239095
		craterFreq      0.224676
		craterDensity   0.874813
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.465893
		volcanoTemp     1632.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.279, 0.243, 0.199, 0.000)
		colorShelf     (0.287, 0.250, 0.228, 0.000)
		colorBeach     (0.337, 0.293, 0.271, 0.000)
		colorDesert    (0.365, 0.314, 0.264, 0.000)
		colorLowland   (0.401, 0.336, 0.299, 0.000)
		colorUpland    (0.444, 0.407, 0.363, 0.000)
		colorRock      (0.480, 0.443, 0.392, 0.000)
		colorSnow      (0.523, 0.471, 0.413, 1.000)
		BumpHeight      2.64845
		BumpOffset      0.52969
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.169728
		Period          0.0930316
		Eccentricity    0.0809578
		Inclination     9.03094
		AscendingNode   -129.539
		ArgOfPericenter -62.1294
		MeanAnomaly     78.0715
	}
}

Asteroid	"Crait System S21"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.71873e-007
	Radius          37.5896
	InertiaMoment   0.398849

	RotationPeriod  2573.44
	Obliquity       -5.61027
	EqAscendNode    -103.483

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.506 0.496 0.493)

	Surface
	{
		SurfStyle       0.78829
		OceanStyle      0.348831
		Randomize      (-0.289, 0.991, 0.758)
		colorDistMagn   0.848955
		colorDistFreq   0.574148
		detailScale     1026.45
		colorConversion true
		snowLevel       2
		tropicLatitude  0.120848
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.568213
		terraceProb     0.462641
		erosion         0
		montesMagn      0.296081
		montesFreq      2.34469
		montesSpiky     0.950776
		montesFraction  0.447956
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.59746
		hillsFraction   0.581475
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237885
		craterFreq      0.253107
		craterDensity   0.947798
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.574049
		volcanoTemp     1512.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.197, 0.169, 0.138, 0.000)
		colorShelf     (0.202, 0.174, 0.158, 0.000)
		colorBeach     (0.238, 0.203, 0.187, 0.000)
		colorDesert    (0.258, 0.218, 0.182, 0.000)
		colorLowland   (0.283, 0.233, 0.207, 0.000)
		colorUpland    (0.313, 0.283, 0.251, 0.000)
		colorRock      (0.339, 0.308, 0.271, 0.000)
		colorSnow      (0.369, 0.327, 0.286, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.17555
		Period          0.0978591
		Eccentricity    0.145728
		Inclination     -5.61027
		AscendingNode   -103.483
		ArgOfPericenter 152.612
		MeanAnomaly     -158.27
	}
}

Asteroid	"Crait System S22"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.0069e-015
	Radius          0.0771247
	InertiaMoment   0.399803

	Obliquity       1.73598
	EqAscendNode    -4.6736
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.515 0.511 0.505)

	Surface
	{
		SurfStyle       0.168808
		OceanStyle      0.601969
		Randomize      (-0.710, -0.085, -0.210)
		colorDistMagn   0.558489
		colorDistFreq   4.03474e-006
		detailScale     2.10602
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0605103
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.412674
		terraceProb     0.497792
		erosion         0
		montesMagn      0.418606
		montesFreq      3.67457
		montesSpiky     0.908105
		montesFraction  0.481008
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.49442e-005
		hillsFraction   0.694781
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219135
		craterFreq      0.195529
		craterDensity   0.803737
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.514801
		volcanoTemp     1635.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.206, 0.204, 0.202, 0.000)
		colorShelf     (0.219, 0.217, 0.214, 0.000)
		colorBeach     (0.232, 0.230, 0.227, 0.000)
		colorDesert    (0.245, 0.243, 0.240, 0.000)
		colorLowland   (0.257, 0.256, 0.252, 0.000)
		colorUpland    (0.270, 0.268, 0.265, 0.000)
		colorRock      (0.283, 0.281, 0.278, 0.000)
		colorSnow      (0.296, 0.294, 0.290, 1.000)
		BumpHeight      0.0694122
		BumpOffset      0.0138824
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.174273
		Period          0.0967937
		Eccentricity    0.104928
		Inclination     1.73598
		AscendingNode   -4.6736
		ArgOfPericenter 151.093
		MeanAnomaly     -103.299
	}
}

Asteroid	"Crait System S23"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.4817e-012
	Radius          0.686324
	InertiaMoment   0.397832

	Obliquity       -0.0829681
	EqAscendNode    42.5136
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.547 0.542 0.535)

	Surface
	{
		SurfStyle       0.877314
		OceanStyle      0.435346
		Randomize      (-0.916, 0.759, 0.073)
		colorDistMagn   0.553751
		colorDistFreq   7.33001e-005
		detailScale     18.7412
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00269662
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.463309
		terraceProb     0.311275
		erosion         0
		montesMagn      0.61477
		montesFreq      2.88857
		montesSpiky     0.92876
		montesFraction  0.814972
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000730272
		hillsFraction   0.686265
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237421
		craterFreq      0.185803
		craterDensity   0.826804
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.519306
		volcanoTemp     1475.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.186, 0.190, 0.214, 0.050)
		colorShelf     (0.219, 0.222, 0.246, 0.040)
		colorBeach     (0.252, 0.255, 0.278, 0.030)
		colorDesert    (0.284, 0.287, 0.316, 0.020)
		colorLowland   (0.317, 0.320, 0.348, 0.030)
		colorUpland    (0.350, 0.352, 0.380, 0.050)
		colorRock      (0.383, 0.385, 0.423, 0.020)
		colorSnow      (0.383, 0.385, 0.423, 1.000)
		BumpHeight      0.617692
		BumpOffset      0.123538
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.170793
		Period          0.0939087
		Eccentricity    0.0866893
		Inclination     -0.0829681
		AscendingNode   42.5136
		ArgOfPericenter -108.963
		MeanAnomaly     -0.747357
	}
}

Asteroid	"Crait System S24"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            2.1804e-009
	Radius          8.76824
	InertiaMoment   0.399051

	Obliquity       -0.987165
	EqAscendNode    -134.683
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.622 0.618 0.610)

	Surface
	{
		SurfStyle       0.76038
		OceanStyle      0.244568
		Randomize      (-0.190, 0.668, 0.262)
		colorDistMagn   0.326446
		colorDistFreq   0.00628703
		detailScale     239.431
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0132734
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.55372
		terraceProb     0.265263
		erosion         0
		montesMagn      0.532944
		montesFreq      2.57374
		montesSpiky     0.95703
		montesFraction  0.14467
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.227412
		hillsFraction   0.672757
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238969
		craterFreq      0.223011
		craterDensity   0.797854
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53226
		volcanoTemp     1351.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.242, 0.210, 0.171, 0.000)
		colorShelf     (0.249, 0.216, 0.195, 0.000)
		colorBeach     (0.292, 0.253, 0.232, 0.000)
		colorDesert    (0.317, 0.272, 0.226, 0.000)
		colorLowland   (0.348, 0.290, 0.256, 0.000)
		colorUpland    (0.385, 0.352, 0.311, 0.000)
		colorRock      (0.416, 0.383, 0.336, 0.000)
		colorSnow      (0.454, 0.408, 0.354, 1.000)
		BumpHeight      7.89142
		BumpOffset      1.57828
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.171938
		Period          0.094855
		Eccentricity    0.0927741
		Inclination     -0.987165
		AscendingNode   -134.683
		ArgOfPericenter 58.7849
		MeanAnomaly     -162.121
	}
}

Asteroid	"Crait System S25"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.27736e-017
	Radius          0.0179874
	InertiaMoment   0.39998

	Obliquity       2.67181
	EqAscendNode    27.6781
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.555 0.551 0.542)

	Surface
	{
		SurfStyle       0.757532
		OceanStyle      0.566473
		Randomize      (-0.371, 0.022, -0.268)
		colorDistMagn   0.790733
		colorDistFreq   2.62211e-007
		detailScale     0.491177
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0904311
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.282454
		terraceProb     0.171061
		erosion         0
		montesMagn      0.461706
		montesFreq      2.85197
		montesSpiky     0.818327
		montesFraction  0.594299
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.18772e-007
		hillsFraction   0.704352
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241021
		craterFreq      0.218591
		craterDensity   0.788673
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.542059
		volcanoTemp     1507.14
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.217, 0.187, 0.152, 0.000)
		colorShelf     (0.222, 0.193, 0.173, 0.000)
		colorBeach     (0.261, 0.226, 0.206, 0.000)
		colorDesert    (0.283, 0.242, 0.200, 0.000)
		colorLowland   (0.311, 0.259, 0.228, 0.000)
		colorUpland    (0.344, 0.314, 0.276, 0.000)
		colorRock      (0.372, 0.341, 0.298, 0.000)
		colorSnow      (0.405, 0.363, 0.314, 1.000)
		BumpHeight      0.0161887
		BumpOffset      0.00323774
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.167474
		Period          0.0911843
		Eccentricity    0.0685872
		Inclination     2.67181
		AscendingNode   27.6781
		ArgOfPericenter 89.7631
		MeanAnomaly     179.051
	}
}

Asteroid	"Crait System S26"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.87971e-014
	Radius          0.160069
	InertiaMoment   0.398126

	Obliquity       -5.71742
	EqAscendNode    -36.0181
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.452 0.446 0.441)

	Surface
	{
		SurfStyle       0.669151
		OceanStyle      0.314056
		Randomize      (-0.907, -0.248, 0.871)
		colorDistMagn   0.675028
		colorDistFreq   1.51307e-005
		detailScale     4.37094
		colorConversion true
		snowLevel       2
		tropicLatitude  0.188631
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.345722
		terraceProb     0.458391
		erosion         0
		montesMagn      0.420856
		montesFreq      3.09414
		montesSpiky     0.912185
		montesFraction  0.748387
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.1909e-005
		hillsFraction   0.495887
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.274606
		craterFreq      0.249199
		craterDensity   0.92177
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.471549
		volcanoTemp     1550.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.176, 0.152, 0.124, 0.000)
		colorShelf     (0.181, 0.156, 0.141, 0.000)
		colorBeach     (0.212, 0.183, 0.168, 0.000)
		colorDesert    (0.231, 0.196, 0.163, 0.000)
		colorLowland   (0.253, 0.210, 0.185, 0.000)
		colorUpland    (0.280, 0.254, 0.225, 0.000)
		colorRock      (0.303, 0.277, 0.243, 0.000)
		colorSnow      (0.330, 0.295, 0.256, 1.000)
		BumpHeight      0.144062
		BumpOffset      0.0288124
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.175415
		Period          0.0977461
		Eccentricity    0.110753
		Inclination     -5.71742
		AscendingNode   -36.0181
		ArgOfPericenter -60.5049
		MeanAnomaly     54.147
	}
}

Asteroid	"Crait System S27"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            2.76608e-011
	Radius          2.04504
	InertiaMoment   0.399244

	RotationPeriod  1734.04
	Obliquity       -3.26534
	EqAscendNode    15.3836

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.653 0.649 0.646)

	Surface
	{
		SurfStyle       0.0925505
		OceanStyle      0.823081
		Randomize      (0.009, -0.877, 0.095)
		colorDistMagn   0.957756
		colorDistFreq   0.00135183
		detailScale     55.8431
		colorConversion true
		snowLevel       2
		tropicLatitude  0.112715
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.50763
		terraceProb     0.294483
		erosion         0
		montesMagn      0.331444
		montesFreq      2.77913
		montesSpiky     0.901082
		montesFraction  0.56823
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00813692
		hillsFraction   0.445503
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221237
		craterFreq      0.252462
		craterDensity   0.842609
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.470339
		volcanoTemp     1416.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.261, 0.259, 0.258, 0.000)
		colorShelf     (0.278, 0.276, 0.275, 0.000)
		colorBeach     (0.294, 0.292, 0.291, 0.000)
		colorDesert    (0.310, 0.308, 0.307, 0.000)
		colorLowland   (0.327, 0.324, 0.323, 0.000)
		colorUpland    (0.343, 0.340, 0.339, 0.000)
		colorRock      (0.359, 0.357, 0.355, 0.000)
		colorSnow      (0.376, 0.373, 0.372, 1.000)
		BumpHeight      1.84053
		BumpOffset      0.368106
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.176804
		Period          0.0989094
		Eccentricity    0.137603
		Inclination     -3.26534
		AscendingNode   15.3836
		ArgOfPericenter 21.6738
		MeanAnomaly     30.8959
	}
}

Asteroid	"Crait System S28"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            4.07044e-008
	Radius          26.4666
	InertiaMoment   0.39627

	RotationPeriod  1603.92
	Obliquity       2.71073
	EqAscendNode    -67.0502

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.647 0.643 0.640)

	Surface
	{
		SurfStyle       0.721969
		OceanStyle      0.474181
		Randomize      (0.203, 0.390, -0.252)
		colorDistMagn   0.282167
		colorDistFreq   0.426673
		detailScale     722.714
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0787904
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.730211
		terraceProb     0.314114
		erosion         0
		montesMagn      0.464737
		montesFreq      3.21022
		montesSpiky     0.863197
		montesFraction  0.50948
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.5805
		hillsFraction   0.593429
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241446
		craterFreq      0.247384
		craterDensity   1.07505
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.521199
		volcanoTemp     1794.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.252, 0.219, 0.179, 0.000)
		colorShelf     (0.259, 0.225, 0.205, 0.000)
		colorBeach     (0.304, 0.264, 0.243, 0.000)
		colorDesert    (0.330, 0.283, 0.237, 0.000)
		colorLowland   (0.363, 0.302, 0.269, 0.000)
		colorUpland    (0.401, 0.366, 0.326, 0.000)
		colorRock      (0.434, 0.398, 0.352, 0.000)
		colorSnow      (0.473, 0.424, 0.371, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.167845
		Period          0.0914876
		Eccentricity    0.0706469
		Inclination     2.71073
		AscendingNode   -67.0502
		ArgOfPericenter -141.307
		MeanAnomaly     -48.0205
	}
}

Asteroid	"Crait System S29"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            2.38461e-016
	Radius          0.0373321
	InertiaMoment   0.398383

	RotationPeriod  2479.47
	Obliquity       -1.88232
	EqAscendNode    40.4875

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.837 0.755 0.719)

	Surface
	{
		SurfStyle       0.655146
		OceanStyle      0.0483534
		Randomize      (-0.945, -0.687, 0.174)
		colorDistMagn   0.943672
		colorDistFreq   4.84089e-007
		detailScale     1.01941
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0616064
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.369811
		terraceProb     0.560632
		erosion         0
		montesMagn      0.534345
		montesFreq      3.06676
		montesSpiky     0.861813
		montesFraction  0.643737
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.5555e-006
		hillsFraction   0.747779
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258797
		craterFreq      0.164584
		craterDensity   0.922534
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.541945
		volcanoTemp     1492.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.326, 0.257, 0.201, 0.000)
		colorShelf     (0.335, 0.264, 0.230, 0.000)
		colorBeach     (0.393, 0.310, 0.273, 0.000)
		colorDesert    (0.427, 0.332, 0.266, 0.000)
		colorLowland   (0.469, 0.355, 0.302, 0.000)
		colorUpland    (0.519, 0.431, 0.367, 0.000)
		colorRock      (0.561, 0.468, 0.395, 0.000)
		colorSnow      (0.611, 0.499, 0.417, 1.000)
		BumpHeight      0.0335989
		BumpOffset      0.00671977
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.17125
		Period          0.0942859
		Eccentricity    0.174494
		Inclination     -1.88232
		AscendingNode   40.4875
		ArgOfPericenter 30.9589
		MeanAnomaly     -152.572
	}
}

Asteroid	"Crait System S30"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            3.50908e-013
	Radius          0.476957
	InertiaMoment   0.39943

	Obliquity       2.51854
	EqAscendNode    -23.2933
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.579 0.575 0.570)

	Surface
	{
		SurfStyle       0.605205
		OceanStyle      0.831873
		Randomize      (0.047, 0.588, -0.742)
		colorDistMagn   0.622921
		colorDistFreq   9.49464e-005
		detailScale     13.0241
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0859964
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.704022
		terraceProb     0.482534
		erosion         0
		montesMagn      0.36992
		montesFreq      2.64652
		montesSpiky     0.963558
		montesFraction  0.50567
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00058935
		hillsFraction   0.82215
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217031
		craterFreq      0.23094
		craterDensity   0.92903
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.498497
		volcanoTemp     1384.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.226, 0.195, 0.160, 0.000)
		colorShelf     (0.232, 0.201, 0.182, 0.000)
		colorBeach     (0.272, 0.236, 0.217, 0.000)
		colorDesert    (0.295, 0.253, 0.211, 0.000)
		colorLowland   (0.324, 0.270, 0.239, 0.000)
		colorUpland    (0.359, 0.328, 0.291, 0.000)
		colorRock      (0.388, 0.356, 0.314, 0.000)
		colorSnow      (0.423, 0.379, 0.331, 1.000)
		BumpHeight      0.429261
		BumpOffset      0.0858523
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.167876
		Period          0.0915134
		Eccentricity    0.0708216
		Inclination     2.51854
		AscendingNode   -23.2933
		ArgOfPericenter 166.984
		MeanAnomaly     -122.014
	}
}

Asteroid	"Crait System S31"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            5.1638e-010
	Radius          6.17323
	InertiaMoment   0.396991

	RotationPeriod  4142.43
	Obliquity       -2.11767
	EqAscendNode    118.179

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.614 0.554 0.500)

	Surface
	{
		SurfStyle       0.483795
		OceanStyle      0.928631
		Randomize      (-0.264, -0.326, 0.118)
		colorDistMagn   0.253841
		colorDistFreq   0.00599171
		detailScale     168.57
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0379568
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.617571
		terraceProb     0.160922
		erosion         0
		montesMagn      0.391032
		montesFreq      3.14677
		montesSpiky     0.841144
		montesFraction  0.32381
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.108944
		hillsFraction   0.623427
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.192521
		craterFreq      0.260318
		craterDensity   0.941148
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.577402
		volcanoTemp     1298.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.246, 0.222, 0.200, 0.000)
		colorShelf     (0.261, 0.235, 0.213, 0.000)
		colorBeach     (0.276, 0.249, 0.225, 0.000)
		colorDesert    (0.292, 0.263, 0.238, 0.000)
		colorLowland   (0.307, 0.277, 0.250, 0.000)
		colorUpland    (0.322, 0.291, 0.263, 0.000)
		colorRock      (0.338, 0.305, 0.275, 0.000)
		colorSnow      (0.353, 0.318, 0.288, 1.000)
		BumpHeight      5.55591
		BumpOffset      1.11118
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.171525
		Period          0.0945133
		Eccentricity    0.17261
		Inclination     -2.11767
		AscendingNode   118.179
		ArgOfPericenter 66.6298
		MeanAnomaly     -129.672
	}
}

Asteroid	"Crait System S32"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            7.5988e-007
	Radius          54.9172
	InertiaMoment   0.398617

	Obliquity       2.61241
	EqAscendNode    122.382
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.787 0.784 0.782)

	Surface
	{
		SurfStyle       0.657567
		OceanStyle      0.434312
		Randomize      (0.918, -0.794, -0.414)
		colorDistMagn   0.479748
		colorDistFreq   1.43652
		detailScale     1499.6
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0439184
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.687966
		terraceProb     0.141736
		erosion         0
		montesMagn      0.426625
		montesFreq      2.33289
		montesSpiky     0.944646
		montesFraction  0.314168
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.48277
		hillsFraction   0.598131
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245037
		craterFreq      0.264998
		craterDensity   0.90081
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.503466
		volcanoTemp     1095.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.307, 0.267, 0.219, 0.000)
		colorShelf     (0.315, 0.275, 0.250, 0.000)
		colorBeach     (0.370, 0.322, 0.297, 0.000)
		colorDesert    (0.401, 0.345, 0.289, 0.000)
		colorLowland   (0.440, 0.369, 0.328, 0.000)
		colorUpland    (0.488, 0.447, 0.399, 0.000)
		colorRock      (0.527, 0.486, 0.430, 0.000)
		colorSnow      (0.574, 0.518, 0.454, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.173247
		Period          0.0959401
		Eccentricity    0.160955
		Inclination     2.61241
		AscendingNode   122.382
		ArgOfPericenter 84.5941
		MeanAnomaly     -34.9492
	}
}

Asteroid	"Crait System S33"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            4.45166e-015
	Radius          0.0990338
	InertiaMoment   0.399611

	RotationPeriod  1672.29
	Obliquity       2.16746
	EqAscendNode    -17.4536

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.574 0.571 0.568)

	Surface
	{
		SurfStyle       0.910807
		OceanStyle      0.553458
		Randomize      (-0.536, 0.547, -0.214)
		colorDistMagn   0.842429
		colorDistFreq   3.80368e-006
		detailScale     2.70428
		colorConversion true
		snowLevel       2
		tropicLatitude  0.074713
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.6892
		terraceProb     0.163428
		erosion         0
		montesMagn      0.591867
		montesFreq      3.2306
		montesSpiky     0.899711
		montesFraction  0.506858
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.42564e-005
		hillsFraction   0.672715
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22582
		craterFreq      0.198076
		craterDensity   0.963598
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.442655
		volcanoTemp     1794.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.195, 0.200, 0.227, 0.050)
		colorShelf     (0.230, 0.234, 0.262, 0.040)
		colorBeach     (0.264, 0.268, 0.296, 0.030)
		colorDesert    (0.298, 0.303, 0.335, 0.020)
		colorLowland   (0.333, 0.337, 0.370, 0.030)
		colorUpland    (0.367, 0.371, 0.404, 0.050)
		colorRock      (0.402, 0.406, 0.449, 0.020)
		colorSnow      (0.402, 0.406, 0.449, 1.000)
		BumpHeight      0.0891304
		BumpOffset      0.0178261
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.172581
		Period          0.0953873
		Eccentricity    0.165437
		Inclination     2.16746
		AscendingNode   -17.4536
		ArgOfPericenter 95.0751
		MeanAnomaly     126.335
	}
}

Asteroid	"Crait System S34"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            6.55085e-012
	Radius          1.26526
	InertiaMoment   0.397452

	RotationPeriod  2365.34
	Obliquity       -1.18792
	EqAscendNode    77.2181

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.713 0.711 0.708)

	Surface
	{
		SurfStyle       0.476596
		OceanStyle      0.0234508
		Randomize      (0.984, -0.792, -0.159)
		colorDistMagn   0.90981
		colorDistFreq   0.000806425
		detailScale     34.55
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0323957
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.345082
		terraceProb     0.191751
		erosion         0
		montesMagn      0.440711
		montesFreq      3.05288
		montesSpiky     0.974832
		montesFraction  0.525882
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00404346
		hillsFraction   0.909337
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228174
		craterFreq      0.275496
		craterDensity   0.899447
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.510569
		volcanoTemp     1427.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.285, 0.284, 0.283, 0.000)
		colorShelf     (0.303, 0.302, 0.301, 0.000)
		colorBeach     (0.321, 0.320, 0.319, 0.000)
		colorDesert    (0.338, 0.338, 0.336, 0.000)
		colorLowland   (0.356, 0.355, 0.354, 0.000)
		colorUpland    (0.374, 0.373, 0.372, 0.000)
		colorRock      (0.392, 0.391, 0.390, 0.000)
		colorSnow      (0.410, 0.409, 0.407, 1.000)
		BumpHeight      1.13873
		BumpOffset      0.227747
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.165953
		Period          0.0899456
		Eccentricity    0.0600552
		Inclination     -1.18792
		AscendingNode   77.2182
		ArgOfPericenter 168.302
		MeanAnomaly     113.291
	}
}

Asteroid	"Crait System S35"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            9.63991e-009
	Radius          16.3755
	InertiaMoment   0.398833

	RotationPeriod  3329.1
	Obliquity       2.91783
	EqAscendNode    110.333

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.665 0.623 0.571)

	Surface
	{
		SurfStyle       0.0866883
		OceanStyle      0.0125688
		Randomize      (-0.153, -0.695, -0.976)
		colorDistMagn   0.222568
		colorDistFreq   0.160214
		detailScale     447.161
		colorConversion true
		snowLevel       2
		tropicLatitude  0.058127
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.410521
		terraceProb     0.185172
		erosion         0
		montesMagn      0.539205
		montesFreq      2.62125
		montesSpiky     0.903383
		montesFraction  0.493128
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.689144
		hillsFraction   0.529035
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252029
		craterFreq      0.205706
		craterDensity   0.911642
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.421928
		volcanoTemp     1519.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.266, 0.249, 0.228, 0.000)
		colorShelf     (0.283, 0.265, 0.242, 0.000)
		colorBeach     (0.299, 0.280, 0.257, 0.000)
		colorDesert    (0.316, 0.296, 0.271, 0.000)
		colorLowland   (0.333, 0.312, 0.285, 0.000)
		colorUpland    (0.349, 0.327, 0.300, 0.000)
		colorRock      (0.366, 0.343, 0.314, 0.000)
		colorSnow      (0.383, 0.358, 0.328, 1.000)
		BumpHeight      14.738
		BumpOffset      2.9476
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.172048
		Period          0.0949456
		Eccentricity    0.0933513
		Inclination     2.91783
		AscendingNode   110.333
		ArgOfPericenter -71.9623
		MeanAnomaly     110.35
	}
}

Asteroid	"Crait System S36"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            5.64742e-017
	Radius          0.0230972
	InertiaMoment   0.39979

	RotationPeriod  4058.77
	Obliquity       -0.717376
	EqAscendNode    175.344

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.430 0.426 0.424)

	Surface
	{
		SurfStyle       0.744228
		OceanStyle      0.00564929
		Randomize      (-0.036, -0.891, -0.088)
		colorDistMagn   0.176983
		colorDistFreq   2.10275e-007
		detailScale     0.630708
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0010358
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.421318
		terraceProb     0.23421
		erosion         0
		montesMagn      0.441831
		montesFreq      2.53747
		montesSpiky     0.917168
		montesFraction  0.339009
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.17301e-006
		hillsFraction   0.458289
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252707
		craterFreq      0.21537
		craterDensity   0.943795
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.455073
		volcanoTemp     1637.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.168, 0.145, 0.119, 0.000)
		colorShelf     (0.172, 0.149, 0.136, 0.000)
		colorBeach     (0.202, 0.175, 0.161, 0.000)
		colorDesert    (0.219, 0.187, 0.157, 0.000)
		colorLowland   (0.241, 0.200, 0.178, 0.000)
		colorUpland    (0.267, 0.243, 0.216, 0.000)
		colorRock      (0.288, 0.264, 0.233, 0.000)
		colorSnow      (0.314, 0.281, 0.246, 1.000)
		BumpHeight      0.0207875
		BumpOffset      0.0041575
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.169208
		Period          0.0926048
		Eccentricity    0.0781363
		Inclination     -0.717376
		AscendingNode   175.344
		ArgOfPericenter 119.204
		MeanAnomaly     59.3791
	}
}

Asteroid	"Crait System S37"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            8.31047e-014
	Radius          0.295091
	InertiaMoment   0.397807

	Obliquity       -2.05623
	EqAscendNode    -141.807
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.654 0.650 0.646)

	Surface
	{
		SurfStyle       0.602906
		OceanStyle      0.795563
		Randomize      (0.519, 0.913, 0.408)
		colorDistMagn   0.885238
		colorDistFreq   5.42826e-005
		detailScale     8.05796
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0234765
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.452119
		terraceProb     0.23297
		erosion         0
		montesMagn      0.600578
		montesFreq      2.52081
		montesSpiky     0.81281
		montesFraction  0.486698
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000170976
		hillsFraction   0.607802
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.215353
		craterFreq      0.20558
		craterDensity   0.917296
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.550836
		volcanoTemp     1911.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.255, 0.221, 0.181, 0.000)
		colorShelf     (0.262, 0.228, 0.207, 0.000)
		colorBeach     (0.307, 0.267, 0.246, 0.000)
		colorDesert    (0.334, 0.286, 0.239, 0.000)
		colorLowland   (0.366, 0.306, 0.271, 0.000)
		colorUpland    (0.406, 0.371, 0.330, 0.000)
		colorRock      (0.438, 0.403, 0.355, 0.000)
		colorSnow      (0.478, 0.429, 0.375, 1.000)
		BumpHeight      0.265582
		BumpOffset      0.0531165
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.16428
		Period          0.0885884
		Eccentricity    0.0504795
		Inclination     -2.05623
		AscendingNode   -141.807
		ArgOfPericenter 54.1563
		MeanAnomaly     -130.88
	}
}

Asteroid	"Crait System S38"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.22293e-010
	Radius          3.81939
	InertiaMoment   0.399036

	Obliquity       -2.18179
	EqAscendNode    -159.656
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.589 0.582 0.579)

	Surface
	{
		SurfStyle       0.541082
		OceanStyle      0.329395
		Randomize      (0.906, -0.450, 0.824)
		colorDistMagn   0.889849
		colorDistFreq   0.0084162
		detailScale     104.295
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0134474
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.69503
		terraceProb     0.216852
		erosion         0
		montesMagn      0.520181
		montesFreq      3.22612
		montesSpiky     0.948959
		montesFraction  0.308139
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0444133
		hillsFraction   0.583607
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254382
		craterFreq      0.23362
		craterDensity   0.872574
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.58518
		volcanoTemp     1554.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.230, 0.198, 0.162, 0.000)
		colorShelf     (0.236, 0.204, 0.185, 0.000)
		colorBeach     (0.277, 0.239, 0.220, 0.000)
		colorDesert    (0.301, 0.256, 0.214, 0.000)
		colorLowland   (0.330, 0.273, 0.243, 0.000)
		colorUpland    (0.365, 0.332, 0.295, 0.000)
		colorRock      (0.395, 0.361, 0.318, 0.000)
		colorSnow      (0.430, 0.384, 0.336, 1.000)
		BumpHeight      3.43745
		BumpOffset      0.68749
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.169023
		Period          0.0924524
		Eccentricity    0.0771234
		Inclination     -2.18179
		AscendingNode   -159.656
		ArgOfPericenter 121.622
		MeanAnomaly     -45.1761
	}
}

Asteroid	"Crait System S39"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.7996e-007
	Radius          33.9821
	InertiaMoment   0.399966

	Obliquity       0.125704
	EqAscendNode    59.3044
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.535 0.528 0.522)

	Surface
	{
		SurfStyle       0.0818338
		OceanStyle      0.725838
		Randomize      (0.435, 0.813, 0.231)
		colorDistMagn   0.664213
		colorDistFreq   0.304979
		detailScale     927.938
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00381359
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.480549
		terraceProb     0.169985
		erosion         0
		montesMagn      0.436102
		montesFreq      2.76813
		montesSpiky     0.990119
		montesFraction  0.467506
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.73948
		hillsFraction   0.634695
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.202078
		craterFreq      0.215322
		craterDensity   1.0354
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.481139
		volcanoTemp     1480.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.214, 0.211, 0.209, 0.000)
		colorShelf     (0.227, 0.224, 0.222, 0.000)
		colorBeach     (0.241, 0.238, 0.235, 0.000)
		colorDesert    (0.254, 0.251, 0.248, 0.000)
		colorLowland   (0.268, 0.264, 0.261, 0.000)
		colorUpland    (0.281, 0.277, 0.274, 0.000)
		colorRock      (0.294, 0.290, 0.287, 0.000)
		colorSnow      (0.308, 0.304, 0.300, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.178348
		Period          0.100208
		Eccentricity    0.127754
		Inclination     0.125704
		AscendingNode   59.3044
		ArgOfPericenter -102.596
		MeanAnomaly     -27.5033
	}
}

Asteroid	"Crait System S40"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.05427e-015
	Radius          0.0688229
	InertiaMoment   0.398104

	RotationPeriod  2594.15
	Obliquity       3.13724
	EqAscendNode    -116.557

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.535 0.443 0.395)

	Surface
	{
		SurfStyle       0.291196
		OceanStyle      0.801035
		Randomize      (0.663, 0.314, 0.924)
		colorDistMagn   0.423541
		colorDistFreq   3.01517e-006
		detailScale     1.87932
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0575271
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.761663
		terraceProb     0.196252
		erosion         0
		montesMagn      0.240446
		montesFreq      2.3391
		montesSpiky     0.937994
		montesFraction  0.628126
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.33048e-005
		hillsFraction   0.591302
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.277071
		craterFreq      0.258667
		craterDensity   0.941032
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.419707
		volcanoTemp     1414.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.214, 0.177, 0.158, 0.000)
		colorShelf     (0.227, 0.188, 0.168, 0.000)
		colorBeach     (0.241, 0.199, 0.178, 0.000)
		colorDesert    (0.254, 0.210, 0.188, 0.000)
		colorLowland   (0.267, 0.221, 0.197, 0.000)
		colorUpland    (0.281, 0.232, 0.207, 0.000)
		colorRock      (0.294, 0.244, 0.217, 0.000)
		colorSnow      (0.307, 0.255, 0.227, 1.000)
		BumpHeight      0.0619406
		BumpOffset      0.0123881
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.176491
		Period          0.0986468
		Eccentricity    0.13962
		Inclination     3.13724
		AscendingNode   -116.557
		ArgOfPericenter 167.567
		MeanAnomaly     -138.189
	}
}

Asteroid	"Crait System S41"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.55142e-012
	Radius          0.890786
	InertiaMoment   0.399229

	RotationPeriod  3444.7
	Obliquity       0.854971
	EqAscendNode    -130.083

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.797 0.795 0.794)

	Surface
	{
		SurfStyle       0.220816
		OceanStyle      0.696473
		Randomize      (-0.300, 0.327, -0.892)
		colorDistMagn   0.212027
		colorDistFreq   0.000455577
		detailScale     24.3244
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0125913
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.675971
		terraceProb     0.45992
		erosion         0
		montesMagn      0.684965
		montesFreq      2.67353
		montesSpiky     0.920615
		montesFraction  0.476816
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00133884
		hillsFraction   0.774409
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263065
		craterFreq      0.203325
		craterDensity   0.89238
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.481309
		volcanoTemp     1151.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.319, 0.318, 0.317, 0.000)
		colorShelf     (0.339, 0.338, 0.337, 0.000)
		colorBeach     (0.359, 0.358, 0.357, 0.000)
		colorDesert    (0.379, 0.378, 0.377, 0.000)
		colorLowland   (0.399, 0.397, 0.397, 0.000)
		colorUpland    (0.419, 0.417, 0.417, 0.000)
		colorRock      (0.439, 0.437, 0.437, 0.000)
		colorSnow      (0.458, 0.457, 0.456, 1.000)
		BumpHeight      0.801707
		BumpOffset      0.160341
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.176008
		Period          0.0982427
		Eccentricity    0.142743
		Inclination     0.854971
		AscendingNode   -130.083
		ArgOfPericenter 136.89
		MeanAnomaly     -67.5816
	}
}

Asteroid	"Crait System S42"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            2.283e-009
	Radius          7.92677
	InertiaMoment   0.396189

	RotationPeriod  3994.66
	Obliquity       4.07907
	EqAscendNode    41.3942

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.647 0.644 0.640)

	Surface
	{
		SurfStyle       0.171312
		OceanStyle      0.869392
		Randomize      (-0.665, 0.462, 0.038)
		colorDistMagn   0.940464
		colorDistFreq   0.0189774
		detailScale     216.454
		colorConversion true
		snowLevel       2
		tropicLatitude  0.13279
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.440664
		terraceProb     0.171724
		erosion         0
		montesMagn      0.4835
		montesFreq      2.91574
		montesSpiky     0.968193
		montesFraction  0.299606
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.139971
		hillsFraction   0.762166
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230453
		craterFreq      0.227519
		craterDensity   0.939328
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.424424
		volcanoTemp     1756.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.259, 0.258, 0.256, 0.000)
		colorShelf     (0.275, 0.274, 0.272, 0.000)
		colorBeach     (0.291, 0.290, 0.288, 0.000)
		colorDesert    (0.307, 0.306, 0.304, 0.000)
		colorLowland   (0.324, 0.322, 0.320, 0.000)
		colorUpland    (0.340, 0.338, 0.336, 0.000)
		colorRock      (0.356, 0.354, 0.352, 0.000)
		colorSnow      (0.372, 0.371, 0.368, 1.000)
		BumpHeight      7.13409
		BumpOffset      1.42682
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.167422
		Period          0.0911419
		Eccentricity    0.0682985
		Inclination     4.07907
		AscendingNode   41.3942
		ArgOfPericenter 19.9473
		MeanAnomaly     16.6707
	}
}

Asteroid	"Crait System S43"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.33746e-017
	Radius          0.0160513
	InertiaMoment   0.398364

	RotationPeriod  4851.67
	Obliquity       -1.07668
	EqAscendNode    -9.16259

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.788 0.746 0.686)

	Surface
	{
		SurfStyle       0.309507
		OceanStyle      0.894723
		Randomize      (0.169, -0.882, -0.760)
		colorDistMagn   0.566091
		colorDistFreq   2.22881e-007
		detailScale     0.438306
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0374545
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.394043
		terraceProb     0.449559
		erosion         0
		montesMagn      0.501154
		montesFreq      2.30034
		montesSpiky     0.953352
		montesFraction  0.559091
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.62795e-007
		hillsFraction   0.521066
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245453
		craterFreq      0.255224
		craterDensity   0.91054
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.618745
		volcanoTemp     1335.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.315, 0.298, 0.274, 0.000)
		colorShelf     (0.335, 0.317, 0.291, 0.000)
		colorBeach     (0.355, 0.336, 0.309, 0.000)
		colorDesert    (0.374, 0.354, 0.326, 0.000)
		colorLowland   (0.394, 0.373, 0.343, 0.000)
		colorUpland    (0.414, 0.392, 0.360, 0.000)
		colorRock      (0.433, 0.410, 0.377, 0.000)
		colorSnow      (0.453, 0.429, 0.394, 1.000)
		BumpHeight      0.0144461
		BumpOffset      0.00288923
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.168771
		Period          0.0922462
		Eccentricity    0.0757486
		Inclination     -1.07668
		AscendingNode   -9.16259
		ArgOfPericenter -157.93
		MeanAnomaly     -14.8736
	}
}

Asteroid	"Crait System S44"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.96815e-014
	Radius          0.207754
	InertiaMoment   0.399416

	Obliquity       -1.70837
	EqAscendNode    -114.171
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.694 0.692 0.690)

	Surface
	{
		SurfStyle       0.644023
		OceanStyle      0.13769
		Randomize      (0.907, 0.259, 0.864)
		colorDistMagn   0.493934
		colorDistFreq   2.93035e-005
		detailScale     5.67308
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0323957
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.51657
		terraceProb     0.358264
		erosion         0
		montesMagn      0.463886
		montesFreq      2.81611
		montesSpiky     0.935183
		montesFraction  0.451928
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000100989
		hillsFraction   0.655227
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259623
		craterFreq      0.233041
		craterDensity   0.770621
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.5075
		volcanoTemp     1604.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.271, 0.235, 0.193, 0.000)
		colorShelf     (0.278, 0.242, 0.221, 0.000)
		colorBeach     (0.326, 0.284, 0.262, 0.000)
		colorDesert    (0.354, 0.304, 0.255, 0.000)
		colorLowland   (0.389, 0.325, 0.290, 0.000)
		colorUpland    (0.430, 0.394, 0.352, 0.000)
		colorRock      (0.465, 0.429, 0.380, 0.000)
		colorSnow      (0.507, 0.457, 0.400, 1.000)
		BumpHeight      0.186979
		BumpOffset      0.0373958
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.162029
		Period          0.0867744
		Eccentricity    0.0372919
		Inclination     -1.70837
		AscendingNode   -114.171
		ArgOfPericenter -136.294
		MeanAnomaly     118.399
	}
}

Asteroid	"Crait System S45"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            2.89624e-011
	Radius          1.84878
	InertiaMoment   0.396948

	Obliquity       2.78829
	EqAscendNode    -124.564
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.604 0.549 0.504)

	Surface
	{
		SurfStyle       0.748453
		OceanStyle      0.316011
		Randomize      (-0.606, 0.470, -0.152)
		colorDistMagn   0.880444
		colorDistFreq   0.00181976
		detailScale     50.484
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0452408
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.521769
		terraceProb     0.147148
		erosion         0
		montesMagn      0.353711
		montesFreq      2.6738
		montesSpiky     0.839231
		montesFraction  0.52735
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00846486
		hillsFraction   0.715475
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255407
		craterFreq      0.204695
		craterDensity   0.940879
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.511361
		volcanoTemp     1369.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.236, 0.187, 0.141, 0.000)
		colorShelf     (0.242, 0.192, 0.161, 0.000)
		colorBeach     (0.284, 0.225, 0.191, 0.000)
		colorDesert    (0.308, 0.242, 0.186, 0.000)
		colorLowland   (0.338, 0.258, 0.212, 0.000)
		colorUpland    (0.375, 0.313, 0.257, 0.000)
		colorRock      (0.405, 0.341, 0.277, 0.000)
		colorSnow      (0.441, 0.363, 0.292, 1.000)
		BumpHeight      1.6639
		BumpOffset      0.33278
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.177315
		Period          0.0993385
		Eccentricity    0.134324
		Inclination     2.78829
		AscendingNode   -124.564
		ArgOfPericenter -42.1004
		MeanAnomaly     -167.854
	}
}

Asteroid	"Crait System S46"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            4.26196e-008
	Radius          23.6177
	InertiaMoment   0.398599

	Obliquity       3.41725
	EqAscendNode    -40.5191
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.597 0.594 0.592)

	Surface
	{
		SurfStyle       0.544579
		OceanStyle      0.377817
		Randomize      (0.545, 0.864, 0.452)
		colorDistMagn   0.655388
		colorDistFreq   0.3805
		detailScale     644.919
		colorConversion true
		snowLevel       2
		tropicLatitude  0.111663
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.743477
		terraceProb     0.146644
		erosion         0
		montesMagn      0.381227
		montesFreq      3.32368
		montesSpiky     0.890601
		montesFraction  0.472873
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.25271
		hillsFraction   0.385767
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.215845
		craterFreq      0.227717
		craterDensity   0.947541
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.555117
		volcanoTemp     1557.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.233, 0.202, 0.166, 0.000)
		colorShelf     (0.239, 0.208, 0.189, 0.000)
		colorBeach     (0.280, 0.244, 0.225, 0.000)
		colorDesert    (0.304, 0.261, 0.219, 0.000)
		colorLowland   (0.334, 0.279, 0.249, 0.000)
		colorUpland    (0.370, 0.339, 0.302, 0.000)
		colorRock      (0.400, 0.368, 0.325, 0.000)
		colorSnow      (0.436, 0.392, 0.343, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.176101
		Period          0.0983203
		Eccentricity    0.114218
		Inclination     3.41725
		AscendingNode   -40.5191
		ArgOfPericenter 9.72508
		MeanAnomaly     -34.5061
	}
}

Asteroid	"Crait System S47"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            2.49681e-016
	Radius          0.0484536
	InertiaMoment   0.399597

	RotationPeriod  1116.69
	Obliquity       -4.79958
	EqAscendNode    57.076

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.673 0.668 0.664)

	Surface
	{
		SurfStyle       0.144715
		OceanStyle      0.490397
		Randomize      (0.566, -0.750, -0.842)
		colorDistMagn   0.738007
		colorDistFreq   8.12666e-007
		detailScale     1.32311
		colorConversion true
		snowLevel       2
		tropicLatitude  0.146611
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.736854
		terraceProb     0.395813
		erosion         0
		montesMagn      0.294889
		montesFreq      3.53063
		montesSpiky     0.908818
		montesFraction  0.624902
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.94998e-006
		hillsFraction   0.558997
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258653
		craterFreq      0.183777
		craterDensity   0.738234
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.557563
		volcanoTemp     1402.32
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.269, 0.267, 0.266, 0.000)
		colorShelf     (0.286, 0.284, 0.282, 0.000)
		colorBeach     (0.303, 0.301, 0.299, 0.000)
		colorDesert    (0.320, 0.318, 0.316, 0.000)
		colorLowland   (0.336, 0.334, 0.332, 0.000)
		colorUpland    (0.353, 0.351, 0.349, 0.000)
		colorRock      (0.370, 0.368, 0.365, 0.000)
		colorSnow      (0.387, 0.384, 0.382, 1.000)
		BumpHeight      0.0436082
		BumpOffset      0.00872165
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.17277
		Period          0.095544
		Eccentricity    0.0971406
		Inclination     -4.79958
		AscendingNode   57.076
		ArgOfPericenter -31.566
		MeanAnomaly     -77.1944
	}
}

Asteroid	"Crait System S48"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            3.67419e-013
	Radius          0.431184
	InertiaMoment   0.397421

	RotationPeriod  1371.61
	Obliquity       -1.32921
	EqAscendNode    -113.241

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.405 0.401 0.398)

	Surface
	{
		SurfStyle       0.179495
		OceanStyle      0.690108
		Randomize      (0.734, -0.099, -0.238)
		colorDistMagn   0.674357
		colorDistFreq   0.000104656
		detailScale     11.7742
		colorConversion true
		snowLevel       2
		tropicLatitude  0.025522
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.697445
		terraceProb     0.381512
		erosion         0
		montesMagn      0.431443
		montesFreq      3.31974
		montesSpiky     0.902807
		montesFraction  0.546285
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000516809
		hillsFraction   0.796815
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.271668
		craterFreq      0.220342
		craterDensity   0.944553
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.561261
		volcanoTemp     1976.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.162, 0.161, 0.159, 0.000)
		colorShelf     (0.172, 0.171, 0.169, 0.000)
		colorBeach     (0.182, 0.181, 0.179, 0.000)
		colorDesert    (0.192, 0.191, 0.189, 0.000)
		colorLowland   (0.203, 0.201, 0.199, 0.000)
		colorUpland    (0.213, 0.211, 0.209, 0.000)
		colorRock      (0.223, 0.221, 0.219, 0.000)
		colorSnow      (0.233, 0.231, 0.229, 1.000)
		BumpHeight      0.388066
		BumpOffset      0.0776131
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.170763
		Period          0.0938837
		Eccentricity    0.177847
		Inclination     -1.32921
		AscendingNode   -113.241
		ArgOfPericenter 154.179
		MeanAnomaly     121.118
	}
}

Asteroid	"Crait System S49"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            5.40676e-010
	Radius          5.50874
	InertiaMoment   0.398816

	RotationPeriod  1721.39
	Obliquity       2.33028
	EqAscendNode    147.313

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.716 0.714 0.712)

	Surface
	{
		SurfStyle       0.209746
		OceanStyle      0.286894
		Randomize      (0.583, 0.672, -0.847)
		colorDistMagn   0.142518
		colorDistFreq   0.00742495
		detailScale     150.425
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0228827
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.461031
		terraceProb     0.223548
		erosion         0
		montesMagn      0.334311
		montesFreq      2.38113
		montesSpiky     0.910824
		montesFraction  0.406706
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0783491
		hillsFraction   0.654462
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251675
		craterFreq      0.208348
		craterDensity   0.744742
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.540425
		volcanoTemp     1370.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.286, 0.286, 0.285, 0.000)
		colorShelf     (0.304, 0.303, 0.302, 0.000)
		colorBeach     (0.322, 0.321, 0.320, 0.000)
		colorDesert    (0.340, 0.339, 0.338, 0.000)
		colorLowland   (0.358, 0.357, 0.356, 0.000)
		colorUpland    (0.376, 0.375, 0.374, 0.000)
		colorRock      (0.394, 0.393, 0.391, 0.000)
		colorSnow      (0.412, 0.410, 0.409, 1.000)
		BumpHeight      4.95787
		BumpOffset      0.991573
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.175943
		Period          0.0981878
		Eccentricity    0.113421
		Inclination     2.33028
		AscendingNode   147.313
		ArgOfPericenter -112.763
		MeanAnomaly     -82.0159
	}
}

Asteroid	"Crait System S50"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            7.95636e-007
	Radius          71.2771
	InertiaMoment   0.399776

	Obliquity       2.80954
	EqAscendNode    -60.8459
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.699 0.637 0.563)

	Surface
	{
		SurfStyle       0.993712
		OceanStyle      0.234068
		Randomize      (-0.306, 0.715, 0.177)
		colorDistMagn   0.512219
		colorDistFreq   2.85486
		detailScale     1946.34
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0844585
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.427583
		terraceProb     0.316688
		erosion         0
		montesMagn      0.493868
		montesFreq      2.76978
		montesSpiky     0.965164
		montesFraction  0.0940087
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.84299
		hillsFraction   0.52275
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253664
		craterFreq      0.277183
		craterDensity   0.867341
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.544188
		volcanoTemp     1269.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.238, 0.223, 0.225, 0.050)
		colorShelf     (0.280, 0.261, 0.259, 0.040)
		colorBeach     (0.322, 0.299, 0.293, 0.030)
		colorDesert    (0.364, 0.338, 0.332, 0.020)
		colorLowland   (0.406, 0.376, 0.366, 0.030)
		colorUpland    (0.448, 0.414, 0.400, 0.050)
		colorRock      (0.490, 0.452, 0.445, 0.020)
		colorSnow      (0.490, 0.452, 0.445, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.158219
		Period          0.0837315
		Eccentricity    0.0141074
		Inclination     2.80954
		AscendingNode   -60.8459
		ArgOfPericenter 178.574
		MeanAnomaly     -53.1974
	}
}

Asteroid	"Crait System S51"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            4.66111e-015
	Radius          0.100563
	InertiaMoment   0.397782

	Obliquity       2.52986
	EqAscendNode    -65.5978
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.798 0.795 0.794)

	Surface
	{
		SurfStyle       0.498236
		OceanStyle      0.736156
		Randomize      (-0.118, 0.387, -0.141)
		colorDistMagn   0.184508
		colorDistFreq   4.05955e-006
		detailScale     2.74605
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0741548
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.541746
		terraceProb     0.294686
		erosion         0
		montesMagn      0.592129
		montesFreq      2.77893
		montesSpiky     0.868659
		montesFraction  0.542618
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.70898e-005
		hillsFraction   0.638018
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247924
		craterFreq      0.226586
		craterDensity   0.940255
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.494147
		volcanoTemp     1517.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.319, 0.318, 0.318, 0.000)
		colorShelf     (0.339, 0.338, 0.337, 0.000)
		colorBeach     (0.359, 0.358, 0.357, 0.000)
		colorDesert    (0.379, 0.378, 0.377, 0.000)
		colorLowland   (0.399, 0.398, 0.397, 0.000)
		colorUpland    (0.419, 0.418, 0.417, 0.000)
		colorRock      (0.439, 0.437, 0.437, 0.000)
		colorSnow      (0.459, 0.457, 0.457, 1.000)
		BumpHeight      0.0905069
		BumpOffset      0.0181014
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.176311
		Period          0.0984962
		Eccentricity    0.115273
		Inclination     2.52986
		AscendingNode   -65.5978
		ArgOfPericenter -38.6965
		MeanAnomaly     123.854
	}
}

Asteroid	"Crait System S52"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            6.85908e-012
	Radius          1.2848
	InertiaMoment   0.39902

	Obliquity       1.56865
	EqAscendNode    2.40504
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.592 0.589 0.585)

	Surface
	{
		SurfStyle       0.844521
		OceanStyle      0.714238
		Randomize      (-0.464, -0.045, -0.488)
		colorDistMagn   0.273777
		colorDistFreq   0.000998684
		detailScale     35.0836
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0547171
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.477968
		terraceProb     0.556585
		erosion         0
		montesMagn      0.539609
		montesFreq      2.99684
		montesSpiky     0.968341
		montesFraction  0.535235
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00443851
		hillsFraction   0.605959
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213192
		craterFreq      0.203256
		craterDensity   0.887411
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.493299
		volcanoTemp     1573.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.231, 0.200, 0.164, 0.000)
		colorShelf     (0.237, 0.206, 0.187, 0.000)
		colorBeach     (0.278, 0.241, 0.222, 0.000)
		colorDesert    (0.302, 0.259, 0.216, 0.000)
		colorLowland   (0.331, 0.277, 0.246, 0.000)
		colorUpland    (0.367, 0.336, 0.298, 0.000)
		colorRock      (0.396, 0.365, 0.322, 0.000)
		colorSnow      (0.432, 0.389, 0.339, 1.000)
		BumpHeight      1.15632
		BumpOffset      0.231264
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.165137
		Period          0.0892826
		Eccentricity    0.055408
		Inclination     1.56865
		AscendingNode   2.40504
		ArgOfPericenter -74.5671
		MeanAnomaly     61.0277
	}
}

Asteroid	"Crait System S53"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.00935e-008
	Radius          16.6284
	InertiaMoment   0.399952

	Obliquity       3.45213
	EqAscendNode    -148.014
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.630 0.628 0.625)

	Surface
	{
		SurfStyle       0.066644
		OceanStyle      0.832621
		Randomize      (0.787, 0.171, -0.326)
		colorDistMagn   0.778379
		colorDistFreq   0.233616
		detailScale     454.067
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0331752
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.676249
		terraceProb     0.236201
		erosion         0
		montesMagn      0.481431
		montesFreq      3.68045
		montesSpiky     0.974355
		montesFraction  0.499867
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.654633
		hillsFraction   0.757267
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244167
		craterFreq      0.217978
		craterDensity   0.85271
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.551822
		volcanoTemp     1791.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.252, 0.251, 0.250, 0.000)
		colorShelf     (0.268, 0.267, 0.266, 0.000)
		colorBeach     (0.283, 0.282, 0.281, 0.000)
		colorDesert    (0.299, 0.298, 0.297, 0.000)
		colorLowland   (0.315, 0.314, 0.313, 0.000)
		colorUpland    (0.331, 0.329, 0.328, 0.000)
		colorRock      (0.346, 0.345, 0.344, 0.000)
		colorSnow      (0.362, 0.361, 0.359, 1.000)
		BumpHeight      14.9656
		BumpOffset      2.99312
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.176663
		Period          0.0987913
		Eccentricity    0.117036
		Inclination     3.45213
		AscendingNode   -148.014
		ArgOfPericenter -95.5602
		MeanAnomaly     128.212
	}
}

Asteroid	"Crait System S54"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            5.91314e-017
	Radius          0.0234539
	InertiaMoment   0.398083

	RotationPeriod  1678.9
	Obliquity       -2.57128
	EqAscendNode    -155.263

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.499 0.439 0.334)

	Surface
	{
		SurfStyle       0.597226
		OceanStyle      0.103254
		Randomize      (-0.595, 0.687, 0.732)
		colorDistMagn   0.415537
		colorDistFreq   1.97066e-007
		detailScale     0.640449
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0192166
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.637898
		terraceProb     0.107973
		erosion         0
		montesMagn      0.562932
		montesFreq      2.93063
		montesSpiky     0.886949
		montesFraction  0.760373
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.42015e-006
		hillsFraction   0.68915
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260734
		craterFreq      0.174125
		craterDensity   0.785319
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.589629
		volcanoTemp     1613.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.195, 0.149, 0.093, 0.000)
		colorShelf     (0.200, 0.154, 0.107, 0.000)
		colorBeach     (0.235, 0.180, 0.127, 0.000)
		colorDesert    (0.255, 0.193, 0.123, 0.000)
		colorLowland   (0.280, 0.207, 0.140, 0.000)
		colorUpland    (0.310, 0.250, 0.170, 0.000)
		colorRock      (0.334, 0.272, 0.184, 0.000)
		colorSnow      (0.364, 0.290, 0.194, 1.000)
		BumpHeight      0.0211086
		BumpOffset      0.00422171
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.173035
		Period          0.0957639
		Eccentricity    0.162378
		Inclination     -2.57128
		AscendingNode   -155.263
		ArgOfPericenter 123.981
		MeanAnomaly     -96.3983
	}
}

Asteroid	"Crait System S55"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            8.70151e-014
	Radius          0.299649
	InertiaMoment   0.399215

	RotationPeriod  570.845
	Obliquity       -2.81315
	EqAscendNode    -147.122

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.491 0.487 0.482)

	Surface
	{
		SurfStyle       0.959259
		OceanStyle      0.555479
		Randomize      (0.532, 0.719, 0.931)
		colorDistMagn   0.796735
		colorDistFreq   6.78232e-005
		detailScale     8.18242
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0277758
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.469323
		terraceProb     0.28039
		erosion         0
		montesMagn      0.515816
		montesFreq      3.0083
		montesSpiky     0.960753
		montesFraction  0.325638
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000180007
		hillsFraction   0.675082
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258662
		craterFreq      0.209235
		craterDensity   0.983368
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.533745
		volcanoTemp     1431.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.167, 0.170, 0.193, 0.050)
		colorShelf     (0.196, 0.200, 0.222, 0.040)
		colorBeach     (0.226, 0.229, 0.251, 0.030)
		colorDesert    (0.255, 0.258, 0.285, 0.020)
		colorLowland   (0.285, 0.287, 0.314, 0.030)
		colorUpland    (0.314, 0.316, 0.342, 0.050)
		colorRock      (0.343, 0.346, 0.381, 0.020)
		colorSnow      (0.343, 0.346, 0.381, 1.000)
		BumpHeight      0.269684
		BumpOffset      0.0539369
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.175339
		Period          0.0976827
		Eccentricity    0.147106
		Inclination     -2.81315
		AscendingNode   -147.122
		ArgOfPericenter -131.245
		MeanAnomaly     -7.06809
	}
}

Asteroid	"Crait System S56"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.28047e-010
	Radius          3.87837
	InertiaMoment   0.396102

	RotationPeriod  553.511
	Obliquity       0.844122
	EqAscendNode    -123.696

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.669 0.667 0.665)

	Surface
	{
		SurfStyle       0.942072
		OceanStyle      0.983581
		Randomize      (0.639, 0.241, -0.720)
		colorDistMagn   0.537115
		colorDistFreq   0.00121621
		detailScale     105.905
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0139007
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.389403
		terraceProb     0.224665
		erosion         0
		montesMagn      0.514328
		montesFreq      2.98373
		montesSpiky     0.969117
		montesFraction  0.449885
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0428513
		hillsFraction   0.635209
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263799
		craterFreq      0.210077
		craterDensity   0.814883
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.510976
		volcanoTemp     1709.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.228, 0.233, 0.266, 0.050)
		colorShelf     (0.268, 0.273, 0.306, 0.040)
		colorBeach     (0.308, 0.313, 0.346, 0.030)
		colorDesert    (0.348, 0.353, 0.392, 0.020)
		colorLowland   (0.388, 0.393, 0.432, 0.030)
		colorUpland    (0.428, 0.433, 0.472, 0.050)
		colorRock      (0.468, 0.473, 0.526, 0.020)
		colorSnow      (0.468, 0.473, 0.526, 1.000)
		BumpHeight      3.49054
		BumpOffset      0.698107
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.171771
		Period          0.0947166
		Eccentricity    0.170932
		Inclination     0.844122
		AscendingNode   -123.696
		ArgOfPericenter 171.821
		MeanAnomaly     -67.7477
	}
}

Asteroid	"Crait System S57"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.88428e-007
	Radius          34.5068
	InertiaMoment   0.398345

	Obliquity       -2.9027
	EqAscendNode    -164.91
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.573 0.567 0.561)

	Surface
	{
		SurfStyle       0.110295
		OceanStyle      0.696481
		Randomize      (0.433, 0.781, 0.065)
		colorDistMagn   0.243279
		colorDistFreq   0.511535
		detailScale     942.266
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0133003
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.470014
		terraceProb     0.499611
		erosion         0
		montesMagn      0.544978
		montesFreq      2.96742
		montesSpiky     0.866719
		montesFraction  0.805841
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.48983
		hillsFraction   0.603652
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242729
		craterFreq      0.214305
		craterDensity   1.00433
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.507871
		volcanoTemp     1430.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.229, 0.227, 0.224, 0.000)
		colorShelf     (0.243, 0.241, 0.238, 0.000)
		colorBeach     (0.258, 0.255, 0.252, 0.000)
		colorDesert    (0.272, 0.269, 0.266, 0.000)
		colorLowland   (0.286, 0.284, 0.280, 0.000)
		colorUpland    (0.301, 0.298, 0.295, 0.000)
		colorRock      (0.315, 0.312, 0.309, 0.000)
		colorSnow      (0.329, 0.326, 0.323, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.173019
		Period          0.0957509
		Eccentricity    0.0984416
		Inclination     -2.9027
		AscendingNode   -164.91
		ArgOfPericenter 71.5381
		MeanAnomaly     156.763
	}
}

Asteroid	"Crait System S58"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.10388e-015
	Radius          0.0698858
	InertiaMoment   0.399402

	RotationPeriod  1137.26
	Obliquity       -4.45926
	EqAscendNode    -28.2718

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.565 0.563 0.558)

	Surface
	{
		SurfStyle       0.836855
		OceanStyle      0.952854
		Randomize      (-0.190, -0.027, -0.135)
		colorDistMagn   0.581472
		colorDistFreq   3.57429e-006
		detailScale     1.90835
		colorConversion true
		snowLevel       2
		tropicLatitude  0.150363
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.712333
		terraceProb     0.245762
		erosion         0
		montesMagn      0.384479
		montesFreq      3.66365
		montesSpiky     0.976049
		montesFraction  0.579346
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.25929e-005
		hillsFraction   0.475566
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226298
		craterFreq      0.175092
		craterDensity   0.770838
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.562064
		volcanoTemp     1654.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.220, 0.191, 0.156, 0.000)
		colorShelf     (0.226, 0.197, 0.179, 0.000)
		colorBeach     (0.266, 0.231, 0.212, 0.000)
		colorDesert    (0.288, 0.248, 0.207, 0.000)
		colorLowland   (0.317, 0.265, 0.235, 0.000)
		colorUpland    (0.350, 0.321, 0.285, 0.000)
		colorRock      (0.379, 0.349, 0.307, 0.000)
		colorSnow      (0.413, 0.372, 0.324, 1.000)
		BumpHeight      0.0628972
		BumpOffset      0.0125794
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.174885
		Period          0.0973042
		Eccentricity    0.108062
		Inclination     -4.45926
		AscendingNode   -28.2718
		ArgOfPericenter 164.851
		MeanAnomaly     -23.2003
	}
}

Asteroid	"Crait System S59"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.62442e-012
	Radius          0.904543
	InertiaMoment   0.396903

	Obliquity       -0.0856131
	EqAscendNode    -10.8392
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.594 0.430 0.321)

	Surface
	{
		SurfStyle       0.345246
		OceanStyle      0.814036
		Randomize      (0.437, 0.429, -0.926)
		colorDistMagn   0.770555
		colorDistFreq   0.00023225
		detailScale     24.7
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0029701
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.567188
		terraceProb     0.285663
		erosion         0
		montesMagn      0.525757
		montesFreq      3.20341
		montesSpiky     0.965962
		montesFraction  0.353722
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00270972
		hillsFraction   0.487955
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231428
		craterFreq      0.161384
		craterDensity   0.874252
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.503476
		volcanoTemp     1124.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.237, 0.172, 0.129, 0.000)
		colorShelf     (0.252, 0.183, 0.137, 0.000)
		colorBeach     (0.267, 0.193, 0.145, 0.000)
		colorDesert    (0.282, 0.204, 0.153, 0.000)
		colorLowland   (0.297, 0.215, 0.161, 0.000)
		colorUpland    (0.312, 0.225, 0.169, 0.000)
		colorRock      (0.327, 0.236, 0.177, 0.000)
		colorSnow      (0.341, 0.247, 0.185, 1.000)
		BumpHeight      0.814088
		BumpOffset      0.162818
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.172902
		Period          0.0956533
		Eccentricity    0.0978285
		Inclination     -0.0856131
		AscendingNode   -10.8392
		ArgOfPericenter 71.8784
		MeanAnomaly     -174.463
	}
}

Asteroid	"Crait System S60"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            2.39042e-009
	Radius          8.04919
	InertiaMoment   0.398582

	Obliquity       -0.0586123
	EqAscendNode    12.8119
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.774 0.726 0.641)

	Surface
	{
		SurfStyle       0.117337
		OceanStyle      0.827824
		Randomize      (-0.429, -0.216, -0.198)
		colorDistMagn   0.551849
		colorDistFreq   0.0322165
		detailScale     219.797
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00204263
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.694397
		terraceProb     0.172726
		erosion         0
		montesMagn      0.413938
		montesFreq      3.78263
		montesSpiky     0.955407
		montesFraction  0.27676
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.108913
		hillsFraction   0.382509
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.269285
		craterFreq      0.240209
		craterDensity   0.951214
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.501959
		volcanoTemp     1515.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.310, 0.290, 0.256, 0.000)
		colorShelf     (0.329, 0.308, 0.272, 0.000)
		colorBeach     (0.348, 0.327, 0.288, 0.000)
		colorDesert    (0.368, 0.345, 0.305, 0.000)
		colorLowland   (0.387, 0.363, 0.321, 0.000)
		colorUpland    (0.406, 0.381, 0.337, 0.000)
		colorRock      (0.426, 0.399, 0.353, 0.000)
		colorSnow      (0.445, 0.417, 0.369, 1.000)
		BumpHeight      7.24427
		BumpOffset      1.44885
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.173788
		Period          0.0963896
		Eccentricity    0.102429
		Inclination     -0.0586123
		AscendingNode   12.8119
		ArgOfPericenter 151.155
		MeanAnomaly     21.1602
	}
}

Asteroid	"Crait System S61"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.40039e-017
	Radius          0.0162992
	InertiaMoment   0.399584

	Obliquity       -2.891
	EqAscendNode    -170.061
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.840 0.790 0.734)

	Surface
	{
		SurfStyle       0.736008
		OceanStyle      0.559835
		Randomize      (0.289, 0.498, 0.062)
		colorDistMagn   0.76552
		colorDistFreq   7.88325e-008
		detailScale     0.445076
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00873456
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.336131
		terraceProb     0.265092
		erosion         0
		montesMagn      0.528475
		montesFreq      2.14461
		montesSpiky     0.88732
		montesFraction  0.514309
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.84557e-007
		hillsFraction   0.811463
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226348
		craterFreq      0.209834
		craterDensity   1.03523
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.474902
		volcanoTemp     1621
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.328, 0.269, 0.206, 0.000)
		colorShelf     (0.336, 0.277, 0.235, 0.000)
		colorBeach     (0.395, 0.324, 0.279, 0.000)
		colorDesert    (0.429, 0.348, 0.272, 0.000)
		colorLowland   (0.471, 0.371, 0.308, 0.000)
		colorUpland    (0.521, 0.451, 0.374, 0.000)
		colorRock      (0.563, 0.490, 0.404, 0.000)
		colorSnow      (0.613, 0.522, 0.426, 1.000)
		BumpHeight      0.0146693
		BumpOffset      0.00293385
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.159006
		Period          0.0843567
		Eccentricity    0.0189844
		Inclination     -2.891
		AscendingNode   -170.061
		ArgOfPericenter 9.37982
		MeanAnomaly     -165.617
	}
}

Asteroid	"Crait System S62"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            2.06075e-014
	Radius          0.185392
	InertiaMoment   0.397389

	RotationPeriod  1298.46
	Obliquity       -8.05507
	EqAscendNode    -90.3472

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.674 0.670 0.666)

	Surface
	{
		SurfStyle       0.400587
		OceanStyle      0.460985
		Randomize      (-0.400, 0.099, -0.302)
		colorDistMagn   0.963569
		colorDistFreq   1.64832e-005
		detailScale     5.06244
		colorConversion true
		snowLevel       2
		tropicLatitude  0.196599
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.436708
		terraceProb     0.288497
		erosion         0
		montesMagn      0.494167
		montesFreq      3.25619
		montesSpiky     0.963735
		montesFraction  0.684671
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.08139e-005
		hillsFraction   0.805807
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.210297
		craterFreq      0.218684
		craterDensity   1.0922
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.487483
		volcanoTemp     1369.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.269, 0.268, 0.266, 0.000)
		colorShelf     (0.286, 0.285, 0.283, 0.000)
		colorBeach     (0.303, 0.302, 0.300, 0.000)
		colorDesert    (0.320, 0.318, 0.316, 0.000)
		colorLowland   (0.337, 0.335, 0.333, 0.000)
		colorUpland    (0.354, 0.352, 0.349, 0.000)
		colorRock      (0.370, 0.369, 0.366, 0.000)
		colorSnow      (0.387, 0.386, 0.383, 1.000)
		BumpHeight      0.166853
		BumpOffset      0.0333706
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.176616
		Period          0.0987523
		Eccentricity    0.138809
		Inclination     -8.05507
		AscendingNode   -90.3472
		ArgOfPericenter 27.7845
		MeanAnomaly     -133.251
	}
}

Asteroid	"Crait System S63"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            3.03251e-011
	Radius          2.39955
	InertiaMoment   0.3988

	RotationPeriod  1751.76
	Obliquity       1.37217
	EqAscendNode    84.7756

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.831 0.768 0.713)

	Surface
	{
		SurfStyle       0.174653
		OceanStyle      0.0587583
		Randomize      (-0.789, 0.559, -0.897)
		colorDistMagn   0.254225
		colorDistFreq   0.00378861
		detailScale     65.5236
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0353687
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.520765
		terraceProb     0.517746
		erosion         0
		montesMagn      0.470926
		montesFreq      3.08753
		montesSpiky     0.943928
		montesFraction  0.481676
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00897518
		hillsFraction   0.703418
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25315
		craterFreq      0.249495
		craterDensity   0.947915
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.534424
		volcanoTemp     1532.09
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.332, 0.307, 0.285, 0.000)
		colorShelf     (0.353, 0.326, 0.303, 0.000)
		colorBeach     (0.374, 0.345, 0.321, 0.000)
		colorDesert    (0.395, 0.365, 0.339, 0.000)
		colorLowland   (0.416, 0.384, 0.357, 0.000)
		colorUpland    (0.436, 0.403, 0.374, 0.000)
		colorRock      (0.457, 0.422, 0.392, 0.000)
		colorSnow      (0.478, 0.441, 0.410, 1.000)
		BumpHeight      2.15959
		BumpOffset      0.431918
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.178006
		Period          0.09992
		Eccentricity    0.129919
		Inclination     1.37217
		AscendingNode   84.7756
		ArgOfPericenter -71.2207
		MeanAnomaly     -58.7061
	}
}

Asteroid	"Crait System S64"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            4.46249e-008
	Radius          21.3511
	InertiaMoment   0.399762

	RotationPeriod  2080.97
	Obliquity       -2.07815
	EqAscendNode    147.94

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.698 0.696 0.694)

	Surface
	{
		SurfStyle       0.74718
		OceanStyle      0.914641
		Randomize      (0.775, -0.162, 0.575)
		colorDistMagn   0.0647623
		colorDistFreq   0.281072
		detailScale     583.027
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0200275
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.347196
		terraceProb     0.312645
		erosion         0
		montesMagn      0.427098
		montesFreq      3.99049
		montesSpiky     0.979395
		montesFraction  0.853743
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.05052
		hillsFraction   0.583882
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.271313
		craterFreq      0.272294
		craterDensity   0.78064
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.492989
		volcanoTemp     1278.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.272, 0.237, 0.194, 0.000)
		colorShelf     (0.279, 0.244, 0.222, 0.000)
		colorBeach     (0.328, 0.286, 0.264, 0.000)
		colorDesert    (0.356, 0.306, 0.257, 0.000)
		colorLowland   (0.391, 0.327, 0.292, 0.000)
		colorUpland    (0.433, 0.397, 0.354, 0.000)
		colorRock      (0.468, 0.432, 0.382, 0.000)
		colorSnow      (0.509, 0.460, 0.403, 1.000)
		BumpHeight      19.216
		BumpOffset      3.84319
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.172064
		Period          0.0949588
		Eccentricity    0.0934353
		Inclination     -2.07815
		AscendingNode   147.94
		ArgOfPericenter -55.3301
		MeanAnomaly     -174.89
	}
}

Asteroid	"Crait System S65"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            2.6143e-016
	Radius          0.0432381
	InertiaMoment   0.397757

	Obliquity       0.935058
	EqAscendNode    96.0491
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.756 0.680 0.616)

	Surface
	{
		SurfStyle       0.742627
		OceanStyle      0.777766
		Randomize      (-0.870, -0.917, 0.197)
		colorDistMagn   0.212631
		colorDistFreq   1.37936e-006
		detailScale     1.18069
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0218271
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.429347
		terraceProb     0.335714
		erosion         0
		montesMagn      0.452443
		montesFreq      3.4046
		montesSpiky     0.810226
		montesFraction  0.544695
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.17798e-006
		hillsFraction   0.79577
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248178
		craterFreq      0.256842
		craterDensity   1.0265
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.594278
		volcanoTemp     1428.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.295, 0.231, 0.172, 0.000)
		colorShelf     (0.302, 0.238, 0.197, 0.000)
		colorBeach     (0.355, 0.279, 0.234, 0.000)
		colorDesert    (0.385, 0.299, 0.228, 0.000)
		colorLowland   (0.423, 0.320, 0.259, 0.000)
		colorUpland    (0.469, 0.388, 0.314, 0.000)
		colorRock      (0.506, 0.422, 0.339, 0.000)
		colorSnow      (0.552, 0.449, 0.357, 1.000)
		BumpHeight      0.0389143
		BumpOffset      0.00778286
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.164241
		Period          0.0885572
		Eccentricity    0.0502562
		Inclination     0.935058
		AscendingNode   96.0491
		ArgOfPericenter -108.348
		MeanAnomaly     55.7702
	}
}

Asteroid	"Crait System S66"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            3.84707e-013
	Radius          0.559639
	InertiaMoment   0.399005

	Obliquity       -3.35537
	EqAscendNode    -59.2698
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.551 0.503 0.430)

	Surface
	{
		SurfStyle       0.459342
		OceanStyle      0.0818886
		Randomize      (0.105, -0.809, -0.516)
		colorDistMagn   0.213131
		colorDistFreq   0.000114237
		detailScale     15.2819
		colorConversion true
		snowLevel       2
		tropicLatitude  0.101614
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.500665
		terraceProb     0.228286
		erosion         0
		montesMagn      0.481366
		montesFreq      3.91901
		montesSpiky     0.878378
		montesFraction  0.465599
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000905291
		hillsFraction   0.571058
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.216925
		craterFreq      0.19674
		craterDensity   0.915112
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.469572
		volcanoTemp     1607.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.220, 0.201, 0.172, 0.000)
		colorShelf     (0.234, 0.214, 0.183, 0.000)
		colorBeach     (0.248, 0.226, 0.194, 0.000)
		colorDesert    (0.262, 0.239, 0.204, 0.000)
		colorLowland   (0.276, 0.252, 0.215, 0.000)
		colorUpland    (0.289, 0.264, 0.226, 0.000)
		colorRock      (0.303, 0.277, 0.237, 0.000)
		colorSnow      (0.317, 0.289, 0.247, 1.000)
		BumpHeight      0.503675
		BumpOffset      0.100735
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.166039
		Period          0.0900156
		Eccentricity    0.0605425
		Inclination     -3.35537
		AscendingNode   -59.2698
		ArgOfPericenter -70.0436
		MeanAnomaly     165.295
	}
}

Asteroid	"Crait System S67"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            5.66117e-010
	Radius          4.98008
	InertiaMoment   0.399939

	Obliquity       -0.793281
	EqAscendNode    161.608
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.609 0.605 0.599)

	Surface
	{
		SurfStyle       0.828123
		OceanStyle      0.70711
		Randomize      (0.595, 0.057, 0.203)
		colorDistMagn   0.537067
		colorDistFreq   0.00758452
		detailScale     135.989
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00442156
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.32608
		terraceProb     0.41523
		erosion         0
		montesMagn      0.539472
		montesFreq      3.28387
		montesSpiky     0.903991
		montesFraction  0.735674
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0494019
		hillsFraction   0.682639
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.273353
		craterFreq      0.254282
		craterDensity   0.728058
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.542101
		volcanoTemp     1365.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.237, 0.206, 0.168, 0.000)
		colorShelf     (0.244, 0.212, 0.192, 0.000)
		colorBeach     (0.286, 0.248, 0.228, 0.000)
		colorDesert    (0.311, 0.266, 0.222, 0.000)
		colorLowland   (0.341, 0.284, 0.252, 0.000)
		colorUpland    (0.377, 0.345, 0.305, 0.000)
		colorRock      (0.408, 0.375, 0.329, 0.000)
		colorSnow      (0.444, 0.399, 0.347, 1.000)
		BumpHeight      4.48207
		BumpOffset      0.896414
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.172651
		Period          0.095445
		Eccentricity    0.0965166
		Inclination     -0.793281
		AscendingNode   161.608
		ArgOfPericenter 172.212
		MeanAnomaly     -157.091
	}
}

Asteroid	"Crait System S68"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            3.31651e-018
	Radius          0.0100842
	InertiaMoment   0.398061

	RotationPeriod  1263.85
	Obliquity       2.69534
	EqAscendNode    6.95025

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.432 0.426 0.424)

	Surface
	{
		SurfStyle       0.186054
		OceanStyle      0.665279
		Randomize      (0.070, 0.477, 0.504)
		colorDistMagn   0.932358
		colorDistFreq   6.59655e-008
		detailScale     0.275367
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0937742
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.609091
		terraceProb     0.215821
		erosion         0
		montesMagn      0.421007
		montesFreq      2.38508
		montesSpiky     0.903956
		montesFraction  0.869591
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.65855e-007
		hillsFraction   0.638773
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235634
		craterFreq      0.160421
		craterDensity   0.835976
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.483313
		volcanoTemp     1198.33
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.173, 0.171, 0.169, 0.000)
		colorShelf     (0.184, 0.181, 0.180, 0.000)
		colorBeach     (0.195, 0.192, 0.191, 0.000)
		colorDesert    (0.205, 0.203, 0.201, 0.000)
		colorLowland   (0.216, 0.213, 0.212, 0.000)
		colorUpland    (0.227, 0.224, 0.222, 0.000)
		colorRock      (0.238, 0.235, 0.233, 0.000)
		colorSnow      (0.249, 0.245, 0.244, 1.000)
		BumpHeight      0.00907581
		BumpOffset      0.00181516
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.173464
		Period          0.0961199
		Eccentricity    0.10075
		Inclination     2.69534
		AscendingNode   6.95025
		ArgOfPericenter 168.288
		MeanAnomaly     -104.855
	}
}

Asteroid	"Crait System S69"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            4.88043e-015
	Radius          0.130522
	InertiaMoment   0.3992

	RotationPeriod  1568.98
	Obliquity       -8.45243
	EqAscendNode    -55.4231

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.798 0.731 0.667)

	Surface
	{
		SurfStyle       0.0469517
		OceanStyle      0.510251
		Randomize      (-0.715, -0.865, 0.019)
		colorDistMagn   0.631913
		colorDistFreq   1.12895e-005
		detailScale     3.56412
		colorConversion true
		snowLevel       2
		tropicLatitude  0.258044
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.574375
		terraceProb     0.33849
		erosion         0
		montesMagn      0.402455
		montesFreq      3.27117
		montesSpiky     0.77848
		montesFraction  0.870548
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.78113e-005
		hillsFraction   0.624273
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228329
		craterFreq      0.181661
		craterDensity   0.985286
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.446232
		volcanoTemp     1272.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.319, 0.292, 0.267, 0.000)
		colorShelf     (0.339, 0.311, 0.284, 0.000)
		colorBeach     (0.359, 0.329, 0.300, 0.000)
		colorDesert    (0.379, 0.347, 0.317, 0.000)
		colorLowland   (0.399, 0.365, 0.334, 0.000)
		colorUpland    (0.419, 0.384, 0.350, 0.000)
		colorRock      (0.439, 0.402, 0.367, 0.000)
		colorSnow      (0.459, 0.420, 0.384, 1.000)
		BumpHeight      0.11747
		BumpOffset      0.023494
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.165398
		Period          0.0894944
		Eccentricity    0.0568986
		Inclination     -8.45243
		AscendingNode   -55.4231
		ArgOfPericenter 160.971
		MeanAnomaly     -5.44064
	}
}

Asteroid	"Crait System S70"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            7.18181e-012
	Radius          1.1615
	InertiaMoment   0.396006

	Obliquity       3.43586
	EqAscendNode    -71.2607
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.460 0.453 0.450)

	Surface
	{
		SurfStyle       0.995397
		OceanStyle      0.284278
		Randomize      (0.947, -0.440, 0.765)
		colorDistMagn   0.236907
		colorDistFreq   0.0011287
		detailScale     31.7167
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0973078
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.595264
		terraceProb     0.529343
		erosion         0
		montesMagn      0.449446
		montesFreq      2.74012
		montesSpiky     0.969142
		montesFraction  0.486843
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0028911
		hillsFraction   0.663077
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232897
		craterFreq      0.241961
		craterDensity   0.973394
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.504901
		volcanoTemp     1364.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.156, 0.159, 0.180, 0.050)
		colorShelf     (0.184, 0.186, 0.207, 0.040)
		colorBeach     (0.212, 0.213, 0.234, 0.030)
		colorDesert    (0.239, 0.240, 0.265, 0.020)
		colorLowland   (0.267, 0.267, 0.292, 0.030)
		colorUpland    (0.294, 0.294, 0.319, 0.050)
		colorRock      (0.322, 0.322, 0.355, 0.020)
		colorSnow      (0.322, 0.322, 0.355, 1.000)
		BumpHeight      1.04535
		BumpOffset      0.20907
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.161801
		Period          0.0865913
		Eccentricity    0.035935
		Inclination     3.43586
		AscendingNode   -71.2607
		ArgOfPericenter 70.47
		MeanAnomaly     117.707
	}
}

Asteroid	"Crait System S71"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.05684e-008
	Radius          14.8385
	InertiaMoment   0.398326

	RotationPeriod  2566.63
	Obliquity       0.680008
	EqAscendNode    56.5021

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.562 0.497 0.450)

	Surface
	{
		SurfStyle       0.413779
		OceanStyle      0.889679
		Randomize      (-0.965, -0.225, -0.389)
		colorDistMagn   0.677334
		colorDistFreq   0.127547
		detailScale     405.191
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0209068
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.564169
		terraceProb     0.136445
		erosion         0
		montesMagn      0.385261
		montesFreq      2.58675
		montesSpiky     0.994547
		montesFraction  0.653638
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.560628
		hillsFraction   0.760055
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231218
		craterFreq      0.16696
		craterDensity   0.973239
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.406679
		volcanoTemp     1525.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.225, 0.199, 0.180, 0.000)
		colorShelf     (0.239, 0.211, 0.191, 0.000)
		colorBeach     (0.253, 0.224, 0.202, 0.000)
		colorDesert    (0.267, 0.236, 0.214, 0.000)
		colorLowland   (0.281, 0.248, 0.225, 0.000)
		colorUpland    (0.295, 0.261, 0.236, 0.000)
		colorRock      (0.309, 0.273, 0.247, 0.000)
		colorSnow      (0.323, 0.286, 0.259, 1.000)
		BumpHeight      13.3547
		BumpOffset      2.67093
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.17524
		Period          0.0976003
		Eccentricity    0.147752
		Inclination     0.680008
		AscendingNode   56.5021
		ArgOfPericenter -169.778
		MeanAnomaly     -152.34
	}
}

Asteroid	"Crait System S72"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            6.19137e-017
	Radius          0.0304411
	InertiaMoment   0.399387

	Obliquity       2.63806
	EqAscendNode    -31.9144
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.546 0.539 0.533)

	Surface
	{
		SurfStyle       0.571482
		OceanStyle      0.444563
		Randomize      (0.616, -0.085, -0.994)
		colorDistMagn   0.118464
		colorDistFreq   7.32239e-007
		detailScale     0.831244
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0884196
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.362039
		terraceProb     0.421181
		erosion         0
		montesMagn      0.640185
		montesFreq      2.79684
		montesSpiky     0.951355
		montesFraction  0.601363
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.82864e-006
		hillsFraction   0.395562
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249188
		craterFreq      0.204448
		craterDensity   1.03987
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.43081
		volcanoTemp     1216.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.213, 0.183, 0.149, 0.000)
		colorShelf     (0.219, 0.189, 0.171, 0.000)
		colorBeach     (0.257, 0.221, 0.203, 0.000)
		colorDesert    (0.279, 0.237, 0.197, 0.000)
		colorLowland   (0.306, 0.254, 0.224, 0.000)
		colorUpland    (0.339, 0.307, 0.272, 0.000)
		colorRock      (0.366, 0.334, 0.293, 0.000)
		colorSnow      (0.399, 0.356, 0.309, 1.000)
		BumpHeight      0.027397
		BumpOffset      0.00547939
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.175356
		Period          0.0976969
		Eccentricity    0.110454
		Inclination     2.63806
		AscendingNode   -31.9144
		ArgOfPericenter 112.037
		MeanAnomaly     27.0047
	}
}

Asteroid	"Crait System S73"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            9.11093e-014
	Radius          0.270892
	InertiaMoment   0.396857

	Obliquity       4.01494
	EqAscendNode    97.5439
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.762 0.758 0.755)

	Surface
	{
		SurfStyle       0.953818
		OceanStyle      0.576949
		Randomize      (0.229, 0.712, -0.740)
		colorDistMagn   0.667754
		colorDistFreq   2.21899e-005
		detailScale     7.39716
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0921914
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.261371
		terraceProb     0.54894
		erosion         0
		montesMagn      0.661889
		montesFreq      3.75316
		montesSpiky     0.893599
		montesFraction  0.546299
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000179233
		hillsFraction   0.761869
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263836
		craterFreq      0.19095
		craterDensity   0.843105
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.563724
		volcanoTemp     1345.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.259, 0.265, 0.302, 0.050)
		colorShelf     (0.305, 0.311, 0.347, 0.040)
		colorBeach     (0.351, 0.356, 0.393, 0.030)
		colorDesert    (0.396, 0.402, 0.445, 0.020)
		colorLowland   (0.442, 0.447, 0.491, 0.030)
		colorUpland    (0.488, 0.493, 0.536, 0.050)
		colorRock      (0.533, 0.538, 0.596, 0.020)
		colorSnow      (0.533, 0.538, 0.596, 1.000)
		BumpHeight      0.243803
		BumpOffset      0.0487606
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.169972
		Period          0.0932321
		Eccentricity    0.0822763
		Inclination     4.01494
		AscendingNode   97.5439
		ArgOfPericenter 141.422
		MeanAnomaly     118.039
	}
}

Asteroid	"Crait System S74"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.34072e-010
	Radius          3.46091
	InertiaMoment   0.398564

	Obliquity       -0.898647
	EqAscendNode    102.454
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.731 0.728 0.724)

	Surface
	{
		SurfStyle       0.010703
		OceanStyle      0.728153
		Randomize      (0.274, 0.043, -0.809)
		colorDistMagn   0.985476
		colorDistFreq   0.00369605
		detailScale     94.5058
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0196429
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.367679
		terraceProb     0.377684
		erosion         0
		montesMagn      0.354946
		montesFreq      2.84856
		montesSpiky     0.996001
		montesFraction  0.441224
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0251041
		hillsFraction   0.70944
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233912
		craterFreq      0.181299
		craterDensity   0.801267
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.396598
		volcanoTemp     1716.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.293, 0.291, 0.290, 0.000)
		colorShelf     (0.311, 0.310, 0.308, 0.000)
		colorBeach     (0.329, 0.328, 0.326, 0.000)
		colorDesert    (0.347, 0.346, 0.344, 0.000)
		colorLowland   (0.366, 0.364, 0.362, 0.000)
		colorUpland    (0.384, 0.382, 0.380, 0.000)
		colorRock      (0.402, 0.401, 0.398, 0.000)
		colorSnow      (0.421, 0.419, 0.417, 1.000)
		BumpHeight      3.11482
		BumpOffset      0.622963
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.167703
		Period          0.0913721
		Eccentricity    0.0698635
		Inclination     -0.898647
		AscendingNode   102.454
		ArgOfPericenter 32.0641
		MeanAnomaly     43.8646
	}
}

Asteroid	"Crait System S75"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.97294e-007
	Radius          44.7866
	InertiaMoment   0.39957

	RotationPeriod  1676.5
	Obliquity       0.794236
	EqAscendNode    -93.1651

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.414 0.410 0.406)

	Surface
	{
		SurfStyle       0.602249
		OceanStyle      0.399212
		Randomize      (0.825, 0.707, 0.363)
		colorDistMagn   0.334043
		colorDistFreq   0.555648
		detailScale     1222.97
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0190546
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.443469
		terraceProb     0.211087
		erosion         0
		montesMagn      0.60672
		montesFreq      3.1539
		montesSpiky     0.865886
		montesFraction  0.857791
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.89021
		hillsFraction   0.567027
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236379
		craterFreq      0.219639
		craterDensity   0.834963
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.530009
		volcanoTemp     1379.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.161, 0.140, 0.114, 0.000)
		colorShelf     (0.165, 0.144, 0.130, 0.000)
		colorBeach     (0.194, 0.168, 0.154, 0.000)
		colorDesert    (0.211, 0.181, 0.150, 0.000)
		colorLowland   (0.232, 0.193, 0.170, 0.000)
		colorUpland    (0.256, 0.234, 0.207, 0.000)
		colorRock      (0.277, 0.254, 0.223, 0.000)
		colorSnow      (0.302, 0.271, 0.235, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.17287
		Period          0.0956272
		Eccentricity    0.0976646
		Inclination     0.794236
		AscendingNode   -93.1651
		ArgOfPericenter 129.171
		MeanAnomaly     168.3
	}
}

Asteroid	"Crait System S76"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.15582e-015
	Radius          0.063179
	InertiaMoment   0.397357

	RotationPeriod  2136.79
	Obliquity       1.78469
	EqAscendNode    -38.1971

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.488 0.484 0.478)

	Surface
	{
		SurfStyle       0.142233
		OceanStyle      0.915936
		Randomize      (0.691, 0.212, -0.876)
		colorDistMagn   0.655056
		colorDistFreq   2.71815e-006
		detailScale     1.72521
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0588332
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.458556
		terraceProb     0.39085
		erosion         0
		montesMagn      0.606396
		montesFreq      3.13132
		montesSpiky     0.896422
		montesFraction  0.625105
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.12056e-006
		hillsFraction   0.650738
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239382
		craterFreq      0.174126
		craterDensity   0.883254
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.470244
		volcanoTemp     1739.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.195, 0.194, 0.191, 0.000)
		colorShelf     (0.207, 0.206, 0.203, 0.000)
		colorBeach     (0.219, 0.218, 0.215, 0.000)
		colorDesert    (0.232, 0.230, 0.227, 0.000)
		colorLowland   (0.244, 0.242, 0.239, 0.000)
		colorUpland    (0.256, 0.254, 0.251, 0.000)
		colorRock      (0.268, 0.266, 0.263, 0.000)
		colorSnow      (0.280, 0.278, 0.275, 1.000)
		BumpHeight      0.0568611
		BumpOffset      0.0113722
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.175127
		Period          0.0975057
		Eccentricity    0.148494
		Inclination     1.78469
		AscendingNode   -38.1971
		ArgOfPericenter -5.49224
		MeanAnomaly     -85.1673
	}
}

Asteroid	"Crait System S77"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.70086e-012
	Radius          0.807179
	InertiaMoment   0.398784

	RotationPeriod  2471.7
	Obliquity       1.16372
	EqAscendNode    77.7277

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.680 0.675 0.672)

	Surface
	{
		SurfStyle       0.872464
		OceanStyle      0.613764
		Randomize      (0.872, 0.003, 0.837)
		colorDistMagn   0.957332
		colorDistFreq   0.00034526
		detailScale     22.0414
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0316233
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.543676
		terraceProb     0.402502
		erosion         0
		montesMagn      0.454575
		montesFreq      3.36276
		montesSpiky     0.948898
		montesFraction  0.320299
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00131408
		hillsFraction   0.637552
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257639
		craterFreq      0.200747
		craterDensity   0.937607
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.528625
		volcanoTemp     1827.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.231, 0.236, 0.269, 0.050)
		colorShelf     (0.272, 0.277, 0.309, 0.040)
		colorBeach     (0.313, 0.317, 0.349, 0.030)
		colorDesert    (0.353, 0.358, 0.396, 0.020)
		colorLowland   (0.394, 0.398, 0.437, 0.030)
		colorUpland    (0.435, 0.438, 0.477, 0.050)
		colorRock      (0.476, 0.479, 0.531, 0.020)
		colorSnow      (0.476, 0.479, 0.531, 1.000)
		BumpHeight      0.726461
		BumpOffset      0.145292
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.170892
		Period          0.0939904
		Eccentricity    0.087219
		Inclination     1.16372
		AscendingNode   77.7277
		ArgOfPericenter 131.912
		MeanAnomaly     83.4645
	}
}

Asteroid	"Crait System S78"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            2.5029e-009
	Radius          10.4471
	InertiaMoment   0.399748

	Obliquity       -0.102354
	EqAscendNode    -51.9772
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.523 0.427 0.391)

	Surface
	{
		SurfStyle       0.693204
		OceanStyle      0.395723
		Randomize      (-0.865, 0.992, -0.198)
		colorDistMagn   0.247093
		colorDistFreq   0.0298027
		detailScale     285.276
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00322043
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.508986
		terraceProb     0.233707
		erosion         0
		montesMagn      0.371944
		montesFreq      3.02364
		montesSpiky     0.981629
		montesFraction  0.546337
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.291345
		hillsFraction   0.528482
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225399
		craterFreq      0.260189
		craterDensity   0.994335
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.427352
		volcanoTemp     1347.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.204, 0.145, 0.109, 0.000)
		colorShelf     (0.209, 0.150, 0.125, 0.000)
		colorBeach     (0.246, 0.175, 0.148, 0.000)
		colorDesert    (0.266, 0.188, 0.145, 0.000)
		colorLowland   (0.293, 0.201, 0.164, 0.000)
		colorUpland    (0.324, 0.243, 0.199, 0.000)
		colorRock      (0.350, 0.265, 0.215, 0.000)
		colorSnow      (0.381, 0.282, 0.227, 1.000)
		BumpHeight      9.4024
		BumpOffset      1.88048
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.173237
		Period          0.0959318
		Eccentricity    0.0995757
		Inclination     -0.102354
		AscendingNode   -51.9772
		ArgOfPericenter 45.0461
		MeanAnomaly     178.085
	}
}

Asteroid	"Crait System S79"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.46628e-017
	Radius          0.014735
	InertiaMoment   0.397731

	Obliquity       -0.149834
	EqAscendNode    -151.059
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.697 0.694 0.690)

	Surface
	{
		SurfStyle       0.947039
		OceanStyle      0.44922
		Randomize      (0.702, 0.237, 0.269)
		colorDistMagn   0.564613
		colorDistFreq   2.8225e-008
		detailScale     0.402363
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00129187
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.3002
		terraceProb     0.359873
		erosion         0
		montesMagn      0.521309
		montesFreq      2.37422
		montesSpiky     0.898168
		montesFraction  0.781352
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.13424e-007
		hillsFraction   0.504513
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248139
		craterFreq      0.249346
		craterDensity   0.92027
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.498171
		volcanoTemp     1403.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.237, 0.243, 0.276, 0.050)
		colorShelf     (0.279, 0.284, 0.317, 0.040)
		colorBeach     (0.321, 0.326, 0.359, 0.030)
		colorDesert    (0.363, 0.368, 0.407, 0.020)
		colorLowland   (0.405, 0.409, 0.448, 0.030)
		colorUpland    (0.446, 0.451, 0.490, 0.050)
		colorRock      (0.488, 0.492, 0.545, 0.020)
		colorSnow      (0.488, 0.492, 0.545, 1.000)
		BumpHeight      0.0132615
		BumpOffset      0.00265229
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.165541
		Period          0.0896109
		Eccentricity    0.0577159
		Inclination     -0.149834
		AscendingNode   -151.059
		ArgOfPericenter -151.481
		MeanAnomaly     70.2573
	}
}

Asteroid	"Crait System S80"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            2.15772e-014
	Radius          0.188255
	InertiaMoment   0.398989

	RotationPeriod  1640.26
	Obliquity       -1.21773
	EqAscendNode    64.8931

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.554 0.550 0.547)

	Surface
	{
		SurfStyle       0.272319
		OceanStyle      0.202164
		Randomize      (0.036, -0.478, 0.670)
		colorDistMagn   0.384903
		colorDistFreq   2.99532e-005
		detailScale     5.14062
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0358621
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.626002
		terraceProb     0.102471
		erosion         0
		montesMagn      0.578152
		montesFreq      3.12605
		montesSpiky     0.945424
		montesFraction  0.656072
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.19457e-005
		hillsFraction   0.565269
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238562
		craterFreq      0.25207
		craterDensity   0.978083
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.54897
		volcanoTemp     1503.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.221, 0.220, 0.219, 0.000)
		colorShelf     (0.235, 0.234, 0.233, 0.000)
		colorBeach     (0.249, 0.248, 0.246, 0.000)
		colorDesert    (0.263, 0.261, 0.260, 0.000)
		colorLowland   (0.277, 0.275, 0.274, 0.000)
		colorUpland    (0.291, 0.289, 0.287, 0.000)
		colorRock      (0.304, 0.303, 0.301, 0.000)
		colorSnow      (0.318, 0.316, 0.315, 1.000)
		BumpHeight      0.16943
		BumpOffset      0.0338859
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.17037
		Period          0.0935604
		Eccentricity    0.180558
		Inclination     -1.21773
		AscendingNode   64.8931
		ArgOfPericenter 149.234
		MeanAnomaly     -168.042
	}
}

Asteroid	"Crait System S81"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            3.17519e-011
	Radius          2.4366
	InertiaMoment   0.399925

	Obliquity       1.76785
	EqAscendNode    -83.9092
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.623 0.620 0.618)

	Surface
	{
		SurfStyle       0.619817
		OceanStyle      0.359281
		Randomize      (-0.302, -0.895, -0.911)
		colorDistMagn   0.877106
		colorDistFreq   0.00388136
		detailScale     66.5356
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0458721
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.691259
		terraceProb     0.380343
		erosion         0
		montesMagn      0.540801
		montesFreq      3.38648
		montesSpiky     0.997789
		montesFraction  0.374635
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0179117
		hillsFraction   0.378989
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25525
		craterFreq      0.150432
		craterDensity   0.732728
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.472589
		volcanoTemp     1676.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.243, 0.211, 0.173, 0.000)
		colorShelf     (0.249, 0.217, 0.198, 0.000)
		colorBeach     (0.293, 0.254, 0.235, 0.000)
		colorDesert    (0.318, 0.273, 0.229, 0.000)
		colorLowland   (0.349, 0.292, 0.260, 0.000)
		colorUpland    (0.386, 0.354, 0.315, 0.000)
		colorRock      (0.417, 0.385, 0.340, 0.000)
		colorSnow      (0.455, 0.409, 0.359, 1.000)
		BumpHeight      2.19294
		BumpOffset      0.438589
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.162546
		Period          0.0871897
		Eccentricity    0.0403515
		Inclination     1.76785
		AscendingNode   -83.9092
		ArgOfPericenter 134.725
		MeanAnomaly     127.854
	}
}

Asteroid	"Crait System S82"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            4.67247e-008
	Radius          21.6808
	InertiaMoment   0.398039

	RotationPeriod  4736.82
	Obliquity       0.0226128
	EqAscendNode    154.67

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.624 0.528 0.479)

	Surface
	{
		SurfStyle       0.86929
		OceanStyle      0.94205
		Randomize      (0.005, 0.315, -0.953)
		colorDistMagn   0.976592
		colorDistFreq   0.257772
		detailScale     592.03
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.688368
		terraceProb     0.176953
		erosion         0
		montesMagn      0.455025
		montesFreq      3.28736
		montesSpiky     0.934825
		montesFraction  0.511531
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.12595
		hillsFraction   0.704921
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.284537
		craterFreq      0.260713
		craterDensity   0.868242
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.551128
		volcanoTemp     2008.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.212, 0.185, 0.192, 0.050)
		colorShelf     (0.249, 0.217, 0.221, 0.040)
		colorBeach     (0.287, 0.248, 0.249, 0.030)
		colorDesert    (0.324, 0.280, 0.283, 0.020)
		colorLowland   (0.362, 0.312, 0.312, 0.030)
		colorUpland    (0.399, 0.343, 0.340, 0.050)
		colorRock      (0.437, 0.375, 0.379, 0.020)
		colorSnow      (0.437, 0.375, 0.379, 1.000)
		BumpHeight      19.5127
		BumpOffset      3.90254
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.166097
		Period          0.0900626
		Eccentricity    0.0608694
		Inclination     0.0226128
		AscendingNode   154.67
		ArgOfPericenter 35.3264
		MeanAnomaly     16.9466
	}
}

Asteroid	"Crait System S83"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            2.7373e-016
	Radius          0.0439059
	InertiaMoment   0.399185

	RotationPeriod  1689.22
	Obliquity       1.37658
	EqAscendNode    161.264

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.648 0.488 0.433)

	Surface
	{
		SurfStyle       0.455881
		OceanStyle      0.195283
		Randomize      (-0.678, 0.695, -0.223)
		colorDistMagn   0.419832
		colorDistFreq   1.13763e-006
		detailScale     1.19892
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00782007
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.701159
		terraceProb     0.207654
		erosion         0
		montesMagn      0.478113
		montesFreq      2.73174
		montesSpiky     0.959262
		montesFraction  0.443798
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.89285e-006
		hillsFraction   0.710471
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246126
		craterFreq      0.270828
		craterDensity   0.950911
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.507156
		volcanoTemp     1873.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.259, 0.195, 0.173, 0.000)
		colorShelf     (0.276, 0.207, 0.184, 0.000)
		colorBeach     (0.292, 0.219, 0.195, 0.000)
		colorDesert    (0.308, 0.232, 0.205, 0.000)
		colorLowland   (0.324, 0.244, 0.216, 0.000)
		colorUpland    (0.340, 0.256, 0.227, 0.000)
		colorRock      (0.357, 0.268, 0.238, 0.000)
		colorSnow      (0.373, 0.280, 0.249, 1.000)
		BumpHeight      0.0395153
		BumpOffset      0.00790306
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.173744
		Period          0.0963529
		Eccentricity    0.102201
		Inclination     1.37658
		AscendingNode   161.264
		ArgOfPericenter 166.743
		MeanAnomaly     -178.011
	}
}

Asteroid	"Crait System S84"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            4.02809e-013
	Radius          0.568281
	InertiaMoment   0.395901

	RotationPeriod  1632.06
	Obliquity       -3.20674
	EqAscendNode    -141.143

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.758 0.757 0.756)

	Surface
	{
		SurfStyle       0.673934
		OceanStyle      0.742333
		Randomize      (0.068, -0.464, -0.064)
		colorDistMagn   0.749756
		colorDistFreq   0.000149722
		detailScale     15.5179
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0372072
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.352292
		terraceProb     0.413215
		erosion         0
		montesMagn      0.387982
		montesFreq      2.83146
		montesSpiky     0.980483
		montesFraction  0.536537
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000819145
		hillsFraction   0.625347
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.208923
		craterFreq      0.179808
		craterDensity   0.919729
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52824
		volcanoTemp     1613.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.296, 0.257, 0.212, 0.000)
		colorShelf     (0.303, 0.265, 0.242, 0.000)
		colorBeach     (0.356, 0.310, 0.287, 0.000)
		colorDesert    (0.387, 0.333, 0.280, 0.000)
		colorLowland   (0.425, 0.356, 0.317, 0.000)
		colorUpland    (0.470, 0.431, 0.385, 0.000)
		colorRock      (0.508, 0.469, 0.416, 0.000)
		colorSnow      (0.554, 0.499, 0.438, 1.000)
		BumpHeight      0.511453
		BumpOffset      0.102291
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.169802
		Period          0.0930927
		Eccentricity    0.08136
		Inclination     -3.20674
		AscendingNode   -141.143
		ArgOfPericenter 129.852
		MeanAnomaly     73.1186
	}
}

Asteroid	"Crait System S85"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            5.92755e-010
	Radius          5.05699
	InertiaMoment   0.398307

	RotationPeriod  2639.37
	Obliquity       -4.29732
	EqAscendNode    73.6239

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.794 0.792 0.790)

	Surface
	{
		SurfStyle       0.701315
		OceanStyle      0.149209
		Randomize      (0.417, 0.423, -0.822)
		colorDistMagn   0.405474
		colorDistFreq   0.00807018
		detailScale     138.09
		colorConversion true
		snowLevel       2
		tropicLatitude  0.119766
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.649896
		terraceProb     0.346408
		erosion         0
		montesMagn      0.520863
		montesFreq      3.54169
		montesSpiky     0.985674
		montesFraction  0.440232
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0654471
		hillsFraction   0.606516
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240637
		craterFreq      0.241033
		craterDensity   0.851322
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.480158
		volcanoTemp     1384.95
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.310, 0.269, 0.221, 0.000)
		colorShelf     (0.318, 0.277, 0.253, 0.000)
		colorBeach     (0.373, 0.325, 0.300, 0.000)
		colorDesert    (0.405, 0.348, 0.292, 0.000)
		colorLowland   (0.445, 0.372, 0.332, 0.000)
		colorUpland    (0.492, 0.451, 0.403, 0.000)
		colorRock      (0.532, 0.491, 0.435, 0.000)
		colorSnow      (0.580, 0.523, 0.458, 1.000)
		BumpHeight      4.55129
		BumpOffset      0.910259
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.178535
		Period          0.100366
		Eccentricity    0.126569
		Inclination     -4.29732
		AscendingNode   73.6239
		ArgOfPericenter -16.3569
		MeanAnomaly     -106.871
	}
}

Asteroid	"Crait System S86"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            3.47258e-018
	Radius          0.01024
	InertiaMoment   0.399373

	RotationPeriod  3484.11
	Obliquity       1.75095
	EqAscendNode    48.0928

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.673 0.669 0.665)

	Surface
	{
		SurfStyle       0.32051
		OceanStyle      0.781053
		Randomize      (0.004, -0.513, -0.683)
		colorDistMagn   0.531048
		colorDistFreq   6.63784e-008
		detailScale     0.27962
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0557856
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.337166
		terraceProb     0.651631
		erosion         0
		montesMagn      0.448398
		montesFreq      2.52035
		montesSpiky     0.9007
		montesFraction  0.735075
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.61446e-007
		hillsFraction   0.55864
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257519
		craterFreq      0.205112
		craterDensity   0.827244
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.496192
		volcanoTemp     1645.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.269, 0.268, 0.266, 0.000)
		colorShelf     (0.286, 0.284, 0.283, 0.000)
		colorBeach     (0.303, 0.301, 0.299, 0.000)
		colorDesert    (0.320, 0.318, 0.316, 0.000)
		colorLowland   (0.337, 0.335, 0.332, 0.000)
		colorUpland    (0.353, 0.351, 0.349, 0.000)
		colorRock      (0.370, 0.368, 0.366, 0.000)
		colorSnow      (0.387, 0.385, 0.382, 1.000)
		BumpHeight      0.00921599
		BumpOffset      0.0018432
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.177348
		Period          0.0993666
		Eccentricity    0.120447
		Inclination     1.75095
		AscendingNode   48.0928
		ArgOfPericenter 28.4301
		MeanAnomaly     -165.494
	}
}

Asteroid	"Crait System S87"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            5.11008e-015
	Radius          0.132538
	InertiaMoment   0.39681

	Obliquity       3.36829
	EqAscendNode    -65.8899
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.731 0.728 0.725)

	Surface
	{
		SurfStyle       0.428686
		OceanStyle      0.222164
		Randomize      (-0.497, 0.987, 0.876)
		colorDistMagn   0.745059
		colorDistFreq   9.83598e-006
		detailScale     3.61917
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0984917
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.656314
		terraceProb     0.190903
		erosion         0
		montesMagn      0.588662
		montesFreq      4.07343
		montesSpiky     0.854267
		montesFraction  0.472986
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.98738e-005
		hillsFraction   0.914392
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.188466
		craterFreq      0.239587
		craterDensity   0.998732
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.532959
		volcanoTemp     1287.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.292, 0.291, 0.290, 0.000)
		colorShelf     (0.311, 0.309, 0.308, 0.000)
		colorBeach     (0.329, 0.328, 0.326, 0.000)
		colorDesert    (0.347, 0.346, 0.344, 0.000)
		colorLowland   (0.366, 0.364, 0.363, 0.000)
		colorUpland    (0.384, 0.382, 0.381, 0.000)
		colorRock      (0.402, 0.400, 0.399, 0.000)
		colorSnow      (0.420, 0.419, 0.417, 1.000)
		BumpHeight      0.119284
		BumpOffset      0.0238569
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.178176
		Period          0.100063
		Eccentricity    0.124535
		Inclination     3.36829
		AscendingNode   -65.8899
		ArgOfPericenter 47.7554
		MeanAnomaly     -34.6168
	}
}

Asteroid	"Crait System S88"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            7.51974e-012
	Radius          1.17944
	InertiaMoment   0.398547

	Obliquity       -6.46465
	EqAscendNode    -168.084
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.690 0.687 0.684)

	Surface
	{
		SurfStyle       0.472471
		OceanStyle      0.985755
		Randomize      (-0.259, -0.719, 0.998)
		colorDistMagn   0.116948
		colorDistFreq   0.000807462
		detailScale     32.2066
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0233722
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.577266
		terraceProb     0.159479
		erosion         0
		montesMagn      0.552189
		montesFreq      2.31154
		montesSpiky     0.932362
		montesFraction  0.665972
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00321891
		hillsFraction   0.70779
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254211
		craterFreq      0.263539
		craterDensity   0.809938
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.581565
		volcanoTemp     1396.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.276, 0.275, 0.273, 0.000)
		colorShelf     (0.293, 0.292, 0.291, 0.000)
		colorBeach     (0.310, 0.309, 0.308, 0.000)
		colorDesert    (0.328, 0.326, 0.325, 0.000)
		colorLowland   (0.345, 0.343, 0.342, 0.000)
		colorUpland    (0.362, 0.361, 0.359, 0.000)
		colorRock      (0.379, 0.378, 0.376, 0.000)
		colorSnow      (0.397, 0.395, 0.393, 1.000)
		BumpHeight      1.0615
		BumpOffset      0.212299
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.1747
		Period          0.097149
		Eccentricity    0.107112
		Inclination     -6.46465
		AscendingNode   -168.084
		ArgOfPericenter 90.9304
		MeanAnomaly     142.503
	}
}

Asteroid	"Crait System S89"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.10657e-008
	Radius          15.0677
	InertiaMoment   0.399556

	RotationPeriod  1595.01
	Obliquity       -3.49861
	EqAscendNode    44.4781

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.577 0.572 0.567)

	Surface
	{
		SurfStyle       0.209894
		OceanStyle      0.946962
		Randomize      (-0.719, -0.273, 0.037)
		colorDistMagn   0.986998
		colorDistFreq   0.168716
		detailScale     411.448
		colorConversion true
		snowLevel       2
		tropicLatitude  0.112789
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.377413
		terraceProb     0.305265
		erosion         0
		montesMagn      0.498446
		montesFreq      2.29705
		montesSpiky     0.950466
		montesFraction  0.787025
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.430905
		hillsFraction   0.59848
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255441
		craterFreq      0.189805
		craterDensity   0.905634
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.524723
		volcanoTemp     1096.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.231, 0.229, 0.227, 0.000)
		colorShelf     (0.245, 0.243, 0.241, 0.000)
		colorBeach     (0.260, 0.257, 0.255, 0.000)
		colorDesert    (0.274, 0.272, 0.269, 0.000)
		colorLowland   (0.288, 0.286, 0.284, 0.000)
		colorUpland    (0.303, 0.300, 0.298, 0.000)
		colorRock      (0.317, 0.315, 0.312, 0.000)
		colorSnow      (0.332, 0.329, 0.326, 1.000)
		BumpHeight      13.5609
		BumpOffset      2.71218
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.167222
		Period          0.090979
		Eccentricity    0.0671867
		Inclination     -3.49861
		AscendingNode   44.4781
		ArgOfPericenter -33.9853
		MeanAnomaly     -121.511
	}
}

Asteroid	"Crait System S90"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            6.48268e-017
	Radius          0.0309112
	InertiaMoment   0.397324

	RotationPeriod  2419.57
	Obliquity       2.92516
	EqAscendNode    -44.0757

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.748 0.746 0.745)

	Surface
	{
		SurfStyle       0.792665
		OceanStyle      0.672479
		Randomize      (-0.170, 0.925, 0.276)
		colorDistMagn   0.388729
		colorDistFreq   4.80761e-007
		detailScale     0.844081
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0944998
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.556728
		terraceProb     0.424068
		erosion         0
		montesMagn      0.690142
		montesFreq      2.84245
		montesSpiky     0.941814
		montesFraction  0.626492
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.40598e-006
		hillsFraction   0.730103
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240928
		craterFreq      0.178359
		craterDensity   0.916797
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.579597
		volcanoTemp     1739.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.292, 0.254, 0.209, 0.000)
		colorShelf     (0.299, 0.261, 0.238, 0.000)
		colorBeach     (0.352, 0.306, 0.283, 0.000)
		colorDesert    (0.381, 0.328, 0.276, 0.000)
		colorLowland   (0.419, 0.351, 0.313, 0.000)
		colorUpland    (0.464, 0.425, 0.380, 0.000)
		colorRock      (0.501, 0.463, 0.410, 0.000)
		colorSnow      (0.546, 0.493, 0.432, 1.000)
		BumpHeight      0.0278201
		BumpOffset      0.00556401
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.168481
		Period          0.0920081
		Eccentricity    0.1938
		Inclination     2.92516
		AscendingNode   -44.0757
		ArgOfPericenter 171.359
		MeanAnomaly     -5.73391
	}
}

Asteroid	"Crait System S91"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            9.53961e-014
	Radius          0.351593
	InertiaMoment   0.398767

	RotationPeriod  3438.69
	Obliquity       -1.22968
	EqAscendNode    -2.11967

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.478 0.475 0.471)

	Surface
	{
		SurfStyle       0.827725
		OceanStyle      0.449886
		Randomize      (-0.348, 0.591, -0.306)
		colorDistMagn   0.46613
		colorDistFreq   3.59607e-005
		detailScale     9.60084
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0429033
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.303232
		terraceProb     0.116164
		erosion         0
		montesMagn      0.375701
		montesFreq      3.12326
		montesSpiky     0.993313
		montesFraction  0.711489
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000337353
		hillsFraction   0.672523
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225391
		craterFreq      0.186618
		craterDensity   0.892716
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.548235
		volcanoTemp     1410.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.186, 0.161, 0.132, 0.000)
		colorShelf     (0.191, 0.166, 0.151, 0.000)
		colorBeach     (0.225, 0.195, 0.179, 0.000)
		colorDesert    (0.244, 0.209, 0.174, 0.000)
		colorLowland   (0.268, 0.223, 0.198, 0.000)
		colorUpland    (0.296, 0.271, 0.240, 0.000)
		colorRock      (0.320, 0.294, 0.259, 0.000)
		colorSnow      (0.349, 0.313, 0.273, 1.000)
		BumpHeight      0.316434
		BumpOffset      0.0632868
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.175803
		Period          0.0980712
		Eccentricity    0.112719
		Inclination     -1.22968
		AscendingNode   -2.11967
		ArgOfPericenter 27.2123
		MeanAnomaly     83.0673
	}
}

Asteroid	"Crait System S92"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.4038e-010
	Radius          3.12877
	InertiaMoment   0.399735

	RotationPeriod  4135.5
	Obliquity       -0.354551
	EqAscendNode    -85.9729

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.511 0.505 0.498)

	Surface
	{
		SurfStyle       0.106727
		OceanStyle      0.313418
		Randomize      (-0.686, 0.923, 0.146)
		colorDistMagn   0.660214
		colorDistFreq   0.00391511
		detailScale     85.4363
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00905618
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.668944
		terraceProb     0.266999
		erosion         0
		montesMagn      0.292518
		montesFreq      3.68207
		montesSpiky     0.774118
		montesFraction  0.52983
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0267235
		hillsFraction   0.564051
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264354
		craterFreq      0.214919
		craterDensity   1.02141
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.530567
		volcanoTemp     1504.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.204, 0.202, 0.199, 0.000)
		colorShelf     (0.217, 0.215, 0.212, 0.000)
		colorBeach     (0.230, 0.227, 0.224, 0.000)
		colorDesert    (0.243, 0.240, 0.237, 0.000)
		colorLowland   (0.255, 0.253, 0.249, 0.000)
		colorUpland    (0.268, 0.265, 0.262, 0.000)
		colorRock      (0.281, 0.278, 0.274, 0.000)
		colorSnow      (0.294, 0.290, 0.286, 1.000)
		BumpHeight      2.81589
		BumpOffset      0.563179
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.171334
		Period          0.0943554
		Eccentricity    0.0895741
		Inclination     -0.354551
		AscendingNode   -85.9729
		ArgOfPericenter 51.3356
		MeanAnomaly     -158.006
	}
}

Asteroid	"Crait System S93"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            2.06577e-007
	Radius          39.9656
	InertiaMoment   0.397705

	Obliquity       -0.248771
	EqAscendNode    157.262
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.607 0.604 0.601)

	Surface
	{
		SurfStyle       0.233764
		OceanStyle      0.488496
		Randomize      (0.726, 0.401, -0.219)
		colorDistMagn   0.817066
		colorDistFreq   0.443989
		detailScale     1091.33
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00172633
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.399105
		terraceProb     0.223836
		erosion         0
		montesMagn      0.538608
		montesFreq      3.23518
		montesSpiky     0.897239
		montesFraction  0.690246
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.92524
		hillsFraction   0.749301
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243259
		craterFreq      0.197768
		craterDensity   0.797271
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.43695
		volcanoTemp     1456.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.243, 0.241, 0.240, 0.000)
		colorShelf     (0.258, 0.257, 0.256, 0.000)
		colorBeach     (0.273, 0.272, 0.271, 0.000)
		colorDesert    (0.288, 0.287, 0.286, 0.000)
		colorLowland   (0.303, 0.302, 0.301, 0.000)
		colorUpland    (0.318, 0.317, 0.316, 0.000)
		colorRock      (0.334, 0.332, 0.331, 0.000)
		colorSnow      (0.349, 0.347, 0.346, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.163363
		Period          0.0878482
		Eccentricity    0.0451532
		Inclination     -0.248771
		AscendingNode   157.262
		ArgOfPericenter 43.1434
		MeanAnomaly     1.87662
	}
}

Asteroid	"Crait System S94"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.21021e-015
	Radius          0.0820008
	InertiaMoment   0.398974

	Obliquity       0.48946
	EqAscendNode    39.6487
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.789 0.748 0.703)

	Surface
	{
		SurfStyle       0.775411
		OceanStyle      0.825479
		Randomize      (-0.046, 0.640, -0.223)
		colorDistMagn   0.768203
		colorDistFreq   5.17935e-006
		detailScale     2.23917
		colorConversion true
		snowLevel       2
		tropicLatitude  0.016072
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.52094
		terraceProb     0.119248
		erosion         0
		montesMagn      0.494971
		montesFreq      2.75845
		montesSpiky     0.98091
		montesFraction  0.748411
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.02729e-005
		hillsFraction   0.406452
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263039
		craterFreq      0.190269
		craterDensity   0.975818
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.528154
		volcanoTemp     1781.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.308, 0.254, 0.197, 0.000)
		colorShelf     (0.316, 0.262, 0.225, 0.000)
		colorBeach     (0.371, 0.307, 0.267, 0.000)
		colorDesert    (0.402, 0.329, 0.260, 0.000)
		colorLowland   (0.442, 0.352, 0.295, 0.000)
		colorUpland    (0.489, 0.426, 0.359, 0.000)
		colorRock      (0.529, 0.464, 0.387, 0.000)
		colorSnow      (0.576, 0.494, 0.408, 1.000)
		BumpHeight      0.0738007
		BumpOffset      0.0147601
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.171554
		Period          0.094537
		Eccentricity    0.0907408
		Inclination     0.48946
		AscendingNode   39.6487
		ArgOfPericenter 164.183
		MeanAnomaly     -102.722
	}
}

Asteroid	"Crait System S95"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.78088e-012
	Radius          0.729716
	InertiaMoment   0.399911

	Obliquity       -1.85443
	EqAscendNode    91.6485
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.480 0.475 0.466)

	Surface
	{
		SurfStyle       0.695652
		OceanStyle      0.161859
		Randomize      (-0.717, -0.312, -0.045)
		colorDistMagn   0.723755
		colorDistFreq   0.000239572
		detailScale     19.9261
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0450892
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.548604
		terraceProb     0.428226
		erosion         0
		montesMagn      0.399685
		montesFreq      3.54852
		montesSpiky     0.983193
		montesFraction  0.212894
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00089481
		hillsFraction   0.557711
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227671
		craterFreq      0.19539
		craterDensity   0.827293
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.523484
		volcanoTemp     1837.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.187, 0.161, 0.131, 0.000)
		colorShelf     (0.192, 0.166, 0.149, 0.000)
		colorBeach     (0.226, 0.195, 0.177, 0.000)
		colorDesert    (0.245, 0.209, 0.172, 0.000)
		colorLowland   (0.269, 0.223, 0.196, 0.000)
		colorUpland    (0.298, 0.271, 0.238, 0.000)
		colorRock      (0.322, 0.294, 0.256, 0.000)
		colorSnow      (0.350, 0.313, 0.270, 1.000)
		BumpHeight      0.656745
		BumpOffset      0.131349
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.172014
		Period          0.0949173
		Eccentricity    0.16928
		Inclination     -1.85443
		AscendingNode   91.6485
		ArgOfPericenter -51.9212
		MeanAnomaly     49.5122
	}
}

Asteroid	"Crait System S96"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            2.62066e-009
	Radius          9.32258
	InertiaMoment   0.398017

	RotationPeriod  2474.4
	Obliquity       1.55546
	EqAscendNode    44.2837

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.649 0.647 0.645)

	Surface
	{
		SurfStyle       0.257429
		OceanStyle      0.827596
		Randomize      (0.843, -0.255, -0.523)
		colorDistMagn   0.123979
		colorDistFreq   0.0594075
		detailScale     254.569
		colorConversion true
		snowLevel       2
		tropicLatitude  0.05027
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.291765
		terraceProb     0.143031
		erosion         0
		montesMagn      0.281245
		montesFreq      3.8775
		montesSpiky     0.996499
		montesFraction  0.666383
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.22294
		hillsFraction   0.694443
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.212868
		craterFreq      0.260021
		craterDensity   0.860038
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.511521
		volcanoTemp     1309.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.260, 0.259, 0.258, 0.000)
		colorShelf     (0.276, 0.275, 0.274, 0.000)
		colorBeach     (0.292, 0.291, 0.290, 0.000)
		colorDesert    (0.308, 0.307, 0.306, 0.000)
		colorLowland   (0.325, 0.323, 0.323, 0.000)
		colorUpland    (0.341, 0.339, 0.339, 0.000)
		colorRock      (0.357, 0.356, 0.355, 0.000)
		colorSnow      (0.373, 0.372, 0.371, 1.000)
		BumpHeight      8.39032
		BumpOffset      1.67806
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.171017
		Period          0.0940931
		Eccentricity    0.0878834
		Inclination     1.55546
		AscendingNode   44.2837
		ArgOfPericenter -62.9869
		MeanAnomaly     -176.024
	}
}

Asteroid	"Crait System S97"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.53528e-017
	Radius          0.0191247
	InertiaMoment   0.39917

	RotationPeriod  3451.95
	Obliquity       2.76708
	EqAscendNode    21.3755

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.536 0.439 0.301)

	Surface
	{
		SurfStyle       0.913596
		OceanStyle      0.369527
		Randomize      (0.486, -0.087, 0.996)
		colorDistMagn   0.453838
		colorDistFreq   2.76135e-007
		detailScale     0.522231
		colorConversion true
		snowLevel       2
		tropicLatitude  0.09477
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.636712
		terraceProb     0.277512
		erosion         0
		montesMagn      0.37492
		montesFreq      3.18283
		montesSpiky     0.916329
		montesFraction  0.529806
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.11155e-006
		hillsFraction   0.598473
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239041
		craterFreq      0.220386
		craterDensity   0.792706
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.547324
		volcanoTemp     1392.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.182, 0.154, 0.120, 0.050)
		colorShelf     (0.215, 0.180, 0.138, 0.040)
		colorBeach     (0.247, 0.206, 0.156, 0.030)
		colorDesert    (0.279, 0.233, 0.178, 0.020)
		colorLowland   (0.311, 0.259, 0.196, 0.030)
		colorUpland    (0.343, 0.286, 0.214, 0.050)
		colorRock      (0.375, 0.312, 0.238, 0.020)
		colorSnow      (0.375, 0.312, 0.238, 1.000)
		BumpHeight      0.0172122
		BumpOffset      0.00344244
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.176255
		Period          0.0984493
		Eccentricity    0.141144
		Inclination     2.76708
		AscendingNode   21.3755
		ArgOfPericenter -176.629
		MeanAnomaly     -77.5643
	}
}

Asteroid	"Crait System S98"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            2.25925e-014
	Radius          0.170189
	InertiaMoment   0.395782

	RotationPeriod  4299.94
	Obliquity       -0.24579
	EqAscendNode    177.331

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.770 0.766 0.764)

	Surface
	{
		SurfStyle       0.380493
		OceanStyle      0.784416
		Randomize      (0.092, 0.570, -0.364)
		colorDistMagn   0.004682
		colorDistFreq   1.05803e-005
		detailScale     4.64729
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.497064
		terraceProb     0.437453
		erosion         0
		montesMagn      0.694808
		montesFreq      2.73894
		montesSpiky     0.980866
		montesFraction  0.23075
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.64532e-005
		hillsFraction   0.782325
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.212133
		craterFreq      0.190569
		craterDensity   0.992103
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.445339
		volcanoTemp     1438.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.308, 0.306, 0.305, 0.000)
		colorShelf     (0.327, 0.326, 0.325, 0.000)
		colorBeach     (0.346, 0.345, 0.344, 0.000)
		colorDesert    (0.366, 0.364, 0.363, 0.000)
		colorLowland   (0.385, 0.383, 0.382, 0.000)
		colorUpland    (0.404, 0.402, 0.401, 0.000)
		colorRock      (0.423, 0.421, 0.420, 0.000)
		colorSnow      (0.443, 0.441, 0.439, 1.000)
		BumpHeight      0.15317
		BumpOffset      0.030634
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.175846
		Period          0.0981071
		Eccentricity    0.143796
		Inclination     -0.24579
		AscendingNode   177.331
		ArgOfPericenter 143.226
		MeanAnomaly     -64.2449
	}
}

Asteroid	"Crait System S99"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            3.3246e-011
	Radius          2.17433
	InertiaMoment   0.398287

	RotationPeriod  5261.92
	Obliquity       0.463683
	EqAscendNode    143.971

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.793 0.743 0.708)

	Surface
	{
		SurfStyle       0.387018
		OceanStyle      0.108221
		Randomize      (0.022, -0.272, 0.941)
		colorDistMagn   0.538332
		colorDistFreq   0.000945355
		detailScale     59.3737
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00500338
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.316786
		terraceProb     0.471299
		erosion         0
		montesMagn      0.559969
		montesFreq      2.69706
		montesSpiky     0.931209
		montesFraction  0.845155
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00891817
		hillsFraction   0.463748
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227466
		craterFreq      0.180221
		craterDensity   0.911624
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.491473
		volcanoTemp     1342.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.317, 0.297, 0.283, 0.000)
		colorShelf     (0.337, 0.316, 0.301, 0.000)
		colorBeach     (0.357, 0.334, 0.319, 0.000)
		colorDesert    (0.376, 0.353, 0.336, 0.000)
		colorLowland   (0.396, 0.372, 0.354, 0.000)
		colorUpland    (0.416, 0.390, 0.372, 0.000)
		colorRock      (0.436, 0.409, 0.389, 0.000)
		colorSnow      (0.456, 0.427, 0.407, 1.000)
		BumpHeight      1.9569
		BumpOffset      0.391379
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.178156
		Period          0.100046
		Eccentricity    0.128967
		Inclination     0.463683
		AscendingNode   143.971
		ArgOfPericenter 44.8245
		MeanAnomaly     2.79558
	}
}

Asteroid	"Crait System S100"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            4.89233e-008
	Radius          28.1397
	InertiaMoment   0.399359

	Obliquity       4.06717
	EqAscendNode    -159.926
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.698 0.586 0.489)

	Surface
	{
		SurfStyle       0.257211
		OceanStyle      0.90025
		Randomize      (0.649, 0.941, 0.173)
		colorDistMagn   0.667721
		colorDistFreq   0.332709
		detailScale     768.4
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0247203
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.58186
		terraceProb     0.582159
		erosion         0
		montesMagn      0.409083
		montesFreq      3.13432
		montesSpiky     0.860452
		montesFraction  0.297582
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.52078
		hillsFraction   0.762338
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228864
		craterFreq      0.217523
		craterDensity   1.03919
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.43774
		volcanoTemp     1814.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.279, 0.234, 0.196, 0.000)
		colorShelf     (0.297, 0.249, 0.208, 0.000)
		colorBeach     (0.314, 0.264, 0.220, 0.000)
		colorDesert    (0.332, 0.278, 0.232, 0.000)
		colorLowland   (0.349, 0.293, 0.245, 0.000)
		colorUpland    (0.367, 0.308, 0.257, 0.000)
		colorRock      (0.384, 0.322, 0.269, 0.000)
		colorSnow      (0.402, 0.337, 0.281, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.171743
		Period          0.0946937
		Eccentricity    0.0917438
		Inclination     4.06717
		AscendingNode   -159.926
		ArgOfPericenter 150.057
		MeanAnomaly     -16.909
	}
}

Comet	"Crait System C1"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.90649e-013
	Radius          0.863317
	InertiaMoment   0.399274

	Oblateness      0.0069113

	RotationPeriod  68.205
	Obliquity       120.042
	EqAscendNode    304.809

	AbsMagn         9.31379
	SlopeParam      2.01652
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.776 0.661 0.584)

	Surface
	{
		SurfStyle       0.539758
		OceanStyle      0.153257
		Randomize      (-0.151, 0.035, -0.210)
		colorDistMagn   0.76704
		colorDistFreq   0.00030542
		detailScale     23.5743
		colorConversion true
		snowLevel       2
		tropicLatitude  0.790704
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.708372
		terraceProb     0.139796
		erosion         0
		montesMagn      0.341148
		montesFreq      3.0775
		montesSpiky     0.986543
		montesFraction  0.523527
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00251503
		hillsFraction   0.882427
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250408
		craterFreq      0.204946
		craterDensity   0.959843
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.527555
		volcanoTemp     1418.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.303, 0.225, 0.164, 0.000)
		colorShelf     (0.310, 0.231, 0.187, 0.000)
		colorBeach     (0.365, 0.271, 0.222, 0.000)
		colorDesert    (0.396, 0.291, 0.216, 0.000)
		colorLowland   (0.435, 0.311, 0.245, 0.000)
		colorUpland    (0.481, 0.377, 0.298, 0.000)
		colorRock      (0.520, 0.410, 0.321, 0.000)
		colorSnow      (0.566, 0.436, 0.339, 1.000)
		BumpHeight      0.776985
		BumpOffset      0.155397
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.292179
		GasToDust   0.25
		Particles   1570
		GasBright   0.156039
		DustBright  0.502088
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   12.8329
		Period          61.1626
		Eccentricity    0.948705
		Inclination     7.81429
		AscendingNode   9.10394
		ArgOfPericenter -14.1112
		MeanAnomaly     -108.206
	}
}

Comet	"Crait System C2"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.47453e-009
	Radius          15.5574
	InertiaMoment   0.397928

	Oblateness      0.00553616

	RotationPeriod  66.1203
	Obliquity       73.2476
	EqAscendNode    289.387

	AbsMagn         5.79771
	SlopeParam      2.7909
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.582 0.576 0.572)

	Surface
	{
		SurfStyle       0.896738
		OceanStyle      0.612514
		Randomize      (0.488, -0.498, 0.049)
		colorDistMagn   0.707908
		colorDistFreq   0.198592
		detailScale     424.82
		colorConversion true
		snowLevel       2
		tropicLatitude  0.996835
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.553189
		terraceProb     0.208036
		erosion         0
		montesMagn      0.528005
		montesFreq      3.00272
		montesSpiky     0.838624
		montesFraction  0.763929
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.448206
		hillsFraction   0.747941
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223769
		craterFreq      0.246322
		craterDensity   0.858152
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.483104
		volcanoTemp     1536.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.198, 0.202, 0.229, 0.050)
		colorShelf     (0.233, 0.236, 0.263, 0.040)
		colorBeach     (0.267, 0.271, 0.298, 0.030)
		colorDesert    (0.302, 0.305, 0.338, 0.020)
		colorLowland   (0.337, 0.340, 0.372, 0.030)
		colorUpland    (0.372, 0.375, 0.406, 0.050)
		colorRock      (0.407, 0.409, 0.452, 0.020)
		colorSnow      (0.407, 0.409, 0.452, 1.000)
		BumpHeight      14.0016
		BumpOffset      2.80033
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.773371
		GasToDust   0.25
		Particles   2542
		GasBright   0.101462
		DustBright  0.241152
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   12.2868
		Period          57.3007
		Eccentricity    0.967184
		Inclination     126.755
		AscendingNode   109.174
		ArgOfPericenter -77.729
		MeanAnomaly     42.0798
	}
}

Comet	"Crait System C3"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            4.54017e-017
	Radius          0.0534541
	InertiaMoment   0.399708

	Oblateness      0.00781355

	RotationPeriod  64.0947
	Obliquity       26.4533
	EqAscendNode    273.964

	AbsMagn         14.4164
	SlopeParam      3.41429
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.523 0.478 0.423)

	Surface
	{
		SurfStyle       0.628873
		OceanStyle      0.887486
		Randomize      (0.020, -0.812, 0.120)
		colorDistMagn   0.88882
		colorDistFreq   1.74315e-006
		detailScale     1.45965
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999399
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.397837
		terraceProb     0.478012
		erosion         0
		montesMagn      0.468714
		montesFreq      2.55462
		montesSpiky     0.989252
		montesFraction  0.727052
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.56703e-006
		hillsFraction   0.610667
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.276347
		craterFreq      0.220694
		craterDensity   1.06862
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.498748
		volcanoTemp     1718.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.204, 0.163, 0.119, 0.000)
		colorShelf     (0.209, 0.167, 0.135, 0.000)
		colorBeach     (0.246, 0.196, 0.161, 0.000)
		colorDesert    (0.267, 0.210, 0.157, 0.000)
		colorLowland   (0.293, 0.225, 0.178, 0.000)
		colorUpland    (0.324, 0.273, 0.216, 0.000)
		colorRock      (0.350, 0.296, 0.233, 0.000)
		colorSnow      (0.382, 0.316, 0.246, 1.000)
		BumpHeight      0.0481087
		BumpOffset      0.00962175
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.293775
		DustBright  0.533326
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   15.3573
		Period          80.0705
		Eccentricity    0.981302
		Inclination     -68.5191
		AscendingNode   -135.016
		ArgOfPericenter 136.472
		MeanAnomaly     -40.9737
	}
}

Comet	"Crait System C4"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            3.51151e-013
	Radius          0.963611
	InertiaMoment   0.398546

	Oblateness      0.00627327

	RotationPeriod  62.1188
	Obliquity       339.659
	EqAscendNode    258.542

	AbsMagn         9.09545
	SlopeParam      3.98442
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.430 0.425 0.421)

	Surface
	{
		SurfStyle       0.685154
		OceanStyle      0.620845
		Randomize      (-0.449, 0.388, 0.500)
		colorDistMagn   0.984877
		colorDistFreq   0.000135637
		detailScale     26.313
		colorConversion true
		snowLevel       2
		tropicLatitude  0.985805
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.494751
		terraceProb     0.117265
		erosion         0
		montesMagn      0.478422
		montesFreq      3.39957
		montesSpiky     0.929515
		montesFraction  0.694116
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0021527
		hillsFraction   0.529021
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.271651
		craterFreq      0.270101
		craterDensity   0.872866
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.524398
		volcanoTemp     1342.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.168, 0.145, 0.118, 0.000)
		colorShelf     (0.172, 0.149, 0.135, 0.000)
		colorBeach     (0.202, 0.174, 0.160, 0.000)
		colorDesert    (0.219, 0.187, 0.156, 0.000)
		colorLowland   (0.241, 0.200, 0.177, 0.000)
		colorUpland    (0.267, 0.242, 0.215, 0.000)
		colorRock      (0.288, 0.264, 0.231, 0.000)
		colorSnow      (0.314, 0.281, 0.244, 1.000)
		BumpHeight      0.86725
		BumpOffset      0.17345
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.325005
		GasToDust   0.25
		Particles   1636
		GasBright   0.211915
		DustBright  0.299672
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   11.0445
		Period          48.834
		Eccentricity    0.954344
		Inclination     -79.3829
		AscendingNode   4.40354
		ArgOfPericenter -71.84
		MeanAnomaly     16.218
	}
}

Comet	"Crait System C5"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            2.7159e-009
	Radius          20.8833
	InertiaMoment   0.396093

	Oblateness      0.00871464

	RotationPeriod  60.1846
	Obliquity       292.865
	EqAscendNode    243.119

	AbsMagn         5.55063
	SlopeParam      4.55327
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.528 0.462 0.350)

	Surface
	{
		SurfStyle       0.3302
		OceanStyle      0.826738
		Randomize      (-0.802, 0.845, -0.959)
		colorDistMagn   0.515676
		colorDistFreq   0.138508
		detailScale     570.254
		colorConversion true
		snowLevel       2
		tropicLatitude  0.661003
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.311495
		terraceProb     0.407386
		erosion         0
		montesMagn      0.582115
		montesFreq      3.48899
		montesSpiky     0.920197
		montesFraction  0.63586
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.30416
		hillsFraction   0.718255
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.270021
		craterFreq      0.22162
		craterDensity   0.901994
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.473983
		volcanoTemp     1230.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.211, 0.185, 0.140, 0.000)
		colorShelf     (0.224, 0.197, 0.149, 0.000)
		colorBeach     (0.237, 0.208, 0.157, 0.000)
		colorDesert    (0.251, 0.220, 0.166, 0.000)
		colorLowland   (0.264, 0.231, 0.175, 0.000)
		colorUpland    (0.277, 0.243, 0.184, 0.000)
		colorRock      (0.290, 0.254, 0.192, 0.000)
		colorSnow      (0.303, 0.266, 0.201, 1.000)
		BumpHeight      18.795
		BumpOffset      3.759
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.806197
		GasToDust   0.25
		Particles   2608
		GasBright   0.471418
		DustBright  0.524655
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   11.2113
		Period          49.9443
		Eccentricity    0.961365
		Inclination     26.0372
		AscendingNode   -7.21444
		ArgOfPericenter -7.71077
		MeanAnomaly     30.5806
	}
}

Comet	"Crait System C6"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            8.36244e-017
	Radius          0.059685
	InertiaMoment   0.399049

	Oblateness      0.00712355

	RotationPeriod  58.2849
	Obliquity       246.07
	EqAscendNode    227.696

	AbsMagn         13.7538
	SlopeParam      5.1719
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.532 0.526 0.518)

	Surface
	{
		SurfStyle       0.849931
		OceanStyle      0.138994
		Randomize      (0.050, -0.010, 0.931)
		colorDistMagn   0.365986
		colorDistFreq   2.28857e-006
		detailScale     1.6298
		colorConversion true
		snowLevel       2
		tropicLatitude  0.86056
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.644804
		terraceProb     0.499095
		erosion         0
		montesMagn      0.630233
		montesFreq      2.65756
		montesSpiky     0.799162
		montesFraction  0.457206
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.78106e-006
		hillsFraction   0.577442
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243423
		craterFreq      0.209458
		craterDensity   0.752162
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48097
		volcanoTemp     1397.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.207, 0.179, 0.145, 0.000)
		colorShelf     (0.213, 0.184, 0.166, 0.000)
		colorBeach     (0.250, 0.216, 0.197, 0.000)
		colorDesert    (0.271, 0.232, 0.192, 0.000)
		colorLowland   (0.298, 0.247, 0.218, 0.000)
		colorUpland    (0.330, 0.300, 0.264, 0.000)
		colorRock      (0.356, 0.326, 0.285, 0.000)
		colorSnow      (0.388, 0.347, 0.301, 1.000)
		BumpHeight      0.0537165
		BumpOffset      0.0107433
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.021997
		DustBright  0.658563
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   15.6782
		Period          82.5933
		Eccentricity    0.984181
		Inclination     102.965
		AscendingNode   -61.9876
		ArgOfPericenter 83.518
		MeanAnomaly     -16.4551
	}
}

Comet	"Crait System C7"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            6.46775e-013
	Radius          1.29307
	InertiaMoment   0.397535

	Oblateness      0.00994106

	RotationPeriod  56.4135
	Obliquity       199.276
	EqAscendNode    212.274

	AbsMagn         8.88033
	SlopeParam      5.93316
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.662 0.521 0.419)

	Surface
	{
		SurfStyle       0.676106
		OceanStyle      0.0596418
		Randomize      (0.171, -0.172, -0.899)
		colorDistMagn   0.855293
		colorDistFreq   0.00118087
		detailScale     35.3095
		colorConversion true
		snowLevel       2
		tropicLatitude  0.985597
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.319432
		terraceProb     0.291397
		erosion         0
		montesMagn      0.516563
		montesFreq      3.2913
		montesSpiky     0.901801
		montesFraction  0.622791
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00446981
		hillsFraction   0.847184
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.205681
		craterFreq      0.161398
		craterDensity   0.806271
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.456126
		volcanoTemp     1596.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.258, 0.177, 0.117, 0.000)
		colorShelf     (0.265, 0.182, 0.134, 0.000)
		colorBeach     (0.311, 0.214, 0.159, 0.000)
		colorDesert    (0.338, 0.229, 0.155, 0.000)
		colorLowland   (0.371, 0.245, 0.176, 0.000)
		colorUpland    (0.410, 0.297, 0.214, 0.000)
		colorRock      (0.444, 0.323, 0.231, 0.000)
		colorSnow      (0.483, 0.344, 0.243, 1.000)
		BumpHeight      1.16377
		BumpOffset      0.232753
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.357831
		GasToDust   0.25
		Particles   1702
		GasBright   0.0333533
		DustBright  0.331694
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   10.9342
		Period          48.1042
		Eccentricity    0.967254
		Inclination     113.863
		AscendingNode   134.807
		ArgOfPericenter 10.9762
		MeanAnomaly     -63.2182
	}
}

Comet	"Crait System C8"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            5.00234e-009
	Radius          23.3253
	InertiaMoment   0.399497

	Oblateness      0.00812387

	RotationPeriod  54.5646
	Obliquity       152.482
	EqAscendNode    196.851

	AbsMagn         5.29382
	SlopeParam      7.19998
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.582 0.577 0.574)

	Surface
	{
		SurfStyle       0.0990284
		OceanStyle      0.534202
		Randomize      (-0.843, -0.941, 0.062)
		colorDistMagn   0.195645
		colorDistFreq   0.31411
		detailScale     636.936
		colorConversion true
		snowLevel       2
		tropicLatitude  0.824133
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.351565
		terraceProb     0.319585
		erosion         0
		montesMagn      0.573319
		montesFreq      1.89113
		montesSpiky     0.993392
		montesFraction  0.744791
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.942325
		hillsFraction   0.932534
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247062
		craterFreq      0.221586
		craterDensity   0.96794
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48056
		volcanoTemp     1412.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.233, 0.231, 0.230, 0.000)
		colorShelf     (0.247, 0.245, 0.244, 0.000)
		colorBeach     (0.262, 0.260, 0.258, 0.000)
		colorDesert    (0.276, 0.274, 0.273, 0.000)
		colorLowland   (0.291, 0.289, 0.287, 0.000)
		colorUpland    (0.305, 0.303, 0.301, 0.000)
		colorRock      (0.320, 0.318, 0.316, 0.000)
		colorSnow      (0.334, 0.332, 0.330, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.839023
		GasToDust   0.25
		Particles   2674
		GasBright   0.12778
		DustBright  0.721753
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   11.1222
		Period          49.35
		Eccentricity    0.964125
		Inclination     101.735
		AscendingNode   -148.575
		ArgOfPericenter -35.9902
		MeanAnomaly     70.6321
	}
}

Comet	"Crait System C9"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.54026e-016
	Radius          0.0800669
	InertiaMoment   0.398262

	Oblateness      0.0113728

	RotationPeriod  52.7329
	Obliquity       105.687
	EqAscendNode    181.429

	AbsMagn         13.2196
	SlopeParam      2.42798
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.670 0.668 0.666)

	Surface
	{
		SurfStyle       0.77964
		OceanStyle      0.183984
		Randomize      (-0.496, -0.949, 0.717)
		colorDistMagn   0.362962
		colorDistFreq   9.71788e-007
		detailScale     2.18636
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999381
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.521292
		terraceProb     0.224512
		erosion         0
		montesMagn      0.429126
		montesFreq      2.85525
		montesSpiky     0.830737
		montesFraction  0.581597
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.15147e-005
		hillsFraction   0.601066
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229239
		craterFreq      0.164075
		craterDensity   0.722107
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.4961
		volcanoTemp     1207.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.261, 0.227, 0.187, 0.000)
		colorShelf     (0.268, 0.234, 0.213, 0.000)
		colorBeach     (0.315, 0.274, 0.253, 0.000)
		colorDesert    (0.342, 0.294, 0.247, 0.000)
		colorLowland   (0.375, 0.314, 0.280, 0.000)
		colorUpland    (0.415, 0.381, 0.340, 0.000)
		colorRock      (0.449, 0.414, 0.366, 0.000)
		colorSnow      (0.489, 0.441, 0.386, 1.000)
		BumpHeight      0.0720602
		BumpOffset      0.0144121
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.111855
		DustBright  0.422165
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   13.0586
		Period          62.7835
		Eccentricity    0.968636
		Inclination     138.471
		AscendingNode   -68.1465
		ArgOfPericenter -140.473
		MeanAnomaly     63.3576
	}
}

Comet	"Crait System C10"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.19128e-012
	Radius          1.44473
	InertiaMoment   0.399921

	Oblateness      0.00932512

	RotationPeriod  50.9133
	Obliquity       58.8932
	EqAscendNode    166.006

	AbsMagn         8.66773
	SlopeParam      3.10916
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.690 0.688 0.686)

	Surface
	{
		SurfStyle       0.645697
		OceanStyle      0.285303
		Randomize      (0.861, -0.833, 0.965)
		colorDistMagn   0.977562
		colorDistFreq   0.00135719
		detailScale     39.4509
		colorConversion true
		snowLevel       2
		tropicLatitude  0.963393
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.417368
		terraceProb     0.174825
		erosion         0
		montesMagn      0.431383
		montesFreq      3.079
		montesSpiky     0.916287
		montesFraction  0.556779
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00553498
		hillsFraction   0.777982
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22557
		craterFreq      0.27076
		craterDensity   0.797251
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.581454
		volcanoTemp     1673.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.269, 0.234, 0.192, 0.000)
		colorShelf     (0.276, 0.241, 0.220, 0.000)
		colorBeach     (0.324, 0.282, 0.261, 0.000)
		colorDesert    (0.352, 0.303, 0.254, 0.000)
		colorLowland   (0.386, 0.323, 0.288, 0.000)
		colorUpland    (0.428, 0.392, 0.350, 0.000)
		colorRock      (0.462, 0.426, 0.378, 0.000)
		colorSnow      (0.503, 0.454, 0.398, 1.000)
		BumpHeight      1.30026
		BumpOffset      0.260052
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.390657
		GasToDust   0.25
		Particles   1769
		GasBright   0.0586697
		DustBright  0.159837
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   12.4019
		Period          58.1078
		Eccentricity    0.968662
		Inclination     163.852
		AscendingNode   -163.356
		ArgOfPericenter 11.5721
		MeanAnomaly     -0.663543
	}
}

Comet	"Crait System C11"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            9.21368e-009
	Radius          31.2816
	InertiaMoment   0.39881

	Oblateness      0.0131041

	RotationPeriod  49.1011
	Obliquity       12.0989
	EqAscendNode    150.583

	AbsMagn         5.02533
	SlopeParam      3.69849
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.692 0.690 0.688)

	Surface
	{
		SurfStyle       0.0771232
		OceanStyle      0.693822
		Randomize      (-0.964, -0.791, 0.061)
		colorDistMagn   0.40391
		colorDistFreq   0.478655
		detailScale     854.195
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998716
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.648978
		terraceProb     0.329036
		erosion         0
		montesMagn      0.694396
		montesFreq      3.31271
		montesSpiky     0.88191
		montesFraction  0.532314
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.63786
		hillsFraction   0.603638
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255445
		craterFreq      0.198336
		craterDensity   0.890777
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.479996
		volcanoTemp     1507.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.277, 0.276, 0.275, 0.000)
		colorShelf     (0.294, 0.293, 0.292, 0.000)
		colorBeach     (0.312, 0.311, 0.309, 0.000)
		colorDesert    (0.329, 0.328, 0.327, 0.000)
		colorLowland   (0.346, 0.345, 0.344, 0.000)
		colorUpland    (0.364, 0.362, 0.361, 0.000)
		colorRock      (0.381, 0.380, 0.378, 0.000)
		colorSnow      (0.398, 0.397, 0.395, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.871849
		GasToDust   0.25
		Particles   2741
		GasBright   0.230264
		DustBright  0.472729
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   14.7349
		Period          75.2528
		Eccentricity    0.971323
		Inclination     80.8416
		AscendingNode   -4.49575
		ArgOfPericenter 113.747
		MeanAnomaly     44.3295
	}
}

Comet	"Crait System C12"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            2.83696e-016
	Radius          0.0894841
	InertiaMoment   0.397013

	Oblateness      0.0106671

	RotationPeriod  47.2917
	Obliquity       325.305
	EqAscendNode    135.161

	AbsMagn         12.7651
	SlopeParam      4.26225
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.593 0.524 0.396)

	Surface
	{
		SurfStyle       0.108349
		OceanStyle      0.309017
		Randomize      (0.980, -0.782, 0.335)
		colorDistMagn   0.405497
		colorDistFreq   5.75956e-006
		detailScale     2.44351
		colorConversion true
		snowLevel       2
		tropicLatitude  0.630408
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.670118
		terraceProb     0.272079
		erosion         0
		montesMagn      0.459731
		montesFreq      2.4897
		montesSpiky     0.99844
		montesFraction  0.325165
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.50872e-005
		hillsFraction   0.827144
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237872
		craterFreq      0.2703
		craterDensity   0.761598
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50643
		volcanoTemp     1862.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.237, 0.209, 0.158, 0.000)
		colorShelf     (0.252, 0.223, 0.168, 0.000)
		colorBeach     (0.267, 0.236, 0.178, 0.000)
		colorDesert    (0.282, 0.249, 0.188, 0.000)
		colorLowland   (0.297, 0.262, 0.198, 0.000)
		colorUpland    (0.311, 0.275, 0.208, 0.000)
		colorRock      (0.326, 0.288, 0.218, 0.000)
		colorSnow      (0.341, 0.301, 0.227, 1.000)
		BumpHeight      0.0805356
		BumpOffset      0.0161071
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.149797
		DustBright  0.237683
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   14.2175
		Period          71.3241
		Eccentricity    0.976226
		Inclination     -157.197
		AscendingNode   -85.2323
		ArgOfPericenter 95.1167
		MeanAnomaly     175.941
	}
}

Comet	"Crait System C13"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            2.19418e-012
	Radius          1.937
	InertiaMoment   0.39928

	Oblateness      0.0152541

	RotationPeriod  45.4806
	Obliquity       278.51
	EqAscendNode    119.738

	AbsMagn         8.457
	SlopeParam      4.84812
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.677 0.673 0.670)

	Surface
	{
		SurfStyle       0.720661
		OceanStyle      0.963975
		Randomize      (0.919, -0.351, 0.702)
		colorDistMagn   0.826881
		colorDistFreq   0.00198514
		detailScale     52.893
		colorConversion true
		snowLevel       2
		tropicLatitude  0.622025
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.563928
		terraceProb     0.250039
		erosion         0
		montesMagn      0.451963
		montesFreq      2.86671
		montesSpiky     0.955766
		montesFraction  0.731915
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00966488
		hillsFraction   0.62467
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.205491
		craterFreq      0.242073
		craterDensity   0.807104
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.47177
		volcanoTemp     1580.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.264, 0.229, 0.188, 0.000)
		colorShelf     (0.271, 0.235, 0.214, 0.000)
		colorBeach     (0.318, 0.276, 0.255, 0.000)
		colorDesert    (0.345, 0.296, 0.248, 0.000)
		colorLowland   (0.379, 0.316, 0.281, 0.000)
		colorUpland    (0.420, 0.384, 0.342, 0.000)
		colorRock      (0.454, 0.417, 0.368, 0.000)
		colorSnow      (0.494, 0.444, 0.389, 1.000)
		BumpHeight      1.7433
		BumpOffset      0.34866
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.423482
		GasToDust   0.25
		Particles   1835
		GasBright   0.388582
		DustBright  0.483384
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   15.0106
		Period          77.3742
		Eccentricity    0.974659
		Inclination     78.2425
		AscendingNode   -147.122
		ArgOfPericenter 20.2061
		MeanAnomaly     -92.5971
	}
}

Comet	"Crait System C14"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.69705e-008
	Radius          34.9706
	InertiaMoment   0.397937

	Oblateness      0.0125292

	RotationPeriod  43.663
	Obliquity       231.716
	EqAscendNode    104.316

	AbsMagn         4.74271
	SlopeParam      5.51961
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.410 0.404 0.401)

	Surface
	{
		SurfStyle       0.12352
		OceanStyle      0.736077
		Randomize      (-0.905, -0.130, -0.366)
		colorDistMagn   0.0740857
		colorDistFreq   0.857241
		detailScale     954.93
		colorConversion true
		snowLevel       2
		tropicLatitude  0.909253
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.361062
		terraceProb     0.134233
		erosion         0
		montesMagn      0.444697
		montesFreq      3.14976
		montesSpiky     0.959519
		montesFraction  0.660481
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.46632
		hillsFraction   0.489587
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224308
		craterFreq      0.170375
		craterDensity   0.834263
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.486729
		volcanoTemp     1615.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.164, 0.161, 0.161, 0.000)
		colorShelf     (0.174, 0.172, 0.171, 0.000)
		colorBeach     (0.184, 0.182, 0.181, 0.000)
		colorDesert    (0.195, 0.192, 0.191, 0.000)
		colorLowland   (0.205, 0.202, 0.201, 0.000)
		colorUpland    (0.215, 0.212, 0.211, 0.000)
		colorRock      (0.225, 0.222, 0.221, 0.000)
		colorSnow      (0.236, 0.232, 0.231, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.904675
		GasToDust   0.25
		Particles   2807
		GasBright   0.00260641
		DustBright  0.553846
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   12.835
		Period          61.1782
		Eccentricity    0.957788
		Inclination     -71.2779
		AscendingNode   -72.998
		ArgOfPericenter -106.266
		MeanAnomaly     -167.203
	}
}

Comet	"Crait System C15"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            5.22533e-016
	Radius          0.119943
	InertiaMoment   0.399713

	Oblateness      0.0180043

	RotationPeriod  41.8343
	Obliquity       184.922
	EqAscendNode    88.8931

	AbsMagn         12.365
	SlopeParam      6.43604
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.553 0.547 0.544)

	Surface
	{
		SurfStyle       0.815519
		OceanStyle      0.303668
		Randomize      (-0.105, -0.242, 0.311)
		colorDistMagn   0.666316
		colorDistFreq   9.72626e-006
		detailScale     3.27525
		colorConversion true
		snowLevel       2
		tropicLatitude  0.495036
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.545299
		terraceProb     0.424454
		erosion         0
		montesMagn      0.586016
		montesFreq      3.0862
		montesSpiky     0.899856
		montesFraction  0.696326
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.74618e-005
		hillsFraction   0.728141
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256299
		craterFreq      0.141309
		craterDensity   0.789334
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.427424
		volcanoTemp     1512.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.216, 0.186, 0.152, 0.000)
		colorShelf     (0.221, 0.192, 0.174, 0.000)
		colorBeach     (0.260, 0.224, 0.207, 0.000)
		colorDesert    (0.282, 0.241, 0.201, 0.000)
		colorLowland   (0.310, 0.257, 0.229, 0.000)
		colorUpland    (0.343, 0.312, 0.278, 0.000)
		colorRock      (0.371, 0.339, 0.299, 0.000)
		colorSnow      (0.404, 0.361, 0.316, 1.000)
		BumpHeight      0.107949
		BumpOffset      0.0215898
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0153549
		DustBright  0.225585
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   14.6602
		Period          74.6808
		Eccentricity    0.977027
		Inclination     25.5631
		AscendingNode   -36.1005
		ArgOfPericenter -39.3102
		MeanAnomaly     71.858
	}
}

Comet	"Crait System C16"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            4.04141e-012
	Radius          2.16599
	InertiaMoment   0.398553

	Oblateness      0.0149377

	RotationPeriod  39.9895
	Obliquity       138.127
	EqAscendNode    73.4705

	AbsMagn         8.24753
	SlopeParam      2.00387
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.591 0.588 0.584)

	Surface
	{
		SurfStyle       0.241381
		OceanStyle      0.227667
		Randomize      (-0.337, -0.929, 0.017)
		colorDistMagn   0.660007
		colorDistFreq   0.00201989
		detailScale     59.146
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999837
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.584202
		terraceProb     0.252026
		erosion         0
		montesMagn      0.536947
		montesFreq      2.76681
		montesSpiky     0.817028
		montesFraction  0.570056
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0149653
		hillsFraction   0.791461
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251063
		craterFreq      0.268403
		craterDensity   1.01563
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.496846
		volcanoTemp     1443.24
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.236, 0.235, 0.234, 0.000)
		colorShelf     (0.251, 0.250, 0.248, 0.000)
		colorBeach     (0.266, 0.265, 0.263, 0.000)
		colorDesert    (0.281, 0.279, 0.278, 0.000)
		colorLowland   (0.295, 0.294, 0.292, 0.000)
		colorUpland    (0.310, 0.309, 0.307, 0.000)
		colorRock      (0.325, 0.323, 0.321, 0.000)
		colorSnow      (0.340, 0.338, 0.336, 1.000)
		BumpHeight      1.94939
		BumpOffset      0.389879
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.456308
		GasToDust   0.25
		Particles   1901
		GasBright   0.0890638
		DustBright  0.636362
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   11.7721
		Period          53.7379
		Eccentricity    0.981167
		Inclination     -99.039
		AscendingNode   -101.82
		ArgOfPericenter 22.3943
		MeanAnomaly     142.462
	}
}

Comet	"Crait System C17"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            3.12574e-008
	Radius          46.8626
	InertiaMoment   0.396128

	Oblateness      0.0213271

	RotationPeriod  38.1235
	Obliquity       91.3331
	EqAscendNode    58.0479

	AbsMagn         4.44282
	SlopeParam      2.78163
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.511 0.433 0.380)

	Surface
	{
		SurfStyle       0.487346
		OceanStyle      0.821667
		Randomize      (0.129, 0.468, 0.018)
		colorDistMagn   0.44315
		colorDistFreq   0.609468
		detailScale     1279.66
		colorConversion true
		snowLevel       2
		tropicLatitude  0.946051
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.549464
		terraceProb     0.193105
		erosion         0
		montesMagn      0.464749
		montesFreq      3.42692
		montesSpiky     0.912584
		montesFraction  0.565863
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.19312
		hillsFraction   0.68852
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242226
		craterFreq      0.217337
		craterDensity   1.08544
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.471229
		volcanoTemp     1272.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.204, 0.173, 0.152, 0.000)
		colorShelf     (0.217, 0.184, 0.161, 0.000)
		colorBeach     (0.230, 0.195, 0.171, 0.000)
		colorDesert    (0.243, 0.206, 0.180, 0.000)
		colorLowland   (0.255, 0.217, 0.190, 0.000)
		colorUpland    (0.268, 0.227, 0.199, 0.000)
		colorRock      (0.281, 0.238, 0.209, 0.000)
		colorSnow      (0.294, 0.249, 0.218, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.937501
		GasToDust   0.25
		Particles   2873
		GasBright   0.0745302
		DustBright  0.335382
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   15.861
		Period          84.0419
		Eccentricity    0.970947
		Inclination     99.1402
		AscendingNode   -108.937
		ArgOfPericenter -20.8446
		MeanAnomaly     -161.06
	}
}

Comet	"Crait System C18"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            9.62441e-016
	Radius          0.134156
	InertiaMoment   0.399054

	Oblateness      0.0181913

	RotationPeriod  36.2305
	Obliquity       44.5388
	EqAscendNode    42.6253

	AbsMagn         12.0044
	SlopeParam      3.40623
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.471 0.467 0.465)

	Surface
	{
		SurfStyle       0.600012
		OceanStyle      0.47045
		Randomize      (0.876, 0.976, 0.016)
		colorDistMagn   0.429056
		colorDistFreq   1.2219e-005
		detailScale     3.66335
		colorConversion true
		snowLevel       2
		tropicLatitude  0.710201
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.484441
		terraceProb     0.23017
		erosion         0
		montesMagn      0.479266
		montesFreq      4.0056
		montesSpiky     0.917282
		montesFraction  0.531266
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.68551e-005
		hillsFraction   0.806608
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.182816
		craterFreq      0.271311
		craterDensity   0.903036
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51375
		volcanoTemp     1502.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.184, 0.159, 0.130, 0.000)
		colorShelf     (0.188, 0.163, 0.149, 0.000)
		colorBeach     (0.221, 0.191, 0.177, 0.000)
		colorDesert    (0.240, 0.205, 0.172, 0.000)
		colorLowland   (0.264, 0.219, 0.195, 0.000)
		colorUpland    (0.292, 0.266, 0.237, 0.000)
		colorRock      (0.315, 0.289, 0.256, 0.000)
		colorSnow      (0.344, 0.308, 0.270, 1.000)
		BumpHeight      0.12074
		BumpOffset      0.0241481
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.215429
		DustBright  0.67897
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   9.1656
		Period          36.9183
		Eccentricity    0.963791
		Inclination     -96.8274
		AscendingNode   152.775
		ArgOfPericenter -59.8454
		MeanAnomaly     64.3405
	}
}

Comet	"Crait System C19"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            7.44379e-012
	Radius          2.9019
	InertiaMoment   0.397546

	Oblateness      0.0264032

	RotationPeriod  34.3044
	Obliquity       357.745
	EqAscendNode    27.2027

	AbsMagn         8.03874
	SlopeParam      3.97671
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.566 0.563 0.558)

	Surface
	{
		SurfStyle       0.843336
		OceanStyle      0.373512
		Randomize      (-0.178, -0.832, -0.844)
		colorDistMagn   0.783187
		colorDistFreq   0.0014129
		detailScale     79.2413
		colorConversion true
		snowLevel       2
		tropicLatitude  0.7113
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.585375
		terraceProb     0.2716
		erosion         0
		montesMagn      0.488928
		montesFreq      2.8205
		montesSpiky     0.820181
		montesFraction  0.316818
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0156777
		hillsFraction   0.578882
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249239
		craterFreq      0.238399
		craterDensity   0.987204
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.512471
		volcanoTemp     1253.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.221, 0.191, 0.156, 0.000)
		colorShelf     (0.226, 0.197, 0.179, 0.000)
		colorBeach     (0.266, 0.231, 0.212, 0.000)
		colorDesert    (0.289, 0.248, 0.207, 0.000)
		colorLowland   (0.317, 0.265, 0.234, 0.000)
		colorUpland    (0.351, 0.321, 0.285, 0.000)
		colorRock      (0.379, 0.349, 0.307, 0.000)
		colorSnow      (0.413, 0.372, 0.324, 1.000)
		BumpHeight      2.61171
		BumpOffset      0.522343
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.489134
		GasToDust   0.25
		Particles   1967
		GasBright   0.173614
		DustBright  0.405272
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   17.205
		Period          94.9472
		Eccentricity    0.97364
		Inclination     43.0863
		AscendingNode   -178.3
		ArgOfPericenter 131.184
		MeanAnomaly     134.751
	}
}

Comet	"Crait System C20"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            5.75723e-008
	Radius          52.4276
	InertiaMoment   0.399502

	Oblateness      0.0228202

	RotationPeriod  32.3382
	Obliquity       310.95
	EqAscendNode    11.7801

	AbsMagn         4.12145
	SlopeParam      4.54525
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.413 0.412 0.409)

	Surface
	{
		SurfStyle       0.309218
		OceanStyle      0.637933
		Randomize      (0.102, -0.986, 0.225)
		colorDistMagn   0.276791
		colorDistFreq   1.26469
		detailScale     1431.62
		colorConversion true
		snowLevel       2
		tropicLatitude  0.924669
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.761732
		terraceProb     0.483841
		erosion         0
		montesMagn      0.48991
		montesFreq      2.82743
		montesSpiky     0.843847
		montesFraction  0.407806
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.62135
		hillsFraction   0.54954
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261912
		craterFreq      0.23306
		craterDensity   0.834272
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.479285
		volcanoTemp     1330.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.165, 0.165, 0.164, 0.000)
		colorShelf     (0.176, 0.175, 0.174, 0.000)
		colorBeach     (0.186, 0.185, 0.184, 0.000)
		colorDesert    (0.196, 0.196, 0.194, 0.000)
		colorLowland   (0.207, 0.206, 0.204, 0.000)
		colorUpland    (0.217, 0.216, 0.215, 0.000)
		colorRock      (0.227, 0.227, 0.225, 0.000)
		colorSnow      (0.238, 0.237, 0.235, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.970326
		GasToDust   0.25
		Particles   2940
		GasBright   0.0945389
		DustBright  0.168833
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   12.6659
		Period          59.9728
		Eccentricity    0.985733
		Inclination     40.8867
		AscendingNode   103.417
		ArgOfPericenter -159.142
		MeanAnomaly     43.8285
	}
}

Comet	"Crait System C21"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.77269e-015
	Radius          0.179698
	InertiaMoment   0.39827

	Oblateness      0.033783

	RotationPeriod  30.3241
	Obliquity       264.156
	EqAscendNode    356.358

	AbsMagn         11.6737
	SlopeParam      5.16275
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.649 0.573 0.440)

	Surface
	{
		SurfStyle       0.822074
		OceanStyle      0.460127
		Randomize      (0.628, -0.383, 0.853)
		colorDistMagn   0.71303
		colorDistFreq   7.94353e-006
		detailScale     4.90695
		colorConversion true
		snowLevel       2
		tropicLatitude  0.675196
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.398639
		terraceProb     0.257908
		erosion         0
		montesMagn      0.641367
		montesFreq      3.05741
		montesSpiky     0.96757
		montesFraction  0.463838
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.16788e-005
		hillsFraction   0.508095
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.29293
		craterFreq      0.193683
		craterDensity   0.922243
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.477813
		volcanoTemp     1391.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.253, 0.195, 0.123, 0.000)
		colorShelf     (0.260, 0.201, 0.141, 0.000)
		colorBeach     (0.305, 0.235, 0.167, 0.000)
		colorDesert    (0.331, 0.252, 0.163, 0.000)
		colorLowland   (0.364, 0.269, 0.185, 0.000)
		colorUpland    (0.403, 0.327, 0.225, 0.000)
		colorRock      (0.435, 0.355, 0.242, 0.000)
		colorSnow      (0.474, 0.378, 0.255, 1.000)
		BumpHeight      0.161728
		BumpOffset      0.0323456
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0407683
		GasToDust   0.25
		Particles   1062
		GasBright   0.312606
		DustBright  0.435253
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   14.1845
		Period          71.0755
		Eccentricity    0.972188
		Inclination     98.1181
		AscendingNode   42.7437
		ArgOfPericenter 135.932
		MeanAnomaly     65.6389
	}
}

Comet	"Crait System C22"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.37105e-011
	Radius          3.24719
	InertiaMoment   0.399926

	Oblateness      0.0298754

	RotationPeriod  28.2531
	Obliquity       217.362
	EqAscendNode    340.935

	AbsMagn         7.83005
	SlopeParam      5.92088
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.766 0.711 0.636)

	Surface
	{
		SurfStyle       0.229574
		OceanStyle      0.919341
		Randomize      (0.103, 0.354, 0.641)
		colorDistMagn   0.485391
		colorDistFreq   0.00574346
		detailScale     88.6699
		colorConversion true
		snowLevel       2
		tropicLatitude  0.99719
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.548222
		terraceProb     0.118815
		erosion         0
		montesMagn      0.541161
		montesFreq      3.54352
		montesSpiky     0.866483
		montesFraction  0.349525
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0234901
		hillsFraction   0.450274
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238974
		craterFreq      0.202028
		craterDensity   1.03983
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.41658
		volcanoTemp     1189.32
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.306, 0.284, 0.255, 0.000)
		colorShelf     (0.326, 0.302, 0.270, 0.000)
		colorBeach     (0.345, 0.320, 0.286, 0.000)
		colorDesert    (0.364, 0.338, 0.302, 0.000)
		colorLowland   (0.383, 0.356, 0.318, 0.000)
		colorUpland    (0.402, 0.373, 0.334, 0.000)
		colorRock      (0.421, 0.391, 0.350, 0.000)
		colorSnow      (0.440, 0.409, 0.366, 1.000)
		BumpHeight      2.92247
		BumpOffset      0.584494
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.52196
		GasToDust   0.25
		Particles   2034
		GasBright   0.206249
		DustBright  0.226097
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   15.0126
		Period          77.3901
		Eccentricity    0.97395
		Inclination     -118.411
		AscendingNode   31.9101
		ArgOfPericenter 46.3385
		MeanAnomaly     -116.05
	}
}

Comet	"Crait System C23"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.06041e-007
	Radius          70.2116
	InertiaMoment   0.398816

	Oblateness      0.0455152

	RotationPeriod  26.1145
	Obliquity       170.567
	EqAscendNode    325.512

	AbsMagn         3.77287
	SlopeParam      7.17253
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.436 0.431 0.426)

	Surface
	{
		SurfStyle       0.271554
		OceanStyle      0.928506
		Randomize      (-0.812, -0.594, -0.309)
		colorDistMagn   0.129718
		colorDistFreq   3.52186
		detailScale     1917.24
		colorConversion true
		snowLevel       2
		tropicLatitude  0.308826
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.421239
		terraceProb     0.290147
		erosion         0
		montesMagn      0.416683
		montesFreq      2.23705
		montesSpiky     0.984006
		montesFraction  0.383645
		dunesFraction   0
		hillsMagn       0
		hillsFreq       13.4334
		hillsFraction   0.675756
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256567
		craterFreq      0.256065
		craterDensity   0.721958
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.570997
		volcanoTemp     1529.95
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.174, 0.173, 0.170, 0.000)
		colorShelf     (0.185, 0.183, 0.181, 0.000)
		colorBeach     (0.196, 0.194, 0.192, 0.000)
		colorDesert    (0.207, 0.205, 0.202, 0.000)
		colorLowland   (0.218, 0.216, 0.213, 0.000)
		colorUpland    (0.229, 0.226, 0.224, 0.000)
		colorRock      (0.240, 0.237, 0.234, 0.000)
		colorSnow      (0.251, 0.248, 0.245, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0330896
		DustBright  0.883742
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   8.40496
		Period          32.4193
		Eccentricity    0.948216
		Inclination     -27.1156
		AscendingNode   167.995
		ArgOfPericenter 130.586
		MeanAnomaly     -113.911
	}
}

Comet	"Crait System C24"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            3.26508e-015
	Radius          0.201119
	InertiaMoment   0.397029

	Oblateness      0.0412176

	RotationPeriod  23.8958
	Obliquity       123.773
	EqAscendNode    310.09

	AbsMagn         11.3664
	SlopeParam      2.41745
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.458 0.451 0.447)

	Surface
	{
		SurfStyle       0.220045
		OceanStyle      0.757258
		Randomize      (0.738, -0.854, -0.935)
		colorDistMagn   0.794968
		colorDistFreq   2.44048e-005
		detailScale     5.49189
		colorConversion true
		snowLevel       2
		tropicLatitude  0.846188
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.516884
		terraceProb     0.198601
		erosion         0
		montesMagn      0.585647
		montesFreq      3.42521
		montesSpiky     0.920533
		montesFraction  0.560504
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.09095e-005
		hillsFraction   0.54755
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257427
		craterFreq      0.278775
		craterDensity   0.978199
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.516075
		volcanoTemp     1581.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.183, 0.180, 0.179, 0.000)
		colorShelf     (0.195, 0.192, 0.190, 0.000)
		colorBeach     (0.206, 0.203, 0.201, 0.000)
		colorDesert    (0.218, 0.214, 0.212, 0.000)
		colorLowland   (0.229, 0.225, 0.223, 0.000)
		colorUpland    (0.241, 0.237, 0.235, 0.000)
		colorRock      (0.252, 0.248, 0.246, 0.000)
		colorSnow      (0.263, 0.259, 0.257, 1.000)
		BumpHeight      0.181007
		BumpOffset      0.0362015
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0735943
		GasToDust   0.25
		Particles   1128
		GasBright   0.0572074
		DustBright  0.544111
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   14.4819
		Period          73.3225
		Eccentricity    0.978316
		Inclination     -42.7023
		AscendingNode   102.744
		ArgOfPericenter 62.1244
		MeanAnomaly     149.498
	}
}

Comet	"Crait System C25"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            2.5253e-011
	Radius          4.34789
	InertiaMoment   0.399286

	Oblateness      0.0665727

	RotationPeriod  21.5814
	Obliquity       76.9787
	EqAscendNode    294.667

	AbsMagn         7.6209
	SlopeParam      3.10063
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.405 0.400 0.396)

	Surface
	{
		SurfStyle       0.416113
		OceanStyle      0.50194
		Randomize      (0.557, 0.375, 0.304)
		colorDistMagn   0.139376
		colorDistFreq   0.0136311
		detailScale     118.726
		colorConversion true
		snowLevel       2
		tropicLatitude  0.973121
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.712321
		terraceProb     0.203865
		erosion         0
		montesMagn      0.50086
		montesFreq      3.34867
		montesSpiky     0.968265
		montesFraction  0.718856
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0434908
		hillsFraction   0.761632
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248999
		craterFreq      0.211027
		craterDensity   0.915077
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.527877
		volcanoTemp     1367.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.162, 0.160, 0.158, 0.000)
		colorShelf     (0.172, 0.170, 0.168, 0.000)
		colorBeach     (0.182, 0.180, 0.178, 0.000)
		colorDesert    (0.192, 0.190, 0.188, 0.000)
		colorLowland   (0.202, 0.200, 0.198, 0.000)
		colorUpland    (0.213, 0.210, 0.208, 0.000)
		colorRock      (0.223, 0.220, 0.218, 0.000)
		colorSnow      (0.233, 0.230, 0.227, 1.000)
		BumpHeight      3.9131
		BumpOffset      0.78262
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.554786
		GasToDust   0.25
		Particles   2100
		GasBright   0.0440659
		DustBright  0.241739
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   14.2697
		Period          71.717
		Eccentricity    0.952175
		Inclination     177.794
		AscendingNode   -82.1106
		ArgOfPericenter 7.31724
		MeanAnomaly     -60.8869
	}
}

Comet	"Crait System C26"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.95314e-007
	Radius          78.5953
	InertiaMoment   0.397946

	Oblateness      0.0642346

	RotationPeriod  19.1522
	Obliquity       30.1844
	EqAscendNode    279.245

	AbsMagn         3.38882
	SlopeParam      3.69068
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.702 0.591 0.534)

	Surface
	{
		SurfStyle       0.76056
		OceanStyle      0.764346
		Randomize      (-0.214, 0.348, -0.835)
		colorDistMagn   0.654469
		colorDistFreq   3.7937
		detailScale     2146.18
		colorConversion true
		snowLevel       2
		tropicLatitude  0.447134
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.671921
		terraceProb     0.562859
		erosion         0
		montesMagn      0.493481
		montesFreq      3.43374
		montesSpiky     0.993238
		montesFraction  0.548288
		dunesFraction   0
		hillsMagn       0
		hillsFreq       12.2756
		hillsFraction   0.468788
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237447
		craterFreq      0.253802
		craterDensity   0.91899
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.445141
		volcanoTemp     1492.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.274, 0.201, 0.149, 0.000)
		colorShelf     (0.281, 0.207, 0.171, 0.000)
		colorBeach     (0.330, 0.242, 0.203, 0.000)
		colorDesert    (0.358, 0.260, 0.197, 0.000)
		colorLowland   (0.393, 0.278, 0.224, 0.000)
		colorUpland    (0.435, 0.337, 0.272, 0.000)
		colorRock      (0.470, 0.366, 0.293, 0.000)
		colorSnow      (0.512, 0.390, 0.310, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.164247
		DustBright  0.606045
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   12.8536
		Period          61.311
		Eccentricity    0.982505
		Inclination     -130.355
		AscendingNode   -150.887
		ArgOfPericenter 175.64
		MeanAnomaly     -96.3212
	}
}

Comet	"Crait System C27"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            6.01387e-015
	Radius          0.269248
	InertiaMoment   0.399718

	Oblateness      0.112606

	RotationPeriod  16.584
	Obliquity       343.39
	EqAscendNode    263.822

	AbsMagn         11.0778
	SlopeParam      4.25447
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.791 0.788 0.787)

	Surface
	{
		SurfStyle       0.733436
		OceanStyle      0.851826
		Randomize      (0.505, 0.114, 0.714)
		colorDistMagn   0.897485
		colorDistFreq   1.65211e-005
		detailScale     7.35227
		colorConversion true
		snowLevel       2
		tropicLatitude  0.819186
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.398055
		terraceProb     0.835441
		erosion         0
		montesMagn      0.519861
		montesFreq      3.04156
		montesSpiky     0.786253
		montesFraction  0.498884
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000207621
		hillsFraction   0.341582
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244393
		craterFreq      0.266542
		craterDensity   0.841222
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.507573
		volcanoTemp     1691.25
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.308, 0.268, 0.220, 0.000)
		colorShelf     (0.316, 0.276, 0.252, 0.000)
		colorBeach     (0.372, 0.323, 0.299, 0.000)
		colorDesert    (0.403, 0.347, 0.291, 0.000)
		colorLowland   (0.443, 0.371, 0.331, 0.000)
		colorUpland    (0.490, 0.449, 0.401, 0.000)
		colorRock      (0.530, 0.489, 0.433, 0.000)
		colorSnow      (0.577, 0.520, 0.456, 1.000)
		BumpHeight      0.242323
		BumpOffset      0.0484647
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.10642
		GasToDust   0.25
		Particles   1194
		GasBright   0.123824
		DustBright  0.330955
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   11.0879
		Period          49.1218
		Eccentricity    0.972416
		Inclination     -38.6552
		AscendingNode   11.7589
		ArgOfPericenter -147.269
		MeanAnomaly     -110.856
	}
}

Comet	"Crait System C28"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            4.65129e-011
	Radius          4.86785
	InertiaMoment   0.39856

	Oblateness      0.122914

	RotationPeriod  13.845
	Obliquity       296.596
	EqAscendNode    248.399

	AbsMagn         7.41071
	SlopeParam      4.83968
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.654 0.652 0.647)

	Surface
	{
		SurfStyle       0.446737
		OceanStyle      0.470173
		Randomize      (-0.193, 0.192, -0.387)
		colorDistMagn   0.433036
		colorDistFreq   0.0161272
		detailScale     132.925
		colorConversion true
		snowLevel       2
		tropicLatitude  0.851061
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.256793
		terraceProb     0.426952
		erosion         0
		montesMagn      0.529305
		montesFreq      2.58816
		montesSpiky     0.987962
		montesFraction  0.600576
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0441697
		hillsFraction   0.537888
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257092
		craterFreq      0.219791
		craterDensity   0.744192
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.475752
		volcanoTemp     1384.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.262, 0.261, 0.259, 0.000)
		colorShelf     (0.278, 0.277, 0.275, 0.000)
		colorBeach     (0.294, 0.293, 0.291, 0.000)
		colorDesert    (0.311, 0.310, 0.307, 0.000)
		colorLowland   (0.327, 0.326, 0.323, 0.000)
		colorUpland    (0.344, 0.342, 0.340, 0.000)
		colorRock      (0.360, 0.358, 0.356, 0.000)
		colorSnow      (0.376, 0.375, 0.372, 1.000)
		BumpHeight      4.38107
		BumpOffset      0.876213
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.587612
		GasToDust   0.25
		Particles   2166
		GasBright   0.311195
		DustBright  0.62807
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   10.2621
		Period          43.7375
		Eccentricity    0.968141
		Inclination     -162.55
		AscendingNode   -68.5687
		ArgOfPericenter -163.088
		MeanAnomaly     137.247
	}
}

Comet	"Crait System C29"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            3.59743e-007
	Radius          105.204
	InertiaMoment   0.396162

	Oblateness      0.249

	RotationPeriod  10.8925
	Obliquity       249.802
	EqAscendNode    232.977

	AbsMagn         2.95676
	SlopeParam      5.50933
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.820 0.795 0.772)

	Surface
	{
		SurfStyle       0.22462
		OceanStyle      0.927981
		Randomize      (-0.725, 0.553, -0.763)
		colorDistMagn   0.547823
		colorDistFreq   2.98118
		detailScale     2872.76
		colorConversion true
		snowLevel       2
		tropicLatitude  0.86743
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.62437
		terraceProb     0.128094
		erosion         0
		montesMagn      0.470605
		montesFreq      2.92607
		montesSpiky     0.948804
		montesFraction  0.467666
		dunesFraction   0
		hillsMagn       0
		hillsFreq       29.1057
		hillsFraction   0.71031
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255966
		craterFreq      0.355971
		craterDensity   0.953625
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.4569
		volcanoTemp     1314.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.328, 0.318, 0.309, 0.000)
		colorShelf     (0.348, 0.338, 0.328, 0.000)
		colorBeach     (0.369, 0.358, 0.347, 0.000)
		colorDesert    (0.389, 0.378, 0.367, 0.000)
		colorLowland   (0.410, 0.398, 0.386, 0.000)
		colorUpland    (0.430, 0.418, 0.405, 0.000)
		colorRock      (0.451, 0.437, 0.425, 0.000)
		colorSnow      (0.471, 0.457, 0.444, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.243489
		DustBright  0.380262
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   12.9273
		Period          61.8392
		Eccentricity    0.987204
		Inclination     128.95
		AscendingNode   -67.3983
		ArgOfPericenter 49.822
		MeanAnomaly     47.4225
	}
}

Comet	"Crait System C30"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.10768e-014
	Radius          0.301492
	InertiaMoment   0.39906

	Oblateness      0.249

	RotationPeriod  7.66649
	Obliquity       203.007
	EqAscendNode    217.554

	AbsMagn         10.8044
	SlopeParam      6.41991
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.485 0.479 0.471)

	Surface
	{
		SurfStyle       0.015073
		OceanStyle      0.643851
		Randomize      (0.904, 0.189, -0.843)
		colorDistMagn   0.474364
		colorDistFreq   3.39819e-005
		detailScale     8.23273
		colorConversion true
		snowLevel       2
		tropicLatitude  0.857326
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.503405
		terraceProb     0.190625
		erosion         0
		montesMagn      0.51903
		montesFreq      2.91009
		montesSpiky     0.985747
		montesFraction  0.625111
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000178714
		hillsFraction   0.545105
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224332
		craterFreq      0.147402
		craterDensity   0.984594
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.495605
		volcanoTemp     1357.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.194, 0.191, 0.189, 0.000)
		colorShelf     (0.206, 0.203, 0.200, 0.000)
		colorBeach     (0.218, 0.215, 0.212, 0.000)
		colorDesert    (0.230, 0.227, 0.224, 0.000)
		colorLowland   (0.243, 0.239, 0.236, 0.000)
		colorUpland    (0.255, 0.251, 0.247, 0.000)
		colorRock      (0.267, 0.263, 0.259, 0.000)
		colorSnow      (0.279, 0.275, 0.271, 1.000)
		BumpHeight      0.271343
		BumpOffset      0.0542685
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.139246
		GasToDust   0.25
		Particles   1261
		GasBright   0.138525
		DustBright  0.169713
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   11.777
		Period          53.7713
		Eccentricity    0.969215
		Inclination     -73.196
		AscendingNode   48.3469
		ArgOfPericenter 21.7672
		MeanAnomaly     -69.8481
	}
}

Comet	"Crait System C31"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            8.56709e-011
	Radius          6.51497
	InertiaMoment   0.397557

	Oblateness      0.249

	RotationPeriod  4.07923
	Obliquity       156.213
	EqAscendNode    202.132

	AbsMagn         7.19887
	SlopeParam      10.1396
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.749 0.747 0.744)

	Surface
	{
		SurfStyle       0.686346
		OceanStyle      0.902061
		Randomize      (0.013, 0.686, 0.391)
		colorDistMagn   0.00384456
		colorDistFreq   0.0179554
		detailScale     177.902
		colorConversion true
		snowLevel       2
		tropicLatitude  0.710894
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.602437
		terraceProb     0.420654
		erosion         0
		montesMagn      0.523274
		montesFreq      2.69276
		montesSpiky     0.993321
		montesFraction  0.487977
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.113044
		hillsFraction   0.790684
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213866
		craterFreq      0.214888
		craterDensity   0.889934
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.534188
		volcanoTemp     1319.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.292, 0.254, 0.208, 0.000)
		colorShelf     (0.299, 0.261, 0.238, 0.000)
		colorBeach     (0.352, 0.306, 0.283, 0.000)
		colorDesert    (0.382, 0.328, 0.275, 0.000)
		colorLowland   (0.419, 0.351, 0.312, 0.000)
		colorUpland    (0.464, 0.426, 0.379, 0.000)
		colorRock      (0.502, 0.463, 0.409, 0.000)
		colorSnow      (0.547, 0.493, 0.432, 1.000)
		BumpHeight      5.86348
		BumpOffset      1.1727
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.620438
		GasToDust   0.25
		Particles   2233
		GasBright   0.00670115
		DustBright  0.786023
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   10.5175
		Period          45.3807
		Eccentricity    0.956068
		Inclination     -55.7311
		AscendingNode   124.346
		ArgOfPericenter -37.572
		MeanAnomaly     109.888
	}
}

Comet	"Crait System C32"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            6.62603e-007
	Radius          117.818
	InertiaMoment   0.399508

	Oblateness      0.00139473

	RotationPeriod  129.895
	Obliquity       109.419
	EqAscendNode    186.709

	AbsMagn         2.45618
	SlopeParam      2.77232
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.530 0.415 0.359)

	Surface
	{
		SurfStyle       0.600887
		OceanStyle      0.00951193
		Randomize      (-0.174, 0.504, -0.164)
		colorDistMagn   0.778761
		colorDistFreq   10.9506
		detailScale     3217.21
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998738
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.535716
		terraceProb     0.272613
		erosion         0
		montesMagn      0.443104
		montesFreq      2.82311
		montesSpiky     0.989359
		montesFraction  0.61384
		dunesFraction   0
		hillsMagn       0
		hillsFreq       36.2691
		hillsFraction   0.715788
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251651
		craterFreq      0.399935
		craterDensity   0.811772
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.498229
		volcanoTemp     1534.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.207, 0.141, 0.100, 0.000)
		colorShelf     (0.212, 0.145, 0.115, 0.000)
		colorBeach     (0.249, 0.170, 0.136, 0.000)
		colorDesert    (0.270, 0.183, 0.133, 0.000)
		colorLowland   (0.297, 0.195, 0.151, 0.000)
		colorUpland    (0.329, 0.237, 0.183, 0.000)
		colorRock      (0.355, 0.258, 0.197, 0.000)
		colorSnow      (0.387, 0.274, 0.208, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0322111
		DustBright  0.445
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   12.9309
		Period          61.8647
		Eccentricity    0.977182
		Inclination     -156.36
		AscendingNode   -159.741
		ArgOfPericenter -142.459
		MeanAnomaly     105.673
	}
}

Comet	"Crait System C33"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            2.0402e-014
	Radius          0.403458
	InertiaMoment   0.398277

	Oblateness      0.00231293

	RotationPeriod  114.928
	Obliquity       62.6244
	EqAscendNode    171.286

	AbsMagn         10.5435
	SlopeParam      3.39816
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.441 0.432 0.429)

	Surface
	{
		SurfStyle       0.946681
		OceanStyle      0.161716
		Randomize      (0.317, -0.151, 0.173)
		colorDistMagn   0.411838
		colorDistFreq   0.000126272
		detailScale     11.0171
		colorConversion true
		snowLevel       2
		tropicLatitude  0.8294
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.414831
		terraceProb     0.263076
		erosion         0
		montesMagn      0.504828
		montesFreq      2.77689
		montesSpiky     0.992839
		montesFraction  0.748805
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00030112
		hillsFraction   0.837493
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225457
		craterFreq      0.194342
		craterDensity   0.835708
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.438593
		volcanoTemp     1407.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.150, 0.151, 0.172, 0.050)
		colorShelf     (0.176, 0.177, 0.197, 0.040)
		colorBeach     (0.203, 0.203, 0.223, 0.030)
		colorDesert    (0.229, 0.229, 0.253, 0.020)
		colorLowland   (0.256, 0.255, 0.279, 0.030)
		colorUpland    (0.282, 0.281, 0.305, 0.050)
		colorRock      (0.308, 0.307, 0.339, 0.020)
		colorSnow      (0.308, 0.307, 0.339, 1.000)
		BumpHeight      0.363113
		BumpOffset      0.0726225
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.172072
		GasToDust   0.25
		Particles   1327
		GasBright   0.121697
		DustBright  0.840001
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   14.7033
		Period          75.0106
		Eccentricity    0.962201
		Inclination     -6.96789
		AscendingNode   -18.3848
		ArgOfPericenter -117.818
		MeanAnomaly     -12.4278
	}
}

Comet	"Crait System C34"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.57795e-010
	Radius          7.29698
	InertiaMoment   0.399931

	Oblateness      0.00206616

	RotationPeriod  106.679
	Obliquity       15.8301
	EqAscendNode    155.864

	AbsMagn         6.98476
	SlopeParam      3.96899
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.634 0.630 0.623)

	Surface
	{
		SurfStyle       0.67052
		OceanStyle      0.281999
		Randomize      (-0.666, 0.241, -0.210)
		colorDistMagn   0.78955
		colorDistFreq   0.0327642
		detailScale     199.256
		colorConversion true
		snowLevel       2
		tropicLatitude  0.299477
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.631595
		terraceProb     0.17765
		erosion         0
		montesMagn      0.524555
		montesFreq      2.54011
		montesSpiky     0.979755
		montesFraction  0.780968
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.146794
		hillsFraction   0.663014
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.192039
		craterFreq      0.189266
		craterDensity   0.848788
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.468884
		volcanoTemp     1547.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.247, 0.214, 0.174, 0.000)
		colorShelf     (0.254, 0.221, 0.199, 0.000)
		colorBeach     (0.298, 0.258, 0.237, 0.000)
		colorDesert    (0.323, 0.277, 0.231, 0.000)
		colorLowland   (0.355, 0.296, 0.262, 0.000)
		colorUpland    (0.393, 0.359, 0.318, 0.000)
		colorRock      (0.425, 0.391, 0.343, 0.000)
		colorSnow      (0.463, 0.416, 0.361, 1.000)
		BumpHeight      6.56728
		BumpOffset      1.31346
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.653264
		GasToDust   0.25
		Particles   2299
		GasBright   0.119925
		DustBright  0.52626
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   12.099
		Period          55.9918
		Eccentricity    0.976343
		Inclination     8.81927
		AscendingNode   -94.6676
		ArgOfPericenter 111.277
		MeanAnomaly     -22.9366
	}
}

Comet	"Crait System C35"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            4.85863e-018
	Radius          0.0249855
	InertiaMoment   0.398822

	Oblateness      0.00301059

	RotationPeriod  100.702
	Obliquity       329.036
	EqAscendNode    140.441

	AbsMagn         1.84956
	SlopeParam      4.53725
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.446 0.443 0.439)

	Surface
	{
		SurfStyle       0.667669
		OceanStyle      0.633932
		Randomize      (-0.081, -0.203, -0.165)
		colorDistMagn   0.217242
		colorDistFreq   5.35005e-007
		detailScale     0.682272
		colorConversion true
		snowLevel       2
		tropicLatitude  0.654519
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.314247
		terraceProb     0.118771
		erosion         0
		montesMagn      0.624584
		montesFreq      3.259
		montesSpiky     0.935131
		montesFraction  0.289975
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.53577e-006
		hillsFraction   0.568784
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24694
		craterFreq      0.210345
		craterDensity   0.934513
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.546957
		volcanoTemp     1501.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.174, 0.151, 0.123, 0.000)
		colorShelf     (0.178, 0.155, 0.141, 0.000)
		colorBeach     (0.210, 0.182, 0.167, 0.000)
		colorDesert    (0.227, 0.195, 0.163, 0.000)
		colorLowland   (0.250, 0.208, 0.185, 0.000)
		colorUpland    (0.276, 0.252, 0.224, 0.000)
		colorRock      (0.299, 0.275, 0.242, 0.000)
		colorSnow      (0.326, 0.292, 0.255, 1.000)
		BumpHeight      0.022487
		BumpOffset      0.0044974
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0808934
		DustBright  0.249777
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   10.4363
		Period          44.8563
		Eccentricity    0.981933
		Inclination     -150.628
		AscendingNode   -88.0052
		ArgOfPericenter 117.964
		MeanAnomaly     -150.514
	}
}

Comet	"Crait System C36"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            3.7578e-014
	Radius          0.451931
	InertiaMoment   0.397045

	Oblateness      0.0025229

	RotationPeriod  95.9034
	Obliquity       282.241
	EqAscendNode    125.019

	AbsMagn         10.293
	SlopeParam      5.15363
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.465 0.460 0.458)

	Surface
	{
		SurfStyle       0.816417
		OceanStyle      0.662034
		Randomize      (0.095, 0.289, -0.517)
		colorDistMagn   0.0492257
		colorDistFreq   9.3722e-005
		detailScale     12.3407
		colorConversion true
		snowLevel       2
		tropicLatitude  0.952415
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.513064
		terraceProb     0.319883
		erosion         0
		montesMagn      0.35018
		montesFreq      3.33993
		montesSpiky     0.826491
		montesFraction  0.503
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000735778
		hillsFraction   0.798451
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236599
		craterFreq      0.182162
		craterDensity   0.95601
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.569854
		volcanoTemp     1567.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.181, 0.156, 0.128, 0.000)
		colorShelf     (0.186, 0.161, 0.147, 0.000)
		colorBeach     (0.219, 0.189, 0.174, 0.000)
		colorDesert    (0.237, 0.202, 0.170, 0.000)
		colorLowland   (0.260, 0.216, 0.192, 0.000)
		colorUpland    (0.288, 0.262, 0.234, 0.000)
		colorRock      (0.312, 0.285, 0.252, 0.000)
		colorSnow      (0.340, 0.304, 0.266, 1.000)
		BumpHeight      0.406738
		BumpOffset      0.0813476
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.204898
		GasToDust   0.25
		Particles   1393
		GasBright   0.247547
		DustBright  0.567611
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   11.4679
		Period          51.6685
		Eccentricity    0.949573
		Inclination     -44.2976
		AscendingNode   48.014
		ArgOfPericenter -139.568
		MeanAnomaly     146.691
	}
}

Comet	"Crait System C37"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            2.90639e-010
	Radius          9.76297
	InertiaMoment   0.399291

	Oblateness      0.00361704

	RotationPeriod  91.8312
	Obliquity       235.447
	EqAscendNode    109.596

	AbsMagn         6.76771
	SlopeParam      5.90868
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.560 0.556 0.555)

	Surface
	{
		SurfStyle       0.311021
		OceanStyle      0.127114
		Randomize      (0.888, -0.750, 0.608)
		colorDistMagn   0.967932
		colorDistFreq   0.080469
		detailScale     266.594
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999139
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.422548
		terraceProb     0.353674
		erosion         0
		montesMagn      0.401428
		montesFreq      3.66694
		montesSpiky     0.983266
		montesFraction  0.550847
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.192916
		hillsFraction   0.566217
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254743
		craterFreq      0.268595
		craterDensity   1.00995
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.538663
		volcanoTemp     1272.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.224, 0.223, 0.222, 0.000)
		colorShelf     (0.238, 0.236, 0.236, 0.000)
		colorBeach     (0.252, 0.250, 0.250, 0.000)
		colorDesert    (0.266, 0.264, 0.264, 0.000)
		colorLowland   (0.280, 0.278, 0.277, 0.000)
		colorUpland    (0.294, 0.292, 0.291, 0.000)
		colorRock      (0.308, 0.306, 0.305, 0.000)
		colorSnow      (0.322, 0.320, 0.319, 1.000)
		BumpHeight      8.78667
		BumpOffset      1.75733
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.68609
		GasToDust   0.25
		Particles   2365
		GasBright   0.181233
		DustBright  0.318411
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   13.416
		Period          65.3786
		Eccentricity    0.966123
		Inclination     -95.3501
		AscendingNode   -89.2029
		ArgOfPericenter 107.859
		MeanAnomaly     98.0124
	}
}

Comet	"Crait System C38"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            8.94897e-018
	Radius          0.0279897
	InertiaMoment   0.397955

	Oblateness      0.00298209

	RotationPeriod  88.2538
	Obliquity       188.653
	EqAscendNode    94.1735

	AbsMagn         1.05517
	SlopeParam      7.14566
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.668 0.663 0.661)

	Surface
	{
		SurfStyle       0.171051
		OceanStyle      0.806138
		Randomize      (-0.121, -0.500, 0.690)
		colorDistMagn   0.542732
		colorDistFreq   2.35753e-007
		detailScale     0.764306
		colorConversion true
		snowLevel       2
		tropicLatitude  0.311354
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.520751
		terraceProb     0.197367
		erosion         0
		montesMagn      0.434524
		montesFreq      2.72953
		montesSpiky     0.879283
		montesFraction  0.370442
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.92354e-006
		hillsFraction   0.464451
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222119
		craterFreq      0.227084
		craterDensity   0.927841
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.563362
		volcanoTemp     1790.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.267, 0.265, 0.264, 0.000)
		colorShelf     (0.284, 0.282, 0.281, 0.000)
		colorBeach     (0.301, 0.298, 0.297, 0.000)
		colorDesert    (0.317, 0.315, 0.314, 0.000)
		colorLowland   (0.334, 0.332, 0.330, 0.000)
		colorUpland    (0.351, 0.348, 0.347, 0.000)
		colorRock      (0.367, 0.365, 0.363, 0.000)
		colorSnow      (0.384, 0.381, 0.380, 1.000)
		BumpHeight      0.0251907
		BumpOffset      0.00503815
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.415077
		DustBright  0.569054
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   15.3997
		Period          80.4022
		Eccentricity    0.995257
		Inclination     170.232
		AscendingNode   160.048
		ArgOfPericenter 26.0793
		MeanAnomaly     -162.322
	}
}

Comet	"Crait System C39"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            6.92139e-014
	Radius          0.604615
	InertiaMoment   0.399724

	Oblateness      0.00421397

	RotationPeriod  85.0351
	Obliquity       141.859
	EqAscendNode    78.7509

	AbsMagn         10.0512
	SlopeParam      2.40688
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.697 0.620 0.556)

	Surface
	{
		SurfStyle       0.770455
		OceanStyle      0.675452
		Randomize      (-0.306, -0.330, -0.731)
		colorDistMagn   0.722877
		colorDistFreq   0.000236468
		detailScale     16.51
		colorConversion true
		snowLevel       2
		tropicLatitude  0.811337
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.449198
		terraceProb     0.342004
		erosion         0
		montesMagn      0.561267
		montesFreq      2.3072
		montesSpiky     0.905005
		montesFraction  0.589688
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00133071
		hillsFraction   0.701195
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254212
		craterFreq      0.177683
		craterDensity   0.78557
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.515636
		volcanoTemp     1572.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.272, 0.211, 0.156, 0.000)
		colorShelf     (0.279, 0.217, 0.178, 0.000)
		colorBeach     (0.327, 0.254, 0.211, 0.000)
		colorDesert    (0.355, 0.273, 0.206, 0.000)
		colorLowland   (0.390, 0.291, 0.234, 0.000)
		colorUpland    (0.432, 0.353, 0.284, 0.000)
		colorRock      (0.467, 0.384, 0.306, 0.000)
		colorSnow      (0.509, 0.409, 0.323, 1.000)
		BumpHeight      0.544153
		BumpOffset      0.108831
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.237724
		GasToDust   0.25
		Particles   1460
		GasBright   0.321481
		DustBright  0.347136
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   13.4158
		Period          65.3771
		Eccentricity    0.959622
		Inclination     158.784
		AscendingNode   48.3269
		ArgOfPericenter 73.6031
		MeanAnomaly     -163.203
	}
}

Comet	"Crait System C40"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            5.3532e-010
	Radius          10.9376
	InertiaMoment   0.398567

	Oblateness      0.00344629

	RotationPeriod  82.0882
	Obliquity       95.0643
	EqAscendNode    63.3283

	AbsMagn         6.54696
	SlopeParam      3.09208
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.533 0.456 0.363)

	Surface
	{
		SurfStyle       0.895878
		OceanStyle      0.889095
		Randomize      (-0.501, 0.719, -0.523)
		colorDistMagn   0.448488
		colorDistFreq   0.044249
		detailScale     298.669
		colorConversion true
		snowLevel       2
		tropicLatitude  0.986141
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.741055
		terraceProb     0.145516
		erosion         0
		montesMagn      0.411166
		montesFreq      2.43191
		montesSpiky     0.967009
		montesFraction  0.123907
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.245797
		hillsFraction   0.633542
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238902
		craterFreq      0.17756
		craterDensity   1.04974
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.501548
		volcanoTemp     1599.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.181, 0.160, 0.145, 0.050)
		colorShelf     (0.213, 0.187, 0.167, 0.040)
		colorBeach     (0.245, 0.214, 0.189, 0.030)
		colorDesert    (0.277, 0.242, 0.214, 0.020)
		colorLowland   (0.309, 0.269, 0.236, 0.030)
		colorUpland    (0.341, 0.296, 0.258, 0.050)
		colorRock      (0.373, 0.324, 0.287, 0.020)
		colorSnow      (0.373, 0.324, 0.287, 1.000)
		BumpHeight      9.84383
		BumpOffset      1.96877
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.718916
		GasToDust   0.25
		Particles   2432
		GasBright   0.0140749
		DustBright  0.339029
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   8.31448
		Period          31.8973
		Eccentricity    0.940219
		Inclination     173.51
		AscendingNode   133.992
		ArgOfPericenter 88.6094
		MeanAnomaly     -81.9595
	}
}

Comet	"Crait System C41"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.64829e-017
	Radius          0.0374437
	InertiaMoment   0.396194

	Oblateness      0.00476286

	RotationPeriod  79.3537
	Obliquity       48.27
	EqAscendNode    47.9058

	AbsMagn         -0.177736
	SlopeParam      3.68287
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.578 0.490 0.411)

	Surface
	{
		SurfStyle       0.0579947
		OceanStyle      0.858334
		Randomize      (0.559, 0.985, 0.665)
		colorDistMagn   0.654216
		colorDistFreq   1.04823e-006
		detailScale     1.02246
		colorConversion true
		snowLevel       2
		tropicLatitude  0.336114
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.520617
		terraceProb     0.259174
		erosion         0
		montesMagn      0.482621
		montesFreq      3.60262
		montesSpiky     0.938956
		montesFraction  0.313366
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.25264e-006
		hillsFraction   0.764693
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237213
		craterFreq      0.21708
		craterDensity   1.06641
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.545231
		volcanoTemp     1358.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.231, 0.196, 0.164, 0.000)
		colorShelf     (0.245, 0.208, 0.174, 0.000)
		colorBeach     (0.260, 0.220, 0.185, 0.000)
		colorDesert    (0.274, 0.233, 0.195, 0.000)
		colorLowland   (0.289, 0.245, 0.205, 0.000)
		colorUpland    (0.303, 0.257, 0.216, 0.000)
		colorRock      (0.318, 0.269, 0.226, 0.000)
		colorSnow      (0.332, 0.282, 0.236, 1.000)
		BumpHeight      0.0336993
		BumpOffset      0.00673987
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0828426
		DustBright  0.754748
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   14.617
		Period          74.3512
		Eccentricity    0.970255
		Inclination     -65.9224
		AscendingNode   -10.3525
		ArgOfPericenter 177.543
		MeanAnomaly     -48.8611
	}
}

Comet	"Crait System C42"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.27483e-013
	Radius          0.677394
	InertiaMoment   0.399066

	Oblateness      0.00393592

	RotationPeriod  76.7891
	Obliquity       1.47568
	EqAscendNode    32.4832

	AbsMagn         9.81667
	SlopeParam      4.24669
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.485 0.479 0.476)

	Surface
	{
		SurfStyle       0.847005
		OceanStyle      0.26836
		Randomize      (0.912, 0.232, 0.752)
		colorDistMagn   0.496447
		colorDistFreq   0.000287058
		detailScale     18.4974
		colorConversion true
		snowLevel       2
		tropicLatitude  0.72376
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.411883
		terraceProb     0.11851
		erosion         0
		montesMagn      0.426051
		montesFreq      2.79673
		montesSpiky     0.977817
		montesFraction  0.273217
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000907732
		hillsFraction   0.714993
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239937
		craterFreq      0.146599
		craterDensity   0.934955
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.474353
		volcanoTemp     1317.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.189, 0.163, 0.133, 0.000)
		colorShelf     (0.194, 0.168, 0.152, 0.000)
		colorBeach     (0.228, 0.196, 0.181, 0.000)
		colorDesert    (0.247, 0.211, 0.176, 0.000)
		colorLowland   (0.271, 0.225, 0.200, 0.000)
		colorUpland    (0.300, 0.273, 0.243, 0.000)
		colorRock      (0.325, 0.297, 0.262, 0.000)
		colorSnow      (0.354, 0.316, 0.276, 1.000)
		BumpHeight      0.609654
		BumpOffset      0.121931
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.27055
		GasToDust   0.25
		Particles   1526
		GasBright   0.0824626
		DustBright  0.439614
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   15.7508
		Period          83.1679
		Eccentricity    0.972461
		Inclination     46.8734
		AscendingNode   -110.77
		ArgOfPericenter -134.064
		MeanAnomaly     97.331
	}
}

Comet	"Crait System C43"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            9.85991e-010
	Radius          14.6313
	InertiaMoment   0.397569

	Oblateness      0.00543749

	RotationPeriod  74.3629
	Obliquity       314.681
	EqAscendNode    17.0606

	AbsMagn         6.32168
	SlopeParam      4.83126
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.607 0.602 0.598)

	Surface
	{
		SurfStyle       0.854425
		OceanStyle      0.0646576
		Randomize      (-0.677, 0.859, -0.101)
		colorDistMagn   0.467266
		colorDistFreq   0.0340762
		detailScale     399.532
		colorConversion true
		snowLevel       2
		tropicLatitude  0.966376
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.405788
		terraceProb     0.208255
		erosion         0
		montesMagn      0.410719
		montesFreq      2.92609
		montesSpiky     0.919627
		montesFraction  0.436989
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.564318
		hillsFraction   0.509525
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.274321
		craterFreq      0.179978
		craterDensity   0.926154
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.45377
		volcanoTemp     1220.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.206, 0.211, 0.239, 0.050)
		colorShelf     (0.243, 0.247, 0.275, 0.040)
		colorBeach     (0.279, 0.283, 0.311, 0.030)
		colorDesert    (0.316, 0.319, 0.353, 0.020)
		colorLowland   (0.352, 0.355, 0.389, 0.030)
		colorUpland    (0.388, 0.391, 0.425, 0.050)
		colorRock      (0.425, 0.427, 0.473, 0.020)
		colorSnow      (0.425, 0.427, 0.473, 1.000)
		BumpHeight      13.1682
		BumpOffset      2.63363
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.751742
		GasToDust   0.25
		Particles   2498
		GasBright   0.0448235
		DustBright  0.16174
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   9.98419
		Period          41.973
		Eccentricity    0.954349
		Inclination     -48.4521
		AscendingNode   66.8461
		ArgOfPericenter 62.0843
		MeanAnomaly     0.878686
	}
}

Comet	"Crait System C44"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            3.03595e-017
	Radius          0.0419524
	InertiaMoment   0.399513

	Oblateness      0.00446684

	RotationPeriod  72.0509
	Obliquity       267.887
	EqAscendNode    1.63798

	AbsMagn         17.6517
	SlopeParam      5.4991
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.654 0.537 0.445)

	Surface
	{
		SurfStyle       0.422571
		OceanStyle      0.502975
		Randomize      (0.392, 0.083, -0.159)
		colorDistMagn   0.164682
		colorDistFreq   9.98597e-007
		detailScale     1.14558
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999518
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.67349
		terraceProb     0.343305
		erosion         0
		montesMagn      0.641638
		montesFreq      2.67546
		montesSpiky     0.99551
		montesFraction  0.824575
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.1953e-006
		hillsFraction   0.642674
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231555
		craterFreq      0.205097
		craterDensity   0.798618
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52185
		volcanoTemp     1505.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.261, 0.215, 0.178, 0.000)
		colorShelf     (0.278, 0.228, 0.189, 0.000)
		colorBeach     (0.294, 0.242, 0.200, 0.000)
		colorDesert    (0.310, 0.255, 0.212, 0.000)
		colorLowland   (0.327, 0.268, 0.223, 0.000)
		colorUpland    (0.343, 0.282, 0.234, 0.000)
		colorRock      (0.360, 0.295, 0.245, 0.000)
		colorSnow      (0.376, 0.309, 0.256, 1.000)
		BumpHeight      0.0377572
		BumpOffset      0.00755144
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.190759
		DustBright  0.500291
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   13.4658
		Period          65.743
		Eccentricity    0.96853
		Inclination     -0.524387
		AscendingNode   -129.506
		ArgOfPericenter -125.803
		MeanAnomaly     15.7782
	}
}

Comet	"Crait System C45"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            2.34808e-013
	Radius          0.906128
	InertiaMoment   0.398285

	Oblateness      0.00616624

	RotationPeriod  69.8342
	Obliquity       221.093
	EqAscendNode    346.215

	AbsMagn         9.58823
	SlopeParam      6.40395
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.806 0.706 0.672)

	Surface
	{
		SurfStyle       0.758496
		OceanStyle      0.489283
		Randomize      (0.313, 0.083, 0.500)
		colorDistMagn   0.650294
		colorDistFreq   0.000524721
		detailScale     24.7433
		colorConversion true
		snowLevel       2
		tropicLatitude  0.800875
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.287087
		terraceProb     0.289725
		erosion         0
		montesMagn      0.486473
		montesFreq      3.01417
		montesSpiky     0.820034
		montesFraction  0.683458
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00195721
		hillsFraction   0.642512
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229043
		craterFreq      0.237571
		craterDensity   0.826152
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.432843
		volcanoTemp     1491.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.314, 0.240, 0.188, 0.000)
		colorShelf     (0.322, 0.247, 0.215, 0.000)
		colorBeach     (0.379, 0.290, 0.255, 0.000)
		colorDesert    (0.411, 0.311, 0.249, 0.000)
		colorLowland   (0.451, 0.332, 0.282, 0.000)
		colorUpland    (0.500, 0.403, 0.343, 0.000)
		colorRock      (0.540, 0.438, 0.370, 0.000)
		colorSnow      (0.588, 0.466, 0.390, 1.000)
		BumpHeight      0.815515
		BumpOffset      0.163103
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.303376
		GasToDust   0.25
		Particles   1592
		GasBright   0.125837
		DustBright  0.249699
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   11.9731
		Period          55.1199
		Eccentricity    0.976878
		Inclination     -70.2467
		AscendingNode   -56.2006
		ArgOfPericenter -148.351
		MeanAnomaly     85.7925
	}
}

Comet	"Crait System C46"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.81607e-009
	Radius          16.3934
	InertiaMoment   0.399936

	Oblateness      0.00505501

	RotationPeriod  67.6974
	Obliquity       174.298
	EqAscendNode    330.793

	AbsMagn         6.09096
	SlopeParam      9.58624
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.620 0.569 0.503)

	Surface
	{
		SurfStyle       0.570488
		OceanStyle      0.63678
		Randomize      (-0.311, 0.179, 0.186)
		colorDistMagn   0.562736
		colorDistFreq   0.0934272
		detailScale     447.649
		colorConversion true
		snowLevel       2
		tropicLatitude  0.606537
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.727172
		terraceProb     0.151031
		erosion         0
		montesMagn      0.399227
		montesFreq      2.13571
		montesSpiky     0.987223
		montesFraction  0.638414
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.737039
		hillsFraction   0.529565
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261276
		craterFreq      0.205505
		craterDensity   0.774055
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.528842
		volcanoTemp     1734.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.242, 0.193, 0.141, 0.000)
		colorShelf     (0.248, 0.199, 0.161, 0.000)
		colorBeach     (0.291, 0.233, 0.191, 0.000)
		colorDesert    (0.316, 0.250, 0.186, 0.000)
		colorLowland   (0.347, 0.267, 0.211, 0.000)
		colorUpland    (0.384, 0.324, 0.256, 0.000)
		colorRock      (0.415, 0.353, 0.276, 0.000)
		colorSnow      (0.452, 0.375, 0.292, 1.000)
		BumpHeight      14.7541
		BumpOffset      2.95081
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.784568
		GasToDust   0.25
		Particles   2564
		GasBright   0.338963
		DustBright  0.52106
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   15.6566
		Period          82.4231
		Eccentricity    0.959868
		Inclination     138.363
		AscendingNode   -141.126
		ArgOfPericenter -89.0406
		MeanAnomaly     -94.0723
	}
}

Comet	"Crait System C47"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            5.59182e-017
	Radius          0.0561176
	InertiaMoment   0.398829

	Oblateness      0.00697841

	RotationPeriod  65.6278
	Obliquity       127.504
	EqAscendNode    315.37

	AbsMagn         15.5997
	SlopeParam      2.76299
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.808 0.785 0.742)

	Surface
	{
		SurfStyle       0.257937
		OceanStyle      0.599032
		Randomize      (-0.061, -0.164, -0.809)
		colorDistMagn   0.777541
		colorDistFreq   1.81191e-006
		detailScale     1.53238
		colorConversion true
		snowLevel       2
		tropicLatitude  0.814879
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.377285
		terraceProb     0.487201
		erosion         0
		montesMagn      0.651099
		montesFreq      2.21894
		montesSpiky     0.904298
		montesFraction  0.60195
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.89399e-006
		hillsFraction   0.510321
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252611
		craterFreq      0.231342
		craterDensity   1.00442
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.421276
		volcanoTemp     1437.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.323, 0.314, 0.297, 0.000)
		colorShelf     (0.343, 0.334, 0.316, 0.000)
		colorBeach     (0.363, 0.353, 0.334, 0.000)
		colorDesert    (0.384, 0.373, 0.353, 0.000)
		colorLowland   (0.404, 0.392, 0.371, 0.000)
		colorUpland    (0.424, 0.412, 0.390, 0.000)
		colorRock      (0.444, 0.432, 0.408, 0.000)
		colorSnow      (0.464, 0.451, 0.427, 1.000)
		BumpHeight      0.0505058
		BumpOffset      0.0101012
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.24676
		DustBright  0.29775
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   11.6681
		Period          53.0276
		Eccentricity    0.976026
		Inclination     -13.8782
		AscendingNode   -86.5607
		ArgOfPericenter 97.1242
		MeanAnomaly     123.481
	}
}

Comet	"Crait System C48"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            4.32487e-013
	Radius          1.01526
	InertiaMoment   0.39706

	Oblateness      0.00564869

	RotationPeriod  63.615
	Obliquity       80.7099
	EqAscendNode    299.948

	AbsMagn         9.36486
	SlopeParam      3.39008
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.755 0.752 0.751)

	Surface
	{
		SurfStyle       0.291614
		OceanStyle      0.789501
		Randomize      (0.837, -0.360, 0.686)
		colorDistMagn   0.481436
		colorDistFreq   0.000579704
		detailScale     27.7234
		colorConversion true
		snowLevel       2
		tropicLatitude  0.848373
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.628593
		terraceProb     0.415538
		erosion         0
		montesMagn      0.415644
		montesFreq      2.41207
		montesSpiky     0.902612
		montesFraction  0.642626
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00183065
		hillsFraction   0.64792
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.270656
		craterFreq      0.187141
		craterDensity   0.966707
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.606369
		volcanoTemp     1667.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.302, 0.301, 0.300, 0.000)
		colorShelf     (0.321, 0.320, 0.319, 0.000)
		colorBeach     (0.340, 0.339, 0.338, 0.000)
		colorDesert    (0.359, 0.357, 0.356, 0.000)
		colorLowland   (0.377, 0.376, 0.375, 0.000)
		colorUpland    (0.396, 0.395, 0.394, 0.000)
		colorRock      (0.415, 0.414, 0.413, 0.000)
		colorSnow      (0.434, 0.433, 0.432, 1.000)
		BumpHeight      0.913733
		BumpOffset      0.182747
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.336202
		GasToDust   0.25
		Particles   1658
		GasBright   0.00279894
		DustBright  0.226197
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   13.8265
		Period          68.4022
		Eccentricity    0.96411
		Inclination     81.0514
		AscendingNode   55.3332
		ArgOfPericenter -179.079
		MeanAnomaly     106.782
	}
}

Comet	"Crait System C49"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            3.34498e-009
	Radius          21.9287
	InertiaMoment   0.399297

	Oblateness      0.00790187

	RotationPeriod  61.6498
	Obliquity       33.9156
	EqAscendNode    284.525

	AbsMagn         5.85369
	SlopeParam      3.96127
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.623 0.618 0.617)

	Surface
	{
		SurfStyle       0.860407
		OceanStyle      0.701192
		Randomize      (-0.394, -0.943, -0.654)
		colorDistMagn   0.497835
		colorDistFreq   0.148924
		detailScale     598.798
		colorConversion true
		snowLevel       2
		tropicLatitude  0.80181
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.633313
		terraceProb     0.290595
		erosion         0
		montesMagn      0.470752
		montesFreq      3.07627
		montesSpiky     0.982052
		montesFraction  0.308401
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.993574
		hillsFraction   0.60914
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24581
		craterFreq      0.273778
		craterDensity   0.866358
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.489336
		volcanoTemp     1594.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.212, 0.216, 0.247, 0.050)
		colorShelf     (0.249, 0.254, 0.284, 0.040)
		colorBeach     (0.286, 0.291, 0.321, 0.030)
		colorDesert    (0.324, 0.328, 0.364, 0.020)
		colorLowland   (0.361, 0.365, 0.401, 0.030)
		colorUpland    (0.399, 0.402, 0.438, 0.050)
		colorRock      (0.436, 0.439, 0.487, 0.020)
		colorSnow      (0.436, 0.439, 0.487, 1.000)
		BumpHeight      19.7358
		BumpOffset      3.94716
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.817394
		GasToDust   0.25
		Particles   2631
		GasBright   0.0508484
		DustBright  0.662634
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   19.3232
		Period          113.011
		Eccentricity    0.970474
		Inclination     80.7792
		AscendingNode   147.519
		ArgOfPericenter -57.1808
		MeanAnomaly     139.76
	}
}

Comet	"Crait System C50"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.02994e-016
	Radius          0.0628755
	InertiaMoment   0.397964

	Oblateness      0.00641363

	RotationPeriod  59.7246
	Obliquity       347.121
	EqAscendNode    269.102

	AbsMagn         14.5977
	SlopeParam      4.52926
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.574 0.567 0.563)

	Surface
	{
		SurfStyle       0.525209
		OceanStyle      0.772153
		Randomize      (0.844, -0.779, -0.416)
		colorDistMagn   0.745226
		colorDistFreq   2.17335e-006
		detailScale     1.71692
		colorConversion true
		snowLevel       2
		tropicLatitude  0.615714
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.46838
		terraceProb     0.330941
		erosion         0
		montesMagn      0.424244
		montesFreq      2.71283
		montesSpiky     0.936256
		montesFraction  0.625463
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.33382e-006
		hillsFraction   0.737544
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23251
		craterFreq      0.203943
		craterDensity   1.03196
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.420651
		volcanoTemp     1565.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.224, 0.193, 0.158, 0.000)
		colorShelf     (0.230, 0.198, 0.180, 0.000)
		colorBeach     (0.270, 0.232, 0.214, 0.000)
		colorDesert    (0.293, 0.249, 0.208, 0.000)
		colorLowland   (0.322, 0.266, 0.236, 0.000)
		colorUpland    (0.356, 0.323, 0.287, 0.000)
		colorRock      (0.385, 0.351, 0.310, 0.000)
		colorSnow      (0.419, 0.374, 0.327, 1.000)
		BumpHeight      0.0565879
		BumpOffset      0.0113176
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0518607
		DustBright  0.346109
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   12.6529
		Period          59.8808
		Eccentricity    0.974915
		Inclination     -149.391
		AscendingNode   116.73
		ArgOfPericenter -75.8856
		MeanAnomaly     150.444
	}
}

Comet	"Crait System C51"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            7.96589e-013
	Radius          1.35809
	InertiaMoment   0.399729

	Oblateness      0.00897147

	RotationPeriod  57.8323
	Obliquity       300.327
	EqAscendNode    253.68

	AbsMagn         9.14567
	SlopeParam      5.14453
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.580 0.505 0.450)

	Surface
	{
		SurfStyle       0.026571
		OceanStyle      0.400757
		Randomize      (-0.278, 0.149, -0.323)
		colorDistMagn   0.542158
		colorDistFreq   0.000740609
		detailScale     37.0849
		colorConversion true
		snowLevel       2
		tropicLatitude  0.769487
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.42099
		terraceProb     0.117108
		erosion         0
		montesMagn      0.63012
		montesFreq      2.97153
		montesSpiky     0.864117
		montesFraction  0.383989
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00494069
		hillsFraction   0.702286
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.207974
		craterFreq      0.230344
		craterDensity   0.733974
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.411962
		volcanoTemp     1403.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.232, 0.202, 0.180, 0.000)
		colorShelf     (0.247, 0.214, 0.191, 0.000)
		colorBeach     (0.261, 0.227, 0.202, 0.000)
		colorDesert    (0.276, 0.240, 0.214, 0.000)
		colorLowland   (0.290, 0.252, 0.225, 0.000)
		colorUpland    (0.305, 0.265, 0.236, 0.000)
		colorRock      (0.319, 0.278, 0.247, 0.000)
		colorSnow      (0.334, 0.290, 0.259, 1.000)
		BumpHeight      1.22228
		BumpOffset      0.244456
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.369028
		GasToDust   0.25
		Particles   1725
		GasBright   0.1671
		DustBright  0.715356
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   9.54436
		Period          39.2302
		Eccentricity    0.964473
		Inclination     22.8772
		AscendingNode   58.8762
		ArgOfPericenter -4.08416
		MeanAnomaly     131.55
	}
}

Comet	"Crait System C52"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            6.16104e-009
	Radius          24.5686
	InertiaMoment   0.398573

	Oblateness      0.00730132

	RotationPeriod  55.9668
	Obliquity       253.533
	EqAscendNode    238.257

	AbsMagn         5.60862
	SlopeParam      5.89655
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.646 0.578 0.519)

	Surface
	{
		SurfStyle       0.363079
		OceanStyle      0.717578
		Randomize      (0.994, 0.323, -0.696)
		colorDistMagn   0.128074
		colorDistFreq   0.443984
		detailScale     670.888
		colorConversion true
		snowLevel       2
		tropicLatitude  0.951061
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.670253
		terraceProb     0.20102
		erosion         0
		montesMagn      0.405927
		montesFreq      2.34826
		montesSpiky     0.982208
		montesFraction  0.749883
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.8437
		hillsFraction   0.705567
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227645
		craterFreq      0.210993
		craterDensity   0.778228
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.551976
		volcanoTemp     1342.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.259, 0.231, 0.208, 0.000)
		colorShelf     (0.275, 0.246, 0.221, 0.000)
		colorBeach     (0.291, 0.260, 0.234, 0.000)
		colorDesert    (0.307, 0.275, 0.247, 0.000)
		colorLowland   (0.323, 0.289, 0.260, 0.000)
		colorUpland    (0.339, 0.303, 0.273, 0.000)
		colorRock      (0.356, 0.318, 0.286, 0.000)
		colorSnow      (0.372, 0.332, 0.299, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.85022
		GasToDust   0.25
		Particles   2697
		GasBright   0.140831
		DustBright  0.426112
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   18.5404
		Period          106.213
		Eccentricity    0.988327
		Inclination     -106.772
		AscendingNode   104.327
		ArgOfPericenter 26.6095
		MeanAnomaly     -58.7485
	}
}

Comet	"Crait System C53"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.89702e-016
	Radius          0.0841097
	InertiaMoment   0.396226

	Oblateness      0.0100846

	RotationPeriod  54.1225
	Obliquity       206.738
	EqAscendNode    222.835

	AbsMagn         13.8931
	SlopeParam      7.11935
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.605 0.561 0.490)

	Surface
	{
		SurfStyle       0.603209
		OceanStyle      0.956315
		Randomize      (-0.418, -0.263, 0.623)
		colorDistMagn   0.104294
		colorDistFreq   4.22534e-006
		detailScale     2.29676
		colorConversion true
		snowLevel       2
		tropicLatitude  0.825956
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.559073
		terraceProb     0.229084
		erosion         0
		montesMagn      0.536155
		montesFreq      3.70009
		montesSpiky     0.968128
		montesFraction  0.350628
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.84919e-005
		hillsFraction   0.518021
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234524
		craterFreq      0.15988
		craterDensity   0.905284
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.469102
		volcanoTemp     1564.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.236, 0.191, 0.137, 0.000)
		colorShelf     (0.242, 0.196, 0.157, 0.000)
		colorBeach     (0.284, 0.230, 0.186, 0.000)
		colorDesert    (0.308, 0.247, 0.181, 0.000)
		colorLowland   (0.339, 0.264, 0.206, 0.000)
		colorUpland    (0.375, 0.320, 0.250, 0.000)
		colorRock      (0.405, 0.348, 0.269, 0.000)
		colorSnow      (0.441, 0.370, 0.284, 1.000)
		BumpHeight      0.0756987
		BumpOffset      0.0151397
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0773016
		DustBright  0.174128
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   11.7594
		Period          53.6513
		Eccentricity    0.974355
		Inclination     39.4215
		AscendingNode   -63.7965
		ArgOfPericenter 178.423
		MeanAnomaly     -137.729
	}
}

Comet	"Crait System C54"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.46721e-012
	Radius          1.52151
	InertiaMoment   0.399072

	Oblateness      0.0083563

	RotationPeriod  52.2941
	Obliquity       159.944
	EqAscendNode    207.412

	AbsMagn         8.92987
	SlopeParam      2.39626
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.693 0.543 0.474)

	Surface
	{
		SurfStyle       0.9187
		OceanStyle      0.155478
		Randomize      (-0.887, -0.093, 0.283)
		colorDistMagn   0.354853
		colorDistFreq   0.000958372
		detailScale     41.5475
		colorConversion true
		snowLevel       2
		tropicLatitude  0.730649
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.465468
		terraceProb     0.387793
		erosion         0
		montesMagn      0.458774
		montesFreq      3.0127
		montesSpiky     0.84323
		montesFraction  0.557369
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00607659
		hillsFraction   0.623349
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241821
		craterFreq      0.196663
		craterDensity   0.832728
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.535964
		volcanoTemp     1201.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.236, 0.190, 0.190, 0.050)
		colorShelf     (0.277, 0.223, 0.218, 0.040)
		colorBeach     (0.319, 0.255, 0.246, 0.030)
		colorDesert    (0.360, 0.288, 0.280, 0.020)
		colorLowland   (0.402, 0.320, 0.308, 0.030)
		colorUpland    (0.443, 0.353, 0.336, 0.050)
		colorRock      (0.485, 0.386, 0.374, 0.020)
		colorSnow      (0.485, 0.386, 0.374, 1.000)
		BumpHeight      1.36936
		BumpOffset      0.273872
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.401853
		GasToDust   0.25
		Particles   1791
		GasBright   0.269709
		DustBright  0.466207
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   8.91037
		Period          35.3871
		Eccentricity    0.954482
		Inclination     -141.691
		AscendingNode   104.809
		ArgOfPericenter -106.283
		MeanAnomaly     147.425
	}
}

Comet	"Crait System C55"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.13479e-008
	Radius          32.8676
	InertiaMoment   0.397579

	Oblateness      0.0116242

	RotationPeriod  50.4767
	Obliquity       113.15
	EqAscendNode    191.99

	AbsMagn         5.35422
	SlopeParam      3.08352
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.593 0.591 0.588)

	Surface
	{
		SurfStyle       0.923925
		OceanStyle      0.150898
		Randomize      (-0.517, 0.453, -0.040)
		colorDistMagn   0.892467
		colorDistFreq   0.567842
		detailScale     897.504
		colorConversion true
		snowLevel       2
		tropicLatitude  0.181691
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.754312
		terraceProb     0.222686
		erosion         0
		montesMagn      0.672654
		montesFreq      2.17948
		montesSpiky     0.951323
		montesFraction  0.275717
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.90616
		hillsFraction   0.657837
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22465
		craterFreq      0.178564
		craterDensity   0.951331
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.414045
		volcanoTemp     1601.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.202, 0.207, 0.235, 0.050)
		colorShelf     (0.237, 0.242, 0.270, 0.040)
		colorBeach     (0.273, 0.278, 0.306, 0.030)
		colorDesert    (0.308, 0.313, 0.347, 0.020)
		colorLowland   (0.344, 0.349, 0.382, 0.030)
		colorUpland    (0.379, 0.384, 0.417, 0.050)
		colorRock      (0.415, 0.420, 0.464, 0.020)
		colorSnow      (0.415, 0.420, 0.464, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.883046
		GasToDust   0.25
		Particles   2763
		GasBright   0.178898
		DustBright  0.241505
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   7.97242
		Period          29.9493
		Eccentricity    0.964408
		Inclination     106.6
		AscendingNode   171.309
		ArgOfPericenter 121.629
		MeanAnomaly     29.7287
	}
}

Comet	"Crait System C56"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            3.49408e-016
	Radius          0.094225
	InertiaMoment   0.399518

	Oblateness      0.00963901

	RotationPeriod  48.6657
	Obliquity       66.3555
	EqAscendNode    176.567

	AbsMagn         13.3349
	SlopeParam      3.67506
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.548 0.446 0.405)

	Surface
	{
		SurfStyle       0.190325
		OceanStyle      0.626261
		Randomize      (-0.070, -0.052, 0.872)
		colorDistMagn   0.082303
		colorDistFreq   4.82611e-006
		detailScale     2.57297
		colorConversion true
		snowLevel       2
		tropicLatitude  0.596887
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.754118
		terraceProb     0.104712
		erosion         0
		montesMagn      0.448077
		montesFreq      3.94073
		montesSpiky     0.972167
		montesFraction  0.226599
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.05375e-005
		hillsFraction   0.602681
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220694
		craterFreq      0.210581
		craterDensity   0.876567
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.552609
		volcanoTemp     1276.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.219, 0.178, 0.162, 0.000)
		colorShelf     (0.233, 0.189, 0.172, 0.000)
		colorBeach     (0.247, 0.200, 0.182, 0.000)
		colorDesert    (0.260, 0.212, 0.192, 0.000)
		colorLowland   (0.274, 0.223, 0.202, 0.000)
		colorUpland    (0.288, 0.234, 0.213, 0.000)
		colorRock      (0.301, 0.245, 0.223, 0.000)
		colorSnow      (0.315, 0.256, 0.233, 1.000)
		BumpHeight      0.0848025
		BumpOffset      0.0169605
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.438495
		DustBright  0.466394
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   7.95588
		Period          29.8561
		Eccentricity    0.958339
		Inclination     101.036
		AscendingNode   -36.1993
		ArgOfPericenter 105.692
		MeanAnomaly     5.20415
	}
}

Comet	"Crait System C57"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            2.70242e-012
	Radius          2.0356
	InertiaMoment   0.398292

	Oblateness      0.0134928

	RotationPeriod  46.8563
	Obliquity       19.5612
	EqAscendNode    161.144

	AbsMagn         8.71675
	SlopeParam      4.23892
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.665 0.467 0.394)

	Surface
	{
		SurfStyle       0.691383
		OceanStyle      0.0958935
		Randomize      (-0.871, 0.805, 0.011)
		colorDistMagn   0.771073
		colorDistFreq   0.00221481
		detailScale     55.5854
		colorConversion true
		snowLevel       2
		tropicLatitude  0.360653
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.578716
		terraceProb     0.209595
		erosion         0
		montesMagn      0.410443
		montesFreq      1.94384
		montesSpiky     0.951762
		montesFraction  0.576985
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00788481
		hillsFraction   0.434074
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245516
		craterFreq      0.198634
		craterDensity   0.953962
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.416066
		volcanoTemp     1087.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.259, 0.159, 0.110, 0.000)
		colorShelf     (0.266, 0.163, 0.126, 0.000)
		colorBeach     (0.313, 0.191, 0.150, 0.000)
		colorDesert    (0.339, 0.205, 0.146, 0.000)
		colorLowland   (0.372, 0.219, 0.165, 0.000)
		colorUpland    (0.412, 0.266, 0.201, 0.000)
		colorRock      (0.446, 0.290, 0.217, 0.000)
		colorSnow      (0.486, 0.308, 0.228, 1.000)
		BumpHeight      1.83204
		BumpOffset      0.366407
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.434679
		GasToDust   0.25
		Particles   1857
		GasBright   0.0257144
		DustBright  0.563661
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   15.5597
		Period          81.659
		Eccentricity    0.964906
		Inclination     -156.389
		AscendingNode   -121.114
		ArgOfPericenter -56.9449
		MeanAnomaly     126.505
	}
}

Comet	"Crait System C58"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            2.09013e-008
	Radius          36.8173
	InertiaMoment   0.399942

	Oblateness      0.0112385

	RotationPeriod  45.044
	Obliquity       332.767
	EqAscendNode    145.722

	AbsMagn         5.08863
	SlopeParam      4.82286
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.734 0.642 0.577)

	Surface
	{
		SurfStyle       0.715044
		OceanStyle      0.3822
		Randomize      (-0.201, -0.232, 0.810)
		colorDistMagn   0.0543162
		colorDistFreq   0.800988
		detailScale     1005.36
		colorConversion true
		snowLevel       2
		tropicLatitude  0.284872
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.503658
		terraceProb     0.137382
		erosion         0
		montesMagn      0.62985
		montesFreq      3.64283
		montesSpiky     0.930214
		montesFraction  0.65742
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.8549
		hillsFraction   0.50424
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218654
		craterFreq      0.196494
		craterDensity   0.86359
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.431375
		volcanoTemp     1790.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.286, 0.218, 0.162, 0.000)
		colorShelf     (0.294, 0.225, 0.185, 0.000)
		colorBeach     (0.345, 0.263, 0.219, 0.000)
		colorDesert    (0.374, 0.283, 0.213, 0.000)
		colorLowland   (0.411, 0.302, 0.242, 0.000)
		colorUpland    (0.455, 0.366, 0.294, 0.000)
		colorRock      (0.492, 0.398, 0.317, 0.000)
		colorSnow      (0.536, 0.424, 0.335, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.915872
		GasToDust   0.25
		Particles   2830
		GasBright   0.0281188
		DustBright  0.245743
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   13.4906
		Period          65.9248
		Eccentricity    0.975344
		Inclination     147.452
		AscendingNode   -148.121
		ArgOfPericenter 55.9347
		MeanAnomaly     95.4884
	}
}

Comet	"Crait System C59"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            6.43568e-016
	Radius          0.126072
	InertiaMoment   0.398835

	Oblateness      0.0158492

	RotationPeriod  43.2242
	Obliquity       285.973
	EqAscendNode    130.299

	AbsMagn         12.8648
	SlopeParam      5.4889
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.682 0.680 0.676)

	Surface
	{
		SurfStyle       0.740276
		OceanStyle      0.695675
		Randomize      (0.834, -0.832, -0.925)
		colorDistMagn   0.615162
		colorDistFreq   8.69956e-006
		detailScale     3.4426
		colorConversion true
		snowLevel       2
		tropicLatitude  0.772606
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.521531
		terraceProb     0.211816
		erosion         0
		montesMagn      0.672242
		montesFreq      2.92568
		montesSpiky     0.820072
		montesFraction  0.543712
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.14533e-005
		hillsFraction   0.782184
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251902
		craterFreq      0.238188
		craterDensity   0.810452
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.500085
		volcanoTemp     1832.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.266, 0.231, 0.189, 0.000)
		colorShelf     (0.273, 0.238, 0.216, 0.000)
		colorBeach     (0.321, 0.279, 0.257, 0.000)
		colorDesert    (0.348, 0.299, 0.250, 0.000)
		colorLowland   (0.382, 0.320, 0.284, 0.000)
		colorUpland    (0.423, 0.388, 0.345, 0.000)
		colorRock      (0.457, 0.422, 0.372, 0.000)
		colorSnow      (0.498, 0.449, 0.392, 1.000)
		BumpHeight      0.113465
		BumpOffset      0.0226929
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.12264
		DustBright  0.635708
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   11.1121
		Period          49.2826
		Eccentricity    0.96057
		Inclination     48.9899
		AscendingNode   -51.2264
		ArgOfPericenter -34.0907
		MeanAnomaly     -167.147
	}
}

Comet	"Crait System C60"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            4.97753e-012
	Radius          2.27999
	InertiaMoment   0.397076

	Oblateness      0.0131305

	RotationPeriod  41.3921
	Obliquity       239.178
	EqAscendNode    114.877

	AbsMagn         8.50564
	SlopeParam      6.38813
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.729 0.724 0.722)

	Surface
	{
		SurfStyle       0.0266513
		OceanStyle      0.0299961
		Randomize      (-0.369, -0.901, 0.831)
		colorDistMagn   0.416154
		colorDistFreq   0.00461624
		detailScale     62.2588
		colorConversion true
		snowLevel       2
		tropicLatitude  0.60771
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.53408
		terraceProb     0.125253
		erosion         0
		montesMagn      0.522716
		montesFreq      3.35691
		montesSpiky     0.816859
		montesFraction  0.458476
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00878384
		hillsFraction   0.814655
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249948
		craterFreq      0.208506
		craterDensity   0.788483
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.410134
		volcanoTemp     1412.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.292, 0.290, 0.289, 0.000)
		colorShelf     (0.310, 0.308, 0.307, 0.000)
		colorBeach     (0.328, 0.326, 0.325, 0.000)
		colorDesert    (0.346, 0.344, 0.343, 0.000)
		colorLowland   (0.365, 0.362, 0.361, 0.000)
		colorUpland    (0.383, 0.380, 0.379, 0.000)
		colorRock      (0.401, 0.398, 0.397, 0.000)
		colorSnow      (0.419, 0.416, 0.415, 1.000)
		BumpHeight      2.05199
		BumpOffset      0.410397
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.467505
		GasToDust   0.25
		Particles   1924
		GasBright   0.0977628
		DustBright  0.345072
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   12.9908
		Period          62.295
		Eccentricity    0.966205
		Inclination     -117.957
		AscendingNode   -136.91
		ArgOfPericenter -68.3019
		MeanAnomaly     12.9793
	}
}

Comet	"Crait System C61"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            3.84976e-008
	Radius          49.266
	InertiaMoment   0.399302

	Oblateness      0.018925

	RotationPeriod  39.5427
	Obliquity       192.384
	EqAscendNode    99.4539

	AbsMagn         4.80953
	SlopeParam      9.27935
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.728 0.724 0.721)

	Surface
	{
		SurfStyle       0.867226
		OceanStyle      0.130499
		Randomize      (0.894, 0.047, -0.117)
		colorDistMagn   0.46091
		colorDistFreq   1.7336
		detailScale     1345.29
		colorConversion true
		snowLevel       2
		tropicLatitude  0.878517
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.440072
		terraceProb     0.413031
		erosion         0
		montesMagn      0.472538
		montesFreq      3.12333
		montesSpiky     0.887671
		montesFraction  0.696182
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.84563
		hillsFraction   0.425162
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242735
		craterFreq      0.178604
		craterDensity   0.875809
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.526982
		volcanoTemp     1582.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.247, 0.253, 0.288, 0.050)
		colorShelf     (0.291, 0.297, 0.332, 0.040)
		colorBeach     (0.335, 0.340, 0.375, 0.030)
		colorDesert    (0.379, 0.384, 0.425, 0.020)
		colorLowland   (0.422, 0.427, 0.469, 0.030)
		colorUpland    (0.466, 0.471, 0.512, 0.050)
		colorRock      (0.510, 0.514, 0.570, 0.020)
		colorSnow      (0.510, 0.514, 0.570, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.948697
		GasToDust   0.25
		Particles   2896
		GasBright   0.259475
		DustBright  0.667847
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   11.4292
		Period          51.4075
		Eccentricity    0.971113
		Inclination     119.441
		AscendingNode   90.729
		ArgOfPericenter 101.038
		MeanAnomaly     -17.9168
	}
}

Comet	"Crait System C62"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.18537e-015
	Radius          0.141191
	InertiaMoment   0.397973

	Oblateness      0.0158619

	RotationPeriod  37.6707
	Obliquity       145.59
	EqAscendNode    84.0314

	AbsMagn         12.4537
	SlopeParam      2.75364
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.425 0.422 0.418)

	Surface
	{
		SurfStyle       0.716232
		OceanStyle      0.688635
		Randomize      (-0.970, -0.200, 0.687)
		colorDistMagn   0.694881
		colorDistFreq   1.3641e-005
		detailScale     3.85545
		colorConversion true
		snowLevel       2
		tropicLatitude  0.736753
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.506977
		terraceProb     0.221861
		erosion         0
		montesMagn      0.536852
		montesFreq      1.49889
		montesSpiky     0.992723
		montesFraction  0.374125
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.98487e-005
		hillsFraction   0.782252
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256772
		craterFreq      0.219207
		craterDensity   0.945361
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.620645
		volcanoTemp     1415.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.166, 0.144, 0.117, 0.000)
		colorShelf     (0.170, 0.148, 0.134, 0.000)
		colorBeach     (0.200, 0.173, 0.159, 0.000)
		colorDesert    (0.217, 0.186, 0.155, 0.000)
		colorLowland   (0.238, 0.198, 0.175, 0.000)
		colorUpland    (0.264, 0.241, 0.213, 0.000)
		colorRock      (0.285, 0.262, 0.230, 0.000)
		colorSnow      (0.311, 0.279, 0.242, 1.000)
		BumpHeight      0.127072
		BumpOffset      0.0254143
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0191393
		GasToDust   0.25
		Particles   1018
		GasBright   0.207315
		DustBright  0.404493
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   11.8926
		Period          54.5653
		Eccentricity    0.955844
		Inclination     -142.188
		AscendingNode   85.9647
		ArgOfPericenter -162.713
		MeanAnomaly     -72.18
	}
}

Comet	"Crait System C63"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            9.16797e-012
	Radius          3.05126
	InertiaMoment   0.399734

	Oblateness      0.023109

	RotationPeriod  35.7703
	Obliquity       98.7954
	EqAscendNode    68.6088

	AbsMagn         8.29593
	SlopeParam      3.38199
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.617 0.613 0.607)

	Surface
	{
		SurfStyle       0.664707
		OceanStyle      0.977911
		Randomize      (0.357, 0.080, -0.140)
		colorDistMagn   0.384763
		colorDistFreq   0.00290476
		detailScale     83.3196
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998744
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.396574
		terraceProb     0.236656
		erosion         0
		montesMagn      0.601432
		montesFreq      3.20271
		montesSpiky     0.940993
		montesFraction  0.450942
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0205768
		hillsFraction   0.548553
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247189
		craterFreq      0.258119
		craterDensity   0.96332
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.509449
		volcanoTemp     1032.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.240, 0.208, 0.170, 0.000)
		colorShelf     (0.247, 0.214, 0.194, 0.000)
		colorBeach     (0.290, 0.251, 0.231, 0.000)
		colorDesert    (0.314, 0.270, 0.225, 0.000)
		colorLowland   (0.345, 0.288, 0.255, 0.000)
		colorUpland    (0.382, 0.349, 0.310, 0.000)
		colorRock      (0.413, 0.380, 0.334, 0.000)
		colorSnow      (0.450, 0.404, 0.352, 1.000)
		BumpHeight      2.74613
		BumpOffset      0.549226
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.500331
		GasToDust   0.25
		Particles   1990
		GasBright   0.117896
		DustBright  0.178399
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   8.48974
		Period          32.9111
		Eccentricity    0.940497
		Inclination     -8.83914
		AscendingNode   -48.3124
		ArgOfPericenter -28.6202
		MeanAnomaly     -141.544
	}
}

Comet	"Crait System C64"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            7.09077e-008
	Radius          55.1665
	InertiaMoment   0.39858

	Oblateness      0.0196508

	RotationPeriod  33.8352
	Obliquity       52.0011
	EqAscendNode    53.1862

	AbsMagn         4.51396
	SlopeParam      3.95355
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.409 0.407 0.404)

	Surface
	{
		SurfStyle       0.563395
		OceanStyle      0.432641
		Randomize      (-0.492, 0.326, -0.560)
		colorDistMagn   0.422857
		colorDistFreq   1.32856
		detailScale     1506.41
		colorConversion true
		snowLevel       2
		tropicLatitude  0.827844
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.649477
		terraceProb     0.137995
		erosion         0
		montesMagn      0.59383
		montesFreq      3.27998
		montesSpiky     0.98608
		montesFraction  0.0549413
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.98498
		hillsFraction   0.705801
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247367
		craterFreq      0.176599
		craterDensity   0.983476
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.490569
		volcanoTemp     1517.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.160, 0.138, 0.113, 0.000)
		colorShelf     (0.164, 0.142, 0.129, 0.000)
		colorBeach     (0.192, 0.167, 0.153, 0.000)
		colorDesert    (0.209, 0.179, 0.149, 0.000)
		colorLowland   (0.229, 0.191, 0.170, 0.000)
		colorUpland    (0.254, 0.232, 0.206, 0.000)
		colorRock      (0.274, 0.252, 0.222, 0.000)
		colorSnow      (0.299, 0.268, 0.234, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.981523
		GasToDust   0.25
		Particles   2962
		GasBright   0.356776
		DustBright  0.424006
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   9.01465
		Period          36.0101
		Eccentricity    0.978621
		Inclination     8.85808
		AscendingNode   67.0355
		ArgOfPericenter 19.7616
		MeanAnomaly     -80.2637
	}
}

Comet	"Crait System C65"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            2.1833e-015
	Radius          0.188979
	InertiaMoment   0.396257

	Oblateness      0.0286867

	RotationPeriod  31.8583
	Obliquity       5.20685
	EqAscendNode    37.7636

	AbsMagn         12.0849
	SlopeParam      4.52127
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.723 0.720 0.718)

	Surface
	{
		SurfStyle       0.773703
		OceanStyle      0.300887
		Randomize      (0.949, 0.846, 0.024)
		colorDistMagn   0.949606
		colorDistFreq   1.02792e-005
		detailScale     5.16038
		colorConversion true
		snowLevel       2
		tropicLatitude  0.780417
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.418283
		terraceProb     0.184414
		erosion         0
		montesMagn      0.461955
		montesFreq      3.06327
		montesSpiky     0.938391
		montesFraction  0.588771
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.89979e-005
		hillsFraction   0.64671
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234403
		craterFreq      0.222221
		craterDensity   0.736215
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.54085
		volcanoTemp     1463.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.282, 0.245, 0.201, 0.000)
		colorShelf     (0.289, 0.252, 0.230, 0.000)
		colorBeach     (0.340, 0.295, 0.273, 0.000)
		colorDesert    (0.369, 0.317, 0.266, 0.000)
		colorLowland   (0.405, 0.339, 0.301, 0.000)
		colorUpland    (0.448, 0.411, 0.366, 0.000)
		colorRock      (0.484, 0.447, 0.395, 0.000)
		colorSnow      (0.528, 0.475, 0.416, 1.000)
		BumpHeight      0.170081
		BumpOffset      0.0340162
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0519653
		GasToDust   0.25
		Particles   1084
		GasBright   0.00744056
		DustBright  0.457828
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   12.4717
		Period          58.5989
		Eccentricity    0.959923
		Inclination     123.67
		AscendingNode   -14.4692
		ArgOfPericenter 138.919
		MeanAnomaly     -172.427
	}
}

Comet	"Crait System C66"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.68863e-011
	Radius          3.41616
	InertiaMoment   0.399078

	Oblateness      0.025254

	RotationPeriod  29.8314
	Obliquity       318.413
	EqAscendNode    22.341

	AbsMagn         8.08703
	SlopeParam      5.13545
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.648 0.643 0.641)

	Surface
	{
		SurfStyle       0.570283
		OceanStyle      0.0262528
		Randomize      (0.325, 0.048, -0.618)
		colorDistMagn   0.121225
		colorDistFreq   0.0072715
		detailScale     93.284
		colorConversion true
		snowLevel       2
		tropicLatitude  0.731437
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.630473
		terraceProb     0.217369
		erosion         0
		montesMagn      0.635779
		montesFreq      3.33716
		montesSpiky     0.892017
		montesFraction  0.515665
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0287399
		hillsFraction   0.530006
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235688
		craterFreq      0.25809
		craterDensity   0.991102
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.468554
		volcanoTemp     1487.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.253, 0.219, 0.179, 0.000)
		colorShelf     (0.259, 0.225, 0.205, 0.000)
		colorBeach     (0.304, 0.264, 0.244, 0.000)
		colorDesert    (0.330, 0.283, 0.237, 0.000)
		colorLowland   (0.363, 0.302, 0.269, 0.000)
		colorUpland    (0.402, 0.367, 0.327, 0.000)
		colorRock      (0.434, 0.399, 0.352, 0.000)
		colorSnow      (0.473, 0.424, 0.372, 1.000)
		BumpHeight      3.07454
		BumpOffset      0.614909
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.533157
		GasToDust   0.25
		Particles   2056
		GasBright   0.071267
		DustBright  0.878488
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   9.96327
		Period          41.8411
		Eccentricity    0.961995
		Inclination     5.45481
		AscendingNode   -173.15
		ArgOfPericenter 37.1437
		MeanAnomaly     -35.3231
	}
}

Comet	"Crait System C67"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.30603e-007
	Radius          73.8497
	InertiaMoment   0.39759

	Oblateness      0.037922

	RotationPeriod  27.7451
	Obliquity       271.618
	EqAscendNode    6.91841

	AbsMagn         4.19801
	SlopeParam      5.88449
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.462 0.457 0.452)

	Surface
	{
		SurfStyle       0.736342
		OceanStyle      0.496815
		Randomize      (-0.333, -0.370, -0.510)
		colorDistMagn   0.326016
		colorDistFreq   2.11945
		detailScale     2016.59
		colorConversion true
		snowLevel       2
		tropicLatitude  0.995315
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.502577
		terraceProb     0.210716
		erosion         0
		montesMagn      0.424656
		montesFreq      2.99462
		montesSpiky     0.992169
		montesFraction  0.356406
		dunesFraction   0
		hillsMagn       0
		hillsFreq       13.8468
		hillsFraction   0.486637
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242752
		craterFreq      0.174255
		craterDensity   0.981445
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.56441
		volcanoTemp     1378.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.180, 0.155, 0.127, 0.000)
		colorShelf     (0.185, 0.160, 0.145, 0.000)
		colorBeach     (0.217, 0.187, 0.172, 0.000)
		colorDesert    (0.235, 0.201, 0.167, 0.000)
		colorLowland   (0.258, 0.215, 0.190, 0.000)
		colorUpland    (0.286, 0.260, 0.230, 0.000)
		colorRock      (0.309, 0.283, 0.249, 0.000)
		colorSnow      (0.337, 0.301, 0.262, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0850406
		DustBright  0.549201
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   12.7149
		Period          60.3213
		Eccentricity    0.9698
		Inclination     -113.859
		AscendingNode   -84.6481
		ArgOfPericenter 114.14
		MeanAnomaly     -60.7351
	}
}

Comet	"Crait System C68"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            4.02137e-015
	Radius          0.211541
	InertiaMoment   0.399524

	Oblateness      0.0342799

	RotationPeriod  25.5885
	Obliquity       224.824
	EqAscendNode    351.496

	AbsMagn         11.748
	SlopeParam      7.09358
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.796 0.794 0.792)

	Surface
	{
		SurfStyle       0.102599
		OceanStyle      0.290909
		Randomize      (-0.840, -0.172, -0.437)
		colorDistMagn   0.367084
		colorDistFreq   7.77495e-006
		detailScale     5.77648
		colorConversion true
		snowLevel       2
		tropicLatitude  0.715112
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.543145
		terraceProb     0.464543
		erosion         0
		montesMagn      0.482974
		montesFreq      3.80338
		montesSpiky     0.921505
		montesFraction  0.727996
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.6218e-005
		hillsFraction   0.761508
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217984
		craterFreq      0.235587
		craterDensity   0.788923
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48846
		volcanoTemp     1377.33
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.318, 0.318, 0.317, 0.000)
		colorShelf     (0.338, 0.337, 0.337, 0.000)
		colorBeach     (0.358, 0.357, 0.356, 0.000)
		colorDesert    (0.378, 0.377, 0.376, 0.000)
		colorLowland   (0.398, 0.397, 0.396, 0.000)
		colorUpland    (0.418, 0.417, 0.416, 0.000)
		colorRock      (0.438, 0.437, 0.436, 0.000)
		colorSnow      (0.458, 0.457, 0.455, 1.000)
		BumpHeight      0.190387
		BumpOffset      0.0380774
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0847913
		GasToDust   0.25
		Particles   1151
		GasBright   0.0615552
		DustBright  0.257173
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   14.8992
		Period          76.5147
		Eccentricity    0.979631
		Inclination     171.628
		AscendingNode   -91.5121
		ArgOfPericenter 109.116
		MeanAnomaly     -146.045
	}
}

Comet	"Crait System C69"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            3.11024e-011
	Radius          4.57391
	InertiaMoment   0.3983

	Oblateness      0.0535656

	RotationPeriod  23.3483
	Obliquity       178.03
	EqAscendNode    336.073

	AbsMagn         7.87837
	SlopeParam      2.38559
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.720 0.717 0.714)

	Surface
	{
		SurfStyle       0.747967
		OceanStyle      0.737478
		Randomize      (0.234, 0.978, -0.976)
		colorDistMagn   0.121502
		colorDistFreq   0.0137241
		detailScale     124.898
		colorConversion true
		snowLevel       2
		tropicLatitude  0.950124
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.344283
		terraceProb     0.281331
		erosion         0
		montesMagn      0.409815
		montesFreq      3.42453
		montesSpiky     0.927656
		montesFraction  0.673002
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0491421
		hillsFraction   0.511421
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241292
		craterFreq      0.201183
		craterDensity   0.763285
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.456892
		volcanoTemp     1503.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.281, 0.244, 0.200, 0.000)
		colorShelf     (0.288, 0.251, 0.228, 0.000)
		colorBeach     (0.338, 0.294, 0.271, 0.000)
		colorDesert    (0.367, 0.316, 0.264, 0.000)
		colorLowland   (0.403, 0.337, 0.300, 0.000)
		colorUpland    (0.446, 0.409, 0.364, 0.000)
		colorRock      (0.482, 0.445, 0.393, 0.000)
		colorSnow      (0.525, 0.473, 0.414, 1.000)
		BumpHeight      4.11652
		BumpOffset      0.823304
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.565983
		GasToDust   0.25
		Particles   2123
		GasBright   0.202549
		DustBright  0.600665
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   8.73393
		Period          34.3412
		Eccentricity    0.957115
		Inclination     106.222
		AscendingNode   -171.779
		ArgOfPericenter -12.0249
		MeanAnomaly     -97.0136
	}
}

Comet	"Crait System C70"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            2.40555e-007
	Radius          82.6502
	InertiaMoment   0.399947

	Oblateness      0.0507868

	RotationPeriod  21.0082
	Obliquity       131.235
	EqAscendNode    320.651

	AbsMagn         3.85635
	SlopeParam      3.07494
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.736 0.652 0.524)

	Surface
	{
		SurfStyle       0.534244
		OceanStyle      0.449433
		Randomize      (0.511, -0.326, 0.678)
		colorDistMagn   0.359929
		colorDistFreq   2.01618
		detailScale     2256.9
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998375
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.537474
		terraceProb     0.109429
		erosion         0
		montesMagn      0.541987
		montesFreq      2.19342
		montesSpiky     0.955242
		montesFraction  0.455534
		dunesFraction   0
		hillsMagn       0
		hillsFreq       12.4359
		hillsFraction   0.879921
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225927
		craterFreq      0.190533
		craterDensity   0.825533
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.493018
		volcanoTemp     1699.14
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.287, 0.222, 0.147, 0.000)
		colorShelf     (0.295, 0.228, 0.168, 0.000)
		colorBeach     (0.346, 0.267, 0.199, 0.000)
		colorDesert    (0.376, 0.287, 0.194, 0.000)
		colorLowland   (0.412, 0.306, 0.220, 0.000)
		colorUpland    (0.457, 0.371, 0.267, 0.000)
		colorRock      (0.493, 0.404, 0.288, 0.000)
		colorSnow      (0.538, 0.430, 0.304, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.151781
		DustBright  0.335919
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   15.0952
		Period          78.0298
		Eccentricity    0.979398
		Inclination     85.2345
		AscendingNode   98.5759
		ArgOfPericenter -29.7719
		MeanAnomaly     125.886
	}
}

Comet	"Crait System C71"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            7.40684e-015
	Radius          0.283288
	InertiaMoment   0.398841

	Oblateness      0.084852

	RotationPeriod  18.548
	Obliquity       84.4411
	EqAscendNode    305.228

	AbsMagn         11.4357
	SlopeParam      3.66724
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.777 0.660 0.612)

	Surface
	{
		SurfStyle       0.640304
		OceanStyle      0.749207
		Randomize      (-0.216, -0.801, -0.162)
		colorDistMagn   0.961437
		colorDistFreq   3.58402e-005
		detailScale     7.73564
		colorConversion true
		snowLevel       2
		tropicLatitude  0.906436
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.347122
		terraceProb     0.399841
		erosion         0
		montesMagn      0.616603
		montesFreq      2.99118
		montesSpiky     0.960611
		montesFraction  0.679069
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000265248
		hillsFraction   0.577051
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220333
		craterFreq      0.247321
		craterDensity   0.740174
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.538278
		volcanoTemp     1359.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.303, 0.224, 0.171, 0.000)
		colorShelf     (0.311, 0.231, 0.196, 0.000)
		colorBeach     (0.365, 0.271, 0.233, 0.000)
		colorDesert    (0.396, 0.290, 0.227, 0.000)
		colorLowland   (0.435, 0.310, 0.257, 0.000)
		colorUpland    (0.482, 0.376, 0.312, 0.000)
		colorRock      (0.521, 0.409, 0.337, 0.000)
		colorSnow      (0.567, 0.436, 0.355, 1.000)
		BumpHeight      0.254959
		BumpOffset      0.0509918
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.117617
		GasToDust   0.25
		Particles   1217
		GasBright   0.359966
		DustBright  0.612222
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   11.605
		Period          52.598
		Eccentricity    0.981276
		Inclination     61.3718
		AscendingNode   -57.5497
		ArgOfPericenter -73.7352
		MeanAnomaly     75.7028
	}
}

Comet	"Crait System C72"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            5.72866e-011
	Radius          5.11783
	InertiaMoment   0.397091

	Oblateness      0.0869918

	RotationPeriod  15.942
	Obliquity       37.6468
	EqAscendNode    289.805

	AbsMagn         7.66938
	SlopeParam      4.23115
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.761 0.631 0.581)

	Surface
	{
		SurfStyle       0.117377
		OceanStyle      0.517845
		Randomize      (-0.305, -0.736, -0.799)
		colorDistMagn   0.632947
		colorDistFreq   0.010938
		detailScale     139.751
		colorConversion true
		snowLevel       2
		tropicLatitude  0.986504
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.513289
		terraceProb     0.370248
		erosion         0
		montesMagn      0.611432
		montesFreq      3.16664
		montesSpiky     0.965749
		montesFraction  0.263848
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0853248
		hillsFraction   0.820947
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22805
		craterFreq      0.19325
		craterDensity   0.941173
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.547546
		volcanoTemp     1389.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.304, 0.252, 0.232, 0.000)
		colorShelf     (0.323, 0.268, 0.247, 0.000)
		colorBeach     (0.342, 0.284, 0.261, 0.000)
		colorDesert    (0.361, 0.300, 0.276, 0.000)
		colorLowland   (0.380, 0.316, 0.290, 0.000)
		colorUpland    (0.399, 0.331, 0.305, 0.000)
		colorRock      (0.418, 0.347, 0.319, 0.000)
		colorSnow      (0.437, 0.363, 0.334, 1.000)
		BumpHeight      4.60605
		BumpOffset      0.92121
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.598809
		GasToDust   0.25
		Particles   2189
		GasBright   0.281916
		DustBright  0.374758
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   9.25513
		Period          37.4606
		Eccentricity    0.952598
		Inclination     -99.4608
		AscendingNode   60.8043
		ArgOfPericenter -94.4027
		MeanAnomaly     49.9345
	}
}

Comet	"Crait System C73"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            4.43071e-007
	Radius          110.706
	InertiaMoment   0.399308

	Oblateness      0.168561

	RotationPeriod  13.156
	Obliquity       350.852
	EqAscendNode    274.383

	AbsMagn         3.48142
	SlopeParam      4.81447
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.700 0.698 0.695)

	Surface
	{
		SurfStyle       0.436166
		OceanStyle      0.296605
		Randomize      (0.461, 0.203, -0.734)
		colorDistMagn   0.954829
		colorDistFreq   5.15282
		detailScale     3023.01
		colorConversion true
		snowLevel       2
		tropicLatitude  0.97943
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.618984
		terraceProb     0.787266
		erosion         0
		montesMagn      0.583976
		montesFreq      2.9838
		montesSpiky     0.937309
		montesFraction  0.832965
		dunesFraction   0
		hillsMagn       0
		hillsFreq       35.2268
		hillsFraction   0.409549
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245834
		craterFreq      0.358263
		craterDensity   1.00478
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.441753
		volcanoTemp     1495.32
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.280, 0.279, 0.278, 0.000)
		colorShelf     (0.298, 0.297, 0.295, 0.000)
		colorBeach     (0.315, 0.314, 0.313, 0.000)
		colorDesert    (0.333, 0.332, 0.330, 0.000)
		colorLowland   (0.350, 0.349, 0.348, 0.000)
		colorUpland    (0.368, 0.367, 0.365, 0.000)
		colorRock      (0.385, 0.384, 0.382, 0.000)
		colorSnow      (0.403, 0.402, 0.400, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.166607
		DustBright  0.174553
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   10.6609
		Period          46.312
		Eccentricity    0.947061
		Inclination     72.6824
		AscendingNode   127.362
		ArgOfPericenter 46.7062
		MeanAnomaly     -137.717
	}
}

Comet	"Crait System C74"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.36425e-014
	Radius          0.316899
	InertiaMoment   0.397981

	Oblateness      0.214913

	RotationPeriod  10.144
	Obliquity       304.058
	EqAscendNode    258.96

	AbsMagn         11.1432
	SlopeParam      5.47874
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.784 0.783 0.781)

	Surface
	{
		SurfStyle       0.0701988
		OceanStyle      0.83232
		Randomize      (0.510, -0.568, -0.749)
		colorDistMagn   0.629189
		colorDistFreq   2.67367e-005
		detailScale     8.65345
		colorConversion true
		snowLevel       2
		tropicLatitude  0.962234
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.410868
		terraceProb     0.376174
		erosion         0
		montesMagn      0.576132
		montesFreq      2.79621
		montesSpiky     0.956873
		montesFraction  0.201748
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000215577
		hillsFraction   0.710254
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261091
		craterFreq      0.184839
		craterDensity   0.971827
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.520141
		volcanoTemp     1669.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.314, 0.313, 0.312, 0.000)
		colorShelf     (0.333, 0.333, 0.332, 0.000)
		colorBeach     (0.353, 0.352, 0.351, 0.000)
		colorDesert    (0.372, 0.372, 0.371, 0.000)
		colorLowland   (0.392, 0.391, 0.390, 0.000)
		colorUpland    (0.412, 0.411, 0.410, 0.000)
		colorRock      (0.431, 0.431, 0.429, 0.000)
		colorSnow      (0.451, 0.450, 0.449, 1.000)
		BumpHeight      0.285209
		BumpOffset      0.0570418
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.150443
		GasToDust   0.25
		Particles   1283
		GasBright   0.0391351
		DustBright  0.786512
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   14.8084
		Period          75.8164
		Eccentricity    0.979089
		Inclination     73.2942
		AscendingNode   81.9414
		ArgOfPericenter 9.1136
		MeanAnomaly     -136.654
	}
}

Comet	"Crait System C75"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.05515e-010
	Radius          6.8567
	InertiaMoment   0.399739

	Oblateness      0.249

	RotationPeriod  6.84048
	Obliquity       257.264
	EqAscendNode    243.538

	AbsMagn         7.45948
	SlopeParam      6.37247
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.609 0.607 0.604)

	Surface
	{
		SurfStyle       0.364028
		OceanStyle      0.355305
		Randomize      (0.724, 0.158, 0.806)
		colorDistMagn   0.563893
		colorDistFreq   0.00415499
		detailScale     187.234
		colorConversion true
		snowLevel       2
		tropicLatitude  0.991473
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.335012
		terraceProb     0.161692
		erosion         0
		montesMagn      0.442285
		montesFreq      3.34326
		montesSpiky     0.828163
		montesFraction  0.121652
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0984327
		hillsFraction   0.691259
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.277795
		craterFreq      0.172933
		craterDensity   0.847057
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.59808
		volcanoTemp     1514.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.243, 0.243, 0.242, 0.000)
		colorShelf     (0.259, 0.258, 0.257, 0.000)
		colorBeach     (0.274, 0.273, 0.272, 0.000)
		colorDesert    (0.289, 0.288, 0.287, 0.000)
		colorLowland   (0.304, 0.303, 0.302, 0.000)
		colorUpland    (0.320, 0.319, 0.317, 0.000)
		colorRock      (0.335, 0.334, 0.332, 0.000)
		colorSnow      (0.350, 0.349, 0.348, 1.000)
		BumpHeight      6.17103
		BumpOffset      1.23421
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.631635
		GasToDust   0.25
		Particles   2255
		GasBright   0.054301
		DustBright  0.455833
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   17.8293
		Period          100.162
		Eccentricity    0.972485
		Inclination     -18.7901
		AscendingNode   -104.451
		ArgOfPericenter -41.6926
		MeanAnomaly     8.38798
	}
}

Comet	"Crait System C76"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            3.24889e-018
	Radius          0.0196222
	InertiaMoment   0.398587

	Oblateness      0.249

	RotationPeriod  3.14833
	Obliquity       210.47
	EqAscendNode    228.115

	AbsMagn         3.06193
	SlopeParam      9.06181
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.687 0.628 0.589)

	Surface
	{
		SurfStyle       0.403096
		OceanStyle      0.166974
		Randomize      (0.377, -0.135, 0.803)
		colorDistMagn   0.746271
		colorDistFreq   3.37407e-007
		detailScale     0.535816
		colorConversion true
		snowLevel       2
		tropicLatitude  0.404593
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.591239
		terraceProb     0.208565
		erosion         0
		montesMagn      0.354153
		montesFreq      3.20653
		montesSpiky     0.925607
		montesFraction  0.805696
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.03951e-006
		hillsFraction   0.739985
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233308
		craterFreq      0.189757
		craterDensity   0.944491
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.564773
		volcanoTemp     1399.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.275, 0.251, 0.236, 0.000)
		colorShelf     (0.292, 0.267, 0.250, 0.000)
		colorBeach     (0.309, 0.283, 0.265, 0.000)
		colorDesert    (0.326, 0.299, 0.280, 0.000)
		colorLowland   (0.344, 0.314, 0.295, 0.000)
		colorUpland    (0.361, 0.330, 0.309, 0.000)
		colorRock      (0.378, 0.346, 0.324, 0.000)
		colorSnow      (0.395, 0.361, 0.339, 1.000)
		BumpHeight      0.01766
		BumpOffset      0.00353199
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.164599
		DustBright  0.830021
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   13.1538
		Period          63.4715
		Eccentricity    0.954508
		Inclination     -151.683
		AscendingNode   130.35
		ArgOfPericenter -175.858
		MeanAnomaly     60.2958
	}
}

Comet	"Crait System C77"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            2.51278e-014
	Radius          0.42468
	InertiaMoment   0.396287

	Oblateness      0.00183918

	RotationPeriod  124.947
	Obliquity       163.675
	EqAscendNode    212.693

	AbsMagn         10.8665
	SlopeParam      2.74425
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.638 0.560 0.493)

	Surface
	{
		SurfStyle       0.370161
		OceanStyle      0.401634
		Randomize      (-0.392, -0.281, 0.899)
		colorDistMagn   0.868092
		colorDistFreq   0.000144569
		detailScale     11.5966
		colorConversion true
		snowLevel       2
		tropicLatitude  0.445795
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.448193
		terraceProb     0.194874
		erosion         0
		montesMagn      0.510057
		montesFreq      3.61872
		montesSpiky     0.878208
		montesFraction  0.379803
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000370492
		hillsFraction   0.569269
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22297
		craterFreq      0.234315
		craterDensity   0.890852
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.449969
		volcanoTemp     1380.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.255, 0.224, 0.197, 0.000)
		colorShelf     (0.271, 0.238, 0.209, 0.000)
		colorBeach     (0.287, 0.252, 0.222, 0.000)
		colorDesert    (0.303, 0.266, 0.234, 0.000)
		colorLowland   (0.319, 0.280, 0.246, 0.000)
		colorUpland    (0.335, 0.294, 0.259, 0.000)
		colorRock      (0.351, 0.308, 0.271, 0.000)
		colorSnow      (0.367, 0.322, 0.283, 1.000)
		BumpHeight      0.382212
		BumpOffset      0.0764424
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.183269
		GasToDust   0.25
		Particles   1350
		GasBright   0.152483
		DustBright  0.526624
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   16.7126
		Period          90.9004
		Eccentricity    0.98897
		Inclination     -13.1982
		AscendingNode   -52.3516
		ArgOfPericenter 123.341
		MeanAnomaly     145.865
	}
}

Comet	"Crait System C78"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.94345e-010
	Radius          7.66593
	InertiaMoment   0.399084

	Oblateness      0.00173983

	RotationPeriod  112.618
	Obliquity       116.881
	EqAscendNode    197.27

	AbsMagn         7.24808
	SlopeParam      3.37389
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.446 0.443 0.439)

	Surface
	{
		SurfStyle       0.602407
		OceanStyle      0.180412
		Randomize      (-0.958, 0.944, 0.737)
		colorDistMagn   0.736613
		colorDistFreq   0.0277316
		detailScale     209.331
		colorConversion true
		snowLevel       2
		tropicLatitude  0.966306
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.650953
		terraceProb     0.240308
		erosion         0
		montesMagn      0.506231
		montesFreq      3.37508
		montesSpiky     0.872106
		montesFraction  0.244406
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.175759
		hillsFraction   0.704584
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241607
		craterFreq      0.163947
		craterDensity   0.94374
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.503565
		volcanoTemp     1621.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.174, 0.151, 0.123, 0.000)
		colorShelf     (0.179, 0.155, 0.140, 0.000)
		colorBeach     (0.210, 0.182, 0.167, 0.000)
		colorDesert    (0.228, 0.195, 0.162, 0.000)
		colorLowland   (0.250, 0.208, 0.184, 0.000)
		colorUpland    (0.277, 0.253, 0.224, 0.000)
		colorRock      (0.299, 0.275, 0.241, 0.000)
		colorSnow      (0.326, 0.292, 0.255, 1.000)
		BumpHeight      6.89934
		BumpOffset      1.37987
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.664461
		GasToDust   0.25
		Particles   2322
		GasBright   0.103108
		DustBright  0.260486
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   14.0448
		Period          70.0284
		Eccentricity    0.968742
		Inclination     -90.4338
		AscendingNode   107.003
		ArgOfPericenter 166.726
		MeanAnomaly     -106.476
	}
}

Comet	"Crait System C79"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            5.98402e-018
	Radius          0.0263033
	InertiaMoment   0.397601

	Oblateness      0.00260662

	RotationPeriod  105.093
	Obliquity       70.0867
	EqAscendNode    181.847

	AbsMagn         2.57969
	SlopeParam      3.94583
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.708 0.706 0.703)

	Surface
	{
		SurfStyle       0.479547
		OceanStyle      0.822219
		Randomize      (-0.304, -0.034, 0.303)
		colorDistMagn   0.850752
		colorDistFreq   2.51024e-007
		detailScale     0.718255
		colorConversion true
		snowLevel       2
		tropicLatitude  0.723605
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.702746
		terraceProb     0.422452
		erosion         0
		montesMagn      0.527576
		montesFreq      2.67515
		montesSpiky     0.961945
		montesFraction  0.881683
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.38785e-006
		hillsFraction   0.550801
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255474
		craterFreq      0.235144
		craterDensity   0.883284
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.510182
		volcanoTemp     1112.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.283, 0.282, 0.281, 0.000)
		colorShelf     (0.301, 0.300, 0.299, 0.000)
		colorBeach     (0.319, 0.318, 0.316, 0.000)
		colorDesert    (0.336, 0.335, 0.334, 0.000)
		colorLowland   (0.354, 0.353, 0.351, 0.000)
		colorUpland    (0.372, 0.370, 0.369, 0.000)
		colorRock      (0.389, 0.388, 0.386, 0.000)
		colorSnow      (0.407, 0.406, 0.404, 1.000)
		BumpHeight      0.0236729
		BumpOffset      0.00473459
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.290574
		DustBright  0.557506
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   18.1224
		Period          102.642
		Eccentricity    0.989998
		Inclination     -110.575
		AscendingNode   -130.402
		ArgOfPericenter 1.79649
		MeanAnomaly     -129.366
	}
}

Comet	"Crait System C80"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            4.62821e-014
	Radius          0.47465
	InertiaMoment   0.399529

	Oblateness      0.00222698

	RotationPeriod  99.4627
	Obliquity       23.2924
	EqAscendNode    166.425

	AbsMagn         10.6029
	SlopeParam      4.51329
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.438 0.433 0.426)

	Surface
	{
		SurfStyle       0.272508
		OceanStyle      0.187725
		Randomize      (-0.113, -0.518, -0.093)
		colorDistMagn   0.0100381
		colorDistFreq   8.17279e-005
		detailScale     12.9611
		colorConversion true
		snowLevel       2
		tropicLatitude  0.234488
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.332736
		terraceProb     0.473682
		erosion         0
		montesMagn      0.631825
		montesFreq      2.52631
		montesSpiky     0.976194
		montesFraction  0.410977
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000734927
		hillsFraction   0.474855
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224391
		craterFreq      0.25836
		craterDensity   1.0096
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.476787
		volcanoTemp     1403.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.175, 0.173, 0.170, 0.000)
		colorShelf     (0.186, 0.184, 0.181, 0.000)
		colorBeach     (0.197, 0.195, 0.192, 0.000)
		colorDesert    (0.208, 0.205, 0.202, 0.000)
		colorLowland   (0.219, 0.216, 0.213, 0.000)
		colorUpland    (0.230, 0.227, 0.224, 0.000)
		colorRock      (0.241, 0.238, 0.234, 0.000)
		colorSnow      (0.252, 0.249, 0.245, 1.000)
		BumpHeight      0.427185
		BumpOffset      0.085437
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.216095
		GasToDust   0.25
		Particles   1416
		GasBright   0.213916
		DustBright  0.31865
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   14.4378
		Period          72.9878
		Eccentricity    0.96257
		Inclination     -167.276
		AscendingNode   -151.001
		ArgOfPericenter -68.7108
		MeanAnomaly     128.479
	}
}

Comet	"Crait System C81"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            3.57959e-010
	Radius          10.2792
	InertiaMoment   0.398307

	Oblateness      0.00319997

	RotationPeriod  94.8683
	Obliquity       336.498
	EqAscendNode    151.002

	AbsMagn         7.03456
	SlopeParam      5.1264
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.733 0.730 0.726)

	Surface
	{
		SurfStyle       0.896791
		OceanStyle      0.967104
		Randomize      (0.685, 0.974, 0.722)
		colorDistMagn   0.76591
		colorDistFreq   0.0712158
		detailScale     280.691
		colorConversion true
		snowLevel       2
		tropicLatitude  0.541073
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.532603
		terraceProb     0.354141
		erosion         0
		montesMagn      0.349392
		montesFreq      3.65426
		montesSpiky     0.995357
		montesFraction  0.473491
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.211825
		hillsFraction   0.698336
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229554
		craterFreq      0.249204
		craterDensity   0.83197
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.486135
		volcanoTemp     1655.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.249, 0.255, 0.291, 0.050)
		colorShelf     (0.293, 0.299, 0.334, 0.040)
		colorBeach     (0.337, 0.343, 0.378, 0.030)
		colorDesert    (0.381, 0.387, 0.429, 0.020)
		colorLowland   (0.425, 0.430, 0.472, 0.030)
		colorUpland    (0.469, 0.474, 0.516, 0.050)
		colorRock      (0.513, 0.518, 0.574, 0.020)
		colorSnow      (0.513, 0.518, 0.574, 1.000)
		BumpHeight      9.2513
		BumpOffset      1.85026
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.697287
		GasToDust   0.25
		Particles   2388
		GasBright   0.0999999
		DustBright  0.117053
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   11.2092
		Period          49.9303
		Eccentricity    0.97167
		Inclination     -27.005
		AscendingNode   -97.5902
		ArgOfPericenter 178.334
		MeanAnomaly     113.082
	}
}

Comet	"Crait System C82"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.10218e-017
	Radius          0.0293882
	InertiaMoment   0.399952

	Oblateness      0.00265983

	RotationPeriod  90.9315
	Obliquity       289.704
	EqAscendNode    135.58

	AbsMagn         2.0025
	SlopeParam      5.87249
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.489 0.484 0.480)

	Surface
	{
		SurfStyle       0.0137047
		OceanStyle      0.0524937
		Randomize      (-0.237, -0.305, -0.943)
		colorDistMagn   0.634601
		colorDistFreq   4.89824e-007
		detailScale     0.802493
		colorConversion true
		snowLevel       2
		tropicLatitude  0.540162
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.700306
		terraceProb     0.150901
		erosion         0
		montesMagn      0.476351
		montesFreq      1.83402
		montesSpiky     0.976182
		montesFraction  0.133017
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.11986e-006
		hillsFraction   0.756635
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253387
		craterFreq      0.194119
		craterDensity   0.849802
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.525232
		volcanoTemp     1632.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.196, 0.194, 0.192, 0.000)
		colorShelf     (0.208, 0.206, 0.204, 0.000)
		colorBeach     (0.220, 0.218, 0.216, 0.000)
		colorDesert    (0.232, 0.230, 0.228, 0.000)
		colorLowland   (0.245, 0.242, 0.240, 0.000)
		colorUpland    (0.257, 0.254, 0.252, 0.000)
		colorRock      (0.269, 0.266, 0.264, 0.000)
		colorSnow      (0.281, 0.278, 0.276, 1.000)
		BumpHeight      0.0264494
		BumpOffset      0.00528987
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0138633
		DustBright  0.687676
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   19.1417
		Period          111.422
		Eccentricity    0.979843
		Inclination     60.2718
		AscendingNode   -34.4243
		ArgOfPericenter 118.841
		MeanAnomaly     -30.0417
	}
}

Comet	"Crait System C83"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            8.5246e-014
	Radius          0.636667
	InertiaMoment   0.398847

	Oblateness      0.00376495

	RotationPeriod  87.4505
	Obliquity       242.91
	EqAscendNode    120.157

	AbsMagn         10.3502
	SlopeParam      7.0683
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.749 0.746 0.743)

	Surface
	{
		SurfStyle       0.0673819
		OceanStyle      0.148259
		Randomize      (-0.160, 0.099, -0.999)
		colorDistMagn   0.534551
		colorDistFreq   0.000147964
		detailScale     17.3853
		colorConversion true
		snowLevel       2
		tropicLatitude  0.771622
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.444576
		terraceProb     0.102366
		erosion         0
		montesMagn      0.443573
		montesFreq      3.01049
		montesSpiky     0.947909
		montesFraction  0.620814
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000975255
		hillsFraction   0.746085
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261116
		craterFreq      0.212109
		craterDensity   0.950372
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.507744
		volcanoTemp     1873.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.300, 0.298, 0.297, 0.000)
		colorShelf     (0.319, 0.317, 0.316, 0.000)
		colorBeach     (0.337, 0.336, 0.334, 0.000)
		colorDesert    (0.356, 0.354, 0.353, 0.000)
		colorLowland   (0.375, 0.373, 0.372, 0.000)
		colorUpland    (0.393, 0.391, 0.390, 0.000)
		colorRock      (0.412, 0.410, 0.409, 0.000)
		colorSnow      (0.431, 0.429, 0.427, 1.000)
		BumpHeight      0.573001
		BumpOffset      0.1146
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.248921
		GasToDust   0.25
		Particles   1482
		GasBright   0.0304214
		DustBright  0.355605
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   13.44
		Period          65.5543
		Eccentricity    0.973909
		Inclination     -68.2981
		AscendingNode   -55.5704
		ArgOfPericenter -168.262
		MeanAnomaly     120.95
	}
}

Comet	"Crait System C84"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            6.59317e-010
	Radius          11.4805
	InertiaMoment   0.397106

	Oblateness      0.00305125

	RotationPeriod  84.3038
	Obliquity       196.115
	EqAscendNode    104.734

	AbsMagn         6.81825
	SlopeParam      2.37488
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.554 0.550 0.548)

	Surface
	{
		SurfStyle       0.497946
		OceanStyle      0.392783
		Randomize      (-0.033, -0.255, 0.108)
		colorDistMagn   0.210822
		colorDistFreq   0.0489768
		detailScale     313.494
		colorConversion true
		snowLevel       2
		tropicLatitude  0.891779
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.582541
		terraceProb     0.456959
		erosion         0
		montesMagn      0.386695
		montesFreq      2.91876
		montesSpiky     0.997262
		montesFraction  0.650794
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.296239
		hillsFraction   0.590098
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233918
		craterFreq      0.200441
		craterDensity   1.07932
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.448738
		volcanoTemp     1775.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.222, 0.220, 0.219, 0.000)
		colorShelf     (0.236, 0.234, 0.233, 0.000)
		colorBeach     (0.249, 0.247, 0.247, 0.000)
		colorDesert    (0.263, 0.261, 0.260, 0.000)
		colorLowland   (0.277, 0.275, 0.274, 0.000)
		colorUpland    (0.291, 0.289, 0.288, 0.000)
		colorRock      (0.305, 0.302, 0.301, 0.000)
		colorSnow      (0.319, 0.316, 0.315, 1.000)
		BumpHeight      10.3325
		BumpOffset      2.06649
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.730113
		GasToDust   0.25
		Particles   2454
		GasBright   0.120002
		DustBright  0.750511
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   9.38595
		Period          38.2576
		Eccentricity    0.969756
		Inclination     119.066
		AscendingNode   -93.3694
		ArgOfPericenter -32.321
		MeanAnomaly     41.246
	}
}

Comet	"Crait System C85"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            2.03009e-017
	Radius          0.0394336
	InertiaMoment   0.399314

	Oblateness      0.00434191

	RotationPeriod  81.4126
	Obliquity       149.321
	EqAscendNode    89.3118

	AbsMagn         1.26354
	SlopeParam      3.06635
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.725 0.723 0.720)

	Surface
	{
		SurfStyle       0.100294
		OceanStyle      0.733986
		Randomize      (-0.092, -0.094, 0.365)
		colorDistMagn   0.553063
		colorDistFreq   1.11351e-006
		detailScale     1.0768
		colorConversion true
		snowLevel       2
		tropicLatitude  0.521665
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.610836
		terraceProb     0.380959
		erosion         0
		montesMagn      0.58191
		montesFreq      3.82948
		montesSpiky     0.954964
		montesFraction  0.515656
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.37787e-006
		hillsFraction   0.761982
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242305
		craterFreq      0.191591
		craterDensity   0.969498
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.576756
		volcanoTemp     1426.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.290, 0.289, 0.288, 0.000)
		colorShelf     (0.308, 0.307, 0.306, 0.000)
		colorBeach     (0.326, 0.325, 0.324, 0.000)
		colorDesert    (0.344, 0.344, 0.342, 0.000)
		colorLowland   (0.363, 0.362, 0.360, 0.000)
		colorUpland    (0.381, 0.380, 0.378, 0.000)
		colorRock      (0.399, 0.398, 0.396, 0.000)
		colorSnow      (0.417, 0.416, 0.414, 1.000)
		BumpHeight      0.0354903
		BumpOffset      0.00709805
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.109278
		DustBright  0.445722
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   11.6577
		Period          52.9565
		Eccentricity    0.957987
		Inclination     158.841
		AscendingNode   106.107
		ArgOfPericenter -13.133
		MeanAnomaly     134.727
	}
}

Comet	"Crait System C86"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.57012e-013
	Radius          0.710785
	InertiaMoment   0.39799

	Oblateness      0.00349871

	RotationPeriod  78.7224
	Obliquity       102.527
	EqAscendNode    73.8892

	AbsMagn         10.1065
	SlopeParam      3.65941
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.611 0.604 0.602)

	Surface
	{
		SurfStyle       0.709287
		OceanStyle      0.85855
		Randomize      (0.874, -0.858, -0.697)
		colorDistMagn   0.427182
		colorDistFreq   0.000189332
		detailScale     19.4092
		colorConversion true
		snowLevel       2
		tropicLatitude  0.96366
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.533937
		terraceProb     0.164135
		erosion         0
		montesMagn      0.502004
		montesFreq      3.31357
		montesSpiky     0.961389
		montesFraction  0.640534
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00110312
		hillsFraction   0.78703
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256749
		craterFreq      0.242532
		craterDensity   0.969493
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.513719
		volcanoTemp     1385.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.238, 0.205, 0.169, 0.000)
		colorShelf     (0.244, 0.212, 0.193, 0.000)
		colorBeach     (0.287, 0.248, 0.229, 0.000)
		colorDesert    (0.311, 0.266, 0.223, 0.000)
		colorLowland   (0.342, 0.284, 0.253, 0.000)
		colorUpland    (0.379, 0.345, 0.307, 0.000)
		colorRock      (0.409, 0.375, 0.331, 0.000)
		colorSnow      (0.446, 0.399, 0.349, 1.000)
		BumpHeight      0.639707
		BumpOffset      0.127941
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.281747
		GasToDust   0.25
		Particles   1548
		GasBright   0.0612946
		DustBright  0.178191
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   13.8061
		Period          68.2504
		Eccentricity    0.966899
		Inclination     -79.5786
		AscendingNode   103.732
		ArgOfPericenter -53.4108
		MeanAnomaly     -104.243
	}
}

Comet	"Crait System C87"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.21438e-009
	Radius          15.4107
	InertiaMoment   0.399745

	Oblateness      0.004954

	RotationPeriod  76.1936
	Obliquity       55.7323
	EqAscendNode    58.4666

	AbsMagn         6.59842
	SlopeParam      4.22338
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.549 0.545 0.542)

	Surface
	{
		SurfStyle       0.547657
		OceanStyle      0.721188
		Randomize      (-0.118, -0.909, 0.549)
		colorDistMagn   0.719149
		colorDistFreq   0.103272
		detailScale     420.815
		colorConversion true
		snowLevel       2
		tropicLatitude  0.818112
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.28462
		terraceProb     0.419168
		erosion         0
		montesMagn      0.613961
		montesFreq      3.1661
		montesSpiky     0.936349
		montesFraction  0.378044
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.449095
		hillsFraction   0.523693
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.275979
		craterFreq      0.22598
		craterDensity   0.830327
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.585562
		volcanoTemp     1406.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.214, 0.185, 0.152, 0.000)
		colorShelf     (0.219, 0.191, 0.173, 0.000)
		colorBeach     (0.258, 0.223, 0.206, 0.000)
		colorDesert    (0.280, 0.240, 0.201, 0.000)
		colorLowland   (0.307, 0.256, 0.228, 0.000)
		colorUpland    (0.340, 0.311, 0.276, 0.000)
		colorRock      (0.368, 0.338, 0.298, 0.000)
		colorSnow      (0.400, 0.360, 0.314, 1.000)
		BumpHeight      13.8696
		BumpOffset      2.77392
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.762939
		GasToDust   0.25
		Particles   2521
		GasBright   0.228042
		DustBright  0.49593
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   12.5426
		Period          59.0993
		Eccentricity    0.968438
		Inclination     -1.86159
		AscendingNode   -62.7421
		ArgOfPericenter -50.8874
		MeanAnomaly     35.5399
	}
}

Comet	"Crait System C88"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            3.73915e-017
	Radius          0.0440051
	InertiaMoment   0.398594

	Oblateness      0.00397618

	RotationPeriod  73.7969
	Obliquity       8.93801
	EqAscendNode    43.044

	AbsMagn         0.17864
	SlopeParam      4.80609
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.507 0.363 0.307)

	Surface
	{
		SurfStyle       0.953723
		OceanStyle      0.0279734
		Randomize      (-0.244, 0.981, -0.085)
		colorDistMagn   0.487644
		colorDistFreq   1.12606e-006
		detailScale     1.20163
		colorConversion true
		snowLevel       2
		tropicLatitude  0.157119
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.673772
		terraceProb     0.316427
		erosion         0
		montesMagn      0.605145
		montesFreq      3.70195
		montesSpiky     0.970469
		montesFraction  0.608305
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.16031e-006
		hillsFraction   0.67669
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240987
		craterFreq      0.239126
		craterDensity   0.916536
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.485858
		volcanoTemp     1636.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.172, 0.127, 0.123, 0.050)
		colorShelf     (0.203, 0.149, 0.141, 0.040)
		colorBeach     (0.233, 0.170, 0.160, 0.030)
		colorDesert    (0.263, 0.192, 0.181, 0.020)
		colorLowland   (0.294, 0.214, 0.200, 0.030)
		colorUpland    (0.324, 0.236, 0.218, 0.050)
		colorRock      (0.355, 0.257, 0.243, 0.020)
		colorSnow      (0.355, 0.257, 0.243, 1.000)
		BumpHeight      0.0396046
		BumpOffset      0.00792093
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.152777
		DustBright  0.255682
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   9.65521
		Period          39.9157
		Eccentricity    0.973371
		Inclination     -177.316
		AscendingNode   -96.365
		ArgOfPericenter 90.5532
		MeanAnomaly     141.177
	}
}

Comet	"Crait System C89"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            2.89197e-013
	Radius          0.954507
	InertiaMoment   0.396316

	Oblateness      0.00554004

	RotationPeriod  71.5095
	Obliquity       322.144
	EqAscendNode    27.6214

	AbsMagn         9.87037
	SlopeParam      5.46861
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.728 0.726 0.725)

	Surface
	{
		SurfStyle       0.608522
		OceanStyle      0.59421
		Randomize      (0.945, -0.892, 0.690)
		colorDistMagn   0.210303
		colorDistFreq   0.000272621
		detailScale     26.0644
		colorConversion true
		snowLevel       2
		tropicLatitude  0.749407
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.67575
		terraceProb     0.382537
		erosion         0
		montesMagn      0.659401
		montesFreq      3.20538
		montesSpiky     0.93979
		montesFraction  0.784526
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00206197
		hillsFraction   0.538859
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242247
		craterFreq      0.195648
		craterDensity   0.865361
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.489288
		volcanoTemp     1109.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.284, 0.247, 0.203, 0.000)
		colorShelf     (0.291, 0.254, 0.232, 0.000)
		colorBeach     (0.342, 0.298, 0.275, 0.000)
		colorDesert    (0.371, 0.320, 0.268, 0.000)
		colorLowland   (0.408, 0.341, 0.304, 0.000)
		colorUpland    (0.451, 0.414, 0.370, 0.000)
		colorRock      (0.488, 0.450, 0.399, 0.000)
		colorSnow      (0.531, 0.479, 0.420, 1.000)
		BumpHeight      0.859057
		BumpOffset      0.171811
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.314573
		GasToDust   0.25
		Particles   1615
		GasBright   0.386715
		DustBright  0.506231
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   11.162
		Period          49.6149
		Eccentricity    0.963342
		Inclination     157.582
		AscendingNode   -73.1669
		ArgOfPericenter -118.653
		MeanAnomaly     85.5412
	}
}

Comet	"Crait System C90"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            2.23673e-009
	Radius          17.1892
	InertiaMoment   0.39909

	Oblateness      0.0044992

	RotationPeriod  69.3133
	Obliquity       275.349
	EqAscendNode    12.1988

	AbsMagn         6.37427
	SlopeParam      6.35694
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.590 0.586 0.581)

	Surface
	{
		SurfStyle       0.325997
		OceanStyle      0.0492788
		Randomize      (0.731, -0.151, 0.944)
		colorDistMagn   0.38704
		colorDistFreq   0.173516
		detailScale     469.38
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997773
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.434569
		terraceProb     0.397128
		erosion         0
		montesMagn      0.457431
		montesFreq      2.7907
		montesSpiky     0.945059
		montesFraction  0.655613
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.845441
		hillsFraction   0.64586
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254311
		craterFreq      0.202019
		craterDensity   0.90567
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.523017
		volcanoTemp     1573.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.236, 0.235, 0.232, 0.000)
		colorShelf     (0.251, 0.249, 0.247, 0.000)
		colorBeach     (0.265, 0.264, 0.261, 0.000)
		colorDesert    (0.280, 0.279, 0.276, 0.000)
		colorLowland   (0.295, 0.293, 0.290, 0.000)
		colorUpland    (0.310, 0.308, 0.305, 0.000)
		colorRock      (0.324, 0.323, 0.320, 0.000)
		colorSnow      (0.339, 0.337, 0.334, 1.000)
		BumpHeight      15.4703
		BumpOffset      3.09406
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.795765
		GasToDust   0.25
		Particles   2587
		GasBright   0.284168
		DustBright  0.293264
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   8.82894
		Period          34.903
		Eccentricity    0.961078
		Inclination     176.314
		AscendingNode   -65.6991
		ArgOfPericenter 158.949
		MeanAnomaly     176.1
	}
}

Comet	"Crait System C91"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            6.88706e-017
	Radius          0.0591205
	InertiaMoment   0.397612

	Oblateness      0.00629116

	RotationPeriod  67.1937
	Obliquity       228.555
	EqAscendNode    356.776

	AbsMagn         18.9496
	SlopeParam      8.89149
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.542 0.534 0.530)

	Surface
	{
		SurfStyle       0.934068
		OceanStyle      0.213547
		Randomize      (-0.363, 0.464, 0.387)
		colorDistMagn   0.986194
		colorDistFreq   2.60362e-006
		detailScale     1.61438
		colorConversion true
		snowLevel       2
		tropicLatitude  0.972642
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.524609
		terraceProb     0.208092
		erosion         0
		montesMagn      0.564613
		montesFreq      2.70616
		montesSpiky     0.992071
		montesFraction  0.310869
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.36533e-006
		hillsFraction   0.785795
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25164
		craterFreq      0.230749
		craterDensity   0.938452
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.557654
		volcanoTemp     1461.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.184, 0.187, 0.212, 0.050)
		colorShelf     (0.217, 0.219, 0.244, 0.040)
		colorBeach     (0.249, 0.251, 0.276, 0.030)
		colorDesert    (0.282, 0.283, 0.313, 0.020)
		colorLowland   (0.314, 0.315, 0.345, 0.030)
		colorUpland    (0.347, 0.347, 0.377, 0.050)
		colorRock      (0.379, 0.379, 0.419, 0.020)
		colorSnow      (0.379, 0.379, 0.419, 1.000)
		BumpHeight      0.0532085
		BumpOffset      0.0106417
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.013402
		DustBright  0.248517
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   15.8647
		Period          84.0717
		Eccentricity    0.969949
		Inclination     -74.2531
		AscendingNode   -124.819
		ArgOfPericenter 163.38
		MeanAnomaly     160.803
	}
}

Comet	"Crait System C92"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            5.32665e-013
	Radius          1.06413
	InertiaMoment   0.399535

	Oblateness      0.00508382

	RotationPeriod  65.1387
	Obliquity       181.761
	EqAscendNode    341.354

	AbsMagn         9.64062
	SlopeParam      2.73484
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.501 0.497 0.494)

	Surface
	{
		SurfStyle       0.161846
		OceanStyle      0.585311
		Randomize      (-0.438, -0.955, -0.487)
		colorDistMagn   0.223236
		colorDistFreq   0.000325851
		detailScale     29.0578
		colorConversion true
		snowLevel       2
		tropicLatitude  0.154948
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.498723
		terraceProb     0.285565
		erosion         0
		montesMagn      0.620694
		montesFreq      3.09456
		montesSpiky     0.917652
		montesFraction  0.381743
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00248387
		hillsFraction   0.80184
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221178
		craterFreq      0.259216
		craterDensity   0.900767
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.467802
		volcanoTemp     1615.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.200, 0.199, 0.198, 0.000)
		colorShelf     (0.213, 0.211, 0.210, 0.000)
		colorBeach     (0.225, 0.224, 0.223, 0.000)
		colorDesert    (0.238, 0.236, 0.235, 0.000)
		colorLowland   (0.250, 0.249, 0.247, 0.000)
		colorUpland    (0.263, 0.261, 0.260, 0.000)
		colorRock      (0.275, 0.273, 0.272, 0.000)
		colorSnow      (0.288, 0.286, 0.284, 1.000)
		BumpHeight      0.957717
		BumpOffset      0.191543
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.347399
		GasToDust   0.25
		Particles   1681
		GasBright   0.0822642
		DustBright  0.664141
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   10.6501
		Period          46.2411
		Eccentricity    0.977749
		Inclination     -8.53963
		AscendingNode   -96.5916
		ArgOfPericenter 176.255
		MeanAnomaly     179.173
	}
}

Comet	"Crait System C93"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            4.11978e-009
	Radius          23.1046
	InertiaMoment   0.398315

	Oblateness      0.00712838

	RotationPeriod  63.1381
	Obliquity       134.967
	EqAscendNode    325.931

	AbsMagn         6.1449
	SlopeParam      3.36578
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.599 0.593 0.588)

	Surface
	{
		SurfStyle       0.423567
		OceanStyle      0.732574
		Randomize      (0.398, 0.971, -0.197)
		colorDistMagn   0.930163
		colorDistFreq   0.277504
		detailScale     630.91
		colorConversion true
		snowLevel       2
		tropicLatitude  0.694379
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.42882
		terraceProb     0.154034
		erosion         0
		montesMagn      0.463301
		montesFreq      3.29946
		montesSpiky     0.890748
		montesFraction  0.278448
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.961569
		hillsFraction   0.834598
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247412
		craterFreq      0.1814
		craterDensity   0.891865
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.445452
		volcanoTemp     1349.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.240, 0.237, 0.235, 0.000)
		colorShelf     (0.255, 0.252, 0.250, 0.000)
		colorBeach     (0.270, 0.267, 0.264, 0.000)
		colorDesert    (0.285, 0.282, 0.279, 0.000)
		colorLowland   (0.300, 0.297, 0.294, 0.000)
		colorUpland    (0.315, 0.311, 0.308, 0.000)
		colorRock      (0.330, 0.326, 0.323, 0.000)
		colorSnow      (0.345, 0.341, 0.338, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.828591
		GasToDust   0.25
		Particles   2653
		GasBright   0.0729324
		DustBright  0.35796
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   12.2418
		Period          56.9858
		Eccentricity    0.975154
		Inclination     -9.37468
		AscendingNode   -101.185
		ArgOfPericenter 53.9096
		MeanAnomaly     -3.29216
	}
}

Comet	"Crait System C94"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.26851e-016
	Radius          0.0658746
	InertiaMoment   0.399957

	Oblateness      0.00574939

	RotationPeriod  61.1832
	Obliquity       88.1722
	EqAscendNode    310.508

	AbsMagn         15.9162
	SlopeParam      3.93811
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.518 0.431 0.380)

	Surface
	{
		SurfStyle       0.415245
		OceanStyle      0.462836
		Randomize      (-0.506, 0.060, 0.649)
		colorDistMagn   0.730645
		colorDistFreq   3.78383e-006
		detailScale     1.79882
		colorConversion true
		snowLevel       2
		tropicLatitude  0.970413
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.287488
		terraceProb     0.589023
		erosion         0
		montesMagn      0.493433
		montesFreq      2.91843
		montesSpiky     0.733914
		montesFraction  0.602298
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.28917e-005
		hillsFraction   0.587849
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22978
		craterFreq      0.174049
		craterDensity   0.846914
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.566672
		volcanoTemp     1674.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.207, 0.172, 0.152, 0.000)
		colorShelf     (0.220, 0.183, 0.161, 0.000)
		colorBeach     (0.233, 0.194, 0.171, 0.000)
		colorDesert    (0.246, 0.205, 0.180, 0.000)
		colorLowland   (0.259, 0.215, 0.190, 0.000)
		colorUpland    (0.272, 0.226, 0.199, 0.000)
		colorRock      (0.285, 0.237, 0.209, 0.000)
		colorSnow      (0.298, 0.248, 0.218, 1.000)
		BumpHeight      0.0592872
		BumpOffset      0.0118574
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.208985
		DustBright  0.706394
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   14.531
		Period          73.6958
		Eccentricity    0.978489
		Inclination     128.039
		AscendingNode   109.372
		ArgOfPericenter -84.7469
		MeanAnomaly     150.735
	}
}

Comet	"Crait System C95"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            9.81101e-013
	Radius          1.43107
	InertiaMoment   0.398854

	Oblateness      0.0080887

	RotationPeriod  59.2665
	Obliquity       41.3779
	EqAscendNode    295.086

	AbsMagn         9.41616
	SlopeParam      4.50532
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.785 0.692 0.612)

	Surface
	{
		SurfStyle       0.276324
		OceanStyle      0.428177
		Randomize      (0.753, -0.160, 0.812)
		colorDistMagn   0.836481
		colorDistFreq   0.000557389
		detailScale     39.0777
		colorConversion true
		snowLevel       2
		tropicLatitude  0.841784
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.450515
		terraceProb     0.452209
		erosion         0
		montesMagn      0.289384
		montesFreq      3.90839
		montesSpiky     0.983918
		montesFraction  0.512981
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00504697
		hillsFraction   0.502852
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.26199
		craterFreq      0.220892
		craterDensity   1.08911
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.530156
		volcanoTemp     1677.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.314, 0.277, 0.245, 0.000)
		colorShelf     (0.334, 0.294, 0.260, 0.000)
		colorBeach     (0.353, 0.311, 0.276, 0.000)
		colorDesert    (0.373, 0.329, 0.291, 0.000)
		colorLowland   (0.393, 0.346, 0.306, 0.000)
		colorUpland    (0.412, 0.363, 0.322, 0.000)
		colorRock      (0.432, 0.381, 0.337, 0.000)
		colorSnow      (0.451, 0.398, 0.352, 1.000)
		BumpHeight      1.28796
		BumpOffset      0.257592
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.380225
		GasToDust   0.25
		Particles   1747
		GasBright   0.172371
		DustBright  0.427494
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   14.2539
		Period          71.5982
		Eccentricity    0.963249
		Inclination     60.9538
		AscendingNode   107.68
		ArgOfPericenter -25.0242
		MeanAnomaly     85.8354
	}
}

Comet	"Crait System C96"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            7.58812e-009
	Radius          25.7291
	InertiaMoment   0.397121

	Oblateness      0.00644184

	RotationPeriod  57.3812
	Obliquity       354.584
	EqAscendNode    279.663

	AbsMagn         5.90925
	SlopeParam      5.11737
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.618 0.610 0.606)

	Surface
	{
		SurfStyle       0.194175
		OceanStyle      0.749836
		Randomize      (-0.618, 0.723, -0.036)
		colorDistMagn   0.754395
		colorDistFreq   0.384246
		detailScale     702.577
		colorConversion true
		snowLevel       2
		tropicLatitude  0.555054
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.670829
		terraceProb     0.116707
		erosion         0
		montesMagn      0.462503
		montesFreq      3.17038
		montesSpiky     0.954051
		montesFraction  0.828389
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.07301
		hillsFraction   0.521266
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243681
		craterFreq      0.251249
		craterDensity   1.0148
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.522056
		volcanoTemp     1838.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.247, 0.244, 0.242, 0.000)
		colorShelf     (0.263, 0.259, 0.258, 0.000)
		colorBeach     (0.278, 0.274, 0.273, 0.000)
		colorDesert    (0.293, 0.290, 0.288, 0.000)
		colorLowland   (0.309, 0.305, 0.303, 0.000)
		colorUpland    (0.324, 0.320, 0.318, 0.000)
		colorRock      (0.340, 0.335, 0.333, 0.000)
		colorSnow      (0.355, 0.351, 0.349, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.861417
		GasToDust   0.25
		Particles   2720
		GasBright   0.098498
		DustBright  0.185854
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.2732
		Period          16.1106
		Eccentricity    0.91548
		Inclination     -151.685
		AscendingNode   -175.145
		ArgOfPericenter -157.27
		MeanAnomaly     -33.0428
	}
}

Comet	"Crait System C97"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            2.33643e-016
	Radius          0.0886388
	InertiaMoment   0.399319

	Oblateness      0.00921267

	RotationPeriod  55.5213
	Obliquity       307.789
	EqAscendNode    264.241

	AbsMagn         14.7937
	SlopeParam      5.86057
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.645 0.642 0.637)

	Surface
	{
		SurfStyle       0.167429
		OceanStyle      0.664153
		Randomize      (0.163, -0.676, 0.606)
		colorDistMagn   0.980463
		colorDistFreq   5.91299e-006
		detailScale     2.42043
		colorConversion true
		snowLevel       2
		tropicLatitude  0.91704
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.328293
		terraceProb     0.41585
		erosion         0
		montesMagn      0.355663
		montesFreq      3.30399
		montesSpiky     0.843277
		montesFraction  0.516419
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.87577e-005
		hillsFraction   0.464519
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230438
		craterFreq      0.181222
		craterDensity   0.895051
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.436067
		volcanoTemp     1570.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.258, 0.257, 0.255, 0.000)
		colorShelf     (0.274, 0.273, 0.271, 0.000)
		colorBeach     (0.290, 0.289, 0.287, 0.000)
		colorDesert    (0.307, 0.305, 0.303, 0.000)
		colorLowland   (0.323, 0.321, 0.319, 0.000)
		colorUpland    (0.339, 0.337, 0.335, 0.000)
		colorRock      (0.355, 0.353, 0.351, 0.000)
		colorSnow      (0.371, 0.369, 0.367, 1.000)
		BumpHeight      0.0797749
		BumpOffset      0.015955
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.311718
		DustBright  0.45712
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   14.2364
		Period          71.4663
		Eccentricity    0.964793
		Inclination     -69.9582
		AscendingNode   34.9134
		ArgOfPericenter -141.085
		MeanAnomaly     -11.6427
	}
}

Comet	"Crait System C98"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.80706e-012
	Radius          1.59263
	InertiaMoment   0.397999

	Oblateness      0.00735463

	RotationPeriod  53.6813
	Obliquity       260.995
	EqAscendNode    248.818

	AbsMagn         9.19608
	SlopeParam      7.0435
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.618 0.615 0.612)

	Surface
	{
		SurfStyle       0.677693
		OceanStyle      0.344421
		Randomize      (-0.670, 0.598, 0.502)
		colorDistMagn   0.54337
		colorDistFreq   0.00225852
		detailScale     43.4893
		colorConversion true
		snowLevel       2
		tropicLatitude  0.917478
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.493585
		terraceProb     0.171641
		erosion         0
		montesMagn      0.590006
		montesFreq      2.48068
		montesSpiky     0.986518
		montesFraction  0.388006
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0062744
		hillsFraction   0.721835
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.204493
		craterFreq      0.274974
		craterDensity   0.606107
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.511703
		volcanoTemp     1657.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.241, 0.209, 0.171, 0.000)
		colorShelf     (0.247, 0.215, 0.196, 0.000)
		colorBeach     (0.290, 0.252, 0.233, 0.000)
		colorDesert    (0.315, 0.271, 0.226, 0.000)
		colorLowland   (0.346, 0.289, 0.257, 0.000)
		colorUpland    (0.383, 0.351, 0.312, 0.000)
		colorRock      (0.414, 0.381, 0.337, 0.000)
		colorSnow      (0.451, 0.406, 0.355, 1.000)
		BumpHeight      1.43336
		BumpOffset      0.286673
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.41305
		GasToDust   0.25
		Particles   1814
		GasBright   0.210563
		DustBright  0.242762
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   11.5173
		Period          52.0026
		Eccentricity    0.950843
		Inclination     51.9738
		AscendingNode   112.79
		ArgOfPericenter -72.316
		MeanAnomaly     86.483
	}
}

Comet	"Crait System C99"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.39763e-008
	Radius          34.6408
	InertiaMoment   0.39975

	Oblateness      0.0105551

	RotationPeriod  51.856
	Obliquity       214.201
	EqAscendNode    233.396

	AbsMagn         5.66611
	SlopeParam      2.36412
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.593 0.590 0.587)

	Surface
	{
		SurfStyle       0.306694
		OceanStyle      0.297058
		Randomize      (0.604, -0.004, 0.475)
		colorDistMagn   0.132537
		colorDistFreq   0.462381
		detailScale     945.926
		colorConversion true
		snowLevel       2
		tropicLatitude  0.822524
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.346211
		terraceProb     0.305988
		erosion         0
		montesMagn      0.494206
		montesFreq      3.21463
		montesSpiky     0.975356
		montesFraction  0.881767
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.17125
		hillsFraction   0.483296
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237672
		craterFreq      0.239907
		craterDensity   0.852056
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.479692
		volcanoTemp     1516.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.237, 0.236, 0.235, 0.000)
		colorShelf     (0.252, 0.251, 0.249, 0.000)
		colorBeach     (0.267, 0.265, 0.264, 0.000)
		colorDesert    (0.281, 0.280, 0.279, 0.000)
		colorLowland   (0.296, 0.295, 0.293, 0.000)
		colorUpland    (0.311, 0.310, 0.308, 0.000)
		colorRock      (0.326, 0.324, 0.323, 0.000)
		colorSnow      (0.341, 0.339, 0.337, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.894242
		GasToDust   0.25
		Particles   2786
		GasBright   0.0220673
		DustBright  0.915744
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   8.88271
		Period          35.2224
		Eccentricity    0.938012
		Inclination     22.0996
		AscendingNode   -20.8827
		ArgOfPericenter 37.8108
		MeanAnomaly     174.926
	}
}

Comet	"Crait System C100"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            4.30342e-016
	Radius          0.098579
	InertiaMoment   0.3986

	Oblateness      0.00844717

	RotationPeriod  50.0406
	Obliquity       167.406
	EqAscendNode    217.973

	AbsMagn         14.04
	SlopeParam      3.05773
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.577 0.574 0.571)

	Surface
	{
		SurfStyle       0.634155
		OceanStyle      0.620872
		Randomize      (-0.063, 0.870, -0.120)
		colorDistMagn   0.937318
		colorDistFreq   5.36596e-007
		detailScale     2.69186
		colorConversion true
		snowLevel       2
		tropicLatitude  0.80546
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.583782
		terraceProb     0.652987
		erosion         0
		montesMagn      0.35138
		montesFreq      2.96683
		montesSpiky     0.939648
		montesFraction  0.514462
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.00429e-005
		hillsFraction   0.58239
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233469
		craterFreq      0.215181
		craterDensity   0.869146
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.482853
		volcanoTemp     1572.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.225, 0.195, 0.160, 0.000)
		colorShelf     (0.231, 0.201, 0.183, 0.000)
		colorBeach     (0.271, 0.235, 0.217, 0.000)
		colorDesert    (0.294, 0.252, 0.211, 0.000)
		colorLowland   (0.323, 0.270, 0.240, 0.000)
		colorUpland    (0.358, 0.327, 0.291, 0.000)
		colorRock      (0.387, 0.356, 0.314, 0.000)
		colorSnow      (0.421, 0.379, 0.331, 1.000)
		BumpHeight      0.0887211
		BumpOffset      0.0177442
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0513868
		DustBright  0.570911
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   11.0907
		Period          49.1404
		Eccentricity    0.953632
		Inclination     -126.293
		AscendingNode   -85.1124
		ArgOfPericenter -87.9756
		MeanAnomaly     29.5708
	}
}

Comet	"Crait System C101"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            3.32839e-012
	Radius          2.14563
	InertiaMoment   0.396344

	Oblateness      0.0120208

	RotationPeriod  48.2303
	Obliquity       120.612
	EqAscendNode    202.55

	AbsMagn         8.97956
	SlopeParam      3.65158
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.604 0.601 0.599)

	Surface
	{
		SurfStyle       0.383347
		OceanStyle      0.495353
		Randomize      (0.831, -0.387, 0.260)
		colorDistMagn   0.0400053
		colorDistFreq   0.00261378
		detailScale     58.59
		colorConversion true
		snowLevel       2
		tropicLatitude  0.938315
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.449146
		terraceProb     0.367607
		erosion         0
		montesMagn      0.510667
		montesFreq      3.5584
		montesSpiky     0.989358
		montesFraction  0.432961
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0101757
		hillsFraction   0.901809
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252028
		craterFreq      0.219803
		craterDensity   0.983659
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.413993
		volcanoTemp     1716.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.242, 0.240, 0.240, 0.000)
		colorShelf     (0.257, 0.256, 0.255, 0.000)
		colorBeach     (0.272, 0.271, 0.270, 0.000)
		colorDesert    (0.287, 0.286, 0.285, 0.000)
		colorLowland   (0.302, 0.301, 0.300, 0.000)
		colorUpland    (0.317, 0.316, 0.315, 0.000)
		colorRock      (0.332, 0.331, 0.330, 0.000)
		colorSnow      (0.347, 0.346, 0.345, 1.000)
		BumpHeight      1.93107
		BumpOffset      0.386213
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.445876
		GasToDust   0.25
		Particles   1880
		GasBright   0.0434472
		DustBright  0.263337
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   13.079
		Period          62.9309
		Eccentricity    0.956212
		Inclination     -18.9335
		AscendingNode   -60.8808
		ArgOfPericenter -4.54977
		MeanAnomaly     -157.935
	}
}

Comet	"Crait System C102"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            2.57427e-008
	Radius          38.4975
	InertiaMoment   0.399095

	Oblateness      0.00979142

	RotationPeriod  46.4206
	Obliquity       73.8179
	EqAscendNode    187.128

	AbsMagn         5.41402
	SlopeParam      4.21562
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.768 0.763 0.762)

	Surface
	{
		SurfStyle       0.577817
		OceanStyle      0.804353
		Randomize      (0.224, -0.478, -0.113)
		colorDistMagn   0.474219
		colorDistFreq   0.773794
		detailScale     1051.24
		colorConversion true
		snowLevel       2
		tropicLatitude  0.938216
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.444919
		terraceProb     0.101101
		erosion         0
		montesMagn      0.368726
		montesFreq      2.76506
		montesSpiky     0.90742
		montesFraction  0.614536
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.73733
		hillsFraction   0.630451
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237268
		craterFreq      0.232725
		craterDensity   0.892852
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.531216
		volcanoTemp     1339.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.300, 0.260, 0.213, 0.000)
		colorShelf     (0.307, 0.267, 0.244, 0.000)
		colorBeach     (0.361, 0.313, 0.289, 0.000)
		colorDesert    (0.392, 0.336, 0.282, 0.000)
		colorLowland   (0.430, 0.359, 0.320, 0.000)
		colorUpland    (0.476, 0.435, 0.388, 0.000)
		colorRock      (0.515, 0.473, 0.419, 0.000)
		colorSnow      (0.561, 0.504, 0.442, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.927068
		GasToDust   0.25
		Particles   2852
		GasBright   0.158782
		DustBright  0.63249
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   12.5014
		Period          58.808
		Eccentricity    0.964074
		Inclination     -36.7157
		AscendingNode   172.659
		ArgOfPericenter -36.2231
		MeanAnomaly     29.7327
	}
}

Comet	"Crait System C103"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            7.92638e-016
	Radius          0.132899
	InertiaMoment   0.397623

	Oblateness      0.01409

	RotationPeriod  44.607
	Obliquity       27.0236
	EqAscendNode    171.705

	AbsMagn         13.4548
	SlopeParam      4.79773
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.509 0.505 0.502)

	Surface
	{
		SurfStyle       0.55628
		OceanStyle      0.486594
		Randomize      (-0.259, -0.832, 0.937)
		colorDistMagn   0.754269
		colorDistFreq   2.19608e-006
		detailScale     3.62903
		colorConversion true
		snowLevel       2
		tropicLatitude  0.573124
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.540851
		terraceProb     0.524785
		erosion         0
		montesMagn      0.640729
		montesFreq      3.44123
		montesSpiky     0.803591
		montesFraction  0.355138
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.60811e-005
		hillsFraction   0.884988
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.212801
		craterFreq      0.221382
		craterDensity   0.662793
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.572275
		volcanoTemp     1068.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.198, 0.172, 0.140, 0.000)
		colorShelf     (0.203, 0.177, 0.161, 0.000)
		colorBeach     (0.239, 0.207, 0.191, 0.000)
		colorDesert    (0.259, 0.222, 0.186, 0.000)
		colorLowland   (0.285, 0.237, 0.211, 0.000)
		colorUpland    (0.315, 0.288, 0.256, 0.000)
		colorRock      (0.341, 0.313, 0.276, 0.000)
		colorSnow      (0.371, 0.333, 0.291, 1.000)
		BumpHeight      0.119609
		BumpOffset      0.0239218
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.12356
		DustBright  0.352198
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   10.3532
		Period          44.3216
		Eccentricity    0.948195
		Inclination     -18.0611
		AscendingNode   101.24
		ArgOfPericenter 21.7738
		MeanAnomaly     60.0605
	}
}

Comet	"Crait System C104"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            6.13046e-012
	Radius          2.38263
	InertiaMoment   0.39954

	Oblateness      0.0114935

	RotationPeriod  42.7846
	Obliquity       340.229
	EqAscendNode    156.283

	AbsMagn         8.76587
	SlopeParam      5.45853
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.537 0.528 0.525)

	Surface
	{
		SurfStyle       0.551245
		OceanStyle      0.598311
		Randomize      (0.502, 0.924, -0.906)
		colorDistMagn   0.931448
		colorDistFreq   0.00479704
		detailScale     65.0618
		colorConversion true
		snowLevel       2
		tropicLatitude  0.708189
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.629919
		terraceProb     0.207935
		erosion         0
		montesMagn      0.466845
		montesFreq      2.80019
		montesSpiky     0.96597
		montesFraction  0.71135
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0124447
		hillsFraction   0.693925
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233579
		craterFreq      0.181215
		craterDensity   0.87291
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.524753
		volcanoTemp     1383.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.209, 0.180, 0.147, 0.000)
		colorShelf     (0.215, 0.185, 0.168, 0.000)
		colorBeach     (0.252, 0.217, 0.199, 0.000)
		colorDesert    (0.274, 0.233, 0.194, 0.000)
		colorLowland   (0.301, 0.248, 0.220, 0.000)
		colorUpland    (0.333, 0.301, 0.268, 0.000)
		colorRock      (0.360, 0.328, 0.289, 0.000)
		colorSnow      (0.392, 0.349, 0.304, 1.000)
		BumpHeight      2.14437
		BumpOffset      0.428874
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.478702
		GasToDust   0.25
		Particles   1946
		GasBright   0.306085
		DustBright  0.65416
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   13.114
		Period          63.1834
		Eccentricity    0.962013
		Inclination     -151.864
		AscendingNode   140.926
		ArgOfPericenter -87.2141
		MeanAnomaly     97.8764
	}
}

Comet	"Crait System C105"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            4.74147e-008
	Radius          51.9386
	InertiaMoment   0.398322

	Oblateness      0.0167278

	RotationPeriod  40.9488
	Obliquity       293.435
	EqAscendNode    140.86

	AbsMagn         5.15121
	SlopeParam      6.34156
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.523 0.396 0.286)

	Surface
	{
		SurfStyle       0.783416
		OceanStyle      0.986711
		Randomize      (0.792, 0.140, 0.507)
		colorDistMagn   0.615917
		colorDistFreq   1.34372
		detailScale     1418.27
		colorConversion true
		snowLevel       2
		tropicLatitude  0.309949
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.49529
		terraceProb     0.195036
		erosion         0
		montesMagn      0.506846
		montesFreq      3.54954
		montesSpiky     0.873067
		montesFraction  0.333768
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.84447
		hillsFraction   0.751369
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229624
		craterFreq      0.243025
		craterDensity   0.865066
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.444795
		volcanoTemp     1992.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.204, 0.135, 0.080, 0.000)
		colorShelf     (0.209, 0.139, 0.091, 0.000)
		colorBeach     (0.246, 0.162, 0.109, 0.000)
		colorDesert    (0.267, 0.174, 0.106, 0.000)
		colorLowland   (0.293, 0.186, 0.120, 0.000)
		colorUpland    (0.324, 0.226, 0.146, 0.000)
		colorRock      (0.350, 0.246, 0.157, 0.000)
		colorSnow      (0.382, 0.262, 0.166, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.959894
		GasToDust   0.25
		Particles   2918
		GasBright   0.243581
		DustBright  0.40115
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   13.2865
		Period          64.434
		Eccentricity    0.974322
		Inclination     84.5984
		AscendingNode   -0.941935
		ArgOfPericenter 9.83022
		MeanAnomaly     13.3513
	}
}

Comet	"Crait System C106"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.45994e-015
	Radius          0.147454
	InertiaMoment   0.399963

	Oblateness      0.0137227

	RotationPeriod  39.0945
	Obliquity       246.641
	EqAscendNode    125.437

	AbsMagn         12.9676
	SlopeParam      8.75064
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.701 0.699 0.696)

	Surface
	{
		SurfStyle       0.416475
		OceanStyle      0.730235
		Randomize      (0.905, 0.422, -0.165)
		colorDistMagn   0.433024
		colorDistFreq   6.12201e-006
		detailScale     4.02648
		colorConversion true
		snowLevel       2
		tropicLatitude  0.913635
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.675226
		terraceProb     0.261481
		erosion         0
		montesMagn      0.563633
		montesFreq      2.23095
		montesSpiky     0.842347
		montesFraction  0.525734
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.34314e-005
		hillsFraction   0.417279
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244377
		craterFreq      0.214928
		craterDensity   0.876078
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.462296
		volcanoTemp     1335.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.280, 0.280, 0.278, 0.000)
		colorShelf     (0.298, 0.297, 0.296, 0.000)
		colorBeach     (0.315, 0.315, 0.313, 0.000)
		colorDesert    (0.333, 0.332, 0.331, 0.000)
		colorLowland   (0.351, 0.350, 0.348, 0.000)
		colorUpland    (0.368, 0.367, 0.365, 0.000)
		colorRock      (0.386, 0.385, 0.383, 0.000)
		colorSnow      (0.403, 0.402, 0.400, 1.000)
		BumpHeight      0.132709
		BumpOffset      0.0265417
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0303363
		GasToDust   0.25
		Particles   1041
		GasBright   0.143818
		DustBright  0.1854
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   19.4662
		Period          114.267
		Eccentricity    0.982728
		Inclination     178.427
		AscendingNode   -66.1599
		ArgOfPericenter -51.082
		MeanAnomaly     98.9446
	}
}

Comet	"Crait System C107"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.12916e-011
	Radius          3.21707
	InertiaMoment   0.39886

	Oblateness      0.0202489

	RotationPeriod  37.2162
	Obliquity       199.846
	EqAscendNode    110.015

	AbsMagn         8.55435
	SlopeParam      2.7254
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.713 0.708 0.705)

	Surface
	{
		SurfStyle       0.456639
		OceanStyle      0.312469
		Randomize      (-0.193, 0.362, -0.538)
		colorDistMagn   0.0240395
		colorDistFreq   0.000436669
		detailScale     87.8474
		colorConversion true
		snowLevel       2
		tropicLatitude  0.405001
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.356155
		terraceProb     0.233541
		erosion         0
		montesMagn      0.508321
		montesFreq      2.03861
		montesSpiky     0.917391
		montesFraction  0.261432
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0179245
		hillsFraction   0.541349
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246035
		craterFreq      0.17012
		craterDensity   0.806601
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.623801
		volcanoTemp     1620.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.285, 0.283, 0.282, 0.000)
		colorShelf     (0.303, 0.301, 0.300, 0.000)
		colorBeach     (0.321, 0.319, 0.317, 0.000)
		colorDesert    (0.338, 0.336, 0.335, 0.000)
		colorLowland   (0.356, 0.354, 0.353, 0.000)
		colorUpland    (0.374, 0.372, 0.370, 0.000)
		colorRock      (0.392, 0.389, 0.388, 0.000)
		colorSnow      (0.410, 0.407, 0.406, 1.000)
		BumpHeight      2.89536
		BumpOffset      0.579072
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.511528
		GasToDust   0.25
		Particles   2013
		GasBright   0.40351
		DustBright  0.410194
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   9.07175
		Period          36.3528
		Eccentricity    0.973186
		Inclination     150.14
		AscendingNode   -54.3234
		ArgOfPericenter 75.2294
		MeanAnomaly     13.4199
	}
}

Comet	"Crait System C108"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            8.73319e-008
	Radius          57.574
	InertiaMoment   0.397136

	Oblateness      0.0165649

	RotationPeriod  35.3081
	Obliquity       153.052
	EqAscendNode    94.5922

	AbsMagn         4.87548
	SlopeParam      3.35767
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.693 0.688 0.686)

	Surface
	{
		SurfStyle       0.69116
		OceanStyle      0.574573
		Randomize      (0.323, 0.970, -0.630)
		colorDistMagn   0.852904
		colorDistFreq   0.987939
		detailScale     1572.15
		colorConversion true
		snowLevel       2
		tropicLatitude  0.893611
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.496238
		terraceProb     0.258163
		erosion         0
		montesMagn      0.544744
		montesFreq      4.44172
		montesSpiky     0.990352
		montesFraction  0.514975
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.49719
		hillsFraction   0.703313
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24743
		craterFreq      0.222896
		craterDensity   0.867867
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.413899
		volcanoTemp     1620.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.270, 0.234, 0.192, 0.000)
		colorShelf     (0.277, 0.241, 0.219, 0.000)
		colorBeach     (0.326, 0.282, 0.261, 0.000)
		colorDesert    (0.353, 0.303, 0.254, 0.000)
		colorLowland   (0.388, 0.323, 0.288, 0.000)
		colorUpland    (0.429, 0.392, 0.350, 0.000)
		colorRock      (0.464, 0.427, 0.377, 0.000)
		colorSnow      (0.506, 0.454, 0.398, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.99272
		GasToDust   0.25
		Particles   2985
		GasBright   0.0273696
		DustBright  0.470821
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   10.3475
		Period          44.285
		Eccentricity    0.951799
		Inclination     134.639
		AscendingNode   -56.6026
		ArgOfPericenter -97.2355
		MeanAnomaly     121.057
	}
}

Comet	"Crait System C109"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            2.68902e-015
	Radius          0.199265
	InertiaMoment   0.399325

	Oblateness      0.0251855

	RotationPeriod  33.3636
	Obliquity       106.258
	EqAscendNode    79.1696

	AbsMagn         12.5446
	SlopeParam      3.93039
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.585 0.582 0.578)

	Surface
	{
		SurfStyle       0.583122
		OceanStyle      0.245586
		Randomize      (0.185, -0.603, 0.221)
		colorDistMagn   0.290021
		colorDistFreq   1.31104e-005
		detailScale     5.44127
		colorConversion true
		snowLevel       2
		tropicLatitude  0.993818
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.528922
		terraceProb     0.504136
		erosion         0
		montesMagn      0.37288
		montesFreq      3.00354
		montesSpiky     0.922825
		montesFraction  0.0769105
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000127221
		hillsFraction   0.590761
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230504
		craterFreq      0.273384
		craterDensity   0.932739
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.432933
		volcanoTemp     1379.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.228, 0.198, 0.162, 0.000)
		colorShelf     (0.234, 0.204, 0.185, 0.000)
		colorBeach     (0.275, 0.239, 0.220, 0.000)
		colorDesert    (0.298, 0.256, 0.214, 0.000)
		colorLowland   (0.328, 0.273, 0.243, 0.000)
		colorUpland    (0.363, 0.332, 0.295, 0.000)
		colorRock      (0.392, 0.361, 0.318, 0.000)
		colorSnow      (0.427, 0.384, 0.335, 1.000)
		BumpHeight      0.179339
		BumpOffset      0.0358677
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0631623
		GasToDust   0.25
		Particles   1107
		GasBright   0.112009
		DustBright  0.870669
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   14.9026
		Period          76.5413
		Eccentricity    0.962024
		Inclination     -40.2995
		AscendingNode   58.4878
		ArgOfPericenter 118.095
		MeanAnomaly     124.182
	}
}

Comet	"Crait System C110"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            2.07977e-011
	Radius          3.56257
	InertiaMoment   0.398007

	Oblateness      0.0209386

	RotationPeriod  31.3754
	Obliquity       59.4635
	EqAscendNode    63.747

	AbsMagn         8.34437
	SlopeParam      4.49736
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.535 0.531 0.526)

	Surface
	{
		SurfStyle       0.189613
		OceanStyle      0.418855
		Randomize      (0.942, 0.777, -0.902)
		colorDistMagn   0.642985
		colorDistFreq   0.00780496
		detailScale     97.282
		colorConversion true
		snowLevel       2
		tropicLatitude  0.695335
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.666262
		terraceProb     0.115291
		erosion         0
		montesMagn      0.603224
		montesFreq      2.82269
		montesSpiky     0.785837
		montesFraction  0.570004
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0274853
		hillsFraction   0.614566
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.210103
		craterFreq      0.197054
		craterDensity   0.880872
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.624209
		volcanoTemp     1746.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.214, 0.212, 0.210, 0.000)
		colorShelf     (0.227, 0.225, 0.223, 0.000)
		colorBeach     (0.241, 0.239, 0.237, 0.000)
		colorDesert    (0.254, 0.252, 0.250, 0.000)
		colorLowland   (0.268, 0.265, 0.263, 0.000)
		colorUpland    (0.281, 0.279, 0.276, 0.000)
		colorRock      (0.294, 0.292, 0.289, 0.000)
		colorSnow      (0.308, 0.305, 0.302, 1.000)
		BumpHeight      3.20632
		BumpOffset      0.641263
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.544354
		GasToDust   0.25
		Particles   2079
		GasBright   0.115438
		DustBright  0.551726
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   15.3736
		Period          80.1979
		Eccentricity    0.957996
		Inclination     77.6455
		AscendingNode   10.4531
		ArgOfPericenter -11.1548
		MeanAnomaly     57.1489
	}
}

Comet	"Crait System C111"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.60855e-007
	Radius          77.876
	InertiaMoment   0.399755

	Oblateness      0.032561

	RotationPeriod  29.3352
	Obliquity       12.6692
	EqAscendNode    48.3244

	AbsMagn         4.58403
	SlopeParam      5.10836
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.662 0.509 0.451)

	Surface
	{
		SurfStyle       0.192383
		OceanStyle      0.917199
		Randomize      (-0.683, -0.030, -0.312)
		colorDistMagn   0.402333
		colorDistFreq   1.46356
		detailScale     2126.53
		colorConversion true
		snowLevel       2
		tropicLatitude  0.942491
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.588165
		terraceProb     0.202038
		erosion         0
		montesMagn      0.500824
		montesFreq      2.63573
		montesSpiky     0.817937
		montesFraction  0.576034
		dunesFraction   0
		hillsMagn       0
		hillsFreq       15.1106
		hillsFraction   0.533495
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.200301
		craterFreq      0.267372
		craterDensity   1.08836
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.530435
		volcanoTemp     1267.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.265, 0.204, 0.180, 0.000)
		colorShelf     (0.281, 0.217, 0.192, 0.000)
		colorBeach     (0.298, 0.229, 0.203, 0.000)
		colorDesert    (0.314, 0.242, 0.214, 0.000)
		colorLowland   (0.331, 0.255, 0.226, 0.000)
		colorUpland    (0.348, 0.267, 0.237, 0.000)
		colorRock      (0.364, 0.280, 0.248, 0.000)
		colorSnow      (0.381, 0.293, 0.259, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0816088
		DustBright  0.270042
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   14.6847
		Period          74.868
		Eccentricity    0.971278
		Inclination     -104.214
		AscendingNode   116.439
		ArgOfPericenter 127.519
		MeanAnomaly     159.88
	}
}

Comet	"Crait System C112"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            4.95283e-015
	Radius          0.220426
	InertiaMoment   0.398607

	Oblateness      0.0277058

	RotationPeriod  27.2331
	Obliquity       325.875
	EqAscendNode    32.9019

	AbsMagn         12.1672
	SlopeParam      5.8487
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.516 0.513 0.505)

	Surface
	{
		SurfStyle       0.335064
		OceanStyle      0.322849
		Randomize      (0.890, -0.011, 0.674)
		colorDistMagn   0.799625
		colorDistFreq   2.83501e-005
		detailScale     6.01911
		colorConversion true
		snowLevel       2
		tropicLatitude  0.938172
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.404209
		terraceProb     0.339369
		erosion         0
		montesMagn      0.413043
		montesFreq      3.02812
		montesSpiky     0.994505
		montesFraction  0.758209
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000141654
		hillsFraction   0.536825
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24509
		craterFreq      0.218337
		craterDensity   0.826236
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.487152
		volcanoTemp     1679.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.207, 0.205, 0.202, 0.000)
		colorShelf     (0.219, 0.218, 0.215, 0.000)
		colorBeach     (0.232, 0.231, 0.227, 0.000)
		colorDesert    (0.245, 0.243, 0.240, 0.000)
		colorLowland   (0.258, 0.256, 0.253, 0.000)
		colorUpland    (0.271, 0.269, 0.265, 0.000)
		colorRock      (0.284, 0.282, 0.278, 0.000)
		colorSnow      (0.297, 0.295, 0.291, 1.000)
		BumpHeight      0.198384
		BumpOffset      0.0396767
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.095988
		GasToDust   0.25
		Particles   1173
		GasBright   0.243415
		DustBright  0.592722
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   14.7767
		Period          75.5727
		Eccentricity    0.97547
		Inclination     81.2926
		AscendingNode   148.238
		ArgOfPericenter 131.311
		MeanAnomaly     -160.885
	}
}

Comet	"Crait System C113"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            3.83066e-011
	Radius          4.82366
	InertiaMoment   0.396371

	Oblateness      0.0439706

	RotationPeriod  25.0577
	Obliquity       279.081
	EqAscendNode    17.4793

	AbsMagn         8.13534
	SlopeParam      7.01917
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.690 0.564 0.453)

	Surface
	{
		SurfStyle       0.313417
		OceanStyle      0.126851
		Randomize      (-0.636, -0.966, 0.114)
		colorDistMagn   0.366479
		colorDistFreq   0.01216
		detailScale     131.718
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999966
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.518238
		terraceProb     0.382768
		erosion         0
		montesMagn      0.510974
		montesFreq      3.07674
		montesSpiky     0.920502
		montesFraction  0.154672
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0237185
		hillsFraction   0.704835
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258318
		craterFreq      0.254228
		craterDensity   0.786587
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.532887
		volcanoTemp     1520.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.276, 0.226, 0.181, 0.000)
		colorShelf     (0.293, 0.240, 0.192, 0.000)
		colorBeach     (0.310, 0.254, 0.204, 0.000)
		colorDesert    (0.328, 0.268, 0.215, 0.000)
		colorLowland   (0.345, 0.282, 0.226, 0.000)
		colorUpland    (0.362, 0.296, 0.238, 0.000)
		colorRock      (0.379, 0.310, 0.249, 0.000)
		colorSnow      (0.397, 0.325, 0.260, 1.000)
		BumpHeight      4.34129
		BumpOffset      0.868259
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.57718
		GasToDust   0.25
		Particles   2145
		GasBright   0.182304
		DustBright  0.33832
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   8.43527
		Period          32.5948
		Eccentricity    0.952613
		Inclination     26.1001
		AscendingNode   -110.201
		ArgOfPericenter 148.513
		MeanAnomaly     -24.5304
	}
}

Comet	"Crait System C114"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            2.96274e-007
	Radius          86.0442
	InertiaMoment   0.399101

	Oblateness      0.0393935

	RotationPeriod  22.795
	Obliquity       232.286
	EqAscendNode    2.05668

	AbsMagn         4.2732
	SlopeParam      2.35332
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.488 0.485 0.480)

	Surface
	{
		SurfStyle       0.811226
		OceanStyle      0.443432
		Randomize      (0.517, -0.720, -0.249)
		colorDistMagn   0.279269
		colorDistFreq   5.47784
		detailScale     2349.58
		colorConversion true
		snowLevel       2
		tropicLatitude  0.840192
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.427409
		terraceProb     0.149622
		erosion         0
		montesMagn      0.43595
		montesFreq      3.12739
		montesSpiky     0.941178
		montesFraction  0.730034
		dunesFraction   0
		hillsMagn       0
		hillsFreq       12.6455
		hillsFraction   0.724751
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.199556
		craterFreq      0.297025
		craterDensity   0.890617
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.512899
		volcanoTemp     1909.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.190, 0.165, 0.134, 0.000)
		colorShelf     (0.195, 0.170, 0.154, 0.000)
		colorBeach     (0.229, 0.199, 0.182, 0.000)
		colorDesert    (0.249, 0.213, 0.178, 0.000)
		colorLowland   (0.273, 0.228, 0.202, 0.000)
		colorUpland    (0.302, 0.276, 0.245, 0.000)
		colorRock      (0.327, 0.301, 0.264, 0.000)
		colorSnow      (0.356, 0.320, 0.278, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.083933
		DustBright  0.121177
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   11.374
		Period          51.035
		Eccentricity    0.976282
		Inclination     107.475
		AscendingNode   -61.6252
		ArgOfPericenter 32.1481
		MeanAnomaly     -35.5535
	}
}

Comet	"Crait System C115"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            9.1225e-015
	Radius          0.29878
	InertiaMoment   0.397633

	Oblateness      0.0663326

	RotationPeriod  20.4281
	Obliquity       185.492
	EqAscendNode    346.634

	AbsMagn         11.8236
	SlopeParam      3.0491
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.704 0.627 0.586)

	Surface
	{
		SurfStyle       0.320383
		OceanStyle      0.913505
		Randomize      (-0.780, 0.467, 0.345)
		colorDistMagn   0.518747
		colorDistFreq   6.78272e-005
		detailScale     8.15868
		colorConversion true
		snowLevel       2
		tropicLatitude  0.922233
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.750811
		terraceProb     0.329733
		erosion         0
		montesMagn      0.444345
		montesFreq      3.83669
		montesSpiky     0.995137
		montesFraction  0.689977
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000229822
		hillsFraction   0.808327
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230633
		craterFreq      0.247097
		craterDensity   0.995251
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.490657
		volcanoTemp     1262.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.281, 0.251, 0.234, 0.000)
		colorShelf     (0.299, 0.266, 0.249, 0.000)
		colorBeach     (0.317, 0.282, 0.264, 0.000)
		colorDesert    (0.334, 0.298, 0.278, 0.000)
		colorLowland   (0.352, 0.313, 0.293, 0.000)
		colorUpland    (0.369, 0.329, 0.308, 0.000)
		colorRock      (0.387, 0.345, 0.322, 0.000)
		colorSnow      (0.405, 0.360, 0.337, 1.000)
		BumpHeight      0.268902
		BumpOffset      0.0537804
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.128814
		GasToDust   0.25
		Particles   1240
		GasBright   0.322907
		DustBright  0.36669
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   16.2744
		Period          87.349
		Eccentricity    0.967533
		Inclination     109.873
		AscendingNode   -57.5774
		ArgOfPericenter -88.5388
		MeanAnomaly     49.5129
	}
}

Comet	"Crait System C116"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            7.0556e-011
	Radius          5.32269
	InertiaMoment   0.399545

	Oblateness      0.0633565

	RotationPeriod  17.9354
	Obliquity       138.698
	EqAscendNode    331.211

	AbsMagn         7.92667
	SlopeParam      3.64374
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.674 0.670 0.667)

	Surface
	{
		SurfStyle       0.530836
		OceanStyle      0.222262
		Randomize      (0.854, -0.525, 0.041)
		colorDistMagn   0.907999
		colorDistFreq   0.0185398
		detailScale     145.345
		colorConversion true
		snowLevel       2
		tropicLatitude  0.899255
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.522516
		terraceProb     0.496488
		erosion         0
		montesMagn      0.51719
		montesFreq      3.74163
		montesSpiky     0.968176
		montesFraction  0.875916
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0790055
		hillsFraction   0.463723
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2702
		craterFreq      0.23788
		craterDensity   0.937936
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49911
		volcanoTemp     1685.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.263, 0.228, 0.187, 0.000)
		colorShelf     (0.270, 0.235, 0.213, 0.000)
		colorBeach     (0.317, 0.275, 0.253, 0.000)
		colorDesert    (0.344, 0.295, 0.247, 0.000)
		colorLowland   (0.377, 0.315, 0.280, 0.000)
		colorUpland    (0.418, 0.382, 0.340, 0.000)
		colorRock      (0.452, 0.416, 0.367, 0.000)
		colorSnow      (0.492, 0.442, 0.387, 1.000)
		BumpHeight      4.79042
		BumpOffset      0.958084
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.610006
		GasToDust   0.25
		Particles   2212
		GasBright   0.0102125
		DustBright  0.363871
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   13.5607
		Period          66.4394
		Eccentricity    0.983577
		Inclination     23.7136
		AscendingNode   -160.608
		ArgOfPericenter -18.121
		MeanAnomaly     155.374
	}
}

Comet	"Crait System C117"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            5.457e-007
	Radius          116.769
	InertiaMoment   0.39833

	Oblateness      0.118471

	RotationPeriod  15.2896
	Obliquity       91.9034
	EqAscendNode    315.789

	AbsMagn         3.93807
	SlopeParam      4.20786
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.501 0.494 0.490)

	Surface
	{
		SurfStyle       0.750952
		OceanStyle      0.669728
		Randomize      (0.026, 0.474, 0.002)
		colorDistMagn   0.723935
		colorDistFreq   11.8032
		detailScale     3188.57
		colorConversion true
		snowLevel       2
		tropicLatitude  0.984818
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.401365
		terraceProb     0.301361
		erosion         0
		montesMagn      0.368578
		montesFreq      2.34825
		montesSpiky     0.896523
		montesFraction  0.492848
		dunesFraction   0
		hillsMagn       0
		hillsFreq       36.3922
		hillsFraction   0.642645
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236404
		craterFreq      0.458314
		craterDensity   0.963263
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.488152
		volcanoTemp     1753.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.195, 0.168, 0.137, 0.000)
		colorShelf     (0.201, 0.173, 0.157, 0.000)
		colorBeach     (0.236, 0.203, 0.186, 0.000)
		colorDesert    (0.256, 0.218, 0.181, 0.000)
		colorLowland   (0.281, 0.232, 0.206, 0.000)
		colorUpland    (0.311, 0.282, 0.250, 0.000)
		colorRock      (0.336, 0.307, 0.269, 0.000)
		colorSnow      (0.366, 0.326, 0.284, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0741334
		DustBright  0.784436
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   13.5513
		Period          66.3697
		Eccentricity    0.964016
		Inclination     166.688
		AscendingNode   26.516
		ArgOfPericenter -75.9236
		MeanAnomaly     -160.431
	}
}

Comet	"Crait System C118"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.68025e-014
	Radius          0.329218
	InertiaMoment   0.399968

	Oblateness      0.130768

	RotationPeriod  12.454
	Obliquity       45.1091
	EqAscendNode    300.366

	AbsMagn         11.5061
	SlopeParam      4.78938
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.712 0.631 0.566)

	Surface
	{
		SurfStyle       0.528703
		OceanStyle      0.521843
		Randomize      (0.930, -0.480, 0.583)
		colorDistMagn   0.147148
		colorDistFreq   1.04074e-005
		detailScale     8.98985
		colorConversion true
		snowLevel       2
		tropicLatitude  0.711135
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.633215
		terraceProb     0.184023
		erosion         0
		montesMagn      0.307817
		montesFreq      2.60261
		montesSpiky     0.857177
		montesFraction  0.184035
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000226762
		hillsFraction   0.765017
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.21218
		craterFreq      0.229515
		craterDensity   1.02307
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.416525
		volcanoTemp     1164.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.278, 0.214, 0.159, 0.000)
		colorShelf     (0.285, 0.221, 0.181, 0.000)
		colorBeach     (0.335, 0.259, 0.215, 0.000)
		colorDesert    (0.363, 0.278, 0.209, 0.000)
		colorLowland   (0.399, 0.297, 0.238, 0.000)
		colorUpland    (0.442, 0.360, 0.289, 0.000)
		colorRock      (0.477, 0.391, 0.311, 0.000)
		colorSnow      (0.520, 0.416, 0.328, 1.000)
		BumpHeight      0.296296
		BumpOffset      0.0592593
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.16164
		GasToDust   0.25
		Particles   1306
		GasBright   0.0789552
		DustBright  0.464101
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   11.8728
		Period          54.4287
		Eccentricity    0.970654
		Inclination     -176.763
		AscendingNode   87.7402
		ArgOfPericenter -107.232
		MeanAnomaly     110.508
	}
}

Comet	"Crait System C119"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.29955e-010
	Radius          7.23274
	InertiaMoment   0.398866

	Oblateness      0.249

	RotationPeriod  9.37871
	Obliquity       358.315
	EqAscendNode    284.944

	AbsMagn         7.71781
	SlopeParam      5.44848
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.485 0.410 0.357)

	Surface
	{
		SurfStyle       0.421192
		OceanStyle      0.946626
		Randomize      (0.635, 0.461, 0.667)
		colorDistMagn   0.231136
		colorDistFreq   0.0194537
		detailScale     197.502
		colorConversion true
		snowLevel       2
		tropicLatitude  0.20313
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.464004
		terraceProb     0.166842
		erosion         0
		montesMagn      0.577027
		montesFreq      3.83743
		montesSpiky     0.829054
		montesFraction  0.448004
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0839755
		hillsFraction   0.654783
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253621
		craterFreq      0.17696
		craterDensity   0.89748
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.578176
		volcanoTemp     1788.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.194, 0.164, 0.143, 0.000)
		colorShelf     (0.206, 0.174, 0.152, 0.000)
		colorBeach     (0.218, 0.185, 0.161, 0.000)
		colorDesert    (0.231, 0.195, 0.169, 0.000)
		colorLowland   (0.243, 0.205, 0.178, 0.000)
		colorUpland    (0.255, 0.215, 0.187, 0.000)
		colorRock      (0.267, 0.226, 0.196, 0.000)
		colorSnow      (0.279, 0.236, 0.205, 1.000)
		BumpHeight      6.50947
		BumpOffset      1.30189
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.642832
		GasToDust   0.25
		Particles   2278
		GasBright   0.0465179
		DustBright  0.181025
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   9.85266
		Period          41.1463
		Eccentricity    0.983186
		Inclination     167.812
		AscendingNode   109.904
		ArgOfPericenter 65.8499
		MeanAnomaly     30.0847
	}
}

Comet	"Crait System C120"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            4.00141e-018
	Radius          0.0203596
	InertiaMoment   0.39715

	Oblateness      0.249

	RotationPeriod  5.99221
	Obliquity       311.521
	EqAscendNode    269.521

	AbsMagn         3.57167
	SlopeParam      6.32632
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.824 0.764 0.739)

	Surface
	{
		SurfStyle       0.649522
		OceanStyle      0.710562
		Randomize      (-0.134, 0.053, 0.569)
		colorDistMagn   0.724475
		colorDistFreq   5.76354e-008
		detailScale     0.555952
		colorConversion true
		snowLevel       2
		tropicLatitude  0.781092
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.397447
		terraceProb     0.25986
		erosion         0
		montesMagn      0.527231
		montesFreq      2.73164
		montesSpiky     0.979227
		montesFraction  0.646341
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.95536e-007
		hillsFraction   0.53288
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240109
		craterFreq      0.271595
		craterDensity   1.02091
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.504472
		volcanoTemp     1417.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.321, 0.260, 0.207, 0.000)
		colorShelf     (0.330, 0.268, 0.237, 0.000)
		colorBeach     (0.387, 0.313, 0.281, 0.000)
		colorDesert    (0.420, 0.336, 0.273, 0.000)
		colorLowland   (0.462, 0.359, 0.310, 0.000)
		colorUpland    (0.511, 0.436, 0.377, 0.000)
		colorRock      (0.552, 0.474, 0.407, 0.000)
		colorSnow      (0.602, 0.504, 0.429, 1.000)
		BumpHeight      0.0183236
		BumpOffset      0.00366472
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.187606
		DustBright  0.524423
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   11.1218
		Period          49.3472
		Eccentricity    0.977997
		Inclination     47.5565
		AscendingNode   71.3092
		ArgOfPericenter 154.522
		MeanAnomaly     -171.021
	}
}

Comet	"Crait System C121"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            3.09481e-014
	Radius          0.448002
	InertiaMoment   0.39933

	Oblateness      0.00109979

	RotationPeriod  158.654
	Obliquity       264.726
	EqAscendNode    254.099

	AbsMagn         11.2093
	SlopeParam      8.63004
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.511 0.505 0.502)

	Surface
	{
		SurfStyle       0.857105
		OceanStyle      0.148867
		Randomize      (-0.337, -0.269, -0.469)
		colorDistMagn   0.831125
		colorDistFreq   8.71002e-005
		detailScale     12.2334
		colorConversion true
		snowLevel       2
		tropicLatitude  0.965321
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.269924
		terraceProb     0.194891
		erosion         0
		montesMagn      0.470959
		montesFreq      2.78645
		montesSpiky     0.959995
		montesFraction  0.596737
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000461762
		hillsFraction   0.738903
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256635
		craterFreq      0.219579
		craterDensity   0.905082
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.501734
		volcanoTemp     1691.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.174, 0.177, 0.201, 0.050)
		colorShelf     (0.204, 0.207, 0.231, 0.040)
		colorBeach     (0.235, 0.237, 0.261, 0.030)
		colorDesert    (0.266, 0.268, 0.296, 0.020)
		colorLowland   (0.297, 0.298, 0.326, 0.030)
		colorUpland    (0.327, 0.328, 0.356, 0.050)
		colorRock      (0.358, 0.358, 0.396, 0.020)
		colorSnow      (0.358, 0.358, 0.396, 1.000)
		BumpHeight      0.403202
		BumpOffset      0.0806404
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.194466
		GasToDust   0.25
		Particles   1372
		GasBright   0.127887
		DustBright  0.268629
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   15.1873
		Period          78.7445
		Eccentricity    0.973223
		Inclination     -69.9793
		AscendingNode   75.7943
		ArgOfPericenter 5.00637
		MeanAnomaly     32.7833
	}
}

Comet	"Crait System C122"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            2.39361e-010
	Radius          7.94279
	InertiaMoment   0.398016

	Oblateness      0.00135275

	RotationPeriod  121.132
	Obliquity       217.932
	EqAscendNode    238.676

	AbsMagn         7.50817
	SlopeParam      2.71593
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.694 0.689 0.688)

	Surface
	{
		SurfStyle       0.608676
		OceanStyle      0.401448
		Randomize      (-0.650, -0.050, -0.922)
		colorDistMagn   0.48348
		colorDistFreq   0.0307109
		detailScale     216.891
		colorConversion true
		snowLevel       2
		tropicLatitude  0.959803
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.352069
		terraceProb     0.321226
		erosion         0
		montesMagn      0.459587
		montesFreq      3.57855
		montesSpiky     0.999455
		montesFraction  0.799503
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.17382
		hillsFraction   0.752008
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243631
		craterFreq      0.237716
		craterDensity   1.03019
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.531357
		volcanoTemp     1552.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.270, 0.234, 0.193, 0.000)
		colorShelf     (0.277, 0.241, 0.220, 0.000)
		colorBeach     (0.326, 0.283, 0.261, 0.000)
		colorDesert    (0.354, 0.303, 0.254, 0.000)
		colorLowland   (0.388, 0.324, 0.289, 0.000)
		colorUpland    (0.430, 0.393, 0.351, 0.000)
		colorRock      (0.465, 0.427, 0.378, 0.000)
		colorSnow      (0.506, 0.455, 0.399, 1.000)
		BumpHeight      7.14852
		BumpOffset      1.4297
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.675658
		GasToDust   0.25
		Particles   2344
		GasBright   0.336166
		DustBright  0.544837
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   14.7149
		Period          75.0996
		Eccentricity    0.96723
		Inclination     -108.455
		AscendingNode   -24.5582
		ArgOfPericenter -7.50346
		MeanAnomaly     -132.924
	}
}

Comet	"Crait System C123"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            7.37011e-018
	Radius          0.0277497
	InertiaMoment   0.399761

	Oblateness      0.00226415

	RotationPeriod  110.548
	Obliquity       171.138
	EqAscendNode    223.253

	AbsMagn         3.16378
	SlopeParam      3.34954
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.586 0.582 0.577)

	Surface
	{
		SurfStyle       0.298332
		OceanStyle      0.878709
		Randomize      (-0.318, -0.103, -0.342)
		colorDistMagn   0.199335
		colorDistFreq   4.99394e-007
		detailScale     0.757752
		colorConversion true
		snowLevel       2
		tropicLatitude  0.91393
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.366247
		terraceProb     0.179419
		erosion         0
		montesMagn      0.497166
		montesFreq      3.08167
		montesSpiky     0.937534
		montesFraction  0.721208
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.01845e-006
		hillsFraction   0.490998
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246569
		craterFreq      0.274567
		craterDensity   0.971839
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.477162
		volcanoTemp     1443.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.234, 0.233, 0.231, 0.000)
		colorShelf     (0.249, 0.247, 0.245, 0.000)
		colorBeach     (0.264, 0.262, 0.260, 0.000)
		colorDesert    (0.278, 0.276, 0.274, 0.000)
		colorLowland   (0.293, 0.291, 0.289, 0.000)
		colorUpland    (0.307, 0.305, 0.303, 0.000)
		colorRock      (0.322, 0.320, 0.317, 0.000)
		colorSnow      (0.337, 0.335, 0.332, 1.000)
		BumpHeight      0.0249747
		BumpOffset      0.00499495
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.249164
		DustBright  0.316325
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   9.11911
		Period          36.6378
		Eccentricity    0.958431
		Inclination     -68.0716
		AscendingNode   -104.956
		ArgOfPericenter -2.0436
		MeanAnomaly     99.5575
	}
}

Comet	"Crait System C124"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            5.70025e-014
	Radius          0.490997
	InertiaMoment   0.398614

	Oblateness      0.0018381

	RotationPeriod  103.611
	Obliquity       124.343
	EqAscendNode    207.831

	AbsMagn         10.9293
	SlopeParam      3.92267
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.801 0.799 0.796)

	Surface
	{
		SurfStyle       0.470118
		OceanStyle      0.104989
		Randomize      (0.127, -0.738, 0.571)
		colorDistMagn   0.631152
		colorDistFreq   8.50764e-005
		detailScale     13.4075
		colorConversion true
		snowLevel       2
		tropicLatitude  0.713564
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.582367
		terraceProb     0.129543
		erosion         0
		montesMagn      0.658111
		montesFreq      2.97042
		montesSpiky     0.915656
		montesFraction  0.323415
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000606374
		hillsFraction   0.609034
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240203
		craterFreq      0.173808
		craterDensity   0.808543
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.508157
		volcanoTemp     1327.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.320, 0.318, 0.000)
		colorShelf     (0.340, 0.340, 0.338, 0.000)
		colorBeach     (0.360, 0.360, 0.358, 0.000)
		colorDesert    (0.380, 0.380, 0.378, 0.000)
		colorLowland   (0.400, 0.400, 0.398, 0.000)
		colorUpland    (0.420, 0.420, 0.418, 0.000)
		colorRock      (0.441, 0.440, 0.438, 0.000)
		colorSnow      (0.461, 0.460, 0.458, 1.000)
		BumpHeight      0.441897
		BumpOffset      0.0883795
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.227292
		GasToDust   0.25
		Particles   1438
		GasBright   0.124903
		DustBright  0.125072
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   8.05684
		Period          30.4262
		Eccentricity    0.940803
		Inclination     -168.985
		AscendingNode   21.4498
		ArgOfPericenter 168.396
		MeanAnomaly     87.3917
	}
}

Comet	"Crait System C125"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            4.40874e-010
	Radius          10.8452
	InertiaMoment   0.396398

	Oblateness      0.00282285

	RotationPeriod  98.2813
	Obliquity       77.549
	EqAscendNode    192.408

	AbsMagn         7.29717
	SlopeParam      4.4894
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.726 0.681 0.618)

	Surface
	{
		SurfStyle       0.866422
		OceanStyle      0.567822
		Randomize      (0.496, -0.566, -0.229)
		colorDistMagn   0.965263
		colorDistFreq   0.0304998
		detailScale     296.146
		colorConversion true
		snowLevel       2
		tropicLatitude  0.97642
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.446454
		terraceProb     0.365203
		erosion         0
		montesMagn      0.505957
		montesFreq      3.18247
		montesSpiky     0.986248
		montesFraction  0.367039
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.257553
		hillsFraction   0.622925
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25783
		craterFreq      0.198656
		craterDensity   0.935169
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.488462
		volcanoTemp     1731.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.247, 0.238, 0.247, 0.050)
		colorShelf     (0.290, 0.279, 0.284, 0.040)
		colorBeach     (0.334, 0.320, 0.321, 0.030)
		colorDesert    (0.378, 0.361, 0.365, 0.020)
		colorLowland   (0.421, 0.402, 0.402, 0.030)
		colorUpland    (0.465, 0.443, 0.439, 0.050)
		colorRock      (0.508, 0.484, 0.488, 0.020)
		colorSnow      (0.508, 0.484, 0.488, 1.000)
		BumpHeight      9.76068
		BumpOffset      1.95214
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.708484
		GasToDust   0.25
		Particles   2411
		GasBright   0.0431183
		DustBright  0.691344
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   12.3499
		Period          57.7428
		Eccentricity    0.973459
		Inclination     172.816
		AscendingNode   -89.0765
		ArgOfPericenter -88.7503
		MeanAnomaly     127.859
	}
}

Comet	"Crait System C126"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.35748e-017
	Radius          0.0303431
	InertiaMoment   0.399107

	Oblateness      0.00222345

	RotationPeriod  93.8704
	Obliquity       30.7547
	EqAscendNode    176.986

	AbsMagn         2.69824
	SlopeParam      5.09937
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.673 0.667 0.665)

	Surface
	{
		SurfStyle       0.62151
		OceanStyle      0.0261456
		Randomize      (-0.152, 0.533, -0.755)
		colorDistMagn   0.928604
		colorDistFreq   6.49791e-007
		detailScale     0.828568
		colorConversion true
		snowLevel       2
		tropicLatitude  0.97792
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.407967
		terraceProb     0.145452
		erosion         0
		montesMagn      0.403975
		montesFreq      3.67744
		montesSpiky     0.927462
		montesFraction  0.75441
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.69673e-006
		hillsFraction   0.524016
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235328
		craterFreq      0.275584
		craterDensity   0.808952
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.553691
		volcanoTemp     1409.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.262, 0.227, 0.186, 0.000)
		colorShelf     (0.269, 0.234, 0.213, 0.000)
		colorBeach     (0.316, 0.274, 0.253, 0.000)
		colorDesert    (0.343, 0.294, 0.246, 0.000)
		colorLowland   (0.377, 0.314, 0.279, 0.000)
		colorUpland    (0.417, 0.380, 0.339, 0.000)
		colorRock      (0.451, 0.414, 0.366, 0.000)
		colorSnow      (0.491, 0.440, 0.385, 1.000)
		BumpHeight      0.0273088
		BumpOffset      0.00546175
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0493323
		DustBright  0.369617
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   11.981
		Period          55.1746
		Eccentricity    0.970689
		Inclination     132.799
		AscendingNode   177.63
		ArgOfPericenter -56.5212
		MeanAnomaly     140.46
	}
}

Comet	"Crait System C127"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.04992e-013
	Radius          0.671766
	InertiaMoment   0.397644

	Oblateness      0.00337067

	RotationPeriod  90.0578
	Obliquity       343.96
	EqAscendNode    161.563

	AbsMagn         10.6629
	SlopeParam      5.83691
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.492 0.488 0.486)

	Surface
	{
		SurfStyle       0.491045
		OceanStyle      0.548394
		Randomize      (0.801, 0.676, 0.868)
		colorDistMagn   0.528986
		colorDistFreq   0.000390309
		detailScale     18.3437
		colorConversion true
		snowLevel       2
		tropicLatitude  0.527799
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.530388
		terraceProb     0.504113
		erosion         0
		montesMagn      0.485146
		montesFreq      2.73875
		montesSpiky     0.858373
		montesFraction  0.843335
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000749019
		hillsFraction   0.619265
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239823
		craterFreq      0.210083
		craterDensity   0.86793
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.418999
		volcanoTemp     1514.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.197, 0.195, 0.194, 0.000)
		colorShelf     (0.209, 0.208, 0.207, 0.000)
		colorBeach     (0.222, 0.220, 0.219, 0.000)
		colorDesert    (0.234, 0.232, 0.231, 0.000)
		colorLowland   (0.246, 0.244, 0.243, 0.000)
		colorUpland    (0.259, 0.256, 0.255, 0.000)
		colorRock      (0.271, 0.269, 0.267, 0.000)
		colorSnow      (0.283, 0.281, 0.279, 1.000)
		BumpHeight      0.604589
		BumpOffset      0.120918
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.260118
		GasToDust   0.25
		Particles   1505
		GasBright   0.159725
		DustBright  0.74371
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   12.6418
		Period          59.8014
		Eccentricity    0.981318
		Inclination     -46.0397
		AscendingNode   156.385
		ArgOfPericenter 66.0284
		MeanAnomaly     -161.411
	}
}

Comet	"Crait System C128"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            8.12033e-010
	Radius          11.8271
	InertiaMoment   0.399551

	Oblateness      0.00258655

	RotationPeriod  86.6663
	Obliquity       297.166
	EqAscendNode    146.14

	AbsMagn         7.0842
	SlopeParam      6.99527
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.503 0.499 0.496)

	Surface
	{
		SurfStyle       0.245789
		OceanStyle      0.681924
		Randomize      (0.918, -0.834, -0.582)
		colorDistMagn   0.735325
		colorDistFreq   0.0885746
		detailScale     322.958
		colorConversion true
		snowLevel       2
		tropicLatitude  0.737525
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.279516
		terraceProb     0.299298
		erosion         0
		montesMagn      0.510725
		montesFreq      3.32421
		montesSpiky     0.747488
		montesFraction  0.561014
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.205472
		hillsFraction   0.626497
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245039
		craterFreq      0.1945
		craterDensity   0.981119
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.541322
		volcanoTemp     1480.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.201, 0.200, 0.199, 0.000)
		colorShelf     (0.214, 0.212, 0.211, 0.000)
		colorBeach     (0.226, 0.225, 0.223, 0.000)
		colorDesert    (0.239, 0.237, 0.236, 0.000)
		colorLowland   (0.252, 0.250, 0.248, 0.000)
		colorUpland    (0.264, 0.262, 0.261, 0.000)
		colorRock      (0.277, 0.275, 0.273, 0.000)
		colorSnow      (0.289, 0.287, 0.285, 1.000)
		BumpHeight      10.6444
		BumpOffset      2.12887
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.74131
		GasToDust   0.25
		Particles   2477
		GasBright   0.138657
		DustBright  0.449265
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   12.9612
		Period          62.0825
		Eccentricity    0.964727
		Inclination     -72.6774
		AscendingNode   -17.2196
		ArgOfPericenter -175.741
		MeanAnomaly     -121.102
	}
}

Comet	"Crait System C129"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            2.50031e-017
	Radius          0.04161
	InertiaMoment   0.398337

	Oblateness      0.00391481

	RotationPeriod  83.5872
	Obliquity       250.372
	EqAscendNode    130.718

	AbsMagn         2.14714
	SlopeParam      2.34247
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.488 0.486 0.481)

	Surface
	{
		SurfStyle       0.915092
		OceanStyle      0.673023
		Randomize      (0.532, -0.386, -0.413)
		colorDistMagn   0.543522
		colorDistFreq   1.48674e-006
		detailScale     1.13623
		colorConversion true
		snowLevel       2
		tropicLatitude  0.79933
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.46801
		terraceProb     0.222922
		erosion         0
		montesMagn      0.669635
		montesFreq      2.75761
		montesSpiky     0.871283
		montesFraction  0.596895
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.84532e-006
		hillsFraction   0.531993
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256862
		craterFreq      0.215111
		craterDensity   0.951075
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.468424
		volcanoTemp     1476.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.166, 0.170, 0.192, 0.050)
		colorShelf     (0.195, 0.199, 0.221, 0.040)
		colorBeach     (0.225, 0.228, 0.250, 0.030)
		colorDesert    (0.254, 0.257, 0.284, 0.020)
		colorLowland   (0.283, 0.287, 0.313, 0.030)
		colorUpland    (0.312, 0.316, 0.342, 0.050)
		colorRock      (0.342, 0.345, 0.380, 0.020)
		colorSnow      (0.342, 0.345, 0.380, 1.000)
		BumpHeight      0.037449
		BumpOffset      0.00748981
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0803301
		DustBright  0.192079
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   15.2741
		Period          79.4211
		Eccentricity    0.979091
		Inclination     22.4588
		AscendingNode   143.825
		ArgOfPericenter -55.0201
		MeanAnomaly     -33.5112
	}
}

Comet	"Crait System C130"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.93381e-013
	Radius          0.730251
	InertiaMoment   0.399973

	Oblateness      0.00294974

	RotationPeriod  80.7486
	Obliquity       203.578
	EqAscendNode    115.295

	AbsMagn         10.4078
	SlopeParam      3.04046
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.494 0.486 0.480)

	Surface
	{
		SurfStyle       0.902539
		OceanStyle      0.501274
		Randomize      (-0.750, 0.977, -0.894)
		colorDistMagn   0.15159
		colorDistFreq   0.000134388
		detailScale     19.9407
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999861
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.728688
		terraceProb     0.194333
		erosion         0
		montesMagn      0.387012
		montesFreq      3.47116
		montesSpiky     0.892426
		montesFraction  0.602032
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00142955
		hillsFraction   0.455755
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236845
		craterFreq      0.179991
		craterDensity   0.97807
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.524062
		volcanoTemp     1972.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.168, 0.170, 0.192, 0.050)
		colorShelf     (0.198, 0.199, 0.221, 0.040)
		colorBeach     (0.227, 0.228, 0.250, 0.030)
		colorDesert    (0.257, 0.257, 0.283, 0.020)
		colorLowland   (0.286, 0.287, 0.312, 0.030)
		colorUpland    (0.316, 0.316, 0.341, 0.050)
		colorRock      (0.346, 0.345, 0.379, 0.020)
		colorSnow      (0.346, 0.345, 0.379, 1.000)
		BumpHeight      0.657226
		BumpOffset      0.131445
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.292944
		GasToDust   0.25
		Particles   1571
		GasBright   0.267891
		DustBright  0.489005
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   15.8391
		Period          83.8684
		Eccentricity    0.975872
		Inclination     83.6886
		AscendingNode   -77.7861
		ArgOfPericenter 10.7103
		MeanAnomaly     64.0441
	}
}

Comet	"Crait System C131"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.49567e-009
	Radius          16.2622
	InertiaMoment   0.398872

	Oblateness      0.00448393

	RotationPeriod  78.1004
	Obliquity       156.783
	EqAscendNode    99.8726

	AbsMagn         6.8686
	SlopeParam      3.6359
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.552 0.547 0.541)

	Surface
	{
		SurfStyle       0.116153
		OceanStyle      0.308709
		Randomize      (0.477, -0.515, 0.835)
		colorDistMagn   0.713995
		colorDistFreq   0.168507
		detailScale     444.067
		colorConversion true
		snowLevel       2
		tropicLatitude  0.98031
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.316529
		terraceProb     0.557104
		erosion         0
		montesMagn      0.493171
		montesFreq      3.15668
		montesSpiky     0.872061
		montesFraction  0.653446
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.574081
		hillsFraction   0.459321
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243969
		craterFreq      0.270891
		craterDensity   1.0224
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50534
		volcanoTemp     1345.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.221, 0.219, 0.216, 0.000)
		colorShelf     (0.235, 0.233, 0.230, 0.000)
		colorBeach     (0.249, 0.246, 0.243, 0.000)
		colorDesert    (0.262, 0.260, 0.257, 0.000)
		colorLowland   (0.276, 0.274, 0.270, 0.000)
		colorUpland    (0.290, 0.287, 0.284, 0.000)
		colorRock      (0.304, 0.301, 0.297, 0.000)
		colorSnow      (0.318, 0.315, 0.311, 1.000)
		BumpHeight      14.636
		BumpOffset      2.9272
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.774136
		GasToDust   0.25
		Particles   2543
		GasBright   0.182281
		DustBright  0.2591
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   12.5274
		Period          58.9916
		Eccentricity    0.989038
		Inclination     -122.439
		AscendingNode   -152.647
		ArgOfPericenter 161.79
		MeanAnomaly     143.031
	}
}

Comet	"Crait System C132"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            4.60526e-017
	Radius          0.0450551
	InertiaMoment   0.397165

	Oblateness      0.00328358

	RotationPeriod  75.6058
	Obliquity       109.989
	EqAscendNode    84.4501

	AbsMagn         1.45509
	SlopeParam      4.2001
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.763 0.760 0.759)

	Surface
	{
		SurfStyle       0.454664
		OceanStyle      0.155953
		Randomize      (-0.101, 0.938, -0.898)
		colorDistMagn   0.479528
		colorDistFreq   1.73275e-007
		detailScale     1.23031
		colorConversion true
		snowLevel       2
		tropicLatitude  0.986089
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.51424
		terraceProb     0.469832
		erosion         0
		montesMagn      0.478678
		montesFreq      3.47317
		montesSpiky     0.925353
		montesFraction  0.649934
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.47124e-006
		hillsFraction   0.587532
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256187
		craterFreq      0.244032
		craterDensity   0.975282
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.509719
		volcanoTemp     1664.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.305, 0.304, 0.304, 0.000)
		colorShelf     (0.324, 0.323, 0.323, 0.000)
		colorBeach     (0.343, 0.342, 0.342, 0.000)
		colorDesert    (0.362, 0.361, 0.361, 0.000)
		colorLowland   (0.381, 0.380, 0.379, 0.000)
		colorUpland    (0.400, 0.399, 0.398, 0.000)
		colorRock      (0.419, 0.418, 0.417, 0.000)
		colorSnow      (0.438, 0.437, 0.436, 1.000)
		BumpHeight      0.0405496
		BumpOffset      0.00810993
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.437032
		DustBright  0.488836
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   13.137
		Period          63.3498
		Eccentricity    0.989929
		Inclination     167.251
		AscendingNode   36.2758
		ArgOfPericenter -53.0307
		MeanAnomaly     125.102
	}
}

Comet	"Crait System C133"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            3.56184e-013
	Radius          1.00731
	InertiaMoment   0.399336

	Oblateness      0.00509756

	RotationPeriod  73.2373
	Obliquity       63.1946
	EqAscendNode    69.0275

	AbsMagn         10.1621
	SlopeParam      4.78104
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.779 0.777 0.774)

	Surface
	{
		SurfStyle       0.850096
		OceanStyle      0.816389
		Randomize      (0.928, -0.728, -0.808)
		colorDistMagn   0.635709
		colorDistFreq   0.000538403
		detailScale     27.5062
		colorConversion true
		snowLevel       2
		tropicLatitude  0.883823
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.727488
		terraceProb     0.215549
		erosion         0
		montesMagn      0.487458
		montesFreq      2.50707
		montesSpiky     0.963649
		montesFraction  0.344184
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00220774
		hillsFraction   0.595169
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2288
		craterFreq      0.217338
		craterDensity   0.960429
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.495675
		volcanoTemp     1465.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.265, 0.272, 0.309, 0.050)
		colorShelf     (0.312, 0.318, 0.356, 0.040)
		colorBeach     (0.358, 0.365, 0.402, 0.030)
		colorDesert    (0.405, 0.412, 0.456, 0.020)
		colorLowland   (0.452, 0.458, 0.503, 0.030)
		colorUpland    (0.498, 0.505, 0.549, 0.050)
		colorRock      (0.545, 0.551, 0.611, 0.020)
		colorSnow      (0.545, 0.551, 0.611, 1.000)
		BumpHeight      0.906577
		BumpOffset      0.181315
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.32577
		GasToDust   0.25
		Particles   1637
		GasBright   0.0189633
		DustBright  0.591392
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   10.0707
		Period          42.5198
		Eccentricity    0.963928
		Inclination     -40.5045
		AscendingNode   77.5549
		ArgOfPericenter 133.097
		MeanAnomaly     -48.1894
	}
}

Comet	"Crait System C134"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            2.75483e-009
	Radius          17.5186
	InertiaMoment   0.398025

	Oblateness      0.00367359

	RotationPeriod  70.9733
	Obliquity       16.4003
	EqAscendNode    53.6049

	AbsMagn         6.64965
	SlopeParam      5.43847
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.668 0.666 0.664)

	Surface
	{
		SurfStyle       0.0181988
		OceanStyle      0.621997
		Randomize      (0.830, -0.040, 0.092)
		colorDistMagn   0.615863
		colorDistFreq   0.0989596
		detailScale     478.374
		colorConversion true
		snowLevel       2
		tropicLatitude  0.979106
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.416701
		terraceProb     0.353962
		erosion         0
		montesMagn      0.56674
		montesFreq      2.48777
		montesSpiky     0.884227
		montesFraction  0.541109
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.576364
		hillsFraction   0.656465
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224276
		craterFreq      0.247464
		craterDensity   0.783439
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49494
		volcanoTemp     1539.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.267, 0.266, 0.265, 0.000)
		colorShelf     (0.284, 0.283, 0.282, 0.000)
		colorBeach     (0.300, 0.300, 0.299, 0.000)
		colorDesert    (0.317, 0.316, 0.315, 0.000)
		colorLowland   (0.334, 0.333, 0.332, 0.000)
		colorUpland    (0.351, 0.349, 0.348, 0.000)
		colorRock      (0.367, 0.366, 0.365, 0.000)
		colorSnow      (0.384, 0.383, 0.382, 1.000)
		BumpHeight      15.7667
		BumpOffset      3.15334
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.806962
		GasToDust   0.25
		Particles   2610
		GasBright   0.0265695
		DustBright  0.268272
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   14.9856
		Period          77.1814
		Eccentricity    0.979002
		Inclination     -80.3059
		AscendingNode   81.3588
		ArgOfPericenter 54.5382
		MeanAnomaly     170.779
	}
}

Comet	"Crait System C135"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            8.48232e-017
	Radius          0.0623944
	InertiaMoment   0.399766

	Oblateness      0.00577432

	RotationPeriod  68.7968
	Obliquity       329.606
	EqAscendNode    38.1823

	AbsMagn         0.48197
	SlopeParam      6.31121
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.750 0.747 0.746)

	Surface
	{
		SurfStyle       0.30464
		OceanStyle      0.796427
		Randomize      (-0.232, 0.107, -0.149)
		colorDistMagn   0.834733
		colorDistFreq   2.61027e-006
		detailScale     1.70378
		colorConversion true
		snowLevel       2
		tropicLatitude  0.988872
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.762921
		terraceProb     0.143572
		erosion         0
		montesMagn      0.405166
		montesFreq      3.99856
		montesSpiky     0.892337
		montesFraction  0.730613
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.09882e-005
		hillsFraction   0.523546
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247254
		craterFreq      0.19983
		craterDensity   0.793307
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.552191
		volcanoTemp     1275.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.300, 0.299, 0.298, 0.000)
		colorShelf     (0.319, 0.317, 0.317, 0.000)
		colorBeach     (0.338, 0.336, 0.336, 0.000)
		colorDesert    (0.356, 0.355, 0.354, 0.000)
		colorLowland   (0.375, 0.373, 0.373, 0.000)
		colorUpland    (0.394, 0.392, 0.392, 0.000)
		colorRock      (0.413, 0.411, 0.410, 0.000)
		colorSnow      (0.431, 0.429, 0.429, 1.000)
		BumpHeight      0.0561549
		BumpOffset      0.011231
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.116244
		DustBright  0.663084
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   17.927
		Period          100.986
		Eccentricity    0.981077
		Inclination     80.7975
		AscendingNode   88.7581
		ArgOfPericenter 92.9425
		MeanAnomaly     -83.5671
	}
}

Comet	"Crait System C136"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            6.56046e-013
	Radius          1.07712
	InertiaMoment   0.39862

	Oblateness      0.00406943

	RotationPeriod  66.6937
	Obliquity       282.812
	EqAscendNode    22.7597

	AbsMagn         9.92441
	SlopeParam      8.52423
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.480 0.421 0.356)

	Surface
	{
		SurfStyle       0.188327
		OceanStyle      0.948972
		Randomize      (-0.541, 0.086, -0.951)
		colorDistMagn   0.561597
		colorDistFreq   0.000933182
		detailScale     29.4125
		colorConversion true
		snowLevel       2
		tropicLatitude  0.890584
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.452688
		terraceProb     0.211818
		erosion         0
		montesMagn      0.601985
		montesFreq      2.63827
		montesSpiky     0.901962
		montesFraction  0.715663
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00281184
		hillsFraction   0.613146
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223137
		craterFreq      0.186342
		craterDensity   0.87361
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.544372
		volcanoTemp     1695.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.192, 0.168, 0.142, 0.000)
		colorShelf     (0.204, 0.179, 0.151, 0.000)
		colorBeach     (0.216, 0.189, 0.160, 0.000)
		colorDesert    (0.228, 0.200, 0.169, 0.000)
		colorLowland   (0.240, 0.211, 0.178, 0.000)
		colorUpland    (0.252, 0.221, 0.187, 0.000)
		colorRock      (0.264, 0.232, 0.196, 0.000)
		colorSnow      (0.276, 0.242, 0.205, 1.000)
		BumpHeight      0.969405
		BumpOffset      0.193881
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.358596
		GasToDust   0.25
		Particles   1704
		GasBright   0.0965686
		DustBright  0.367246
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   14.8413
		Period          76.0694
		Eccentricity    0.979309
		Inclination     -138.389
		AscendingNode   163.418
		ArgOfPericenter -112.012
		MeanAnomaly     53.4287
	}
}

Comet	"Crait System C137"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            5.07404e-009
	Radius          24.3853
	InertiaMoment   0.396425

	Oblateness      0.00644367

	RotationPeriod  64.6527
	Obliquity       236.017
	EqAscendNode    7.3371

	AbsMagn         6.42658
	SlopeParam      2.70644
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.524 0.521 0.516)

	Surface
	{
		SurfStyle       0.109633
		OceanStyle      0.244694
		Randomize      (0.290, -0.744, -0.214)
		colorDistMagn   0.812134
		colorDistFreq   0.465651
		detailScale     665.883
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997473
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.642008
		terraceProb     0.434525
		erosion         0
		montesMagn      0.315114
		montesFreq      2.47089
		montesSpiky     0.8935
		montesFraction  0.633237
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.41216
		hillsFraction   0.724148
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218521
		craterFreq      0.214609
		craterDensity   0.857964
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.639607
		volcanoTemp     1588.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.210, 0.209, 0.206, 0.000)
		colorShelf     (0.223, 0.222, 0.219, 0.000)
		colorBeach     (0.236, 0.235, 0.232, 0.000)
		colorDesert    (0.249, 0.248, 0.245, 0.000)
		colorLowland   (0.262, 0.261, 0.258, 0.000)
		colorUpland    (0.275, 0.274, 0.271, 0.000)
		colorRock      (0.288, 0.287, 0.284, 0.000)
		colorSnow      (0.301, 0.300, 0.296, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.839788
		GasToDust   0.25
		Particles   2676
		GasBright   0.253434
		DustBright  0.694867
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   14.7231
		Period          75.1626
		Eccentricity    0.984571
		Inclination     -139.862
		AscendingNode   -21.2003
		ArgOfPericenter -110.273
		MeanAnomaly     -99.0926
	}
}

Comet	"Crait System C138"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.56233e-016
	Radius          0.0657887
	InertiaMoment   0.399113

	Oblateness      0.00441874

	RotationPeriod  62.6638
	Obliquity       189.223
	EqAscendNode    351.915

	AbsMagn         -1.41713
	SlopeParam      3.34139
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.693 0.689 0.687)

	Surface
	{
		SurfStyle       0.315154
		OceanStyle      0.980781
		Randomize      (-0.617, -0.739, -0.845)
		colorDistMagn   0.467118
		colorDistFreq   2.88547e-006
		detailScale     1.79647
		colorConversion true
		snowLevel       2
		tropicLatitude  0.828994
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.544722
		terraceProb     0.434914
		erosion         0
		montesMagn      0.28386
		montesFreq      1.96044
		montesSpiky     0.99973
		montesFraction  0.604506
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.19607e-005
		hillsFraction   0.52043
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236587
		craterFreq      0.241005
		craterDensity   0.992944
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.575112
		volcanoTemp     1333.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.277, 0.276, 0.275, 0.000)
		colorShelf     (0.295, 0.293, 0.292, 0.000)
		colorBeach     (0.312, 0.310, 0.309, 0.000)
		colorDesert    (0.329, 0.327, 0.326, 0.000)
		colorLowland   (0.347, 0.345, 0.343, 0.000)
		colorUpland    (0.364, 0.362, 0.361, 0.000)
		colorRock      (0.381, 0.379, 0.378, 0.000)
		colorSnow      (0.399, 0.396, 0.395, 1.000)
		BumpHeight      0.0592099
		BumpOffset      0.011842
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.206476
		DustBright  0.426312
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   12.1959
		Period          56.666
		Eccentricity    0.988395
		Inclination     -62.417
		AscendingNode   43.9889
		ArgOfPericenter -86.8386
		MeanAnomaly     165.689
	}
}

Comet	"Crait System C139"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.20835e-012
	Radius          1.51047
	InertiaMoment   0.397654

	Oblateness      0.00732445

	RotationPeriod  60.7188
	Obliquity       142.429
	EqAscendNode    336.492

	AbsMagn         9.69329
	SlopeParam      3.91495
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.808 0.757 0.689)

	Surface
	{
		SurfStyle       0.748592
		OceanStyle      0.635978
		Randomize      (0.546, -0.995, 0.202)
		colorDistMagn   0.913926
		colorDistFreq   0.000734843
		detailScale     41.246
		colorConversion true
		snowLevel       2
		tropicLatitude  0.782645
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.724651
		terraceProb     0.400576
		erosion         0
		montesMagn      0.460987
		montesFreq      2.93082
		montesSpiky     0.936025
		montesFraction  0.628796
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00426365
		hillsFraction   0.539424
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25122
		craterFreq      0.192347
		craterDensity   0.827577
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.534389
		volcanoTemp     1435.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.315, 0.257, 0.193, 0.000)
		colorShelf     (0.323, 0.265, 0.220, 0.000)
		colorBeach     (0.380, 0.310, 0.262, 0.000)
		colorDesert    (0.412, 0.333, 0.255, 0.000)
		colorLowland   (0.452, 0.356, 0.289, 0.000)
		colorUpland    (0.501, 0.431, 0.351, 0.000)
		colorRock      (0.541, 0.469, 0.379, 0.000)
		colorSnow      (0.589, 0.500, 0.399, 1.000)
		BumpHeight      1.35943
		BumpOffset      0.271885
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.391421
		GasToDust   0.25
		Particles   1770
		GasBright   0.122259
		DustBright  0.195016
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   14.2387
		Period          71.4833
		Eccentricity    0.978877
		Inclination     78.6509
		AscendingNode   -38.7097
		ArgOfPericenter -34.3372
		MeanAnomaly     -37.4632
	}
}

Comet	"Crait System C140"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            9.34574e-009
	Radius          38.9322
	InertiaMoment   0.399556

	Oblateness      0.0174093

	RotationPeriod  58.8102
	Obliquity       95.6346
	EqAscendNode    321.069

	AbsMagn         6.19851
	SlopeParam      4.48145
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.721 0.620 0.552)

	Surface
	{
		SurfStyle       0.381121
		OceanStyle      0.889956
		Randomize      (0.897, 0.459, 0.218)
		colorDistMagn   0.837345
		colorDistFreq   0.803027
		detailScale     1063.11
		colorConversion true
		snowLevel       2
		tropicLatitude  0.982912
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.494327
		terraceProb     0.234196
		erosion         0
		montesMagn      0.410966
		montesFreq      3.42131
		montesSpiky     0.903764
		montesFraction  0.507844
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.56959
		hillsFraction   0.570697
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.21235
		craterFreq      0.158735
		craterDensity   0.630044
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.586511
		volcanoTemp     1758.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.289, 0.248, 0.221, 0.000)
		colorShelf     (0.307, 0.263, 0.235, 0.000)
		colorBeach     (0.325, 0.279, 0.248, 0.000)
		colorDesert    (0.343, 0.294, 0.262, 0.000)
		colorLowland   (0.361, 0.310, 0.276, 0.000)
		colorUpland    (0.379, 0.325, 0.290, 0.000)
		colorRock      (0.397, 0.341, 0.304, 0.000)
		colorSnow      (0.415, 0.356, 0.317, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.872613
		GasToDust   0.25
		Particles   2742
		GasBright   0.356291
		DustBright  0.44547
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   12.0286
		Period          55.5038
		Eccentricity    0.959161
		Inclination     163.754
		AscendingNode   -1.30135
		ArgOfPericenter 67.8768
		MeanAnomaly     9.6234
	}
}

Comet	"Crait System C141"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            2.87763e-016
	Radius          0.0935617
	InertiaMoment   0.398345

	Oblateness      0.00833593

	RotationPeriod  56.9316
	Obliquity       48.8403
	EqAscendNode    305.647

	AbsMagn         16.2918
	SlopeParam      5.09041
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.750 0.699 0.646)

	Surface
	{
		SurfStyle       0.815471
		OceanStyle      0.643817
		Randomize      (-0.917, -0.508, 0.693)
		colorDistMagn   0.24398
		colorDistFreq   7.07395e-006
		detailScale     2.55486
		colorConversion true
		snowLevel       2
		tropicLatitude  0.987299
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.484203
		terraceProb     0.433202
		erosion         0
		montesMagn      0.526205
		montesFreq      3.01562
		montesSpiky     0.912039
		montesFraction  0.640789
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.86054e-005
		hillsFraction   0.706465
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2148
		craterFreq      0.226011
		craterDensity   1.06375
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.515466
		volcanoTemp     1187.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.293, 0.238, 0.181, 0.000)
		colorShelf     (0.300, 0.245, 0.207, 0.000)
		colorBeach     (0.353, 0.287, 0.246, 0.000)
		colorDesert    (0.383, 0.308, 0.239, 0.000)
		colorLowland   (0.420, 0.329, 0.271, 0.000)
		colorUpland    (0.465, 0.399, 0.330, 0.000)
		colorRock      (0.503, 0.434, 0.355, 0.000)
		colorSnow      (0.548, 0.462, 0.375, 1.000)
		BumpHeight      0.0842055
		BumpOffset      0.0168411
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.00166848
		DustBright  0.484579
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   13.8263
		Period          68.4006
		Eccentricity    0.961852
		Inclination     -81.2381
		AscendingNode   110.38
		ArgOfPericenter -161.276
		MeanAnomaly     57.3078
	}
}

Comet	"Crait System C142"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            2.22564e-012
	Radius          2.31775
	InertiaMoment   0.399978

	Oblateness      0.0176143

	RotationPeriod  55.0769
	Obliquity       2.04596
	EqAscendNode    290.224

	AbsMagn         9.46769
	SlopeParam      5.82517
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.763 0.762 0.759)

	Surface
	{
		SurfStyle       0.880568
		OceanStyle      0.919612
		Randomize      (-0.292, -0.805, 0.864)
		colorDistMagn   0.621881
		colorDistFreq   0.00457856
		detailScale     63.2899
		colorConversion true
		snowLevel       2
		tropicLatitude  0.641691
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.591813
		terraceProb     0.243831
		erosion         0
		montesMagn      0.478874
		montesFreq      2.41443
		montesSpiky     0.877802
		montesFraction  0.714504
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0167359
		hillsFraction   0.51974
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239473
		craterFreq      0.234431
		craterDensity   0.888278
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.531139
		volcanoTemp     1389.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.259, 0.267, 0.304, 0.050)
		colorShelf     (0.305, 0.312, 0.349, 0.040)
		colorBeach     (0.351, 0.358, 0.395, 0.030)
		colorDesert    (0.397, 0.404, 0.448, 0.020)
		colorLowland   (0.443, 0.449, 0.494, 0.030)
		colorUpland    (0.488, 0.495, 0.539, 0.050)
		colorRock      (0.534, 0.541, 0.600, 0.020)
		colorSnow      (0.534, 0.541, 0.600, 1.000)
		BumpHeight      2.08597
		BumpOffset      0.417194
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.424247
		GasToDust   0.25
		Particles   1836
		GasBright   0.0606482
		DustBright  0.910086
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   11.0523
		Period          48.8855
		Eccentricity    0.969026
		Inclination     37.9128
		AscendingNode   -11.714
		ArgOfPericenter 145.13
		MeanAnomaly     -61.6353
	}
}

Comet	"Crait System C143"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.72137e-008
	Radius          36.5665
	InertiaMoment   0.398878

	Oblateness      0.00953136

	RotationPeriod  53.2409
	Obliquity       315.252
	EqAscendNode    274.802

	AbsMagn         5.96441
	SlopeParam      6.9718
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.484 0.479 0.471)

	Surface
	{
		SurfStyle       0.124108
		OceanStyle      0.0310664
		Randomize      (0.858, 0.450, -0.454)
		colorDistMagn   0.916221
		colorDistFreq   0.991123
		detailScale     998.509
		colorConversion true
		snowLevel       2
		tropicLatitude  0.563178
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.268071
		terraceProb     0.275956
		erosion         0
		montesMagn      0.420044
		montesFreq      3.16734
		montesSpiky     0.973909
		montesFraction  0.592268
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.18659
		hillsFraction   0.413595
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230892
		craterFreq      0.189868
		craterDensity   0.836117
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.513118
		volcanoTemp     1491.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.193, 0.192, 0.188, 0.000)
		colorShelf     (0.206, 0.203, 0.200, 0.000)
		colorBeach     (0.218, 0.215, 0.212, 0.000)
		colorDesert    (0.230, 0.227, 0.224, 0.000)
		colorLowland   (0.242, 0.239, 0.235, 0.000)
		colorUpland    (0.254, 0.251, 0.247, 0.000)
		colorRock      (0.266, 0.263, 0.259, 0.000)
		colorSnow      (0.278, 0.275, 0.271, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.905439
		GasToDust   0.25
		Particles   2808
		GasBright   0.0796236
		DustBright  0.575597
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   10.5088
		Period          45.3243
		Eccentricity    0.955655
		Inclination     165.516
		AscendingNode   -141.976
		ArgOfPericenter -152.895
		MeanAnomaly     37.7817
	}
}

Comet	"Crait System C144"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            5.30023e-016
	Radius          0.140654
	InertiaMoment   0.397179

	Oblateness      0.0187685

	RotationPeriod  51.4184
	Obliquity       268.457
	EqAscendNode    259.379

	AbsMagn         15.0075
	SlopeParam      2.33156
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.845 0.801 0.718)

	Surface
	{
		SurfStyle       0.333408
		OceanStyle      0.236012
		Randomize      (-0.292, -0.288, -0.987)
		colorDistMagn   0.495045
		colorDistFreq   1.70797e-005
		detailScale     3.8408
		colorConversion true
		snowLevel       2
		tropicLatitude  0.70869
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.618087
		terraceProb     0.14288
		erosion         0
		montesMagn      0.515802
		montesFreq      3.53754
		montesSpiky     0.928157
		montesFraction  0.575802
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.95947e-005
		hillsFraction   0.59783
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251571
		craterFreq      0.153182
		craterDensity   0.771605
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.584036
		volcanoTemp     1637.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.338, 0.321, 0.287, 0.000)
		colorShelf     (0.359, 0.341, 0.305, 0.000)
		colorBeach     (0.380, 0.361, 0.323, 0.000)
		colorDesert    (0.401, 0.381, 0.341, 0.000)
		colorLowland   (0.422, 0.401, 0.359, 0.000)
		colorUpland    (0.444, 0.421, 0.377, 0.000)
		colorRock      (0.465, 0.441, 0.395, 0.000)
		colorSnow      (0.486, 0.461, 0.413, 1.000)
		BumpHeight      0.126589
		BumpOffset      0.0253178
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.06134
		DustBright  0.278367
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   10.6276
		Period          46.0948
		Eccentricity    0.957563
		Inclination     -47.9315
		AscendingNode   22.1147
		ArgOfPericenter -161.2
		MeanAnomaly     -49.7484
	}
}

Comet	"Crait System C145"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            4.09935e-012
	Radius          2.26501
	InertiaMoment   0.399341

	Oblateness      0.0109767

	RotationPeriod  49.6047
	Obliquity       221.663
	EqAscendNode    243.956

	AbsMagn         9.24667
	SlopeParam      3.03179
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.766 0.732 0.675)

	Surface
	{
		SurfStyle       0.46783
		OceanStyle      0.0160032
		Randomize      (-0.207, 0.082, -0.108)
		colorDistMagn   0.708236
		colorDistFreq   0.00147628
		detailScale     61.8498
		colorConversion true
		snowLevel       2
		tropicLatitude  0.97917
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.657187
		terraceProb     0.301911
		erosion         0
		montesMagn      0.57578
		montesFreq      2.59368
		montesSpiky     0.80816
		montesFraction  0.404768
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0147721
		hillsFraction   0.790526
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.203549
		craterFreq      0.203383
		craterDensity   0.831648
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.565325
		volcanoTemp     1620.25
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.306, 0.293, 0.270, 0.000)
		colorShelf     (0.326, 0.311, 0.287, 0.000)
		colorBeach     (0.345, 0.329, 0.304, 0.000)
		colorDesert    (0.364, 0.348, 0.321, 0.000)
		colorLowland   (0.383, 0.366, 0.338, 0.000)
		colorUpland    (0.402, 0.384, 0.355, 0.000)
		colorRock      (0.421, 0.402, 0.371, 0.000)
		colorSnow      (0.440, 0.421, 0.388, 1.000)
		BumpHeight      2.03851
		BumpOffset      0.407701
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.457073
		GasToDust   0.25
		Particles   1903
		GasBright   0.197487
		DustBright  0.626707
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   14.0253
		Period          69.8829
		Eccentricity    0.968591
		Inclination     130.407
		AscendingNode   123.749
		ArgOfPericenter 36.1676
		MeanAnomaly     -56.5146
	}
}

Comet	"Crait System C146"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            3.17054e-008
	Radius          54.2187
	InertiaMoment   0.398033

	Oblateness      0.0208662

	RotationPeriod  47.795
	Obliquity       174.869
	EqAscendNode    228.534

	AbsMagn         5.72312
	SlopeParam      3.62805
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.795 0.793 0.789)

	Surface
	{
		SurfStyle       0.491626
		OceanStyle      0.842549
		Randomize      (-0.978, 0.262, -0.737)
		colorDistMagn   0.145917
		colorDistFreq   2.10539
		detailScale     1480.53
		colorConversion true
		snowLevel       2
		tropicLatitude  0.955878
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.325344
		terraceProb     0.392189
		erosion         0
		montesMagn      0.53165
		montesFreq      1.87836
		montesSpiky     0.866824
		montesFraction  0.32908
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.30226
		hillsFraction   0.421318
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.274529
		craterFreq      0.242339
		craterDensity   0.77701
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.42559
		volcanoTemp     1418.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.318, 0.317, 0.316, 0.000)
		colorShelf     (0.338, 0.337, 0.335, 0.000)
		colorBeach     (0.358, 0.357, 0.355, 0.000)
		colorDesert    (0.378, 0.377, 0.375, 0.000)
		colorLowland   (0.397, 0.396, 0.395, 0.000)
		colorUpland    (0.417, 0.416, 0.414, 0.000)
		colorRock      (0.437, 0.436, 0.434, 0.000)
		colorSnow      (0.457, 0.456, 0.454, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.938265
		GasToDust   0.25
		Particles   2875
		GasBright   0.151921
		DustBright  0.356759
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   13.5262
		Period          66.1856
		Eccentricity    0.960839
		Inclination     -72.4703
		AscendingNode   -85.8103
		ArgOfPericenter -108.153
		MeanAnomaly     -144.529
	}
}

Comet	"Crait System C147"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            9.76234e-016
	Radius          0.140299
	InertiaMoment   0.399771

	Oblateness      0.0127676

	RotationPeriod  45.9848
	Obliquity       128.074
	EqAscendNode    213.111

	AbsMagn         14.1955
	SlopeParam      4.19235
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.436 0.431 0.428)

	Surface
	{
		SurfStyle       0.405812
		OceanStyle      0.447104
		Randomize      (-0.687, -0.017, -0.415)
		colorDistMagn   0.28024
		colorDistFreq   6.29664e-006
		detailScale     3.83111
		colorConversion true
		snowLevel       2
		tropicLatitude  0.764
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.614198
		terraceProb     0.232947
		erosion         0
		montesMagn      0.445578
		montesFreq      3.1777
		montesSpiky     0.898064
		montesFraction  0.343558
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.94011e-005
		hillsFraction   0.777406
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223342
		craterFreq      0.163501
		craterDensity   0.865227
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.520334
		volcanoTemp     1429.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.174, 0.172, 0.171, 0.000)
		colorShelf     (0.185, 0.183, 0.182, 0.000)
		colorBeach     (0.196, 0.194, 0.193, 0.000)
		colorDesert    (0.207, 0.205, 0.203, 0.000)
		colorLowland   (0.218, 0.216, 0.214, 0.000)
		colorUpland    (0.229, 0.226, 0.225, 0.000)
		colorRock      (0.240, 0.237, 0.235, 0.000)
		colorSnow      (0.251, 0.248, 0.246, 1.000)
		BumpHeight      0.126269
		BumpOffset      0.0252539
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.355259
		DustBright  0.637908
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   13.9401
		Period          69.2471
		Eccentricity    0.982549
		Inclination     177.703
		AscendingNode   156.918
		ArgOfPericenter 147.899
		MeanAnomaly     -136.198
	}
}

Comet	"Crait System C148"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            7.55047e-012
	Radius          3.32383
	InertiaMoment   0.398627

	Oblateness      0.0236898

	RotationPeriod  44.1694
	Obliquity       81.2802
	EqAscendNode    197.689

	AbsMagn         9.02939
	SlopeParam      4.77272
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.706 0.703 0.700)

	Surface
	{
		SurfStyle       0.23189
		OceanStyle      0.155358
		Randomize      (-0.232, -0.636, 0.040)
		colorDistMagn   0.122209
		colorDistFreq   0.0036836
		detailScale     90.7628
		colorConversion true
		snowLevel       2
		tropicLatitude  0.99754
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.391735
		terraceProb     0.264789
		erosion         0
		montesMagn      0.556397
		montesFreq      3.02719
		montesSpiky     0.926881
		montesFraction  0.802385
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.025826
		hillsFraction   0.619134
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.290072
		craterFreq      0.186327
		craterDensity   0.891769
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.525881
		volcanoTemp     1441.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.282, 0.281, 0.280, 0.000)
		colorShelf     (0.300, 0.299, 0.297, 0.000)
		colorBeach     (0.318, 0.316, 0.315, 0.000)
		colorDesert    (0.335, 0.334, 0.332, 0.000)
		colorLowland   (0.353, 0.351, 0.350, 0.000)
		colorUpland    (0.371, 0.369, 0.367, 0.000)
		colorRock      (0.388, 0.386, 0.385, 0.000)
		colorSnow      (0.406, 0.404, 0.402, 1.000)
		BumpHeight      2.99145
		BumpOffset      0.59829
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.489899
		GasToDust   0.25
		Particles   1969
		GasBright   0.282411
		DustBright  0.395243
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   12.7648
		Period          60.6769
		Eccentricity    0.962977
		Inclination     -7.5173
		AscendingNode   -128.327
		ArgOfPericenter 27.022
		MeanAnomaly     95.1991
	}
}

Comet	"Crait System C149"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            5.83975e-008
	Radius          54.8331
	InertiaMoment   0.39645

	Oblateness      0.0148409

	RotationPeriod  42.3443
	Obliquity       34.4859
	EqAscendNode    182.266

	AbsMagn         5.47325
	SlopeParam      5.42849
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.575 0.572 0.568)

	Surface
	{
		SurfStyle       0.88343
		OceanStyle      0.218252
		Randomize      (-0.986, 0.323, 0.362)
		colorDistMagn   0.911205
		colorDistFreq   1.24536
		detailScale     1497.31
		colorConversion true
		snowLevel       2
		tropicLatitude  0.900811
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.729301
		terraceProb     0.240703
		erosion         0
		montesMagn      0.549579
		montesFreq      3.01329
		montesSpiky     0.91046
		montesFraction  0.484215
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.09769
		hillsFraction   0.640336
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234969
		craterFreq      0.216805
		craterDensity   1.01053
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.485348
		volcanoTemp     1279.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.195, 0.200, 0.227, 0.050)
		colorShelf     (0.230, 0.235, 0.261, 0.040)
		colorBeach     (0.264, 0.269, 0.295, 0.030)
		colorDesert    (0.299, 0.303, 0.335, 0.020)
		colorLowland   (0.333, 0.338, 0.369, 0.030)
		colorUpland    (0.368, 0.372, 0.403, 0.050)
		colorRock      (0.402, 0.406, 0.448, 0.020)
		colorSnow      (0.402, 0.406, 0.448, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.971091
		GasToDust   0.25
		Particles   2941
		GasBright   0.172304
		DustBright  0.189836
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   12.118
		Period          56.1238
		Eccentricity    0.979769
		Inclination     133.277
		AscendingNode   -108.506
		ArgOfPericenter -7.13652
		MeanAnomaly     93.3594
	}
}

Comet	"Crait System C150"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.7981e-015
	Radius          0.204193
	InertiaMoment   0.399119

	Oblateness      0.0274763

	RotationPeriod  40.5045
	Obliquity       347.692
	EqAscendNode    166.843

	AbsMagn         13.5798
	SlopeParam      6.29623
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.704 0.606 0.513)

	Surface
	{
		SurfStyle       0.38244
		OceanStyle      0.654268
		Randomize      (0.358, 0.410, -0.211)
		colorDistMagn   0.00730121
		colorDistFreq   2.13709e-005
		detailScale     5.57582
		colorConversion true
		snowLevel       2
		tropicLatitude  0.748716
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.654328
		terraceProb     0.266567
		erosion         0
		montesMagn      0.3174
		montesFreq      3.61264
		montesSpiky     0.94655
		montesFraction  0.483471
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.86078e-005
		hillsFraction   0.582879
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.265545
		craterFreq      0.261271
		craterDensity   0.833452
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.500373
		volcanoTemp     1371.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.282, 0.242, 0.205, 0.000)
		colorShelf     (0.299, 0.258, 0.218, 0.000)
		colorBeach     (0.317, 0.273, 0.231, 0.000)
		colorDesert    (0.335, 0.288, 0.244, 0.000)
		colorLowland   (0.352, 0.303, 0.256, 0.000)
		colorUpland    (0.370, 0.318, 0.269, 0.000)
		colorRock      (0.387, 0.333, 0.282, 0.000)
		colorSnow      (0.405, 0.349, 0.295, 1.000)
		BumpHeight      0.183773
		BumpOffset      0.0367547
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0415333
		GasToDust   0.25
		Particles   1063
		GasBright   0.0294953
		DustBright  0.817131
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   11.6943
		Period          53.2062
		Eccentricity    0.975043
		Inclination     42.0691
		AscendingNode   115.897
		ArgOfPericenter 140.065
		MeanAnomaly     -26.759
	}
}

Comet	"Crait System C151"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.3907e-011
	Radius          3.39649
	InertiaMoment   0.397665

	Oblateness      0.0178634

	RotationPeriod  38.645
	Obliquity       300.897
	EqAscendNode    151.421

	AbsMagn         8.81511
	SlopeParam      8.42975
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.477 0.475 0.471)

	Surface
	{
		SurfStyle       0.338597
		OceanStyle      0.837588
		Randomize      (0.901, -0.515, 0.675)
		colorDistMagn   0.841811
		colorDistFreq   0.00884712
		detailScale     92.7468
		colorConversion true
		snowLevel       2
		tropicLatitude  0.996509
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.354692
		terraceProb     0.365565
		erosion         0
		montesMagn      0.637539
		montesFreq      2.65878
		montesSpiky     0.793273
		montesFraction  0.384019
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0216717
		hillsFraction   0.447432
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243779
		craterFreq      0.196133
		craterDensity   0.880866
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.540281
		volcanoTemp     1654.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.191, 0.190, 0.188, 0.000)
		colorShelf     (0.203, 0.202, 0.200, 0.000)
		colorBeach     (0.214, 0.214, 0.212, 0.000)
		colorDesert    (0.226, 0.225, 0.224, 0.000)
		colorLowland   (0.238, 0.237, 0.235, 0.000)
		colorUpland    (0.250, 0.249, 0.247, 0.000)
		colorRock      (0.262, 0.261, 0.259, 0.000)
		colorSnow      (0.274, 0.273, 0.271, 1.000)
		BumpHeight      3.05684
		BumpOffset      0.611368
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.522725
		GasToDust   0.25
		Particles   2035
		GasBright   0.049863
		DustBright  0.48125
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   8.69456
		Period          34.1092
		Eccentricity    0.953699
		Inclination     55.9339
		AscendingNode   -106.69
		ArgOfPericenter -155.347
		MeanAnomaly     139.925
	}
}

Comet	"Crait System C152"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.07561e-007
	Radius          79.2599
	InertiaMoment   0.399561

	Oblateness      0.032669

	RotationPeriod  36.7601
	Obliquity       254.103
	EqAscendNode    135.998

	AbsMagn         5.2131
	SlopeParam      2.69691
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.449 0.442 0.439)

	Surface
	{
		SurfStyle       0.620129
		OceanStyle      0.0628226
		Randomize      (0.689, -0.872, -0.756)
		colorDistMagn   0.69678
		colorDistFreq   3.77191
		detailScale     2164.32
		colorConversion true
		snowLevel       2
		tropicLatitude  0.961549
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.517267
		terraceProb     0.28342
		erosion         0
		montesMagn      0.461313
		montesFreq      3.59313
		montesSpiky     0.871004
		montesFraction  0.558982
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.99581
		hillsFraction   0.745735
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258806
		craterFreq      0.195752
		craterDensity   0.98446
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.572797
		volcanoTemp     1490.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.175, 0.150, 0.123, 0.000)
		colorShelf     (0.179, 0.155, 0.140, 0.000)
		colorBeach     (0.211, 0.181, 0.167, 0.000)
		colorDesert    (0.229, 0.195, 0.162, 0.000)
		colorLowland   (0.251, 0.208, 0.184, 0.000)
		colorUpland    (0.278, 0.252, 0.224, 0.000)
		colorRock      (0.301, 0.274, 0.241, 0.000)
		colorSnow      (0.327, 0.292, 0.254, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0329715
		DustBright  0.182628
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   6.49537
		Period          22.0245
		Eccentricity    0.917725
		Inclination     -99.0357
		AscendingNode   -104.114
		ArgOfPericenter 75.4103
		MeanAnomaly     140.172
	}
}

Comet	"Crait System C153"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            3.31188e-015
	Radius          0.210387
	InertiaMoment   0.398352

	Oblateness      0.0219857

	RotationPeriod  34.8438
	Obliquity       207.309
	EqAscendNode    120.576

	AbsMagn         13.0737
	SlopeParam      3.33324
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.817 0.782 0.718)

	Surface
	{
		SurfStyle       0.267334
		OceanStyle      0.739967
		Randomize      (0.101, 0.153, -0.865)
		colorDistMagn   0.615156
		colorDistFreq   1.76969e-005
		detailScale     5.74496
		colorConversion true
		snowLevel       2
		tropicLatitude  0.415548
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.534139
		terraceProb     0.472465
		erosion         0
		montesMagn      0.440572
		montesFreq      2.47641
		montesSpiky     0.977132
		montesFraction  0.46869
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.34414e-005
		hillsFraction   0.82462
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25856
		craterFreq      0.276454
		craterDensity   0.882281
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.491162
		volcanoTemp     1851.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.327, 0.313, 0.287, 0.000)
		colorShelf     (0.347, 0.332, 0.305, 0.000)
		colorBeach     (0.368, 0.352, 0.323, 0.000)
		colorDesert    (0.388, 0.372, 0.341, 0.000)
		colorLowland   (0.408, 0.391, 0.359, 0.000)
		colorUpland    (0.429, 0.411, 0.377, 0.000)
		colorRock      (0.449, 0.430, 0.395, 0.000)
		colorSnow      (0.470, 0.450, 0.413, 1.000)
		BumpHeight      0.189348
		BumpOffset      0.0378696
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0743593
		GasToDust   0.25
		Particles   1130
		GasBright   0.1484
		DustBright  0.551686
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   12.328
		Period          57.5887
		Eccentricity    0.963456
		Inclination     131.239
		AscendingNode   -20.1681
		ArgOfPericenter 136.845
		MeanAnomaly     -175.206
	}
}

Comet	"Crait System C154"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            2.5615e-011
	Radius          4.881
	InertiaMoment   0.399984

	Oblateness      0.0400854

	RotationPeriod  32.8895
	Obliquity       160.514
	EqAscendNode    105.153

	AbsMagn         8.60315
	SlopeParam      3.90723
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.670 0.586 0.551)

	Surface
	{
		SurfStyle       0.906467
		OceanStyle      0.340197
		Randomize      (0.453, -0.168, 0.005)
		colorDistMagn   0.200956
		colorDistFreq   0.0173607
		detailScale     133.284
		colorConversion true
		snowLevel       2
		tropicLatitude  0.597443
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.539238
		terraceProb     0.348892
		erosion         0
		montesMagn      0.531454
		montesFreq      2.72402
		montesSpiky     0.845311
		montesFraction  0.824654
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0522459
		hillsFraction   0.788432
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228532
		craterFreq      0.272716
		craterDensity   0.973804
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.538827
		volcanoTemp     1251.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.228, 0.205, 0.220, 0.050)
		colorShelf     (0.268, 0.240, 0.253, 0.040)
		colorBeach     (0.308, 0.276, 0.286, 0.030)
		colorDesert    (0.348, 0.311, 0.325, 0.020)
		colorLowland   (0.388, 0.346, 0.358, 0.030)
		colorUpland    (0.429, 0.381, 0.391, 0.050)
		colorRock      (0.469, 0.416, 0.435, 0.020)
		colorSnow      (0.469, 0.416, 0.435, 1.000)
		BumpHeight      4.3929
		BumpOffset      0.87858
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.555551
		GasToDust   0.25
		Particles   2102
		GasBright   0.104227
		DustBright  0.280346
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   15.2777
		Period          79.4491
		Eccentricity    0.977265
		Inclination     -51.5446
		AscendingNode   -145.636
		ArgOfPericenter 144.389
		MeanAnomaly     -30.0216
	}
}

Comet	"Crait System C155"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            1.98113e-007
	Radius          82.2254
	InertiaMoment   0.398884

	Oblateness      0.0279743

	RotationPeriod  30.8896
	Obliquity       113.72
	EqAscendNode    89.7305

	AbsMagn         4.94058
	SlopeParam      4.47352
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.472 0.468 0.466)

	Surface
	{
		SurfStyle       0.582214
		OceanStyle      0.117554
		Randomize      (-0.853, -0.358, -0.449)
		colorDistMagn   0.526532
		colorDistFreq   2.72365
		detailScale     2245.3
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999939
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.385652
		terraceProb     0.106673
		erosion         0
		montesMagn      0.626971
		montesFreq      3.18994
		montesSpiky     0.963677
		montesFraction  0.845967
		dunesFraction   0
		hillsMagn       0
		hillsFreq       15.3365
		hillsFraction   0.731238
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241087
		craterFreq      0.207022
		craterDensity   1.06246
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.533782
		volcanoTemp     1504.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.184, 0.159, 0.131, 0.000)
		colorShelf     (0.189, 0.164, 0.149, 0.000)
		colorBeach     (0.222, 0.192, 0.177, 0.000)
		colorDesert    (0.241, 0.206, 0.173, 0.000)
		colorLowland   (0.264, 0.220, 0.196, 0.000)
		colorUpland    (0.292, 0.267, 0.238, 0.000)
		colorRock      (0.316, 0.290, 0.256, 0.000)
		colorSnow      (0.344, 0.309, 0.270, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.286846
		DustBright  0.582213
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   10.7796
		Period          47.0876
		Eccentricity    0.947806
		Inclination     47.8467
		AscendingNode   112.424
		ArgOfPericenter 102.45
		MeanAnomaly     -44.322
	}
}

Comet	"Crait System C156"
{
	ParentBody     "Crait System"
	Class	       "Asteroid"

	Mass            6.10006e-015
	Radius          0.300813
	InertiaMoment   0.397193

	Oblateness      0.0507257

	RotationPeriod  28.8354
	Obliquity       66.9258
	EqAscendNode    74.3079

	AbsMagn         12.6379
	SlopeParam      5.08147
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.533 0.450 0.398)

	Surface
	{
		SurfStyle       0.0223903
		OceanStyle      0.448529
		Randomize      (-0.864, -0.359, -0.552)
		colorDistMagn   0.00416988
		colorDistFreq   5.07816e-005
		detailScale     8.2142
		colorConversion true
		snowLevel       2
		tropicLatitude  0.982527
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.459731
		terraceProb     0.529774
		erosion         0
		montesMagn      0.536114
		montesFreq      2.5621
		montesSpiky     0.754553
		montesFraction  0.585248
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000176707
		hillsFraction   0.750072
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254505
		craterFreq      0.268675
		craterDensity   0.805631
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.513866
		volcanoTemp     1593.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.213, 0.180, 0.159, 0.000)
		colorShelf     (0.227, 0.191, 0.169, 0.000)
		colorBeach     (0.240, 0.203, 0.179, 0.000)
		colorDesert    (0.253, 0.214, 0.189, 0.000)
		colorLowland   (0.267, 0.225, 0.199, 0.000)
		colorUpland    (0.280, 0.236, 0.209, 0.000)
		colorRock      (0.293, 0.248, 0.219, 0.000)
		colorSnow      (0.307, 0.259, 0.229, 1.000)
		BumpHeight      0.270732
		BumpOffset      0.0541463
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.107185
		GasToDust   0.25
		Particles   1196
		GasBright   0.21539
		DustBright  0.338156
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   17.4729
		Period          97.1733
		Eccentricity    0.971299
		Inclination     146.02
		AscendingNode   -173.723
		ArgOfPericenter -134.067
		MeanAnomaly     -90.8028
	}
}
