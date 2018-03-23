// http://starwars.wikia.com/wiki/Eshan
// Region : Inner RIm
// Sector : Sector
// Grid location : N8
// X : 3564.95, Y : 2637.85, Z : -58.95141811555732

Planet	"Eshan System 1"
{
	ParentBody     "Eshan System"
	Class	       "Desert"

	Mass            1.95046
	Radius          6699.01
	InertiaMoment   0.329248

	Obliquity       1.98595
	EqAscendNode    1.40811
	TidalLocked     true

	AlbedoBond      0.7
	AlbedoGeom      0.84
	Brightness      2
	Color          (0.749 0.747 0.743)

	Surface
	{
		SurfStyle       0.758906
		OceanStyle      0.22838
		Randomize      (0.035, 0.161, -0.277)
		colorDistMagn   0.0590135
		colorDistFreq   702.273
		detailScale     17230.2
		colorConversion true
		seaLevel        0.112458
		snowLevel       2
		tropicLatitude  0.0692625
		icecapLatitude  10
		icecapHeight    0.151775
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        1.30201
		venusFreq       1.57828
		venusMagn       0.3447
		mareFreq        1.81912
		mareDensity     0.200116
		terraceProb     0.107725
		erosion         0
		montesMagn      0.199828
		montesFreq      394.103
		montesSpiky     0.848224
		montesFraction  0.987208
		dunesMagn       0.0518712
		dunesFreq       36.2036
		dunesFraction   0.973179
		hillsMagn       0.119673
		hillsFreq       679.966
		hillsFraction   0
		hills2Fraction  0
		riversMagn      57.7431
		riversFreq      3.34315
		riversSin       5.45076
		riversOctaves   0
		canyonsMagn     0.0604096
		canyonsFreq     184.967
		canyonFraction  0
		cracksMagn      0.131693
		cracksFreq      0.602219
		cracksOctaves   0
		craterMagn      0.753049
		craterFreq      16.3548
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.617189
		volcanoFreq     0.65366
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.246601
		volcanoRadius   0.434472
		volcanoTemp     1591.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1
		stripeTwist     3.5
		cycloneMagn     0.932515
		cycloneDensity  0.329511
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
		BumpHeight      15.041
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
		Height          34.3579
		Velocity        35.6686
		BumpHeight      6.84118
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.02637
		mainOctaves     10
		Coverage        1
		stripeZones     1
		stripeTwist     3.5
	}

	Clouds
	{
		Height          61.1953
		Velocity        129.677
		BumpHeight      6.44887
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.02637
		mainOctaves     10
		Coverage        1
		stripeZones     1
		stripeTwist     3.5
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Venus"
		Height          261.758
		Density         243.631
		Pressure        724.426
		Greenhouse      537.74
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0562092
		Saturation      0.612418

		Composition
		{
			H2O   	56.0811
			CO2   	28.7092
			SO2   	15.1763
			N2    	0.0314044
			CO    	0.00162935
			Ar    	0.000243007
			Ne    	9.37473e-005
		}
	}

	Aurora
	{
		Height      126.283
		NorthLat    70.5579
		NorthLon    111.164
		NorthRadius 1338.71
		NorthWidth  442.223
		NorthRings  5
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -76.2559
		SouthLon    275.217
		SouthRadius 1971.32
		SouthWidth  329.429
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
		SemiMajorAxis   0.123302
		Period          0.0441017
		Eccentricity    0.0294769
		Inclination     1.98595
		AscendingNode   1.40811
		ArgOfPericenter 107.284
		MeanAnomaly     219.08
	}
}

DwarfMoon	"Eshan System 1.D1"
{
	ParentBody     "Eshan System 1"
	Class	       "Asteroid"

	Mass            3.57789e-008
	Radius          44.2104
	InertiaMoment   0.399072

	Oblateness      0.249

	Obliquity       -0.00660506
	EqAscendNode    -91.0242
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.825 0.790 0.754)

	Surface
	{
		SurfStyle       0.823822
		OceanStyle      0.25762
		Randomize      (0.206, 0.384, 0.802)
		colorDistMagn   0.296309
		colorDistFreq   1.06466
		detailScale     1207.24
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.667039
		terraceProb     0.334203
		erosion         0
		montesMagn      0.688506
		montesFreq      2.72669
		montesSpiky     0.968601
		montesFraction  0.196015
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.65774
		hillsFraction   0.60349
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231392
		craterFreq      0.252657
		craterDensity   0.982166
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.456747
		volcanoTemp     1205.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.322, 0.269, 0.211, 0.000)
		colorShelf     (0.330, 0.277, 0.241, 0.000)
		colorBeach     (0.388, 0.324, 0.287, 0.000)
		colorDesert    (0.421, 0.348, 0.279, 0.000)
		colorLowland   (0.462, 0.371, 0.317, 0.000)
		colorUpland    (0.512, 0.450, 0.385, 0.000)
		colorRock      (0.553, 0.490, 0.415, 0.000)
		colorSnow      (0.602, 0.522, 0.438, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000171309
		Period          0.000928499
		Eccentricity    3.49742e-005
		Inclination     -0.00660506
		AscendingNode   -91.0242
		ArgOfPericenter -38.012
		MeanAnomaly     -179.716
	}
}

DwarfMoon	"Eshan System 1.D2"
{
	ParentBody     "Eshan System 1"
	Class	       "Asteroid"

	Mass            4.85665e-008
	Radius          33.6029
	InertiaMoment   0.399981

	Oblateness      0.0696451

	Obliquity       -0.00940816
	EqAscendNode    -114.632
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.712 0.709 0.707)

	Surface
	{
		SurfStyle       0.162661
		OceanStyle      0.194252
		Randomize      (0.347, 0.259, 0.206)
		colorDistMagn   0.440173
		colorDistFreq   0.575319
		detailScale     917.583
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.270559
		terraceProb     0.537877
		erosion         0
		montesMagn      0.651071
		montesFreq      3.72223
		montesSpiky     0.952334
		montesFraction  0.731873
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.16446
		hillsFraction   0.810476
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2361
		craterFreq      0.160775
		craterDensity   1.09566
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.463799
		volcanoTemp     1782.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.285, 0.283, 0.283, 0.000)
		colorShelf     (0.303, 0.301, 0.300, 0.000)
		colorBeach     (0.320, 0.319, 0.318, 0.000)
		colorDesert    (0.338, 0.337, 0.336, 0.000)
		colorLowland   (0.356, 0.354, 0.353, 0.000)
		colorUpland    (0.374, 0.372, 0.371, 0.000)
		colorRock      (0.392, 0.390, 0.389, 0.000)
		colorSnow      (0.410, 0.407, 0.406, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000201089
		Period          0.00118084
		Eccentricity    6.45566e-005
		Inclination     -0.00940816
		AscendingNode   -114.632
		ArgOfPericenter 177.488
		MeanAnomaly     152.648
	}
}

DwarfMoon	"Eshan System 1.D3"
{
	ParentBody     "Eshan System 1"
	Class	       "Asteroid"

	Mass            6.60046e-008
	Radius          33.1363
	InertiaMoment   0.398102

	Oblateness      0.0143503

	Obliquity       27.7289
	EqAscendNode    72.5719
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.419 0.415 0.409)

	Surface
	{
		SurfStyle       0.323521
		OceanStyle      0.701278
		Randomize      (0.082, 0.868, -0.080)
		colorDistMagn   0.832012
		colorDistFreq   0.858147
		detailScale     904.843
		colorConversion true
		snowLevel       2
		tropicLatitude  0.695357
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.358707
		terraceProb     0.281193
		erosion         0
		montesMagn      0.479498
		montesFreq      2.5812
		montesSpiky     0.991811
		montesFraction  0.430049
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.35711
		hillsFraction   0.619986
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237801
		craterFreq      0.177052
		craterDensity   0.774094
		craterOctaves   13
		volcanoActivity 0.131031
		volcanoFlows    0
		volcanoRadius   0.46624
		volcanoTemp     1307.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.167, 0.166, 0.164, 0.000)
		colorShelf     (0.178, 0.176, 0.174, 0.000)
		colorBeach     (0.188, 0.187, 0.184, 0.000)
		colorDesert    (0.199, 0.197, 0.194, 0.000)
		colorLowland   (0.209, 0.207, 0.205, 0.000)
		colorUpland    (0.220, 0.218, 0.215, 0.000)
		colorRock      (0.230, 0.228, 0.225, 0.000)
		colorSnow      (0.241, 0.239, 0.235, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000302385
		Period          0.00217746
		Eccentricity    0.436455
		Inclination     27.7289
		AscendingNode   72.5719
		ArgOfPericenter -101.865
		MeanAnomaly     -136.749
	}
}

Planet	"Eshan System 2"
{
	ParentBody     "Eshan System"
	Class	       "Desert"

	Mass            9.56295
	Radius          11556.3
	InertiaMoment   0.330329

	Obliquity       -0.0774567
	EqAscendNode    -173.145
	TidalLocked     true

	AlbedoBond      0.312359
	AlbedoGeom      0.374831
	Brightness      2
	Color          (0.749 0.747 0.745)

	Surface
	{
		SurfStyle       0.502456
		OceanStyle      0.925471
		Randomize      (0.191, -0.805, 0.398)
		colorDistMagn   0.0963667
		colorDistFreq   1508.59
		detailScale     29723.6
		colorConversion true
		seaLevel        0.10295
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  10
		icecapHeight    0.208803
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        0.737828
		venusFreq       0.578895
		venusMagn       0.367305
		mareFreq        1.87318
		mareDensity     0.20561
		terraceProb     0.172996
		erosion         0
		montesMagn      0.255589
		montesFreq      434.264
		montesSpiky     0.970802
		montesFraction  0.150579
		dunesMagn       0.046909
		dunesFreq       92.0671
		dunesFraction   0.489576
		hillsMagn       0.11805
		hillsFreq       1622.23
		hillsFraction   0
		hills2Fraction  0
		riversMagn      59.2468
		riversFreq      2.90326
		riversSin       6.10206
		riversOctaves   0
		canyonsMagn     0.052918
		canyonsFreq     304.806
		canyonFraction  0
		cracksMagn      0.100714
		cracksFreq      0.996785
		cracksOctaves   0
		craterMagn      1.12566
		craterFreq      35.7932
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.653461
		volcanoFreq     0.575636
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.551477
		volcanoRadius   0.513208
		volcanoTemp     1489.9
		lavaCoverTidal  0.0173708
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1
		stripeTwist     3.5
		cycloneMagn     1.03727
		cycloneDensity  0.33291
		cycloneOctaves  0
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
		BumpHeight      11.7182
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
		Height          18.0332
		Velocity        125.086
		BumpHeight      6.11394
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.04832
		mainOctaves     10
		Coverage        0.224718
		stripeZones     1
		stripeTwist     3.5
	}

	Clouds
	{
		Height          30.208
		Velocity        192.318
		BumpHeight      5.59644
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.04832
		mainOctaves     10
		Coverage        0.224718
		stripeZones     1
		stripeTwist     3.5
	}

	Clouds
	{
		Height          42.3818
		Velocity        32.8486
		BumpHeight      5.1675
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.04832
		mainOctaves     10
		Coverage        0.224718
		stripeZones     1
		stripeTwist     3.5
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Venus"
		Height          127.376
		Density         1591.28
		Pressure        3263.35
		Greenhouse      459.011
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0670934
		Saturation      0.634187

		Composition
		{
			CO2   	90.9361
			H2O   	8.63141
			SO2   	0.404917
			N2    	0.0269863
			CO    	0.00051029
			Ne    	2.16876e-005
			Ar    	1.4177e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.198854
		Period          0.0903227
		Eccentricity    0.074996
		Inclination     -0.0774567
		AscendingNode   -173.145
		ArgOfPericenter 286.083
		MeanAnomaly     59.0007
	}
}

DwarfMoon	"Eshan System 2.D1"
{
	ParentBody     "Eshan System 2"
	Class	       "Asteroid"

	Mass            1.62142e-006
	Radius          169.47
	InertiaMoment   0.396976

	Oblateness      0.249

	Obliquity       0.0110699
	EqAscendNode    -159.006
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.517 0.507 0.503)

	Surface
	{
		SurfStyle       0.608218
		OceanStyle      0.813489
		Randomize      (-0.720, -0.037, -0.832)
		colorDistMagn   0.669532
		colorDistFreq   20.9353
		detailScale     4627.66
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.689139
		terraceProb     0.18665
		erosion         0
		montesMagn      0.683864
		montesFreq      2.28617
		montesSpiky     0.995783
		montesFraction  0.846521
		dunesFraction   0
		hillsMagn       0
		hillsFreq       80.2602
		hillsFraction   0.595769
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251932
		craterFreq      1.23763
		craterDensity   0.883127
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.482479
		volcanoTemp     1505.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.201, 0.173, 0.141, 0.000)
		colorShelf     (0.207, 0.178, 0.161, 0.000)
		colorBeach     (0.243, 0.208, 0.191, 0.000)
		colorDesert    (0.263, 0.223, 0.186, 0.000)
		colorLowland   (0.289, 0.238, 0.211, 0.000)
		colorUpland    (0.320, 0.289, 0.256, 0.000)
		colorRock      (0.346, 0.315, 0.277, 0.000)
		colorSnow      (0.377, 0.335, 0.292, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000328972
		Period          0.00111589
		Eccentricity    7.46018e-005
		Inclination     0.0110699
		AscendingNode   -159.006
		ArgOfPericenter 70.3069
		MeanAnomaly     74.6883
	}
}

DwarfMoon	"Eshan System 2.D2"
{
	ParentBody     "Eshan System 2"
	Class	       "Asteroid"

	Mass            2.40689e-006
	Radius          100.42
	InertiaMoment   0.398589

	RotationPeriod  181.872
	Obliquity       50.8
	EqAscendNode    -104.299

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.698 0.695 0.692)

	Surface
	{
		SurfStyle       0.519121
		OceanStyle      0.088493
		Randomize      (-0.339, 0.022, 0.446)
		colorDistMagn   0.54757
		colorDistFreq   7.21166
		detailScale     2742.15
		colorConversion true
		snowLevel       2
		tropicLatitude  0.836618
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.359296
		terraceProb     0.136815
		erosion         0
		montesMagn      0.461812
		montesFreq      2.68318
		montesSpiky     0.900986
		montesFraction  0.739248
		dunesFraction   0
		hillsMagn       0
		hillsFreq       31.7463
		hillsFraction   0.918951
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260334
		craterFreq      0.30456
		craterDensity   0.580645
		craterOctaves   15
		volcanoActivity 0.161848
		volcanoFlows    0
		volcanoRadius   0.479368
		volcanoTemp     1432.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.272, 0.236, 0.194, 0.000)
		colorShelf     (0.279, 0.243, 0.221, 0.000)
		colorBeach     (0.328, 0.285, 0.263, 0.000)
		colorDesert    (0.356, 0.306, 0.256, 0.000)
		colorLowland   (0.391, 0.327, 0.291, 0.000)
		colorUpland    (0.433, 0.396, 0.353, 0.000)
		colorRock      (0.467, 0.431, 0.381, 0.000)
		colorSnow      (0.509, 0.459, 0.401, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000789611
		Period          0.00414957
		Eccentricity    0.150424
		Inclination     50.8
		AscendingNode   -104.299
		ArgOfPericenter -37.1866
		MeanAnomaly     15.3371
	}
}

DwarfMoon	"Eshan System 2.D3"
{
	ParentBody     "Eshan System 2"
	Class	       "Asteroid"

	Mass            3.6507e-006
	Radius          107.998
	InertiaMoment   0.399572

	RotationPeriod  163.244
	Obliquity       -81.6817
	EqAscendNode    -84.7057

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.766 0.761 0.759)

	Surface
	{
		SurfStyle       0.554674
		OceanStyle      0.706477
		Randomize      (-0.223, 0.268, 0.289)
		colorDistMagn   0.486464
		colorDistFreq   4.55362
		detailScale     2949.08
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997588
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.394901
		terraceProb     0.439483
		erosion         0
		montesMagn      0.5248
		montesFreq      3.77365
		montesSpiky     0.859282
		montesFraction  0.523037
		dunesFraction   0
		hillsMagn       0
		hillsFreq       29.8843
		hillsFraction   0.669034
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227286
		craterFreq      0.361472
		craterDensity   0.8434
		craterOctaves   15
		volcanoActivity 0.0272872
		volcanoFlows    0
		volcanoRadius   0.48347
		volcanoTemp     1728.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.299, 0.259, 0.212, 0.000)
		colorShelf     (0.306, 0.266, 0.243, 0.000)
		colorBeach     (0.360, 0.312, 0.288, 0.000)
		colorDesert    (0.391, 0.335, 0.281, 0.000)
		colorLowland   (0.429, 0.358, 0.319, 0.000)
		colorUpland    (0.475, 0.434, 0.387, 0.000)
		colorRock      (0.513, 0.472, 0.417, 0.000)
		colorSnow      (0.559, 0.502, 0.440, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00135339
		Period          0.00931141
		Eccentricity    0.371042
		Inclination     -81.6817
		AscendingNode   -84.7057
		ArgOfPericenter -142.17
		MeanAnomaly     -28.7623
	}
}

DwarfMoon	"Eshan System 2.D4"
{
	ParentBody     "Eshan System 2"
	Class	       "Asteroid"

	Mass            5.68596e-006
	Radius          276.011
	InertiaMoment   0.397321

	Obliquity       -80.7291
	EqAscendNode    -21.8067
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.701 0.648 0.572)

	Surface
	{
		SurfStyle       0.0758764
		OceanStyle      0.385842
		Randomize      (0.805, -0.034, 0.024)
		colorDistMagn   0.684068
		colorDistFreq   50.3633
		detailScale     7536.95
		colorConversion true
		snowLevel       2
		tropicLatitude  0.477941
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.600396
		terraceProb     0.195467
		erosion         0
		montesMagn      0.540935
		montesFreq      3.0938
		montesSpiky     0.98529
		montesFraction  0.640808
		dunesFraction   0
		hillsMagn       0
		hillsFreq       161.278
		hillsFraction   0.487986
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.280187
		craterFreq      2.43957
		craterDensity   1.06256
		craterOctaves   17
		volcanoActivity 0.128702
		volcanoFlows    0
		volcanoRadius   0.597845
		volcanoTemp     1350.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.280, 0.259, 0.229, 0.000)
		colorShelf     (0.298, 0.275, 0.243, 0.000)
		colorBeach     (0.315, 0.291, 0.257, 0.000)
		colorDesert    (0.333, 0.308, 0.271, 0.000)
		colorLowland   (0.350, 0.324, 0.286, 0.000)
		colorUpland    (0.368, 0.340, 0.300, 0.000)
		colorRock      (0.385, 0.356, 0.314, 0.000)
		colorSnow      (0.403, 0.372, 0.329, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00168157
		Period          0.0128961
		Eccentricity    0.166022
		Inclination     -80.7291
		AscendingNode   -21.8067
		ArgOfPericenter 39.2726
		MeanAnomaly     10.8502
	}
}

DwarfMoon	"Eshan System 2.D5"
{
	ParentBody     "Eshan System 2"
	Class	       "Asteroid"

	Mass            1.79891e-011
	Radius          2.10559
	InertiaMoment   0.398745

	RotationPeriod  232.536
	Obliquity       2.12136
	EqAscendNode    59.0792

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.589 0.390 0.322)

	Surface
	{
		SurfStyle       0.853872
		OceanStyle      0.835874
		Randomize      (-0.949, 0.854, 0.724)
		colorDistMagn   0.409366
		colorDistFreq   0.00341126
		detailScale     57.4966
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0643762
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.342101
		terraceProb     0.250201
		erosion         0
		montesMagn      0.537513
		montesFreq      3.52204
		montesSpiky     0.92959
		montesFraction  0.775567
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0076661
		hillsFraction   0.619721
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232597
		craterFreq      0.149279
		craterDensity   0.873055
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.521628
		volcanoTemp     1145.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.200, 0.136, 0.129, 0.050)
		colorShelf     (0.236, 0.160, 0.148, 0.040)
		colorBeach     (0.271, 0.183, 0.168, 0.030)
		colorDesert    (0.306, 0.207, 0.190, 0.020)
		colorLowland   (0.342, 0.230, 0.209, 0.030)
		colorUpland    (0.377, 0.253, 0.229, 0.050)
		colorRock      (0.412, 0.277, 0.255, 0.020)
		colorSnow      (0.412, 0.277, 0.255, 1.000)
		BumpHeight      1.89503
		BumpOffset      0.379006
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00193483
		Period          0.0159166
		Eccentricity    0.335912
		Inclination     2.12136
		AscendingNode   59.0792
		ArgOfPericenter -172.955
		MeanAnomaly     -128.395
	}
}

Planet	"Eshan System 3"
{
	ParentBody     "Eshan System"
	Class	       "IceGiant"

	Mass            13.1121
	Radius          20507.2
	InertiaMoment   0.252932

	Obliquity       -2.47454
	EqAscendNode    78.0164
	TidalLocked     true

	AlbedoBond      0.417008
	AlbedoGeom      0.50041
	Brightness      2

	Surface
	{
		SurfStyle       0.342341
		Randomize      (0.236, -0.649, -0.508)
		detailScale     52745.8
		colorConversion true
		tropicLatitude  0.0670614
		icecapLatitude  0.967061
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     7.38137
		stripeFluct     0.318072
		stripeTwist     13.0466
		cycloneMagn     14.9901
		cycloneFreq     0.511107
		cycloneDensity  0.218285
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
		BumpHeight      17.7585
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          55.2207
		Velocity        623.044
		BumpHeight      37.4628
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.69576
		mainOctaves     12
		Coverage        0.0850399
		stripeZones     7.38137
		stripeFluct     0.318072
		stripeTwist     13.0466
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Jupiter"
		Height          205.072
		Density         602.936
		Pressure        101761
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.00282094
		Saturation      0.513453

		Composition
		{
			H2    	85.3828
			He    	13.7046
			CH4   	0.74006
			N2    	0.0778027
			NH3   	0.0606793
			O2    	0.0174919
			C2H2  	0.00750896
			C2H4  	0.00261429
			Ne    	0.00260748
			Ar    	0.00185836
			C2H6  	0.00140104
			C3H8  	0.000660665
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.395021
		Period          0.252884
		Eccentricity    0.0257583
		Inclination     -2.47454
		AscendingNode   78.0164
		ArgOfPericenter 30.8734
		MeanAnomaly     136.876
	}
}

DwarfMoon	"Eshan System 3.D1"
{
	ParentBody     "Eshan System 3"
	Class	       "Asteroid"

	Mass            1.52706e-009
	Radius          9.00613
	InertiaMoment   0.398004

	Oblateness      0.0770355

	Obliquity       -0.0107696
	EqAscendNode    53.2803
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.755 0.752 0.749)

	Surface
	{
		SurfStyle       0.675692
		OceanStyle      0.963523
		Randomize      (0.627, 0.962, -0.129)
		colorDistMagn   0.963813
		colorDistFreq   0.0529069
		detailScale     245.927
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.572442
		terraceProb     0.175355
		erosion         0
		montesMagn      0.440901
		montesFreq      3.07102
		montesSpiky     0.884055
		montesFraction  0.866809
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.171759
		hillsFraction   0.476507
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264854
		craterFreq      0.185752
		craterDensity   0.819514
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.500144
		volcanoTemp     1389.82
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.294, 0.256, 0.210, 0.000)
		colorShelf     (0.302, 0.263, 0.240, 0.000)
		colorBeach     (0.355, 0.308, 0.285, 0.000)
		colorDesert    (0.385, 0.331, 0.277, 0.000)
		colorLowland   (0.423, 0.354, 0.315, 0.000)
		colorUpland    (0.468, 0.429, 0.382, 0.000)
		colorRock      (0.506, 0.466, 0.412, 0.000)
		colorSnow      (0.551, 0.497, 0.435, 1.000)
		BumpHeight      8.10552
		BumpOffset      1.6211
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000310848
		Period          0.000875315
		Eccentricity    7.91143e-005
		Inclination     -0.0107696
		AscendingNode   53.2803
		ArgOfPericenter -169.037
		MeanAnomaly     -177.1
	}
}

DwarfMoon	"Eshan System 3.D2"
{
	ParentBody     "Eshan System 3"
	Class	       "Asteroid"

	Mass            2.15674e-009
	Radius          17.6949
	InertiaMoment   0.399143

	Oblateness      0.249

	Obliquity       0.0121125
	EqAscendNode    67.9122
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.677 0.672 0.668)

	Surface
	{
		SurfStyle       0.964326
		OceanStyle      0.976379
		Randomize      (-0.357, -0.697, 0.203)
		colorDistMagn   0.972274
		colorDistFreq   0.106741
		detailScale     483.188
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.459764
		terraceProb     0.209857
		erosion         0
		montesMagn      0.298208
		montesFreq      2.77692
		montesSpiky     0.962032
		montesFraction  0.541461
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.633559
		hillsFraction   0.604762
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25073
		craterFreq      0.204559
		craterDensity   0.907942
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.477198
		volcanoTemp     1387.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.230, 0.235, 0.267, 0.050)
		colorShelf     (0.271, 0.276, 0.307, 0.040)
		colorBeach     (0.311, 0.316, 0.347, 0.030)
		colorDesert    (0.352, 0.356, 0.394, 0.020)
		colorLowland   (0.392, 0.397, 0.434, 0.030)
		colorUpland    (0.433, 0.437, 0.474, 0.050)
		colorRock      (0.474, 0.477, 0.528, 0.020)
		colorSnow      (0.474, 0.477, 0.528, 1.000)
		BumpHeight      15.9254
		BumpOffset      3.18507
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000326189
		Period          0.000940906
		Eccentricity    3.01354e-005
		Inclination     0.0121125
		AscendingNode   67.9122
		ArgOfPericenter 23.166
		MeanAnomaly     125.528
	}
}

DwarfMoon	"Eshan System 3.D3"
{
	ParentBody     "Eshan System 3"
	Class	       "Asteroid"

	Mass            3.01756e-009
	Radius          9.8578
	InertiaMoment   0.39528

	Oblateness      0.0374671

	Obliquity       0.011461
	EqAscendNode    -118.364
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.522 0.441 0.322)

	Surface
	{
		SurfStyle       0.53128
		OceanStyle      0.955594
		Randomize      (0.953, -0.684, 0.284)
		colorDistMagn   0.853459
		colorDistFreq   0.0828173
		detailScale     269.184
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.345287
		terraceProb     0.296694
		erosion         0
		montesMagn      0.554879
		montesFreq      2.71154
		montesSpiky     0.931228
		montesFraction  0.367331
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.305561
		hillsFraction   0.580573
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262166
		craterFreq      0.168196
		craterDensity   0.817182
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.520681
		volcanoTemp     1542.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.204, 0.150, 0.090, 0.000)
		colorShelf     (0.209, 0.154, 0.103, 0.000)
		colorBeach     (0.246, 0.181, 0.122, 0.000)
		colorDesert    (0.266, 0.194, 0.119, 0.000)
		colorLowland   (0.293, 0.207, 0.135, 0.000)
		colorUpland    (0.324, 0.252, 0.164, 0.000)
		colorRock      (0.350, 0.274, 0.177, 0.000)
		colorSnow      (0.381, 0.291, 0.187, 1.000)
		BumpHeight      8.87202
		BumpOffset      1.7744
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000343604
		Period          0.00101725
		Eccentricity    4.51917e-005
		Inclination     0.011461
		AscendingNode   -118.364
		ArgOfPericenter -119.469
		MeanAnomaly     58.524
	}
}

DwarfMoon	"Eshan System 3.D4"
{
	ParentBody     "Eshan System 3"
	Class	       "Asteroid"

	Mass            4.18907e-009
	Radius          24.3594
	InertiaMoment   0.3982

	Oblateness      0.249

	Obliquity       0.00154799
	EqAscendNode    156.621
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.614 0.609 0.605)

	Surface
	{
		SurfStyle       0.0962714
		OceanStyle      0.390269
		Randomize      (-0.152, -0.034, -0.880)
		colorDistMagn   0.667594
		colorDistFreq   0.411784
		detailScale     665.173
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.326719
		terraceProb     0.103346
		erosion         0
		montesMagn      0.452917
		montesFreq      2.73909
		montesSpiky     0.917759
		montesFraction  0.61736
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.10059
		hillsFraction   0.831714
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234652
		craterFreq      0.167498
		craterDensity   0.814282
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.540059
		volcanoTemp     2185.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.245, 0.244, 0.242, 0.000)
		colorShelf     (0.261, 0.259, 0.257, 0.000)
		colorBeach     (0.276, 0.274, 0.272, 0.000)
		colorDesert    (0.292, 0.289, 0.287, 0.000)
		colorLowland   (0.307, 0.305, 0.303, 0.000)
		colorUpland    (0.322, 0.320, 0.318, 0.000)
		colorRock      (0.338, 0.335, 0.333, 0.000)
		colorSnow      (0.353, 0.350, 0.348, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000349695
		Period          0.00104442
		Eccentricity    8.46471e-005
		Inclination     0.00154799
		AscendingNode   156.621
		ArgOfPericenter -36.8739
		MeanAnomaly     -3.27106
	}
}

DwarfMoon	"Eshan System 3.D5"
{
	ParentBody     "Eshan System 3"
	Class	       "Asteroid"

	Mass            5.77807e-009
	Radius          14.1591
	InertiaMoment   0.399278

	Oblateness      0.0488187

	Obliquity       0.00787058
	EqAscendNode    22.4406
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.827 0.774 0.714)

	Surface
	{
		SurfStyle       0.83457
		OceanStyle      0.46489
		Randomize      (-0.648, 0.327, 0.969)
		colorDistMagn   0.521463
		colorDistFreq   0.112839
		detailScale     386.637
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.578728
		terraceProb     0.352821
		erosion         0
		montesMagn      0.455876
		montesFreq      2.4484
		montesSpiky     0.756188
		montesFraction  0.481247
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.322858
		hillsFraction   0.666661
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240185
		craterFreq      0.228628
		craterDensity   0.964251
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.468084
		volcanoTemp     1538.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.322, 0.263, 0.200, 0.000)
		colorShelf     (0.331, 0.271, 0.228, 0.000)
		colorBeach     (0.389, 0.317, 0.271, 0.000)
		colorDesert    (0.422, 0.340, 0.264, 0.000)
		colorLowland   (0.463, 0.364, 0.300, 0.000)
		colorUpland    (0.513, 0.441, 0.364, 0.000)
		colorRock      (0.554, 0.480, 0.392, 0.000)
		colorSnow      (0.604, 0.511, 0.414, 1.000)
		BumpHeight      12.7432
		BumpOffset      2.54863
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000365703
		Period          0.00111695
		Eccentricity    4.35532e-005
		Inclination     0.00787058
		AscendingNode   22.4406
		ArgOfPericenter 125.291
		MeanAnomaly     145.481
	}
}

DwarfMoon	"Eshan System 3.D6"
{
	ParentBody     "Eshan System 3"
	Class	       "Asteroid"

	Mass            7.92829e-009
	Radius          14.824
	InertiaMoment   0.396352

	Oblateness      0.0369462

	Obliquity       0.000867731
	EqAscendNode    147.742
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.805 0.748 0.717)

	Surface
	{
		SurfStyle       0.436514
		OceanStyle      0.117279
		Randomize      (0.610, -0.200, -0.298)
		colorDistMagn   0.906374
		colorDistFreq   0.0891882
		detailScale     404.794
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.293968
		terraceProb     0.216759
		erosion         0
		montesMagn      0.65385
		montesFreq      3.13347
		montesSpiky     0.893836
		montesFraction  0.584988
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.426123
		hillsFraction   0.778821
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237123
		craterFreq      0.170788
		craterDensity   0.932729
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.477358
		volcanoTemp     1623.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.322, 0.299, 0.287, 0.000)
		colorShelf     (0.342, 0.318, 0.305, 0.000)
		colorBeach     (0.362, 0.337, 0.323, 0.000)
		colorDesert    (0.382, 0.356, 0.341, 0.000)
		colorLowland   (0.402, 0.374, 0.358, 0.000)
		colorUpland    (0.422, 0.393, 0.376, 0.000)
		colorRock      (0.442, 0.412, 0.394, 0.000)
		colorSnow      (0.463, 0.430, 0.412, 1.000)
		BumpHeight      13.3416
		BumpOffset      2.66832
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000376713
		Period          0.00116777
		Eccentricity    6.44357e-006
		Inclination     0.000867731
		AscendingNode   147.742
		ArgOfPericenter 28.8091
		MeanAnomaly     82.3621
	}
}

DwarfMoon	"Eshan System 3.D7"
{
	ParentBody     "Eshan System 3"
	Class	       "Asteroid"

	Mass            1.08339e-008
	Radius          28.9303
	InertiaMoment   0.39838

	Oblateness      0.197474

	Obliquity       0.00656914
	EqAscendNode    24.6954
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.593 0.590 0.586)

	Surface
	{
		SurfStyle       0.359738
		OceanStyle      0.040556
		Randomize      (0.425, 0.198, 0.634)
		colorDistMagn   0.963283
		colorDistFreq   0.648801
		detailScale     789.991
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.424677
		terraceProb     0.214494
		erosion         0
		montesMagn      0.477926
		montesFreq      2.31755
		montesSpiky     0.992097
		montesFraction  0.453553
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.19937
		hillsFraction   0.669781
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.209527
		craterFreq      0.193773
		craterDensity   0.753529
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.495522
		volcanoTemp     1711.92
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.237, 0.236, 0.234, 0.000)
		colorShelf     (0.252, 0.251, 0.249, 0.000)
		colorBeach     (0.267, 0.265, 0.264, 0.000)
		colorDesert    (0.282, 0.280, 0.278, 0.000)
		colorLowland   (0.297, 0.295, 0.293, 0.000)
		colorUpland    (0.311, 0.310, 0.308, 0.000)
		colorRock      (0.326, 0.324, 0.322, 0.000)
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

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000379884
		Period          0.00118255
		Eccentricity    9.65065e-005
		Inclination     0.00656914
		AscendingNode   24.6954
		ArgOfPericenter -157.002
		MeanAnomaly     12.2825
	}
}

DwarfMoon	"Eshan System 3.D8"
{
	ParentBody     "Eshan System 3"
	Class	       "Asteroid"

	Mass            1.47581e-008
	Radius          21.2452
	InertiaMoment   0.39941

	Oblateness      0.0519676

	Obliquity       0.0126387
	EqAscendNode    -14.1875
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.568 0.563 0.557)

	Surface
	{
		SurfStyle       0.686942
		OceanStyle      0.883306
		Randomize      (-0.076, 0.678, -0.403)
		colorDistMagn   0.764614
		colorDistFreq   0.16099
		detailScale     580.134
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000488281
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.665296
		terraceProb     0.294543
		erosion         0
		montesMagn      0.529594
		montesFreq      2.03597
		montesSpiky     0.936565
		montesFraction  0.410464
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.06501
		hillsFraction   0.642011
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228086
		craterFreq      0.24104
		craterDensity   0.849386
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.525382
		volcanoTemp     1507.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.221, 0.191, 0.156, 0.000)
		colorShelf     (0.227, 0.197, 0.178, 0.000)
		colorBeach     (0.267, 0.231, 0.212, 0.000)
		colorDesert    (0.290, 0.248, 0.206, 0.000)
		colorLowland   (0.318, 0.265, 0.234, 0.000)
		colorUpland    (0.352, 0.321, 0.284, 0.000)
		colorRock      (0.380, 0.349, 0.306, 0.000)
		colorSnow      (0.414, 0.372, 0.323, 1.000)
		BumpHeight      19.1206
		BumpOffset      3.82413
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000393212
		Period          0.00124533
		Eccentricity    1.71249e-005
		Inclination     0.0126387
		AscendingNode   -14.1875
		ArgOfPericenter 46.5951
		MeanAnomaly     -66.9774
	}
}

DwarfMoon	"Eshan System 3.D9"
{
	ParentBody     "Eshan System 3"
	Class	       "Asteroid"

	Mass            2.006e-008
	Radius          39.2084
	InertiaMoment   0.396873

	Oblateness      0.2293

	Obliquity       -0.00388227
	EqAscendNode    153.848
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.810 0.772 0.698)

	Surface
	{
		SurfStyle       0.914908
		OceanStyle      0.243731
		Randomize      (0.586, -0.561, -0.110)
		colorDistMagn   0.992608
		colorDistFreq   1.15351
		detailScale     1070.65
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.380022
		terraceProb     0.249047
		erosion         0
		montesMagn      0.42475
		montesFreq      2.57991
		montesSpiky     0.927696
		montesFraction  0.59961
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.27294
		hillsFraction   0.76029
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218587
		craterFreq      0.24806
		craterDensity   0.741381
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.459037
		volcanoTemp     1649.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.275, 0.270, 0.279, 0.050)
		colorShelf     (0.324, 0.316, 0.321, 0.040)
		colorBeach     (0.372, 0.363, 0.363, 0.030)
		colorDesert    (0.421, 0.409, 0.412, 0.020)
		colorLowland   (0.470, 0.455, 0.454, 0.030)
		colorUpland    (0.518, 0.502, 0.496, 0.050)
		colorRock      (0.567, 0.548, 0.551, 0.020)
		colorSnow      (0.567, 0.548, 0.551, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000398149
		Period          0.00126885
		Eccentricity    6.91231e-006
		Inclination     -0.00388227
		AscendingNode   153.848
		ArgOfPericenter 77.72
		MeanAnomaly     103.05
	}
}

DwarfMoon	"Eshan System 3.D10"
{
	ParentBody     "Eshan System 3"
	Class	       "Asteroid"

	Mass            2.72314e-008
	Radius          22.5536
	InertiaMoment   0.398548

	RotationPeriod  73.3865
	Obliquity       -61.6444
	EqAscendNode    141

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.681 0.678 0.674)

	Surface
	{
		SurfStyle       0.523325
		OceanStyle      0.458405
		Randomize      (0.372, 0.131, 0.472)
		colorDistMagn   0.865877
		colorDistFreq   0.233304
		detailScale     615.863
		colorConversion true
		snowLevel       2
		tropicLatitude  0.561588
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.502211
		terraceProb     0.453863
		erosion         0
		montesMagn      0.578045
		montesFreq      2.55762
		montesSpiky     0.966757
		montesFraction  0.699206
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.962673
		hillsFraction   0.821985
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.282585
		craterFreq      0.188031
		craterDensity   0.897262
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.474111
		volcanoTemp     1366.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.266, 0.231, 0.189, 0.000)
		colorShelf     (0.272, 0.237, 0.216, 0.000)
		colorBeach     (0.320, 0.278, 0.256, 0.000)
		colorDesert    (0.347, 0.298, 0.249, 0.000)
		colorLowland   (0.381, 0.319, 0.283, 0.000)
		colorUpland    (0.422, 0.387, 0.344, 0.000)
		colorRock      (0.456, 0.421, 0.370, 0.000)
		colorSnow      (0.497, 0.448, 0.391, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00183533
		Period          0.0125578
		Eccentricity    0.385724
		Inclination     -61.6444
		AscendingNode   141
		ArgOfPericenter -119.893
		MeanAnomaly     29.306
	}
}

DwarfMoon	"Eshan System 3.D11"
{
	ParentBody     "Eshan System 3"
	Class	       "Asteroid"

	Mass            3.69511e-008
	Radius          23.3761
	InertiaMoment   0.399539

	RotationPeriod  295.99
	Obliquity       -59.0744
	EqAscendNode    52.3468

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.794 0.791 0.789)

	Surface
	{
		SurfStyle       0.78102
		OceanStyle      0.687784
		Randomize      (0.879, 0.057, -0.222)
		colorDistMagn   0.974599
		colorDistFreq   0.180892
		detailScale     638.324
		colorConversion true
		snowLevel       2
		tropicLatitude  0.98266
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.435869
		terraceProb     0.548918
		erosion         0
		montesMagn      0.589296
		montesFreq      1.8361
		montesSpiky     0.924007
		montesFraction  0.299316
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.07881
		hillsFraction   0.551951
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235149
		craterFreq      0.250173
		craterDensity   0.755584
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.574267
		volcanoTemp     1639.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.310, 0.269, 0.221, 0.000)
		colorShelf     (0.318, 0.277, 0.253, 0.000)
		colorBeach     (0.373, 0.324, 0.300, 0.000)
		colorDesert    (0.405, 0.348, 0.292, 0.000)
		colorLowland   (0.445, 0.372, 0.331, 0.000)
		colorUpland    (0.492, 0.451, 0.402, 0.000)
		colorRock      (0.532, 0.491, 0.434, 0.000)
		colorSnow      (0.580, 0.522, 0.458, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00223567
		Period          0.0168832
		Eccentricity    0.439697
		Inclination     -59.0744
		AscendingNode   52.3468
		ArgOfPericenter 148.934
		MeanAnomaly     5.40201
	}
}

DwarfMoon	"Eshan System 3.D12"
{
	ParentBody     "Eshan System 3"
	Class	       "Asteroid"

	Mass            5.0162e-008
	Radius          57.0746
	InertiaMoment   0.397241

	Oblateness      0.00105019

	Obliquity       21.9586
	EqAscendNode    -156.543
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.654 0.646 0.643)

	Surface
	{
		SurfStyle       0.0482165
		OceanStyle      0.742704
		Randomize      (-0.198, -0.880, 0.234)
		colorDistMagn   0.542473
		colorDistFreq   1.69585
		detailScale     1558.52
		colorConversion true
		snowLevel       2
		tropicLatitude  0.151586
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.37772
		terraceProb     0.282022
		erosion         0
		montesMagn      0.485739
		montesFreq      3.90494
		montesSpiky     0.949136
		montesFraction  0.48364
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.22614
		hillsFraction   0.816015
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232692
		craterFreq      0.202697
		craterDensity   0.862173
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.481686
		volcanoTemp     1444.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.261, 0.259, 0.257, 0.000)
		colorShelf     (0.278, 0.275, 0.273, 0.000)
		colorBeach     (0.294, 0.291, 0.289, 0.000)
		colorDesert    (0.310, 0.307, 0.306, 0.000)
		colorLowland   (0.327, 0.323, 0.322, 0.000)
		colorUpland    (0.343, 0.339, 0.338, 0.000)
		colorRock      (0.359, 0.356, 0.354, 0.000)
		colorSnow      (0.376, 0.372, 0.370, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00257241
		Period          0.0208379
		Eccentricity    0.103811
		Inclination     21.9586
		AscendingNode   -156.543
		ArgOfPericenter -85.4744
		MeanAnomaly     51.3177
	}
}

DwarfMoon	"Eshan System 3.D13"
{
	ParentBody     "Eshan System 3"
	Class	       "Asteroid"

	Mass            6.81851e-008
	Radius          32.8465
	InertiaMoment   0.398706

	Obliquity       -65.8023
	EqAscendNode    -34.8894
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.684 0.620 0.587)

	Surface
	{
		SurfStyle       0.172072
		OceanStyle      0.567404
		Randomize      (-0.256, -0.086, -0.085)
		colorDistMagn   0.557359
		colorDistFreq   0.896466
		detailScale     896.93
		colorConversion true
		snowLevel       2
		tropicLatitude  0.857526
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.765589
		terraceProb     0.223632
		erosion         0
		montesMagn      0.648651
		montesFreq      3.18675
		montesSpiky     0.997538
		montesFraction  0.385536
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.46504
		hillsFraction   0.615634
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.215259
		craterFreq      0.152173
		craterDensity   0.782779
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.472707
		volcanoTemp     1648.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.274, 0.248, 0.235, 0.000)
		colorShelf     (0.291, 0.264, 0.250, 0.000)
		colorBeach     (0.308, 0.279, 0.264, 0.000)
		colorDesert    (0.325, 0.295, 0.279, 0.000)
		colorLowland   (0.342, 0.310, 0.294, 0.000)
		colorUpland    (0.359, 0.326, 0.308, 0.000)
		colorRock      (0.376, 0.341, 0.323, 0.000)
		colorSnow      (0.393, 0.357, 0.338, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00319268
		Period          0.0288121
		Eccentricity    0.224528
		Inclination     -65.8023
		AscendingNode   -34.8894
		ArgOfPericenter 9.99073
		MeanAnomaly     -30.9287
	}
}

DwarfMoon	"Eshan System 3.D14"
{
	ParentBody     "Eshan System 3"
	Class	       "Asteroid"

	Mass            9.28884e-008
	Radius          63.1075
	InertiaMoment   0.399667

	RotationPeriod  488.984
	Obliquity       -64.7902
	EqAscendNode    143.638

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.666 0.665 0.663)

	Surface
	{
		SurfStyle       0.375762
		OceanStyle      0.0593679
		Randomize      (0.249, 0.951, 0.649)
		colorDistMagn   0.124863
		colorDistFreq   3.51986
		detailScale     1723.26
		colorConversion true
		snowLevel       2
		tropicLatitude  0.541641
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.34847
		terraceProb     0.564394
		erosion         0
		montesMagn      0.649762
		montesFreq      3.69462
		montesSpiky     0.994722
		montesFraction  0.577413
		dunesFraction   0
		hillsMagn       0
		hillsFreq       10.1255
		hillsFraction   0.569445
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.209349
		craterFreq      0.279488
		craterDensity   0.891489
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.57712
		volcanoTemp     1597.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.267, 0.266, 0.265, 0.000)
		colorShelf     (0.283, 0.283, 0.282, 0.000)
		colorBeach     (0.300, 0.299, 0.298, 0.000)
		colorDesert    (0.317, 0.316, 0.315, 0.000)
		colorLowland   (0.333, 0.333, 0.331, 0.000)
		colorUpland    (0.350, 0.349, 0.348, 0.000)
		colorRock      (0.366, 0.366, 0.365, 0.000)
		colorSnow      (0.383, 0.382, 0.381, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0035281
		Period          0.0334699
		Eccentricity    0.331143
		Inclination     -64.7902
		AscendingNode   143.638
		ArgOfPericenter 88.1391
		MeanAnomaly     57.7081
	}
}

DwarfMoon	"Eshan System 3.D15"
{
	ParentBody     "Eshan System 3"
	Class	       "Asteroid"

	Mass            1.2694e-007
	Radius          35.6704
	InertiaMoment   0.397534

	RotationPeriod  886.073
	Obliquity       -38.2457
	EqAscendNode    36.5355

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.731 0.728 0.726)

	Surface
	{
		SurfStyle       0.527901
		OceanStyle      0.159071
		Randomize      (-0.636, -0.363, -0.661)
		colorDistMagn   0.724201
		colorDistFreq   1.03282
		detailScale     974.04
		colorConversion true
		snowLevel       2
		tropicLatitude  0.951096
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.592682
		terraceProb     0.282729
		erosion         0
		montesMagn      0.586838
		montesFreq      2.54679
		montesSpiky     0.916614
		montesFraction  0.397337
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.84834
		hillsFraction   0.619268
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243533
		craterFreq      0.203867
		craterDensity   0.77459
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.532265
		volcanoTemp     1450.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.285, 0.248, 0.203, 0.000)
		colorShelf     (0.292, 0.255, 0.232, 0.000)
		colorBeach     (0.344, 0.299, 0.276, 0.000)
		colorDesert    (0.373, 0.320, 0.269, 0.000)
		colorLowland   (0.409, 0.342, 0.305, 0.000)
		colorUpland    (0.453, 0.415, 0.370, 0.000)
		colorRock      (0.490, 0.451, 0.399, 0.000)
		colorSnow      (0.534, 0.481, 0.421, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00400187
		Period          0.0404331
		Eccentricity    0.11654
		Inclination     -38.2457
		AscendingNode   36.5355
		ArgOfPericenter -9.75671
		MeanAnomaly     -119.939
	}
}

DwarfMoon	"Eshan System 3.D16"
{
	ParentBody     "Eshan System 3"
	Class	       "Asteroid"

	Mass            1.74195e-007
	Radius          50.2749
	InertiaMoment   0.398857

	Obliquity       -23.8757
	EqAscendNode    65.4867
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.730 0.727 0.723)

	Surface
	{
		SurfStyle       0.272371
		OceanStyle      0.853461
		Randomize      (-0.662, -0.510, -0.075)
		colorDistMagn   0.555655
		colorDistFreq   2.01769
		detailScale     1372.84
		colorConversion true
		snowLevel       2
		tropicLatitude  0.640208
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.495756
		terraceProb     0.237587
		erosion         0
		montesMagn      0.608424
		montesFreq      3.18264
		montesSpiky     0.826109
		montesFraction  0.635638
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.673
		hillsFraction   0.654161
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.205707
		craterFreq      0.262625
		craterDensity   0.973379
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.499191
		volcanoTemp     1221.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.292, 0.291, 0.289, 0.000)
		colorShelf     (0.310, 0.309, 0.307, 0.000)
		colorBeach     (0.329, 0.327, 0.326, 0.000)
		colorDesert    (0.347, 0.345, 0.344, 0.000)
		colorLowland   (0.365, 0.364, 0.362, 0.000)
		colorUpland    (0.383, 0.382, 0.380, 0.000)
		colorRock      (0.402, 0.400, 0.398, 0.000)
		colorSnow      (0.420, 0.418, 0.416, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00424781
		Period          0.0442171
		Eccentricity    0.0544586
		Inclination     -23.8757
		AscendingNode   65.4867
		ArgOfPericenter -64.2442
		MeanAnomaly     -135.792
	}
}

DwarfMoon	"Eshan System 3.D17"
{
	ParentBody     "Eshan System 3"
	Class	       "Asteroid"

	Mass            2.40299e-007
	Radius          90.8908
	InertiaMoment   0.399793

	RotationPeriod  2733.42
	Obliquity       49.8292
	EqAscendNode    2.92236

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.759 0.757 0.755)

	Surface
	{
		SurfStyle       0.201636
		OceanStyle      0.0381596
		Randomize      (-0.938, 0.797, -0.959)
		colorDistMagn   0.57134
		colorDistFreq   2.03754
		detailScale     2481.93
		colorConversion true
		snowLevel       2
		tropicLatitude  0.985955
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.499579
		terraceProb     0.316085
		erosion         0
		montesMagn      0.689172
		montesFreq      2.31524
		montesSpiky     0.930302
		montesFraction  0.281783
		dunesFraction   0
		hillsMagn       0
		hillsFreq       22.7854
		hillsFraction   0.672599
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256003
		craterFreq      0.309483
		craterDensity   0.826514
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.449627
		volcanoTemp     1734.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.304, 0.303, 0.302, 0.000)
		colorShelf     (0.322, 0.322, 0.321, 0.000)
		colorBeach     (0.341, 0.341, 0.340, 0.000)
		colorDesert    (0.360, 0.360, 0.359, 0.000)
		colorLowland   (0.379, 0.378, 0.378, 0.000)
		colorUpland    (0.398, 0.397, 0.396, 0.000)
		colorRock      (0.417, 0.416, 0.415, 0.000)
		colorSnow      (0.436, 0.435, 0.434, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00473093
		Period          0.0519712
		Eccentricity    0.0724699
		Inclination     49.8292
		AscendingNode   2.92236
		ArgOfPericenter 40.4366
		MeanAnomaly     110.609
	}
}

Planet	"Eshan/Eshan System 4"
{
	ParentBody     "Eshan System"
	Class	       "IceWorld"

	Mass            0.0853597
	Radius          1781.72
	InertiaMoment   0.367865

	RotationPeriod  58.8225
	Obliquity       -4.46338
	EqAscendNode    -105.161

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.222
	Color          (0.995 0.995 0.995)

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Subglacial/Terrestrial"
	}

	Surface
	{
		SurfStyle       0.709138
		OceanStyle      0.973179
		Randomize      (0.150, 0.394, -0.677)
		colorDistMagn   0.0559482
		colorDistFreq   695.494
		detailScale     12725.9
		colorConversion true
		drivenDarkening 0
		seaLevel        0.444444
		snowLevel       0.571429
		tropicLatitude  0.152325
		icecapLatitude  0
		icecapHeight    0.235088
		climatePole     0
		climateTropic   0
		climateEquator  0
		heightTempGrad  0.9375
		tropicWidth     0.148354
		mainFreq        3.45238
		venusFreq       1.85714
		venusMagn       8.88889
		mareFreq        0.001
		mareDensity     0
		terraceProb     0.53255
		erosion         0.222222
		montesMagn      0.1744
		montesFreq      277.855
		montesSpiky     0.993248
		montesFraction  0.430042
		dunesMagn       0.0399091
		dunesFreq       100
		dunesFraction   0.141717
		hillsMagn       0.127469
		hillsFreq       692.415
		hillsFraction   0.756125
		hills2Fraction  0
		riversMagn      49.7134
		riversFreq      3.14467
		riversSin       4.09672
		riversOctaves   0
		canyonsMagn     0.0559448
		canyonsFreq     100
		canyonFraction  0
		cracksMagn      0.0567531
		cracksFreq      3.10547
		cracksOctaves   2
		craterMagn      10
		craterFreq      0.14
		craterDensity   0
		craterOctaves   13
		craterRayedFactor 0.0982643
		volcanoMagn     0.246317
		volcanoFreq     0.67408
		volcanoDensity  0.192447
		volcanoOctaves  3
		volcanoActivity 0.00310219
		volcanoFlows    0.142305
		volcanoRadius   0.214755
		volcanoTemp     1447.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.18901
		stripeFluct     0
		stripeTwist     0.263861
		cycloneMagn     0
		cycloneFreq     0
		cycloneDensity  0
		cycloneOctaves  1
		colorSea       (0.453, 0.452, 0.471, 0.250)
		colorShelf     (0.495, 0.515, 0.534, 0.250)
		colorBeach     (0.403, 0.381, 0.408, 0.200)
		colorDesert    (0.375, 0.346, 0.358, 0.200)
		colorLowland   (0.276, 0.268, 0.295, 0.200)
		colorUpland    (0.524, 0.522, 0.534, 0.250)
		colorRock      (0.640, 0.630, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.276, 0.268, 0.295, 0.200)
		colorUpPlants  (0.524, 0.522, 0.534, 0.250)
		BumpHeight      20
		BumpOffset      4
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.3
		SpecBrightIce   0.3
		SpecularPower   150
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	Clouds
	{
		Height          37.48486
		DayAmbient      2
		Lommel          0.2
		Exposure        2
		Color          (1.000 1.000 1.000 1.000)
		mainFreq        1.987797
		mainOctaves     10
		Coverage        0.33
		twistZones      7.871131
		twistMagn       4.206349
	}

	Ocean
	{
		Height          1.721191
		DayAmbient      2
		Lommel          0
		Exposure        2
		Color          (1.000 1.000 1.000 1.000)
	}
    
	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          80.30857
		Density         100
		Pressure        1.178
		Greenhouse      0
		Bright          6.984127
		Opacity         0.1904762
		SkyLight        0.7142857
		
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
		SemiMajorAxis   0.680019
		Period          0.571192
		Eccentricity    0.0288803
		Inclination     -8.86454
		AscendingNode   -105.831
		ArgOfPericenter 237.632
		MeanAnomaly     159.247
	}
}

DwarfMoon	"Eshan System 4.D1"
{
	ParentBody     "Eshan System 4"
	Class	       "Asteroid"

	Mass            1.93747e-011
	Radius          2.12027
	InertiaMoment   0.399244

	Oblateness      0.249

	Obliquity       -0.0127256
	EqAscendNode    -127.967
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.811 0.766 0.689)

	Surface
	{
		SurfStyle       0.446148
		OceanStyle      0.191849
		Randomize      (-0.697, -0.951, -0.677)
		colorDistMagn   0.187889
		colorDistFreq   0.00216492
		detailScale     57.8974
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.491612
		terraceProb     0.341382
		erosion         0
		montesMagn      0.503959
		montesFreq      3.49006
		montesSpiky     0.886685
		montesFraction  0.5402
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00983064
		hillsFraction   0.674786
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253734
		craterFreq      0.168381
		craterDensity   0.983128
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.509269
		volcanoTemp     1624.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.324, 0.306, 0.276, 0.000)
		colorShelf     (0.345, 0.326, 0.293, 0.000)
		colorBeach     (0.365, 0.345, 0.310, 0.000)
		colorDesert    (0.385, 0.364, 0.327, 0.000)
		colorLowland   (0.406, 0.383, 0.345, 0.000)
		colorUpland    (0.426, 0.402, 0.362, 0.000)
		colorRock      (0.446, 0.421, 0.379, 0.000)
		colorSnow      (0.466, 0.441, 0.396, 1.000)
		BumpHeight      1.90824
		BumpOffset      0.381648
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.17279e-005
		Period          0.000421026
		Eccentricity    2.22487e-005
		Inclination     -0.0127256
		AscendingNode   -127.967
		ArgOfPericenter -124.906
		MeanAnomaly     1.59709
	}
}

DwarfMoon	"Eshan System 4.D2"
{
	ParentBody     "Eshan System 4"
	Class	       "Asteroid"

	Mass            3.70786e-011
	Radius          4.59531
	InertiaMoment   0.39617

	Oblateness      0.249

	Obliquity       0.00561956
	EqAscendNode    166.749
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.801 0.800 0.799)

	Surface
	{
		SurfStyle       0.581482
		OceanStyle      0.465923
		Randomize      (-0.234, -0.332, -0.675)
		colorDistMagn   0.721538
		colorDistFreq   0.00625909
		detailScale     125.483
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.352746
		terraceProb     0.141596
		erosion         0
		montesMagn      0.635684
		montesFreq      1.68363
		montesSpiky     0.967338
		montesFraction  0.110345
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0766753
		hillsFraction   0.680195
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.267934
		craterFreq      0.216105
		craterDensity   0.996473
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.539748
		volcanoTemp     1376.92
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.312, 0.272, 0.224, 0.000)
		colorShelf     (0.320, 0.280, 0.256, 0.000)
		colorBeach     (0.376, 0.328, 0.304, 0.000)
		colorDesert    (0.408, 0.352, 0.296, 0.000)
		colorLowland   (0.449, 0.376, 0.335, 0.000)
		colorUpland    (0.497, 0.456, 0.407, 0.000)
		colorRock      (0.537, 0.496, 0.439, 0.000)
		colorSnow      (0.585, 0.528, 0.463, 1.000)
		BumpHeight      4.13578
		BumpOffset      0.827157
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.60977e-005
		Period          0.000901576
		Eccentricity    4.15947e-005
		Inclination     0.00561956
		AscendingNode   166.749
		ArgOfPericenter 71.3121
		MeanAnomaly     8.81159
	}
}

Planet	"Eshan System 5"
{
	ParentBody     "Eshan System"
	Class	       "Desert"

	Mass            0.0988624
	Radius          3716.84
	InertiaMoment   0.328555

	Oblateness      0.00472191

	RotationPeriod  28.3875
	Obliquity       -36.7288
	EqAscendNode    155.139

	AlbedoBond      0.292584
	AlbedoGeom      0.3511
	Brightness      2
	Color          (0.762 0.760 0.758)

	Surface
	{
		SurfStyle       0.883317
		OceanStyle      0.979
		Randomize      (-0.430, -0.664, 0.184)
		colorDistMagn   0.0684936
		colorDistFreq   462.061
		detailScale     9559.92
		colorConversion true
		seaLevel        0.0534354
		snowLevel       0.85
		tropicLatitude  0.616139
		icecapLatitude  0.966457
		icecapHeight    0.0564857
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.22211
		venusFreq       1.53137
		venusMagn       0.316234
		mareFreq        2.33811
		mareDensity     0.0173267
		terraceProb     0.369564
		erosion         0
		montesMagn      0.170645
		montesFreq      207.627
		montesSpiky     0.977483
		montesFraction  0.971891
		dunesMagn       0.0430664
		dunesFreq       30.0254
		dunesFraction   0.790641
		hillsMagn       0.103058
		hillsFreq       470.822
		hillsFraction   0
		hills2Fraction  0
		riversMagn      63.7297
		riversFreq      3.20175
		riversSin       5.32741
		riversOctaves   0
		canyonsMagn     0.0576793
		canyonsFreq     79.0302
		canyonFraction  0
		cracksMagn      0.104098
		cracksFreq      0.272889
		cracksOctaves   0
		craterMagn      0.59837
		craterFreq      10.7172
		craterDensity   0
		craterOctaves   0.529888
		volcanoMagn     0.618864
		volcanoFreq     0.823228
		volcanoDensity  0.262192
		volcanoOctaves  3
		volcanoActivity 0.00795291
		volcanoFlows    0.767505
		volcanoRadius   0.474007
		volcanoTemp     1395.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.10783
		stripeTwist     0.0634308
		cycloneMagn     2.43447
		cycloneFreq     0.738794
		cycloneDensity  0.284546
		cycloneOctaves  4
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
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Clouds
	{
		Height          14.8616
		Velocity        103.359
		BumpHeight      4.8616
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.04741
		mainOctaves     10
		Coverage        0.185167
		stripeZones     2.10783
		stripeTwist     0.0634308
	}

	Clouds
	{
		Height          19.7231
		Velocity        77.6455
		BumpHeight      4.8616
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.04741
		mainOctaves     10
		Coverage        0.185167
		stripeZones     2.10783
		stripeTwist     0.0634308
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Mars"
		Height          99.6905
		Density         1.98471
		Pressure        0.737103
		Greenhouse      2.01328
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0239053
		Saturation      1

		Composition
		{
			CO2   	99.9839
			SO2   	0.013158
			Ar    	0.00295669
			Kr    	2.3159e-005
		}
	}

	Aurora
	{
		Height      84.1615
		NorthLat    72.1975
		NorthLon    95.9467
		NorthRadius 630.557
		NorthWidth  175.672
		NorthRings  5
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -90
		SouthLon    279.154
		SouthRadius 1041.17
		SouthWidth  393.351
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
		SemiMajorAxis   1.48288
		Period          1.83933
		Eccentricity    0.0365905
		Inclination     1.43888
		AscendingNode   154.778
		ArgOfPericenter 345.355
		MeanAnomaly     281.076
	}
}

Planet	"Eshan System 6"
{
	ParentBody     "Eshan System"
	Class	       "IceWorld"

	Mass            0.475863
	Radius          6486.96
	InertiaMoment   0.329559

	Oblateness      0.00828532

	RotationPeriod  22.5633
	Obliquity       -47.9846
	EqAscendNode    -28.1439

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.478 0.473 0.461)

	Surface
	{
		SurfStyle       0.714267
		OceanStyle      0.7327
		Randomize      (0.828, 0.964, 0.017)
		colorDistMagn   0.0724755
		colorDistFreq   929.346
		detailScale     16684.8
		colorConversion true
		drivenDarkening 0
		seaLevel        0.178146
		snowLevel       2
		tropicLatitude  0.723557
		icecapLatitude  1
		icecapHeight    0.178146
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.66505
		venusFreq       1.48238
		venusMagn       0
		mareFreq        1.53182
		mareDensity     0.0270005
		terraceProb     0.200177
		erosion         0
		montesMagn      0.200093
		montesFreq      255.204
		montesSpiky     0.879297
		montesFraction  0.349672
		dunesMagn       0.0528893
		dunesFreq       8495.66
		dunesFraction   0.603845
		hillsMagn       0.107049
		hillsFreq       728.076
		hillsFraction   0.37273
		hills2Fraction  0.208975
		riversMagn      49.1848
		riversFreq      2.69365
		riversSin       6.22799
		riversOctaves   0
		canyonsMagn     0.48724
		canyonsFreq     1.79912
		canyonFraction  0
		cracksMagn      0.0497467
		cracksFreq      3.69882
		cracksOctaves   5
		craterMagn      0.549033
		craterFreq      15.8313
		craterDensity   0.575758
		craterOctaves   7.94892
		craterRayedFactor 0.103168
		volcanoMagn     0.608757
		volcanoFreq     0.516228
		volcanoDensity  0.200678
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.23456
		volcanoRadius   0.518451
		volcanoTemp     1559.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.306, 0.303, 0.309, 0.250)
		colorShelf     (0.334, 0.345, 0.351, 0.250)
		colorBeach     (0.272, 0.255, 0.268, 0.200)
		colorDesert    (0.253, 0.232, 0.235, 0.200)
		colorLowland   (0.186, 0.180, 0.194, 0.200)
		colorUpland    (0.354, 0.350, 0.351, 0.250)
		colorRock      (0.640, 0.630, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.186, 0.180, 0.194, 0.200)
		colorUpPlants  (0.354, 0.350, 0.351, 0.250)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.453994
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
		Height          32.4348
		Density         0.0546006
		Pressure        0.0146431
		Greenhouse      0.295872
		Bright          8.86012
		Opacity         1
		SkyLight        2.95337
		Hue             0
		Saturation      0.989644

		Composition
		{
			CO2   	91.1036
			N2    	6.29529
			CH4   	2.20029
			C2H4  	0.236098
			C2H2  	0.0811026
			CO    	0.0584234
			Ar    	0.012517
			C2H6  	0.0124298
			Ne    	0.000192808
			H2S   	2.69641e-005
			Xe    	1.02558e-005
		}
	}

	Aurora
	{
		Height      154.835
		NorthLat    63.6904
		NorthLon    -10.3881
		NorthRadius 1701.86
		NorthWidth  517.991
		NorthRings  2
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -40.4908
		SouthLon    156.784
		SouthRadius 2012.5
		SouthWidth  629.415
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
		SemiMajorAxis   3.02857
		Period          5.36854
		Eccentricity    0.0493055
		Inclination     1.8226
		AscendingNode   -25.8076
		ArgOfPericenter 106.911
		MeanAnomaly     192.076
	}
}

Barycenter	"7-7.1"
{
	ParentBody     "Eshan System"
	Mass            2.35768
	Radius          128882
	RotationPeriod  24
	Obliquity       0
	EqAscendNode    0


	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.91106
		Period          11.0857
		Eccentricity    0.0122341
		Inclination     0.585362
		AscendingNode   47.6172
		ArgOfPericenter 5.57465
		MeanAnomaly     22.3045
	}
}

Planet	"Eshan System 7"
{
	ParentBody     "Eshan System 7-7.1"
	Class	       "IceWorld"

	Mass            2.26536
	Radius          8937.37
	InertiaMoment   0.330635

	Oblateness      0.00919669

	RotationPeriod  15.9045
	Obliquity       13.5456
	EqAscendNode    -14.4445

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.750 0.748 0.744)

	Surface
	{
		SurfStyle       0.442238
		OceanStyle      0.694635
		Randomize      (0.410, -0.738, 0.453)
		colorDistMagn   0.0551095
		colorDistFreq   897.406
		detailScale     22987.4
		colorConversion true
		drivenDarkening 0
		seaLevel        0.217003
		snowLevel       2
		tropicLatitude  0.232557
		icecapLatitude  0.674811
		icecapHeight    0.242072
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.90021
		venusFreq       0.645007
		venusMagn       0
		mareFreq        1.96331
		mareDensity     0.190028
		terraceProb     0.291555
		erosion         0
		montesMagn      0.250332
		montesFreq      468.177
		montesSpiky     0.905229
		montesFraction  0.482293
		dunesMagn       0.0331792
		dunesFreq       11939.7
		dunesFraction   0.200749
		hillsMagn       0.132563
		hillsFreq       1102.88
		hillsFraction   0.893323
		hills2Fraction  0.0430488
		riversMagn      64.4675
		riversFreq      4.13312
		riversSin       5.89687
		riversOctaves   0
		canyonsMagn     0.447433
		canyonsFreq     3.00456
		canyonFraction  0
		cracksMagn      0.0482269
		cracksFreq      3.92468
		cracksOctaves   8
		craterMagn      0.604124
		craterFreq      31.2923
		craterDensity   0.488585
		craterOctaves   8.5976
		craterRayedFactor 0
		volcanoMagn     0.54627
		volcanoFreq     0.762748
		volcanoDensity  0.257523
		volcanoOctaves  3
		volcanoActivity 0.416135
		volcanoFlows    0.259706
		volcanoRadius   0.4843
		volcanoTemp     1510.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.750, 0.748, 0.744, 0.500)
		colorShelf     (0.712, 0.711, 0.707, 0.500)
		colorBeach     (0.525, 0.524, 0.521, 0.750)
		colorDesert    (0.637, 0.636, 0.633, 1.000)
		colorLowland   (0.660, 0.658, 0.655, 1.000)
		colorUpland    (0.697, 0.696, 0.692, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.660, 0.658, 0.655, 1.000)
		colorUpPlants  (0.697, 0.696, 0.692, 1.000)
		BumpHeight      18.6199
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.544421
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
		Height          44.6868
		Density         0.0455579
		Pressure        0.0143766
		Greenhouse      1.26011
		Bright          8.54501
		Opacity         1
		SkyLight        2.84834
		Hue             -0.000501312
		Saturation      1

		Composition
		{
			N2    	99.6753
			Ar    	0.151023
			CO    	0.103913
			He    	0.0492506
			Ne    	0.0193609
			Kr    	0.00114369
		}
	}

	Aurora
	{
		Height      226.473
		NorthLat    55.8274
		NorthLon    93.8885
		NorthRadius 1020.66
		NorthWidth  337.213
		NorthRings  5
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -39.7596
		SouthLon    286.786
		SouthRadius 1652.36
		SouthWidth  449.108
		SouthRings  4
		SouthBright 0.3
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	Rings
	{
		InnerRadius     13206.1
		OuterRadius     29956.4
		RotationPeriod  5.8362
		RotationOffset  0
		FrontBright     0.859825
		BackBright      0.872692
		Density         0.652882
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   9.31259e-005
		Period          0.0436905
		Eccentricity    0.00107514
		Inclination     0.180615
		AscendingNode   -123.13
		ArgOfPericenter 305.883
		MeanAnomaly     30.2495
	}
}

Moon	"Eshan System 7.1"
{
	ParentBody     "Eshan System 7-7.1"
	Class	       "IceWorld"

	Mass            0.0923111
	Radius          3358.6
	InertiaMoment   0.330864

	Obliquity       0.180615
	EqAscendNode    -123.13
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.755 0.750 0.746)

	Surface
	{
		SurfStyle       0.323601
		OceanStyle      0.720783
		Randomize      (-0.064, 0.849, 0.233)
		colorDistMagn   0.075496
		colorDistFreq   493.303
		detailScale     8638.52
		colorConversion true
		drivenDarkening 0
		seaLevel        0.173441
		snowLevel       2
		tropicLatitude  0.00300996
		icecapLatitude  0.96692
		icecapHeight    0.1744
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.86352
		venusFreq       0.588603
		venusMagn       0
		mareFreq        1.85924
		mareDensity     0.0117561
		terraceProb     0.17168
		erosion         0
		montesMagn      0.150855
		montesFreq      125.601
		montesSpiky     0.791905
		montesFraction  0.86554
		dunesMagn       0.0526385
		dunesFreq       4280.38
		dunesFraction   0.90368
		hillsMagn       0.111584
		hillsFreq       329.315
		hillsFraction   0.323692
		hills2Fraction  0.0104445
		riversMagn      56.5473
		riversFreq      3.46815
		riversSin       4.69265
		riversOctaves   0
		canyonsMagn     0.417627
		canyonsFreq     1.2415
		canyonFraction  0
		cracksMagn      0.0322885
		cracksFreq      1.64454
		cracksOctaves   3
		craterMagn      0.53951
		craterFreq      11.1412
		craterDensity   0.897723
		craterOctaves   12
		craterRayedFactor 0.105532
		volcanoMagn     0.551665
		volcanoFreq     0.631484
		volcanoDensity  0.217739
		volcanoOctaves  3
		volcanoActivity 0.00560715
		volcanoFlows    0.174918
		volcanoRadius   0.613018
		volcanoTemp     1477.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.755, 0.750, 0.746, 0.500)
		colorShelf     (0.717, 0.712, 0.709, 0.500)
		colorBeach     (0.528, 0.525, 0.522, 0.750)
		colorDesert    (0.642, 0.637, 0.634, 1.000)
		colorLowland   (0.664, 0.660, 0.656, 1.000)
		colorUpland    (0.702, 0.697, 0.694, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.664, 0.660, 0.656, 1.000)
		colorUpPlants  (0.702, 0.697, 0.694, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.999525
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
		Height          147.179
		Density         4.75403e-005
		Pressure        1.4752e-005
		Greenhouse      0.080219
		Bright          2.16477
		Opacity         0
		SkyLight        0.721591
		Hue             -0.0356
		Saturation      1

		Composition
		{
			C2H4  	61.2727
			N2    	33.5001
			C2H6  	4.91664
			CO    	0.27105
			Ar    	0.029306
			CO2   	0.00837144
			H2S   	0.00124562
			Kr    	0.000342028
			Xe    	0.000139422
			C2H2  	6.53983e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00228536
		Period          0.0436905
		Eccentricity    0.00107514
		Inclination     0.180615
		AscendingNode   -123.13
		ArgOfPericenter 125.883
		MeanAnomaly     30.2495
	}
}

DwarfMoon	"Eshan System 7.D1"
{
	ParentBody     "Eshan System 7-7.1"
	Class	       "Asteroid"

	Mass            2.19264e-006
	Radius          185.507
	InertiaMoment   0.396886

	Obliquity       -63.2781
	EqAscendNode    -70.5497
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.656 0.603 0.566)

	Surface
	{
		SurfStyle       0.900717
		OceanStyle      0.981042
		Randomize      (-0.757, 0.163, 0.959)
		colorDistMagn   0.917095
		colorDistFreq   12.508
		detailScale     5065.58
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997984
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.590734
		terraceProb     0.166986
		erosion         0
		montesMagn      0.345772
		montesFreq      3.52292
		montesSpiky     0.901908
		montesFraction  0.764563
		dunesFraction   0
		hillsMagn       0
		hillsFreq       83.9471
		hillsFraction   0.690813
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230079
		craterFreq      0.936554
		craterDensity   1.09485
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.504559
		volcanoTemp     1087.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.223, 0.211, 0.226, 0.050)
		colorShelf     (0.262, 0.247, 0.260, 0.040)
		colorBeach     (0.302, 0.283, 0.294, 0.030)
		colorDesert    (0.341, 0.320, 0.334, 0.020)
		colorLowland   (0.380, 0.356, 0.368, 0.030)
		colorUpland    (0.420, 0.392, 0.402, 0.050)
		colorRock      (0.459, 0.428, 0.447, 0.020)
		colorSnow      (0.459, 0.428, 0.447, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0128848
		Period          0.561989
		Eccentricity    0.409339
		Inclination     -63.2781
		AscendingNode   -70.5497
		ArgOfPericenter -121.955
		MeanAnomaly     64.8707
	}
}

DwarfMoon	"Eshan System 7.D2"
{
	ParentBody     "Eshan System 7-7.1"
	Class	       "Asteroid"

	Mass            3.30788e-006
	Radius          204.376
	InertiaMoment   0.398553

	RotationPeriod  7018.42
	Obliquity       -50.4478
	EqAscendNode    -122.196

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.686 0.684 0.680)

	Surface
	{
		SurfStyle       0.940203
		OceanStyle      0.336382
		Randomize      (0.492, 0.345, -0.556)
		colorDistMagn   0.817554
		colorDistFreq   27.1672
		detailScale     5580.81
		colorConversion true
		snowLevel       2
		tropicLatitude  0.691631
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.562551
		terraceProb     0.123025
		erosion         0
		montesMagn      0.500921
		montesFreq      2.58977
		montesSpiky     0.907698
		montesFraction  0.417755
		dunesFraction   0
		hillsMagn       0
		hillsFreq       82.6157
		hillsFraction   0.732345
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237855
		craterFreq      1.49652
		craterDensity   1.01023
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.611909
		volcanoTemp     1262.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.233, 0.239, 0.272, 0.050)
		colorShelf     (0.274, 0.280, 0.313, 0.040)
		colorBeach     (0.315, 0.321, 0.353, 0.030)
		colorDesert    (0.357, 0.362, 0.401, 0.020)
		colorLowland   (0.398, 0.403, 0.442, 0.030)
		colorUpland    (0.439, 0.444, 0.482, 0.050)
		colorRock      (0.480, 0.485, 0.537, 0.020)
		colorSnow      (0.480, 0.485, 0.537, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0134668
		Period          0.600494
		Eccentricity    0.331166
		Inclination     -50.4478
		AscendingNode   -122.196
		ArgOfPericenter 81.6209
		MeanAnomaly     42.5313
	}
}

Moon	"Eshan System 7.2"
{
	ParentBody     "Eshan System 7-7.1"
	Class	       "IceWorld"

	Mass            5.11785e-006
	Radius          223.131
	InertiaMoment   0.399543

	Obliquity       -65.5203
	EqAscendNode    148.783
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.606 0.473 0.265)

	Surface
	{
		SurfStyle       0.0568409
		OceanStyle      0.407777
		Randomize      (0.696, -0.883, 0.941)
		colorDistMagn   0.0871499
		colorDistFreq   31.2869
		detailScale     573.904
		colorConversion true
		drivenDarkening 0
		seaLevel        0.163263
		snowLevel       2
		tropicLatitude  0.474842
		icecapLatitude  1
		icecapHeight    0.163263
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.54493
		venusFreq       1.02025
		venusMagn       0
		mareFreq        0
		mareDensity     2.82633e-006
		terraceProb     0.594951
		erosion         0
		montesMagn      0.045396
		montesFreq      11.4896
		montesSpiky     0.810838
		montesFraction  0.237594
		dunesMagn       0.0498248
		dunesFreq       294.816
		dunesFraction   0.855365
		hillsMagn       0.134547
		hillsFreq       26.9862
		hillsFraction   0.894121
		hills2Fraction  0.0352054
		riversMagn      54.0309
		riversFreq      1.76749
		riversSin       6.04247
		riversOctaves   0
		canyonsMagn     0.626485
		canyonsFreq     0.0969327
		canyonFraction  0
		cracksMagn      0.059252
		cracksFreq      0.0835041
		cracksOctaves   0
		craterMagn      1.0688
		craterFreq      0.639942
		craterDensity   0.904849
		craterOctaves   8
		craterRayedFactor 0.229378
		volcanoMagn     0.176083
		volcanoFreq     0.800008
		volcanoDensity  0.270853
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.279462
		volcanoRadius   0.153639
		volcanoTemp     1522.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.606, 0.473, 0.265, 0.500)
		colorShelf     (0.576, 0.450, 0.251, 0.500)
		colorBeach     (0.424, 0.331, 0.185, 0.750)
		colorDesert    (0.515, 0.402, 0.225, 1.000)
		colorLowland   (0.533, 0.417, 0.233, 1.000)
		colorUpland    (0.564, 0.440, 0.246, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.533, 0.417, 0.233, 1.000)
		colorUpPlants  (0.564, 0.440, 0.246, 1.000)
		BumpHeight      11.1565
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
		SemiMajorAxis   0.0138106
		Period          0.623634
		Eccentricity    0.24239
		Inclination     -65.5203
		AscendingNode   148.783
		ArgOfPericenter -38.7648
		MeanAnomaly     69.955
	}
}

DwarfMoon	"Eshan System 7.D3"
{
	ParentBody     "Eshan System 7-7.1"
	Class	       "Asteroid"

	Mass            1.5219e-011
	Radius          3.75461
	InertiaMoment   0.397251

	Obliquity       73.2015
	EqAscendNode    75.01
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.647 0.644 0.637)

	Surface
	{
		SurfStyle       0.815722
		OceanStyle      0.633449
		Randomize      (0.464, -0.221, 0.777)
		colorDistMagn   0.180027
		colorDistFreq   0.00461162
		detailScale     102.526
		colorConversion true
		snowLevel       2
		tropicLatitude  0.988145
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.747247
		terraceProb     0.16898
		erosion         0
		montesMagn      0.3695
		montesFreq      3.05951
		montesSpiky     0.902604
		montesFraction  0.421547
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.031894
		hillsFraction   0.661404
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222681
		craterFreq      0.255744
		craterDensity   0.815018
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.471517
		volcanoTemp     1403.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.252, 0.219, 0.178, 0.000)
		colorShelf     (0.259, 0.225, 0.204, 0.000)
		colorBeach     (0.304, 0.264, 0.242, 0.000)
		colorDesert    (0.330, 0.283, 0.236, 0.000)
		colorLowland   (0.362, 0.303, 0.267, 0.000)
		colorUpland    (0.401, 0.367, 0.325, 0.000)
		colorRock      (0.434, 0.399, 0.350, 0.000)
		colorSnow      (0.472, 0.425, 0.369, 1.000)
		BumpHeight      3.37915
		BumpOffset      0.675829
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0143027
		Period          0.65726
		Eccentricity    0.0412507
		Inclination     73.2015
		AscendingNode   75.01
		ArgOfPericenter 142.258
		MeanAnomaly     136.824
	}
}

DwarfMoon	"Eshan System 7.D4"
{
	ParentBody     "Eshan System 7-7.1"
	Class	       "Asteroid"

	Mass            3.00856e-011
	Radius          4.46762
	InertiaMoment   0.398711

	Obliquity       65.4024
	EqAscendNode    -143.875
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.573 0.568 0.565)

	Surface
	{
		SurfStyle       0.974417
		OceanStyle      0.245499
		Randomize      (-0.622, -0.029, 0.598)
		colorDistMagn   0.541828
		colorDistFreq   0.0057472
		detailScale     121.996
		colorConversion true
		snowLevel       2
		tropicLatitude  0.54096
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.393314
		terraceProb     0.337968
		erosion         0
		montesMagn      0.492618
		montesFreq      2.42803
		montesSpiky     0.99619
		montesFraction  0.629165
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0450495
		hillsFraction   0.552649
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229033
		craterFreq      0.261458
		craterDensity   1.00294
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.401791
		volcanoTemp     1494.14
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.195, 0.199, 0.226, 0.050)
		colorShelf     (0.229, 0.233, 0.260, 0.040)
		colorBeach     (0.264, 0.267, 0.294, 0.030)
		colorDesert    (0.298, 0.301, 0.333, 0.020)
		colorLowland   (0.333, 0.335, 0.367, 0.030)
		colorUpland    (0.367, 0.369, 0.401, 0.050)
		colorRock      (0.401, 0.403, 0.446, 0.020)
		colorSnow      (0.401, 0.403, 0.446, 1.000)
		BumpHeight      4.02085
		BumpOffset      0.804171
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0149192
		Period          0.700212
		Eccentricity    0.301782
		Inclination     65.4024
		AscendingNode   -143.875
		ArgOfPericenter 142.396
		MeanAnomaly     41.297
	}
}

DwarfMoon	"Eshan System 7.D5"
{
	ParentBody     "Eshan System 7-7.1"
	Class	       "Asteroid"

	Mass            5.45924e-011
	Radius          5.23397
	InertiaMoment   0.399671

	Obliquity       -1.78692
	EqAscendNode    110.499
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.476 0.473 0.470)

	Surface
	{
		SurfStyle       0.222527
		OceanStyle      0.152167
		Randomize      (0.402, 0.340, 0.515)
		colorDistMagn   0.217551
		colorDistFreq   0.015771
		detailScale     142.922
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0355435
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.528088
		terraceProb     0.461824
		erosion         0
		montesMagn      0.497204
		montesFreq      3.20463
		montesSpiky     0.797253
		montesFraction  0.864695
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0510352
		hillsFraction   0.814055
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241708
		craterFreq      0.239204
		craterDensity   0.998236
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.511523
		volcanoTemp     1749.82
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.190, 0.189, 0.188, 0.000)
		colorShelf     (0.202, 0.201, 0.200, 0.000)
		colorBeach     (0.214, 0.213, 0.212, 0.000)
		colorDesert    (0.226, 0.225, 0.223, 0.000)
		colorLowland   (0.238, 0.237, 0.235, 0.000)
		colorUpland    (0.250, 0.248, 0.247, 0.000)
		colorRock      (0.262, 0.260, 0.259, 0.000)
		colorSnow      (0.274, 0.272, 0.270, 1.000)
		BumpHeight      4.71058
		BumpOffset      0.942115
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0154528
		Period          0.738107
		Eccentricity    0.225233
		Inclination     -1.78692
		AscendingNode   110.499
		ArgOfPericenter -121.803
		MeanAnomaly     -161.071
	}
}

DwarfMoon	"Eshan System 7.D6"
{
	ParentBody     "Eshan System 7-7.1"
	Class	       "Asteroid"

	Mass            9.31668e-011
	Radius          5.94428
	InertiaMoment   0.397542

	RotationPeriod  13517.8
	Obliquity       41.9113
	EqAscendNode    129.849

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.676 0.672 0.667)

	Surface
	{
		SurfStyle       0.673083
		OceanStyle      0.196744
		Randomize      (0.227, -0.716, 0.221)
		colorDistMagn   0.307083
		colorDistFreq   0.0295547
		detailScale     162.318
		colorConversion true
		snowLevel       2
		tropicLatitude  0.54303
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.56818
		terraceProb     0.13021
		erosion         0
		montesMagn      0.586656
		montesFreq      2.28886
		montesSpiky     0.894788
		montesFraction  0.562525
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0749346
		hillsFraction   0.646064
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236357
		craterFreq      0.187735
		craterDensity   0.77587
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.490326
		volcanoTemp     1124.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.264, 0.229, 0.187, 0.000)
		colorShelf     (0.270, 0.235, 0.213, 0.000)
		colorBeach     (0.318, 0.276, 0.253, 0.000)
		colorDesert    (0.345, 0.296, 0.247, 0.000)
		colorLowland   (0.378, 0.316, 0.280, 0.000)
		colorUpland    (0.419, 0.383, 0.340, 0.000)
		colorRock      (0.453, 0.417, 0.367, 0.000)
		colorSnow      (0.493, 0.444, 0.387, 1.000)
		BumpHeight      5.34985
		BumpOffset      1.06997
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0159092
		Period          0.771052
		Eccentricity    0.396923
		Inclination     41.9113
		AscendingNode   129.849
		ArgOfPericenter -161.322
		MeanAnomaly     8.67952
	}
}

DwarfMoon	"Eshan System 7.D7"
{
	ParentBody     "Eshan System 7-7.1"
	Class	       "Asteroid"

	Mass            1.51845e-010
	Radius          8.17496
	InertiaMoment   0.398861

	RotationPeriod  4635.83
	Obliquity       -75.0911
	EqAscendNode    -27.3455

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.485 0.480 0.477)

	Surface
	{
		SurfStyle       0.456162
		OceanStyle      0.758296
		Randomize      (-0.031, -0.524, 0.971)
		colorDistMagn   0.400291
		colorDistFreq   0.0280047
		detailScale     223.231
		colorConversion true
		snowLevel       2
		tropicLatitude  0.64609
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.512991
		terraceProb     0.51715
		erosion         0
		montesMagn      0.412715
		montesFreq      2.89775
		montesSpiky     0.9822
		montesFraction  0.624762
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.146995
		hillsFraction   0.659128
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235035
		craterFreq      0.189684
		craterDensity   0.784598
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50768
		volcanoTemp     1680.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.194, 0.192, 0.191, 0.000)
		colorShelf     (0.206, 0.204, 0.203, 0.000)
		colorBeach     (0.218, 0.216, 0.215, 0.000)
		colorDesert    (0.230, 0.228, 0.226, 0.000)
		colorLowland   (0.243, 0.240, 0.238, 0.000)
		colorUpland    (0.255, 0.252, 0.250, 0.000)
		colorRock      (0.267, 0.264, 0.262, 0.000)
		colorSnow      (0.279, 0.276, 0.274, 1.000)
		BumpHeight      7.35746
		BumpOffset      1.47149
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0162135
		Period          0.793279
		Eccentricity    0.326136
		Inclination     -75.0911
		AscendingNode   -27.3455
		ArgOfPericenter -54.4644
		MeanAnomaly     144.516
	}
}

DwarfMoon	"Eshan System 7.D8"
{
	ParentBody     "Eshan System 7-7.1"
	Class	       "Asteroid"

	Mass            2.38797e-010
	Radius          8.96689
	InertiaMoment   0.399797

	RotationPeriod  12295.4
	Obliquity       -27.3279
	EqAscendNode    -20.9634

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.532 0.530 0.527)

	Surface
	{
		SurfStyle       0.555358
		OceanStyle      0.534825
		Randomize      (-0.885, -0.346, -0.750)
		colorDistMagn   0.985673
		colorDistFreq   0.0694718
		detailScale     244.856
		colorConversion true
		snowLevel       2
		tropicLatitude  0.805616
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.587015
		terraceProb     0.32299
		erosion         0
		montesMagn      0.334506
		montesFreq      3.17935
		montesSpiky     0.916243
		montesFraction  0.335712
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.185562
		hillsFraction   0.337178
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256047
		craterFreq      0.244532
		craterDensity   0.819122
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.510023
		volcanoTemp     1529.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.208, 0.180, 0.148, 0.000)
		colorShelf     (0.213, 0.186, 0.169, 0.000)
		colorBeach     (0.250, 0.217, 0.200, 0.000)
		colorDesert    (0.271, 0.233, 0.195, 0.000)
		colorLowland   (0.298, 0.249, 0.222, 0.000)
		colorUpland    (0.330, 0.302, 0.269, 0.000)
		colorRock      (0.357, 0.329, 0.290, 0.000)
		colorSnow      (0.388, 0.350, 0.306, 1.000)
		BumpHeight      8.0702
		BumpOffset      1.61404
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0168653
		Period          0.841593
		Eccentricity    0.480254
		Inclination     -27.3279
		AscendingNode   -20.9634
		ArgOfPericenter -94.382
		MeanAnomaly     38.0103
	}
}

DwarfMoon	"Eshan System 7.D9"
{
	ParentBody     "Eshan System 7-7.1"
	Class	       "Asteroid"

	Mass            3.65033e-010
	Radius          9.91703
	InertiaMoment   0.397789

	Obliquity       59.2146
	EqAscendNode    36.5355
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.593 0.430 0.366)

	Surface
	{
		SurfStyle       0.132386
		OceanStyle      0.371303
		Randomize      (0.319, 0.522, -0.717)
		colorDistMagn   0.594756
		colorDistFreq   0.0247209
		detailScale     270.801
		colorConversion true
		snowLevel       2
		tropicLatitude  0.943617
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.30438
		terraceProb     0.261174
		erosion         0
		montesMagn      0.392821
		montesFreq      2.88388
		montesSpiky     0.894791
		montesFraction  0.666846
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.242975
		hillsFraction   0.579078
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231173
		craterFreq      0.186617
		craterDensity   0.836495
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.483025
		volcanoTemp     1694.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.237, 0.172, 0.146, 0.000)
		colorShelf     (0.252, 0.183, 0.155, 0.000)
		colorBeach     (0.267, 0.193, 0.164, 0.000)
		colorDesert    (0.281, 0.204, 0.174, 0.000)
		colorLowland   (0.296, 0.215, 0.183, 0.000)
		colorUpland    (0.311, 0.226, 0.192, 0.000)
		colorRock      (0.326, 0.236, 0.201, 0.000)
		colorSnow      (0.341, 0.247, 0.210, 1.000)
		BumpHeight      8.92533
		BumpOffset      1.78507
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.017525
		Period          0.891449
		Eccentricity    0.0579606
		Inclination     59.2146
		AscendingNode   36.5355
		ArgOfPericenter -79.942
		MeanAnomaly     -111.01
	}
}

DwarfMoon	"Eshan System 7.D10"
{
	ParentBody     "Eshan System 7-7.1"
	Class	       "Asteroid"

	Mass            5.4533e-010
	Radius          10.8184
	InertiaMoment   0.399005

	Obliquity       10.4355
	EqAscendNode    60.0069
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.438 0.433 0.431)

	Surface
	{
		SurfStyle       0.973478
		OceanStyle      0.396041
		Randomize      (-0.201, 0.684, 0.172)
		colorDistMagn   0.24904
		colorDistFreq   0.0412095
		detailScale     295.414
		colorConversion true
		snowLevel       2
		tropicLatitude  0.309829
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.694075
		terraceProb     0.565365
		erosion         0
		montesMagn      0.507414
		montesFreq      3.38049
		montesSpiky     0.95092
		montesFraction  0.635019
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.288134
		hillsFraction   0.613062
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255554
		craterFreq      0.189037
		craterDensity   0.94752
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.464348
		volcanoTemp     1472.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.149, 0.152, 0.172, 0.050)
		colorShelf     (0.175, 0.178, 0.198, 0.040)
		colorBeach     (0.202, 0.203, 0.224, 0.030)
		colorDesert    (0.228, 0.229, 0.254, 0.020)
		colorLowland   (0.254, 0.255, 0.280, 0.030)
		colorUpland    (0.280, 0.281, 0.306, 0.050)
		colorRock      (0.307, 0.307, 0.340, 0.020)
		colorSnow      (0.307, 0.307, 0.340, 1.000)
		BumpHeight      9.73655
		BumpOffset      1.94731
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0181074
		Period          0.936255
		Eccentricity    0.0710914
		Inclination     10.4355
		AscendingNode   60.0069
		ArgOfPericenter 79.3256
		MeanAnomaly     -78.9767
	}
}

DwarfMoon	"Eshan System 7.D11"
{
	ParentBody     "Eshan System 7-7.1"
	Class	       "Asteroid"

	Mass            7.99474e-010
	Radius          14.4182
	InertiaMoment   0.399922

	Obliquity       14.1657
	EqAscendNode    -85.6497
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.790 0.787 0.785)

	Surface
	{
		SurfStyle       0.938548
		OceanStyle      0.769914
		Randomize      (-0.031, 0.549, -0.655)
		colorDistMagn   0.675124
		colorDistFreq   0.144227
		detailScale     393.713
		colorConversion true
		snowLevel       2
		tropicLatitude  0.353153
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.315302
		terraceProb     0.453707
		erosion         0
		montesMagn      0.667662
		montesFreq      3.48888
		montesSpiky     0.771042
		montesFraction  0.78417
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.485663
		hillsFraction   0.648095
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231023
		craterFreq      0.141165
		craterDensity   0.874231
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.47713
		volcanoTemp     1453.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.268, 0.276, 0.314, 0.050)
		colorShelf     (0.316, 0.323, 0.361, 0.040)
		colorBeach     (0.363, 0.370, 0.408, 0.030)
		colorDesert    (0.411, 0.417, 0.463, 0.020)
		colorLowland   (0.458, 0.465, 0.511, 0.030)
		colorUpland    (0.505, 0.512, 0.558, 0.050)
		colorRock      (0.553, 0.559, 0.621, 0.020)
		colorSnow      (0.553, 0.559, 0.621, 1.000)
		BumpHeight      12.9764
		BumpOffset      2.59527
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0183085
		Period          0.951893
		Eccentricity    0.0588799
		Inclination     14.1657
		AscendingNode   -85.6497
		ArgOfPericenter 48.013
		MeanAnomaly     -166.747
	}
}

DwarfMoon	"Eshan System 7.D12"
{
	ParentBody     "Eshan System 7-7.1"
	Class	       "Asteroid"

	Mass            1.15392e-009
	Radius          15.2576
	InertiaMoment   0.398006

	Obliquity       -59.1288
	EqAscendNode    168.992
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.674 0.669 0.668)

	Surface
	{
		SurfStyle       0.900722
		OceanStyle      0.66737
		Randomize      (-0.335, 0.082, 0.856)
		colorDistMagn   0.627675
		colorDistFreq   0.125007
		detailScale     416.633
		colorConversion true
		snowLevel       2
		tropicLatitude  0.164089
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.327106
		terraceProb     0.21451
		erosion         0
		montesMagn      0.551727
		montesFreq      3.23697
		montesSpiky     0.903183
		montesFraction  0.704405
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.515019
		hillsFraction   0.444282
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233095
		craterFreq      0.176965
		craterDensity   1.0554
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.525178
		volcanoTemp     1272.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.229, 0.234, 0.267, 0.050)
		colorShelf     (0.270, 0.274, 0.307, 0.040)
		colorBeach     (0.310, 0.315, 0.347, 0.030)
		colorDesert    (0.351, 0.355, 0.394, 0.020)
		colorLowland   (0.391, 0.395, 0.434, 0.030)
		colorUpland    (0.431, 0.435, 0.474, 0.050)
		colorRock      (0.472, 0.475, 0.527, 0.020)
		colorSnow      (0.472, 0.475, 0.527, 1.000)
		BumpHeight      13.7318
		BumpOffset      2.74636
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0186337
		Period          0.97737
		Eccentricity    0.109942
		Inclination     -59.1288
		AscendingNode   168.992
		ArgOfPericenter -3.93087
		MeanAnomaly     -152.334
	}
}

DwarfMoon	"Eshan System 7.D13"
{
	ParentBody     "Eshan System 7-7.1"
	Class	       "Asteroid"

	Mass            1.644e-009
	Radius          16.4698
	InertiaMoment   0.399144

	Obliquity       82.6883
	EqAscendNode    -23.7284
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.743 0.741 0.739)

	Surface
	{
		SurfStyle       0.287444
		OceanStyle      0.712355
		Randomize      (-0.809, -0.140, -0.432)
		colorDistMagn   0.113765
		colorDistFreq   0.103814
		detailScale     449.734
		colorConversion true
		snowLevel       2
		tropicLatitude  0.466657
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.432674
		terraceProb     0.517163
		erosion         0
		montesMagn      0.319839
		montesFreq      3.57784
		montesSpiky     0.983648
		montesFraction  0.555201
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.631476
		hillsFraction   0.699843
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254141
		craterFreq      0.210202
		craterDensity   1.0362
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.483081
		volcanoTemp     1448.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.297, 0.297, 0.296, 0.000)
		colorShelf     (0.316, 0.315, 0.314, 0.000)
		colorBeach     (0.334, 0.334, 0.332, 0.000)
		colorDesert    (0.353, 0.352, 0.351, 0.000)
		colorLowland   (0.372, 0.371, 0.369, 0.000)
		colorUpland    (0.390, 0.389, 0.388, 0.000)
		colorRock      (0.409, 0.408, 0.406, 0.000)
		colorSnow      (0.427, 0.426, 0.425, 1.000)
		BumpHeight      14.8228
		BumpOffset      2.96456
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0191103
		Period          1.01511
		Eccentricity    0.148005
		Inclination     82.6883
		AscendingNode   -23.7284
		ArgOfPericenter 6.77185
		MeanAnomaly     -167.389
	}
}

DwarfMoon	"Eshan System 7.D14"
{
	ParentBody     "Eshan System 7-7.1"
	Class	       "Asteroid"

	Mass            2.31696e-009
	Radius          17.6684
	InertiaMoment   0.395298

	RotationPeriod  45415.4
	Obliquity       89.4825
	EqAscendNode    -54.1589

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.477 0.471 0.465)

	Surface
	{
		SurfStyle       0.52462
		OceanStyle      0.22847
		Randomize      (-0.498, -0.750, -0.044)
		colorDistMagn   0.372204
		colorDistFreq   0.128935
		detailScale     482.465
		colorConversion true
		snowLevel       2
		tropicLatitude  0.810738
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.617851
		terraceProb     0.111422
		erosion         0
		montesMagn      0.518837
		montesFreq      2.89207
		montesSpiky     0.857426
		montesFraction  0.540779
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.683156
		hillsFraction   0.496673
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237963
		craterFreq      0.21701
		craterDensity   0.868356
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.511684
		volcanoTemp     1373.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.186, 0.160, 0.130, 0.000)
		colorShelf     (0.191, 0.165, 0.149, 0.000)
		colorBeach     (0.224, 0.193, 0.177, 0.000)
		colorDesert    (0.243, 0.207, 0.172, 0.000)
		colorLowland   (0.267, 0.221, 0.195, 0.000)
		colorUpland    (0.296, 0.268, 0.237, 0.000)
		colorRock      (0.320, 0.292, 0.256, 0.000)
		colorSnow      (0.348, 0.311, 0.269, 1.000)
		BumpHeight      15.9016
		BumpOffset      3.18031
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.019374
		Period          1.03619
		Eccentricity    0.497629
		Inclination     89.4825
		AscendingNode   -54.1589
		ArgOfPericenter -95.8234
		MeanAnomaly     -148.88
	}
}

DwarfMoon	"Eshan System 7.D15"
{
	ParentBody     "Eshan System 7-7.1"
	Class	       "Asteroid"

	Mass            3.23597e-009
	Radius          23.3912
	InertiaMoment   0.398202

	Obliquity       64.3204
	EqAscendNode    174.244
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.580 0.575 0.571)

	Surface
	{
		SurfStyle       0.428522
		OceanStyle      0.369366
		Randomize      (-0.340, 0.593, -0.714)
		colorDistMagn   0.785918
		colorDistFreq   0.0826435
		detailScale     638.735
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0904147
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.444011
		terraceProb     0.222333
		erosion         0
		montesMagn      0.429203
		montesFreq      2.29809
		montesSpiky     0.84277
		montesFraction  0.509472
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.15213
		hillsFraction   0.528049
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233864
		craterFreq      0.172988
		craterDensity   0.878788
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.438623
		volcanoTemp     1652.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.232, 0.230, 0.229, 0.000)
		colorShelf     (0.247, 0.245, 0.243, 0.000)
		colorBeach     (0.261, 0.259, 0.257, 0.000)
		colorDesert    (0.276, 0.273, 0.271, 0.000)
		colorLowland   (0.290, 0.288, 0.286, 0.000)
		colorUpland    (0.305, 0.302, 0.300, 0.000)
		colorRock      (0.319, 0.316, 0.314, 0.000)
		colorSnow      (0.334, 0.331, 0.329, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0196832
		Period          1.0611
		Eccentricity    0.205544
		Inclination     64.3204
		AscendingNode   174.244
		ArgOfPericenter -93.3552
		MeanAnomaly     -64.338
	}
}

Planet	"Eshan System 8"
{
	ParentBody     "Eshan System"
	Class	       "GasGiant"

	Mass            1987.49
	Radius          75396.6
	InertiaMoment   0.260332

	Oblateness      0.0152352

	RotationPeriod  9.02248
	Obliquity       -133.489
	EqAscendNode    41.2801

	AlbedoBond      0.46317
	AlbedoGeom      0.555804
	Brightness      2

	Surface
	{
		SurfStyle       0.838399
		Randomize      (0.297, -0.071, 0.467)
		detailScale     193924
		colorConversion true
		tropicLatitude  0.713693
		icecapLatitude  1
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     9.16626
		stripeFluct     0.329915
		stripeTwist     11.4466
		cycloneMagn     12.0493
		cycloneFreq     1.01029
		cycloneDensity  0.372625
		cycloneOctaves  5
		colorLayer0    (0.200, 0.260, 0.330, 1.100)
		colorLayer1    (0.250, 0.330, 0.450, 0.900)
		colorLayer2    (0.220, 0.380, 0.560, 0.600)
		colorLayer3    (0.260, 0.430, 0.530, 0.100)
		colorLayer4    (0.240, 0.430, 0.630, 0.000)
		colorLayer5    (0.240, 0.510, 0.780, 0.000)
		colorLayer6    (0.340, 0.580, 0.750, 0.000)
		colorLayer7    (1.000, 1.000, 1.000, 1.000)
		colorLowPlants (0.240, 0.430, 0.630, 0.000)
		colorUpPlants  (0.240, 0.510, 0.780, 0.000)
		BumpHeight      5.30317
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          14.7734
		Velocity        -353.888
		BumpHeight      9.46968
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.91939
		mainOctaves     12
		Coverage        0.131703
		stripeZones     9.16626
		stripeFluct     0.329915
		stripeTwist     11.4466
	}

	Clouds
	{
		Height          24.2422
		Velocity        409.004
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		ModulateColor  (1.000 1.000 1.000 0.597)
		mainFreq        0.91939
		mainOctaves     12
		Coverage        0.131703
		stripeZones     9.16626
		stripeFluct     0.329915
		stripeTwist     11.4466
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          100
		Density         6399.21
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.0344759
		Saturation      0.806003

		Composition
		{
			H2    	91.4068
			He    	8.48396
			CH4   	0.061813
			N2    	0.0362933
			O2    	0.00887806
			Ne    	0.00121823
			Ar    	0.00105569
		}
	}

	Aurora
	{
		Height      2009.6
		NorthLat    83.8034
		NorthLon    -10.2467
		NorthRadius 18735.1
		NorthWidth  8478.42
		NorthRings  5
		NorthBright 1
		NorthParticles 10000
		SouthLat    -82.1528
		SouthLon    173.585
		SouthRadius 19410.8
		SouthWidth  13709.8
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
		SemiMajorAxis   8.51396
		Period          25.2269
		Eccentricity    0.0232848
		Inclination     -1.18066
		AscendingNode   34.0213
		ArgOfPericenter 152.896
		MeanAnomaly     75.2509
	}
}

DwarfMoon	"Eshan System 8.D1"
{
	ParentBody     "Eshan System 8"
	Class	       "Asteroid"

	Mass            3.44295e-008
	Radius          44.6366
	InertiaMoment   0.398512

	Oblateness      0.249

	Obliquity       -0.00337393
	EqAscendNode    -6.71487
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.675 0.670 0.667)

	Surface
	{
		SurfStyle       0.161226
		OceanStyle      0.890908
		Randomize      (-0.472, -0.206, 0.503)
		colorDistMagn   0.396084
		colorDistFreq   1.16398
		detailScale     1218.88
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.585745
		terraceProb     0.446318
		erosion         0
		montesMagn      0.693783
		montesFreq      2.70759
		montesSpiky     0.985131
		montesFraction  0.270777
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.64004
		hillsFraction   0.679258
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246124
		craterFreq      0.252168
		craterDensity   0.873886
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.529795
		volcanoTemp     1405.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.270, 0.268, 0.267, 0.000)
		colorShelf     (0.287, 0.285, 0.283, 0.000)
		colorBeach     (0.304, 0.302, 0.300, 0.000)
		colorDesert    (0.321, 0.318, 0.317, 0.000)
		colorLowland   (0.338, 0.335, 0.333, 0.000)
		colorUpland    (0.355, 0.352, 0.350, 0.000)
		colorRock      (0.371, 0.369, 0.367, 0.000)
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
		SemiMajorAxis   0.00162295
		Period          0.000848176
		Eccentricity    2.07357e-005
		Inclination     -0.00337393
		AscendingNode   -6.71487
		ArgOfPericenter -143.11
		MeanAnomaly     -65.8754
	}
}

DwarfMoon	"Eshan System 8.D2"
{
	ParentBody     "Eshan System 8"
	Class	       "Asteroid"

	Mass            4.67306e-008
	Radius          46.673
	InertiaMoment   0.399511

	Oblateness      0.249

	Obliquity       0.0139384
	EqAscendNode    -65.2483
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.537 0.388 0.316)

	Surface
	{
		SurfStyle       0.567349
		OceanStyle      0.419211
		Randomize      (0.594, -0.568, 0.347)
		colorDistMagn   0.287155
		colorDistFreq   0.581674
		detailScale     1274.48
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.667129
		terraceProb     0.428675
		erosion         0
		montesMagn      0.570612
		montesFreq      1.81724
		montesSpiky     0.944866
		montesFraction  0.5644
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.32924
		hillsFraction   0.595537
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231942
		craterFreq      0.259724
		craterDensity   0.831218
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.500835
		volcanoTemp     1276.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.210, 0.132, 0.089, 0.000)
		colorShelf     (0.215, 0.136, 0.101, 0.000)
		colorBeach     (0.252, 0.159, 0.120, 0.000)
		colorDesert    (0.274, 0.171, 0.117, 0.000)
		colorLowland   (0.301, 0.182, 0.133, 0.000)
		colorUpland    (0.333, 0.221, 0.161, 0.000)
		colorRock      (0.360, 0.241, 0.174, 0.000)
		colorSnow      (0.392, 0.256, 0.184, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00180298
		Period          0.00099315
		Eccentricity    3.48732e-005
		Inclination     0.0139384
		AscendingNode   -65.2483
		ArgOfPericenter 147.222
		MeanAnomaly     -33.068
	}
}

DwarfMoon	"Eshan System 8.D3"
{
	ParentBody     "Eshan System 8"
	Class	       "Asteroid"

	Mass            6.34966e-008
	Radius          60.477
	InertiaMoment   0.397167

	Oblateness      0.249

	Obliquity       0.0092868
	EqAscendNode    0.520601
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.616 0.522 0.414)

	Surface
	{
		SurfStyle       0.0154723
		OceanStyle      0.297426
		Randomize      (-0.910, -0.693, 0.037)
		colorDistMagn   0.2601
		colorDistFreq   2.78072
		detailScale     1651.43
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.534857
		terraceProb     0.112839
		erosion         0
		montesMagn      0.474244
		montesFreq      2.70737
		montesSpiky     0.91464
		montesFraction  0.301523
		dunesFraction   0
		hillsMagn       0
		hillsFreq       12.9522
		hillsFraction   0.588464
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235066
		craterFreq      0.242409
		craterDensity   1.04916
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.572326
		volcanoTemp     1335.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.247, 0.209, 0.166, 0.000)
		colorShelf     (0.262, 0.222, 0.176, 0.000)
		colorBeach     (0.277, 0.235, 0.186, 0.000)
		colorDesert    (0.293, 0.248, 0.197, 0.000)
		colorLowland   (0.308, 0.261, 0.207, 0.000)
		colorUpland    (0.324, 0.274, 0.218, 0.000)
		colorRock      (0.339, 0.287, 0.228, 0.000)
		colorSnow      (0.354, 0.300, 0.238, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00193947
		Period          0.00110803
		Eccentricity    1.94998e-005
		Inclination     0.0092868
		AscendingNode   0.520601
		ArgOfPericenter -0.38812
		MeanAnomaly     117.686
	}
}

DwarfMoon	"Eshan System 8.D4"
{
	ParentBody     "Eshan System 8"
	Class	       "Asteroid"

	Mass            8.64499e-008
	Radius          63.5354
	InertiaMoment   0.398672

	Oblateness      0.249

	Obliquity       -0.00924018
	EqAscendNode    18.4526
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.473 0.433 0.362)

	Surface
	{
		SurfStyle       0.666299
		OceanStyle      0.240844
		Randomize      (0.773, 0.293, 0.547)
		colorDistMagn   0.893681
		colorDistFreq   1.01368
		detailScale     1734.94
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.628862
		terraceProb     0.361378
		erosion         0
		montesMagn      0.372815
		montesFreq      2.64254
		montesSpiky     0.833606
		montesFraction  0.492581
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.39141
		hillsFraction   0.605161
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229924
		craterFreq      0.194076
		craterDensity   0.900673
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.446579
		volcanoTemp     1714.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.185, 0.147, 0.101, 0.000)
		colorShelf     (0.189, 0.152, 0.116, 0.000)
		colorBeach     (0.223, 0.178, 0.138, 0.000)
		colorDesert    (0.241, 0.190, 0.134, 0.000)
		colorLowland   (0.265, 0.203, 0.152, 0.000)
		colorUpland    (0.294, 0.247, 0.185, 0.000)
		colorRock      (0.317, 0.268, 0.199, 0.000)
		colorSnow      (0.346, 0.286, 0.210, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0019942
		Period          0.00115526
		Eccentricity    7.56482e-006
		Inclination     -0.00924018
		AscendingNode   18.4526
		ArgOfPericenter 35.551
		MeanAnomaly     132.648
	}
}

Moon	"Eshan System 8.1"
{
	ParentBody     "Eshan System 8"
	Class	       "Desert"

	Mass            0.23633
	Radius          5214.51
	InertiaMoment   0.333591

	Oblateness      0.00811979

	Obliquity       -1.22309
	EqAscendNode    -16.901
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.430 0.424 0.422)

	Surface
	{
		SurfStyle       0.180797
		OceanStyle      0.830185
		Randomize      (-0.294, -0.080, -0.297)
		colorDistMagn   0.0715717
		colorDistFreq   641.106
		detailScale     13412
		colorConversion true
		seaLevel        0.0157228
		snowLevel       2
		tropicLatitude  0.0422177
		icecapLatitude  10
		icecapHeight    0.1485
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        0.774182
		venusFreq       0.654013
		venusMagn       0
		mareFreq        1.34275
		mareDensity     0.0252022
		terraceProb     0.51883
		erosion         0
		montesMagn      0.217371
		montesFreq      187.692
		montesSpiky     0.932599
		montesFraction  0.0859554
		dunesMagn       0.0371476
		dunesFreq       37.7089
		dunesFraction   0.231222
		hillsMagn       0.147018
		hillsFreq       587.435
		hillsFraction   0
		hills2Fraction  0
		riversMagn      53.1292
		riversFreq      3.45412
		riversSin       4.98752
		riversOctaves   0
		canyonsMagn     0.0163198
		canyonsFreq     131.921
		canyonFraction  0
		cracksMagn      0.125754
		cracksFreq      0.521078
		cracksOctaves   0
		craterMagn      0.679228
		craterFreq      14.3858
		craterDensity   0.190619
		craterOctaves   2.91187
		volcanoMagn     0.669868
		volcanoFreq     0.721834
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.37874
		volcanoRadius   0.440266
		volcanoTemp     1670.84
		lavaCoverTidal  0.64048
		lavaCoverSun    0
		lavaCoverYoung  0
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
		Hapke           0.736093
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
		Height          155.28
		Density         0.0263907
		Pressure        0.0259148
		Greenhouse      1.38526
		Bright          7.66108
		Opacity         1
		SkyLight        2.55369
		Hue             0.0482052
		Saturation      1

		Composition
		{
			CO2   	92.77
			H2O   	4.33541
			SO2   	2.01559
			NH3   	0.513223
			C2H4  	0.125775
			CH4   	0.094796
			C2H6  	0.0545964
			C2H2  	0.0440664
			H2S   	0.0385751
			N2    	0.00587856
			C3H8  	0.00116524
			CO    	0.000828871
			Ar    	5.77001e-005
		}
	}

	Aurora
	{
		Height      64.0282
		NorthLat    76.4388
		NorthLon    37.4114
		NorthRadius 669.629
		NorthWidth  211.098
		NorthRings  3
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -89.9525
		SouthLon    206.933
		SouthRadius 1375.48
		SouthWidth  354.171
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
		SemiMajorAxis   0.00349371
		Period          0.00267875
		Eccentricity    0.0259848
		Inclination     -1.22309
		AscendingNode   -16.901
		ArgOfPericenter 140.158
		MeanAnomaly     -135.712
	}
}

Moon	"Eshan System 8.2"
{
	ParentBody     "Eshan System 8"
	Class	       "Desert"

	Mass            0.275426
	Radius          5140.24
	InertiaMoment   0.331553

	Oblateness      0.00163714

	Obliquity       -0.184891
	EqAscendNode    53.0968
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.774 0.770 0.767)

	Surface
	{
		SurfStyle       0.789397
		OceanStyle      0.876547
		Randomize      (-0.215, -0.255, -0.481)
		colorDistMagn   0.0838795
		colorDistFreq   680.857
		detailScale     13221
		colorConversion true
		seaLevel        0.0350418
		snowLevel       2
		tropicLatitude  0.0057774
		icecapLatitude  0.944819
		icecapHeight    0.0367066
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.08206
		venusFreq       1.1655
		venusMagn       0
		mareFreq        1.75115
		mareDensity     0.0365325
		terraceProb     0.369511
		erosion         0
		montesMagn      0.226573
		montesFreq      274.989
		montesSpiky     0.914938
		montesFraction  0.496282
		dunesMagn       0.0457599
		dunesFreq       34.015
		dunesFraction   0.961353
		hillsMagn       0.121778
		hillsFreq       579.885
		hillsFraction   0
		hills2Fraction  0
		riversMagn      59.4887
		riversFreq      2.24531
		riversSin       5.4528
		riversOctaves   0
		canyonsMagn     0.0501688
		canyonsFreq     121.904
		canyonFraction  0
		cracksMagn      0.0864467
		cracksFreq      0.656351
		cracksOctaves   0
		craterMagn      0.641523
		craterFreq      13.6386
		craterDensity   0.219844
		craterOctaves   3.60364
		volcanoMagn     0.712778
		volcanoFreq     0.793915
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.806236
		volcanoRadius   0.42278
		volcanoTemp     1417.52
		lavaCoverTidal  0.463461
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
		Hapke           0.147794
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
		Height          60.088
		Density         0.0852206
		Pressure        0.0374359
		Greenhouse      0.718044
		Bright          9.68521
		Opacity         1
		SkyLight        3.2284
		Hue             0
		Saturation      1

		Composition
		{
			CO2   	86.1261
			SO2   	5.34467
			CH4   	4.57676
			C2H2  	2.0837
			H2S   	0.676388
			NH3   	0.547566
			C2H4  	0.47613
			C2H6  	0.0512378
			N2    	0.0483924
			H2O   	0.048251
			C3H8  	0.0130438
			CO    	0.00642602
			Ar    	0.000982279
			Ne    	0.000339124
			Kr    	1.76752e-005
		}
	}

	Aurora
	{
		Height      101.78
		NorthLat    70.496
		NorthLon    -84.433
		NorthRadius 1421.84
		NorthWidth  354.703
		NorthRings  3
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -90
		SouthLon    112.835
		SouthRadius 1416.64
		SouthWidth  287.194
		SouthRings  2
		SouthBright 0.3
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	Rings
	{
		InnerRadius     7010.61
		OuterRadius     16700.5
		RotationPeriod  6.81496
		RotationOffset  0
		FrontBright     0.50962
		BackBright      0.525746
		Density         0.655349
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00556722
		Period          0.00538833
		Eccentricity    0.0259247
		Inclination     -0.184891
		AscendingNode   53.0968
		ArgOfPericenter 108.33
		MeanAnomaly     -32.6489
	}
}

DwarfMoon	"Eshan System 8.D5"
{
	ParentBody     "Eshan System 8"
	Class	       "Asteroid"

	Mass            2.22931e-007
	Radius          92.9732
	InertiaMoment   0.398824

	Oblateness      0.00379732

	Obliquity       1.30191
	EqAscendNode    52.3722
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.480 0.474 0.470)

	Surface
	{
		SurfStyle       0.49916
		OceanStyle      0.948906
		Randomize      (-0.842, 0.354, 0.333)
		colorDistMagn   0.644004
		colorDistFreq   4.85708
		detailScale     2538.79
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0407696
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.506669
		terraceProb     0.128112
		erosion         0
		montesMagn      0.45965
		montesFreq      4.13708
		montesSpiky     0.95326
		montesFraction  0.818759
		dunesFraction   0
		hillsMagn       0
		hillsFreq       22.5627
		hillsFraction   0.698632
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222718
		craterFreq      0.291067
		craterDensity   0.798132
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.512858
		volcanoTemp     1391.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.192, 0.189, 0.188, 0.000)
		colorShelf     (0.204, 0.201, 0.200, 0.000)
		colorBeach     (0.216, 0.213, 0.211, 0.000)
		colorDesert    (0.228, 0.225, 0.223, 0.000)
		colorLowland   (0.240, 0.237, 0.235, 0.000)
		colorUpland    (0.252, 0.249, 0.247, 0.000)
		colorRock      (0.264, 0.260, 0.258, 0.000)
		colorSnow      (0.276, 0.272, 0.270, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00887133
		Period          0.0108395
		Eccentricity    0.00282406
		Inclination     1.30191
		AscendingNode   52.3722
		ArgOfPericenter 148.378
		MeanAnomaly     -159.221
	}
}

Moon	"Eshan System 8.3"
{
	ParentBody     "Eshan System 8"
	Class	       "IceWorld"

	Mass            0.378494
	Radius          5675.21
	InertiaMoment   0.329577

	Obliquity       -0.93201
	EqAscendNode    -166.978
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.662 0.599 0.581)

	Surface
	{
		SurfStyle       0.107468
		OceanStyle      0.0957564
		Randomize      (0.010, -0.303, 0.995)
		colorDistMagn   0.0725338
		colorDistFreq   635.306
		detailScale     14597
		colorConversion true
		drivenDarkening 0
		seaLevel        0.187197
		snowLevel       2
		tropicLatitude  0.00368644
		icecapLatitude  0.407678
		icecapHeight    0.212025
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.662
		venusFreq       0.790725
		venusMagn       0.201047
		mareFreq        1.70113
		mareDensity     0.0305063
		terraceProb     0.252104
		erosion         0
		montesMagn      0.153126
		montesFreq      196.705
		montesSpiky     0.878751
		montesFraction  0.945452
		dunesMagn       0.0302834
		dunesFreq       7445.76
		dunesFraction   0.501224
		hillsMagn       0.13253
		hillsFreq       714.457
		hillsFraction   0.316982
		hills2Fraction  0.134264
		riversMagn      50.1991
		riversFreq      3.46867
		riversSin       5.47771
		riversOctaves   0
		canyonsMagn     0.63408
		canyonsFreq     1.84279
		canyonFraction  0
		cracksMagn      0.0387599
		cracksFreq      2.94289
		cracksOctaves   4
		craterMagn      0.696766
		craterFreq      19.4083
		craterDensity   0.790169
		craterOctaves   13
		craterRayedFactor 0.121386
		volcanoMagn     0.604723
		volcanoFreq     0.67516
		volcanoDensity  0.193849
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.192486
		volcanoRadius   0.534275
		volcanoTemp     1223.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.662, 0.599, 0.581, 0.500)
		colorShelf     (0.629, 0.569, 0.552, 0.500)
		colorBeach     (0.463, 0.419, 0.407, 0.750)
		colorDesert    (0.563, 0.509, 0.494, 1.000)
		colorLowland   (0.582, 0.527, 0.511, 1.000)
		colorUpland    (0.616, 0.557, 0.540, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.582, 0.527, 0.511, 1.000)
		colorUpPlants  (0.616, 0.557, 0.540, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.977406
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
		Height          130.346
		Density         0.0022594
		Pressure        0.000789667
		Greenhouse      0.580091
		Bright          4.68596
		Opacity         0
		SkyLight        1.56199
		Hue             -0.0285406
		Saturation      1

		Composition
		{
			CH4   	80.7473
			N2    	10.0544
			Ar    	7.84747
			CO    	1.18419
			Ne    	0.163886
			Kr    	0.00277909
		}
	}

	Aurora
	{
		Height      95.1974
		NorthLat    60.578
		NorthLon    104.335
		NorthRadius 1784.44
		NorthWidth  468.097
		NorthRings  3
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -53.2704
		SouthLon    268.536
		SouthRadius 1817.88
		SouthWidth  534.319
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
		SemiMajorAxis   0.0141364
		Period          0.021802
		Eccentricity    0.00646583
		Inclination     -0.93201
		AscendingNode   -166.978
		ArgOfPericenter 167.044
		MeanAnomaly     -95.5667
	}
}

Moon	"Eshan System 8.4"
{
	ParentBody     "Eshan System 8"
	Class	       "IceWorld"

	Mass            0.447215
	Radius          6363.61
	InertiaMoment   0.328547

	Obliquity       0.857023
	EqAscendNode    115.927
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.768 0.703 0.645)

	Surface
	{
		SurfStyle       0.678406
		OceanStyle      0.63686
		Randomize      (-0.276, -0.803, -0.952)
		colorDistMagn   0.0644094
		colorDistFreq   754.314
		detailScale     16367.6
		colorConversion true
		drivenDarkening 0
		seaLevel        0.213942
		snowLevel       2
		tropicLatitude  0.0158668
		icecapLatitude  0.897038
		icecapHeight    0.223431
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.03802
		venusFreq       0.81848
		venusMagn       0
		mareFreq        1.74185
		mareDensity     0.026561
		terraceProb     0.148938
		erosion         0
		montesMagn      0.174333
		montesFreq      285.808
		montesSpiky     0.875943
		montesFraction  0.18016
		dunesMagn       0.0340743
		dunesFreq       8334.46
		dunesFraction   0.554179
		hillsMagn       0.109314
		hillsFreq       768.364
		hillsFraction   0.974372
		hills2Fraction  0.117622
		riversMagn      58.4743
		riversFreq      1.48496
		riversSin       5.75216
		riversOctaves   0
		canyonsMagn     0.611983
		canyonsFreq     2.19714
		canyonFraction  0
		cracksMagn      0.0488409
		cracksFreq      2.46505
		cracksOctaves   6
		craterMagn      0.620266
		craterFreq      18.1254
		craterDensity   0.92074
		craterOctaves   13
		craterRayedFactor 0.0769914
		volcanoMagn     0.568878
		volcanoFreq     0.714587
		volcanoDensity  0.20638
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.286738
		volcanoRadius   0.590472
		volcanoTemp     1776.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.491, 0.450, 0.432, 0.250)
		colorShelf     (0.537, 0.513, 0.490, 0.250)
		colorBeach     (0.437, 0.380, 0.374, 0.200)
		colorDesert    (0.407, 0.345, 0.329, 0.200)
		colorLowland   (0.299, 0.267, 0.271, 0.200)
		colorUpland    (0.568, 0.520, 0.490, 0.250)
		colorRock      (0.640, 0.630, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.299, 0.267, 0.271, 0.200)
		colorUpPlants  (0.568, 0.520, 0.490, 0.250)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.994077
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
		Height          140.003
		Density         0.000592293
		Pressure        0.000224429
		Greenhouse      0.350456
		Bright          3.58515
		Opacity         0
		SkyLight        1.19505
		Hue             -0.0207892
		Saturation      1

		Composition
		{
			CH4   	86.2232
			N2    	12.1945
			CO    	1.35262
			Ar    	0.196828
			Ne    	0.0303146
			Kr    	0.00252898
		}
	}

	Aurora
	{
		Height      171.98
		NorthLat    55.8198
		NorthLon    -28.49
		NorthRadius 1636.34
		NorthWidth  571.604
		NorthRings  2
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -54.9223
		SouthLon    163.035
		SouthRadius 2409.06
		SouthWidth  624.417
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
		SemiMajorAxis   0.0225263
		Period          0.0438545
		Eccentricity    0.0195842
		Inclination     0.857023
		AscendingNode   115.927
		ArgOfPericenter 117.338
		MeanAnomaly     -125.362
	}
}

DwarfMoon	"Eshan System 8.D6"
{
	ParentBody     "Eshan System 8"
	Class	       "Asteroid"

	Mass            6.08271e-007
	Radius          112.248
	InertiaMoment   0.398969

	Obliquity       0.382645
	EqAscendNode    50.7753
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.736 0.733 0.730)

	Surface
	{
		SurfStyle       0.416683
		OceanStyle      0.477267
		Randomize      (-0.380, 0.894, -0.359)
		colorDistMagn   0.715162
		colorDistFreq   5.01957
		detailScale     3065.11
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0120644
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.295152
		terraceProb     0.204625
		erosion         0
		montesMagn      0.438773
		montesFreq      2.23282
		montesSpiky     0.932654
		montesFraction  0.938958
		dunesFraction   0
		hillsMagn       0
		hillsFreq       27.0636
		hillsFraction   0.881881
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25349
		craterFreq      0.55024
		craterDensity   0.759336
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.484772
		volcanoTemp     1592.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.294, 0.293, 0.292, 0.000)
		colorShelf     (0.313, 0.312, 0.310, 0.000)
		colorBeach     (0.331, 0.330, 0.329, 0.000)
		colorDesert    (0.350, 0.348, 0.347, 0.000)
		colorLowland   (0.368, 0.367, 0.365, 0.000)
		colorUpland    (0.386, 0.385, 0.383, 0.000)
		colorRock      (0.405, 0.403, 0.402, 0.000)
		colorSnow      (0.423, 0.422, 0.420, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0358956
		Period          0.0882245
		Eccentricity    0.0281975
		Inclination     0.382645
		AscendingNode   50.7753
		ArgOfPericenter 142.848
		MeanAnomaly     71.9745
	}
}

DwarfMoon	"Eshan System 8.D7"
{
	ParentBody     "Eshan System 8"
	Class	       "Asteroid"

	Mass            8.66612e-007
	Radius          148.23
	InertiaMoment   0.39989

	RotationPeriod  724.88
	Obliquity       -62.4526
	EqAscendNode    -166.27

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.676 0.674 0.672)

	Surface
	{
		SurfStyle       0.973657
		OceanStyle      0.0541325
		Randomize      (0.587, 0.648, -0.105)
		colorDistMagn   0.684383
		colorDistFreq   12.804
		detailScale     4047.66
		colorConversion true
		snowLevel       2
		tropicLatitude  0.208179
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.558747
		terraceProb     0.590261
		erosion         0
		montesMagn      0.478795
		montesFreq      3.00577
		montesSpiky     0.947306
		montesFraction  0.443491
		dunesFraction   0
		hillsMagn       0
		hillsFreq       42.5773
		hillsFraction   0.494293
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237923
		craterFreq      0.903578
		craterDensity   0.937946
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.528885
		volcanoTemp     1367.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.230, 0.236, 0.269, 0.050)
		colorShelf     (0.270, 0.277, 0.309, 0.040)
		colorBeach     (0.311, 0.317, 0.350, 0.030)
		colorDesert    (0.352, 0.357, 0.397, 0.020)
		colorLowland   (0.392, 0.398, 0.437, 0.030)
		colorUpland    (0.433, 0.438, 0.477, 0.050)
		colorRock      (0.473, 0.479, 0.531, 0.020)
		colorSnow      (0.473, 0.479, 0.531, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.211448
		Period          1.26135
		Eccentricity    0.110224
		Inclination     -60.4359
		AscendingNode   -166.506
		ArgOfPericenter -114.275
		MeanAnomaly     -76.5919
	}
}

DwarfMoon	"Eshan System 8.D8"
{
	ParentBody     "Eshan System 8"
	Class	       "Asteroid"

	Mass            1.25082e-006
	Radius          156.787
	InertiaMoment   0.397954

	RotationPeriod  582.013
	Obliquity       38.0871
	EqAscendNode    54.3334

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.503 0.494 0.489)

	Surface
	{
		SurfStyle       0.561907
		OceanStyle      0.855591
		Randomize      (0.650, -0.914, 0.580)
		colorDistMagn   0.475512
		colorDistFreq   15.2238
		detailScale     4281.32
		colorConversion true
		snowLevel       2
		tropicLatitude  0.918247
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.50246
		terraceProb     0.203154
		erosion         0
		montesMagn      0.427478
		montesFreq      3.4406
		montesSpiky     0.984479
		montesFraction  0.776403
		dunesFraction   0
		hillsMagn       0
		hillsFreq       71.3576
		hillsFraction   0.604927
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.197793
		craterFreq      1.05156
		craterDensity   0.900852
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.483706
		volcanoTemp     1531.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.196, 0.168, 0.137, 0.000)
		colorShelf     (0.201, 0.173, 0.157, 0.000)
		colorBeach     (0.237, 0.202, 0.186, 0.000)
		colorDesert    (0.257, 0.217, 0.181, 0.000)
		colorLowland   (0.282, 0.232, 0.205, 0.000)
		colorUpland    (0.312, 0.281, 0.249, 0.000)
		colorRock      (0.337, 0.306, 0.269, 0.000)
		colorSnow      (0.367, 0.326, 0.284, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.211745
		Period          1.264
		Eccentricity    0.145248
		Inclination     38.2081
		AscendingNode   54.336
		ArgOfPericenter 74.6335
		MeanAnomaly     -177.248
	}
}

DwarfMoon	"Eshan System 8.D9"
{
	ParentBody     "Eshan System 8"
	Class	       "Asteroid"

	Mass            1.83375e-006
	Radius          170.855
	InertiaMoment   0.39911

	RotationPeriod  492.293
	Obliquity       -30.7284
	EqAscendNode    -31.4085

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.522 0.381 0.312)

	Surface
	{
		SurfStyle       0.439207
		OceanStyle      0.07766
		Randomize      (0.450, -0.773, -0.184)
		colorDistMagn   0.313669
		colorDistFreq   14.882
		detailScale     4665.48
		colorConversion true
		snowLevel       2
		tropicLatitude  0.69184
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.365944
		terraceProb     0.564515
		erosion         0
		montesMagn      0.508894
		montesFreq      2.77378
		montesSpiky     0.771169
		montesFraction  0.436138
		dunesFraction   0
		hillsMagn       0
		hillsFreq       80.3319
		hillsFraction   0.657983
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247788
		craterFreq      0.883106
		craterDensity   0.899361
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.637247
		volcanoTemp     1520.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.209, 0.152, 0.125, 0.000)
		colorShelf     (0.222, 0.162, 0.133, 0.000)
		colorBeach     (0.235, 0.171, 0.141, 0.000)
		colorDesert    (0.248, 0.181, 0.148, 0.000)
		colorLowland   (0.261, 0.190, 0.156, 0.000)
		colorUpland    (0.274, 0.200, 0.164, 0.000)
		colorRock      (0.287, 0.209, 0.172, 0.000)
		colorSnow      (0.300, 0.219, 0.180, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.212287
		Period          1.26885
		Eccentricity    0.189069
		Inclination     -14.5439
		AscendingNode   -30.9867
		ArgOfPericenter -130.377
		MeanAnomaly     168.294
	}
}

DwarfMoon	"Eshan System 8.D10"
{
	ParentBody     "Eshan System 8"
	Class	       "Asteroid"

	Mass            2.73947e-006
	Radius          186.906
	InertiaMoment   0.394515

	RotationPeriod  412.675
	Obliquity       47.7971
	EqAscendNode    81.5088

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.523 0.514 0.509)

	Surface
	{
		SurfStyle       0.988979
		OceanStyle      0.734144
		Randomize      (-0.547, -0.440, 0.044)
		colorDistMagn   0.601085
		colorDistFreq   3.93593
		detailScale     5103.79
		colorConversion true
		snowLevel       2
		tropicLatitude  0.895703
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.659357
		terraceProb     0.343974
		erosion         0
		montesMagn      0.635091
		montesFreq      2.95373
		montesSpiky     0.868835
		montesFraction  0.628928
		dunesFraction   0
		hillsMagn       0
		hillsFreq       53.4503
		hillsFraction   0.531143
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.269926
		craterFreq      1.34284
		craterDensity   0.920297
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.527268
		volcanoTemp     1632.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.178, 0.180, 0.204, 0.050)
		colorShelf     (0.209, 0.211, 0.234, 0.040)
		colorBeach     (0.240, 0.241, 0.265, 0.030)
		colorDesert    (0.272, 0.272, 0.300, 0.020)
		colorLowland   (0.303, 0.303, 0.331, 0.030)
		colorUpland    (0.334, 0.334, 0.361, 0.050)
		colorRock      (0.366, 0.365, 0.402, 0.020)
		colorSnow      (0.366, 0.365, 0.402, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.212952
		Period          1.27482
		Eccentricity    0.439178
		Inclination     39.5375
		AscendingNode   81.0439
		ArgOfPericenter -142.682
		MeanAnomaly     108.54
	}
}

Moon	"Eshan System 8.5"
{
	ParentBody     "Eshan System 8"
	Class	       "IceWorld"

	Mass            4.18765e-006
	Radius          255.185
	InertiaMoment   0.398154

	RotationPeriod  475.088
	Obliquity       42.536
	EqAscendNode    -48.5314

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.785 0.768 0.734)

	Surface
	{
		SurfStyle       0.238764
		OceanStyle      0.455791
		Randomize      (0.005, -0.154, 0.947)
		colorDistMagn   0.0921824
		colorDistFreq   30.4198
		detailScale     656.35
		colorConversion true
		drivenDarkening 0.0330619
		seaLevel        0.191327
		snowLevel       2
		tropicLatitude  0.969478
		icecapLatitude  1
		icecapHeight    0.191327
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.73264
		venusFreq       0.643401
		venusMagn       0
		mareFreq        0
		mareDensity     7.38685e-007
		terraceProb     0.554757
		erosion         0
		montesMagn      0.0503595
		montesFreq      8.78061
		montesSpiky     0.94469
		montesFraction  0.0305945
		dunesMagn       0.052643
		dunesFreq       332.93
		dunesFraction   0.476833
		hillsMagn       0.132942
		hillsFreq       30.461
		hillsFraction   0.387887
		hills2Fraction  0.238129
		riversMagn      55.3171
		riversFreq      4.15433
		riversSin       4.4282
		riversOctaves   0
		canyonsMagn     0.462502
		canyonsFreq     0.0876835
		canyonFraction  0
		cracksMagn      0.0362763
		cracksFreq      0.0613301
		cracksOctaves   0
		craterMagn      0.804341
		craterFreq      0.841131
		craterDensity   0.757764
		craterOctaves   8
		craterRayedFactor 0.186306
		volcanoMagn     0.173045
		volcanoFreq     0.668051
		volcanoDensity  0.207843
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.164185
		volcanoRadius   0.135082
		volcanoTemp     1493.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.785, 0.768, 0.734, 0.500)
		colorShelf     (0.745, 0.730, 0.697, 0.500)
		colorBeach     (0.549, 0.538, 0.514, 0.750)
		colorDesert    (0.667, 0.653, 0.624, 1.000)
		colorLowland   (0.690, 0.676, 0.646, 1.000)
		colorUpland    (0.730, 0.714, 0.682, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.690, 0.676, 0.646, 1.000)
		colorUpPlants  (0.730, 0.714, 0.682, 1.000)
		BumpHeight      12.7592
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
		SemiMajorAxis   0.213416
		Period          1.27899
		Eccentricity    0.225299
		Inclination     42.1778
		AscendingNode   -48.4835
		ArgOfPericenter -178.693
		MeanAnomaly     29.166
	}
}

DwarfMoon	"Eshan System 8.D11"
{
	ParentBody     "Eshan System 8"
	Class	       "Asteroid"

	Mass            1.07661e-011
	Radius          3.2351
	InertiaMoment   0.399246

	Obliquity       1.67267
	EqAscendNode    81.3562
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.711 0.560 0.507)

	Surface
	{
		SurfStyle       0.399269
		OceanStyle      0.595291
		Randomize      (0.812, -0.443, -0.879)
		colorDistMagn   0.20719
		colorDistFreq   0.00229596
		detailScale     88.3399
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0442628
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.52677
		terraceProb     0.179028
		erosion         0
		montesMagn      0.491376
		montesFreq      3.02355
		montesSpiky     0.954572
		montesFraction  0.884231
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0229322
		hillsFraction   0.595285
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261323
		craterFreq      0.191976
		craterDensity   0.812498
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.45751
		volcanoTemp     1517.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.284, 0.224, 0.203, 0.000)
		colorShelf     (0.302, 0.238, 0.216, 0.000)
		colorBeach     (0.320, 0.252, 0.228, 0.000)
		colorDesert    (0.338, 0.266, 0.241, 0.000)
		colorLowland   (0.356, 0.280, 0.254, 0.000)
		colorUpland    (0.373, 0.294, 0.266, 0.000)
		colorRock      (0.391, 0.308, 0.279, 0.000)
		colorSnow      (0.409, 0.322, 0.292, 1.000)
		BumpHeight      2.91159
		BumpOffset      0.582318
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.213691
		Period          1.28146
		Eccentricity    0.240834
		Inclination     1.67267
		AscendingNode   81.3562
		ArgOfPericenter 45.0352
		MeanAnomaly     102.47
	}
}

DwarfMoon	"Eshan System 8.D12"
{
	ParentBody     "Eshan System 8"
	Class	       "Asteroid"

	Mass            2.23942e-011
	Radius          3.95666
	InertiaMoment   0.396177

	Obliquity       -26.955
	EqAscendNode    -168.429
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.736 0.734 0.731)

	Surface
	{
		SurfStyle       0.846967
		OceanStyle      0.305157
		Randomize      (-0.537, -0.134, -0.413)
		colorDistMagn   0.307066
		colorDistFreq   0.0126531
		detailScale     108.043
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0912927
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.480606
		terraceProb     0.316993
		erosion         0
		montesMagn      0.410028
		montesFreq      2.44237
		montesSpiky     0.936639
		montesFraction  0.928338
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0412106
		hillsFraction   0.645871
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218141
		craterFreq      0.165648
		craterDensity   0.876562
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.484237
		volcanoTemp     1670.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.287, 0.249, 0.205, 0.000)
		colorShelf     (0.295, 0.257, 0.234, 0.000)
		colorBeach     (0.346, 0.301, 0.278, 0.000)
		colorDesert    (0.376, 0.323, 0.271, 0.000)
		colorLowland   (0.412, 0.345, 0.307, 0.000)
		colorUpland    (0.457, 0.418, 0.373, 0.000)
		colorRock      (0.493, 0.455, 0.402, 0.000)
		colorSnow      (0.538, 0.484, 0.424, 1.000)
		BumpHeight      3.561
		BumpOffset      0.7122
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.214207
		Period          1.28611
		Eccentricity    0.165735
		Inclination     -26.955
		AscendingNode   -168.429
		ArgOfPericenter 72.931
		MeanAnomaly     -2.70997
	}
}

DwarfMoon	"Eshan System 8.D13"
{
	ParentBody     "Eshan System 8"
	Class	       "Asteroid"

	Mass            4.2079e-011
	Radius          4.68046
	InertiaMoment   0.398338

	Obliquity       -77.4217
	EqAscendNode    27.6986
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.476 0.469 0.466)

	Surface
	{
		SurfStyle       0.473946
		OceanStyle      0.535488
		Randomize      (0.938, 0.707, 0.800)
		colorDistMagn   0.738793
		colorDistFreq   0.00474689
		detailScale     127.808
		colorConversion true
		snowLevel       2
		tropicLatitude  0.605311
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.455394
		terraceProb     0.423042
		erosion         0
		montesMagn      0.559938
		montesFreq      2.42583
		montesSpiky     0.964582
		montesFraction  0.849784
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0452093
		hillsFraction   0.712988
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236038
		craterFreq      0.21201
		craterDensity   0.769334
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53392
		volcanoTemp     1625.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.190, 0.188, 0.186, 0.000)
		colorShelf     (0.202, 0.200, 0.198, 0.000)
		colorBeach     (0.214, 0.211, 0.210, 0.000)
		colorDesert    (0.226, 0.223, 0.221, 0.000)
		colorLowland   (0.238, 0.235, 0.233, 0.000)
		colorUpland    (0.250, 0.246, 0.244, 0.000)
		colorRock      (0.262, 0.258, 0.256, 0.000)
		colorSnow      (0.274, 0.270, 0.268, 1.000)
		BumpHeight      4.21242
		BumpOffset      0.842484
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.214677
		Period          1.29035
		Eccentricity    0.0832926
		Inclination     -77.4217
		AscendingNode   27.6986
		ArgOfPericenter 91.4527
		MeanAnomaly     -25.2567
	}
}

DwarfMoon	"Eshan System 8.D14"
{
	ParentBody     "Eshan System 8"
	Class	       "Asteroid"

	Mass            7.36591e-011
	Radius          6.8201
	InertiaMoment   0.399378

	Obliquity       10.7393
	EqAscendNode    -80.341
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.520 0.516 0.510)

	Surface
	{
		SurfStyle       0.702352
		OceanStyle      0.970161
		Randomize      (0.495, -0.358, -0.527)
		colorDistMagn   0.813038
		colorDistFreq   0.0408732
		detailScale     186.234
		colorConversion true
		snowLevel       2
		tropicLatitude  0.281875
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.423614
		terraceProb     0.49745
		erosion         0
		montesMagn      0.360695
		montesFreq      3.08938
		montesSpiky     0.909295
		montesFraction  0.802129
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0880641
		hillsFraction   0.549478
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222884
		craterFreq      0.205385
		craterDensity   0.998042
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.424743
		volcanoTemp     1578.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.203, 0.175, 0.143, 0.000)
		colorShelf     (0.208, 0.181, 0.163, 0.000)
		colorBeach     (0.244, 0.211, 0.194, 0.000)
		colorDesert    (0.265, 0.227, 0.189, 0.000)
		colorLowland   (0.291, 0.242, 0.214, 0.000)
		colorUpland    (0.322, 0.294, 0.260, 0.000)
		colorRock      (0.348, 0.320, 0.281, 0.000)
		colorSnow      (0.380, 0.340, 0.296, 1.000)
		BumpHeight      6.13809
		BumpOffset      1.22762
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.215028
		Period          1.29351
		Eccentricity    0.0890312
		Inclination     10.7393
		AscendingNode   -80.341
		ArgOfPericenter -47.3314
		MeanAnomaly     33.0798
	}
}

DwarfMoon	"Eshan System 8.D15"
{
	ParentBody     "Eshan System 8"
	Class	       "Asteroid"

	Mass            1.22387e-010
	Radius          7.32723
	InertiaMoment   0.396765

	RotationPeriod  68265.5
	Obliquity       64.6943
	EqAscendNode    75.0691

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.579 0.513 0.481)

	Surface
	{
		SurfStyle       0.433861
		OceanStyle      0.333685
		Randomize      (-0.105, 0.504, -0.038)
		colorDistMagn   0.413134
		colorDistFreq   0.0456734
		detailScale     200.082
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999612
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.457297
		terraceProb     0.226658
		erosion         0
		montesMagn      0.537394
		montesFreq      3.49398
		montesSpiky     0.945091
		montesFraction  0.607047
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.117132
		hillsFraction   0.778246
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237391
		craterFreq      0.247069
		craterDensity   0.783424
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.571987
		volcanoTemp     1577.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.232, 0.205, 0.192, 0.000)
		colorShelf     (0.246, 0.218, 0.204, 0.000)
		colorBeach     (0.261, 0.231, 0.216, 0.000)
		colorDesert    (0.275, 0.244, 0.228, 0.000)
		colorLowland   (0.290, 0.256, 0.241, 0.000)
		colorUpland    (0.304, 0.269, 0.253, 0.000)
		colorRock      (0.319, 0.282, 0.265, 0.000)
		colorSnow      (0.333, 0.295, 0.277, 1.000)
		BumpHeight      6.5945
		BumpOffset      1.3189
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.21552
		Period          1.29795
		Eccentricity    0.471508
		Inclination     64.6943
		AscendingNode   75.0691
		ArgOfPericenter 48.5422
		MeanAnomaly     -107.63
	}
}

DwarfMoon	"Eshan System 8.D16"
{
	ParentBody     "Eshan System 8"
	Class	       "Asteroid"

	Mass            1.95394e-010
	Radius          8.19154
	InertiaMoment   0.398508

	Obliquity       -79.1115
	EqAscendNode    75.3346
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.816 0.762 0.725)

	Surface
	{
		SurfStyle       0.376862
		OceanStyle      0.239046
		Randomize      (-0.182, -0.693, -0.196)
		colorDistMagn   0.730202
		colorDistFreq   0.0317779
		detailScale     223.684
		colorConversion true
		snowLevel       2
		tropicLatitude  0.978032
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.502514
		terraceProb     0.243943
		erosion         0
		montesMagn      0.522446
		montesFreq      3.67907
		montesSpiky     0.939894
		montesFraction  0.445339
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.144396
		hillsFraction   0.583117
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213905
		craterFreq      0.258522
		craterDensity   0.900072
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.404782
		volcanoTemp     1464.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.327, 0.305, 0.290, 0.000)
		colorShelf     (0.347, 0.324, 0.308, 0.000)
		colorBeach     (0.367, 0.343, 0.326, 0.000)
		colorDesert    (0.388, 0.362, 0.345, 0.000)
		colorLowland   (0.408, 0.381, 0.363, 0.000)
		colorUpland    (0.429, 0.400, 0.381, 0.000)
		colorRock      (0.449, 0.419, 0.399, 0.000)
		colorSnow      (0.469, 0.438, 0.417, 1.000)
		BumpHeight      7.37239
		BumpOffset      1.47448
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.215899
		Period          1.30138
		Eccentricity    0.22692
		Inclination     -79.1115
		AscendingNode   75.3346
		ArgOfPericenter -167.97
		MeanAnomaly     132.585
	}
}

DwarfMoon	"Eshan System 8.D17"
{
	ParentBody     "Eshan System 8"
	Class	       "Asteroid"

	Mass            3.02308e-010
	Radius          9.09261
	InertiaMoment   0.399508

	Obliquity       -85.6041
	EqAscendNode    130.745
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.587 0.450 0.320)

	Surface
	{
		SurfStyle       0.896322
		OceanStyle      0.703927
		Randomize      (0.310, -0.326, 0.525)
		colorDistMagn   0.774912
		colorDistFreq   0.019561
		detailScale     248.289
		colorConversion true
		snowLevel       2
		tropicLatitude  0.755859
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.443464
		terraceProb     0.180803
		erosion         0
		montesMagn      0.372187
		montesFreq      2.08748
		montesSpiky     0.966987
		montesFraction  0.290691
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.136539
		hillsFraction   0.838701
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.297446
		craterFreq      0.263444
		craterDensity   0.915982
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.43778
		volcanoTemp     1388.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.200, 0.157, 0.128, 0.050)
		colorShelf     (0.235, 0.184, 0.147, 0.040)
		colorBeach     (0.270, 0.211, 0.166, 0.030)
		colorDesert    (0.305, 0.238, 0.189, 0.020)
		colorLowland   (0.341, 0.265, 0.208, 0.030)
		colorUpland    (0.376, 0.292, 0.227, 0.050)
		colorRock      (0.411, 0.319, 0.253, 0.020)
		colorSnow      (0.411, 0.319, 0.253, 1.000)
		BumpHeight      8.18335
		BumpOffset      1.63667
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.216281
		Period          1.30483
		Eccentricity    0.137071
		Inclination     -85.6041
		AscendingNode   130.745
		ArgOfPericenter -59.3671
		MeanAnomaly     -109.81
	}
}

DwarfMoon	"Eshan System 8.D18"
{
	ParentBody     "Eshan System 8"
	Class	       "Asteroid"

	Mass            4.5607e-010
	Radius          13.3641
	InertiaMoment   0.39716

	Obliquity       53.2283
	EqAscendNode    -3.23872
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.719 0.717 0.714)

	Surface
	{
		SurfStyle       0.748448
		OceanStyle      0.425945
		Randomize      (0.231, -0.640, -0.782)
		colorDistMagn   0.80699
		colorDistFreq   0.0831997
		detailScale     364.93
		colorConversion true
		snowLevel       2
		tropicLatitude  0.959337
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.554624
		terraceProb     0.250071
		erosion         0
		montesMagn      0.564422
		montesFreq      3.09057
		montesSpiky     0.8676
		montesFraction  0.782976
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.542877
		hillsFraction   0.84146
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226039
		craterFreq      0.241811
		craterDensity   0.954459
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.485455
		volcanoTemp     1618.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.281, 0.244, 0.200, 0.000)
		colorShelf     (0.288, 0.251, 0.228, 0.000)
		colorBeach     (0.338, 0.294, 0.271, 0.000)
		colorDesert    (0.367, 0.315, 0.264, 0.000)
		colorLowland   (0.403, 0.337, 0.300, 0.000)
		colorUpland    (0.446, 0.409, 0.364, 0.000)
		colorRock      (0.482, 0.444, 0.393, 0.000)
		colorSnow      (0.525, 0.473, 0.414, 1.000)
		BumpHeight      12.0277
		BumpOffset      2.40555
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.216747
		Period          1.30905
		Eccentricity    0.131186
		Inclination     53.2283
		AscendingNode   -3.23872
		ArgOfPericenter -144.698
		MeanAnomaly     146.159
	}
}

DwarfMoon	"Eshan System 8.D19"
{
	ParentBody     "Eshan System 8"
	Class	       "Asteroid"

	Mass            6.74028e-010
	Radius          13.0419
	InertiaMoment   0.398668

	Obliquity       -26.2962
	EqAscendNode    -44.6002
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.552 0.548 0.542)

	Surface
	{
		SurfStyle       0.128133
		OceanStyle      0.566823
		Randomize      (-0.934, -0.253, -0.814)
		colorDistMagn   0.281705
		colorDistFreq   0.0926185
		detailScale     356.131
		colorConversion true
		snowLevel       2
		tropicLatitude  0.747734
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.455631
		terraceProb     0.288865
		erosion         0
		montesMagn      0.48711
		montesFreq      4.42128
		montesSpiky     0.795059
		montesFraction  0.603811
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.323678
		hillsFraction   0.644868
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25476
		craterFreq      0.173523
		craterDensity   1.02618
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.524752
		volcanoTemp     1510.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.221, 0.219, 0.217, 0.000)
		colorShelf     (0.234, 0.233, 0.230, 0.000)
		colorBeach     (0.248, 0.247, 0.244, 0.000)
		colorDesert    (0.262, 0.260, 0.257, 0.000)
		colorLowland   (0.276, 0.274, 0.271, 0.000)
		colorUpland    (0.290, 0.288, 0.285, 0.000)
		colorRock      (0.303, 0.302, 0.298, 0.000)
		colorSnow      (0.317, 0.315, 0.312, 1.000)
		BumpHeight      11.7377
		BumpOffset      2.34754
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.217261
		Period          1.31372
		Eccentricity    0.0768721
		Inclination     -26.2962
		AscendingNode   -44.6002
		ArgOfPericenter -107.679
		MeanAnomaly     118.218
	}
}

DwarfMoon	"Eshan System 8.D20"
{
	ParentBody     "Eshan System 8"
	Class	       "Asteroid"

	Mass            9.79385e-010
	Radius          14.0989
	InertiaMoment   0.399636

	Obliquity       -51.8393
	EqAscendNode    51.6139
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.696 0.578 0.465)

	Surface
	{
		SurfStyle       0.464768
		OceanStyle      0.26714
		Randomize      (-0.605, -0.267, 0.749)
		colorDistMagn   0.0522118
		colorDistFreq   0.0967836
		detailScale     384.993
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999998
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.545687
		terraceProb     0.229006
		erosion         0
		montesMagn      0.54304
		montesFreq      2.52955
		montesSpiky     0.902768
		montesFraction  0.301538
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.443495
		hillsFraction   0.4138
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253803
		craterFreq      0.237876
		craterDensity   0.993529
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.40585
		volcanoTemp     1309.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.279, 0.231, 0.186, 0.000)
		colorShelf     (0.296, 0.246, 0.198, 0.000)
		colorBeach     (0.313, 0.260, 0.209, 0.000)
		colorDesert    (0.331, 0.274, 0.221, 0.000)
		colorLowland   (0.348, 0.289, 0.232, 0.000)
		colorUpland    (0.366, 0.303, 0.244, 0.000)
		colorRock      (0.383, 0.318, 0.256, 0.000)
		colorSnow      (0.400, 0.332, 0.267, 1.000)
		BumpHeight      12.689
		BumpOffset      2.5378
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.217604
		Period          1.31682
		Eccentricity    0.224753
		Inclination     -51.8393
		AscendingNode   51.6139
		ArgOfPericenter -179.627
		MeanAnomaly     159.757
	}
}

DwarfMoon	"Eshan System 8.D21"
{
	ParentBody     "Eshan System 8"
	Class	       "Asteroid"

	Mass            1.40315e-009
	Radius          15.2638
	InertiaMoment   0.397468

	RotationPeriod  7854.07
	Obliquity       2.80259
	EqAscendNode    104.561

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.514 0.510 0.504)

	Surface
	{
		SurfStyle       0.217547
		OceanStyle      0.752611
		Randomize      (0.850, -0.072, 0.353)
		colorDistMagn   0.634897
		colorDistFreq   0.1501
		detailScale     416.804
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0598031
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.498839
		terraceProb     0.496784
		erosion         0
		montesMagn      0.443146
		montesFreq      2.46191
		montesSpiky     0.887724
		montesFraction  0.508247
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.667344
		hillsFraction   0.572577
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225962
		craterFreq      0.222974
		craterDensity   0.911735
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.479903
		volcanoTemp     1376.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.206, 0.204, 0.202, 0.000)
		colorShelf     (0.219, 0.217, 0.214, 0.000)
		colorBeach     (0.231, 0.229, 0.227, 0.000)
		colorDesert    (0.244, 0.242, 0.239, 0.000)
		colorLowland   (0.257, 0.255, 0.252, 0.000)
		colorUpland    (0.270, 0.268, 0.265, 0.000)
		colorRock      (0.283, 0.280, 0.277, 0.000)
		colorSnow      (0.296, 0.293, 0.290, 1.000)
		BumpHeight      13.7374
		BumpOffset      2.74749
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.218126
		Period          1.32156
		Eccentricity    0.0200569
		Inclination     2.80282
		AscendingNode   104.561
		ArgOfPericenter -127.615
		MeanAnomaly     -173.869
	}
}

DwarfMoon	"Eshan System 8.D22"
{
	ParentBody     "Eshan System 8"
	Class	       "Asteroid"

	Mass            1.98675e-009
	Radius          15.9558
	InertiaMoment   0.398821

	RotationPeriod  3747.42
	Obliquity       41.7367
	EqAscendNode    63.2543

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.770 0.687 0.623)

	Surface
	{
		SurfStyle       0.269369
		OceanStyle      0.33612
		Randomize      (-0.264, 0.599, 0.430)
		colorDistMagn   0.30254
		colorDistFreq   0.138453
		detailScale     435.7
		colorConversion true
		snowLevel       2
		tropicLatitude  0.933799
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.487533
		terraceProb     0.293213
		erosion         0
		montesMagn      0.502856
		montesFreq      2.82746
		montesSpiky     0.980455
		montesFraction  0.769937
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.585601
		hillsFraction   0.785053
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244742
		craterFreq      0.154676
		craterDensity   0.883337
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.537417
		volcanoTemp     1515.09
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.308, 0.275, 0.249, 0.000)
		colorShelf     (0.327, 0.292, 0.265, 0.000)
		colorBeach     (0.346, 0.309, 0.281, 0.000)
		colorDesert    (0.366, 0.326, 0.296, 0.000)
		colorLowland   (0.385, 0.344, 0.312, 0.000)
		colorUpland    (0.404, 0.361, 0.327, 0.000)
		colorRock      (0.423, 0.378, 0.343, 0.000)
		colorSnow      (0.443, 0.395, 0.358, 1.000)
		BumpHeight      14.3602
		BumpOffset      2.87205
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.218619
		Period          1.32605
		Eccentricity    0.304146
		Inclination     41.7059
		AscendingNode   63.2571
		ArgOfPericenter -126.765
		MeanAnomaly     -84.0217
	}
}

DwarfMoon	"Eshan System 8.D23"
{
	ParentBody     "Eshan System 8"
	Class	       "Asteroid"

	Mass            2.78557e-009
	Radius          21.1116
	InertiaMoment   0.399762

	RotationPeriod  5855.44
	Obliquity       -86.1115
	EqAscendNode    -153.807

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.750 0.665 0.544)

	Surface
	{
		SurfStyle       0.396367
		OceanStyle      0.679762
		Randomize      (-0.673, 0.092, -0.084)
		colorDistMagn   0.991961
		colorDistFreq   0.301468
		detailScale     576.487
		colorConversion true
		snowLevel       2
		tropicLatitude  0.440423
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.723436
		terraceProb     0.128766
		erosion         0
		montesMagn      0.544002
		montesFreq      3.59229
		montesSpiky     0.999543
		montesFraction  0.487892
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.0827
		hillsFraction   0.7323
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249441
		craterFreq      0.203088
		craterDensity   0.783186
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.397645
		volcanoTemp     1533.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.300, 0.266, 0.218, 0.000)
		colorShelf     (0.319, 0.283, 0.231, 0.000)
		colorBeach     (0.337, 0.299, 0.245, 0.000)
		colorDesert    (0.356, 0.316, 0.258, 0.000)
		colorLowland   (0.375, 0.333, 0.272, 0.000)
		colorUpland    (0.394, 0.349, 0.286, 0.000)
		colorRock      (0.412, 0.366, 0.299, 0.000)
		colorSnow      (0.431, 0.383, 0.313, 1.000)
		BumpHeight      19.0004
		BumpOffset      3.80009
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.219268
		Period          1.33196
		Eccentricity    0.367853
		Inclination     -86.1041
		AscendingNode   -153.808
		ArgOfPericenter 23.8424
		MeanAnomaly     -64.0574
	}
}

DwarfMoon	"Eshan System 8.D24"
{
	ParentBody     "Eshan System 8"
	Class	       "Asteroid"

	Mass            3.87379e-009
	Radius          22.4266
	InertiaMoment   0.397725

	RotationPeriod  3434.03
	Obliquity       -68.4058
	EqAscendNode    -100.222

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.632 0.505 0.351)

	Surface
	{
		SurfStyle       0.520681
		OceanStyle      0.0200642
		Randomize      (0.614, -0.716, -0.203)
		colorDistMagn   0.47463
		colorDistFreq   0.184239
		detailScale     612.395
		colorConversion true
		snowLevel       2
		tropicLatitude  0.957445
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.351237
		terraceProb     0.530043
		erosion         0
		montesMagn      0.426415
		montesFreq      3.96928
		montesSpiky     0.886017
		montesFraction  0.364677
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.12127
		hillsFraction   0.740041
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260187
		craterFreq      0.229257
		craterDensity   0.957805
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.497127
		volcanoTemp     1777.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.246, 0.172, 0.098, 0.000)
		colorShelf     (0.253, 0.177, 0.112, 0.000)
		colorBeach     (0.297, 0.207, 0.133, 0.000)
		colorDesert    (0.322, 0.222, 0.130, 0.000)
		colorLowland   (0.354, 0.237, 0.147, 0.000)
		colorUpland    (0.392, 0.288, 0.179, 0.000)
		colorRock      (0.423, 0.313, 0.193, 0.000)
		colorSnow      (0.461, 0.333, 0.204, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.219824
		Period          1.33702
		Eccentricity    0.199991
		Inclination     -68.3926
		AscendingNode   -100.2
		ArgOfPericenter 38.4723
		MeanAnomaly     -110.075
	}
}

DwarfMoon	"Eshan System 8.D25"
{
	ParentBody     "Eshan System 8"
	Class	       "Asteroid"

	Mass            5.35085e-009
	Radius          23.992
	InertiaMoment   0.398966

	RotationPeriod  2505.01
	Obliquity       51.638
	EqAscendNode    61.4202

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.640 0.637 0.635)

	Surface
	{
		SurfStyle       0.888808
		OceanStyle      0.342262
		Randomize      (-0.692, 0.837, -0.248)
		colorDistMagn   0.732805
		colorDistFreq   0.160068
		detailScale     655.142
		colorConversion true
		snowLevel       2
		tropicLatitude  0.99428
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.533722
		terraceProb     0.370223
		erosion         0
		montesMagn      0.564427
		montesFreq      3.08373
		montesSpiky     0.866611
		montesFraction  0.801102
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.5891
		hillsFraction   0.482148
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230926
		craterFreq      0.254029
		craterDensity   0.747401
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51419
		volcanoTemp     1408.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.218, 0.223, 0.254, 0.050)
		colorShelf     (0.256, 0.261, 0.292, 0.040)
		colorBeach     (0.294, 0.299, 0.330, 0.030)
		colorDesert    (0.333, 0.338, 0.374, 0.020)
		colorLowland   (0.371, 0.376, 0.412, 0.030)
		colorUpland    (0.410, 0.414, 0.450, 0.050)
		colorRock      (0.448, 0.452, 0.501, 0.020)
		colorSnow      (0.448, 0.452, 0.501, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.220073
		Period          1.3393
		Eccentricity    0.243871
		Inclination     50.3404
		AscendingNode   61.3638
		ArgOfPericenter 72.8873
		MeanAnomaly     -48.3479
	}
}

DwarfMoon	"Eshan System 8.D26"
{
	ParentBody     "Eshan System 8"
	Class	       "Asteroid"

	Mass            7.35055e-009
	Radius          25.1769
	InertiaMoment   0.399888

	RotationPeriod  1837.53
	Obliquity       -8.49286
	EqAscendNode    -133.806

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.750 0.747 0.744)

	Surface
	{
		SurfStyle       0.897129
		OceanStyle      0.657961
		Randomize      (-0.788, -0.855, -0.832)
		colorDistMagn   0.221683
		colorDistFreq   0.343955
		detailScale     687.498
		colorConversion true
		snowLevel       2
		tropicLatitude  0.112822
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.269437
		terraceProb     0.277176
		erosion         0
		montesMagn      0.465123
		montesFreq      3.38801
		montesSpiky     0.98971
		montesFraction  0.377152
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.70054
		hillsFraction   0.536866
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231482
		craterFreq      0.255562
		craterDensity   0.798335
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.463671
		volcanoTemp     1493.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.255, 0.261, 0.298, 0.050)
		colorShelf     (0.300, 0.306, 0.342, 0.040)
		colorBeach     (0.345, 0.351, 0.387, 0.030)
		colorDesert    (0.390, 0.396, 0.439, 0.020)
		colorLowland   (0.435, 0.441, 0.484, 0.030)
		colorUpland    (0.480, 0.486, 0.528, 0.050)
		colorRock      (0.525, 0.530, 0.588, 0.020)
		colorSnow      (0.525, 0.530, 0.588, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.220557
		Period          1.34372
		Eccentricity    0.441248
		Inclination     -7.99589
		AscendingNode   -133.712
		ArgOfPericenter 92.2364
		MeanAnomaly     139.132
	}
}

DwarfMoon	"Eshan System 8.D27"
{
	ParentBody     "Eshan System 8"
	Class	       "Asteroid"

	Mass            1.00534e-008
	Radius          32.7011
	InertiaMoment   0.397949

	RotationPeriod  2328.08
	Obliquity       -40.1379
	EqAscendNode    47.7732

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.722 0.607 0.563)

	Surface
	{
		SurfStyle       0.0943469
		OceanStyle      0.0373148
		Randomize      (0.037, 0.788, 0.518)
		colorDistMagn   0.701295
		colorDistFreq   0.668269
		detailScale     892.959
		colorConversion true
		snowLevel       2
		tropicLatitude  0.948593
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.376986
		terraceProb     0.14641
		erosion         0
		montesMagn      0.497042
		montesFreq      2.95642
		montesSpiky     0.968749
		montesFraction  0.652338
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.66289
		hillsFraction   0.716859
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223338
		craterFreq      0.204547
		craterDensity   0.955858
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.520984
		volcanoTemp     1862.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.289, 0.243, 0.225, 0.000)
		colorShelf     (0.307, 0.258, 0.239, 0.000)
		colorBeach     (0.325, 0.273, 0.253, 0.000)
		colorDesert    (0.343, 0.288, 0.268, 0.000)
		colorLowland   (0.361, 0.304, 0.282, 0.000)
		colorUpland    (0.379, 0.319, 0.296, 0.000)
		colorRock      (0.397, 0.334, 0.310, 0.000)
		colorSnow      (0.415, 0.349, 0.324, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.221015
		Period          1.34791
		Eccentricity    0.182514
		Inclination     -39.3796
		AscendingNode   47.8566
		ArgOfPericenter -108.553
		MeanAnomaly     11.6051
	}
}

DwarfMoon	"Eshan System 8.D28"
{
	ParentBody     "Eshan System 8"
	Class	       "Asteroid"

	Mass            1.37041e-008
	Radius          34.3758
	InertiaMoment   0.399107

	RotationPeriod  1761.87
	Obliquity       38.0269
	EqAscendNode    -170.343

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.694 0.605 0.497)

	Surface
	{
		SurfStyle       0.536525
		OceanStyle      0.254055
		Randomize      (0.962, -0.199, 0.959)
		colorDistMagn   0.676736
		colorDistFreq   0.684313
		detailScale     938.689
		colorConversion true
		snowLevel       2
		tropicLatitude  0.101769
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.30203
		terraceProb     0.345029
		erosion         0
		montesMagn      0.669711
		montesFreq      3.86223
		montesSpiky     0.911551
		montesFraction  0.511378
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.6592
		hillsFraction   0.680328
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.206149
		craterFreq      0.162375
		craterDensity   0.864119
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.401713
		volcanoTemp     1591.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.271, 0.206, 0.139, 0.000)
		colorShelf     (0.278, 0.212, 0.159, 0.000)
		colorBeach     (0.326, 0.248, 0.189, 0.000)
		colorDesert    (0.354, 0.266, 0.184, 0.000)
		colorLowland   (0.389, 0.285, 0.209, 0.000)
		colorUpland    (0.430, 0.345, 0.253, 0.000)
		colorRock      (0.465, 0.375, 0.273, 0.000)
		colorSnow      (0.507, 0.400, 0.288, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.221502
		Period          1.35237
		Eccentricity    0.163147
		Inclination     37.4994
		AscendingNode   -170.494
		ArgOfPericenter 128.114
		MeanAnomaly     -171.003
	}
}

DwarfMoon	"Eshan System 8.D29"
{
	ParentBody     "Eshan System 8"
	Class	       "Asteroid"

	Mass            1.86355e-008
	Radius          36.5803
	InertiaMoment   0.394387

	RotationPeriod  1417.6
	Obliquity       50.1583
	EqAscendNode    89.0686

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.731 0.679 0.574)

	Surface
	{
		SurfStyle       0.75656
		OceanStyle      0.746693
		Randomize      (-0.937, -0.639, -0.906)
		colorDistMagn   0.0462669
		colorDistFreq   0.747836
		detailScale     998.886
		colorConversion true
		snowLevel       2
		tropicLatitude  0.906876
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.543857
		terraceProb     0.318207
		erosion         0
		montesMagn      0.36567
		montesFreq      2.30577
		montesSpiky     0.91277
		montesFraction  0.745355
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.22152
		hillsFraction   0.606351
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.207181
		craterFreq      0.248213
		craterDensity   0.830212
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.507464
		volcanoTemp     1696.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.285, 0.231, 0.161, 0.000)
		colorShelf     (0.292, 0.238, 0.184, 0.000)
		colorBeach     (0.344, 0.278, 0.218, 0.000)
		colorDesert    (0.373, 0.299, 0.212, 0.000)
		colorLowland   (0.409, 0.319, 0.241, 0.000)
		colorUpland    (0.453, 0.387, 0.293, 0.000)
		colorRock      (0.490, 0.421, 0.316, 0.000)
		colorSnow      (0.534, 0.448, 0.333, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.221758
		Period          1.35471
		Eccentricity    0.146403
		Inclination     48.3763
		AscendingNode   89.585
		ArgOfPericenter 47.8937
		MeanAnomaly     -66.1266
	}
}

DwarfMoon	"Eshan System 8.D30"
{
	ParentBody     "Eshan System 8"
	Class	       "Asteroid"

	Mass            2.53035e-008
	Radius          38.4972
	InertiaMoment   0.39815

	RotationPeriod  1157.37
	Obliquity       29.1355
	EqAscendNode    158.659

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.481 0.414 0.319)

	Surface
	{
		SurfStyle       0.745604
		OceanStyle      0.220364
		Randomize      (-0.147, -0.775, 0.079)
		colorDistMagn   0.634829
		colorDistFreq   0.633146
		detailScale     1051.23
		colorConversion true
		snowLevel       2
		tropicLatitude  0.182262
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.71403
		terraceProb     0.383347
		erosion         0
		montesMagn      0.484403
		montesFreq      2.58693
		montesSpiky     0.881593
		montesFraction  0.726
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.24257
		hillsFraction   0.678629
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243961
		craterFreq      0.242224
		craterDensity   0.958721
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.509448
		volcanoTemp     1258.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.188, 0.141, 0.089, 0.000)
		colorShelf     (0.193, 0.145, 0.102, 0.000)
		colorBeach     (0.226, 0.170, 0.121, 0.000)
		colorDesert    (0.245, 0.182, 0.118, 0.000)
		colorLowland   (0.270, 0.194, 0.134, 0.000)
		colorUpland    (0.298, 0.236, 0.163, 0.000)
		colorRock      (0.322, 0.256, 0.175, 0.000)
		colorSnow      (0.351, 0.273, 0.185, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.222364
		Period          1.36027
		Eccentricity    0.132266
		Inclination     25.013
		AscendingNode   158.623
		ArgOfPericenter -177.611
		MeanAnomaly     155.892
	}
}

DwarfMoon	"Eshan System 8.D31"
{
	ParentBody     "Eshan System 8"
	Class	       "Asteroid"

	Mass            3.43358e-008
	Radius          49.8076
	InertiaMoment   0.399243

	RotationPeriod  1396.42
	Obliquity       -40.8645
	EqAscendNode    128.645

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.534 0.528 0.524)

	Surface
	{
		SurfStyle       0.0911957
		OceanStyle      0.761697
		Randomize      (-0.432, 0.976, -0.333)
		colorDistMagn   0.521221
		colorDistFreq   1.52383
		detailScale     1360.08
		colorConversion true
		snowLevel       2
		tropicLatitude  0.545265
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.263576
		terraceProb     0.393835
		erosion         0
		montesMagn      0.598818
		montesFreq      3.04597
		montesSpiky     0.939099
		montesFraction  0.461831
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.7484
		hillsFraction   0.440048
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257786
		craterFreq      0.202922
		craterDensity   0.741093
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.538066
		volcanoTemp     1466.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.214, 0.211, 0.210, 0.000)
		colorShelf     (0.227, 0.224, 0.223, 0.000)
		colorBeach     (0.240, 0.238, 0.236, 0.000)
		colorDesert    (0.254, 0.251, 0.249, 0.000)
		colorLowland   (0.267, 0.264, 0.262, 0.000)
		colorUpland    (0.280, 0.277, 0.275, 0.000)
		colorRock      (0.294, 0.290, 0.288, 0.000)
		colorSnow      (0.307, 0.304, 0.301, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.222818
		Period          1.36443
		Eccentricity    0.432636
		Inclination     -41.9506
		AscendingNode   129.096
		ArgOfPericenter -60.4551
		MeanAnomaly     -41.2445
	}
}

DwarfMoon	"Eshan System 8.D32"
{
	ParentBody     "Eshan System 8"
	Class	       "Asteroid"

	Mass            4.66031e-008
	Radius          52.0137
	InertiaMoment   0.39616

	RotationPeriod  1116.11
	Obliquity       -84.5198
	EqAscendNode    37.9022

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.612 0.609 0.603)

	Surface
	{
		SurfStyle       0.748571
		OceanStyle      0.431103
		Randomize      (0.878, -0.384, -0.370)
		colorDistMagn   0.348276
		colorDistFreq   1.24329
		detailScale     1420.32
		colorConversion true
		snowLevel       2
		tropicLatitude  0.656223
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.612695
		terraceProb     0.361673
		erosion         0
		montesMagn      0.632599
		montesFreq      3.89757
		montesSpiky     0.990925
		montesFraction  0.321706
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.60619
		hillsFraction   0.666745
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219289
		craterFreq      0.161664
		craterDensity   0.916905
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.43156
		volcanoTemp     1627.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.239, 0.207, 0.169, 0.000)
		colorShelf     (0.245, 0.213, 0.193, 0.000)
		colorBeach     (0.288, 0.250, 0.229, 0.000)
		colorDesert    (0.312, 0.268, 0.223, 0.000)
		colorLowland   (0.343, 0.286, 0.253, 0.000)
		colorUpland    (0.380, 0.347, 0.307, 0.000)
		colorRock      (0.410, 0.377, 0.331, 0.000)
		colorSnow      (0.447, 0.402, 0.349, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.22332
		Period          1.36905
		Eccentricity    0.152782
		Inclination     -78.8947
		AscendingNode   37.6901
		ArgOfPericenter 166.537
		MeanAnomaly     49.6659
	}
}

Moon	"Eshan System 8.6"
{
	ParentBody     "Eshan System 8"
	Class	       "IceWorld"

	Mass            0.175096
	Radius          4457.64
	InertiaMoment   0.333142

	Oblateness      0.00550483

	RotationPeriod  26.1653
	Obliquity       61.489
	EqAscendNode    -120.556

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.525 0.457 0.325)

	Surface
	{
		SurfStyle       0.207117
		OceanStyle      0.32625
		Randomize      (0.282, 0.513, -0.620)
		colorDistMagn   0.0420226
		colorDistFreq   635.766
		detailScale     11465.3
		colorConversion true
		drivenDarkening 0
		seaLevel        0.247871
		snowLevel       2
		tropicLatitude  0.783301
		icecapLatitude  1
		icecapHeight    0.247871
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.71965
		venusFreq       1.03516
		venusMagn       0
		mareFreq        1.89952
		mareDensity     0.0140845
		terraceProb     0.56501
		erosion         0
		montesMagn      0.166188
		montesFreq      168.033
		montesSpiky     0.964723
		montesFraction  0.712404
		dunesMagn       0.0399714
		dunesFreq       5825.1
		dunesFraction   0.647741
		hillsMagn       0.137575
		hillsFreq       433.223
		hillsFraction   0.00154148
		hills2Fraction  0.022258
		riversMagn      64.3197
		riversFreq      3.70831
		riversSin       7.14058
		riversOctaves   0
		canyonsMagn     0.52444
		canyonsFreq     1.75978
		canyonFraction  0
		cracksMagn      0.0535518
		cracksFreq      1.63104
		cracksOctaves   4
		craterMagn      0.696667
		craterFreq      14.9946
		craterDensity   0.873065
		craterOctaves   13
		craterRayedFactor 0.0837311
		volcanoMagn     0.676441
		volcanoFreq     0.624982
		volcanoDensity  0.24319
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.200948
		volcanoRadius   0.496514
		volcanoTemp     1395.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.525, 0.457, 0.325, 0.500)
		colorShelf     (0.499, 0.434, 0.309, 0.500)
		colorBeach     (0.367, 0.320, 0.227, 0.750)
		colorDesert    (0.446, 0.388, 0.276, 1.000)
		colorLowland   (0.462, 0.402, 0.286, 1.000)
		colorUpland    (0.488, 0.425, 0.302, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.462, 0.402, 0.286, 1.000)
		colorUpPlants  (0.488, 0.425, 0.302, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.972806
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
		Height          119.759
		Density         0.00271937
		Pressure        0.0006016
		Greenhouse      0.0486612
		Bright          4.86288
		Opacity         0
		SkyLight        1.62096
		Hue             0.00400111
		Saturation      1

		Composition
		{
			N2    	80.1247
			Ar    	18.3102
			CO    	1.5606
			Ne    	0.0041137
			Kr    	0.000400326
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.223536
		Period          1.37098
		Eccentricity    0.0790315
		Inclination     26.1317
		AscendingNode   -119.931
		ArgOfPericenter -114.837
		MeanAnomaly     51.2763
	}
}

DwarfMoon	"Eshan System 8.D33"
{
	ParentBody     "Eshan System 8"
	Class	       "Asteroid"

	Mass            8.62111e-008
	Radius          58.4992
	InertiaMoment   0.399375

	RotationPeriod  808.332
	Obliquity       40.9438
	EqAscendNode    98.8011

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.659 0.654 0.652)

	Surface
	{
		SurfStyle       0.806125
		OceanStyle      0.254512
		Randomize      (-0.812, -0.776, -0.316)
		colorDistMagn   0.324394
		colorDistFreq   1.86861
		detailScale     1597.42
		colorConversion true
		snowLevel       2
		tropicLatitude  0.713666
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.521003
		terraceProb     0.15427
		erosion         0
		montesMagn      0.505309
		montesFreq      2.61642
		montesSpiky     0.992583
		montesFraction  0.376463
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.03711
		hillsFraction   0.70692
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24747
		craterFreq      0.211975
		craterDensity   0.866821
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.577574
		volcanoTemp     1446.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.257, 0.222, 0.182, 0.000)
		colorShelf     (0.264, 0.229, 0.209, 0.000)
		colorBeach     (0.310, 0.268, 0.248, 0.000)
		colorDesert    (0.336, 0.288, 0.241, 0.000)
		colorLowland   (0.369, 0.307, 0.274, 0.000)
		colorUpland    (0.408, 0.373, 0.332, 0.000)
		colorRock      (0.441, 0.405, 0.358, 0.000)
		colorSnow      (0.481, 0.431, 0.378, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.224198
		Period          1.37713
		Eccentricity    0.472719
		Inclination     30.0125
		AscendingNode   98.1403
		ArgOfPericenter 159.733
		MeanAnomaly     156.145
	}
}

DwarfMoon	"Eshan System 8.D34"
{
	ParentBody     "Eshan System 8"
	Class	       "Asteroid"

	Mass            1.17715e-007
	Radius          76.1413
	InertiaMoment   0.396755

	RotationPeriod  942.485
	Obliquity       18.6134
	EqAscendNode    20.867

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.661 0.658 0.654)

	Surface
	{
		SurfStyle       0.640907
		OceanStyle      0.218166
		Randomize      (0.710, 0.657, 0.184)
		colorDistMagn   0.28997
		colorDistFreq   3.87852
		detailScale     2079.17
		colorConversion true
		snowLevel       2
		tropicLatitude  0.769161
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.310539
		terraceProb     0.188836
		erosion         0
		montesMagn      0.540726
		montesFreq      3.95254
		montesSpiky     0.906561
		montesFraction  0.15845
		dunesFraction   0
		hillsMagn       0
		hillsFreq       13.747
		hillsFraction   0.485589
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.215679
		craterFreq      0.230471
		craterDensity   0.821347
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.553972
		volcanoTemp     1941.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.258, 0.224, 0.183, 0.000)
		colorShelf     (0.264, 0.230, 0.209, 0.000)
		colorBeach     (0.311, 0.270, 0.248, 0.000)
		colorDesert    (0.337, 0.289, 0.242, 0.000)
		colorLowland   (0.370, 0.309, 0.275, 0.000)
		colorUpland    (0.410, 0.375, 0.333, 0.000)
		colorRock      (0.443, 0.408, 0.360, 0.000)
		colorSnow      (0.483, 0.434, 0.379, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.224796
		Period          1.38264
		Eccentricity    0.270381
		Inclination     32.4159
		AscendingNode   19.8177
		ArgOfPericenter -22.5426
		MeanAnomaly     -76.3124
	}
}

DwarfMoon	"Eshan System 8.D35"
{
	ParentBody     "Eshan System 8"
	Class	       "Asteroid"

	Mass            1.6136e-007
	Radius          79.1967
	InertiaMoment   0.398505

	RotationPeriod  782.339
	Obliquity       76.1968
	EqAscendNode    12.3228

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.482 0.476 0.471)

	Surface
	{
		SurfStyle       0.250428
		OceanStyle      0.857423
		Randomize      (-0.066, -0.051, -0.184)
		colorDistMagn   0.662388
		colorDistFreq   3.74453
		detailScale     2162.6
		colorConversion true
		snowLevel       2
		tropicLatitude  0.511996
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.671033
		terraceProb     0.418966
		erosion         0
		montesMagn      0.483345
		montesFreq      3.29537
		montesSpiky     0.940774
		montesFraction  0.576399
		dunesFraction   0
		hillsMagn       0
		hillsFreq       17.5756
		hillsFraction   0.694561
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248719
		craterFreq      0.183158
		craterDensity   0.970945
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.46939
		volcanoTemp     905.007
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.193, 0.190, 0.188, 0.000)
		colorShelf     (0.205, 0.202, 0.200, 0.000)
		colorBeach     (0.217, 0.214, 0.212, 0.000)
		colorDesert    (0.229, 0.226, 0.224, 0.000)
		colorLowland   (0.241, 0.238, 0.235, 0.000)
		colorUpland    (0.253, 0.250, 0.247, 0.000)
		colorRock      (0.265, 0.262, 0.259, 0.000)
		colorSnow      (0.277, 0.274, 0.271, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.225112
		Period          1.38556
		Eccentricity    0.190199
		Inclination     75.1036
		AscendingNode   11.2903
		ArgOfPericenter -18.6566
		MeanAnomaly     -20.3687
	}
}

Barycenter	"9-9.1"
{
	ParentBody     "Eshan System"
	Mass            0.00433808
	Radius          1744.16
	RotationPeriod  24
	Obliquity       0
	EqAscendNode    0


	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   14.8668
		Period          58.3885
		Eccentricity    0.059221
		Inclination     6.03515
		AscendingNode   123.76
		ArgOfPericenter 302.018
		MeanAnomaly     64.2085
	}
}

DwarfPlanet	"Eshan System 9"
{
	ParentBody     "Eshan System 9-9.1"
	Class	       "IceWorld"

	Mass            0.00399561
	Radius          1389.7
	InertiaMoment   0.391927

	Oblateness      0.0184288

	Obliquity       -1.0072
	EqAscendNode    -97.524
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.756 0.716 0.663)

	Surface
	{
		SurfStyle       0.797248
		OceanStyle      0.573797
		Randomize      (0.800, -0.474, -0.565)
		colorDistMagn   0.0601609
		colorDistFreq   148.142
		detailScale     3574.39
		colorConversion true
		drivenDarkening 0
		seaLevel        0.125164
		snowLevel       2
		tropicLatitude  0.0231725
		icecapLatitude  0.517254
		icecapHeight    0.152841
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.9926
		venusFreq       0.742761
		venusMagn       0
		mareFreq        0.739428
		mareDensity     0.00128019
		terraceProb     0.342879
		erosion         0
		montesMagn      0.0516945
		montesFreq      80.9433
		montesSpiky     0.889745
		montesFraction  0.096345
		dunesMagn       0.0358013
		dunesFreq       1849.59
		dunesFraction   0.83397
		hillsMagn       0.14284
		hillsFreq       169.843
		hillsFraction   0.710004
		hills2Fraction  0.0443106
		riversMagn      57.6624
		riversFreq      4.18427
		riversSin       5.91132
		riversOctaves   0
		canyonsMagn     0.441834
		canyonsFreq     0.615156
		canyonFraction  0
		cracksMagn      0.0301168
		cracksFreq      0.880749
		cracksOctaves   1
		craterMagn      0.618367
		craterFreq      4.12147
		craterDensity   0.889071
		craterOctaves   11
		craterRayedFactor 0
		volcanoMagn     0.17279
		volcanoFreq     0.62765
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.418418
		volcanoRadius   0.15931
		volcanoTemp     1728.05
		lavaCoverTidal  0.0387514
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.484, 0.458, 0.444, 0.250)
		colorShelf     (0.529, 0.523, 0.504, 0.250)
		colorBeach     (0.431, 0.387, 0.384, 0.200)
		colorDesert    (0.401, 0.351, 0.338, 0.200)
		colorLowland   (0.295, 0.272, 0.278, 0.200)
		colorUpland    (0.559, 0.530, 0.504, 0.250)
		colorRock      (0.640, 0.630, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.295, 0.272, 0.278, 0.200)
		colorUpPlants  (0.559, 0.530, 0.504, 0.250)
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
		SemiMajorAxis   3.02839e-006
		Period          0.00209665
		Eccentricity    0.0305732
		Inclination     -1.0072
		AscendingNode   -97.524
		ArgOfPericenter 100.041
		MeanAnomaly     152.859
	}
}

Moon	"Eshan System 9.1"
{
	ParentBody     "Eshan System 9-9.1"
	Class	       "Selena"

	Mass            0.000341272
	Radius          579.458
	InertiaMoment   0.397885

	Oblateness      0.0159949

	Obliquity       -1.0072
	EqAscendNode    -97.524
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.514 0.507 0.500)

	Surface
	{
		SurfStyle       0.418212
		OceanStyle      0.286683
		Randomize      (0.599, 0.597, 0.312)
		colorDistMagn   0.0463385
		colorDistFreq   56.3348
		detailScale     1490.4
		colorConversion true
		drivenDarkening 0
		seaLevel        0.197428
		snowLevel       2
		tropicLatitude  0.0231725
		icecapLatitude  0.490402
		icecapHeight    0.213133
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.76954
		venusFreq       0.886431
		venusMagn       0
		mareFreq        0
		mareDensity     0.000290595
		terraceProb     0.184377
		erosion         0
		montesMagn      0.0662107
		montesFreq      28.4517
		montesSpiky     0.973616
		montesFraction  0.564351
		dunesMagn       0.0492742
		dunesFreq       767.334
		dunesFraction   0.991208
		hillsMagn       0.140168
		hillsFreq       74.4658
		hillsFraction   0.0460934
		hills2Fraction  0
		riversMagn      59.2469
		riversFreq      3.30795
		riversSin       4.93163
		riversOctaves   0
		canyonsMagn     0.579814
		canyonsFreq     0.223477
		canyonFraction  0.838146
		cracksMagn      0.0503948
		cracksFreq      0.231412
		cracksOctaves   0
		craterMagn      0.627308
		craterFreq      1.99316
		craterDensity   0.840872
		craterOctaves   7.92478
		craterRayedFactor 0.0795442
		volcanoMagn     0.2149
		volcanoFreq     0.735879
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.147048
		volcanoRadius   0.169891
		volcanoTemp     1369.56
		lavaCoverTidal  0.132743
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.420, 0.420, 0.430, 0.000)
		colorShelf     (0.470, 0.480, 0.480, 0.000)
		colorBeach     (0.283, 0.289, 0.300, 0.000)
		colorDesert    (0.247, 0.233, 0.230, 0.000)
		colorLowland   (0.314, 0.310, 0.280, 0.000)
		colorUpland    (0.334, 0.330, 0.305, 0.000)
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
		SemiMajorAxis   3.54564e-005
		Period          0.00209665
		Eccentricity    0.0305732
		Inclination     -1.0072
		AscendingNode   -97.524
		ArgOfPericenter -79.9594
		MeanAnomaly     152.859
	}
}

DwarfMoon	"Eshan System 9.D1"
{
	ParentBody     "Eshan System 9-9.1"
	Class	       "Asteroid"

	Mass            4.4374e-007
	Radius          63.4647
	InertiaMoment   0.399813

	Obliquity       0.632867
	EqAscendNode    -117.883
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.475 0.471 0.469)

	Surface
	{
		SurfStyle       0.330002
		OceanStyle      0.539215
		Randomize      (0.315, -0.295, -0.893)
		colorDistMagn   0.483864
		colorDistFreq   2.20846
		detailScale     1733.01
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0113989
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.518565
		terraceProb     0.297242
		erosion         0
		montesMagn      0.449596
		montesFreq      3.24758
		montesSpiky     0.944091
		montesFraction  0.563383
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.299
		hillsFraction   0.574581
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213473
		craterFreq      0.197164
		craterDensity   1.0317
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.539587
		volcanoTemp     1796.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.190, 0.188, 0.188, 0.000)
		colorShelf     (0.202, 0.200, 0.199, 0.000)
		colorBeach     (0.214, 0.212, 0.211, 0.000)
		colorDesert    (0.226, 0.224, 0.223, 0.000)
		colorLowland   (0.237, 0.235, 0.234, 0.000)
		colorUpland    (0.249, 0.247, 0.246, 0.000)
		colorRock      (0.261, 0.259, 0.258, 0.000)
		colorSnow      (0.273, 0.271, 0.270, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00016708
		Period          0.0197583
		Eccentricity    0.0272864
		Inclination     0.632867
		AscendingNode   -117.883
		ArgOfPericenter 84.2741
		MeanAnomaly     -174.099
	}
}

DwarfMoon	"Eshan System 9.D2"
{
	ParentBody     "Eshan System 9-9.1"
	Class	       "Asteroid"

	Mass            7.58174e-007
	Radius          80.5888
	InertiaMoment   0.399344

	Obliquity       1.46078
	EqAscendNode    -93.4326
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.722 0.605 0.500)

	Surface
	{
		SurfStyle       0.943432
		OceanStyle      0.726527
		Randomize      (-0.297, -0.846, -0.938)
		colorDistMagn   0.83574
		colorDistFreq   5.48806
		detailScale     2200.61
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0349503
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.635741
		terraceProb     0.34294
		erosion         0
		montesMagn      0.461494
		montesFreq      2.8962
		montesSpiky     0.952368
		montesFraction  0.468234
		dunesFraction   0
		hillsMagn       0
		hillsFreq       16.7174
		hillsFraction   0.64927
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22654
		craterFreq      0.198221
		craterDensity   0.905967
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.596641
		volcanoTemp     1562.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.245, 0.212, 0.200, 0.050)
		colorShelf     (0.289, 0.248, 0.230, 0.040)
		colorBeach     (0.332, 0.284, 0.260, 0.030)
		colorDesert    (0.375, 0.321, 0.295, 0.020)
		colorLowland   (0.419, 0.357, 0.325, 0.030)
		colorUpland    (0.462, 0.393, 0.355, 0.050)
		colorRock      (0.505, 0.430, 0.395, 0.020)
		colorSnow      (0.505, 0.430, 0.395, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000241175
		Period          0.0342646
		Eccentricity    0.0331544
		Inclination     1.46078
		AscendingNode   -93.4326
		ArgOfPericenter -118.455
		MeanAnomaly     -56.9532
	}
}

Planet	"Eshan System 10"
{
	ParentBody     "Eshan System"
	Class	       "IceGiant"

	Mass            37.493
	Radius          25835.8
	InertiaMoment   0.206895

	Oblateness      0.0343453

	RotationPeriod  8.02502
	Obliquity       -51.3378
	EqAscendNode    64.7852

	AlbedoBond      0.411195
	AlbedoGeom      0.493433
	Brightness      2

	Surface
	{
		SurfStyle       0.773136
		Randomize      (-0.990, -0.737, -0.660)
		detailScale     66451.2
		colorConversion true
		tropicLatitude  0.79119
		icecapLatitude  1
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     8.34271
		stripeFluct     0.331913
		stripeTwist     11.1239
		cycloneMagn     9.97733
		cycloneFreq     0.5937
		cycloneDensity  0.421973
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
		BumpHeight      13.2307
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          33.6758
		Velocity        457.106
		BumpHeight      20.4456
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.40208
		mainOctaves     12
		Coverage        0.0559726
		stripeZones     8.34271
		stripeFluct     0.331913
		stripeTwist     11.1239
	}

	Clouds
	{
		Height          54.1211
		Velocity        1809.11
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		ModulateColor  (1.000 1.000 1.000 0.800)
		mainFreq        1.40208
		mainOctaves     12
		Coverage        0.0559726
		stripeZones     8.34271
		stripeFluct     0.331913
		stripeTwist     11.1239
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          217.687
		Density         11196.6
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.61075
		Saturation      0.923023

		Composition
		{
			H2    	93.7337
			He    	6.26504
			Ne    	0.00106307
			N2    	0.00016564
		}
	}

	Aurora
	{
		Height      498.05
		NorthLat    56.384
		NorthLon    122.03
		NorthRadius 7204.71
		NorthWidth  2329.72
		NorthRings  5
		NorthBright 1
		NorthParticles 10000
		SouthLat    -60.4757
		SouthLon    306.428
		SouthRadius 6594.24
		SouthWidth  1693.05
		SouthRings  4
		SouthBright 1
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	Rings
	{
		InnerRadius     41283.2
		OuterRadius     78403
		RotationPeriod  6.62413
		RotationOffset  0
		FrontBright     0.682318
		BackBright      0.608629
		Density         0.606841
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   32.0993
		Period          185.233
		Eccentricity    0.0246315
		Inclination     -2.45807
		AscendingNode   67.9311
		ArgOfPericenter 169.941
		MeanAnomaly     139.689
	}
}

DwarfMoon	"Eshan System 10.D1"
{
	ParentBody     "Eshan System 10"
	Class	       "Asteroid"

	Mass            2.88532e-009
	Radius          21.0267
	InertiaMoment   0.396505

	Oblateness      0.249

	Obliquity       -0.00333813
	EqAscendNode    39.7696
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.689 0.686 0.680)

	Surface
	{
		SurfStyle       0.811397
		OceanStyle      0.643263
		Randomize      (0.700, 0.876, -0.333)
		colorDistMagn   0.611535
		colorDistFreq   0.204052
		detailScale     574.168
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.678158
		terraceProb     0.188639
		erosion         0
		montesMagn      0.584741
		montesFreq      2.59311
		montesSpiky     0.994011
		montesFraction  0.705751
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.909551
		hillsFraction   0.485642
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.265834
		craterFreq      0.20703
		craterDensity   0.824715
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.479558
		volcanoTemp     1031.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.269, 0.233, 0.191, 0.000)
		colorShelf     (0.275, 0.240, 0.218, 0.000)
		colorBeach     (0.324, 0.281, 0.259, 0.000)
		colorDesert    (0.351, 0.302, 0.252, 0.000)
		colorLowland   (0.386, 0.322, 0.286, 0.000)
		colorUpland    (0.427, 0.391, 0.347, 0.000)
		colorRock      (0.461, 0.425, 0.374, 0.000)
		colorSnow      (0.503, 0.453, 0.395, 1.000)
		BumpHeight      18.924
		BumpOffset      3.7848
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000483207
		Period          0.00100324
		Eccentricity    1.03504e-005
		Inclination     -0.00333813
		AscendingNode   39.7696
		ArgOfPericenter 0.188865
		MeanAnomaly     28.5151
	}
}

Moon	"Eshan System 10.1"
{
	ParentBody     "Eshan System 10"
	Class	       "Selena"

	Mass            0.00087524
	Radius          841.294
	InertiaMoment   0.39851

	Oblateness      0.0100029

	Obliquity       1.22488
	EqAscendNode    -67.1392
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.784 0.782 0.781)

	Surface
	{
		SurfStyle       0.787063
		OceanStyle      0.259908
		Randomize      (0.074, 0.771, 0.274)
		colorDistMagn   0.0811856
		colorDistFreq   92.2833
		detailScale     2163.85
		colorConversion true
		drivenDarkening 0
		seaLevel        0.126054
		snowLevel       2
		tropicLatitude  0.0356171
		icecapLatitude  0.753851
		icecapHeight    0.1384
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.72002
		venusFreq       1.38125
		venusMagn       0
		mareFreq        0.14656
		mareDensity     0.00039608
		terraceProb     0.261869
		erosion         0
		montesMagn      0.0726449
		montesFreq      35.989
		montesSpiky     0.90889
		montesFraction  0.205252
		dunesMagn       0.0430259
		dunesFreq       1116.37
		dunesFraction   0.832107
		hillsMagn       0.124095
		hillsFreq       98.5744
		hillsFraction   0.861293
		hills2Fraction  0
		riversMagn      57.4652
		riversFreq      3.09039
		riversSin       6.64062
		riversOctaves   0
		canyonsMagn     0.452479
		canyonsFreq     0.341881
		canyonFraction  0.510911
		cracksMagn      0.0507931
		cracksFreq      0.349404
		cracksOctaves   0
		craterMagn      0.635801
		craterFreq      2.4353
		craterDensity   0.792358
		craterOctaves   8.17643
		craterRayedFactor 0
		volcanoMagn     0.171572
		volcanoFreq     0.788655
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.323366
		volcanoRadius   0.15619
		volcanoTemp     1821.61
		lavaCoverTidal  0.202619
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.470, 0.400, 0.340, 0.000)
		colorShelf     (0.640, 0.600, 0.470, 0.000)
		colorBeach     (0.494, 0.477, 0.375, 0.000)
		colorDesert    (0.525, 0.485, 0.383, 0.000)
		colorLowland   (0.431, 0.360, 0.305, 0.000)
		colorUpland    (0.611, 0.555, 0.406, 0.000)
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
		SemiMajorAxis   0.000980451
		Period          0.0028996
		Eccentricity    0.0487518
		Inclination     1.22488
		AscendingNode   -67.1392
		ArgOfPericenter -72.4374
		MeanAnomaly     46.2395
	}
}

Moon	"Eshan System 10.2"
{
	ParentBody     "Eshan System 10"
	Class	       "IceWorld"

	Mass            0.00102478
	Radius          834.298
	InertiaMoment   0.397812

	Oblateness      0.0018719

	Obliquity       -0.0687283
	EqAscendNode    56.5999
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.708 0.591 0.444)

	Surface
	{
		SurfStyle       0.12925
		OceanStyle      0.472891
		Randomize      (-0.328, 0.181, 0.960)
		colorDistMagn   0.0799497
		colorDistFreq   73.8804
		detailScale     2145.86
		colorConversion true
		drivenDarkening 0.7
		seaLevel        0.205282
		snowLevel       2
		tropicLatitude  0.00210018
		icecapLatitude  0.526999
		icecapHeight    0.239197
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.76649
		venusFreq       1.27031
		venusMagn       0
		mareFreq        0.152357
		mareDensity     0.000672634
		terraceProb     0.245354
		erosion         0
		montesMagn      0.0739724
		montesFreq      40.8652
		montesSpiky     0.927201
		montesFraction  0.27983
		dunesMagn       0.0393979
		dunesFreq       1100.76
		dunesFraction   0.486892
		hillsMagn       0.133251
		hillsFreq       103.119
		hillsFraction   0.292861
		hills2Fraction  0.0921442
		riversMagn      64.5424
		riversFreq      3.96397
		riversSin       7.76149
		riversOctaves   0
		canyonsMagn     0.514053
		canyonsFreq     0.277967
		canyonFraction  0
		cracksMagn      0.0215296
		cracksFreq      0.459844
		cracksOctaves   0
		craterMagn      0.563838
		craterFreq      2.41905
		craterDensity   0.954374
		craterOctaves   10
		craterRayedFactor 0.175195
		volcanoMagn     0.182317
		volcanoFreq     0.740827
		volcanoDensity  0.213197
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.215759
		volcanoRadius   0.178352
		volcanoTemp     1732.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.708, 0.591, 0.444, 0.500)
		colorShelf     (0.673, 0.561, 0.422, 0.500)
		colorBeach     (0.496, 0.414, 0.311, 0.750)
		colorDesert    (0.602, 0.502, 0.377, 1.000)
		colorLowland   (0.623, 0.520, 0.391, 1.000)
		colorUpland    (0.659, 0.550, 0.413, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.623, 0.520, 0.391, 1.000)
		colorUpPlants  (0.659, 0.550, 0.413, 1.000)
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
		SemiMajorAxis   0.00161139
		Period          0.00610939
		Eccentricity    0.0479639
		Inclination     -0.0687283
		AscendingNode   56.5999
		ArgOfPericenter 124.516
		MeanAnomaly     -7.15207
	}
}

Moon	"Eshan System 10.3"
{
	ParentBody     "Eshan System 10"
	Class	       "IceWorld"

	Mass            0.00119531
	Radius          932.763
	InertiaMoment   0.396624

	Obliquity       0.673014
	EqAscendNode    152.027
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.699 0.614 0.474)

	Surface
	{
		SurfStyle       0.257782
		OceanStyle      0.144194
		Randomize      (0.104, -0.357, -0.528)
		colorDistMagn   0.0676825
		colorDistFreq   122.693
		detailScale     2399.12
		colorConversion true
		drivenDarkening 0.7
		seaLevel        0.184343
		snowLevel       2
		tropicLatitude  0.00567329
		icecapLatitude  0.76237
		icecapHeight    0.200043
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.92041
		venusFreq       1.17914
		venusMagn       0
		mareFreq        0.210787
		mareDensity     0.000511939
		terraceProb     0.342996
		erosion         0
		montesMagn      0.062888
		montesFreq      50.3122
		montesSpiky     0.943816
		montesFraction  0.289577
		dunesMagn       0.0328367
		dunesFreq       1211.73
		dunesFraction   0.0375089
		hillsMagn       0.110712
		hillsFreq       85.9098
		hillsFraction   0.778995
		hills2Fraction  0.00551127
		riversMagn      56.514
		riversFreq      2.83261
		riversSin       5.88778
		riversOctaves   0
		canyonsMagn     0.469144
		canyonsFreq     0.295304
		canyonFraction  0
		cracksMagn      0.0321256
		cracksFreq      0.423819
		cracksOctaves   0
		craterMagn      0.513273
		craterFreq      2.57652
		craterDensity   0.722437
		craterOctaves   10
		craterRayedFactor 0.128288
		volcanoMagn     0.129779
		volcanoFreq     0.789951
		volcanoDensity  0.197478
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.293746
		volcanoRadius   0.160272
		volcanoTemp     1104.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.699, 0.614, 0.474, 0.500)
		colorShelf     (0.664, 0.583, 0.450, 0.500)
		colorBeach     (0.489, 0.430, 0.332, 0.750)
		colorDesert    (0.594, 0.522, 0.403, 1.000)
		colorLowland   (0.615, 0.540, 0.417, 1.000)
		colorUpland    (0.650, 0.571, 0.441, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.615, 0.540, 0.417, 1.000)
		colorUpPlants  (0.650, 0.571, 0.441, 1.000)
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
		SemiMajorAxis   0.00264834
		Period          0.0128723
		Eccentricity    0.0139905
		Inclination     0.673014
		AscendingNode   152.027
		ArgOfPericenter 20.5914
		MeanAnomaly     120.241
	}
}

Moon	"Eshan System 10.4"
{
	ParentBody     "Eshan System 10"
	Class	       "IceWorld"

	Mass            0.00139008
	Radius          922.865
	InertiaMoment   0.399771

	Obliquity       -0.907996
	EqAscendNode    -10.1495
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.798 0.792 0.790)

	Surface
	{
		SurfStyle       0.784269
		OceanStyle      0.160179
		Randomize      (0.117, -0.599, 0.047)
		colorDistMagn   0.0481205
		colorDistFreq   99.3815
		detailScale     2373.66
		colorConversion true
		drivenDarkening 0.555491
		seaLevel        0.188213
		snowLevel       2
		tropicLatitude  0.0315649
		icecapLatitude  0.808948
		icecapHeight    0.198859
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.71452
		venusFreq       0.995913
		venusMagn       0
		mareFreq        0.230019
		mareDensity     0.000850347
		terraceProb     0.105071
		erosion         0
		montesMagn      0.06357
		montesFreq      43.0431
		montesSpiky     0.94305
		montesFraction  0.87553
		dunesMagn       0.0297934
		dunesFreq       1221.28
		dunesFraction   0.0347298
		hillsMagn       0.123165
		hillsFreq       119.953
		hillsFraction   0.810606
		hills2Fraction  0.149519
		riversMagn      55.5292
		riversFreq      1.92295
		riversSin       6.3542
		riversOctaves   0
		canyonsMagn     0.727625
		canyonsFreq     0.291522
		canyonFraction  0
		cracksMagn      0.0564568
		cracksFreq      0.531437
		cracksOctaves   0
		craterMagn      0.652202
		craterFreq      2.56534
		craterDensity   0.757711
		craterOctaves   10
		craterRayedFactor 0.0557243
		volcanoMagn     0.148682
		volcanoFreq     0.900487
		volcanoDensity  0.218735
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.157871
		volcanoRadius   0.170402
		volcanoTemp     1465.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.511, 0.507, 0.529, 0.250)
		colorShelf     (0.558, 0.578, 0.600, 0.250)
		colorBeach     (0.455, 0.428, 0.458, 0.200)
		colorDesert    (0.423, 0.388, 0.403, 0.200)
		colorLowland   (0.311, 0.301, 0.332, 0.200)
		colorUpland    (0.590, 0.586, 0.600, 0.250)
		colorRock      (0.640, 0.630, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.311, 0.301, 0.332, 0.200)
		colorUpPlants  (0.590, 0.586, 0.600, 0.250)
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
		SemiMajorAxis   0.00435258
		Period          0.0271217
		Eccentricity    0.0166439
		Inclination     -0.907996
		AscendingNode   -10.1495
		ArgOfPericenter 36.7178
		MeanAnomaly     -3.55261
	}
}

Moon	"Eshan System 10.5"
{
	ParentBody     "Eshan System 10"
	Class	       "IceWorld"

	Mass            0.00161298
	Radius          1029.99
	InertiaMoment   0.3993

	Obliquity       -1.42802
	EqAscendNode    51.3993
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.709 0.563 0.368)

	Surface
	{
		SurfStyle       0.715197
		OceanStyle      0.941088
		Randomize      (0.038, 0.681, -0.572)
		colorDistMagn   0.070335
		colorDistFreq   132.151
		detailScale     2649.2
		colorConversion true
		drivenDarkening 0.33799
		seaLevel        0.129101
		snowLevel       2
		tropicLatitude  0.0448999
		icecapLatitude  0.760259
		icecapHeight    0.144669
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.82208
		venusFreq       0.697075
		venusMagn       0
		mareFreq        0.260069
		mareDensity     0.000487802
		terraceProb     0.337504
		erosion         0
		montesMagn      0.0683106
		montesFreq      43.0398
		montesSpiky     0.983467
		montesFraction  0.605513
		dunesMagn       0.0353503
		dunesFreq       1367.31
		dunesFraction   0.914971
		hillsMagn       0.115086
		hillsFreq       136.06
		hillsFraction   0.772046
		hills2Fraction  0.295803
		riversMagn      70.3289
		riversFreq      3.91233
		riversSin       6.04442
		riversOctaves   0
		canyonsMagn     0.543821
		canyonsFreq     0.364618
		canyonFraction  0
		cracksMagn      0.0649952
		cracksFreq      0.486495
		cracksOctaves   0
		craterMagn      0.571226
		craterFreq      3.46401
		craterDensity   0.90002
		craterOctaves   10
		craterRayedFactor 0.0754454
		volcanoMagn     0.210574
		volcanoFreq     0.698136
		volcanoDensity  0.254906
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.114848
		volcanoRadius   0.173613
		volcanoTemp     1522.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.453, 0.360, 0.246, 0.250)
		colorShelf     (0.496, 0.411, 0.279, 0.250)
		colorBeach     (0.404, 0.304, 0.213, 0.200)
		colorDesert    (0.376, 0.276, 0.188, 0.200)
		colorLowland   (0.276, 0.214, 0.154, 0.200)
		colorUpland    (0.524, 0.416, 0.279, 0.250)
		colorRock      (0.640, 0.630, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.276, 0.214, 0.154, 0.200)
		colorUpPlants  (0.524, 0.416, 0.279, 0.250)
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
		SemiMajorAxis   0.00715354
		Period          0.0571448
		Eccentricity    0.020305
		Inclination     -1.42802
		AscendingNode   51.3993
		ArgOfPericenter -93.7673
		MeanAnomaly     71.2591
	}
}

Moon	"Eshan System 10.6"
{
	ParentBody     "Eshan System 10"
	Class	       "IceWorld"

	Mass            0.018687
	Radius          2169.11
	InertiaMoment   0.364216

	Obliquity       0.08573
	EqAscendNode    -144.426
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.676 0.447 0.354)

	Surface
	{
		SurfStyle       0.112713
		OceanStyle      0.130796
		Randomize      (-0.766, -0.757, 0.288)
		colorDistMagn   0.0403946
		colorDistFreq   214.753
		detailScale     5579.07
		colorConversion true
		drivenDarkening 0.20565
		seaLevel        0.241
		snowLevel       2
		tropicLatitude  0.00091349
		icecapLatitude  0.60209
		icecapHeight    0.268287
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.88158
		venusFreq       0.845939
		venusMagn       0
		mareFreq        1.07426
		mareDensity     0.00359952
		terraceProb     0.166597
		erosion         0
		montesMagn      0.125546
		montesFreq      122.397
		montesSpiky     0.96064
		montesFraction  0.841298
		dunesMagn       0.032552
		dunesFreq       2903.75
		dunesFraction   0.935939
		hillsMagn       0.134297
		hillsFreq       263.978
		hillsFraction   0.224428
		hills2Fraction  0.155355
		riversMagn      54.9681
		riversFreq      2.80556
		riversSin       6.81321
		riversOctaves   0
		canyonsMagn     0.415937
		canyonsFreq     0.948208
		canyonFraction  0
		cracksMagn      0.0646986
		cracksFreq      0.974899
		cracksOctaves   1
		craterMagn      0.531287
		craterFreq      5.21686
		craterDensity   0.795743
		craterOctaves   11
		craterRayedFactor 0.151621
		volcanoMagn     0.396111
		volcanoFreq     0.689182
		volcanoDensity  0.176644
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.255212
		volcanoRadius   0.322527
		volcanoTemp     1178.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.676, 0.447, 0.354, 0.500)
		colorShelf     (0.642, 0.424, 0.336, 0.500)
		colorBeach     (0.473, 0.313, 0.248, 0.750)
		colorDesert    (0.575, 0.380, 0.301, 1.000)
		colorLowland   (0.595, 0.393, 0.311, 1.000)
		colorUpland    (0.629, 0.416, 0.329, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.595, 0.393, 0.311, 1.000)
		colorUpPlants  (0.629, 0.416, 0.329, 1.000)
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
		SemiMajorAxis   0.011757
		Period          0.120376
		Eccentricity    0.0161979
		Inclination     0.08573
		AscendingNode   -144.426
		ArgOfPericenter 14.0201
		MeanAnomaly     -110.951
	}
}

Moon	"Eshan System 10.7"
{
	ParentBody     "Eshan System 10"
	Class	       "IceWorld"

	Mass            0.00216293
	Radius          1134.89
	InertiaMoment   0.398175

	Obliquity       0.938292
	EqAscendNode    -2.06528
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.769 0.714 0.630)

	Surface
	{
		SurfStyle       0.657132
		OceanStyle      0.909312
		Randomize      (0.738, -0.495, 0.859)
		colorDistMagn   0.0688419
		colorDistFreq   106.379
		detailScale     2919.01
		colorConversion true
		drivenDarkening 0.125128
		seaLevel        0.255206
		snowLevel       2
		tropicLatitude  0.0327414
		icecapLatitude  0.737776
		icecapHeight    0.275401
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.0437
		venusFreq       1.05164
		venusMagn       0
		mareFreq        0.492825
		mareDensity     0.000760254
		terraceProb     0.192871
		erosion         0
		montesMagn      0.0543825
		montesFreq      62.6728
		montesSpiky     0.92921
		montesFraction  0.5511
		dunesMagn       0.0411719
		dunesFreq       1503.3
		dunesFraction   0.739128
		hillsMagn       0.120156
		hillsFreq       116.282
		hillsFraction   0.21812
		hills2Fraction  0.29727
		riversMagn      51.6666
		riversFreq      2.69325
		riversSin       7.1796
		riversOctaves   0
		canyonsMagn     0.484174
		canyonsFreq     0.319788
		canyonFraction  0
		cracksMagn      0.0543421
		cracksFreq      0.566494
		cracksOctaves   0
		craterMagn      0.55853
		craterFreq      2.98675
		craterDensity   0.777125
		craterOctaves   10
		craterRayedFactor 0.155307
		volcanoMagn     0.171576
		volcanoFreq     0.780282
		volcanoDensity  0.185392
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.38574
		volcanoRadius   0.137261
		volcanoTemp     1418.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.492, 0.457, 0.422, 0.250)
		colorShelf     (0.538, 0.521, 0.479, 0.250)
		colorBeach     (0.438, 0.386, 0.366, 0.200)
		colorDesert    (0.408, 0.350, 0.321, 0.200)
		colorLowland   (0.300, 0.271, 0.265, 0.200)
		colorUpland    (0.569, 0.528, 0.479, 0.250)
		colorRock      (0.640, 0.630, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.300, 0.271, 0.265, 0.200)
		colorUpPlants  (0.569, 0.528, 0.479, 0.250)
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
		SemiMajorAxis   0.0193227
		Period          0.253685
		Eccentricity    0.0159317
		Inclination     0.938292
		AscendingNode   -2.06528
		ArgOfPericenter 161.453
		MeanAnomaly     18.3026
	}
}

Moon	"Eshan System 10.8"
{
	ParentBody     "Eshan System 10"
	Class	       "IceWorld"

	Mass            0.00250264
	Radius          1120.79
	InertiaMoment   0.397312

	Obliquity       -1.22596
	EqAscendNode    145.286
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.728 0.671 0.618)

	Surface
	{
		SurfStyle       0.20943
		OceanStyle      0.305276
		Randomize      (-0.125, 0.668, 0.553)
		colorDistMagn   0.0521399
		colorDistFreq   107.612
		detailScale     2882.73
		colorConversion true
		drivenDarkening 0.0761346
		seaLevel        0.256355
		snowLevel       2
		tropicLatitude  0.0127653
		icecapLatitude  0.687047
		icecapHeight    0.276085
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.534
		venusFreq       1.01635
		venusMagn       0
		mareFreq        0.329624
		mareDensity     0.00110729
		terraceProb     0.18312
		erosion         0
		montesMagn      0.0469667
		montesFreq      53.1963
		montesSpiky     0.964367
		montesFraction  0.122081
		dunesMagn       0.035733
		dunesFreq       1446.58
		dunesFraction   0.912322
		hillsMagn       0.141801
		hillsFreq       112.318
		hillsFraction   0.60525
		hills2Fraction  0.0675004
		riversMagn      59.1061
		riversFreq      3.02561
		riversSin       4.65797
		riversOctaves   0
		canyonsMagn     0.544787
		canyonsFreq     0.442389
		canyonFraction  0
		cracksMagn      0.0458924
		cracksFreq      0.40788
		cracksOctaves   0
		craterMagn      0.535245
		craterFreq      3.82802
		craterDensity   0.936428
		craterOctaves   10
		craterRayedFactor 0.242178
		volcanoMagn     0.190777
		volcanoFreq     0.752347
		volcanoDensity  0.220083
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.37604
		volcanoRadius   0.170753
		volcanoTemp     1486.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.728, 0.671, 0.618, 0.500)
		colorShelf     (0.691, 0.637, 0.587, 0.500)
		colorBeach     (0.509, 0.470, 0.432, 0.750)
		colorDesert    (0.619, 0.570, 0.525, 1.000)
		colorLowland   (0.640, 0.590, 0.544, 1.000)
		colorUpland    (0.677, 0.624, 0.574, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.640, 0.590, 0.544, 1.000)
		colorUpPlants  (0.677, 0.624, 0.574, 1.000)
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
		SemiMajorAxis   0.0317572
		Period          0.534507
		Eccentricity    0.0488643
		Inclination     -1.22596
		AscendingNode   145.286
		ArgOfPericenter -173.851
		MeanAnomaly     -142.661
	}
}

DwarfMoon	"Eshan System 10.D2"
{
	ParentBody     "Eshan System 10"
	Class	       "Asteroid"

	Mass            4.81332e-008
	Radius          51.9756
	InertiaMoment   0.397599

	RotationPeriod  615.278
	Obliquity       47.3344
	EqAscendNode    143.593

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.746 0.744 0.743)

	Surface
	{
		SurfStyle       0.373749
		OceanStyle      0.508461
		Randomize      (0.885, 0.842, -0.411)
		colorDistMagn   0.334888
		colorDistFreq   1.36807
		detailScale     1419.28
		colorConversion true
		snowLevel       2
		tropicLatitude  0.392205
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.574593
		terraceProb     0.507074
		erosion         0
		montesMagn      0.613636
		montesFreq      2.22211
		montesSpiky     0.868409
		montesFraction  0.534401
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.34461
		hillsFraction   0.621098
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257987
		craterFreq      0.19551
		craterDensity   0.950736
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.505623
		volcanoTemp     1303.32
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.298, 0.298, 0.297, 0.000)
		colorShelf     (0.317, 0.316, 0.316, 0.000)
		colorBeach     (0.336, 0.335, 0.334, 0.000)
		colorDesert    (0.354, 0.354, 0.353, 0.000)
		colorLowland   (0.373, 0.372, 0.372, 0.000)
		colorUpland    (0.392, 0.391, 0.390, 0.000)
		colorRock      (0.410, 0.409, 0.409, 0.000)
		colorSnow      (0.429, 0.428, 0.427, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.211926
		Period          9.21471
		Eccentricity    0.425871
		Inclination     35.6674
		AscendingNode   149.465
		ArgOfPericenter 12.416
		MeanAnomaly     131.5
	}
}

DwarfMoon	"Eshan System 10.D3"
{
	ParentBody     "Eshan System 10"
	Class	       "Asteroid"

	Mass            6.54125e-008
	Radius          55.303
	InertiaMoment   0.398893

	RotationPeriod  563.251
	Obliquity       -41.7051
	EqAscendNode    68.1217

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.623 0.620 0.618)

	Surface
	{
		SurfStyle       0.585218
		OceanStyle      0.42322
		Randomize      (-0.949, -0.536, -0.764)
		colorDistMagn   0.493548
		colorDistFreq   1.42737
		detailScale     1510.14
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999391
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.421632
		terraceProb     0.297153
		erosion         0
		montesMagn      0.535477
		montesFreq      1.92892
		montesSpiky     0.747184
		montesFraction  0.62702
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.30679
		hillsFraction   0.754862
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250338
		craterFreq      0.255418
		craterDensity   0.918223
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.543254
		volcanoTemp     1782.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.243, 0.211, 0.173, 0.000)
		colorShelf     (0.249, 0.217, 0.198, 0.000)
		colorBeach     (0.293, 0.254, 0.235, 0.000)
		colorDesert    (0.318, 0.273, 0.229, 0.000)
		colorLowland   (0.349, 0.291, 0.260, 0.000)
		colorUpland    (0.387, 0.353, 0.315, 0.000)
		colorRock      (0.418, 0.384, 0.340, 0.000)
		colorSnow      (0.455, 0.409, 0.359, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.212554
		Period          9.25568
		Eccentricity    0.388189
		Inclination     -67.3614
		AscendingNode   65.7225
		ArgOfPericenter 161.082
		MeanAnomaly     -24.6935
	}
}

DwarfMoon	"Eshan System 10.D4"
{
	ParentBody     "Eshan System 10"
	Class	       "Asteroid"

	Mass            8.908e-008
	Radius          57.9188
	InertiaMoment   0.399824

	RotationPeriod  506.796
	Obliquity       32.7821
	EqAscendNode    69.5777

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.612 0.519 0.408)

	Surface
	{
		SurfStyle       0.518088
		OceanStyle      0.365951
		Randomize      (0.618, -0.880, -0.635)
		colorDistMagn   0.807456
		colorDistFreq   2.67618
		detailScale     1581.57
		colorConversion true
		snowLevel       2
		tropicLatitude  0.801683
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.580064
		terraceProb     0.227574
		erosion         0
		montesMagn      0.616726
		montesFreq      2.63612
		montesSpiky     0.978913
		montesFraction  0.288523
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.99238
		hillsFraction   0.338409
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233547
		craterFreq      0.210672
		craterDensity   0.953729
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.541943
		volcanoTemp     1741.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.239, 0.176, 0.114, 0.000)
		colorShelf     (0.245, 0.181, 0.130, 0.000)
		colorBeach     (0.288, 0.213, 0.155, 0.000)
		colorDesert    (0.312, 0.228, 0.151, 0.000)
		colorLowland   (0.343, 0.244, 0.171, 0.000)
		colorUpland    (0.379, 0.296, 0.208, 0.000)
		colorRock      (0.410, 0.321, 0.224, 0.000)
		colorSnow      (0.447, 0.342, 0.236, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.212882
		Period          9.27708
		Eccentricity    0.482855
		Inclination     33.1098
		AscendingNode   68.9002
		ArgOfPericenter 88.4418
		MeanAnomaly     -14.9245
	}
}

DwarfMoon	"Eshan System 10.D5"
{
	ParentBody     "Eshan System 10"
	Class	       "Asteroid"

	Mass            1.21677e-007
	Radius          75.1634
	InertiaMoment   0.397839

	RotationPeriod  560.629
	Obliquity       -4.04387
	EqAscendNode    32.6688

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.633 0.523 0.363)

	Surface
	{
		SurfStyle       0.0677065
		OceanStyle      0.380453
		Randomize      (0.030, -1.000, 0.159)
		colorDistMagn   0.937542
		colorDistFreq   0.959689
		detailScale     2052.46
		colorConversion true
		snowLevel       2
		tropicLatitude  0.326073
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.295508
		terraceProb     0.182387
		erosion         0
		montesMagn      0.619337
		montesFreq      2.69931
		montesSpiky     0.966821
		montesFraction  0.476652
		dunesFraction   0
		hillsMagn       0
		hillsFreq       15.9343
		hillsFraction   0.511346
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229624
		craterFreq      0.237719
		craterDensity   0.839324
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.463686
		volcanoTemp     1334.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.253, 0.209, 0.145, 0.000)
		colorShelf     (0.269, 0.222, 0.154, 0.000)
		colorBeach     (0.285, 0.236, 0.163, 0.000)
		colorDesert    (0.301, 0.249, 0.173, 0.000)
		colorLowland   (0.316, 0.262, 0.182, 0.000)
		colorUpland    (0.332, 0.275, 0.191, 0.000)
		colorRock      (0.348, 0.288, 0.200, 0.000)
		colorSnow      (0.364, 0.301, 0.209, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.213465
		Period          9.31522
		Eccentricity    0.267301
		Inclination     22.2683
		AscendingNode   33.7132
		ArgOfPericenter 77.2495
		MeanAnomaly     84.2547
	}
}

DwarfMoon	"Eshan System 10.D6"
{
	ParentBody     "Eshan System 10"
	Class	       "Asteroid"

	Mass            1.66869e-007
	Radius          79.1353
	InertiaMoment   0.399036

	RotationPeriod  505.493
	Obliquity       -89.5444
	EqAscendNode    12.9983

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.734 0.659 0.605)

	Surface
	{
		SurfStyle       0.536607
		OceanStyle      0.237403
		Randomize      (0.553, -0.354, -0.559)
		colorDistMagn   0.561789
		colorDistFreq   4.91307
		detailScale     2160.92
		colorConversion true
		snowLevel       2
		tropicLatitude  0.808714
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.680579
		terraceProb     0.261824
		erosion         0
		montesMagn      0.60995
		montesFreq      2.56063
		montesSpiky     0.958823
		montesFraction  0.455454
		dunesFraction   0
		hillsMagn       0
		hillsFreq       17.6266
		hillsFraction   0.322268
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240637
		craterFreq      0.272107
		craterDensity   1.02605
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.466465
		volcanoTemp     1712.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.286, 0.224, 0.169, 0.000)
		colorShelf     (0.294, 0.231, 0.194, 0.000)
		colorBeach     (0.345, 0.270, 0.230, 0.000)
		colorDesert    (0.374, 0.290, 0.224, 0.000)
		colorLowland   (0.411, 0.310, 0.254, 0.000)
		colorUpland    (0.455, 0.376, 0.309, 0.000)
		colorRock      (0.492, 0.409, 0.333, 0.000)
		colorSnow      (0.536, 0.435, 0.351, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.214114
		Period          9.35774
		Eccentricity    0.449258
		Inclination     -37.2437
		AscendingNode   10.7677
		ArgOfPericenter -36.6441
		MeanAnomaly     -48.3734
	}
}

DwarfMoon	"Eshan System 10.D7"
{
	ParentBody     "Eshan System 10"
	Class	       "Asteroid"

	Mass            2.30014e-007
	Radius          84.589
	InertiaMoment   0.399949

	RotationPeriod  461.256
	Obliquity       62.815
	EqAscendNode    95.5857

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.533 0.529 0.524)

	Surface
	{
		SurfStyle       0.711383
		OceanStyle      0.884651
		Randomize      (-0.033, -0.829, -0.249)
		colorDistMagn   0.219285
		colorDistFreq   1.91733
		detailScale     2309.84
		colorConversion true
		snowLevel       2
		tropicLatitude  0.957209
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.545201
		terraceProb     0.495923
		erosion         0
		montesMagn      0.370161
		montesFreq      2.83211
		montesSpiky     0.960459
		montesFraction  0.511314
		dunesFraction   0
		hillsMagn       0
		hillsFreq       14.5308
		hillsFraction   0.768794
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.265889
		craterFreq      0.236186
		craterDensity   0.847747
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.571542
		volcanoTemp     1278.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.208, 0.180, 0.147, 0.000)
		colorShelf     (0.213, 0.185, 0.168, 0.000)
		colorBeach     (0.250, 0.217, 0.199, 0.000)
		colorDesert    (0.272, 0.233, 0.194, 0.000)
		colorLowland   (0.298, 0.249, 0.220, 0.000)
		colorUpland    (0.330, 0.302, 0.267, 0.000)
		colorRock      (0.357, 0.328, 0.288, 0.000)
		colorSnow      (0.389, 0.349, 0.304, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.214421
		Period          9.37786
		Eccentricity    0.196325
		Inclination     61.1497
		AscendingNode   95.0771
		ArgOfPericenter -45.1491
		MeanAnomaly     -167.989
	}
}

DwarfMoon	"Eshan System 10.D8"
{
	ParentBody     "Eshan System 10"
	Class	       "Asteroid"

	Mass            3.19056e-007
	Radius          89.7043
	InertiaMoment   0.398051

	RotationPeriod  414.811
	Obliquity       12.3654
	EqAscendNode    60.8561

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.738 0.734 0.733)

	Surface
	{
		SurfStyle       0.968516
		OceanStyle      0.205923
		Randomize      (0.848, 0.362, 0.384)
		colorDistMagn   0.19115
		colorDistFreq   4.22787
		detailScale     2449.53
		colorConversion true
		snowLevel       2
		tropicLatitude  0.180562
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.446036
		terraceProb     0.211795
		erosion         0
		montesMagn      0.598733
		montesFreq      3.28336
		montesSpiky     0.950785
		montesFraction  0.752974
		dunesFraction   0
		hillsMagn       0
		hillsFreq       19.8529
		hillsFraction   0.651788
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.21655
		craterFreq      0.214983
		craterDensity   0.826603
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.411471
		volcanoTemp     1424.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.251, 0.257, 0.293, 0.050)
		colorShelf     (0.295, 0.301, 0.337, 0.040)
		colorBeach     (0.340, 0.345, 0.381, 0.030)
		colorDesert    (0.384, 0.389, 0.432, 0.020)
		colorLowland   (0.428, 0.433, 0.476, 0.030)
		colorUpland    (0.472, 0.477, 0.520, 0.050)
		colorRock      (0.517, 0.521, 0.579, 0.020)
		colorSnow      (0.517, 0.521, 0.579, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.214776
		Period          9.4012
		Eccentricity    0.351791
		Inclination     -3.29131
		AscendingNode   47.0769
		ArgOfPericenter -56.296
		MeanAnomaly     -70.5311
	}
}

DwarfMoon	"Eshan System 10.D9"
{
	ParentBody     "Eshan System 10"
	Class	       "Asteroid"

	Mass            4.45967e-007
	Radius          117.232
	InertiaMoment   0.399174

	RotationPeriod  458.708
	Obliquity       75.4673
	EqAscendNode    103.205

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.769 0.767 0.766)

	Surface
	{
		SurfStyle       0.885724
		OceanStyle      0.7448
		Randomize      (-0.082, -0.475, 0.619)
		colorDistMagn   0.979288
		colorDistFreq   6.19966
		detailScale     3201.22
		colorConversion true
		snowLevel       2
		tropicLatitude  0.958003
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.683876
		terraceProb     0.21628
		erosion         0
		montesMagn      0.496154
		montesFreq      2.81169
		montesSpiky     0.87557
		montesFraction  0.506878
		dunesFraction   0
		hillsMagn       0
		hillsFreq       37.8216
		hillsFraction   0.875919
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230468
		craterFreq      0.554197
		craterDensity   0.958497
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.45694
		volcanoTemp     1301.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.261, 0.268, 0.306, 0.050)
		colorShelf     (0.307, 0.315, 0.352, 0.040)
		colorBeach     (0.354, 0.361, 0.398, 0.030)
		colorDesert    (0.400, 0.407, 0.452, 0.020)
		colorLowland   (0.446, 0.453, 0.498, 0.030)
		colorUpland    (0.492, 0.499, 0.544, 0.050)
		colorRock      (0.538, 0.545, 0.605, 0.020)
		colorSnow      (0.538, 0.545, 0.605, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.215335
		Period          9.43793
		Eccentricity    0.0567065
		Inclination     85.7997
		AscendingNode   106.141
		ArgOfPericenter -170.095
		MeanAnomaly     -176.995
	}
}

DwarfMoon	"Eshan System 10.D10"
{
	ParentBody     "Eshan System 10"
	Class	       "Asteroid"

	Mass            6.29127e-007
	Radius          123.931
	InertiaMoment   0.395649

	RotationPeriod  406.989
	Obliquity       21.6461
	EqAscendNode    116.935

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.570 0.433 0.347)

	Surface
	{
		SurfStyle       0.473209
		OceanStyle      0.582369
		Randomize      (0.530, 0.961, -0.040)
		colorDistMagn   0.580408
		colorDistFreq   7.87522
		detailScale     3384.13
		colorConversion true
		snowLevel       2
		tropicLatitude  0.354523
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.330055
		terraceProb     0.230249
		erosion         0
		montesMagn      0.241419
		montesFreq      3.61394
		montesSpiky     0.920927
		montesFraction  0.174589
		dunesFraction   0
		hillsMagn       0
		hillsFreq       19.98
		hillsFraction   0.694902
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239141
		craterFreq      0.45294
		craterDensity   0.943021
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.425561
		volcanoTemp     1378.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.228, 0.173, 0.139, 0.000)
		colorShelf     (0.242, 0.184, 0.148, 0.000)
		colorBeach     (0.257, 0.195, 0.156, 0.000)
		colorDesert    (0.271, 0.206, 0.165, 0.000)
		colorLowland   (0.285, 0.217, 0.174, 0.000)
		colorUpland    (0.299, 0.228, 0.182, 0.000)
		colorRock      (0.314, 0.238, 0.191, 0.000)
		colorSnow      (0.328, 0.249, 0.200, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.215997
		Period          9.48149
		Eccentricity    0.2782
		Inclination     17.9875
		AscendingNode   116.595
		ArgOfPericenter 138.103
		MeanAnomaly     64.7701
	}
}

DwarfMoon	"Eshan System 10.D11"
{
	ParentBody     "Eshan System 10"
	Class	       "Asteroid"

	Mass            8.97362e-007
	Radius          133.926
	InertiaMoment   0.398243

	RotationPeriod  369.798
	Obliquity       -104.61
	EqAscendNode    -155.145

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.733 0.637 0.550)

	Surface
	{
		SurfStyle       0.929085
		OceanStyle      0.886649
		Randomize      (0.024, -0.212, -0.166)
		colorDistMagn   0.890858
		colorDistFreq   13.4794
		detailScale     3657.06
		colorConversion true
		snowLevel       2
		tropicLatitude  0.917603
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.389637
		terraceProb     0.245639
		erosion         0
		montesMagn      0.414342
		montesFreq      3.26504
		montesSpiky     0.89071
		montesFraction  0.28397
		dunesFraction   0
		hillsMagn       0
		hillsFreq       49.425
		hillsFraction   0.457244
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24026
		craterFreq      0.525301
		craterDensity   0.857063
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51011
		volcanoTemp     1064.25
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.249, 0.223, 0.220, 0.050)
		colorShelf     (0.293, 0.261, 0.253, 0.040)
		colorBeach     (0.337, 0.299, 0.286, 0.030)
		colorDesert    (0.381, 0.338, 0.324, 0.020)
		colorLowland   (0.425, 0.376, 0.357, 0.030)
		colorUpland    (0.469, 0.414, 0.390, 0.050)
		colorRock      (0.513, 0.452, 0.434, 0.020)
		colorSnow      (0.513, 0.452, 0.434, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.216266
		Period          9.49918
		Eccentricity    0.244053
		Inclination     -42.2935
		AscendingNode   -153.762
		ArgOfPericenter 46.7495
		MeanAnomaly     -159.233
	}
}

Comet	"C1"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            2.00221e-013
	Radius          0.849972
	InertiaMoment   0.39845

	Oblateness      0.0519302

	RotationPeriod  23.6826
	Obliquity       178.14
	EqAscendNode    132.385

	AbsMagn         14.1105
	SlopeParam      4.02572
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.676 0.673 0.669)

	Surface
	{
		SurfStyle       0.953926
		OceanStyle      0.32454
		Randomize      (0.279, -0.050, -0.216)
		colorDistMagn   0.536873
		colorDistFreq   0.000175218
		detailScale     23.2099
		colorConversion true
		snowLevel       2
		tropicLatitude  0.956589
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.372467
		terraceProb     0.162427
		erosion         0
		montesMagn      0.677851
		montesFreq      2.74288
		montesSpiky     0.900472
		montesFraction  0.558787
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00156562
		hillsFraction   0.724859
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253509
		craterFreq      0.266212
		craterDensity   0.889928
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.5177
		volcanoTemp     1698.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.230, 0.236, 0.267, 0.050)
		colorShelf     (0.270, 0.276, 0.308, 0.040)
		colorBeach     (0.311, 0.316, 0.348, 0.030)
		colorDesert    (0.352, 0.357, 0.395, 0.020)
		colorLowland   (0.392, 0.397, 0.435, 0.030)
		colorUpland    (0.433, 0.438, 0.475, 0.050)
		colorRock      (0.473, 0.478, 0.528, 0.020)
		colorSnow      (0.473, 0.478, 0.528, 1.000)
		BumpHeight      0.764975
		BumpOffset      0.152995
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.294812
		GasToDust   0.25
		Particles   1575
		GasBright   0.149958
		DustBright  0.278525
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   22.7458
		Period          110.497
		Eccentricity    0.986566
		Inclination     -105.936
		AscendingNode   -56.9528
		ArgOfPericenter -106.26
		MeanAnomaly     -161.187
	}
}

Comet	"C2"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            1.54856e-009
	Radius          15.3542
	InertiaMoment   0.395418

	Oblateness      0.0481121

	RotationPeriod  21.3583
	Obliquity       131.346
	EqAscendNode    116.962

	AbsMagn         9.00251
	SlopeParam      4.59631
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.549 0.413 0.318)

	Surface
	{
		SurfStyle       0.107011
		OceanStyle      0.454359
		Randomize      (-0.135, -0.281, 0.343)
		colorDistMagn   0.988274
		colorDistFreq   0.139774
		detailScale     419.272
		colorConversion true
		snowLevel       2
		tropicLatitude  0.776581
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.662535
		terraceProb     0.298968
		erosion         0
		montesMagn      0.368742
		montesFreq      3.08655
		montesSpiky     0.861169
		montesFraction  0.269227
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.418674
		hillsFraction   0.527606
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.273395
		craterFreq      0.259711
		craterDensity   0.837165
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.585484
		volcanoTemp     1510.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.220, 0.165, 0.127, 0.000)
		colorShelf     (0.233, 0.175, 0.135, 0.000)
		colorBeach     (0.247, 0.186, 0.143, 0.000)
		colorDesert    (0.261, 0.196, 0.151, 0.000)
		colorLowland   (0.275, 0.206, 0.159, 0.000)
		colorUpland    (0.288, 0.217, 0.167, 0.000)
		colorRock      (0.302, 0.227, 0.175, 0.000)
		colorSnow      (0.316, 0.237, 0.183, 1.000)
		BumpHeight      13.8188
		BumpOffset      2.76376
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.776004
		GasToDust   0.25
		Particles   2547
		GasBright   0.373423
		DustBright  0.539547
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   22.8404
		Period          111.187
		Eccentricity    0.976646
		Inclination     93.2501
		AscendingNode   -27.0612
		ArgOfPericenter -42.3442
		MeanAnomaly     123.913
	}
}

Comet	"C3"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            4.76814e-017
	Radius          0.0526439
	InertiaMoment   0.398967

	Oblateness      0.081357

	RotationPeriod  18.9172
	Obliquity       84.5516
	EqAscendNode    101.539

	AbsMagn         5.44139
	SlopeParam      5.2213
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.607 0.493 0.370)

	Surface
	{
		SurfStyle       0.537147
		OceanStyle      0.354268
		Randomize      (-0.434, 0.502, 0.823)
		colorDistMagn   0.488538
		colorDistFreq   1.98022e-006
		detailScale     1.43753
		colorConversion true
		snowLevel       2
		tropicLatitude  0.963615
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.391329
		terraceProb     0.287399
		erosion         0
		montesMagn      0.649323
		montesFreq      2.45239
		montesSpiky     0.867036
		montesFraction  0.412114
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.44349e-006
		hillsFraction   0.606508
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242816
		craterFreq      0.182729
		craterDensity   0.960211
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.522626
		volcanoTemp     1607.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.237, 0.168, 0.103, 0.000)
		colorShelf     (0.243, 0.173, 0.118, 0.000)
		colorBeach     (0.285, 0.202, 0.140, 0.000)
		colorDesert    (0.309, 0.217, 0.137, 0.000)
		colorLowland   (0.340, 0.232, 0.155, 0.000)
		colorUpland    (0.376, 0.281, 0.189, 0.000)
		colorRock      (0.406, 0.306, 0.203, 0.000)
		colorSnow      (0.443, 0.326, 0.214, 1.000)
		BumpHeight      0.0473795
		BumpOffset      0.00947589
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.279648
		DustBright  0.317808
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   32.0673
		Period          184.967
		Eccentricity    0.990678
		Inclination     153.709
		AscendingNode   143.06
		ArgOfPericenter -21.0951
		MeanAnomaly     144.086
	}
}

Comet	"C4"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            3.68781e-013
	Radius          0.950734
	InertiaMoment   0.397373

	Oblateness      0.0826073

	RotationPeriod  16.3344
	Obliquity       37.7573
	EqAscendNode    86.1169

	AbsMagn         13.5118
	SlopeParam      6.00013
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.546 0.539 0.532)

	Surface
	{
		SurfStyle       0.20137
		OceanStyle      0.917418
		Randomize      (0.633, 0.807, 0.855)
		colorDistMagn   0.503094
		colorDistFreq   0.000523334
		detailScale     25.9614
		colorConversion true
		snowLevel       2
		tropicLatitude  0.978491
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.724966
		terraceProb     0.512553
		erosion         0
		montesMagn      0.536232
		montesFreq      2.53879
		montesSpiky     0.949799
		montesFraction  0.594837
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00266488
		hillsFraction   0.687418
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232792
		craterFreq      0.219944
		craterDensity   0.784326
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.482006
		volcanoTemp     1813.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.218, 0.215, 0.213, 0.000)
		colorShelf     (0.232, 0.229, 0.226, 0.000)
		colorBeach     (0.246, 0.242, 0.240, 0.000)
		colorDesert    (0.259, 0.256, 0.253, 0.000)
		colorLowland   (0.273, 0.269, 0.266, 0.000)
		colorUpland    (0.287, 0.283, 0.279, 0.000)
		colorRock      (0.300, 0.296, 0.293, 0.000)
		colorSnow      (0.314, 0.310, 0.306, 1.000)
		BumpHeight      0.855661
		BumpOffset      0.171132
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.327638
		GasToDust   0.25
		Particles   1641
		GasBright   0.00764358
		DustBright  0.274299
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   26.0728
		Period          135.607
		Eccentricity    0.97792
		Inclination     -80.5998
		AscendingNode   -123.727
		ArgOfPericenter 5.13729
		MeanAnomaly     147.312
	}
}

Comet	"C5"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            2.85226e-009
	Radius          20.5728
	InertiaMoment   0.399422

	Oblateness      0.157839

	RotationPeriod  13.5774
	Obliquity       350.963
	EqAscendNode    70.6943

	AbsMagn         8.78855
	SlopeParam      7.35828
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.599 0.596 0.592)

	Surface
	{
		SurfStyle       0.725714
		OceanStyle      0.343835
		Randomize      (-0.673, 0.067, 0.529)
		colorDistMagn   0.659075
		colorDistFreq   0.353974
		detailScale     561.774
		colorConversion true
		snowLevel       2
		tropicLatitude  0.579093
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.491982
		terraceProb     0.285773
		erosion         0
		montesMagn      0.573863
		montesFreq      3.10308
		montesSpiky     0.820974
		montesFraction  0.332929
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.766112
		hillsFraction   0.527831
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227827
		craterFreq      0.229818
		craterDensity   0.65261
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.642436
		volcanoTemp     1617.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.234, 0.203, 0.166, 0.000)
		colorShelf     (0.240, 0.209, 0.190, 0.000)
		colorBeach     (0.282, 0.245, 0.225, 0.000)
		colorDesert    (0.306, 0.262, 0.219, 0.000)
		colorLowland   (0.336, 0.280, 0.249, 0.000)
		colorUpland    (0.372, 0.340, 0.302, 0.000)
		colorRock      (0.402, 0.370, 0.326, 0.000)
		colorSnow      (0.438, 0.394, 0.344, 1.000)
		BumpHeight      18.5155
		BumpOffset      3.7031
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.80883
		GasToDust   0.25
		Particles   2613
		GasBright   0.0660322
		DustBright  0.700397
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   36.8904
		Period          228.229
		Eccentricity    0.978084
		Inclination     -32.5642
		AscendingNode   -78.3539
		ArgOfPericenter -57.2141
		MeanAnomaly     100.358
	}
}

Comet	"C6"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            8.78233e-017
	Radius          0.0588685
	InertiaMoment   0.398154

	Oblateness      0.196045

	RotationPeriod  10.602
	Obliquity       304.169
	EqAscendNode    55.2717

	AbsMagn         5.17982
	SlopeParam      2.48363
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.471 0.468 0.461)

	Surface
	{
		SurfStyle       0.586856
		OceanStyle      0.00569041
		Randomize      (-0.088, -0.095, -0.796)
		colorDistMagn   0.573762
		colorDistFreq   2.22601e-006
		detailScale     1.6075
		colorConversion true
		snowLevel       2
		tropicLatitude  0.465187
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.297533
		terraceProb     0.554452
		erosion         0
		montesMagn      0.445878
		montesFreq      2.86236
		montesSpiky     0.96429
		montesFraction  0.538552
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.73305e-006
		hillsFraction   0.666568
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233837
		craterFreq      0.274682
		craterDensity   0.931649
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.524878
		volcanoTemp     1509.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.184, 0.159, 0.129, 0.000)
		colorShelf     (0.189, 0.164, 0.147, 0.000)
		colorBeach     (0.222, 0.192, 0.175, 0.000)
		colorDesert    (0.240, 0.206, 0.170, 0.000)
		colorLowland   (0.264, 0.220, 0.193, 0.000)
		colorUpland    (0.292, 0.267, 0.235, 0.000)
		colorRock      (0.316, 0.290, 0.253, 0.000)
		colorSnow      (0.344, 0.309, 0.267, 1.000)
		BumpHeight      0.0529816
		BumpOffset      0.0105963
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0654734
		DustBright  0.385442
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   27.1429
		Period          144.04
		Eccentricity    0.968401
		Inclination     149.117
		AscendingNode   161.701
		ArgOfPericenter 109.921
		MeanAnomaly     159.635
	}
}

Comet	"C7"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            6.7925e-013
	Radius          1.27421
	InertiaMoment   0.399848

	Oblateness      0.249

	RotationPeriod  7.34635
	Obliquity       257.374
	EqAscendNode    39.8491

	AbsMagn         13.0161
	SlopeParam      3.15454
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.779 0.720 0.698)

	Surface
	{
		SurfStyle       0.880569
		OceanStyle      0.922985
		Randomize      (-0.267, 0.373, 0.136)
		colorDistMagn   0.0275935
		colorDistFreq   0.000830215
		detailScale     34.7944
		colorConversion true
		snowLevel       2
		tropicLatitude  0.794271
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.35788
		terraceProb     0.296041
		erosion         0
		montesMagn      0.540911
		montesFreq      3.19509
		montesSpiky     0.909241
		montesFraction  0.483861
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00320799
		hillsFraction   0.636911
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249006
		craterFreq      0.243965
		craterDensity   0.990834
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.434544
		volcanoTemp     1254.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.265, 0.252, 0.279, 0.050)
		colorShelf     (0.311, 0.295, 0.321, 0.040)
		colorBeach     (0.358, 0.338, 0.363, 0.030)
		colorDesert    (0.405, 0.382, 0.412, 0.020)
		colorLowland   (0.452, 0.425, 0.453, 0.030)
		colorUpland    (0.498, 0.468, 0.495, 0.050)
		colorRock      (0.545, 0.511, 0.551, 0.020)
		colorSnow      (0.545, 0.511, 0.551, 1.000)
		BumpHeight      1.14679
		BumpOffset      0.229358
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.360464
		GasToDust   0.25
		Particles   1708
		GasBright   0.191052
		DustBright  0.74435
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   24.4097
		Period          122.842
		Eccentricity    0.964736
		Inclination     119.762
		AscendingNode   53.9041
		ArgOfPericenter -145.545
		MeanAnomaly     -68.3838
	}
}

Comet	"C8"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            5.2535e-009
	Radius          22.9984
	InertiaMoment   0.398723

	Oblateness      0.249

	RotationPeriod  3.71908
	Obliquity       210.58
	EqAscendNode    24.4265

	AbsMagn         8.57683
	SlopeParam      3.7402
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.416 0.412 0.407)

	Surface
	{
		SurfStyle       0.187588
		OceanStyle      0.765216
		Randomize      (0.505, 0.360, -0.614)
		colorDistMagn   0.881768
		colorDistFreq   0.206851
		detailScale     628.009
		colorConversion true
		snowLevel       2
		tropicLatitude  0.530676
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.610318
		terraceProb     0.15128
		erosion         0
		montesMagn      0.560972
		montesFreq      3.12768
		montesSpiky     0.958532
		montesFraction  0.760737
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.23846
		hillsFraction   0.824519
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235772
		craterFreq      0.233142
		craterDensity   0.966634
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.479511
		volcanoTemp     1335.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.166, 0.165, 0.163, 0.000)
		colorShelf     (0.177, 0.175, 0.173, 0.000)
		colorBeach     (0.187, 0.185, 0.183, 0.000)
		colorDesert    (0.197, 0.196, 0.193, 0.000)
		colorLowland   (0.208, 0.206, 0.204, 0.000)
		colorUpland    (0.218, 0.216, 0.214, 0.000)
		colorRock      (0.229, 0.227, 0.224, 0.000)
		colorSnow      (0.239, 0.237, 0.234, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.841655
		GasToDust   0.25
		Particles   2680
		GasBright   0.163211
		DustBright  0.456678
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   28.0436
		Period          151.27
		Eccentricity    0.985136
		Inclination     152.945
		AscendingNode   69.5458
		ArgOfPericenter -41.6749
		MeanAnomaly     -29.0417
	}
}

Comet	"C9"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            1.6176e-016
	Radius          0.0789205
	InertiaMoment   0.396772

	Oblateness      0.00175636

	RotationPeriod  127.78
	Obliquity       163.786
	EqAscendNode    9.00391

	AbsMagn         4.90558
	SlopeParam      4.30396
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.425 0.419 0.413)

	Surface
	{
		SurfStyle       0.687015
		OceanStyle      0.270539
		Randomize      (-0.016, -0.847, 0.045)
		colorDistMagn   0.699572
		colorDistFreq   5.08732e-006
		detailScale     2.15506
		colorConversion true
		snowLevel       2
		tropicLatitude  0.977039
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.389923
		terraceProb     0.423983
		erosion         0
		montesMagn      0.409234
		montesFreq      3.58322
		montesSpiky     0.925796
		montesFraction  0.609211
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.10591e-005
		hillsFraction   0.495278
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.205251
		craterFreq      0.245898
		craterDensity   0.920736
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.533902
		volcanoTemp     1139.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.166, 0.143, 0.116, 0.000)
		colorShelf     (0.170, 0.147, 0.132, 0.000)
		colorBeach     (0.200, 0.172, 0.157, 0.000)
		colorDesert    (0.217, 0.184, 0.153, 0.000)
		colorLowland   (0.238, 0.197, 0.173, 0.000)
		colorUpland    (0.263, 0.239, 0.211, 0.000)
		colorRock      (0.285, 0.260, 0.227, 0.000)
		colorSnow      (0.310, 0.277, 0.239, 1.000)
		BumpHeight      0.0710285
		BumpOffset      0.0142057
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0981114
		DustBright  0.206264
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   26.652
		Period          140.15
		Eccentricity    0.967321
		Inclination     -95.2213
		AscendingNode   63.1301
		ArgOfPericenter -121.722
		MeanAnomaly     54.4374
	}
}

Comet	"C10"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            1.25109e-012
	Radius          1.42398
	InertiaMoment   0.399202

	Oblateness      0.00169145

	RotationPeriod  113.993
	Obliquity       116.992
	EqAscendNode    353.581

	AbsMagn         12.5873
	SlopeParam      4.89352
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.788 0.787 0.784)

	Surface
	{
		SurfStyle       0.125421
		OceanStyle      0.973638
		Randomize      (-0.896, -0.033, -0.410)
		colorDistMagn   0.532288
		colorDistFreq   0.000867003
		detailScale     38.884
		colorConversion true
		snowLevel       2
		tropicLatitude  0.733826
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.543654
		terraceProb     0.549132
		erosion         0
		montesMagn      0.491083
		montesFreq      3.27097
		montesSpiky     0.867581
		montesFraction  0.399888
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00491029
		hillsFraction   0.733557
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239799
		craterFreq      0.257428
		craterDensity   1.0191
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.535535
		volcanoTemp     1619.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.315, 0.315, 0.314, 0.000)
		colorShelf     (0.335, 0.334, 0.333, 0.000)
		colorBeach     (0.355, 0.354, 0.353, 0.000)
		colorDesert    (0.375, 0.374, 0.372, 0.000)
		colorLowland   (0.394, 0.393, 0.392, 0.000)
		colorUpland    (0.414, 0.413, 0.412, 0.000)
		colorRock      (0.434, 0.433, 0.431, 0.000)
		colorSnow      (0.453, 0.452, 0.451, 1.000)
		BumpHeight      1.28158
		BumpOffset      0.256316
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.393289
		GasToDust   0.25
		Particles   1774
		GasBright   0.300858
		DustBright  0.488004
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   25.3605
		Period          130.088
		Eccentricity    0.980253
		Inclination     83.8539
		AscendingNode   -44.6069
		ArgOfPericenter 43.8791
		MeanAnomaly     18.8327
	}
}

Comet	"C11"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            9.67631e-009
	Radius          30.8419
	InertiaMoment   0.39781

	Oblateness      0.0025542

	RotationPeriod  106.046
	Obliquity       70.1972
	EqAscendNode    338.159

	AbsMagn         8.36672
	SlopeParam      5.57533
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.517 0.514 0.511)

	Surface
	{
		SurfStyle       0.488907
		OceanStyle      0.512611
		Randomize      (-0.946, 0.162, 0.866)
		colorDistMagn   0.320611
		colorDistFreq   0.727711
		detailScale     842.189
		colorConversion true
		snowLevel       2
		tropicLatitude  0.958594
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.729023
		terraceProb     0.222507
		erosion         0
		montesMagn      0.469695
		montesFreq      2.84061
		montesSpiky     0.91835
		montesFraction  0.697846
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.67422
		hillsFraction   0.809615
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234876
		craterFreq      0.243757
		craterDensity   1.04678
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.444905
		volcanoTemp     1800.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.207, 0.206, 0.205, 0.000)
		colorShelf     (0.220, 0.219, 0.217, 0.000)
		colorBeach     (0.233, 0.231, 0.230, 0.000)
		colorDesert    (0.246, 0.244, 0.243, 0.000)
		colorLowland   (0.259, 0.257, 0.256, 0.000)
		colorUpland    (0.272, 0.270, 0.269, 0.000)
		colorRock      (0.285, 0.283, 0.281, 0.000)
		colorSnow      (0.298, 0.296, 0.294, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.874481
		GasToDust   0.25
		Particles   2746
		GasBright   0.208476
		DustBright  0.264873
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   36.3436
		Period          223.173
		Eccentricity    0.979051
		Inclination     -167.523
		AscendingNode   -76.9188
		ArgOfPericenter 83.3727
		MeanAnomaly     40.8804
	}
}

Comet	"C12"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            2.9794e-016
	Radius          0.0881654
	InertiaMoment   0.39964

	Oblateness      0.00218498

	RotationPeriod  100.211
	Obliquity       23.403
	EqAscendNode    322.736

	AbsMagn         4.61597
	SlopeParam      6.52516
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.652 0.559 0.479)

	Surface
	{
		SurfStyle       0.985895
		OceanStyle      0.139509
		Randomize      (-0.191, -0.488, -0.502)
		colorDistMagn   0.53434
		colorDistFreq   4.79626e-006
		detailScale     2.4075
		colorConversion true
		snowLevel       2
		tropicLatitude  0.421373
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.59233
		terraceProb     0.285682
		erosion         0
		montesMagn      0.478072
		montesFreq      2.33198
		montesSpiky     0.989185
		montesFraction  0.719241
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.11927e-005
		hillsFraction   0.620452
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262915
		craterFreq      0.162542
		craterDensity   0.978216
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.582314
		volcanoTemp     1460.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.222, 0.196, 0.192, 0.050)
		colorShelf     (0.261, 0.229, 0.220, 0.040)
		colorBeach     (0.300, 0.263, 0.249, 0.030)
		colorDesert    (0.339, 0.296, 0.283, 0.020)
		colorLowland   (0.378, 0.330, 0.311, 0.030)
		colorUpland    (0.417, 0.363, 0.340, 0.050)
		colorRock      (0.456, 0.397, 0.378, 0.020)
		colorSnow      (0.456, 0.397, 0.378, 1.000)
		BumpHeight      0.0793489
		BumpOffset      0.0158698
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.478412
		DustBright  0.479423
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   33.3451
		Period          196.132
		Eccentricity    0.972153
		Inclination     -5.18624
		AscendingNode   -101.388
		ArgOfPericenter 138.024
		MeanAnomaly     -152.578
	}
}

Comet	"C13"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            2.30435e-012
	Radius          1.91026
	InertiaMoment   0.398457

	Oblateness      0.00315035

	RotationPeriod  95.4944
	Obliquity       336.609
	EqAscendNode    307.314

	AbsMagn         12.2056
	SlopeParam      2.07071
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.815 0.762 0.732)

	Surface
	{
		SurfStyle       0.890806
		OceanStyle      0.565226
		Randomize      (-0.398, -0.456, -0.784)
		colorDistMagn   0.360832
		colorDistFreq   0.00221856
		detailScale     52.1629
		colorConversion true
		snowLevel       2
		tropicLatitude  0.60103
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.668574
		terraceProb     0.147402
		erosion         0
		montesMagn      0.652427
		montesFreq      3.19344
		montesSpiky     0.878533
		montesFraction  0.624777
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0052998
		hillsFraction   0.738667
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.27751
		craterFreq      0.257612
		craterDensity   0.847379
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.515059
		volcanoTemp     1388.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.277, 0.267, 0.293, 0.050)
		colorShelf     (0.326, 0.313, 0.337, 0.040)
		colorBeach     (0.375, 0.358, 0.381, 0.030)
		colorDesert    (0.424, 0.404, 0.432, 0.020)
		colorLowland   (0.473, 0.450, 0.476, 0.030)
		colorUpland    (0.521, 0.496, 0.520, 0.050)
		colorRock      (0.570, 0.541, 0.579, 0.020)
		colorSnow      (0.570, 0.541, 0.579, 1.000)
		BumpHeight      1.71924
		BumpOffset      0.343847
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.426115
		GasToDust   0.25
		Particles   1840
		GasBright   0.0375872
		DustBright  0.604735
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   33.9744
		Period          201.71
		Eccentricity    0.972964
		Inclination     -142.423
		AscendingNode   72.7415
		ArgOfPericenter -84.4449
		MeanAnomaly     33.8753
	}
}

Comet	"C14"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            1.78225e-008
	Radius          34.4416
	InertiaMoment   0.395487

	Oblateness      0.00257281

	RotationPeriod  91.4765
	Obliquity       289.814
	EqAscendNode    291.891

	AbsMagn         8.15761
	SlopeParam      2.83098
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.407 0.404 0.401)

	Surface
	{
		SurfStyle       0.749786
		OceanStyle      0.39664
		Randomize      (-0.395, 0.495, -0.720)
		colorDistMagn   0.906434
		colorDistFreq   0.745
		detailScale     940.485
		colorConversion true
		snowLevel       2
		tropicLatitude  0.911965
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.73552
		terraceProb     0.419092
		erosion         0
		montesMagn      0.335276
		montesFreq      3.38626
		montesSpiky     0.981124
		montesFraction  0.84352
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.79135
		hillsFraction   0.584645
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243205
		craterFreq      0.239824
		craterDensity   0.962394
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.421113
		volcanoTemp     1435.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.159, 0.137, 0.112, 0.000)
		colorShelf     (0.163, 0.141, 0.128, 0.000)
		colorBeach     (0.191, 0.165, 0.152, 0.000)
		colorDesert    (0.207, 0.178, 0.148, 0.000)
		colorLowland   (0.228, 0.190, 0.169, 0.000)
		colorUpland    (0.252, 0.230, 0.205, 0.000)
		colorRock      (0.273, 0.250, 0.221, 0.000)
		colorSnow      (0.297, 0.266, 0.233, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.907307
		GasToDust   0.25
		Particles   2812
		GasBright   0.0384206
		DustBright  0.288388
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   19.9817
		Period          90.9806
		Eccentricity    0.965616
		Inclination     -121.123
		AscendingNode   -136.632
		ArgOfPericenter -56.6843
		MeanAnomaly     119.146
	}
}

Comet	"C15"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            5.48769e-016
	Radius          0.118317
	InertiaMoment   0.398973

	Oblateness      0.00371389

	RotationPeriod  87.9376
	Obliquity       243.02
	EqAscendNode    276.468

	AbsMagn         4.30742
	SlopeParam      3.44925
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.840 0.795 0.712)

	Surface
	{
		SurfStyle       0.896276
		OceanStyle      0.845305
		Randomize      (-0.578, -0.181, -0.545)
		colorDistMagn   0.71867
		colorDistFreq   7.38091e-006
		detailScale     3.23085
		colorConversion true
		snowLevel       2
		tropicLatitude  0.955716
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.532772
		terraceProb     0.332487
		erosion         0
		montesMagn      0.554303
		montesFreq      2.49213
		montesSpiky     0.993589
		montesFraction  0.548177
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.70826e-005
		hillsFraction   0.724353
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224548
		craterFreq      0.252014
		craterDensity   0.958757
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.466452
		volcanoTemp     1676.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.286, 0.278, 0.285, 0.050)
		colorShelf     (0.336, 0.326, 0.327, 0.040)
		colorBeach     (0.386, 0.374, 0.370, 0.030)
		colorDesert    (0.437, 0.422, 0.420, 0.020)
		colorLowland   (0.487, 0.469, 0.463, 0.030)
		colorUpland    (0.538, 0.517, 0.505, 0.050)
		colorRock      (0.588, 0.565, 0.562, 0.020)
		colorSnow      (0.588, 0.565, 0.562, 1.000)
		BumpHeight      0.106486
		BumpOffset      0.0212971
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.143281
		DustBright  0.668014
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   36.6528
		Period          226.028
		Eccentricity    0.985913
		Inclination     -29.1424
		AscendingNode   103.588
		ArgOfPericenter -148.202
		MeanAnomaly     -64.8856
	}
}

Comet	"C16"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            4.24434e-012
	Radius          2.13234
	InertiaMoment   0.397385

	Oblateness      0.00300845

	RotationPeriod  84.7476
	Obliquity       196.226
	EqAscendNode    261.046

	AbsMagn         11.8589
	SlopeParam      4.01801
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.770 0.705 0.653)

	Surface
	{
		SurfStyle       0.380619
		OceanStyle      0.355602
		Randomize      (-0.816, 0.556, -0.028)
		colorDistMagn   0.575428
		colorDistFreq   0.00316981
		detailScale     58.2271
		colorConversion true
		snowLevel       2
		tropicLatitude  0.96107
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.748627
		terraceProb     0.305337
		erosion         0
		montesMagn      0.478854
		montesFreq      2.90675
		montesSpiky     0.794198
		montesFraction  0.571519
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00978931
		hillsFraction   0.87342
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221437
		craterFreq      0.268922
		craterDensity   0.917677
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.514171
		volcanoTemp     1560.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.308, 0.282, 0.261, 0.000)
		colorShelf     (0.327, 0.300, 0.278, 0.000)
		colorBeach     (0.347, 0.317, 0.294, 0.000)
		colorDesert    (0.366, 0.335, 0.310, 0.000)
		colorLowland   (0.385, 0.353, 0.327, 0.000)
		colorUpland    (0.405, 0.370, 0.343, 0.000)
		colorRock      (0.424, 0.388, 0.359, 0.000)
		colorSnow      (0.443, 0.406, 0.376, 1.000)
		BumpHeight      1.91911
		BumpOffset      0.383821
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.458941
		GasToDust   0.25
		Particles   1906
		GasBright   0.116833
		DustBright  0.378949
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   26.1699
		Period          136.365
		Eccentricity    0.972856
		Inclination     -88.2462
		AscendingNode   -27.8596
		ArgOfPericenter 129.131
		MeanAnomaly     -121.183
	}
}

Comet	"C17"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            3.28268e-008
	Radius          46.2385
	InertiaMoment   0.399427

	Oblateness      0.00428743

	RotationPeriod  81.8229
	Obliquity       149.431
	EqAscendNode    245.623

	AbsMagn         7.94893
	SlopeParam      4.58825
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.624 0.411 0.336)

	Surface
	{
		SurfStyle       0.632747
		OceanStyle      0.942913
		Randomize      (0.485, -0.398, 0.712)
		colorDistMagn   0.259839
		colorDistFreq   1.71762
		detailScale     1262.62
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998797
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.511909
		terraceProb     0.114145
		erosion         0
		montesMagn      0.40865
		montesFreq      2.52871
		montesSpiky     0.910416
		montesFraction  0.884305
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.5007
		hillsFraction   0.524321
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240597
		craterFreq      0.249054
		craterDensity   0.800631
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.507642
		volcanoTemp     1338.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.243, 0.140, 0.094, 0.000)
		colorShelf     (0.250, 0.144, 0.108, 0.000)
		colorBeach     (0.293, 0.168, 0.128, 0.000)
		colorDesert    (0.318, 0.181, 0.124, 0.000)
		colorLowland   (0.349, 0.193, 0.141, 0.000)
		colorUpland    (0.387, 0.234, 0.171, 0.000)
		colorRock      (0.418, 0.255, 0.185, 0.000)
		colorSnow      (0.455, 0.271, 0.195, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.940133
		GasToDust   0.25
		Particles   2879
		GasBright   0.288884
		DustBright  0.691384
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   23.4931
		Period          115.987
		Eccentricity    0.975611
		Inclination     -87.0192
		AscendingNode   79.3555
		ArgOfPericenter -162.82
		MeanAnomaly     -34.5573
	}
}

Comet	"C18"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            1.01076e-015
	Radius          0.132013
	InertiaMoment   0.398162

	Oblateness      0.00345055

	RotationPeriod  79.1059
	Obliquity       102.637
	EqAscendNode    230.201

	AbsMagn         3.97516
	SlopeParam      5.21201
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.671 0.586 0.418)

	Surface
	{
		SurfStyle       0.133688
		OceanStyle      0.452086
		Randomize      (0.858, -0.429, 0.567)
		colorDistMagn   0.402893
		colorDistFreq   2.71062e-006
		detailScale     3.60484
		colorConversion true
		snowLevel       2
		tropicLatitude  0.962632
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.532314
		terraceProb     0.501431
		erosion         0
		montesMagn      0.521879
		montesFreq      3.84778
		montesSpiky     0.922597
		montesFraction  0.762883
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.57511e-005
		hillsFraction   0.472421
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253763
		craterFreq      0.244683
		craterDensity   1.00016
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.510905
		volcanoTemp     1506.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.269, 0.234, 0.167, 0.000)
		colorShelf     (0.285, 0.249, 0.178, 0.000)
		colorBeach     (0.302, 0.264, 0.188, 0.000)
		colorDesert    (0.319, 0.278, 0.199, 0.000)
		colorLowland   (0.336, 0.293, 0.209, 0.000)
		colorUpland    (0.353, 0.308, 0.220, 0.000)
		colorRock      (0.369, 0.322, 0.230, 0.000)
		colorSnow      (0.386, 0.337, 0.240, 1.000)
		BumpHeight      0.118812
		BumpOffset      0.0237624
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0105752
		GasToDust   0.25
		Particles   1001
		GasBright   0.235153
		DustBright  0.429602
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   21.9338
		Period          104.634
		Eccentricity    0.968056
		Inclination     176.892
		AscendingNode   171.737
		ArgOfPericenter 149.867
		MeanAnomaly     -129.716
	}
}

Comet	"C19"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            7.81751e-012
	Radius          2.86392
	InertiaMoment   0.399853

	Oblateness      0.00489464

	RotationPeriod  76.5555
	Obliquity       55.8429
	EqAscendNode    214.778

	AbsMagn         11.5389
	SlopeParam      5.98745
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.750 0.747 0.745)

	Surface
	{
		SurfStyle       0.472149
		OceanStyle      0.711907
		Randomize      (0.465, 0.851, -0.472)
		colorDistMagn   0.845985
		colorDistFreq   0.00619804
		detailScale     78.2042
		colorConversion true
		snowLevel       2
		tropicLatitude  0.905172
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.538373
		terraceProb     0.291823
		erosion         0
		montesMagn      0.439972
		montesFreq      2.48303
		montesSpiky     0.940953
		montesFraction  0.579321
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0165181
		hillsFraction   0.474147
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250661
		craterFreq      0.148635
		craterDensity   0.80749
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.520364
		volcanoTemp     1410.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.300, 0.299, 0.298, 0.000)
		colorShelf     (0.319, 0.318, 0.317, 0.000)
		colorBeach     (0.338, 0.336, 0.335, 0.000)
		colorDesert    (0.356, 0.355, 0.354, 0.000)
		colorLowland   (0.375, 0.374, 0.373, 0.000)
		colorUpland    (0.394, 0.392, 0.391, 0.000)
		colorRock      (0.413, 0.411, 0.410, 0.000)
		colorSnow      (0.431, 0.430, 0.429, 1.000)
		BumpHeight      2.57753
		BumpOffset      0.515506
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.491767
		GasToDust   0.25
		Particles   1973
		GasBright   0.144163
		DustBright  0.205078
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   31.7637
		Period          182.347
		Eccentricity    0.978346
		Inclination     170.823
		AscendingNode   168.303
		ArgOfPericenter -95.6558
		MeanAnomaly     77.749
	}
}

Comet	"C20"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            6.04629e-008
	Radius          51.5662
	InertiaMoment   0.398729

	Oblateness      0.00392207

	RotationPeriod  74.141
	Obliquity       9.04857
	EqAscendNode    199.355

	AbsMagn         7.74012
	SlopeParam      7.32709
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.692 0.689 0.685)

	Surface
	{
		SurfStyle       0.67265
		OceanStyle      0.0983683
		Randomize      (-0.878, -0.798, -0.774)
		colorDistMagn   0.937975
		colorDistFreq   0.898973
		detailScale     1408.1
		colorConversion true
		snowLevel       2
		tropicLatitude  0.882367
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.675511
		terraceProb     0.291086
		erosion         0
		montesMagn      0.566347
		montesFreq      3.28933
		montesSpiky     0.968743
		montesFraction  0.534266
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.7124
		hillsFraction   0.592705
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231631
		craterFreq      0.237926
		craterDensity   0.857818
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.492168
		volcanoTemp     1456.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.270, 0.234, 0.192, 0.000)
		colorShelf     (0.277, 0.241, 0.219, 0.000)
		colorBeach     (0.325, 0.282, 0.260, 0.000)
		colorDesert    (0.353, 0.303, 0.253, 0.000)
		colorLowland   (0.387, 0.324, 0.288, 0.000)
		colorUpland    (0.429, 0.393, 0.349, 0.000)
		colorRock      (0.463, 0.427, 0.377, 0.000)
		colorSnow      (0.505, 0.455, 0.397, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.972959
		GasToDust   0.25
		Particles   2945
		GasBright   0.393382
		DustBright  0.440346
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   29.7917
		Period          165.632
		Eccentricity    0.981498
		Inclination     -126.947
		AscendingNode   11.8096
		ArgOfPericenter 45.6467
		MeanAnomaly     25.5739
	}
}

Comet	"C21"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            1.8617e-015
	Radius          0.177387
	InertiaMoment   0.396791

	Oblateness      0.00548285

	RotationPeriod  71.8388
	Obliquity       322.254
	EqAscendNode    183.933

	AbsMagn         3.61252
	SlopeParam      2.47332
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.531 0.526 0.521)

	Surface
	{
		SurfStyle       0.654362
		OceanStyle      0.608232
		Randomize      (0.193, 0.105, -0.200)
		colorDistMagn   0.812091
		colorDistFreq   7.2775e-006
		detailScale     4.84384
		colorConversion true
		snowLevel       2
		tropicLatitude  0.990947
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.705394
		terraceProb     0.427284
		erosion         0
		montesMagn      0.548961
		montesFreq      2.47161
		montesSpiky     0.934341
		montesFraction  0.401514
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000107323
		hillsFraction   0.878941
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.215304
		craterFreq      0.146141
		craterDensity   0.954366
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52112
		volcanoTemp     1179.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.207, 0.179, 0.146, 0.000)
		colorShelf     (0.212, 0.184, 0.167, 0.000)
		colorBeach     (0.249, 0.216, 0.198, 0.000)
		colorDesert    (0.271, 0.231, 0.193, 0.000)
		colorLowland   (0.297, 0.247, 0.219, 0.000)
		colorUpland    (0.329, 0.300, 0.266, 0.000)
		colorRock      (0.355, 0.326, 0.287, 0.000)
		colorSnow      (0.387, 0.347, 0.302, 1.000)
		BumpHeight      0.159648
		BumpOffset      0.0319296
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0434012
		GasToDust   0.25
		Particles   1067
		GasBright   0.0160023
		DustBright  0.502212
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   16.8875
		Period          70.6884
		Eccentricity    0.962223
		Inclination     -63.6978
		AscendingNode   27.9799
		ArgOfPericenter 95.4445
		MeanAnomaly     22.3557
	}
}

Comet	"C22"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            1.43989e-011
	Radius          3.19226
	InertiaMoment   0.399208

	Oblateness      0.00443791

	RotationPeriod  69.6302
	Obliquity       275.46
	EqAscendNode    168.51

	AbsMagn         11.2401
	SlopeParam      3.1461
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.680 0.677 0.676)

	Surface
	{
		SurfStyle       0.358076
		OceanStyle      0.0623336
		Randomize      (0.578, -0.656, -0.326)
		colorDistMagn   0.919367
		colorDistFreq   0.00658864
		detailScale     87.1701
		colorConversion true
		snowLevel       2
		tropicLatitude  0.892236
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.66306
		terraceProb     0.216573
		erosion         0
		montesMagn      0.412254
		montesFreq      2.81077
		montesSpiky     0.907569
		montesFraction  0.137789
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0282629
		hillsFraction   0.656657
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226858
		craterFreq      0.226038
		craterDensity   0.862711
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.525135
		volcanoTemp     1650.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.272, 0.271, 0.270, 0.000)
		colorShelf     (0.289, 0.288, 0.287, 0.000)
		colorBeach     (0.306, 0.305, 0.304, 0.000)
		colorDesert    (0.323, 0.322, 0.321, 0.000)
		colorLowland   (0.340, 0.339, 0.338, 0.000)
		colorUpland    (0.357, 0.356, 0.355, 0.000)
		colorRock      (0.374, 0.373, 0.372, 0.000)
		colorSnow      (0.391, 0.389, 0.389, 1.000)
		BumpHeight      2.87304
		BumpOffset      0.574607
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.524593
		GasToDust   0.25
		Particles   2039
		GasBright   0.0182279
		DustBright  0.184473
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   31.6465
		Period          181.338
		Eccentricity    0.984103
		Inclination     -35.6065
		AscendingNode   -24.1301
		ArgOfPericenter 105.521
		MeanAnomaly     126.528
	}
}

Comet	"C23"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            1.11365e-007
	Radius          69.3237
	InertiaMoment   0.39782

	Oblateness      0.0062206

	RotationPeriod  67.5002
	Obliquity       228.666
	EqAscendNode    153.088

	AbsMagn         7.53059
	SlopeParam      3.73242
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.608 0.601 0.598)

	Surface
	{
		SurfStyle       0.41996
		OceanStyle      0.297444
		Randomize      (0.516, 0.859, 0.082)
		colorDistMagn   0.324434
		colorDistFreq   1.50475
		detailScale     1893
		colorConversion true
		snowLevel       2
		tropicLatitude  0.96131
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.479491
		terraceProb     0.310413
		erosion         0
		montesMagn      0.468263
		montesFreq      3.22615
		montesSpiky     0.907369
		montesFraction  0.620522
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.5291
		hillsFraction   0.760336
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255948
		craterFreq      0.229212
		craterDensity   0.849598
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.529065
		volcanoTemp     1204.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.243, 0.241, 0.239, 0.000)
		colorShelf     (0.259, 0.256, 0.254, 0.000)
		colorBeach     (0.274, 0.271, 0.269, 0.000)
		colorDesert    (0.289, 0.286, 0.284, 0.000)
		colorLowland   (0.304, 0.301, 0.299, 0.000)
		colorUpland    (0.319, 0.316, 0.314, 0.000)
		colorRock      (0.335, 0.331, 0.329, 0.000)
		colorSnow      (0.350, 0.346, 0.344, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.102371
		DustBright  0.584817
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   27.7294
		Period          148.734
		Eccentricity    0.975894
		Inclination     -52.2943
		AscendingNode   102.489
		ArgOfPericenter 46.6038
		MeanAnomaly     64.9103
	}
}

Comet	"C24"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            3.42902e-015
	Radius          0.197614
	InertiaMoment   0.399645

	Oblateness      0.00501373

	RotationPeriod  65.4364
	Obliquity       181.871
	EqAscendNode    137.665

	AbsMagn         3.20969
	SlopeParam      4.29616
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.835 0.786 0.704)

	Surface
	{
		SurfStyle       0.420953
		OceanStyle      0.530716
		Randomize      (-0.238, -0.927, -0.783)
		colorDistMagn   0.24118
		colorDistFreq   6.47747e-006
		detailScale     5.39617
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997098
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.344973
		terraceProb     0.232193
		erosion         0
		montesMagn      0.406629
		montesFreq      2.80772
		montesSpiky     0.869105
		montesFraction  0.397358
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.88141e-005
		hillsFraction   0.62104
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232159
		craterFreq      0.239486
		craterDensity   1.01552
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49228
		volcanoTemp     1445.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.334, 0.315, 0.282, 0.000)
		colorShelf     (0.355, 0.334, 0.299, 0.000)
		colorBeach     (0.376, 0.354, 0.317, 0.000)
		colorDesert    (0.396, 0.374, 0.334, 0.000)
		colorLowland   (0.417, 0.393, 0.352, 0.000)
		colorUpland    (0.438, 0.413, 0.370, 0.000)
		colorRock      (0.459, 0.433, 0.387, 0.000)
		colorSnow      (0.480, 0.452, 0.405, 1.000)
		BumpHeight      0.177852
		BumpOffset      0.0355705
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0762272
		GasToDust   0.25
		Particles   1133
		GasBright   0.077314
		DustBright  0.29436
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   35.131
		Period          212.098
		Eccentricity    0.986858
		Inclination     -86.9611
		AscendingNode   44.8051
		ArgOfPericenter -166.828
		MeanAnomaly     38.9474
	}
}

Comet	"C25"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            2.6521e-011
	Radius          4.29383
	InertiaMoment   0.398465

	Oblateness      0.00704648

	RotationPeriod  63.4284
	Obliquity       135.077
	EqAscendNode    122.242

	AbsMagn         10.9584
	SlopeParam      4.885
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.820 0.798 0.766)

	Surface
	{
		SurfStyle       0.722202
		OceanStyle      0.87829
		Randomize      (-0.035, -0.810, -0.722)
		colorDistMagn   0.0266263
		colorDistFreq   0.00738233
		detailScale     117.25
		colorConversion true
		snowLevel       2
		tropicLatitude  0.339076
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.420269
		terraceProb     0.277175
		erosion         0
		montesMagn      0.627665
		montesFreq      2.29693
		montesSpiky     0.973308
		montesFraction  0.503219
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.04028
		hillsFraction   0.828817
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.201232
		craterFreq      0.185938
		craterDensity   0.971819
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.489779
		volcanoTemp     1480.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.271, 0.215, 0.000)
		colorShelf     (0.328, 0.279, 0.245, 0.000)
		colorBeach     (0.385, 0.327, 0.291, 0.000)
		colorDesert    (0.418, 0.351, 0.284, 0.000)
		colorLowland   (0.459, 0.375, 0.322, 0.000)
		colorUpland    (0.508, 0.455, 0.391, 0.000)
		colorRock      (0.549, 0.495, 0.421, 0.000)
		colorSnow      (0.598, 0.527, 0.444, 1.000)
		BumpHeight      3.86445
		BumpOffset      0.772889
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.557419
		GasToDust   0.25
		Particles   2105
		GasBright   0.228647
		DustBright  0.627514
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   20.1062
		Period          91.832
		Eccentricity    0.983307
		Inclination     133.519
		AscendingNode   152.256
		ArgOfPericenter 34.8649
		MeanAnomaly     -163.225
	}
}

Comet	"C26"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            2.05121e-007
	Radius          77.1823
	InertiaMoment   0.395552

	Oblateness      0.00557326

	RotationPeriod  61.4673
	Obliquity       88.2828
	EqAscendNode    106.82

	AbsMagn         7.31976
	SlopeParam      5.56482
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.655 0.651 0.650)

	Surface
	{
		SurfStyle       0.465621
		OceanStyle      0.322017
		Randomize      (-0.146, -0.948, 0.975)
		colorDistMagn   0.186819
		colorDistFreq   2.07216
		detailScale     2107.59
		colorConversion true
		snowLevel       2
		tropicLatitude  0.962356
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.555766
		terraceProb     0.236241
		erosion         0
		montesMagn      0.561794
		montesFreq      2.47063
		montesSpiky     0.859777
		montesFraction  0.388978
		dunesFraction   0
		hillsMagn       0
		hillsFreq       13.7827
		hillsFraction   0.736366
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254735
		craterFreq      0.269701
		craterDensity   0.779158
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.500466
		volcanoTemp     1331.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.262, 0.261, 0.260, 0.000)
		colorShelf     (0.279, 0.277, 0.276, 0.000)
		colorBeach     (0.295, 0.293, 0.292, 0.000)
		colorDesert    (0.311, 0.309, 0.309, 0.000)
		colorLowland   (0.328, 0.326, 0.325, 0.000)
		colorUpland    (0.344, 0.342, 0.341, 0.000)
		colorRock      (0.360, 0.358, 0.357, 0.000)
		colorSnow      (0.377, 0.375, 0.374, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.176308
		DustBright  0.364339
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   24.1398
		Period          120.809
		Eccentricity    0.970369
		Inclination     14.1656
		AscendingNode   172.893
		ArgOfPericenter 175.117
		MeanAnomaly     -120.771
	}
}

Comet	"C27"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            6.31581e-015
	Radius          0.265955
	InertiaMoment   0.398979

	Oblateness      0.00799341

	RotationPeriod  59.5454
	Obliquity       41.4885
	EqAscendNode    91.3973

	AbsMagn         2.75134
	SlopeParam      6.50813
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.499 0.495 0.488)

	Surface
	{
		SurfStyle       0.878233
		OceanStyle      0.339632
		Randomize      (0.342, 0.956, 0.091)
		colorDistMagn   0.319565
		colorDistFreq   3.97688e-005
		detailScale     7.26234
		colorConversion true
		snowLevel       2
		tropicLatitude  0.555661
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.560715
		terraceProb     0.421099
		erosion         0
		montesMagn      0.609061
		montesFreq      2.95282
		montesSpiky     0.960109
		montesFraction  0.659066
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000121654
		hillsFraction   0.431876
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254264
		craterFreq      0.20226
		craterDensity   0.921495
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.568621
		volcanoTemp     1893.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.170, 0.173, 0.195, 0.050)
		colorShelf     (0.200, 0.203, 0.225, 0.040)
		colorBeach     (0.230, 0.233, 0.254, 0.030)
		colorDesert    (0.260, 0.263, 0.288, 0.020)
		colorLowland   (0.289, 0.292, 0.317, 0.030)
		colorUpland    (0.319, 0.322, 0.347, 0.050)
		colorRock      (0.349, 0.352, 0.386, 0.020)
		colorSnow      (0.349, 0.352, 0.386, 1.000)
		BumpHeight      0.239359
		BumpOffset      0.0478719
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.109053
		GasToDust   0.25
		Particles   1200
		GasBright   0.0867106
		DustBright  0.138423
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   21.954
		Period          104.778
		Eccentricity    0.969999
		Inclination     -21.2476
		AscendingNode   56.2901
		ArgOfPericenter -112.356
		MeanAnomaly     -2.08023
	}
}

Comet	"C28"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            4.88482e-011
	Radius          4.7775
	InertiaMoment   0.397397

	Oblateness      0.00635219

	RotationPeriod  57.6559
	Obliquity       354.694
	EqAscendNode    75.9747

	AbsMagn         10.6907
	SlopeParam      2.05839
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.697 0.635 0.557)

	Surface
	{
		SurfStyle       0.673342
		OceanStyle      0.262395
		Randomize      (-0.380, -0.583, 0.119)
		colorDistMagn   0.867762
		colorDistFreq   0.0128354
		detailScale     130.458
		colorConversion true
		snowLevel       2
		tropicLatitude  0.369127
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.463499
		terraceProb     0.243626
		erosion         0
		montesMagn      0.484324
		montesFreq      2.79245
		montesSpiky     0.854139
		montesFraction  0.648054
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0663832
		hillsFraction   0.581607
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245889
		craterFreq      0.214347
		craterDensity   0.916435
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.609632
		volcanoTemp     1582.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.272, 0.216, 0.156, 0.000)
		colorShelf     (0.279, 0.222, 0.178, 0.000)
		colorBeach     (0.328, 0.260, 0.212, 0.000)
		colorDesert    (0.356, 0.279, 0.206, 0.000)
		colorLowland   (0.390, 0.298, 0.234, 0.000)
		colorUpland    (0.432, 0.362, 0.284, 0.000)
		colorRock      (0.467, 0.393, 0.307, 0.000)
		colorSnow      (0.509, 0.419, 0.323, 1.000)
		BumpHeight      4.29975
		BumpOffset      0.85995
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.590245
		GasToDust   0.25
		Particles   2172
		GasBright   0.315211
		DustBright  0.39441
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   25.3273
		Period          129.833
		Eccentricity    0.984784
		Inclination     -26.4233
		AscendingNode   156.32
		ArgOfPericenter 11.4098
		MeanAnomaly     113.51
	}
}

Comet	"C29"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            3.77806e-007
	Radius          103.938
	InertiaMoment   0.399433

	Oblateness      0.00910059

	RotationPeriod  55.7926
	Obliquity       307.9
	EqAscendNode    60.5521

	AbsMagn         7.10703
	SlopeParam      2.82181
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.666 0.660 0.658)

	Surface
	{
		SurfStyle       0.598612
		OceanStyle      0.396356
		Randomize      (-0.831, 0.630, 0.707)
		colorDistMagn   0.643945
		colorDistFreq   5.95334
		detailScale     2838.19
		colorConversion true
		snowLevel       2
		tropicLatitude  0.850682
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.620097
		terraceProb     0.271321
		erosion         0
		montesMagn      0.489733
		montesFreq      3.09489
		montesSpiky     0.974709
		montesFraction  0.459203
		dunesFraction   0
		hillsMagn       0
		hillsFreq       14.1491
		hillsFraction   0.769661
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253297
		craterFreq      0.373825
		craterDensity   0.808829
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.477874
		volcanoTemp     1416.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.260, 0.224, 0.184, 0.000)
		colorShelf     (0.266, 0.231, 0.211, 0.000)
		colorBeach     (0.313, 0.271, 0.250, 0.000)
		colorDesert    (0.340, 0.290, 0.244, 0.000)
		colorLowland   (0.373, 0.310, 0.276, 0.000)
		colorUpland    (0.413, 0.376, 0.336, 0.000)
		colorRock      (0.446, 0.409, 0.362, 0.000)
		colorSnow      (0.486, 0.436, 0.382, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0012776
		DustBright  0.392829
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   26.7648
		Period          141.041
		Eccentricity    0.970182
		Inclination     173.772
		AscendingNode   6.95592
		ArgOfPericenter 74.6854
		MeanAnomaly     -127.691
	}
}

Comet	"C30"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            1.16329e-014
	Radius          0.295708
	InertiaMoment   0.39817

	Oblateness      0.00724494

	RotationPeriod  53.95
	Obliquity       261.106
	EqAscendNode    45.1295

	AbsMagn         2.2113
	SlopeParam      3.44124
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.649 0.644 0.640)

	Surface
	{
		SurfStyle       0.512289
		OceanStyle      0.887265
		Randomize      (0.143, -0.351, -0.934)
		colorDistMagn   0.748845
		colorDistFreq   6.35869e-005
		detailScale     8.07481
		colorConversion true
		snowLevel       2
		tropicLatitude  0.960647
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.715625
		terraceProb     0.124017
		erosion         0
		montesMagn      0.466173
		montesFreq      2.55219
		montesSpiky     0.993771
		montesFraction  0.482744
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000217662
		hillsFraction   0.561546
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241842
		craterFreq      0.174507
		craterDensity   0.861239
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.496438
		volcanoTemp     929.357
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.253, 0.219, 0.179, 0.000)
		colorShelf     (0.260, 0.225, 0.205, 0.000)
		colorBeach     (0.305, 0.264, 0.243, 0.000)
		colorDesert    (0.331, 0.283, 0.237, 0.000)
		colorLowland   (0.364, 0.303, 0.269, 0.000)
		colorUpland    (0.403, 0.367, 0.326, 0.000)
		colorRock      (0.435, 0.399, 0.352, 0.000)
		colorSnow      (0.474, 0.425, 0.371, 1.000)
		BumpHeight      0.266138
		BumpOffset      0.0532275
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.141879
		GasToDust   0.25
		Particles   1266
		GasBright   0.054725
		DustBright  0.823869
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   19.7505
		Period          89.406
		Eccentricity    0.961152
		Inclination     -152.219
		AscendingNode   -25.8073
		ArgOfPericenter -131.154
		MeanAnomaly     149.307
	}
}

Comet	"C31"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            8.99724e-011
	Radius          6.43784
	InertiaMoment   0.399859

	Oblateness      0.0104213

	RotationPeriod  52.1229
	Obliquity       214.311
	EqAscendNode    29.7069

	AbsMagn         10.4345
	SlopeParam      4.01029
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.711 0.708 0.703)

	Surface
	{
		SurfStyle       0.764886
		OceanStyle      0.448524
		Randomize      (-0.211, 0.092, -0.096)
		colorDistMagn   0.727583
		colorDistFreq   0.0179653
		detailScale     175.796
		colorConversion true
		snowLevel       2
		tropicLatitude  0.766997
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.707829
		terraceProb     0.36582
		erosion         0
		montesMagn      0.414275
		montesFreq      3.13269
		montesSpiky     0.939091
		montesFraction  0.715864
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.116022
		hillsFraction   0.432554
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252553
		craterFreq      0.223758
		craterDensity   0.838545
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.575882
		volcanoTemp     1519.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.277, 0.241, 0.197, 0.000)
		colorShelf     (0.284, 0.248, 0.225, 0.000)
		colorBeach     (0.334, 0.290, 0.267, 0.000)
		colorDesert    (0.363, 0.312, 0.260, 0.000)
		colorLowland   (0.398, 0.333, 0.295, 0.000)
		colorUpland    (0.441, 0.404, 0.359, 0.000)
		colorRock      (0.477, 0.439, 0.387, 0.000)
		colorSnow      (0.519, 0.467, 0.408, 1.000)
		BumpHeight      5.79405
		BumpOffset      1.15881
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.623071
		GasToDust   0.25
		Particles   2238
		GasBright   0.0683198
		DustBright  0.49476
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   23.844
		Period          118.596
		Eccentricity    0.978123
		Inclination     145.624
		AscendingNode   97.2337
		ArgOfPericenter -57.4893
		MeanAnomaly     55.7941
	}
}

Comet	"C32"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            6.95871e-007
	Radius          115.479
	InertiaMoment   0.398735

	Oblateness      0.00831336

	RotationPeriod  50.3063
	Obliquity       167.517
	EqAscendNode    14.2843

	AbsMagn         6.89174
	SlopeParam      4.58019
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.500 0.493 0.490)

	Surface
	{
		SurfStyle       0.514638
		OceanStyle      0.944783
		Randomize      (0.297, -0.560, 0.047)
		colorDistMagn   0.533827
		colorDistFreq   8.57274
		detailScale     3153.36
		colorConversion true
		snowLevel       2
		tropicLatitude  0.926802
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.484247
		terraceProb     0.148097
		erosion         0
		montesMagn      0.532217
		montesFreq      3.07285
		montesSpiky     0.914406
		montesFraction  0.66188
		dunesFraction   0
		hillsMagn       0
		hillsFreq       17.9119
		hillsFraction   0.800227
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251156
		craterFreq      0.476448
		craterDensity   0.994616
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.502032
		volcanoTemp     1757.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.195, 0.168, 0.137, 0.000)
		colorShelf     (0.200, 0.172, 0.157, 0.000)
		colorBeach     (0.235, 0.202, 0.186, 0.000)
		colorDesert    (0.255, 0.217, 0.181, 0.000)
		colorLowland   (0.280, 0.232, 0.206, 0.000)
		colorUpland    (0.310, 0.281, 0.250, 0.000)
		colorRock      (0.335, 0.305, 0.270, 0.000)
		colorSnow      (0.365, 0.325, 0.284, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0446555
		DustBright  0.202911
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   34.4711
		Period          206.15
		Eccentricity    0.983331
		Inclination     106.571
		AscendingNode   -117.944
		ArgOfPericenter -103.336
		MeanAnomaly     99.6563
	}
}

Comet	"C33"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            2.14264e-014
	Radius          0.398757
	InertiaMoment   0.39681

	Oblateness      0.011876

	RotationPeriod  48.4956
	Obliquity       120.723
	EqAscendNode    358.862

	AbsMagn         1.53853
	SlopeParam      5.20276
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.761 0.729 0.685)

	Surface
	{
		SurfStyle       0.66972
		OceanStyle      0.389486
		Randomize      (0.180, 0.710, 0.591)
		colorDistMagn   0.659347
		colorDistFreq   9.24814e-005
		detailScale     10.8887
		colorConversion true
		snowLevel       2
		tropicLatitude  0.830468
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.655246
		terraceProb     0.369621
		erosion         0
		montesMagn      0.513332
		montesFreq      3.49376
		montesSpiky     0.891221
		montesFraction  0.688278
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000356831
		hillsFraction   0.400567
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231604
		craterFreq      0.202625
		craterDensity   0.880124
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.36315
		volcanoTemp     1565.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.297, 0.248, 0.192, 0.000)
		colorShelf     (0.304, 0.255, 0.219, 0.000)
		colorBeach     (0.358, 0.299, 0.260, 0.000)
		colorDesert    (0.388, 0.321, 0.254, 0.000)
		colorLowland   (0.426, 0.343, 0.288, 0.000)
		colorUpland    (0.472, 0.416, 0.350, 0.000)
		colorRock      (0.510, 0.452, 0.377, 0.000)
		colorSnow      (0.555, 0.481, 0.397, 1.000)
		BumpHeight      0.358881
		BumpOffset      0.0717762
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.174705
		GasToDust   0.25
		Particles   1332
		GasBright   0.17527
		DustBright  0.556783
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   23.8591
		Period          118.708
		Eccentricity    0.982294
		Inclination     111.866
		AscendingNode   20.4875
		ArgOfPericenter -68.6238
		MeanAnomaly     -83.4932
	}
}

Comet	"C34"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            1.65718e-010
	Radius          7.14695
	InertiaMoment   0.399214

	Oblateness      0.00962574

	RotationPeriod  46.6861
	Obliquity       73.9284
	EqAscendNode    343.439

	AbsMagn         10.188
	SlopeParam      5.97485
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.727 0.725 0.724)

	Surface
	{
		SurfStyle       0.0691077
		OceanStyle      0.717466
		Randomize      (0.440, -0.313, 0.211)
		colorDistMagn   0.594108
		colorDistFreq   0.0400399
		detailScale     195.159
		colorConversion true
		snowLevel       2
		tropicLatitude  0.987079
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.723604
		terraceProb     0.284742
		erosion         0
		montesMagn      0.64352
		montesFreq      2.15646
		montesSpiky     0.940162
		montesFraction  0.543487
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.140056
		hillsFraction   0.686625
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224433
		craterFreq      0.228303
		craterDensity   1.05444
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.438625
		volcanoTemp     1756.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.291, 0.290, 0.289, 0.000)
		colorShelf     (0.309, 0.308, 0.308, 0.000)
		colorBeach     (0.327, 0.326, 0.326, 0.000)
		colorDesert    (0.345, 0.344, 0.344, 0.000)
		colorLowland   (0.363, 0.362, 0.362, 0.000)
		colorUpland    (0.382, 0.380, 0.380, 0.000)
		colorRock      (0.400, 0.399, 0.398, 0.000)
		colorSnow      (0.418, 0.417, 0.416, 1.000)
		BumpHeight      6.43226
		BumpOffset      1.28645
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.655897
		GasToDust   0.25
		Particles   2304
		GasBright   0.124324
		DustBright  0.292216
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   17.8214
		Period          76.6324
		Eccentricity    0.959278
		Inclination     98.102
		AscendingNode   -102.09
		ArgOfPericenter 24.7506
		MeanAnomaly     -40.2456
	}
}

Comet	"C35"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            5.10257e-018
	Radius          0.0246988
	InertiaMoment   0.397829

	Oblateness      0.0138939

	RotationPeriod  44.8733
	Obliquity       27.1341
	EqAscendNode    328.017

	AbsMagn         6.67319
	SlopeParam      7.29669
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.644 0.642 0.641)

	Surface
	{
		SurfStyle       0.255317
		OceanStyle      0.165403
		Randomize      (-0.001, 0.815, 0.366)
		colorDistMagn   0.482027
		colorDistFreq   3.96737e-007
		detailScale     0.674443
		colorConversion true
		snowLevel       2
		tropicLatitude  0.884177
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.592961
		terraceProb     0.182627
		erosion         0
		montesMagn      0.332884
		montesFreq      3.15611
		montesSpiky     0.938394
		montesFraction  0.359161
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.66141e-006
		hillsFraction   0.548762
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246661
		craterFreq      0.241802
		craterDensity   0.967781
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.526162
		volcanoTemp     1265.24
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.258, 0.257, 0.256, 0.000)
		colorShelf     (0.274, 0.273, 0.272, 0.000)
		colorBeach     (0.290, 0.289, 0.288, 0.000)
		colorDesert    (0.306, 0.305, 0.304, 0.000)
		colorLowland   (0.322, 0.321, 0.320, 0.000)
		colorUpland    (0.338, 0.337, 0.336, 0.000)
		colorRock      (0.354, 0.353, 0.352, 0.000)
		colorSnow      (0.370, 0.369, 0.368, 1.000)
		BumpHeight      0.022229
		BumpOffset      0.00444579
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.322129
		DustBright  0.578897
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   42.1847
		Period          279.083
		Eccentricity    0.986599
		Inclination     96.8948
		AscendingNode   -37.2698
		ArgOfPericenter -145.276
		MeanAnomaly     67.7453
	}
}

Comet	"C36"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            3.94647e-014
	Radius          0.442293
	InertiaMoment   0.39965

	Oblateness      0.0112837

	RotationPeriod  43.0526
	Obliquity       340.34
	EqAscendNode    312.594

	AbsMagn         0.60834
	SlopeParam      2.46297
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.653 0.570 0.525)

	Surface
	{
		SurfStyle       0.0103334
		OceanStyle      0.507278
		Randomize      (0.679, -0.847, 0.607)
		colorDistMagn   0.983323
		colorDistFreq   0.000152361
		detailScale     12.0775
		colorConversion true
		snowLevel       2
		tropicLatitude  0.598525
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.53005
		terraceProb     0.116735
		erosion         0
		montesMagn      0.543747
		montesFreq      2.97301
		montesSpiky     0.950936
		montesFraction  0.85571
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000407423
		hillsFraction   0.554023
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262215
		craterFreq      0.255289
		craterDensity   0.93516
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.527523
		volcanoTemp     1106.92
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.261, 0.228, 0.210, 0.000)
		colorShelf     (0.278, 0.242, 0.223, 0.000)
		colorBeach     (0.294, 0.257, 0.236, 0.000)
		colorDesert    (0.310, 0.271, 0.249, 0.000)
		colorLowland   (0.327, 0.285, 0.263, 0.000)
		colorUpland    (0.343, 0.299, 0.276, 0.000)
		colorRock      (0.359, 0.314, 0.289, 0.000)
		colorSnow      (0.376, 0.328, 0.302, 1.000)
		BumpHeight      0.398064
		BumpOffset      0.0796128
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.207531
		GasToDust   0.25
		Particles   1399
		GasBright   0.2439
		DustBright  0.341613
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   36.5423
		Period          225.007
		Eccentricity    0.972738
		Inclination     -43.5328
		AscendingNode   120.723
		ArgOfPericenter 144.341
		MeanAnomaly     156.1
	}
}

Comet	"C37"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            3.05231e-010
	Radius          9.65266
	InertiaMoment   0.398472

	Oblateness      0.0164711

	RotationPeriod  41.219
	Obliquity       293.546
	EqAscendNode    297.171

	AbsMagn         9.94944
	SlopeParam      3.13763
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.664 0.564 0.392)

	Surface
	{
		SurfStyle       0.746279
		OceanStyle      0.673229
		Randomize      (0.602, -0.491, 0.660)
		colorDistMagn   0.183267
		colorDistFreq   0.0527128
		detailScale     263.582
		colorConversion true
		snowLevel       2
		tropicLatitude  0.897814
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.609162
		terraceProb     0.335753
		erosion         0
		montesMagn      0.350057
		montesFreq      2.2292
		montesSpiky     0.934237
		montesFraction  0.473237
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.114833
		hillsFraction   0.715535
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237915
		craterFreq      0.222476
		craterDensity   0.901403
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.452185
		volcanoTemp     1142.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.259, 0.192, 0.110, 0.000)
		colorShelf     (0.266, 0.197, 0.125, 0.000)
		colorBeach     (0.312, 0.231, 0.149, 0.000)
		colorDesert    (0.339, 0.248, 0.145, 0.000)
		colorLowland   (0.372, 0.265, 0.165, 0.000)
		colorUpland    (0.412, 0.322, 0.200, 0.000)
		colorRock      (0.445, 0.350, 0.216, 0.000)
		colorSnow      (0.485, 0.372, 0.227, 1.000)
		BumpHeight      8.68739
		BumpOffset      1.73748
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.688723
		GasToDust   0.25
		Particles   2371
		GasBright   0.128413
		DustBright  0.141587
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   39.6651
		Period          254.456
		Eccentricity    0.989842
		Inclination     -129.228
		AscendingNode   167.389
		ArgOfPericenter 81.1343
		MeanAnomaly     93.3675
	}
}

Comet	"C38"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            9.3983e-018
	Radius          0.0273697
	InertiaMoment   0.395612

	Oblateness      0.013226

	RotationPeriod  39.3678
	Obliquity       246.751
	EqAscendNode    281.749

	AbsMagn         6.4506
	SlopeParam      3.72463
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.754 0.752 0.751)

	Surface
	{
		SurfStyle       0.377261
		OceanStyle      0.810187
		Randomize      (-0.597, 0.620, -0.798)
		colorDistMagn   0.760625
		colorDistFreq   3.26593e-007
		detailScale     0.747374
		colorConversion true
		snowLevel       2
		tropicLatitude  0.933524
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.581247
		terraceProb     0.728485
		erosion         0
		montesMagn      0.464426
		montesFreq      3.35213
		montesSpiky     0.962275
		montesFraction  0.460799
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.23866e-006
		hillsFraction   0.524754
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227606
		craterFreq      0.273587
		craterDensity   0.855585
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.472806
		volcanoTemp     1849.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.302, 0.301, 0.301, 0.000)
		colorShelf     (0.320, 0.320, 0.319, 0.000)
		colorBeach     (0.339, 0.339, 0.338, 0.000)
		colorDesert    (0.358, 0.357, 0.357, 0.000)
		colorLowland   (0.377, 0.376, 0.376, 0.000)
		colorUpland    (0.396, 0.395, 0.395, 0.000)
		colorRock      (0.415, 0.414, 0.413, 0.000)
		colorSnow      (0.434, 0.433, 0.432, 1.000)
		BumpHeight      0.0246327
		BumpOffset      0.00492654
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0261422
		DustBright  0.728344
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   23.6666
		Period          117.275
		Eccentricity    0.959097
		Inclination     -168.221
		AscendingNode   81.4467
		ArgOfPericenter -48.7749
		MeanAnomaly     -131.868
	}
}

Comet	"C39"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            7.26892e-014
	Radius          0.597886
	InertiaMoment   0.398985

	Oblateness      0.0199031

	RotationPeriod  37.4933
	Obliquity       199.957
	EqAscendNode    266.326

	AbsMagn         -1.09387
	SlopeParam      4.28836
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.808 0.766 0.732)

	Surface
	{
		SurfStyle       0.0349075
		OceanStyle      0.589068
		Randomize      (0.357, -0.492, -0.950)
		colorDistMagn   0.142407
		colorDistFreq   0.000254139
		detailScale     16.3263
		colorConversion true
		snowLevel       2
		tropicLatitude  0.413665
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.633144
		terraceProb     0.146076
		erosion         0
		montesMagn      0.492704
		montesFreq      2.90559
		montesSpiky     0.955397
		montesFraction  0.460458
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000645902
		hillsFraction   0.578476
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.198498
		craterFreq      0.195064
		craterDensity   1.06179
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.479586
		volcanoTemp     1967.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.323, 0.306, 0.293, 0.000)
		colorShelf     (0.343, 0.325, 0.311, 0.000)
		colorBeach     (0.364, 0.345, 0.330, 0.000)
		colorDesert    (0.384, 0.364, 0.348, 0.000)
		colorLowland   (0.404, 0.383, 0.366, 0.000)
		colorUpland    (0.424, 0.402, 0.385, 0.000)
		colorRock      (0.444, 0.421, 0.403, 0.000)
		colorSnow      (0.465, 0.440, 0.421, 1.000)
		BumpHeight      0.538098
		BumpOffset      0.10762
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.240357
		GasToDust   0.25
		Particles   1465
		GasBright   0.0411293
		DustBright  0.397843
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   21.573
		Period          102.062
		Eccentricity    0.966478
		Inclination     170.554
		AscendingNode   -107.427
		ArgOfPericenter -141.219
		MeanAnomaly     165.681
	}
}

Comet	"C40"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            5.62199e-010
	Radius          10.6855
	InertiaMoment   0.39741

	Oblateness      0.0162075

	RotationPeriod  35.59
	Obliquity       153.163
	EqAscendNode    250.904

	AbsMagn         9.71766
	SlopeParam      4.8765
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.660 0.516 0.437)

	Surface
	{
		SurfStyle       0.873888
		OceanStyle      0.300913
		Randomize      (0.679, -0.832, -0.434)
		colorDistMagn   0.771468
		colorDistFreq   0.0308022
		detailScale     291.785
		colorConversion true
		snowLevel       2
		tropicLatitude  0.281012
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.741693
		terraceProb     0.269374
		erosion         0
		montesMagn      0.593656
		montesFreq      2.8212
		montesSpiky     0.975658
		montesFraction  0.346375
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.274581
		hillsFraction   0.620618
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.285671
		craterFreq      0.237903
		craterDensity   0.893596
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.515419
		volcanoTemp     1490.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.224, 0.181, 0.175, 0.050)
		colorShelf     (0.264, 0.212, 0.201, 0.040)
		colorBeach     (0.304, 0.242, 0.227, 0.030)
		colorDesert    (0.343, 0.273, 0.258, 0.020)
		colorLowland   (0.383, 0.304, 0.284, 0.030)
		colorUpland    (0.423, 0.335, 0.310, 0.050)
		colorRock      (0.462, 0.366, 0.345, 0.020)
		colorSnow      (0.462, 0.366, 0.345, 1.000)
		BumpHeight      9.61694
		BumpOffset      1.92339
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.721549
		GasToDust   0.25
		Particles   2437
		GasBright   0.141049
		DustBright  0.782411
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   29.9095
		Period          166.615
		Eccentricity    0.978989
		Inclination     42.7468
		AscendingNode   6.53602
		ArgOfPericenter -108.552
		MeanAnomaly     -37.6258
	}
}

Comet	"C41"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            1.73105e-017
	Radius          0.0370332
	InertiaMoment   0.399438

	Oblateness      0.0246969

	RotationPeriod  33.6513
	Obliquity       106.368
	EqAscendNode    235.481

	AbsMagn         6.2231
	SlopeParam      5.55437
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.616 0.613 0.608)

	Surface
	{
		SurfStyle       0.802986
		OceanStyle      0.356516
		Randomize      (0.228, 0.851, -0.092)
		colorDistMagn   0.799367
		colorDistFreq   1.08381e-006
		detailScale     1.01125
		colorConversion true
		snowLevel       2
		tropicLatitude  0.97337
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.456727
		terraceProb     0.250593
		erosion         0
		montesMagn      0.511705
		montesFreq      3.02151
		montesSpiky     0.968149
		montesFraction  0.32486
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.3637e-006
		hillsFraction   0.50428
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.275222
		craterFreq      0.166695
		craterDensity   0.829823
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.470013
		volcanoTemp     1376.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.240, 0.208, 0.170, 0.000)
		colorShelf     (0.247, 0.215, 0.194, 0.000)
		colorBeach     (0.290, 0.251, 0.231, 0.000)
		colorDesert    (0.314, 0.270, 0.225, 0.000)
		colorLowland   (0.345, 0.288, 0.255, 0.000)
		colorUpland    (0.382, 0.349, 0.310, 0.000)
		colorRock      (0.413, 0.380, 0.334, 0.000)
		colorSnow      (0.450, 0.405, 0.353, 1.000)
		BumpHeight      0.0333299
		BumpOffset      0.00666598
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.128754
		DustBright  0.479192
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   25.1302
		Period          128.32
		Eccentricity    0.974247
		Inclination     164.122
		AscendingNode   80.8336
		ArgOfPericenter -17.6169
		MeanAnomaly     75.833
	}
}

Comet	"C42"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            1.33884e-013
	Radius          0.661121
	InertiaMoment   0.398178

	Oblateness      0.0204149

	RotationPeriod  31.67
	Obliquity       59.574
	EqAscendNode    220.058

	AbsMagn         16.4928
	SlopeParam      6.49128
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.718 0.539 0.476)

	Surface
	{
		SurfStyle       0.609623
		OceanStyle      0.819892
		Randomize      (-0.287, 0.176, 0.151)
		colorDistMagn   0.886356
		colorDistFreq   0.0002405
		detailScale     18.053
		colorConversion true
		snowLevel       2
		tropicLatitude  0.797153
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.392166
		terraceProb     0.674662
		erosion         0
		montesMagn      0.447814
		montesFreq      3.44342
		montesSpiky     0.960677
		montesFraction  0.730566
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00126277
		hillsFraction   0.628191
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24737
		craterFreq      0.226051
		craterDensity   0.956022
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.529999
		volcanoTemp     1368.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.280, 0.183, 0.133, 0.000)
		colorShelf     (0.287, 0.189, 0.152, 0.000)
		colorBeach     (0.337, 0.221, 0.181, 0.000)
		colorDesert    (0.366, 0.237, 0.176, 0.000)
		colorLowland   (0.402, 0.253, 0.200, 0.000)
		colorUpland    (0.445, 0.307, 0.243, 0.000)
		colorRock      (0.481, 0.334, 0.262, 0.000)
		colorSnow      (0.524, 0.356, 0.276, 1.000)
		BumpHeight      0.595009
		BumpOffset      0.119002
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.273183
		GasToDust   0.25
		Particles   1531
		GasBright   0.0791995
		DustBright  0.213233
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   32.3635
		Period          187.536
		Eccentricity    0.979901
		Inclination     -8.24714
		AscendingNode   33.9603
		ArgOfPericenter -30.4848
		MeanAnomaly     99.072
	}
}

Comet	"C43"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            1.0355e-009
	Radius          14.4732
	InertiaMoment   0.399864

	Oblateness      0.0318217

	RotationPeriod  29.6379
	Obliquity       12.7797
	EqAscendNode    204.636

	AbsMagn         9.49152
	SlopeParam      2.04599
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.675 0.674 0.671)

	Surface
	{
		SurfStyle       0.716563
		OceanStyle      0.647619
		Randomize      (-0.179, 0.624, -0.477)
		colorDistMagn   0.537738
		colorDistFreq   0.0288859
		detailScale     395.215
		colorConversion true
		snowLevel       2
		tropicLatitude  0.215685
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.621649
		terraceProb     0.206424
		erosion         0
		montesMagn      0.417609
		montesFreq      2.43568
		montesSpiky     0.9995
		montesFraction  0.878488
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.50053
		hillsFraction   0.658845
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230464
		craterFreq      0.227399
		craterDensity   1.07709
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.495491
		volcanoTemp     1577.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.263, 0.229, 0.188, 0.000)
		colorShelf     (0.270, 0.236, 0.215, 0.000)
		colorBeach     (0.317, 0.276, 0.255, 0.000)
		colorDesert    (0.344, 0.296, 0.248, 0.000)
		colorLowland   (0.378, 0.317, 0.282, 0.000)
		colorUpland    (0.419, 0.384, 0.342, 0.000)
		colorRock      (0.453, 0.418, 0.369, 0.000)
		colorSnow      (0.493, 0.445, 0.389, 1.000)
		BumpHeight      13.0259
		BumpOffset      2.60518
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.754375
		GasToDust   0.25
		Particles   2503
		GasBright   0.256286
		DustBright  0.520633
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   26.4045
		Period          138.203
		Eccentricity    0.975657
		Inclination     156.505
		AscendingNode   21.437
		ArgOfPericenter 82.6573
		MeanAnomaly     -3.29689
	}
}

Comet	"C44"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            3.18837e-017
	Radius          0.0409
	InertiaMoment   0.398742

	Oblateness      0.026887

	RotationPeriod  27.5456
	Obliquity       325.985
	EqAscendNode    189.213

	AbsMagn         5.9897
	SlopeParam      2.81262
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.809 0.747 0.682)

	Surface
	{
		SurfStyle       0.435786
		OceanStyle      0.664822
		Randomize      (-0.963, 0.316, 0.407)
		colorDistMagn   0.938204
		colorDistFreq   1.2712e-006
		detailScale     1.11684
		colorConversion true
		snowLevel       2
		tropicLatitude  0.580093
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.544507
		terraceProb     0.389299
		erosion         0
		montesMagn      0.682317
		montesFreq      2.21821
		montesSpiky     0.767108
		montesFraction  0.833317
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.16946e-006
		hillsFraction   0.726728
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22029
		craterFreq      0.157294
		craterDensity   0.96124
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.501829
		volcanoTemp     1178.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.324, 0.299, 0.273, 0.000)
		colorShelf     (0.344, 0.317, 0.290, 0.000)
		colorBeach     (0.364, 0.336, 0.307, 0.000)
		colorDesert    (0.384, 0.355, 0.324, 0.000)
		colorLowland   (0.404, 0.373, 0.341, 0.000)
		colorUpland    (0.425, 0.392, 0.358, 0.000)
		colorRock      (0.445, 0.411, 0.375, 0.000)
		colorSnow      (0.465, 0.429, 0.392, 1.000)
		BumpHeight      0.03681
		BumpOffset      0.00736199
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.17945
		DustBright  0.281955
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   32.9047
		Period          192.259
		Eccentricity    0.982382
		Inclination     162.433
		AscendingNode   -98.2789
		ArgOfPericenter 19.0941
		MeanAnomaly     91.3349
	}
}

Comet	"C45"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            2.46598e-013
	Radius          0.896477
	InertiaMoment   0.396828

	Oblateness      0.0428073

	RotationPeriod  25.3817
	Obliquity       279.191
	EqAscendNode    173.791

	AbsMagn         15.1132
	SlopeParam      3.43321
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.786 0.698 0.649)

	Surface
	{
		SurfStyle       0.671904
		OceanStyle      0.449878
		Randomize      (0.653, -0.292, 0.554)
		colorDistMagn   0.136349
		colorDistFreq   0.000333534
		detailScale     24.4798
		colorConversion true
		snowLevel       2
		tropicLatitude  0.985614
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.680439
		terraceProb     0.162181
		erosion         0
		montesMagn      0.691518
		montesFreq      2.96943
		montesSpiky     0.805211
		montesFraction  0.511869
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00185054
		hillsFraction   0.731486
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224237
		craterFreq      0.223703
		craterDensity   1.03682
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.511294
		volcanoTemp     1306.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.306, 0.237, 0.182, 0.000)
		colorShelf     (0.314, 0.244, 0.208, 0.000)
		colorBeach     (0.369, 0.286, 0.247, 0.000)
		colorDesert    (0.401, 0.307, 0.240, 0.000)
		colorLowland   (0.440, 0.328, 0.273, 0.000)
		colorUpland    (0.487, 0.398, 0.331, 0.000)
		colorRock      (0.526, 0.433, 0.357, 0.000)
		colorSnow      (0.574, 0.461, 0.377, 1.000)
		BumpHeight      0.80683
		BumpOffset      0.161366
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.306009
		GasToDust   0.25
		Particles   1597
		GasBright   0.423727
		DustBright  0.522165
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   25.7436
		Period          133.047
		Eccentricity    0.968362
		Inclination     178.714
		AscendingNode   -114.875
		ArgOfPericenter -101.727
		MeanAnomaly     98.2913
	}
}

Comet	"C46"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            1.90726e-009
	Radius          15.963
	InertiaMoment   0.399219

	Oblateness      0.0379577

	RotationPeriod  23.1328
	Obliquity       232.397
	EqAscendNode    158.368

	AbsMagn         9.27006
	SlopeParam      4.00257
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.459 0.373 0.343)

	Surface
	{
		SurfStyle       0.941863
		OceanStyle      0.701066
		Randomize      (0.449, 0.962, 0.255)
		colorDistMagn   0.606264
		colorDistFreq   0.0992911
		detailScale     435.896
		colorConversion true
		snowLevel       2
		tropicLatitude  0.794859
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.429865
		terraceProb     0.238223
		erosion         0
		montesMagn      0.452658
		montesFreq      2.55304
		montesSpiky     0.73671
		montesFraction  0.657429
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.753407
		hillsFraction   0.725897
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.277637
		craterFreq      0.207303
		craterDensity   0.881329
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.491942
		volcanoTemp     1651.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.156, 0.131, 0.137, 0.050)
		colorShelf     (0.183, 0.153, 0.158, 0.040)
		colorBeach     (0.211, 0.175, 0.178, 0.030)
		colorDesert    (0.239, 0.198, 0.202, 0.020)
		colorLowland   (0.266, 0.220, 0.223, 0.030)
		colorUpland    (0.294, 0.243, 0.243, 0.050)
		colorRock      (0.321, 0.265, 0.271, 0.020)
		colorSnow      (0.321, 0.265, 0.271, 1.000)
		BumpHeight      14.3667
		BumpOffset      2.87334
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.787201
		GasToDust   0.25
		Particles   2570
		GasBright   0.00441965
		DustBright  0.625959
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   30.0209
		Period          167.547
		Eccentricity    0.97451
		Inclination     -0.248008
		AscendingNode   -171.133
		ArgOfPericenter -3.78182
		MeanAnomaly     116.777
	}
}

Comet	"C47"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            5.87259e-017
	Radius          0.0555284
	InertiaMoment   0.397839

	Oblateness      0.0639588

	RotationPeriod  20.7824
	Obliquity       185.603
	EqAscendNode    142.945

	AbsMagn         5.74925
	SlopeParam      4.57215
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.741 0.739 0.735)

	Surface
	{
		SurfStyle       0.0639186
		OceanStyle      0.343886
		Randomize      (0.792, 0.957, 0.036)
		colorDistMagn   0.597358
		colorDistFreq   8.0908e-007
		detailScale     1.5163
		colorConversion true
		snowLevel       2
		tropicLatitude  0.581704
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.358316
		terraceProb     0.608586
		erosion         0
		montesMagn      0.454484
		montesFreq      4.03387
		montesSpiky     0.876527
		montesFraction  0.545933
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.76119e-006
		hillsFraction   0.509176
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220836
		craterFreq      0.183618
		craterDensity   0.939316
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.458971
		volcanoTemp     1761.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.296, 0.295, 0.294, 0.000)
		colorShelf     (0.315, 0.314, 0.312, 0.000)
		colorBeach     (0.334, 0.332, 0.331, 0.000)
		colorDesert    (0.352, 0.351, 0.349, 0.000)
		colorLowland   (0.371, 0.369, 0.368, 0.000)
		colorUpland    (0.389, 0.388, 0.386, 0.000)
		colorRock      (0.408, 0.406, 0.404, 0.000)
		colorSnow      (0.426, 0.425, 0.423, 1.000)
		BumpHeight      0.0499756
		BumpOffset      0.00999511
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0207989
		DustBright  0.294066
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   24.0026
		Period          119.781
		Eccentricity    0.970698
		Inclination     -140.936
		AscendingNode   131.382
		ArgOfPericenter -149.697
		MeanAnomaly     95.6103
	}
}

Comet	"C48"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            4.54203e-013
	Radius          0.987291
	InertiaMoment   0.399656

	Oblateness      0.0602916

	RotationPeriod  18.3098
	Obliquity       138.808
	EqAscendNode    127.523

	AbsMagn         14.2705
	SlopeParam      5.19352
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.720 0.614 0.530)

	Surface
	{
		SurfStyle       0.742473
		OceanStyle      0.681185
		Randomize      (0.223, 0.518, -0.939)
		colorDistMagn   0.301926
		colorDistFreq   0.000551197
		detailScale     26.9596
		colorConversion true
		snowLevel       2
		tropicLatitude  0.94203
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.362699
		terraceProb     0.196051
		erosion         0
		montesMagn      0.557442
		montesFreq      3.57175
		montesSpiky     0.795811
		montesFraction  0.61678
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00268685
		hillsFraction   0.622877
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262167
		craterFreq      0.256544
		craterDensity   0.983055
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.482216
		volcanoTemp     1282.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.281, 0.209, 0.148, 0.000)
		colorShelf     (0.288, 0.215, 0.170, 0.000)
		colorBeach     (0.338, 0.252, 0.201, 0.000)
		colorDesert    (0.367, 0.270, 0.196, 0.000)
		colorLowland   (0.403, 0.289, 0.223, 0.000)
		colorUpland    (0.446, 0.350, 0.270, 0.000)
		colorRock      (0.482, 0.381, 0.291, 0.000)
		colorSnow      (0.526, 0.405, 0.307, 1.000)
		BumpHeight      0.888562
		BumpOffset      0.177712
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.338835
		GasToDust   0.25
		Particles   1664
		GasBright   0.1
		DustBright  0.699352
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   17.0521
		Period          71.7243
		Eccentricity    0.960475
		Inclination     -47.4144
		AscendingNode   69.0105
		ArgOfPericenter -65.0103
		MeanAnomaly     141.657
	}
}

Comet	"C49"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            3.51293e-009
	Radius          21.7016
	InertiaMoment   0.398479

	Oblateness      0.112271

	RotationPeriod  15.6884
	Obliquity       92.014
	EqAscendNode    112.1

	AbsMagn         9.05242
	SlopeParam      5.96232
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.654 0.650 0.648)

	Surface
	{
		SurfStyle       0.955605
		OceanStyle      0.830109
		Randomize      (-0.054, 0.339, 0.568)
		colorDistMagn   0.679864
		colorDistFreq   0.25741
		detailScale     592.599
		colorConversion true
		snowLevel       2
		tropicLatitude  0.845058
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.524868
		terraceProb     0.160592
		erosion         0
		montesMagn      0.54996
		montesFreq      2.75127
		montesSpiky     0.902001
		montesFraction  0.617799
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.46311
		hillsFraction   0.573077
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245147
		craterFreq      0.204119
		craterDensity   0.82392
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.67959
		volcanoTemp     1686.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.222, 0.228, 0.259, 0.050)
		colorShelf     (0.262, 0.267, 0.298, 0.040)
		colorBeach     (0.301, 0.306, 0.337, 0.030)
		colorDesert    (0.340, 0.345, 0.382, 0.020)
		colorLowland   (0.379, 0.384, 0.421, 0.030)
		colorUpland    (0.419, 0.423, 0.460, 0.050)
		colorRock      (0.458, 0.462, 0.512, 0.020)
		colorSnow      (0.458, 0.462, 0.512, 1.000)
		BumpHeight      19.5315
		BumpOffset      3.90629
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.820027
		GasToDust   0.25
		Particles   2636
		GasBright   0.0890973
		DustBright  0.394741
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   34.8584
		Period          209.634
		Eccentricity    0.980902
		Inclination     -62.9908
		AscendingNode   -51.7989
		ArgOfPericenter -160.821
		MeanAnomaly     169.076
	}
}

Comet	"C50"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            1.08166e-016
	Radius          0.0610527
	InertiaMoment   0.395669

	Oblateness      0.119127

	RotationPeriod  12.8834
	Obliquity       45.2197
	EqAscendNode    96.6777

	AbsMagn         5.50036
	SlopeParam      7.26704
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.691 0.688 0.685)

	Surface
	{
		SurfStyle       0.386249
		OceanStyle      0.766382
		Randomize      (-0.228, -0.053, 0.064)
		colorDistMagn   0.89076
		colorDistFreq   2.13523e-006
		detailScale     1.66715
		colorConversion true
		snowLevel       2
		tropicLatitude  0.986829
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.705584
		terraceProb     0.51546
		erosion         0
		montesMagn      0.545441
		montesFreq      2.98693
		montesSpiky     0.815119
		montesFraction  0.675023
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.35396e-006
		hillsFraction   0.75574
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240331
		craterFreq      0.175254
		craterDensity   0.815708
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48879
		volcanoTemp     1559.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.276, 0.275, 0.274, 0.000)
		colorShelf     (0.294, 0.292, 0.291, 0.000)
		colorBeach     (0.311, 0.310, 0.308, 0.000)
		colorDesert    (0.328, 0.327, 0.325, 0.000)
		colorLowland   (0.345, 0.344, 0.342, 0.000)
		colorUpland    (0.363, 0.361, 0.360, 0.000)
		colorRock      (0.380, 0.378, 0.377, 0.000)
		colorSnow      (0.397, 0.396, 0.394, 1.000)
		BumpHeight      0.0549474
		BumpOffset      0.0109895
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.235489
		DustBright  0.732836
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   29.5609
		Period          163.711
		Eccentricity    0.969957
		Inclination     118.795
		AscendingNode   -143.659
		ArgOfPericenter -74.2171
		MeanAnomaly     -2.48118
	}
}

Comet	"C51"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            8.36582e-013
	Radius          1.34422
	InertiaMoment   0.398991

	Oblateness      0.249

	RotationPeriod  9.84706
	Obliquity       358.425
	EqAscendNode    81.2551

	AbsMagn         13.6393
	SlopeParam      2.45259
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.787 0.783 0.781)

	Surface
	{
		SurfStyle       0.910836
		OceanStyle      0.552601
		Randomize      (0.187, 0.475, 0.553)
		colorDistMagn   0.220864
		colorDistFreq   0.000715565
		detailScale     36.7061
		colorConversion true
		snowLevel       2
		tropicLatitude  0.348435
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.354566
		terraceProb     0.437942
		erosion         0
		montesMagn      0.638287
		montesFreq      3.52594
		montesSpiky     0.932281
		montesFraction  0.67364
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00580292
		hillsFraction   0.732061
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.205007
		craterFreq      0.248156
		craterDensity   0.702606
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.569949
		volcanoTemp     1437.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.268, 0.274, 0.313, 0.050)
		colorShelf     (0.315, 0.321, 0.359, 0.040)
		colorBeach     (0.362, 0.368, 0.406, 0.030)
		colorDesert    (0.409, 0.415, 0.461, 0.020)
		colorLowland   (0.456, 0.462, 0.508, 0.030)
		colorUpland    (0.504, 0.509, 0.555, 0.050)
		colorRock      (0.551, 0.556, 0.617, 0.020)
		colorSnow      (0.551, 0.556, 0.617, 1.000)
		BumpHeight      1.20979
		BumpOffset      0.241959
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.37166
		GasToDust   0.25
		Particles   1730
		GasBright   0.197304
		DustBright  0.455508
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   28.3651
		Period          153.878
		Eccentricity    0.989833
		Inclination     19.4633
		AscendingNode   124.349
		ArgOfPericenter -135.855
		MeanAnomaly     17.3957
	}
}

Comet	"C52"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            6.47038e-009
	Radius          23.8165
	InertiaMoment   0.397422

	Oblateness      0.249

	RotationPeriod  6.51184
	Obliquity       311.631
	EqAscendNode    65.8325

	AbsMagn         8.83785
	SlopeParam      3.12916
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.537 0.531 0.525)

	Surface
	{
		SurfStyle       0.8633
		OceanStyle      0.134274
		Randomize      (-0.043, 0.805, 0.594)
		colorDistMagn   0.802807
		colorDistFreq   0.356705
		detailScale     650.349
		colorConversion true
		snowLevel       2
		tropicLatitude  0.785956
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.595731
		terraceProb     0.165169
		erosion         0
		montesMagn      0.593768
		montesFreq      2.37868
		montesSpiky     0.889338
		montesFraction  0.710736
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.5949
		hillsFraction   0.634664
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235895
		craterFreq      0.260459
		craterDensity   1.06038
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.467377
		volcanoTemp     1267.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.182, 0.186, 0.210, 0.050)
		colorShelf     (0.215, 0.218, 0.241, 0.040)
		colorBeach     (0.247, 0.250, 0.273, 0.030)
		colorDesert    (0.279, 0.281, 0.310, 0.020)
		colorLowland   (0.311, 0.313, 0.341, 0.030)
		colorUpland    (0.343, 0.345, 0.373, 0.050)
		colorRock      (0.376, 0.377, 0.415, 0.020)
		colorSnow      (0.376, 0.377, 0.415, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.852853
		GasToDust   0.25
		Particles   2702
		GasBright   0.12186
		DustBright  0.215438
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   41.4578
		Period          271.9
		Eccentricity    0.975691
		Inclination     172.806
		AscendingNode   64.1446
		ArgOfPericenter 115.947
		MeanAnomaly     110.334
	}
}

Comet	"C53"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            1.99227e-016
	Radius          0.0832622
	InertiaMoment   0.399444

	Oblateness      0.249

	RotationPeriod  2.7764
	Obliquity       264.837
	EqAscendNode    50.41

	AbsMagn         5.2414
	SlopeParam      3.71684
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.708 0.705 0.702)

	Surface
	{
		SurfStyle       0.675674
		OceanStyle      0.26449
		Randomize      (-0.721, 0.957, -0.065)
		colorDistMagn   0.500275
		colorDistFreq   2.53845e-006
		detailScale     2.27361
		colorConversion true
		snowLevel       2
		tropicLatitude  0.99336
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.492456
		terraceProb     0.208869
		erosion         0
		montesMagn      0.58317
		montesFreq      2.86073
		montesSpiky     0.942914
		montesFraction  0.685159
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.32272e-005
		hillsFraction   0.605859
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260914
		craterFreq      0.205656
		craterDensity   0.891935
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.562863
		volcanoTemp     1495.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.276, 0.240, 0.197, 0.000)
		colorShelf     (0.283, 0.247, 0.225, 0.000)
		colorBeach     (0.333, 0.289, 0.267, 0.000)
		colorDesert    (0.361, 0.310, 0.260, 0.000)
		colorLowland   (0.397, 0.331, 0.295, 0.000)
		colorUpland    (0.439, 0.402, 0.358, 0.000)
		colorRock      (0.474, 0.437, 0.386, 0.000)
		colorSnow      (0.517, 0.465, 0.407, 1.000)
		BumpHeight      0.074936
		BumpOffset      0.0149872
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.345419
		DustBright  0.476366
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   26.9191
		Period          142.263
		Eccentricity    0.984273
		Inclination     139.634
		AscendingNode   -85.8676
		ArgOfPericenter -54.7932
		MeanAnomaly     2.96395
	}
}

Comet	"C54"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            1.54088e-012
	Radius          1.47212
	InertiaMoment   0.398186

	Oblateness      0.0012909

	RotationPeriod  123.355
	Obliquity       218.042
	EqAscendNode    34.9874

	AbsMagn         13.1239
	SlopeParam      4.28057
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.623 0.619 0.613)

	Surface
	{
		SurfStyle       0.591266
		OceanStyle      0.800535
		Randomize      (0.673, 0.994, 0.285)
		colorDistMagn   0.827369
		colorDistFreq   0.00128502
		detailScale     40.1988
		colorConversion true
		snowLevel       2
		tropicLatitude  0.364562
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.553479
		terraceProb     0.182711
		erosion         0
		montesMagn      0.454819
		montesFreq      2.98918
		montesSpiky     0.825462
		montesFraction  0.607984
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00580883
		hillsFraction   0.584572
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241789
		craterFreq      0.193775
		craterDensity   0.987958
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.530409
		volcanoTemp     1739.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.243, 0.210, 0.172, 0.000)
		colorShelf     (0.249, 0.217, 0.196, 0.000)
		colorBeach     (0.293, 0.254, 0.233, 0.000)
		colorDesert    (0.318, 0.272, 0.227, 0.000)
		colorLowland   (0.349, 0.291, 0.257, 0.000)
		colorUpland    (0.386, 0.353, 0.313, 0.000)
		colorRock      (0.417, 0.384, 0.337, 0.000)
		colorSnow      (0.455, 0.408, 0.356, 1.000)
		BumpHeight      1.32491
		BumpOffset      0.264982
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.404486
		GasToDust   0.25
		Particles   1796
		GasBright   0.242693
		DustBright  0.263578
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   22.5454
		Period          109.041
		Eccentricity    0.969372
		Inclination     -144.311
		AscendingNode   -144.185
		ArgOfPericenter 13.0097
		MeanAnomaly     2.1411
	}
}

Comet	"C55"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            1.19176e-008
	Radius          32.5407
	InertiaMoment   0.399869

	Oblateness      0.00220909

	RotationPeriod  111.784
	Obliquity       171.248
	EqAscendNode    19.5648

	AbsMagn         8.62567
	SlopeParam      4.86802
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.726 0.605 0.496)

	Surface
	{
		SurfStyle       0.917809
		OceanStyle      0.197469
		Randomize      (0.858, 0.749, -0.468)
		colorDistMagn   0.641768
		colorDistFreq   0.515504
		detailScale     888.579
		colorConversion true
		snowLevel       2
		tropicLatitude  0.133633
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.765802
		terraceProb     0.26261
		erosion         0
		montesMagn      0.422976
		montesFreq      2.27316
		montesSpiky     0.85414
		montesFraction  0.432492
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.57288
		hillsFraction   0.913303
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231158
		craterFreq      0.279213
		craterDensity   0.845816
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.500441
		volcanoTemp     1223.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.247, 0.212, 0.198, 0.050)
		colorShelf     (0.290, 0.248, 0.228, 0.040)
		colorBeach     (0.334, 0.284, 0.258, 0.030)
		colorDesert    (0.377, 0.321, 0.292, 0.020)
		colorLowland   (0.421, 0.357, 0.322, 0.030)
		colorUpland    (0.464, 0.393, 0.352, 0.050)
		colorRock      (0.508, 0.429, 0.392, 0.020)
		colorSnow      (0.508, 0.429, 0.392, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.885678
		GasToDust   0.25
		Particles   2769
		GasBright   0.0380633
		DustBright  0.952695
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   26.7886
		Period          141.23
		Eccentricity    0.977242
		Inclination     -1.6532
		AscendingNode   134.663
		ArgOfPericenter 67.5884
		MeanAnomaly     69.7479
	}
}

Comet	"C56"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            3.66953e-016
	Radius          0.090965
	InertiaMoment   0.398748

	Oblateness      0.00178573

	RotationPeriod  104.503
	Obliquity       124.454
	EqAscendNode    4.14218

	AbsMagn         4.97031
	SlopeParam      5.54395
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.771 0.769 0.767)

	Surface
	{
		SurfStyle       0.733606
		OceanStyle      0.939224
		Randomize      (-0.604, 0.894, -0.869)
		colorDistMagn   0.581435
		colorDistFreq   4.40439e-006
		detailScale     2.48395
		colorConversion true
		snowLevel       2
		tropicLatitude  0.783261
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.296637
		terraceProb     0.460911
		erosion         0
		montesMagn      0.494143
		montesFreq      2.67659
		montesSpiky     0.96625
		montesFraction  0.556009
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.04784e-005
		hillsFraction   0.833494
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231659
		craterFreq      0.187726
		craterDensity   0.714376
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.4639
		volcanoTemp     1684.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.301, 0.261, 0.215, 0.000)
		colorShelf     (0.308, 0.269, 0.246, 0.000)
		colorBeach     (0.362, 0.315, 0.292, 0.000)
		colorDesert    (0.393, 0.338, 0.284, 0.000)
		colorLowland   (0.432, 0.361, 0.322, 0.000)
		colorUpland    (0.478, 0.438, 0.391, 0.000)
		colorRock      (0.516, 0.477, 0.422, 0.000)
		colorSnow      (0.563, 0.508, 0.445, 1.000)
		BumpHeight      0.0818685
		BumpOffset      0.0163737
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0658118
		DustBright  0.609433
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   28.555
		Period          155.426
		Eccentricity    0.968343
		Inclination     27.7332
		AscendingNode   -71.6285
		ArgOfPericenter -29.6202
		MeanAnomaly     -34.8159
	}
}

Comet	"C57"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            2.83812e-012
	Radius          2.01562
	InertiaMoment   0.396847

	Oblateness      0.00277927

	RotationPeriod  98.9946
	Obliquity       77.6596
	EqAscendNode    348.72

	AbsMagn         12.6818
	SlopeParam      6.4746
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.743 0.668 0.610)

	Surface
	{
		SurfStyle       0.422181
		OceanStyle      0.447725
		Randomize      (0.929, -0.821, 0.293)
		colorDistMagn   0.231119
		colorDistFreq   0.00176526
		detailScale     55.0398
		colorConversion true
		snowLevel       2
		tropicLatitude  0.9532
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.501621
		terraceProb     0.187915
		erosion         0
		montesMagn      0.458726
		montesFreq      3.17918
		montesSpiky     0.929098
		montesFraction  0.873527
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0072862
		hillsFraction   0.812699
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218277
		craterFreq      0.263035
		craterDensity   1.01247
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.548995
		volcanoTemp     1319.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.297, 0.267, 0.244, 0.000)
		colorShelf     (0.316, 0.284, 0.259, 0.000)
		colorBeach     (0.334, 0.300, 0.275, 0.000)
		colorDesert    (0.353, 0.317, 0.290, 0.000)
		colorLowland   (0.372, 0.334, 0.305, 0.000)
		colorUpland    (0.390, 0.350, 0.320, 0.000)
		colorRock      (0.409, 0.367, 0.336, 0.000)
		colorSnow      (0.427, 0.384, 0.351, 1.000)
		BumpHeight      1.81405
		BumpOffset      0.362811
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.437312
		GasToDust   0.25
		Particles   1863
		GasBright   0.0563011
		DustBright  0.30343
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   40.7956
		Period          265.412
		Eccentricity    0.980723
		Inclination     -152.123
		AscendingNode   -104.378
		ArgOfPericenter 148.684
		MeanAnomaly     33.6805
	}
}

Comet	"C58"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            2.19507e-008
	Radius          35.4506
	InertiaMoment   0.399225

	Oblateness      0.00216586

	RotationPeriod  94.4742
	Obliquity       30.8653
	EqAscendNode    333.297

	AbsMagn         8.41524
	SlopeParam      2.03351
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.405 0.400 0.396)

	Surface
	{
		SurfStyle       0.0601883
		OceanStyle      0.120355
		Randomize      (-0.901, -0.918, -0.356)
		colorDistMagn   0.42025
		colorDistFreq   0.962793
		detailScale     968.039
		colorConversion true
		snowLevel       2
		tropicLatitude  0.804734
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.428549
		terraceProb     0.21297
		erosion         0
		montesMagn      0.538936
		montesFreq      3.10167
		montesSpiky     0.942338
		montesFraction  0.577863
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.71854
		hillsFraction   0.410682
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.203943
		craterFreq      0.273738
		craterDensity   0.952102
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.540487
		volcanoTemp     1860.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.162, 0.160, 0.158, 0.000)
		colorShelf     (0.172, 0.170, 0.168, 0.000)
		colorBeach     (0.182, 0.180, 0.178, 0.000)
		colorDesert    (0.192, 0.190, 0.188, 0.000)
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

	CometTail
	{
		MaxLength   0.918504
		GasToDust   0.25
		Particles   2835
		GasBright   0.181975
		DustBright  0.662243
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   31.2678
		Period          178.093
		Eccentricity    0.980112
		Inclination     -36.4703
		AscendingNode   108.476
		ArgOfPericenter 175.551
		MeanAnomaly     148.557
	}
}

Comet	"C59"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            6.75879e-016
	Radius          0.12485
	InertiaMoment   0.397848

	Oblateness      0.00332472

	RotationPeriod  90.5872
	Obliquity       344.071
	EqAscendNode    317.874

	AbsMagn         4.68454
	SlopeParam      2.8034
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.807 0.756 0.680)

	Surface
	{
		SurfStyle       0.555913
		OceanStyle      0.886233
		Randomize      (-0.973, 0.513, 0.345)
		colorDistMagn   0.614527
		colorDistFreq   7.08091e-006
		detailScale     3.40924
		colorConversion true
		snowLevel       2
		tropicLatitude  0.732125
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.741858
		terraceProb     0.35073
		erosion         0
		montesMagn      0.3427
		montesFreq      3.044
		montesSpiky     0.867419
		montesFraction  0.335318
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.41411e-005
		hillsFraction   0.51916
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242397
		craterFreq      0.276739
		craterDensity   0.860183
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52562
		volcanoTemp     1386.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.315, 0.257, 0.190, 0.000)
		colorShelf     (0.323, 0.265, 0.217, 0.000)
		colorBeach     (0.379, 0.310, 0.258, 0.000)
		colorDesert    (0.412, 0.333, 0.251, 0.000)
		colorLowland   (0.452, 0.355, 0.285, 0.000)
		colorUpland    (0.501, 0.431, 0.347, 0.000)
		colorRock      (0.541, 0.469, 0.374, 0.000)
		colorSnow      (0.589, 0.499, 0.394, 1.000)
		BumpHeight      0.112365
		BumpOffset      0.022473
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.145182
		DustBright  0.383522
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   19.127
		Period          85.2062
		Eccentricity    0.978683
		Inclination     138.274
		AscendingNode   -78.4702
		ArgOfPericenter 27.5128
		MeanAnomaly     165.551
	}
}

Comet	"C60"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            5.22744e-012
	Radius          2.18839
	InertiaMoment   0.399661

	Oblateness      0.00251868

	RotationPeriod  87.1419
	Obliquity       297.277
	EqAscendNode    302.452

	AbsMagn         12.2905
	SlopeParam      3.42517
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.686 0.573 0.457)

	Surface
	{
		SurfStyle       0.112051
		OceanStyle      0.556155
		Randomize      (0.509, -0.778, 0.792)
		colorDistMagn   0.308948
		colorDistFreq   0.00200428
		detailScale     59.7575
		colorConversion true
		snowLevel       2
		tropicLatitude  0.808568
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.391717
		terraceProb     0.230564
		erosion         0
		montesMagn      0.412291
		montesFreq      2.02188
		montesSpiky     0.894745
		montesFraction  0.637221
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0101178
		hillsFraction   0.858479
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247865
		craterFreq      0.193098
		craterDensity   0.878525
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.458753
		volcanoTemp     1659.25
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.275, 0.229, 0.183, 0.000)
		colorShelf     (0.292, 0.244, 0.194, 0.000)
		colorBeach     (0.309, 0.258, 0.206, 0.000)
		colorDesert    (0.326, 0.272, 0.217, 0.000)
		colorLowland   (0.343, 0.287, 0.229, 0.000)
		colorUpland    (0.360, 0.301, 0.240, 0.000)
		colorRock      (0.378, 0.315, 0.252, 0.000)
		colorSnow      (0.395, 0.330, 0.263, 1.000)
		BumpHeight      1.96955
		BumpOffset      0.393909
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.470138
		GasToDust   0.25
		Particles   1929
		GasBright   0.07113
		DustBright  0.142061
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   21.1824
		Period          99.3035
		Eccentricity    0.972741
		Inclination     -110.455
		AscendingNode   -59.0528
		ArgOfPericenter 20.8033
		MeanAnomaly     -62.6586
	}
}

Comet	"C61"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            4.04305e-008
	Radius          48.7944
	InertiaMoment   0.398486

	Oblateness      0.00386584

	RotationPeriod  84.0222
	Obliquity       250.482
	EqAscendNode    287.029

	AbsMagn         8.20595
	SlopeParam      3.99486
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.611 0.609 0.607)

	Surface
	{
		SurfStyle       0.0197546
		OceanStyle      0.254678
		Randomize      (-0.440, -0.929, 0.120)
		colorDistMagn   0.0929054
		colorDistFreq   1.23687
		detailScale     1332.41
		colorConversion true
		snowLevel       2
		tropicLatitude  0.84811
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.515546
		terraceProb     0.778057
		erosion         0
		montesMagn      0.522352
		montesFreq      3.50467
		montesSpiky     0.71401
		montesFraction  0.588729
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.27712
		hillsFraction   0.647675
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213411
		craterFreq      0.204934
		craterDensity   0.866412
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.567967
		volcanoTemp     1723.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.244, 0.244, 0.243, 0.000)
		colorShelf     (0.260, 0.259, 0.258, 0.000)
		colorBeach     (0.275, 0.274, 0.273, 0.000)
		colorDesert    (0.290, 0.289, 0.288, 0.000)
		colorLowland   (0.306, 0.304, 0.303, 0.000)
		colorUpland    (0.321, 0.320, 0.319, 0.000)
		colorRock      (0.336, 0.335, 0.334, 0.000)
		colorSnow      (0.351, 0.350, 0.349, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.95133
		GasToDust   0.25
		Particles   2901
		GasBright   0.273971
		DustBright  0.423706
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   36.0409
		Period          220.392
		Eccentricity    0.975649
		Inclination     -73.8074
		AscendingNode   -133.494
		ArgOfPericenter -163.332
		MeanAnomaly     -93.6059
	}
}

Comet	"C62"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            1.24489e-015
	Radius          0.134974
	InertiaMoment   0.395722

	Oblateness      0.00281936

	RotationPeriod  81.1519
	Obliquity       203.688
	EqAscendNode    271.607

	AbsMagn         4.38074
	SlopeParam      4.56412
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.773 0.772 0.771)

	Surface
	{
		SurfStyle       0.49171
		OceanStyle      0.721847
		Randomize      (0.209, -0.614, 0.846)
		colorDistMagn   0.397501
		colorDistFreq   8.87499e-006
		detailScale     3.68569
		colorConversion true
		snowLevel       2
		tropicLatitude  0.915482
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.395702
		terraceProb     0.177404
		erosion         0
		montesMagn      0.443914
		montesFreq      3.93931
		montesSpiky     0.817136
		montesFraction  0.837028
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.80356e-005
		hillsFraction   0.588529
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252273
		craterFreq      0.268776
		craterDensity   1.02496
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.504011
		volcanoTemp     1639.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.309, 0.309, 0.308, 0.000)
		colorShelf     (0.329, 0.328, 0.328, 0.000)
		colorBeach     (0.348, 0.347, 0.347, 0.000)
		colorDesert    (0.367, 0.367, 0.366, 0.000)
		colorLowland   (0.387, 0.386, 0.385, 0.000)
		colorUpland    (0.406, 0.405, 0.405, 0.000)
		colorRock      (0.425, 0.424, 0.424, 0.000)
		colorSnow      (0.445, 0.444, 0.443, 1.000)
		BumpHeight      0.121476
		BumpOffset      0.0242953
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0217722
		GasToDust   0.25
		Particles   1023
		GasBright   0.172637
		DustBright  0.209527
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   25.4752
		Period          130.972
		Eccentricity    0.970334
		Inclination     124.203
		AscendingNode   109.774
		ArgOfPericenter 16.4093
		MeanAnomaly     144.249
	}
}

Comet	"C63"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            9.6283e-012
	Radius          3.02241
	InertiaMoment   0.398997

	Oblateness      0.0044307

	RotationPeriod  78.4783
	Obliquity       156.894
	EqAscendNode    256.184

	AbsMagn         11.9365
	SlopeParam      5.18432
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.562 0.557 0.556)

	Surface
	{
		SurfStyle       0.958916
		OceanStyle      0.331881
		Randomize      (-0.120, 0.375, -0.238)
		colorDistMagn   0.946138
		colorDistFreq   0.00419328
		detailScale     82.5319
		colorConversion true
		snowLevel       2
		tropicLatitude  0.528792
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.461206
		terraceProb     0.368215
		erosion         0
		montesMagn      0.398679
		montesFreq      2.82727
		montesSpiky     0.944364
		montesFraction  0.21554
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0231475
		hillsFraction   0.74963
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23254
		craterFreq      0.164734
		craterDensity   0.926103
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.55381
		volcanoTemp     1691.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.191, 0.195, 0.222, 0.050)
		colorShelf     (0.225, 0.229, 0.256, 0.040)
		colorBeach     (0.258, 0.262, 0.289, 0.030)
		colorDesert    (0.292, 0.295, 0.328, 0.020)
		colorLowland   (0.326, 0.329, 0.361, 0.030)
		colorUpland    (0.359, 0.362, 0.395, 0.050)
		colorRock      (0.393, 0.396, 0.439, 0.020)
		colorSnow      (0.393, 0.396, 0.439, 1.000)
		BumpHeight      2.72017
		BumpOffset      0.544033
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.502964
		GasToDust   0.25
		Particles   1995
		GasBright   0.00934287
		DustBright  0.857308
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   33.0224
		Period          193.292
		Eccentricity    0.979111
		Inclination     166.219
		AscendingNode   61.5406
		ArgOfPericenter 36.7755
		MeanAnomaly     115.383
	}
}

Comet	"C64"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            7.44678e-008
	Radius          52.45
	InertiaMoment   0.397434

	Oblateness      0.00317672

	RotationPeriod  75.9631
	Obliquity       110.099
	EqAscendNode    240.761

	AbsMagn         7.99722
	SlopeParam      5.94987
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.637 0.521 0.390)

	Surface
	{
		SurfStyle       0.480338
		OceanStyle      0.155277
		Randomize      (-0.336, 0.863, -0.060)
		colorDistMagn   0.976876
		colorDistFreq   1.30572
		detailScale     1432.23
		colorConversion true
		snowLevel       2
		tropicLatitude  0.244428
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.555638
		terraceProb     0.25201
		erosion         0
		montesMagn      0.537344
		montesFreq      3.03129
		montesSpiky     0.881601
		montesFraction  0.658845
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.50388
		hillsFraction   0.63014
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232912
		craterFreq      0.222713
		craterDensity   1.04411
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.377188
		volcanoTemp     2076.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.255, 0.208, 0.156, 0.000)
		colorShelf     (0.271, 0.221, 0.166, 0.000)
		colorBeach     (0.286, 0.234, 0.176, 0.000)
		colorDesert    (0.302, 0.247, 0.185, 0.000)
		colorLowland   (0.318, 0.260, 0.195, 0.000)
		colorUpland    (0.334, 0.273, 0.205, 0.000)
		colorRock      (0.350, 0.286, 0.215, 0.000)
		colorSnow      (0.366, 0.299, 0.225, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.984156
		GasToDust   0.25
		Particles   2967
		GasBright   0.0384835
		DustBright  0.512654
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   22.961
		Period          112.069
		Eccentricity    0.9813
		Inclination     60.4602
		AscendingNode   11.6356
		ArgOfPericenter 126.334
		MeanAnomaly     93.7625
	}
}

Comet	"C65"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            2.29293e-015
	Radius          0.187213
	InertiaMoment   0.399449

	Oblateness      0.0050388

	RotationPeriod  73.5776
	Obliquity       63.3052
	EqAscendNode    225.339

	AbsMagn         4.05448
	SlopeParam      7.23808
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.500 0.496 0.492)

	Surface
	{
		SurfStyle       0.975892
		OceanStyle      0.662072
		Randomize      (-0.826, -0.958, 0.114)
		colorDistMagn   0.707776
		colorDistFreq   2.06644e-005
		detailScale     5.11217
		colorConversion true
		snowLevel       2
		tropicLatitude  0.866718
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.529183
		terraceProb     0.581386
		erosion         0
		montesMagn      0.51438
		montesFreq      2.31483
		montesSpiky     0.931692
		montesFraction  0.370955
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.14198e-005
		hillsFraction   0.707165
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221894
		craterFreq      0.236888
		craterDensity   0.994958
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.599856
		volcanoTemp     1463.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.170, 0.174, 0.197, 0.050)
		colorShelf     (0.200, 0.204, 0.226, 0.040)
		colorBeach     (0.230, 0.233, 0.256, 0.030)
		colorDesert    (0.260, 0.263, 0.290, 0.020)
		colorLowland   (0.290, 0.293, 0.320, 0.030)
		colorUpland    (0.320, 0.323, 0.349, 0.050)
		colorRock      (0.350, 0.352, 0.388, 0.020)
		colorSnow      (0.350, 0.352, 0.388, 1.000)
		BumpHeight      0.168492
		BumpOffset      0.0336984
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0545982
		GasToDust   0.25
		Particles   1090
		GasBright   0.030365
		DustBright  0.205259
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   33.3816
		Period          196.455
		Eccentricity    0.977231
		Inclination     4.69867
		AscendingNode   134.254
		ArgOfPericenter 33.4416
		MeanAnomaly     -149.781
	}
}

Comet	"C66"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            1.77341e-011
	Radius          3.22047
	InertiaMoment   0.398194

	Oblateness      0.00351503

	RotationPeriod  71.2994
	Obliquity       16.5109
	EqAscendNode    209.916

	AbsMagn         11.6109
	SlopeParam      2.44216
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.542 0.540 0.536)

	Surface
	{
		SurfStyle       0.195782
		OceanStyle      0.90476
		Randomize      (-0.938, 0.866, 0.169)
		colorDistMagn   0.867464
		colorDistFreq   0.00857484
		detailScale     87.9402
		colorConversion true
		snowLevel       2
		tropicLatitude  0.692478
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.381221
		terraceProb     0.139405
		erosion         0
		montesMagn      0.575818
		montesFreq      3.2313
		montesSpiky     0.854538
		montesFraction  0.602238
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0295469
		hillsFraction   0.482107
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.265499
		craterFreq      0.162821
		craterDensity   1.02658
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.525173
		volcanoTemp     1716.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.217, 0.216, 0.214, 0.000)
		colorShelf     (0.231, 0.229, 0.228, 0.000)
		colorBeach     (0.244, 0.243, 0.241, 0.000)
		colorDesert    (0.258, 0.256, 0.255, 0.000)
		colorLowland   (0.271, 0.270, 0.268, 0.000)
		colorUpland    (0.285, 0.283, 0.281, 0.000)
		colorRock      (0.298, 0.297, 0.295, 0.000)
		colorSnow      (0.312, 0.310, 0.308, 1.000)
		BumpHeight      2.89842
		BumpOffset      0.579684
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.53579
		GasToDust   0.25
		Particles   2062
		GasBright   0.13532
		DustBright  0.58479
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   24.8915
		Period          126.496
		Eccentricity    0.974279
		Inclination     -129.116
		AscendingNode   121.913
		ArgOfPericenter -73.5594
		MeanAnomaly     38.7728
	}
}

Comet	"C67"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            1.37161e-007
	Radius          73.1678
	InertiaMoment   0.399875

	Oblateness      0.00570858

	RotationPeriod  69.111
	Obliquity       329.717
	EqAscendNode    194.494

	AbsMagn         7.78849
	SlopeParam      3.12067
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.675 0.672 0.668)

	Surface
	{
		SurfStyle       0.53418
		OceanStyle      0.138103
		Randomize      (-0.008, -0.776, -0.605)
		colorDistMagn   0.353527
		colorDistFreq   3.10045
		detailScale     1997.97
		colorConversion true
		snowLevel       2
		tropicLatitude  0.893522
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.481072
		terraceProb     0.173801
		erosion         0
		montesMagn      0.451865
		montesFreq      3.11982
		montesSpiky     0.985521
		montesFraction  0.47464
		dunesFraction   0
		hillsMagn       0
		hillsFreq       12.2774
		hillsFraction   0.693432
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239965
		craterFreq      0.218702
		craterDensity   0.962437
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.426376
		volcanoTemp     1518.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.263, 0.229, 0.187, 0.000)
		colorShelf     (0.270, 0.235, 0.214, 0.000)
		colorBeach     (0.317, 0.276, 0.254, 0.000)
		colorDesert    (0.344, 0.296, 0.247, 0.000)
		colorLowland   (0.378, 0.316, 0.281, 0.000)
		colorUpland    (0.418, 0.383, 0.341, 0.000)
		colorRock      (0.452, 0.417, 0.368, 0.000)
		colorSnow      (0.493, 0.444, 0.388, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0999198
		DustBright  0.304677
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   32.4326
		Period          188.137
		Eccentricity    0.984814
		Inclination     116.068
		AscendingNode   -98.8323
		ArgOfPericenter 56.7101
		MeanAnomaly     -79.9795
	}
}

Comet	"C68"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            4.22327e-015
	Radius          0.195206
	InertiaMoment   0.398755

	Oblateness      0.0037306

	RotationPeriod  66.998
	Obliquity       282.922
	EqAscendNode    179.071

	AbsMagn         3.6996
	SlopeParam      3.70904
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.528 0.442 0.344)

	Surface
	{
		SurfStyle       0.963437
		OceanStyle      0.548586
		Randomize      (0.983, -0.799, -0.511)
		colorDistMagn   0.413227
		colorDistFreq   1.38747e-005
		detailScale     5.33044
		colorConversion true
		snowLevel       2
		tropicLatitude  0.620367
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.398203
		terraceProb     0.453723
		erosion         0
		montesMagn      0.554637
		montesFreq      2.90698
		montesSpiky     0.993281
		montesFraction  0.559196
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.04141e-005
		hillsFraction   0.408777
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241899
		craterFreq      0.187631
		craterDensity   0.897152
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.545585
		volcanoTemp     1594.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.179, 0.155, 0.138, 0.050)
		colorShelf     (0.211, 0.181, 0.158, 0.040)
		colorBeach     (0.243, 0.208, 0.179, 0.030)
		colorDesert    (0.275, 0.234, 0.203, 0.020)
		colorLowland   (0.306, 0.261, 0.224, 0.030)
		colorUpland    (0.338, 0.287, 0.244, 0.050)
		colorRock      (0.370, 0.314, 0.272, 0.020)
		colorSnow      (0.370, 0.314, 0.272, 1.000)
		BumpHeight      0.175686
		BumpOffset      0.0351372
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.087424
		GasToDust   0.25
		Particles   1156
		GasBright   0.272065
		DustBright  0.617018
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   28.9065
		Period          158.304
		Eccentricity    0.984072
		Inclination     -104.766
		AscendingNode   153.208
		ArgOfPericenter -134.809
		MeanAnomaly     -90.2761
	}
}

Comet	"C69"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            3.2664e-011
	Radius          4.53215
	InertiaMoment   0.396865

	Oblateness      0.00637818

	RotationPeriod  64.9485
	Obliquity       236.128
	EqAscendNode    163.648

	AbsMagn         11.3076
	SlopeParam      4.27278
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.678 0.674 0.670)

	Surface
	{
		SurfStyle       0.22711
		OceanStyle      0.0422472
		Randomize      (0.663, 0.390, -0.071)
		colorDistMagn   0.625286
		colorDistFreq   0.0137165
		detailScale     123.758
		colorConversion true
		snowLevel       2
		tropicLatitude  0.185704
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.560534
		terraceProb     0.309002
		erosion         0
		montesMagn      0.482764
		montesFreq      3.68573
		montesSpiky     0.928407
		montesFraction  0.607927
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0565916
		hillsFraction   0.676137
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2164
		craterFreq      0.166534
		craterDensity   0.861838
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.450529
		volcanoTemp     1266.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.271, 0.270, 0.268, 0.000)
		colorShelf     (0.288, 0.287, 0.285, 0.000)
		colorBeach     (0.305, 0.303, 0.301, 0.000)
		colorDesert    (0.322, 0.320, 0.318, 0.000)
		colorLowland   (0.339, 0.337, 0.335, 0.000)
		colorUpland    (0.356, 0.354, 0.351, 0.000)
		colorRock      (0.373, 0.371, 0.368, 0.000)
		colorSnow      (0.390, 0.388, 0.385, 1.000)
		BumpHeight      4.07894
		BumpOffset      0.815787
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.568616
		GasToDust   0.25
		Particles   2128
		GasBright   0.209383
		DustBright  0.364187
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   32.3974
		Period          187.831
		Eccentricity    0.982796
		Inclination     121.677
		AscendingNode   12.4668
		ArgOfPericenter -176.986
		MeanAnomaly     -109.284
	}
}

Comet	"C70"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            2.52632e-007
	Radius          114.763
	InertiaMoment   0.399231

	Oblateness      0.0143792

	RotationPeriod  62.9525
	Obliquity       189.334
	EqAscendNode    148.226

	AbsMagn         7.57918
	SlopeParam      4.85955
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.508 0.503 0.495)

	Surface
	{
		SurfStyle       0.787765
		OceanStyle      0.0153266
		Randomize      (0.503, 0.519, 0.704)
		colorDistMagn   0.934855
		colorDistFreq   8.60369
		detailScale     3133.8
		colorConversion true
		snowLevel       2
		tropicLatitude  0.673292
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.704706
		terraceProb     0.207525
		erosion         0
		montesMagn      0.373725
		montesFreq      3.11747
		montesSpiky     0.958703
		montesFraction  0.665199
		dunesFraction   0
		hillsMagn       0
		hillsFreq       31.3082
		hillsFraction   0.65547
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241456
		craterFreq      0.443654
		craterDensity   0.812237
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.504412
		volcanoTemp     1599.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.198, 0.171, 0.139, 0.000)
		colorShelf     (0.203, 0.176, 0.158, 0.000)
		colorBeach     (0.239, 0.206, 0.188, 0.000)
		colorDesert    (0.259, 0.221, 0.183, 0.000)
		colorLowland   (0.284, 0.236, 0.208, 0.000)
		colorUpland    (0.315, 0.286, 0.252, 0.000)
		colorRock      (0.340, 0.312, 0.272, 0.000)
		colorSnow      (0.371, 0.332, 0.287, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.109441
		DustBright  0.148615
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   19.9456
		Period          90.734
		Eccentricity    0.971846
		Inclination     -129.464
		AscendingNode   -153.644
		ArgOfPericenter 26.8514
		MeanAnomaly     156.251
	}
}

Comet	"C71"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            7.77875e-015
	Radius          0.28073
	InertiaMoment   0.397857

	Oblateness      0.00724243

	RotationPeriod  61.0015
	Obliquity       142.539
	EqAscendNode    132.803

	AbsMagn         3.30718
	SlopeParam      5.53358
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.655 0.574 0.475)

	Surface
	{
		SurfStyle       0.472977
		OceanStyle      0.777143
		Randomize      (-0.276, -0.645, -0.485)
		colorDistMagn   0.537864
		colorDistFreq   1.98498e-005
		detailScale     7.66581
		colorConversion true
		snowLevel       2
		tropicLatitude  0.480672
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.651057
		terraceProb     0.26813
		erosion         0
		montesMagn      0.461341
		montesFreq      3.12281
		montesSpiky     0.934993
		montesFraction  0.491032
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000197966
		hillsFraction   0.436149
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.278344
		craterFreq      0.208994
		craterDensity   0.974923
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.506697
		volcanoTemp     1659.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.262, 0.230, 0.190, 0.000)
		colorShelf     (0.278, 0.244, 0.202, 0.000)
		colorBeach     (0.295, 0.258, 0.214, 0.000)
		colorDesert    (0.311, 0.273, 0.225, 0.000)
		colorLowland   (0.327, 0.287, 0.237, 0.000)
		colorUpland    (0.344, 0.301, 0.249, 0.000)
		colorRock      (0.360, 0.316, 0.261, 0.000)
		colorSnow      (0.376, 0.330, 0.273, 1.000)
		BumpHeight      0.252657
		BumpOffset      0.0505315
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.12025
		GasToDust   0.25
		Particles   1222
		GasBright   0.358754
		DustBright  0.383789
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   26.0857
		Period          135.708
		Eccentricity    0.972873
		Inclination     171.122
		AscendingNode   -170.733
		ArgOfPericenter 99.6269
		MeanAnomaly     62.9319
	}
}

Comet	"C72"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            6.0163e-011
	Radius          6.8982
	InertiaMoment   0.399666

	Oblateness      0.0149085

	RotationPeriod  59.088
	Obliquity       95.7451
	EqAscendNode    117.381

	AbsMagn         11.0223
	SlopeParam      6.45809
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.646 0.642 0.638)

	Surface
	{
		SurfStyle       0.598447
		OceanStyle      0.153794
		Randomize      (-0.537, -0.197, 0.596)
		colorDistMagn   0.501713
		colorDistFreq   0.0311841
		detailScale     188.367
		colorConversion true
		snowLevel       2
		tropicLatitude  0.965394
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.570444
		terraceProb     0.212876
		erosion         0
		montesMagn      0.388492
		montesFreq      3.623
		montesSpiky     0.899419
		montesFraction  0.566992
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.133921
		hillsFraction   0.661484
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258526
		craterFreq      0.275744
		craterDensity   0.92057
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.486065
		volcanoTemp     1632.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.252, 0.218, 0.179, 0.000)
		colorShelf     (0.258, 0.225, 0.204, 0.000)
		colorBeach     (0.304, 0.263, 0.242, 0.000)
		colorDesert    (0.329, 0.283, 0.236, 0.000)
		colorLowland   (0.362, 0.302, 0.268, 0.000)
		colorUpland    (0.400, 0.366, 0.325, 0.000)
		colorRock      (0.433, 0.398, 0.351, 0.000)
		colorSnow      (0.472, 0.424, 0.370, 1.000)
		BumpHeight      6.20838
		BumpOffset      1.24168
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.601442
		GasToDust   0.25
		Particles   2194
		GasBright   0.0180154
		DustBright  0.409014
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   35.8771
		Period          218.89
		Eccentricity    0.977661
		Inclination     163.662
		AscendingNode   -126.056
		ArgOfPericenter -2.80626
		MeanAnomaly     1.3224
	}
}

Comet	"C73"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            4.65318e-007
	Radius          109.717
	InertiaMoment   0.398493

	Oblateness      0.00823842

	RotationPeriod  57.2054
	Obliquity       48.9508
	EqAscendNode    101.958

	AbsMagn         7.36871
	SlopeParam      2.02096
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.800 0.754 0.665)

	Surface
	{
		SurfStyle       0.948575
		OceanStyle      0.78212
		Randomize      (-0.652, 0.765, -0.078)
		colorDistMagn   0.176315
		colorDistFreq   6.0891
		detailScale     2996.01
		colorConversion true
		snowLevel       2
		tropicLatitude  0.792853
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.44777
		terraceProb     0.166975
		erosion         0
		montesMagn      0.499186
		montesFreq      2.37589
		montesSpiky     0.888773
		montesFraction  0.464981
		dunesFraction   0
		hillsMagn       0
		hillsFreq       28.7717
		hillsFraction   0.592661
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222515
		craterFreq      0.333616
		craterDensity   0.859002
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.482081
		volcanoTemp     1429.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.272, 0.264, 0.266, 0.050)
		colorShelf     (0.320, 0.309, 0.306, 0.040)
		colorBeach     (0.368, 0.355, 0.346, 0.030)
		colorDesert    (0.416, 0.400, 0.392, 0.020)
		colorLowland   (0.464, 0.445, 0.432, 0.030)
		colorUpland    (0.512, 0.490, 0.472, 0.050)
		colorRock      (0.560, 0.536, 0.525, 0.020)
		colorSnow      (0.560, 0.536, 0.525, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0922755
		DustBright  0.819241
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   21.4929
		Period          101.494
		Eccentricity    0.957983
		Inclination     -153.927
		AscendingNode   93.379
		ArgOfPericenter -28.3797
		MeanAnomaly     142.388
	}
}

Comet	"C74"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            1.43275e-014
	Radius          0.419837
	InertiaMoment   0.395772

	Oblateness      0.0158521

	RotationPeriod  55.3476
	Obliquity       2.15653
	EqAscendNode    86.5356

	AbsMagn         2.86349
	SlopeParam      2.79416
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.556 0.552 0.549)

	Surface
	{
		SurfStyle       0.614024
		OceanStyle      0.197786
		Randomize      (-0.457, 0.962, -0.208)
		colorDistMagn   0.866199
		colorDistFreq   0.000153134
		detailScale     11.4644
		colorConversion true
		snowLevel       2
		tropicLatitude  0.524361
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.541903
		terraceProb     0.369547
		erosion         0
		montesMagn      0.419502
		montesFreq      2.49855
		montesSpiky     0.998537
		montesFraction  0.413497
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000446588
		hillsFraction   0.741068
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250053
		craterFreq      0.246505
		craterDensity   0.836572
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.512539
		volcanoTemp     1320.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.217, 0.188, 0.154, 0.000)
		colorShelf     (0.222, 0.193, 0.176, 0.000)
		colorBeach     (0.261, 0.226, 0.209, 0.000)
		colorDesert    (0.283, 0.243, 0.203, 0.000)
		colorLowland   (0.311, 0.259, 0.231, 0.000)
		colorUpland    (0.345, 0.315, 0.280, 0.000)
		colorRock      (0.372, 0.342, 0.302, 0.000)
		colorSnow      (0.406, 0.364, 0.318, 1.000)
		BumpHeight      0.377853
		BumpOffset      0.0755707
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.153076
		GasToDust   0.25
		Particles   1289
		GasBright   0.0955263
		DustBright  0.500476
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   31.7612
		Period          182.325
		Eccentricity    0.969722
		Inclination     -33.5898
		AscendingNode   -23.6754
		ArgOfPericenter -168.3
		MeanAnomaly     -52.1212
	}
}

Comet	"C75"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            1.10813e-010
	Radius          6.79612
	InertiaMoment   0.399003

	Oblateness      0.00941479

	RotationPeriod  53.5091
	Obliquity       315.362
	EqAscendNode    71.113

	AbsMagn         10.7516
	SlopeParam      3.41712
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.652 0.490 0.433)

	Surface
	{
		SurfStyle       0.55084
		OceanStyle      0.838143
		Randomize      (-0.742, -0.155, -0.861)
		colorDistMagn   0.753312
		colorDistFreq   0.0337452
		detailScale     185.579
		colorConversion true
		snowLevel       2
		tropicLatitude  0.93764
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.390493
		terraceProb     0.340851
		erosion         0
		montesMagn      0.535113
		montesFreq      2.67337
		montesSpiky     0.988811
		montesFraction  0.6903
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.119256
		hillsFraction   0.470914
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.266167
		craterFreq      0.147775
		craterDensity   0.869568
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.533932
		volcanoTemp     1555
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.254, 0.167, 0.121, 0.000)
		colorShelf     (0.261, 0.171, 0.139, 0.000)
		colorBeach     (0.306, 0.201, 0.165, 0.000)
		colorDesert    (0.332, 0.215, 0.160, 0.000)
		colorLowland   (0.365, 0.230, 0.182, 0.000)
		colorUpland    (0.404, 0.279, 0.221, 0.000)
		colorRock      (0.437, 0.304, 0.238, 0.000)
		colorSnow      (0.476, 0.323, 0.251, 1.000)
		BumpHeight      6.11651
		BumpOffset      1.2233
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.634268
		GasToDust   0.25
		Particles   2261
		GasBright   0.0615179
		DustBright  0.218971
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   16.7893
		Period          70.0727
		Eccentricity    0.955389
		Inclination     146.598
		AscendingNode   -50.4238
		ArgOfPericenter -108.687
		MeanAnomaly     2.7828
	}
}

Comet	"C76"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            3.412e-018
	Radius          0.0256851
	InertiaMoment   0.397446

	Oblateness      0.0175892

	RotationPeriod  51.685
	Obliquity       268.568
	EqAscendNode    55.6904

	AbsMagn         7.15647
	SlopeParam      3.98714
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.611 0.609 0.604)

	Surface
	{
		SurfStyle       0.530214
		OceanStyle      0.506113
		Randomize      (0.424, -0.635, -0.522)
		colorDistMagn   0.851069
		colorDistFreq   2.54421e-007
		detailScale     0.701376
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999691
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.482737
		terraceProb     0.438275
		erosion         0
		montesMagn      0.673802
		montesFreq      3.03652
		montesSpiky     0.770057
		montesFraction  0.430885
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.51584e-006
		hillsFraction   0.759481
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228084
		craterFreq      0.217968
		craterDensity   0.84649
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.551088
		volcanoTemp     1661.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.238, 0.207, 0.169, 0.000)
		colorShelf     (0.244, 0.213, 0.193, 0.000)
		colorBeach     (0.287, 0.250, 0.230, 0.000)
		colorDesert    (0.312, 0.268, 0.224, 0.000)
		colorLowland   (0.342, 0.286, 0.254, 0.000)
		colorUpland    (0.379, 0.347, 0.308, 0.000)
		colorRock      (0.409, 0.377, 0.332, 0.000)
		colorSnow      (0.446, 0.402, 0.350, 1.000)
		BumpHeight      0.0231166
		BumpOffset      0.00462333
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.212945
		DustBright  0.552031
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   25.8608
		Period          133.957
		Eccentricity    0.971807
		Inclination     13.0794
		AscendingNode   90.1314
		ArgOfPericenter -33.7362
		MeanAnomaly     -102.025
	}
}

Comet	"C77"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            2.63894e-014
	Radius          0.420967
	InertiaMoment   0.399455

	Oblateness      0.0108353

	RotationPeriod  49.8702
	Obliquity       221.774
	EqAscendNode    40.2678

	AbsMagn         2.34561
	SlopeParam      4.55609
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.489 0.483 0.476)

	Surface
	{
		SurfStyle       0.442839
		OceanStyle      0.43046
		Randomize      (0.419, -0.657, 0.057)
		colorDistMagn   0.611856
		colorDistFreq   0.000115387
		detailScale     11.4952
		colorConversion true
		snowLevel       2
		tropicLatitude  0.874168
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.536929
		terraceProb     0.362831
		erosion         0
		montesMagn      0.248046
		montesFreq      2.396
		montesSpiky     0.99347
		montesFraction  0.361385
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000351553
		hillsFraction   0.642823
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252606
		craterFreq      0.185088
		craterDensity   1.01619
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.512138
		volcanoTemp     1548.82
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.196, 0.193, 0.190, 0.000)
		colorShelf     (0.208, 0.205, 0.202, 0.000)
		colorBeach     (0.220, 0.217, 0.214, 0.000)
		colorDesert    (0.232, 0.230, 0.226, 0.000)
		colorLowland   (0.244, 0.242, 0.238, 0.000)
		colorUpland    (0.257, 0.254, 0.250, 0.000)
		colorRock      (0.269, 0.266, 0.262, 0.000)
		colorSnow      (0.281, 0.278, 0.274, 1.000)
		BumpHeight      0.37887
		BumpOffset      0.075774
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.185902
		GasToDust   0.25
		Particles   1355
		GasBright   0.151655
		DustBright  0.297808
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   39.5894
		Period          253.729
		Eccentricity    0.989956
		Inclination     -80.0026
		AscendingNode   -159.642
		ArgOfPericenter 70.2241
		MeanAnomaly     21.187
	}
}

Comet	"C78"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            2.04103e-010
	Radius          9.94323
	InertiaMoment   0.398202

	Oblateness      0.0197847

	RotationPeriod  48.0602
	Obliquity       174.979
	EqAscendNode    24.8452

	AbsMagn         10.4929
	SlopeParam      5.17513
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.547 0.443 0.395)

	Surface
	{
		SurfStyle       0.612101
		OceanStyle      0.295326
		Randomize      (-0.000, 0.478, -0.316)
		colorDistMagn   0.923502
		colorDistFreq   0.026865
		detailScale     271.517
		colorConversion true
		snowLevel       2
		tropicLatitude  0.966582
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.532975
		terraceProb     0.432029
		erosion         0
		montesMagn      0.399124
		montesFreq      2.98118
		montesSpiky     0.916801
		montesFraction  0.483172
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.153863
		hillsFraction   0.597127
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226453
		craterFreq      0.186952
		craterDensity   0.990366
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.482291
		volcanoTemp     1249.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.213, 0.150, 0.111, 0.000)
		colorShelf     (0.219, 0.155, 0.126, 0.000)
		colorBeach     (0.257, 0.181, 0.150, 0.000)
		colorDesert    (0.279, 0.195, 0.146, 0.000)
		colorLowland   (0.306, 0.208, 0.166, 0.000)
		colorUpland    (0.339, 0.252, 0.202, 0.000)
		colorRock      (0.367, 0.274, 0.217, 0.000)
		colorSnow      (0.399, 0.292, 0.229, 1.000)
		BumpHeight      8.94891
		BumpOffset      1.78978
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.667094
		GasToDust   0.25
		Particles   2327
		GasBright   0.370273
		DustBright  0.563676
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   20.2745
		Period          92.9878
		Eccentricity    0.977783
		Inclination     100.55
		AscendingNode   149.296
		ArgOfPericenter 70.3957
		MeanAnomaly     84.4206
	}
}

Comet	"C79"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            6.28448e-018
	Radius          0.0260756
	InertiaMoment   0.39988

	Oblateness      0.0125923

	RotationPeriod  46.2504
	Obliquity       128.185
	EqAscendNode    9.42261

	AbsMagn         6.94183
	SlopeParam      5.9375
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.814 0.789 0.765)

	Surface
	{
		SurfStyle       0.858584
		OceanStyle      0.874133
		Randomize      (0.419, 0.214, 0.800)
		colorDistMagn   0.483691
		colorDistFreq   2.61996e-007
		detailScale     0.712039
		colorConversion true
		snowLevel       2
		tropicLatitude  0.974479
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.602138
		terraceProb     0.295783
		erosion         0
		montesMagn      0.509069
		montesFreq      2.40604
		montesSpiky     0.889094
		montesFraction  0.204715
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.09947e-006
		hillsFraction   0.789729
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.194913
		craterFreq      0.228343
		craterDensity   0.88816
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.511493
		volcanoTemp     1382.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.277, 0.276, 0.306, 0.050)
		colorShelf     (0.326, 0.324, 0.352, 0.040)
		colorBeach     (0.375, 0.371, 0.398, 0.030)
		colorDesert    (0.424, 0.418, 0.451, 0.020)
		colorLowland   (0.472, 0.466, 0.497, 0.030)
		colorUpland    (0.521, 0.513, 0.543, 0.050)
		colorRock      (0.570, 0.560, 0.604, 0.020)
		colorSnow      (0.570, 0.560, 0.604, 1.000)
		BumpHeight      0.0234681
		BumpOffset      0.00469362
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.2817
		DustBright  0.336735
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   29.9409
		Period          166.877
		Eccentricity    0.968248
		Inclination     52.1254
		AscendingNode   -166.783
		ArgOfPericenter -26.4697
		MeanAnomaly     -94.0664
	}
}

Comet	"C80"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            4.8606e-014
	Radius          0.61117
	InertiaMoment   0.398761

	Oblateness      0.0226153

	RotationPeriod  44.4361
	Obliquity       81.3907
	EqAscendNode    354

	AbsMagn         1.7105
	SlopeParam      7.20979
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.830 0.775 0.724)

	Surface
	{
		SurfStyle       0.961829
		OceanStyle      0.0835054
		Randomize      (0.297, -0.834, -0.342)
		colorDistMagn   0.484278
		colorDistFreq   0.000137237
		detailScale     16.689
		colorConversion true
		snowLevel       2
		tropicLatitude  0.740435
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.547954
		terraceProb     0.286145
		erosion         0
		montesMagn      0.608574
		montesFreq      3.30242
		montesSpiky     0.994328
		montesFraction  0.650823
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000984093
		hillsFraction   0.737271
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258256
		craterFreq      0.231724
		craterDensity   0.722536
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.416018
		volcanoTemp     1542.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.282, 0.271, 0.290, 0.050)
		colorShelf     (0.332, 0.318, 0.333, 0.040)
		colorBeach     (0.382, 0.364, 0.377, 0.030)
		colorDesert    (0.431, 0.411, 0.427, 0.020)
		colorLowland   (0.481, 0.457, 0.471, 0.030)
		colorUpland    (0.531, 0.504, 0.514, 0.050)
		colorRock      (0.581, 0.550, 0.572, 0.020)
		colorSnow      (0.581, 0.550, 0.572, 1.000)
		BumpHeight      0.550053
		BumpOffset      0.110011
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.218728
		GasToDust   0.25
		Particles   1421
		GasBright   0.00440745
		DustBright  0.298515
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   22.7461
		Period          110.5
		Eccentricity    0.972686
		Inclination     50.8594
		AscendingNode   -1.43565
		ArgOfPericenter 82.9242
		MeanAnomaly     134.919
	}
}

Comet	"C81"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            3.75932e-010
	Radius          10.1911
	InertiaMoment   0.396883

	Oblateness      0.0146386

	RotationPeriod  42.6127
	Obliquity       34.5964
	EqAscendNode    338.577

	AbsMagn         10.2443
	SlopeParam      2.43168
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.697 0.631 0.502)

	Surface
	{
		SurfStyle       0.373297
		OceanStyle      0.826616
		Randomize      (0.684, 0.982, 0.644)
		colorDistMagn   0.160389
		colorDistFreq   0.0776724
		detailScale     278.286
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998375
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.567518
		terraceProb     0.178118
		erosion         0
		montesMagn      0.543964
		montesFreq      3.11587
		montesSpiky     0.911128
		montesFraction  0.558458
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.214399
		hillsFraction   0.458077
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218763
		craterFreq      0.178823
		craterDensity   0.955974
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.492455
		volcanoTemp     1261.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.279, 0.253, 0.201, 0.000)
		colorShelf     (0.296, 0.268, 0.213, 0.000)
		colorBeach     (0.314, 0.284, 0.226, 0.000)
		colorDesert    (0.331, 0.300, 0.238, 0.000)
		colorLowland   (0.349, 0.316, 0.251, 0.000)
		colorUpland    (0.366, 0.331, 0.263, 0.000)
		colorRock      (0.383, 0.347, 0.276, 0.000)
		colorSnow      (0.401, 0.363, 0.288, 1.000)
		BumpHeight      9.17202
		BumpOffset      1.8344
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.69992
		GasToDust   0.25
		Particles   2393
		GasBright   0.0579494
		DustBright  0.729459
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   38.2796
		Period          241.241
		Eccentricity    0.985343
		Inclination     -58.7763
		AscendingNode   -139.596
		ArgOfPericenter -2.98578
		MeanAnomaly     -22.9918
	}
}

Comet	"C82"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            1.15752e-017
	Radius          0.0376133
	InertiaMoment   0.399236

	Oblateness      0.026336

	RotationPeriod  40.7754
	Obliquity       347.802
	EqAscendNode    323.155

	AbsMagn         6.7241
	SlopeParam      3.11216
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.683 0.595 0.528)

	Surface
	{
		SurfStyle       0.558576
		OceanStyle      0.291061
		Randomize      (-0.307, -0.784, 0.945)
		colorDistMagn   0.422073
		colorDistFreq   9.46406e-007
		detailScale     1.02709
		colorConversion true
		snowLevel       2
		tropicLatitude  0.281673
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.387386
		terraceProb     0.176865
		erosion         0
		montesMagn      0.510969
		montesFreq      3.7532
		montesSpiky     0.881957
		montesFraction  0.62801
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.51238e-006
		hillsFraction   0.695823
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224994
		craterFreq      0.25071
		craterDensity   0.807233
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.567265
		volcanoTemp     1489.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.266, 0.202, 0.148, 0.000)
		colorShelf     (0.273, 0.208, 0.169, 0.000)
		colorBeach     (0.321, 0.244, 0.201, 0.000)
		colorDesert    (0.348, 0.262, 0.195, 0.000)
		colorLowland   (0.382, 0.280, 0.222, 0.000)
		colorUpland    (0.423, 0.339, 0.269, 0.000)
		colorRock      (0.457, 0.369, 0.290, 0.000)
		colorSnow      (0.498, 0.393, 0.306, 1.000)
		BumpHeight      0.0338519
		BumpOffset      0.00677039
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0625923
		DustBright  0.409303
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   27.2277
		Period          144.716
		Eccentricity    0.973259
		Inclination     156.284
		AscendingNode   139.508
		ArgOfPericenter -169.8
		MeanAnomaly     -131.288
	}
}

Comet	"C83"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            8.95263e-014
	Radius          0.631264
	InertiaMoment   0.397867

	Oblateness      0.0175784

	RotationPeriod  38.9191
	Obliquity       301.008
	EqAscendNode    307.732

	AbsMagn         0.859645
	SlopeParam      3.70124
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.462 0.394 0.368)

	Surface
	{
		SurfStyle       0.354612
		OceanStyle      0.42577
		Randomize      (0.951, 0.898, 0.908)
		colorDistMagn   0.97997
		colorDistFreq   0.000324583
		detailScale     17.2377
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999185
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.667861
		terraceProb     0.195483
		erosion         0
		montesMagn      0.64206
		montesFreq      4.08079
		montesSpiky     0.956952
		montesFraction  0.590987
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000781803
		hillsFraction   0.777764
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246909
		craterFreq      0.203563
		craterDensity   0.856776
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.530444
		volcanoTemp     1569.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.185, 0.157, 0.147, 0.000)
		colorShelf     (0.196, 0.167, 0.156, 0.000)
		colorBeach     (0.208, 0.177, 0.165, 0.000)
		colorDesert    (0.219, 0.187, 0.175, 0.000)
		colorLowland   (0.231, 0.197, 0.184, 0.000)
		colorUpland    (0.242, 0.207, 0.193, 0.000)
		colorRock      (0.254, 0.217, 0.202, 0.000)
		colorSnow      (0.265, 0.226, 0.211, 1.000)
		BumpHeight      0.568137
		BumpOffset      0.113627
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.251554
		GasToDust   0.25
		Particles   1487
		GasBright   0.183325
		DustBright  0.773057
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   27.6247
		Period          147.893
		Eccentricity    0.973932
		Inclination     -65.7533
		AscendingNode   71.1938
		ArgOfPericenter -73.4799
		MeanAnomaly     -141.06
	}
}

Comet	"C84"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            6.9242e-010
	Radius          14.6191
	InertiaMoment   0.399672

	Oblateness      0.0313798

	RotationPeriod  37.0382
	Obliquity       254.214
	EqAscendNode    292.31

	AbsMagn         10.004
	SlopeParam      4.26499
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.769 0.697 0.608)

	Surface
	{
		SurfStyle       0.93814
		OceanStyle      0.461044
		Randomize      (0.289, 0.910, 0.423)
		colorDistMagn   0.117337
		colorDistFreq   0.160971
		detailScale     399.198
		colorConversion true
		snowLevel       2
		tropicLatitude  0.996225
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.494364
		terraceProb     0.233676
		erosion         0
		montesMagn      0.442619
		montesFreq      2.40887
		montesSpiky     0.899418
		montesFraction  0.451058
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.270193
		hillsFraction   0.593789
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255672
		craterFreq      0.252062
		craterDensity   0.849345
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.529588
		volcanoTemp     1442.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.262, 0.244, 0.243, 0.050)
		colorShelf     (0.308, 0.286, 0.280, 0.040)
		colorBeach     (0.354, 0.328, 0.316, 0.030)
		colorDesert    (0.400, 0.370, 0.359, 0.020)
		colorLowland   (0.446, 0.411, 0.395, 0.030)
		colorUpland    (0.492, 0.453, 0.432, 0.050)
		colorRock      (0.538, 0.495, 0.480, 0.020)
		colorSnow      (0.538, 0.495, 0.480, 1.000)
		BumpHeight      13.1572
		BumpOffset      2.63143
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.732746
		GasToDust   0.25
		Particles   2460
		GasBright   0.160685
		DustBright  0.480183
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   26.6367
		Period          140.03
		Eccentricity    0.975269
		Inclination     26.9149
		AscendingNode   69.0461
		ArgOfPericenter 106.8
		MeanAnomaly     25.7132
	}
}

Comet	"C85"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            2.13201e-017
	Radius          0.039102
	InertiaMoment   0.3985

	Oblateness      0.0215863

	RotationPeriod  35.127
	Obliquity       207.419
	EqAscendNode    276.887

	AbsMagn         6.50252
	SlopeParam      4.85109
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.693 0.690 0.687)

	Surface
	{
		SurfStyle       0.857999
		OceanStyle      0.913803
		Randomize      (-0.469, -0.856, 0.051)
		colorDistMagn   0.89027
		colorDistFreq   4.55036e-007
		detailScale     1.06774
		colorConversion true
		snowLevel       2
		tropicLatitude  0.392109
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.327298
		terraceProb     0.335984
		erosion         0
		montesMagn      0.406819
		montesFreq      3.10088
		montesSpiky     0.88513
		montesFraction  0.640856
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.04261e-006
		hillsFraction   0.498215
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.21046
		craterFreq      0.228231
		craterDensity   0.869136
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.567324
		volcanoTemp     1677.95
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.236, 0.242, 0.275, 0.050)
		colorShelf     (0.277, 0.283, 0.316, 0.040)
		colorBeach     (0.319, 0.325, 0.357, 0.030)
		colorDesert    (0.360, 0.366, 0.405, 0.020)
		colorLowland   (0.402, 0.407, 0.446, 0.030)
		colorUpland    (0.444, 0.449, 0.488, 0.050)
		colorRock      (0.485, 0.490, 0.542, 0.020)
		colorSnow      (0.485, 0.490, 0.542, 1.000)
		BumpHeight      0.0351918
		BumpOffset      0.00703835
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.100787
		DustBright  0.224568
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   37.2188
		Period          231.283
		Eccentricity    0.979606
		Inclination     5.69035
		AscendingNode   -143.35
		ArgOfPericenter -60.0937
		MeanAnomaly     -13.8076
	}
}

Comet	"C86"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            1.64896e-013
	Radius          0.901162
	InertiaMoment   0.39582

	Oblateness      0.0379113

	RotationPeriod  33.1787
	Obliquity       160.625
	EqAscendNode    261.464

	AbsMagn         -0.546414
	SlopeParam      5.52324
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.758 0.756 0.755)

	Surface
	{
		SurfStyle       0.907752
		OceanStyle      0.929675
		Randomize      (0.964, -0.338, 0.648)
		colorDistMagn   0.960975
		colorDistFreq   0.00041704
		detailScale     24.6077
		colorConversion true
		snowLevel       2
		tropicLatitude  0.606201
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.279588
		terraceProb     0.163458
		erosion         0
		montesMagn      0.397397
		montesFreq      2.9508
		montesSpiky     0.89213
		montesFraction  0.579455
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00180821
		hillsFraction   0.554196
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240131
		craterFreq      0.209603
		craterDensity   1.03163
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.615652
		volcanoTemp     1301.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.258, 0.265, 0.302, 0.050)
		colorShelf     (0.303, 0.310, 0.347, 0.040)
		colorBeach     (0.349, 0.355, 0.392, 0.030)
		colorDesert    (0.394, 0.401, 0.445, 0.020)
		colorLowland   (0.440, 0.446, 0.491, 0.030)
		colorUpland    (0.485, 0.492, 0.536, 0.050)
		colorRock      (0.531, 0.537, 0.596, 0.020)
		colorSnow      (0.531, 0.537, 0.596, 1.000)
		BumpHeight      0.811046
		BumpOffset      0.162209
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.28438
		GasToDust   0.25
		Particles   1554
		GasBright   0.298687
		DustBright  0.511155
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   31.679
		Period          181.617
		Eccentricity    0.979749
		Inclination     160.734
		AscendingNode   -29.5452
		ArgOfPericenter 178.727
		MeanAnomaly     48.1573
	}
}

Comet	"C87"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            1.27535e-009
	Radius          15.2823
	InertiaMoment   0.399009

	Oblateness      0.0273839

	RotationPeriod  31.186
	Obliquity       113.831
	EqAscendNode    246.042

	AbsMagn         9.77077
	SlopeParam      6.44175
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.666 0.664 0.662)

	Surface
	{
		SurfStyle       0.379137
		OceanStyle      0.0499682
		Randomize      (0.388, -0.428, -0.895)
		colorDistMagn   0.180321
		colorDistFreq   0.0602618
		detailScale     417.308
		colorConversion true
		snowLevel       2
		tropicLatitude  0.844342
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.683645
		terraceProb     0.143389
		erosion         0
		montesMagn      0.575748
		montesFreq      3.29601
		montesSpiky     0.963814
		montesFraction  0.680157
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.681409
		hillsFraction   0.7286
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249418
		craterFreq      0.235896
		craterDensity   0.820507
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.548063
		volcanoTemp     1122.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.267, 0.266, 0.265, 0.000)
		colorShelf     (0.283, 0.282, 0.281, 0.000)
		colorBeach     (0.300, 0.299, 0.298, 0.000)
		colorDesert    (0.317, 0.315, 0.314, 0.000)
		colorLowland   (0.333, 0.332, 0.331, 0.000)
		colorUpland    (0.350, 0.348, 0.348, 0.000)
		colorRock      (0.367, 0.365, 0.364, 0.000)
		colorSnow      (0.383, 0.382, 0.381, 1.000)
		BumpHeight      13.754
		BumpOffset      2.75081
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.765572
		GasToDust   0.25
		Particles   2526
		GasBright   0.211507
		DustBright  0.282822
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   38.0137
		Period          238.732
		Eccentricity    0.984006
		Inclination     78.9201
		AscendingNode   -133.107
		ArgOfPericenter -168.502
		MeanAnomaly     161.053
	}
}

Comet	"C88"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            3.9269e-017
	Radius          0.0555811
	InertiaMoment   0.397457

	Oblateness      0.0487189

	RotationPeriod  29.1404
	Obliquity       67.0364
	EqAscendNode    230.619

	AbsMagn         6.27624
	SlopeParam      2.00833
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.797 0.794 0.792)

	Surface
	{
		SurfStyle       0.290388
		OceanStyle      0.0599969
		Randomize      (0.961, -0.619, 0.759)
		colorDistMagn   0.275754
		colorDistFreq   2.09816e-006
		detailScale     1.51774
		colorConversion true
		snowLevel       2
		tropicLatitude  0.074933
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.350465
		terraceProb     0.161944
		erosion         0
		montesMagn      0.506733
		montesFreq      1.9685
		montesSpiky     0.873263
		montesFraction  0.663346
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.69127e-006
		hillsFraction   0.552014
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226349
		craterFreq      0.179383
		craterDensity   0.859654
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.562969
		volcanoTemp     1275.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.319, 0.318, 0.317, 0.000)
		colorShelf     (0.339, 0.337, 0.337, 0.000)
		colorBeach     (0.358, 0.357, 0.356, 0.000)
		colorDesert    (0.378, 0.377, 0.376, 0.000)
		colorLowland   (0.398, 0.397, 0.396, 0.000)
		colorUpland    (0.418, 0.417, 0.416, 0.000)
		colorRock      (0.438, 0.437, 0.436, 0.000)
		colorSnow      (0.458, 0.457, 0.455, 1.000)
		BumpHeight      0.050023
		BumpOffset      0.0100046
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.476596
		DustBright  0.502218
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   28.666
		Period          156.333
		Eccentricity    0.983698
		Inclination     116.198
		AscendingNode   -3.11273
		ArgOfPericenter -10.8835
		MeanAnomaly     114.734
	}
}

Comet	"C89"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            3.03718e-013
	Radius          0.946621
	InertiaMoment   0.39946

	Oblateness      0.0364353

	RotationPeriod  27.0319
	Obliquity       20.2421
	EqAscendNode    215.197

	AbsMagn         17.0218
	SlopeParam      2.7849
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.643 0.595 0.550)

	Surface
	{
		SurfStyle       0.189437
		OceanStyle      0.1901
		Randomize      (0.504, -0.125, -0.955)
		colorDistMagn   0.83301
		colorDistFreq   0.000249588
		detailScale     25.8491
		colorConversion true
		snowLevel       2
		tropicLatitude  0.177856
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.535163
		terraceProb     0.639141
		erosion         0
		montesMagn      0.479812
		montesFreq      2.61113
		montesSpiky     0.931905
		montesFraction  0.560913
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00222175
		hillsFraction   0.793723
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2558
		craterFreq      0.173068
		craterDensity   0.983353
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.502835
		volcanoTemp     1202.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.257, 0.238, 0.220, 0.000)
		colorShelf     (0.273, 0.253, 0.234, 0.000)
		colorBeach     (0.289, 0.268, 0.248, 0.000)
		colorDesert    (0.305, 0.283, 0.261, 0.000)
		colorLowland   (0.322, 0.297, 0.275, 0.000)
		colorUpland    (0.338, 0.312, 0.289, 0.000)
		colorRock      (0.354, 0.327, 0.303, 0.000)
		colorSnow      (0.370, 0.342, 0.316, 1.000)
		BumpHeight      0.851959
		BumpOffset      0.170392
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.317206
		GasToDust   0.25
		Particles   1620
		GasBright   0.0304834
		DustBright  0.632818
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   43.8339
		Period          295.608
		Eccentricity    0.982993
		Inclination     -170.001
		AscendingNode   -179.138
		ArgOfPericenter 59.0424
		MeanAnomaly     -155.974
	}
}

Comet	"C90"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            2.34904e-009
	Radius          21.6395
	InertiaMoment   0.398209

	Oblateness      0.066285

	RotationPeriod  24.8489
	Obliquity       333.448
	EqAscendNode    199.774

	AbsMagn         9.54342
	SlopeParam      3.40907
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.478 0.469 0.466)

	Surface
	{
		SurfStyle       0.674284
		OceanStyle      0.410355
		Randomize      (-0.189, 0.078, -0.123)
		colorDistMagn   0.889938
		colorDistFreq   0.160557
		detailScale     590.902
		colorConversion true
		snowLevel       2
		tropicLatitude  0.974015
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.522872
		terraceProb     0.108126
		erosion         0
		montesMagn      0.394801
		montesFreq      2.70504
		montesSpiky     0.898445
		montesFraction  0.568323
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.21946
		hillsFraction   0.585708
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246981
		craterFreq      0.226923
		craterDensity   1.00351
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.400394
		volcanoTemp     994.566
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.186, 0.160, 0.130, 0.000)
		colorShelf     (0.191, 0.164, 0.149, 0.000)
		colorBeach     (0.225, 0.192, 0.177, 0.000)
		colorDesert    (0.244, 0.206, 0.172, 0.000)
		colorLowland   (0.268, 0.221, 0.196, 0.000)
		colorUpland    (0.296, 0.267, 0.238, 0.000)
		colorRock      (0.320, 0.291, 0.256, 0.000)
		colorSnow      (0.349, 0.310, 0.270, 1.000)
		BumpHeight      19.4755
		BumpOffset      3.89511
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.798398
		GasToDust   0.25
		Particles   2592
		GasBright   0.0365185
		DustBright  0.311269
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   23.0575
		Period          112.777
		Eccentricity    0.981102
		Inclination     127.309
		AscendingNode   27.3876
		ArgOfPericenter -133.561
		MeanAnomaly     -132.767
	}
}

Comet	"C91"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            7.23287e-017
	Radius          0.0586362
	InertiaMoment   0.399885

	Oblateness      0.05221

	RotationPeriod  22.5773
	Obliquity       286.653
	EqAscendNode    184.352

	AbsMagn         6.04431
	SlopeParam      3.97942
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.586 0.583 0.581)

	Surface
	{
		SurfStyle       0.520939
		OceanStyle      0.431527
		Randomize      (-0.804, 0.848, 0.513)
		colorDistMagn   0.750866
		colorDistFreq   4.88441e-007
		detailScale     1.60116
		colorConversion true
		snowLevel       2
		tropicLatitude  0.913938
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.518077
		terraceProb     0.182744
		erosion         0
		montesMagn      0.48037
		montesFreq      2.62876
		montesSpiky     0.817215
		montesFraction  0.575756
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.85664e-006
		hillsFraction   0.866055
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.284163
		craterFreq      0.227115
		craterDensity   0.903084
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.455489
		volcanoTemp     1561.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.228, 0.198, 0.163, 0.000)
		colorShelf     (0.234, 0.204, 0.186, 0.000)
		colorBeach     (0.275, 0.239, 0.221, 0.000)
		colorDesert    (0.299, 0.256, 0.215, 0.000)
		colorLowland   (0.328, 0.274, 0.244, 0.000)
		colorUpland    (0.363, 0.332, 0.296, 0.000)
		colorRock      (0.392, 0.361, 0.319, 0.000)
		colorSnow      (0.428, 0.385, 0.337, 1.000)
		BumpHeight      0.0527726
		BumpOffset      0.0105545
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.136533
		DustBright  0.695742
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   27.9845
		Period          150.792
		Eccentricity    0.972927
		Inclination     134.017
		AscendingNode   28.5841
		ArgOfPericenter -66.8419
		MeanAnomaly     176.72
	}
}

Comet	"C92"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            5.59409e-013
	Radius          1.33576
	InertiaMoment   0.398767

	Oblateness      0.0992795

	RotationPeriod  20.1995
	Obliquity       239.859
	EqAscendNode    168.929

	AbsMagn         15.3613
	SlopeParam      4.54808
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.629 0.623 0.620)

	Surface
	{
		SurfStyle       0.320113
		OceanStyle      0.00726519
		Randomize      (0.236, 0.810, 0.556)
		colorDistMagn   0.363906
		colorDistFreq   0.00111198
		detailScale     36.475
		colorConversion true
		snowLevel       2
		tropicLatitude  0.85335
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.378159
		terraceProb     0.371674
		erosion         0
		montesMagn      0.491869
		montesFreq      2.24722
		montesSpiky     0.969267
		montesFraction  0.407997
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00456404
		hillsFraction   0.666689
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222834
		craterFreq      0.21666
		craterDensity   0.817574
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.472354
		volcanoTemp     1598.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.252, 0.249, 0.248, 0.000)
		colorShelf     (0.267, 0.265, 0.264, 0.000)
		colorBeach     (0.283, 0.280, 0.279, 0.000)
		colorDesert    (0.299, 0.296, 0.295, 0.000)
		colorLowland   (0.315, 0.312, 0.310, 0.000)
		colorUpland    (0.330, 0.327, 0.326, 0.000)
		colorRock      (0.346, 0.343, 0.341, 0.000)
		colorSnow      (0.362, 0.358, 0.357, 1.000)
		BumpHeight      1.20218
		BumpOffset      0.240436
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.350031
		GasToDust   0.25
		Particles   1686
		GasBright   0.115286
		DustBright  0.401475
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   27.5722
		Period          147.471
		Eccentricity    0.991503
		Inclination     41.1985
		AscendingNode   -104.594
		ArgOfPericenter -104.798
		MeanAnomaly     -50.3186
	}
}

Comet	"C93"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            4.32663e-009
	Radius          22.9168
	InertiaMoment   0.3969

	Oblateness      0.0838926

	RotationPeriod  17.6937
	Obliquity       193.065
	EqAscendNode    153.506

	AbsMagn         9.32094
	SlopeParam      5.16598
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.490 0.484 0.481)

	Surface
	{
		SurfStyle       0.195934
		OceanStyle      0.000250374
		Randomize      (-0.590, -0.397, -0.065)
		colorDistMagn   0.799652
		colorDistFreq   0.259142
		detailScale     625.783
		colorConversion true
		snowLevel       2
		tropicLatitude  0.408269
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.635357
		terraceProb     0.478928
		erosion         0
		montesMagn      0.564208
		montesFreq      2.35795
		montesSpiky     0.910705
		montesFraction  0.929667
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.37585
		hillsFraction   0.831634
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259689
		craterFreq      0.163599
		craterDensity   0.836322
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.487821
		volcanoTemp     1631.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.196, 0.194, 0.192, 0.000)
		colorShelf     (0.208, 0.206, 0.204, 0.000)
		colorBeach     (0.220, 0.218, 0.216, 0.000)
		colorDesert    (0.233, 0.230, 0.228, 0.000)
		colorLowland   (0.245, 0.242, 0.240, 0.000)
		colorUpland    (0.257, 0.254, 0.252, 0.000)
		colorRock      (0.269, 0.266, 0.264, 0.000)
		colorSnow      (0.281, 0.278, 0.276, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.831223
		GasToDust   0.25
		Particles   2659
		GasBright   0.0567796
		DustBright  0.144468
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   20.4716
		Period          94.347
		Eccentricity    0.961258
		Inclination     33.917
		AscendingNode   145.938
		ArgOfPericenter 149.292
		MeanAnomaly     177.241
	}
}

Comet	"C94"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            1.3322e-016
	Radius          0.0824788
	InertiaMoment   0.399242

	Oblateness      0.177541

	RotationPeriod  15.0318
	Obliquity       146.271
	EqAscendNode    138.084

	AbsMagn         5.8056
	SlopeParam      5.9252
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.512 0.469 0.385)

	Surface
	{
		SurfStyle       0.0628792
		OceanStyle      0.291636
		Randomize      (-0.583, 0.024, -0.416)
		colorDistMagn   0.57325
		colorDistFreq   1.16358e-006
		detailScale     2.25222
		colorConversion true
		snowLevel       2
		tropicLatitude  0.985141
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.612274
		terraceProb     0.112723
		erosion         0
		montesMagn      0.420944
		montesFreq      3.15869
		montesSpiky     0.878227
		montesFraction  0.323972
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.39992e-005
		hillsFraction   0.493031
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.275443
		craterFreq      0.147679
		craterDensity   0.875865
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.608366
		volcanoTemp     1708.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.205, 0.188, 0.154, 0.000)
		colorShelf     (0.218, 0.199, 0.164, 0.000)
		colorBeach     (0.230, 0.211, 0.173, 0.000)
		colorDesert    (0.243, 0.223, 0.183, 0.000)
		colorLowland   (0.256, 0.235, 0.192, 0.000)
		colorUpland    (0.269, 0.246, 0.202, 0.000)
		colorRock      (0.282, 0.258, 0.212, 0.000)
		colorSnow      (0.295, 0.270, 0.221, 1.000)
		BumpHeight      0.0742309
		BumpOffset      0.0148462
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.233961
		DustBright  0.451773
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   19.6199
		Period          88.5206
		Eccentricity    0.957896
		Inclination     -101.796
		AscendingNode   89.8167
		ArgOfPericenter 29.1539
		MeanAnomaly     -120.014
	}
}

Comet	"C95"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            1.03036e-012
	Radius          1.41953
	InertiaMoment   0.397876

	Oblateness      0.177447

	RotationPeriod  12.176
	Obliquity       99.4763
	EqAscendNode    122.661

	AbsMagn         14.4411
	SlopeParam      7.18213
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.710 0.706 0.702)

	Surface
	{
		SurfStyle       0.477295
		OceanStyle      0.9059
		Randomize      (-0.683, -0.624, -0.700)
		colorDistMagn   0.958093
		colorDistFreq   0.00130489
		detailScale     38.7626
		colorConversion true
		snowLevel       2
		tropicLatitude  0.939473
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.730982
		terraceProb     0.455907
		erosion         0
		montesMagn      0.610915
		montesFreq      3.44703
		montesSpiky     0.915964
		montesFraction  0.489918
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00481375
		hillsFraction   0.566509
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.269376
		craterFreq      0.220947
		craterDensity   0.897272
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.455036
		volcanoTemp     1045.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.284, 0.282, 0.281, 0.000)
		colorShelf     (0.302, 0.300, 0.298, 0.000)
		colorBeach     (0.320, 0.318, 0.316, 0.000)
		colorDesert    (0.337, 0.335, 0.333, 0.000)
		colorLowland   (0.355, 0.353, 0.351, 0.000)
		colorUpland    (0.373, 0.371, 0.369, 0.000)
		colorRock      (0.391, 0.388, 0.386, 0.000)
		colorSnow      (0.408, 0.406, 0.404, 1.000)
		BumpHeight      1.27758
		BumpOffset      0.255515
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.382857
		GasToDust   0.25
		Particles   1753
		GasBright   0.148173
		DustBright  0.222048
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   25.9342
		Period          134.527
		Eccentricity    0.970969
		Inclination     31.8239
		AscendingNode   -158.08
		ArgOfPericenter -57.8312
		MeanAnomaly     68.0812
	}
}

Comet	"C96"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            7.9691e-009
	Radius          32.142
	InertiaMoment   0.399677

	Oblateness      0.249

	RotationPeriod  9.07498
	Obliquity       52.682
	EqAscendNode    107.239

	AbsMagn         9.10249
	SlopeParam      2.42117
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.575 0.472 0.344)

	Surface
	{
		SurfStyle       0.0504274
		OceanStyle      0.870792
		Randomize      (-0.110, 0.364, -0.635)
		colorDistMagn   0.287613
		colorDistFreq   0.107122
		detailScale     877.692
		colorConversion true
		snowLevel       2
		tropicLatitude  0.756101
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.550397
		terraceProb     0.1387
		erosion         0
		montesMagn      0.57771
		montesFreq      2.93362
		montesSpiky     0.829522
		montesFraction  0.598924
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.96247
		hillsFraction   0.761201
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250854
		craterFreq      0.229663
		craterDensity   0.974766
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.532299
		volcanoTemp     1699.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.230, 0.189, 0.138, 0.000)
		colorShelf     (0.244, 0.200, 0.146, 0.000)
		colorBeach     (0.259, 0.212, 0.155, 0.000)
		colorDesert    (0.273, 0.224, 0.164, 0.000)
		colorLowland   (0.287, 0.236, 0.172, 0.000)
		colorUpland    (0.302, 0.248, 0.181, 0.000)
		colorRock      (0.316, 0.259, 0.189, 0.000)
		colorSnow      (0.331, 0.271, 0.198, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.864049
		GasToDust   0.25
		Particles   2725
		GasBright   0.392545
		DustBright  0.462163
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   25.0991
		Period          128.082
		Eccentricity    0.97173
		Inclination     -5.55274
		AscendingNode   48.4297
		ArgOfPericenter -133.014
		MeanAnomaly     174.073
	}
}

Comet	"C97"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            2.45375e-016
	Radius          0.0879294
	InertiaMoment   0.398506

	Oblateness      0.249

	RotationPeriod  5.65441
	Obliquity       5.88769
	EqAscendNode    91.816

	AbsMagn         5.5588
	SlopeParam      3.10364
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.540 0.536 0.529)

	Surface
	{
		SurfStyle       0.510261
		OceanStyle      0.121422
		Randomize      (-0.644, 0.058, -0.849)
		colorDistMagn   0.759121
		colorDistFreq   2.25187e-006
		detailScale     2.40106
		colorConversion true
		snowLevel       2
		tropicLatitude  0.133657
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.547331
		terraceProb     0.288629
		erosion         0
		montesMagn      0.458082
		montesFreq      3.1508
		montesSpiky     0.844748
		montesFraction  0.213663
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.94285e-005
		hillsFraction   0.749729
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236325
		craterFreq      0.209636
		craterDensity   0.836681
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.520675
		volcanoTemp     1600.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.211, 0.182, 0.148, 0.000)
		colorShelf     (0.216, 0.188, 0.169, 0.000)
		colorBeach     (0.254, 0.220, 0.201, 0.000)
		colorDesert    (0.276, 0.236, 0.196, 0.000)
		colorLowland   (0.303, 0.252, 0.222, 0.000)
		colorUpland    (0.335, 0.306, 0.270, 0.000)
		colorRock      (0.362, 0.332, 0.291, 0.000)
		colorSnow      (0.394, 0.354, 0.307, 1.000)
		BumpHeight      0.0791365
		BumpOffset      0.0158273
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.00987755
		DustBright  0.529316
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   25.2668
		Period          129.368
		Eccentricity    0.966219
		Inclination     -177.127
		AscendingNode   -61.5906
		ArgOfPericenter 22.7488
		MeanAnomaly     -143.487
	}
}

Comet	"C98"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            1.8978e-012
	Radius          1.98565
	InertiaMoment   0.395865

	Oblateness      0.00179181

	RotationPeriod  147.152
	Obliquity       319.093
	EqAscendNode    76.3934

	AbsMagn         13.7729
	SlopeParam      3.69344
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.459 0.455 0.454)

	Surface
	{
		SurfStyle       0.798193
		OceanStyle      0.998786
		Randomize      (0.347, -0.344, 0.314)
		colorDistMagn   0.802877
		colorDistFreq   0.000734295
		detailScale     54.2216
		colorConversion true
		snowLevel       2
		tropicLatitude  0.959222
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.353506
		terraceProb     0.171872
		erosion         0
		montesMagn      0.510993
		montesFreq      3.25893
		montesSpiky     0.968763
		montesFraction  0.551042
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0080631
		hillsFraction   0.666944
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229888
		craterFreq      0.176031
		craterDensity   1.01105
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.46048
		volcanoTemp     1343.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.179, 0.155, 0.127, 0.000)
		colorShelf     (0.184, 0.159, 0.145, 0.000)
		colorBeach     (0.216, 0.187, 0.172, 0.000)
		colorDesert    (0.234, 0.200, 0.168, 0.000)
		colorLowland   (0.257, 0.214, 0.190, 0.000)
		colorUpland    (0.285, 0.259, 0.231, 0.000)
		colorRock      (0.308, 0.282, 0.249, 0.000)
		colorSnow      (0.335, 0.300, 0.263, 1.000)
		BumpHeight      1.78709
		BumpOffset      0.357418
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.415683
		GasToDust   0.25
		Particles   1819
		GasBright   0.0173049
		DustBright  0.206376
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   18.05
		Period          78.1119
		Eccentricity    0.970032
		Inclination     66.9093
		AscendingNode   164.01
		ArgOfPericenter -109.462
		MeanAnomaly     82.5306
	}
}

Comet	"C99"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            1.46781e-008
	Radius          34.3656
	InertiaMoment   0.399015

	Oblateness      0.00183226

	RotationPeriod  119.841
	Obliquity       272.299
	EqAscendNode    60.9708

	AbsMagn         8.88728
	SlopeParam      4.25721
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.462 0.460 0.457)

	Surface
	{
		SurfStyle       0.797686
		OceanStyle      0.971221
		Randomize      (0.797, 0.894, 0.448)
		colorDistMagn   0.620041
		colorDistFreq   0.212086
		detailScale     938.41
		colorConversion true
		snowLevel       2
		tropicLatitude  0.991276
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.384539
		terraceProb     0.259895
		erosion         0
		montesMagn      0.525341
		montesFreq      2.98437
		montesSpiky     0.97095
		montesFraction  0.688863
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.13164
		hillsFraction   0.538037
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230425
		craterFreq      0.21972
		craterDensity   0.766118
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49722
		volcanoTemp     1476.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.180, 0.156, 0.128, 0.000)
		colorShelf     (0.185, 0.161, 0.146, 0.000)
		colorBeach     (0.217, 0.189, 0.174, 0.000)
		colorDesert    (0.236, 0.202, 0.169, 0.000)
		colorLowland   (0.259, 0.216, 0.192, 0.000)
		colorUpland    (0.287, 0.262, 0.233, 0.000)
		colorRock      (0.310, 0.285, 0.252, 0.000)
		colorSnow      (0.338, 0.304, 0.265, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.896875
		GasToDust   0.25
		Particles   2791
		GasBright   0.0966008
		DustBright  0.611566
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   33.9369
		Period          201.376
		Eccentricity    0.971307
		Inclination     -168.46
		AscendingNode   62.4354
		ArgOfPericenter 137.677
		MeanAnomaly     7.47459
	}
}

Comet	"C100"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            4.5195e-016
	Radius          0.122693
	InertiaMoment   0.397469

	Oblateness      0.00320774

	RotationPeriod  109.793
	Obliquity       225.505
	EqAscendNode    45.5482

	AbsMagn         5.30233
	SlopeParam      4.84265
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.560 0.555 0.553)

	Surface
	{
		SurfStyle       0.122813
		OceanStyle      0.28658
		Randomize      (0.032, 0.651, -0.517)
		colorDistMagn   0.702067
		colorDistFreq   6.96409e-006
		detailScale     3.35034
		colorConversion true
		snowLevel       2
		tropicLatitude  0.721714
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.621893
		terraceProb     0.325826
		erosion         0
		montesMagn      0.481116
		montesFreq      2.89171
		montesSpiky     0.949918
		montesFraction  0.890485
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.62085e-005
		hillsFraction   0.495589
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248515
		craterFreq      0.236276
		craterDensity   1.0119
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.546768
		volcanoTemp     1619.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.224, 0.222, 0.221, 0.000)
		colorShelf     (0.238, 0.236, 0.235, 0.000)
		colorBeach     (0.252, 0.250, 0.249, 0.000)
		colorDesert    (0.266, 0.264, 0.263, 0.000)
		colorLowland   (0.280, 0.278, 0.276, 0.000)
		colorUpland    (0.294, 0.292, 0.290, 0.000)
		colorRock      (0.308, 0.305, 0.304, 0.000)
		colorSnow      (0.322, 0.319, 0.318, 1.000)
		BumpHeight      0.110424
		BumpOffset      0.0220848
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0767461
		DustBright  0.315908
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   24.4815
		Period          123.383
		Eccentricity    0.985073
		Inclination     121.013
		AscendingNode   -57.2087
		ArgOfPericenter -154.5
		MeanAnomaly     -60.2522
	}
}

Comet	"C101"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            3.4955e-012
	Radius          2.1287
	InertiaMoment   0.399465

	Oblateness      0.00247687

	RotationPeriod  103.057
	Obliquity       178.71
	EqAscendNode    30.1256

	AbsMagn         13.2356
	SlopeParam      5.51295
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.776 0.773 0.772)

	Surface
	{
		SurfStyle       0.261105
		OceanStyle      0.346031
		Randomize      (-0.376, 0.073, 0.437)
		colorDistMagn   0.656462
		colorDistFreq   0.00294508
		detailScale     58.1276
		colorConversion true
		snowLevel       2
		tropicLatitude  0.93481
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.310397
		terraceProb     0.105994
		erosion         0
		montesMagn      0.412877
		montesFreq      3.73281
		montesSpiky     0.829958
		montesFraction  0.929582
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0105392
		hillsFraction   0.55207
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222552
		craterFreq      0.1535
		craterDensity   0.757523
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.487744
		volcanoTemp     1292.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.310, 0.309, 0.309, 0.000)
		colorShelf     (0.330, 0.329, 0.328, 0.000)
		colorBeach     (0.349, 0.348, 0.348, 0.000)
		colorDesert    (0.369, 0.367, 0.367, 0.000)
		colorLowland   (0.388, 0.387, 0.386, 0.000)
		colorUpland    (0.407, 0.406, 0.406, 0.000)
		colorRock      (0.427, 0.425, 0.425, 0.000)
		colorSnow      (0.446, 0.445, 0.444, 1.000)
		BumpHeight      1.91583
		BumpOffset      0.383165
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.448509
		GasToDust   0.25
		Particles   1885
		GasBright   0.223232
		DustBright  0.653908
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   28.7528
		Period          157.044
		Eccentricity    0.978816
		Inclination     70.4633
		AscendingNode   10.9407
		ArgOfPericenter -108.764
		MeanAnomaly     -111.035
	}
}

Comet	"C102"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            2.70352e-008
	Radius          47.8424
	InertiaMoment   0.398217

	Oblateness      0.00401532

	RotationPeriod  97.8342
	Obliquity       131.916
	EqAscendNode    14.703

	AbsMagn         8.6746
	SlopeParam      6.42558
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.493 0.487 0.481)

	Surface
	{
		SurfStyle       0.358041
		OceanStyle      0.574357
		Randomize      (0.207, 0.932, -0.161)
		colorDistMagn   0.0540043
		colorDistFreq   1.59135
		detailScale     1306.42
		colorConversion true
		snowLevel       2
		tropicLatitude  0.879489
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.461741
		terraceProb     0.168665
		erosion         0
		montesMagn      0.457099
		montesFreq      2.07458
		montesSpiky     0.991141
		montesFraction  0.58116
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.47279
		hillsFraction   0.798938
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.270208
		craterFreq      0.195554
		craterDensity   0.955937
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.505662
		volcanoTemp     1063.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.197, 0.195, 0.193, 0.000)
		colorShelf     (0.210, 0.207, 0.205, 0.000)
		colorBeach     (0.222, 0.219, 0.217, 0.000)
		colorDesert    (0.234, 0.231, 0.229, 0.000)
		colorLowland   (0.246, 0.244, 0.241, 0.000)
		colorUpland    (0.259, 0.256, 0.253, 0.000)
		colorRock      (0.271, 0.268, 0.265, 0.000)
		colorSnow      (0.283, 0.280, 0.277, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.929701
		GasToDust   0.25
		Particles   2857
		GasBright   0.176096
		DustBright  0.385531
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   20.9208
		Period          97.4693
		Eccentricity    0.961307
		Inclination     20.699
		AscendingNode   -124.507
		ArgOfPericenter 24.6121
		MeanAnomaly     -154.445
	}
}

Comet	"C103"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            8.32433e-016
	Radius          0.131857
	InertiaMoment   0.39989

	Oblateness      0.0030085

	RotationPeriod  93.4901
	Obliquity       85.1219
	EqAscendNode    359.28

	AbsMagn         5.03426
	SlopeParam      10.5496
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.664 0.659 0.655)

	Surface
	{
		SurfStyle       0.65193
		OceanStyle      0.617705
		Randomize      (-0.362, 0.241, -0.849)
		colorDistMagn   0.616155
		colorDistFreq   4.02491e-006
		detailScale     3.60058
		colorConversion true
		snowLevel       2
		tropicLatitude  0.586065
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.406045
		terraceProb     0.436881
		erosion         0
		montesMagn      0.44885
		montesFreq      3.54403
		montesSpiky     0.9143
		montesFraction  0.773943
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.8423e-005
		hillsFraction   0.605838
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260684
		craterFreq      0.195066
		craterDensity   1.06127
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.554179
		volcanoTemp     1770.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.259, 0.224, 0.183, 0.000)
		colorShelf     (0.266, 0.231, 0.210, 0.000)
		colorBeach     (0.312, 0.270, 0.249, 0.000)
		colorDesert    (0.339, 0.290, 0.242, 0.000)
		colorLowland   (0.372, 0.310, 0.275, 0.000)
		colorUpland    (0.412, 0.376, 0.334, 0.000)
		colorRock      (0.445, 0.409, 0.360, 0.000)
		colorSnow      (0.485, 0.435, 0.380, 1.000)
		BumpHeight      0.118672
		BumpOffset      0.0237343
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0916995
		DustBright  0.154414
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   40.3801
		Period          261.368
		Eccentricity    0.984249
		Inclination     -78.221
		AscendingNode   148.049
		ArgOfPericenter -50.1957
		MeanAnomaly     109.932
	}
}

Comet	"C104"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            6.43828e-012
	Radius          2.95714
	InertiaMoment   0.398774

	Oblateness      0.00474394

	RotationPeriod  89.7231
	Obliquity       38.3276
	EqAscendNode    343.858

	AbsMagn         12.779
	SlopeParam      2.7756
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.499 0.491 0.488)

	Surface
	{
		SurfStyle       0.667538
		OceanStyle      0.742929
		Randomize      (-0.371, -0.330, 0.650)
		colorDistMagn   0.996553
		colorDistFreq   0.000849285
		detailScale     80.7498
		colorConversion true
		snowLevel       2
		tropicLatitude  0.60632
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.418997
		terraceProb     0.280001
		erosion         0
		montesMagn      0.525193
		montesFreq      4.10196
		montesSpiky     0.944244
		montesFraction  0.720052
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0189441
		hillsFraction   0.783135
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251713
		craterFreq      0.198355
		craterDensity   0.799797
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.457921
		volcanoTemp     1445.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.195, 0.167, 0.137, 0.000)
		colorShelf     (0.200, 0.172, 0.156, 0.000)
		colorBeach     (0.235, 0.202, 0.186, 0.000)
		colorDesert    (0.255, 0.216, 0.181, 0.000)
		colorLowland   (0.280, 0.231, 0.205, 0.000)
		colorUpland    (0.310, 0.280, 0.249, 0.000)
		colorRock      (0.335, 0.305, 0.269, 0.000)
		colorSnow      (0.365, 0.324, 0.283, 1.000)
		BumpHeight      2.66143
		BumpOffset      0.532286
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.481335
		GasToDust   0.25
		Particles   1952
		GasBright   0.315353
		DustBright  0.415247
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   33.6131
		Period          198.502
		Eccentricity    0.97911
		Inclination     1.0038
		AscendingNode   -179.167
		ArgOfPericenter 53.3746
		MeanAnomaly     79.3655
	}
}

Comet	"C105"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            4.97955e-008
	Radius          51.5341
	InertiaMoment   0.396918

	Oblateness      0.00347933

	RotationPeriod  86.3649
	Obliquity       351.533
	EqAscendNode    328.435

	AbsMagn         8.46382
	SlopeParam      3.401
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.484 0.481 0.479)

	Surface
	{
		SurfStyle       0.953007
		OceanStyle      0.0147583
		Randomize      (-0.211, 0.574, 0.299)
		colorDistMagn   0.122474
		colorDistFreq   2.13517
		detailScale     1407.22
		colorConversion true
		snowLevel       2
		tropicLatitude  0.968633
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.663529
		terraceProb     0.433008
		erosion         0
		montesMagn      0.596392
		montesFreq      2.82524
		montesSpiky     0.944508
		montesFraction  0.505141
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.53946
		hillsFraction   0.724481
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230105
		craterFreq      0.162942
		craterDensity   0.996051
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.439229
		volcanoTemp     1669.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.165, 0.168, 0.192, 0.050)
		colorShelf     (0.194, 0.197, 0.220, 0.040)
		colorBeach     (0.223, 0.226, 0.249, 0.030)
		colorDesert    (0.252, 0.255, 0.283, 0.020)
		colorLowland   (0.281, 0.284, 0.311, 0.030)
		colorUpland    (0.310, 0.313, 0.340, 0.050)
		colorRock      (0.339, 0.341, 0.378, 0.020)
		colorSnow      (0.339, 0.341, 0.378, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.962527
		GasToDust   0.25
		Particles   2924
		GasBright   0.203675
		DustBright  0.211411
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   35.4308
		Period          214.819
		Eccentricity    0.977982
		Inclination     -79.0552
		AscendingNode   114.829
		ArgOfPericenter 28.8024
		MeanAnomaly     110.665
	}
}

Comet	"C106"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            1.53324e-015
	Radius          0.182807
	InertiaMoment   0.399248

	Oblateness      0.00546808

	RotationPeriod  83.311
	Obliquity       304.739
	EqAscendNode    313.013

	AbsMagn         4.75215
	SlopeParam      3.97171
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.739 0.736 0.733)

	Surface
	{
		SurfStyle       0.563064
		OceanStyle      0.56252
		Randomize      (0.032, -0.610, -0.758)
		colorDistMagn   0.0253139
		colorDistFreq   2.91008e-005
		detailScale     4.99185
		colorConversion true
		snowLevel       2
		tropicLatitude  0.944506
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.416335
		terraceProb     0.189549
		erosion         0
		montesMagn      0.47608
		montesFreq      3.5991
		montesSpiky     0.959507
		montesFraction  0.484463
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.80872e-005
		hillsFraction   0.721282
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244808
		craterFreq      0.238265
		craterDensity   0.857084
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.480442
		volcanoTemp     1808.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.288, 0.250, 0.205, 0.000)
		colorShelf     (0.296, 0.258, 0.234, 0.000)
		colorBeach     (0.347, 0.302, 0.278, 0.000)
		colorDesert    (0.377, 0.324, 0.271, 0.000)
		colorLowland   (0.414, 0.346, 0.308, 0.000)
		colorUpland    (0.458, 0.420, 0.374, 0.000)
		colorRock      (0.495, 0.456, 0.403, 0.000)
		colorSnow      (0.539, 0.486, 0.425, 1.000)
		BumpHeight      0.164526
		BumpOffset      0.0329053
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0329692
		GasToDust   0.25
		Particles   1046
		GasBright   0.0447325
		DustBright  0.854841
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   25.4661
		Period          130.902
		Eccentricity    0.980813
		Inclination     -56.8615
		AscendingNode   21.5483
		ArgOfPericenter -141.755
		MeanAnomaly     6.8156
	}
}

Comet	"C107"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            1.18585e-011
	Radius          3.19216
	InertiaMoment   0.397885

	Oblateness      0.00401206

	RotationPeriod  80.4923
	Obliquity       257.945
	EqAscendNode    297.59

	AbsMagn         12.3774
	SlopeParam      4.54007
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.581 0.577 0.572)

	Surface
	{
		SurfStyle       0.0133451
		OceanStyle      0.552568
		Randomize      (0.533, -0.126, -0.274)
		colorDistMagn   0.779968
		colorDistFreq   0.00313001
		detailScale     87.1673
		colorConversion true
		snowLevel       2
		tropicLatitude  0.910148
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.602748
		terraceProb     0.145032
		erosion         0
		montesMagn      0.560932
		montesFreq      3.23313
		montesSpiky     0.878715
		montesFraction  0.547714
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0339435
		hillsFraction   0.758228
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252153
		craterFreq      0.215765
		craterDensity   0.831276
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.450372
		volcanoTemp     1683.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.233, 0.231, 0.229, 0.000)
		colorShelf     (0.247, 0.245, 0.243, 0.000)
		colorBeach     (0.262, 0.260, 0.257, 0.000)
		colorDesert    (0.276, 0.274, 0.272, 0.000)
		colorLowland   (0.291, 0.288, 0.286, 0.000)
		colorUpland    (0.305, 0.303, 0.300, 0.000)
		colorRock      (0.320, 0.317, 0.315, 0.000)
		colorSnow      (0.334, 0.332, 0.329, 1.000)
		BumpHeight      2.87294
		BumpOffset      0.574589
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.514161
		GasToDust   0.25
		Particles   2018
		GasBright   0.0635291
		DustBright  0.520531
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   20.0673
		Period          91.5657
		Eccentricity    0.96928
		Inclination     143.069
		AscendingNode   171.561
		ArgOfPericenter 142.151
		MeanAnomaly     5.68196
	}
}

Comet	"C108"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            9.17169e-008
	Radius          71.3127
	InertiaMoment   0.399682

	Oblateness      0.00622304

	RotationPeriod  77.8599
	Obliquity       211.15
	EqAscendNode    282.167

	AbsMagn         8.25432
	SlopeParam      5.15684
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.640 0.531 0.346)

	Surface
	{
		SurfStyle       0.725842
		OceanStyle      0.0375309
		Randomize      (-0.412, -0.913, 0.137)
		colorDistMagn   0.96414
		colorDistFreq   4.3869
		detailScale     1947.31
		colorConversion true
		snowLevel       2
		tropicLatitude  0.886652
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.551979
		terraceProb     0.391614
		erosion         0
		montesMagn      0.486315
		montesFreq      2.00341
		montesSpiky     0.966348
		montesFraction  0.359908
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.0968
		hillsFraction   0.635913
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239875
		craterFreq      0.205311
		craterDensity   0.939678
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.485054
		volcanoTemp     1408.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.250, 0.181, 0.097, 0.000)
		colorShelf     (0.256, 0.186, 0.111, 0.000)
		colorBeach     (0.301, 0.218, 0.132, 0.000)
		colorDesert    (0.326, 0.234, 0.128, 0.000)
		colorLowland   (0.358, 0.250, 0.145, 0.000)
		colorUpland    (0.397, 0.303, 0.177, 0.000)
		colorRock      (0.429, 0.329, 0.190, 0.000)
		colorSnow      (0.467, 0.350, 0.201, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.995353
		GasToDust   0.25
		Particles   2990
		GasBright   0.0450666
		DustBright  0.22348
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   28.3533
		Period          153.783
		Eccentricity    0.987168
		Inclination     -67.9333
		AscendingNode   72.905
		ArgOfPericenter -62.6548
		MeanAnomaly     158.906
	}
}

Comet	"C109"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            2.82404e-015
	Radius          0.197731
	InertiaMoment   0.398513

	Oblateness      0.00457655

	RotationPeriod  75.3782
	Obliquity       164.356
	EqAscendNode    266.745

	AbsMagn         4.45287
	SlopeParam      5.91297
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.697 0.691 0.687)

	Surface
	{
		SurfStyle       0.550416
		OceanStyle      0.702894
		Randomize      (0.989, -0.490, -0.136)
		colorDistMagn   0.63904
		colorDistFreq   2.27298e-005
		detailScale     5.39938
		colorConversion true
		snowLevel       2
		tropicLatitude  0.891395
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.739918
		terraceProb     0.585947
		erosion         0
		montesMagn      0.481037
		montesFreq      2.91597
		montesSpiky     0.987831
		montesFraction  0.922208
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.0045e-005
		hillsFraction   0.574163
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214708
		craterFreq      0.243056
		craterDensity   0.885596
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.467754
		volcanoTemp     1135.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.272, 0.235, 0.192, 0.000)
		colorShelf     (0.279, 0.242, 0.220, 0.000)
		colorBeach     (0.327, 0.283, 0.261, 0.000)
		colorDesert    (0.355, 0.304, 0.254, 0.000)
		colorLowland   (0.390, 0.325, 0.289, 0.000)
		colorUpland    (0.432, 0.394, 0.351, 0.000)
		colorRock      (0.467, 0.429, 0.378, 0.000)
		colorSnow      (0.509, 0.456, 0.399, 1.000)
		BumpHeight      0.177958
		BumpOffset      0.0355916
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0657952
		GasToDust   0.25
		Particles   1112
		GasBright   0.170835
		DustBright  0.582198
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   27.8535
		Period          149.734
		Eccentricity    0.977908
		Inclination     -128.259
		AscendingNode   132.504
		ArgOfPericenter 74.2221
		MeanAnomaly     -160.875
	}
}

Comet	"C110"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            2.18419e-011
	Radius          4.4095
	InertiaMoment   0.395909

	Oblateness      0.00692509

	RotationPeriod  73.0203
	Obliquity       117.562
	EqAscendNode    251.322

	AbsMagn         12.0156
	SlopeParam      7.15506
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.524 0.515 0.511)

	Surface
	{
		SurfStyle       0.225956
		OceanStyle      0.167823
		Randomize      (-0.802, -0.339, 0.457)
		colorDistMagn   0.575305
		colorDistFreq   0.00594837
		detailScale     120.409
		colorConversion true
		snowLevel       2
		tropicLatitude  0.250731
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.619486
		terraceProb     0.476353
		erosion         0
		montesMagn      0.383947
		montesFreq      2.89359
		montesSpiky     0.903093
		montesFraction  0.578363
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0402072
		hillsFraction   0.429714
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253548
		craterFreq      0.227927
		craterDensity   0.771939
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.481738
		volcanoTemp     1861.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.210, 0.206, 0.204, 0.000)
		colorShelf     (0.223, 0.219, 0.217, 0.000)
		colorBeach     (0.236, 0.232, 0.230, 0.000)
		colorDesert    (0.249, 0.245, 0.243, 0.000)
		colorLowland   (0.262, 0.258, 0.255, 0.000)
		colorUpland    (0.275, 0.271, 0.268, 0.000)
		colorRock      (0.288, 0.283, 0.281, 0.000)
		colorSnow      (0.301, 0.296, 0.294, 1.000)
		BumpHeight      3.96855
		BumpOffset      0.793711
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.546987
		GasToDust   0.25
		Particles   2084
		GasBright   0.12509
		DustBright  0.312429
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   31.0285
		Period          176.052
		Eccentricity    0.97311
		Inclination     -63.4178
		AscendingNode   163.718
		ArgOfPericenter -146.339
		MeanAnomaly     -76.3602
	}
}

Comet	"C111"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            1.68931e-007
	Radius          77.2795
	InertiaMoment   0.39902

	Oblateness      0.00519213

	RotationPeriod  70.7652
	Obliquity       70.7675
	EqAscendNode    235.9

	AbsMagn         8.04551
	SlopeParam      2.41061
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.791 0.759 0.737)

	Surface
	{
		SurfStyle       0.897582
		OceanStyle      0.648572
		Randomize      (0.646, 0.923, 0.467)
		colorDistMagn   0.401112
		colorDistFreq   3.54603
		detailScale     2110.25
		colorConversion true
		snowLevel       2
		tropicLatitude  0.98134
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.34673
		terraceProb     0.187691
		erosion         0
		montesMagn      0.565916
		montesFreq      2.55191
		montesSpiky     0.71575
		montesFraction  0.539868
		dunesFraction   0
		hillsMagn       0
		hillsFreq       17.866
		hillsFraction   0.789142
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219963
		craterFreq      0.217353
		craterDensity   0.841592
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.525705
		volcanoTemp     1572.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.269, 0.266, 0.295, 0.050)
		colorShelf     (0.316, 0.311, 0.339, 0.040)
		colorBeach     (0.364, 0.357, 0.383, 0.030)
		colorDesert    (0.411, 0.402, 0.435, 0.020)
		colorLowland   (0.459, 0.448, 0.479, 0.030)
		colorUpland    (0.506, 0.494, 0.523, 0.050)
		colorRock      (0.554, 0.539, 0.582, 0.020)
		colorSnow      (0.554, 0.539, 0.582, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.318048
		DustBright  0.603958
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   29.1609
		Period          160.399
		Eccentricity    0.975629
		Inclination     -9.647
		AscendingNode   -146.844
		ArgOfPericenter -45.7075
		MeanAnomaly     -147.353
	}
}

Comet	"C112"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            5.20151e-015
	Radius          0.272682
	InertiaMoment   0.397481

	Oblateness      0.00783851

	RotationPeriod  68.5961
	Obliquity       23.9732
	EqAscendNode    220.477

	AbsMagn         4.13228
	SlopeParam      3.0951
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.663 0.661 0.656)

	Surface
	{
		SurfStyle       0.0519944
		OceanStyle      0.173037
		Randomize      (-0.566, 0.260, 0.506)
		colorDistMagn   0.923716
		colorDistFreq   4.22666e-005
		detailScale     7.44603
		colorConversion true
		snowLevel       2
		tropicLatitude  0.825284
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.441742
		terraceProb     0.308797
		erosion         0
		montesMagn      0.413857
		montesFreq      2.32739
		montesSpiky     0.952019
		montesFraction  0.611142
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00014875
		hillsFraction   0.610847
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227455
		craterFreq      0.223458
		craterDensity   0.863291
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.586316
		volcanoTemp     1327.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.265, 0.264, 0.262, 0.000)
		colorShelf     (0.282, 0.281, 0.279, 0.000)
		colorBeach     (0.298, 0.297, 0.295, 0.000)
		colorDesert    (0.315, 0.314, 0.312, 0.000)
		colorLowland   (0.332, 0.330, 0.328, 0.000)
		colorUpland    (0.348, 0.347, 0.344, 0.000)
		colorRock      (0.365, 0.363, 0.361, 0.000)
		colorSnow      (0.381, 0.380, 0.377, 1.000)
		BumpHeight      0.245414
		BumpOffset      0.0490827
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.098621
		GasToDust   0.25
		Particles   1179
		GasBright   0.245022
		DustBright  0.361471
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   26.6006
		Period          139.746
		Eccentricity    0.980777
		Inclination     51.8878
		AscendingNode   -90.1356
		ArgOfPericenter -9.25294
		MeanAnomaly     -149.832
	}
}

Comet	"C113"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            4.023e-011
	Radius          4.7869
	InertiaMoment   0.399471

	Oblateness      0.00587778

	RotationPeriod  66.4994
	Obliquity       337.179
	EqAscendNode    205.055

	AbsMagn         11.6841
	SlopeParam      3.68563
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.640 0.635 0.630)

	Surface
	{
		SurfStyle       0.0314536
		OceanStyle      0.513122
		Randomize      (0.748, 0.030, -0.181)
		colorDistMagn   0.296911
		colorDistFreq   0.0179494
		detailScale     130.714
		colorConversion true
		snowLevel       2
		tropicLatitude  0.322806
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.447706
		terraceProb     0.502877
		erosion         0
		montesMagn      0.573066
		montesFreq      3.34949
		montesSpiky     0.913206
		montesFraction  0.176474
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0492244
		hillsFraction   0.5796
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241839
		craterFreq      0.268551
		craterDensity   0.932394
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.482619
		volcanoTemp     1702.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.256, 0.254, 0.252, 0.000)
		colorShelf     (0.272, 0.270, 0.268, 0.000)
		colorBeach     (0.288, 0.286, 0.284, 0.000)
		colorDesert    (0.304, 0.302, 0.299, 0.000)
		colorLowland   (0.320, 0.317, 0.315, 0.000)
		colorUpland    (0.336, 0.333, 0.331, 0.000)
		colorRock      (0.352, 0.349, 0.347, 0.000)
		colorSnow      (0.368, 0.365, 0.362, 1.000)
		BumpHeight      4.30821
		BumpOffset      0.861643
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.579813
		GasToDust   0.25
		Particles   2151
		GasBright   0.134736
		DustBright  0.156243
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   19.2167
		Period          85.8065
		Eccentricity    0.9706
		Inclination     175.937
		AscendingNode   -169.973
		ArgOfPericenter 133.497
		MeanAnomaly     -34.1967
	}
}

Comet	"C114"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            3.1115e-007
	Radius          106.405
	InertiaMoment   0.398225

	Oblateness      0.00884091

	RotationPeriod  64.4637
	Obliquity       290.385
	EqAscendNode    189.632

	AbsMagn         7.83683
	SlopeParam      4.24943
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.734 0.732 0.729)

	Surface
	{
		SurfStyle       0.81339
		OceanStyle      0.0789769
		Randomize      (-0.870, 0.355, 0.822)
		colorDistMagn   0.569129
		colorDistFreq   7.67968
		detailScale     2905.58
		colorConversion true
		snowLevel       2
		tropicLatitude  0.911491
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.633111
		terraceProb     0.294873
		erosion         0
		montesMagn      0.51913
		montesFreq      3.28479
		montesSpiky     0.970488
		montesFraction  0.406015
		dunesFraction   0
		hillsMagn       0
		hillsFreq       25.4197
		hillsFraction   0.885667
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234207
		craterFreq      0.439877
		craterDensity   0.980483
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.485171
		volcanoTemp     1504.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.286, 0.249, 0.204, 0.000)
		colorShelf     (0.294, 0.256, 0.233, 0.000)
		colorBeach     (0.345, 0.300, 0.277, 0.000)
		colorDesert    (0.374, 0.322, 0.270, 0.000)
		colorLowland   (0.411, 0.344, 0.306, 0.000)
		colorUpland    (0.455, 0.417, 0.372, 0.000)
		colorRock      (0.492, 0.454, 0.401, 0.000)
		colorSnow      (0.536, 0.483, 0.423, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0171288
		DustBright  0.758337
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   36.1447
		Period          221.344
		Eccentricity    0.987379
		Inclination     -135.327
		AscendingNode   -179.699
		ArgOfPericenter 90.9318
		MeanAnomaly     -74.5749
	}
}

Comet	"C115"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            9.58055e-015
	Radius          0.296514
	InertiaMoment   0.399896

	Oblateness      0.00665577

	RotationPeriod  62.4793
	Obliquity       243.59
	EqAscendNode    174.209

	AbsMagn         3.7847
	SlopeParam      4.83423
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.518 0.514 0.512)

	Surface
	{
		SurfStyle       0.547741
		OceanStyle      0.19433
		Randomize      (-0.913, -0.698, -0.668)
		colorDistMagn   0.228705
		colorDistFreq   3.97906e-005
		detailScale     8.0968
		colorConversion true
		snowLevel       2
		tropicLatitude  0.8936
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.40612
		terraceProb     0.146063
		erosion         0
		montesMagn      0.613049
		montesFreq      3.47686
		montesSpiky     0.935878
		montesFraction  0.330547
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000234576
		hillsFraction   0.602781
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259835
		craterFreq      0.194499
		craterDensity   0.902805
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.435356
		volcanoTemp     1696.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.202, 0.175, 0.143, 0.000)
		colorShelf     (0.207, 0.180, 0.164, 0.000)
		colorBeach     (0.243, 0.211, 0.194, 0.000)
		colorDesert    (0.264, 0.226, 0.189, 0.000)
		colorLowland   (0.290, 0.242, 0.215, 0.000)
		colorUpland    (0.321, 0.293, 0.261, 0.000)
		colorRock      (0.347, 0.319, 0.282, 0.000)
		colorSnow      (0.378, 0.339, 0.297, 1.000)
		BumpHeight      0.266862
		BumpOffset      0.0533725
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.131447
		GasToDust   0.25
		Particles   1245
		GasBright   0.0373176
		DustBright  0.422635
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   26.3742
		Period          137.966
		Eccentricity    0.975037
		Inclination     -104.514
		AscendingNode   112.9
		ArgOfPericenter 4.28133
		MeanAnomaly     -91.0555
	}
}

Comet	"C116"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            7.40985e-011
	Radius          6.58123
	InertiaMoment   0.39878

	Oblateness      0.00998083

	RotationPeriod  60.5379
	Obliquity       196.796
	EqAscendNode    158.787

	AbsMagn         11.3761
	SlopeParam      5.5027
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.724 0.627 0.509)

	Surface
	{
		SurfStyle       0.373367
		OceanStyle      0.706729
		Randomize      (-0.879, -0.080, -0.165)
		colorDistMagn   0.619318
		colorDistFreq   0.0116795
		detailScale     179.712
		colorConversion true
		snowLevel       2
		tropicLatitude  0.30048
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.718067
		terraceProb     0.179522
		erosion         0
		montesMagn      0.477354
		montesFreq      3.38441
		montesSpiky     0.983717
		montesFraction  0.779702
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0814921
		hillsFraction   0.779904
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243954
		craterFreq      0.238083
		craterDensity   0.944195
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49344
		volcanoTemp     1531.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.290, 0.251, 0.203, 0.000)
		colorShelf     (0.308, 0.266, 0.216, 0.000)
		colorBeach     (0.326, 0.282, 0.229, 0.000)
		colorDesert    (0.344, 0.298, 0.242, 0.000)
		colorLowland   (0.362, 0.314, 0.254, 0.000)
		colorUpland    (0.380, 0.329, 0.267, 0.000)
		colorRock      (0.398, 0.345, 0.280, 0.000)
		colorSnow      (0.417, 0.361, 0.293, 1.000)
		BumpHeight      5.92311
		BumpOffset      1.18462
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.612639
		GasToDust   0.25
		Particles   2217
		GasBright   0.13239
		DustBright  0.812048
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   41.5454
		Period          272.763
		Eccentricity    0.98131
		Inclination     -179.308
		AscendingNode   -4.42338
		ArgOfPericenter -23.9827
		MeanAnomaly     -56.7272
	}
}

Comet	"C117"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            5.73099e-007
	Radius          115.887
	InertiaMoment   0.396935

	Oblateness      0.00745936

	RotationPeriod  58.6324
	Obliquity       150.002
	EqAscendNode    143.364

	AbsMagn         7.62771
	SlopeParam      6.40956
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.641 0.636 0.632)

	Surface
	{
		SurfStyle       0.927043
		OceanStyle      0.677875
		Randomize      (0.269, -0.329, -0.422)
		colorDistMagn   0.36163
		colorDistFreq   6.8194
		detailScale     3164.48
		colorConversion true
		snowLevel       2
		tropicLatitude  0.853756
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.466619
		terraceProb     0.278391
		erosion         0
		montesMagn      0.569784
		montesFreq      3.0506
		montesSpiky     0.893444
		montesFraction  0.56929
		dunesFraction   0
		hillsMagn       0
		hillsFreq       30.7169
		hillsFraction   0.551333
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231238
		craterFreq      0.507543
		craterDensity   0.734338
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.563304
		volcanoTemp     1362.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.218, 0.222, 0.253, 0.050)
		colorShelf     (0.256, 0.261, 0.291, 0.040)
		colorBeach     (0.295, 0.299, 0.329, 0.030)
		colorDesert    (0.333, 0.337, 0.373, 0.020)
		colorLowland   (0.372, 0.375, 0.411, 0.030)
		colorUpland    (0.410, 0.413, 0.449, 0.050)
		colorRock      (0.449, 0.451, 0.500, 0.020)
		colorSnow      (0.449, 0.451, 0.500, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.125297
		DustBright  0.503628
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   35.3593
		Period          214.169
		Eccentricity    0.975252
		Inclination     -35.2153
		AscendingNode   49.596
		ArgOfPericenter 82.3553
		MeanAnomaly     8.60365
	}
}

Comet	"C118"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            1.76462e-014
	Radius          0.407085
	InertiaMoment   0.399253

	Oblateness      0.0113047

	RotationPeriod  56.7563
	Obliquity       103.207
	EqAscendNode    127.942

	AbsMagn         3.40196
	SlopeParam      9.73523
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.643 0.555 0.502)

	Surface
	{
		SurfStyle       0.323768
		OceanStyle      0.598313
		Randomize      (0.588, 0.503, 0.659)
		colorDistMagn   0.766714
		colorDistFreq   2.37085e-005
		detailScale     11.1161
		colorConversion true
		snowLevel       2
		tropicLatitude  0.438483
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.479651
		terraceProb     0.38636
		erosion         0
		montesMagn      0.593935
		montesFreq      3.94912
		montesSpiky     0.951124
		montesFraction  0.335057
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000203976
		hillsFraction   0.538158
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.276449
		craterFreq      0.205718
		craterDensity   0.914165
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.46918
		volcanoTemp     1597.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.257, 0.222, 0.201, 0.000)
		colorShelf     (0.273, 0.236, 0.213, 0.000)
		colorBeach     (0.289, 0.250, 0.226, 0.000)
		colorDesert    (0.306, 0.264, 0.238, 0.000)
		colorLowland   (0.322, 0.277, 0.251, 0.000)
		colorUpland    (0.338, 0.291, 0.263, 0.000)
		colorRock      (0.354, 0.305, 0.276, 0.000)
		colorSnow      (0.370, 0.319, 0.288, 1.000)
		BumpHeight      0.366377
		BumpOffset      0.0732754
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.164273
		GasToDust   0.25
		Particles   1311
		GasBright   0.0809447
		DustBright  0.232467
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   29.0462
		Period          159.454
		Eccentricity    0.982765
		Inclination     -85.1567
		AscendingNode   18.8529
		ArgOfPericenter -69.5158
		MeanAnomaly     166.139
	}
}

Comet	"C119"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            1.3648e-010
	Radius          7.17834
	InertiaMoment   0.397894

	Oblateness      0.00852053

	RotationPeriod  54.9036
	Obliquity       56.4132
	EqAscendNode    112.519

	AbsMagn         11.0869
	SlopeParam      2.76628
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.612 0.543 0.474)

	Surface
	{
		SurfStyle       0.70641
		OceanStyle      0.774496
		Randomize      (-0.763, -0.079, -0.129)
		colorDistMagn   0.425396
		colorDistFreq   0.0197106
		detailScale     196.017
		colorConversion true
		snowLevel       2
		tropicLatitude  0.78006
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.32844
		terraceProb     0.617375
		erosion         0
		montesMagn      0.425552
		montesFreq      2.15506
		montesSpiky     0.898233
		montesFraction  0.755255
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.113611
		hillsFraction   0.525534
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252069
		craterFreq      0.178144
		craterDensity   0.859191
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50375
		volcanoTemp     1622.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.239, 0.185, 0.133, 0.000)
		colorShelf     (0.245, 0.190, 0.152, 0.000)
		colorBeach     (0.288, 0.223, 0.180, 0.000)
		colorDesert    (0.312, 0.239, 0.175, 0.000)
		colorLowland   (0.343, 0.255, 0.199, 0.000)
		colorUpland    (0.380, 0.310, 0.242, 0.000)
		colorRock      (0.410, 0.337, 0.261, 0.000)
		colorSnow      (0.447, 0.359, 0.275, 1.000)
		BumpHeight      6.46051
		BumpOffset      1.2921
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.645465
		GasToDust   0.25
		Particles   2283
		GasBright   0.253185
		DustBright  0.544714
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   22.7937
		Period          110.847
		Eccentricity    0.958327
		Inclination     -10.2618
		AscendingNode   -56.7576
		ArgOfPericenter 151.146
		MeanAnomaly     105.389
	}
}

Comet	"C120"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            4.20233e-018
	Radius          0.0251822
	InertiaMoment   0.399688

	Oblateness      0.0128735

	RotationPeriod  53.0691
	Obliquity       9.61886
	EqAscendNode    97.0964

	AbsMagn         7.41756
	SlopeParam      3.39293
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.482 0.477 0.468)

	Surface
	{
		SurfStyle       0.436638
		OceanStyle      0.819916
		Randomize      (-0.008, -0.105, -0.335)
		colorDistMagn   0.26791
		colorDistFreq   2.32236e-007
		detailScale     0.687642
		colorConversion true
		snowLevel       2
		tropicLatitude  0.525975
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.616369
		terraceProb     0.216935
		erosion         0
		montesMagn      0.603579
		montesFreq      2.90626
		montesSpiky     0.895711
		montesFraction  0.660571
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.57036e-006
		hillsFraction   0.421122
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24529
		craterFreq      0.243115
		craterDensity   0.787071
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.47726
		volcanoTemp     1208.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.193, 0.191, 0.187, 0.000)
		colorShelf     (0.205, 0.203, 0.199, 0.000)
		colorBeach     (0.217, 0.215, 0.211, 0.000)
		colorDesert    (0.229, 0.227, 0.222, 0.000)
		colorLowland   (0.241, 0.239, 0.234, 0.000)
		colorUpland    (0.253, 0.251, 0.246, 0.000)
		colorRock      (0.265, 0.262, 0.258, 0.000)
		colorSnow      (0.277, 0.274, 0.269, 1.000)
		BumpHeight      0.022664
		BumpOffset      0.0045328
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.18155
		DustBright  0.300835
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   28.7711
		Period          157.193
		Eccentricity    0.981567
		Inclination     23.7447
		AscendingNode   39.4149
		ArgOfPericenter 27.1946
		MeanAnomaly     119.161
	}
}

Comet	"C121"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            3.2502e-014
	Radius          0.444645
	InertiaMoment   0.39852

	Oblateness      0.00978292

	RotationPeriod  51.2476
	Obliquity       322.825
	EqAscendNode    81.6738

	AbsMagn         2.97173
	SlopeParam      3.96399
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.597 0.540 0.444)

	Surface
	{
		SurfStyle       0.611006
		OceanStyle      0.424385
		Randomize      (-0.412, 0.849, 0.328)
		colorDistMagn   0.763961
		colorDistFreq   0.00013327
		detailScale     12.1418
		colorConversion true
		snowLevel       2
		tropicLatitude  0.846677
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.388042
		terraceProb     0.204535
		erosion         0
		montesMagn      0.341274
		montesFreq      2.93423
		montesSpiky     0.986419
		montesFraction  0.332894
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000544516
		hillsFraction   0.600384
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242918
		craterFreq      0.144884
		craterDensity   0.810686
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.528284
		volcanoTemp     1734.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.233, 0.184, 0.124, 0.000)
		colorShelf     (0.239, 0.189, 0.142, 0.000)
		colorBeach     (0.281, 0.222, 0.169, 0.000)
		colorDesert    (0.304, 0.238, 0.164, 0.000)
		colorLowland   (0.334, 0.254, 0.186, 0.000)
		colorUpland    (0.370, 0.308, 0.226, 0.000)
		colorRock      (0.400, 0.335, 0.244, 0.000)
		colorSnow      (0.436, 0.357, 0.257, 1.000)
		BumpHeight      0.40018
		BumpOffset      0.0800361
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.197099
		GasToDust   0.25
		Particles   1377
		GasBright   0.420981
		DustBright  0.545891
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   24.5814
		Period          124.14
		Eccentricity    0.978643
		Inclination     -29.8015
		AscendingNode   -57.9626
		ArgOfPericenter -51.2483
		MeanAnomaly     -155.625
	}
}

Comet	"C122"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            2.5138e-010
	Radius          9.8295
	InertiaMoment   0.395951

	Oblateness      0.0145448

	RotationPeriod  49.4345
	Obliquity       276.03
	EqAscendNode    66.2512

	AbsMagn         10.8131
	SlopeParam      4.53207
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.504 0.501 0.499)

	Surface
	{
		SurfStyle       0.833909
		OceanStyle      0.96753
		Randomize      (-0.181, 0.183, 0.421)
		colorDistMagn   0.341974
		colorDistFreq   0.0326583
		detailScale     268.411
		colorConversion true
		snowLevel       2
		tropicLatitude  0.324523
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.511855
		terraceProb     0.194419
		erosion         0
		montesMagn      0.532081
		montesFreq      2.77072
		montesSpiky     0.971174
		montesFraction  0.47029
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.10249
		hillsFraction   0.724387
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237063
		craterFreq      0.253694
		craterDensity   1.0277
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.527095
		volcanoTemp     1321.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.197, 0.170, 0.140, 0.000)
		colorShelf     (0.202, 0.175, 0.160, 0.000)
		colorBeach     (0.237, 0.205, 0.190, 0.000)
		colorDesert    (0.257, 0.220, 0.185, 0.000)
		colorLowland   (0.282, 0.235, 0.210, 0.000)
		colorUpland    (0.313, 0.286, 0.255, 0.000)
		colorRock      (0.338, 0.311, 0.275, 0.000)
		colorSnow      (0.368, 0.331, 0.290, 1.000)
		BumpHeight      8.84655
		BumpOffset      1.76931
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.678291
		GasToDust   0.25
		Particles   2350
		GasBright   0.322064
		DustBright  0.329294
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   17.5684
		Period          75.0067
		Eccentricity    0.977598
		Inclination     80.8145
		AscendingNode   168.689
		ArgOfPericenter -164.405
		MeanAnomaly     -163.179
	}
}

Comet	"C123"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            7.74017e-018
	Radius          0.0275424
	InertiaMoment   0.399026

	Oblateness      0.0113266

	RotationPeriod  47.6249
	Obliquity       229.236
	EqAscendNode    50.8286

	AbsMagn         7.20578
	SlopeParam      5.14773
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.761 0.757 0.756)

	Surface
	{
		SurfStyle       0.365231
		OceanStyle      0.857959
		Randomize      (-0.405, 0.528, -0.689)
		colorDistMagn   0.525951
		colorDistFreq   2.16677e-007
		detailScale     0.752092
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997726
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.34351
		terraceProb     0.177955
		erosion         0
		montesMagn      0.506543
		montesFreq      2.25532
		montesSpiky     0.817705
		montesFraction  0.313805
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.41732e-006
		hillsFraction   0.936552
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244519
		craterFreq      0.245397
		craterDensity   0.882186
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51545
		volcanoTemp     1746.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.304, 0.303, 0.302, 0.000)
		colorShelf     (0.324, 0.322, 0.321, 0.000)
		colorBeach     (0.343, 0.341, 0.340, 0.000)
		colorDesert    (0.362, 0.360, 0.359, 0.000)
		colorLowland   (0.381, 0.379, 0.378, 0.000)
		colorUpland    (0.400, 0.397, 0.397, 0.000)
		colorRock      (0.419, 0.416, 0.416, 0.000)
		colorSnow      (0.438, 0.435, 0.435, 1.000)
		BumpHeight      0.0247882
		BumpOffset      0.00495764
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0179663
		DustBright  0.317879
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   34.0607
		Period          202.479
		Eccentricity    0.986039
		Inclination     -53.7059
		AscendingNode   121.515
		ArgOfPericenter -122.607
		MeanAnomaly     -22.0104
	}
}

Comet	"C124"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            5.98647e-014
	Radius          0.60813
	InertiaMoment   0.397492

	Oblateness      0.0169366

	RotationPeriod  45.8144
	Obliquity       182.442
	EqAscendNode    35.4061

	AbsMagn         2.47383
	SlopeParam      5.90082
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.692 0.580 0.517)

	Surface
	{
		SurfStyle       0.418255
		OceanStyle      0.622683
		Randomize      (-0.563, -0.189, 0.475)
		colorDistMagn   0.143716
		colorDistFreq   8.70758e-005
		detailScale     16.606
		colorConversion true
		snowLevel       2
		tropicLatitude  0.99407
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.49852
		terraceProb     0.111554
		erosion         0
		montesMagn      0.567854
		montesFreq      2.82919
		montesSpiky     0.808806
		montesFraction  0.645509
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000966229
		hillsFraction   0.646259
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217044
		craterFreq      0.264264
		craterDensity   0.889479
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.565582
		volcanoTemp     1504.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.277, 0.232, 0.207, 0.000)
		colorShelf     (0.294, 0.247, 0.220, 0.000)
		colorBeach     (0.311, 0.261, 0.233, 0.000)
		colorDesert    (0.329, 0.276, 0.246, 0.000)
		colorLowland   (0.346, 0.290, 0.259, 0.000)
		colorUpland    (0.363, 0.305, 0.272, 0.000)
		colorRock      (0.380, 0.319, 0.285, 0.000)
		colorSnow      (0.398, 0.334, 0.297, 1.000)
		BumpHeight      0.547317
		BumpOffset      0.109463
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.229925
		GasToDust   0.25
		Particles   1444
		GasBright   0.0923209
		DustBright  0.728011
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   28.7066
		Period          156.665
		Eccentricity    0.972863
		Inclination     93.8481
		AscendingNode   -11.2398
		ArgOfPericenter -47.5808
		MeanAnomaly     -37.9072
	}
}

Comet	"C125"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            4.63009e-010
	Radius          10.7644
	InertiaMoment   0.399476

	Oblateness      0.0132664

	RotationPeriod  43.9984
	Obliquity       135.647
	EqAscendNode    19.9835

	AbsMagn         10.5518
	SlopeParam      7.12856
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.635 0.628 0.625)

	Surface
	{
		SurfStyle       0.356764
		OceanStyle      0.305558
		Randomize      (0.512, -0.573, 0.120)
		colorDistMagn   0.850337
		colorDistFreq   0.0458959
		detailScale     293.941
		colorConversion true
		snowLevel       2
		tropicLatitude  0.477878
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.281887
		terraceProb     0.137865
		erosion         0
		montesMagn      0.586743
		montesFreq      1.47764
		montesSpiky     0.883489
		montesFraction  0.799607
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.331768
		hillsFraction   0.743363
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.270819
		craterFreq      0.229591
		craterDensity   0.8783
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.574032
		volcanoTemp     1090.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.254, 0.251, 0.250, 0.000)
		colorShelf     (0.270, 0.267, 0.266, 0.000)
		colorBeach     (0.286, 0.283, 0.281, 0.000)
		colorDesert    (0.302, 0.298, 0.297, 0.000)
		colorLowland   (0.317, 0.314, 0.312, 0.000)
		colorUpland    (0.333, 0.330, 0.328, 0.000)
		colorRock      (0.349, 0.346, 0.344, 0.000)
		colorSnow      (0.365, 0.361, 0.359, 1.000)
		BumpHeight      9.68798
		BumpOffset      1.9376
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.711117
		GasToDust   0.25
		Particles   2416
		GasBright   0.0866198
		DustBright  0.418198
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   38.8245
		Period          246.411
		Eccentricity    0.977816
		Inclination     -152.743
		AscendingNode   -40.6872
		ArgOfPericenter -64.6325
		MeanAnomaly     1.4103
	}
}

Comet	"C126"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            1.42564e-017
	Radius          0.0376257
	InertiaMoment   0.398233

	Oblateness      0.0199349

	RotationPeriod  42.1721
	Obliquity       88.8531
	EqAscendNode    4.56087

	AbsMagn         6.99176
	SlopeParam      2.4
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.781 0.778 0.777)

	Surface
	{
		SurfStyle       0.417813
		OceanStyle      0.0303486
		Randomize      (-0.651, 0.507, 0.435)
		colorDistMagn   0.951553
		colorDistFreq   4.22058e-007
		detailScale     1.02743
		colorConversion true
		snowLevel       2
		tropicLatitude  0.99823
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.288207
		terraceProb     0.209279
		erosion         0
		montesMagn      0.586164
		montesFreq      2.59189
		montesSpiky     0.980085
		montesFraction  0.665116
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.98294e-006
		hillsFraction   0.813545
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233623
		craterFreq      0.277708
		craterDensity   0.935621
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.536581
		volcanoTemp     1924.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.312, 0.311, 0.311, 0.000)
		colorShelf     (0.332, 0.331, 0.330, 0.000)
		colorBeach     (0.351, 0.350, 0.350, 0.000)
		colorDesert    (0.371, 0.370, 0.369, 0.000)
		colorLowland   (0.391, 0.389, 0.389, 0.000)
		colorUpland    (0.410, 0.409, 0.408, 0.000)
		colorRock      (0.430, 0.428, 0.428, 0.000)
		colorSnow      (0.449, 0.448, 0.447, 1.000)
		BumpHeight      0.0338631
		BumpOffset      0.00677263
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.228165
		DustBright  0.76114
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   29.55
		Period          163.62
		Eccentricity    0.97637
		Inclination     5.09674
		AscendingNode   -26.6172
		ArgOfPericenter -45.1076
		MeanAnomaly     -21.9216
	}
}

Comet	"C127"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            1.10263e-013
	Radius          0.666775
	InertiaMoment   0.399901

	Oblateness      0.0157824

	RotationPeriod  40.3307
	Obliquity       42.0588
	EqAscendNode    349.138

	AbsMagn         1.87157
	SlopeParam      3.08654
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.756 0.716 0.692)

	Surface
	{
		SurfStyle       0.632645
		OceanStyle      0.42217
		Randomize      (-0.729, -0.803, -0.809)
		colorDistMagn   0.661917
		colorDistFreq   8.76731e-005
		detailScale     18.2074
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999981
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.418543
		terraceProb     0.551878
		erosion         0
		montesMagn      0.536291
		montesFreq      2.17617
		montesSpiky     0.925113
		montesFraction  0.50442
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000704446
		hillsFraction   0.638654
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222533
		craterFreq      0.21219
		craterDensity   1.05014
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.518811
		volcanoTemp     1494.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.295, 0.243, 0.194, 0.000)
		colorShelf     (0.302, 0.251, 0.221, 0.000)
		colorBeach     (0.355, 0.294, 0.263, 0.000)
		colorDesert    (0.385, 0.315, 0.256, 0.000)
		colorLowland   (0.423, 0.336, 0.291, 0.000)
		colorUpland    (0.468, 0.408, 0.353, 0.000)
		colorRock      (0.506, 0.444, 0.381, 0.000)
		colorSnow      (0.552, 0.473, 0.401, 1.000)
		BumpHeight      0.600098
		BumpOffset      0.12002
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.262751
		GasToDust   0.25
		Particles   1510
		GasBright   0.195182
		DustBright  0.47861
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   30.6686
		Period          172.999
		Eccentricity    0.974234
		Inclination     -97.2481
		AscendingNode   82.4339
		ArgOfPericenter 111.503
		MeanAnomaly     40.45
	}
}

Comet	"C128"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            8.52806e-010
	Radius          14.6892
	InertiaMoment   0.398786

	Oblateness      0.0238804

	RotationPeriod  38.469
	Obliquity       355.264
	EqAscendNode    333.716

	AbsMagn         10.301
	SlopeParam      3.67781
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.557 0.554 0.549)

	Surface
	{
		SurfStyle       0.527276
		OceanStyle      0.459615
		Randomize      (0.268, 0.155, 0.955)
		colorDistMagn   0.65308
		colorDistFreq   0.117576
		detailScale     401.113
		colorConversion true
		snowLevel       2
		tropicLatitude  0.88689
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.304167
		terraceProb     0.228215
		erosion         0
		montesMagn      0.541825
		montesFreq      2.55063
		montesSpiky     0.983475
		montesFraction  0.32287
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.620212
		hillsFraction   0.576835
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23767
		craterFreq      0.200694
		craterDensity   1.04733
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.438478
		volcanoTemp     1320.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.217, 0.188, 0.154, 0.000)
		colorShelf     (0.223, 0.194, 0.176, 0.000)
		colorBeach     (0.262, 0.227, 0.209, 0.000)
		colorDesert    (0.284, 0.244, 0.203, 0.000)
		colorLowland   (0.312, 0.260, 0.231, 0.000)
		colorUpland    (0.345, 0.316, 0.280, 0.000)
		colorRock      (0.373, 0.344, 0.302, 0.000)
		colorSnow      (0.407, 0.366, 0.319, 1.000)
		BumpHeight      13.2203
		BumpOffset      2.64405
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.743943
		GasToDust   0.25
		Particles   2482
		GasBright   0.124939
		DustBright  0.233338
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   34.2904
		Period          204.531
		Eccentricity    0.98168
		Inclination     113.845
		AscendingNode   141.501
		ArgOfPericenter -23.567
		MeanAnomaly     -27.8501
	}
}

Comet	"C129"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            2.62585e-017
	Radius          0.0413016
	InertiaMoment   0.396952

	Oblateness      0.0189341

	RotationPeriod  36.5814
	Obliquity       308.47
	EqAscendNode    318.293

	AbsMagn         6.77481
	SlopeParam      4.24165
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.716 0.715 0.712)

	Surface
	{
		SurfStyle       0.426269
		OceanStyle      0.449789
		Randomize      (-0.273, 0.647, -0.341)
		colorDistMagn   0.543572
		colorDistFreq   1.13156e-006
		detailScale     1.12781
		colorConversion true
		snowLevel       2
		tropicLatitude  0.746886
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.380068
		terraceProb     0.378253
		erosion         0
		montesMagn      0.466833
		montesFreq      3.49777
		montesSpiky     0.886195
		montesFraction  0.488098
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.30624e-006
		hillsFraction   0.622464
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225121
		craterFreq      0.16284
		craterDensity   0.92225
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.489716
		volcanoTemp     1446.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.287, 0.286, 0.285, 0.000)
		colorShelf     (0.304, 0.304, 0.303, 0.000)
		colorBeach     (0.322, 0.322, 0.321, 0.000)
		colorDesert    (0.340, 0.339, 0.338, 0.000)
		colorLowland   (0.358, 0.357, 0.356, 0.000)
		colorUpland    (0.376, 0.375, 0.374, 0.000)
		colorRock      (0.394, 0.393, 0.392, 0.000)
		colorSnow      (0.412, 0.411, 0.410, 1.000)
		BumpHeight      0.0371715
		BumpOffset      0.0074343
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.343652
		DustBright  0.499113
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   28.1914
		Period          152.467
		Eccentricity    0.973408
		Inclination     176.703
		AscendingNode   167.016
		ArgOfPericenter 82.1104
		MeanAnomaly     151.95
	}
}

Comet	"C130"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            2.03091e-013
	Radius          0.908932
	InertiaMoment   0.399259

	Oblateness      0.029315

	RotationPeriod  34.6618
	Obliquity       261.676
	EqAscendNode    302.871

	AbsMagn         1.08557
	SlopeParam      4.82582
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.568 0.564 0.560)

	Surface
	{
		SurfStyle       0.390621
		OceanStyle      0.622713
		Randomize      (-0.305, 0.616, 0.771)
		colorDistMagn   0.755174
		colorDistFreq   0.00064298
		detailScale     24.8199
		colorConversion true
		snowLevel       2
		tropicLatitude  0.990678
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.538931
		terraceProb     0.52823
		erosion         0
		montesMagn      0.52257
		montesFreq      2.62539
		montesSpiky     0.960564
		montesFraction  0.73261
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00212383
		hillsFraction   0.553095
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243788
		craterFreq      0.206478
		craterDensity   0.936351
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.46836
		volcanoTemp     1302.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.227, 0.225, 0.224, 0.000)
		colorShelf     (0.241, 0.240, 0.238, 0.000)
		colorBeach     (0.255, 0.254, 0.252, 0.000)
		colorDesert    (0.270, 0.268, 0.266, 0.000)
		colorLowland   (0.284, 0.282, 0.280, 0.000)
		colorUpland    (0.298, 0.296, 0.294, 0.000)
		colorRock      (0.312, 0.310, 0.308, 0.000)
		colorSnow      (0.326, 0.324, 0.322, 1.000)
		BumpHeight      0.818039
		BumpOffset      0.163608
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.295577
		GasToDust   0.25
		Particles   1576
		GasBright   0.246127
		DustBright  0.281124
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   29.4711
		Period          162.965
		Eccentricity    0.971725
		Inclination     -98.5104
		AscendingNode   -96.737
		ArgOfPericenter 144.857
		MeanAnomaly     172.59
	}
}

Comet	"C131"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            1.57076e-009
	Radius          16.1419
	InertiaMoment   0.397903

	Oblateness      0.0237272

	RotationPeriod  32.7036
	Obliquity       214.882
	EqAscendNode    287.448

	AbsMagn         10.0589
	SlopeParam      5.49249
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.480 0.471 0.467)

	Surface
	{
		SurfStyle       0.61041
		OceanStyle      0.191733
		Randomize      (0.823, 0.023, -0.533)
		colorDistMagn   0.820494
		colorDistFreq   0.0660469
		detailScale     440.782
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999904
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.563561
		terraceProb     0.116801
		erosion         0
		montesMagn      0.569834
		montesFreq      3.77169
		montesSpiky     0.820357
		montesFraction  0.142301
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.856306
		hillsFraction   0.770407
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.216988
		craterFreq      0.210364
		craterDensity   0.942327
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.534234
		volcanoTemp     1809.53
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.187, 0.160, 0.131, 0.000)
		colorShelf     (0.192, 0.165, 0.149, 0.000)
		colorBeach     (0.226, 0.193, 0.178, 0.000)
		colorDesert    (0.245, 0.207, 0.173, 0.000)
		colorLowland   (0.269, 0.222, 0.196, 0.000)
		colorUpland    (0.298, 0.269, 0.238, 0.000)
		colorRock      (0.322, 0.292, 0.257, 0.000)
		colorSnow      (0.350, 0.311, 0.271, 1.000)
		BumpHeight      14.5277
		BumpOffset      2.90555
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.776769
		GasToDust   0.25
		Particles   2549
		GasBright   0.00547506
		DustBright  0.206262
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   21.2227
		Period          99.5865
		Eccentricity    0.983712
		Inclination     -56.376
		AscendingNode   -169.404
		ArgOfPericenter 10.4357
		MeanAnomaly     -83.33
	}
}

Comet	"C132"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            4.83649e-017
	Radius          0.0562452
	InertiaMoment   0.399693

	Oblateness      0.0372456

	RotationPeriod  30.699
	Obliquity       168.087
	EqAscendNode    272.025

	AbsMagn         6.55419
	SlopeParam      6.39369
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.785 0.782 0.779)

	Surface
	{
		SurfStyle       0.878721
		OceanStyle      0.232126
		Randomize      (0.343, -0.390, -0.150)
		colorDistMagn   0.790244
		colorDistFreq   2.27098e-006
		detailScale     1.53587
		colorConversion true
		snowLevel       2
		tropicLatitude  0.754421
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.544116
		terraceProb     0.392071
		erosion         0
		montesMagn      0.447
		montesFreq      3.12827
		montesSpiky     0.809754
		montesFraction  0.821311
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.68628e-006
		hillsFraction   0.700013
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253199
		craterFreq      0.159942
		craterDensity   0.95038
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.476089
		volcanoTemp     1138.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.267, 0.274, 0.312, 0.050)
		colorShelf     (0.314, 0.321, 0.358, 0.040)
		colorBeach     (0.361, 0.368, 0.405, 0.030)
		colorDesert    (0.408, 0.414, 0.460, 0.020)
		colorLowland   (0.456, 0.461, 0.507, 0.030)
		colorUpland    (0.503, 0.508, 0.553, 0.050)
		colorRock      (0.550, 0.555, 0.616, 0.020)
		colorSnow      (0.550, 0.555, 0.616, 1.000)
		BumpHeight      0.0506207
		BumpOffset      0.0101241
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0591115
		DustBright  0.637112
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   24.7332
		Period          125.291
		Eccentricity    0.96749
		Inclination     -60.883
		AscendingNode   178.535
		ArgOfPericenter 43.0793
		MeanAnomaly     57.7337
	}
}

Comet	"C133"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            3.74067e-013
	Radius          0.999867
	InertiaMoment   0.398527

	Oblateness      0.0309495

	RotationPeriod  28.6392
	Obliquity       121.293
	EqAscendNode    256.603

	AbsMagn         -0.123703
	SlopeParam      9.37359
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.406 0.400 0.398)

	Surface
	{
		SurfStyle       0.706782
		OceanStyle      0.432847
		Randomize      (-0.994, 0.203, -0.058)
		colorDistMagn   0.296078
		colorDistFreq   0.00087934
		detailScale     27.303
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999772
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.575866
		terraceProb     0.137896
		erosion         0
		montesMagn      0.499085
		montesFreq      2.95973
		montesSpiky     0.867388
		montesFraction  0.1503
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00179178
		hillsFraction   0.764437
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233985
		craterFreq      0.177124
		craterDensity   0.988311
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.479515
		volcanoTemp     1385.14
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.158, 0.136, 0.111, 0.000)
		colorShelf     (0.162, 0.140, 0.127, 0.000)
		colorBeach     (0.191, 0.164, 0.151, 0.000)
		colorDesert    (0.207, 0.176, 0.147, 0.000)
		colorLowland   (0.227, 0.188, 0.167, 0.000)
		colorUpland    (0.252, 0.228, 0.203, 0.000)
		colorRock      (0.272, 0.248, 0.219, 0.000)
		colorSnow      (0.296, 0.264, 0.231, 1.000)
		BumpHeight      0.89988
		BumpOffset      0.179976
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.328402
		GasToDust   0.25
		Particles   1643
		GasBright   0.0548026
		DustBright  0.325908
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   33.6026
		Period          198.409
		Eccentricity    0.980196
		Inclination     147.444
		AscendingNode   -3.12617
		ArgOfPericenter -71.3851
		MeanAnomaly     124.679
	}
}

Comet	"C134"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            2.89314e-009
	Radius          21.9613
	InertiaMoment   0.395991

	Oblateness      0.0490031

	RotationPeriod  26.514
	Obliquity       74.4987
	EqAscendNode    241.18

	AbsMagn         9.82419
	SlopeParam      2.75694
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.747 0.681 0.637)

	Surface
	{
		SurfStyle       0.0808868
		OceanStyle      0.331149
		Randomize      (0.793, -0.159, -0.730)
		colorDistMagn   0.420388
		colorDistFreq   0.276445
		detailScale     599.691
		colorConversion true
		snowLevel       2
		tropicLatitude  0.795712
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.532196
		terraceProb     0.10118
		erosion         0
		montesMagn      0.378466
		montesFreq      3.53483
		montesSpiky     0.736627
		montesFraction  0.247414
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.25175
		hillsFraction   0.583102
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259453
		craterFreq      0.243872
		craterDensity   0.962222
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.470852
		volcanoTemp     1258.53
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.299, 0.272, 0.255, 0.000)
		colorShelf     (0.317, 0.289, 0.271, 0.000)
		colorBeach     (0.336, 0.306, 0.287, 0.000)
		colorDesert    (0.355, 0.323, 0.303, 0.000)
		colorLowland   (0.373, 0.340, 0.319, 0.000)
		colorUpland    (0.392, 0.357, 0.335, 0.000)
		colorRock      (0.411, 0.374, 0.350, 0.000)
		colorSnow      (0.429, 0.391, 0.366, 1.000)
		BumpHeight      19.7652
		BumpOffset      3.95304
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.809594
		GasToDust   0.25
		Particles   2615
		GasBright   0.175629
		DustBright  0.689568
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   30.3322
		Period          170.16
		Eccentricity    0.984626
		Inclination     37.5816
		AscendingNode   -132.082
		ArgOfPericenter -7.68035
		MeanAnomaly     -82.394
	}
}

Comet	"C135"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            8.90819e-017
	Radius          0.061934
	InertiaMoment   0.399032

	Oblateness      0.0429449

	RotationPeriod  24.311
	Obliquity       27.7044
	EqAscendNode    225.758

	AbsMagn         6.32908
	SlopeParam      3.38484
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.679 0.676 0.671)

	Surface
	{
		SurfStyle       0.419545
		OceanStyle      0.31937
		Randomize      (-0.443, 0.022, -0.520)
		colorDistMagn   0.560552
		colorDistFreq   2.24304e-006
		detailScale     1.69121
		colorConversion true
		snowLevel       2
		tropicLatitude  0.698851
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.517643
		terraceProb     0.199598
		erosion         0
		montesMagn      0.380981
		montesFreq      3.55517
		montesSpiky     0.97573
		montesFraction  0.572859
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.64517e-006
		hillsFraction   0.550388
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245143
		craterFreq      0.201357
		craterDensity   1.0181
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.471564
		volcanoTemp     1506.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.272, 0.270, 0.268, 0.000)
		colorShelf     (0.289, 0.287, 0.285, 0.000)
		colorBeach     (0.306, 0.304, 0.302, 0.000)
		colorDesert    (0.323, 0.321, 0.319, 0.000)
		colorLowland   (0.340, 0.338, 0.335, 0.000)
		colorUpland    (0.357, 0.355, 0.352, 0.000)
		colorRock      (0.374, 0.372, 0.369, 0.000)
		colorSnow      (0.391, 0.388, 0.386, 1.000)
		BumpHeight      0.0557406
		BumpOffset      0.0111481
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.144038
		DustBright  0.405645
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   22.9115
		Period          111.707
		Eccentricity    0.978256
		Inclination     -57.1634
		AscendingNode   52.9815
		ArgOfPericenter -137.874
		MeanAnomaly     73.2443
	}
}

Comet	"C136"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            6.88985e-013
	Radius          1.35909
	InertiaMoment   0.397504

	Oblateness      0.0711395

	RotationPeriod  22.0156
	Obliquity       340.91
	EqAscendNode    210.335

	AbsMagn         17.7812
	SlopeParam      3.95627
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.567 0.563 0.559)

	Surface
	{
		SurfStyle       0.965562
		OceanStyle      0.00300893
		Randomize      (0.480, -0.915, -0.319)
		colorDistMagn   0.87991
		colorDistFreq   0.000909148
		detailScale     37.1123
		colorConversion true
		snowLevel       2
		tropicLatitude  0.981529
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.562124
		terraceProb     0.398478
		erosion         0
		montesMagn      0.598223
		montesFreq      3.77449
		montesSpiky     0.842179
		montesFraction  0.526145
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00537386
		hillsFraction   0.698342
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236986
		craterFreq      0.242895
		craterDensity   0.805486
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.54301
		volcanoTemp     1624.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.193, 0.197, 0.224, 0.050)
		colorShelf     (0.227, 0.231, 0.257, 0.040)
		colorBeach     (0.261, 0.265, 0.291, 0.030)
		colorDesert    (0.295, 0.299, 0.330, 0.020)
		colorLowland   (0.329, 0.332, 0.364, 0.030)
		colorUpland    (0.363, 0.366, 0.397, 0.050)
		colorRock      (0.397, 0.400, 0.442, 0.020)
		colorSnow      (0.397, 0.400, 0.442, 1.000)
		BumpHeight      1.22318
		BumpOffset      0.244637
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.361228
		GasToDust   0.25
		Particles   1709
		GasBright   0.0751883
		DustBright  0.158982
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   21.0482
		Period          98.3611
		Eccentricity    0.957638
		Inclination     120.084
		AscendingNode   -3.73484
		ArgOfPericenter -162.197
		MeanAnomaly     -171.934
	}
}

Comet	"C137"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            5.3288e-009
	Radius          24.2056
	InertiaMoment   0.399482

	Oblateness      0.0659856

	RotationPeriod  19.6092
	Obliquity       294.116
	EqAscendNode    194.912

	AbsMagn         9.59557
	SlopeParam      4.52408
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.694 0.692 0.689)

	Surface
	{
		SurfStyle       0.661129
		OceanStyle      0.724963
		Randomize      (-0.094, 0.738, -0.589)
		colorDistMagn   0.255798
		colorDistFreq   0.349128
		detailScale     660.973
		colorConversion true
		snowLevel       2
		tropicLatitude  0.42084
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.284552
		terraceProb     0.201199
		erosion         0
		montesMagn      0.336612
		montesFreq      2.78839
		montesSpiky     0.963501
		montesFraction  0.695084
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.60363
		hillsFraction   0.789924
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235874
		craterFreq      0.23977
		craterDensity   0.91252
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.487338
		volcanoTemp     1533.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.271, 0.235, 0.193, 0.000)
		colorShelf     (0.278, 0.242, 0.221, 0.000)
		colorBeach     (0.326, 0.284, 0.262, 0.000)
		colorDesert    (0.354, 0.304, 0.255, 0.000)
		colorLowland   (0.389, 0.325, 0.289, 0.000)
		colorUpland    (0.431, 0.394, 0.351, 0.000)
		colorRock      (0.465, 0.429, 0.379, 0.000)
		colorSnow      (0.507, 0.457, 0.400, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.84242
		GasToDust   0.25
		Particles   2681
		GasBright   0.273183
		DustBright  0.445474
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   33.8866
		Period          200.929
		Eccentricity    0.985799
		Inclination     -80.9504
		AscendingNode   159.246
		ArgOfPericenter -23.258
		MeanAnomaly     -162.774
	}
}

Comet	"C138"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            1.64078e-016
	Radius          0.0841119
	InertiaMoment   0.398241

	Oblateness      0.118127

	RotationPeriod  17.0687
	Obliquity       247.322
	EqAscendNode    179.49

	AbsMagn         6.09855
	SlopeParam      5.13865
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.542 0.537 0.528)

	Surface
	{
		SurfStyle       0.584306
		OceanStyle      0.50992
		Randomize      (0.399, -0.316, 0.260)
		colorDistMagn   0.21596
		colorDistFreq   4.56774e-006
		detailScale     2.29682
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998092
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.519084
		terraceProb     0.272206
		erosion         0
		montesMagn      0.357319
		montesFreq      3.03131
		montesSpiky     0.919173
		montesFraction  0.384949
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.35714e-005
		hillsFraction   0.843566
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246759
		craterFreq      0.248521
		craterDensity   0.848721
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.502134
		volcanoTemp     1674.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.211, 0.183, 0.148, 0.000)
		colorShelf     (0.217, 0.188, 0.169, 0.000)
		colorBeach     (0.255, 0.220, 0.201, 0.000)
		colorDesert    (0.276, 0.236, 0.196, 0.000)
		colorLowland   (0.304, 0.253, 0.222, 0.000)
		colorUpland    (0.336, 0.306, 0.269, 0.000)
		colorRock      (0.363, 0.333, 0.291, 0.000)
		colorSnow      (0.396, 0.355, 0.306, 1.000)
		BumpHeight      0.0757007
		BumpOffset      0.0151401
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.17705
		DustBright  0.226093
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   13.5839
		Period          50.996
		Eccentricity    0.953672
		Inclination     -142.75
		AscendingNode   48.694
		ArgOfPericenter -83.0356
		MeanAnomaly     -2.55508
	}
}

Comet	"C139"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            1.26903e-012
	Radius          1.49934
	InertiaMoment   0.399906

	Oblateness      0.122921

	RotationPeriod  14.364
	Obliquity       200.527
	EqAscendNode    164.067

	AbsMagn         15.6413
	SlopeParam      5.88873
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.416 0.411 0.409)

	Surface
	{
		SurfStyle       0.76631
		OceanStyle      0.587401
		Randomize      (0.968, 0.791, -0.297)
		colorDistMagn   0.773901
		colorDistFreq   0.00162366
		detailScale     40.9421
		colorConversion true
		snowLevel       2
		tropicLatitude  0.765472
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.326887
		terraceProb     0.674595
		erosion         0
		montesMagn      0.317636
		montesFreq      2.00681
		montesSpiky     0.978947
		montesFraction  0.598693
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00633549
		hillsFraction   0.440123
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252926
		craterFreq      0.206638
		craterDensity   0.932294
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49944
		volcanoTemp     1874.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.162, 0.140, 0.114, 0.000)
		colorShelf     (0.166, 0.144, 0.131, 0.000)
		colorBeach     (0.195, 0.169, 0.155, 0.000)
		colorDesert    (0.212, 0.181, 0.151, 0.000)
		colorLowland   (0.233, 0.193, 0.172, 0.000)
		colorUpland    (0.258, 0.235, 0.208, 0.000)
		colorRock      (0.279, 0.255, 0.225, 0.000)
		colorSnow      (0.304, 0.272, 0.237, 1.000)
		BumpHeight      1.34941
		BumpOffset      0.269882
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.394054
		GasToDust   0.25
		Particles   1775
		GasBright   0.442235
		DustBright  0.445395
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   21.2469
		Period          99.7569
		Eccentricity    0.978968
		Inclination     126.23
		AscendingNode   71.4545
		ArgOfPericenter 27.9852
		MeanAnomaly     -48.0369
	}
}

Comet	"C140"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            9.815e-009
	Radius          32.8459
	InertiaMoment   0.398793

	Oblateness      0.249

	RotationPeriod  11.4546
	Obliquity       153.733
	EqAscendNode    148.645

	AbsMagn         9.37205
	SlopeParam      7.1026
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.701 0.698 0.695)

	Surface
	{
		SurfStyle       0.307462
		OceanStyle      0.398844
		Randomize      (-0.820, -0.687, 0.091)
		colorDistMagn   0.2334
		colorDistFreq   0.459657
		detailScale     896.912
		colorConversion true
		snowLevel       2
		tropicLatitude  0.485287
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.546527
		terraceProb     0.160831
		erosion         0
		montesMagn      0.575628
		montesFreq      2.77784
		montesSpiky     0.984044
		montesFraction  0.505935
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.00936
		hillsFraction   0.455409
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257781
		craterFreq      0.246596
		craterDensity   0.820056
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.501493
		volcanoTemp     1327.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.281, 0.279, 0.278, 0.000)
		colorShelf     (0.298, 0.297, 0.296, 0.000)
		colorBeach     (0.316, 0.314, 0.313, 0.000)
		colorDesert    (0.333, 0.332, 0.330, 0.000)
		colorLowland   (0.351, 0.349, 0.348, 0.000)
		colorUpland    (0.368, 0.366, 0.365, 0.000)
		colorRock      (0.386, 0.384, 0.383, 0.000)
		colorSnow      (0.403, 0.401, 0.400, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.875246
		GasToDust   0.25
		Particles   2747
		GasBright   0.0327623
		DustBright  0.539354
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   28.9331
		Period          158.523
		Eccentricity    0.988539
		Inclination     -55.2931
		AscendingNode   179.105
		ArgOfPericenter -109.849
		MeanAnomaly     -34.3114
	}
}

Comet	"C141"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            3.02211e-016
	Radius          0.0928723
	InertiaMoment   0.396968

	Oblateness      0.249

	RotationPeriod  8.28456
	Obliquity       106.939
	EqAscendNode    133.222

	AbsMagn         5.86151
	SlopeParam      2.38936
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.489 0.401 0.316)

	Surface
	{
		SurfStyle       0.607059
		OceanStyle      0.916228
		Randomize      (0.861, 0.548, 0.771)
		colorDistMagn   0.927287
		colorDistFreq   4.37838e-006
		detailScale     2.53603
		colorConversion true
		snowLevel       2
		tropicLatitude  0.803546
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.436299
		terraceProb     0.154872
		erosion         0
		montesMagn      0.38172
		montesFreq      2.84993
		montesSpiky     0.839876
		montesFraction  0.141053
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.11677e-005
		hillsFraction   0.72882
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219179
		craterFreq      0.232606
		craterDensity   1.06359
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.528721
		volcanoTemp     1746.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.191, 0.136, 0.088, 0.000)
		colorShelf     (0.195, 0.140, 0.101, 0.000)
		colorBeach     (0.230, 0.164, 0.120, 0.000)
		colorDesert    (0.249, 0.176, 0.117, 0.000)
		colorLowland   (0.274, 0.189, 0.133, 0.000)
		colorUpland    (0.303, 0.229, 0.161, 0.000)
		colorRock      (0.327, 0.249, 0.174, 0.000)
		colorSnow      (0.357, 0.265, 0.183, 1.000)
		BumpHeight      0.0835851
		BumpOffset      0.016717
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0298456
		DustBright  0.226758
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   39.9988
		Period          257.674
		Eccentricity    0.977407
		Inclination     104.256
		AscendingNode   -124.376
		ArgOfPericenter -86.9209
		MeanAnomaly     -51.3328
	}
}

Comet	"C142"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            2.33739e-012
	Radius          2.03292
	InertiaMoment   0.399264

	Oblateness      0.249

	RotationPeriod  4.77227
	Obliquity       60.1443
	EqAscendNode    117.799

	AbsMagn         14.6243
	SlopeParam      3.07797
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.650 0.648 0.646)

	Surface
	{
		SurfStyle       0.202005
		OceanStyle      0.697586
		Randomize      (-0.733, 0.782, 0.994)
		colorDistMagn   0.671906
		colorDistFreq   0.00316301
		detailScale     55.5122
		colorConversion true
		snowLevel       2
		tropicLatitude  0.823512
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.46961
		terraceProb     0.447038
		erosion         0
		montesMagn      0.496177
		montesFreq      3.53167
		montesSpiky     0.980674
		montesFraction  0.692268
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0122225
		hillsFraction   0.42817
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.266719
		craterFreq      0.273081
		craterDensity   0.808344
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.470115
		volcanoTemp     1632.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.260, 0.259, 0.258, 0.000)
		colorShelf     (0.276, 0.275, 0.274, 0.000)
		colorBeach     (0.292, 0.292, 0.291, 0.000)
		colorDesert    (0.309, 0.308, 0.307, 0.000)
		colorLowland   (0.325, 0.324, 0.323, 0.000)
		colorUpland    (0.341, 0.340, 0.339, 0.000)
		colorRock      (0.357, 0.356, 0.355, 0.000)
		colorSnow      (0.374, 0.373, 0.371, 1.000)
		BumpHeight      1.82963
		BumpOffset      0.365925
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.42688
		GasToDust   0.25
		Particles   1842
		GasBright   0.129954
		DustBright  0.611135
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   32.3915
		Period          187.779
		Eccentricity    0.992659
		Inclination     -16.8378
		AscendingNode   -68.8058
		ArgOfPericenter 113.826
		MeanAnomaly     -104.003
	}
}

Comet	"C143"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            1.8078e-008
	Radius          36.297
	InertiaMoment   0.397912

	Oblateness      0.00137334

	RotationPeriod  135.111
	Obliquity       13.35
	EqAscendNode    102.377

	AbsMagn         9.15274
	SlopeParam      3.66999
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.665 0.557 0.488)

	Surface
	{
		SurfStyle       0.688847
		OceanStyle      0.457851
		Randomize      (0.472, 0.950, 0.665)
		colorDistMagn   0.566742
		colorDistFreq   0.688512
		detailScale     991.15
		colorConversion true
		snowLevel       2
		tropicLatitude  0.251845
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.357609
		terraceProb     0.202519
		erosion         0
		montesMagn      0.529083
		montesFreq      2.67331
		montesSpiky     0.988752
		montesFraction  0.313231
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.10958
		hillsFraction   0.737291
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219956
		craterFreq      0.153347
		craterDensity   0.905043
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.458545
		volcanoTemp     1124.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.259, 0.189, 0.137, 0.000)
		colorShelf     (0.266, 0.195, 0.156, 0.000)
		colorBeach     (0.312, 0.228, 0.185, 0.000)
		colorDesert    (0.339, 0.245, 0.180, 0.000)
		colorLowland   (0.372, 0.262, 0.205, 0.000)
		colorUpland    (0.412, 0.318, 0.249, 0.000)
		colorRock      (0.445, 0.346, 0.268, 0.000)
		colorSnow      (0.485, 0.368, 0.283, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.908072
		GasToDust   0.25
		Particles   2814
		GasBright   0.0997554
		DustBright  0.325821
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   38.2682
		Period          241.134
		Eccentricity    0.981699
		Inclination     -165.94
		AscendingNode   115.261
		ArgOfPericenter -114.598
		MeanAnomaly     62.3119
	}
}

Comet	"C144"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            5.56634e-016
	Radius          0.125826
	InertiaMoment   0.399698

	Oblateness      0.00249868

	RotationPeriod  116.902
	Obliquity       326.556
	EqAscendNode    86.9542

	AbsMagn         5.61672
	SlopeParam      4.23388
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.624 0.620 0.617)

	Surface
	{
		SurfStyle       0.104399
		OceanStyle      0.575878
		Randomize      (-0.803, -0.535, -0.871)
		colorDistMagn   0.502667
		colorDistFreq   6.22712e-006
		detailScale     3.4359
		colorConversion true
		snowLevel       2
		tropicLatitude  0.74346
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.368043
		terraceProb     0.13092
		erosion         0
		montesMagn      0.366659
		montesFreq      2.28672
		montesSpiky     0.94209
		montesFraction  0.550186
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.23078e-005
		hillsFraction   0.416371
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263921
		craterFreq      0.247285
		craterDensity   0.853236
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.432405
		volcanoTemp     1635.14
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.250, 0.248, 0.247, 0.000)
		colorShelf     (0.265, 0.263, 0.262, 0.000)
		colorBeach     (0.281, 0.279, 0.278, 0.000)
		colorDesert    (0.296, 0.294, 0.293, 0.000)
		colorLowland   (0.312, 0.310, 0.309, 0.000)
		colorUpland    (0.328, 0.325, 0.324, 0.000)
		colorRock      (0.343, 0.341, 0.339, 0.000)
		colorSnow      (0.359, 0.356, 0.355, 1.000)
		BumpHeight      0.113244
		BumpOffset      0.0226488
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.267054
		DustBright  0.643009
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   27.7024
		Period          148.517
		Eccentricity    0.985144
		Inclination     160.983
		AscendingNode   -48.0268
		ArgOfPericenter 156.271
		MeanAnomaly     -1.0357
	}
}

Comet	"C145"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            4.30516e-012
	Radius          2.2483
	InertiaMoment   0.398534

	Oblateness      0.00215103

	RotationPeriod  107.974
	Obliquity       279.761
	EqAscendNode    71.5317

	AbsMagn         13.9133
	SlopeParam      4.81742
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.799 0.798 0.796)

	Surface
	{
		SurfStyle       0.591329
		OceanStyle      0.173442
		Randomize      (-0.909, -0.234, 0.126)
		colorDistMagn   0.248267
		colorDistFreq   0.00165612
		detailScale     61.3936
		colorConversion true
		snowLevel       2
		tropicLatitude  0.965746
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.258478
		terraceProb     0.345879
		erosion         0
		montesMagn      0.583007
		montesFreq      2.83933
		montesSpiky     0.868327
		montesFraction  0.453657
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00987577
		hillsFraction   0.817305
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222847
		craterFreq      0.239655
		craterDensity   0.846631
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.502551
		volcanoTemp     1311.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.312, 0.271, 0.223, 0.000)
		colorShelf     (0.320, 0.279, 0.255, 0.000)
		colorBeach     (0.376, 0.327, 0.302, 0.000)
		colorDesert    (0.408, 0.351, 0.294, 0.000)
		colorLowland   (0.448, 0.375, 0.334, 0.000)
		colorUpland    (0.496, 0.455, 0.406, 0.000)
		colorRock      (0.536, 0.495, 0.438, 0.000)
		colorSnow      (0.584, 0.527, 0.462, 1.000)
		BumpHeight      2.02347
		BumpOffset      0.404694
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.459706
		GasToDust   0.25
		Particles   1908
		GasBright   0.209574
		DustBright  0.384976
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   19.027
		Period          84.5389
		Eccentricity    0.967717
		Inclination     171.461
		AscendingNode   -128.867
		ArgOfPericenter 71.4404
		MeanAnomaly     -7.97666
	}
}

Comet	"C146"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            3.32974e-008
	Radius          49.1404
	InertiaMoment   0.396029

	Oblateness      0.00324291

	RotationPeriod  101.695
	Obliquity       232.967
	EqAscendNode    56.1091

	AbsMagn         8.93684
	SlopeParam      5.48231
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.710 0.575 0.503)

	Surface
	{
		SurfStyle       0.516535
		OceanStyle      0.823613
		Randomize      (-0.628, 0.502, -0.663)
		colorDistMagn   0.890662
		colorDistFreq   0.767582
		detailScale     1341.86
		colorConversion true
		snowLevel       2
		tropicLatitude  0.681288
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.454318
		terraceProb     0.532092
		erosion         0
		montesMagn      0.531084
		montesFreq      2.48566
		montesSpiky     0.997403
		montesFraction  0.624283
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.92856
		hillsFraction   0.54437
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228739
		craterFreq      0.247616
		craterDensity   0.794453
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.458991
		volcanoTemp     1526.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.277, 0.196, 0.141, 0.000)
		colorShelf     (0.284, 0.201, 0.161, 0.000)
		colorBeach     (0.334, 0.236, 0.191, 0.000)
		colorDesert    (0.362, 0.253, 0.186, 0.000)
		colorLowland   (0.397, 0.270, 0.211, 0.000)
		colorUpland    (0.440, 0.328, 0.256, 0.000)
		colorRock      (0.476, 0.357, 0.276, 0.000)
		colorSnow      (0.518, 0.380, 0.291, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.940898
		GasToDust   0.25
		Particles   2880
		GasBright   0.114834
		DustBright  0.164202
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   26.7734
		Period          141.109
		Eccentricity    0.972024
		Inclination     -100.727
		AscendingNode   -142.22
		ArgOfPericenter -144.21
		MeanAnomaly     -110.778
	}
}

Comet	"C147"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            1.02525e-015
	Radius          0.139264
	InertiaMoment   0.399038

	Oblateness      0.0026801

	RotationPeriod  96.7233
	Obliquity       186.173
	EqAscendNode    40.6865

	AbsMagn         5.36265
	SlopeParam      6.37797
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.544 0.542 0.539)

	Surface
	{
		SurfStyle       0.37511
		OceanStyle      0.549321
		Randomize      (0.082, -0.100, -0.029)
		colorDistMagn   0.464828
		colorDistFreq   1.07335e-005
		detailScale     3.80282
		colorConversion true
		snowLevel       2
		tropicLatitude  0.937456
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.511649
		terraceProb     0.404056
		erosion         0
		montesMagn      0.469856
		montesFreq      3.58333
		montesSpiky     0.981193
		montesFraction  0.218729
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.9845e-005
		hillsFraction   0.73944
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264747
		craterFreq      0.24116
		craterDensity   0.885085
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.453998
		volcanoTemp     1269.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.217, 0.217, 0.216, 0.000)
		colorShelf     (0.231, 0.230, 0.229, 0.000)
		colorBeach     (0.245, 0.244, 0.242, 0.000)
		colorDesert    (0.258, 0.257, 0.256, 0.000)
		colorLowland   (0.272, 0.271, 0.269, 0.000)
		colorUpland    (0.285, 0.284, 0.283, 0.000)
		colorRock      (0.299, 0.298, 0.296, 0.000)
		colorSnow      (0.313, 0.311, 0.310, 1.000)
		BumpHeight      0.125337
		BumpOffset      0.0250674
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0113402
		GasToDust   0.25
		Particles   1002
		GasBright   0.3593
		DustBright  0.404223
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   26.5994
		Period          139.736
		Eccentricity    0.967831
		Inclination     -116.507
		AscendingNode   -6.46978
		ArgOfPericenter 10.2414
		MeanAnomaly     113.971
	}
}

Comet	"C148"
{
	ParentBody     "Eshan System"
	Class	       "Asteroid"

	Mass            7.92958e-012
	Radius          3.04171
	InertiaMoment   0.397515

	Oblateness      0.00392197

	RotationPeriod  92.5388
	Obliquity       139.379
	EqAscendNode    25.2639

	AbsMagn         13.3515
	SlopeParam      9.13169
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.728 0.725 0.724)

	Surface
	{
		SurfStyle       0.973302
		OceanStyle      0.765007
		Randomize      (-0.514, 0.644, -0.769)
		colorDistMagn   0.582926
		colorDistFreq   0.00510256
		detailScale     83.0589
		colorConversion true
		snowLevel       2
		tropicLatitude  0.352925
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.54999
		terraceProb     0.559154
		erosion         0
		montesMagn      0.469603
		montesFreq      3.58691
		montesSpiky     0.897515
		montesFraction  0.49652
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0172191
		hillsFraction   0.815523
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219417
		craterFreq      0.204157
		craterDensity   0.746099
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.499597
		volcanoTemp     1697.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.247, 0.254, 0.289, 0.050)
		colorShelf     (0.291, 0.297, 0.333, 0.040)
		colorBeach     (0.335, 0.341, 0.376, 0.030)
		colorDesert    (0.378, 0.384, 0.427, 0.020)
		colorLowland   (0.422, 0.428, 0.470, 0.030)
		colorUpland    (0.466, 0.471, 0.514, 0.050)
		colorRock      (0.509, 0.515, 0.572, 0.020)
		colorSnow      (0.509, 0.515, 0.572, 1.000)
		BumpHeight      2.73754
		BumpOffset      0.547507
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.492532
		GasToDust   0.25
		Particles   1974
		GasBright   0.0132732
		DustBright  0.434736
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   16.687
		Period          69.4334
		Eccentricity    0.965222
		Inclination     -60.5491
		AscendingNode   172.799
		ArgOfPericenter 41.4122
		MeanAnomaly     34.5757
	}
}

